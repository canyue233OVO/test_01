package com.hfr.clowder;

import java.util.HashMap;
import java.util.Map;

import com.hfr.config.SimpleConfigHandler;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;

/**
 * 决议系统
 * 管理派系的临时性决议效果
 */
public class DecisionSystem {
	
	/**
	 * 活跃决议的数据类
	 */
	public static class ActiveDecision {
		public String decisionId;
		public long activatedTime;
		public int durationHours;
		public Map<String, Float> modifiers;
		
		public ActiveDecision(String id, int duration) {
			this.decisionId = id;
			this.activatedTime = System.currentTimeMillis();
			this.durationHours = duration;
			this.modifiers = new HashMap<>();
		}
		
		/**
		 * 检查决议是否已过期
		 */
		public boolean isExpired() {
			long elapsed = System.currentTimeMillis() - activatedTime;
			long durationMillis = durationHours * 60 * 60 * 1000L;
			return elapsed >= durationMillis;
		}
		
		/**
		 * 获取剩余时间（小时）
		 */
		public int getRemainingHours() {
			long elapsed = System.currentTimeMillis() - activatedTime;
			long durationMillis = durationHours * 60 * 60 * 1000L;
			long remaining = durationMillis - elapsed;
			return Math.max(0, (int) (remaining / (60 * 60 * 1000)));
		}
	}
	
	/** 当前活跃的决议 */
	private Map<String, ActiveDecision> activeDecisions;
	
	public DecisionSystem() {
		this.activeDecisions = new HashMap<>();
	}
	
	/**
	 * 激活一个决议
	 * @param decisionId 决议ID
	 * @param clowder 派系对象（用于扣除政治点数）
	 * @return 是否成功激活
	 */
	public boolean activateDecision(String decisionId, Clowder clowder) {
		// 检查是否已经激活
		if (activeDecisions.containsKey(decisionId)) {
			ActiveDecision active = activeDecisions.get(decisionId);
			if (!active.isExpired()) {
				return false; // 决议还在生效中
			}
		}
		
		Map<String, Map<String, Object>> decisions = SimpleConfigHandler.getDecisions();
		if (!decisions.containsKey(decisionId)) {
			return false; // 决议不存在
		}
		
		Map<String, Object> decision = decisions.get(decisionId);
		
		// 检查政治点数
		int cost = ((Number) decision.getOrDefault("cost", 0)).intValue();
		if (clowder.getPoliticalPoints() < cost) {
			return false; // 政治点数不足
		}
		
		// 检查前置条件
		if (decision.containsKey("prerequisites")) {
			@SuppressWarnings("unchecked")
			java.util.List<String> prereqs = (java.util.List<String>) decision.get("prerequisites");
			for (String prereq : prereqs) {
				if (clowder.policySystem != null && !clowder.policySystem.isPolicyUnlocked(prereq)) {
					return false; // 前置条件未满足
				}
			}
		}
		
		// 扣除政治点数
		clowder.addPoliticalPoints(-cost);
		
		// 激活决议
		int duration = ((Number) decision.getOrDefault("duration", 24)).intValue();
		ActiveDecision active = new ActiveDecision(decisionId, duration);
		
		// 提取所有加成
		for (Map.Entry<String, Object> entry : decision.entrySet()) {
			String key = entry.getKey();
			if (key.endsWith("_modifier") && entry.getValue() instanceof Number) {
				float value = ((Number) entry.getValue()).floatValue();
				active.modifiers.put(key, value);
			}
		}
		
		activeDecisions.put(decisionId, active);
		return true;
	}
	
	/**
	 * 更新决议系统，移除过期的决议
	 */
	public void update() {
		activeDecisions.entrySet().removeIf(entry -> entry.getValue().isExpired());
	}
	
	/**
	 * 获取特定类型的总加成（累加所有活跃决议）
	 */
	private float getTotalModifier(String modifierName) {
		float total = 1.0f;
		for (ActiveDecision decision : activeDecisions.values()) {
			if (!decision.isExpired() && decision.modifiers.containsKey(modifierName)) {
				total *= decision.modifiers.get(modifierName);
			}
		}
		return total;
	}
	
	// ===== 各种具体的加成获取方法 =====
	
	public float getManpowerModifier() {
		return getTotalModifier("manpower_modifier");
	}
	
	public float getFactoryOutputModifier() {
		return getTotalModifier("factory_output_modifier");
	}
	
	public float getResearchSpeedModifier() {
		return getTotalModifier("research_speed_modifier");
	}
	
	public float getResourceProductionModifier() {
		return getTotalModifier("resource_production_modifier");
	}
	
	public float getRecruitmentCostModifier() {
		return getTotalModifier("recruitment_cost_modifier");
	}
	
	public float getWarCostModifier() {
		return getTotalModifier("war_cost_modifier");
	}
	
	/**
	 * 获取所有活跃的决议
	 */
	public Map<String, ActiveDecision> getActiveDecisions() {
		// 移除过期的决议
		update();
		return new HashMap<>(activeDecisions);
	}
	
	/**
	 * 检查决议是否活跃
	 */
	public boolean isDecisionActive(String decisionId) {
		ActiveDecision decision = activeDecisions.get(decisionId);
		return decision != null && !decision.isExpired();
	}
	
	/**
	 * 保存到NBT
	 */
	public NBTTagCompound saveToNBT() {
		NBTTagCompound nbt = new NBTTagCompound();
		
		NBTTagList list = new NBTTagList();
		for (Map.Entry<String, ActiveDecision> entry : activeDecisions.entrySet()) {
			ActiveDecision decision = entry.getValue();
			if (!decision.isExpired()) { // 只保存未过期的
				NBTTagCompound decisionTag = new NBTTagCompound();
				decisionTag.setString("id", decision.decisionId);
				decisionTag.setLong("activatedTime", decision.activatedTime);
				decisionTag.setInteger("duration", decision.durationHours);
				list.appendTag(decisionTag);
			}
		}
		nbt.setTag("activeDecisions", list);
		
		return nbt;
	}
	
	/**
	 * 从NBT加载
	 */
	public void loadFromNBT(NBTTagCompound nbt) {
		activeDecisions.clear();
		
		NBTTagList list = nbt.getTagList("activeDecisions", 10);
		Map<String, Map<String, Object>> decisions = SimpleConfigHandler.getDecisions();
		
		for (int i = 0; i < list.tagCount(); i++) {
			NBTTagCompound decisionTag = list.getCompoundTagAt(i);
			String id = decisionTag.getString("id");
			
			if (decisions.containsKey(id)) {
				ActiveDecision active = new ActiveDecision(id, decisionTag.getInteger("duration"));
				active.activatedTime = decisionTag.getLong("activatedTime");
				
				// 重新加载加成数据
				Map<String, Object> decisionConfig = decisions.get(id);
				for (Map.Entry<String, Object> entry : decisionConfig.entrySet()) {
					String key = entry.getKey();
					if (key.endsWith("_modifier") && entry.getValue() instanceof Number) {
						float value = ((Number) entry.getValue()).floatValue();
						active.modifiers.put(key, value);
					}
				}
				
				if (!active.isExpired()) {
					activeDecisions.put(id, active);
				}
			}
		}
	}
}
