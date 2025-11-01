# 下一步工作计划 & HQM联动机制详解

## 📊 HQM（HardcoreQuesting Mod）联动机制分析

### 🔍 当前HQM集成状态

通过代码分析，发现该mod原本设计了与HQM的深度集成，但**目前已被注释掉**。

#### 原设计的联动方式：

1. **团队系统同步**
```java
// 在 CommandClowder.java 中 (已注释)
public static Team getTeamByName(String name) {
    List<Team> teams = QuestingData.getTeams();
    for (Team a : teams)
        if (a != null && a.name != null && a.getName().equals(name))
            return a;
    return null;
}
```
- Clowder派系名称 ↔ HQM Team名称
- 当玩家加入Clowder时，自动加入对应的HQM Team

2. **声望系统同步**
```java
// 在 Clowder.java 的 addPrestige 方法中 (已注释)
if(Loader.isModLoaded("hqm")) {
    prestige = Math.min(prestige, prestigeCap);
    CommandClowder.getTeamByName(name).setReputation(0, (int) prestige);
    // Clowder的prestige值会同步到HQM的Reputation系统
}
```
- Clowder的Prestige（声望） → HQM的Reputation（声誉）
- 实时同步，Clowder获得声望时，HQM声誉也增加

3. **任务系统联动**（推测）
- HQM任务完成可能会奖励Clowder声望
- Clowder的战争胜利可能会作为HQM任务目标
- 派系领土控制可能触发HQM任务进度

### 💡 为什么被注释掉？

可能原因：
1. **依赖问题** - HQM可能不是必需依赖，避免强制要求
2. **版本兼容** - HQM API可能在1.7.10的不同版本间有变化
3. **性能考虑** - 频繁同步可能影响性能
4. **开发阶段** - 功能可能还在测试中

---

## 🎯 接下来的工作优先级

### ⭐ 第一优先级：让现有系统可用（无需GUI）

#### 1. 实现命令系统（2-3小时）
**目标**：通过命令让所有新功能可测试

创建文件：`src/main/java/com/hfr/command/CommandClowderExtended.java`

```java
package com.hfr.command;

import com.hfr.clowder.*;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;

public class CommandClowderExtended {
    
    // 区块宣称命令
    public static void cmdClaim(ICommandSender sender, String zoneTypeName) {
        // 实现区块宣称逻辑
    }
    
    // 查看派系状态
    public static void cmdStatus(ICommandSender sender) {
        EntityPlayer player = (EntityPlayer) sender;
        Clowder clowder = Clowder.getClowderFromPlayer(player);
        
        if (clowder == null) {
            player.addChatMessage(new ChatComponentText(
                EnumChatFormatting.RED + "你不属于任何派系！"));
            return;
        }
        
        // 显示详细状态
        player.addChatMessage(new ChatComponentText(
            EnumChatFormatting.GOLD + "=== " + clowder.name + " 派系状态 ==="));
        
        if (clowder.populationSystem != null) {
            player.addChatMessage(new ChatComponentText(
                EnumChatFormatting.GREEN + "总人口: " + 
                clowder.populationSystem.getTotalPopulation()));
            player.addChatMessage(new ChatComponentText(
                EnumChatFormatting.GREEN + "人力: " + 
                clowder.populationSystem.getManpower()));
            player.addChatMessage(new ChatComponentText(
                EnumChatFormatting.GREEN + "适役人口: " + 
                clowder.populationSystem.getRecruitablePopulation()));
        }
        
        player.addChatMessage(new ChatComponentText(
            EnumChatFormatting.BLUE + "政治点数: " + 
            clowder.getPoliticalPoints()));
        
        player.addChatMessage(new ChatComponentText(
            EnumChatFormatting.AQUA + "金钱: " + 
            clowder.getMoney()));
        
        // 显示已宣称的区块统计
        if (clowder.chunkManager != null) {
            player.addChatMessage(new ChatComponentText(
                EnumChatFormatting.YELLOW + "--- 领土统计 ---"));
            player.addChatMessage(new ChatComponentText(
                EnumChatFormatting.YELLOW + "居民区: " + 
                clowder.chunkManager.getChunkCountByType(ZoneType.RESIDENTIAL)));
            player.addChatMessage(new ChatComponentText(
                EnumChatFormatting.YELLOW + "行政区: " + 
                clowder.chunkManager.getChunkCountByType(ZoneType.ADMINISTRATIVE)));
            player.addChatMessage(new ChatComponentText(
                EnumChatFormatting.YELLOW + "矿产区: " + 
                clowder.chunkManager.getChunkCountByType(ZoneType.MINING)));
            player.addChatMessage(new ChatComponentText(
                EnumChatFormatting.YELLOW + "科研区: " + 
                clowder.chunkManager.getChunkCountByType(ZoneType.RESEARCH)));
            player.addChatMessage(new ChatComponentText(
                EnumChatFormatting.YELLOW + "工业区: " + 
                clowder.chunkManager.getChunkCountByType(ZoneType.INDUSTRIAL)));
        }
        
        // 显示工厂统计
        if (clowder.productionSystem != null) {
            player.addChatMessage(new ChatComponentText(
                EnumChatFormatting.LIGHT_PURPLE + "--- 生产能力 ---"));
            player.addChatMessage(new ChatComponentText(
                EnumChatFormatting.LIGHT_PURPLE + "总生产槽位: " + 
                clowder.productionSystem.getTotalProductionSlots() + 
                " (已用: " + clowder.productionSystem.getUsedProductionSlots() + ")"));
        }
        
        // 显示研究进度
        if (clowder.techTreeSystem != null && 
            clowder.techTreeSystem.getResearchingTech() != null) {
            player.addChatMessage(new ChatComponentText(
                EnumChatFormatting.DARK_PURPLE + "--- 当前研究 ---"));
            player.addChatMessage(new ChatComponentText(
                EnumChatFormatting.DARK_PURPLE + "科技: " + 
                clowder.techTreeSystem.getResearchingTech() + 
                " (" + String.format("%.1f", clowder.techTreeSystem.getResearchProgress()) + "%)"));
        }
    }
    
    // 国策列表命令
    public static void cmdListPolicies(ICommandSender sender) {
        // 列出所有可用国策
    }
    
    // 解锁国策命令
    public static void cmdUnlockPolicy(ICommandSender sender, String policyId) {
        // 解锁国策
    }
    
    // 激活决议命令
    public static void cmdActivateDecision(ICommandSender sender, String decisionId) {
        // 激活决议
    }
    
    // 开始研究命令
    public static void cmdResearch(ICommandSender sender, String techId) {
        // 开始研究科技
    }
    
    // 添加生产命令
    public static void cmdProduce(ICommandSender sender, String productionId, int quantity) {
        // 添加生产任务
    }
    
    // 查看仓库内容
    public static void cmdStorehouseList(ICommandSender sender) {
        EntityPlayer player = (EntityPlayer) sender;
        Clowder clowder = Clowder.getClowderFromPlayer(player);
        
        if (clowder == null || clowder.storehouse == null) {
            player.addChatMessage(new ChatComponentText(
                EnumChatFormatting.RED + "你不属于任何派系！"));
            return;
        }
        
        player.addChatMessage(new ChatComponentText(
            EnumChatFormatting.GOLD + "=== 派系仓库内容 ==="));
        
        java.util.List<String> summary = clowder.storehouse.getInventorySummary();
        if (summary.isEmpty()) {
            player.addChatMessage(new ChatComponentText(
                EnumChatFormatting.GRAY + "仓库是空的"));
        } else {
            for (String item : summary) {
                player.addChatMessage(new ChatComponentText(
                    EnumChatFormatting.WHITE + item));
            }
        }
    }
}
```

然后在 `CommandClowder.java` 的 `processCommand` 方法中添加这些命令的调用。

#### 2. 服务器Tick处理器（1小时）
**目标**：让系统自动更新

创建文件：`src/main/java/com/hfr/handler/ClowderTickHandler.java`

```java
package com.hfr.handler;

import com.hfr.clowder.Clowder;
import com.hfr.data.ClowderData;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.World;

/**
 * Clowder系统的定时更新处理器
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
        
        // 每秒更新一次
        if (++tickCounter >= 20) {
            tickCounter = 0;
            updateEverySecond(world);
        }
        
        // 每10秒更新一次
        if (++slowTickCounter >= 200) {
            slowTickCounter = 0;
            updateEveryTenSeconds(world);
        }
    }
    
    /**
     * 每秒更新
     */
    private void updateEverySecond(World world) {
        for (Clowder clowder : Clowder.clowders) {
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
     * 每10秒更新（减少性能开销）
     */
    private void updateEveryTenSeconds(World world) {
        boolean needsSave = false;
        
        for (Clowder clowder : Clowder.clowders) {
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
```

然后在 `MainRegistry.java` 的 `init` 方法中注册：
```java
FMLCommonHandler.instance().bus().register(new ClowderTickHandler());
```

#### 3. 配置初始化（15分钟）
在 `MainRegistry.java` 的 `preInit` 方法中添加：
```java
// 初始化Clowder配置系统
com.hfr.config.SimpleConfigHandler.init(event.getModConfigurationDirectory());
```

---

### ⭐⭐ 第二优先级：HQM集成恢复（可选，2-3小时）

#### 方案A：动态集成（推荐）

创建 HQM 适配器类：

```java
package com.hfr.compat;

import com.hfr.clowder.Clowder;
import cpw.mods.fml.common.Loader;
import net.minecraft.world.World;

/**
 * HQM（HardcoreQuesting）兼容层
 * 仅在HQM存在时启用
 */
public class HQMCompat {
    
    private static boolean hqmLoaded = false;
    private static boolean initialized = false;
    
    /**
     * 初始化HQM兼容
     */
    public static void init() {
        if (initialized) return;
        
        hqmLoaded = Loader.isModLoaded("HardcoreQuesting");
        
        if (hqmLoaded) {
            System.out.println("[Clowder] 检测到 HardcoreQuesting Mod，启用集成功能");
        }
        
        initialized = true;
    }
    
    /**
     * 同步Clowder声望到HQM声誉
     */
    public static void syncPrestigeToReputation(Clowder clowder, World world) {
        if (!hqmLoaded || clowder == null) return;
        
        try {
            // 使用反射调用HQM API，避免硬依赖
            Class<?> teamClass = Class.forName("hardcorequesting.Team");
            Class<?> questingDataClass = Class.forName("hardcorequesting.QuestingData");
            
            // 获取HQM Team
            Object[] teams = (Object[]) questingDataClass.getMethod("getTeams").invoke(null);
            Object hqmTeam = null;
            
            for (Object team : teams) {
                String teamName = (String) teamClass.getMethod("getName").invoke(team);
                if (teamName != null && teamName.equals(clowder.name)) {
                    hqmTeam = team;
                    break;
                }
            }
            
            if (hqmTeam != null) {
                // 设置声誉值
                int reputationValue = (int) Math.min(clowder.getPrestige(), 1000);
                teamClass.getMethod("setReputation", int.class, int.class)
                         .invoke(hqmTeam, 0, reputationValue);
            }
            
        } catch (Exception e) {
            System.err.println("[Clowder] HQM集成出错: " + e.getMessage());
            // 出错后禁用HQM集成
            hqmLoaded = false;
        }
    }
    
    /**
     * 创建Clowder时自动创建HQM Team
     */
    public static void createHQMTeam(Clowder clowder) {
        if (!hqmLoaded || clowder == null) return;
        
        try {
            Class<?> teamClass = Class.forName("hardcorequesting.Team");
            
            // 创建新的HQM Team
            Object newTeam = teamClass.getConstructor(String.class)
                                     .newInstance(clowder.name);
            
            // 添加领袖到Team
            Class<?> questingDataClass = Class.forName("hardcorequesting.QuestingData");
            Object leaderData = questingDataClass.getMethod("getQuestingData", String.class)
                                                 .invoke(null, clowder.leader);
            
            if (leaderData != null) {
                leaderData.getClass().getMethod("setTeam", teamClass)
                         .invoke(leaderData, newTeam);
            }
            
        } catch (Exception e) {
            System.err.println("[Clowder] 创建HQM Team失败: " + e.getMessage());
        }
    }
    
    /**
     * 玩家加入Clowder时加入HQM Team
     */
    public static void joinHQMTeam(String playerName, Clowder clowder) {
        if (!hqmLoaded || clowder == null) return;
        
        try {
            Class<?> questingDataClass = Class.forName("hardcorequesting.QuestingData");
            Object playerData = questingDataClass.getMethod("getQuestingData", String.class)
                                                 .invoke(null, playerName);
            
            if (playerData != null) {
                // 找到对应的HQM Team
                Object[] teams = (Object[]) questingDataClass.getMethod("getTeams").invoke(null);
                for (Object team : teams) {
                    String teamName = (String) team.getClass().getMethod("getName").invoke(team);
                    if (teamName != null && teamName.equals(clowder.name)) {
                        playerData.getClass().getMethod("setTeam", team.getClass())
                                 .invoke(playerData, team);
                        break;
                    }
                }
            }
            
        } catch (Exception e) {
            System.err.println("[Clowder] 加入HQM Team失败: " + e.getMessage());
        }
    }
    
    /**
     * 检查HQM是否已加载
     */
    public static boolean isHQMLoaded() {
        return hqmLoaded;
    }
}
```

然后在相应位置调用：

1. 在 `MainRegistry.preInit` 中初始化：
```java
HQMCompat.init();
```

2. 在 `Clowder.addPrestige` 方法中添加：
```java
// 同步到HQM
HQMCompat.syncPrestigeToReputation(this, world);
```

3. 在 `Clowder.createClowder` 方法中添加：
```java
// 创建对应的HQM Team
HQMCompat.createHQMTeam(c);
```

4. 在玩家加入Clowder时调用：
```java
HQMCompat.joinHQMTeam(playerName, clowder);
```

#### 方案B：配置开关（最简单）

在配置文件中添加开关，让服主决定是否启用HQM集成：
```json
{
  "hqm_integration": {
    "enabled": false,
    "sync_prestige": true,
    "auto_create_teams": true
  }
}
```

---

### ⭐⭐⭐ 第三优先级：基础GUI（3-4小时）

简单的文本列表GUI就够用了，不需要花哨的图形界面。

#### 1. 派系状态GUI
显示派系的所有关键信息（人口、资源、科技等）

#### 2. 简单的国策/决议/科技选择GUI
- 使用 `GuiScreen` 
- 按钮列表
- 滚动视图

---

## 🚀 快速开始（今天就能测试）

### 立即可做的事情（无需编译）：

1. **配置文件测试**
   运行游戏一次，会在 `config/clowder/` 生成配置文件
   编辑 `basic_config.json` 测试不同的数值

2. **数据结构测试**
   使用NBTExplorer查看保存的Clowder数据，确认新系统正确保存

### 30分钟快速测试版本：

只需完成第一优先级的第1和第2项：
1. 添加命令到CommandClowder
2. 添加Tick处理器
3. 初始化配置

这样就能：
- 用命令宣称区块
- 看到资源自动产出
- 测试所有核心功能

---

## 📝 测试清单

完成第一优先级后，可以测试：

```bash
# 创建派系（已有功能）
/c create 测试派系

# 查看状态（新功能）
/c status

# 宣称当前区块为居民区
/c claim 居民区

# 等待10秒后再次查看状态，应该能看到人口增加
/c status

# 查看仓库内容
/c storehouse list

# 建造工厂
/c factory military

# 查看生产槽位
/c status
```

---

## 💬 关于HQM集成的建议

### 我的推荐：

1. **短期**：先不管HQM，专注核心功能
   - HQM不是必需的
   - 核心系统本身已经很完整
   - 可以后续作为可选功能添加

2. **中期**：实现动态集成（方案A）
   - 使用反射，无硬依赖
   - 对没有HQM的服务器无影响
   - 有HQM时自动启用

3. **长期**：考虑更深度的集成
   - 任务系统联动（完成任务奖励声望）
   - 任务目标包含Clowder相关内容
   - 声誉等级影响Clowder能力

### HQM集成的价值：

**优点**：
- 任务引导玩家了解派系系统
- 任务奖励增加游戏动力
- 多mod联动，提升整合包质量

**缺点**：
- 增加复杂度
- 需要额外维护
- 可能产生平衡性问题

### 结论：

**先实现核心功能，HQM集成作为锦上添花的功能慢慢做。**

核心系统本身已经非常强大和完整，不依赖HQM也能提供优秀的游戏体验。

---

## 🎯 总结：立即开始的3件事

1. **复制粘贴 `CommandClowderExtended` 到项目中**
2. **复制粘贴 `ClowderTickHandler` 到项目中** 
3. **在 `MainRegistry` 中添加初始化代码**

完成这3步后，编译运行，就能测试所有新系统了！

需要我帮你实现这3个文件的完整代码吗？
