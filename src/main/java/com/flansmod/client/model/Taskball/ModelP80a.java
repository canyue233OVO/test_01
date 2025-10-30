//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: p80a
// Model Creator: TaskForce51
// Created on: 04.11.2022 - 01:58:53
// Last changed on: 04.11.2022 - 01:58:53

package com.flansmod.client.model.Taskball; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelP80a extends ModelPlane //Same as Filename
{
	int textureX = 2048;
	int textureY = 1024;

	public ModelP80a() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[536];
		noseModel = new ModelRendererTurbo[90];
		tailModel = new ModelRendererTurbo[117];
		leftWingModel = new ModelRendererTurbo[20];
		rightWingModel = new ModelRendererTurbo[20];
		yawFlapModel = new ModelRendererTurbo[1];
		pitchFlapLeftModel = new ModelRendererTurbo[2];
		pitchFlapRightModel = new ModelRendererTurbo[2];
		pitchFlapLeftWingModel = new ModelRendererTurbo[2];
		pitchFlapRightWingModel = new ModelRendererTurbo[2];
		bodyWheelModel = new ModelRendererTurbo[12];
		leftWingWheelModel = new ModelRendererTurbo[10];
		rightWingWheelModel = new ModelRendererTurbo[10];
		hudModel = new ModelRendererTurbo[1];

		initbodyModel_1();
		initbodyModel_2();
		initnoseModel_1();
		inittailModel_1();
		initleftWingModel_1();
		initrightWingModel_1();
		inityawFlapModel_1();
		initpitchFlapLeftModel_1();
		initpitchFlapRightModel_1();
		initpitchFlapLeftWingModel_1();
		initpitchFlapRightWingModel_1();
		initbodyWheelModel_1();
		initleftWingWheelModel_1();
		initrightWingWheelModel_1();
		inithudModel_1();

		translateAll(0F, 3F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 934, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 33, 934, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 57, 934, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 81, 934, textureX, textureY); // Box 4
		bodyModel[4] = new ModelRendererTurbo(this, 113, 934, textureX, textureY); // Box 5
		bodyModel[5] = new ModelRendererTurbo(this, 153, 934, textureX, textureY); // Box 6
		bodyModel[6] = new ModelRendererTurbo(this, 185, 934, textureX, textureY); // Box 7
		bodyModel[7] = new ModelRendererTurbo(this, 217, 934, textureX, textureY); // Box 8
		bodyModel[8] = new ModelRendererTurbo(this, 257, 934, textureX, textureY); // Box 9
		bodyModel[9] = new ModelRendererTurbo(this, 297, 934, textureX, textureY); // Box 10
		bodyModel[10] = new ModelRendererTurbo(this, 329, 934, textureX, textureY); // Box 11
		bodyModel[11] = new ModelRendererTurbo(this, 361, 934, textureX, textureY); // Box 12
		bodyModel[12] = new ModelRendererTurbo(this, 1, 982, textureX, textureY); // Box 13
		bodyModel[13] = new ModelRendererTurbo(this, 57, 982, textureX, textureY); // Box 14
		bodyModel[14] = new ModelRendererTurbo(this, 105, 982, textureX, textureY); // Box 15
		bodyModel[15] = new ModelRendererTurbo(this, 393, 934, textureX, textureY); // Box 19
		bodyModel[16] = new ModelRendererTurbo(this, 433, 934, textureX, textureY); // Box 20
		bodyModel[17] = new ModelRendererTurbo(this, 457, 934, textureX, textureY); // Box 21
		bodyModel[18] = new ModelRendererTurbo(this, 481, 934, textureX, textureY); // Box 22
		bodyModel[19] = new ModelRendererTurbo(this, 513, 934, textureX, textureY); // Box 25
		bodyModel[20] = new ModelRendererTurbo(this, 553, 934, textureX, textureY); // Box 26
		bodyModel[21] = new ModelRendererTurbo(this, 41, 982, textureX, textureY); // Box 27
		bodyModel[22] = new ModelRendererTurbo(this, 401, 982, textureX, textureY); // Box 28
		bodyModel[23] = new ModelRendererTurbo(this, 1, 878, textureX, textureY); // Box 29
		bodyModel[24] = new ModelRendererTurbo(this, 81, 878, textureX, textureY); // Box 30
		bodyModel[25] = new ModelRendererTurbo(this, 1, 836, textureX, textureY); // Box 31
		bodyModel[26] = new ModelRendererTurbo(this, 169, 878, textureX, textureY); // Box 32
		bodyModel[27] = new ModelRendererTurbo(this, 249, 878, textureX, textureY); // Box 33
		bodyModel[28] = new ModelRendererTurbo(this, 81, 836, textureX, textureY); // Box 34
		bodyModel[29] = new ModelRendererTurbo(this, 321, 878, textureX, textureY); // Box 35
		bodyModel[30] = new ModelRendererTurbo(this, 393, 878, textureX, textureY); // Box 36
		bodyModel[31] = new ModelRendererTurbo(this, 433, 878, textureX, textureY); // Box 37
		bodyModel[32] = new ModelRendererTurbo(this, 145, 836, textureX, textureY); // Box 38
		bodyModel[33] = new ModelRendererTurbo(this, 201, 836, textureX, textureY); // Box 39
		bodyModel[34] = new ModelRendererTurbo(this, 593, 934, textureX, textureY); // Box 48
		bodyModel[35] = new ModelRendererTurbo(this, 633, 934, textureX, textureY); // Box 49
		bodyModel[36] = new ModelRendererTurbo(this, 497, 878, textureX, textureY); // Box 50
		bodyModel[37] = new ModelRendererTurbo(this, 577, 878, textureX, textureY); // Box 51
		bodyModel[38] = new ModelRendererTurbo(this, 673, 934, textureX, textureY); // Box 52
		bodyModel[39] = new ModelRendererTurbo(this, 713, 934, textureX, textureY); // Box 53
		bodyModel[40] = new ModelRendererTurbo(this, 745, 934, textureX, textureY); // Box 54
		bodyModel[41] = new ModelRendererTurbo(this, 761, 934, textureX, textureY); // Box 55
		bodyModel[42] = new ModelRendererTurbo(this, 801, 934, textureX, textureY); // Box 56
		bodyModel[43] = new ModelRendererTurbo(this, 833, 934, textureX, textureY); // Box 61
		bodyModel[44] = new ModelRendererTurbo(this, 849, 934, textureX, textureY); // Box 62
		bodyModel[45] = new ModelRendererTurbo(this, 665, 878, textureX, textureY); // Box 65
		bodyModel[46] = new ModelRendererTurbo(this, 753, 878, textureX, textureY); // Box 66
		bodyModel[47] = new ModelRendererTurbo(this, 825, 878, textureX, textureY); // Box 67
		bodyModel[48] = new ModelRendererTurbo(this, 897, 934, textureX, textureY); // Box 68
		bodyModel[49] = new ModelRendererTurbo(this, 945, 934, textureX, textureY); // Box 69
		bodyModel[50] = new ModelRendererTurbo(this, 881, 934, textureX, textureY); // Box 70
		bodyModel[51] = new ModelRendererTurbo(this, 665, 934, textureX, textureY); // Box 71
		bodyModel[52] = new ModelRendererTurbo(this, 897, 878, textureX, textureY); // Box 72
		bodyModel[53] = new ModelRendererTurbo(this, 961, 878, textureX, textureY); // Box 73
		bodyModel[54] = new ModelRendererTurbo(this, 1033, 878, textureX, textureY); // Box 74
		bodyModel[55] = new ModelRendererTurbo(this, 569, 836, textureX, textureY); // Box 75
		bodyModel[56] = new ModelRendererTurbo(this, 1057, 878, textureX, textureY); // Box 76
		bodyModel[57] = new ModelRendererTurbo(this, 1, 934, textureX, textureY); // Box 77
		bodyModel[58] = new ModelRendererTurbo(this, 929, 934, textureX, textureY); // Box 78
		bodyModel[59] = new ModelRendererTurbo(this, 977, 934, textureX, textureY); // Box 79
		bodyModel[60] = new ModelRendererTurbo(this, 65, 878, textureX, textureY); // Box 81
		bodyModel[61] = new ModelRendererTurbo(this, 153, 878, textureX, textureY); // Box 82
		bodyModel[62] = new ModelRendererTurbo(this, 233, 878, textureX, textureY); // Box 83
		bodyModel[63] = new ModelRendererTurbo(this, 1001, 934, textureX, textureY); // Box 84
		bodyModel[64] = new ModelRendererTurbo(this, 505, 934, textureX, textureY); // Box 85
		bodyModel[65] = new ModelRendererTurbo(this, 801, 878, textureX, textureY); // Box 83
		bodyModel[66] = new ModelRendererTurbo(this, 561, 878, textureX, textureY); // Box 84
		bodyModel[67] = new ModelRendererTurbo(this, 649, 836, textureX, textureY); // Box 85
		bodyModel[68] = new ModelRendererTurbo(this, 1017, 934, textureX, textureY); // Box 86
		bodyModel[69] = new ModelRendererTurbo(this, 1129, 878, textureX, textureY); // Box 87
		bodyModel[70] = new ModelRendererTurbo(this, 1201, 878, textureX, textureY); // Box 88
		bodyModel[71] = new ModelRendererTurbo(this, 1273, 878, textureX, textureY); // Box 89
		bodyModel[72] = new ModelRendererTurbo(this, 1105, 878, textureX, textureY); // Box 90
		bodyModel[73] = new ModelRendererTurbo(this, 1049, 934, textureX, textureY); // Box 91
		bodyModel[74] = new ModelRendererTurbo(this, 1065, 934, textureX, textureY); // Box 92
		bodyModel[75] = new ModelRendererTurbo(this, 1129, 934, textureX, textureY); // Box 93
		bodyModel[76] = new ModelRendererTurbo(this, 1193, 934, textureX, textureY); // Box 94
		bodyModel[77] = new ModelRendererTurbo(this, 1225, 934, textureX, textureY); // Box 95
		bodyModel[78] = new ModelRendererTurbo(this, 1273, 934, textureX, textureY); // Box 96
		bodyModel[79] = new ModelRendererTurbo(this, 1105, 934, textureX, textureY); // Box 97
		bodyModel[80] = new ModelRendererTurbo(this, 1305, 934, textureX, textureY); // Box 98
		bodyModel[81] = new ModelRendererTurbo(this, 1361, 934, textureX, textureY); // Box 99
		bodyModel[82] = new ModelRendererTurbo(this, 1425, 934, textureX, textureY); // Box 100
		bodyModel[83] = new ModelRendererTurbo(this, 793, 934, textureX, textureY); // Box 101
		bodyModel[84] = new ModelRendererTurbo(this, 1169, 934, textureX, textureY); // Box 102
		bodyModel[85] = new ModelRendererTurbo(this, 609, 982, textureX, textureY); // Box 103
		bodyModel[86] = new ModelRendererTurbo(this, 697, 982, textureX, textureY); // Box 105
		bodyModel[87] = new ModelRendererTurbo(this, 1345, 878, textureX, textureY); // Box 108
		bodyModel[88] = new ModelRendererTurbo(this, 1417, 878, textureX, textureY); // Box 109
		bodyModel[89] = new ModelRendererTurbo(this, 1489, 878, textureX, textureY); // Box 110
		bodyModel[90] = new ModelRendererTurbo(this, 1553, 878, textureX, textureY); // Box 111
		bodyModel[91] = new ModelRendererTurbo(this, 1633, 878, textureX, textureY); // Box 112
		bodyModel[92] = new ModelRendererTurbo(this, 729, 836, textureX, textureY); // Box 113
		bodyModel[93] = new ModelRendererTurbo(this, 1673, 878, textureX, textureY); // Box 114
		bodyModel[94] = new ModelRendererTurbo(this, 1729, 878, textureX, textureY); // Box 115
		bodyModel[95] = new ModelRendererTurbo(this, 1177, 878, textureX, textureY); // Box 116
		bodyModel[96] = new ModelRendererTurbo(this, 1785, 878, textureX, textureY); // Box 117
		bodyModel[97] = new ModelRendererTurbo(this, 873, 878, textureX, textureY); // Box 118
		bodyModel[98] = new ModelRendererTurbo(this, 793, 836, textureX, textureY); // Box 119
		bodyModel[99] = new ModelRendererTurbo(this, 841, 982, textureX, textureY); // Box 124
		bodyModel[100] = new ModelRendererTurbo(this, 929, 982, textureX, textureY); // Box 126
		bodyModel[101] = new ModelRendererTurbo(this, 1057, 982, textureX, textureY); // Box 129
		bodyModel[102] = new ModelRendererTurbo(this, 705, 934, textureX, textureY); // Box 138
		bodyModel[103] = new ModelRendererTurbo(this, 1, 346, textureX, textureY); // Box 139
		bodyModel[104] = new ModelRendererTurbo(this, 1465, 934, textureX, textureY); // Box 140
		bodyModel[105] = new ModelRendererTurbo(this, 1345, 934, textureX, textureY); // Box 141
		bodyModel[106] = new ModelRendererTurbo(this, 1505, 934, textureX, textureY); // Box 142
		bodyModel[107] = new ModelRendererTurbo(this, 649, 878, textureX, textureY); // Box 198
		bodyModel[108] = new ModelRendererTurbo(this, 81, 934, textureX, textureY); // Box 232
		bodyModel[109] = new ModelRendererTurbo(this, 105, 934, textureX, textureY); // Box 233
		bodyModel[110] = new ModelRendererTurbo(this, 145, 934, textureX, textureY); // Box 234
		bodyModel[111] = new ModelRendererTurbo(this, 177, 934, textureX, textureY); // Box 235
		bodyModel[112] = new ModelRendererTurbo(this, 185, 934, textureX, textureY); // Box 236
		bodyModel[113] = new ModelRendererTurbo(this, 209, 934, textureX, textureY); // Box 237
		bodyModel[114] = new ModelRendererTurbo(this, 249, 934, textureX, textureY); // Box 238
		bodyModel[115] = new ModelRendererTurbo(this, 289, 934, textureX, textureY); // Box 239
		bodyModel[116] = new ModelRendererTurbo(this, 545, 934, textureX, textureY); // Box 240
		bodyModel[117] = new ModelRendererTurbo(this, 625, 934, textureX, textureY); // Box 241
		bodyModel[118] = new ModelRendererTurbo(this, 1073, 934, textureX, textureY); // Box 242
		bodyModel[119] = new ModelRendererTurbo(this, 1, 958, textureX, textureY); // Box 254
		bodyModel[120] = new ModelRendererTurbo(this, 33, 958, textureX, textureY); // Box 255
		bodyModel[121] = new ModelRendererTurbo(this, 57, 958, textureX, textureY); // Box 256
		bodyModel[122] = new ModelRendererTurbo(this, 81, 958, textureX, textureY); // Box 257
		bodyModel[123] = new ModelRendererTurbo(this, 113, 958, textureX, textureY); // Box 258
		bodyModel[124] = new ModelRendererTurbo(this, 153, 958, textureX, textureY); // Box 259
		bodyModel[125] = new ModelRendererTurbo(this, 185, 958, textureX, textureY); // Box 260
		bodyModel[126] = new ModelRendererTurbo(this, 217, 958, textureX, textureY); // Box 261
		bodyModel[127] = new ModelRendererTurbo(this, 257, 958, textureX, textureY); // Box 262
		bodyModel[128] = new ModelRendererTurbo(this, 297, 958, textureX, textureY); // Box 263
		bodyModel[129] = new ModelRendererTurbo(this, 329, 958, textureX, textureY); // Box 264
		bodyModel[130] = new ModelRendererTurbo(this, 361, 958, textureX, textureY); // Box 265
		bodyModel[131] = new ModelRendererTurbo(this, 1, 1003, textureX, textureY); // Box 266
		bodyModel[132] = new ModelRendererTurbo(this, 57, 1003, textureX, textureY); // Box 267
		bodyModel[133] = new ModelRendererTurbo(this, 105, 1003, textureX, textureY); // Box 268
		bodyModel[134] = new ModelRendererTurbo(this, 393, 958, textureX, textureY); // Box 272
		bodyModel[135] = new ModelRendererTurbo(this, 433, 958, textureX, textureY); // Box 273
		bodyModel[136] = new ModelRendererTurbo(this, 457, 958, textureX, textureY); // Box 274
		bodyModel[137] = new ModelRendererTurbo(this, 481, 958, textureX, textureY); // Box 275
		bodyModel[138] = new ModelRendererTurbo(this, 513, 958, textureX, textureY); // Box 278
		bodyModel[139] = new ModelRendererTurbo(this, 553, 958, textureX, textureY); // Box 279
		bodyModel[140] = new ModelRendererTurbo(this, 41, 1003, textureX, textureY); // Box 280
		bodyModel[141] = new ModelRendererTurbo(this, 401, 1003, textureX, textureY); // Box 281
		bodyModel[142] = new ModelRendererTurbo(this, 1, 906, textureX, textureY); // Box 282
		bodyModel[143] = new ModelRendererTurbo(this, 81, 906, textureX, textureY); // Box 283
		bodyModel[144] = new ModelRendererTurbo(this, 1, 857, textureX, textureY); // Box 284
		bodyModel[145] = new ModelRendererTurbo(this, 169, 906, textureX, textureY); // Box 285
		bodyModel[146] = new ModelRendererTurbo(this, 249, 906, textureX, textureY); // Box 286
		bodyModel[147] = new ModelRendererTurbo(this, 81, 857, textureX, textureY); // Box 287
		bodyModel[148] = new ModelRendererTurbo(this, 321, 906, textureX, textureY); // Box 288
		bodyModel[149] = new ModelRendererTurbo(this, 393, 906, textureX, textureY); // Box 289
		bodyModel[150] = new ModelRendererTurbo(this, 433, 906, textureX, textureY); // Box 290
		bodyModel[151] = new ModelRendererTurbo(this, 145, 857, textureX, textureY); // Box 291
		bodyModel[152] = new ModelRendererTurbo(this, 201, 857, textureX, textureY); // Box 292
		bodyModel[153] = new ModelRendererTurbo(this, 593, 958, textureX, textureY); // Box 301
		bodyModel[154] = new ModelRendererTurbo(this, 633, 958, textureX, textureY); // Box 302
		bodyModel[155] = new ModelRendererTurbo(this, 497, 906, textureX, textureY); // Box 303
		bodyModel[156] = new ModelRendererTurbo(this, 577, 906, textureX, textureY); // Box 304
		bodyModel[157] = new ModelRendererTurbo(this, 673, 958, textureX, textureY); // Box 305
		bodyModel[158] = new ModelRendererTurbo(this, 713, 958, textureX, textureY); // Box 306
		bodyModel[159] = new ModelRendererTurbo(this, 745, 958, textureX, textureY); // Box 307
		bodyModel[160] = new ModelRendererTurbo(this, 761, 958, textureX, textureY); // Box 308
		bodyModel[161] = new ModelRendererTurbo(this, 801, 958, textureX, textureY); // Box 309
		bodyModel[162] = new ModelRendererTurbo(this, 833, 958, textureX, textureY); // Box 312
		bodyModel[163] = new ModelRendererTurbo(this, 849, 958, textureX, textureY); // Box 313
		bodyModel[164] = new ModelRendererTurbo(this, 665, 906, textureX, textureY); // Box 316
		bodyModel[165] = new ModelRendererTurbo(this, 753, 906, textureX, textureY); // Box 317
		bodyModel[166] = new ModelRendererTurbo(this, 825, 906, textureX, textureY); // Box 318
		bodyModel[167] = new ModelRendererTurbo(this, 897, 958, textureX, textureY); // Box 319
		bodyModel[168] = new ModelRendererTurbo(this, 945, 958, textureX, textureY); // Box 320
		bodyModel[169] = new ModelRendererTurbo(this, 881, 958, textureX, textureY); // Box 321
		bodyModel[170] = new ModelRendererTurbo(this, 665, 958, textureX, textureY); // Box 322
		bodyModel[171] = new ModelRendererTurbo(this, 897, 906, textureX, textureY); // Box 323
		bodyModel[172] = new ModelRendererTurbo(this, 961, 906, textureX, textureY); // Box 324
		bodyModel[173] = new ModelRendererTurbo(this, 1033, 906, textureX, textureY); // Box 325
		bodyModel[174] = new ModelRendererTurbo(this, 569, 857, textureX, textureY); // Box 326
		bodyModel[175] = new ModelRendererTurbo(this, 1057, 906, textureX, textureY); // Box 327
		bodyModel[176] = new ModelRendererTurbo(this, 1, 958, textureX, textureY); // Box 328
		bodyModel[177] = new ModelRendererTurbo(this, 929, 958, textureX, textureY); // Box 329
		bodyModel[178] = new ModelRendererTurbo(this, 977, 958, textureX, textureY); // Box 330
		bodyModel[179] = new ModelRendererTurbo(this, 65, 906, textureX, textureY); // Box 331
		bodyModel[180] = new ModelRendererTurbo(this, 153, 906, textureX, textureY); // Box 332
		bodyModel[181] = new ModelRendererTurbo(this, 233, 906, textureX, textureY); // Box 333
		bodyModel[182] = new ModelRendererTurbo(this, 1001, 958, textureX, textureY); // Box 334
		bodyModel[183] = new ModelRendererTurbo(this, 505, 958, textureX, textureY); // Box 335
		bodyModel[184] = new ModelRendererTurbo(this, 801, 906, textureX, textureY); // Box 336
		bodyModel[185] = new ModelRendererTurbo(this, 561, 906, textureX, textureY); // Box 337
		bodyModel[186] = new ModelRendererTurbo(this, 649, 857, textureX, textureY); // Box 338
		bodyModel[187] = new ModelRendererTurbo(this, 1017, 958, textureX, textureY); // Box 339
		bodyModel[188] = new ModelRendererTurbo(this, 1129, 906, textureX, textureY); // Box 340
		bodyModel[189] = new ModelRendererTurbo(this, 1201, 906, textureX, textureY); // Box 341
		bodyModel[190] = new ModelRendererTurbo(this, 1273, 906, textureX, textureY); // Box 342
		bodyModel[191] = new ModelRendererTurbo(this, 1105, 906, textureX, textureY); // Box 343
		bodyModel[192] = new ModelRendererTurbo(this, 1049, 958, textureX, textureY); // Box 344
		bodyModel[193] = new ModelRendererTurbo(this, 1065, 958, textureX, textureY); // Box 345
		bodyModel[194] = new ModelRendererTurbo(this, 1129, 958, textureX, textureY); // Box 346
		bodyModel[195] = new ModelRendererTurbo(this, 1193, 958, textureX, textureY); // Box 347
		bodyModel[196] = new ModelRendererTurbo(this, 1225, 958, textureX, textureY); // Box 348
		bodyModel[197] = new ModelRendererTurbo(this, 1273, 958, textureX, textureY); // Box 349
		bodyModel[198] = new ModelRendererTurbo(this, 1105, 958, textureX, textureY); // Box 350
		bodyModel[199] = new ModelRendererTurbo(this, 1305, 958, textureX, textureY); // Box 351
		bodyModel[200] = new ModelRendererTurbo(this, 1361, 958, textureX, textureY); // Box 352
		bodyModel[201] = new ModelRendererTurbo(this, 1425, 958, textureX, textureY); // Box 353
		bodyModel[202] = new ModelRendererTurbo(this, 793, 958, textureX, textureY); // Box 354
		bodyModel[203] = new ModelRendererTurbo(this, 1169, 958, textureX, textureY); // Box 355
		bodyModel[204] = new ModelRendererTurbo(this, 609, 1003, textureX, textureY); // Box 356
		bodyModel[205] = new ModelRendererTurbo(this, 697, 1003, textureX, textureY); // Box 358
		bodyModel[206] = new ModelRendererTurbo(this, 1345, 906, textureX, textureY); // Box 361
		bodyModel[207] = new ModelRendererTurbo(this, 1417, 906, textureX, textureY); // Box 362
		bodyModel[208] = new ModelRendererTurbo(this, 1489, 906, textureX, textureY); // Box 363
		bodyModel[209] = new ModelRendererTurbo(this, 1553, 906, textureX, textureY); // Box 364
		bodyModel[210] = new ModelRendererTurbo(this, 1633, 906, textureX, textureY); // Box 365
		bodyModel[211] = new ModelRendererTurbo(this, 729, 857, textureX, textureY); // Box 366
		bodyModel[212] = new ModelRendererTurbo(this, 1673, 906, textureX, textureY); // Box 367
		bodyModel[213] = new ModelRendererTurbo(this, 1729, 906, textureX, textureY); // Box 368
		bodyModel[214] = new ModelRendererTurbo(this, 1177, 906, textureX, textureY); // Box 369
		bodyModel[215] = new ModelRendererTurbo(this, 1785, 906, textureX, textureY); // Box 370
		bodyModel[216] = new ModelRendererTurbo(this, 873, 906, textureX, textureY); // Box 371
		bodyModel[217] = new ModelRendererTurbo(this, 793, 857, textureX, textureY); // Box 372
		bodyModel[218] = new ModelRendererTurbo(this, 841, 1003, textureX, textureY); // Box 377
		bodyModel[219] = new ModelRendererTurbo(this, 929, 1003, textureX, textureY); // Box 379
		bodyModel[220] = new ModelRendererTurbo(this, 1057, 1003, textureX, textureY); // Box 382
		bodyModel[221] = new ModelRendererTurbo(this, 705, 958, textureX, textureY); // Box 391
		bodyModel[222] = new ModelRendererTurbo(this, 105, 346, textureX, textureY); // Box 392
		bodyModel[223] = new ModelRendererTurbo(this, 1465, 958, textureX, textureY); // Box 393
		bodyModel[224] = new ModelRendererTurbo(this, 1345, 958, textureX, textureY); // Box 394
		bodyModel[225] = new ModelRendererTurbo(this, 1505, 958, textureX, textureY); // Box 395
		bodyModel[226] = new ModelRendererTurbo(this, 649, 906, textureX, textureY); // Box 451
		bodyModel[227] = new ModelRendererTurbo(this, 81, 958, textureX, textureY); // Box 485
		bodyModel[228] = new ModelRendererTurbo(this, 105, 958, textureX, textureY); // Box 486
		bodyModel[229] = new ModelRendererTurbo(this, 145, 958, textureX, textureY); // Box 487
		bodyModel[230] = new ModelRendererTurbo(this, 177, 958, textureX, textureY); // Box 488
		bodyModel[231] = new ModelRendererTurbo(this, 185, 958, textureX, textureY); // Box 489
		bodyModel[232] = new ModelRendererTurbo(this, 209, 958, textureX, textureY); // Box 490
		bodyModel[233] = new ModelRendererTurbo(this, 249, 958, textureX, textureY); // Box 491
		bodyModel[234] = new ModelRendererTurbo(this, 289, 958, textureX, textureY); // Box 492
		bodyModel[235] = new ModelRendererTurbo(this, 545, 958, textureX, textureY); // Box 493
		bodyModel[236] = new ModelRendererTurbo(this, 625, 958, textureX, textureY); // Box 494
		bodyModel[237] = new ModelRendererTurbo(this, 1073, 958, textureX, textureY); // Box 495
		bodyModel[238] = new ModelRendererTurbo(this, 1, 408, textureX, textureY); // Box 262
		bodyModel[239] = new ModelRendererTurbo(this, 65, 408, textureX, textureY); // Box 255
		bodyModel[240] = new ModelRendererTurbo(this, 113, 408, textureX, textureY); // Box 257
		bodyModel[241] = new ModelRendererTurbo(this, 41, 408, textureX, textureY); // Box 258
		bodyModel[242] = new ModelRendererTurbo(this, 1, 408, textureX, textureY); // Box 213
		bodyModel[243] = new ModelRendererTurbo(this, 65, 408, textureX, textureY); // Box 214
		bodyModel[244] = new ModelRendererTurbo(this, 1, 408, textureX, textureY); // Box 233
		bodyModel[245] = new ModelRendererTurbo(this, 41, 408, textureX, textureY); // Box 234
		bodyModel[246] = new ModelRendererTurbo(this, 49, 408, textureX, textureY); // Box 235
		bodyModel[247] = new ModelRendererTurbo(this, 65, 408, textureX, textureY); // Box 236
		bodyModel[248] = new ModelRendererTurbo(this, 89, 408, textureX, textureY); // Box 237
		bodyModel[249] = new ModelRendererTurbo(this, 97, 408, textureX, textureY); // Box 238
		bodyModel[250] = new ModelRendererTurbo(this, 105, 408, textureX, textureY); // Box 239
		bodyModel[251] = new ModelRendererTurbo(this, 113, 408, textureX, textureY); // Box 240
		bodyModel[252] = new ModelRendererTurbo(this, 121, 408, textureX, textureY); // Box 241
		bodyModel[253] = new ModelRendererTurbo(this, 137, 408, textureX, textureY); // Box 242
		bodyModel[254] = new ModelRendererTurbo(this, 145, 408, textureX, textureY); // Box 243
		bodyModel[255] = new ModelRendererTurbo(this, 153, 408, textureX, textureY); // Box 244
		bodyModel[256] = new ModelRendererTurbo(this, 161, 408, textureX, textureY); // Box 248
		bodyModel[257] = new ModelRendererTurbo(this, 169, 408, textureX, textureY); // Box 249
		bodyModel[258] = new ModelRendererTurbo(this, 177, 408, textureX, textureY); // Box 250
		bodyModel[259] = new ModelRendererTurbo(this, 185, 408, textureX, textureY); // Box 251
		bodyModel[260] = new ModelRendererTurbo(this, 193, 408, textureX, textureY); // Box 252
		bodyModel[261] = new ModelRendererTurbo(this, 201, 408, textureX, textureY); // Box 253
		bodyModel[262] = new ModelRendererTurbo(this, 209, 408, textureX, textureY); // Box 254
		bodyModel[263] = new ModelRendererTurbo(this, 217, 408, textureX, textureY); // Box 255
		bodyModel[264] = new ModelRendererTurbo(this, 225, 408, textureX, textureY); // Box 256
		bodyModel[265] = new ModelRendererTurbo(this, 233, 408, textureX, textureY); // Box 257
		bodyModel[266] = new ModelRendererTurbo(this, 241, 408, textureX, textureY); // Box 258
		bodyModel[267] = new ModelRendererTurbo(this, 249, 408, textureX, textureY); // Box 259
		bodyModel[268] = new ModelRendererTurbo(this, 257, 408, textureX, textureY); // Box 260
		bodyModel[269] = new ModelRendererTurbo(this, 265, 408, textureX, textureY); // Box 261
		bodyModel[270] = new ModelRendererTurbo(this, 273, 408, textureX, textureY); // Box 262
		bodyModel[271] = new ModelRendererTurbo(this, 281, 408, textureX, textureY); // Box 263
		bodyModel[272] = new ModelRendererTurbo(this, 289, 408, textureX, textureY); // Box 265
		bodyModel[273] = new ModelRendererTurbo(this, 297, 408, textureX, textureY); // Box 266
		bodyModel[274] = new ModelRendererTurbo(this, 305, 408, textureX, textureY); // Box 267
		bodyModel[275] = new ModelRendererTurbo(this, 313, 408, textureX, textureY); // Box 268
		bodyModel[276] = new ModelRendererTurbo(this, 321, 408, textureX, textureY); // Box 269
		bodyModel[277] = new ModelRendererTurbo(this, 329, 408, textureX, textureY); // Box 270
		bodyModel[278] = new ModelRendererTurbo(this, 337, 408, textureX, textureY); // Box 271
		bodyModel[279] = new ModelRendererTurbo(this, 345, 408, textureX, textureY); // Box 272
		bodyModel[280] = new ModelRendererTurbo(this, 353, 408, textureX, textureY); // Box 273
		bodyModel[281] = new ModelRendererTurbo(this, 361, 408, textureX, textureY); // Box 274
		bodyModel[282] = new ModelRendererTurbo(this, 369, 408, textureX, textureY); // Box 275
		bodyModel[283] = new ModelRendererTurbo(this, 377, 408, textureX, textureY); // Box 276
		bodyModel[284] = new ModelRendererTurbo(this, 385, 408, textureX, textureY); // Box 277
		bodyModel[285] = new ModelRendererTurbo(this, 393, 408, textureX, textureY); // Box 278
		bodyModel[286] = new ModelRendererTurbo(this, 401, 408, textureX, textureY); // Box 279
		bodyModel[287] = new ModelRendererTurbo(this, 409, 408, textureX, textureY); // Box 280
		bodyModel[288] = new ModelRendererTurbo(this, 417, 408, textureX, textureY); // Box 281
		bodyModel[289] = new ModelRendererTurbo(this, 425, 408, textureX, textureY); // Box 282
		bodyModel[290] = new ModelRendererTurbo(this, 433, 408, textureX, textureY); // Box 283
		bodyModel[291] = new ModelRendererTurbo(this, 441, 408, textureX, textureY); // Box 284
		bodyModel[292] = new ModelRendererTurbo(this, 449, 408, textureX, textureY); // Box 285
		bodyModel[293] = new ModelRendererTurbo(this, 457, 408, textureX, textureY); // Box 286
		bodyModel[294] = new ModelRendererTurbo(this, 465, 408, textureX, textureY); // Box 287
		bodyModel[295] = new ModelRendererTurbo(this, 473, 408, textureX, textureY); // Box 288
		bodyModel[296] = new ModelRendererTurbo(this, 481, 408, textureX, textureY); // Box 289
		bodyModel[297] = new ModelRendererTurbo(this, 489, 408, textureX, textureY); // Box 290
		bodyModel[298] = new ModelRendererTurbo(this, 497, 408, textureX, textureY); // Box 318
		bodyModel[299] = new ModelRendererTurbo(this, 505, 408, textureX, textureY); // Box 319
		bodyModel[300] = new ModelRendererTurbo(this, 513, 408, textureX, textureY); // Box 320
		bodyModel[301] = new ModelRendererTurbo(this, 521, 408, textureX, textureY); // Box 321
		bodyModel[302] = new ModelRendererTurbo(this, 529, 408, textureX, textureY); // Box 322
		bodyModel[303] = new ModelRendererTurbo(this, 537, 408, textureX, textureY); // Box 323
		bodyModel[304] = new ModelRendererTurbo(this, 545, 408, textureX, textureY); // Box 324
		bodyModel[305] = new ModelRendererTurbo(this, 553, 408, textureX, textureY); // Box 325
		bodyModel[306] = new ModelRendererTurbo(this, 561, 408, textureX, textureY); // Box 326
		bodyModel[307] = new ModelRendererTurbo(this, 569, 408, textureX, textureY); // Box 327
		bodyModel[308] = new ModelRendererTurbo(this, 577, 408, textureX, textureY); // Box 328
		bodyModel[309] = new ModelRendererTurbo(this, 585, 408, textureX, textureY); // Box 329
		bodyModel[310] = new ModelRendererTurbo(this, 593, 408, textureX, textureY); // Box 330
		bodyModel[311] = new ModelRendererTurbo(this, 601, 408, textureX, textureY); // Box 331
		bodyModel[312] = new ModelRendererTurbo(this, 609, 408, textureX, textureY); // Box 332
		bodyModel[313] = new ModelRendererTurbo(this, 617, 408, textureX, textureY); // Box 333
		bodyModel[314] = new ModelRendererTurbo(this, 625, 408, textureX, textureY); // Box 334
		bodyModel[315] = new ModelRendererTurbo(this, 633, 408, textureX, textureY); // Box 340
		bodyModel[316] = new ModelRendererTurbo(this, 641, 408, textureX, textureY); // Box 341
		bodyModel[317] = new ModelRendererTurbo(this, 649, 408, textureX, textureY); // Box 342
		bodyModel[318] = new ModelRendererTurbo(this, 657, 408, textureX, textureY); // Box 343
		bodyModel[319] = new ModelRendererTurbo(this, 665, 408, textureX, textureY); // Box 344
		bodyModel[320] = new ModelRendererTurbo(this, 673, 408, textureX, textureY); // Box 345
		bodyModel[321] = new ModelRendererTurbo(this, 681, 408, textureX, textureY); // Box 346
		bodyModel[322] = new ModelRendererTurbo(this, 689, 408, textureX, textureY); // Box 347
		bodyModel[323] = new ModelRendererTurbo(this, 697, 408, textureX, textureY); // Box 348
		bodyModel[324] = new ModelRendererTurbo(this, 705, 408, textureX, textureY); // Box 349
		bodyModel[325] = new ModelRendererTurbo(this, 713, 408, textureX, textureY); // Box 350
		bodyModel[326] = new ModelRendererTurbo(this, 721, 408, textureX, textureY); // Box 351
		bodyModel[327] = new ModelRendererTurbo(this, 729, 408, textureX, textureY); // Box 352
		bodyModel[328] = new ModelRendererTurbo(this, 737, 408, textureX, textureY); // Box 353
		bodyModel[329] = new ModelRendererTurbo(this, 745, 408, textureX, textureY); // Box 354
		bodyModel[330] = new ModelRendererTurbo(this, 753, 408, textureX, textureY); // Box 355
		bodyModel[331] = new ModelRendererTurbo(this, 761, 408, textureX, textureY); // Box 356
		bodyModel[332] = new ModelRendererTurbo(this, 769, 408, textureX, textureY); // Box 387
		bodyModel[333] = new ModelRendererTurbo(this, 777, 408, textureX, textureY); // Box 388
		bodyModel[334] = new ModelRendererTurbo(this, 785, 408, textureX, textureY); // Box 390
		bodyModel[335] = new ModelRendererTurbo(this, 793, 408, textureX, textureY); // Box 391
		bodyModel[336] = new ModelRendererTurbo(this, 801, 408, textureX, textureY); // Box 392
		bodyModel[337] = new ModelRendererTurbo(this, 809, 408, textureX, textureY); // Box 393
		bodyModel[338] = new ModelRendererTurbo(this, 817, 408, textureX, textureY); // Box 394
		bodyModel[339] = new ModelRendererTurbo(this, 825, 408, textureX, textureY); // Box 395
		bodyModel[340] = new ModelRendererTurbo(this, 833, 408, textureX, textureY); // Box 396
		bodyModel[341] = new ModelRendererTurbo(this, 841, 408, textureX, textureY); // Box 397
		bodyModel[342] = new ModelRendererTurbo(this, 849, 408, textureX, textureY); // Box 398
		bodyModel[343] = new ModelRendererTurbo(this, 857, 408, textureX, textureY); // Box 399
		bodyModel[344] = new ModelRendererTurbo(this, 865, 408, textureX, textureY); // Box 400
		bodyModel[345] = new ModelRendererTurbo(this, 873, 408, textureX, textureY); // Box 401
		bodyModel[346] = new ModelRendererTurbo(this, 881, 408, textureX, textureY); // Box 402
		bodyModel[347] = new ModelRendererTurbo(this, 889, 408, textureX, textureY); // Box 403
		bodyModel[348] = new ModelRendererTurbo(this, 897, 408, textureX, textureY); // Box 404
		bodyModel[349] = new ModelRendererTurbo(this, 905, 408, textureX, textureY); // Box 405
		bodyModel[350] = new ModelRendererTurbo(this, 913, 408, textureX, textureY); // Box 406
		bodyModel[351] = new ModelRendererTurbo(this, 921, 408, textureX, textureY); // Box 407
		bodyModel[352] = new ModelRendererTurbo(this, 929, 408, textureX, textureY); // Box 408
		bodyModel[353] = new ModelRendererTurbo(this, 937, 408, textureX, textureY); // Box 409
		bodyModel[354] = new ModelRendererTurbo(this, 945, 408, textureX, textureY); // Box 410
		bodyModel[355] = new ModelRendererTurbo(this, 953, 408, textureX, textureY); // Box 411
		bodyModel[356] = new ModelRendererTurbo(this, 961, 408, textureX, textureY); // Box 412
		bodyModel[357] = new ModelRendererTurbo(this, 969, 408, textureX, textureY); // Box 413
		bodyModel[358] = new ModelRendererTurbo(this, 977, 408, textureX, textureY); // Box 414
		bodyModel[359] = new ModelRendererTurbo(this, 985, 408, textureX, textureY); // Box 415
		bodyModel[360] = new ModelRendererTurbo(this, 993, 408, textureX, textureY); // Box 416
		bodyModel[361] = new ModelRendererTurbo(this, 1001, 408, textureX, textureY); // Box 417
		bodyModel[362] = new ModelRendererTurbo(this, 1009, 408, textureX, textureY); // Box 418
		bodyModel[363] = new ModelRendererTurbo(this, 1017, 408, textureX, textureY); // Box 419
		bodyModel[364] = new ModelRendererTurbo(this, 1025, 408, textureX, textureY); // Box 421
		bodyModel[365] = new ModelRendererTurbo(this, 1033, 408, textureX, textureY); // Box 422
		bodyModel[366] = new ModelRendererTurbo(this, 1041, 408, textureX, textureY); // Box 423
		bodyModel[367] = new ModelRendererTurbo(this, 1049, 408, textureX, textureY); // Box 424
		bodyModel[368] = new ModelRendererTurbo(this, 1057, 408, textureX, textureY); // Box 425
		bodyModel[369] = new ModelRendererTurbo(this, 1065, 408, textureX, textureY); // Box 426
		bodyModel[370] = new ModelRendererTurbo(this, 1073, 408, textureX, textureY); // Box 427
		bodyModel[371] = new ModelRendererTurbo(this, 1081, 408, textureX, textureY); // Box 428
		bodyModel[372] = new ModelRendererTurbo(this, 1089, 408, textureX, textureY); // Box 429
		bodyModel[373] = new ModelRendererTurbo(this, 1097, 408, textureX, textureY); // Box 430
		bodyModel[374] = new ModelRendererTurbo(this, 1105, 408, textureX, textureY); // Box 431
		bodyModel[375] = new ModelRendererTurbo(this, 1113, 408, textureX, textureY); // Box 432
		bodyModel[376] = new ModelRendererTurbo(this, 1121, 408, textureX, textureY); // Box 433
		bodyModel[377] = new ModelRendererTurbo(this, 1129, 408, textureX, textureY); // Box 434
		bodyModel[378] = new ModelRendererTurbo(this, 1137, 408, textureX, textureY); // Box 435
		bodyModel[379] = new ModelRendererTurbo(this, 1145, 408, textureX, textureY); // Box 436
		bodyModel[380] = new ModelRendererTurbo(this, 1153, 408, textureX, textureY); // Box 437
		bodyModel[381] = new ModelRendererTurbo(this, 1161, 408, textureX, textureY); // Box 438
		bodyModel[382] = new ModelRendererTurbo(this, 1169, 408, textureX, textureY); // Box 439
		bodyModel[383] = new ModelRendererTurbo(this, 1177, 408, textureX, textureY); // Box 440
		bodyModel[384] = new ModelRendererTurbo(this, 1185, 408, textureX, textureY); // Box 441
		bodyModel[385] = new ModelRendererTurbo(this, 1193, 408, textureX, textureY); // Box 442
		bodyModel[386] = new ModelRendererTurbo(this, 1201, 408, textureX, textureY); // Box 443
		bodyModel[387] = new ModelRendererTurbo(this, 1209, 408, textureX, textureY); // Box 444
		bodyModel[388] = new ModelRendererTurbo(this, 1217, 408, textureX, textureY); // Box 445
		bodyModel[389] = new ModelRendererTurbo(this, 1225, 408, textureX, textureY); // Box 446
		bodyModel[390] = new ModelRendererTurbo(this, 1233, 408, textureX, textureY); // Box 447
		bodyModel[391] = new ModelRendererTurbo(this, 1241, 408, textureX, textureY); // Box 448
		bodyModel[392] = new ModelRendererTurbo(this, 1249, 408, textureX, textureY); // Box 449
		bodyModel[393] = new ModelRendererTurbo(this, 1257, 408, textureX, textureY); // Box 450
		bodyModel[394] = new ModelRendererTurbo(this, 1265, 408, textureX, textureY); // Box 451
		bodyModel[395] = new ModelRendererTurbo(this, 1273, 408, textureX, textureY); // Box 452
		bodyModel[396] = new ModelRendererTurbo(this, 1281, 408, textureX, textureY); // Box 453
		bodyModel[397] = new ModelRendererTurbo(this, 1289, 408, textureX, textureY); // Box 454
		bodyModel[398] = new ModelRendererTurbo(this, 1297, 408, textureX, textureY); // Box 455
		bodyModel[399] = new ModelRendererTurbo(this, 1305, 408, textureX, textureY); // Box 456
		bodyModel[400] = new ModelRendererTurbo(this, 1313, 408, textureX, textureY); // Box 457
		bodyModel[401] = new ModelRendererTurbo(this, 1321, 408, textureX, textureY); // Box 458
		bodyModel[402] = new ModelRendererTurbo(this, 1329, 408, textureX, textureY); // Box 459
		bodyModel[403] = new ModelRendererTurbo(this, 1337, 408, textureX, textureY); // Box 460
		bodyModel[404] = new ModelRendererTurbo(this, 1345, 408, textureX, textureY); // Box 461
		bodyModel[405] = new ModelRendererTurbo(this, 1353, 408, textureX, textureY); // Box 462
		bodyModel[406] = new ModelRendererTurbo(this, 1361, 408, textureX, textureY); // Box 463
		bodyModel[407] = new ModelRendererTurbo(this, 1369, 408, textureX, textureY); // Box 464
		bodyModel[408] = new ModelRendererTurbo(this, 1377, 408, textureX, textureY); // Box 465
		bodyModel[409] = new ModelRendererTurbo(this, 1385, 408, textureX, textureY); // Box 466
		bodyModel[410] = new ModelRendererTurbo(this, 1393, 408, textureX, textureY); // Box 467
		bodyModel[411] = new ModelRendererTurbo(this, 1401, 408, textureX, textureY); // Box 468
		bodyModel[412] = new ModelRendererTurbo(this, 1409, 408, textureX, textureY); // Box 469
		bodyModel[413] = new ModelRendererTurbo(this, 1417, 408, textureX, textureY); // Box 470
		bodyModel[414] = new ModelRendererTurbo(this, 1425, 408, textureX, textureY); // Box 471
		bodyModel[415] = new ModelRendererTurbo(this, 1433, 408, textureX, textureY); // Box 472
		bodyModel[416] = new ModelRendererTurbo(this, 1441, 408, textureX, textureY); // Box 473
		bodyModel[417] = new ModelRendererTurbo(this, 1449, 408, textureX, textureY); // Box 474
		bodyModel[418] = new ModelRendererTurbo(this, 1457, 408, textureX, textureY); // Box 475
		bodyModel[419] = new ModelRendererTurbo(this, 1465, 408, textureX, textureY); // Box 476
		bodyModel[420] = new ModelRendererTurbo(this, 1473, 408, textureX, textureY); // Box 477
		bodyModel[421] = new ModelRendererTurbo(this, 1481, 408, textureX, textureY); // Box 478
		bodyModel[422] = new ModelRendererTurbo(this, 1489, 408, textureX, textureY); // Box 480
		bodyModel[423] = new ModelRendererTurbo(this, 1497, 408, textureX, textureY); // Box 481
		bodyModel[424] = new ModelRendererTurbo(this, 1505, 408, textureX, textureY); // Box 482
		bodyModel[425] = new ModelRendererTurbo(this, 1513, 408, textureX, textureY); // Box 483
		bodyModel[426] = new ModelRendererTurbo(this, 1521, 408, textureX, textureY); // Box 484
		bodyModel[427] = new ModelRendererTurbo(this, 1529, 408, textureX, textureY); // Box 485
		bodyModel[428] = new ModelRendererTurbo(this, 1537, 408, textureX, textureY); // Box 486
		bodyModel[429] = new ModelRendererTurbo(this, 1545, 408, textureX, textureY); // Box 487
		bodyModel[430] = new ModelRendererTurbo(this, 1553, 408, textureX, textureY); // Box 488
		bodyModel[431] = new ModelRendererTurbo(this, 1561, 408, textureX, textureY); // Box 489
		bodyModel[432] = new ModelRendererTurbo(this, 1569, 408, textureX, textureY); // Box 460
		bodyModel[433] = new ModelRendererTurbo(this, 1577, 408, textureX, textureY); // Box 461
		bodyModel[434] = new ModelRendererTurbo(this, 1585, 408, textureX, textureY); // Box 462
		bodyModel[435] = new ModelRendererTurbo(this, 1593, 408, textureX, textureY); // Box 463
		bodyModel[436] = new ModelRendererTurbo(this, 1601, 408, textureX, textureY); // Box 464
		bodyModel[437] = new ModelRendererTurbo(this, 1609, 408, textureX, textureY); // Box 465
		bodyModel[438] = new ModelRendererTurbo(this, 1617, 408, textureX, textureY); // Box 466
		bodyModel[439] = new ModelRendererTurbo(this, 1625, 408, textureX, textureY); // Box 467
		bodyModel[440] = new ModelRendererTurbo(this, 1633, 408, textureX, textureY); // Box 468
		bodyModel[441] = new ModelRendererTurbo(this, 1641, 408, textureX, textureY); // Box 469
		bodyModel[442] = new ModelRendererTurbo(this, 1649, 408, textureX, textureY); // Box 470
		bodyModel[443] = new ModelRendererTurbo(this, 1657, 408, textureX, textureY); // Box 471
		bodyModel[444] = new ModelRendererTurbo(this, 1665, 408, textureX, textureY); // Box 472
		bodyModel[445] = new ModelRendererTurbo(this, 1673, 408, textureX, textureY); // Box 473
		bodyModel[446] = new ModelRendererTurbo(this, 1681, 408, textureX, textureY); // Box 474
		bodyModel[447] = new ModelRendererTurbo(this, 1689, 408, textureX, textureY); // Box 475
		bodyModel[448] = new ModelRendererTurbo(this, 1697, 408, textureX, textureY); // Box 476
		bodyModel[449] = new ModelRendererTurbo(this, 1705, 408, textureX, textureY); // Box 477
		bodyModel[450] = new ModelRendererTurbo(this, 1713, 408, textureX, textureY); // Box 478
		bodyModel[451] = new ModelRendererTurbo(this, 1721, 408, textureX, textureY); // Box 479
		bodyModel[452] = new ModelRendererTurbo(this, 1729, 408, textureX, textureY); // Box 480
		bodyModel[453] = new ModelRendererTurbo(this, 1737, 408, textureX, textureY); // Box 481
		bodyModel[454] = new ModelRendererTurbo(this, 1745, 408, textureX, textureY); // Box 482
		bodyModel[455] = new ModelRendererTurbo(this, 1753, 408, textureX, textureY); // Box 483
		bodyModel[456] = new ModelRendererTurbo(this, 1761, 408, textureX, textureY); // Box 484
		bodyModel[457] = new ModelRendererTurbo(this, 1769, 408, textureX, textureY); // Box 485
		bodyModel[458] = new ModelRendererTurbo(this, 1777, 408, textureX, textureY); // Box 486
		bodyModel[459] = new ModelRendererTurbo(this, 1777, 408, textureX, textureY); // Box 487
		bodyModel[460] = new ModelRendererTurbo(this, 1785, 408, textureX, textureY); // Box 462
		bodyModel[461] = new ModelRendererTurbo(this, 1817, 408, textureX, textureY); // Box 463
		bodyModel[462] = new ModelRendererTurbo(this, 1833, 408, textureX, textureY); // Box 465
		bodyModel[463] = new ModelRendererTurbo(this, 1849, 408, textureX, textureY); // Box 466
		bodyModel[464] = new ModelRendererTurbo(this, 1865, 408, textureX, textureY); // Box 467
		bodyModel[465] = new ModelRendererTurbo(this, 1873, 408, textureX, textureY); // Box 468
		bodyModel[466] = new ModelRendererTurbo(this, 1881, 408, textureX, textureY); // Box 469
		bodyModel[467] = new ModelRendererTurbo(this, 1889, 408, textureX, textureY); // Box 470
		bodyModel[468] = new ModelRendererTurbo(this, 1897, 408, textureX, textureY); // Box 471
		bodyModel[469] = new ModelRendererTurbo(this, 1905, 408, textureX, textureY); // Box 472
		bodyModel[470] = new ModelRendererTurbo(this, 1913, 408, textureX, textureY); // Box 512
		bodyModel[471] = new ModelRendererTurbo(this, 1929, 408, textureX, textureY); // Box 513
		bodyModel[472] = new ModelRendererTurbo(this, 1953, 408, textureX, textureY); // Box 514
		bodyModel[473] = new ModelRendererTurbo(this, 1969, 408, textureX, textureY); // Box 515
		bodyModel[474] = new ModelRendererTurbo(this, 1985, 408, textureX, textureY); // Box 516
		bodyModel[475] = new ModelRendererTurbo(this, 2001, 408, textureX, textureY); // Box 517
		bodyModel[476] = new ModelRendererTurbo(this, 2025, 408, textureX, textureY); // Box 517
		bodyModel[477] = new ModelRendererTurbo(this, 313, 416, textureX, textureY); // Box 518
		bodyModel[478] = new ModelRendererTurbo(this, 1, 382, textureX, textureY); // Box 239
		bodyModel[479] = new ModelRendererTurbo(this, 49, 382, textureX, textureY); // Box 240
		bodyModel[480] = new ModelRendererTurbo(this, 33, 382, textureX, textureY); // Box 241
		bodyModel[481] = new ModelRendererTurbo(this, 65, 382, textureX, textureY); // Box 242
		bodyModel[482] = new ModelRendererTurbo(this, 81, 382, textureX, textureY); // Box 243
		bodyModel[483] = new ModelRendererTurbo(this, 105, 382, textureX, textureY); // Box 244
		bodyModel[484] = new ModelRendererTurbo(this, 129, 382, textureX, textureY); // Box 245
		bodyModel[485] = new ModelRendererTurbo(this, 145, 382, textureX, textureY); // Box 246
		bodyModel[486] = new ModelRendererTurbo(this, 169, 382, textureX, textureY); // Box 247
		bodyModel[487] = new ModelRendererTurbo(this, 177, 382, textureX, textureY); // Box 248
		bodyModel[488] = new ModelRendererTurbo(this, 185, 382, textureX, textureY); // Box 250
		bodyModel[489] = new ModelRendererTurbo(this, 193, 382, textureX, textureY); // Box 251
		bodyModel[490] = new ModelRendererTurbo(this, 201, 382, textureX, textureY); // Box 252
		bodyModel[491] = new ModelRendererTurbo(this, 225, 382, textureX, textureY); // Box 253
		bodyModel[492] = new ModelRendererTurbo(this, 1, 382, textureX, textureY); // Box 962
		bodyModel[493] = new ModelRendererTurbo(this, 49, 382, textureX, textureY); // Box 964
		bodyModel[494] = new ModelRendererTurbo(this, 81, 382, textureX, textureY); // Box 966
		bodyModel[495] = new ModelRendererTurbo(this, 209, 346, textureX, textureY); // Box 256
		bodyModel[496] = new ModelRendererTurbo(this, 233, 346, textureX, textureY); // Box 249
		bodyModel[497] = new ModelRendererTurbo(this, 257, 346, textureX, textureY); // Box 254
		bodyModel[498] = new ModelRendererTurbo(this, 1, 346, textureX, textureY); // Box 263
		bodyModel[499] = new ModelRendererTurbo(this, 97, 346, textureX, textureY); // Box 264

		bodyModel[0].addShapeBox(0F, 0F, 0F, 9, 4, 6, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 0
		bodyModel[0].setRotationPoint(-38F, -29F, -14F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F,0F, 0F, -1.5F, 0F, 0.5F, -3F, 0F, 0.5F, 2F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[1].setRotationPoint(-38F, -30F, -10F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 3
		bodyModel[2].setRotationPoint(-46F, -30F, -10F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 8, 4, 5, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 4
		bodyModel[3].setRotationPoint(-46F, -29F, -13F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 13, 4, 5, 0F,0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 5
		bodyModel[4].setRotationPoint(-59F, -29F, -13F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 8, 3, 5, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[5].setRotationPoint(-46F, -25F, -15F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 8, 3, 7, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[6].setRotationPoint(-46F, -22F, -17F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 13, 3, 5, 0F,0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[7].setRotationPoint(-59F, -25F, -15F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 13, 3, 5, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 9
		bodyModel[8].setRotationPoint(-59F, -22F, -15F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 9, 3, 6, 0F,0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[9].setRotationPoint(-38F, -25F, -16F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 9, 3, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[10].setRotationPoint(-29F, -25F, -16F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 9, 4, 6, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 12
		bodyModel[11].setRotationPoint(-29F, -29F, -14F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 10, 3, 14, 0F,0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 2F, 0F); // Box 13
		bodyModel[12].setRotationPoint(-69F, -25F, -14F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 10, 4, 12, 0F,0F, -1F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[13].setRotationPoint(-69F, -29F, -12F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 7, 5, 15, 0F,0F, -2F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[14].setRotationPoint(-66F, -22F, -15F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 13, 2, 8, 0F,0F, -1F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, -5.5F, 1F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, -6.5F, -5.5F, 1F, -6.5F); // Box 19
		bodyModel[15].setRotationPoint(-59F, -19F, -18F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 8, 2, 3, 0F,-0.5F, -1F, -2F, 0F, 0.5F, -1.5F, 0F, 0.5F, 0.5F, -0.5F, -1F, 0.5F, -2F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -2F, 0F, -0.5F); // Box 20
		bodyModel[16].setRotationPoint(-54F, -17F, -20F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 6, 5, 4, 0F,0F, -1F, -2F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -2.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 21
		bodyModel[17].setRotationPoint(-52F, -14F, -22F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 6, 2, 7, 0F,0F, 1F, -2.5F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 1F, -3F, 0F, -0.5F, -6F, 0F, 0F, -3F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F); // Box 22
		bodyModel[18].setRotationPoint(-52F, -9F, -22F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 9, 2, 7, 0F,0F, -0.5F, -3F, 1.5F, 0.5F, -6F, 1.5F, 0.5F, 0F, 0F, -0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 25
		bodyModel[19].setRotationPoint(-29F, -31F, -10F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 13, 2, 6, 0F,-2F, 0F, -5F, 0F, -1F, -1.5F, 0F, -1F, -3.5F, -2F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 26
		bodyModel[20].setRotationPoint(-59F, -31F, -10F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 2, 2, 9, 0F,0F, 0F, -3.9999F, 0F, 0F, -3.9999F, 0F, 0.49999F, 0F, 0F, 0.49999F, 0F, 0F, 0F, 0F, -1.9999F, 0F, 0F, -1.9999F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[21].setRotationPoint(-59F, -31F, -9F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 10, 2, 9, 0F,0F, -0.5F, -4F, 0F, 0F, -4F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 28
		bodyModel[22].setRotationPoint(-69F, -31F, -9F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 22, 3, 16, 0F,0F, 0F, -2F, 0F, 0.5F, -2.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[23].setRotationPoint(-20F, -25F, -16F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 26, 4, 16, 0F,0F, 0.5F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[24].setRotationPoint(2F, -25F, -16F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 22, 4, 15, 0F,0F, 0F, -1.5F, 0F, -0.5F, -3F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[25].setRotationPoint(28F, -25F, -15F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 22, 3, 14, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 1F, 0F); // Box 32
		bodyModel[26].setRotationPoint(-20F, -29F, -14F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 26, 3, 14, 0F,0F, 0F, -4F, 0F, -0.5F, -4F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, 0F, 0F, 0.5F, 0F); // Box 33
		bodyModel[27].setRotationPoint(2F, -29F, -14F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 22, 3, 14, 0F,0F, 0.5F, -4F, 0F, -0.5F, -4.5F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, -2F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[28].setRotationPoint(28F, -28F, -14F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 22, 3, 10, 0F,-8F, 0F, -7F, 0F, -0.5F, -4.5F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[29].setRotationPoint(-20F, -32F, -10F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 8, 3, 10, 0F,-1.49999F, -0.49999F, -5.9999F, 0F, 0F, -6.9999F, 0F, 0F, 0F, -1.49999F, -0.49999F, 0F, 0F, 0F, 0F, -7.9999F, 0F, 0F, -7.9999F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[30].setRotationPoint(-20F, -32F, -10F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 26, 2, 10, 0F,0F, 0.5F, -4.5F, 0F, 0F, -4.5F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[31].setRotationPoint(2F, -31F, -10F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 22, 2, 10, 0F,0F, 0F, -4.5F, 0F, -1F, -5F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, -0.5F, 0F, 1.5F, 0F, 0F, 0.5F, 0F); // Box 38
		bodyModel[32].setRotationPoint(28F, -31F, -10F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 22, 5, 15, 0F,0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[33].setRotationPoint(28F, -21F, -15F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 9, 3, 7, 0F,0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 1F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[34].setRotationPoint(-38F, -22F, -17F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 9, 4, 7, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 49
		bodyModel[35].setRotationPoint(-29F, -22F, -17F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 22, 4, 16, 0F,0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 50
		bodyModel[36].setRotationPoint(-20F, -22F, -16F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 26, 5, 15, 0F,0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 51
		bodyModel[37].setRotationPoint(2F, -21F, -15F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 8, 1, 9, 0F,0F, 0F, -2F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F, 0.5F, -6.5F); // Box 52
		bodyModel[38].setRotationPoint(-46F, -19F, -19F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 9, 1, 9, 0F,0F, 0F, -1.49999F, 0F, -0.49999F, -0.9999F, 0F, -0.49999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.49999F, -0.9999F, 0F, -0.49999F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[39].setRotationPoint(-38F, -19F, -19F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 8, 2, 3, 0F,0F, -0.5F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F); // Box 54
		bodyModel[40].setRotationPoint(-46F, -18F, -20F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 9, 2, 10, 0F,0F, 0F, -1F, 0F, 0.5F, -2F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[41].setRotationPoint(-38F, -18F, -20F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 9, 3, 11, 0F,0F, -0.5F, -3F, 0F, -0.5F, -3.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[42].setRotationPoint(-29F, -19F, -21F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 8, 5, 4, 0F,0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[43].setRotationPoint(-46F, -14F, -22F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 9, 5, 12, 0F,0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[44].setRotationPoint(-38F, -14F, -22F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 22, 2, 20, 0F,0F, 0.5F, -2.5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 65
		bodyModel[45].setRotationPoint(-20F, -18F, -20F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 11, 2, 21, 0F,0F, 0.5F, -1F, 0F, 0.25F, -1.25F, 0F, 0.25F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[46].setRotationPoint(-20F, -16F, -21F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 11, 3, 21, 0F,0F, 0.25F, -1.25F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -1F, 1F, 0F, -0.5F, 2F, 0F, -0.5F, 0F, 0F, -1F, 0F); // Box 67
		bodyModel[47].setRotationPoint(-9F, -16F, -21F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 9, 2, 11, 0F,0F, 0F, -0.5F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[48].setRotationPoint(-29F, -16F, -21F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 9, 2, 11, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[49].setRotationPoint(-38F, -16F, -21F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 8, 3, 5, 0F,0F, -0.5F, -2F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -1.5F, 0F, -0.5F, -1.5F); // Box 70
		bodyModel[50].setRotationPoint(-46F, -16F, -22F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 1.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F); // Box 71
		bodyModel[51].setRotationPoint(-52F, -15F, -20F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 9, 2, 20, 0F,0F, 0F, -4F, 0F, -0.5F, -4.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 1F, -2.5F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 72
		bodyModel[52].setRotationPoint(2F, -18F, -20F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 17, 2, 18, 0F,0F, 0.5F, -2.5F, 0F, -1F, -3F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, -4F, 0.5F, -1.5F, -4F, 0.5F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[53].setRotationPoint(11F, -17F, -18F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 6, 3, 17, 0F,-3.9999F, -0.9999F, -1.9999F, -1.9999F, -0.9999F, -1.9999F, -1.9999F, -0.9999F, 0F, -3.9999F, -0.9999F, 0F, 0F, -0.49999F, -0.49999F, 0F, 0F, -1.9999F, 0F, 0F, 0F, 0F, -0.49999F, 0F); // Box 74
		bodyModel[54].setRotationPoint(24F, -17F, -17F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 22, 3, 15, 0F,0F, 0F, 0F, 0F, 0.5F, -1.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 0F, 0.5F, -3F, 0F, 0.5F, 0F, -2F, -1F, 0F); // Box 75
		bodyModel[55].setRotationPoint(28F, -16F, -15F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 9, 2, 23, 0F,0F, 0F, -3.5F, 0F, -1F, -5.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F); // Box 76
		bodyModel[56].setRotationPoint(2F, -16F, -23F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[57].setRotationPoint(-46F, -31F, -8.5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0.5F, -2F, 0F, 0.5F, 2F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, 1.5F, 0F, 0F, 0F); // Box 78
		bodyModel[58].setRotationPoint(-38F, -31F, -8.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, -0.5F, -0.5F, 0.5F, 0.5F, -3F, 0.5F, 0.5F, 3F, 0F, -0.5F, 0.5F, 0F, 0.5F, 0F, 0.5F, -0.5F, -3F, 0.5F, -0.5F, 3F, 0F, 0.5F, 0F); // Box 79
		bodyModel[59].setRotationPoint(-29F, -32F, -7F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,0.49999F, -0.49999F, 0F, 0F, -0.9999F, -0.9999F, 0F, -0.9999F, 0F, 0.49999F, -0.49999F, 0F, 0.49999F, 0.49999F, 0F, 0F, 0F, -0.9999F, 0F, 0F, 0F, 0.49999F, 0.49999F, 0F); // Box 81
		bodyModel[60].setRotationPoint(-18F, -33F, -4F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,0.49999F, 0.9999F, -1.49999F, 0F, -0.9999F, -2.9999F, 0F, -0.9999F, 0F, 0.49999F, 0.9999F, 0F, 0.49999F, -0.49999F, 0F, 0F, 0F, -2.9999F, 0F, 0F, 0F, 0.49999F, -0.49999F, 0F); // Box 82
		bodyModel[61].setRotationPoint(-18F, -33F, -4F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,0.49999F, 1.9999F, -2.9999F, 0F, -0.9999F, -2.9999F, 0F, -0.9999F, 0F, 0.49999F, 1.9999F, 0F, 0.49999F, -1.9999F, -1.49999F, 0F, 0F, -2.9999F, 0F, 0F, 0F, 0.49999F, -1.9999F, 0F); // Box 83
		bodyModel[62].setRotationPoint(-18F, -33F, -4F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,-1F, 1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 4F, 0F, -1F, -3F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, -1F, 3F); // Box 84
		bodyModel[63].setRotationPoint(-57F, -31F, -8F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,-1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 85
		bodyModel[64].setRotationPoint(-57F, -32F, -5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 13, 2, 9, 0F,0F, 0F, -5.5F, 0F, -0.5F, -6.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[65].setRotationPoint(11F, -15F, -23F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 6, 2, 9, 0F,0F, 0.5F, -6.5F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 1F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[66].setRotationPoint(24F, -14F, -23F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 20, 2, 17, 0F,0F, 0F, -1.9999F, 0F, -1.49999F, -4.9999F, 0F, -1.49999F, 0F, 0F, 0F, 0F, 0F, 0F, 0.49999F, 0F, -0.49999F, -4.9999F, 0F, -0.49999F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[67].setRotationPoint(30F, -14F, -17F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 9, 5, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[68].setRotationPoint(-29F, -14F, -21F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 11, 5, 21, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[69].setRotationPoint(-20F, -14F, -21F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 11, 5, 22, 0F,0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F); // Box 88
		bodyModel[70].setRotationPoint(-9F, -14F, -22F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 9, 3, 23, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 89
		bodyModel[71].setRotationPoint(2F, -13F, -23F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 13, 2, 9, 0F,0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[72].setRotationPoint(11F, -13F, -23F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 8, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 91
		bodyModel[73].setRotationPoint(-46F, -9F, -21F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 9, 2, 21, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		bodyModel[74].setRotationPoint(-38F, -9F, -21F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 9, 2, 20, 0F,0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		bodyModel[75].setRotationPoint(-29F, -9F, -20F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 6, 2, 19, 0F,0F, -0.5F, -3F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 1F, -6.5F, 0F, 1F, -5F, 0F, 1.5F, 0F, 0F, 1.5F, 0F); // Box 94
		bodyModel[76].setRotationPoint(-52F, -8F, -19F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 7, 2, 15, 0F,0F, 0.5F, -3F, 0F, 0.5F, 1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, -6.5F, 0F, 0F, -2.5F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[77].setRotationPoint(-59F, -7F, -15F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 7, 2, 15, 0F,0F, 0.49999F, -4.49999F, 0F, -1.49999F, 0.9999F, 0F, -1.49999F, 0F, 0F, 0.49999F, 0F, 0F, -0.49999F, -2.9999F, 0F, -0.49999F, 0.9999F, 0F, -0.49999F, 0F, 0F, -0.49999F, 0F); // Box 96
		bodyModel[78].setRotationPoint(-59F, -9F, -15F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 7, 2, 10, 0F,0F, 0F, 1.5F, 0F, -2F, 1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 2.5F, 1F, 0F, 2.5F, 0F, 0F, 0.5F, 0F); // Box 97
		bodyModel[79].setRotationPoint(-59F, -12F, -10F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 8, 2, 19, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -3F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 98
		bodyModel[80].setRotationPoint(-46F, -7F, -19F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 9, 2, 19, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 99
		bodyModel[81].setRotationPoint(-38F, -7F, -19F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 9, 2, 19, 0F,0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 100
		bodyModel[82].setRotationPoint(-29F, -7F, -19F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 7, 4, 2, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 2F, -1F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[83].setRotationPoint(-59F, -16F, -12F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 7, 2, 5, 0F,0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[84].setRotationPoint(-59F, -18F, -15F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 7, 2, 15, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -3F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[85].setRotationPoint(-66F, -18F, -15F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 7, 4, 13, 0F,0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[86].setRotationPoint(-66F, -16F, -13F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 11, 2, 21, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, -0.5F, -7.5F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[87].setRotationPoint(-20F, -9F, -21F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 11, 2, 21, 0F,0F, 0.5F, 0F, 0F, 1F, 1F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, -7.5F, 0F, -0.5F, -8F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 109
		bodyModel[88].setRotationPoint(-9F, -9F, -21F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 9, 3, 22, 0F,0F, 0F, 0F, 0F, 0.5F, 1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -0.5F, -9F, 0F, -1F, -9F, 0F, -1F, 0F, 0F, -0.5F, 0F); // Box 110
		bodyModel[89].setRotationPoint(2F, -10F, -22F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 13, 3, 23, 0F,0F, -0.5F, 0F, 0F, 1F, 1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, -0.5F, -10F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[90].setRotationPoint(11F, -11F, -23F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 6, 3, 23, 0F,0F, 0F, 1F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -10F, 0F, 0F, -10.5F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 112
		bodyModel[91].setRotationPoint(24F, -12F, -23F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 20, 3, 17, 0F,0F, 0F, 0.5F, 0F, 0.5F, -5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, -0.5F, -8F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[92].setRotationPoint(30F, -12F, -17F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 11, 2, 16, 0F,0F, 0F, 0.5F, 0F, 0.5F, -2.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 114
		bodyModel[93].setRotationPoint(-20F, -7F, -16F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 11, 2, 14, 0F,0F, 0.5F, -0.5F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -3F, 0F, -0.5F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[94].setRotationPoint(-9F, -7F, -14F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 9, 3, 13, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -4F, 0F, -1F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[95].setRotationPoint(2F, -8F, -13F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 13, 3, 13, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -1F, -5.5F, 0F, -1.5F, -7F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		bodyModel[96].setRotationPoint(11F, -8F, -13F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 6, 3, 13, 0F,0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -7F, 0F, -0.5F, -7.5F, 0F, 0.5F, 0F, 0F, 1F, 0F); // Box 118
		bodyModel[97].setRotationPoint(24F, -9F, -13F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 20, 3, 12, 0F,0F, 0F, 0.5F, 0F, 0.5F, -3F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -6.5F, 0F, -1F, -7F, 0F, -0.5F, 0F, 0F, 0.5F, 0F); // Box 119
		bodyModel[98].setRotationPoint(30F, -9F, -12F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 7, 3, 11, 0F,0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 124
		bodyModel[99].setRotationPoint(-66F, -12F, -11F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 7, 1, 11, 0F,0F, 0F, -1F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, 1F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[100].setRotationPoint(-66F, -9F, -11F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 7, 2, 11, 0F,0F, 0F, -0.5F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0.5F, -2.5F, 0F, 1F, 0F, 0F, 0.5F, 0F); // Box 129
		bodyModel[101].setRotationPoint(-66F, -8F, -11F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 138
		bodyModel[102].setRotationPoint(-45F, -31F, -8.5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 39, 3, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		bodyModel[103].setRotationPoint(-59F, -12F, -10F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 14, 3, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		bodyModel[104].setRotationPoint(-52F, -10F, -11F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 14, 6, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[105].setRotationPoint(-52F, -16F, -13F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 14, 2, 3, 0F,0F, 0.75F, 2F, 0F, 1F, 2F, 0F, 1.5F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		bodyModel[106].setRotationPoint(-52F, -18F, -13F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 6, 1, 9, 0F,0F, -0.49999F, 0.9999F, 0F, -0.9999F, -5.49999F, 0F, -0.9999F, 0F, 0F, -0.49999F, 0F, 0F, 0F, 0.9999F, 0F, 0F, -5.49999F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		bodyModel[107].setRotationPoint(24F, -13F, -23F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,1.5F, 0.5F, -2F, -1.5F, 0.5F, -2F, -1.5F, 0F, 2F, 1.5F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 232
		bodyModel[108].setRotationPoint(-46F, -34F, -8.5F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,1.5F, 0.5F, -2F, -1.5F, 0.5F, -2F, -1.5F, 0F, 2F, 1.5F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 233
		bodyModel[109].setRotationPoint(-45F, -34F, -8.5F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 1F, -1F, 0.5F, 1F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 234
		bodyModel[110].setRotationPoint(-48F, -36F, -6.5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F); // Box 235
		bodyModel[111].setRotationPoint(-48F, -36F, -4.5F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0.5F, 0F, 0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0.5F, 0F, -0.5F, 0.5F); // Box 236
		bodyModel[112].setRotationPoint(-48F, -36F, -2.5F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, -0.5F, 1F, -1F, 0.5F, 1F, -1F, 0F, -1F, 0.5F, 0F, -0.5F, 0F); // Box 237
		bodyModel[113].setRotationPoint(-47F, -36F, -6.5F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1.5F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -1F, -0.5F, 0F, -1.5F, 0F, 0F, -1F, 0F); // Box 238
		bodyModel[114].setRotationPoint(-47F, -36F, -4.5F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0.5F, 0F, 0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0.5F, 0F, -0.5F, 0.5F); // Box 239
		bodyModel[115].setRotationPoint(-47F, -36.5F, -2.5F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0.5F, 0F, 1F, -0.5F, 0F, 1F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, -1F, -0.5F, 0F, -1F, 0.5F, 0F, 0F, -1.5F); // Box 240
		bodyModel[116].setRotationPoint(-50F, -35.5F, -2.5F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -2F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 2F, 0F); // Box 241
		bodyModel[117].setRotationPoint(-56F, -34F, -4F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, 1.5F, -1F, 0F, 1.5F, 1F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -1.5F, -1F, 0F, -1.5F, 1F, 0F, 0.25F, 0F); // Box 242
		bodyModel[118].setRotationPoint(-53F, -34F, -4F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 9, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 254
		bodyModel[119].setRotationPoint(-38F, -29F, 8F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F,0F, 0F, 0.5F, 0F, 0.5F, 2F, 0F, 0.5F, -3F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 255
		bodyModel[120].setRotationPoint(-38F, -30F, 8F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 256
		bodyModel[121].setRotationPoint(-46F, -30F, 7F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 8, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 257
		bodyModel[122].setRotationPoint(-46F, -29F, 8F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 13, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 258
		bodyModel[123].setRotationPoint(-59F, -29F, 8F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 8, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 259
		bodyModel[124].setRotationPoint(-46F, -25F, 10F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 8, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 260
		bodyModel[125].setRotationPoint(-46F, -22F, 10F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 13, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 261
		bodyModel[126].setRotationPoint(-59F, -25F, 10F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 13, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 1F, 0F); // Box 262
		bodyModel[127].setRotationPoint(-59F, -22F, 10F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 9, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 263
		bodyModel[128].setRotationPoint(-38F, -25F, 10F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 9, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 264
		bodyModel[129].setRotationPoint(-29F, -25F, 10F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 9, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 265
		bodyModel[130].setRotationPoint(-29F, -29F, 8F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 10, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, -3F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 2F, -1F); // Box 266
		bodyModel[131].setRotationPoint(-69F, -25F, 0F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 10, 4, 12, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 267
		bodyModel[132].setRotationPoint(-69F, -29F, 0F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 7, 5, 15, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F); // Box 268
		bodyModel[133].setRotationPoint(-66F, -22F, 0F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 13, 2, 8, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -3F, -5.5F, 1F, -6.5F, 0F, -0.5F, -6.5F, 0F, -0.5F, 0.5F, -5.5F, 1F, 0F); // Box 272
		bodyModel[134].setRotationPoint(-59F, -19F, 10F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 8, 2, 3, 0F,-0.5F, -1F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, -1.5F, -0.5F, -1F, -2F, -2F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -2F, 0F, -1F); // Box 273
		bodyModel[135].setRotationPoint(-54F, -17F, 17F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 6, 5, 4, 0F,0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -2.5F); // Box 274
		bodyModel[136].setRotationPoint(-52F, -14F, 18F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 6, 2, 7, 0F,0F, 1F, -3F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 1F, -2.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -3F, 0F, -0.5F, -6F); // Box 275
		bodyModel[137].setRotationPoint(-52F, -9F, 15F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 9, 2, 7, 0F,0F, -0.5F, -3F, 1.5F, 0.5F, 0F, 1.5F, 0.5F, -6F, 0F, -0.5F, -3F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
		bodyModel[138].setRotationPoint(-29F, -31F, 3F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 13, 2, 6, 0F,-2F, 0F, 0F, 0F, -1F, -3.5F, 0F, -1F, -1.5F, -2F, 0F, -5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 279
		bodyModel[139].setRotationPoint(-59F, -31F, 4F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 2, 2, 9, 0F,0F, 0.49999F, 0F, 0F, 0.49999F, 0F, 0F, 0F, -3.9999F, 0F, 0F, -3.9999F, 0F, 0F, 0F, -1.9999F, 0F, 0F, -1.9999F, 0F, 0F, 0F, 0F, 0F); // Box 280
		bodyModel[140].setRotationPoint(-59F, -31F, 0F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 10, 2, 9, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, -4F, 0F, -0.5F, -4F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F); // Box 281
		bodyModel[141].setRotationPoint(-69F, -31F, 0F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 22, 3, 16, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -2.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -0.5F, 0F, 0F, 0F); // Box 282
		bodyModel[142].setRotationPoint(-20F, -25F, 0F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 26, 4, 16, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F); // Box 283
		bodyModel[143].setRotationPoint(2F, -25F, 0F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 22, 4, 15, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -3F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 284
		bodyModel[144].setRotationPoint(28F, -25F, 0F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 22, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 1F, 0F); // Box 285
		bodyModel[145].setRotationPoint(-20F, -29F, 0F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 26, 3, 14, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -4F, 0F, 0F, -4F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, -0.5F, 0F, 0.5F, -0.5F); // Box 286
		bodyModel[146].setRotationPoint(2F, -29F, 0F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 22, 3, 14, 0F,0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -4.5F, 0F, 0.5F, -4F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -2F, 0F, 0F, -0.5F); // Box 287
		bodyModel[147].setRotationPoint(28F, -28F, 0F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 22, 3, 10, 0F,-8F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -4.5F, -8F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 288
		bodyModel[148].setRotationPoint(-20F, -32F, 0F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 8, 3, 10, 0F,-1.49999F, -0.49999F, 0F, 0F, 0F, 0F, 0F, 0F, -6.9999F, -1.49999F, -0.49999F, -5.9999F, 0F, 0F, 0F, -7.9999F, 0F, 0F, -7.9999F, 0F, 0F, 0F, 0F, 0F); // Box 289
		bodyModel[149].setRotationPoint(-20F, -32F, 0F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 26, 2, 10, 0F,0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0F, -4.5F, 0F, 0.5F, -4.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 290
		bodyModel[150].setRotationPoint(2F, -31F, 0F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 22, 2, 10, 0F,0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, -5F, 0F, 0F, -4.5F, 0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, -0.5F, 0F, 0.5F, 0F); // Box 291
		bodyModel[151].setRotationPoint(28F, -31F, 0F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 22, 5, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, 0F, 0F); // Box 292
		bodyModel[152].setRotationPoint(28F, -21F, 0F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 9, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 1F, 0F, 0F, 0.5F); // Box 301
		bodyModel[153].setRotationPoint(-38F, -22F, 10F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 9, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 1F); // Box 302
		bodyModel[154].setRotationPoint(-29F, -22F, 10F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 22, 4, 16, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1.5F); // Box 303
		bodyModel[155].setRotationPoint(-20F, -22F, 0F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 26, 5, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1F); // Box 304
		bodyModel[156].setRotationPoint(2F, -21F, 0F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 8, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -2F, 0F, 0.5F, -6.5F, 0F, 0F, -6.5F, 0F, 0F, 0F, 0F, 0.5F, -0.5F); // Box 305
		bodyModel[157].setRotationPoint(-46F, -19F, 10F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 9, 1, 9, 0F,0F, 0F, 0F, 0F, -0.49999F, 0F, 0F, -0.49999F, -0.9999F, 0F, 0F, -1.49999F, 0F, 0F, 0F, 0F, -0.49999F, 0F, 0F, -0.49999F, -0.9999F, 0F, 0F, 0F); // Box 306
		bodyModel[158].setRotationPoint(-38F, -19F, 10F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 8, 2, 3, 0F,0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, -0.5F, -1.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F); // Box 307
		bodyModel[159].setRotationPoint(-46F, -18F, 17F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 9, 2, 10, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 308
		bodyModel[160].setRotationPoint(-38F, -18F, 10F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 9, 3, 11, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -3.5F, 0F, -0.5F, -3F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -0.5F); // Box 309
		bodyModel[161].setRotationPoint(-29F, -19F, 10F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 8, 5, 4, 0F,0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 312
		bodyModel[162].setRotationPoint(-46F, -14F, 18F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 9, 5, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1F); // Box 313
		bodyModel[163].setRotationPoint(-38F, -14F, 10F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 22, 2, 20, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0.5F, -2.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F); // Box 316
		bodyModel[164].setRotationPoint(-20F, -18F, 0F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 11, 2, 21, 0F,0F, 0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -1.25F, 0F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 317
		bodyModel[165].setRotationPoint(-20F, -16F, 0F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 11, 3, 21, 0F,0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0.25F, -1.25F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 2F, 0F, -1F, 1F); // Box 318
		bodyModel[166].setRotationPoint(-9F, -16F, 0F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 9, 2, 11, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 319
		bodyModel[167].setRotationPoint(-29F, -16F, 10F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 9, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F); // Box 320
		bodyModel[168].setRotationPoint(-38F, -16F, 10F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 8, 3, 5, 0F,0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, -0.5F, -2F, 0F, -0.5F, -1.5F, 0F, -1F, -1.5F, 0F, -1F, -0.5F, 0F, -0.5F, -0.5F); // Box 321
		bodyModel[169].setRotationPoint(-46F, -16F, 17F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 1.5F, 0F, 0F, 0F); // Box 322
		bodyModel[170].setRotationPoint(-52F, -15F, 18F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 9, 2, 20, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -4.5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -2.5F, 0F, 0F, -0.5F); // Box 323
		bodyModel[171].setRotationPoint(2F, -18F, 0F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 17, 2, 18, 0F,0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, -3F, 0F, 0.5F, -2.5F, 0F, 0F, 0F, -4F, 0.5F, 0F, -4F, 0.5F, -1.5F, 0F, 0F, -0.5F); // Box 324
		bodyModel[172].setRotationPoint(11F, -17F, 0F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 6, 3, 17, 0F,-3.9999F, -0.9999F, 0F, -1.9999F, -0.9999F, 0F, -1.9999F, -0.9999F, -1.9999F, -3.9999F, -0.9999F, -1.9999F, 0F, -0.49999F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9999F, 0F, -0.49999F, -0.49999F); // Box 325
		bodyModel[173].setRotationPoint(24F, -17F, 0F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 22, 3, 15, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1.5F, 0F, 0F, 0F, -2F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -3F, -2F, -1F, 0F); // Box 326
		bodyModel[174].setRotationPoint(28F, -16F, 0F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 9, 2, 23, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -5.5F, 0F, 0F, -3.5F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F); // Box 327
		bodyModel[175].setRotationPoint(2F, -16F, 0F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 328
		bodyModel[176].setRotationPoint(-46F, -31F, 7.5F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0.5F, 0F, 0.5F, 2F, 0F, 0.5F, -2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 1.5F, 0F, -0.5F, -1.5F, 0F, 0F, 0F); // Box 329
		bodyModel[177].setRotationPoint(-38F, -31F, 7.5F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, -0.5F, 0.5F, 0.5F, 0.5F, 3F, 0.5F, 0.5F, -3F, 0F, -0.5F, -0.5F, 0F, 0.5F, 0F, 0.5F, -0.5F, 3F, 0.5F, -0.5F, -3F, 0F, 0.5F, 0F); // Box 330
		bodyModel[178].setRotationPoint(-29F, -32F, 6F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,0.49999F, -0.49999F, 0F, 0F, -0.9999F, 0F, 0F, -0.9999F, -0.9999F, 0.49999F, -0.49999F, 0F, 0.49999F, 0.49999F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9999F, 0.49999F, 0.49999F, 0F); // Box 331
		bodyModel[179].setRotationPoint(-18F, -33F, 0F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,0.49999F, 0.9999F, 0F, 0F, -0.9999F, 0F, 0F, -0.9999F, -2.9999F, 0.49999F, 0.9999F, -1.49999F, 0.49999F, -0.49999F, 0F, 0F, 0F, 0F, 0F, 0F, -2.9999F, 0.49999F, -0.49999F, 0F); // Box 332
		bodyModel[180].setRotationPoint(-18F, -33F, 0F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,0.49999F, 1.9999F, 0F, 0F, -0.9999F, 0F, 0F, -0.9999F, -2.9999F, 0.49999F, 1.9999F, -2.9999F, 0.49999F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, -2.9999F, 0.49999F, -1.9999F, -1.49999F); // Box 333
		bodyModel[181].setRotationPoint(-18F, -33F, 0F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,-1F, 1F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, -4F, 0F, -1F, 3F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, -1F, -3F); // Box 334
		bodyModel[182].setRotationPoint(-57F, -31F, 7F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 335
		bodyModel[183].setRotationPoint(-57F, -32F, 0F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 13, 2, 9, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -6.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0.5F, 1F, 0F, 0F, 0F); // Box 336
		bodyModel[184].setRotationPoint(11F, -15F, 14F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 6, 2, 9, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0.5F, -6.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, -0.5F, 1F); // Box 337
		bodyModel[185].setRotationPoint(24F, -14F, 14F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 20, 2, 17, 0F,0F, 0F, 0F, 0F, -1.49999F, 0F, 0F, -1.49999F, -4.9999F, 0F, 0F, -1.9999F, 0F, 0F, 0F, 0F, -0.49999F, 0F, 0F, -0.49999F, -4.9999F, 0F, 0F, 0.49999F); // Box 338
		bodyModel[186].setRotationPoint(30F, -14F, 0F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 9, 5, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 339
		bodyModel[187].setRotationPoint(-29F, -14F, 10F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 11, 5, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 340
		bodyModel[188].setRotationPoint(-20F, -14F, 0F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 11, 5, 22, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, -1F); // Box 341
		bodyModel[189].setRotationPoint(-9F, -14F, 0F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 9, 3, 23, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F); // Box 342
		bodyModel[190].setRotationPoint(2F, -13F, 0F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 13, 2, 9, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, 0.5F, 0F); // Box 343
		bodyModel[191].setRotationPoint(11F, -13F, 14F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 8, 2, 7, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, -2F); // Box 344
		bodyModel[192].setRotationPoint(-46F, -9F, 14F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 9, 2, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 345
		bodyModel[193].setRotationPoint(-38F, -9F, 0F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 9, 2, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -1.5F); // Box 346
		bodyModel[194].setRotationPoint(-29F, -9F, 0F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 6, 2, 19, 0F,0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, -3F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1F, -5F, 0F, 1F, -6.5F); // Box 347
		bodyModel[195].setRotationPoint(-52F, -8F, 0F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 7, 2, 15, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 1F, 0F, 0.5F, -3F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, -2.5F, 0F, -0.5F, -6.5F); // Box 348
		bodyModel[196].setRotationPoint(-59F, -7F, 0F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 7, 2, 15, 0F,0F, 0.49999F, 0F, 0F, -1.49999F, 0F, 0F, -1.49999F, 0.9999F, 0F, 0.49999F, -4.49999F, 0F, -0.49999F, 0F, 0F, -0.49999F, 0F, 0F, -0.49999F, 0.9999F, 0F, -0.49999F, -2.9999F); // Box 349
		bodyModel[197].setRotationPoint(-59F, -9F, 0F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 7, 2, 10, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 1F, 0F, 0F, 1.5F, 0F, 0.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 1F, 0F, 0.5F, 0.5F); // Box 350
		bodyModel[198].setRotationPoint(-59F, -12F, 0F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 8, 2, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -3F, 0F, 0F, -5F); // Box 351
		bodyModel[199].setRotationPoint(-46F, -7F, 0F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 9, 2, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 352
		bodyModel[200].setRotationPoint(-38F, -7F, 0F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 9, 2, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -5F, 0F, 0F, -3F); // Box 353
		bodyModel[201].setRotationPoint(-29F, -7F, 0F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 7, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -1F, 0F, 0F, -0.5F); // Box 354
		bodyModel[202].setRotationPoint(-59F, -16F, 10F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 7, 2, 5, 0F,0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 355
		bodyModel[203].setRotationPoint(-59F, -18F, 10F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 7, 2, 15, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -3F); // Box 356
		bodyModel[204].setRotationPoint(-66F, -18F, 0F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 7, 4, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -2.5F); // Box 358
		bodyModel[205].setRotationPoint(-66F, -16F, 0F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 11, 2, 21, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -7.5F, 0F, 0F, -4.5F); // Box 361
		bodyModel[206].setRotationPoint(-20F, -9F, 0F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 11, 2, 21, 0F,0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -8F, 0F, -0.5F, -7.5F); // Box 362
		bodyModel[207].setRotationPoint(-9F, -9F, 0F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 9, 3, 22, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 0.5F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, -9F, 0F, -0.5F, -9F); // Box 363
		bodyModel[208].setRotationPoint(2F, -10F, 0F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 13, 3, 23, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -10F, 0F, 0F, -10F); // Box 364
		bodyModel[209].setRotationPoint(11F, -11F, 0F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 6, 3, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, 1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -10.5F, 0F, 0.5F, -10F); // Box 365
		bodyModel[210].setRotationPoint(24F, -12F, 0F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 20, 3, 17, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -8F, 0F, 0F, -4.5F); // Box 366
		bodyModel[211].setRotationPoint(30F, -12F, 0F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 11, 2, 16, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -2.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -2F); // Box 367
		bodyModel[212].setRotationPoint(-20F, -7F, 0F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 11, 2, 14, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -5F, 0F, 0F, -3F); // Box 368
		bodyModel[213].setRotationPoint(-9F, -7F, 0F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 9, 3, 13, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -5.5F, 0F, -0.5F, -4F); // Box 369
		bodyModel[214].setRotationPoint(2F, -8F, 0F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 13, 3, 13, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -7F, 0F, -1F, -5.5F); // Box 370
		bodyModel[215].setRotationPoint(11F, -8F, 0F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 6, 3, 13, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, -7.5F, 0F, -0.5F, -7F); // Box 371
		bodyModel[216].setRotationPoint(24F, -9F, 0F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 20, 3, 12, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -3F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, -7F, 0F, -0.5F, -6.5F); // Box 372
		bodyModel[217].setRotationPoint(30F, -9F, 0F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 7, 3, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -1F); // Box 377
		bodyModel[218].setRotationPoint(-66F, -12F, 0F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 7, 1, 11, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 1F, 0F, 0F, -0.5F); // Box 379
		bodyModel[219].setRotationPoint(-66F, -9F, 0F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 7, 2, 11, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0.5F, -2.5F, 0F, 0F, -5F); // Box 382
		bodyModel[220].setRotationPoint(-66F, -8F, 0F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 391
		bodyModel[221].setRotationPoint(-45F, -31F, 7.5F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 39, 3, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 392
		bodyModel[222].setRotationPoint(-59F, -12F, 0F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 14, 3, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 393
		bodyModel[223].setRotationPoint(-52F, -10F, 0F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 14, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 394
		bodyModel[224].setRotationPoint(-52F, -16F, 10F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 14, 2, 3, 0F,0F, 0.75F, 0F, 0F, 1.5F, 0F, 0F, 1F, 2F, 0F, 0.75F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 395
		bodyModel[225].setRotationPoint(-52F, -18F, 10F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 6, 1, 9, 0F,0F, -0.49999F, 0F, 0F, -0.9999F, 0F, 0F, -0.9999F, -5.49999F, 0F, -0.49999F, 0.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.49999F, 0F, 0F, 0.9999F); // Box 451
		bodyModel[226].setRotationPoint(24F, -13F, 14F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,1.5F, 0F, 2F, -1.5F, 0F, 2F, -1.5F, 0.5F, -2F, 1.5F, 0.5F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 485
		bodyModel[227].setRotationPoint(-46F, -34F, 7.5F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,1.5F, 0F, 2F, -1.5F, 0F, 2F, -1.5F, 0.5F, -2F, 1.5F, 0.5F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 486
		bodyModel[228].setRotationPoint(-45F, -34F, 7.5F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, 1F, -1F, -0.5F, 1F, -1F); // Box 487
		bodyModel[229].setRotationPoint(-48F, -36F, 4.5F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 488
		bodyModel[230].setRotationPoint(-48F, -36F, 2.5F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0.5F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0F, 0F, -0.5F, 0F); // Box 489
		bodyModel[231].setRotationPoint(-48F, -36F, 0.5F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0.5F, 0F, 0F, 1F, 0F, 0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0.5F, 0.5F, 1F, -1F, -0.5F, 1F, -1F); // Box 490
		bodyModel[232].setRotationPoint(-47F, -36F, 4.5F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 1F, 0F, 0F, 1.5F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, -1F, -0.5F, 0F, -0.5F, 0F); // Box 491
		bodyModel[233].setRotationPoint(-47F, -36F, 2.5F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0.5F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0F, 0F, -0.5F, 0F); // Box 492
		bodyModel[234].setRotationPoint(-47F, -36.5F, 0.5F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -1.5F, 0F, 1F, 0.5F, 0F, 1F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, -1F, 0.5F, 0F, -1F, -0.5F, 0F, 0F, 0.5F); // Box 493
		bodyModel[235].setRotationPoint(-50F, -35.5F, 0.5F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -2F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 2F, 0F); // Box 494
		bodyModel[236].setRotationPoint(-56F, -34F, 3F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, 1.5F, 1F, 0F, 1.5F, -1F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -1.5F, 1F, 0F, -1.5F, -1F, 0F, 0.25F, 0F); // Box 495
		bodyModel[237].setRotationPoint(-53F, -34F, 3F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 9, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 262
		bodyModel[238].setRotationPoint(-59F, -22F, -10F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 6, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 255
		bodyModel[239].setRotationPoint(-50F, -27F, -10F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 1, 2, 18, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 257
		bodyModel[240].setRotationPoint(-50F, -29F, -9F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 258
		bodyModel[241].setRotationPoint(-50F, -30F, -7F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 213
		bodyModel[242].setRotationPoint(-49.8F, -27.3F, -4F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, -0.4F, -3F, 0F, -0.4F, -3F, 0F, -0.4F, -3F, 0F, -0.4F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 214
		bodyModel[243].setRotationPoint(-49.8F, -28.3F, -4F);

		bodyModel[244].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F); // Box 233
		bodyModel[244].setRotationPoint(-49.7F, -26.1F, 2.7F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F); // Box 234
		bodyModel[245].setRotationPoint(-49.6F, -27.1F, -0.9F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F); // Box 235
		bodyModel[246].setRotationPoint(-49.6F, -27.1F, -0.9F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F); // Box 236
		bodyModel[247].setRotationPoint(-49.6F, -27.1F, -0.9F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 237
		bodyModel[248].setRotationPoint(-49.6F, -26.1F, -0.9F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 238
		bodyModel[249].setRotationPoint(-49.6F, -26.1F, -0.9F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 239
		bodyModel[250].setRotationPoint(-49.6F, -26.1F, 0.0999999999999996F);

		bodyModel[251].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 240
		bodyModel[251].setRotationPoint(-49.7F, -26.1F, 0.0999999999999996F);
		bodyModel[251].rotateAngleX = 5.49778714F;

		bodyModel[252].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 241
		bodyModel[252].setRotationPoint(-49.7F, -26.1F, 0.0999999999999996F);

		bodyModel[253].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F); // Box 242
		bodyModel[253].setRotationPoint(-49.7F, -26.1F, 0.0999999999999996F);

		bodyModel[254].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 243
		bodyModel[254].setRotationPoint(-49.6F, -26.1F, 0.0999999999999996F);

		bodyModel[255].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 244
		bodyModel[255].setRotationPoint(-49.7F, -26.1F, 0.0999999999999996F);
		bodyModel[255].rotateAngleX = 3.14159265F;

		bodyModel[256].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 248
		bodyModel[256].setRotationPoint(-49.6F, -27.1F, 0.0999999999999996F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 249
		bodyModel[257].setRotationPoint(-49.6F, -27.1F, 0.0999999999999996F);

		bodyModel[258].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 250
		bodyModel[258].setRotationPoint(-49.7F, -26.1F, 0.0999999999999996F);
		bodyModel[258].rotateAngleX = 4.71238898F;

		bodyModel[259].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 251
		bodyModel[259].setRotationPoint(-49.7F, -26.1F, 0.0999999999999996F);
		bodyModel[259].rotateAngleX = 3.92699082F;

		bodyModel[260].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F); // Box 252
		bodyModel[260].setRotationPoint(-49.6F, -27.1F, 1.7F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F); // Box 253
		bodyModel[261].setRotationPoint(-49.6F, -27.1F, 1.7F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F); // Box 254
		bodyModel[262].setRotationPoint(-49.6F, -27.1F, 1.7F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 255
		bodyModel[263].setRotationPoint(-49.6F, -27.1F, 2.7F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 256
		bodyModel[264].setRotationPoint(-49.6F, -27.1F, 2.7F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 257
		bodyModel[265].setRotationPoint(-49.6F, -26.1F, 2.7F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 258
		bodyModel[266].setRotationPoint(-49.6F, -26.1F, 1.7F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 259
		bodyModel[267].setRotationPoint(-49.6F, -26.1F, 1.7F);

		bodyModel[268].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 260
		bodyModel[268].setRotationPoint(-49.7F, -26.1F, 2.7F);
		bodyModel[268].rotateAngleX = 3.92699082F;

		bodyModel[269].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 261
		bodyModel[269].setRotationPoint(-49.7F, -26.1F, 2.7F);
		bodyModel[269].rotateAngleX = 4.71238898F;

		bodyModel[270].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 262
		bodyModel[270].setRotationPoint(-49.7F, -26.1F, 2.7F);
		bodyModel[270].rotateAngleX = 5.49778714F;

		bodyModel[271].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 263
		bodyModel[271].setRotationPoint(-49.7F, -26.1F, 2.7F);

		bodyModel[272].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 265
		bodyModel[272].setRotationPoint(-49.6F, -26.1F, 2.7F);

		bodyModel[273].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 266
		bodyModel[273].setRotationPoint(-49.7F, -26.1F, 2.7F);
		bodyModel[273].rotateAngleX = 0.78539816F;

		bodyModel[274].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 267
		bodyModel[274].setRotationPoint(-49.7F, -26.1F, 2.7F);
		bodyModel[274].rotateAngleX = 1.57079633F;

		bodyModel[275].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 268
		bodyModel[275].setRotationPoint(-49.7F, -26.1F, 2.7F);
		bodyModel[275].rotateAngleX = 2.35619449F;

		bodyModel[276].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 269
		bodyModel[276].setRotationPoint(-49.7F, -26.1F, 2.7F);
		bodyModel[276].rotateAngleX = 3.14159265F;

		bodyModel[277].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.45F, 0.3F, 0F, -0.45F, 0.3F, 0F, -0.45F, 0.3F, 0F, -0.45F, 0.3F, 0F, -0.45F, 0.3F, 0F, -0.45F, 0.3F, 0F, -0.45F, 0.3F, 0F, -0.45F, 0.3F); // Box 270
		bodyModel[277].setRotationPoint(-49.7F, -26.1F, 0.0999999999999996F);
		bodyModel[277].rotateAngleX = -0.38397244F;

		bodyModel[278].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F); // Box 271
		bodyModel[278].setRotationPoint(-49.7F, -26.9F, -0.9F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, -0.9F, 0F, -0.5F, -0.9F, 0F, -0.5F, -0.9F, 0F, -0.5F, -0.9F); // Box 272
		bodyModel[279].setRotationPoint(-49.7F, -26.7F, -0.9F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 273
		bodyModel[280].setRotationPoint(-49.6F, -23.5F, -3.7F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 274
		bodyModel[281].setRotationPoint(-49.6F, -23.5F, -3.7F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F); // Box 275
		bodyModel[282].setRotationPoint(-49.6F, -24.5F, -3.7F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F); // Box 276
		bodyModel[283].setRotationPoint(-49.6F, -24.5F, -3.7F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F); // Box 277
		bodyModel[284].setRotationPoint(-49.6F, -24.5F, -3.7F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 278
		bodyModel[285].setRotationPoint(-49.6F, -24.5F, -2.7F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 279
		bodyModel[286].setRotationPoint(-49.6F, -24.5F, -2.7F);

		bodyModel[287].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 280
		bodyModel[287].setRotationPoint(-49.7F, -23.5F, -2.7F);
		bodyModel[287].rotateAngleX = 0.78539816F;

		bodyModel[288].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 281
		bodyModel[288].setRotationPoint(-49.6F, -23.5F, -2.7F);

		bodyModel[289].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 282
		bodyModel[289].setRotationPoint(-49.7F, -23.5F, -2.7F);
		bodyModel[289].rotateAngleX = 5.49778714F;

		bodyModel[290].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 283
		bodyModel[290].setRotationPoint(-49.7F, -23.5F, -2.7F);

		bodyModel[291].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 284
		bodyModel[291].setRotationPoint(-49.7F, -23.5F, -2.7F);
		bodyModel[291].rotateAngleX = 1.57079633F;

		bodyModel[292].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 285
		bodyModel[292].setRotationPoint(-49.7F, -23.5F, -2.7F);
		bodyModel[292].rotateAngleX = 2.35619449F;

		bodyModel[293].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 286
		bodyModel[293].setRotationPoint(-49.7F, -23.5F, -2.7F);
		bodyModel[293].rotateAngleX = 3.14159265F;

		bodyModel[294].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 287
		bodyModel[294].setRotationPoint(-49.6F, -23.5F, -2.7F);

		bodyModel[295].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F); // Box 288
		bodyModel[295].setRotationPoint(-49.7F, -23.5F, -2.7F);
		bodyModel[295].rotateAngleX = -3.90953752F;

		bodyModel[296].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 289
		bodyModel[296].setRotationPoint(-49.7F, -23.5F, -2.7F);
		bodyModel[296].rotateAngleX = 4.71238898F;

		bodyModel[297].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 290
		bodyModel[297].setRotationPoint(-49.7F, -23.5F, -2.7F);
		bodyModel[297].rotateAngleX = 3.92699082F;

		bodyModel[298].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 318
		bodyModel[298].setRotationPoint(-49.8F, -26.1F, 4.8F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 319
		bodyModel[299].setRotationPoint(-49.8F, -26.1F, 4.8F);

		bodyModel[300].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 320
		bodyModel[300].setRotationPoint(-49.9F, -26.1F, 5.8F);
		bodyModel[300].rotateAngleX = 3.92699082F;

		bodyModel[301].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F); // Box 321
		bodyModel[301].setRotationPoint(-49.8F, -27.1F, 4.8F);

		bodyModel[302].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 322
		bodyModel[302].setRotationPoint(-49.9F, -26.1F, 5.8F);
		bodyModel[302].rotateAngleX = 3.14159265F;

		bodyModel[303].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F); // Box 323
		bodyModel[303].setRotationPoint(-49.8F, -27.1F, 4.8F);

		bodyModel[304].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 324
		bodyModel[304].setRotationPoint(-49.9F, -26.1F, 5.8F);
		bodyModel[304].rotateAngleX = 2.35619449F;

		bodyModel[305].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F); // Box 325
		bodyModel[305].setRotationPoint(-49.8F, -27.1F, 4.8F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 326
		bodyModel[306].setRotationPoint(-49.8F, -27.1F, 5.8F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 327
		bodyModel[307].setRotationPoint(-49.8F, -27.1F, 5.8F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 328
		bodyModel[308].setRotationPoint(-49.8F, -26.1F, 5.8F);

		bodyModel[309].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 329
		bodyModel[309].setRotationPoint(-49.9F, -26.1F, 5.8F);
		bodyModel[309].rotateAngleX = 5.49778714F;

		bodyModel[310].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 330
		bodyModel[310].setRotationPoint(-49.9F, -26.1F, 5.8F);

		bodyModel[311].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 331
		bodyModel[311].setRotationPoint(-49.9F, -26.1F, 5.8F);
		bodyModel[311].rotateAngleX = 0.78539816F;

		bodyModel[312].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 332
		bodyModel[312].setRotationPoint(-49.9F, -26.1F, 5.8F);
		bodyModel[312].rotateAngleX = 1.57079633F;

		bodyModel[313].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F); // Box 333
		bodyModel[313].setRotationPoint(-49.9F, -26.1F, 5.8F);
		bodyModel[313].rotateAngleX = -3.90953752F;

		bodyModel[314].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 334
		bodyModel[314].setRotationPoint(-49.8F, -26.1F, 5.8F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 340
		bodyModel[315].setRotationPoint(-49.8F, -29.6F, 4.4F);

		bodyModel[316].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F); // Box 341
		bodyModel[316].setRotationPoint(-49.9F, -28.6F, 4.4F);
		bodyModel[316].rotateAngleX = -1.57079633F;

		bodyModel[317].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 342
		bodyModel[317].setRotationPoint(-49.8F, -28.6F, 4.4F);

		bodyModel[318].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 343
		bodyModel[318].setRotationPoint(-49.9F, -28.6F, 4.4F);
		bodyModel[318].rotateAngleX = 5.49778714F;

		bodyModel[319].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 344
		bodyModel[319].setRotationPoint(-49.8F, -28.6F, 4.4F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 345
		bodyModel[320].setRotationPoint(-49.8F, -28.6F, 3.4F);

		bodyModel[321].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 346
		bodyModel[321].setRotationPoint(-49.9F, -28.6F, 4.4F);
		bodyModel[321].rotateAngleX = 4.71238898F;

		bodyModel[322].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 347
		bodyModel[322].setRotationPoint(-49.9F, -28.6F, 4.4F);
		bodyModel[322].rotateAngleX = 3.92699082F;

		bodyModel[323].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 348
		bodyModel[323].setRotationPoint(-49.8F, -28.6F, 3.4F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F); // Box 349
		bodyModel[324].setRotationPoint(-49.8F, -29.6F, 3.4F);

		bodyModel[325].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 350
		bodyModel[325].setRotationPoint(-49.9F, -28.6F, 4.4F);
		bodyModel[325].rotateAngleX = 3.14159265F;

		bodyModel[326].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F); // Box 351
		bodyModel[326].setRotationPoint(-49.8F, -29.6F, 3.4F);

		bodyModel[327].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 352
		bodyModel[327].setRotationPoint(-49.9F, -28.6F, 4.4F);
		bodyModel[327].rotateAngleX = 2.35619449F;

		bodyModel[328].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F); // Box 353
		bodyModel[328].setRotationPoint(-49.8F, -29.6F, 3.4F);

		bodyModel[329].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 354
		bodyModel[329].setRotationPoint(-49.9F, -28.6F, 4.4F);
		bodyModel[329].rotateAngleX = 1.57079633F;

		bodyModel[330].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 355
		bodyModel[330].setRotationPoint(-49.8F, -29.6F, 4.4F);

		bodyModel[331].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 356
		bodyModel[331].setRotationPoint(-49.9F, -28.6F, 4.4F);
		bodyModel[331].rotateAngleX = 0.78539816F;

		bodyModel[332].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 387
		bodyModel[332].setRotationPoint(-49.8F, -26.6F, -6.3F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F); // Box 388
		bodyModel[333].setRotationPoint(-49.8F, -26.6F, -7.3F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 390
		bodyModel[334].setRotationPoint(-49.8F, -26.6F, -6.3F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F); // Box 391
		bodyModel[335].setRotationPoint(-49.8F, -26.6F, -7.3F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 392
		bodyModel[336].setRotationPoint(-49.8F, -25.6F, -7.3F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 393
		bodyModel[337].setRotationPoint(-49.8F, -25.6F, -7.3F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 394
		bodyModel[338].setRotationPoint(-49.8F, -25.6F, -6.3F);

		bodyModel[339].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 395
		bodyModel[339].setRotationPoint(-49.8F, -26.2F, -6.3F);

		bodyModel[340].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, 0F, 0F, -0.48F, 0F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, 0F, 0F, -0.48F, 0F); // Box 396
		bodyModel[340].setRotationPoint(-49.9F, -26.2F, -6.3F);
		bodyModel[340].rotateAngleX = -1.29154365F;

		bodyModel[341].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 397
		bodyModel[341].setRotationPoint(-49.9F, -25.6F, -6.3F);
		bodyModel[341].rotateAngleX = 3.14159265F;

		bodyModel[342].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 398
		bodyModel[342].setRotationPoint(-49.9F, -25.6F, -6.3F);
		bodyModel[342].rotateAngleX = 3.92699082F;

		bodyModel[343].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 399
		bodyModel[343].setRotationPoint(-49.9F, -25.6F, -6.3F);
		bodyModel[343].rotateAngleX = 5.49778714F;

		bodyModel[344].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 400
		bodyModel[344].setRotationPoint(-49.9F, -25.6F, -6.3F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F); // Box 401
		bodyModel[345].setRotationPoint(-49.7F, -26.8F, -7.3F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F); // Box 402
		bodyModel[346].setRotationPoint(-49.6F, -27.1F, -3.7F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F); // Box 403
		bodyModel[347].setRotationPoint(-49.6F, -27.1F, -3.7F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F); // Box 404
		bodyModel[348].setRotationPoint(-49.6F, -27.1F, -3.7F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 405
		bodyModel[349].setRotationPoint(-49.6F, -27.1F, -2.7F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 406
		bodyModel[350].setRotationPoint(-49.6F, -27.1F, -2.7F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 407
		bodyModel[351].setRotationPoint(-49.6F, -26.1F, -2.7F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 408
		bodyModel[352].setRotationPoint(-49.6F, -26.1F, -3.7F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 409
		bodyModel[353].setRotationPoint(-49.6F, -26.1F, -3.7F);

		bodyModel[354].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 410
		bodyModel[354].setRotationPoint(-49.7F, -26.1F, -2.7F);
		bodyModel[354].rotateAngleX = 3.92699082F;

		bodyModel[355].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 411
		bodyModel[355].setRotationPoint(-49.7F, -26.1F, -2.7F);
		bodyModel[355].rotateAngleX = 3.14159265F;

		bodyModel[356].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 412
		bodyModel[356].setRotationPoint(-49.7F, -26.1F, -2.7F);
		bodyModel[356].rotateAngleX = 2.35619449F;

		bodyModel[357].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 413
		bodyModel[357].setRotationPoint(-49.7F, -26.1F, -2.7F);
		bodyModel[357].rotateAngleX = 1.57079633F;

		bodyModel[358].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 414
		bodyModel[358].setRotationPoint(-49.7F, -26.1F, -2.7F);
		bodyModel[358].rotateAngleX = 0.78539816F;

		bodyModel[359].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 415
		bodyModel[359].setRotationPoint(-49.7F, -26.1F, -2.7F);

		bodyModel[360].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 416
		bodyModel[360].setRotationPoint(-49.7F, -26.1F, -2.7F);
		bodyModel[360].rotateAngleX = 5.49778714F;

		bodyModel[361].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 417
		bodyModel[361].setRotationPoint(-49.7F, -26.1F, -2.7F);
		bodyModel[361].rotateAngleX = 4.71238898F;

		bodyModel[362].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 418
		bodyModel[362].setRotationPoint(-49.6F, -26.1F, -2.7F);

		bodyModel[363].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F); // Box 419
		bodyModel[363].setRotationPoint(-49.7F, -26.1F, -2.7F);
		bodyModel[363].rotateAngleX = -1.57079633F;

		bodyModel[364].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 421
		bodyModel[364].setRotationPoint(-49.6F, -24.1F, -1.1F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 422
		bodyModel[365].setRotationPoint(-49.6F, -24.1F, -1.1F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F); // Box 423
		bodyModel[366].setRotationPoint(-49.6F, -24.1F, -1.1F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F); // Box 424
		bodyModel[367].setRotationPoint(-49.6F, -24.1F, -1.1F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F); // Box 425
		bodyModel[368].setRotationPoint(-49.6F, -24.1F, -1.1F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F); // Box 426
		bodyModel[369].setRotationPoint(-49.6F, -24.1F, -1.1F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F); // Box 427
		bodyModel[370].setRotationPoint(-49.6F, -24.1F, -1.1F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 428
		bodyModel[371].setRotationPoint(-49.6F, -24.1F, -1.1F);

		bodyModel[372].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 429
		bodyModel[372].setRotationPoint(-49.8F, -29.6F, -4.4F);

		bodyModel[373].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 430
		bodyModel[373].setRotationPoint(-49.8F, -29.6F, -4.4F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F); // Box 431
		bodyModel[374].setRotationPoint(-49.8F, -29.6F, -5.4F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F); // Box 432
		bodyModel[375].setRotationPoint(-49.8F, -29.6F, -5.4F);

		bodyModel[376].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F); // Box 433
		bodyModel[376].setRotationPoint(-49.8F, -29.6F, -5.4F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 434
		bodyModel[377].setRotationPoint(-49.8F, -28.6F, -5.4F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 435
		bodyModel[378].setRotationPoint(-49.8F, -28.6F, -5.4F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 436
		bodyModel[379].setRotationPoint(-49.8F, -28.6F, -4.4F);

		bodyModel[380].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 437
		bodyModel[380].setRotationPoint(-49.9F, -28.6F, -4.4F);
		bodyModel[380].rotateAngleX = 5.49778714F;

		bodyModel[381].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 438
		bodyModel[381].setRotationPoint(-49.9F, -28.6F, -4.4F);

		bodyModel[382].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 439
		bodyModel[382].setRotationPoint(-49.9F, -28.6F, -4.4F);
		bodyModel[382].rotateAngleX = 0.78539816F;

		bodyModel[383].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 440
		bodyModel[383].setRotationPoint(-49.9F, -28.6F, -4.4F);
		bodyModel[383].rotateAngleX = 1.57079633F;

		bodyModel[384].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 441
		bodyModel[384].setRotationPoint(-49.9F, -28.6F, -4.4F);
		bodyModel[384].rotateAngleX = 2.35619449F;

		bodyModel[385].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 442
		bodyModel[385].setRotationPoint(-49.9F, -28.6F, -4.4F);
		bodyModel[385].rotateAngleX = 3.14159265F;

		bodyModel[386].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 443
		bodyModel[386].setRotationPoint(-49.9F, -28.6F, -4.4F);
		bodyModel[386].rotateAngleX = 3.92699082F;

		bodyModel[387].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 444
		bodyModel[387].setRotationPoint(-49.9F, -28.6F, -4.4F);
		bodyModel[387].rotateAngleX = 4.71238898F;

		bodyModel[388].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 445
		bodyModel[388].setRotationPoint(-49.8F, -28.6F, -4.4F);

		bodyModel[389].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, 0F, 0F, -0.48F, 0F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, 0F, 0F, -0.48F, 0F); // Box 446
		bodyModel[389].setRotationPoint(-49.9F, -28.6F, -4.4F);
		bodyModel[389].rotateAngleX = -4.36332313F;

		bodyModel[390].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, 0F, 0F, -0.48F, 0F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, 0F, 0F, -0.48F, 0F); // Box 447
		bodyModel[390].setRotationPoint(-49.9F, -28.6F, -4.4F);
		bodyModel[390].rotateAngleX = -1.32645023F;

		bodyModel[391].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 448
		bodyModel[391].setRotationPoint(-49.8F, -23.5F, 3.5F);

		bodyModel[392].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F); // Box 449
		bodyModel[392].setRotationPoint(-49.8F, -24F, 3F);

		bodyModel[393].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F); // Box 450
		bodyModel[393].setRotationPoint(-49.8F, -24F, 3F);

		bodyModel[394].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F); // Box 451
		bodyModel[394].setRotationPoint(-49.8F, -24F, 3F);

		bodyModel[395].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F); // Box 452
		bodyModel[395].setRotationPoint(-49.8F, -24F, 3F);

		bodyModel[396].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F); // Box 453
		bodyModel[396].setRotationPoint(-49.8F, -24F, 3F);

		bodyModel[397].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 454
		bodyModel[397].setRotationPoint(-49.8F, -24F, 3F);

		bodyModel[398].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 455
		bodyModel[398].setRotationPoint(-49.8F, -24F, 3F);

		bodyModel[399].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 456
		bodyModel[399].setRotationPoint(-49.8F, -24F, 3F);

		bodyModel[400].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F); // Box 457
		bodyModel[400].setRotationPoint(-49.9F, -23.5F, 3.5F);
		bodyModel[400].rotateAngleX = -1.57079633F;

		bodyModel[401].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F); // Box 458
		bodyModel[401].setRotationPoint(-49.7F, -23.6F, 1.5F);
		bodyModel[401].rotateAngleX = -1.57079633F;

		bodyModel[402].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 459
		bodyModel[402].setRotationPoint(-49.6F, -23.6F, 1.5F);

		bodyModel[403].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F); // Box 460
		bodyModel[403].setRotationPoint(-49.6F, -24.1F, 1F);

		bodyModel[404].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F); // Box 461
		bodyModel[404].setRotationPoint(-49.6F, -24.1F, 1F);

		bodyModel[405].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F); // Box 462
		bodyModel[405].setRotationPoint(-49.6F, -24.1F, 1F);

		bodyModel[406].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 463
		bodyModel[406].setRotationPoint(-49.6F, -24.1F, 1F);

		bodyModel[407].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 464
		bodyModel[407].setRotationPoint(-49.6F, -24.1F, 1F);

		bodyModel[408].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 465
		bodyModel[408].setRotationPoint(-49.6F, -24.1F, 1F);

		bodyModel[409].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F); // Box 466
		bodyModel[409].setRotationPoint(-49.6F, -24.1F, 1F);

		bodyModel[410].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F); // Box 467
		bodyModel[410].setRotationPoint(-49.6F, -24.1F, 1F);

		bodyModel[411].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F); // Box 468
		bodyModel[411].setRotationPoint(-49.9F, -29F, 2F);
		bodyModel[411].rotateAngleX = 1.57079633F;

		bodyModel[412].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 469
		bodyModel[412].setRotationPoint(-49.8F, -29F, 2F);

		bodyModel[413].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F); // Box 470
		bodyModel[413].setRotationPoint(-49.8F, -29.5F, 1.5F);

		bodyModel[414].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F); // Box 471
		bodyModel[414].setRotationPoint(-49.8F, -29.5F, 1.5F);

		bodyModel[415].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F); // Box 472
		bodyModel[415].setRotationPoint(-49.8F, -29.5F, 1.5F);

		bodyModel[416].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 473
		bodyModel[416].setRotationPoint(-49.8F, -29.5F, 1.5F);

		bodyModel[417].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 474
		bodyModel[417].setRotationPoint(-49.8F, -29.5F, 1.5F);

		bodyModel[418].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 475
		bodyModel[418].setRotationPoint(-49.8F, -29.5F, 1.5F);

		bodyModel[419].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F); // Box 476
		bodyModel[419].setRotationPoint(-49.8F, -29.5F, 1.5F);

		bodyModel[420].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F); // Box 477
		bodyModel[420].setRotationPoint(-49.8F, -29.5F, 1.5F);

		bodyModel[421].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F); // Box 478
		bodyModel[421].setRotationPoint(-49.8F, -24F, -6.5F);

		bodyModel[422].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F); // Box 480
		bodyModel[422].setRotationPoint(-49.8F, -24F, -6.5F);

		bodyModel[423].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F); // Box 481
		bodyModel[423].setRotationPoint(-49.8F, -24F, -6.5F);

		bodyModel[424].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F); // Box 482
		bodyModel[424].setRotationPoint(-49.8F, -24F, -6.5F);

		bodyModel[425].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F); // Box 483
		bodyModel[425].setRotationPoint(-49.8F, -24F, -6.5F);

		bodyModel[426].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 484
		bodyModel[426].setRotationPoint(-49.8F, -24F, -6.5F);

		bodyModel[427].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 485
		bodyModel[427].setRotationPoint(-49.8F, -24F, -6.5F);

		bodyModel[428].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 486
		bodyModel[428].setRotationPoint(-49.8F, -24F, -6.5F);

		bodyModel[429].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, 0F, 0F, -0.48F, 0F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, 0F, 0F, -0.48F, 0F); // Box 487
		bodyModel[429].setRotationPoint(-49.9F, -23.5F, -6.6F);
		bodyModel[429].rotateAngleX = -0.38397244F;

		bodyModel[430].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 488
		bodyModel[430].setRotationPoint(-49.8F, -21.3F, -1.6F);

		bodyModel[431].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 489
		bodyModel[431].setRotationPoint(-49.8F, -21.3F, 0.4F);

		bodyModel[432].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F); // Box 460
		bodyModel[432].setRotationPoint(-49.8F, -24.5F, 4.8F);

		bodyModel[433].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 461
		bodyModel[433].setRotationPoint(-49.8F, -24.5F, 5.8F);

		bodyModel[434].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 462
		bodyModel[434].setRotationPoint(-49.8F, -23.5F, 5.8F);

		bodyModel[435].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 463
		bodyModel[435].setRotationPoint(-49.8F, -23.5F, 4.8F);

		bodyModel[436].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 464
		bodyModel[436].setRotationPoint(-49.8F, -23.5F, 4.8F);

		bodyModel[437].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F); // Box 465
		bodyModel[437].setRotationPoint(-49.8F, -24.5F, 4.8F);

		bodyModel[438].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 466
		bodyModel[438].setRotationPoint(-49.9F, -23.5F, 5.8F);
		bodyModel[438].rotateAngleX = 3.14159265F;

		bodyModel[439].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F); // Box 467
		bodyModel[439].setRotationPoint(-49.8F, -24.5F, 4.8F);

		bodyModel[440].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F); // Box 468
		bodyModel[440].setRotationPoint(-49.9F, -23.5F, 5.8F);
		bodyModel[440].rotateAngleX = -3.90953752F;

		bodyModel[441].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 469
		bodyModel[441].setRotationPoint(-49.8F, -23.5F, 5.8F);

		bodyModel[442].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 470
		bodyModel[442].setRotationPoint(-49.9F, -23.5F, 5.8F);
		bodyModel[442].rotateAngleX = 3.92699082F;

		bodyModel[443].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 471
		bodyModel[443].setRotationPoint(-49.9F, -23.5F, 5.8F);
		bodyModel[443].rotateAngleX = 5.49778714F;

		bodyModel[444].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 472
		bodyModel[444].setRotationPoint(-49.9F, -23.5F, 5.8F);

		bodyModel[445].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 473
		bodyModel[445].setRotationPoint(-49.9F, -23.5F, 5.8F);
		bodyModel[445].rotateAngleX = 0.78539816F;

		bodyModel[446].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 474
		bodyModel[446].setRotationPoint(-49.9F, -23.5F, 5.8F);
		bodyModel[446].rotateAngleX = 1.57079633F;

		bodyModel[447].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 475
		bodyModel[447].setRotationPoint(-49.9F, -23.5F, 5.8F);
		bodyModel[447].rotateAngleX = 2.35619449F;

		bodyModel[448].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 476
		bodyModel[448].setRotationPoint(-49.8F, -24.5F, 5.8F);

		bodyModel[449].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F); // Box 477
		bodyModel[449].setRotationPoint(-49.9F, -28.5F, -2F);
		bodyModel[449].rotateAngleX = 1.57079633F;

		bodyModel[450].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 478
		bodyModel[450].setRotationPoint(-49.8F, -29F, -2F);

		bodyModel[451].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 479
		bodyModel[451].setRotationPoint(-49.8F, -29.5F, -2.5F);

		bodyModel[452].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 480
		bodyModel[452].setRotationPoint(-49.8F, -29.5F, -2.5F);

		bodyModel[453].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F); // Box 481
		bodyModel[453].setRotationPoint(-49.8F, -29.5F, -2.5F);

		bodyModel[454].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F); // Box 482
		bodyModel[454].setRotationPoint(-49.8F, -29.5F, -2.5F);

		bodyModel[455].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F); // Box 483
		bodyModel[455].setRotationPoint(-49.8F, -29.5F, -2.5F);

		bodyModel[456].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F); // Box 484
		bodyModel[456].setRotationPoint(-49.8F, -29.5F, -2.5F);

		bodyModel[457].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F); // Box 485
		bodyModel[457].setRotationPoint(-49.8F, -29.5F, -2.5F);

		bodyModel[458].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 486
		bodyModel[458].setRotationPoint(-49.8F, -29.5F, -2.5F);

		bodyModel[459].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 487
		bodyModel[459].setRotationPoint(-49.8F, -24.8F, -4F);

		bodyModel[460].addShapeBox(0F, 0F, 0F, 7, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 462
		bodyModel[460].setRotationPoint(-55F, -31F, -5F);

		bodyModel[461].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, -2F, 0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 2F, 2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 463
		bodyModel[461].setRotationPoint(-52F, -31F, -8F);

		bodyModel[462].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 465
		bodyModel[462].setRotationPoint(-49.5F, -31.5F, -1F);

		bodyModel[463].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, 0F); // Box 466
		bodyModel[463].setRotationPoint(-49.5F, -32F, -1F);

		bodyModel[464].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 467
		bodyModel[464].setRotationPoint(-48F, -32.25F, -1F);

		bodyModel[465].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 468
		bodyModel[465].setRotationPoint(-48F, -31.25F, -1F);

		bodyModel[466].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.6F, -0.25F, 0F); // Box 469
		bodyModel[466].setRotationPoint(-48.1F, -30.75F, -1F);

		bodyModel[467].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.7F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.5F, 0F, -0.7F, -0.5F, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 470
		bodyModel[467].setRotationPoint(-49.5F, -33F, -1F);

		bodyModel[468].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.7F, -0.5F, -0.3F, -0.2F, -0.5F, -0.3F, -0.2F, -0.3F, 0F, -0.7F, -0.3F, 0F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 471
		bodyModel[468].setRotationPoint(-49.5F, -33F, 0F);

		bodyModel[469].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.1F); // Box 472
		bodyModel[469].setRotationPoint(-47.7F, -32F, -1F);

		bodyModel[470].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,-2F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 512
		bodyModel[470].setRotationPoint(-55F, -31F, -8F);

		bodyModel[471].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1F, 0F, -1.5F); // Box 513
		bodyModel[471].setRotationPoint(-53F, -29F, -9F);

		bodyModel[472].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 514
		bodyModel[472].setRotationPoint(-52F, -27F, -9F);

		bodyModel[473].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 2F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 2F, 2F, 0F, 0F, 2F, 0F); // Box 515
		bodyModel[473].setRotationPoint(-52F, -31F, 5F);

		bodyModel[474].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 516
		bodyModel[474].setRotationPoint(-55F, -31F, 5F);

		bodyModel[475].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 517
		bodyModel[475].setRotationPoint(-53F, -29F, 7F);

		bodyModel[476].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 517
		bodyModel[476].setRotationPoint(-52F, -27F, 8F);

		bodyModel[477].addShapeBox(0F, 0F, 0F, 7, 9, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 518
		bodyModel[477].setRotationPoint(-59F, -21F, -10F);

		bodyModel[478].addShapeBox(0F, 1F, 0F, 10, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
		bodyModel[478].setRotationPoint(-43F, -16F, -5F);
		bodyModel[478].rotateAngleZ = -0.10471976F;

		bodyModel[479].addShapeBox(9F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		bodyModel[479].setRotationPoint(-43F, -16F, -5F);
		bodyModel[479].rotateAngleZ = -0.10471976F;

		bodyModel[480].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		bodyModel[480].setRotationPoint(-43F, -16F, -5F);
		bodyModel[480].rotateAngleZ = -0.10471976F;

		bodyModel[481].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		bodyModel[481].setRotationPoint(-43F, -16F, 4F);
		bodyModel[481].rotateAngleZ = -0.10471976F;

		bodyModel[482].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		bodyModel[482].setRotationPoint(-43F, -16F, -5F);
		bodyModel[482].rotateAngleZ = -0.10471976F;

		bodyModel[483].addShapeBox(0F, 0F, 0F, 1, 15, 10, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		bodyModel[483].setRotationPoint(-34F, -30F, -5F);

		bodyModel[484].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[484].setRotationPoint(-32F, -34F, -3F);

		bodyModel[485].addShapeBox(0F, 0F, 0F, 1, 15, 8, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 246
		bodyModel[485].setRotationPoint(-35F, -29F, -4F);

		bodyModel[486].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[486].setRotationPoint(-35.3F, -29.3F, -2F);

		bodyModel[487].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[487].setRotationPoint(-35.3F, -29.3F, 1F);

		bodyModel[488].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[488].setRotationPoint(-33F, -27F, -4F);

		bodyModel[489].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 251
		bodyModel[489].setRotationPoint(-33F, -27F, 3F);

		bodyModel[490].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[490].setRotationPoint(-40F, -15F, -6F);
		bodyModel[490].rotateAngleZ = 0.78539816F;

		bodyModel[491].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 253
		bodyModel[491].setRotationPoint(-40F, -15F, 5F);
		bodyModel[491].rotateAngleZ = 0.78539816F;

		bodyModel[492].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 962
		bodyModel[492].setRotationPoint(-32.5F, -33.5F, -1.5F);

		bodyModel[493].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 964
		bodyModel[493].setRotationPoint(-32.5F, -32.5F, -1.5F);

		bodyModel[494].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 966
		bodyModel[494].setRotationPoint(-32.5F, -31.5F, -1.5F);

		bodyModel[495].addShapeBox(0F, 0F, 0F, 5, 9, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 256
		bodyModel[495].setRotationPoint(-55F, -21F, -2F);

		bodyModel[496].addShapeBox(0F, 0F, 0F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[496].setRotationPoint(-49F, -14F, -2F);

		bodyModel[497].addShapeBox(0F, 0F, 0F, 7, 3, 3, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 254
		bodyModel[497].setRotationPoint(-49F, -15F, -1.5F);

		bodyModel[498].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 263
		bodyModel[498].setRotationPoint(-47.5F, -18F, -1F);

		bodyModel[499].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 264
		bodyModel[499].setRotationPoint(-47F, -22F, -0.5F);
	}

	private void initbodyModel_2()
	{
		bodyModel[500] = new ModelRendererTurbo(this, 105, 346, textureX, textureY); // Box 265
		bodyModel[501] = new ModelRendererTurbo(this, 201, 346, textureX, textureY); // Box 266
		bodyModel[502] = new ModelRendererTurbo(this, 281, 346, textureX, textureY); // Box 543
		bodyModel[503] = new ModelRendererTurbo(this, 297, 346, textureX, textureY); // Box 544
		bodyModel[504] = new ModelRendererTurbo(this, 313, 346, textureX, textureY); // Import 
		bodyModel[505] = new ModelRendererTurbo(this, 369, 346, textureX, textureY); // Import 
		bodyModel[506] = new ModelRendererTurbo(this, 225, 346, textureX, textureY); // Import 
		bodyModel[507] = new ModelRendererTurbo(this, 289, 346, textureX, textureY); // Import 
		bodyModel[508] = new ModelRendererTurbo(this, 377, 346, textureX, textureY); // Import 
		bodyModel[509] = new ModelRendererTurbo(this, 385, 346, textureX, textureY); // Import 
		bodyModel[510] = new ModelRendererTurbo(this, 305, 346, textureX, textureY); // Import 
		bodyModel[511] = new ModelRendererTurbo(this, 361, 346, textureX, textureY); // Import 
		bodyModel[512] = new ModelRendererTurbo(this, 393, 346, textureX, textureY); // Import 
		bodyModel[513] = new ModelRendererTurbo(this, 401, 346, textureX, textureY); // Import 
		bodyModel[514] = new ModelRendererTurbo(this, 409, 346, textureX, textureY); // Import 
		bodyModel[515] = new ModelRendererTurbo(this, 457, 346, textureX, textureY); // Import 
		bodyModel[516] = new ModelRendererTurbo(this, 505, 346, textureX, textureY); // Import 
		bodyModel[517] = new ModelRendererTurbo(this, 553, 346, textureX, textureY); // Box 577
		bodyModel[518] = new ModelRendererTurbo(this, 561, 346, textureX, textureY); // Box 559
		bodyModel[519] = new ModelRendererTurbo(this, 577, 346, textureX, textureY); // Box 560
		bodyModel[520] = new ModelRendererTurbo(this, 633, 346, textureX, textureY); // Box 561
		bodyModel[521] = new ModelRendererTurbo(this, 633, 346, textureX, textureY); // Box 562
		bodyModel[522] = new ModelRendererTurbo(this, 697, 346, textureX, textureY); // Box 563
		bodyModel[523] = new ModelRendererTurbo(this, 737, 346, textureX, textureY); // Box 564
		bodyModel[524] = new ModelRendererTurbo(this, 673, 346, textureX, textureY); // Box 565
		bodyModel[525] = new ModelRendererTurbo(this, 377, 906, textureX, textureY); // Box 571
		bodyModel[526] = new ModelRendererTurbo(this, 1401, 934, textureX, textureY); // Box 578
		bodyModel[527] = new ModelRendererTurbo(this, 1401, 958, textureX, textureY); // Box 579
		bodyModel[528] = new ModelRendererTurbo(this, 1257, 958, textureX, textureY); // Box 812
		bodyModel[529] = new ModelRendererTurbo(this, 1545, 958, textureX, textureY); // Box 813
		bodyModel[530] = new ModelRendererTurbo(this, 1569, 958, textureX, textureY); // Box 814
		bodyModel[531] = new ModelRendererTurbo(this, 1601, 958, textureX, textureY); // Box 815
		bodyModel[532] = new ModelRendererTurbo(this, 2041, 408, textureX, textureY); // Box 819
		bodyModel[533] = new ModelRendererTurbo(this, 41, 416, textureX, textureY); // Box 823
		bodyModel[534] = new ModelRendererTurbo(this, 49, 416, textureX, textureY); // Box 824
		bodyModel[535] = new ModelRendererTurbo(this, 89, 416, textureX, textureY); // Box 825

		bodyModel[500].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 265
		bodyModel[500].setRotationPoint(-47F, -24F, -0.5F);

		bodyModel[501].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 266
		bodyModel[501].setRotationPoint(-46.7F, -24.1F, -0.5F);

		bodyModel[502].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 543
		bodyModel[502].setRotationPoint(-52F, -16.5F, -6F);
		bodyModel[502].rotateAngleZ = 0.34906585F;

		bodyModel[503].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 544
		bodyModel[503].setRotationPoint(-52F, -16.5F, 3F);
		bodyModel[503].rotateAngleZ = 0.34906585F;

		bodyModel[504].addShapeBox(0F, 0F, 0F, 21, 9, 3, 0F,0.0F, 1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import 
		bodyModel[504].setRotationPoint(-49F, -20.5F, -9.7F);

		bodyModel[505].addShapeBox(0F, -3F, 0F, 1, 3, 1, 0F,-0.2F, 0.0F, -0.4F, -0.2F, 0.0F, -0.4F, -0.2F, 0.0F, -0.4F, -0.2F, 0.0F, -0.4F, -0.2F, 0.0F, -0.4F, -0.2F, 0.0F, -0.4F, -0.2F, 0.0F, -0.4F, -0.2F, 0.0F, -0.4F); // Import 
		bodyModel[505].setRotationPoint(-40F, -20.5F, -9.6F);

		bodyModel[506].addShapeBox(0F, -3.2F, 0F, 1, 1, 1, 0F,-0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F); // Import 
		bodyModel[506].setRotationPoint(-40F, -20.5F, -10.2F);

		bodyModel[507].addShapeBox(0F, -3.2F, 0F, 1, 1, 1, 0F,-0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F); // Import 
		bodyModel[507].setRotationPoint(-39F, -20.5F, -9.2F);

		bodyModel[508].addShapeBox(0F, -3F, 0F, 1, 3, 1, 0F,-0.2F, 0.0F, -0.4F, -0.2F, 0.0F, -0.4F, -0.2F, 0.0F, -0.4F, -0.2F, 0.0F, -0.4F, -0.2F, 0.0F, -0.4F, -0.2F, 0.0F, -0.4F, -0.2F, 0.0F, -0.4F, -0.2F, 0.0F, -0.4F); // Import 
		bodyModel[508].setRotationPoint(-39F, -20.5F, -8.6F);

		bodyModel[509].addShapeBox(0F, -2F, 0F, 1, 2, 1, 0F,-0.3F, 0.0F, -0.4F, -0.3F, 0.0F, -0.4F, -0.3F, 0.0F, -0.4F, -0.3F, 0.0F, -0.4F, -0.3F, 0.0F, -0.4F, -0.3F, 0.0F, -0.4F, -0.3F, 0.0F, -0.4F, -0.3F, 0.0F, -0.4F); // Import 
		bodyModel[509].setRotationPoint(-40F, -20.5F, -7.6F);

		bodyModel[510].addShapeBox(0F, -2.8F, 0F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Import 
		bodyModel[510].setRotationPoint(-40F, -20.5F, -7.6F);

		bodyModel[511].addShapeBox(0F, -2.8F, 0F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Import 
		bodyModel[511].setRotationPoint(-43F, -20.5F, -8.2F);

		bodyModel[512].addShapeBox(0F, -2F, 0F, 1, 2, 1, 0F,-0.3F, 0.0F, -0.4F, -0.3F, 0.0F, -0.4F, -0.3F, 0.0F, -0.4F, -0.3F, 0.0F, -0.4F, -0.3F, 0.0F, -0.4F, -0.3F, 0.0F, -0.4F, -0.3F, 0.0F, -0.4F, -0.3F, 0.0F, -0.4F); // Import 
		bodyModel[512].setRotationPoint(-43F, -20.5F, -9.2F);

		bodyModel[513].addShapeBox(0F, -2.8F, 0F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Import 
		bodyModel[513].setRotationPoint(-43F, -20.5F, -9.2F);

		bodyModel[514].addShapeBox(0F, 0F, 0F, 21, 2, 1, 0F,0.0F, 1.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 1.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F); // Import 
		bodyModel[514].setRotationPoint(-49F, -20.7F, -8.7F);

		bodyModel[515].addShapeBox(0F, 0F, 0F, 21, 2, 1, 0F,0.0F, 1.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 1.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F); // Import 
		bodyModel[515].setRotationPoint(-49F, -20.7F, -7.7F);

		bodyModel[516].addShapeBox(0F, 0F, 0F, 21, 2, 1, 0F,0.0F, 1.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 1.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F); // Import 
		bodyModel[516].setRotationPoint(-49F, -20.7F, -9.7F);

		bodyModel[517].addShapeBox(0F, -2F, 0F, 1, 2, 1, 0F,-0.3F, 0.0F, -0.4F, -0.3F, 0.0F, -0.4F, -0.3F, 0.0F, -0.4F, -0.3F, 0.0F, -0.4F, -0.3F, 0.0F, -0.4F, -0.3F, 0.0F, -0.4F, -0.3F, 0.0F, -0.4F, -0.3F, 0.0F, -0.4F); // Box 577
		bodyModel[517].setRotationPoint(-43F, -20.5F, -8.2F);

		bodyModel[518].addShapeBox(0F, 0F, 0F, 3, 10, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 559
		bodyModel[518].setRotationPoint(-52F, -21.5F, -9.7F);

		bodyModel[519].addShapeBox(0F, 0F, 0F, 21, 9, 3, 0F,0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 1.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Box 560
		bodyModel[519].setRotationPoint(-49F, -20.5F, 6.7F);

		bodyModel[520].addShapeBox(0F, 0F, 0F, 3, 10, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 561
		bodyModel[520].setRotationPoint(-52F, -21.5F, 6.7F);

		bodyModel[521].addShapeBox(0F, 0F, 0F, 9, 15, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 562
		bodyModel[521].setRotationPoint(-29F, -25F, -10F);

		bodyModel[522].addShapeBox(0F, 0F, 0F, 9, 4, 20, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 563
		bodyModel[522].setRotationPoint(-29F, -29F, -10F);

		bodyModel[523].addShapeBox(0F, 0F, 0F, 11, 3, 16, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 564
		bodyModel[523].setRotationPoint(-29F, -32F, -8F);

		bodyModel[524].addShapeBox(0F, 0F, 0F, 11, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 565
		bodyModel[524].setRotationPoint(-29F, -34F, -3F);

		bodyModel[525].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 571
		bodyModel[525].setRotationPoint(-14F, -32.5F, -0.5F);

		bodyModel[526].addShapeBox(0F, 0F, 0F, 17, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 3.5F, 0F, 0F, 3.5F); // Box 578
		bodyModel[526].setRotationPoint(-55F, -19F, -15F);

		bodyModel[527].addShapeBox(0F, 0F, 0F, 17, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.5F, 0F, 0F, 3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F); // Box 579
		bodyModel[527].setRotationPoint(-55F, -19F, 14F);

		bodyModel[528].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 812
		bodyModel[528].setRotationPoint(-46F, -38.5F, -2.5F);

		bodyModel[529].addShapeBox(0F, 0F, 0F, 9, 0, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 813
		bodyModel[529].setRotationPoint(-42F, -39F, -2.5F);

		bodyModel[530].addShapeBox(0F, 0F, 0F, 8, 1, 5, 0F,0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F); // Box 814
		bodyModel[530].setRotationPoint(-33F, -38.5F, -2.5F);

		bodyModel[531].addShapeBox(0F, 0F, 0F, 7, 1, 5, 0F,0F, 0.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, -1.5F, 0F); // Box 815
		bodyModel[531].setRotationPoint(-25F, -36.5F, -2.5F);

		bodyModel[532].addShapeBox(0F, -0.05F, -1.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 819
		bodyModel[532].setRotationPoint(-49.9F, -26.1F, 5.8F);
		bodyModel[532].rotateAngleX = 1.57079633F;

		bodyModel[533].addShapeBox(0F, -0.05F, -1.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 823
		bodyModel[533].setRotationPoint(-49.9F, -23.5F, 5.8F);
		bodyModel[533].rotateAngleX = 1.57079633F;

		bodyModel[534].addShapeBox(0F, -0.5F, -2.55F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 824
		bodyModel[534].setRotationPoint(-49.6F, -23.6F, 1.5F);

		bodyModel[535].addShapeBox(0F, 1.55F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F); // Box 825
		bodyModel[535].setRotationPoint(-49.7F, -23.6F, 1.5F);
		bodyModel[535].rotateAngleX = -1.57079633F;
	}

	private void initnoseModel_1()
	{
		noseModel[0] = new ModelRendererTurbo(this, 153, 982, textureX, textureY); // Box 17
		noseModel[1] = new ModelRendererTurbo(this, 209, 982, textureX, textureY); // Box 18
		noseModel[2] = new ModelRendererTurbo(this, 265, 982, textureX, textureY); // Box 19
		noseModel[3] = new ModelRendererTurbo(this, 305, 982, textureX, textureY); // Box 23
		noseModel[4] = new ModelRendererTurbo(this, 345, 982, textureX, textureY); // Box 24
		noseModel[5] = new ModelRendererTurbo(this, 441, 982, textureX, textureY); // Box 59
		noseModel[6] = new ModelRendererTurbo(this, 497, 982, textureX, textureY); // Box 60
		noseModel[7] = new ModelRendererTurbo(this, 537, 982, textureX, textureY); // Box 63
		noseModel[8] = new ModelRendererTurbo(this, 577, 982, textureX, textureY); // Box 64
		noseModel[9] = new ModelRendererTurbo(this, 641, 982, textureX, textureY); // Box 104
		noseModel[10] = new ModelRendererTurbo(this, 745, 982, textureX, textureY); // Box 106
		noseModel[11] = new ModelRendererTurbo(this, 801, 982, textureX, textureY); // Box 107
		noseModel[12] = new ModelRendererTurbo(this, 881, 982, textureX, textureY); // Box 125
		noseModel[13] = new ModelRendererTurbo(this, 969, 982, textureX, textureY); // Box 127
		noseModel[14] = new ModelRendererTurbo(this, 1017, 982, textureX, textureY); // Box 128
		noseModel[15] = new ModelRendererTurbo(this, 1097, 982, textureX, textureY); // Box 130
		noseModel[16] = new ModelRendererTurbo(this, 1137, 982, textureX, textureY); // Box 131
		noseModel[17] = new ModelRendererTurbo(this, 1177, 982, textureX, textureY); // Box 132
		noseModel[18] = new ModelRendererTurbo(this, 1233, 982, textureX, textureY); // Box 133
		noseModel[19] = new ModelRendererTurbo(this, 1273, 982, textureX, textureY); // Box 134
		noseModel[20] = new ModelRendererTurbo(this, 1321, 982, textureX, textureY); // Box 135
		noseModel[21] = new ModelRendererTurbo(this, 1361, 982, textureX, textureY); // Box 136
		noseModel[22] = new ModelRendererTurbo(this, 1393, 982, textureX, textureY); // Box 137
		noseModel[23] = new ModelRendererTurbo(this, 1441, 982, textureX, textureY); // Box 143
		noseModel[24] = new ModelRendererTurbo(this, 1481, 982, textureX, textureY); // Box 144
		noseModel[25] = new ModelRendererTurbo(this, 1521, 982, textureX, textureY); // Box 145
		noseModel[26] = new ModelRendererTurbo(this, 1561, 982, textureX, textureY); // Box 146
		noseModel[27] = new ModelRendererTurbo(this, 1601, 982, textureX, textureY); // Box 147
		noseModel[28] = new ModelRendererTurbo(this, 1641, 982, textureX, textureY); // Box 148
		noseModel[29] = new ModelRendererTurbo(this, 1673, 982, textureX, textureY); // Box 149
		noseModel[30] = new ModelRendererTurbo(this, 97, 982, textureX, textureY); // Box 150
		noseModel[31] = new ModelRendererTurbo(this, 137, 982, textureX, textureY); // Box 151
		noseModel[32] = new ModelRendererTurbo(this, 193, 982, textureX, textureY); // Box 152
		noseModel[33] = new ModelRendererTurbo(this, 249, 982, textureX, textureY); // Box 153
		noseModel[34] = new ModelRendererTurbo(this, 385, 982, textureX, textureY); // Box 154
		noseModel[35] = new ModelRendererTurbo(this, 481, 982, textureX, textureY); // Box 155
		noseModel[36] = new ModelRendererTurbo(this, 681, 982, textureX, textureY); // Box 156
		noseModel[37] = new ModelRendererTurbo(this, 1, 982, textureX, textureY); // Box 157
		noseModel[38] = new ModelRendererTurbo(this, 9, 982, textureX, textureY); // Box 158
		noseModel[39] = new ModelRendererTurbo(this, 41, 982, textureX, textureY); // Box 159
		noseModel[40] = new ModelRendererTurbo(this, 153, 1003, textureX, textureY); // Box 269
		noseModel[41] = new ModelRendererTurbo(this, 209, 1003, textureX, textureY); // Box 270
		noseModel[42] = new ModelRendererTurbo(this, 265, 1003, textureX, textureY); // Box 271
		noseModel[43] = new ModelRendererTurbo(this, 305, 1003, textureX, textureY); // Box 276
		noseModel[44] = new ModelRendererTurbo(this, 345, 1003, textureX, textureY); // Box 277
		noseModel[45] = new ModelRendererTurbo(this, 441, 1003, textureX, textureY); // Box 310
		noseModel[46] = new ModelRendererTurbo(this, 497, 1003, textureX, textureY); // Box 311
		noseModel[47] = new ModelRendererTurbo(this, 537, 1003, textureX, textureY); // Box 314
		noseModel[48] = new ModelRendererTurbo(this, 577, 1003, textureX, textureY); // Box 315
		noseModel[49] = new ModelRendererTurbo(this, 641, 1003, textureX, textureY); // Box 357
		noseModel[50] = new ModelRendererTurbo(this, 745, 1003, textureX, textureY); // Box 359
		noseModel[51] = new ModelRendererTurbo(this, 801, 1003, textureX, textureY); // Box 360
		noseModel[52] = new ModelRendererTurbo(this, 881, 1003, textureX, textureY); // Box 378
		noseModel[53] = new ModelRendererTurbo(this, 969, 1003, textureX, textureY); // Box 380
		noseModel[54] = new ModelRendererTurbo(this, 1017, 1003, textureX, textureY); // Box 381
		noseModel[55] = new ModelRendererTurbo(this, 1097, 1003, textureX, textureY); // Box 383
		noseModel[56] = new ModelRendererTurbo(this, 1137, 1003, textureX, textureY); // Box 384
		noseModel[57] = new ModelRendererTurbo(this, 1177, 1003, textureX, textureY); // Box 385
		noseModel[58] = new ModelRendererTurbo(this, 1233, 1003, textureX, textureY); // Box 386
		noseModel[59] = new ModelRendererTurbo(this, 1273, 1003, textureX, textureY); // Box 387
		noseModel[60] = new ModelRendererTurbo(this, 1321, 1003, textureX, textureY); // Box 388
		noseModel[61] = new ModelRendererTurbo(this, 1361, 1003, textureX, textureY); // Box 389
		noseModel[62] = new ModelRendererTurbo(this, 1393, 1003, textureX, textureY); // Box 390
		noseModel[63] = new ModelRendererTurbo(this, 1441, 1003, textureX, textureY); // Box 396
		noseModel[64] = new ModelRendererTurbo(this, 1481, 1003, textureX, textureY); // Box 397
		noseModel[65] = new ModelRendererTurbo(this, 1521, 1003, textureX, textureY); // Box 398
		noseModel[66] = new ModelRendererTurbo(this, 1561, 1003, textureX, textureY); // Box 399
		noseModel[67] = new ModelRendererTurbo(this, 1601, 1003, textureX, textureY); // Box 400
		noseModel[68] = new ModelRendererTurbo(this, 1641, 1003, textureX, textureY); // Box 401
		noseModel[69] = new ModelRendererTurbo(this, 1673, 1003, textureX, textureY); // Box 402
		noseModel[70] = new ModelRendererTurbo(this, 97, 1003, textureX, textureY); // Box 403
		noseModel[71] = new ModelRendererTurbo(this, 137, 1003, textureX, textureY); // Box 404
		noseModel[72] = new ModelRendererTurbo(this, 193, 1003, textureX, textureY); // Box 405
		noseModel[73] = new ModelRendererTurbo(this, 249, 1003, textureX, textureY); // Box 406
		noseModel[74] = new ModelRendererTurbo(this, 385, 1003, textureX, textureY); // Box 407
		noseModel[75] = new ModelRendererTurbo(this, 481, 1003, textureX, textureY); // Box 408
		noseModel[76] = new ModelRendererTurbo(this, 681, 1003, textureX, textureY); // Box 409
		noseModel[77] = new ModelRendererTurbo(this, 1, 1003, textureX, textureY); // Box 411
		noseModel[78] = new ModelRendererTurbo(this, 9, 1003, textureX, textureY); // Box 412
		noseModel[79] = new ModelRendererTurbo(this, 1705, 982, textureX, textureY); // Box 572
		noseModel[80] = new ModelRendererTurbo(this, 1737, 982, textureX, textureY); // Box 573
		noseModel[81] = new ModelRendererTurbo(this, 1769, 982, textureX, textureY); // Box 574
		noseModel[82] = new ModelRendererTurbo(this, 1705, 1003, textureX, textureY); // Box 575
		noseModel[83] = new ModelRendererTurbo(this, 1737, 1003, textureX, textureY); // Box 576
		noseModel[84] = new ModelRendererTurbo(this, 1769, 1003, textureX, textureY); // Box 577
		noseModel[85] = new ModelRendererTurbo(this, 161, 1003, textureX, textureY); // Box 817
		noseModel[86] = new ModelRendererTurbo(this, 297, 1003, textureX, textureY); // Box 818
		noseModel[87] = new ModelRendererTurbo(this, 57, 982, textureX, textureY); // Box 820
		noseModel[88] = new ModelRendererTurbo(this, 41, 1003, textureX, textureY); // Box 821
		noseModel[89] = new ModelRendererTurbo(this, 57, 1003, textureX, textureY); // Box 822

		noseModel[0].addShapeBox(0F, 0F, 0F, 11, 5, 13, 0F,0F, -0.5F, -3F, -3F, 0F, -2F, -3F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		noseModel[0].setRotationPoint(-77F, -25F, -13F);

		noseModel[1].addShapeBox(0F, 0F, 0F, 11, 4, 13, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 18
		noseModel[1].setRotationPoint(-77F, -20F, -13F);

		noseModel[2].addShapeBox(0F, 0F, 0F, 8, 4, 11, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 19
		noseModel[2].setRotationPoint(-85F, -20F, -11F);

		noseModel[3].addShapeBox(0F, 0F, 0F, 8, 4, 11, 0F,0F, 0F, -2F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		noseModel[3].setRotationPoint(-85F, -24F, -11F);

		noseModel[4].addShapeBox(0F, 0F, 0F, 14, 4, 10, 0F,0F, -0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, -3F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 24
		noseModel[4].setRotationPoint(-99F, -20F, -10F);

		noseModel[5].addShapeBox(0F, 0F, 0F, 14, 4, 10, 0F,0F, -1.5F, -3.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 59
		noseModel[5].setRotationPoint(-99F, -24F, -10F);

		noseModel[6].addShapeBox(0F, 0F, 0F, 8, 3, 11, 0F,0F, -0.5F, -3.5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 60
		noseModel[6].setRotationPoint(-77F, -28F, -11F);

		noseModel[7].addShapeBox(0F, 0F, 0F, 8, 2, 10, 0F,0F, 0F, -3.5F, 0F, 0.5F, -2.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F); // Box 63
		noseModel[7].setRotationPoint(-85F, -27F, -10F);

		noseModel[8].addShapeBox(0F, 0F, 0F, 14, 3, 9, 0F,0F, -2F, -4F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1.5F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F); // Box 64
		noseModel[8].setRotationPoint(-99F, -27F, -9F);

		noseModel[9].addShapeBox(0F, 0F, 0F, 11, 1, 13, 0F,0F, -0.9999F, -1.9999F, 0F, 0F, 0.9999F, 0F, 0F, 0F, 0F, -0.9999F, 0F, 0F, 0F, -1.9999F, 0F, 0F, -0.9999F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		noseModel[9].setRotationPoint(-77F, -17F, -13F);

		noseModel[10].addShapeBox(0F, 0F, 0F, 11, 4, 13, 0F,0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		noseModel[10].setRotationPoint(-77F, -16F, -13F);

		noseModel[11].addShapeBox(0F, 0F, 0F, 8, 4, 11, 0F,0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, -2.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		noseModel[11].setRotationPoint(-85F, -16F, -11F);

		noseModel[12].addShapeBox(0F, 0F, 0F, 11, 3, 10, 0F,0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 125
		noseModel[12].setRotationPoint(-77F, -12F, -10F);

		noseModel[13].addShapeBox(0F, 0F, 0F, 11, 1, 11, 0F,0F, -0.49999F, -2.49999F, 0F, 0F, -0.9999F, 0F, 0F, 0F, 0F, -0.49999F, 0F, 0F, -0.49999F, -2.49999F, 0F, 0F, -0.49999F, 0F, 0F, 0F, 0F, -0.49999F, 0F); // Box 127
		noseModel[13].setRotationPoint(-77F, -9F, -11F);

		noseModel[14].addShapeBox(0F, 0F, 0F, 8, 3, 10, 0F,0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 128
		noseModel[14].setRotationPoint(-85F, -12F, -10F);

		noseModel[15].addShapeBox(0F, 0F, 0F, 11, 2, 11, 0F,0F, 0.5F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, -6F, 0F, 0F, -5F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 130
		noseModel[15].setRotationPoint(-77F, -8F, -11F);

		noseModel[16].addShapeBox(0F, 0F, 0F, 8, 2, 8, 0F,0F, 0F, -1.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0.5F, -3F, 0F, 1F, 0F, 0F, 0.5F, 0F); // Box 131
		noseModel[16].setRotationPoint(-85F, -9F, -8F);

		noseModel[17].addShapeBox(0F, 0F, 0F, 14, 3, 10, 0F,0F, 1F, -3F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, -1F, -3.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 132
		noseModel[17].setRotationPoint(-99F, -15F, -10F);

		noseModel[18].addShapeBox(0F, 0F, 0F, 14, 3, 9, 0F,0F, 1F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1.5F, -4F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Box 133
		noseModel[18].setRotationPoint(-99F, -12F, -9F);

		noseModel[19].addShapeBox(0F, 0F, 0F, 14, 2, 6, 0F,0F, 1.5F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -2F, -3F, 0F, 0F, -1.5F, 0F, 0.5F, 0F, 0F, -1F, 0F); // Box 134
		noseModel[19].setRotationPoint(-99F, -9F, -6F);

		noseModel[20].addShapeBox(0F, 0F, 0F, 8, 3, 8, 0F,0F, -1F, -3F, 0F, -0.5F, -3F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 135
		noseModel[20].setRotationPoint(-77F, -31F, -8F);

		noseModel[21].addShapeBox(0F, 0F, 0F, 8, 2, 7, 0F,0F, -1F, -2.5F, 0F, 0F, -2F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, -0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 1F, 0F); // Box 136
		noseModel[21].setRotationPoint(-85F, -30F, -7F);

		noseModel[22].addShapeBox(0F, 0F, 0F, 14, 2, 6, 0F,0F, -2.5F, -3F, 0F, 0F, -1.5F, 0F, 0.5F, 0F, 0F, -2F, 0F, 0F, 2F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 137
		noseModel[22].setRotationPoint(-99F, -29F, -6F);

		noseModel[23].addShapeBox(0F, 0F, 0F, 10, 3, 7, 0F,0F, -0.5F, -2.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		noseModel[23].setRotationPoint(-109F, -19F, -7F);

		noseModel[24].addShapeBox(0F, 0F, 0F, 10, 2, 7, 0F,0F, -1.5F, -3F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, -2.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, 0F); // Box 144
		noseModel[24].setRotationPoint(-109F, -22F, -7F);

		noseModel[25].addShapeBox(0F, 0F, 0F, 10, 2, 6, 0F,0F, -2.5F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2.5F, -2F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 2.5F, 0F); // Box 145
		noseModel[25].setRotationPoint(-109F, -25F, -6F);

		noseModel[26].addShapeBox(0F, 0F, 0F, 10, 3, 7, 0F,0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -3F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 146
		noseModel[26].setRotationPoint(-109F, -16F, -7F);

		noseModel[27].addShapeBox(0F, 0F, 0F, 10, 2, 6, 0F,0F, 0.5F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, -3F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, -0.5F, 0F); // Box 147
		noseModel[27].setRotationPoint(-109F, -13F, -6F);

		noseModel[28].addShapeBox(0F, 0F, 0F, 10, 1, 5, 0F,0F, 1.5F, -2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, -3F, 0F, 0F, -2F, 0F, 1F, 0F, 0F, -1F, 0F); // Box 148
		noseModel[28].setRotationPoint(-109F, -10F, -5F);

		noseModel[29].addShapeBox(0F, 0F, 0F, 10, 2, 5, 0F,0F, -3.5F, -3F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 2.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F); // Box 149
		noseModel[29].setRotationPoint(-109F, -27F, -5F);

		noseModel[30].addShapeBox(0F, 0F, 0F, 6, 2, 4, 0F,0F, -1F, -2.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		noseModel[30].setRotationPoint(-115F, -18F, -4F);

		noseModel[31].addShapeBox(0F, 0F, 0F, 6, 2, 4, 0F,0F, -2F, -2.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -2F, 0F, 0F, 1F, -2.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, 1F, 0F); // Box 151
		noseModel[31].setRotationPoint(-115F, -20F, -4F);

		noseModel[32].addShapeBox(0F, 0F, 0F, 6, 2, 4, 0F,0F, -2.5F, -3F, 0F, 1.5F, -1F, 0F, 1.5F, 0F, 0F, -2.5F, 0F, 0F, 1F, -2.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F); // Box 152
		noseModel[32].setRotationPoint(-115F, -21F, -4F);

		noseModel[33].addShapeBox(0F, 0F, 0F, 6, 2, 4, 0F,0F, -3.49999F, -2.9999F, 0F, 1.49999F, -1.9999F, 0F, 1.9999F, 0F, 0F, -2.9999F, 0F, 0F, 1.49999F, -2.9999F, 0F, -2.49999F, -0.9999F, 0F, -2.49999F, 0F, 0F, 1.49999F, 0F); // Box 153
		noseModel[33].setRotationPoint(-115F, -22F, -4F);

		noseModel[34].addShapeBox(0F, 0F, 0F, 6, 2, 4, 0F,0F, 1F, -2.5F, 0F, 1F, 0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, -2.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F); // Box 154
		noseModel[34].setRotationPoint(-115F, -15F, -4F);

		noseModel[35].addShapeBox(0F, 0F, 0F, 6, 2, 4, 0F,0F, 3F, -2.5F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 3F, 0F, 0F, -4.5F, -2.5F, 0F, -1.5F, -1F, 0F, -1.5F, 0F, 0F, -4.5F, 0F); // Box 155
		noseModel[35].setRotationPoint(-115F, -12F, -4F);

		noseModel[36].addShapeBox(0F, 0F, 0F, 6, 2, 4, 0F,0F, 3.5F, -2.5F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 3.5F, 0F, 0F, -5F, -3F, 0F, -1.5F, -2F, 0F, -1F, 0F, 0F, -4.5F, 0F); // Box 156
		noseModel[36].setRotationPoint(-115F, -11F, -4F);

		noseModel[37].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -1.5F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		noseModel[37].setRotationPoint(-116F, -18F, -1F);

		noseModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1.9999F, -0.9999F, 0F, -0.49999F, 0F, 0F, 0F, 0F, 0F, -1.9999F, 0F, 0F, 1.49999F, -0.49999F, 0F, 0F, 0.49999F, 0F, 0F, 0F, 0F, 1.49999F, 0F); // Box 158
		noseModel[38].setRotationPoint(-116F, -19F, -1F);

		noseModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 1.9999F, -0.49999F, 0F, 0.49999F, 0.49999F, 0F, 0.49999F, 0F, 0F, 1.9999F, 0F, 0F, -2.49999F, -0.9999F, 0F, -0.9999F, 0F, 0F, -0.49999F, 0F, 0F, -2.49999F, 0F); // Box 159
		noseModel[39].setRotationPoint(-116F, -14F, -1F);

		noseModel[40].addShapeBox(0F, 0F, 0F, 11, 5, 13, 0F,0F, -0.5F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, 0F, -0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 269
		noseModel[40].setRotationPoint(-77F, -25F, 0F);

		noseModel[41].addShapeBox(0F, 0F, 0F, 11, 4, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, 0F, -2F); // Box 270
		noseModel[41].setRotationPoint(-77F, -20F, 0F);

		noseModel[42].addShapeBox(0F, 0F, 0F, 8, 4, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F); // Box 271
		noseModel[42].setRotationPoint(-85F, -20F, 0F);

		noseModel[43].addShapeBox(0F, 0F, 0F, 8, 4, 11, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 276
		noseModel[43].setRotationPoint(-85F, -24F, 0F);

		noseModel[44].addShapeBox(0F, 0F, 0F, 14, 4, 10, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -3F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -3F); // Box 277
		noseModel[44].setRotationPoint(-99F, -20F, 0F);

		noseModel[45].addShapeBox(0F, 0F, 0F, 14, 4, 10, 0F,0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, -3.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -3F); // Box 310
		noseModel[45].setRotationPoint(-99F, -24F, 0F);

		noseModel[46].addShapeBox(0F, 0F, 0F, 8, 3, 11, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -0.5F, -3.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F); // Box 311
		noseModel[46].setRotationPoint(-77F, -28F, 0F);

		noseModel[47].addShapeBox(0F, 0F, 0F, 8, 2, 10, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -2.5F, 0F, 0F, -3.5F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, -1F); // Box 314
		noseModel[47].setRotationPoint(-85F, -27F, 0F);

		noseModel[48].addShapeBox(0F, 0F, 0F, 14, 3, 9, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, -2F, -4F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, -2.5F); // Box 315
		noseModel[48].setRotationPoint(-99F, -27F, 0F);

		noseModel[49].addShapeBox(0F, 0F, 0F, 11, 1, 13, 0F,0F, -0.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0.9999F, 0F, -0.9999F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9999F, 0F, 0F, -1.9999F); // Box 357
		noseModel[49].setRotationPoint(-77F, -17F, 0F);

		noseModel[50].addShapeBox(0F, 0F, 0F, 11, 4, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -3F); // Box 359
		noseModel[50].setRotationPoint(-77F, -16F, 0F);

		noseModel[51].addShapeBox(0F, 0F, 0F, 8, 4, 11, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2.5F); // Box 360
		noseModel[51].setRotationPoint(-85F, -16F, 0F);

		noseModel[52].addShapeBox(0F, 0F, 0F, 11, 3, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1.5F); // Box 378
		noseModel[52].setRotationPoint(-77F, -12F, 0F);

		noseModel[53].addShapeBox(0F, 0F, 0F, 11, 1, 11, 0F,0F, -0.49999F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9999F, 0F, -0.49999F, -2.49999F, 0F, -0.49999F, 0F, 0F, 0F, 0F, 0F, 0F, -0.49999F, 0F, -0.49999F, -2.49999F); // Box 380
		noseModel[53].setRotationPoint(-77F, -9F, 0F);

		noseModel[54].addShapeBox(0F, 0F, 0F, 8, 3, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1.5F, 0F, 0F, -3.5F); // Box 381
		noseModel[54].setRotationPoint(-85F, -12F, 0F);

		noseModel[55].addShapeBox(0F, 0F, 0F, 11, 2, 11, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, -2.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, -5F, 0F, -0.5F, -6F); // Box 383
		noseModel[55].setRotationPoint(-77F, -8F, 0F);

		noseModel[56].addShapeBox(0F, 0F, 0F, 8, 2, 8, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, 0F, -1.5F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0.5F, -3F, 0F, 0F, -3.5F); // Box 384
		noseModel[56].setRotationPoint(-85F, -9F, 0F);

		noseModel[57].addShapeBox(0F, 0F, 0F, 14, 3, 10, 0F,0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1F, -3.5F); // Box 385
		noseModel[57].setRotationPoint(-99F, -15F, 0F);

		noseModel[58].addShapeBox(0F, 0F, 0F, 14, 3, 9, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 1F, -2.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, -1.5F, -4F); // Box 386
		noseModel[58].setRotationPoint(-99F, -12F, 0F);

		noseModel[59].addShapeBox(0F, 0F, 0F, 14, 2, 6, 0F,0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 1.5F, -1F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1.5F, 0F, -2F, -3F); // Box 387
		noseModel[59].setRotationPoint(-99F, -9F, 0F);

		noseModel[60].addShapeBox(0F, 0F, 0F, 8, 3, 8, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -3F, 0F, -1F, -3F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F); // Box 388
		noseModel[60].setRotationPoint(-77F, -31F, 0F);

		noseModel[61].addShapeBox(0F, 0F, 0F, 8, 2, 7, 0F,0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -2F, 0F, -1F, -2.5F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 1F, -0.5F); // Box 389
		noseModel[61].setRotationPoint(-85F, -30F, 0F);

		noseModel[62].addShapeBox(0F, 0F, 0F, 14, 2, 6, 0F,0F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1.5F, 0F, -2.5F, -3F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 2F, -1F); // Box 390
		noseModel[62].setRotationPoint(-99F, -29F, 0F);

		noseModel[63].addShapeBox(0F, 0F, 0F, 10, 3, 7, 0F,0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F); // Box 396
		noseModel[63].setRotationPoint(-109F, -19F, 0F);

		noseModel[64].addShapeBox(0F, 0F, 0F, 10, 2, 7, 0F,0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, -1.5F, -3F, 0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, -2.5F); // Box 397
		noseModel[64].setRotationPoint(-109F, -22F, 0F);

		noseModel[65].addShapeBox(0F, 0F, 0F, 10, 2, 6, 0F,0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2.5F, -3F, 0F, 2.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 2.5F, -2F); // Box 398
		noseModel[65].setRotationPoint(-109F, -25F, 0F);

		noseModel[66].addShapeBox(0F, 0F, 0F, 10, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -3F); // Box 399
		noseModel[66].setRotationPoint(-109F, -16F, 0F);

		noseModel[67].addShapeBox(0F, 0F, 0F, 10, 2, 6, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, -2F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, -0.5F, -3F); // Box 400
		noseModel[67].setRotationPoint(-109F, -13F, 0F);

		noseModel[68].addShapeBox(0F, 0F, 0F, 10, 1, 5, 0F,0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, -2F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, -2F, 0F, -1.5F, -3F); // Box 401
		noseModel[68].setRotationPoint(-109F, -10F, 0F);

		noseModel[69].addShapeBox(0F, 0F, 0F, 10, 2, 5, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -3.5F, -3F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, -2F); // Box 402
		noseModel[69].setRotationPoint(-109F, -27F, 0F);

		noseModel[70].addShapeBox(0F, 0F, 0F, 6, 2, 4, 0F,0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, -1F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -2.5F); // Box 403
		noseModel[70].setRotationPoint(-115F, -18F, 0F);

		noseModel[71].addShapeBox(0F, 0F, 0F, 6, 2, 4, 0F,0F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -2F, -2.5F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, 1F, -2.5F); // Box 404
		noseModel[71].setRotationPoint(-115F, -20F, 0F);

		noseModel[72].addShapeBox(0F, 0F, 0F, 6, 2, 4, 0F,0F, -2.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, -1F, 0F, -2.5F, -3F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1F, -2.5F); // Box 405
		noseModel[72].setRotationPoint(-115F, -21F, 0F);

		noseModel[73].addShapeBox(0F, 0F, 0F, 6, 2, 4, 0F,0F, -2.9999F, 0F, 0F, 1.9999F, 0F, 0F, 1.49999F, -1.9999F, 0F, -3.49999F, -2.9999F, 0F, 1.49999F, 0F, 0F, -2.49999F, 0F, 0F, -2.49999F, -0.9999F, 0F, 1.49999F, -2.9999F); // Box 406
		noseModel[73].setRotationPoint(-115F, -22F, 0F);

		noseModel[74].addShapeBox(0F, 0F, 0F, 6, 2, 4, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0.5F, 0F, 1F, -2.5F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, -2.5F); // Box 407
		noseModel[74].setRotationPoint(-115F, -15F, 0F);

		noseModel[75].addShapeBox(0F, 0F, 0F, 6, 2, 4, 0F,0F, 3F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 3F, -2.5F, 0F, -4.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -1F, 0F, -4.5F, -2.5F); // Box 408
		noseModel[75].setRotationPoint(-115F, -12F, 0F);

		noseModel[76].addShapeBox(0F, 0F, 0F, 6, 2, 4, 0F,0F, 3.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, 3.5F, -2.5F, 0F, -4.5F, 0F, 0F, -1F, 0F, 0F, -1.5F, -2F, 0F, -5F, -3F); // Box 409
		noseModel[76].setRotationPoint(-115F, -11F, 0F);

		noseModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1.9999F, 0F, 0F, 0F, 0F, 0F, -0.49999F, 0F, 0F, -1.9999F, -0.9999F, 0F, 1.49999F, 0F, 0F, 0F, 0F, 0F, 0F, 0.49999F, 0F, 1.49999F, -0.49999F); // Box 411
		noseModel[77].setRotationPoint(-116F, -19F, 0F);

		noseModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 1.9999F, 0F, 0F, 0.49999F, 0F, 0F, 0.49999F, 0.49999F, 0F, 1.9999F, -0.49999F, 0F, -2.49999F, 0F, 0F, -0.49999F, 0F, 0F, -0.9999F, 0F, 0F, -2.49999F, -0.9999F); // Box 412
		noseModel[78].setRotationPoint(-116F, -14F, 0F);

		noseModel[79].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 572
		noseModel[79].setRotationPoint(-101F, -16.5F, -7.25F);

		noseModel[80].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 573
		noseModel[80].setRotationPoint(-107F, -12.75F, -4.5F);

		noseModel[81].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 574
		noseModel[81].setRotationPoint(-115F, -16F, -2.5F);

		noseModel[82].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 575
		noseModel[82].setRotationPoint(-101F, -16.5F, 6.25F);

		noseModel[83].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 576
		noseModel[83].setRotationPoint(-107F, -12.75F, 3.5F);

		noseModel[84].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 577
		noseModel[84].setRotationPoint(-115F, -16F, 1.5F);

		noseModel[85].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 817
		noseModel[85].setRotationPoint(-98F, -8F, -0.5F);

		noseModel[86].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 818
		noseModel[86].setRotationPoint(-100F, -7F, -0.5F);

		noseModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.49999F, 0F, 0F, 0.49999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9999F, -0.49999F, 0F, 0.49999F, 0.49999F, 0F, 0.49999F, 0F, 0F, -0.9999F, 0F); // Box 820
		noseModel[87].setRotationPoint(-116F, -16F, -1F);

		noseModel[88].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F); // Box 821
		noseModel[88].setRotationPoint(-116F, -18F, 0F);

		noseModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.49999F, 0F, 0F, -0.49999F, 0F, -0.9999F, 0F, 0F, 0.49999F, 0F, 0F, 0.49999F, 0.49999F, 0F, -0.9999F, -0.49999F); // Box 822
		noseModel[89].setRotationPoint(-116F, -16F, 0F);
	}

	private void inittailModel_1()
	{
		tailModel[0] = new ModelRendererTurbo(this, 281, 836, textureX, textureY); // Box 40
		tailModel[1] = new ModelRendererTurbo(this, 353, 836, textureX, textureY); // Box 41
		tailModel[2] = new ModelRendererTurbo(this, 425, 836, textureX, textureY); // Box 42
		tailModel[3] = new ModelRendererTurbo(this, 497, 836, textureX, textureY); // Box 43
		tailModel[4] = new ModelRendererTurbo(this, 1, 804, textureX, textureY); // Box 44
		tailModel[5] = new ModelRendererTurbo(this, 73, 804, textureX, textureY); // Box 45
		tailModel[6] = new ModelRendererTurbo(this, 145, 804, textureX, textureY); // Box 46
		tailModel[7] = new ModelRendererTurbo(this, 217, 804, textureX, textureY); // Box 47
		tailModel[8] = new ModelRendererTurbo(this, 865, 836, textureX, textureY); // Box 120
		tailModel[9] = new ModelRendererTurbo(this, 289, 804, textureX, textureY); // Box 121
		tailModel[10] = new ModelRendererTurbo(this, 929, 836, textureX, textureY); // Box 122
		tailModel[11] = new ModelRendererTurbo(this, 345, 804, textureX, textureY); // Box 123
		tailModel[12] = new ModelRendererTurbo(this, 409, 804, textureX, textureY); // Box 160
		tailModel[13] = new ModelRendererTurbo(this, 457, 804, textureX, textureY); // Box 161
		tailModel[14] = new ModelRendererTurbo(this, 505, 804, textureX, textureY); // Box 162
		tailModel[15] = new ModelRendererTurbo(this, 545, 804, textureX, textureY); // Box 163
		tailModel[16] = new ModelRendererTurbo(this, 593, 804, textureX, textureY); // Box 164
		tailModel[17] = new ModelRendererTurbo(this, 633, 804, textureX, textureY); // Box 165
		tailModel[18] = new ModelRendererTurbo(this, 993, 836, textureX, textureY); // Box 166
		tailModel[19] = new ModelRendererTurbo(this, 673, 804, textureX, textureY); // Box 167
		tailModel[20] = new ModelRendererTurbo(this, 737, 804, textureX, textureY); // Box 168
		tailModel[21] = new ModelRendererTurbo(this, 273, 804, textureX, textureY); // Box 169
		tailModel[22] = new ModelRendererTurbo(this, 441, 804, textureX, textureY); // Box 170
		tailModel[23] = new ModelRendererTurbo(this, 489, 804, textureX, textureY); // Box 171
		tailModel[24] = new ModelRendererTurbo(this, 577, 804, textureX, textureY); // Box 172
		tailModel[25] = new ModelRendererTurbo(this, 769, 804, textureX, textureY); // Box 173
		tailModel[26] = new ModelRendererTurbo(this, 793, 804, textureX, textureY); // Box 174
		tailModel[27] = new ModelRendererTurbo(this, 817, 804, textureX, textureY); // Box 175
		tailModel[28] = new ModelRendererTurbo(this, 841, 804, textureX, textureY); // Box 176
		tailModel[29] = new ModelRendererTurbo(this, 865, 804, textureX, textureY); // Box 177
		tailModel[30] = new ModelRendererTurbo(this, 897, 804, textureX, textureY); // Box 178
		tailModel[31] = new ModelRendererTurbo(this, 929, 804, textureX, textureY); // Box 179
		tailModel[32] = new ModelRendererTurbo(this, 961, 804, textureX, textureY); // Box 180
		tailModel[33] = new ModelRendererTurbo(this, 993, 804, textureX, textureY); // Box 181
		tailModel[34] = new ModelRendererTurbo(this, 1025, 804, textureX, textureY); // Box 182
		tailModel[35] = new ModelRendererTurbo(this, 1057, 804, textureX, textureY); // Box 183
		tailModel[36] = new ModelRendererTurbo(this, 1089, 804, textureX, textureY); // Box 184
		tailModel[37] = new ModelRendererTurbo(this, 1121, 804, textureX, textureY); // Box 185
		tailModel[38] = new ModelRendererTurbo(this, 1, 680, textureX, textureY); // Box 209
		tailModel[39] = new ModelRendererTurbo(this, 25, 680, textureX, textureY); // Box 210
		tailModel[40] = new ModelRendererTurbo(this, 65, 680, textureX, textureY); // Box 211
		tailModel[41] = new ModelRendererTurbo(this, 105, 680, textureX, textureY); // Box 212
		tailModel[42] = new ModelRendererTurbo(this, 161, 680, textureX, textureY); // Box 213
		tailModel[43] = new ModelRendererTurbo(this, 217, 680, textureX, textureY); // Box 214
		tailModel[44] = new ModelRendererTurbo(this, 257, 680, textureX, textureY); // Box 215
		tailModel[45] = new ModelRendererTurbo(this, 329, 680, textureX, textureY); // Box 217
		tailModel[46] = new ModelRendererTurbo(this, 353, 680, textureX, textureY); // Box 218
		tailModel[47] = new ModelRendererTurbo(this, 369, 680, textureX, textureY); // Box 219
		tailModel[48] = new ModelRendererTurbo(this, 385, 680, textureX, textureY); // Box 220
		tailModel[49] = new ModelRendererTurbo(this, 401, 680, textureX, textureY); // Box 221
		tailModel[50] = new ModelRendererTurbo(this, 417, 680, textureX, textureY); // Box 222
		tailModel[51] = new ModelRendererTurbo(this, 1, 748, textureX, textureY); // Box 223
		tailModel[52] = new ModelRendererTurbo(this, 73, 748, textureX, textureY); // Box 224
		tailModel[53] = new ModelRendererTurbo(this, 145, 748, textureX, textureY); // Box 225
		tailModel[54] = new ModelRendererTurbo(this, 217, 748, textureX, textureY); // Box 226
		tailModel[55] = new ModelRendererTurbo(this, 1, 748, textureX, textureY); // Box 229
		tailModel[56] = new ModelRendererTurbo(this, 49, 748, textureX, textureY); // Box 230
		tailModel[57] = new ModelRendererTurbo(this, 73, 748, textureX, textureY); // Box 231
		tailModel[58] = new ModelRendererTurbo(this, 281, 857, textureX, textureY); // Box 293
		tailModel[59] = new ModelRendererTurbo(this, 353, 857, textureX, textureY); // Box 294
		tailModel[60] = new ModelRendererTurbo(this, 425, 857, textureX, textureY); // Box 295
		tailModel[61] = new ModelRendererTurbo(this, 497, 857, textureX, textureY); // Box 296
		tailModel[62] = new ModelRendererTurbo(this, 1, 820, textureX, textureY); // Box 297
		tailModel[63] = new ModelRendererTurbo(this, 73, 820, textureX, textureY); // Box 298
		tailModel[64] = new ModelRendererTurbo(this, 145, 820, textureX, textureY); // Box 299
		tailModel[65] = new ModelRendererTurbo(this, 217, 820, textureX, textureY); // Box 300
		tailModel[66] = new ModelRendererTurbo(this, 865, 857, textureX, textureY); // Box 373
		tailModel[67] = new ModelRendererTurbo(this, 289, 820, textureX, textureY); // Box 374
		tailModel[68] = new ModelRendererTurbo(this, 929, 857, textureX, textureY); // Box 375
		tailModel[69] = new ModelRendererTurbo(this, 345, 820, textureX, textureY); // Box 376
		tailModel[70] = new ModelRendererTurbo(this, 409, 820, textureX, textureY); // Box 413
		tailModel[71] = new ModelRendererTurbo(this, 457, 820, textureX, textureY); // Box 414
		tailModel[72] = new ModelRendererTurbo(this, 505, 820, textureX, textureY); // Box 415
		tailModel[73] = new ModelRendererTurbo(this, 545, 820, textureX, textureY); // Box 416
		tailModel[74] = new ModelRendererTurbo(this, 593, 820, textureX, textureY); // Box 417
		tailModel[75] = new ModelRendererTurbo(this, 633, 820, textureX, textureY); // Box 418
		tailModel[76] = new ModelRendererTurbo(this, 993, 857, textureX, textureY); // Box 419
		tailModel[77] = new ModelRendererTurbo(this, 673, 820, textureX, textureY); // Box 420
		tailModel[78] = new ModelRendererTurbo(this, 737, 820, textureX, textureY); // Box 421
		tailModel[79] = new ModelRendererTurbo(this, 273, 820, textureX, textureY); // Box 422
		tailModel[80] = new ModelRendererTurbo(this, 441, 820, textureX, textureY); // Box 423
		tailModel[81] = new ModelRendererTurbo(this, 489, 820, textureX, textureY); // Box 424
		tailModel[82] = new ModelRendererTurbo(this, 577, 820, textureX, textureY); // Box 425
		tailModel[83] = new ModelRendererTurbo(this, 769, 820, textureX, textureY); // Box 426
		tailModel[84] = new ModelRendererTurbo(this, 793, 820, textureX, textureY); // Box 427
		tailModel[85] = new ModelRendererTurbo(this, 817, 820, textureX, textureY); // Box 428
		tailModel[86] = new ModelRendererTurbo(this, 841, 820, textureX, textureY); // Box 429
		tailModel[87] = new ModelRendererTurbo(this, 865, 820, textureX, textureY); // Box 430
		tailModel[88] = new ModelRendererTurbo(this, 897, 820, textureX, textureY); // Box 431
		tailModel[89] = new ModelRendererTurbo(this, 929, 820, textureX, textureY); // Box 432
		tailModel[90] = new ModelRendererTurbo(this, 961, 820, textureX, textureY); // Box 433
		tailModel[91] = new ModelRendererTurbo(this, 993, 820, textureX, textureY); // Box 434
		tailModel[92] = new ModelRendererTurbo(this, 1025, 820, textureX, textureY); // Box 435
		tailModel[93] = new ModelRendererTurbo(this, 1057, 820, textureX, textureY); // Box 436
		tailModel[94] = new ModelRendererTurbo(this, 1089, 820, textureX, textureY); // Box 437
		tailModel[95] = new ModelRendererTurbo(this, 1121, 820, textureX, textureY); // Box 438
		tailModel[96] = new ModelRendererTurbo(this, 1, 714, textureX, textureY); // Box 462
		tailModel[97] = new ModelRendererTurbo(this, 25, 714, textureX, textureY); // Box 463
		tailModel[98] = new ModelRendererTurbo(this, 65, 714, textureX, textureY); // Box 464
		tailModel[99] = new ModelRendererTurbo(this, 105, 714, textureX, textureY); // Box 465
		tailModel[100] = new ModelRendererTurbo(this, 161, 714, textureX, textureY); // Box 466
		tailModel[101] = new ModelRendererTurbo(this, 217, 714, textureX, textureY); // Box 467
		tailModel[102] = new ModelRendererTurbo(this, 257, 714, textureX, textureY); // Box 468
		tailModel[103] = new ModelRendererTurbo(this, 329, 714, textureX, textureY); // Box 470
		tailModel[104] = new ModelRendererTurbo(this, 353, 714, textureX, textureY); // Box 471
		tailModel[105] = new ModelRendererTurbo(this, 369, 714, textureX, textureY); // Box 472
		tailModel[106] = new ModelRendererTurbo(this, 385, 714, textureX, textureY); // Box 473
		tailModel[107] = new ModelRendererTurbo(this, 401, 714, textureX, textureY); // Box 474
		tailModel[108] = new ModelRendererTurbo(this, 417, 714, textureX, textureY); // Box 475
		tailModel[109] = new ModelRendererTurbo(this, 1, 776, textureX, textureY); // Box 476
		tailModel[110] = new ModelRendererTurbo(this, 73, 776, textureX, textureY); // Box 477
		tailModel[111] = new ModelRendererTurbo(this, 145, 776, textureX, textureY); // Box 478
		tailModel[112] = new ModelRendererTurbo(this, 217, 776, textureX, textureY); // Box 479
		tailModel[113] = new ModelRendererTurbo(this, 1, 776, textureX, textureY); // Box 482
		tailModel[114] = new ModelRendererTurbo(this, 49, 776, textureX, textureY); // Box 483
		tailModel[115] = new ModelRendererTurbo(this, 73, 776, textureX, textureY); // Box 484
		tailModel[116] = new ModelRendererTurbo(this, 0, 928, textureX, textureY); // Box 816

		tailModel[0].addShapeBox(0F, 0F, 0F, 22, 4, 13, 0F,0F, 0F, 0.5F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 40
		tailModel[0].setRotationPoint(50F, -21F, -13F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 22, 4, 13, 0F,0F, -0.5F, -1F, 0F, -1.5F, -2.5F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 41
		tailModel[1].setRotationPoint(50F, -25F, -13F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 22, 3, 12, 0F,0F, -0.5F, -2.5F, 0F, -2F, -4F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, -1.5F, 0F, 1.5F, 0F, 0F, 0.5F, 0F); // Box 42
		tailModel[2].setRotationPoint(50F, -28F, -12F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 22, 4, 13, 0F,0F, -0.5F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -1F, 0F, -0.5F, -2.5F, 0F, -0.5F, 0F, 0F, 0.5F, 0F); // Box 43
		tailModel[3].setRotationPoint(50F, -17F, -13F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 22, 3, 12, 0F,0F, 0.5F, 0F, 0F, -0.5F, -3F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -3F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 44
		tailModel[4].setRotationPoint(72F, -20F, -12F);

		tailModel[5].addShapeBox(0F, 0F, 0F, 22, 3, 12, 0F,0F, -0.5F, -1.5F, 0F, -2F, -4F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, -3F, 0F, 1.5F, 0F, 0F, 0.5F, 0F); // Box 45
		tailModel[5].setRotationPoint(72F, -24F, -12F);

		tailModel[6].addShapeBox(0F, 0F, 0F, 22, 3, 12, 0F,0F, 0F, 0F, 0F, 0.5F, -3F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1.5F, 0F, -1F, -4F, 0F, -1F, 0F, 0F, 0.5F, 0F); // Box 46
		tailModel[6].setRotationPoint(72F, -17F, -12F);

		tailModel[7].addShapeBox(0F, 0F, 0F, 22, 2, 10, 0F,0F, 0F, -2F, 0F, -2F, -4F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 2F, -2F, 0F, 2F, 0F, 0F, 0.5F, 0F); // Box 47
		tailModel[7].setRotationPoint(72F, -26F, -10F);

		tailModel[8].addShapeBox(0F, 0F, 0F, 22, 2, 12, 0F,0F, 0.5F, 0F, 0F, 1.5F, -1.5F, 0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -3F, 0F, -1F, -4.5F, 0F, -1F, 0F, 0F, 0.5F, 0F); // Box 120
		tailModel[8].setRotationPoint(50F, -12F, -12F);

		tailModel[9].addShapeBox(0F, 0F, 0F, 22, 3, 10, 0F,0F, -0.5F, 0.5F, 0F, 1F, -2F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, 0F, -2.5F, 0F, -2F, -4F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 121
		tailModel[9].setRotationPoint(72F, -14F, -10F);

		tailModel[10].addShapeBox(0F, 0F, 0F, 22, 2, 9, 0F,0F, 0.5F, 0F, 0F, 2F, -1.5F, 0F, 2F, 0F, 0F, 0.5F, 0F, 0F, 0F, -4F, 0F, -2F, -5F, 0F, -1.5F, 0F, 0F, 0.5F, 0F); // Box 122
		tailModel[10].setRotationPoint(50F, -9F, -9F);

		tailModel[11].addShapeBox(0F, 0F, 0F, 22, 2, 7, 0F,0F, 0F, 0.5F, 0F, 2F, -1F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2.5F, -4F, 0F, -2F, 0F, 0F, 0.5F, 0F); // Box 123
		tailModel[11].setRotationPoint(72F, -11F, -7F);

		tailModel[12].addShapeBox(0F, 0F, 0F, 11, 2, 9, 0F,0F, 0.5F, 0F, 0F, 0.5F, -1.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 160
		tailModel[12].setRotationPoint(94F, -19F, -9F);

		tailModel[13].addShapeBox(0F, 0F, 0F, 11, 2, 9, 0F,0F, 1F, -1F, 0F, 0.5F, -2.5F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 161
		tailModel[13].setRotationPoint(94F, -21F, -9F);

		tailModel[14].addShapeBox(0F, 0F, 0F, 11, 2, 8, 0F,0F, 1F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, -1F, 0F); // Box 162
		tailModel[14].setRotationPoint(94F, -23F, -8F);

		tailModel[15].addShapeBox(0F, 0F, 0F, 11, 2, 9, 0F,0F, 0.5F, 0F, 0F, 0.5F, -1.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1F, 0F, -0.5F, -2.5F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 163
		tailModel[15].setRotationPoint(94F, -17F, -9F);

		tailModel[16].addShapeBox(0F, 0F, 0F, 11, 2, 8, 0F,0F, 0F, 0F, 0F, 0.5F, -1.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -3F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 164
		tailModel[16].setRotationPoint(94F, -15F, -8F);

		tailModel[17].addShapeBox(0F, 0F, 0F, 11, 2, 6, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -0.5F, -3F, 0F, -1.5F, -3.5F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 165
		tailModel[17].setRotationPoint(94F, -13F, -6F);

		tailModel[18].addShapeBox(0F, 0F, 0F, 22, 2, 9, 0F,0F, 0F, -4F, 0F, -2F, -4.5F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 2F, -1F, 0F, 2F, 0F, 0F, 0.5F, 0F); // Box 166
		tailModel[18].setRotationPoint(50F, -30F, -9F);

		tailModel[19].addShapeBox(0F, 0F, 0F, 22, 2, 8, 0F,0F, 0F, -3.5F, 0F, -2.5F, -4.25F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 2F, -2F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 167
		tailModel[19].setRotationPoint(72F, -28F, -8F);

		tailModel[20].addShapeBox(0F, 0F, 0F, 11, 2, 6, 0F,0F, -0.5F, -2.25F, 0F, -1.5F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 168
		tailModel[20].setRotationPoint(94F, -26F, -6F);

		tailModel[21].addShapeBox(0F, 0F, 0F, 10, 1, 2, 0F,0F, 0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F); // Box 169
		tailModel[21].setRotationPoint(105F, -24F, -2F);

		tailModel[22].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0.5F, -2F, 0F, -0.5F, -3F, 0F, -1.5F, 2F, 0F, -0.5F, 1.5F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 1F, 1F, 0F, 0F, 0F); // Box 170
		tailModel[22].setRotationPoint(105F, -24F, -5F);

		tailModel[23].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, -0.5F, 1.5F, 0F, 0F, 0.5F, 0F, 0.5F, -0.5F, 0F, -0.5F, -1.5F); // Box 171
		tailModel[23].setRotationPoint(105F, -23F, -5F);

		tailModel[24].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, 0.5F, -1.5F, 0F, 0F, -2.5F, 0F, -0.5F, 2.5F, 0F, 0.5F, 1.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -2F, 0F, 0F, 2F, 0F, -0.5F, 0.5F); // Box 172
		tailModel[24].setRotationPoint(105F, -21F, -8F);

		tailModel[25].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -2F, 0F, -1F, 2F, 0F, -0.5F, 0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -2F, 0F, -0.5F, 2F, 0F, 0.5F, 0.5F); // Box 173
		tailModel[25].setRotationPoint(105F, -20F, -8F);

		tailModel[26].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, -0.5F, -0.5F, 0F, 0F, -2F, 0F, 0.5F, 2F, 0F, -0.5F, 0.5F, 0F, 0.5F, -1.5F, 0F, -0.5F, -2.5F, 0F, -1F, 2.5F, 0F, 0.5F, 1.5F); // Box 174
		tailModel[26].setRotationPoint(105F, -18F, -8F);

		tailModel[27].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, -0.5F, 1.5F, 0F, 0.5F, 0.5F, 0F, 1F, -0.5F, 0F, -0.5F, -1.5F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1.5F, 1F, 0F, 0F, 0F); // Box 175
		tailModel[27].setRotationPoint(105F, -16F, -5F);

		tailModel[28].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1.5F, 1F, 0F, 0F, 0F, 0F, 0.5F, -2.5F, 0F, -1F, -3F, 0F, -2F, 2F, 0F, -1F, 1.5F); // Box 176
		tailModel[28].setRotationPoint(105F, -14F, -5F);

		tailModel[29].addShapeBox(0F, 0F, 0F, 10, 1, 2, 0F,0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 2F, 0F); // Box 177
		tailModel[29].setRotationPoint(105F, -15F, -2F);

		tailModel[30].addShapeBox(0F, 0F, 0F, 11, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 178
		tailModel[30].setRotationPoint(105F, -16F, -2F);

		tailModel[31].addShapeBox(0F, 0F, 0F, 11, 1, 2, 0F,0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		tailModel[31].setRotationPoint(105F, -16F, -4F);

		tailModel[32].addShapeBox(0F, 0F, 0F, 11, 1, 2, 0F,0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1.5F, -1F, 0F, -1.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		tailModel[32].setRotationPoint(105F, -17F, -6F);

		tailModel[33].addShapeBox(0F, 0F, 0F, 11, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 181
		tailModel[33].setRotationPoint(105F, -23F, -2F);

		tailModel[34].addShapeBox(0F, 0F, 0F, 11, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 182
		tailModel[34].setRotationPoint(105F, -23F, -4F);

		tailModel[35].addShapeBox(0F, 0F, 0F, 11, 1, 2, 0F,0F, -1.5F, -1F, 0F, -1.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 183
		tailModel[35].setRotationPoint(105F, -22F, -6F);

		tailModel[36].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
		tailModel[36].setRotationPoint(105F, -19F, -5F);

		tailModel[37].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 185
		tailModel[37].setRotationPoint(105F, -20F, -5F);

		tailModel[38].addShapeBox(0F, 0F, 0F, 9, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, -1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0.5F, 0.5F, -1.5F, 0.5F, 0F, 0F, 0F, -0.5F, 0F); // Box 209
		tailModel[38].setRotationPoint(105F, -27F, -2F);

		tailModel[39].addShapeBox(0F, 0F, 0F, 14, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, -0.5F, 0F); // Box 210
		tailModel[39].setRotationPoint(91F, -27F, -2F);

		tailModel[40].addShapeBox(0F, 0F, 0F, 14, 31, 2, 0F,-6F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
		tailModel[40].setRotationPoint(91F, -58F, -2F);

		tailModel[41].addShapeBox(0F, 0F, 0F, 23, 5, 2, 0F,0.5F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -2.5F, 1F, 0F, 0.5F, 1.5F, 0F, 0.5F, 0F, 0F, -2.5F, 0F); // Box 212
		tailModel[41].setRotationPoint(68F, -31F, -2F);

		tailModel[42].addShapeBox(0F, 0F, 0F, 23, 6, 2, 0F,-14.9999F, -1.49999F, -0.9999F, -7.9999F, -1.49999F, -0.9999F, -7.9999F, -1.49999F, 0F, -11.9999F, 0F, 0F, 0.49999F, 0F, -0.49999F, 0F, 3.9999F, 0F, 0F, 3.9999F, 0F, 0.49999F, -1.49999F, 0F); // Box 213
		tailModel[42].setRotationPoint(68F, -37F, -2F);

		tailModel[43].addShapeBox(0F, 0F, 0F, 14, 31, 2, 0F,-10F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -8.5F, 0F, 0F, 0F, -8.5F, -1F, -6F, 0F, 0F, -6F, 0F, 0F, 3F, -10F, 0F); // Box 214
		tailModel[43].setRotationPoint(83F, -58F, -2F);

		tailModel[44].addShapeBox(0F, 0F, 0F, 30, 2, 2, 0F,0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 1F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 215
		tailModel[44].setRotationPoint(38F, -31F, -2F);

		tailModel[45].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F,-1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		tailModel[45].setRotationPoint(97F, -62F, -1F);

		tailModel[46].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,1.5F, 0F, 0F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 218
		tailModel[46].setRotationPoint(105F, -62F, -1F);

		tailModel[47].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1.5F, 0F, 0F); // Box 219
		tailModel[47].setRotationPoint(93F, -62F, -1F);

		tailModel[48].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,-0.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 220
		tailModel[48].setRotationPoint(98F, -65F, -1F);

		tailModel[49].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-2F, -1F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F); // Box 221
		tailModel[49].setRotationPoint(95F, -65F, -1F);

		tailModel[50].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,2.5F, -0.5F, 0F, -2F, -1.5F, -0.5F, -2F, -1F, 0F, 2.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 222
		tailModel[50].setRotationPoint(104F, -65F, -1F);

		tailModel[51].addShapeBox(0F, 0F, 0F, 10, 3, 24, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.5F, 0F, 0F); // Box 223
		tailModel[51].setRotationPoint(91F, -28F, -25F);

		tailModel[52].addShapeBox(0F, 0F, 0F, 10, 3, 22, 0F,-4F, -1F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		tailModel[52].setRotationPoint(91F, -28F, -47F);

		tailModel[53].addShapeBox(0F, 0F, 0F, 10, 3, 24, 0F,-3.5F, -1.5F, 0F, 0F, -0.5F, 0F, -3.5F, 0F, 0F, 4F, -1F, 0F, -3.5F, -1F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, 4F, -1F, 0F); // Box 225
		tailModel[53].setRotationPoint(81F, -28F, -25F);

		tailModel[54].addShapeBox(0F, 0F, 0F, 10, 3, 22, 0F,-5F, -1.5F, 0F, -1F, -1F, 0F, -5F, -0.5F, 0F, 1.5F, -1.5F, 0F, -5F, -1F, 0F, -1F, -0.5F, 0F, -5F, 0F, 0F, 1.5F, -1F, 0F); // Box 226
		tailModel[54].setRotationPoint(86F, -28F, -47F);

		tailModel[55].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,-1.5F, -0.5F, 0F, -2F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 229
		tailModel[55].setRotationPoint(95F, -27F, -53F);

		tailModel[56].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,-2.5F, -0.5F, -1F, 1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2.5F, 0F, -1F, 1.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 230
		tailModel[56].setRotationPoint(91F, -27F, -53F);

		tailModel[57].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,2F, -0.5F, 0F, -1.5F, -0.5F, -1F, 0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -1.5F, 0F, -1F, 0.5F, 0F, 0F, -0.5F, 0.5F, 0F); // Box 231
		tailModel[57].setRotationPoint(100F, -27F, -53F);

		tailModel[58].addShapeBox(0F, 0F, 0F, 22, 4, 13, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.5F, 0.5F); // Box 293
		tailModel[58].setRotationPoint(50F, -21F, 0F);

		tailModel[59].addShapeBox(0F, 0F, 0F, 22, 4, 13, 0F,0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -2.5F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, 0F, 0.5F); // Box 294
		tailModel[59].setRotationPoint(50F, -25F, 0F);

		tailModel[60].addShapeBox(0F, 0F, 0F, 22, 3, 12, 0F,0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, -4F, 0F, -0.5F, -2.5F, 0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, -1.5F, 0F, 0.5F, 0F); // Box 295
		tailModel[60].setRotationPoint(50F, -28F, 0F);

		tailModel[61].addShapeBox(0F, 0F, 0F, 22, 4, 13, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, 0.5F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2.5F, 0F, 0.5F, -1F); // Box 296
		tailModel[61].setRotationPoint(50F, -17F, 0F);

		tailModel[62].addShapeBox(0F, 0F, 0F, 22, 3, 12, 0F,0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -3F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -3F, 0F, 0F, 0F); // Box 297
		tailModel[62].setRotationPoint(72F, -20F, 0F);

		tailModel[63].addShapeBox(0F, 0F, 0F, 22, 3, 12, 0F,0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, -4F, 0F, -0.5F, -1.5F, 0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, -3F, 0F, 0.5F, 0F); // Box 298
		tailModel[63].setRotationPoint(72F, -24F, 0F);

		tailModel[64].addShapeBox(0F, 0F, 0F, 22, 3, 12, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -3F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, -4F, 0F, 0.5F, -1.5F); // Box 299
		tailModel[64].setRotationPoint(72F, -17F, 0F);

		tailModel[65].addShapeBox(0F, 0F, 0F, 22, 2, 10, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -4F, 0F, 0F, -2F, 0F, 0.5F, 0F, 0F, 2F, 0F, 0F, 2F, -2F, 0F, 0.5F, 0.5F); // Box 300
		tailModel[65].setRotationPoint(72F, -26F, 0F);

		tailModel[66].addShapeBox(0F, 0F, 0F, 22, 2, 12, 0F,0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, -1.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, -4.5F, 0F, 0.5F, -3F); // Box 373
		tailModel[66].setRotationPoint(50F, -12F, 0F);

		tailModel[67].addShapeBox(0F, 0F, 0F, 22, 3, 10, 0F,0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, -2F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -4F, 0F, 0F, -2.5F); // Box 374
		tailModel[67].setRotationPoint(72F, -14F, 0F);

		tailModel[68].addShapeBox(0F, 0F, 0F, 22, 2, 9, 0F,0F, 0.5F, 0F, 0F, 2F, 0F, 0F, 2F, -1.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -2F, -5F, 0F, 0F, -4F); // Box 375
		tailModel[68].setRotationPoint(50F, -9F, 0F);

		tailModel[69].addShapeBox(0F, 0F, 0F, 22, 2, 7, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -1F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, -2F, 0F, 0F, -2.5F, -4F, 0F, 0F, -3F); // Box 376
		tailModel[69].setRotationPoint(72F, -11F, 0F);

		tailModel[70].addShapeBox(0F, 0F, 0F, 11, 2, 9, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1.5F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F); // Box 413
		tailModel[70].setRotationPoint(94F, -19F, 0F);

		tailModel[71].addShapeBox(0F, 0F, 0F, 11, 2, 9, 0F,0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -2.5F, 0F, 1F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F); // Box 414
		tailModel[71].setRotationPoint(94F, -21F, 0F);

		tailModel[72].addShapeBox(0F, 0F, 0F, 11, 2, 8, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 1F, -2F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, -1F, 0F); // Box 415
		tailModel[72].setRotationPoint(94F, -23F, 0F);

		tailModel[73].addShapeBox(0F, 0F, 0F, 11, 2, 9, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2.5F, 0F, 0F, -1F); // Box 416
		tailModel[73].setRotationPoint(94F, -17F, 0F);

		tailModel[74].addShapeBox(0F, 0F, 0F, 11, 2, 8, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -3F, 0F, 0F, -2F); // Box 417
		tailModel[74].setRotationPoint(94F, -15F, 0F);

		tailModel[75].addShapeBox(0F, 0F, 0F, 11, 2, 6, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1.5F, -3.5F, 0F, -0.5F, -3F); // Box 418
		tailModel[75].setRotationPoint(94F, -13F, 0F);

		tailModel[76].addShapeBox(0F, 0F, 0F, 22, 2, 9, 0F,0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -2F, -4.5F, 0F, 0F, -4F, 0F, 0.5F, 0F, 0F, 2F, 0F, 0F, 2F, -1F, 0F, 0.5F, 0.5F); // Box 419
		tailModel[76].setRotationPoint(50F, -30F, 0F);

		tailModel[77].addShapeBox(0F, 0F, 0F, 22, 2, 8, 0F,0F, 0.5F, 0F, 0F, -2F, 0F, 0F, -2.5F, -4.25F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -2F, 0F, 0F, 0F); // Box 420
		tailModel[77].setRotationPoint(72F, -28F, 0F);

		tailModel[78].addShapeBox(0F, 0F, 0F, 11, 2, 6, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1.5F, -3F, 0F, -0.5F, -2.25F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 0F, 0F); // Box 421
		tailModel[78].setRotationPoint(94F, -26F, 0F);

		tailModel[79].addShapeBox(0F, 0F, 0F, 10, 1, 2, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 1F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0.5F); // Box 422
		tailModel[79].setRotationPoint(105F, -24F, 0F);

		tailModel[80].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, -0.5F, 1.5F, 0F, -1.5F, 2F, 0F, -0.5F, -3F, 0F, 0.5F, -2F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 0.5F, -1F, 0F, 0F, 0F); // Box 423
		tailModel[80].setRotationPoint(105F, -24F, 4F);

		tailModel[81].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, 1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, -0.5F, -1.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 1.5F); // Box 424
		tailModel[81].setRotationPoint(105F, -23F, 4F);

		tailModel[82].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, 0.5F, 1.5F, 0F, -0.5F, 2.5F, 0F, 0F, -2.5F, 0F, 0.5F, -1.5F, 0F, -0.5F, 0.5F, 0F, 0F, 2F, 0F, -0.5F, -2F, 0F, -0.5F, -0.5F); // Box 425
		tailModel[82].setRotationPoint(105F, -21F, 7F);

		tailModel[83].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, -0.5F, 0.5F, 0F, -1F, 2F, 0F, -0.5F, -2F, 0F, -0.5F, -0.5F, 0F, 0.5F, 0.5F, 0F, -0.5F, 2F, 0F, 0F, -2F, 0F, 0.5F, -0.5F); // Box 426
		tailModel[83].setRotationPoint(105F, -20F, 7F);

		tailModel[84].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, -0.5F, 0.5F, 0F, 0.5F, 2F, 0F, 0F, -2F, 0F, -0.5F, -0.5F, 0F, 0.5F, 1.5F, 0F, -1F, 2.5F, 0F, -0.5F, -2.5F, 0F, 0.5F, -1.5F); // Box 427
		tailModel[84].setRotationPoint(105F, -18F, 7F);

		tailModel[85].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, -0.5F, -1.5F, 0F, 1F, -0.5F, 0F, 0.5F, 0.5F, 0F, -0.5F, 1.5F, 0F, 0F, 0F, 0F, -1.5F, 1F, 0F, -1F, -1F, 0F, 0F, 0F); // Box 428
		tailModel[85].setRotationPoint(105F, -16F, 4F);

		tailModel[86].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 1.5F, 1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, -1F, 1.5F, 0F, -2F, 2F, 0F, -1F, -3F, 0F, 0.5F, -2.5F); // Box 429
		tailModel[86].setRotationPoint(105F, -14F, 4F);

		tailModel[87].addShapeBox(0F, 0F, 0F, 10, 1, 2, 0F,0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F, 0F, 2F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0.5F); // Box 430
		tailModel[87].setRotationPoint(105F, -15F, 0F);

		tailModel[88].addShapeBox(0F, 0F, 0F, 11, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 431
		tailModel[88].setRotationPoint(105F, -16F, 0F);

		tailModel[89].addShapeBox(0F, 0F, 0F, 11, 1, 2, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 432
		tailModel[89].setRotationPoint(105F, -16F, 2F);

		tailModel[90].addShapeBox(0F, 0F, 0F, 11, 1, 2, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1F, 0F, -1.5F, -1F); // Box 433
		tailModel[90].setRotationPoint(105F, -17F, 4F);

		tailModel[91].addShapeBox(0F, 0F, 0F, 11, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 434
		tailModel[91].setRotationPoint(105F, -23F, 0F);

		tailModel[92].addShapeBox(0F, 0F, 0F, 11, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 1F, -0.5F, 0F, 1F, -0.5F); // Box 435
		tailModel[92].setRotationPoint(105F, -23F, 2F);

		tailModel[93].addShapeBox(0F, 0F, 0F, 11, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1F, 0F, -1.5F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 1F, -2F, 0F, 1F, -2F); // Box 436
		tailModel[93].setRotationPoint(105F, -22F, 4F);

		tailModel[94].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 437
		tailModel[94].setRotationPoint(105F, -19F, 4F);

		tailModel[95].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 438
		tailModel[95].setRotationPoint(105F, -20F, 4F);

		tailModel[96].addShapeBox(0F, 0F, 0F, 9, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, -1.5F, 0F, -0.5F, 0.5F); // Box 462
		tailModel[96].setRotationPoint(105F, -27F, 0F);

		tailModel[97].addShapeBox(0F, 0F, 0F, 14, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, -0.5F, 1.5F); // Box 463
		tailModel[97].setRotationPoint(91F, -27F, 0F);

		tailModel[98].addShapeBox(0F, 0F, 0F, 14, 31, 2, 0F,-6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -6F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 464
		tailModel[98].setRotationPoint(91F, -58F, 0F);

		tailModel[99].addShapeBox(0F, 0F, 0F, 23, 5, 2, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0.5F, 0F, -0.5F, 0F, -2.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 1.5F, 0F, -2.5F, 1F); // Box 465
		tailModel[99].setRotationPoint(68F, -31F, 0F);

		tailModel[100].addShapeBox(0F, 0F, 0F, 23, 6, 2, 0F,-11.9999F, 0F, 0F, -7.9999F, -1.49999F, 0F, -7.9999F, -1.49999F, -0.9999F, -14.9999F, -1.49999F, -0.9999F, 0.49999F, -1.49999F, 0F, 0F, 3.9999F, 0F, 0F, 3.9999F, 0F, 0.49999F, 0F, -0.49999F); // Box 466
		tailModel[100].setRotationPoint(68F, -37F, 0F);

		tailModel[101].addShapeBox(0F, 0F, 0F, 14, 31, 2, 0F,-8.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -10F, 0F, -1F, 3F, -10F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, -8.5F, -1F); // Box 467
		tailModel[101].setRotationPoint(83F, -58F, 0F);

		tailModel[102].addShapeBox(0F, 0F, 0F, 30, 2, 2, 0F,0F, 0F, 0F, -0.5F, 1.5F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 1F, 0F, 0F, 0F); // Box 468
		tailModel[102].setRotationPoint(38F, -31F, 0F);

		tailModel[103].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F,-1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 470
		tailModel[103].setRotationPoint(97F, -62F, 0F);

		tailModel[104].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.5F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 471
		tailModel[104].setRotationPoint(105F, -62F, 0F);

		tailModel[105].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 472
		tailModel[105].setRotationPoint(93F, -62F, 0F);

		tailModel[106].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,-0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 473
		tailModel[106].setRotationPoint(98F, -65F, 0F);

		tailModel[107].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-1F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, -2F, -1F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 474
		tailModel[107].setRotationPoint(95F, -65F, 0F);

		tailModel[108].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,2.5F, 0F, 0F, -2F, -1F, 0F, -2F, -1.5F, -0.5F, 2.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F); // Box 475
		tailModel[108].setRotationPoint(104F, -65F, 0F);

		tailModel[109].addShapeBox(0F, 0F, 0F, 10, 3, 24, 0F,3.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 476
		tailModel[109].setRotationPoint(91F, -28F, 1F);

		tailModel[110].addShapeBox(0F, 0F, 0F, 10, 3, 22, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1F, 0F, -4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -4F, -0.5F, 0F); // Box 477
		tailModel[110].setRotationPoint(91F, -28F, 25F);

		tailModel[111].addShapeBox(0F, 0F, 0F, 10, 3, 24, 0F,4F, -1F, 0F, -3.5F, 0F, 0F, 0F, -0.5F, 0F, -3.5F, -1.5F, 0F, 4F, -1F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -3.5F, -1F, 0F); // Box 478
		tailModel[111].setRotationPoint(81F, -28F, 1F);

		tailModel[112].addShapeBox(0F, 0F, 0F, 10, 3, 22, 0F,1.5F, -1.5F, 0F, -5F, -0.5F, 0F, -1F, -1F, 0F, -5F, -1.5F, 0F, 1.5F, -1F, 0F, -5F, 0F, 0F, -1F, -0.5F, 0F, -5F, -1F, 0F); // Box 479
		tailModel[112].setRotationPoint(86F, -28F, 25F);

		tailModel[113].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, -2F, -0.5F, 0F, -1.5F, -0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, -2F, 0F, 0F, -1.5F, 0F, 0F); // Box 482
		tailModel[113].setRotationPoint(95F, -27F, 47F);

		tailModel[114].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 1.5F, -0.5F, 0F, -2.5F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0.5F, 0F, 1.5F, 0F, 0F, -2.5F, 0F, -1F); // Box 483
		tailModel[114].setRotationPoint(91F, -27F, 47F);

		tailModel[115].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,-0.5F, 0F, 0F, 0.5F, -0.5F, 0F, -1.5F, -0.5F, -1F, 2F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, -1F, 2F, 0F, 0F); // Box 484
		tailModel[115].setRotationPoint(100F, -27F, 47F);

		tailModel[116].addShapeBox(0F, 0F, 0F, 113, 1, 1, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Box 816
		tailModel[116].setRotationPoint(-18F, -34.5F, -0.5F);
		tailModel[116].rotateAngleZ = 0.20943951F;
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 1, 486, textureX, textureY); // Box 186
		leftWingModel[1] = new ModelRendererTurbo(this, 1, 543, textureX, textureY); // Box 187
		leftWingModel[2] = new ModelRendererTurbo(this, 49, 543, textureX, textureY); // Box 188
		leftWingModel[3] = new ModelRendererTurbo(this, 65, 543, textureX, textureY); // Box 189
		leftWingModel[4] = new ModelRendererTurbo(this, 161, 543, textureX, textureY); // Box 190
		leftWingModel[5] = new ModelRendererTurbo(this, 121, 543, textureX, textureY); // Box 191
		leftWingModel[6] = new ModelRendererTurbo(this, 249, 543, textureX, textureY); // Box 192
		leftWingModel[7] = new ModelRendererTurbo(this, 137, 486, textureX, textureY); // Box 193
		leftWingModel[8] = new ModelRendererTurbo(this, 217, 543, textureX, textureY); // Box 194
		leftWingModel[9] = new ModelRendererTurbo(this, 337, 543, textureX, textureY); // Box 195
		leftWingModel[10] = new ModelRendererTurbo(this, 249, 486, textureX, textureY); // Box 196
		leftWingModel[11] = new ModelRendererTurbo(this, 305, 543, textureX, textureY); // Box 197
		leftWingModel[12] = new ModelRendererTurbo(this, 1, 486, textureX, textureY); // Box 201
		leftWingModel[13] = new ModelRendererTurbo(this, 89, 486, textureX, textureY); // Box 202
		leftWingModel[14] = new ModelRendererTurbo(this, 113, 486, textureX, textureY); // Box 203
		leftWingModel[15] = new ModelRendererTurbo(this, 137, 486, textureX, textureY); // Box 204
		leftWingModel[16] = new ModelRendererTurbo(this, 161, 486, textureX, textureY); // Box 205
		leftWingModel[17] = new ModelRendererTurbo(this, 33, 486, textureX, textureY); // Box 206
		leftWingModel[18] = new ModelRendererTurbo(this, 105, 486, textureX, textureY); // Box 207
		leftWingModel[19] = new ModelRendererTurbo(this, 201, 486, textureX, textureY); // Box 208

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 16, 5, 51, 0F,-3F, 0F, 0F, -2.5F, 0F, 0F, 0.5F, -2F, 0F, 0F, -2F, 0F, -3F, -2F, 0F, -2.5F, -2F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 186
		leftWingModel[0].setRotationPoint(-8F, -17F, -120F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 11, 5, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 1F, 0F, -0.5F, 2F); // Box 187
		leftWingModel[1].setRotationPoint(-9F, -14F, -35F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 9, 5, 12, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 1F); // Box 188
		leftWingModel[2].setRotationPoint(2F, -14F, -35F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 10, 5, 34, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, -1.5F, 0F, -1F, -1F, 0F, 0F, -2F, 0F, -2.5F, -2F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 189
		leftWingModel[3].setRotationPoint(1F, -15F, -69F);

		leftWingModel[4].addShapeBox(0F, 0F, 0F, 9, 5, 34, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F); // Box 190
		leftWingModel[4].setRotationPoint(-8F, -15F, -69F);

		leftWingModel[5].addShapeBox(0F, 0F, 0F, 12, 5, 15, 0F,0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 8F, -1F, -0.5F, 0.5F, -2F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, -1F, 8F, 0F, -0.5F); // Box 191
		leftWingModel[5].setRotationPoint(-21F, -14F, -35F);

		leftWingModel[6].addShapeBox(0F, 0F, 0F, 9, 5, 34, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 4.5F, -1.5F, 0F, -0.5F, -2.5F, 0F, 0F, -2F, 0F, -1F, -0.5F, 0F, 4.5F, -1F, 0F); // Box 192
		leftWingModel[6].setRotationPoint(-17F, -15F, -69F);

		leftWingModel[7].addShapeBox(0F, 0F, 0F, 4, 5, 51, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, 7.5F, -2.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -3F, 0F, 0F, 7.5F, -0.5F, 0F); // Box 193
		leftWingModel[7].setRotationPoint(-9F, -17F, -120F);

		leftWingModel[8].addShapeBox(0F, 0F, 0F, 5, 5, 15, 0F,-0.5F, -1.5F, 0F, 0.5F, -0.5F, 0F, -7F, -1F, -0.5F, 8F, -2.5F, 0F, -0.5F, -2.5F, 0F, 0.5F, -2F, 0F, -7F, 0F, -0.5F, 8F, -1.5F, 0F); // Box 194
		leftWingModel[8].setRotationPoint(-27F, -14F, -35F);

		leftWingModel[9].addShapeBox(0F, 0F, 0F, 5, 5, 34, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -5.5F, -1.5F, 0F, 5.5F, -2.5F, 0F, 0F, -3F, 0F, -0.5F, -2.5F, 0F, -5.5F, -1F, 0F, 5.5F, -1.5F, 0F); // Box 195
		leftWingModel[9].setRotationPoint(-21F, -15F, -69F);

		leftWingModel[10].addShapeBox(0F, 0F, 0F, 3, 5, 51, 0F,0F, -1.5F, 0F, 0F, -0.5F, 0F, -7.5F, -2.5F, 0F, 9F, -3F, 0F, 0F, -2.5F, 0F, 0F, -2F, 0F, -7.5F, -0.5F, 0F, 9F, -1F, 0F); // Box 196
		leftWingModel[10].setRotationPoint(-12F, -17F, -120F);

		leftWingModel[11].addShapeBox(0F, 0F, 0F, 13, 4, 12, 0F,0F, -0.5F, 0F, -1.5F, -1.5F, 0F, 0F, -1.5F, -1F, 0F, -1F, 0F, 0F, -0.5F, 0F, -1.5F, -2F, 0F, 0F, -2F, -1F, 0F, -0.5F, 0F); // Box 197
		leftWingModel[11].setRotationPoint(11F, -14F, -35F);

		leftWingModel[12].addShapeBox(0F, 0F, 0F, 11, 3, 7, 0F,-1.5F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1F, 0F, -2F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 201
		leftWingModel[12].setRotationPoint(-5F, -17F, -127F);

		leftWingModel[13].addShapeBox(0F, 0F, 0F, 4, 3, 7, 0F,-2F, -0.5F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2F, -1F, 0F, 1.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		leftWingModel[13].setRotationPoint(-9F, -17F, -127F);

		leftWingModel[14].addShapeBox(0F, 0F, 0F, 3, 3, 7, 0F,-3.5F, -1F, 0F, 2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, -3.5F, -1.5F, 0F, 2F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 203
		leftWingModel[14].setRotationPoint(-12F, -17F, -127F);

		leftWingModel[15].addShapeBox(0F, 0F, 0F, 5, 3, 7, 0F,1F, 0F, 0F, -2F, -0.5F, 0F, 0.5F, -1F, 0F, -0.5F, 0F, 0F, 1F, -1F, 0F, -2F, -2F, 0F, 0.5F, -1.5F, 0F, -0.5F, 0F, 0F); // Box 204
		leftWingModel[15].setRotationPoint(5F, -17F, -127F);

		leftWingModel[16].addShapeBox(0F, 0F, 0F, 7, 2, 4, 0F,-1.5F, -0.5F, 0F, -3.5F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, -1F, 0F, -3.5F, -1F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 205
		leftWingModel[16].setRotationPoint(-3F, -17F, -131F);

		leftWingModel[17].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,-2.5F, -0.5F, -1F, 2.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, -2.5F, -1F, -1F, 2.5F, -1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 206
		leftWingModel[17].setRotationPoint(-7F, -17F, -131F);

		leftWingModel[18].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-2F, -0.75F, -1.5F, 1.5F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, -1F, 0F, -2F, 0.25F, -1.5F, 1.5F, 0F, 0F, -1F, 1F, 0F, -0.5F, 0.5F, 0F); // Box 207
		leftWingModel[18].setRotationPoint(-9F, -17F, -130F);

		leftWingModel[19].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,3.5F, -0.5F, 0F, -3F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 3.5F, -1F, 0F, -3F, -1F, -1.5F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 208
		leftWingModel[19].setRotationPoint(4F, -17F, -131F);
	}

	private void initrightWingModel_1()
	{
		rightWingModel[0] = new ModelRendererTurbo(this, 1, 583, textureX, textureY); // Box 439
		rightWingModel[1] = new ModelRendererTurbo(this, 1, 640, textureX, textureY); // Box 440
		rightWingModel[2] = new ModelRendererTurbo(this, 49, 640, textureX, textureY); // Box 441
		rightWingModel[3] = new ModelRendererTurbo(this, 65, 640, textureX, textureY); // Box 442
		rightWingModel[4] = new ModelRendererTurbo(this, 161, 640, textureX, textureY); // Box 443
		rightWingModel[5] = new ModelRendererTurbo(this, 121, 640, textureX, textureY); // Box 444
		rightWingModel[6] = new ModelRendererTurbo(this, 249, 640, textureX, textureY); // Box 445
		rightWingModel[7] = new ModelRendererTurbo(this, 137, 583, textureX, textureY); // Box 446
		rightWingModel[8] = new ModelRendererTurbo(this, 217, 640, textureX, textureY); // Box 447
		rightWingModel[9] = new ModelRendererTurbo(this, 337, 640, textureX, textureY); // Box 448
		rightWingModel[10] = new ModelRendererTurbo(this, 249, 583, textureX, textureY); // Box 449
		rightWingModel[11] = new ModelRendererTurbo(this, 305, 640, textureX, textureY); // Box 450
		rightWingModel[12] = new ModelRendererTurbo(this, 1, 583, textureX, textureY); // Box 454
		rightWingModel[13] = new ModelRendererTurbo(this, 89, 583, textureX, textureY); // Box 455
		rightWingModel[14] = new ModelRendererTurbo(this, 113, 583, textureX, textureY); // Box 456
		rightWingModel[15] = new ModelRendererTurbo(this, 137, 583, textureX, textureY); // Box 457
		rightWingModel[16] = new ModelRendererTurbo(this, 161, 583, textureX, textureY); // Box 458
		rightWingModel[17] = new ModelRendererTurbo(this, 33, 583, textureX, textureY); // Box 459
		rightWingModel[18] = new ModelRendererTurbo(this, 105, 583, textureX, textureY); // Box 460
		rightWingModel[19] = new ModelRendererTurbo(this, 201, 583, textureX, textureY); // Box 461

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 16, 5, 51, 0F,0F, -2F, 0F, 0.5F, -2F, 0F, -2.5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, -2F, 0F, -3F, -2F, 0F); // Box 439
		rightWingModel[0].setRotationPoint(-8F, -17F, 69F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 11, 5, 12, 0F,0F, 0F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2F, 0F, -1F, 1F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 440
		rightWingModel[1].setRotationPoint(-9F, -14F, 23F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 9, 5, 12, 0F,0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 441
		rightWingModel[2].setRotationPoint(2F, -14F, 23F);

		rightWingModel[3].addShapeBox(0F, 0F, 0F, 10, 5, 34, 0F,-1F, -1F, 0F, 0F, -1.5F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, -2.5F, -2F, 0F, 0F, -2F, 0F); // Box 442
		rightWingModel[3].setRotationPoint(1F, -15F, 35F);

		rightWingModel[4].addShapeBox(0F, 0F, 0F, 9, 5, 34, 0F,1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 443
		rightWingModel[4].setRotationPoint(-8F, -15F, 35F);

		rightWingModel[5].addShapeBox(0F, 0F, 0F, 12, 5, 15, 0F,8F, -1F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 8F, 0F, -0.5F, 0F, -0.5F, -1F, 0F, -1.5F, 0F, 0.5F, -2F, 0F); // Box 444
		rightWingModel[5].setRotationPoint(-21F, -14F, 20F);

		rightWingModel[6].addShapeBox(0F, 0F, 0F, 9, 5, 34, 0F,4.5F, -1.5F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 4.5F, -1F, 0F, -1F, -0.5F, 0F, 0F, -2F, 0F, -0.5F, -2.5F, 0F); // Box 445
		rightWingModel[6].setRotationPoint(-17F, -15F, 35F);

		rightWingModel[7].addShapeBox(0F, 0F, 0F, 4, 5, 51, 0F,7.5F, -2.5F, 0F, -3F, -2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 7.5F, -0.5F, 0F, -3F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 446
		rightWingModel[7].setRotationPoint(-9F, -17F, 69F);

		rightWingModel[8].addShapeBox(0F, 0F, 0F, 5, 5, 15, 0F,8F, -2.5F, 0F, -7F, -1F, -0.5F, 0.5F, -0.5F, 0F, -0.5F, -1.5F, 0F, 8F, -1.5F, 0F, -7F, 0F, -0.5F, 0.5F, -2F, 0F, -0.5F, -2.5F, 0F); // Box 447
		rightWingModel[8].setRotationPoint(-27F, -14F, 20F);

		rightWingModel[9].addShapeBox(0F, 0F, 0F, 5, 5, 34, 0F,5.5F, -2.5F, 0F, -5.5F, -1.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 5.5F, -1.5F, 0F, -5.5F, -1F, 0F, -0.5F, -2.5F, 0F, 0F, -3F, 0F); // Box 448
		rightWingModel[9].setRotationPoint(-21F, -15F, 35F);

		rightWingModel[10].addShapeBox(0F, 0F, 0F, 3, 5, 51, 0F,9F, -3F, 0F, -7.5F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 9F, -1F, 0F, -7.5F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2.5F, 0F); // Box 449
		rightWingModel[10].setRotationPoint(-12F, -17F, 69F);

		rightWingModel[11].addShapeBox(0F, 0F, 0F, 13, 4, 12, 0F,0F, -1F, 0F, 0F, -1.5F, -1F, -1.5F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, -1F, -1.5F, -2F, 0F, 0F, -0.5F, 0F); // Box 450
		rightWingModel[11].setRotationPoint(11F, -14F, 23F);

		rightWingModel[12].addShapeBox(0F, 0F, 0F, 11, 3, 7, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2F, -1F, 0F, -1.5F, -1F, 0F); // Box 454
		rightWingModel[12].setRotationPoint(-5F, -17F, 120F);

		rightWingModel[13].addShapeBox(0F, 0F, 0F, 4, 3, 7, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, -1F, 0F, -2F, -1F, 0F); // Box 455
		rightWingModel[13].setRotationPoint(-9F, -17F, 120F);

		rightWingModel[14].addShapeBox(0F, 0F, 0F, 3, 3, 7, 0F,0F, -1.5F, 0F, 0F, -0.5F, 0F, 2F, -0.5F, 0F, -3.5F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, -3.5F, -1.5F, 0F); // Box 456
		rightWingModel[14].setRotationPoint(-12F, -17F, 120F);

		rightWingModel[15].addShapeBox(0F, 0F, 0F, 5, 3, 7, 0F,-0.5F, 0F, 0F, 0.5F, -1F, 0F, -2F, -0.5F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -1.5F, 0F, -2F, -2F, 0F, 1F, -1F, 0F); // Box 457
		rightWingModel[15].setRotationPoint(5F, -17F, 120F);

		rightWingModel[16].addShapeBox(0F, 0F, 0F, 7, 2, 4, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, -3.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -3.5F, -1F, 0F, -1.5F, -1F, 0F); // Box 458
		rightWingModel[16].setRotationPoint(-3F, -17F, 127F);

		rightWingModel[17].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, -0.5F, 0F, 0.5F, 0F, 0F, 2.5F, -0.5F, 0F, -2.5F, -0.5F, -1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 2.5F, -1F, 0F, -2.5F, -1F, -1F); // Box 459
		rightWingModel[17].setRotationPoint(-7F, -17F, 127F);

		rightWingModel[18].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-0.5F, -1F, 0F, -1F, -0.5F, 0F, 1.5F, -0.5F, 0F, -2F, -0.75F, -1.5F, -0.5F, 0.5F, 0F, -1F, 1F, 0F, 1.5F, 0F, 0F, -2F, 0.25F, -1.5F); // Box 460
		rightWingModel[18].setRotationPoint(-9F, -17F, 127F);

		rightWingModel[19].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, -3F, -0.5F, -1.5F, 3.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, -1F, -1.5F, 3.5F, -1F, 0F); // Box 461
		rightWingModel[19].setRotationPoint(4F, -17F, 127F);
	}

	private void inityawFlapModel_1()
	{
		yawFlapModel[0] = new ModelRendererTurbo(this, 425, 714, textureX, textureY); // Box 216

		yawFlapModel[0].addShapeBox(0F, 0F, -2F, 8, 31, 4, 0F,0F, 0F, -1F, -5F, 0F, -1.5F, -5F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0F, 0F, 0F); // Box 216
		yawFlapModel[0].setRotationPoint(105F, -58F, 0F);
	}

	private void initpitchFlapLeftModel_1()
	{
		pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 289, 748, textureX, textureY); // Box 227
		pitchFlapLeftModel[1] = new ModelRendererTurbo(this, 369, 748, textureX, textureY); // Box 228

		pitchFlapLeftModel[0].addShapeBox(0.5F, -1F, 22F, 12, 3, 24, 0F,0F, -0.5F, 0F, -6.5F, -1.5F, 0F, -2.5F, -1.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, -1F, 0F, -2.5F, -1F, 0.5F, 0F, 0F, 0F); // Box 227
		pitchFlapLeftModel[0].setRotationPoint(100.5F, -27F, -47F);

		pitchFlapLeftModel[1].addShapeBox(0F, 0F, 0F, 5, 3, 22, 0F,0.5F, -1F, 0F, -2.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, -2.5F, -1F, 0F, 0.5F, -1F, 0F, 0F, 0F, 0F); // Box 228
		pitchFlapLeftModel[1].setRotationPoint(101F, -28F, -47F);
	}

	private void initpitchFlapRightModel_1()
	{
		pitchFlapRightModel[0] = new ModelRendererTurbo(this, 289, 776, textureX, textureY); // Box 480
		pitchFlapRightModel[1] = new ModelRendererTurbo(this, 369, 776, textureX, textureY); // Box 481

		pitchFlapRightModel[0].addShapeBox(0.5F, -1F, -46F, 12, 3, 24, 0F,0F, 0F, 0F, -2.5F, -1.5F, 0.5F, -6.5F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -2.5F, -1F, 0.5F, -6.5F, -1F, 0F, 0F, 0F, 0F); // Box 480
		pitchFlapRightModel[0].setRotationPoint(100.5F, -27F, 47F);

		pitchFlapRightModel[1].addShapeBox(0.5F, -0.5F, -22F, 5, 3, 22, 0F,0F, -0.5F, 0F, 0.5F, -1.5F, 0F, -2.5F, -1.5F, 0F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, -2.5F, -1F, 0F, 0.5F, -0.5F, 0F); // Box 481
		pitchFlapRightModel[1].setRotationPoint(100.5F, -27.5F, 47F);
	}

	private void initpitchFlapLeftWingModel_1()
	{
		pitchFlapLeftWingModel[0] = new ModelRendererTurbo(this, 417, 543, textureX, textureY); // Box 199
		pitchFlapLeftWingModel[1] = new ModelRendererTurbo(this, 361, 486, textureX, textureY); // Box 200

		pitchFlapLeftWingModel[0].addShapeBox(0F, 0F, 0F, 10, 5, 34, 0F,-0.5F, 0F, 0F, -0.5F, -1F, 0F, 4.5F, -2.5F, 0F, -3F, -1.5F, 0F, -0.5F, -2F, 0F, -0.5F, -3.5F, 0F, 4.5F, -2F, 0F, -3F, -0.5F, 0F); // Box 199
		pitchFlapLeftWingModel[0].setRotationPoint(8F, -15F, -69F);

		pitchFlapLeftWingModel[1].addShapeBox(0F, 0F, 0F, 4, 5, 51, 0F,0.5F, 0F, 0F, 0.5F, -1F, 0F, 7.5F, -3F, 0F, -2.5F, -2F, 0F, 0.5F, -2F, 0F, 0.5F, -3.5F, 0F, 7.5F, -1.5F, 0F, -2.5F, 0F, 0F); // Box 200
		pitchFlapLeftWingModel[1].setRotationPoint(6F, -17F, -120F);
	}

	private void initpitchFlapRightWingModel_1()
	{
		pitchFlapRightWingModel[0] = new ModelRendererTurbo(this, 417, 640, textureX, textureY); // Box 452
		pitchFlapRightWingModel[1] = new ModelRendererTurbo(this, 361, 583, textureX, textureY); // Box 453

		pitchFlapRightWingModel[0].addShapeBox(0F, 0F, 0F, 10, 5, 34, 0F,-3F, -1.5F, 0F, 4.5F, -2.5F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -3F, -0.5F, 0F, 4.5F, -2F, 0F, -0.5F, -3.5F, 0F, -0.5F, -2F, 0F); // Box 452
		pitchFlapRightWingModel[0].setRotationPoint(8F, -15F, 35F);

		pitchFlapRightWingModel[1].addShapeBox(0F, 0F, 0F, 4, 5, 51, 0F,-2.5F, -2F, 0F, 7.5F, -3F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, 7.5F, -1.5F, 0F, 0.5F, -3.5F, 0F, 0.5F, -2F, 0F); // Box 453
		pitchFlapRightWingModel[1].setRotationPoint(6F, -17F, 69F);
	}

	private void initbodyWheelModel_1()
	{
		bodyWheelModel[0] = new ModelRendererTurbo(this, 1, 438, textureX, textureY); // Box 253
		bodyWheelModel[1] = new ModelRendererTurbo(this, 65, 438, textureX, textureY); // Box 506
		bodyWheelModel[2] = new ModelRendererTurbo(this, 129, 438, textureX, textureY); // Box 507
		bodyWheelModel[3] = new ModelRendererTurbo(this, 145, 438, textureX, textureY); // Box 508
		bodyWheelModel[4] = new ModelRendererTurbo(this, 161, 438, textureX, textureY); // Box 509
		bodyWheelModel[5] = new ModelRendererTurbo(this, 169, 438, textureX, textureY); // Box 510
		bodyWheelModel[6] = new ModelRendererTurbo(this, 201, 438, textureX, textureY); // Box 511
		bodyWheelModel[7] = new ModelRendererTurbo(this, 233, 438, textureX, textureY); // Box 512
		bodyWheelModel[8] = new ModelRendererTurbo(this, 265, 438, textureX, textureY); // Box 513
		bodyWheelModel[9] = new ModelRendererTurbo(this, 193, 438, textureX, textureY); // Box 514
		bodyWheelModel[10] = new ModelRendererTurbo(this, 225, 438, textureX, textureY); // Box 515
		bodyWheelModel[11] = new ModelRendererTurbo(this, 281, 438, textureX, textureY); // Box 516

		bodyWheelModel[0].addShapeBox(0F, 0F, 0F, 30, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 253
		bodyWheelModel[0].setRotationPoint(-82F, -7F, -5F);

		bodyWheelModel[1].addShapeBox(0F, 0F, 0F, 30, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 506
		bodyWheelModel[1].setRotationPoint(-82F, -7F, 4F);

		bodyWheelModel[2].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 507
		bodyWheelModel[2].setRotationPoint(-82F, -7F, -1F);

		bodyWheelModel[3].addShapeBox(0F, 0F, 0F, 2, 9, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 508
		bodyWheelModel[3].setRotationPoint(-82F, -2F, 2F);

		bodyWheelModel[4].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 509
		bodyWheelModel[4].setRotationPoint(-82F, -2F, 1F);

		bodyWheelModel[5].addShapeBox(0F, 0F, 0F, 9, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 510
		bodyWheelModel[5].setRotationPoint(-85.5F, 4F, -2F);

		bodyWheelModel[6].addShapeBox(0F, 0F, 0F, 9, 3, 4, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 511
		bodyWheelModel[6].setRotationPoint(-85.5F, 1F, -2F);

		bodyWheelModel[7].addShapeBox(0F, 0F, 0F, 9, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 512
		bodyWheelModel[7].setRotationPoint(-85.5F, 7F, -2F);

		bodyWheelModel[8].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 513
		bodyWheelModel[8].setRotationPoint(-83F, -6F, -3F);

		bodyWheelModel[9].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 514
		bodyWheelModel[9].setRotationPoint(-86F, -4F, -0.5F);

		bodyWheelModel[10].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 515
		bodyWheelModel[10].setRotationPoint(-86F, -1F, -0.5F);

		bodyWheelModel[11].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 516
		bodyWheelModel[11].setRotationPoint(-80F, -3F, -0.5F);
	}

	private void initleftWingWheelModel_1()
	{
		leftWingWheelModel[0] = new ModelRendererTurbo(this, 1, 450, textureX, textureY); // Box 243
		leftWingWheelModel[1] = new ModelRendererTurbo(this, 17, 450, textureX, textureY); // Box 244
		leftWingWheelModel[2] = new ModelRendererTurbo(this, 49, 450, textureX, textureY); // Box 245
		leftWingWheelModel[3] = new ModelRendererTurbo(this, 65, 450, textureX, textureY); // Box 246
		leftWingWheelModel[4] = new ModelRendererTurbo(this, 113, 450, textureX, textureY); // Box 247
		leftWingWheelModel[5] = new ModelRendererTurbo(this, 129, 450, textureX, textureY); // Box 248
		leftWingWheelModel[6] = new ModelRendererTurbo(this, 153, 450, textureX, textureY); // Box 249
		leftWingWheelModel[7] = new ModelRendererTurbo(this, 193, 450, textureX, textureY); // Box 250
		leftWingWheelModel[8] = new ModelRendererTurbo(this, 233, 450, textureX, textureY); // Box 251
		leftWingWheelModel[9] = new ModelRendererTurbo(this, 273, 450, textureX, textureY); // Box 252

		leftWingWheelModel[0].addShapeBox(0F, 0F, 0F, 2, 15, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		leftWingWheelModel[0].setRotationPoint(-7F, -13F, -33F);

		leftWingWheelModel[1].addShapeBox(0F, 0F, 0F, 12, 6, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 244
		leftWingWheelModel[1].setRotationPoint(-13F, -7F, -34F);

		leftWingWheelModel[2].addShapeBox(0F, 0F, 0F, 6, 6, 1, 0F,0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		leftWingWheelModel[2].setRotationPoint(-1F, -7F, -34F);

		leftWingWheelModel[3].addShapeBox(0F, 0F, 0F, 19, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 246
		leftWingWheelModel[3].setRotationPoint(-14F, -1F, -34F);

		leftWingWheelModel[4].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 247
		leftWingWheelModel[4].setRotationPoint(-17F, -1F, -34F);

		leftWingWheelModel[5].addShapeBox(0F, 0F, 0F, 7, 6, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		leftWingWheelModel[5].setRotationPoint(-8F, -13F, -34F);

		leftWingWheelModel[6].addShapeBox(0F, 0F, 0F, 12, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 249
		leftWingWheelModel[6].setRotationPoint(-12F, -1F, -31F);

		leftWingWheelModel[7].addShapeBox(0F, 0F, 0F, 12, 4, 5, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 250
		leftWingWheelModel[7].setRotationPoint(-12F, -5F, -31F);

		leftWingWheelModel[8].addShapeBox(0F, 0F, 0F, 12, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 251
		leftWingWheelModel[8].setRotationPoint(-12F, 3F, -31F);

		leftWingWheelModel[9].addShapeBox(0F, 0F, 0F, 22, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 252
		leftWingWheelModel[9].setRotationPoint(-21F, -9F, -3F);
	}

	private void initrightWingWheelModel_1()
	{
		rightWingWheelModel[0] = new ModelRendererTurbo(this, 1, 468, textureX, textureY); // Box 496
		rightWingWheelModel[1] = new ModelRendererTurbo(this, 17, 468, textureX, textureY); // Box 497
		rightWingWheelModel[2] = new ModelRendererTurbo(this, 49, 468, textureX, textureY); // Box 498
		rightWingWheelModel[3] = new ModelRendererTurbo(this, 65, 468, textureX, textureY); // Box 499
		rightWingWheelModel[4] = new ModelRendererTurbo(this, 113, 468, textureX, textureY); // Box 500
		rightWingWheelModel[5] = new ModelRendererTurbo(this, 129, 468, textureX, textureY); // Box 501
		rightWingWheelModel[6] = new ModelRendererTurbo(this, 153, 468, textureX, textureY); // Box 502
		rightWingWheelModel[7] = new ModelRendererTurbo(this, 193, 468, textureX, textureY); // Box 503
		rightWingWheelModel[8] = new ModelRendererTurbo(this, 233, 468, textureX, textureY); // Box 504
		rightWingWheelModel[9] = new ModelRendererTurbo(this, 273, 468, textureX, textureY); // Box 505

		rightWingWheelModel[0].addShapeBox(0F, 0F, 0F, 2, 15, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 496
		rightWingWheelModel[0].setRotationPoint(-7F, -13F, 31F);

		rightWingWheelModel[1].addShapeBox(0F, 0F, 0F, 12, 6, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 497
		rightWingWheelModel[1].setRotationPoint(-13F, -7F, 33F);

		rightWingWheelModel[2].addShapeBox(0F, 0F, 0F, 6, 6, 1, 0F,0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 498
		rightWingWheelModel[2].setRotationPoint(-1F, -7F, 33F);

		rightWingWheelModel[3].addShapeBox(0F, 0F, 0F, 19, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 499
		rightWingWheelModel[3].setRotationPoint(-14F, -1F, 33F);

		rightWingWheelModel[4].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 500
		rightWingWheelModel[4].setRotationPoint(-17F, -1F, 33F);

		rightWingWheelModel[5].addShapeBox(0F, 0F, 0F, 7, 6, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 501
		rightWingWheelModel[5].setRotationPoint(-8F, -13F, 33F);

		rightWingWheelModel[6].addShapeBox(0F, 0F, 0F, 12, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 502
		rightWingWheelModel[6].setRotationPoint(-12F, -1F, 26F);

		rightWingWheelModel[7].addShapeBox(0F, 0F, 0F, 12, 4, 5, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 503
		rightWingWheelModel[7].setRotationPoint(-12F, -5F, 26F);

		rightWingWheelModel[8].addShapeBox(0F, 0F, 0F, 12, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 504
		rightWingWheelModel[8].setRotationPoint(-12F, 3F, 26F);

		rightWingWheelModel[9].addShapeBox(0F, 0F, 0F, 22, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 505
		rightWingWheelModel[9].setRotationPoint(-21F, -9F, 2F);
	}

	private void inithudModel_1()
	{
		hudModel[0] = new ModelRendererTurbo(this, 0, 194, textureX, textureY); // Box 814

		hudModel[0].addShapeBox(0F, -1F, -1F, 0, 75, 75, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -73F, 0F, 0F, -73F, 0F, -73F, 0F, 0F, -73F, 0F, 0F, -73F, -73F, 0F, -73F, -73F); // Box 814
		hudModel[0].setRotationPoint(-48.5F, -33F, 0F);
		hudModel[0].rotateAngleX = -0.01745329F;
		hudModel[0].rotateAngleY = 0.01745329F;
		hudModel[0].rotateAngleZ = -0.29670597F;
	}
}