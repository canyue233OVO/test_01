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
- **Faction Management** - Create and manage factions
- **Territory Control** - Claim and protect territory
- **Warping** - Teleportation within faction territory
- **Fabrication** - Faction-specific crafting
- **Prestige System** - Ranking and progression

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
