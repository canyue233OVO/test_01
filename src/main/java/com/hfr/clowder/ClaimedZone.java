package com.hfr.clowder;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

/**
 * 宣称的区域数据
 * 记录区域类型、位置、产出等信息
 */
public class ClaimedZone {
    
    /** 区域所属派系 */
    public Clowder owner;
    
    /** 区域类型 */
    public ZoneType zoneType;
    
    /** 旗帜位置（区域中心） */
    public int flagX;
    public int flagY;
    public int flagZ;
    
    /** 区域名称 */
    public String zoneName;
    
    /** 上次产出时间（用于计算定时产出） */
    public long lastProductionTime;
    
    /** 区域等级（可升级，影响产出效率） */
    public int level;
    
    /** 当前存储的资源（用于累积产出） */
    public float storedManpower;         // 人力
    public float storedEligiblePop;      // 适役人口
    public float storedPoliticalPower;   // 政治点数
    public float storedResearchPoints;   // 科研点数
    
    /** 工厂数量（仅工业区） */
    public int civilianFactories;
    public int militaryFactories;
    
    public ClaimedZone(Clowder owner, ZoneType zoneType, int flagX, int flagY, int flagZ, String zoneName) {
        this.owner = owner;
        this.zoneType = zoneType;
        this.flagX = flagX;
        this.flagY = flagY;
        this.flagZ = flagZ;
        this.zoneName = zoneName;
        this.lastProductionTime = System.currentTimeMillis();
        this.level = 1;
        this.storedManpower = 0;
        this.storedEligiblePop = 0;
        this.storedPoliticalPower = 0;
        this.storedResearchPoints = 0;
        this.civilianFactories = 0;
        this.militaryFactories = 0;
    }
    
    /**
     * 处理区域产出
     * 根据区域类型和配置计算产出
     */
    public void processProduction(World world) {
        long currentTime = System.currentTimeMillis();
        long timePassed = currentTime - lastProductionTime;
        
        // 每小时产出一次
        if(timePassed >= 3600000) { // 1小时 = 3600000毫秒
            float hours = timePassed / 3600000.0f;
            
            // 根据区域类型产出资源
            ZoneConfig config = ZoneConfig.getConfig(zoneType);
            
            switch(zoneType) {
                case RESIDENTIAL:
                    // 居民区产出人力和适役人口
                    storedManpower += config.manpowerProduction * hours * level;
                    storedEligiblePop += config.eligiblePopProduction * hours * level;
                    break;
                    
                case ADMINISTRATIVE:
                    // 行政区产出人力和政治点数
                    storedManpower += config.manpowerProduction * hours * level;
                    storedPoliticalPower += config.politicalPowerProduction * hours * level;
                    break;
                    
                case MINING:
                    // 矿产区消耗人力，产出矿物
                    if(owner.consumeManpower(config.manpowerCost * hours * level)) {
                        // 矿物产出在单独的方法中处理，直接存入仓库
                        produceMiningResources(world, hours);
                    }
                    break;
                    
                case RESEARCH:
                    // 科研区消耗适役人口，产出科研点数
                    if(owner.consumeEligiblePop(config.eligiblePopCost * hours * level)) {
                        storedResearchPoints += config.researchPointsProduction * hours * level;
                    }
                    break;
                    
                case INDUSTRIAL:
                    // 工业区不自动产出，提供工厂槽位
                    break;
            }
            
            lastProductionTime = currentTime;
        }
    }
    
    /**
     * 产出矿物资源（直接存入派系仓库）
     */
    private void produceMiningResources(World world, float hours) {
        ZoneConfig config = ZoneConfig.getConfig(zoneType);
        if(owner != null && owner.storehouse != null) {
            // 根据配置产出矿物
            // 这里需要从配置读取要产出的物品列表
            // TODO: 实现从配置读取并产出具体物品到仓库
        }
    }
    
    /**
     * 收集产出到派系仓库
     */
    public void collectProduction() {
        if(owner != null) {
            owner.addManpower(storedManpower);
            owner.addEligiblePop(storedEligiblePop);
            owner.addPoliticalPower(storedPoliticalPower);
            owner.addResearchPoints(storedResearchPoints);
            
            // 清空存储
            storedManpower = 0;
            storedEligiblePop = 0;
            storedPoliticalPower = 0;
            storedResearchPoints = 0;
        }
    }
    
    /**
     * 建造工厂（仅工业区）
     */
    public boolean buildFactory(boolean isMilitary, float cost) {
        if(zoneType != ZoneType.INDUSTRIAL) {
            return false;
        }
        
        if(owner != null && owner.getMoney() >= cost) {
            owner.addMoney(-cost);
            if(isMilitary) {
                militaryFactories++;
            } else {
                civilianFactories++;
            }
            return true;
        }
        
        return false;
    }
    
    /**
     * 获取工厂总数
     */
    public int getTotalFactories() {
        return civilianFactories + militaryFactories;
    }
    
    /**
     * 写入NBT
     */
    public void writeToNBT(NBTTagCompound nbt) {
        nbt.setString("zoneType", zoneType.name());
        nbt.setInteger("flagX", flagX);
        nbt.setInteger("flagY", flagY);
        nbt.setInteger("flagZ", flagZ);
        nbt.setString("zoneName", zoneName);
        nbt.setLong("lastProductionTime", lastProductionTime);
        nbt.setInteger("level", level);
        nbt.setFloat("storedManpower", storedManpower);
        nbt.setFloat("storedEligiblePop", storedEligiblePop);
        nbt.setFloat("storedPoliticalPower", storedPoliticalPower);
        nbt.setFloat("storedResearchPoints", storedResearchPoints);
        nbt.setInteger("civilianFactories", civilianFactories);
        nbt.setInteger("militaryFactories", militaryFactories);
    }
    
    /**
     * 从NBT读取
     */
    public static ClaimedZone readFromNBT(NBTTagCompound nbt, Clowder owner) {
        ZoneType zoneType = ZoneType.valueOf(nbt.getString("zoneType"));
        int flagX = nbt.getInteger("flagX");
        int flagY = nbt.getInteger("flagY");
        int flagZ = nbt.getInteger("flagZ");
        String zoneName = nbt.getString("zoneName");
        
        ClaimedZone zone = new ClaimedZone(owner, zoneType, flagX, flagY, flagZ, zoneName);
        zone.lastProductionTime = nbt.getLong("lastProductionTime");
        zone.level = nbt.getInteger("level");
        zone.storedManpower = nbt.getFloat("storedManpower");
        zone.storedEligiblePop = nbt.getFloat("storedEligiblePop");
        zone.storedPoliticalPower = nbt.getFloat("storedPoliticalPower");
        zone.storedResearchPoints = nbt.getFloat("storedResearchPoints");
        zone.civilianFactories = nbt.getInteger("civilianFactories");
        zone.militaryFactories = nbt.getInteger("militaryFactories");
        
        return zone;
    }
    
    /**
     * 获取区域的唯一标识符
     */
    public String getIdentifier() {
        return flagX + "_" + flagY + "_" + flagZ;
    }
}
