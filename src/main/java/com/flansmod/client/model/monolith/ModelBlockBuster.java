//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: BlockBuster
// Model Creator:
// Created on:18.12.2022 - 22:37:18
// Last changed on: 18.12.2022 - 22:37:18

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelBlockBuster extends ModelBase
{
	int textureX = 128;
	int textureY = 128;

	public ModelBlockBuster()
	{
		blockbusterModel = new ModelRendererTurbo[6];
		blockbusterModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 10
		blockbusterModel[1] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 11
		blockbusterModel[2] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 12
		blockbusterModel[3] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 13
		blockbusterModel[4] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Box 14
		blockbusterModel[5] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 15

		blockbusterModel[0].addShapeBox(0F, 0F, 0F, 15, 56, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		blockbusterModel[0].setRotationPoint(-7.5F, -34F, -2.5F);

		blockbusterModel[1].addShapeBox(0F, 0F, 0F, 15, 56, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 11
		blockbusterModel[1].setRotationPoint(-7.5F, -34F, 2.5F);

		blockbusterModel[2].addShapeBox(0F, 0F, 0F, 15, 56, 5, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		blockbusterModel[2].setRotationPoint(-7.5F, -34F, -7.5F);

		blockbusterModel[3].addShapeBox(0F, 0F, 0F, 15, 2, 5, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -4.9F, -5F, 0F, -4.9F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 13
		blockbusterModel[3].setRotationPoint(-7.5F, 22F, -7.5F);

		blockbusterModel[4].addShapeBox(0F, 0F, 0F, 15, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 14
		blockbusterModel[4].setRotationPoint(-7.5F, 22F, -2.5F);

		blockbusterModel[5].addShapeBox(0F, 0F, 0F, 15, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -4.9F, -5F, 0F, -4.9F); // Box 15
		blockbusterModel[5].setRotationPoint(-7.5F, 22F, 2.5F);


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 6; i++)
		{
			blockbusterModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo blockbusterModel[];
}