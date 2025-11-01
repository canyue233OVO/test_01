package com.hfr.clowder;

import com.hfr.clowder.config.YamlConfigLoader;
import com.hfr.main.MainRegistry;

import java.io.File;

/**
 * 配置加载器类
 * 负责从YAML配置文件加载各种系统的配置
 * 
 * 配置文件位置：
 * - config/hfr/zones.yml        区域配置
 * - config/hfr/policies.yml     国策树配置
 * - config/hfr/decisions.yml    决议系统配置
 * - config/hfr/technologies.yml 科技树配置
 * - config/hfr/production.yml   生产系统配置
 * - config/hfr/population.yml   人口系统配置
 */
public class ConfigLoader {
    
    private static File configDir = new File("config/hfr");
    
    /**
     * 初始化所有配置
     * 首先加载默认配置，然后尝试从YAML文件覆盖
     */
    public static void loadAllConfigs() {
        System.out.println("[HFR Clowder] 开始加载配置...");
        
        // 确保配置目录存在
        if (!configDir.exists()) {
            configDir.mkdirs();
            System.out.println("[HFR Clowder] 创建配置目录：" + configDir.getAbsolutePath());
        }
        
        // 1. 区域配置
        loadZoneConfig();
        
        // 2. 国策树配置（当前使用代码中的定义）
        // PolicyTree的配置已在代码中定义
        
        // 3. 决议系统配置（当前使用代码中的定义）
        // DecisionSystem的配置已在代码中定义
        
        // 4. 科技树配置（当前使用代码中的定义）
        // TechnologyTree的配置已在代码中定义
        
        // 5. 生产系统配置（当前使用代码中的定义）
        // ProductionSystem的配置已在代码中定义
        
        // 6. 人口系统配置（当前使用代码中的定义）
        // PopulationSystem的配置已在代码中定义
        
        System.out.println("[HFR Clowder] 配置加载完成");
        System.out.println("[HFR Clowder] 配置文件位置：" + configDir.getAbsolutePath());
    }
    
    /**
     * 加载区域配置
     */
    private static void loadZoneConfig() {
        // 首先加载默认配置
        ZoneConfig.loadFromConfig();
        
        // 尝试从YAML文件加载
        File zonesFile = new File(configDir, "zones.yml");
        if (zonesFile.exists()) {
            try {
                YamlConfigLoader.loadZoneConfig(zonesFile);
            } catch (Exception e) {
                MainRegistry.logger.error("[HFR Clowder] 区域配置加载失败，使用默认配置", e);
            }
        } else {
            System.out.println("[HFR Clowder] zones.yml不存在，使用默认配置");
        }
    }
    
    /**
     * 重新加载所有配置
     * 可以在服务器运行时调用以更新配置
     */
    public static void reloadAllConfigs() {
        System.out.println("[HFR Clowder] 重新加载配置...");
        loadAllConfigs();
        System.out.println("[HFR Clowder] 配置重新加载完成");
    }
    
    /**
     * 获取配置目录
     */
    public static File getConfigDir() {
        return configDir;
    }
}
