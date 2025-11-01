# Clowder系统实现指南

本文档描述了已实现的系统和需要完成的集成工作。

## 已完成的核心系统

### 1. 数据结构 ✓
- `ZoneType.java` - 区域类型枚举（居民区、行政区、矿产区、科研区、工业区）
- `ClaimedChunk.java` - 区块宣称数据结构
- `PopulationSystem.java` - 人口系统（人力、适役人口、转换机制）
- `PolicySystem.java` - 国策系统（解锁、加成计算）
- `DecisionSystem.java` - 决议系统（临时增益效果）
- `TechTreeSystem.java` - 科技树系统（研发、物品解锁）
- `ProductionSystem.java` - 生产系统（工厂、生产队列）
- `ClowderStorehouse.java` - 派系仓库（IInventory实现）
- `ChunkManager.java` - 区块管理器（宣称、产出计算）

### 2. 配置系统 ✓
- `SimpleConfigHandler.java` - 使用JSON的配置系统（替代YAML）
- 支持所有系统的可配置参数
- 自动生成默认配置文件

### 3. Clowder类集成 ✓
- 添加了所有新系统的字段
- 更新了NBT保存/加载逻辑
- 添加了辅助方法（政治点数、金钱消耗）
- 在createClowder时初始化所有系统

### 4. 本地化 ✓
- `LocalizationUtil.java` - Flan's Mod HUD汉化工具

## 需要完成的集成工作

### 1. CommandClowder扩展

在 `/home/engine/project/src/main/java/com/hfr/command/CommandClowder.java` 中添加新命令：

```java
// 在 processCommand 方法的 switch 语句中添加：

case "claim": {
    if (args.length > 1) {
        cmdClaim(sender, args[1]);
    }
} break;

case "unclaim": {
    cmdUnclaim(sender);
} break;

case "storehouse": {
    cmdStorehouse(sender);
} break;

case "policy": {
    cmdPolicy(sender);
} break;

case "decision": {
    cmdDecision(sender);
} break;

case "factory": {
    if (args.length > 1) {
        cmdFactory(sender, args[1]);
    }
} break;

case "production": {
    cmdProduction(sender);
} break;

case "info": {
    cmdInfo(sender);
} break;
```

然后实现这些命令方法：

```java
/**
 * 宣称区块命令
 * /c claim <区域类型>
 */
private void cmdClaim(ICommandSender sender, String zoneTypeName) {
    EntityPlayer player = (EntityPlayer) sender;
    Clowder clowder = Clowder.getClowderFromPlayer(player);
    
    if (clowder == null) {
        player.addChatMessage(new ChatComponentText(ERROR + "你不属于任何派系！"));
        return;
    }
    
    if (clowder.getRole(player.getCommandSenderName()) < 2) {
        player.addChatMessage(new ChatComponentText(ERROR + "只有官员和领袖可以宣称区块！"));
        return;
    }
    
    ZoneType zoneType = ZoneType.fromDisplayName(zoneTypeName);
    if (zoneType == ZoneType.NONE) {
        player.addChatMessage(new ChatComponentText(ERROR + "无效的区域类型！可用类型：居民区、行政区、矿产区、科研区、工业区"));
        return;
    }
    
    int chunkX = player.chunkCoordX;
    int chunkZ = player.chunkCoordZ;
    
    if (clowder.chunkManager.claimChunk(chunkX, chunkZ, zoneType, clowder)) {
        player.addChatMessage(new ChatComponentText(SUCCESS + "成功宣称区块为" + zoneType.getDisplayName() + "！"));
        clowder.save(player.worldObj);
    } else {
        player.addChatMessage(new ChatComponentText(ERROR + "宣称失败！可能是资金不足或区块已被宣称。"));
    }
}

/**
 * 取消宣称命令
 * /c unclaim
 */
private void cmdUnclaim(ICommandSender sender) {
    EntityPlayer player = (EntityPlayer) sender;
    Clowder clowder = Clowder.getClowderFromPlayer(player);
    
    if (clowder == null) {
        player.addChatMessage(new ChatComponentText(ERROR + "你不属于任何派系！"));
        return;
    }
    
    if (clowder.getRole(player.getCommandSenderName()) < 2) {
        player.addChatMessage(new ChatComponentText(ERROR + "只有官员和领袖可以取消宣称！"));
        return;
    }
    
    int chunkX = player.chunkCoordX;
    int chunkZ = player.chunkCoordZ;
    
    if (clowder.chunkManager.unclaimChunk(chunkX, chunkZ)) {
        player.addChatMessage(new ChatComponentText(SUCCESS + "成功取消区块宣称！"));
        clowder.save(player.worldObj);
    } else {
        player.addChatMessage(new ChatComponentText(ERROR + "此区块未被你的派系宣称！"));
    }
}

/**
 * 打开仓库GUI
 * /c storehouse
 */
private void cmdStorehouse(ICommandSender sender) {
    EntityPlayer player = (EntityPlayer) sender;
    Clowder clowder = Clowder.getClowderFromPlayer(player);
    
    if (clowder == null || clowder.storehouse == null) {
        player.addChatMessage(new ChatComponentText(ERROR + "你不属于任何派系！"));
        return;
    }
    
    // 打开仓库GUI - 需要实现GUI类
    player.openGui(MainRegistry.instance, GuiHandler.GUI_STOREHOUSE, player.worldObj, 
                   (int)player.posX, (int)player.posY, (int)player.posZ);
}

/**
 * 打开国策GUI
 * /c policy
 */
private void cmdPolicy(ICommandSender sender) {
    EntityPlayer player = (EntityPlayer) sender;
    Clowder clowder = Clowder.getClowderFromPlayer(player);
    
    if (clowder == null) {
        player.addChatMessage(new ChatComponentText(ERROR + "你不属于任何派系！"));
        return;
    }
    
    // 打开国策GUI - 需要实现GUI类
    player.openGui(MainRegistry.instance, GuiHandler.GUI_POLICY, player.worldObj,
                   (int)player.posX, (int)player.posY, (int)player.posZ);
}

/**
 * 打开决议GUI
 * /c decision
 */
private void cmdDecision(ICommandSender sender) {
    EntityPlayer player = (EntityPlayer) sender;
    Clowder clowder = Clowder.getClowderFromPlayer(player);
    
    if (clowder == null) {
        player.addChatMessage(new ChatComponentText(ERROR + "你不属于任何派系！"));
        return;
    }
    
    // 打开决议GUI - 需要实现GUI类
    player.openGui(MainRegistry.instance, GuiHandler.GUI_DECISION, player.worldObj,
                   (int)player.posX, (int)player.posY, (int)player.posZ);
}

/**
 * 建造工厂命令
 * /c factory <military|civilian>
 */
private void cmdFactory(ICommandSender sender, String factoryType) {
    EntityPlayer player = (EntityPlayer) sender;
    Clowder clowder = Clowder.getClowderFromPlayer(player);
    
    if (clowder == null) {
        player.addChatMessage(new ChatComponentText(ERROR + "你不属于任何派系！"));
        return;
    }
    
    if (clowder.getRole(player.getCommandSenderName()) < 2) {
        player.addChatMessage(new ChatComponentText(ERROR + "只有官员和领袖可以建造工厂！"));
        return;
    }
    
    boolean military = factoryType.equalsIgnoreCase("military");
    int chunkX = player.chunkCoordX;
    int chunkZ = player.chunkCoordZ;
    
    if (clowder.chunkManager.buildFactory(chunkX, chunkZ, military, clowder)) {
        String type = military ? "军用" : "民用";
        player.addChatMessage(new ChatComponentText(SUCCESS + "成功建造" + type + "工厂！"));
        clowder.save(player.worldObj);
    } else {
        player.addChatMessage(new ChatComponentText(ERROR + "建造失败！确保此区块是工业区且有足够资金。"));
    }
}

/**
 * 打开生产GUI
 * /c production
 */
private void cmdProduction(ICommandSender sender) {
    EntityPlayer player = (EntityPlayer) sender;
    Clowder clowder = Clowder.getClowderFromPlayer(player);
    
    if (clowder == null) {
        player.addChatMessage(new ChatComponentText(ERROR + "你不属于任何派系！"));
        return;
    }
    
    // 打开生产GUI - 需要实现GUI类
    player.openGui(MainRegistry.instance, GuiHandler.GUI_PRODUCTION, player.worldObj,
                   (int)player.posX, (int)player.posY, (int)player.posZ);
}

/**
 * 显示当前区块信息
 * /c info
 */
private void cmdInfo(ICommandSender sender) {
    EntityPlayer player = (EntityPlayer) sender;
    Clowder clowder = Clowder.getClowderFromPlayer(player);
    
    if (clowder == null) {
        player.addChatMessage(new ChatComponentText(ERROR + "你不属于任何派系！"));
        return;
    }
    
    int chunkX = player.chunkCoordX;
    int chunkZ = player.chunkCoordZ;
    ClaimedChunk chunk = clowder.chunkManager.getChunk(chunkX, chunkZ);
    
    if (chunk == null) {
        player.addChatMessage(new ChatComponentText(INFO + "当前区块未被你的派系宣称。"));
        return;
    }
    
    player.addChatMessage(new ChatComponentText(TITLE + "=== 区块信息 ==="));
    player.addChatMessage(new ChatComponentText(INFO + "坐标: " + chunkX + ", " + chunkZ));
    player.addChatMessage(new ChatComponentText(INFO + "类型: " + chunk.zoneType.getDisplayName()));
    
    if (chunk.zoneType == ZoneType.INDUSTRIAL) {
        player.addChatMessage(new ChatComponentText(INFO + "军用工厂: " + chunk.militaryFactoryCount));
        player.addChatMessage(new ChatComponentText(INFO + "民用工厂: " + chunk.civilianFactoryCount));
    }
    
    // 显示派系资源
    player.addChatMessage(new ChatComponentText(TITLE + "=== 派系资源 ==="));
    if (clowder.populationSystem != null) {
        player.addChatMessage(new ChatComponentText(INFO + "总人口: " + clowder.populationSystem.getTotalPopulation()));
        player.addChatMessage(new ChatComponentText(INFO + "人力: " + clowder.populationSystem.getManpower()));
        player.addChatMessage(new ChatComponentText(INFO + "适役人口: " + clowder.populationSystem.getRecruitablePopulation()));
    }
    player.addChatMessage(new ChatComponentText(INFO + "政治点数: " + clowder.getPoliticalPoints()));
}
```

### 2. GUI实现

需要创建以下GUI类：

1. **派系仓库GUI** (`GuiClowderStorehouse.java`)
   - 继承 `GuiContainer`
   - 显示54个槽位的仓库界面
   - 实现Container类用于网络同步

2. **国策树GUI** (`GuiPolicy.java`)
   - 显示可用国策列表
   - 显示已解锁的国策
   - 实现国策解锁按钮（仅领袖可用）
   - 显示国策效果和前置条件

3. **决议GUI** (`GuiDecision.java`)
   - 显示可用决议列表
   - 显示活跃的决议和剩余时间
   - 实现决议激活按钮
   - 显示决议效果和持续时间

4. **生产GUI** (`GuiProduction.java`)
   - 显示生产队列
   - 显示可用生产配方
   - 实现添加生产任务按钮
   - 显示生产进度

### 3. 服务器Tick更新

在 `ClowderEvents.java` 或创建新的 `ClowderTickHandler.java`：

```java
@SubscribeEvent
public void onServerTick(TickEvent.ServerTickEvent event) {
    if (event.phase != TickEvent.Phase.END) {
        return;
    }
    
    // 每20 ticks（1秒）更新一次
    if (tickCounter++ % 20 != 0) {
        return;
    }
    
    MinecraftServer server = MinecraftServer.getServer();
    if (server == null) {
        return;
    }
    
    World world = server.worldServerForDimension(0);
    
    for (Clowder clowder : Clowder.clowders) {
        // 更新人口系统
        if (clowder.populationSystem != null) {
            clowder.populationSystem.update(clowder);
        }
        
        // 更新区块产出
        if (clowder.chunkManager != null) {
            clowder.chunkManager.updateChunks(clowder);
        }
        
        // 更新决议系统（移除过期决议）
        if (clowder.decisionSystem != null) {
            clowder.decisionSystem.update();
        }
        
        // 更新生产系统
        if (clowder.productionSystem != null) {
            clowder.productionSystem.update(clowder);
            // 重新计算生产槽位
            clowder.productionSystem.calculateProductionSlots(clowder);
        }
    }
    
    // 保存数据
    ClowderData.getData(world).markDirty();
}

private int tickCounter = 0;
```

### 4. 配置初始化

在 `MainRegistry.java` 的 `preInit` 方法中添加：

```java
// 初始化Clowder配置
SimpleConfigHandler.init(event.getModConfigurationDirectory());
```

### 5. Flan's Mod HUD汉化

修改 `PlaneHUD.java` 中的文本显示，例如：

```java
// 原来的代码：
fr.drawString("ALT", (int)((w+b)/2.0+b*0.35), (int)(h/2.0-b*0.05), renk);

// 改为：
fr.drawString(LocalizationUtil.translate("ALT"), (int)((w+b)/2.0+b*0.35), (int)(h/2.0-b*0.05), renk);
```

对所有硬编码的英文文本进行类似的替换。

### 6. 科技树物品使用限制

在物品使用事件中添加检查：

```java
@SubscribeEvent
public void onItemUse(PlayerInteractEvent event) {
    EntityPlayer player = event.entityPlayer;
    ItemStack stack = player.getCurrentEquippedItem();
    
    if (stack != null) {
        Clowder clowder = Clowder.getClowderFromPlayer(player);
        if (clowder != null && clowder.techTreeSystem != null) {
            if (!clowder.techTreeSystem.canUseItem(stack)) {
                player.addChatMessage(new ChatComponentText(
                    EnumChatFormatting.RED + "此物品需要解锁相应科技才能使用！"));
                event.setCanceled(true);
            }
        }
    }
}
```

### 7. GUI Handler注册

在GUI Handler类中添加新的GUI ID和处理：

```java
public static final int GUI_STOREHOUSE = 100;
public static final int GUI_POLICY = 101;
public static final int GUI_DECISION = 102;
public static final int GUI_PRODUCTION = 103;

@Override
public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
    Clowder clowder = Clowder.getClowderFromPlayer(player);
    if (clowder == null) {
        return null;
    }
    
    switch (ID) {
        case GUI_STOREHOUSE:
            return new ContainerStorehouse(player.inventory, clowder.storehouse);
        case GUI_POLICY:
            return null; // 只需客户端GUI
        case GUI_DECISION:
            return null; // 只需客户端GUI
        case GUI_PRODUCTION:
            return null; // 只需客户端GUI
        default:
            return null;
    }
}

@Override
public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
    Clowder clowder = Clowder.getClowderFromPlayer(player);
    if (clowder == null) {
        return null;
    }
    
    switch (ID) {
        case GUI_STOREHOUSE:
            return new GuiClowderStorehouse(player.inventory, clowder.storehouse);
        case GUI_POLICY:
            return new GuiPolicy(clowder);
        case GUI_DECISION:
            return new GuiDecision(clowder);
        case GUI_PRODUCTION:
            return new GuiProduction(clowder);
        default:
            return null;
    }
}
```

## 测试清单

- [ ] 派系创建时所有系统正确初始化
- [ ] 区块宣称和取消功能正常
- [ ] 各类区域正确产出资源
- [ ] 人口系统正常转换和产出物品
- [ ] 国策解锁和效果应用正确
- [ ] 决议激活和过期机制正常
- [ ] 科技树研发和物品解锁正常
- [ ] 生产系统正常运作
- [ ] 仓库物品存取正常
- [ ] 所有数据正确保存和加载
- [ ] Flan's Mod HUD正确显示中文

## 配置文件示例

配置文件位于 `config/clowder/` 目录下，包括：
- `basic_config.json` - 基础配置
- `policies.json` - 国策配置
- `decisions.json` - 决议配置
- `technologies.json` - 科技树配置
- `productions.json` - 生产配置

所有配置都是JSON格式，可以使用任何文本编辑器修改。

## 注意事项

1. **性能优化**：区块更新和人口系统应该在不同的tick进行，避免同时计算造成卡顿
2. **数据同步**：所有修改都需要调用 `clowder.save(world)` 以确保数据持久化
3. **权限检查**：所有管理命令都应检查玩家权限（leader/officer/member）
4. **错误处理**：所有用户输入都应该验证，防止崩溃
5. **网络包**：GUI交互需要实现对应的网络包进行客户端-服务器通信

## 后续扩展建议

1. 添加可视化的国策树GUI（树状结构）
2. 添加区块地图显示
3. 实现派系外交关系图
4. 添加更多区域类型（如港口、机场等）
5. 实现更复杂的科技依赖关系
6. 添加派系等级和声望系统集成
7. 实现自动化的资源交易系统
