//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: A7M
// Model Creator: 
// Created on: 18.05.2023 - 18:23:15
// Last changed on: 18.05.2023 - 18:23:15

package com.flansmod.client.model.Taskball; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelA7M extends ModelPlane //Same as Filename
{
	int textureX = 1024;
	int textureY = 512;

	public ModelA7M() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[100];
		noseModel = new ModelRendererTurbo[42];
		tailModel = new ModelRendererTurbo[21];
		leftWingModel = new ModelRendererTurbo[22];
		yawFlapModel = new ModelRendererTurbo[2];
		pitchFlapLeftModel = new ModelRendererTurbo[2];
		pitchFlapLeftWingModel = new ModelRendererTurbo[2];
		tailWheelModel = new ModelRendererTurbo[7];
		leftWingWheelModel = new ModelRendererTurbo[10];
		rightWingWheelModel = new ModelRendererTurbo[10];
		hudModel = new ModelRendererTurbo[1];

		initbodyModel_1();
		initnoseModel_1();
		inittailModel_1();
		initleftWingModel_1();
		inityawFlapModel_1();
		initpitchFlapLeftModel_1();
		initpitchFlapLeftWingModel_1();
		inittailWheelModel_1();
		initleftWingWheelModel_1();
		initrightWingWheelModel_1();
		inithudModel_1();

		initPropeller();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 4
		bodyModel[4] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 5
		bodyModel[5] = new ModelRendererTurbo(this, 545, 1, textureX, textureY); // Box 6
		bodyModel[6] = new ModelRendererTurbo(this, 817, 1, textureX, textureY); // Box 9
		bodyModel[7] = new ModelRendererTurbo(this, 873, 1, textureX, textureY); // Box 10
		bodyModel[8] = new ModelRendererTurbo(this, 969, 1, textureX, textureY); // Box 12
		bodyModel[9] = new ModelRendererTurbo(this, 817, 17, textureX, textureY); // Box 13
		bodyModel[10] = new ModelRendererTurbo(this, 609, 25, textureX, textureY); // Box 15
		bodyModel[11] = new ModelRendererTurbo(this, 657, 25, textureX, textureY); // Box 16
		bodyModel[12] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 18
		bodyModel[13] = new ModelRendererTurbo(this, 873, 33, textureX, textureY); // Box 19
		bodyModel[14] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 21
		bodyModel[15] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 22
		bodyModel[16] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Box 24
		bodyModel[17] = new ModelRendererTurbo(this, 777, 25, textureX, textureY); // Box 25
		bodyModel[18] = new ModelRendererTurbo(this, 753, 41, textureX, textureY); // Box 30
		bodyModel[19] = new ModelRendererTurbo(this, 609, 49, textureX, textureY); // Box 33
		bodyModel[20] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 34
		bodyModel[21] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 35
		bodyModel[22] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 36
		bodyModel[23] = new ModelRendererTurbo(this, 809, 49, textureX, textureY); // Box 37
		bodyModel[24] = new ModelRendererTurbo(this, 953, 9, textureX, textureY); // Box 38
		bodyModel[25] = new ModelRendererTurbo(this, 569, 1, textureX, textureY); // Box 39
		bodyModel[26] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 40
		bodyModel[27] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 41
		bodyModel[28] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 42
		bodyModel[29] = new ModelRendererTurbo(this, 545, 1, textureX, textureY); // Box 43
		bodyModel[30] = new ModelRendererTurbo(this, 553, 17, textureX, textureY); // Box 44
		bodyModel[31] = new ModelRendererTurbo(this, 825, 65, textureX, textureY); // Box 74
		bodyModel[32] = new ModelRendererTurbo(this, 393, 73, textureX, textureY); // Box 75
		bodyModel[33] = new ModelRendererTurbo(this, 233, 81, textureX, textureY); // Box 76
		bodyModel[34] = new ModelRendererTurbo(this, 537, 73, textureX, textureY); // Box 78
		bodyModel[35] = new ModelRendererTurbo(this, 777, 97, textureX, textureY); // Box 79
		bodyModel[36] = new ModelRendererTurbo(this, 153, 73, textureX, textureY); // Box 80
		bodyModel[37] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 83
		bodyModel[38] = new ModelRendererTurbo(this, 321, 121, textureX, textureY); // Box 84
		bodyModel[39] = new ModelRendererTurbo(this, 121, 89, textureX, textureY); // Box 86
		bodyModel[40] = new ModelRendererTurbo(this, 209, 145, textureX, textureY); // Box 87
		bodyModel[41] = new ModelRendererTurbo(this, 433, 81, textureX, textureY); // Box 89
		bodyModel[42] = new ModelRendererTurbo(this, 537, 89, textureX, textureY); // Box 90
		bodyModel[43] = new ModelRendererTurbo(this, 313, 81, textureX, textureY); // Box 92
		bodyModel[44] = new ModelRendererTurbo(this, 945, 97, textureX, textureY); // Box 93
		bodyModel[45] = new ModelRendererTurbo(this, 689, 81, textureX, textureY); // Box 95
		bodyModel[46] = new ModelRendererTurbo(this, 321, 153, textureX, textureY); // Box 96
		bodyModel[47] = new ModelRendererTurbo(this, 233, 105, textureX, textureY); // Box 98
		bodyModel[48] = new ModelRendererTurbo(this, 777, 81, textureX, textureY); // Box 99
		bodyModel[49] = new ModelRendererTurbo(this, 689, 97, textureX, textureY); // Box 104
		bodyModel[50] = new ModelRendererTurbo(this, 809, 57, textureX, textureY); // Box 107
		bodyModel[51] = new ModelRendererTurbo(this, 649, 25, textureX, textureY); // Box 108
		bodyModel[52] = new ModelRendererTurbo(this, 657, 25, textureX, textureY); // Box 109
		bodyModel[53] = new ModelRendererTurbo(this, 713, 25, textureX, textureY); // Box 110
		bodyModel[54] = new ModelRendererTurbo(this, 865, 57, textureX, textureY); // Box 111
		bodyModel[55] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 112
		bodyModel[56] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 113
		bodyModel[57] = new ModelRendererTurbo(this, 817, 25, textureX, textureY); // Box 114
		bodyModel[58] = new ModelRendererTurbo(this, 1009, 33, textureX, textureY); // Box 115
		bodyModel[59] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 116
		bodyModel[60] = new ModelRendererTurbo(this, 817, 1, textureX, textureY); // Box 117
		bodyModel[61] = new ModelRendererTurbo(this, 961, 25, textureX, textureY); // Box 118
		bodyModel[62] = new ModelRendererTurbo(this, 1017, 57, textureX, textureY); // Box 695
		bodyModel[63] = new ModelRendererTurbo(this, 721, 185, textureX, textureY); // Box 181
		bodyModel[64] = new ModelRendererTurbo(this, 625, 185, textureX, textureY); // Box 182
		bodyModel[65] = new ModelRendererTurbo(this, 793, 185, textureX, textureY); // Box 183
		bodyModel[66] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Box 465
		bodyModel[67] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 466
		bodyModel[68] = new ModelRendererTurbo(this, 561, 17, textureX, textureY); // Box 467
		bodyModel[69] = new ModelRendererTurbo(this, 257, 41, textureX, textureY); // Box 468
		bodyModel[70] = new ModelRendererTurbo(this, 721, 41, textureX, textureY); // Box 469
		bodyModel[71] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 470
		bodyModel[72] = new ModelRendererTurbo(this, 641, 49, textureX, textureY); // Box 471
		bodyModel[73] = new ModelRendererTurbo(this, 865, 49, textureX, textureY); // Box 472
		bodyModel[74] = new ModelRendererTurbo(this, 769, 185, textureX, textureY); // Box 239
		bodyModel[75] = new ModelRendererTurbo(this, 1001, 97, textureX, textureY); // Box 240
		bodyModel[76] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Box 241
		bodyModel[77] = new ModelRendererTurbo(this, 433, 65, textureX, textureY); // Box 242
		bodyModel[78] = new ModelRendererTurbo(this, 265, 121, textureX, textureY); // Box 243
		bodyModel[79] = new ModelRendererTurbo(this, 577, 185, textureX, textureY); // Box 244
		bodyModel[80] = new ModelRendererTurbo(this, 329, 97, textureX, textureY); // Box 245
		bodyModel[81] = new ModelRendererTurbo(this, 1001, 185, textureX, textureY); // Box 246
		bodyModel[82] = new ModelRendererTurbo(this, 889, 81, textureX, textureY); // Box 247
		bodyModel[83] = new ModelRendererTurbo(this, 1017, 81, textureX, textureY); // Box 248
		bodyModel[84] = new ModelRendererTurbo(this, 1001, 129, textureX, textureY); // Box 250
		bodyModel[85] = new ModelRendererTurbo(this, 417, 137, textureX, textureY); // Box 251
		bodyModel[86] = new ModelRendererTurbo(this, 281, 105, textureX, textureY); // Box 252
		bodyModel[87] = new ModelRendererTurbo(this, 305, 105, textureX, textureY); // Box 253
		bodyModel[88] = new ModelRendererTurbo(this, 897, 57, textureX, textureY); // Box 962
		bodyModel[89] = new ModelRendererTurbo(this, 393, 65, textureX, textureY); // Box 964
		bodyModel[90] = new ModelRendererTurbo(this, 481, 65, textureX, textureY); // Box 966
		bodyModel[91] = new ModelRendererTurbo(this, 585, 57, textureX, textureY); // Box 259
		bodyModel[92] = new ModelRendererTurbo(this, 177, 73, textureX, textureY); // Box 260
		bodyModel[93] = new ModelRendererTurbo(this, 265, 145, textureX, textureY); // Box 256
		bodyModel[94] = new ModelRendererTurbo(this, 561, 121, textureX, textureY); // Box 249
		bodyModel[95] = new ModelRendererTurbo(this, 585, 121, textureX, textureY); // Box 254
		bodyModel[96] = new ModelRendererTurbo(this, 137, 81, textureX, textureY); // Box 263
		bodyModel[97] = new ModelRendererTurbo(this, 881, 1, textureX, textureY); // Box 264
		bodyModel[98] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 265
		bodyModel[99] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 266

		bodyModel[0].addShapeBox(0F, 0F, 0F, 17, 13, 14, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 5F, 0F, 0F, 6F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-42F, -41F, -14F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 17, 8, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[1].setRotationPoint(-42F, -49F, -14F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 31, 8, 14, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[2].setRotationPoint(-25F, -49F, -14F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 17, 6, 5, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 4
		bodyModel[3].setRotationPoint(-42F, -55F, -13F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 31, 6, 13, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[4].setRotationPoint(-25F, -55F, -13F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 7, 3, 9, 0F,0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[5].setRotationPoint(-1F, -58F, -9F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 24, 3, 8, 0F,-23.9999F, 0F, -6.9999F, 0F, 0F, -6.9999F, 0F, 0F, 0F, -23.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9999F, 0F, 0F, -6.9999F); // Box 9
		bodyModel[6].setRotationPoint(-25F, -58F, -9F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 31, 13, 14, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 4F, 0F, 0F, 5F, 0F); // Box 10
		bodyModel[7].setRotationPoint(-25F, -41F, -14F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 13, 13, 14, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[8].setRotationPoint(-55F, -41F, -14F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 19, 13, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 13
		bodyModel[9].setRotationPoint(-74F, -41F, -15F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 13, 6, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -7F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 15
		bodyModel[10].setRotationPoint(-55F, -28F, -10F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 19, 5, 10, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, -6F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 16
		bodyModel[11].setRotationPoint(-74F, -28F, -10F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 13, 8, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[12].setRotationPoint(-55F, -49F, -14F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 19, 8, 15, 0F,0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[13].setRotationPoint(-74F, -49F, -15F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 13, 6, 5, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 21
		bodyModel[14].setRotationPoint(-55F, -55F, -13F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 19, 6, 13, 0F,0F, -1F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[15].setRotationPoint(-74F, -55F, -13F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 19, 3, 8, 0F,0F, -0.9999F, -7.9999F, 0F, 0F, -3.9999F, 0F, 0.9999F, 0F, 0F, -0.9999F, 0F, 0F, 0.9999F, 0F, 0F, 0F, 0.9999F, 0F, 0F, 0F, 0F, 0.9999F, 0F); // Box 24
		bodyModel[16].setRotationPoint(-74F, -58F, -8F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 13, 3, 6, 0F,0F, 0F, -4.9999F, -12.9999F, 0F, -4.9999F, -12.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.9999F, 0F, 0F, -4.9999F); // Box 25
		bodyModel[17].setRotationPoint(-55F, -58F, -9F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 19, 3, 3, 0F,0F, 0F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[18].setRotationPoint(-74F, -24F, -3F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 13, 1, 3, 0F,0F, 0F, 0F, 0F, -0.9999F, -2.9999F, 0F, -0.9999F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9999F, 0F, 0F, -2.9999F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[19].setRotationPoint(-55F, -23F, -3F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[20].setRotationPoint(-42F, -63F, -9F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[21].setRotationPoint(-35F, -63F, -9F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 36
		bodyModel[22].setRotationPoint(-28F, -63F, -9F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[23].setRotationPoint(-42F, -63F, -6F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 38
		bodyModel[24].setRotationPoint(-51F, -63F, -6F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[25].setRotationPoint(-51F, -63F, -4F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F); // Box 40
		bodyModel[26].setRotationPoint(-55F, -63F, -4F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 41
		bodyModel[27].setRotationPoint(-42F, -63F, -6F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, 1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, 1F, -2F, 0F); // Box 42
		bodyModel[28].setRotationPoint(-28F, -63F, -6F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[29].setRotationPoint(-15F, -61F, -7F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 44
		bodyModel[30].setRotationPoint(-15F, -61F, -4F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 17, 13, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 5F, 0F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 74
		bodyModel[31].setRotationPoint(-42F, -41F, 0F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 17, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 75
		bodyModel[32].setRotationPoint(-42F, -49F, 10F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 31, 8, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 76
		bodyModel[33].setRotationPoint(-25F, -49F, 0F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 17, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[34].setRotationPoint(-42F, -55F, 8F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 31, 6, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[35].setRotationPoint(-25F, -55F, 0F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 7, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[36].setRotationPoint(-1F, -58F, 0F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 24, 3, 8, 0F,-23.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.9999F, -23.9999F, 0F, -6.9999F, 0F, 0F, -6.9999F, 0F, 0F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[37].setRotationPoint(-25F, -58F, 1F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 31, 13, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 5F, 0F, 0F, 4F, 0F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 84
		bodyModel[38].setRotationPoint(-25F, -41F, 0F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 13, 13, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 86
		bodyModel[39].setRotationPoint(-55F, -41F, 0F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 19, 13, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -1F, -5F); // Box 87
		bodyModel[40].setRotationPoint(-74F, -41F, 0F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 13, 6, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, -1F, -7F); // Box 89
		bodyModel[41].setRotationPoint(-55F, -28F, 0F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 19, 5, 10, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -1F, -6F); // Box 90
		bodyModel[42].setRotationPoint(-74F, -28F, 0F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 13, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 92
		bodyModel[43].setRotationPoint(-55F, -49F, 10F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 19, 8, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		bodyModel[44].setRotationPoint(-74F, -49F, 0F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 13, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[45].setRotationPoint(-55F, -55F, 8F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 19, 6, 13, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 96
		bodyModel[46].setRotationPoint(-74F, -55F, 0F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 19, 3, 8, 0F,0F, -0.9999F, 0F, 0F, 0.9999F, 0F, 0F, 0F, -3.9999F, 0F, -0.9999F, -7.9999F, 0F, 0.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0.9999F, 0F, 0.9999F, 0F); // Box 98
		bodyModel[47].setRotationPoint(-74F, -58F, 0F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 13, 3, 6, 0F,0F, 0F, 0F, -12.9999F, 0F, 0F, -12.9999F, 0F, -4.9999F, 0F, 0F, -4.9999F, 0F, 0F, -4.9999F, 0F, 0F, -4.9999F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[48].setRotationPoint(-55F, -58F, 3F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 19, 3, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, -1F); // Box 104
		bodyModel[49].setRotationPoint(-74F, -24F, 0F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 13, 1, 3, 0F,0F, 0F, 0F, 0F, -0.9999F, 0F, 0F, -0.9999F, -2.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.9999F, 0F, 0F, -0.9999F); // Box 107
		bodyModel[50].setRotationPoint(-55F, -23F, 0F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[51].setRotationPoint(-42F, -63F, 8F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[52].setRotationPoint(-35F, -63F, 8F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 110
		bodyModel[53].setRotationPoint(-28F, -63F, 8F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[54].setRotationPoint(-42F, -63F, 5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 112
		bodyModel[55].setRotationPoint(-51F, -63F, 5F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[56].setRotationPoint(-51F, -63F, 0F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F); // Box 114
		bodyModel[57].setRotationPoint(-55F, -63F, 3F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[58].setRotationPoint(-42F, -63F, 0F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,1F, 2F, 0F, -1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[59].setRotationPoint(-28F, -63F, 0F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		bodyModel[60].setRotationPoint(-15F, -61F, 6F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		bodyModel[61].setRotationPoint(-15F, -61F, 0F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 695
		bodyModel[62].setRotationPoint(-10F, -77F, -0.5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 13, 6, 20, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		bodyModel[63].setRotationPoint(-55F, -55F, -10F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 13, 3, 16, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182
		bodyModel[64].setRotationPoint(-55F, -58F, -8F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 9, 8, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		bodyModel[65].setRotationPoint(-55F, -49F, -10F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 465
		bodyModel[66].setRotationPoint(-43.5F, -58.5F, -1F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, 0F); // Box 466
		bodyModel[67].setRotationPoint(-43.5F, -59F, -1F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 467
		bodyModel[68].setRotationPoint(-42F, -59.25F, -1F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 468
		bodyModel[69].setRotationPoint(-42F, -58.25F, -1F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.6F, -0.25F, 0F); // Box 469
		bodyModel[70].setRotationPoint(-42.1F, -57.75F, -1F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.7F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.5F, 0F, -0.7F, -0.5F, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 470
		bodyModel[71].setRotationPoint(-43.5F, -60F, -1F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.7F, -0.5F, -0.3F, -0.2F, -0.5F, -0.3F, -0.2F, -0.3F, 0F, -0.7F, -0.3F, 0F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 471
		bodyModel[72].setRotationPoint(-43.5F, -60F, 0F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.1F); // Box 472
		bodyModel[73].setRotationPoint(-41.7F, -59F, -1F);

		bodyModel[74].addShapeBox(0F, 1F, 0F, 10, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
		bodyModel[74].setRotationPoint(-38F, -43F, -5F);
		bodyModel[74].rotateAngleZ = -0.10471976F;

		bodyModel[75].addShapeBox(9F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		bodyModel[75].setRotationPoint(-38F, -43F, -5F);
		bodyModel[75].rotateAngleZ = -0.10471976F;

		bodyModel[76].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		bodyModel[76].setRotationPoint(-38F, -43F, -5F);
		bodyModel[76].rotateAngleZ = -0.10471976F;

		bodyModel[77].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		bodyModel[77].setRotationPoint(-38F, -43F, 4F);
		bodyModel[77].rotateAngleZ = -0.10471976F;

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		bodyModel[78].setRotationPoint(-38F, -43F, -5F);
		bodyModel[78].rotateAngleZ = -0.10471976F;

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 17, 10, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		bodyModel[79].setRotationPoint(-29F, -59F, -5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[80].setRotationPoint(-27F, -63F, -3F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 17, 8, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 246
		bodyModel[81].setRotationPoint(-30F, -58F, -4F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[82].setRotationPoint(-30.3F, -58.3F, -2F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[83].setRotationPoint(-30.3F, -58.3F, 1F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 2, 18, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[84].setRotationPoint(-29F, -56F, -4F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 2, 18, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 251
		bodyModel[85].setRotationPoint(-29F, -56F, 3F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[86].setRotationPoint(-35F, -42F, -6F);
		bodyModel[86].rotateAngleZ = 0.78539816F;

		bodyModel[87].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 253
		bodyModel[87].setRotationPoint(-35F, -42F, 5F);
		bodyModel[87].rotateAngleZ = 0.78539816F;

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 962
		bodyModel[88].setRotationPoint(-27.5F, -62.5F, -1.5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 964
		bodyModel[89].setRotationPoint(-27.5F, -61.5F, -1.5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 966
		bodyModel[90].setRotationPoint(-27.5F, -60.5F, -1.5F);

		bodyModel[91].addShapeBox(0F, -3F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 259
		bodyModel[91].setRotationPoint(-46F, -42F, -6F);
		bodyModel[91].rotateAngleZ = 0.15707963F;

		bodyModel[92].addShapeBox(0F, -3F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
		bodyModel[92].setRotationPoint(-46F, -42F, 4F);
		bodyModel[92].rotateAngleZ = 0.15707963F;

		bodyModel[93].addShapeBox(0F, 0F, 0F, 7, 9, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 256
		bodyModel[93].setRotationPoint(-50F, -50F, -2F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[94].setRotationPoint(-42F, -43F, -2F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 7, 3, 3, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 254
		bodyModel[95].setRotationPoint(-42F, -44F, -1.5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 263
		bodyModel[96].setRotationPoint(-39.5F, -47F, -1F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 264
		bodyModel[97].setRotationPoint(-39F, -51F, -0.5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 265
		bodyModel[98].setRotationPoint(-39F, -53F, -0.5F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 266
		bodyModel[99].setRotationPoint(-38.7F, -53.1F, -0.5F);
	}

	private void initnoseModel_1()
	{
		noseModel[0] = new ModelRendererTurbo(this, 529, 25, textureX, textureY); // Box 14
		noseModel[1] = new ModelRendererTurbo(this, 721, 25, textureX, textureY); // Box 17
		noseModel[2] = new ModelRendererTurbo(this, 945, 33, textureX, textureY); // Box 20
		noseModel[3] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Box 23
		noseModel[4] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 26
		noseModel[5] = new ModelRendererTurbo(this, 649, 41, textureX, textureY); // Box 27
		noseModel[6] = new ModelRendererTurbo(this, 689, 41, textureX, textureY); // Box 28
		noseModel[7] = new ModelRendererTurbo(this, 721, 41, textureX, textureY); // Box 29
		noseModel[8] = new ModelRendererTurbo(this, 753, 49, textureX, textureY); // Box 31
		noseModel[9] = new ModelRendererTurbo(this, 953, 1, textureX, textureY); // Box 32
		noseModel[10] = new ModelRendererTurbo(this, 513, 25, textureX, textureY); // Box 51
		noseModel[11] = new ModelRendererTurbo(this, 593, 25, textureX, textureY); // Box 52
		noseModel[12] = new ModelRendererTurbo(this, 929, 33, textureX, textureY); // Box 53
		noseModel[13] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 68
		noseModel[14] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 69
		noseModel[15] = new ModelRendererTurbo(this, 329, 57, textureX, textureY); // Box 70
		noseModel[16] = new ModelRendererTurbo(this, 449, 65, textureX, textureY); // Box 71
		noseModel[17] = new ModelRendererTurbo(this, 689, 65, textureX, textureY); // Box 78
		noseModel[18] = new ModelRendererTurbo(this, 801, 65, textureX, textureY); // Box 79
		noseModel[19] = new ModelRendererTurbo(this, 777, 153, textureX, textureY); // Box 88
		noseModel[20] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 91
		noseModel[21] = new ModelRendererTurbo(this, 857, 153, textureX, textureY); // Box 94
		noseModel[22] = new ModelRendererTurbo(this, 937, 153, textureX, textureY); // Box 97
		noseModel[23] = new ModelRendererTurbo(this, 393, 89, textureX, textureY); // Box 100
		noseModel[24] = new ModelRendererTurbo(this, 857, 97, textureX, textureY); // Box 101
		noseModel[25] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 102
		noseModel[26] = new ModelRendererTurbo(this, 33, 113, textureX, textureY); // Box 103
		noseModel[27] = new ModelRendererTurbo(this, 121, 121, textureX, textureY); // Box 105
		noseModel[28] = new ModelRendererTurbo(this, 929, 41, textureX, textureY); // Box 106
		noseModel[29] = new ModelRendererTurbo(this, 233, 121, textureX, textureY); // Box 125
		noseModel[30] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 126
		noseModel[31] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Box 127
		noseModel[32] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 142
		noseModel[33] = new ModelRendererTurbo(this, 721, 57, textureX, textureY); // Box 143
		noseModel[34] = new ModelRendererTurbo(this, 721, 73, textureX, textureY); // Box 144
		noseModel[35] = new ModelRendererTurbo(this, 97, 185, textureX, textureY); // Box 145
		noseModel[36] = new ModelRendererTurbo(this, 761, 153, textureX, textureY); // Box 146
		noseModel[37] = new ModelRendererTurbo(this, 841, 153, textureX, textureY); // Box 147
		noseModel[38] = new ModelRendererTurbo(this, 1009, 121, textureX, textureY); // Box 205
		noseModel[39] = new ModelRendererTurbo(this, 1009, 153, textureX, textureY); // Box 206
		noseModel[40] = new ModelRendererTurbo(this, 41, 185, textureX, textureY); // Box 207
		noseModel[41] = new ModelRendererTurbo(this, 313, 185, textureX, textureY); // Box 208

		noseModel[0].addShapeBox(0F, 0F, 0F, 22, 12, 15, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -6F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 14
		noseModel[0].setRotationPoint(-96F, -41F, -15F);

		noseModel[1].addShapeBox(0F, 0F, 0F, 22, 5, 10, 0F,0F, 2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -3F, -7F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 17
		noseModel[1].setRotationPoint(-96F, -29F, -10F);

		noseModel[2].addShapeBox(0F, 0F, 0F, 22, 8, 15, 0F,0F, -1F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		noseModel[2].setRotationPoint(-96F, -49F, -15F);

		noseModel[3].addShapeBox(0F, 0F, 0F, 22, 5, 12, 0F,0F, -1F, -4F, 0F, 0F, -4F, 0F, 3F, 0F, 0F, 2F, 0F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 23
		noseModel[3].setRotationPoint(-96F, -54F, -12F);

		noseModel[4].addShapeBox(0F, 0F, 0F, 9, 7, 5, 0F,0F, -1F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 26
		noseModel[4].setRotationPoint(-105F, -48F, -13F);

		noseModel[5].addShapeBox(0F, 0F, 0F, 9, 3, 8, 0F,0F, -5F, -2F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, -2F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F); // Box 27
		noseModel[5].setRotationPoint(-105F, -56F, -8F);

		noseModel[6].addShapeBox(0F, 0F, 0F, 9, 10, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 28
		noseModel[6].setRotationPoint(-105F, -41F, -13F);

		noseModel[7].addShapeBox(0F, 0F, 0F, 9, 4, 7, 0F,0F, 2F, -1F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 2F, -5F, 0F, -2F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 29
		noseModel[7].setRotationPoint(-105F, -31F, -9F);

		noseModel[8].addShapeBox(0F, 0F, 0F, 22, 3, 4, 0F,0F, 3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 31
		noseModel[8].setRotationPoint(-96F, -24F, -4F);

		noseModel[9].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 32
		noseModel[9].setRotationPoint(-105F, -30F, -3F);

		noseModel[10].addShapeBox(0F, 0F, 0F, 9, 5, 6, 0F,0F, -2F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 1F, -3F); // Box 51
		noseModel[10].setRotationPoint(-105F, -53F, -11F);

		noseModel[11].addShapeBox(0F, 0F, 0F, 9, 3, 2, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 2F, -1F, 0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 52
		noseModel[11].setRotationPoint(-105F, -27F, -3F);

		noseModel[12].addShapeBox(0F, 0F, 0F, 9, 3, 2, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 53
		noseModel[12].setRotationPoint(-105F, -27F, -2F);

		noseModel[13].addShapeBox(0F, 0F, 0F, 12, 6, 6, 0F,0F, -2F, -2F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		noseModel[13].setRotationPoint(-117F, -47F, -6F);

		noseModel[14].addShapeBox(0F, 0F, 0F, 4, 5, 5, 0F,0F, -4.9999F, -4.9999F, 0F, -0.9999F, -0.9999F, 0F, 0F, 0F, 0F, -4.9999F, 0F, 0F, 0F, -4.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		noseModel[14].setRotationPoint(-121F, -46F, -5F);

		noseModel[15].addShapeBox(0F, 0F, 0F, 4, 5, 5, 0F,0F, 0F, -4.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.9999F, -4.9999F, 0F, -0.9999F, -0.9999F, 0F, 0F, 0F, 0F, -4.9999F, 0F); // Box 70
		noseModel[15].setRotationPoint(-121F, -41F, -5F);

		noseModel[16].addShapeBox(0F, 0F, 0F, 12, 6, 6, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 71
		noseModel[16].setRotationPoint(-117F, -41F, -6F);

		noseModel[17].addShapeBox(0F, 0F, 0F, 9, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		noseModel[17].setRotationPoint(-105F, -41F, -6F);

		noseModel[18].addShapeBox(0F, 0F, 0F, 9, 6, 6, 0F,0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		noseModel[18].setRotationPoint(-105F, -47F, -6F);

		noseModel[19].addShapeBox(0F, 0F, 0F, 22, 12, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -2F, -6F); // Box 88
		noseModel[19].setRotationPoint(-96F, -41F, 0F);

		noseModel[20].addShapeBox(0F, 0F, 0F, 22, 5, 10, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -3F, -7F); // Box 91
		noseModel[20].setRotationPoint(-96F, -29F, 0F);

		noseModel[21].addShapeBox(0F, 0F, 0F, 22, 8, 15, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 94
		noseModel[21].setRotationPoint(-96F, -49F, 0F);

		noseModel[22].addShapeBox(0F, 0F, 0F, 22, 5, 12, 0F,0F, 2F, 0F, 0F, 3F, 0F, 0F, 0F, -4F, 0F, -1F, -4F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F); // Box 97
		noseModel[22].setRotationPoint(-96F, -54F, 0F);

		noseModel[23].addShapeBox(0F, 0F, 0F, 9, 7, 5, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 100
		noseModel[23].setRotationPoint(-105F, -48F, 8F);

		noseModel[24].addShapeBox(0F, 0F, 0F, 9, 3, 8, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, -2F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 3F, -2F); // Box 101
		noseModel[24].setRotationPoint(-105F, -56F, 0F);

		noseModel[25].addShapeBox(0F, 0F, 0F, 9, 10, 6, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -2F, -5F); // Box 102
		noseModel[25].setRotationPoint(-105F, -41F, 7F);

		noseModel[26].addShapeBox(0F, 0F, 0F, 9, 4, 7, 0F,0F, 2F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -2F, -6F); // Box 103
		noseModel[26].setRotationPoint(-105F, -31F, 2F);

		noseModel[27].addShapeBox(0F, 0F, 0F, 22, 3, 4, 0F,0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, -2F); // Box 105
		noseModel[27].setRotationPoint(-96F, -24F, 0F);

		noseModel[28].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 106
		noseModel[28].setRotationPoint(-105F, -30F, 0F);

		noseModel[29].addShapeBox(0F, 0F, 0F, 9, 5, 6, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -5F, 0F, 1F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 1F, -2F); // Box 125
		noseModel[29].setRotationPoint(-105F, -53F, 5F);

		noseModel[30].addShapeBox(0F, 0F, 0F, 9, 3, 2, 0F,0F, 2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -1F); // Box 126
		noseModel[30].setRotationPoint(-105F, -27F, 1F);

		noseModel[31].addShapeBox(0F, 0F, 0F, 9, 3, 2, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 127
		noseModel[31].setRotationPoint(-105F, -27F, 0F);

		noseModel[32].addShapeBox(0F, 0F, 0F, 12, 6, 6, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 142
		noseModel[32].setRotationPoint(-117F, -47F, 0F);

		noseModel[33].addShapeBox(0F, 0F, 0F, 4, 5, 5, 0F,0F, -4.9999F, 0F, 0F, 0F, 0F, 0F, -0.9999F, -0.9999F, 0F, -4.9999F, -4.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.9999F); // Box 143
		noseModel[33].setRotationPoint(-121F, -46F, 0F);

		noseModel[34].addShapeBox(0F, 0F, 0F, 4, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.9999F, 0F, -4.9999F, 0F, 0F, 0F, 0F, 0F, -0.9999F, -0.9999F, 0F, -4.9999F, -4.9999F); // Box 144
		noseModel[34].setRotationPoint(-121F, -41F, 0F);

		noseModel[35].addShapeBox(0F, 0F, 0F, 12, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -2F, -2F); // Box 145
		noseModel[35].setRotationPoint(-117F, -41F, 0F);

		noseModel[36].addShapeBox(0F, 0F, 0F, 9, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 146
		noseModel[36].setRotationPoint(-105F, -41F, 0F);

		noseModel[37].addShapeBox(0F, 0F, 0F, 9, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		noseModel[37].setRotationPoint(-105F, -47F, 0F);

		noseModel[38].addShapeBox(0F, -13F, -1F, 2, 26, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		noseModel[38].setRotationPoint(-98F, -41F, 0F);

		noseModel[39].addShapeBox(0F, -12F, -1F, 2, 24, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		noseModel[39].setRotationPoint(-98F, -41F, 0F);
		noseModel[39].rotateAngleX = -1.57079633F;

		noseModel[40].addShapeBox(0F, -12F, -1F, 2, 24, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		noseModel[40].setRotationPoint(-98F, -41F, 0F);
		noseModel[40].rotateAngleX = -0.78539816F;

		noseModel[41].addShapeBox(0F, -12F, -1F, 2, 24, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 208
		noseModel[41].setRotationPoint(-98F, -41F, 0F);
		noseModel[41].rotateAngleX = 0.78539816F;
	}

	private void inittailModel_1()
	{
		tailModel[0] = new ModelRendererTurbo(this, 264, 349, textureX, textureY); // Box 3
		tailModel[1] = new ModelRendererTurbo(this, 530, 349, textureX, textureY); // Box 7
		tailModel[2] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 8
		tailModel[3] = new ModelRendererTurbo(this, 0, 349, textureX, textureY); // Box 11
		tailModel[4] = new ModelRendererTurbo(this, 433, 57, textureX, textureY); // Box 60
		tailModel[5] = new ModelRendererTurbo(this, 257, 57, textureX, textureY); // Box 62
		tailModel[6] = new ModelRendererTurbo(this, 945, 57, textureX, textureY); // Box 63
		tailModel[7] = new ModelRendererTurbo(this, 777, 57, textureX, textureY); // Box 64
		tailModel[8] = new ModelRendererTurbo(this, 137, 81, textureX, textureY); // Box 32
		tailModel[9] = new ModelRendererTurbo(this, 233, 121, textureX, textureY); // Box 33
		tailModel[10] = new ModelRendererTurbo(this, 264, 314, textureX, textureY); // Box 77
		tailModel[11] = new ModelRendererTurbo(this, 530, 314, textureX, textureY); // Box 81
		tailModel[12] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 82
		tailModel[13] = new ModelRendererTurbo(this, 0, 314, textureX, textureY); // Box 85
		tailModel[14] = new ModelRendererTurbo(this, 457, 121, textureX, textureY); // Box 134
		tailModel[15] = new ModelRendererTurbo(this, 881, 65, textureX, textureY); // Box 136
		tailModel[16] = new ModelRendererTurbo(this, 929, 177, textureX, textureY); // Box 137
		tailModel[17] = new ModelRendererTurbo(this, 401, 121, textureX, textureY); // Box 138
		tailModel[18] = new ModelRendererTurbo(this, 729, 241, textureX, textureY); // Box 139
		tailModel[19] = new ModelRendererTurbo(this, 881, 241, textureX, textureY); // Box 140
		tailModel[20] = new ModelRendererTurbo(this, 1, 249, textureX, textureY); // Box 550

		tailModel[0].addShapeBox(0F, 0F, 0F, 116, 8, 14, 0F,0F, 0F, -0.9999F, 0F, -7.9999F, -12.9999F, 0F, -7.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12.9999F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		tailModel[0].setRotationPoint(6F, -49F, -14F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 116, 6, 13, 0F,0F, 0F, -4F, -17F, -8F, -12F, -17F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, -12F, 0F, 8F, 0F, 0F, 0F, 0F); // Box 7
		tailModel[1].setRotationPoint(6F, -55F, -13F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 99, 3, 9, 0F,0F, 0F, -6.9999F, -31.9999F, -5.9999F, -7.9999F, -31.9999F, -5.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7.9999F, -7.9999F, 0F, 7.9999F, 0F, 0F, 0F, 0F); // Box 8
		tailModel[2].setRotationPoint(6F, -58F, -9F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 116, 13, 14, 0F,0F, 0F, 0F, 0F, 0F, -12.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.9999F, 0F, -11.9999F, -12.9999F, 0F, -11.9999F, 0F, 0F, 3.9999F, 0F); // Box 11
		tailModel[3].setRotationPoint(6F, -41F, -14F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 17, 6, 1, 0F,0F, 0F, 0F, -5.9999F, 0F, 0F, -5.9999F, 0F, 0F, 0F, 0F, 0F, 0F, -5.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.9999F, 0F); // Box 60
		tailModel[4].setRotationPoint(105F, -47F, -1F);

		tailModel[5].addShapeBox(0F, 0F, 0F, 9, 11, 1, 0F,0F, 0F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		tailModel[5].setRotationPoint(102F, -89F, -1F);

		tailModel[6].addShapeBox(0F, 0F, 0F, 32, 31, 1, 0F,-16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 63
		tailModel[6].setRotationPoint(73F, -78F, -1F);

		tailModel[7].addShapeBox(0F, 0F, 0F, 13, 11, 1, 0F,-5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		tailModel[7].setRotationPoint(89F, -89F, -1F);

		tailModel[8].addShapeBox(0F, 0F, 0F, 16, 3, 56, 0F,-9F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, -1F, -1F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 32
		tailModel[8].setRotationPoint(77F, -48F, -57F);

		tailModel[9].addShapeBox(0F, 0F, 0F, 16, 3, 55, 0F,-8F, -1F, -3F, -3F, -1F, 0F, -12F, 0F, 0F, 4F, -1F, 0F, -8F, -1F, -3F, -3F, -1F, 0F, -12F, 0F, 0F, 4F, -1F, 0F); // Box 33
		tailModel[9].setRotationPoint(73F, -48F, -56F);

		tailModel[10].addShapeBox(0F, 0F, 0F, 116, 8, 14, 0F,0F, 0F, 0F, 0F, -7.9999F, 0F, 0F, -7.9999F, -12.9999F, 0F, 0F, -0.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12.9999F, 0F, 0F, 0F); // Box 77
		tailModel[10].setRotationPoint(6F, -49F, 0F);

		tailModel[11].addShapeBox(0F, 0F, 0F, 116, 6, 13, 0F,0F, 0F, 0F, -17F, -8F, 0F, -17F, -8F, -12F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, -12F, 0F, 0F, 0F); // Box 81
		tailModel[11].setRotationPoint(6F, -55F, 0F);

		tailModel[12].addShapeBox(0F, 0F, 0F, 99, 3, 9, 0F,0F, 0F, 0F, -31.9999F, -5.9999F, 0F, -31.9999F, -5.9999F, -7.9999F, 0F, 0F, -6.9999F, 0F, 0F, 0F, 0F, 7.9999F, 0F, 0F, 7.9999F, -7.9999F, 0F, 0F, 0F); // Box 82
		tailModel[12].setRotationPoint(6F, -58F, 0F);

		tailModel[13].addShapeBox(0F, 0F, 0F, 116, 13, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12.9999F, 0F, 0F, 0F, 0F, 3.9999F, 0F, 0F, -11.9999F, 0F, 0F, -11.9999F, -12.9999F, 0F, 0F, -3.9999F); // Box 85
		tailModel[13].setRotationPoint(6F, -41F, 0F);

		tailModel[14].addShapeBox(0F, 0F, 0F, 17, 6, 1, 0F,0F, 0F, 0F, -5.9999F, 0F, 0F, -5.9999F, 0F, 0F, 0F, 0F, 0F, 0F, -5.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.9999F, 0F); // Box 134
		tailModel[14].setRotationPoint(105F, -47F, 0F);

		tailModel[15].addShapeBox(0F, 0F, 0F, 9, 11, 1, 0F,0F, 0F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		tailModel[15].setRotationPoint(102F, -89F, 0F);

		tailModel[16].addShapeBox(0F, 0F, 0F, 32, 31, 1, 0F,-16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 137
		tailModel[16].setRotationPoint(73F, -78F, 0F);

		tailModel[17].addShapeBox(0F, 0F, 0F, 13, 11, 1, 0F,-5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		tailModel[17].setRotationPoint(89F, -89F, 0F);

		tailModel[18].addShapeBox(0F, 0F, 0F, 16, 3, 56, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -9F, -1F, -1F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, -9F, -1F, -1F); // Box 139
		tailModel[18].setRotationPoint(77F, -48F, 1F);

		tailModel[19].addShapeBox(0F, 0F, 0F, 16, 3, 55, 0F,4F, -1F, 0F, -12F, 0F, 0F, -3F, -1F, 0F, -8F, -1F, -3F, 4F, -1F, 0F, -12F, 0F, 0F, -3F, -1F, 0F, -8F, -1F, -3F); // Box 140
		tailModel[19].setRotationPoint(73F, -48F, 1F);

		tailModel[20].addShapeBox(0F, 0F, 0F, 105, 1, 1, 0F,0F, -1.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -1.25F, -0.25F, 0F, 0.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.75F, -0.25F); // Box 550
		tailModel[20].setRotationPoint(-9F, -77F, -0.5F);
		tailModel[20].rotateAngleZ = 0.08726646F;
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 45
		leftWingModel[1] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Box 46
		leftWingModel[2] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 47
		leftWingModel[3] = new ModelRendererTurbo(this, 297, 57, textureX, textureY); // Box 48
		leftWingModel[4] = new ModelRendererTurbo(this, 441, 57, textureX, textureY); // Box 49
		leftWingModel[5] = new ModelRendererTurbo(this, 585, 57, textureX, textureY); // Box 50
		leftWingModel[6] = new ModelRendererTurbo(this, 673, 57, textureX, textureY); // Box 54
		leftWingModel[7] = new ModelRendererTurbo(this, 841, 57, textureX, textureY); // Box 56
		leftWingModel[8] = new ModelRendererTurbo(this, 833, 49, textureX, textureY); // Box 57
		leftWingModel[9] = new ModelRendererTurbo(this, 393, 57, textureX, textureY); // Box 58
		leftWingModel[10] = new ModelRendererTurbo(this, 537, 57, textureX, textureY); // Box 59
		leftWingModel[11] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 119
		leftWingModel[12] = new ModelRendererTurbo(this, 73, 161, textureX, textureY); // Box 120
		leftWingModel[13] = new ModelRendererTurbo(this, 145, 169, textureX, textureY); // Box 121
		leftWingModel[14] = new ModelRendererTurbo(this, 801, 177, textureX, textureY); // Box 122
		leftWingModel[15] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 123
		leftWingModel[16] = new ModelRendererTurbo(this, 169, 185, textureX, textureY); // Box 124
		leftWingModel[17] = new ModelRendererTurbo(this, 257, 185, textureX, textureY); // Box 128
		leftWingModel[18] = new ModelRendererTurbo(this, 617, 185, textureX, textureY); // Box 130
		leftWingModel[19] = new ModelRendererTurbo(this, 969, 137, textureX, textureY); // Box 131
		leftWingModel[20] = new ModelRendererTurbo(this, 457, 153, textureX, textureY); // Box 132
		leftWingModel[21] = new ModelRendererTurbo(this, 377, 161, textureX, textureY); // Box 133

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 19, 5, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		leftWingModel[0].setRotationPoint(-52F, -33F, -23F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 26, 5, 14, 0F,0F, 0F, 0F, 0F, -4F, 0F, 14F, -4F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 14F, 0F, 0F, 0F, 0F, 0F); // Box 46
		leftWingModel[1].setRotationPoint(-33F, -33F, -23F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 20, 5, 14, 0F,-1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		leftWingModel[2].setRotationPoint(-72F, -33F, -23F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 19, 5, 51, 0F,-1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		leftWingModel[3].setRotationPoint(-52F, -33F, -74F);

		leftWingModel[4].addShapeBox(0F, 0F, 0F, 19, 5, 51, 0F,-4F, -4F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -4F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		leftWingModel[4].setRotationPoint(-71F, -33F, -74F);

		leftWingModel[5].addShapeBox(0F, 0F, 0F, 26, 5, 51, 0F,3F, 0F, 0F, -8F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		leftWingModel[5].setRotationPoint(-33F, -33F, -74F);

		leftWingModel[6].addShapeBox(0F, 0F, 0F, 15, 2, 67, 0F,-2F, 0F, 0F, -4F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, 0F, 9F, 0F, 0F, 9F, 0F); // Box 54
		leftWingModel[6].setRotationPoint(-51F, -39F, -141F);

		leftWingModel[7].addShapeBox(0F, 0F, 0F, 16, 2, 67, 0F,-6F, -1F, 0F, 2F, 0F, 0F, 0F, -6F, 0F, 0F, -10F, 0F, -6F, 0F, 0F, 2F, 0F, 0F, 0F, 9F, 0F, 0F, 9F, 0F); // Box 56
		leftWingModel[7].setRotationPoint(-67F, -39F, -141F);

		leftWingModel[8].addShapeBox(0F, 0F, 0F, 9, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		leftWingModel[8].setRotationPoint(-49F, -39F, -154F);

		leftWingModel[9].addShapeBox(0F, 0F, 0F, 12, 2, 13, 0F,-5F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -5F, -1F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		leftWingModel[9].setRotationPoint(-61F, -39F, -154F);

		leftWingModel[10].addShapeBox(0F, 0F, 0F, 14, 2, 13, 0F,0F, 0F, 0F, -7F, 0F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -7F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		leftWingModel[10].setRotationPoint(-40F, -39F, -154F);

		leftWingModel[11].addShapeBox(0F, 0F, 0F, 19, 5, 14, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		leftWingModel[11].setRotationPoint(-52F, -33F, 9F);

		leftWingModel[12].addShapeBox(0F, 0F, 0F, 26, 5, 14, 0F,0F, 2F, 0F, 14F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		leftWingModel[12].setRotationPoint(-33F, -33F, 9F);

		leftWingModel[13].addShapeBox(0F, 0F, 0F, 20, 5, 14, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 121
		leftWingModel[13].setRotationPoint(-72F, -33F, 9F);

		leftWingModel[14].addShapeBox(0F, 0F, 0F, 19, 5, 51, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F); // Box 122
		leftWingModel[14].setRotationPoint(-52F, -33F, 23F);

		leftWingModel[15].addShapeBox(0F, 0F, 0F, 19, 5, 51, 0F,0F, -4F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -4F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -4F, 0F, 0F); // Box 123
		leftWingModel[15].setRotationPoint(-71F, -33F, 23F);

		leftWingModel[16].addShapeBox(0F, 0F, 0F, 26, 5, 51, 0F,0F, 0F, 0F, 0F, -4F, 0F, -8F, -4F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 3F, 0F, 0F); // Box 124
		leftWingModel[16].setRotationPoint(-33F, -33F, 23F);

		leftWingModel[17].addShapeBox(0F, 0F, 0F, 15, 2, 67, 0F,0F, -6F, 0F, 0F, -6F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, -4F, 0F, 0F, -2F, 0F, 0F); // Box 128
		leftWingModel[17].setRotationPoint(-51F, -39F, 74F);

		leftWingModel[18].addShapeBox(0F, 0F, 0F, 16, 2, 67, 0F,0F, -10F, 0F, 0F, -6F, 0F, 2F, 0F, 0F, -6F, -1F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 2F, 0F, 0F, -6F, 0F, 0F); // Box 130
		leftWingModel[18].setRotationPoint(-67F, -39F, 74F);

		leftWingModel[19].addShapeBox(0F, 0F, 0F, 9, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 131
		leftWingModel[19].setRotationPoint(-49F, -39F, 141F);

		leftWingModel[20].addShapeBox(0F, 0F, 0F, 12, 2, 13, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -5F, -1F, -3F); // Box 132
		leftWingModel[20].setRotationPoint(-61F, -39F, 141F);

		leftWingModel[21].addShapeBox(0F, 0F, 0F, 14, 2, 13, 0F,0F, 0F, 0F, 0F, -1F, 0F, -7F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, -1F, -3F, 0F, -1F, 0F); // Box 133
		leftWingModel[21].setRotationPoint(-40F, -39F, 141F);
	}

	private void inityawFlapModel_1()
	{
		yawFlapModel[0] = new ModelRendererTurbo(this, 593, 57, textureX, textureY); // Box 61
		yawFlapModel[1] = new ModelRendererTurbo(this, 897, 177, textureX, textureY); // Box 135

		yawFlapModel[0].addShapeBox(0F, 0F, 0F, 11, 31, 1, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		yawFlapModel[0].setRotationPoint(105F, -78F, -1F);

		yawFlapModel[1].addShapeBox(0F, 0F, 0F, 11, 31, 1, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		yawFlapModel[1].setRotationPoint(105F, -78F, 0F);
	}

	private void initpitchFlapLeftModel_1()
	{
		pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 377, 121, textureX, textureY); // Box 34
		pitchFlapLeftModel[1] = new ModelRendererTurbo(this, 545, 185, textureX, textureY); // Box 141

		pitchFlapLeftModel[0].addShapeBox(0F, 0F, 0F, 10, 3, 56, 0F,0F, -1F, 0F, -2F, -1F, -4F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -1F, -4F, 2F, 0F, 0F, 0F, 0.5F, 0F); // Box 34
		pitchFlapLeftModel[0].setRotationPoint(93F, -48F, -57F);

		pitchFlapLeftModel[1].addShapeBox(0F, 0F, 0F, 10, 3, 56, 0F,0F, 0F, 0F, 2F, -2F, 0F, -2F, -1F, -4F, 0F, -1F, 0F, 0F, 0.5F, 0F, 2F, 0F, 0F, -2F, -1F, -4F, 0F, -1F, 0F); // Box 141
		pitchFlapLeftModel[1].setRotationPoint(93F, -48F, 1F);
	}

	private void initpitchFlapLeftWingModel_1()
	{
		pitchFlapLeftWingModel[0] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 55
		pitchFlapLeftWingModel[1] = new ModelRendererTurbo(this, 425, 185, textureX, textureY); // Box 129

		pitchFlapLeftWingModel[0].addShapeBox(0F, 0F, 0F, 25, 2, 67, 0F,0F, 0F, 0F, -11F, -1F, 0F, 0F, -10F, 0F, -4F, -6F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, 0F, 9F, 0F, -4F, 9F, 0F); // Box 55
		pitchFlapLeftWingModel[0].setRotationPoint(-40F, -39F, -141F);

		pitchFlapLeftWingModel[1].addShapeBox(0F, 0F, 0F, 25, 2, 67, 0F,-4F, -6F, 0F, 0F, -10F, 0F, -11F, -1F, 0F, 0F, 0F, 0F, -4F, 9F, 0F, 0F, 9F, 0F, -11F, 0F, 0F, 0F, 0F, 0F); // Box 129
		pitchFlapLeftWingModel[1].setRotationPoint(-40F, -39F, 74F);
	}

	private void inittailWheelModel_1()
	{
		tailWheelModel[0] = new ModelRendererTurbo(this, 497, 121, textureX, textureY); // Import TW_6
		tailWheelModel[1] = new ModelRendererTurbo(this, 529, 121, textureX, textureY); // Box 202
		tailWheelModel[2] = new ModelRendererTurbo(this, 681, 41, textureX, textureY); // Import TW_1
		tailWheelModel[3] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Import TW_2
		tailWheelModel[4] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Import TW_3
		tailWheelModel[5] = new ModelRendererTurbo(this, 393, 57, textureX, textureY); // Import TW_4
		tailWheelModel[6] = new ModelRendererTurbo(this, 537, 57, textureX, textureY); // Import TW_5

		tailWheelModel[0].addShapeBox(0F, -4F, 0F, 12, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Import TW_6
		tailWheelModel[0].setRotationPoint(98F, -34.5F, -2F);
		tailWheelModel[0].rotateAngleZ = 0.13962634F;

		tailWheelModel[1].addShapeBox(0F, -4F, 0F, 12, 4, 1, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		tailWheelModel[1].setRotationPoint(98F, -34.5F, 1F);
		tailWheelModel[1].rotateAngleZ = 0.13962634F;

		tailWheelModel[2].addBox(0F, 0F, 0F, 5, 3, 1, 0F); // Import TW_1
		tailWheelModel[2].setRotationPoint(107F, -32F, -0.5F);

		tailWheelModel[3].addShapeBox(0F, 0F, 0F, 1, 6, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -3F, 0F, -0.25F, 3F, 0F, -0.25F, 3F, 0F, -0.25F, -3F, 0F, -0.25F); // Import TW_2
		tailWheelModel[3].setRotationPoint(106F, -36F, -1F);

		tailWheelModel[4].addShapeBox(0F, -4F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import TW_3
		tailWheelModel[4].setRotationPoint(106F, -36F, -1F);

		tailWheelModel[5].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import TW_4
		tailWheelModel[5].setRotationPoint(107F, -33F, -0.5F);

		tailWheelModel[6].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import TW_5
		tailWheelModel[6].setRotationPoint(107F, -29F, -0.5F);
	}

	private void initleftWingWheelModel_1()
	{
		leftWingWheelModel[0] = new ModelRendererTurbo(this, 865, 113, textureX, textureY); // Import LWW_03
		leftWingWheelModel[1] = new ModelRendererTurbo(this, 273, 185, textureX, textureY); // Import LWW_04
		leftWingWheelModel[2] = new ModelRendererTurbo(this, 361, 185, textureX, textureY); // Import LWW_05
		leftWingWheelModel[3] = new ModelRendererTurbo(this, 721, 25, textureX, textureY); // Import LWW_07
		leftWingWheelModel[4] = new ModelRendererTurbo(this, 593, 33, textureX, textureY); // Import LWW_08
		leftWingWheelModel[5] = new ModelRendererTurbo(this, 625, 57, textureX, textureY); // Import LWW_09
		leftWingWheelModel[6] = new ModelRendererTurbo(this, 801, 41, textureX, textureY); // Import LWW_11
		leftWingWheelModel[7] = new ModelRendererTurbo(this, 121, 81, textureX, textureY); // Import LWW_12
		leftWingWheelModel[8] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Import LWW_13
		leftWingWheelModel[9] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Import LWW_06

		leftWingWheelModel[0].addShapeBox(0F, 0F, 0F, 14, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import LWW_03
		leftWingWheelModel[0].setRotationPoint(-78F, 6F, -38F);

		leftWingWheelModel[1].addBox(0F, 0F, 0F, 14, 6, 4, 0F); // Import LWW_04
		leftWingWheelModel[1].setRotationPoint(-78F, 0F, -38F);

		leftWingWheelModel[2].addShapeBox(0F, 0F, 0F, 14, 4, 4, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LWW_05
		leftWingWheelModel[2].setRotationPoint(-78F, -4F, -38F);

		leftWingWheelModel[3].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F,-1.66666667F, 0F, 0F, 1.66666667F, 0F, 0F, 1.66666667F, 0F, 0F, -1.66666667F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LWW_07
		leftWingWheelModel[3].setRotationPoint(-72F, -4F, -34F);

		leftWingWheelModel[4].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,-2.08333333F, -2F, 0F, 2.08333333F, -2F, 0F, 2.29166667F, -1F, 0F, -2.29166667F, -1F, 0F, -1.66666667F, 0F, -3F, 1.66666667F, 0F, -3F, 1.66666667F, 0F, 2F, -1.66666667F, 0F, 2F); // Import LWW_08
		leftWingWheelModel[4].setRotationPoint(-72F, -8F, -37F);

		leftWingWheelModel[5].addShapeBox(0F, 0F, 0F, 2, 23, 2, 0F,-6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, -2.08333333F, 0F, 0F, 2.08333333F, 0F, 0F, 2.08333333F, 0F, 0F, -2.08333333F, 0F, 0F); // Import LWW_09
		leftWingWheelModel[5].setRotationPoint(-72F, -29F, -37F);

		leftWingWheelModel[6].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LWW_11
		leftWingWheelModel[6].setRotationPoint(-69.5F, -11F, -39.5F);

		leftWingWheelModel[7].addShapeBox(0F, 0F, 0F, 4, 17, 1, 0F,-5F, 0F, 1.04347826F, 5F, 0F, 1.04347826F, 5F, 0F, -1.64347826F, -5F, 0F, -1.64347826F, -1F, -2F, 4F, 6F, 0F, 4F, 6F, 0F, -4.6F, -1F, -2F, -4.6F); // Import LWW_12
		leftWingWheelModel[7].setRotationPoint(-74F, -14F, -37.5F);

		leftWingWheelModel[8].addShapeBox(0F, 0F, 0F, 4, 15, 1, 0F,-6F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, -0.6F, -6F, 0F, -0.6F, -3F, 0F, 1.04347826F, 3F, 0F, 1.04347826F, 3F, 0F, -1.64347826F, -3F, 0F, -1.64347826F); // Import LWW_13
		leftWingWheelModel[8].setRotationPoint(-72F, -29F, -37.5F);

		leftWingWheelModel[9].addBox(0F, 0F, 0F, 2, 2, 5, 0F); // Import LWW_06
		leftWingWheelModel[9].setRotationPoint(-72F, 2F, -38.5F);
	}

	private void initrightWingWheelModel_1()
	{
		rightWingWheelModel[0] = new ModelRendererTurbo(this, 401, 185, textureX, textureY); // Box 158
		rightWingWheelModel[1] = new ModelRendererTurbo(this, 441, 185, textureX, textureY); // Box 159
		rightWingWheelModel[2] = new ModelRendererTurbo(this, 545, 185, textureX, textureY); // Box 160
		rightWingWheelModel[3] = new ModelRendererTurbo(this, 953, 33, textureX, textureY); // Box 161
		rightWingWheelModel[4] = new ModelRendererTurbo(this, 1009, 41, textureX, textureY); // Box 162
		rightWingWheelModel[5] = new ModelRendererTurbo(this, 897, 81, textureX, textureY); // Box 163
		rightWingWheelModel[6] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Box 164
		rightWingWheelModel[7] = new ModelRendererTurbo(this, 177, 89, textureX, textureY); // Box 165
		rightWingWheelModel[8] = new ModelRendererTurbo(this, 617, 89, textureX, textureY); // Box 166
		rightWingWheelModel[9] = new ModelRendererTurbo(this, 777, 73, textureX, textureY); // Box 167

		rightWingWheelModel[0].addShapeBox(0F, 0F, 0F, 14, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 158
		rightWingWheelModel[0].setRotationPoint(-78F, 6F, 34F);

		rightWingWheelModel[1].addBox(0F, 0F, 0F, 14, 6, 4, 0F); // Box 159
		rightWingWheelModel[1].setRotationPoint(-78F, 0F, 34F);

		rightWingWheelModel[2].addShapeBox(0F, 0F, 0F, 14, 4, 4, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		rightWingWheelModel[2].setRotationPoint(-78F, -4F, 34F);

		rightWingWheelModel[3].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F,-1.66666667F, 0F, 0F, 1.66666667F, 0F, 0F, 1.66666667F, 0F, 0F, -1.66666667F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		rightWingWheelModel[3].setRotationPoint(-72F, -4F, 33F);

		rightWingWheelModel[4].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,-2.29166667F, -1F, 0F, 2.29166667F, -1F, 0F, 2.08333333F, -2F, 0F, -2.08333333F, -2F, 0F, -1.66666667F, 0F, 2F, 1.66666667F, 0F, 2F, 1.66666667F, 0F, -3F, -1.66666667F, 0F, -3F); // Box 162
		rightWingWheelModel[4].setRotationPoint(-72F, -8F, 35F);

		rightWingWheelModel[5].addShapeBox(0F, 0F, 0F, 2, 23, 2, 0F,-6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, -2.08333333F, 0F, 0F, 2.08333333F, 0F, 0F, 2.08333333F, 0F, 0F, -2.08333333F, 0F, 0F); // Box 163
		rightWingWheelModel[5].setRotationPoint(-72F, -29F, 35F);

		rightWingWheelModel[6].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 164
		rightWingWheelModel[6].setRotationPoint(-69.5F, -11F, 34.5F);

		rightWingWheelModel[7].addShapeBox(0F, 0F, 0F, 4, 17, 1, 0F,-5F, 0F, -1.64347826F, 5F, 0F, -1.64347826F, 5F, 0F, 1.04347826F, -5F, 0F, 1.04347826F, -1F, -2F, -4.6F, 6F, 0F, -4.6F, 6F, 0F, 4F, -1F, -2F, 4F); // Box 165
		rightWingWheelModel[7].setRotationPoint(-74F, -14F, 36.5F);

		rightWingWheelModel[8].addShapeBox(0F, 0F, 0F, 4, 15, 1, 0F,-6F, 0F, -0.6F, 5F, 0F, -0.6F, 5F, 0F, 0F, -6F, 0F, 0F, -3F, 0F, -1.64347826F, 3F, 0F, -1.64347826F, 3F, 0F, 1.04347826F, -3F, 0F, 1.04347826F); // Box 166
		rightWingWheelModel[8].setRotationPoint(-72F, -29F, 36.5F);

		rightWingWheelModel[9].addBox(0F, 0F, 0F, 2, 2, 5, 0F); // Box 167
		rightWingWheelModel[9].setRotationPoint(-72F, 2F, 33.5F);
	}

	private void inithudModel_1()
	{
		hudModel[0] = new ModelRendererTurbo(this, 801, 241, textureX, textureY); // Box 814

		hudModel[0].addShapeBox(0F, -1F, -1F, 0, 75, 75, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -73F, 0F, 0F, -73F, 0F, -73F, 0F, 0F, -73F, 0F, 0F, -73F, -73F, 0F, -73F, -73F); // Box 814
		hudModel[0].setRotationPoint(-42.5F, -60F, 0F);
		hudModel[0].rotateAngleX = -0.01745329F;
		hudModel[0].rotateAngleY = 0.01745329F;
		hudModel[0].rotateAngleZ = -0.29670597F;
	}

	private void initPropeller()
	{
		propellerModels = new ModelRendererTurbo[1][4];
		propellerModels[0] = makeProp1(-110F, -41F, 0F);
	}

	private ModelRendererTurbo[] makeProp1(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[4];
		prop[0] = new ModelRendererTurbo(this, 0, 253, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 253, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 0, 253, textureX, textureY);
		prop[3] = new ModelRendererTurbo(this, 0, 253, textureX, textureY);
		prop[0].addBox(-1F, -40F, -2F, 2, 40, 4, 0.0F);
		prop[1].addBox(-1F, -40F, -2F, 2, 40, 4, 0.0F);
		prop[2].addBox(-1F, -40F, -2F, 2, 40, 4, 0.0F);
		prop[3].addBox(-1F, -40F, -2F, 2, 40, 4, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		prop[3].setRotationPoint(i, j, k);
		return prop;
	}
}