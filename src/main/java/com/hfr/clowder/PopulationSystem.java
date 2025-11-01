package com.hfr.clowder;

import java.util.HashMap;
import java.util.Random;

import com.hfr.config.SimpleConfigHandler;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;

/**
 * 人口系统管理类
 * 负责人口转换、物品产出等
 */
public class PopulationSystem {
	
	/** 总人口数 */
	private int totalPopulation;
	
	/** 人力资源 */
	private int manpower;
	
	/** 适役人口 */
	private int recruitablePopulation;
	
	/** 上次人口更新时间 */
	private long lastPopulationUpdate;
	
	/** 上次物品产出时间 */
	private long lastItemProduction;
	
	private static final Random random = new Random();
	
	public PopulationSystem() {
		this.totalPopulation = 0;
		this.manpower = 0;
		this.recruitablePopulation = 0;
		this.lastPopulationUpdate = System.currentTimeMillis();
		this.lastItemProduction = System.currentTimeMillis();
	}
	
	/**
	 * 更新人口系统
	 * 应该由服务器定时调用
	 */
	public void update(Clowder clowder) {
		long currentTime = System.currentTimeMillis();
		
		// 每天转换人口为适役人口
		if (currentTime - lastPopulationUpdate >= 24 * 60 * 60 * 1000) { // 24小时
			convertPopulation(clowder);
			lastPopulationUpdate = currentTime;
		}
		
		// 每小时检查物品产出
		if (currentTime - lastItemProduction >= 60 * 60 * 1000) { // 1小时
			produceItems(clowder);
			lastItemProduction = currentTime;
		}
	}
	
	/**
	 * 人口转换为适役人口
	 * 转换比例受国策和科技影响
	 */
	private void convertPopulation(Clowder clowder) {
		// 基础转换率
		float baseConversionRate = SimpleConfigHandler.basePopulationConversionRate;
		
		// 应用国策加成
		float policyModifier = clowder.policySystem != null ? clowder.policySystem.getPopulationConversionModifier() : 1.0f;
		
		// 应用科技加成
		float techModifier = clowder.techTreeSystem != null ? clowder.techTreeSystem.getPopulationConversionModifier() : 1.0f;
		
		// 计算转换数量
		float conversionRate = baseConversionRate * policyModifier * techModifier;
		int converted = (int) (totalPopulation * conversionRate);
		
		recruitablePopulation += converted;
	}
	
	/**
	 * 物品产出系统
	 * 每小时每1000人口有概率产出物品
	 */
	private void produceItems(Clowder clowder) {
		// 计算产出次数（每1000人口一次机会）
		int productionAttempts = totalPopulation / 1000;
		
		for (int i = 0; i < productionAttempts; i++) {
			// 根据配置的概率产出物品
			if (random.nextFloat() < SimpleConfigHandler.populationItemProductionChance) {
				ItemStack item = SimpleConfigHandler.getRandomPopulationItem();
				if (item != null && clowder.storehouse != null) {
					clowder.storehouse.addItem(item);
				}
			}
		}
	}
	
	/**
	 * 增加人口
	 */
	public void addPopulation(int amount) {
		totalPopulation += amount;
		if (totalPopulation < 0) totalPopulation = 0;
	}
	
	/**
	 * 增加人力
	 */
	public void addManpower(int amount) {
		manpower += amount;
		if (manpower < 0) manpower = 0;
	}
	
	/**
	 * 增加适役人口
	 */
	public void addRecruitablePopulation(int amount) {
		recruitablePopulation += amount;
		if (recruitablePopulation < 0) recruitablePopulation = 0;
	}
	
	/**
	 * 消耗人力（用于矿产区等）
	 * @return 是否成功消耗
	 */
	public boolean consumeManpower(int amount) {
		if (manpower >= amount) {
			manpower -= amount;
			return true;
		}
		return false;
	}
	
	/**
	 * 消耗适役人口（用于科研区等）
	 * @return 是否成功消耗
	 */
	public boolean consumeRecruitablePopulation(int amount) {
		if (recruitablePopulation >= amount) {
			recruitablePopulation -= amount;
			return true;
		}
		return false;
	}
	
	// Getters
	public int getTotalPopulation() {
		return totalPopulation;
	}
	
	public int getManpower() {
		return manpower;
	}
	
	public int getRecruitablePopulation() {
		return recruitablePopulation;
	}
	
	/**
	 * 保存到NBT
	 */
	public NBTTagCompound saveToNBT() {
		NBTTagCompound nbt = new NBTTagCompound();
		nbt.setInteger("totalPopulation", totalPopulation);
		nbt.setInteger("manpower", manpower);
		nbt.setInteger("recruitablePopulation", recruitablePopulation);
		nbt.setLong("lastPopulationUpdate", lastPopulationUpdate);
		nbt.setLong("lastItemProduction", lastItemProduction);
		return nbt;
	}
	
	/**
	 * 从NBT加载
	 */
	public void loadFromNBT(NBTTagCompound nbt) {
		totalPopulation = nbt.getInteger("totalPopulation");
		manpower = nbt.getInteger("manpower");
		recruitablePopulation = nbt.getInteger("recruitablePopulation");
		lastPopulationUpdate = nbt.getLong("lastPopulationUpdate");
		lastItemProduction = nbt.getLong("lastItemProduction");
	}
}
