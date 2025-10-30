//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2024 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: TPVarmed
// Model Creator:
// Created on:14.07.2024 - 19:35:11
// Last changed on: 14.07.2024 - 19:35:11

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelTPVunarmed extends ModelBase
{
	int textureX = 64;
	int textureY = 64;

	public ModelTPVunarmed()
	{
		tpvunarmedModel = new ModelRendererTurbo[25];
		tpvunarmedModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 6
		tpvunarmedModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 7
		tpvunarmedModel[2] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 8
		tpvunarmedModel[3] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 9
		tpvunarmedModel[4] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 10
		tpvunarmedModel[5] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 11
		tpvunarmedModel[6] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 12
		tpvunarmedModel[7] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 23
		tpvunarmedModel[8] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 24
		tpvunarmedModel[9] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 27
		tpvunarmedModel[10] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 28
		tpvunarmedModel[11] = new ModelRendererTurbo(this, 9, 41, textureX, textureY); // Box 42
		tpvunarmedModel[12] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 43
		tpvunarmedModel[13] = new ModelRendererTurbo(this, 9, 41, textureX, textureY); // Box 48
		tpvunarmedModel[14] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 49
		tpvunarmedModel[15] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 50
		tpvunarmedModel[16] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 51
		tpvunarmedModel[17] = new ModelRendererTurbo(this, 9, 41, textureX, textureY); // Box 52
		tpvunarmedModel[18] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 53
		tpvunarmedModel[19] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 54
		tpvunarmedModel[20] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 55
		tpvunarmedModel[21] = new ModelRendererTurbo(this, 9, 41, textureX, textureY); // Box 56
		tpvunarmedModel[22] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 57
		tpvunarmedModel[23] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 58
		tpvunarmedModel[24] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 59

		tpvunarmedModel[0].addShapeBox(0F, 0F, 0F, 4, 10, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		tpvunarmedModel[0].setRotationPoint(-2F, -5F, -3F);

		tpvunarmedModel[1].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 1F, -8F, 0F, 1F, -8F, 0F, -1F, 8F, 0F, -1F); // Box 7
		tpvunarmedModel[1].setRotationPoint(-2F, 4F, -3F);

		tpvunarmedModel[2].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 1F, 8F, 0F, 1F, 8F, 0F, -1F, -8F, 0F, -1F); // Box 8
		tpvunarmedModel[2].setRotationPoint(1F, 4F, -3F);

		tpvunarmedModel[3].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F, -8F, 0F, 1F, 8F, 0F, 1F, 8F, 0F, -1F, -8F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		tpvunarmedModel[3].setRotationPoint(1F, -13F, -3F);

		tpvunarmedModel[4].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F, 8F, 0F, 1F, -8F, 0F, 1F, -8F, 0F, -1F, 8F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		tpvunarmedModel[4].setRotationPoint(-2F, -13F, -3F);

		tpvunarmedModel[5].addShapeBox(0F, 0F, 0F, 4, 10, 1, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F); // Box 11
		tpvunarmedModel[5].setRotationPoint(-2F, -5F, -3.3F);

		tpvunarmedModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F); // Box 12
		tpvunarmedModel[6].setRotationPoint(-2F, -5F, -11.3F);

		tpvunarmedModel[7].addShapeBox(0F, 0F, 0F, 3, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		tpvunarmedModel[7].setRotationPoint(-1.5F, 2F, -4F);

		tpvunarmedModel[8].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		tpvunarmedModel[8].setRotationPoint(-1F, 5.5F, -3.5F);

		tpvunarmedModel[9].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, -0.8F, -5F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		tpvunarmedModel[9].setRotationPoint(-10F, 6.5F, -4.5F);

		tpvunarmedModel[10].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -0.8F, 5F, 0F, -0.8F); // Box 28
		tpvunarmedModel[10].setRotationPoint(-10F, 12.5F, -4.5F);

		tpvunarmedModel[11].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, -0.8F, -5F, 0F, -0.8F); // Box 42
		tpvunarmedModel[11].setRotationPoint(-10F, 12.5F, -4.5F);

		tpvunarmedModel[12].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, 5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -0.8F, 5F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		tpvunarmedModel[12].setRotationPoint(-10F, 6.5F, -4.5F);

		tpvunarmedModel[13].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, -0.8F, -5F, 0F, -0.8F); // Box 48
		tpvunarmedModel[13].setRotationPoint(9F, 12.5F, -4.5F);

		tpvunarmedModel[14].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, -0.8F, -5F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		tpvunarmedModel[14].setRotationPoint(9F, 6.5F, -4.5F);

		tpvunarmedModel[15].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, 5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -0.8F, 5F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		tpvunarmedModel[15].setRotationPoint(9F, 6.5F, -4.5F);

		tpvunarmedModel[16].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -0.8F, 5F, 0F, -0.8F); // Box 51
		tpvunarmedModel[16].setRotationPoint(9F, 12.5F, -4.5F);

		tpvunarmedModel[17].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, -0.8F, -5F, 0F, -0.8F); // Box 52
		tpvunarmedModel[17].setRotationPoint(9F, -12.5F, -4.5F);

		tpvunarmedModel[18].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, -0.8F, -5F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		tpvunarmedModel[18].setRotationPoint(9F, -18.5F, -4.5F);

		tpvunarmedModel[19].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, 5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -0.8F, 5F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		tpvunarmedModel[19].setRotationPoint(9F, -18.5F, -4.5F);

		tpvunarmedModel[20].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -0.8F, 5F, 0F, -0.8F); // Box 55
		tpvunarmedModel[20].setRotationPoint(9F, -12.5F, -4.5F);

		tpvunarmedModel[21].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, -0.8F, -5F, 0F, -0.8F); // Box 56
		tpvunarmedModel[21].setRotationPoint(-10F, -12.5F, -4.5F);

		tpvunarmedModel[22].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, -0.8F, -5F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		tpvunarmedModel[22].setRotationPoint(-10F, -18.5F, -4.5F);

		tpvunarmedModel[23].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, 5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -0.8F, 5F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		tpvunarmedModel[23].setRotationPoint(-10F, -18.5F, -4.5F);

		tpvunarmedModel[24].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -0.8F, 5F, 0F, -0.8F); // Box 59
		tpvunarmedModel[24].setRotationPoint(-10F, -12.5F, -4.5F);


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 25; i++)
		{
			tpvunarmedModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo tpvunarmedModel[];
}