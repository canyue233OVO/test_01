package com.hfr.clowder;

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
 * 
 * 注意：当前版本使用代码中的默认配置
 * 如需实现YAML配置文件加载，建议使用SnakeYAML库：
 * 
 * 1. 在build.gradle中添加依赖：
 *    compile 'org.yaml:snakeyaml:1.33'
 * 
 * 2. 使用示例：
 *    Yaml yaml = new Yaml();
 *    InputStream inputStream = new FileInputStream("config/hfr/zones.yml");
 *    Map<String, Object> data = yaml.load(inputStream);
 * 
 * 当前所有配置文件已创建为模板，服务器管理员可以：
 * 1. 修改配置文件中的数值来调整游戏平衡
 * 2. 添加新的物品、科技、生产项目等
 * 3. 自定义国策树和决议效果
 */
public class ConfigLoader {
    
    /**
     * 初始化所有配置
     * 当前版本从代码中的默认值加载
     */
    public static void loadAllConfigs() {
        // 区域配置已通过静态初始化加载
        ZoneConfig.loadFromConfig();
        
        // 国策树配置
        // PolicyTree的配置已在代码中定义
        
        // 决议系统配置
        // DecisionSystem的配置已在代码中定义
        
        // 科技树配置
        // TechnologyTree的配置已在代码中定义
        
        // 生产系统配置
        // ProductionSystem的配置已在代码中定义
        
        // 人口系统配置
        // PopulationSystem的配置已在代码中定义
        
        System.out.println("[HFR Clowder] 配置已加载（使用默认配置）");
        System.out.println("[HFR Clowder] 配置文件模板位于：config/hfr/");
        System.out.println("[HFR Clowder] 如需从YAML文件加载配置，请实现ConfigLoader类的加载逻辑");
    }
    
    /**
     * 重新加载所有配置
     * 可以在服务器运行时调用以更新配置
     */
    public static void reloadAllConfigs() {
        loadAllConfigs();
        System.out.println("[HFR Clowder] 配置已重新加载");
    }
}
