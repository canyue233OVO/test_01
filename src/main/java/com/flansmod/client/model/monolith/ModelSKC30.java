//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: SKC30
// Model Creator: 
// Created on: 14.05.2023 - 19:45:27
// Last changed on: 14.05.2023 - 19:45:27

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelSKC30 extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 128;

	public ModelSKC30() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[22];
		turretModel = new ModelRendererTurbo[73];
		barrelModel = new ModelRendererTurbo[54];

		initbodyModel_1();
		initturretModel_1();
		initbarrelModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 5
		bodyModel[4] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 6
		bodyModel[5] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 16
		bodyModel[6] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 17
		bodyModel[7] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 20
		bodyModel[8] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 21
		bodyModel[9] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 22
		bodyModel[10] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 23
		bodyModel[11] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 24
		bodyModel[12] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 25
		bodyModel[13] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 26
		bodyModel[14] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 27
		bodyModel[15] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 28
		bodyModel[16] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 29
		bodyModel[17] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 30
		bodyModel[18] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 31
		bodyModel[19] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 19
		bodyModel[20] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 20
		bodyModel[21] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 21

		bodyModel[0].addShapeBox(0F, 0F, 0F, 24, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-12F, 9F, -3F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 24, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 1
		bodyModel[1].setRotationPoint(-12F, 9F, 3F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 18, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Box 2
		bodyModel[2].setRotationPoint(-9F, 9F, 8F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 24, 5, 5, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[3].setRotationPoint(-12F, 9F, -8F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 18, 5, 4, 0F,-6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[4].setRotationPoint(-9F, 9F, -12F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 8, 22, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 16
		bodyModel[5].setRotationPoint(-4F, -12F, 8F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 4, 22, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1.5F); // Box 17
		bodyModel[6].setRotationPoint(-8F, -12F, 4F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 22, 8, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 20
		bodyModel[7].setRotationPoint(8F, -12F, -4F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 4, 22, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1.5F, 0F, 0F, 0F); // Box 21
		bodyModel[8].setRotationPoint(4F, -12F, 4F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 8, 22, 1, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[9].setRotationPoint(-4F, -12F, -9F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 4, 22, 4, 0F,0F, 0F, 0F, -1.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[10].setRotationPoint(4F, -12F, -8F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 22, 8, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 24
		bodyModel[11].setRotationPoint(-9F, -12F, -4F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 4, 22, 4, 0F,-1.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[12].setRotationPoint(-8F, -12F, -8F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 4, 14, 2, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[13].setRotationPoint(-12F, -5F, -1F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 4, 14, 2, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[14].setRotationPoint(-12F, -5F, -1F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 2, 14, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[15].setRotationPoint(-1F, -5F, 8F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 2, 14, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[16].setRotationPoint(-1F, -5F, 8F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 2, 14, 4, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[17].setRotationPoint(-1F, -5F, -12F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 4, 14, 2, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[18].setRotationPoint(8F, -5F, -1F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 6, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[19].setRotationPoint(-3F, -4F, -10F);

		bodyModel[20].addShapeBox(-10F, -4F, -10F, 7, 1, 20, 0F,0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F); // Box 20
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 7, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F); // Box 21
		bodyModel[21].setRotationPoint(3F, -4F, -10F);
	}

	private void initturretModel_1()
	{
		turretModel[0] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 22
		turretModel[1] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 23
		turretModel[2] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 24
		turretModel[3] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 25
		turretModel[4] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 26
		turretModel[5] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 27
		turretModel[6] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 28
		turretModel[7] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 29
		turretModel[8] = new ModelRendererTurbo(this, 281, 25, textureX, textureY); // Box 30
		turretModel[9] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // Box 31
		turretModel[10] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 32
		turretModel[11] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 33
		turretModel[12] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 34
		turretModel[13] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 35
		turretModel[14] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 37
		turretModel[15] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Box 38
		turretModel[16] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 39
		turretModel[17] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 40
		turretModel[18] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 41
		turretModel[19] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 43
		turretModel[20] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Box 105
		turretModel[21] = new ModelRendererTurbo(this, 449, 73, textureX, textureY); // Box 106
		turretModel[22] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 107
		turretModel[23] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 108
		turretModel[24] = new ModelRendererTurbo(this, 281, 25, textureX, textureY); // Box 109
		turretModel[25] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 110
		turretModel[26] = new ModelRendererTurbo(this, 481, 41, textureX, textureY); // Box 111
		turretModel[27] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 112
		turretModel[28] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Box 113
		turretModel[29] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 114
		turretModel[30] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 115
		turretModel[31] = new ModelRendererTurbo(this, 465, 57, textureX, textureY); // Box 116
		turretModel[32] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 117
		turretModel[33] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 118
		turretModel[34] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 119
		turretModel[35] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Box 120
		turretModel[36] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // Box 121
		turretModel[37] = new ModelRendererTurbo(this, 505, 65, textureX, textureY); // Box 122
		turretModel[38] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 123
		turretModel[39] = new ModelRendererTurbo(this, 425, 81, textureX, textureY); // Box 124
		turretModel[40] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // Box 125
		turretModel[41] = new ModelRendererTurbo(this, 129, 89, textureX, textureY); // Box 126
		turretModel[42] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 127
		turretModel[43] = new ModelRendererTurbo(this, 145, 89, textureX, textureY); // Box 128
		turretModel[44] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 129
		turretModel[45] = new ModelRendererTurbo(this, 169, 89, textureX, textureY); // Box 130
		turretModel[46] = new ModelRendererTurbo(this, 201, 89, textureX, textureY); // Box 131
		turretModel[47] = new ModelRendererTurbo(this, 225, 89, textureX, textureY); // Box 132
		turretModel[48] = new ModelRendererTurbo(this, 233, 89, textureX, textureY); // Box 133
		turretModel[49] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 134
		turretModel[50] = new ModelRendererTurbo(this, 257, 89, textureX, textureY); // Box 135
		turretModel[51] = new ModelRendererTurbo(this, 289, 89, textureX, textureY); // Box 136
		turretModel[52] = new ModelRendererTurbo(this, 313, 89, textureX, textureY); // Box 137
		turretModel[53] = new ModelRendererTurbo(this, 337, 89, textureX, textureY); // Box 138
		turretModel[54] = new ModelRendererTurbo(this, 361, 89, textureX, textureY); // Box 139
		turretModel[55] = new ModelRendererTurbo(this, 361, 89, textureX, textureY); // Box 142
		turretModel[56] = new ModelRendererTurbo(this, 393, 89, textureX, textureY); // Box 143
		turretModel[57] = new ModelRendererTurbo(this, 441, 89, textureX, textureY); // Box 144
		turretModel[58] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 145
		turretModel[59] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 146
		turretModel[60] = new ModelRendererTurbo(this, 473, 73, textureX, textureY); // Box 147
		turretModel[61] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 148
		turretModel[62] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 150
		turretModel[63] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 151
		turretModel[64] = new ModelRendererTurbo(this, 201, 81, textureX, textureY); // Box 152
		turretModel[65] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 153
		turretModel[66] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 154
		turretModel[67] = new ModelRendererTurbo(this, 305, 81, textureX, textureY); // Box 155
		turretModel[68] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 156
		turretModel[69] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 157
		turretModel[70] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 158
		turretModel[71] = new ModelRendererTurbo(this, 473, 81, textureX, textureY); // Box 159
		turretModel[72] = new ModelRendererTurbo(this, 361, 89, textureX, textureY); // Box 160

		turretModel[0].addShapeBox(-11F, -13F, -9F, 10, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		turretModel[0].setRotationPoint(0F, 0F, 0F);
		turretModel[0].rotateAngleZ = 0.01745329F;

		turretModel[1].addShapeBox(-4F, -13F, -9F, 8, 1, 1, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		turretModel[1].setRotationPoint(0F, 0F, 0F);
		turretModel[1].rotateAngleZ = 0.01745329F;

		turretModel[2].addShapeBox(4F, -13F, -8F, 4, 1, 4, 0F,0F, 0F, 0F, -1.5F, 0F, -1.5F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		turretModel[2].setRotationPoint(0F, 0F, 0F);
		turretModel[2].rotateAngleZ = 0.01745329F;

		turretModel[3].addShapeBox(8F, -16F, -4F, 1, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 25
		turretModel[3].setRotationPoint(0F, 0F, 0F);
		turretModel[3].rotateAngleZ = 0.01745329F;

		turretModel[4].addShapeBox(4F, -13F, 4F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 2F, 0F, -1.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1.5F, 0F, 0F, 0F); // Box 26
		turretModel[4].setRotationPoint(0F, 0F, 0F);
		turretModel[4].rotateAngleZ = 0.01745329F;

		turretModel[5].addShapeBox(-4F, -13F, 8F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 27
		turretModel[5].setRotationPoint(0F, 0F, 0F);
		turretModel[5].rotateAngleZ = 0.01745329F;

		turretModel[6].addShapeBox(-1F, -13F, -8F, 5, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		turretModel[6].setRotationPoint(0F, 0F, 0F);
		turretModel[6].rotateAngleZ = 0.01745329F;

		turretModel[7].addShapeBox(4F, -13F, -4F, 4, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		turretModel[7].setRotationPoint(0F, 0F, 0F);
		turretModel[7].rotateAngleZ = 0.01745329F;

		turretModel[8].addShapeBox(6F, -13F, -6F, 4, 1, 12, 0F,0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 30
		turretModel[8].setRotationPoint(0F, 0F, 0F);
		turretModel[8].rotateAngleZ = 0.01745329F;

		turretModel[9].addShapeBox(10F, -18F, -6F, 16, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		turretModel[9].setRotationPoint(0F, 0F, 0F);
		turretModel[9].rotateAngleZ = 0.01745329F;

		turretModel[10].addShapeBox(25F, -24F, -6F, 1, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		turretModel[10].setRotationPoint(0F, 0F, 0F);
		turretModel[10].rotateAngleZ = 0.01745329F;

		turretModel[11].addShapeBox(25F, -21F, -3F, 1, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		turretModel[11].setRotationPoint(0F, 0F, 0F);
		turretModel[11].rotateAngleZ = 0.01745329F;

		turretModel[12].addShapeBox(25F, -24F, 3F, 1, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		turretModel[12].setRotationPoint(0F, 0F, 0F);
		turretModel[12].rotateAngleZ = 0.01745329F;

		turretModel[13].addShapeBox(25F, -24F, -3F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		turretModel[13].setRotationPoint(0F, 0F, 0F);
		turretModel[13].rotateAngleZ = 0.01745329F;

		turretModel[14].addShapeBox(25F, -24F, 2F, 1, 3, 1, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		turretModel[14].setRotationPoint(0F, 0F, 0F);
		turretModel[14].rotateAngleZ = 0.01745329F;

		turretModel[15].addShapeBox(-12F, -24F, -6F, 37, 6, 1, 0F,3F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		turretModel[15].setRotationPoint(0F, 0F, 0F);
		turretModel[15].rotateAngleZ = 0.01745329F;

		turretModel[16].addShapeBox(-11F, -18F, -6F, 21, 5, 1, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 39
		turretModel[16].setRotationPoint(0F, 0F, 0F);
		turretModel[16].rotateAngleZ = 0.01745329F;

		turretModel[17].addShapeBox(-12F, -24F, 5F, 37, 6, 1, 0F,3F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		turretModel[17].setRotationPoint(0F, 0F, 0F);
		turretModel[17].rotateAngleZ = 0.01745329F;

		turretModel[18].addShapeBox(-11F, -18F, 5F, 21, 5, 1, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 41
		turretModel[18].setRotationPoint(0F, 0F, 0F);
		turretModel[18].rotateAngleZ = 0.01745329F;

		turretModel[19].addShapeBox(-11F, -18F, -5F, 1, 5, 10, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		turretModel[19].setRotationPoint(0F, 0F, 0F);
		turretModel[19].rotateAngleZ = 0.01745329F;

		turretModel[20].addShapeBox(-4F, -7F, -18F, 6, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		turretModel[20].setRotationPoint(0F, 0F, 0F);
		turretModel[20].rotateAngleZ = 0.01745329F;

		turretModel[21].addShapeBox(2F, -7F, -18F, 6, 1, 7, 0F,0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F); // Box 106
		turretModel[21].setRotationPoint(0F, 0F, 0F);
		turretModel[21].rotateAngleZ = 0.01745329F;

		turretModel[22].addShapeBox(-7F, -7F, -18F, 3, 1, 7, 0F,0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F); // Box 107
		turretModel[22].setRotationPoint(0F, 0F, 0F);
		turretModel[22].rotateAngleZ = 0.01745329F;

		turretModel[23].addShapeBox(8F, -22F, -10F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		turretModel[23].setRotationPoint(0F, 0F, 0F);
		turretModel[23].rotateAngleZ = 0.01745329F;

		turretModel[24].addShapeBox(8F, -27F, -10F, 3, 5, 1, 0F,-6F, 0F, 0F, 3F, -3F, 0F, 3F, -3F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		turretModel[24].setRotationPoint(0F, 0F, 0F);
		turretModel[24].rotateAngleZ = 0.01745329F;

		turretModel[25].addShapeBox(8F, -18F, -10F, 3, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 3F, -3F, 0F, 3F, -3F, 0F, -5F, 0F, 0F); // Box 110
		turretModel[25].setRotationPoint(0F, 0F, 0F);
		turretModel[25].rotateAngleZ = 0.01745329F;

		turretModel[26].addShapeBox(8F, -22F, 9F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		turretModel[26].setRotationPoint(0F, 0F, 0F);
		turretModel[26].rotateAngleZ = 0.01745329F;

		turretModel[27].addShapeBox(8F, -27F, 9F, 3, 5, 1, 0F,-6F, 0F, 0F, 3F, -3F, 0F, 3F, -3F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		turretModel[27].setRotationPoint(0F, 0F, 0F);
		turretModel[27].rotateAngleZ = 0.01745329F;

		turretModel[28].addShapeBox(8F, -18F, 9F, 3, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 3F, -3F, 0F, 3F, -3F, 0F, -5F, 0F, 0F); // Box 113
		turretModel[28].setRotationPoint(0F, 0F, 0F);
		turretModel[28].rotateAngleZ = 0.01745329F;

		turretModel[29].addShapeBox(8F, -22F, -9F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		turretModel[29].setRotationPoint(0F, 0F, 0F);
		turretModel[29].rotateAngleZ = 0.01745329F;

		turretModel[30].addShapeBox(13F, -25F, -9F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		turretModel[30].setRotationPoint(0F, 0F, 0F);
		turretModel[30].rotateAngleZ = 0.01745329F;

		turretModel[31].addShapeBox(9F, -22F, -9F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		turretModel[31].setRotationPoint(0F, 0F, 0F);
		turretModel[31].rotateAngleZ = 0.01745329F;

		turretModel[32].addShapeBox(13F, -20F, -9F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		turretModel[32].setRotationPoint(0F, 0F, 0F);
		turretModel[32].rotateAngleZ = 0.01745329F;

		turretModel[33].addShapeBox(8F, -22F, 6F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		turretModel[33].setRotationPoint(0F, 0F, 0F);
		turretModel[33].rotateAngleZ = 0.01745329F;

		turretModel[34].addShapeBox(13F, -25F, 6F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		turretModel[34].setRotationPoint(0F, 0F, 0F);
		turretModel[34].rotateAngleZ = 0.01745329F;

		turretModel[35].addShapeBox(9F, -22F, 8F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		turretModel[35].setRotationPoint(0F, 0F, 0F);
		turretModel[35].rotateAngleZ = 0.01745329F;

		turretModel[36].addShapeBox(13F, -20F, 6F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		turretModel[36].setRotationPoint(0F, 0F, 0F);
		turretModel[36].rotateAngleZ = 0.01745329F;

		turretModel[37].addShapeBox(13F, -19F, -7F, 1, 18, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 13F, 0F, 5F, -13F, 0F, 5F, -13F, 0F, -5F, 13F, 0F, -5F); // Box 122
		turretModel[37].setRotationPoint(0F, 0F, 0F);
		turretModel[37].rotateAngleZ = 0.01745329F;

		turretModel[38].addShapeBox(13F, -19F, 6F, 1, 18, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 13F, 0F, -5F, -13F, 0F, -5F, -13F, 0F, 5F, 13F, 0F, 5F); // Box 123
		turretModel[38].setRotationPoint(0F, 0F, 0F);
		turretModel[38].rotateAngleZ = 0.01745329F;

		turretModel[39].addShapeBox(-4F, -7F, 11F, 6, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		turretModel[39].setRotationPoint(0F, 0F, 0F);
		turretModel[39].rotateAngleZ = 0.01745329F;

		turretModel[40].addShapeBox(2F, -7F, 11F, 6, 1, 7, 0F,0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F); // Box 125
		turretModel[40].setRotationPoint(0F, 0F, 0F);
		turretModel[40].rotateAngleZ = 0.01745329F;

		turretModel[41].addShapeBox(-7F, -7F, 11F, 3, 1, 7, 0F,0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F); // Box 126
		turretModel[41].setRotationPoint(0F, 0F, 0F);
		turretModel[41].rotateAngleZ = 0.01745329F;

		turretModel[42].addShapeBox(-11F, -12F, -7F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 5F, 8F, 0F, 5F, 8F, 0F, -5F, -8F, 0F, -5F); // Box 127
		turretModel[42].setRotationPoint(0F, 0F, 0F);
		turretModel[42].rotateAngleZ = 0.01745329F;

		turretModel[43].addShapeBox(-3F, -1F, -13F, 8, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		turretModel[43].setRotationPoint(0F, 0F, 0F);
		turretModel[43].rotateAngleZ = 0.01745329F;

		turretModel[44].addShapeBox(0F, -6F, -13F, 1, 5, 1, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		turretModel[44].setRotationPoint(0F, 0F, 0F);
		turretModel[44].rotateAngleZ = 0.01745329F;

		turretModel[45].addShapeBox(5F, -1F, -13F, 17, 1, 2, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 130
		turretModel[45].setRotationPoint(0F, 0F, 0F);
		turretModel[45].rotateAngleZ = 0.01745329F;

		turretModel[46].addShapeBox(22F, 3F, -18F, 4, 1, 7, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 131
		turretModel[46].setRotationPoint(0F, 0F, 0F);
		turretModel[46].rotateAngleZ = 0.01745329F;

		turretModel[47].addShapeBox(-11F, -12F, 6F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -5F, 8F, 0F, -5F, 8F, 0F, 5F, -8F, 0F, 5F); // Box 132
		turretModel[47].setRotationPoint(0F, 0F, 0F);
		turretModel[47].rotateAngleZ = 0.01745329F;

		turretModel[48].addShapeBox(-3F, -1F, 11F, 8, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133
		turretModel[48].setRotationPoint(0F, 0F, 0F);
		turretModel[48].rotateAngleZ = 0.01745329F;

		turretModel[49].addShapeBox(0F, -6F, 12F, 1, 5, 1, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134
		turretModel[49].setRotationPoint(0F, 0F, 0F);
		turretModel[49].rotateAngleZ = 0.01745329F;

		turretModel[50].addShapeBox(5F, -1F, 11F, 17, 1, 2, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 135
		turretModel[50].setRotationPoint(0F, 0F, 0F);
		turretModel[50].rotateAngleZ = 0.01745329F;

		turretModel[51].addShapeBox(22F, 3F, 11F, 4, 1, 7, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 136
		turretModel[51].setRotationPoint(0F, 0F, 0F);
		turretModel[51].rotateAngleZ = 0.01745329F;

		turretModel[52].addShapeBox(24F, 2F, -18F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
		turretModel[52].setRotationPoint(0F, 0F, 0F);
		turretModel[52].rotateAngleZ = 0.01745329F;

		turretModel[53].addShapeBox(24F, 2F, 11F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		turretModel[53].setRotationPoint(0F, 0F, 0F);
		turretModel[53].rotateAngleZ = 0.01745329F;

		turretModel[54].addShapeBox(12F, -17F, -5F, 5, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F); // Box 139
		turretModel[54].setRotationPoint(0F, 0F, 0F);
		turretModel[54].rotateAngleZ = 0.01745329F;

		turretModel[55].addShapeBox(20F, -12F, -7F, 1, 4, 14, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 142
		turretModel[55].setRotationPoint(0F, 0F, 0F);
		turretModel[55].rotateAngleZ = 0.01745329F;

		turretModel[56].addShapeBox(18F, -12F, -7F, 2, 4, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		turretModel[56].setRotationPoint(0F, 0F, 0F);
		turretModel[56].rotateAngleZ = 0.01745329F;

		turretModel[57].addShapeBox(17F, -12F, -7F, 1, 4, 14, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 144
		turretModel[57].setRotationPoint(0F, 0F, 0F);
		turretModel[57].rotateAngleZ = 0.01745329F;

		turretModel[58].addShapeBox(18.5F, -10.5F, -11F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		turretModel[58].setRotationPoint(0F, 0F, 0F);
		turretModel[58].rotateAngleZ = 0.01745329F;

		turretModel[59].addShapeBox(18.5F, -12.5F, -11F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		turretModel[59].setRotationPoint(0F, 0F, 0F);
		turretModel[59].rotateAngleZ = 0.01745329F;

		turretModel[60].addShapeBox(18.5F, -12.5F, -14F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		turretModel[60].setRotationPoint(0F, 0F, 0F);
		turretModel[60].rotateAngleZ = 0.01745329F;

		turretModel[61].addShapeBox(20F, -13F, -15F, 2, 6, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 148
		turretModel[61].setRotationPoint(0F, 0F, 0F);
		turretModel[61].rotateAngleZ = 0.01745329F;

		turretModel[62].addShapeBox(18F, -13F, -15F, 2, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		turretModel[62].setRotationPoint(0F, 0F, 0F);
		turretModel[62].rotateAngleZ = 0.01745329F;

		turretModel[63].addShapeBox(16F, -13F, -15F, 2, 6, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 151
		turretModel[63].setRotationPoint(0F, 0F, 0F);
		turretModel[63].rotateAngleZ = 0.01745329F;

		turretModel[64].addShapeBox(18.5F, -8.5F, -18F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152
		turretModel[64].setRotationPoint(0F, 0F, 0F);
		turretModel[64].rotateAngleZ = 0.01745329F;

		turretModel[65].addShapeBox(18.5F, -10.5F, 7F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		turretModel[65].setRotationPoint(0F, 0F, 0F);
		turretModel[65].rotateAngleZ = 0.01745329F;

		turretModel[66].addShapeBox(18.5F, -9.5F, 10F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		turretModel[66].setRotationPoint(0F, 0F, 0F);
		turretModel[66].rotateAngleZ = 0.01745329F;

		turretModel[67].addShapeBox(18.5F, -8.5F, 11F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		turretModel[67].setRotationPoint(0F, 0F, 0F);
		turretModel[67].rotateAngleZ = 0.01745329F;

		turretModel[68].addShapeBox(20F, -13F, 14F, 2, 6, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 156
		turretModel[68].setRotationPoint(0F, 0F, 0F);
		turretModel[68].rotateAngleZ = 0.01745329F;

		turretModel[69].addShapeBox(18F, -13F, 14F, 2, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		turretModel[69].setRotationPoint(0F, 0F, 0F);
		turretModel[69].rotateAngleZ = 0.01745329F;

		turretModel[70].addShapeBox(16F, -13F, 14F, 2, 6, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 158
		turretModel[70].setRotationPoint(0F, 0F, 0F);
		turretModel[70].rotateAngleZ = 0.01745329F;

		turretModel[71].addShapeBox(18.5F, -12.5F, 15F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		turretModel[71].setRotationPoint(0F, 0F, 0F);
		turretModel[71].rotateAngleZ = 0.01745329F;

		turretModel[72].addShapeBox(12F, -17F, -5F, 5, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F); // Box 160
		turretModel[72].setRotationPoint(0F, 0F, 9F);
		turretModel[72].rotateAngleZ = 0.01745329F;
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 44
		barrelModel[1] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 45
		barrelModel[2] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 46
		barrelModel[3] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 47
		barrelModel[4] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 48
		barrelModel[5] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 49
		barrelModel[6] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 50
		barrelModel[7] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 51
		barrelModel[8] = new ModelRendererTurbo(this, 273, 41, textureX, textureY); // Box 52
		barrelModel[9] = new ModelRendererTurbo(this, 369, 41, textureX, textureY); // Box 53
		barrelModel[10] = new ModelRendererTurbo(this, 401, 41, textureX, textureY); // Box 54
		barrelModel[11] = new ModelRendererTurbo(this, 433, 41, textureX, textureY); // Box 55
		barrelModel[12] = new ModelRendererTurbo(this, 457, 41, textureX, textureY); // Box 56
		barrelModel[13] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 57
		barrelModel[14] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 58
		barrelModel[15] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 59
		barrelModel[16] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 60
		barrelModel[17] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 61
		barrelModel[18] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 62
		barrelModel[19] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 63
		barrelModel[20] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 64
		barrelModel[21] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 65
		barrelModel[22] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 73
		barrelModel[23] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 74
		barrelModel[24] = new ModelRendererTurbo(this, 289, 41, textureX, textureY); // Box 75
		barrelModel[25] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Box 76
		barrelModel[26] = new ModelRendererTurbo(this, 313, 49, textureX, textureY); // Box 77
		barrelModel[27] = new ModelRendererTurbo(this, 337, 49, textureX, textureY); // Box 78
		barrelModel[28] = new ModelRendererTurbo(this, 369, 49, textureX, textureY); // Box 79
		barrelModel[29] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Box 80
		barrelModel[30] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 81
		barrelModel[31] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 82
		barrelModel[32] = new ModelRendererTurbo(this, 425, 49, textureX, textureY); // Box 83
		barrelModel[33] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 84
		barrelModel[34] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 85
		barrelModel[35] = new ModelRendererTurbo(this, 337, 57, textureX, textureY); // Box 86
		barrelModel[36] = new ModelRendererTurbo(this, 401, 57, textureX, textureY); // Box 87
		barrelModel[37] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 88
		barrelModel[38] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 89
		barrelModel[39] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 90
		barrelModel[40] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 91
		barrelModel[41] = new ModelRendererTurbo(this, 265, 65, textureX, textureY); // Box 92
		barrelModel[42] = new ModelRendererTurbo(this, 337, 65, textureX, textureY); // Box 93
		barrelModel[43] = new ModelRendererTurbo(this, 409, 65, textureX, textureY); // Box 94
		barrelModel[44] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 95
		barrelModel[45] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Box 96
		barrelModel[46] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 97
		barrelModel[47] = new ModelRendererTurbo(this, 249, 73, textureX, textureY); // Box 98
		barrelModel[48] = new ModelRendererTurbo(this, 353, 73, textureX, textureY); // Box 99
		barrelModel[49] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 100
		barrelModel[50] = new ModelRendererTurbo(this, 105, 81, textureX, textureY); // Box 101
		barrelModel[51] = new ModelRendererTurbo(this, 209, 81, textureX, textureY); // Box 102
		barrelModel[52] = new ModelRendererTurbo(this, 313, 81, textureX, textureY); // Box 103
		barrelModel[53] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 104

		barrelModel[0].addShapeBox(0F, -3F, -7F, 2, 4, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		barrelModel[0].setRotationPoint(-14F, -28F, 0F);
		barrelModel[0].rotateAngleX = 0.01745329F;

		barrelModel[1].addShapeBox(2F, -3F, -7F, 1, 4, 14, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 45
		barrelModel[1].setRotationPoint(-14F, -28F, 0F);
		barrelModel[1].rotateAngleX = 0.01745329F;

		barrelModel[2].addShapeBox(-1F, -3F, -7F, 1, 4, 14, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 46
		barrelModel[2].setRotationPoint(-14F, -28F, 0F);
		barrelModel[2].rotateAngleX = 0.01745329F;

		barrelModel[3].addShapeBox(0F, -2F, -8F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		barrelModel[3].setRotationPoint(-14F, -28F, 0F);
		barrelModel[3].rotateAngleX = 0.01745329F;

		barrelModel[4].addShapeBox(0F, -2F, 7F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		barrelModel[4].setRotationPoint(-14F, -28F, 0F);
		barrelModel[4].rotateAngleX = 0.01745329F;

		barrelModel[5].addShapeBox(6F, -2F, -3F, 10, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		barrelModel[5].setRotationPoint(-14F, -28F, 0F);
		barrelModel[5].rotateAngleX = 0.01745329F;

		barrelModel[6].addShapeBox(6F, -4F, -1F, 10, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		barrelModel[6].setRotationPoint(-14F, -28F, 0F);
		barrelModel[6].rotateAngleX = 0.01745329F;

		barrelModel[7].addShapeBox(6F, -4F, 1F, 10, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		barrelModel[7].setRotationPoint(-14F, -28F, 0F);
		barrelModel[7].rotateAngleX = 0.01745329F;

		barrelModel[8].addShapeBox(6F, -4F, -3F, 10, 2, 2, 0F,0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		barrelModel[8].setRotationPoint(-14F, -28F, 0F);
		barrelModel[8].rotateAngleX = 0.01745329F;

		barrelModel[9].addShapeBox(6F, 0F, -3F, 10, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		barrelModel[9].setRotationPoint(-14F, -28F, 0F);
		barrelModel[9].rotateAngleX = 0.01745329F;

		barrelModel[10].addShapeBox(6F, 0F, -1F, 10, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		barrelModel[10].setRotationPoint(-14F, -28F, 0F);
		barrelModel[10].rotateAngleX = 0.01745329F;

		barrelModel[11].addShapeBox(6F, 0F, 1F, 10, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F); // Box 55
		barrelModel[11].setRotationPoint(-14F, -28F, 0F);
		barrelModel[11].rotateAngleX = 0.01745329F;

		barrelModel[12].addShapeBox(-1F, -4F, -3F, 7, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		barrelModel[12].setRotationPoint(-14F, -28F, 0F);
		barrelModel[12].rotateAngleX = 0.01745329F;

		barrelModel[13].addShapeBox(6F, -4F, -3F, 2, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 57
		barrelModel[13].setRotationPoint(-14F, -28F, 0F);
		barrelModel[13].rotateAngleX = 0.01745329F;

		barrelModel[14].addShapeBox(6F, -1F, -3F, 2, 3, 6, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		barrelModel[14].setRotationPoint(-14F, -28F, 0F);
		barrelModel[14].rotateAngleX = 0.01745329F;

		barrelModel[15].addShapeBox(-6F, -4F, -3F, 5, 2, 2, 0F,0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		barrelModel[15].setRotationPoint(-14F, -28F, 0F);
		barrelModel[15].rotateAngleX = 0.01745329F;

		barrelModel[16].addShapeBox(-6F, -4F, -1F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		barrelModel[16].setRotationPoint(-14F, -28F, 0F);
		barrelModel[16].rotateAngleX = 0.01745329F;

		barrelModel[17].addShapeBox(-6F, -4F, 1F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		barrelModel[17].setRotationPoint(-14F, -28F, 0F);
		barrelModel[17].rotateAngleX = 0.01745329F;

		barrelModel[18].addShapeBox(-6F, -2F, -3F, 5, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		barrelModel[18].setRotationPoint(-14F, -28F, 0F);
		barrelModel[18].rotateAngleX = 0.01745329F;

		barrelModel[19].addShapeBox(-6F, 0F, -1F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		barrelModel[19].setRotationPoint(-14F, -28F, 0F);
		barrelModel[19].rotateAngleX = 0.01745329F;

		barrelModel[20].addShapeBox(-6F, 0F, 1F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F); // Box 64
		barrelModel[20].setRotationPoint(-14F, -28F, 0F);
		barrelModel[20].rotateAngleX = 0.01745329F;

		barrelModel[21].addShapeBox(-6F, 0F, -3F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		barrelModel[21].setRotationPoint(-14F, -28F, 0F);
		barrelModel[21].rotateAngleX = 0.01745329F;

		barrelModel[22].addShapeBox(-14F, -2F, -5F, 8, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		barrelModel[22].setRotationPoint(-14F, -28F, 0F);
		barrelModel[22].rotateAngleX = 0.01745329F;

		barrelModel[23].addShapeBox(-14F, 1F, -5F, 8, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 74
		barrelModel[23].setRotationPoint(-14F, -28F, 0F);
		barrelModel[23].rotateAngleX = 0.01745329F;

		barrelModel[24].addShapeBox(-7F, -5F, -5F, 1, 3, 10, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		barrelModel[24].setRotationPoint(-14F, -28F, 0F);
		barrelModel[24].rotateAngleX = 0.01745329F;

		barrelModel[25].addShapeBox(-14F, -2F, 2F, 8, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		barrelModel[25].setRotationPoint(-14F, -28F, 0F);
		barrelModel[25].rotateAngleX = 0.01745329F;

		barrelModel[26].addShapeBox(-14F, -5F, -5F, 7, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		barrelModel[26].setRotationPoint(-14F, -28F, 0F);
		barrelModel[26].rotateAngleX = 0.01745329F;

		barrelModel[27].addShapeBox(-14F, -6F, -5F, 7, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		barrelModel[27].setRotationPoint(-14F, -28F, 0F);
		barrelModel[27].rotateAngleX = 0.01745329F;

		barrelModel[28].addShapeBox(-14F, -5F, 2F, 7, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		barrelModel[28].setRotationPoint(-14F, -28F, 0F);
		barrelModel[28].rotateAngleX = 0.01745329F;

		barrelModel[29].addShapeBox(-14F, -6F, 0F, 7, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		barrelModel[29].setRotationPoint(-14F, -28F, 0F);
		barrelModel[29].rotateAngleX = 0.01745329F;

		barrelModel[30].addShapeBox(-14F, -4F, -2F, 7, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 81
		barrelModel[30].setRotationPoint(-14F, -28F, 0F);
		barrelModel[30].rotateAngleX = 0.01745329F;

		barrelModel[31].addShapeBox(-14F, -4F, 1F, 7, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		barrelModel[31].setRotationPoint(-14F, -28F, 0F);
		barrelModel[31].rotateAngleX = 0.01745329F;

		barrelModel[32].addShapeBox(-14F, -5F, -2F, 7, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		barrelModel[32].setRotationPoint(-14F, -28F, 0F);
		barrelModel[32].rotateAngleX = 0.01745329F;

		barrelModel[33].addShapeBox(-7F, -6F, -3F, 29, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		barrelModel[33].setRotationPoint(-14F, -28F, 0F);
		barrelModel[33].rotateAngleX = 0.01745329F;

		barrelModel[34].addShapeBox(-7F, -6F, -4F, 29, 2, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		barrelModel[34].setRotationPoint(-14F, -28F, 0F);
		barrelModel[34].rotateAngleX = 0.01745329F;

		barrelModel[35].addShapeBox(-7F, -6F, -2F, 29, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 86
		barrelModel[35].setRotationPoint(-14F, -28F, 0F);
		barrelModel[35].rotateAngleX = 0.01745329F;

		barrelModel[36].addShapeBox(-7F, -6F, 2F, 29, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		barrelModel[36].setRotationPoint(-14F, -28F, 0F);
		barrelModel[36].rotateAngleX = 0.01745329F;

		barrelModel[37].addShapeBox(-7F, -6F, 3F, 29, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 88
		barrelModel[37].setRotationPoint(-14F, -28F, 0F);
		barrelModel[37].rotateAngleX = 0.01745329F;

		barrelModel[38].addShapeBox(-7F, -6F, 1F, 29, 2, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		barrelModel[38].setRotationPoint(-14F, -28F, 0F);
		barrelModel[38].rotateAngleX = 0.01745329F;

		barrelModel[39].addShapeBox(16F, -2F, -2.5F, 30, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		barrelModel[39].setRotationPoint(-14F, -28F, 0F);
		barrelModel[39].rotateAngleX = 0.01745329F;

		barrelModel[40].addShapeBox(16F, -4F, -1F, 30, 2, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		barrelModel[40].setRotationPoint(-14F, -28F, 0F);
		barrelModel[40].rotateAngleX = 0.01745329F;

		barrelModel[41].addShapeBox(16F, -4F, 1F, 30, 2, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 92
		barrelModel[41].setRotationPoint(-14F, -28F, 0F);
		barrelModel[41].rotateAngleX = 0.01745329F;

		barrelModel[42].addShapeBox(16F, -4F, -3F, 30, 2, 2, 0F,0F, -1F, -1F, 0F, -1F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		barrelModel[42].setRotationPoint(-14F, -28F, 0F);
		barrelModel[42].rotateAngleX = 0.01745329F;

		barrelModel[43].addShapeBox(16F, 0F, -3F, 30, 2, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 94
		barrelModel[43].setRotationPoint(-14F, -28F, 0F);
		barrelModel[43].rotateAngleX = 0.01745329F;

		barrelModel[44].addShapeBox(16F, 0F, -1F, 30, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 95
		barrelModel[44].setRotationPoint(-14F, -28F, 0F);
		barrelModel[44].rotateAngleX = 0.01745329F;

		barrelModel[45].addShapeBox(16F, 0F, 1F, 30, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 96
		barrelModel[45].setRotationPoint(-14F, -28F, 0F);
		barrelModel[45].rotateAngleX = 0.01745329F;

		barrelModel[46].addShapeBox(46F, -2F, -2F, 47, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		barrelModel[46].setRotationPoint(-14F, -28F, 0F);
		barrelModel[46].rotateAngleX = 0.01745329F;

		barrelModel[47].addShapeBox(46F, -3F, -1F, 47, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		barrelModel[47].setRotationPoint(-14F, -28F, 0F);
		barrelModel[47].rotateAngleX = 0.01745329F;

		barrelModel[48].addShapeBox(46F, -2F, 1F, 47, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		barrelModel[48].setRotationPoint(-14F, -28F, 0F);
		barrelModel[48].rotateAngleX = 0.01745329F;

		barrelModel[49].addShapeBox(46F, 0F, -1F, 47, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		barrelModel[49].setRotationPoint(-14F, -28F, 0F);
		barrelModel[49].rotateAngleX = 0.01745329F;

		barrelModel[50].addShapeBox(46F, -3F, 1F, 47, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		barrelModel[50].setRotationPoint(-14F, -28F, 0F);
		barrelModel[50].rotateAngleX = 0.01745329F;

		barrelModel[51].addShapeBox(46F, -3F, -2F, 47, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		barrelModel[51].setRotationPoint(-14F, -28F, 0F);
		barrelModel[51].rotateAngleX = 0.01745329F;

		barrelModel[52].addShapeBox(46F, 0F, -2F, 47, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		barrelModel[52].setRotationPoint(-14F, -28F, 0F);
		barrelModel[52].rotateAngleX = 0.01745329F;

		barrelModel[53].addShapeBox(46F, 0F, 1F, 47, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 104
		barrelModel[53].setRotationPoint(-14F, -28F, 0F);
		barrelModel[53].rotateAngleX = 0.01745329F;
	}
}