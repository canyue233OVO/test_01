package com.hfr.clowder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.minecraft.item.Item;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;

/**
 * 科技树系统
 * 控制物品解锁、建筑解锁和各种加成
 */
public class TechnologyTree {
    
    /** 所属派系 */
    private Clowder owner;
    
    /** 已解锁的科技ID列表 */
    private List<String> unlockedTechs;
    
    /** 当前正在研究的科技 */
    private String currentResearch;
    
    /** 研究进度（科研点数） */
    private float researchProgress;
    
    /** 所有可用的科技 */
    private static Map<String, Technology> allTechnologies = new HashMap<String, Technology>();
    
    static {
        initializeDefaultTechnologies();
    }
    
    public TechnologyTree(Clowder owner) {
        this.owner = owner;
        this.unlockedTechs = new ArrayList<String>();
        this.currentResearch = null;
        this.researchProgress = 0;
    }
    
    /**
     * 开始研究科技
     */
    public boolean startResearch(String techId) {
        Technology tech = allTechnologies.get(techId);
        
        if(tech == null) {
            return false;
        }
        
        // 检查前置条件
        if(!tech.canUnlock(this)) {
            return false;
        }
        
        // 检查是否已解锁
        if(unlockedTechs.contains(techId)) {
            return false;
        }
        
        currentResearch = techId;
        researchProgress = 0;
        return true;
    }
    
    /**
     * 更新研究进度（每小时调用一次）
     * @param researchPoints 科研点数
     */
    public void updateResearch(float researchPoints) {
        if(currentResearch == null) {
            return;
        }
        
        Technology tech = allTechnologies.get(currentResearch);
        if(tech == null) {
            currentResearch = null;
            return;
        }
        
        // 应用科研速度加成
        float bonus = 1.0f;
        if(owner.policyTree != null) {
            bonus *= owner.policyTree.getResearchSpeedBonus();
        }
        if(owner.decisionSystem != null) {
            bonus *= owner.decisionSystem.getResearchSpeedBonus();
        }
        
        researchProgress += researchPoints * bonus;
        
        // 研究完成
        if(researchProgress >= tech.researchCost) {
            unlockTechnology(currentResearch);
            currentResearch = null;
            researchProgress = 0;
        }
    }
    
    /**
     * 解锁科技
     */
    private void unlockTechnology(String techId) {
        if(!unlockedTechs.contains(techId)) {
            unlockedTechs.add(techId);
            
            // 应用科技效果
            Technology tech = allTechnologies.get(techId);
            if(tech != null) {
                tech.applyEffects(owner);
            }
        }
    }
    
    /**
     * 检查科技是否已解锁
     */
    public boolean isTechnologyUnlocked(String techId) {
        return unlockedTechs.contains(techId);
    }
    
    /**
     * 检查物品是否可用
     */
    public boolean isItemUnlocked(Item item) {
        // 检查是否有科技锁定此物品
        for(Technology tech : allTechnologies.values()) {
            if(tech.unlockedItems.contains(item)) {
                return isTechnologyUnlocked(tech.id);
            }
        }
        
        // 没有科技限制，默认可用
        return true;
    }
    
    /**
     * 获取人口转换加成
     */
    public float getPopulationConversionBonus() {
        float bonus = 1.0f;
        
        for(String techId : unlockedTechs) {
            Technology tech = allTechnologies.get(techId);
            if(tech != null) {
                bonus *= tech.populationConversionBonus;
            }
        }
        
        return bonus;
    }
    
    /**
     * 获取随机产出加成
     */
    public float getRandomProductionBonus() {
        float bonus = 1.0f;
        
        for(String techId : unlockedTechs) {
            Technology tech = allTechnologies.get(techId);
            if(tech != null) {
                bonus *= tech.randomProductionBonus;
            }
        }
        
        return bonus;
    }
    
    /**
     * 获取工厂效率加成
     */
    public float getFactoryEfficiencyBonus() {
        float bonus = 1.0f;
        
        for(String techId : unlockedTechs) {
            Technology tech = allTechnologies.get(techId);
            if(tech != null) {
                bonus *= tech.factoryEfficiencyBonus;
            }
        }
        
        return bonus;
    }
    
    /**
     * 获取生产槽位加成
     */
    public int getProductionSlotsBonus() {
        int bonus = 0;
        
        for(String techId : unlockedTechs) {
            Technology tech = allTechnologies.get(techId);
            if(tech != null) {
                bonus += tech.productionSlotsBonus;
            }
        }
        
        return bonus;
    }
    
    /**
     * 初始化默认科技
     */
    private static void initializeDefaultTechnologies() {
        // 基础工业
        Technology basicIndustry = new Technology("basic_industry", "基础工业", 
            "解锁基础工业设施", 100);
        basicIndustry.factoryEfficiencyBonus = 1.1f;
        allTechnologies.put("basic_industry", basicIndustry);
        
        // 先进工业
        Technology advancedIndustry = new Technology("advanced_industry", "先进工业", 
            "解锁先进工业设施", 200);
        advancedIndustry.prerequisites.add("basic_industry");
        advancedIndustry.factoryEfficiencyBonus = 1.2f;
        advancedIndustry.productionSlotsBonus = 1;
        allTechnologies.put("advanced_industry", advancedIndustry);
        
        // 征兵制度
        Technology conscription = new Technology("conscription", "征兵制度", 
            "提高适役人口转换率", 150);
        conscription.populationConversionBonus = 1.2f;
        allTechnologies.put("conscription", conscription);
        
        // 先进武器
        Technology advancedWeapons = new Technology("advanced_weapons", "先进武器", 
            "解锁先进武器制造", 300);
        advancedWeapons.prerequisites.add("basic_industry");
        // TODO: 添加解锁的物品
        allTechnologies.put("advanced_weapons", advancedWeapons);
    }
    
    /**
     * 从配置文件加载科技
     * TODO: 实现YAML配置读取
     */
    public static void loadTechnologiesFromConfig() {
        // 待实现
    }
    
    /**
     * 写入NBT
     */
    public void writeToNBT(NBTTagCompound nbt) {
        NBTTagList techList = new NBTTagList();
        for(String techId : unlockedTechs) {
            NBTTagCompound techTag = new NBTTagCompound();
            techTag.setString("id", techId);
            techList.appendTag(techTag);
        }
        nbt.setTag("unlockedTechs", techList);
        
        if(currentResearch != null) {
            nbt.setString("currentResearch", currentResearch);
            nbt.setFloat("researchProgress", researchProgress);
        }
    }
    
    /**
     * 从NBT读取
     */
    public void readFromNBT(NBTTagCompound nbt) {
        unlockedTechs.clear();
        NBTTagList techList = nbt.getTagList("unlockedTechs", 10);
        for(int i = 0; i < techList.tagCount(); i++) {
            NBTTagCompound techTag = techList.getCompoundTagAt(i);
            unlockedTechs.add(techTag.getString("id"));
        }
        
        if(nbt.hasKey("currentResearch")) {
            currentResearch = nbt.getString("currentResearch");
            researchProgress = nbt.getFloat("researchProgress");
        }
    }
    
    /**
     * 科技定义
     */
    public static class Technology {
        public String id;
        public String name;
        public String description;
        public float researchCost; // 研究所需科研点数
        
        public List<String> prerequisites = new ArrayList<String>(); // 前置科技
        public List<Item> unlockedItems = new ArrayList<Item>(); // 解锁的物品
        
        // 效果加成
        public float populationConversionBonus = 1.0f;
        public float randomProductionBonus = 1.0f;
        public float factoryEfficiencyBonus = 1.0f;
        public int productionSlotsBonus = 0;
        
        public Technology(String id, String name, String description, float researchCost) {
            this.id = id;
            this.name = name;
            this.description = description;
            this.researchCost = researchCost;
        }
        
        /**
         * 检查是否可以解锁
         */
        public boolean canUnlock(TechnologyTree tree) {
            // 检查前置条件
            for(String prereq : prerequisites) {
                if(!tree.isTechnologyUnlocked(prereq)) {
                    return false;
                }
            }
            
            return true;
        }
        
        /**
         * 应用科技效果
         */
        public void applyEffects(Clowder clowder) {
            // 科技效果通过加成系数应用，不需要在这里做额外操作
            // 特殊效果可以在这里实现
        }
    }
}
