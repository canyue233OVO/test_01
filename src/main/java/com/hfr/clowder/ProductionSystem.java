package com.hfr.clowder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;

/**
 * 生产系统
 * 管理工厂和生产队列
 */
public class ProductionSystem {
    
    /** 所属派系 */
    private Clowder owner;
    
    /** 生产队列 */
    private List<ProductionQueue> productionQueues;
    
    /** 基础生产槽位数量 */
    public static final int BASE_PRODUCTION_SLOTS = 1;
    
    /** 每N个工厂增加一个槽位 */
    public static final int FACTORIES_PER_SLOT = 5;
    
    /** 所有可生产的项目 */
    private static Map<String, ProductionProject> allProjects = new HashMap<String, ProductionProject>();
    
    static {
        initializeDefaultProjects();
    }
    
    public ProductionSystem(Clowder owner) {
        this.owner = owner;
        this.productionQueues = new ArrayList<ProductionQueue>();
    }
    
    /**
     * 开始生产项目
     */
    public boolean startProduction(String projectId, int quantity) {
        ProductionProject project = allProjects.get(projectId);
        
        if(project == null) {
            return false;
        }
        
        // 检查科技前置条件
        if(!project.canProduce(owner)) {
            return false;
        }
        
        // 检查是否有可用的生产槽位
        if(productionQueues.size() >= getMaxProductionSlots()) {
            return false;
        }
        
        // 创建生产队列
        ProductionQueue queue = new ProductionQueue(projectId, quantity);
        productionQueues.add(queue);
        
        return true;
    }
    
    /**
     * 更新生产（每天调用一次）
     */
    public void update() {
        List<ProductionQueue> completedQueues = new ArrayList<ProductionQueue>();
        
        for(ProductionQueue queue : productionQueues) {
            ProductionProject project = allProjects.get(queue.projectId);
            if(project == null) {
                completedQueues.add(queue);
                continue;
            }
            
            // 计算生产速度（受工厂效率影响）
            float efficiencyBonus = 1.0f;
            
            // 应用科技树加成
            if(owner.technologyTree != null) {
                efficiencyBonus *= owner.technologyTree.getFactoryEfficiencyBonus();
            }
            
            // 应用国策加成
            if(owner.policyTree != null) {
                efficiencyBonus *= owner.policyTree.getFactoryEfficiencyBonus();
            }
            
            // 应用决议加成
            if(owner.decisionSystem != null) {
                efficiencyBonus *= owner.decisionSystem.getFactoryEfficiencyBonus();
            }
            
            float productionPerDay = efficiencyBonus;
            queue.progress += productionPerDay;
            
            // 检查是否完成一件
            while(queue.progress >= project.productionDays && queue.remainingQuantity > 0) {
                // 消耗原材料
                if(consumeMaterials(project)) {
                    // 产出物品
                    produceItem(project);
                    queue.remainingQuantity--;
                    queue.progress -= project.productionDays;
                } else {
                    // 材料不足，暂停生产
                    break;
                }
            }
            
            // 检查是否完成全部
            if(queue.remainingQuantity <= 0) {
                completedQueues.add(queue);
            }
        }
        
        // 移除已完成的队列
        productionQueues.removeAll(completedQueues);
    }
    
    /**
     * 消耗生产所需的原材料
     */
    private boolean consumeMaterials(ProductionProject project) {
        if(owner.storehouse == null) {
            return false;
        }
        
        // 检查是否有足够的材料
        for(Map.Entry<ItemStack, Integer> entry : project.materials.entrySet()) {
            ItemStack material = entry.getKey();
            int required = entry.getValue();
            
            if(owner.storehouse.getItemCount(material) < required) {
                return false;
            }
        }
        
        // 消耗材料
        for(Map.Entry<ItemStack, Integer> entry : project.materials.entrySet()) {
            ItemStack material = entry.getKey();
            int required = entry.getValue();
            
            int remaining = required;
            for(int i = 0; i < owner.storehouse.getSizeInventory() && remaining > 0; i++) {
                ItemStack stack = owner.storehouse.getStackInSlot(i);
                if(stack != null && stack.getItem() == material.getItem() && 
                   stack.getItemDamage() == material.getItemDamage()) {
                    int toRemove = Math.min(remaining, stack.stackSize);
                    owner.storehouse.removeItem(i, toRemove);
                    remaining -= toRemove;
                }
            }
        }
        
        return true;
    }
    
    /**
     * 产出物品到仓库
     */
    private void produceItem(ProductionProject project) {
        if(owner.storehouse != null) {
            owner.storehouse.addItem(project.output.copy());
        }
    }
    
    /**
     * 取消生产
     */
    public boolean cancelProduction(int queueIndex) {
        if(queueIndex >= 0 && queueIndex < productionQueues.size()) {
            productionQueues.remove(queueIndex);
            return true;
        }
        return false;
    }
    
    /**
     * 获取最大生产槽位数量
     */
    public int getMaxProductionSlots() {
        int slots = BASE_PRODUCTION_SLOTS;
        
        // 根据工厂数量增加槽位
        int totalFactories = getTotalFactories();
        slots += totalFactories / FACTORIES_PER_SLOT;
        
        // 应用国策加成
        // TODO: 实现国策系统的槽位加成
        
        // 应用科技树加成
        if(owner.technologyTree != null) {
            slots += owner.technologyTree.getProductionSlotsBonus();
        }
        
        return slots;
    }
    
    /**
     * 获取派系的总工厂数量
     */
    private int getTotalFactories() {
        int count = 0;
        
        if(owner.claimedZones != null) {
            for(ClaimedZone zone : owner.claimedZones.values()) {
                if(zone.zoneType == ZoneType.INDUSTRIAL) {
                    count += zone.getTotalFactories();
                }
            }
        }
        
        return count;
    }
    
    /**
     * 初始化默认生产项目
     */
    private static void initializeDefaultProjects() {
        // TODO: 从配置文件加载生产项目
        // 这里添加一些示例项目
    }
    
    /**
     * 从配置文件加载生产项目
     * TODO: 实现YAML配置读取
     */
    public static void loadProjectsFromConfig() {
        // 待实现
    }
    
    /**
     * 获取生产队列
     */
    public List<ProductionQueue> getProductionQueues() {
        return productionQueues;
    }
    
    /**
     * 写入NBT
     */
    public void writeToNBT(NBTTagCompound nbt) {
        NBTTagList queueList = new NBTTagList();
        
        for(ProductionQueue queue : productionQueues) {
            NBTTagCompound queueTag = new NBTTagCompound();
            queueTag.setString("projectId", queue.projectId);
            queueTag.setInteger("remainingQuantity", queue.remainingQuantity);
            queueTag.setFloat("progress", queue.progress);
            queueList.appendTag(queueTag);
        }
        
        nbt.setTag("productionQueues", queueList);
    }
    
    /**
     * 从NBT读取
     */
    public void readFromNBT(NBTTagCompound nbt) {
        productionQueues.clear();
        
        NBTTagList queueList = nbt.getTagList("productionQueues", 10);
        for(int i = 0; i < queueList.tagCount(); i++) {
            NBTTagCompound queueTag = queueList.getCompoundTagAt(i);
            String projectId = queueTag.getString("projectId");
            int remainingQuantity = queueTag.getInteger("remainingQuantity");
            float progress = queueTag.getFloat("progress");
            
            ProductionQueue queue = new ProductionQueue(projectId, remainingQuantity);
            queue.progress = progress;
            productionQueues.add(queue);
        }
    }
    
    /**
     * 生产队列
     */
    public static class ProductionQueue {
        public String projectId;
        public int remainingQuantity;
        public float progress; // 当前项目的进度（天数）
        
        public ProductionQueue(String projectId, int quantity) {
            this.projectId = projectId;
            this.remainingQuantity = quantity;
            this.progress = 0;
        }
    }
    
    /**
     * 生产项目定义
     */
    public static class ProductionProject {
        public String id;
        public String name;
        public String description;
        
        /** 所需工厂类型 */
        public boolean requiresMilitary; // true=军用工厂，false=民用工厂
        
        /** 生产时间（天数） */
        public float productionDays;
        
        /** 所需原材料 */
        public Map<ItemStack, Integer> materials;
        
        /** 产出物品 */
        public ItemStack output;
        
        /** 科技前置条件 */
        public List<String> requiredTechnologies;
        
        public ProductionProject(String id, String name, String description, 
                                boolean requiresMilitary, float productionDays) {
            this.id = id;
            this.name = name;
            this.description = description;
            this.requiresMilitary = requiresMilitary;
            this.productionDays = productionDays;
            this.materials = new HashMap<ItemStack, Integer>();
            this.requiredTechnologies = new ArrayList<String>();
        }
        
        /**
         * 检查是否可以生产
         */
        public boolean canProduce(Clowder clowder) {
            // 检查科技前置条件
            if(clowder.technologyTree != null) {
                for(String tech : requiredTechnologies) {
                    if(!clowder.technologyTree.isTechnologyUnlocked(tech)) {
                        return false;
                    }
                }
            } else if(!requiredTechnologies.isEmpty()) {
                return false;
            }
            
            return true;
        }
    }
}
