//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: scatalina
// Model Creator: TaskForce51
// Created on: 14.03.2023 - 16:49:36
// Last changed on: 14.03.2023 - 16:49:36

package com.flansmod.client.model.Taskball; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelScatalina extends ModelPlane //Same as Filename
{
	int textureX = 2048;
	int textureY = 2048;

	public ModelScatalina() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[395];
		noseModel = new ModelRendererTurbo[155];
		tailModel = new ModelRendererTurbo[43];
		bayModel = new ModelRendererTurbo[15];
		leftWingModel = new ModelRendererTurbo[66];
		rightWingModel = new ModelRendererTurbo[66];
		yawFlapModel = new ModelRendererTurbo[6];
		pitchFlapLeftModel = new ModelRendererTurbo[4];
		pitchFlapRightModel = new ModelRendererTurbo[4];
		pitchFlapLeftWingModel = new ModelRendererTurbo[1];
		pitchFlapRightWingModel = new ModelRendererTurbo[1];

		initbodyModel_1();
		initnoseModel_1();
		inittailModel_1();
		initbayModel_1();
		initleftWingModel_1();
		initrightWingModel_1();
		inityawFlapModel_1();
		initpitchFlapLeftModel_1();
		initpitchFlapRightModel_1();
		initpitchFlapLeftWingModel_1();
		initpitchFlapRightWingModel_1();

		initPropeller();

		initGuns();

		translateAll(0F, 27F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1823, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 153, 1823, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 265, 1823, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 1, 1922, textureX, textureY); // Box 9
		bodyModel[4] = new ModelRendererTurbo(this, 665, 1823, textureX, textureY); // Box 10
		bodyModel[5] = new ModelRendererTurbo(this, 449, 1823, textureX, textureY); // Box 11
		bodyModel[6] = new ModelRendererTurbo(this, 1, 1721, textureX, textureY); // Box 19
		bodyModel[7] = new ModelRendererTurbo(this, 105, 1721, textureX, textureY); // Box 20
		bodyModel[8] = new ModelRendererTurbo(this, 1, 1580, textureX, textureY); // Box 21
		bodyModel[9] = new ModelRendererTurbo(this, 41, 1580, textureX, textureY); // Box 22
		bodyModel[10] = new ModelRendererTurbo(this, 97, 1580, textureX, textureY); // Box 23
		bodyModel[11] = new ModelRendererTurbo(this, 153, 1580, textureX, textureY); // Box 27
		bodyModel[12] = new ModelRendererTurbo(this, 209, 1580, textureX, textureY); // Box 28
		bodyModel[13] = new ModelRendererTurbo(this, 265, 1580, textureX, textureY); // Box 29
		bodyModel[14] = new ModelRendererTurbo(this, 305, 1580, textureX, textureY); // Box 30
		bodyModel[15] = new ModelRendererTurbo(this, 337, 1580, textureX, textureY); // Box 31
		bodyModel[16] = new ModelRendererTurbo(this, 209, 1721, textureX, textureY); // Box 32
		bodyModel[17] = new ModelRendererTurbo(this, 369, 1580, textureX, textureY); // Box 34
		bodyModel[18] = new ModelRendererTurbo(this, 297, 1721, textureX, textureY); // Box 35
		bodyModel[19] = new ModelRendererTurbo(this, 385, 1580, textureX, textureY); // Box 36
		bodyModel[20] = new ModelRendererTurbo(this, 457, 1580, textureX, textureY); // Box 37
		bodyModel[21] = new ModelRendererTurbo(this, 529, 1580, textureX, textureY); // Box 38
		bodyModel[22] = new ModelRendererTurbo(this, 417, 1721, textureX, textureY); // Box 39
		bodyModel[23] = new ModelRendererTurbo(this, 441, 1580, textureX, textureY); // Box 40
		bodyModel[24] = new ModelRendererTurbo(this, 601, 1580, textureX, textureY); // Box 41
		bodyModel[25] = new ModelRendererTurbo(this, 481, 1721, textureX, textureY); // Box 42
		bodyModel[26] = new ModelRendererTurbo(this, 625, 1580, textureX, textureY); // Box 43
		bodyModel[27] = new ModelRendererTurbo(this, 833, 1580, textureX, textureY); // Box 46
		bodyModel[28] = new ModelRendererTurbo(this, 689, 1580, textureX, textureY); // Box 47
		bodyModel[29] = new ModelRendererTurbo(this, 793, 1580, textureX, textureY); // Box 48
		bodyModel[30] = new ModelRendererTurbo(this, 921, 1580, textureX, textureY); // Box 50
		bodyModel[31] = new ModelRendererTurbo(this, 953, 1580, textureX, textureY); // Box 51
		bodyModel[32] = new ModelRendererTurbo(this, 825, 1823, textureX, textureY); // Box 64
		bodyModel[33] = new ModelRendererTurbo(this, 897, 1874, textureX, textureY); // Box 65
		bodyModel[34] = new ModelRendererTurbo(this, 977, 1823, textureX, textureY); // Box 66
		bodyModel[35] = new ModelRendererTurbo(this, 57, 1922, textureX, textureY); // Box 67
		bodyModel[36] = new ModelRendererTurbo(this, 105, 1922, textureX, textureY); // Box 68
		bodyModel[37] = new ModelRendererTurbo(this, 153, 1922, textureX, textureY); // Box 69
		bodyModel[38] = new ModelRendererTurbo(this, 193, 1922, textureX, textureY); // Box 70
		bodyModel[39] = new ModelRendererTurbo(this, 217, 1922, textureX, textureY); // Box 71
		bodyModel[40] = new ModelRendererTurbo(this, 265, 1922, textureX, textureY); // Box 72
		bodyModel[41] = new ModelRendererTurbo(this, 305, 1922, textureX, textureY); // Box 73
		bodyModel[42] = new ModelRendererTurbo(this, 329, 1922, textureX, textureY); // Box 74
		bodyModel[43] = new ModelRendererTurbo(this, 369, 1922, textureX, textureY); // Box 75
		bodyModel[44] = new ModelRendererTurbo(this, 1, 2009, textureX, textureY); // Box 76
		bodyModel[45] = new ModelRendererTurbo(this, 281, 2009, textureX, textureY); // Box 85
		bodyModel[46] = new ModelRendererTurbo(this, 409, 1922, textureX, textureY); // Box 88
		bodyModel[47] = new ModelRendererTurbo(this, 457, 1922, textureX, textureY); // Box 89
		bodyModel[48] = new ModelRendererTurbo(this, 449, 1930, textureX, textureY); // Box 90
		bodyModel[49] = new ModelRendererTurbo(this, 497, 1922, textureX, textureY); // Box 91
		bodyModel[50] = new ModelRendererTurbo(this, 513, 1922, textureX, textureY); // Box 92
		bodyModel[51] = new ModelRendererTurbo(this, 545, 1932, textureX, textureY); // Box 94
		bodyModel[52] = new ModelRendererTurbo(this, 561, 1922, textureX, textureY); // Box 96
		bodyModel[53] = new ModelRendererTurbo(this, 569, 1922, textureX, textureY); // Box 97
		bodyModel[54] = new ModelRendererTurbo(this, 577, 1922, textureX, textureY); // Box 98
		bodyModel[55] = new ModelRendererTurbo(this, 617, 1922, textureX, textureY); // Box 99
		bodyModel[56] = new ModelRendererTurbo(this, 625, 1922, textureX, textureY); // Box 100
		bodyModel[57] = new ModelRendererTurbo(this, 633, 1922, textureX, textureY); // Box 101
		bodyModel[58] = new ModelRendererTurbo(this, 649, 1922, textureX, textureY); // Box 102
		bodyModel[59] = new ModelRendererTurbo(this, 665, 1922, textureX, textureY); // Box 103
		bodyModel[60] = new ModelRendererTurbo(this, 681, 1922, textureX, textureY); // Box 104
		bodyModel[61] = new ModelRendererTurbo(this, 1001, 1874, textureX, textureY); // Box 105
		bodyModel[62] = new ModelRendererTurbo(this, 705, 1922, textureX, textureY); // Box 108
		bodyModel[63] = new ModelRendererTurbo(this, 753, 1922, textureX, textureY); // Box 109
		bodyModel[64] = new ModelRendererTurbo(this, 793, 1922, textureX, textureY); // Box 110
		bodyModel[65] = new ModelRendererTurbo(this, 817, 1922, textureX, textureY); // Box 111
		bodyModel[66] = new ModelRendererTurbo(this, 825, 1922, textureX, textureY); // Box 114
		bodyModel[67] = new ModelRendererTurbo(this, 929, 1922, textureX, textureY); // Box 115
		bodyModel[68] = new ModelRendererTurbo(this, 1033, 1922, textureX, textureY); // Box 116
		bodyModel[69] = new ModelRendererTurbo(this, 1113, 1922, textureX, textureY); // Box 117
		bodyModel[70] = new ModelRendererTurbo(this, 529, 1580, textureX, textureY); // Box 130
		bodyModel[71] = new ModelRendererTurbo(this, 537, 1580, textureX, textureY); // Box 131
		bodyModel[72] = new ModelRendererTurbo(this, 745, 1580, textureX, textureY); // Box 132
		bodyModel[73] = new ModelRendererTurbo(this, 753, 1580, textureX, textureY); // Box 133
		bodyModel[74] = new ModelRendererTurbo(this, 841, 1580, textureX, textureY); // Box 134
		bodyModel[75] = new ModelRendererTurbo(this, 1025, 1580, textureX, textureY); // Box 135
		bodyModel[76] = new ModelRendererTurbo(this, 857, 1580, textureX, textureY); // Box 136
		bodyModel[77] = new ModelRendererTurbo(this, 1041, 1580, textureX, textureY); // Box 137
		bodyModel[78] = new ModelRendererTurbo(this, 1049, 1580, textureX, textureY); // Box 138
		bodyModel[79] = new ModelRendererTurbo(this, 1057, 1580, textureX, textureY); // Box 139
		bodyModel[80] = new ModelRendererTurbo(this, 1065, 1580, textureX, textureY); // Box 140
		bodyModel[81] = new ModelRendererTurbo(this, 1121, 1580, textureX, textureY); // Box 141
		bodyModel[82] = new ModelRendererTurbo(this, 1177, 1580, textureX, textureY); // Box 142
		bodyModel[83] = new ModelRendererTurbo(this, 1217, 1580, textureX, textureY); // Box 143
		bodyModel[84] = new ModelRendererTurbo(this, 1257, 1580, textureX, textureY); // Box 144
		bodyModel[85] = new ModelRendererTurbo(this, 1289, 1580, textureX, textureY); // Box 145
		bodyModel[86] = new ModelRendererTurbo(this, 1649, 1772, textureX, textureY); // Box 150
		bodyModel[87] = new ModelRendererTurbo(this, 1129, 1823, textureX, textureY); // Box 151
		bodyModel[88] = new ModelRendererTurbo(this, 1193, 1823, textureX, textureY); // Box 152
		bodyModel[89] = new ModelRendererTurbo(this, 1545, 1823, textureX, textureY); // Box 153
		bodyModel[90] = new ModelRendererTurbo(this, 1241, 1823, textureX, textureY); // Box 154
		bodyModel[91] = new ModelRendererTurbo(this, 1345, 1823, textureX, textureY); // Box 155
		bodyModel[92] = new ModelRendererTurbo(this, 1385, 1823, textureX, textureY); // Box 156
		bodyModel[93] = new ModelRendererTurbo(this, 1617, 1823, textureX, textureY); // Box 157
		bodyModel[94] = new ModelRendererTurbo(this, 1401, 1823, textureX, textureY); // Box 158
		bodyModel[95] = new ModelRendererTurbo(this, 273, 440, textureX, textureY); // Box 276
		bodyModel[96] = new ModelRendererTurbo(this, 337, 440, textureX, textureY); // Box 277
		bodyModel[97] = new ModelRendererTurbo(this, 393, 440, textureX, textureY); // Box 278
		bodyModel[98] = new ModelRendererTurbo(this, 473, 440, textureX, textureY); // Box 279
		bodyModel[99] = new ModelRendererTurbo(this, 57, 440, textureX, textureY); // Box 280
		bodyModel[100] = new ModelRendererTurbo(this, 73, 440, textureX, textureY); // Box 281
		bodyModel[101] = new ModelRendererTurbo(this, 89, 440, textureX, textureY); // Box 282
		bodyModel[102] = new ModelRendererTurbo(this, 561, 440, textureX, textureY); // Box 283
		bodyModel[103] = new ModelRendererTurbo(this, 689, 440, textureX, textureY); // Box 284
		bodyModel[104] = new ModelRendererTurbo(this, 97, 440, textureX, textureY); // Box 285
		bodyModel[105] = new ModelRendererTurbo(this, 105, 440, textureX, textureY); // Box 286
		bodyModel[106] = new ModelRendererTurbo(this, 73, 557, textureX, textureY); // Box 239
		bodyModel[107] = new ModelRendererTurbo(this, 41, 557, textureX, textureY); // Box 240
		bodyModel[108] = new ModelRendererTurbo(this, 129, 557, textureX, textureY); // Box 241
		bodyModel[109] = new ModelRendererTurbo(this, 177, 557, textureX, textureY); // Box 242
		bodyModel[110] = new ModelRendererTurbo(this, 145, 557, textureX, textureY); // Box 243
		bodyModel[111] = new ModelRendererTurbo(this, 241, 557, textureX, textureY); // Box 244
		bodyModel[112] = new ModelRendererTurbo(this, 193, 557, textureX, textureY); // Box 245
		bodyModel[113] = new ModelRendererTurbo(this, 265, 557, textureX, textureY); // Box 246
		bodyModel[114] = new ModelRendererTurbo(this, 217, 557, textureX, textureY); // Box 247
		bodyModel[115] = new ModelRendererTurbo(this, 225, 557, textureX, textureY); // Box 248
		bodyModel[116] = new ModelRendererTurbo(this, 289, 557, textureX, textureY); // Box 250
		bodyModel[117] = new ModelRendererTurbo(this, 297, 557, textureX, textureY); // Box 251
		bodyModel[118] = new ModelRendererTurbo(this, 305, 557, textureX, textureY); // Box 252
		bodyModel[119] = new ModelRendererTurbo(this, 329, 557, textureX, textureY); // Box 253
		bodyModel[120] = new ModelRendererTurbo(this, 41, 557, textureX, textureY); // Box 962
		bodyModel[121] = new ModelRendererTurbo(this, 73, 557, textureX, textureY); // Box 964
		bodyModel[122] = new ModelRendererTurbo(this, 105, 557, textureX, textureY); // Box 966
		bodyModel[123] = new ModelRendererTurbo(this, 233, 557, textureX, textureY); // Box 782
		bodyModel[124] = new ModelRendererTurbo(this, 353, 557, textureX, textureY); // Box 783
		bodyModel[125] = new ModelRendererTurbo(this, 1, 1772, textureX, textureY); // Box 316
		bodyModel[126] = new ModelRendererTurbo(this, 153, 1772, textureX, textureY); // Box 317
		bodyModel[127] = new ModelRendererTurbo(this, 265, 1772, textureX, textureY); // Box 318
		bodyModel[128] = new ModelRendererTurbo(this, 1, 1874, textureX, textureY); // Box 320
		bodyModel[129] = new ModelRendererTurbo(this, 665, 1772, textureX, textureY); // Box 321
		bodyModel[130] = new ModelRendererTurbo(this, 449, 1772, textureX, textureY); // Box 322
		bodyModel[131] = new ModelRendererTurbo(this, 1, 1670, textureX, textureY); // Box 323
		bodyModel[132] = new ModelRendererTurbo(this, 105, 1670, textureX, textureY); // Box 324
		bodyModel[133] = new ModelRendererTurbo(this, 1, 1625, textureX, textureY); // Box 325
		bodyModel[134] = new ModelRendererTurbo(this, 41, 1625, textureX, textureY); // Box 326
		bodyModel[135] = new ModelRendererTurbo(this, 97, 1625, textureX, textureY); // Box 327
		bodyModel[136] = new ModelRendererTurbo(this, 153, 1625, textureX, textureY); // Box 328
		bodyModel[137] = new ModelRendererTurbo(this, 209, 1625, textureX, textureY); // Box 329
		bodyModel[138] = new ModelRendererTurbo(this, 265, 1625, textureX, textureY); // Box 330
		bodyModel[139] = new ModelRendererTurbo(this, 305, 1625, textureX, textureY); // Box 331
		bodyModel[140] = new ModelRendererTurbo(this, 337, 1625, textureX, textureY); // Box 332
		bodyModel[141] = new ModelRendererTurbo(this, 209, 1670, textureX, textureY); // Box 333
		bodyModel[142] = new ModelRendererTurbo(this, 369, 1625, textureX, textureY); // Box 334
		bodyModel[143] = new ModelRendererTurbo(this, 297, 1670, textureX, textureY); // Box 335
		bodyModel[144] = new ModelRendererTurbo(this, 385, 1625, textureX, textureY); // Box 336
		bodyModel[145] = new ModelRendererTurbo(this, 457, 1625, textureX, textureY); // Box 337
		bodyModel[146] = new ModelRendererTurbo(this, 529, 1625, textureX, textureY); // Box 338
		bodyModel[147] = new ModelRendererTurbo(this, 417, 1670, textureX, textureY); // Box 339
		bodyModel[148] = new ModelRendererTurbo(this, 441, 1625, textureX, textureY); // Box 340
		bodyModel[149] = new ModelRendererTurbo(this, 601, 1625, textureX, textureY); // Box 341
		bodyModel[150] = new ModelRendererTurbo(this, 481, 1670, textureX, textureY); // Box 342
		bodyModel[151] = new ModelRendererTurbo(this, 625, 1625, textureX, textureY); // Box 343
		bodyModel[152] = new ModelRendererTurbo(this, 833, 1625, textureX, textureY); // Box 346
		bodyModel[153] = new ModelRendererTurbo(this, 689, 1625, textureX, textureY); // Box 347
		bodyModel[154] = new ModelRendererTurbo(this, 793, 1625, textureX, textureY); // Box 348
		bodyModel[155] = new ModelRendererTurbo(this, 921, 1625, textureX, textureY); // Box 349
		bodyModel[156] = new ModelRendererTurbo(this, 953, 1625, textureX, textureY); // Box 350
		bodyModel[157] = new ModelRendererTurbo(this, 825, 1772, textureX, textureY); // Box 357
		bodyModel[158] = new ModelRendererTurbo(this, 977, 1772, textureX, textureY); // Box 359
		bodyModel[159] = new ModelRendererTurbo(this, 57, 1874, textureX, textureY); // Box 360
		bodyModel[160] = new ModelRendererTurbo(this, 105, 1874, textureX, textureY); // Box 361
		bodyModel[161] = new ModelRendererTurbo(this, 153, 1874, textureX, textureY); // Box 362
		bodyModel[162] = new ModelRendererTurbo(this, 193, 1874, textureX, textureY); // Box 363
		bodyModel[163] = new ModelRendererTurbo(this, 217, 1874, textureX, textureY); // Box 364
		bodyModel[164] = new ModelRendererTurbo(this, 265, 1874, textureX, textureY); // Box 365
		bodyModel[165] = new ModelRendererTurbo(this, 305, 1874, textureX, textureY); // Box 366
		bodyModel[166] = new ModelRendererTurbo(this, 329, 1874, textureX, textureY); // Box 367
		bodyModel[167] = new ModelRendererTurbo(this, 369, 1874, textureX, textureY); // Box 368
		bodyModel[168] = new ModelRendererTurbo(this, 1, 1970, textureX, textureY); // Box 369
		bodyModel[169] = new ModelRendererTurbo(this, 281, 1970, textureX, textureY); // Box 378
		bodyModel[170] = new ModelRendererTurbo(this, 409, 1874, textureX, textureY); // Box 381
		bodyModel[171] = new ModelRendererTurbo(this, 457, 1874, textureX, textureY); // Box 382
		bodyModel[172] = new ModelRendererTurbo(this, 449, 1882, textureX, textureY); // Box 383
		bodyModel[173] = new ModelRendererTurbo(this, 497, 1874, textureX, textureY); // Box 384
		bodyModel[174] = new ModelRendererTurbo(this, 513, 1874, textureX, textureY); // Box 385
		bodyModel[175] = new ModelRendererTurbo(this, 545, 1882, textureX, textureY); // Box 387
		bodyModel[176] = new ModelRendererTurbo(this, 561, 1874, textureX, textureY); // Box 389
		bodyModel[177] = new ModelRendererTurbo(this, 569, 1874, textureX, textureY); // Box 390
		bodyModel[178] = new ModelRendererTurbo(this, 577, 1874, textureX, textureY); // Box 391
		bodyModel[179] = new ModelRendererTurbo(this, 617, 1874, textureX, textureY); // Box 392
		bodyModel[180] = new ModelRendererTurbo(this, 625, 1874, textureX, textureY); // Box 393
		bodyModel[181] = new ModelRendererTurbo(this, 633, 1874, textureX, textureY); // Box 394
		bodyModel[182] = new ModelRendererTurbo(this, 649, 1874, textureX, textureY); // Box 395
		bodyModel[183] = new ModelRendererTurbo(this, 665, 1874, textureX, textureY); // Box 396
		bodyModel[184] = new ModelRendererTurbo(this, 681, 1874, textureX, textureY); // Box 397
		bodyModel[185] = new ModelRendererTurbo(this, 705, 1874, textureX, textureY); // Box 401
		bodyModel[186] = new ModelRendererTurbo(this, 753, 1874, textureX, textureY); // Box 402
		bodyModel[187] = new ModelRendererTurbo(this, 793, 1874, textureX, textureY); // Box 403
		bodyModel[188] = new ModelRendererTurbo(this, 817, 1874, textureX, textureY); // Box 404
		bodyModel[189] = new ModelRendererTurbo(this, 825, 1874, textureX, textureY); // Box 407
		bodyModel[190] = new ModelRendererTurbo(this, 929, 1874, textureX, textureY); // Box 408
		bodyModel[191] = new ModelRendererTurbo(this, 1033, 1874, textureX, textureY); // Box 409
		bodyModel[192] = new ModelRendererTurbo(this, 1113, 1874, textureX, textureY); // Box 410
		bodyModel[193] = new ModelRendererTurbo(this, 529, 1625, textureX, textureY); // Box 422
		bodyModel[194] = new ModelRendererTurbo(this, 537, 1625, textureX, textureY); // Box 423
		bodyModel[195] = new ModelRendererTurbo(this, 745, 1625, textureX, textureY); // Box 424
		bodyModel[196] = new ModelRendererTurbo(this, 753, 1625, textureX, textureY); // Box 425
		bodyModel[197] = new ModelRendererTurbo(this, 841, 1625, textureX, textureY); // Box 426
		bodyModel[198] = new ModelRendererTurbo(this, 1025, 1625, textureX, textureY); // Box 427
		bodyModel[199] = new ModelRendererTurbo(this, 857, 1625, textureX, textureY); // Box 428
		bodyModel[200] = new ModelRendererTurbo(this, 1041, 1625, textureX, textureY); // Box 429
		bodyModel[201] = new ModelRendererTurbo(this, 1049, 1625, textureX, textureY); // Box 430
		bodyModel[202] = new ModelRendererTurbo(this, 1057, 1625, textureX, textureY); // Box 431
		bodyModel[203] = new ModelRendererTurbo(this, 1065, 1625, textureX, textureY); // Box 432
		bodyModel[204] = new ModelRendererTurbo(this, 1121, 1625, textureX, textureY); // Box 433
		bodyModel[205] = new ModelRendererTurbo(this, 1177, 1625, textureX, textureY); // Box 434
		bodyModel[206] = new ModelRendererTurbo(this, 1217, 1625, textureX, textureY); // Box 435
		bodyModel[207] = new ModelRendererTurbo(this, 1257, 1625, textureX, textureY); // Box 436
		bodyModel[208] = new ModelRendererTurbo(this, 1289, 1625, textureX, textureY); // Box 437
		bodyModel[209] = new ModelRendererTurbo(this, 1721, 1772, textureX, textureY); // Box 442
		bodyModel[210] = new ModelRendererTurbo(this, 1129, 1772, textureX, textureY); // Box 443
		bodyModel[211] = new ModelRendererTurbo(this, 1577, 1772, textureX, textureY); // Box 445
		bodyModel[212] = new ModelRendererTurbo(this, 1193, 1772, textureX, textureY); // Box 446
		bodyModel[213] = new ModelRendererTurbo(this, 1297, 1772, textureX, textureY); // Box 447
		bodyModel[214] = new ModelRendererTurbo(this, 1337, 1772, textureX, textureY); // Box 448
		bodyModel[215] = new ModelRendererTurbo(this, 1353, 1772, textureX, textureY); // Box 449
		bodyModel[216] = new ModelRendererTurbo(this, 1369, 1772, textureX, textureY); // Box 450
		bodyModel[217] = new ModelRendererTurbo(this, 1017, 440, textureX, textureY); // Box 566
		bodyModel[218] = new ModelRendererTurbo(this, 1081, 440, textureX, textureY); // Box 567
		bodyModel[219] = new ModelRendererTurbo(this, 1137, 440, textureX, textureY); // Box 568
		bodyModel[220] = new ModelRendererTurbo(this, 1217, 440, textureX, textureY); // Box 569
		bodyModel[221] = new ModelRendererTurbo(this, 273, 440, textureX, textureY); // Box 570
		bodyModel[222] = new ModelRendererTurbo(this, 409, 440, textureX, textureY); // Box 571
		bodyModel[223] = new ModelRendererTurbo(this, 177, 440, textureX, textureY); // Box 572
		bodyModel[224] = new ModelRendererTurbo(this, 1305, 440, textureX, textureY); // Box 573
		bodyModel[225] = new ModelRendererTurbo(this, 1433, 440, textureX, textureY); // Box 574
		bodyModel[226] = new ModelRendererTurbo(this, 209, 440, textureX, textureY); // Box 575
		bodyModel[227] = new ModelRendererTurbo(this, 241, 440, textureX, textureY); // Box 576
		bodyModel[228] = new ModelRendererTurbo(this, 457, 557, textureX, textureY); // Box 585
		bodyModel[229] = new ModelRendererTurbo(this, 409, 557, textureX, textureY); // Box 586
		bodyModel[230] = new ModelRendererTurbo(this, 425, 557, textureX, textureY); // Box 587
		bodyModel[231] = new ModelRendererTurbo(this, 505, 557, textureX, textureY); // Box 588
		bodyModel[232] = new ModelRendererTurbo(this, 545, 557, textureX, textureY); // Box 589
		bodyModel[233] = new ModelRendererTurbo(this, 569, 557, textureX, textureY); // Box 590
		bodyModel[234] = new ModelRendererTurbo(this, 521, 557, textureX, textureY); // Box 591
		bodyModel[235] = new ModelRendererTurbo(this, 593, 557, textureX, textureY); // Box 592
		bodyModel[236] = new ModelRendererTurbo(this, 385, 557, textureX, textureY); // Box 593
		bodyModel[237] = new ModelRendererTurbo(this, 617, 557, textureX, textureY); // Box 594
		bodyModel[238] = new ModelRendererTurbo(this, 625, 557, textureX, textureY); // Box 595
		bodyModel[239] = new ModelRendererTurbo(this, 633, 557, textureX, textureY); // Box 596
		bodyModel[240] = new ModelRendererTurbo(this, 641, 557, textureX, textureY); // Box 597
		bodyModel[241] = new ModelRendererTurbo(this, 665, 557, textureX, textureY); // Box 598
		bodyModel[242] = new ModelRendererTurbo(this, 145, 557, textureX, textureY); // Box 599
		bodyModel[243] = new ModelRendererTurbo(this, 161, 557, textureX, textureY); // Box 600
		bodyModel[244] = new ModelRendererTurbo(this, 241, 557, textureX, textureY); // Box 601
		bodyModel[245] = new ModelRendererTurbo(this, 689, 557, textureX, textureY); // Box 602
		bodyModel[246] = new ModelRendererTurbo(this, 697, 557, textureX, textureY); // Box 603
		bodyModel[247] = new ModelRendererTurbo(this, 1, 483, textureX, textureY); // Box 623
		bodyModel[248] = new ModelRendererTurbo(this, 49, 483, textureX, textureY); // Box 624
		bodyModel[249] = new ModelRendererTurbo(this, 33, 483, textureX, textureY); // Box 625
		bodyModel[250] = new ModelRendererTurbo(this, 65, 483, textureX, textureY); // Box 626
		bodyModel[251] = new ModelRendererTurbo(this, 89, 483, textureX, textureY); // Box 627
		bodyModel[252] = new ModelRendererTurbo(this, 113, 483, textureX, textureY); // Box 628
		bodyModel[253] = new ModelRendererTurbo(this, 137, 483, textureX, textureY); // Box 629
		bodyModel[254] = new ModelRendererTurbo(this, 145, 483, textureX, textureY); // Box 630
		bodyModel[255] = new ModelRendererTurbo(this, 153, 483, textureX, textureY); // Box 631
		bodyModel[256] = new ModelRendererTurbo(this, 177, 483, textureX, textureY); // Box 632
		bodyModel[257] = new ModelRendererTurbo(this, 201, 483, textureX, textureY); // Box 633
		bodyModel[258] = new ModelRendererTurbo(this, 1, 483, textureX, textureY); // Box 634
		bodyModel[259] = new ModelRendererTurbo(this, 49, 483, textureX, textureY); // Box 635
		bodyModel[260] = new ModelRendererTurbo(this, 81, 483, textureX, textureY); // Box 636
		bodyModel[261] = new ModelRendererTurbo(this, 217, 483, textureX, textureY); // Box 637
		bodyModel[262] = new ModelRendererTurbo(this, 737, 483, textureX, textureY); // Box 675
		bodyModel[263] = new ModelRendererTurbo(this, 329, 483, textureX, textureY); // Box 676
		bodyModel[264] = new ModelRendererTurbo(this, 721, 483, textureX, textureY); // Box 677
		bodyModel[265] = new ModelRendererTurbo(this, 769, 483, textureX, textureY); // Box 678
		bodyModel[266] = new ModelRendererTurbo(this, 809, 483, textureX, textureY); // Box 239
		bodyModel[267] = new ModelRendererTurbo(this, 465, 483, textureX, textureY); // Box 241
		bodyModel[268] = new ModelRendererTurbo(this, 529, 483, textureX, textureY); // Box 242
		bodyModel[269] = new ModelRendererTurbo(this, 753, 483, textureX, textureY); // Box 243
		bodyModel[270] = new ModelRendererTurbo(this, 857, 483, textureX, textureY); // Box 244
		bodyModel[271] = new ModelRendererTurbo(this, 881, 483, textureX, textureY); // Box 246
		bodyModel[272] = new ModelRendererTurbo(this, 905, 483, textureX, textureY); // Box 690
		bodyModel[273] = new ModelRendererTurbo(this, 177, 483, textureX, textureY); // Box 691
		bodyModel[274] = new ModelRendererTurbo(this, 153, 483, textureX, textureY); // Box 1
		bodyModel[275] = new ModelRendererTurbo(this, 649, 483, textureX, textureY); // Box 2
		bodyModel[276] = new ModelRendererTurbo(this, 169, 483, textureX, textureY); // Box 3
		bodyModel[277] = new ModelRendererTurbo(this, 841, 483, textureX, textureY); // Box 4
		bodyModel[278] = new ModelRendererTurbo(this, 929, 483, textureX, textureY); // Box 5
		bodyModel[279] = new ModelRendererTurbo(this, 961, 483, textureX, textureY); // Box 6
		bodyModel[280] = new ModelRendererTurbo(this, 897, 483, textureX, textureY); // Box 7
		bodyModel[281] = new ModelRendererTurbo(this, 985, 483, textureX, textureY); // Box 8
		bodyModel[282] = new ModelRendererTurbo(this, 193, 483, textureX, textureY); // Box 10
		bodyModel[283] = new ModelRendererTurbo(this, 201, 483, textureX, textureY); // Box 11
		bodyModel[284] = new ModelRendererTurbo(this, 217, 483, textureX, textureY); // Box 12
		bodyModel[285] = new ModelRendererTurbo(this, 233, 483, textureX, textureY); // Box 13
		bodyModel[286] = new ModelRendererTurbo(this, 361, 483, textureX, textureY); // Box 14
		bodyModel[287] = new ModelRendererTurbo(this, 369, 483, textureX, textureY); // Box 15
		bodyModel[288] = new ModelRendererTurbo(this, 489, 483, textureX, textureY); // Box 16
		bodyModel[289] = new ModelRendererTurbo(this, 505, 483, textureX, textureY); // Box 17
		bodyModel[290] = new ModelRendererTurbo(this, 513, 483, textureX, textureY); // Box 18
		bodyModel[291] = new ModelRendererTurbo(this, 609, 483, textureX, textureY); // Box 19
		bodyModel[292] = new ModelRendererTurbo(this, 617, 483, textureX, textureY); // Box 20
		bodyModel[293] = new ModelRendererTurbo(this, 641, 483, textureX, textureY); // Box 21
		bodyModel[294] = new ModelRendererTurbo(this, 649, 483, textureX, textureY); // Box 22
		bodyModel[295] = new ModelRendererTurbo(this, 753, 483, textureX, textureY); // Box 23
		bodyModel[296] = new ModelRendererTurbo(this, 769, 483, textureX, textureY); // Box 24
		bodyModel[297] = new ModelRendererTurbo(this, 625, 483, textureX, textureY); // Box 25
		bodyModel[298] = new ModelRendererTurbo(this, 777, 483, textureX, textureY); // Box 27
		bodyModel[299] = new ModelRendererTurbo(this, 921, 483, textureX, textureY); // Box 28
		bodyModel[300] = new ModelRendererTurbo(this, 1017, 483, textureX, textureY); // Box 29
		bodyModel[301] = new ModelRendererTurbo(this, 809, 483, textureX, textureY); // Box 30
		bodyModel[302] = new ModelRendererTurbo(this, 841, 483, textureX, textureY); // Box 31
		bodyModel[303] = new ModelRendererTurbo(this, 857, 483, textureX, textureY); // Box 32
		bodyModel[304] = new ModelRendererTurbo(this, 873, 483, textureX, textureY); // Box 33
		bodyModel[305] = new ModelRendererTurbo(this, 1497, 1823, textureX, textureY); // Box 692
		bodyModel[306] = new ModelRendererTurbo(this, 1521, 1823, textureX, textureY); // Box 693
		bodyModel[307] = new ModelRendererTurbo(this, 1465, 1772, textureX, textureY); // Box 694
		bodyModel[308] = new ModelRendererTurbo(this, 1529, 1772, textureX, textureY); // Box 695
		bodyModel[309] = new ModelRendererTurbo(this, 1553, 1772, textureX, textureY); // Box 696
		bodyModel[310] = new ModelRendererTurbo(this, 1121, 483, textureX, textureY); // Box 697
		bodyModel[311] = new ModelRendererTurbo(this, 1337, 483, textureX, textureY); // Box 698
		bodyModel[312] = new ModelRendererTurbo(this, 705, 557, textureX, textureY); // Box 263
		bodyModel[313] = new ModelRendererTurbo(this, 57, 557, textureX, textureY); // Box 264
		bodyModel[314] = new ModelRendererTurbo(this, 257, 557, textureX, textureY); // Box 786
		bodyModel[315] = new ModelRendererTurbo(this, 457, 557, textureX, textureY); // Box 789
		bodyModel[316] = new ModelRendererTurbo(this, 281, 557, textureX, textureY); // Box 791
		bodyModel[317] = new ModelRendererTurbo(this, 489, 557, textureX, textureY); // Box 792
		bodyModel[318] = new ModelRendererTurbo(this, 897, 1874, textureX, textureY); // Box 774
		bodyModel[319] = new ModelRendererTurbo(this, 505, 1874, textureX, textureY); // Box 775
		bodyModel[320] = new ModelRendererTurbo(this, 521, 1874, textureX, textureY); // Box 776
		bodyModel[321] = new ModelRendererTurbo(this, 641, 1874, textureX, textureY); // Box 777
		bodyModel[322] = new ModelRendererTurbo(this, 1025, 1874, textureX, textureY); // Box 778
		bodyModel[323] = new ModelRendererTurbo(this, 657, 1874, textureX, textureY); // Box 779
		bodyModel[324] = new ModelRendererTurbo(this, 945, 1874, textureX, textureY); // Box 780
		bodyModel[325] = new ModelRendererTurbo(this, 1049, 1874, textureX, textureY); // Box 781
		bodyModel[326] = new ModelRendererTurbo(this, 1089, 1874, textureX, textureY); // Box 782
		bodyModel[327] = new ModelRendererTurbo(this, 721, 557, textureX, textureY); // Box 737
		bodyModel[328] = new ModelRendererTurbo(this, 545, 557, textureX, textureY); // Box 738
		bodyModel[329] = new ModelRendererTurbo(this, 561, 557, textureX, textureY); // Box 739
		bodyModel[330] = new ModelRendererTurbo(this, 585, 557, textureX, textureY); // Box 740
		bodyModel[331] = new ModelRendererTurbo(this, 609, 557, textureX, textureY); // Box 741
		bodyModel[332] = new ModelRendererTurbo(this, 737, 557, textureX, textureY); // Box 742
		bodyModel[333] = new ModelRendererTurbo(this, 737, 557, textureX, textureY); // Box 743
		bodyModel[334] = new ModelRendererTurbo(this, 785, 557, textureX, textureY); // Box 744
		bodyModel[335] = new ModelRendererTurbo(this, 809, 557, textureX, textureY); // Box 745
		bodyModel[336] = new ModelRendererTurbo(this, 833, 557, textureX, textureY); // Box 746
		bodyModel[337] = new ModelRendererTurbo(this, 857, 557, textureX, textureY); // Box 747
		bodyModel[338] = new ModelRendererTurbo(this, 865, 557, textureX, textureY); // Box 748
		bodyModel[339] = new ModelRendererTurbo(this, 1, 541, textureX, textureY); // Box 235
		bodyModel[340] = new ModelRendererTurbo(this, 41, 541, textureX, textureY); // Box 235
		bodyModel[341] = new ModelRendererTurbo(this, 65, 541, textureX, textureY); // Box 235
		bodyModel[342] = new ModelRendererTurbo(this, 73, 541, textureX, textureY); // Box 235
		bodyModel[343] = new ModelRendererTurbo(this, 97, 541, textureX, textureY); // Box 5
		bodyModel[344] = new ModelRendererTurbo(this, 105, 541, textureX, textureY); // Box 6
		bodyModel[345] = new ModelRendererTurbo(this, 129, 541, textureX, textureY); // Box 7
		bodyModel[346] = new ModelRendererTurbo(this, 153, 541, textureX, textureY); // Box 8
		bodyModel[347] = new ModelRendererTurbo(this, 177, 541, textureX, textureY); // Box 10
		bodyModel[348] = new ModelRendererTurbo(this, 201, 541, textureX, textureY); // Box 11
		bodyModel[349] = new ModelRendererTurbo(this, 225, 541, textureX, textureY); // Box 12
		bodyModel[350] = new ModelRendererTurbo(this, 233, 541, textureX, textureY); // Box 13
		bodyModel[351] = new ModelRendererTurbo(this, 273, 541, textureX, textureY); // Box 14
		bodyModel[352] = new ModelRendererTurbo(this, 289, 541, textureX, textureY); // Box 15
		bodyModel[353] = new ModelRendererTurbo(this, 1, 541, textureX, textureY); // Box 16
		bodyModel[354] = new ModelRendererTurbo(this, 89, 541, textureX, textureY); // Box 17
		bodyModel[355] = new ModelRendererTurbo(this, 305, 541, textureX, textureY); // Box 18
		bodyModel[356] = new ModelRendererTurbo(this, 313, 541, textureX, textureY); // Box 19
		bodyModel[357] = new ModelRendererTurbo(this, 321, 541, textureX, textureY); // Box 20
		bodyModel[358] = new ModelRendererTurbo(this, 329, 541, textureX, textureY); // Box 21
		bodyModel[359] = new ModelRendererTurbo(this, 337, 541, textureX, textureY); // Box 22
		bodyModel[360] = new ModelRendererTurbo(this, 345, 541, textureX, textureY); // Box 0
		bodyModel[361] = new ModelRendererTurbo(this, 353, 541, textureX, textureY); // Box 1
		bodyModel[362] = new ModelRendererTurbo(this, 377, 541, textureX, textureY); // Box 2
		bodyModel[363] = new ModelRendererTurbo(this, 385, 541, textureX, textureY); // Box 3
		bodyModel[364] = new ModelRendererTurbo(this, 393, 541, textureX, textureY); // Box 4
		bodyModel[365] = new ModelRendererTurbo(this, 401, 541, textureX, textureY); // Box 5
		bodyModel[366] = new ModelRendererTurbo(this, 137, 541, textureX, textureY); // Box 6
		bodyModel[367] = new ModelRendererTurbo(this, 1, 541, textureX, textureY); // Box 749
		bodyModel[368] = new ModelRendererTurbo(this, 41, 541, textureX, textureY); // Box 750
		bodyModel[369] = new ModelRendererTurbo(this, 65, 541, textureX, textureY); // Box 751
		bodyModel[370] = new ModelRendererTurbo(this, 73, 541, textureX, textureY); // Box 752
		bodyModel[371] = new ModelRendererTurbo(this, 97, 541, textureX, textureY); // Box 753
		bodyModel[372] = new ModelRendererTurbo(this, 105, 541, textureX, textureY); // Box 754
		bodyModel[373] = new ModelRendererTurbo(this, 129, 541, textureX, textureY); // Box 755
		bodyModel[374] = new ModelRendererTurbo(this, 153, 541, textureX, textureY); // Box 756
		bodyModel[375] = new ModelRendererTurbo(this, 177, 541, textureX, textureY); // Box 757
		bodyModel[376] = new ModelRendererTurbo(this, 201, 541, textureX, textureY); // Box 758
		bodyModel[377] = new ModelRendererTurbo(this, 225, 541, textureX, textureY); // Box 759
		bodyModel[378] = new ModelRendererTurbo(this, 233, 541, textureX, textureY); // Box 760
		bodyModel[379] = new ModelRendererTurbo(this, 273, 541, textureX, textureY); // Box 761
		bodyModel[380] = new ModelRendererTurbo(this, 289, 541, textureX, textureY); // Box 762
		bodyModel[381] = new ModelRendererTurbo(this, 1, 541, textureX, textureY); // Box 763
		bodyModel[382] = new ModelRendererTurbo(this, 89, 541, textureX, textureY); // Box 764
		bodyModel[383] = new ModelRendererTurbo(this, 305, 541, textureX, textureY); // Box 765
		bodyModel[384] = new ModelRendererTurbo(this, 313, 541, textureX, textureY); // Box 766
		bodyModel[385] = new ModelRendererTurbo(this, 321, 541, textureX, textureY); // Box 767
		bodyModel[386] = new ModelRendererTurbo(this, 329, 541, textureX, textureY); // Box 768
		bodyModel[387] = new ModelRendererTurbo(this, 337, 541, textureX, textureY); // Box 769
		bodyModel[388] = new ModelRendererTurbo(this, 345, 541, textureX, textureY); // Box 770
		bodyModel[389] = new ModelRendererTurbo(this, 353, 541, textureX, textureY); // Box 771
		bodyModel[390] = new ModelRendererTurbo(this, 377, 541, textureX, textureY); // Box 772
		bodyModel[391] = new ModelRendererTurbo(this, 385, 541, textureX, textureY); // Box 773
		bodyModel[392] = new ModelRendererTurbo(this, 393, 541, textureX, textureY); // Box 774
		bodyModel[393] = new ModelRendererTurbo(this, 401, 541, textureX, textureY); // Box 775
		bodyModel[394] = new ModelRendererTurbo(this, 137, 541, textureX, textureY); // Box 776

		bodyModel[0].addShapeBox(0F, 0F, 0F, 72, 13, 1, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F); // Box 0
		bodyModel[0].setRotationPoint(-118F, -31F, -35F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 72, 16, 1, 0F,0F, 0F, -8F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 8F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F); // Box 1
		bodyModel[1].setRotationPoint(-118F, -47F, -35F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 72, 3, 35, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[2].setRotationPoint(-118F, -18F, -35F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 19, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[3].setRotationPoint(-137F, -62F, -5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 72, 4, 9, 0F,0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[4].setRotationPoint(-118F, -62F, -18F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 22, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[5].setRotationPoint(-118F, -62F, -9F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 48, 7, 1, 0F,0F, 0F, -5F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 19
		bodyModel[6].setRotationPoint(-46F, -54F, -30F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 48, 16, 1, 0F,0F, 0F, -5F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 20
		bodyModel[7].setRotationPoint(-46F, -47F, -35F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 15, 16, 1, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 1F); // Box 21
		bodyModel[8].setRotationPoint(2F, -47F, -34F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 25, 10, 1, 0F,0F, 0F, -2.88F, 0F, 0F, -4.65F, 0F, 0F, 4.65F, 0F, 0F, 2.85F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 1F); // Box 22
		bodyModel[9].setRotationPoint(17F, -41F, -33F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 25, 16, 1, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -1F, 0F, -5F, -6F, 0F, -5F, 8F, 0F, 0F, 3F); // Box 23
		bodyModel[10].setRotationPoint(42F, -47F, -30F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 25, 6, 1, 0F,0F, 0F, -8F, 0F, 0F, -9F, 0F, 0F, 9F, 0F, 0F, 8F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F); // Box 27
		bodyModel[11].setRotationPoint(42F, -60F, -23F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 25, 7, 1, 0F,-16F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 5F, -16F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[12].setRotationPoint(42F, -54F, -28F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 15, 7, 1, 0F,0F, 0F, -0.9999F, -14.9999F, 0F, -0.9999F, -14.9999F, 0F, 0.9999F, 0F, 0F, 0.9999F, 0F, 0F, 0.9999F, 0F, 0F, 0.9999F, 0F, 0F, -0.9999F, 0F, 0F, -0.9999F); // Box 29
		bodyModel[13].setRotationPoint(2F, -54F, -28F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 11, 6, 1, 0F,0F, -5.9999F, 1.12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.9999F, -1.2F, 0F, 0F, 1.12F, 0F, 0F, 0.4F, 0F, 0F, -0.4F, 0F, 0F, -1.2F); // Box 30
		bodyModel[14].setRotationPoint(31F, -47F, -28F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 11, 6, 1, 0F,0F, 0F, 0.9999F, 0F, -5.9999F, 1.35F, 0F, -5.9999F, -1.4F, 0F, 0F, -0.9999F, 0F, 0F, 2.12F, 0F, 0F, 1.3F, 0F, 0F, -1.4F, 0F, 0F, -2.15F); // Box 31
		bodyModel[15].setRotationPoint(17F, -47F, -28F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 48, 5, 1, 0F,0F, -1F, -4F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, -1F, 4F, 0F, 0F, 2F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -2F); // Box 32
		bodyModel[16].setRotationPoint(-46F, -59F, -23F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 15, 5, 1, 0F,0F, 0F, -6.9999F, 0F, 0.9999F, -6.9999F, 0F, 0.9999F, 6.9999F, 0F, 0F, 6.9999F, 0F, 0F, 0F, -14.9999F, 0F, 0F, -14.9999F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[17].setRotationPoint(2F, -59F, -27F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 48, 4, 18, 0F,0F, 0F, -8F, 0F, 1F, -8F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, 2F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[18].setRotationPoint(-46F, -62F, -18F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 15, 3, 20, 0F,0F, 1F, -10F, 0F, 1F, -10F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[19].setRotationPoint(2F, -62F, -20F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 25, 3, 20, 0F,0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[20].setRotationPoint(17F, -63F, -20F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 25, 3, 15, 0F,0F, 0F, -5F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[21].setRotationPoint(42F, -63F, -15F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 48, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 39
		bodyModel[22].setRotationPoint(-46F, -31F, -35F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 15, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F); // Box 40
		bodyModel[23].setRotationPoint(2F, -31F, -33F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 25, 13, 1, 0F,0F, 0F, 0F, 0F, -3F, -8F, 0F, -3F, 8F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -11F, 0F, 0F, 11F, 0F, 0F, 2F); // Box 41
		bodyModel[24].setRotationPoint(17F, -31F, -32F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 48, 4, 35, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[25].setRotationPoint(-46F, -18F, -35F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 15, 1, 33, 0F,0F, 0F, 0F, 0F, 0F, -2.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9999F, -2.9999F, 0F, -0.9999F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[26].setRotationPoint(2F, -18F, -33F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 25, 9, 30, 0F,0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, -9F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[27].setRotationPoint(17F, -18F, -30F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 25, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, -2.9999F, 0F, 0F, 2.9999F, 0F, 0F, 0F, 0F, -2.9999F, 0F, 0F, 0F, -7.9999F, 0F, 0F, 7.9999F, 0F, -2.9999F, 0F); // Box 47
		bodyModel[28].setRotationPoint(17F, -31F, -32F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 25, 3, 1, 0F,0F, 0F, 0F, 0F, 5F, -5F, 0F, 5F, 5F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 3F, -27F, 0F, 3F, 27F, 0F, 0F, 5F); // Box 48
		bodyModel[29].setRotationPoint(42F, -31F, -29F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 25, 10, 1, 0F,0F, 0F, 0F, 0F, -3F, -22F, 0F, -3F, 22F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -23F, 0F, 0F, 23F, 0F, 0F, 3F); // Box 50
		bodyModel[30].setRotationPoint(42F, -28F, -24F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 25, 6, 21, 0F,0F, 0F, 0F, 0F, 0F, -19.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.9999F, 0F, 0F, -2.9999F, -19.9999F, 0F, -2.9999F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[31].setRotationPoint(42F, -18F, -21F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 72, 7, 1, 0F,0F, 0F, -10F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 10F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F); // Box 64
		bodyModel[32].setRotationPoint(-118F, -54F, -30F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 18, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[33].setRotationPoint(-155F, -62F, -5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 72, 4, 1, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 1F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, -1F); // Box 66
		bodyModel[34].setRotationPoint(-118F, -58F, -19F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 19, 4, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 2F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 2F, 1F); // Box 67
		bodyModel[35].setRotationPoint(-137F, -58F, -19F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 19, 5, 1, 0F,0F, 0F, -8F, 0F, 2F, -6F, 0F, 2F, 6F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2F); // Box 68
		bodyModel[36].setRotationPoint(-137F, -52F, -26F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 17, 5, 1, 0F,0F, -1F, -8F, 0F, 0F, -8F, 0F, 0F, 8F, 0F, -1F, 8F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 69
		bodyModel[37].setRotationPoint(-154F, -52F, -26F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 9, 4, 1, 0F,0F, 0F, -7F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 70
		bodyModel[38].setRotationPoint(-163F, -51F, -23F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 19, 16, 1, 0F,0F, 0F, -6F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[39].setRotationPoint(-137F, -47F, -32F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 17, 16, 1, 0F,0F, 0F, -8F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 8F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 72
		bodyModel[40].setRotationPoint(-154F, -47F, -32F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 9, 16, 1, 0F,0F, 0F, -7F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 7F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 73
		bodyModel[41].setRotationPoint(-163F, -47F, -30F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 15, 16, 1, 0F,0F, 0F, -9F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 9F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F); // Box 74
		bodyModel[42].setRotationPoint(-178F, -47F, -29F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 15, 4, 1, 0F,-7F, 3F, -12F, 0F, 0F, -4F, 0F, 0F, 4F, -7F, 3F, 12F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 75
		bodyModel[43].setRotationPoint(-178F, -51F, -20F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 7, 7, 13, 0F,0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -12F, 0F, 0F, -12F); // Box 76
		bodyModel[44].setRotationPoint(-178F, -54F, -20F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[45].setRotationPoint(-178F, -54F, -8F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[46].setRotationPoint(-137F, -62F, -10F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		bodyModel[47].setRotationPoint(-155F, -62F, -10F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 19, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[48].setRotationPoint(-137F, -62F, -9F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[49].setRotationPoint(-146F, -62F, -9F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		bodyModel[50].setRotationPoint(-155F, -62F, -9F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 19, 4, 1, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, -1F, 5F, 0F, -1F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		bodyModel[51].setRotationPoint(-137F, -62F, -16F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, -1F, 5F, 0F, -1F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[52].setRotationPoint(-146F, -62F, -16F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, -1F, 5F, 0F, -1F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[53].setRotationPoint(-155F, -62F, -16F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		bodyModel[54].setRotationPoint(-155F, -58F, -16F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 99
		bodyModel[55].setRotationPoint(-155F, -58F, -16F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 8F, 0F, 0F); // Box 100
		bodyModel[56].setRotationPoint(-155F, -58F, -16F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[57].setRotationPoint(-164F, -62F, -5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-3F, -1F, 0F, 3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 1F, 0F, 3F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[58].setRotationPoint(-164F, -62F, -10F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-6F, -3F, 0F, 6F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 3F, 0F, 6F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[59].setRotationPoint(-161F, -61F, -16F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F); // Box 104
		bodyModel[60].setRotationPoint(-164F, -62F, -5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F,0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F); // Box 105
		bodyModel[61].setRotationPoint(-171F, -62F, -1F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 19, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 108
		bodyModel[62].setRotationPoint(-137F, -31F, -32F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 17, 12, 1, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 2F); // Box 109
		bodyModel[63].setRotationPoint(-154F, -31F, -32F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 9, 9, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1F); // Box 110
		bodyModel[64].setRotationPoint(-163F, -31F, -30F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 15, 8, 1, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, -2F, -3F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 3F); // Box 111
		bodyModel[65].setRotationPoint(-178F, -31F, -29F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 19, 2, 32, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, -5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F); // Box 114
		bodyModel[66].setRotationPoint(-137F, -18F, -32F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 17, 5, 32, 0F,0F, 0F, -2F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, -7F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 115
		bodyModel[67].setRotationPoint(-154F, -22F, -32F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 9, 4, 30, 0F,0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, -6F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 116
		bodyModel[68].setRotationPoint(-163F, -24F, -30F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 15, 4, 29, 0F,0F, 0F, -3F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, -7F, 0F, -1F, -5F, 0F, -1F, 0F, 0F, -2F, 0F); // Box 117
		bodyModel[69].setRotationPoint(-178F, -25F, -29F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[70].setRotationPoint(16F, -59F, -34F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 131
		bodyModel[71].setRotationPoint(16F, -53F, -31F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 132
		bodyModel[72].setRotationPoint(16F, -65F, -31F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 133
		bodyModel[73].setRotationPoint(16F, -65F, -22F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134
		bodyModel[74].setRotationPoint(16F, -65F, -29F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[75].setRotationPoint(42F, -65F, -29F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, 7F); // Box 136
		bodyModel[76].setRotationPoint(42F, -65F, -22F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 137
		bodyModel[77].setRotationPoint(42F, -65F, -31F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[78].setRotationPoint(42F, -59F, -34F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 139
		bodyModel[79].setRotationPoint(42F, -53F, -31F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 25, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		bodyModel[80].setRotationPoint(17F, -56F, -34F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 25, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[81].setRotationPoint(17F, -65F, -26F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, 0F, 0F, -2F, -11F, 0F, -2F, 11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -11F, 0F, 2F, 11F, 0F, 0F, 0F); // Box 142
		bodyModel[82].setRotationPoint(43F, -56F, -34F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 9F, -8F, 0F, -2F, -11F, 0F, -2F, 11F, 0F, 9F, 8F, 0F, -9F, -8F, 0F, 2F, -11F, 0F, 2F, 11F, 0F, -9F, 8F); // Box 143
		bodyModel[83].setRotationPoint(43F, -56F, -34F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, -2F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 7F, 0F, 2F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 7F); // Box 144
		bodyModel[84].setRotationPoint(2F, -56F, -34F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, -2F, -7F, 0F, 9F, -8F, 0F, 9F, 8F, 0F, -2F, 7F, 0F, 2F, -7F, 0F, -9F, -8F, 0F, -9F, 8F, 0F, 2F, 7F); // Box 145
		bodyModel[85].setRotationPoint(2F, -56F, -34F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 23, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[86].setRotationPoint(-69F, -62F, -9F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 27, 17, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
		bodyModel[87].setRotationPoint(-96F, -79F, -10F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 27, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152
		bodyModel[88].setRotationPoint(-96F, -91F, -7F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 27, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[89].setRotationPoint(-96F, -91F, -6F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 40, 17, 10, 0F,0F, 0F, -3F, 0F, -4F, -7F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 18F, 0F, -7F, 18F, 0F, 0F, 0F, 0F, 0F); // Box 154
		bodyModel[90].setRotationPoint(-69F, -79F, -10F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 8, 17, 10, 0F,-6F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[91].setRotationPoint(-104F, -79F, -10F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 2, 12, 2, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[92].setRotationPoint(-98F, -91F, -7F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 2, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[93].setRotationPoint(-98F, -91F, -5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 40, 12, 7, 0F,0F, 0F, 0F, -3F, -5F, -4F, -3F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -4F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 158
		bodyModel[94].setRotationPoint(-69F, -91F, -7F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 15, 3, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 276
		bodyModel[95].setRotationPoint(2F, -31F, -32F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 25, 3, 15, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
		bodyModel[96].setRotationPoint(17F, -31F, -31F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 25, 3, 26, 0F,0F, 0F, -3F, 0F, 0F, -17F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -24F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
		bodyModel[97].setRotationPoint(42F, -31F, -31F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 40, 3, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F); // Box 279
		bodyModel[98].setRotationPoint(2F, -31F, -16F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 2, 10, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 280
		bodyModel[99].setRotationPoint(2F, -28F, -18F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 2, 10, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		bodyModel[100].setRotationPoint(12F, -28F, -7F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 282
		bodyModel[101].setRotationPoint(29F, -42F, -28F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 45, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[102].setRotationPoint(-45F, -29F, -34F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 45, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 284
		bodyModel[103].setRotationPoint(-45F, -47F, -30F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 285
		bodyModel[104].setRotationPoint(-45F, -27F, -19F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 286
		bodyModel[105].setRotationPoint(-1F, -27F, -19F);

		bodyModel[106].addShapeBox(0F, 1F, 0F, 10, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
		bodyModel[106].setRotationPoint(-155F, -40F, -14F);
		bodyModel[106].rotateAngleZ = -0.10471976F;

		bodyModel[107].addShapeBox(9F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		bodyModel[107].setRotationPoint(-155F, -40F, -14F);
		bodyModel[107].rotateAngleZ = -0.10471976F;

		bodyModel[108].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		bodyModel[108].setRotationPoint(-155F, -40F, -14F);
		bodyModel[108].rotateAngleZ = -0.10471976F;

		bodyModel[109].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		bodyModel[109].setRotationPoint(-155F, -40F, -5F);
		bodyModel[109].rotateAngleZ = -0.10471976F;

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		bodyModel[110].setRotationPoint(-155F, -40F, -14F);
		bodyModel[110].rotateAngleZ = -0.10471976F;

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 13, 10, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		bodyModel[111].setRotationPoint(-146F, -52F, -14F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[112].setRotationPoint(-144F, -56F, -12F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 13, 8, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 246
		bodyModel[113].setRotationPoint(-147F, -51F, -13F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[114].setRotationPoint(-147.3F, -51.3F, -11F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[115].setRotationPoint(-147.3F, -51.3F, -8F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[116].setRotationPoint(-146F, -49F, -13F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 251
		bodyModel[117].setRotationPoint(-146F, -49F, -6F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[118].setRotationPoint(-152F, -39F, -15F);
		bodyModel[118].rotateAngleZ = 0.78539816F;

		bodyModel[119].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 253
		bodyModel[119].setRotationPoint(-152F, -39F, -4F);
		bodyModel[119].rotateAngleZ = 0.78539816F;

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 962
		bodyModel[120].setRotationPoint(-144.5F, -55.5F, -10.5F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 964
		bodyModel[121].setRotationPoint(-144.5F, -54.5F, -10.5F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 966
		bodyModel[122].setRotationPoint(-144.5F, -53.5F, -10.5F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 782
		bodyModel[123].setRotationPoint(-151F, -38F, -13F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 783
		bodyModel[124].setRotationPoint(-151F, -38F, -6F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 72, 13, 1, 0F,0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 316
		bodyModel[125].setRotationPoint(-118F, -31F, 34F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 72, 16, 1, 0F,0F, 0F, 8F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, -8F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 317
		bodyModel[126].setRotationPoint(-118F, -47F, 34F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 72, 3, 35, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -3F); // Box 318
		bodyModel[127].setRotationPoint(-118F, -18F, 0F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 19, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 320
		bodyModel[128].setRotationPoint(-137F, -62F, 0F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 72, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F); // Box 321
		bodyModel[129].setRotationPoint(-118F, -62F, 9F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 22, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 322
		bodyModel[130].setRotationPoint(-118F, -62F, 0F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 48, 7, 1, 0F,0F, 0F, 5F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 323
		bodyModel[131].setRotationPoint(-46F, -54F, 29F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 48, 16, 1, 0F,0F, 0F, 5F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 324
		bodyModel[132].setRotationPoint(-46F, -47F, 34F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 15, 16, 1, 0F,0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -1F); // Box 325
		bodyModel[133].setRotationPoint(2F, -47F, 33F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 25, 10, 1, 0F,0F, 0F, 2.85F, 0F, 0F, 4.65F, 0F, 0F, -4.65F, 0F, 0F, -2.88F, 0F, 0F, 1F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -1F); // Box 326
		bodyModel[134].setRotationPoint(17F, -41F, 32F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 25, 16, 1, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, -5F, 6F, 0F, -5F, -6F, 0F, 0F, -1F); // Box 327
		bodyModel[135].setRotationPoint(42F, -47F, 29F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 25, 6, 1, 0F,0F, 0F, 8F, 0F, 0F, 9F, 0F, 0F, -9F, 0F, 0F, -8F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F); // Box 328
		bodyModel[136].setRotationPoint(42F, -60F, 22F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 25, 7, 1, 0F,-16F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, -16F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 329
		bodyModel[137].setRotationPoint(42F, -54F, 27F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 15, 7, 1, 0F,0F, 0F, 0.9999F, -14.9999F, 0F, 0.9999F, -14.9999F, 0F, -0.9999F, 0F, 0F, -0.9999F, 0F, 0F, -0.9999F, 0F, 0F, -0.9999F, 0F, 0F, 0.9999F, 0F, 0F, 0.9999F); // Box 330
		bodyModel[138].setRotationPoint(2F, -54F, 27F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 11, 6, 1, 0F,0F, -5.9999F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.9999F, 1.12F, 0F, 0F, -1.2F, 0F, 0F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, 1.12F); // Box 331
		bodyModel[139].setRotationPoint(31F, -47F, 27F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 11, 6, 1, 0F,0F, 0F, -0.9999F, 0F, -5.9999F, -1.4F, 0F, -5.9999F, 1.35F, 0F, 0F, 0.9999F, 0F, 0F, -2.15F, 0F, 0F, -1.4F, 0F, 0F, 1.3F, 0F, 0F, 2.12F); // Box 332
		bodyModel[140].setRotationPoint(17F, -47F, 27F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 48, 5, 1, 0F,0F, -1F, 4F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, -1F, -4F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 2F); // Box 333
		bodyModel[141].setRotationPoint(-46F, -59F, 22F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 15, 5, 1, 0F,0F, 0F, 6.9999F, 0F, 0.9999F, 6.9999F, 0F, 0.9999F, -6.9999F, 0F, 0F, -6.9999F, 0F, 0F, 0F, -14.9999F, 0F, 0F, -14.9999F, 0F, 0F, 0F, 0F, 0F); // Box 334
		bodyModel[142].setRotationPoint(2F, -59F, 26F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 48, 4, 18, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 2F, 0F, 0F, 1F); // Box 335
		bodyModel[143].setRotationPoint(-46F, -62F, 0F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 15, 3, 20, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, -10F, 0F, 1F, -10F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 336
		bodyModel[144].setRotationPoint(2F, -62F, 0F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 25, 3, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 337
		bodyModel[145].setRotationPoint(17F, -63F, 0F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 25, 3, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 338
		bodyModel[146].setRotationPoint(42F, -63F, 0F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 48, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 339
		bodyModel[147].setRotationPoint(-46F, -31F, 34F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 15, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 340
		bodyModel[148].setRotationPoint(2F, -31F, 32F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 25, 13, 1, 0F,0F, 0F, 0F, 0F, -3F, 8F, 0F, -3F, -8F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 11F, 0F, 0F, -11F, 0F, 0F, -2F); // Box 341
		bodyModel[149].setRotationPoint(17F, -31F, 31F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 48, 4, 35, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -2F, 0F, 0F, 0F); // Box 342
		bodyModel[150].setRotationPoint(-46F, -18F, 0F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 15, 1, 33, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9999F, 0F, 0F, -0.9999F, -2.9999F, 0F, 0F, 0F); // Box 343
		bodyModel[151].setRotationPoint(2F, -18F, 0F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 25, 9, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -9F, -9F, 0F, -9F, 0F); // Box 346
		bodyModel[152].setRotationPoint(17F, -18F, 0F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 25, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 2.9999F, 0F, 0F, -2.9999F, 0F, 0F, 0F, 0F, -2.9999F, 0F, 0F, 0F, 7.9999F, 0F, 0F, -7.9999F, 0F, -2.9999F, 0F); // Box 347
		bodyModel[153].setRotationPoint(17F, -31F, 31F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 25, 3, 1, 0F,0F, 0F, 0F, 0F, 5F, 5F, 0F, 5F, -5F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 3F, 27F, 0F, 3F, -27F, 0F, 0F, -5F); // Box 348
		bodyModel[154].setRotationPoint(42F, -31F, 28F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 25, 10, 1, 0F,0F, 0F, 0F, 0F, -3F, 22F, 0F, -3F, -22F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 23F, 0F, 0F, -23F, 0F, 0F, -3F); // Box 349
		bodyModel[155].setRotationPoint(42F, -28F, 23F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 25, 6, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -19.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.9999F, 0F, 0F, -2.9999F, -19.9999F, 0F, -5.9999F, 0F); // Box 350
		bodyModel[156].setRotationPoint(42F, -18F, 0F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 72, 7, 1, 0F,0F, 0F, 10F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, -10F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 357
		bodyModel[157].setRotationPoint(-118F, -54F, 29F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 72, 4, 1, 0F,0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 6F, 0F, 0F, 1F); // Box 359
		bodyModel[158].setRotationPoint(-118F, -58F, 18F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 19, 4, 1, 0F,0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 2F, 2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 2F, -1F); // Box 360
		bodyModel[159].setRotationPoint(-137F, -58F, 18F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 19, 5, 1, 0F,0F, 0F, 8F, 0F, 2F, 6F, 0F, 2F, -6F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 361
		bodyModel[160].setRotationPoint(-137F, -52F, 25F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 17, 5, 1, 0F,0F, -1F, 8F, 0F, 0F, 8F, 0F, 0F, -8F, 0F, -1F, -8F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 362
		bodyModel[161].setRotationPoint(-154F, -52F, 25F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 9, 4, 1, 0F,0F, 0F, 7F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 363
		bodyModel[162].setRotationPoint(-163F, -51F, 22F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 19, 16, 1, 0F,0F, 0F, 6F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364
		bodyModel[163].setRotationPoint(-137F, -47F, 31F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 17, 16, 1, 0F,0F, 0F, 8F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, -8F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 365
		bodyModel[164].setRotationPoint(-154F, -47F, 31F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 9, 16, 1, 0F,0F, 0F, 7F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, -7F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 366
		bodyModel[165].setRotationPoint(-163F, -47F, 29F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 15, 16, 1, 0F,0F, 0F, 9F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, -9F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 367
		bodyModel[166].setRotationPoint(-178F, -47F, 28F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 15, 4, 1, 0F,-7F, 3F, 12F, 0F, 0F, 4F, 0F, 0F, -4F, -7F, 3F, -12F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F); // Box 368
		bodyModel[167].setRotationPoint(-178F, -51F, 19F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 7, 7, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, -7F, 0F, -12F, -7F, 0F, 0F, 0F, 0F, 0F); // Box 369
		bodyModel[168].setRotationPoint(-178F, -54F, 7F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 378
		bodyModel[169].setRotationPoint(-178F, -54F, 0F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 381
		bodyModel[170].setRotationPoint(-137F, -62F, 9F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 382
		bodyModel[171].setRotationPoint(-155F, -62F, 9F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 19, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 383
		bodyModel[172].setRotationPoint(-137F, -62F, 5F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 384
		bodyModel[173].setRotationPoint(-146F, -62F, 5F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 385
		bodyModel[174].setRotationPoint(-155F, -62F, 5F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 19, 4, 1, 0F,0F, -1F, 5F, 0F, -1F, 5F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 387
		bodyModel[175].setRotationPoint(-137F, -62F, 15F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -1F, 5F, 0F, -1F, 5F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 389
		bodyModel[176].setRotationPoint(-146F, -62F, 15F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -1F, 5F, 0F, -1F, 5F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 390
		bodyModel[177].setRotationPoint(-155F, -62F, 15F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 391
		bodyModel[178].setRotationPoint(-155F, -58F, 15F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 392
		bodyModel[179].setRotationPoint(-155F, -58F, 15F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 8F, 0F, 0F); // Box 393
		bodyModel[180].setRotationPoint(-155F, -58F, 15F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[181].setRotationPoint(-164F, -62F, 0F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 3F, -1F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 1F, 0F, -3F, 1F, 0F); // Box 395
		bodyModel[182].setRotationPoint(-164F, -62F, 5F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 6F, -3F, 0F, -6F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 3F, 0F, -6F, 3F, 0F); // Box 396
		bodyModel[183].setRotationPoint(-161F, -61F, 10F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 397
		bodyModel[184].setRotationPoint(-164F, -62F, 4F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 19, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 401
		bodyModel[185].setRotationPoint(-137F, -31F, 31F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 17, 12, 1, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F); // Box 402
		bodyModel[186].setRotationPoint(-154F, -31F, 31F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 9, 9, 1, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F); // Box 403
		bodyModel[187].setRotationPoint(-163F, -31F, 29F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 15, 8, 1, 0F,0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, 3F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, -3F); // Box 404
		bodyModel[188].setRotationPoint(-178F, -31F, 28F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 19, 2, 32, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, -5F); // Box 407
		bodyModel[189].setRotationPoint(-137F, -18F, 0F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 17, 5, 32, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -2F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -3F, -7F); // Box 408
		bodyModel[190].setRotationPoint(-154F, -22F, 0F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 9, 4, 30, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -2F, -6F); // Box 409
		bodyModel[191].setRotationPoint(-163F, -24F, 0F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 15, 4, 29, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -3F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, -5F, 0F, -2F, -7F); // Box 410
		bodyModel[192].setRotationPoint(-178F, -25F, 0F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 422
		bodyModel[193].setRotationPoint(16F, -59F, 33F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 423
		bodyModel[194].setRotationPoint(16F, -53F, 30F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 424
		bodyModel[195].setRotationPoint(16F, -65F, 30F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 425
		bodyModel[196].setRotationPoint(16F, -65F, 21F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 426
		bodyModel[197].setRotationPoint(16F, -65F, 23F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 427
		bodyModel[198].setRotationPoint(42F, -65F, 23F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, -7F); // Box 428
		bodyModel[199].setRotationPoint(42F, -65F, 21F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 429
		bodyModel[200].setRotationPoint(42F, -65F, 30F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 430
		bodyModel[201].setRotationPoint(42F, -59F, 33F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 431
		bodyModel[202].setRotationPoint(42F, -53F, 30F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 25, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 432
		bodyModel[203].setRotationPoint(17F, -56F, 33F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 25, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 433
		bodyModel[204].setRotationPoint(17F, -65F, 25F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, 0F, 0F, -2F, 11F, 0F, -2F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 11F, 0F, 2F, -11F, 0F, 0F, 0F); // Box 434
		bodyModel[205].setRotationPoint(43F, -56F, 33F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 9F, 8F, 0F, -2F, 11F, 0F, -2F, -11F, 0F, 9F, -8F, 0F, -9F, 8F, 0F, 2F, 11F, 0F, 2F, -11F, 0F, -9F, -8F); // Box 435
		bodyModel[206].setRotationPoint(43F, -56F, 33F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, -2F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -7F, 0F, 2F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -7F); // Box 436
		bodyModel[207].setRotationPoint(2F, -56F, 33F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, -2F, 7F, 0F, 9F, 8F, 0F, 9F, -8F, 0F, -2F, -7F, 0F, 2F, 7F, 0F, -9F, 8F, 0F, -9F, -8F, 0F, 2F, -7F); // Box 437
		bodyModel[208].setRotationPoint(2F, -56F, 33F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 23, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 442
		bodyModel[209].setRotationPoint(-69F, -62F, 0F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 27, 17, 1, 0F,0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 443
		bodyModel[210].setRotationPoint(-96F, -79F, 9F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 27, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 445
		bodyModel[211].setRotationPoint(-96F, -91F, 0F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 40, 17, 10, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, -7F, 0F, 0F, -3F, 0F, 0F, 0F, 18F, 0F, 0F, 18F, 0F, -7F, 0F, 0F, 0F); // Box 446
		bodyModel[212].setRotationPoint(-69F, -79F, 0F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 8, 17, 10, 0F,-6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -6F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 447
		bodyModel[213].setRotationPoint(-104F, -79F, 0F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 2, 12, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 448
		bodyModel[214].setRotationPoint(-98F, -91F, 5F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 2, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 449
		bodyModel[215].setRotationPoint(-98F, -91F, 0F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 40, 12, 7, 0F,0F, 0F, 0F, -3F, -5F, 0F, -3F, -5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, -4F, 0F, 0F, 0F); // Box 450
		bodyModel[216].setRotationPoint(-69F, -91F, 0F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 15, 3, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 566
		bodyModel[217].setRotationPoint(2F, -31F, 16F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 25, 3, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F); // Box 567
		bodyModel[218].setRotationPoint(17F, -31F, 16F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 25, 3, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -17F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -24F, 0F, 0F, -8F); // Box 568
		bodyModel[219].setRotationPoint(42F, -31F, 5F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 40, 3, 11, 0F,-10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 569
		bodyModel[220].setRotationPoint(2F, -31F, 5F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 2, 10, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 570
		bodyModel[221].setRotationPoint(2F, -28F, 16F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 2, 10, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 571
		bodyModel[222].setRotationPoint(12F, -28F, 5F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 572
		bodyModel[223].setRotationPoint(29F, -42F, 27F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 45, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 573
		bodyModel[224].setRotationPoint(-45F, -29F, 18F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 45, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 574
		bodyModel[225].setRotationPoint(-45F, -47F, 14F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 575
		bodyModel[226].setRotationPoint(-45F, -27F, 18F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 576
		bodyModel[227].setRotationPoint(-1F, -27F, 18F);

		bodyModel[228].addShapeBox(0F, 1F, 0F, 10, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 585
		bodyModel[228].setRotationPoint(-155F, -40F, 4F);
		bodyModel[228].rotateAngleZ = -0.10471976F;

		bodyModel[229].addShapeBox(9F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 586
		bodyModel[229].setRotationPoint(-155F, -40F, 4F);
		bodyModel[229].rotateAngleZ = -0.10471976F;

		bodyModel[230].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 587
		bodyModel[230].setRotationPoint(-155F, -40F, 13F);
		bodyModel[230].rotateAngleZ = -0.10471976F;

		bodyModel[231].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 588
		bodyModel[231].setRotationPoint(-155F, -40F, 4F);
		bodyModel[231].rotateAngleZ = -0.10471976F;

		bodyModel[232].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 589
		bodyModel[232].setRotationPoint(-155F, -40F, 4F);
		bodyModel[232].rotateAngleZ = -0.10471976F;

		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 13, 10, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 590
		bodyModel[233].setRotationPoint(-146F, -52F, 4F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 591
		bodyModel[234].setRotationPoint(-144F, -56F, 6F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 1, 13, 8, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 592
		bodyModel[235].setRotationPoint(-147F, -51F, 5F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 593
		bodyModel[236].setRotationPoint(-147.3F, -51.3F, 10F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 594
		bodyModel[237].setRotationPoint(-147.3F, -51.3F, 7F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 595
		bodyModel[238].setRotationPoint(-146F, -49F, 12F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 596
		bodyModel[239].setRotationPoint(-146F, -49F, 5F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 597
		bodyModel[240].setRotationPoint(-152F, -39F, 14F);
		bodyModel[240].rotateAngleZ = 0.78539816F;

		bodyModel[241].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 598
		bodyModel[241].setRotationPoint(-152F, -39F, 3F);
		bodyModel[241].rotateAngleZ = 0.78539816F;

		bodyModel[242].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 599
		bodyModel[242].setRotationPoint(-144.5F, -55.5F, 7.5F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 600
		bodyModel[243].setRotationPoint(-144.5F, -54.5F, 7.5F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 601
		bodyModel[244].setRotationPoint(-144.5F, -53.5F, 7.5F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 602
		bodyModel[245].setRotationPoint(-151F, -38F, 12F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 603
		bodyModel[246].setRotationPoint(-151F, -38F, 5F);

		bodyModel[247].addShapeBox(0F, 1F, 0F, 10, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 623
		bodyModel[247].setRotationPoint(-86F, -66F, -5F);
		bodyModel[247].rotateAngleZ = -0.10471976F;

		bodyModel[248].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 624
		bodyModel[248].setRotationPoint(-86F, -66F, -5F);
		bodyModel[248].rotateAngleZ = -0.10471976F;

		bodyModel[249].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 625
		bodyModel[249].setRotationPoint(-86F, -66F, 4F);
		bodyModel[249].rotateAngleZ = -0.10471976F;

		bodyModel[250].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 626
		bodyModel[250].setRotationPoint(-86F, -66F, -5F);
		bodyModel[250].rotateAngleZ = -0.10471976F;

		bodyModel[251].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 627
		bodyModel[251].setRotationPoint(-83F, -65F, -6F);
		bodyModel[251].rotateAngleZ = 0.78539816F;

		bodyModel[252].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 628
		bodyModel[252].setRotationPoint(-83F, -65F, 5F);
		bodyModel[252].rotateAngleZ = 0.78539816F;

		bodyModel[253].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 629
		bodyModel[253].setRotationPoint(-78.3F, -77.3F, 1F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 630
		bodyModel[254].setRotationPoint(-78.3F, -77.3F, -2F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 1, 13, 8, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 631
		bodyModel[255].setRotationPoint(-78F, -77F, -4F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 1, 13, 10, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 632
		bodyModel[256].setRotationPoint(-77F, -78F, -5F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 633
		bodyModel[257].setRotationPoint(-75F, -82F, -3F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 634
		bodyModel[258].setRotationPoint(-75.5F, -81.5F, -1.5F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 635
		bodyModel[259].setRotationPoint(-75.5F, -80.5F, -1.5F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 636
		bodyModel[260].setRotationPoint(-75.5F, -79.5F, -1.5F);

		bodyModel[261].addShapeBox(9F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 637
		bodyModel[261].setRotationPoint(-86F, -66F, -5F);
		bodyModel[261].rotateAngleZ = -0.10471976F;

		bodyModel[262].addShapeBox(0F, 0F, 0F, 1, 10, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 675
		bodyModel[262].setRotationPoint(-117F, -28F, -27F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 11, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 676
		bodyModel[263].setRotationPoint(-117F, -28F, -27.5F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 11, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 677
		bodyModel[264].setRotationPoint(-117F, -28F, -14.5F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 11, 1, 15, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 678
		bodyModel[265].setRotationPoint(-117F, -29F, -28.5F);

		bodyModel[266].addShapeBox(0F, 1F, 0F, 10, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
		bodyModel[266].setRotationPoint(-95F, -26F, -26F);
		bodyModel[266].rotateAngleZ = -0.10471976F;

		bodyModel[267].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		bodyModel[267].setRotationPoint(-95F, -26F, -26F);
		bodyModel[267].rotateAngleZ = -0.10471976F;

		bodyModel[268].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		bodyModel[268].setRotationPoint(-95F, -26F, -17F);
		bodyModel[268].rotateAngleZ = -0.10471976F;

		bodyModel[269].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		bodyModel[269].setRotationPoint(-95F, -26F, -26F);
		bodyModel[269].rotateAngleZ = -0.10471976F;

		bodyModel[270].addShapeBox(0F, 0F, 0F, 1, 13, 10, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		bodyModel[270].setRotationPoint(-86F, -38F, -26F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 1, 13, 8, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 246
		bodyModel[271].setRotationPoint(-87F, -37F, -25F);

		bodyModel[272].addShapeBox(9F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 690
		bodyModel[272].setRotationPoint(-95F, -26F, -26F);
		bodyModel[272].rotateAngleZ = -0.10471976F;

		bodyModel[273].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 691
		bodyModel[273].setRotationPoint(-91F, -24F, -22F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[274].setRotationPoint(-108.5F, -33.5F, -22.75F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 2
		bodyModel[275].setRotationPoint(-108.5F, -34.5F, -21.75F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[276].setRotationPoint(-108.5F, -33.5F, -14.75F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[277].setRotationPoint(-108.5F, -30.5F, -21.75F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 8, 6, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[278].setRotationPoint(-116F, -35F, -23.25F);

		bodyModel[279].addShapeBox(0.5F, 0F, 0F, 5, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[279].setRotationPoint(-114F, -33F, -28.75F);
		bodyModel[279].rotateAngleY = 0.05235988F;

		bodyModel[280].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[280].setRotationPoint(-113.5F, -36F, -27.75F);
		bodyModel[280].rotateAngleY = -0.05235988F;

		bodyModel[281].addShapeBox(0F, 0F, 0F, 6, 3, 9, 0F,0.3F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.3F, -0.25F, 0F, 0.3F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.3F, -0.25F, 0F); // Box 8
		bodyModel[281].setRotationPoint(-115F, -38F, -22.75F);
		bodyModel[281].rotateAngleY = -0.06981317F;
		bodyModel[281].rotateAngleZ = 0.05235988F;

		bodyModel[282].addShapeBox(4.5F, 0F, 0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[282].setRotationPoint(-115F, -35.5F, -22.75F);
		bodyModel[282].rotateAngleY = -0.06981317F;

		bodyModel[283].addShapeBox(4.5F, 0F, 7.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[283].setRotationPoint(-115F, -35.5F, -22.75F);
		bodyModel[283].rotateAngleY = -0.06981317F;

		bodyModel[284].addShapeBox(0.5F, 0F, 7.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[284].setRotationPoint(-115F, -35.5F, -22.75F);
		bodyModel[284].rotateAngleY = -0.06981317F;

		bodyModel[285].addShapeBox(5.2F, 0.5F, 0.8F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[285].setRotationPoint(-115F, -37F, -22.75F);
		bodyModel[285].rotateAngleY = -0.06981317F;
		bodyModel[285].rotateAngleZ = 0.05235988F;

		bodyModel[286].addShapeBox(5.2F, 0.5F, 3.3F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[286].setRotationPoint(-115F, -37F, -22.75F);
		bodyModel[286].rotateAngleY = -0.06981317F;
		bodyModel[286].rotateAngleZ = 0.05235988F;

		bodyModel[287].addShapeBox(5.25F, 0.5F, 5.7F, 1, 1, 1, 0F,0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F); // Box 15
		bodyModel[287].setRotationPoint(-115F, -38F, -22.75F);
		bodyModel[287].rotateAngleY = -0.06981317F;
		bodyModel[287].rotateAngleZ = 0.05235988F;

		bodyModel[288].addShapeBox(5.25F, 1.5F, 5.7F, 1, 1, 1, 0F,0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F); // Box 16
		bodyModel[288].setRotationPoint(-115F, -38F, -22.75F);
		bodyModel[288].rotateAngleY = -0.06981317F;
		bodyModel[288].rotateAngleZ = 0.05235988F;

		bodyModel[289].addShapeBox(5.25F, 1.5F, 7F, 1, 1, 1, 0F,0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F); // Box 17
		bodyModel[289].setRotationPoint(-115F, -38F, -22.75F);
		bodyModel[289].rotateAngleY = -0.06981317F;
		bodyModel[289].rotateAngleZ = 0.05235988F;

		bodyModel[290].addShapeBox(5.25F, 0.5F, 7F, 1, 1, 1, 0F,0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F); // Box 18
		bodyModel[290].setRotationPoint(-115F, -38F, -22.75F);
		bodyModel[290].rotateAngleY = -0.06981317F;
		bodyModel[290].rotateAngleZ = 0.05235988F;

		bodyModel[291].addShapeBox(5.2F, 0.5F, 3.3F, 1, 1, 2, 0F,0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[291].setRotationPoint(-115F, -38F, -22.75F);
		bodyModel[291].rotateAngleY = -0.06981317F;
		bodyModel[291].rotateAngleZ = 0.05235988F;

		bodyModel[292].addShapeBox(5.2F, 0.5F, 0.8F, 1, 1, 2, 0F,0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[292].setRotationPoint(-115F, -38F, -22.75F);
		bodyModel[292].rotateAngleY = -0.06981317F;
		bodyModel[292].rotateAngleZ = 0.05235988F;

		bodyModel[293].addShapeBox(5.2F, 1F, 0.8F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[293].setRotationPoint(-114F, -33F, -22F);

		bodyModel[294].addShapeBox(5.2F, 1F, 0.8F, 1, 1, 2, 0F,0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[294].setRotationPoint(-114F, -34F, -22F);

		bodyModel[295].addShapeBox(5.2F, 1F, 0.8F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[295].setRotationPoint(-114F, -33F, -19.5F);

		bodyModel[296].addShapeBox(5.2F, 1F, 0.8F, 1, 1, 2, 0F,0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[296].setRotationPoint(-114F, -34F, -19.5F);

		bodyModel[297].addShapeBox(5.25F, 1.5F, 7F, 1, 1, 1, 0F,0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F); // Box 25
		bodyModel[297].setRotationPoint(-114F, -34.5F, -23F);

		bodyModel[298].addShapeBox(5.25F, 1.5F, 7F, 1, 1, 1, 0F,0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F); // Box 27
		bodyModel[298].setRotationPoint(-114F, -33.5F, -23F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[299].setRotationPoint(-113.5F, -37F, -27.75F);
		bodyModel[299].rotateAngleY = -0.05235988F;

		bodyModel[300].addShapeBox(1F, 0F, 1F, 1, 14, 1, 0F,-0.37F, 0F, -0.37F, -0.37F, 0F, -0.37F, -0.37F, 0F, -0.37F, -0.37F, 0F, -0.37F, -0.37F, 0F, -0.37F, -0.37F, 0F, -0.37F, -0.37F, 0F, -0.37F, -0.37F, 0F, -0.37F); // Box 29
		bodyModel[300].setRotationPoint(-115.5F, -51F, -23F);
		bodyModel[300].rotateAngleY = -0.08726646F;
		bodyModel[300].rotateAngleZ = 0.03490659F;

		bodyModel[301].addShapeBox(5.3F, -1.3F, 1.25F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 30
		bodyModel[301].setRotationPoint(-115F, -35.5F, -22.75F);
		bodyModel[301].rotateAngleY = -0.06981317F;

		bodyModel[302].addShapeBox(5.3F, -0.3F, 3.8F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 31
		bodyModel[302].setRotationPoint(-115F, -35.5F, -22.75F);
		bodyModel[302].rotateAngleX = 0.2443461F;
		bodyModel[302].rotateAngleY = -0.06981317F;

		bodyModel[303].addShapeBox(0F, 0F, -0.3F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 32
		bodyModel[303].setRotationPoint(-108.7F, -31.9F, -20.75F);
		bodyModel[303].rotateAngleX = 0.50614548F;

		bodyModel[304].addShapeBox(0F, 0F, -0.3F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 33
		bodyModel[304].setRotationPoint(-108.7F, -32F, -17.4F);
		bodyModel[304].rotateAngleX = -0.50614548F;

		bodyModel[305].addShapeBox(0F, 0F, 0F, 9, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 692
		bodyModel[305].setRotationPoint(-96F, -85F, -7F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 9, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 693
		bodyModel[306].setRotationPoint(-78F, -85F, -7F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 27, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 694
		bodyModel[307].setRotationPoint(-96F, -91F, 6F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 9, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 695
		bodyModel[308].setRotationPoint(-96F, -85F, 6F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 9, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 696
		bodyModel[309].setRotationPoint(-78F, -85F, 6F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 697
		bodyModel[310].setRotationPoint(-94F, -84F, 5F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 8, 2, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 698
		bodyModel[311].setRotationPoint(-96F, -78F, -7F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 2, 11, 2, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 263
		bodyModel[312].setRotationPoint(-156.5F, -45.25F, -10F);
		bodyModel[312].rotateAngleZ = -1.13446401F;

		bodyModel[313].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 264
		bodyModel[313].setRotationPoint(-155F, -48F, -9.5F);
		bodyModel[313].rotateAngleZ = -0.43633231F;

		bodyModel[314].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 786
		bodyModel[314].setRotationPoint(-155F, -47.75F, -8.5F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 789
		bodyModel[315].setRotationPoint(-155F, -47.75F, -12.5F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 791
		bodyModel[316].setRotationPoint(-155F, -50.75F, -12.5F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 792
		bodyModel[317].setRotationPoint(-155F, -50.75F, -6.5F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 774
		bodyModel[318].setRotationPoint(-154F, -69F, -0.5F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 775
		bodyModel[319].setRotationPoint(-155F, -69F, -2F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-2F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 776
		bodyModel[320].setRotationPoint(-155F, -69F, -4F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, -3F, 0F, 0F, -1F, 1F, 0F, 0F, -1F, 0F, 2F, 0F, 0F, -3F, 0F, 0F, -1F, 1F, 0F, 0F, -1F, 0F, 2F); // Box 777
		bodyModel[321].setRotationPoint(-153F, -69F, -7F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 778
		bodyModel[322].setRotationPoint(-149F, -69F, -6F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 779
		bodyModel[323].setRotationPoint(-155F, -69F, 0F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, 0F); // Box 780
		bodyModel[324].setRotationPoint(-155F, -69F, 2F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,-1F, 0F, 2F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, -1F, 0F, 2F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F); // Box 781
		bodyModel[325].setRotationPoint(-153F, -69F, 5F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 782
		bodyModel[326].setRotationPoint(-149F, -69F, 5F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 2, 11, 2, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 737
		bodyModel[327].setRotationPoint(-156.5F, -45.25F, 8F);
		bodyModel[327].rotateAngleZ = -1.13446401F;

		bodyModel[328].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 738
		bodyModel[328].setRotationPoint(-155F, -48F, 8.5F);
		bodyModel[328].rotateAngleZ = -0.43633231F;

		bodyModel[329].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 739
		bodyModel[329].setRotationPoint(-155F, -47.75F, 5.5F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 740
		bodyModel[330].setRotationPoint(-155F, -47.75F, 9.5F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 741
		bodyModel[331].setRotationPoint(-155F, -50.75F, 11.5F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 742
		bodyModel[332].setRotationPoint(-155F, -50.75F, 5.5F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 18, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 743
		bodyModel[333].setRotationPoint(-155F, -61F, -4F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 9, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 744
		bodyModel[334].setRotationPoint(-153F, -60F, -3F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 745
		bodyModel[335].setRotationPoint(-153F, -59F, -3F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 746
		bodyModel[336].setRotationPoint(-153F, -59F, -1F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 747
		bodyModel[337].setRotationPoint(-151F, -59F, -2F);
		bodyModel[337].rotateAngleZ = 0.34906585F;

		bodyModel[338].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 748
		bodyModel[338].setRotationPoint(-150F, -57F, -3F);

		bodyModel[339].addShapeBox(-7F, -4F, -4F, 12, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		bodyModel[339].setRotationPoint(29F, -31F, -18F);
		bodyModel[339].rotateAngleY = 1.57079633F;
		bodyModel[339].rotateAngleZ = -0.01745329F;

		bodyModel[340].addShapeBox(-7F, -6F, -5F, 10, 3, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		bodyModel[340].setRotationPoint(29F, -31F, -18F);
		bodyModel[340].rotateAngleY = 1.57079633F;

		bodyModel[341].addShapeBox(3F, -6F, -5F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		bodyModel[341].setRotationPoint(29F, -31F, -18F);
		bodyModel[341].rotateAngleY = 1.57079633F;

		bodyModel[342].addShapeBox(5F, -6F, -4F, 2, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		bodyModel[342].setRotationPoint(29F, -31F, -18F);
		bodyModel[342].rotateAngleY = 1.57079633F;

		bodyModel[343].addShapeBox(5F, -19F, -5F, 2, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[343].setRotationPoint(29F, -31F, -18F);
		bodyModel[343].rotateAngleY = 1.57079633F;

		bodyModel[344].addShapeBox(-4F, -9F, -5F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[344].setRotationPoint(29F, -31F, -18F);
		bodyModel[344].rotateAngleY = 1.57079633F;

		bodyModel[345].addShapeBox(-5F, -10F, -5.5F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[345].setRotationPoint(29F, -31F, -18F);
		bodyModel[345].rotateAngleY = 1.57079633F;

		bodyModel[346].addShapeBox(-7F, -6F, 4F, 10, 3, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[346].setRotationPoint(29F, -31F, -18F);
		bodyModel[346].rotateAngleY = 1.57079633F;

		bodyModel[347].addShapeBox(-4F, -9F, 4F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[347].setRotationPoint(29F, -31F, -18F);
		bodyModel[347].rotateAngleY = 1.57079633F;

		bodyModel[348].addShapeBox(-5F, -10F, 3.5F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[348].setRotationPoint(29F, -31F, -18F);
		bodyModel[348].rotateAngleY = 1.57079633F;

		bodyModel[349].addShapeBox(3F, -6F, 4F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[349].setRotationPoint(29F, -31F, -18F);
		bodyModel[349].rotateAngleY = 1.57079633F;

		bodyModel[350].addShapeBox(-7F, -5F, -4F, 12, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[350].setRotationPoint(29F, -31F, -18F);
		bodyModel[350].rotateAngleY = 1.57079633F;

		bodyModel[351].addShapeBox(-3F, -5.5F, -4F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[351].setRotationPoint(29F, -31F, -18F);
		bodyModel[351].rotateAngleY = 1.57079633F;

		bodyModel[352].addShapeBox(-3F, -5.5F, 2F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[352].setRotationPoint(29F, -31F, -18F);
		bodyModel[352].rotateAngleY = 1.57079633F;

		bodyModel[353].addShapeBox(-3F, -5.5F, 1F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[353].setRotationPoint(29F, -31F, -18F);
		bodyModel[353].rotateAngleY = 1.57079633F;

		bodyModel[354].addShapeBox(-1F, -5.5F, 1F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[354].setRotationPoint(29F, -31F, -18F);
		bodyModel[354].rotateAngleY = 1.57079633F;

		bodyModel[355].addShapeBox(-2F, -5.5F, -2F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[355].setRotationPoint(29F, -31F, -18F);
		bodyModel[355].rotateAngleY = 1.57079633F;

		bodyModel[356].addShapeBox(4F, -20F, -3.5F, 1, 11, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[356].setRotationPoint(29F, -31F, -18F);
		bodyModel[356].rotateAngleY = 1.57079633F;

		bodyModel[357].addShapeBox(4F, -20F, 1.5F, 1, 11, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[357].setRotationPoint(29F, -31F, -18F);
		bodyModel[357].rotateAngleY = 1.57079633F;

		bodyModel[358].addShapeBox(4F, -9F, 1.5F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[358].setRotationPoint(29F, -31F, -18F);
		bodyModel[358].rotateAngleY = 1.57079633F;

		bodyModel[359].addShapeBox(4F, -9F, -3.5F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[359].setRotationPoint(29F, -31F, -18F);
		bodyModel[359].rotateAngleY = 1.57079633F;

		bodyModel[360].addShapeBox(-1F, -3F, -1F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[360].setRotationPoint(29F, -31F, -18F);
		bodyModel[360].rotateAngleY = 1.57079633F;

		bodyModel[361].addShapeBox(5F, -19F, -4F, 2, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[361].setRotationPoint(29F, -31F, -18F);
		bodyModel[361].rotateAngleY = 1.57079633F;

		bodyModel[362].addShapeBox(5F, -18F, -2.5F, 2, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[362].setRotationPoint(29F, -31F, -18F);
		bodyModel[362].rotateAngleY = 1.57079633F;

		bodyModel[363].addShapeBox(5F, -18F, -0.5F, 2, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[363].setRotationPoint(29F, -31F, -18F);
		bodyModel[363].rotateAngleY = 1.57079633F;

		bodyModel[364].addShapeBox(5F, -18F, 1.5F, 2, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[364].setRotationPoint(29F, -31F, -18F);
		bodyModel[364].rotateAngleY = 1.57079633F;

		bodyModel[365].addShapeBox(5F, -19F, 4F, 2, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[365].setRotationPoint(29F, -31F, -18F);
		bodyModel[365].rotateAngleY = 1.57079633F;

		bodyModel[366].addShapeBox(5F, -20F, -5F, 2, 1, 10, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[366].setRotationPoint(29F, -31F, -18F);
		bodyModel[366].rotateAngleY = 1.57079633F;

		bodyModel[367].addShapeBox(-7F, -4F, -4F, 12, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 749
		bodyModel[367].setRotationPoint(29F, -31F, 18F);
		bodyModel[367].rotateAngleY = -1.57079633F;

		bodyModel[368].addShapeBox(-7F, -6F, -5F, 10, 3, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 750
		bodyModel[368].setRotationPoint(29F, -31F, 18F);
		bodyModel[368].rotateAngleY = -1.57079633F;

		bodyModel[369].addShapeBox(3F, -6F, -5F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 751
		bodyModel[369].setRotationPoint(29F, -31F, 18F);
		bodyModel[369].rotateAngleY = -1.57079633F;

		bodyModel[370].addShapeBox(5F, -6F, -4F, 2, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 752
		bodyModel[370].setRotationPoint(29F, -31F, 18F);
		bodyModel[370].rotateAngleY = -1.57079633F;

		bodyModel[371].addShapeBox(5F, -19F, -5F, 2, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 753
		bodyModel[371].setRotationPoint(29F, -31F, 18F);
		bodyModel[371].rotateAngleY = -1.57079633F;

		bodyModel[372].addShapeBox(-4F, -9F, -5F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 754
		bodyModel[372].setRotationPoint(29F, -31F, 18F);
		bodyModel[372].rotateAngleY = -1.57079633F;

		bodyModel[373].addShapeBox(-5F, -10F, -5.5F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 755
		bodyModel[373].setRotationPoint(29F, -31F, 18F);
		bodyModel[373].rotateAngleY = -1.57079633F;

		bodyModel[374].addShapeBox(-7F, -6F, 4F, 10, 3, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 756
		bodyModel[374].setRotationPoint(29F, -31F, 18F);
		bodyModel[374].rotateAngleY = -1.57079633F;

		bodyModel[375].addShapeBox(-4F, -9F, 4F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 757
		bodyModel[375].setRotationPoint(29F, -31F, 18F);
		bodyModel[375].rotateAngleY = -1.57079633F;

		bodyModel[376].addShapeBox(-5F, -10F, 3.5F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 758
		bodyModel[376].setRotationPoint(29F, -31F, 18F);
		bodyModel[376].rotateAngleY = -1.57079633F;

		bodyModel[377].addShapeBox(3F, -6F, 4F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 759
		bodyModel[377].setRotationPoint(29F, -31F, 18F);
		bodyModel[377].rotateAngleY = -1.57079633F;

		bodyModel[378].addShapeBox(-7F, -5F, -4F, 12, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 760
		bodyModel[378].setRotationPoint(29F, -31F, 18F);
		bodyModel[378].rotateAngleY = -1.57079633F;

		bodyModel[379].addShapeBox(-3F, -5.5F, -4F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 761
		bodyModel[379].setRotationPoint(29F, -31F, 18F);
		bodyModel[379].rotateAngleY = -1.57079633F;

		bodyModel[380].addShapeBox(-3F, -5.5F, 2F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 762
		bodyModel[380].setRotationPoint(29F, -31F, 18F);
		bodyModel[380].rotateAngleY = -1.57079633F;

		bodyModel[381].addShapeBox(-3F, -5.5F, 1F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 763
		bodyModel[381].setRotationPoint(29F, -31F, 18F);
		bodyModel[381].rotateAngleY = -1.57079633F;

		bodyModel[382].addShapeBox(-1F, -5.5F, 1F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 764
		bodyModel[382].setRotationPoint(29F, -31F, 18F);
		bodyModel[382].rotateAngleY = -1.57079633F;

		bodyModel[383].addShapeBox(-2F, -5.5F, -2F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 765
		bodyModel[383].setRotationPoint(29F, -31F, 18F);
		bodyModel[383].rotateAngleY = -1.57079633F;

		bodyModel[384].addShapeBox(4F, -20F, -3.5F, 1, 11, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 766
		bodyModel[384].setRotationPoint(29F, -31F, 18F);
		bodyModel[384].rotateAngleY = -1.57079633F;

		bodyModel[385].addShapeBox(4F, -20F, 1.5F, 1, 11, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 767
		bodyModel[385].setRotationPoint(29F, -31F, 18F);
		bodyModel[385].rotateAngleY = -1.57079633F;

		bodyModel[386].addShapeBox(4F, -9F, 1.5F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 768
		bodyModel[386].setRotationPoint(29F, -31F, 18F);
		bodyModel[386].rotateAngleY = -1.57079633F;

		bodyModel[387].addShapeBox(4F, -9F, -3.5F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 769
		bodyModel[387].setRotationPoint(29F, -31F, 18F);
		bodyModel[387].rotateAngleY = -1.57079633F;

		bodyModel[388].addShapeBox(-1F, -3F, -1F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 770
		bodyModel[388].setRotationPoint(29F, -31F, 18F);
		bodyModel[388].rotateAngleY = -1.57079633F;

		bodyModel[389].addShapeBox(5F, -19F, -4F, 2, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 771
		bodyModel[389].setRotationPoint(29F, -31F, 18F);
		bodyModel[389].rotateAngleY = -1.57079633F;

		bodyModel[390].addShapeBox(5F, -18F, -2.5F, 2, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 772
		bodyModel[390].setRotationPoint(29F, -31F, 18F);
		bodyModel[390].rotateAngleY = -1.57079633F;

		bodyModel[391].addShapeBox(5F, -18F, -0.5F, 2, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 773
		bodyModel[391].setRotationPoint(29F, -31F, 18F);
		bodyModel[391].rotateAngleY = -1.57079633F;

		bodyModel[392].addShapeBox(5F, -18F, 1.5F, 2, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 774
		bodyModel[392].setRotationPoint(29F, -31F, 18F);
		bodyModel[392].rotateAngleY = -1.57079633F;

		bodyModel[393].addShapeBox(5F, -19F, 4F, 2, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 775
		bodyModel[393].setRotationPoint(29F, -31F, 18F);
		bodyModel[393].rotateAngleY = -1.57079633F;

		bodyModel[394].addShapeBox(5F, -20F, -5F, 2, 1, 10, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 776
		bodyModel[394].setRotationPoint(29F, -31F, 18F);
		bodyModel[394].rotateAngleY = -1.57079633F;
	}

	private void initnoseModel_1()
	{
		noseModel[0] = new ModelRendererTurbo(this, 49, 2009, textureX, textureY); // Box 77
		noseModel[1] = new ModelRendererTurbo(this, 81, 2009, textureX, textureY); // Box 78
		noseModel[2] = new ModelRendererTurbo(this, 105, 2009, textureX, textureY); // Box 79
		noseModel[3] = new ModelRendererTurbo(this, 137, 2009, textureX, textureY); // Box 80
		noseModel[4] = new ModelRendererTurbo(this, 169, 2009, textureX, textureY); // Box 81
		noseModel[5] = new ModelRendererTurbo(this, 177, 2009, textureX, textureY); // Box 82
		noseModel[6] = new ModelRendererTurbo(this, 209, 2009, textureX, textureY); // Box 83
		noseModel[7] = new ModelRendererTurbo(this, 233, 2009, textureX, textureY); // Box 84
		noseModel[8] = new ModelRendererTurbo(this, 313, 2009, textureX, textureY); // Box 86
		noseModel[9] = new ModelRendererTurbo(this, 337, 2009, textureX, textureY); // Box 87
		noseModel[10] = new ModelRendererTurbo(this, 1, 2009, textureX, textureY); // Box 106
		noseModel[11] = new ModelRendererTurbo(this, 9, 2009, textureX, textureY); // Box 107
		noseModel[12] = new ModelRendererTurbo(this, 353, 2009, textureX, textureY); // Box 112
		noseModel[13] = new ModelRendererTurbo(this, 385, 2009, textureX, textureY); // Box 113
		noseModel[14] = new ModelRendererTurbo(this, 385, 2009, textureX, textureY); // Box 119
		noseModel[15] = new ModelRendererTurbo(this, 441, 2009, textureX, textureY); // Box 120
		noseModel[16] = new ModelRendererTurbo(this, 505, 2009, textureX, textureY); // Box 124
		noseModel[17] = new ModelRendererTurbo(this, 577, 2009, textureX, textureY); // Box 125
		noseModel[18] = new ModelRendererTurbo(this, 633, 2009, textureX, textureY); // Box 126
		noseModel[19] = new ModelRendererTurbo(this, 689, 2009, textureX, textureY); // Box 127
		noseModel[20] = new ModelRendererTurbo(this, 489, 2009, textureX, textureY); // Box 128
		noseModel[21] = new ModelRendererTurbo(this, 737, 2009, textureX, textureY); // Box 254
		noseModel[22] = new ModelRendererTurbo(this, 777, 2009, textureX, textureY); // Box 255
		noseModel[23] = new ModelRendererTurbo(this, 1561, 1922, textureX, textureY); // Box 256
		noseModel[24] = new ModelRendererTurbo(this, 1649, 1922, textureX, textureY); // Box 257
		noseModel[25] = new ModelRendererTurbo(this, 1729, 1922, textureX, textureY); // Box 258
		noseModel[26] = new ModelRendererTurbo(this, 1833, 1922, textureX, textureY); // Box 259
		noseModel[27] = new ModelRendererTurbo(this, 1, 557, textureX, textureY); // Box 260
		noseModel[28] = new ModelRendererTurbo(this, 41, 557, textureX, textureY); // Box 261
		noseModel[29] = new ModelRendererTurbo(this, 97, 557, textureX, textureY); // Box 262
		noseModel[30] = new ModelRendererTurbo(this, 153, 557, textureX, textureY); // Box 263
		noseModel[31] = new ModelRendererTurbo(this, 193, 557, textureX, textureY); // Box 264
		noseModel[32] = new ModelRendererTurbo(this, 1, 625, textureX, textureY); // Box 265
		noseModel[33] = new ModelRendererTurbo(this, 57, 625, textureX, textureY); // Box 266
		noseModel[34] = new ModelRendererTurbo(this, 97, 625, textureX, textureY); // Box 267
		noseModel[35] = new ModelRendererTurbo(this, 1, 440, textureX, textureY); // Box 268
		noseModel[36] = new ModelRendererTurbo(this, 57, 440, textureX, textureY); // Box 269
		noseModel[37] = new ModelRendererTurbo(this, 113, 440, textureX, textureY); // Box 270
		noseModel[38] = new ModelRendererTurbo(this, 161, 440, textureX, textureY); // Box 271
		noseModel[39] = new ModelRendererTurbo(this, 1, 440, textureX, textureY); // Box 272
		noseModel[40] = new ModelRendererTurbo(this, 33, 440, textureX, textureY); // Box 273
		noseModel[41] = new ModelRendererTurbo(this, 217, 440, textureX, textureY); // Box 274
		noseModel[42] = new ModelRendererTurbo(this, 241, 440, textureX, textureY); // Box 275
		noseModel[43] = new ModelRendererTurbo(this, 113, 440, textureX, textureY); // Box 288
		noseModel[44] = new ModelRendererTurbo(this, 137, 440, textureX, textureY); // Box 289
		noseModel[45] = new ModelRendererTurbo(this, 161, 440, textureX, textureY); // Box 290
		noseModel[46] = new ModelRendererTurbo(this, 193, 440, textureX, textureY); // Box 291
		noseModel[47] = new ModelRendererTurbo(this, 1, 557, textureX, textureY); // Box 292
		noseModel[48] = new ModelRendererTurbo(this, 17, 557, textureX, textureY); // Box 293
		noseModel[49] = new ModelRendererTurbo(this, 1, 625, textureX, textureY); // Box 295
		noseModel[50] = new ModelRendererTurbo(this, 33, 625, textureX, textureY); // Box 296
		noseModel[51] = new ModelRendererTurbo(this, 49, 1970, textureX, textureY); // Box 370
		noseModel[52] = new ModelRendererTurbo(this, 81, 1970, textureX, textureY); // Box 371
		noseModel[53] = new ModelRendererTurbo(this, 105, 1970, textureX, textureY); // Box 372
		noseModel[54] = new ModelRendererTurbo(this, 137, 1970, textureX, textureY); // Box 373
		noseModel[55] = new ModelRendererTurbo(this, 169, 1970, textureX, textureY); // Box 374
		noseModel[56] = new ModelRendererTurbo(this, 177, 1970, textureX, textureY); // Box 375
		noseModel[57] = new ModelRendererTurbo(this, 209, 1970, textureX, textureY); // Box 376
		noseModel[58] = new ModelRendererTurbo(this, 233, 1970, textureX, textureY); // Box 377
		noseModel[59] = new ModelRendererTurbo(this, 313, 1970, textureX, textureY); // Box 379
		noseModel[60] = new ModelRendererTurbo(this, 337, 1970, textureX, textureY); // Box 380
		noseModel[61] = new ModelRendererTurbo(this, 1, 1970, textureX, textureY); // Box 399
		noseModel[62] = new ModelRendererTurbo(this, 9, 1970, textureX, textureY); // Box 400
		noseModel[63] = new ModelRendererTurbo(this, 353, 1970, textureX, textureY); // Box 405
		noseModel[64] = new ModelRendererTurbo(this, 385, 1970, textureX, textureY); // Box 406
		noseModel[65] = new ModelRendererTurbo(this, 385, 1970, textureX, textureY); // Box 412
		noseModel[66] = new ModelRendererTurbo(this, 441, 1970, textureX, textureY); // Box 413
		noseModel[67] = new ModelRendererTurbo(this, 505, 1970, textureX, textureY); // Box 417
		noseModel[68] = new ModelRendererTurbo(this, 577, 1970, textureX, textureY); // Box 418
		noseModel[69] = new ModelRendererTurbo(this, 633, 1970, textureX, textureY); // Box 419
		noseModel[70] = new ModelRendererTurbo(this, 689, 1970, textureX, textureY); // Box 420
		noseModel[71] = new ModelRendererTurbo(this, 489, 1970, textureX, textureY); // Box 421
		noseModel[72] = new ModelRendererTurbo(this, 737, 1970, textureX, textureY); // Box 544
		noseModel[73] = new ModelRendererTurbo(this, 777, 1970, textureX, textureY); // Box 545
		noseModel[74] = new ModelRendererTurbo(this, 1561, 1874, textureX, textureY); // Box 546
		noseModel[75] = new ModelRendererTurbo(this, 1649, 1874, textureX, textureY); // Box 547
		noseModel[76] = new ModelRendererTurbo(this, 1729, 1874, textureX, textureY); // Box 548
		noseModel[77] = new ModelRendererTurbo(this, 1833, 1874, textureX, textureY); // Box 549
		noseModel[78] = new ModelRendererTurbo(this, 329, 557, textureX, textureY); // Box 550
		noseModel[79] = new ModelRendererTurbo(this, 369, 557, textureX, textureY); // Box 551
		noseModel[80] = new ModelRendererTurbo(this, 425, 557, textureX, textureY); // Box 552
		noseModel[81] = new ModelRendererTurbo(this, 481, 557, textureX, textureY); // Box 553
		noseModel[82] = new ModelRendererTurbo(this, 521, 557, textureX, textureY); // Box 554
		noseModel[83] = new ModelRendererTurbo(this, 145, 625, textureX, textureY); // Box 555
		noseModel[84] = new ModelRendererTurbo(this, 201, 625, textureX, textureY); // Box 556
		noseModel[85] = new ModelRendererTurbo(this, 241, 625, textureX, textureY); // Box 557
		noseModel[86] = new ModelRendererTurbo(this, 793, 440, textureX, textureY); // Box 558
		noseModel[87] = new ModelRendererTurbo(this, 849, 440, textureX, textureY); // Box 559
		noseModel[88] = new ModelRendererTurbo(this, 665, 440, textureX, textureY); // Box 560
		noseModel[89] = new ModelRendererTurbo(this, 905, 440, textureX, textureY); // Box 561
		noseModel[90] = new ModelRendererTurbo(this, 321, 440, textureX, textureY); // Box 562
		noseModel[91] = new ModelRendererTurbo(this, 825, 440, textureX, textureY); // Box 563
		noseModel[92] = new ModelRendererTurbo(this, 961, 440, textureX, textureY); // Box 564
		noseModel[93] = new ModelRendererTurbo(this, 985, 440, textureX, textureY); // Box 565
		noseModel[94] = new ModelRendererTurbo(this, 849, 440, textureX, textureY); // Box 577
		noseModel[95] = new ModelRendererTurbo(this, 881, 440, textureX, textureY); // Box 578
		noseModel[96] = new ModelRendererTurbo(this, 257, 440, textureX, textureY); // Box 579
		noseModel[97] = new ModelRendererTurbo(this, 473, 440, textureX, textureY); // Box 580
		noseModel[98] = new ModelRendererTurbo(this, 369, 557, textureX, textureY); // Box 581
		noseModel[99] = new ModelRendererTurbo(this, 401, 557, textureX, textureY); // Box 582
		noseModel[100] = new ModelRendererTurbo(this, 49, 625, textureX, textureY); // Box 583
		noseModel[101] = new ModelRendererTurbo(this, 81, 625, textureX, textureY); // Box 584
		noseModel[102] = new ModelRendererTurbo(this, 121, 625, textureX, textureY); // Box 604
		noseModel[103] = new ModelRendererTurbo(this, 89, 625, textureX, textureY); // Box 605
		noseModel[104] = new ModelRendererTurbo(this, 177, 625, textureX, textureY); // Box 606
		noseModel[105] = new ModelRendererTurbo(this, 17, 625, textureX, textureY); // Box 607
		noseModel[106] = new ModelRendererTurbo(this, 65, 625, textureX, textureY); // Box 608
		noseModel[107] = new ModelRendererTurbo(this, 289, 625, textureX, textureY); // Box 609
		noseModel[108] = new ModelRendererTurbo(this, 297, 625, textureX, textureY); // Box 610
		noseModel[109] = new ModelRendererTurbo(this, 305, 625, textureX, textureY); // Box 611
		noseModel[110] = new ModelRendererTurbo(this, 225, 625, textureX, textureY); // Box 612
		noseModel[111] = new ModelRendererTurbo(this, 265, 625, textureX, textureY); // Box 613
		noseModel[112] = new ModelRendererTurbo(this, 193, 625, textureX, textureY); // Box 614
		noseModel[113] = new ModelRendererTurbo(this, 321, 625, textureX, textureY); // Box 615
		noseModel[114] = new ModelRendererTurbo(this, 249, 625, textureX, textureY); // Box 616
		noseModel[115] = new ModelRendererTurbo(this, 337, 625, textureX, textureY); // Box 617
		noseModel[116] = new ModelRendererTurbo(this, 361, 625, textureX, textureY); // Box 618
		noseModel[117] = new ModelRendererTurbo(this, 105, 625, textureX, textureY); // Box 619
		noseModel[118] = new ModelRendererTurbo(this, 121, 625, textureX, textureY); // Box 620
		noseModel[119] = new ModelRendererTurbo(this, 153, 625, textureX, textureY); // Box 621
		noseModel[120] = new ModelRendererTurbo(this, 369, 625, textureX, textureY); // Box 622
		noseModel[121] = new ModelRendererTurbo(this, 217, 483, textureX, textureY); // Box 638
		noseModel[122] = new ModelRendererTurbo(this, 353, 483, textureX, textureY); // Box 639
		noseModel[123] = new ModelRendererTurbo(this, 489, 483, textureX, textureY); // Box 640
		noseModel[124] = new ModelRendererTurbo(this, 513, 483, textureX, textureY); // Box 641
		noseModel[125] = new ModelRendererTurbo(this, 537, 483, textureX, textureY); // Box 642
		noseModel[126] = new ModelRendererTurbo(this, 625, 483, textureX, textureY); // Box 643
		noseModel[127] = new ModelRendererTurbo(this, 649, 483, textureX, textureY); // Box 644
		noseModel[128] = new ModelRendererTurbo(this, 1009, 483, textureX, textureY); // Box 688
		noseModel[129] = new ModelRendererTurbo(this, 1121, 483, textureX, textureY); // Box 689
		noseModel[130] = new ModelRendererTurbo(this, 1193, 483, textureX, textureY); // Box 690
		noseModel[131] = new ModelRendererTurbo(this, 1273, 483, textureX, textureY); // Box 691
		noseModel[132] = new ModelRendererTurbo(this, 1369, 483, textureX, textureY); // Box 700
		noseModel[133] = new ModelRendererTurbo(this, 1401, 483, textureX, textureY); // Box 701
		noseModel[134] = new ModelRendererTurbo(this, 1433, 483, textureX, textureY); // Box 702
		noseModel[135] = new ModelRendererTurbo(this, 1465, 483, textureX, textureY); // Box 703
		noseModel[136] = new ModelRendererTurbo(this, 1497, 483, textureX, textureY); // Box 704
		noseModel[137] = new ModelRendererTurbo(this, 1529, 483, textureX, textureY); // Box 705
		noseModel[138] = new ModelRendererTurbo(this, 1561, 483, textureX, textureY); // Box 706
		noseModel[139] = new ModelRendererTurbo(this, 1593, 483, textureX, textureY); // Box 707
		noseModel[140] = new ModelRendererTurbo(this, 1625, 483, textureX, textureY); // Box 708
		noseModel[141] = new ModelRendererTurbo(this, 1649, 483, textureX, textureY); // Box 709
		noseModel[142] = new ModelRendererTurbo(this, 1673, 483, textureX, textureY); // Box 710
		noseModel[143] = new ModelRendererTurbo(this, 1689, 483, textureX, textureY); // Box 711
		noseModel[144] = new ModelRendererTurbo(this, 1745, 483, textureX, textureY); // Box 712
		noseModel[145] = new ModelRendererTurbo(this, 1769, 483, textureX, textureY); // Box 713
		noseModel[146] = new ModelRendererTurbo(this, 1, 599, textureX, textureY); // Box 714
		noseModel[147] = new ModelRendererTurbo(this, 65, 599, textureX, textureY); // Box 715
		noseModel[148] = new ModelRendererTurbo(this, 113, 599, textureX, textureY); // Box 716
		noseModel[149] = new ModelRendererTurbo(this, 305, 599, textureX, textureY); // Box 717
		noseModel[150] = new ModelRendererTurbo(this, 145, 599, textureX, textureY); // Box 718
		noseModel[151] = new ModelRendererTurbo(this, 209, 599, textureX, textureY); // Box 719
		noseModel[152] = new ModelRendererTurbo(this, 257, 599, textureX, textureY); // Box 720
		noseModel[153] = new ModelRendererTurbo(this, 329, 599, textureX, textureY); // Box 721
		noseModel[154] = new ModelRendererTurbo(this, 385, 625, textureX, textureY); // Box 790

		noseModel[0].addShapeBox(0F, 0F, 0F, 14, 16, 1, 0F,0F, -2F, -10F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, -2F, 10F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F); // Box 77
		noseModel[0].setRotationPoint(-192F, -47F, -26F);

		noseModel[1].addShapeBox(0F, 0F, 0F, 10, 14, 1, 0F,0F, 0F, -11F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 11F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F); // Box 78
		noseModel[1].setRotationPoint(-202F, -45F, -21F);

		noseModel[2].addShapeBox(0F, 0F, 0F, 14, 2, 1, 0F,0F, 0F, -9.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9.9999F, 0F, 0F, -3.9999F, 0F, -1.9999F, 0F, 0F, -1.9999F, 0F, 0F, 0F, 3.9999F); // Box 79
		noseModel[2].setRotationPoint(-192F, -47F, -20F);

		noseModel[3].addShapeBox(0F, 0F, 0F, 14, 7, 1, 0F,0F, 0F, -13F, 0F, 0F, -12F, 0F, 0F, 12F, 0F, 0F, 13F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F); // Box 80
		noseModel[3].setRotationPoint(-192F, -54F, -20F);

		noseModel[4].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, 0F, -9F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 9F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F); // Box 81
		noseModel[4].setRotationPoint(-202F, -47F, -16F);

		noseModel[5].addShapeBox(0F, 0F, 0F, 8, 14, 15, 0F,-4F, 0F, -9F, 0F, 0F, -5F, 0F, 0F, 0F, -4F, 0F, 0F, 1F, -5F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -5F, 0F); // Box 82
		noseModel[5].setRotationPoint(-210F, -45F, -15F);

		noseModel[6].addShapeBox(0F, 0F, 0F, 4, 2, 10, 0F,-3F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		noseModel[6].setRotationPoint(-206F, -47F, -10F);

		noseModel[7].addShapeBox(0F, 0F, 0F, 14, 1, 8, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		noseModel[7].setRotationPoint(-192F, -54F, -8F);

		noseModel[8].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		noseModel[8].setRotationPoint(-196F, -54F, -7F);

		noseModel[9].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		noseModel[9].setRotationPoint(-200F, -54F, -7F);

		noseModel[10].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.8F, 0F, 0F, 2.1F, 0F, 0F, -2.1F, 0F, 0F, -1.8F); // Box 106
		noseModel[10].setRotationPoint(-196F, -53F, -7F);

		noseModel[11].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 2F, -3F, 0F, 3F, -3F, 0F, -3F, 3F, 0F, -2F); // Box 107
		noseModel[11].setRotationPoint(-200F, -53F, -4F);

		noseModel[12].addShapeBox(0F, 0F, 0F, 14, 5, 1, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, -1F, -5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 5F); // Box 112
		noseModel[12].setRotationPoint(-192F, -31F, -26F);

		noseModel[13].addShapeBox(0F, 0F, 0F, 10, 4, 1, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, -1F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 6F); // Box 113
		noseModel[13].setRotationPoint(-202F, -31F, -21F);

		noseModel[14].addShapeBox(0F, 0F, 0F, 14, 3, 26, 0F,0F, 0F, -5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, -8F, 0F, 1F, -4F, 0F, 1F, 0F, 0F, -1F, 0F); // Box 119
		noseModel[14].setRotationPoint(-192F, -27F, -26F);

		noseModel[15].addShapeBox(0F, 0F, 0F, 10, 3, 21, 0F,0F, 0F, -5.9999F, 0F, -0.9999F, 0F, 0F, -0.9999F, 0F, 0F, 0F, 0F, 0F, -2.9999F, -5.9999F, 0F, 0F, -2.9999F, 0F, 0F, 0F, 0F, -2.9999F, 0F); // Box 120
		noseModel[15].setRotationPoint(-202F, -28F, -21F);

		noseModel[16].addShapeBox(0F, 0F, 0F, 14, 17, 21, 0F,0F, 0F, -3F, 0F, -2F, 1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -17F, -3F, 0F, -15F, 1F, 0F, 3F, 0F, 0F, -1F, 0F); // Box 124
		noseModel[16].setRotationPoint(-192F, -25F, -21F);

		noseModel[17].addShapeBox(0F, 0F, 0F, 10, 17, 16, 0F,0F, 1.9999F, -0.9999F, 0F, -0.9999F, 1.9999F, 0F, -0.9999F, 0F, 0F, 1.9999F, 0F, 0F, -18.9999F, -0.9999F, 0F, -15.9999F, 1.9999F, 0F, 0F, 0F, 0F, -6.9999F, 0F); // Box 125
		noseModel[17].setRotationPoint(-202F, -26F, -16F);

		noseModel[18].addShapeBox(0F, 0F, 0F, 9, 3, 15, 0F,0F, 5F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, -3F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 126
		noseModel[18].setRotationPoint(-211F, -31F, -15F);

		noseModel[19].addShapeBox(0F, 0F, 0F, 6, 12, 15, 0F,0F, 0F, -8.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11.9999F, -8.9999F, 0F, -11.9999F, 0F, 0F, 0F, 0F, 0F, -11.9999F, 0F); // Box 127
		noseModel[19].setRotationPoint(-208F, -28F, -15F);

		noseModel[20].addShapeBox(0F, 0F, 0F, 9, 8, 6, 0F,1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 128
		noseModel[20].setRotationPoint(-208F, -28F, -6F);

		noseModel[21].addShapeBox(0F, 0F, 0F, 10, 1, 20, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 254
		noseModel[21].setRotationPoint(-202F, -28F, -20F);

		noseModel[22].addShapeBox(0F, 0F, 0F, 14, 3, 25, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 255
		noseModel[22].setRotationPoint(-192F, -28F, -25F);

		noseModel[23].addShapeBox(0F, 0F, 0F, 15, 4, 28, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 256
		noseModel[23].setRotationPoint(-178F, -28F, -28F);

		noseModel[24].addShapeBox(0F, 0F, 0F, 9, 6, 29, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 257
		noseModel[24].setRotationPoint(-163F, -28F, -29F);

		noseModel[25].addShapeBox(0F, 0F, 0F, 17, 9, 31, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 258
		noseModel[25].setRotationPoint(-154F, -28F, -31F);

		noseModel[26].addShapeBox(0F, 0F, 0F, 19, 10, 31, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 259
		noseModel[26].setRotationPoint(-137F, -28F, -31F);

		noseModel[27].addShapeBox(0F, 0F, 0F, 1, 10, 31, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
		noseModel[27].setRotationPoint(-118F, -28F, -31F);

		noseModel[28].addShapeBox(0F, 0F, 0F, 1, 3, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 261
		noseModel[28].setRotationPoint(-118F, -31F, -31F);

		noseModel[29].addShapeBox(0F, 0F, 0F, 1, 16, 23, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 262
		noseModel[29].setRotationPoint(-118F, -47F, -31F);

		noseModel[30].addShapeBox(0F, 0F, 0F, 1, 7, 18, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 263
		noseModel[30].setRotationPoint(-118F, -54F, -26F);

		noseModel[31].addShapeBox(0F, 0F, 0F, 1, 4, 19, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 264
		noseModel[31].setRotationPoint(-118F, -58F, -19F);

		noseModel[32].addShapeBox(0F, 0F, 0F, 1, 3, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 265
		noseModel[32].setRotationPoint(-178F, -31F, -25F);

		noseModel[33].addShapeBox(0F, 0F, 0F, 1, 16, 17, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 266
		noseModel[33].setRotationPoint(-178F, -47F, -25F);

		noseModel[34].addShapeBox(0F, 0F, 0F, 1, 6, 19, 0F,0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 267
		noseModel[34].setRotationPoint(-178F, -53F, -19F);

		noseModel[35].addShapeBox(0F, 0F, 0F, 1, 13, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 268
		noseModel[35].setRotationPoint(-47F, -31F, -34F);

		noseModel[36].addShapeBox(0F, 0F, 0F, 1, 16, 26, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 269
		noseModel[36].setRotationPoint(-47F, -47F, -34F);

		noseModel[37].addShapeBox(0F, 0F, 0F, 1, 7, 21, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 270
		noseModel[37].setRotationPoint(-47F, -54F, -29F);

		noseModel[38].addShapeBox(0F, 0F, 0F, 1, 4, 24, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 271
		noseModel[38].setRotationPoint(-47F, -58F, -24F);

		noseModel[39].addShapeBox(0F, 0F, 0F, 1, 5, 8, 0F,0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 272
		noseModel[39].setRotationPoint(1F, -59F, -26F);

		noseModel[40].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 273
		noseModel[40].setRotationPoint(1F, -54F, -29F);

		noseModel[41].addShapeBox(0F, 0F, 0F, 1, 16, 10, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 274
		noseModel[41].setRotationPoint(1F, -47F, -32F);

		noseModel[42].addShapeBox(0F, 0F, 0F, 1, 13, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 275
		noseModel[42].setRotationPoint(1F, -31F, -32F);

		noseModel[43].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 288
		noseModel[43].setRotationPoint(-47F, -54F, -8F);

		noseModel[44].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 289
		noseModel[44].setRotationPoint(-47F, -20F, -8F);

		noseModel[45].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 290
		noseModel[45].setRotationPoint(-47F, -24F, -8F);

		noseModel[46].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 291
		noseModel[46].setRotationPoint(-47F, -52F, -8F);

		noseModel[47].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 292
		noseModel[47].setRotationPoint(-118F, -32F, -8F);

		noseModel[48].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 293
		noseModel[48].setRotationPoint(-118F, -54F, -8F);

		noseModel[49].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 295
		noseModel[49].setRotationPoint(-178F, -35F, -8F);

		noseModel[50].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 296
		noseModel[50].setRotationPoint(-178F, -47F, -8F);

		noseModel[51].addShapeBox(0F, 0F, 0F, 14, 16, 1, 0F,0F, -2F, 10F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, -2F, -10F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 370
		noseModel[51].setRotationPoint(-192F, -47F, 25F);

		noseModel[52].addShapeBox(0F, 0F, 0F, 10, 14, 1, 0F,0F, 0F, 11F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, -11F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 371
		noseModel[52].setRotationPoint(-202F, -45F, 20F);

		noseModel[53].addShapeBox(0F, 0F, 0F, 14, 2, 1, 0F,0F, 0F, 9.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9.9999F, 0F, 0F, 3.9999F, 0F, -1.9999F, 0F, 0F, -1.9999F, 0F, 0F, 0F, -3.9999F); // Box 372
		noseModel[53].setRotationPoint(-192F, -47F, 19F);

		noseModel[54].addShapeBox(0F, 0F, 0F, 14, 7, 1, 0F,0F, 0F, 13F, 0F, 0F, 12F, 0F, 0F, -12F, 0F, 0F, -13F, 0F, 0F, 10F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, -10F); // Box 373
		noseModel[54].setRotationPoint(-192F, -54F, 19F);

		noseModel[55].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, 0F, 9F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, -9F, 0F, 0F, 6F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 374
		noseModel[55].setRotationPoint(-202F, -47F, 15F);

		noseModel[56].addShapeBox(0F, 0F, 0F, 8, 14, 15, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -4F, 0F, -9F, 1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -5F, -9F); // Box 375
		noseModel[56].setRotationPoint(-210F, -45F, 0F);

		noseModel[57].addShapeBox(0F, 0F, 0F, 4, 2, 10, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 376
		noseModel[57].setRotationPoint(-206F, -47F, 0F);

		noseModel[58].addShapeBox(0F, 0F, 0F, 14, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 377
		noseModel[58].setRotationPoint(-192F, -54F, 0F);

		noseModel[59].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 379
		noseModel[59].setRotationPoint(-196F, -54F, 0F);

		noseModel[60].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 380
		noseModel[60].setRotationPoint(-200F, -54F, 0F);

		noseModel[61].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.8F, 0F, 0F, -2.1F, 0F, 0F, 2.1F, 0F, 0F, 1.8F); // Box 399
		noseModel[61].setRotationPoint(-196F, -53F, 6F);

		noseModel[62].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, -2F, -3F, 0F, -3F, -3F, 0F, 3F, 3F, 0F, 2F); // Box 400
		noseModel[62].setRotationPoint(-200F, -53F, 3F);

		noseModel[63].addShapeBox(0F, 0F, 0F, 14, 5, 1, 0F,0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -1F, 5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, -5F); // Box 405
		noseModel[63].setRotationPoint(-192F, -31F, 25F);

		noseModel[64].addShapeBox(0F, 0F, 0F, 10, 4, 1, 0F,0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -1F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -6F); // Box 406
		noseModel[64].setRotationPoint(-202F, -31F, 20F);

		noseModel[65].addShapeBox(0F, 0F, 0F, 14, 3, 26, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -5F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, -4F, 0F, -1F, -8F); // Box 412
		noseModel[65].setRotationPoint(-192F, -27F, 0F);

		noseModel[66].addShapeBox(0F, 0F, 0F, 10, 3, 21, 0F,0F, 0F, 0F, 0F, -0.9999F, 0F, 0F, -0.9999F, 0F, 0F, 0F, -5.9999F, 0F, -2.9999F, 0F, 0F, 0F, 0F, 0F, 0F, -2.9999F, 0F, -2.9999F, -5.9999F); // Box 413
		noseModel[66].setRotationPoint(-202F, -28F, 0F);

		noseModel[67].addShapeBox(0F, 0F, 0F, 14, 17, 21, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 1F, 0F, 0F, -3F, 0F, -1F, 0F, 0F, 3F, 0F, 0F, -15F, 1F, 0F, -17F, -3F); // Box 417
		noseModel[67].setRotationPoint(-192F, -25F, 0F);

		noseModel[68].addShapeBox(0F, 0F, 0F, 10, 17, 16, 0F,0F, 1.9999F, 0F, 0F, -0.9999F, 0F, 0F, -0.9999F, 1.9999F, 0F, 1.9999F, -0.9999F, 0F, -6.9999F, 0F, 0F, 0F, 0F, 0F, -15.9999F, 1.9999F, 0F, -18.9999F, -0.9999F); // Box 418
		noseModel[68].setRotationPoint(-202F, -26F, 0F);

		noseModel[69].addShapeBox(0F, 0F, 0F, 9, 3, 15, 0F,0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, -9F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -9F); // Box 419
		noseModel[69].setRotationPoint(-211F, -31F, 0F);

		noseModel[70].addShapeBox(0F, 0F, 0F, 6, 12, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8.9999F, 0F, -11.9999F, 0F, 0F, 0F, 0F, 0F, -11.9999F, 0F, 0F, -11.9999F, -8.9999F); // Box 420
		noseModel[70].setRotationPoint(-208F, -28F, 0F);

		noseModel[71].addShapeBox(0F, 0F, 0F, 9, 8, 6, 0F,1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 421
		noseModel[71].setRotationPoint(-208F, -28F, 0F);

		noseModel[72].addShapeBox(0F, 0F, 0F, 10, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -6F); // Box 544
		noseModel[72].setRotationPoint(-202F, -28F, 0F);

		noseModel[73].addShapeBox(0F, 0F, 0F, 14, 3, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -5F); // Box 545
		noseModel[73].setRotationPoint(-192F, -28F, 0F);

		noseModel[74].addShapeBox(0F, 0F, 0F, 15, 4, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F); // Box 546
		noseModel[74].setRotationPoint(-178F, -28F, 0F);

		noseModel[75].addShapeBox(0F, 0F, 0F, 9, 6, 29, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F); // Box 547
		noseModel[75].setRotationPoint(-163F, -28F, 0F);

		noseModel[76].addShapeBox(0F, 0F, 0F, 17, 9, 31, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F); // Box 548
		noseModel[76].setRotationPoint(-154F, -28F, 0F);

		noseModel[77].addShapeBox(0F, 0F, 0F, 19, 10, 31, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 549
		noseModel[77].setRotationPoint(-137F, -28F, 0F);

		noseModel[78].addShapeBox(0F, 0F, 0F, 1, 10, 31, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 550
		noseModel[78].setRotationPoint(-118F, -28F, 0F);

		noseModel[79].addShapeBox(0F, 0F, 0F, 1, 3, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 551
		noseModel[79].setRotationPoint(-118F, -31F, 8F);

		noseModel[80].addShapeBox(0F, 0F, 0F, 1, 16, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 552
		noseModel[80].setRotationPoint(-118F, -47F, 8F);

		noseModel[81].addShapeBox(0F, 0F, 0F, 1, 7, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 553
		noseModel[81].setRotationPoint(-118F, -54F, 8F);

		noseModel[82].addShapeBox(0F, 0F, 0F, 1, 4, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 554
		noseModel[82].setRotationPoint(-118F, -58F, 0F);

		noseModel[83].addShapeBox(0F, 0F, 0F, 1, 3, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 555
		noseModel[83].setRotationPoint(-178F, -31F, 0F);

		noseModel[84].addShapeBox(0F, 0F, 0F, 1, 16, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 556
		noseModel[84].setRotationPoint(-178F, -47F, 8F);

		noseModel[85].addShapeBox(0F, 0F, 0F, 1, 6, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 557
		noseModel[85].setRotationPoint(-178F, -53F, 0F);

		noseModel[86].addShapeBox(0F, 0F, 0F, 1, 13, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 558
		noseModel[86].setRotationPoint(-47F, -31F, 8F);

		noseModel[87].addShapeBox(0F, 0F, 0F, 1, 16, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 559
		noseModel[87].setRotationPoint(-47F, -47F, 8F);

		noseModel[88].addShapeBox(0F, 0F, 0F, 1, 7, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 560
		noseModel[88].setRotationPoint(-47F, -54F, 8F);

		noseModel[89].addShapeBox(0F, 0F, 0F, 1, 4, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 561
		noseModel[89].setRotationPoint(-47F, -58F, 0F);

		noseModel[90].addShapeBox(0F, 0F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 562
		noseModel[90].setRotationPoint(1F, -59F, 18F);

		noseModel[91].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 563
		noseModel[91].setRotationPoint(1F, -54F, 21F);

		noseModel[92].addShapeBox(0F, 0F, 0F, 1, 16, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 564
		noseModel[92].setRotationPoint(1F, -47F, 22F);

		noseModel[93].addShapeBox(0F, 0F, 0F, 1, 13, 12, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 565
		noseModel[93].setRotationPoint(1F, -31F, 20F);

		noseModel[94].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 577
		noseModel[94].setRotationPoint(-47F, -54F, 0F);

		noseModel[95].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 578
		noseModel[95].setRotationPoint(-47F, -20F, 0F);

		noseModel[96].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 579
		noseModel[96].setRotationPoint(-47F, -24F, 4F);

		noseModel[97].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 580
		noseModel[97].setRotationPoint(-47F, -52F, 4F);

		noseModel[98].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 581
		noseModel[98].setRotationPoint(-118F, -32F, 4F);

		noseModel[99].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 582
		noseModel[99].setRotationPoint(-118F, -54F, 4F);

		noseModel[100].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 583
		noseModel[100].setRotationPoint(-178F, -35F, 4F);

		noseModel[101].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 584
		noseModel[101].setRotationPoint(-178F, -47F, 4F);

		noseModel[102].addShapeBox(0F, 1F, 0F, 10, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 604
		noseModel[102].setRotationPoint(-199F, -36F, -5F);
		noseModel[102].rotateAngleZ = -0.10471976F;

		noseModel[103].addShapeBox(9F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 605
		noseModel[103].setRotationPoint(-199F, -36F, -5F);
		noseModel[103].rotateAngleZ = -0.10471976F;

		noseModel[104].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 606
		noseModel[104].setRotationPoint(-199F, -36F, 4F);
		noseModel[104].rotateAngleZ = -0.10471976F;

		noseModel[105].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 607
		noseModel[105].setRotationPoint(-195F, -34F, 3F);

		noseModel[106].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 608
		noseModel[106].setRotationPoint(-195F, -34F, -4F);

		noseModel[107].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 609
		noseModel[107].setRotationPoint(-190F, -45F, 3F);

		noseModel[108].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 610
		noseModel[108].setRotationPoint(-190F, -45F, -4F);

		noseModel[109].addShapeBox(0F, 0F, 0F, 1, 13, 10, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 611
		noseModel[109].setRotationPoint(-190F, -48F, -5F);

		noseModel[110].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 612
		noseModel[110].setRotationPoint(-196F, -35F, -6F);
		noseModel[110].rotateAngleZ = 0.78539816F;

		noseModel[111].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 613
		noseModel[111].setRotationPoint(-199F, -36F, -5F);
		noseModel[111].rotateAngleZ = -0.10471976F;

		noseModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 614
		noseModel[112].setRotationPoint(-199F, -36F, -5F);
		noseModel[112].rotateAngleZ = -0.10471976F;

		noseModel[113].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 615
		noseModel[113].setRotationPoint(-196F, -35F, 5F);
		noseModel[113].rotateAngleZ = 0.78539816F;

		noseModel[114].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 616
		noseModel[114].setRotationPoint(-191.3F, -47.3F, -2F);

		noseModel[115].addShapeBox(0F, 0F, 0F, 1, 13, 8, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 617
		noseModel[115].setRotationPoint(-191F, -47F, -4F);

		noseModel[116].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 618
		noseModel[116].setRotationPoint(-191.3F, -47.3F, 1F);

		noseModel[117].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 619
		noseModel[117].setRotationPoint(-188.5F, -49.5F, -1.5F);

		noseModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 620
		noseModel[118].setRotationPoint(-188.5F, -50.5F, -1.5F);

		noseModel[119].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 621
		noseModel[119].setRotationPoint(-188.5F, -51.5F, -1.5F);

		noseModel[120].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 622
		noseModel[120].setRotationPoint(-188F, -52F, -3F);

		noseModel[121].addShapeBox(0F, 0F, 0F, 43, 17, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 638
		noseModel[121].setRotationPoint(-90F, -48F, 10F);

		noseModel[122].addShapeBox(0F, 0F, 0F, 43, 13, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 639
		noseModel[122].setRotationPoint(-90F, -31F, 10F);

		noseModel[123].addShapeBox(0F, 0F, 0F, 3, 67, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 640
		noseModel[123].setRotationPoint(-72F, -85F, -3F);

		noseModel[124].addShapeBox(0F, 0F, 0F, 2, 67, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 641
		noseModel[124].setRotationPoint(-74F, -85F, -3F);

		noseModel[125].addShapeBox(0F, 0F, 0F, 24, 13, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 642
		noseModel[125].setRotationPoint(-87F, -31F, -7F);

		noseModel[126].addShapeBox(0F, 0F, 0F, 2, 67, 6, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 643
		noseModel[126].setRotationPoint(-69F, -85F, -3F);

		noseModel[127].addShapeBox(0F, 0F, 0F, 24, 10, 17, 0F,-10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 644
		noseModel[127].setRotationPoint(-87F, -41F, -7F);

		noseModel[128].addShapeBox(0F, 0F, 0F, 43, 10, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 688
		noseModel[128].setRotationPoint(-90F, -58F, 10F);

		noseModel[129].addShapeBox(0F, 0F, 0F, 27, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 689
		noseModel[129].setRotationPoint(-117F, -33F, 15F);

		noseModel[130].addShapeBox(0F, 0F, 0F, 27, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 690
		noseModel[130].setRotationPoint(-117F, -47F, 15F);

		noseModel[131].addShapeBox(0F, 0F, 0F, 27, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 691
		noseModel[131].setRotationPoint(-117F, -32F, 15F);

		noseModel[132].addShapeBox(0F, 0F, 0F, 3, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 700
		noseModel[132].setRotationPoint(-111F, -34F, 17F);

		noseModel[133].addShapeBox(0F, 0F, 0F, 3, 1, 9, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 701
		noseModel[133].setRotationPoint(-114F, -34F, 17F);

		noseModel[134].addShapeBox(0F, 0F, 0F, 3, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 702
		noseModel[134].setRotationPoint(-108F, -34F, 17F);

		noseModel[135].addShapeBox(0F, 0F, 0F, 3, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 703
		noseModel[135].setRotationPoint(-101F, -34F, 17F);

		noseModel[136].addShapeBox(0F, 0F, 0F, 3, 1, 9, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 704
		noseModel[136].setRotationPoint(-104F, -34F, 17F);

		noseModel[137].addShapeBox(0F, 0F, 0F, 3, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 705
		noseModel[137].setRotationPoint(-98F, -34F, 17F);

		noseModel[138].addShapeBox(0F, 0F, 0F, 11, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 706
		noseModel[138].setRotationPoint(-116F, -32F, 14F);

		noseModel[139].addShapeBox(0F, 0F, 0F, 13, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 707
		noseModel[139].setRotationPoint(-104F, -32F, 14F);

		noseModel[140].addShapeBox(0F, 0F, 0F, 3, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 708
		noseModel[140].setRotationPoint(-101F, -51F, 17F);

		noseModel[141].addShapeBox(0F, 0F, 0F, 3, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 709
		noseModel[141].setRotationPoint(-106F, -51F, 16F);

		noseModel[142].addShapeBox(0F, 0F, 0F, 3, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 710
		noseModel[142].setRotationPoint(-114F, -51F, 18F);

		noseModel[143].addShapeBox(0F, 0F, 0F, 27, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 711
		noseModel[143].setRotationPoint(-117F, -49F, 15F);

		noseModel[144].addShapeBox(0F, 0F, 0F, 3, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 712
		noseModel[144].setRotationPoint(-110F, -51F, 17F);

		noseModel[145].addShapeBox(0F, 0F, 0F, 3, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 713
		noseModel[145].setRotationPoint(-96F, -51F, 16F);

		noseModel[146].addShapeBox(0F, 0F, 0F, 13, 8, 17, 0F,0F, 0F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 714
		noseModel[146].setRotationPoint(-177F, -47F, -25F);

		noseModel[147].addShapeBox(0F, 0F, 0F, 13, 4, 14, 0F,0F, 0F, -10F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 715
		noseModel[147].setRotationPoint(-177F, -51F, -22F);

		noseModel[148].addShapeBox(0F, 0F, 0F, 13, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 716
		noseModel[148].setRotationPoint(-177F, -51F, -8F);

		noseModel[149].addShapeBox(0F, 0F, 0F, 1, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 717
		noseModel[149].setRotationPoint(-165F, -47F, -8F);

		noseModel[150].addShapeBox(0F, 0F, 0F, 13, 8, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 718
		noseModel[150].setRotationPoint(-177F, -47F, 8F);

		noseModel[151].addShapeBox(0F, 0F, 0F, 13, 4, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 719
		noseModel[151].setRotationPoint(-177F, -51F, 8F);

		noseModel[152].addShapeBox(0F, 0F, 0F, 13, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 720
		noseModel[152].setRotationPoint(-177F, -51F, 0F);

		noseModel[153].addShapeBox(0F, 0F, 0F, 1, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 721
		noseModel[153].setRotationPoint(-165F, -47F, 0F);

		noseModel[154].addShapeBox(0F, 0F, 0F, 1, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 790
		noseModel[154].setRotationPoint(-202F, -48F, -0.5F);
	}

	private void inittailModel_1()
	{
		tailModel[0] = new ModelRendererTurbo(this, 1, 1500, textureX, textureY); // Box 53
		tailModel[1] = new ModelRendererTurbo(this, 1, 1500, textureX, textureY); // Box 54
		tailModel[2] = new ModelRendererTurbo(this, 17, 1500, textureX, textureY); // Box 55
		tailModel[3] = new ModelRendererTurbo(this, 201, 1500, textureX, textureY); // Box 56
		tailModel[4] = new ModelRendererTurbo(this, 401, 1500, textureX, textureY); // Box 57
		tailModel[5] = new ModelRendererTurbo(this, 561, 1500, textureX, textureY); // Box 58
		tailModel[6] = new ModelRendererTurbo(this, 729, 1500, textureX, textureY); // Box 146
		tailModel[7] = new ModelRendererTurbo(this, 929, 1500, textureX, textureY); // Box 147
		tailModel[8] = new ModelRendererTurbo(this, 1121, 1500, textureX, textureY); // Box 148
		tailModel[9] = new ModelRendererTurbo(this, 1305, 1500, textureX, textureY); // Box 149
		tailModel[10] = new ModelRendererTurbo(this, 233, 1346, textureX, textureY); // Box 215
		tailModel[11] = new ModelRendererTurbo(this, 281, 1346, textureX, textureY); // Box 216
		tailModel[12] = new ModelRendererTurbo(this, 313, 1346, textureX, textureY); // Box 217
		tailModel[13] = new ModelRendererTurbo(this, 393, 1346, textureX, textureY); // Box 218
		tailModel[14] = new ModelRendererTurbo(this, 489, 1346, textureX, textureY); // Box 219
		tailModel[15] = new ModelRendererTurbo(this, 609, 1346, textureX, textureY); // Box 220
		tailModel[16] = new ModelRendererTurbo(this, 1041, 1346, textureX, textureY); // Box 225
		tailModel[17] = new ModelRendererTurbo(this, 1057, 1346, textureX, textureY); // Box 226
		tailModel[18] = new ModelRendererTurbo(this, 1185, 1346, textureX, textureY); // Box 227
		tailModel[19] = new ModelRendererTurbo(this, 1233, 1346, textureX, textureY); // Box 228
		tailModel[20] = new ModelRendererTurbo(this, 1, 1540, textureX, textureY); // Box 351
		tailModel[21] = new ModelRendererTurbo(this, 1, 1540, textureX, textureY); // Box 352
		tailModel[22] = new ModelRendererTurbo(this, 17, 1540, textureX, textureY); // Box 353
		tailModel[23] = new ModelRendererTurbo(this, 201, 1540, textureX, textureY); // Box 354
		tailModel[24] = new ModelRendererTurbo(this, 401, 1540, textureX, textureY); // Box 355
		tailModel[25] = new ModelRendererTurbo(this, 561, 1540, textureX, textureY); // Box 356
		tailModel[26] = new ModelRendererTurbo(this, 729, 1540, textureX, textureY); // Box 438
		tailModel[27] = new ModelRendererTurbo(this, 929, 1540, textureX, textureY); // Box 439
		tailModel[28] = new ModelRendererTurbo(this, 1121, 1540, textureX, textureY); // Box 440
		tailModel[29] = new ModelRendererTurbo(this, 1305, 1540, textureX, textureY); // Box 441
		tailModel[30] = new ModelRendererTurbo(this, 233, 1423, textureX, textureY); // Box 505
		tailModel[31] = new ModelRendererTurbo(this, 281, 1423, textureX, textureY); // Box 506
		tailModel[32] = new ModelRendererTurbo(this, 313, 1423, textureX, textureY); // Box 507
		tailModel[33] = new ModelRendererTurbo(this, 393, 1423, textureX, textureY); // Box 508
		tailModel[34] = new ModelRendererTurbo(this, 489, 1423, textureX, textureY); // Box 509
		tailModel[35] = new ModelRendererTurbo(this, 609, 1423, textureX, textureY); // Box 510
		tailModel[36] = new ModelRendererTurbo(this, 1041, 1423, textureX, textureY); // Box 515
		tailModel[37] = new ModelRendererTurbo(this, 1057, 1423, textureX, textureY); // Box 516
		tailModel[38] = new ModelRendererTurbo(this, 1185, 1423, textureX, textureY); // Box 517
		tailModel[39] = new ModelRendererTurbo(this, 1233, 1423, textureX, textureY); // Box 518
		tailModel[40] = new ModelRendererTurbo(this, 1561, 440, textureX, textureY); // Box 791
		tailModel[41] = new ModelRendererTurbo(this, 889, 440, textureX, textureY); // Box 792
		tailModel[42] = new ModelRendererTurbo(this, 1601, 440, textureX, textureY); // Box 793

		tailModel[0].addShapeBox(0F, 0F, 0F, 68, 11, 28, 0F,0F, 0F, 0F, 0F, 5F, -11F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -10F, -13F, 0F, -4F, 0F, 0F, 12F, 0F); // Box 53
		tailModel[0].setRotationPoint(67F, -47F, -28F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9999F, 0F, 0F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		tailModel[1].setRotationPoint(67F, -25F, -2F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9999F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		tailModel[2].setRotationPoint(67F, -18F, -1F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 68, 7, 28, 0F,0F, 0F, -5F, 0F, 3F, -13F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -11F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 56
		tailModel[3].setRotationPoint(67F, -54F, -28F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 68, 6, 23, 0F,0F, 0F, -9F, 0F, 1F, -14F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -8F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 57
		tailModel[4].setRotationPoint(67F, -60F, -23F);

		tailModel[5].addShapeBox(0F, 0F, 0F, 68, 3, 14, 0F,0F, 0F, -5F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -5F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 58
		tailModel[5].setRotationPoint(67F, -63F, -14F);

		tailModel[6].addShapeBox(0F, 0F, 0F, 80, 5, 17, 0F,0F, 0F, -2F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -16F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 146
		tailModel[6].setRotationPoint(135F, -57F, -17F);

		tailModel[7].addShapeBox(0F, 0F, 0F, 80, 4, 15, 0F,0F, 0F, -5.9999F, 0F, -3.9999F, -13.9999F, 0F, -3.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13.9999F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		tailModel[7].setRotationPoint(135F, -61F, -15F);

		tailModel[8].addShapeBox(0F, 0F, 0F, 80, 6, 17, 0F,0F, 0F, 0F, 0F, 3.9999F, -15.9999F, 0F, 3.9999F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9999F, 0F, -9.9999F, -15.9999F, 0F, -8.9999F, 0F, 0F, 5.9999F, 0F); // Box 148
		tailModel[8].setRotationPoint(135F, -52F, -17F);

		tailModel[9].addShapeBox(0F, 0F, 0F, 80, 2, 9, 0F,0F, 0F, -2.9999F, 0F, -4.9999F, -8.9999F, 0F, -4.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.9999F, -7.9999F, 0F, 3.9999F, 0F, 0F, 0F, 0F); // Box 149
		tailModel[9].setRotationPoint(135F, -63F, -9F);

		tailModel[10].addShapeBox(0F, 0F, 0F, 18, 11, 5, 0F,-10F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, -8F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 215
		tailModel[10].setRotationPoint(160F, -123F, -5F);

		tailModel[11].addShapeBox(0F, 0F, 0F, 9, 7, 4, 0F,-5F, -3F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, -3F, -3F, 0F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 216
		tailModel[11].setRotationPoint(169F, -130F, -4F);

		tailModel[12].addShapeBox(0F, 0F, 0F, 31, 19, 5, 0F,-15F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		tailModel[12].setRotationPoint(147F, -112F, -5F);

		tailModel[13].addShapeBox(0F, 0F, 0F, 41, 12, 5, 0F,-12F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 218
		tailModel[13].setRotationPoint(137F, -93F, -5F);

		tailModel[14].addShapeBox(0F, 0F, 0F, 52, 9, 5, 0F,-13F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		tailModel[14].setRotationPoint(126F, -81F, -5F);

		tailModel[15].addShapeBox(0F, 0F, 0F, 84, 14, 5, 0F,-34F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -32F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		tailModel[15].setRotationPoint(94F, -72F, -5F);

		tailModel[16].addShapeBox(0F, 0F, 0F, 29, 5, 14, 0F,-2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 225
		tailModel[16].setRotationPoint(149F, -93F, -15F);

		tailModel[17].addShapeBox(0F, 0F, 0F, 27, 5, 71, 0F,-14F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -14F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 226
		tailModel[17].setRotationPoint(151F, -93F, -86F);

		tailModel[18].addShapeBox(0F, 0F, 0F, 13, 5, 16, 0F,-4F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -4F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 227
		tailModel[18].setRotationPoint(165F, -93F, -102F);

		tailModel[19].addShapeBox(0F, 0F, 0F, 9, 3, 6, 0F,-4F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -4F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 228
		tailModel[19].setRotationPoint(169F, -92F, -108F);

		tailModel[20].addShapeBox(0F, 0F, 0F, 68, 11, 28, 0F,0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, -11F, 0F, 0F, 0F, 0F, 12F, 0F, 0F, -4F, 0F, 0F, -10F, -13F, 0F, 0F, -4F); // Box 351
		tailModel[20].setRotationPoint(67F, -47F, 0F);

		tailModel[21].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9999F, 0F, 0F, -0.9999F); // Box 352
		tailModel[21].setRotationPoint(67F, -25F, 0F);

		tailModel[22].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9999F, 0F, 0F, 0F); // Box 353
		tailModel[22].setRotationPoint(67F, -18F, 0F);

		tailModel[23].addShapeBox(0F, 0F, 0F, 68, 7, 28, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, -13F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, -11F, 0F, 0F, 0F); // Box 354
		tailModel[23].setRotationPoint(67F, -54F, 0F);

		tailModel[24].addShapeBox(0F, 0F, 0F, 68, 6, 23, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -14F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -8F, 0F, 0F, 0F); // Box 355
		tailModel[24].setRotationPoint(67F, -60F, 0F);

		tailModel[25].addShapeBox(0F, 0F, 0F, 68, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -5F, 0F, 0F, 0F); // Box 356
		tailModel[25].setRotationPoint(67F, -63F, 0F);

		tailModel[26].addShapeBox(0F, 0F, 0F, 80, 5, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, -16F, 0F, 0F, 0F); // Box 438
		tailModel[26].setRotationPoint(135F, -57F, 0F);

		tailModel[27].addShapeBox(0F, 0F, 0F, 80, 4, 15, 0F,0F, 0F, 0F, 0F, -3.9999F, 0F, 0F, -3.9999F, -13.9999F, 0F, 0F, -5.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13.9999F, 0F, 0F, 0F); // Box 439
		tailModel[27].setRotationPoint(135F, -61F, 0F);

		tailModel[28].addShapeBox(0F, 0F, 0F, 80, 6, 17, 0F,0F, 0F, 0F, 0F, 3.9999F, 0F, 0F, 3.9999F, -15.9999F, 0F, 0F, 0F, 0F, 5.9999F, 0F, 0F, -8.9999F, 0F, 0F, -9.9999F, -15.9999F, 0F, 0F, -1.9999F); // Box 440
		tailModel[28].setRotationPoint(135F, -52F, 0F);

		tailModel[29].addShapeBox(0F, 0F, 0F, 80, 2, 9, 0F,0F, 0F, 0F, 0F, -4.9999F, 0F, 0F, -4.9999F, -8.9999F, 0F, 0F, -2.9999F, 0F, 0F, 0F, 0F, 3.9999F, 0F, 0F, 3.9999F, -7.9999F, 0F, 0F, 0F); // Box 441
		tailModel[29].setRotationPoint(135F, -63F, 0F);

		tailModel[30].addShapeBox(0F, 0F, 0F, 18, 11, 5, 0F,-8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -10F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F); // Box 505
		tailModel[30].setRotationPoint(160F, -123F, 0F);

		tailModel[31].addShapeBox(0F, 0F, 0F, 9, 7, 4, 0F,-3F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, -5F, -3F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F); // Box 506
		tailModel[31].setRotationPoint(169F, -130F, 0F);

		tailModel[32].addShapeBox(0F, 0F, 0F, 31, 19, 5, 0F,-13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F); // Box 507
		tailModel[32].setRotationPoint(147F, -112F, 0F);

		tailModel[33].addShapeBox(0F, 0F, 0F, 41, 12, 5, 0F,-10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F); // Box 508
		tailModel[33].setRotationPoint(137F, -93F, 0F);

		tailModel[34].addShapeBox(0F, 0F, 0F, 52, 9, 5, 0F,-11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F); // Box 509
		tailModel[34].setRotationPoint(126F, -81F, 0F);

		tailModel[35].addShapeBox(0F, 0F, 0F, 84, 14, 5, 0F,-32F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -34F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F); // Box 510
		tailModel[35].setRotationPoint(94F, -72F, 0F);

		tailModel[36].addShapeBox(0F, 0F, 0F, 29, 5, 14, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F); // Box 515
		tailModel[36].setRotationPoint(149F, -93F, 1F);

		tailModel[37].addShapeBox(0F, 0F, 0F, 27, 5, 71, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, -1F, 0F); // Box 516
		tailModel[37].setRotationPoint(151F, -93F, 15F);

		tailModel[38].addShapeBox(0F, 0F, 0F, 13, 5, 16, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -4F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -4F, -1.5F, 0F); // Box 517
		tailModel[38].setRotationPoint(165F, -93F, 86F);

		tailModel[39].addShapeBox(0F, 0F, 0F, 9, 3, 6, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -4F, -1F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -4F, -1F, -1F); // Box 518
		tailModel[39].setRotationPoint(169F, -92F, 102F);

		tailModel[40].addShapeBox(0F, 0F, 0F, 1, 20, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 791
		tailModel[40].setRotationPoint(66F, -55F, -8F);

		tailModel[41].addShapeBox(0F, 0F, 0F, 1, 4, 16, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 792
		tailModel[41].setRotationPoint(66F, -59F, -8F);

		tailModel[42].addShapeBox(0F, 0F, 0F, 1, 4, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 793
		tailModel[42].setRotationPoint(66F, -35F, -8F);
	}

	private void initbayModel_1()
	{
		bayModel[0] = new ModelRendererTurbo(this, 481, 1823, textureX, textureY); // Box 4
		bayModel[1] = new ModelRendererTurbo(this, 649, 1721, textureX, textureY); // Box 44
		bayModel[2] = new ModelRendererTurbo(this, 729, 1580, textureX, textureY); // Box 45
		bayModel[3] = new ModelRendererTurbo(this, 1209, 1922, textureX, textureY); // Box 118
		bayModel[4] = new ModelRendererTurbo(this, 1313, 1922, textureX, textureY); // Box 121
		bayModel[5] = new ModelRendererTurbo(this, 1409, 1922, textureX, textureY); // Box 122
		bayModel[6] = new ModelRendererTurbo(this, 1481, 1922, textureX, textureY); // Box 123
		bayModel[7] = new ModelRendererTurbo(this, 481, 1772, textureX, textureY); // Box 319
		bayModel[8] = new ModelRendererTurbo(this, 649, 1670, textureX, textureY); // Box 344
		bayModel[9] = new ModelRendererTurbo(this, 729, 1625, textureX, textureY); // Box 345
		bayModel[10] = new ModelRendererTurbo(this, 1209, 1874, textureX, textureY); // Box 411
		bayModel[11] = new ModelRendererTurbo(this, 1313, 1874, textureX, textureY); // Box 414
		bayModel[12] = new ModelRendererTurbo(this, 1409, 1874, textureX, textureY); // Box 415
		bayModel[13] = new ModelRendererTurbo(this, 1481, 1874, textureX, textureY); // Box 416
		bayModel[14] = new ModelRendererTurbo(this, 1481, 1874, textureX, textureY); // Box 790

		bayModel[0].addShapeBox(0F, 0F, 0F, 72, 15, 35, 0F,0F, 0F, -3F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -15F, -3F, 0F, -14F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 4
		bayModel[0].setRotationPoint(-118F, -15F, -35F);

		bayModel[1].addShapeBox(0F, 0F, 0F, 48, 15, 35, 0F,0F, 0F, 0F, 0F, 3F, -2F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -18F, -2F, 0F, -7F, 0F, 0F, 0F, 0F); // Box 44
		bayModel[1].setRotationPoint(-46F, -14F, -35F);

		bayModel[2].addShapeBox(0F, 0F, 0F, 15, 11, 33, 0F,0F, 0F, 0F, 0F, 0.9999F, -2.9999F, 0F, 0.9999F, 0F, 0F, 0F, 0F, 0F, -10.9999F, 0F, 0F, -11.9999F, -2.9999F, 0F, -2.9999F, 0F, 0F, 0F, 0F); // Box 45
		bayModel[2].setRotationPoint(2F, -17F, -33F);

		bayModel[3].addShapeBox(0F, 0F, 0F, 19, 15, 32, 0F,0F, 1F, -5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -16F, -5F, 0F, -14F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 118
		bayModel[3].setRotationPoint(-137F, -16F, -32F);

		bayModel[4].addShapeBox(0F, 0F, 0F, 17, 19, 27, 0F,0F, 0F, -2F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -19F, -2F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 121
		bayModel[4].setRotationPoint(-154F, -20F, -27F);

		bayModel[5].addShapeBox(0F, 0F, 0F, 9, 18, 25, 0F,0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -18F, -1F, 0F, -16F, 0F, 0F, 2F, 0F, 0F, 1F, 0F); // Box 122
		bayModel[5].setRotationPoint(-163F, -22F, -25F);

		bayModel[6].addShapeBox(0F, 0F, 0F, 15, 18, 24, 0F,0F, 0F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -18F, -2F, 0F, -17F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 123
		bayModel[6].setRotationPoint(-178F, -23F, -24F);

		bayModel[7].addShapeBox(0F, 0F, 0F, 72, 15, 35, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -14F, 0F, 0F, -15F, -3F); // Box 319
		bayModel[7].setRotationPoint(-118F, -15F, 0F);

		bayModel[8].addShapeBox(0F, 0F, 0F, 48, 15, 35, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -18F, -2F, 0F, -15F, 0F); // Box 344
		bayModel[8].setRotationPoint(-46F, -14F, 0F);

		bayModel[9].addShapeBox(0F, 0F, 0F, 15, 11, 33, 0F,0F, 0F, 0F, 0F, 0.9999F, 0F, 0F, 0.9999F, -2.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.9999F, 0F, 0F, -11.9999F, -2.9999F, 0F, -10.9999F, 0F); // Box 345
		bayModel[9].setRotationPoint(2F, -17F, 0F);

		bayModel[10].addShapeBox(0F, 0F, 0F, 19, 15, 32, 0F,0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, -5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -14F, 0F, 0F, -16F, -5F); // Box 411
		bayModel[10].setRotationPoint(-137F, -16F, 0F);

		bayModel[11].addShapeBox(0F, 0F, 0F, 17, 19, 27, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, -19F, -2F); // Box 414
		bayModel[11].setRotationPoint(-154F, -20F, 0F);

		bayModel[12].addShapeBox(0F, 0F, 0F, 9, 18, 25, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, -16F, 0F, 0F, -18F, -1F); // Box 415
		bayModel[12].setRotationPoint(-163F, -22F, 0F);

		bayModel[13].addShapeBox(0F, 0F, 0F, 15, 18, 24, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -17F, 0F, 0F, -18F, -2F); // Box 416
		bayModel[13].setRotationPoint(-178F, -23F, 0F);

		bayModel[14].addShapeBox(0F, 0F, 0F, 15, 18, 24, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -17F, 0F, 0F, -18F, -2F); // Box 790
		bayModel[14].setRotationPoint(-178F, -23F, 0F);
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 1, 881, textureX, textureY); // Box 161
		leftWingModel[1] = new ModelRendererTurbo(this, 129, 881, textureX, textureY); // Box 162
		leftWingModel[2] = new ModelRendererTurbo(this, 257, 881, textureX, textureY); // Box 163
		leftWingModel[3] = new ModelRendererTurbo(this, 377, 881, textureX, textureY); // Box 164
		leftWingModel[4] = new ModelRendererTurbo(this, 505, 881, textureX, textureY); // Box 165
		leftWingModel[5] = new ModelRendererTurbo(this, 625, 881, textureX, textureY); // Box 166
		leftWingModel[6] = new ModelRendererTurbo(this, 745, 881, textureX, textureY); // Box 167
		leftWingModel[7] = new ModelRendererTurbo(this, 865, 881, textureX, textureY); // Box 168
		leftWingModel[8] = new ModelRendererTurbo(this, 985, 881, textureX, textureY); // Box 169
		leftWingModel[9] = new ModelRendererTurbo(this, 1105, 881, textureX, textureY); // Box 170
		leftWingModel[10] = new ModelRendererTurbo(this, 1, 881, textureX, textureY); // Box 171
		leftWingModel[11] = new ModelRendererTurbo(this, 97, 881, textureX, textureY); // Box 172
		leftWingModel[12] = new ModelRendererTurbo(this, 113, 881, textureX, textureY); // Box 173
		leftWingModel[13] = new ModelRendererTurbo(this, 121, 881, textureX, textureY); // Box 174
		leftWingModel[14] = new ModelRendererTurbo(this, 225, 881, textureX, textureY); // Box 175
		leftWingModel[15] = new ModelRendererTurbo(this, 241, 881, textureX, textureY); // Box 176
		leftWingModel[16] = new ModelRendererTurbo(this, 345, 881, textureX, textureY); // Box 177
		leftWingModel[17] = new ModelRendererTurbo(this, 257, 881, textureX, textureY); // Box 178
		leftWingModel[18] = new ModelRendererTurbo(this, 369, 881, textureX, textureY); // Box 179
		leftWingModel[19] = new ModelRendererTurbo(this, 385, 881, textureX, textureY); // Box 180
		leftWingModel[20] = new ModelRendererTurbo(this, 473, 881, textureX, textureY); // Box 181
		leftWingModel[21] = new ModelRendererTurbo(this, 489, 881, textureX, textureY); // Box 182
		leftWingModel[22] = new ModelRendererTurbo(this, 497, 881, textureX, textureY); // Box 111
		leftWingModel[23] = new ModelRendererTurbo(this, 593, 881, textureX, textureY); // Box 112
		leftWingModel[24] = new ModelRendererTurbo(this, 713, 881, textureX, textureY); // Box 113
		leftWingModel[25] = new ModelRendererTurbo(this, 617, 881, textureX, textureY); // Box 114
		leftWingModel[26] = new ModelRendererTurbo(this, 737, 881, textureX, textureY); // Box 115
		leftWingModel[27] = new ModelRendererTurbo(this, 833, 881, textureX, textureY); // Box 116
		leftWingModel[28] = new ModelRendererTurbo(this, 873, 881, textureX, textureY); // Box 117
		leftWingModel[29] = new ModelRendererTurbo(this, 953, 881, textureX, textureY); // Box 118
		leftWingModel[30] = new ModelRendererTurbo(this, 977, 881, textureX, textureY); // Box 119
		leftWingModel[31] = new ModelRendererTurbo(this, 1089, 881, textureX, textureY); // Box 192
		leftWingModel[32] = new ModelRendererTurbo(this, 1, 730, textureX, textureY); // Box 193
		leftWingModel[33] = new ModelRendererTurbo(this, 1417, 881, textureX, textureY); // Box 194
		leftWingModel[34] = new ModelRendererTurbo(this, 1641, 905, textureX, textureY); // Box 195
		leftWingModel[35] = new ModelRendererTurbo(this, 225, 730, textureX, textureY); // Box 196
		leftWingModel[36] = new ModelRendererTurbo(this, 425, 730, textureX, textureY); // Box 197
		leftWingModel[37] = new ModelRendererTurbo(this, 1641, 730, textureX, textureY); // Box 198
		leftWingModel[38] = new ModelRendererTurbo(this, 825, 730, textureX, textureY); // Box 200
		leftWingModel[39] = new ModelRendererTurbo(this, 161, 730, textureX, textureY); // Box 201
		leftWingModel[40] = new ModelRendererTurbo(this, 1, 730, textureX, textureY); // Box 202
		leftWingModel[41] = new ModelRendererTurbo(this, 353, 730, textureX, textureY); // Box 203
		leftWingModel[42] = new ModelRendererTurbo(this, 1281, 881, textureX, textureY); // Box 204
		leftWingModel[43] = new ModelRendererTurbo(this, 1401, 881, textureX, textureY); // Box 205
		leftWingModel[44] = new ModelRendererTurbo(this, 17, 881, textureX, textureY); // Box 206
		leftWingModel[45] = new ModelRendererTurbo(this, 145, 881, textureX, textureY); // Box 207
		leftWingModel[46] = new ModelRendererTurbo(this, 273, 881, textureX, textureY); // Box 208
		leftWingModel[47] = new ModelRendererTurbo(this, 345, 881, textureX, textureY); // Box 209
		leftWingModel[48] = new ModelRendererTurbo(this, 521, 881, textureX, textureY); // Box 210
		leftWingModel[49] = new ModelRendererTurbo(this, 593, 881, textureX, textureY); // Box 211
		leftWingModel[50] = new ModelRendererTurbo(this, 689, 730, textureX, textureY); // Box 117
		leftWingModel[51] = new ModelRendererTurbo(this, 793, 730, textureX, textureY); // Box 118
		leftWingModel[52] = new ModelRendererTurbo(this, 425, 730, textureX, textureY); // Box 119
		leftWingModel[53] = new ModelRendererTurbo(this, 553, 730, textureX, textureY); // Box 120
		leftWingModel[54] = new ModelRendererTurbo(this, 249, 730, textureX, textureY); // Box 121
		leftWingModel[55] = new ModelRendererTurbo(this, 897, 730, textureX, textureY); // Box 122
		leftWingModel[56] = new ModelRendererTurbo(this, 1009, 730, textureX, textureY); // Box 123
		leftWingModel[57] = new ModelRendererTurbo(this, 1097, 730, textureX, textureY); // Box 124
		leftWingModel[58] = new ModelRendererTurbo(this, 1185, 730, textureX, textureY); // Box 125
		leftWingModel[59] = new ModelRendererTurbo(this, 1289, 730, textureX, textureY); // Box 238
		leftWingModel[60] = new ModelRendererTurbo(this, 1393, 730, textureX, textureY); // Box 239
		leftWingModel[61] = new ModelRendererTurbo(this, 1481, 730, textureX, textureY); // Box 240
		leftWingModel[62] = new ModelRendererTurbo(this, 1281, 881, textureX, textureY); // Box 782
		leftWingModel[63] = new ModelRendererTurbo(this, 1297, 881, textureX, textureY); // Box 783
		leftWingModel[64] = new ModelRendererTurbo(this, 1313, 881, textureX, textureY); // Box 784
		leftWingModel[65] = new ModelRendererTurbo(this, 1345, 881, textureX, textureY); // Box 785

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 30, 5, 30, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		leftWingModel[0].setRotationPoint(-128F, -107F, -62F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 30, 10, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		leftWingModel[1].setRotationPoint(-128F, -102F, -62F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 30, 5, 26, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		leftWingModel[2].setRotationPoint(-128F, -112F, -60F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 30, 5, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 164
		leftWingModel[3].setRotationPoint(-128F, -92F, -62F);

		leftWingModel[4].addShapeBox(0F, 0F, 0F, 30, 5, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F); // Box 165
		leftWingModel[4].setRotationPoint(-128F, -87F, -60F);

		leftWingModel[5].addShapeBox(0F, 0F, 0F, 26, 10, 30, 0F,0F, 0F, 0F, 0F, -4F, -14F, 0F, -4F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -14F, 0F, -4F, -14F, 0F, 0F, 0F); // Box 166
		leftWingModel[5].setRotationPoint(-98F, -102F, -62F);

		leftWingModel[6].addShapeBox(0F, 0F, 0F, 26, 5, 30, 0F,0F, 0F, -1.9999F, 0F, -8.9999F, -13.9999F, 0F, -8.9999F, -13.9999F, 0F, 0F, -1.9999F, 0F, 0F, 0F, 0F, 3.9999F, -13.9999F, 0F, 3.9999F, -13.9999F, 0F, 0F, 0F); // Box 167
		leftWingModel[6].setRotationPoint(-98F, -107F, -62F);

		leftWingModel[7].addShapeBox(0F, 0F, 0F, 26, 5, 30, 0F,0F, 4.9999F, -7.9999F, 0F, -8.9999F, -13.9999F, 0F, -8.9999F, -13.9999F, 0F, 4.9999F, -7.9999F, 0F, -4.9999F, -1.9999F, 0F, 3.9999F, -13.9999F, 0F, 3.9999F, -13.9999F, 0F, -4.9999F, -1.9999F); // Box 168
		leftWingModel[7].setRotationPoint(-98F, -107F, -62F);

		leftWingModel[8].addShapeBox(0F, 0F, 0F, 26, 5, 30, 0F,0F, 0F, 0F, 0F, 3.9999F, -13.9999F, 0F, 3.9999F, -13.9999F, 0F, 0F, 0F, 0F, 0F, -1.9999F, 0F, -8.9999F, -13.9999F, 0F, -8.9999F, -13.9999F, 0F, 0F, -1.9999F); // Box 169
		leftWingModel[8].setRotationPoint(-98F, -92F, -62F);

		leftWingModel[9].addShapeBox(0F, 0F, 0F, 26, 5, 30, 0F,0F, -4.9999F, -1.9999F, 0F, 3.9999F, -13.9999F, 0F, 3.9999F, -13.9999F, 0F, -4.9999F, -1.9999F, 0F, 4.9999F, -7.9999F, 0F, -8.9999F, -13.9999F, 0F, -8.9999F, -13.9999F, 0F, 4.9999F, -7.9999F); // Box 170
		leftWingModel[9].setRotationPoint(-98F, -92F, -62F);

		leftWingModel[10].addShapeBox(0F, 0F, 0F, 4, 10, 3, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F); // Box 171
		leftWingModel[10].setRotationPoint(-132F, -102F, -62F);

		leftWingModel[11].addShapeBox(0F, 0F, 0F, 4, 5, 3, 0F,0F, -1F, -3F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, -1F, 3F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F); // Box 172
		leftWingModel[11].setRotationPoint(-132F, -107F, -62F);

		leftWingModel[12].addShapeBox(0F, 0F, 0F, 4, 5, 3, 0F,0F, -1F, -5F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, -1F, 5F, 0F, 1F, 1F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 1F, -1F); // Box 173
		leftWingModel[12].setRotationPoint(-132F, -112F, -58F);

		leftWingModel[13].addShapeBox(0F, 0F, 0F, 4, 3, 14, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F); // Box 174
		leftWingModel[13].setRotationPoint(-132F, -112F, -54F);

		leftWingModel[14].addShapeBox(0F, 0F, 0F, 4, 5, 3, 0F,0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, -1F, -3F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, -1F, 3F); // Box 175
		leftWingModel[14].setRotationPoint(-132F, -92F, -62F);

		leftWingModel[15].addShapeBox(0F, 0F, 0F, 4, 5, 3, 0F,0F, 1F, 1F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 1F, -1F, 0F, -1F, -5F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, -1F, 5F); // Box 176
		leftWingModel[15].setRotationPoint(-132F, -87F, -58F);

		leftWingModel[16].addShapeBox(0F, 0F, 0F, 4, 3, 14, 0F,0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 177
		leftWingModel[16].setRotationPoint(-132F, -85F, -54F);

		leftWingModel[17].addShapeBox(0F, 0F, 0F, 4, 10, 3, 0F,0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 178
		leftWingModel[17].setRotationPoint(-132F, -102F, -35F);

		leftWingModel[18].addShapeBox(0F, 0F, 0F, 4, 5, 3, 0F,0F, -1F, 3F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, -1F, -3F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F); // Box 179
		leftWingModel[18].setRotationPoint(-132F, -107F, -35F);

		leftWingModel[19].addShapeBox(0F, 0F, 0F, 4, 5, 3, 0F,0F, -1F, 5F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, -1F, -5F, 0F, 1F, -1F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 1F, 1F); // Box 180
		leftWingModel[19].setRotationPoint(-132F, -112F, -39F);

		leftWingModel[20].addShapeBox(0F, 0F, 0F, 4, 5, 3, 0F,0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, -1F, 3F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, -1F, -3F); // Box 181
		leftWingModel[20].setRotationPoint(-132F, -92F, -35F);

		leftWingModel[21].addShapeBox(0F, 0F, 0F, 4, 5, 3, 0F,0F, 1F, -1F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 1F, 1F, 0F, -1F, 5F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, -1F, -5F); // Box 182
		leftWingModel[21].setRotationPoint(-132F, -87F, -39F);

		leftWingModel[22].addShapeBox(0F, 0F, 0F, 6, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		leftWingModel[22].setRotationPoint(-132F, -98.5F, -51.5F);

		leftWingModel[23].addShapeBox(0F, 0F, 0F, 6, 3, 9, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		leftWingModel[23].setRotationPoint(-132F, -101.5F, -51.5F);

		leftWingModel[24].addShapeBox(0F, 0F, 0F, 6, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 113
		leftWingModel[24].setRotationPoint(-132F, -95.5F, -51.5F);

		leftWingModel[25].addShapeBox(0F, 0F, 0F, 10, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		leftWingModel[25].setRotationPoint(-142F, -98F, -50F);

		leftWingModel[26].addShapeBox(0F, 0F, 0F, 10, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		leftWingModel[26].setRotationPoint(-142F, -100F, -50F);

		leftWingModel[27].addShapeBox(0F, 0F, 0F, 10, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 116
		leftWingModel[27].setRotationPoint(-142F, -96F, -50F);

		leftWingModel[28].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 117
		leftWingModel[28].setRotationPoint(-145F, -98F, -50F);

		leftWingModel[29].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, -1.9999F, -1.9999F, 0F, 0F, -1.9999F, 0F, 0F, -1.9999F, 0F, -1.9999F, -1.9999F, 0F, 0F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9999F); // Box 118
		leftWingModel[29].setRotationPoint(-145F, -100F, -50F);

		leftWingModel[30].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, 0F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9999F, 0F, -1.9999F, -1.9999F, 0F, 0F, -1.9999F, 0F, 0F, -1.9999F, 0F, -1.9999F, -1.9999F); // Box 119
		leftWingModel[30].setRotationPoint(-145F, -96F, -50F);

		leftWingModel[31].addShapeBox(0F, 0F, 0F, 27, 13, 135, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F); // Box 192
		leftWingModel[31].setRotationPoint(-99F, -100F, -135F);

		leftWingModel[32].addShapeBox(0F, 0F, 0F, 44, 17, 67, 0F,0F, 1F, 0F, 0F, -9F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, -3F, 0F); // Box 193
		leftWingModel[32].setRotationPoint(-72F, -100F, -202F);

		leftWingModel[33].addShapeBox(0F, 0F, 0F, 44, 19, 135, 0F,0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 194
		leftWingModel[33].setRotationPoint(-72F, -100F, -135F);

		leftWingModel[34].addShapeBox(0F, 0F, 0F, 30, 9, 135, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 195
		leftWingModel[34].setRotationPoint(-28F, -90F, -135F);

		leftWingModel[35].addShapeBox(0F, 0F, 0F, 30, 9, 67, 0F,0F, 1F, 0F, -9F, -3F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -9F, -5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 196
		leftWingModel[35].setRotationPoint(-28F, -90F, -202F);

		leftWingModel[36].addShapeBox(0F, 0F, 0F, 27, 15, 67, 0F,-3F, -4F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -6F, 0F, -3F, -6F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 197
		leftWingModel[36].setRotationPoint(-99F, -101F, -202F);

		leftWingModel[37].addShapeBox(0F, 0F, 0F, 44, 19, 135, 0F,0F, 0F, 0F, -15F, -6F, 0F, 0F, -13F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, -15F, -7F, 0F, 0F, 1F, 0F, 0F, -2F, 0F); // Box 198
		leftWingModel[37].setRotationPoint(-72F, -104F, -337F);

		leftWingModel[38].addShapeBox(0F, 0F, 0F, 24, 15, 135, 0F,-6F, -4F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -7F, 0F, -6F, -6F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -3F, 0F); // Box 200
		leftWingModel[38].setRotationPoint(-96F, -104F, -337F);

		leftWingModel[39].addShapeBox(0F, 0F, 0F, 29, 15, 14, 0F,0F, -4F, 0F, 0F, -7F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 201
		leftWingModel[39].setRotationPoint(-72F, -104F, -351F);

		leftWingModel[40].addShapeBox(0F, 0F, 0F, 18, 15, 14, 0F,-1F, -5F, -7F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, -7F, -7F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Box 202
		leftWingModel[40].setRotationPoint(-90F, -104F, -351F);

		leftWingModel[41].addShapeBox(0F, 0F, 0F, 18, 6, 14, 0F,0F, -1F, 0F, -2F, -3F, -1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 203
		leftWingModel[41].setRotationPoint(-43F, -98F, -351F);

		leftWingModel[42].addShapeBox(0F, 0F, 0F, 4, 4, 55, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -57F, 1F, 0F, -57F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 57F, 0F, 0F, 57F, 0F); // Box 204
		leftWingModel[42].setRotationPoint(-82F, -92F, -88F);

		leftWingModel[43].addShapeBox(0F, 0F, 0F, 4, 4, 54, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -57F, 1F, 0F, -57F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 57F, 0F, 0F, 57F, 0F); // Box 205
		leftWingModel[43].setRotationPoint(-45F, -92F, -88F);

		leftWingModel[44].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,-3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		leftWingModel[44].setRotationPoint(-98F, -114F, -52F);

		leftWingModel[45].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,-4F, 0F, 0F, 2F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		leftWingModel[45].setRotationPoint(-98F, -114F, -53F);

		leftWingModel[46].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,-3F, 0F, 0F, 3F, 0F, 0F, 2F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 208
		leftWingModel[46].setRotationPoint(-98F, -114F, -51F);

		leftWingModel[47].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,-3F, 0F, 0F, 3F, 0F, 0F, 2F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 209
		leftWingModel[47].setRotationPoint(-98F, -114F, -42F);

		leftWingModel[48].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,-3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		leftWingModel[48].setRotationPoint(-98F, -114F, -43F);

		leftWingModel[49].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,-4F, 0F, 0F, 2F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
		leftWingModel[49].setRotationPoint(-98F, -114F, -44F);

		leftWingModel[50].addShapeBox(0F, 0F, 0F, 29, 11, 20, 0F,0F, 0F, -9.9999F, 0F, -4.9999F, -9.9999F, 0F, -4.9999F, -9.9999F, 0F, 0F, -9.9999F, 0F, -2.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.9999F, 0F); // Box 117
		leftWingModel[50].setRotationPoint(-75F, -55F, -319F);

		leftWingModel[51].addShapeBox(0F, 0F, 0F, 29, 10, 20, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, -2F, -10F); // Box 118
		leftWingModel[51].setRotationPoint(-75F, -47F, -319F);

		leftWingModel[52].addShapeBox(0F, 0F, 0F, 11, 8, 20, 0F,0F, -1F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, -1F, -10F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -3F); // Box 119
		leftWingModel[52].setRotationPoint(-86F, -55F, -319F);

		leftWingModel[53].addShapeBox(0F, 0F, 0F, 11, 10, 20, 0F,0F, 0F, -3F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, -5F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, -5F, -10F); // Box 120
		leftWingModel[53].setRotationPoint(-86F, -49F, -319F);

		leftWingModel[54].addShapeBox(0F, 0F, 0F, 6, 5, 14, 0F,0F, -2.9999F, -6.9999F, 0F, 0F, -6.9999F, 0F, 0F, -6.9999F, 0F, -2.9999F, -6.9999F, 0F, -1.9999F, -6.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9999F, -6.9999F); // Box 121
		leftWingModel[54].setRotationPoint(-92F, -54F, -316F);

		leftWingModel[55].addShapeBox(0F, 0F, 0F, 6, 7, 14, 0F,0F, 0F, -6.9999F, 0F, -1.9999F, 0F, 0F, -1.9999F, 0F, 0F, 0F, -6.9999F, 0F, -6.9999F, -6.9999F, 0F, 0F, -6.9999F, 0F, 0F, -6.9999F, 0F, -6.9999F, -6.9999F); // Box 122
		leftWingModel[55].setRotationPoint(-92F, -51F, -316F);

		leftWingModel[56].addShapeBox(0F, 0F, 0F, 23, 7, 20, 0F,0F, 0F, 0F, 0F, -2.9999F, -9.9999F, 0F, -2.9999F, -9.9999F, 0F, 0F, 0F, 0F, 0F, -9.9999F, 0F, -3.9999F, -9.9999F, 0F, -3.9999F, -9.9999F, 0F, 0F, -9.9999F); // Box 123
		leftWingModel[56].setRotationPoint(-46F, -44F, -319F);

		leftWingModel[57].addShapeBox(0F, 0F, 0F, 23, 9, 20, 0F,0F, 0F, -9.9999F, 0F, -8.9999F, -9.9999F, 0F, -8.9999F, -9.9999F, 0F, 0F, -9.9999F, 0F, -2.9999F, 0F, 0F, 0F, -9.9999F, 0F, 0F, -9.9999F, 0F, -2.9999F, 0F); // Box 124
		leftWingModel[57].setRotationPoint(-46F, -50F, -319F);

		leftWingModel[58].addShapeBox(0F, 0F, 0F, 48, 46, 2, 0F,-15F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -7F, 0F, 0F, -19.5F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F); // Box 125
		leftWingModel[58].setRotationPoint(-86F, -95F, -311F);

		leftWingModel[59].addShapeBox(0F, 0F, 0F, 48, 46, 2, 0F,-8F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -19.5F, 0F, 0F, -7F, 0F, 0F); // Box 238
		leftWingModel[59].setRotationPoint(-86F, -95F, -309F);

		leftWingModel[60].addShapeBox(0F, 0F, 0F, 2, 2, 39, 0F,-7F, 0F, 0F, 7F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, 0F, 40F, 0F, 0F, 40F, 0F); // Box 239
		leftWingModel[60].setRotationPoint(-71F, -95F, -350F);

		leftWingModel[61].addShapeBox(0F, 0F, 0F, 2, 2, 39, 0F,5F, 0F, 0F, -5F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, 0F, 40F, 0F, 0F, 40F, 0F); // Box 240
		leftWingModel[61].setRotationPoint(-59F, -95F, -350F);

		leftWingModel[62].addShapeBox(0F, -13F, -2F, 1, 26, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 782
		leftWingModel[62].setRotationPoint(-129F, -97F, -47F);

		leftWingModel[63].addShapeBox(0F, -13F, -2F, 1, 26, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 783
		leftWingModel[63].setRotationPoint(-129F, -97F, -47F);
		leftWingModel[63].rotateAngleX = 1.57079633F;

		leftWingModel[64].addShapeBox(0F, -13F, -2F, 1, 26, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 784
		leftWingModel[64].setRotationPoint(-129F, -97F, -47F);
		leftWingModel[64].rotateAngleX = 0.78539816F;

		leftWingModel[65].addShapeBox(0F, -13F, -2F, 1, 26, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 785
		leftWingModel[65].setRotationPoint(-129F, -97F, -47F);
		leftWingModel[65].rotateAngleX = -0.78539816F;
	}

	private void initrightWingModel_1()
	{
		rightWingModel[0] = new ModelRendererTurbo(this, 1, 1191, textureX, textureY); // Box 451
		rightWingModel[1] = new ModelRendererTurbo(this, 129, 1191, textureX, textureY); // Box 452
		rightWingModel[2] = new ModelRendererTurbo(this, 257, 1191, textureX, textureY); // Box 453
		rightWingModel[3] = new ModelRendererTurbo(this, 377, 1191, textureX, textureY); // Box 454
		rightWingModel[4] = new ModelRendererTurbo(this, 505, 1191, textureX, textureY); // Box 455
		rightWingModel[5] = new ModelRendererTurbo(this, 625, 1191, textureX, textureY); // Box 456
		rightWingModel[6] = new ModelRendererTurbo(this, 745, 1191, textureX, textureY); // Box 457
		rightWingModel[7] = new ModelRendererTurbo(this, 865, 1191, textureX, textureY); // Box 458
		rightWingModel[8] = new ModelRendererTurbo(this, 985, 1191, textureX, textureY); // Box 459
		rightWingModel[9] = new ModelRendererTurbo(this, 1105, 1191, textureX, textureY); // Box 460
		rightWingModel[10] = new ModelRendererTurbo(this, 1, 1191, textureX, textureY); // Box 461
		rightWingModel[11] = new ModelRendererTurbo(this, 97, 1191, textureX, textureY); // Box 462
		rightWingModel[12] = new ModelRendererTurbo(this, 113, 1191, textureX, textureY); // Box 463
		rightWingModel[13] = new ModelRendererTurbo(this, 121, 1191, textureX, textureY); // Box 464
		rightWingModel[14] = new ModelRendererTurbo(this, 225, 1191, textureX, textureY); // Box 465
		rightWingModel[15] = new ModelRendererTurbo(this, 241, 1191, textureX, textureY); // Box 466
		rightWingModel[16] = new ModelRendererTurbo(this, 345, 1191, textureX, textureY); // Box 467
		rightWingModel[17] = new ModelRendererTurbo(this, 257, 1191, textureX, textureY); // Box 468
		rightWingModel[18] = new ModelRendererTurbo(this, 369, 1191, textureX, textureY); // Box 469
		rightWingModel[19] = new ModelRendererTurbo(this, 385, 1191, textureX, textureY); // Box 470
		rightWingModel[20] = new ModelRendererTurbo(this, 473, 1191, textureX, textureY); // Box 471
		rightWingModel[21] = new ModelRendererTurbo(this, 489, 1191, textureX, textureY); // Box 472
		rightWingModel[22] = new ModelRendererTurbo(this, 497, 1191, textureX, textureY); // Box 473
		rightWingModel[23] = new ModelRendererTurbo(this, 593, 1191, textureX, textureY); // Box 474
		rightWingModel[24] = new ModelRendererTurbo(this, 713, 1191, textureX, textureY); // Box 475
		rightWingModel[25] = new ModelRendererTurbo(this, 617, 1191, textureX, textureY); // Box 476
		rightWingModel[26] = new ModelRendererTurbo(this, 737, 1191, textureX, textureY); // Box 477
		rightWingModel[27] = new ModelRendererTurbo(this, 833, 1191, textureX, textureY); // Box 478
		rightWingModel[28] = new ModelRendererTurbo(this, 873, 1191, textureX, textureY); // Box 479
		rightWingModel[29] = new ModelRendererTurbo(this, 953, 1191, textureX, textureY); // Box 480
		rightWingModel[30] = new ModelRendererTurbo(this, 977, 1191, textureX, textureY); // Box 481
		rightWingModel[31] = new ModelRendererTurbo(this, 1089, 1191, textureX, textureY); // Box 482
		rightWingModel[32] = new ModelRendererTurbo(this, 1, 1036, textureX, textureY); // Box 483
		rightWingModel[33] = new ModelRendererTurbo(this, 1417, 1191, textureX, textureY); // Box 484
		rightWingModel[34] = new ModelRendererTurbo(this, 1641, 1215, textureX, textureY); // Box 485
		rightWingModel[35] = new ModelRendererTurbo(this, 225, 1036, textureX, textureY); // Box 486
		rightWingModel[36] = new ModelRendererTurbo(this, 425, 1036, textureX, textureY); // Box 487
		rightWingModel[37] = new ModelRendererTurbo(this, 481, 1036, textureX, textureY); // Box 488
		rightWingModel[38] = new ModelRendererTurbo(this, 1185, 1036, textureX, textureY); // Box 490
		rightWingModel[39] = new ModelRendererTurbo(this, 161, 1036, textureX, textureY); // Box 491
		rightWingModel[40] = new ModelRendererTurbo(this, 1, 1036, textureX, textureY); // Box 492
		rightWingModel[41] = new ModelRendererTurbo(this, 353, 1036, textureX, textureY); // Box 493
		rightWingModel[42] = new ModelRendererTurbo(this, 1281, 1191, textureX, textureY); // Box 494
		rightWingModel[43] = new ModelRendererTurbo(this, 1401, 1191, textureX, textureY); // Box 495
		rightWingModel[44] = new ModelRendererTurbo(this, 17, 1191, textureX, textureY); // Box 496
		rightWingModel[45] = new ModelRendererTurbo(this, 145, 1191, textureX, textureY); // Box 497
		rightWingModel[46] = new ModelRendererTurbo(this, 273, 1191, textureX, textureY); // Box 498
		rightWingModel[47] = new ModelRendererTurbo(this, 345, 1191, textureX, textureY); // Box 499
		rightWingModel[48] = new ModelRendererTurbo(this, 521, 1191, textureX, textureY); // Box 500
		rightWingModel[49] = new ModelRendererTurbo(this, 593, 1191, textureX, textureY); // Box 501
		rightWingModel[50] = new ModelRendererTurbo(this, 705, 1036, textureX, textureY); // Box 519
		rightWingModel[51] = new ModelRendererTurbo(this, 809, 1036, textureX, textureY); // Box 520
		rightWingModel[52] = new ModelRendererTurbo(this, 425, 1036, textureX, textureY); // Box 521
		rightWingModel[53] = new ModelRendererTurbo(this, 553, 1036, textureX, textureY); // Box 522
		rightWingModel[54] = new ModelRendererTurbo(this, 249, 1036, textureX, textureY); // Box 523
		rightWingModel[55] = new ModelRendererTurbo(this, 913, 1036, textureX, textureY); // Box 524
		rightWingModel[56] = new ModelRendererTurbo(this, 1049, 1036, textureX, textureY); // Box 525
		rightWingModel[57] = new ModelRendererTurbo(this, 1137, 1036, textureX, textureY); // Box 526
		rightWingModel[58] = new ModelRendererTurbo(this, 1369, 1036, textureX, textureY); // Box 527
		rightWingModel[59] = new ModelRendererTurbo(this, 1473, 1036, textureX, textureY); // Box 528
		rightWingModel[60] = new ModelRendererTurbo(this, 1185, 1036, textureX, textureY); // Box 529
		rightWingModel[61] = new ModelRendererTurbo(this, 1577, 1036, textureX, textureY); // Box 530
		rightWingModel[62] = new ModelRendererTurbo(this, 1281, 1191, textureX, textureY); // Box 786
		rightWingModel[63] = new ModelRendererTurbo(this, 1297, 1191, textureX, textureY); // Box 787
		rightWingModel[64] = new ModelRendererTurbo(this, 1313, 1191, textureX, textureY); // Box 788
		rightWingModel[65] = new ModelRendererTurbo(this, 1345, 1191, textureX, textureY); // Box 789

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 30, 5, 30, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 451
		rightWingModel[0].setRotationPoint(-128F, -107F, 32F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 30, 10, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 452
		rightWingModel[1].setRotationPoint(-128F, -102F, 32F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 30, 5, 26, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 453
		rightWingModel[2].setRotationPoint(-128F, -112F, 34F);

		rightWingModel[3].addShapeBox(0F, 0F, 0F, 30, 5, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 454
		rightWingModel[3].setRotationPoint(-128F, -92F, 32F);

		rightWingModel[4].addShapeBox(0F, 0F, 0F, 30, 5, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F); // Box 455
		rightWingModel[4].setRotationPoint(-128F, -87F, 34F);

		rightWingModel[5].addShapeBox(0F, 0F, 0F, 26, 10, 30, 0F,0F, 0F, 0F, 0F, -4F, -14F, 0F, -4F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -14F, 0F, -4F, -14F, 0F, 0F, 0F); // Box 456
		rightWingModel[5].setRotationPoint(-98F, -102F, 32F);

		rightWingModel[6].addShapeBox(0F, 0F, 0F, 26, 5, 30, 0F,0F, 0F, -1.9999F, 0F, -8.9999F, -13.9999F, 0F, -8.9999F, -13.9999F, 0F, 0F, -1.9999F, 0F, 0F, 0F, 0F, 3.9999F, -13.9999F, 0F, 3.9999F, -13.9999F, 0F, 0F, 0F); // Box 457
		rightWingModel[6].setRotationPoint(-98F, -107F, 32F);

		rightWingModel[7].addShapeBox(0F, 0F, 0F, 26, 5, 30, 0F,0F, 4.9999F, -7.9999F, 0F, -8.9999F, -13.9999F, 0F, -8.9999F, -13.9999F, 0F, 4.9999F, -7.9999F, 0F, -4.9999F, -1.9999F, 0F, 3.9999F, -13.9999F, 0F, 3.9999F, -13.9999F, 0F, -4.9999F, -1.9999F); // Box 458
		rightWingModel[7].setRotationPoint(-98F, -107F, 32F);

		rightWingModel[8].addShapeBox(0F, 0F, 0F, 26, 5, 30, 0F,0F, 0F, 0F, 0F, 3.9999F, -13.9999F, 0F, 3.9999F, -13.9999F, 0F, 0F, 0F, 0F, 0F, -1.9999F, 0F, -8.9999F, -13.9999F, 0F, -8.9999F, -13.9999F, 0F, 0F, -1.9999F); // Box 459
		rightWingModel[8].setRotationPoint(-98F, -92F, 32F);

		rightWingModel[9].addShapeBox(0F, 0F, 0F, 26, 5, 30, 0F,0F, -4.9999F, -1.9999F, 0F, 3.9999F, -13.9999F, 0F, 3.9999F, -13.9999F, 0F, -4.9999F, -1.9999F, 0F, 4.9999F, -7.9999F, 0F, -8.9999F, -13.9999F, 0F, -8.9999F, -13.9999F, 0F, 4.9999F, -7.9999F); // Box 460
		rightWingModel[9].setRotationPoint(-98F, -92F, 32F);

		rightWingModel[10].addShapeBox(0F, 0F, 0F, 4, 10, 3, 0F,0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 461
		rightWingModel[10].setRotationPoint(-132F, -102F, 59F);

		rightWingModel[11].addShapeBox(0F, 0F, 0F, 4, 5, 3, 0F,0F, -1F, 3F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, -1F, -3F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F); // Box 462
		rightWingModel[11].setRotationPoint(-132F, -107F, 59F);

		rightWingModel[12].addShapeBox(0F, 0F, 0F, 4, 5, 3, 0F,0F, -1F, 5F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, -1F, -5F, 0F, 1F, -1F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 1F, 1F); // Box 463
		rightWingModel[12].setRotationPoint(-132F, -112F, 55F);

		rightWingModel[13].addShapeBox(0F, 0F, 0F, 4, 3, 14, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F); // Box 464
		rightWingModel[13].setRotationPoint(-132F, -112F, 40F);

		rightWingModel[14].addShapeBox(0F, 0F, 0F, 4, 5, 3, 0F,0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, -1F, 3F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, -1F, -3F); // Box 465
		rightWingModel[14].setRotationPoint(-132F, -92F, 59F);

		rightWingModel[15].addShapeBox(0F, 0F, 0F, 4, 5, 3, 0F,0F, 1F, -1F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 1F, 1F, 0F, -1F, 5F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, -1F, -5F); // Box 466
		rightWingModel[15].setRotationPoint(-132F, -87F, 55F);

		rightWingModel[16].addShapeBox(0F, 0F, 0F, 4, 3, 14, 0F,0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 467
		rightWingModel[16].setRotationPoint(-132F, -85F, 40F);

		rightWingModel[17].addShapeBox(0F, 0F, 0F, 4, 10, 3, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F); // Box 468
		rightWingModel[17].setRotationPoint(-132F, -102F, 32F);

		rightWingModel[18].addShapeBox(0F, 0F, 0F, 4, 5, 3, 0F,0F, -1F, -3F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, -1F, 3F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F); // Box 469
		rightWingModel[18].setRotationPoint(-132F, -107F, 32F);

		rightWingModel[19].addShapeBox(0F, 0F, 0F, 4, 5, 3, 0F,0F, -1F, -5F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, -1F, 5F, 0F, 1F, 1F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 1F, -1F); // Box 470
		rightWingModel[19].setRotationPoint(-132F, -112F, 36F);

		rightWingModel[20].addShapeBox(0F, 0F, 0F, 4, 5, 3, 0F,0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, -1F, -3F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, -1F, 3F); // Box 471
		rightWingModel[20].setRotationPoint(-132F, -92F, 32F);

		rightWingModel[21].addShapeBox(0F, 0F, 0F, 4, 5, 3, 0F,0F, 1F, 1F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 1F, -1F, 0F, -1F, -5F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, -1F, 5F); // Box 472
		rightWingModel[21].setRotationPoint(-132F, -87F, 36F);

		rightWingModel[22].addShapeBox(0F, 0F, 0F, 6, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 473
		rightWingModel[22].setRotationPoint(-132F, -98.5F, 42.5F);

		rightWingModel[23].addShapeBox(0F, 0F, 0F, 6, 3, 9, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 474
		rightWingModel[23].setRotationPoint(-132F, -101.5F, 42.5F);

		rightWingModel[24].addShapeBox(0F, 0F, 0F, 6, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 475
		rightWingModel[24].setRotationPoint(-132F, -95.5F, 42.5F);

		rightWingModel[25].addShapeBox(0F, 0F, 0F, 10, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 476
		rightWingModel[25].setRotationPoint(-142F, -98F, 44F);

		rightWingModel[26].addShapeBox(0F, 0F, 0F, 10, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 477
		rightWingModel[26].setRotationPoint(-142F, -100F, 44F);

		rightWingModel[27].addShapeBox(0F, 0F, 0F, 10, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 478
		rightWingModel[27].setRotationPoint(-142F, -96F, 44F);

		rightWingModel[28].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 479
		rightWingModel[28].setRotationPoint(-145F, -98F, 44F);

		rightWingModel[29].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, -1.9999F, -1.9999F, 0F, 0F, -1.9999F, 0F, 0F, -1.9999F, 0F, -1.9999F, -1.9999F, 0F, 0F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9999F); // Box 480
		rightWingModel[29].setRotationPoint(-145F, -100F, 44F);

		rightWingModel[30].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, 0F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9999F, 0F, -1.9999F, -1.9999F, 0F, 0F, -1.9999F, 0F, 0F, -1.9999F, 0F, -1.9999F, -1.9999F); // Box 481
		rightWingModel[30].setRotationPoint(-145F, -96F, 44F);

		rightWingModel[31].addShapeBox(0F, 0F, 0F, 27, 13, 135, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -3F, 0F); // Box 482
		rightWingModel[31].setRotationPoint(-99F, -100F, 0F);

		rightWingModel[32].addShapeBox(0F, 0F, 0F, 44, 17, 67, 0F,0F, 0F, 0F, 0F, -10F, 0F, 0F, -9F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -4F, 0F); // Box 483
		rightWingModel[32].setRotationPoint(-72F, -100F, 135F);

		rightWingModel[33].addShapeBox(0F, 0F, 0F, 44, 19, 135, 0F,0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 484
		rightWingModel[33].setRotationPoint(-72F, -100F, 0F);

		rightWingModel[34].addShapeBox(0F, 0F, 0F, 30, 9, 135, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 485
		rightWingModel[34].setRotationPoint(-28F, -90F, 0F);

		rightWingModel[35].addShapeBox(0F, 0F, 0F, 30, 9, 67, 0F,0F, 0F, 0F, 0F, -6F, 0F, -9F, -3F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -9F, -5F, 0F, 0F, -3F, 0F); // Box 486
		rightWingModel[35].setRotationPoint(-28F, -90F, 135F);

		rightWingModel[36].addShapeBox(0F, 0F, 0F, 27, 15, 67, 0F,0F, -6F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -3F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, -6F, 0F); // Box 487
		rightWingModel[36].setRotationPoint(-99F, -101F, 135F);

		rightWingModel[37].addShapeBox(0F, 0F, 0F, 44, 19, 135, 0F,0F, -3F, 0F, 0F, -13F, 0F, -15F, -6F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, -15F, -7F, 0F, 0F, -4F, 0F); // Box 488
		rightWingModel[37].setRotationPoint(-72F, -104F, 202F);

		rightWingModel[38].addShapeBox(0F, 0F, 0F, 24, 15, 135, 0F,0F, -7F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -6F, -4F, 0F, 0F, -3F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, -6F, -6F, 0F); // Box 490
		rightWingModel[38].setRotationPoint(-96F, -104F, 202F);

		rightWingModel[39].addShapeBox(0F, 0F, 0F, 29, 15, 14, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -7F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 491
		rightWingModel[39].setRotationPoint(-72F, -104F, 337F);

		rightWingModel[40].addShapeBox(0F, 0F, 0F, 18, 15, 14, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, -5F, -7F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, -7F, -7F); // Box 492
		rightWingModel[40].setRotationPoint(-90F, -104F, 337F);

		rightWingModel[41].addShapeBox(0F, 0F, 0F, 18, 6, 14, 0F,0F, 0F, 0F, 0F, -3F, 0F, -2F, -3F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, -1F, 0F, -1F, 0F); // Box 493
		rightWingModel[41].setRotationPoint(-43F, -98F, 337F);

		rightWingModel[42].addShapeBox(0F, 0F, 0F, 4, 4, 55, 0F,0F, -57F, 1F, 0F, -57F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 57F, 0F, 0F, 57F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 494
		rightWingModel[42].setRotationPoint(-82F, -92F, 33F);

		rightWingModel[43].addShapeBox(0F, 0F, 0F, 4, 4, 54, 0F,0F, -57F, 1F, 0F, -57F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 57F, 0F, 0F, 57F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 495
		rightWingModel[43].setRotationPoint(-45F, -92F, 34F);

		rightWingModel[44].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,-3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 496
		rightWingModel[44].setRotationPoint(-98F, -114F, 51F);

		rightWingModel[45].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,-3F, 0F, 0F, 3F, 0F, 0F, 2F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 497
		rightWingModel[45].setRotationPoint(-98F, -114F, 52F);

		rightWingModel[46].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,-4F, 0F, 0F, 2F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 498
		rightWingModel[46].setRotationPoint(-98F, -114F, 50F);

		rightWingModel[47].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,-4F, 0F, 0F, 2F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 499
		rightWingModel[47].setRotationPoint(-98F, -114F, 41F);

		rightWingModel[48].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,-3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 500
		rightWingModel[48].setRotationPoint(-98F, -114F, 42F);

		rightWingModel[49].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,-3F, 0F, 0F, 3F, 0F, 0F, 2F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 501
		rightWingModel[49].setRotationPoint(-98F, -114F, 43F);

		rightWingModel[50].addShapeBox(0F, 0F, 0F, 29, 11, 20, 0F,0F, 0F, -9.9999F, 0F, -4.9999F, -9.9999F, 0F, -4.9999F, -9.9999F, 0F, 0F, -9.9999F, 0F, -2.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.9999F, 0F); // Box 519
		rightWingModel[50].setRotationPoint(-75F, -55F, 299F);

		rightWingModel[51].addShapeBox(0F, 0F, 0F, 29, 10, 20, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, -2F, -10F); // Box 520
		rightWingModel[51].setRotationPoint(-75F, -47F, 299F);

		rightWingModel[52].addShapeBox(0F, 0F, 0F, 11, 8, 20, 0F,0F, -1F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, -1F, -10F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -3F); // Box 521
		rightWingModel[52].setRotationPoint(-86F, -55F, 299F);

		rightWingModel[53].addShapeBox(0F, 0F, 0F, 11, 10, 20, 0F,0F, 0F, -3F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, -5F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, -5F, -10F); // Box 522
		rightWingModel[53].setRotationPoint(-86F, -49F, 299F);

		rightWingModel[54].addShapeBox(0F, 0F, 0F, 6, 5, 14, 0F,0F, -2.9999F, -6.9999F, 0F, 0F, -6.9999F, 0F, 0F, -6.9999F, 0F, -2.9999F, -6.9999F, 0F, -1.9999F, -6.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9999F, -6.9999F); // Box 523
		rightWingModel[54].setRotationPoint(-92F, -54F, 302F);

		rightWingModel[55].addShapeBox(0F, 0F, 0F, 6, 7, 14, 0F,0F, 0F, -6.9999F, 0F, -1.9999F, 0F, 0F, -1.9999F, 0F, 0F, 0F, -6.9999F, 0F, -6.9999F, -6.9999F, 0F, 0F, -6.9999F, 0F, 0F, -6.9999F, 0F, -6.9999F, -6.9999F); // Box 524
		rightWingModel[55].setRotationPoint(-92F, -51F, 302F);

		rightWingModel[56].addShapeBox(0F, 0F, 0F, 23, 7, 20, 0F,0F, 0F, 0F, 0F, -2.9999F, -9.9999F, 0F, -2.9999F, -9.9999F, 0F, 0F, 0F, 0F, 0F, -9.9999F, 0F, -3.9999F, -9.9999F, 0F, -3.9999F, -9.9999F, 0F, 0F, -9.9999F); // Box 525
		rightWingModel[56].setRotationPoint(-46F, -44F, 299F);

		rightWingModel[57].addShapeBox(0F, 0F, 0F, 23, 9, 20, 0F,0F, 0F, -9.9999F, 0F, -8.9999F, -9.9999F, 0F, -8.9999F, -9.9999F, 0F, 0F, -9.9999F, 0F, -2.9999F, 0F, 0F, 0F, -9.9999F, 0F, 0F, -9.9999F, 0F, -2.9999F, 0F); // Box 526
		rightWingModel[57].setRotationPoint(-46F, -50F, 299F);

		rightWingModel[58].addShapeBox(0F, 0F, 0F, 48, 46, 2, 0F,-8F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -19.5F, 0F, 0F, -7F, 0F, 0F); // Box 527
		rightWingModel[58].setRotationPoint(-86F, -95F, 309F);

		rightWingModel[59].addShapeBox(0F, 0F, 0F, 48, 46, 2, 0F,-15F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -7F, 0F, 0F, -19.5F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F); // Box 528
		rightWingModel[59].setRotationPoint(-86F, -95F, 307F);

		rightWingModel[60].addShapeBox(0F, 0F, 0F, 2, 2, 39, 0F,0F, -40F, 0F, 0F, -40F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, 0F, 40F, 0F, 0F, 40F, 0F, 7F, 0F, 0F, -7F, 0F, 0F); // Box 529
		rightWingModel[60].setRotationPoint(-71F, -95F, 311F);

		rightWingModel[61].addShapeBox(0F, 0F, 0F, 2, 2, 39, 0F,0F, -40F, 0F, 0F, -40F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 0F, 40F, 0F, 0F, 40F, 0F, -5F, 0F, 0F, 5F, 0F, 0F); // Box 530
		rightWingModel[61].setRotationPoint(-59F, -95F, 311F);

		rightWingModel[62].addShapeBox(0F, -13F, -2F, 1, 26, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 786
		rightWingModel[62].setRotationPoint(-129F, -97F, 47F);
		rightWingModel[62].rotateAngleX = -0.78539816F;

		rightWingModel[63].addShapeBox(0F, -13F, -2F, 1, 26, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 787
		rightWingModel[63].setRotationPoint(-129F, -97F, 47F);
		rightWingModel[63].rotateAngleX = 1.57079633F;

		rightWingModel[64].addShapeBox(0F, -13F, -2F, 1, 26, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 788
		rightWingModel[64].setRotationPoint(-129F, -97F, 47F);

		rightWingModel[65].addShapeBox(0F, -13F, -2F, 1, 26, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 789
		rightWingModel[65].setRotationPoint(-129F, -97F, 47F);
		rightWingModel[65].rotateAngleX = 0.78539816F;
	}

	private void inityawFlapModel_1()
	{
		yawFlapModel[0] = new ModelRendererTurbo(this, 1, 1346, textureX, textureY); // Box 212
		yawFlapModel[1] = new ModelRendererTurbo(this, 89, 1346, textureX, textureY); // Box 213
		yawFlapModel[2] = new ModelRendererTurbo(this, 169, 1346, textureX, textureY); // Box 214
		yawFlapModel[3] = new ModelRendererTurbo(this, 1, 1423, textureX, textureY); // Box 502
		yawFlapModel[4] = new ModelRendererTurbo(this, 89, 1423, textureX, textureY); // Box 503
		yawFlapModel[5] = new ModelRendererTurbo(this, 169, 1423, textureX, textureY); // Box 504

		yawFlapModel[0].addShapeBox(0F, 18F, -5F, 37, 55, 5, 0F,0F, 0F, 0F, -8F, 0F, -4F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 212
		yawFlapModel[0].setRotationPoint(178F, -130F, 0F);

		yawFlapModel[1].addShapeBox(0F, 7F, -5F, 31, 11, 5, 0F,0F, 0F, -1F, -9F, 0F, -4F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 213
		yawFlapModel[1].setRotationPoint(178F, -130F, 0F);

		yawFlapModel[2].addShapeBox(0F, 0F, -4F, 24, 7, 4, 0F,0F, -1F, -2F, -12F, -1F, -3F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 214
		yawFlapModel[2].setRotationPoint(178F, -130F, 0F);

		yawFlapModel[3].addShapeBox(0F, 18F, 0F, 37, 55, 5, 0F,0F, 0F, 0F, -6F, 0F, 0F, -8F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -4F, 0F, 0F, 0F); // Box 502
		yawFlapModel[3].setRotationPoint(178F, -130F, 0F);

		yawFlapModel[4].addShapeBox(0F, 7F, 0F, 31, 11, 5, 0F,0F, 0F, 0F, -7F, 0F, 0F, -9F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -4F, 0F, 0F, 0F); // Box 503
		yawFlapModel[4].setRotationPoint(178F, -130F, 0F);

		yawFlapModel[5].addShapeBox(0F, 0F, 0F, 24, 7, 4, 0F,0F, 0F, 0F, -10F, 0F, 0F, -12F, -1F, -3F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, 0F, 0F, 0F); // Box 504
		yawFlapModel[5].setRotationPoint(178F, -130F, 0F);
	}

	private void initpitchFlapLeftModel_1()
	{
		pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 793, 1346, textureX, textureY); // Box 221
		pitchFlapLeftModel[1] = new ModelRendererTurbo(this, 801, 1346, textureX, textureY); // Box 222
		pitchFlapLeftModel[2] = new ModelRendererTurbo(this, 929, 1346, textureX, textureY); // Box 223
		pitchFlapLeftModel[3] = new ModelRendererTurbo(this, 1001, 1346, textureX, textureY); // Box 224

		pitchFlapLeftModel[0].addShapeBox(0F, 0F, 71F, 25, 5, 14, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 221
		pitchFlapLeftModel[0].setRotationPoint(178F, -93F, -86F);

		pitchFlapLeftModel[1].addShapeBox(0F, 0F, 0F, 25, 5, 71, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 222
		pitchFlapLeftModel[1].setRotationPoint(178F, -93F, -86F);

		pitchFlapLeftModel[2].addShapeBox(0F, 0F, -16F, 25, 5, 16, 0F,0F, -1F, 0F, -7F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -7F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 223
		pitchFlapLeftModel[2].setRotationPoint(178F, -93F, -86F);

		pitchFlapLeftModel[3].addShapeBox(0F, 1F, -22F, 18, 3, 6, 0F,0F, -1F, 0F, -8F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -8F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 224
		pitchFlapLeftModel[3].setRotationPoint(178F, -93F, -86F);
	}

	private void initpitchFlapRightModel_1()
	{
		pitchFlapRightModel[0] = new ModelRendererTurbo(this, 793, 1423, textureX, textureY); // Box 511
		pitchFlapRightModel[1] = new ModelRendererTurbo(this, 801, 1423, textureX, textureY); // Box 512
		pitchFlapRightModel[2] = new ModelRendererTurbo(this, 929, 1423, textureX, textureY); // Box 513
		pitchFlapRightModel[3] = new ModelRendererTurbo(this, 1001, 1423, textureX, textureY); // Box 514

		pitchFlapRightModel[0].addShapeBox(0F, 0F, -14F, 25, 5, 14, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 511
		pitchFlapRightModel[0].setRotationPoint(178F, -93F, 15F);

		pitchFlapRightModel[1].addShapeBox(0F, 0F, 0F, 25, 5, 71, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 512
		pitchFlapRightModel[1].setRotationPoint(178F, -93F, 15F);

		pitchFlapRightModel[2].addShapeBox(0F, 0F, 71F, 25, 5, 16, 0F,0F, 0F, 0F, 0F, -2F, 0F, -7F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -7F, -2F, 0F, 0F, -1F, 0F); // Box 513
		pitchFlapRightModel[2].setRotationPoint(178F, -93F, 15F);

		pitchFlapRightModel[3].addShapeBox(0F, 1F, 87F, 18, 3, 6, 0F,0F, 0F, 0F, 0F, -1F, 0F, -8F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -8F, -1F, 0F, 0F, -1F, 0F); // Box 514
		pitchFlapRightModel[3].setRotationPoint(178F, -93F, 15F);
	}

	private void initpitchFlapLeftWingModel_1()
	{
		pitchFlapLeftWingModel[0] = new ModelRendererTurbo(this, 481, 730, textureX, textureY); // Box 199

		pitchFlapLeftWingModel[0].addShapeBox(0F, 0F, 0F, 36, 13, 135, 0F,0F, 0F, 0F, -18F, -3F, 0F, 0F, -11F, 0F, -15F, -7F, 0F, 0F, -7F, 0F, -18F, -9F, 0F, 0F, -1F, 0F, -15F, 1F, 0F); // Box 199
		pitchFlapLeftWingModel[0].setRotationPoint(-43F, -98F, -337F);
	}

	private void initpitchFlapRightWingModel_1()
	{
		pitchFlapRightWingModel[0] = new ModelRendererTurbo(this, 841, 1036, textureX, textureY); // Box 489

		pitchFlapRightWingModel[0].addShapeBox(0F, 0F, 0F, 36, 13, 135, 0F,-15F, -7F, 0F, 0F, -11F, 0F, -18F, -3F, 0F, 0F, 0F, 0F, -15F, 1F, 0F, 0F, -1F, 0F, -18F, -9F, 0F, 0F, -7F, 0F); // Box 489
		pitchFlapRightWingModel[0].setRotationPoint(-43F, -98F, 202F);
	}

	private void initPropeller()
	{
		propellerModels = new ModelRendererTurbo[2][3];
		propellerModels[0] = makeProp1(-137F, -98F, -47F);
		propellerModels[1] = makeProp2(-137F, -98F, 48F);
	}

	private ModelRendererTurbo[] makeProp1(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[3];
		prop[0] = new ModelRendererTurbo(this, 0, 1237, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 1237, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 0, 1237, textureX, textureY);
		prop[0].addBox(-1F, -38F, -2.5F, 2, 38, 5, 0.0F);
		prop[1].addBox(-1F, -38F, -2.5F, 2, 38, 5, 0.0F);
		prop[2].addBox(-1F, -38F, -2.5F, 2, 38, 5, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		return prop;
	}

	private ModelRendererTurbo[] makeProp2(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[3];
		prop[0] = new ModelRendererTurbo(this, 0, 1237, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 1237, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 0, 1237, textureX, textureY);
		prop[0].addBox(-1F, -38F, -2.5F, 2, 38, 5, 0.0F);
		prop[1].addBox(-1F, -38F, -2.5F, 2, 38, 5, 0.0F);
		prop[2].addBox(-1F, -38F, -2.5F, 2, 38, 5, 0.0F);
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
		gun_2_Model[1][0] = new ModelRendererTurbo(this, 304, 1776, textureX, textureY); // MG1
		gun_2_Model[1][1] = new ModelRendererTurbo(this, 304, 1779, textureX, textureY); // MG1 Innen
		gun_2_Model[1][2] = new ModelRendererTurbo(this, 304, 1782, textureX, textureY); // MG1 Lauf
		gun_2_Model[1][3] = new ModelRendererTurbo(this, 304, 1785, textureX, textureY); // MG2
		gun_2_Model[1][4] = new ModelRendererTurbo(this, 304, 1790, textureX, textureY); // MG3
		gun_2_Model[1][5] = new ModelRendererTurbo(this, 311, 1790, textureX, textureY); // MG4
		gun_2_Model[1][6] = new ModelRendererTurbo(this, 318, 1790, textureX, textureY); // MG5
		gun_2_Model[1][7] = new ModelRendererTurbo(this, 331, 1776, textureX, textureY); // MG6
		gun_2_Model[1][8] = new ModelRendererTurbo(this, 331, 1780, textureX, textureY); // MG7
		gun_2_Model[1][9] = new ModelRendererTurbo(this, 325, 1785, textureX, textureY); // MG8
		gun_2_Model[1][10] = new ModelRendererTurbo(this, 337, 1785, textureX, textureY); // MG9
		gun_2_Model[1][11] = new ModelRendererTurbo(this, 327, 1785, textureX, textureY); // Ammo

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
			gunPart.setRotationPoint(-208F, -47F, 0F);
		}


		gun_2_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("NoseGun", gun_2_Model);

		// Passenger 4
		ModelRendererTurbo[][] gun_3_Model = new ModelRendererTurbo[3][];

		gun_3_Model[0] = new ModelRendererTurbo[0];

		gun_3_Model[1] = new ModelRendererTurbo[25];
		gun_3_Model[1][0] = new ModelRendererTurbo(this, 0, 407, textureX, textureY); // MG 1
		gun_3_Model[1][1] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // MG 2
		gun_3_Model[1][2] = new ModelRendererTurbo(this, 0, 419, textureX, textureY); // MG 3
		gun_3_Model[1][3] = new ModelRendererTurbo(this, 0, 425, textureX, textureY); // MG 4
		gun_3_Model[1][4] = new ModelRendererTurbo(this, 9, 425, textureX, textureY); // MG 5
		gun_3_Model[1][5] = new ModelRendererTurbo(this, 0, 429, textureX, textureY); // MG 6
		gun_3_Model[1][6] = new ModelRendererTurbo(this, 0, 432, textureX, textureY); // MG 7
		gun_3_Model[1][7] = new ModelRendererTurbo(this, 5, 432, textureX, textureY); // MG 8
		gun_3_Model[1][8] = new ModelRendererTurbo(this, 11, 429, textureX, textureY); // MG 9
		gun_3_Model[1][9] = new ModelRendererTurbo(this, 16, 429, textureX, textureY); // MG 10
		gun_3_Model[1][10] = new ModelRendererTurbo(this, 0, 436, textureX, textureY); // MG 11
		gun_3_Model[1][11] = new ModelRendererTurbo(this, 12, 433, textureX, textureY); // MG 12
		gun_3_Model[1][12] = new ModelRendererTurbo(this, 25, 419, textureX, textureY); // B1
		gun_3_Model[1][13] = new ModelRendererTurbo(this, 25, 422, textureX, textureY); // B2
		gun_3_Model[1][14] = new ModelRendererTurbo(this, 24, 425, textureX, textureY); // G1
		gun_3_Model[1][15] = new ModelRendererTurbo(this, 24, 428, textureX, textureY); // G2
		gun_3_Model[1][16] = new ModelRendererTurbo(this, 24, 432, textureX, textureY); // G3
		gun_3_Model[1][17] = new ModelRendererTurbo(this, 31, 425, textureX, textureY); // G4
		gun_3_Model[1][18] = new ModelRendererTurbo(this, 31, 428, textureX, textureY); // G5
		gun_3_Model[1][19] = new ModelRendererTurbo(this, 31, 432, textureX, textureY); // G6
		gun_3_Model[1][20] = new ModelRendererTurbo(this, 0, 410, textureX, textureY); // Ammo 1
		gun_3_Model[1][21] = new ModelRendererTurbo(this, 13, 410, textureX, textureY); // Ammo 2
		gun_3_Model[1][22] = new ModelRendererTurbo(this, 25, 419, textureX, textureY); // B1 Inner
		gun_3_Model[1][23] = new ModelRendererTurbo(this, 25, 422, textureX, textureY); // B2 Inner
		gun_3_Model[1][24] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // MG 2 Inner

		gun_3_Model[1][0].addShapeBox(7.5F, -1.5F, -0.5F, 11, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // MG 1

		gun_3_Model[1][1].addShapeBox(-5.5F, -2.5F, -1.5F, 13, 3, 3, 0F,0F, -0.5F, -0.5F, 0F, -0.85F, -0.85F, 0F, -0.85F, -0.85F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.85F, -0.85F, 0F, -0.85F, -0.85F, 0F, -0.5F, -0.5F); // MG 2

		gun_3_Model[1][2].addBox(-8.5F, -2.5F, -1F, 10, 3, 2, 0F); // MG 3

		gun_3_Model[1][3].addBox(-3F, -2F, 0.2F, 3, 2, 1, 0F); // MG 4

		gun_3_Model[1][4].addBox(-7.5F, -1.5F, -1.1F, 6, 1, 1, 0F); // MG 5

		gun_3_Model[1][5].addTrapezoid(-9.2F, -1.5F, -0.5F, 4, 1, 1, 0F, -0.20F, ModelRendererTurbo.MR_RIGHT); // MG 6

		gun_3_Model[1][6].addShapeBox(-2.5F, -2.5F, -1.3F, 1, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, -0.5F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // MG 7

		gun_3_Model[1][7].addShapeBox(-2.5F, -2.5F, -3.3F, 1, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // MG 8

		gun_3_Model[1][8].addShapeBox(0.4F, -3.5F, -0.5F, 1, 2, 1, 0F,-0.4F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // MG 9

		gun_3_Model[1][9].addShapeBox(-7.6F, -3.5F, -0.5F, 2, 2, 1, 0F,-0.6F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.6F, -0.4F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // MG 10

		gun_3_Model[1][10].addBox(1.5F, -1.5F, -0.5F, 7, 1, 1, 0F); // MG 11

		gun_3_Model[1][11].addBox(18.5F, -1.5F, -0.5F, 1, 1, 1, 0F); // MG 12

		gun_3_Model[1][12].addShapeBox(7.5F, -0.8F, -0.5F, 1, 1, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // B1

		gun_3_Model[1][13].addShapeBox(6.5F, 0.2F, -0.5F, 3, 1, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // B2

		gun_3_Model[1][14].addShapeBox(-10F, -3F, 0.5F, 2, 1, 1, 0F,0F, -0.6F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, -0.4999F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, -0.4999F, 0F, 0F, 0F); // G1

		gun_3_Model[1][15].addShapeBox(-10F, -2F, 0.5F, 1, 2, 1, 0F,0F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, 0F, 0F, 0F, 0F); // G2

		gun_3_Model[1][16].addShapeBox(-10F, 0F, 0.5F, 2, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, -0.4999F, 0F, 0F, 0F, 0F, -0.6F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, -0.4999F, 0F, -0.6F, 0F); // G3

		gun_3_Model[1][17].addShapeBox(-10F, -3F, -1.5F, 2, 1, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, -0.4999F, 0F, -0.6F, 0F, 0F, -0.6F, -0.4F, 0F, 0F, 0F, 0F, 0F, -0.4999F, 0F, 0F, 0F, 0F, 0F, -0.4F); // G4

		gun_3_Model[1][18].addShapeBox(-10F, -2F, -1.5F, 1, 2, 1, 0F,0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.4F, 0F, 0F, -0.4F); // G5

		gun_3_Model[1][19].addShapeBox(-10F, 0F, -1.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.4999F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, -0.4999F, 0F, -0.6F, 0F, 0F, -0.6F, -0.4F); // G6

		gun_3_Model[1][20].addBox(-2.5F, -0.5F, 1F, 2, 4, 4, 0F); // Ammo 1

		gun_3_Model[1][21].addShapeBox(-2.5F, -2F, 0.6F, 2, 1, 3, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, 0F); // Ammo 2

		gun_3_Model[1][22].addShapeBox(7.5F, -0.8F, -0.5F, 1, 1, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // B1 Inner

		gun_3_Model[1][23].addShapeBox(6.5F, 0.2F, -0.5F, 3, 1, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // B2 Inner

		gun_3_Model[1][24].addShapeBox(-5.5F, -2.5F, -1.5F, 13, 3, 3, 0F,0F, -0.5F, -0.5F, 0F, -0.85F, -0.85F, 0F, -0.85F, -0.85F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.85F, -0.85F, 0F, -0.85F, -0.85F, 0F, -0.5F, -0.5F); // MG 2 Inner

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_3_Model[1])
		{
			gunPart.setRotationPoint(29.5F, -42F, -28F);
		}


		gun_3_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("LeftGun", gun_3_Model);

		// Passenger 5
		ModelRendererTurbo[][] gun_4_Model = new ModelRendererTurbo[3][];

		gun_4_Model[0] = new ModelRendererTurbo[0];

		gun_4_Model[1] = new ModelRendererTurbo[25];
		gun_4_Model[1][0] = new ModelRendererTurbo(this, 0, 407, textureX, textureY); // MG 1
		gun_4_Model[1][1] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // MG 2
		gun_4_Model[1][2] = new ModelRendererTurbo(this, 0, 419, textureX, textureY); // MG 3
		gun_4_Model[1][3] = new ModelRendererTurbo(this, 0, 425, textureX, textureY); // MG 4
		gun_4_Model[1][4] = new ModelRendererTurbo(this, 9, 425, textureX, textureY); // MG 5
		gun_4_Model[1][5] = new ModelRendererTurbo(this, 0, 429, textureX, textureY); // MG 6
		gun_4_Model[1][6] = new ModelRendererTurbo(this, 0, 432, textureX, textureY); // MG 7
		gun_4_Model[1][7] = new ModelRendererTurbo(this, 5, 432, textureX, textureY); // MG 8
		gun_4_Model[1][8] = new ModelRendererTurbo(this, 11, 429, textureX, textureY); // MG 9
		gun_4_Model[1][9] = new ModelRendererTurbo(this, 16, 429, textureX, textureY); // MG 10
		gun_4_Model[1][10] = new ModelRendererTurbo(this, 0, 436, textureX, textureY); // MG 11
		gun_4_Model[1][11] = new ModelRendererTurbo(this, 12, 433, textureX, textureY); // MG 12
		gun_4_Model[1][12] = new ModelRendererTurbo(this, 25, 419, textureX, textureY); // B1
		gun_4_Model[1][13] = new ModelRendererTurbo(this, 25, 422, textureX, textureY); // B2
		gun_4_Model[1][14] = new ModelRendererTurbo(this, 24, 425, textureX, textureY); // G1
		gun_4_Model[1][15] = new ModelRendererTurbo(this, 24, 428, textureX, textureY); // G2
		gun_4_Model[1][16] = new ModelRendererTurbo(this, 24, 432, textureX, textureY); // G3
		gun_4_Model[1][17] = new ModelRendererTurbo(this, 31, 425, textureX, textureY); // G4
		gun_4_Model[1][18] = new ModelRendererTurbo(this, 31, 428, textureX, textureY); // G5
		gun_4_Model[1][19] = new ModelRendererTurbo(this, 31, 432, textureX, textureY); // G6
		gun_4_Model[1][20] = new ModelRendererTurbo(this, 0, 410, textureX, textureY); // Ammo 1
		gun_4_Model[1][21] = new ModelRendererTurbo(this, 13, 410, textureX, textureY); // Ammo 2
		gun_4_Model[1][22] = new ModelRendererTurbo(this, 25, 419, textureX, textureY); // B1 Inner
		gun_4_Model[1][23] = new ModelRendererTurbo(this, 25, 422, textureX, textureY); // B2 Inner
		gun_4_Model[1][24] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // MG 2 Inner

		gun_4_Model[1][0].addShapeBox(7.5F, -1.5F, -0.5F, 11, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // MG 1

		gun_4_Model[1][1].addShapeBox(-5.5F, -2.5F, -1.5F, 13, 3, 3, 0F,0F, -0.5F, -0.5F, 0F, -0.85F, -0.85F, 0F, -0.85F, -0.85F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.85F, -0.85F, 0F, -0.85F, -0.85F, 0F, -0.5F, -0.5F); // MG 2

		gun_4_Model[1][2].addBox(-8.5F, -2.5F, -1F, 10, 3, 2, 0F); // MG 3

		gun_4_Model[1][3].addBox(-3F, -2F, 0.2F, 3, 2, 1, 0F); // MG 4

		gun_4_Model[1][4].addBox(-7.5F, -1.5F, -1.1F, 6, 1, 1, 0F); // MG 5

		gun_4_Model[1][5].addTrapezoid(-9.2F, -1.5F, -0.5F, 4, 1, 1, 0F, -0.20F, ModelRendererTurbo.MR_RIGHT); // MG 6

		gun_4_Model[1][6].addShapeBox(-2.5F, -2.5F, -1.3F, 1, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, -0.5F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // MG 7

		gun_4_Model[1][7].addShapeBox(-2.5F, -2.5F, -3.3F, 1, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // MG 8

		gun_4_Model[1][8].addShapeBox(0.4F, -3.5F, -0.5F, 1, 2, 1, 0F,-0.4F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // MG 9

		gun_4_Model[1][9].addShapeBox(-7.6F, -3.5F, -0.5F, 2, 2, 1, 0F,-0.6F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.6F, -0.4F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // MG 10

		gun_4_Model[1][10].addBox(1.5F, -1.5F, -0.5F, 7, 1, 1, 0F); // MG 11

		gun_4_Model[1][11].addBox(18.5F, -1.5F, -0.5F, 1, 1, 1, 0F); // MG 12

		gun_4_Model[1][12].addShapeBox(7.5F, -0.8F, -0.5F, 1, 1, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // B1

		gun_4_Model[1][13].addShapeBox(6.5F, 0.2F, -0.5F, 3, 1, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // B2

		gun_4_Model[1][14].addShapeBox(-10F, -3F, 0.5F, 2, 1, 1, 0F,0F, -0.6F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, -0.4999F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, -0.4999F, 0F, 0F, 0F); // G1

		gun_4_Model[1][15].addShapeBox(-10F, -2F, 0.5F, 1, 2, 1, 0F,0F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, 0F, 0F, 0F, 0F); // G2

		gun_4_Model[1][16].addShapeBox(-10F, 0F, 0.5F, 2, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, -0.4999F, 0F, 0F, 0F, 0F, -0.6F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, -0.4999F, 0F, -0.6F, 0F); // G3

		gun_4_Model[1][17].addShapeBox(-10F, -3F, -1.5F, 2, 1, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, -0.4999F, 0F, -0.6F, 0F, 0F, -0.6F, -0.4F, 0F, 0F, 0F, 0F, 0F, -0.4999F, 0F, 0F, 0F, 0F, 0F, -0.4F); // G4

		gun_4_Model[1][18].addShapeBox(-10F, -2F, -1.5F, 1, 2, 1, 0F,0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.4F, 0F, 0F, -0.4F); // G5

		gun_4_Model[1][19].addShapeBox(-10F, 0F, -1.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.4999F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, -0.4999F, 0F, -0.6F, 0F, 0F, -0.6F, -0.4F); // G6

		gun_4_Model[1][20].addBox(-2.5F, -0.5F, 1F, 2, 4, 4, 0F); // Ammo 1

		gun_4_Model[1][21].addShapeBox(-2.5F, -2F, 0.6F, 2, 1, 3, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, 0F); // Ammo 2

		gun_4_Model[1][22].addShapeBox(7.5F, -0.8F, -0.5F, 1, 1, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // B1 Inner

		gun_4_Model[1][23].addShapeBox(6.5F, 0.2F, -0.5F, 3, 1, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // B2 Inner

		gun_4_Model[1][24].addShapeBox(-5.5F, -2.5F, -1.5F, 13, 3, 3, 0F,0F, -0.5F, -0.5F, 0F, -0.85F, -0.85F, 0F, -0.85F, -0.85F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.85F, -0.85F, 0F, -0.85F, -0.85F, 0F, -0.5F, -0.5F); // MG 2 Inner

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_4_Model[1])
		{
			gunPart.setRotationPoint(29.5F, -42F, 28F);
		}


		gun_4_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("RightGun", gun_4_Model);
	}
}