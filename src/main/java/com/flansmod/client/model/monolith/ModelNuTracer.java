//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2025 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: nuTracer
// Model Creator:
// Created on:18.03.2024 - 01:41:46
// Last changed on: 18.03.2024 - 01:41:46

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelNuTracer extends ModelBase
{
	int textureX = 32;
	int textureY = 32;

	public ModelNuTracer()
	{
		nutracerModel = new ModelRendererTurbo[2];
		nutracerModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 24
		nutracerModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 25

		nutracerModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F); // Box 24
		nutracerModel[0].setRotationPoint(-0.5F, 0F, -0.5F);

		nutracerModel[1].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, -0.45F, -0.5F, -0.45F, -0.45F, -0.5F, -0.45F, -0.45F, -0.5F, -0.45F, -0.45F, -0.5F, -0.45F, 0F, 14F, 0F, 0F, 14F, 0F, 0F, 14F, 0F, 0F, 14F, 0F); // Box 25
		nutracerModel[1].setRotationPoint(-0.5F, -22F, -0.5F);


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 2; i++)
		{
			nutracerModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo nutracerModel[];
}