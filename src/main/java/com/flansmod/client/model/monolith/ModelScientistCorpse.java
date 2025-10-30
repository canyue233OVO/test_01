//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: ScientistCorpse
// Model Creator: 
// Created on: 19.05.2020 - 08:09:04
// Last changed on: 19.05.2020 - 08:09:04

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelScientistCorpse extends ModelCustomArmour //Same as Filename
{
	int textureX = 512;
	int textureY = 32;

	public ModelScientistCorpse() //Same as Filename
	{
		headModel = new ModelRendererTurbo[15];
		bodyModel = new ModelRendererTurbo[51];
		leftArmModel = new ModelRendererTurbo[4];

		initheadModel_1();
		initbodyModel_1();
		initleftArmModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 36
		headModel[1] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 37
		headModel[2] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 38
		headModel[3] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 39
		headModel[4] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 43
		headModel[5] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 44
		headModel[6] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 45
		headModel[7] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 0
		headModel[8] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 36
		headModel[9] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 39
		headModel[10] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 55
		headModel[11] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 50
		headModel[12] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 58
		headModel[13] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 59
		headModel[14] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 60

		headModel[0].addShapeBox(-0.5F, -9F, -0.5F, 1, 1, 1, 0F,0.4F, 0F, 0.4F, 0.5F, 0F, 0.4F, 0.5F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-0.5F, -14F, -0.5F, 1, 3, 1, 0F,-0.2F, 0F, -0.4F, 0.3F, 0F, -0.4F, 0.3F, 0F, 0F, -0.2F, 0F, 0F, 0.6F, 0F, 0.4F, 0.3F, 0F, 0.4F, 0.3F, 0F, 0.4F, 0.6F, 0F, 0.4F); // Box 37
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-0.5F, -11F, -0.5F, 1, 2, 1, 0F,0.6F, 0F, 0.4F, 0.3F, 0F, 0.4F, 0.3F, 0F, 0.4F, 0.6F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.5F, 0F, 0.4F, 0.5F, 0F, 0.4F, 0.4F, 0F, 0.4F); // Box 38
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-0.5F, -16F, -0.3F, 1, 2, 1, 0F,0.1F, 0F, -0.8F, -1F, 0F, -0.8F, -1F, 0F, 0F, 0.1F, 0F, 0F, -0.2F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 39
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-2.5F, -5.5F, -4.3F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-3.5F, -5.5F, -4.3F, 1, 3, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 44
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-1.5F, -5.5F, -4.3F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 45
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-0.5F, -3.8F, -5F, 1, 2, 1, 0F,0F, 0.2F, -1F, 0F, 0.2F, -1F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.2F, -0.5F, 0.5F, 0.2F, -0.5F, 0.5F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F); // Box 0
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(-0.5F, -2.8F, -5F, 1, 1, 1, 0F,0.2F, -0.5F, 0.5F, 0.2F, -0.5F, 0.5F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 36
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-1.4F, -2.8F, -5F, 1, 1, 2, 0F,-0.4F, -0.2F, -0.3F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.2F, -0.2F, -0.3F, -0.2F, -0.3F, -0.2F, -0.2F, -0.2F, -0.2F, -0.1F, -0.1F, -0.2F); // Box 39
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(0.4F, -2.8F, -5F, 1, 1, 2, 0F,-0.2F, -0.2F, -0.2F, -0.4F, -0.2F, -0.3F, -0.3F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.2F, -0.3F, -0.1F, -0.1F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 55
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(-4F, -4.5F, -4.2F, 8, 1, 4, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 50
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(2.5F, -5.5F, -4.3F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 58
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(1.5F, -5.5F, -4.3F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(0.5F, -5.5F, -4.3F, 1, 3, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 60
		headModel[14].setRotationPoint(0F, 0F, 0F);
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 5
		bodyModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 6
		bodyModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 7
		bodyModel[3] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 12
		bodyModel[4] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 18
		bodyModel[5] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 25
		bodyModel[6] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 26
		bodyModel[7] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 27
		bodyModel[8] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 28
		bodyModel[9] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 29
		bodyModel[10] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 40
		bodyModel[11] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 41
		bodyModel[12] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 42
		bodyModel[13] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 45
		bodyModel[14] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 47
		bodyModel[15] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 48
		bodyModel[16] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 49
		bodyModel[17] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 50
		bodyModel[18] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 51
		bodyModel[19] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 52
		bodyModel[20] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 53
		bodyModel[21] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 54
		bodyModel[22] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 56
		bodyModel[23] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 57
		bodyModel[24] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 58
		bodyModel[25] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 59
		bodyModel[26] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 60
		bodyModel[27] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 61
		bodyModel[28] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 62
		bodyModel[29] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 64
		bodyModel[30] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 65
		bodyModel[31] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 67
		bodyModel[32] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 68
		bodyModel[33] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 70
		bodyModel[34] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 71
		bodyModel[35] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 72
		bodyModel[36] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 73
		bodyModel[37] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 75
		bodyModel[38] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 76
		bodyModel[39] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 77
		bodyModel[40] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 78
		bodyModel[41] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 79
		bodyModel[42] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 80
		bodyModel[43] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 81
		bodyModel[44] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 82
		bodyModel[45] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 83
		bodyModel[46] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 84
		bodyModel[47] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 85
		bodyModel[48] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 86
		bodyModel[49] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 87
		bodyModel[50] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 91

		bodyModel[0].addShapeBox(-2F, 0F, -2F, 2, 7, 3, 0F,0F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 5
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4F, 0F, -2F, 2, 7, 4, 0F,0.5F, 0F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0.5F, 0F, 0.5F, 0.4F, -1F, 0.7F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0.4F, -0.5F, 1F); // Box 6
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(0F, 0F, -2F, 2, 7, 3, 0F,-2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -2F, 0F, 0.5F, 1F, 1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 7
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-2F, 0F, -1F, 4, 5, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 2F, 0.5F, 0F, 2F, 0.5F, 0F, 2F, 0.5F, 0F, 1F, 0.5F); // Box 12
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(0.95F, 1F, -2F, 1, 6, 1, 0F,-0.35F, 0F, 0.6F, -0.2F, 0.1F, 0.6F, -0.2F, 0.1F, 0.6F, -0.35F, 0F, 0.6F, 1F, 0F, 0.6F, -0.5F, -0.5F, 0.6F, -0.5F, -0.5F, 0.6F, 1F, 0F, 0.6F); // Box 18
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(2F, 0F, -2F, 1, 1, 1, 0F,0.1F, 0F, 0.6F, -0.7F, -0.7F, 0.6F, -0.7F, -0.7F, 0.6F, 0.1F, 0F, 0.6F, 0.7F, 0F, 0.6F, -1.4F, 0F, 0.6F, -1.4F, 0F, 0.6F, 0.7F, 0F, 0.6F); // Box 25
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-3F, 0F, -2F, 1, 1, 1, 0F,-0.7F, -0.7F, 0.6F, 0.1F, 0F, 0.6F, 0.1F, 0F, 0.6F, -0.7F, -0.7F, 0.6F, -1.4F, 0F, 0.6F, 0.7F, 0F, 0.6F, 0.7F, 0F, 0.6F, -1.4F, 0F, 0.6F); // Box 26
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-1.95F, 1F, -2F, 1, 6, 1, 0F,-0.2F, 0.1F, 0.6F, -0.35F, 0F, 0.6F, -0.35F, 0F, 0.6F, -0.2F, 0.1F, 0.6F, -0.5F, -0.5F, 0.6F, 1F, 0F, 0.6F, 1F, 0F, 0.6F, -0.5F, -0.5F, 0.6F); // Box 27
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(0F, 0F, -2F, 2, 1, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.2F, 0F, 0.5F, 0F, -0.4F, 0.5F, 0F, -0.4F, 0.5F, -0.2F, 0F, 0.5F); // Box 28
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-2F, 0F, -2F, 2, 1, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.4F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, 0F, -0.4F, 0.5F); // Box 29
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-0.5F, 0.8F, -3F, 2, 1, 1, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 40
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(-2.5F, 0.8F, -3F, 2, 1, 1, 0F,0F, 0.3F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.5F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.9F, 0F); // Box 41
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(1.5F, 0.8F, -3F, 2, 1, 1, 0F,0F, 0F, -0.2F, 0.4F, 0.9F, 0F, 0.3F, 1F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, -0.2F); // Box 42
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(2F, 0F, -2F, 2, 7, 4, 0F,0F, 0.2F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0F, 0.5F, 0.5F, 1F, 1F, 0.1F, 0.5F, 0.5F, 0F, 0F, 0.5F); // Box 45
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(-0.5F, 7F, 0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 47
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(-0.5F, 8F, 0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 48
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(-0.5F, 9F, 0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 49
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(-0.5F, 10F, 0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 50
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(-0.5F, 11F, 0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 51
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(-0.5F, 12F, 0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 52
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(-0.5F, 7F, -2F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(-2.5F, 7F, -1.5F, 4, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 54
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(2.5F, 7F, -1F, 1, 4, 1, 0F,1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 1F, -1F, 0F, 0F, -1F); // Box 56
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(-2.5F, 9F, -1.5F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(-0.5F, 7F, -1F, 1, 4, 1, 0F,-1F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, -1F, 0F, 0F, 1F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 1F, -1F); // Box 58
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(-1.5F, 10F, -1.5F, 4, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 59
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addShapeBox(-1.5F, 8F, -1F, 4, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 60
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addShapeBox(-2F, 9.5F, -0.5F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[27].setRotationPoint(0F, 0F, 0F);

		bodyModel[28].addShapeBox(-2F, 7.5F, 0F, 1, 4, 1, 0F,-1F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, -1F, 0F, 0F, 1F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 1F, -1F); // Box 62
		bodyModel[28].setRotationPoint(0F, 0F, 0F);

		bodyModel[29].addShapeBox(0F, 7.5F, 0F, 1, 4, 1, 0F,-1F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, -1F, 0F, 0F, 1F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 1F, -1F); // Box 64
		bodyModel[29].setRotationPoint(0F, 0F, 0F);

		bodyModel[30].addShapeBox(0F, 7.5F, -1F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[30].setRotationPoint(0F, 0F, 0F);

		bodyModel[31].addShapeBox(-2F, 7.5F, -0.5F, 4, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 67
		bodyModel[31].setRotationPoint(0F, 0F, 0F);

		bodyModel[32].addShapeBox(-1F, 8.5F, 0F, 4, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 68
		bodyModel[32].setRotationPoint(0F, 0F, 0F);

		bodyModel[33].addShapeBox(-3F, 7.9F, 0.5F, 1, 4, 1, 0F,-1F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, -1F, 0F, 0F, 1F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 1F, -1F); // Box 70
		bodyModel[33].setRotationPoint(0F, 0F, 0F);

		bodyModel[34].addShapeBox(-2F, 10.9F, 0F, 4, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 71
		bodyModel[34].setRotationPoint(0F, 0F, 0F);

		bodyModel[35].addShapeBox(-1F, 7.9F, 0.5F, 1, 4, 1, 0F,-1F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, -1F, 0F, 0F, 1F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 1F, -1F); // Box 72
		bodyModel[35].setRotationPoint(0F, 0F, 0F);

		bodyModel[36].addShapeBox(-1F, 7.9F, -0.5F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[36].setRotationPoint(0F, 0F, 0F);

		bodyModel[37].addShapeBox(-3F, 7.9F, 0F, 4, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 75
		bodyModel[37].setRotationPoint(0F, 0F, 0F);

		bodyModel[38].addShapeBox(-2F, 8.9F, 0.5F, 4, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 76
		bodyModel[38].setRotationPoint(0F, 0F, 0F);

		bodyModel[39].addShapeBox(-2.5F, 4F, 0F, 1, 4, 1, 0F,-1F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, -1F, 0F, 0F, 1F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 1F, -1F); // Box 77
		bodyModel[39].setRotationPoint(0F, 0F, 0F);

		bodyModel[40].addShapeBox(-0.5F, 4F, 0F, 1, 4, 1, 0F,-1F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, -1F, 0F, 0F, 1F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 1F, -1F); // Box 78
		bodyModel[40].setRotationPoint(0F, 0F, 0F);

		bodyModel[41].addShapeBox(-0.5F, 9F, -1.5F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[41].setRotationPoint(0F, 0F, 0F);

		bodyModel[42].addShapeBox(-2.5F, 7F, 0F, 1, 8, 1, 0F,-1F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, -1F, 0F, 0F, 1F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 1F, -1F); // Box 80
		bodyModel[42].setRotationPoint(0F, 0F, 0F);

		bodyModel[43].addShapeBox(-6.5F, 8F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 81
		bodyModel[43].setRotationPoint(0F, 0F, 0F);

		bodyModel[44].addShapeBox(-4F, 6F, -2F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 82
		bodyModel[44].setRotationPoint(0F, 0F, 0F);

		bodyModel[45].addShapeBox(0F, 6F, -2F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 83
		bodyModel[45].setRotationPoint(0F, 0F, 0F);

		bodyModel[46].addShapeBox(-2F, 5F, -1.5F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 2F, 0.5F, 0.5F, 0.5F, 1.5F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 84
		bodyModel[46].setRotationPoint(0F, 0F, 0F);

		bodyModel[47].addShapeBox(-2F, 6F, 1F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F, 0.5F, 1.5F, 1F, 2F, 0.5F); // Box 85
		bodyModel[47].setRotationPoint(0F, 0F, 0F);

		bodyModel[48].addShapeBox(-4F, 6F, 1F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 1F); // Box 86
		bodyModel[48].setRotationPoint(0F, 0F, 0F);

		bodyModel[49].addShapeBox(0F, 6F, 1F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F, 0.5F, 1F, 0F, 0F, 0F); // Box 87
		bodyModel[49].setRotationPoint(0F, 0F, 0F);

		bodyModel[50].addShapeBox(-0.5F, 13F, 0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 91
		bodyModel[50].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 52
		leftArmModel[1] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 88
		leftArmModel[2] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 89
		leftArmModel[3] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 90

		leftArmModel[0].addShapeBox(-1F, -2F, -2F, 4, 5, 4, 0F,0F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0.4F, 1.2F, 0.3F, 0.2F, 0F, 0.2F, 0F, 0.7F, 0.2F); // Box 52
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1F, 2F, -2F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0.2F, 0F, 0F, -1F, 0F); // Box 88
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(-1F, 6F, -2F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);

		leftArmModel[3].addShapeBox(0.5F, 4F, -0.5F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);
	}
}