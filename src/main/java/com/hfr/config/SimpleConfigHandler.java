package com.hfr.config;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.hfr.clowder.ZoneType;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * 简化的配置处理类（使用JSON替代YAML）
 * 由于项目可能没有SnakeYAML依赖，使用Gson代替
 */
public class SimpleConfigHandler {
	
	private static final Random random = new Random();
	private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();
	
	// ===== 人口系统配置 =====
	public static float basePopulationConversionRate = 0.1f;
	public static float populationItemProductionChance = 0.1f;
	private static List<ItemStack> populationItemPool = new ArrayList<>();
	
	// ===== 区域系统配置 =====
	public static int residentialManpowerPerHour = 10;
	public static int residentialPopulationPerHour = 5;
	public static int residentialMaintenanceCost = 100;
	
	public static int administrativeManpowerPerHour = 5;
	public static int administrativePoliticalPointsPerHour = 1;
	public static int administrativeMaintenanceCost = 200;
	
	public static int miningManpowerCost = 20;
	public static int miningProductionTime = 3600;
	private static Map<String, Integer> miningOutputItems = new HashMap<>();
	
	public static int researchPopulationCost = 10;
	public static int researchPointsPerHour = 5;
	public static int researchMaintenanceCost = 300;
	
	public static int militaryFactoryCost = 10000;
	public static int civilianFactoryCost = 5000;
	public static int factoriesPerProductionSlot = 5;
	
	// ===== 国策、决议、科技树、生产配置 =====
	private static Map<String, Map<String, Object>> policies = new HashMap<>();
	private static Map<String, Map<String, Object>> decisions = new HashMap<>();
	private static Map<String, Map<String, Object>> technologies = new HashMap<>();
	private static Map<String, Map<String, Object>> productions = new HashMap<>();
	
	/**
	 * 初始化配置
	 */
	public static void init(File configDir) {
		File clowderConfigDir = new File(configDir, "clowder");
		if (!clowderConfigDir.exists()) {
			clowderConfigDir.mkdirs();
		}
		
		// 加载各个配置文件
		loadBasicConfig(new File(clowderConfigDir, "basic_config.json"));
		loadPoliciesConfig(new File(clowderConfigDir, "policies.json"));
		loadDecisionsConfig(new File(clowderConfigDir, "decisions.json"));
		loadTechnologiesConfig(new File(clowderConfigDir, "technologies.json"));
		loadProductionsConfig(new File(clowderConfigDir, "productions.json"));
		
		// 初始化默认值
		initializeDefaults();
	}
	
	/**
	 * 加载基础配置
	 */
	@SuppressWarnings("unchecked")
	private static void loadBasicConfig(File file) {
		try {
			if (!file.exists()) {
				createDefaultBasicConfig(file);
			}
			
			FileReader reader = new FileReader(file);
			Map<String, Object> config = gson.fromJson(reader, new TypeToken<Map<String, Object>>(){}.getType());
			reader.close();
			
			if (config != null) {
				// 加载人口配置
				if (config.containsKey("population")) {
					Map<String, Object> pop = (Map<String, Object>) config.get("population");
					basePopulationConversionRate = ((Number) pop.getOrDefault("conversion_rate", 0.1)).floatValue();
					populationItemProductionChance = ((Number) pop.getOrDefault("item_production_chance", 0.1)).floatValue();
				}
				
				// 加载区域配置
				if (config.containsKey("zones")) {
					Map<String, Object> zones = (Map<String, Object>) config.get("zones");
					loadZoneConfig(zones);
				}
			}
			
		} catch (Exception e) {
			System.err.println("[Clowder] 无法加载基础配置: " + e.getMessage());
		}
	}
	
	@SuppressWarnings("unchecked")
	private static void loadZoneConfig(Map<String, Object> zones) {
		if (zones.containsKey("residential")) {
			Map<String, Object> res = (Map<String, Object>) zones.get("residential");
			residentialManpowerPerHour = ((Number) res.getOrDefault("manpower_per_hour", 10)).intValue();
			residentialPopulationPerHour = ((Number) res.getOrDefault("population_per_hour", 5)).intValue();
			residentialMaintenanceCost = ((Number) res.getOrDefault("maintenance_cost", 100)).intValue();
		}
		
		if (zones.containsKey("administrative")) {
			Map<String, Object> admin = (Map<String, Object>) zones.get("administrative");
			administrativeManpowerPerHour = ((Number) admin.getOrDefault("manpower_per_hour", 5)).intValue();
			administrativePoliticalPointsPerHour = ((Number) admin.getOrDefault("political_points_per_hour", 1)).intValue();
			administrativeMaintenanceCost = ((Number) admin.getOrDefault("maintenance_cost", 200)).intValue();
		}
		
		if (zones.containsKey("mining")) {
			Map<String, Object> mining = (Map<String, Object>) zones.get("mining");
			miningManpowerCost = ((Number) mining.getOrDefault("manpower_cost", 20)).intValue();
			miningProductionTime = ((Number) mining.getOrDefault("production_time", 3600)).intValue();
			
			if (mining.containsKey("outputs")) {
				Map<String, Object> outputs = (Map<String, Object>) mining.get("outputs");
				for (Map.Entry<String, Object> entry : outputs.entrySet()) {
					miningOutputItems.put(entry.getKey(), ((Number) entry.getValue()).intValue());
				}
			}
		}
		
		if (zones.containsKey("research")) {
			Map<String, Object> research = (Map<String, Object>) zones.get("research");
			researchPopulationCost = ((Number) research.getOrDefault("population_cost", 10)).intValue();
			researchPointsPerHour = ((Number) research.getOrDefault("research_points_per_hour", 5)).intValue();
			researchMaintenanceCost = ((Number) research.getOrDefault("maintenance_cost", 300)).intValue();
		}
		
		if (zones.containsKey("industrial")) {
			Map<String, Object> industrial = (Map<String, Object>) zones.get("industrial");
			militaryFactoryCost = ((Number) industrial.getOrDefault("military_factory_cost", 10000)).intValue();
			civilianFactoryCost = ((Number) industrial.getOrDefault("civilian_factory_cost", 5000)).intValue();
			factoriesPerProductionSlot = ((Number) industrial.getOrDefault("factories_per_slot", 5)).intValue();
		}
	}
	
	@SuppressWarnings("unchecked")
	private static void loadPoliciesConfig(File file) {
		try {
			if (!file.exists()) {
				createDefaultPoliciesConfig(file);
			}
			
			FileReader reader = new FileReader(file);
			Map<String, Object> config = gson.fromJson(reader, new TypeToken<Map<String, Object>>(){}.getType());
			reader.close();
			
			if (config != null && config.containsKey("policies")) {
				policies = (Map<String, Map<String, Object>>) config.get("policies");
			}
			
		} catch (Exception e) {
			System.err.println("[Clowder] 无法加载国策配置: " + e.getMessage());
		}
	}
	
	@SuppressWarnings("unchecked")
	private static void loadDecisionsConfig(File file) {
		try {
			if (!file.exists()) {
				createDefaultDecisionsConfig(file);
			}
			
			FileReader reader = new FileReader(file);
			Map<String, Object> config = gson.fromJson(reader, new TypeToken<Map<String, Object>>(){}.getType());
			reader.close();
			
			if (config != null && config.containsKey("decisions")) {
				decisions = (Map<String, Map<String, Object>>) config.get("decisions");
			}
			
		} catch (Exception e) {
			System.err.println("[Clowder] 无法加载决议配置: " + e.getMessage());
		}
	}
	
	@SuppressWarnings("unchecked")
	private static void loadTechnologiesConfig(File file) {
		try {
			if (!file.exists()) {
				createDefaultTechnologiesConfig(file);
			}
			
			FileReader reader = new FileReader(file);
			Map<String, Object> config = gson.fromJson(reader, new TypeToken<Map<String, Object>>(){}.getType());
			reader.close();
			
			if (config != null && config.containsKey("technologies")) {
				technologies = (Map<String, Map<String, Object>>) config.get("technologies");
			}
			
		} catch (Exception e) {
			System.err.println("[Clowder] 无法加载科技树配置: " + e.getMessage());
		}
	}
	
	@SuppressWarnings("unchecked")
	private static void loadProductionsConfig(File file) {
		try {
			if (!file.exists()) {
				createDefaultProductionsConfig(file);
			}
			
			FileReader reader = new FileReader(file);
			Map<String, Object> config = gson.fromJson(reader, new TypeToken<Map<String, Object>>(){}.getType());
			reader.close();
			
			if (config != null && config.containsKey("productions")) {
				productions = (Map<String, Map<String, Object>>) config.get("productions");
			}
			
		} catch (Exception e) {
			System.err.println("[Clowder] 无法加载生产配置: " + e.getMessage());
		}
	}
	
	// ===== 创建默认配置文件 =====
	
	private static void createDefaultBasicConfig(File file) {
		try {
			Map<String, Object> config = new HashMap<>();
			
			// 人口配置
			Map<String, Object> population = new HashMap<>();
			population.put("conversion_rate", 0.1);
			population.put("item_production_chance", 0.1);
			config.put("population", population);
			
			// 区域配置
			Map<String, Object> zones = new HashMap<>();
			
			Map<String, Object> residential = new HashMap<>();
			residential.put("manpower_per_hour", 10);
			residential.put("population_per_hour", 5);
			residential.put("maintenance_cost", 100);
			zones.put("residential", residential);
			
			Map<String, Object> administrative = new HashMap<>();
			administrative.put("manpower_per_hour", 5);
			administrative.put("political_points_per_hour", 1);
			administrative.put("maintenance_cost", 200);
			zones.put("administrative", administrative);
			
			Map<String, Object> mining = new HashMap<>();
			mining.put("manpower_cost", 20);
			mining.put("production_time", 3600);
			Map<String, Integer> outputs = new HashMap<>();
			outputs.put("minecraft:iron_ore", 10);
			outputs.put("minecraft:coal", 15);
			outputs.put("minecraft:gold_ore", 5);
			mining.put("outputs", outputs);
			zones.put("mining", mining);
			
			Map<String, Object> research = new HashMap<>();
			research.put("population_cost", 10);
			research.put("research_points_per_hour", 5);
			research.put("maintenance_cost", 300);
			zones.put("research", research);
			
			Map<String, Object> industrial = new HashMap<>();
			industrial.put("military_factory_cost", 10000);
			industrial.put("civilian_factory_cost", 5000);
			industrial.put("factories_per_slot", 5);
			zones.put("industrial", industrial);
			
			config.put("zones", zones);
			
			FileWriter writer = new FileWriter(file);
			gson.toJson(config, writer);
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void createDefaultPoliciesConfig(File file) {
		try {
			Map<String, Object> config = new HashMap<>();
			Map<String, Map<String, Object>> policyMap = new HashMap<>();
			
			Map<String, Object> policy1 = new HashMap<>();
			policy1.put("name", "工业优先");
			policy1.put("description", "提升工厂效率20%");
			policy1.put("cost", 50);
			policy1.put("factory_efficiency_modifier", 1.2);
			policyMap.put("industrial_priority", policy1);
			
			Map<String, Object> policy2 = new HashMap<>();
			policy2.put("name", "科研加速");
			policy2.put("description", "提升科研速度30%");
			policy2.put("cost", 75);
			policy2.put("research_speed_modifier", 1.3);
			policyMap.put("research_acceleration", policy2);
			
			config.put("policies", policyMap);
			
			FileWriter writer = new FileWriter(file);
			gson.toJson(config, writer);
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void createDefaultDecisionsConfig(File file) {
		try {
			Map<String, Object> config = new HashMap<>();
			Map<String, Map<String, Object>> decisionMap = new HashMap<>();
			
			Map<String, Object> decision1 = new HashMap<>();
			decision1.put("name", "总动员");
			decision1.put("description", "提高50%人力产出，持续7天");
			decision1.put("cost", 100);
			decision1.put("duration", 168);
			decision1.put("manpower_modifier", 1.5);
			decisionMap.put("total_mobilization", decision1);
			
			Map<String, Object> decision2 = new HashMap<>();
			decision2.put("name", "战时经济");
			decision2.put("description", "提升30%工厂产能，持续3天");
			decision2.put("cost", 75);
			decision2.put("duration", 72);
			decision2.put("factory_output_modifier", 1.3);
			decisionMap.put("war_economy", decision2);
			
			config.put("decisions", decisionMap);
			
			FileWriter writer = new FileWriter(file);
			gson.toJson(config, writer);
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void createDefaultTechnologiesConfig(File file) {
		try {
			Map<String, Object> config = new HashMap<>();
			Map<String, Map<String, Object>> techMap = new HashMap<>();
			
			Map<String, Object> tech1 = new HashMap<>();
			tech1.put("name", "基础工业");
			tech1.put("description", "解锁基础工厂建造");
			tech1.put("cost", 100);
			tech1.put("factory_slots", 1);
			techMap.put("basic_industry", tech1);
			
			Map<String, Object> tech2 = new HashMap<>();
			tech2.put("name", "高级武器");
			tech2.put("description", "解锁高级武器生产");
			tech2.put("cost", 200);
			List<String> prereqs = new ArrayList<>();
			prereqs.add("basic_industry");
			tech2.put("prerequisites", prereqs);
			techMap.put("advanced_weapons", tech2);
			
			config.put("technologies", techMap);
			
			FileWriter writer = new FileWriter(file);
			gson.toJson(config, writer);
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void createDefaultProductionsConfig(File file) {
		try {
			Map<String, Object> config = new HashMap<>();
			Map<String, Map<String, Object>> prodMap = new HashMap<>();
			
			Map<String, Object> prod1 = new HashMap<>();
			prod1.put("name", "步枪生产");
			prod1.put("output_item", "flansmod:ak47");
			prod1.put("output_amount", 10);
			prod1.put("production_time", 7200);
			prod1.put("factory_type", "military");
			Map<String, Integer> inputs = new HashMap<>();
			inputs.put("minecraft:iron_ingot", 50);
			inputs.put("minecraft:gunpowder", 20);
			prod1.put("input_items", inputs);
			prodMap.put("rifle_production", prod1);
			
			config.put("productions", prodMap);
			
			FileWriter writer = new FileWriter(file);
			gson.toJson(config, writer);
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 初始化默认值
	 */
	private static void initializeDefaults() {
		// 初始化人口物品池
		if (populationItemPool.isEmpty()) {
			populationItemPool.add(new ItemStack((Item) Item.itemRegistry.getObject("minecraft:iron_ingot"), 5));
			populationItemPool.add(new ItemStack((Item) Item.itemRegistry.getObject("minecraft:gold_ingot"), 2));
			populationItemPool.add(new ItemStack((Item) Item.itemRegistry.getObject("minecraft:diamond"), 1));
		}
		
		// 初始化矿产产出
		if (miningOutputItems.isEmpty()) {
			miningOutputItems.put("minecraft:iron_ore", 10);
			miningOutputItems.put("minecraft:coal", 15);
			miningOutputItems.put("minecraft:gold_ore", 5);
		}
	}
	
	// ===== Getter方法 =====
	
	public static ItemStack getRandomPopulationItem() {
		if (populationItemPool.isEmpty()) {
			return null;
		}
		return populationItemPool.get(random.nextInt(populationItemPool.size())).copy();
	}
	
	public static Map<String, Integer> getMiningOutputItems() {
		return new HashMap<>(miningOutputItems);
	}
	
	public static Map<String, Map<String, Object>> getPolicies() {
		return policies;
	}
	
	public static Map<String, Map<String, Object>> getDecisions() {
		return decisions;
	}
	
	public static Map<String, Map<String, Object>> getTechnologies() {
		return technologies;
	}
	
	public static Map<String, Map<String, Object>> getProductions() {
		return productions;
	}
}
