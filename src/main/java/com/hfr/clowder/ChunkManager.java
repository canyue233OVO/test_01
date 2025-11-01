package com.hfr.clowder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import com.hfr.config.SimpleConfigHandler;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;

/**
 * 区块管理器
 * 管理派系的区块宣称和资源产出
 */
public class ChunkManager {
	
	/** 已宣称的区块 */
	private Map<String, ClaimedChunk> claimedChunks;
	
	/** 所属派系UUID */
	private String clowderUuid;
	
	private static final Random random = new Random();
	
	public ChunkManager(String clowderUuid) {
		this.clowderUuid = clowderUuid;
		this.claimedChunks = new HashMap<>();
	}
	
	/**
	 * 宣称一个区块
	 * @return 是否成功宣称
	 */
	public boolean claimChunk(int chunkX, int chunkZ, ZoneType zoneType, Clowder clowder) {
		String key = ClaimedChunk.getChunkKey(chunkX, chunkZ);
		
		// 检查是否已经被宣称
		if (claimedChunks.containsKey(key)) {
			return false;
		}
		
		// 检查费用
		int claimCost = SimpleConfigHandler.administrativeMaintenanceCost;
		if (clowder.getMoney() < claimCost) {
			return false;
		}
		
		// 扣除费用并宣称
		clowder.addMoney(-claimCost);
		ClaimedChunk chunk = new ClaimedChunk(chunkX, chunkZ, clowderUuid, zoneType);
		claimedChunks.put(key, chunk);
		
		return true;
	}
	
	/**
	 * 取消区块宣称
	 */
	public boolean unclaimChunk(int chunkX, int chunkZ) {
		String key = ClaimedChunk.getChunkKey(chunkX, chunkZ);
		return claimedChunks.remove(key) != null;
	}
	
	/**
	 * 改变区块类型
	 */
	public boolean changeChunkType(int chunkX, int chunkZ, ZoneType newType) {
		String key = ClaimedChunk.getChunkKey(chunkX, chunkZ);
		ClaimedChunk chunk = claimedChunks.get(key);
		
		if (chunk != null) {
			chunk.zoneType = newType;
			chunk.productionProgress = 0; // 重置生产进度
			return true;
		}
		
		return false;
	}
	
	/**
	 * 更新所有区块的产出
	 * 应该由服务器定时调用
	 */
	public void updateChunks(Clowder clowder) {
		long currentTime = System.currentTimeMillis();
		
		for (ClaimedChunk chunk : claimedChunks.values()) {
			updateChunkProduction(chunk, clowder, currentTime);
		}
	}
	
	/**
	 * 更新单个区块的产出
	 */
	private void updateChunkProduction(ClaimedChunk chunk, Clowder clowder, long currentTime) {
		// 计算经过的时间（小时）
		long elapsed = currentTime - chunk.lastUpdateTime;
		float hoursElapsed = elapsed / (60.0f * 60 * 1000);
		
		if (hoursElapsed < 1.0f) {
			return; // 未满一小时
		}
		
		// 更新时间
		chunk.lastUpdateTime = currentTime;
		
		// 根据区域类型进行产出
		switch (chunk.zoneType) {
			case RESIDENTIAL:
				produceResidential(chunk, clowder, (int) hoursElapsed);
				break;
			case ADMINISTRATIVE:
				produceAdministrative(chunk, clowder, (int) hoursElapsed);
				break;
			case MINING:
				produceMining(chunk, clowder);
				break;
			case RESEARCH:
				produceResearch(chunk, clowder, (int) hoursElapsed);
				break;
			case INDUSTRIAL:
				// 工业区不直接产出，只是提供工厂
				break;
			default:
				break;
		}
	}
	
	/**
	 * 居民区产出
	 */
	private void produceResidential(ClaimedChunk chunk, Clowder clowder, int hours) {
		// 扣除维护费
		if (!clowder.consumeMoney(SimpleConfigHandler.residentialMaintenanceCost * hours)) {
			return; // 钱不够，停止产出
		}
		
		// 应用加成
		float modifier = 1.0f;
		if (clowder.policySystem != null) {
			modifier *= clowder.policySystem.getManpowerModifier();
		}
		if (clowder.decisionSystem != null) {
			modifier *= clowder.decisionSystem.getManpowerModifier();
		}
		
		// 产出人力和人口
		int manpower = (int) (SimpleConfigHandler.residentialManpowerPerHour * hours * modifier);
		int population = (int) (SimpleConfigHandler.residentialPopulationPerHour * hours * modifier);
		
		if (clowder.populationSystem != null) {
			clowder.populationSystem.addManpower(manpower);
			clowder.populationSystem.addPopulation(population);
		}
	}
	
	/**
	 * 行政区产出
	 */
	private void produceAdministrative(ClaimedChunk chunk, Clowder clowder, int hours) {
		// 扣除维护费
		if (!clowder.consumeMoney(SimpleConfigHandler.administrativeMaintenanceCost * hours)) {
			return;
		}
		
		// 应用加成
		float modifier = 1.0f;
		if (clowder.policySystem != null) {
			modifier *= clowder.policySystem.getManpowerModifier();
		}
		
		// 产出人力和政治点数
		int manpower = (int) (SimpleConfigHandler.administrativeManpowerPerHour * hours * modifier);
		int politicalPoints = (int) (SimpleConfigHandler.administrativePoliticalPointsPerHour * hours);
		
		if (clowder.populationSystem != null) {
			clowder.populationSystem.addManpower(manpower);
		}
		clowder.addPoliticalPoints(politicalPoints);
	}
	
	/**
	 * 矿产区产出
	 */
	private void produceMining(ClaimedChunk chunk, Clowder clowder) {
		// 检查并消耗人力
		if (clowder.populationSystem == null || 
		    !clowder.populationSystem.consumeManpower(SimpleConfigHandler.miningManpowerCost)) {
			return;
		}
		
		// 更新生产进度
		long elapsed = System.currentTimeMillis() - chunk.lastUpdateTime;
		chunk.productionProgress += elapsed / 1000.0f; // 转换为秒
		
		// 检查是否完成生产周期
		if (chunk.productionProgress >= SimpleConfigHandler.miningProductionTime) {
			chunk.productionProgress = 0;
			
			// 应用加成
			float modifier = 1.0f;
			if (clowder.policySystem != null) {
				modifier *= clowder.policySystem.getResourceProductionModifier();
			}
			if (clowder.techTreeSystem != null) {
				modifier *= clowder.techTreeSystem.getResourceProductionModifier();
			}
			if (clowder.decisionSystem != null) {
				modifier *= clowder.decisionSystem.getResourceProductionModifier();
			}
			
			// 产出矿物
			Map<String, Integer> outputs = SimpleConfigHandler.getMiningOutputItems();
			for (Map.Entry<String, Integer> entry : outputs.entrySet()) {
				Item item = (Item) Item.itemRegistry.getObject(entry.getKey());
				if (item != null) {
					int amount = (int) (entry.getValue() * modifier);
					ItemStack stack = new ItemStack(item, amount);
					if (clowder.storehouse != null) {
						clowder.storehouse.addItem(stack);
					}
				}
			}
		}
	}
	
	/**
	 * 科研区产出
	 */
	private void produceResearch(ClaimedChunk chunk, Clowder clowder, int hours) {
		// 扣除维护费
		if (!clowder.consumeMoney(SimpleConfigHandler.researchMaintenanceCost * hours)) {
			return;
		}
		
		// 检查并消耗适役人口
		if (clowder.populationSystem == null || 
		    !clowder.populationSystem.consumeRecruitablePopulation(SimpleConfigHandler.researchPopulationCost * hours)) {
			return;
		}
		
		// 应用加成
		float modifier = 1.0f;
		if (clowder.policySystem != null) {
			modifier *= clowder.policySystem.getResearchSpeedModifier();
		}
		if (clowder.techTreeSystem != null) {
			modifier *= clowder.techTreeSystem.getResearchSpeedModifier();
		}
		if (clowder.decisionSystem != null) {
			modifier *= clowder.decisionSystem.getResearchSpeedModifier();
		}
		
		// 产出科研点数
		int researchPoints = (int) (SimpleConfigHandler.researchPointsPerHour * hours * modifier);
		
		// 应用到当前研发的科技
		if (clowder.techTreeSystem != null) {
			clowder.techTreeSystem.updateResearch(researchPoints);
		}
	}
	
	/**
	 * 在工业区建造工厂
	 */
	public boolean buildFactory(int chunkX, int chunkZ, boolean military, Clowder clowder) {
		String key = ClaimedChunk.getChunkKey(chunkX, chunkZ);
		ClaimedChunk chunk = claimedChunks.get(key);
		
		if (chunk == null || chunk.zoneType != ZoneType.INDUSTRIAL) {
			return false;
		}
		
		int cost = military ? SimpleConfigHandler.militaryFactoryCost : SimpleConfigHandler.civilianFactoryCost;
		if (!clowder.consumeMoney(cost)) {
			return false;
		}
		
		if (military) {
			chunk.hasMilitaryFactory = true;
			chunk.militaryFactoryCount++;
		} else {
			chunk.hasCivilianFactory = true;
			chunk.civilianFactoryCount++;
		}
		
		// 重新计算生产槽位
		if (clowder.productionSystem != null) {
			clowder.productionSystem.calculateProductionSlots(clowder);
		}
		
		return true;
	}
	
	/**
	 * 获取区块信息
	 */
	public ClaimedChunk getChunk(int chunkX, int chunkZ) {
		return claimedChunks.get(ClaimedChunk.getChunkKey(chunkX, chunkZ));
	}
	
	/**
	 * 获取所有已宣称的区块
	 */
	public List<ClaimedChunk> getAllChunks() {
		return new ArrayList<>(claimedChunks.values());
	}
	
	/**
	 * 获取特定类型的区块数量
	 */
	public int getChunkCountByType(ZoneType type) {
		int count = 0;
		for (ClaimedChunk chunk : claimedChunks.values()) {
			if (chunk.zoneType == type) {
				count++;
			}
		}
		return count;
	}
	
	/**
	 * 获取总工厂数量
	 */
	public int getTotalMilitaryFactories() {
		int count = 0;
		for (ClaimedChunk chunk : claimedChunks.values()) {
			count += chunk.militaryFactoryCount;
		}
		return count;
	}
	
	public int getTotalCivilianFactories() {
		int count = 0;
		for (ClaimedChunk chunk : claimedChunks.values()) {
			count += chunk.civilianFactoryCount;
		}
		return count;
	}
	
	/**
	 * 保存到NBT
	 */
	public NBTTagCompound saveToNBT() {
		NBTTagCompound nbt = new NBTTagCompound();
		
		NBTTagList chunkList = new NBTTagList();
		for (ClaimedChunk chunk : claimedChunks.values()) {
			chunkList.appendTag(chunk.saveToNBT());
		}
		nbt.setTag("claimedChunks", chunkList);
		
		return nbt;
	}
	
	/**
	 * 从NBT加载
	 */
	public void loadFromNBT(NBTTagCompound nbt) {
		claimedChunks.clear();
		
		NBTTagList chunkList = nbt.getTagList("claimedChunks", 10);
		for (int i = 0; i < chunkList.tagCount(); i++) {
			NBTTagCompound chunkTag = chunkList.getCompoundTagAt(i);
			ClaimedChunk chunk = ClaimedChunk.loadFromNBT(chunkTag);
			claimedChunks.put(chunk.getChunkKey(), chunk);
		}
	}
}
