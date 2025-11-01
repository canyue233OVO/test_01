package com.hfr.clowder;

import java.util.Random;

import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

/**
 * 人口系统
 * 处理人口增长、转换和随机产出
 */
public class PopulationSystem {
    
    /** 总人口 */
    public float population;
    
    /** 人力（劳动力） */
    public float manpower;
    
    /** 适役人口（可用于科研、军队等） */
    public float eligiblePopulation;
    
    /** 上次人口转换时间 */
    public long lastConversionTime;
    
    /** 上次随机产出时间 */
    public long lastRandomProductionTime;
    
    /** 所属派系 */
    private Clowder owner;
    
    /** 人口转换为适役人口的比例（每天） */
    public static float CONVERSION_RATE = 0.05f; // 5%
    
    /** 随机产出检查间隔（1小时） */
    public static final long RANDOM_PRODUCTION_INTERVAL = 3600000;
    
    /** 每1000人口的随机产出概率 */
    public static float PRODUCTION_CHANCE_PER_1K = 0.1f; // 10%
    
    private Random random = new Random();
    
    public PopulationSystem(Clowder owner) {
        this.owner = owner;
        this.population = 0;
        this.manpower = 0;
        this.eligiblePopulation = 0;
        this.lastConversionTime = System.currentTimeMillis();
        this.lastRandomProductionTime = System.currentTimeMillis();
    }
    
    /**
     * 更新人口系统（每tick调用）
     */
    public void update(World world) {
        long currentTime = System.currentTimeMillis();
        
        // 人口转换（每天一次）
        if(currentTime - lastConversionTime >= 86400000) { // 24小时
            convertPopulation();
            lastConversionTime = currentTime;
        }
        
        // 随机产出（每小时一次）
        if(currentTime - lastRandomProductionTime >= RANDOM_PRODUCTION_INTERVAL) {
            randomProduction(world);
            lastRandomProductionTime = currentTime;
        }
    }
    
    /**
     * 人口转换为适役人口
     * 受科技树和国策影响
     */
    private void convertPopulation() {
        float conversionRate = CONVERSION_RATE;
        
        // 应用科技树加成
        if(owner.technologyTree != null) {
            conversionRate *= owner.technologyTree.getPopulationConversionBonus();
        }
        
        // 应用国策加成
        if(owner.policyTree != null) {
            conversionRate *= owner.policyTree.getPopulationConversionBonus();
        }
        
        float converted = population * conversionRate;
        eligiblePopulation += converted;
        
        // 可选：转换后减少总人口
        // population -= converted;
    }
    
    /**
     * 随机产出物品
     * 每1000人口有一定概率产出配置的物品
     */
    private void randomProduction(World world) {
        if(owner == null || owner.storehouse == null) {
            return;
        }
        
        float productionChance = (population / 1000.0f) * PRODUCTION_CHANCE_PER_1K;
        
        // 应用科技树和国策加成
        if(owner.technologyTree != null) {
            productionChance *= owner.technologyTree.getRandomProductionBonus();
        }
        
        if(owner.policyTree != null) {
            productionChance *= owner.policyTree.getRandomProductionBonus();
        }
        
        // 随机产出检查
        if(random.nextFloat() < productionChance) {
            // TODO: 从配置文件读取可产出的物品列表
            // 这里使用示例物品
            ItemStack[] possibleItems = getPossibleProductionItems();
            
            if(possibleItems.length > 0) {
                ItemStack item = possibleItems[random.nextInt(possibleItems.length)].copy();
                owner.storehouse.addItem(item);
            }
        }
    }
    
    /**
     * 获取可能产出的物品列表
     * TODO: 从配置文件读取
     */
    private ItemStack[] getPossibleProductionItems() {
        // 示例：返回一些基础物品
        // 实际应从配置文件读取
        return new ItemStack[] {
            // new ItemStack(Items.iron_ingot, 1),
            // new ItemStack(Items.gold_ingot, 1),
            // new ItemStack(Items.coal, 2)
        };
    }
    
    /**
     * 增加人口
     */
    public void addPopulation(float amount) {
        this.population += amount;
    }
    
    /**
     * 增加人力
     */
    public void addManpower(float amount) {
        this.manpower += amount;
    }
    
    /**
     * 增加适役人口
     */
    public void addEligiblePopulation(float amount) {
        this.eligiblePopulation += amount;
    }
    
    /**
     * 消耗人力
     */
    public boolean consumeManpower(float amount) {
        if(manpower >= amount) {
            manpower -= amount;
            return true;
        }
        return false;
    }
    
    /**
     * 消耗适役人口
     */
    public boolean consumeEligiblePopulation(float amount) {
        if(eligiblePopulation >= amount) {
            eligiblePopulation -= amount;
            return true;
        }
        return false;
    }
    
    /**
     * 获取总人口
     */
    public float getPopulation() {
        return population;
    }
    
    /**
     * 获取人力
     */
    public float getManpower() {
        return manpower;
    }
    
    /**
     * 获取适役人口
     */
    public float getEligiblePopulation() {
        return eligiblePopulation;
    }
}
