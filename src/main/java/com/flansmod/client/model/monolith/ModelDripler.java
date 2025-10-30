//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Dripler
// Model Creator: 
// Created on: 19.05.2020 - 08:09:04
// Last changed on: 19.05.2020 - 08:09:04

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelDripler extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelDripler() //Same as Filename
	{
		headModel = new ModelRendererTurbo[14];
		bodyModel = new ModelRendererTurbo[18];
		leftArmModel = new ModelRendererTurbo[4];
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
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 22
		headModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 28
		headModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 51
		headModel[3] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Box 34
		headModel[4] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Box 14
		headModel[5] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 12
		headModel[6] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Box 13
		headModel[7] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 30
		headModel[8] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 29
		headModel[9] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 30
		headModel[10] = new ModelRendererTurbo(this, 73, 97, textureX, textureY); // Box 53
		headModel[11] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 54
		headModel[12] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 55
		headModel[13] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 56

		headModel[0].addShapeBox(-4F, -9.55F, -4F, 8, 8, 8, 0F,0.05F, 0F, 0.05F, 0.05F, 0F, 0.05F, 0.05F, -0.5F, 0.05F, 0.05F, -0.5F, 0.05F, -0.05F, 0.5F, 0.05F, -0.05F, 0.5F, 0.05F, -0.05F, 0.5F, 0.05F, -0.05F, 0.5F, 0.05F); // Box 22
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-0.5F, -5.4F, -4F, 1, 1, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0.5F, 1.3F, 0F, 0.5F, 1.3F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F); // Box 28
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-0.5F, -3.4F, -4F, 1, 1, 1, 0F,0F, 0.5F, 1.3F, 0F, 0.5F, 1.3F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0F, -1F, 1.2F, 0F, -1F, 1.2F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 51
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-4.5F, -10F, -4.5F, 9, 6, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0.3F, 0F, -1.5F, 0.3F, -0.2F, -2.5F, 0.3F, -0.2F, -2.5F, 0.3F, -0.2F, -1F, 0.1F, -0.2F, -1F, 0.1F); // Box 34
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-4F, -7.5F, -7F, 8, 1, 3, 0F,-2.5F, -0.5F, -0.3F, -2.5F, -0.5F, -0.3F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -2F, 0F, 0.3F, -2F, 0F, 0.3F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F); // Box 14
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-4.5F, -10.5F, -3.9F, 9, 6, 8, 0F,0.7F, 0.5F, 1.5F, 0.7F, 0.5F, 1.5F, 0.7F, -2.2F, 2F, 0.7F, -2.2F, 2F, -0.4F, -3.9F, 0.4F, -0.4F, -3.9F, 0.4F, -0.4F, -2.8F, 0.3F, -0.4F, -2.8F, 0.3F); // Box 12
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-4.5F, -9.7F, -3.9F, 9, 3, 8, 0F,-0.8F, 1.5F, -0.7F, -0.8F, 1.5F, -0.7F, -0.8F, -0.4F, 0.2F, -0.8F, -0.4F, 0.2F, 0.8F, -4.3F, 1.5F, 0.8F, -4.3F, 1.5F, 0.8F, -1.6F, 2F, 0.8F, -1.6F, 2F); // Box 13
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-1F, -3.4F, -4.4F, 2, 1, 1, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F); // Box 30
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(1F, -6F, -4.2F, 2, 1, 1, 0F,0.1F, -0.2F, 0F, -0.8F, -0.1F, 0F, -0.8F, -0.1F, 0F, 0.1F, -0.2F, 0F, 0.2F, -0.4F, 0F, -0.8F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.4F, 0F); // Box 29
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(2.5F, -6F, -4.2F, 1, 1, 1, 0F,0.3F, -0.1F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0.3F, -0.1F, 0F, 0.5F, -0.5F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.5F, -0.5F, 0F); // Box 30
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(-10.5F, -18.3F, -5.5F, 21, 17, 1, 0F,-9.1F, -7.6F, 0F, -9.1F, -7.6F, 0F, -9.1F, -7.6F, 0F, -9.1F, -7.6F, 0F, -9.1F, -7.6F, -0.6F, -9.1F, -7.6F, -0.6F, -9.1F, -7.6F, 0F, -9.1F, -7.6F, 0F); // Box 53
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(-8.5F, -16.5F, -4.9F, 17, 17, 1, 0F,-8F, -8F, 0F, -8F, -8F, 0F, -8F, -8F, 0F, -8F, -8F, 0F, -8F, -8F, 0F, -8F, -8F, 0F, -8F, -8F, 0F, -8F, -8F, 0F); // Box 54
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(-3F, -6F, -4.2F, 2, 1, 1, 0F,-0.8F, -0.1F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, -0.8F, -0.1F, 0F, -0.8F, -0.5F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.5F, 0F); // Box 55
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(-3.5F, -6F, -4.2F, 1, 1, 1, 0F,-0.4F, -0.2F, 0F, 0.3F, -0.1F, 0F, 0.3F, -0.1F, 0F, -0.4F, -0.2F, 0F, 0F, -0.3F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.3F, 0F); // Box 56
		headModel[13].setRotationPoint(0F, 0F, 0F);
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 59
		bodyModel[1] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 62
		bodyModel[2] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 31
		bodyModel[3] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 14
		bodyModel[4] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 19
		bodyModel[5] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 25
		bodyModel[6] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 26
		bodyModel[7] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 27
		bodyModel[8] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 15
		bodyModel[9] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 41
		bodyModel[10] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 42
		bodyModel[11] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 43
		bodyModel[12] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 44
		bodyModel[13] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 45
		bodyModel[14] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 46
		bodyModel[15] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 47
		bodyModel[16] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 48
		bodyModel[17] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 49

		bodyModel[0].addShapeBox(-2F, -1F, -3F, 4, 6, 1, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -1.98F, 0F, -0.35F, -1.98F, 0F, -0.35F, -1.98F, 0F, 0F, -1.98F, 0F, 0F); // Box 59
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-0.5F, -1.5F, -3F, 1, 7, 1, 0F,0F, -0.5F, 0.3F, 0F, -0.5F, 0.3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.49F, 0F, -0.4F, -0.49F, 0F, -0.4F, -0.49F, 0F, 0F, -0.49F, 0F, 0F); // Box 62
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-2.5F, -0.5F, -2.5F, 1, 9, 5, 0F,1.1F, 0F, 0.4F, -1.4F, 0F, 0.4F, -1.4F, 0F, 0.4F, 1.1F, 0F, 0.4F, -2.4F, -0.5F, 0.1F, 2.1F, -0.5F, 0.1F, 2.1F, 0F, 0.1F, -2.4F, -0.5F, 0.1F); // Box 31
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-4.5F, 8F, -2F, 9, 1, 4, 0F,0.2F, 0F, 0.7F, 0.2F, 0F, 0.7F, 0.2F, 0F, 0.7F, 0.2F, 0F, 0.7F, 0.2F, 0F, 0.7F, 0.2F, 0F, 0.7F, 0.2F, 0F, 0.7F, 0.2F, 0F, 0.7F); // Box 14
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-5F, -0.5F, -2.5F, 5, 9, 3, 0F,0.7F, 0.5F, 0.5F, -2.5F, 1F, 0.7F, -2.5F, 1.5F, 0.2F, 0.7F, 1.5F, 0.2F, 0F, 0F, 0.3F, -1.3F, 0F, 0.8F, -1.3F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 19
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-5F, 8.5F, -2.5F, 5, 6, 3, 0F,0F, 0F, 0.3F, -1.3F, 0F, 0.8F, -1.3F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0.2F, 0.5F, -1.7F, -0.5F, 1.4F, -1.7F, -0.5F, 0F, 0.5F, 0.2F, 0F); // Box 25
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-5F, -0.5F, 0F, 10, 9, 3, 0F,0.5F, 1.5F, 0F, 0.5F, 1.5F, 0F, 0.5F, 0.3F, 1.5F, 0.5F, 0.3F, 1.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -1F, 0.5F, -0.2F, -1F, 0.5F); // Box 26
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-5F, 8.5F, 0F, 10, 6, 3, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 1F, 0.5F, -0.2F, 1F, 0.5F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0F, 0.5F, 0.7F, 0F, 0.5F, 0.7F); // Box 27
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-4F, -0.5F, -2F, 8, 13, 4, 0F,1F, 0.3F, 0.8F, 1F, 0.3F, 0.8F, 1F, 0.3F, 0.8F, 1F, 0.3F, 0.8F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 15
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-4.5F, -1.5F, -3.5F, 3, 10, 1, 0F,2.5F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, -1F, -1F, -2.9F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.5F, -2.9F, 0F, 0.5F); // Box 41
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-6.5F, -1.5F, -3.1F, 5, 1, 7, 0F,1F, 0.5F, 0.2F, 0F, 0F, 0.2F, -2F, 1.5F, 0.2F, 0F, 2F, 0.2F, 1F, -1F, 0.2F, 0F, -0.5F, 0.5F, -2F, 0F, 0.2F, 0F, -2F, 0.2F); // Box 42
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(-7.5F, -1.5F, 4.3F, 6, 1, 3, 0F,-1F, 2F, 0.2F, -2F, 1.5F, 0.2F, 0F, 2.5F, 0.2F, -3F, 2.3F, -0.8F, -1F, -2F, 0.2F, -2F, 0F, 0.2F, 0F, -2.5F, 0.5F, -3F, -2.4F, -0.8F); // Box 43
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(1.5F, -1.5F, 4.3F, 6, 1, 3, 0F,-2F, 1.5F, 0.2F, -1F, 2F, 0.2F, -3F, 2.3F, -0.8F, 0F, 2.5F, 0.2F, -2F, 0F, 0.2F, -1F, -2F, 0.2F, -3F, -2.4F, -0.8F, 0F, -2.5F, 0.5F); // Box 44
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(1.5F, -1.5F, -3.1F, 5, 1, 7, 0F,0F, 0F, 0.2F, 1F, 0.5F, 0.2F, 0F, 2F, 0.2F, -2F, 1.5F, 0.2F, 0F, -0.5F, 0.5F, 1F, -1F, 0.2F, 0F, -2F, 0.2F, -2F, 0F, 0.2F); // Box 45
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(1.5F, -1.5F, -3.5F, 3, 10, 1, 0F,0F, 0F, 0F, 2.5F, -1F, 1F, 2.5F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, -0.2F, -2.9F, 0F, -0.2F, -2.9F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 46
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(0F, -0.5F, -2.5F, 5, 9, 3, 0F,-2.5F, 1F, 0.7F, 0.7F, 0.5F, 0.5F, 0.7F, 1.5F, 0.2F, -2.5F, 1.5F, 0.2F, -1.3F, 0F, 0.8F, 0F, 0F, 0.3F, 0F, 0F, 0.5F, -1.3F, 0F, 0.5F); // Box 47
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(0F, 8.5F, -2.5F, 5, 6, 3, 0F,-1.3F, 0F, 0.8F, 0F, 0F, 0.3F, 0F, 0F, 0.5F, -1.3F, 0F, 0.5F, -1.7F, -0.5F, 1.4F, 0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0F, -1.7F, -0.5F, 0F); // Box 48
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(-1.5F, -1.5F, 4.3F, 3, 1, 3, 0F,2F, 1.5F, 0.2F, 2F, 1.5F, 0.2F, 0F, 2.5F, 0.2F, 0F, 2.5F, 0.2F, 2F, 0F, 0.2F, 2F, 0F, 0.2F, 0F, -2.5F, 0.5F, 0F, -2.5F, 0.5F); // Box 49
		bodyModel[17].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 35
		leftArmModel[1] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 50
		leftArmModel[2] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 23
		leftArmModel[3] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 29

		leftArmModel[0].addShapeBox(-1F, 7F, -2F, 4, 3, 4, 0F,0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F); // Box 35
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1F, -2F, -2F, 4, 10, 4, 0F,0.5F, 1.5F, 0.3F, 0.8F, 0.3F, 0.3F, 0.8F, 0.3F, 0.3F, 0.5F, 1.5F, 0.3F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F); // Box 50
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(-0.6F, 1.5F, -2F, 4, 3, 4, 0F,1F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 1F, -0.2F, 0.4F, 1F, -0.2F, 0.4F, 0.3F, -0.2F, 0.4F, 0.3F, -0.2F, 0.4F, 1F, -0.2F, 0.4F); // Box 23
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);

		leftArmModel[3].addShapeBox(2.95F, -2.5F, -5.5F, 1, 12, 12, 0F,-0.2F, -4.5F, -4.5F, -0.1F, -4.5F, -4.5F, -0.1F, -4.5F, -5.5F, -0.2F, -4.5F, -5.5F, -0.2F, -5.5F, -4.5F, -0.2F, -5.5F, -4.5F, -0.2F, -5.5F, -5.5F, -0.2F, -5.5F, -5.5F); // Box 29
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 61
		rightArmModel[1] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 34

		rightArmModel[0].addShapeBox(-3F, -2F, -2F, 4, 10, 4, 0F,0.8F, 0.3F, 0.3F, 0.5F, 1.5F, 0.3F, 0.5F, 1.5F, 0.3F, 0.8F, 0.3F, 0.3F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F); // Box 61
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3F, 7F, -2F, 4, 3, 4, 0F,0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F); // Box 34
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 27
		leftLegModel[1] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 28
		leftLegModel[2] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 93

		leftLegModel[0].addShapeBox(-2F, 10F, -4F, 4, 2, 2, 0F,0.1F, -0.9F, 0.1F, 0.1F, -0.9F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 27
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, 10F, -2F, 4, 2, 4, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 28
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-2F, -1F, -2F, 4, 11, 4, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.15F, 0.2F, 0.15F, 0.15F, 0.1F, 0.15F, 0.15F, 0.1F, 0.15F, 0.15F, 0.2F, 0.15F); // Box 93
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 18
		rightLegModel[1] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 19
		rightLegModel[2] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 29

		rightLegModel[0].addShapeBox(-2F, 10F, -2F, 4, 2, 4, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 18
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, 10F, -4F, 4, 2, 2, 0F,0.1F, -0.9F, 0.1F, 0.1F, -0.9F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 19
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2F, -1F, -2F, 4, 11, 4, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.15F, 0.1F, 0.15F, 0.15F, 0.2F, 0.15F, 0.15F, 0.2F, 0.15F, 0.15F, 0.1F, 0.15F); // Box 29
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);
	}
}