package com.flansmod.client.model;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;

import com.flansmod.client.FlansModResourceHandler;
import com.flansmod.common.driveables.DriveableType;
import com.flansmod.common.driveables.EntityVehicle;
import com.flansmod.common.driveables.ItemVehicle;
import com.flansmod.common.driveables.PlaneType;
import com.flansmod.common.driveables.VehicleType;
import com.flansmod.common.driveables.mechas.MechaType;
import com.flansmod.common.guns.EntityGrenade;
import com.flansmod.common.guns.GrenadeType;
import com.flansmod.common.guns.ItemGrenade;
import com.flansmod.common.types.InfoType;

public class RenderGrenade extends Render implements IItemRenderer 
{
	public RenderGrenade()
	{
		shadowSize = 0.1F;
	}

	public void render(EntityGrenade grenade, double d, double d1, double d2, float f, float f1)
	{
		bindEntityTexture(grenade);
        GL11.glPushMatrix();
        GL11.glTranslatef((float)d, (float)d1, (float)d2);
        GL11.glRotatef(270, 0.0F, 0.0F, 1.0F);
        if(grenade.stuck)
        {
	        GL11.glRotatef(180F - grenade.axes.getYaw(), 0.0F, 1.0F, 0.0F);
	        GL11.glRotatef(grenade.axes.getPitch(), 0.0F, 0.0F, 1.0F);
			GL11.glRotatef(grenade.axes.getRoll(), 1.0F, 0.0F, 0.0F);
        }
        else
        {
	        float dYaw = (grenade.axes.getYaw() - grenade.prevRotationYaw);
	        for(; dYaw > 180F; dYaw -= 360F) {}
	        for(; dYaw <= -180F; dYaw += 360F) {}
	        float dPitch = (grenade.axes.getPitch() - grenade.prevRotationPitch);
	        for(; dPitch > 180F; dPitch -= 360F) {}
	        for(; dPitch <= -180F; dPitch += 360F) {}
	        float dRoll = (grenade.axes.getRoll() - grenade.prevRotationRoll);
	        for(; dRoll > 180F; dRoll -= 360F) {}
	        for(; dRoll <= -180F; dRoll += 360F) {}
	        GL11.glRotatef(180F - grenade.prevRotationYaw - dYaw * f1, 0.0F, 1.0F, 0.0F);
	        GL11.glRotatef(grenade.prevRotationPitch + dPitch * f1, 0.0F, 0.0F, 1.0F);
			GL11.glRotatef(grenade.prevRotationRoll + dRoll * f1, 1.0F, 0.0F, 0.0F);
        }
		ModelBase model = grenade.type.model;
		if(model != null)
			model.render(grenade, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
		
		
		
		
		/*

		VehicleType selectedType = VehicleType.getVehicle(grenade.MasterVehicle);
		
		//Entity vehicle = new EntityVehicle(grenade.worldObj, (double)grenade.posX, (double)grenade.posY, (double)grenade.posZ, grenade.thrower, selectedType, getData(grenadeStack, grenade.worldObj)).setOwner(owner);  failed attempt
		
		if(selectedType != null && selectedType instanceof VehicleType)
		{
			//Render rotating driveable model
			//GL11.glPushMatrix();
			//GL11.glEnable(GL11.GL_DEPTH_TEST);
			//GL11.glEnable(GL11.GL_ALPHA_TEST);
			//GL11.glTranslatef(w / 2 - 46, h /2 - 10, 100);

			GL11.glScalef(selectedType.modelScale/100, selectedType.modelScale/100, selectedType.modelScale/100);
			GL11.glRotatef(180F, 0F, 0F, 1F);
			GL11.glRotatef(30F, 1F, 0F, 0F);
			GL11.glRotatef(270f, 0F, 1F, 0F);
			Minecraft.getMinecraft().renderEngine.bindTexture(FlansModResourceHandler.getTexture(selectedType));
			if( selectedType.model != null )
			{
				selectedType.model.renderTurretLoss(selectedType);
			}
			//GL11.glDisable(GL11.GL_DEPTH_TEST);
			//GL11.glDisable(GL11.GL_ALPHA_TEST);
			//GL11.glPopMatrix();		
		} */
		
		
		
		/// end of work area
		
		
		GL11.glPopMatrix();
	}

	@Override
	public void doRender(Entity entity, double d, double d1, double d2, float f, float f1)
	{
		render((EntityGrenade) entity, d, d1, d2, f, f1);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(Entity entity) 
	{
		ResourceLocation texture = FlansModResourceHandler.getTexture(((EntityGrenade)entity).type);
		if(texture == null)
			return FlansModResourceHandler.getIcon(((EntityGrenade)entity).type);
		return texture;
	}

	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type) 
	{
		switch(type)
		{
		case EQUIPPED : case EQUIPPED_FIRST_PERSON : return item != null && item.getItem() instanceof ItemGrenade && ((ItemGrenade)item.getItem()).type.model != null;
		default : break;
		}
		return false;
	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) 
	{
		return false;
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data) 
	{
		GL11.glPushMatrix();
		if(item != null && item.getItem() instanceof ItemGrenade)
		{
			GrenadeType grenadeType = ((ItemGrenade)item.getItem()).type;
			if(grenadeType.model != null)
			{
				switch(type)
				{
				case EQUIPPED:
				{
					GL11.glRotatef(35F, 0F, 0F, 1F);
					GL11.glRotatef(-5F, 0F, 1F, 0F);
					GL11.glTranslatef(0.75F, -0.22F, -0.08F);
					GL11.glTranslatef(0F, 0.25F, 0F);
					break;
				}
				case EQUIPPED_FIRST_PERSON:
				{
					GL11.glRotatef(25F, 0F, 0F, 1F); 
					GL11.glRotatef(-5F, 0F, 1F, 0F);
					GL11.glTranslatef(0.15F, 0.2F, -0.6F);
					GL11.glTranslatef(0F, 0.25F, 0F);
					break;
				}
				default : break;
				}
				
				Minecraft.getMinecraft().renderEngine.bindTexture(FlansModResourceHandler.getTexture(grenadeType));
				ModelBase model = grenadeType.model;
				model.render(null, 0F, 0F, 0F, 0F, 0F, 1F / 16F);
			}
		}
		GL11.glPopMatrix();
	}

}
