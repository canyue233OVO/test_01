//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: ki10
// Model Creator: 
// Created on: 02.06.2023 - 02:53:10
// Last changed on: 02.06.2023 - 02:53:10

package com.flansmod.client.model.Taskball; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class Modelki10 extends ModelPlane //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public Modelki10() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[136];
		tailModel = new ModelRendererTurbo[30];
		leftWingModel = new ModelRendererTurbo[14];
		rightWingModel = new ModelRendererTurbo[14];

		initbodyModel_1();
		inittailModel_1();
		initleftWingModel_1();
		initrightWingModel_1();

		initPropeller();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 4
		bodyModel[4] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 5
		bodyModel[5] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 6
		bodyModel[6] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 7
		bodyModel[7] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 8
		bodyModel[8] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 9
		bodyModel[9] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 10
		bodyModel[10] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 11
		bodyModel[11] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 34
		bodyModel[12] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 35
		bodyModel[13] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 36
		bodyModel[14] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Box 39
		bodyModel[15] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 40
		bodyModel[16] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 41
		bodyModel[17] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 54
		bodyModel[18] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 55
		bodyModel[19] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 56
		bodyModel[20] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 57
		bodyModel[21] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 59
		bodyModel[22] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 60
		bodyModel[23] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 61
		bodyModel[24] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 62
		bodyModel[25] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 63
		bodyModel[26] = new ModelRendererTurbo(this, 417, 73, textureX, textureY); // Box 41
		bodyModel[27] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 44
		bodyModel[28] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 45
		bodyModel[29] = new ModelRendererTurbo(this, 305, 57, textureX, textureY); // Box 47
		bodyModel[30] = new ModelRendererTurbo(this, 377, 65, textureX, textureY); // Box 48
		bodyModel[31] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Box 49
		bodyModel[32] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 50
		bodyModel[33] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Box 51
		bodyModel[34] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // Box 52
		bodyModel[35] = new ModelRendererTurbo(this, 217, 81, textureX, textureY); // Box 53
		bodyModel[36] = new ModelRendererTurbo(this, 217, 97, textureX, textureY); // Box 54
		bodyModel[37] = new ModelRendererTurbo(this, 489, 73, textureX, textureY); // Import Box260
		bodyModel[38] = new ModelRendererTurbo(this, 265, 97, textureX, textureY); // Import Box261
		bodyModel[39] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Import Box262
		bodyModel[40] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Import Box264
		bodyModel[41] = new ModelRendererTurbo(this, 337, 57, textureX, textureY); // Import Box265
		bodyModel[42] = new ModelRendererTurbo(this, 409, 57, textureX, textureY); // Import Box266
		bodyModel[43] = new ModelRendererTurbo(this, 305, 89, textureX, textureY); // Import Box267
		bodyModel[44] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Import Box268
		bodyModel[45] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Import Box269
		bodyModel[46] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Import Box270
		bodyModel[47] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Import Box271
		bodyModel[48] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Import Box272
		bodyModel[49] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Import Box273
		bodyModel[50] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Import Box274
		bodyModel[51] = new ModelRendererTurbo(this, 257, 57, textureX, textureY); // Import Box275
		bodyModel[52] = new ModelRendererTurbo(this, 369, 105, textureX, textureY); // Import Box276
		bodyModel[53] = new ModelRendererTurbo(this, 305, 105, textureX, textureY); // Box 78
		bodyModel[54] = new ModelRendererTurbo(this, 89, 129, textureX, textureY); // Box 87
		bodyModel[55] = new ModelRendererTurbo(this, 257, 129, textureX, textureY); // Box 88
		bodyModel[56] = new ModelRendererTurbo(this, 457, 121, textureX, textureY); // Box 89
		bodyModel[57] = new ModelRendererTurbo(this, 321, 129, textureX, textureY); // Box 90
		bodyModel[58] = new ModelRendererTurbo(this, 137, 137, textureX, textureY); // Box 91
		bodyModel[59] = new ModelRendererTurbo(this, 369, 145, textureX, textureY); // Box 92
		bodyModel[60] = new ModelRendererTurbo(this, 225, 153, textureX, textureY); // Box 93
		bodyModel[61] = new ModelRendererTurbo(this, 377, 129, textureX, textureY); // Box 94
		bodyModel[62] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 95
		bodyModel[63] = new ModelRendererTurbo(this, 305, 161, textureX, textureY); // Box 96
		bodyModel[64] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 97
		bodyModel[65] = new ModelRendererTurbo(this, 49, 169, textureX, textureY); // Box 98
		bodyModel[66] = new ModelRendererTurbo(this, 441, 153, textureX, textureY); // Box 99
		bodyModel[67] = new ModelRendererTurbo(this, 113, 169, textureX, textureY); // Box 100
		bodyModel[68] = new ModelRendererTurbo(this, 377, 169, textureX, textureY); // Box 103
		bodyModel[69] = new ModelRendererTurbo(this, 201, 169, textureX, textureY); // Box 104
		bodyModel[70] = new ModelRendererTurbo(this, 177, 97, textureX, textureY); // Box 105
		bodyModel[71] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 118
		bodyModel[72] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 119
		bodyModel[73] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 120
		bodyModel[74] = new ModelRendererTurbo(this, 273, 73, textureX, textureY); // Box 121
		bodyModel[75] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 122
		bodyModel[76] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 123
		bodyModel[77] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 124
		bodyModel[78] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 125
		bodyModel[79] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 126
		bodyModel[80] = new ModelRendererTurbo(this, 161, 201, textureX, textureY); // Box 127
		bodyModel[81] = new ModelRendererTurbo(this, 337, 105, textureX, textureY); // Box 130
		bodyModel[82] = new ModelRendererTurbo(this, 185, 65, textureX, textureY); // Box 131
		bodyModel[83] = new ModelRendererTurbo(this, 25, 201, textureX, textureY); // Box 133
		bodyModel[84] = new ModelRendererTurbo(this, 89, 201, textureX, textureY); // Box 134
		bodyModel[85] = new ModelRendererTurbo(this, 265, 201, textureX, textureY); // Box 135
		bodyModel[86] = new ModelRendererTurbo(this, 489, 97, textureX, textureY); // Box 136
		bodyModel[87] = new ModelRendererTurbo(this, 433, 129, textureX, textureY); // Box 137
		bodyModel[88] = new ModelRendererTurbo(this, 225, 137, textureX, textureY); // Box 138
		bodyModel[89] = new ModelRendererTurbo(this, 161, 217, textureX, textureY); // Box 139
		bodyModel[90] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Box 140
		bodyModel[91] = new ModelRendererTurbo(this, 489, 201, textureX, textureY); // Box 148
		bodyModel[92] = new ModelRendererTurbo(this, 489, 225, textureX, textureY); // Box 149
		bodyModel[93] = new ModelRendererTurbo(this, 497, 113, textureX, textureY); // Box 150
		bodyModel[94] = new ModelRendererTurbo(this, 113, 185, textureX, textureY); // Box 151
		bodyModel[95] = new ModelRendererTurbo(this, 409, 65, textureX, textureY); // Box 152
		bodyModel[96] = new ModelRendererTurbo(this, 105, 113, textureX, textureY); // Box 153
		bodyModel[97] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Box 154
		bodyModel[98] = new ModelRendererTurbo(this, 401, 105, textureX, textureY); // Box 155
		bodyModel[99] = new ModelRendererTurbo(this, 121, 153, textureX, textureY); // Box 156
		bodyModel[100] = new ModelRendererTurbo(this, 505, 73, textureX, textureY); // Box 157
		bodyModel[101] = new ModelRendererTurbo(this, 249, 137, textureX, textureY); // Box 158
		bodyModel[102] = new ModelRendererTurbo(this, 129, 73, textureX, textureY); // Box 159
		bodyModel[103] = new ModelRendererTurbo(this, 417, 105, textureX, textureY); // Box 160
		bodyModel[104] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 161
		bodyModel[105] = new ModelRendererTurbo(this, 313, 129, textureX, textureY); // Box 162
		bodyModel[106] = new ModelRendererTurbo(this, 345, 233, textureX, textureY); // Box 163
		bodyModel[107] = new ModelRendererTurbo(this, 89, 241, textureX, textureY); // Box 164
		bodyModel[108] = new ModelRendererTurbo(this, 1, 249, textureX, textureY); // Box 239
		bodyModel[109] = new ModelRendererTurbo(this, 137, 185, textureX, textureY); // Box 240
		bodyModel[110] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 241
		bodyModel[111] = new ModelRendererTurbo(this, 257, 65, textureX, textureY); // Box 242
		bodyModel[112] = new ModelRendererTurbo(this, 121, 241, textureX, textureY); // Box 243
		bodyModel[113] = new ModelRendererTurbo(this, 289, 257, textureX, textureY); // Box 244
		bodyModel[114] = new ModelRendererTurbo(this, 497, 153, textureX, textureY); // Box 245
		bodyModel[115] = new ModelRendererTurbo(this, 153, 265, textureX, textureY); // Box 246
		bodyModel[116] = new ModelRendererTurbo(this, 297, 169, textureX, textureY); // Box 247
		bodyModel[117] = new ModelRendererTurbo(this, 505, 177, textureX, textureY); // Box 248
		bodyModel[118] = new ModelRendererTurbo(this, 505, 201, textureX, textureY); // Box 250
		bodyModel[119] = new ModelRendererTurbo(this, 505, 225, textureX, textureY); // Box 251
		bodyModel[120] = new ModelRendererTurbo(this, 305, 97, textureX, textureY); // Box 252
		bodyModel[121] = new ModelRendererTurbo(this, 377, 97, textureX, textureY); // Box 253
		bodyModel[122] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 962
		bodyModel[123] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 964
		bodyModel[124] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 966
		bodyModel[125] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 259
		bodyModel[126] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 260
		bodyModel[127] = new ModelRendererTurbo(this, 177, 265, textureX, textureY); // Box 256
		bodyModel[128] = new ModelRendererTurbo(this, 25, 193, textureX, textureY); // Box 249
		bodyModel[129] = new ModelRendererTurbo(this, 233, 241, textureX, textureY); // Box 254
		bodyModel[130] = new ModelRendererTurbo(this, 305, 57, textureX, textureY); // Box 263
		bodyModel[131] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 264
		bodyModel[132] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 265
		bodyModel[133] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 266
		bodyModel[134] = new ModelRendererTurbo(this, 185, 265, textureX, textureY); // Box 201
		bodyModel[135] = new ModelRendererTurbo(this, 313, 265, textureX, textureY); // Box 202

		bodyModel[0].addShapeBox(0F, 0F, 0F, 21, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-13F, -39F, -9F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 21, 10, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, -1F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[1].setRotationPoint(-13F, -23F, -9F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 18, 16, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[2].setRotationPoint(-31F, -39F, -9F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 18, 10, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[3].setRotationPoint(-31F, -23F, -9F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 32, 16, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[4].setRotationPoint(-63F, -39F, -9F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 32, 10, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, -4F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -8F, 0F); // Box 6
		bodyModel[5].setRotationPoint(-63F, -23F, -9F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 32, 5, 9, 0F,0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[6].setRotationPoint(-63F, -44F, -9F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 18, 5, 9, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[7].setRotationPoint(-31F, -44F, -9F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 21, 5, 3, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 9
		bodyModel[8].setRotationPoint(-13F, -44F, -9F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 24, 16, 9, 0F,0F, 0F, 0F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[9].setRotationPoint(8F, -39F, -9F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 24, 8, 9, 0F,0F, 0F, 0F, 0F, 2F, -3F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -4F, -3F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[10].setRotationPoint(8F, -23F, -9F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 16, 3, 24, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 34
		bodyModel[11].setRotationPoint(-30F, -19F, -31F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 16, 3, 17, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[12].setRotationPoint(-14F, -19F, -31F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 16, 3, 9, 0F,0F, 0F, 0F, 0F, -1F, 0F, 10F, -1F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 10F, -1F, 5F, 0F, 0F, 0F); // Box 36
		bodyModel[13].setRotationPoint(-14F, -19F, -14F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 16, 3, 14, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 39
		bodyModel[14].setRotationPoint(-43F, -55F, -14F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 14, 3, 10, 0F,0F, 0F, 0F, 0F, -1F, 0F, -4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -4F, -1F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[15].setRotationPoint(-27F, -55F, -14F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 10, 3, 4, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[16].setRotationPoint(-27F, -55F, -4F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[17].setRotationPoint(-27F, -28F, -19F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, -5F, -5F, 0F, -5F, -5F, 0F, 5F, 5F, 0F, 5F); // Box 55
		bodyModel[18].setRotationPoint(-38F, -53F, -14F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 5F); // Box 56
		bodyModel[19].setRotationPoint(-28F, -53F, -14F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 15F, 0F, -5F, -15F, 0F, -5F, -15F, 0F, 5F, 15F, 0F, 5F); // Box 57
		bodyModel[20].setRotationPoint(-28F, -53F, -14F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 59
		bodyModel[21].setRotationPoint(-5F, -51F, -8F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 60
		bodyModel[22].setRotationPoint(-5F, -51F, -5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F); // Box 61
		bodyModel[23].setRotationPoint(-5F, -51F, -5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 62
		bodyModel[24].setRotationPoint(-9F, -51F, -3F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F); // Box 63
		bodyModel[25].setRotationPoint(-13F, -51F, -3F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 24, 5, 9, 0F,0F, 0F, -2F, 0F, -4F, -5F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -3F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[26].setRotationPoint(8F, -44F, -9F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 9, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[27].setRotationPoint(-13F, -44F, -7F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 45
		bodyModel[28].setRotationPoint(6F, -44F, -7F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 8, 16, 9, 0F,0F, -10F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -3F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 47
		bodyModel[29].setRotationPoint(-71F, -39F, -9F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 8, 3, 9, 0F,0F, -9F, -6F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 10F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F); // Box 48
		bodyModel[30].setRotationPoint(-71F, -42F, -9F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 8, 2, 9, 0F,0F, 3F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -2F, -6F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 49
		bodyModel[31].setRotationPoint(-71F, -23F, -9F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 6, 3, 5, 0F,0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 50
		bodyModel[32].setRotationPoint(-77F, -29F, -5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 6, 4, 5, 0F,0F, -4F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 51
		bodyModel[33].setRotationPoint(-77F, -33F, -5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 6, 4, 5, 0F,0F, 1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -4F, -4F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, -4F, 0F); // Box 52
		bodyModel[34].setRotationPoint(-77F, -26F, -5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 26, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -8F, 0F, 0F); // Box 53
		bodyModel[35].setRotationPoint(-63F, -23F, -8F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 15, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[36].setRotationPoint(-55F, -13F, -8F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 4, 19, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 6F, 8F, 0F, 6F, 8F, 0F, -6F, -8F, 0F, -6F); // Import Box260
		bodyModel[37].setRotationPoint(-41F, -19F, -8F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 4, 19, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 14F, 0F, 6F, -14F, 0F, 6F, -14F, 0F, -6F, 14F, 0F, -6F); // Import Box261
		bodyModel[38].setRotationPoint(-19F, -19F, -8F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box262
		bodyModel[39].setRotationPoint(-33F, 0F, -15F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 10, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box264
		bodyModel[40].setRotationPoint(-37F, -7F, -17F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 10, 1, 2, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box265
		bodyModel[41].setRotationPoint(-37F, -8F, -17F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 10, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import Box266
		bodyModel[42].setRotationPoint(-37F, 9F, -17F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 10, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box267
		bodyModel[43].setRotationPoint(-37F, 6F, -17F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 3, 10, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box268
		bodyModel[44].setRotationPoint(-40F, -4F, -17F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 3, 10, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box269
		bodyModel[45].setRotationPoint(-27F, -4F, -17F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 10, 2, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Import Box270
		bodyModel[46].setRotationPoint(-41F, -4F, -17F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 10, 2, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Import Box271
		bodyModel[47].setRotationPoint(-24F, -4F, -17F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,-1.25F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box272
		bodyModel[48].setRotationPoint(-40F, -7F, -17F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, -1.25F, -1.25F, 0F, -1.25F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box273
		bodyModel[49].setRotationPoint(-27F, -7F, -17F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, -1.25F, 0F, -1.25F, -1.25F, 0F, 0F, 0F, 0F); // Import Box274
		bodyModel[50].setRotationPoint(-27F, 6F, -17F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, -1.25F, 0F); // Import Box275
		bodyModel[51].setRotationPoint(-40F, 6F, -17F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 12, 12, 2, 0F,-4F, -4F, 0F, -4F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box276
		bodyModel[52].setRotationPoint(-38F, -5F, -19F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 10, 10, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[53].setRotationPoint(-37F, -4F, -17F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 21, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[54].setRotationPoint(-13F, -39F, 8F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 21, 10, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, -1F, 0F, -1F, 0F); // Box 88
		bodyModel[55].setRotationPoint(-13F, -23F, 0F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 18, 16, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		bodyModel[56].setRotationPoint(-31F, -39F, 0F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 18, 10, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 90
		bodyModel[57].setRotationPoint(-31F, -23F, 0F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 32, 16, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[58].setRotationPoint(-63F, -39F, 0F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 32, 10, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -8F, -4F); // Box 92
		bodyModel[59].setRotationPoint(-63F, -23F, 0F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 32, 5, 9, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		bodyModel[60].setRotationPoint(-63F, -44F, 0F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 18, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		bodyModel[61].setRotationPoint(-31F, -44F, 0F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 21, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[62].setRotationPoint(-13F, -44F, 6F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 24, 16, 9, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -3F, 0F, 0F, 0F); // Box 96
		bodyModel[63].setRotationPoint(8F, -39F, 0F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 24, 8, 9, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F, -3F, 0F, -1F, -1F); // Box 97
		bodyModel[64].setRotationPoint(8F, -23F, 0F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 16, 3, 24, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 98
		bodyModel[65].setRotationPoint(-30F, -19F, 7F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 16, 3, 17, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[66].setRotationPoint(-14F, -19F, 14F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 16, 3, 9, 0F,0F, 0F, 0F, 10F, -1F, 5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, -1F, 5F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[67].setRotationPoint(-14F, -19F, 5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 16, 3, 14, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 103
		bodyModel[68].setRotationPoint(-43F, -55F, 0F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 14, 3, 10, 0F,0F, 0F, 0F, -4F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 104
		bodyModel[69].setRotationPoint(-27F, -55F, 4F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 10, 3, 4, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[70].setRotationPoint(-27F, -55F, 0F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, 10F, 0F); // Box 118
		bodyModel[71].setRotationPoint(-27F, -28F, 9F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 5F, -5F, 0F, 5F, -5F, 0F, -5F, 5F, 0F, -5F); // Box 119
		bodyModel[72].setRotationPoint(-38F, -53F, 13F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 120
		bodyModel[73].setRotationPoint(-28F, -53F, 13F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 15F, 0F, 5F, -15F, 0F, 5F, -15F, 0F, -5F, 15F, 0F, -5F); // Box 121
		bodyModel[74].setRotationPoint(-28F, -53F, 13F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 122
		bodyModel[75].setRotationPoint(-5F, -51F, 7F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[76].setRotationPoint(-5F, -51F, 0F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		bodyModel[77].setRotationPoint(-5F, -51F, 3F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[78].setRotationPoint(-9F, -51F, 0F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F); // Box 126
		bodyModel[79].setRotationPoint(-13F, -51F, 2F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 24, 5, 9, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, -5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -3F, 0F, 0F, 0F); // Box 127
		bodyModel[80].setRotationPoint(8F, -44F, 0F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 9, 1, 5, 0F,0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[81].setRotationPoint(-13F, -44F, 2F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[82].setRotationPoint(6F, -44F, 2F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 8, 16, 9, 0F,0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, -4F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -4F); // Box 133
		bodyModel[83].setRotationPoint(-71F, -39F, 0F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 8, 3, 9, 0F,0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -9F, -6F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, -4F); // Box 134
		bodyModel[84].setRotationPoint(-71F, -42F, 0F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 8, 2, 9, 0F,0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -4F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -2F, -6F); // Box 135
		bodyModel[85].setRotationPoint(-71F, -23F, 0F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 6, 3, 5, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F); // Box 136
		bodyModel[86].setRotationPoint(-77F, -29F, 0F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 6, 4, 5, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -4F, -4F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -3F); // Box 137
		bodyModel[87].setRotationPoint(-77F, -33F, 0F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 6, 4, 5, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -3F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, -4F, -4F); // Box 138
		bodyModel[88].setRotationPoint(-77F, -26F, 0F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 26, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -8F, 0F, 0F); // Box 139
		bodyModel[89].setRotationPoint(-63F, -23F, 7F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 15, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 140
		bodyModel[90].setRotationPoint(-55F, -13F, 0F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 4, 19, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -6F, 8F, 0F, -6F, 8F, 0F, 6F, -8F, 0F, 6F); // Box 148
		bodyModel[91].setRotationPoint(-41F, -19F, 7F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 4, 19, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 14F, 0F, -6F, -14F, 0F, -6F, -14F, 0F, 6F, 14F, 0F, 6F); // Box 149
		bodyModel[92].setRotationPoint(-19F, -19F, 7F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[93].setRotationPoint(-33F, 0F, 13F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 10, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
		bodyModel[94].setRotationPoint(-37F, -7F, 15F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 10, 1, 2, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152
		bodyModel[95].setRotationPoint(-37F, -8F, 15F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 10, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 153
		bodyModel[96].setRotationPoint(-37F, 9F, 15F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 10, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		bodyModel[97].setRotationPoint(-37F, 6F, 15F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 3, 10, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[98].setRotationPoint(-40F, -4F, 15F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 3, 10, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[99].setRotationPoint(-27F, -4F, 15F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 10, 2, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 157
		bodyModel[100].setRotationPoint(-41F, -4F, 15F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 10, 2, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 158
		bodyModel[101].setRotationPoint(-24F, -4F, 15F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,-1.25F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		bodyModel[102].setRotationPoint(-40F, -7F, 15F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, -1.25F, -1.25F, 0F, -1.25F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		bodyModel[103].setRotationPoint(-27F, -7F, 15F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, -1.25F, 0F, -1.25F, -1.25F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[104].setRotationPoint(-27F, 6F, 15F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, -1.25F, 0F); // Box 162
		bodyModel[105].setRotationPoint(-40F, 6F, 15F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 12, 12, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -4F, 0F, -4F, -4F, 0F); // Box 163
		bodyModel[106].setRotationPoint(-38F, -5F, 17F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 10, 10, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[107].setRotationPoint(-37F, -4F, 15F);

		bodyModel[108].addShapeBox(0F, 1F, 0F, 10, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
		bodyModel[108].setRotationPoint(-4F, -27.5F, -5F);
		bodyModel[108].rotateAngleZ = -0.10471976F;

		bodyModel[109].addShapeBox(9F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		bodyModel[109].setRotationPoint(-4F, -27.5F, -5F);
		bodyModel[109].rotateAngleZ = -0.10471976F;

		bodyModel[110].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		bodyModel[110].setRotationPoint(-4F, -27.5F, -5F);
		bodyModel[110].rotateAngleZ = -0.10471976F;

		bodyModel[111].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		bodyModel[111].setRotationPoint(-4F, -27.5F, 4F);
		bodyModel[111].rotateAngleZ = -0.10471976F;

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		bodyModel[112].setRotationPoint(-4F, -27.5F, -5F);
		bodyModel[112].rotateAngleZ = -0.10471976F;

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 17, 10, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		bodyModel[113].setRotationPoint(5F, -43.5F, -5F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[114].setRotationPoint(7F, -47.5F, -3F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 17, 8, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 246
		bodyModel[115].setRotationPoint(4F, -42.5F, -4F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[116].setRotationPoint(3.7F, -42.8F, -2F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[117].setRotationPoint(3.7F, -42.8F, 1F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 2, 18, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[118].setRotationPoint(5F, -40.5F, -4F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 2, 18, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 251
		bodyModel[119].setRotationPoint(5F, -40.5F, 3F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[120].setRotationPoint(-0.999999999999998F, -26.5F, -6F);
		bodyModel[120].rotateAngleZ = 0.78539816F;

		bodyModel[121].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 253
		bodyModel[121].setRotationPoint(-0.999999999999998F, -26.5F, 5F);
		bodyModel[121].rotateAngleZ = 0.78539816F;

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 962
		bodyModel[122].setRotationPoint(6.5F, -47F, -1.5F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 964
		bodyModel[123].setRotationPoint(6.5F, -46F, -1.5F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 966
		bodyModel[124].setRotationPoint(6.5F, -45F, -1.5F);

		bodyModel[125].addShapeBox(0F, -3F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 259
		bodyModel[125].setRotationPoint(-13F, -23.5F, -6F);
		bodyModel[125].rotateAngleZ = 0.15707963F;

		bodyModel[126].addShapeBox(0F, -3F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
		bodyModel[126].setRotationPoint(-13F, -23.5F, 4F);
		bodyModel[126].rotateAngleZ = 0.15707963F;

		bodyModel[127].addShapeBox(0F, 0F, 0F, 7, 9, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 256
		bodyModel[127].setRotationPoint(-20F, -31.5F, -2F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 8, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[128].setRotationPoint(-12F, -24.5F, -2F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 254
		bodyModel[129].setRotationPoint(-12F, -25.5F, -1.5F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 263
		bodyModel[130].setRotationPoint(-9.5F, -28.5F, -1F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 264
		bodyModel[131].setRotationPoint(-9F, -32.5F, -0.5F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 265
		bodyModel[132].setRotationPoint(-9F, -34.5F, -0.5F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 266
		bodyModel[133].setRotationPoint(-8.7F, -34.6F, -0.5F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 4, 8, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
		bodyModel[134].setRotationPoint(-13F, -39F, -8F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 4, 5, 16, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[135].setRotationPoint(-13F, -44F, -8F);
	}

	private void inittailModel_1()
	{
		tailModel[0] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 42
		tailModel[1] = new ModelRendererTurbo(this, 417, 89, textureX, textureY); // Box 43
		tailModel[2] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 46
		tailModel[3] = new ModelRendererTurbo(this, 105, 81, textureX, textureY); // Box 55
		tailModel[4] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 56
		tailModel[5] = new ModelRendererTurbo(this, 177, 81, textureX, textureY); // Box 57
		tailModel[6] = new ModelRendererTurbo(this, 377, 81, textureX, textureY); // Box 58
		tailModel[7] = new ModelRendererTurbo(this, 257, 49, textureX, textureY); // Box 59
		tailModel[8] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 60
		tailModel[9] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 61
		tailModel[10] = new ModelRendererTurbo(this, 417, 105, textureX, textureY); // Box 82
		tailModel[11] = new ModelRendererTurbo(this, 153, 113, textureX, textureY); // Box 83
		tailModel[12] = new ModelRendererTurbo(this, 457, 105, textureX, textureY); // Box 84
		tailModel[13] = new ModelRendererTurbo(this, 17, 129, textureX, textureY); // Box 85
		tailModel[14] = new ModelRendererTurbo(this, 105, 97, textureX, textureY); // Box 86
		tailModel[15] = new ModelRendererTurbo(this, 409, 201, textureX, textureY); // Box 128
		tailModel[16] = new ModelRendererTurbo(this, 305, 217, textureX, textureY); // Box 129
		tailModel[17] = new ModelRendererTurbo(this, 409, 225, textureX, textureY); // Box 132
		tailModel[18] = new ModelRendererTurbo(this, 89, 217, textureX, textureY); // Box 141
		tailModel[19] = new ModelRendererTurbo(this, 89, 153, textureX, textureY); // Box 142
		tailModel[20] = new ModelRendererTurbo(this, 265, 217, textureX, textureY); // Box 143
		tailModel[21] = new ModelRendererTurbo(this, 305, 233, textureX, textureY); // Box 144
		tailModel[22] = new ModelRendererTurbo(this, 137, 129, textureX, textureY); // Box 145
		tailModel[23] = new ModelRendererTurbo(this, 193, 113, textureX, textureY); // Box 146
		tailModel[24] = new ModelRendererTurbo(this, 153, 241, textureX, textureY); // Box 147
		tailModel[25] = new ModelRendererTurbo(this, 201, 249, textureX, textureY); // Box 165
		tailModel[26] = new ModelRendererTurbo(this, 457, 249, textureX, textureY); // Box 166
		tailModel[27] = new ModelRendererTurbo(this, 409, 241, textureX, textureY); // Box 167
		tailModel[28] = new ModelRendererTurbo(this, 217, 257, textureX, textureY); // Box 168
		tailModel[29] = new ModelRendererTurbo(this, 201, 241, textureX, textureY); // Box 169

		tailModel[0].addShapeBox(0F, 0F, 0F, 32, 12, 6, 0F,0F, 0F, 0F, 0F, -4F, -4F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 42
		tailModel[0].setRotationPoint(32F, -37F, -6F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 32, 3, 6, 0F,0F, 0F, -2F, 0F, -5F, -4F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -4F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 43
		tailModel[1].setRotationPoint(32F, -40F, -6F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 32, 6, 6, 0F,0F, 0F, 0F, 0F, 2F, -4F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -5F, 0F, -3F, 0F, 0F, 1F, 0F); // Box 46
		tailModel[2].setRotationPoint(32F, -25F, -6F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 14, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 55
		tailModel[3].setRotationPoint(64F, -35F, -2F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 12, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -4F, -2F, -1F, -4F, -2F, 0F, 0F, 0F, 0F); // Box 56
		tailModel[4].setRotationPoint(64F, -27F, -2F);

		tailModel[5].addShapeBox(0F, 0F, 0F, 14, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		tailModel[5].setRotationPoint(64F, -43F, -2F);

		tailModel[6].addShapeBox(0F, 0F, 0F, 14, 12, 2, 0F,0F, 0F, 0F, -5F, 0F, -1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		tailModel[6].setRotationPoint(64F, -55F, -2F);

		tailModel[7].addShapeBox(0F, 0F, 0F, 9, 3, 2, 0F,0F, 0F, -1F, -6F, 0F, -1F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		tailModel[7].setRotationPoint(64F, -58F, -2F);

		tailModel[8].addShapeBox(0F, 0F, 0F, 6, 3, 2, 0F,-4F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		tailModel[8].setRotationPoint(58F, -58F, -2F);

		tailModel[9].addShapeBox(0F, 0F, 0F, 21, 20, 2, 0F,-15F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		tailModel[9].setRotationPoint(43F, -55F, -2F);

		tailModel[10].addShapeBox(0F, 0F, 0F, 12, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		tailModel[10].setRotationPoint(58F, -33F, -14F);

		tailModel[11].addShapeBox(0F, 0F, 0F, 12, 2, 13, 0F,0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		tailModel[11].setRotationPoint(58F, -33F, -27F);

		tailModel[12].addShapeBox(0F, 0F, 0F, 10, 2, 9, 0F,0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		tailModel[12].setRotationPoint(58F, -33F, -36F);

		tailModel[13].addShapeBox(0F, 0F, 0F, 17, 2, 34, 0F,-12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		tailModel[13].setRotationPoint(41F, -33F, -36F);

		tailModel[14].addShapeBox(0F, 0F, 0F, 11, 2, 3, 0F,-5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		tailModel[14].setRotationPoint(53F, -33F, -39F);

		tailModel[15].addShapeBox(0F, 0F, 0F, 32, 12, 6, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -4F, 0F, 0F, 0F); // Box 128
		tailModel[15].setRotationPoint(32F, -37F, 0F);

		tailModel[16].addShapeBox(0F, 0F, 0F, 32, 3, 6, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, -4F, 0F, 0F, 0F); // Box 129
		tailModel[16].setRotationPoint(32F, -40F, 0F);

		tailModel[17].addShapeBox(0F, 0F, 0F, 32, 6, 6, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -4F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, -3F, -5F, 0F, 0F, 0F); // Box 132
		tailModel[17].setRotationPoint(32F, -25F, 0F);

		tailModel[18].addShapeBox(0F, 0F, 0F, 14, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, 0F); // Box 141
		tailModel[18].setRotationPoint(64F, -35F, 0F);

		tailModel[19].addShapeBox(0F, 0F, 0F, 12, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -2F, 0F, -4F, -2F, -1F, 0F, 0F, -1F); // Box 142
		tailModel[19].setRotationPoint(64F, -27F, 0F);

		tailModel[20].addShapeBox(0F, 0F, 0F, 14, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 143
		tailModel[20].setRotationPoint(64F, -43F, 0F);

		tailModel[21].addShapeBox(0F, 0F, 0F, 14, 12, 2, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 144
		tailModel[21].setRotationPoint(64F, -55F, 0F);

		tailModel[22].addShapeBox(0F, 0F, 0F, 9, 3, 2, 0F,0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 145
		tailModel[22].setRotationPoint(64F, -58F, 0F);

		tailModel[23].addShapeBox(0F, 0F, 0F, 6, 3, 2, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -4F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 146
		tailModel[23].setRotationPoint(58F, -58F, 0F);

		tailModel[24].addShapeBox(0F, 0F, 0F, 21, 20, 2, 0F,-15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 147
		tailModel[24].setRotationPoint(43F, -55F, 0F);

		tailModel[25].addShapeBox(0F, 0F, 0F, 12, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		tailModel[25].setRotationPoint(58F, -33F, 2F);

		tailModel[26].addShapeBox(0F, 0F, 0F, 12, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 166
		tailModel[26].setRotationPoint(58F, -33F, 14F);

		tailModel[27].addShapeBox(0F, 0F, 0F, 10, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 167
		tailModel[27].setRotationPoint(58F, -33F, 27F);

		tailModel[28].addShapeBox(0F, 0F, 0F, 17, 2, 34, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F); // Box 168
		tailModel[28].setRotationPoint(41F, -33F, 2F);

		tailModel[29].addShapeBox(0F, 0F, 0F, 11, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -5F, 0F, 0F); // Box 169
		tailModel[29].setRotationPoint(53F, -33F, 36F);
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Box 37
		leftWingModel[1] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // Box 38
		leftWingModel[2] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 42
		leftWingModel[3] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 43
		leftWingModel[4] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 44
		leftWingModel[5] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Box 45
		leftWingModel[6] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 46
		leftWingModel[7] = new ModelRendererTurbo(this, 305, 65, textureX, textureY); // Box 47
		leftWingModel[8] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Box 48
		leftWingModel[9] = new ModelRendererTurbo(this, 177, 73, textureX, textureY); // Box 49
		leftWingModel[10] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 50
		leftWingModel[11] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 51
		leftWingModel[12] = new ModelRendererTurbo(this, 361, 73, textureX, textureY); // Box 52
		leftWingModel[13] = new ModelRendererTurbo(this, 161, 81, textureX, textureY); // Box 53

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 16, 3, 28, 0F,0F, 2F, 0F, -1F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 37
		leftWingModel[0].setRotationPoint(-14F, -19F, -59F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 16, 3, 28, 0F,0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 38
		leftWingModel[1].setRotationPoint(-30F, -19F, -59F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 14, 3, 19, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 42
		leftWingModel[2].setRotationPoint(-27F, -55F, -33F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 16, 3, 19, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 43
		leftWingModel[3].setRotationPoint(-43F, -55F, -33F);

		leftWingModel[4].addShapeBox(0F, 0F, 0F, 12, 3, 61, 0F,5F, 1F, 0F, -3F, 1F, 0F, 2F, -4F, 0F, 0F, -3F, 0F, 5F, -3F, 0F, -3F, -3F, 0F, 2F, 2F, 0F, 0F, 3F, 0F); // Box 44
		leftWingModel[4].setRotationPoint(-27F, -59F, -94F);

		leftWingModel[5].addShapeBox(0F, 0F, 0F, 12, 3, 61, 0F,0F, 1F, 0F, -3F, 1F, 0F, 2F, -3F, 0F, 2F, -4F, 0F, 0F, -3F, 0F, -3F, -3F, 0F, 2F, 3F, 0F, 2F, 2F, 0F); // Box 45
		leftWingModel[5].setRotationPoint(-41F, -59F, -94F);

		leftWingModel[6].addShapeBox(0F, 0F, 0F, 23, 1, 6, 0F,-4F, 1F, 0F, -6F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -1F, 0F, -6F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		leftWingModel[6].setRotationPoint(-41F, -60F, -100F);

		leftWingModel[7].addShapeBox(0F, 0F, 0F, 15, 3, 35, 0F,0F, 0F, 0F, -5F, 0F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -5F, -2F, 0F, 0F, 1F, 0F, 0F, 2F, 0F); // Box 47
		leftWingModel[7].setRotationPoint(-14F, -23F, -94F);

		leftWingModel[8].addShapeBox(0F, 0F, 0F, 16, 3, 35, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, -3F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F); // Box 48
		leftWingModel[8].setRotationPoint(-30F, -23F, -94F);

		leftWingModel[9].addShapeBox(0F, 0F, 0F, 23, 1, 6, 0F,-4F, 1F, 0F, -6F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -1F, 0F, -6F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		leftWingModel[9].setRotationPoint(-27F, -23F, -100F);

		leftWingModel[10].addShapeBox(0F, 0F, 0F, 12, 17, 1, 0F,0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, -5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 1F, 0F); // Box 50
		leftWingModel[10].setRotationPoint(-29F, -38F, -66F);

		leftWingModel[11].addShapeBox(0F, 0F, 0F, 10, 19, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F); // Box 51
		leftWingModel[11].setRotationPoint(-35F, -57F, -66F);

		leftWingModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 51, 0F,0F, 3F, 0F, 0F, 3F, 0F, 10F, -35F, 0F, -10F, -35F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 11F, 35F, 0F, -11F, 35F, 0F); // Box 52
		leftWingModel[12].setRotationPoint(-32F, -53F, -65F);

		leftWingModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 51, 0F,-10F, -32F, 0F, 10F, -32F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 32F, 0F, 11F, 32F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		leftWingModel[13].setRotationPoint(-32F, -53F, -65F);
	}

	private void initrightWingModel_1()
	{
		rightWingModel[0] = new ModelRendererTurbo(this, 137, 169, textureX, textureY); // Box 101
		rightWingModel[1] = new ModelRendererTurbo(this, 233, 169, textureX, textureY); // Box 102
		rightWingModel[2] = new ModelRendererTurbo(this, 425, 177, textureX, textureY); // Box 106
		rightWingModel[3] = new ModelRendererTurbo(this, 305, 193, textureX, textureY); // Box 107
		rightWingModel[4] = new ModelRendererTurbo(this, 321, 193, textureX, textureY); // Box 108
		rightWingModel[5] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 109
		rightWingModel[6] = new ModelRendererTurbo(this, 305, 153, textureX, textureY); // Box 110
		rightWingModel[7] = new ModelRendererTurbo(this, 89, 201, textureX, textureY); // Box 111
		rightWingModel[8] = new ModelRendererTurbo(this, 193, 201, textureX, textureY); // Box 112
		rightWingModel[9] = new ModelRendererTurbo(this, 201, 185, textureX, textureY); // Box 113
		rightWingModel[10] = new ModelRendererTurbo(this, 473, 177, textureX, textureY); // Box 114
		rightWingModel[11] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 115
		rightWingModel[12] = new ModelRendererTurbo(this, 249, 201, textureX, textureY); // Box 116
		rightWingModel[13] = new ModelRendererTurbo(this, 97, 241, textureX, textureY); // Box 117

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 16, 3, 28, 0F,0F, 0F, 0F, 0F, -1F, 0F, -1F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -3F, 0F, 0F, -2F, 0F); // Box 101
		rightWingModel[0].setRotationPoint(-14F, -19F, 31F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 16, 3, 28, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F); // Box 102
		rightWingModel[1].setRotationPoint(-30F, -19F, 31F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 14, 3, 19, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F); // Box 106
		rightWingModel[2].setRotationPoint(-27F, -55F, 14F);

		rightWingModel[3].addShapeBox(0F, 0F, 0F, 16, 3, 19, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F); // Box 107
		rightWingModel[3].setRotationPoint(-43F, -55F, 14F);

		rightWingModel[4].addShapeBox(0F, 0F, 0F, 12, 3, 61, 0F,0F, -3F, 0F, 2F, -4F, 0F, -3F, 1F, 0F, 5F, 1F, 0F, 0F, 3F, 0F, 2F, 2F, 0F, -3F, -3F, 0F, 5F, -3F, 0F); // Box 108
		rightWingModel[4].setRotationPoint(-27F, -59F, 33F);

		rightWingModel[5].addShapeBox(0F, 0F, 0F, 12, 3, 61, 0F,2F, -4F, 0F, 2F, -3F, 0F, -3F, 1F, 0F, 0F, 1F, 0F, 2F, 2F, 0F, 2F, 3F, 0F, -3F, -3F, 0F, 0F, -3F, 0F); // Box 109
		rightWingModel[5].setRotationPoint(-41F, -59F, 33F);

		rightWingModel[6].addShapeBox(0F, 0F, 0F, 23, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -6F, 1F, 0F, -4F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -1F, 0F, -4F, -1F, 0F); // Box 110
		rightWingModel[6].setRotationPoint(-41F, -60F, 94F);

		rightWingModel[7].addShapeBox(0F, 0F, 0F, 15, 3, 35, 0F,0F, -2F, 0F, 0F, -3F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, -5F, -2F, 0F, 0F, -2F, 0F); // Box 111
		rightWingModel[7].setRotationPoint(-14F, -23F, 59F);

		rightWingModel[8].addShapeBox(0F, 0F, 0F, 16, 3, 35, 0F,0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, -3F, -2F, 0F); // Box 112
		rightWingModel[8].setRotationPoint(-30F, -23F, 59F);

		rightWingModel[9].addShapeBox(0F, 0F, 0F, 23, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -6F, 1F, 0F, -4F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -1F, 0F, -4F, -1F, 0F); // Box 113
		rightWingModel[9].setRotationPoint(-27F, -23F, 94F);

		rightWingModel[10].addShapeBox(0F, 0F, 0F, 12, 17, 1, 0F,0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, -5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 1F, 0F); // Box 114
		rightWingModel[10].setRotationPoint(-29F, -38F, 65F);

		rightWingModel[11].addShapeBox(0F, 0F, 0F, 10, 19, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F); // Box 115
		rightWingModel[11].setRotationPoint(-35F, -57F, 65F);

		rightWingModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 51, 0F,-10F, -35F, 0F, 10F, -35F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, -11F, 35F, 0F, 11F, 35F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 116
		rightWingModel[12].setRotationPoint(-32F, -53F, 14F);

		rightWingModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 51, 0F,0F, 0F, 0F, 0F, 0F, 0F, 10F, -32F, 0F, -10F, -32F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 11F, 32F, 0F, -11F, 32F, 0F); // Box 117
		rightWingModel[13].setRotationPoint(-32F, -53F, 14F);
	}

	private void initPropeller()
	{
		propellerModels = new ModelRendererTurbo[1][3];
		propellerModels[0] = makeProp1(-73F, -27.5F, 0F);
	}

	private ModelRendererTurbo[] makeProp1(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[3];
		prop[0] = new ModelRendererTurbo(this, 2, 268, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 2, 268, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 2, 268, textureX, textureY);
		prop[0].addBox(-1F, -30F, -2F, 2, 30, 4, 0.0F);
		prop[1].addBox(-1F, -30F, -2F, 2, 30, 4, 0.0F);
		prop[2].addBox(-1F, -30F, -2F, 2, 30, 4, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		return prop;
	}
}