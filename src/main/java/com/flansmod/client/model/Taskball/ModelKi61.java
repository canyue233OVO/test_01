//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Ki61
// Model Creator: 
// Created on: 13.05.2023 - 03:11:31
// Last changed on: 13.05.2023 - 03:11:31

package com.flansmod.client.model.Taskball; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelKi61 extends ModelPlane //Same as Filename
{
	int textureX = 1024;
	int textureY = 512;

	public ModelKi61() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[151];
		noseModel = new ModelRendererTurbo[70];
		tailModel = new ModelRendererTurbo[43];
		leftWingModel = new ModelRendererTurbo[11];
		rightWingModel = new ModelRendererTurbo[11];
		yawFlapModel = new ModelRendererTurbo[18];
		pitchFlapLeftModel = new ModelRendererTurbo[3];
		pitchFlapRightModel = new ModelRendererTurbo[3];
		pitchFlapLeftWingModel = new ModelRendererTurbo[1];
		pitchFlapRightWingModel = new ModelRendererTurbo[1];
		tailWheelModel = new ModelRendererTurbo[7];
		leftWingWheelModel = new ModelRendererTurbo[10];
		rightWingWheelModel = new ModelRendererTurbo[10];

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
		inittailWheelModel_1();
		initleftWingWheelModel_1();
		initrightWingWheelModel_1();

		initPropeller();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 4
		bodyModel[4] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 5
		bodyModel[5] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 6
		bodyModel[6] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 7
		bodyModel[7] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 8
		bodyModel[8] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 10
		bodyModel[9] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 12
		bodyModel[10] = new ModelRendererTurbo(this, 609, 1, textureX, textureY); // Box 14
		bodyModel[11] = new ModelRendererTurbo(this, 681, 1, textureX, textureY); // Box 15
		bodyModel[12] = new ModelRendererTurbo(this, 753, 1, textureX, textureY); // Box 16
		bodyModel[13] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 22
		bodyModel[14] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 23
		bodyModel[15] = new ModelRendererTurbo(this, 753, 17, textureX, textureY); // Box 29
		bodyModel[16] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Box 32
		bodyModel[17] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 33
		bodyModel[18] = new ModelRendererTurbo(this, 729, 25, textureX, textureY); // Box 36
		bodyModel[19] = new ModelRendererTurbo(this, 793, 25, textureX, textureY); // Box 37
		bodyModel[20] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 38
		bodyModel[21] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 39
		bodyModel[22] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 87
		bodyModel[23] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 88
		bodyModel[24] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Box 89
		bodyModel[25] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Box 90
		bodyModel[26] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 95
		bodyModel[27] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 96
		bodyModel[28] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 97
		bodyModel[29] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 98
		bodyModel[30] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 99
		bodyModel[31] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 100
		bodyModel[32] = new ModelRendererTurbo(this, 545, 1, textureX, textureY); // Box 101
		bodyModel[33] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 102
		bodyModel[34] = new ModelRendererTurbo(this, 561, 1, textureX, textureY); // Box 103
		bodyModel[35] = new ModelRendererTurbo(this, 665, 1, textureX, textureY); // Box 104
		bodyModel[36] = new ModelRendererTurbo(this, 561, 25, textureX, textureY); // Box 105
		bodyModel[37] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 106
		bodyModel[38] = new ModelRendererTurbo(this, 785, 25, textureX, textureY); // Box 107
		bodyModel[39] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 108
		bodyModel[40] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 109
		bodyModel[41] = new ModelRendererTurbo(this, 681, 1, textureX, textureY); // Box 110
		bodyModel[42] = new ModelRendererTurbo(this, 737, 1, textureX, textureY); // Box 111
		bodyModel[43] = new ModelRendererTurbo(this, 913, 49, textureX, textureY); // Box 112
		bodyModel[44] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Box 113
		bodyModel[45] = new ModelRendererTurbo(this, 225, 65, textureX, textureY); // Box 124
		bodyModel[46] = new ModelRendererTurbo(this, 281, 65, textureX, textureY); // Box 125
		bodyModel[47] = new ModelRendererTurbo(this, 905, 57, textureX, textureY); // Box 126
		bodyModel[48] = new ModelRendererTurbo(this, 985, 57, textureX, textureY); // Box 127
		bodyModel[49] = new ModelRendererTurbo(this, 329, 65, textureX, textureY); // Box 128
		bodyModel[50] = new ModelRendererTurbo(this, 457, 65, textureX, textureY); // Box 129
		bodyModel[51] = new ModelRendererTurbo(this, 385, 65, textureX, textureY); // Box 130
		bodyModel[52] = new ModelRendererTurbo(this, 513, 65, textureX, textureY); // Box 131
		bodyModel[53] = new ModelRendererTurbo(this, 617, 65, textureX, textureY); // Box 133
		bodyModel[54] = new ModelRendererTurbo(this, 753, 65, textureX, textureY); // Box 135
		bodyModel[55] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Box 137
		bodyModel[56] = new ModelRendererTurbo(this, 225, 81, textureX, textureY); // Box 138
		bodyModel[57] = new ModelRendererTurbo(this, 817, 65, textureX, textureY); // Box 139
		bodyModel[58] = new ModelRendererTurbo(this, 281, 89, textureX, textureY); // Box 144
		bodyModel[59] = new ModelRendererTurbo(this, 753, 89, textureX, textureY); // Box 145
		bodyModel[60] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Box 151
		bodyModel[61] = new ModelRendererTurbo(this, 73, 105, textureX, textureY); // Box 154
		bodyModel[62] = new ModelRendererTurbo(this, 225, 97, textureX, textureY); // Box 155
		bodyModel[63] = new ModelRendererTurbo(this, 961, 97, textureX, textureY); // Box 158
		bodyModel[64] = new ModelRendererTurbo(this, 753, 105, textureX, textureY); // Box 159
		bodyModel[65] = new ModelRendererTurbo(this, 145, 97, textureX, textureY); // Box 160
		bodyModel[66] = new ModelRendererTurbo(this, 681, 89, textureX, textureY); // Box 161
		bodyModel[67] = new ModelRendererTurbo(this, 409, 81, textureX, textureY); // Box 211
		bodyModel[68] = new ModelRendererTurbo(this, 793, 121, textureX, textureY); // Box 212
		bodyModel[69] = new ModelRendererTurbo(this, 489, 121, textureX, textureY); // Box 213
		bodyModel[70] = new ModelRendererTurbo(this, 881, 121, textureX, textureY); // Box 214
		bodyModel[71] = new ModelRendererTurbo(this, 585, 129, textureX, textureY); // Box 219
		bodyModel[72] = new ModelRendererTurbo(this, 665, 41, textureX, textureY); // Box 220
		bodyModel[73] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 221
		bodyModel[74] = new ModelRendererTurbo(this, 753, 1, textureX, textureY); // Box 222
		bodyModel[75] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 223
		bodyModel[76] = new ModelRendererTurbo(this, 721, 41, textureX, textureY); // Box 224
		bodyModel[77] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 225
		bodyModel[78] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 226
		bodyModel[79] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 227
		bodyModel[80] = new ModelRendererTurbo(this, 785, 17, textureX, textureY); // Box 228
		bodyModel[81] = new ModelRendererTurbo(this, 369, 65, textureX, textureY); // Box 229
		bodyModel[82] = new ModelRendererTurbo(this, 953, 33, textureX, textureY); // Box 230
		bodyModel[83] = new ModelRendererTurbo(this, 313, 49, textureX, textureY); // Box 231
		bodyModel[84] = new ModelRendererTurbo(this, 705, 65, textureX, textureY); // Box 232
		bodyModel[85] = new ModelRendererTurbo(this, 681, 17, textureX, textureY); // Box 233
		bodyModel[86] = new ModelRendererTurbo(this, 1017, 17, textureX, textureY); // Box 234
		bodyModel[87] = new ModelRendererTurbo(this, 729, 25, textureX, textureY); // Box 235
		bodyModel[88] = new ModelRendererTurbo(this, 321, 89, textureX, textureY); // Box 236
		bodyModel[89] = new ModelRendererTurbo(this, 457, 137, textureX, textureY); // Box 237
		bodyModel[90] = new ModelRendererTurbo(this, 721, 105, textureX, textureY); // Box 695
		bodyModel[91] = new ModelRendererTurbo(this, 593, 41, textureX, textureY); // Box 465
		bodyModel[92] = new ModelRendererTurbo(this, 849, 41, textureX, textureY); // Box 466
		bodyModel[93] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 467
		bodyModel[94] = new ModelRendererTurbo(this, 1017, 33, textureX, textureY); // Box 468
		bodyModel[95] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 469
		bodyModel[96] = new ModelRendererTurbo(this, 1009, 57, textureX, textureY); // Box 470
		bodyModel[97] = new ModelRendererTurbo(this, 273, 65, textureX, textureY); // Box 471
		bodyModel[98] = new ModelRendererTurbo(this, 329, 65, textureX, textureY); // Box 472
		bodyModel[99] = new ModelRendererTurbo(this, 361, 145, textureX, textureY); // Box 239
		bodyModel[100] = new ModelRendererTurbo(this, 665, 129, textureX, textureY); // Box 240
		bodyModel[101] = new ModelRendererTurbo(this, 857, 105, textureX, textureY); // Box 241
		bodyModel[102] = new ModelRendererTurbo(this, 945, 121, textureX, textureY); // Box 242
		bodyModel[103] = new ModelRendererTurbo(this, 169, 137, textureX, textureY); // Box 243
		bodyModel[104] = new ModelRendererTurbo(this, 641, 153, textureX, textureY); // Box 244
		bodyModel[105] = new ModelRendererTurbo(this, 409, 137, textureX, textureY); // Box 245
		bodyModel[106] = new ModelRendererTurbo(this, 665, 153, textureX, textureY); // Box 246
		bodyModel[107] = new ModelRendererTurbo(this, 425, 113, textureX, textureY); // Box 247
		bodyModel[108] = new ModelRendererTurbo(this, 849, 121, textureX, textureY); // Box 248
		bodyModel[109] = new ModelRendererTurbo(this, 713, 153, textureX, textureY); // Box 250
		bodyModel[110] = new ModelRendererTurbo(this, 721, 153, textureX, textureY); // Box 251
		bodyModel[111] = new ModelRendererTurbo(this, 145, 129, textureX, textureY); // Box 252
		bodyModel[112] = new ModelRendererTurbo(this, 57, 137, textureX, textureY); // Box 253
		bodyModel[113] = new ModelRendererTurbo(this, 865, 17, textureX, textureY); // Box 962
		bodyModel[114] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Box 964
		bodyModel[115] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Box 966
		bodyModel[116] = new ModelRendererTurbo(this, 457, 65, textureX, textureY); // Box 259
		bodyModel[117] = new ModelRendererTurbo(this, 497, 65, textureX, textureY); // Box 260
		bodyModel[118] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 256
		bodyModel[119] = new ModelRendererTurbo(this, 585, 145, textureX, textureY); // Box 249
		bodyModel[120] = new ModelRendererTurbo(this, 921, 145, textureX, textureY); // Box 254
		bodyModel[121] = new ModelRendererTurbo(this, 513, 65, textureX, textureY); // Box 263
		bodyModel[122] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 264
		bodyModel[123] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 265
		bodyModel[124] = new ModelRendererTurbo(this, 513, 41, textureX, textureY); // Box 266
		bodyModel[125] = new ModelRendererTurbo(this, 249, 145, textureX, textureY); // Box 814
		bodyModel[126] = new ModelRendererTurbo(this, 729, 153, textureX, textureY); // Box 314
		bodyModel[127] = new ModelRendererTurbo(this, 777, 153, textureX, textureY); // Box 315
		bodyModel[128] = new ModelRendererTurbo(this, 881, 153, textureX, textureY); // Box 316
		bodyModel[129] = new ModelRendererTurbo(this, 225, 161, textureX, textureY); // Box 317
		bodyModel[130] = new ModelRendererTurbo(this, 1, 281, textureX, textureY); // Box 675
		bodyModel[131] = new ModelRendererTurbo(this, 9, 281, textureX, textureY); // Box 676
		bodyModel[132] = new ModelRendererTurbo(this, 17, 281, textureX, textureY); // Box 677
		bodyModel[133] = new ModelRendererTurbo(this, 25, 281, textureX, textureY); // Box 400
		bodyModel[134] = new ModelRendererTurbo(this, 33, 281, textureX, textureY); // Box 401
		bodyModel[135] = new ModelRendererTurbo(this, 41, 281, textureX, textureY); // Box 402
		bodyModel[136] = new ModelRendererTurbo(this, 49, 281, textureX, textureY); // Box 415
		bodyModel[137] = new ModelRendererTurbo(this, 65, 281, textureX, textureY); // Box 416
		bodyModel[138] = new ModelRendererTurbo(this, 81, 281, textureX, textureY); // Box 417
		bodyModel[139] = new ModelRendererTurbo(this, 97, 281, textureX, textureY); // Box 227
		bodyModel[140] = new ModelRendererTurbo(this, 105, 281, textureX, textureY); // Box 228
		bodyModel[141] = new ModelRendererTurbo(this, 113, 281, textureX, textureY); // Box 229
		bodyModel[142] = new ModelRendererTurbo(this, 121, 281, textureX, textureY); // Box 230
		bodyModel[143] = new ModelRendererTurbo(this, 129, 281, textureX, textureY); // Box 231
		bodyModel[144] = new ModelRendererTurbo(this, 137, 281, textureX, textureY); // Box 232
		bodyModel[145] = new ModelRendererTurbo(this, 41, 281, textureX, textureY); // Box 372
		bodyModel[146] = new ModelRendererTurbo(this, 33, 281, textureX, textureY); // Box 373
		bodyModel[147] = new ModelRendererTurbo(this, 25, 281, textureX, textureY); // Box 374
		bodyModel[148] = new ModelRendererTurbo(this, 41, 281, textureX, textureY); // Box 375
		bodyModel[149] = new ModelRendererTurbo(this, 33, 281, textureX, textureY); // Box 376
		bodyModel[150] = new ModelRendererTurbo(this, 25, 281, textureX, textureY); // Box 377

		bodyModel[0].addShapeBox(0F, 0F, 0F, 22, 5, 3, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 1
		bodyModel[0].setRotationPoint(-19F, -41F, -10F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 22, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[1].setRotationPoint(-19F, -36F, -10F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 7, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[2].setRotationPoint(-26F, -36F, -10F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 7, 5, 3, 0F,0F, 0F, -2F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 4
		bodyModel[3].setRotationPoint(-26F, -41F, -10F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 14, 11, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[4].setRotationPoint(-40F, -36F, -10F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 14, 5, 10, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[5].setRotationPoint(-40F, -41F, -10F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 14, 4, 8, 0F,0F, -0.5F, -3F, 0F, 0F, -3F, 0F, 1.25F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[6].setRotationPoint(-40F, -45F, -8F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 14, 5, 10, 0F,0F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[7].setRotationPoint(-54F, -41F, -10F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 14, 4, 8, 0F,0F, -1.5F, -3F, 0F, -0.5F, -3F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 10
		bodyModel[8].setRotationPoint(-54F, -45F, -8F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 14, 11, 10, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 12
		bodyModel[9].setRotationPoint(-54F, -36F, -10F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 22, 11, 10, 0F,0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[10].setRotationPoint(3F, -36F, -10F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 22, 5, 10, 0F,0F, 0F, -1.5F, 0F, -2.5F, -2.5F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[11].setRotationPoint(3F, -41F, -10F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 11, 5, 8, 0F,5F, 0F, -2.5F, 0F, -3.5F, -2.5F, 0F, -3.5F, 0F, 5F, 0F, 0F, 11F, -2F, 0F, 0F, 2.5F, -0.5F, 0F, 2.5F, 0F, 11F, -2F, 0F); // Box 16
		bodyModel[12].setRotationPoint(14F, -46F, -8F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 14, 5, 10, 0F,0F, 2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, -2F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 22
		bodyModel[13].setRotationPoint(-54F, -25F, -10F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 14, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[14].setRotationPoint(-40F, -25F, -10F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 11, 2, 5, 0F,1.5F, 1.5F, -2F, 0F, -1.5F, -2F, 0F, -1F, 0F, 1.5F, 1.5F, 0F, 5F, 0F, 0.5F, 0F, 3.5F, 0.5F, 0F, 3.5F, 0F, 5F, 0F, 0F); // Box 29
		bodyModel[15].setRotationPoint(14F, -48F, -5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 29, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[16].setRotationPoint(-26F, -25F, -10F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 22, 5, 10, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[17].setRotationPoint(3F, -25F, -10F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 22, 4, 9, 0F,0F, 0F, 0.5F, 0F, 2F, -1F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2.5F, 0F, -3F, -4F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[18].setRotationPoint(3F, -20F, -9F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 29, 4, 10, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -3.5F, 0F, -0.5F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[19].setRotationPoint(-26F, -20F, -10F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 14, 4, 10, 0F,0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -3.5F, 0F, -0.5F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[20].setRotationPoint(-40F, -20F, -10F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 14, 3, 8, 0F,0F, 2F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -1F, -3F, 0F, 0.5F, -1.5F, 0F, 1F, 0F, 0F, -0.5F, 0F); // Box 39
		bodyModel[21].setRotationPoint(-54F, -20F, -8F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 8, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[22].setRotationPoint(-8F, -19F, -9F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 25, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -4F, 0F, -3F, 4F, 0F, 0F, 0F); // Box 88
		bodyModel[23].setRotationPoint(0F, -19F, -9F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 8, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		bodyModel[24].setRotationPoint(-8F, -11F, -9F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 25, 1, 9, 0F,0F, 0F, 0F, 0F, 3F, -4F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, -5F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[25].setRotationPoint(0F, -11F, -9F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 22, 2, 8, 0F,0F, 0F, 0F, 0F, -4.49999F, -0.49999F, 0F, -4.49999F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 2.49999F, -0.49999F, 0F, 2.49999F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[26].setRotationPoint(3F, -43F, -8F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 96
		bodyModel[27].setRotationPoint(-4F, -43F, -8F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-1F, 0F, -4.5F, 1F, 0F, -4.5F, 1F, -0.5F, 4F, -1F, -0.5F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[28].setRotationPoint(-4F, -51F, -8F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 98
		bodyModel[29].setRotationPoint(-3F, -51F, -3F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 99
		bodyModel[30].setRotationPoint(-9F, -43F, -8F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, -0.5F, 4F, 0F, -0.5F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[31].setRotationPoint(-9F, -52F, -8F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 101
		bodyModel[32].setRotationPoint(-9F, -52F, -3F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, -0.5F, 4F, 0F, -0.5F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[33].setRotationPoint(-19F, -51F, -8F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 103
		bodyModel[34].setRotationPoint(-19F, -43F, -8F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 104
		bodyModel[35].setRotationPoint(-19F, -51F, -3F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, -1F, 0F, 0F, -1F); // Box 105
		bodyModel[36].setRotationPoint(-19F, -51F, -3F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[37].setRotationPoint(-8F, -52F, -4F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -6F, 2F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, -6F, -2F, 0F, 6F, 2F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 6F, -2F); // Box 107
		bodyModel[38].setRotationPoint(-26F, -51F, -3F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, -3F, 3.25F, 0F, -3F, -3.25F, 0F, 0F, 0F, 0F, 0F, 0.7F, 0F, 3F, 3.5F, 0F, 3F, -3.5F, 0F, 0F, -0.7F); // Box 108
		bodyModel[39].setRotationPoint(-26F, -45F, -5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[40].setRotationPoint(-19F, -52F, -1F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[41].setRotationPoint(-9F, -53F, -1F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[42].setRotationPoint(-3F, -52F, -1F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, 0F, 0F, 0.5F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 2.5F, 0F, 0.5F, 2.5F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[43].setRotationPoint(-2F, -52F, -1F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 21, 6, 8, 0F,0F, 0F, 0F, 0F, 0.5F, -2.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, -2.5F, 0F, -2.5F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[44].setRotationPoint(0F, -17F, -8F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 22, 5, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		bodyModel[45].setRotationPoint(-19F, -41F, 7F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 22, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[46].setRotationPoint(-19F, -36F, 9F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 7, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[47].setRotationPoint(-26F, -36F, 9F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 7, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		bodyModel[48].setRotationPoint(-26F, -41F, 7F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 14, 11, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[49].setRotationPoint(-40F, -36F, 0F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 14, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[50].setRotationPoint(-40F, -41F, 0F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 14, 4, 8, 0F,0F, 0.5F, 0F, 0F, 1.25F, 0F, 0F, 0F, -3F, 0F, -0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[51].setRotationPoint(-40F, -45F, 0F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 14, 5, 10, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 131
		bodyModel[52].setRotationPoint(-54F, -41F, 0F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 14, 4, 8, 0F,0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, -3F, 0F, -1.5F, -3F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 133
		bodyModel[53].setRotationPoint(-54F, -45F, 0F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 14, 11, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F); // Box 135
		bodyModel[54].setRotationPoint(-54F, -36F, 0F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 22, 11, 10, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 0F); // Box 137
		bodyModel[55].setRotationPoint(3F, -36F, 0F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 22, 5, 10, 0F,0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, -2.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -1F, 0F, 0F, 0F); // Box 138
		bodyModel[56].setRotationPoint(3F, -41F, 0F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 11, 5, 8, 0F,5F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, -2.5F, 5F, 0F, -2.5F, 11F, -2F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, -0.5F, 11F, -2F, 0F); // Box 139
		bodyModel[57].setRotationPoint(14F, -46F, 0F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 14, 5, 10, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -2F, -2F); // Box 144
		bodyModel[58].setRotationPoint(-54F, -25F, 0F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 14, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1.5F); // Box 145
		bodyModel[59].setRotationPoint(-40F, -25F, 0F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 11, 2, 5, 0F,1.5F, 1.5F, 0F, 0F, -1F, 0F, 0F, -1.5F, -2F, 1.5F, 1.5F, -2F, 5F, 0F, 0F, 0F, 3.5F, 0F, 0F, 3.5F, 0.5F, 5F, 0F, 0.5F); // Box 151
		bodyModel[60].setRotationPoint(14F, -48F, 0F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 29, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 154
		bodyModel[61].setRotationPoint(-26F, -25F, 0F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 22, 5, 10, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, 0F, -0.5F); // Box 155
		bodyModel[62].setRotationPoint(3F, -25F, 0F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 22, 4, 9, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -3F, -4F, 0F, -0.5F, -2.5F); // Box 158
		bodyModel[63].setRotationPoint(3F, -20F, 0F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 29, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -3.5F, 0F, -0.5F, -3.5F); // Box 159
		bodyModel[64].setRotationPoint(-26F, -20F, 0F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 14, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -3.5F, 0F, -0.5F, -3.5F); // Box 160
		bodyModel[65].setRotationPoint(-40F, -20F, 0F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 14, 3, 8, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 0.5F, -1.5F, 0F, -1F, -3F); // Box 161
		bodyModel[66].setRotationPoint(-54F, -20F, 0F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 8, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
		bodyModel[67].setRotationPoint(-8F, -19F, 8F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 25, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 4F, 0F, -3F, -4F, 0F, 0F, 0F); // Box 212
		bodyModel[68].setRotationPoint(0F, -19F, 8F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 8, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 213
		bodyModel[69].setRotationPoint(-8F, -11F, 0F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 25, 1, 9, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -5F, 0F, 0F, -1F); // Box 214
		bodyModel[70].setRotationPoint(0F, -11F, 0F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 22, 2, 8, 0F,0F, 0F, 0F, 0F, -4.49999F, 0F, 0F, -4.49999F, -0.49999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.49999F, 0F, 0F, 2.49999F, -0.49999F, 0F, 0F, 0.5F); // Box 219
		bodyModel[71].setRotationPoint(3F, -43F, 0F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 220
		bodyModel[72].setRotationPoint(-4F, -43F, 7F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-1F, -0.5F, 4F, 1F, -0.5F, 4F, 1F, 0F, -4.5F, -1F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221
		bodyModel[73].setRotationPoint(-4F, -51F, 7F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 222
		bodyModel[74].setRotationPoint(-3F, -51F, 1F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 223
		bodyModel[75].setRotationPoint(-9F, -43F, 7F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, -0.5F, 4F, 0F, -0.5F, 4F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[76].setRotationPoint(-9F, -52F, 7F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 225
		bodyModel[77].setRotationPoint(-9F, -52F, 1F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -0.5F, 4F, 0F, -0.5F, 4F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
		bodyModel[78].setRotationPoint(-19F, -51F, 7F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 227
		bodyModel[79].setRotationPoint(-19F, -43F, 7F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 228
		bodyModel[80].setRotationPoint(-19F, -51F, 1F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, 1F, 0F, 0F, 1F); // Box 229
		bodyModel[81].setRotationPoint(-19F, -51F, 2F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 230
		bodyModel[82].setRotationPoint(-8F, -52F, 3F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -6F, -2F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, -6F, 2F, 0F, 6F, -2F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 6F, 2F); // Box 231
		bodyModel[83].setRotationPoint(-26F, -51F, 2F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, -3F, -3.25F, 0F, -3F, 3.25F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 3F, -3.5F, 0F, 3F, 3.5F, 0F, 0F, 0.7F); // Box 232
		bodyModel[84].setRotationPoint(-26F, -45F, 4F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 233
		bodyModel[85].setRotationPoint(-19F, -52F, 0F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
		bodyModel[86].setRotationPoint(-9F, -53F, 0F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		bodyModel[87].setRotationPoint(-3F, -52F, 0F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, 0F, 0F, 0.5F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 2.5F, 0F, 0.5F, 2.5F, 0F, 0F, 0F, 0F); // Box 236
		bodyModel[88].setRotationPoint(-2F, -52F, 0F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 21, 6, 8, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, -2.5F, 0F, 0F, 0F); // Box 237
		bodyModel[89].setRotationPoint(0F, -17F, 0F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 695
		bodyModel[90].setRotationPoint(13F, -63F, -0.5F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 465
		bodyModel[91].setRotationPoint(-18.5F, -45F, -1F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, 0F); // Box 466
		bodyModel[92].setRotationPoint(-18.5F, -45.5F, -1F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 467
		bodyModel[93].setRotationPoint(-17F, -45.75F, -1F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 468
		bodyModel[94].setRotationPoint(-17F, -44.75F, -1F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.6F, -0.25F, 0F); // Box 469
		bodyModel[95].setRotationPoint(-17.1F, -44.25F, -1F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.7F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.5F, 0F, -0.7F, -0.5F, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 470
		bodyModel[96].setRotationPoint(-18.5F, -46.5F, -1F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.7F, -0.5F, -0.3F, -0.2F, -0.5F, -0.3F, -0.2F, -0.3F, 0F, -0.7F, -0.3F, 0F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 471
		bodyModel[97].setRotationPoint(-18.5F, -46.5F, 0F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.1F); // Box 472
		bodyModel[98].setRotationPoint(-16.7F, -45.5F, -1F);

		bodyModel[99].addShapeBox(0F, 1F, 0F, 10, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
		bodyModel[99].setRotationPoint(-10F, -29.5F, -5F);
		bodyModel[99].rotateAngleZ = -0.10471976F;

		bodyModel[100].addShapeBox(9F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		bodyModel[100].setRotationPoint(-10F, -29.5F, -5F);
		bodyModel[100].rotateAngleZ = -0.10471976F;

		bodyModel[101].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		bodyModel[101].setRotationPoint(-10F, -29.5F, -5F);
		bodyModel[101].rotateAngleZ = -0.10471976F;

		bodyModel[102].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		bodyModel[102].setRotationPoint(-10F, -29.5F, 4F);
		bodyModel[102].rotateAngleZ = -0.10471976F;

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		bodyModel[103].setRotationPoint(-10F, -29.5F, -5F);
		bodyModel[103].rotateAngleZ = -0.10471976F;

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 17, 10, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		bodyModel[104].setRotationPoint(-1F, -45.5F, -5F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[105].setRotationPoint(1F, -49.5F, -3F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 17, 8, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 246
		bodyModel[106].setRotationPoint(-2F, -44.5F, -4F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[107].setRotationPoint(-2.3F, -44.8F, -2F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[108].setRotationPoint(-2.3F, -44.8F, 1F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 2, 18, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[109].setRotationPoint(-1F, -42.5F, -4F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 2, 18, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 251
		bodyModel[110].setRotationPoint(-1F, -42.5F, 3F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[111].setRotationPoint(-7F, -28.5F, -6F);
		bodyModel[111].rotateAngleZ = 0.78539816F;

		bodyModel[112].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 253
		bodyModel[112].setRotationPoint(-7F, -28.5F, 5F);
		bodyModel[112].rotateAngleZ = 0.78539816F;

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 962
		bodyModel[113].setRotationPoint(0.5F, -49F, -1.5F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 964
		bodyModel[114].setRotationPoint(0.5F, -48F, -1.5F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 966
		bodyModel[115].setRotationPoint(0.5F, -47F, -1.5F);

		bodyModel[116].addShapeBox(0F, -3F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 259
		bodyModel[116].setRotationPoint(-22F, -25.5F, -6F);
		bodyModel[116].rotateAngleZ = 0.15707963F;

		bodyModel[117].addShapeBox(0F, -3F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
		bodyModel[117].setRotationPoint(-22F, -25.5F, 4F);
		bodyModel[117].rotateAngleZ = 0.15707963F;

		bodyModel[118].addShapeBox(0F, 0F, 0F, 7, 9, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 256
		bodyModel[118].setRotationPoint(-26F, -33.5F, -2F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 8, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[119].setRotationPoint(-18F, -26.5F, -2F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 254
		bodyModel[120].setRotationPoint(-18F, -27.5F, -1.5F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 263
		bodyModel[121].setRotationPoint(-15.5F, -30.5F, -1F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 264
		bodyModel[122].setRotationPoint(-15F, -34.5F, -0.5F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 265
		bodyModel[123].setRotationPoint(-15F, -36.5F, -0.5F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 266
		bodyModel[124].setRotationPoint(-14.7F, -36.6F, -0.5F);

		bodyModel[125].addShapeBox(0F, -1F, -1F, 0, 75, 75, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -73F, 0F, 0F, -73F, 0F, -73F, 0F, 0F, -73F, 0F, 0F, -73F, -73F, 0F, -73F, -73F); // Box 814
		bodyModel[125].setRotationPoint(-17.5F, -46.5F, 0F);
		bodyModel[125].rotateAngleX = -0.01745329F;
		bodyModel[125].rotateAngleY = 0.01745329F;
		bodyModel[125].rotateAngleZ = -0.29670597F;

		bodyModel[126].addShapeBox(0F, 0F, 0F, 3, 11, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 314
		bodyModel[126].setRotationPoint(-26F, -36F, -9F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 8, 5, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[127].setRotationPoint(-26F, -36F, -9F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 8, 5, 18, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 316
		bodyModel[128].setRotationPoint(-26F, -41F, -9F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 8, 3, 14, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 317
		bodyModel[129].setRotationPoint(-26F, -44F, -7F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 675
		bodyModel[130].setRotationPoint(-18.75F, -41.5F, 2.5F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 676
		bodyModel[131].setRotationPoint(-18.75F, -41F, 2.5F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 677
		bodyModel[132].setRotationPoint(-18.75F, -41F, 2.5F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 400
		bodyModel[133].setRotationPoint(-18.75F, -41.5F, -4F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 401
		bodyModel[134].setRotationPoint(-18.75F, -41F, -4F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 402
		bodyModel[135].setRotationPoint(-18.75F, -41F, -4F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 415
		bodyModel[136].setRotationPoint(-18.75F, -42.5F, -1.25F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 416
		bodyModel[137].setRotationPoint(-18.75F, -42F, -1.25F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 417
		bodyModel[138].setRotationPoint(-18.75F, -41F, -1.25F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 227
		bodyModel[139].setRotationPoint(-18.75F, -39.5F, 1.5F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 228
		bodyModel[140].setRotationPoint(-18.75F, -39F, 1.5F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 229
		bodyModel[141].setRotationPoint(-18.75F, -39F, 1.5F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 230
		bodyModel[142].setRotationPoint(-18.75F, -39.5F, -3.5F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 231
		bodyModel[143].setRotationPoint(-18.75F, -39F, -3.5F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 232
		bodyModel[144].setRotationPoint(-18.75F, -39F, -3.5F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 372
		bodyModel[145].setRotationPoint(-18.75F, -38F, -6F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 373
		bodyModel[146].setRotationPoint(-18.75F, -38F, -6F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 374
		bodyModel[147].setRotationPoint(-18.75F, -38.5F, -6F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 375
		bodyModel[148].setRotationPoint(-18.75F, -38F, 4F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 376
		bodyModel[149].setRotationPoint(-18.75F, -38F, 4F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 377
		bodyModel[150].setRotationPoint(-18.75F, -38.5F, 4F);
	}

	private void initnoseModel_1()
	{
		noseModel[0] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 9
		noseModel[1] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 11
		noseModel[2] = new ModelRendererTurbo(this, 561, 1, textureX, textureY); // Box 13
		noseModel[3] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 20
		noseModel[4] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 40
		noseModel[5] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 41
		noseModel[6] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 42
		noseModel[7] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 43
		noseModel[8] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 48
		noseModel[9] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 49
		noseModel[10] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Box 50
		noseModel[11] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Box 51
		noseModel[12] = new ModelRendererTurbo(this, 865, 33, textureX, textureY); // Box 52
		noseModel[13] = new ModelRendererTurbo(this, 897, 33, textureX, textureY); // Box 53
		noseModel[14] = new ModelRendererTurbo(this, 929, 33, textureX, textureY); // Box 54
		noseModel[15] = new ModelRendererTurbo(this, 961, 33, textureX, textureY); // Box 55
		noseModel[16] = new ModelRendererTurbo(this, 993, 33, textureX, textureY); // Box 56
		noseModel[17] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 57
		noseModel[18] = new ModelRendererTurbo(this, 401, 41, textureX, textureY); // Box 58
		noseModel[19] = new ModelRendererTurbo(this, 433, 41, textureX, textureY); // Box 59
		noseModel[20] = new ModelRendererTurbo(this, 545, 1, textureX, textureY); // Box 60
		noseModel[21] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 61
		noseModel[22] = new ModelRendererTurbo(this, 665, 1, textureX, textureY); // Box 62
		noseModel[23] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Box 63
		noseModel[24] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 64
		noseModel[25] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 65
		noseModel[26] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 66
		noseModel[27] = new ModelRendererTurbo(this, 737, 1, textureX, textureY); // Box 67
		noseModel[28] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 68
		noseModel[29] = new ModelRendererTurbo(this, 513, 41, textureX, textureY); // Box 69
		noseModel[30] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 70
		noseModel[31] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 71
		noseModel[32] = new ModelRendererTurbo(this, 601, 1, textureX, textureY); // Box 72
		noseModel[33] = new ModelRendererTurbo(this, 785, 1, textureX, textureY); // Box 73
		noseModel[34] = new ModelRendererTurbo(this, 865, 1, textureX, textureY); // Box 74
		noseModel[35] = new ModelRendererTurbo(this, 569, 65, textureX, textureY); // Box 132
		noseModel[36] = new ModelRendererTurbo(this, 665, 65, textureX, textureY); // Box 134
		noseModel[37] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Box 136
		noseModel[38] = new ModelRendererTurbo(this, 369, 81, textureX, textureY); // Box 143
		noseModel[39] = new ModelRendererTurbo(this, 377, 105, textureX, textureY); // Box 162
		noseModel[40] = new ModelRendererTurbo(this, 673, 105, textureX, textureY); // Box 163
		noseModel[41] = new ModelRendererTurbo(this, 881, 65, textureX, textureY); // Box 164
		noseModel[42] = new ModelRendererTurbo(this, 833, 105, textureX, textureY); // Box 165
		noseModel[43] = new ModelRendererTurbo(this, 873, 105, textureX, textureY); // Box 172
		noseModel[44] = new ModelRendererTurbo(this, 905, 105, textureX, textureY); // Box 173
		noseModel[45] = new ModelRendererTurbo(this, 937, 105, textureX, textureY); // Box 174
		noseModel[46] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 175
		noseModel[47] = new ModelRendererTurbo(this, 33, 113, textureX, textureY); // Box 176
		noseModel[48] = new ModelRendererTurbo(this, 145, 113, textureX, textureY); // Box 177
		noseModel[49] = new ModelRendererTurbo(this, 225, 113, textureX, textureY); // Box 178
		noseModel[50] = new ModelRendererTurbo(this, 257, 113, textureX, textureY); // Box 179
		noseModel[51] = new ModelRendererTurbo(this, 529, 113, textureX, textureY); // Box 180
		noseModel[52] = new ModelRendererTurbo(this, 561, 113, textureX, textureY); // Box 181
		noseModel[53] = new ModelRendererTurbo(this, 593, 113, textureX, textureY); // Box 182
		noseModel[54] = new ModelRendererTurbo(this, 625, 113, textureX, textureY); // Box 183
		noseModel[55] = new ModelRendererTurbo(this, 497, 65, textureX, textureY); // Box 184
		noseModel[56] = new ModelRendererTurbo(this, 1001, 65, textureX, textureY); // Box 185
		noseModel[57] = new ModelRendererTurbo(this, 553, 65, textureX, textureY); // Box 186
		noseModel[58] = new ModelRendererTurbo(this, 969, 113, textureX, textureY); // Box 187
		noseModel[59] = new ModelRendererTurbo(this, 705, 73, textureX, textureY); // Box 188
		noseModel[60] = new ModelRendererTurbo(this, 913, 73, textureX, textureY); // Box 189
		noseModel[61] = new ModelRendererTurbo(this, 697, 105, textureX, textureY); // Box 190
		noseModel[62] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 191
		noseModel[63] = new ModelRendererTurbo(this, 993, 113, textureX, textureY); // Box 192
		noseModel[64] = new ModelRendererTurbo(this, 65, 121, textureX, textureY); // Box 193
		noseModel[65] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 194
		noseModel[66] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // Box 195
		noseModel[67] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Box 196
		noseModel[68] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Box 197
		noseModel[69] = new ModelRendererTurbo(this, 889, 33, textureX, textureY); // Box 198

		noseModel[0].addShapeBox(0F, 0F, 0F, 12, 5, 10, 0F,0F, -1.5F, -2.5F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 9
		noseModel[0].setRotationPoint(-66F, -41F, -10F);

		noseModel[1].addShapeBox(0F, 0F, 0F, 12, 4, 8, 0F,0F, -2.5F, -3F, 0F, -1.5F, -3F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, 0F); // Box 11
		noseModel[1].setRotationPoint(-66F, -45F, -8F);

		noseModel[2].addShapeBox(0F, 0F, 0F, 12, 9, 10, 0F,0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 13
		noseModel[2].setRotationPoint(-66F, -36F, -10F);

		noseModel[3].addShapeBox(0F, 0F, 0F, 12, 5, 10, 0F,0F, 0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, -2.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 20
		noseModel[3].setRotationPoint(-66F, -27F, -10F);

		noseModel[4].addShapeBox(0F, 0F, 0F, 12, 3, 8, 0F,0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, -3.5F, 0F, 1F, -3F, 0F, 1.5F, 0F, 0F, 1F, 0F); // Box 40
		noseModel[4].setRotationPoint(-66F, -22F, -8F);

		noseModel[5].addShapeBox(0F, 0F, 0F, 7, 9, 9, 0F,0F, -1F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F); // Box 41
		noseModel[5].setRotationPoint(-73F, -36F, -9F);

		noseModel[6].addShapeBox(0F, 0F, 0F, 7, 3, 9, 0F,0F, -0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F); // Box 42
		noseModel[6].setRotationPoint(-73F, -39F, -9F);

		noseModel[7].addShapeBox(0F, 0F, 0F, 7, 4, 9, 0F,0F, 1F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, -0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, 0F, 0F, -0.5F, 0F); // Box 43
		noseModel[7].setRotationPoint(-73F, -27F, -9F);

		noseModel[8].addShapeBox(0F, 0F, 0F, 7, 3, 7, 0F,0F, -1.5F, -2F, 0F, -0.5F, -2F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 1.5F, 0F); // Box 48
		noseModel[8].setRotationPoint(-73F, -43F, -7F);

		noseModel[9].addShapeBox(0F, 0F, 0F, 7, 3, 7, 0F,0F, 1.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, -2.5F, 0F, 0F, -2.5F, 0F, 1F, 0F, 0F, -0.5F, 0F); // Box 49
		noseModel[9].setRotationPoint(-73F, -22F, -7F);

		noseModel[10].addShapeBox(0F, 0F, 0F, 7, 7, 8, 0F,0F, -1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 50
		noseModel[10].setRotationPoint(-80F, -35F, -8F);

		noseModel[11].addShapeBox(0F, 0F, 0F, 6, 5, 8, 0F,-0.5F, -2F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 51
		noseModel[11].setRotationPoint(-86F, -34F, -8F);

		noseModel[12].addShapeBox(0F, 0F, 0F, 7, 3, 8, 0F,0F, -1F, -1F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 52
		noseModel[12].setRotationPoint(-80F, -38F, -8F);

		noseModel[13].addShapeBox(0F, 0F, 0F, 6, 3, 8, 0F,-0.5F, -2F, -1.75F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, 2F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2F, 0F); // Box 53
		noseModel[13].setRotationPoint(-86F, -37F, -8F);

		noseModel[14].addShapeBox(0F, 0F, 0F, 7, 3, 7, 0F,0F, -1F, -2.5F, 0F, 0.5F, -2F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, 1F, 0F); // Box 54
		noseModel[14].setRotationPoint(-80F, -41F, -7F);

		noseModel[15].addShapeBox(0F, 0F, 0F, 6, 3, 7, 0F,-0.5F, -2.25F, -2.75F, 0F, 0F, -2.5F, 0F, 1F, 0F, -0.5F, -1.25F, 0F, -0.5F, 2F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2F, 0F); // Box 55
		noseModel[15].setRotationPoint(-86F, -40F, -7F);

		noseModel[16].addShapeBox(0F, 0F, 0F, 7, 4, 8, 0F,0F, 1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, -1F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, -1F, 0F); // Box 56
		noseModel[16].setRotationPoint(-80F, -28F, -8F);

		noseModel[17].addShapeBox(0F, 0F, 0F, 7, 3, 7, 0F,0F, 1F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, -1.5F, -2.5F, 0F, 0.5F, -2.5F, 0F, 1.5F, 0F, 0F, -0.5F, 0F); // Box 57
		noseModel[17].setRotationPoint(-80F, -24F, -7F);

		noseModel[18].addShapeBox(0F, 0F, 0F, 6, 4, 8, 0F,-0.5F, 0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, -2F, -1.25F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, -2F, 0F); // Box 58
		noseModel[18].setRotationPoint(-86F, -29F, -8F);

		noseModel[19].addShapeBox(0F, 0F, 0F, 6, 2, 7, 0F,-0.5F, 2F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2F, 0F, -0.5F, -1.25F, -2.25F, 0F, 0.5F, -2.5F, 0F, 1.5F, 0F, -0.5F, -0.25F, 0F); // Box 59
		noseModel[19].setRotationPoint(-86F, -25F, -7F);

		noseModel[20].addShapeBox(0F, 0F, 0F, 4, 2, 7, 0F,0F, 0F, -1F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0F, 0F, 0F, 0F); // Box 60
		noseModel[20].setRotationPoint(-90F, -32F, -7F);

		noseModel[21].addShapeBox(0F, 0F, 0F, 4, 3, 7, 0F,0F, -1F, -2F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 61
		noseModel[21].setRotationPoint(-90F, -35F, -7F);

		noseModel[22].addShapeBox(0F, 0F, 0F, 4, 2, 7, 0F,0F, -1F, -4F, 0.5F, 0.5F, -3F, 0.5F, 1.5F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0F, 1F, 0F); // Box 62
		noseModel[22].setRotationPoint(-90F, -37F, -7F);

		noseModel[23].addShapeBox(0F, 0F, 0F, 4, 3, 7, 0F,0F, 0F, -1F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, -1.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, -1F, 0F); // Box 63
		noseModel[23].setRotationPoint(-90F, -30F, -7F);

		noseModel[24].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F,0F, 1F, -0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, -2.5F, 0.5F, 0.5F, -1.5F, 0.5F, 1.5F, 0F, 0F, 0F, 0F); // Box 64
		noseModel[24].setRotationPoint(-90F, -27F, -6F);

		noseModel[25].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F,0F, -0.5F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 65
		noseModel[25].setRotationPoint(-95F, -32F, -6F);

		noseModel[26].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F,0F, -1.5F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 66
		noseModel[26].setRotationPoint(-95F, -34F, -6F);

		noseModel[27].addShapeBox(0F, 0F, 0F, 5, 2, 5, 0F,0F, -2F, -3F, 0F, 0F, -2F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F); // Box 67
		noseModel[27].setRotationPoint(-95F, -36F, -5F);

		noseModel[28].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F,0F, 0.5F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, -3F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Box 68
		noseModel[28].setRotationPoint(-95F, -30F, -6F);

		noseModel[29].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F,0F, 1.5F, -3F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -2.5F, -4F, 0F, 0F, -2.5F, 0F, 1F, 0F, 0F, -1.5F, 0F); // Box 69
		noseModel[29].setRotationPoint(-95F, -28F, -6F);

		noseModel[30].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, -2.9999F, 0F, -0.49999F, 0.49999F, 0F, -0.49999F, 0F, 0F, 0F, 0F, 0F, -0.9999F, -2.9999F, 0F, 0.49999F, 0F, 0F, 0.49999F, 0F, 0F, -0.9999F, 0F); // Box 70
		noseModel[30].setRotationPoint(-98F, -31F, -3F);

		noseModel[31].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -0.9999F, -2.9999F, 0F, -0.49999F, 0.49999F, 0F, -0.49999F, 0F, 0F, -0.9999F, 0F, 0F, 0F, -2.9999F, 0F, 0.49999F, 0.49999F, 0F, 0.49999F, 0F, 0F, 0F, 0F); // Box 71
		noseModel[31].setRotationPoint(-98F, -32F, -3F);

		noseModel[32].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -2.9999F, -2.9999F, 0F, -1.49999F, 0F, 0F, -1.49999F, 0F, 0F, -2.9999F, 0F, 0F, 1.9999F, -2.9999F, 0F, 1.49999F, 0.49999F, 0F, 1.49999F, 0F, 0F, 1.9999F, 0F); // Box 72
		noseModel[32].setRotationPoint(-98F, -34F, -3F);

		noseModel[33].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0.9999F, -2.9999F, 0F, -0.49999F, 0F, 0F, -0.49999F, 0F, 0F, 0.9999F, 0F, 0F, -1.9999F, -2.9999F, 0F, 0.49999F, -0.9999F, 0F, 1.5F, 0F, 0F, -1.9999F, 0F); // Box 73
		noseModel[33].setRotationPoint(-98F, -30F, -3F);

		noseModel[34].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -3.9999F, -2.9999F, 0F, -0.9999F, -0.9999F, 0F, -0.49999F, 0F, 0F, -3.9999F, 0F, 0F, 2.9999F, -2.9999F, 0F, 1.49999F, 0F, 0F, 1.49999F, 0F, 0F, 2.9999F, 0F); // Box 74
		noseModel[34].setRotationPoint(-98F, -35F, -3F);

		noseModel[35].addShapeBox(0F, 0F, 0F, 12, 5, 10, 0F,0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, -1.5F, -2.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, -1F); // Box 132
		noseModel[35].setRotationPoint(-66F, -41F, 0F);

		noseModel[36].addShapeBox(0F, 0F, 0F, 12, 4, 8, 0F,0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, -3F, 0F, -2.5F, -3F, 0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, -0.5F); // Box 134
		noseModel[36].setRotationPoint(-66F, -45F, 0F);

		noseModel[37].addShapeBox(0F, 0F, 0F, 12, 9, 10, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -1F); // Box 136
		noseModel[37].setRotationPoint(-66F, -36F, 0F);

		noseModel[38].addShapeBox(0F, 0F, 0F, 12, 5, 10, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.5F, -2.5F); // Box 143
		noseModel[38].setRotationPoint(-66F, -27F, 0F);

		noseModel[39].addShapeBox(0F, 0F, 0F, 12, 3, 8, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 1F, 0F, 0F, 1.5F, 0F, 0F, 1F, -3F, 0F, 0F, -3.5F); // Box 162
		noseModel[39].setRotationPoint(-66F, -22F, 0F);

		noseModel[40].addShapeBox(0F, 0F, 0F, 7, 9, 9, 0F,0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, -0.5F); // Box 163
		noseModel[40].setRotationPoint(-73F, -36F, 0F);

		noseModel[41].addShapeBox(0F, 0F, 0F, 7, 3, 9, 0F,0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, -0.5F); // Box 164
		noseModel[41].setRotationPoint(-73F, -39F, 0F);

		noseModel[42].addShapeBox(0F, 0F, 0F, 7, 4, 9, 0F,0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, -0.5F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1.5F, 0F, -0.5F, -1.5F); // Box 165
		noseModel[42].setRotationPoint(-73F, -27F, 0F);

		noseModel[43].addShapeBox(0F, 0F, 0F, 7, 3, 7, 0F,0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, -2F, 0F, -1.5F, -2F, 0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 1.5F, 0.5F); // Box 172
		noseModel[43].setRotationPoint(-73F, -43F, 0F);

		noseModel[44].addShapeBox(0F, 0F, 0F, 7, 3, 7, 0F,0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 1.5F, 0.5F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 0F, -2.5F, 0F, -1.5F, -2.5F); // Box 173
		noseModel[44].setRotationPoint(-73F, -22F, 0F);

		noseModel[45].addShapeBox(0F, 0F, 0F, 7, 7, 8, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1F, 0F); // Box 174
		noseModel[45].setRotationPoint(-80F, -35F, 0F);

		noseModel[46].addShapeBox(0F, 0F, 0F, 6, 5, 8, 0F,-0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, -0.25F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.25F); // Box 175
		noseModel[46].setRotationPoint(-86F, -34F, 0F);

		noseModel[47].addShapeBox(0F, 0F, 0F, 7, 3, 8, 0F,0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, -1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 1F, 0F); // Box 176
		noseModel[47].setRotationPoint(-80F, -38F, 0F);

		noseModel[48].addShapeBox(0F, 0F, 0F, 6, 3, 8, 0F,-0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, -2F, -1.75F, -0.5F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2F, -0.25F); // Box 177
		noseModel[48].setRotationPoint(-86F, -37F, 0F);

		noseModel[49].addShapeBox(0F, 0F, 0F, 7, 3, 7, 0F,0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, -2F, 0F, -1F, -2.5F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, 1F, 0F); // Box 178
		noseModel[49].setRotationPoint(-80F, -41F, 0F);

		noseModel[50].addShapeBox(0F, 0F, 0F, 6, 3, 7, 0F,-0.5F, -1.25F, 0F, 0F, 1F, 0F, 0F, 0F, -2.5F, -0.5F, -2.25F, -2.75F, -0.5F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2F, -0.75F); // Box 179
		noseModel[50].setRotationPoint(-86F, -40F, 0F);

		noseModel[51].addShapeBox(0F, 0F, 0F, 7, 4, 8, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, -1F, -1F); // Box 180
		noseModel[51].setRotationPoint(-80F, -28F, 0F);

		noseModel[52].addShapeBox(0F, 0F, 0F, 7, 3, 7, 0F,0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, -2.5F, 0F, -1.5F, -2.5F); // Box 181
		noseModel[52].setRotationPoint(-80F, -24F, 0F);

		noseModel[53].addShapeBox(0F, 0F, 0F, 6, 4, 8, 0F,-0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, -0.25F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, -2F, -1.25F); // Box 182
		noseModel[53].setRotationPoint(-86F, -29F, 0F);

		noseModel[54].addShapeBox(0F, 0F, 0F, 6, 2, 7, 0F,-0.5F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2F, -0.25F, -0.5F, -0.25F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, -2.5F, -0.5F, -1.25F, -2.25F); // Box 183
		noseModel[54].setRotationPoint(-86F, -25F, 0F);

		noseModel[55].addShapeBox(0F, 0F, 0F, 4, 2, 7, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0.5F, 0F, 0F, -1F); // Box 184
		noseModel[55].setRotationPoint(-90F, -32F, 0F);

		noseModel[56].addShapeBox(0F, 0F, 0F, 4, 3, 7, 0F,0F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, -1F, -2F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, -1F); // Box 185
		noseModel[56].setRotationPoint(-90F, -35F, 0F);

		noseModel[57].addShapeBox(0F, 0F, 0F, 4, 2, 7, 0F,0F, 0F, 0F, 0.5F, 1.5F, 0F, 0.5F, 0.5F, -3F, 0F, -1F, -4F, 0F, 1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, 1F, -2F); // Box 186
		noseModel[57].setRotationPoint(-90F, -37F, 0F);

		noseModel[58].addShapeBox(0F, 0F, 0F, 4, 3, 7, 0F,0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0.5F, 0F, 0F, -1F, 0F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, -1F, -1.5F); // Box 187
		noseModel[58].setRotationPoint(-90F, -30F, 0F);

		noseModel[59].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F,0F, 1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 1F, -0.5F, 0F, 0F, 0F, 0.5F, 1.5F, 0F, 0.5F, 0.5F, -1.5F, 0F, -1F, -2.5F); // Box 188
		noseModel[59].setRotationPoint(-90F, -27F, 0F);

		noseModel[60].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2.5F); // Box 189
		noseModel[60].setRotationPoint(-95F, -32F, 0F);

		noseModel[61].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F,0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, -3F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -2.5F); // Box 190
		noseModel[61].setRotationPoint(-95F, -34F, 0F);

		noseModel[62].addShapeBox(0F, 0F, 0F, 5, 2, 5, 0F,0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 0F, -2F, 0F, -2F, -3F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, -2F); // Box 191
		noseModel[62].setRotationPoint(-95F, -36F, 0F);

		noseModel[63].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -2.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1.5F, -3F); // Box 192
		noseModel[63].setRotationPoint(-95F, -30F, 0F);

		noseModel[64].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F,0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 1.5F, -3F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 0F, -2.5F, 0F, -2.5F, -4F); // Box 193
		noseModel[64].setRotationPoint(-95F, -28F, 0F);

		noseModel[65].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, -0.49999F, 0F, 0F, -0.49999F, 0.49999F, 0F, 0F, -2.9999F, 0F, -0.9999F, 0F, 0F, 0.49999F, 0F, 0F, 0.49999F, 0F, 0F, -0.9999F, -2.9999F); // Box 194
		noseModel[65].setRotationPoint(-98F, -31F, 0F);

		noseModel[66].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -0.9999F, 0F, 0F, -0.49999F, 0F, 0F, -0.49999F, 0.49999F, 0F, -0.9999F, -2.9999F, 0F, 0F, 0F, 0F, 0.49999F, 0F, 0F, 0.49999F, 0.49999F, 0F, 0F, -2.9999F); // Box 195
		noseModel[66].setRotationPoint(-98F, -32F, 0F);

		noseModel[67].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -2.9999F, 0F, 0F, -1.49999F, 0F, 0F, -1.49999F, 0F, 0F, -2.9999F, -2.9999F, 0F, 1.9999F, 0F, 0F, 1.49999F, 0F, 0F, 1.49999F, 0.49999F, 0F, 1.9999F, -2.9999F); // Box 196
		noseModel[67].setRotationPoint(-98F, -34F, 0F);

		noseModel[68].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0.9999F, 0F, 0F, -0.49999F, 0F, 0F, -0.49999F, 0F, 0F, 0.9999F, -2.9999F, 0F, -1.9999F, 0F, 0F, 1.5F, 0F, 0F, 0.49999F, -0.9999F, 0F, -1.9999F, -2.9999F); // Box 197
		noseModel[68].setRotationPoint(-98F, -30F, 0F);

		noseModel[69].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -3.9999F, 0F, 0F, -0.49999F, 0F, 0F, -0.9999F, -0.9999F, 0F, -3.9999F, -2.9999F, 0F, 2.9999F, 0F, 0F, 1.49999F, 0F, 0F, 1.49999F, 0F, 0F, 2.9999F, -2.9999F); // Box 198
		noseModel[69].setRotationPoint(-98F, -35F, 0F);
	}

	private void inittailModel_1()
	{
		tailModel[0] = new ModelRendererTurbo(this, 793, 1, textureX, textureY); // Box 17
		tailModel[1] = new ModelRendererTurbo(this, 873, 1, textureX, textureY); // Box 18
		tailModel[2] = new ModelRendererTurbo(this, 953, 1, textureX, textureY); // Box 19
		tailModel[3] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 24
		tailModel[4] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 25
		tailModel[5] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 26
		tailModel[6] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 27
		tailModel[7] = new ModelRendererTurbo(this, 681, 17, textureX, textureY); // Box 28
		tailModel[8] = new ModelRendererTurbo(this, 865, 17, textureX, textureY); // Box 30
		tailModel[9] = new ModelRendererTurbo(this, 945, 17, textureX, textureY); // Box 31
		tailModel[10] = new ModelRendererTurbo(this, 577, 25, textureX, textureY); // Box 34
		tailModel[11] = new ModelRendererTurbo(this, 657, 25, textureX, textureY); // Box 35
		tailModel[12] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Box 42
		tailModel[13] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 43
		tailModel[14] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 44
		tailModel[15] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 45
		tailModel[16] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 46
		tailModel[17] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 47
		tailModel[18] = new ModelRendererTurbo(this, 913, 49, textureX, textureY); // Box 92
		tailModel[19] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 123
		tailModel[20] = new ModelRendererTurbo(this, 457, 81, textureX, textureY); // Box 140
		tailModel[21] = new ModelRendererTurbo(this, 537, 81, textureX, textureY); // Box 141
		tailModel[22] = new ModelRendererTurbo(this, 617, 81, textureX, textureY); // Box 142
		tailModel[23] = new ModelRendererTurbo(this, 809, 89, textureX, textureY); // Box 146
		tailModel[24] = new ModelRendererTurbo(this, 889, 89, textureX, textureY); // Box 147
		tailModel[25] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 148
		tailModel[26] = new ModelRendererTurbo(this, 73, 97, textureX, textureY); // Box 149
		tailModel[27] = new ModelRendererTurbo(this, 337, 97, textureX, textureY); // Box 150
		tailModel[28] = new ModelRendererTurbo(this, 529, 97, textureX, textureY); // Box 152
		tailModel[29] = new ModelRendererTurbo(this, 609, 97, textureX, textureY); // Box 153
		tailModel[30] = new ModelRendererTurbo(this, 297, 105, textureX, textureY); // Box 156
		tailModel[31] = new ModelRendererTurbo(this, 457, 105, textureX, textureY); // Box 157
		tailModel[32] = new ModelRendererTurbo(this, 929, 57, textureX, textureY); // Box 166
		tailModel[33] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 167
		tailModel[34] = new ModelRendererTurbo(this, 745, 17, textureX, textureY); // Box 168
		tailModel[35] = new ModelRendererTurbo(this, 937, 17, textureX, textureY); // Box 169
		tailModel[36] = new ModelRendererTurbo(this, 649, 25, textureX, textureY); // Box 170
		tailModel[37] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 171
		tailModel[38] = new ModelRendererTurbo(this, 921, 129, textureX, textureY); // Box 216
		tailModel[39] = new ModelRendererTurbo(this, 585, 153, textureX, textureY); // Box 247
		tailModel[40] = new ModelRendererTurbo(this, 89, 161, textureX, textureY); // Box 557
		tailModel[41] = new ModelRendererTurbo(this, 1017, 81, textureX, textureY); // Box 579
		tailModel[42] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 550

		tailModel[0].addShapeBox(0F, 0F, 0F, 28, 8, 9, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		tailModel[0].setRotationPoint(25F, -34F, -9F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 28, 4, 9, 0F,0F, 0.5F, -1.5F, 0F, -1.5F, -2.5F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		tailModel[1].setRotationPoint(25F, -38F, -9F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 28, 4, 7, 0F,0F, -0.5F, -1.5F, 0F, -3.5F, -2.5F, 0F, -3.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 2.5F, -0.5F, 0F, 2.5F, 0F, 0F, 0.5F, 0F); // Box 19
		tailModel[2].setRotationPoint(25F, -43F, -7F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 31, 8, 7, 0F,0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		tailModel[3].setRotationPoint(53F, -34F, -7F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 31, 3, 7, 0F,0F, -0.5F, -0.5F, 0F, -1F, -5F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		tailModel[4].setRotationPoint(53F, -37F, -7F);

		tailModel[5].addShapeBox(0F, 0F, 0F, 31, 3, 6, 0F,0F, 0.5F, -1.5F, 0F, -2.5F, -4.5F, 0F, -2.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0.5F, 0F, 0F, -3.9999F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 26
		tailModel[5].setRotationPoint(53F, -39F, -6F);

		tailModel[6].addShapeBox(0F, 0F, 0F, 31, 1, 4, 0F,0F, 0.5F, -1.5F, 0F, -4F, -3.5F, 0F, -4F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0.5F, 0F, 3.5F, -2.5F, 0F, 3.5F, 0F, 0F, 0.5F, 0F); // Box 27
		tailModel[6].setRotationPoint(53F, -41F, -4F);

		tailModel[7].addShapeBox(0F, 0F, 0F, 28, 2, 5, 0F,0F, 1.5F, -2F, 0F, -3.5F, -2.5F, 0F, -3F, 0F, 0F, 2F, 0F, 0F, 0.5F, 0.5F, 0F, 3.5F, -0.5F, 0F, 3.5F, 0F, 0F, 0.5F, 0F); // Box 28
		tailModel[7].setRotationPoint(25F, -45F, -5F);

		tailModel[8].addShapeBox(0F, 0F, 0F, 28, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -3F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 30
		tailModel[8].setRotationPoint(25F, -26F, -9F);

		tailModel[9].addShapeBox(0F, 0F, 0F, 28, 3, 8, 0F,0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -4F, 0F, -0.5F, 0F, 0F, 1.5F, 0F); // Box 31
		tailModel[9].setRotationPoint(25F, -22F, -8F);

		tailModel[10].addShapeBox(0F, 0F, 0F, 31, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, -4.5F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 34
		tailModel[10].setRotationPoint(53F, -26F, -7F);

		tailModel[11].addShapeBox(0F, 0F, 0F, 31, 2, 6, 0F,0F, 0F, 0F, 0F, 1.5F, -3.5F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -5F, 0F, -2F, 0F, 0F, 1.5F, 0F); // Box 35
		tailModel[11].setRotationPoint(53F, -23F, -6F);

		tailModel[12].addShapeBox(0F, 0F, 0F, 4, 8, 2, 0F,0F, 0F, 0.5F, 0.5F, 2.5F, -1F, 0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 2.5F, -1F, 0.5F, 2.5F, 0F, 0F, 0F, 0F); // Box 42
		tailModel[12].setRotationPoint(84F, -34F, -2F);

		tailModel[13].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0.49999F, 0.49999F, -0.9999F, 0.49999F, 0.49999F, 0F, 0F, 0F, 0F, 0F, 0F, 0.49999F, 0.49999F, -2.49999F, -0.9999F, 0.49999F, -2.49999F, 0F, 0F, 0F, 0F); // Box 43
		tailModel[13].setRotationPoint(84F, -36F, -2F);

		tailModel[14].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -0.49999F, -0.49999F, 0.49999F, -0.49999F, -0.9999F, 0.49999F, -0.49999F, 0F, 0F, -0.49999F, 0F, 0F, 0F, 0F, 0.49999F, -0.49999F, -0.9999F, 0.49999F, -0.49999F, 0F, 0F, 0F, 0F); // Box 44
		tailModel[14].setRotationPoint(84F, -37F, -2F);

		tailModel[15].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, -1.49999F, 0.49999F, -0.49999F, -0.9999F, 0.49999F, -0.49999F, 0F, 0F, 0F, 0F, 0F, -0.49999F, -0.49999F, 0.49999F, -0.49999F, -0.9999F, 0.49999F, -0.49999F, 0F, 0F, -0.49999F, 0F); // Box 45
		tailModel[15].setRotationPoint(84F, -37F, -2F);

		tailModel[16].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0.49999F, 0.49999F, -2.49999F, -0.9999F, 0.49999F, -2.49999F, 0F, 0F, 0F, 0F, 0F, 0.49999F, 0.49999F, 0.49999F, 1.49999F, -0.9999F, 0.49999F, 1.49999F, 0F, 0F, 0.49999F, 0F); // Box 46
		tailModel[16].setRotationPoint(84F, -26F, -2F);

		tailModel[17].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -1.49999F, 0.49999F, 0.49999F, -2.49999F, -0.9999F, 0.49999F, -2.49999F, 0F, 0F, -1.49999F, 0F, 0F, 1.9999F, -0.9999F, 0.49999F, 1.49999F, -0.9999F, 0.49999F, 1.49999F, 0F, 0F, 1.9999F, 0F); // Box 47
		tailModel[17].setRotationPoint(84F, -26F, -2F);

		tailModel[18].addShapeBox(0F, 0F, 0F, 16, 1, 33, 0F,-11.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		tailModel[18].setRotationPoint(68F, -34F, -35F);

		tailModel[19].addShapeBox(0F, 0F, 0F, 23, 27, 1, 0F,-21F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -20F, -1F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 123
		tailModel[19].setRotationPoint(65.5F, -62.5F, -1F);

		tailModel[20].addShapeBox(0F, 0F, 0F, 28, 8, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 140
		tailModel[20].setRotationPoint(25F, -34F, 0F);

		tailModel[21].addShapeBox(0F, 0F, 0F, 28, 4, 9, 0F,0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -2.5F, 0F, 0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 141
		tailModel[21].setRotationPoint(25F, -38F, 0F);

		tailModel[22].addShapeBox(0F, 0F, 0F, 28, 4, 7, 0F,0F, -0.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, -2.5F, 0F, -0.5F, -1.5F, 0F, 0.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, -0.5F, 0F, 0.5F, 0.5F); // Box 142
		tailModel[22].setRotationPoint(25F, -43F, 0F);

		tailModel[23].addShapeBox(0F, 0F, 0F, 31, 8, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, 0F); // Box 146
		tailModel[23].setRotationPoint(53F, -34F, 0F);

		tailModel[24].addShapeBox(0F, 0F, 0F, 31, 3, 7, 0F,0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, -5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, 0F); // Box 147
		tailModel[24].setRotationPoint(53F, -37F, 0F);

		tailModel[25].addShapeBox(0F, 0F, 0F, 31, 3, 6, 0F,0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, -4.5F, 0F, 0.5F, -1.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -3.9999F, 0F, -0.5F, 0.5F); // Box 148
		tailModel[25].setRotationPoint(53F, -39F, 0F);

		tailModel[26].addShapeBox(0F, 0F, 0F, 31, 1, 4, 0F,0F, 1F, 0F, 0F, -4F, 0F, 0F, -4F, -3.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, 0F, 0F, 3.5F, 0F, 0F, 3.5F, -2.5F, 0F, 0.5F, 0.5F); // Box 149
		tailModel[26].setRotationPoint(53F, -41F, 0F);

		tailModel[27].addShapeBox(0F, 0F, 0F, 28, 2, 5, 0F,0F, 2F, 0F, 0F, -3F, 0F, 0F, -3.5F, -2.5F, 0F, 1.5F, -2F, 0F, 0.5F, 0F, 0F, 3.5F, 0F, 0F, 3.5F, -0.5F, 0F, 0.5F, 0.5F); // Box 150
		tailModel[27].setRotationPoint(25F, -45F, 0F);

		tailModel[28].addShapeBox(0F, 0F, 0F, 28, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -3F, 0F, 0F, -1F); // Box 152
		tailModel[28].setRotationPoint(25F, -26F, 0F);

		tailModel[29].addShapeBox(0F, 0F, 0F, 28, 3, 8, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, -4F, 0F, 0F, -3F); // Box 153
		tailModel[29].setRotationPoint(25F, -22F, 0F);

		tailModel[30].addShapeBox(0F, 0F, 0F, 31, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -4.5F, 0F, 0F, -1F); // Box 156
		tailModel[30].setRotationPoint(53F, -26F, 0F);

		tailModel[31].addShapeBox(0F, 0F, 0F, 31, 2, 6, 0F,0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, -3.5F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -2F, 0F, 0F, -2F, -5F, 0F, 0F, -2F); // Box 157
		tailModel[31].setRotationPoint(53F, -23F, 0F);

		tailModel[32].addShapeBox(0F, 0F, 0F, 4, 8, 2, 0F,0F, 0F, 0F, 0.5F, 2.5F, 0F, 0.5F, 2.5F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 2.5F, 0F, 0.5F, 2.5F, -1F, 0F, 0F, 0.5F); // Box 166
		tailModel[32].setRotationPoint(84F, -34F, 0F);

		tailModel[33].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0.49999F, 0.49999F, 0F, 0.49999F, 0.49999F, -0.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0.49999F, -2.49999F, 0F, 0.49999F, -2.49999F, -0.9999F, 0F, 0F, 0.49999F); // Box 167
		tailModel[33].setRotationPoint(84F, -36F, 0F);

		tailModel[34].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -0.49999F, 0F, 0.49999F, -0.49999F, 0F, 0.49999F, -0.49999F, -0.9999F, 0F, -0.49999F, -0.49999F, 0F, 0F, 0F, 0.49999F, -0.49999F, 0F, 0.49999F, -0.49999F, -0.9999F, 0F, 0F, 0F); // Box 168
		tailModel[34].setRotationPoint(84F, -37F, 0F);

		tailModel[35].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0.49999F, -0.49999F, 0F, 0.49999F, -0.49999F, -0.9999F, 0F, 0F, -1.49999F, 0F, -0.49999F, 0F, 0.49999F, -0.49999F, 0F, 0.49999F, -0.49999F, -0.9999F, 0F, -0.49999F, -0.49999F); // Box 169
		tailModel[35].setRotationPoint(84F, -37F, 0F);

		tailModel[36].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0.49999F, -2.49999F, 0F, 0.49999F, -2.49999F, -0.9999F, 0F, 0F, 0.49999F, 0F, 0.49999F, 0F, 0.49999F, 1.49999F, 0F, 0.49999F, 1.49999F, -0.9999F, 0F, 0.49999F, 0.49999F); // Box 170
		tailModel[36].setRotationPoint(84F, -26F, 0F);

		tailModel[37].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -1.49999F, 0F, 0.49999F, -2.49999F, 0F, 0.49999F, -2.49999F, -0.9999F, 0F, -1.49999F, 0.49999F, 0F, 1.9999F, 0F, 0.49999F, 1.49999F, 0F, 0.49999F, 1.49999F, -0.9999F, 0F, 1.9999F, -0.9999F); // Box 171
		tailModel[37].setRotationPoint(84F, -26F, 0F);

		tailModel[38].addShapeBox(0F, 0F, 0F, 16, 1, 33, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11.5F, 0F, 0F); // Box 216
		tailModel[38].setRotationPoint(68F, -34F, 2F);

		tailModel[39].addShapeBox(0F, 0F, 0F, 23, 27, 1, 0F,-20F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -21F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F); // Box 247
		tailModel[39].setRotationPoint(65.5F, -62.5F, 0F);

		tailModel[40].addShapeBox(0F, 0F, 0F, 72, 1, 1, 0F,0F, -15.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -15.25F, -0.25F, 0F, 14.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 14.75F, -0.25F); // Box 557
		tailModel[40].setRotationPoint(17F, -62F, -0.5F);

		tailModel[41].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,1.75F, -0.25F, -0.25F, -2.25F, -0.25F, -0.25F, -2.25F, -0.25F, -0.25F, 1.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Box 579
		tailModel[41].setRotationPoint(17F, -61F, -0.5F);

		tailModel[42].addShapeBox(0F, 0F, 0F, 74, 1, 1, 0F,0F, -1.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -1.25F, -0.25F, 0F, 0.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.75F, -0.25F); // Box 550
		tailModel[42].setRotationPoint(14F, -62F, -0.5F);
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 529, 41, textureX, textureY); // Box 75
		leftWingModel[1] = new ModelRendererTurbo(this, 593, 41, textureX, textureY); // Box 76
		leftWingModel[2] = new ModelRendererTurbo(this, 673, 41, textureX, textureY); // Box 77
		leftWingModel[3] = new ModelRendererTurbo(this, 625, 41, textureX, textureY); // Box 78
		leftWingModel[4] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 79
		leftWingModel[5] = new ModelRendererTurbo(this, 753, 41, textureX, textureY); // Box 81
		leftWingModel[6] = new ModelRendererTurbo(this, 793, 41, textureX, textureY); // Box 82
		leftWingModel[7] = new ModelRendererTurbo(this, 577, 41, textureX, textureY); // Box 83
		leftWingModel[8] = new ModelRendererTurbo(this, 833, 41, textureX, textureY); // Box 84
		leftWingModel[9] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 85
		leftWingModel[10] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 86

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 18, 8, 10, 0F,0F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 75
		leftWingModel[0].setRotationPoint(-32F, -25F, -17F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 28, 8, 10, 0F,0.5F, 0F, 0F, -5.5F, -5F, 0F, 5.5F, -4.5F, -0.5F, -5F, 0F, -2F, 0.5F, 0F, 0F, -5.5F, -2F, 0F, 5.5F, -3F, 0.5F, -5F, 0.5F, 0.5F); // Box 76
		leftWingModel[1].setRotationPoint(-19F, -25F, -17F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 13, 8, 10, 0F,-1F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2.5F, -1.5F, -1F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, -1F, 0.5F); // Box 77
		leftWingModel[2].setRotationPoint(-45F, -25F, -17F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 13, 8, 101, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -6F, 0F, 0F, -6F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, -0.5F, 6F, 0F, 0F, 6F, 0F); // Box 78
		leftWingModel[3].setRotationPoint(-32F, -31F, -118F);

		leftWingModel[4].addShapeBox(0F, 0F, 0F, 12, 8, 101, 0F,-7.5F, -1F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -8.5F, 0F, -7.5F, -6F, 0F, 0F, -5.5F, 0F, 0F, 6F, 0F, 0F, 3.5F, 0F); // Box 79
		leftWingModel[4].setRotationPoint(-44F, -31F, -118F);

		leftWingModel[5].addShapeBox(0F, 0F, 0F, 13, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 81
		leftWingModel[5].setRotationPoint(-32F, -31F, -124F);

		leftWingModel[6].addShapeBox(0F, 0F, 0F, 13, 2, 6, 0F,-4F, -0.5F, 0.5F, -3F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -1F, 0.5F, -3F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		leftWingModel[6].setRotationPoint(-32F, -31F, -130F);

		leftWingModel[7].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F); // Box 83
		leftWingModel[7].setRotationPoint(-36F, -31F, -124F);

		leftWingModel[8].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F,-3F, -0.5F, -1F, 4F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, -3F, -1F, -1F, 4F, -1F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 84
		leftWingModel[8].setRotationPoint(-36F, -31F, -130F);

		leftWingModel[9].addShapeBox(0F, 0F, 0F, 8, 2, 6, 0F,0F, 0F, 0F, -2.5F, -0.5F, 0F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F); // Box 85
		leftWingModel[9].setRotationPoint(-19F, -31F, -124F);

		leftWingModel[10].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F,3F, -0.5F, 0.5F, -3.5F, -0.5F, -1.5F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 3F, -1F, 0.5F, -3.5F, -1F, -1.5F, 0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 86
		leftWingModel[10].setRotationPoint(-19F, -31F, -130F);
	}

	private void initrightWingModel_1()
	{
		rightWingModel[0] = new ModelRendererTurbo(this, 81, 121, textureX, textureY); // Box 199
		rightWingModel[1] = new ModelRendererTurbo(this, 281, 121, textureX, textureY); // Box 200
		rightWingModel[2] = new ModelRendererTurbo(this, 361, 121, textureX, textureY); // Box 201
		rightWingModel[3] = new ModelRendererTurbo(this, 753, 121, textureX, textureY); // Box 202
		rightWingModel[4] = new ModelRendererTurbo(this, 457, 129, textureX, textureY); // Box 203
		rightWingModel[5] = new ModelRendererTurbo(this, 457, 121, textureX, textureY); // Box 205
		rightWingModel[6] = new ModelRendererTurbo(this, 753, 121, textureX, textureY); // Box 206
		rightWingModel[7] = new ModelRendererTurbo(this, 985, 73, textureX, textureY); // Box 207
		rightWingModel[8] = new ModelRendererTurbo(this, 177, 81, textureX, textureY); // Box 208
		rightWingModel[9] = new ModelRendererTurbo(this, 169, 121, textureX, textureY); // Box 209
		rightWingModel[10] = new ModelRendererTurbo(this, 401, 121, textureX, textureY); // Box 210

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 18, 8, 10, 0F,0F, 0F, -2F, 0F, 0F, -2F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, -5.5F, 0F, 0F, 0F, 0F, 0F); // Box 199
		rightWingModel[0].setRotationPoint(-32F, -25F, 7F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 28, 8, 10, 0F,-5F, 0F, -2F, 5.5F, -4.5F, -0.5F, -5.5F, -5F, 0F, 0.5F, 0F, 0F, -5F, 0.5F, 0.5F, 5.5F, -3F, 0.5F, -5.5F, -2F, 0F, 0.5F, 0F, 0F); // Box 200
		rightWingModel[1].setRotationPoint(-19F, -25F, 7F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 13, 8, 10, 0F,0F, -2.5F, -1.5F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, -2.5F, 0F, 0F, -1F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, -1F, -2.5F, 0F); // Box 201
		rightWingModel[2].setRotationPoint(-45F, -25F, 7F);

		rightWingModel[3].addShapeBox(0F, 0F, 0F, 13, 8, 101, 0F,0F, -6F, 0F, -0.5F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, -0.5F, 6F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F); // Box 202
		rightWingModel[3].setRotationPoint(-32F, -31F, 17F);

		rightWingModel[4].addShapeBox(0F, 0F, 0F, 12, 8, 101, 0F,0F, -8.5F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, -7.5F, -1F, 0F, 0F, 3.5F, 0F, 0F, 6F, 0F, 0F, -5.5F, 0F, -7.5F, -6F, 0F); // Box 203
		rightWingModel[4].setRotationPoint(-44F, -31F, 17F);

		rightWingModel[5].addShapeBox(0F, 0F, 0F, 13, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		rightWingModel[5].setRotationPoint(-32F, -31F, 118F);

		rightWingModel[6].addShapeBox(0F, 0F, 0F, 13, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, -0.5F, 0.5F, -4F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0.5F, -4F, -1F, 0.5F); // Box 206
		rightWingModel[6].setRotationPoint(-32F, -31F, 124F);

		rightWingModel[7].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F,0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 207
		rightWingModel[7].setRotationPoint(-36F, -31F, 118F);

		rightWingModel[8].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 4F, -0.5F, 0.5F, -3F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 4F, -1F, 0.5F, -3F, -1F, -1F); // Box 208
		rightWingModel[8].setRotationPoint(-36F, -31F, 124F);

		rightWingModel[9].addShapeBox(0F, 0F, 0F, 8, 2, 6, 0F,0F, 0F, 0F, 0.5F, -1F, 0F, -2.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, -2.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 209
		rightWingModel[9].setRotationPoint(-19F, -31F, 118F);

		rightWingModel[10].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F,0F, 0F, 0F, 0.5F, -0.5F, 0F, -3.5F, -0.5F, -1.5F, 3F, -0.5F, 0.5F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, -3.5F, -1F, -1.5F, 3F, -1F, 0.5F); // Box 210
		rightWingModel[10].setRotationPoint(-19F, -31F, 124F);
	}

	private void inityawFlapModel_1()
	{
		yawFlapModel[0] = new ModelRendererTurbo(this, 985, 49, textureX, textureY); // Box 114
		yawFlapModel[1] = new ModelRendererTurbo(this, 393, 57, textureX, textureY); // Box 115
		yawFlapModel[2] = new ModelRendererTurbo(this, 457, 57, textureX, textureY); // Box 116
		yawFlapModel[3] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Box 117
		yawFlapModel[4] = new ModelRendererTurbo(this, 753, 57, textureX, textureY); // Box 118
		yawFlapModel[5] = new ModelRendererTurbo(this, 793, 57, textureX, textureY); // Box 119
		yawFlapModel[6] = new ModelRendererTurbo(this, 825, 57, textureX, textureY); // Box 120
		yawFlapModel[7] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 121
		yawFlapModel[8] = new ModelRendererTurbo(this, 881, 57, textureX, textureY); // Box 122
		yawFlapModel[9] = new ModelRendererTurbo(this, 961, 89, textureX, textureY); // Box 238
		yawFlapModel[10] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 239
		yawFlapModel[11] = new ModelRendererTurbo(this, 169, 113, textureX, textureY); // Box 240
		yawFlapModel[12] = new ModelRendererTurbo(this, 225, 129, textureX, textureY); // Box 241
		yawFlapModel[13] = new ModelRendererTurbo(this, 641, 129, textureX, textureY); // Box 242
		yawFlapModel[14] = new ModelRendererTurbo(this, 681, 129, textureX, textureY); // Box 243
		yawFlapModel[15] = new ModelRendererTurbo(this, 529, 129, textureX, textureY); // Box 244
		yawFlapModel[16] = new ModelRendererTurbo(this, 681, 81, textureX, textureY); // Box 245
		yawFlapModel[17] = new ModelRendererTurbo(this, 793, 89, textureX, textureY); // Box 246

		yawFlapModel[0].addShapeBox(0F, 0F, -1F, 15, 5, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 114
		yawFlapModel[0].setRotationPoint(88.5F, -36.5F, 0F);

		yawFlapModel[1].addShapeBox(0F, 0F, -1F, 14, 3, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 115
		yawFlapModel[1].setRotationPoint(88.5F, -31.5F, 0F);

		yawFlapModel[2].addShapeBox(0F, 0F, -1F, 13, 5, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -2F, -3F, 0F, 0F, 0F, 0F); // Box 116
		yawFlapModel[2].setRotationPoint(88.5F, -28.5F, 0F);

		yawFlapModel[3].addShapeBox(0F, 0F, -1F, 15, 3, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		yawFlapModel[3].setRotationPoint(88.5F, -39.5F, 0F);

		yawFlapModel[4].addShapeBox(0F, 0F, -1F, 15, 6, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		yawFlapModel[4].setRotationPoint(88.5F, -45.5F, 0F);

		yawFlapModel[5].addShapeBox(0F, 0F, -1F, 14, 8, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		yawFlapModel[5].setRotationPoint(88.5F, -53.5F, 0F);

		yawFlapModel[6].addShapeBox(0F, 0F, -1F, 12, 5, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		yawFlapModel[6].setRotationPoint(88.5F, -58.5F, 0F);

		yawFlapModel[7].addShapeBox(0F, 0F, -1F, 10, 2, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		yawFlapModel[7].setRotationPoint(88.5F, -60.5F, 0F);

		yawFlapModel[8].addShapeBox(0F, 0F, -1F, 8, 2, 1, 0F,0F, -1F, 0F, -5F, -1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		yawFlapModel[8].setRotationPoint(88.5F, -62.5F, 0F);

		yawFlapModel[9].addShapeBox(0F, 0F, 0F, 15, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 238
		yawFlapModel[9].setRotationPoint(88.5F, -36.5F, 0F);

		yawFlapModel[10].addShapeBox(0F, 0F, 0F, 14, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 239
		yawFlapModel[10].setRotationPoint(88.5F, -31.5F, 0F);

		yawFlapModel[11].addShapeBox(0F, 0F, 0F, 13, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, -3F, -3F, 0F, 0F, 0F, 0F); // Box 240
		yawFlapModel[11].setRotationPoint(88.5F, -28.5F, 0F);

		yawFlapModel[12].addShapeBox(0F, 0F, 0F, 15, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 241
		yawFlapModel[12].setRotationPoint(88.5F, -39.5F, 0F);

		yawFlapModel[13].addShapeBox(0F, 0F, 0F, 15, 6, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 242
		yawFlapModel[13].setRotationPoint(88.5F, -45.5F, 0F);

		yawFlapModel[14].addShapeBox(0F, 0F, 0F, 14, 8, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 243
		yawFlapModel[14].setRotationPoint(88.5F, -53.5F, 0F);

		yawFlapModel[15].addShapeBox(0F, 0F, 0F, 12, 5, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 244
		yawFlapModel[15].setRotationPoint(88.5F, -58.5F, 0F);

		yawFlapModel[16].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 245
		yawFlapModel[16].setRotationPoint(88.5F, -60.5F, 0F);

		yawFlapModel[17].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, 0F, 0F, -4F, 0F, 0F, -5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 246
		yawFlapModel[17].setRotationPoint(88.5F, -62.5F, 0F);
	}

	private void initpitchFlapLeftModel_1()
	{
		pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 825, 49, textureX, textureY); // Box 91
		pitchFlapLeftModel[1] = new ModelRendererTurbo(this, 881, 49, textureX, textureY); // Box 93
		pitchFlapLeftModel[2] = new ModelRendererTurbo(this, 945, 1, textureX, textureY); // Box 94

		pitchFlapLeftModel[0].addShapeBox(0F, 0F, 0F, 8, 1, 33, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F); // Box 91
		pitchFlapLeftModel[0].setRotationPoint(84F, -34F, -35F);

		pitchFlapLeftModel[1].addShapeBox(0F, 0F, 0F, 11, 1, 5, 0F,-2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 93
		pitchFlapLeftModel[1].setRotationPoint(80F, -34F, -40F);

		pitchFlapLeftModel[2].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,-1.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 94
		pitchFlapLeftModel[2].setRotationPoint(82F, -34F, -41F);
	}

	private void initpitchFlapRightModel_1()
	{
		pitchFlapRightModel[0] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 215
		pitchFlapRightModel[1] = new ModelRendererTurbo(this, 281, 81, textureX, textureY); // Box 217
		pitchFlapRightModel[2] = new ModelRendererTurbo(this, 921, 33, textureX, textureY); // Box 218

		pitchFlapRightModel[0].addShapeBox(0F, 0F, 0F, 8, 1, 33, 0F,0F, 0F, 0F, 0F, 0F, -7F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 215
		pitchFlapRightModel[0].setRotationPoint(84F, -34F, 2F);

		pitchFlapRightModel[1].addShapeBox(0F, 0F, 0F, 11, 1, 5, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2F, 0F, 0F); // Box 217
		pitchFlapRightModel[1].setRotationPoint(80F, -34F, 35F);

		pitchFlapRightModel[2].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0.5F); // Box 218
		pitchFlapRightModel[2].setRotationPoint(82F, -34F, 40F);
	}

	private void initpitchFlapLeftWingModel_1()
	{
		pitchFlapLeftWingModel[0] = new ModelRendererTurbo(this, 329, 57, textureX, textureY); // Box 80

		pitchFlapLeftWingModel[0].addShapeBox(0F, 0F, 0F, 13, 8, 101, 0F,0F, 0F, 0F, -4.5F, -1F, 0F, 9.5F, -11F, 0F, 0.5F, -6F, 0F, 0F, -5.5F, 0F, -4.5F, -6F, 0F, 9.5F, 4F, 0F, 0.5F, 6F, 0F); // Box 80
		pitchFlapLeftWingModel[0].setRotationPoint(-19F, -31F, -118F);
	}

	private void initpitchFlapRightWingModel_1()
	{
		pitchFlapRightWingModel[0] = new ModelRendererTurbo(this, 585, 153, textureX, textureY); // Box 204

		pitchFlapRightWingModel[0].addShapeBox(0F, 0F, 0F, 13, 8, 101, 0F,0.5F, -6F, 0F, 9.5F, -11F, 0F, -4.5F, -1F, 0F, 0F, 0F, 0F, 0.5F, 6F, 0F, 9.5F, 4F, 0F, -4.5F, -6F, 0F, 0F, -5.5F, 0F); // Box 204
		pitchFlapRightWingModel[0].setRotationPoint(-19F, -31F, 17F);
	}

	private void inittailWheelModel_1()
	{
		tailWheelModel[0] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Import TW_6
		tailWheelModel[1] = new ModelRendererTurbo(this, 921, 137, textureX, textureY); // Box 202
		tailWheelModel[2] = new ModelRendererTurbo(this, 425, 41, textureX, textureY); // Import TW_1
		tailWheelModel[3] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Import TW_2
		tailWheelModel[4] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Import TW_3
		tailWheelModel[5] = new ModelRendererTurbo(this, 457, 41, textureX, textureY); // Import TW_4
		tailWheelModel[6] = new ModelRendererTurbo(this, 481, 41, textureX, textureY); // Import TW_5

		tailWheelModel[0].addShapeBox(0F, -4F, 0F, 12, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Import TW_6
		tailWheelModel[0].setRotationPoint(69F, -19.5F, -2F);
		tailWheelModel[0].rotateAngleZ = 0.13962634F;

		tailWheelModel[1].addShapeBox(0F, -4F, 0F, 12, 4, 1, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		tailWheelModel[1].setRotationPoint(69F, -19.5F, 1F);
		tailWheelModel[1].rotateAngleZ = 0.13962634F;

		tailWheelModel[2].addBox(0F, 0F, 0F, 5, 3, 1, 0F); // Import TW_1
		tailWheelModel[2].setRotationPoint(78F, -17F, -0.5F);

		tailWheelModel[3].addShapeBox(0F, 0F, 0F, 1, 6, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -3F, 0F, -0.25F, 3F, 0F, -0.25F, 3F, 0F, -0.25F, -3F, 0F, -0.25F); // Import TW_2
		tailWheelModel[3].setRotationPoint(77F, -21F, -1F);

		tailWheelModel[4].addShapeBox(0F, -4F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import TW_3
		tailWheelModel[4].setRotationPoint(77F, -21F, -1F);

		tailWheelModel[5].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import TW_4
		tailWheelModel[5].setRotationPoint(78F, -18F, -0.5F);

		tailWheelModel[6].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import TW_5
		tailWheelModel[6].setRotationPoint(78F, -14F, -0.5F);
	}

	private void initleftWingWheelModel_1()
	{
		leftWingWheelModel[0] = new ModelRendererTurbo(this, 137, 137, textureX, textureY); // Import LWW_03
		leftWingWheelModel[1] = new ModelRendererTurbo(this, 225, 137, textureX, textureY); // Import LWW_04
		leftWingWheelModel[2] = new ModelRendererTurbo(this, 521, 137, textureX, textureY); // Import LWW_05
		leftWingWheelModel[3] = new ModelRendererTurbo(this, 713, 41, textureX, textureY); // Import LWW_07
		leftWingWheelModel[4] = new ModelRendererTurbo(this, 985, 33, textureX, textureY); // Import LWW_08
		leftWingWheelModel[5] = new ModelRendererTurbo(this, 713, 121, textureX, textureY); // Import LWW_09
		leftWingWheelModel[6] = new ModelRendererTurbo(this, 385, 49, textureX, textureY); // Import LWW_11
		leftWingWheelModel[7] = new ModelRendererTurbo(this, 265, 129, textureX, textureY); // Import LWW_12
		leftWingWheelModel[8] = new ModelRendererTurbo(this, 417, 97, textureX, textureY); // Import LWW_13
		leftWingWheelModel[9] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Import LWW_06

		leftWingWheelModel[0].addShapeBox(0F, 0F, 0F, 14, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import LWW_03
		leftWingWheelModel[0].setRotationPoint(-47F, 6F, -38F);

		leftWingWheelModel[1].addBox(0F, 0F, 0F, 14, 6, 4, 0F); // Import LWW_04
		leftWingWheelModel[1].setRotationPoint(-47F, 0F, -38F);

		leftWingWheelModel[2].addShapeBox(0F, 0F, 0F, 14, 4, 4, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LWW_05
		leftWingWheelModel[2].setRotationPoint(-47F, -4F, -38F);

		leftWingWheelModel[3].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F,-1.66666667F, 0F, 0F, 1.66666667F, 0F, 0F, 1.66666667F, 0F, 0F, -1.66666667F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LWW_07
		leftWingWheelModel[3].setRotationPoint(-41F, -4F, -34F);

		leftWingWheelModel[4].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,-2.08333333F, -2F, 0F, 2.08333333F, -2F, 0F, 2.29166667F, -1F, 0F, -2.29166667F, -1F, 0F, -1.66666667F, 0F, -3F, 1.66666667F, 0F, -3F, 1.66666667F, 0F, 2F, -1.66666667F, 0F, 2F); // Import LWW_08
		leftWingWheelModel[4].setRotationPoint(-41F, -8F, -37F);

		leftWingWheelModel[5].addShapeBox(0F, 0F, 0F, 2, 17, 2, 0F,-6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, -2.08333333F, 0F, 0F, 2.08333333F, 0F, 0F, 2.08333333F, 0F, 0F, -2.08333333F, 0F, 0F); // Import LWW_09
		leftWingWheelModel[5].setRotationPoint(-41F, -23F, -37F);

		leftWingWheelModel[6].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LWW_11
		leftWingWheelModel[6].setRotationPoint(-38.5F, -11F, -39.5F);

		leftWingWheelModel[7].addShapeBox(0F, 0F, 0F, 4, 17, 1, 0F,-5F, 0F, 1.04347826F, 5F, 0F, 1.04347826F, 5F, 0F, -1.64347826F, -5F, 0F, -1.64347826F, -1F, -2F, 4F, 6F, 0F, 4F, 6F, 0F, -4.6F, -1F, -2F, -4.6F); // Import LWW_12
		leftWingWheelModel[7].setRotationPoint(-43F, -14F, -37.5F);

		leftWingWheelModel[8].addShapeBox(0F, 0F, 0F, 4, 9, 1, 0F,-6F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, -0.6F, -6F, 0F, -0.6F, -3F, 0F, 1.04347826F, 3F, 0F, 1.04347826F, 3F, 0F, -1.64347826F, -3F, 0F, -1.64347826F); // Import LWW_13
		leftWingWheelModel[8].setRotationPoint(-41F, -23F, -37.5F);

		leftWingWheelModel[9].addBox(0F, 0F, 0F, 2, 2, 5, 0F); // Import LWW_06
		leftWingWheelModel[9].setRotationPoint(-41F, 2F, -38.5F);
	}

	private void initrightWingWheelModel_1()
	{
		rightWingWheelModel[0] = new ModelRendererTurbo(this, 881, 137, textureX, textureY); // Box 258
		rightWingWheelModel[1] = new ModelRendererTurbo(this, 57, 145, textureX, textureY); // Box 259
		rightWingWheelModel[2] = new ModelRendererTurbo(this, 329, 145, textureX, textureY); // Box 260
		rightWingWheelModel[3] = new ModelRendererTurbo(this, 1017, 57, textureX, textureY); // Box 261
		rightWingWheelModel[4] = new ModelRendererTurbo(this, 161, 41, textureX, textureY); // Box 262
		rightWingWheelModel[5] = new ModelRendererTurbo(this, 993, 129, textureX, textureY); // Box 263
		rightWingWheelModel[6] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 264
		rightWingWheelModel[7] = new ModelRendererTurbo(this, 1009, 129, textureX, textureY); // Box 265
		rightWingWheelModel[8] = new ModelRendererTurbo(this, 657, 113, textureX, textureY); // Box 266
		rightWingWheelModel[9] = new ModelRendererTurbo(this, 609, 65, textureX, textureY); // Box 267

		rightWingWheelModel[0].addShapeBox(0F, 0F, 0F, 14, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 258
		rightWingWheelModel[0].setRotationPoint(-47F, 6F, 34F);

		rightWingWheelModel[1].addBox(0F, 0F, 0F, 14, 6, 4, 0F); // Box 259
		rightWingWheelModel[1].setRotationPoint(-47F, 0F, 34F);

		rightWingWheelModel[2].addShapeBox(0F, 0F, 0F, 14, 4, 4, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
		rightWingWheelModel[2].setRotationPoint(-47F, -4F, 34F);

		rightWingWheelModel[3].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F,-1.66666667F, 0F, 0F, 1.66666667F, 0F, 0F, 1.66666667F, 0F, 0F, -1.66666667F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 261
		rightWingWheelModel[3].setRotationPoint(-41F, -4F, 33F);

		rightWingWheelModel[4].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,-2.29166667F, -1F, 0F, 2.29166667F, -1F, 0F, 2.08333333F, -2F, 0F, -2.08333333F, -2F, 0F, -1.66666667F, 0F, 2F, 1.66666667F, 0F, 2F, 1.66666667F, 0F, -3F, -1.66666667F, 0F, -3F); // Box 262
		rightWingWheelModel[4].setRotationPoint(-41F, -8F, 35F);

		rightWingWheelModel[5].addShapeBox(0F, 0F, 0F, 2, 17, 2, 0F,-6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, -2.08333333F, 0F, 0F, 2.08333333F, 0F, 0F, 2.08333333F, 0F, 0F, -2.08333333F, 0F, 0F); // Box 263
		rightWingWheelModel[5].setRotationPoint(-41F, -23F, 35F);

		rightWingWheelModel[6].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 264
		rightWingWheelModel[6].setRotationPoint(-38.5F, -11F, 34.5F);

		rightWingWheelModel[7].addShapeBox(0F, 0F, 0F, 4, 17, 1, 0F,-5F, 0F, -1.64347826F, 5F, 0F, -1.64347826F, 5F, 0F, 1.04347826F, -5F, 0F, 1.04347826F, -1F, -2F, -4.6F, 6F, 0F, -4.6F, 6F, 0F, 4F, -1F, -2F, 4F); // Box 265
		rightWingWheelModel[7].setRotationPoint(-43F, -14F, 36.5F);

		rightWingWheelModel[8].addShapeBox(0F, 0F, 0F, 4, 9, 1, 0F,-6F, 0F, -0.6F, 5F, 0F, -0.6F, 5F, 0F, 0F, -6F, 0F, 0F, -3F, 0F, -1.64347826F, 3F, 0F, -1.64347826F, 3F, 0F, 1.04347826F, -3F, 0F, 1.04347826F); // Box 266
		rightWingWheelModel[8].setRotationPoint(-41F, -23F, 36.5F);

		rightWingWheelModel[9].addBox(0F, 0F, 0F, 2, 2, 5, 0F); // Box 267
		rightWingWheelModel[9].setRotationPoint(-41F, 2F, 33.5F);
	}

	private void initPropeller()
	{
		propellerModels = new ModelRendererTurbo[1][3];
		propellerModels[0] = makeProp1(-88F, -31F, 0F);
	}

	private ModelRendererTurbo[] makeProp1(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[3];
		prop[0] = new ModelRendererTurbo(this, 0, 180, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 180, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 0, 180, textureX, textureY);
		prop[0].addBox(-1F, -32F, -2F, 2, 32, 4, 0.0F);
		prop[1].addBox(-1F, -32F, -2F, 2, 32, 4, 0.0F);
		prop[2].addBox(-1F, -32F, -2F, 2, 32, 4, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		return prop;
	}
}