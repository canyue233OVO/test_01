package com.hfr.clowder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.hfr.config.SimpleConfigHandler;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;

/**
 * 生产系统
 * 管理派系的工厂和生产队列
 */
public class ProductionSystem {
	
	/**
	 * 生产任务类
	 */
	public static class ProductionTask {
		public String productionId;
		public long startTime;
		public int productionTime; // 秒
		public int quantity; // 批量生产数量
		public String factoryType; // military 或 civilian
		
		public ProductionTask(String id, int time, int quantity, String factoryType) {
			this.productionId = id;
			this.startTime = System.currentTimeMillis();
			this.productionTime = time;
			this.quantity = quantity;
			this.factoryType = factoryType;
		}
		
		/**
		 * 检查是否完成
		 */
		public boolean isCompleted() {
			long elapsed = System.currentTimeMillis() - startTime;
			return elapsed >= productionTime * 1000L;
		}
		
		/**
		 * 获取进度百分比
		 */
		public float getProgress() {
			long elapsed = System.currentTimeMillis() - startTime;
			return Math.min(100.0f, (float) elapsed / (productionTime * 1000L) * 100.0f);
		}
		
		/**
		 * 获取剩余时间（秒）
		 */
		public int getRemainingTime() {
			long elapsed = System.currentTimeMillis() - startTime;
			long remaining = (productionTime * 1000L) - elapsed;
			return Math.max(0, (int) (remaining / 1000));
		}
	}
	
	/** 生产队列 */
	private List<ProductionTask> productionQueue;
	
	/** 总工厂槽位数 */
	private int totalProductionSlots;
	
	public ProductionSystem() {
		this.productionQueue = new ArrayList<>();
		this.totalProductionSlots = 0;
	}
	
	/**
	 * 计算总生产槽位数
	 * 基于工厂数量、国策和科技
	 */
	public void calculateProductionSlots(Clowder clowder) {
		// 基础槽位（基于工厂数量）
		int totalFactories = 0;
		if (clowder.chunkManager != null) {
			totalFactories = clowder.chunkManager.getTotalMilitaryFactories() + 
			                clowder.chunkManager.getTotalCivilianFactories();
		}
		
		int baseSlots = totalFactories / SimpleConfigHandler.factoriesPerProductionSlot;
		
		// 国策加成
		int policySlots = 0;
		if (clowder.policySystem != null) {
			policySlots = clowder.policySystem.getExtraFactorySlots();
		}
		
		// 科技加成
		int techSlots = 0;
		if (clowder.techTreeSystem != null) {
			techSlots = clowder.techTreeSystem.getExtraFactorySlots();
		}
		
		totalProductionSlots = baseSlots + policySlots + techSlots;
	}
	
	/**
	 * 添加生产任务
	 * @return 是否成功添加
	 */
	public boolean addProduction(String productionId, int quantity, Clowder clowder) {
		// 检查是否有空闲槽位
		if (productionQueue.size() >= totalProductionSlots) {
			return false;
		}
		
		Map<String, Map<String, Object>> productions = SimpleConfigHandler.getProductions();
		if (!productions.containsKey(productionId)) {
			return false;
		}
		
		Map<String, Object> production = productions.get(productionId);
		
		// 检查科技要求
		if (production.containsKey("tech_required")) {
			String techRequired = (String) production.get("tech_required");
			if (clowder.techTreeSystem != null && !clowder.techTreeSystem.isTechUnlocked(techRequired)) {
				return false;
			}
		}
		
		// 检查并消耗输入材料
		if (production.containsKey("input_items")) {
			@SuppressWarnings("unchecked")
			Map<String, Integer> inputs = (Map<String, Integer>) production.get("input_items");
			
			// 先检查是否有足够材料
			for (Map.Entry<String, Integer> entry : inputs.entrySet()) {
				int required = entry.getValue() * quantity;
				if (!clowder.storehouse.hasItem(entry.getKey(), required)) {
					return false;
				}
			}
			
			// 消耗材料
			for (Map.Entry<String, Integer> entry : inputs.entrySet()) {
				int required = entry.getValue() * quantity;
				clowder.storehouse.removeItem(entry.getKey(), required);
			}
		}
		
		// 创建生产任务
		int productionTime = ((Number) production.getOrDefault("production_time", 3600)).intValue();
		String factoryType = (String) production.getOrDefault("factory_type", "civilian");
		
		ProductionTask task = new ProductionTask(productionId, productionTime, quantity, factoryType);
		productionQueue.add(task);
		
		return true;
	}
	
	/**
	 * 更新生产系统
	 * 检查完成的任务并产出物品
	 */
	public void update(Clowder clowder) {
		List<ProductionTask> completedTasks = new ArrayList<>();
		
		for (ProductionTask task : productionQueue) {
			if (task.isCompleted()) {
				completedTasks.add(task);
			}
		}
		
		// 处理完成的任务
		for (ProductionTask task : completedTasks) {
			completeProduction(task, clowder);
			productionQueue.remove(task);
		}
	}
	
	/**
	 * 完成生产任务，产出物品
	 */
	private void completeProduction(ProductionTask task, Clowder clowder) {
		Map<String, Map<String, Object>> productions = SimpleConfigHandler.getProductions();
		if (!productions.containsKey(task.productionId)) {
			return;
		}
		
		Map<String, Object> production = productions.get(task.productionId);
		
		// 获取产出物品
		String outputItem = (String) production.get("output_item");
		int outputAmount = ((Number) production.getOrDefault("output_amount", 1)).intValue();
		
		// 应用决议加成
		float decisionModifier = 1.0f;
		if (clowder.decisionSystem != null) {
			decisionModifier = clowder.decisionSystem.getFactoryOutputModifier();
		}
		
		// 应用国策加成
		float policyModifier = 1.0f;
		if (clowder.policySystem != null) {
			policyModifier = clowder.policySystem.getFactoryEfficiencyModifier();
		}
		
		// 计算最终产出数量
		int finalAmount = (int) (outputAmount * task.quantity * decisionModifier * policyModifier);
		
		// 添加到仓库
		Item item = (Item) Item.itemRegistry.getObject(outputItem);
		if (item != null && clowder.storehouse != null) {
			int meta = ((Number) production.getOrDefault("output_meta", 0)).intValue();
			ItemStack stack = new ItemStack(item, finalAmount, meta);
			clowder.storehouse.addItem(stack);
		}
	}
	
	/**
	 * 取消生产任务
	 */
	public boolean cancelProduction(int index) {
		if (index >= 0 && index < productionQueue.size()) {
			productionQueue.remove(index);
			return true;
		}
		return false;
	}
	
	/**
	 * 获取生产队列
	 */
	public List<ProductionTask> getProductionQueue() {
		return new ArrayList<>(productionQueue);
	}
	
	/**
	 * 获取总槽位数
	 */
	public int getTotalProductionSlots() {
		return totalProductionSlots;
	}
	
	/**
	 * 获取已使用的槽位数
	 */
	public int getUsedProductionSlots() {
		return productionQueue.size();
	}
	
	/**
	 * 保存到NBT
	 */
	public NBTTagCompound saveToNBT() {
		NBTTagCompound nbt = new NBTTagCompound();
		
		nbt.setInteger("totalSlots", totalProductionSlots);
		
		NBTTagList queueList = new NBTTagList();
		for (ProductionTask task : productionQueue) {
			NBTTagCompound taskTag = new NBTTagCompound();
			taskTag.setString("productionId", task.productionId);
			taskTag.setLong("startTime", task.startTime);
			taskTag.setInteger("productionTime", task.productionTime);
			taskTag.setInteger("quantity", task.quantity);
			taskTag.setString("factoryType", task.factoryType);
			queueList.appendTag(taskTag);
		}
		nbt.setTag("productionQueue", queueList);
		
		return nbt;
	}
	
	/**
	 * 从NBT加载
	 */
	public void loadFromNBT(NBTTagCompound nbt) {
		totalProductionSlots = nbt.getInteger("totalSlots");
		
		productionQueue.clear();
		NBTTagList queueList = nbt.getTagList("productionQueue", 10);
		for (int i = 0; i < queueList.tagCount(); i++) {
			NBTTagCompound taskTag = queueList.getCompoundTagAt(i);
			ProductionTask task = new ProductionTask(
				taskTag.getString("productionId"),
				taskTag.getInteger("productionTime"),
				taskTag.getInteger("quantity"),
				taskTag.getString("factoryType")
			);
			task.startTime = taskTag.getLong("startTime");
			productionQueue.add(task);
		}
	}
}
