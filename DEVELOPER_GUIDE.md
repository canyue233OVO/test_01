# HFR Clowder Systems - Developer Guide

This guide provides comprehensive documentation for developers working with or extending the HFR Clowder faction system.

## 📋 Table of Contents

- [Architecture Overview](#architecture-overview)
- [Core Systems](#core-systems)
- [Data Persistence](#data-persistence)
- [Configuration System](#configuration-system)
- [Event Handling](#event-handling)
- [API Usage](#api-usage)
- [Extending the System](#extending-the-system)
- [Performance Considerations](#performance-considerations)
- [Debugging](#debugging)

---

## Architecture Overview

### System Components

The Clowder system consists of several interconnected modules:

```
com.hfr.clowder/
├── Clowder.java              # Core faction class
├── ClowderTerritory.java     # Territory management
├── ClaimedZone.java          # Zone claiming system
├── ZoneType.java             # Zone type enum
├── ZoneConfig.java           # Zone configuration
├── PopulationSystem.java     # Population management
├── ClowderStorehouse.java    # Faction storage
├── PolicyTree.java           # National focus tree
├── DecisionSystem.java       # Decision system
├── TechnologyTree.java       # Tech tree
├── ProductionSystem.java     # Production management
└── ConfigLoader.java         # Configuration loader
```

### Design Patterns

- **Singleton Pattern**: Used for configuration management
- **Strategy Pattern**: Different zone types have different behaviors
- **Observer Pattern**: Systems update based on time events
- **Factory Pattern**: Production system creates items

---

## Core Systems

### 1. Clowder (Faction) System

#### Class: `Clowder.java`

The main faction class that manages all faction-related data and operations.

**Key Fields:**
```java
public String name;                          // Faction name
public String owner;                         // Faction leader
public float money;                          // Faction bank balance
public Map<String, ClaimedZone> claimedZones; // Claimed functional zones
public PopulationSystem populationSystem;    // Population management
public ClowderStorehouse storehouse;         // Faction storage
public PolicyTree policyTree;                // National focus tree
public DecisionSystem decisionSystem;        // Decision system
public TechnologyTree technologyTree;        // Tech tree
public ProductionSystem productionSystem;    // Production system
```

**Key Methods:**
```java
// Zone management
public boolean claimZone(ZoneType type, int x, int y, int z, String name, World world)
public boolean unclaimZone(int x, int y, int z, World world)
public ClaimedZone getClaimedZone(int x, int y, int z)
public void updateAllZones(float hours)
public void collectAllZoneProduction()

// Resource management
public float getPoliticalPower()
public float getResearchPoints()
public void addPoliticalPower(float amount)
public void addResearchPoints(float amount)

// NBT persistence
public void writeToNBT(NBTTagCompound nbt)
public void readFromNBT(NBTTagCompound nbt)
```

### 2. Zone Claiming System

#### Class: `ClaimedZone.java`

Represents a claimed functional zone with production capabilities.

**Zone Types:**
- RESIDENTIAL - Produces manpower and eligible population
- MINING - Consumes manpower, produces ore
- ADMINISTRATIVE - Produces manpower and political power
- INDUSTRIAL - Allows factory construction
- RESEARCH - Consumes eligible population, produces research points

**Production Cycle:**
```java
public void updateProduction(float hours, Clowder owner, World world) {
    ZoneConfig config = ZoneConfig.getConfig(zoneType);
    
    // Apply production/consumption
    float multiplier = hours * level;
    
    // Store or consume resources based on zone type
    // ...
}
```

### 3. Population System

#### Class: `PopulationSystem.java`

Manages population, manpower, and eligible population with automatic growth and conversion.

**Key Mechanics:**
```java
// Population growth
public void updatePopulation() {
    float growthRate = BASE_GROWTH_RATE; // 1% per day
    population += population * growthRate * getGrowthModifier();
}

// Population conversion
eligiblePopulation = population * ELIGIBLE_POP_CONVERSION_RATE; // 5% per day
manpower += eligiblePopulation * MANPOWER_CONVERSION_RATE; // 10% per day
```

**Random Production:**
Every hour, each 1000 population has a 5% chance to produce configured items.

### 4. Technology Tree

#### Class: `TechnologyTree.java`

Manages tech research and unlocks.

**Tech Structure:**
```java
public static class Technology {
    public String id;
    public String name;
    public float cost;                // Research points required
    public float researchTime;        // Time to research
    public List<String> prerequisites; // Required techs
    public List<String> unlockItems;  // Items unlocked
    public List<String> unlockProduction; // Production unlocked
}
```

**Research Process:**
```java
public void updateResearch(float researchPoints) {
    if (currentResearch != null) {
        researchProgress += researchPoints * getResearchSpeedModifier();
        
        if (researchProgress >= getResearchCost(currentResearch)) {
            unlockTech(currentResearch);
        }
    }
}
```

### 5. Policy Tree System

#### Class: `PolicyTree.java`

National focus tree providing permanent bonuses.

**Policy Structure:**
```java
public static class Policy {
    public String id;
    public String name;
    public int cost;  // Days to research
    public List<String> prerequisites;
    public Map<String, Float> effects;
}
```

**Available Ideologies:**
- DEMOCRACY - Economic and research bonuses
- COMMUNISM - Military production and population bonuses
- FASCISM - Military production and speed bonuses
- MONARCHY - Balanced bonuses

### 6. Decision System

#### Class: `DecisionSystem.java`

Temporary decisions consuming political power for short-term bonuses.

**Decision Structure:**
```java
public static class Decision {
    public String id;
    public String name;
    public float cost;        // Political power cost
    public int duration;      // Days active
    public int cooldown;      // Days until can activate again
    public Map<String, Float> effects;
}
```

**Active Decision Management:**
```java
public boolean activateDecision(String decisionId) {
    if (canActivate(decisionId)) {
        ActiveDecision active = new ActiveDecision(decisionId);
        activeDecisions.add(active);
        return true;
    }
    return false;
}

public void updateDecisions() {
    // Decrease remaining days
    // Remove expired decisions
    // Update cooldowns
}
```

### 7. Production System

#### Class: `ProductionSystem.java`

Manages item production using factories.

**Production Queue:**
```java
public static class ProductionQueue {
    public String projectId;
    public int totalQuantity;
    public int remainingQuantity;
    public float progress;
    public boolean requiresCivilianFactory;
    public boolean requiresMilitaryFactory;
}
```

**Production Update:**
```java
public void updateProduction(float hours) {
    for (ProductionQueue queue : productionQueues) {
        float productionSpeed = getProductionSpeed();
        queue.progress += hours * productionSpeed;
        
        while (queue.progress >= getProductionTime(queue.projectId)) {
            // Complete one item
            produceItem(queue.projectId);
            queue.progress -= getProductionTime(queue.projectId);
            queue.remainingQuantity--;
        }
    }
}
```

---

## Data Persistence

### NBT Serialization

All systems use NBT tags for save/load operations.

#### Example: Clowder NBT

```java
public void writeToNBT(NBTTagCompound nbt) {
    // Basic data
    nbt.setString("name", name);
    nbt.setString("owner", owner);
    nbt.setFloat("money", money);
    
    // Claimed zones
    NBTTagList zonesList = new NBTTagList();
    for (ClaimedZone zone : claimedZones.values()) {
        NBTTagCompound zoneTag = new NBTTagCompound();
        zone.writeToNBT(zoneTag);
        zonesList.appendTag(zoneTag);
    }
    nbt.setTag("claimedZones", zonesList);
    
    // Systems
    NBTTagCompound popTag = new NBTTagCompound();
    populationSystem.writeToNBT(popTag);
    nbt.setTag("population", popTag);
    
    // ... other systems
}
```

### Save Location

Data is saved in world save directory:
```
world/clowders/
├── clowder_data.dat
└── territory_data.dat
```

---

## Configuration System

### Configuration Files

Located in `config/hfr/`:

1. **zones.yml** - Zone production/cost configuration
2. **policies.yml** - National focus trees
3. **decisions.yml** - Decision definitions
4. **technologies.yml** - Tech tree structure
5. **production.yml** - Production projects
6. **population.yml** - Population random drops

### Configuration Structure

#### Example: zones.yml

```yaml
residential:
  buildCost: 1000.0
  manpowerProduction: 10.0
  eligiblePopProduction: 2.0
  
mining:
  buildCost: 2000.0
  manpowerCost: 5.0
  oreOutput:
    - item: minecraft:iron_ore
      min: 1
      max: 5
```

### Loading Configuration

Currently uses hardcoded defaults. To implement YAML loading:

1. Add SnakeYAML dependency to build.gradle:
```gradle
compile 'org.yaml:snakeyaml:1.33'
```

2. Implement loader in `ConfigLoader.java`:
```java
public static void loadZoneConfig() {
    Yaml yaml = new Yaml();
    InputStream input = new FileInputStream("config/hfr/zones.yml");
    Map<String, Object> data = yaml.load(input);
    
    // Parse and apply configuration
}
```

---

## Event Handling

### Update Cycles

Updates are triggered in `CommonEventHandler.java`:

```java
@SubscribeEvent
public void onWorldTick(WorldTickEvent event) {
    timer++;
    
    // Hourly update (72000 ticks)
    if(timer % 72000 == 0) {
        for(Clowder clowder : Clowder.clowders) {
            clowder.updateAllZones(1.0f);
            clowder.populationSystem.updatePopulation();
            clowder.productionSystem.updateProduction(1.0f);
        }
    }
    
    // Daily update (24000 ticks)
    if(timer % 24000 == 0) {
        for(Clowder clowder : Clowder.clowders) {
            clowder.policyTree.updateResearch();
            clowder.decisionSystem.updateDecisions();
        }
    }
}
```

### Update Frequencies

- **Hourly (72000 ticks)**:
  - Zone production
  - Population updates
  - Production progress
  
- **Daily (24000 ticks)**:
  - Policy research
  - Decision duration
  - Population conversion

- **10 Minutes (12000 ticks)**:
  - Technology research

---

## API Usage

### Creating a New Zone Type

1. Add enum value to `ZoneType.java`:
```java
public enum ZoneType {
    // ... existing types
    CUSTOM("自定义区", "custom");
}
```

2. Add configuration to `ZoneConfig.java`:
```java
ZoneConfig custom = new ZoneConfig();
custom.manpowerProduction = 5.0f;
custom.buildCost = 1000.0f;
configs.put(ZoneType.CUSTOM, custom);
```

3. Implement production logic in `ClaimedZone.java`:
```java
if(zoneType == ZoneType.CUSTOM) {
    // Custom production logic
}
```

### Adding a New Technology

In `TechnologyTree.java`:

```java
Technology customTech = new Technology();
customTech.id = "custom_tech";
customTech.name = "Custom Technology";
customTech.cost = 100.0f;
customTech.researchTime = 50.0f;
customTech.prerequisites = Arrays.asList("basic_industry");
customTech.unlockItems = Arrays.asList("minecraft:diamond_sword");
techDefinitions.put("custom_tech", customTech);
```

### Adding a New Decision

In `DecisionSystem.java`:

```java
Decision customDecision = new Decision();
customDecision.id = "custom_decision";
customDecision.name = "Custom Decision";
customDecision.cost = 50.0f;
customDecision.duration = 30;
customDecision.cooldown = 90;
customDecision.effects.put("productionSpeed", 1.25f);
availableDecisions.put("custom_decision", customDecision);
```

### Adding a New Production Project

In `ProductionSystem.java`:

```java
ProductionProject project = new ProductionProject();
project.id = "custom_item";
project.name = "Custom Item";
project.productionTime = 5.0f;
project.requiresMilitaryFactory = true;
project.outputPerFactory = 10;
project.requiredTech = Arrays.asList("advanced_industry");
project.output = Arrays.asList(new ItemStack(Items.diamond, 1));
productionProjects.put("custom_item", project);
```

---

## Extending the System

### Custom Modifiers

All production systems support modifiers:

```java
public float getProductionModifier() {
    float modifier = 1.0f;
    
    // Policy bonuses
    modifier *= policyTree.getModifier("productionSpeed");
    
    // Decision bonuses
    modifier *= decisionSystem.getActiveModifier("productionSpeed");
    
    // Tech bonuses
    modifier *= technologyTree.getModifier("productionSpeed");
    
    return modifier;
}
```

### Adding New Commands

In `CommandClowder.java`:

```java
case "customcmd": {
    if (args.length > 1)
        cmdCustom(sender, args[1]);
}break;

private void cmdCustom(ICommandSender sender, String arg) {
    EntityPlayer player = getCommandSenderAsPlayer(sender);
    Clowder clowder = Clowder.getClowderFromPlayer(player);
    
    if(clowder == null) {
        sender.addChatMessage(new ChatComponentText(ERROR + "你不是任何派系的成员！"));
        return;
    }
    
    // Custom logic
}
```

### Custom Zone Production

Override zone production logic:

```java
@Override
public void updateProduction(float hours, Clowder owner, World world) {
    super.updateProduction(hours, owner, world);
    
    // Custom production logic
    if(zoneType == ZoneType.CUSTOM) {
        // Your custom code here
    }
}
```

---

## Performance Considerations

### Optimization Strategies

1. **Batch Updates**: Update all zones/systems together
2. **Lazy Evaluation**: Only calculate when needed
3. **Caching**: Cache frequently used values
4. **Async Processing**: Consider async for heavy operations

### Memory Management

```java
// Clean up expired decisions
public void cleanupExpiredDecisions() {
    activeDecisions.removeIf(d -> d.remainingDays <= 0);
}

// Limit queue sizes
public boolean startProduction(String projectId, int quantity) {
    if(productionQueues.size() >= getMaxProductionSlots()) {
        return false;
    }
    // ...
}
```

### Tick Budget

Current update frequencies are optimized:
- Hourly updates: ~72000 ticks (1 hour real-time)
- Daily updates: ~24000 ticks (20 minutes real-time)
- 10-minute updates: ~12000 ticks

---

## Debugging

### Debug Commands

Add debug commands in development:

```java
if(MainRegistry.enableDebug) {
    case "debug_zones": {
        for(ClaimedZone zone : clowder.claimedZones.values()) {
            sender.addChatMessage(new ChatComponentText(
                zone.zoneName + ": " + zone.zoneType.getDisplayName()
            ));
        }
    }break;
}
```

### Logging

Use the HFR logger:

```java
MainRegistry.logger.info("[Clowder] Zone claimed: " + zoneName);
MainRegistry.logger.warn("[Clowder] Low resources!");
MainRegistry.logger.error("[Clowder] Failed to save data!");
```

### NBT Inspection

Inspect NBT data in-game or with NBT editors:

```
/nbt get Clowder <faction_name>
```

---

## Code Style Guidelines

### Naming Conventions

- **Classes**: PascalCase (e.g., `ClaimedZone`)
- **Methods**: camelCase (e.g., `updateProduction`)
- **Constants**: UPPER_SNAKE_CASE (e.g., `MAX_SLOTS`)
- **Fields**: camelCase (e.g., `claimedZones`)

### Comments

Use Chinese comments for key logic:

```java
/**
 * 更新区域产出
 * 每小时调用一次
 * 
 * @param hours 经过的小时数
 * @param owner 拥有该区域的派系
 * @param world 世界对象
 */
public void updateProduction(float hours, Clowder owner, World world) {
    // 获取区域配置
    ZoneConfig config = ZoneConfig.getConfig(zoneType);
    
    // 计算产出倍率
    float multiplier = hours * level;
    
    // 应用生产/消耗
    // ...
}
```

### Error Handling

Always validate input and handle errors gracefully:

```java
public boolean claimZone(ZoneType type, int x, int y, int z, String name, World world) {
    // Validate input
    if(type == null || name == null || world == null) {
        return false;
    }
    
    // Check if already claimed
    if(getClaimedZone(x, y, z) != null) {
        return false;
    }
    
    // Check resources
    ZoneConfig config = ZoneConfig.getConfig(type);
    if(money < config.buildCost) {
        return false;
    }
    
    // Proceed with claiming
    // ...
    return true;
}
```

---

## Testing

### Unit Testing

Create test cases for core systems:

```java
@Test
public void testZoneProduction() {
    ClaimedZone zone = new ClaimedZone(ZoneType.RESIDENTIAL, 0, 0, 0, "Test");
    Clowder clowder = new Clowder("TestFaction", "TestOwner");
    
    float initialManpower = clowder.populationSystem.getManpower();
    zone.updateProduction(1.0f, clowder, mockWorld);
    
    assertTrue(clowder.populationSystem.getManpower() > initialManpower);
}
```

### Integration Testing

Test full system interactions:

```java
@Test
public void testFullProductionCycle() {
    Clowder clowder = createTestClowder();
    
    // Claim industrial zone
    clowder.claimZone(ZoneType.INDUSTRIAL, 0, 0, 0, "Factory", mockWorld);
    
    // Build factory
    ClaimedZone zone = clowder.getClaimedZone(0, 0, 0);
    zone.buildFactory(true, 5000.0f);
    
    // Start production
    clowder.productionSystem.startProduction("rifle", 10);
    
    // Update production
    clowder.productionSystem.updateProduction(10.0f);
    
    // Verify output
    assertTrue(clowder.storehouse.getTotalItemCount() > 0);
}
```

---

## Contributing

### Pull Request Process

1. Fork the repository
2. Create a feature branch
3. Implement changes with tests
4. Update documentation
5. Submit pull request

### Code Review Checklist

- [ ] Code follows style guidelines
- [ ] All tests pass
- [ ] Documentation updated
- [ ] No performance regressions
- [ ] NBT persistence works correctly
- [ ] Backwards compatibility maintained

---

## Version History

### v1.0.0 (Current)
- Initial implementation of all core systems
- Zone claiming system
- Population management
- Technology tree
- Policy tree
- Decision system
- Production system
- Faction storehouse
- Configuration templates

---

## Resources

### External Documentation

- [Minecraft Forge Documentation](https://mcforge.readthedocs.io/)
- [NBT Format Specification](https://minecraft.fandom.com/wiki/NBT_format)
- [SnakeYAML Documentation](https://bitbucket.org/asomov/snakeyaml/wiki/Documentation)

### Internal References

- `CLOWDER_SYSTEMS_GUIDE.md` - Complete system guide
- `PLAYER_GUIDE_CN.md` - Player guide (Chinese)
- `README.md` - Project readme

---

## Support

For questions or issues:
- Create an issue on GitHub
- Contact the development team
- Check existing documentation

---

**Happy Coding!** 🚀
