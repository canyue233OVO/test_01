//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: ICR42
// Model Creator: 
// Created on: 09.04.2023 - 11:18:56
// Last changed on: 09.04.2023 - 11:18:56

package com.flansmod.client.model.Taskball; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelICR42 extends ModelPlane //Same as Filename
{
	int textureX = 1024;
	int textureY = 512;

	public ModelICR42() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[138];
		noseModel = new ModelRendererTurbo[42];
		tailModel = new ModelRendererTurbo[8];
		leftWingModel = new ModelRendererTurbo[24];
		rightWingModel = new ModelRendererTurbo[14];
		topWingModel = new ModelRendererTurbo[18];
		tailWheelModel = new ModelRendererTurbo[2];
		leftWingWheelModel = new ModelRendererTurbo[32];

		initbodyModel_1();
		initnoseModel_1();
		inittailModel_1();
		initleftWingModel_1();
		initrightWingModel_1();
		inittopWingModel_1();
		inittailWheelModel_1();
		initleftWingWheelModel_1();

		initPropeller();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 89, 151, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 545, 1, textureX, textureY); // Box 8
		bodyModel[7] = new ModelRendererTurbo(this, 609, 1, textureX, textureY); // Box 9
		bodyModel[8] = new ModelRendererTurbo(this, 689, 1, textureX, textureY); // Box 10
		bodyModel[9] = new ModelRendererTurbo(this, 753, 1, textureX, textureY); // Box 11
		bodyModel[10] = new ModelRendererTurbo(this, 769, 1, textureX, textureY); // Box 12
		bodyModel[11] = new ModelRendererTurbo(this, 849, 1, textureX, textureY); // Box 13
		bodyModel[12] = new ModelRendererTurbo(this, 929, 1, textureX, textureY); // Box 14
		bodyModel[13] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 15
		bodyModel[14] = new ModelRendererTurbo(this, 29, 35, textureX, textureY); // Box 63
		bodyModel[15] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 211
		bodyModel[16] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 69
		bodyModel[17] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 20
		bodyModel[18] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 21
		bodyModel[19] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 22
		bodyModel[20] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 23
		bodyModel[21] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 24
		bodyModel[22] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 25
		bodyModel[23] = new ModelRendererTurbo(this, 553, 17, textureX, textureY); // Box 26
		bodyModel[24] = new ModelRendererTurbo(this, 617, 17, textureX, textureY); // Box 27
		bodyModel[25] = new ModelRendererTurbo(this, 1001, 1, textureX, textureY); // Box 28
		bodyModel[26] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 29
		bodyModel[27] = new ModelRendererTurbo(this, 681, 17, textureX, textureY); // Box 30
		bodyModel[28] = new ModelRendererTurbo(this, 705, 17, textureX, textureY); // Box 31
		bodyModel[29] = new ModelRendererTurbo(this, 641, 33, textureX, textureY); // Box 76
		bodyModel[30] = new ModelRendererTurbo(this, 737, 33, textureX, textureY); // Box 77
		bodyModel[31] = new ModelRendererTurbo(this, 897, 33, textureX, textureY); // Box 78
		bodyModel[32] = new ModelRendererTurbo(this, 705, 33, textureX, textureY); // Box 79
		bodyModel[33] = new ModelRendererTurbo(this, 801, 33, textureX, textureY); // Box 80
		bodyModel[34] = new ModelRendererTurbo(this, 961, 33, textureX, textureY); // Box 81
		bodyModel[35] = new ModelRendererTurbo(this, 921, 1, textureX, textureY); // Box 82
		bodyModel[36] = new ModelRendererTurbo(this, 609, 17, textureX, textureY); // Box 83
		bodyModel[37] = new ModelRendererTurbo(this, 593, 65, textureX, textureY); // Box 100
		bodyModel[38] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 101
		bodyModel[39] = new ModelRendererTurbo(this, 753, 1, textureX, textureY); // Box 102
		bodyModel[40] = new ModelRendererTurbo(this, 921, 9, textureX, textureY); // Box 103
		bodyModel[41] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 105
		bodyModel[42] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 106
		bodyModel[43] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // Box 109
		bodyModel[44] = new ModelRendererTurbo(this, 433, 41, textureX, textureY); // Box 110
		bodyModel[45] = new ModelRendererTurbo(this, 593, 41, textureX, textureY); // Box 111
		bodyModel[46] = new ModelRendererTurbo(this, 857, 41, textureX, textureY); // Box 112
		bodyModel[47] = new ModelRendererTurbo(this, 617, 41, textureX, textureY); // Box 113
		bodyModel[48] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 114
		bodyModel[49] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 115
		bodyModel[50] = new ModelRendererTurbo(this, 257, 57, textureX, textureY); // Box 116
		bodyModel[51] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 117
		bodyModel[52] = new ModelRendererTurbo(this, 721, 65, textureX, textureY); // Box 118
		bodyModel[53] = new ModelRendererTurbo(this, 121, 73, textureX, textureY); // Box 119
		bodyModel[54] = new ModelRendererTurbo(this, 257, 73, textureX, textureY); // Box 121
		bodyModel[55] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 122
		bodyModel[56] = new ModelRendererTurbo(this, 593, 73, textureX, textureY); // Box 123
		bodyModel[57] = new ModelRendererTurbo(this, 729, 41, textureX, textureY); // Box 124
		bodyModel[58] = new ModelRendererTurbo(this, 929, 73, textureX, textureY); // Box 125
		bodyModel[59] = new ModelRendererTurbo(this, 641, 81, textureX, textureY); // Box 126
		bodyModel[60] = new ModelRendererTurbo(this, 857, 73, textureX, textureY); // Box 127
		bodyModel[61] = new ModelRendererTurbo(this, 593, 49, textureX, textureY); // Box 128
		bodyModel[62] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 129
		bodyModel[63] = new ModelRendererTurbo(this, 553, 17, textureX, textureY); // Box 130
		bodyModel[64] = new ModelRendererTurbo(this, 985, 17, textureX, textureY); // Box 131
		bodyModel[65] = new ModelRendererTurbo(this, 705, 17, textureX, textureY); // Box 132
		bodyModel[66] = new ModelRendererTurbo(this, 1001, 17, textureX, textureY); // Box 133
		bodyModel[67] = new ModelRendererTurbo(this, 745, 17, textureX, textureY); // Box 134
		bodyModel[68] = new ModelRendererTurbo(this, 1017, 17, textureX, textureY); // Box 135
		bodyModel[69] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 136
		bodyModel[70] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Box 137
		bodyModel[71] = new ModelRendererTurbo(this, 457, 97, textureX, textureY); // Box 138
		bodyModel[72] = new ModelRendererTurbo(this, 713, 97, textureX, textureY); // Box 139
		bodyModel[73] = new ModelRendererTurbo(this, 825, 41, textureX, textureY); // Box 140
		bodyModel[74] = new ModelRendererTurbo(this, 881, 41, textureX, textureY); // Box 141
		bodyModel[75] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 142
		bodyModel[76] = new ModelRendererTurbo(this, 705, 49, textureX, textureY); // Box 143
		bodyModel[77] = new ModelRendererTurbo(this, 393, 105, textureX, textureY); // Box 188
		bodyModel[78] = new ModelRendererTurbo(this, 873, 105, textureX, textureY); // Box 189
		bodyModel[79] = new ModelRendererTurbo(this, 937, 113, textureX, textureY); // Box 190
		bodyModel[80] = new ModelRendererTurbo(this, 321, 81, textureX, textureY); // Box 191
		bodyModel[81] = new ModelRendererTurbo(this, 281, 105, textureX, textureY); // Box 192
		bodyModel[82] = new ModelRendererTurbo(this, 593, 89, textureX, textureY); // Box 193
		bodyModel[83] = new ModelRendererTurbo(this, 737, 57, textureX, textureY); // Box 194
		bodyModel[84] = new ModelRendererTurbo(this, 545, 73, textureX, textureY); // Box 195
		bodyModel[85] = new ModelRendererTurbo(this, 393, 137, textureX, textureY); // Box 212
		bodyModel[86] = new ModelRendererTurbo(this, 281, 89, textureX, textureY); // Box 213
		bodyModel[87] = new ModelRendererTurbo(this, 857, 25, textureX, textureY); // Box 214
		bodyModel[88] = new ModelRendererTurbo(this, 905, 25, textureX, textureY); // Box 215
		bodyModel[89] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 216
		bodyModel[90] = new ModelRendererTurbo(this, 721, 89, textureX, textureY); // Box 217
		bodyModel[91] = new ModelRendererTurbo(this, 313, 105, textureX, textureY); // Box 220
		bodyModel[92] = new ModelRendererTurbo(this, 753, 89, textureX, textureY); // Box 221
		bodyModel[93] = new ModelRendererTurbo(this, 777, 89, textureX, textureY); // Box 222
		bodyModel[94] = new ModelRendererTurbo(this, 393, 105, textureX, textureY); // Box 223
		bodyModel[95] = new ModelRendererTurbo(this, 649, 105, textureX, textureY); // Box 224
		bodyModel[96] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 592
		bodyModel[97] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Import 
		bodyModel[98] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 905
		bodyModel[99] = new ModelRendererTurbo(this, 705, 33, textureX, textureY); // Box 906
		bodyModel[100] = new ModelRendererTurbo(this, 801, 33, textureX, textureY); // Box 444
		bodyModel[101] = new ModelRendererTurbo(this, 1009, 33, textureX, textureY); // Box 445
		bodyModel[102] = new ModelRendererTurbo(this, 513, 105, textureX, textureY); // Box 638
		bodyModel[103] = new ModelRendererTurbo(this, 273, 41, textureX, textureY); // Box 639
		bodyModel[104] = new ModelRendererTurbo(this, 913, 89, textureX, textureY); // Box 640
		bodyModel[105] = new ModelRendererTurbo(this, 801, 105, textureX, textureY); // Box 641
		bodyModel[106] = new ModelRendererTurbo(this, 833, 105, textureX, textureY); // Box 642
		bodyModel[107] = new ModelRendererTurbo(this, 801, 89, textureX, textureY); // Box 643
		bodyModel[108] = new ModelRendererTurbo(this, 841, 33, textureX, textureY); // Box 644
		bodyModel[109] = new ModelRendererTurbo(this, 825, 89, textureX, textureY); // Box 645
		bodyModel[110] = new ModelRendererTurbo(this, 961, 33, textureX, textureY); // Box 646
		bodyModel[111] = new ModelRendererTurbo(this, 553, 49, textureX, textureY); // Box 675
		bodyModel[112] = new ModelRendererTurbo(this, 593, 49, textureX, textureY); // Box 676
		bodyModel[113] = new ModelRendererTurbo(this, 705, 49, textureX, textureY); // Box 677
		bodyModel[114] = new ModelRendererTurbo(this, 825, 57, textureX, textureY); // Box 400
		bodyModel[115] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 401
		bodyModel[116] = new ModelRendererTurbo(this, 121, 73, textureX, textureY); // Box 402
		bodyModel[117] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 415
		bodyModel[118] = new ModelRendererTurbo(this, 305, 49, textureX, textureY); // Box 416
		bodyModel[119] = new ModelRendererTurbo(this, 753, 49, textureX, textureY); // Box 417
		bodyModel[120] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 148
		bodyModel[121] = new ModelRendererTurbo(this, 857, 89, textureX, textureY); // Box 247
		bodyModel[122] = new ModelRendererTurbo(this, 625, 89, textureX, textureY); // Box 248
		bodyModel[123] = new ModelRendererTurbo(this, 937, 105, textureX, textureY); // Box 251
		bodyModel[124] = new ModelRendererTurbo(this, 969, 105, textureX, textureY); // Box 252
		bodyModel[125] = new ModelRendererTurbo(this, 457, 113, textureX, textureY); // Box 254
		bodyModel[126] = new ModelRendererTurbo(this, 897, 89, textureX, textureY); // Box 255
		bodyModel[127] = new ModelRendererTurbo(this, 593, 113, textureX, textureY); // Box 256
		bodyModel[128] = new ModelRendererTurbo(this, 625, 113, textureX, textureY); // Box 257
		bodyModel[129] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Import 
		bodyModel[130] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Import 
		bodyModel[131] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Import 
		bodyModel[132] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Import 
		bodyModel[133] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 814
		bodyModel[134] = new ModelRendererTurbo(this, 1, 351, textureX, textureY); // Box 198
		bodyModel[135] = new ModelRendererTurbo(this, 97, 351, textureX, textureY); // Box 199
		bodyModel[136] = new ModelRendererTurbo(this, 193, 351, textureX, textureY); // Box 267
		bodyModel[137] = new ModelRendererTurbo(this, 273, 351, textureX, textureY); // Box 268

		bodyModel[0].addShapeBox(0F, 0F, 0F, 30, 11, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -5.75F, -5.25F, 0F, -1.75F, -2.25F); // Box 0
		bodyModel[0].setRotationPoint(53F, -31F, 0F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 30, 8, 5, 0F,0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, -4.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -9F, 0F, 0F, -9.25F, -4.5F, 0F, -2.75F, -1.25F); // Box 1
		bodyModel[1].setRotationPoint(83F, -31F, 0F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 30, 8, 5, 0F,0F, -1.5F, 0F, 0F, -6F, 0F, 0F, -6.25F, -4.5F, 0F, -2.75F, -1F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -4.25F, 0F, 0F, 0.25F); // Box 2
		bodyModel[2].setRotationPoint(83F, -39F, 0F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 30, 11, 9, 0F,0F, -0.5F, 0F, 0F, -4.5F, 0F, 0F, -5.75F, -5F, 0F, -2.75F, -2.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.75F, 0F, 0F, 0F); // Box 3
		bodyModel[3].setRotationPoint(53F, -42F, 0F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 37, 11, 9, 0F,0F, 1.75F, 0F, 0F, -0.5F, 0F, 0F, -2.75F, -2.75F, 0F, -0.5F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F); // Box 4
		bodyModel[4].setRotationPoint(16F, -42F, 0F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 37, 11, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 3.25F, 0F, 0F, 0F, 0F, 0F, -1.75F, -2.25F, 0F, 1.5F, 0.25F); // Box 5
		bodyModel[5].setRotationPoint(16F, -31F, 0F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 26, 13, 2, 0F,0F, 0F, -1.75F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 2F, 0F, 0F, 0.75F, 0F, -0.5F, 1F, 0F, -0.5F, -1.75F, 0F, 0F, -0.75F); // Box 8
		bodyModel[6].setRotationPoint(-10F, -31F, 9F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 26, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 1.75F, 0F, 0F, -0.75F, 0F, 0F, -2.5F, -0.75F, 0F, -2F, 0.25F); // Box 9
		bodyModel[7].setRotationPoint(-10F, -18F, 0F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 26, 11, 2, 0F,0F, -0.5F, 0.75F, 0F, -0.5F, 0.75F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.25F, 0F, 0F, -4.75F, 0F, 0F, -4F, 0F, 0F, 3.5F, 0F, 0F, 5F); // Box 10
		bodyModel[8].setRotationPoint(-10F, -42F, 6F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 6, 3, 7, 0F,0F, 0.5F, 0F, 0F, 0.75F, 0F, 5.75F, -0.5F, -1.75F, 0F, 0F, -3.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 7.25F, -0.5F, -0.35F, 0F, -0.5F, -0.25F); // Box 11
		bodyModel[9].setRotationPoint(-10F, -44F, 0F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 26, 13, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -2F); // Box 12
		bodyModel[10].setRotationPoint(-36F, -31F, 0F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 26, 10, 12, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -5.25F, 0F, -1F, -4.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1.5F); // Box 13
		bodyModel[11].setRotationPoint(-36F, -41F, 0F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 26, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -4F, 1.25F, 0F, -4F, 1F); // Box 14
		bodyModel[12].setRotationPoint(-36F, -18F, 0F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 26, 3, 7, 0F,0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -3.5F, 0F, -2.25F, -2.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, 1F, 0.25F); // Box 15
		bodyModel[13].setRotationPoint(-36F, -44F, 0F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0F, 0F, -2F, 0.5F, 0F, -2F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 1F, 0F, 0F, 1F, -0.25F); // Box 63
		bodyModel[14].setRotationPoint(2F, -49F, 1F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0.5F, -2.75F, 0.75F, 0.5F, -2.75F, 0.75F, 0.5F, 3.1F, 0F, 0.5F, 3.1F); // Box 211
		bodyModel[15].setRotationPoint(2F, -47F, 2.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0.5F, -1.45F, -0.2F, 0F, -1.45F, -1.2F, 0F, -1.45F, 0.55F, 0.25F, -1.45F, -0.7F, 1F, 0.8F, -0.2F, 0F, 0.8F, -1.45F, 0F, 0.8F, 0.8F, 1F, 0.8F, -0.7F); // Box 69
		bodyModel[16].setRotationPoint(-1F, -48.5F, 1.75F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 20
		bodyModel[17].setRotationPoint(2F, -49F, 0F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.25F, -0.75F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.75F, -0.25F, 0F, -0.75F); // Box 21
		bodyModel[18].setRotationPoint(-0.5F, -49F, 0F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.75F, 0F, -1F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, -0.75F, -0.75F, 0F, 0.25F, -0.75F, -0.75F, -1F, 0.25F, -1F, 0F, 0.25F, -1F, -0.75F, -0.75F, -0.75F, 0.25F); // Box 22
		bodyModel[19].setRotationPoint(-1.5F, -48F, 0F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -1F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, -0.75F, -0.75F, -0.5F, 0F, 0F, 0F, -1F, 0.25F, -1F, 0F, 0.25F, -1F, -0.75F, -0.75F, 0F, 0F); // Box 23
		bodyModel[20].setRotationPoint(-2F, -47.75F, 1F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 23, 9, 12, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -4.75F, 0F, -1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1F); // Box 24
		bodyModel[21].setRotationPoint(-59F, -40F, 0F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 23, 13, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.5F, -2.75F); // Box 25
		bodyModel[22].setRotationPoint(-59F, -31F, 0F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 23, 3, 7, 0F,0F, -0.75F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, -2.75F, 0F, -1.25F, -3.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.25F, 0F, 0F, 0F); // Box 26
		bodyModel[23].setRotationPoint(-59F, -42F, 0F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 23, 4, 8, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0.5F, 1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 2F, 0F, -4.5F, 1.25F); // Box 27
		bodyModel[24].setRotationPoint(-59F, -18F, 0F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 7, 12, 3, 0F,0F, 0F, 0F, 0F, 0F, -3.25F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, -1.25F, 1.25F, 0F, 0.5F, 0F, 0F, 0.5F, -1.75F, 0F, -1.25F, -3F); // Box 28
		bodyModel[25].setRotationPoint(-66F, -31F, 8F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 7, 2, 9, 0F,0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, -1F, 0F, 2.25F, -2.25F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0.25F, 0F, -4.25F, -1F); // Box 29
		bodyModel[26].setRotationPoint(-66F, -18F, 0F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 7, 7, 3, 0F,0F, -0.5F, 3.75F, 0F, 1F, 2F, 0F, 1F, -4F, 0F, -0.75F, -5.5F, 0F, 0F, 0F, 0F, 0F, -3.25F, 0F, 0F, 2F, 0F, 0F, -1F); // Box 30
		bodyModel[27].setRotationPoint(-66F, -38F, 8F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 7, 2, 7, 0F,-0.25F, -2.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, -3.25F, 0F, -3.75F, -1.5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, -1.5F); // Box 31
		bodyModel[28].setRotationPoint(-66F, -41F, 0F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 17, 2, 28, 0F,2F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, -9.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0.5F, 0F, -1.5F, 0F, -11F, -1.5F, 0F); // Box 76
		bodyModel[29].setRotationPoint(75F, -33F, 4F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 17, 2, 28, 0F,-1F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, -1.5F, 0F, -11.25F, -1.5F, 0F, 2F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, -9.5F, 0F, 0F); // Box 77
		bodyModel[30].setRotationPoint(75F, -35F, 4F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 14, 3, 29, 0F,0F, 0F, 0F, 0.75F, -2F, 2F, -5F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0.75F, -1F, 2F, -5F, -1.5F, 0F, 0F, -1F, 0F); // Box 78
		bodyModel[31].setRotationPoint(92F, -34.5F, 3F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 6, 1, 7, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, -1.25F, -2.25F, -0.25F, -2F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.75F, -1.75F, -0.25F, -1.5F); // Box 79
		bodyModel[32].setRotationPoint(86F, -34F, 32F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 6, 1, 7, 0F,1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.75F, -1.75F, 0.25F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, -1.25F, -2.25F, -0.75F, -2F); // Box 80
		bodyModel[33].setRotationPoint(86F, -33F, 32F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 9, 1, 6, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, -4.25F, -0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, -4.25F, -0.75F, -0.25F, 0F, -0.5F, -0.25F); // Box 81
		bodyModel[34].setRotationPoint(92F, -33.5F, 32F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -2F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, -2F, 0F, -1F, 0F); // Box 82
		bodyModel[35].setRotationPoint(92F, -33.5F, 37.75F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F,0F, 0.75F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0F, 0F, -3.25F, 0F, 0F, 0F, 0.5F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 83
		bodyModel[36].setRotationPoint(-4F, -44F, 0F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 63, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 1.75F, 0F, 0.75F, 0F, 0F, -1F, 0F, 0F, -1F, -0.25F, 0F, 0.25F, 0.25F); // Box 100
		bodyModel[37].setRotationPoint(-59F, -16F, 0F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 6, 2, 3, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 2F, -0.25F, 0F, -1F, 0F, 0F, 0.75F, 0F, 0F, 0.25F, -0.75F, 0F, -1.75F, -0.75F); // Box 101
		bodyModel[38].setRotationPoint(-65F, -16F, 0F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.75F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0.25F, 0F, -1.25F, 0.25F); // Box 102
		bodyModel[39].setRotationPoint(-66F, -16F, 0F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0.25F, -0.25F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, -0.75F, 0F, -0.25F, -0.75F); // Box 103
		bodyModel[40].setRotationPoint(-66F, -18F, 2F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 26, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F); // Box 105
		bodyModel[41].setRotationPoint(-10F, -26F, 0F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 12, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -2F, 0F, 0F, -0.25F); // Box 106
		bodyModel[42].setRotationPoint(4F, -17F, 0F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 20, 26, 1, 0F,-11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, 0F, 3F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[43].setRotationPoint(73F, -61F, 0F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 9, 4, 1, 0F,-4F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 110
		bodyModel[44].setRotationPoint(84F, -65F, 0F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 9, 4, 1, 0F,0F, 0F, 0F, -4F, -1F, 0F, -5F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[45].setRotationPoint(93F, -65F, 0F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 9, 23, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[46].setRotationPoint(93F, -61F, 0F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 15, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[47].setRotationPoint(93F, -38F, 0F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 30, 11, 9, 0F,0F, 0F, 0F, 0F, 0F, -3.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, -2.25F, 0F, -5.75F, -5.25F, 0F, -3.5F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[48].setRotationPoint(53F, -31F, -9F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 30, 8, 5, 0F,0F, 0F, 0.25F, 0F, 1.5F, -4.25F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, -2.75F, -1.25F, 0F, -9.25F, -4.5F, 0F, -9F, 0F, 0F, -0.5F, 0F); // Box 115
		bodyModel[49].setRotationPoint(83F, -31F, -5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 30, 8, 5, 0F,0F, -2.75F, -1F, 0F, -6.25F, -4.5F, 0F, -6F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0.25F, 0F, -1.5F, -4.25F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[50].setRotationPoint(83F, -39F, -5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 30, 11, 9, 0F,0F, -2.75F, -2.75F, 0F, -5.75F, -5F, 0F, -4.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -3.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		bodyModel[51].setRotationPoint(53F, -42F, -9F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 37, 11, 9, 0F,0F, -0.5F, -2.5F, 0F, -2.75F, -2.75F, 0F, -0.5F, 0F, 0F, 1.75F, 0F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		bodyModel[52].setRotationPoint(16F, -42F, -9F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 37, 11, 9, 0F,0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0.25F, 0F, -1.75F, -2.25F, 0F, 0F, 0F, 0F, 3.25F, 0F); // Box 119
		bodyModel[53].setRotationPoint(16F, -31F, -9F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 26, 13, 2, 0F,0F, 0F, 2F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1.75F, 0F, 0F, -0.75F, 0F, -0.5F, -1.75F, 0F, -0.5F, 1F, 0F, 0F, 0.75F); // Box 121
		bodyModel[54].setRotationPoint(-10F, -31F, -11F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 26, 2, 10, 0F,0F, 0F, 0.25F, 0F, 0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0.25F, 0F, -2.5F, -0.75F, 0F, -0.75F, 0F, 0F, 1.75F, 0F); // Box 122
		bodyModel[55].setRotationPoint(-10F, -18F, -10F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 26, 11, 2, 0F,0F, -0.5F, -1.25F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0.75F, 0F, -0.5F, 0.75F, 0F, 0F, 5F, 0F, 0F, 3.5F, 0F, 0F, -4F, 0F, 0F, -4.75F); // Box 123
		bodyModel[56].setRotationPoint(-10F, -42F, -8F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 6, 3, 7, 0F,0F, 0F, -3.5F, 5.75F, -0.5F, -1.75F, 0F, 0.75F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, -0.25F, 7.25F, -0.5F, -0.35F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 124
		bodyModel[57].setRotationPoint(-10F, -44F, -7F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 26, 13, 12, 0F,0F, 0F, 1.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[58].setRotationPoint(-36F, -31F, -12F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 26, 10, 12, 0F,0F, -1F, -4.75F, 0F, 0.5F, -5.25F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[59].setRotationPoint(-36F, -41F, -12F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 26, 4, 9, 0F,0F, 0F, 1F, 0F, 0F, 1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 1F, 0F, -4F, 1.25F, 0F, -0.25F, 0F, 0F, 0F, 0F); // Box 127
		bodyModel[60].setRotationPoint(-36F, -18F, -9F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 26, 3, 7, 0F,0F, -2.25F, -2.75F, 0F, 0F, -3.5F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 128
		bodyModel[61].setRotationPoint(-36F, -44F, -7F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -2F, 0F, 0F, -2F, 0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.25F, 0F, 1F, -0.25F, 0F, 1F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 129
		bodyModel[62].setRotationPoint(2F, -49F, -3F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 3.1F, 0.75F, 0.5F, 3.1F, 0.75F, 0.5F, -2.75F, 0.25F, 0.5F, -2.75F); // Box 130
		bodyModel[63].setRotationPoint(2F, -47F, -3.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0.25F, -1.45F, -0.7F, 0F, -1.45F, 0.55F, 0F, -1.45F, -1.2F, 0.5F, -1.45F, -0.2F, 1F, 0.8F, -0.7F, 0F, 0.8F, 0.8F, 0F, 0.8F, -1.45F, 1F, 0.8F, -0.2F); // Box 131
		bodyModel[64].setRotationPoint(-1F, -48.5F, -2.75F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 132
		bodyModel[65].setRotationPoint(2F, -49F, -1F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.25F, -0.75F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F); // Box 133
		bodyModel[66].setRotationPoint(-0.5F, -49F, -1F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.75F, 0F, 0.25F, 0.25F, 0.25F, -0.75F, 0.25F, 0.25F, 0F, -0.75F, 0F, -1F, -0.75F, -0.75F, 0.25F, 0.25F, -1F, -0.75F, 0.25F, -1F, 0F, -0.75F, -0.75F, -1F); // Box 134
		bodyModel[67].setRotationPoint(-1.5F, -48F, -1F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.75F, -0.5F, 0F, 0.25F, 0.25F, -0.75F, 0.25F, 0.25F, 0F, 0F, -1F, -1F, -0.75F, 0F, 0F, 0.25F, -1F, -0.75F, 0.25F, -1F, 0F, 0F, 0F, -1F); // Box 135
		bodyModel[68].setRotationPoint(-2F, -47.75F, -2F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 23, 9, 12, 0F,0F, -1F, -5F, 0F, 0F, -4.75F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		bodyModel[69].setRotationPoint(-59F, -40F, -12F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 23, 13, 12, 0F,0F, 0F, 1F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2.75F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 137
		bodyModel[70].setRotationPoint(-59F, -31F, -12F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 23, 3, 7, 0F,0F, -1.25F, -3.25F, 0F, -0.25F, -2.75F, 0F, 0.5F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -1F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[71].setRotationPoint(-59F, -42F, -7F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 23, 4, 8, 0F,0F, 0.5F, 1.25F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -4.5F, 1.25F, 0F, -4F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		bodyModel[72].setRotationPoint(-59F, -18F, -8F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 7, 12, 3, 0F,0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, -3.25F, 0F, 0F, 0F, 0F, -1.25F, -3F, 0F, 0.5F, -1.75F, 0F, 0.5F, 0F, 0F, -1.25F, 1.25F); // Box 140
		bodyModel[73].setRotationPoint(-66F, -31F, -11F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 7, 2, 9, 0F,0F, 2.25F, -2.25F, 0F, 0.5F, -1F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -4.25F, -1F, 0F, -2.5F, 0.25F, 0F, 2F, 0F, 0F, -1F, 0F); // Box 141
		bodyModel[74].setRotationPoint(-66F, -18F, -9F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 7, 7, 3, 0F,0F, -0.75F, -5.5F, 0F, 1F, -4F, 0F, 1F, 2F, 0F, -0.5F, 3.75F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, -3.25F, 0F, 0F, 0F); // Box 142
		bodyModel[75].setRotationPoint(-66F, -38F, -11F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 7, 2, 7, 0F,0F, -3.75F, -1.5F, 0F, -0.25F, -3.25F, 0F, 0.25F, 0F, -0.25F, -2.25F, 0F, 0F, 1.75F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 143
		bodyModel[76].setRotationPoint(-66F, -41F, -7F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 17, 2, 28, 0F,-9.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 2F, 0F, 0F, -11F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0.5F, -0.5F, -1F, 0F); // Box 188
		bodyModel[77].setRotationPoint(75F, -33F, -32F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 17, 2, 28, 0F,-11.25F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 1F, -1F, -0.5F, 0F, -9.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 2F, 0F, 0F); // Box 189
		bodyModel[78].setRotationPoint(75F, -35F, -32F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 14, 3, 29, 0F,0F, -1F, 0F, -5F, -1.5F, 0F, 0.75F, -2F, 2F, 0F, 0F, 0F, 0F, -1F, 0F, -5F, -1.5F, 0F, 0.75F, -1F, 2F, 0F, 0F, 0F); // Box 190
		bodyModel[79].setRotationPoint(92F, -34.5F, -32F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 6, 1, 7, 0F,-2.25F, -0.25F, -2F, 0F, -0.25F, -1.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.75F, -0.25F, -1.5F, 0F, -0.5F, 0.75F, 0F, 0F, 0F, 1.5F, 0F, 0F); // Box 191
		bodyModel[80].setRotationPoint(86F, -34F, -39F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 6, 1, 7, 0F,-1.75F, 0.25F, -1.5F, 0F, 0.5F, 0.75F, 0F, 0F, 0F, 1.5F, 0F, 0F, -2.25F, -0.75F, -2F, 0F, -1F, -1.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 192
		bodyModel[81].setRotationPoint(86F, -33F, -39F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 9, 1, 6, 0F,0F, 0.25F, -0.25F, -4.25F, -0.25F, -0.25F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, -4.25F, -0.75F, -0.25F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[82].setRotationPoint(92F, -33.5F, -38F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, -0.25F, -0.25F, -2F, -0.25F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, -0.25F, -0.75F, -2F, -0.25F, -0.75F, 0F, 0F, -0.5F, 0F); // Box 194
		bodyModel[83].setRotationPoint(92F, -33.5F, -39.75F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F,-3.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.5F, 0F, 0F, 0.75F, 0F, 0F, 0.5F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 195
		bodyModel[84].setRotationPoint(-4F, -44F, -3F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 63, 2, 2, 0F,0F, 0F, 1.75F, 0F, 1F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0.25F, 0F, -1F, -0.25F, 0F, -1F, 0F, 0F, 0.75F, 0F); // Box 212
		bodyModel[85].setRotationPoint(-59F, -16F, -2F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 6, 2, 3, 0F,0F, 2F, -0.25F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1.75F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.75F, 0F, 0F, -1F, 0F); // Box 213
		bodyModel[86].setRotationPoint(-65F, -16F, -3F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, 0.25F, 0F, -0.75F, 0.25F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 214
		bodyModel[87].setRotationPoint(-66F, -16F, -2F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0.25F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.75F, 0F); // Box 215
		bodyModel[88].setRotationPoint(-66F, -18F, -3F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 26, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 216
		bodyModel[89].setRotationPoint(-10F, -26F, -10F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 12, 2, 2, 0F,0F, 0F, 0.75F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -1.5F, -2F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 217
		bodyModel[90].setRotationPoint(4F, -17F, -2F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 20, 26, 1, 0F,-14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -4F, 0F); // Box 220
		bodyModel[91].setRotationPoint(73F, -61F, -1F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 9, 4, 1, 0F,-5F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -4F, -1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221
		bodyModel[92].setRotationPoint(84F, -65F, -1F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 9, 4, 1, 0F,0F, -1F, 0F, -5F, -2F, 0F, -4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 222
		bodyModel[93].setRotationPoint(93F, -65F, -1F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 9, 23, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[94].setRotationPoint(93F, -61F, -1F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 15, 5, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[95].setRotationPoint(93F, -38F, -1F);

		bodyModel[96].addShapeBox(-0.5F, 0F, -0.5F, 1, 9, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 592
		bodyModel[96].setRotationPoint(-1.5F, -35.5F, 0F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import 
		bodyModel[97].setRotationPoint(-2F, -27F, -1F);

		bodyModel[98].addShapeBox(0F, -1F, 0F, 1, 1, 2, 0F,0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Box 905
		bodyModel[98].setRotationPoint(-8F, -28.5F, -4F);
		bodyModel[98].rotateAngleZ = 0.41887903F;

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Box 906
		bodyModel[99].setRotationPoint(-8F, -28.5F, -4F);
		bodyModel[99].rotateAngleZ = 0.41887903F;

		bodyModel[100].addShapeBox(0F, -1F, 0F, 1, 1, 2, 0F,0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Box 444
		bodyModel[100].setRotationPoint(-8F, -28.5F, 2F);
		bodyModel[100].rotateAngleZ = 0.41887903F;

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Box 445
		bodyModel[101].setRotationPoint(-8F, -28.5F, 2F);
		bodyModel[101].rotateAngleZ = 0.41887903F;

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 12, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F); // Box 638
		bodyModel[102].setRotationPoint(15.5F, -43F, -5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F); // Box 639
		bodyModel[103].setRotationPoint(12.5F, -31F, -6F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -1F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F); // Box 640
		bodyModel[104].setRotationPoint(9.5F, -28F, -6F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 641
		bodyModel[105].setRotationPoint(3.5F, -27F, -6F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 642
		bodyModel[106].setRotationPoint(0.5F, -29F, -6F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 7, 4, 1, 0F,4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F); // Box 643
		bodyModel[107].setRotationPoint(5.5F, -31F, -6F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F); // Box 644
		bodyModel[108].setRotationPoint(0.5F, -31F, -6F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 7, 4, 1, 0F,4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F); // Box 645
		bodyModel[109].setRotationPoint(5.5F, -31F, 5F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F); // Box 646
		bodyModel[110].setRotationPoint(0.5F, -31F, 5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 675
		bodyModel[111].setRotationPoint(-1.5F, -43.25F, 1.5F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 676
		bodyModel[112].setRotationPoint(-1.5F, -42.75F, 1.5F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 677
		bodyModel[113].setRotationPoint(-1.5F, -42.75F, 1.5F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 400
		bodyModel[114].setRotationPoint(-1.5F, -43.25F, -3F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 401
		bodyModel[115].setRotationPoint(-1.5F, -42.75F, -3F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 402
		bodyModel[116].setRotationPoint(-1.5F, -42.75F, -3F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 415
		bodyModel[117].setRotationPoint(-1.5F, -44.25F, -1.25F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 416
		bodyModel[118].setRotationPoint(-1.5F, -43.75F, -1.25F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 417
		bodyModel[119].setRotationPoint(-1.5F, -42.75F, -1.25F);

		bodyModel[120].addShapeBox(-0.5F, 0F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		bodyModel[120].setRotationPoint(-1.5F, -38.5F, 0F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 13, 1, 3, 0F,0F, 1F, -0.75F, -0.75F, 4.5F, -0.5F, -0.75F, 4F, 0F, 0F, 0F, 0F, 0F, -0.25F, -2F, -0.75F, -1.5F, -1F, -0.75F, -1F, 0F, 0F, -0.25F, 0F); // Box 247
		bodyModel[121].setRotationPoint(83F, -24F, -3F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 10, 1, 2, 0F,0F, 0F, 0F, 0F, 1F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1.25F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[122].setRotationPoint(73F, -24F, -2F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 12, 1, 3, 0F,-0.25F, 0.5F, -0.5F, -3.5F, 2.25F, -1.5F, 0.25F, 2.5F, 0F, -0.25F, 0F, 0F, -0.25F, 2.5F, -1F, -3.5F, 0.75F, -1.5F, 0F, 0F, 0F, -0.25F, 3F, 0F); // Box 251
		bodyModel[123].setRotationPoint(95F, -28F, -3F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 12, 1, 2, 0F,0F, 0.5F, 0F, -3.5F, 2.25F, -0.5F, 0F, 3F, 0F, 0F, 0F, 0F, -3.25F, 0.25F, -0.25F, -3.5F, -1F, -0.75F, -0.25F, -1.75F, 0F, -1.5F, 0.5F, 0F); // Box 252
		bodyModel[124].setRotationPoint(95F, -24F, -2F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 13, 1, 3, 0F,0F, 0F, 0F, -0.75F, 4F, 0F, -0.75F, 4.5F, -0.5F, 0F, 1F, -0.75F, 0F, -0.25F, 0F, -0.75F, -1F, 0F, -0.75F, -1.5F, -1F, 0F, -0.25F, -2F); // Box 254
		bodyModel[125].setRotationPoint(83F, -24F, 0F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 10, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, 0.5F, -1.25F); // Box 255
		bodyModel[126].setRotationPoint(73F, -24F, 0F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 12, 1, 3, 0F,-0.25F, 0F, 0F, 0.25F, 2.5F, 0F, -3.5F, 2.25F, -1.5F, -0.25F, 0.5F, -0.5F, -0.25F, 3F, 0F, 0F, 0F, 0F, -3.5F, 0.75F, -1.5F, -0.25F, 2.5F, -1F); // Box 256
		bodyModel[127].setRotationPoint(95F, -28F, 0F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 12, 1, 2, 0F,0F, 0F, 0F, 0F, 3F, 0F, -3.5F, 2.25F, -0.5F, 0F, 0.5F, 0F, -1.5F, 0.5F, 0F, -0.25F, -1.75F, 0F, -3.5F, -1F, -0.75F, -3.25F, 0.25F, -0.25F); // Box 257
		bodyModel[128].setRotationPoint(95F, -24F, 0F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.0F, 0.0F, 0.2F, -0.5F, 0.0F, 0.2F, -0.5F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, -0.5F, 0.2F, -0.5F, -0.5F, 0.2F, -0.5F, -0.5F, 0.2F, 0.0F, -0.5F, 0.2F); // Import 
		bodyModel[129].setRotationPoint(-2.1F, -45.02F, -0.5F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.0F, 0.0F, 0.2F, -0.5F, 0.0F, -0.3F, -0.5F, 0.0F, -0.3F, 0.0F, 0.0F, 0.2F, 0.0F, -0.5F, 0.2F, -0.5F, -0.5F, -0.3F, -0.5F, -0.5F, -0.3F, 0.0F, -0.5F, 0.2F); // Import 
		bodyModel[130].setRotationPoint(-1.6F, -45.02F, -0.5F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0.0F, -0.3F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, -0.5F, 0.0F, -0.3F, -0.5F, -0.5F, -0.3F, 0.0F, -0.5F, 0.2F, 0.0F, -0.5F, 0.2F, -0.5F, -0.5F, -0.3F); // Import 
		bodyModel[131].setRotationPoint(-3.09999999999999F, -45.02F, -0.5F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F); // Import 
		bodyModel[132].setRotationPoint(-2.40000000000001F, -45.32F, -0.5F);

		bodyModel[133].addShapeBox(0F, -2F, -1F, 0, 75, 75, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -73F, 0F, 0F, -73F, 0F, -73F, 0F, 0F, -73F, 0F, 0F, -73F, -73F, 0F, -73F, -73F); // Box 814
		bodyModel[133].setRotationPoint(-2.00000000000001F, -45F, -0.0500000000000007F);
		bodyModel[133].rotateAngleX = -0.01745329F;
		bodyModel[133].rotateAngleY = 0.01745329F;
		bodyModel[133].rotateAngleZ = -0.29670597F;

		bodyModel[134].addShapeBox(0F, 0F, 0F, 30, 0, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		bodyModel[134].setRotationPoint(-38F, -53.25F, -87F);
		bodyModel[134].rotateAngleZ = -0.05235988F;

		bodyModel[135].addShapeBox(0F, 0F, 0F, 30, 0, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		bodyModel[135].setRotationPoint(-38F, -53.25F, 57F);
		bodyModel[135].rotateAngleZ = -0.05235988F;

		bodyModel[136].addShapeBox(0F, 0F, 0F, 25, 0, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 267
		bodyModel[136].setRotationPoint(-32F, -20.25F, -65F);
		bodyModel[136].rotateAngleX = -0.01745329F;
		bodyModel[136].rotateAngleZ = 0.01745329F;

		bodyModel[137].addShapeBox(0F, 0F, 0F, 25, 0, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 268
		bodyModel[137].setRotationPoint(-32F, -20.25F, 40F);
		bodyModel[137].rotateAngleX = 0.01745329F;
		bodyModel[137].rotateAngleZ = -0.01745329F;
	}

	private void initnoseModel_1()
	{
		noseModel[0] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 30
		noseModel[1] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 31
		noseModel[2] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 170
		noseModel[3] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 185
		noseModel[4] = new ModelRendererTurbo(this, 281, 25, textureX, textureY); // Box 186
		noseModel[5] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 187
		noseModel[6] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 188
		noseModel[7] = new ModelRendererTurbo(this, 841, 1, textureX, textureY); // Box 75
		noseModel[8] = new ModelRendererTurbo(this, 745, 33, textureX, textureY); // Box 459
		noseModel[9] = new ModelRendererTurbo(this, 825, 33, textureX, textureY); // Box 460
		noseModel[10] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 461
		noseModel[11] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Box 462
		noseModel[12] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // Box 463
		noseModel[13] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 464
		noseModel[14] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 465
		noseModel[15] = new ModelRendererTurbo(this, 673, 17, textureX, textureY); // Box 466
		noseModel[16] = new ModelRendererTurbo(this, 729, 17, textureX, textureY); // Box 468
		noseModel[17] = new ModelRendererTurbo(this, 937, 17, textureX, textureY); // Box 470
		noseModel[18] = new ModelRendererTurbo(this, 953, 17, textureX, textureY); // Box 471
		noseModel[19] = new ModelRendererTurbo(this, 993, 33, textureX, textureY); // Box 472
		noseModel[20] = new ModelRendererTurbo(this, 969, 17, textureX, textureY); // Box 473
		noseModel[21] = new ModelRendererTurbo(this, 801, 49, textureX, textureY); // Box 156
		noseModel[22] = new ModelRendererTurbo(this, 985, 57, textureX, textureY); // Box 157
		noseModel[23] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 158
		noseModel[24] = new ModelRendererTurbo(this, 809, 65, textureX, textureY); // Box 159
		noseModel[25] = new ModelRendererTurbo(this, 81, 73, textureX, textureY); // Box 160
		noseModel[26] = new ModelRendererTurbo(this, 321, 73, textureX, textureY); // Box 161
		noseModel[27] = new ModelRendererTurbo(this, 657, 73, textureX, textureY); // Box 162
		noseModel[28] = new ModelRendererTurbo(this, 905, 41, textureX, textureY); // Box 187
		noseModel[29] = new ModelRendererTurbo(this, 921, 73, textureX, textureY); // Box 199
		noseModel[30] = new ModelRendererTurbo(this, 1001, 73, textureX, textureY); // Box 200
		noseModel[31] = new ModelRendererTurbo(this, 897, 57, textureX, textureY); // Box 201
		noseModel[32] = new ModelRendererTurbo(this, 961, 57, textureX, textureY); // Box 202
		noseModel[33] = new ModelRendererTurbo(this, 913, 57, textureX, textureY); // Box 203
		noseModel[34] = new ModelRendererTurbo(this, 729, 33, textureX, textureY); // Box 204
		noseModel[35] = new ModelRendererTurbo(this, 881, 41, textureX, textureY); // Box 205
		noseModel[36] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 206
		noseModel[37] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Box 207
		noseModel[38] = new ModelRendererTurbo(this, 337, 57, textureX, textureY); // Box 208
		noseModel[39] = new ModelRendererTurbo(this, 977, 57, textureX, textureY); // Box 209
		noseModel[40] = new ModelRendererTurbo(this, 1009, 81, textureX, textureY); // Box 210
		noseModel[41] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 211

		noseModel[0].addShapeBox(0F, 0F, 0F, 7, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.25F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -1.75F, -1.25F, 0F, -3.5F, -3.5F); // Box 30
		noseModel[0].setRotationPoint(-76F, -28F, 0F);

		noseModel[1].addShapeBox(0F, 0F, 0F, 7, 4, 4, 0F,0F, -3F, 0F, 0F, -0.25F, 0F, 0F, -1.75F, -1.25F, 0F, -3.5F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.25F); // Box 31
		noseModel[1].setRotationPoint(-76F, -32F, 0F);

		noseModel[2].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
		noseModel[2].setRotationPoint(-44.5F, -41.5F, 5.25F);

		noseModel[3].addShapeBox(0F, 0F, 0F, 8, 2, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		noseModel[3].setRotationPoint(-37F, -42.5F, 3F);

		noseModel[4].addShapeBox(0F, 0F, 0F, 8, 2, 3, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -3F, -1.25F, 0F, -3F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1.25F, 0F, 1F, -2F); // Box 186
		noseModel[4].setRotationPoint(-37F, -42.5F, 6F);

		noseModel[5].addShapeBox(0F, 0F, 0F, 8, 2, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, -1.75F, 0F, -3F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 1F, -1.25F); // Box 187
		noseModel[5].setRotationPoint(-29F, -42.5F, 6F);

		noseModel[6].addShapeBox(0F, 0F, 0F, 8, 2, 3, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
		noseModel[6].setRotationPoint(-29F, -42.5F, 3F);

		noseModel[7].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		noseModel[7].setRotationPoint(-69F, -29F, 0F);

		noseModel[8].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 459
		noseModel[8].setRotationPoint(-44.5F, -21F, 9F);

		noseModel[9].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 460
		noseModel[9].setRotationPoint(-44.5F, -19F, 9F);

		noseModel[10].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 461
		noseModel[10].setRotationPoint(-44.5F, -20F, 9F);

		noseModel[11].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 462
		noseModel[11].setRotationPoint(-42.5F, -21F, 12F);

		noseModel[12].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 463
		noseModel[12].setRotationPoint(-44.5F, -20F, 12F);

		noseModel[13].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 464
		noseModel[13].setRotationPoint(-44.5F, -20F, 14F);

		noseModel[14].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 465
		noseModel[14].setRotationPoint(-44.5F, -21F, 13F);

		noseModel[15].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 466
		noseModel[15].setRotationPoint(-44.5F, -21F, 14F);

		noseModel[16].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 468
		noseModel[16].setRotationPoint(-41.5F, -20F, 14F);

		noseModel[17].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 470
		noseModel[17].setRotationPoint(-44.5F, -19F, 13F);

		noseModel[18].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F); // Box 471
		noseModel[18].setRotationPoint(-44.5F, -19F, 14F);

		noseModel[19].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 472
		noseModel[19].setRotationPoint(-42.5F, -19F, 12F);

		noseModel[20].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 473
		noseModel[20].setRotationPoint(-41.5F, -20F, 12F);

		noseModel[21].addShapeBox(0F, 0F, 0F, 7, 4, 4, 0F,0F, 0F, -3.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, -3.5F, 0F, -1.75F, -1.25F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 156
		noseModel[21].setRotationPoint(-76F, -28F, -4F);

		noseModel[22].addShapeBox(0F, 0F, 0F, 7, 4, 4, 0F,0F, -3.5F, -3.5F, 0F, -1.75F, -1.25F, 0F, -0.25F, 0F, 0F, -3F, 0F, 0F, 0F, -3.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		noseModel[22].setRotationPoint(-76F, -32F, -4F);

		noseModel[23].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		noseModel[23].setRotationPoint(-44.5F, -41.5F, -6.25F);

		noseModel[24].addShapeBox(0F, 0F, 0F, 8, 2, 3, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		noseModel[24].setRotationPoint(-37F, -42.5F, -6F);

		noseModel[25].addShapeBox(0F, 0F, 0F, 8, 2, 3, 0F,0F, -3F, -1.5F, 0F, -3F, -1.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1F, -2F, 0F, 1F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		noseModel[25].setRotationPoint(-37F, -42.5F, -9F);

		noseModel[26].addShapeBox(0F, 0F, 0F, 8, 2, 3, 0F,0F, -3F, -1.25F, 0F, -2F, -1.75F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, -1.25F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		noseModel[26].setRotationPoint(-29F, -42.5F, -9F);

		noseModel[27].addShapeBox(0F, 0F, 0F, 8, 2, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		noseModel[27].setRotationPoint(-29F, -42.5F, -6F);

		noseModel[28].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		noseModel[28].setRotationPoint(-69F, -29F, -1F);

		noseModel[29].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		noseModel[29].setRotationPoint(-44.5F, -21F, -13F);

		noseModel[30].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 200
		noseModel[30].setRotationPoint(-44.5F, -19F, -13F);

		noseModel[31].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
		noseModel[31].setRotationPoint(-44.5F, -20F, -12F);

		noseModel[32].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		noseModel[32].setRotationPoint(-42.5F, -21F, -15F);

		noseModel[33].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		noseModel[33].setRotationPoint(-44.5F, -20F, -14F);

		noseModel[34].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		noseModel[34].setRotationPoint(-44.5F, -20F, -15F);

		noseModel[35].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		noseModel[35].setRotationPoint(-44.5F, -21F, -14F);

		noseModel[36].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		noseModel[36].setRotationPoint(-44.5F, -21F, -15F);

		noseModel[37].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		noseModel[37].setRotationPoint(-41.5F, -20F, -15F);

		noseModel[38].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 208
		noseModel[38].setRotationPoint(-44.5F, -19F, -14F);

		noseModel[39].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 209
		noseModel[39].setRotationPoint(-44.5F, -19F, -15F);

		noseModel[40].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 210
		noseModel[40].setRotationPoint(-42.5F, -19F, -15F);

		noseModel[41].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
		noseModel[41].setRotationPoint(-41.5F, -20F, -13F);
	}

	private void inittailModel_1()
	{
		tailModel[0] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 159
		tailModel[1] = new ModelRendererTurbo(this, 841, 9, textureX, textureY); // Box 84
		tailModel[2] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 85
		tailModel[3] = new ModelRendererTurbo(this, 993, 1, textureX, textureY); // Box 86
		tailModel[4] = new ModelRendererTurbo(this, 961, 41, textureX, textureY); // Box 120
		tailModel[5] = new ModelRendererTurbo(this, 753, 41, textureX, textureY); // Box 196
		tailModel[6] = new ModelRendererTurbo(this, 753, 57, textureX, textureY); // Box 197
		tailModel[7] = new ModelRendererTurbo(this, 17, 36, textureX, textureY); // Box 198

		tailModel[0].addShapeBox(0F, 0F, 0F, 22, 4, 4, 0F,0F, 0.25F, 0F, 0F, -4.6F, 0F, 0F, -5F, -3F, 0F, -0.75F, -2.25F, 0F, -0.75F, 0F, 0F, 1F, 0F, 0F, 1F, -3F, 0F, 1.5F, 2.5F); // Box 159
		tailModel[0].setRotationPoint(16F, -47F, 0F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, -0.75F, 0F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, -0.75F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.6F); // Box 84
		tailModel[1].setRotationPoint(12F, -43.5F, 5F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0.75F, 1.5F, 1.2F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0.75F, 1.5F, -1.4F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.6F, 0.25F, 0F, 0.6F); // Box 85
		tailModel[2].setRotationPoint(4F, -43.5F, 5F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.6F, 0F, 0F, 0.6F); // Box 86
		tailModel[3].setRotationPoint(8F, -42.5F, 5F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 22, 4, 4, 0F,0F, -0.75F, -2.25F, 0F, -5F, -3F, 0F, -4.6F, 0F, 0F, 0.25F, 0F, 0F, 1.5F, 2.5F, 0F, 1F, -3F, 0F, 1F, 0F, 0F, -0.75F, 0F); // Box 120
		tailModel[4].setRotationPoint(16F, -47F, -4F);

		tailModel[5].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, -0.75F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.75F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 196
		tailModel[5].setRotationPoint(12F, -43.5F, -6F);

		tailModel[6].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0.75F, 1.5F, -1.4F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0.75F, 1.5F, 1.2F, 0.25F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, -0.25F, 0.25F, 0F, -0.25F); // Box 197
		tailModel[6].setRotationPoint(4F, -43.5F, -6F);

		tailModel[7].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0.5F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 198
		tailModel[7].setRotationPoint(8F, -42.5F, -6F);
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 609, 1, textureX, textureY); // Box 224
		leftWingModel[1] = new ModelRendererTurbo(this, 673, 1, textureX, textureY); // Box 225
		leftWingModel[2] = new ModelRendererTurbo(this, 737, 17, textureX, textureY); // Box 229
		leftWingModel[3] = new ModelRendererTurbo(this, 753, 17, textureX, textureY); // Box 955
		leftWingModel[4] = new ModelRendererTurbo(this, 929, 17, textureX, textureY); // Box 197
		leftWingModel[5] = new ModelRendererTurbo(this, 761, 17, textureX, textureY); // Box 198
		leftWingModel[6] = new ModelRendererTurbo(this, 945, 17, textureX, textureY); // Box 199
		leftWingModel[7] = new ModelRendererTurbo(this, 961, 17, textureX, textureY); // Box 200
		leftWingModel[8] = new ModelRendererTurbo(this, 977, 17, textureX, textureY); // Box 205
		leftWingModel[9] = new ModelRendererTurbo(this, 993, 17, textureX, textureY); // Box 206
		leftWingModel[10] = new ModelRendererTurbo(this, 1009, 17, textureX, textureY); // Box 209
		leftWingModel[11] = new ModelRendererTurbo(this, 100, 128, textureX, textureY); // Box 210
		leftWingModel[12] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 144
		leftWingModel[13] = new ModelRendererTurbo(this, 481, 41, textureX, textureY); // Box 145
		leftWingModel[14] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 146
		leftWingModel[15] = new ModelRendererTurbo(this, 1017, 33, textureX, textureY); // Box 147
		leftWingModel[16] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 148
		leftWingModel[17] = new ModelRendererTurbo(this, 345, 41, textureX, textureY); // Box 149
		leftWingModel[18] = new ModelRendererTurbo(this, 657, 41, textureX, textureY); // Box 150
		leftWingModel[19] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 151
		leftWingModel[20] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 152
		leftWingModel[21] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Box 153
		leftWingModel[22] = new ModelRendererTurbo(this, 329, 57, textureX, textureY); // Box 154
		leftWingModel[23] = new ModelRendererTurbo(this, 345, 57, textureX, textureY); // Box 155

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 224
		leftWingModel[0].setRotationPoint(-61F, -31.5F, 0F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 225
		leftWingModel[1].setRotationPoint(-61F, -31.5F, 1.5F);

		leftWingModel[2].addShapeBox(0F, 0F, -1.5F, 1, 13, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 229
		leftWingModel[2].setRotationPoint(-60.5F, -27.5F, 0F);
		leftWingModel[2].rotateAngleX = 3.14159265F;

		leftWingModel[3].addShapeBox(0F, 0F, -1.5F, 1, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 955
		leftWingModel[3].setRotationPoint(-59.5F, -27.5F, 0F);
		leftWingModel[3].rotateAngleX = 3.14159265F;

		leftWingModel[4].addShapeBox(0F, 0F, -1.5F, 1, 12, 3, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 197
		leftWingModel[4].setRotationPoint(-60.5F, -27.5F, 0F);

		leftWingModel[5].addShapeBox(0F, 0F, -1.5F, 1, 12, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		leftWingModel[5].setRotationPoint(-59.5F, -27.5F, 2F);

		leftWingModel[6].addShapeBox(0F, 0F, -1.5F, 1, 11, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 199
		leftWingModel[6].setRotationPoint(-60.5F, -27.5F, 0F);
		leftWingModel[6].rotateAngleX = -1.57079633F;

		leftWingModel[7].addShapeBox(0F, 0F, -1.5F, 1, 11, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
		leftWingModel[7].setRotationPoint(-59.5F, -27.5F, 0F);
		leftWingModel[7].rotateAngleX = -1.57079633F;

		leftWingModel[8].addShapeBox(0F, 0F, -1.5F, 1, 12, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 205
		leftWingModel[8].setRotationPoint(-60.5F, -27.5F, 0F);
		leftWingModel[8].rotateAngleX = 2.35619449F;

		leftWingModel[9].addShapeBox(0F, 0F, -1.5F, 1, 12, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		leftWingModel[9].setRotationPoint(-59.5F, -27.5F, 0F);
		leftWingModel[9].rotateAngleX = 2.35619449F;

		leftWingModel[10].addShapeBox(0F, 0F, -1.5F, 1, 12, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 209
		leftWingModel[10].setRotationPoint(-60.5F, -27.5F, 0F);
		leftWingModel[10].rotateAngleX = 0.78539816F;

		leftWingModel[11].addShapeBox(0F, 0F, -1.5F, 1, 12, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		leftWingModel[11].setRotationPoint(-59.5F, -27.5F, 0F);
		leftWingModel[11].rotateAngleX = 0.78539816F;

		leftWingModel[12].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		leftWingModel[12].setRotationPoint(-61F, -31.5F, -2F);

		leftWingModel[13].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		leftWingModel[13].setRotationPoint(-61F, -31.5F, -3.5F);

		leftWingModel[14].addShapeBox(0F, 0F, -1.5F, 1, 13, 3, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 146
		leftWingModel[14].setRotationPoint(-60.5F, -27.5F, 0F);
		leftWingModel[14].rotateAngleX = 3.14159265F;

		leftWingModel[15].addShapeBox(0F, 0F, -1.5F, 1, 13, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		leftWingModel[15].setRotationPoint(-59.5F, -27.5F, -2F);
		leftWingModel[15].rotateAngleX = 3.14159265F;

		leftWingModel[16].addShapeBox(0F, 0F, -1.5F, 1, 12, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 148
		leftWingModel[16].setRotationPoint(-60.5F, -27.5F, 0F);

		leftWingModel[17].addShapeBox(0F, 0F, -1.5F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 149
		leftWingModel[17].setRotationPoint(-59.5F, -27.5F, 0F);

		leftWingModel[18].addShapeBox(0F, 0F, -1.5F, 1, 11, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 150
		leftWingModel[18].setRotationPoint(-60.5F, -27.5F, 0F);
		leftWingModel[18].rotateAngleX = 1.57079633F;

		leftWingModel[19].addShapeBox(0F, 0F, -1.5F, 1, 11, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
		leftWingModel[19].setRotationPoint(-59.5F, -27.5F, 0F);
		leftWingModel[19].rotateAngleX = 1.57079633F;

		leftWingModel[20].addShapeBox(0F, 0F, -1.5F, 1, 12, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 152
		leftWingModel[20].setRotationPoint(-60.5F, -27.5F, 0F);
		leftWingModel[20].rotateAngleX = -2.35619449F;

		leftWingModel[21].addShapeBox(0F, 0F, -1.5F, 1, 12, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		leftWingModel[21].setRotationPoint(-59.5F, -27.5F, 0F);
		leftWingModel[21].rotateAngleX = -2.35619449F;

		leftWingModel[22].addShapeBox(0F, 0F, -1.5F, 1, 11, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 154
		leftWingModel[22].setRotationPoint(-60.5F, -27.5F, -1F);
		leftWingModel[22].rotateAngleX = -0.78539816F;

		leftWingModel[23].addShapeBox(0F, 0F, -1.5F, 1, 11, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		leftWingModel[23].setRotationPoint(-59.5F, -27.5F, -1F);
		leftWingModel[23].rotateAngleX = -0.78539816F;
	}

	private void initrightWingModel_1()
	{
		rightWingModel[0] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 13
		rightWingModel[1] = new ModelRendererTurbo(this, 777, 25, textureX, textureY); // Box 14
		rightWingModel[2] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 15
		rightWingModel[3] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 19
		rightWingModel[4] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 20
		rightWingModel[5] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 21
		rightWingModel[6] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 22
		rightWingModel[7] = new ModelRendererTurbo(this, 289, 105, textureX, textureY); // Box 163
		rightWingModel[8] = new ModelRendererTurbo(this, 633, 105, textureX, textureY); // Box 164
		rightWingModel[9] = new ModelRendererTurbo(this, 713, 105, textureX, textureY); // Box 165
		rightWingModel[10] = new ModelRendererTurbo(this, 1017, 49, textureX, textureY); // Box 169
		rightWingModel[11] = new ModelRendererTurbo(this, 393, 57, textureX, textureY); // Box 170
		rightWingModel[12] = new ModelRendererTurbo(this, 401, 57, textureX, textureY); // Box 171
		rightWingModel[13] = new ModelRendererTurbo(this, 833, 57, textureX, textureY); // Box 172

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 15, 3, 70, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, -1.5F, -1.5F, 0F); // Box 13
		rightWingModel[0].setRotationPoint(-30F, -23F, 5F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 3, 3, 70, 0F,0F, -1F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0F, -0.25F, -4.5F, 0F, -1.25F, 0F, 0F, 0F, 0F, 1.5F, -1.5F, 0F, 0F, -2F, -4.5F); // Box 14
		rightWingModel[1].setRotationPoint(-33F, -23F, 5F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 10, 3, 64, 0F,0F, 0F, 0F, 1F, -1.75F, 0F, 0F, -1F, -8.5F, 0F, 0F, 1F, 0F, -0.25F, 0F, 1F, -1.25F, 0F, 0F, -2F, -8.5F, 0F, -1.25F, 1F); // Box 15
		rightWingModel[2].setRotationPoint(-15F, -23F, 10F);

		rightWingModel[3].addShapeBox(0F, 0F, 0F, 1, 27, 1, 0F,0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -20.25F, 6F, 0F, -20.25F, 6F, 0F, 20.5F, -5F, 0F, 21F); // Box 19
		rightWingModel[3].setRotationPoint(-37F, -50F, 25F);

		rightWingModel[4].addShapeBox(0F, 0F, 0F, 1, 27, 1, 0F,0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -20.25F, 6F, 0F, -20.25F, 6F, 0F, 20.5F, -5F, 0F, 21F); // Box 20
		rightWingModel[4].setRotationPoint(-20F, -50F, 25F);

		rightWingModel[5].addShapeBox(0F, 0F, 0F, 1, 28, 1, 0F,6.5F, 0F, -20.25F, -5F, 0F, -20.25F, -5F, 0F, 21F, 6.5F, 0F, 20.5F, 0.75F, 0F, 6.75F, 0F, 0F, 6.75F, 0F, 0F, -6.75F, 0.75F, 0F, -6.75F); // Box 21
		rightWingModel[5].setRotationPoint(-31F, -51F, 55F);

		rightWingModel[6].addShapeBox(0F, 0F, 0F, 1, 28, 1, 0F,6.5F, 0F, -20.25F, -5F, 0F, -20.25F, -5F, 0F, 21F, 6.5F, 0F, 20.5F, 0.75F, 0F, 6.75F, 0F, 0F, 6.75F, 0F, 0F, -6.75F, 0.75F, 0F, -6.75F); // Box 22
		rightWingModel[6].setRotationPoint(-14F, -51F, 55F);

		rightWingModel[7].addShapeBox(0F, 0F, 0F, 15, 3, 70, 0F,-1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F); // Box 163
		rightWingModel[7].setRotationPoint(-30F, -23F, -75F);

		rightWingModel[8].addShapeBox(0F, 0F, 0F, 3, 3, 70, 0F,0F, -0.25F, -4.5F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, -4.5F, 1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F); // Box 164
		rightWingModel[8].setRotationPoint(-33F, -23F, -75F);

		rightWingModel[9].addShapeBox(0F, 0F, 0F, 10, 3, 64, 0F,0F, 0F, 1F, 0F, -1F, -8.5F, 1F, -1.75F, 0F, 0F, 0F, 0F, 0F, -1.25F, 1F, 0F, -2F, -8.5F, 1F, -1.25F, 0F, 0F, -0.25F, 0F); // Box 165
		rightWingModel[9].setRotationPoint(-15F, -23F, -74F);

		rightWingModel[10].addShapeBox(0F, 0F, 0F, 1, 27, 1, 0F,0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 21F, 6F, 0F, 20.5F, 6F, 0F, -20.25F, -5F, 0F, -20.25F); // Box 169
		rightWingModel[10].setRotationPoint(-37F, -50F, -26F);

		rightWingModel[11].addShapeBox(0F, 0F, 0F, 1, 27, 1, 0F,0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 21F, 6F, 0F, 20.5F, 6F, 0F, -20.25F, -5F, 0F, -20.25F); // Box 170
		rightWingModel[11].setRotationPoint(-20F, -50F, -26F);

		rightWingModel[12].addShapeBox(0F, 0F, 0F, 1, 28, 1, 0F,6.5F, 0F, 20.5F, -5F, 0F, 21F, -5F, 0F, -20.25F, 6.5F, 0F, -20.25F, 0.75F, 0F, -6.75F, 0F, 0F, -6.75F, 0F, 0F, 6.75F, 0.75F, 0F, 6.75F); // Box 171
		rightWingModel[12].setRotationPoint(-31F, -51F, -56F);

		rightWingModel[13].addShapeBox(0F, 0F, 0F, 1, 28, 1, 0F,6.5F, 0F, 20.5F, -5F, 0F, 21F, -5F, 0F, -20.25F, 6.5F, 0F, -20.25F, 0.75F, 0F, -6.75F, 0F, 0F, -6.75F, 0F, 0F, 6.75F, 0.75F, 0F, 6.75F); // Box 172
		rightWingModel[13].setRotationPoint(-14F, -51F, -56F);
	}

	private void inittopWingModel_1()
	{
		topWingModel[0] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 16
		topWingModel[1] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 17
		topWingModel[2] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 18
		topWingModel[3] = new ModelRendererTurbo(this, 857, 25, textureX, textureY); // Box 64
		topWingModel[4] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 162
		topWingModel[5] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 165
		topWingModel[6] = new ModelRendererTurbo(this, 913, 25, textureX, textureY); // Box 76
		topWingModel[7] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 77
		topWingModel[8] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 78
		topWingModel[9] = new ModelRendererTurbo(this, 753, 105, textureX, textureY); // Box 166
		topWingModel[10] = new ModelRendererTurbo(this, 121, 145, textureX, textureY); // Box 167
		topWingModel[11] = new ModelRendererTurbo(this, 377, 153, textureX, textureY); // Box 168
		topWingModel[12] = new ModelRendererTurbo(this, 593, 97, textureX, textureY); // Box 174
		topWingModel[13] = new ModelRendererTurbo(this, 881, 57, textureX, textureY); // Box 175
		topWingModel[14] = new ModelRendererTurbo(this, 1009, 57, textureX, textureY); // Box 176
		topWingModel[15] = new ModelRendererTurbo(this, 345, 73, textureX, textureY); // Box 177
		topWingModel[16] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Box 178
		topWingModel[17] = new ModelRendererTurbo(this, 817, 73, textureX, textureY); // Box 179

		topWingModel[0].addShapeBox(0F, 0F, 0F, 3, 3, 111, 0F,0F, -1F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0F, -0.25F, -4.5F, 0F, -1.25F, 0F, 0F, 0F, 0F, 1.5F, -1.5F, 0F, 0F, -2F, -4.5F); // Box 16
		topWingModel[0].setRotationPoint(-40F, -52F, 0F);

		topWingModel[1].addShapeBox(0F, 0F, 0F, 15, 3, 111, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, -1.5F, -1.5F, 0F); // Box 17
		topWingModel[1].setRotationPoint(-37F, -52F, 0F);

		topWingModel[2].addShapeBox(0F, 0F, 0F, 15, 3, 102, 0F,0F, 0F, 0F, 1F, -1.75F, 0F, 0F, -1F, -8.5F, 0F, 0F, 1F, 0F, -0.25F, 0F, 1F, -1.25F, 0F, 0F, -2F, -8.5F, 0F, -1.25F, 1F); // Box 18
		topWingModel[2].setRotationPoint(-22F, -52F, 8F);

		topWingModel[3].addShapeBox(0F, 0F, 0F, 16, 3, 8, 0F,0F, 0F, 0F, -3F, -1.5F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -3F, -1.5F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, 0F); // Box 64
		topWingModel[3].setRotationPoint(-22F, -52F, 0F);

		topWingModel[4].addShapeBox(0F, 0F, 0F, 4, 12, 1, 0F,1F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, -1F, 1F, 0F, -1F, -3F, 0F, -5.5F, 3F, 0F, -5.5F, 3F, 0F, 5F, -3F, 0F, 5F); // Box 162
		topWingModel[4].setRotationPoint(-37F, -49.5F, 3F);

		topWingModel[5].addShapeBox(0F, 0F, 0F, 2, 13, 1, 0F,1F, 0F, -4F, -1F, 0F, -4F, -1F, 0F, 4.5F, 1F, 0F, 4.5F, -5F, 0F, 9.5F, 5F, 0F, 9.5F, 5F, 0.75F, -9.75F, -5F, 0.75F, -9.75F); // Box 165
		topWingModel[5].setRotationPoint(-36F, -49.5F, 19F);

		topWingModel[6].addShapeBox(0F, 0F, 0F, 4, 12, 1, 0F,-3F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, -1F, -3F, 0F, -1F, 13F, 0F, -5.5F, -14F, 0F, -5.5F, -14F, 0F, 5F, 13F, 0F, 5F); // Box 76
		topWingModel[6].setRotationPoint(-21F, -49.5F, 3F);

		topWingModel[7].addShapeBox(0F, 0F, 0F, 2, 13, 1, 0F,-1F, 0F, -4F, 1F, 0F, -4F, 1F, 0F, 4.5F, -1F, 0F, 4.5F, 5F, 0F, 9.5F, -5F, 0F, 9.5F, -5F, 0.75F, -9.75F, 5F, 0.75F, -9.75F); // Box 77
		topWingModel[7].setRotationPoint(-24F, -49.5F, 19F);

		topWingModel[8].addShapeBox(0F, 0F, 0F, 4, 13, 1, 0F,1F, 0F, -4F, -1F, 0F, -4F, -1F, 0F, 4.5F, 1F, 0F, 4.5F, -5F, 0F, 9.5F, 5F, 0F, 9.5F, 5F, 0.75F, -9.75F, -5F, 0.75F, -9.75F); // Box 78
		topWingModel[8].setRotationPoint(-18F, -49.5F, 19F);

		topWingModel[9].addShapeBox(0F, 0F, 0F, 3, 3, 111, 0F,0F, -0.25F, -4.5F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, -4.5F, 1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F); // Box 166
		topWingModel[9].setRotationPoint(-40F, -52F, -111F);

		topWingModel[10].addShapeBox(0F, 0F, 0F, 15, 3, 111, 0F,-1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F); // Box 167
		topWingModel[10].setRotationPoint(-37F, -52F, -111F);

		topWingModel[11].addShapeBox(0F, 0F, 0F, 15, 3, 102, 0F,0F, 0F, 1F, 0F, -1F, -8.5F, 1F, -1.75F, 0F, 0F, 0F, 0F, 0F, -1.25F, 1F, 0F, -2F, -8.5F, 1F, -1.25F, 0F, 0F, -0.25F, 0F); // Box 168
		topWingModel[11].setRotationPoint(-22F, -52F, -110F);

		topWingModel[12].addShapeBox(0F, 0F, 0F, 16, 3, 8, 0F,0F, 0F, 0F, 0F, -1.75F, 0F, -3F, -1.5F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, -3F, -1.5F, 0F, 0F, -0.25F, 0F); // Box 174
		topWingModel[12].setRotationPoint(-22F, -52F, -8F);

		topWingModel[13].addShapeBox(0F, 0F, 0F, 4, 12, 1, 0F,1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0.5F, 1F, 0F, 0.5F, -3F, 0F, 5F, 3F, 0F, 5F, 3F, 0F, -5.5F, -3F, 0F, -5.5F); // Box 175
		topWingModel[13].setRotationPoint(-37F, -49.5F, -4F);

		topWingModel[14].addShapeBox(0F, 0F, 0F, 2, 13, 1, 0F,1F, 0F, 4.5F, -1F, 0F, 4.5F, -1F, 0F, -4F, 1F, 0F, -4F, -5F, 0.75F, -9.75F, 5F, 0.75F, -9.75F, 5F, 0F, 9.5F, -5F, 0F, 9.5F); // Box 176
		topWingModel[14].setRotationPoint(-36F, -49.5F, -20F);

		topWingModel[15].addShapeBox(0F, 0F, 0F, 4, 12, 1, 0F,-3F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0.5F, -3F, 0F, 0.5F, 13F, 0F, 5F, -14F, 0F, 5F, -14F, 0F, -5.5F, 13F, 0F, -5.5F); // Box 177
		topWingModel[15].setRotationPoint(-21F, -49.5F, -4F);

		topWingModel[16].addShapeBox(0F, 0F, 0F, 2, 13, 1, 0F,-1F, 0F, 4.5F, 1F, 0F, 4.5F, 1F, 0F, -4F, -1F, 0F, -4F, 5F, 0.75F, -9.75F, -5F, 0.75F, -9.75F, -5F, 0F, 9.5F, 5F, 0F, 9.5F); // Box 178
		topWingModel[16].setRotationPoint(-24F, -49.5F, -20F);

		topWingModel[17].addShapeBox(0F, 0F, 0F, 4, 13, 1, 0F,1F, 0F, 4.5F, -1F, 0F, 4.5F, -1F, 0F, -4F, 1F, 0F, -4F, -5F, 0.75F, -9.75F, 5F, 0.75F, -9.75F, 5F, 0F, 9.5F, -5F, 0F, 9.5F); // Box 179
		topWingModel[17].setRotationPoint(-18F, -49.5F, -20F);
	}

	private void inittailWheelModel_1()
	{
		tailWheelModel[0] = new ModelRendererTurbo(this, 65, 89, textureX, textureY); // Box 748
		tailWheelModel[1] = new ModelRendererTurbo(this, 1009, 89, textureX, textureY); // Box 258

		tailWheelModel[0].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, -0.25F, -0.25F, 1.25F, -0.25F, -0.25F, 1.25F, 0F, 0F, 0F, 0F, -2F, -0.25F, -0.25F, -1.5F, -0.75F, -0.25F, -1.5F, -0.75F, 0F, -2F, -0.25F, 0F); // Box 748
		tailWheelModel[0].setRotationPoint(99F, -23F, -1F);

		tailWheelModel[1].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, -0.25F, 1.25F, 0F, -0.25F, 1.25F, -0.25F, 0F, 0F, -0.25F, -2F, -0.25F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, -0.25F, -2F, -0.25F, -0.25F); // Box 258
		tailWheelModel[1].setRotationPoint(99F, -23F, 0F);
	}

	private void initleftWingWheelModel_1()
	{
		leftWingWheelModel[0] = new ModelRendererTurbo(this, 1, 421, textureX, textureY); // Import LWW01
		leftWingWheelModel[1] = new ModelRendererTurbo(this, 65, 421, textureX, textureY); // Import LWW02
		leftWingWheelModel[2] = new ModelRendererTurbo(this, 129, 421, textureX, textureY); // Import LWW03
		leftWingWheelModel[3] = new ModelRendererTurbo(this, 233, 421, textureX, textureY); // Import LWW04
		leftWingWheelModel[4] = new ModelRendererTurbo(this, 329, 421, textureX, textureY); // Import LWW05
		leftWingWheelModel[5] = new ModelRendererTurbo(this, 129, 421, textureX, textureY); // Import LWW06
		leftWingWheelModel[6] = new ModelRendererTurbo(this, 217, 421, textureX, textureY); // Import LWW07
		leftWingWheelModel[7] = new ModelRendererTurbo(this, 401, 421, textureX, textureY); // Import LWW08
		leftWingWheelModel[8] = new ModelRendererTurbo(this, 1, 445, textureX, textureY); // Import LWW09
		leftWingWheelModel[9] = new ModelRendererTurbo(this, 313, 445, textureX, textureY); // Import LWW10
		leftWingWheelModel[10] = new ModelRendererTurbo(this, 417, 445, textureX, textureY); // Import LWW11
		leftWingWheelModel[11] = new ModelRendererTurbo(this, 49, 445, textureX, textureY); // Import LWW12
		leftWingWheelModel[12] = new ModelRendererTurbo(this, 457, 421, textureX, textureY); // Import LWW13
		leftWingWheelModel[13] = new ModelRendererTurbo(this, 313, 421, textureX, textureY); // Import LWW14
		leftWingWheelModel[14] = new ModelRendererTurbo(this, 497, 421, textureX, textureY); // Import LWW19
		leftWingWheelModel[15] = new ModelRendererTurbo(this, 121, 453, textureX, textureY); // Import LWW20
		leftWingWheelModel[16] = new ModelRendererTurbo(this, 1, 421, textureX, textureY); // Box 312
		leftWingWheelModel[17] = new ModelRendererTurbo(this, 65, 421, textureX, textureY); // Box 313
		leftWingWheelModel[18] = new ModelRendererTurbo(this, 129, 421, textureX, textureY); // Box 314
		leftWingWheelModel[19] = new ModelRendererTurbo(this, 233, 421, textureX, textureY); // Box 315
		leftWingWheelModel[20] = new ModelRendererTurbo(this, 329, 421, textureX, textureY); // Box 316
		leftWingWheelModel[21] = new ModelRendererTurbo(this, 129, 421, textureX, textureY); // Box 317
		leftWingWheelModel[22] = new ModelRendererTurbo(this, 217, 421, textureX, textureY); // Box 318
		leftWingWheelModel[23] = new ModelRendererTurbo(this, 401, 421, textureX, textureY); // Box 319
		leftWingWheelModel[24] = new ModelRendererTurbo(this, 1, 445, textureX, textureY); // Box 320
		leftWingWheelModel[25] = new ModelRendererTurbo(this, 313, 445, textureX, textureY); // Box 321
		leftWingWheelModel[26] = new ModelRendererTurbo(this, 417, 445, textureX, textureY); // Box 322
		leftWingWheelModel[27] = new ModelRendererTurbo(this, 49, 445, textureX, textureY); // Box 323
		leftWingWheelModel[28] = new ModelRendererTurbo(this, 457, 421, textureX, textureY); // Box 324
		leftWingWheelModel[29] = new ModelRendererTurbo(this, 313, 421, textureX, textureY); // Box 325
		leftWingWheelModel[30] = new ModelRendererTurbo(this, 497, 421, textureX, textureY); // Box 326
		leftWingWheelModel[31] = new ModelRendererTurbo(this, 121, 453, textureX, textureY); // Box 327

		leftWingWheelModel[0].addShapeBox(0F, 0F, 0F, 18, 8, 13, 0F,0F, -4F, -6F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -4F, -6F, 0F, 0F, -4F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, -4F); // Import LWW01
		leftWingWheelModel[0].setRotationPoint(-74F, 0F, -31F);

		leftWingWheelModel[1].addShapeBox(4F, 0F, 0F, 15, 8, 13, 0F,0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 3F, 0F, 0F, 4F, 2F, 0F, 4F, 2F, 0F, 3F, 0F); // Import LWW02
		leftWingWheelModel[1].setRotationPoint(-60F, 0F, -31F);

		leftWingWheelModel[2].addShapeBox(0F, 0F, 0F, 35, 12, 15, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 1F); // Import LWW03
		leftWingWheelModel[2].setRotationPoint(-41F, 0F, -32F);

		leftWingWheelModel[3].addShapeBox(0F, 0F, 0F, 30, 11, 15, 0F,0F, 0F, -2F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, 4F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 4F, 0F); // Import LWW04
		leftWingWheelModel[3].setRotationPoint(-6F, 0F, -32F);

		leftWingWheelModel[4].addShapeBox(0F, 0F, 0F, 24, 10, 9, 0F,0F, 0F, -2F, 0F, -2F, -5F, 0F, -2F, -4F, 0F, 0F, -2F, 0F, 1F, 0F, 0F, 0F, -5F, 0F, 0F, -4F, 0F, 1F, 0F); // Import LWW05
		leftWingWheelModel[4].setRotationPoint(24F, 0F, -29F);

		leftWingWheelModel[5].addShapeBox(0F, 0F, 0F, 6, 13, 1, 0F,0F, -3F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -3F, -0.25F, 0F, -3F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -3F, -0.25F); // Import LWW06
		leftWingWheelModel[5].setRotationPoint(48F, 0F, -24.5F);

		leftWingWheelModel[6].addShapeBox(0F, 0F, 0F, 4, 13, 1, 0F,0F, 0F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, 0F, 0F, -0.25F); // Import LWW07
		leftWingWheelModel[6].setRotationPoint(54F, 0F, -24.5F);

		leftWingWheelModel[7].addShapeBox(0F, 0F, 0F, 18, 8, 13, 0F,0F, 0F, -4F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -4F, -3F, -6F, -8.5F, 0F, 0F, -7F, 0F, 0F, -7F, -3F, -6F, -8.5F); // Import LWW08
		leftWingWheelModel[7].setRotationPoint(-74F, 8F, -31F);

		leftWingWheelModel[8].addShapeBox(0F, 0F, 0F, 15, 6, 13, 0F,0F, 0F, 0F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, 0F, 0F, -1F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -1F, -7F); // Import LWW09
		leftWingWheelModel[8].setRotationPoint(-56F, 11F, -31F);

		leftWingWheelModel[9].addShapeBox(0F, 0F, 0F, 35, 8, 15, 0F,0F, 0F, 1F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 1F, 0F, -3F, -8F, 0F, -2F, -8F, 0F, -2F, -8F, 0F, -3F, -8F); // Import LWW10
		leftWingWheelModel[9].setRotationPoint(-41F, 12F, -32F);

		leftWingWheelModel[10].addShapeBox(0F, 0F, 0F, 30, 8, 15, 0F,0F, -3F, 0F, 0F, 1F, -3F, 0F, 1F, -3F, 0F, -3F, 0F, 0F, -3F, -9F, 0F, -6F, -9F, 0F, -6F, -9F, 0F, -3F, -9F); // Import LWW11
		leftWingWheelModel[10].setRotationPoint(-6F, 12F, -32F);

		leftWingWheelModel[11].addShapeBox(0F, 0F, 0F, 24, 3, 9, 0F,0F, 0F, 0F, 0F, 1F, -5F, 0F, 1F, -4F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -4F, -5F, 0F, -4F, -4F, 0F, 0F, -6F); // Import LWW12
		leftWingWheelModel[11].setRotationPoint(24F, 11F, -29F);

		leftWingWheelModel[12].addTrapezoid(0F, 0F, 0F, 6, 1, 8, 0F, -0.50F, ModelRendererTurbo.MR_TOP); // Import LWW13
		leftWingWheelModel[12].setRotationPoint(-33F, -0.5F, -28F);

		leftWingWheelModel[13].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,-0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Import LWW14
		leftWingWheelModel[13].setRotationPoint(-4F, -1F, -27.5F);

		leftWingWheelModel[14].addShapeBox(0F, 0F, 0F, 4, 22, 2, 0F,0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 15F, 0F, 0F, 15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LWW19
		leftWingWheelModel[14].setRotationPoint(-32F, -22F, -25F);

		leftWingWheelModel[15].addShapeBox(0F, 0F, 0F, 4, 22, 2, 0F,0F, 1F, -19F, 0F, 1F, -19F, 0F, 0F, 19F, 0F, 0F, 19F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LWW20
		leftWingWheelModel[15].setRotationPoint(-3F, -22F, -25F);

		leftWingWheelModel[16].addShapeBox(0F, 0F, 0F, 18, 8, 13, 0F,0F, -4F, -6F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -4F, -6F, 0F, 0F, -4F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, -4F); // Box 312
		leftWingWheelModel[16].setRotationPoint(-74F, 0F, 18F);

		leftWingWheelModel[17].addShapeBox(4F, 0F, 0F, 15, 8, 13, 0F,0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 3F, 0F, 0F, 4F, 2F, 0F, 4F, 2F, 0F, 3F, 0F); // Box 313
		leftWingWheelModel[17].setRotationPoint(-60F, 0F, 18F);

		leftWingWheelModel[18].addShapeBox(0F, 0F, 0F, 35, 12, 15, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 1F); // Box 314
		leftWingWheelModel[18].setRotationPoint(-41F, 0F, 17F);

		leftWingWheelModel[19].addShapeBox(0F, 0F, 0F, 30, 11, 15, 0F,0F, 0F, -2F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, 4F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 4F, 0F); // Box 315
		leftWingWheelModel[19].setRotationPoint(-6F, 0F, 17F);

		leftWingWheelModel[20].addShapeBox(0F, 0F, 0F, 24, 10, 9, 0F,0F, 0F, -2F, 0F, -2F, -4F, 0F, -2F, -5F, 0F, 0F, -2F, 0F, 1F, 0F, 0F, 0F, -4F, 0F, 0F, -5F, 0F, 1F, 0F); // Box 316
		leftWingWheelModel[20].setRotationPoint(24F, 0F, 20F);

		leftWingWheelModel[21].addShapeBox(0F, 0F, 0F, 6, 13, 1, 0F,0F, -3F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -3F, -0.25F, 0F, -3F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -3F, -0.25F); // Box 317
		leftWingWheelModel[21].setRotationPoint(48F, 0F, 23.5F);

		leftWingWheelModel[22].addShapeBox(0F, 0F, 0F, 4, 13, 1, 0F,0F, 0F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, 0F, 0F, -0.25F); // Box 318
		leftWingWheelModel[22].setRotationPoint(54F, 0F, 23.5F);

		leftWingWheelModel[23].addShapeBox(0F, 0F, 0F, 18, 8, 13, 0F,0F, 0F, -4F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -4F, -3F, -6F, -8.5F, 0F, 0F, -7F, 0F, 0F, -7F, -3F, -6F, -8.5F); // Box 319
		leftWingWheelModel[23].setRotationPoint(-74F, 8F, 18F);

		leftWingWheelModel[24].addShapeBox(0F, 0F, 0F, 15, 6, 13, 0F,0F, 0F, 0F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, 0F, 0F, -1F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -1F, -7F); // Box 320
		leftWingWheelModel[24].setRotationPoint(-56F, 11F, 18F);

		leftWingWheelModel[25].addShapeBox(0F, 0F, 0F, 35, 8, 15, 0F,0F, 0F, 1F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 1F, 0F, -3F, -8F, 0F, -2F, -8F, 0F, -2F, -8F, 0F, -3F, -8F); // Box 321
		leftWingWheelModel[25].setRotationPoint(-41F, 12F, 17F);

		leftWingWheelModel[26].addShapeBox(0F, 0F, 0F, 30, 8, 15, 0F,0F, -3F, 0F, 0F, 1F, -3F, 0F, 1F, -3F, 0F, -3F, 0F, 0F, -3F, -9F, 0F, -6F, -9F, 0F, -6F, -9F, 0F, -3F, -9F); // Box 322
		leftWingWheelModel[26].setRotationPoint(-6F, 12F, 17F);

		leftWingWheelModel[27].addShapeBox(0F, 0F, 0F, 24, 3, 9, 0F,0F, 0F, 0F, 0F, 1F, -4F, 0F, 1F, -5F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -4F, -4F, 0F, -4F, -5F, 0F, 0F, -6F); // Box 323
		leftWingWheelModel[27].setRotationPoint(24F, 11F, 20F);

		leftWingWheelModel[28].addTrapezoid(0F, 0F, 0F, 6, 1, 8, 0F, -0.50F, ModelRendererTurbo.MR_TOP); // Box 324
		leftWingWheelModel[28].setRotationPoint(-33F, -0.5F, 20F);

		leftWingWheelModel[29].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,-0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 325
		leftWingWheelModel[29].setRotationPoint(-4F, -1F, 21.5F);

		leftWingWheelModel[30].addShapeBox(0F, 0F, 0F, 4, 22, 2, 0F,0F, 0F, 15F, 0F, 0F, 15F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 326
		leftWingWheelModel[30].setRotationPoint(-32F, -22F, 23F);

		leftWingWheelModel[31].addShapeBox(0F, 0F, 0F, 4, 22, 2, 0F,0F, 0F, 19F, 0F, 0F, 19F, 0F, 1F, -19F, 0F, 1F, -19F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 327
		leftWingWheelModel[31].setRotationPoint(-3F, -22F, 23F);
	}

	private void initPropeller()
	{
		propellerModels = new ModelRendererTurbo[1][3];
		propellerModels[0] = makeProp1(-68F, -29F, 0F);
	}

	private ModelRendererTurbo[] makeProp1(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[3];
		prop[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		prop[0].addBox(-1F, -32F, -2.5F, 2, 32, 5, 0.0F);
		prop[1].addBox(-1F, -32F, -2.5F, 2, 32, 5, 0.0F);
		prop[2].addBox(-1F, -32F, -2.5F, 2, 32, 5, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		return prop;
	}
}