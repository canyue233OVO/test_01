package com.hfr.clowder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;

/**
 * 决议系统
 * 类似钢铁雄心4的决议，消耗政治点数获得临时增益
 */
public class DecisionSystem {
    
    /** 所属派系 */
    private Clowder owner;
    
    /** 当前激活的决议 */
    private List<ActiveDecision> activeDecisions;
    
    /** 最大同时激活决议数量 */
    public static final int MAX_ACTIVE_DECISIONS = 3;
    
    /** 所有可用的决议 */
    private static Map<String, Decision> allDecisions = new HashMap<String, Decision>();
    
    static {
        initializeDefaultDecisions();
    }
    
    public DecisionSystem(Clowder owner) {
        this.owner = owner;
        this.activeDecisions = new ArrayList<ActiveDecision>();
    }
    
    /**
     * 激活决议
     */
    public boolean activateDecision(String decisionId) {
        Decision decision = allDecisions.get(decisionId);
        
        if(decision == null) {
            return false;
        }
        
        // 检查是否达到最大激活数量
        if(activeDecisions.size() >= MAX_ACTIVE_DECISIONS) {
            return false;
        }
        
        // 检查是否已激活
        for(ActiveDecision active : activeDecisions) {
            if(active.decisionId.equals(decisionId)) {
                return false;
            }
        }
        
        // 检查政治点数
        if(owner.politicalPower < decision.politicalPowerCost) {
            return false;
        }
        
        // 检查冷却
        if(decision.isOnCooldown(owner)) {
            return false;
        }
        
        // 消耗政治点数
        owner.consumePoliticalPower(decision.politicalPowerCost);
        
        // 激活决议
        ActiveDecision active = new ActiveDecision(decisionId, decision.duration);
        activeDecisions.add(active);
        
        // 设置冷却
        decision.setLastUseTime(owner, System.currentTimeMillis());
        
        return true;
    }
    
    /**
     * 更新决议（每天调用一次）
     */
    public void update() {
        List<ActiveDecision> toRemove = new ArrayList<ActiveDecision>();
        
        for(ActiveDecision active : activeDecisions) {
            active.remainingDays--;
            
            if(active.remainingDays <= 0) {
                toRemove.add(active);
            }
        }
        
        activeDecisions.removeAll(toRemove);
    }
    
    /**
     * 获取工厂效率加成
     */
    public float getFactoryEfficiencyBonus() {
        float bonus = 1.0f;
        
        for(ActiveDecision active : activeDecisions) {
            Decision decision = allDecisions.get(active.decisionId);
            if(decision != null) {
                bonus *= decision.factoryEfficiencyBonus;
            }
        }
        
        return bonus;
    }
    
    /**
     * 获取人力增长加成
     */
    public float getManpowerGrowthBonus() {
        float bonus = 1.0f;
        
        for(ActiveDecision active : activeDecisions) {
            Decision decision = allDecisions.get(active.decisionId);
            if(decision != null) {
                bonus *= decision.manpowerGrowthBonus;
            }
        }
        
        return bonus;
    }
    
    /**
     * 获取科研速度加成
     */
    public float getResearchSpeedBonus() {
        float bonus = 1.0f;
        
        for(ActiveDecision active : activeDecisions) {
            Decision decision = allDecisions.get(active.decisionId);
            if(decision != null) {
                bonus *= decision.researchSpeedBonus;
            }
        }
        
        return bonus;
    }
    
    /**
     * 获取战争加成
     */
    public float getWarBonus() {
        float bonus = 1.0f;
        
        for(ActiveDecision active : activeDecisions) {
            Decision decision = allDecisions.get(active.decisionId);
            if(decision != null) {
                bonus *= decision.warBonus;
            }
        }
        
        return bonus;
    }
    
    /**
     * 初始化默认决议
     */
    private static void initializeDefaultDecisions() {
        // 总动员
        Decision mobilization = new Decision("total_mobilization", "总动员", 
            "大幅提高人力增长和工厂效率", 50, 30, 60);
        mobilization.manpowerGrowthBonus = 1.5f;
        mobilization.factoryEfficiencyBonus = 1.3f;
        allDecisions.put("total_mobilization", mobilization);
        
        // 科研突击
        Decision researchPush = new Decision("research_push", "科研突击", 
            "大幅提高科研速度", 30, 20, 45);
        researchPush.researchSpeedBonus = 1.5f;
        allDecisions.put("research_push", researchPush);
        
        // 战争热情
        Decision warFervor = new Decision("war_fervor", "战争热情", 
            "提高战斗效率", 40, 15, 30);
        warFervor.warBonus = 1.3f;
        allDecisions.put("war_fervor", warFervor);
        
        // 经济刺激
        Decision economicStimulus = new Decision("economic_stimulus", "经济刺激", 
            "提高工厂效率和资源产出", 40, 25, 40);
        economicStimulus.factoryEfficiencyBonus = 1.4f;
        allDecisions.put("economic_stimulus", economicStimulus);
    }
    
    /**
     * 从配置文件加载决议
     * TODO: 实现YAML配置读取
     */
    public static void loadDecisionsFromConfig() {
        // 待实现
    }
    
    /**
     * 写入NBT
     */
    public void writeToNBT(NBTTagCompound nbt) {
        NBTTagList decisionList = new NBTTagList();
        
        for(ActiveDecision active : activeDecisions) {
            NBTTagCompound decisionTag = new NBTTagCompound();
            decisionTag.setString("id", active.decisionId);
            decisionTag.setInteger("remainingDays", active.remainingDays);
            decisionList.appendTag(decisionTag);
        }
        
        nbt.setTag("activeDecisions", decisionList);
    }
    
    /**
     * 从NBT读取
     */
    public void readFromNBT(NBTTagCompound nbt) {
        activeDecisions.clear();
        
        NBTTagList decisionList = nbt.getTagList("activeDecisions", 10);
        for(int i = 0; i < decisionList.tagCount(); i++) {
            NBTTagCompound decisionTag = decisionList.getCompoundTagAt(i);
            String id = decisionTag.getString("id");
            int remainingDays = decisionTag.getInteger("remainingDays");
            
            ActiveDecision active = new ActiveDecision(id, remainingDays);
            activeDecisions.add(active);
        }
    }
    
    /**
     * 激活的决议
     */
    public static class ActiveDecision {
        public String decisionId;
        public int remainingDays;
        
        public ActiveDecision(String decisionId, int duration) {
            this.decisionId = decisionId;
            this.remainingDays = duration;
        }
    }
    
    /**
     * 决议定义
     */
    public static class Decision {
        public String id;
        public String name;
        public String description;
        public float politicalPowerCost; // 政治点数消耗
        public int duration; // 持续时间（天）
        public int cooldown; // 冷却时间（天）
        
        // 效果加成
        public float factoryEfficiencyBonus = 1.0f;
        public float manpowerGrowthBonus = 1.0f;
        public float researchSpeedBonus = 1.0f;
        public float warBonus = 1.0f;
        
        // 冷却追踪（派系UUID -> 最后使用时间）
        private Map<String, Long> lastUseTimes = new HashMap<String, Long>();
        
        public Decision(String id, String name, String description, 
                       float politicalPowerCost, int duration, int cooldown) {
            this.id = id;
            this.name = name;
            this.description = description;
            this.politicalPowerCost = politicalPowerCost;
            this.duration = duration;
            this.cooldown = cooldown;
        }
        
        /**
         * 检查是否在冷却中
         */
        public boolean isOnCooldown(Clowder clowder) {
            Long lastUseTime = lastUseTimes.get(clowder.uuid);
            if(lastUseTime == null) {
                return false;
            }
            
            long timePassed = System.currentTimeMillis() - lastUseTime;
            long cooldownMs = cooldown * 86400000L; // 转换为毫秒
            
            return timePassed < cooldownMs;
        }
        
        /**
         * 设置最后使用时间
         */
        public void setLastUseTime(Clowder clowder, long time) {
            lastUseTimes.put(clowder.uuid, time);
        }
    }
}
