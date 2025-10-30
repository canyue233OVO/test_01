//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Pyjamas
// Model Creator: 
// Created on: 19.05.2020 - 08:09:04
// Last changed on: 19.05.2020 - 08:09:04

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelPyjamas extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public ModelPyjamas() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[8];
		leftArmModel = new ModelRendererTurbo[1];
		rightArmModel = new ModelRendererTurbo[1];
		leftLegModel = new ModelRendererTurbo[1];
		rightLegModel = new ModelRendererTurbo[1];

		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 15
		bodyModel[1] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 57
		bodyModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 62
		bodyModel[3] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 64
		bodyModel[4] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 65
		bodyModel[5] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 66
		bodyModel[6] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 67
		bodyModel[7] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 68

		bodyModel[0].addShapeBox(-8F, 0F, -4F, 16, 8, 8, 0F,-3F, 0.3F, -1.7F, -3F, 0.3F, -1.7F, -3F, 0.3F, -1.7F, -3F, 0.3F, -1.7F, -3.5F, 0F, -1.9F, -3.5F, 0F, -1.9F, -3.5F, 0F, -1.9F, -3.5F, 0F, -1.9F); // Box 15
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-8F, 8F, -4F, 16, 5, 8, 0F,-3.5F, 0F, -1.9F, -3.5F, 0F, -1.9F, -3.5F, 0F, -1.9F, -3.5F, 0F, -1.9F, -3.2F, 0F, -1.7F, -3.2F, 0F, -1.7F, -3.2F, 0F, -1.7F, -3.2F, 0F, -1.7F); // Box 57
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-4F, 0F, -3F, 4, 2, 2, 0F,-0.5F, 0.6F, -0.3F, 0.3F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.6F, 0F, 0.4F, -0.3F, -0.3F, -1F, 0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(0F, 0F, -3F, 4, 2, 2, 0F,0.3F, 0F, -0.1F, -0.5F, 0.6F, -0.3F, -0.5F, 0.6F, 0F, 0F, 0F, 0F, -1F, 0.5F, 0F, 0.4F, -0.3F, -0.3F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 64
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-0.5F, 3F, -2.5F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 65
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-9.5F, 0F, -2.5F, 25, 7, 1, 0F,-11F, -3F, 0F, -11F, -3F, 0F, -11F, -3F, 0F, -11F, -3F, 0F, -11F, -3F, 0F, -11F, -3F, 0F, -11F, -3F, 0F, -11F, -3F, 0F); // Box 66
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-0.5F, 6F, -2.5F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 67
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-0.5F, 9F, -2.5F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 68
		bodyModel[7].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 60

		leftArmModel[0].addShapeBox(-3F, -2F, -4F, 8, 10, 8, 0F,-1.9F, 0.2F, -1.9F, -1.9F, 0.1F, -1.9F, -1.9F, 0.1F, -1.9F, -1.9F, 0.2F, -1.9F, -1.7F, 0F, -1.7F, -1.7F, 0F, -1.7F, -1.7F, 0F, -1.7F, -1.7F, 0F, -1.7F); // Box 60
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 61

		rightArmModel[0].addShapeBox(-5F, -2F, -4F, 8, 10, 8, 0F,-1.9F, 0.1F, -1.9F, -1.9F, 0.2F, -1.9F, -1.9F, 0.2F, -1.9F, -1.9F, 0.1F, -1.9F, -1.7F, 0F, -1.7F, -1.7F, 0F, -1.7F, -1.7F, 0F, -1.7F, -1.7F, 0F, -1.7F); // Box 61
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 59

		leftLegModel[0].addShapeBox(-4F, 0F, -4F, 8, 10, 8, 0F,-1.9F, 0F, -1.9F, -1.9F, 0F, -1.9F, -1.9F, 0F, -1.9F, -1.9F, 0F, -1.9F, -1.7F, 0F, -1.7F, -1.7F, 0F, -1.7F, -1.7F, 0F, -1.7F, -1.7F, 0F, -1.7F); // Box 59
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 58

		rightLegModel[0].addShapeBox(-4F, 0F, -4F, 8, 10, 8, 0F,-1.9F, 0F, -1.9F, -1.9F, 0F, -1.9F, -1.9F, 0F, -1.9F, -1.9F, 0F, -1.9F, -1.7F, 0F, -1.7F, -1.7F, 0F, -1.7F, -1.7F, 0F, -1.7F, -1.7F, 0F, -1.7F); // Box 58
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);
	}
}