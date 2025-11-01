package com.hfr.clowder;

import java.util.HashMap;
import java.util.Map;

/**
 * 区域配置类
 * 存储各种区域类型的配置参数
 * 配置文件位置：config/hfr/zones.yml
 */
public class ZoneConfig {
    
    /** 人力产出（每小时每等级） */
    public float manpowerProduction;
    
    /** 适役人口产出（每小时每等级） */
    public float eligiblePopProduction;
    
    /** 政治点数产出（每小时每等级） */
    public float politicalPowerProduction;
    
    /** 科研点数产出（每小时每等级） */
    public float researchPointsProduction;
    
    /** 人力消耗（每小时每等级） */
    public float manpowerCost;
    
    /** 适役人口消耗（每小时每等级） */
    public float eligiblePopCost;
    
    /** 建造成本 */
    public float buildCost;
    
    private static Map<ZoneType, ZoneConfig> configs = new HashMap<ZoneType, ZoneConfig>();
    
    static {
        // 初始化默认配置
        // 居民区配置
        ZoneConfig residential = new ZoneConfig();
        residential.manpowerProduction = 10.0f;
        residential.eligiblePopProduction = 2.0f;
        residential.buildCost = 1000.0f;
        configs.put(ZoneType.RESIDENTIAL, residential);
        
        // 行政区配置
        ZoneConfig administrative = new ZoneConfig();
        administrative.manpowerProduction = 5.0f;
        administrative.politicalPowerProduction = 1.0f;
        administrative.buildCost = 1500.0f;
        configs.put(ZoneType.ADMINISTRATIVE, administrative);
        
        // 矿产区配置
        ZoneConfig mining = new ZoneConfig();
        mining.manpowerCost = 5.0f;
        mining.buildCost = 2000.0f;
        configs.put(ZoneType.MINING, mining);
        
        // 科研区配置
        ZoneConfig research = new ZoneConfig();
        research.eligiblePopCost = 3.0f;
        research.researchPointsProduction = 5.0f;
        research.buildCost = 3000.0f;
        configs.put(ZoneType.RESEARCH, research);
        
        // 工业区配置
        ZoneConfig industrial = new ZoneConfig();
        industrial.buildCost = 2500.0f;
        configs.put(ZoneType.INDUSTRIAL, industrial);
    }
    
    public static ZoneConfig getConfig(ZoneType type) {
        return configs.get(type);
    }
    
    public static void setConfig(ZoneType type, ZoneConfig config) {
        configs.put(type, config);
    }
    
    /**
     * 从配置文件加载
     * 注意：YAML解析需要添加依赖，当前使用默认配置
     * 如需从YAML加载，建议使用SnakeYAML库
     */
    public static void loadFromConfig() {
        // 可以在这里实现YAML配置文件读取
        // 当前版本使用静态初始化的默认配置
        // 配置文件已创建在 config/hfr/zones.yml 作为参考模板
    }
}
