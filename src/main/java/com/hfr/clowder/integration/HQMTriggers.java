package com.hfr.clowder.integration;

import com.hfr.clowder.Clowder;
import com.hfr.clowder.ZoneType;
import com.hfr.main.MainRegistry;
import cpw.mods.fml.common.Loader;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;

/**
 * HQM (Hardcore Questing Mode) 任务触发器
 * 当派系完成特定目标时触发HQM任务
 * 
 * 注意：此类设计为兼容模式，即使没有安装HQM也不会报错
 */
public class HQMTriggers {
    
    private static boolean hqmAvailable = false;
    
    static {
        // 检查HQM是否加载
        hqmAvailable = Loader.isModLoaded("HardcoreQuesting");
        if (hqmAvailable) {
            MainRegistry.logger.info("[HFR Clowder] HQM检测到，任务触发器已启用");
        } else {
            MainRegistry.logger.info("[HFR Clowder] HQM未检测到，任务触发器已禁用");
        }
    }
    
    /**
     * 检查HQM是否可用
     */
    public static boolean isHQMAvailable() {
        return hqmAvailable;
    }
    
    /**
     * 玩家创建派系时触发
     */
    public static void onClowderCreated(EntityPlayer player, String clowderName) {
        if (!hqmAvailable) return;
        
        try {
            completeTask(player, "create_clowder");
            MainRegistry.logger.info("[HFR Clowder HQM] " + player.getDisplayName() + " 完成任务: 创建派系");
        } catch (Exception e) {
            MainRegistry.logger.warn("[HFR Clowder HQM] 触发失败: create_clowder", e);
        }
    }
    
    /**
     * 玩家宣称第一个区域时触发
     */
    public static void onFirstZoneClaimed(EntityPlayer player, ZoneType type) {
        if (!hqmAvailable) return;
        
        try {
            completeTask(player, "first_zone");
            
            // 根据区域类型触发特定任务
            switch(type) {
                case RESIDENTIAL:
                    completeTask(player, "residential_zone");
                    break;
                case MINING:
                    completeTask(player, "mining_zone");
                    break;
                case ADMINISTRATIVE:
                    completeTask(player, "administrative_zone");
                    break;
                case INDUSTRIAL:
                    completeTask(player, "industrial_zone");
                    break;
                case RESEARCH:
                    completeTask(player, "research_zone");
                    break;
            }
            
            MainRegistry.logger.info("[HFR Clowder HQM] " + player.getDisplayName() + " 完成任务: 宣称" + type.getDisplayName());
        } catch (Exception e) {
            MainRegistry.logger.warn("[HFR Clowder HQM] 触发失败: first_zone", e);
        }
    }
    
    /**
     * 派系解锁科技时触发
     */
    public static void onTechUnlocked(Clowder clowder, String techId) {
        if (!hqmAvailable) return;
        
        try {
            // 通知所有在线成员
            for (String memberName : clowder.members) {
                EntityPlayer member = getPlayerByName(memberName);
                if (member != null) {
                    completeTask(member, "unlock_tech_" + techId);
                }
            }
            
            MainRegistry.logger.info("[HFR Clowder HQM] " + clowder.name + " 完成任务: 解锁科技 " + techId);
        } catch (Exception e) {
            MainRegistry.logger.warn("[HFR Clowder HQM] 触发失败: unlock_tech", e);
        }
    }
    
    /**
     * 派系建造工厂时触发
     */
    public static void onFactoryBuilt(EntityPlayer player, boolean isMilitary) {
        if (!hqmAvailable) return;
        
        try {
            if (isMilitary) {
                completeTask(player, "build_military_factory");
            } else {
                completeTask(player, "build_civilian_factory");
            }
            
            MainRegistry.logger.info("[HFR Clowder HQM] " + player.getDisplayName() + " 完成任务: 建造" + (isMilitary ? "军用" : "民用") + "工厂");
        } catch (Exception e) {
            MainRegistry.logger.warn("[HFR Clowder HQM] 触发失败: build_factory", e);
        }
    }
    
    /**
     * 派系生产奇迹武器时触发
     */
    public static void onWonderWeaponProduced(Clowder clowder, String weaponId) {
        if (!hqmAvailable) return;
        
        try {
            // 通知所有在线成员
            for (String memberName : clowder.members) {
                EntityPlayer member = getPlayerByName(memberName);
                if (member != null) {
                    completeTask(member, "produce_" + weaponId);
                }
            }
            
            MainRegistry.logger.info("[HFR Clowder HQM] " + clowder.name + " 完成任务: 生产奇迹武器 " + weaponId);
        } catch (Exception e) {
            MainRegistry.logger.warn("[HFR Clowder HQM] 触发失败: produce_wonder_weapon", e);
        }
    }
    
    /**
     * 派系激活决议时触发
     */
    public static void onDecisionActivated(Clowder clowder, String decisionId) {
        if (!hqmAvailable) return;
        
        try {
            for (String memberName : clowder.members) {
                EntityPlayer member = getPlayerByName(memberName);
                if (member != null) {
                    completeTask(member, "activate_decision_" + decisionId);
                }
            }
            
            MainRegistry.logger.info("[HFR Clowder HQM] " + clowder.name + " 完成任务: 激活决议 " + decisionId);
        } catch (Exception e) {
            MainRegistry.logger.warn("[HFR Clowder HQM] 触发失败: activate_decision", e);
        }
    }
    
    /**
     * 派系选择国策时触发
     */
    public static void onPolicyUnlocked(Clowder clowder, String policyId) {
        if (!hqmAvailable) return;
        
        try {
            for (String memberName : clowder.members) {
                EntityPlayer member = getPlayerByName(memberName);
                if (member != null) {
                    completeTask(member, "unlock_policy_" + policyId);
                }
            }
            
            MainRegistry.logger.info("[HFR Clowder HQM] " + clowder.name + " 完成任务: 解锁国策 " + policyId);
        } catch (Exception e) {
            MainRegistry.logger.warn("[HFR Clowder HQM] 触发失败: unlock_policy", e);
        }
    }
    
    /**
     * 完成HQM任务
     * 注意：具体实现需要根据HQM版本调整
     */
    private static void completeTask(EntityPlayer player, String taskId) {
        if (!hqmAvailable) return;
        
        try {
            // HQM API调用示例（需要根据实际HQM版本调整）
            // QuestingData data = QuestingData.getUserData(player);
            // Quest quest = QuestLine.getQuest(taskId);
            // if (quest != null) {
            //     quest.completeQuest(player);
            // }
            
            // 当前为占位实现，记录日志
            MainRegistry.logger.debug("[HFR Clowder HQM] 尝试完成任务: " + taskId + " 玩家: " + player.getDisplayName());
        } catch (Exception e) {
            MainRegistry.logger.warn("[HFR Clowder HQM] 任务完成失败: " + taskId, e);
        }
    }
    
    /**
     * 根据名称获取在线玩家
     */
    private static EntityPlayer getPlayerByName(String name) {
        MinecraftServer server = MinecraftServer.getServer();
        if (server != null) {
            return server.getConfigurationManager().func_152612_a(name);
        }
        return null;
    }
}
