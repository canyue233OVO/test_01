package com.hfr.clowder;

/**
 * 区域类型枚举
 * 定义了派系可以宣称的各种功能区域类型
 */
public enum ZoneType {
    /** 居民区：产出人力和适役人口 */
    RESIDENTIAL("居民区", "residential"),
    /** 矿产区：消耗人力，产出矿物 */
    MINING("矿产区", "mining"),
    /** 行政区：产出人力和政治点数 */
    ADMINISTRATIVE("行政区", "administrative"),
    /** 工业区：可建造工厂 */
    INDUSTRIAL("工业区", "industrial"),
    /** 科研区：消耗适役人口，产出科研点数 */
    RESEARCH("科研区", "research");
    
    private final String displayName;
    private final String configKey;
    
    ZoneType(String displayName, String configKey) {
        this.displayName = displayName;
        this.configKey = configKey;
    }
    
    public String getDisplayName() {
        return displayName;
    }
    
    public String getConfigKey() {
        return configKey;
    }
    
    public static ZoneType fromString(String str) {
        for(ZoneType type : values()) {
            if(type.name().equalsIgnoreCase(str) || 
               type.displayName.equalsIgnoreCase(str) ||
               type.configKey.equalsIgnoreCase(str)) {
                return type;
            }
        }
        return null;
    }
}
