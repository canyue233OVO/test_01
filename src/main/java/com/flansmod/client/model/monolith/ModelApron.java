//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Apron
// Model Creator: 
// Created on: 19.05.2020 - 08:09:04
// Last changed on: 19.05.2020 - 08:09:04

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelApron extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelApron() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[10];
		skirtFrontModel = new ModelRendererTurbo[3];

		initbodyModel_1();
		initskirtFrontModel_1();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 6
		bodyModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 36
		bodyModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 38
		bodyModel[3] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 40
		bodyModel[4] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 42
		bodyModel[5] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 43
		bodyModel[6] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 45
		bodyModel[7] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 46
		bodyModel[8] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 47
		bodyModel[9] = new ModelRendererTurbo(this, 1, 23, textureX, textureY); // Box 48

		bodyModel[0].addShapeBox(-3.5F, 2F, -2.5F, 7, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 6
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4.5F, 7F, -2.5F, 9, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-4.5F, 7F, -1.5F, 1, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(3.5F, 7F, -1.5F, 1, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-3.5F, 0F, -2.5F, 1, 3, 1, 0F,-0.4F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.5F, -0.2F, -0.4F, 0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 42
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(2.5F, 0F, -2.5F, 1, 3, 1, 0F,0F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 43
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-3.1F, -0.5F, -1.7F, 1, 1, 3, 0F,0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 45
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(2.5F, -0.5F, -1.7F, 1, 1, 3, 0F,0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 46
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-3F, -0.5F, 1.3F, 6, 1, 1, 0F,0.1F, 0F, 0F, 0.1F, 0F, 0F, -1F, 0F, -0.4F, -1F, 0F, -0.4F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, -1F, -0.4F, -0.4F, -1F, -0.4F, -0.4F); // Box 47
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-15F, 2.5F, -2.65F, 30, 39, 1, 0F,-11.5F, 0F, 0F, -11.5F, 0F, 0F, -11.5F, 0F, 0F, -11.5F, 0F, 0F, -11.5F, -30F, 0F, -11.5F, -30F, 0F, -11.5F, -30F, 0F, -11.5F, -30F, 0F); // Box 48
		bodyModel[9].setRotationPoint(0F, 0F, 0F);
	}

	private void initskirtFrontModel_1()
	{
		skirtFrontModel[0] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 37
		skirtFrontModel[1] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 39
		skirtFrontModel[2] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 41

		skirtFrontModel[0].addShapeBox(-4.5F, 0F, -2.5F, 9, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		skirtFrontModel[0].setRotationPoint(0F, 0F, 0F);

		skirtFrontModel[1].addShapeBox(-4.5F, 0F, -1.5F, 1, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		skirtFrontModel[1].setRotationPoint(0F, 0F, 0F);

		skirtFrontModel[2].addShapeBox(3.5F, 0F, -1.5F, 1, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		skirtFrontModel[2].setRotationPoint(0F, 0F, 0F);
	}
}