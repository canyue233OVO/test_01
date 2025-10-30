//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: brittanyVenti
// Model Creator: 
// Created on: 26.03.2020 - 09:48:43
// Last changed on: 26.03.2020 - 09:48:43

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelbrittanyVenti extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelbrittanyVenti() //Same as Filename
	{
		headModel = new ModelRendererTurbo[19];
		bodyModel = new ModelRendererTurbo[35];
		leftArmModel = new ModelRendererTurbo[4];
		rightArmModel = new ModelRendererTurbo[4];
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
		headModel[0] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 6
		headModel[1] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 57
		headModel[2] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 59
		headModel[3] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 61
		headModel[4] = new ModelRendererTurbo(this, 58, 101, textureX, textureY); // Box 64
		headModel[5] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 83
		headModel[6] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 84
		headModel[7] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 85
		headModel[8] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 86
		headModel[9] = new ModelRendererTurbo(this, 0, 65, textureX, textureY); // Box 87
		headModel[10] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 97
		headModel[11] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Box 115
		headModel[12] = new ModelRendererTurbo(this, 0, 65, textureX, textureY); // Box 116
		headModel[13] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 117
		headModel[14] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 118
		headModel[15] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 119
		headModel[16] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 120
		headModel[17] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Box 18
		headModel[18] = new ModelRendererTurbo(this, 121, 73, textureX, textureY); // Box 5

		headModel[0].addShapeBox(-4F, -8.1F, -4F, 8, 8, 8, 0F,0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-2.5F, -8.5F, -4.5F, 5, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 57
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-4.5F, -8.5F, 2.5F, 9, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-3.5F, -8.5F, -4.5F, 1, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 61
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-4.5F, 0.5F, 2.5F, 9, 4, 3, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-4.5F, -2.5F, -3F, 1, 4, 2, 0F,0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 83
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-4.5F, 1.5F, -4F, 1, 3, 2, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 84
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-4.5F, -4.5F, -4.5F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 85
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(-4.5F, -8.5F, -4.5F, 1, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-4.5F, -8.5F, -1.5F, 1, 12, 5, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -4F, 0F, -3F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(2.5F, -8.5F, -4.5F, 1, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 97
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(-4.5F, -6.5F, 2.5F, 9, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 115
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(3.5F, -8.5F, -1.5F, 1, 12, 5, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -4F, 0F, -3F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(3.5F, -8.5F, -4.5F, 1, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(3.5F, -4.5F, -4.5F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 118
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(3.5F, -2.5F, -3F, 1, 4, 2, 0F,0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 119
		headModel[15].setRotationPoint(0F, 0F, 0F);

		headModel[16].addShapeBox(3.5F, 1.5F, -4F, 1, 3, 2, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 120
		headModel[16].setRotationPoint(0F, 0F, 0F);

		headModel[17].addShapeBox(-3.2F, -5.3F, -3.9F, 2, 1, 1, 0F,-0.2F, -0.3F, 0.2F, -0.7F, -0.5F, 0.2F, -0.7F, -0.5F, 0.2F, -0.5F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, 0.1F, 0F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0F, 0.2F); // Box 18
		headModel[17].setRotationPoint(0F, 0F, 0F);

		headModel[18].addShapeBox(1.2F, -5.3F, -3.9F, 2, 1, 1, 0F,-0.7F, -0.5F, 0.2F, -0.2F, -0.3F, 0.2F, -0.5F, -0.3F, 0.2F, -0.7F, -0.5F, 0.2F, 0.1F, 0F, 0.2F, -0.3F, -0.3F, 0.2F, 0F, 0F, 0.2F, 0F, -0.2F, 0.2F); // Box 5
		headModel[18].setRotationPoint(0F, 0F, 0F);
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 7
		bodyModel[7] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 12
		bodyModel[8] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 13
		bodyModel[9] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 13
		bodyModel[11] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 90
		bodyModel[12] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 100
		bodyModel[13] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 101
		bodyModel[14] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 1
		bodyModel[15] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 3
		bodyModel[16] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 40
		bodyModel[17] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 41
		bodyModel[18] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 42
		bodyModel[19] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 18
		bodyModel[20] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 20
		bodyModel[21] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 21
		bodyModel[22] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 22
		bodyModel[23] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 23
		bodyModel[24] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 24
		bodyModel[25] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 25
		bodyModel[26] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 26
		bodyModel[27] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 123
		bodyModel[28] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 124
		bodyModel[29] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 125
		bodyModel[30] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 126
		bodyModel[31] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 127
		bodyModel[32] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 128
		bodyModel[33] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 129
		bodyModel[34] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 130

		bodyModel[0].addShapeBox(-4F, 2F, -2F, 8, 3, 4, 0F,-0.5F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0.5F, -1.5F, -1F, 0.5F, -1.5F); // Box 0
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4F, 9F, -2F, 8, 2, 4, 0F,-1.2F, 0F, 0.8F, -1.2F, 0F, 0.8F, -0.8F, 0F, -0.5F, -0.8F, 0F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F, -1.5F, -0.5F, 0.5F, -1.5F, -0.5F, 0.5F); // Box 1
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-3.5F, 5F, -3F, 7, 4, 4, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.7F, 0F, -0.2F, -0.7F, 0F, -0.2F, -0.7F, 0F, 0.5F, -0.7F, 0F, 0.5F); // Box 2
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-3F, 11F, -2F, 6, 2, 4, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -2.5F, -0.5F, -1F, -2.5F, -0.5F, -1F, -2F, 0F, -1F, -2F, 0F, -1F); // Box 3
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-4F, 0F, -2F, 8, 3, 4, 0F,-1F, 0F, -1.5F, -1F, 0F, -1.5F, -0.7F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.5F, -0.8F, 0.2F, -0.5F, -0.8F, 0.2F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 4
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-4F, 10.8F, -2F, 4, 3, 4, 0F,0.5F, -0.3F, 0.4F, -0.5F, -0.3F, 0F, 0F, 0F, 1F, 0.5F, 0.3F, 1F, 0F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-4F, 8.8F, -2F, 4, 2, 4, 0F,-1F, 2F, -1F, -1F, 0F, 0F, -0.3F, 0F, -0.5F, -0.8F, 1F, -0.8F, 0.5F, 0.3F, 0.4F, -0.5F, 0.3F, 0F, 0F, 0F, 1F, 0.5F, -0.3F, 1F); // Box 7
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(0F, 8.8F, -2F, 4, 2, 4, 0F,-1F, 0F, 0F, -1F, 2F, -1F, -0.8F, 1F, -0.8F, -0.3F, 0F, -0.5F, -0.5F, 0.3F, 0F, 0.5F, 0.3F, 0.4F, 0.5F, -0.3F, 1F, 0F, 0F, 1F); // Box 12
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(0F, 10.8F, -2F, 4, 3, 4, 0F,-0.5F, -0.3F, 0F, 0.5F, -0.3F, 0.4F, 0.5F, 0.3F, 1F, 0F, 0F, 1F, -0.3F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.3F, 0F, 0F); // Box 13
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-4F, 0F, -3F, 5, 3, 5, 0F,0.5F, 0F, -1.5F, -3.8F, 0F, -2F, -0.5F, 0.2F, -0.3F, 1F, 0.2F, -0.3F, -0.4F, -0.5F, -0.6F, -2.2F, -0.5F, -0.8F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F); // Box 9
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-1.5F, 3F, 1F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.2F, -1F, 0F, -0.2F, -1F); // Box 13
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(-1F, 0F, -3F, 5, 3, 5, 0F,-3.8F, 0F, -2F, 0.5F, 0F, -1.5F, 1F, 0.2F, -0.3F, -0.5F, 0.2F, -0.3F, -2.2F, -0.5F, -0.8F, -0.4F, -0.5F, -0.6F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F); // Box 90
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(0F, 10.8F, -2F, 4, 3, 4, 0F,-0.5F, -0.3F, 0.05F, 0.55F, -0.3F, 0.45F, 0.55F, 0.3F, 1.05F, 0.05F, 0F, 1.05F, -0.25F, 0F, 0.25F, 0.2F, -1F, 0.3F, 0.15F, -0.5F, 0.15F, -0.29F, 0F, 0.05F); // Box 100
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(-4F, 10.8F, -2F, 4, 3, 4, 0F,0.55F, -0.3F, 0.45F, -0.5F, -0.3F, 0.05F, 0.05F, 0F, 1.05F, 0.55F, 0.3F, 1.05F, 0.2F, -1F, 0.3F, -0.25F, 0F, 0.25F, -0.29F, 0F, 0.05F, 0.17F, -0.5F, 0.2F); // Box 101
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(-3F, 10F, -3F, 4, 1, 5, 0F,1.2F, 0F, -1F, 2.4F, 0F, -1F, 0.4F, 0.5F, 0F, 0.8F, 0.5F, 0.5F, 1.6F, 0F, -0.5F, 1.4F, 0F, -0.5F, 0.4F, 0F, 2F, 2.4F, 0F, 1.5F); // Box 1
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(1F, 10F, -3F, 2, 1, 5, 0F,2.4F, 0F, -1.2F, 1F, 0F, -0.8F, 1F, 0.5F, 0.7F, 0.4F, 0.5F, 0.2F, 1.4F, 0F, -0.4F, 1.6F, 0F, -0.7F, 2.4F, 0F, 1.3F, 0.4F, 0F, 1.8F); // Box 3
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(-1F, 1F, -3F, 2, 1, 1, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 40
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(-3F, 1F, -3F, 2, 1, 1, 0F,0F, 0.6F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.6F, 0F); // Box 41
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(1F, 1F, -3F, 2, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, -0.2F); // Box 42
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(-4F, 2.7F, -2.21F, 4, 2, 2, 0F,-0.5F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.7F, 0.4F, 0F, -1.5F, 0.4F, 0F, -1.2F, -2F, -0.5F, -1.2F, -2F); // Box 18
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(-3.5F, 3F, -3.4F, 3, 1, 1, 0F,0.1F, -0.6F, -0.2F, 0.1F, -0.8F, -0.2F, 0.5F, -0.2F, -0.2F, 0F, 0F, -0.2F, 0.5F, 0.6F, -0.2F, 0.3F, 0.6F, -0.2F, 0.5F, -0.5F, 0.2F, 0F, -0.5F, 0.2F); // Box 20
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(-3.3F, 2.9F, -4.19F, 3, 1, 1, 0F,0.3F, -2.1F, 0.5F, -0.4F, -2.2F, 0.5F, -0.1F, -0.9F, 0F, 0.3F, -0.7F, 0F, 0.7F, 1.9F, 0.5F, -0.1F, 1.9F, 0.5F, 0.1F, 0.7F, 0F, 0.7F, 0.7F, 0F); // Box 21
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(-3.3F, 4.89F, -4.2F, 3, 2, 1, 0F,0.7F, -0.9F, 0.5F, -0.1F, -0.9F, 0.5F, 0.1F, 0.3F, 0F, 0.7F, 0.3F, 0F, 0.5F, 1.1F, 0.8F, -0.6F, 1F, 0.8F, -0.5F, 0.9F, 0F, 0.6F, 1F, 0F); // Box 22
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(-3.5F, 3.79F, -3.4F, 3, 3, 1, 0F,0.5F, -0.8F, -0.2F, 0.3F, -0.8F, -0.2F, 0.5F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0.4F, 1.1F, -0.2F, -0.3F, 1F, -0.2F, 0.5F, 0.5F, 0.2F, 0.3F, 0.5F, 0.2F); // Box 23
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(-3.3F, 3.4F, -5.7F, 3, 1, 1, 0F,-0.5F, -3.4F, 0F, -2.2F, -3.4F, 0F, -0.4F, -1.7F, 0F, 0.3F, -1.6F, 0F, -0.4F, 2.7F, 0F, -2F, 2.7F, 0F, -0.1F, 1.4F, 0F, 0.7F, 1.4F, 0F); // Box 24
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(-3.3F, 6.79F, -5.7F, 3, 2, 1, 0F,-0.4F, -0.3F, 0F, -2F, -0.3F, 0F, -0.1F, 1F, 0F, 0.7F, 1F, 0F, -0.5F, -1.4F, 0F, -2.2F, -1.4F, 0F, -0.6F, -0.9F, -0.3F, 0.5F, -0.8F, -0.3F); // Box 25
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addShapeBox(-3.5F, 3.79F, -2F, 3, 2, 1, 0F,0F, 0.3F, 0.2F, 0.5F, 0.3F, 0.2F, 0.3F, 1F, 0.5F, 0F, 1.1F, 0.8F, 0.3F, 1.5F, 0.2F, 0.5F, 1.5F, 0.2F, -0.1F, -0.5F, 0F, -0.2F, -0.5F, 0F); // Box 26
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addShapeBox(0F, 2.7F, -2.21F, 4, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0.3F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0.4F, -0.5F, -1.7F, 0.4F, -0.5F, -1.2F, -2F, 0F, -1.2F, -2F); // Box 123
		bodyModel[27].setRotationPoint(0F, 0F, 0F);

		bodyModel[28].addShapeBox(0.5F, 3F, -3.4F, 3, 1, 1, 0F,0.1F, -0.8F, -0.2F, 0.1F, -0.6F, -0.2F, 0F, 0F, -0.2F, 0.5F, -0.2F, -0.2F, 0.3F, 0.6F, -0.2F, 0.5F, 0.6F, -0.2F, 0F, -0.5F, 0.2F, 0.5F, -0.5F, 0.2F); // Box 124
		bodyModel[28].setRotationPoint(0F, 0F, 0F);

		bodyModel[29].addShapeBox(0.5F, 3.79F, -2F, 3, 2, 1, 0F,0.5F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 1.1F, 0.8F, 0.3F, 1F, 0.5F, 0.5F, 1.5F, 0.2F, 0.3F, 1.5F, 0.2F, -0.2F, -0.5F, 0F, -0.1F, -0.5F, 0F); // Box 125
		bodyModel[29].setRotationPoint(0F, 0F, 0F);

		bodyModel[30].addShapeBox(0.5F, 3.79F, -3.4F, 3, 3, 1, 0F,0.3F, -0.8F, -0.2F, 0.5F, -0.8F, -0.2F, 0F, 0.3F, 0.2F, 0.5F, 0.3F, 0.2F, -0.3F, 1F, -0.2F, 0.4F, 1.1F, -0.2F, 0.3F, 0.5F, 0.2F, 0.5F, 0.5F, 0.2F); // Box 126
		bodyModel[30].setRotationPoint(0F, 0F, 0F);

		bodyModel[31].addShapeBox(0.3F, 4.89F, -4.2F, 3, 2, 1, 0F,-0.1F, -0.9F, 0.5F, 0.7F, -0.9F, 0.5F, 0.7F, 0.3F, 0F, 0.1F, 0.3F, 0F, -0.6F, 1F, 0.8F, 0.5F, 1.1F, 0.8F, 0.6F, 1F, 0F, -0.5F, 0.9F, 0F); // Box 127
		bodyModel[31].setRotationPoint(0F, 0F, 0F);

		bodyModel[32].addShapeBox(0.3F, 2.9F, -4.19F, 3, 1, 1, 0F,-0.4F, -2.2F, 0.5F, 0.3F, -2.1F, 0.5F, 0.3F, -0.7F, 0F, -0.1F, -0.9F, 0F, -0.1F, 1.9F, 0.5F, 0.7F, 1.9F, 0.5F, 0.7F, 0.7F, 0F, 0.1F, 0.7F, 0F); // Box 128
		bodyModel[32].setRotationPoint(0F, 0F, 0F);

		bodyModel[33].addShapeBox(0.3F, 3.4F, -5.7F, 3, 1, 1, 0F,-2.2F, -3.4F, 0F, -0.5F, -3.4F, 0F, 0.3F, -1.6F, 0F, -0.4F, -1.7F, 0F, -2F, 2.7F, 0F, -0.4F, 2.7F, 0F, 0.7F, 1.4F, 0F, -0.1F, 1.4F, 0F); // Box 129
		bodyModel[33].setRotationPoint(0F, 0F, 0F);

		bodyModel[34].addShapeBox(0.3F, 6.79F, -5.7F, 3, 2, 1, 0F,-2F, -0.3F, 0F, -0.4F, -0.3F, 0F, 0.7F, 1F, 0F, -0.1F, 1F, 0F, -2.2F, -1.4F, 0F, -0.5F, -1.4F, 0F, 0.5F, -0.8F, -0.3F, -0.6F, -0.9F, -0.3F); // Box 130
		bodyModel[34].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 99, 67, textureX, textureY); // Box 98
		leftArmModel[1] = new ModelRendererTurbo(this, 41, 89, textureX, textureY); // Box 99
		leftArmModel[2] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 100
		leftArmModel[3] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 101

		leftArmModel[0].addShapeBox(-1F, -1.99F, -1F, 3, 1, 3, 0F,0.5F, 0.2F, 0.5F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.8F, 0.2F, -0.2F, 0.99F, 0F, 1.01F, -1.5F, -0.8F, 0F, -1.5F, -0.8F, -0.7F, 0.2F, 0F, -0.7F); // Box 98
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1F, -2F, -1F, 3, 7, 3, 0F,1F, -1F, 1F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.8F, 0.2F, -0.2F, 0.1F, 0.2F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, 0.3F, 0.1F, 0.2F, 0.3F); // Box 99
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(-1F, -2F, -1F, 3, 7, 3, 0F,0.8F, 0F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, 0.8F, 0F, -0.2F, -0.2F, 0F, -0.6F, -0.2F, 0F, -0.6F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F); // Box 100
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);

		leftArmModel[3].addShapeBox(-1F, 4.7F, -0.7F, 3, 6, 3, 0F,-0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.6F, -0.5F, 0.8F, 0F, -0.5F, 0.8F, 0F, 0F, -1.8F, -0.6F, 0F, -1.8F); // Box 101
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 10
		rightArmModel[1] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 11
		rightArmModel[2] = new ModelRendererTurbo(this, 25, 89, textureX, textureY); // Box 8
		rightArmModel[3] = new ModelRendererTurbo(this, 99, 67, textureX, textureY); // Box 12

		rightArmModel[0].addShapeBox(-2F, -2F, -1F, 3, 7, 3, 0F,-1F, -0.2F, -0.2F, 0.8F, 0F, -0.2F, 0.8F, 0F, -0.2F, -1F, -0.2F, -0.2F, -0.2F, 0F, -0.6F, -0.2F, 0F, -0.6F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F); // Box 10
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-2F, 4.7F, -0.7F, 3, 6, 3, 0F,-0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, 0F, -0.5F, 0.8F, -0.6F, -0.5F, 0.8F, -0.6F, 0F, -1.8F, 0F, 0F, -1.8F); // Box 11
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-2F, -2F, -1F, 3, 7, 3, 0F,-1F, 0F, -0.2F, 1F, -1F, 1F, 0.8F, 0.2F, -0.2F, -1F, 0F, -0.2F, -0.1F, 0F, -0.3F, 0.1F, 0.2F, -0.3F, 0.1F, 0.2F, 0.3F, -0.1F, 0F, 0.3F); // Box 8
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);

		rightArmModel[3].addShapeBox(-2F, -1.99F, -1F, 3, 1, 3, 0F,-1F, 0F, -0.2F, 0.5F, 0.2F, 0.5F, 0.8F, 0.2F, -0.2F, -1F, 0F, -0.2F, -1.5F, -0.8F, 0F, 0.99F, 0F, 1.01F, 0.2F, 0F, -0.7F, -1.5F, -0.8F, -0.7F); // Box 12
		rightArmModel[3].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 14
		leftLegModel[1] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 15
		leftLegModel[2] = new ModelRendererTurbo(this, 41, 113, textureX, textureY); // Box 137
		leftLegModel[3] = new ModelRendererTurbo(this, 89, 113, textureX, textureY); // Box 138
		leftLegModel[4] = new ModelRendererTurbo(this, 81, 73, textureX, textureY); // Box 87

		leftLegModel[0].addShapeBox(-2F, 1.8F, -2F, 4, 3, 4, 0F,-0.3F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.2F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 14
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, 4.8F, -2F, 4, 7, 4, 0F,-0.2F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.5F, 0F, -1.5F, -1F, 0F, -1.5F, -1F, 0F, 0F, -0.5F, 0F, 0F); // Box 15
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-3F, -1F, -3F, 6, 6, 5, 0F,-0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, 0.4F, 0F, 1.5F, 0.3F, 0F, 2F, -0.4F, -0.5F, -0.8F, 0.6F, -0.5F, -0.8F, 0.6F, -0.5F, 1F, -0.4F, -0.5F, 1F); // Box 137
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(-3F, 4.5F, -3F, 6, 6, 5, 0F,-0.4F, 0F, -0.8F, 0.6F, 0F, -0.8F, 0.6F, 0F, 1F, -0.4F, 0F, 1F, -0.2F, 0F, -1.2F, 0.8F, 0F, -1.2F, 0.8F, 0F, 1.5F, -0.2F, 0F, 1.5F); // Box 138
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);

		leftLegModel[4].addShapeBox(-2F, 9.8F, -2F, 4, 2, 4, 0F,-0.3F, -0.9F, -0.2F, -0.7F, -0.9F, -0.2F, -0.7F, 0.1F, 0F, -0.3F, 0.1F, 0F, -0.2F, 0.1F, -0.3F, -0.6F, 0.1F, -0.3F, -0.6F, 0.1F, 0.1F, -0.2F, 0.1F, 0.1F); // Box 87
		leftLegModel[4].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 8
		rightLegModel[1] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 9
		rightLegModel[2] = new ModelRendererTurbo(this, 41, 113, textureX, textureY); // Box 80
		rightLegModel[3] = new ModelRendererTurbo(this, 17, 105, textureX, textureY); // Box 81
		rightLegModel[4] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Box 86

		rightLegModel[0].addShapeBox(-2F, 1.8F, -2F, 4, 3, 4, 0F,0F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.2F, -0.1F, 0F, -0.2F); // Box 8
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, 4.8F, -2F, 4, 7, 4, 0F,-0.1F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.2F, -0.1F, 0F, -0.2F, -1F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 0F, -1F, 0F, 0F); // Box 9
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-3F, -1F, -3F, 6, 6, 5, 0F,-0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, 0.3F, 0F, 2F, 0.4F, 0F, 1.5F, 0.6F, -0.5F, -0.8F, -0.4F, -0.5F, -0.8F, -0.4F, -0.5F, 1F, 0.6F, -0.5F, 1F); // Box 80
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(-3F, 4.5F, -3F, 6, 6, 5, 0F,0.6F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, 1F, 0.6F, 0F, 1F, 0.8F, 0F, -1.2F, -0.2F, 0F, -1.2F, -0.2F, 0F, 1.5F, 0.8F, 0F, 1.5F); // Box 81
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);

		rightLegModel[4].addShapeBox(-2F, 9.8F, -2F, 4, 2, 4, 0F,-0.7F, -0.9F, -0.2F, -0.3F, -0.9F, -0.2F, -0.3F, 0.1F, 0F, -0.7F, 0.1F, 0F, -0.6F, 0.1F, -0.3F, -0.2F, 0.1F, -0.3F, -0.2F, 0.1F, 0.1F, -0.6F, 0.1F, 0.1F); // Box 86
		rightLegModel[4].setRotationPoint(0F, 0F, 0F);
	}
}