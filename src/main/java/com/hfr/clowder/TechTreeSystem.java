package com.hfr.clowder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.hfr.config.SimpleConfigHandler;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;

/**
 * 科技树系统
 * 管理派系的科技研发和解锁
 */
public class TechTreeSystem {
	
	/** 已解锁的科技列表 */
	private Set<String> unlockedTechs;
	
	/** 正在研发的科技 */
	private String researchingTech;
	
	/** 研发进度 */
	private int researchProgress;
	
	/** 加成缓存 */
	private Map<String, Float> modifierCache;
	
	/** 解锁的物品列表 */
	private Set<String> unlockedItems;
	
	public TechTreeSystem() {
		this.unlockedTechs = new HashSet<>();
		this.researchingTech = null;
		this.researchProgress = 0;
		this.modifierCache = new HashMap<>();
		this.unlockedItems = new HashSet<>();
	}
	
	/**
	 * 开始研发一个科技
	 * @param techId 科技ID
	 * @param clowder 派系对象
	 * @return 是否成功开始研发
	 */
	public boolean startResearch(String techId, Clowder clowder) {
		if (unlockedTechs.contains(techId)) {
			return false; // 已经解锁
		}
		
		if (researchingTech != null) {
			return false; // 已经在研发其他科技
		}
		
		Map<String, Map<String, Object>> techs = SimpleConfigHandler.getTechnologies();
		if (!techs.containsKey(techId)) {
			return false; // 科技不存在
		}
		
		Map<String, Object> tech = techs.get(techId);
		
		// 检查前置科技
		if (tech.containsKey("prerequisites")) {
			@SuppressWarnings("unchecked")
			List<String> prereqs = (List<String>) tech.get("prerequisites");
			for (String prereq : prereqs) {
				if (!unlockedTechs.contains(prereq)) {
					return false; // 前置科技未解锁
				}
			}
		}
		
		// 开始研发
		researchingTech = techId;
		researchProgress = 0;
		
		return true;
	}
	
	/**
	 * 更新研发进度
	 * @param researchPoints 本次增加的科研点数
	 * @return 是否完成研发
	 */
	public boolean updateResearch(int researchPoints) {
		if (researchingTech == null) {
			return false;
		}
		
		Map<String, Map<String, Object>> techs = SimpleConfigHandler.getTechnologies();
		if (!techs.containsKey(researchingTech)) {
			researchingTech = null;
			return false;
		}
		
		Map<String, Object> tech = techs.get(researchingTech);
		int cost = ((Number) tech.getOrDefault("cost", 100)).intValue();
		
		researchProgress += researchPoints;
		
		// 检查是否完成
		if (researchProgress >= cost) {
			unlockTech(researchingTech);
			researchingTech = null;
			researchProgress = 0;
			return true;
		}
		
		return false;
	}
	
	/**
	 * 解锁一个科技
	 */
	private void unlockTech(String techId) {
		unlockedTechs.add(techId);
		
		Map<String, Map<String, Object>> techs = SimpleConfigHandler.getTechnologies();
		if (techs.containsKey(techId)) {
			Map<String, Object> tech = techs.get(techId);
			
			// 解锁物品
			if (tech.containsKey("unlocks")) {
				@SuppressWarnings("unchecked")
				List<String> unlocks = (List<String>) tech.get("unlocks");
				unlockedItems.addAll(unlocks);
			}
		}
		
		// 重新计算加成
		recalculateModifiers();
	}
	
	/**
	 * 重新计算所有科技加成
	 */
	private void recalculateModifiers() {
		modifierCache.clear();
		
		Map<String, Map<String, Object>> techs = SimpleConfigHandler.getTechnologies();
		
		for (String techId : unlockedTechs) {
			if (!techs.containsKey(techId)) {
				continue;
			}
			
			Map<String, Object> tech = techs.get(techId);
			
			// 遍历所有加成
			for (Map.Entry<String, Object> entry : tech.entrySet()) {
				String key = entry.getKey();
				if (key.endsWith("_modifier") && entry.getValue() instanceof Number) {
					float value = ((Number) entry.getValue()).floatValue();
					modifierCache.put(key, modifierCache.getOrDefault(key, 1.0f) * value);
				}
			}
		}
	}
	
	/**
	 * 检查玩家是否可以使用某个物品
	 */
	public boolean canUseItem(ItemStack stack) {
		if (stack == null || stack.getItem() == null) {
			return true;
		}
		
		String itemName = Item.itemRegistry.getNameForObject(stack.getItem());
		
		// 如果物品在任何科技的解锁列表中，检查是否已解锁
		Map<String, Map<String, Object>> techs = SimpleConfigHandler.getTechnologies();
		for (Map<String, Object> tech : techs.values()) {
			if (tech.containsKey("unlocks")) {
				@SuppressWarnings("unchecked")
				List<String> unlocks = (List<String>) tech.get("unlocks");
				if (unlocks.contains(itemName)) {
					// 这个物品需要科技解锁
					return unlockedItems.contains(itemName);
				}
			}
		}
		
		// 物品不在科技树中，默认可用
		return true;
	}
	
	/**
	 * 取消当前研发
	 */
	public void cancelResearch() {
		researchingTech = null;
		researchProgress = 0;
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
	
	public float getResourceProductionModifier() {
		return getModifier("resource_production_modifier");
	}
	
	public float getFactoryEfficiencyModifier() {
		return getModifier("factory_efficiency_modifier");
	}
	
	public float getResearchSpeedModifier() {
		return getModifier("research_speed_modifier");
	}
	
	/**
	 * 获取额外的工厂槽位
	 */
	public int getExtraFactorySlots() {
		int slots = 0;
		Map<String, Map<String, Object>> techs = SimpleConfigHandler.getTechnologies();
		
		for (String techId : unlockedTechs) {
			if (techs.containsKey(techId)) {
				Map<String, Object> tech = techs.get(techId);
				if (tech.containsKey("factory_slots")) {
					slots += ((Number) tech.get("factory_slots")).intValue();
				}
			}
		}
		
		return slots;
	}
	
	/**
	 * 检查科技是否已解锁
	 */
	public boolean isTechUnlocked(String techId) {
		return unlockedTechs.contains(techId);
	}
	
	/**
	 * 获取当前研发的科技
	 */
	public String getResearchingTech() {
		return researchingTech;
	}
	
	/**
	 * 获取研发进度百分比
	 */
	public float getResearchProgress() {
		if (researchingTech == null) {
			return 0;
		}
		
		Map<String, Map<String, Object>> techs = SimpleConfigHandler.getTechnologies();
		if (!techs.containsKey(researchingTech)) {
			return 0;
		}
		
		Map<String, Object> tech = techs.get(researchingTech);
		int cost = ((Number) tech.getOrDefault("cost", 100)).intValue();
		
		return (float) researchProgress / cost * 100.0f;
	}
	
	/**
	 * 获取所有已解锁的科技
	 */
	public Set<String> getUnlockedTechs() {
		return new HashSet<>(unlockedTechs);
	}
	
	/**
	 * 保存到NBT
	 */
	public NBTTagCompound saveToNBT() {
		NBTTagCompound nbt = new NBTTagCompound();
		
		// 保存已解锁的科技
		NBTTagList techList = new NBTTagList();
		for (String tech : unlockedTechs) {
			NBTTagCompound techTag = new NBTTagCompound();
			techTag.setString("id", tech);
			techList.appendTag(techTag);
		}
		nbt.setTag("unlockedTechs", techList);
		
		// 保存解锁的物品
		NBTTagList itemList = new NBTTagList();
		for (String item : unlockedItems) {
			NBTTagCompound itemTag = new NBTTagCompound();
			itemTag.setString("id", item);
			itemList.appendTag(itemTag);
		}
		nbt.setTag("unlockedItems", itemList);
		
		// 保存当前研发
		if (researchingTech != null) {
			nbt.setString("researchingTech", researchingTech);
			nbt.setInteger("researchProgress", researchProgress);
		}
		
		return nbt;
	}
	
	/**
	 * 从NBT加载
	 */
	public void loadFromNBT(NBTTagCompound nbt) {
		unlockedTechs.clear();
		unlockedItems.clear();
		
		// 加载已解锁的科技
		NBTTagList techList = nbt.getTagList("unlockedTechs", 10);
		for (int i = 0; i < techList.tagCount(); i++) {
			NBTTagCompound techTag = techList.getCompoundTagAt(i);
			unlockedTechs.add(techTag.getString("id"));
		}
		
		// 加载解锁的物品
		NBTTagList itemList = nbt.getTagList("unlockedItems", 10);
		for (int i = 0; i < itemList.tagCount(); i++) {
			NBTTagCompound itemTag = itemList.getCompoundTagAt(i);
			unlockedItems.add(itemTag.getString("id"));
		}
		
		// 加载当前研发
		if (nbt.hasKey("researchingTech")) {
			researchingTech = nbt.getString("researchingTech");
			researchProgress = nbt.getInteger("researchProgress");
		}
		
		recalculateModifiers();
	}
}
