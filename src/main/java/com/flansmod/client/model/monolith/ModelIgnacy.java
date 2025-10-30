//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Ignacy
// Model Creator: 
// Created on: 19.05.2020 - 08:09:04
// Last changed on: 19.05.2020 - 08:09:04

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelIgnacy extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public ModelIgnacy() //Same as Filename
	{
		headModel = new ModelRendererTurbo[13];
		bodyModel = new ModelRendererTurbo[6];
		leftArmModel = new ModelRendererTurbo[2];
		rightArmModel = new ModelRendererTurbo[2];
		leftLegModel = new ModelRendererTurbo[3];
		rightLegModel = new ModelRendererTurbo[3];

		initheadModel_1();
		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 22
		headModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 28
		headModel[2] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 51
		headModel[3] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 23
		headModel[4] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 24
		headModel[5] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 25
		headModel[6] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 35
		headModel[7] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 36
		headModel[8] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 29
		headModel[9] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 30
		headModel[10] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 64
		headModel[11] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 40
		headModel[12] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 41

		headModel[0].addShapeBox(-4F, -9F, -4F, 8, 9, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 22
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-0.5F, -5F, -4F, 1, 1, 1, 0F,-0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0.8F, 1.2F, 0F, 0.8F, 1.2F, 0F, 0.8F, 0F, 0F, 0.8F, 0F); // Box 28
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-0.5F, -3F, -4F, 1, 1, 1, 0F,0F, 0.2F, 1.2F, 0F, 0.2F, 1.2F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.1F, -0.7F, 1F, -0.1F, -0.7F, 1F, -0.1F, -0.9F, 0F, -0.1F, -0.9F, 0F); // Box 51
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-4F, -9F, 0F, 8, 3, 4, 0F,0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F); // Box 23
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-4F, -6F, 0F, 8, 4, 4, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0F, 0.2F, -1.8F, 0F, 0.2F, -1.8F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Box 24
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-4F, -9F, -4F, 8, 1, 4, 0F,-1F, 0.2F, 0.2F, -1F, 0.2F, 0.2F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, -1.8F, -0.8F, 0.2F, -1.8F, -0.8F, 0.2F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 25
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-2.5F, -3.2F, -4.5F, 2, 1, 1, 0F,-0.4F, -0.7F, 0F, 0.3F, -0.3F, 0F, 0.3F, -0.3F, 0F, -0.4F, -0.7F, 0F, 0.5F, 0.5F, 0.3F, 0.6F, 0.3F, 0F, 0.6F, 0.3F, 0F, 0.5F, 0.5F, 0F); // Box 35
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(0.5F, -3.2F, -4.5F, 2, 1, 1, 0F,0.3F, -0.3F, 0F, -0.4F, -0.7F, 0F, -0.4F, -0.7F, 0F, 0.3F, -0.3F, 0F, 0.6F, 0.3F, 0F, 0.5F, 0.5F, 0.3F, 0.5F, 0.5F, 0F, 0.6F, 0.3F, 0F); // Box 36
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(1F, -5.8F, -4.2F, 2, 1, 1, 0F,0.1F, -0.2F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.1F, -0.2F, 0F, 0.2F, -0.4F, 0F, -0.8F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.4F, 0F); // Box 29
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(2.5F, -5.8F, -4.2F, 1, 1, 1, 0F,0.3F, 0F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, 0.3F, 0F, 0F, 0.5F, -0.5F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, 0.5F, -0.5F, 0F); // Box 30
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(-0.5F, -1.5F, -4.3F, 1, 1, 1, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 64
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(-3F, -5.8F, -4.2F, 2, 1, 1, 0F,-0.8F, 0F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, -0.8F, 0F, 0F, -0.8F, -0.5F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.5F, 0F); // Box 40
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(-3.5F, -5.8F, -4.2F, 1, 1, 1, 0F,-0.4F, -0.3F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, -0.4F, -0.3F, 0F, -0.2F, -0.1F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -0.2F, -0.1F, 0F); // Box 41
		headModel[12].setRotationPoint(0F, 0F, 0F);
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 15
		bodyModel[1] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 59
		bodyModel[2] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 44
		bodyModel[3] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 60
		bodyModel[4] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 61
		bodyModel[5] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 62

		bodyModel[0].addShapeBox(-4F, -0.5F, -2F, 2, 12, 4, 0F,1F, 0.2F, 0.8F, 0.5F, 0.5F, 0.8F, 2F, 0.5F, 0.8F, 1F, 0.2F, 0.8F, 0.5F, 0F, 0.5F, 1F, -0.5F, 0.5F, 2F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 15
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-2F, -1F, -2.5F, 4, 12, 1, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(2F, -0.5F, -2F, 2, 12, 4, 0F,0.5F, 0.5F, 0.8F, 1F, 0.2F, 0.8F, 1F, 0.2F, 0.8F, 2F, 0.5F, 0.8F, 1F, -0.5F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 2F, 0F, 0.5F); // Box 44
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-1F, 1F, -3F, 2, 1, 1, 0F,-0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F); // Box 60
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-2.8F, 1F, -3F, 2, 1, 1, 0F,-0.5F, 0.5F, 0F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, -0.5F, 0.5F, 0F); // Box 61
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(0.8F, 1F, -3F, 2, 1, 1, 0F,0F, 0.1F, -0.2F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.1F, -0.2F); // Box 62
		bodyModel[5].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 35
		leftArmModel[1] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 52

		leftArmModel[0].addShapeBox(-1F, 7F, -2F, 4, 3, 4, 0F,0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F); // Box 35
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1F, -2F, -2F, 4, 10, 4, 0F,0.1F, 0.6F, 0.1F, 0.1F, 0.7F, 0.1F, 0.1F, 0.7F, 0.1F, 0.1F, 0.6F, 0.1F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F); // Box 52
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 61
		rightArmModel[1] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 34

		rightArmModel[0].addShapeBox(-3F, -2F, -2F, 4, 10, 4, 0F,0.1F, 0.6F, 0.1F, 0.1F, 0.7F, 0.1F, 0.1F, 0.7F, 0.1F, 0.1F, 0.6F, 0.1F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F); // Box 61
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3F, 7F, -2F, 4, 3, 4, 0F,0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F); // Box 34
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 27
		leftLegModel[1] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 28
		leftLegModel[2] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 93

		leftLegModel[0].addShapeBox(-2F, 10F, -4F, 4, 2, 2, 0F,0.1F, -0.9F, 0.1F, 0.1F, -0.9F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 27
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, 10F, -2F, 4, 2, 4, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 28
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-2F, -1F, -2F, 4, 11, 4, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.15F, 0.2F, 0.15F, 0.15F, 0.1F, 0.15F, 0.15F, 0.1F, 0.15F, 0.15F, 0.2F, 0.15F); // Box 93
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 18
		rightLegModel[1] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 19
		rightLegModel[2] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 29

		rightLegModel[0].addShapeBox(-2F, 10F, -2F, 4, 2, 4, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 18
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, 10F, -4F, 4, 2, 2, 0F,0.1F, -0.9F, 0.1F, 0.1F, -0.9F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 19
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2F, -1F, -2F, 4, 11, 4, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.15F, 0.1F, 0.15F, 0.15F, 0.2F, 0.15F, 0.15F, 0.2F, 0.15F, 0.15F, 0.1F, 0.15F); // Box 29
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);
	}
}