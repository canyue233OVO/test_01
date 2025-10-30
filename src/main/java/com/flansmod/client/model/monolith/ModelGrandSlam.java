//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: GrandSlam
// Model Creator:
// Created on:18.12.2022 - 22:37:18
// Last changed on: 18.12.2022 - 22:37:18

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelGrandSlam extends ModelBase
{
	int textureX = 128;
	int textureY = 256;

	public ModelGrandSlam()
	{
		grandslamModel = new ModelRendererTurbo[10];
		grandslamModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 9
		grandslamModel[1] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 10
		grandslamModel[2] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 11
		grandslamModel[3] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 12
		grandslamModel[4] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 13
		grandslamModel[5] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 14
		grandslamModel[6] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 15
		grandslamModel[7] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 16
		grandslamModel[8] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Box 17
		grandslamModel[9] = new ModelRendererTurbo(this, 81, 113, textureX, textureY); // Box 18

		grandslamModel[0].addShapeBox(0F, 0F, 0F, 21, 9, 21, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -1.5F); // Box 9
		grandslamModel[0].setRotationPoint(-10.5F, 0F, -10.5F);

		grandslamModel[1].addShapeBox(0F, 0F, 0F, 18, 10, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, -4.5F, -4.5F, 0F, -4.5F, -4.5F, 0F, -4.5F, -4.5F, 0F, -4.5F); // Box 10
		grandslamModel[1].setRotationPoint(-9F, 9F, -9F);

		grandslamModel[2].addShapeBox(0F, 0F, 0F, 9, 7, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.4F, 0F, -4.4F, -4.4F, 0F, -4.4F, -4.4F, 0F, -4.4F, -4.4F, 0F, -4.4F); // Box 11
		grandslamModel[2].setRotationPoint(-4.5F, 19F, -4.5F);

		grandslamModel[3].addShapeBox(0F, 0F, 0F, 21, 33, 21, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		grandslamModel[3].setRotationPoint(-10.5F, -33F, -10.5F);

		grandslamModel[4].addShapeBox(0F, 0F, 0F, 15, 74, 15, 0F, -4.5F, 0F, -4.5F, -4.5F, 0F, -4.5F, -4.5F, 0F, -4.5F, -4.5F, 0F, -4.5F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, 3F); // Box 13
		grandslamModel[4].setRotationPoint(-7.5F, -107F, -7.5F);

		grandslamModel[5].addShapeBox(0F, 0F, 0F, 6, 8, 6, 0F, -2.9F, 0F, -2.9F, -2.9F, 0F, -2.9F, -2.9F, 0F, -2.9F, -2.9F, 0F, -2.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		grandslamModel[5].setRotationPoint(-3F, -115F, -3F);

		grandslamModel[6].addShapeBox(0F, 0F, 0F, 12, 20, 1, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 15
		grandslamModel[6].setRotationPoint(-11.5F, -104.5F, -0.5F);

		grandslamModel[7].addShapeBox(0F, 0F, 0F, 12, 20, 1, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 16
		grandslamModel[7].setRotationPoint(0.5F, -104.5F, -0.5F);

		grandslamModel[8].addShapeBox(0F, 0F, 0F, 1, 20, 12, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		grandslamModel[8].setRotationPoint(-0.5F, -104.5F, -12.5F);

		grandslamModel[9].addShapeBox(0F, 0F, 0F, 1, 20, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 18
		grandslamModel[9].setRotationPoint(-0.5F, -104.5F, -0.5F);


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 10; i++)
		{
			grandslamModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo grandslamModel[];
}