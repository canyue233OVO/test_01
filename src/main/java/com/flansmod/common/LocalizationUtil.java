package com.flansmod.common;

import java.util.HashMap;
import java.util.Map;

/**
 * Flan's Mod HUD 汉化工具类
 * 提供英文到中文的翻译映射
 */
public class LocalizationUtil {
	
	private static final Map<String, String> translations = new HashMap<>();
	
	static {
		// 飞机HUD相关
		translations.put("ALT", "高度");
		translations.put("SPEED", "速度");
		translations.put("THROTTLE", "油门");
		translations.put("GEARS DOWN", "起落架放下");
		translations.put("Health", "耐久");
		translations.put("Fuel", "燃料");
		
		// 方向指示
		translations.put("E", "东");
		translations.put("W", "西");
		translations.put("S", "南");
		translations.put("N", "北");
		
		// 载具控制
		translations.put("Press", "按");
		translations.put("to dismount", "以下车");
		translations.put("to fire", "以开火");
		translations.put("to reload", "以装填");
		translations.put("to exit", "以退出");
		translations.put("to open inventory", "打开物品栏");
		translations.put("to switch seat", "切换座位");
		
		// 武器相关
		translations.put("Ammo", "弹药");
		translations.put("Rounds", "发");
		translations.put("Reloading", "装填中");
		translations.put("Empty", "空");
		translations.put("Magazine", "弹匣");
		
		// 状态信息
		translations.put("Locked", "锁定");
		translations.put("Unlocked", "解锁");
		translations.put("Ready", "就绪");
		translations.put("Repairing", "修理中");
		translations.put("Out of fuel", "燃料耗尽");
		
		// GUI相关
		translations.put("Inventory", "物品栏");
		translations.put("Crafting", "合成");
		translations.put("Repair", "修理");
		translations.put("Menu", "菜单");
		translations.put("Close", "关闭");
		translations.put("Back", "返回");
		translations.put("Next", "下一个");
		translations.put("Previous", "上一个");
		
		// 团队相关
		translations.put("Team", "队伍");
		translations.put("Join", "加入");
		translations.put("Leave", "离开");
		translations.put("Create", "创建");
		translations.put("Members", "成员");
		translations.put("Score", "分数");
		translations.put("Kills", "击杀");
		translations.put("Deaths", "死亡");
		
		// 机甲相关
		translations.put("Mecha", "机甲");
		translations.put("Arms", "手臂");
		translations.put("Legs", "腿部");
		translations.put("Core", "核心");
		translations.put("Tool", "工具");
		translations.put("Weapon", "武器");
		
		// 载具类型
		translations.put("Plane", "飞机");
		translations.put("Vehicle", "载具");
		translations.put("Tank", "坦克");
		translations.put("Car", "汽车");
		translations.put("Helicopter", "直升机");
		
		// 工作台相关
		translations.put("Flan's Workbench", "Flan工作台");
		translations.put("Paintjob Table", "涂装台");
		translations.put("Armour Box", "护甲箱");
		translations.put("Gun Box", "武器箱");
		
		// 错误信息
		translations.put("Cannot fire", "无法开火");
		translations.put("Not enough ammo", "弹药不足");
		translations.put("Overheated", "过热");
		translations.put("Jammed", "卡壳");
		
		// 按键提示
		translations.put("Hold", "按住");
		translations.put("Release", "松开");
		translations.put("Click", "点击");
		translations.put("Right Click", "右键");
		translations.put("Left Click", "左键");
		
		// 数值单位
		translations.put("km/h", "千米/小时");
		translations.put("m/s", "米/秒");
		translations.put("mph", "英里/小时");
		translations.put("ft", "英尺");
		translations.put("m", "米");
		translations.put("%", "%");
	}
	
	/**
	 * 获取翻译后的文本
	 * 如果没有找到翻译，返回原文
	 */
	public static String translate(String key) {
		return translations.getOrDefault(key, key);
	}
	
	/**
	 * 检查是否有翻译
	 */
	public static boolean hasTranslation(String key) {
		return translations.containsKey(key);
	}
	
	/**
	 * 添加自定义翻译
	 */
	public static void addTranslation(String key, String value) {
		translations.put(key, value);
	}
	
	/**
	 * 格式化文本，替换所有可翻译的部分
	 */
	public static String translateFormat(String format, Object... args) {
		String translated = translate(format);
		if (args.length > 0) {
			return String.format(translated, args);
		}
		return translated;
	}
}
