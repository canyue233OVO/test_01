package com.hfr.handler;

import com.hfr.clowder.Clowder;
import com.hfr.data.ClowderData;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.World;

/**
 * Clowder系统的定时更新处理器
 * 负责定期更新所有派系的人口、生产、区块产出等系统
 */
public class ClowderTickHandler {
    
    private int tickCounter = 0;
    private int slowTickCounter = 0;
    
    @SubscribeEvent
    public void onServerTick(TickEvent.ServerTickEvent event) {
        if (event.phase != TickEvent.Phase.END) {
            return;
        }
        
        MinecraftServer server = MinecraftServer.getServer();
        if (server == null) {
            return;
        }
        
        World world = server.worldServerForDimension(0);
        if (world == null) {
            return;
        }
        
        // 每秒更新一次（20 ticks）
        if (++tickCounter >= 20) {
            tickCounter = 0;
            updateEverySecond(world);
        }
        
        // 每10秒更新一次（200 ticks）
        if (++slowTickCounter >= 200) {
            slowTickCounter = 0;
            updateEveryTenSeconds(world);
        }
    }
    
    /**
     * 每秒更新的任务
     * 处理需要快速响应的系统
     */
    private void updateEverySecond(World world) {
        for (Clowder clowder : Clowder.clowders) {
            if (!clowder.valid()) {
                continue;
            }
            
            // 更新决议系统（移除过期的决议）
            if (clowder.decisionSystem != null) {
                clowder.decisionSystem.update();
            }
            
            // 更新生产系统（检查完成的生产任务）
            if (clowder.productionSystem != null) {
                clowder.productionSystem.update(clowder);
            }
        }
    }
    
    /**
     * 每10秒更新的任务
     * 处理计算密集型或不需要频繁更新的系统
     */
    private void updateEveryTenSeconds(World world) {
        boolean needsSave = false;
        
        for (Clowder clowder : Clowder.clowders) {
            if (!clowder.valid()) {
                continue;
            }
            
            // 更新人口系统
            if (clowder.populationSystem != null) {
                clowder.populationSystem.update(clowder);
                needsSave = true;
            }
            
            // 更新区块产出
            if (clowder.chunkManager != null) {
                clowder.chunkManager.updateChunks(clowder);
                needsSave = true;
            }
            
            // 重新计算生产槽位
            if (clowder.productionSystem != null) {
                clowder.productionSystem.calculateProductionSlots(clowder);
            }
        }
        
        // 批量保存，减少I/O操作
        if (needsSave) {
            ClowderData.getData(world).markDirty();
        }
    }
}
