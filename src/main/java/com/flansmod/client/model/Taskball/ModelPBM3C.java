//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: PBM3C
// Model Creator: 
// Created on: 21.05.2023 - 01:07:26
// Last changed on: 21.05.2023 - 01:07:26

package com.flansmod.client.model.Taskball; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelPBM3C extends ModelPlane //Same as Filename
{
	int textureX = 2048;
	int textureY = 1024;

	public ModelPBM3C() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[129];
		noseModel = new ModelRendererTurbo[18];
		tailModel = new ModelRendererTurbo[42];
		leftWingModel = new ModelRendererTurbo[99];
		rightWingModel = new ModelRendererTurbo[99];
		yawFlapModel = new ModelRendererTurbo[6];
		pitchFlapLeftModel = new ModelRendererTurbo[1];
		pitchFlapRightModel = new ModelRendererTurbo[1];
		pitchFlapLeftWingModel = new ModelRendererTurbo[2];
		pitchFlapRightWingModel = new ModelRendererTurbo[2];
		planeModeParts = new ModelRendererTurbo[88];

		initbodyModel_1();
		initnoseModel_1();
		inittailModel_1();
		initleftWingModel_1();
		initrightWingModel_1();
		inityawFlapModel_1();
		initpitchFlapLeftModel_1();
		initpitchFlapRightModel_1();
		initpitchFlapLeftWingModel_1();
		initpitchFlapRightWingModel_1();
		initplaneModeParts_1();

		initPropeller();

		initGuns();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 601, 1, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 993, 1, textureX, textureY); // Box 9
		bodyModel[7] = new ModelRendererTurbo(this, 1145, 1, textureX, textureY); // Box 10
		bodyModel[8] = new ModelRendererTurbo(this, 1297, 1, textureX, textureY); // Box 11
		bodyModel[9] = new ModelRendererTurbo(this, 1441, 1, textureX, textureY); // Box 12
		bodyModel[10] = new ModelRendererTurbo(this, 1601, 1, textureX, textureY); // Box 13
		bodyModel[11] = new ModelRendererTurbo(this, 1721, 1, textureX, textureY); // Box 14
		bodyModel[12] = new ModelRendererTurbo(this, 1833, 1, textureX, textureY); // Box 15
		bodyModel[13] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 16
		bodyModel[14] = new ModelRendererTurbo(this, 785, 41, textureX, textureY); // Box 17
		bodyModel[15] = new ModelRendererTurbo(this, 1273, 41, textureX, textureY); // Box 18
		bodyModel[16] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 19
		bodyModel[17] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Box 20
		bodyModel[18] = new ModelRendererTurbo(this, 585, 49, textureX, textureY); // Box 21
		bodyModel[19] = new ModelRendererTurbo(this, 953, 49, textureX, textureY); // Box 22
		bodyModel[20] = new ModelRendererTurbo(this, 1081, 49, textureX, textureY); // Box 23
		bodyModel[21] = new ModelRendererTurbo(this, 1809, 57, textureX, textureY); // Box 26
		bodyModel[22] = new ModelRendererTurbo(this, 417, 65, textureX, textureY); // Box 27
		bodyModel[23] = new ModelRendererTurbo(this, 1369, 65, textureX, textureY); // Box 28
		bodyModel[24] = new ModelRendererTurbo(this, 1513, 65, textureX, textureY); // Box 29
		bodyModel[25] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 30
		bodyModel[26] = new ModelRendererTurbo(this, 1177, 81, textureX, textureY); // Box 31
		bodyModel[27] = new ModelRendererTurbo(this, 121, 89, textureX, textureY); // Box 32
		bodyModel[28] = new ModelRendererTurbo(this, 497, 89, textureX, textureY); // Box 33
		bodyModel[29] = new ModelRendererTurbo(this, 633, 89, textureX, textureY); // Box 34
		bodyModel[30] = new ModelRendererTurbo(this, 793, 89, textureX, textureY); // Box 35
		bodyModel[31] = new ModelRendererTurbo(this, 897, 89, textureX, textureY); // Box 36
		bodyModel[32] = new ModelRendererTurbo(this, 689, 1, textureX, textureY); // Box 39
		bodyModel[33] = new ModelRendererTurbo(this, 1961, 1, textureX, textureY); // Box 40
		bodyModel[34] = new ModelRendererTurbo(this, 1953, 57, textureX, textureY); // Box 43
		bodyModel[35] = new ModelRendererTurbo(this, 1617, 81, textureX, textureY); // Box 46
		bodyModel[36] = new ModelRendererTurbo(this, 1961, 89, textureX, textureY); // Box 49
		bodyModel[37] = new ModelRendererTurbo(this, 1017, 89, textureX, textureY); // Box 50
		bodyModel[38] = new ModelRendererTurbo(this, 353, 145, textureX, textureY); // Box 87
		bodyModel[39] = new ModelRendererTurbo(this, 809, 1, textureX, textureY); // Box 93
		bodyModel[40] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 94
		bodyModel[41] = new ModelRendererTurbo(this, 569, 1, textureX, textureY); // Box 95
		bodyModel[42] = new ModelRendererTurbo(this, 921, 1, textureX, textureY); // Box 96
		bodyModel[43] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 97
		bodyModel[44] = new ModelRendererTurbo(this, 969, 1, textureX, textureY); // Box 98
		bodyModel[45] = new ModelRendererTurbo(this, 609, 1, textureX, textureY); // Box 99
		bodyModel[46] = new ModelRendererTurbo(this, 1297, 1, textureX, textureY); // Box 100
		bodyModel[47] = new ModelRendererTurbo(this, 689, 17, textureX, textureY); // Box 101
		bodyModel[48] = new ModelRendererTurbo(this, 985, 1, textureX, textureY); // Box 102
		bodyModel[49] = new ModelRendererTurbo(this, 1569, 1, textureX, textureY); // Box 103
		bodyModel[50] = new ModelRendererTurbo(this, 705, 17, textureX, textureY); // Box 104
		bodyModel[51] = new ModelRendererTurbo(this, 1113, 1, textureX, textureY); // Box 105
		bodyModel[52] = new ModelRendererTurbo(this, 1121, 1, textureX, textureY); // Box 106
		bodyModel[53] = new ModelRendererTurbo(this, 609, 1, textureX, textureY); // Box 186
		bodyModel[54] = new ModelRendererTurbo(this, 473, 225, textureX, textureY); // Box 187
		bodyModel[55] = new ModelRendererTurbo(this, 561, 225, textureX, textureY); // Box 188
		bodyModel[56] = new ModelRendererTurbo(this, 601, 225, textureX, textureY); // Box 190
		bodyModel[57] = new ModelRendererTurbo(this, 1457, 233, textureX, textureY); // Box 191
		bodyModel[58] = new ModelRendererTurbo(this, 881, 241, textureX, textureY); // Box 192
		bodyModel[59] = new ModelRendererTurbo(this, 1561, 241, textureX, textureY); // Box 193
		bodyModel[60] = new ModelRendererTurbo(this, 169, 249, textureX, textureY); // Box 194
		bodyModel[61] = new ModelRendererTurbo(this, 1105, 225, textureX, textureY); // Box 195
		bodyModel[62] = new ModelRendererTurbo(this, 985, 241, textureX, textureY); // Box 196
		bodyModel[63] = new ModelRendererTurbo(this, 353, 249, textureX, textureY); // Box 200
		bodyModel[64] = new ModelRendererTurbo(this, 1081, 257, textureX, textureY); // Box 201
		bodyModel[65] = new ModelRendererTurbo(this, 1233, 257, textureX, textureY); // Box 202
		bodyModel[66] = new ModelRendererTurbo(this, 1377, 257, textureX, textureY); // Box 203
		bodyModel[67] = new ModelRendererTurbo(this, 601, 233, textureX, textureY); // Box 204
		bodyModel[68] = new ModelRendererTurbo(this, 1873, 241, textureX, textureY); // Box 205
		bodyModel[69] = new ModelRendererTurbo(this, 1, 265, textureX, textureY); // Box 206
		bodyModel[70] = new ModelRendererTurbo(this, 689, 265, textureX, textureY); // Box 207
		bodyModel[71] = new ModelRendererTurbo(this, 841, 273, textureX, textureY); // Box 208
		bodyModel[72] = new ModelRendererTurbo(this, 481, 273, textureX, textureY); // Box 209
		bodyModel[73] = new ModelRendererTurbo(this, 1713, 273, textureX, textureY); // Box 210
		bodyModel[74] = new ModelRendererTurbo(this, 1505, 289, textureX, textureY); // Box 211
		bodyModel[75] = new ModelRendererTurbo(this, 1825, 289, textureX, textureY); // Box 212
		bodyModel[76] = new ModelRendererTurbo(this, 329, 297, textureX, textureY); // Box 213
		bodyModel[77] = new ModelRendererTurbo(this, 577, 297, textureX, textureY); // Box 214
		bodyModel[78] = new ModelRendererTurbo(this, 1201, 297, textureX, textureY); // Box 217
		bodyModel[79] = new ModelRendererTurbo(this, 1945, 297, textureX, textureY); // Box 218
		bodyModel[80] = new ModelRendererTurbo(this, 137, 313, textureX, textureY); // Box 219
		bodyModel[81] = new ModelRendererTurbo(this, 457, 313, textureX, textureY); // Box 220
		bodyModel[82] = new ModelRendererTurbo(this, 697, 313, textureX, textureY); // Box 221
		bodyModel[83] = new ModelRendererTurbo(this, 1, 321, textureX, textureY); // Box 222
		bodyModel[84] = new ModelRendererTurbo(this, 833, 321, textureX, textureY); // Box 223
		bodyModel[85] = new ModelRendererTurbo(this, 1081, 321, textureX, textureY); // Box 224
		bodyModel[86] = new ModelRendererTurbo(this, 1633, 329, textureX, textureY); // Box 225
		bodyModel[87] = new ModelRendererTurbo(this, 1377, 321, textureX, textureY); // Box 226
		bodyModel[88] = new ModelRendererTurbo(this, 1817, 329, textureX, textureY); // Box 227
		bodyModel[89] = new ModelRendererTurbo(this, 713, 73, textureX, textureY); // Box 230
		bodyModel[90] = new ModelRendererTurbo(this, 257, 337, textureX, textureY); // Box 231
		bodyModel[91] = new ModelRendererTurbo(this, 1937, 337, textureX, textureY); // Box 234
		bodyModel[92] = new ModelRendererTurbo(this, 1705, 225, textureX, textureY); // Box 237
		bodyModel[93] = new ModelRendererTurbo(this, 489, 345, textureX, textureY); // Box 240
		bodyModel[94] = new ModelRendererTurbo(this, 1625, 289, textureX, textureY); // Box 241
		bodyModel[95] = new ModelRendererTurbo(this, 1073, 305, textureX, textureY); // Box 278
		bodyModel[96] = new ModelRendererTurbo(this, 809, 9, textureX, textureY); // Box 284
		bodyModel[97] = new ModelRendererTurbo(this, 1689, 1, textureX, textureY); // Box 285
		bodyModel[98] = new ModelRendererTurbo(this, 1737, 1, textureX, textureY); // Box 286
		bodyModel[99] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 287
		bodyModel[100] = new ModelRendererTurbo(this, 729, 1, textureX, textureY); // Box 288
		bodyModel[101] = new ModelRendererTurbo(this, 1265, 25, textureX, textureY); // Box 289
		bodyModel[102] = new ModelRendererTurbo(this, 569, 9, textureX, textureY); // Box 290
		bodyModel[103] = new ModelRendererTurbo(this, 713, 49, textureX, textureY); // Box 291
		bodyModel[104] = new ModelRendererTurbo(this, 785, 49, textureX, textureY); // Box 292
		bodyModel[105] = new ModelRendererTurbo(this, 1617, 9, textureX, textureY); // Box 293
		bodyModel[106] = new ModelRendererTurbo(this, 1801, 9, textureX, textureY); // Box 294
		bodyModel[107] = new ModelRendererTurbo(this, 969, 41, textureX, textureY); // Box 295
		bodyModel[108] = new ModelRendererTurbo(this, 2033, 1, textureX, textureY); // Box 296
		bodyModel[109] = new ModelRendererTurbo(this, 2041, 1, textureX, textureY); // Box 297
		bodyModel[110] = new ModelRendererTurbo(this, 1169, 1, textureX, textureY); // Box 377
		bodyModel[111] = new ModelRendererTurbo(this, 1313, 457, textureX, textureY); // Box 378
		bodyModel[112] = new ModelRendererTurbo(this, 865, 377, textureX, textureY); // Box 379
		bodyModel[113] = new ModelRendererTurbo(this, 1289, 385, textureX, textureY); // Box 380
		bodyModel[114] = new ModelRendererTurbo(this, 193, 481, textureX, textureY); // Box 389
		bodyModel[115] = new ModelRendererTurbo(this, 321, 481, textureX, textureY); // Box 390
		bodyModel[116] = new ModelRendererTurbo(this, 649, 481, textureX, textureY); // Box 391
		bodyModel[117] = new ModelRendererTurbo(this, 1177, 225, textureX, textureY); // Box 392
		bodyModel[118] = new ModelRendererTurbo(this, 1721, 449, textureX, textureY); // Box 393
		bodyModel[119] = new ModelRendererTurbo(this, 1073, 481, textureX, textureY); // Box 394
		bodyModel[120] = new ModelRendererTurbo(this, 737, 481, textureX, textureY); // Box 490
		bodyModel[121] = new ModelRendererTurbo(this, 1241, 481, textureX, textureY); // Box 491
		bodyModel[122] = new ModelRendererTurbo(this, 1345, 297, textureX, textureY); // Box 726
		bodyModel[123] = new ModelRendererTurbo(this, 1, 321, textureX, textureY); // Box 727
		bodyModel[124] = new ModelRendererTurbo(this, 553, 81, textureX, textureY); // Box 728
		bodyModel[125] = new ModelRendererTurbo(this, 1881, 193, textureX, textureY); // Box 729
		bodyModel[126] = new ModelRendererTurbo(this, 1809, 81, textureX, textureY); // Box 730
		bodyModel[127] = new ModelRendererTurbo(this, 1161, 241, textureX, textureY); // Box 731
		bodyModel[128] = new ModelRendererTurbo(this, 873, 209, textureX, textureY); // Box 732

		bodyModel[0].addShapeBox(0F, 0F, 0F, 56, 10, 10, 0F,0F, 0F, -9F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 1F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 0
		bodyModel[0].setRotationPoint(-167F, -50F, -25F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 56, 18, 8, 0F,0F, 0F, -7F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 1
		bodyModel[1].setRotationPoint(-167F, -40F, -28F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 56, 14, 31, 0F,0F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[2].setRotationPoint(-167F, -22F, -31F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 56, 22, 35, 0F,0F, 0F, -7F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -4F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F); // Box 3
		bodyModel[3].setRotationPoint(-167F, -8F, -35F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 26, 18, 6, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -2F); // Box 4
		bodyModel[4].setRotationPoint(-193F, -40F, -26F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 26, 14, 28, 0F,0F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[5].setRotationPoint(-193F, -22F, -28F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 43, 14, 31, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[6].setRotationPoint(-111F, -22F, -31F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 43, 18, 29, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[7].setRotationPoint(-111F, -40F, -29F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 43, 10, 26, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[8].setRotationPoint(-111F, -50F, -26F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 43, 23, 35, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, 0F); // Box 12
		bodyModel[9].setRotationPoint(-111F, -8F, -35F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 23, 23, 35, 0F,0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, 0F); // Box 13
		bodyModel[10].setRotationPoint(-68F, -8F, -35F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 23, 14, 31, 0F,0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[11].setRotationPoint(-68F, -22F, -31F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 43, 17, 35, 0F,0F, 0F, -3F, 0F, 1F, -4F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, -7F, -3F, 0F, 6F, 0F, 0F, 11F, 0F); // Box 15
		bodyModel[12].setRotationPoint(-45F, -8F, -35F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 43, 14, 32, 0F,0F, 0F, -2F, 0F, 3F, -3F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[13].setRotationPoint(-45F, -22F, -32F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 52, 16, 31, 0F,0F, 0F, -2F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -11F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[14].setRotationPoint(-2F, -25F, -31F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 37, 13, 23, 0F,0F, 0F, 0F, 0F, 1F, -3F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, -10F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[15].setRotationPoint(50F, -25F, -23F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 23, 18, 30, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[16].setRotationPoint(-68F, -40F, -30F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 43, 15, 30, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 20
		bodyModel[17].setRotationPoint(-45F, -40F, -30F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 52, 15, 17, 0F,0F, 0F, -3F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[18].setRotationPoint(-2F, -40F, -29F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 37, 15, 23, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[19].setRotationPoint(50F, -40F, -23F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 26, 19, 31, 0F,0F, 0F, -6F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -4F, 0F, 0F, 0F, 0F, 11F, 0F, 0F, 10F, 0F); // Box 23
		bodyModel[20].setRotationPoint(-193F, -8F, -31F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 52, 11, 32, 0F,0F, 0F, -1F, 0F, 3F, -12F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -13F, 0F, 6F, 0F, 0F, 13F, 0F); // Box 26
		bodyModel[21].setRotationPoint(-2F, -9F, -32F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 23, 10, 26, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[22].setRotationPoint(-68F, -50F, -26F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 43, 10, 26, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[23].setRotationPoint(-45F, -50F, -26F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 37, 10, 20, 0F,0F, 0F, 0F, 0F, 1F, -7F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -11F, 0F, 5F, 0F, 0F, 10F, 0F); // Box 29
		bodyModel[24].setRotationPoint(50F, -12F, -20F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 52, 10, 14, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[25].setRotationPoint(-2F, -50F, -26F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 37, 10, 23, 0F,0F, 0F, -1F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[26].setRotationPoint(50F, -50F, -23F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 56, 7, 15, 0F,0F, -1F, -14F, 0F, 0F, -9F, 0F, -1F, -6F, 0F, -2F, -1F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F); // Box 32
		bodyModel[27].setRotationPoint(-167F, -57F, -22F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 43, 7, 22, 0F,0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[28].setRotationPoint(-111F, -57F, -22F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 66, 7, 22, 0F,0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[29].setRotationPoint(-68F, -57F, -22F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 52, 7, 10, 0F,0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[30].setRotationPoint(-2F, -57F, -22F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 37, 7, 22, 0F,0F, 0F, -9F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[31].setRotationPoint(50F, -57F, -22F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 11, 4, 11, 0F,0F, 0F, -9.9999F, -10.9999F, 0F, -9.9999F, -10.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9.9999F, 0F, 0F, -9.9999F); // Box 39
		bodyModel[32].setRotationPoint(-193F, -44F, -21F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 23, 14, 20, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[33].setRotationPoint(87F, -40F, -20F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 23, 10, 20, 0F,0F, 0F, -2F, 0F, 1F, -4F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[34].setRotationPoint(87F, -50F, -20F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 23, 10, 18, 0F,0F, -3F, -8F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[35].setRotationPoint(87F, -60F, -18F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 23, 13, 20, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 2F, -20F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[36].setRotationPoint(87F, -26F, -20F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 23, 14, 13, 0F,0F, 0F, 0F, 0F, -1.9999F, -12.9999F, 0F, -1.9999F, 0F, 0F, 0F, 0F, 0F, -2.9999F, -3.9999F, 0F, 0F, -12.9999F, 0F, 0F, 0F, 0F, 1.9999F, 0F); // Box 50
		bodyModel[37].setRotationPoint(87F, -13F, -13F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 56, 1, 13, 0F,0F, -1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 87
		bodyModel[38].setRotationPoint(-167F, -57F, -13F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		bodyModel[39].setRotationPoint(-182F, -50F, -16F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F); // Box 94
		bodyModel[40].setRotationPoint(-188F, -50F, -16F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F); // Box 95
		bodyModel[41].setRotationPoint(-193F, -50F, -11F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 96
		bodyModel[42].setRotationPoint(-188F, -50F, -11F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[43].setRotationPoint(-190F, -50F, -2F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F,0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 98
		bodyModel[44].setRotationPoint(-190F, -50F, -2F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[45].setRotationPoint(-182F, -54F, -7F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[46].setRotationPoint(-182F, -54F, -16F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[47].setRotationPoint(-175F, -55F, -16F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[48].setRotationPoint(-175F, -55F, -7F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[49].setRotationPoint(-182F, -54F, -2F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 104
		bodyModel[50].setRotationPoint(-175F, -55F, -2F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 105
		bodyModel[51].setRotationPoint(-175F, -50F, -16F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 106
		bodyModel[52].setRotationPoint(-182F, -50F, -16F);

		bodyModel[53].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 186
		bodyModel[53].setRotationPoint(0F, 12F, 0F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 28, 32, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		bodyModel[54].setRotationPoint(-2F, -57F, -12F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 8, 32, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7.9999F, 0F, 0F, 0F); // Box 188
		bodyModel[55].setRotationPoint(26F, -57F, -12F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 8, 32, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7.9999F); // Box 190
		bodyModel[56].setRotationPoint(42F, -57F, -12F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 56, 10, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -9F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 1F, 0F, 0F, -4F); // Box 191
		bodyModel[57].setRotationPoint(-167F, -50F, 15F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 56, 18, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -7F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 1F, 0F, 0F, -2F); // Box 192
		bodyModel[58].setRotationPoint(-167F, -40F, 20F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 56, 14, 31, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 193
		bodyModel[59].setRotationPoint(-167F, -22F, 0F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 56, 22, 35, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -7F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, -3F, -4F); // Box 194
		bodyModel[60].setRotationPoint(-167F, -8F, 0F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 26, 18, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 195
		bodyModel[61].setRotationPoint(-193F, -40F, 20F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 26, 14, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 196
		bodyModel[62].setRotationPoint(-193F, -22F, 0F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 43, 14, 31, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
		bodyModel[63].setRotationPoint(-111F, -22F, 0F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 43, 18, 29, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
		bodyModel[64].setRotationPoint(-111F, -40F, 0F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 43, 10, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[65].setRotationPoint(-111F, -50F, 0F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 43, 23, 35, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 203
		bodyModel[66].setRotationPoint(-111F, -8F, 0F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 23, 23, 35, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[67].setRotationPoint(-68F, -8F, 0F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 23, 14, 31, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 205
		bodyModel[68].setRotationPoint(-68F, -22F, 0F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 43, 17, 35, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -4F, 0F, 0F, -3F, 0F, 11F, 0F, 0F, 6F, 0F, 0F, -7F, -3F, 0F, 0F, -0.8F); // Box 206
		bodyModel[69].setRotationPoint(-45F, -8F, 0F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 43, 14, 32, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 0F); // Box 207
		bodyModel[70].setRotationPoint(-45F, -22F, 0F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 52, 16, 31, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -11F, 0F, 0F, 0F); // Box 208
		bodyModel[71].setRotationPoint(-2F, -25F, 0F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 37, 13, 23, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -10F, 0F, 0F, -3F); // Box 209
		bodyModel[72].setRotationPoint(50F, -25F, 0F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 23, 18, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 210
		bodyModel[73].setRotationPoint(-68F, -40F, 0F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 43, 15, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 3F, 0F); // Box 211
		bodyModel[74].setRotationPoint(-45F, -40F, 0F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 52, 15, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 212
		bodyModel[75].setRotationPoint(-2F, -40F, 12F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 37, 15, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -3F, 0F, 0F, 0F); // Box 213
		bodyModel[76].setRotationPoint(50F, -40F, 0F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 26, 19, 31, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -6F, 0F, 10F, 0F, 0F, 11F, 0F, 0F, 0F, 0F, 0F, -5F, -4F); // Box 214
		bodyModel[77].setRotationPoint(-193F, -8F, 0F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 52, 11, 32, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, -12F, 0F, 0F, -1F, 0F, 13F, 0F, 0F, 6F, 0F, 0F, -4F, -13F, 0F, 0F, 0F); // Box 217
		bodyModel[78].setRotationPoint(-2F, -9F, 0F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 23, 10, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 218
		bodyModel[79].setRotationPoint(-68F, -50F, 0F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 43, 10, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		bodyModel[80].setRotationPoint(-45F, -50F, 0F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 37, 10, 20, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -7F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, 5F, 0F, 0F, 0F, -11F, 0F, 0F, -1F); // Box 220
		bodyModel[81].setRotationPoint(50F, -12F, 0F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 52, 10, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 221
		bodyModel[82].setRotationPoint(-2F, -50F, 12F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 37, 10, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 222
		bodyModel[83].setRotationPoint(50F, -50F, 0F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 56, 7, 15, 0F,0F, -2F, -1F, 0F, -1F, -6F, 0F, 0F, -9F, 0F, -1F, -14F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 223
		bodyModel[84].setRotationPoint(-167F, -57F, 7F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 43, 7, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[85].setRotationPoint(-111F, -57F, 0F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 66, 7, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		bodyModel[86].setRotationPoint(-68F, -57F, 0F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 52, 7, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
		bodyModel[87].setRotationPoint(-2F, -57F, 12F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 37, 7, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 227
		bodyModel[88].setRotationPoint(50F, -57F, 0F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 11, 4, 11, 0F,0F, 0F, 0F, -10.9999F, 0F, 0F, -10.9999F, 0F, -9.9999F, 0F, 0F, -9.9999F, 0F, 0F, -9.9999F, 0F, 0F, -9.9999F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 230
		bodyModel[89].setRotationPoint(-193F, -44F, 10F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 23, 14, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 231
		bodyModel[90].setRotationPoint(87F, -40F, 0F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 23, 10, 20, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 234
		bodyModel[91].setRotationPoint(87F, -50F, 0F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 23, 10, 18, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, -3F, -8F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, 0F, 0F); // Box 237
		bodyModel[92].setRotationPoint(87F, -60F, 0F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 23, 13, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -20F, 0F, 0F, -7F); // Box 240
		bodyModel[93].setRotationPoint(87F, -26F, 0F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 23, 14, 13, 0F,0F, 0F, 0F, 0F, -1.9999F, 0F, 0F, -1.9999F, -12.9999F, 0F, 0F, 0F, 0F, 1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, -12.9999F, 0F, -2.9999F, -3.9999F); // Box 241
		bodyModel[94].setRotationPoint(87F, -13F, 0F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 56, 1, 13, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -5F); // Box 278
		bodyModel[95].setRotationPoint(-167F, -57F, 0F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 284
		bodyModel[96].setRotationPoint(-182F, -50F, 15F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 285
		bodyModel[97].setRotationPoint(-188F, -50F, 15F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F); // Box 286
		bodyModel[98].setRotationPoint(-193F, -50F, 10F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 287
		bodyModel[99].setRotationPoint(-188F, -50F, 2F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 288
		bodyModel[100].setRotationPoint(-190F, -50F, 0F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F,0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 289
		bodyModel[101].setRotationPoint(-190F, -50F, 0F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 290
		bodyModel[102].setRotationPoint(-182F, -54F, 0F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F); // Box 291
		bodyModel[103].setRotationPoint(-182F, -54F, 7F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F); // Box 292
		bodyModel[104].setRotationPoint(-175F, -55F, 7F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 293
		bodyModel[105].setRotationPoint(-175F, -55F, 0F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 294
		bodyModel[106].setRotationPoint(-182F, -54F, 0F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 295
		bodyModel[107].setRotationPoint(-175F, -55F, 0F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 5F); // Box 296
		bodyModel[108].setRotationPoint(-175F, -50F, 15F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 5F); // Box 297
		bodyModel[109].setRotationPoint(-182F, -50F, 15F);

		bodyModel[110].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 377
		bodyModel[110].setRotationPoint(0F, 12F, -1F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 28, 32, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 378
		bodyModel[111].setRotationPoint(-2F, -57F, 0F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 8, 32, 8, 0F,0F, 0F, 0F, 0F, 0F, -7.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7.9999F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 379
		bodyModel[112].setRotationPoint(26F, -57F, 4F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 8, 32, 8, 0F,0F, 0F, -7.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 380
		bodyModel[113].setRotationPoint(42F, -57F, 4F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 56, 20, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 389
		bodyModel[114].setRotationPoint(-163F, -76F, -3F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 56, 20, 5, 0F,-5F, 0F, 0F, -18F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -18F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 390
		bodyModel[115].setRotationPoint(-163F, -76F, -8F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 56, 20, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -18F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -18F, -0.5F, 0F, -5F, 0F, 0F); // Box 391
		bodyModel[116].setRotationPoint(-163F, -76F, 3F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 56, 5, 6, 0F,-5F, 0F, 0F, -18F, 0F, 0F, -18F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 392
		bodyModel[117].setRotationPoint(-163F, -81F, -3F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 56, 5, 5, 0F,-4.9999F, 0F, -4.9999F, -17.9999F, 0F, -4.9999F, -17.9999F, 0F, 0F, -4.9999F, 0F, 0F, -4.9999F, 0F, 0F, -17.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 393
		bodyModel[118].setRotationPoint(-163F, -81F, -8F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 56, 5, 5, 0F,-4.9999F, 0F, 0F, -17.9999F, 0F, 0F, -17.9999F, 0F, -4.9999F, -4.9999F, 0F, -4.9999F, 0F, 0F, 0F, 0F, 0F, 0F, -17.9999F, 0F, 0F, -4.9999F, 0F, 0F); // Box 394
		bodyModel[119].setRotationPoint(-163F, -81F, 3F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 6, 11, 42, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 490
		bodyModel[120].setRotationPoint(-193F, -40F, -21F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 6, 3, 42, 0F,0F, 0F, -9F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -9F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 491
		bodyModel[121].setRotationPoint(-193F, -43F, -21F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 13, 10, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 726
		bodyModel[122].setRotationPoint(28.25F, -56.5F, -5F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 12, 8, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 727
		bodyModel[123].setRotationPoint(29.25F, -55.5F, -4F);

		bodyModel[124].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 728
		bodyModel[124].setRotationPoint(28.25F, -44.5F, -5F);
		bodyModel[124].rotateAngleZ = 0.10471976F;

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 729
		bodyModel[125].setRotationPoint(28.25F, -44.5F, -5F);
		bodyModel[125].rotateAngleZ = 0.10471976F;

		bodyModel[126].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 730
		bodyModel[126].setRotationPoint(28.25F, -44.5F, 4F);
		bodyModel[126].rotateAngleZ = 0.10471976F;

		bodyModel[127].addShapeBox(0F, 1F, 0F, 10, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 731
		bodyModel[127].setRotationPoint(28.25F, -44.5F, -5F);
		bodyModel[127].rotateAngleZ = 0.10471976F;

		bodyModel[128].addShapeBox(9F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 732
		bodyModel[128].setRotationPoint(28.25F, -44.5F, -5F);
		bodyModel[128].rotateAngleZ = 0.10471976F;
	}

	private void initnoseModel_1()
	{
		noseModel[0] = new ModelRendererTurbo(this, 713, 1, textureX, textureY); // Box 6
		noseModel[1] = new ModelRendererTurbo(this, 817, 1, textureX, textureY); // Box 7
		noseModel[2] = new ModelRendererTurbo(this, 929, 1, textureX, textureY); // Box 8
		noseModel[3] = new ModelRendererTurbo(this, 1697, 49, textureX, textureY); // Box 24
		noseModel[4] = new ModelRendererTurbo(this, 569, 1, textureX, textureY); // Box 25
		noseModel[5] = new ModelRendererTurbo(this, 993, 1, textureX, textureY); // Box 37
		noseModel[6] = new ModelRendererTurbo(this, 1169, 49, textureX, textureY); // Box 38
		noseModel[7] = new ModelRendererTurbo(this, 1609, 65, textureX, textureY); // Box 88
		noseModel[8] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 91
		noseModel[9] = new ModelRendererTurbo(this, 985, 297, textureX, textureY); // Box 215
		noseModel[10] = new ModelRendererTurbo(this, 1977, 161, textureX, textureY); // Box 216
		noseModel[11] = new ModelRendererTurbo(this, 561, 73, textureX, textureY); // Box 282
		noseModel[12] = new ModelRendererTurbo(this, 1177, 481, textureX, textureY); // Box 394
		noseModel[13] = new ModelRendererTurbo(this, 1401, 489, textureX, textureY); // Box 395
		noseModel[14] = new ModelRendererTurbo(this, 577, 465, textureX, textureY); // Box 396
		noseModel[15] = new ModelRendererTurbo(this, 1953, 233, textureX, textureY); // Box 397
		noseModel[16] = new ModelRendererTurbo(this, 449, 481, textureX, textureY); // Box 398
		noseModel[17] = new ModelRendererTurbo(this, 1177, 417, textureX, textureY); // Box 399

		noseModel[0].addShapeBox(0F, 0F, 0F, 28, 18, 23, 0F,0F, -4F, -11F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		noseModel[0].setRotationPoint(-221F, -40F, -23F);

		noseModel[1].addShapeBox(0F, 0F, 0F, 28, 14, 25, 0F,0F, 0F, -9F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		noseModel[1].setRotationPoint(-221F, -22F, -25F);

		noseModel[2].addShapeBox(0F, 0F, 0F, 10, 14, 18, 0F,0F, 0F, -7F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		noseModel[2].setRotationPoint(-231F, -22F, -18F);

		noseModel[3].addShapeBox(0F, 0F, 0F, 28, 14, 27, 0F,0F, 0F, -9F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -8F, 0F, 0F, 0F, 0F, 15F, 0F, 0F, 5F, 0F); // Box 24
		noseModel[3].setRotationPoint(-221F, -8F, -27F);

		noseModel[4].addShapeBox(0F, 0F, 0F, 10, 9, 18, 0F,0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -7F, 0F, 0F, 1F, 0F, 10F, 0F, 0F, 1F, 0F); // Box 25
		noseModel[4].setRotationPoint(-231F, -8F, -18F);

		noseModel[5].addShapeBox(0F, 0F, 0F, 4, 14, 11, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		noseModel[5].setRotationPoint(-235F, -22F, -11F);

		noseModel[6].addShapeBox(0F, 0F, 0F, 28, 4, 17, 0F,0F, -4F, -16F, 0F, 0F, -10F, 0F, -4F, -7F, 0F, -8F, -1F, 0F, 4F, -9F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 4F, -7F); // Box 38
		noseModel[6].setRotationPoint(-221F, -44F, -21F);

		noseModel[7].addShapeBox(0F, 0F, 0F, 28, 4, 11, 0F,0F, -4F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); // Box 88
		noseModel[7].setRotationPoint(-221F, -44F, -11F);

		noseModel[8].addShapeBox(0F, 0F, 0F, 4, 3, 11, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -6F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, -2F, 0F); // Box 91
		noseModel[8].setRotationPoint(-235F, -8F, -11F);

		noseModel[9].addShapeBox(0F, 0F, 0F, 28, 14, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -9F, 0F, 5F, 0F, 0F, 15F, 0F, 0F, 0F, 0F, 0F, -5F, -8F); // Box 215
		noseModel[9].setRotationPoint(-221F, -8F, 0F);

		noseModel[10].addShapeBox(0F, 0F, 0F, 10, 9, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 1F, 0F, 0F, 10F, 0F, 0F, 0F, 1F, 0F, -6F, -7F); // Box 216
		noseModel[10].setRotationPoint(-231F, -8F, 0F);

		noseModel[11].addShapeBox(0F, 0F, 0F, 4, 3, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -2F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, -2F, -6F); // Box 282
		noseModel[11].setRotationPoint(-235F, -8F, 0F);

		noseModel[12].addShapeBox(0F, 0F, 0F, 28, 18, 23, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -4F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F); // Box 394
		noseModel[12].setRotationPoint(-221F, -40F, 0F);

		noseModel[13].addShapeBox(0F, 0F, 0F, 28, 14, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F); // Box 395
		noseModel[13].setRotationPoint(-221F, -22F, 0F);

		noseModel[14].addShapeBox(0F, 0F, 0F, 10, 14, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F); // Box 396
		noseModel[14].setRotationPoint(-231F, -22F, 0F);

		noseModel[15].addShapeBox(0F, 0F, 0F, 4, 14, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 397
		noseModel[15].setRotationPoint(-235F, -22F, 0F);

		noseModel[16].addShapeBox(0F, 0F, 0F, 28, 4, 17, 0F,0F, -8F, -1F, 0F, -4F, -7F, 0F, 0F, -10F, 0F, -4F, -16F, 0F, 4F, -7F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 4F, -9F); // Box 398
		noseModel[16].setRotationPoint(-221F, -44F, 4F);

		noseModel[17].addShapeBox(0F, 0F, 0F, 28, 4, 11, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -6F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -6F); // Box 399
		noseModel[17].setRotationPoint(-221F, -44F, 0F);
	}

	private void inittailModel_1()
	{
		tailModel[0] = new ModelRendererTurbo(this, 1569, 1, textureX, textureY); // Box 41
		tailModel[1] = new ModelRendererTurbo(this, 249, 97, textureX, textureY); // Box 42
		tailModel[2] = new ModelRendererTurbo(this, 1801, 1, textureX, textureY); // Box 44
		tailModel[3] = new ModelRendererTurbo(this, 1497, 97, textureX, textureY); // Box 45
		tailModel[4] = new ModelRendererTurbo(this, 1113, 1, textureX, textureY); // Box 47
		tailModel[5] = new ModelRendererTurbo(this, 1689, 97, textureX, textureY); // Box 48
		tailModel[6] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 51
		tailModel[7] = new ModelRendererTurbo(this, 369, 105, textureX, textureY); // Box 52
		tailModel[8] = new ModelRendererTurbo(this, 1289, 105, textureX, textureY); // Box 53
		tailModel[9] = new ModelRendererTurbo(this, 1689, 1, textureX, textureY); // Box 54
		tailModel[10] = new ModelRendererTurbo(this, 1417, 1, textureX, textureY); // Box 55
		tailModel[11] = new ModelRendererTurbo(this, 793, 1, textureX, textureY); // Box 56
		tailModel[12] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 75
		tailModel[13] = new ModelRendererTurbo(this, 1721, 177, textureX, textureY); // Box 77
		tailModel[14] = new ModelRendererTurbo(this, 921, 41, textureX, textureY); // Box 78
		tailModel[15] = new ModelRendererTurbo(this, 985, 121, textureX, textureY); // Box 79
		tailModel[16] = new ModelRendererTurbo(this, 1233, 121, textureX, textureY); // Box 80
		tailModel[17] = new ModelRendererTurbo(this, 1785, 49, textureX, textureY); // Box 81
		tailModel[18] = new ModelRendererTurbo(this, 497, 65, textureX, textureY); // Box 82
		tailModel[19] = new ModelRendererTurbo(this, 1305, 81, textureX, textureY); // Box 83
		tailModel[20] = new ModelRendererTurbo(this, 905, 1, textureX, textureY); // Box 90
		tailModel[21] = new ModelRendererTurbo(this, 345, 337, textureX, textureY); // Box 232
		tailModel[22] = new ModelRendererTurbo(this, 1489, 337, textureX, textureY); // Box 233
		tailModel[23] = new ModelRendererTurbo(this, 417, 345, textureX, textureY); // Box 235
		tailModel[24] = new ModelRendererTurbo(this, 681, 345, textureX, textureY); // Box 236
		tailModel[25] = new ModelRendererTurbo(this, 321, 249, textureX, textureY); // Box 238
		tailModel[26] = new ModelRendererTurbo(this, 801, 345, textureX, textureY); // Box 239
		tailModel[27] = new ModelRendererTurbo(this, 913, 345, textureX, textureY); // Box 242
		tailModel[28] = new ModelRendererTurbo(this, 1201, 345, textureX, textureY); // Box 243
		tailModel[29] = new ModelRendererTurbo(this, 1329, 345, textureX, textureY); // Box 244
		tailModel[30] = new ModelRendererTurbo(this, 689, 225, textureX, textureY); // Box 246
		tailModel[31] = new ModelRendererTurbo(this, 1593, 417, textureX, textureY); // Box 266
		tailModel[32] = new ModelRendererTurbo(this, 465, 425, textureX, textureY); // Box 268
		tailModel[33] = new ModelRendererTurbo(this, 1505, 257, textureX, textureY); // Box 269
		tailModel[34] = new ModelRendererTurbo(this, 1, 361, textureX, textureY); // Box 270
		tailModel[35] = new ModelRendererTurbo(this, 1945, 369, textureX, textureY); // Box 271
		tailModel[36] = new ModelRendererTurbo(this, 713, 153, textureX, textureY); // Box 272
		tailModel[37] = new ModelRendererTurbo(this, 1481, 129, textureX, textureY); // Box 273
		tailModel[38] = new ModelRendererTurbo(this, 1201, 257, textureX, textureY); // Box 274
		tailModel[39] = new ModelRendererTurbo(this, 353, 97, textureX, textureY); // Box 281
		tailModel[40] = new ModelRendererTurbo(this, 377, 409, textureX, textureY); // Box 400
		tailModel[41] = new ModelRendererTurbo(this, 881, 185, textureX, textureY); // Box 401

		tailModel[0].addShapeBox(0F, 0F, 0F, 14, 14, 19, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -4F, 0F, 3F, 0F, 0F, 15F, 0F); // Box 41
		tailModel[0].setRotationPoint(110F, -40F, -19F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 39, 13, 18, 0F,0F, 0F, 0F, 0F, 5F, -2F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -10F, -6F, 0F, -7F, 0F, 0F, 5F, 0F); // Box 42
		tailModel[1].setRotationPoint(124F, -41F, -18F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 14, 11, 19, 0F,0F, 0F, -3F, 0F, 2F, -3F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 44
		tailModel[2].setRotationPoint(110F, -51F, -19F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 39, 12, 18, 0F,0F, 0F, -2F, 0F, 5F, -2F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -2F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 45
		tailModel[3].setRotationPoint(124F, -53F, -18F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 14, 9, 16, 0F,0F, 0F, -8F, 0F, 2F, -9F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 47
		tailModel[4].setRotationPoint(110F, -60F, -16F);

		tailModel[5].addShapeBox(0F, 0F, 0F, 39, 9, 16, 0F,0F, 0F, -9F, 0F, 12F, -10F, 0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 48
		tailModel[5].setRotationPoint(124F, -62F, -16F);

		tailModel[6].addShapeBox(0F, 0F, 0F, 44, 12, 16, 0F,0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F); // Box 51
		tailModel[6].setRotationPoint(163F, -58F, -16F);

		tailModel[7].addShapeBox(0F, 0F, 0F, 44, 16, 16, 0F,0F, 0F, -10F, 0F, 9F, -6F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F); // Box 52
		tailModel[7].setRotationPoint(163F, -74F, -16F);

		tailModel[8].addShapeBox(0F, 0F, 0F, 44, 8, 16, 0F,0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -11F, -4F, 0F, -8F, 0F, 0F, 3F, 0F); // Box 53
		tailModel[8].setRotationPoint(163F, -46F, -16F);

		tailModel[9].addShapeBox(0F, 0F, 0F, 13, 11, 16, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		tailModel[9].setRotationPoint(207F, -65F, -16F);

		tailModel[10].addShapeBox(0F, 0F, 0F, 13, 5, 16, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -4F, -5F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 55
		tailModel[10].setRotationPoint(207F, -54F, -16F);

		tailModel[11].addShapeBox(0F, 0F, 0F, 2, 11, 11, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		tailModel[11].setRotationPoint(220F, -65F, -11F);

		tailModel[12].addShapeBox(0F, 0F, 0F, 21, 16, 78, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, -21F, 0F, 0F, -21F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 15F, 0F, 0F, 15F, 0F); // Box 75
		tailModel[12].setRotationPoint(176F, -90F, -83F);

		tailModel[13].addShapeBox(0F, 0F, 0F, 13, 16, 78, 0F,0F, -2F, 0F, 0F, 1F, 0F, 0F, -21F, 0F, 0F, -24F, 0F, 0F, -10F, 1F, 0F, -7F, 1F, 0F, 15F, 0F, 0F, 12F, 0F); // Box 77
		tailModel[13].setRotationPoint(163F, -90F, -83F);

		tailModel[14].addShapeBox(0F, 0F, 0F, 17, 16, 10, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		tailModel[14].setRotationPoint(173F, -90F, -93F);

		tailModel[15].addShapeBox(0F, 0F, 0F, 17, 52, 10, 0F,-4F, 0F, -18F, -4F, 0F, -18F, -4F, 0F, 10F, -4F, 0F, 10F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 79
		tailModel[15].setRotationPoint(173F, -142F, -93F);

		tailModel[16].addShapeBox(0F, 0F, 0F, 14, 52, 10, 0F,-9F, -8F, -17F, 4F, 0F, -18F, 4F, 0F, 10F, -9F, -8F, 9F, 0F, 0F, -8F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F); // Box 80
		tailModel[16].setRotationPoint(159F, -142F, -93F);

		tailModel[17].addShapeBox(0F, 0F, 0F, 14, 16, 10, 0F,0F, 0F, -8F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 81
		tailModel[17].setRotationPoint(159F, -90F, -93F);

		tailModel[18].addShapeBox(0F, 0F, 0F, 14, 13, 10, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, -4F, -3F, 4F, 0F, -2F, 4F, 0F, -6F, -3F, -4F, -5F); // Box 82
		tailModel[18].setRotationPoint(159F, -74F, -93F);

		tailModel[19].addShapeBox(0F, 0F, 0F, 17, 13, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, -6F, -4F, 0F, -6F); // Box 83
		tailModel[19].setRotationPoint(173F, -74F, -93F);

		tailModel[20].addShapeBox(0F, 0F, 0F, 2, 5, 11, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, -3F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 90
		tailModel[20].setRotationPoint(220F, -54F, -11F);

		tailModel[21].addShapeBox(0F, 0F, 0F, 14, 14, 19, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 15F, 0F, 0F, 3F, 0F, 0F, -2F, -4F, 0F, 0F, -1F); // Box 232
		tailModel[21].setRotationPoint(110F, -40F, 0F);

		tailModel[22].addShapeBox(0F, 0F, 0F, 39, 13, 18, 0F,0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, -2F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -7F, 0F, 0F, -10F, -6F, 0F, 0F, -3F); // Box 233
		tailModel[22].setRotationPoint(124F, -41F, 0F);

		tailModel[23].addShapeBox(0F, 0F, 0F, 14, 11, 19, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 0F); // Box 235
		tailModel[23].setRotationPoint(110F, -51F, 0F);

		tailModel[24].addShapeBox(0F, 0F, 0F, 39, 12, 18, 0F,0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, -2F, 0F, 0F, 0F); // Box 236
		tailModel[24].setRotationPoint(124F, -53F, 0F);

		tailModel[25].addShapeBox(0F, 0F, 0F, 14, 9, 16, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -9F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 238
		tailModel[25].setRotationPoint(110F, -60F, 0F);

		tailModel[26].addShapeBox(0F, 0F, 0F, 39, 9, 16, 0F,0F, 0F, 0F, 0F, 12F, 0F, 0F, 12F, -10F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 239
		tailModel[26].setRotationPoint(124F, -62F, 0F);

		tailModel[27].addShapeBox(0F, 0F, 0F, 44, 12, 16, 0F,0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F); // Box 242
		tailModel[27].setRotationPoint(163F, -58F, 0F);

		tailModel[28].addShapeBox(0F, 0F, 0F, 44, 16, 16, 0F,0F, 0F, 0F, 0F, 9F, 0F, 0F, 9F, -6F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F); // Box 243
		tailModel[28].setRotationPoint(163F, -74F, 0F);

		tailModel[29].addShapeBox(0F, 0F, 0F, 44, 8, 16, 0F,0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -8F, 0F, 0F, -11F, -4F, 0F, 0F, -4F); // Box 244
		tailModel[29].setRotationPoint(163F, -46F, 0F);

		tailModel[30].addShapeBox(0F, 0F, 0F, 13, 5, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, -4F, -5F, 0F, 0F, -4F); // Box 246
		tailModel[30].setRotationPoint(207F, -54F, 0F);

		tailModel[31].addShapeBox(0F, 0F, 0F, 21, 16, 78, 0F,0F, -21F, 0F, 0F, -21F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 15F, 0F, 0F, 15F, 0F, 0F, -7F, 0F, 0F, -7F, 0F); // Box 266
		tailModel[31].setRotationPoint(176F, -90F, 5F);

		tailModel[32].addShapeBox(0F, 0F, 0F, 13, 16, 78, 0F,0F, -24F, 0F, 0F, -21F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 12F, 0F, 0F, 15F, 0F, 0F, -7F, 1F, 0F, -10F, 1F); // Box 268
		tailModel[32].setRotationPoint(163F, -90F, 5F);

		tailModel[33].addShapeBox(0F, 0F, 0F, 17, 16, 10, 0F,0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 269
		tailModel[33].setRotationPoint(173F, -90F, 83F);

		tailModel[34].addShapeBox(0F, 0F, 0F, 17, 52, 10, 0F,-4F, 0F, 10F, -4F, 0F, 10F, -4F, 0F, -18F, -4F, 0F, -18F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 270
		tailModel[34].setRotationPoint(173F, -142F, 83F);

		tailModel[35].addShapeBox(0F, 0F, 0F, 14, 52, 10, 0F,-9F, -8F, 9F, 4F, 0F, 10F, 4F, 0F, -18F, -9F, -8F, -17F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -8F); // Box 271
		tailModel[35].setRotationPoint(159F, -142F, 83F);

		tailModel[36].addShapeBox(0F, 0F, 0F, 14, 16, 10, 0F,0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -8F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 272
		tailModel[36].setRotationPoint(159F, -90F, 83F);

		tailModel[37].addShapeBox(0F, 0F, 0F, 14, 13, 10, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -3F, -4F, -5F, 4F, 0F, -6F, 4F, 0F, -2F, -3F, -4F, -3F); // Box 273
		tailModel[37].setRotationPoint(159F, -74F, 83F);

		tailModel[38].addShapeBox(0F, 0F, 0F, 17, 13, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -6F, -4F, 0F, -6F, -4F, 0F, -2F, -4F, 0F, -2F); // Box 274
		tailModel[38].setRotationPoint(173F, -74F, 83F);

		tailModel[39].addShapeBox(0F, 0F, 0F, 2, 5, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F, -3F, 0F, -4F, 0F); // Box 281
		tailModel[39].setRotationPoint(220F, -54F, 0F);

		tailModel[40].addShapeBox(0F, 0F, 0F, 13, 11, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 400
		tailModel[40].setRotationPoint(207F, -65F, 0F);

		tailModel[41].addShapeBox(0F, 0F, 0F, 2, 11, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 401
		tailModel[41].setRotationPoint(220F, -65F, 0F);
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 1753, 105, textureX, textureY); // Box 57
		leftWingModel[1] = new ModelRendererTurbo(this, 1041, 105, textureX, textureY); // Box 58
		leftWingModel[2] = new ModelRendererTurbo(this, 1361, 105, textureX, textureY); // Box 59
		leftWingModel[3] = new ModelRendererTurbo(this, 97, 113, textureX, textureY); // Box 60
		leftWingModel[4] = new ModelRendererTurbo(this, 785, 113, textureX, textureY); // Box 61
		leftWingModel[5] = new ModelRendererTurbo(this, 1585, 113, textureX, textureY); // Box 62
		leftWingModel[6] = new ModelRendererTurbo(this, 409, 121, textureX, textureY); // Box 63
		leftWingModel[7] = new ModelRendererTurbo(this, 809, 121, textureX, textureY); // Box 64
		leftWingModel[8] = new ModelRendererTurbo(this, 1105, 121, textureX, textureY); // Box 65
		leftWingModel[9] = new ModelRendererTurbo(this, 161, 129, textureX, textureY); // Box 66
		leftWingModel[10] = new ModelRendererTurbo(this, 1449, 129, textureX, textureY); // Box 67
		leftWingModel[11] = new ModelRendererTurbo(this, 593, 121, textureX, textureY); // Box 69
		leftWingModel[12] = new ModelRendererTurbo(this, 1897, 129, textureX, textureY); // Box 71
		leftWingModel[13] = new ModelRendererTurbo(this, 729, 49, textureX, textureY); // Box 72
		leftWingModel[14] = new ModelRendererTurbo(this, 1265, 1, textureX, textureY); // Box 73
		leftWingModel[15] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 74
		leftWingModel[16] = new ModelRendererTurbo(this, 353, 161, textureX, textureY); // Box 641
		leftWingModel[17] = new ModelRendererTurbo(this, 129, 169, textureX, textureY); // Box 642
		leftWingModel[18] = new ModelRendererTurbo(this, 1353, 177, textureX, textureY); // Box 643
		leftWingModel[19] = new ModelRendererTurbo(this, 985, 185, textureX, textureY); // Box 644
		leftWingModel[20] = new ModelRendererTurbo(this, 593, 121, textureX, textureY); // Box 645
		leftWingModel[21] = new ModelRendererTurbo(this, 713, 121, textureX, textureY); // Box 646
		leftWingModel[22] = new ModelRendererTurbo(this, 1041, 121, textureX, textureY); // Box 647
		leftWingModel[23] = new ModelRendererTurbo(this, 1977, 129, textureX, textureY); // Box 648
		leftWingModel[24] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 649
		leftWingModel[25] = new ModelRendererTurbo(this, 801, 169, textureX, textureY); // Box 650
		leftWingModel[26] = new ModelRendererTurbo(this, 1097, 177, textureX, textureY); // Box 651
		leftWingModel[27] = new ModelRendererTurbo(this, 297, 193, textureX, textureY); // Box 652
		leftWingModel[28] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 653
		leftWingModel[29] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 654
		leftWingModel[30] = new ModelRendererTurbo(this, 129, 201, textureX, textureY); // Box 655
		leftWingModel[31] = new ModelRendererTurbo(this, 681, 201, textureX, textureY); // Box 656
		leftWingModel[32] = new ModelRendererTurbo(this, 1577, 169, textureX, textureY); // Box 657
		leftWingModel[33] = new ModelRendererTurbo(this, 1465, 177, textureX, textureY); // Box 658
		leftWingModel[34] = new ModelRendererTurbo(this, 1833, 177, textureX, textureY); // Box 659
		leftWingModel[35] = new ModelRendererTurbo(this, 1665, 209, textureX, textureY); // Box 660
		leftWingModel[36] = new ModelRendererTurbo(this, 1617, 1, textureX, textureY); // Box 661
		leftWingModel[37] = new ModelRendererTurbo(this, 1441, 25, textureX, textureY); // Box 662
		leftWingModel[38] = new ModelRendererTurbo(this, 1377, 41, textureX, textureY); // Box 663
		leftWingModel[39] = new ModelRendererTurbo(this, 689, 1, textureX, textureY); // Box 664
		leftWingModel[40] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 665
		leftWingModel[41] = new ModelRendererTurbo(this, 793, 1, textureX, textureY); // Box 666
		leftWingModel[42] = new ModelRendererTurbo(this, 1993, 41, textureX, textureY); // Box 667
		leftWingModel[43] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 668
		leftWingModel[44] = new ModelRendererTurbo(this, 1057, 49, textureX, textureY); // Box 669
		leftWingModel[45] = new ModelRendererTurbo(this, 1249, 49, textureX, textureY); // Box 670
		leftWingModel[46] = new ModelRendererTurbo(this, 1377, 49, textureX, textureY); // Box 671
		leftWingModel[47] = new ModelRendererTurbo(this, 1993, 49, textureX, textureY); // Box 672
		leftWingModel[48] = new ModelRendererTurbo(this, 1801, 1, textureX, textureY); // Box 673
		leftWingModel[49] = new ModelRendererTurbo(this, 905, 1, textureX, textureY); // Box 674
		leftWingModel[50] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 675
		leftWingModel[51] = new ModelRendererTurbo(this, 921, 1, textureX, textureY); // Box 676
		leftWingModel[52] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 65
		leftWingModel[53] = new ModelRendererTurbo(this, 1849, 1, textureX, textureY); // Box 66
		leftWingModel[54] = new ModelRendererTurbo(this, 385, 49, textureX, textureY); // Box 112
		leftWingModel[55] = new ModelRendererTurbo(this, 1401, 49, textureX, textureY); // Box 113
		leftWingModel[56] = new ModelRendererTurbo(this, 1057, 57, textureX, textureY); // Box 114
		leftWingModel[57] = new ModelRendererTurbo(this, 385, 65, textureX, textureY); // Box 115
		leftWingModel[58] = new ModelRendererTurbo(this, 537, 65, textureX, textureY); // Box 116
		leftWingModel[59] = new ModelRendererTurbo(this, 1961, 1, textureX, textureY); // Box 117
		leftWingModel[60] = new ModelRendererTurbo(this, 969, 9, textureX, textureY); // Box 118
		leftWingModel[61] = new ModelRendererTurbo(this, 1569, 9, textureX, textureY); // Box 119
		leftWingModel[62] = new ModelRendererTurbo(this, 265, 57, textureX, textureY); // Box 961
		leftWingModel[63] = new ModelRendererTurbo(this, 1161, 1, textureX, textureY); // Box 962
		leftWingModel[64] = new ModelRendererTurbo(this, 1273, 49, textureX, textureY); // Box 963
		leftWingModel[65] = new ModelRendererTurbo(this, 1265, 1, textureX, textureY); // Box 964
		leftWingModel[66] = new ModelRendererTurbo(this, 2025, 49, textureX, textureY); // Box 965
		leftWingModel[67] = new ModelRendererTurbo(this, 1953, 57, textureX, textureY); // Box 966
		leftWingModel[68] = new ModelRendererTurbo(this, 1081, 57, textureX, textureY); // Box 967
		leftWingModel[69] = new ModelRendererTurbo(this, 1417, 1, textureX, textureY); // Box 968
		leftWingModel[70] = new ModelRendererTurbo(this, 1489, 65, textureX, textureY); // Box 969
		leftWingModel[71] = new ModelRendererTurbo(this, 409, 65, textureX, textureY); // Box 1003
		leftWingModel[72] = new ModelRendererTurbo(this, 1465, 1, textureX, textureY); // Box 1079
		leftWingModel[73] = new ModelRendererTurbo(this, 2041, 129, textureX, textureY); // Import Box69
		leftWingModel[74] = new ModelRendererTurbo(this, 1289, 137, textureX, textureY); // Import Box70
		leftWingModel[75] = new ModelRendererTurbo(this, 1297, 137, textureX, textureY); // Import Box71
		leftWingModel[76] = new ModelRendererTurbo(this, 1305, 137, textureX, textureY); // Import Box72
		leftWingModel[77] = new ModelRendererTurbo(this, 1353, 209, textureX, textureY); // Import Box162
		leftWingModel[78] = new ModelRendererTurbo(this, 1833, 209, textureX, textureY); // Import Box163
		leftWingModel[79] = new ModelRendererTurbo(this, 1913, 209, textureX, textureY); // Import Box164
		leftWingModel[80] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); // Import Box165
		leftWingModel[81] = new ModelRendererTurbo(this, 761, 121, textureX, textureY); // Import Box166
		leftWingModel[82] = new ModelRendererTurbo(this, 1737, 129, textureX, textureY); // Import Box167
		leftWingModel[83] = new ModelRendererTurbo(this, 801, 201, textureX, textureY); // Import Box168
		leftWingModel[84] = new ModelRendererTurbo(this, 393, 225, textureX, textureY); // Import Box169
		leftWingModel[85] = new ModelRendererTurbo(this, 1609, 169, textureX, textureY); // Import Box170
		leftWingModel[86] = new ModelRendererTurbo(this, 1713, 209, textureX, textureY); // Import Box171
		leftWingModel[87] = new ModelRendererTurbo(this, 1353, 137, textureX, textureY); // Import Box172
		leftWingModel[88] = new ModelRendererTurbo(this, 593, 153, textureX, textureY); // Import Box173
		leftWingModel[89] = new ModelRendererTurbo(this, 2041, 193, textureX, textureY); // Box 180
		leftWingModel[90] = new ModelRendererTurbo(this, 1097, 209, textureX, textureY); // Box 181
		leftWingModel[91] = new ModelRendererTurbo(this, 1993, 209, textureX, textureY); // Box 182
		leftWingModel[92] = new ModelRendererTurbo(this, 2001, 209, textureX, textureY); // Box 183
		leftWingModel[93] = new ModelRendererTurbo(this, 2009, 209, textureX, textureY); // Box 184
		leftWingModel[94] = new ModelRendererTurbo(this, 2017, 209, textureX, textureY); // Box 185
		leftWingModel[95] = new ModelRendererTurbo(this, 1433, 41, textureX, textureY); // Box 802
		leftWingModel[96] = new ModelRendererTurbo(this, 809, 49, textureX, textureY); // Box 803
		leftWingModel[97] = new ModelRendererTurbo(this, 1689, 73, textureX, textureY); // Box 804
		leftWingModel[98] = new ModelRendererTurbo(this, 2041, 81, textureX, textureY); // Box 805

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 49, 21, 50, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 15F, 0F, 0F, 16F, 0F); // Box 57
		leftWingModel[0].setRotationPoint(-68F, -72F, -50F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 21, 21, 50, 0F,0F, -8F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -24F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 16F, 0F, 0F, 11F, 0F); // Box 58
		leftWingModel[1].setRotationPoint(-89F, -72F, -50F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 34, 21, 50, 0F,0F, 0F, 0F, -6F, -12F, 0F, 0F, -28F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, -6F, -8F, 0F, 0F, 8F, 0F, 0F, 15F, 0F); // Box 59
		leftWingModel[2].setRotationPoint(-19F, -72F, -50F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 49, 20, 32, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, 0F); // Box 60
		leftWingModel[3].setRotationPoint(-68F, -78F, -82F);

		leftWingModel[4].addShapeBox(0F, 0F, 0F, 28, 20, 32, 0F,0F, -1F, 0F, -8F, -11F, 0F, 0F, -18F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, -8F, -7F, 0F, 0F, -1F, 0F, 0F, 7F, 0F); // Box 61
		leftWingModel[4].setRotationPoint(-19F, -78F, -82F);

		leftWingModel[5].addShapeBox(0F, 0F, 0F, 21, 20, 32, 0F,-3F, -8F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -14F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 2F, 0F); // Box 62
		leftWingModel[5].setRotationPoint(-89F, -78F, -82F);

		leftWingModel[6].addShapeBox(0F, 0F, 0F, 49, 16, 84, 0F,0F, 1F, 0F, -13F, 1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F); // Box 63
		leftWingModel[6].setRotationPoint(-68F, -79F, -166F);

		leftWingModel[7].addShapeBox(0F, 0F, 0F, 36, 17, 100, 0F,0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -10F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		leftWingModel[7].setRotationPoint(-68F, -80F, -266F);

		leftWingModel[8].addShapeBox(0F, 0F, 0F, 18, 16, 84, 0F,-3F, -6F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -9F, 0F, -3F, -4F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 2F, 0F); // Box 65
		leftWingModel[8].setRotationPoint(-86F, -79F, -166F);

		leftWingModel[9].addShapeBox(0F, 0F, 0F, 15, 17, 100, 0F,-4F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -4F, -8F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 66
		leftWingModel[9].setRotationPoint(-83F, -80F, -266F);

		leftWingModel[10].addShapeBox(0F, 0F, 0F, 21, 16, 84, 0F,0F, 1F, 0F, 0F, -9F, 0F, 12F, -12F, 0F, -13F, -2F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 12F, -2F, 0F, -13F, 5F, 0F); // Box 67
		leftWingModel[10].setRotationPoint(-32F, -79F, -166F);

		leftWingModel[11].addShapeBox(0F, 0F, 0F, 26, 13, 60, 0F,0F, -1F, 0F, -5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		leftWingModel[11].setRotationPoint(-68F, -80F, -326F);

		leftWingModel[12].addShapeBox(0F, 0F, 0F, 9, 13, 60, 0F,0F, -5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 2F, -4F, 0F, 0F, -6F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 2F, -4F, 0F); // Box 71
		leftWingModel[12].setRotationPoint(-77F, -80F, -326F);

		leftWingModel[13].addShapeBox(0F, 0F, 0F, 21, 10, 11, 0F,-6F, -4F, 0F, -6F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -4F, 0F, -6F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		leftWingModel[13].setRotationPoint(-68F, -79F, -337F);

		leftWingModel[14].addShapeBox(0F, 0F, 0F, 9, 10, 11, 0F,-6F, -4F, -4F, 6F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -6F, -4F, -4F, 6F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 73
		leftWingModel[14].setRotationPoint(-77F, -79F, -337F);

		leftWingModel[15].addShapeBox(0F, 0F, 0F, 14, 10, 11, 0F,6F, -4F, 0F, -6F, -5F, -4F, 0F, -5F, 0F, 0F, 0F, 0F, 6F, -4F, 0F, -6F, -3F, -4F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 74
		leftWingModel[15].setRotationPoint(-47F, -79F, -337F);

		leftWingModel[16].addShapeBox(0F, 0F, 0F, 40, 15, 15, 0F,0F, 0F, 2F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, -2.5F, 0F, -2.75F, -3F, 0F, 3.75F, 0F, 0F, 2.5F, 0F); // Box 641
		leftWingModel[16].setRotationPoint(-103F, -65.5F, -80.5F);

		leftWingModel[17].addShapeBox(0F, 0F, 0F, 40, 15, 15, 0F,0F, -2.5F, -2.5F, 0F, -3.75F, -4F, 0F, -0.25F, 0F, 0F, 1.25F, 0F, 0F, 0F, 2F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 642
		leftWingModel[17].setRotationPoint(-103F, -80.5F, -80.5F);

		leftWingModel[18].addShapeBox(0F, 0F, 0F, 40, 15, 15, 0F,0F, 1.25F, 0F, 0F, -0.25F, 0F, 0F, -4.25F, -4F, 0F, -2.5F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 2F); // Box 643
		leftWingModel[18].setRotationPoint(-103F, -80.5F, -65.5F);

		leftWingModel[19].addShapeBox(0F, 0F, 0F, 40, 15, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 2F, 0F, 2.5F, 0F, 0F, 3.75F, 0F, 0F, -2.75F, -3F, 0F, -2.5F, -2.5F); // Box 644
		leftWingModel[19].setRotationPoint(-103F, -65.5F, -65.5F);

		leftWingModel[20].addShapeBox(0F, 0F, 0F, 13, 15, 15, 0F,0F, 0F, 1.25F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.25F, -4.25F, 0F, -2.5F, -2.5F, 0F, 2.5F, 0F, 0F, 1.25F, 0F); // Box 645
		leftWingModel[20].setRotationPoint(-116F, -65.5F, -80.5F);

		leftWingModel[21].addShapeBox(0F, 0F, 0F, 7, 15, 15, 0F,0F, 0F, -2.25F, 0F, 0F, 1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.75F, -6F, 0F, -3.25F, -4.25F, 0F, 1.25F, 0F, 0F, -2.25F, 0F); // Box 646
		leftWingModel[21].setRotationPoint(-123F, -65.5F, -80.5F);

		leftWingModel[22].addShapeBox(0F, 0F, 0F, 7, 15, 15, 0F,0F, -5.75F, -6F, 0F, -3.25F, -4.25F, 0F, 1F, 0F, 0F, -2.75F, 0F, 0F, 0F, -2.25F, 0F, 0F, 1.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 647
		leftWingModel[22].setRotationPoint(-123F, -80.5F, -80.5F);

		leftWingModel[23].addShapeBox(0F, 0F, 0F, 13, 15, 15, 0F,0F, -3.25F, -4.25F, 0F, -2.5F, -2.5F, 0F, 1.25F, 0F, 0F, 1F, 0F, 0F, 0F, 1.25F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 648
		leftWingModel[23].setRotationPoint(-116F, -80.5F, -80.5F);

		leftWingModel[24].addShapeBox(0F, 0F, 0F, 30, 15, 15, 0F,0F, 0F, -0.25F, 0F, -4.75F, -5.25F, 0F, -4.25F, 0F, 0F, 0F, 0F, 0F, -2.75F, -3F, 0F, -4.25F, -6.75F, 0F, 1F, 0F, 0F, 3.75F, 0F); // Box 649
		leftWingModel[24].setRotationPoint(-63F, -65.5F, -80.5F);

		leftWingModel[25].addShapeBox(0F, 0F, 0F, 30, 11, 15, 0F,0F, 0.25F, -4F, 0F, -8F, -6.75F, 0F, -4.25F, 0F, 0F, 3.75F, 0F, 0F, 0F, -0.25F, 0F, 4.75F, -5.25F, 0F, 4.25F, 0F, 0F, 0F, 0F); // Box 650
		leftWingModel[25].setRotationPoint(-63F, -76.5F, -80.5F);

		leftWingModel[26].addShapeBox(0F, 0F, 0F, 30, 11, 15, 0F,0F, 3.75F, 0F, 0F, -4.25F, 0F, 0F, -8F, -6.75F, 0F, -0.25F, -4F, 0F, 0F, 0F, 0F, 4.25F, 0F, 0F, 4.75F, -5.25F, 0F, 0F, -0.25F); // Box 651
		leftWingModel[26].setRotationPoint(-63F, -76.5F, -65.5F);

		leftWingModel[27].addShapeBox(0F, 0F, 0F, 30, 15, 15, 0F,0F, 0F, 0F, 0F, -4.25F, 0F, 0F, -4.75F, -5.25F, 0F, 0F, -0.25F, 0F, 3.75F, 0F, 0F, 1F, 0F, 0F, -4.25F, -6.75F, 0F, -2.75F, -3F); // Box 652
		leftWingModel[27].setRotationPoint(-63F, -65.5F, -65.5F);

		leftWingModel[28].addShapeBox(0F, 0F, 0F, 27, 11, 9, 0F,0F, 0F, 0.75F, 0F, 0F, -7.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.75F, -0.75F, 0F, -9.75F, -8F, 0F, -8.75F, 0F, 0F, 0.5F, 0F); // Box 653
		leftWingModel[28].setRotationPoint(-33F, -61F, -74.5F);

		leftWingModel[29].addShapeBox(0F, 0F, 0F, 27, 11, 9, 0F,0F, -3.5F, -0.75F, 0F, -10.25F, -8.25F, 0F, -9.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0.75F, 0F, 0F, -7.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 654
		leftWingModel[29].setRotationPoint(-33F, -72F, -74.5F);

		leftWingModel[30].addShapeBox(0F, 0F, 0F, 27, 11, 9, 0F,0F, 0.25F, 0F, 0F, -9.25F, 0F, 0F, -10.25F, -8.25F, 0F, -3.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7.75F, 0F, 0F, 0.75F); // Box 655
		leftWingModel[30].setRotationPoint(-33F, -72F, -65.5F);

		leftWingModel[31].addShapeBox(0F, 0F, 0F, 27, 11, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7.75F, 0F, 0F, 0.75F, 0F, 0.5F, 0F, 0F, -8.75F, 0F, 0F, -9.75F, -8F, 0F, -4.75F, -0.75F); // Box 656
		leftWingModel[31].setRotationPoint(-33F, -61F, -65.5F);

		leftWingModel[32].addShapeBox(0F, 0F, 0F, 7, 15, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F, -2.25F, 0F, -2.25F, 0F, 0F, 1.25F, 0F, 0F, -3.25F, -4.25F, 0F, -5.75F, -6F); // Box 657
		leftWingModel[32].setRotationPoint(-123F, -65.5F, -65.5F);

		leftWingModel[33].addShapeBox(0F, 0F, 0F, 13, 15, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1.25F, 0F, 1.25F, 0F, 0F, 2.5F, 0F, 0F, -2.5F, -2.5F, 0F, -3.25F, -4.25F); // Box 658
		leftWingModel[33].setRotationPoint(-116F, -65.5F, -65.5F);

		leftWingModel[34].addShapeBox(0F, 0F, 0F, 7, 15, 15, 0F,0F, -2.75F, 0F, 0F, 1F, 0F, 0F, -3.25F, -4.25F, 0F, -5.75F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F, -2.25F); // Box 659
		leftWingModel[34].setRotationPoint(-123F, -80.5F, -65.5F);

		leftWingModel[35].addShapeBox(0F, 0F, 0F, 13, 15, 15, 0F,0F, 1F, 0F, 0F, 1.25F, 0F, 0F, -2.5F, -2.5F, 0F, -3.25F, -4.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1.25F); // Box 660
		leftWingModel[35].setRotationPoint(-116F, -80.5F, -65.5F);

		leftWingModel[36].addShapeBox(0F, 0F, 0F, 5, 4, 3, 0F,0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 1.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 661
		leftWingModel[36].setRotationPoint(-104F, -84.5F, -68.5F);

		leftWingModel[37].addShapeBox(0F, 0F, 0F, 13, 4, 3, 0F,0F, 0.5F, -0.25F, 0F, 0F, 0.5F, 0F, 1.25F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0.25F, 1.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 662
		leftWingModel[37].setRotationPoint(-99F, -84.5F, -68.5F);

		leftWingModel[38].addShapeBox(0F, 0F, 0F, 13, 4, 3, 0F,0F, 0F, 0.5F, 0F, -1.25F, 0.75F, 0F, -0.5F, 0F, 0F, 1.25F, 0F, 0F, 0F, 1.25F, 0F, 2F, 4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 663
		leftWingModel[38].setRotationPoint(-86F, -84.5F, -68.5F);

		leftWingModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.75F, -0.5F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 664
		leftWingModel[39].setRotationPoint(-105F, -85.5F, -68.5F);

		leftWingModel[40].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 665
		leftWingModel[40].setRotationPoint(-105F, -84.5F, -68.5F);

		leftWingModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 666
		leftWingModel[41].setRotationPoint(-105F, -82.5F, -68.5F);

		leftWingModel[42].addShapeBox(0F, 0F, 0F, 13, 4, 3, 0F,0F, 0.75F, 0.75F, 0F, -2.25F, 0.25F, 0F, -1.75F, 0F, 0F, 1.5F, 0F, 0F, 0F, 4F, 0F, 2F, 4.25F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 667
		leftWingModel[42].setRotationPoint(-73F, -82.5F, -68.5F);

		leftWingModel[43].addShapeBox(0F, 0F, 0F, 22, 4, 3, 0F,0F, 0.75F, 0.25F, 0F, -6.75F, -1F, 0F, -6F, 0F, 0F, 1.25F, 0F, 0F, 0F, 5.25F, 0F, 3.5F, 1F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 668
		leftWingModel[43].setRotationPoint(-60F, -79.5F, -68.5F);

		leftWingModel[44].addShapeBox(0F, 0F, 0F, 22, 4, 3, 0F,0F, 1.25F, 0F, 0F, -6F, 0F, 0F, -7F, -1F, 0F, 0.75F, 0.25F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 3.75F, 1F, 0F, 0F, 5.25F); // Box 669
		leftWingModel[44].setRotationPoint(-60F, -79.5F, -65.5F);

		leftWingModel[45].addShapeBox(0F, 0F, 0F, 13, 4, 3, 0F,0F, 1.5F, 0F, 0F, -1.75F, 0F, 0F, -2.25F, 0.25F, 0F, 0.75F, 0.75F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 4.25F, 0F, 0F, 4F); // Box 670
		leftWingModel[45].setRotationPoint(-73F, -82.5F, -65.5F);

		leftWingModel[46].addShapeBox(0F, 0F, 0F, 13, 4, 3, 0F,0F, 1.25F, 0F, 0F, -0.5F, 0F, 0F, -1.25F, 0.75F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 4F, 0F, 0F, 1.25F); // Box 671
		leftWingModel[46].setRotationPoint(-86F, -84.5F, -65.5F);

		leftWingModel[47].addShapeBox(0F, 0F, 0F, 13, 4, 3, 0F,0F, 1.5F, 0F, 0F, 1.25F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 1.25F, 0F, 0F, 0F); // Box 672
		leftWingModel[47].setRotationPoint(-99F, -84.5F, -65.5F);

		leftWingModel[48].addShapeBox(0F, 0F, 0F, 5, 4, 3, 0F,0F, 1F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 673
		leftWingModel[48].setRotationPoint(-104F, -84.5F, -65.5F);

		leftWingModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.75F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 674
		leftWingModel[49].setRotationPoint(-105F, -85.5F, -65.5F);

		leftWingModel[50].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 675
		leftWingModel[50].setRotationPoint(-105F, -84.5F, -63.5F);

		leftWingModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 676
		leftWingModel[51].setRotationPoint(-105F, -82.5F, -65.5F);

		leftWingModel[52].addShapeBox(0F, 0F, 0F, 2, 4, 9, 0F,0F, -3.9999F, 0F, 0F, -2.7499F, 0.5F, 0F, 0.25F, -0.5F, 0F, -2.4999F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 65
		leftWingModel[52].setRotationPoint(-125F, -77.5F, -74F);

		leftWingModel[53].addShapeBox(0F, 0F, 0F, 2, 10, 7, 0F,0F, -1.9999F, -5.9999F, 0F, -0.75F, -5.4999F, 0F, -0.75F, -1.4999F, 0F, -1.9999F, -0.9999F, 0F, 0F, -2.9999F, 0F, 0F, -1.7499F, 0F, 0F, -0.9999F, 0F, 0F, -0.9999F); // Box 66
		leftWingModel[53].setRotationPoint(-125F, -75.5F, -80F);

		leftWingModel[54].addShapeBox(0F, 0F, 0F, 6, 3, 9, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		leftWingModel[54].setRotationPoint(-129F, -70F, -70.5F);

		leftWingModel[55].addShapeBox(0F, 0F, 0F, 6, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 113
		leftWingModel[55].setRotationPoint(-129F, -64F, -70.5F);

		leftWingModel[56].addShapeBox(0F, 0F, 0F, 10, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		leftWingModel[56].setRotationPoint(-139F, -66.5F, -69F);

		leftWingModel[57].addShapeBox(0F, 0F, 0F, 10, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		leftWingModel[57].setRotationPoint(-139F, -68.5F, -69F);

		leftWingModel[58].addShapeBox(0F, 0F, 0F, 10, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 116
		leftWingModel[58].setRotationPoint(-139F, -64.5F, -69F);

		leftWingModel[59].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 117
		leftWingModel[59].setRotationPoint(-142F, -66.5F, -69F);

		leftWingModel[60].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, -1.9999F, -1.9999F, 0F, 0F, -1.9999F, 0F, 0F, -1.9999F, 0F, -1.9999F, -1.9999F, 0F, 0F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9999F); // Box 118
		leftWingModel[60].setRotationPoint(-142F, -68.5F, -69F);

		leftWingModel[61].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, 0F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9999F, 0F, -1.9999F, -1.9999F, 0F, 0F, -1.9999F, 0F, 0F, -1.9999F, 0F, -1.9999F, -1.9999F); // Box 119
		leftWingModel[61].setRotationPoint(-142F, -64.5F, -69F);

		leftWingModel[62].addShapeBox(0F, 0F, 0F, 2, 10, 7, 0F,0F, -1.9999F, -0.9999F, 0F, -0.75F, -1.4999F, 0F, -0.75F, -5.4999F, 0F, -1.9999F, -5.9999F, 0F, 0F, -0.9999F, 0F, 0F, -0.9999F, 0F, 0F, -1.7499F, 0F, 0F, -2.9999F); // Box 961
		leftWingModel[62].setRotationPoint(-125F, -75.5F, -58F);

		leftWingModel[63].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.9999F, 0F, 0F, -3.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 962
		leftWingModel[63].setRotationPoint(-125F, -73.5F, -60F);

		leftWingModel[64].addShapeBox(0F, 0F, 0F, 2, 4, 9, 0F,0F, -2.4999F, -0.5F, 0F, 0.25F, -0.5F, 0F, -2.7499F, 0.5F, 0F, -3.9999F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 963
		leftWingModel[64].setRotationPoint(-125F, -77.5F, -66F);

		leftWingModel[65].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F,0F, -3.9999F, 0F, 0F, -3.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 964
		leftWingModel[65].setRotationPoint(-125F, -61.5F, -60F);

		leftWingModel[66].addShapeBox(0F, 0F, 0F, 2, 4, 9, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.4999F, -0.5F, 0F, 0.75F, -0.5F, 0F, -2.7499F, 0.5F, 0F, -3.9999F, 0F); // Box 965
		leftWingModel[66].setRotationPoint(-125F, -57.5F, -66F);

		leftWingModel[67].addShapeBox(0F, 0F, 0F, 2, 10, 7, 0F,0F, 0F, -0.9999F, 0F, 0F, -0.9999F, 0F, 0F, -1.7499F, 0F, 0F, -2.9999F, 0F, -1.9999F, -0.9999F, 0F, -0.75F, -1.4999F, 0F, -0.75F, -5.4999F, 0F, -1.9999F, -5.9999F); // Box 966
		leftWingModel[67].setRotationPoint(-125F, -65.5F, -58F);

		leftWingModel[68].addShapeBox(0F, 0F, 0F, 2, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3.9999F, 0F, 0F, -2.7499F, 0.5F, 0F, 0.75F, -0.5F, 0F, -2.4999F, -0.5F); // Box 967
		leftWingModel[68].setRotationPoint(-125F, -57.5F, -74F);

		leftWingModel[69].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.9999F, 0F, 0F, -3.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 968
		leftWingModel[69].setRotationPoint(-125F, -61.5F, -74F);

		leftWingModel[70].addShapeBox(0F, 0F, 0F, 2, 10, 7, 0F,0F, 0F, -2.9999F, 0F, 0F, -1.7499F, 0F, 0F, -0.9999F, 0F, 0F, -0.9999F, 0F, -1.9999F, -5.9999F, 0F, -0.75F, -5.4999F, 0F, -0.75F, -1.4999F, 0F, -1.9999F, -0.9999F); // Box 969
		leftWingModel[70].setRotationPoint(-125F, -65.5F, -80F);

		leftWingModel[71].addShapeBox(0F, 0F, 0F, 6, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1003
		leftWingModel[71].setRotationPoint(-129F, -67F, -70.5F);

		leftWingModel[72].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.9999F, 0F, 0F, -3.9999F, 0F); // Box 1079
		leftWingModel[72].setRotationPoint(-125F, -73.5F, -74F);

		leftWingModel[73].addShapeBox(0F, 0F, 0F, 2, 62, 1, 0F,0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 3F, 0F, 0F); // Import Box69
		leftWingModel[73].setRotationPoint(-80F, -71F, -217.5F);

		leftWingModel[74].addShapeBox(0F, 0F, 0F, 2, 62, 1, 0F,-15F, 0F, 0F, 15F, 0F, 0F, 16F, 0F, 0F, -15F, 0F, 0F, 3F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 4F, 0F, 0F); // Import Box70
		leftWingModel[74].setRotationPoint(-54F, -67F, -218.5F);

		leftWingModel[75].addShapeBox(0F, 0F, 0F, 2, 62, 1, 0F,26F, 0F, 0F, -26F, 0F, 0F, -26F, 0F, 0F, 26F, 0F, 0F, 4F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 3F, 0F, 0F); // Import Box71
		leftWingModel[75].setRotationPoint(-54F, -67F, -217.5F);

		leftWingModel[76].addShapeBox(0F, 0F, 0F, 2, 62, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 4F, 0F, 0F); // Import Box72
		leftWingModel[76].setRotationPoint(-80F, -71F, -218.5F);

		leftWingModel[77].addShapeBox(0F, 0F, 0F, 28, 13, 9, 0F,0F, -3F, -3F, 0F, -4F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F); // Import Box162
		leftWingModel[77].setRotationPoint(-91F, -12F, -223.5F);

		leftWingModel[78].addShapeBox(0F, 0F, 0F, 30, 13, 9, 0F,0F, -4F, -3F, -12F, -7F, -6F, 0F, -7F, 0F, 0F, -1F, 0F, 0F, 0F, -0.3F, -11F, 1F, -5F, 0F, 2F, 0F, 0F, 0F, 0F); // Import Box163
		leftWingModel[78].setRotationPoint(-63F, -12F, -223.5F);

		leftWingModel[79].addShapeBox(0F, 0F, 0F, 30, 13, 9, 0F,0F, -1F, 0F, 0F, -7F, 0F, -12F, -7F, -6F, 0F, -4F, -3F, 0F, 0F, 0F, 0F, 2F, 0F, -11F, 1F, -5F, 0F, 0F, -0.3F); // Import Box164
		leftWingModel[79].setRotationPoint(-63F, -12F, -214.5F);

		leftWingModel[80].addShapeBox(0F, 0F, 0F, 28, 13, 9, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -4F, -3F, 0F, -3F, -3F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F); // Import Box165
		leftWingModel[80].setRotationPoint(-91F, -12F, -214.5F);

		leftWingModel[81].addShapeBox(0F, 0F, 0F, 17, 13, 9, 0F,-6F, -3F, -6F, 0F, -3F, -3F, 0F, 0F, 0F, -6F, -1F, 0F, -5F, -5F, -4F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -7F, 0F); // Import Box166
		leftWingModel[81].setRotationPoint(-108F, -12F, -223.5F);

		leftWingModel[82].addShapeBox(0F, 0F, 0F, 17, 13, 9, 0F,-6F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, -6F, -3F, -6F, 0F, -7F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -5F, -5F, -4F); // Import Box167
		leftWingModel[82].setRotationPoint(-108F, -12F, -214.5F);

		leftWingModel[83].addShapeBox(0F, 0F, 0F, 28, 7, 9, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -6F, -3F, 0F, -2F, -5F, 0F, 0F, 0F, 0F, -5F, 0F); // Import Box168
		leftWingModel[83].setRotationPoint(-91F, -1F, -223.5F);

		leftWingModel[84].addShapeBox(0F, 0F, 0F, 28, 7, 9, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -2F, -5F, 0F, -6F, -3F); // Import Box169
		leftWingModel[84].setRotationPoint(-91F, -1F, -214.5F);

		leftWingModel[85].addShapeBox(0F, 0F, 0F, 30, 5, 9, 0F,0F, 0F, 0F, 0F, -2F, 0F, -11F, -1F, -5F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, -3F, 0F, -13F, -1F, -9F, 0F, 0F, -9F); // Import Box170
		leftWingModel[85].setRotationPoint(-63F, 1F, -214.5F);

		leftWingModel[86].addShapeBox(0F, 0F, 0F, 30, 5, 9, 0F,0F, 0F, -0.3F, -11F, -1F, -5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, -13F, -1F, -9F, 0F, -3F, 0F, 0F, 0F, 0F); // Import Box171
		leftWingModel[86].setRotationPoint(-63F, 1F, -223.5F);

		leftWingModel[87].addShapeBox(0F, 0F, 0F, 17, 7, 9, 0F,-5F, -2F, -4F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -8F, -3F, -4F, 0F, -1F, -3F, 0F, 0F, 0F, -7F, -1F, 0F); // Import Box172
		leftWingModel[87].setRotationPoint(-108F, -6F, -223.5F);

		leftWingModel[88].addShapeBox(0F, 0F, 0F, 17, 7, 9, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -5F, -2F, -4F, -7F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, -8F, -3F, -4F); // Import Box173
		leftWingModel[88].setRotationPoint(-108F, -6F, -214.5F);

		leftWingModel[89].addShapeBox(0F, 0F, 0F, 2, 62, 1, 0F,0F, 0F, -31F, 1F, 0F, -31F, 0F, 0F, 31F, 0F, 0F, 31F, 4F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 3F, 0F, 0F); // Box 180
		leftWingModel[89].setRotationPoint(-80F, -71F, -217.5F);

		leftWingModel[90].addShapeBox(0F, 0F, 0F, 2, 62, 1, 0F,0F, 0F, -31F, 0F, 0F, -31F, 1F, 0F, 31F, 0F, 0F, 31F, 3F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 4F, 0F, 0F); // Box 181
		leftWingModel[90].setRotationPoint(-80F, -71F, -218.5F);

		leftWingModel[91].addShapeBox(0F, 0F, 0F, 2, 62, 1, 0F,26F, 0F, -29F, -25F, 0F, -29F, -26F, 0F, 29F, 26F, 0F, 29F, 4F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 3F, 0F, 0F); // Box 182
		leftWingModel[91].setRotationPoint(-54F, -67F, -217.5F);

		leftWingModel[92].addShapeBox(0F, 0F, 0F, 2, 62, 1, 0F,26F, 0F, -29F, -26F, 0F, -29F, -25F, 0F, 29F, 26F, 0F, 29F, 4F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 4F, 0F, 0F); // Box 183
		leftWingModel[92].setRotationPoint(-54F, -67F, -218.5F);

		leftWingModel[93].addShapeBox(0F, 0F, 0F, 2, 62, 1, 0F,-15F, 0F, 0F, 16F, 0F, 0F, 15F, 0F, 0F, -15F, 0F, 0F, 4F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 3F, 0F, 0F); // Box 184
		leftWingModel[93].setRotationPoint(-54F, -67F, -217.5F);

		leftWingModel[94].addShapeBox(0F, 0F, 0F, 2, 62, 1, 0F,26F, 0F, 0F, -26F, 0F, 0F, -26F, 0F, 0F, 26F, 0F, 0F, 3F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 4F, 0F, 0F); // Box 185
		leftWingModel[94].setRotationPoint(-54F, -67F, -218.5F);

		leftWingModel[95].addShapeBox(0F, -8F, -1F, 1, 18, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 802
		leftWingModel[95].setRotationPoint(-124F, -65.5F, -66F);

		leftWingModel[96].addShapeBox(0F, -9F, -1F, 1, 20, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 803
		leftWingModel[96].setRotationPoint(-124F, -65.5F, -66F);
		leftWingModel[96].rotateAngleX = 1.57079633F;

		leftWingModel[97].addShapeBox(0F, -11F, -1F, 1, 21, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 804
		leftWingModel[97].setRotationPoint(-124F, -65.5F, -66F);
		leftWingModel[97].rotateAngleX = 2.35619449F;

		leftWingModel[98].addShapeBox(0F, -10F, -1F, 1, 21, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 805
		leftWingModel[98].setRotationPoint(-124F, -65.5F, -66F);
		leftWingModel[98].rotateAngleX = 0.78539816F;
	}

	private void initrightWingModel_1()
	{
		rightWingModel[0] = new ModelRendererTurbo(this, 73, 353, textureX, textureY); // Box 248
		rightWingModel[1] = new ModelRendererTurbo(this, 985, 345, textureX, textureY); // Box 249
		rightWingModel[2] = new ModelRendererTurbo(this, 529, 353, textureX, textureY); // Box 250
		rightWingModel[3] = new ModelRendererTurbo(this, 1577, 361, textureX, textureY); // Box 251
		rightWingModel[4] = new ModelRendererTurbo(this, 1745, 361, textureX, textureY); // Box 252
		rightWingModel[5] = new ModelRendererTurbo(this, 1425, 369, textureX, textureY); // Box 253
		rightWingModel[6] = new ModelRendererTurbo(this, 193, 377, textureX, textureY); // Box 254
		rightWingModel[7] = new ModelRendererTurbo(this, 1769, 369, textureX, textureY); // Box 255
		rightWingModel[8] = new ModelRendererTurbo(this, 1049, 353, textureX, textureY); // Box 256
		rightWingModel[9] = new ModelRendererTurbo(this, 1433, 369, textureX, textureY); // Box 257
		rightWingModel[10] = new ModelRendererTurbo(this, 617, 377, textureX, textureY); // Box 258
		rightWingModel[11] = new ModelRendererTurbo(this, 745, 377, textureX, textureY); // Box 260
		rightWingModel[12] = new ModelRendererTurbo(this, 1265, 377, textureX, textureY); // Box 262
		rightWingModel[13] = new ModelRendererTurbo(this, 1833, 233, textureX, textureY); // Box 263
		rightWingModel[14] = new ModelRendererTurbo(this, 609, 89, textureX, textureY); // Box 264
		rightWingModel[15] = new ModelRendererTurbo(this, 1137, 129, textureX, textureY); // Box 265
		rightWingModel[16] = new ModelRendererTurbo(this, 1177, 385, textureX, textureY); // Box 298
		rightWingModel[17] = new ModelRendererTurbo(this, 1721, 417, textureX, textureY); // Box 299
		rightWingModel[18] = new ModelRendererTurbo(this, 113, 425, textureX, textureY); // Box 300
		rightWingModel[19] = new ModelRendererTurbo(this, 577, 425, textureX, textureY); // Box 301
		rightWingModel[20] = new ModelRendererTurbo(this, 57, 361, textureX, textureY); // Box 302
		rightWingModel[21] = new ModelRendererTurbo(this, 1081, 353, textureX, textureY); // Box 303
		rightWingModel[22] = new ModelRendererTurbo(this, 225, 361, textureX, textureY); // Box 304
		rightWingModel[23] = new ModelRendererTurbo(this, 1713, 361, textureX, textureY); // Box 305
		rightWingModel[24] = new ModelRendererTurbo(this, 1569, 417, textureX, textureY); // Box 306
		rightWingModel[25] = new ModelRendererTurbo(this, 1345, 409, textureX, textureY); // Box 307
		rightWingModel[26] = new ModelRendererTurbo(this, 1425, 425, textureX, textureY); // Box 308
		rightWingModel[27] = new ModelRendererTurbo(this, 1945, 433, textureX, textureY); // Box 309
		rightWingModel[28] = new ModelRendererTurbo(this, 1345, 377, textureX, textureY); // Box 310
		rightWingModel[29] = new ModelRendererTurbo(this, 969, 417, textureX, textureY); // Box 311
		rightWingModel[30] = new ModelRendererTurbo(this, 969, 441, textureX, textureY); // Box 312
		rightWingModel[31] = new ModelRendererTurbo(this, 113, 457, textureX, textureY); // Box 313
		rightWingModel[32] = new ModelRendererTurbo(this, 649, 361, textureX, textureY); // Box 314
		rightWingModel[33] = new ModelRendererTurbo(this, 377, 377, textureX, textureY); // Box 315
		rightWingModel[34] = new ModelRendererTurbo(this, 2001, 369, textureX, textureY); // Box 316
		rightWingModel[35] = new ModelRendererTurbo(this, 745, 377, textureX, textureY); // Box 317
		rightWingModel[36] = new ModelRendererTurbo(this, 825, 17, textureX, textureY); // Box 318
		rightWingModel[37] = new ModelRendererTurbo(this, 1681, 65, textureX, textureY); // Box 319
		rightWingModel[38] = new ModelRendererTurbo(this, 1201, 73, textureX, textureY); // Box 320
		rightWingModel[39] = new ModelRendererTurbo(this, 937, 1, textureX, textureY); // Box 321
		rightWingModel[40] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 322
		rightWingModel[41] = new ModelRendererTurbo(this, 1297, 1, textureX, textureY); // Box 323
		rightWingModel[42] = new ModelRendererTurbo(this, 1281, 81, textureX, textureY); // Box 324
		rightWingModel[43] = new ModelRendererTurbo(this, 1905, 137, textureX, textureY); // Box 325
		rightWingModel[44] = new ModelRendererTurbo(this, 1905, 145, textureX, textureY); // Box 326
		rightWingModel[45] = new ModelRendererTurbo(this, 1353, 81, textureX, textureY); // Box 327
		rightWingModel[46] = new ModelRendererTurbo(this, 369, 97, textureX, textureY); // Box 328
		rightWingModel[47] = new ModelRendererTurbo(this, 1481, 105, textureX, textureY); // Box 329
		rightWingModel[48] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 330
		rightWingModel[49] = new ModelRendererTurbo(this, 1313, 1, textureX, textureY); // Box 331
		rightWingModel[50] = new ModelRendererTurbo(this, 1849, 1, textureX, textureY); // Box 332
		rightWingModel[51] = new ModelRendererTurbo(this, 1161, 9, textureX, textureY); // Box 333
		rightWingModel[52] = new ModelRendererTurbo(this, 121, 73, textureX, textureY); // Box 334
		rightWingModel[53] = new ModelRendererTurbo(this, 1513, 65, textureX, textureY); // Box 335
		rightWingModel[54] = new ModelRendererTurbo(this, 1577, 129, textureX, textureY); // Box 336
		rightWingModel[55] = new ModelRendererTurbo(this, 753, 145, textureX, textureY); // Box 337
		rightWingModel[56] = new ModelRendererTurbo(this, 449, 161, textureX, textureY); // Box 338
		rightWingModel[57] = new ModelRendererTurbo(this, 225, 169, textureX, textureY); // Box 339
		rightWingModel[58] = new ModelRendererTurbo(this, 1737, 177, textureX, textureY); // Box 340
		rightWingModel[59] = new ModelRendererTurbo(this, 1249, 57, textureX, textureY); // Box 341
		rightWingModel[60] = new ModelRendererTurbo(this, 2025, 65, textureX, textureY); // Box 342
		rightWingModel[61] = new ModelRendererTurbo(this, 753, 73, textureX, textureY); // Box 343
		rightWingModel[62] = new ModelRendererTurbo(this, 881, 113, textureX, textureY); // Box 344
		rightWingModel[63] = new ModelRendererTurbo(this, 1417, 9, textureX, textureY); // Box 345
		rightWingModel[64] = new ModelRendererTurbo(this, 1281, 89, textureX, textureY); // Box 346
		rightWingModel[65] = new ModelRendererTurbo(this, 1465, 9, textureX, textureY); // Box 347
		rightWingModel[66] = new ModelRendererTurbo(this, 1665, 113, textureX, textureY); // Box 348
		rightWingModel[67] = new ModelRendererTurbo(this, 2017, 161, textureX, textureY); // Box 349
		rightWingModel[68] = new ModelRendererTurbo(this, 233, 121, textureX, textureY); // Box 350
		rightWingModel[69] = new ModelRendererTurbo(this, 1689, 9, textureX, textureY); // Box 351
		rightWingModel[70] = new ModelRendererTurbo(this, 465, 177, textureX, textureY); // Box 352
		rightWingModel[71] = new ModelRendererTurbo(this, 1081, 177, textureX, textureY); // Box 353
		rightWingModel[72] = new ModelRendererTurbo(this, 1737, 9, textureX, textureY); // Box 354
		rightWingModel[73] = new ModelRendererTurbo(this, 2025, 209, textureX, textureY); // Box 355
		rightWingModel[74] = new ModelRendererTurbo(this, 2033, 209, textureX, textureY); // Box 356
		rightWingModel[75] = new ModelRendererTurbo(this, 1985, 233, textureX, textureY); // Box 357
		rightWingModel[76] = new ModelRendererTurbo(this, 2041, 257, textureX, textureY); // Box 358
		rightWingModel[77] = new ModelRendererTurbo(this, 465, 457, textureX, textureY); // Box 359
		rightWingModel[78] = new ModelRendererTurbo(this, 1073, 457, textureX, textureY); // Box 360
		rightWingModel[79] = new ModelRendererTurbo(this, 1153, 457, textureX, textureY); // Box 361
		rightWingModel[80] = new ModelRendererTurbo(this, 1233, 457, textureX, textureY); // Box 362
		rightWingModel[81] = new ModelRendererTurbo(this, 1353, 257, textureX, textureY); // Box 363
		rightWingModel[82] = new ModelRendererTurbo(this, 257, 313, textureX, textureY); // Box 364
		rightWingModel[83] = new ModelRendererTurbo(this, 129, 265, textureX, textureY); // Box 365
		rightWingModel[84] = new ModelRendererTurbo(this, 481, 385, textureX, textureY); // Box 366
		rightWingModel[85] = new ModelRendererTurbo(this, 1793, 273, textureX, textureY); // Box 367
		rightWingModel[86] = new ModelRendererTurbo(this, 1049, 417, textureX, textureY); // Box 368
		rightWingModel[87] = new ModelRendererTurbo(this, 1233, 185, textureX, textureY); // Box 369
		rightWingModel[88] = new ModelRendererTurbo(this, 105, 321, textureX, textureY); // Box 370
		rightWingModel[89] = new ModelRendererTurbo(this, 921, 377, textureX, textureY); // Box 371
		rightWingModel[90] = new ModelRendererTurbo(this, 57, 393, textureX, textureY); // Box 372
		rightWingModel[91] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // Box 373
		rightWingModel[92] = new ModelRendererTurbo(this, 2041, 401, textureX, textureY); // Box 374
		rightWingModel[93] = new ModelRendererTurbo(this, 1409, 441, textureX, textureY); // Box 375
		rightWingModel[94] = new ModelRendererTurbo(this, 1417, 441, textureX, textureY); // Box 376
		rightWingModel[95] = new ModelRendererTurbo(this, 1105, 57, textureX, textureY); // Box 385
		rightWingModel[96] = new ModelRendererTurbo(this, 1481, 113, textureX, textureY); // Box 386
		rightWingModel[97] = new ModelRendererTurbo(this, 353, 129, textureX, textureY); // Box 387
		rightWingModel[98] = new ModelRendererTurbo(this, 1793, 129, textureX, textureY); // Box 388

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 49, 21, 50, 0F,0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 16F, 0F, 0F, 15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		rightWingModel[0].setRotationPoint(-68F, -72F, 0F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 21, 21, 50, 0F,0F, -24F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 11F, 0F, 0F, 16F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 249
		rightWingModel[1].setRotationPoint(-89F, -72F, 0F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 34, 21, 50, 0F,0F, -15F, 0F, 0F, -28F, 0F, -6F, -12F, 0F, 0F, 0F, 0F, 0F, 15F, 0F, 0F, 8F, 0F, -6F, -8F, 0F, 0F, 0F, 0F); // Box 250
		rightWingModel[2].setRotationPoint(-19F, -72F, 0F);

		rightWingModel[3].addShapeBox(0F, 0F, 0F, 49, 20, 32, 0F,0F, -6F, 0F, 0F, -6F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 251
		rightWingModel[3].setRotationPoint(-68F, -78F, 50F);

		rightWingModel[4].addShapeBox(0F, 0F, 0F, 28, 20, 32, 0F,0F, -6F, 0F, 0F, -18F, 0F, -8F, -11F, 0F, 0F, -1F, 0F, 0F, 7F, 0F, 0F, -1F, 0F, -8F, -7F, 0F, 0F, 0F, 0F); // Box 252
		rightWingModel[4].setRotationPoint(-19F, -78F, 50F);

		rightWingModel[5].addShapeBox(0F, 0F, 0F, 21, 20, 32, 0F,0F, -14F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, -3F, -8F, 0F, 0F, 2F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, -3F, -3F, 0F); // Box 253
		rightWingModel[5].setRotationPoint(-89F, -78F, 50F);

		rightWingModel[6].addShapeBox(0F, 0F, 0F, 49, 16, 84, 0F,0F, -1F, 0F, 0F, -2F, 0F, -13F, 1F, 0F, 0F, 1F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, -13F, 0F, 0F, 0F, 0F, 0F); // Box 254
		rightWingModel[6].setRotationPoint(-68F, -79F, 82F);

		rightWingModel[7].addShapeBox(0F, 0F, 0F, 36, 17, 100, 0F,0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, -4F, 0F, 0F, -4F, 0F); // Box 255
		rightWingModel[7].setRotationPoint(-68F, -80F, 166F);

		rightWingModel[8].addShapeBox(0F, 0F, 0F, 18, 16, 84, 0F,0F, -9F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, -3F, -6F, 0F, 0F, 2F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, -3F, -4F, 0F); // Box 256
		rightWingModel[8].setRotationPoint(-86F, -79F, 82F);

		rightWingModel[9].addShapeBox(0F, 0F, 0F, 15, 17, 100, 0F,0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -4F, -8F, 0F); // Box 257
		rightWingModel[9].setRotationPoint(-83F, -80F, 166F);

		rightWingModel[10].addShapeBox(0F, 0F, 0F, 21, 16, 84, 0F,-13F, -2F, 0F, 12F, -12F, 0F, 0F, -9F, 0F, 0F, 1F, 0F, -13F, 5F, 0F, 12F, -2F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 258
		rightWingModel[10].setRotationPoint(-32F, -79F, 82F);

		rightWingModel[11].addShapeBox(0F, 0F, 0F, 26, 13, 60, 0F,0F, 0F, 0F, 0F, 0F, 0F, -5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -2F, 0F, 0F, -2F, 0F); // Box 260
		rightWingModel[11].setRotationPoint(-68F, -80F, 266F);

		rightWingModel[12].addShapeBox(0F, 0F, 0F, 9, 13, 60, 0F,2F, -4F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -5F, 0F, 2F, -4F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -6F, 0F); // Box 262
		rightWingModel[12].setRotationPoint(-77F, -80F, 266F);

		rightWingModel[13].addShapeBox(0F, 0F, 0F, 21, 10, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, -6F, -4F, 0F, -6F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -4F, 0F, -6F, -4F, 0F); // Box 263
		rightWingModel[13].setRotationPoint(-68F, -79F, 326F);

		rightWingModel[14].addShapeBox(0F, 0F, 0F, 9, 10, 11, 0F,0F, -4F, 0F, 0F, 0F, 0F, 6F, -4F, 0F, -6F, -4F, -4F, 0F, -4F, 0F, 0F, 0F, 0F, 6F, -4F, 0F, -6F, -4F, -4F); // Box 264
		rightWingModel[14].setRotationPoint(-77F, -79F, 326F);

		rightWingModel[15].addShapeBox(0F, 0F, 0F, 14, 10, 11, 0F,0F, 0F, 0F, 0F, -5F, 0F, -6F, -5F, -4F, 6F, -4F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -6F, -3F, -4F, 6F, -4F, 0F); // Box 265
		rightWingModel[15].setRotationPoint(-47F, -79F, 326F);

		rightWingModel[16].addShapeBox(0F, 0F, 0F, 40, 15, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 2F, 0F, 2.5F, 0F, 0F, 3.75F, 0F, 0F, -2.75F, -3F, 0F, -2.5F, -2.5F); // Box 298
		rightWingModel[16].setRotationPoint(-103F, -65.5F, 65.5F);

		rightWingModel[17].addShapeBox(0F, 0F, 0F, 40, 15, 15, 0F,0F, 1.25F, 0F, 0F, -0.25F, 0F, 0F, -3.75F, -4F, 0F, -2.5F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 2F); // Box 299
		rightWingModel[17].setRotationPoint(-103F, -80.5F, 65.5F);

		rightWingModel[18].addShapeBox(0F, 0F, 0F, 40, 15, 15, 0F,0F, -2.5F, -2.5F, 0F, -4.25F, -4F, 0F, -0.25F, 0F, 0F, 1.25F, 0F, 0F, 0F, 2F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		rightWingModel[18].setRotationPoint(-103F, -80.5F, 50.5F);

		rightWingModel[19].addShapeBox(0F, 0F, 0F, 40, 15, 15, 0F,0F, 0F, 2F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, -2.5F, 0F, -2.75F, -3F, 0F, 3.75F, 0F, 0F, 2.5F, 0F); // Box 301
		rightWingModel[19].setRotationPoint(-103F, -65.5F, 50.5F);

		rightWingModel[20].addShapeBox(0F, 0F, 0F, 13, 15, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1.25F, 0F, 1.25F, 0F, 0F, 2.5F, 0F, 0F, -2.5F, -2.5F, 0F, -3.25F, -4.25F); // Box 302
		rightWingModel[20].setRotationPoint(-116F, -65.5F, 65.5F);

		rightWingModel[21].addShapeBox(0F, 0F, 0F, 7, 15, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F, -2.25F, 0F, -2.25F, 0F, 0F, 1.25F, 0F, 0F, -3.25F, -4.25F, 0F, -5.75F, -6F); // Box 303
		rightWingModel[21].setRotationPoint(-123F, -65.5F, 65.5F);

		rightWingModel[22].addShapeBox(0F, 0F, 0F, 7, 15, 15, 0F,0F, -2.75F, 0F, 0F, 1F, 0F, 0F, -3.25F, -4.25F, 0F, -5.75F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F, -2.25F); // Box 304
		rightWingModel[22].setRotationPoint(-123F, -80.5F, 65.5F);

		rightWingModel[23].addShapeBox(0F, 0F, 0F, 13, 15, 15, 0F,0F, 1F, 0F, 0F, 1.25F, 0F, 0F, -2.5F, -2.5F, 0F, -3.25F, -4.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1.25F); // Box 305
		rightWingModel[23].setRotationPoint(-116F, -80.5F, 65.5F);

		rightWingModel[24].addShapeBox(0F, 0F, 0F, 30, 15, 15, 0F,0F, 0F, 0F, 0F, -4.25F, 0F, 0F, -4.75F, -5.25F, 0F, 0F, -0.25F, 0F, 3.75F, 0F, 0F, 1F, 0F, 0F, -4.25F, -6.75F, 0F, -2.75F, -3F); // Box 306
		rightWingModel[24].setRotationPoint(-63F, -65.5F, 65.5F);

		rightWingModel[25].addShapeBox(0F, 0F, 0F, 30, 11, 15, 0F,0F, 3.75F, 0F, 0F, -4.25F, 0F, 0F, -8F, -6.75F, 0F, 0.25F, -4F, 0F, 0F, 0F, 0F, 4.25F, 0F, 0F, 4.75F, -5.25F, 0F, 0F, -0.25F); // Box 307
		rightWingModel[25].setRotationPoint(-63F, -76.5F, 65.5F);

		rightWingModel[26].addShapeBox(0F, 0F, 0F, 30, 11, 15, 0F,0F, -0.25F, -4F, 0F, -8F, -6.75F, 0F, -4.25F, 0F, 0F, 3.75F, 0F, 0F, 0F, -0.25F, 0F, 4.75F, -5.25F, 0F, 4.25F, 0F, 0F, 0F, 0F); // Box 308
		rightWingModel[26].setRotationPoint(-63F, -76.5F, 50.5F);

		rightWingModel[27].addShapeBox(0F, 0F, 0F, 30, 15, 15, 0F,0F, 0F, -0.25F, 0F, -4.75F, -5.25F, 0F, -4.25F, 0F, 0F, 0F, 0F, 0F, -2.75F, -3F, 0F, -4.25F, -6.75F, 0F, 1F, 0F, 0F, 3.75F, 0F); // Box 309
		rightWingModel[27].setRotationPoint(-63F, -65.5F, 50.5F);

		rightWingModel[28].addShapeBox(0F, 0F, 0F, 27, 11, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7.75F, 0F, 0F, 0.75F, 0F, 0.5F, 0F, 0F, -8.75F, 0F, 0F, -9.75F, -8F, 0F, -4.75F, -0.75F); // Box 310
		rightWingModel[28].setRotationPoint(-33F, -61F, 65.5F);

		rightWingModel[29].addShapeBox(0F, 0F, 0F, 27, 11, 9, 0F,0F, 0.25F, 0F, 0F, -9.25F, 0F, 0F, -10.25F, -8.25F, 0F, -3.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7.75F, 0F, 0F, 0.75F); // Box 311
		rightWingModel[29].setRotationPoint(-33F, -72F, 65.5F);

		rightWingModel[30].addShapeBox(0F, 0F, 0F, 27, 11, 9, 0F,0F, -3.5F, -0.75F, 0F, -10.25F, -8.25F, 0F, -9.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0.75F, 0F, 0F, -7.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 312
		rightWingModel[30].setRotationPoint(-33F, -72F, 56.5F);

		rightWingModel[31].addShapeBox(0F, 0F, 0F, 27, 11, 9, 0F,0F, 0F, 0.75F, 0F, 0F, -7.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.75F, -0.75F, 0F, -9.75F, -8F, 0F, -8.75F, 0F, 0F, 0.5F, 0F); // Box 313
		rightWingModel[31].setRotationPoint(-33F, -61F, 56.5F);

		rightWingModel[32].addShapeBox(0F, 0F, 0F, 7, 15, 15, 0F,0F, 0F, -2.25F, 0F, 0F, 1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.75F, -6F, 0F, -3.25F, -4.25F, 0F, 1.25F, 0F, 0F, -2.25F, 0F); // Box 314
		rightWingModel[32].setRotationPoint(-123F, -65.5F, 50.5F);

		rightWingModel[33].addShapeBox(0F, 0F, 0F, 13, 15, 15, 0F,0F, 0F, 1.25F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.25F, -4.25F, 0F, -2.5F, -2.5F, 0F, 2.5F, 0F, 0F, 1.25F, 0F); // Box 315
		rightWingModel[33].setRotationPoint(-116F, -65.5F, 50.5F);

		rightWingModel[34].addShapeBox(0F, 0F, 0F, 7, 15, 15, 0F,0F, -5.75F, -6F, 0F, -3.25F, -4.25F, 0F, 1F, 0F, 0F, -2.75F, 0F, 0F, 0F, -2.25F, 0F, 0F, 1.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 316
		rightWingModel[34].setRotationPoint(-123F, -80.5F, 50.5F);

		rightWingModel[35].addShapeBox(0F, 0F, 0F, 13, 15, 15, 0F,0F, -3.25F, -4.25F, 0F, -2.5F, -2.5F, 0F, 1.25F, 0F, 0F, 1F, 0F, 0F, 0F, 1.25F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 317
		rightWingModel[35].setRotationPoint(-116F, -80.5F, 50.5F);

		rightWingModel[36].addShapeBox(0F, 0F, 0F, 5, 4, 3, 0F,0F, 1F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 318
		rightWingModel[36].setRotationPoint(-104F, -84.5F, 65.5F);

		rightWingModel[37].addShapeBox(0F, 0F, 0F, 13, 4, 3, 0F,0F, 1.5F, 0F, 0F, 1.25F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 1.25F, 0F, 0F, 0F); // Box 319
		rightWingModel[37].setRotationPoint(-99F, -84.5F, 65.5F);

		rightWingModel[38].addShapeBox(0F, 0F, 0F, 13, 4, 3, 0F,0F, 1.25F, 0F, 0F, -0.5F, 0F, 0F, -1.25F, 0.75F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 4F, 0F, 0F, 1.25F); // Box 320
		rightWingModel[38].setRotationPoint(-86F, -84.5F, 65.5F);

		rightWingModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.75F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 321
		rightWingModel[39].setRotationPoint(-105F, -85.5F, 65.5F);

		rightWingModel[40].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 322
		rightWingModel[40].setRotationPoint(-105F, -84.5F, 67.5F);

		rightWingModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 323
		rightWingModel[41].setRotationPoint(-105F, -82.5F, 65.5F);

		rightWingModel[42].addShapeBox(0F, 0F, 0F, 13, 4, 3, 0F,0F, 1.5F, 0F, 0F, -1.75F, 0F, 0F, -2.25F, 0.25F, 0F, 0.75F, 0.75F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 4.25F, 0F, 0F, 4F); // Box 324
		rightWingModel[42].setRotationPoint(-73F, -82.5F, 65.5F);

		rightWingModel[43].addShapeBox(0F, 0F, 0F, 22, 4, 3, 0F,0F, 1.25F, 0F, 0F, -6F, 0F, 0F, -6.75F, -1F, 0F, 0.75F, 0.25F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 3.5F, 1F, 0F, 0F, 5.25F); // Box 325
		rightWingModel[43].setRotationPoint(-60F, -79.5F, 65.5F);

		rightWingModel[44].addShapeBox(0F, 0F, 0F, 22, 4, 3, 0F,0F, 0.75F, 0.25F, 0F, -7F, -1F, 0F, -6F, 0F, 0F, 1.25F, 0F, 0F, 0F, 5.25F, 0F, 3.75F, 1F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 326
		rightWingModel[44].setRotationPoint(-60F, -79.5F, 62.5F);

		rightWingModel[45].addShapeBox(0F, 0F, 0F, 13, 4, 3, 0F,0F, 0.75F, 0.75F, 0F, -2.25F, 0.25F, 0F, -1.75F, 0F, 0F, 1.5F, 0F, 0F, 0F, 4F, 0F, 2F, 4.25F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 327
		rightWingModel[45].setRotationPoint(-73F, -82.5F, 62.5F);

		rightWingModel[46].addShapeBox(0F, 0F, 0F, 13, 4, 3, 0F,0F, 0F, 0.5F, 0F, -1.25F, 0.75F, 0F, -0.5F, 0F, 0F, 1.25F, 0F, 0F, 0F, 1.25F, 0F, 2F, 4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 328
		rightWingModel[46].setRotationPoint(-86F, -84.5F, 62.5F);

		rightWingModel[47].addShapeBox(0F, 0F, 0F, 13, 4, 3, 0F,0F, 0.5F, -0.25F, 0F, 0F, 0.5F, 0F, 1.25F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0.25F, 1.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 329
		rightWingModel[47].setRotationPoint(-99F, -84.5F, 62.5F);

		rightWingModel[48].addShapeBox(0F, 0F, 0F, 5, 4, 3, 0F,0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 1.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 330
		rightWingModel[48].setRotationPoint(-104F, -84.5F, 62.5F);

		rightWingModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.75F, -0.5F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 331
		rightWingModel[49].setRotationPoint(-105F, -85.5F, 62.5F);

		rightWingModel[50].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 332
		rightWingModel[50].setRotationPoint(-105F, -84.5F, 62.5F);

		rightWingModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 333
		rightWingModel[51].setRotationPoint(-105F, -82.5F, 62.5F);

		rightWingModel[52].addShapeBox(0F, 0F, 0F, 2, 4, 9, 0F,0F, -2.4999F, -0.5F, 0F, 0.25F, -0.5F, 0F, -2.7499F, 0.5F, 0F, -3.9999F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 334
		rightWingModel[52].setRotationPoint(-125F, -77.5F, 65F);

		rightWingModel[53].addShapeBox(0F, 0F, 0F, 2, 10, 7, 0F,0F, -1.9999F, -0.9999F, 0F, -0.75F, -1.4999F, 0F, -0.75F, -5.4999F, 0F, -1.9999F, -5.9999F, 0F, 0F, -0.9999F, 0F, 0F, -0.9999F, 0F, 0F, -1.7499F, 0F, 0F, -2.9999F); // Box 335
		rightWingModel[53].setRotationPoint(-125F, -75.5F, 73F);

		rightWingModel[54].addShapeBox(0F, 0F, 0F, 6, 3, 9, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 336
		rightWingModel[54].setRotationPoint(-129F, -70F, 61.5F);

		rightWingModel[55].addShapeBox(0F, 0F, 0F, 6, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 337
		rightWingModel[55].setRotationPoint(-129F, -64F, 61.5F);

		rightWingModel[56].addShapeBox(0F, 0F, 0F, 10, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 338
		rightWingModel[56].setRotationPoint(-139F, -66.5F, 63F);

		rightWingModel[57].addShapeBox(0F, 0F, 0F, 10, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 339
		rightWingModel[57].setRotationPoint(-139F, -68.5F, 63F);

		rightWingModel[58].addShapeBox(0F, 0F, 0F, 10, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 340
		rightWingModel[58].setRotationPoint(-139F, -64.5F, 63F);

		rightWingModel[59].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 341
		rightWingModel[59].setRotationPoint(-142F, -66.5F, 63F);

		rightWingModel[60].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, -1.9999F, -1.9999F, 0F, 0F, -1.9999F, 0F, 0F, -1.9999F, 0F, -1.9999F, -1.9999F, 0F, 0F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9999F); // Box 342
		rightWingModel[60].setRotationPoint(-142F, -68.5F, 63F);

		rightWingModel[61].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, 0F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9999F, 0F, -1.9999F, -1.9999F, 0F, 0F, -1.9999F, 0F, 0F, -1.9999F, 0F, -1.9999F, -1.9999F); // Box 343
		rightWingModel[61].setRotationPoint(-142F, -64.5F, 63F);

		rightWingModel[62].addShapeBox(0F, 0F, 0F, 2, 10, 7, 0F,0F, -1.9999F, -5.9999F, 0F, -0.75F, -5.4999F, 0F, -0.75F, -1.4999F, 0F, -1.9999F, -0.9999F, 0F, 0F, -2.9999F, 0F, 0F, -1.7499F, 0F, 0F, -0.9999F, 0F, 0F, -0.9999F); // Box 344
		rightWingModel[62].setRotationPoint(-125F, -75.5F, 51F);

		rightWingModel[63].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.9999F, 0F, 0F, -3.9999F, 0F); // Box 345
		rightWingModel[63].setRotationPoint(-125F, -73.5F, 57F);

		rightWingModel[64].addShapeBox(0F, 0F, 0F, 2, 4, 9, 0F,0F, -3.9999F, 0F, 0F, -2.7499F, 0.5F, 0F, 0.25F, -0.5F, 0F, -2.4999F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 346
		rightWingModel[64].setRotationPoint(-125F, -77.5F, 57F);

		rightWingModel[65].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.9999F, 0F, 0F, -3.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 347
		rightWingModel[65].setRotationPoint(-125F, -61.5F, 57F);

		rightWingModel[66].addShapeBox(0F, 0F, 0F, 2, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3.9999F, 0F, 0F, -2.7499F, 0.5F, 0F, 0.75F, -0.5F, 0F, -2.4999F, -0.5F); // Box 348
		rightWingModel[66].setRotationPoint(-125F, -57.5F, 57F);

		rightWingModel[67].addShapeBox(0F, 0F, 0F, 2, 10, 7, 0F,0F, 0F, -2.9999F, 0F, 0F, -1.7499F, 0F, 0F, -0.9999F, 0F, 0F, -0.9999F, 0F, -1.9999F, -5.9999F, 0F, -0.75F, -5.4999F, 0F, -0.75F, -1.4999F, 0F, -1.9999F, -0.9999F); // Box 349
		rightWingModel[67].setRotationPoint(-125F, -65.5F, 51F);

		rightWingModel[68].addShapeBox(0F, 0F, 0F, 2, 4, 9, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.4999F, -0.5F, 0F, 0.75F, -0.5F, 0F, -2.7499F, 0.5F, 0F, -3.9999F, 0F); // Box 350
		rightWingModel[68].setRotationPoint(-125F, -57.5F, 65F);

		rightWingModel[69].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F,0F, -3.9999F, 0F, 0F, -3.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 351
		rightWingModel[69].setRotationPoint(-125F, -61.5F, 71F);

		rightWingModel[70].addShapeBox(0F, 0F, 0F, 2, 10, 7, 0F,0F, 0F, -0.9999F, 0F, 0F, -0.9999F, 0F, 0F, -1.7499F, 0F, 0F, -2.9999F, 0F, -1.9999F, -0.9999F, 0F, -0.75F, -1.4999F, 0F, -0.75F, -5.4999F, 0F, -1.9999F, -5.9999F); // Box 352
		rightWingModel[70].setRotationPoint(-125F, -65.5F, 73F);

		rightWingModel[71].addShapeBox(0F, 0F, 0F, 6, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 353
		rightWingModel[71].setRotationPoint(-129F, -67F, 61.5F);

		rightWingModel[72].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.9999F, 0F, 0F, -3.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 354
		rightWingModel[72].setRotationPoint(-125F, -73.5F, 71F);

		rightWingModel[73].addShapeBox(0F, 0F, 0F, 2, 62, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 4F, 0F, 0F); // Box 355
		rightWingModel[73].setRotationPoint(-80F, -71F, 216.5F);

		rightWingModel[74].addShapeBox(0F, 0F, 0F, 2, 62, 1, 0F,-15F, 0F, 0F, 16F, 0F, 0F, 15F, 0F, 0F, -15F, 0F, 0F, 4F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 3F, 0F, 0F); // Box 356
		rightWingModel[74].setRotationPoint(-54F, -67F, 217.5F);

		rightWingModel[75].addShapeBox(0F, 0F, 0F, 2, 62, 1, 0F,26F, 0F, 0F, -26F, 0F, 0F, -26F, 0F, 0F, 26F, 0F, 0F, 3F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 4F, 0F, 0F); // Box 357
		rightWingModel[75].setRotationPoint(-54F, -67F, 216.5F);

		rightWingModel[76].addShapeBox(0F, 0F, 0F, 2, 62, 1, 0F,0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 3F, 0F, 0F); // Box 358
		rightWingModel[76].setRotationPoint(-80F, -71F, 217.5F);

		rightWingModel[77].addShapeBox(0F, 0F, 0F, 28, 13, 9, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -4F, -3F, 0F, -3F, -3F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F); // Box 359
		rightWingModel[77].setRotationPoint(-91F, -12F, 214.5F);

		rightWingModel[78].addShapeBox(0F, 0F, 0F, 30, 13, 9, 0F,0F, -1F, 0F, 0F, -7F, 0F, -12F, -7F, -6F, 0F, -4F, -3F, 0F, 0F, 0F, 0F, 2F, 0F, -11F, 1F, -5F, 0F, 0F, -0.3F); // Box 360
		rightWingModel[78].setRotationPoint(-63F, -12F, 214.5F);

		rightWingModel[79].addShapeBox(0F, 0F, 0F, 30, 13, 9, 0F,0F, -4F, -3F, -12F, -7F, -6F, 0F, -7F, 0F, 0F, -1F, 0F, 0F, 0F, -0.3F, -11F, 1F, -5F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 361
		rightWingModel[79].setRotationPoint(-63F, -12F, 205.5F);

		rightWingModel[80].addShapeBox(0F, 0F, 0F, 28, 13, 9, 0F,0F, -3F, -3F, 0F, -4F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F); // Box 362
		rightWingModel[80].setRotationPoint(-91F, -12F, 205.5F);

		rightWingModel[81].addShapeBox(0F, 0F, 0F, 17, 13, 9, 0F,-6F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, -6F, -3F, -6F, 0F, -7F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -5F, -5F, -4F); // Box 363
		rightWingModel[81].setRotationPoint(-108F, -12F, 214.5F);

		rightWingModel[82].addShapeBox(0F, 0F, 0F, 17, 13, 9, 0F,-6F, -3F, -6F, 0F, -3F, -3F, 0F, 0F, 0F, -6F, -1F, 0F, -5F, -5F, -4F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -7F, 0F); // Box 364
		rightWingModel[82].setRotationPoint(-108F, -12F, 205.5F);

		rightWingModel[83].addShapeBox(0F, 0F, 0F, 28, 7, 9, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -2F, -5F, 0F, -6F, -3F); // Box 365
		rightWingModel[83].setRotationPoint(-91F, -1F, 214.5F);

		rightWingModel[84].addShapeBox(0F, 0F, 0F, 28, 7, 9, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -6F, -3F, 0F, -2F, -5F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 366
		rightWingModel[84].setRotationPoint(-91F, -1F, 205.5F);

		rightWingModel[85].addShapeBox(0F, 0F, 0F, 30, 5, 9, 0F,0F, 0F, -0.3F, -11F, -1F, -5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, -13F, -1F, -9F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 367
		rightWingModel[85].setRotationPoint(-63F, 1F, 205.5F);

		rightWingModel[86].addShapeBox(0F, 0F, 0F, 30, 5, 9, 0F,0F, 0F, 0F, 0F, -2F, 0F, -11F, -1F, -5F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, -3F, 0F, -13F, -1F, -9F, 0F, 0F, -9F); // Box 368
		rightWingModel[86].setRotationPoint(-63F, 1F, 214.5F);

		rightWingModel[87].addShapeBox(0F, 0F, 0F, 17, 7, 9, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -5F, -2F, -4F, -7F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, -8F, -3F, -4F); // Box 369
		rightWingModel[87].setRotationPoint(-108F, -6F, 214.5F);

		rightWingModel[88].addShapeBox(0F, 0F, 0F, 17, 7, 9, 0F,-5F, -2F, -4F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -8F, -3F, -4F, 0F, -1F, -3F, 0F, 0F, 0F, -7F, -1F, 0F); // Box 370
		rightWingModel[88].setRotationPoint(-108F, -6F, 205.5F);

		rightWingModel[89].addShapeBox(0F, 0F, 0F, 2, 62, 1, 0F,0F, 0F, 31F, 0F, 0F, 31F, 1F, 0F, -31F, 0F, 0F, -31F, 3F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 4F, 0F, 0F); // Box 371
		rightWingModel[89].setRotationPoint(-80F, -71F, 216.5F);

		rightWingModel[90].addShapeBox(0F, 0F, 0F, 2, 62, 1, 0F,0F, 0F, 31F, 1F, 0F, 31F, 0F, 0F, -31F, 0F, 0F, -31F, 4F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 3F, 0F, 0F); // Box 372
		rightWingModel[90].setRotationPoint(-80F, -71F, 217.5F);

		rightWingModel[91].addShapeBox(0F, 0F, 0F, 2, 62, 1, 0F,26F, 0F, 29F, -26F, 0F, 29F, -25F, 0F, -29F, 26F, 0F, -29F, 3F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 4F, 0F, 0F); // Box 373
		rightWingModel[91].setRotationPoint(-54F, -67F, 216.5F);

		rightWingModel[92].addShapeBox(0F, 0F, 0F, 2, 62, 1, 0F,26F, 0F, 29F, -25F, 0F, 29F, -26F, 0F, -29F, 26F, 0F, -29F, 4F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 4F, 0F, 0F); // Box 374
		rightWingModel[92].setRotationPoint(-54F, -67F, 217.5F);

		rightWingModel[93].addShapeBox(0F, 0F, 0F, 2, 62, 1, 0F,-15F, 0F, 0F, 15F, 0F, 0F, 16F, 0F, 0F, -15F, 0F, 0F, 3F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 4F, 0F, 0F); // Box 375
		rightWingModel[93].setRotationPoint(-54F, -67F, 216.5F);

		rightWingModel[94].addShapeBox(0F, 0F, 0F, 2, 62, 1, 0F,26F, 0F, 0F, -26F, 0F, 0F, -26F, 0F, 0F, 26F, 0F, 0F, 4F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 3F, 0F, 0F); // Box 376
		rightWingModel[94].setRotationPoint(-54F, -67F, 217.5F);

		rightWingModel[95].addShapeBox(0F, -8F, -1F, 1, 18, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 385
		rightWingModel[95].setRotationPoint(-124F, -65.5F, 66F);

		rightWingModel[96].addShapeBox(0F, -11F, -1F, 1, 21, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 386
		rightWingModel[96].setRotationPoint(-124F, -65.5F, 66F);
		rightWingModel[96].rotateAngleX = 2.35619449F;

		rightWingModel[97].addShapeBox(0F, -9F, -1F, 1, 20, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 387
		rightWingModel[97].setRotationPoint(-124F, -65.5F, 66F);
		rightWingModel[97].rotateAngleX = 1.57079633F;

		rightWingModel[98].addShapeBox(0F, -10F, -1F, 1, 21, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 388
		rightWingModel[98].setRotationPoint(-124F, -65.5F, 66F);
		rightWingModel[98].rotateAngleX = 0.78539816F;
	}

	private void inityawFlapModel_1()
	{
		yawFlapModel[0] = new ModelRendererTurbo(this, 1137, 105, textureX, textureY); // Box 84
		yawFlapModel[1] = new ModelRendererTurbo(this, 1905, 105, textureX, textureY); // Box 85
		yawFlapModel[2] = new ModelRendererTurbo(this, 297, 129, textureX, textureY); // Box 86
		yawFlapModel[3] = new ModelRendererTurbo(this, 209, 201, textureX, textureY); // Box 275
		yawFlapModel[4] = new ModelRendererTurbo(this, 809, 265, textureX, textureY); // Box 276
		yawFlapModel[5] = new ModelRendererTurbo(this, 1, 425, textureX, textureY); // Box 277

		yawFlapModel[0].addShapeBox(0F, 0F, 0F, 14, 13, 10, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 4F, 0F, -2F, -3F, -4F, -3F, -3F, -4F, -5F, 4F, 0F, -6F); // Box 84
		yawFlapModel[0].setRotationPoint(190F, -74F, -93F);

		yawFlapModel[1].addShapeBox(0F, 0F, 0F, 14, 16, 10, 0F,0F, 0F, -3F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 85
		yawFlapModel[1].setRotationPoint(190F, -90F, -93F);

		yawFlapModel[2].addShapeBox(0F, 0F, 0F, 14, 52, 10, 0F,4F, 0F, -18F, -9F, -8F, -17F, -9F, -8F, 9F, 4F, 0F, 10F, 0F, 0F, -3F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 3F); // Box 86
		yawFlapModel[2].setRotationPoint(190F, -142F, -93F);

		yawFlapModel[3].addShapeBox(0F, 0F, 0F, 14, 13, 10, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, 0F, 4F, 0F, -6F, -3F, -4F, -5F, -3F, -4F, -3F, 4F, 0F, -2F); // Box 275
		yawFlapModel[3].setRotationPoint(190F, -74F, 83F);

		yawFlapModel[4].addShapeBox(0F, 0F, 0F, 14, 16, 10, 0F,0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 276
		yawFlapModel[4].setRotationPoint(190F, -90F, 83F);

		yawFlapModel[5].addShapeBox(0F, 0F, 0F, 14, 52, 10, 0F,4F, 0F, 10F, -9F, -8F, 9F, -9F, -8F, -17F, 4F, 0F, -18F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -3F); // Box 277
		yawFlapModel[5].setRotationPoint(190F, -142F, 83F);
	}

	private void initpitchFlapLeftModel_1()
	{
		pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 689, 169, textureX, textureY); // Box 76

		pitchFlapLeftModel[0].addShapeBox(0F, 0F, 0F, 16, 16, 78, 0F,0F, 1F, 0F, 0F, -6F, -10F, 0F, -18F, -28F, 0F, -21F, 0F, 0F, -7F, 0F, 0F, -9F, -10F, 0F, 3F, -28F, 0F, 15F, 0F); // Box 76
		pitchFlapLeftModel[0].setRotationPoint(197F, -90F, -83F);
	}

	private void initpitchFlapRightModel_1()
	{
		pitchFlapRightModel[0] = new ModelRendererTurbo(this, 1, 425, textureX, textureY); // Box 267

		pitchFlapRightModel[0].addShapeBox(0F, 0F, 0F, 16, 16, 78, 0F,0F, -21F, 0F, 0F, -18F, -28F, 0F, -6F, -10F, 0F, 1F, 0F, 0F, 15F, 0F, 0F, 3F, -28F, 0F, -9F, -10F, 0F, -7F, 0F); // Box 267
		pitchFlapRightModel[0].setRotationPoint(197F, -90F, 5F);
	}

	private void initpitchFlapLeftWingModel_1()
	{
		pitchFlapLeftWingModel[0] = new ModelRendererTurbo(this, 1217, 137, textureX, textureY); // Box 68
		pitchFlapLeftWingModel[1] = new ModelRendererTurbo(this, 1633, 129, textureX, textureY); // Box 70

		pitchFlapLeftWingModel[0].addShapeBox(0F, 0F, 0F, 16, 17, 100, 0F,0F, 0F, 0F, 0F, -7F, 0F, 15F, -10F, 0F, -10F, 0F, 0F, 0F, -4F, 0F, 0F, -8F, 0F, 15F, -5F, 0F, -10F, 0F, 0F); // Box 68
		pitchFlapLeftWingModel[0].setRotationPoint(-42F, -80F, -266F);

		pitchFlapLeftWingModel[1].addShapeBox(0F, 0F, 0F, 21, 13, 60, 0F,0F, -1F, 0F, -7F, -6F, 0F, 0F, -7F, 0F, -5F, 0F, 0F, 0F, -2F, 0F, -7F, -5F, 0F, 0F, -4F, 0F, -5F, 0F, 0F); // Box 70
		pitchFlapLeftWingModel[1].setRotationPoint(-47F, -80F, -326F);
	}

	private void initpitchFlapRightWingModel_1()
	{
		pitchFlapRightWingModel[0] = new ModelRendererTurbo(this, 833, 377, textureX, textureY); // Box 259
		pitchFlapRightWingModel[1] = new ModelRendererTurbo(this, 377, 377, textureX, textureY); // Box 261

		pitchFlapRightWingModel[0].addShapeBox(0F, 0F, 0F, 16, 17, 100, 0F,-10F, 0F, 0F, 15F, -10F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 15F, -5F, 0F, 0F, -8F, 0F, 0F, -4F, 0F); // Box 259
		pitchFlapRightWingModel[0].setRotationPoint(-42F, -80F, 166F);

		pitchFlapRightWingModel[1].addShapeBox(0F, 0F, 0F, 21, 13, 60, 0F,-5F, 0F, 0F, 0F, -7F, 0F, -7F, -6F, 0F, 0F, -1F, 0F, -5F, 0F, 0F, 0F, -4F, 0F, -7F, -5F, 0F, 0F, -2F, 0F); // Box 261
		pitchFlapRightWingModel[1].setRotationPoint(-47F, -80F, 266F);
	}

	private void initplaneModeParts_1()
	{
		planeModeParts[0] = new ModelRendererTurbo(this, 1865, 177, textureX, textureY); // Box 239
		planeModeParts[1] = new ModelRendererTurbo(this, 1001, 89, textureX, textureY); // Box 240
		planeModeParts[2] = new ModelRendererTurbo(this, 1801, 17, textureX, textureY); // Box 241
		planeModeParts[3] = new ModelRendererTurbo(this, 1961, 17, textureX, textureY); // Box 242
		planeModeParts[4] = new ModelRendererTurbo(this, 1665, 129, textureX, textureY); // Box 243
		planeModeParts[5] = new ModelRendererTurbo(this, 1073, 233, textureX, textureY); // Box 244
		planeModeParts[6] = new ModelRendererTurbo(this, 1169, 49, textureX, textureY); // Box 245
		planeModeParts[7] = new ModelRendererTurbo(this, 129, 225, textureX, textureY); // Box 246
		planeModeParts[8] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 247
		planeModeParts[9] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 248
		planeModeParts[10] = new ModelRendererTurbo(this, 289, 49, textureX, textureY); // Box 250
		planeModeParts[11] = new ModelRendererTurbo(this, 2033, 89, textureX, textureY); // Box 251
		planeModeParts[12] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 252
		planeModeParts[13] = new ModelRendererTurbo(this, 569, 33, textureX, textureY); // Box 253
		planeModeParts[14] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 263
		planeModeParts[15] = new ModelRendererTurbo(this, 1961, 1, textureX, textureY); // Box 264
		planeModeParts[16] = new ModelRendererTurbo(this, 689, 17, textureX, textureY); // Box 962
		planeModeParts[17] = new ModelRendererTurbo(this, 1313, 17, textureX, textureY); // Box 964
		planeModeParts[18] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 966
		planeModeParts[19] = new ModelRendererTurbo(this, 569, 9, textureX, textureY); // Box 782
		planeModeParts[20] = new ModelRendererTurbo(this, 1617, 9, textureX, textureY); // Box 783
		planeModeParts[21] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 786
		planeModeParts[22] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 789
		planeModeParts[23] = new ModelRendererTurbo(this, 969, 9, textureX, textureY); // Box 791
		planeModeParts[24] = new ModelRendererTurbo(this, 1569, 9, textureX, textureY); // Box 792
		planeModeParts[25] = new ModelRendererTurbo(this, 1913, 177, textureX, textureY); // Box 427
		planeModeParts[26] = new ModelRendererTurbo(this, 881, 169, textureX, textureY); // Box 428
		planeModeParts[27] = new ModelRendererTurbo(this, 1441, 33, textureX, textureY); // Box 429
		planeModeParts[28] = new ModelRendererTurbo(this, 1689, 33, textureX, textureY); // Box 430
		planeModeParts[29] = new ModelRendererTurbo(this, 1449, 177, textureX, textureY); // Box 431
		planeModeParts[30] = new ModelRendererTurbo(this, 1, 265, textureX, textureY); // Box 432
		planeModeParts[31] = new ModelRendererTurbo(this, 249, 89, textureX, textureY); // Box 433
		planeModeParts[32] = new ModelRendererTurbo(this, 1993, 273, textureX, textureY); // Box 434
		planeModeParts[33] = new ModelRendererTurbo(this, 1425, 41, textureX, textureY); // Box 435
		planeModeParts[34] = new ModelRendererTurbo(this, 2041, 41, textureX, textureY); // Box 436
		planeModeParts[35] = new ModelRendererTurbo(this, 1601, 97, textureX, textureY); // Box 437
		planeModeParts[36] = new ModelRendererTurbo(this, 1609, 97, textureX, textureY); // Box 438
		planeModeParts[37] = new ModelRendererTurbo(this, 1833, 33, textureX, textureY); // Box 439
		planeModeParts[38] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 440
		planeModeParts[39] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 441
		planeModeParts[40] = new ModelRendererTurbo(this, 921, 41, textureX, textureY); // Box 442
		planeModeParts[41] = new ModelRendererTurbo(this, 385, 49, textureX, textureY); // Box 443
		planeModeParts[42] = new ModelRendererTurbo(this, 729, 17, textureX, textureY); // Box 444
		planeModeParts[43] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 445
		planeModeParts[44] = new ModelRendererTurbo(this, 377, 193, textureX, textureY); // Box 446
		planeModeParts[45] = new ModelRendererTurbo(this, 1761, 177, textureX, textureY); // Box 447
		planeModeParts[46] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 448
		planeModeParts[47] = new ModelRendererTurbo(this, 1377, 57, textureX, textureY); // Box 449
		planeModeParts[48] = new ModelRendererTurbo(this, 425, 193, textureX, textureY); // Box 450
		planeModeParts[49] = new ModelRendererTurbo(this, 2017, 273, textureX, textureY); // Box 451
		planeModeParts[50] = new ModelRendererTurbo(this, 1785, 97, textureX, textureY); // Box 452
		planeModeParts[51] = new ModelRendererTurbo(this, 433, 297, textureX, textureY); // Box 453
		planeModeParts[52] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 454
		planeModeParts[53] = new ModelRendererTurbo(this, 777, 73, textureX, textureY); // Box 455
		planeModeParts[54] = new ModelRendererTurbo(this, 361, 129, textureX, textureY); // Box 456
		planeModeParts[55] = new ModelRendererTurbo(this, 1577, 145, textureX, textureY); // Box 457
		planeModeParts[56] = new ModelRendererTurbo(this, 1081, 73, textureX, textureY); // Box 458
		planeModeParts[57] = new ModelRendererTurbo(this, 1169, 73, textureX, textureY); // Box 459
		planeModeParts[58] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 460
		planeModeParts[59] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 461
		planeModeParts[60] = new ModelRendererTurbo(this, 713, 49, textureX, textureY); // Box 462
		planeModeParts[61] = new ModelRendererTurbo(this, 729, 49, textureX, textureY); // Box 463
		planeModeParts[62] = new ModelRendererTurbo(this, 785, 49, textureX, textureY); // Box 464
		planeModeParts[63] = new ModelRendererTurbo(this, 985, 33, textureX, textureY); // Box 465
		planeModeParts[64] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 466
		planeModeParts[65] = new ModelRendererTurbo(this, 1785, 49, textureX, textureY); // Box 467
		planeModeParts[66] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Box 468
		planeModeParts[67] = new ModelRendererTurbo(this, 1289, 25, textureX, textureY); // Box 469
		planeModeParts[68] = new ModelRendererTurbo(this, 1417, 41, textureX, textureY); // Box 470
		planeModeParts[69] = new ModelRendererTurbo(this, 1577, 201, textureX, textureY); // Box 471
		planeModeParts[70] = new ModelRendererTurbo(this, 449, 193, textureX, textureY); // Box 472
		planeModeParts[71] = new ModelRendererTurbo(this, 1233, 73, textureX, textureY); // Box 473
		planeModeParts[72] = new ModelRendererTurbo(this, 1697, 73, textureX, textureY); // Box 474
		planeModeParts[73] = new ModelRendererTurbo(this, 1617, 193, textureX, textureY); // Box 475
		planeModeParts[74] = new ModelRendererTurbo(this, 665, 297, textureX, textureY); // Box 476
		planeModeParts[75] = new ModelRendererTurbo(this, 481, 105, textureX, textureY); // Box 477
		planeModeParts[76] = new ModelRendererTurbo(this, 457, 297, textureX, textureY); // Box 478
		planeModeParts[77] = new ModelRendererTurbo(this, 1361, 89, textureX, textureY); // Box 479
		planeModeParts[78] = new ModelRendererTurbo(this, 113, 105, textureX, textureY); // Box 480
		planeModeParts[79] = new ModelRendererTurbo(this, 1737, 153, textureX, textureY); // Box 481
		planeModeParts[80] = new ModelRendererTurbo(this, 1745, 153, textureX, textureY); // Box 482
		planeModeParts[81] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 483
		planeModeParts[82] = new ModelRendererTurbo(this, 1609, 81, textureX, textureY); // Box 484
		planeModeParts[83] = new ModelRendererTurbo(this, 433, 65, textureX, textureY); // Box 485
		planeModeParts[84] = new ModelRendererTurbo(this, 497, 65, textureX, textureY); // Box 486
		planeModeParts[85] = new ModelRendererTurbo(this, 569, 65, textureX, textureY); // Box 487
		planeModeParts[86] = new ModelRendererTurbo(this, 2033, 41, textureX, textureY); // Box 488
		planeModeParts[87] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 489

		planeModeParts[0].addShapeBox(0F, 1F, 0F, 10, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
		planeModeParts[0].setRotationPoint(-179F, -29F, -14F);
		planeModeParts[0].rotateAngleZ = -0.10471976F;

		planeModeParts[1].addShapeBox(9F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		planeModeParts[1].setRotationPoint(-179F, -29F, -14F);
		planeModeParts[1].rotateAngleZ = -0.10471976F;

		planeModeParts[2].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		planeModeParts[2].setRotationPoint(-179F, -29F, -14F);
		planeModeParts[2].rotateAngleZ = -0.10471976F;

		planeModeParts[3].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		planeModeParts[3].setRotationPoint(-179F, -29F, -5F);
		planeModeParts[3].rotateAngleZ = -0.10471976F;

		planeModeParts[4].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		planeModeParts[4].setRotationPoint(-179F, -29F, -14F);
		planeModeParts[4].rotateAngleZ = -0.10471976F;

		planeModeParts[5].addShapeBox(0F, 0F, 0F, 1, 13, 10, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		planeModeParts[5].setRotationPoint(-170F, -41F, -14F);

		planeModeParts[6].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		planeModeParts[6].setRotationPoint(-168F, -45F, -12F);

		planeModeParts[7].addShapeBox(0F, 0F, 0F, 1, 13, 8, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 246
		planeModeParts[7].setRotationPoint(-171F, -40F, -13F);

		planeModeParts[8].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		planeModeParts[8].setRotationPoint(-171.3F, -40.3F, -11F);

		planeModeParts[9].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		planeModeParts[9].setRotationPoint(-171.3F, -40.3F, -8F);

		planeModeParts[10].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 250
		planeModeParts[10].setRotationPoint(-170F, -38F, -13F);

		planeModeParts[11].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 251
		planeModeParts[11].setRotationPoint(-170F, -38F, -6F);

		planeModeParts[12].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 252
		planeModeParts[12].setRotationPoint(-176F, -28F, -15F);
		planeModeParts[12].rotateAngleZ = 0.78539816F;

		planeModeParts[13].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 253
		planeModeParts[13].setRotationPoint(-176F, -28F, -4F);
		planeModeParts[13].rotateAngleZ = 0.78539816F;

		planeModeParts[14].addShapeBox(-1F, -1F, 0F, 2, 11, 2, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 263
		planeModeParts[14].setRotationPoint(-180.5F, -33.25F, -10F);
		planeModeParts[14].rotateAngleZ = -1.13446401F;

		planeModeParts[15].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 264
		planeModeParts[15].setRotationPoint(-180F, -37F, -9.5F);

		planeModeParts[16].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 962
		planeModeParts[16].setRotationPoint(-168.5F, -44.5F, -10.5F);

		planeModeParts[17].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 964
		planeModeParts[17].setRotationPoint(-168.5F, -43.5F, -10.5F);

		planeModeParts[18].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 966
		planeModeParts[18].setRotationPoint(-168.5F, -42.5F, -10.5F);

		planeModeParts[19].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 782
		planeModeParts[19].setRotationPoint(-175F, -27F, -13F);

		planeModeParts[20].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 783
		planeModeParts[20].setRotationPoint(-175F, -27F, -6F);

		planeModeParts[21].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 786
		planeModeParts[21].setRotationPoint(-180F, -36.75F, -8.5F);

		planeModeParts[22].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 789
		planeModeParts[22].setRotationPoint(-180F, -36.75F, -12.5F);

		planeModeParts[23].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 791
		planeModeParts[23].setRotationPoint(-180F, -39.75F, -12.5F);

		planeModeParts[24].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 792
		planeModeParts[24].setRotationPoint(-180F, -39.75F, -6.5F);

		planeModeParts[25].addShapeBox(0F, 1F, 0F, 10, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 427
		planeModeParts[25].setRotationPoint(-159F, -29F, -14F);
		planeModeParts[25].rotateAngleZ = -0.10471976F;

		planeModeParts[26].addShapeBox(9F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 428
		planeModeParts[26].setRotationPoint(-159F, -29F, -14F);
		planeModeParts[26].rotateAngleZ = -0.10471976F;

		planeModeParts[27].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 429
		planeModeParts[27].setRotationPoint(-159F, -29F, -14F);
		planeModeParts[27].rotateAngleZ = -0.10471976F;

		planeModeParts[28].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 430
		planeModeParts[28].setRotationPoint(-159F, -29F, -5F);
		planeModeParts[28].rotateAngleZ = -0.10471976F;

		planeModeParts[29].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 431
		planeModeParts[29].setRotationPoint(-159F, -29F, -14F);
		planeModeParts[29].rotateAngleZ = -0.10471976F;

		planeModeParts[30].addShapeBox(0F, 0F, 0F, 1, 13, 10, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 432
		planeModeParts[30].setRotationPoint(-150F, -41F, -14F);

		planeModeParts[31].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 433
		planeModeParts[31].setRotationPoint(-148F, -45F, -12F);

		planeModeParts[32].addShapeBox(0F, 0F, 0F, 1, 13, 8, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 434
		planeModeParts[32].setRotationPoint(-151F, -40F, -13F);

		planeModeParts[33].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 435
		planeModeParts[33].setRotationPoint(-151.3F, -40.3F, -11F);

		planeModeParts[34].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 436
		planeModeParts[34].setRotationPoint(-151.3F, -40.3F, -8F);

		planeModeParts[35].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 437
		planeModeParts[35].setRotationPoint(-150F, -38F, -13F);

		planeModeParts[36].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 438
		planeModeParts[36].setRotationPoint(-150F, -38F, -6F);

		planeModeParts[37].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 439
		planeModeParts[37].setRotationPoint(-156F, -28F, -15F);
		planeModeParts[37].rotateAngleZ = 0.78539816F;

		planeModeParts[38].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 440
		planeModeParts[38].setRotationPoint(-156F, -28F, -4F);
		planeModeParts[38].rotateAngleZ = 0.78539816F;

		planeModeParts[39].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 441
		planeModeParts[39].setRotationPoint(-148.5F, -44.5F, -10.5F);

		planeModeParts[40].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 442
		planeModeParts[40].setRotationPoint(-148.5F, -43.5F, -10.5F);

		planeModeParts[41].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 443
		planeModeParts[41].setRotationPoint(-148.5F, -42.5F, -10.5F);

		planeModeParts[42].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 444
		planeModeParts[42].setRotationPoint(-155F, -27F, -13F);

		planeModeParts[43].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 445
		planeModeParts[43].setRotationPoint(-155F, -27F, -6F);

		planeModeParts[44].addShapeBox(0F, 1F, 0F, 10, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 446
		planeModeParts[44].setRotationPoint(-179F, -29F, 4F);
		planeModeParts[44].rotateAngleZ = -0.10471976F;

		planeModeParts[45].addShapeBox(9F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 447
		planeModeParts[45].setRotationPoint(-179F, -29F, 4F);
		planeModeParts[45].rotateAngleZ = -0.10471976F;

		planeModeParts[46].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 448
		planeModeParts[46].setRotationPoint(-179F, -29F, 13F);
		planeModeParts[46].rotateAngleZ = -0.10471976F;

		planeModeParts[47].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 449
		planeModeParts[47].setRotationPoint(-179F, -29F, 4F);
		planeModeParts[47].rotateAngleZ = -0.10471976F;

		planeModeParts[48].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 450
		planeModeParts[48].setRotationPoint(-179F, -29F, 4F);
		planeModeParts[48].rotateAngleZ = -0.10471976F;

		planeModeParts[49].addShapeBox(0F, 0F, 0F, 1, 13, 10, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 451
		planeModeParts[49].setRotationPoint(-170F, -41F, 4F);

		planeModeParts[50].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 452
		planeModeParts[50].setRotationPoint(-168F, -45F, 6F);

		planeModeParts[51].addShapeBox(0F, 0F, 0F, 1, 13, 8, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 453
		planeModeParts[51].setRotationPoint(-171F, -40F, 5F);

		planeModeParts[52].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 454
		planeModeParts[52].setRotationPoint(-171.3F, -40.3F, 10F);

		planeModeParts[53].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 455
		planeModeParts[53].setRotationPoint(-171.3F, -40.3F, 7F);

		planeModeParts[54].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 456
		planeModeParts[54].setRotationPoint(-170F, -38F, 12F);

		planeModeParts[55].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 457
		planeModeParts[55].setRotationPoint(-170F, -38F, 5F);

		planeModeParts[56].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 458
		planeModeParts[56].setRotationPoint(-176F, -28F, 14F);
		planeModeParts[56].rotateAngleZ = 0.78539816F;

		planeModeParts[57].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 459
		planeModeParts[57].setRotationPoint(-176F, -28F, 3F);
		planeModeParts[57].rotateAngleZ = 0.78539816F;

		planeModeParts[58].addShapeBox(-1F, -1F, 0F, 2, 11, 2, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 460
		planeModeParts[58].setRotationPoint(-180.5F, -33.25F, 8F);
		planeModeParts[58].rotateAngleZ = -1.13446401F;

		planeModeParts[59].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 461
		planeModeParts[59].setRotationPoint(-180F, -37F, 8.5F);

		planeModeParts[60].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 462
		planeModeParts[60].setRotationPoint(-168.5F, -44.5F, 7.5F);

		planeModeParts[61].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 463
		planeModeParts[61].setRotationPoint(-168.5F, -43.5F, 7.5F);

		planeModeParts[62].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 464
		planeModeParts[62].setRotationPoint(-168.5F, -42.5F, 7.5F);

		planeModeParts[63].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 465
		planeModeParts[63].setRotationPoint(-175F, -27F, 12F);

		planeModeParts[64].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 466
		planeModeParts[64].setRotationPoint(-175F, -27F, 5F);

		planeModeParts[65].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 467
		planeModeParts[65].setRotationPoint(-180F, -36.75F, 5.5F);

		planeModeParts[66].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 468
		planeModeParts[66].setRotationPoint(-180F, -36.75F, 9.5F);

		planeModeParts[67].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 469
		planeModeParts[67].setRotationPoint(-180F, -39.75F, 11.5F);

		planeModeParts[68].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 470
		planeModeParts[68].setRotationPoint(-180F, -39.75F, 5.5F);

		planeModeParts[69].addShapeBox(0F, 1F, 0F, 10, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 471
		planeModeParts[69].setRotationPoint(-159F, -29F, 4F);
		planeModeParts[69].rotateAngleZ = -0.10471976F;

		planeModeParts[70].addShapeBox(9F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 472
		planeModeParts[70].setRotationPoint(-159F, -29F, 4F);
		planeModeParts[70].rotateAngleZ = -0.10471976F;

		planeModeParts[71].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 473
		planeModeParts[71].setRotationPoint(-159F, -29F, 13F);
		planeModeParts[71].rotateAngleZ = -0.10471976F;

		planeModeParts[72].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 474
		planeModeParts[72].setRotationPoint(-159F, -29F, 4F);
		planeModeParts[72].rotateAngleZ = -0.10471976F;

		planeModeParts[73].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 475
		planeModeParts[73].setRotationPoint(-159F, -29F, 4F);
		planeModeParts[73].rotateAngleZ = -0.10471976F;

		planeModeParts[74].addShapeBox(0F, 0F, 0F, 1, 13, 10, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 476
		planeModeParts[74].setRotationPoint(-150F, -41F, 4F);

		planeModeParts[75].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 477
		planeModeParts[75].setRotationPoint(-148F, -45F, 6F);

		planeModeParts[76].addShapeBox(0F, 0F, 0F, 1, 13, 8, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 478
		planeModeParts[76].setRotationPoint(-151F, -40F, 5F);

		planeModeParts[77].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 479
		planeModeParts[77].setRotationPoint(-151.3F, -40.3F, 10F);

		planeModeParts[78].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 480
		planeModeParts[78].setRotationPoint(-151.3F, -40.3F, 7F);

		planeModeParts[79].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 481
		planeModeParts[79].setRotationPoint(-150F, -38F, 12F);

		planeModeParts[80].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 482
		planeModeParts[80].setRotationPoint(-150F, -38F, 5F);

		planeModeParts[81].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 483
		planeModeParts[81].setRotationPoint(-156F, -28F, 14F);
		planeModeParts[81].rotateAngleZ = 0.78539816F;

		planeModeParts[82].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 484
		planeModeParts[82].setRotationPoint(-156F, -28F, 3F);
		planeModeParts[82].rotateAngleZ = 0.78539816F;

		planeModeParts[83].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 485
		planeModeParts[83].setRotationPoint(-148.5F, -44.5F, 7.5F);

		planeModeParts[84].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 486
		planeModeParts[84].setRotationPoint(-148.5F, -43.5F, 7.5F);

		planeModeParts[85].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 487
		planeModeParts[85].setRotationPoint(-148.5F, -42.5F, 7.5F);

		planeModeParts[86].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 488
		planeModeParts[86].setRotationPoint(-155F, -27F, 12F);

		planeModeParts[87].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 489
		planeModeParts[87].setRotationPoint(-155F, -27F, 5F);
	}

	private void initPropeller()
	{
		propellerModels = new ModelRendererTurbo[2][4];
		propellerModels[0] = makeProp1(-127F, -66F, -66F);
		propellerModels[1] = makeProp2(-127F, -66F, 66F);
	}

	private ModelRendererTurbo[] makeProp1(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[4];
		prop[0] = new ModelRendererTurbo(this, 0, 525, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 525, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 0, 525, textureX, textureY);
		prop[3] = new ModelRendererTurbo(this, 0, 525, textureX, textureY);
		prop[0].addBox(-1F, -45F, -3F, 2, 45, 6, 0.0F);
		prop[1].addBox(-1F, -45F, -3F, 2, 45, 6, 0.0F);
		prop[2].addBox(-1F, -45F, -3F, 2, 45, 6, 0.0F);
		prop[3].addBox(-1F, -45F, -3F, 2, 45, 6, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		prop[3].setRotationPoint(i, j, k);
		return prop;
	}

	private ModelRendererTurbo[] makeProp2(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[4];
		prop[0] = new ModelRendererTurbo(this, 0, 525, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 525, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 0, 525, textureX, textureY);
		prop[3] = new ModelRendererTurbo(this, 0, 525, textureX, textureY);
		prop[0].addBox(-1F, -45F, -3F, 2, 45, 6, 0.0F);
		prop[1].addBox(-1F, -45F, -3F, 2, 45, 6, 0.0F);
		prop[2].addBox(-1F, -45F, -3F, 2, 45, 6, 0.0F);
		prop[3].addBox(-1F, -45F, -3F, 2, 45, 6, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		prop[3].setRotationPoint(i, j, k);
		return prop;
	}

	private void initGuns() {
	}
	{

		// Passenger 3
		ModelRendererTurbo[][] gun_2_Model = new ModelRendererTurbo[3][];

		gun_2_Model[0] = new ModelRendererTurbo[64];
		gun_2_Model[0][0] = new ModelRendererTurbo(this, 1, 961, textureX, textureY); // Box 0
		gun_2_Model[0][1] = new ModelRendererTurbo(this, 49, 961, textureX, textureY); // Box 3
		gun_2_Model[0][2] = new ModelRendererTurbo(this, 57, 961, textureX, textureY); // Box 4
		gun_2_Model[0][3] = new ModelRendererTurbo(this, 89, 961, textureX, textureY); // Box 7
		gun_2_Model[0][4] = new ModelRendererTurbo(this, 97, 961, textureX, textureY); // Box 8
		gun_2_Model[0][5] = new ModelRendererTurbo(this, 105, 961, textureX, textureY); // Box 13
		gun_2_Model[0][6] = new ModelRendererTurbo(this, 129, 961, textureX, textureY); // Box 14
		gun_2_Model[0][7] = new ModelRendererTurbo(this, 153, 961, textureX, textureY); // Box 15
		gun_2_Model[0][8] = new ModelRendererTurbo(this, 177, 961, textureX, textureY); // Box 16
		gun_2_Model[0][9] = new ModelRendererTurbo(this, 209, 961, textureX, textureY); // Box 17
		gun_2_Model[0][10] = new ModelRendererTurbo(this, 233, 961, textureX, textureY); // Box 18
		gun_2_Model[0][11] = new ModelRendererTurbo(this, 257, 961, textureX, textureY); // Box 19
		gun_2_Model[0][12] = new ModelRendererTurbo(this, 281, 961, textureX, textureY); // Box 20
		gun_2_Model[0][13] = new ModelRendererTurbo(this, 297, 961, textureX, textureY); // Box 21
		gun_2_Model[0][14] = new ModelRendererTurbo(this, 321, 961, textureX, textureY); // Box 22
		gun_2_Model[0][15] = new ModelRendererTurbo(this, 217, 961, textureX, textureY); // Box 23
		gun_2_Model[0][16] = new ModelRendererTurbo(this, 241, 961, textureX, textureY); // Box 24
		gun_2_Model[0][17] = new ModelRendererTurbo(this, 1, 961, textureX, textureY); // Box 30
		gun_2_Model[0][18] = new ModelRendererTurbo(this, 33, 961, textureX, textureY); // Box 31
		gun_2_Model[0][19] = new ModelRendererTurbo(this, 41, 961, textureX, textureY); // Box 32
		gun_2_Model[0][20] = new ModelRendererTurbo(this, 105, 961, textureX, textureY); // Box 33
		gun_2_Model[0][21] = new ModelRendererTurbo(this, 465, 961, textureX, textureY); // Box 34
		gun_2_Model[0][22] = new ModelRendererTurbo(this, 273, 961, textureX, textureY); // Box 35
		gun_2_Model[0][23] = new ModelRendererTurbo(this, 473, 961, textureX, textureY); // Box 36
		gun_2_Model[0][24] = new ModelRendererTurbo(this, 481, 961, textureX, textureY); // Box 37
		gun_2_Model[0][25] = new ModelRendererTurbo(this, 489, 961, textureX, textureY); // Box 39
		gun_2_Model[0][26] = new ModelRendererTurbo(this, 577, 961, textureX, textureY); // Box 46
		gun_2_Model[0][27] = new ModelRendererTurbo(this, 593, 961, textureX, textureY); // Box 39
		gun_2_Model[0][28] = new ModelRendererTurbo(this, 609, 961, textureX, textureY); // Box 40
		gun_2_Model[0][29] = new ModelRendererTurbo(this, 585, 961, textureX, textureY); // Box 41
		gun_2_Model[0][30] = new ModelRendererTurbo(this, 617, 961, textureX, textureY); // Box 42
		gun_2_Model[0][31] = new ModelRendererTurbo(this, 633, 961, textureX, textureY); // Box 43
		gun_2_Model[0][32] = new ModelRendererTurbo(this, 625, 961, textureX, textureY); // Box 44
		gun_2_Model[0][33] = new ModelRendererTurbo(this, 649, 961, textureX, textureY); // Box 45
		gun_2_Model[0][34] = new ModelRendererTurbo(this, 657, 961, textureX, textureY); // Box 46
		gun_2_Model[0][35] = new ModelRendererTurbo(this, 673, 961, textureX, textureY); // Box 47
		gun_2_Model[0][36] = new ModelRendererTurbo(this, 689, 961, textureX, textureY); // Box 48
		gun_2_Model[0][37] = new ModelRendererTurbo(this, 705, 961, textureX, textureY); // Box 49
		gun_2_Model[0][38] = new ModelRendererTurbo(this, 713, 961, textureX, textureY); // Box 50
		gun_2_Model[0][39] = new ModelRendererTurbo(this, 721, 961, textureX, textureY); // Box 51
		gun_2_Model[0][40] = new ModelRendererTurbo(this, 729, 961, textureX, textureY); // Box 52
		gun_2_Model[0][41] = new ModelRendererTurbo(this, 737, 961, textureX, textureY); // Box 53
		gun_2_Model[0][42] = new ModelRendererTurbo(this, 745, 961, textureX, textureY); // Box 54
		gun_2_Model[0][43] = new ModelRendererTurbo(this, 753, 961, textureX, textureY); // Box 56
		gun_2_Model[0][44] = new ModelRendererTurbo(this, 761, 961, textureX, textureY); // Box 57
		gun_2_Model[0][45] = new ModelRendererTurbo(this, 769, 961, textureX, textureY); // Box 58
		gun_2_Model[0][46] = new ModelRendererTurbo(this, 777, 961, textureX, textureY); // Box 59
		gun_2_Model[0][47] = new ModelRendererTurbo(this, 785, 961, textureX, textureY); // Box 60
		gun_2_Model[0][48] = new ModelRendererTurbo(this, 793, 961, textureX, textureY); // Box 61
		gun_2_Model[0][49] = new ModelRendererTurbo(this, 793, 961, textureX, textureY); // Box 62
		gun_2_Model[0][50] = new ModelRendererTurbo(this, 817, 961, textureX, textureY); // Box 63
		gun_2_Model[0][51] = new ModelRendererTurbo(this, 809, 961, textureX, textureY); // Box 64
		gun_2_Model[0][52] = new ModelRendererTurbo(this, 825, 961, textureX, textureY); // Box 65
		gun_2_Model[0][53] = new ModelRendererTurbo(this, 833, 961, textureX, textureY); // Box 66
		gun_2_Model[0][54] = new ModelRendererTurbo(this, 833, 961, textureX, textureY); // Box 67
		gun_2_Model[0][55] = new ModelRendererTurbo(this, 857, 961, textureX, textureY); // Box 68
		gun_2_Model[0][56] = new ModelRendererTurbo(this, 849, 961, textureX, textureY); // Box 69
		gun_2_Model[0][57] = new ModelRendererTurbo(this, 865, 961, textureX, textureY); // Box 70
		gun_2_Model[0][58] = new ModelRendererTurbo(this, 873, 961, textureX, textureY); // Box 71
		gun_2_Model[0][59] = new ModelRendererTurbo(this, 873, 961, textureX, textureY); // Box 72
		gun_2_Model[0][60] = new ModelRendererTurbo(this, 897, 961, textureX, textureY); // Box 73
		gun_2_Model[0][61] = new ModelRendererTurbo(this, 889, 961, textureX, textureY); // Box 74
		gun_2_Model[0][62] = new ModelRendererTurbo(this, 905, 961, textureX, textureY); // Box 75
		gun_2_Model[0][63] = new ModelRendererTurbo(this, 913, 961, textureX, textureY); // Box 76

		gun_2_Model[0][0].addShapeBox(-5F, 4F, -5F, 10, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0

		gun_2_Model[0][1].addShapeBox(9F, -6F, -2F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3

		gun_2_Model[0][2].addShapeBox(9F, -6F, 1F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4

		gun_2_Model[0][3].addShapeBox(8F, -6F, 3F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7

		gun_2_Model[0][4].addShapeBox(8F, -6F, -4F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8

		gun_2_Model[0][5].addShapeBox(5F, 4F, -5F, 4, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13

		gun_2_Model[0][6].addShapeBox(-5F, 4F, -9F, 10, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14

		gun_2_Model[0][7].addShapeBox(-9F, 4F, -5F, 4, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15

		gun_2_Model[0][8].addShapeBox(-5F, 4F, 5F, 10, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16

		gun_2_Model[0][9].addShapeBox(-9F, 4F, 5F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1.5F); // Box 17

		gun_2_Model[0][10].addShapeBox(-9F, 4F, -9F, 4, 1, 4, 0F,-1.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18

		gun_2_Model[0][11].addShapeBox(5F, 4F, -9F, 4, 1, 4, 0F,0F, 0F, 0F, -1.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19

		gun_2_Model[0][12].addShapeBox(5F, 4F, 5F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1.5F, 0F, 0F, 0F); // Box 20

		gun_2_Model[0][13].addShapeBox(-5F, 4F, -10F, 10, 1, 1, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21

		gun_2_Model[0][14].addShapeBox(-5F, 4F, 9F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 22

		gun_2_Model[0][15].addShapeBox(-10F, 4F, -5F, 1, 1, 10, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 23

		gun_2_Model[0][16].addShapeBox(9F, 4F, -5F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 24

		gun_2_Model[0][17].addShapeBox(9F, -9F, -2F, 1, 3, 1, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30

		gun_2_Model[0][18].addShapeBox(8F, -11F, -2F, 1, 2, 1, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31

		gun_2_Model[0][19].addShapeBox(7F, -11F, -4F, 1, 2, 1, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32

		gun_2_Model[0][20].addShapeBox(8F, -9F, -4F, 1, 3, 1, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33

		gun_2_Model[0][21].addShapeBox(9F, -9F, 1F, 1, 3, 1, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34

		gun_2_Model[0][22].addShapeBox(8F, -11F, 1F, 1, 2, 1, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35

		gun_2_Model[0][23].addShapeBox(7F, -11F, 3F, 1, 2, 1, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36

		gun_2_Model[0][24].addShapeBox(8F, -9F, 3F, 1, 3, 1, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37

		gun_2_Model[0][25].addShapeBox(6F, -11F, -4F, 1, 1, 3, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39

		gun_2_Model[0][26].addShapeBox(6F, -11F, 1F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 46

		gun_2_Model[0][27].addShapeBox(8F, -6F, 4F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 39

		gun_2_Model[0][28].addShapeBox(7F, -6F, 7F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 2F, 0F, -1F); // Box 40

		gun_2_Model[0][29].addShapeBox(2F, -6F, 9F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 41

		gun_2_Model[0][30].addShapeBox(-2F, -6F, 9F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42

		gun_2_Model[0][31].addShapeBox(-8F, -6F, 9F, 6, 1, 1, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 43

		gun_2_Model[0][32].addShapeBox(8F, -6F, -7F, 1, 1, 3, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44

		gun_2_Model[0][33].addShapeBox(7F, -6F, -9F, 1, 1, 2, 0F,2F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45

		gun_2_Model[0][34].addShapeBox(2F, -6F, -10F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 46

		gun_2_Model[0][35].addShapeBox(-2F, -6F, -10F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47

		gun_2_Model[0][36].addShapeBox(-8F, -6F, -10F, 6, 1, 1, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 48

		gun_2_Model[0][37].addShapeBox(5F, -13F, -4F, 1, 2, 1, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49

		gun_2_Model[0][38].addShapeBox(3F, -15F, -4F, 1, 2, 1, 0F,2F, -1F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50

		gun_2_Model[0][39].addShapeBox(4F, -15F, -2F, 1, 2, 1, 0F,3F, -1F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51

		gun_2_Model[0][40].addShapeBox(6F, -13F, -2F, 1, 2, 1, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52

		gun_2_Model[0][41].addShapeBox(5F, -13F, 3F, 1, 2, 1, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53

		gun_2_Model[0][42].addShapeBox(3F, -15F, 3F, 1, 2, 1, 0F,2F, -1F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54

		gun_2_Model[0][43].addShapeBox(6F, -13F, 1F, 1, 2, 1, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56

		gun_2_Model[0][44].addShapeBox(4F, -15F, 1F, 1, 2, 1, 0F,3F, -1F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57

		gun_2_Model[0][45].addShapeBox(0F, -5F, 9F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58

		gun_2_Model[0][46].addShapeBox(0F, -10F, 8F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 59

		gun_2_Model[0][47].addShapeBox(0F, -13F, 6F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 60

		gun_2_Model[0][48].addShapeBox(0F, -15F, 4F, 1, 2, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 61

		gun_2_Model[0][49].addShapeBox(0F, -15F, -4F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62

		gun_2_Model[0][50].addShapeBox(0F, -5F, -10F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63

		gun_2_Model[0][51].addShapeBox(0F, -10F, -9F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 64

		gun_2_Model[0][52].addShapeBox(0F, -13F, -7F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 65

		gun_2_Model[0][53].addShapeBox(0F, -15F, -5F, 1, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 66

		gun_2_Model[0][54].addShapeBox(0F, -15F, -4F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67

		gun_2_Model[0][55].addShapeBox(-4F, -6F, -9F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68

		gun_2_Model[0][56].addShapeBox(-4F, -10F, -8F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 69

		gun_2_Model[0][57].addShapeBox(-4F, -13F, -6F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 70

		gun_2_Model[0][58].addShapeBox(-4F, -15F, -4F, 1, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 71

		gun_2_Model[0][59].addShapeBox(-4F, -15F, -3F, 4, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 72

		gun_2_Model[0][60].addShapeBox(-4F, -6F, 8F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73

		gun_2_Model[0][61].addShapeBox(-4F, -10F, 7F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 74

		gun_2_Model[0][62].addShapeBox(-4F, -13F, 5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 75

		gun_2_Model[0][63].addShapeBox(-4F, -15F, 3F, 1, 2, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 76

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[0])
		{
			gunPart.setRotationPoint(-225F, -24F, 0F);
		}


		gun_2_Model[1] = new ModelRendererTurbo[6];
		gun_2_Model[1][0] = new ModelRendererTurbo(this, 65, 961, textureX, textureY); // Box 5
		gun_2_Model[1][1] = new ModelRendererTurbo(this, 345, 961, textureX, textureY); // Box 25
		gun_2_Model[1][2] = new ModelRendererTurbo(this, 369, 961, textureX, textureY); // Box 26
		gun_2_Model[1][3] = new ModelRendererTurbo(this, 393, 961, textureX, textureY); // Box 27
		gun_2_Model[1][4] = new ModelRendererTurbo(this, 417, 961, textureX, textureY); // Box 28
		gun_2_Model[1][5] = new ModelRendererTurbo(this, 441, 961, textureX, textureY); // Box 29

		gun_2_Model[1][0].addShapeBox(8F, -6F, -3F, 10, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 5

		gun_2_Model[1][1].addShapeBox(8F, -6F, -3.25F, 10, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 25

		gun_2_Model[1][2].addShapeBox(8F, -6F, -2.75F, 10, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 26

		gun_2_Model[1][3].addShapeBox(8F, -6F, 2F, 10, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 27

		gun_2_Model[1][4].addShapeBox(8F, -6F, 2.25F, 10, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 28

		gun_2_Model[1][5].addShapeBox(8F, -6F, 1.75F, 10, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 29

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[1])
		{
			gunPart.setRotationPoint(-225F, -24F, 0F);
		}


		gun_2_Model[2] = new ModelRendererTurbo[6];
		gun_2_Model[2][0] = new ModelRendererTurbo(this, 497, 961, textureX, textureY); // Box 40
		gun_2_Model[2][1] = new ModelRendererTurbo(this, 513, 961, textureX, textureY); // Box 41
		gun_2_Model[2][2] = new ModelRendererTurbo(this, 529, 961, textureX, textureY); // Box 42
		gun_2_Model[2][3] = new ModelRendererTurbo(this, 537, 961, textureX, textureY); // Box 43
		gun_2_Model[2][4] = new ModelRendererTurbo(this, 553, 961, textureX, textureY); // Box 44
		gun_2_Model[2][5] = new ModelRendererTurbo(this, 569, 961, textureX, textureY); // Box 45

		gun_2_Model[2][0].addShapeBox(3F, -6F, -3F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 40

		gun_2_Model[2][1].addShapeBox(3F, -6.5F, -3F, 5, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 41

		gun_2_Model[2][2].addShapeBox(5F, -5.5F, -3.5F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 42

		gun_2_Model[2][3].addShapeBox(3F, -6F, 2F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 43

		gun_2_Model[2][4].addShapeBox(3F, -6.5F, 2F, 5, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 44

		gun_2_Model[2][5].addShapeBox(5F, -5.5F, 1.5F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 45

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[2])
		{
			gunPart.setRotationPoint(-225F, -24F, 0F);
		}


		registerGunModel("NoseGun", gun_2_Model);

		// Passenger 4
		ModelRendererTurbo[][] gun_3_Model = new ModelRendererTurbo[3][];

		gun_3_Model[0] = new ModelRendererTurbo[37];
		gun_3_Model[0][0] = new ModelRendererTurbo(this, 1, 861, textureX, textureY); // Import GT_01
		gun_3_Model[0][1] = new ModelRendererTurbo(this, 9, 861, textureX, textureY); // Import GT_02
		gun_3_Model[0][2] = new ModelRendererTurbo(this, 25, 861, textureX, textureY); // Import GT_03
		gun_3_Model[0][3] = new ModelRendererTurbo(this, 41, 861, textureX, textureY); // Import GT_04
		gun_3_Model[0][4] = new ModelRendererTurbo(this, 65, 861, textureX, textureY); // Import GT_05
		gun_3_Model[0][5] = new ModelRendererTurbo(this, 81, 861, textureX, textureY); // Import GT_06
		gun_3_Model[0][6] = new ModelRendererTurbo(this, 113, 861, textureX, textureY); // Import GT_07
		gun_3_Model[0][7] = new ModelRendererTurbo(this, 97, 861, textureX, textureY); // Import GT_08
		gun_3_Model[0][8] = new ModelRendererTurbo(this, 113, 861, textureX, textureY); // Import GT_09
		gun_3_Model[0][9] = new ModelRendererTurbo(this, 129, 861, textureX, textureY); // Import GT_10
		gun_3_Model[0][10] = new ModelRendererTurbo(this, 137, 861, textureX, textureY); // Import GT_11
		gun_3_Model[0][11] = new ModelRendererTurbo(this, 145, 861, textureX, textureY); // Import GT_12
		gun_3_Model[0][12] = new ModelRendererTurbo(this, 153, 861, textureX, textureY); // Import GT_13
		gun_3_Model[0][13] = new ModelRendererTurbo(this, 161, 861, textureX, textureY); // Import GT_14
		gun_3_Model[0][14] = new ModelRendererTurbo(this, 169, 861, textureX, textureY); // Import GT_15
		gun_3_Model[0][15] = new ModelRendererTurbo(this, 177, 861, textureX, textureY); // Import GT_16
		gun_3_Model[0][16] = new ModelRendererTurbo(this, 185, 861, textureX, textureY); // Import GT_17
		gun_3_Model[0][17] = new ModelRendererTurbo(this, 193, 861, textureX, textureY); // Import GT_18
		gun_3_Model[0][18] = new ModelRendererTurbo(this, 201, 861, textureX, textureY); // Import GT_19
		gun_3_Model[0][19] = new ModelRendererTurbo(this, 217, 861, textureX, textureY); // Import GT_20
		gun_3_Model[0][20] = new ModelRendererTurbo(this, 241, 861, textureX, textureY); // Import GT_21
		gun_3_Model[0][21] = new ModelRendererTurbo(this, 265, 861, textureX, textureY); // Import GT_23
		gun_3_Model[0][22] = new ModelRendererTurbo(this, 273, 861, textureX, textureY); // Import GT_24
		gun_3_Model[0][23] = new ModelRendererTurbo(this, 281, 861, textureX, textureY); // Import GT_25
		gun_3_Model[0][24] = new ModelRendererTurbo(this, 297, 861, textureX, textureY); // Import GT_26
		gun_3_Model[0][25] = new ModelRendererTurbo(this, 313, 861, textureX, textureY); // Import GT_27
		gun_3_Model[0][26] = new ModelRendererTurbo(this, 329, 861, textureX, textureY); // Import GT_28
		gun_3_Model[0][27] = new ModelRendererTurbo(this, 345, 861, textureX, textureY); // Import GT_29
		gun_3_Model[0][28] = new ModelRendererTurbo(this, 353, 861, textureX, textureY); // Import GT_30
		gun_3_Model[0][29] = new ModelRendererTurbo(this, 361, 861, textureX, textureY); // Import GT_31
		gun_3_Model[0][30] = new ModelRendererTurbo(this, 369, 861, textureX, textureY); // Import GT_32
		gun_3_Model[0][31] = new ModelRendererTurbo(this, 289, 861, textureX, textureY); // Import GT_35
		gun_3_Model[0][32] = new ModelRendererTurbo(this, 305, 861, textureX, textureY); // Import GT_36
		gun_3_Model[0][33] = new ModelRendererTurbo(this, 377, 861, textureX, textureY); // Import GT_22
		gun_3_Model[0][34] = new ModelRendererTurbo(this, 417, 861, textureX, textureY); // Import GT_33
		gun_3_Model[0][35] = new ModelRendererTurbo(this, 457, 861, textureX, textureY); // Import GT_34
		gun_3_Model[0][36] = new ModelRendererTurbo(this, 489, 861, textureX, textureY); // Import GT_37

		gun_3_Model[0][0].addBox(-4F, -6.5F, -5F, 4, 1, 2, 0F); // Import GT_01

		gun_3_Model[0][1].addBox(-11F, 2.5F, -5F, 2, 1, 10, 0F); // Import GT_02

		gun_3_Model[0][2].addShapeBox(-11F, 2.5F, -10F, 5, 1, 5, 0F,-5F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F); // Import GT_03

		gun_3_Model[0][3].addBox(-6F, 2.5F, -10F, 12, 1, 2, 0F); // Import GT_04

		gun_3_Model[0][4].addShapeBox(6F, 2.5F, -10F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, -5F, -2F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -5F, -2F, 0F, 0F, 0F, 0F, -3F); // Import GT_05

		gun_3_Model[0][5].addBox(9F, 2.5F, -5F, 2, 1, 10, 0F); // Import GT_06

		gun_3_Model[0][6].addBox(-0.5F, -6.5F, -5F, 1, 1, 10, 0F); // Import GT_07

		gun_3_Model[0][7].addBox(-4F, -6.5F, 3F, 4, 1, 2, 0F); // Import GT_08

		gun_3_Model[0][8].addShapeBox(-0.5F, -2.5F, -9F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import GT_09

		gun_3_Model[0][9].addShapeBox(-10F, -2.5F, -5F, 1, 5, 2, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Import GT_10

		gun_3_Model[0][10].addShapeBox(-4F, -6.5F, -5F, 1, 4, 2, 0F,0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0.5F, 0F, -6F, 0.5F, 0F, 6F, 0F, 0F); // Import GT_11

		gun_3_Model[0][11].addShapeBox(3F, -6.5F, -5F, 1, 4, 1, 0F,-1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, -1F, -0.5F, -6F, 0.5F, 0F, 6F, 0F, 0F, 6F, 0F, -0.5F, -6F, 0.5F, -0.5F); // Import GT_12

		gun_3_Model[0][12].addShapeBox(9F, -2.5F, -5F, 1, 5, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, -1F, 0F, -0.5F); // Import GT_13

		gun_3_Model[0][13].addShapeBox(-0.5F, -6.5F, -5F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0.5F, -4F, 0F, 0.5F, -4F); // Import GT_14

		gun_3_Model[0][14].addShapeBox(-4F, -6.5F, 3F, 1, 4, 2, 0F,0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0.5F, 0F, -6F, 0.5F, 0F, 6F, 0F, 0F); // Import GT_15

		gun_3_Model[0][15].addShapeBox(-10F, -2.5F, 3F, 1, 5, 2, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Import GT_16

		gun_3_Model[0][16].addShapeBox(-0.5F, -6.5F, 4F, 1, 4, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -4F, 0F, 0.5F, -4F, 0F, 0F, 4F, 0F, 0F, 4F); // Import GT_17

		gun_3_Model[0][17].addShapeBox(-0.5F, -2.5F, 8F, 1, 5, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Import GT_18

		gun_3_Model[0][18].addShapeBox(-11F, 2.5F, 5F, 5, 1, 5, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -2F, -5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -2F, -5F, 0F, 0F); // Import GT_19

		gun_3_Model[0][19].addBox(-6F, 2.5F, 8F, 12, 1, 2, 0F); // Import GT_20

		gun_3_Model[0][20].addShapeBox(6F, 2.5F, 5F, 5, 1, 5, 0F,0F, 0F, -3F, -2F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F); // Import GT_21

		gun_3_Model[0][21].addShapeBox(3F, -6.5F, -4F, 1, 4, 1, 0F,-1F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, -1F, 0F, -6F, 0.5F, -0.5F, 6F, 0F, -0.5F, 6F, 0F, 0F, -6F, 0.5F, 0F); // Import GT_23

		gun_3_Model[0][22].addShapeBox(9F, -2.5F, -4F, 1, 5, 1, 0F,0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, -1F, 0F, 0F); // Import GT_24

		gun_3_Model[0][23].addShapeBox(0F, -6.5F, -5F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import GT_25

		gun_3_Model[0][24].addShapeBox(0F, -6.5F, -4F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import GT_26

		gun_3_Model[0][25].addShapeBox(0F, -6.5F, 3F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import GT_27

		gun_3_Model[0][26].addShapeBox(0F, -6.5F, 4F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import GT_28

		gun_3_Model[0][27].addShapeBox(3F, -6.5F, 4F, 1, 4, 1, 0F,-1F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, -1F, 0F, -6F, 0.5F, -0.5F, 6F, 0F, -0.5F, 6F, 0F, 0F, -6F, 0.5F, 0F); // Import GT_29

		gun_3_Model[0][28].addShapeBox(3F, -6.5F, 3F, 1, 4, 1, 0F,-1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, -1F, -0.5F, -6F, 0.5F, 0F, 6F, 0F, 0F, 6F, 0F, -0.5F, -6F, 0.5F, -0.5F); // Import GT_30

		gun_3_Model[0][29].addShapeBox(9F, -2.5F, 3F, 1, 5, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, -1F, 0F, -0.5F); // Import GT_31

		gun_3_Model[0][30].addShapeBox(9F, -2.5F, 4F, 1, 5, 1, 0F,0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, -1F, 0F, 0F); // Import GT_32

		gun_3_Model[0][31].addBox(-0.5F, -0.5F, -9F, 1, 1, 4, 0F); // Import GT_35

		gun_3_Model[0][32].addBox(-0.5F, -0.5F, 5F, 1, 1, 4, 0F); // Import GT_36

		gun_3_Model[0][33].addBox(6F, -0.5F, -4.5F, 16, 1, 1, 0F); // Import GT_22

		gun_3_Model[0][34].addBox(6F, -0.5F, 3.5F, 16, 1, 1, 0F); // Import GT_33

		gun_3_Model[0][35].addBox(-4F, -1F, -5F, 10, 2, 2, 0F); // Import GT_34

		gun_3_Model[0][36].addBox(-4F, -1F, 3F, 10, 2, 2, 0F); // Import GT_37

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_3_Model[0])
		{
			gunPart.setRotationPoint(38F, -60F, 0F);
		}


		gun_3_Model[1] = new ModelRendererTurbo[0];

		gun_3_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("DorsalGun", gun_3_Model);

		// Passenger 5
		ModelRendererTurbo[][] gun_4_Model = new ModelRendererTurbo[3][];

		gun_4_Model[0] = new ModelRendererTurbo[54];
		gun_4_Model[0][0] = new ModelRendererTurbo(this, 1, 992, textureX, textureY); // Box 0
		gun_4_Model[0][1] = new ModelRendererTurbo(this, 57, 992, textureX, textureY); // Box 13
		gun_4_Model[0][2] = new ModelRendererTurbo(this, 97, 992, textureX, textureY); // Box 24
		gun_4_Model[0][3] = new ModelRendererTurbo(this, 113, 992, textureX, textureY); // Box 76
		gun_4_Model[0][4] = new ModelRendererTurbo(this, 153, 992, textureX, textureY); // Box 80
		gun_4_Model[0][5] = new ModelRendererTurbo(this, 49, 992, textureX, textureY); // Box 82
		gun_4_Model[0][6] = new ModelRendererTurbo(this, 81, 992, textureX, textureY); // Box 84
		gun_4_Model[0][7] = new ModelRendererTurbo(this, 193, 992, textureX, textureY); // Box 86
		gun_4_Model[0][8] = new ModelRendererTurbo(this, 201, 992, textureX, textureY); // Box 87
		gun_4_Model[0][9] = new ModelRendererTurbo(this, 209, 992, textureX, textureY); // Box 88
		gun_4_Model[0][10] = new ModelRendererTurbo(this, 217, 992, textureX, textureY); // Box 89
		gun_4_Model[0][11] = new ModelRendererTurbo(this, 361, 992, textureX, textureY); // Box 99
		gun_4_Model[0][12] = new ModelRendererTurbo(this, 377, 992, textureX, textureY); // Box 100
		gun_4_Model[0][13] = new ModelRendererTurbo(this, 393, 992, textureX, textureY); // Box 101
		gun_4_Model[0][14] = new ModelRendererTurbo(this, 409, 992, textureX, textureY); // Box 102
		gun_4_Model[0][15] = new ModelRendererTurbo(this, 425, 992, textureX, textureY); // Box 103
		gun_4_Model[0][16] = new ModelRendererTurbo(this, 449, 992, textureX, textureY); // Box 104
		gun_4_Model[0][17] = new ModelRendererTurbo(this, 473, 992, textureX, textureY); // Box 105
		gun_4_Model[0][18] = new ModelRendererTurbo(this, 489, 992, textureX, textureY); // Box 106
		gun_4_Model[0][19] = new ModelRendererTurbo(this, 505, 992, textureX, textureY); // Box 107
		gun_4_Model[0][20] = new ModelRendererTurbo(this, 521, 992, textureX, textureY); // Box 108
		gun_4_Model[0][21] = new ModelRendererTurbo(this, 537, 992, textureX, textureY); // Box 109
		gun_4_Model[0][22] = new ModelRendererTurbo(this, 545, 992, textureX, textureY); // Box 110
		gun_4_Model[0][23] = new ModelRendererTurbo(this, 553, 992, textureX, textureY); // Box 111
		gun_4_Model[0][24] = new ModelRendererTurbo(this, 561, 992, textureX, textureY); // Box 112
		gun_4_Model[0][25] = new ModelRendererTurbo(this, 601, 992, textureX, textureY); // Box 116
		gun_4_Model[0][26] = new ModelRendererTurbo(this, 609, 992, textureX, textureY); // Box 117
		gun_4_Model[0][27] = new ModelRendererTurbo(this, 97, 992, textureX, textureY); // Box 118
		gun_4_Model[0][28] = new ModelRendererTurbo(this, 617, 992, textureX, textureY); // Box 119
		gun_4_Model[0][29] = new ModelRendererTurbo(this, 633, 992, textureX, textureY); // Box 120
		gun_4_Model[0][30] = new ModelRendererTurbo(this, 649, 992, textureX, textureY); // Box 121
		gun_4_Model[0][31] = new ModelRendererTurbo(this, 657, 992, textureX, textureY); // Box 122
		gun_4_Model[0][32] = new ModelRendererTurbo(this, 249, 992, textureX, textureY); // Box 123
		gun_4_Model[0][33] = new ModelRendererTurbo(this, 665, 992, textureX, textureY); // Box 124
		gun_4_Model[0][34] = new ModelRendererTurbo(this, 681, 992, textureX, textureY); // Box 125
		gun_4_Model[0][35] = new ModelRendererTurbo(this, 281, 992, textureX, textureY); // Box 126
		gun_4_Model[0][36] = new ModelRendererTurbo(this, 697, 992, textureX, textureY); // Box 127
		gun_4_Model[0][37] = new ModelRendererTurbo(this, 713, 992, textureX, textureY); // Box 128
		gun_4_Model[0][38] = new ModelRendererTurbo(this, 369, 992, textureX, textureY); // Box 129
		gun_4_Model[0][39] = new ModelRendererTurbo(this, 385, 992, textureX, textureY); // Box 130
		gun_4_Model[0][40] = new ModelRendererTurbo(this, 401, 992, textureX, textureY); // Box 131
		gun_4_Model[0][41] = new ModelRendererTurbo(this, 721, 992, textureX, textureY); // Box 132
		gun_4_Model[0][42] = new ModelRendererTurbo(this, 737, 992, textureX, textureY); // Box 133
		gun_4_Model[0][43] = new ModelRendererTurbo(this, 745, 992, textureX, textureY); // Box 134
		gun_4_Model[0][44] = new ModelRendererTurbo(this, 761, 992, textureX, textureY); // Box 135
		gun_4_Model[0][45] = new ModelRendererTurbo(this, 777, 992, textureX, textureY); // Box 136
		gun_4_Model[0][46] = new ModelRendererTurbo(this, 793, 992, textureX, textureY); // Box 137
		gun_4_Model[0][47] = new ModelRendererTurbo(this, 809, 992, textureX, textureY); // Box 138
		gun_4_Model[0][48] = new ModelRendererTurbo(this, 825, 992, textureX, textureY); // Box 139
		gun_4_Model[0][49] = new ModelRendererTurbo(this, 841, 992, textureX, textureY); // Box 140
		gun_4_Model[0][50] = new ModelRendererTurbo(this, 857, 992, textureX, textureY); // Box 141
		gun_4_Model[0][51] = new ModelRendererTurbo(this, 865, 992, textureX, textureY); // Box 142
		gun_4_Model[0][52] = new ModelRendererTurbo(this, 897, 992, textureX, textureY); // Box 143
		gun_4_Model[0][53] = new ModelRendererTurbo(this, 889, 992, textureX, textureY); // Box 144

		gun_4_Model[0][0].addShapeBox(-8F, 0F, -6F, 14, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0

		gun_4_Model[0][1].addShapeBox(6F, 0F, -6F, 4, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13

		gun_4_Model[0][2].addShapeBox(10F, 0F, -6F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 24

		gun_4_Model[0][3].addShapeBox(-8F, 0F, -10F, 14, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76

		gun_4_Model[0][4].addShapeBox(-8F, 0F, 6F, 14, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80

		gun_4_Model[0][5].addShapeBox(6F, 0F, -10F, 4, 1, 4, 0F,0F, 0F, 0F, -1.75F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82

		gun_4_Model[0][6].addShapeBox(6F, 0F, 6F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, -1.75F, 0F, 0F, 0F); // Box 84

		gun_4_Model[0][7].addShapeBox(5F, -11F, -10F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86

		gun_4_Model[0][8].addShapeBox(5F, -11F, 9F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87

		gun_4_Model[0][9].addShapeBox(9F, -11F, 4F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88

		gun_4_Model[0][10].addShapeBox(9F, -11F, -5F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89

		gun_4_Model[0][11].addShapeBox(1F, -6F, 5F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F); // Box 99

		gun_4_Model[0][12].addShapeBox(4F, -2F, 5F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, -1F, 0F, 0F); // Box 100

		gun_4_Model[0][13].addShapeBox(1F, -6F, -9F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F); // Box 101

		gun_4_Model[0][14].addShapeBox(4F, -2F, -9F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, -1F, 0F, 0F); // Box 102

		gun_4_Model[0][15].addShapeBox(-1F, -9F, 4F, 10, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103

		gun_4_Model[0][16].addShapeBox(-1F, -9F, -5F, 10, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104

		gun_4_Model[0][17].addShapeBox(5F, -3F, -9F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -0.5F, 0F, 0F, -0.5F); // Box 105

		gun_4_Model[0][18].addShapeBox(5F, -3F, -6F, 6, 1, 1, 0F,0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 2F, -0.5F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 106

		gun_4_Model[0][19].addShapeBox(5F, -3F, 8F, 6, 1, 1, 0F,0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 2F, -0.5F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 107

		gun_4_Model[0][20].addShapeBox(5F, -3F, 5F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -0.5F, 0F, 0F, -0.5F); // Box 108

		gun_4_Model[0][21].addShapeBox(-4F, -15F, 9F, 1, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109

		gun_4_Model[0][22].addShapeBox(-8F, -15F, 9F, 1, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110

		gun_4_Model[0][23].addShapeBox(-4F, -15F, -10F, 1, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111

		gun_4_Model[0][24].addShapeBox(-8F, -15F, -10F, 1, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112

		gun_4_Model[0][25].addShapeBox(8F, -14F, 4F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 116

		gun_4_Model[0][26].addShapeBox(6F, -17F, 4F, 1, 3, 1, 0F,-1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 117

		gun_4_Model[0][27].addShapeBox(3F, -18F, 4F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 118

		gun_4_Model[0][28].addShapeBox(-3F, -19F, 4F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 119

		gun_4_Model[0][29].addShapeBox(-8F, -19F, 4F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120

		gun_4_Model[0][30].addShapeBox(8F, -14F, -5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 121

		gun_4_Model[0][31].addShapeBox(6F, -17F, -5F, 1, 3, 1, 0F,-1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 122

		gun_4_Model[0][32].addShapeBox(3F, -18F, -5F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 123

		gun_4_Model[0][33].addShapeBox(-3F, -19F, -5F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 124

		gun_4_Model[0][34].addShapeBox(-8F, -19F, -5F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125

		gun_4_Model[0][35].addShapeBox(2F, -15F, -10F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 126

		gun_4_Model[0][36].addShapeBox(-3F, -15F, -10F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127

		gun_4_Model[0][37].addShapeBox(3F, -14F, -10F, 1, 3, 1, 0F,-1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 128

		gun_4_Model[0][38].addShapeBox(-7F, -6F, -10F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129

		gun_4_Model[0][39].addShapeBox(-7F, -6F, 9F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130

		gun_4_Model[0][40].addShapeBox(2F, -15F, 9F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 131

		gun_4_Model[0][41].addShapeBox(-3F, -15F, 9F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132

		gun_4_Model[0][42].addShapeBox(3F, -14F, 9F, 1, 3, 1, 0F,-1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 133

		gun_4_Model[0][43].addShapeBox(-8F, -17F, 9F, 5, 2, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134

		gun_4_Model[0][44].addShapeBox(-7F, -15F, 9F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135

		gun_4_Model[0][45].addShapeBox(-8F, -19F, 8F, 5, 2, 1, 0F,0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136

		gun_4_Model[0][46].addShapeBox(-8F, -19F, 5F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137

		gun_4_Model[0][47].addShapeBox(-8F, -19F, -7F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138

		gun_4_Model[0][48].addShapeBox(-8F, -17F, -10F, 5, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139

		gun_4_Model[0][49].addShapeBox(-7F, -15F, -10F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140

		gun_4_Model[0][50].addShapeBox(-8F, -19F, -9F, 5, 2, 1, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141

		gun_4_Model[0][51].addShapeBox(-8F, -19F, -4F, 5, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142

		gun_4_Model[0][52].addShapeBox(9F, -11F, -4F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143

		gun_4_Model[0][53].addShapeBox(8F, -11F, -1F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_4_Model[0])
		{
			gunPart.setRotationPoint(210.5F, -63F, 0F);
		}


		gun_4_Model[1] = new ModelRendererTurbo[2];
		gun_4_Model[1][0] = new ModelRendererTurbo(this, 297, 992, textureX, textureY); // Box 96
		gun_4_Model[1][1] = new ModelRendererTurbo(this, 569, 992, textureX, textureY); // Box 113

		gun_4_Model[1][0].addShapeBox(6F, -9F, 6F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96

		gun_4_Model[1][1].addShapeBox(6F, -9F, -7F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_4_Model[1])
		{
			gunPart.setRotationPoint(210.5F, -63F, 0F);
		}


		gun_4_Model[2] = new ModelRendererTurbo[8];
		gun_4_Model[2][0] = new ModelRendererTurbo(this, 225, 992, textureX, textureY); // Box 90
		gun_4_Model[2][1] = new ModelRendererTurbo(this, 1, 992, textureX, textureY); // Box 91
		gun_4_Model[2][2] = new ModelRendererTurbo(this, 241, 992, textureX, textureY); // Box 92
		gun_4_Model[2][3] = new ModelRendererTurbo(this, 257, 992, textureX, textureY); // Box 93
		gun_4_Model[2][4] = new ModelRendererTurbo(this, 273, 992, textureX, textureY); // Box 94
		gun_4_Model[2][5] = new ModelRendererTurbo(this, 289, 992, textureX, textureY); // Box 95
		gun_4_Model[2][6] = new ModelRendererTurbo(this, 329, 992, textureX, textureY); // Box 97
		gun_4_Model[2][7] = new ModelRendererTurbo(this, 345, 992, textureX, textureY); // Box 98

		gun_4_Model[2][0].addShapeBox(2F, -11F, -8F, 3, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90

		gun_4_Model[2][1].addShapeBox(5F, -11F, -8F, 1, 5, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 91

		gun_4_Model[2][2].addShapeBox(1F, -11F, -8F, 1, 5, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 92

		gun_4_Model[2][3].addShapeBox(2F, -11F, 5F, 3, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93

		gun_4_Model[2][4].addShapeBox(5F, -11F, 5F, 1, 5, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 94

		gun_4_Model[2][5].addShapeBox(1F, -11F, 5F, 1, 5, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 95

		gun_4_Model[2][6].addShapeBox(2F, -10F, 8F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97

		gun_4_Model[2][7].addShapeBox(2F, -10F, -9F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_4_Model[2])
		{
			gunPart.setRotationPoint(210.5F, -63F, 0F);
		}


		registerGunModel("TailGun", gun_4_Model);
	}
}