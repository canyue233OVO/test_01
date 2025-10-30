//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2024 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: PropFlag
// Model Creator: 
// Created on: 10.02.2022 - 15:26:20
// Last changed on: 10.02.2022 - 15:26:20

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelPropFlag extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelPropFlag() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[8];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 449
		bodyModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 450
		bodyModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 451
		bodyModel[3] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 452
		bodyModel[4] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 453
		bodyModel[5] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 454
		bodyModel[6] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 455
		bodyModel[7] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 456

		bodyModel[0].addShapeBox(-1.5F, 0F, -0.5F, 3, 20, 1, 0F,0F, 70F, 0F, 0F, 70F, 0F, 0F, 70F, 0F, 0F, 70F, 0F, 0F, 70F, 0F, 0F, 70F, 0F, 0F, 70F, 0F, 0F, 70F, 0F); // Box 449
		bodyModel[0].setRotationPoint(0F, -81F, 0F);

		bodyModel[1].addShapeBox(-1.5F, 0F, -1.5F, 3, 20, 1, 0F,-1F, 70F, 0F, -1F, 70F, 0F, 0F, 70F, 0F, 0F, 70F, 0F, -1F, 70F, 0F, -1F, 70F, 0F, 0F, 70F, 0F, 0F, 70F, 0F); // Box 450
		bodyModel[1].setRotationPoint(0F, -81F, 0F);

		bodyModel[2].addShapeBox(-1.5F, 0F, 0.5F, 3, 20, 1, 0F,0F, 70F, 0F, 0F, 70F, 0F, -1F, 70F, 0F, -1F, 70F, 0F, 0F, 70F, 0F, 0F, 70F, 0F, -1F, 70F, 0F, -1F, 70F, 0F); // Box 451
		bodyModel[2].setRotationPoint(0F, -81F, 0F);

		bodyModel[3].addShapeBox(-6F, 0F, -2F, 12, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F); // Box 452
		bodyModel[3].setRotationPoint(0F, 8F, 0F);

		bodyModel[4].addShapeBox(-6F, 0F, -6F, 12, 2, 4, 0F,-4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 2F, -4F, 0F, 2F, 2F, 0F, 0F, 2F, 0F, 0F); // Box 453
		bodyModel[4].setRotationPoint(0F, 8F, 0F);

		bodyModel[5].addShapeBox(-6F, 0F, 2F, 12, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -4F, 0F, 2F, -4F, 0F, 2F); // Box 454
		bodyModel[5].setRotationPoint(0F, 8F, 0F);

		bodyModel[6].addShapeBox(-0.5F, -23F, -43.5F, 1, 80, 140, 0F,-0.4F, -25F, -45F, -0.4F, -25F, -45F, -0.4F, -40F, -55F, -0.4F, -40F, -55F, -0.4F, -25F, -45F, -0.4F, -25F, -45F, -0.4F, -11F, -52F, -0.4F, -11F, -52F); // Box 455
		bodyModel[6].setRotationPoint(0F, -152F, 0F);

		bodyModel[7].addShapeBox(-1.5F, 0F, -1.5F, 3, 3, 3, 0F,0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F); // Box 456
		bodyModel[7].setRotationPoint(0F, -154F, 0F);
	}
}