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

public class PacketMissileWeight extends PacketBase 
{
    public int entityid;
    public ItemStack ammo;
    public int bodyfat = 0;
    
    public PacketMissileWeight() {}
    
    public PacketMissileWeight(int entityid, int bodyfat)
    {
        this.entityid = entityid;
       // this.ammo = missile;
        this.bodyfat = bodyfat;
        
    }
    
    @Override
    public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) 
    {
        data.writeInt(entityid);
        data.writeInt(bodyfat);
       // ByteBufUtils.writeItemStack(data, ammo);
    }

    @Override
    public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) 
    {
        entityid = data.readInt();
       // ammo = ByteBufUtils.readItemStack(data);
        this.bodyfat = data.readInt();
    }

    @Override
    public void handleServerSide(EntityPlayerMP playerEntity) 
    {
    	
    	/*
        Entity e = playerEntity.worldObj.getEntityByID(entityid);
        if(e!=null&&e instanceof EntityDriveable) {
        	EntityDriveable v = (EntityDriveable)e;
            if(v instanceof EntityPlane) {
                DriveableData dd = v.getDriveableData();
                ArrayList<ItemStack> notnull = new ArrayList<ItemStack>();
                ArrayList<ItemStack> notnullBomb = new ArrayList<ItemStack>();
                
                
                for(ItemStack is : dd.missiles) if(is!=null) notnull.add(is);      
                if(notnull.size()>0) {
                	System.out.println("checking missiles");
                	
                    int i = 0;
                    for(ItemStack is : notnull) {
                    	System.out.println("please work 1");
                        i++;
                        if(notnull.get(i) != null && ((notnull.get(i)).getItem()) instanceof ItemBullet && (notnull.get(i)).stackSize > 0)
                        {
                        	System.out.println("please work 2");
                        ItemBullet ammoM = (ItemBullet)((notnull.get(i)).getItem());
                        int missileStackSize = (notnull.get(i)).stackSize; //sostacks of bombs/missiles wont weigh as much as just one bomb/missile
                        bodyfat += ammoM.type.missileWeight * missileStackSize;
                    	System.out.println("adding this missile: " + ammoM + " which weighs " + ammoM.type.missileWeight);
                    	System.out.println("stack is this big: " + missileStackSize);
                    	System.out.println("current weight tally is " + bodyfat);
                        }                     
                    }
                  
                }
                
                
               
                
                for(ItemStack is : dd.bombs) if(is!=null) notnullBomb.add(is);
                if((dd.bombs).length>0) {
                //	System.out.println("checking bombs");
                	
                   // int i2 = 0;
                    for (int i2 = 0; i2 < (dd.bombs).length; i2++)  {
                        //i2++;
                        if( dd.bombs[i2] != null && (dd.bombs[i2].getItem()) != null &&  (dd.bombs[i2].getItem()) instanceof ItemBullet && dd.bombs[i2].stackSize > 0)
                        {
                        ItemBullet ammoB = (ItemBullet)(dd.bombs[i2].getItem());
                        int missileStackSize = dd.bombs[i2].stackSize; //sostacks of bombs/missiles wont weigh as much as just one bomb/missile
                        bodyfat += ammoB.type.missileWeight * missileStackSize;
                    	//System.out.println("adding this bomb: " + ammoB + " which weighs " + ammoB.type.missileWeight);
                    //	System.out.println("stack is this big: " + missileStackSize);
                    //	System.out.println("current weight tally is " + weight);
                        }                     
                    }
                  
                }
                
                dd.addedWeight = bodyfat;
              //  System.out.println("final weight tally is " + bodyfat + " and attempted assigned weight tally is " + v.addedWeight);
                
                
            }
            
            all of this shit was moved to entity driveable itself to do the math. then this packet is solely for transferring the knowledge to client
        } */
        
    	
        Entity e = playerEntity.worldObj.getEntityByID(entityid);
        if(e!=null&&e instanceof EntityDriveable) {
        	EntityDriveable v = (EntityDriveable)e;
            if(v instanceof EntityPlane) {
                DriveableData dd = v.getDriveableData();
        dd.addedWeight = bodyfat;
    }
        }
    }
    

    @Override
    public void handleClientSide(EntityPlayer clientPlayer) 
    { 
    	
    	 Entity e = clientPlayer.worldObj.getEntityByID(entityid);
         if(e!=null&&e instanceof EntityDriveable) {
         	
         	
             if(e instanceof EntityPlane) {
                 DriveableData dd = ((EntityDriveable) e).getDriveableData();
    	 dd.addedWeight = bodyfat;
             }
         }
    	
    	
    	/* all of this shit was moved to entitydriveable
    	
    	 //System.out.println("trying to work clientside");
        Entity e = clientPlayer.worldObj.getEntityByID(entityid);
        if(e!=null&&e instanceof EntityDriveable) {
        	
        	
            if(e instanceof EntityPlane) {
                DriveableData dd = ((EntityDriveable) e).getDriveableData();
                ArrayList<ItemStack> notnull = new ArrayList<ItemStack>();
                ArrayList<ItemStack> notnullBomb = new ArrayList<ItemStack>();
                
                
                for(ItemStack is : dd.missiles) if(is!=null) notnull.add(is);      
                if(notnull.size()>0) {
                	System.out.println("checking missiles");
                	
                    int i = 0;
                    for(ItemStack is : notnull) {
                    	System.out.println("please work 1");
                        i++;
                        if(notnull.get(i) != null && ((notnull.get(i)).getItem()) instanceof ItemBullet && (notnull.get(i)).stackSize > 0)
                        {
                        	System.out.println("please work 2");
                        ItemBullet ammoM = (ItemBullet)((notnull.get(i)).getItem());
                        int missileStackSize = (notnull.get(i)).stackSize; //sostacks of bombs/missiles wont weigh as much as just one bomb/missile
                        bodyfat += ammoM.type.missileWeight * missileStackSize;
                    	System.out.println("adding this missile: " + ammoM + " which weighs " + ammoM.type.missileWeight);
                    	System.out.println("stack is this big: " + missileStackSize);
                    	System.out.println("current weight tally is " + bodyfat);
                        }                     
                    }
                  
                }
                
                
               
                
                for(ItemStack is : dd.bombs) if(is!=null) notnullBomb.add(is);
                if((dd.bombs).length>0) {
                	//System.out.println("checking client bombs");
                	
                   // int i2 = 0;
                    for (int i2 = 0; i2 < (dd.bombs).length; i2++)  {
                        //i2++;
                        if( dd.bombs[i2] != null && (dd.bombs[i2].getItem()) != null &&  (dd.bombs[i2].getItem()) instanceof ItemBullet && dd.bombs[i2].stackSize > 0)
                        {
                        ItemBullet ammoB = (ItemBullet)(dd.bombs[i2].getItem());
                        int missileStackSize = dd.bombs[i2].stackSize; //sostacks of bombs/missiles wont weigh as much as just one bomb/missile
                        bodyfat += ammoB.type.missileWeight * missileStackSize;
                    	//System.out.println("adding this bomb: " + ammoB + " which weighs " + ammoB.type.missileWeight);
                    	//System.out.println("stack is this big: " + missileStackSize);
                    	//System.out.println("current weight tally is " + bodyfat);
                        }                     
                    }
                  
                }
                
                dd.addedWeight = bodyfat;
              //  System.out.println("final weight tally is " + bodyfat + " and attempted assigned weight tally is " + ((EntityDriveable) e).addedWeight);
                
                
            }
            
            
            
        	//System.out.println("added weight: " + ((EntityDriveable)e).addedWeight + "   bodyfat: " + bodyfat);
        	//System.out.println("ioverwriting ammo: " + missile);
            //((EntityDriveable)e).addedWeight = 1488;
        }  */
    }

}