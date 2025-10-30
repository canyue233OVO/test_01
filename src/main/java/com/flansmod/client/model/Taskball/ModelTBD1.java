//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: TBD1
// Model Creator: 
// Created on: 05.04.2023 - 21:56:06
// Last changed on: 05.04.2023 - 21:56:06

package com.flansmod.client.model.Taskball; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelTBD1 extends ModelPlane //Same as Filename
{
	int textureX = 2048;
	int textureY = 1024;

	public ModelTBD1() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[471];
		noseModel = new ModelRendererTurbo[66];
		tailModel = new ModelRendererTurbo[50];
		leftWingModel = new ModelRendererTurbo[160];
		rightWingModel = new ModelRendererTurbo[175];
		yawFlapModel = new ModelRendererTurbo[7];
		pitchFlapLeftModel = new ModelRendererTurbo[1];
		pitchFlapRightModel = new ModelRendererTurbo[1];
		pitchFlapLeftWingModel = new ModelRendererTurbo[1];
		pitchFlapRightWingModel = new ModelRendererTurbo[1];
		tailWheelModel = new ModelRendererTurbo[9];
		leftWingWheelModel = new ModelRendererTurbo[5];
		rightWingWheelModel = new ModelRendererTurbo[5];

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

		initGuns();

		translateAll(0F, 32F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 911, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 73, 911, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 153, 911, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 225, 911, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 297, 911, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 377, 911, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 449, 911, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 521, 911, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 601, 911, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 1, 863, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 105, 863, textureX, textureY); // Box 10
		bodyModel[11] = new ModelRendererTurbo(this, 209, 863, textureX, textureY); // Box 11
		bodyModel[12] = new ModelRendererTurbo(this, 305, 863, textureX, textureY); // Box 12
		bodyModel[13] = new ModelRendererTurbo(this, 401, 863, textureX, textureY); // Box 13
		bodyModel[14] = new ModelRendererTurbo(this, 1, 959, textureX, textureY); // Box 14
		bodyModel[15] = new ModelRendererTurbo(this, 57, 959, textureX, textureY); // Box 15
		bodyModel[16] = new ModelRendererTurbo(this, 121, 959, textureX, textureY); // Box 16
		bodyModel[17] = new ModelRendererTurbo(this, 185, 959, textureX, textureY); // Box 17
		bodyModel[18] = new ModelRendererTurbo(this, 657, 911, textureX, textureY); // Box 21
		bodyModel[19] = new ModelRendererTurbo(this, 753, 911, textureX, textureY); // Box 22
		bodyModel[20] = new ModelRendererTurbo(this, 473, 863, textureX, textureY); // Box 23
		bodyModel[21] = new ModelRendererTurbo(this, 449, 959, textureX, textureY); // Box 24
		bodyModel[22] = new ModelRendererTurbo(this, 1281, 863, textureX, textureY); // Box 33
		bodyModel[23] = new ModelRendererTurbo(this, 913, 911, textureX, textureY); // Box 35
		bodyModel[24] = new ModelRendererTurbo(this, 1017, 911, textureX, textureY); // Box 36
		bodyModel[25] = new ModelRendererTurbo(this, 1105, 911, textureX, textureY); // Box 37
		bodyModel[26] = new ModelRendererTurbo(this, 633, 959, textureX, textureY); // Box 48
		bodyModel[27] = new ModelRendererTurbo(this, 737, 911, textureX, textureY); // Box 50
		bodyModel[28] = new ModelRendererTurbo(this, 1185, 911, textureX, textureY); // Box 51
		bodyModel[29] = new ModelRendererTurbo(this, 897, 911, textureX, textureY); // Box 52
		bodyModel[30] = new ModelRendererTurbo(this, 0, 505, textureX, textureY); // Box 53
		bodyModel[31] = new ModelRendererTurbo(this, 921, 911, textureX, textureY); // Box 62
		bodyModel[32] = new ModelRendererTurbo(this, 1001, 911, textureX, textureY); // Box 63
		bodyModel[33] = new ModelRendererTurbo(this, 1009, 911, textureX, textureY); // Box 64
		bodyModel[34] = new ModelRendererTurbo(this, 737, 911, textureX, textureY); // Box 65
		bodyModel[35] = new ModelRendererTurbo(this, 761, 911, textureX, textureY); // Box 66
		bodyModel[36] = new ModelRendererTurbo(this, 1089, 911, textureX, textureY); // Box 67
		bodyModel[37] = new ModelRendererTurbo(this, 1217, 911, textureX, textureY); // Box 68
		bodyModel[38] = new ModelRendererTurbo(this, 1249, 911, textureX, textureY); // Box 69
		bodyModel[39] = new ModelRendererTurbo(this, 1281, 911, textureX, textureY); // Box 70
		bodyModel[40] = new ModelRendererTurbo(this, 1017, 911, textureX, textureY); // Box 71
		bodyModel[41] = new ModelRendererTurbo(this, 1313, 911, textureX, textureY); // Box 72
		bodyModel[42] = new ModelRendererTurbo(this, 1185, 911, textureX, textureY); // Box 73
		bodyModel[43] = new ModelRendererTurbo(this, 897, 911, textureX, textureY); // Box 74
		bodyModel[44] = new ModelRendererTurbo(this, 1321, 911, textureX, textureY); // Box 75
		bodyModel[45] = new ModelRendererTurbo(this, 1353, 911, textureX, textureY); // Box 76
		bodyModel[46] = new ModelRendererTurbo(this, 1385, 911, textureX, textureY); // Box 77
		bodyModel[47] = new ModelRendererTurbo(this, 289, 911, textureX, textureY); // Box 78
		bodyModel[48] = new ModelRendererTurbo(this, 369, 911, textureX, textureY); // Box 79
		bodyModel[49] = new ModelRendererTurbo(this, 513, 911, textureX, textureY); // Box 80
		bodyModel[50] = new ModelRendererTurbo(this, 593, 911, textureX, textureY); // Box 81
		bodyModel[51] = new ModelRendererTurbo(this, 1417, 911, textureX, textureY); // Box 82
		bodyModel[52] = new ModelRendererTurbo(this, 1433, 911, textureX, textureY); // Box 83
		bodyModel[53] = new ModelRendererTurbo(this, 1441, 911, textureX, textureY); // Box 84
		bodyModel[54] = new ModelRendererTurbo(this, 1449, 911, textureX, textureY); // Box 85
		bodyModel[55] = new ModelRendererTurbo(this, 1609, 935, textureX, textureY); // Box 86
		bodyModel[56] = new ModelRendererTurbo(this, 1633, 935, textureX, textureY); // Box 87
		bodyModel[57] = new ModelRendererTurbo(this, 1665, 935, textureX, textureY); // Box 88
		bodyModel[58] = new ModelRendererTurbo(this, 1697, 935, textureX, textureY); // Box 89
		bodyModel[59] = new ModelRendererTurbo(this, 1457, 911, textureX, textureY); // Box 90
		bodyModel[60] = new ModelRendererTurbo(this, 1465, 911, textureX, textureY); // Box 91
		bodyModel[61] = new ModelRendererTurbo(this, 1473, 911, textureX, textureY); // Box 92
		bodyModel[62] = new ModelRendererTurbo(this, 1481, 911, textureX, textureY); // Box 93
		bodyModel[63] = new ModelRendererTurbo(this, 1497, 911, textureX, textureY); // Box 94
		bodyModel[64] = new ModelRendererTurbo(this, 1521, 911, textureX, textureY); // Box 95
		bodyModel[65] = new ModelRendererTurbo(this, 1529, 911, textureX, textureY); // Box 96
		bodyModel[66] = new ModelRendererTurbo(this, 1729, 935, textureX, textureY); // Box 97
		bodyModel[67] = new ModelRendererTurbo(this, 1537, 911, textureX, textureY); // Box 98
		bodyModel[68] = new ModelRendererTurbo(this, 1569, 911, textureX, textureY); // Box 99
		bodyModel[69] = new ModelRendererTurbo(this, 1, 935, textureX, textureY); // Box 127
		bodyModel[70] = new ModelRendererTurbo(this, 73, 935, textureX, textureY); // Box 128
		bodyModel[71] = new ModelRendererTurbo(this, 153, 935, textureX, textureY); // Box 129
		bodyModel[72] = new ModelRendererTurbo(this, 225, 935, textureX, textureY); // Box 130
		bodyModel[73] = new ModelRendererTurbo(this, 297, 935, textureX, textureY); // Box 131
		bodyModel[74] = new ModelRendererTurbo(this, 377, 935, textureX, textureY); // Box 132
		bodyModel[75] = new ModelRendererTurbo(this, 449, 935, textureX, textureY); // Box 133
		bodyModel[76] = new ModelRendererTurbo(this, 521, 935, textureX, textureY); // Box 134
		bodyModel[77] = new ModelRendererTurbo(this, 601, 935, textureX, textureY); // Box 135
		bodyModel[78] = new ModelRendererTurbo(this, 1, 887, textureX, textureY); // Box 136
		bodyModel[79] = new ModelRendererTurbo(this, 105, 887, textureX, textureY); // Box 137
		bodyModel[80] = new ModelRendererTurbo(this, 209, 887, textureX, textureY); // Box 138
		bodyModel[81] = new ModelRendererTurbo(this, 305, 887, textureX, textureY); // Box 139
		bodyModel[82] = new ModelRendererTurbo(this, 401, 887, textureX, textureY); // Box 140
		bodyModel[83] = new ModelRendererTurbo(this, 1, 983, textureX, textureY); // Box 141
		bodyModel[84] = new ModelRendererTurbo(this, 57, 983, textureX, textureY); // Box 142
		bodyModel[85] = new ModelRendererTurbo(this, 121, 983, textureX, textureY); // Box 143
		bodyModel[86] = new ModelRendererTurbo(this, 185, 983, textureX, textureY); // Box 144
		bodyModel[87] = new ModelRendererTurbo(this, 657, 935, textureX, textureY); // Box 148
		bodyModel[88] = new ModelRendererTurbo(this, 753, 935, textureX, textureY); // Box 149
		bodyModel[89] = new ModelRendererTurbo(this, 473, 887, textureX, textureY); // Box 150
		bodyModel[90] = new ModelRendererTurbo(this, 449, 983, textureX, textureY); // Box 151
		bodyModel[91] = new ModelRendererTurbo(this, 1281, 887, textureX, textureY); // Box 160
		bodyModel[92] = new ModelRendererTurbo(this, 913, 935, textureX, textureY); // Box 162
		bodyModel[93] = new ModelRendererTurbo(this, 1017, 935, textureX, textureY); // Box 163
		bodyModel[94] = new ModelRendererTurbo(this, 1105, 935, textureX, textureY); // Box 164
		bodyModel[95] = new ModelRendererTurbo(this, 633, 983, textureX, textureY); // Box 174
		bodyModel[96] = new ModelRendererTurbo(this, 737, 935, textureX, textureY); // Box 176
		bodyModel[97] = new ModelRendererTurbo(this, 1185, 935, textureX, textureY); // Box 177
		bodyModel[98] = new ModelRendererTurbo(this, 897, 935, textureX, textureY); // Box 178
		bodyModel[99] = new ModelRendererTurbo(this, 0, 505, textureX, textureY); // Box 179
		bodyModel[100] = new ModelRendererTurbo(this, 921, 935, textureX, textureY); // Box 188
		bodyModel[101] = new ModelRendererTurbo(this, 1001, 935, textureX, textureY); // Box 189
		bodyModel[102] = new ModelRendererTurbo(this, 1009, 935, textureX, textureY); // Box 190
		bodyModel[103] = new ModelRendererTurbo(this, 737, 935, textureX, textureY); // Box 191
		bodyModel[104] = new ModelRendererTurbo(this, 761, 935, textureX, textureY); // Box 192
		bodyModel[105] = new ModelRendererTurbo(this, 1089, 935, textureX, textureY); // Box 193
		bodyModel[106] = new ModelRendererTurbo(this, 1217, 935, textureX, textureY); // Box 194
		bodyModel[107] = new ModelRendererTurbo(this, 1249, 935, textureX, textureY); // Box 195
		bodyModel[108] = new ModelRendererTurbo(this, 1281, 935, textureX, textureY); // Box 196
		bodyModel[109] = new ModelRendererTurbo(this, 1017, 935, textureX, textureY); // Box 197
		bodyModel[110] = new ModelRendererTurbo(this, 1313, 935, textureX, textureY); // Box 198
		bodyModel[111] = new ModelRendererTurbo(this, 1185, 935, textureX, textureY); // Box 199
		bodyModel[112] = new ModelRendererTurbo(this, 897, 935, textureX, textureY); // Box 200
		bodyModel[113] = new ModelRendererTurbo(this, 1321, 935, textureX, textureY); // Box 201
		bodyModel[114] = new ModelRendererTurbo(this, 1353, 935, textureX, textureY); // Box 202
		bodyModel[115] = new ModelRendererTurbo(this, 1385, 935, textureX, textureY); // Box 203
		bodyModel[116] = new ModelRendererTurbo(this, 289, 935, textureX, textureY); // Box 204
		bodyModel[117] = new ModelRendererTurbo(this, 369, 935, textureX, textureY); // Box 205
		bodyModel[118] = new ModelRendererTurbo(this, 513, 935, textureX, textureY); // Box 206
		bodyModel[119] = new ModelRendererTurbo(this, 593, 935, textureX, textureY); // Box 207
		bodyModel[120] = new ModelRendererTurbo(this, 1417, 935, textureX, textureY); // Box 208
		bodyModel[121] = new ModelRendererTurbo(this, 1433, 935, textureX, textureY); // Box 209
		bodyModel[122] = new ModelRendererTurbo(this, 1441, 935, textureX, textureY); // Box 210
		bodyModel[123] = new ModelRendererTurbo(this, 1449, 935, textureX, textureY); // Box 211
		bodyModel[124] = new ModelRendererTurbo(this, 1457, 935, textureX, textureY); // Box 216
		bodyModel[125] = new ModelRendererTurbo(this, 1465, 935, textureX, textureY); // Box 217
		bodyModel[126] = new ModelRendererTurbo(this, 1473, 935, textureX, textureY); // Box 218
		bodyModel[127] = new ModelRendererTurbo(this, 1481, 935, textureX, textureY); // Box 219
		bodyModel[128] = new ModelRendererTurbo(this, 1497, 935, textureX, textureY); // Box 220
		bodyModel[129] = new ModelRendererTurbo(this, 1521, 935, textureX, textureY); // Box 221
		bodyModel[130] = new ModelRendererTurbo(this, 1529, 935, textureX, textureY); // Box 222
		bodyModel[131] = new ModelRendererTurbo(this, 1537, 935, textureX, textureY); // Box 224
		bodyModel[132] = new ModelRendererTurbo(this, 1569, 935, textureX, textureY); // Box 225
		bodyModel[133] = new ModelRendererTurbo(this, 1753, 935, textureX, textureY); // Box 283
		bodyModel[134] = new ModelRendererTurbo(this, 1761, 935, textureX, textureY); // Box 284
		bodyModel[135] = new ModelRendererTurbo(this, 1769, 935, textureX, textureY); // Box 285
		bodyModel[136] = new ModelRendererTurbo(this, 1777, 935, textureX, textureY); // Box 286
		bodyModel[137] = new ModelRendererTurbo(this, 1785, 935, textureX, textureY); // Box 287
		bodyModel[138] = new ModelRendererTurbo(this, 1, 435, textureX, textureY); // Box 484
		bodyModel[139] = new ModelRendererTurbo(this, 33, 435, textureX, textureY); // Box 485
		bodyModel[140] = new ModelRendererTurbo(this, 49, 435, textureX, textureY); // Box 487
		bodyModel[141] = new ModelRendererTurbo(this, 57, 435, textureX, textureY); // Box 488
		bodyModel[142] = new ModelRendererTurbo(this, 89, 435, textureX, textureY); // Box 489
		bodyModel[143] = new ModelRendererTurbo(this, 105, 435, textureX, textureY); // Box 490
		bodyModel[144] = new ModelRendererTurbo(this, 73, 435, textureX, textureY); // Box 491
		bodyModel[145] = new ModelRendererTurbo(this, 137, 435, textureX, textureY); // Box 492
		bodyModel[146] = new ModelRendererTurbo(this, 145, 435, textureX, textureY); // Box 493
		bodyModel[147] = new ModelRendererTurbo(this, 177, 435, textureX, textureY); // Box 494
		bodyModel[148] = new ModelRendererTurbo(this, 201, 435, textureX, textureY); // Box 495
		bodyModel[149] = new ModelRendererTurbo(this, 225, 435, textureX, textureY); // Box 496
		bodyModel[150] = new ModelRendererTurbo(this, 233, 435, textureX, textureY); // Box 497
		bodyModel[151] = new ModelRendererTurbo(this, 241, 435, textureX, textureY); // Box 498
		bodyModel[152] = new ModelRendererTurbo(this, 249, 435, textureX, textureY); // Box 499
		bodyModel[153] = new ModelRendererTurbo(this, 257, 435, textureX, textureY); // Box 578
		bodyModel[154] = new ModelRendererTurbo(this, 265, 435, textureX, textureY); // Box 579
		bodyModel[155] = new ModelRendererTurbo(this, 273, 435, textureX, textureY); // Box 580
		bodyModel[156] = new ModelRendererTurbo(this, 297, 435, textureX, textureY); // Box 582
		bodyModel[157] = new ModelRendererTurbo(this, 329, 435, textureX, textureY); // Box 583
		bodyModel[158] = new ModelRendererTurbo(this, 353, 435, textureX, textureY); // Box 584
		bodyModel[159] = new ModelRendererTurbo(this, 369, 435, textureX, textureY); // Box 585
		bodyModel[160] = new ModelRendererTurbo(this, 385, 435, textureX, textureY); // Box 586
		bodyModel[161] = new ModelRendererTurbo(this, 409, 435, textureX, textureY); // Box 587
		bodyModel[162] = new ModelRendererTurbo(this, 425, 435, textureX, textureY); // Box 588
		bodyModel[163] = new ModelRendererTurbo(this, 449, 435, textureX, textureY); // Box 589
		bodyModel[164] = new ModelRendererTurbo(this, 457, 435, textureX, textureY); // Box 590
		bodyModel[165] = new ModelRendererTurbo(this, 89, 435, textureX, textureY); // Box 591
		bodyModel[166] = new ModelRendererTurbo(this, 169, 435, textureX, textureY); // Box 592
		bodyModel[167] = new ModelRendererTurbo(this, 193, 435, textureX, textureY); // Box 593
		bodyModel[168] = new ModelRendererTurbo(this, 465, 435, textureX, textureY); // Box 594
		bodyModel[169] = new ModelRendererTurbo(this, 481, 435, textureX, textureY); // Box 558
		bodyModel[170] = new ModelRendererTurbo(this, 529, 435, textureX, textureY); // Box 559
		bodyModel[171] = new ModelRendererTurbo(this, 577, 435, textureX, textureY); // Box 560
		bodyModel[172] = new ModelRendererTurbo(this, 625, 435, textureX, textureY); // Box 503
		bodyModel[173] = new ModelRendererTurbo(this, 1, 473, textureX, textureY); // Box 262
		bodyModel[174] = new ModelRendererTurbo(this, 73, 473, textureX, textureY); // Box 255
		bodyModel[175] = new ModelRendererTurbo(this, 129, 473, textureX, textureY); // Box 257
		bodyModel[176] = new ModelRendererTurbo(this, 49, 473, textureX, textureY); // Box 258
		bodyModel[177] = new ModelRendererTurbo(this, 1, 473, textureX, textureY); // Box 213
		bodyModel[178] = new ModelRendererTurbo(this, 49, 473, textureX, textureY); // Box 214
		bodyModel[179] = new ModelRendererTurbo(this, 1, 473, textureX, textureY); // Box 233
		bodyModel[180] = new ModelRendererTurbo(this, 17, 473, textureX, textureY); // Box 234
		bodyModel[181] = new ModelRendererTurbo(this, 49, 473, textureX, textureY); // Box 235
		bodyModel[182] = new ModelRendererTurbo(this, 73, 473, textureX, textureY); // Box 236
		bodyModel[183] = new ModelRendererTurbo(this, 81, 473, textureX, textureY); // Box 237
		bodyModel[184] = new ModelRendererTurbo(this, 89, 473, textureX, textureY); // Box 238
		bodyModel[185] = new ModelRendererTurbo(this, 105, 473, textureX, textureY); // Box 239
		bodyModel[186] = new ModelRendererTurbo(this, 113, 473, textureX, textureY); // Box 240
		bodyModel[187] = new ModelRendererTurbo(this, 121, 473, textureX, textureY); // Box 241
		bodyModel[188] = new ModelRendererTurbo(this, 129, 473, textureX, textureY); // Box 242
		bodyModel[189] = new ModelRendererTurbo(this, 137, 473, textureX, textureY); // Box 243
		bodyModel[190] = new ModelRendererTurbo(this, 145, 473, textureX, textureY); // Box 244
		bodyModel[191] = new ModelRendererTurbo(this, 161, 473, textureX, textureY); // Box 248
		bodyModel[192] = new ModelRendererTurbo(this, 169, 473, textureX, textureY); // Box 249
		bodyModel[193] = new ModelRendererTurbo(this, 177, 473, textureX, textureY); // Box 250
		bodyModel[194] = new ModelRendererTurbo(this, 185, 473, textureX, textureY); // Box 251
		bodyModel[195] = new ModelRendererTurbo(this, 193, 473, textureX, textureY); // Box 252
		bodyModel[196] = new ModelRendererTurbo(this, 201, 473, textureX, textureY); // Box 253
		bodyModel[197] = new ModelRendererTurbo(this, 209, 473, textureX, textureY); // Box 254
		bodyModel[198] = new ModelRendererTurbo(this, 217, 473, textureX, textureY); // Box 255
		bodyModel[199] = new ModelRendererTurbo(this, 225, 473, textureX, textureY); // Box 256
		bodyModel[200] = new ModelRendererTurbo(this, 233, 473, textureX, textureY); // Box 257
		bodyModel[201] = new ModelRendererTurbo(this, 241, 473, textureX, textureY); // Box 258
		bodyModel[202] = new ModelRendererTurbo(this, 249, 473, textureX, textureY); // Box 259
		bodyModel[203] = new ModelRendererTurbo(this, 257, 473, textureX, textureY); // Box 260
		bodyModel[204] = new ModelRendererTurbo(this, 265, 473, textureX, textureY); // Box 261
		bodyModel[205] = new ModelRendererTurbo(this, 273, 473, textureX, textureY); // Box 262
		bodyModel[206] = new ModelRendererTurbo(this, 281, 473, textureX, textureY); // Box 263
		bodyModel[207] = new ModelRendererTurbo(this, 289, 473, textureX, textureY); // Box 265
		bodyModel[208] = new ModelRendererTurbo(this, 297, 473, textureX, textureY); // Box 266
		bodyModel[209] = new ModelRendererTurbo(this, 305, 473, textureX, textureY); // Box 267
		bodyModel[210] = new ModelRendererTurbo(this, 313, 473, textureX, textureY); // Box 268
		bodyModel[211] = new ModelRendererTurbo(this, 321, 473, textureX, textureY); // Box 269
		bodyModel[212] = new ModelRendererTurbo(this, 329, 473, textureX, textureY); // Box 270
		bodyModel[213] = new ModelRendererTurbo(this, 337, 473, textureX, textureY); // Box 271
		bodyModel[214] = new ModelRendererTurbo(this, 345, 473, textureX, textureY); // Box 272
		bodyModel[215] = new ModelRendererTurbo(this, 353, 473, textureX, textureY); // Box 273
		bodyModel[216] = new ModelRendererTurbo(this, 361, 473, textureX, textureY); // Box 274
		bodyModel[217] = new ModelRendererTurbo(this, 369, 473, textureX, textureY); // Box 275
		bodyModel[218] = new ModelRendererTurbo(this, 377, 473, textureX, textureY); // Box 276
		bodyModel[219] = new ModelRendererTurbo(this, 385, 473, textureX, textureY); // Box 277
		bodyModel[220] = new ModelRendererTurbo(this, 393, 473, textureX, textureY); // Box 278
		bodyModel[221] = new ModelRendererTurbo(this, 401, 473, textureX, textureY); // Box 279
		bodyModel[222] = new ModelRendererTurbo(this, 409, 473, textureX, textureY); // Box 280
		bodyModel[223] = new ModelRendererTurbo(this, 417, 473, textureX, textureY); // Box 281
		bodyModel[224] = new ModelRendererTurbo(this, 425, 473, textureX, textureY); // Box 282
		bodyModel[225] = new ModelRendererTurbo(this, 433, 473, textureX, textureY); // Box 283
		bodyModel[226] = new ModelRendererTurbo(this, 441, 473, textureX, textureY); // Box 284
		bodyModel[227] = new ModelRendererTurbo(this, 449, 473, textureX, textureY); // Box 285
		bodyModel[228] = new ModelRendererTurbo(this, 457, 473, textureX, textureY); // Box 286
		bodyModel[229] = new ModelRendererTurbo(this, 465, 473, textureX, textureY); // Box 287
		bodyModel[230] = new ModelRendererTurbo(this, 473, 473, textureX, textureY); // Box 288
		bodyModel[231] = new ModelRendererTurbo(this, 481, 473, textureX, textureY); // Box 289
		bodyModel[232] = new ModelRendererTurbo(this, 489, 473, textureX, textureY); // Box 290
		bodyModel[233] = new ModelRendererTurbo(this, 497, 473, textureX, textureY); // Box 318
		bodyModel[234] = new ModelRendererTurbo(this, 505, 473, textureX, textureY); // Box 319
		bodyModel[235] = new ModelRendererTurbo(this, 513, 473, textureX, textureY); // Box 320
		bodyModel[236] = new ModelRendererTurbo(this, 521, 473, textureX, textureY); // Box 321
		bodyModel[237] = new ModelRendererTurbo(this, 529, 473, textureX, textureY); // Box 322
		bodyModel[238] = new ModelRendererTurbo(this, 537, 473, textureX, textureY); // Box 323
		bodyModel[239] = new ModelRendererTurbo(this, 545, 473, textureX, textureY); // Box 324
		bodyModel[240] = new ModelRendererTurbo(this, 553, 473, textureX, textureY); // Box 325
		bodyModel[241] = new ModelRendererTurbo(this, 561, 473, textureX, textureY); // Box 326
		bodyModel[242] = new ModelRendererTurbo(this, 569, 473, textureX, textureY); // Box 327
		bodyModel[243] = new ModelRendererTurbo(this, 577, 473, textureX, textureY); // Box 328
		bodyModel[244] = new ModelRendererTurbo(this, 585, 473, textureX, textureY); // Box 329
		bodyModel[245] = new ModelRendererTurbo(this, 593, 473, textureX, textureY); // Box 330
		bodyModel[246] = new ModelRendererTurbo(this, 601, 473, textureX, textureY); // Box 331
		bodyModel[247] = new ModelRendererTurbo(this, 609, 473, textureX, textureY); // Box 332
		bodyModel[248] = new ModelRendererTurbo(this, 617, 473, textureX, textureY); // Box 333
		bodyModel[249] = new ModelRendererTurbo(this, 625, 473, textureX, textureY); // Box 334
		bodyModel[250] = new ModelRendererTurbo(this, 633, 473, textureX, textureY); // Box 340
		bodyModel[251] = new ModelRendererTurbo(this, 641, 473, textureX, textureY); // Box 341
		bodyModel[252] = new ModelRendererTurbo(this, 649, 473, textureX, textureY); // Box 342
		bodyModel[253] = new ModelRendererTurbo(this, 657, 473, textureX, textureY); // Box 343
		bodyModel[254] = new ModelRendererTurbo(this, 665, 473, textureX, textureY); // Box 344
		bodyModel[255] = new ModelRendererTurbo(this, 673, 473, textureX, textureY); // Box 345
		bodyModel[256] = new ModelRendererTurbo(this, 681, 473, textureX, textureY); // Box 346
		bodyModel[257] = new ModelRendererTurbo(this, 689, 473, textureX, textureY); // Box 347
		bodyModel[258] = new ModelRendererTurbo(this, 697, 473, textureX, textureY); // Box 348
		bodyModel[259] = new ModelRendererTurbo(this, 705, 473, textureX, textureY); // Box 349
		bodyModel[260] = new ModelRendererTurbo(this, 713, 473, textureX, textureY); // Box 350
		bodyModel[261] = new ModelRendererTurbo(this, 721, 473, textureX, textureY); // Box 351
		bodyModel[262] = new ModelRendererTurbo(this, 729, 473, textureX, textureY); // Box 352
		bodyModel[263] = new ModelRendererTurbo(this, 737, 473, textureX, textureY); // Box 353
		bodyModel[264] = new ModelRendererTurbo(this, 745, 473, textureX, textureY); // Box 354
		bodyModel[265] = new ModelRendererTurbo(this, 753, 473, textureX, textureY); // Box 355
		bodyModel[266] = new ModelRendererTurbo(this, 761, 473, textureX, textureY); // Box 356
		bodyModel[267] = new ModelRendererTurbo(this, 769, 473, textureX, textureY); // Box 387
		bodyModel[268] = new ModelRendererTurbo(this, 777, 473, textureX, textureY); // Box 388
		bodyModel[269] = new ModelRendererTurbo(this, 785, 473, textureX, textureY); // Box 390
		bodyModel[270] = new ModelRendererTurbo(this, 793, 473, textureX, textureY); // Box 391
		bodyModel[271] = new ModelRendererTurbo(this, 801, 473, textureX, textureY); // Box 392
		bodyModel[272] = new ModelRendererTurbo(this, 809, 473, textureX, textureY); // Box 393
		bodyModel[273] = new ModelRendererTurbo(this, 817, 473, textureX, textureY); // Box 394
		bodyModel[274] = new ModelRendererTurbo(this, 825, 473, textureX, textureY); // Box 395
		bodyModel[275] = new ModelRendererTurbo(this, 833, 473, textureX, textureY); // Box 396
		bodyModel[276] = new ModelRendererTurbo(this, 841, 473, textureX, textureY); // Box 397
		bodyModel[277] = new ModelRendererTurbo(this, 849, 473, textureX, textureY); // Box 398
		bodyModel[278] = new ModelRendererTurbo(this, 857, 473, textureX, textureY); // Box 399
		bodyModel[279] = new ModelRendererTurbo(this, 865, 473, textureX, textureY); // Box 400
		bodyModel[280] = new ModelRendererTurbo(this, 873, 473, textureX, textureY); // Box 401
		bodyModel[281] = new ModelRendererTurbo(this, 881, 473, textureX, textureY); // Box 402
		bodyModel[282] = new ModelRendererTurbo(this, 889, 473, textureX, textureY); // Box 403
		bodyModel[283] = new ModelRendererTurbo(this, 897, 473, textureX, textureY); // Box 404
		bodyModel[284] = new ModelRendererTurbo(this, 905, 473, textureX, textureY); // Box 405
		bodyModel[285] = new ModelRendererTurbo(this, 913, 473, textureX, textureY); // Box 406
		bodyModel[286] = new ModelRendererTurbo(this, 921, 473, textureX, textureY); // Box 407
		bodyModel[287] = new ModelRendererTurbo(this, 929, 473, textureX, textureY); // Box 408
		bodyModel[288] = new ModelRendererTurbo(this, 937, 473, textureX, textureY); // Box 409
		bodyModel[289] = new ModelRendererTurbo(this, 945, 473, textureX, textureY); // Box 410
		bodyModel[290] = new ModelRendererTurbo(this, 953, 473, textureX, textureY); // Box 411
		bodyModel[291] = new ModelRendererTurbo(this, 961, 473, textureX, textureY); // Box 412
		bodyModel[292] = new ModelRendererTurbo(this, 969, 473, textureX, textureY); // Box 413
		bodyModel[293] = new ModelRendererTurbo(this, 977, 473, textureX, textureY); // Box 414
		bodyModel[294] = new ModelRendererTurbo(this, 985, 473, textureX, textureY); // Box 415
		bodyModel[295] = new ModelRendererTurbo(this, 993, 473, textureX, textureY); // Box 416
		bodyModel[296] = new ModelRendererTurbo(this, 1001, 473, textureX, textureY); // Box 417
		bodyModel[297] = new ModelRendererTurbo(this, 1009, 473, textureX, textureY); // Box 418
		bodyModel[298] = new ModelRendererTurbo(this, 1017, 473, textureX, textureY); // Box 419
		bodyModel[299] = new ModelRendererTurbo(this, 1025, 473, textureX, textureY); // Box 421
		bodyModel[300] = new ModelRendererTurbo(this, 1033, 473, textureX, textureY); // Box 422
		bodyModel[301] = new ModelRendererTurbo(this, 1041, 473, textureX, textureY); // Box 423
		bodyModel[302] = new ModelRendererTurbo(this, 1049, 473, textureX, textureY); // Box 424
		bodyModel[303] = new ModelRendererTurbo(this, 1057, 473, textureX, textureY); // Box 425
		bodyModel[304] = new ModelRendererTurbo(this, 1065, 473, textureX, textureY); // Box 426
		bodyModel[305] = new ModelRendererTurbo(this, 1073, 473, textureX, textureY); // Box 427
		bodyModel[306] = new ModelRendererTurbo(this, 1081, 473, textureX, textureY); // Box 428
		bodyModel[307] = new ModelRendererTurbo(this, 1089, 473, textureX, textureY); // Box 429
		bodyModel[308] = new ModelRendererTurbo(this, 1097, 473, textureX, textureY); // Box 430
		bodyModel[309] = new ModelRendererTurbo(this, 1105, 473, textureX, textureY); // Box 431
		bodyModel[310] = new ModelRendererTurbo(this, 1113, 473, textureX, textureY); // Box 432
		bodyModel[311] = new ModelRendererTurbo(this, 1121, 473, textureX, textureY); // Box 433
		bodyModel[312] = new ModelRendererTurbo(this, 1129, 473, textureX, textureY); // Box 434
		bodyModel[313] = new ModelRendererTurbo(this, 1137, 473, textureX, textureY); // Box 435
		bodyModel[314] = new ModelRendererTurbo(this, 1145, 473, textureX, textureY); // Box 436
		bodyModel[315] = new ModelRendererTurbo(this, 1153, 473, textureX, textureY); // Box 437
		bodyModel[316] = new ModelRendererTurbo(this, 1161, 473, textureX, textureY); // Box 438
		bodyModel[317] = new ModelRendererTurbo(this, 1169, 473, textureX, textureY); // Box 439
		bodyModel[318] = new ModelRendererTurbo(this, 1177, 473, textureX, textureY); // Box 440
		bodyModel[319] = new ModelRendererTurbo(this, 1185, 473, textureX, textureY); // Box 441
		bodyModel[320] = new ModelRendererTurbo(this, 1193, 473, textureX, textureY); // Box 442
		bodyModel[321] = new ModelRendererTurbo(this, 1201, 473, textureX, textureY); // Box 443
		bodyModel[322] = new ModelRendererTurbo(this, 1209, 473, textureX, textureY); // Box 444
		bodyModel[323] = new ModelRendererTurbo(this, 1217, 473, textureX, textureY); // Box 445
		bodyModel[324] = new ModelRendererTurbo(this, 1225, 473, textureX, textureY); // Box 446
		bodyModel[325] = new ModelRendererTurbo(this, 1233, 473, textureX, textureY); // Box 447
		bodyModel[326] = new ModelRendererTurbo(this, 1241, 473, textureX, textureY); // Box 448
		bodyModel[327] = new ModelRendererTurbo(this, 1249, 473, textureX, textureY); // Box 449
		bodyModel[328] = new ModelRendererTurbo(this, 1257, 473, textureX, textureY); // Box 450
		bodyModel[329] = new ModelRendererTurbo(this, 1265, 473, textureX, textureY); // Box 451
		bodyModel[330] = new ModelRendererTurbo(this, 1273, 473, textureX, textureY); // Box 452
		bodyModel[331] = new ModelRendererTurbo(this, 1281, 473, textureX, textureY); // Box 453
		bodyModel[332] = new ModelRendererTurbo(this, 1289, 473, textureX, textureY); // Box 454
		bodyModel[333] = new ModelRendererTurbo(this, 1297, 473, textureX, textureY); // Box 455
		bodyModel[334] = new ModelRendererTurbo(this, 1305, 473, textureX, textureY); // Box 456
		bodyModel[335] = new ModelRendererTurbo(this, 1313, 473, textureX, textureY); // Box 457
		bodyModel[336] = new ModelRendererTurbo(this, 1321, 473, textureX, textureY); // Box 458
		bodyModel[337] = new ModelRendererTurbo(this, 1329, 473, textureX, textureY); // Box 459
		bodyModel[338] = new ModelRendererTurbo(this, 1337, 473, textureX, textureY); // Box 460
		bodyModel[339] = new ModelRendererTurbo(this, 1345, 473, textureX, textureY); // Box 461
		bodyModel[340] = new ModelRendererTurbo(this, 1353, 473, textureX, textureY); // Box 462
		bodyModel[341] = new ModelRendererTurbo(this, 1361, 473, textureX, textureY); // Box 463
		bodyModel[342] = new ModelRendererTurbo(this, 1369, 473, textureX, textureY); // Box 464
		bodyModel[343] = new ModelRendererTurbo(this, 1377, 473, textureX, textureY); // Box 465
		bodyModel[344] = new ModelRendererTurbo(this, 1385, 473, textureX, textureY); // Box 466
		bodyModel[345] = new ModelRendererTurbo(this, 1393, 473, textureX, textureY); // Box 467
		bodyModel[346] = new ModelRendererTurbo(this, 1401, 473, textureX, textureY); // Box 468
		bodyModel[347] = new ModelRendererTurbo(this, 1409, 473, textureX, textureY); // Box 469
		bodyModel[348] = new ModelRendererTurbo(this, 1417, 473, textureX, textureY); // Box 470
		bodyModel[349] = new ModelRendererTurbo(this, 1425, 473, textureX, textureY); // Box 471
		bodyModel[350] = new ModelRendererTurbo(this, 1433, 473, textureX, textureY); // Box 472
		bodyModel[351] = new ModelRendererTurbo(this, 1441, 473, textureX, textureY); // Box 473
		bodyModel[352] = new ModelRendererTurbo(this, 1449, 473, textureX, textureY); // Box 474
		bodyModel[353] = new ModelRendererTurbo(this, 1457, 473, textureX, textureY); // Box 475
		bodyModel[354] = new ModelRendererTurbo(this, 1465, 473, textureX, textureY); // Box 476
		bodyModel[355] = new ModelRendererTurbo(this, 1473, 473, textureX, textureY); // Box 477
		bodyModel[356] = new ModelRendererTurbo(this, 1481, 473, textureX, textureY); // Box 478
		bodyModel[357] = new ModelRendererTurbo(this, 1489, 473, textureX, textureY); // Box 480
		bodyModel[358] = new ModelRendererTurbo(this, 1497, 473, textureX, textureY); // Box 481
		bodyModel[359] = new ModelRendererTurbo(this, 1505, 473, textureX, textureY); // Box 482
		bodyModel[360] = new ModelRendererTurbo(this, 1513, 473, textureX, textureY); // Box 483
		bodyModel[361] = new ModelRendererTurbo(this, 1521, 473, textureX, textureY); // Box 484
		bodyModel[362] = new ModelRendererTurbo(this, 1529, 473, textureX, textureY); // Box 485
		bodyModel[363] = new ModelRendererTurbo(this, 1537, 473, textureX, textureY); // Box 486
		bodyModel[364] = new ModelRendererTurbo(this, 1545, 473, textureX, textureY); // Box 487
		bodyModel[365] = new ModelRendererTurbo(this, 1553, 473, textureX, textureY); // Box 488
		bodyModel[366] = new ModelRendererTurbo(this, 1561, 473, textureX, textureY); // Box 489
		bodyModel[367] = new ModelRendererTurbo(this, 1569, 473, textureX, textureY); // Box 460
		bodyModel[368] = new ModelRendererTurbo(this, 1577, 473, textureX, textureY); // Box 461
		bodyModel[369] = new ModelRendererTurbo(this, 1585, 473, textureX, textureY); // Box 462
		bodyModel[370] = new ModelRendererTurbo(this, 1593, 473, textureX, textureY); // Box 463
		bodyModel[371] = new ModelRendererTurbo(this, 1601, 473, textureX, textureY); // Box 464
		bodyModel[372] = new ModelRendererTurbo(this, 1609, 473, textureX, textureY); // Box 465
		bodyModel[373] = new ModelRendererTurbo(this, 1617, 473, textureX, textureY); // Box 466
		bodyModel[374] = new ModelRendererTurbo(this, 1625, 473, textureX, textureY); // Box 467
		bodyModel[375] = new ModelRendererTurbo(this, 1633, 473, textureX, textureY); // Box 468
		bodyModel[376] = new ModelRendererTurbo(this, 1641, 473, textureX, textureY); // Box 469
		bodyModel[377] = new ModelRendererTurbo(this, 1649, 473, textureX, textureY); // Box 470
		bodyModel[378] = new ModelRendererTurbo(this, 1657, 473, textureX, textureY); // Box 471
		bodyModel[379] = new ModelRendererTurbo(this, 1665, 473, textureX, textureY); // Box 472
		bodyModel[380] = new ModelRendererTurbo(this, 1673, 473, textureX, textureY); // Box 473
		bodyModel[381] = new ModelRendererTurbo(this, 1681, 473, textureX, textureY); // Box 474
		bodyModel[382] = new ModelRendererTurbo(this, 1689, 473, textureX, textureY); // Box 475
		bodyModel[383] = new ModelRendererTurbo(this, 1697, 473, textureX, textureY); // Box 476
		bodyModel[384] = new ModelRendererTurbo(this, 1705, 473, textureX, textureY); // Box 477
		bodyModel[385] = new ModelRendererTurbo(this, 1713, 473, textureX, textureY); // Box 478
		bodyModel[386] = new ModelRendererTurbo(this, 1721, 473, textureX, textureY); // Box 479
		bodyModel[387] = new ModelRendererTurbo(this, 1729, 473, textureX, textureY); // Box 480
		bodyModel[388] = new ModelRendererTurbo(this, 1737, 473, textureX, textureY); // Box 481
		bodyModel[389] = new ModelRendererTurbo(this, 1745, 473, textureX, textureY); // Box 482
		bodyModel[390] = new ModelRendererTurbo(this, 1753, 473, textureX, textureY); // Box 483
		bodyModel[391] = new ModelRendererTurbo(this, 1761, 473, textureX, textureY); // Box 484
		bodyModel[392] = new ModelRendererTurbo(this, 1769, 473, textureX, textureY); // Box 485
		bodyModel[393] = new ModelRendererTurbo(this, 1777, 473, textureX, textureY); // Box 486
		bodyModel[394] = new ModelRendererTurbo(this, 1777, 473, textureX, textureY); // Box 487
		bodyModel[395] = new ModelRendererTurbo(this, 1785, 473, textureX, textureY); // Box 462
		bodyModel[396] = new ModelRendererTurbo(this, 1817, 473, textureX, textureY); // Box 463
		bodyModel[397] = new ModelRendererTurbo(this, 1833, 473, textureX, textureY); // Box 465
		bodyModel[398] = new ModelRendererTurbo(this, 1849, 473, textureX, textureY); // Box 466
		bodyModel[399] = new ModelRendererTurbo(this, 1865, 473, textureX, textureY); // Box 467
		bodyModel[400] = new ModelRendererTurbo(this, 1873, 473, textureX, textureY); // Box 468
		bodyModel[401] = new ModelRendererTurbo(this, 1881, 473, textureX, textureY); // Box 469
		bodyModel[402] = new ModelRendererTurbo(this, 1889, 473, textureX, textureY); // Box 470
		bodyModel[403] = new ModelRendererTurbo(this, 1897, 473, textureX, textureY); // Box 471
		bodyModel[404] = new ModelRendererTurbo(this, 1905, 473, textureX, textureY); // Box 472
		bodyModel[405] = new ModelRendererTurbo(this, 1913, 473, textureX, textureY); // Box 512
		bodyModel[406] = new ModelRendererTurbo(this, 1929, 473, textureX, textureY); // Box 513
		bodyModel[407] = new ModelRendererTurbo(this, 1953, 473, textureX, textureY); // Box 514
		bodyModel[408] = new ModelRendererTurbo(this, 1969, 473, textureX, textureY); // Box 515
		bodyModel[409] = new ModelRendererTurbo(this, 1985, 473, textureX, textureY); // Box 516
		bodyModel[410] = new ModelRendererTurbo(this, 2001, 473, textureX, textureY); // Box 517
		bodyModel[411] = new ModelRendererTurbo(this, 2025, 473, textureX, textureY); // Box 518
		bodyModel[412] = new ModelRendererTurbo(this, 177, 481, textureX, textureY); // Box 341
		bodyModel[413] = new ModelRendererTurbo(this, 657, 435, textureX, textureY); // Box 239
		bodyModel[414] = new ModelRendererTurbo(this, 513, 435, textureX, textureY); // Box 240
		bodyModel[415] = new ModelRendererTurbo(this, 689, 435, textureX, textureY); // Box 241
		bodyModel[416] = new ModelRendererTurbo(this, 713, 435, textureX, textureY); // Box 242
		bodyModel[417] = new ModelRendererTurbo(this, 561, 435, textureX, textureY); // Box 243
		bodyModel[418] = new ModelRendererTurbo(this, 609, 435, textureX, textureY); // Box 244
		bodyModel[419] = new ModelRendererTurbo(this, 729, 435, textureX, textureY); // Box 245
		bodyModel[420] = new ModelRendererTurbo(this, 745, 435, textureX, textureY); // Box 246
		bodyModel[421] = new ModelRendererTurbo(this, 769, 435, textureX, textureY); // Box 247
		bodyModel[422] = new ModelRendererTurbo(this, 777, 435, textureX, textureY); // Box 248
		bodyModel[423] = new ModelRendererTurbo(this, 785, 435, textureX, textureY); // Box 250
		bodyModel[424] = new ModelRendererTurbo(this, 793, 435, textureX, textureY); // Box 251
		bodyModel[425] = new ModelRendererTurbo(this, 801, 435, textureX, textureY); // Box 252
		bodyModel[426] = new ModelRendererTurbo(this, 825, 435, textureX, textureY); // Box 253
		bodyModel[427] = new ModelRendererTurbo(this, 273, 435, textureX, textureY); // Box 962
		bodyModel[428] = new ModelRendererTurbo(this, 289, 435, textureX, textureY); // Box 964
		bodyModel[429] = new ModelRendererTurbo(this, 705, 435, textureX, textureY); // Box 966
		bodyModel[430] = new ModelRendererTurbo(this, 177, 435, textureX, textureY); // Box 488
		bodyModel[431] = new ModelRendererTurbo(this, 201, 435, textureX, textureY); // Box 489
		bodyModel[432] = new ModelRendererTurbo(this, 849, 435, textureX, textureY); // Box 256
		bodyModel[433] = new ModelRendererTurbo(this, 873, 435, textureX, textureY); // Box 249
		bodyModel[434] = new ModelRendererTurbo(this, 897, 435, textureX, textureY); // Box 254
		bodyModel[435] = new ModelRendererTurbo(this, 921, 435, textureX, textureY); // Box 263
		bodyModel[436] = new ModelRendererTurbo(this, 217, 435, textureX, textureY); // Box 264
		bodyModel[437] = new ModelRendererTurbo(this, 441, 435, textureX, textureY); // Box 265
		bodyModel[438] = new ModelRendererTurbo(this, 297, 435, textureX, textureY); // Box 266
		bodyModel[439] = new ModelRendererTurbo(this, 937, 435, textureX, textureY); // Box 601
		bodyModel[440] = new ModelRendererTurbo(this, 953, 435, textureX, textureY); // Box 602
		bodyModel[441] = new ModelRendererTurbo(this, 465, 435, textureX, textureY); // Box 603
		bodyModel[442] = new ModelRendererTurbo(this, 745, 435, textureX, textureY); // Box 604
		bodyModel[443] = new ModelRendererTurbo(this, 969, 435, textureX, textureY); // Box 967
		bodyModel[444] = new ModelRendererTurbo(this, 1009, 435, textureX, textureY); // Box 968
		bodyModel[445] = new ModelRendererTurbo(this, 1001, 435, textureX, textureY); // Box 615
		bodyModel[446] = new ModelRendererTurbo(this, 1049, 435, textureX, textureY); // Box 616
		bodyModel[447] = new ModelRendererTurbo(this, 761, 435, textureX, textureY); // Box 259
		bodyModel[448] = new ModelRendererTurbo(this, 1033, 435, textureX, textureY); // Box 377
		bodyModel[449] = new ModelRendererTurbo(this, 1081, 435, textureX, textureY); // Box 378
		bodyModel[450] = new ModelRendererTurbo(this, 1041, 435, textureX, textureY); // Box 379
		bodyModel[451] = new ModelRendererTurbo(this, 1097, 435, textureX, textureY); // Box 380
		bodyModel[452] = new ModelRendererTurbo(this, 1169, 435, textureX, textureY); // Box 381
		bodyModel[453] = new ModelRendererTurbo(this, 1225, 435, textureX, textureY); // Box 382
		bodyModel[454] = new ModelRendererTurbo(this, 921, 435, textureX, textureY); // Box 383
		bodyModel[455] = new ModelRendererTurbo(this, 1049, 435, textureX, textureY); // Box 384
		bodyModel[456] = new ModelRendererTurbo(this, 1273, 435, textureX, textureY); // Box 385
		bodyModel[457] = new ModelRendererTurbo(this, 1153, 435, textureX, textureY); // Box 386
		bodyModel[458] = new ModelRendererTurbo(this, 1297, 435, textureX, textureY); // Box 387
		bodyModel[459] = new ModelRendererTurbo(this, 1257, 435, textureX, textureY); // Box 388
		bodyModel[460] = new ModelRendererTurbo(this, 1313, 435, textureX, textureY); // Box 389
		bodyModel[461] = new ModelRendererTurbo(this, 1177, 435, textureX, textureY); // Box 390
		bodyModel[462] = new ModelRendererTurbo(this, 1185, 435, textureX, textureY); // Box 391
		bodyModel[463] = new ModelRendererTurbo(this, 1329, 435, textureX, textureY); // Box 392
		bodyModel[464] = new ModelRendererTurbo(this, 1353, 435, textureX, textureY); // Box 393
		bodyModel[465] = new ModelRendererTurbo(this, 1361, 435, textureX, textureY); // Box 394
		bodyModel[466] = new ModelRendererTurbo(this, 1369, 435, textureX, textureY); // Box 395
		bodyModel[467] = new ModelRendererTurbo(this, 1225, 435, textureX, textureY); // Box 396
		bodyModel[468] = new ModelRendererTurbo(this, 1289, 435, textureX, textureY); // Box 397
		bodyModel[469] = new ModelRendererTurbo(this, 1385, 435, textureX, textureY); // Box 398
		bodyModel[470] = new ModelRendererTurbo(this, 1401, 435, textureX, textureY); // Box 399

		bodyModel[0].addShapeBox(0F, 0F, 0F, 29, 5, 3, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-74F, -79F, -14F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 33, 5, 3, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[1].setRotationPoint(-45F, -79F, -14F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 30, 5, 3, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[2].setRotationPoint(-12F, -79F, -14F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 29, 6, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[3].setRotationPoint(-74F, -74F, -15F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 33, 6, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[4].setRotationPoint(-45F, -74F, -15F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 30, 6, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[5].setRotationPoint(-12F, -74F, -15F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 29, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[6].setRotationPoint(-74F, -68F, -15F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 33, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[7].setRotationPoint(-45F, -68F, -15F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 30, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[8].setRotationPoint(-12F, -68F, -15F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 33, 8, 15, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[9].setRotationPoint(18F, -68F, -15F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 33, 6, 15, 0F,0F, 0F, -1F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[10].setRotationPoint(18F, -74F, -15F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 33, 5, 14, 0F,0F, 0F, -2F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[11].setRotationPoint(18F, -79F, -14F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 33, 4, 12, 0F,0F, 0F, -4F, 0F, -1F, -6F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[12].setRotationPoint(18F, -83F, -12F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 33, 4, 8, 0F,0F, 1F, -4F, 0F, -1F, -5F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 13
		bodyModel[13].setRotationPoint(18F, -86F, -8F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 13, 5, 14, 0F,0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[14].setRotationPoint(-87F, -79F, -14F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 13, 6, 15, 0F,0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[15].setRotationPoint(-87F, -74F, -15F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 13, 8, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 16
		bodyModel[16].setRotationPoint(-87F, -68F, -15F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 13, 4, 12, 0F,0F, -1F, -7F, 0F, 0F, -6F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[17].setRotationPoint(-87F, -83F, -12F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 29, 7, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -4F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 21
		bodyModel[18].setRotationPoint(-74F, -60F, -15F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 63, 7, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[19].setRotationPoint(-45F, -60F, -15F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 33, 7, 15, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -3F, -6F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[20].setRotationPoint(18F, -60F, -15F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 13, 6, 15, 0F,0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 24
		bodyModel[21].setRotationPoint(-87F, -60F, -15F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 33, 5, 11, 0F,0F, 0F, 0F, 0F, 3F, -2F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -6F, -6F, 0F, -6F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[22].setRotationPoint(18F, -53F, -11F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 33, 7, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[23].setRotationPoint(-45F, -53F, -16F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 30, 7, 11, 0F,0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 5F, 0F, -2F, -4F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[24].setRotationPoint(-12F, -53F, -11F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 29, 7, 16, 0F,0F, 1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -4F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 37
		bodyModel[25].setRotationPoint(-74F, -53F, -16F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 13, 5, 11, 0F,0F, 2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -3F, -5F, 0F, -1F, -5F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 48
		bodyModel[26].setRotationPoint(-87F, -54F, -11F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 5, 4, 7, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F); // Box 50
		bodyModel[27].setRotationPoint(-74F, -83F, -12F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 11, 4, 7, 0F,0F, 0F, -5.9999F, 0F, -3.9999F, 0F, 0F, -3.9999F, -5.9999F, 0F, -0.9999F, -0.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.9999F, 0F, 0F, -5.9999F); // Box 51
		bodyModel[28].setRotationPoint(-69F, -83F, -12F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,0F, -0.9999F, 0F, 0F, -0.9999F, 0F, 0F, -0.9999F, -5.9999F, 0F, 0F, 0F, 0F, 0.9999F, 0F, 0F, 0.9999F, 0F, 0F, 0.9999F, -5.9999F, 0F, 0F, 0F); // Box 52
		bodyModel[29].setRotationPoint(-74F, -84F, -6F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 92, 5, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[30].setRotationPoint(-74F, -65F, -11F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[31].setRotationPoint(-45F, -86F, -12F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[32].setRotationPoint(-58F, -86F, -12F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[33].setRotationPoint(-32F, -85F, -12F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[34].setRotationPoint(-19F, -84F, -12F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[35].setRotationPoint(-6F, -83F, -12F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[36].setRotationPoint(-58F, -86F, -9F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[37].setRotationPoint(-44F, -86F, -9F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[38].setRotationPoint(-31F, -85F, -9F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[39].setRotationPoint(-18F, -84F, -9F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[40].setRotationPoint(-45F, -92F, -9F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		bodyModel[41].setRotationPoint(-32F, -91F, -9F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[42].setRotationPoint(-19F, -89F, -9F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 74
		bodyModel[43].setRotationPoint(-6F, -87F, -9F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[44].setRotationPoint(-44F, -92F, -6F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 76
		bodyModel[45].setRotationPoint(-31F, -91F, -6F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[46].setRotationPoint(-18F, -89F, -6F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -1.5F, 2F, 0F, -1.5F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 78
		bodyModel[47].setRotationPoint(-6F, -89F, -6F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[48].setRotationPoint(-19F, -91F, -6F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[49].setRotationPoint(-32F, -93F, -6F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		bodyModel[50].setRotationPoint(-45F, -94F, -6F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 82
		bodyModel[51].setRotationPoint(-45F, -95F, -4F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 83
		bodyModel[52].setRotationPoint(-32F, -94F, -3F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 84
		bodyModel[53].setRotationPoint(-19F, -92F, -3F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 85
		bodyModel[54].setRotationPoint(-6F, -90F, -3F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[55].setRotationPoint(-51F, -95F, -0.5F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[56].setRotationPoint(-44F, -95F, -0.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[57].setRotationPoint(-31F, -94F, -0.5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 89
		bodyModel[58].setRotationPoint(-18F, -92F, -0.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 90
		bodyModel[59].setRotationPoint(-58F, -90F, -9F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[60].setRotationPoint(-58F, -92F, -6F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		bodyModel[61].setRotationPoint(-58F, -92F, -3F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		bodyModel[62].setRotationPoint(-51F, -92F, -6F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 94
		bodyModel[63].setRotationPoint(-58F, -92F, -6F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[64].setRotationPoint(-51F, -94F, -6F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 96
		bodyModel[65].setRotationPoint(-51F, -95F, -4F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 97
		bodyModel[66].setRotationPoint(-58F, -95F, -0.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F); // Box 98
		bodyModel[67].setRotationPoint(-70F, -90F, -6F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, -8F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -8F, 0F, 0F, 8F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 8F, 0F); // Box 99
		bodyModel[68].setRotationPoint(-73F, -91F, -3F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 29, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		bodyModel[69].setRotationPoint(-74F, -79F, 11F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 33, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[70].setRotationPoint(-45F, -79F, 11F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 30, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[71].setRotationPoint(-12F, -79F, 11F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 29, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[72].setRotationPoint(-74F, -74F, 11F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 33, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[73].setRotationPoint(-45F, -74F, 11F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 30, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[74].setRotationPoint(-12F, -74F, 11F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 29, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133
		bodyModel[75].setRotationPoint(-74F, -68F, 11F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 33, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134
		bodyModel[76].setRotationPoint(-45F, -68F, 11F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 30, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[77].setRotationPoint(-12F, -68F, 11F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 33, 8, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 136
		bodyModel[78].setRotationPoint(18F, -68F, 0F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 33, 6, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 137
		bodyModel[79].setRotationPoint(18F, -74F, 0F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 33, 5, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 138
		bodyModel[80].setRotationPoint(18F, -79F, 0F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 33, 4, 12, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -6F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 139
		bodyModel[81].setRotationPoint(18F, -83F, 0F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 33, 4, 8, 0F,0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, -5F, 0F, 1F, -4F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, 0F); // Box 140
		bodyModel[82].setRotationPoint(18F, -86F, 0F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 13, 5, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 141
		bodyModel[83].setRotationPoint(-87F, -79F, 0F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 13, 6, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		bodyModel[84].setRotationPoint(-87F, -74F, 0F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 13, 8, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 143
		bodyModel[85].setRotationPoint(-87F, -68F, 0F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 13, 4, 12, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -6F, 0F, -1F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 144
		bodyModel[86].setRotationPoint(-87F, -83F, 0F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 29, 7, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, -4F); // Box 148
		bodyModel[87].setRotationPoint(-74F, -60F, 0F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 63, 7, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 149
		bodyModel[88].setRotationPoint(-45F, -60F, 0F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 33, 7, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -6F, 0F, 0F, -4F); // Box 150
		bodyModel[89].setRotationPoint(18F, -60F, 0F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 13, 6, 15, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -2F, -5F); // Box 151
		bodyModel[90].setRotationPoint(-87F, -60F, 0F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 33, 5, 11, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, -6F, 0F, 0F, -4F); // Box 160
		bodyModel[91].setRotationPoint(18F, -53F, 0F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 33, 7, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[92].setRotationPoint(-45F, -53F, 0F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 30, 7, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -4F, 0F, -2F, 5F); // Box 163
		bodyModel[93].setRotationPoint(-12F, -53F, 0F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 29, 7, 16, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -5F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -10F); // Box 164
		bodyModel[94].setRotationPoint(-74F, -53F, 0F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 13, 5, 11, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, -5F, 0F, -3F, -5F); // Box 174
		bodyModel[95].setRotationPoint(-87F, -54F, 0F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 5, 4, 7, 0F,0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		bodyModel[96].setRotationPoint(-74F, -83F, 5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 11, 4, 7, 0F,0F, -0.9999F, -0.9999F, 0F, -3.9999F, -5.9999F, 0F, -3.9999F, 0F, 0F, 0F, -5.9999F, 0F, 0F, -5.9999F, 0F, 0F, -5.9999F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[97].setRotationPoint(-69F, -83F, 5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,0F, 0F, 0F, 0F, -0.9999F, -5.9999F, 0F, -0.9999F, 0F, 0F, -0.9999F, 0F, 0F, 0F, 0F, 0F, 0.9999F, -5.9999F, 0F, 0.9999F, 0F, 0F, 0.9999F, 0F); // Box 178
		bodyModel[98].setRotationPoint(-74F, -84F, 0F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 92, 5, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		bodyModel[99].setRotationPoint(-74F, -65F, 0F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[100].setRotationPoint(-45F, -86F, 11F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		bodyModel[101].setRotationPoint(-58F, -86F, 11F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 190
		bodyModel[102].setRotationPoint(-32F, -85F, 11F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 191
		bodyModel[103].setRotationPoint(-19F, -84F, 11F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 192
		bodyModel[104].setRotationPoint(-6F, -83F, 11F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[105].setRotationPoint(-58F, -86F, 8F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[106].setRotationPoint(-44F, -86F, 8F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 195
		bodyModel[107].setRotationPoint(-31F, -85F, 8F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[108].setRotationPoint(-18F, -84F, 8F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		bodyModel[109].setRotationPoint(-45F, -92F, 8F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		bodyModel[110].setRotationPoint(-32F, -91F, 8F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		bodyModel[111].setRotationPoint(-19F, -89F, 8F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
		bodyModel[112].setRotationPoint(-6F, -87F, 8F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 201
		bodyModel[113].setRotationPoint(-44F, -92F, 5F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[114].setRotationPoint(-31F, -91F, 5F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[115].setRotationPoint(-18F, -89F, 5F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -1.5F, 2F, 0F, -1.5F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[116].setRotationPoint(-6F, -89F, 5F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		bodyModel[117].setRotationPoint(-19F, -91F, 5F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		bodyModel[118].setRotationPoint(-32F, -93F, 5F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		bodyModel[119].setRotationPoint(-45F, -94F, 5F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 208
		bodyModel[120].setRotationPoint(-45F, -95F, 1F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 209
		bodyModel[121].setRotationPoint(-32F, -94F, 1F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		bodyModel[122].setRotationPoint(-19F, -92F, 1F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 211
		bodyModel[123].setRotationPoint(-6F, -90F, 1F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 216
		bodyModel[124].setRotationPoint(-58F, -90F, 8F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		bodyModel[125].setRotationPoint(-58F, -92F, 5F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 218
		bodyModel[126].setRotationPoint(-58F, -92F, 0F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		bodyModel[127].setRotationPoint(-51F, -92F, 5F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 220
		bodyModel[128].setRotationPoint(-58F, -92F, 5F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221
		bodyModel[129].setRotationPoint(-51F, -94F, 5F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 222
		bodyModel[130].setRotationPoint(-51F, -95F, 1F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F); // Box 224
		bodyModel[131].setRotationPoint(-70F, -90F, 5F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, -8F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -8F, 0F, 0F, 8F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 8F, 0F); // Box 225
		bodyModel[132].setRotationPoint(-73F, -91F, 2F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[133].setRotationPoint(-51F, -95F, -1F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 284
		bodyModel[134].setRotationPoint(-45F, -95F, -1F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 285
		bodyModel[135].setRotationPoint(-32F, -94F, -1F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 286
		bodyModel[136].setRotationPoint(-19F, -92F, -1F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 287
		bodyModel[137].setRotationPoint(-6F, -90F, -1F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 12, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 484
		bodyModel[138].setRotationPoint(-3F, -79F, -8F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 3, 5, 2, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 1F); // Box 485
		bodyModel[139].setRotationPoint(-6F, -79F, -8F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 3, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, 1F, 0F, 0F, 0F); // Box 487
		bodyModel[140].setRotationPoint(9F, -79F, -8F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 2, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 488
		bodyModel[141].setRotationPoint(10F, -79F, -5F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 2, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 489
		bodyModel[142].setRotationPoint(-6F, -79F, -5F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 12, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 490
		bodyModel[143].setRotationPoint(-3F, -79F, 6F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 3, 5, 2, 0F,-2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 491
		bodyModel[144].setRotationPoint(-6F, -79F, 6F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 3, 5, 2, 0F,0F, 0F, 0F, -2F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 492
		bodyModel[145].setRotationPoint(9F, -79F, 6F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 6, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 493
		bodyModel[146].setRotationPoint(12F, -78F, -4F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 494
		bodyModel[147].setRotationPoint(14F, -80F, -4F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 495
		bodyModel[148].setRotationPoint(14F, -81F, -4F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 496
		bodyModel[149].setRotationPoint(-3F, -74F, -8F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 497
		bodyModel[150].setRotationPoint(-3F, -74F, 7F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 498
		bodyModel[151].setRotationPoint(8F, -74F, 7F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 499
		bodyModel[152].setRotationPoint(8F, -74F, -8F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 578
		bodyModel[153].setRotationPoint(-2F, -79F, 3F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 579
		bodyModel[154].setRotationPoint(-2F, -79F, -4F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 15, 10, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 580
		bodyModel[155].setRotationPoint(-1F, -82F, -5F);

		bodyModel[156].addShapeBox(0F, 1F, 0F, 10, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 582
		bodyModel[156].setRotationPoint(-1F, -68F, -5F);
		bodyModel[156].rotateAngleZ = 0.08726646F;

		bodyModel[157].addShapeBox(-2F, 0.25F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 583
		bodyModel[157].setRotationPoint(1F, -68F, -5F);
		bodyModel[157].rotateAngleZ = 0.08726646F;

		bodyModel[158].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 584
		bodyModel[158].setRotationPoint(-1F, -74F, -6F);
		bodyModel[158].rotateAngleZ = -0.78539816F;

		bodyModel[159].addShapeBox(0F, -0.3F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 585
		bodyModel[159].setRotationPoint(8F, -68F, -5F);
		bodyModel[159].rotateAngleZ = 0.12217305F;

		bodyModel[160].addShapeBox(-2F, 0.25F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 586
		bodyModel[160].setRotationPoint(1F, -68F, 4F);
		bodyModel[160].rotateAngleZ = 0.08726646F;

		bodyModel[161].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 587
		bodyModel[161].setRotationPoint(-1F, -74F, 5F);
		bodyModel[161].rotateAngleZ = -0.78539816F;

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 14, 8, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 588
		bodyModel[162].setRotationPoint(0F, -81F, -4F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 589
		bodyModel[163].setRotationPoint(0.300000000000001F, -81.3F, 1F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 590
		bodyModel[164].setRotationPoint(0.300000000000001F, -81.3F, -2F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 591
		bodyModel[165].setRotationPoint(-2.5F, -83.5F, -1.5F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 592
		bodyModel[166].setRotationPoint(-2.5F, -84.5F, -1.5F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 593
		bodyModel[167].setRotationPoint(-2.5F, -85.5F, -1.5F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 594
		bodyModel[168].setRotationPoint(-3F, -86F, -3F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 18, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 558
		bodyModel[169].setRotationPoint(-77F, -87F, 3F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 18, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 559
		bodyModel[170].setRotationPoint(-77F, -86F, 3F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 18, 2, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F); // Box 560
		bodyModel[171].setRotationPoint(-77F, -87F, 3F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 18, 2, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F); // Box 503
		bodyModel[172].setRotationPoint(-77F, -87F, 4.5F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 11, 8, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 262
		bodyModel[173].setRotationPoint(-74F, -73F, -11F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 3, 6, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 255
		bodyModel[174].setRotationPoint(-63F, -78F, -11F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 2, 22, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 257
		bodyModel[175].setRotationPoint(-61F, -80F, -11F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0.5F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 258
		bodyModel[176].setRotationPoint(-61F, -81F, -10F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 213
		bodyModel[177].setRotationPoint(-60.8F, -78.3F, -4F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, -0.4F, -3F, 0F, -0.4F, -3F, 0F, -0.4F, -3F, 0F, -0.4F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 214
		bodyModel[178].setRotationPoint(-60.8F, -79.3F, -4F);

		bodyModel[179].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F); // Box 233
		bodyModel[179].setRotationPoint(-60.7F, -77.1F, 2.7F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F); // Box 234
		bodyModel[180].setRotationPoint(-60.6F, -78.1F, -0.9F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F); // Box 235
		bodyModel[181].setRotationPoint(-60.6F, -78.1F, -0.9F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F); // Box 236
		bodyModel[182].setRotationPoint(-60.6F, -78.1F, -0.9F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 237
		bodyModel[183].setRotationPoint(-60.6F, -77.1F, -0.9F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 238
		bodyModel[184].setRotationPoint(-60.6F, -77.1F, -0.9F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 239
		bodyModel[185].setRotationPoint(-60.6F, -77.1F, 0.0999999999999996F);

		bodyModel[186].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 240
		bodyModel[186].setRotationPoint(-60.7F, -77.1F, 0.0999999999999996F);
		bodyModel[186].rotateAngleX = 5.49778714F;

		bodyModel[187].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 241
		bodyModel[187].setRotationPoint(-60.7F, -77.1F, 0.0999999999999996F);

		bodyModel[188].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F); // Box 242
		bodyModel[188].setRotationPoint(-60.7F, -77.1F, 0.0999999999999996F);

		bodyModel[189].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 243
		bodyModel[189].setRotationPoint(-60.6F, -77.1F, 0.0999999999999996F);

		bodyModel[190].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 244
		bodyModel[190].setRotationPoint(-60.7F, -77.1F, 0.0999999999999996F);
		bodyModel[190].rotateAngleX = 3.14159265F;

		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 248
		bodyModel[191].setRotationPoint(-60.6F, -78.1F, 0.0999999999999996F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 249
		bodyModel[192].setRotationPoint(-60.6F, -78.1F, 0.0999999999999996F);

		bodyModel[193].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 250
		bodyModel[193].setRotationPoint(-60.7F, -77.1F, 0.0999999999999996F);
		bodyModel[193].rotateAngleX = 4.71238898F;

		bodyModel[194].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 251
		bodyModel[194].setRotationPoint(-60.7F, -77.1F, 0.0999999999999996F);
		bodyModel[194].rotateAngleX = 3.92699082F;

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F); // Box 252
		bodyModel[195].setRotationPoint(-60.6F, -78.1F, 1.7F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F); // Box 253
		bodyModel[196].setRotationPoint(-60.6F, -78.1F, 1.7F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F); // Box 254
		bodyModel[197].setRotationPoint(-60.6F, -78.1F, 1.7F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 255
		bodyModel[198].setRotationPoint(-60.6F, -78.1F, 2.7F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 256
		bodyModel[199].setRotationPoint(-60.6F, -78.1F, 2.7F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 257
		bodyModel[200].setRotationPoint(-60.6F, -77.1F, 2.7F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 258
		bodyModel[201].setRotationPoint(-60.6F, -77.1F, 1.7F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 259
		bodyModel[202].setRotationPoint(-60.6F, -77.1F, 1.7F);

		bodyModel[203].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 260
		bodyModel[203].setRotationPoint(-60.7F, -77.1F, 2.7F);
		bodyModel[203].rotateAngleX = 3.92699082F;

		bodyModel[204].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 261
		bodyModel[204].setRotationPoint(-60.7F, -77.1F, 2.7F);
		bodyModel[204].rotateAngleX = 4.71238898F;

		bodyModel[205].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 262
		bodyModel[205].setRotationPoint(-60.7F, -77.1F, 2.7F);
		bodyModel[205].rotateAngleX = 5.49778714F;

		bodyModel[206].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 263
		bodyModel[206].setRotationPoint(-60.7F, -77.1F, 2.7F);

		bodyModel[207].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 265
		bodyModel[207].setRotationPoint(-60.6F, -77.1F, 2.7F);

		bodyModel[208].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 266
		bodyModel[208].setRotationPoint(-60.7F, -77.1F, 2.7F);
		bodyModel[208].rotateAngleX = 0.78539816F;

		bodyModel[209].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 267
		bodyModel[209].setRotationPoint(-60.7F, -77.1F, 2.7F);
		bodyModel[209].rotateAngleX = 1.57079633F;

		bodyModel[210].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 268
		bodyModel[210].setRotationPoint(-60.7F, -77.1F, 2.7F);
		bodyModel[210].rotateAngleX = 2.35619449F;

		bodyModel[211].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 269
		bodyModel[211].setRotationPoint(-60.7F, -77.1F, 2.7F);
		bodyModel[211].rotateAngleX = 3.14159265F;

		bodyModel[212].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.45F, 0.3F, 0F, -0.45F, 0.3F, 0F, -0.45F, 0.3F, 0F, -0.45F, 0.3F, 0F, -0.45F, 0.3F, 0F, -0.45F, 0.3F, 0F, -0.45F, 0.3F, 0F, -0.45F, 0.3F); // Box 270
		bodyModel[212].setRotationPoint(-60.7F, -77.1F, 0.0999999999999996F);
		bodyModel[212].rotateAngleX = -0.38397244F;

		bodyModel[213].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F); // Box 271
		bodyModel[213].setRotationPoint(-60.7F, -77.9F, -0.9F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, -0.9F, 0F, -0.5F, -0.9F, 0F, -0.5F, -0.9F, 0F, -0.5F, -0.9F); // Box 272
		bodyModel[214].setRotationPoint(-60.7F, -77.7F, -0.9F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 273
		bodyModel[215].setRotationPoint(-60.6F, -74.5F, -3.7F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 274
		bodyModel[216].setRotationPoint(-60.6F, -74.5F, -3.7F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F); // Box 275
		bodyModel[217].setRotationPoint(-60.6F, -75.5F, -3.7F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F); // Box 276
		bodyModel[218].setRotationPoint(-60.6F, -75.5F, -3.7F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F); // Box 277
		bodyModel[219].setRotationPoint(-60.6F, -75.5F, -3.7F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 278
		bodyModel[220].setRotationPoint(-60.6F, -75.5F, -2.7F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 279
		bodyModel[221].setRotationPoint(-60.6F, -75.5F, -2.7F);

		bodyModel[222].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 280
		bodyModel[222].setRotationPoint(-60.7F, -74.5F, -2.7F);
		bodyModel[222].rotateAngleX = 0.78539816F;

		bodyModel[223].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 281
		bodyModel[223].setRotationPoint(-60.6F, -74.5F, -2.7F);

		bodyModel[224].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 282
		bodyModel[224].setRotationPoint(-60.7F, -74.5F, -2.7F);
		bodyModel[224].rotateAngleX = 5.49778714F;

		bodyModel[225].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 283
		bodyModel[225].setRotationPoint(-60.7F, -74.5F, -2.7F);

		bodyModel[226].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 284
		bodyModel[226].setRotationPoint(-60.7F, -74.5F, -2.7F);
		bodyModel[226].rotateAngleX = 1.57079633F;

		bodyModel[227].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 285
		bodyModel[227].setRotationPoint(-60.7F, -74.5F, -2.7F);
		bodyModel[227].rotateAngleX = 2.35619449F;

		bodyModel[228].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 286
		bodyModel[228].setRotationPoint(-60.7F, -74.5F, -2.7F);
		bodyModel[228].rotateAngleX = 3.14159265F;

		bodyModel[229].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 287
		bodyModel[229].setRotationPoint(-60.6F, -74.5F, -2.7F);

		bodyModel[230].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F); // Box 288
		bodyModel[230].setRotationPoint(-60.7F, -74.5F, -2.7F);
		bodyModel[230].rotateAngleX = -3.90953752F;

		bodyModel[231].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 289
		bodyModel[231].setRotationPoint(-60.7F, -74.5F, -2.7F);
		bodyModel[231].rotateAngleX = 4.71238898F;

		bodyModel[232].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 290
		bodyModel[232].setRotationPoint(-60.7F, -74.5F, -2.7F);
		bodyModel[232].rotateAngleX = 3.92699082F;

		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 318
		bodyModel[233].setRotationPoint(-60.8F, -77.1F, 4.8F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 319
		bodyModel[234].setRotationPoint(-60.8F, -77.1F, 4.8F);

		bodyModel[235].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 320
		bodyModel[235].setRotationPoint(-60.9F, -77.1F, 5.8F);
		bodyModel[235].rotateAngleX = 3.92699082F;

		bodyModel[236].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F); // Box 321
		bodyModel[236].setRotationPoint(-60.8F, -78.1F, 4.8F);

		bodyModel[237].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 322
		bodyModel[237].setRotationPoint(-60.9F, -77.1F, 5.8F);
		bodyModel[237].rotateAngleX = 3.14159265F;

		bodyModel[238].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F); // Box 323
		bodyModel[238].setRotationPoint(-60.8F, -78.1F, 4.8F);

		bodyModel[239].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 324
		bodyModel[239].setRotationPoint(-60.9F, -77.1F, 5.8F);
		bodyModel[239].rotateAngleX = 2.35619449F;

		bodyModel[240].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F); // Box 325
		bodyModel[240].setRotationPoint(-60.8F, -78.1F, 4.8F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 326
		bodyModel[241].setRotationPoint(-60.8F, -78.1F, 5.8F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 327
		bodyModel[242].setRotationPoint(-60.8F, -78.1F, 5.8F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 328
		bodyModel[243].setRotationPoint(-60.8F, -77.1F, 5.8F);

		bodyModel[244].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 329
		bodyModel[244].setRotationPoint(-60.9F, -77.1F, 5.8F);
		bodyModel[244].rotateAngleX = 5.49778714F;

		bodyModel[245].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 330
		bodyModel[245].setRotationPoint(-60.9F, -77.1F, 5.8F);

		bodyModel[246].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 331
		bodyModel[246].setRotationPoint(-60.9F, -77.1F, 5.8F);
		bodyModel[246].rotateAngleX = 0.78539816F;

		bodyModel[247].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 332
		bodyModel[247].setRotationPoint(-60.9F, -77.1F, 5.8F);
		bodyModel[247].rotateAngleX = 1.57079633F;

		bodyModel[248].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F); // Box 333
		bodyModel[248].setRotationPoint(-60.9F, -77.1F, 5.8F);
		bodyModel[248].rotateAngleX = -3.90953752F;

		bodyModel[249].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 334
		bodyModel[249].setRotationPoint(-60.8F, -77.1F, 5.8F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 340
		bodyModel[250].setRotationPoint(-60.8F, -80.6F, 4.4F);

		bodyModel[251].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F); // Box 341
		bodyModel[251].setRotationPoint(-60.9F, -79.6F, 4.4F);
		bodyModel[251].rotateAngleX = -1.57079633F;

		bodyModel[252].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 342
		bodyModel[252].setRotationPoint(-60.8F, -79.6F, 4.4F);

		bodyModel[253].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 343
		bodyModel[253].setRotationPoint(-60.9F, -79.6F, 4.4F);
		bodyModel[253].rotateAngleX = 5.49778714F;

		bodyModel[254].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 344
		bodyModel[254].setRotationPoint(-60.8F, -79.6F, 4.4F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 345
		bodyModel[255].setRotationPoint(-60.8F, -79.6F, 3.4F);

		bodyModel[256].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 346
		bodyModel[256].setRotationPoint(-60.9F, -79.6F, 4.4F);
		bodyModel[256].rotateAngleX = 4.71238898F;

		bodyModel[257].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 347
		bodyModel[257].setRotationPoint(-60.9F, -79.6F, 4.4F);
		bodyModel[257].rotateAngleX = 3.92699082F;

		bodyModel[258].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 348
		bodyModel[258].setRotationPoint(-60.8F, -79.6F, 3.4F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F); // Box 349
		bodyModel[259].setRotationPoint(-60.8F, -80.6F, 3.4F);

		bodyModel[260].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 350
		bodyModel[260].setRotationPoint(-60.9F, -79.6F, 4.4F);
		bodyModel[260].rotateAngleX = 3.14159265F;

		bodyModel[261].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F); // Box 351
		bodyModel[261].setRotationPoint(-60.8F, -80.6F, 3.4F);

		bodyModel[262].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 352
		bodyModel[262].setRotationPoint(-60.9F, -79.6F, 4.4F);
		bodyModel[262].rotateAngleX = 2.35619449F;

		bodyModel[263].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F); // Box 353
		bodyModel[263].setRotationPoint(-60.8F, -80.6F, 3.4F);

		bodyModel[264].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 354
		bodyModel[264].setRotationPoint(-60.9F, -79.6F, 4.4F);
		bodyModel[264].rotateAngleX = 1.57079633F;

		bodyModel[265].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 355
		bodyModel[265].setRotationPoint(-60.8F, -80.6F, 4.4F);

		bodyModel[266].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 356
		bodyModel[266].setRotationPoint(-60.9F, -79.6F, 4.4F);
		bodyModel[266].rotateAngleX = 0.78539816F;

		bodyModel[267].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 387
		bodyModel[267].setRotationPoint(-60.8F, -77.6F, -6.3F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F); // Box 388
		bodyModel[268].setRotationPoint(-60.8F, -77.6F, -7.3F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 390
		bodyModel[269].setRotationPoint(-60.8F, -77.6F, -6.3F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F); // Box 391
		bodyModel[270].setRotationPoint(-60.8F, -77.6F, -7.3F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 392
		bodyModel[271].setRotationPoint(-60.8F, -76.6F, -7.3F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 393
		bodyModel[272].setRotationPoint(-60.8F, -76.6F, -7.3F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 394
		bodyModel[273].setRotationPoint(-60.8F, -76.6F, -6.3F);

		bodyModel[274].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 395
		bodyModel[274].setRotationPoint(-60.8F, -77.2F, -6.3F);

		bodyModel[275].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, 0F, 0F, -0.48F, 0F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, 0F, 0F, -0.48F, 0F); // Box 396
		bodyModel[275].setRotationPoint(-60.9F, -77.2F, -6.3F);
		bodyModel[275].rotateAngleX = -1.29154365F;

		bodyModel[276].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 397
		bodyModel[276].setRotationPoint(-60.9F, -76.6F, -6.3F);
		bodyModel[276].rotateAngleX = 3.14159265F;

		bodyModel[277].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 398
		bodyModel[277].setRotationPoint(-60.9F, -76.6F, -6.3F);
		bodyModel[277].rotateAngleX = 3.92699082F;

		bodyModel[278].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 399
		bodyModel[278].setRotationPoint(-60.9F, -76.6F, -6.3F);
		bodyModel[278].rotateAngleX = 5.49778714F;

		bodyModel[279].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 400
		bodyModel[279].setRotationPoint(-60.9F, -76.6F, -6.3F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F); // Box 401
		bodyModel[280].setRotationPoint(-60.7F, -77.8F, -7.3F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F); // Box 402
		bodyModel[281].setRotationPoint(-60.6F, -78.1F, -3.7F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F); // Box 403
		bodyModel[282].setRotationPoint(-60.6F, -78.1F, -3.7F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F); // Box 404
		bodyModel[283].setRotationPoint(-60.6F, -78.1F, -3.7F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 405
		bodyModel[284].setRotationPoint(-60.6F, -78.1F, -2.7F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 406
		bodyModel[285].setRotationPoint(-60.6F, -78.1F, -2.7F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 407
		bodyModel[286].setRotationPoint(-60.6F, -77.1F, -2.7F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 408
		bodyModel[287].setRotationPoint(-60.6F, -77.1F, -3.7F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 409
		bodyModel[288].setRotationPoint(-60.6F, -77.1F, -3.7F);

		bodyModel[289].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 410
		bodyModel[289].setRotationPoint(-60.7F, -77.1F, -2.7F);
		bodyModel[289].rotateAngleX = 3.92699082F;

		bodyModel[290].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 411
		bodyModel[290].setRotationPoint(-60.7F, -77.1F, -2.7F);
		bodyModel[290].rotateAngleX = 3.14159265F;

		bodyModel[291].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 412
		bodyModel[291].setRotationPoint(-60.7F, -77.1F, -2.7F);
		bodyModel[291].rotateAngleX = 2.35619449F;

		bodyModel[292].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 413
		bodyModel[292].setRotationPoint(-60.7F, -77.1F, -2.7F);
		bodyModel[292].rotateAngleX = 1.57079633F;

		bodyModel[293].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 414
		bodyModel[293].setRotationPoint(-60.7F, -77.1F, -2.7F);
		bodyModel[293].rotateAngleX = 0.78539816F;

		bodyModel[294].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 415
		bodyModel[294].setRotationPoint(-60.7F, -77.1F, -2.7F);

		bodyModel[295].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 416
		bodyModel[295].setRotationPoint(-60.7F, -77.1F, -2.7F);
		bodyModel[295].rotateAngleX = 5.49778714F;

		bodyModel[296].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 417
		bodyModel[296].setRotationPoint(-60.7F, -77.1F, -2.7F);
		bodyModel[296].rotateAngleX = 4.71238898F;

		bodyModel[297].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 418
		bodyModel[297].setRotationPoint(-60.6F, -77.1F, -2.7F);

		bodyModel[298].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F); // Box 419
		bodyModel[298].setRotationPoint(-60.7F, -77.1F, -2.7F);
		bodyModel[298].rotateAngleX = -1.57079633F;

		bodyModel[299].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 421
		bodyModel[299].setRotationPoint(-60.6F, -75.1F, -1.1F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 422
		bodyModel[300].setRotationPoint(-60.6F, -75.1F, -1.1F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F); // Box 423
		bodyModel[301].setRotationPoint(-60.6F, -75.1F, -1.1F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F); // Box 424
		bodyModel[302].setRotationPoint(-60.6F, -75.1F, -1.1F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F); // Box 425
		bodyModel[303].setRotationPoint(-60.6F, -75.1F, -1.1F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F); // Box 426
		bodyModel[304].setRotationPoint(-60.6F, -75.1F, -1.1F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F); // Box 427
		bodyModel[305].setRotationPoint(-60.6F, -75.1F, -1.1F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 428
		bodyModel[306].setRotationPoint(-60.6F, -75.1F, -1.1F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 429
		bodyModel[307].setRotationPoint(-60.8F, -80.6F, -4.4F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 430
		bodyModel[308].setRotationPoint(-60.8F, -80.6F, -4.4F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F); // Box 431
		bodyModel[309].setRotationPoint(-60.8F, -80.6F, -5.4F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F); // Box 432
		bodyModel[310].setRotationPoint(-60.8F, -80.6F, -5.4F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F); // Box 433
		bodyModel[311].setRotationPoint(-60.8F, -80.6F, -5.4F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 434
		bodyModel[312].setRotationPoint(-60.8F, -79.6F, -5.4F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 435
		bodyModel[313].setRotationPoint(-60.8F, -79.6F, -5.4F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 436
		bodyModel[314].setRotationPoint(-60.8F, -79.6F, -4.4F);

		bodyModel[315].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 437
		bodyModel[315].setRotationPoint(-60.9F, -79.6F, -4.4F);
		bodyModel[315].rotateAngleX = 5.49778714F;

		bodyModel[316].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 438
		bodyModel[316].setRotationPoint(-60.9F, -79.6F, -4.4F);

		bodyModel[317].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 439
		bodyModel[317].setRotationPoint(-60.9F, -79.6F, -4.4F);
		bodyModel[317].rotateAngleX = 0.78539816F;

		bodyModel[318].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 440
		bodyModel[318].setRotationPoint(-60.9F, -79.6F, -4.4F);
		bodyModel[318].rotateAngleX = 1.57079633F;

		bodyModel[319].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 441
		bodyModel[319].setRotationPoint(-60.9F, -79.6F, -4.4F);
		bodyModel[319].rotateAngleX = 2.35619449F;

		bodyModel[320].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 442
		bodyModel[320].setRotationPoint(-60.9F, -79.6F, -4.4F);
		bodyModel[320].rotateAngleX = 3.14159265F;

		bodyModel[321].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 443
		bodyModel[321].setRotationPoint(-60.9F, -79.6F, -4.4F);
		bodyModel[321].rotateAngleX = 3.92699082F;

		bodyModel[322].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 444
		bodyModel[322].setRotationPoint(-60.9F, -79.6F, -4.4F);
		bodyModel[322].rotateAngleX = 4.71238898F;

		bodyModel[323].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 445
		bodyModel[323].setRotationPoint(-60.8F, -79.6F, -4.4F);

		bodyModel[324].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, 0F, 0F, -0.48F, 0F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, 0F, 0F, -0.48F, 0F); // Box 446
		bodyModel[324].setRotationPoint(-60.9F, -79.6F, -4.4F);
		bodyModel[324].rotateAngleX = -4.36332313F;

		bodyModel[325].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, 0F, 0F, -0.48F, 0F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, 0F, 0F, -0.48F, 0F); // Box 447
		bodyModel[325].setRotationPoint(-60.9F, -79.6F, -4.4F);
		bodyModel[325].rotateAngleX = -1.32645023F;

		bodyModel[326].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 448
		bodyModel[326].setRotationPoint(-60.8F, -74.5F, 3.5F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F); // Box 449
		bodyModel[327].setRotationPoint(-60.8F, -75F, 3F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F); // Box 450
		bodyModel[328].setRotationPoint(-60.8F, -75F, 3F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F); // Box 451
		bodyModel[329].setRotationPoint(-60.8F, -75F, 3F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F); // Box 452
		bodyModel[330].setRotationPoint(-60.8F, -75F, 3F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F); // Box 453
		bodyModel[331].setRotationPoint(-60.8F, -75F, 3F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 454
		bodyModel[332].setRotationPoint(-60.8F, -75F, 3F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 455
		bodyModel[333].setRotationPoint(-60.8F, -75F, 3F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 456
		bodyModel[334].setRotationPoint(-60.8F, -75F, 3F);

		bodyModel[335].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F); // Box 457
		bodyModel[335].setRotationPoint(-60.9F, -74.5F, 3.5F);
		bodyModel[335].rotateAngleX = -1.57079633F;

		bodyModel[336].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F); // Box 458
		bodyModel[336].setRotationPoint(-60.7F, -74.6F, 1.5F);
		bodyModel[336].rotateAngleX = -1.57079633F;

		bodyModel[337].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 459
		bodyModel[337].setRotationPoint(-60.6F, -74.6F, 1.5F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F); // Box 460
		bodyModel[338].setRotationPoint(-60.6F, -75.1F, 1F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F); // Box 461
		bodyModel[339].setRotationPoint(-60.6F, -75.1F, 1F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F); // Box 462
		bodyModel[340].setRotationPoint(-60.6F, -75.1F, 1F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 463
		bodyModel[341].setRotationPoint(-60.6F, -75.1F, 1F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 464
		bodyModel[342].setRotationPoint(-60.6F, -75.1F, 1F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 465
		bodyModel[343].setRotationPoint(-60.6F, -75.1F, 1F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F); // Box 466
		bodyModel[344].setRotationPoint(-60.6F, -75.1F, 1F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F); // Box 467
		bodyModel[345].setRotationPoint(-60.6F, -75.1F, 1F);

		bodyModel[346].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F); // Box 468
		bodyModel[346].setRotationPoint(-60.9F, -80F, 2F);
		bodyModel[346].rotateAngleX = 1.57079633F;

		bodyModel[347].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 469
		bodyModel[347].setRotationPoint(-60.8F, -80F, 2F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F); // Box 470
		bodyModel[348].setRotationPoint(-60.8F, -80.5F, 1.5F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F); // Box 471
		bodyModel[349].setRotationPoint(-60.8F, -80.5F, 1.5F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F); // Box 472
		bodyModel[350].setRotationPoint(-60.8F, -80.5F, 1.5F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 473
		bodyModel[351].setRotationPoint(-60.8F, -80.5F, 1.5F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 474
		bodyModel[352].setRotationPoint(-60.8F, -80.5F, 1.5F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 475
		bodyModel[353].setRotationPoint(-60.8F, -80.5F, 1.5F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F); // Box 476
		bodyModel[354].setRotationPoint(-60.8F, -80.5F, 1.5F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F); // Box 477
		bodyModel[355].setRotationPoint(-60.8F, -80.5F, 1.5F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F); // Box 478
		bodyModel[356].setRotationPoint(-60.8F, -75F, -6.5F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F); // Box 480
		bodyModel[357].setRotationPoint(-60.8F, -75F, -6.5F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F); // Box 481
		bodyModel[358].setRotationPoint(-60.8F, -75F, -6.5F);

		bodyModel[359].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F); // Box 482
		bodyModel[359].setRotationPoint(-60.8F, -75F, -6.5F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F); // Box 483
		bodyModel[360].setRotationPoint(-60.8F, -75F, -6.5F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 484
		bodyModel[361].setRotationPoint(-60.8F, -75F, -6.5F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 485
		bodyModel[362].setRotationPoint(-60.8F, -75F, -6.5F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 486
		bodyModel[363].setRotationPoint(-60.8F, -75F, -6.5F);

		bodyModel[364].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, 0F, 0F, -0.48F, 0F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, 0F, 0F, -0.48F, 0F); // Box 487
		bodyModel[364].setRotationPoint(-60.9F, -74.5F, -6.6F);
		bodyModel[364].rotateAngleX = -0.38397244F;

		bodyModel[365].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 488
		bodyModel[365].setRotationPoint(-60.8F, -72.3F, -1.6F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 489
		bodyModel[366].setRotationPoint(-60.8F, -72.3F, 0.4F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F); // Box 460
		bodyModel[367].setRotationPoint(-60.8F, -75.5F, 4.8F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 461
		bodyModel[368].setRotationPoint(-60.8F, -75.5F, 5.8F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 462
		bodyModel[369].setRotationPoint(-60.8F, -74.5F, 5.8F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 463
		bodyModel[370].setRotationPoint(-60.8F, -74.5F, 4.8F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 464
		bodyModel[371].setRotationPoint(-60.8F, -74.5F, 4.8F);

		bodyModel[372].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F); // Box 465
		bodyModel[372].setRotationPoint(-60.8F, -75.5F, 4.8F);

		bodyModel[373].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 466
		bodyModel[373].setRotationPoint(-60.9F, -74.5F, 5.8F);
		bodyModel[373].rotateAngleX = 3.14159265F;

		bodyModel[374].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F); // Box 467
		bodyModel[374].setRotationPoint(-60.8F, -75.5F, 4.8F);

		bodyModel[375].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F); // Box 468
		bodyModel[375].setRotationPoint(-60.9F, -74.5F, 5.8F);
		bodyModel[375].rotateAngleX = -3.90953752F;

		bodyModel[376].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 469
		bodyModel[376].setRotationPoint(-60.8F, -74.5F, 5.8F);

		bodyModel[377].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 470
		bodyModel[377].setRotationPoint(-60.9F, -74.5F, 5.8F);
		bodyModel[377].rotateAngleX = 3.92699082F;

		bodyModel[378].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 471
		bodyModel[378].setRotationPoint(-60.9F, -74.5F, 5.8F);
		bodyModel[378].rotateAngleX = 5.49778714F;

		bodyModel[379].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 472
		bodyModel[379].setRotationPoint(-60.9F, -74.5F, 5.8F);

		bodyModel[380].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 473
		bodyModel[380].setRotationPoint(-60.9F, -74.5F, 5.8F);
		bodyModel[380].rotateAngleX = 0.78539816F;

		bodyModel[381].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 474
		bodyModel[381].setRotationPoint(-60.9F, -74.5F, 5.8F);
		bodyModel[381].rotateAngleX = 1.57079633F;

		bodyModel[382].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 475
		bodyModel[382].setRotationPoint(-60.9F, -74.5F, 5.8F);
		bodyModel[382].rotateAngleX = 2.35619449F;

		bodyModel[383].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 476
		bodyModel[383].setRotationPoint(-60.8F, -75.5F, 5.8F);

		bodyModel[384].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F); // Box 477
		bodyModel[384].setRotationPoint(-60.9F, -79.5F, -2F);
		bodyModel[384].rotateAngleX = 1.57079633F;

		bodyModel[385].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 478
		bodyModel[385].setRotationPoint(-60.8F, -80F, -2F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 479
		bodyModel[386].setRotationPoint(-60.8F, -80.5F, -2.5F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 480
		bodyModel[387].setRotationPoint(-60.8F, -80.5F, -2.5F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F); // Box 481
		bodyModel[388].setRotationPoint(-60.8F, -80.5F, -2.5F);

		bodyModel[389].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F); // Box 482
		bodyModel[389].setRotationPoint(-60.8F, -80.5F, -2.5F);

		bodyModel[390].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F); // Box 483
		bodyModel[390].setRotationPoint(-60.8F, -80.5F, -2.5F);

		bodyModel[391].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F); // Box 484
		bodyModel[391].setRotationPoint(-60.8F, -80.5F, -2.5F);

		bodyModel[392].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F); // Box 485
		bodyModel[392].setRotationPoint(-60.8F, -80.5F, -2.5F);

		bodyModel[393].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 486
		bodyModel[393].setRotationPoint(-60.8F, -80.5F, -2.5F);

		bodyModel[394].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 487
		bodyModel[394].setRotationPoint(-60.8F, -75.8F, -4F);

		bodyModel[395].addShapeBox(0F, 0F, 0F, 8, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 462
		bodyModel[395].setRotationPoint(-67F, -82F, -7F);

		bodyModel[396].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, -2F, 0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 2F, 2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 463
		bodyModel[396].setRotationPoint(-63F, -82F, -10F);

		bodyModel[397].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 465
		bodyModel[397].setRotationPoint(-60.5F, -82.5F, -1F);

		bodyModel[398].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, 0F); // Box 466
		bodyModel[398].setRotationPoint(-60.5F, -83F, -1F);

		bodyModel[399].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 467
		bodyModel[399].setRotationPoint(-59F, -83.25F, -1F);

		bodyModel[400].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 468
		bodyModel[400].setRotationPoint(-59F, -82.25F, -1F);

		bodyModel[401].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.6F, -0.25F, 0F); // Box 469
		bodyModel[401].setRotationPoint(-59.1F, -81.75F, -1F);

		bodyModel[402].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.7F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.5F, 0F, -0.7F, -0.5F, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 470
		bodyModel[402].setRotationPoint(-60.5F, -84F, -1F);

		bodyModel[403].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.7F, -0.5F, -0.3F, -0.2F, -0.5F, -0.3F, -0.2F, -0.3F, 0F, -0.7F, -0.3F, 0F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 471
		bodyModel[403].setRotationPoint(-60.5F, -84F, 0F);

		bodyModel[404].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.1F); // Box 472
		bodyModel[404].setRotationPoint(-58.7F, -83F, -1F);

		bodyModel[405].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F,-2F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 512
		bodyModel[405].setRotationPoint(-67F, -82F, -10F);

		bodyModel[406].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1F, 0F, -1.5F); // Box 513
		bodyModel[406].setRotationPoint(-64F, -80F, -11F);

		bodyModel[407].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 514
		bodyModel[407].setRotationPoint(-63F, -78F, -11F);

		bodyModel[408].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 2F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 2F, 2F, 0F, 0F, 2F, 0F); // Box 515
		bodyModel[408].setRotationPoint(-63F, -82F, 7F);

		bodyModel[409].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 516
		bodyModel[409].setRotationPoint(-67F, -82F, 7F);

		bodyModel[410].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 517
		bodyModel[410].setRotationPoint(-64F, -80F, 9F);

		bodyModel[411].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 518
		bodyModel[411].setRotationPoint(-63F, -78F, 10F);

		bodyModel[412].addShapeBox(0F, 0F, 0F, 7, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 341
		bodyModel[412].setRotationPoint(-74F, -82F, -7F);

		bodyModel[413].addShapeBox(0F, 1F, 0F, 10, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
		bodyModel[413].setRotationPoint(-56F, -69F, -5F);
		bodyModel[413].rotateAngleZ = -0.10471976F;

		bodyModel[414].addShapeBox(9F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		bodyModel[414].setRotationPoint(-56F, -69F, -5F);
		bodyModel[414].rotateAngleZ = -0.10471976F;

		bodyModel[415].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		bodyModel[415].setRotationPoint(-56F, -69F, -5F);
		bodyModel[415].rotateAngleZ = -0.10471976F;

		bodyModel[416].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		bodyModel[416].setRotationPoint(-56F, -69F, 4F);
		bodyModel[416].rotateAngleZ = -0.10471976F;

		bodyModel[417].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		bodyModel[417].setRotationPoint(-56F, -69F, -5F);
		bodyModel[417].rotateAngleZ = -0.10471976F;

		bodyModel[418].addShapeBox(0F, 0F, 0F, 1, 15, 10, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		bodyModel[418].setRotationPoint(-47F, -83F, -5F);

		bodyModel[419].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[419].setRotationPoint(-45F, -87F, -3F);

		bodyModel[420].addShapeBox(0F, 0F, 0F, 1, 15, 8, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 246
		bodyModel[420].setRotationPoint(-48F, -82F, -4F);

		bodyModel[421].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[421].setRotationPoint(-48.3F, -82.3F, -2F);

		bodyModel[422].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[422].setRotationPoint(-48.3F, -82.3F, 1F);

		bodyModel[423].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[423].setRotationPoint(-47F, -80F, -4F);

		bodyModel[424].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 251
		bodyModel[424].setRotationPoint(-47F, -80F, 3F);

		bodyModel[425].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[425].setRotationPoint(-53F, -68F, -6F);
		bodyModel[425].rotateAngleZ = 0.78539816F;

		bodyModel[426].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 253
		bodyModel[426].setRotationPoint(-53F, -68F, 5F);
		bodyModel[426].rotateAngleZ = 0.78539816F;

		bodyModel[427].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 962
		bodyModel[427].setRotationPoint(-45.5F, -86.5F, -1.5F);

		bodyModel[428].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 964
		bodyModel[428].setRotationPoint(-45.5F, -85.5F, -1.5F);

		bodyModel[429].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 966
		bodyModel[429].setRotationPoint(-45.5F, -84.5F, -1.5F);

		bodyModel[430].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 488
		bodyModel[430].setRotationPoint(-60.8F, -72.3F, -1.6F);

		bodyModel[431].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 489
		bodyModel[431].setRotationPoint(-60.8F, -72.3F, 0.4F);

		bodyModel[432].addShapeBox(0F, 0F, 0F, 5, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 256
		bodyModel[432].setRotationPoint(-66F, -73F, -2F);

		bodyModel[433].addShapeBox(0F, 0F, 0F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[433].setRotationPoint(-60F, -67F, -2F);

		bodyModel[434].addShapeBox(0F, 0F, 0F, 7, 3, 3, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 254
		bodyModel[434].setRotationPoint(-60F, -68F, -1.5F);

		bodyModel[435].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 263
		bodyModel[435].setRotationPoint(-58.5F, -71F, -1F);

		bodyModel[436].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 264
		bodyModel[436].setRotationPoint(-58F, -75F, -0.5F);

		bodyModel[437].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 265
		bodyModel[437].setRotationPoint(-58F, -77F, -0.5F);

		bodyModel[438].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 266
		bodyModel[438].setRotationPoint(-57.7F, -77.1F, -0.5F);

		bodyModel[439].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 601
		bodyModel[439].setRotationPoint(-54.5F, -76.3F, -11.5F);

		bodyModel[440].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 602
		bodyModel[440].setRotationPoint(-54F, -74.3F, -12F);

		bodyModel[441].addShapeBox(-1F, -2F, 0F, 1, 2, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 603
		bodyModel[441].setRotationPoint(-53F, -74.3F, -11.2F);
		bodyModel[441].rotateAngleZ = 0.36651914F;

		bodyModel[442].addShapeBox(-1F, -2F, 0F, 1, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 604
		bodyModel[442].setRotationPoint(-53F, -74.3F, -10.7F);
		bodyModel[442].rotateAngleZ = 0.36651914F;

		bodyModel[443].addShapeBox(0F, 0F, 0F, 15, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 967
		bodyModel[443].setRotationPoint(-58F, -71.3F, -11F);

		bodyModel[444].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 968
		bodyModel[444].setRotationPoint(-59F, -71.3F, -11F);

		bodyModel[445].addShapeBox(0F, 0F, 0F, 1, 15, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 615
		bodyModel[445].setRotationPoint(-43F, -79.3F, -11F);

		bodyModel[446].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 616
		bodyModel[446].setRotationPoint(-43F, -80.3F, -11F);

		bodyModel[447].addShapeBox(0F, -3F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 259
		bodyModel[447].setRotationPoint(-63F, -66F, -6F);
		bodyModel[447].rotateAngleZ = 0.15707963F;

		bodyModel[448].addShapeBox(0F, -3F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 377
		bodyModel[448].setRotationPoint(-63F, -66F, 4F);
		bodyModel[448].rotateAngleZ = 0.15707963F;

		bodyModel[449].addShapeBox(0F, 0F, 0F, 15, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 378
		bodyModel[449].setRotationPoint(-58F, -71.3F, 8F);

		bodyModel[450].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 379
		bodyModel[450].setRotationPoint(-59F, -71.3F, 8F);

		bodyModel[451].addShapeBox(0F, 0F, 0F, 13, 15, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 380
		bodyModel[451].setRotationPoint(-19F, -79.3F, -11F);

		bodyModel[452].addShapeBox(0F, 0F, 0F, 13, 1, 22, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 381
		bodyModel[452].setRotationPoint(-19F, -80.3F, -11F);

		bodyModel[453].addShapeBox(0F, 1F, 0F, 10, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 382
		bodyModel[453].setRotationPoint(-32F, -69F, -5F);
		bodyModel[453].rotateAngleZ = -0.10471976F;

		bodyModel[454].addShapeBox(9F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 383
		bodyModel[454].setRotationPoint(-32F, -69F, -5F);
		bodyModel[454].rotateAngleZ = -0.10471976F;

		bodyModel[455].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 384
		bodyModel[455].setRotationPoint(-32F, -69F, -5F);
		bodyModel[455].rotateAngleZ = -0.10471976F;

		bodyModel[456].addShapeBox(0F, 0F, 0F, 1, 15, 10, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 385
		bodyModel[456].setRotationPoint(-23F, -83F, -5F);

		bodyModel[457].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 386
		bodyModel[457].setRotationPoint(-32F, -69F, 4F);
		bodyModel[457].rotateAngleZ = -0.10471976F;

		bodyModel[458].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 387
		bodyModel[458].setRotationPoint(-32F, -69F, -5F);
		bodyModel[458].rotateAngleZ = -0.10471976F;

		bodyModel[459].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 388
		bodyModel[459].setRotationPoint(-29F, -68F, -6F);
		bodyModel[459].rotateAngleZ = 0.78539816F;

		bodyModel[460].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 389
		bodyModel[460].setRotationPoint(-29F, -68F, 5F);
		bodyModel[460].rotateAngleZ = 0.78539816F;

		bodyModel[461].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 390
		bodyModel[461].setRotationPoint(-24.3F, -82.3F, 1F);

		bodyModel[462].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 391
		bodyModel[462].setRotationPoint(-24.3F, -82.3F, -2F);

		bodyModel[463].addShapeBox(0F, 0F, 0F, 1, 15, 8, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 392
		bodyModel[463].setRotationPoint(-24F, -82F, -4F);

		bodyModel[464].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 393
		bodyModel[464].setRotationPoint(-23F, -80F, -4F);

		bodyModel[465].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[465].setRotationPoint(-23F, -80F, 3F);

		bodyModel[466].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 395
		bodyModel[466].setRotationPoint(-21F, -87F, -3F);

		bodyModel[467].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 396
		bodyModel[467].setRotationPoint(-21.5F, -86.5F, -1.5F);

		bodyModel[468].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 397
		bodyModel[468].setRotationPoint(-21.5F, -85.5F, -1.5F);

		bodyModel[469].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 398
		bodyModel[469].setRotationPoint(-21.5F, -84.5F, -1.5F);

		bodyModel[470].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 399
		bodyModel[470].setRotationPoint(14F, -88F, -0.5F);
	}

	private void initnoseModel_1()
	{
		noseModel[0] = new ModelRendererTurbo(this, 241, 959, textureX, textureY); // Box 18
		noseModel[1] = new ModelRendererTurbo(this, 313, 959, textureX, textureY); // Box 19
		noseModel[2] = new ModelRendererTurbo(this, 385, 959, textureX, textureY); // Box 20
		noseModel[3] = new ModelRendererTurbo(this, 513, 959, textureX, textureY); // Box 25
		noseModel[4] = new ModelRendererTurbo(this, 577, 959, textureX, textureY); // Box 26
		noseModel[5] = new ModelRendererTurbo(this, 689, 959, textureX, textureY); // Box 49
		noseModel[6] = new ModelRendererTurbo(this, 49, 959, textureX, textureY); // Box 100
		noseModel[7] = new ModelRendererTurbo(this, 105, 959, textureX, textureY); // Box 101
		noseModel[8] = new ModelRendererTurbo(this, 169, 959, textureX, textureY); // Box 102
		noseModel[9] = new ModelRendererTurbo(this, 225, 959, textureX, textureY); // Box 103
		noseModel[10] = new ModelRendererTurbo(this, 297, 959, textureX, textureY); // Box 104
		noseModel[11] = new ModelRendererTurbo(this, 369, 959, textureX, textureY); // Box 105
		noseModel[12] = new ModelRendererTurbo(this, 433, 959, textureX, textureY); // Box 106
		noseModel[13] = new ModelRendererTurbo(this, 497, 959, textureX, textureY); // Box 107
		noseModel[14] = new ModelRendererTurbo(this, 241, 983, textureX, textureY); // Box 145
		noseModel[15] = new ModelRendererTurbo(this, 313, 983, textureX, textureY); // Box 146
		noseModel[16] = new ModelRendererTurbo(this, 385, 983, textureX, textureY); // Box 147
		noseModel[17] = new ModelRendererTurbo(this, 513, 983, textureX, textureY); // Box 152
		noseModel[18] = new ModelRendererTurbo(this, 577, 983, textureX, textureY); // Box 153
		noseModel[19] = new ModelRendererTurbo(this, 689, 983, textureX, textureY); // Box 175
		noseModel[20] = new ModelRendererTurbo(this, 49, 983, textureX, textureY); // Box 226
		noseModel[21] = new ModelRendererTurbo(this, 105, 983, textureX, textureY); // Box 227
		noseModel[22] = new ModelRendererTurbo(this, 169, 983, textureX, textureY); // Box 228
		noseModel[23] = new ModelRendererTurbo(this, 225, 983, textureX, textureY); // Box 229
		noseModel[24] = new ModelRendererTurbo(this, 297, 983, textureX, textureY); // Box 230
		noseModel[25] = new ModelRendererTurbo(this, 369, 983, textureX, textureY); // Box 231
		noseModel[26] = new ModelRendererTurbo(this, 433, 983, textureX, textureY); // Box 232
		noseModel[27] = new ModelRendererTurbo(this, 497, 983, textureX, textureY); // Box 233
		noseModel[28] = new ModelRendererTurbo(this, 1, 1007, textureX, textureY); // Import Box0
		noseModel[29] = new ModelRendererTurbo(this, 25, 1007, textureX, textureY); // Box 242
		noseModel[30] = new ModelRendererTurbo(this, 49, 1007, textureX, textureY); // Box 243
		noseModel[31] = new ModelRendererTurbo(this, 73, 1007, textureX, textureY); // Box 244
		noseModel[32] = new ModelRendererTurbo(this, 81, 1007, textureX, textureY); // Box 245
		noseModel[33] = new ModelRendererTurbo(this, 89, 1007, textureX, textureY); // Box 246
		noseModel[34] = new ModelRendererTurbo(this, 105, 1007, textureX, textureY); // Box 247
		noseModel[35] = new ModelRendererTurbo(this, 121, 1007, textureX, textureY); // Box 248
		noseModel[36] = new ModelRendererTurbo(this, 137, 1007, textureX, textureY); // Box 249
		noseModel[37] = new ModelRendererTurbo(this, 153, 1007, textureX, textureY); // Box 223
		noseModel[38] = new ModelRendererTurbo(this, 161, 1007, textureX, textureY); // Box 224
		noseModel[39] = new ModelRendererTurbo(this, 177, 1007, textureX, textureY); // Box 225
		noseModel[40] = new ModelRendererTurbo(this, 185, 1007, textureX, textureY); // Box 229
		noseModel[41] = new ModelRendererTurbo(this, 201, 1007, textureX, textureY); // Box 273
		noseModel[42] = new ModelRendererTurbo(this, 217, 1007, textureX, textureY); // Box 274
		noseModel[43] = new ModelRendererTurbo(this, 233, 1007, textureX, textureY); // Box 275
		noseModel[44] = new ModelRendererTurbo(this, 249, 1007, textureX, textureY); // Box 276
		noseModel[45] = new ModelRendererTurbo(this, 265, 1007, textureX, textureY); // Box 277
		noseModel[46] = new ModelRendererTurbo(this, 281, 1007, textureX, textureY); // Box 278
		noseModel[47] = new ModelRendererTurbo(this, 297, 1007, textureX, textureY); // Box 279
		noseModel[48] = new ModelRendererTurbo(this, 857, 983, textureX, textureY); // Box 280
		noseModel[49] = new ModelRendererTurbo(this, 1, 983, textureX, textureY); // Box 888
		noseModel[50] = new ModelRendererTurbo(this, 569, 983, textureX, textureY); // Box 889
		noseModel[51] = new ModelRendererTurbo(this, 625, 983, textureX, textureY); // Box 890
		noseModel[52] = new ModelRendererTurbo(this, 673, 983, textureX, textureY); // Box 891
		noseModel[53] = new ModelRendererTurbo(this, 105, 983, textureX, textureY); // Box 892
		noseModel[54] = new ModelRendererTurbo(this, 737, 983, textureX, textureY); // Box 893
		noseModel[55] = new ModelRendererTurbo(this, 689, 983, textureX, textureY); // Box 894
		noseModel[56] = new ModelRendererTurbo(this, 753, 983, textureX, textureY); // Box 895
		noseModel[57] = new ModelRendererTurbo(this, 769, 983, textureX, textureY); // Box 896
		noseModel[58] = new ModelRendererTurbo(this, 129, 983, textureX, textureY); // Box 897
		noseModel[59] = new ModelRendererTurbo(this, 785, 983, textureX, textureY); // Box 898
		noseModel[60] = new ModelRendererTurbo(this, 169, 983, textureX, textureY); // Box 899
		noseModel[61] = new ModelRendererTurbo(this, 225, 983, textureX, textureY); // Box 900
		noseModel[62] = new ModelRendererTurbo(this, 801, 983, textureX, textureY); // Box 901
		noseModel[63] = new ModelRendererTurbo(this, 817, 983, textureX, textureY); // Box 902
		noseModel[64] = new ModelRendererTurbo(this, 825, 983, textureX, textureY); // Box 903
		noseModel[65] = new ModelRendererTurbo(this, 841, 983, textureX, textureY); // Box 904

		noseModel[0].addShapeBox(0F, 0F, 0F, 17, 7, 15, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 18
		noseModel[0].setRotationPoint(-104F, -68F, -15F);

		noseModel[1].addShapeBox(0F, 0F, 0F, 17, 6, 15, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		noseModel[1].setRotationPoint(-104F, -74F, -15F);

		noseModel[2].addShapeBox(0F, 0F, 0F, 17, 5, 13, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		noseModel[2].setRotationPoint(-104F, -79F, -13F);

		noseModel[3].addShapeBox(0F, 0F, 0F, 17, 5, 14, 0F,0F, 2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 25
		noseModel[3].setRotationPoint(-104F, -61F, -14F);

		noseModel[4].addShapeBox(0F, 0F, 0F, 17, 4, 10, 0F,0F, -1F, -5F, 0F, -1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		noseModel[4].setRotationPoint(-104F, -83F, -10F);

		noseModel[5].addShapeBox(0F, 0F, 0F, 17, 5, 10, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -4F, -4F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 49
		noseModel[5].setRotationPoint(-104F, -56F, -10F);

		noseModel[6].addShapeBox(0F, 0F, 0F, 6, 6, 4, 0F,0F, -1F, -2F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 100
		noseModel[6].setRotationPoint(-110F, -74F, -14F);

		noseModel[7].addShapeBox(0F, 0F, 0F, 6, 5, 6, 0F,0F, -2F, -4F, 0F, 0F, -3F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 1F, -3F, 0F, 2F, -3F); // Box 101
		noseModel[7].setRotationPoint(-110F, -79F, -13F);

		noseModel[8].addShapeBox(0F, 0F, 0F, 6, 4, 7, 0F,0F, -2F, -5F, 0F, 0F, -5F, 0F, -2F, -1F, 0F, -4F, -1F, 0F, 1F, -1F, 0F, -1F, 0F, 0F, 0F, -4F, 0F, 2F, -4F); // Box 102
		noseModel[8].setRotationPoint(-110F, -82F, -10F);

		noseModel[9].addShapeBox(0F, 0F, 0F, 6, 2, 5, 0F,0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 3F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 103
		noseModel[9].setRotationPoint(-110F, -83F, -5F);

		noseModel[10].addShapeBox(0F, 0F, 0F, 6, 5, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -2F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -2F, 0F); // Box 104
		noseModel[10].setRotationPoint(-110F, -68F, -14F);

		noseModel[11].addShapeBox(0F, 0F, 0F, 6, 5, 6, 0F,0F, 1F, -1F, 0F, 0F, 0F, 0F, 1F, -3F, 0F, 2F, -3F, 0F, -2F, -4F, 0F, 0F, -3F, 0F, -1F, 0F, 0F, -3F, 0F); // Box 105
		noseModel[11].setRotationPoint(-110F, -63F, -13F);

		noseModel[12].addShapeBox(0F, 0F, 0F, 6, 4, 7, 0F,0F, 1F, -1F, 0F, -1F, 0F, 0F, 0F, -4F, 0F, 2F, -4F, 0F, -2F, -5F, 0F, 0F, -4F, 0F, -2F, -1F, 0F, -4F, -1F); // Box 106
		noseModel[12].setRotationPoint(-110F, -59F, -10F);

		noseModel[13].addShapeBox(0F, 0F, 0F, 6, 2, 5, 0F,0F, 3F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -3F, 0F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 107
		noseModel[13].setRotationPoint(-110F, -56F, -5F);

		noseModel[14].addShapeBox(0F, 0F, 0F, 17, 7, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -2F); // Box 145
		noseModel[14].setRotationPoint(-104F, -68F, 0F);

		noseModel[15].addShapeBox(0F, 0F, 0F, 17, 6, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 146
		noseModel[15].setRotationPoint(-104F, -74F, 0F);

		noseModel[16].addShapeBox(0F, 0F, 0F, 17, 5, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		noseModel[16].setRotationPoint(-104F, -79F, 0F);

		noseModel[17].addShapeBox(0F, 0F, 0F, 17, 5, 14, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -2F, -4F); // Box 152
		noseModel[17].setRotationPoint(-104F, -61F, 0F);

		noseModel[18].addShapeBox(0F, 0F, 0F, 17, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -5F, 0F, -1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		noseModel[18].setRotationPoint(-104F, -83F, 0F);

		noseModel[19].addShapeBox(0F, 0F, 0F, 17, 5, 10, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, -4F, 0F, -4F, -4F); // Box 175
		noseModel[19].setRotationPoint(-104F, -56F, 0F);

		noseModel[20].addShapeBox(0F, 0F, 0F, 6, 6, 4, 0F,0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -1F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 226
		noseModel[20].setRotationPoint(-110F, -74F, 10F);

		noseModel[21].addShapeBox(0F, 0F, 0F, 6, 5, 6, 0F,0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, -3F, 0F, -2F, -4F, 0F, 2F, -3F, 0F, 1F, -3F, 0F, 0F, 0F, 0F, 1F, -1F); // Box 227
		noseModel[21].setRotationPoint(-110F, -79F, 7F);

		noseModel[22].addShapeBox(0F, 0F, 0F, 6, 4, 7, 0F,0F, -4F, -1F, 0F, -2F, -1F, 0F, 0F, -5F, 0F, -2F, -5F, 0F, 2F, -4F, 0F, 0F, -4F, 0F, -1F, 0F, 0F, 1F, -1F); // Box 228
		noseModel[22].setRotationPoint(-110F, -82F, 3F);

		noseModel[23].addShapeBox(0F, 0F, 0F, 6, 2, 5, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 3F, -1F); // Box 229
		noseModel[23].setRotationPoint(-110F, -83F, 0F);

		noseModel[24].addShapeBox(0F, 0F, 0F, 6, 5, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -1F, -2F); // Box 230
		noseModel[24].setRotationPoint(-110F, -68F, 10F);

		noseModel[25].addShapeBox(0F, 0F, 0F, 6, 5, 6, 0F,0F, 2F, -3F, 0F, 1F, -3F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, -3F, 0F, -2F, -4F); // Box 231
		noseModel[25].setRotationPoint(-110F, -63F, 7F);

		noseModel[26].addShapeBox(0F, 0F, 0F, 6, 4, 7, 0F,0F, 2F, -4F, 0F, 0F, -4F, 0F, -1F, 0F, 0F, 1F, -1F, 0F, -4F, -1F, 0F, -2F, -1F, 0F, 0F, -4F, 0F, -2F, -5F); // Box 232
		noseModel[26].setRotationPoint(-110F, -59F, 3F);

		noseModel[27].addShapeBox(0F, 0F, 0F, 6, 2, 5, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 3F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -3F, 0F); // Box 233
		noseModel[27].setRotationPoint(-110F, -56F, 0F);

		noseModel[28].addShapeBox(0F, 0F, 0F, 7, 5, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		noseModel[28].setRotationPoint(-117F, -70.5F, -2.5F);

		noseModel[29].addBox(0F, 0F, 0F, 7, 5, 3, 0F); // Box 242
		noseModel[29].setRotationPoint(-117F, -70.5F, -1.5F);

		noseModel[30].addShapeBox(0F, 0F, 0F, 7, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 243
		noseModel[30].setRotationPoint(-117F, -70.5F, 1.5F);

		noseModel[31].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 244
		noseModel[31].setRotationPoint(-118F, -70.5F, -2.5F);

		noseModel[32].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F); // Box 245
		noseModel[32].setRotationPoint(-118F, -70.5F, 1.5F);

		noseModel[33].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 246
		noseModel[33].setRotationPoint(-118F, -70.5F, -1.5F);

		noseModel[34].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		noseModel[34].setRotationPoint(-110F, -69.5F, -0.5F);

		noseModel[35].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		noseModel[35].setRotationPoint(-110F, -69.5F, -1.5F);

		noseModel[36].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 249
		noseModel[36].setRotationPoint(-110F, -69.5F, 0.5F);

		noseModel[37].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		noseModel[37].setRotationPoint(-106F, -70.5F, -2.5F);

		noseModel[38].addBox(0F, 0F, 0F, 2, 5, 3, 0F); // Box 224
		noseModel[38].setRotationPoint(-106F, -70.5F, -1.5F);

		noseModel[39].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 225
		noseModel[39].setRotationPoint(-106F, -70.5F, 1.5F);

		noseModel[40].addShapeBox(0F, 0F, -1.5F, 1, 13, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 229
		noseModel[40].setRotationPoint(-105.5F, -68F, 0F);
		noseModel[40].rotateAngleX = 3.14159265F;

		noseModel[41].addShapeBox(0F, 0F, -1.5F, 1, 13, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 273
		noseModel[41].setRotationPoint(-105.5F, -68F, 0F);

		noseModel[42].addShapeBox(0F, 0F, -1.5F, 1, 13, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 274
		noseModel[42].setRotationPoint(-105.5F, -68F, 0F);
		noseModel[42].rotateAngleX = 1.57079633F;

		noseModel[43].addShapeBox(0F, 0F, -1.5F, 1, 13, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 275
		noseModel[43].setRotationPoint(-105.5F, -68F, 0F);
		noseModel[43].rotateAngleX = -1.57079633F;

		noseModel[44].addShapeBox(0F, 0F, -1.5F, 1, 13, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 276
		noseModel[44].setRotationPoint(-105.5F, -68F, 0F);
		noseModel[44].rotateAngleX = -0.78539816F;

		noseModel[45].addShapeBox(0F, 0F, -1.5F, 1, 13, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 277
		noseModel[45].setRotationPoint(-105.5F, -68F, 0F);
		noseModel[45].rotateAngleX = 0.78539816F;

		noseModel[46].addShapeBox(0F, 0F, -1.5F, 1, 13, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 278
		noseModel[46].setRotationPoint(-105.5F, -68F, 0F);
		noseModel[46].rotateAngleX = 2.35619449F;

		noseModel[47].addShapeBox(0F, 0F, -1.5F, 1, 13, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 279
		noseModel[47].setRotationPoint(-105.5F, -68F, 0F);
		noseModel[47].rotateAngleX = -2.35619449F;

		noseModel[48].addShapeBox(0F, 0F, 0F, 3, 25, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 280
		noseModel[48].setRotationPoint(-89F, -107F, -0.5F);

		noseModel[49].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 888
		noseModel[49].setRotationPoint(-81.5F, -69F, 13F);

		noseModel[50].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 889
		noseModel[50].setRotationPoint(-81.5F, -67F, 13F);

		noseModel[51].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 890
		noseModel[51].setRotationPoint(-81.5F, -68F, 13F);

		noseModel[52].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 891
		noseModel[52].setRotationPoint(-84.5F, -69F, 16F);

		noseModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 892
		noseModel[53].setRotationPoint(-81.5F, -69F, 16F);

		noseModel[54].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 893
		noseModel[54].setRotationPoint(-81.5F, -68F, 16F);

		noseModel[55].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 894
		noseModel[55].setRotationPoint(-81.5F, -68F, 18F);

		noseModel[56].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 895
		noseModel[56].setRotationPoint(-81.5F, -69F, 17F);

		noseModel[57].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 896
		noseModel[57].setRotationPoint(-81.5F, -69F, 18F);

		noseModel[58].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 897
		noseModel[58].setRotationPoint(-80.5F, -69F, 16F);

		noseModel[59].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 898
		noseModel[59].setRotationPoint(-84.5F, -68F, 18F);

		noseModel[60].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 899
		noseModel[60].setRotationPoint(-80.5F, -67F, 16F);

		noseModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 900
		noseModel[61].setRotationPoint(-81.5F, -67F, 16F);

		noseModel[62].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 901
		noseModel[62].setRotationPoint(-81.5F, -67F, 17F);

		noseModel[63].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F); // Box 902
		noseModel[63].setRotationPoint(-81.5F, -67F, 18F);

		noseModel[64].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 903
		noseModel[64].setRotationPoint(-84.5F, -67F, 16F);

		noseModel[65].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 904
		noseModel[65].setRotationPoint(-84.5F, -68F, 16F);
	}

	private void inittailModel_1()
	{
		tailModel[0] = new ModelRendererTurbo(this, 577, 863, textureX, textureY); // Box 27
		tailModel[1] = new ModelRendererTurbo(this, 697, 863, textureX, textureY); // Box 28
		tailModel[2] = new ModelRendererTurbo(this, 817, 863, textureX, textureY); // Box 29
		tailModel[3] = new ModelRendererTurbo(this, 937, 863, textureX, textureY); // Box 30
		tailModel[4] = new ModelRendererTurbo(this, 1057, 863, textureX, textureY); // Box 31
		tailModel[5] = new ModelRendererTurbo(this, 1177, 863, textureX, textureY); // Box 32
		tailModel[6] = new ModelRendererTurbo(this, 1377, 863, textureX, textureY); // Box 34
		tailModel[7] = new ModelRendererTurbo(this, 1, 731, textureX, textureY); // Box 108
		tailModel[8] = new ModelRendererTurbo(this, 57, 731, textureX, textureY); // Box 109
		tailModel[9] = new ModelRendererTurbo(this, 73, 731, textureX, textureY); // Box 110
		tailModel[10] = new ModelRendererTurbo(this, 105, 731, textureX, textureY); // Box 111
		tailModel[11] = new ModelRendererTurbo(this, 1, 789, textureX, textureY); // Box 112
		tailModel[12] = new ModelRendererTurbo(this, 65, 789, textureX, textureY); // Box 113
		tailModel[13] = new ModelRendererTurbo(this, 105, 789, textureX, textureY); // Box 114
		tailModel[14] = new ModelRendererTurbo(this, 201, 789, textureX, textureY); // Box 115
		tailModel[15] = new ModelRendererTurbo(this, 49, 789, textureX, textureY); // Box 116
		tailModel[16] = new ModelRendererTurbo(this, 169, 789, textureX, textureY); // Box 117
		tailModel[17] = new ModelRendererTurbo(this, 257, 789, textureX, textureY); // Box 118
		tailModel[18] = new ModelRendererTurbo(this, 313, 789, textureX, textureY); // Box 119
		tailModel[19] = new ModelRendererTurbo(this, 409, 789, textureX, textureY); // Box 121
		tailModel[20] = new ModelRendererTurbo(this, 577, 887, textureX, textureY); // Box 154
		tailModel[21] = new ModelRendererTurbo(this, 697, 887, textureX, textureY); // Box 155
		tailModel[22] = new ModelRendererTurbo(this, 817, 887, textureX, textureY); // Box 156
		tailModel[23] = new ModelRendererTurbo(this, 937, 887, textureX, textureY); // Box 157
		tailModel[24] = new ModelRendererTurbo(this, 1057, 887, textureX, textureY); // Box 158
		tailModel[25] = new ModelRendererTurbo(this, 1177, 887, textureX, textureY); // Box 159
		tailModel[26] = new ModelRendererTurbo(this, 1377, 887, textureX, textureY); // Box 161
		tailModel[27] = new ModelRendererTurbo(this, 1, 760, textureX, textureY); // Box 234
		tailModel[28] = new ModelRendererTurbo(this, 57, 760, textureX, textureY); // Box 235
		tailModel[29] = new ModelRendererTurbo(this, 73, 760, textureX, textureY); // Box 236
		tailModel[30] = new ModelRendererTurbo(this, 105, 760, textureX, textureY); // Box 237
		tailModel[31] = new ModelRendererTurbo(this, 1, 826, textureX, textureY); // Box 238
		tailModel[32] = new ModelRendererTurbo(this, 65, 826, textureX, textureY); // Box 239
		tailModel[33] = new ModelRendererTurbo(this, 105, 826, textureX, textureY); // Box 240
		tailModel[34] = new ModelRendererTurbo(this, 201, 826, textureX, textureY); // Box 241
		tailModel[35] = new ModelRendererTurbo(this, 49, 826, textureX, textureY); // Box 242
		tailModel[36] = new ModelRendererTurbo(this, 169, 826, textureX, textureY); // Box 243
		tailModel[37] = new ModelRendererTurbo(this, 257, 826, textureX, textureY); // Box 244
		tailModel[38] = new ModelRendererTurbo(this, 313, 826, textureX, textureY); // Box 245
		tailModel[39] = new ModelRendererTurbo(this, 409, 826, textureX, textureY); // Box 247
		tailModel[40] = new ModelRendererTurbo(this, 1, 887, textureX, textureY); // Box 281
		tailModel[41] = new ModelRendererTurbo(this, 1489, 887, textureX, textureY); // Box 282
		tailModel[42] = new ModelRendererTurbo(this, 89, 887, textureX, textureY); // Box 469
		tailModel[43] = new ModelRendererTurbo(this, 1865, 887, textureX, textureY); // Box 470
		tailModel[44] = new ModelRendererTurbo(this, 9, 887, textureX, textureY); // Box 471
		tailModel[45] = new ModelRendererTurbo(this, 105, 887, textureX, textureY); // Box 472
		tailModel[46] = new ModelRendererTurbo(this, 113, 887, textureX, textureY); // Box 473
		tailModel[47] = new ModelRendererTurbo(this, 193, 887, textureX, textureY); // Box 474
		tailModel[48] = new ModelRendererTurbo(this, 201, 887, textureX, textureY); // Box 475
		tailModel[49] = new ModelRendererTurbo(this, 1929, 887, textureX, textureY); // Box 664

		tailModel[0].addShapeBox(0F, 0F, 0F, 49, 6, 10, 0F,0F, 0F, -1F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		tailModel[0].setRotationPoint(51F, -74F, -10F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 49, 8, 10, 0F,0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -8F, 0F, -6F, 0F, 0F, 0F, 0F); // Box 28
		tailModel[1].setRotationPoint(51F, -68F, -10F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 49, 4, 10, 0F,0F, 0F, 0F, 0F, 5.9999F, -7.9999F, 0F, 5.9999F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9999F, 0F, -9.9999F, -7.9999F, 0F, -9.9999F, 0F, 0F, 0F, 0F); // Box 29
		tailModel[2].setRotationPoint(51F, -60F, -10F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 49, 5, 9, 0F,0F, 0F, -1F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		tailModel[3].setRotationPoint(51F, -79F, -9F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 49, 3, 8, 0F,0F, 0F, -2F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		tailModel[4].setRotationPoint(51F, -82F, -8F);

		tailModel[5].addShapeBox(0F, 0F, 0F, 49, 3, 6, 0F,0F, 0F, -3F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		tailModel[5].setRotationPoint(51F, -85F, -6F);

		tailModel[6].addShapeBox(0F, 0F, 0F, 49, 2, 9, 0F,0F, 0F, 0F, 0F, 9.9999F, -6.9999F, 0F, 9.9999F, 0F, 0F, 0F, 0F, 0F, 0F, -3.9999F, 0F, -9.9999F, -8.4999F, 0F, -9.9999F, 0F, 0F, 0F, 0F); // Box 34
		tailModel[6].setRotationPoint(51F, -56F, -9F);

		tailModel[7].addShapeBox(0F, 0F, 0F, 24, 25, 3, 0F,-14F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		tailModel[7].setRotationPoint(76F, -108F, -3F);

		tailModel[8].addShapeBox(0F, 0F, 0F, 4, 25, 3, 0F,-16F, 0F, -2F, 14F, 0F, -1F, 14F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		tailModel[8].setRotationPoint(72F, -108F, -3F);

		tailModel[9].addShapeBox(0F, 0F, 0F, 10, 12, 2, 0F,-8F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		tailModel[9].setRotationPoint(90F, -120F, -2F);

		tailModel[10].addShapeBox(0F, 0F, 0F, 2, 12, 2, 0F,-8F, -1F, -1F, 8F, 0F, -1F, 8F, 0F, 0F, -8F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		tailModel[10].setRotationPoint(88F, -120F, -2F);

		tailModel[11].addShapeBox(0F, 0F, 0F, 14, 3, 16, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		tailModel[11].setRotationPoint(81F, -81F, -19F);

		tailModel[12].addShapeBox(0F, 0F, 0F, 17, 3, 16, 0F,-6F, -1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, -6F, -1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F); // Box 113
		tailModel[12].setRotationPoint(66F, -81F, -19F);

		tailModel[13].addShapeBox(0F, 0F, 0F, 12, 3, 33, 0F,-8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		tailModel[13].setRotationPoint(83F, -81F, -52F);

		tailModel[14].addShapeBox(0F, 0F, 0F, 11, 3, 33, 0F,-12F, -1F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -12F, -1F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 115
		tailModel[14].setRotationPoint(72F, -81F, -52F);

		tailModel[15].addShapeBox(0F, 0F, 0F, 4, 3, 8, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		tailModel[15].setRotationPoint(91F, -81F, -60F);

		tailModel[16].addShapeBox(0F, 0F, 0F, 7, 3, 8, 0F,-3F, -1F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, -1F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 117
		tailModel[16].setRotationPoint(84F, -81F, -60F);

		tailModel[17].addShapeBox(0F, 0F, 0F, 17, 3, 16, 0F,0F, 0F, 0F, 1F, -1F, -10F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, -10F, -12F, 0F, 0F, 0F, 0F, 0F); // Box 118
		tailModel[17].setRotationPoint(95F, -81F, -19F);

		tailModel[18].addShapeBox(0F, 0F, 0F, 18, 3, 10, 0F,0F, 0F, 0F, -1.9999F, -0.9999F, 0F, 0F, -0.9999F, 0F, 0F, 0F, -9.9999F, 0F, 0F, 0F, -1.9999F, -0.9999F, 0F, 0F, -0.9999F, 0F, 0F, 0F, -9.9999F); // Box 119
		tailModel[18].setRotationPoint(95F, -81F, -19F);

		tailModel[19].addShapeBox(0F, 0F, 0F, 11, 3, 8, 0F,0F, -1F, 0F, -4F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -4F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 121
		tailModel[19].setRotationPoint(95F, -81F, -60F);

		tailModel[20].addShapeBox(0F, 0F, 0F, 49, 6, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F); // Box 154
		tailModel[20].setRotationPoint(51F, -74F, 0F);

		tailModel[21].addShapeBox(0F, 0F, 0F, 49, 8, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, -8F, 0F, 0F, 0F); // Box 155
		tailModel[21].setRotationPoint(51F, -68F, 0F);

		tailModel[22].addShapeBox(0F, 0F, 0F, 49, 4, 10, 0F,0F, 0F, 0F, 0F, 5.9999F, 0F, 0F, 5.9999F, -7.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9.9999F, 0F, 0F, -9.9999F, -7.9999F, 0F, 0F, -0.9999F); // Box 156
		tailModel[22].setRotationPoint(51F, -60F, 0F);

		tailModel[23].addShapeBox(0F, 0F, 0F, 49, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 157
		tailModel[23].setRotationPoint(51F, -79F, 0F);

		tailModel[24].addShapeBox(0F, 0F, 0F, 49, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 158
		tailModel[24].setRotationPoint(51F, -82F, 0F);

		tailModel[25].addShapeBox(0F, 0F, 0F, 49, 3, 6, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 159
		tailModel[25].setRotationPoint(51F, -85F, 0F);

		tailModel[26].addShapeBox(0F, 0F, 0F, 49, 2, 9, 0F,0F, 0F, 0F, 0F, 9.9999F, 0F, 0F, 9.9999F, -6.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9.9999F, 0F, 0F, -9.9999F, -8.4999F, 0F, 0F, -3.9999F); // Box 161
		tailModel[26].setRotationPoint(51F, -56F, 0F);

		tailModel[27].addShapeBox(0F, 0F, 0F, 24, 25, 3, 0F,-14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -14F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
		tailModel[27].setRotationPoint(76F, -108F, 0F);

		tailModel[28].addShapeBox(0F, 0F, 0F, 4, 25, 3, 0F,-16F, 0F, 0F, 14F, 0F, 0F, 14F, 0F, -1F, -16F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 235
		tailModel[28].setRotationPoint(72F, -108F, 0F);

		tailModel[29].addShapeBox(0F, 0F, 0F, 10, 12, 2, 0F,-8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -8F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 236
		tailModel[29].setRotationPoint(90F, -120F, 0F);

		tailModel[30].addShapeBox(0F, 0F, 0F, 2, 12, 2, 0F,-8F, -1F, 0F, 8F, 0F, 0F, 8F, 0F, -1F, -8F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 237
		tailModel[30].setRotationPoint(88F, -120F, 0F);

		tailModel[31].addShapeBox(0F, 0F, 0F, 14, 3, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 238
		tailModel[31].setRotationPoint(81F, -81F, 3F);

		tailModel[32].addShapeBox(0F, 0F, 0F, 17, 3, 16, 0F,0F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -6F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -6F, -1F, 0F); // Box 239
		tailModel[32].setRotationPoint(66F, -81F, 3F);

		tailModel[33].addShapeBox(0F, 0F, 0F, 12, 3, 33, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F); // Box 240
		tailModel[33].setRotationPoint(83F, -81F, 19F);

		tailModel[34].addShapeBox(0F, 0F, 0F, 11, 3, 33, 0F,0F, -1F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, -12F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, -12F, -1F, 0F); // Box 241
		tailModel[34].setRotationPoint(72F, -81F, 19F);

		tailModel[35].addShapeBox(0F, 0F, 0F, 4, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 242
		tailModel[35].setRotationPoint(91F, -81F, 52F);

		tailModel[36].addShapeBox(0F, 0F, 0F, 7, 3, 8, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, -1F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, -1F, -3F); // Box 243
		tailModel[36].setRotationPoint(84F, -81F, 52F);

		tailModel[37].addShapeBox(0F, 0F, 0F, 17, 3, 16, 0F,0F, 0F, 0F, -12F, 0F, 0F, 1F, -1F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 1F, -1F, -10F, 0F, 0F, 0F); // Box 244
		tailModel[37].setRotationPoint(95F, -81F, 3F);

		tailModel[38].addShapeBox(0F, 0F, 0F, 18, 3, 10, 0F,0F, 0F, -9.9999F, 0F, -0.9999F, 0F, -1.9999F, -0.9999F, 0F, 0F, 0F, 0F, 0F, 0F, -9.9999F, 0F, -0.9999F, 0F, -1.9999F, -0.9999F, 0F, 0F, 0F, 0F); // Box 245
		tailModel[38].setRotationPoint(95F, -81F, 9F);

		tailModel[39].addShapeBox(0F, 0F, 0F, 11, 3, 8, 0F,0F, 0F, 0F, 0F, -1F, 0F, -4F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -4F, -1F, -2F, 0F, -1F, 0F); // Box 247
		tailModel[39].setRotationPoint(95F, -81F, 52F);

		tailModel[40].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		tailModel[40].setRotationPoint(99F, -122F, -0.5F);

		tailModel[41].addShapeBox(0F, 0F, 0F, 186, 1, 1, 0F,0F, -15.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -15.25F, -0.25F, 0F, 14.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 14.75F, -0.25F); // Box 282
		tailModel[41].setRotationPoint(-87F, -122F, -0.5F);

		tailModel[42].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 469
		tailModel[42].setRotationPoint(53F, -56F, -1F);

		tailModel[43].addShapeBox(0F, 0F, -0.5F, 30, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 470
		tailModel[43].setRotationPoint(55F, -55F, 0F);
		tailModel[43].rotateAngleZ = 0.15707963F;

		tailModel[44].addShapeBox(30F, 0F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 471
		tailModel[44].setRotationPoint(55F, -55F, 0F);
		tailModel[44].rotateAngleZ = 0.15707963F;

		tailModel[45].addShapeBox(31F, -1F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 472
		tailModel[45].setRotationPoint(55F, -55F, 0F);
		tailModel[45].rotateAngleZ = 0.15707963F;

		tailModel[46].addShapeBox(32F, 0F, -0.5F, 1, 1, 1, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 473
		tailModel[46].setRotationPoint(55F, -55F, 0F);
		tailModel[46].rotateAngleZ = 0.15707963F;

		tailModel[47].addShapeBox(32F, 0F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 474
		tailModel[47].setRotationPoint(55F, -55F, 0F);
		tailModel[47].rotateAngleZ = 0.15707963F;

		tailModel[48].addShapeBox(31F, 1F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 475
		tailModel[48].setRotationPoint(55F, -55F, 0F);
		tailModel[48].rotateAngleZ = 0.15707963F;

		tailModel[49].addShapeBox(0F, 0F, 0F, 1, 23, 1, 0F,2.75F, 0F, -0.25F, -3.25F, 0F, -0.25F, -3.25F, 0F, -0.25F, 2.75F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 664
		tailModel[49].setRotationPoint(-6F, -113F, -0.5F);
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 1, 597, textureX, textureY); // Box 38
		leftWingModel[1] = new ModelRendererTurbo(this, 105, 597, textureX, textureY); // Box 39
		leftWingModel[2] = new ModelRendererTurbo(this, 177, 597, textureX, textureY); // Box 40
		leftWingModel[3] = new ModelRendererTurbo(this, 225, 597, textureX, textureY); // Box 42
		leftWingModel[4] = new ModelRendererTurbo(this, 345, 597, textureX, textureY); // Box 43
		leftWingModel[5] = new ModelRendererTurbo(this, 425, 597, textureX, textureY); // Box 44
		leftWingModel[6] = new ModelRendererTurbo(this, 537, 597, textureX, textureY); // Box 45
		leftWingModel[7] = new ModelRendererTurbo(this, 625, 597, textureX, textureY); // Box 46
		leftWingModel[8] = new ModelRendererTurbo(this, 633, 597, textureX, textureY); // Box 54
		leftWingModel[9] = new ModelRendererTurbo(this, 721, 597, textureX, textureY); // Box 55
		leftWingModel[10] = new ModelRendererTurbo(this, 769, 597, textureX, textureY); // Box 56
		leftWingModel[11] = new ModelRendererTurbo(this, 833, 597, textureX, textureY); // Box 57
		leftWingModel[12] = new ModelRendererTurbo(this, 993, 597, textureX, textureY); // Box 59
		leftWingModel[13] = new ModelRendererTurbo(this, 1049, 597, textureX, textureY); // Box 60
		leftWingModel[14] = new ModelRendererTurbo(this, 873, 597, textureX, textureY); // Box 61
		leftWingModel[15] = new ModelRendererTurbo(this, 1129, 597, textureX, textureY); // Box 340
		leftWingModel[16] = new ModelRendererTurbo(this, 1217, 597, textureX, textureY); // Box 0
		leftWingModel[17] = new ModelRendererTurbo(this, 1273, 597, textureX, textureY); // Box 1
		leftWingModel[18] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Core_001
		leftWingModel[19] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Core_001
		leftWingModel[20] = new ModelRendererTurbo(this, 38, 523, textureX, textureY); // Core_001
		leftWingModel[21] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Core_001
		leftWingModel[22] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Core_001
		leftWingModel[23] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Core_001
		leftWingModel[24] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Core_001
		leftWingModel[25] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Core_001
		leftWingModel[26] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Core_001
		leftWingModel[27] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Core_001
		leftWingModel[28] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Core_001
		leftWingModel[29] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Core_001
		leftWingModel[30] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Core_001
		leftWingModel[31] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Core_001
		leftWingModel[32] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Core_001
		leftWingModel[33] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 16
		leftWingModel[34] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 17
		leftWingModel[35] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 18
		leftWingModel[36] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 19
		leftWingModel[37] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 22
		leftWingModel[38] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 24
		leftWingModel[39] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 25
		leftWingModel[40] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 400
		leftWingModel[41] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 401
		leftWingModel[42] = new ModelRendererTurbo(this, 38, 523, textureX, textureY); // Box 402
		leftWingModel[43] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 403
		leftWingModel[44] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 404
		leftWingModel[45] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 405
		leftWingModel[46] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 406
		leftWingModel[47] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 407
		leftWingModel[48] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 408
		leftWingModel[49] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 409
		leftWingModel[50] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 410
		leftWingModel[51] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 411
		leftWingModel[52] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 412
		leftWingModel[53] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 413
		leftWingModel[54] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 414
		leftWingModel[55] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 415
		leftWingModel[56] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 416
		leftWingModel[57] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 417
		leftWingModel[58] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 418
		leftWingModel[59] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 419
		leftWingModel[60] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 420
		leftWingModel[61] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 421
		leftWingModel[62] = new ModelRendererTurbo(this, 1329, 597, textureX, textureY); // Box 422
		leftWingModel[63] = new ModelRendererTurbo(this, 1385, 597, textureX, textureY); // Box 423
		leftWingModel[64] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 424
		leftWingModel[65] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 425
		leftWingModel[66] = new ModelRendererTurbo(this, 38, 523, textureX, textureY); // Box 426
		leftWingModel[67] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 427
		leftWingModel[68] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 428
		leftWingModel[69] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 429
		leftWingModel[70] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 430
		leftWingModel[71] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 431
		leftWingModel[72] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 432
		leftWingModel[73] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 433
		leftWingModel[74] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 434
		leftWingModel[75] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 435
		leftWingModel[76] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 436
		leftWingModel[77] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 437
		leftWingModel[78] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 438
		leftWingModel[79] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 439
		leftWingModel[80] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 440
		leftWingModel[81] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 441
		leftWingModel[82] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 442
		leftWingModel[83] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 443
		leftWingModel[84] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 444
		leftWingModel[85] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 445
		leftWingModel[86] = new ModelRendererTurbo(this, 1441, 597, textureX, textureY); // Box 446
		leftWingModel[87] = new ModelRendererTurbo(this, 1497, 597, textureX, textureY); // Box 447
		leftWingModel[88] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 448
		leftWingModel[89] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 449
		leftWingModel[90] = new ModelRendererTurbo(this, 38, 523, textureX, textureY); // Box 450
		leftWingModel[91] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 451
		leftWingModel[92] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 452
		leftWingModel[93] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 453
		leftWingModel[94] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 454
		leftWingModel[95] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 455
		leftWingModel[96] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 456
		leftWingModel[97] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 457
		leftWingModel[98] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 458
		leftWingModel[99] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 459
		leftWingModel[100] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 460
		leftWingModel[101] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 461
		leftWingModel[102] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 462
		leftWingModel[103] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 463
		leftWingModel[104] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 464
		leftWingModel[105] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 465
		leftWingModel[106] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 466
		leftWingModel[107] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 467
		leftWingModel[108] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 468
		leftWingModel[109] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 469
		leftWingModel[110] = new ModelRendererTurbo(this, 1553, 597, textureX, textureY); // Box 470
		leftWingModel[111] = new ModelRendererTurbo(this, 1609, 597, textureX, textureY); // Box 471
		leftWingModel[112] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 472
		leftWingModel[113] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 473
		leftWingModel[114] = new ModelRendererTurbo(this, 38, 523, textureX, textureY); // Box 474
		leftWingModel[115] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 475
		leftWingModel[116] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 476
		leftWingModel[117] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 477
		leftWingModel[118] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 478
		leftWingModel[119] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 479
		leftWingModel[120] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 480
		leftWingModel[121] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 481
		leftWingModel[122] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 482
		leftWingModel[123] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 483
		leftWingModel[124] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 484
		leftWingModel[125] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 485
		leftWingModel[126] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 486
		leftWingModel[127] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 487
		leftWingModel[128] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 488
		leftWingModel[129] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 489
		leftWingModel[130] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 490
		leftWingModel[131] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 491
		leftWingModel[132] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 492
		leftWingModel[133] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 493
		leftWingModel[134] = new ModelRendererTurbo(this, 1665, 597, textureX, textureY); // Box 494
		leftWingModel[135] = new ModelRendererTurbo(this, 1721, 597, textureX, textureY); // Box 495
		leftWingModel[136] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 496
		leftWingModel[137] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 497
		leftWingModel[138] = new ModelRendererTurbo(this, 38, 523, textureX, textureY); // Box 498
		leftWingModel[139] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 499
		leftWingModel[140] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 500
		leftWingModel[141] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 501
		leftWingModel[142] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 502
		leftWingModel[143] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 503
		leftWingModel[144] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 504
		leftWingModel[145] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 505
		leftWingModel[146] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 506
		leftWingModel[147] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 507
		leftWingModel[148] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 508
		leftWingModel[149] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 509
		leftWingModel[150] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 510
		leftWingModel[151] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 511
		leftWingModel[152] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 512
		leftWingModel[153] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 513
		leftWingModel[154] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 514
		leftWingModel[155] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 515
		leftWingModel[156] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 516
		leftWingModel[157] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 517
		leftWingModel[158] = new ModelRendererTurbo(this, 1777, 597, textureX, textureY); // Box 518
		leftWingModel[159] = new ModelRendererTurbo(this, 1833, 597, textureX, textureY); // Box 519

		leftWingModel[0].addShapeBox(0F, 3F, 0F, 33, 13, 17, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 2F, -1F); // Box 38
		leftWingModel[0].setRotationPoint(-45F, -64F, -32F);

		leftWingModel[1].addShapeBox(0F, 3F, 0F, 16, 13, 17, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 2F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, -2F, 5F); // Box 39
		leftWingModel[1].setRotationPoint(-61F, -64F, -32F);

		leftWingModel[2].addShapeBox(0F, 3F, 0F, 30, 13, 17, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 1F, 0F, -1F, 2F, 0F, -4F, 0F, 0F, -8F, 0F, 0F, -2F, 8F, 0F, -2F, -1F); // Box 40
		leftWingModel[2].setRotationPoint(-12F, -62F, -32F);

		leftWingModel[3].addShapeBox(0F, 3F, 0F, 33, 17, 49, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -6F, 0F, 0F, -4F, 0F, 0F, -7F, 0F, 0F, -8F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 42
		leftWingModel[3].setRotationPoint(-45F, -68F, -81F);

		leftWingModel[4].addShapeBox(0F, 3F, 0F, 33, 12, 27, 0F,0F, 0F, 0F, -2F, -3F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, -2F, -5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 43
		leftWingModel[4].setRotationPoint(-45F, -70F, -108F);

		leftWingModel[5].addShapeBox(0F, 3F, 0F, 31, 11, 43, 0F,0F, 0F, 0F, -6F, -1F, 0F, 0F, -6F, 0F, 0F, -3F, 0F, 0F, -6F, 0F, -6F, -7F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 44
		leftWingModel[5].setRotationPoint(-45F, -73F, -151F);

		leftWingModel[6].addShapeBox(0F, 3F, 0F, 25, 5, 16, 0F,-5F, -1F, 2F, -10F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -5F, -3F, 2F, -10F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 45
		leftWingModel[6].setRotationPoint(-45F, -73F, -167F);

		leftWingModel[7].addShapeBox(0F, 3F, 0F, 10, 3, 16, 0F,0F, 0F, 0F, 0F, 0F, -3.9999F, 0F, 0F, 0F, -9.9999F, 0F, 0F, 0F, -1.9999F, 0F, 0F, -1.9999F, -3.9999F, 0F, 0F, 0F, -9.9999F, 0F, 0F); // Box 46
		leftWingModel[7].setRotationPoint(-30F, -72F, -167F);

		leftWingModel[8].addShapeBox(0F, 3F, 0F, 16, 17, 49, 0F,-4F, -3F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -7F, 0F, -4F, -9F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 54
		leftWingModel[8].setRotationPoint(-61F, -68F, -81F);

		leftWingModel[9].addShapeBox(0F, 3F, 0F, 12, 12, 27, 0F,-2F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -5F, 0F, -2F, -6F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 55
		leftWingModel[9].setRotationPoint(-57F, -70F, -108F);

		leftWingModel[10].addShapeBox(0F, 3F, 0F, 10, 11, 43, 0F,-3F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, -3F, -8F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 56
		leftWingModel[10].setRotationPoint(-55F, -73F, -151F);

		leftWingModel[11].addShapeBox(0F, 3F, 0F, 7, 5, 18, 0F,-5F, -1F, -5F, 5F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -5F, -3F, -5F, 5F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 57
		leftWingModel[11].setRotationPoint(-52F, -73F, -169F);

		leftWingModel[12].addShapeBox(0F, 3F, 0F, 19, 8, 27, 0F,0F, 0F, 0F, -7F, -2F, 0F, 0F, -5F, 0F, -2F, -2F, 0F, 0F, -4F, 0F, -7F, -5F, 0F, 0F, -2F, 0F, -2F, 0F, 0F); // Box 59
		leftWingModel[12].setRotationPoint(-14F, -67F, -108F);

		leftWingModel[13].addShapeBox(0F, 3F, 0F, 18, 8, 43, 0F,0F, 1F, 0F, -12F, 0F, 0F, 0F, -6F, 0F, -6F, -4F, 0F, 0F, -6F, 0F, -12F, -7F, 0F, 0F, -1F, 0F, -6F, 0F, 0F); // Box 60
		leftWingModel[13].setRotationPoint(-20F, -71F, -151F);

		leftWingModel[14].addShapeBox(0F, 3F, 0F, 6, 3, 12, 0F,0F, 0F, 0F, 0F, -0.9999F, -11.9999F, 0F, -0.9999F, 0F, 0F, 0F, 0F, 0F, -1.9999F, 0F, 0F, -0.9999F, -11.9999F, 0F, -0.9999F, 0F, 0F, 0F, 0F); // Box 61
		leftWingModel[14].setRotationPoint(-20F, -72F, -163F);

		leftWingModel[15].addShapeBox(0F, 3F, 0F, 33, 13, 17, 0F,0F, -3.9999F, 0F, -32.9999F, -3.9999F, 0F, 0F, 0F, 5.9999F, 0F, 0F, 0.9999F, 0F, -7.9999F, 0F, -32.9999F, -7.9999F, 0F, 0F, -9.9999F, 8.9999F, 0F, -1.9999F, 7.9999F); // Box 340
		leftWingModel[15].setRotationPoint(18F, -62F, -32F);

		leftWingModel[16].addShapeBox(0F, 0F, 0F, 26, 7, 1, 0F,-5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		leftWingModel[16].setRotationPoint(-46F, -55F, -52F);

		leftWingModel[17].addShapeBox(0F, 0F, 0F, 26, 7, 1, 0F,-3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F); // Box 1
		leftWingModel[17].setRotationPoint(-46F, -55F, -51F);

		leftWingModel[18].addShapeBox(0F, 0F, 0F, 15, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core_001
		leftWingModel[18].setRotationPoint(-43F, -47.5F, -53.5F);

		leftWingModel[19].addShapeBox(0F, 0F, 0F, 5, 3, 5, 0F,0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F); // Core_001
		leftWingModel[19].setRotationPoint(-48F, -46.5F, -53.5F);

		leftWingModel[20].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Core_001
		leftWingModel[20].setRotationPoint(-48.5F, -45.5F, -51.5F);

		leftWingModel[21].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Core_001
		leftWingModel[21].setRotationPoint(-22F, -48F, -51.5F);

		leftWingModel[22].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F); // Core_001
		leftWingModel[22].setRotationPoint(-19F, -48F, -51.5F);

		leftWingModel[23].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -2F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -2F, -0.4F, 0F); // Core_001
		leftWingModel[23].setRotationPoint(-22F, -45.5F, -51F);

		leftWingModel[24].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Core_001
		leftWingModel[24].setRotationPoint(-19F, -45.5F, -50F);

		leftWingModel[25].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.3F, -1.9F, 0F, -0.3F, -1.9F, 0F, -0.1F, -1.5F, 0F, -0.1F, -1.5F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F); // Core_001
		leftWingModel[25].setRotationPoint(-18F, -47F, -51F);

		leftWingModel[26].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -1.5F, 0F, -0.1F, -1.5F, 0F, -0.3F, -1.9F, 0F, -0.3F, -1.9F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F); // Core_001
		leftWingModel[26].setRotationPoint(-18F, -45F, -53F);

		leftWingModel[27].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.1F, -1.5F, 0F, -0.1F, -1.5F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.3F, -1.9F, 0F, -0.3F, -1.9F); // Core_001
		leftWingModel[27].setRotationPoint(-18F, -45F, -51F);

		leftWingModel[28].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Core_001
		leftWingModel[28].setRotationPoint(-19F, -44F, -51.5F);

		leftWingModel[29].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -2F, 0F, -0.4F); // Core_001
		leftWingModel[29].setRotationPoint(-22F, -45F, -51.5F);

		leftWingModel[30].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-2F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -2F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Core_001
		leftWingModel[30].setRotationPoint(-22F, -45.5F, -54F);

		leftWingModel[31].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F); // Core_001
		leftWingModel[31].setRotationPoint(-19F, -45.5F, -54F);

		leftWingModel[32].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.3F, -1.9F, 0F, -0.3F, -1.9F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -1.5F, 0F, -0.1F, -1.5F); // Core_001
		leftWingModel[32].setRotationPoint(-18F, -47F, -53F);

		leftWingModel[33].addBox(0F, 0F, 0F, 15, 3, 5, 0F); // Box 16
		leftWingModel[33].setRotationPoint(-43F, -46.5F, -53.5F);

		leftWingModel[34].addShapeBox(0F, 0F, 0F, 15, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 17
		leftWingModel[34].setRotationPoint(-43F, -43.5F, -53.5F);

		leftWingModel[35].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, -1.75F, -2.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1.75F, -2.25F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F); // Box 18
		leftWingModel[35].setRotationPoint(-48F, -47.5F, -53.5F);

		leftWingModel[36].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, -1.75F, -2.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1.75F, -2.25F); // Box 19
		leftWingModel[36].setRotationPoint(-48F, -43.5F, -53.5F);

		leftWingModel[37].addShapeBox(0F, 0F, 0F, 10, 3, 5, 0F,0F, 0F, 0F, 0F, -1.25F, -2F, 0F, -1.25F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, -2F, 0F, -1.25F, -2F, 0F, 0F, 0F); // Box 22
		leftWingModel[37].setRotationPoint(-28F, -46.5F, -53.5F);

		leftWingModel[38].addShapeBox(0F, 0F, 0F, 10, 1, 5, 0F,0F, 0F, -1F, 0F, -2F, -2.25F, 0F, -2F, -2.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1.25F, -2F, 0F, 1.25F, -2F, 0F, 0F, 0F); // Box 24
		leftWingModel[38].setRotationPoint(-28F, -47.5F, -53.5F);

		leftWingModel[39].addShapeBox(0F, 0F, 0F, 10, 1, 5, 0F,0F, 0F, 0F, 0F, 1.25F, -2F, 0F, 1.25F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -2.25F, 0F, -2F, -2.25F, 0F, 0F, -1F); // Box 25
		leftWingModel[39].setRotationPoint(-28F, -43.5F, -53.5F);

		leftWingModel[40].addShapeBox(0F, 0F, 0F, 15, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 400
		leftWingModel[40].setRotationPoint(-43F, -48F, -59.5F);

		leftWingModel[41].addShapeBox(0F, 0F, 0F, 5, 3, 5, 0F,0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F); // Box 401
		leftWingModel[41].setRotationPoint(-48F, -47F, -59.5F);

		leftWingModel[42].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 402
		leftWingModel[42].setRotationPoint(-48.5F, -46F, -57.5F);

		leftWingModel[43].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 403
		leftWingModel[43].setRotationPoint(-22F, -48.5F, -57.5F);

		leftWingModel[44].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F); // Box 404
		leftWingModel[44].setRotationPoint(-19F, -48.5F, -57.5F);

		leftWingModel[45].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -2F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -2F, -0.4F, 0F); // Box 405
		leftWingModel[45].setRotationPoint(-22F, -46F, -57F);

		leftWingModel[46].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 406
		leftWingModel[46].setRotationPoint(-19F, -46F, -56F);

		leftWingModel[47].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.3F, -1.9F, 0F, -0.3F, -1.9F, 0F, -0.1F, -1.5F, 0F, -0.1F, -1.5F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F); // Box 407
		leftWingModel[47].setRotationPoint(-18F, -47.5F, -57F);

		leftWingModel[48].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -1.5F, 0F, -0.1F, -1.5F, 0F, -0.3F, -1.9F, 0F, -0.3F, -1.9F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F); // Box 408
		leftWingModel[48].setRotationPoint(-18F, -45.5F, -59F);

		leftWingModel[49].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.1F, -1.5F, 0F, -0.1F, -1.5F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.3F, -1.9F, 0F, -0.3F, -1.9F); // Box 409
		leftWingModel[49].setRotationPoint(-18F, -45.5F, -57F);

		leftWingModel[50].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 410
		leftWingModel[50].setRotationPoint(-19F, -44.5F, -57.5F);

		leftWingModel[51].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -2F, 0F, -0.4F); // Box 411
		leftWingModel[51].setRotationPoint(-22F, -45.5F, -57.5F);

		leftWingModel[52].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-2F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -2F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 412
		leftWingModel[52].setRotationPoint(-22F, -46F, -60F);

		leftWingModel[53].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F); // Box 413
		leftWingModel[53].setRotationPoint(-19F, -46F, -60F);

		leftWingModel[54].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.3F, -1.9F, 0F, -0.3F, -1.9F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -1.5F, 0F, -0.1F, -1.5F); // Box 414
		leftWingModel[54].setRotationPoint(-18F, -47.5F, -59F);

		leftWingModel[55].addBox(0F, 0F, 0F, 15, 3, 5, 0F); // Box 415
		leftWingModel[55].setRotationPoint(-43F, -47F, -59.5F);

		leftWingModel[56].addShapeBox(0F, 0F, 0F, 15, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 416
		leftWingModel[56].setRotationPoint(-43F, -44F, -59.5F);

		leftWingModel[57].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, -1.75F, -2.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1.75F, -2.25F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F); // Box 417
		leftWingModel[57].setRotationPoint(-48F, -48F, -59.5F);

		leftWingModel[58].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, -1.75F, -2.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1.75F, -2.25F); // Box 418
		leftWingModel[58].setRotationPoint(-48F, -44F, -59.5F);

		leftWingModel[59].addShapeBox(0F, 0F, 0F, 10, 3, 5, 0F,0F, 0F, 0F, 0F, -1.25F, -2F, 0F, -1.25F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, -2F, 0F, -1.25F, -2F, 0F, 0F, 0F); // Box 419
		leftWingModel[59].setRotationPoint(-28F, -47F, -59.5F);

		leftWingModel[60].addShapeBox(0F, 0F, 0F, 10, 1, 5, 0F,0F, 0F, -1F, 0F, -2F, -2.25F, 0F, -2F, -2.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1.25F, -2F, 0F, 1.25F, -2F, 0F, 0F, 0F); // Box 420
		leftWingModel[60].setRotationPoint(-28F, -48F, -59.5F);

		leftWingModel[61].addShapeBox(0F, 0F, 0F, 10, 1, 5, 0F,0F, 0F, 0F, 0F, 1.25F, -2F, 0F, 1.25F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -2.25F, 0F, -2F, -2.25F, 0F, 0F, -1F); // Box 421
		leftWingModel[61].setRotationPoint(-28F, -44F, -59.5F);

		leftWingModel[62].addShapeBox(0F, 0F, 0F, 26, 7, 1, 0F,-3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F); // Box 422
		leftWingModel[62].setRotationPoint(-46F, -55.5F, -57F);

		leftWingModel[63].addShapeBox(0F, 0F, 0F, 26, 7, 1, 0F,-5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 423
		leftWingModel[63].setRotationPoint(-46F, -55.5F, -58F);

		leftWingModel[64].addShapeBox(0F, 0F, 0F, 15, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 424
		leftWingModel[64].setRotationPoint(-43F, -48.5F, -65.5F);

		leftWingModel[65].addShapeBox(0F, 0F, 0F, 5, 3, 5, 0F,0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F); // Box 425
		leftWingModel[65].setRotationPoint(-48F, -47.5F, -65.5F);

		leftWingModel[66].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 426
		leftWingModel[66].setRotationPoint(-48.5F, -46.5F, -63.5F);

		leftWingModel[67].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 427
		leftWingModel[67].setRotationPoint(-22F, -49F, -63.5F);

		leftWingModel[68].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F); // Box 428
		leftWingModel[68].setRotationPoint(-19F, -49F, -63.5F);

		leftWingModel[69].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -2F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -2F, -0.4F, 0F); // Box 429
		leftWingModel[69].setRotationPoint(-22F, -46.5F, -63F);

		leftWingModel[70].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 430
		leftWingModel[70].setRotationPoint(-19F, -46.5F, -62F);

		leftWingModel[71].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.3F, -1.9F, 0F, -0.3F, -1.9F, 0F, -0.1F, -1.5F, 0F, -0.1F, -1.5F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F); // Box 431
		leftWingModel[71].setRotationPoint(-18F, -48F, -63F);

		leftWingModel[72].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -1.5F, 0F, -0.1F, -1.5F, 0F, -0.3F, -1.9F, 0F, -0.3F, -1.9F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F); // Box 432
		leftWingModel[72].setRotationPoint(-18F, -46F, -65F);

		leftWingModel[73].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.1F, -1.5F, 0F, -0.1F, -1.5F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.3F, -1.9F, 0F, -0.3F, -1.9F); // Box 433
		leftWingModel[73].setRotationPoint(-18F, -46F, -63F);

		leftWingModel[74].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 434
		leftWingModel[74].setRotationPoint(-19F, -45F, -63.5F);

		leftWingModel[75].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -2F, 0F, -0.4F); // Box 435
		leftWingModel[75].setRotationPoint(-22F, -46F, -63.5F);

		leftWingModel[76].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-2F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -2F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 436
		leftWingModel[76].setRotationPoint(-22F, -46.5F, -66F);

		leftWingModel[77].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F); // Box 437
		leftWingModel[77].setRotationPoint(-19F, -46.5F, -66F);

		leftWingModel[78].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.3F, -1.9F, 0F, -0.3F, -1.9F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -1.5F, 0F, -0.1F, -1.5F); // Box 438
		leftWingModel[78].setRotationPoint(-18F, -48F, -65F);

		leftWingModel[79].addBox(0F, 0F, 0F, 15, 3, 5, 0F); // Box 439
		leftWingModel[79].setRotationPoint(-43F, -47.5F, -65.5F);

		leftWingModel[80].addShapeBox(0F, 0F, 0F, 15, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 440
		leftWingModel[80].setRotationPoint(-43F, -44.5F, -65.5F);

		leftWingModel[81].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, -1.75F, -2.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1.75F, -2.25F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F); // Box 441
		leftWingModel[81].setRotationPoint(-48F, -48.5F, -65.5F);

		leftWingModel[82].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, -1.75F, -2.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1.75F, -2.25F); // Box 442
		leftWingModel[82].setRotationPoint(-48F, -44.5F, -65.5F);

		leftWingModel[83].addShapeBox(0F, 0F, 0F, 10, 3, 5, 0F,0F, 0F, 0F, 0F, -1.25F, -2F, 0F, -1.25F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, -2F, 0F, -1.25F, -2F, 0F, 0F, 0F); // Box 443
		leftWingModel[83].setRotationPoint(-28F, -47.5F, -65.5F);

		leftWingModel[84].addShapeBox(0F, 0F, 0F, 10, 1, 5, 0F,0F, 0F, -1F, 0F, -2F, -2.25F, 0F, -2F, -2.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1.25F, -2F, 0F, 1.25F, -2F, 0F, 0F, 0F); // Box 444
		leftWingModel[84].setRotationPoint(-28F, -48.5F, -65.5F);

		leftWingModel[85].addShapeBox(0F, 0F, 0F, 10, 1, 5, 0F,0F, 0F, 0F, 0F, 1.25F, -2F, 0F, 1.25F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -2.25F, 0F, -2F, -2.25F, 0F, 0F, -1F); // Box 445
		leftWingModel[85].setRotationPoint(-28F, -44.5F, -65.5F);

		leftWingModel[86].addShapeBox(0F, 0F, 0F, 26, 7, 1, 0F,-3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F); // Box 446
		leftWingModel[86].setRotationPoint(-46F, -56F, -63F);

		leftWingModel[87].addShapeBox(0F, 0F, 0F, 26, 7, 1, 0F,-5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 447
		leftWingModel[87].setRotationPoint(-46F, -56F, -64F);

		leftWingModel[88].addShapeBox(0F, 0F, 0F, 15, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 448
		leftWingModel[88].setRotationPoint(-43F, -49F, -71.5F);

		leftWingModel[89].addShapeBox(0F, 0F, 0F, 5, 3, 5, 0F,0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F); // Box 449
		leftWingModel[89].setRotationPoint(-48F, -48F, -71.5F);

		leftWingModel[90].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 450
		leftWingModel[90].setRotationPoint(-48.5F, -47F, -69.5F);

		leftWingModel[91].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 451
		leftWingModel[91].setRotationPoint(-22F, -49.5F, -69.5F);

		leftWingModel[92].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F); // Box 452
		leftWingModel[92].setRotationPoint(-19F, -49.5F, -69.5F);

		leftWingModel[93].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -2F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -2F, -0.4F, 0F); // Box 453
		leftWingModel[93].setRotationPoint(-22F, -47F, -69F);

		leftWingModel[94].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 454
		leftWingModel[94].setRotationPoint(-19F, -47F, -68F);

		leftWingModel[95].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.3F, -1.9F, 0F, -0.3F, -1.9F, 0F, -0.1F, -1.5F, 0F, -0.1F, -1.5F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F); // Box 455
		leftWingModel[95].setRotationPoint(-18F, -48.5F, -69F);

		leftWingModel[96].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -1.5F, 0F, -0.1F, -1.5F, 0F, -0.3F, -1.9F, 0F, -0.3F, -1.9F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F); // Box 456
		leftWingModel[96].setRotationPoint(-18F, -46.5F, -71F);

		leftWingModel[97].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.1F, -1.5F, 0F, -0.1F, -1.5F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.3F, -1.9F, 0F, -0.3F, -1.9F); // Box 457
		leftWingModel[97].setRotationPoint(-18F, -46.5F, -69F);

		leftWingModel[98].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 458
		leftWingModel[98].setRotationPoint(-19F, -45.5F, -69.5F);

		leftWingModel[99].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -2F, 0F, -0.4F); // Box 459
		leftWingModel[99].setRotationPoint(-22F, -46.5F, -69.5F);

		leftWingModel[100].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-2F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -2F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 460
		leftWingModel[100].setRotationPoint(-22F, -47F, -72F);

		leftWingModel[101].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F); // Box 461
		leftWingModel[101].setRotationPoint(-19F, -47F, -72F);

		leftWingModel[102].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.3F, -1.9F, 0F, -0.3F, -1.9F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -1.5F, 0F, -0.1F, -1.5F); // Box 462
		leftWingModel[102].setRotationPoint(-18F, -48.5F, -71F);

		leftWingModel[103].addBox(0F, 0F, 0F, 15, 3, 5, 0F); // Box 463
		leftWingModel[103].setRotationPoint(-43F, -48F, -71.5F);

		leftWingModel[104].addShapeBox(0F, 0F, 0F, 15, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 464
		leftWingModel[104].setRotationPoint(-43F, -45F, -71.5F);

		leftWingModel[105].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, -1.75F, -2.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1.75F, -2.25F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F); // Box 465
		leftWingModel[105].setRotationPoint(-48F, -49F, -71.5F);

		leftWingModel[106].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, -1.75F, -2.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1.75F, -2.25F); // Box 466
		leftWingModel[106].setRotationPoint(-48F, -45F, -71.5F);

		leftWingModel[107].addShapeBox(0F, 0F, 0F, 10, 3, 5, 0F,0F, 0F, 0F, 0F, -1.25F, -2F, 0F, -1.25F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, -2F, 0F, -1.25F, -2F, 0F, 0F, 0F); // Box 467
		leftWingModel[107].setRotationPoint(-28F, -48F, -71.5F);

		leftWingModel[108].addShapeBox(0F, 0F, 0F, 10, 1, 5, 0F,0F, 0F, -1F, 0F, -2F, -2.25F, 0F, -2F, -2.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1.25F, -2F, 0F, 1.25F, -2F, 0F, 0F, 0F); // Box 468
		leftWingModel[108].setRotationPoint(-28F, -49F, -71.5F);

		leftWingModel[109].addShapeBox(0F, 0F, 0F, 10, 1, 5, 0F,0F, 0F, 0F, 0F, 1.25F, -2F, 0F, 1.25F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -2.25F, 0F, -2F, -2.25F, 0F, 0F, -1F); // Box 469
		leftWingModel[109].setRotationPoint(-28F, -45F, -71.5F);

		leftWingModel[110].addShapeBox(0F, 0F, 0F, 26, 7, 1, 0F,-3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F); // Box 470
		leftWingModel[110].setRotationPoint(-46F, -56.5F, -69F);

		leftWingModel[111].addShapeBox(0F, 0F, 0F, 26, 7, 1, 0F,-5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 471
		leftWingModel[111].setRotationPoint(-46F, -56.5F, -70F);

		leftWingModel[112].addShapeBox(0F, 0F, 0F, 15, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 472
		leftWingModel[112].setRotationPoint(-43F, -49.5F, -77.5F);

		leftWingModel[113].addShapeBox(0F, 0F, 0F, 5, 3, 5, 0F,0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F); // Box 473
		leftWingModel[113].setRotationPoint(-48F, -48.5F, -77.5F);

		leftWingModel[114].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 474
		leftWingModel[114].setRotationPoint(-48.5F, -47.5F, -75.5F);

		leftWingModel[115].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 475
		leftWingModel[115].setRotationPoint(-22F, -50F, -75.5F);

		leftWingModel[116].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F); // Box 476
		leftWingModel[116].setRotationPoint(-19F, -50F, -75.5F);

		leftWingModel[117].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -2F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -2F, -0.4F, 0F); // Box 477
		leftWingModel[117].setRotationPoint(-22F, -47.5F, -75F);

		leftWingModel[118].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 478
		leftWingModel[118].setRotationPoint(-19F, -47.5F, -74F);

		leftWingModel[119].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.3F, -1.9F, 0F, -0.3F, -1.9F, 0F, -0.1F, -1.5F, 0F, -0.1F, -1.5F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F); // Box 479
		leftWingModel[119].setRotationPoint(-18F, -49F, -75F);

		leftWingModel[120].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -1.5F, 0F, -0.1F, -1.5F, 0F, -0.3F, -1.9F, 0F, -0.3F, -1.9F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F); // Box 480
		leftWingModel[120].setRotationPoint(-18F, -47F, -77F);

		leftWingModel[121].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.1F, -1.5F, 0F, -0.1F, -1.5F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.3F, -1.9F, 0F, -0.3F, -1.9F); // Box 481
		leftWingModel[121].setRotationPoint(-18F, -47F, -75F);

		leftWingModel[122].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 482
		leftWingModel[122].setRotationPoint(-19F, -46F, -75.5F);

		leftWingModel[123].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -2F, 0F, -0.4F); // Box 483
		leftWingModel[123].setRotationPoint(-22F, -47F, -75.5F);

		leftWingModel[124].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-2F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -2F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 484
		leftWingModel[124].setRotationPoint(-22F, -47.5F, -78F);

		leftWingModel[125].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F); // Box 485
		leftWingModel[125].setRotationPoint(-19F, -47.5F, -78F);

		leftWingModel[126].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.3F, -1.9F, 0F, -0.3F, -1.9F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -1.5F, 0F, -0.1F, -1.5F); // Box 486
		leftWingModel[126].setRotationPoint(-18F, -49F, -77F);

		leftWingModel[127].addBox(0F, 0F, 0F, 15, 3, 5, 0F); // Box 487
		leftWingModel[127].setRotationPoint(-43F, -48.5F, -77.5F);

		leftWingModel[128].addShapeBox(0F, 0F, 0F, 15, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 488
		leftWingModel[128].setRotationPoint(-43F, -45.5F, -77.5F);

		leftWingModel[129].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, -1.75F, -2.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1.75F, -2.25F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F); // Box 489
		leftWingModel[129].setRotationPoint(-48F, -49.5F, -77.5F);

		leftWingModel[130].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, -1.75F, -2.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1.75F, -2.25F); // Box 490
		leftWingModel[130].setRotationPoint(-48F, -45.5F, -77.5F);

		leftWingModel[131].addShapeBox(0F, 0F, 0F, 10, 3, 5, 0F,0F, 0F, 0F, 0F, -1.25F, -2F, 0F, -1.25F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, -2F, 0F, -1.25F, -2F, 0F, 0F, 0F); // Box 491
		leftWingModel[131].setRotationPoint(-28F, -48.5F, -77.5F);

		leftWingModel[132].addShapeBox(0F, 0F, 0F, 10, 1, 5, 0F,0F, 0F, -1F, 0F, -2F, -2.25F, 0F, -2F, -2.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1.25F, -2F, 0F, 1.25F, -2F, 0F, 0F, 0F); // Box 492
		leftWingModel[132].setRotationPoint(-28F, -49.5F, -77.5F);

		leftWingModel[133].addShapeBox(0F, 0F, 0F, 10, 1, 5, 0F,0F, 0F, 0F, 0F, 1.25F, -2F, 0F, 1.25F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -2.25F, 0F, -2F, -2.25F, 0F, 0F, -1F); // Box 493
		leftWingModel[133].setRotationPoint(-28F, -45.5F, -77.5F);

		leftWingModel[134].addShapeBox(0F, 0F, 0F, 26, 7, 1, 0F,-3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F); // Box 494
		leftWingModel[134].setRotationPoint(-46F, -57F, -75F);

		leftWingModel[135].addShapeBox(0F, 0F, 0F, 26, 7, 1, 0F,-5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 495
		leftWingModel[135].setRotationPoint(-46F, -57F, -76F);

		leftWingModel[136].addShapeBox(0F, 0F, 0F, 15, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 496
		leftWingModel[136].setRotationPoint(-43F, -50F, -83.5F);

		leftWingModel[137].addShapeBox(0F, 0F, 0F, 5, 3, 5, 0F,0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F); // Box 497
		leftWingModel[137].setRotationPoint(-48F, -49F, -83.5F);

		leftWingModel[138].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 498
		leftWingModel[138].setRotationPoint(-48.5F, -48F, -81.5F);

		leftWingModel[139].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 499
		leftWingModel[139].setRotationPoint(-22F, -50.5F, -81.5F);

		leftWingModel[140].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F); // Box 500
		leftWingModel[140].setRotationPoint(-19F, -50.5F, -81.5F);

		leftWingModel[141].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -2F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -2F, -0.4F, 0F); // Box 501
		leftWingModel[141].setRotationPoint(-22F, -48F, -81F);

		leftWingModel[142].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 502
		leftWingModel[142].setRotationPoint(-19F, -48F, -80F);

		leftWingModel[143].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.3F, -1.9F, 0F, -0.3F, -1.9F, 0F, -0.1F, -1.5F, 0F, -0.1F, -1.5F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F); // Box 503
		leftWingModel[143].setRotationPoint(-18F, -49.5F, -81F);

		leftWingModel[144].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -1.5F, 0F, -0.1F, -1.5F, 0F, -0.3F, -1.9F, 0F, -0.3F, -1.9F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F); // Box 504
		leftWingModel[144].setRotationPoint(-18F, -47.5F, -83F);

		leftWingModel[145].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.1F, -1.5F, 0F, -0.1F, -1.5F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.3F, -1.9F, 0F, -0.3F, -1.9F); // Box 505
		leftWingModel[145].setRotationPoint(-18F, -47.5F, -81F);

		leftWingModel[146].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 506
		leftWingModel[146].setRotationPoint(-19F, -46.5F, -81.5F);

		leftWingModel[147].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -2F, 0F, -0.4F); // Box 507
		leftWingModel[147].setRotationPoint(-22F, -47.5F, -81.5F);

		leftWingModel[148].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-2F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -2F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 508
		leftWingModel[148].setRotationPoint(-22F, -48F, -84F);

		leftWingModel[149].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F); // Box 509
		leftWingModel[149].setRotationPoint(-19F, -48F, -84F);

		leftWingModel[150].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.3F, -1.9F, 0F, -0.3F, -1.9F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -1.5F, 0F, -0.1F, -1.5F); // Box 510
		leftWingModel[150].setRotationPoint(-18F, -49.5F, -83F);

		leftWingModel[151].addBox(0F, 0F, 0F, 15, 3, 5, 0F); // Box 511
		leftWingModel[151].setRotationPoint(-43F, -49F, -83.5F);

		leftWingModel[152].addShapeBox(0F, 0F, 0F, 15, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 512
		leftWingModel[152].setRotationPoint(-43F, -46F, -83.5F);

		leftWingModel[153].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, -1.75F, -2.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1.75F, -2.25F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F); // Box 513
		leftWingModel[153].setRotationPoint(-48F, -50F, -83.5F);

		leftWingModel[154].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, -1.75F, -2.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1.75F, -2.25F); // Box 514
		leftWingModel[154].setRotationPoint(-48F, -46F, -83.5F);

		leftWingModel[155].addShapeBox(0F, 0F, 0F, 10, 3, 5, 0F,0F, 0F, 0F, 0F, -1.25F, -2F, 0F, -1.25F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, -2F, 0F, -1.25F, -2F, 0F, 0F, 0F); // Box 515
		leftWingModel[155].setRotationPoint(-28F, -49F, -83.5F);

		leftWingModel[156].addShapeBox(0F, 0F, 0F, 10, 1, 5, 0F,0F, 0F, -1F, 0F, -2F, -2.25F, 0F, -2F, -2.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1.25F, -2F, 0F, 1.25F, -2F, 0F, 0F, 0F); // Box 516
		leftWingModel[156].setRotationPoint(-28F, -50F, -83.5F);

		leftWingModel[157].addShapeBox(0F, 0F, 0F, 10, 1, 5, 0F,0F, 0F, 0F, 0F, 1.25F, -2F, 0F, 1.25F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -2.25F, 0F, -2F, -2.25F, 0F, 0F, -1F); // Box 517
		leftWingModel[157].setRotationPoint(-28F, -46F, -83.5F);

		leftWingModel[158].addShapeBox(0F, 0F, 0F, 26, 7, 1, 0F,-3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F); // Box 518
		leftWingModel[158].setRotationPoint(-46F, -57.5F, -81F);

		leftWingModel[159].addShapeBox(0F, 0F, 0F, 26, 7, 1, 0F,-5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 519
		leftWingModel[159].setRotationPoint(-46F, -57.5F, -82F);
	}

	private void initrightWingModel_1()
	{
		rightWingModel[0] = new ModelRendererTurbo(this, 1, 664, textureX, textureY); // Box 165
		rightWingModel[1] = new ModelRendererTurbo(this, 105, 664, textureX, textureY); // Box 166
		rightWingModel[2] = new ModelRendererTurbo(this, 177, 664, textureX, textureY); // Box 167
		rightWingModel[3] = new ModelRendererTurbo(this, 273, 664, textureX, textureY); // Box 168
		rightWingModel[4] = new ModelRendererTurbo(this, 329, 664, textureX, textureY); // Box 169
		rightWingModel[5] = new ModelRendererTurbo(this, 449, 664, textureX, textureY); // Box 170
		rightWingModel[6] = new ModelRendererTurbo(this, 529, 664, textureX, textureY); // Box 171
		rightWingModel[7] = new ModelRendererTurbo(this, 641, 664, textureX, textureY); // Box 172
		rightWingModel[8] = new ModelRendererTurbo(this, 729, 664, textureX, textureY); // Box 173
		rightWingModel[9] = new ModelRendererTurbo(this, 737, 664, textureX, textureY); // Box 180
		rightWingModel[10] = new ModelRendererTurbo(this, 825, 664, textureX, textureY); // Box 181
		rightWingModel[11] = new ModelRendererTurbo(this, 873, 664, textureX, textureY); // Box 182
		rightWingModel[12] = new ModelRendererTurbo(this, 937, 664, textureX, textureY); // Box 183
		rightWingModel[13] = new ModelRendererTurbo(this, 1097, 664, textureX, textureY); // Box 185
		rightWingModel[14] = new ModelRendererTurbo(this, 1153, 664, textureX, textureY); // Box 186
		rightWingModel[15] = new ModelRendererTurbo(this, 977, 664, textureX, textureY); // Box 187
		rightWingModel[16] = new ModelRendererTurbo(this, 89, 664, textureX, textureY); // Box 323
		rightWingModel[17] = new ModelRendererTurbo(this, 1233, 664, textureX, textureY); // Box 520
		rightWingModel[18] = new ModelRendererTurbo(this, 1289, 664, textureX, textureY); // Box 521
		rightWingModel[19] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 522
		rightWingModel[20] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 523
		rightWingModel[21] = new ModelRendererTurbo(this, 38, 523, textureX, textureY); // Box 524
		rightWingModel[22] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 525
		rightWingModel[23] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 526
		rightWingModel[24] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 527
		rightWingModel[25] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 528
		rightWingModel[26] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 529
		rightWingModel[27] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 530
		rightWingModel[28] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 531
		rightWingModel[29] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 532
		rightWingModel[30] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 533
		rightWingModel[31] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 534
		rightWingModel[32] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 535
		rightWingModel[33] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 536
		rightWingModel[34] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 537
		rightWingModel[35] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 538
		rightWingModel[36] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 539
		rightWingModel[37] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 540
		rightWingModel[38] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 541
		rightWingModel[39] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 542
		rightWingModel[40] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 543
		rightWingModel[41] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 544
		rightWingModel[42] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 545
		rightWingModel[43] = new ModelRendererTurbo(this, 38, 523, textureX, textureY); // Box 546
		rightWingModel[44] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 547
		rightWingModel[45] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 548
		rightWingModel[46] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 549
		rightWingModel[47] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 550
		rightWingModel[48] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 551
		rightWingModel[49] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 552
		rightWingModel[50] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 553
		rightWingModel[51] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 554
		rightWingModel[52] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 555
		rightWingModel[53] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 556
		rightWingModel[54] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 557
		rightWingModel[55] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 558
		rightWingModel[56] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 559
		rightWingModel[57] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 560
		rightWingModel[58] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 561
		rightWingModel[59] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 562
		rightWingModel[60] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 563
		rightWingModel[61] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 564
		rightWingModel[62] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 565
		rightWingModel[63] = new ModelRendererTurbo(this, 1345, 664, textureX, textureY); // Box 566
		rightWingModel[64] = new ModelRendererTurbo(this, 1401, 664, textureX, textureY); // Box 567
		rightWingModel[65] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 568
		rightWingModel[66] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 569
		rightWingModel[67] = new ModelRendererTurbo(this, 38, 523, textureX, textureY); // Box 570
		rightWingModel[68] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 571
		rightWingModel[69] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 572
		rightWingModel[70] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 573
		rightWingModel[71] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 574
		rightWingModel[72] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 575
		rightWingModel[73] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 576
		rightWingModel[74] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 577
		rightWingModel[75] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 578
		rightWingModel[76] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 579
		rightWingModel[77] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 580
		rightWingModel[78] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 581
		rightWingModel[79] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 582
		rightWingModel[80] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 583
		rightWingModel[81] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 584
		rightWingModel[82] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 585
		rightWingModel[83] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 586
		rightWingModel[84] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 587
		rightWingModel[85] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 588
		rightWingModel[86] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 589
		rightWingModel[87] = new ModelRendererTurbo(this, 1457, 664, textureX, textureY); // Box 590
		rightWingModel[88] = new ModelRendererTurbo(this, 1513, 664, textureX, textureY); // Box 591
		rightWingModel[89] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 592
		rightWingModel[90] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 593
		rightWingModel[91] = new ModelRendererTurbo(this, 38, 523, textureX, textureY); // Box 594
		rightWingModel[92] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 595
		rightWingModel[93] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 596
		rightWingModel[94] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 597
		rightWingModel[95] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 598
		rightWingModel[96] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 599
		rightWingModel[97] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 600
		rightWingModel[98] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 601
		rightWingModel[99] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 602
		rightWingModel[100] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 603
		rightWingModel[101] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 604
		rightWingModel[102] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 605
		rightWingModel[103] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 606
		rightWingModel[104] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 607
		rightWingModel[105] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 608
		rightWingModel[106] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 609
		rightWingModel[107] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 610
		rightWingModel[108] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 611
		rightWingModel[109] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 612
		rightWingModel[110] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 613
		rightWingModel[111] = new ModelRendererTurbo(this, 1569, 664, textureX, textureY); // Box 614
		rightWingModel[112] = new ModelRendererTurbo(this, 1625, 664, textureX, textureY); // Box 615
		rightWingModel[113] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 616
		rightWingModel[114] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 617
		rightWingModel[115] = new ModelRendererTurbo(this, 38, 523, textureX, textureY); // Box 618
		rightWingModel[116] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 619
		rightWingModel[117] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 620
		rightWingModel[118] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 621
		rightWingModel[119] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 622
		rightWingModel[120] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 623
		rightWingModel[121] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 624
		rightWingModel[122] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 625
		rightWingModel[123] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 626
		rightWingModel[124] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 627
		rightWingModel[125] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 628
		rightWingModel[126] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 629
		rightWingModel[127] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 630
		rightWingModel[128] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 631
		rightWingModel[129] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 632
		rightWingModel[130] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 633
		rightWingModel[131] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 634
		rightWingModel[132] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 635
		rightWingModel[133] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 636
		rightWingModel[134] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 637
		rightWingModel[135] = new ModelRendererTurbo(this, 1681, 664, textureX, textureY); // Box 638
		rightWingModel[136] = new ModelRendererTurbo(this, 1737, 664, textureX, textureY); // Box 639
		rightWingModel[137] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 640
		rightWingModel[138] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 641
		rightWingModel[139] = new ModelRendererTurbo(this, 38, 523, textureX, textureY); // Box 642
		rightWingModel[140] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 643
		rightWingModel[141] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 644
		rightWingModel[142] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 645
		rightWingModel[143] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 646
		rightWingModel[144] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 647
		rightWingModel[145] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 648
		rightWingModel[146] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 649
		rightWingModel[147] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 650
		rightWingModel[148] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 651
		rightWingModel[149] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 652
		rightWingModel[150] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 653
		rightWingModel[151] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 654
		rightWingModel[152] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 655
		rightWingModel[153] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 656
		rightWingModel[154] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 657
		rightWingModel[155] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 658
		rightWingModel[156] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 659
		rightWingModel[157] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 660
		rightWingModel[158] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 661
		rightWingModel[159] = new ModelRendererTurbo(this, 1793, 664, textureX, textureY); // Box 662
		rightWingModel[160] = new ModelRendererTurbo(this, 1849, 664, textureX, textureY); // Box 663
		rightWingModel[161] = new ModelRendererTurbo(this, 1, 664, textureX, textureY); // Box 1
		rightWingModel[162] = new ModelRendererTurbo(this, 161, 664, textureX, textureY); // Box 2
		rightWingModel[163] = new ModelRendererTurbo(this, 177, 664, textureX, textureY); // Box 5
		rightWingModel[164] = new ModelRendererTurbo(this, 1905, 664, textureX, textureY); // Box 6
		rightWingModel[165] = new ModelRendererTurbo(this, 1945, 664, textureX, textureY); // Box 7
		rightWingModel[166] = new ModelRendererTurbo(this, 1985, 664, textureX, textureY); // Box 8
		rightWingModel[167] = new ModelRendererTurbo(this, 1, 664, textureX, textureY); // Box 688
		rightWingModel[168] = new ModelRendererTurbo(this, 161, 664, textureX, textureY); // Box 689
		rightWingModel[169] = new ModelRendererTurbo(this, 257, 664, textureX, textureY); // Box 690
		rightWingModel[170] = new ModelRendererTurbo(this, 177, 664, textureX, textureY); // Box 691
		rightWingModel[171] = new ModelRendererTurbo(this, 265, 664, textureX, textureY); // Box 692
		rightWingModel[172] = new ModelRendererTurbo(this, 273, 664, textureX, textureY); // Box 693
		rightWingModel[173] = new ModelRendererTurbo(this, 281, 664, textureX, textureY); // Box 694
		rightWingModel[174] = new ModelRendererTurbo(this, 361, 664, textureX, textureY); // Box 695

		rightWingModel[0].addShapeBox(0F, 3F, 0F, 33, 13, 17, 0F,0F, -1F, 0F, 0F, -3F, 2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 165
		rightWingModel[0].setRotationPoint(-45F, -64F, 15F);

		rightWingModel[1].addShapeBox(0F, 3F, 0F, 16, 13, 17, 0F,0F, -3F, 2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -2F, 5F, 0F, 2F, -1F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 166
		rightWingModel[1].setRotationPoint(-61F, -64F, 15F);

		rightWingModel[2].addShapeBox(0F, 3F, 0F, 30, 13, 17, 0F,0F, -1F, 2F, 0F, 0F, 1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, 8F, 0F, -8F, 0F, 0F, -4F, 0F); // Box 167
		rightWingModel[2].setRotationPoint(-12F, -62F, 15F);

		rightWingModel[3].addShapeBox(0F, 3F, 0F, 33, 13, 17, 0F,0F, 0F, 0.9999F, 0F, 0F, 5.9999F, -32.9999F, -3.9999F, 0F, 0F, -3.9999F, 0F, 0F, -1.9999F, 7.9999F, 0F, -9.9999F, 8.9999F, -32.9999F, -7.9999F, 0F, 0F, -7.9999F, 0F); // Box 168
		rightWingModel[3].setRotationPoint(18F, -62F, 15F);

		rightWingModel[4].addShapeBox(0F, 3F, 0F, 33, 17, 49, 0F,0F, -4F, 0F, 0F, -6F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -8F, 0F, 0F, -7F, 0F); // Box 169
		rightWingModel[4].setRotationPoint(-45F, -68F, 32F);

		rightWingModel[5].addShapeBox(0F, 3F, 0F, 33, 12, 27, 0F,0F, -2F, 0F, 0F, -5F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -5F, 0F, 0F, -4F, 0F); // Box 170
		rightWingModel[5].setRotationPoint(-45F, -70F, 81F);

		rightWingModel[6].addShapeBox(0F, 3F, 0F, 31, 11, 43, 0F,0F, -3F, 0F, 0F, -6F, 0F, -6F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -6F, -7F, 0F, 0F, -6F, 0F); // Box 171
		rightWingModel[6].setRotationPoint(-45F, -73F, 108F);

		rightWingModel[7].addShapeBox(0F, 3F, 0F, 25, 5, 16, 0F,0F, 0F, 0F, 0F, -1F, 0F, -10F, -1F, 0F, -5F, -1F, 2F, 0F, 0F, 0F, 0F, -1F, 0F, -10F, -3F, 0F, -5F, -3F, 2F); // Box 172
		rightWingModel[7].setRotationPoint(-45F, -73F, 151F);

		rightWingModel[8].addShapeBox(0F, 3F, 0F, 10, 3, 16, 0F,-9.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.9999F, 0F, 0F, 0F, -9.9999F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9999F, -3.9999F, 0F, -1.9999F, 0F); // Box 173
		rightWingModel[8].setRotationPoint(-30F, -72F, 151F);

		rightWingModel[9].addShapeBox(0F, 3F, 0F, 16, 17, 49, 0F,0F, -7F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -4F, -3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -4F, -9F, 0F); // Box 180
		rightWingModel[9].setRotationPoint(-61F, -68F, 32F);

		rightWingModel[10].addShapeBox(0F, 3F, 0F, 12, 12, 27, 0F,0F, -5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -2F, -6F, 0F); // Box 181
		rightWingModel[10].setRotationPoint(-57F, -70F, 81F);

		rightWingModel[11].addShapeBox(0F, 3F, 0F, 10, 11, 43, 0F,0F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -3F, -8F, 0F); // Box 182
		rightWingModel[11].setRotationPoint(-55F, -73F, 108F);

		rightWingModel[12].addShapeBox(0F, 3F, 0F, 7, 5, 18, 0F,0F, -1F, 0F, 0F, 0F, 0F, 5F, -1F, 0F, -5F, -1F, -5F, 0F, -2F, 0F, 0F, 0F, 0F, 5F, -3F, 0F, -5F, -3F, -5F); // Box 183
		rightWingModel[12].setRotationPoint(-52F, -73F, 151F);

		rightWingModel[13].addShapeBox(0F, 3F, 0F, 19, 8, 27, 0F,-2F, -2F, 0F, 0F, -5F, 0F, -7F, -2F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, -7F, -5F, 0F, 0F, -4F, 0F); // Box 185
		rightWingModel[13].setRotationPoint(-14F, -67F, 81F);

		rightWingModel[14].addShapeBox(0F, 3F, 0F, 18, 8, 43, 0F,-6F, -4F, 0F, 0F, -6F, 0F, -12F, 0F, 0F, 0F, 1F, 0F, -6F, 0F, 0F, 0F, -1F, 0F, -12F, -7F, 0F, 0F, -6F, 0F); // Box 186
		rightWingModel[14].setRotationPoint(-20F, -71F, 108F);

		rightWingModel[15].addShapeBox(0F, 3F, 0F, 6, 3, 12, 0F,0F, 0F, 0F, 0F, -0.9999F, 0F, 0F, -0.9999F, -11.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9999F, 0F, 0F, -0.9999F, -11.9999F, 0F, -1.9999F, 0F); // Box 187
		rightWingModel[15].setRotationPoint(-20F, -72F, 151F);

		rightWingModel[16].addShapeBox(0F, 3F, 0F, 14, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 323
		rightWingModel[16].setRotationPoint(-68F, -67F, 109F);

		rightWingModel[17].addShapeBox(0F, 0F, 0F, 26, 7, 1, 0F,-3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F); // Box 520
		rightWingModel[17].setRotationPoint(-46F, -55F, 51F);

		rightWingModel[18].addShapeBox(0F, 0F, 0F, 26, 7, 1, 0F,-5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 521
		rightWingModel[18].setRotationPoint(-46F, -55F, 50F);

		rightWingModel[19].addShapeBox(0F, 0F, 0F, 15, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 522
		rightWingModel[19].setRotationPoint(-43F, -47.5F, 48.5F);

		rightWingModel[20].addShapeBox(0F, 0F, 0F, 5, 3, 5, 0F,0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F); // Box 523
		rightWingModel[20].setRotationPoint(-48F, -46.5F, 48.5F);

		rightWingModel[21].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 524
		rightWingModel[21].setRotationPoint(-48.5F, -45.5F, 50.5F);

		rightWingModel[22].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 525
		rightWingModel[22].setRotationPoint(-22F, -48F, 50.5F);

		rightWingModel[23].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F); // Box 526
		rightWingModel[23].setRotationPoint(-19F, -48F, 50.5F);

		rightWingModel[24].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-2F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -2F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 527
		rightWingModel[24].setRotationPoint(-22F, -45.5F, 48F);

		rightWingModel[25].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F); // Box 528
		rightWingModel[25].setRotationPoint(-19F, -45.5F, 48F);

		rightWingModel[26].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.3F, -1.9F, 0F, -0.3F, -1.9F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -1.5F, 0F, -0.1F, -1.5F); // Box 529
		rightWingModel[26].setRotationPoint(-18F, -47F, 49F);

		rightWingModel[27].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.1F, -1.5F, 0F, -0.1F, -1.5F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.3F, -1.9F, 0F, -0.3F, -1.9F); // Box 530
		rightWingModel[27].setRotationPoint(-18F, -45F, 51F);

		rightWingModel[28].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -1.5F, 0F, -0.1F, -1.5F, 0F, -0.3F, -1.9F, 0F, -0.3F, -1.9F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F); // Box 531
		rightWingModel[28].setRotationPoint(-18F, -45F, 49F);

		rightWingModel[29].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 532
		rightWingModel[29].setRotationPoint(-19F, -44F, 50.5F);

		rightWingModel[30].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -2F, 0F, -0.4F); // Box 533
		rightWingModel[30].setRotationPoint(-22F, -45F, 50.5F);

		rightWingModel[31].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -2F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -2F, -0.4F, 0F); // Box 534
		rightWingModel[31].setRotationPoint(-22F, -45.5F, 51F);

		rightWingModel[32].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 535
		rightWingModel[32].setRotationPoint(-19F, -45.5F, 52F);

		rightWingModel[33].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.3F, -1.9F, 0F, -0.3F, -1.9F, 0F, -0.1F, -1.5F, 0F, -0.1F, -1.5F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F); // Box 536
		rightWingModel[33].setRotationPoint(-18F, -47F, 51F);

		rightWingModel[34].addBox(0F, 0F, 0F, 15, 3, 5, 0F); // Box 537
		rightWingModel[34].setRotationPoint(-43F, -46.5F, 48.5F);

		rightWingModel[35].addShapeBox(0F, 0F, 0F, 15, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 538
		rightWingModel[35].setRotationPoint(-43F, -43.5F, 48.5F);

		rightWingModel[36].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, -1.75F, -2.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1.75F, -2.25F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F); // Box 539
		rightWingModel[36].setRotationPoint(-48F, -47.5F, 48.5F);

		rightWingModel[37].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, -1.75F, -2.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1.75F, -2.25F); // Box 540
		rightWingModel[37].setRotationPoint(-48F, -43.5F, 48.5F);

		rightWingModel[38].addShapeBox(0F, 0F, 0F, 10, 3, 5, 0F,0F, 0F, 0F, 0F, -1.25F, -2F, 0F, -1.25F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, -2F, 0F, -1.25F, -2F, 0F, 0F, 0F); // Box 541
		rightWingModel[38].setRotationPoint(-28F, -46.5F, 48.5F);

		rightWingModel[39].addShapeBox(0F, 0F, 0F, 10, 1, 5, 0F,0F, 0F, -1F, 0F, -2F, -2.25F, 0F, -2F, -2.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1.25F, -2F, 0F, 1.25F, -2F, 0F, 0F, 0F); // Box 542
		rightWingModel[39].setRotationPoint(-28F, -47.5F, 48.5F);

		rightWingModel[40].addShapeBox(0F, 0F, 0F, 10, 1, 5, 0F,0F, 0F, 0F, 0F, 1.25F, -2F, 0F, 1.25F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -2.25F, 0F, -2F, -2.25F, 0F, 0F, -1F); // Box 543
		rightWingModel[40].setRotationPoint(-28F, -43.5F, 48.5F);

		rightWingModel[41].addShapeBox(0F, 0F, 0F, 15, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 544
		rightWingModel[41].setRotationPoint(-43F, -48F, 54.5F);

		rightWingModel[42].addShapeBox(0F, 0F, 0F, 5, 3, 5, 0F,0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F); // Box 545
		rightWingModel[42].setRotationPoint(-48F, -47F, 54.5F);

		rightWingModel[43].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 546
		rightWingModel[43].setRotationPoint(-48.5F, -46F, 56.5F);

		rightWingModel[44].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 547
		rightWingModel[44].setRotationPoint(-22F, -48.5F, 56.5F);

		rightWingModel[45].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F); // Box 548
		rightWingModel[45].setRotationPoint(-19F, -48.5F, 56.5F);

		rightWingModel[46].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-2F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -2F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 549
		rightWingModel[46].setRotationPoint(-22F, -46F, 54F);

		rightWingModel[47].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F); // Box 550
		rightWingModel[47].setRotationPoint(-19F, -46F, 54F);

		rightWingModel[48].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.3F, -1.9F, 0F, -0.3F, -1.9F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -1.5F, 0F, -0.1F, -1.5F); // Box 551
		rightWingModel[48].setRotationPoint(-18F, -47.5F, 55F);

		rightWingModel[49].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.1F, -1.5F, 0F, -0.1F, -1.5F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.3F, -1.9F, 0F, -0.3F, -1.9F); // Box 552
		rightWingModel[49].setRotationPoint(-18F, -45.5F, 57F);

		rightWingModel[50].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -1.5F, 0F, -0.1F, -1.5F, 0F, -0.3F, -1.9F, 0F, -0.3F, -1.9F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F); // Box 553
		rightWingModel[50].setRotationPoint(-18F, -45.5F, 55F);

		rightWingModel[51].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 554
		rightWingModel[51].setRotationPoint(-19F, -44.5F, 56.5F);

		rightWingModel[52].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -2F, 0F, -0.4F); // Box 555
		rightWingModel[52].setRotationPoint(-22F, -45.5F, 56.5F);

		rightWingModel[53].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -2F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -2F, -0.4F, 0F); // Box 556
		rightWingModel[53].setRotationPoint(-22F, -46F, 57F);

		rightWingModel[54].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 557
		rightWingModel[54].setRotationPoint(-19F, -46F, 58F);

		rightWingModel[55].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.3F, -1.9F, 0F, -0.3F, -1.9F, 0F, -0.1F, -1.5F, 0F, -0.1F, -1.5F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F); // Box 558
		rightWingModel[55].setRotationPoint(-18F, -47.5F, 57F);

		rightWingModel[56].addBox(0F, 0F, 0F, 15, 3, 5, 0F); // Box 559
		rightWingModel[56].setRotationPoint(-43F, -47F, 54.5F);

		rightWingModel[57].addShapeBox(0F, 0F, 0F, 15, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 560
		rightWingModel[57].setRotationPoint(-43F, -44F, 54.5F);

		rightWingModel[58].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, -1.75F, -2.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1.75F, -2.25F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F); // Box 561
		rightWingModel[58].setRotationPoint(-48F, -48F, 54.5F);

		rightWingModel[59].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, -1.75F, -2.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1.75F, -2.25F); // Box 562
		rightWingModel[59].setRotationPoint(-48F, -44F, 54.5F);

		rightWingModel[60].addShapeBox(0F, 0F, 0F, 10, 3, 5, 0F,0F, 0F, 0F, 0F, -1.25F, -2F, 0F, -1.25F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, -2F, 0F, -1.25F, -2F, 0F, 0F, 0F); // Box 563
		rightWingModel[60].setRotationPoint(-28F, -47F, 54.5F);

		rightWingModel[61].addShapeBox(0F, 0F, 0F, 10, 1, 5, 0F,0F, 0F, -1F, 0F, -2F, -2.25F, 0F, -2F, -2.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1.25F, -2F, 0F, 1.25F, -2F, 0F, 0F, 0F); // Box 564
		rightWingModel[61].setRotationPoint(-28F, -48F, 54.5F);

		rightWingModel[62].addShapeBox(0F, 0F, 0F, 10, 1, 5, 0F,0F, 0F, 0F, 0F, 1.25F, -2F, 0F, 1.25F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -2.25F, 0F, -2F, -2.25F, 0F, 0F, -1F); // Box 565
		rightWingModel[62].setRotationPoint(-28F, -44F, 54.5F);

		rightWingModel[63].addShapeBox(0F, 0F, 0F, 26, 7, 1, 0F,-5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 566
		rightWingModel[63].setRotationPoint(-46F, -55.5F, 56F);

		rightWingModel[64].addShapeBox(0F, 0F, 0F, 26, 7, 1, 0F,-3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F); // Box 567
		rightWingModel[64].setRotationPoint(-46F, -55.5F, 57F);

		rightWingModel[65].addShapeBox(0F, 0F, 0F, 15, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 568
		rightWingModel[65].setRotationPoint(-43F, -48.5F, 60.5F);

		rightWingModel[66].addShapeBox(0F, 0F, 0F, 5, 3, 5, 0F,0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F); // Box 569
		rightWingModel[66].setRotationPoint(-48F, -47.5F, 60.5F);

		rightWingModel[67].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 570
		rightWingModel[67].setRotationPoint(-48.5F, -46.5F, 62.5F);

		rightWingModel[68].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 571
		rightWingModel[68].setRotationPoint(-22F, -49F, 62.5F);

		rightWingModel[69].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F); // Box 572
		rightWingModel[69].setRotationPoint(-19F, -49F, 62.5F);

		rightWingModel[70].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-2F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -2F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 573
		rightWingModel[70].setRotationPoint(-22F, -46.5F, 60F);

		rightWingModel[71].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F); // Box 574
		rightWingModel[71].setRotationPoint(-19F, -46.5F, 60F);

		rightWingModel[72].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.3F, -1.9F, 0F, -0.3F, -1.9F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -1.5F, 0F, -0.1F, -1.5F); // Box 575
		rightWingModel[72].setRotationPoint(-18F, -48F, 61F);

		rightWingModel[73].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.1F, -1.5F, 0F, -0.1F, -1.5F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.3F, -1.9F, 0F, -0.3F, -1.9F); // Box 576
		rightWingModel[73].setRotationPoint(-18F, -46F, 63F);

		rightWingModel[74].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -1.5F, 0F, -0.1F, -1.5F, 0F, -0.3F, -1.9F, 0F, -0.3F, -1.9F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F); // Box 577
		rightWingModel[74].setRotationPoint(-18F, -46F, 61F);

		rightWingModel[75].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 578
		rightWingModel[75].setRotationPoint(-19F, -45F, 62.5F);

		rightWingModel[76].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -2F, 0F, -0.4F); // Box 579
		rightWingModel[76].setRotationPoint(-22F, -46F, 62.5F);

		rightWingModel[77].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -2F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -2F, -0.4F, 0F); // Box 580
		rightWingModel[77].setRotationPoint(-22F, -46.5F, 63F);

		rightWingModel[78].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 581
		rightWingModel[78].setRotationPoint(-19F, -46.5F, 64F);

		rightWingModel[79].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.3F, -1.9F, 0F, -0.3F, -1.9F, 0F, -0.1F, -1.5F, 0F, -0.1F, -1.5F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F); // Box 582
		rightWingModel[79].setRotationPoint(-18F, -48F, 63F);

		rightWingModel[80].addBox(0F, 0F, 0F, 15, 3, 5, 0F); // Box 583
		rightWingModel[80].setRotationPoint(-43F, -47.5F, 60.5F);

		rightWingModel[81].addShapeBox(0F, 0F, 0F, 15, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 584
		rightWingModel[81].setRotationPoint(-43F, -44.5F, 60.5F);

		rightWingModel[82].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, -1.75F, -2.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1.75F, -2.25F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F); // Box 585
		rightWingModel[82].setRotationPoint(-48F, -48.5F, 60.5F);

		rightWingModel[83].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, -1.75F, -2.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1.75F, -2.25F); // Box 586
		rightWingModel[83].setRotationPoint(-48F, -44.5F, 60.5F);

		rightWingModel[84].addShapeBox(0F, 0F, 0F, 10, 3, 5, 0F,0F, 0F, 0F, 0F, -1.25F, -2F, 0F, -1.25F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, -2F, 0F, -1.25F, -2F, 0F, 0F, 0F); // Box 587
		rightWingModel[84].setRotationPoint(-28F, -47.5F, 60.5F);

		rightWingModel[85].addShapeBox(0F, 0F, 0F, 10, 1, 5, 0F,0F, 0F, -1F, 0F, -2F, -2.25F, 0F, -2F, -2.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1.25F, -2F, 0F, 1.25F, -2F, 0F, 0F, 0F); // Box 588
		rightWingModel[85].setRotationPoint(-28F, -48.5F, 60.5F);

		rightWingModel[86].addShapeBox(0F, 0F, 0F, 10, 1, 5, 0F,0F, 0F, 0F, 0F, 1.25F, -2F, 0F, 1.25F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -2.25F, 0F, -2F, -2.25F, 0F, 0F, -1F); // Box 589
		rightWingModel[86].setRotationPoint(-28F, -44.5F, 60.5F);

		rightWingModel[87].addShapeBox(0F, 0F, 0F, 26, 7, 1, 0F,-5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 590
		rightWingModel[87].setRotationPoint(-46F, -56F, 62F);

		rightWingModel[88].addShapeBox(0F, 0F, 0F, 26, 7, 1, 0F,-3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F); // Box 591
		rightWingModel[88].setRotationPoint(-46F, -56F, 63F);

		rightWingModel[89].addShapeBox(0F, 0F, 0F, 15, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 592
		rightWingModel[89].setRotationPoint(-43F, -49F, 66.5F);

		rightWingModel[90].addShapeBox(0F, 0F, 0F, 5, 3, 5, 0F,0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F); // Box 593
		rightWingModel[90].setRotationPoint(-48F, -48F, 66.5F);

		rightWingModel[91].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 594
		rightWingModel[91].setRotationPoint(-48.5F, -47F, 68.5F);

		rightWingModel[92].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 595
		rightWingModel[92].setRotationPoint(-22F, -49.5F, 68.5F);

		rightWingModel[93].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F); // Box 596
		rightWingModel[93].setRotationPoint(-19F, -49.5F, 68.5F);

		rightWingModel[94].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-2F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -2F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 597
		rightWingModel[94].setRotationPoint(-22F, -47F, 66F);

		rightWingModel[95].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F); // Box 598
		rightWingModel[95].setRotationPoint(-19F, -47F, 66F);

		rightWingModel[96].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.3F, -1.9F, 0F, -0.3F, -1.9F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -1.5F, 0F, -0.1F, -1.5F); // Box 599
		rightWingModel[96].setRotationPoint(-18F, -48.5F, 67F);

		rightWingModel[97].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.1F, -1.5F, 0F, -0.1F, -1.5F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.3F, -1.9F, 0F, -0.3F, -1.9F); // Box 600
		rightWingModel[97].setRotationPoint(-18F, -46.5F, 69F);

		rightWingModel[98].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -1.5F, 0F, -0.1F, -1.5F, 0F, -0.3F, -1.9F, 0F, -0.3F, -1.9F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F); // Box 601
		rightWingModel[98].setRotationPoint(-18F, -46.5F, 67F);

		rightWingModel[99].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 602
		rightWingModel[99].setRotationPoint(-19F, -45.5F, 68.5F);

		rightWingModel[100].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -2F, 0F, -0.4F); // Box 603
		rightWingModel[100].setRotationPoint(-22F, -46.5F, 68.5F);

		rightWingModel[101].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -2F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -2F, -0.4F, 0F); // Box 604
		rightWingModel[101].setRotationPoint(-22F, -47F, 69F);

		rightWingModel[102].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 605
		rightWingModel[102].setRotationPoint(-19F, -47F, 70F);

		rightWingModel[103].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.3F, -1.9F, 0F, -0.3F, -1.9F, 0F, -0.1F, -1.5F, 0F, -0.1F, -1.5F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F); // Box 606
		rightWingModel[103].setRotationPoint(-18F, -48.5F, 69F);

		rightWingModel[104].addBox(0F, 0F, 0F, 15, 3, 5, 0F); // Box 607
		rightWingModel[104].setRotationPoint(-43F, -48F, 66.5F);

		rightWingModel[105].addShapeBox(0F, 0F, 0F, 15, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 608
		rightWingModel[105].setRotationPoint(-43F, -45F, 66.5F);

		rightWingModel[106].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, -1.75F, -2.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1.75F, -2.25F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F); // Box 609
		rightWingModel[106].setRotationPoint(-48F, -49F, 66.5F);

		rightWingModel[107].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, -1.75F, -2.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1.75F, -2.25F); // Box 610
		rightWingModel[107].setRotationPoint(-48F, -45F, 66.5F);

		rightWingModel[108].addShapeBox(0F, 0F, 0F, 10, 3, 5, 0F,0F, 0F, 0F, 0F, -1.25F, -2F, 0F, -1.25F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, -2F, 0F, -1.25F, -2F, 0F, 0F, 0F); // Box 611
		rightWingModel[108].setRotationPoint(-28F, -48F, 66.5F);

		rightWingModel[109].addShapeBox(0F, 0F, 0F, 10, 1, 5, 0F,0F, 0F, -1F, 0F, -2F, -2.25F, 0F, -2F, -2.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1.25F, -2F, 0F, 1.25F, -2F, 0F, 0F, 0F); // Box 612
		rightWingModel[109].setRotationPoint(-28F, -49F, 66.5F);

		rightWingModel[110].addShapeBox(0F, 0F, 0F, 10, 1, 5, 0F,0F, 0F, 0F, 0F, 1.25F, -2F, 0F, 1.25F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -2.25F, 0F, -2F, -2.25F, 0F, 0F, -1F); // Box 613
		rightWingModel[110].setRotationPoint(-28F, -45F, 66.5F);

		rightWingModel[111].addShapeBox(0F, 0F, 0F, 26, 7, 1, 0F,-5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 614
		rightWingModel[111].setRotationPoint(-46F, -56.5F, 68F);

		rightWingModel[112].addShapeBox(0F, 0F, 0F, 26, 7, 1, 0F,-3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F); // Box 615
		rightWingModel[112].setRotationPoint(-46F, -56.5F, 69F);

		rightWingModel[113].addShapeBox(0F, 0F, 0F, 15, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 616
		rightWingModel[113].setRotationPoint(-43F, -49.5F, 72.5F);

		rightWingModel[114].addShapeBox(0F, 0F, 0F, 5, 3, 5, 0F,0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F); // Box 617
		rightWingModel[114].setRotationPoint(-48F, -48.5F, 72.5F);

		rightWingModel[115].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 618
		rightWingModel[115].setRotationPoint(-48.5F, -47.5F, 74.5F);

		rightWingModel[116].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 619
		rightWingModel[116].setRotationPoint(-22F, -50F, 74.5F);

		rightWingModel[117].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F); // Box 620
		rightWingModel[117].setRotationPoint(-19F, -50F, 74.5F);

		rightWingModel[118].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-2F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -2F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 621
		rightWingModel[118].setRotationPoint(-22F, -47.5F, 72F);

		rightWingModel[119].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F); // Box 622
		rightWingModel[119].setRotationPoint(-19F, -47.5F, 72F);

		rightWingModel[120].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.3F, -1.9F, 0F, -0.3F, -1.9F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -1.5F, 0F, -0.1F, -1.5F); // Box 623
		rightWingModel[120].setRotationPoint(-18F, -49F, 73F);

		rightWingModel[121].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.1F, -1.5F, 0F, -0.1F, -1.5F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.3F, -1.9F, 0F, -0.3F, -1.9F); // Box 624
		rightWingModel[121].setRotationPoint(-18F, -47F, 75F);

		rightWingModel[122].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -1.5F, 0F, -0.1F, -1.5F, 0F, -0.3F, -1.9F, 0F, -0.3F, -1.9F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F); // Box 625
		rightWingModel[122].setRotationPoint(-18F, -47F, 73F);

		rightWingModel[123].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 626
		rightWingModel[123].setRotationPoint(-19F, -46F, 74.5F);

		rightWingModel[124].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -2F, 0F, -0.4F); // Box 627
		rightWingModel[124].setRotationPoint(-22F, -47F, 74.5F);

		rightWingModel[125].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -2F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -2F, -0.4F, 0F); // Box 628
		rightWingModel[125].setRotationPoint(-22F, -47.5F, 75F);

		rightWingModel[126].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 629
		rightWingModel[126].setRotationPoint(-19F, -47.5F, 76F);

		rightWingModel[127].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.3F, -1.9F, 0F, -0.3F, -1.9F, 0F, -0.1F, -1.5F, 0F, -0.1F, -1.5F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F); // Box 630
		rightWingModel[127].setRotationPoint(-18F, -49F, 75F);

		rightWingModel[128].addBox(0F, 0F, 0F, 15, 3, 5, 0F); // Box 631
		rightWingModel[128].setRotationPoint(-43F, -48.5F, 72.5F);

		rightWingModel[129].addShapeBox(0F, 0F, 0F, 15, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 632
		rightWingModel[129].setRotationPoint(-43F, -45.5F, 72.5F);

		rightWingModel[130].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, -1.75F, -2.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1.75F, -2.25F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F); // Box 633
		rightWingModel[130].setRotationPoint(-48F, -49.5F, 72.5F);

		rightWingModel[131].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, -1.75F, -2.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1.75F, -2.25F); // Box 634
		rightWingModel[131].setRotationPoint(-48F, -45.5F, 72.5F);

		rightWingModel[132].addShapeBox(0F, 0F, 0F, 10, 3, 5, 0F,0F, 0F, 0F, 0F, -1.25F, -2F, 0F, -1.25F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, -2F, 0F, -1.25F, -2F, 0F, 0F, 0F); // Box 635
		rightWingModel[132].setRotationPoint(-28F, -48.5F, 72.5F);

		rightWingModel[133].addShapeBox(0F, 0F, 0F, 10, 1, 5, 0F,0F, 0F, -1F, 0F, -2F, -2.25F, 0F, -2F, -2.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1.25F, -2F, 0F, 1.25F, -2F, 0F, 0F, 0F); // Box 636
		rightWingModel[133].setRotationPoint(-28F, -49.5F, 72.5F);

		rightWingModel[134].addShapeBox(0F, 0F, 0F, 10, 1, 5, 0F,0F, 0F, 0F, 0F, 1.25F, -2F, 0F, 1.25F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -2.25F, 0F, -2F, -2.25F, 0F, 0F, -1F); // Box 637
		rightWingModel[134].setRotationPoint(-28F, -45.5F, 72.5F);

		rightWingModel[135].addShapeBox(0F, 0F, 0F, 26, 7, 1, 0F,-5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 638
		rightWingModel[135].setRotationPoint(-46F, -57F, 74F);

		rightWingModel[136].addShapeBox(0F, 0F, 0F, 26, 7, 1, 0F,-3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F); // Box 639
		rightWingModel[136].setRotationPoint(-46F, -57F, 75F);

		rightWingModel[137].addShapeBox(0F, 0F, 0F, 15, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 640
		rightWingModel[137].setRotationPoint(-43F, -50F, 78.5F);

		rightWingModel[138].addShapeBox(0F, 0F, 0F, 5, 3, 5, 0F,0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F); // Box 641
		rightWingModel[138].setRotationPoint(-48F, -49F, 78.5F);

		rightWingModel[139].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 642
		rightWingModel[139].setRotationPoint(-48.5F, -48F, 80.5F);

		rightWingModel[140].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 643
		rightWingModel[140].setRotationPoint(-22F, -50.5F, 80.5F);

		rightWingModel[141].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F); // Box 644
		rightWingModel[141].setRotationPoint(-19F, -50.5F, 80.5F);

		rightWingModel[142].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-2F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -2F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 645
		rightWingModel[142].setRotationPoint(-22F, -48F, 78F);

		rightWingModel[143].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F); // Box 646
		rightWingModel[143].setRotationPoint(-19F, -48F, 78F);

		rightWingModel[144].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.3F, -1.9F, 0F, -0.3F, -1.9F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -1.5F, 0F, -0.1F, -1.5F); // Box 647
		rightWingModel[144].setRotationPoint(-18F, -49.5F, 79F);

		rightWingModel[145].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.1F, -1.5F, 0F, -0.1F, -1.5F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.3F, -1.9F, 0F, -0.3F, -1.9F); // Box 648
		rightWingModel[145].setRotationPoint(-18F, -47.5F, 81F);

		rightWingModel[146].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -1.5F, 0F, -0.1F, -1.5F, 0F, -0.3F, -1.9F, 0F, -0.3F, -1.9F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F); // Box 649
		rightWingModel[146].setRotationPoint(-18F, -47.5F, 79F);

		rightWingModel[147].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 650
		rightWingModel[147].setRotationPoint(-19F, -46.5F, 80.5F);

		rightWingModel[148].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -2F, 0F, -0.4F); // Box 651
		rightWingModel[148].setRotationPoint(-22F, -47.5F, 80.5F);

		rightWingModel[149].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -2F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -2F, -0.4F, 0F); // Box 652
		rightWingModel[149].setRotationPoint(-22F, -48F, 81F);

		rightWingModel[150].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 653
		rightWingModel[150].setRotationPoint(-19F, -48F, 82F);

		rightWingModel[151].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.3F, -1.9F, 0F, -0.3F, -1.9F, 0F, -0.1F, -1.5F, 0F, -0.1F, -1.5F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F); // Box 654
		rightWingModel[151].setRotationPoint(-18F, -49.5F, 81F);

		rightWingModel[152].addBox(0F, 0F, 0F, 15, 3, 5, 0F); // Box 655
		rightWingModel[152].setRotationPoint(-43F, -49F, 78.5F);

		rightWingModel[153].addShapeBox(0F, 0F, 0F, 15, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 656
		rightWingModel[153].setRotationPoint(-43F, -46F, 78.5F);

		rightWingModel[154].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, -1.75F, -2.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1.75F, -2.25F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F); // Box 657
		rightWingModel[154].setRotationPoint(-48F, -50F, 78.5F);

		rightWingModel[155].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, -1.75F, -2.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1.75F, -2.25F); // Box 658
		rightWingModel[155].setRotationPoint(-48F, -46F, 78.5F);

		rightWingModel[156].addShapeBox(0F, 0F, 0F, 10, 3, 5, 0F,0F, 0F, 0F, 0F, -1.25F, -2F, 0F, -1.25F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, -2F, 0F, -1.25F, -2F, 0F, 0F, 0F); // Box 659
		rightWingModel[156].setRotationPoint(-28F, -49F, 78.5F);

		rightWingModel[157].addShapeBox(0F, 0F, 0F, 10, 1, 5, 0F,0F, 0F, -1F, 0F, -2F, -2.25F, 0F, -2F, -2.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1.25F, -2F, 0F, 1.25F, -2F, 0F, 0F, 0F); // Box 660
		rightWingModel[157].setRotationPoint(-28F, -50F, 78.5F);

		rightWingModel[158].addShapeBox(0F, 0F, 0F, 10, 1, 5, 0F,0F, 0F, 0F, 0F, 1.25F, -2F, 0F, 1.25F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -2.25F, 0F, -2F, -2.25F, 0F, 0F, -1F); // Box 661
		rightWingModel[158].setRotationPoint(-28F, -46F, 78.5F);

		rightWingModel[159].addShapeBox(0F, 0F, 0F, 26, 7, 1, 0F,-5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 662
		rightWingModel[159].setRotationPoint(-46F, -57.5F, 80F);

		rightWingModel[160].addShapeBox(0F, 0F, 0F, 26, 7, 1, 0F,-3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F); // Box 663
		rightWingModel[160].setRotationPoint(-46F, -57.5F, 81F);

		rightWingModel[161].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 1
		rightWingModel[161].setRotationPoint(-63F, -53F, 23F);

		rightWingModel[162].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 2
		rightWingModel[162].setRotationPoint(-63F, -51F, 23F);

		rightWingModel[163].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 5
		rightWingModel[163].setRotationPoint(-63F, -49F, 23F);

		rightWingModel[164].addShapeBox(0F, 0F, 0F, 15, 2, 4, 0F,0F, 0F, 0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0.5F); // Box 6
		rightWingModel[164].setRotationPoint(-60F, -51F, 23F);

		rightWingModel[165].addShapeBox(0F, 0F, 0F, 15, 2, 4, 0F,0F, 0F, -1F, 0F, -2F, -1.5F, 0F, -2F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0F, 0.5F); // Box 7
		rightWingModel[165].setRotationPoint(-60F, -53F, 23F);

		rightWingModel[166].addShapeBox(0F, 0F, 0F, 15, 2, 4, 0F,0F, 0F, 0.5F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, -2F, -1.5F, 0F, -2F, -1.5F, 0F, 0F, -1F); // Box 8
		rightWingModel[166].setRotationPoint(-60F, -49F, 23F);

		rightWingModel[167].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 688
		rightWingModel[167].setRotationPoint(-64F, -51F, 23F);

		rightWingModel[168].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 689
		rightWingModel[168].setRotationPoint(-64F, -49F, 27F);

		rightWingModel[169].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 690
		rightWingModel[169].setRotationPoint(-64F, -48F, 24F);

		rightWingModel[170].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 691
		rightWingModel[170].setRotationPoint(-64F, -49F, 23F);

		rightWingModel[171].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 692
		rightWingModel[171].setRotationPoint(-64F, -51F, 27F);

		rightWingModel[172].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 693
		rightWingModel[172].setRotationPoint(-64F, -53F, 27F);

		rightWingModel[173].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 694
		rightWingModel[173].setRotationPoint(-64F, -53F, 23F);

		rightWingModel[174].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 695
		rightWingModel[174].setRotationPoint(-64F, -53F, 24F);
	}

	private void inityawFlapModel_1()
	{
		yawFlapModel[0] = new ModelRendererTurbo(this, 441, 760, textureX, textureY); // Box 253
		yawFlapModel[1] = new ModelRendererTurbo(this, 121, 760, textureX, textureY); // Box 254
		yawFlapModel[2] = new ModelRendererTurbo(this, 161, 760, textureX, textureY); // Box 255
		yawFlapModel[3] = new ModelRendererTurbo(this, 217, 760, textureX, textureY); // Box 256
		yawFlapModel[4] = new ModelRendererTurbo(this, 273, 760, textureX, textureY); // Box 257
		yawFlapModel[5] = new ModelRendererTurbo(this, 321, 760, textureX, textureY); // Box 258
		yawFlapModel[6] = new ModelRendererTurbo(this, 361, 760, textureX, textureY); // Box 259

		yawFlapModel[0].addShapeBox(0F, 0F, -3F, 20, 25, 6, 0F,0F, 0F, -1F, -8F, 0F, -2.5F, -8F, 0F, -2.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F); // Box 253
		yawFlapModel[0].setRotationPoint(100F, -108F, 0F);

		yawFlapModel[1].addShapeBox(0F, -12F, -2F, 12, 12, 4, 0F,0F, 0F, -1F, -6.5F, -2F, -1.5F, -6.5F, -2F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 254
		yawFlapModel[1].setRotationPoint(100F, -108F, 0F);

		yawFlapModel[2].addShapeBox(0F, 25F, -3F, 20, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2.5F, -1F, 0F, -2.5F, 0F, 0F, 0F); // Box 255
		yawFlapModel[2].setRotationPoint(100F, -108F, 0F);

		yawFlapModel[3].addShapeBox(0F, 29F, -3F, 19, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -2.5F, -1.5F, 0F, -2.5F, 0F, 0F, 0F); // Box 256
		yawFlapModel[3].setRotationPoint(100F, -108F, 0F);

		yawFlapModel[4].addShapeBox(0F, 34F, -3F, 17, 6, 6, 0F,0F, 0F, 0F, 0.5F, 0F, -2.5F, 0.5F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -2.5F, -6F, 0F, -2.5F, 0F, 0F, 0F); // Box 257
		yawFlapModel[4].setRotationPoint(100F, -108F, 0F);

		yawFlapModel[5].addShapeBox(0F, 40F, -3F, 10, 2, 6, 0F,0F, 0F, 0F, 1F, 0F, -2.5F, 1F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -1F, -4.5F, 0F, -2.5F, -4.5F, 0F, -2.5F, 0F, 0F, -1F); // Box 258
		yawFlapModel[5].setRotationPoint(100F, -108F, 0F);

		yawFlapModel[6].addShapeBox(0F, 42F, -2F, 3, 2, 4, 0F,0F, 0F, 0F, 2.4999F, 0F, -1.5F, 2.4999F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, -2.9999F, 0F, -1.5F, -2.9999F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 259
		yawFlapModel[6].setRotationPoint(100F, -108F, 0F);
	}

	private void initpitchFlapLeftModel_1()
	{
		pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 337, 789, textureX, textureY); // Box 120

		pitchFlapLeftModel[0].addShapeBox(0F, 0F, 0F, 16, 3, 33, 0F,0F, 0F, 0F, -5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 120
		pitchFlapLeftModel[0].setRotationPoint(95F, -81F, -52F);
	}

	private void initpitchFlapRightModel_1()
	{
		pitchFlapRightModel[0] = new ModelRendererTurbo(this, 337, 826, textureX, textureY); // Box 246

		pitchFlapRightModel[0].addShapeBox(0F, 0F, 0F, 16, 3, 33, 0F,0F, 0F, 0F, 0F, -1F, 0F, -5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -5F, -1F, 0F, 0F, 0F, 0F); // Box 246
		pitchFlapRightModel[0].setRotationPoint(95F, -81F, 19F);
	}

	private void initpitchFlapLeftWingModel_1()
	{
		pitchFlapLeftWingModel[0] = new ModelRendererTurbo(this, 881, 597, textureX, textureY); // Box 58

		pitchFlapLeftWingModel[0].addShapeBox(0F, 3F, 0F, 30, 12, 49, 0F,0F, 0F, 0F, -13F, -3F, 0F, 0F, -7F, 0F, 0F, -3F, 0F, 0F, -6F, 0F, -13F, -8F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 58
		pitchFlapLeftWingModel[0].setRotationPoint(-12F, -65F, -81F);
	}

	private void initpitchFlapRightWingModel_1()
	{
		pitchFlapRightWingModel[0] = new ModelRendererTurbo(this, 985, 664, textureX, textureY); // Box 184

		pitchFlapRightWingModel[0].addShapeBox(0F, 3F, 0F, 30, 12, 49, 0F,0F, -3F, 0F, 0F, -7F, 0F, -13F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -13F, -8F, 0F, 0F, -6F, 0F); // Box 184
		pitchFlapRightWingModel[0].setRotationPoint(-12F, -65F, 32F);
	}

	private void inittailWheelModel_1()
	{
		tailWheelModel[0] = new ModelRendererTurbo(this, 1, 533, textureX, textureY); // Box 391
		tailWheelModel[1] = new ModelRendererTurbo(this, 33, 533, textureX, textureY); // Box 392
		tailWheelModel[2] = new ModelRendererTurbo(this, 57, 533, textureX, textureY); // Box 393
		tailWheelModel[3] = new ModelRendererTurbo(this, 73, 533, textureX, textureY); // Box 394
		tailWheelModel[4] = new ModelRendererTurbo(this, 97, 533, textureX, textureY); // Box 395
		tailWheelModel[5] = new ModelRendererTurbo(this, 121, 533, textureX, textureY); // Box 396
		tailWheelModel[6] = new ModelRendererTurbo(this, 145, 533, textureX, textureY); // Box 397
		tailWheelModel[7] = new ModelRendererTurbo(this, 177, 533, textureX, textureY); // Box 398
		tailWheelModel[8] = new ModelRendererTurbo(this, 201, 533, textureX, textureY); // Box 399

		tailWheelModel[0].addShapeBox(0F, 0F, 0F, 10, 3, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 391
		tailWheelModel[0].setRotationPoint(87F, -65F, -2F);

		tailWheelModel[1].addShapeBox(0F, 0F, 0F, 8, 3, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F); // Box 392
		tailWheelModel[1].setRotationPoint(89F, -62F, -2F);

		tailWheelModel[2].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 393
		tailWheelModel[2].setRotationPoint(92F, -59F, -2F);

		tailWheelModel[3].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		tailWheelModel[3].setRotationPoint(92F, -56F, -1F);

		tailWheelModel[4].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 395
		tailWheelModel[4].setRotationPoint(92F, -58F, -1F);

		tailWheelModel[5].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 396
		tailWheelModel[5].setRotationPoint(92F, -54F, -1F);

		tailWheelModel[6].addShapeBox(0F, 0F, 0F, 10, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F); // Box 397
		tailWheelModel[6].setRotationPoint(87F, -65F, 0F);

		tailWheelModel[7].addShapeBox(0F, 0F, 0F, 8, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 398
		tailWheelModel[7].setRotationPoint(89F, -62F, 0F);

		tailWheelModel[8].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 399
		tailWheelModel[8].setRotationPoint(92F, -59F, 1F);
	}

	private void initleftWingWheelModel_1()
	{
		leftWingWheelModel[0] = new ModelRendererTurbo(this, 1, 539, textureX, textureY); // Box 122
		leftWingWheelModel[1] = new ModelRendererTurbo(this, 17, 539, textureX, textureY); // Box 123
		leftWingWheelModel[2] = new ModelRendererTurbo(this, 33, 539, textureX, textureY); // Box 124
		leftWingWheelModel[3] = new ModelRendererTurbo(this, 81, 539, textureX, textureY); // Box 125
		leftWingWheelModel[4] = new ModelRendererTurbo(this, 129, 539, textureX, textureY); // Box 126

		leftWingWheelModel[0].addShapeBox(0F, 3F, 0F, 3, 25, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 122
		leftWingWheelModel[0].setRotationPoint(-55F, -55F, -38F);

		leftWingWheelModel[1].addShapeBox(0F, 3F, 0F, 2, 14, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 8F, 0F, 0F, 8F); // Box 123
		leftWingWheelModel[1].setRotationPoint(-54.5F, -56F, -46F);

		leftWingWheelModel[2].addShapeBox(0F, 3F, 0F, 15, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		leftWingWheelModel[2].setRotationPoint(-61F, -33F, -43F);

		leftWingWheelModel[3].addShapeBox(0F, 3F, 0F, 15, 5, 5, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		leftWingWheelModel[3].setRotationPoint(-61F, -38F, -43F);

		leftWingWheelModel[4].addShapeBox(0F, 3F, 0F, 15, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 126
		leftWingWheelModel[4].setRotationPoint(-61F, -28F, -43F);
	}

	private void initrightWingWheelModel_1()
	{
		rightWingWheelModel[0] = new ModelRendererTurbo(this, 1, 568, textureX, textureY); // Box 248
		rightWingWheelModel[1] = new ModelRendererTurbo(this, 17, 568, textureX, textureY); // Box 249
		rightWingWheelModel[2] = new ModelRendererTurbo(this, 33, 568, textureX, textureY); // Box 250
		rightWingWheelModel[3] = new ModelRendererTurbo(this, 81, 568, textureX, textureY); // Box 251
		rightWingWheelModel[4] = new ModelRendererTurbo(this, 129, 568, textureX, textureY); // Box 252

		rightWingWheelModel[0].addShapeBox(0F, 3F, 0F, 3, 25, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		rightWingWheelModel[0].setRotationPoint(-55F, -55F, 35F);

		rightWingWheelModel[1].addShapeBox(0F, 3F, 0F, 2, 14, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, -8F, 0F, 0F, -8F); // Box 249
		rightWingWheelModel[1].setRotationPoint(-54.5F, -56F, 44F);

		rightWingWheelModel[2].addShapeBox(0F, 3F, 0F, 15, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 250
		rightWingWheelModel[2].setRotationPoint(-61F, -33F, 38F);

		rightWingWheelModel[3].addShapeBox(0F, 3F, 0F, 15, 5, 5, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 251
		rightWingWheelModel[3].setRotationPoint(-61F, -38F, 38F);

		rightWingWheelModel[4].addShapeBox(0F, 3F, 0F, 15, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 252
		rightWingWheelModel[4].setRotationPoint(-61F, -28F, 38F);
	}

	private void initPropeller()
	{
		propellerModels = new ModelRendererTurbo[1][3];
		propellerModels[0] = makeProp1(-112F, -68F, 0F);
	}

	private ModelRendererTurbo[] makeProp1(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[3];
		prop[0] = new ModelRendererTurbo(this, 0, 369, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 369, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 0, 369, textureX, textureY);
		prop[0].addBox(-0.5F, -40F, -2.5F, 1, 40, 5, 0.0F);
		prop[1].addBox(-0.5F, -40F, -2.5F, 1, 40, 5, 0.0F);
		prop[2].addBox(-0.5F, -40F, -2.5F, 1, 40, 5, 0.0F);
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

		gun_2_Model[1] = new ModelRendererTurbo[12];
		gun_2_Model[1][0] = new ModelRendererTurbo(this, 0, 416, textureX, textureY); // MG1
		gun_2_Model[1][1] = new ModelRendererTurbo(this, 0, 419, textureX, textureY); // MG1 Innen
		gun_2_Model[1][2] = new ModelRendererTurbo(this, 0, 422, textureX, textureY); // MG1 Lauf
		gun_2_Model[1][3] = new ModelRendererTurbo(this, 0, 425, textureX, textureY); // MG2
		gun_2_Model[1][4] = new ModelRendererTurbo(this, 0, 430, textureX, textureY); // MG3
		gun_2_Model[1][5] = new ModelRendererTurbo(this, 7, 430, textureX, textureY); // MG4
		gun_2_Model[1][6] = new ModelRendererTurbo(this, 14, 430, textureX, textureY); // MG5
		gun_2_Model[1][7] = new ModelRendererTurbo(this, 27, 416, textureX, textureY); // MG6
		gun_2_Model[1][8] = new ModelRendererTurbo(this, 27, 420, textureX, textureY); // MG7
		gun_2_Model[1][9] = new ModelRendererTurbo(this, 21, 425, textureX, textureY); // MG8
		gun_2_Model[1][10] = new ModelRendererTurbo(this, 33, 425, textureX, textureY); // MG9
		gun_2_Model[1][11] = new ModelRendererTurbo(this, 23, 425, textureX, textureY); // Ammo

		gun_2_Model[1][0].addBox(0.5F, -1F, -0.5F, 12, 1, 1, 0F); // MG1

		gun_2_Model[1][1].addBox(0.5F, -1F, -0.5F, 12, 1, 1, 0F); // MG1 Innen

		gun_2_Model[1][2].addShapeBox(0.5F, -1F, -0.5F, 12, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // MG1 Lauf

		gun_2_Model[1][3].addBox(-7.5F, -1.5F, -1F, 8, 2, 2, 0F); // MG2

		gun_2_Model[1][4].addBox(-9.5F, -1F, -0.5F, 2, 1, 1, 0F); // MG3

		gun_2_Model[1][5].addShapeBox(-10.5F, 0F, -0.5F, 2, 2, 1, 0F,-1F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, -1F, 0F, -0.15F, 0F, 0F, -0.15F, -0.6F, 0F, -0.15F, -0.6F, 0F, -0.15F, 0F, 0F, -0.15F); // MG4

		gun_2_Model[1][6].addBox(-2.5F, -1F, -0.9F, 2, 1, 2, 0F); // MG5

		gun_2_Model[1][7].addBox(-2.5F, -1F, -1.1F, 2, 1, 2, 0F); // MG6

		gun_2_Model[1][8].addShapeBox(-3.5F, -1F, -3F, 1, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // MG7

		gun_2_Model[1][9].addShapeBox(-0.6F, -2F, -0.5F, 1, 2, 1, 0F,-0.4F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.4F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // MG8

		gun_2_Model[1][10].addShapeBox(-6.5F, -2F, -0.5F, 2, 2, 1, 0F,-0.2F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // MG9

		gun_2_Model[1][11].addBox(-2.5F, -3F, 1F, 2, 3, 5, 0F); // Ammo

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[1])
		{
			gunPart.setRotationPoint(18F, -88F, 0F);
		}


		gun_2_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("TailGun", gun_2_Model);
	}
}