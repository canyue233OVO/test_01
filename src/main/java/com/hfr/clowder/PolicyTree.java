package com.hfr.clowder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;

/**
 * 国策树系统
 * 类似钢铁雄心4的国策系统
 */
public class PolicyTree {
    
    /** 所属派系 */
    private Clowder owner;
    
    /** 意识形态 */
    private String ideology;
    
    /** 已解锁的国策ID列表 */
    private List<String> unlockedPolicies;
    
    /** 当前正在研究的国策 */
    private String currentResearch;
    
    /** 研究进度（天数） */
    private int researchProgress;
    
    /** 所有可用的国策 */
    private static Map<String, Policy> allPolicies = new HashMap<String, Policy>();
    
    static {
        // 初始化默认国策
        // TODO: 从配置文件加载
        initializeDefaultPolicies();
    }
    
    public PolicyTree(Clowder owner, String ideology) {
        this.owner = owner;
        this.ideology = ideology;
        this.unlockedPolicies = new ArrayList<String>();
        this.currentResearch = null;
        this.researchProgress = 0;
    }
    
    /**
     * 开始研究国策
     */
    public boolean startResearch(String policyId) {
        Policy policy = allPolicies.get(policyId);
        
        if(policy == null) {
            return false;
        }
        
        // 检查前置条件
        if(!policy.canUnlock(this)) {
            return false;
        }
        
        // 检查是否已解锁
        if(unlockedPolicies.contains(policyId)) {
            return false;
        }
        
        currentResearch = policyId;
        researchProgress = 0;
        return true;
    }
    
    /**
     * 更新研究进度（每天调用一次）
     */
    public void updateResearch() {
        if(currentResearch == null) {
            return;
        }
        
        Policy policy = allPolicies.get(currentResearch);
        if(policy == null) {
            currentResearch = null;
            return;
        }
        
        researchProgress++;
        
        // 研究完成
        if(researchProgress >= policy.researchDays) {
            unlockPolicy(currentResearch);
            currentResearch = null;
            researchProgress = 0;
        }
    }
    
    /**
     * 解锁国策
     */
    private void unlockPolicy(String policyId) {
        if(!unlockedPolicies.contains(policyId)) {
            unlockedPolicies.add(policyId);
            
            // 应用国策效果
            Policy policy = allPolicies.get(policyId);
            if(policy != null) {
                policy.applyEffects(owner);
            }
        }
    }
    
    /**
     * 检查国策是否已解锁
     */
    public boolean isPolicyUnlocked(String policyId) {
        return unlockedPolicies.contains(policyId);
    }
    
    /**
     * 获取人口转换加成
     */
    public float getPopulationConversionBonus() {
        float bonus = 1.0f;
        
        for(String policyId : unlockedPolicies) {
            Policy policy = allPolicies.get(policyId);
            if(policy != null) {
                bonus *= policy.populationConversionBonus;
            }
        }
        
        return bonus;
    }
    
    /**
     * 获取随机产出加成
     */
    public float getRandomProductionBonus() {
        float bonus = 1.0f;
        
        for(String policyId : unlockedPolicies) {
            Policy policy = allPolicies.get(policyId);
            if(policy != null) {
                bonus *= policy.randomProductionBonus;
            }
        }
        
        return bonus;
    }
    
    /**
     * 获取科研速度加成
     */
    public float getResearchSpeedBonus() {
        float bonus = 1.0f;
        
        for(String policyId : unlockedPolicies) {
            Policy policy = allPolicies.get(policyId);
            if(policy != null) {
                bonus *= policy.researchSpeedBonus;
            }
        }
        
        return bonus;
    }
    
    /**
     * 获取工厂效率加成
     */
    public float getFactoryEfficiencyBonus() {
        float bonus = 1.0f;
        
        for(String policyId : unlockedPolicies) {
            Policy policy = allPolicies.get(policyId);
            if(policy != null) {
                bonus *= policy.factoryEfficiencyBonus;
            }
        }
        
        return bonus;
    }
    
    /**
     * 初始化默认国策
     */
    private static void initializeDefaultPolicies() {
        // 示例：创建一些默认国策
        Policy industrialization = new Policy("industrialization", "工业化", 
            "加快工业发展", 70);
        industrialization.factoryEfficiencyBonus = 1.1f;
        allPolicies.put("industrialization", industrialization);
        
        Policy militaryReform = new Policy("military_reform", "军事改革", 
            "提高军事效率", 70);
        militaryReform.populationConversionBonus = 1.15f;
        allPolicies.put("military_reform", militaryReform);
        
        Policy scientificAdvancement = new Policy("scientific_advancement", "科学进步", 
            "加快科研速度", 70);
        scientificAdvancement.researchSpeedBonus = 1.2f;
        allPolicies.put("scientific_advancement", scientificAdvancement);
    }
    
    /**
     * 从配置文件加载国策
     * TODO: 实现YAML配置读取
     */
    public static void loadPoliciesFromConfig() {
        // 待实现
    }
    
    /**
     * 写入NBT
     */
    public void writeToNBT(NBTTagCompound nbt) {
        nbt.setString("ideology", ideology);
        
        NBTTagList policyList = new NBTTagList();
        for(String policyId : unlockedPolicies) {
            NBTTagCompound policyTag = new NBTTagCompound();
            policyTag.setString("id", policyId);
            policyList.appendTag(policyTag);
        }
        nbt.setTag("unlockedPolicies", policyList);
        
        if(currentResearch != null) {
            nbt.setString("currentResearch", currentResearch);
            nbt.setInteger("researchProgress", researchProgress);
        }
    }
    
    /**
     * 从NBT读取
     */
    public void readFromNBT(NBTTagCompound nbt) {
        ideology = nbt.getString("ideology");
        
        unlockedPolicies.clear();
        NBTTagList policyList = nbt.getTagList("unlockedPolicies", 10);
        for(int i = 0; i < policyList.tagCount(); i++) {
            NBTTagCompound policyTag = policyList.getCompoundTagAt(i);
            unlockedPolicies.add(policyTag.getString("id"));
        }
        
        if(nbt.hasKey("currentResearch")) {
            currentResearch = nbt.getString("currentResearch");
            researchProgress = nbt.getInteger("researchProgress");
        }
    }
    
    /**
     * 国策类
     */
    public static class Policy {
        public String id;
        public String name;
        public String description;
        public int researchDays; // 研究所需天数
        
        public List<String> prerequisites = new ArrayList<String>(); // 前置国策
        public List<String> mutuallyExclusive = new ArrayList<String>(); // 互斥国策
        
        // 效果加成
        public float populationConversionBonus = 1.0f;
        public float randomProductionBonus = 1.0f;
        public float researchSpeedBonus = 1.0f;
        public float factoryEfficiencyBonus = 1.0f;
        public float manpowerBonus = 1.0f;
        
        public Policy(String id, String name, String description, int researchDays) {
            this.id = id;
            this.name = name;
            this.description = description;
            this.researchDays = researchDays;
        }
        
        /**
         * 检查是否可以解锁
         */
        public boolean canUnlock(PolicyTree tree) {
            // 检查前置条件
            for(String prereq : prerequisites) {
                if(!tree.isPolicyUnlocked(prereq)) {
                    return false;
                }
            }
            
            // 检查互斥条件
            for(String exclusive : mutuallyExclusive) {
                if(tree.isPolicyUnlocked(exclusive)) {
                    return false;
                }
            }
            
            return true;
        }
        
        /**
         * 应用国策效果
         */
        public void applyEffects(Clowder clowder) {
            // 国策效果通过加成系数应用，不需要在这里做额外操作
            // 特殊效果可以在这里实现
        }
    }
}
