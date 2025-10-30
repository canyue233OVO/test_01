package com.hfr.rvi;

import org.lwjgl.opengl.GL11;

import com.flansmod.client.FlansModResourceHandler;
import com.flansmod.client.model.ModelDriveable;
import com.flansmod.common.driveables.DriveableType;
import com.flansmod.common.driveables.EntityDriveable;
import com.flansmod.common.driveables.mechas.MechaType;
import com.hfr.lib.RefStrings;

import cpw.mods.fml.client.FMLClientHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;

public class RVICommon {

	private static final ResourceLocation hudVehicle = new ResourceLocation(RefStrings.MODID + ":textures/hud/hudVehicle.png");
	private static final ResourceLocation hudShip = new ResourceLocation(RefStrings.MODID + ":textures/hud/hudShip.png");
	private static final ResourceLocation hudPlane = new ResourceLocation(RefStrings.MODID + ":textures/hud/hudPlane.png");
	private static final ResourceLocation hudHeli = new ResourceLocation(RefStrings.MODID + ":textures/hud/hudHeli.png");
	private static final ResourceLocation hudFriend = new ResourceLocation(RefStrings.MODID + ":textures/hud/hudSquareFriend.png");
	private static final ResourceLocation hudEnemy = new ResourceLocation(RefStrings.MODID + ":textures/hud/hudSquareEnemy.png");

	public static class Indicator {
		
		public String vehicleName;
		public RVIType type;
		public double x;
		public double y;
		public double z;
		// rotation
		public double rx; //i only needed the yaw rotation
		public double ry;
		public double rz;
		// motion, if there is no entity.motion you can do entity.x - entity.prevX etc
		public double mx;
		public double my;
		public double mz;
		public long lastUpdate;
		
		public Indicator(String vehicleName, RVIType type, double x, double y, double z, double rx, double ry, double rz, double mx, double my, double mz, long l) {
			this.vehicleName = vehicleName;
			// this.type = RVIType.GENERIC;
			this.type = type;
			this.x = x;
			this.y = y;
			this.z = z;
			this.rx = rx;
			this.ry = ry;
			this.rz = rz;
			this.mx = mx;
			this.my = my;
			this.mz = mz;
			this.lastUpdate = l;
		}
		//public Indicator(double x, double y, double z, RVIType type, EntityDriveable target)
		// public Indicator(double x, double y, double z, RVIType type) {
			//this(x, y, z);
			//this.type = type;
			
			/*
			if(target != null)
			{
			DriveableType targetType = target.getDriveableType();
			ModelDriveable model = targetType.model;
			
			
			if (model != null)
			{
			GL11.glPushMatrix();
			GL11.glEnable(GL11.GL_DEPTH_TEST);
			GL11.glEnable(GL11.GL_ALPHA_TEST);
			GL11.glTranslatef(69 / 2 - 46, 69 /2 - 10, 100);
			if(targetType instanceof MechaType)
				GL11.glTranslatef(0, 15, 0);
			GL11.glScalef(-50F * targetType.modelScale / targetType.cameraDistance, 50F * targetType.modelScale / targetType.cameraDistance, 50F * targetType.modelScale / targetType.cameraDistance);
			GL11.glRotatef(180F, 0F, 0F, 1F);
			GL11.glRotatef(30F, 1F, 0F, 0F);
			//696 is where the spinner ticker used to be
			GL11.glRotatef(696 / 5F, 0F, 1F, 0F);
			FMLClientHandler.instance().getClient().renderEngine.bindTexture(FlansModResourceHandler.getTexture(targetType));
			if( targetType.model != null )
			{
				targetType.model.render(targetType);
			}
			GL11.glDisable(GL11.GL_DEPTH_TEST);
			GL11.glDisable(GL11.GL_ALPHA_TEST);
			GL11.glPopMatrix();
		}
			} */
			
		//}
	}
	
	public static enum RVIType {

		GENERIC(new ResourceLocation(RefStrings.MODID + ":textures/hud/toaster.png")),
		VEHICLE(hudVehicle),
		SHIP(hudShip),
		PLANE(hudPlane),
		HELI(hudHeli),
		FRIEND(hudFriend),
		ENEMY(hudEnemy);
		
		public ResourceLocation texture;
		
		private RVIType(ResourceLocation texture) {
			this.texture = texture;
		}
		
		
			
	}
}
