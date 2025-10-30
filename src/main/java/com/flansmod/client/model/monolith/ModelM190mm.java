//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: M190mm
// Model Creator: 
// Created on: 02.06.2023 - 19:07:35
// Last changed on: 02.06.2023 - 19:07:35

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelM190mm extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 128;

	public ModelM190mm() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[20];
		turretModel = new ModelRendererTurbo[51];
		barrelModel = new ModelRendererTurbo[43];

		initbodyModel_1();
		initturretModel_1();
		initbarrelModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 10
		bodyModel[6] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 11
		bodyModel[7] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 13
		bodyModel[8] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 14
		bodyModel[9] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 15
		bodyModel[10] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 18
		bodyModel[11] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 19
		bodyModel[12] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 20
		bodyModel[13] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 21
		bodyModel[14] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 22
		bodyModel[15] = new ModelRendererTurbo(this, 281, 41, textureX, textureY); // Box 23
		bodyModel[16] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 24
		bodyModel[17] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 25
		bodyModel[18] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Box 26
		bodyModel[19] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 27

		bodyModel[0].addShapeBox(0F, 0F, 0F, 4, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-2F, 5F, -2F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 74, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[1].setRotationPoint(2F, 5F, -2F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 4, 5, 74, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[2].setRotationPoint(-2F, 5F, 2F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 74, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[3].setRotationPoint(-76F, 5F, -2F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 4, 5, 74, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[4].setRotationPoint(-2F, 5F, -76F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 25, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[5].setRotationPoint(-35F, 1F, -10F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 25, 1, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, -10F); // Box 11
		bodyModel[6].setRotationPoint(-35F, 1F, 10F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 25, 1, 25, 0F,-10F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[7].setRotationPoint(-35F, 1F, -35F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 25, 1, 25, 0F,0F, 0F, 0F, -10F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[8].setRotationPoint(10F, 1F, -35F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 25, 1, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, -10F, 0F, 0F, 0F); // Box 15
		bodyModel[9].setRotationPoint(10F, 1F, 10F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 8, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F); // Box 18
		bodyModel[10].setRotationPoint(2F, 1F, -10F);

		bodyModel[11].addShapeBox(2F, 1F, 2F, 8, 1, 8, 0F,-8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-10F, 1F, 2F, 8, 1, 8, 0F,0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 8, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[13].setRotationPoint(-10F, 1F, -10F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 25, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[14].setRotationPoint(-13F, 2F, -2F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 4, 1, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[15].setRotationPoint(-2F, 2F, -12F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 25, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[16].setRotationPoint(-35F, 1F, -10F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 20, 1, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[17].setRotationPoint(-10F, 1F, -35F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 20, 1, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[18].setRotationPoint(-10F, 1F, 10F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 25, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[19].setRotationPoint(10F, 1F, -10F);
	}

	private void initturretModel_1()
	{
		turretModel[0] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 5
		turretModel[1] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 6
		turretModel[2] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 7
		turretModel[3] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 8
		turretModel[4] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 9
		turretModel[5] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 28
		turretModel[6] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Box 30
		turretModel[7] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 31
		turretModel[8] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 32
		turretModel[9] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 33
		turretModel[10] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 40
		turretModel[11] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Box 41
		turretModel[12] = new ModelRendererTurbo(this, 377, 49, textureX, textureY); // Box 42
		turretModel[13] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 49
		turretModel[14] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 52
		turretModel[15] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 53
		turretModel[16] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 55
		turretModel[17] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 66
		turretModel[18] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 67
		turretModel[19] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Box 68
		turretModel[20] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 69
		turretModel[21] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 70
		turretModel[22] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 71
		turretModel[23] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Box 72
		turretModel[24] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 73
		turretModel[25] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 74
		turretModel[26] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 75
		turretModel[27] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 76
		turretModel[28] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 77
		turretModel[29] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 78
		turretModel[30] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 79
		turretModel[31] = new ModelRendererTurbo(this, 321, 41, textureX, textureY); // Box 80
		turretModel[32] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Box 81
		turretModel[33] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // Box 82
		turretModel[34] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 83
		turretModel[35] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 84
		turretModel[36] = new ModelRendererTurbo(this, 449, 49, textureX, textureY); // Box 85
		turretModel[37] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 86
		turretModel[38] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 87
		turretModel[39] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 88
		turretModel[40] = new ModelRendererTurbo(this, 377, 57, textureX, textureY); // Box 89
		turretModel[41] = new ModelRendererTurbo(this, 401, 57, textureX, textureY); // Box 90
		turretModel[42] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 91
		turretModel[43] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Box 92
		turretModel[44] = new ModelRendererTurbo(this, 305, 105, textureX, textureY); // Box 134
		turretModel[45] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 135
		turretModel[46] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 136
		turretModel[47] = new ModelRendererTurbo(this, 425, 65, textureX, textureY); // Box 137
		turretModel[48] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Box 138
		turretModel[49] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 139
		turretModel[50] = new ModelRendererTurbo(this, 425, 65, textureX, textureY); // Box 140

		turretModel[0].addShapeBox(-2F, 0F, -2F, 4, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		turretModel[0].setRotationPoint(0F, 0F, 0F);

		turretModel[1].addShapeBox(-3F, 0F, -2F, 1, 5, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 6
		turretModel[1].setRotationPoint(0F, 0F, 0F);

		turretModel[2].addShapeBox(-2F, 0F, -3F, 4, 5, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		turretModel[2].setRotationPoint(0F, 0F, 0F);

		turretModel[3].addShapeBox(-2F, 0F, 2F, 4, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 8
		turretModel[3].setRotationPoint(0F, 0F, 0F);

		turretModel[4].addShapeBox(2F, 0F, -2F, 1, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 9
		turretModel[4].setRotationPoint(0F, 0F, 0F);

		turretModel[5].addShapeBox(-6.5F, -1F, -6.5F, 13, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		turretModel[5].setRotationPoint(0F, 0F, 0F);

		turretModel[6].addShapeBox(6.5F, -1F, -6.5F, 2, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 30
		turretModel[6].setRotationPoint(0F, 0F, 0F);

		turretModel[7].addShapeBox(-6.5F, -1F, 6.5F, 13, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 31
		turretModel[7].setRotationPoint(0F, 0F, 0F);

		turretModel[8].addShapeBox(-8.5F, -1F, -6.5F, 2, 2, 13, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 32
		turretModel[8].setRotationPoint(0F, 0F, 0F);

		turretModel[9].addShapeBox(-6.5F, -1F, -8.5F, 13, 2, 2, 0F,-4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		turretModel[9].setRotationPoint(0F, 0F, 0F);

		turretModel[10].addShapeBox(9.5F, -5F, -2F, 14, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		turretModel[10].setRotationPoint(0F, 0F, 0F);

		turretModel[11].addShapeBox(9.5F, -6F, -2F, 14, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		turretModel[11].setRotationPoint(0F, 0F, 0F);

		turretModel[12].addShapeBox(9.5F, -3F, -2F, 14, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 42
		turretModel[12].setRotationPoint(0F, 0F, 0F);

		turretModel[13].addShapeBox(-4.5F, -4F, -9F, 4, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		turretModel[13].setRotationPoint(0F, 0F, 0F);

		turretModel[14].addShapeBox(-5.5F, -8F, 6F, 11, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		turretModel[14].setRotationPoint(0F, 0F, 0F);

		turretModel[15].addShapeBox(-5.5F, -15F, 6F, 11, 7, 1, 0F,0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		turretModel[15].setRotationPoint(0F, 0F, 0F);

		turretModel[16].addShapeBox(-5.5F, -16F, 5F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		turretModel[16].setRotationPoint(0F, 0F, 0F);

		turretModel[17].addShapeBox(-5.5F, -17F, 5F, 3, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		turretModel[17].setRotationPoint(0F, 0F, 0F);

		turretModel[18].addShapeBox(-5.5F, -8F, -7F, 11, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		turretModel[18].setRotationPoint(0F, 0F, 0F);

		turretModel[19].addShapeBox(-5.5F, -15F, -7F, 11, 7, 1, 0F,0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		turretModel[19].setRotationPoint(0F, 0F, 0F);

		turretModel[20].addShapeBox(-5.5F, -16F, -7F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		turretModel[20].setRotationPoint(0F, 0F, 0F);

		turretModel[21].addShapeBox(-5.5F, -17F, -7F, 3, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		turretModel[21].setRotationPoint(0F, 0F, 0F);

		turretModel[22].addShapeBox(0.5F, -14F, -8F, 2, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		turretModel[22].setRotationPoint(0F, 0F, 0F);

		turretModel[23].addShapeBox(-0.5F, -16F, -9F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		turretModel[23].setRotationPoint(0F, 0F, 0F);

		turretModel[24].addShapeBox(-0.5F, -16F, -10F, 4, 3, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		turretModel[24].setRotationPoint(0F, 0F, 0F);

		turretModel[25].addShapeBox(-0.5F, -21F, -10F, 4, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		turretModel[25].setRotationPoint(0F, 0F, 0F);

		turretModel[26].addShapeBox(-0.5F, -22F, -10F, 4, 1, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		turretModel[26].setRotationPoint(0F, 0F, 0F);

		turretModel[27].addShapeBox(-0.5F, -16F, -8F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 76
		turretModel[27].setRotationPoint(0F, 0F, 0F);

		turretModel[28].addShapeBox(-5.5F, -15F, -7F, 9, 7, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -8F, 0F, -0.5F, -8F, 0F, 0F, 0F, 0F, 0F); // Box 77
		turretModel[28].setRotationPoint(0F, 0F, 0F);

		turretModel[29].addShapeBox(-0.5F, -19F, -7F, 4, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		turretModel[29].setRotationPoint(0F, 0F, 0F);

		turretModel[30].addShapeBox(-0.5F, -21F, 7F, 4, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		turretModel[30].setRotationPoint(0F, 0F, 0F);

		turretModel[31].addShapeBox(-0.5F, -22F, 7F, 4, 1, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		turretModel[31].setRotationPoint(0F, 0F, 0F);

		turretModel[32].addShapeBox(-5.5F, -15F, 6F, 9, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 81
		turretModel[32].setRotationPoint(0F, 0F, 0F);

		turretModel[33].addShapeBox(-0.5F, -19F, 6F, 4, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		turretModel[33].setRotationPoint(0F, 0F, 0F);

		turretModel[34].addShapeBox(0.5F, -14F, 7F, 2, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		turretModel[34].setRotationPoint(0F, 0F, 0F);

		turretModel[35].addShapeBox(-0.5F, -16F, 8F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		turretModel[35].setRotationPoint(0F, 0F, 0F);

		turretModel[36].addShapeBox(-0.5F, -16F, 9F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 85
		turretModel[36].setRotationPoint(0F, 0F, 0F);

		turretModel[37].addShapeBox(-0.5F, -16F, 7F, 4, 3, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		turretModel[37].setRotationPoint(0F, 0F, 0F);

		turretModel[38].addShapeBox(5.5F, -8F, -7F, 6, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		turretModel[38].setRotationPoint(0F, 0F, 0F);

		turretModel[39].addShapeBox(7.5F, -6F, -11F, 6, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		turretModel[39].setRotationPoint(0F, 0F, 0F);

		turretModel[40].addShapeBox(7.5F, -7F, -11F, 6, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		turretModel[40].setRotationPoint(0F, 0F, 0F);

		turretModel[41].addShapeBox(6.5F, -6F, 6F, 8, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		turretModel[41].setRotationPoint(0F, 0F, 0F);

		turretModel[42].addShapeBox(5.5F, -2F, 6F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		turretModel[42].setRotationPoint(0F, 0F, 0F);

		turretModel[43].addShapeBox(8.5F, -6.5F, 8F, 4, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		turretModel[43].setRotationPoint(0F, 0F, 0F);

		turretModel[44].addShapeBox(4.5F, -5F, -6F, 5, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134
		turretModel[44].setRotationPoint(0F, 0F, 0F);

		turretModel[45].addShapeBox(1F, -14F, -9F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		turretModel[45].setRotationPoint(0F, 0F, 0F);

		turretModel[46].addShapeBox(1F, -8F, -9F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 136
		turretModel[46].setRotationPoint(0F, 0F, 0F);

		turretModel[47].addShapeBox(-2F, -4F, -16F, 7, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
		turretModel[47].setRotationPoint(0F, 0F, 0F);

		turretModel[48].addShapeBox(1F, -14F, 8F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		turretModel[48].setRotationPoint(0F, 0F, 0F);

		turretModel[49].addShapeBox(1F, -8F, 8F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 139
		turretModel[49].setRotationPoint(0F, 0F, 0F);

		turretModel[50].addShapeBox(-2F, -4F, 11F, 7, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		turretModel[50].setRotationPoint(0F, 0F, 0F);
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 51
		barrelModel[1] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 57
		barrelModel[2] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 58
		barrelModel[3] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 59
		barrelModel[4] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 60
		barrelModel[5] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 93
		barrelModel[6] = new ModelRendererTurbo(this, 425, 57, textureX, textureY); // Box 94
		barrelModel[7] = new ModelRendererTurbo(this, 345, 57, textureX, textureY); // Box 95
		barrelModel[8] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 96
		barrelModel[9] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Box 97
		barrelModel[10] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 98
		barrelModel[11] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Box 99
		barrelModel[12] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 100
		barrelModel[13] = new ModelRendererTurbo(this, 377, 65, textureX, textureY); // Box 101
		barrelModel[14] = new ModelRendererTurbo(this, 449, 73, textureX, textureY); // Box 102
		barrelModel[15] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Box 103
		barrelModel[16] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 104
		barrelModel[17] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 105
		barrelModel[18] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 106
		barrelModel[19] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 107
		barrelModel[20] = new ModelRendererTurbo(this, 233, 81, textureX, textureY); // Box 108
		barrelModel[21] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 109
		barrelModel[22] = new ModelRendererTurbo(this, 297, 81, textureX, textureY); // Box 110
		barrelModel[23] = new ModelRendererTurbo(this, 361, 81, textureX, textureY); // Box 111
		barrelModel[24] = new ModelRendererTurbo(this, 169, 89, textureX, textureY); // Box 112
		barrelModel[25] = new ModelRendererTurbo(this, 233, 89, textureX, textureY); // Box 113
		barrelModel[26] = new ModelRendererTurbo(this, 297, 89, textureX, textureY); // Box 114
		barrelModel[27] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 115
		barrelModel[28] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 116
		barrelModel[29] = new ModelRendererTurbo(this, 361, 89, textureX, textureY); // Box 117
		barrelModel[30] = new ModelRendererTurbo(this, 425, 89, textureX, textureY); // Box 118
		barrelModel[31] = new ModelRendererTurbo(this, 169, 97, textureX, textureY); // Box 120
		barrelModel[32] = new ModelRendererTurbo(this, 273, 97, textureX, textureY); // Box 122
		barrelModel[33] = new ModelRendererTurbo(this, 377, 97, textureX, textureY); // Box 123
		barrelModel[34] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 124
		barrelModel[35] = new ModelRendererTurbo(this, 73, 81, textureX, textureY); // Box 125
		barrelModel[36] = new ModelRendererTurbo(this, 73, 97, textureX, textureY); // Box 127
		barrelModel[37] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 128
		barrelModel[38] = new ModelRendererTurbo(this, 193, 105, textureX, textureY); // Box 129
		barrelModel[39] = new ModelRendererTurbo(this, 233, 105, textureX, textureY); // Box 130
		barrelModel[40] = new ModelRendererTurbo(this, 425, 81, textureX, textureY); // Box 131
		barrelModel[41] = new ModelRendererTurbo(this, 481, 97, textureX, textureY); // Box 132
		barrelModel[42] = new ModelRendererTurbo(this, 281, 105, textureX, textureY); // Box 133

		barrelModel[0].addShapeBox(-1.5F, -1F, -5F, 7, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		barrelModel[0].setRotationPoint(-4F, -16F, 0F);

		barrelModel[1].addShapeBox(-1.5F, 8F, -4F, 7, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		barrelModel[1].setRotationPoint(-4F, -16F, 0F);

		barrelModel[2].addShapeBox(-0.5F, 6F, -4F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		barrelModel[2].setRotationPoint(-4F, -16F, 0F);

		barrelModel[3].addShapeBox(-6.5F, 11F, -1F, 12, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0.5F, 0F, -2.5F, 0.5F, 0F, -2.5F, 0.5F, 0F, -2.5F, 0.5F, 0F); // Box 59
		barrelModel[3].setRotationPoint(-4F, -16F, 0F);

		barrelModel[4].addShapeBox(-4F, 13.5F, -1F, 7, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F); // Box 60
		barrelModel[4].setRotationPoint(-4F, -16F, 0F);

		barrelModel[5].addShapeBox(-1.5F, -1F, 4F, 7, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		barrelModel[5].setRotationPoint(-4F, -16F, 0F);

		barrelModel[6].addShapeBox(-1.5F, 9F, -1F, 7, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		barrelModel[6].setRotationPoint(-4F, -16F, 0F);

		barrelModel[7].addShapeBox(-6.5F, 9F, -1F, 5, 2, 2, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		barrelModel[7].setRotationPoint(-4F, -16F, 0F);

		barrelModel[8].addShapeBox(-5.5F, -5F, -4F, 7, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		barrelModel[8].setRotationPoint(-4F, -16F, 0F);

		barrelModel[9].addShapeBox(-5.5F, -5F, 2F, 7, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		barrelModel[9].setRotationPoint(-4F, -16F, 0F);

		barrelModel[10].addShapeBox(-5.5F, -1F, -2F, 7, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		barrelModel[10].setRotationPoint(-4F, -16F, 0F);

		barrelModel[11].addShapeBox(-5.5F, -2F, -2F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		barrelModel[11].setRotationPoint(-4F, -16F, 0F);

		barrelModel[12].addShapeBox(-5.5F, -2F, 1F, 7, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		barrelModel[12].setRotationPoint(-4F, -16F, 0F);

		barrelModel[13].addShapeBox(-5.5F, -7F, -4F, 7, 2, 2, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		barrelModel[13].setRotationPoint(-4F, -16F, 0F);

		barrelModel[14].addShapeBox(-5.5F, -7F, 2F, 7, 2, 2, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		barrelModel[14].setRotationPoint(-4F, -16F, 0F);

		barrelModel[15].addShapeBox(-1.5F, -7F, -2F, 3, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		barrelModel[15].setRotationPoint(-4F, -16F, 0F);

		barrelModel[16].addShapeBox(-3.5F, -5F, 1F, 2, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		barrelModel[16].setRotationPoint(-4F, -16F, 0F);

		barrelModel[17].addShapeBox(-3.5F, -4F, -2F, 2, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		barrelModel[17].setRotationPoint(-4F, -16F, 0F);

		barrelModel[18].addShapeBox(-3.5F, -5F, -2F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		barrelModel[18].setRotationPoint(-4F, -16F, 0F);

		barrelModel[19].addShapeBox(1.5F, 0F, -2.5F, 30, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		barrelModel[19].setRotationPoint(-4F, -16F, 0F);

		barrelModel[20].addShapeBox(1.5F, -5F, -1F, 27, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		barrelModel[20].setRotationPoint(-4F, -16F, 0F);

		barrelModel[21].addShapeBox(-3.5F, 1F, -4F, 5, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 109
		barrelModel[21].setRotationPoint(-4F, -16F, 0F);

		barrelModel[22].addShapeBox(1.5F, 0F, -1.5F, 30, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 110
		barrelModel[22].setRotationPoint(-4F, -16F, 0F);

		barrelModel[23].addShapeBox(1.5F, 0F, -3.5F, 30, 3, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		barrelModel[23].setRotationPoint(-4F, -16F, 0F);

		barrelModel[24].addShapeBox(1.5F, 0F, 1.5F, 30, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		barrelModel[24].setRotationPoint(-4F, -16F, 0F);

		barrelModel[25].addShapeBox(1.5F, 0F, 0.5F, 30, 3, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		barrelModel[25].setRotationPoint(-4F, -16F, 0F);

		barrelModel[26].addShapeBox(1.5F, 0F, 2.5F, 30, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 114
		barrelModel[26].setRotationPoint(-4F, -16F, 0F);

		barrelModel[27].addShapeBox(31.5F, 1F, -2.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		barrelModel[27].setRotationPoint(-4F, -16F, 0F);

		barrelModel[28].addShapeBox(31.5F, 1F, 1.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		barrelModel[28].setRotationPoint(-4F, -16F, 0F);

		barrelModel[29].addShapeBox(1.5F, -5F, 1F, 27, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 117
		barrelModel[29].setRotationPoint(-4F, -16F, 0F);

		barrelModel[30].addShapeBox(1.5F, -5F, -2F, 27, 4, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		barrelModel[30].setRotationPoint(-4F, -16F, 0F);

		barrelModel[31].addShapeBox(28.5F, -4.5F, -0.5F, 50, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		barrelModel[31].setRotationPoint(-4F, -16F, 0F);

		barrelModel[32].addShapeBox(28.5F, -4.5F, -1.5F, 50, 3, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		barrelModel[32].setRotationPoint(-4F, -16F, 0F);

		barrelModel[33].addShapeBox(28.5F, -4.5F, 0.5F, 50, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 123
		barrelModel[33].setRotationPoint(-4F, -16F, 0F);

		barrelModel[34].addShapeBox(1.5F, -6F, -4F, 11, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 124
		barrelModel[34].setRotationPoint(-4F, -16F, 0F);

		barrelModel[35].addShapeBox(12.5F, -6F, -4F, 16, 7, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -0.5F, 0F, 0F, -0.5F); // Box 125
		barrelModel[35].setRotationPoint(-4F, -16F, 0F);

		barrelModel[36].addShapeBox(27.5F, -5F, -4F, 21, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		barrelModel[36].setRotationPoint(-4F, -16F, 0F);

		barrelModel[37].addShapeBox(1.5F, -6F, 3F, 11, 7, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		barrelModel[37].setRotationPoint(-4F, -16F, 0F);

		barrelModel[38].addShapeBox(12.5F, -6F, 3F, 16, 7, 1, 0F,0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -3F, -0.5F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 129
		barrelModel[38].setRotationPoint(-4F, -16F, 0F);

		barrelModel[39].addShapeBox(27.5F, -5F, 3F, 21, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 130
		barrelModel[39].setRotationPoint(-4F, -16F, 0F);

		barrelModel[40].addShapeBox(1.5F, -9F, -1F, 11, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 131
		barrelModel[40].setRotationPoint(-4F, -16F, 0F);

		barrelModel[41].addShapeBox(1.5F, -9F, 1F, 11, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 2F, -0.5F, 0F, 2F, -0.5F); // Box 132
		barrelModel[41].setRotationPoint(-4F, -16F, 0F);

		barrelModel[42].addShapeBox(1.5F, -9F, -4F, 11, 1, 3, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -0.5F, 0F, 2F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 133
		barrelModel[42].setRotationPoint(-4F, -16F, 0F);
	}
}