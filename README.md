# Flan's Mod LabJac Edition - Minecraft 1.7.10

A comprehensive Minecraft 1.7.10 modpack that combines and extends multiple major mods including Flan's Mod, HBM's Nuclear Tech Mod (Austria-Hungary Edition), and various custom integrations.

## 📋 Overview

This is a fusion mod that merges several major Minecraft mods with custom modifications and integrations:

- **Flan's Mod LabJac Edition** - Combat vehicles, weapons, and multiplayer team systems
- **HFR Mod (Austria Hungary Mod)** - Industrial machinery, nuclear technology, and economic systems
- **Clowder System** - Custom faction and territory management
- **Baris Tech Tree Integration** - Advanced progression system

**Version:** LabJac Mod Mark 25843 (February 2021)  
**Minecraft Version:** 1.7.10  
**Mod ID:** `flansmod` (primary), `hfr` (secondary)

## ✨ Major Features

### Flan's Mod Components

#### 🔫 Weapons System
- **Guns** - Extensive variety of firearms with customizable attachments
- **Grenades** - Multiple grenade types with various effects
- **AA Guns** - Anti-aircraft stationary weapons
- **Machine Guns** - Placeable MG emplacements
- **Ammunition** - Diverse bullet types with different characteristics
- **Attachments** - Scopes, grips, and other weapon modifications

#### 🚗 Vehicles & Driveables
- **Planes** - Various aircraft with different capabilities
- **Vehicles** - Ground vehicles including tanks and cars
- **Mechas** - Pilotable mechs with customizable weapons and tools
- **Seats & Wheels** - Component system for vehicles
- **Parachutes** - Deployable parachutes for aerial drops

#### 👥 Teams & Multiplayer
- **Team System** - Create and manage teams with custom colors
- **Flagpoles** - Capture points and territory markers
- **Spawners** - Custom team spawn points
- **Team Commands** - `/teams` command suite for team management
- **Armor System** - Team-based armor with custom appearances
- **Shekel Currency** - In-game economy system (`/shekel` commands)

#### 🎨 Customization
- **Paintjob Table** - Apply custom paintjobs to vehicles and weapons
- **Content Pack System** - Load custom content from the `/Flan/` directory
- **Multiple Creative Tabs** - Organized items (Guns, Driveables, Parts, Teams, Mechas)

#### 🔧 Crafting & Parts
- **Flan's Workbench** - Specialized crafting station for mod items
- **Part System** - Craft vehicle and weapon components
- **Tool Types** - Various tools and utilities

### HFR Mod (Austria Hungary Mod) Components

#### 🏭 Industrial Systems
- **Blast Furnaces** - Advanced smelting systems
- **Tanks & Storage** - Fluid and item storage solutions
- **Derricks** - Oil extraction machinery
- **Refineries** - Process crude oil into various fuels
- **Fabricators** - Advanced manufacturing machines
- **Assembly Machines** - Automated crafting systems

#### ⚡ Energy Systems
- **Power Generation**
  - Coal Generators (200 HE/t)
  - Windmills (500 HE/t)
  - Waterwheels (100 HE/t)
  - Diesel Generators (1000 HE/t)
- **Energy Distribution** - Power transmission and storage
- **EMP Systems** - Electromagnetic pulse weapons and effects

#### ☢️ Nuclear Technology
- **Nuclear Weapons** - Various nuclear warheads with configurable yields
- **Nuclear Reactors** - Power generation through nuclear fission
- **Radiation System** - Radiation effects and protection
- **Missiles** - Long-range missile systems with multiple warhead types
- **Launch Pads** - Missile launch infrastructure

#### 🚀 Advanced Weapons
- **Railguns** - Electromagnetic projectile weapons
- **Naval Guns** - Ship-mounted artillery
- **Anti-Ballistic Missiles** - Defensive missile systems
- **Artillery Systems** - Various projectile weapons
- **Turrets** - Automated defense systems

#### 🌙 Dimensions
- **Moon Dimension** - Custom lunar dimension with unique world generation
- **World Generation** - Custom ore generation and structures

#### 💰 Economic Systems
- **Stock Market** - Trading system with dynamic prices
- **Market Blocks** - Buy and sell items
- **Currency System** - In-game economy
- **Territory System** - Control and manage land claims

#### 🏰 Faction System (Clowder)

**Clowder** (猫群派系系统) 是一个完整的派系管理和领土争夺系统，类似于钢铁雄心4的国家管理机制。

##### 核心功能
- **派系创建与管理** - 建立自己的派系，招募成员，设置官员
- **领土控制** - 通过旗帜宣称区块，建立自己的势力范围
- **战争系统** - 向其他派系宣战，攻占敌方旗帜
- **外交系统** - 结盟、宣战、和平条约、附庸关系
- **经济系统** - 派系银行、声望(Prestige)、政治点数
- **区块宣称** - 将领土划分为不同类型的区域（居民区、工业区等）
- **人口系统** - 人力资源管理和适役人口转换
- **国策树** - 类似钢铁雄心4的国策系统，影响派系发展
- **决议系统** - 消耗政治点数获得临时增益效果
- **科技树** - 解锁新技术和设备
- **生产系统** - 建造工厂，生产武器装备

##### 战争机制详解

**宣战流程**:
1. 派系领袖使用 `/c fabricate <目标派系>` 开始伪造宣战理由（需要时间和费用）
2. 伪造完成后使用 `/c declare <目标派系>` 正式宣战
3. 战争状态下可以攻击敌对派系成员和旗帜

**占领旗帜**:
- 找到敌方派系的**大型旗帜**（Big Flag）
- 右键点击旗帜打开GUI界面
- 点击"Capture"按钮开始占领
- 占领需要一定时间，期间不能移动或受到攻击
- 成功占领后该旗帜及其控制的区块归属你的派系
- 每个旗帜控制周围一定范围的区块

**战争规则**:
- 战争有时间限制，超时后自动停战
- 可以使用 `/c retreat` 主动撤退（有冷却时间）
- 附庸国参战时不能直接攻击宗主国
- 战争期间无法更改派系主基地位置
- 占领旗帜可获得声望和领土

**和平条约**:
- 战败方可能成为战胜方的附庸国
- 条约有持续时间，期间不能再次宣战
- 附庸国需要向宗主国支付贡品

##### 区块宣称系统

派系可以将已控制的区块宣称为特定类型的区域，每种区域有不同的功能：

**居民区** (Residential Zone):
- 产出：人力、适役人口
- 消耗：维护费用（派系银行金钱）
- 功能：派系人口的主要来源
- 建筑：可建造住宅、商店等

**行政区** (Administrative Zone):
- 产出：人力、政治点数
- 消耗：维护费用
- 功能：提供政治点数用于决议和国策
- 建筑：政府建筑、办公场所

**矿产区** (Mining Zone):
- 产出：各类矿物资源
- 消耗：人力（工人）
- 功能：自动化资源采集
- 建筑：矿井、采石场
- 配置：可在yml中自定义产出矿物类型和数量

**科研区** (Research Zone):
- 产出：科研点数
- 消耗：适役人口（科研人员）
- 功能：加速科技树研究
- 建筑：实验室、研究所

**工业区** (Industrial Zone):
- 可建造：军用工厂、民用工厂
- 消耗：人力、原材料
- 功能：生产武器装备和物资
- 产出：由生产线决定

使用方法:
```
/c claim <区域类型> - 在当前区块宣称指定类型的区域
/c unclaim - 取消当前区块的宣称
/c info - 查看当前区块的信息
```

##### 人口系统

**人口转换**:
- 每天按比例将总人口转换为适役人口
- 转换比例受国策和科技树影响
- 适役人口可用于科研区和军队征募

**物品产出**:
- 每小时每1000人口有概率随机产出物品
- 产出物品可在yml中配置，支持mod物品
- 所有产出物品自动存入派系仓库

**人力管理**:
- 人力用于矿产区开采和建筑建造
- 可通过居民区和行政区产出人力
- 人力不足时相关区域停止运作

##### 派系仓库系统

```
/c storehouse - 打开派系仓库GUI
```

功能：
- 存储区块宣称系统产出的所有资源
- 存储人口系统产出的物品
- 派系成员可以存取物品（权限可配置）
- 官员可以管理仓库物品分配

##### 国策系统

```
/c policy - 打开国策树GUI
```

**意识形态**:
- 创建派系时选择一个意识形态
- 不同意识形态有不同的国策树
- 国策树提供各种加成效果

**国策效果**（可自定义）:
- 资源产出加成
- 人口增长速度
- 科研速度提升
- 工厂效率提升
- 军队战斗力加成
- 外交影响力

**选择国策**:
- 仅派系领袖可以选择国策
- 其他成员可以查看国策树
- 国策需要前置条件和政治点数
- 国策生效后永久保留

##### 决议系统

```
/c decision - 打开决议系统GUI
```

**决议特点**:
- 消耗政治点数
- 提供临时增益效果
- 有持续时间限制
- 可以同时激活多个决议

**决议类型**（可yml配置）:
- 总动员：提高人力和适役人口产出
- 战时经济：提升工厂产能
- 科研加速：提高科研点数获取
- 外交攻势：降低宣战费用
- 紧急征召：快速获得人力

##### 科技树系统

**特点**:
- 完全yml可配置的科技树
- 科技可以解锁物品使用权限
- 未解锁的科技线物品无法使用
- 科技提供各种加成效果

**研发**:
- 消耗科研点数
- 需要满足前置科技条件
- 派系领袖和官员可以选择研发方向
- 所有派系成员享受科技加成

**科技效果**:
- 解锁新武器和载具
- 解锁新的建筑和机器
- 提升资源产出
- 提升工厂效率
- 增加生产槽位

##### 生产系统

**工厂系统**:
- 在工业区建造军用工厂和民用工厂
- 每达到一定数量工厂增加一个生产槽位
- 国策和科技树可以提供额外槽位

**生产配置** (yml可配置):
- 每个物品有生产成本和时间
- 可以设置科技树前置条件
- 支持批量生产
- 生产完成后物品存入派系仓库

**奇迹武器**:
- 特殊的大型武器项目
- 需要大量资源和时间
- 需要特定科技解锁
- 可能需要多个派系合作

使用方法:
```
/c factory - 打开工厂管理界面
/c production - 查看生产队列
```

#### 🗺️ Utility Systems
- **Radar System** - Long-range entity detection (1000 block range)
- **Maps** - Custom map items
- **Designators** - Target designation systems
- **Remote Controls** - Remote activation devices
- **Schematic System** - Structure templates and building aids

### Additional Features

#### 🎮 Configuration
- Extensive config system for balancing gameplay
- Per-system configuration options
- Debug mode available
- Performance tuning options

#### 🎯 Combat Enhancements
- **Gun Animations** - Detailed weapon animations
- **Custom Crosshairs** - Configurable crosshair system
- **Hit Markers** - Visual hit confirmation
- **Bullet Casings** - Shell ejection effects
- **Advanced Ballistics** - Realistic bullet physics

#### 🛠️ Developer Features
- **Content Pack API** - Create custom content packs
- **TMT (Turbo Model Thingy)** - Advanced model rendering
- **Custom Rendering System** - Specialized renderers for mod entities
- **Network Packet System** - Client-server synchronization
- **Event System** - Custom event handlers

## 📦 Dependencies & Integration

### Required Dependencies
- **Minecraft Forge** for 1.7.10
- **BarisModRemaster** - Required for tech tree integration

### Integrated APIs
- **CoFH API** - Energy system compatibility (Redstone Flux)
- **Baris Tech Tree** - Progression system integration
- **Custom NPCs** - NPC interaction support
- **Schematica** - Structure building support
- **VeinMiner** - Vein mining support

## 🎯 Getting Started

### Installation
1. Install Minecraft 1.7.10 with Forge
2. Download and install BarisModRemaster (required dependency)
3. Place this mod JAR in your `mods/` folder
4. Create a `/Flan/` folder in your Minecraft directory
5. Download and install content packs in the `/Flan/` folder
6. Launch Minecraft

### Basic Usage

#### Weapons
1. Craft a Flan's Workbench using bowls and iron ingots
2. Use the workbench to craft weapon parts
3. Assemble weapons from parts
4. Load weapons with appropriate ammunition
5. Hold and use weapons with standard controls

#### Vehicles
1. Craft vehicle parts at the Flan's Workbench
2. Assemble complete vehicles
3. Place vehicles in the world
4. Right-click to enter and pilot
5. Use WASD for movement, space for special abilities

#### Teams
1. Use `/teams create <teamname>` to create a team
2. Use `/teams invite <player>` to invite players
3. Place team spawners and flagpoles
4. Customize team colors and armor
5. Manage economy with `/shekel` commands

#### Industrial Systems
1. Build industrial machines from HFR mod
2. Connect power generation to machinery
3. Set up resource extraction and processing
4. Automate production lines
5. Manage energy distribution

## ⚙️ Configuration

### Important Config Options

#### Flan's Mod Settings
- `armorDurability` - Armor durability multiplier (default: 1)
- `gunCarryLimit` - Maximum guns carried (default: 3, disabled by default)
- `driveableUpdateRange` - Vehicle update range (default: 450 blocks)
- `armsEnable` - Enable arm rendering with guns (default: true)
- `casingEnable` - Enable bullet casing particles (default: true)
- `crosshairEnable` - Enable custom crosshairs (default: false)

#### HFR Mod Settings
- `radarRange` - Radar detection range (default: 1000 blocks)
- `nukeRadius` - Nuclear explosion radius (default: 100 blocks)
- `enableStocks` - Enable stock market system (default: true)
- `enableRadar` - Enable radar systems (default: true)
- Energy production values for generators
- Weapon damage multipliers
- Economic system parameters

## 🎨 Content Pack System

Content packs are loaded from the `/Flan/` directory and can contain:

### Supported Content Types
- **Guns** - Custom firearms
- **Vehicles** - Custom ground vehicles
- **Planes** - Custom aircraft
- **Mechas** - Custom mechs
- **AA Guns** - Anti-aircraft weapons
- **Grenades** - Explosive items
- **Bullets** - Ammunition types
- **Attachments** - Weapon modifications
- **Parts** - Crafting components
- **Armor** - Team armor sets
- **Armor Boxes** - Loot containers
- **Gun Boxes** - Weapon crates
- **Tools** - Utility items
- **Player Skins** - Custom player appearances

### Content Pack Structure
```
/Flan/
  └── YourContentPack/
      ├── guns/
      ├── vehicles/
      ├── planes/
      ├── mechas/
      ├── parts/
      ├── textures/
      ├── models/
      └── sounds/
```

## 🔧 Development

### Project Structure
```
src/main/java/
├── com/
│   ├── flansmod/          # Flan's Mod core
│   │   ├── client/        # Client-side rendering
│   │   └── common/        # Shared game logic
│   ├── hfr/               # HFR Mod core
│   │   ├── blocks/        # Custom blocks
│   │   ├── items/         # Custom items
│   │   ├── entity/        # Entities
│   │   ├── tileentity/    # Tile entities
│   │   ├── clowder/       # Faction system
│   │   └── packet/        # Network packets
│   ├── hbm/               # HBM utilities
│   ├── LordWeeder/        # Economy integration
│   └── ...
├── cofh/                  # CoFH API
└── api/                   # Public APIs
```

### Building from Source
```bash
# Setup development environment
./gradlew setupDecompWorkspace

# Build the mod
./gradlew build

# Output will be in build/libs/
```

### API Usage
The mod provides several APIs for integration:
- **Flan's Mod API** - Create custom content programmatically
- **HFR Energy API** - Interface with energy systems
- **Baris Tech Tree** - Add tech tree nodes and requirements

## 🎮 Commands

### Team Commands
- `/teams create <name>` - Create a new team
- `/teams invite <player>` - Invite a player to your team
- `/teams kick <player>` - Remove a player from your team
- `/teams leave` - Leave your current team
- `/teams info` - Display team information

### Economy Commands
- `/shekel` - Display available shekel commands
- `/shekel balance` - Check your balance
- `/shekel pay <player> <amount>` - Transfer currency

### Debug Commands
- Various debug commands available when `DEBUG` mode is enabled

## 🐛 Known Issues

- Some content packs may require specific dependencies
- High-resolution texture packs may impact performance
- Multiplayer sync issues may occur with very high ping
- Some vehicles may clip through terrain at high speeds

## 📝 Credits

### Original Mod Authors
- **jamioflan** - Original Flan's Mod creator
- **HbMinecraft** - HBM's Nuclear Tech Mod
- **LabJac** - Fusion and modifications
- **Baris** - Tech tree system and integrations

### Additional Credits
- All code contributors to the original mods
- Content pack creators
- Community testers and feedback providers

## 📄 License

This mod is provided under the Creative Commons license. See LICENSE.txt for full details.

The RedstoneFlux API is provided under LGPLv3. See `RedstoneFlux API - LICENSE - LGPLv3.txt` for details.

### Key License Points
- **Attribution** - Credit must be given to original authors
- **Non-Commercial** - Not for commercial use without permission
- **ShareAlike** - Derivatives must use same license
- **No Warranty** - Provided as-is without warranty

## 🤝 Contributing

Contributions, bug reports, and feature requests are welcome!

### Content Pack Creation
1. Study existing content packs for format examples
2. Follow naming conventions
3. Test thoroughly before publishing
4. Include proper attribution in your pack

### Code Contributions
1. Fork the repository
2. Create a feature branch
3. Follow existing code style and conventions
4. Test changes thoroughly
5. Submit a pull request with detailed description

## 🔗 Resources

- **Flan's Mod Website**: http://www.flansmod.com
- Content pack repositories
- Wiki and documentation (if available)
- Community forums and Discord servers

## ⚠️ Important Notes

- This mod significantly changes gameplay mechanics
- Recommended for experienced Minecraft players
- May not be compatible with all other mods
- Performance may vary based on content packs installed
- Backup your worlds before installing
- Server operators should review config options carefully

## 🔄 Version History

- **Mark 25843 (February 2021)** - Latest LabJac Edition
  - Integration with Baris Tech Tree
  - Enhanced faction system (Clowder)
  - Improved networking and synchronization
  - Various bug fixes and optimizations

- **Mark 5 (May 2019)** - Previous major release
  - Initial LabJac modifications
  - HFR mod integration
  - Custom content additions

---

**Enjoy building your military industrial complex in Minecraft 1.7.10!** 🚀⚔️🏭
