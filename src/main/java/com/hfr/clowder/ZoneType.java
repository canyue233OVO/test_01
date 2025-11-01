package com.hfr.clowder;

/**
 * 区块宣称的区域类型枚举
 * 每种区域类型有不同的功能和产出
 */
public enum ZoneType {
	
	/** 居民区 - 产出人力和适役人口 */
	RESIDENTIAL("residential", "居民区", 0x4CAF50),
	
	/** 行政区 - 产出人力和政治点数 */
	ADMINISTRATIVE("administrative", "行政区", 0x2196F3),
	
	/** 矿产区 - 消耗人力，产出矿物 */
	MINING("mining", "矿产区", 0x795548),
	
	/** 科研区 - 消耗适役人口，产出科研点 */
	RESEARCH("research", "科研区", 0x9C27B0),
	
	/** 工业区 - 可建造军用和民用工厂 */
	INDUSTRIAL("industrial", "工业区", 0xFF5722),
	
	/** 未宣称 */
	NONE("none", "未宣称", 0x808080);
	
	private final String id;
	private final String displayName;
	private final int color;
	
	ZoneType(String id, String displayName, int color) {
		this.id = id;
		this.displayName = displayName;
		this.color = color;
	}
	
	public String getId() {
		return id;
	}
	
	public String getDisplayName() {
		return displayName;
	}
	
	public int getColor() {
		return color;
	}
	
	/**
	 * 从ID字符串获取区域类型
	 */
	public static ZoneType fromId(String id) {
		for (ZoneType type : values()) {
			if (type.id.equalsIgnoreCase(id)) {
				return type;
			}
		}
		return NONE;
	}
	
	/**
	 * 从显示名称获取区域类型
	 */
	public static ZoneType fromDisplayName(String name) {
		for (ZoneType type : values()) {
			if (type.displayName.equals(name)) {
				return type;
			}
		}
		return NONE;
	}
}
