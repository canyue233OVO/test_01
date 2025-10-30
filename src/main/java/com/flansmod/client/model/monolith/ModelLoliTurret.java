//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2024 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: LoliTurret
// Model Creator:
// Created on:14.07.2024 - 19:35:11
// Last changed on: 14.07.2024 - 19:35:11

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelLoliTurret extends ModelBase
{
	int textureX = 256;
	int textureY = 128;

	public ModelLoliTurret()
	{
		loliturretModel = new ModelRendererTurbo[6];
		loliturretModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		loliturretModel[1] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 1
		loliturretModel[2] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 2
		loliturretModel[3] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 3
		loliturretModel[4] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 4
		loliturretModel[5] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 5

		loliturretModel[0].addShapeBox(0F, 0F, 0F, 18, 54, 12, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		loliturretModel[0].setRotationPoint(-9F, -28F, -6F);

		loliturretModel[1].addShapeBox(0F, 0F, 0F, 18, 54, 12, 0F, 1F, -3F, 0F, -3F, -21F, 0F, 0F, -18F, 0F, 0F, 0F, 0F, 1F, -3F, 0F, -3F, -21F, 0F, 0F, -18F, 0F, 0F, 0F, 0F); // Box 1
		loliturretModel[1].setRotationPoint(9F, -28F, -6F);

		loliturretModel[2].addShapeBox(0F, 0F, 0F, 18, 54, 12, 0F, -3F, -21F, 0F, 1F, -3F, 0F, 0F, 0F, 0F, 0F, -18F, 0F, -3F, -21F, 0F, 1F, -3F, 0F, 0F, 0F, 0F, 0F, -18F, 0F); // Box 2
		loliturretModel[2].setRotationPoint(-27F, -28F, -6F);

		loliturretModel[3].addShapeBox(0F, 0F, 0F, 12, 12, 3, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		loliturretModel[3].setRotationPoint(-15F, -15F, -9F);

		loliturretModel[4].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -2F, -1.5F, 0F, -2F, -1.5F, 0F, -1F, -1.5F, 0F, -1F); // Box 4
		loliturretModel[4].setRotationPoint(-4F, 23F, -4F);

		loliturretModel[5].addShapeBox(0F, 0F, 0F, 4, 30, 4, 0F, 0F, 20F, 0F, 0F, 20F, 0F, 0F, 20F, 0F, 0F, 20F, 0F, 0F, 20F, 0F, 0F, 20F, 0F, 0F, 20F, 0F, 0F, 20F, 0F); // Box 5
		loliturretModel[5].setRotationPoint(-2F, 49F, -1.5F);


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 6; i++)
		{
			loliturretModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo loliturretModel[];
}