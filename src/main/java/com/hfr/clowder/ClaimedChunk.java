package com.hfr.clowder;

import net.minecraft.nbt.NBTTagCompound;

/**
 * 代表一个被宣称的区块
 * 存储区块的类型、所属派系和相关数据
 */
public class ClaimedChunk {
	
	/** 区块X坐标 */
	public int chunkX;
	
	/** 区块Z坐标 */
	public int chunkZ;
	
	/** 所属派系UUID */
	public String clowderUuid;
	
	/** 区域类型 */
	public ZoneType zoneType;
	
	/** 最后更新时间（用于计算产出） */
	public long lastUpdateTime;
	
	/** 累积的产出进度 */
	public float productionProgress;
	
	/** 是否有工厂（仅工业区） */
	public boolean hasMilitaryFactory;
	public boolean hasCivilianFactory;
	public int militaryFactoryCount;
	public int civilianFactoryCount;
	
	public ClaimedChunk(int chunkX, int chunkZ, String clowderUuid, ZoneType zoneType) {
		this.chunkX = chunkX;
		this.chunkZ = chunkZ;
		this.clowderUuid = clowderUuid;
		this.zoneType = zoneType;
		this.lastUpdateTime = System.currentTimeMillis();
		this.productionProgress = 0;
		this.hasMilitaryFactory = false;
		this.hasCivilianFactory = false;
		this.militaryFactoryCount = 0;
		this.civilianFactoryCount = 0;
	}
	
	/**
	 * 从NBT加载区块数据
	 */
	public static ClaimedChunk loadFromNBT(NBTTagCompound nbt) {
		int x = nbt.getInteger("chunkX");
		int z = nbt.getInteger("chunkZ");
		String uuid = nbt.getString("clowderUuid");
		ZoneType type = ZoneType.fromId(nbt.getString("zoneType"));
		
		ClaimedChunk chunk = new ClaimedChunk(x, z, uuid, type);
		chunk.lastUpdateTime = nbt.getLong("lastUpdateTime");
		chunk.productionProgress = nbt.getFloat("productionProgress");
		chunk.hasMilitaryFactory = nbt.getBoolean("hasMilitaryFactory");
		chunk.hasCivilianFactory = nbt.getBoolean("hasCivilianFactory");
		chunk.militaryFactoryCount = nbt.getInteger("militaryFactoryCount");
		chunk.civilianFactoryCount = nbt.getInteger("civilianFactoryCount");
		
		return chunk;
	}
	
	/**
	 * 保存到NBT
	 */
	public NBTTagCompound saveToNBT() {
		NBTTagCompound nbt = new NBTTagCompound();
		nbt.setInteger("chunkX", chunkX);
		nbt.setInteger("chunkZ", chunkZ);
		nbt.setString("clowderUuid", clowderUuid);
		nbt.setString("zoneType", zoneType.getId());
		nbt.setLong("lastUpdateTime", lastUpdateTime);
		nbt.setFloat("productionProgress", productionProgress);
		nbt.setBoolean("hasMilitaryFactory", hasMilitaryFactory);
		nbt.setBoolean("hasCivilianFactory", hasCivilianFactory);
		nbt.setInteger("militaryFactoryCount", militaryFactoryCount);
		nbt.setInteger("civilianFactoryCount", civilianFactoryCount);
		return nbt;
	}
	
	/**
	 * 获取区块键值（用于HashMap）
	 */
	public String getChunkKey() {
		return chunkX + "," + chunkZ;
	}
	
	/**
	 * 静态方法：从坐标生成区块键值
	 */
	public static String getChunkKey(int x, int z) {
		return x + "," + z;
	}
}
