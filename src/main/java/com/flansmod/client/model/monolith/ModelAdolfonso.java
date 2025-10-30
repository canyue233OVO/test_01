//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Adolfonso
// Model Creator: 
// Created on: 19.05.2020 - 08:09:04
// Last changed on: 19.05.2020 - 08:09:04

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelAdolfonso extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public ModelAdolfonso() //Same as Filename
	{
		headModel = new ModelRendererTurbo[1];
		bodyModel = new ModelRendererTurbo[6];
		leftArmModel = new ModelRendererTurbo[4];
		rightArmModel = new ModelRendererTurbo[1];
		leftLegModel = new ModelRendererTurbo[5];
		rightLegModel = new ModelRendererTurbo[5];

		initheadModel_1();
		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 30

		headModel[0].addShapeBox(-1F, -2.3F, -4.1F, 2, 1, 1, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		headModel[0].setRotationPoint(0F, 0F, 0F);
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 15
		bodyModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 62
		bodyModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 64
		bodyModel[3] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 14
		bodyModel[4] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 15
		bodyModel[5] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 20

		bodyModel[0].addShapeBox(-4F, 0F, -2F, 8, 8, 4, 0F,1F, 0.3F, 0.3F, 1F, 0.3F, 0.3F, 1F, 0.3F, 0.3F, 1F, 0.3F, 0.3F, 0.5F, 0F, 0.1F, 0.5F, 0F, 0.1F, 0.5F, 0F, 0.1F, 0.5F, 0F, 0.1F); // Box 15
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-3F, 0F, -3F, 3, 1, 2, 0F,-0.5F, 0.6F, -0.3F, 0.3F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.6F, 0F, 0F, -1F, -0.3F, -1F, 0.5F, 0F, -1F, 0F, 0F, 0F, -1F, 0F); // Box 62
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(0F, 0F, -3F, 3, 1, 2, 0F,0.3F, 0F, -0.1F, -0.5F, 0.6F, -0.3F, -0.5F, 0.6F, 0F, 0F, 0F, 0F, -1F, 0.5F, 0F, 0F, -1F, -0.3F, 0F, -1F, 0F, -1F, 0F, 0F); // Box 64
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-4.5F, 8F, -2F, 9, 1, 4, 0F,0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F); // Box 14
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-0.5F, 8F, -2.1F, 1, 1, 4, 0F,0F, 0.1F, 0.3F, 0F, 0.1F, 0.3F, 0F, 0.1F, -1.7F, 0F, 0.1F, -1.7F, 0F, 0.1F, 0.3F, 0F, 0.1F, 0.3F, 0F, 0.1F, -1.7F, 0F, 0.1F, -1.7F); // Box 15
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-4F, -0.5F, -2.5F, 1, 9, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -0.5F, -0.25F, 6F, -0.5F, -0.25F, 6F, -0.5F, -0.25F, -6F, 0F, -0.25F); // Box 20
		bodyModel[5].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 21
		leftArmModel[1] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 22
		leftArmModel[2] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 23
		leftArmModel[3] = new ModelRendererTurbo(this, 7, 31, textureX, textureY); // Box 29

		leftArmModel[0].addShapeBox(-1F, -2F, -2F, 4, 5, 4, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.1F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F); // Box 21
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1F, 3F, -2F, 4, 5, 4, 0F,0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F); // Box 22
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(-1F, 1.5F, -2F, 4, 3, 4, 0F,0.3F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F); // Box 23
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);

		leftArmModel[3].addShapeBox(2.55F, -2.5F, -5.5F, 1, 12, 12, 0F,-0.2F, -4.5F, -4.5F, -0.2F, -4.5F, -4.5F, -0.2F, -4.5F, -5.5F, -0.2F, -4.5F, -5.5F, -0.2F, -5.5F, -4.5F, -0.1F, -5.5F, -4.5F, -0.1F, -5.5F, -5.5F, -0.2F, -5.5F, -5.5F); // Box 29
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 61

		rightArmModel[0].addShapeBox(-3F, -2F, -2F, 4, 10, 4, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.1F, 0.1F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F); // Box 61
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 24
		leftLegModel[1] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 25
		leftLegModel[2] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 26
		leftLegModel[3] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 27
		leftLegModel[4] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 28

		leftLegModel[0].addShapeBox(-2F, -3F, -2F, 4, 7, 4, 0F,0.1F, 0F, 0.1F, 0.5F, 0F, 0.1F, 0.5F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.3F, 0F, 0.3F, 1.5F, -0.5F, 0.3F, 1.5F, -0.5F, 0.3F, 0.3F, 0F, 0.3F); // Box 24
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, 4F, -2F, 4, 2, 4, 0F,0.3F, 0F, 0.3F, 1.5F, 0.5F, 0.3F, 1.5F, 0.5F, 0.3F, 0.3F, 0F, 0.3F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 25
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-2F, 6F, -2F, 4, 5, 4, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 26
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(-2F, 10F, -4F, 4, 2, 2, 0F,0.1F, -0.9F, 0.1F, 0.1F, -0.9F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 27
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);

		leftLegModel[4].addShapeBox(-2F, 10F, -2F, 4, 2, 4, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 28
		leftLegModel[4].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 58
		rightLegModel[1] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 16
		rightLegModel[2] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 17
		rightLegModel[3] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 18
		rightLegModel[4] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 19

		rightLegModel[0].addShapeBox(-2F, -3F, -2F, 4, 7, 4, 0F,0.5F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.5F, 0F, 0.1F, 1.5F, -0.5F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 1.5F, -0.5F, 0.3F); // Box 58
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, 4F, -2F, 4, 2, 4, 0F,1.5F, 0.5F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 1.5F, 0.5F, 0.3F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 16
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2F, 6F, -2F, 4, 5, 4, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 17
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(-2F, 10F, -2F, 4, 2, 4, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 18
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);

		rightLegModel[4].addShapeBox(-2F, 10F, -4F, 4, 2, 2, 0F,0.1F, -0.9F, 0.1F, 0.1F, -0.9F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 19
		rightLegModel[4].setRotationPoint(0F, 0F, 0F);
	}
}