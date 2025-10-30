//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: D4Y2
// Model Creator: 
// Created on: 18.05.2023 - 20:36:24
// Last changed on: 18.05.2023 - 20:36:24

package com.flansmod.client.model.Taskball; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelD4Y2 extends ModelPlane //Same as Filename
{
	int textureX = 1024;
	int textureY = 512;

	public ModelD4Y2() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[189];
		noseModel = new ModelRendererTurbo[38];
		tailModel = new ModelRendererTurbo[30];
		leftWingModel = new ModelRendererTurbo[5];
		rightWingModel = new ModelRendererTurbo[5];
		yawFlapModel = new ModelRendererTurbo[2];
		pitchFlapLeftModel = new ModelRendererTurbo[2];
		pitchFlapRightModel = new ModelRendererTurbo[1];
		pitchFlapLeftWingModel = new ModelRendererTurbo[1];
		tailWheelModel = new ModelRendererTurbo[9];
		leftWingWheelModel = new ModelRendererTurbo[9];
		rightWingWheelModel = new ModelRendererTurbo[9];

		initbodyModel_1();
		initnoseModel_1();
		inittailModel_1();
		initleftWingModel_1();
		initrightWingModel_1();
		inityawFlapModel_1();
		initpitchFlapLeftModel_1();
		initpitchFlapRightModel_1();
		initpitchFlapLeftWingModel_1();
		inittailWheelModel_1();
		initleftWingWheelModel_1();
		initrightWingWheelModel_1();

		initPropeller();

		initGuns();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 673, 1, textureX, textureY); // Box 8
		bodyModel[8] = new ModelRendererTurbo(this, 753, 1, textureX, textureY); // Box 9
		bodyModel[9] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 12
		bodyModel[10] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 13
		bodyModel[11] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 14
		bodyModel[12] = new ModelRendererTurbo(this, 841, 17, textureX, textureY); // Box 16
		bodyModel[13] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 17
		bodyModel[14] = new ModelRendererTurbo(this, 609, 25, textureX, textureY); // Box 30
		bodyModel[15] = new ModelRendererTurbo(this, 377, 41, textureX, textureY); // Box 37
		bodyModel[16] = new ModelRendererTurbo(this, 481, 41, textureX, textureY); // Box 38
		bodyModel[17] = new ModelRendererTurbo(this, 593, 41, textureX, textureY); // Box 39
		bodyModel[18] = new ModelRendererTurbo(this, 641, 41, textureX, textureY); // Box 40
		bodyModel[19] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 48
		bodyModel[20] = new ModelRendererTurbo(this, 817, 1, textureX, textureY); // Box 50
		bodyModel[21] = new ModelRendererTurbo(this, 913, 1, textureX, textureY); // Box 51
		bodyModel[22] = new ModelRendererTurbo(this, 673, 1, textureX, textureY); // Box 52
		bodyModel[23] = new ModelRendererTurbo(this, 1009, 1, textureX, textureY); // Box 53
		bodyModel[24] = new ModelRendererTurbo(this, 833, 1, textureX, textureY); // Box 54
		bodyModel[25] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 55
		bodyModel[26] = new ModelRendererTurbo(this, 1017, 9, textureX, textureY); // Box 56
		bodyModel[27] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 57
		bodyModel[28] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 58
		bodyModel[29] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 59
		bodyModel[30] = new ModelRendererTurbo(this, 929, 1, textureX, textureY); // Box 60
		bodyModel[31] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 61
		bodyModel[32] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 62
		bodyModel[33] = new ModelRendererTurbo(this, 953, 41, textureX, textureY); // Box 63
		bodyModel[34] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 64
		bodyModel[35] = new ModelRendererTurbo(this, 825, 17, textureX, textureY); // Box 65
		bodyModel[36] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 66
		bodyModel[37] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 67
		bodyModel[38] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 68
		bodyModel[39] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 69
		bodyModel[40] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 70
		bodyModel[41] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 71
		bodyModel[42] = new ModelRendererTurbo(this, 841, 17, textureX, textureY); // Box 72
		bodyModel[43] = new ModelRendererTurbo(this, 985, 17, textureX, textureY); // Box 73
		bodyModel[44] = new ModelRendererTurbo(this, 769, 49, textureX, textureY); // Box 74
		bodyModel[45] = new ModelRendererTurbo(this, 993, 33, textureX, textureY); // Import CO_52
		bodyModel[46] = new ModelRendererTurbo(this, 937, 17, textureX, textureY); // Import CO_53
		bodyModel[47] = new ModelRendererTurbo(this, 449, 49, textureX, textureY); // Import CO_54
		bodyModel[48] = new ModelRendererTurbo(this, 889, 41, textureX, textureY); // Import CO_56
		bodyModel[49] = new ModelRendererTurbo(this, 953, 49, textureX, textureY); // Import CO_58
		bodyModel[50] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Import CO_59
		bodyModel[51] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Import CO_60
		bodyModel[52] = new ModelRendererTurbo(this, 313, 57, textureX, textureY); // Box 94
		bodyModel[53] = new ModelRendererTurbo(this, 561, 57, textureX, textureY); // Box 95
		bodyModel[54] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Box 96
		bodyModel[55] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Box 97
		bodyModel[56] = new ModelRendererTurbo(this, 313, 73, textureX, textureY); // Box 98
		bodyModel[57] = new ModelRendererTurbo(this, 561, 73, textureX, textureY); // Box 99
		bodyModel[58] = new ModelRendererTurbo(this, 889, 73, textureX, textureY); // Box 100
		bodyModel[59] = new ModelRendererTurbo(this, 81, 89, textureX, textureY); // Box 102
		bodyModel[60] = new ModelRendererTurbo(this, 313, 97, textureX, textureY); // Box 103
		bodyModel[61] = new ModelRendererTurbo(this, 777, 65, textureX, textureY); // Box 106
		bodyModel[62] = new ModelRendererTurbo(this, 641, 105, textureX, textureY); // Box 107
		bodyModel[63] = new ModelRendererTurbo(this, 889, 113, textureX, textureY); // Box 108
		bodyModel[64] = new ModelRendererTurbo(this, 225, 121, textureX, textureY); // Box 110
		bodyModel[65] = new ModelRendererTurbo(this, 473, 121, textureX, textureY); // Box 111
		bodyModel[66] = new ModelRendererTurbo(this, 761, 89, textureX, textureY); // Box 124
		bodyModel[67] = new ModelRendererTurbo(this, 753, 105, textureX, textureY); // Box 131
		bodyModel[68] = new ModelRendererTurbo(this, 569, 145, textureX, textureY); // Box 132
		bodyModel[69] = new ModelRendererTurbo(this, 225, 97, textureX, textureY); // Box 133
		bodyModel[70] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 134
		bodyModel[71] = new ModelRendererTurbo(this, 905, 49, textureX, textureY); // Box 142
		bodyModel[72] = new ModelRendererTurbo(this, 665, 17, textureX, textureY); // Box 143
		bodyModel[73] = new ModelRendererTurbo(this, 1001, 17, textureX, textureY); // Box 144
		bodyModel[74] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 145
		bodyModel[75] = new ModelRendererTurbo(this, 601, 25, textureX, textureY); // Box 146
		bodyModel[76] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 147
		bodyModel[77] = new ModelRendererTurbo(this, 985, 33, textureX, textureY); // Box 148
		bodyModel[78] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 149
		bodyModel[79] = new ModelRendererTurbo(this, 369, 41, textureX, textureY); // Box 150
		bodyModel[80] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 151
		bodyModel[81] = new ModelRendererTurbo(this, 585, 41, textureX, textureY); // Box 152
		bodyModel[82] = new ModelRendererTurbo(this, 1017, 25, textureX, textureY); // Box 153
		bodyModel[83] = new ModelRendererTurbo(this, 633, 41, textureX, textureY); // Box 154
		bodyModel[84] = new ModelRendererTurbo(this, 641, 25, textureX, textureY); // Box 155
		bodyModel[85] = new ModelRendererTurbo(this, 561, 121, textureX, textureY); // Box 156
		bodyModel[86] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // Box 157
		bodyModel[87] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 158
		bodyModel[88] = new ModelRendererTurbo(this, 841, 25, textureX, textureY); // Box 159
		bodyModel[89] = new ModelRendererTurbo(this, 825, 33, textureX, textureY); // Box 160
		bodyModel[90] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 161
		bodyModel[91] = new ModelRendererTurbo(this, 825, 1, textureX, textureY); // Box 163
		bodyModel[92] = new ModelRendererTurbo(this, 649, 25, textureX, textureY); // Box 164
		bodyModel[93] = new ModelRendererTurbo(this, 945, 17, textureX, textureY); // Box 165
		bodyModel[94] = new ModelRendererTurbo(this, 265, 57, textureX, textureY); // Box 166
		bodyModel[95] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 167
		bodyModel[96] = new ModelRendererTurbo(this, 705, 57, textureX, textureY); // Box 169
		bodyModel[97] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 170
		bodyModel[98] = new ModelRendererTurbo(this, 769, 57, textureX, textureY); // Box 171
		bodyModel[99] = new ModelRendererTurbo(this, 953, 57, textureX, textureY); // Box 173
		bodyModel[100] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Box 175
		bodyModel[101] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Box 176
		bodyModel[102] = new ModelRendererTurbo(this, 265, 65, textureX, textureY); // Box 177
		bodyModel[103] = new ModelRendererTurbo(this, 801, 121, textureX, textureY); // Box 484
		bodyModel[104] = new ModelRendererTurbo(this, 177, 81, textureX, textureY); // Box 485
		bodyModel[105] = new ModelRendererTurbo(this, 257, 81, textureX, textureY); // Box 487
		bodyModel[106] = new ModelRendererTurbo(this, 801, 153, textureX, textureY); // Box 488
		bodyModel[107] = new ModelRendererTurbo(this, 401, 169, textureX, textureY); // Box 489
		bodyModel[108] = new ModelRendererTurbo(this, 417, 169, textureX, textureY); // Box 490
		bodyModel[109] = new ModelRendererTurbo(this, 81, 89, textureX, textureY); // Box 491
		bodyModel[110] = new ModelRendererTurbo(this, 817, 89, textureX, textureY); // Box 492
		bodyModel[111] = new ModelRendererTurbo(this, 441, 169, textureX, textureY); // Box 493
		bodyModel[112] = new ModelRendererTurbo(this, 737, 153, textureX, textureY); // Box 494
		bodyModel[113] = new ModelRendererTurbo(this, 865, 153, textureX, textureY); // Box 495
		bodyModel[114] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Box 496
		bodyModel[115] = new ModelRendererTurbo(this, 977, 57, textureX, textureY); // Box 497
		bodyModel[116] = new ModelRendererTurbo(this, 409, 73, textureX, textureY); // Box 498
		bodyModel[117] = new ModelRendererTurbo(this, 657, 73, textureX, textureY); // Box 499
		bodyModel[118] = new ModelRendererTurbo(this, 977, 97, textureX, textureY); // Box 578
		bodyModel[119] = new ModelRendererTurbo(this, 1001, 97, textureX, textureY); // Box 579
		bodyModel[120] = new ModelRendererTurbo(this, 513, 169, textureX, textureY); // Box 580
		bodyModel[121] = new ModelRendererTurbo(this, 233, 177, textureX, textureY); // Box 582
		bodyModel[122] = new ModelRendererTurbo(this, 473, 105, textureX, textureY); // Box 583
		bodyModel[123] = new ModelRendererTurbo(this, 497, 105, textureX, textureY); // Box 584
		bodyModel[124] = new ModelRendererTurbo(this, 921, 153, textureX, textureY); // Box 585
		bodyModel[125] = new ModelRendererTurbo(this, 137, 113, textureX, textureY); // Box 586
		bodyModel[126] = new ModelRendererTurbo(this, 617, 113, textureX, textureY); // Box 587
		bodyModel[127] = new ModelRendererTurbo(this, 657, 161, textureX, textureY); // Box 588
		bodyModel[128] = new ModelRendererTurbo(this, 185, 89, textureX, textureY); // Box 589
		bodyModel[129] = new ModelRendererTurbo(this, 225, 113, textureX, textureY); // Box 590
		bodyModel[130] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 591
		bodyModel[131] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 592
		bodyModel[132] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 593
		bodyModel[133] = new ModelRendererTurbo(this, 537, 169, textureX, textureY); // Box 594
		bodyModel[134] = new ModelRendererTurbo(this, 729, 41, textureX, textureY); // Box 465
		bodyModel[135] = new ModelRendererTurbo(this, 129, 73, textureX, textureY); // Box 466
		bodyModel[136] = new ModelRendererTurbo(this, 921, 1, textureX, textureY); // Box 467
		bodyModel[137] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 468
		bodyModel[138] = new ModelRendererTurbo(this, 569, 9, textureX, textureY); // Box 469
		bodyModel[139] = new ModelRendererTurbo(this, 745, 9, textureX, textureY); // Box 470
		bodyModel[140] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 471
		bodyModel[141] = new ModelRendererTurbo(this, 609, 25, textureX, textureY); // Box 472
		bodyModel[142] = new ModelRendererTurbo(this, 281, 177, textureX, textureY); // Box 239
		bodyModel[143] = new ModelRendererTurbo(this, 601, 169, textureX, textureY); // Box 240
		bodyModel[144] = new ModelRendererTurbo(this, 81, 121, textureX, textureY); // Box 241
		bodyModel[145] = new ModelRendererTurbo(this, 657, 129, textureX, textureY); // Box 242
		bodyModel[146] = new ModelRendererTurbo(this, 329, 177, textureX, textureY); // Box 243
		bodyModel[147] = new ModelRendererTurbo(this, 353, 177, textureX, textureY); // Box 244
		bodyModel[148] = new ModelRendererTurbo(this, 553, 169, textureX, textureY); // Box 245
		bodyModel[149] = new ModelRendererTurbo(this, 377, 177, textureX, textureY); // Box 246
		bodyModel[150] = new ModelRendererTurbo(this, 201, 161, textureX, textureY); // Box 247
		bodyModel[151] = new ModelRendererTurbo(this, 1017, 161, textureX, textureY); // Box 248
		bodyModel[152] = new ModelRendererTurbo(this, 625, 169, textureX, textureY); // Box 250
		bodyModel[153] = new ModelRendererTurbo(this, 633, 169, textureX, textureY); // Box 251
		bodyModel[154] = new ModelRendererTurbo(this, 801, 129, textureX, textureY); // Box 252
		bodyModel[155] = new ModelRendererTurbo(this, 89, 137, textureX, textureY); // Box 253
		bodyModel[156] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Box 962
		bodyModel[157] = new ModelRendererTurbo(this, 273, 65, textureX, textureY); // Box 964
		bodyModel[158] = new ModelRendererTurbo(this, 721, 65, textureX, textureY); // Box 966
		bodyModel[159] = new ModelRendererTurbo(this, 801, 57, textureX, textureY); // Box 259
		bodyModel[160] = new ModelRendererTurbo(this, 473, 73, textureX, textureY); // Box 260
		bodyModel[161] = new ModelRendererTurbo(this, 969, 177, textureX, textureY); // Box 256
		bodyModel[162] = new ModelRendererTurbo(this, 801, 169, textureX, textureY); // Box 249
		bodyModel[163] = new ModelRendererTurbo(this, 265, 177, textureX, textureY); // Box 254
		bodyModel[164] = new ModelRendererTurbo(this, 665, 81, textureX, textureY); // Box 263
		bodyModel[165] = new ModelRendererTurbo(this, 737, 25, textureX, textureY); // Box 264
		bodyModel[166] = new ModelRendererTurbo(this, 817, 1, textureX, textureY); // Box 265
		bodyModel[167] = new ModelRendererTurbo(this, 913, 1, textureX, textureY); // Box 266
		bodyModel[168] = new ModelRendererTurbo(this, 249, 169, textureX, textureY); // Box 814
		bodyModel[169] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 280
		bodyModel[170] = new ModelRendererTurbo(this, 977, 177, textureX, textureY); // Box 281
		bodyModel[171] = new ModelRendererTurbo(this, 401, 185, textureX, textureY); // Box 282
		bodyModel[172] = new ModelRendererTurbo(this, 41, 185, textureX, textureY); // Box 283
		bodyModel[173] = new ModelRendererTurbo(this, 201, 185, textureX, textureY); // Box 284
		bodyModel[174] = new ModelRendererTurbo(this, 265, 185, textureX, textureY); // Box 285
		bodyModel[175] = new ModelRendererTurbo(this, 457, 185, textureX, textureY); // Box 286
		bodyModel[176] = new ModelRendererTurbo(this, 113, 137, textureX, textureY); // Box 287
		bodyModel[177] = new ModelRendererTurbo(this, 137, 137, textureX, textureY); // Box 288
		bodyModel[178] = new ModelRendererTurbo(this, 161, 137, textureX, textureY); // Box 289
		bodyModel[179] = new ModelRendererTurbo(this, 313, 185, textureX, textureY); // Box 290
		bodyModel[180] = new ModelRendererTurbo(this, 465, 185, textureX, textureY); // Box 291
		bodyModel[181] = new ModelRendererTurbo(this, 489, 185, textureX, textureY); // Box 292
		bodyModel[182] = new ModelRendererTurbo(this, 825, 177, textureX, textureY); // Box 293
		bodyModel[183] = new ModelRendererTurbo(this, 89, 185, textureX, textureY); // Box 294
		bodyModel[184] = new ModelRendererTurbo(this, 473, 145, textureX, textureY); // Box 295
		bodyModel[185] = new ModelRendererTurbo(this, 969, 65, textureX, textureY); // Box 296
		bodyModel[186] = new ModelRendererTurbo(this, 705, 73, textureX, textureY); // Box 297
		bodyModel[187] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 298
		bodyModel[188] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 299

		bodyModel[0].addShapeBox(0F, 0F, 0F, 46, 10, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-38F, -38F, -12F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 46, 8, 4, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[1].setRotationPoint(-38F, -46F, -12F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 12, 8, 4, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[2].setRotationPoint(-50F, -46F, -12F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 12, 10, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[3].setRotationPoint(-50F, -38F, -12F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 38, 10, 12, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[4].setRotationPoint(-88F, -38F, -12F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 38, 8, 12, 0F,0F, -3F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[5].setRotationPoint(-88F, -46F, -12F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 27, 10, 12, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, 0F, 0F, 0F, -8F); // Box 6
		bodyModel[6].setRotationPoint(8F, -38F, -12F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 27, 8, 12, 0F,0F, 0F, -3F, 0F, -3F, -4F, 0F, -3F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -8F); // Box 8
		bodyModel[7].setRotationPoint(8F, -46F, -12F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 27, 4, 9, 0F,0F, -0.9999F, 0F, 0F, 0F, -5.9999F, 0F, 0F, 0F, 0F, -0.9999F, -7.9999F, 0F, -2.9999F, 0F, 0F, 0F, -0.9999F, 0F, 0F, 0F, 0F, -2.9999F, -7.9999F); // Box 9
		bodyModel[8].setRotationPoint(8F, -47F, -9F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 12, 9, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[9].setRotationPoint(-50F, -28F, -12F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 46, 9, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -2F, -4F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[10].setRotationPoint(-38F, -28F, -12F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 27, 7, 12, 0F,0F, 0F, 0F, 0F, 1F, -3F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -3F, -5F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[11].setRotationPoint(8F, -28F, -12F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 38, 9, 12, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 16
		bodyModel[12].setRotationPoint(-88F, -28F, -12F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 38, 3, 9, 0F,0F, -3F, -6F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 17
		bodyModel[13].setRotationPoint(-88F, -49F, -9F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 12, 3, 7, 0F,0F, 0F, -4.9999F, -11.9999F, 0F, -4.9999F, -11.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.9999F, 0F, 0F, -5.9999F); // Box 30
		bodyModel[14].setRotationPoint(-50F, -49F, -9F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 27, 3, 8, 0F,0F, 0F, 0F, 0F, 3F, -1F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -3F, -5F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[15].setRotationPoint(8F, -21F, -8F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 46, 3, 8, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -2F, -5F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[16].setRotationPoint(-38F, -19F, -8F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 12, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[17].setRotationPoint(-50F, -19F, -8F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 38, 3, 8, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 40
		bodyModel[18].setRotationPoint(-88F, -19F, -8F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[19].setRotationPoint(-38F, -53F, -9F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 50
		bodyModel[20].setRotationPoint(-38F, -53F, -5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 51
		bodyModel[21].setRotationPoint(-29F, -53F, -5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[22].setRotationPoint(-29F, -53F, -9F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 53
		bodyModel[23].setRotationPoint(-23F, -53F, -5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[24].setRotationPoint(-23F, -53F, -9F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 55
		bodyModel[25].setRotationPoint(-16F, -53F, -5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[26].setRotationPoint(-16F, -53F, -9F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 57
		bodyModel[27].setRotationPoint(-8F, -53F, -5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[28].setRotationPoint(-8F, -53F, -9F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 59
		bodyModel[29].setRotationPoint(-1F, -52F, -5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[30].setRotationPoint(-1F, -52F, -9F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 61
		bodyModel[31].setRotationPoint(7F, -51F, -5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[32].setRotationPoint(7F, -51F, -9F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 31, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[33].setRotationPoint(-38F, -53F, -5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[34].setRotationPoint(-7F, -53F, -5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[35].setRotationPoint(0F, -52F, -5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F); // Box 66
		bodyModel[36].setRotationPoint(-41F, -53F, -5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -7F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, -3F, 0F, 7F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, -3F); // Box 67
		bodyModel[37].setRotationPoint(-44F, -54F, -4F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F); // Box 68
		bodyModel[38].setRotationPoint(-44F, -54F, -4F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F); // Box 69
		bodyModel[39].setRotationPoint(-48F, -54F, -0.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -3F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, 3F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -3F); // Box 70
		bodyModel[40].setRotationPoint(-50F, -52F, -1F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[41].setRotationPoint(15F, -50F, -7F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 72
		bodyModel[42].setRotationPoint(15F, -50F, -3F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, 2F, 0F, 0F, 0F); // Box 73
		bodyModel[43].setRotationPoint(8F, -51F, -5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F,0F, 0F, 0F, 0F, -3F, -2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -2F, 0F, 3F, 2F, 0F, 0F, 0F); // Box 74
		bodyModel[44].setRotationPoint(16F, -50F, -3F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 13, 1, 2, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import CO_52
		bodyModel[45].setRotationPoint(-81F, -34.5F, -12F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Import CO_53
		bodyModel[46].setRotationPoint(-72.5F, -33.5F, -13F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 13, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import CO_54
		bodyModel[47].setRotationPoint(-81F, -33.5F, -11.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F,-1F, 0F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.2F, -1F, 0F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.2F); // Import CO_56
		bodyModel[48].setRotationPoint(-90F, -33.5F, -11.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 13, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import CO_58
		bodyModel[49].setRotationPoint(-81F, -32.5F, -12F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Import CO_59
		bodyModel[50].setRotationPoint(-76F, -33.5F, -13F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Import CO_60
		bodyModel[51].setRotationPoint(-79.5F, -33.5F, -13F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 46, 10, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		bodyModel[52].setRotationPoint(-38F, -38F, 8F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 46, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[53].setRotationPoint(-38F, -46F, 8F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 12, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[54].setRotationPoint(-50F, -46F, 8F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 12, 10, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[55].setRotationPoint(-50F, -38F, 8F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 38, 10, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 98
		bodyModel[56].setRotationPoint(-88F, -38F, 0F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 38, 8, 12, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 99
		bodyModel[57].setRotationPoint(-88F, -46F, 0F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 27, 10, 12, 0F,0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -1F, 0F, 0F, -1F, -3F, 0F, 0F, 0F); // Box 100
		bodyModel[58].setRotationPoint(8F, -38F, 0F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 27, 8, 12, 0F,0F, 0F, -8F, 0F, -3F, 0F, 0F, -3F, -4F, 0F, 0F, -3F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 102
		bodyModel[59].setRotationPoint(8F, -46F, 0F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 27, 4, 9, 0F,0F, -0.9999F, -7.9999F, 0F, 0F, 0F, 0F, 0F, -5.9999F, 0F, -0.9999F, 0F, 0F, -2.9999F, -7.9999F, 0F, 0F, 0F, 0F, 0F, -0.9999F, 0F, -2.9999F, 0F); // Box 103
		bodyModel[60].setRotationPoint(8F, -47F, 0F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 12, 9, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 106
		bodyModel[61].setRotationPoint(-50F, -28F, 0F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 46, 9, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -4F, 0F, 0F, -4F); // Box 107
		bodyModel[62].setRotationPoint(-38F, -28F, 0F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 27, 7, 12, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -5F, 0F, 0F, -4F); // Box 108
		bodyModel[63].setRotationPoint(8F, -28F, 0F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 38, 9, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, -4F); // Box 110
		bodyModel[64].setRotationPoint(-88F, -28F, 0F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 38, 3, 9, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -3F, -6F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -1F); // Box 111
		bodyModel[65].setRotationPoint(-88F, -49F, 0F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 12, 3, 7, 0F,0F, 0F, 0F, -11.9999F, 0F, 0F, -11.9999F, 0F, -4.9999F, 0F, 0F, -4.9999F, 0F, 0F, -5.9999F, 0F, 0F, -5.9999F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		bodyModel[66].setRotationPoint(-50F, -49F, 2F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 27, 3, 8, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -5F, 0F, 0F, -5F); // Box 131
		bodyModel[67].setRotationPoint(8F, -21F, 0F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 46, 3, 8, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -5F, 0F, 0F, -5F); // Box 132
		bodyModel[68].setRotationPoint(-38F, -19F, 0F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 12, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 133
		bodyModel[69].setRotationPoint(-50F, -19F, 0F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 38, 3, 8, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -1F, -5F); // Box 134
		bodyModel[70].setRotationPoint(-88F, -19F, 0F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		bodyModel[71].setRotationPoint(-38F, -53F, 8F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[72].setRotationPoint(-38F, -53F, 0F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		bodyModel[73].setRotationPoint(-29F, -53F, 0F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		bodyModel[74].setRotationPoint(-29F, -53F, 8F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[75].setRotationPoint(-23F, -53F, 0F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[76].setRotationPoint(-23F, -53F, 8F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		bodyModel[77].setRotationPoint(-16F, -53F, 0F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[78].setRotationPoint(-16F, -53F, 8F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[79].setRotationPoint(-8F, -53F, 0F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
		bodyModel[80].setRotationPoint(-8F, -53F, 8F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152
		bodyModel[81].setRotationPoint(-1F, -52F, 0F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[82].setRotationPoint(-1F, -52F, 8F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		bodyModel[83].setRotationPoint(7F, -51F, 0F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[84].setRotationPoint(7F, -51F, 8F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 31, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[85].setRotationPoint(-38F, -53F, 4F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[86].setRotationPoint(-7F, -53F, 4F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 158
		bodyModel[87].setRotationPoint(0F, -52F, 4F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 159
		bodyModel[88].setRotationPoint(-41F, -53F, 4F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -7F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 3F, 0F, 7F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 3F); // Box 160
		bodyModel[89].setRotationPoint(-44F, -54F, 3F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F); // Box 161
		bodyModel[90].setRotationPoint(-44F, -54F, 3F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 3F, 0F, 3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 3F); // Box 163
		bodyModel[91].setRotationPoint(-50F, -52F, 0F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[92].setRotationPoint(15F, -50F, 6F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		bodyModel[93].setRotationPoint(15F, -50F, 0F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 2F, 0F, 1F, -2F, 0F, 0F, 0F); // Box 166
		bodyModel[94].setRotationPoint(8F, -51F, 4F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F,0F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 2F, 0F, 3F, -2F, 0F, 0F, 0F); // Box 167
		bodyModel[95].setRotationPoint(16F, -50F, 2F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 13, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		bodyModel[96].setRotationPoint(-81F, -34.5F, 10F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 170
		bodyModel[97].setRotationPoint(-72.5F, -33.5F, 12F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 13, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		bodyModel[98].setRotationPoint(-81F, -33.5F, 9.5F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F,0F, 0F, 1.2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.2F, 0F, 0F, 1.2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.2F); // Box 173
		bodyModel[99].setRotationPoint(-90F, -33.5F, 9.5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 13, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 175
		bodyModel[100].setRotationPoint(-81F, -32.5F, 10F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 176
		bodyModel[101].setRotationPoint(-76F, -33.5F, 12F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 177
		bodyModel[102].setRotationPoint(-79.5F, -33.5F, 12F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 12, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 484
		bodyModel[103].setRotationPoint(-2F, -42F, -8F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 3, 5, 2, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 1F); // Box 485
		bodyModel[104].setRotationPoint(-5F, -42F, -8F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 3, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, 1F, 0F, 0F, 0F); // Box 487
		bodyModel[105].setRotationPoint(10F, -42F, -8F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 2, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 488
		bodyModel[106].setRotationPoint(11F, -42F, -5F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 2, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 489
		bodyModel[107].setRotationPoint(-5F, -42F, -5F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 12, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 490
		bodyModel[108].setRotationPoint(-2F, -42F, 6F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 3, 5, 2, 0F,-2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 491
		bodyModel[109].setRotationPoint(-5F, -42F, 6F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 3, 5, 2, 0F,0F, 0F, 0F, -2F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 492
		bodyModel[110].setRotationPoint(10F, -42F, 6F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 25, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 493
		bodyModel[111].setRotationPoint(13F, -41F, -4F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 494
		bodyModel[112].setRotationPoint(15F, -43F, -4F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 495
		bodyModel[113].setRotationPoint(15F, -44F, -4F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 496
		bodyModel[114].setRotationPoint(-2F, -37F, -8F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 497
		bodyModel[115].setRotationPoint(-2F, -37F, 7F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 498
		bodyModel[116].setRotationPoint(9F, -37F, 7F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 499
		bodyModel[117].setRotationPoint(9F, -37F, -8F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 578
		bodyModel[118].setRotationPoint(-1F, -42F, 3F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 579
		bodyModel[119].setRotationPoint(-1F, -42F, -4F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 15, 10, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 580
		bodyModel[120].setRotationPoint(0F, -45F, -5F);

		bodyModel[121].addShapeBox(0F, 1F, 0F, 10, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 582
		bodyModel[121].setRotationPoint(0F, -31F, -5F);
		bodyModel[121].rotateAngleZ = 0.08726646F;

		bodyModel[122].addShapeBox(-2F, 0.25F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 583
		bodyModel[122].setRotationPoint(2F, -31F, -5F);
		bodyModel[122].rotateAngleZ = 0.08726646F;

		bodyModel[123].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 584
		bodyModel[123].setRotationPoint(0F, -37F, -6F);
		bodyModel[123].rotateAngleZ = -0.78539816F;

		bodyModel[124].addShapeBox(0F, -0.3F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 585
		bodyModel[124].setRotationPoint(9F, -31F, -5F);
		bodyModel[124].rotateAngleZ = 0.12217305F;

		bodyModel[125].addShapeBox(-2F, 0.25F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 586
		bodyModel[125].setRotationPoint(2F, -31F, 4F);
		bodyModel[125].rotateAngleZ = 0.08726646F;

		bodyModel[126].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 587
		bodyModel[126].setRotationPoint(0F, -37F, 5F);
		bodyModel[126].rotateAngleZ = -0.78539816F;

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 15, 8, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 588
		bodyModel[127].setRotationPoint(1F, -44F, -4F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 589
		bodyModel[128].setRotationPoint(1.3F, -44.3F, 1F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 590
		bodyModel[129].setRotationPoint(1.3F, -44.3F, -2F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 591
		bodyModel[130].setRotationPoint(-1.5F, -46.5F, -1.5F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 592
		bodyModel[131].setRotationPoint(-1.5F, -47.5F, -1.5F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 593
		bodyModel[132].setRotationPoint(-1.5F, -48.5F, -1.5F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 594
		bodyModel[133].setRotationPoint(-2F, -49F, -3F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 465
		bodyModel[134].setRotationPoint(-42.5F, -50F, -1F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, 0F); // Box 466
		bodyModel[135].setRotationPoint(-42.5F, -50.5F, -1F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 467
		bodyModel[136].setRotationPoint(-41F, -50.75F, -1F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 468
		bodyModel[137].setRotationPoint(-41F, -49.75F, -1F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.6F, -0.25F, 0F); // Box 469
		bodyModel[138].setRotationPoint(-41.1F, -49.25F, -1F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.7F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.5F, 0F, -0.7F, -0.5F, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 470
		bodyModel[139].setRotationPoint(-42.5F, -51.5F, -1F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.7F, -0.5F, -0.3F, -0.2F, -0.5F, -0.3F, -0.2F, -0.3F, 0F, -0.7F, -0.3F, 0F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 471
		bodyModel[140].setRotationPoint(-42.5F, -51.5F, 0F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.1F); // Box 472
		bodyModel[141].setRotationPoint(-40.7F, -50.5F, -1F);

		bodyModel[142].addShapeBox(0F, 1F, 0F, 10, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
		bodyModel[142].setRotationPoint(-34F, -32.5F, -5F);
		bodyModel[142].rotateAngleZ = -0.10471976F;

		bodyModel[143].addShapeBox(9F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		bodyModel[143].setRotationPoint(-34F, -32.5F, -5F);
		bodyModel[143].rotateAngleZ = -0.10471976F;

		bodyModel[144].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		bodyModel[144].setRotationPoint(-34F, -32.5F, -5F);
		bodyModel[144].rotateAngleZ = -0.10471976F;

		bodyModel[145].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		bodyModel[145].setRotationPoint(-34F, -32.5F, 4F);
		bodyModel[145].rotateAngleZ = -0.10471976F;

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		bodyModel[146].setRotationPoint(-34F, -32.5F, -5F);
		bodyModel[146].rotateAngleZ = -0.10471976F;

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 17, 10, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		bodyModel[147].setRotationPoint(-25F, -48.5F, -5F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[148].setRotationPoint(-23F, -52.5F, -3F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 17, 8, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 246
		bodyModel[149].setRotationPoint(-26F, -47.5F, -4F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[150].setRotationPoint(-26.3F, -47.8F, -2F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[151].setRotationPoint(-26.3F, -47.8F, 1F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 2, 18, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[152].setRotationPoint(-25F, -45.5F, -4F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 2, 18, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 251
		bodyModel[153].setRotationPoint(-25F, -45.5F, 3F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[154].setRotationPoint(-31F, -31.5F, -6F);
		bodyModel[154].rotateAngleZ = 0.78539816F;

		bodyModel[155].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 253
		bodyModel[155].setRotationPoint(-31F, -31.5F, 5F);
		bodyModel[155].rotateAngleZ = 0.78539816F;

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 962
		bodyModel[156].setRotationPoint(-23.5F, -52F, -1.5F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 964
		bodyModel[157].setRotationPoint(-23.5F, -51F, -1.5F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 966
		bodyModel[158].setRotationPoint(-23.5F, -50F, -1.5F);

		bodyModel[159].addShapeBox(0F, -3F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 259
		bodyModel[159].setRotationPoint(-46F, -28.5F, -6F);
		bodyModel[159].rotateAngleZ = 0.15707963F;

		bodyModel[160].addShapeBox(0F, -3F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
		bodyModel[160].setRotationPoint(-46F, -28.5F, 4F);
		bodyModel[160].rotateAngleZ = 0.15707963F;

		bodyModel[161].addShapeBox(0F, 0F, 0F, 7, 9, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 256
		bodyModel[161].setRotationPoint(-50F, -36.5F, -2F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 8, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[162].setRotationPoint(-42F, -29.5F, -2F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 254
		bodyModel[163].setRotationPoint(-42F, -30.5F, -1.5F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 263
		bodyModel[164].setRotationPoint(-39.5F, -33.5F, -1F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 264
		bodyModel[165].setRotationPoint(-39F, -37.5F, -0.5F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 265
		bodyModel[166].setRotationPoint(-39F, -39.5F, -0.5F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 266
		bodyModel[167].setRotationPoint(-38.7F, -39.6F, -0.5F);

		bodyModel[168].addShapeBox(0F, -1F, -1F, 0, 75, 75, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -73F, 0F, 0F, -73F, 0F, -73F, 0F, 0F, -73F, 0F, 0F, -73F, -73F, 0F, -73F, -73F); // Box 814
		bodyModel[168].setRotationPoint(-41.5F, -51.5F, 0F);
		bodyModel[168].rotateAngleX = -0.01745329F;
		bodyModel[168].rotateAngleY = 0.01745329F;
		bodyModel[168].rotateAngleZ = -0.29670597F;

		bodyModel[169].addShapeBox(0F, 0F, 0F, 9, 10, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 280
		bodyModel[169].setRotationPoint(-50F, -46F, -8F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 4, 10, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		bodyModel[170].setRotationPoint(-50F, -38F, -8F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 9, 3, 16, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 282
		bodyModel[171].setRotationPoint(-50F, -49F, -8F);

		bodyModel[172].addShapeBox(0F, 1F, 0F, 10, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[172].setRotationPoint(-19F, -32.5F, -5F);
		bodyModel[172].rotateAngleZ = -0.10471976F;

		bodyModel[173].addShapeBox(0F, 0F, 0F, 2, 18, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 284
		bodyModel[173].setRotationPoint(-10F, -45.5F, 3F);

		bodyModel[174].addShapeBox(9F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 285
		bodyModel[174].setRotationPoint(-19F, -32.5F, -5F);
		bodyModel[174].rotateAngleZ = -0.10471976F;

		bodyModel[175].addShapeBox(0F, 0F, 0F, 2, 18, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 286
		bodyModel[175].setRotationPoint(-10F, -45.5F, -4F);

		bodyModel[176].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 287
		bodyModel[176].setRotationPoint(-19F, -32.5F, 4F);
		bodyModel[176].rotateAngleZ = -0.10471976F;

		bodyModel[177].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 288
		bodyModel[177].setRotationPoint(-19F, -32.5F, -5F);
		bodyModel[177].rotateAngleZ = -0.10471976F;

		bodyModel[178].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 289
		bodyModel[178].setRotationPoint(-16F, -31.5F, -6F);
		bodyModel[178].rotateAngleZ = 0.78539816F;

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 290
		bodyModel[179].setRotationPoint(-19F, -32.5F, -5F);
		bodyModel[179].rotateAngleZ = -0.10471976F;

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 17, 10, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 291
		bodyModel[180].setRotationPoint(-10F, -48.5F, -5F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 17, 8, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 292
		bodyModel[181].setRotationPoint(-11F, -47.5F, -4F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 293
		bodyModel[182].setRotationPoint(-11.3F, -47.8F, -2F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 294
		bodyModel[183].setRotationPoint(-11.3F, -47.8F, 1F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 295
		bodyModel[184].setRotationPoint(-16F, -31.5F, 5F);
		bodyModel[184].rotateAngleZ = 0.78539816F;

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 296
		bodyModel[185].setRotationPoint(-8.5F, -52F, -1.5F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 297
		bodyModel[186].setRotationPoint(-8.5F, -51F, -1.5F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 298
		bodyModel[187].setRotationPoint(-8.5F, -50F, -1.5F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		bodyModel[188].setRotationPoint(-8F, -52.5F, -3F);
	}

	private void initnoseModel_1()
	{
		noseModel[0] = new ModelRendererTurbo(this, 945, 17, textureX, textureY); // Box 18
		noseModel[1] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 19
		noseModel[2] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 20
		noseModel[3] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 21
		noseModel[4] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 22
		noseModel[5] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 23
		noseModel[6] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 24
		noseModel[7] = new ModelRendererTurbo(this, 529, 25, textureX, textureY); // Box 25
		noseModel[8] = new ModelRendererTurbo(this, 569, 25, textureX, textureY); // Box 26
		noseModel[9] = new ModelRendererTurbo(this, 569, 1, textureX, textureY); // Box 27
		noseModel[10] = new ModelRendererTurbo(this, 657, 1, textureX, textureY); // Box 28
		noseModel[11] = new ModelRendererTurbo(this, 745, 1, textureX, textureY); // Box 29
		noseModel[12] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 41
		noseModel[13] = new ModelRendererTurbo(this, 993, 25, textureX, textureY); // Import CO_51
		noseModel[14] = new ModelRendererTurbo(this, 1009, 17, textureX, textureY); // Import CO_55
		noseModel[15] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Import CO_57
		noseModel[16] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Import CO_61
		noseModel[17] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Import CO_62
		noseModel[18] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Import CO_63
		noseModel[19] = new ModelRendererTurbo(this, 665, 57, textureX, textureY); // Box 112
		noseModel[20] = new ModelRendererTurbo(this, 129, 73, textureX, textureY); // Box 113
		noseModel[21] = new ModelRendererTurbo(this, 473, 73, textureX, textureY); // Box 114
		noseModel[22] = new ModelRendererTurbo(this, 9, 81, textureX, textureY); // Box 115
		noseModel[23] = new ModelRendererTurbo(this, 225, 81, textureX, textureY); // Box 116
		noseModel[24] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Box 117
		noseModel[25] = new ModelRendererTurbo(this, 889, 49, textureX, textureY); // Box 118
		noseModel[26] = new ModelRendererTurbo(this, 969, 81, textureX, textureY); // Box 119
		noseModel[27] = new ModelRendererTurbo(this, 473, 89, textureX, textureY); // Box 120
		noseModel[28] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 121
		noseModel[29] = new ModelRendererTurbo(this, 521, 25, textureX, textureY); // Box 122
		noseModel[30] = new ModelRendererTurbo(this, 561, 25, textureX, textureY); // Box 123
		noseModel[31] = new ModelRendererTurbo(this, 809, 49, textureX, textureY); // Box 135
		noseModel[32] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Box 168
		noseModel[33] = new ModelRendererTurbo(this, 281, 41, textureX, textureY); // Box 172
		noseModel[34] = new ModelRendererTurbo(this, 225, 65, textureX, textureY); // Box 174
		noseModel[35] = new ModelRendererTurbo(this, 513, 65, textureX, textureY); // Box 178
		noseModel[36] = new ModelRendererTurbo(this, 713, 65, textureX, textureY); // Box 179
		noseModel[37] = new ModelRendererTurbo(this, 665, 57, textureX, textureY); // Box 180

		noseModel[0].addShapeBox(0F, 0F, 0F, 11, 7, 10, 0F,0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 18
		noseModel[0].setRotationPoint(-99F, -38F, -10F);

		noseModel[1].addShapeBox(0F, 0F, 0F, 11, 5, 10, 0F,0F, 0F, -7F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 19
		noseModel[1].setRotationPoint(-99F, -43F, -10F);

		noseModel[2].addShapeBox(0F, 0F, 0F, 11, 3, 8, 0F,0F, -2.9999F, -4.9999F, 0F, 0F, -4.9999F, 0F, 0F, 0F, 0F, -2.9999F, 0F, 0F, 0F, -4.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		noseModel[2].setRotationPoint(-99F, -46F, -8F);

		noseModel[3].addShapeBox(0F, 0F, 0F, 11, 7, 10, 0F,0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -3F, -7F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 21
		noseModel[3].setRotationPoint(-99F, -31F, -10F);

		noseModel[4].addShapeBox(0F, 0F, 0F, 10, 5, 8, 0F,0F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 22
		noseModel[4].setRotationPoint(-109F, -37F, -8F);

		noseModel[5].addShapeBox(0F, 0F, 0F, 7, 4, 2, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 1F); // Box 23
		noseModel[5].setRotationPoint(-95F, -32F, -10F);

		noseModel[6].addShapeBox(0F, 0F, 0F, 5, 8, 2, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -3F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 2F, -3F, 0F, 3F); // Box 24
		noseModel[6].setRotationPoint(-93F, -28F, -10F);

		noseModel[7].addShapeBox(0F, 0F, 0F, 10, 5, 8, 0F,0F, 1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -4F, -6F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 25
		noseModel[7].setRotationPoint(-109F, -32F, -8F);

		noseModel[8].addShapeBox(0F, 0F, 0F, 10, 5, 8, 0F,0F, -3F, -6F, 0F, 1F, -5F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, 1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 26
		noseModel[8].setRotationPoint(-109F, -42F, -8F);

		noseModel[9].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F); // Box 27
		noseModel[9].setRotationPoint(-112F, -36F, -4F);

		noseModel[10].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,0F, -3F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F); // Box 28
		noseModel[10].setRotationPoint(-112F, -39F, -4F);

		noseModel[11].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 0F, -2F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 29
		noseModel[11].setRotationPoint(-112F, -33F, -4F);

		noseModel[12].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -6F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 41
		noseModel[12].setRotationPoint(-90F, -20F, -8F);

		noseModel[13].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F,-1F, -0.3F, -1.2F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 1.2F, -1F, 0F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.2F); // Import CO_51
		noseModel[13].setRotationPoint(-90F, -34.5F, -12F);

		noseModel[14].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1.2F, 0F, 0F, -1.03333333F, 0F, 0F, 0.93333333F, 0F, 0F, 1.2F, -1F, 0F, -1.2F, 0F, 0F, -1.03333333F, 0F, 0F, 0.93333333F, 0F, 0F, 1.2F); // Import CO_55
		noseModel[14].setRotationPoint(-90F, -33.5F, -12F);

		noseModel[15].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F,-1F, 0F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.2F, -1F, -0.3F, -1.2F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 1.2F); // Import CO_57
		noseModel[15].setRotationPoint(-90F, -32.5F, -12F);

		noseModel[16].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Import CO_61
		noseModel[16].setRotationPoint(-83F, -33.5F, -13F);

		noseModel[17].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Import CO_62
		noseModel[17].setRotationPoint(-86.5F, -33.5F, -12.8F);

		noseModel[18].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Import CO_63
		noseModel[18].setRotationPoint(-89F, -33.5F, -12.2F);

		noseModel[19].addShapeBox(0F, 0F, 0F, 11, 7, 10, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F); // Box 112
		noseModel[19].setRotationPoint(-99F, -38F, 0F);

		noseModel[20].addShapeBox(0F, 0F, 0F, 11, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -7F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F); // Box 113
		noseModel[20].setRotationPoint(-99F, -43F, 0F);

		noseModel[21].addShapeBox(0F, 0F, 0F, 11, 3, 8, 0F,0F, -2.9999F, 0F, 0F, 0F, 0F, 0F, 0F, -4.9999F, 0F, -2.9999F, -4.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.9999F); // Box 114
		noseModel[21].setRotationPoint(-99F, -46F, 0F);

		noseModel[22].addShapeBox(0F, 0F, 0F, 11, 7, 10, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, -7F); // Box 115
		noseModel[22].setRotationPoint(-99F, -31F, 0F);

		noseModel[23].addShapeBox(0F, 0F, 0F, 10, 5, 8, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -4F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -4F); // Box 116
		noseModel[23].setRotationPoint(-109F, -37F, 0F);

		noseModel[24].addShapeBox(0F, 0F, 0F, 7, 4, 2, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F); // Box 117
		noseModel[24].setRotationPoint(-95F, -32F, 8F);

		noseModel[25].addShapeBox(0F, 0F, 0F, 5, 8, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, 3F, 0F, 0F, 2F, 0F, 0F, -2F, -3F, 0F, -3F); // Box 118
		noseModel[25].setRotationPoint(-93F, -28F, 8F);

		noseModel[26].addShapeBox(0F, 0F, 0F, 10, 5, 8, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -4F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -4F, -6F); // Box 119
		noseModel[26].setRotationPoint(-109F, -32F, 0F);

		noseModel[27].addShapeBox(0F, 0F, 0F, 10, 5, 8, 0F,0F, -3F, 0F, 0F, 1F, 0F, 0F, 1F, -5F, 0F, -3F, -6F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -4F); // Box 120
		noseModel[27].setRotationPoint(-109F, -42F, 0F);

		noseModel[28].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F); // Box 121
		noseModel[28].setRotationPoint(-112F, -36F, 0F);

		noseModel[29].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, -3F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F); // Box 122
		noseModel[29].setRotationPoint(-112F, -39F, 0F);

		noseModel[30].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -3F); // Box 123
		noseModel[30].setRotationPoint(-112F, -33F, 0F);

		noseModel[31].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -1F, -6F); // Box 135
		noseModel[31].setRotationPoint(-90F, -20F, 0F);

		noseModel[32].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F,0F, 0F, 1.2F, 0F, 0F, 0F, 0F, -0.3F, 0F, -1F, -0.3F, -1.2F, 0F, 0F, 1.2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.2F); // Box 168
		noseModel[32].setRotationPoint(-90F, -34.5F, 10F);

		noseModel[33].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 1.2F, 0F, 0F, 0.93333333F, 0F, 0F, -1.03333333F, -1F, 0F, -1.2F, 0F, 0F, 1.2F, 0F, 0F, 0.93333333F, 0F, 0F, -1.03333333F, -1F, 0F, -1.2F); // Box 172
		noseModel[33].setRotationPoint(-90F, -33.5F, 10F);

		noseModel[34].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F,0F, 0F, 1.2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.2F, 0F, 0F, 1.2F, 0F, 0F, 0F, 0F, -0.3F, 0F, -1F, -0.3F, -1.2F); // Box 174
		noseModel[34].setRotationPoint(-90F, -32.5F, 10F);

		noseModel[35].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 178
		noseModel[35].setRotationPoint(-83F, -33.5F, 12F);

		noseModel[36].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 179
		noseModel[36].setRotationPoint(-86.5F, -33.5F, 11.8F);

		noseModel[37].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 180
		noseModel[37].setRotationPoint(-89F, -33.5F, 11.2F);
	}

	private void inittailModel_1()
	{
		tailModel[0] = new ModelRendererTurbo(this, 577, 1, textureX, textureY); // Box 7
		tailModel[1] = new ModelRendererTurbo(this, 833, 1, textureX, textureY); // Box 10
		tailModel[2] = new ModelRendererTurbo(this, 929, 1, textureX, textureY); // Box 11
		tailModel[3] = new ModelRendererTurbo(this, 745, 17, textureX, textureY); // Box 15
		tailModel[4] = new ModelRendererTurbo(this, 649, 25, textureX, textureY); // Box 31
		tailModel[5] = new ModelRendererTurbo(this, 737, 33, textureX, textureY); // Box 32
		tailModel[6] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 33
		tailModel[7] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 34
		tailModel[8] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Box 35
		tailModel[9] = new ModelRendererTurbo(this, 289, 41, textureX, textureY); // Box 36
		tailModel[10] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 87
		tailModel[11] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Box 89
		tailModel[12] = new ModelRendererTurbo(this, 1009, 49, textureX, textureY); // Box 91
		tailModel[13] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 92
		tailModel[14] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 93
		tailModel[15] = new ModelRendererTurbo(this, 665, 81, textureX, textureY); // Box 101
		tailModel[16] = new ModelRendererTurbo(this, 561, 97, textureX, textureY); // Box 104
		tailModel[17] = new ModelRendererTurbo(this, 889, 97, textureX, textureY); // Box 105
		tailModel[18] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 109
		tailModel[19] = new ModelRendererTurbo(this, 97, 121, textureX, textureY); // Box 125
		tailModel[20] = new ModelRendererTurbo(this, 321, 121, textureX, textureY); // Box 126
		tailModel[21] = new ModelRendererTurbo(this, 569, 129, textureX, textureY); // Box 127
		tailModel[22] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 128
		tailModel[23] = new ModelRendererTurbo(this, 473, 137, textureX, textureY); // Box 129
		tailModel[24] = new ModelRendererTurbo(this, 321, 137, textureX, textureY); // Box 130
		tailModel[25] = new ModelRendererTurbo(this, 889, 153, textureX, textureY); // Box 181
		tailModel[26] = new ModelRendererTurbo(this, 513, 161, textureX, textureY); // Box 183
		tailModel[27] = new ModelRendererTurbo(this, 513, 73, textureX, textureY); // Box 185
		tailModel[28] = new ModelRendererTurbo(this, 985, 129, textureX, textureY); // Box 186
		tailModel[29] = new ModelRendererTurbo(this, 153, 161, textureX, textureY); // Box 187

		tailModel[0].addShapeBox(0F, 0F, 0F, 35, 9, 9, 0F,0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 7
		tailModel[0].setRotationPoint(35F, -38F, -9F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 35, 5, 9, 0F,0F, 0F, -1F, 0F, -3F, -4F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -3F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 10
		tailModel[1].setRotationPoint(35F, -43F, -9F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 35, 4, 8, 0F,0F, 0F, -5F, 0F, -4F, -6F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -3F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 11
		tailModel[2].setRotationPoint(35F, -47F, -8F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 35, 5, 9, 0F,0F, 0F, 0F, 0F, 1F, -3F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, -4F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 15
		tailModel[3].setRotationPoint(35F, -29F, -9F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 40, 7, 6, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -5F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 31
		tailModel[4].setRotationPoint(70F, -37F, -6F);

		tailModel[5].addShapeBox(0F, 0F, 0F, 40, 3, 6, 0F,0F, 0F, -1F, 0F, -1F, -5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		tailModel[5].setRotationPoint(70F, -40F, -6F);

		tailModel[6].addShapeBox(0F, 0F, 0F, 40, 3, 6, 0F,0F, 0F, -4F, -3F, -1F, -5F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, -5F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 33
		tailModel[6].setRotationPoint(70F, -43F, -6F);

		tailModel[7].addShapeBox(0F, 0F, 0F, 40, 3, 6, 0F,0F, 0F, 0F, 0F, 3F, -5F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -5F, -5F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 34
		tailModel[7].setRotationPoint(70F, -30F, -6F);

		tailModel[8].addShapeBox(0F, 0F, 0F, 40, 2, 5, 0F,0F, 0F, 0F, 0F, 5F, -4F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, -6F, -4F, -1F, -6F, 0F, 0F, 0F, 0F); // Box 35
		tailModel[8].setRotationPoint(70F, -27F, -5F);

		tailModel[9].addShapeBox(0F, 0F, 0F, 35, 3, 7, 0F,0F, 0F, 0F, 0F, 3F, -2F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -4F, -4F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 36
		tailModel[9].setRotationPoint(35F, -24F, -7F);

		tailModel[10].addShapeBox(0F, 0F, 0F, 11, 3, 55, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		tailModel[10].setRotationPoint(83F, -41F, -55F);

		tailModel[11].addShapeBox(0F, 0F, 0F, 14, 3, 55, 0F,-10F, -1F, -5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -10F, -1F, -5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 89
		tailModel[11].setRotationPoint(69F, -41F, -55F);

		tailModel[12].addShapeBox(0F, 0F, 0F, 6, 29, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		tailModel[12].setRotationPoint(94F, -71F, -1F);

		tailModel[13].addShapeBox(0F, 0F, 0F, 7, 29, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		tailModel[13].setRotationPoint(87F, -71F, -1F);

		tailModel[14].addShapeBox(0F, 0F, 0F, 19, 29, 1, 0F,-16F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		tailModel[14].setRotationPoint(68F, -71F, -1F);

		tailModel[15].addShapeBox(0F, 0F, 0F, 35, 9, 9, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -3F, 0F, 0F, 0F); // Box 101
		tailModel[15].setRotationPoint(35F, -38F, 0F);

		tailModel[16].addShapeBox(0F, 0F, 0F, 35, 5, 9, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -3F, 0F, 0F, 0F); // Box 104
		tailModel[16].setRotationPoint(35F, -43F, 0F);

		tailModel[17].addShapeBox(0F, 0F, 0F, 35, 4, 8, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, -6F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, -3F, 0F, 0F, 0F); // Box 105
		tailModel[17].setRotationPoint(35F, -47F, 0F);

		tailModel[18].addShapeBox(0F, 0F, 0F, 35, 5, 9, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -4F, 0F, 0F, -2F); // Box 109
		tailModel[18].setRotationPoint(35F, -29F, 0F);

		tailModel[19].addShapeBox(0F, 0F, 0F, 40, 7, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -5F, 0F, 0F, 0F); // Box 125
		tailModel[19].setRotationPoint(70F, -37F, 0F);

		tailModel[20].addShapeBox(0F, 0F, 0F, 40, 3, 6, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 126
		tailModel[20].setRotationPoint(70F, -40F, 0F);

		tailModel[21].addShapeBox(0F, 0F, 0F, 40, 3, 6, 0F,0F, 0F, 0F, -3F, -1F, 0F, -3F, -1F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -5F, 0F, 0F, -1F); // Box 127
		tailModel[21].setRotationPoint(70F, -43F, 0F);

		tailModel[22].addShapeBox(0F, 0F, 0F, 40, 3, 6, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, -5F, 0F, 0F, -1F); // Box 128
		tailModel[22].setRotationPoint(70F, -30F, 0F);

		tailModel[23].addShapeBox(0F, 0F, 0F, 40, 2, 5, 0F,0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -6F, 0F, -1F, -6F, -4F, 0F, 0F, -2F); // Box 129
		tailModel[23].setRotationPoint(70F, -27F, 0F);

		tailModel[24].addShapeBox(0F, 0F, 0F, 35, 3, 7, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, -4F, 0F, 0F, -4F); // Box 130
		tailModel[24].setRotationPoint(35F, -24F, 0F);

		tailModel[25].addShapeBox(0F, 0F, 0F, 11, 3, 55, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 181
		tailModel[25].setRotationPoint(83F, -41F, 0F);

		tailModel[26].addShapeBox(0F, 0F, 0F, 14, 3, 55, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -10F, -1F, -5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -10F, -1F, -5F); // Box 183
		tailModel[26].setRotationPoint(69F, -41F, 0F);

		tailModel[27].addShapeBox(0F, 0F, 0F, 6, 29, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		tailModel[27].setRotationPoint(94F, -71F, 0F);

		tailModel[28].addShapeBox(0F, 0F, 0F, 7, 29, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		tailModel[28].setRotationPoint(87F, -71F, 0F);

		tailModel[29].addShapeBox(0F, 0F, 0F, 19, 29, 1, 0F,-16F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		tailModel[29].setRotationPoint(68F, -71F, 0F);
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 737, 41, textureX, textureY); // Box 42
		leftWingModel[1] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 43
		leftWingModel[2] = new ModelRendererTurbo(this, 889, 41, textureX, textureY); // Box 45
		leftWingModel[3] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 46
		leftWingModel[4] = new ModelRendererTurbo(this, 713, 49, textureX, textureY); // Box 47

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 26, 11, 94, 0F,0F, 0F, 0F, -9F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -8F, 0F, -9F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		leftWingModel[0].setRotationPoint(-42F, -36F, -104F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 16, 11, 94, 0F,0F, -1F, 0F, -9F, 0F, 0F, -9F, -2F, 0F, 5F, -6F, 0F, 0F, -9F, 0F, -9F, -8F, 0F, -9F, 0F, 0F, 5F, -2F, 0F); // Box 43
		leftWingModel[1].setRotationPoint(-49F, -36F, -104F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 17, 3, 23, 0F,-5F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -2F, 0F, -7F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		leftWingModel[2].setRotationPoint(-42F, -36F, -127F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 7, 3, 23, 0F,-3F, 0F, -6F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, -2F, -6F, 5F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 46
		leftWingModel[3].setRotationPoint(-49F, -36F, -127F);

		leftWingModel[4].addShapeBox(0F, 0F, 0F, 13, 3, 23, 0F,7F, 0F, 0F, -6F, 0F, -8F, 0F, -1F, 0F, 0F, 0F, 0F, 7F, -2F, 0F, -6F, -2F, -8F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 47
		leftWingModel[4].setRotationPoint(-25F, -36F, -127F);
	}

	private void initrightWingModel_1()
	{
		rightWingModel[0] = new ModelRendererTurbo(this, 585, 129, textureX, textureY); // Box 136
		rightWingModel[1] = new ModelRendererTurbo(this, 737, 153, textureX, textureY); // Box 137
		rightWingModel[2] = new ModelRendererTurbo(this, 737, 153, textureX, textureY); // Box 139
		rightWingModel[3] = new ModelRendererTurbo(this, 961, 97, textureX, textureY); // Box 140
		rightWingModel[4] = new ModelRendererTurbo(this, 865, 153, textureX, textureY); // Box 141

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 26, 11, 94, 0F,0F, -2F, 0F, 0F, -2F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, -8F, 0F, 0F, -8F, 0F); // Box 136
		rightWingModel[0].setRotationPoint(-42F, -36F, 10F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 16, 11, 94, 0F,5F, -6F, 0F, -9F, -2F, 0F, -9F, 0F, 0F, 0F, -1F, 0F, 5F, -2F, 0F, -9F, 0F, 0F, -9F, -8F, 0F, 0F, -9F, 0F); // Box 137
		rightWingModel[1].setRotationPoint(-49F, -36F, 10F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 17, 3, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, -2F, 0F, -5F, -2F, 0F); // Box 139
		rightWingModel[2].setRotationPoint(-42F, -36F, 104F);

		rightWingModel[3].addShapeBox(0F, 0F, 0F, 7, 3, 23, 0F,0F, -1F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -3F, 0F, -6F, 0F, -1F, 0F, 0F, 0F, 0F, 5F, -2F, 0F, -3F, -2F, -6F); // Box 140
		rightWingModel[3].setRotationPoint(-49F, -36F, 104F);

		rightWingModel[4].addShapeBox(0F, 0F, 0F, 13, 3, 23, 0F,0F, 0F, 0F, 0F, -1F, 0F, -6F, 0F, -8F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -6F, -2F, -8F, 7F, -2F, 0F); // Box 141
		rightWingModel[4].setRotationPoint(-25F, -36F, 104F);
	}

	private void inityawFlapModel_1()
	{
		yawFlapModel[0] = new ModelRendererTurbo(this, 985, 49, textureX, textureY); // Box 90
		yawFlapModel[1] = new ModelRendererTurbo(this, 161, 89, textureX, textureY); // Box 184

		yawFlapModel[0].addShapeBox(0F, 0F, 0F, 7, 26, 1, 0F,0F, 1F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		yawFlapModel[0].setRotationPoint(100F, -68F, -1F);

		yawFlapModel[1].addShapeBox(0F, 0F, 0F, 7, 26, 1, 0F,0F, 1F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
		yawFlapModel[1].setRotationPoint(100F, -68F, 0F);
	}

	private void initpitchFlapLeftModel_1()
	{
		pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 88
		pitchFlapLeftModel[1] = new ModelRendererTurbo(this, 153, 161, textureX, textureY); // Box 182

		pitchFlapLeftModel[0].addShapeBox(0F, 0F, 0F, 11, 3, 55, 0F,0F, -1F, 0F, -5F, -1F, -5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -5F, -1F, -5F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 88
		pitchFlapLeftModel[0].setRotationPoint(94F, -41F, -55F);

		pitchFlapLeftModel[1].addShapeBox(0F, 0F, 0F, 11, 3, 55, 0F,0F, 0F, 0F, 0F, -1F, 0F, -5F, -1F, -5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -5F, -1F, -5F, 0F, -1F, 0F); // Box 182
		pitchFlapLeftModel[1].setRotationPoint(94F, -41F, 0F);
	}

	private void initpitchFlapRightModel_1()
	{
		pitchFlapRightModel[0] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 138

		pitchFlapRightModel[0].addShapeBox(0F, 0F, 0F, 26, 11, 94, 0F,-9F, -2F, 0F, 3F, -6F, 0F, -13F, -1F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 3F, -3F, 0F, -13F, -9F, 0F, 0F, -8F, 0F); // Box 138
		pitchFlapRightModel[0].setRotationPoint(-25F, -36F, 10F);
	}

	private void initpitchFlapLeftWingModel_1()
	{
		pitchFlapLeftWingModel[0] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 44

		pitchFlapLeftWingModel[0].addShapeBox(0F, 0F, 0F, 26, 11, 94, 0F,0F, 0F, 0F, -13F, -1F, 0F, 3F, -6F, 0F, -9F, -2F, 0F, 0F, -8F, 0F, -13F, -9F, 0F, 3F, -3F, 0F, -9F, 0F, 0F); // Box 44
		pitchFlapLeftWingModel[0].setRotationPoint(-25F, -36F, -104F);
	}

	private void inittailWheelModel_1()
	{
		tailWheelModel[0] = new ModelRendererTurbo(this, 745, 81, textureX, textureY); // Box 391
		tailWheelModel[1] = new ModelRendererTurbo(this, 961, 73, textureX, textureY); // Box 392
		tailWheelModel[2] = new ModelRendererTurbo(this, 561, 73, textureX, textureY); // Box 393
		tailWheelModel[3] = new ModelRendererTurbo(this, 793, 89, textureX, textureY); // Box 394
		tailWheelModel[4] = new ModelRendererTurbo(this, 377, 97, textureX, textureY); // Box 395
		tailWheelModel[5] = new ModelRendererTurbo(this, 641, 97, textureX, textureY); // Box 396
		tailWheelModel[6] = new ModelRendererTurbo(this, 801, 97, textureX, textureY); // Box 397
		tailWheelModel[7] = new ModelRendererTurbo(this, 393, 105, textureX, textureY); // Box 398
		tailWheelModel[8] = new ModelRendererTurbo(this, 889, 73, textureX, textureY); // Box 399

		tailWheelModel[0].addShapeBox(0F, 0F, 0F, 10, 3, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 391
		tailWheelModel[0].setRotationPoint(91F, -32F, -2F);

		tailWheelModel[1].addShapeBox(0F, 0F, 0F, 8, 3, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F); // Box 392
		tailWheelModel[1].setRotationPoint(93F, -29F, -2F);

		tailWheelModel[2].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 393
		tailWheelModel[2].setRotationPoint(96F, -26F, -2F);

		tailWheelModel[3].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		tailWheelModel[3].setRotationPoint(96F, -23F, -1F);

		tailWheelModel[4].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 395
		tailWheelModel[4].setRotationPoint(96F, -25F, -1F);

		tailWheelModel[5].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 396
		tailWheelModel[5].setRotationPoint(96F, -21F, -1F);

		tailWheelModel[6].addShapeBox(0F, 0F, 0F, 10, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F); // Box 397
		tailWheelModel[6].setRotationPoint(91F, -32F, 0F);

		tailWheelModel[7].addShapeBox(0F, 0F, 0F, 8, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 398
		tailWheelModel[7].setRotationPoint(93F, -29F, 0F);

		tailWheelModel[8].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 399
		tailWheelModel[8].setRotationPoint(96F, -26F, 1F);
	}

	private void initleftWingWheelModel_1()
	{
		leftWingWheelModel[0] = new ModelRendererTurbo(this, 753, 121, textureX, textureY); // Box 153
		leftWingWheelModel[1] = new ModelRendererTurbo(this, 233, 161, textureX, textureY); // Box 154
		leftWingWheelModel[2] = new ModelRendererTurbo(this, 281, 161, textureX, textureY); // Box 155
		leftWingWheelModel[3] = new ModelRendererTurbo(this, 369, 113, textureX, textureY); // Box 156
		leftWingWheelModel[4] = new ModelRendererTurbo(this, 601, 161, textureX, textureY); // Box 157
		leftWingWheelModel[5] = new ModelRendererTurbo(this, 273, 81, textureX, textureY); // Box 158
		leftWingWheelModel[6] = new ModelRendererTurbo(this, 1009, 81, textureX, textureY); // Box 159
		leftWingWheelModel[7] = new ModelRendererTurbo(this, 769, 65, textureX, textureY); // Box 160
		leftWingWheelModel[8] = new ModelRendererTurbo(this, 817, 65, textureX, textureY); // Box 161

		leftWingWheelModel[0].addShapeBox(0F, 0F, 0F, 15, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		leftWingWheelModel[0].setRotationPoint(-52F, 0F, -56F);

		leftWingWheelModel[1].addShapeBox(0F, 0F, 0F, 15, 5, 6, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		leftWingWheelModel[1].setRotationPoint(-52F, -5F, -56F);

		leftWingWheelModel[2].addShapeBox(0F, 0F, 0F, 15, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 155
		leftWingWheelModel[2].setRotationPoint(-52F, 5F, -56F);

		leftWingWheelModel[3].addShapeBox(0F, 0F, 0F, 18, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		leftWingWheelModel[3].setRotationPoint(-53.5F, 0F, -57F);

		leftWingWheelModel[4].addShapeBox(0F, 0F, 0F, 18, 6, 1, 0F,-6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		leftWingWheelModel[4].setRotationPoint(-53.5F, -6F, -57F);

		leftWingWheelModel[5].addShapeBox(0F, 0F, 0F, 6, 27, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		leftWingWheelModel[5].setRotationPoint(-47.5F, -33F, -57F);

		leftWingWheelModel[6].addShapeBox(0F, 0F, 0F, 3, 25, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		leftWingWheelModel[6].setRotationPoint(-46F, -32F, -54.5F);

		leftWingWheelModel[7].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		leftWingWheelModel[7].setRotationPoint(-46F, -7F, -54.5F);

		leftWingWheelModel[8].addShapeBox(0F, 0F, 0F, 3, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		leftWingWheelModel[8].setRotationPoint(-46F, -6F, -50.5F);
	}

	private void initrightWingWheelModel_1()
	{
		rightWingWheelModel[0] = new ModelRendererTurbo(this, 969, 161, textureX, textureY); // Box 197
		rightWingWheelModel[1] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 198
		rightWingWheelModel[2] = new ModelRendererTurbo(this, 49, 169, textureX, textureY); // Box 199
		rightWingWheelModel[3] = new ModelRendererTurbo(this, 329, 169, textureX, textureY); // Box 200
		rightWingWheelModel[4] = new ModelRendererTurbo(this, 369, 169, textureX, textureY); // Box 201
		rightWingWheelModel[5] = new ModelRendererTurbo(this, 1009, 129, textureX, textureY); // Box 202
		rightWingWheelModel[6] = new ModelRendererTurbo(this, 641, 161, textureX, textureY); // Box 203
		rightWingWheelModel[7] = new ModelRendererTurbo(this, 169, 73, textureX, textureY); // Box 204
		rightWingWheelModel[8] = new ModelRendererTurbo(this, 313, 73, textureX, textureY); // Box 205

		rightWingWheelModel[0].addShapeBox(0F, 0F, 0F, 15, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		rightWingWheelModel[0].setRotationPoint(-52F, 0F, 50F);

		rightWingWheelModel[1].addShapeBox(0F, 0F, 0F, 15, 5, 6, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		rightWingWheelModel[1].setRotationPoint(-52F, -5F, 50F);

		rightWingWheelModel[2].addShapeBox(0F, 0F, 0F, 15, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 199
		rightWingWheelModel[2].setRotationPoint(-52F, 5F, 50F);

		rightWingWheelModel[3].addShapeBox(0F, 0F, 0F, 18, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
		rightWingWheelModel[3].setRotationPoint(-53.5F, 0F, 56F);

		rightWingWheelModel[4].addShapeBox(0F, 0F, 0F, 18, 6, 1, 0F,-6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
		rightWingWheelModel[4].setRotationPoint(-53.5F, -6F, 56F);

		rightWingWheelModel[5].addShapeBox(0F, 0F, 0F, 6, 27, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		rightWingWheelModel[5].setRotationPoint(-47.5F, -33F, 56F);

		rightWingWheelModel[6].addShapeBox(0F, 0F, 0F, 3, 25, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		rightWingWheelModel[6].setRotationPoint(-46F, -32F, 51.5F);

		rightWingWheelModel[7].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		rightWingWheelModel[7].setRotationPoint(-46F, -7F, 49.5F);

		rightWingWheelModel[8].addShapeBox(0F, 0F, 0F, 3, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		rightWingWheelModel[8].setRotationPoint(-46F, -6F, 49.5F);
	}

	private void initPropeller()
	{
		propellerModels = new ModelRendererTurbo[1][3];
		propellerModels[0] = makeProp1(-99.5F, -34.5F, 0F);
	}

	private ModelRendererTurbo[] makeProp1(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[3];
		prop[0] = new ModelRendererTurbo(this, 0, 214, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 214, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 0, 214, textureX, textureY);
		prop[0].addBox(-1F, -33F, -2.5F, 2, 33, 5, 0.0F);
		prop[1].addBox(-1F, -33F, -2.5F, 2, 33, 5, 0.0F);
		prop[2].addBox(-1F, -33F, -2.5F, 2, 33, 5, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		return prop;
	}

	private void initGuns() {
	}
	{

		// Passenger 3
		ModelRendererTurbo[][] gun_2_Model = new ModelRendererTurbo[3][];

		gun_2_Model[0] = new ModelRendererTurbo[0];

		gun_2_Model[1] = new ModelRendererTurbo[78];
		gun_2_Model[1][0] = new ModelRendererTurbo(this, 419, 247, textureX, textureY); // Import 
		gun_2_Model[1][1] = new ModelRendererTurbo(this, 427, 247, textureX, textureY); // Import 
		gun_2_Model[1][2] = new ModelRendererTurbo(this, 435, 247, textureX, textureY); // Import 
		gun_2_Model[1][3] = new ModelRendererTurbo(this, 443, 247, textureX, textureY); // Import 
		gun_2_Model[1][4] = new ModelRendererTurbo(this, 451, 247, textureX, textureY); // Import 
		gun_2_Model[1][5] = new ModelRendererTurbo(this, 459, 247, textureX, textureY); // Import 
		gun_2_Model[1][6] = new ModelRendererTurbo(this, 475, 247, textureX, textureY); // Import 
		gun_2_Model[1][7] = new ModelRendererTurbo(this, 483, 247, textureX, textureY); // Import 
		gun_2_Model[1][8] = new ModelRendererTurbo(this, 499, 247, textureX, textureY); // Import 
		gun_2_Model[1][9] = new ModelRendererTurbo(this, 515, 247, textureX, textureY); // Import 
		gun_2_Model[1][10] = new ModelRendererTurbo(this, 531, 247, textureX, textureY); // Import 
		gun_2_Model[1][11] = new ModelRendererTurbo(this, 547, 247, textureX, textureY); // Import 
		gun_2_Model[1][12] = new ModelRendererTurbo(this, 555, 247, textureX, textureY); // Import 
		gun_2_Model[1][13] = new ModelRendererTurbo(this, 563, 247, textureX, textureY); // Import 
		gun_2_Model[1][14] = new ModelRendererTurbo(this, 571, 247, textureX, textureY); // Import 
		gun_2_Model[1][15] = new ModelRendererTurbo(this, 579, 247, textureX, textureY); // Import 
		gun_2_Model[1][16] = new ModelRendererTurbo(this, 587, 247, textureX, textureY); // Import 
		gun_2_Model[1][17] = new ModelRendererTurbo(this, 595, 247, textureX, textureY); // Import 
		gun_2_Model[1][18] = new ModelRendererTurbo(this, 603, 247, textureX, textureY); // Import 
		gun_2_Model[1][19] = new ModelRendererTurbo(this, 611, 247, textureX, textureY); // Import 
		gun_2_Model[1][20] = new ModelRendererTurbo(this, 619, 247, textureX, textureY); // Import 
		gun_2_Model[1][21] = new ModelRendererTurbo(this, 627, 247, textureX, textureY); // Import 
		gun_2_Model[1][22] = new ModelRendererTurbo(this, 635, 247, textureX, textureY); // Import 
		gun_2_Model[1][23] = new ModelRendererTurbo(this, 643, 247, textureX, textureY); // Import 
		gun_2_Model[1][24] = new ModelRendererTurbo(this, 651, 247, textureX, textureY); // Import 
		gun_2_Model[1][25] = new ModelRendererTurbo(this, 659, 247, textureX, textureY); // Import 
		gun_2_Model[1][26] = new ModelRendererTurbo(this, 667, 247, textureX, textureY); // Import 
		gun_2_Model[1][27] = new ModelRendererTurbo(this, 419, 255, textureX, textureY); // Import 
		gun_2_Model[1][28] = new ModelRendererTurbo(this, 427, 255, textureX, textureY); // Import 
		gun_2_Model[1][29] = new ModelRendererTurbo(this, 435, 255, textureX, textureY); // Import 
		gun_2_Model[1][30] = new ModelRendererTurbo(this, 451, 255, textureX, textureY); // Import 
		gun_2_Model[1][31] = new ModelRendererTurbo(this, 459, 255, textureX, textureY); // Import 
		gun_2_Model[1][32] = new ModelRendererTurbo(this, 467, 255, textureX, textureY); // Import 
		gun_2_Model[1][33] = new ModelRendererTurbo(this, 475, 255, textureX, textureY); // Import 
		gun_2_Model[1][34] = new ModelRendererTurbo(this, 491, 255, textureX, textureY); // Import 
		gun_2_Model[1][35] = new ModelRendererTurbo(this, 515, 255, textureX, textureY); // Import 
		gun_2_Model[1][36] = new ModelRendererTurbo(this, 547, 255, textureX, textureY); // Import 
		gun_2_Model[1][37] = new ModelRendererTurbo(this, 555, 255, textureX, textureY); // Import 
		gun_2_Model[1][38] = new ModelRendererTurbo(this, 563, 255, textureX, textureY); // Import 
		gun_2_Model[1][39] = new ModelRendererTurbo(this, 571, 255, textureX, textureY); // Import 
		gun_2_Model[1][40] = new ModelRendererTurbo(this, 579, 255, textureX, textureY); // Import 
		gun_2_Model[1][41] = new ModelRendererTurbo(this, 587, 255, textureX, textureY); // Import 
		gun_2_Model[1][42] = new ModelRendererTurbo(this, 595, 255, textureX, textureY); // Import 
		gun_2_Model[1][43] = new ModelRendererTurbo(this, 603, 255, textureX, textureY); // Import 
		gun_2_Model[1][44] = new ModelRendererTurbo(this, 611, 255, textureX, textureY); // Import 
		gun_2_Model[1][45] = new ModelRendererTurbo(this, 619, 255, textureX, textureY); // Import 
		gun_2_Model[1][46] = new ModelRendererTurbo(this, 627, 255, textureX, textureY); // Import 
		gun_2_Model[1][47] = new ModelRendererTurbo(this, 635, 255, textureX, textureY); // Import 
		gun_2_Model[1][48] = new ModelRendererTurbo(this, 643, 255, textureX, textureY); // Import 
		gun_2_Model[1][49] = new ModelRendererTurbo(this, 651, 255, textureX, textureY); // Import 
		gun_2_Model[1][50] = new ModelRendererTurbo(this, 659, 255, textureX, textureY); // Import 
		gun_2_Model[1][51] = new ModelRendererTurbo(this, 667, 255, textureX, textureY); // Import 
		gun_2_Model[1][52] = new ModelRendererTurbo(this, 419, 263, textureX, textureY); // Import 
		gun_2_Model[1][53] = new ModelRendererTurbo(this, 427, 263, textureX, textureY); // Import 
		gun_2_Model[1][54] = new ModelRendererTurbo(this, 435, 263, textureX, textureY); // Import 
		gun_2_Model[1][55] = new ModelRendererTurbo(this, 443, 263, textureX, textureY); // Import 
		gun_2_Model[1][56] = new ModelRendererTurbo(this, 451, 263, textureX, textureY); // Import 
		gun_2_Model[1][57] = new ModelRendererTurbo(this, 459, 263, textureX, textureY); // Import 
		gun_2_Model[1][58] = new ModelRendererTurbo(this, 467, 263, textureX, textureY); // Import 
		gun_2_Model[1][59] = new ModelRendererTurbo(this, 475, 263, textureX, textureY); // Import 
		gun_2_Model[1][60] = new ModelRendererTurbo(this, 483, 263, textureX, textureY); // Import 
		gun_2_Model[1][61] = new ModelRendererTurbo(this, 491, 263, textureX, textureY); // Import 
		gun_2_Model[1][62] = new ModelRendererTurbo(this, 499, 263, textureX, textureY); // Import 
		gun_2_Model[1][63] = new ModelRendererTurbo(this, 507, 263, textureX, textureY); // Import 
		gun_2_Model[1][64] = new ModelRendererTurbo(this, 515, 263, textureX, textureY); // Import 
		gun_2_Model[1][65] = new ModelRendererTurbo(this, 531, 263, textureX, textureY); // Import 
		gun_2_Model[1][66] = new ModelRendererTurbo(this, 539, 263, textureX, textureY); // Import 
		gun_2_Model[1][67] = new ModelRendererTurbo(this, 547, 263, textureX, textureY); // Import 
		gun_2_Model[1][68] = new ModelRendererTurbo(this, 555, 263, textureX, textureY); // Import 
		gun_2_Model[1][69] = new ModelRendererTurbo(this, 563, 263, textureX, textureY); // Import 
		gun_2_Model[1][70] = new ModelRendererTurbo(this, 571, 263, textureX, textureY); // Import 
		gun_2_Model[1][71] = new ModelRendererTurbo(this, 579, 263, textureX, textureY); // Import 
		gun_2_Model[1][72] = new ModelRendererTurbo(this, 587, 263, textureX, textureY); // Import 
		gun_2_Model[1][73] = new ModelRendererTurbo(this, 595, 263, textureX, textureY); // Import 
		gun_2_Model[1][74] = new ModelRendererTurbo(this, 603, 263, textureX, textureY); // Import 
		gun_2_Model[1][75] = new ModelRendererTurbo(this, 611, 263, textureX, textureY); // Import 
		gun_2_Model[1][76] = new ModelRendererTurbo(this, 619, 263, textureX, textureY); // Import 
		gun_2_Model[1][77] = new ModelRendererTurbo(this, 627, 263, textureX, textureY); // Import 

		gun_2_Model[1][0].addShapeBox(-2.8F, 1.9F, -0.5F, 1, 1, 1, 0F,0.1F, 0.0F, -0.05F, 0.1F, 0.0F, -0.05F, 0.1F, 0.0F, -0.05F, 0.1F, 0.0F, -0.05F, -0.2F, -0.5F, -0.05F, -0.2F, -0.5F, -0.05F, -0.2F, -0.5F, -0.05F, -0.2F, -0.5F, -0.05F); // Import 

		gun_2_Model[1][1].addShapeBox(-2.8F, 0.9F, -0.5F, 1, 1, 1, 0F,0.1F, -0.5F, -0.05F, 0.1F, -0.5F, -0.05F, 0.1F, -0.5F, -0.05F, 0.1F, -0.5F, -0.05F, 0.1F, 0.0F, -0.05F, 0.1F, 0.0F, -0.05F, 0.1F, 0.0F, -0.05F, 0.1F, 0.0F, -0.05F); // Import 

		gun_2_Model[1][2].addShapeBox(-2.8F, 1.4F, -0.5F, 1, 1, 1, 0F,-0.2F, -0.4F, 0.05F, -0.2F, -0.4F, 0.05F, -0.2F, -0.4F, 0.05F, -0.2F, -0.4F, 0.05F, -0.2F, -0.4F, 0.05F, -0.2F, -0.4F, 0.05F, -0.2F, -0.4F, 0.05F, -0.2F, -0.4F, 0.05F); // Import 

		gun_2_Model[1][3].addShapeBox(-2.8F, 1.4F, -0.5F, 1, 1, 1, 0F,-0.4F, -0.2F, 0.05F, -0.4F, -0.2F, 0.05F, -0.4F, -0.2F, 0.05F, -0.4F, -0.2F, 0.05F, -0.2F, -0.6F, 0.05F, -0.2F, -0.6F, 0.05F, -0.2F, -0.6F, 0.05F, -0.2F, -0.6F, 0.05F); // Import 

		gun_2_Model[1][4].addShapeBox(-2.8F, 1.4F, -0.5F, 1, 1, 1, 0F,-0.2F, -0.6F, 0.05F, -0.2F, -0.6F, 0.05F, -0.2F, -0.6F, 0.05F, -0.2F, -0.6F, 0.05F, -0.4F, -0.2F, 0.05F, -0.4F, -0.2F, 0.05F, -0.4F, -0.2F, 0.05F, -0.4F, -0.2F, 0.05F); // Import 

		gun_2_Model[1][5].addShapeBox(-7F, 0.2F, -0.5F, 6, 1, 1, 0F,0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F); // Import 

		gun_2_Model[1][6].addShapeBox(-1.7F, 1.4F, -0.5F, 1, 1, 1, 0F,0.0F, 0.0F, -0.05F, -0.5F, 0.0F, -0.05F, -0.5F, 0.0F, -0.05F, 0.0F, 0.0F, -0.05F, 0.0F, -0.7F, -0.05F, -0.5F, -0.9F, -0.05F, -0.5F, -0.9F, -0.05F, 0.0F, -0.7F, -0.05F); // Import 

		gun_2_Model[1][7].addShapeBox(-7F, -0.8F, -0.5F, 3, 1, 1, 0F,-0.1F, -0.8F, -0.2F, -0.1F, -0.8F, -0.2F, -0.1F, -0.8F, -0.2F, -0.1F, -0.8F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F); // Import 

		gun_2_Model[1][8].addShapeBox(-6F, 0.2F, -0.5F, 5, 1, 1, 0F,0.0F, -0.2F, 0.05F, 0.0F, -0.2F, 0.05F, 0.0F, -0.2F, 0.05F, 0.0F, -0.2F, 0.05F, 0.0F, -0.2F, 0.05F, 0.0F, -0.2F, 0.05F, 0.0F, -0.2F, 0.05F, 0.0F, -0.2F, 0.05F); // Import 

		gun_2_Model[1][9].addShapeBox(-1.5F, -0.5F, -1F, 2, 2, 2, 0F,-0.5F, -1.4F, -0.2F, 0.0F, -1.4F, 0.0F, 0.0F, -1.4F, 0.0F, -0.5F, -1.4F, -0.2F, -0.5F, -0.1F, -0.7F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, -0.1F, -0.7F); // Import 

		gun_2_Model[1][10].addShapeBox(-1.5F, -0.5F, -1F, 2, 2, 2, 0F,-0.5F, -0.7F, -0.2F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, -0.5F, -0.7F, -0.2F, -0.5F, -0.6F, -0.2F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, -0.5F, -0.6F, -0.2F); // Import 

		gun_2_Model[1][11].addShapeBox(-5.7F, 2.4F, -0.5F, 1, 1, 1, 0F,0.2F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.2F, 0.0F, -0.3F, 0.3F, -0.5F, -0.3F, -0.2F, -0.5F, -0.3F, -0.2F, -0.5F, -0.3F, 0.3F, -0.5F, -0.3F); // Import 

		gun_2_Model[1][12].addShapeBox(-5.7F, 1.4F, -0.5F, 1, 1, 1, 0F,-0.1F, 0.0F, -0.3F, 0.2F, 0.0F, -0.3F, 0.2F, 0.0F, -0.3F, -0.1F, 0.0F, -0.3F, 0.2F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.2F, 0.0F, -0.3F); // Import 

		gun_2_Model[1][13].addShapeBox(-5.7F, 2.4F, -0.5F, 1, 1, 1, 0F,0.3F, -0.5F, -0.3F, -0.2F, -0.5F, -0.3F, -0.2F, -0.5F, -0.3F, 0.3F, -0.5F, -0.3F, 0.3F, -0.2F, -0.3F, -0.1F, -0.2F, -0.3F, -0.1F, -0.2F, -0.3F, 0.3F, -0.2F, -0.3F); // Import 

		gun_2_Model[1][14].addShapeBox(-5.7F, 3F, -0.5F, 1, 1, 1, 0F,0.3F, -0.2F, -0.3F, -0.1F, -0.2F, -0.3F, -0.1F, -0.2F, -0.3F, 0.3F, -0.2F, -0.3F, 0.1F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, 0.1F, -0.5F, -0.3F); // Import 

		gun_2_Model[1][15].addShapeBox(-5.7F, 1.4F, -0.5F, 1, 1, 1, 0F,-0.3F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.2F, 0.0F, -0.7F, -0.1F, 0.0F, -0.7F, 0.0F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, 0.0F, 0.0F, -0.7F, 0.2F, 0.0F, -0.7F); // Import 

		gun_2_Model[1][16].addShapeBox(-5.7F, 2.4F, -0.5F, 1, 1, 1, 0F,0.0F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, 0.0F, 0.0F, -0.7F, 0.2F, 0.0F, -0.7F, 0.1F, -0.5F, -0.2F, -0.4F, -0.5F, -0.2F, -0.2F, -0.5F, -0.7F, 0.3F, -0.5F, -0.7F); // Import 

		gun_2_Model[1][17].addShapeBox(-5.7F, 2.4F, -0.5F, 1, 1, 1, 0F,0.1F, -0.5F, -0.2F, -0.4F, -0.5F, -0.2F, -0.2F, -0.5F, -0.7F, 0.3F, -0.5F, -0.7F, 0.1F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.1F, -0.2F, -0.7F, 0.3F, -0.2F, -0.7F); // Import 

		gun_2_Model[1][18].addShapeBox(-5.7F, 3F, -0.5F, 1, 1, 1, 0F,0.1F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.1F, -0.2F, -0.7F, 0.3F, -0.2F, -0.7F, -0.1F, -0.6F, -0.2F, -0.5F, -0.6F, -0.2F, -0.3F, -0.5F, -0.7F, 0.1F, -0.5F, -0.7F); // Import 

		gun_2_Model[1][19].addShapeBox(-5.7F, 3F, -0.5F, 1, 1, 1, 0F,0.3F, -0.2F, -0.7F, -0.1F, -0.2F, -0.7F, -0.3F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.5F, -0.7F, -0.3F, -0.5F, -0.7F, -0.5F, -0.6F, -0.2F, -0.1F, -0.6F, -0.2F); // Import 

		gun_2_Model[1][20].addShapeBox(-5.7F, 2.4F, -0.5F, 1, 1, 1, 0F,0.3F, -0.5F, -0.7F, -0.2F, -0.5F, -0.7F, -0.4F, -0.5F, -0.2F, 0.1F, -0.5F, -0.2F, 0.3F, -0.2F, -0.7F, -0.1F, -0.2F, -0.7F, -0.3F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F); // Import 

		gun_2_Model[1][21].addShapeBox(-5.7F, 2.4F, -0.5F, 1, 1, 1, 0F,0.2F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, -0.2F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.3F, -0.5F, -0.7F, -0.2F, -0.5F, -0.7F, -0.4F, -0.5F, -0.2F, 0.1F, -0.5F, -0.2F); // Import 

		gun_2_Model[1][22].addShapeBox(-5.7F, 1.4F, -0.5F, 1, 1, 1, 0F,-0.1F, 0.0F, -0.7F, 0.2F, 0.0F, -0.7F, 0.0F, 0.0F, -0.2F, -0.3F, 0.0F, -0.2F, 0.2F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, -0.2F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F); // Import 

		gun_2_Model[1][23].addShapeBox(-2.75F, -1.5F, -0.5F, 2, 1, 1, 0F,0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F); // Import 

		gun_2_Model[1][24].addShapeBox(-0.55F, -1.85F, -1F, 1, 2, 2, 0F,0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F); // Import 

		gun_2_Model[1][25].addShapeBox(-3.95F, -1.85F, -1F, 1, 2, 2, 0F,0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F); // Import 

		gun_2_Model[1][26].addShapeBox(-3.95F, -1.85F, 1.2F, 2, 2, 1, 0F,-1.0F, -0.5F, 0.7F, -0.3F, -0.5F, 0.0F, -0.8F, -0.5F, 0.0F, 0.0F, -0.5F, -1.2F, -1.0F, 0.0F, 0.7F, -0.3F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, 0.0F, 0.0F, -1.2F); // Import 

		gun_2_Model[1][27].addShapeBox(-1.55F, -1.85F, 1.2F, 2, 2, 1, 0F,-0.3F, -0.5F, 0.0F, -1.0F, -0.5F, 0.7F, 0.0F, -0.5F, -1.2F, -0.8F, -0.5F, 0.0F, -0.3F, 0.0F, 0.0F, -1.0F, 0.0F, 0.7F, 0.0F, 0.0F, -1.2F, -0.8F, 0.0F, 0.0F); // Import 

		gun_2_Model[1][28].addShapeBox(-2.75F, -1.85F, 1.2F, 2, 2, 1, 0F,-0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import 

		gun_2_Model[1][29].addShapeBox(-3.25F, -1.85F, -1.5F, 3, 2, 3, 0F,0.0F, -0.55F, 0.0F, 0.0F, -0.55F, 0.0F, 0.0F, -0.55F, 0.0F, 0.0F, -0.55F, 0.0F, 0.0F, -0.05F, 0.0F, 0.0F, -0.05F, 0.0F, 0.0F, -0.05F, 0.0F, 0.0F, -0.05F, 0.0F); // Import 

		gun_2_Model[1][30].addShapeBox(-3.95F, -1.85F, -2.2F, 2, 2, 1, 0F,0.0F, -0.5F, -1.2F, -0.8F, -0.5F, 0.0F, -0.3F, -0.5F, 0.0F, -1.0F, -0.5F, 0.7F, 0.0F, 0.0F, -1.2F, -0.8F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -1.0F, 0.0F, 0.7F); // Import 

		gun_2_Model[1][31].addShapeBox(-1.55F, -1.85F, -2.2F, 2, 2, 1, 0F,-0.8F, -0.5F, 0.0F, 0.0F, -0.5F, -1.2F, -1.0F, -0.5F, 0.7F, -0.3F, -0.5F, 0.0F, -0.8F, 0.0F, 0.0F, 0.0F, 0.0F, -1.2F, -1.0F, 0.0F, 0.7F, -0.3F, 0.0F, 0.0F); // Import 

		gun_2_Model[1][32].addShapeBox(-2.75F, -1.85F, -2.2F, 2, 2, 1, 0F,0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F); // Import 

		gun_2_Model[1][33].addShapeBox(0.5F, -0.3F, -0.5F, 3, 1, 1, 0F,0.0F, -0.1F, -0.1F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.1F, -0.1F); // Import 

		gun_2_Model[1][34].addShapeBox(3.5F, -0.3F, -0.5F, 9, 1, 1, 0F,0.0F, -0.2F, -0.2F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.2F, -0.2F); // Import 

		gun_2_Model[1][35].addShapeBox(0.5F, 0.5F, -0.5F, 11, 1, 1, 0F,0.0F, -0.22F, -0.22F, 0.0F, -0.22F, -0.22F, 0.0F, -0.22F, -0.22F, 0.0F, -0.22F, -0.22F, 0.0F, -0.22F, -0.22F, 0.0F, -0.22F, -0.22F, 0.0F, -0.22F, -0.22F, 0.0F, -0.22F, -0.22F); // Import 

		gun_2_Model[1][36].addShapeBox(2.8F, -0.3F, -0.5F, 1, 1, 1, 0F,-0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F); // Import 

		gun_2_Model[1][37].addShapeBox(10.1F, 0.5F, -0.5F, 1, 1, 1, 0F,-0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F); // Import 

		gun_2_Model[1][38].addShapeBox(10.1F, -0.5F, -0.5F, 1, 1, 1, 0F,-0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, 0.1F, -0.2F, -0.3F, 0.1F, -0.2F, -0.3F, 0.1F, -0.2F, -0.3F, 0.1F, -0.2F); // Import 

		gun_2_Model[1][39].addShapeBox(11.5F, -1F, -0.5F, 1, 1, 1, 0F,-0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F); // Import 

		gun_2_Model[1][40].addShapeBox(2.8F, -1.3F, -0.5F, 1, 1, 1, 0F,-0.35F, 0.0F, -0.35F, -0.35F, 0.0F, -0.35F, -0.35F, 0.0F, -0.35F, -0.35F, 0.0F, -0.35F, -0.35F, 0.1F, -0.35F, -0.35F, 0.1F, -0.35F, -0.35F, 0.1F, -0.35F, -0.35F, 0.1F, -0.35F); // Import 

		gun_2_Model[1][41].addShapeBox(2.8F, -2.3F, -0.5F, 1, 1, 1, 0F,-0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F); // Import 

		gun_2_Model[1][42].addShapeBox(2.8F, -1.5F, -0.5F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import 

		gun_2_Model[1][43].addShapeBox(2.8F, -2.7F, -0.5F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F); // Import 

		gun_2_Model[1][44].addShapeBox(-2.25F, -2.85F, -1F, 1, 2, 1, 0F,-0.3F, -0.7F, -0.2F, -0.3F, -0.7F, -0.2F, -0.3F, -0.7F, -0.4F, -0.3F, -0.7F, -0.4F, -0.3F, -0.5F, -0.2F, -0.3F, -0.5F, -0.2F, -0.3F, -0.5F, -0.4F, -0.3F, -0.5F, -0.4F); // Import 

		gun_2_Model[1][45].addShapeBox(-2.25F, -2.85F, 0F, 1, 2, 1, 0F,-0.3F, -0.7F, -0.4F, -0.3F, -0.7F, -0.4F, -0.3F, -0.7F, -0.2F, -0.3F, -0.7F, -0.2F, -0.3F, -0.5F, -0.4F, -0.3F, -0.5F, -0.4F, -0.3F, -0.5F, -0.2F, -0.3F, -0.5F, -0.2F); // Import 

		gun_2_Model[1][46].addShapeBox(-2.25F, -2.85F, -0.5F, 1, 1, 1, 0F,-0.3F, -0.7F, -0.1F, -0.3F, -0.7F, -0.1F, -0.3F, -0.7F, -0.1F, -0.3F, -0.7F, -0.1F, -0.3F, 0.0F, -0.1F, -0.3F, 0.0F, -0.1F, -0.3F, 0.0F, -0.1F, -0.3F, 0.0F, -0.1F); // Import 

		gun_2_Model[1][47].addShapeBox(2.8F, -3.7F, -1F, 1, 1, 1, 0F,-0.35F, -0.1F, 0.0F, -0.35F, -0.1F, 0.0F, -0.35F, -0.2F, -0.8F, -0.35F, -0.2F, -0.8F, -0.35F, -0.1F, 0.0F, -0.35F, -0.1F, 0.0F, -0.35F, -0.2F, -0.8F, -0.35F, -0.2F, -0.8F); // Import 

		gun_2_Model[1][48].addShapeBox(2.8F, -3.7F, 0F, 1, 1, 1, 0F,-0.35F, -0.2F, -0.8F, -0.35F, -0.2F, -0.8F, -0.35F, -0.1F, 0.0F, -0.35F, -0.1F, 0.0F, -0.35F, -0.2F, -0.8F, -0.35F, -0.2F, -0.8F, -0.35F, -0.1F, 0.0F, -0.35F, -0.1F, 0.0F); // Import 

		gun_2_Model[1][49].addShapeBox(2.8F, -4.2F, -1F, 1, 1, 2, 0F,-0.35F, 0.0F, -0.6F, -0.35F, 0.0F, -0.6F, -0.35F, 0.0F, -0.6F, -0.35F, 0.0F, -0.6F, -0.35F, -0.8F, -0.7F, -0.35F, -0.8F, -0.7F, -0.35F, -0.8F, -0.7F, -0.35F, -0.8F, -0.7F); // Import 

		gun_2_Model[1][50].addShapeBox(2.8F, -4.6F, -1F, 1, 1, 1, 0F,-0.35F, -0.4F, -0.6F, -0.35F, -0.4F, -0.6F, -0.35F, -0.6F, -0.3F, -0.35F, -0.6F, -0.3F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.1F, -0.8F, -0.35F, 0.1F, -0.8F); // Import 

		gun_2_Model[1][51].addShapeBox(2.8F, -4.6F, 0F, 1, 1, 1, 0F,-0.35F, -0.6F, -0.3F, -0.35F, -0.6F, -0.3F, -0.35F, -0.4F, -0.6F, -0.35F, -0.4F, -0.6F, -0.35F, 0.1F, -0.8F, -0.35F, 0.1F, -0.8F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F); // Import 

		gun_2_Model[1][52].addShapeBox(2.8F, -2.8F, -1F, 1, 1, 1, 0F,-0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.1F, -0.8F, -0.35F, 0.1F, -0.8F, -0.35F, -0.4F, -0.6F, -0.35F, -0.4F, -0.6F, -0.35F, -0.6F, -0.3F, -0.35F, -0.6F, -0.3F); // Import 

		gun_2_Model[1][53].addShapeBox(2.8F, -2.8F, 0F, 1, 1, 1, 0F,-0.35F, 0.1F, -0.8F, -0.35F, 0.1F, -0.8F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, -0.6F, -0.3F, -0.35F, -0.6F, -0.3F, -0.35F, -0.4F, -0.6F, -0.35F, -0.4F, -0.6F); // Import 

		gun_2_Model[1][54].addShapeBox(2.8F, -4.1F, -0.5F, 1, 2, 1, 0F,-0.47F, 0.0F, -0.47F, -0.47F, 0.0F, -0.47F, -0.47F, 0.0F, -0.47F, -0.47F, 0.0F, -0.47F, -0.47F, 0.0F, -0.47F, -0.47F, 0.0F, -0.47F, -0.47F, 0.0F, -0.47F, -0.47F, 0.0F, -0.47F); // Import 

		gun_2_Model[1][55].addShapeBox(2.8F, -3.7F, -1F, 1, 1, 2, 0F,-0.47F, -0.47F, -0.1F, -0.47F, -0.47F, -0.1F, -0.47F, -0.47F, -0.1F, -0.47F, -0.47F, -0.1F, -0.47F, -0.47F, -0.1F, -0.47F, -0.47F, -0.1F, -0.47F, -0.47F, -0.1F, -0.47F, -0.47F, -0.1F); // Import 

		gun_2_Model[1][56].addShapeBox(-4.7F, 1.4F, -0.5F, 1, 1, 1, 0F,0.0F, -0.4F, -0.3F, 0.0F, -1.1F, -0.3F, 0.0F, -1.1F, -0.3F, 0.0F, -0.4F, -0.3F, 0.0F, -0.4F, -0.3F, 0.0F, 0.3F, -0.3F, 0.0F, 0.3F, -0.3F, 0.0F, -0.4F, -0.3F); // Import 

		gun_2_Model[1][57].addShapeBox(-3.7F, 2.1F, -0.5F, 1, 1, 1, 0F,0.0F, -0.4F, -0.3F, -0.6F, -0.4F, -0.3F, -0.6F, -0.4F, -0.3F, 0.0F, -0.4F, -0.3F, 0.0F, -0.4F, -0.3F, -0.8F, -0.4F, -0.3F, -0.8F, -0.4F, -0.3F, 0.0F, -0.4F, -0.3F); // Import 

		gun_2_Model[1][58].addShapeBox(-4.2F, 0.7F, -0.5F, 1, 1, 1, 0F,0.0F, 0.0F, -0.3F, 0.0F, -1.1F, -0.3F, 0.0F, -1.1F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, -0.7F, -0.3F, -0.2F, 0.3F, -0.3F, -0.2F, 0.3F, -0.3F, 0.0F, -0.7F, -0.3F); // Import 

		gun_2_Model[1][59].addShapeBox(-3.5F, 1.4F, -0.5F, 1, 1, 1, 0F,-0.1F, -0.6F, -0.3F, -0.7F, -0.4F, -0.3F, -0.7F, -0.4F, -0.3F, -0.1F, -0.6F, -0.3F, 0.0F, 0.1F, -0.3F, -0.8F, 0.1F, -0.3F, -0.8F, 0.1F, -0.3F, 0.0F, 0.1F, -0.3F); // Import 

		gun_2_Model[1][60].addShapeBox(11.5F, -1.5F, -0.5F, 1, 1, 1, 0F,-0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.1F, -0.4F, -0.4F, 0.1F, -0.4F, -0.4F, 0.1F, -0.4F, -0.4F, 0.1F, -0.4F); // Import 

		gun_2_Model[1][61].addShapeBox(11.5F, -0.5F, -0.5F, 1, 1, 1, 0F,-0.35F, 0.0F, -0.35F, -0.35F, 0.0F, -0.35F, -0.35F, 0.0F, -0.35F, -0.35F, 0.0F, -0.35F, -0.35F, 0.0F, -0.35F, -0.35F, 0.0F, -0.35F, -0.35F, 0.0F, -0.35F, -0.35F, 0.0F, -0.35F); // Import 

		gun_2_Model[1][62].addShapeBox(11.5F, -2F, -0.5F, 1, 1, 1, 0F,-0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F); // Import 

		gun_2_Model[1][63].addShapeBox(11.5F, -2.5F, -0.5F, 1, 1, 1, 0F,-0.55F, 0.0F, -0.47F, -0.4F, 0.0F, -0.47F, -0.4F, 0.0F, -0.47F, -0.55F, 0.0F, -0.47F, -0.4F, 0.0F, -0.47F, -0.4F, 0.0F, -0.47F, -0.4F, 0.0F, -0.47F, -0.4F, 0.0F, -0.47F); // Import 

		gun_2_Model[1][64].addShapeBox(-7F, 1.4F, -0.5F, 3, 1, 1, 0F,0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, -0.1F, -0.8F, -0.3F, -0.1F, -0.8F, -0.3F, -0.1F, -0.8F, -0.3F, -0.1F, -0.8F, -0.3F); // Import 

		gun_2_Model[1][65].addShapeBox(-10F, 0.2F, -0.5F, 1, 1, 1, 0F,-0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F); // Import 

		gun_2_Model[1][66].addShapeBox(-10F, -0.6F, -0.5F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Import 

		gun_2_Model[1][67].addShapeBox(-10F, -0.2F, -0.5F, 1, 1, 1, 0F,-0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F); // Import 

		gun_2_Model[1][68].addShapeBox(-10F, 0.6F, -0.5F, 1, 1, 1, 0F,-0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F); // Import 

		gun_2_Model[1][69].addShapeBox(-10F, 1F, -0.5F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Import 

		gun_2_Model[1][70].addShapeBox(-10F, -0.6F, -0.5F, 1, 1, 1, 0F,-0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.2F, -0.8F, -0.2F, 0.0F, -0.8F, -0.2F, 0.0F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F); // Import 

		gun_2_Model[1][71].addShapeBox(-10F, 1F, -0.5F, 1, 1, 1, 0F,-0.2F, -0.8F, -0.2F, 0.0F, -0.8F, -0.2F, 0.0F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F); // Import 

		gun_2_Model[1][72].addShapeBox(-9.2F, 1.3F, -0.5F, 1, 1, 1, 0F,0.0F, -0.4F, -0.3F, 0.0F, -0.4F, -0.3F, 0.0F, -0.4F, -0.3F, 0.0F, -0.4F, -0.3F, 0.0F, -0.4F, -0.3F, 0.0F, -0.4F, -0.3F, 0.0F, -0.4F, -0.3F, 0.0F, -0.4F, -0.3F); // Import 

		gun_2_Model[1][73].addShapeBox(-8.2F, 1.3F, -0.5F, 1, 1, 1, 0F,0.0F, -0.4F, -0.3F, 0.0F, 0.1F, -0.3F, 0.0F, 0.1F, -0.3F, 0.0F, -0.4F, -0.3F, 0.0F, -0.4F, -0.3F, 0.0F, -0.9F, -0.3F, 0.0F, -0.9F, -0.3F, 0.0F, -0.4F, -0.3F); // Import 

		gun_2_Model[1][74].addShapeBox(-7.2F, 0.8F, -0.5F, 1, 1, 1, 0F,0.0F, -0.4F, -0.3F, -0.5F, 0.6F, -0.3F, -0.5F, 0.6F, -0.3F, 0.0F, -0.4F, -0.3F, 0.0F, -0.4F, -0.3F, -0.4F, -1.4F, -0.3F, -0.4F, -1.4F, -0.3F, 0.0F, -0.4F, -0.3F); // Import 

		gun_2_Model[1][75].addShapeBox(-7.2F, -0.4F, -0.5F, 1, 1, 1, 0F,0.0F, -0.4F, -0.3F, -0.4F, -1.4F, -0.3F, -0.4F, -1.4F, -0.3F, 0.0F, -0.4F, -0.3F, 0.0F, -0.4F, -0.3F, -0.5F, 0.6F, -0.3F, -0.5F, 0.6F, -0.3F, 0.0F, -0.4F, -0.3F); // Import 

		gun_2_Model[1][76].addShapeBox(-8.2F, -0.9F, -0.5F, 1, 1, 1, 0F,0.0F, -0.4F, -0.3F, 0.0F, -0.9F, -0.3F, 0.0F, -0.9F, -0.3F, 0.0F, -0.4F, -0.3F, 0.0F, -0.4F, -0.3F, 0.0F, 0.1F, -0.3F, 0.0F, 0.1F, -0.3F, 0.0F, -0.4F, -0.3F); // Import 

		gun_2_Model[1][77].addShapeBox(-9.2F, -0.9F, -0.5F, 1, 1, 1, 0F,0.0F, -0.4F, -0.3F, 0.0F, -0.4F, -0.3F, 0.0F, -0.4F, -0.3F, 0.0F, -0.4F, -0.3F, 0.0F, -0.4F, -0.3F, 0.0F, -0.4F, -0.3F, 0.0F, -0.4F, -0.3F, 0.0F, -0.4F, -0.3F); // Import 

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[1])
		{
			gunPart.setRotationPoint(20F, -52F, 0F);
		}


		gun_2_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("TailGun", gun_2_Model);
	}
}