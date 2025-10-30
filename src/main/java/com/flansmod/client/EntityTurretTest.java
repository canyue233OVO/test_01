package com.flansmod.client;

import org.lwjgl.opengl.GL11;

import com.flansmod.common.FlansMod;
import com.flansmod.common.driveables.DriveableType;
import com.flansmod.common.driveables.PlaneType;
import com.flansmod.common.driveables.VehicleType;

import cpw.mods.fml.client.FMLClientHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.EntityFX;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class EntityTurretTest extends EntityFX
{
	public static ResourceLocation icon = new ResourceLocation("flansmod", "particle/NuMuzzle.png");
	public EntityTurretTest(World w, double px, double py, double pz, double mx, double my, double mz)
	{
		super(w, px, py, pz, mx, my, mz);
		this.particleMaxAge = 400;
		this.particleAge = 0;
		this.particleGravity = -1;
		this.motionX = 0; //dont want a lot of movement
		this.motionY = 0;
		this.motionZ = 0;
		icon = new ResourceLocation("flansmod", "particle/NuMuzzle.png");
	}
	
	public int getFXLayer()
	{
			 return 3;
	}

	public float getEntityBrightness(float f)
	{
			return 1.0F;
	}
	
	public int getBrightnessForRender(float par1)
	{
		return 15728880;
	}
	
    public void renderParticle(Tessellator par1Tessellator, float par2, float par3, float par4, float par5, float par6, float par7)
    {
        //func_98187_b() = bindTexture();
    	GL11.glPushMatrix();
   	 	par1Tessellator.startDrawingQuads();
		GL11.glAlphaFunc(GL11.GL_GREATER, 0.001F);
		GL11.glEnable(GL11.GL_BLEND);
		int srcBlend = GL11.glGetInteger(GL11.GL_BLEND_SRC);
		int dstBlend = GL11.glGetInteger(GL11.GL_BLEND_DST);
		GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
		GL11.glDepthMask(false); 
    	FMLClientHandler.instance().getClient().renderEngine.bindTexture(new ResourceLocation("flansmod", "particle/NuMuzzle.png"));
    	
    	
    	
    	DriveableType selectedType = DriveableType.getDriveable("altayUrban");
		
		//Entity vehicle = new EntityVehicle(grenade.worldObj, (double)grenade.posX, (double)grenade.posY, (double)grenade.posZ, grenade.thrower, selectedType, getData(grenadeStack, grenade.worldObj)).setOwner(owner);  failed attempt
		
		if(selectedType != null && (selectedType instanceof PlaneType || selectedType instanceof VehicleType))
		{

			
			 //please no glow in the dark models
			

			GL11.glScalef((float)(selectedType.modelScale/100) , (float)(selectedType.modelScale/100) , (float)(selectedType.modelScale/100));  //1000 is max distance, so scale to 0 when that far out
			//GL11.glRotatef(180F, 0F, 0F, 1F);
			//GL11.glRotatef(30F, 1F, 0F, 0F);
			//GL11.glRotatef(270f, 0F, 1F, 0F);
			Minecraft.getMinecraft().renderEngine.bindTexture(FlansModResourceHandler.getTexture(selectedType));
			if( selectedType.model != null )
			{
				selectedType.model.renderTurretLoss(selectedType);
			}
			//GL11.glDisable(GL11.GL_DEPTH_TEST);
			//GL11.glDisable(GL11.GL_ALPHA_TEST);
			//GL11.glPopMatrix();	

			
		}


        float scale = 0.2F;
        float xPos = (float) (this.prevPosX + (this.posX - this.prevPosX) * (double) par2 - interpPosX);
        float yPos = (float) (this.prevPosY + (this.posY - this.prevPosY) * (double) par2 - interpPosY);
        float zPos = (float) (this.prevPosZ + (this.posZ - this.prevPosZ) * (double) par2 - interpPosZ);
        float colorIntensity = 1F;
        //par1Tessellator.setColorOpaque_F(this.particleRed * colorIntensity, this.particleGreen * colorIntensity, this.particleBlue * colorIntensity);//, 1.0F);
        par1Tessellator.setColorOpaque_F(this.particleRed * colorIntensity, this.particleGreen * colorIntensity, this.particleBlue * colorIntensity);//, 1.0F);
        par1Tessellator.addVertexWithUV((double) (xPos - par3 * scale - par6 * scale), (double) (yPos - par4 * scale), (double) (zPos - par5 * scale - par7 * scale), 0D, 1D);
        par1Tessellator.addVertexWithUV((double) (xPos - par3 * scale + par6 * scale), (double) (yPos + par4 * scale), (double) (zPos - par5 * scale + par7 * scale), 1D, 1D);
        par1Tessellator.addVertexWithUV((double) (xPos + par3 * scale + par6 * scale), (double) (yPos + par4 * scale), (double) (zPos + par5 * scale + par7 * scale), 1D, 0D);
        par1Tessellator.addVertexWithUV((double) (xPos + par3 * scale - par6 * scale), (double) (yPos - par4 * scale), (double) (zPos + par5 * scale - par7 * scale), 0D, 0D);
        par1Tessellator.draw();
        GL11.glBlendFunc(srcBlend, dstBlend);
		GL11.glDisable(GL11.GL_BLEND);
		GL11.glDepthMask(true); 
        GL11.glPopMatrix();

    }

	public void onUpdate()
	{
		this.prevPosX = this.posX;
		this.prevPosY = this.posY;
		this.prevPosZ = this.posZ;
		this.renderDistanceWeight = 500.0D;
		if(this.particleAge++ >= this.particleMaxAge)
		{
			this.setDead();
		}
		
		this.moveEntity(this.motionX, this.motionY, this.motionZ);

	}
}
