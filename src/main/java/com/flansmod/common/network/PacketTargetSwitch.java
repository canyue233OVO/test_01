package com.flansmod.common.network;

import java.util.ArrayList;

import com.flansmod.common.FlansMod;
import com.flansmod.common.driveables.DriveableData;
import com.flansmod.common.driveables.EntityDriveable;
import com.flansmod.common.driveables.EntityPlane;
import com.flansmod.common.guns.ItemBullet;

import cpw.mods.fml.common.network.ByteBufUtils;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;

public class PacketTargetSwitch extends PacketBase 
{
    public int entityidTarget;
    public int entityidTarget2;

    public int DriveableID;
    
    public PacketTargetSwitch() {}
    
    public PacketTargetSwitch(int entityid, int entityid2, int DriveableID)
    {
        this.entityidTarget = entityid;
        this.entityidTarget2 = entityid2;
        this.DriveableID = DriveableID;
        
    }
    
    @Override
    public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) 
    {
        data.writeInt(entityidTarget);
        data.writeInt(entityidTarget2);
        data.writeInt(DriveableID);
    }

    @Override
    public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) 
    {
    	entityidTarget = data.readInt();
    	entityidTarget2 = data.readInt();
    	DriveableID = data.readInt();
    }

    @Override
    public void handleServerSide(EntityPlayerMP playerEntity) 
    {
    	Entity LockedTarget = null;
    	Entity ToggleLocked = null; 
    	Entity Vehicle = null;
    //	System.out.println("Trying to work serverside. Here are the id numbers: lockedTarget:" + entityidTarget + "  togglelock:" + entityidTarget2 + "  vehicle:" +  DriveableID); //this method is defecitve, for unknown reasons the id never works for togglelocked target
    	if(DriveableID!=25843)
       	 Vehicle = playerEntity.worldObj.getEntityByID(DriveableID); 
    	if(Vehicle != null && Vehicle instanceof EntityDriveable)  //method 2 is more effective since the vehicle id is not defective
    	{
    		LockedTarget= ((EntityDriveable)Vehicle).LockedTarget;
    		ToggleLocked= ((EntityDriveable)Vehicle).ToggleLocked;
    	}
    	else
    	{
    	if(entityidTarget!=25843)
    		LockedTarget = playerEntity.worldObj.getEntityByID(entityidTarget);
    	if(entityidTarget2!=25843) 
    	 ToggleLocked = playerEntity.worldObj.getEntityByID(entityidTarget2); 
    	}
    	
    	if(LockedTarget!=null)
    	entityidTarget = LockedTarget.getEntityId(); //this is so client can learn the correct entity too
    	if(ToggleLocked!=null)
    	entityidTarget2 = ToggleLocked.getEntityId();
    	
    	
    	if(Vehicle instanceof EntityDriveable)
    	{
    		
		if(LockedTarget != null && ToggleLocked!=null)
		{
		PacketPlaySound.sendSoundPacket(playerEntity.posX, playerEntity.posY, playerEntity.posZ, 10f, playerEntity.dimension, "AnalogComputerSound", false);
		Entity temporary = ToggleLocked;
		//System.out.println("temporary: " + temporary);    	
		ToggleLocked = LockedTarget;
		//System.out.println("toggle lock: " + ToggleLocked);
		LockedTarget = temporary;
		//System.out.println("new target: " + LockedTarget);
		
		if(playerEntity!=null)
		{
			if(LockedTarget !=null && LockedTarget instanceof EntityDriveable && ((EntityDriveable)LockedTarget).getDriveableType()!=null)
				playerEntity.addChatMessage(new ChatComponentText("Switching Target to " + ((EntityDriveable)LockedTarget).getDriveableType().name));
			else
				playerEntity.addChatMessage(new ChatComponentText("Switching Target"));
		}
		
		}
		else if (LockedTarget != null && ToggleLocked==null)
		{
			ToggleLocked=LockedTarget;
			LockedTarget=null;
			if(playerEntity!=null)
			{
					playerEntity.addChatMessage(new ChatComponentText("Acquiring Target to Switch to"));
			}
		}
		else if (ToggleLocked!=null && LockedTarget != null)
		{
			LockedTarget=ToggleLocked;
			if(playerEntity!=null)
			{
				if(LockedTarget !=null && LockedTarget instanceof EntityDriveable && ((EntityDriveable)LockedTarget).getDriveableType()!=null)
					playerEntity.addChatMessage(new ChatComponentText("Switching Target to " + ((EntityDriveable)LockedTarget).getDriveableType().name));
				else
					playerEntity.addChatMessage(new ChatComponentText("Switching Target"));
			}
		}
		else
		{
			playerEntity.addChatMessage(new ChatComponentText("No Valid Targets to Switch to"));
		}
		
    	}
        
        if(Vehicle!=null && Vehicle instanceof EntityDriveable)
        {
        	//System.out.println("Oh Lordy, please work");
        	((EntityDriveable)Vehicle).LockedTarget=LockedTarget;
        	((EntityDriveable)Vehicle).ToggleLocked=ToggleLocked;
        	//if(LockedTarget!=null)
        	//System.out.println("target: " + LockedTarget + "   and coordinates: X " + LockedTarget.posX + "  Y " + LockedTarget.posY + "  Z " + LockedTarget.posZ);
        	//if(ToggleLocked!=null)
            //	System.out.println("ToggleLocked: " + ToggleLocked);
        }
    	
    	
        }
    
    

    @Override
    public void handleClientSide(EntityPlayer clientPlayer) 
    { 
    	
    	Entity LockedTarget = null;
    	Entity ToggleLocked = null; 
    	Entity Vehicle = null;
    	
    	//System.out.println("vehicle id: " + DriveableID + "   and the entity " + clientPlayer.worldObj.getEntityByID(DriveableID));
    	
   	 Vehicle = clientPlayer.worldObj.getEntityByID(DriveableID); 
   	 
    	if(entityidTarget!=25843)
    		LockedTarget = clientPlayer.worldObj.getEntityByID(entityidTarget);
    	if(entityidTarget2!=25843) 
    	 ToggleLocked = clientPlayer.worldObj.getEntityByID(entityidTarget2); 
    	

    	if(Vehicle instanceof EntityDriveable)
    	{
    		EntityDriveable trueVehicle = (EntityDriveable)Vehicle;
    		trueVehicle.LockedTarget = LockedTarget;
    		trueVehicle.ToggleLocked = ToggleLocked;  //so clientside will learn correct target too
    	//	System.out.println("clientside target: " + LockedTarget + "   and toggleLocked " + ToggleLocked);
    	}
    	
    }

}