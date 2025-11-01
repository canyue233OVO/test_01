package com.hfr.clowder.config;

import com.hfr.clowder.*;
import com.hfr.main.MainRegistry;

import java.io.*;
import java.util.*;

/**
 * YAML配置文件加载器
 * 使用简单的键值对解析，不依赖外部库
 * 支持基本的YAML语法（缩进、列表、键值对）
 */
public class YamlConfigLoader {
    
    /**
     * 加载区域配置
     */
    public static void loadZoneConfig(File configFile) {
        try {
            if (!configFile.exists()) {
                MainRegistry.logger.info("[HFR Clowder] 区域配置文件不存在，使用默认配置");
                return;
            }
            
            Map<String, Map<String, Object>> data = parseYamlFile(configFile);
            
            for (ZoneType type : ZoneType.values()) {
                String key = type.getConfigKey();
                if (data.containsKey(key)) {
                    Map<String, Object> zoneData = data.get(key);
                    ZoneConfig config = new ZoneConfig();
                    
                    // 解析配置值
                    if (zoneData.containsKey("buildCost")) {
                        config.buildCost = parseFloat(zoneData.get("buildCost"));
                    }
                    if (zoneData.containsKey("manpowerProduction")) {
                        config.manpowerProduction = parseFloat(zoneData.get("manpowerProduction"));
                    }
                    if (zoneData.containsKey("eligiblePopProduction")) {
                        config.eligiblePopProduction = parseFloat(zoneData.get("eligiblePopProduction"));
                    }
                    if (zoneData.containsKey("politicalPowerProduction")) {
                        config.politicalPowerProduction = parseFloat(zoneData.get("politicalPowerProduction"));
                    }
                    if (zoneData.containsKey("researchPointsProduction")) {
                        config.researchPointsProduction = parseFloat(zoneData.get("researchPointsProduction"));
                    }
                    if (zoneData.containsKey("manpowerCost")) {
                        config.manpowerCost = parseFloat(zoneData.get("manpowerCost"));
                    }
                    if (zoneData.containsKey("eligiblePopCost")) {
                        config.eligiblePopCost = parseFloat(zoneData.get("eligiblePopCost"));
                    }
                    
                    ZoneConfig.setConfig(type, config);
                    MainRegistry.logger.info("[HFR Clowder] 已加载 " + type.getDisplayName() + " 配置");
                }
            }
            
            MainRegistry.logger.info("[HFR Clowder] 区域配置加载完成");
            
        } catch (Exception e) {
            MainRegistry.logger.error("[HFR Clowder] 区域配置加载失败", e);
        }
    }
    
    /**
     * 简单的YAML解析器
     * 支持基本的键值对和缩进结构
     */
    private static Map<String, Map<String, Object>> parseYamlFile(File file) throws IOException {
        Map<String, Map<String, Object>> result = new HashMap<String, Map<String, Object>>();
        BufferedReader reader = new BufferedReader(new FileReader(file));
        
        String line;
        String currentSection = null;
        Map<String, Object> currentMap = null;
        
        while ((line = reader.readLine()) != null) {
            // 跳过注释和空行
            if (line.trim().startsWith("#") || line.trim().isEmpty()) {
                continue;
            }
            
            // 检测顶层键（没有缩进）
            if (!line.startsWith(" ") && line.contains(":")) {
                String key = line.substring(0, line.indexOf(":")).trim();
                currentSection = key;
                currentMap = new HashMap<String, Object>();
                result.put(key, currentMap);
            }
            // 检测二级键（有缩进）
            else if (line.startsWith("  ") && line.contains(":") && currentMap != null) {
                String trimmed = line.trim();
                int colonIndex = trimmed.indexOf(":");
                if (colonIndex > 0) {
                    String key = trimmed.substring(0, colonIndex).trim();
                    String value = trimmed.substring(colonIndex + 1).trim();
                    
                    if (!value.isEmpty()) {
                        currentMap.put(key, value);
                    }
                }
            }
        }
        
        reader.close();
        return result;
    }
    
    /**
     * 解析浮点数值
     */
    private static float parseFloat(Object value) {
        if (value instanceof Number) {
            return ((Number) value).floatValue();
        }
        try {
            return Float.parseFloat(value.toString());
        } catch (NumberFormatException e) {
            return 0.0f;
        }
    }
    
    /**
     * 解析整数值
     */
    private static int parseInt(Object value) {
        if (value instanceof Number) {
            return ((Number) value).intValue();
        }
        try {
            return Integer.parseInt(value.toString());
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
