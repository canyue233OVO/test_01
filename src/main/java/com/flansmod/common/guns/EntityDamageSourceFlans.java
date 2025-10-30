package com.flansmod.common.guns;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;

import net.minecraft.util.EntityDamageSourceIndirect;
import net.minecraft.util.IChatComponent;

import com.flansmod.common.FlansMod;
import com.flansmod.common.PlayerHandler;
import com.flansmod.common.network.PacketKillMessage;
import com.flansmod.common.network.PacketPlaySound;
import com.flansmod.common.teams.Team;
import com.flansmod.common.types.InfoType;

public class EntityDamageSourceFlans extends EntityDamageSourceIndirect {

    public InfoType weapon;
    public EntityPlayer shooter;
    public boolean headshot;
    public boolean melee;

    public EntityDamageSourceFlans(String s, Entity entity, EntityPlayer player, InfoType wep, boolean head, boolean isMelee) {
        super(s, entity, player);
        weapon = wep;
        shooter = player;
        headshot = head;
        melee = isMelee;
    }

    public Entity getDamageSourceEntity() {
        return this.damageSourceEntity;
    }

    @Override
    public IChatComponent func_151519_b(EntityLivingBase living) {
        if (!(living instanceof EntityPlayer) || shooter == null || PlayerHandler.getPlayerData(shooter) == null) {
            return super.func_151519_b(living);
        }
        EntityPlayer player = (EntityPlayer) living;
        Team killedTeam = PlayerHandler.getPlayerData(player).team;
        Team killerTeam = PlayerHandler.getPlayerData(shooter).team;

        float dist = player.getDistanceToEntity(shooter);
        
        //for funny death noise july 1 2023
        (PlayerHandler.getPlayerData(player)).died++;

        //for killstreak system june 23 2023
        (PlayerHandler.getPlayerData(shooter)).killStreak++; //add 1 kill to streak
        (PlayerHandler.getPlayerData(shooter)).killStreakTimer = 0; //reset the 4 second timer
        
        
        if((PlayerHandler.getPlayerData(shooter)).killStreak > 1)
        {
        	return new ChatComponentText(EnumChatFormatting.DARK_GREEN + shooter.getCommandSenderName() + 
                    EnumChatFormatting.DARK_AQUA + "'s Kill Streak: " + EnumChatFormatting.RED + Integer.toString(((PlayerHandler.getPlayerData(shooter)).killStreak )) + " kills"); //display kill streak
                      }
        
        //crasherinos caused here by    shooter.getHeldItem().getItemDamage(),   so will use extra ivermectin       
        if(weapon != null && shooter != null && shooter.getHeldItem() != null) //heavy duty ivermectin
        {
        FlansMod.getPacketHandler().sendToDimension(
                new PacketKillMessage(
                        headshot,
                        weapon,
                        shooter.getHeldItem().getItemDamage(),
                        ((killedTeam == null ? "f" : killedTeam.textColour) + player.getCommandSenderName()),
                        ((killerTeam == null ? "f" : killerTeam.textColour) + shooter.getCommandSenderName()),
                        dist
                    ),
                living.dimension);
        }
        
                
        return new ChatComponentText(
            EnumChatFormatting.DARK_GRAY + "[" + EnumChatFormatting.RED + "Flansmod" + EnumChatFormatting.DARK_GRAY + "] "
            + EnumChatFormatting.ITALIC + EnumChatFormatting.DARK_RED + player.getCommandSenderName() +
            EnumChatFormatting.RESET + EnumChatFormatting.GRAY + " Was killed by " +
            EnumChatFormatting.ITALIC + EnumChatFormatting.DARK_GREEN + shooter.getCommandSenderName() +
            (FlansMod.showDistanceInKillMessage ? 
            "" + EnumChatFormatting.RESET + EnumChatFormatting.GRAY + " from " +
            EnumChatFormatting.ITALIC + EnumChatFormatting.DARK_AQUA + String.format("%.1f", dist) + "m" +
            EnumChatFormatting.RESET + EnumChatFormatting.GRAY + " away" : "")
            );
        
      
    }
}
