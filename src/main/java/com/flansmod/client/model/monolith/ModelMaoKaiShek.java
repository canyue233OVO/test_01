//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: MaoKaiShek
// Model Creator: 
// Created on: 19.05.2020 - 08:09:04
// Last changed on: 19.05.2020 - 08:09:04

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelMaoKaiShek extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelMaoKaiShek() //Same as Filename
	{
		headModel = new ModelRendererTurbo[17];
		bodyModel = new ModelRendererTurbo[14];
		leftArmModel = new ModelRendererTurbo[8];
		rightArmModel = new ModelRendererTurbo[7];
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
		headModel[0] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 22
		headModel[1] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 28
		headModel[2] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 38
		headModel[3] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 124
		headModel[4] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 125
		headModel[5] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 92
		headModel[6] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 102
		headModel[7] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 33
		headModel[8] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 34
		headModel[9] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Box 40
		headModel[10] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Box 41
		headModel[11] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 46
		headModel[12] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 47
		headModel[13] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 48
		headModel[14] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 87
		headModel[15] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 88
		headModel[16] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 89

		headModel[0].addShapeBox(-4F, -8F, -4F, 8, 8, 8, 0F,0.05F, 0.05F, 0.05F, 0.05F, 0.05F, 0.05F, 0.05F, 0.05F, 0.05F, 0.05F, 0.05F, 0.05F, 0.1F, 0.55F, 0.05F, 0.1F, 0.55F, 0.05F, 0.1F, 0.55F, 0.05F, 0.1F, 0.55F, 0.05F); // Box 22
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-0.5F, -3.5F, -4F, 1, 1, 1, 0F,-0.15F, 0.7F, 0F, -0.15F, 0.7F, 0F, 0F, 0.7F, -0.8F, 0F, 0.7F, -0.8F, -0.05F, 0.2F, 1F, -0.05F, 0.2F, 1F, 0.8F, 0.4F, -0.8F, 0.8F, 0.4F, -0.8F); // Box 28
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-3.3F, -5.2F, -4.2F, 2, 1, 1, 0F,-0.4F, -0.1F, 0F, 0.3F, -0.2F, 0F, 0.3F, -0.2F, 0F, -0.4F, -0.1F, 0F, -0.1F, -0.2F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F, 0F, -0.1F, -0.2F, 0F); // Box 38
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-3.1F, -4.3F, -4F, 2, 1, 1, 0F,-0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F); // Box 124
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(1.1F, -4.3F, -4F, 2, 1, 1, 0F,-0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F); // Box 125
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-3.1F, -4.4F, -4.05F, 2, 1, 1, 0F,-0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.5F, 0.1F, -2F, -0.5F, 0.1F, -2F, -0.5F, 0.1F, -0.1F, -0.5F, 0.1F); // Box 92
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(1.1F, -4.4F, -4.05F, 2, 1, 1, 0F,-0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -2F, -0.5F, 0.1F, -0.1F, -0.5F, 0.1F, -0.1F, -0.5F, 0.1F, -2F, -0.5F, 0.1F); // Box 102
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-5F, -7.5F, -4F, 2, 2, 8, 0F,0.2F, 0F, 0.8F, -0.2F, 0.5F, 0.5F, -0.2F, 0.5F, 0.2F, 0.2F, 0F, 0.2F, 0F, 0F, 0.5F, -1.2F, 1F, 0.2F, -0.2F, 1F, 0.2F, 0F, 0F, 0.2F); // Box 33
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(-4F, -6.1F, -4F, 1, 2, 8, 0F,0.5F, 0.5F, 0.5F, -0.7F, 0.2F, 0.2F, -0.7F, 0.2F, 0.2F, 0.5F, 0.5F, 0.2F, 0.2F, 0.2F, 0.2F, -1F, 0.5F, 0.2F, -1F, 0.5F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 34
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(3F, -7.5F, -4F, 2, 2, 8, 0F,-0.2F, 0.5F, 0.5F, 0.2F, 0F, 0.8F, 0.2F, 0F, 0.2F, -0.2F, 0.5F, 0.2F, -1.2F, 1F, 0.2F, 0F, 0F, 0.5F, 0F, 0F, 0.2F, -0.2F, 1F, 0.2F); // Box 40
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(3F, -6.1F, -4F, 1, 2, 8, 0F,-0.7F, 0.2F, 0.2F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.2F, -0.7F, 0.2F, 0.2F, -1F, 0.5F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, -1F, 0.5F, 0.2F); // Box 41
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(3F, -3.6F, -1F, 1, 1, 5, 0F,-1F, 0.2F, 0.2F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.2F, -1F, 0.2F, 0.2F, -1F, 0.5F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, -1F, 0.5F, 0.2F); // Box 46
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(-4F, -3.6F, -1F, 1, 1, 5, 0F,0.2F, 0.5F, 0.5F, -1F, 0.2F, 0.2F, -1F, 0.2F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.2F, 0.2F, -1F, 0.5F, 0.2F, -1F, 0.5F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 47
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(-4F, -7.1F, 3F, 8, 5, 1, 0F,0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 48
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(1.3F, -5.2F, -4.2F, 2, 1, 1, 0F,0.3F, -0.2F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, 0.3F, -0.2F, 0F, 0.2F, -0.4F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, 0.2F, -0.4F, 0F); // Box 87
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(-2.6F, -4.4F, -4.05F, 2, 1, 1, 0F,-0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -2F, -0.5F, 0.1F, -0.1F, -0.5F, 0.1F, -0.1F, -0.5F, 0.1F, -2F, -0.5F, 0.1F); // Box 88
		headModel[15].setRotationPoint(0F, 0F, 0F);

		headModel[16].addShapeBox(0.6F, -4.4F, -4.05F, 2, 1, 1, 0F,-0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.5F, 0.1F, -2F, -0.5F, 0.1F, -2F, -0.5F, 0.1F, -0.1F, -0.5F, 0.1F); // Box 89
		headModel[16].setRotationPoint(0F, 0F, 0F);
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 15
		bodyModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 58
		bodyModel[2] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 62
		bodyModel[3] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 64
		bodyModel[4] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 14
		bodyModel[5] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 24
		bodyModel[6] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 31
		bodyModel[7] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 57
		bodyModel[8] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 58
		bodyModel[9] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 59
		bodyModel[10] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 60
		bodyModel[11] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 61
		bodyModel[12] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 62
		bodyModel[13] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 75

		bodyModel[0].addShapeBox(-4F, 0F, -2F, 8, 7, 4, 0F,1F, 0.3F, 0.3F, 1F, 0.3F, 0.3F, 1F, 0.3F, 0.3F, 1F, 0.3F, 0.3F, 0.5F, 0F, 0.1F, 0.5F, 0F, 0.1F, 0.5F, 0F, 0.1F, 0.5F, 0F, 0.1F); // Box 15
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4F, 8F, -2F, 2, 9, 4, 0F,0.5F, 0F, 0.1F, 4F, 0F, 0F, 4F, 0F, 0F, 0.5F, 0F, 0.1F, 1F, -0.5F, 0.3F, 0F, -0.2F, 0.5F, 0F, 0F, 0.7F, 1F, -0.5F, 0.3F); // Box 58
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-3F, 0F, -3F, 3, 1, 2, 0F,-0.5F, 0.6F, -0.3F, 0.3F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.6F, 0F, 0F, -1F, -0.3F, -1F, 0.5F, 0F, -1F, 0F, 0F, 0F, -1F, 0F); // Box 62
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(0F, 0F, -3F, 3, 1, 2, 0F,0.3F, 0F, -0.1F, -0.5F, 0.6F, -0.3F, -0.5F, 0.6F, 0F, 0F, 0F, 0F, -1F, 0.5F, 0F, 0F, -1F, -0.3F, 0F, -1F, 0F, -1F, 0F, 0F); // Box 64
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-4.5F, 5F, -2F, 9, 5, 4, 0F,0.2F, -1.8F, 0.3F, 0.2F, -1.8F, 0.3F, 0.2F, -1.8F, 0.3F, 0.2F, -1.8F, 0.3F, 0.2F, -1.8F, 0.3F, 0.2F, -1.8F, 0.3F, 0.2F, -1.8F, 0.3F, 0.2F, -1.8F, 0.3F); // Box 14
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(2F, 8F, -2F, 2, 9, 4, 0F,4F, 0F, 0.2F, 0.5F, 0F, 0.1F, 0.5F, 0F, 0.1F, 4F, 0F, 0.2F, 0F, 0F, 0.9F, 1F, -0.5F, 0.3F, 1F, -0.5F, 0.3F, 0F, 0F, 0.9F); // Box 24
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(0F, -0.5F, -2.5F, 1, 8, 5, 0F,-0.9F, 0F, 0F, 2.3F, 0F, 0F, 2.3F, 0F, 0F, -0.9F, 0F, 0F, 4F, -0.5F, -0.25F, -2.5F, -0.5F, -0.25F, -2.5F, -0.5F, -0.25F, 4F, 0F, -0.25F); // Box 31
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(3.2F, 5.5F, -2.5F, 1, 1, 2, 0F,0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F); // Box 57
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(1.2F, 5.3F, -2.5F, 1, 1, 2, 0F,0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F); // Box 58
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(1.4F, 3.5F, -2.5F, 1, 1, 2, 0F,0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F); // Box 59
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(3.4F, 3.7F, -2.5F, 1, 1, 2, 0F,0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F); // Box 60
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(1.4F, 1.5F, -2.5F, 3, 1, 2, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 61
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-6F, 7.5F, -2.5F, 1, 8, 5, 0F,-1.9F, -0.5F, -0.3F, 3.1F, -0.5F, -0.24F, 3.1F, 0F, -0.25F, -1.9F, -0.5F, -0.3F, -1.3F, -6.5F, -0.3F, 0.1F, -3F, -0.18F, 0.1F, -3F, -0.2F, -1.3F, -6.5F, -0.3F); // Box 62
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(-0.5F, 7F, -2.5F, 1, 1, 2, 0F,0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F); // Box 75
		bodyModel[13].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 96
		leftArmModel[1] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 97
		leftArmModel[2] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 98
		leftArmModel[3] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 99
		leftArmModel[4] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 45
		leftArmModel[5] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 46
		leftArmModel[6] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 77
		leftArmModel[7] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 78

		leftArmModel[0].addShapeBox(-1F, -2F, -2F, 4, 10, 4, 0F,0.1F, 0.2F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.2F, 0.1F, 0.3F, 0.6F, 0.2F, 0.3F, 0.6F, 0.2F, 0.3F, 0.6F, 0.2F, 0.3F, 0.6F, 0.2F); // Box 96
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1F, 0F, -2F, 4, 10, 4, 0F,0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.5F, 0F, 0.1F, 0.5F, 0F, 0.1F, 0.5F, 0F, 0.1F, 0.5F, 0F); // Box 97
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(-1F, 7.5F, -2F, 4, 1, 4, 0F,0F, 0.2F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.2F, 0F, 0.3F, 0.6F, 0.2F, 0.3F, 0.6F, 0.2F, 0.3F, 0.6F, 0.2F, 0.3F, 0.6F, 0.2F); // Box 98
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);

		leftArmModel[3].addShapeBox(-1.7F, 3F, -2F, 1, 5, 4, 0F,-0.3F, 0F, -1.9F, -0.3F, 0F, -1.9F, -0.3F, 0F, -1.9F, -0.3F, 0F, -1.9F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 99
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);

		leftArmModel[4].addShapeBox(-1.7F, -2.15F, -2F, 5, 2, 7, 0F,-2F, 0.2F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, -2.7F, -2F, 0.2F, -2.7F, -2F, -0.3F, 0.5F, 0.7F, 0.1F, 0.5F, 0.7F, 0.1F, -2.5F, -2F, -0.3F, -2.5F); // Box 45
		leftArmModel[4].setRotationPoint(0F, 0F, 0F);

		leftArmModel[5].addShapeBox(-1F, -2.6F, -1F, 4, 1, 2, 0F,0F, 0F, -0.1F, 0.2F, -0.2F, -0.1F, 0.2F, -0.2F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0.4F, 0F, -0.1F, 0.4F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 46
		leftArmModel[5].setRotationPoint(0F, 0F, 0F);

		leftArmModel[6].addShapeBox(0.7F, 3F, -2F, 3, 5, 4, 0F,0F, 0F, 0.3F, -0.4F, -2F, 0.3F, -0.4F, -2F, 0.3F, 0F, 0F, 0.3F, 0F, -2F, 0.3F, -0.3F, 0F, 0.3F, -0.3F, 0F, 0.3F, 0F, -2F, 0.3F); // Box 77
		leftArmModel[6].setRotationPoint(0F, 0F, 0F);

		leftArmModel[7].addShapeBox(-1.8F, 3F, -2F, 2, 5, 4, 0F,-0.4F, -2F, 0.3F, 0.5F, 0F, 0.3F, 0.5F, 0F, 0.3F, -0.4F, -2F, 0.3F, -0.3F, 0F, 0.3F, 0.5F, -2F, 0.3F, 0.5F, -2F, 0.3F, -0.3F, 0F, 0.3F); // Box 78
		leftArmModel[7].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 61
		rightArmModel[1] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 34
		rightArmModel[2] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 86
		rightArmModel[3] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 88
		rightArmModel[4] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 94
		rightArmModel[5] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 95
		rightArmModel[6] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 76

		rightArmModel[0].addShapeBox(-3F, -2F, -2F, 4, 10, 4, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.1F, 0.1F, 0.3F, 0.6F, 0.2F, 0.3F, 0.6F, 0.2F, 0.3F, 0.6F, 0.2F, 0.3F, 0.6F, 0.2F); // Box 61
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3F, 0F, -2F, 4, 10, 4, 0F,0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.5F, 0F, 0.1F, 0.5F, 0F, 0.1F, 0.5F, 0F, 0.1F, 0.5F, 0F); // Box 34
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-3.7F, 3F, -2F, 3, 5, 4, 0F,-0.4F, -2F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, -0.4F, -2F, 0.3F, -0.3F, 0F, 0.3F, 0F, -2F, 0.3F, 0F, -2F, 0.3F, -0.3F, 0F, 0.3F); // Box 86
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);

		rightArmModel[3].addShapeBox(-3F, 7.5F, -2F, 4, 1, 4, 0F,0F, 0.1F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.1F, 0F, 0.3F, 0.6F, 0.2F, 0.3F, 0.6F, 0.2F, 0.3F, 0.6F, 0.2F, 0.3F, 0.6F, 0.2F); // Box 88
		rightArmModel[3].setRotationPoint(0F, 0F, 0F);

		rightArmModel[4].addShapeBox(-3F, -2.6F, -1F, 4, 1, 2, 0F,0.2F, -0.2F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0.2F, -0.2F, -0.1F, 0.4F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0.4F, 0F, -0.1F); // Box 94
		rightArmModel[4].setRotationPoint(0F, 0F, 0F);

		rightArmModel[5].addShapeBox(-3.3F, -2.15F, -2F, 5, 2, 7, 0F,0.2F, 0F, 0.3F, -2F, 0.2F, 0.3F, -2F, 0.2F, -2.7F, 0.2F, 0F, -2.7F, 0.7F, 0.1F, 0.5F, -2F, -0.3F, 0.5F, -2F, -0.3F, -2.5F, 0.7F, 0.1F, -2.5F); // Box 95
		rightArmModel[5].setRotationPoint(0F, 0F, 0F);

		rightArmModel[6].addShapeBox(-0.2F, 3F, -2F, 2, 5, 4, 0F,0.5F, 0F, 0.3F, -0.4F, -2F, 0.3F, -0.4F, -2F, 0.3F, 0.5F, 0F, 0.3F, 0.5F, -2F, 0.3F, -0.3F, 0F, 0.3F, -0.3F, 0F, 0.3F, 0.5F, -2F, 0.3F); // Box 76
		rightArmModel[6].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 93
		leftLegModel[1] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 94
		leftLegModel[2] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 95

		leftLegModel[0].addShapeBox(-2F, 0F, -2F, 4, 10, 4, 0F,0.1F, 0.2F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.2F, 0.1F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F); // Box 93
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, 10F, -2F, 4, 2, 4, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 94
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-2F, 10F, -4F, 4, 2, 2, 0F,0.1F, -0.9F, 0.1F, 0.1F, -0.9F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 95
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 18
		rightLegModel[1] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 19
		rightLegModel[2] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 29

		rightLegModel[0].addShapeBox(-2F, 10F, -2F, 4, 2, 4, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 18
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, 10F, -4F, 4, 2, 2, 0F,0.1F, -0.9F, 0.1F, 0.1F, -0.9F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 19
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2F, 0F, -2F, 4, 10, 4, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.1F, 0.1F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F); // Box 29
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);
	}
}