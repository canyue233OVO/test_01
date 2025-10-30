package com.hfr.render.hud;

import java.util.ArrayList;
import java.util.List;

import org.lwjgl.opengl.GL11;

import com.flansmod.client.FlansModResourceHandler;
import com.flansmod.client.model.ModelPlane;
import com.flansmod.common.driveables.ItemVehicle;
import com.flansmod.common.driveables.PlaneType;
import com.flansmod.common.driveables.VehicleType;
import com.flansmod.common.teams.TeamsManager;
import com.flansmod.common.driveables.DriveableType;
import com.hfr.rvi.RVICommon.Indicator;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.item.Item;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;

public class RenderRVIOverlay {
	
	private static final int GL_LIGHT0 = 0; //trying to make a shitty light source

	public static List<Indicator> indicators = new ArrayList();
	
	public static void renderIndicators(float interpolation) {
		
		GL11.glPushMatrix();
		Minecraft minecraft = Minecraft.getMinecraft();
		//GL11.glDisable(GL11.GL_CULL_FACE); causes see through wall
		//GL11.glDisable(2929); causes see through wall
       // GL11.glDepthMask(false); causes see through wall
        //GL11.glDisable(GL11.GL_FOG);
		
		ScaledResolution res = new ScaledResolution(Minecraft.getMinecraft(), minecraft.displayWidth, minecraft.displayHeight);
		int width = res.getScaledWidth();
		int height = res.getScaledHeight();
		
		EntityPlayerSP player = Minecraft.getMinecraft().thePlayer;

		double x = player.lastTickPosX + (player.posX - player.lastTickPosX) * interpolation;
		double y = player.lastTickPosY + (player.posY - player.lastTickPosY) * interpolation;
		double z = player.lastTickPosZ + (player.posZ - player.lastTickPosZ) * interpolation;
		
		long l = System.currentTimeMillis();
		
		for(Indicator ind : indicators) {
			
			GL11.glPushMatrix(); //old
			
			GL11.glScaled(0.1, 0.1, 0.1);
			GL11.glEnable(GL11.GL_LIGHTING); //please no more glow in the dark or blacked planes 2025
			GL11.glScaled(10, 10, 10);
			

			
			
			
			minecraft.getTextureManager().bindTexture(ind.type.texture);
			Vec3 vec = Vec3.createVectorHelper(x - ind.x, y - ind.y, z - ind.z);
			vec.rotateAroundY((float) Math.toRadians(1));
			
			double dist = vec.lengthVector();
			

			double yaw = 360 + 90 + Math.toDegrees(Math.atan2(vec.xCoord, vec.zCoord));
			
			if(yaw < 0.0D) {
				yaw += 360.0D;
			}
			
			double pitch = Math.toDegrees(Math.tan(vec.yCoord / dist));
			
			double pYaw = Math.abs(player.rotationYaw);
			
			if(pYaw < 0.0D) {
				pYaw += 360.0D;
			}
			
			double diff = 0;//(yaw - pYaw) * 0.01;
			
			float adjuster = 1; //tick rate is kind of disobeyed at faster rate so need to nerf the speeds
			if(TeamsManager.rviRate < 3)
				adjuster = 0.12f;  
			else if(TeamsManager.rviRate < 8)
				adjuster = 0.17f;
			else if(TeamsManager.rviRate < 12)
				adjuster = 0.27f;
			else if(TeamsManager.rviRate < 16)
				adjuster = 0.4f;
			else if(TeamsManager.rviRate < 20)
				adjuster = 0.5f;
			else if(TeamsManager.rviRate < 28)
				adjuster = 0.65f;
			else if(TeamsManager.rviRate < 35)
				adjuster = 0.8f;
			else
				adjuster = 1f;
			
			float cancerStopper; //when plane is standing still, it likes to have fake Y motion that causes indicator to sink into the ground, so set it to 0 if Y is high but X and Z super low
			if(Math.abs(ind.mx) < 0.3 && Math.abs(ind.mz) < 0.3)
				cancerStopper = 0.01f;
			else
				cancerStopper = 1;
			
			if(pYaw > yaw)
				yaw += diff;
			else
				yaw -= diff;

			int max = 250;
			
			if(dist > max)
				GL11.glTranslated(-vec.xCoord / dist * max + adjuster*20*((1000f - dist)/1000f)*(ind.mx*(l - ind.lastUpdate)/(50*TeamsManager.rviRate)),
						-vec.yCoord / dist * max  + cancerStopper*adjuster*20*((1000f - dist)/1000f)*(ind.my*(l - ind.lastUpdate)/(50*TeamsManager.rviRate)),
						-vec.zCoord / dist * max  + adjuster*20*((1000f - dist)/1000f)*(ind.mz*(l - ind.lastUpdate)/(50*TeamsManager.rviRate)));
			else
				GL11.glTranslated(-vec.xCoord + adjuster*20*(ind.mx*(l - ind.lastUpdate)/(50*TeamsManager.rviRate)),
						-vec.yCoord + cancerStopper*adjuster*20*(ind.my*(l - ind.lastUpdate)/(50*TeamsManager.rviRate)),
						-vec.zCoord + adjuster*20*(ind.mz*(l - ind.lastUpdate)/(50*TeamsManager.rviRate)));
			
			
			
			//GL11.glRotated(yaw + 180, 0, 1, 0); show ass only
			
			//GL11.glRotated(yaw + 180, 0, 1, 0); //make font face viewer
			//minecraft.fontRenderer.drawString("Range: " + dist, (int) ((9) * 2), (int) ((37) * 2), 0xFFFFFF); //shows distance to target
			//renderScaled(0, 0, 0, -5 * (1 - (1 / dist * 0.5)));  //renders the old 2d sprite version. Maybe set this to fast/fancy graphics in future
			//GL11.glRotated(-(yaw + 180), 0, 1, 0); //undo this rotation so wont fuck with vehicle
			
			float cursedRotation = (float) (ind.rx + 270); 
			
			//float cursedRotation = (float) (yaw + ind.rx - pYaw);
			GL11.glRotated(cursedRotation, 0, 1, 0); //now load the yaw data from plane/vehicle and adjust based on player yaw      throwing in an extra 360 to hopefully prevent negative overflow problem   2025
			GL11.glRotated(ind.ry, 0, 0, 1); //pitch
			GL11.glRotated(ind.rz, 1, 0, 0);  //roll
			//GL11.glRotated(pitch, 1, 0, 0); try to remove the pitch. its fine for 2d sprite but shitty for 3D
			
			//System.out.println("the fucky rotation: " + (360 + yaw + ind.rx - pYaw));
			
			
			

			
			{						//experiment: make the rvi render a vehicle
			
			DriveableType selectedType = DriveableType.getDriveable(ind.vehicleName);
			
			//Entity vehicle = new EntityVehicle(grenade.worldObj, (double)grenade.posX, (double)grenade.posY, (double)grenade.posZ, grenade.thrower, selectedType, getData(grenadeStack, grenade.worldObj)).setOwner(owner);  failed attempt
			
			if(selectedType != null && (selectedType instanceof PlaneType || selectedType instanceof VehicleType))
			{

				
				 //please no glow in the dark models
				

				GL11.glScalef((float)(selectedType.modelScale * 1.2f * ((1000f - dist)/1000f)), (float)(selectedType.modelScale * 1.2f * ((1000f - dist)/1000f)), (float)(selectedType.modelScale * 1.2f * ((1000f - dist)/1000f)));  //1000 is max distance, so scale to 0 when that far out
				//GL11.glRotatef(180F, 0F, 0F, 1F);
				//GL11.glRotatef(30F, 1F, 0F, 0F);
				//GL11.glRotatef(270f, 0F, 1F, 0F);
				Minecraft.getMinecraft().renderEngine.bindTexture(FlansModResourceHandler.getTexture(selectedType));
				if( selectedType.model != null )
				{

					selectedType.model.render(selectedType);
					
				}
				//GL11.glDisable(GL11.GL_DEPTH_TEST);
				//GL11.glDisable(GL11.GL_ALPHA_TEST);
				//GL11.glPopMatrix();	

				
			}

			
			} //now shove it here so it can get the rotations

			GL11.glPopMatrix();
		}

		//GL11.glEnable(GL11.GL_FOG);
		
		
       // GL11.glDepthMask(true); causes see through walls
        //GL11.glEnable(2929); causes see through walls
		//GL11.glEnable(GL11.GL_CULL_FACE); causes see through walls
		GL11.glDisable(GL11.GL_LIGHTING); 
		GL11.glPopMatrix();
	}
	
	
	
	public static void renderScaled(double x, double y, double z, double scale) {

		Tessellator tessellator = Tessellator.instance;
        tessellator.startDrawingQuads();
        tessellator.addVertexWithUV(x - scale, y + scale, z, 0, 1);
        tessellator.addVertexWithUV(x + scale, y + scale, z, 1, 1);
        tessellator.addVertexWithUV(x + scale, y - scale, z, 1, 0);
        tessellator.addVertexWithUV(x - scale, y - scale, z, 0, 0);
        tessellator.draw();
	}
}