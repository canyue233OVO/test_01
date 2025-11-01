package com.flansmod.client;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiChat;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import org.lwjgl.input.Keyboard;

import com.flansmod.api.IControllable;
import com.flansmod.client.gui.GuiTeamScores;
import com.flansmod.client.gui.GuiTeamSelect;
import com.flansmod.common.FlansMod;
import com.flansmod.common.driveables.DriveableType;
import com.flansmod.common.driveables.VehicleType;
import com.flansmod.common.network.PacketGiveItem;
import com.flansmod.common.network.PacketGunMode;
import com.flansmod.common.network.PacketReload;
import com.flansmod.common.network.PacketRequestDebug;

import com.flansmod.common.network.PacketBolterino;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent.KeyInputEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(value = Side.CLIENT)
public class KeyInputHandler
{
    //public static KeyBinding WKey = new KeyBinding("Forward Melee", Keyboard.KEY_W, "Flan's Mod");
    //public static KeyBinding decelerateKey = new KeyBinding("Decelerate Key", Keyboard.KEY_S, "Flan's Mod");
    //public static KeyBinding AKey = new KeyBinding("Left Melee", Keyboard.KEY_A, "Flan's Mod");
    //public static KeyBinding DKey = new KeyBinding("Right Melee", Keyboard.KEY_D, "Flan's Mod");
    //public static KeyBinding upKey = new KeyBinding("Up Key", Keyboard.KEY_SPACE, "Flan's Mod");
    public static KeyBinding downKey = new KeyBinding("下降键 / 瞄准镜", Keyboard.KEY_LCONTROL, "Flan's Mod");
    //public static KeyBinding exitKey = new KeyBinding("Exit Key", Keyboard.KEY_LSHIFT, "Flan's Mod");
    public static KeyBinding inventoryKey = new KeyBinding("物品栏键", Keyboard.KEY_R, "Flan's Mod");
    public static KeyBinding gunKey = new KeyBinding("对接键", Keyboard.KEY_G, "Flan's Mod");
    public static KeyBinding controlSwitchKey = new KeyBinding("水面键 / 控制切换键", Keyboard.KEY_C, "Flan's Mod");
    public static KeyBinding bombKey = new KeyBinding("解除对接键", Keyboard.KEY_J, "Flan's Mod");
    public static KeyBinding reloadKey = new KeyBinding("装填键", Keyboard.KEY_R, "Flan's Mod");
    public static KeyBinding gunModeKey = new KeyBinding("枪械模式", Keyboard.KEY_F, "Flan's Mod");
    public static KeyBinding teamsMenuKey = new KeyBinding("团队菜单键", Keyboard.KEY_G, "Flan's Mod");
    public static KeyBinding teamsScoresKey = new KeyBinding("团队分数键", Keyboard.KEY_H, "Flan's Mod");
    public static KeyBinding leftRollKey = new KeyBinding("左翻滚 / 炮塔锁定", Keyboard.KEY_Z, "Flan's Mod");
    public static KeyBinding rightRollKey = new KeyBinding("右翻滚 / 炮塔解锁", Keyboard.KEY_X, "Flan's Mod");
    public static KeyBinding gearKey = new KeyBinding("起落架升降键 / 手动俯冲", Keyboard.KEY_L, "Flan's Mod");
    public static KeyBinding doorKey = new KeyBinding("雷达范围 / 舱门切换键", Keyboard.KEY_K, "Flan's Mod");
    public static KeyBinding modeKey = new KeyBinding("俯冲键 / 垂直起降 / 手动拉升", Keyboard.KEY_V, "Flan's Mod");
    public static KeyBinding flareKey = new KeyBinding("热焰弹键 / 舰船修理", Keyboard.KEY_N, "Flan's Mod");
    public static KeyBinding trimKey = new KeyBinding("后燃器 / 战争应急功率键", Keyboard.KEY_F, "Flan's Mod");
    public static KeyBinding debugKey = new KeyBinding("调试键", Keyboard.KEY_F10, "Flan's Mod");
    public static KeyBinding reloadModelsKey = new KeyBinding("重载模型键", Keyboard.KEY_F9, "Flan's Mod");
    public static KeyBinding secondaryKey = new KeyBinding("选择下挂武器", Keyboard.KEY_K, "Flan's Mod");
    public static KeyBinding nintendoSwitch = new KeyBinding("轰炸瞄准具切换", Keyboard.KEY_F, "Flan's Mod");
    //public static KeyBinding zoomKey = new KeyBinding("Zoom Key", 2 - 100, "Flan's Mod");
    public static KeyBinding s0 = new KeyBinding("驾驶员座位", Keyboard.KEY_0, "Flan's Mod");
    public static KeyBinding s1 = new KeyBinding("乘客炮位 1", Keyboard.KEY_1, "Flan's Mod");
    public static KeyBinding s2 = new KeyBinding("乘客炮位 2", Keyboard.KEY_2, "Flan's Mod");
    public static KeyBinding s3 = new KeyBinding("乘客炮位 3", Keyboard.KEY_3, "Flan's Mod");
    public static KeyBinding s4 = new KeyBinding("乘客炮位 4", Keyboard.KEY_4, "Flan's Mod");
    public static KeyBinding s5 = new KeyBinding("乘客炮位 5", Keyboard.KEY_5, "Flan's Mod");
    public static KeyBinding s6 = new KeyBinding("乘客炮位 6", Keyboard.KEY_6, "Flan's Mod");
    public static KeyBinding s7 = new KeyBinding("乘客炮位 7", Keyboard.KEY_7, "Flan's Mod");
    public static KeyBinding s8 = new KeyBinding("乘客炮位 8", Keyboard.KEY_8, "Flan's Mod");
    public static KeyBinding s9 = new KeyBinding("乘客炮位 9", Keyboard.KEY_9, "Flan's Mod");
    public static KeyBinding eject = new KeyBinding("发射乘客炮位武器", Keyboard.KEY_O, "Flan's Mod");
    public static KeyBinding openBorders = new KeyBinding("驱逐/允许乘客", Keyboard.KEY_P, "Flan's Mod");
    public static KeyBinding bolterino = new KeyBinding("手动拉栓", Keyboard.KEY_C, "Flan's Mod");
    public static KeyBinding thermal = new KeyBinding("热成像 / 夜视仪", Keyboard.KEY_Y, "Flan's Mod");
    public static KeyBinding artilleryMode = new KeyBinding("魔法相机", Keyboard.KEY_U, "Flan's Mod");
    public static KeyBinding repairKey = new KeyBinding("修理键", Keyboard.KEY_I, "Flan's Mod");
    public static KeyBinding activeRadar = new KeyBinding("主动雷达切换", Keyboard.KEY_F8, "Flan's Mod");
    public static KeyBinding switchWeapon = new KeyBinding("弹药切换", Keyboard.KEY_B, "Flan's Mod");
    public static KeyBinding missileUp = new KeyBinding("导弹上", Keyboard.KEY_UP, "Flan's Mod");
    public static KeyBinding missileDown = new KeyBinding("导弹下", Keyboard.KEY_DOWN, "Flan's Mod");
    public static KeyBinding missileLeft = new KeyBinding("导弹左", Keyboard.KEY_LEFT, "Flan's Mod");
    public static KeyBinding missileRight = new KeyBinding("导弹右", Keyboard.KEY_RIGHT, "Flan's Mod");
    public static KeyBinding targetSwitch = new KeyBinding("切换导弹目标锁定", Keyboard.KEY_M, "Flan's Mod");
    Minecraft mc;

    public KeyInputHandler()
    {
        //ClientRegistry.registerKeyBinding(WKey);
        //ClientRegistry.registerKeyBinding(decelerateKey);
        //ClientRegistry.registerKeyBinding(AKey);
        //ClientRegistry.registerKeyBinding(DKey);
        //ClientRegistry.registerKeyBinding(upKey);
        ClientRegistry.registerKeyBinding(downKey);
        //ClientRegistry.registerKeyBinding(exitKey);
        ClientRegistry.registerKeyBinding(inventoryKey);
        ClientRegistry.registerKeyBinding(gunKey);
        ClientRegistry.registerKeyBinding(controlSwitchKey);
        ClientRegistry.registerKeyBinding(bombKey);
        ClientRegistry.registerKeyBinding(reloadKey);
        ClientRegistry.registerKeyBinding(gunModeKey);
        ClientRegistry.registerKeyBinding(teamsMenuKey);
        ClientRegistry.registerKeyBinding(teamsScoresKey);
        ClientRegistry.registerKeyBinding(leftRollKey);
        ClientRegistry.registerKeyBinding(rightRollKey);
        ClientRegistry.registerKeyBinding(gearKey);
        ClientRegistry.registerKeyBinding(doorKey);
        ClientRegistry.registerKeyBinding(trimKey);
        ClientRegistry.registerKeyBinding(modeKey);
        ClientRegistry.registerKeyBinding(flareKey);
        ClientRegistry.registerKeyBinding(debugKey);
        ClientRegistry.registerKeyBinding(reloadModelsKey);
        //ClientRegistry.registerKeyBinding(zoomKey);
        //ClientRegistry.registerKeyBinding(selectorKey);
        ClientRegistry.registerKeyBinding(secondaryKey);
        ClientRegistry.registerKeyBinding(nintendoSwitch);
        ClientRegistry.registerKeyBinding(s0);
        ClientRegistry.registerKeyBinding(s1);
        ClientRegistry.registerKeyBinding(s2);
        ClientRegistry.registerKeyBinding(s3);
        ClientRegistry.registerKeyBinding(s4);
        ClientRegistry.registerKeyBinding(s5);
        ClientRegistry.registerKeyBinding(s6);
        ClientRegistry.registerKeyBinding(s7);
        ClientRegistry.registerKeyBinding(s8);
        ClientRegistry.registerKeyBinding(s9);
        ClientRegistry.registerKeyBinding(eject);
        ClientRegistry.registerKeyBinding(openBorders);
        ClientRegistry.registerKeyBinding(thermal);
        ClientRegistry.registerKeyBinding(artilleryMode);
        ClientRegistry.registerKeyBinding(bolterino);
        ClientRegistry.registerKeyBinding(repairKey);
        ClientRegistry.registerKeyBinding(activeRadar);
        ClientRegistry.registerKeyBinding(switchWeapon);
        ClientRegistry.registerKeyBinding(missileUp);
        ClientRegistry.registerKeyBinding(missileDown);
        ClientRegistry.registerKeyBinding(missileLeft);
        ClientRegistry.registerKeyBinding(missileRight);
        ClientRegistry.registerKeyBinding(targetSwitch);

        mc = Minecraft.getMinecraft();
    }

    @SubscribeEvent
    public void onKeyInput(KeyInputEvent event)
    {
        if(FMLClientHandler.instance().isGUIOpen(GuiChat.class) || mc.currentScreen != null)
            return;

        EntityPlayer player = mc.thePlayer;
        Entity ridingEntity = player.ridingEntity;

        //Handle universal keys
        if(teamsMenuKey.isPressed())
        {
            mc.displayGuiScreen(new GuiTeamSelect());
            return;
        }
        if(teamsScoresKey.isPressed())
        {
            mc.displayGuiScreen(new GuiTeamScores());
            return;
        }
        if(reloadKey.isPressed() && FlansModClient.shootTime(false) <= 0)
        {
            FlansMod.getPacketHandler().sendToServer(new PacketReload(false));
            return;
        }

        if(gunModeKey.isPressed())
        {
            //could this be secret to directional blocking?!
            FlansMod.getPacketHandler().sendToServer(new PacketGunMode(1));
            return;
        }
        
        
        if(bolterino.isPressed())
        {
            //bolt action attempt
            FlansMod.getPacketHandler().sendToServer(new PacketBolterino(true));
            return;
        }
        
        //ahem fuck underbarrel
        if(secondaryKey.isPressed())
        {
            FlansMod.getPacketHandler().sendToServer(new PacketGunMode(2));
            return;
        }
        //ahem fuck underbarrel
        if(debugKey.isPressed())
        {
            if(FlansMod.DEBUG)
                FlansMod.DEBUG = false;
            else
            {
                FlansMod.packetHandler.sendToServer(new PacketRequestDebug());
            }
        }
        if(reloadModelsKey.isPressed())
        {
            FlansModClient.reloadModels(Keyboard.isKeyDown(Keyboard.KEY_LSHIFT));
        }
        

        //Handle driving keys
        if(ridingEntity instanceof IControllable)
        {
            IControllable riding = (IControllable)ridingEntity;
            if(mc.gameSettings.keyBindForward.isPressed())//if(accelerateKey.isPressed())
                riding.pressKey(0, player);
            if(mc.gameSettings.keyBindBack.isPressed())//if(decelerateKey.isPressed())
                riding.pressKey(1, player);
            if(mc.gameSettings.keyBindLeft.isPressed())//if(leftKey.isPressed())
                riding.pressKey(2, player);
            if(mc.gameSettings.keyBindRight.isPressed())//if(rightKey.isPressed())
                riding.pressKey(3, player);
            if(mc.gameSettings.keyBindJump.isPressed())//if(upKey.isPressed())
                riding.pressKey(4, player);
            if(downKey.isPressed())
                riding.pressKey(5, player);
            if(mc.gameSettings.keyBindSneak.isPressed())//if(exitKey.isPressed())
                riding.pressKey(6, player);
            if(mc.gameSettings.keyBindInventory.isPressed() || inventoryKey.isPressed())
                riding.pressKey(7, player);
            if(bombKey.isPressed())
                riding.pressKey(8, player);
            if(gunKey.isPressed())
                riding.pressKey(9, player);
            if(controlSwitchKey.isPressed())
                riding.pressKey(10, player);
            if(leftRollKey.isPressed())
                riding.pressKey(11, player);
            if(rightRollKey.isPressed())
                riding.pressKey(12, player);
            if(gearKey.isPressed())
                riding.pressKey(13, player);
            if(doorKey.isPressed())
                riding.pressKey(14, player);
            if(modeKey.isPressed())
                riding.pressKey(15, player);
            if(trimKey.isPressed())
                riding.pressKey(16, player);
            //if(diveKey.isPressed())
                //riding.pressKey(17, player);
            if(flareKey.isPressed())
                riding.pressKey(18, player);
            if(nintendoSwitch.isPressed())
                riding.pressKey(19, player);
            
            if(s0.isPressed())
                riding.pressKey(20, player);
            if(s1.isPressed())
                riding.pressKey(21, player);
            if(s2.isPressed())
                riding.pressKey(22, player);
            if(s3.isPressed())
                riding.pressKey(23, player);
            if(s4.isPressed())
                riding.pressKey(24, player);
            if(s5.isPressed())
                riding.pressKey(25, player);
            if(s6.isPressed())
                riding.pressKey(26, player);
            if(s7.isPressed())
                riding.pressKey(27, player);
            if(s8.isPressed())
                riding.pressKey(28, player);
            if(s9.isPressed())
                riding.pressKey(29, player);
            if(eject.isPressed())
                riding.pressKey(30, player);
            if(openBorders.isPressed())
                riding.pressKey(31, player);
            
            if(thermal.isPressed())
                riding.pressKey(32, player);
            
            if(artilleryMode.isPressed())
                riding.pressKey(33, player);
            
            if(repairKey.isPressed())
                riding.pressKey(34, player);
            
            if(activeRadar.isPressed())
                riding.pressKey(35, player);
            
            if(switchWeapon.isPressed())
                riding.pressKey(36, player);
            
            if(missileUp.isPressed())
                riding.pressKey(37, player);
            if(missileDown.isPressed())
                riding.pressKey(38, player);
            if(missileLeft.isPressed())
                riding.pressKey(39, player);
            if(missileRight.isPressed())
                riding.pressKey(40, player);
            if(targetSwitch.isPressed())
                riding.pressKey(41, player);

            /*
            for(KeyBinding key : mc.gameSettings.keyBindings )
            {
                if(key.isPressed())
                {
                    key.pressed = true;
                    key.pressTime = 1;
                }
            }
            */
        }
    }
}
