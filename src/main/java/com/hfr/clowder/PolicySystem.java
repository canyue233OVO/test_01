package com.hfr.clowder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.hfr.config.SimpleConfigHandler;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;

/**
 * 国策系统
 * 管理派系的国策树和国策效果
 */
public class PolicySystem {
	
	/** 已解锁的国策列表 */
	private List<String> unlockedPolicies;
	
	/** 国策效果缓存 */
	private Map<String, Float> modifierCache;
	
	public PolicySystem() {
		this.unlockedPolicies = new ArrayList<>();
		this.modifierCache = new HashMap<>();
	}
	
	/**
	 * 解锁一个国策
	 * @param policyId 国策ID
	 * @param clowder 派系对象（用于扣除政治点数）
	 * @return 是否成功解锁
	 */
	public boolean unlockPolicy(String policyId, Clowder clowder) {
		if (unlockedPolicies.contains(policyId)) {
			return false; // 已经解锁
		}
		
		Map<String, Map<String, Object>> policies = SimpleConfigHandler.getPolicies();
		if (!policies.containsKey(policyId)) {
			return false; // 国策不存在
		}
		
		Map<String, Object> policy = policies.get(policyId);
		
		// 检查前置条件
		if (policy.containsKey("prerequisites")) {
			@SuppressWarnings("unchecked")
			List<String> prereqs = (List<String>) policy.get("prerequisites");
			for (String prereq : prereqs) {
				if (!unlockedPolicies.contains(prereq)) {
					return false; // 前置条件未满足
				}
			}
		}
		
		// 检查政治点数
		int cost = ((Number) policy.getOrDefault("cost", 0)).intValue();
		if (clowder.getPoliticalPoints() < cost) {
			return false; // 政治点数不足
		}
		
		// 扣除政治点数并解锁
		clowder.addPoliticalPoints(-cost);
		unlockedPolicies.add(policyId);
		
		// 重新计算所有加成
		recalculateModifiers();
		
		return true;
	}
	
	/**
	 * 重新计算所有国策加成
	 */
	private void recalculateModifiers() {
		modifierCache.clear();
		
		Map<String, Map<String, Object>> policies = SimpleConfigHandler.getPolicies();
		
		for (String policyId : unlockedPolicies) {
			if (!policies.containsKey(policyId)) {
				continue;
			}
			
			Map<String, Object> policy = policies.get(policyId);
			
			// 遍历所有加成
			for (Map.Entry<String, Object> entry : policy.entrySet()) {
				String key = entry.getKey();
				if (key.endsWith("_modifier") && entry.getValue() instanceof Number) {
					float value = ((Number) entry.getValue()).floatValue();
					modifierCache.put(key, modifierCache.getOrDefault(key, 1.0f) * value);
				}
			}
		}
	}
	
	/**
	 * 获取特定类型的加成
	 */
	private float getModifier(String modifierName) {
		return modifierCache.getOrDefault(modifierName, 1.0f);
	}
	
	// ===== 各种具体的加成获取方法 =====
	
	public float getPopulationConversionModifier() {
		return getModifier("population_conversion_modifier");
	}
	
	public float getManpowerModifier() {
		return getModifier("manpower_modifier");
	}
	
	public float getFactoryEfficiencyModifier() {
		return getModifier("factory_efficiency_modifier");
	}
	
	public float getResearchSpeedModifier() {
		return getModifier("research_speed_modifier");
	}
	
	public float getResourceProductionModifier() {
		return getModifier("resource_production_modifier");
	}
	
	public float getMilitaryPowerModifier() {
		return getModifier("military_power_modifier");
	}
	
	/**
	 * 获取额外的工厂槽位
	 */
	public int getExtraFactorySlots() {
		int slots = 0;
		Map<String, Map<String, Object>> policies = SimpleConfigHandler.getPolicies();
		
		for (String policyId : unlockedPolicies) {
			if (policies.containsKey(policyId)) {
				Map<String, Object> policy = policies.get(policyId);
				if (policy.containsKey("factory_slots")) {
					slots += ((Number) policy.get("factory_slots")).intValue();
				}
			}
		}
		
		return slots;
	}
	
	/**
	 * 检查国策是否已解锁
	 */
	public boolean isPolicyUnlocked(String policyId) {
		return unlockedPolicies.contains(policyId);
	}
	
	/**
	 * 获取所有已解锁的国策
	 */
	public List<String> getUnlockedPolicies() {
		return new ArrayList<>(unlockedPolicies);
	}
	
	/**
	 * 保存到NBT
	 */
	public NBTTagCompound saveToNBT() {
		NBTTagCompound nbt = new NBTTagCompound();
		
		NBTTagList list = new NBTTagList();
		for (String policy : unlockedPolicies) {
			NBTTagCompound policyTag = new NBTTagCompound();
			policyTag.setString("id", policy);
			list.appendTag(policyTag);
		}
		nbt.setTag("unlockedPolicies", list);
		
		return nbt;
	}
	
	/**
	 * 从NBT加载
	 */
	public void loadFromNBT(NBTTagCompound nbt) {
		unlockedPolicies.clear();
		
		NBTTagList list = nbt.getTagList("unlockedPolicies", 10);
		for (int i = 0; i < list.tagCount(); i++) {
			NBTTagCompound policyTag = list.getCompoundTagAt(i);
			unlockedPolicies.add(policyTag.getString("id"));
		}
		
		recalculateModifiers();
	}
}
