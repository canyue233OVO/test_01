//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: P59A
// Model Creator: TaskForce51
// Created on: 07.04.2023 - 03:31:44
// Last changed on: 07.04.2023 - 03:31:44

package com.flansmod.client.model.Taskball; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelP59A extends ModelPlane //Same as Filename
{
	int textureX = 2048;
	int textureY = 1024;

	public ModelP59A() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[484];
		noseModel = new ModelRendererTurbo[78];
		tailModel = new ModelRendererTurbo[75];
		leftWingModel = new ModelRendererTurbo[15];
		rightWingModel = new ModelRendererTurbo[15];
		yawFlapModel = new ModelRendererTurbo[6];
		pitchFlapLeftModel = new ModelRendererTurbo[3];
		pitchFlapRightModel = new ModelRendererTurbo[3];
		pitchFlapLeftWingModel = new ModelRendererTurbo[1];
		pitchFlapRightWingModel = new ModelRendererTurbo[1];
		bodyWheelModel = new ModelRendererTurbo[14];
		leftWingWheelModel = new ModelRendererTurbo[12];
		rightWingWheelModel = new ModelRendererTurbo[12];
		hudModel = new ModelRendererTurbo[1];

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
		initbodyWheelModel_1();
		initleftWingWheelModel_1();
		initrightWingWheelModel_1();
		inithudModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 940, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 105, 940, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 217, 940, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 313, 940, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 425, 940, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 537, 940, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 1, 980, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 57, 980, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 113, 980, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 649, 940, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 161, 980, textureX, textureY); // Box 10
		bodyModel[11] = new ModelRendererTurbo(this, 217, 980, textureX, textureY); // Box 11
		bodyModel[12] = new ModelRendererTurbo(this, 257, 980, textureX, textureY); // Box 12
		bodyModel[13] = new ModelRendererTurbo(this, 1, 898, textureX, textureY); // Box 13
		bodyModel[14] = new ModelRendererTurbo(this, 65, 898, textureX, textureY); // Box 14
		bodyModel[15] = new ModelRendererTurbo(this, 137, 898, textureX, textureY); // Box 15
		bodyModel[16] = new ModelRendererTurbo(this, 193, 898, textureX, textureY); // Box 16
		bodyModel[17] = new ModelRendererTurbo(this, 241, 898, textureX, textureY); // Box 17
		bodyModel[18] = new ModelRendererTurbo(this, 329, 898, textureX, textureY); // Box 19
		bodyModel[19] = new ModelRendererTurbo(this, 417, 898, textureX, textureY); // Box 21
		bodyModel[20] = new ModelRendererTurbo(this, 505, 898, textureX, textureY); // Box 23
		bodyModel[21] = new ModelRendererTurbo(this, 569, 898, textureX, textureY); // Box 25
		bodyModel[22] = new ModelRendererTurbo(this, 641, 898, textureX, textureY); // Box 26
		bodyModel[23] = new ModelRendererTurbo(this, 729, 898, textureX, textureY); // Box 27
		bodyModel[24] = new ModelRendererTurbo(this, 793, 898, textureX, textureY); // Box 37
		bodyModel[25] = new ModelRendererTurbo(this, 881, 898, textureX, textureY); // Box 39
		bodyModel[26] = new ModelRendererTurbo(this, 945, 898, textureX, textureY); // Box 40
		bodyModel[27] = new ModelRendererTurbo(this, 1025, 898, textureX, textureY); // Box 42
		bodyModel[28] = new ModelRendererTurbo(this, 1, 619, textureX, textureY); // Box 62
		bodyModel[29] = new ModelRendererTurbo(this, 65, 619, textureX, textureY); // Box 63
		bodyModel[30] = new ModelRendererTurbo(this, 137, 619, textureX, textureY); // Box 64
		bodyModel[31] = new ModelRendererTurbo(this, 201, 619, textureX, textureY); // Box 65
		bodyModel[32] = new ModelRendererTurbo(this, 281, 619, textureX, textureY); // Box 66
		bodyModel[33] = new ModelRendererTurbo(this, 361, 619, textureX, textureY); // Box 67
		bodyModel[34] = new ModelRendererTurbo(this, 441, 619, textureX, textureY); // Box 68
		bodyModel[35] = new ModelRendererTurbo(this, 521, 619, textureX, textureY); // Box 69
		bodyModel[36] = new ModelRendererTurbo(this, 593, 619, textureX, textureY); // Box 70
		bodyModel[37] = new ModelRendererTurbo(this, 649, 619, textureX, textureY); // Box 71
		bodyModel[38] = new ModelRendererTurbo(this, 713, 619, textureX, textureY); // Box 72
		bodyModel[39] = new ModelRendererTurbo(this, 777, 619, textureX, textureY); // Box 73
		bodyModel[40] = new ModelRendererTurbo(this, 809, 619, textureX, textureY); // Box 74
		bodyModel[41] = new ModelRendererTurbo(this, 889, 619, textureX, textureY); // Box 75
		bodyModel[42] = new ModelRendererTurbo(this, 969, 619, textureX, textureY); // Box 76
		bodyModel[43] = new ModelRendererTurbo(this, 1049, 619, textureX, textureY); // Box 77
		bodyModel[44] = new ModelRendererTurbo(this, 1137, 619, textureX, textureY); // Box 78
		bodyModel[45] = new ModelRendererTurbo(this, 1217, 619, textureX, textureY); // Box 79
		bodyModel[46] = new ModelRendererTurbo(this, 1289, 619, textureX, textureY); // Box 80
		bodyModel[47] = new ModelRendererTurbo(this, 1345, 619, textureX, textureY); // Box 81
		bodyModel[48] = new ModelRendererTurbo(this, 49, 619, textureX, textureY); // Box 82
		bodyModel[49] = new ModelRendererTurbo(this, 113, 619, textureX, textureY); // Box 83
		bodyModel[50] = new ModelRendererTurbo(this, 185, 619, textureX, textureY); // Box 84
		bodyModel[51] = new ModelRendererTurbo(this, 257, 619, textureX, textureY); // Box 85
		bodyModel[52] = new ModelRendererTurbo(this, 337, 619, textureX, textureY); // Box 86
		bodyModel[53] = new ModelRendererTurbo(this, 417, 619, textureX, textureY); // Box 87
		bodyModel[54] = new ModelRendererTurbo(this, 497, 619, textureX, textureY); // Box 88
		bodyModel[55] = new ModelRendererTurbo(this, 577, 619, textureX, textureY); // Box 89
		bodyModel[56] = new ModelRendererTurbo(this, 1385, 619, textureX, textureY); // Box 90
		bodyModel[57] = new ModelRendererTurbo(this, 1449, 619, textureX, textureY); // Box 91
		bodyModel[58] = new ModelRendererTurbo(this, 1521, 619, textureX, textureY); // Box 92
		bodyModel[59] = new ModelRendererTurbo(this, 1601, 619, textureX, textureY); // Box 93
		bodyModel[60] = new ModelRendererTurbo(this, 1681, 619, textureX, textureY); // Box 94
		bodyModel[61] = new ModelRendererTurbo(this, 1097, 980, textureX, textureY); // Box 97
		bodyModel[62] = new ModelRendererTurbo(this, 673, 940, textureX, textureY); // Box 109
		bodyModel[63] = new ModelRendererTurbo(this, 705, 940, textureX, textureY); // Box 110
		bodyModel[64] = new ModelRendererTurbo(this, 737, 940, textureX, textureY); // Box 111
		bodyModel[65] = new ModelRendererTurbo(this, 761, 940, textureX, textureY); // Box 112
		bodyModel[66] = new ModelRendererTurbo(this, 777, 940, textureX, textureY); // Box 113
		bodyModel[67] = new ModelRendererTurbo(this, 793, 940, textureX, textureY); // Box 114
		bodyModel[68] = new ModelRendererTurbo(this, 809, 940, textureX, textureY); // Box 115
		bodyModel[69] = new ModelRendererTurbo(this, 833, 940, textureX, textureY); // Box 116
		bodyModel[70] = new ModelRendererTurbo(this, 865, 940, textureX, textureY); // Box 117
		bodyModel[71] = new ModelRendererTurbo(this, 897, 940, textureX, textureY); // Box 118
		bodyModel[72] = new ModelRendererTurbo(this, 825, 940, textureX, textureY); // Box 119
		bodyModel[73] = new ModelRendererTurbo(this, 937, 940, textureX, textureY); // Box 120
		bodyModel[74] = new ModelRendererTurbo(this, 961, 940, textureX, textureY); // Box 121
		bodyModel[75] = new ModelRendererTurbo(this, 425, 940, textureX, textureY); // Box 122
		bodyModel[76] = new ModelRendererTurbo(this, 993, 940, textureX, textureY); // Box 123
		bodyModel[77] = new ModelRendererTurbo(this, 209, 940, textureX, textureY); // Box 124
		bodyModel[78] = new ModelRendererTurbo(this, 649, 940, textureX, textureY); // Box 125
		bodyModel[79] = new ModelRendererTurbo(this, 1009, 940, textureX, textureY); // Box 126
		bodyModel[80] = new ModelRendererTurbo(this, 857, 940, textureX, textureY); // Box 127
		bodyModel[81] = new ModelRendererTurbo(this, 1025, 940, textureX, textureY); // Box 128
		bodyModel[82] = new ModelRendererTurbo(this, 953, 940, textureX, textureY); // Box 129
		bodyModel[83] = new ModelRendererTurbo(this, 1041, 940, textureX, textureY); // Box 130
		bodyModel[84] = new ModelRendererTurbo(this, 1065, 940, textureX, textureY); // Box 131
		bodyModel[85] = new ModelRendererTurbo(this, 1073, 940, textureX, textureY); // Box 132
		bodyModel[86] = new ModelRendererTurbo(this, 1073, 940, textureX, textureY); // Box 183
		bodyModel[87] = new ModelRendererTurbo(this, 1, 470, textureX, textureY); // Box 184
		bodyModel[88] = new ModelRendererTurbo(this, 57, 470, textureX, textureY); // Box 185
		bodyModel[89] = new ModelRendererTurbo(this, 1, 960, textureX, textureY); // Box 186
		bodyModel[90] = new ModelRendererTurbo(this, 105, 960, textureX, textureY); // Box 187
		bodyModel[91] = new ModelRendererTurbo(this, 217, 960, textureX, textureY); // Box 188
		bodyModel[92] = new ModelRendererTurbo(this, 313, 960, textureX, textureY); // Box 189
		bodyModel[93] = new ModelRendererTurbo(this, 425, 960, textureX, textureY); // Box 190
		bodyModel[94] = new ModelRendererTurbo(this, 537, 960, textureX, textureY); // Box 191
		bodyModel[95] = new ModelRendererTurbo(this, 1, 1002, textureX, textureY); // Box 192
		bodyModel[96] = new ModelRendererTurbo(this, 57, 1002, textureX, textureY); // Box 193
		bodyModel[97] = new ModelRendererTurbo(this, 113, 1002, textureX, textureY); // Box 194
		bodyModel[98] = new ModelRendererTurbo(this, 649, 960, textureX, textureY); // Box 195
		bodyModel[99] = new ModelRendererTurbo(this, 161, 1002, textureX, textureY); // Box 196
		bodyModel[100] = new ModelRendererTurbo(this, 217, 1002, textureX, textureY); // Box 197
		bodyModel[101] = new ModelRendererTurbo(this, 257, 1002, textureX, textureY); // Box 198
		bodyModel[102] = new ModelRendererTurbo(this, 1, 919, textureX, textureY); // Box 199
		bodyModel[103] = new ModelRendererTurbo(this, 65, 919, textureX, textureY); // Box 200
		bodyModel[104] = new ModelRendererTurbo(this, 137, 919, textureX, textureY); // Box 201
		bodyModel[105] = new ModelRendererTurbo(this, 193, 919, textureX, textureY); // Box 202
		bodyModel[106] = new ModelRendererTurbo(this, 241, 919, textureX, textureY); // Box 203
		bodyModel[107] = new ModelRendererTurbo(this, 329, 919, textureX, textureY); // Box 205
		bodyModel[108] = new ModelRendererTurbo(this, 417, 919, textureX, textureY); // Box 207
		bodyModel[109] = new ModelRendererTurbo(this, 505, 919, textureX, textureY); // Box 209
		bodyModel[110] = new ModelRendererTurbo(this, 569, 919, textureX, textureY); // Box 211
		bodyModel[111] = new ModelRendererTurbo(this, 641, 919, textureX, textureY); // Box 212
		bodyModel[112] = new ModelRendererTurbo(this, 729, 919, textureX, textureY); // Box 213
		bodyModel[113] = new ModelRendererTurbo(this, 793, 919, textureX, textureY); // Box 223
		bodyModel[114] = new ModelRendererTurbo(this, 881, 919, textureX, textureY); // Box 225
		bodyModel[115] = new ModelRendererTurbo(this, 945, 919, textureX, textureY); // Box 226
		bodyModel[116] = new ModelRendererTurbo(this, 1025, 919, textureX, textureY); // Box 228
		bodyModel[117] = new ModelRendererTurbo(this, 1, 726, textureX, textureY); // Box 247
		bodyModel[118] = new ModelRendererTurbo(this, 65, 726, textureX, textureY); // Box 248
		bodyModel[119] = new ModelRendererTurbo(this, 137, 726, textureX, textureY); // Box 249
		bodyModel[120] = new ModelRendererTurbo(this, 201, 726, textureX, textureY); // Box 250
		bodyModel[121] = new ModelRendererTurbo(this, 281, 726, textureX, textureY); // Box 251
		bodyModel[122] = new ModelRendererTurbo(this, 361, 726, textureX, textureY); // Box 252
		bodyModel[123] = new ModelRendererTurbo(this, 441, 726, textureX, textureY); // Box 253
		bodyModel[124] = new ModelRendererTurbo(this, 521, 726, textureX, textureY); // Box 254
		bodyModel[125] = new ModelRendererTurbo(this, 593, 726, textureX, textureY); // Box 255
		bodyModel[126] = new ModelRendererTurbo(this, 649, 726, textureX, textureY); // Box 256
		bodyModel[127] = new ModelRendererTurbo(this, 713, 726, textureX, textureY); // Box 257
		bodyModel[128] = new ModelRendererTurbo(this, 777, 726, textureX, textureY); // Box 258
		bodyModel[129] = new ModelRendererTurbo(this, 809, 726, textureX, textureY); // Box 259
		bodyModel[130] = new ModelRendererTurbo(this, 889, 726, textureX, textureY); // Box 260
		bodyModel[131] = new ModelRendererTurbo(this, 969, 726, textureX, textureY); // Box 261
		bodyModel[132] = new ModelRendererTurbo(this, 1049, 726, textureX, textureY); // Box 262
		bodyModel[133] = new ModelRendererTurbo(this, 1137, 726, textureX, textureY); // Box 263
		bodyModel[134] = new ModelRendererTurbo(this, 1217, 726, textureX, textureY); // Box 264
		bodyModel[135] = new ModelRendererTurbo(this, 1289, 726, textureX, textureY); // Box 265
		bodyModel[136] = new ModelRendererTurbo(this, 1345, 726, textureX, textureY); // Box 266
		bodyModel[137] = new ModelRendererTurbo(this, 1385, 726, textureX, textureY); // Box 275
		bodyModel[138] = new ModelRendererTurbo(this, 1449, 726, textureX, textureY); // Box 276
		bodyModel[139] = new ModelRendererTurbo(this, 1521, 726, textureX, textureY); // Box 277
		bodyModel[140] = new ModelRendererTurbo(this, 1601, 726, textureX, textureY); // Box 278
		bodyModel[141] = new ModelRendererTurbo(this, 1681, 726, textureX, textureY); // Box 279
		bodyModel[142] = new ModelRendererTurbo(this, 1097, 1002, textureX, textureY); // Box 282
		bodyModel[143] = new ModelRendererTurbo(this, 673, 960, textureX, textureY); // Box 294
		bodyModel[144] = new ModelRendererTurbo(this, 705, 960, textureX, textureY); // Box 295
		bodyModel[145] = new ModelRendererTurbo(this, 737, 960, textureX, textureY); // Box 296
		bodyModel[146] = new ModelRendererTurbo(this, 761, 960, textureX, textureY); // Box 297
		bodyModel[147] = new ModelRendererTurbo(this, 777, 960, textureX, textureY); // Box 298
		bodyModel[148] = new ModelRendererTurbo(this, 793, 960, textureX, textureY); // Box 299
		bodyModel[149] = new ModelRendererTurbo(this, 809, 960, textureX, textureY); // Box 300
		bodyModel[150] = new ModelRendererTurbo(this, 833, 960, textureX, textureY); // Box 302
		bodyModel[151] = new ModelRendererTurbo(this, 865, 960, textureX, textureY); // Box 303
		bodyModel[152] = new ModelRendererTurbo(this, 825, 960, textureX, textureY); // Box 304
		bodyModel[153] = new ModelRendererTurbo(this, 905, 960, textureX, textureY); // Box 306
		bodyModel[154] = new ModelRendererTurbo(this, 425, 960, textureX, textureY); // Box 307
		bodyModel[155] = new ModelRendererTurbo(this, 937, 960, textureX, textureY); // Box 308
		bodyModel[156] = new ModelRendererTurbo(this, 209, 960, textureX, textureY); // Box 309
		bodyModel[157] = new ModelRendererTurbo(this, 649, 960, textureX, textureY); // Box 310
		bodyModel[158] = new ModelRendererTurbo(this, 953, 960, textureX, textureY); // Box 311
		bodyModel[159] = new ModelRendererTurbo(this, 969, 960, textureX, textureY); // Box 312
		bodyModel[160] = new ModelRendererTurbo(this, 985, 960, textureX, textureY); // Box 313
		bodyModel[161] = new ModelRendererTurbo(this, 1001, 960, textureX, textureY); // Box 314
		bodyModel[162] = new ModelRendererTurbo(this, 1009, 960, textureX, textureY); // Box 315
		bodyModel[163] = new ModelRendererTurbo(this, 1033, 960, textureX, textureY); // Box 316
		bodyModel[164] = new ModelRendererTurbo(this, 1041, 960, textureX, textureY); // Box 317
		bodyModel[165] = new ModelRendererTurbo(this, 1041, 960, textureX, textureY); // Box 368
		bodyModel[166] = new ModelRendererTurbo(this, 113, 470, textureX, textureY); // Box 369
		bodyModel[167] = new ModelRendererTurbo(this, 169, 470, textureX, textureY); // Box 370
		bodyModel[168] = new ModelRendererTurbo(this, 945, 619, textureX, textureY); // Box 371
		bodyModel[169] = new ModelRendererTurbo(this, 873, 619, textureX, textureY); // Box 372
		bodyModel[170] = new ModelRendererTurbo(this, 697, 619, textureX, textureY); // Box 373
		bodyModel[171] = new ModelRendererTurbo(this, 761, 619, textureX, textureY); // Box 374
		bodyModel[172] = new ModelRendererTurbo(this, 49, 726, textureX, textureY); // Box 375
		bodyModel[173] = new ModelRendererTurbo(this, 113, 726, textureX, textureY); // Box 376
		bodyModel[174] = new ModelRendererTurbo(this, 185, 726, textureX, textureY); // Box 377
		bodyModel[175] = new ModelRendererTurbo(this, 257, 726, textureX, textureY); // Box 378
		bodyModel[176] = new ModelRendererTurbo(this, 337, 726, textureX, textureY); // Box 379
		bodyModel[177] = new ModelRendererTurbo(this, 417, 726, textureX, textureY); // Box 380
		bodyModel[178] = new ModelRendererTurbo(this, 497, 726, textureX, textureY); // Box 381
		bodyModel[179] = new ModelRendererTurbo(this, 577, 726, textureX, textureY); // Box 382
		bodyModel[180] = new ModelRendererTurbo(this, 945, 726, textureX, textureY); // Box 383
		bodyModel[181] = new ModelRendererTurbo(this, 873, 726, textureX, textureY); // Box 384
		bodyModel[182] = new ModelRendererTurbo(this, 697, 726, textureX, textureY); // Box 385
		bodyModel[183] = new ModelRendererTurbo(this, 761, 726, textureX, textureY); // Box 386
		bodyModel[184] = new ModelRendererTurbo(this, 1033, 619, textureX, textureY); // Box 388
		bodyModel[185] = new ModelRendererTurbo(this, 1113, 619, textureX, textureY); // Box 389
		bodyModel[186] = new ModelRendererTurbo(this, 1425, 619, textureX, textureY); // Box 390
		bodyModel[187] = new ModelRendererTurbo(this, 1, 619, textureX, textureY); // Box 391
		bodyModel[188] = new ModelRendererTurbo(this, 145, 619, textureX, textureY); // Box 392
		bodyModel[189] = new ModelRendererTurbo(this, 289, 619, textureX, textureY); // Box 393
		bodyModel[190] = new ModelRendererTurbo(this, 369, 619, textureX, textureY); // Box 394
		bodyModel[191] = new ModelRendererTurbo(this, 449, 619, textureX, textureY); // Box 395
		bodyModel[192] = new ModelRendererTurbo(this, 649, 619, textureX, textureY); // Box 396
		bodyModel[193] = new ModelRendererTurbo(this, 1201, 619, textureX, textureY); // Box 397
		bodyModel[194] = new ModelRendererTurbo(this, 1217, 619, textureX, textureY); // Box 398
		bodyModel[195] = new ModelRendererTurbo(this, 1033, 726, textureX, textureY); // Box 399
		bodyModel[196] = new ModelRendererTurbo(this, 1113, 726, textureX, textureY); // Box 400
		bodyModel[197] = new ModelRendererTurbo(this, 1425, 726, textureX, textureY); // Box 401
		bodyModel[198] = new ModelRendererTurbo(this, 1, 726, textureX, textureY); // Box 402
		bodyModel[199] = new ModelRendererTurbo(this, 145, 726, textureX, textureY); // Box 403
		bodyModel[200] = new ModelRendererTurbo(this, 289, 726, textureX, textureY); // Box 404
		bodyModel[201] = new ModelRendererTurbo(this, 369, 726, textureX, textureY); // Box 405
		bodyModel[202] = new ModelRendererTurbo(this, 449, 726, textureX, textureY); // Box 406
		bodyModel[203] = new ModelRendererTurbo(this, 649, 726, textureX, textureY); // Box 407
		bodyModel[204] = new ModelRendererTurbo(this, 1201, 726, textureX, textureY); // Box 408
		bodyModel[205] = new ModelRendererTurbo(this, 1217, 726, textureX, textureY); // Box 409
		bodyModel[206] = new ModelRendererTurbo(this, 1, 919, textureX, textureY); // Box 695
		bodyModel[207] = new ModelRendererTurbo(this, 1081, 919, textureX, textureY); // Box 451
		bodyModel[208] = new ModelRendererTurbo(this, 225, 470, textureX, textureY); // Box 239
		bodyModel[209] = new ModelRendererTurbo(this, 273, 470, textureX, textureY); // Box 240
		bodyModel[210] = new ModelRendererTurbo(this, 257, 470, textureX, textureY); // Box 241
		bodyModel[211] = new ModelRendererTurbo(this, 289, 470, textureX, textureY); // Box 242
		bodyModel[212] = new ModelRendererTurbo(this, 305, 470, textureX, textureY); // Box 243
		bodyModel[213] = new ModelRendererTurbo(this, 329, 470, textureX, textureY); // Box 244
		bodyModel[214] = new ModelRendererTurbo(this, 353, 470, textureX, textureY); // Box 245
		bodyModel[215] = new ModelRendererTurbo(this, 369, 470, textureX, textureY); // Box 246
		bodyModel[216] = new ModelRendererTurbo(this, 393, 470, textureX, textureY); // Box 247
		bodyModel[217] = new ModelRendererTurbo(this, 401, 470, textureX, textureY); // Box 248
		bodyModel[218] = new ModelRendererTurbo(this, 409, 470, textureX, textureY); // Box 250
		bodyModel[219] = new ModelRendererTurbo(this, 417, 470, textureX, textureY); // Box 251
		bodyModel[220] = new ModelRendererTurbo(this, 425, 470, textureX, textureY); // Box 252
		bodyModel[221] = new ModelRendererTurbo(this, 449, 470, textureX, textureY); // Box 253
		bodyModel[222] = new ModelRendererTurbo(this, 1, 470, textureX, textureY); // Box 962
		bodyModel[223] = new ModelRendererTurbo(this, 49, 470, textureX, textureY); // Box 964
		bodyModel[224] = new ModelRendererTurbo(this, 105, 470, textureX, textureY); // Box 966
		bodyModel[225] = new ModelRendererTurbo(this, 161, 470, textureX, textureY); // Box 259
		bodyModel[226] = new ModelRendererTurbo(this, 169, 470, textureX, textureY); // Box 260
		bodyModel[227] = new ModelRendererTurbo(this, 473, 470, textureX, textureY); // Box 256
		bodyModel[228] = new ModelRendererTurbo(this, 217, 470, textureX, textureY); // Box 601
		bodyModel[229] = new ModelRendererTurbo(this, 321, 470, textureX, textureY); // Box 602
		bodyModel[230] = new ModelRendererTurbo(this, 345, 470, textureX, textureY); // Box 603
		bodyModel[231] = new ModelRendererTurbo(this, 57, 470, textureX, textureY); // Box 604
		bodyModel[232] = new ModelRendererTurbo(this, 497, 470, textureX, textureY); // Box 967
		bodyModel[233] = new ModelRendererTurbo(this, 537, 470, textureX, textureY); // Box 968
		bodyModel[234] = new ModelRendererTurbo(this, 553, 470, textureX, textureY); // Box 249
		bodyModel[235] = new ModelRendererTurbo(this, 577, 470, textureX, textureY); // Box 254
		bodyModel[236] = new ModelRendererTurbo(this, 601, 470, textureX, textureY); // Box 263
		bodyModel[237] = new ModelRendererTurbo(this, 353, 470, textureX, textureY); // Box 264
		bodyModel[238] = new ModelRendererTurbo(this, 369, 470, textureX, textureY); // Box 265
		bodyModel[239] = new ModelRendererTurbo(this, 113, 470, textureX, textureY); // Box 266
		bodyModel[240] = new ModelRendererTurbo(this, 617, 470, textureX, textureY); // Box 487
		bodyModel[241] = new ModelRendererTurbo(this, 657, 470, textureX, textureY); // Box 488
		bodyModel[242] = new ModelRendererTurbo(this, 649, 470, textureX, textureY); // Box 489
		bodyModel[243] = new ModelRendererTurbo(this, 1, 443, textureX, textureY); // Box 262
		bodyModel[244] = new ModelRendererTurbo(this, 57, 443, textureX, textureY); // Box 255
		bodyModel[245] = new ModelRendererTurbo(this, 105, 443, textureX, textureY); // Box 257
		bodyModel[246] = new ModelRendererTurbo(this, 33, 443, textureX, textureY); // Box 258
		bodyModel[247] = new ModelRendererTurbo(this, 1, 443, textureX, textureY); // Box 213
		bodyModel[248] = new ModelRendererTurbo(this, 57, 443, textureX, textureY); // Box 214
		bodyModel[249] = new ModelRendererTurbo(this, 1, 443, textureX, textureY); // Box 233
		bodyModel[250] = new ModelRendererTurbo(this, 33, 443, textureX, textureY); // Box 234
		bodyModel[251] = new ModelRendererTurbo(this, 41, 443, textureX, textureY); // Box 235
		bodyModel[252] = new ModelRendererTurbo(this, 57, 443, textureX, textureY); // Box 236
		bodyModel[253] = new ModelRendererTurbo(this, 81, 443, textureX, textureY); // Box 237
		bodyModel[254] = new ModelRendererTurbo(this, 89, 443, textureX, textureY); // Box 238
		bodyModel[255] = new ModelRendererTurbo(this, 97, 443, textureX, textureY); // Box 239
		bodyModel[256] = new ModelRendererTurbo(this, 105, 443, textureX, textureY); // Box 240
		bodyModel[257] = new ModelRendererTurbo(this, 113, 443, textureX, textureY); // Box 241
		bodyModel[258] = new ModelRendererTurbo(this, 129, 443, textureX, textureY); // Box 242
		bodyModel[259] = new ModelRendererTurbo(this, 137, 443, textureX, textureY); // Box 243
		bodyModel[260] = new ModelRendererTurbo(this, 145, 443, textureX, textureY); // Box 244
		bodyModel[261] = new ModelRendererTurbo(this, 153, 443, textureX, textureY); // Box 248
		bodyModel[262] = new ModelRendererTurbo(this, 161, 443, textureX, textureY); // Box 249
		bodyModel[263] = new ModelRendererTurbo(this, 169, 443, textureX, textureY); // Box 250
		bodyModel[264] = new ModelRendererTurbo(this, 177, 443, textureX, textureY); // Box 251
		bodyModel[265] = new ModelRendererTurbo(this, 185, 443, textureX, textureY); // Box 252
		bodyModel[266] = new ModelRendererTurbo(this, 193, 443, textureX, textureY); // Box 253
		bodyModel[267] = new ModelRendererTurbo(this, 201, 443, textureX, textureY); // Box 254
		bodyModel[268] = new ModelRendererTurbo(this, 209, 443, textureX, textureY); // Box 255
		bodyModel[269] = new ModelRendererTurbo(this, 217, 443, textureX, textureY); // Box 256
		bodyModel[270] = new ModelRendererTurbo(this, 225, 443, textureX, textureY); // Box 257
		bodyModel[271] = new ModelRendererTurbo(this, 233, 443, textureX, textureY); // Box 258
		bodyModel[272] = new ModelRendererTurbo(this, 241, 443, textureX, textureY); // Box 259
		bodyModel[273] = new ModelRendererTurbo(this, 249, 443, textureX, textureY); // Box 260
		bodyModel[274] = new ModelRendererTurbo(this, 257, 443, textureX, textureY); // Box 261
		bodyModel[275] = new ModelRendererTurbo(this, 265, 443, textureX, textureY); // Box 262
		bodyModel[276] = new ModelRendererTurbo(this, 273, 443, textureX, textureY); // Box 263
		bodyModel[277] = new ModelRendererTurbo(this, 281, 443, textureX, textureY); // Box 265
		bodyModel[278] = new ModelRendererTurbo(this, 289, 443, textureX, textureY); // Box 266
		bodyModel[279] = new ModelRendererTurbo(this, 297, 443, textureX, textureY); // Box 267
		bodyModel[280] = new ModelRendererTurbo(this, 305, 443, textureX, textureY); // Box 268
		bodyModel[281] = new ModelRendererTurbo(this, 313, 443, textureX, textureY); // Box 269
		bodyModel[282] = new ModelRendererTurbo(this, 321, 443, textureX, textureY); // Box 270
		bodyModel[283] = new ModelRendererTurbo(this, 329, 443, textureX, textureY); // Box 271
		bodyModel[284] = new ModelRendererTurbo(this, 337, 443, textureX, textureY); // Box 272
		bodyModel[285] = new ModelRendererTurbo(this, 345, 443, textureX, textureY); // Box 273
		bodyModel[286] = new ModelRendererTurbo(this, 353, 443, textureX, textureY); // Box 274
		bodyModel[287] = new ModelRendererTurbo(this, 361, 443, textureX, textureY); // Box 275
		bodyModel[288] = new ModelRendererTurbo(this, 369, 443, textureX, textureY); // Box 276
		bodyModel[289] = new ModelRendererTurbo(this, 377, 443, textureX, textureY); // Box 277
		bodyModel[290] = new ModelRendererTurbo(this, 385, 443, textureX, textureY); // Box 278
		bodyModel[291] = new ModelRendererTurbo(this, 393, 443, textureX, textureY); // Box 279
		bodyModel[292] = new ModelRendererTurbo(this, 401, 443, textureX, textureY); // Box 280
		bodyModel[293] = new ModelRendererTurbo(this, 409, 443, textureX, textureY); // Box 281
		bodyModel[294] = new ModelRendererTurbo(this, 417, 443, textureX, textureY); // Box 282
		bodyModel[295] = new ModelRendererTurbo(this, 425, 443, textureX, textureY); // Box 283
		bodyModel[296] = new ModelRendererTurbo(this, 433, 443, textureX, textureY); // Box 284
		bodyModel[297] = new ModelRendererTurbo(this, 441, 443, textureX, textureY); // Box 285
		bodyModel[298] = new ModelRendererTurbo(this, 449, 443, textureX, textureY); // Box 286
		bodyModel[299] = new ModelRendererTurbo(this, 457, 443, textureX, textureY); // Box 287
		bodyModel[300] = new ModelRendererTurbo(this, 465, 443, textureX, textureY); // Box 288
		bodyModel[301] = new ModelRendererTurbo(this, 473, 443, textureX, textureY); // Box 289
		bodyModel[302] = new ModelRendererTurbo(this, 481, 443, textureX, textureY); // Box 290
		bodyModel[303] = new ModelRendererTurbo(this, 489, 443, textureX, textureY); // Box 318
		bodyModel[304] = new ModelRendererTurbo(this, 497, 443, textureX, textureY); // Box 319
		bodyModel[305] = new ModelRendererTurbo(this, 505, 443, textureX, textureY); // Box 320
		bodyModel[306] = new ModelRendererTurbo(this, 513, 443, textureX, textureY); // Box 321
		bodyModel[307] = new ModelRendererTurbo(this, 521, 443, textureX, textureY); // Box 322
		bodyModel[308] = new ModelRendererTurbo(this, 529, 443, textureX, textureY); // Box 323
		bodyModel[309] = new ModelRendererTurbo(this, 537, 443, textureX, textureY); // Box 324
		bodyModel[310] = new ModelRendererTurbo(this, 545, 443, textureX, textureY); // Box 325
		bodyModel[311] = new ModelRendererTurbo(this, 553, 443, textureX, textureY); // Box 326
		bodyModel[312] = new ModelRendererTurbo(this, 561, 443, textureX, textureY); // Box 327
		bodyModel[313] = new ModelRendererTurbo(this, 569, 443, textureX, textureY); // Box 328
		bodyModel[314] = new ModelRendererTurbo(this, 577, 443, textureX, textureY); // Box 329
		bodyModel[315] = new ModelRendererTurbo(this, 585, 443, textureX, textureY); // Box 330
		bodyModel[316] = new ModelRendererTurbo(this, 593, 443, textureX, textureY); // Box 331
		bodyModel[317] = new ModelRendererTurbo(this, 601, 443, textureX, textureY); // Box 332
		bodyModel[318] = new ModelRendererTurbo(this, 609, 443, textureX, textureY); // Box 333
		bodyModel[319] = new ModelRendererTurbo(this, 617, 443, textureX, textureY); // Box 334
		bodyModel[320] = new ModelRendererTurbo(this, 625, 443, textureX, textureY); // Box 340
		bodyModel[321] = new ModelRendererTurbo(this, 633, 443, textureX, textureY); // Box 341
		bodyModel[322] = new ModelRendererTurbo(this, 641, 443, textureX, textureY); // Box 342
		bodyModel[323] = new ModelRendererTurbo(this, 649, 443, textureX, textureY); // Box 343
		bodyModel[324] = new ModelRendererTurbo(this, 657, 443, textureX, textureY); // Box 344
		bodyModel[325] = new ModelRendererTurbo(this, 665, 443, textureX, textureY); // Box 345
		bodyModel[326] = new ModelRendererTurbo(this, 673, 443, textureX, textureY); // Box 346
		bodyModel[327] = new ModelRendererTurbo(this, 681, 443, textureX, textureY); // Box 347
		bodyModel[328] = new ModelRendererTurbo(this, 689, 443, textureX, textureY); // Box 348
		bodyModel[329] = new ModelRendererTurbo(this, 697, 443, textureX, textureY); // Box 349
		bodyModel[330] = new ModelRendererTurbo(this, 705, 443, textureX, textureY); // Box 350
		bodyModel[331] = new ModelRendererTurbo(this, 713, 443, textureX, textureY); // Box 351
		bodyModel[332] = new ModelRendererTurbo(this, 721, 443, textureX, textureY); // Box 352
		bodyModel[333] = new ModelRendererTurbo(this, 729, 443, textureX, textureY); // Box 353
		bodyModel[334] = new ModelRendererTurbo(this, 737, 443, textureX, textureY); // Box 354
		bodyModel[335] = new ModelRendererTurbo(this, 745, 443, textureX, textureY); // Box 355
		bodyModel[336] = new ModelRendererTurbo(this, 753, 443, textureX, textureY); // Box 356
		bodyModel[337] = new ModelRendererTurbo(this, 761, 443, textureX, textureY); // Box 387
		bodyModel[338] = new ModelRendererTurbo(this, 769, 443, textureX, textureY); // Box 388
		bodyModel[339] = new ModelRendererTurbo(this, 777, 443, textureX, textureY); // Box 390
		bodyModel[340] = new ModelRendererTurbo(this, 785, 443, textureX, textureY); // Box 391
		bodyModel[341] = new ModelRendererTurbo(this, 793, 443, textureX, textureY); // Box 392
		bodyModel[342] = new ModelRendererTurbo(this, 801, 443, textureX, textureY); // Box 393
		bodyModel[343] = new ModelRendererTurbo(this, 809, 443, textureX, textureY); // Box 394
		bodyModel[344] = new ModelRendererTurbo(this, 817, 443, textureX, textureY); // Box 395
		bodyModel[345] = new ModelRendererTurbo(this, 825, 443, textureX, textureY); // Box 396
		bodyModel[346] = new ModelRendererTurbo(this, 833, 443, textureX, textureY); // Box 397
		bodyModel[347] = new ModelRendererTurbo(this, 841, 443, textureX, textureY); // Box 398
		bodyModel[348] = new ModelRendererTurbo(this, 849, 443, textureX, textureY); // Box 399
		bodyModel[349] = new ModelRendererTurbo(this, 857, 443, textureX, textureY); // Box 400
		bodyModel[350] = new ModelRendererTurbo(this, 865, 443, textureX, textureY); // Box 401
		bodyModel[351] = new ModelRendererTurbo(this, 873, 443, textureX, textureY); // Box 402
		bodyModel[352] = new ModelRendererTurbo(this, 881, 443, textureX, textureY); // Box 403
		bodyModel[353] = new ModelRendererTurbo(this, 889, 443, textureX, textureY); // Box 404
		bodyModel[354] = new ModelRendererTurbo(this, 897, 443, textureX, textureY); // Box 405
		bodyModel[355] = new ModelRendererTurbo(this, 905, 443, textureX, textureY); // Box 406
		bodyModel[356] = new ModelRendererTurbo(this, 913, 443, textureX, textureY); // Box 407
		bodyModel[357] = new ModelRendererTurbo(this, 921, 443, textureX, textureY); // Box 408
		bodyModel[358] = new ModelRendererTurbo(this, 929, 443, textureX, textureY); // Box 409
		bodyModel[359] = new ModelRendererTurbo(this, 937, 443, textureX, textureY); // Box 410
		bodyModel[360] = new ModelRendererTurbo(this, 945, 443, textureX, textureY); // Box 411
		bodyModel[361] = new ModelRendererTurbo(this, 953, 443, textureX, textureY); // Box 412
		bodyModel[362] = new ModelRendererTurbo(this, 961, 443, textureX, textureY); // Box 413
		bodyModel[363] = new ModelRendererTurbo(this, 969, 443, textureX, textureY); // Box 414
		bodyModel[364] = new ModelRendererTurbo(this, 977, 443, textureX, textureY); // Box 415
		bodyModel[365] = new ModelRendererTurbo(this, 985, 443, textureX, textureY); // Box 416
		bodyModel[366] = new ModelRendererTurbo(this, 993, 443, textureX, textureY); // Box 417
		bodyModel[367] = new ModelRendererTurbo(this, 1001, 443, textureX, textureY); // Box 418
		bodyModel[368] = new ModelRendererTurbo(this, 1009, 443, textureX, textureY); // Box 419
		bodyModel[369] = new ModelRendererTurbo(this, 1017, 443, textureX, textureY); // Box 421
		bodyModel[370] = new ModelRendererTurbo(this, 1025, 443, textureX, textureY); // Box 422
		bodyModel[371] = new ModelRendererTurbo(this, 1033, 443, textureX, textureY); // Box 423
		bodyModel[372] = new ModelRendererTurbo(this, 1041, 443, textureX, textureY); // Box 424
		bodyModel[373] = new ModelRendererTurbo(this, 1049, 443, textureX, textureY); // Box 425
		bodyModel[374] = new ModelRendererTurbo(this, 1057, 443, textureX, textureY); // Box 426
		bodyModel[375] = new ModelRendererTurbo(this, 1065, 443, textureX, textureY); // Box 427
		bodyModel[376] = new ModelRendererTurbo(this, 1073, 443, textureX, textureY); // Box 428
		bodyModel[377] = new ModelRendererTurbo(this, 1081, 443, textureX, textureY); // Box 429
		bodyModel[378] = new ModelRendererTurbo(this, 1089, 443, textureX, textureY); // Box 430
		bodyModel[379] = new ModelRendererTurbo(this, 1097, 443, textureX, textureY); // Box 431
		bodyModel[380] = new ModelRendererTurbo(this, 1105, 443, textureX, textureY); // Box 432
		bodyModel[381] = new ModelRendererTurbo(this, 1113, 443, textureX, textureY); // Box 433
		bodyModel[382] = new ModelRendererTurbo(this, 1121, 443, textureX, textureY); // Box 434
		bodyModel[383] = new ModelRendererTurbo(this, 1129, 443, textureX, textureY); // Box 435
		bodyModel[384] = new ModelRendererTurbo(this, 1137, 443, textureX, textureY); // Box 436
		bodyModel[385] = new ModelRendererTurbo(this, 1145, 443, textureX, textureY); // Box 437
		bodyModel[386] = new ModelRendererTurbo(this, 1153, 443, textureX, textureY); // Box 438
		bodyModel[387] = new ModelRendererTurbo(this, 1161, 443, textureX, textureY); // Box 439
		bodyModel[388] = new ModelRendererTurbo(this, 1169, 443, textureX, textureY); // Box 440
		bodyModel[389] = new ModelRendererTurbo(this, 1177, 443, textureX, textureY); // Box 441
		bodyModel[390] = new ModelRendererTurbo(this, 1185, 443, textureX, textureY); // Box 442
		bodyModel[391] = new ModelRendererTurbo(this, 1193, 443, textureX, textureY); // Box 443
		bodyModel[392] = new ModelRendererTurbo(this, 1201, 443, textureX, textureY); // Box 444
		bodyModel[393] = new ModelRendererTurbo(this, 1209, 443, textureX, textureY); // Box 445
		bodyModel[394] = new ModelRendererTurbo(this, 1217, 443, textureX, textureY); // Box 446
		bodyModel[395] = new ModelRendererTurbo(this, 1225, 443, textureX, textureY); // Box 447
		bodyModel[396] = new ModelRendererTurbo(this, 1233, 443, textureX, textureY); // Box 448
		bodyModel[397] = new ModelRendererTurbo(this, 1241, 443, textureX, textureY); // Box 449
		bodyModel[398] = new ModelRendererTurbo(this, 1249, 443, textureX, textureY); // Box 450
		bodyModel[399] = new ModelRendererTurbo(this, 1257, 443, textureX, textureY); // Box 451
		bodyModel[400] = new ModelRendererTurbo(this, 1265, 443, textureX, textureY); // Box 452
		bodyModel[401] = new ModelRendererTurbo(this, 1273, 443, textureX, textureY); // Box 453
		bodyModel[402] = new ModelRendererTurbo(this, 1281, 443, textureX, textureY); // Box 454
		bodyModel[403] = new ModelRendererTurbo(this, 1289, 443, textureX, textureY); // Box 455
		bodyModel[404] = new ModelRendererTurbo(this, 1297, 443, textureX, textureY); // Box 456
		bodyModel[405] = new ModelRendererTurbo(this, 1305, 443, textureX, textureY); // Box 457
		bodyModel[406] = new ModelRendererTurbo(this, 1313, 443, textureX, textureY); // Box 458
		bodyModel[407] = new ModelRendererTurbo(this, 1321, 443, textureX, textureY); // Box 459
		bodyModel[408] = new ModelRendererTurbo(this, 1329, 443, textureX, textureY); // Box 460
		bodyModel[409] = new ModelRendererTurbo(this, 1337, 443, textureX, textureY); // Box 461
		bodyModel[410] = new ModelRendererTurbo(this, 1345, 443, textureX, textureY); // Box 462
		bodyModel[411] = new ModelRendererTurbo(this, 1353, 443, textureX, textureY); // Box 463
		bodyModel[412] = new ModelRendererTurbo(this, 1361, 443, textureX, textureY); // Box 464
		bodyModel[413] = new ModelRendererTurbo(this, 1369, 443, textureX, textureY); // Box 465
		bodyModel[414] = new ModelRendererTurbo(this, 1377, 443, textureX, textureY); // Box 466
		bodyModel[415] = new ModelRendererTurbo(this, 1385, 443, textureX, textureY); // Box 467
		bodyModel[416] = new ModelRendererTurbo(this, 1393, 443, textureX, textureY); // Box 468
		bodyModel[417] = new ModelRendererTurbo(this, 1401, 443, textureX, textureY); // Box 469
		bodyModel[418] = new ModelRendererTurbo(this, 1409, 443, textureX, textureY); // Box 470
		bodyModel[419] = new ModelRendererTurbo(this, 1417, 443, textureX, textureY); // Box 471
		bodyModel[420] = new ModelRendererTurbo(this, 1425, 443, textureX, textureY); // Box 472
		bodyModel[421] = new ModelRendererTurbo(this, 1433, 443, textureX, textureY); // Box 473
		bodyModel[422] = new ModelRendererTurbo(this, 1441, 443, textureX, textureY); // Box 474
		bodyModel[423] = new ModelRendererTurbo(this, 1449, 443, textureX, textureY); // Box 475
		bodyModel[424] = new ModelRendererTurbo(this, 1457, 443, textureX, textureY); // Box 476
		bodyModel[425] = new ModelRendererTurbo(this, 1465, 443, textureX, textureY); // Box 477
		bodyModel[426] = new ModelRendererTurbo(this, 1473, 443, textureX, textureY); // Box 478
		bodyModel[427] = new ModelRendererTurbo(this, 1481, 443, textureX, textureY); // Box 480
		bodyModel[428] = new ModelRendererTurbo(this, 1489, 443, textureX, textureY); // Box 481
		bodyModel[429] = new ModelRendererTurbo(this, 1497, 443, textureX, textureY); // Box 482
		bodyModel[430] = new ModelRendererTurbo(this, 1505, 443, textureX, textureY); // Box 483
		bodyModel[431] = new ModelRendererTurbo(this, 1513, 443, textureX, textureY); // Box 484
		bodyModel[432] = new ModelRendererTurbo(this, 1521, 443, textureX, textureY); // Box 485
		bodyModel[433] = new ModelRendererTurbo(this, 1529, 443, textureX, textureY); // Box 486
		bodyModel[434] = new ModelRendererTurbo(this, 1537, 443, textureX, textureY); // Box 487
		bodyModel[435] = new ModelRendererTurbo(this, 1545, 443, textureX, textureY); // Box 488
		bodyModel[436] = new ModelRendererTurbo(this, 1553, 443, textureX, textureY); // Box 489
		bodyModel[437] = new ModelRendererTurbo(this, 1561, 443, textureX, textureY); // Box 460
		bodyModel[438] = new ModelRendererTurbo(this, 1569, 443, textureX, textureY); // Box 461
		bodyModel[439] = new ModelRendererTurbo(this, 1577, 443, textureX, textureY); // Box 462
		bodyModel[440] = new ModelRendererTurbo(this, 1585, 443, textureX, textureY); // Box 463
		bodyModel[441] = new ModelRendererTurbo(this, 1593, 443, textureX, textureY); // Box 464
		bodyModel[442] = new ModelRendererTurbo(this, 1601, 443, textureX, textureY); // Box 465
		bodyModel[443] = new ModelRendererTurbo(this, 1609, 443, textureX, textureY); // Box 466
		bodyModel[444] = new ModelRendererTurbo(this, 1617, 443, textureX, textureY); // Box 467
		bodyModel[445] = new ModelRendererTurbo(this, 1625, 443, textureX, textureY); // Box 468
		bodyModel[446] = new ModelRendererTurbo(this, 1633, 443, textureX, textureY); // Box 469
		bodyModel[447] = new ModelRendererTurbo(this, 1641, 443, textureX, textureY); // Box 470
		bodyModel[448] = new ModelRendererTurbo(this, 1649, 443, textureX, textureY); // Box 471
		bodyModel[449] = new ModelRendererTurbo(this, 1657, 443, textureX, textureY); // Box 472
		bodyModel[450] = new ModelRendererTurbo(this, 1665, 443, textureX, textureY); // Box 473
		bodyModel[451] = new ModelRendererTurbo(this, 1673, 443, textureX, textureY); // Box 474
		bodyModel[452] = new ModelRendererTurbo(this, 1681, 443, textureX, textureY); // Box 475
		bodyModel[453] = new ModelRendererTurbo(this, 1689, 443, textureX, textureY); // Box 476
		bodyModel[454] = new ModelRendererTurbo(this, 1697, 443, textureX, textureY); // Box 477
		bodyModel[455] = new ModelRendererTurbo(this, 1705, 443, textureX, textureY); // Box 478
		bodyModel[456] = new ModelRendererTurbo(this, 1713, 443, textureX, textureY); // Box 479
		bodyModel[457] = new ModelRendererTurbo(this, 1721, 443, textureX, textureY); // Box 480
		bodyModel[458] = new ModelRendererTurbo(this, 1729, 443, textureX, textureY); // Box 481
		bodyModel[459] = new ModelRendererTurbo(this, 1737, 443, textureX, textureY); // Box 482
		bodyModel[460] = new ModelRendererTurbo(this, 1745, 443, textureX, textureY); // Box 483
		bodyModel[461] = new ModelRendererTurbo(this, 1753, 443, textureX, textureY); // Box 484
		bodyModel[462] = new ModelRendererTurbo(this, 1761, 443, textureX, textureY); // Box 485
		bodyModel[463] = new ModelRendererTurbo(this, 1769, 443, textureX, textureY); // Box 486
		bodyModel[464] = new ModelRendererTurbo(this, 1769, 443, textureX, textureY); // Box 487
		bodyModel[465] = new ModelRendererTurbo(this, 1777, 443, textureX, textureY); // Box 462
		bodyModel[466] = new ModelRendererTurbo(this, 1817, 443, textureX, textureY); // Box 463
		bodyModel[467] = new ModelRendererTurbo(this, 1841, 443, textureX, textureY); // Box 465
		bodyModel[468] = new ModelRendererTurbo(this, 1857, 443, textureX, textureY); // Box 466
		bodyModel[469] = new ModelRendererTurbo(this, 1833, 443, textureX, textureY); // Box 467
		bodyModel[470] = new ModelRendererTurbo(this, 1873, 443, textureX, textureY); // Box 468
		bodyModel[471] = new ModelRendererTurbo(this, 1881, 443, textureX, textureY); // Box 469
		bodyModel[472] = new ModelRendererTurbo(this, 1889, 443, textureX, textureY); // Box 470
		bodyModel[473] = new ModelRendererTurbo(this, 1897, 443, textureX, textureY); // Box 471
		bodyModel[474] = new ModelRendererTurbo(this, 1905, 443, textureX, textureY); // Box 472
		bodyModel[475] = new ModelRendererTurbo(this, 1913, 443, textureX, textureY); // Box 512
		bodyModel[476] = new ModelRendererTurbo(this, 1937, 443, textureX, textureY); // Box 513
		bodyModel[477] = new ModelRendererTurbo(this, 1977, 443, textureX, textureY); // Box 514
		bodyModel[478] = new ModelRendererTurbo(this, 2025, 443, textureX, textureY); // Box 491
		bodyModel[479] = new ModelRendererTurbo(this, 81, 451, textureX, textureY); // Box 492
		bodyModel[480] = new ModelRendererTurbo(this, 129, 451, textureX, textureY); // Box 493
		bodyModel[481] = new ModelRendererTurbo(this, 33, 451, textureX, textureY); // Box 494
		bodyModel[482] = new ModelRendererTurbo(this, 1153, 960, textureX, textureY); // Box 496
		bodyModel[483] = new ModelRendererTurbo(this, 1177, 960, textureX, textureY); // Box 497

		bodyModel[0].addShapeBox(0F, 0F, 0F, 49, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-67F, -31F, -11F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 49, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[1].setRotationPoint(-67F, -24F, -13F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 49, 7, 3, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[2].setRotationPoint(-67F, -19F, -13F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 49, 6, 13, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[3].setRotationPoint(-67F, -12F, -13F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 49, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[4].setRotationPoint(-67F, -6F, -9F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 49, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[5].setRotationPoint(-67F, -3F, -6F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 11, 5, 14, 0F,0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[6].setRotationPoint(-78F, -24F, -14F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 11, 7, 13, 0F,0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[7].setRotationPoint(-78F, -31F, -13F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 11, 4, 11, 0F,0F, -1F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[8].setRotationPoint(-78F, -35F, -11F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 7, 4, 7, 0F,0F, 0F, -5.9999F, -6.9999F, 0F, -5.9999F, -6.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.9999F, 0F, 0F, -5.9999F); // Box 9
		bodyModel[9].setRotationPoint(-67F, -35F, -11F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 11, 7, 14, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[10].setRotationPoint(-78F, -19F, -14F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 11, 6, 13, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 11
		bodyModel[11].setRotationPoint(-78F, -12F, -13F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 11, 3, 9, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 12
		bodyModel[12].setRotationPoint(-78F, -6F, -9F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 20, 7, 11, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[13].setRotationPoint(-18F, -31F, -11F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 20, 5, 13, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[14].setRotationPoint(-18F, -24F, -13F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 20, 5, 11, 0F,0F, 0F, -4F, 0F, -1F, -4F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[15].setRotationPoint(-18F, -36F, -11F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 20, 3, 6, 0F,0F, 0F, -3F, 0F, -1F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[16].setRotationPoint(-18F, -39F, -6F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 30, 5, 11, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[17].setRotationPoint(2F, -24F, -11F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 30, 7, 11, 0F,0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[18].setRotationPoint(2F, -31F, -11F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 30, 4, 10, 0F,0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[19].setRotationPoint(2F, -35F, -10F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 30, 3, 7, 0F,0F, 0F, -4F, 0F, -1F, -4F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[20].setRotationPoint(2F, -38F, -7F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 20, 7, 13, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[21].setRotationPoint(-18F, -19F, -13F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 30, 7, 11, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[22].setRotationPoint(2F, -19F, -11F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 20, 6, 11, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -4F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[23].setRotationPoint(-18F, -12F, -11F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 30, 4, 10, 0F,0F, 0F, 0F, 0F, 2F, -2F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, -5F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[24].setRotationPoint(2F, -12F, -10F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 20, 3, 9, 0F,0F, 0F, 0F, 0F, 2F, -2F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -5F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[25].setRotationPoint(-18F, -6F, -9F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 30, 3, 7, 0F,0F, 0F, 0F, 0F, 3F, -2F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -4F, -5F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[26].setRotationPoint(2F, -8F, -7F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 20, 1, 6, 0F,0F, 0F, 0F, 0F, 1.9999F, -1.9999F, 0F, 1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, -2.9999F, 0F, -2.9999F, -1.9999F, 0F, -2.9999F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[27].setRotationPoint(-18F, -3F, -6F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 10, 5, 21, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, -1F); // Box 62
		bodyModel[28].setRotationPoint(-52F, -13F, -31F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 10, 5, 22, 0F,0F, 2F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 2F, -2F, 0F, -2F, -6F, 0F, 0F, -6F, 0F, 0F, -3F, 0F, -2F, -5F); // Box 63
		bodyModel[29].setRotationPoint(-52F, -8F, -31F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 10, 6, 21, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[30].setRotationPoint(-52F, -21F, -31F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 15, 5, 22, 0F,0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -6F, 0F, 1F, -5F, 0F, 1F, -3F, 0F, 0F, -3F); // Box 65
		bodyModel[31].setRotationPoint(-42F, -8F, -31F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 15, 5, 21, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, -5F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 66
		bodyModel[32].setRotationPoint(-27F, -7F, -30F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 15, 5, 21, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[33].setRotationPoint(-42F, -13F, -31F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 15, 6, 21, 0F,0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[34].setRotationPoint(-42F, -19F, -31F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 15, 5, 20, 0F,0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 69
		bodyModel[35].setRotationPoint(-27F, -12F, -30F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 15, 6, 21, 0F,0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[36].setRotationPoint(-27F, -18F, -31F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 15, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 71
		bodyModel[37].setRotationPoint(-27F, -2F, -26F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 15, 3, 14, 0F,0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, -5F, 0F, 0F, -5F, 0F, 0F, -4F, 0F, -1F, -4F); // Box 72
		bodyModel[38].setRotationPoint(-42F, -2F, -26F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 10, 3, 13, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -2F, 0F, -3F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -3F, -5F); // Box 73
		bodyModel[39].setRotationPoint(-52F, -3F, -25F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 20, 5, 17, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 5F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -6F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 74
		bodyModel[40].setRotationPoint(-12F, -12F, -29F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 19, 5, 17, 0F,0F, 0F, 1F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -5F, 0F, -2F, -2F, 0F, 0F, -2F); // Box 75
		bodyModel[41].setRotationPoint(8F, -12F, -24F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 20, 6, 17, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		bodyModel[42].setRotationPoint(-12F, -18F, -29F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 19, 6, 21, 0F,0F, 0F, 0F, 0F, -2F, -11F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -9F, 0F, 0F, -1F, 0F, 0F, 1F); // Box 77
		bodyModel[43].setRotationPoint(8F, -18F, -29F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 20, 5, 16, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, -2F, -7F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[44].setRotationPoint(-12F, -7F, -28F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 19, 3, 16, 0F,0F, 0F, 0F, 0F, 2F, -4F, 0F, 2F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -3F, -6F, 0F, -3F, -4F, 0F, 0F, -5F); // Box 79
		bodyModel[45].setRotationPoint(8F, -7F, -23F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 20, 3, 13, 0F,0F, 0F, 0F, 0F, 2F, -4F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -3F, -7F, 0F, -3F, -2F, 0F, 0F, -4F); // Box 80
		bodyModel[46].setRotationPoint(-12F, -2F, -25F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 19, 2, 9, 0F,0F, 0F, 0F, 0F, 3F, -4F, 0F, 3F, 1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -4F, -6F, 0F, -4F, 0F, 0F, 0F, -2F); // Box 81
		bodyModel[47].setRotationPoint(8F, -4F, -21F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 10, 6, 5, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 82
		bodyModel[48].setRotationPoint(-62F, -21F, -15F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 10, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, -1F, -3F); // Box 83
		bodyModel[49].setRotationPoint(-62F, -15F, -15F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 10, 6, 8, 0F,0F, 0F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, -1F, 0F, -4F, 0F, -3F, 2F, 0F, 0F, 2F, 0F, 0F, -5F, 0F, -3F, -8F); // Box 84
		bodyModel[50].setRotationPoint(-62F, -11F, -17F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 10, 2, 8, 0F,0F, 3F, -1F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 3F, 0F, -1F, -4F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, -1F, -4F, -2F); // Box 85
		bodyModel[51].setRotationPoint(-62F, -5F, -25F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 10, 5, 7, 0F,-1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, -5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 86
		bodyModel[52].setRotationPoint(-62F, -15F, -31F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 10, 6, 7, 0F,-1F, -2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[53].setRotationPoint(-62F, -21F, -31F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 10, 6, 5, 0F,-1F, 0F, -3F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, -5F, 0F, 0F, -4F, 0F, 0F, 2F, 0F, -3F, 2F); // Box 88
		bodyModel[54].setRotationPoint(-62F, -11F, -29F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 10, 5, 7, 0F,-0.9999F, -1.9999F, -6.9999F, 0F, 1.9999F, 0F, 0F, 1.9999F, 0F, -0.9999F, -1.9999F, 0F, -1F, 0F, -3.9999F, 0F, -1.9999F, 0F, 0F, -1.9999F, 0F, 0F, 0F, 0F); // Box 89
		bodyModel[55].setRotationPoint(-62F, -24F, -31F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 10, 8, 19, 0F,0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 90
		bodyModel[56].setRotationPoint(-52F, -27F, -31F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 15, 9, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[57].setRotationPoint(-42F, -28F, -31F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 15, 10, 21, 0F,0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		bodyModel[58].setRotationPoint(-27F, -28F, -31F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 20, 8, 18, 0F,0F, 0F, 0F, 0F, -3F, -1F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 93
		bodyModel[59].setRotationPoint(-12F, -26F, -30F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 19, 5, 21, 0F,0F, 0F, 0F, 0F, -6F, -12F, 0F, -6F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -11F, 0F, 2F, -2F, 0F, 0F, 0F); // Box 94
		bodyModel[60].setRotationPoint(8F, -23F, -29F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 11, 1, 6, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 97
		bodyModel[61].setRotationPoint(-78F, -3F, -6F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 11, 5, 1, 0F,-9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, -2F, 3F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, -2F, -3F); // Box 109
		bodyModel[62].setRotationPoint(-29F, -36F, -7F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 11, 2, 1, 0F,0F, 0F, -0.9999F, 0F, -1.9999F, 0F, 0F, -1.9999F, 0F, 0F, 0F, 0.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[63].setRotationPoint(-29F, -33F, -11F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[64].setRotationPoint(-38F, -33F, -11F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, 0.25F, -4F, 0F, 0F, -4F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 112
		bodyModel[65].setRotationPoint(-20F, -39F, -7F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[66].setRotationPoint(-20F, -39F, -3F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[67].setRotationPoint(-38F, -37F, -10F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 5, 2, 4, 0F,0F, 0F, -2F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, -2F); // Box 115
		bodyModel[68].setRotationPoint(-38F, -39F, -8F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 7, 1, 5, 0F,0F, 1F, -3F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F); // Box 116
		bodyModel[69].setRotationPoint(-38F, -41F, -5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 11, 1, 5, 0F,0F, 0F, -2F, 0F, -0.75F, -2F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.45F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 117
		bodyModel[70].setRotationPoint(-31F, -40F, -5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 17, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		bodyModel[71].setRotationPoint(-55F, -33F, -11F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, -0.9999F, 0F, -0.9999F, 0F, 0F, -0.9999F, 0F, 0F, 0F, 0.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[72].setRotationPoint(-38F, -38F, -8F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 1F, -1.9999F, 0F, -0.9999F, -0.9999F, 0F, -0.9999F, 0.9999F, 0F, 1F, 1.9999F, 0F, 0F, 0F, 0F, 0F, -0.9999F, 0F, 0F, 0.9999F, 0F, 0F, 0F); // Box 120
		bodyModel[73].setRotationPoint(-38F, -40F, -6F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[74].setRotationPoint(-52F, -39F, -7F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[75].setRotationPoint(-45F, -37F, -10F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, -1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[76].setRotationPoint(-55F, -37F, -10F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 124
		bodyModel[77].setRotationPoint(-55F, -38F, -8F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[78].setRotationPoint(-45F, -38F, -8F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,0F, -2F, -1F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -2F, 0F); // Box 126
		bodyModel[79].setRotationPoint(-55F, -41F, -6F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -2F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 127
		bodyModel[80].setRotationPoint(-55F, -39F, -7F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[81].setRotationPoint(-55F, -41F, -2F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -2F); // Box 129
		bodyModel[82].setRotationPoint(-57F, -41F, -5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); // Box 130
		bodyModel[83].setRotationPoint(-67F, -39F, -5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[84].setRotationPoint(-45F, -42F, -6F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[85].setRotationPoint(-45F, -42F, -2F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 49, 3, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		bodyModel[86].setRotationPoint(-67F, -15F, -10F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 17, 16, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
		bodyModel[87].setRotationPoint(-35F, -31F, -10F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 17, 4, 10, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		bodyModel[88].setRotationPoint(-35F, -35F, -10F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 49, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 186
		bodyModel[89].setRotationPoint(-67F, -31F, 10F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 49, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 187
		bodyModel[90].setRotationPoint(-67F, -24F, 10F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 49, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 188
		bodyModel[91].setRotationPoint(-67F, -19F, 10F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 49, 6, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 189
		bodyModel[92].setRotationPoint(-67F, -12F, 0F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 49, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 190
		bodyModel[93].setRotationPoint(-67F, -6F, 0F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 49, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -2F); // Box 191
		bodyModel[94].setRotationPoint(-67F, -3F, 0F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 11, 5, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 192
		bodyModel[95].setRotationPoint(-78F, -24F, 0F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 11, 7, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 193
		bodyModel[96].setRotationPoint(-78F, -31F, 0F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 11, 4, 11, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -1F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 194
		bodyModel[97].setRotationPoint(-78F, -35F, 0F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 7, 4, 7, 0F,0F, 0F, 0F, -6.9999F, 0F, 0F, -6.9999F, 0F, -5.9999F, 0F, 0F, -5.9999F, 0F, 0F, -5.9999F, 0F, 0F, -5.9999F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		bodyModel[98].setRotationPoint(-67F, -35F, 4F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 11, 7, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F); // Box 196
		bodyModel[99].setRotationPoint(-78F, -19F, 0F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 11, 6, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, -4F); // Box 197
		bodyModel[100].setRotationPoint(-78F, -12F, 0F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 11, 3, 9, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, -3F); // Box 198
		bodyModel[101].setRotationPoint(-78F, -6F, 0F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 20, 7, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 199
		bodyModel[102].setRotationPoint(-18F, -31F, 0F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 20, 5, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 200
		bodyModel[103].setRotationPoint(-18F, -24F, 0F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 20, 5, 11, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 201
		bodyModel[104].setRotationPoint(-18F, -36F, 0F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 20, 3, 6, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, 0F, 1F); // Box 202
		bodyModel[105].setRotationPoint(-18F, -39F, 0F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 30, 5, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 203
		bodyModel[106].setRotationPoint(2F, -24F, 0F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 30, 7, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 205
		bodyModel[107].setRotationPoint(2F, -31F, 0F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 30, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 207
		bodyModel[108].setRotationPoint(2F, -35F, 0F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 30, 3, 7, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 209
		bodyModel[109].setRotationPoint(2F, -38F, 0F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 20, 7, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -2F); // Box 211
		bodyModel[110].setRotationPoint(-18F, -19F, 0F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 30, 7, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -3F, 0F, 0F, -1F); // Box 212
		bodyModel[111].setRotationPoint(2F, -19F, 0F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 20, 6, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -4F, 0F, 0F, -2F); // Box 213
		bodyModel[112].setRotationPoint(-18F, -12F, 0F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 30, 4, 10, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -5F, 0F, 0F, -3F); // Box 223
		bodyModel[113].setRotationPoint(2F, -12F, 0F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 20, 3, 9, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -5F, 0F, 0F, -3F); // Box 225
		bodyModel[114].setRotationPoint(-18F, -6F, 0F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 30, 3, 7, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, -5F, 0F, 0F, -3F); // Box 226
		bodyModel[115].setRotationPoint(2F, -8F, 0F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 20, 1, 6, 0F,0F, 0F, 0F, 0F, 1.9999F, 0F, 0F, 1.9999F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.9999F, 0F, 0F, -2.9999F, -1.9999F, 0F, 0F, -2.9999F); // Box 228
		bodyModel[116].setRotationPoint(-18F, -3F, 0F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 10, 5, 21, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -2F); // Box 247
		bodyModel[117].setRotationPoint(-52F, -13F, 10F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 10, 5, 22, 0F,0F, 2F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 2F, -2F, 0F, -2F, -5F, 0F, 0F, -3F, 0F, 0F, -6F, 0F, -2F, -6F); // Box 248
		bodyModel[118].setRotationPoint(-52F, -8F, 9F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 10, 6, 21, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[119].setRotationPoint(-52F, -21F, 10F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 15, 5, 22, 0F,0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 1F, -3F, 0F, 1F, -5F, 0F, 0F, -6F); // Box 250
		bodyModel[120].setRotationPoint(-42F, -8F, 9F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 15, 5, 21, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, -4F); // Box 251
		bodyModel[121].setRotationPoint(-27F, -7F, 9F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 15, 5, 21, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 0F, -1F); // Box 252
		bodyModel[122].setRotationPoint(-42F, -13F, 10F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 15, 6, 21, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 253
		bodyModel[123].setRotationPoint(-42F, -19F, 10F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 15, 5, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 254
		bodyModel[124].setRotationPoint(-27F, -12F, 10F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 15, 6, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 255
		bodyModel[125].setRotationPoint(-27F, -18F, 10F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 15, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 256
		bodyModel[126].setRotationPoint(-27F, -2F, 12F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 15, 3, 14, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, -1F, -4F, 0F, 0F, -4F, 0F, 0F, -5F, 0F, -1F, -5F); // Box 257
		bodyModel[127].setRotationPoint(-42F, -2F, 12F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 10, 3, 13, 0F,0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -3F, -5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -3F, -4F); // Box 258
		bodyModel[128].setRotationPoint(-52F, -3F, 12F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 20, 5, 17, 0F,0F, 0F, 2F, 0F, 0F, 5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -6F, 0F, 0F, -1F); // Box 259
		bodyModel[129].setRotationPoint(-12F, -12F, 12F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 19, 5, 17, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -5F, 0F, 0F, -1F); // Box 260
		bodyModel[130].setRotationPoint(8F, -12F, 7F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 20, 6, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 261
		bodyModel[131].setRotationPoint(-12F, -18F, 12F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 19, 6, 21, 0F,0F, 0F, 0F, 0F, -2F, -3F, 0F, -2F, -11F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -4F); // Box 262
		bodyModel[132].setRotationPoint(8F, -18F, 8F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 20, 5, 16, 0F,0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -7F, 0F, 0F, -3F); // Box 263
		bodyModel[133].setRotationPoint(-12F, -7F, 12F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 19, 3, 16, 0F,0F, 0F, -2F, 0F, 2F, -2F, 0F, 2F, -4F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -3F, -4F, 0F, -3F, -6F, 0F, 0F, -2F); // Box 264
		bodyModel[134].setRotationPoint(8F, -7F, 7F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 20, 3, 13, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -3F, -2F, 0F, -3F, -7F, 0F, 0F, -4F); // Box 265
		bodyModel[135].setRotationPoint(-12F, -2F, 12F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 19, 2, 9, 0F,0F, 0F, 0F, 0F, 3F, 1F, 0F, 3F, -4F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -4F, 0F, 0F, -4F, -6F, 0F, 0F, -3F); // Box 266
		bodyModel[136].setRotationPoint(8F, -4F, 12F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 10, 8, 19, 0F,0F, -1F, 0F, 0F, 1F, 1F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 275
		bodyModel[137].setRotationPoint(-52F, -27F, 12F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 15, 9, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, 0F, 0F); // Box 276
		bodyModel[138].setRotationPoint(-42F, -28F, 11F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 15, 10, 21, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F); // Box 277
		bodyModel[139].setRotationPoint(-27F, -28F, 10F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 20, 8, 18, 0F,0F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 278
		bodyModel[140].setRotationPoint(-12F, -26F, 12F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 19, 5, 21, 0F,0F, 0F, 0F, 0F, -6F, -4F, 0F, -6F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -3F, 0F, 2F, -11F, 0F, 0F, 0F); // Box 279
		bodyModel[141].setRotationPoint(8F, -23F, 8F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 11, 1, 6, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -2F); // Box 282
		bodyModel[142].setRotationPoint(-78F, -3F, 0F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 11, 5, 1, 0F,-9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, -2F, -3F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, -2F, 3F); // Box 294
		bodyModel[143].setRotationPoint(-29F, -36F, 6F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 11, 2, 1, 0F,0F, 0F, 0.9999F, 0F, -1.9999F, 0F, 0F, -1.9999F, 0F, 0F, 0F, -0.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 295
		bodyModel[144].setRotationPoint(-29F, -33F, 10F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 296
		bodyModel[145].setRotationPoint(-38F, -33F, 10F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -4F, 0F, 0.25F, -4F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 297
		bodyModel[146].setRotationPoint(-20F, -39F, 3F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
		bodyModel[147].setRotationPoint(-20F, -39F, 0F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		bodyModel[148].setRotationPoint(-38F, -37F, 9F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 5, 2, 4, 0F,0F, 0F, -1F, 2F, 0F, 0F, 2F, 0F, -3F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 300
		bodyModel[149].setRotationPoint(-38F, -39F, 4F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 11, 1, 5, 0F,0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -0.45F, 0F, 0F, 0F); // Box 302
		bodyModel[150].setRotationPoint(-31F, -40F, 0F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 17, 2, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 303
		bodyModel[151].setRotationPoint(-55F, -33F, 10F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0.9999F, 0F, -0.9999F, 0F, 0F, -0.9999F, 0F, 0F, 0F, -0.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 304
		bodyModel[152].setRotationPoint(-38F, -38F, 7F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 306
		bodyModel[153].setRotationPoint(-52F, -39F, 6F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 307
		bodyModel[154].setRotationPoint(-45F, -37F, 9F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, -1F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 308
		bodyModel[155].setRotationPoint(-55F, -37F, 9F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 309
		bodyModel[156].setRotationPoint(-55F, -38F, 7F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 310
		bodyModel[157].setRotationPoint(-45F, -38F, 7F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 311
		bodyModel[158].setRotationPoint(-55F, -41F, 2F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -1F, 1F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 312
		bodyModel[159].setRotationPoint(-55F, -39F, 6F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 313
		bodyModel[160].setRotationPoint(-55F, -41F, 0F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, -2F, -2F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 314
		bodyModel[161].setRotationPoint(-57F, -41F, 2F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 4F, 0F); // Box 315
		bodyModel[162].setRotationPoint(-67F, -39F, 4F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 316
		bodyModel[163].setRotationPoint(-45F, -42F, 5F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 317
		bodyModel[164].setRotationPoint(-45F, -42F, 0F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 49, 3, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 368
		bodyModel[165].setRotationPoint(-67F, -15F, 0F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 17, 16, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 369
		bodyModel[166].setRotationPoint(-35F, -31F, 0F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 17, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 370
		bodyModel[167].setRotationPoint(-35F, -35F, 0F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 10, 5, 9, 0F,-0.9999F, -1.9999F, 0F, 0F, 1.9999F, 0F, 0F, 1.9999F, 0F, -0.9999F, -1.9999F, 0F, 0F, 0F, 0F, 0F, -1.9999F, 0F, 0F, -1.9999F, 0F, 0F, 0F, 0F); // Box 371
		bodyModel[168].setRotationPoint(-62F, -24F, -24F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 10, 5, 5, 0F,-0.9999F, -1.9999F, 0F, 0F, 1.9999F, 0F, 0F, 1.9999F, 0F, -1.9999F, -1.9999F, 0F, 0F, 0F, 0F, 0F, -1.9999F, 0F, 0F, -1.9999F, 0F, -1F, 0F, 0F); // Box 372
		bodyModel[169].setRotationPoint(-62F, -24F, -15F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 10, 5, 3, 0F,0.0001F, -1.9999F, 0F, 0F, 1.9999F, 0F, 0F, 1.9999F, 0F, 0.0001F, -1.9999F, 0F, 0F, 0F, 0F, 0F, -1.9999F, 0F, 0F, -4.9999F, 0F, 0F, -3F, 0F); // Box 373
		bodyModel[170].setRotationPoint(-62F, -21F, -24F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 10, 5, 3, 0F,0.0001F, -1.9999F, 0F, 0F, 1.9999F, 0F, 0F, 1.9999F, 0F, 0.0001F, -1.9999F, 0F, 0F, -3F, 0F, 0F, -4.9999F, 0F, 0F, -1.9999F, 0F, 0F, 0F, 0F); // Box 374
		bodyModel[171].setRotationPoint(-62F, -21F, -18F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 10, 6, 5, 0F,-1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 375
		bodyModel[172].setRotationPoint(-62F, -21F, 10F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 10, 5, 5, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 376
		bodyModel[173].setRotationPoint(-62F, -15F, 10F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 10, 6, 8, 0F,-1F, 0F, -4F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, -3F, -8F, 0F, 0F, -5F, 0F, 0F, 2F, 0F, -3F, 2F); // Box 377
		bodyModel[174].setRotationPoint(-62F, -11F, 9F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 10, 2, 8, 0F,0F, 3F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 3F, -1F, -1F, -4F, -2F, 0F, 0F, 0F, 0F, 0F, -4F, -1F, -4F, -5F); // Box 378
		bodyModel[175].setRotationPoint(-62F, -5F, 17F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 10, 5, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -4F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, -1F, -5F); // Box 379
		bodyModel[176].setRotationPoint(-62F, -15F, 24F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 10, 6, 7, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -4F); // Box 380
		bodyModel[177].setRotationPoint(-62F, -21F, 24F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 10, 6, 5, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, -3F, 0F, -3F, 2F, 0F, 0F, 2F, 0F, 0F, -4F, 0F, -3F, -5F); // Box 381
		bodyModel[178].setRotationPoint(-62F, -11F, 24F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 10, 5, 7, 0F,-0.9999F, -1.9999F, 0F, 0F, 1.9999F, 0F, 0F, 1.9999F, 0F, -0.9999F, -1.9999F, -6.9999F, 0F, 0F, 0F, 0F, -1.9999F, 0F, 0F, -1.9999F, 0F, -1F, 0F, -3.9999F); // Box 382
		bodyModel[179].setRotationPoint(-62F, -24F, 24F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 10, 5, 9, 0F,-0.9999F, -1.9999F, 0F, 0F, 1.9999F, 0F, 0F, 1.9999F, 0F, -0.9999F, -1.9999F, 0F, 0F, 0F, 0F, 0F, -1.9999F, 0F, 0F, -1.9999F, 0F, 0F, 0F, 0F); // Box 383
		bodyModel[180].setRotationPoint(-62F, -24F, 15F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 10, 5, 5, 0F,-1.9999F, -1.9999F, 0F, 0F, 1.9999F, 0F, 0F, 1.9999F, 0F, -0.9999F, -1.9999F, 0F, -1F, 0F, 0F, 0F, -1.9999F, 0F, 0F, -1.9999F, 0F, 0F, 0F, 0F); // Box 384
		bodyModel[181].setRotationPoint(-62F, -24F, 10F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 10, 5, 3, 0F,0.0001F, -1.9999F, 0F, 0F, 1.9999F, 0F, 0F, 1.9999F, 0F, 0.0001F, -1.9999F, 0F, 0F, -3F, 0F, 0F, -4.9999F, 0F, 0F, -1.9999F, 0F, 0F, 0F, 0F); // Box 385
		bodyModel[182].setRotationPoint(-62F, -21F, 21F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 10, 5, 3, 0F,0.0001F, -1.9999F, 0F, 0F, 1.9999F, 0F, 0F, 1.9999F, 0F, 0.0001F, -1.9999F, 0F, 0F, 0F, 0F, 0F, -1.9999F, 0F, 0F, -4.9999F, 0F, 0F, -3F, 0F); // Box 386
		bodyModel[183].setRotationPoint(-62F, -21F, 15F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 8, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 388
		bodyModel[184].setRotationPoint(20F, -13F, -19F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 8, 3, 9, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 389
		bodyModel[185].setRotationPoint(20F, -16F, -19F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 8, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 390
		bodyModel[186].setRotationPoint(20F, -10F, -19F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 391
		bodyModel[187].setRotationPoint(28F, -13F, -19F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 392
		bodyModel[188].setRotationPoint(28F, -13F, -11F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 393
		bodyModel[189].setRotationPoint(28F, -16F, -16F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[190].setRotationPoint(28F, -16F, -19F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, 2F, -1F); // Box 395
		bodyModel[191].setRotationPoint(28F, -16F, -13F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 396
		bodyModel[192].setRotationPoint(28F, -8F, -13F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 2F, -1F, 0F, 2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 397
		bodyModel[193].setRotationPoint(28F, -8F, -19F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 398
		bodyModel[194].setRotationPoint(28F, -8F, -16F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 8, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 399
		bodyModel[195].setRotationPoint(20F, -13F, 10F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 8, 3, 9, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 400
		bodyModel[196].setRotationPoint(20F, -16F, 10F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 8, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 401
		bodyModel[197].setRotationPoint(20F, -10F, 10F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 402
		bodyModel[198].setRotationPoint(28F, -13F, 18F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 403
		bodyModel[199].setRotationPoint(28F, -13F, 10F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 404
		bodyModel[200].setRotationPoint(28F, -16F, 13F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, 2F, -1F); // Box 405
		bodyModel[201].setRotationPoint(28F, -16F, 16F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 406
		bodyModel[202].setRotationPoint(28F, -16F, 10F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 2F, -1F, 0F, 2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 407
		bodyModel[203].setRotationPoint(28F, -8F, 10F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 408
		bodyModel[204].setRotationPoint(28F, -8F, 16F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 409
		bodyModel[205].setRotationPoint(28F, -8F, 13F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 695
		bodyModel[206].setRotationPoint(-17F, -47F, -0.5F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 451
		bodyModel[207].setRotationPoint(18F, -54F, -0.5F);

		bodyModel[208].addShapeBox(0F, 1F, 0F, 10, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
		bodyModel[208].setRotationPoint(-49F, -19F, -5F);
		bodyModel[208].rotateAngleZ = -0.10471976F;

		bodyModel[209].addShapeBox(9F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		bodyModel[209].setRotationPoint(-49F, -19F, -5F);
		bodyModel[209].rotateAngleZ = -0.10471976F;

		bodyModel[210].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		bodyModel[210].setRotationPoint(-49F, -19F, -5F);
		bodyModel[210].rotateAngleZ = -0.10471976F;

		bodyModel[211].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		bodyModel[211].setRotationPoint(-49F, -19F, 4F);
		bodyModel[211].rotateAngleZ = -0.10471976F;

		bodyModel[212].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		bodyModel[212].setRotationPoint(-49F, -19F, -5F);
		bodyModel[212].rotateAngleZ = -0.10471976F;

		bodyModel[213].addShapeBox(0F, 0F, 0F, 1, 15, 10, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		bodyModel[213].setRotationPoint(-40F, -33F, -5F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[214].setRotationPoint(-38F, -37F, -3F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 1, 15, 8, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 246
		bodyModel[215].setRotationPoint(-41F, -32F, -4F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[216].setRotationPoint(-41.3F, -32.3F, -2F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[217].setRotationPoint(-41.3F, -32.3F, 1F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[218].setRotationPoint(-39F, -30F, -4F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 251
		bodyModel[219].setRotationPoint(-39F, -30F, 3F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[220].setRotationPoint(-46F, -18F, -6F);
		bodyModel[220].rotateAngleZ = 0.78539816F;

		bodyModel[221].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 253
		bodyModel[221].setRotationPoint(-46F, -18F, 5F);
		bodyModel[221].rotateAngleZ = 0.78539816F;

		bodyModel[222].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 962
		bodyModel[222].setRotationPoint(-38.5F, -36.5F, -1.5F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 964
		bodyModel[223].setRotationPoint(-38.5F, -35.5F, -1.5F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 966
		bodyModel[224].setRotationPoint(-38.5F, -34.5F, -1.5F);

		bodyModel[225].addShapeBox(0F, -3F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 259
		bodyModel[225].setRotationPoint(-60F, -16F, -6F);
		bodyModel[225].rotateAngleZ = 0.15707963F;

		bodyModel[226].addShapeBox(0F, -3F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
		bodyModel[226].setRotationPoint(-60F, -16F, 4F);
		bodyModel[226].rotateAngleZ = 0.15707963F;

		bodyModel[227].addShapeBox(0F, 0F, 0F, 5, 9, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 256
		bodyModel[227].setRotationPoint(-61F, -24F, -2F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 601
		bodyModel[228].setRotationPoint(-51F, -27.3F, -10F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 602
		bodyModel[229].setRotationPoint(-50.5F, -25.3F, -10.5F);

		bodyModel[230].addShapeBox(-1F, -2F, 0F, 1, 2, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 603
		bodyModel[230].setRotationPoint(-49.5F, -25.3F, -9.7F);
		bodyModel[230].rotateAngleZ = 0.36651914F;

		bodyModel[231].addShapeBox(-1F, -2F, 0F, 1, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 604
		bodyModel[231].setRotationPoint(-49.5F, -25.3F, -9.2F);
		bodyModel[231].rotateAngleZ = 0.36651914F;

		bodyModel[232].addShapeBox(0F, 0F, 0F, 15, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 967
		bodyModel[232].setRotationPoint(-49.5F, -22.3F, -10.5F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 8, 4, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 968
		bodyModel[233].setRotationPoint(-50.5F, -22.3F, -10.5F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[234].setRotationPoint(-55F, -17F, -2F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 7, 3, 3, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 254
		bodyModel[235].setRotationPoint(-55F, -18F, -1.5F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 263
		bodyModel[236].setRotationPoint(-53.5F, -21F, -1F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 264
		bodyModel[237].setRotationPoint(-53F, -25F, -0.5F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 265
		bodyModel[238].setRotationPoint(-53F, -27F, -0.5F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 266
		bodyModel[239].setRotationPoint(-52.7F, -27.1F, -0.5F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 15, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 487
		bodyModel[240].setRotationPoint(-49.5F, -22.3F, 6.5F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 1, 8, 4, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 488
		bodyModel[241].setRotationPoint(-50.5F, -22.3F, 6.5F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 6, 9, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 489
		bodyModel[242].setRotationPoint(-67F, -24F, -10F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 5, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 262
		bodyModel[243].setRotationPoint(-62F, -25F, -10F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 1, 6, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 255
		bodyModel[244].setRotationPoint(-57F, -30F, -10F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 1, 2, 20, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 257
		bodyModel[245].setRotationPoint(-57F, -32F, -10F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F,0F, 0.5F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 258
		bodyModel[246].setRotationPoint(-57F, -33F, -8F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 213
		bodyModel[247].setRotationPoint(-56.8F, -30.3F, -4F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, -0.4F, -3F, 0F, -0.4F, -3F, 0F, -0.4F, -3F, 0F, -0.4F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 214
		bodyModel[248].setRotationPoint(-56.8F, -31.3F, -4F);

		bodyModel[249].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F); // Box 233
		bodyModel[249].setRotationPoint(-56.7F, -29.1F, 2.7F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F); // Box 234
		bodyModel[250].setRotationPoint(-56.6F, -30.1F, -0.9F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F); // Box 235
		bodyModel[251].setRotationPoint(-56.6F, -30.1F, -0.9F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F); // Box 236
		bodyModel[252].setRotationPoint(-56.6F, -30.1F, -0.9F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 237
		bodyModel[253].setRotationPoint(-56.6F, -29.1F, -0.9F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 238
		bodyModel[254].setRotationPoint(-56.6F, -29.1F, -0.9F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 239
		bodyModel[255].setRotationPoint(-56.6F, -29.1F, 0.0999999999999996F);

		bodyModel[256].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 240
		bodyModel[256].setRotationPoint(-56.7F, -29.1F, 0.0999999999999996F);
		bodyModel[256].rotateAngleX = 5.49778714F;

		bodyModel[257].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 241
		bodyModel[257].setRotationPoint(-56.7F, -29.1F, 0.0999999999999996F);

		bodyModel[258].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F); // Box 242
		bodyModel[258].setRotationPoint(-56.7F, -29.1F, 0.0999999999999996F);

		bodyModel[259].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 243
		bodyModel[259].setRotationPoint(-56.6F, -29.1F, 0.0999999999999996F);

		bodyModel[260].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 244
		bodyModel[260].setRotationPoint(-56.7F, -29.1F, 0.0999999999999996F);
		bodyModel[260].rotateAngleX = 3.14159265F;

		bodyModel[261].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 248
		bodyModel[261].setRotationPoint(-56.6F, -30.1F, 0.0999999999999996F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 249
		bodyModel[262].setRotationPoint(-56.6F, -30.1F, 0.0999999999999996F);

		bodyModel[263].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 250
		bodyModel[263].setRotationPoint(-56.7F, -29.1F, 0.0999999999999996F);
		bodyModel[263].rotateAngleX = 4.71238898F;

		bodyModel[264].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 251
		bodyModel[264].setRotationPoint(-56.7F, -29.1F, 0.0999999999999996F);
		bodyModel[264].rotateAngleX = 3.92699082F;

		bodyModel[265].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F); // Box 252
		bodyModel[265].setRotationPoint(-56.6F, -30.1F, 1.7F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F); // Box 253
		bodyModel[266].setRotationPoint(-56.6F, -30.1F, 1.7F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F); // Box 254
		bodyModel[267].setRotationPoint(-56.6F, -30.1F, 1.7F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 255
		bodyModel[268].setRotationPoint(-56.6F, -30.1F, 2.7F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 256
		bodyModel[269].setRotationPoint(-56.6F, -30.1F, 2.7F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 257
		bodyModel[270].setRotationPoint(-56.6F, -29.1F, 2.7F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 258
		bodyModel[271].setRotationPoint(-56.6F, -29.1F, 1.7F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 259
		bodyModel[272].setRotationPoint(-56.6F, -29.1F, 1.7F);

		bodyModel[273].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 260
		bodyModel[273].setRotationPoint(-56.7F, -29.1F, 2.7F);
		bodyModel[273].rotateAngleX = 3.92699082F;

		bodyModel[274].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 261
		bodyModel[274].setRotationPoint(-56.7F, -29.1F, 2.7F);
		bodyModel[274].rotateAngleX = 4.71238898F;

		bodyModel[275].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 262
		bodyModel[275].setRotationPoint(-56.7F, -29.1F, 2.7F);
		bodyModel[275].rotateAngleX = 5.49778714F;

		bodyModel[276].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 263
		bodyModel[276].setRotationPoint(-56.7F, -29.1F, 2.7F);

		bodyModel[277].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 265
		bodyModel[277].setRotationPoint(-56.6F, -29.1F, 2.7F);

		bodyModel[278].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 266
		bodyModel[278].setRotationPoint(-56.7F, -29.1F, 2.7F);
		bodyModel[278].rotateAngleX = 0.78539816F;

		bodyModel[279].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 267
		bodyModel[279].setRotationPoint(-56.7F, -29.1F, 2.7F);
		bodyModel[279].rotateAngleX = 1.57079633F;

		bodyModel[280].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 268
		bodyModel[280].setRotationPoint(-56.7F, -29.1F, 2.7F);
		bodyModel[280].rotateAngleX = 2.35619449F;

		bodyModel[281].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 269
		bodyModel[281].setRotationPoint(-56.7F, -29.1F, 2.7F);
		bodyModel[281].rotateAngleX = 3.14159265F;

		bodyModel[282].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.45F, 0.3F, 0F, -0.45F, 0.3F, 0F, -0.45F, 0.3F, 0F, -0.45F, 0.3F, 0F, -0.45F, 0.3F, 0F, -0.45F, 0.3F, 0F, -0.45F, 0.3F, 0F, -0.45F, 0.3F); // Box 270
		bodyModel[282].setRotationPoint(-56.7F, -29.1F, 0.0999999999999996F);
		bodyModel[282].rotateAngleX = -0.38397244F;

		bodyModel[283].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F); // Box 271
		bodyModel[283].setRotationPoint(-56.7F, -29.9F, -0.9F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, -0.9F, 0F, -0.5F, -0.9F, 0F, -0.5F, -0.9F, 0F, -0.5F, -0.9F); // Box 272
		bodyModel[284].setRotationPoint(-56.7F, -29.7F, -0.9F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 273
		bodyModel[285].setRotationPoint(-56.6F, -26.5F, -3.7F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 274
		bodyModel[286].setRotationPoint(-56.6F, -26.5F, -3.7F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F); // Box 275
		bodyModel[287].setRotationPoint(-56.6F, -27.5F, -3.7F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F); // Box 276
		bodyModel[288].setRotationPoint(-56.6F, -27.5F, -3.7F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F); // Box 277
		bodyModel[289].setRotationPoint(-56.6F, -27.5F, -3.7F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 278
		bodyModel[290].setRotationPoint(-56.6F, -27.5F, -2.7F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 279
		bodyModel[291].setRotationPoint(-56.6F, -27.5F, -2.7F);

		bodyModel[292].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 280
		bodyModel[292].setRotationPoint(-56.7F, -26.5F, -2.7F);
		bodyModel[292].rotateAngleX = 0.78539816F;

		bodyModel[293].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 281
		bodyModel[293].setRotationPoint(-56.6F, -26.5F, -2.7F);

		bodyModel[294].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 282
		bodyModel[294].setRotationPoint(-56.7F, -26.5F, -2.7F);
		bodyModel[294].rotateAngleX = 5.49778714F;

		bodyModel[295].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 283
		bodyModel[295].setRotationPoint(-56.7F, -26.5F, -2.7F);

		bodyModel[296].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 284
		bodyModel[296].setRotationPoint(-56.7F, -26.5F, -2.7F);
		bodyModel[296].rotateAngleX = 1.57079633F;

		bodyModel[297].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 285
		bodyModel[297].setRotationPoint(-56.7F, -26.5F, -2.7F);
		bodyModel[297].rotateAngleX = 2.35619449F;

		bodyModel[298].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 286
		bodyModel[298].setRotationPoint(-56.7F, -26.5F, -2.7F);
		bodyModel[298].rotateAngleX = 3.14159265F;

		bodyModel[299].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 287
		bodyModel[299].setRotationPoint(-56.6F, -26.5F, -2.7F);

		bodyModel[300].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F); // Box 288
		bodyModel[300].setRotationPoint(-56.7F, -26.5F, -2.7F);
		bodyModel[300].rotateAngleX = -3.90953752F;

		bodyModel[301].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 289
		bodyModel[301].setRotationPoint(-56.7F, -26.5F, -2.7F);
		bodyModel[301].rotateAngleX = 4.71238898F;

		bodyModel[302].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 290
		bodyModel[302].setRotationPoint(-56.7F, -26.5F, -2.7F);
		bodyModel[302].rotateAngleX = 3.92699082F;

		bodyModel[303].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 318
		bodyModel[303].setRotationPoint(-56.8F, -29.1F, 4.8F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 319
		bodyModel[304].setRotationPoint(-56.8F, -29.1F, 4.8F);

		bodyModel[305].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 320
		bodyModel[305].setRotationPoint(-56.9F, -29.1F, 5.8F);
		bodyModel[305].rotateAngleX = 3.92699082F;

		bodyModel[306].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F); // Box 321
		bodyModel[306].setRotationPoint(-56.8F, -30.1F, 4.8F);

		bodyModel[307].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 322
		bodyModel[307].setRotationPoint(-56.9F, -29.1F, 5.8F);
		bodyModel[307].rotateAngleX = 3.14159265F;

		bodyModel[308].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F); // Box 323
		bodyModel[308].setRotationPoint(-56.8F, -30.1F, 4.8F);

		bodyModel[309].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 324
		bodyModel[309].setRotationPoint(-56.9F, -29.1F, 5.8F);
		bodyModel[309].rotateAngleX = 2.35619449F;

		bodyModel[310].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F); // Box 325
		bodyModel[310].setRotationPoint(-56.8F, -30.1F, 4.8F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 326
		bodyModel[311].setRotationPoint(-56.8F, -30.1F, 5.8F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 327
		bodyModel[312].setRotationPoint(-56.8F, -30.1F, 5.8F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 328
		bodyModel[313].setRotationPoint(-56.8F, -29.1F, 5.8F);

		bodyModel[314].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 329
		bodyModel[314].setRotationPoint(-56.9F, -29.1F, 5.8F);
		bodyModel[314].rotateAngleX = 5.49778714F;

		bodyModel[315].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 330
		bodyModel[315].setRotationPoint(-56.9F, -29.1F, 5.8F);

		bodyModel[316].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 331
		bodyModel[316].setRotationPoint(-56.9F, -29.1F, 5.8F);
		bodyModel[316].rotateAngleX = 0.78539816F;

		bodyModel[317].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 332
		bodyModel[317].setRotationPoint(-56.9F, -29.1F, 5.8F);
		bodyModel[317].rotateAngleX = 1.57079633F;

		bodyModel[318].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F); // Box 333
		bodyModel[318].setRotationPoint(-56.9F, -29.1F, 5.8F);
		bodyModel[318].rotateAngleX = -3.90953752F;

		bodyModel[319].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 334
		bodyModel[319].setRotationPoint(-56.8F, -29.1F, 5.8F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 340
		bodyModel[320].setRotationPoint(-56.8F, -32.6F, 4.4F);

		bodyModel[321].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F); // Box 341
		bodyModel[321].setRotationPoint(-56.9F, -31.6F, 4.4F);
		bodyModel[321].rotateAngleX = -1.57079633F;

		bodyModel[322].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 342
		bodyModel[322].setRotationPoint(-56.8F, -31.6F, 4.4F);

		bodyModel[323].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 343
		bodyModel[323].setRotationPoint(-56.9F, -31.6F, 4.4F);
		bodyModel[323].rotateAngleX = 5.49778714F;

		bodyModel[324].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 344
		bodyModel[324].setRotationPoint(-56.8F, -31.6F, 4.4F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 345
		bodyModel[325].setRotationPoint(-56.8F, -31.6F, 3.4F);

		bodyModel[326].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 346
		bodyModel[326].setRotationPoint(-56.9F, -31.6F, 4.4F);
		bodyModel[326].rotateAngleX = 4.71238898F;

		bodyModel[327].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 347
		bodyModel[327].setRotationPoint(-56.9F, -31.6F, 4.4F);
		bodyModel[327].rotateAngleX = 3.92699082F;

		bodyModel[328].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 348
		bodyModel[328].setRotationPoint(-56.8F, -31.6F, 3.4F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F); // Box 349
		bodyModel[329].setRotationPoint(-56.8F, -32.6F, 3.4F);

		bodyModel[330].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 350
		bodyModel[330].setRotationPoint(-56.9F, -31.6F, 4.4F);
		bodyModel[330].rotateAngleX = 3.14159265F;

		bodyModel[331].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F); // Box 351
		bodyModel[331].setRotationPoint(-56.8F, -32.6F, 3.4F);

		bodyModel[332].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 352
		bodyModel[332].setRotationPoint(-56.9F, -31.6F, 4.4F);
		bodyModel[332].rotateAngleX = 2.35619449F;

		bodyModel[333].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F); // Box 353
		bodyModel[333].setRotationPoint(-56.8F, -32.6F, 3.4F);

		bodyModel[334].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 354
		bodyModel[334].setRotationPoint(-56.9F, -31.6F, 4.4F);
		bodyModel[334].rotateAngleX = 1.57079633F;

		bodyModel[335].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 355
		bodyModel[335].setRotationPoint(-56.8F, -32.6F, 4.4F);

		bodyModel[336].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 356
		bodyModel[336].setRotationPoint(-56.9F, -31.6F, 4.4F);
		bodyModel[336].rotateAngleX = 0.78539816F;

		bodyModel[337].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 387
		bodyModel[337].setRotationPoint(-56.8F, -29.6F, -6.3F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F); // Box 388
		bodyModel[338].setRotationPoint(-56.8F, -29.6F, -7.3F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 390
		bodyModel[339].setRotationPoint(-56.8F, -29.6F, -6.3F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F); // Box 391
		bodyModel[340].setRotationPoint(-56.8F, -29.6F, -7.3F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 392
		bodyModel[341].setRotationPoint(-56.8F, -28.6F, -7.3F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 393
		bodyModel[342].setRotationPoint(-56.8F, -28.6F, -7.3F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 394
		bodyModel[343].setRotationPoint(-56.8F, -28.6F, -6.3F);

		bodyModel[344].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 395
		bodyModel[344].setRotationPoint(-56.8F, -29.2F, -6.3F);

		bodyModel[345].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, 0F, 0F, -0.48F, 0F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, 0F, 0F, -0.48F, 0F); // Box 396
		bodyModel[345].setRotationPoint(-56.9F, -29.2F, -6.3F);
		bodyModel[345].rotateAngleX = -1.29154365F;

		bodyModel[346].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 397
		bodyModel[346].setRotationPoint(-56.9F, -28.6F, -6.3F);
		bodyModel[346].rotateAngleX = 3.14159265F;

		bodyModel[347].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 398
		bodyModel[347].setRotationPoint(-56.9F, -28.6F, -6.3F);
		bodyModel[347].rotateAngleX = 3.92699082F;

		bodyModel[348].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 399
		bodyModel[348].setRotationPoint(-56.9F, -28.6F, -6.3F);
		bodyModel[348].rotateAngleX = 5.49778714F;

		bodyModel[349].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 400
		bodyModel[349].setRotationPoint(-56.9F, -28.6F, -6.3F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F); // Box 401
		bodyModel[350].setRotationPoint(-56.7F, -29.8F, -7.3F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F); // Box 402
		bodyModel[351].setRotationPoint(-56.6F, -30.1F, -3.7F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F); // Box 403
		bodyModel[352].setRotationPoint(-56.6F, -30.1F, -3.7F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F); // Box 404
		bodyModel[353].setRotationPoint(-56.6F, -30.1F, -3.7F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 405
		bodyModel[354].setRotationPoint(-56.6F, -30.1F, -2.7F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 406
		bodyModel[355].setRotationPoint(-56.6F, -30.1F, -2.7F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 407
		bodyModel[356].setRotationPoint(-56.6F, -29.1F, -2.7F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 408
		bodyModel[357].setRotationPoint(-56.6F, -29.1F, -3.7F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 409
		bodyModel[358].setRotationPoint(-56.6F, -29.1F, -3.7F);

		bodyModel[359].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 410
		bodyModel[359].setRotationPoint(-56.7F, -29.1F, -2.7F);
		bodyModel[359].rotateAngleX = 3.92699082F;

		bodyModel[360].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 411
		bodyModel[360].setRotationPoint(-56.7F, -29.1F, -2.7F);
		bodyModel[360].rotateAngleX = 3.14159265F;

		bodyModel[361].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 412
		bodyModel[361].setRotationPoint(-56.7F, -29.1F, -2.7F);
		bodyModel[361].rotateAngleX = 2.35619449F;

		bodyModel[362].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 413
		bodyModel[362].setRotationPoint(-56.7F, -29.1F, -2.7F);
		bodyModel[362].rotateAngleX = 1.57079633F;

		bodyModel[363].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 414
		bodyModel[363].setRotationPoint(-56.7F, -29.1F, -2.7F);
		bodyModel[363].rotateAngleX = 0.78539816F;

		bodyModel[364].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 415
		bodyModel[364].setRotationPoint(-56.7F, -29.1F, -2.7F);

		bodyModel[365].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 416
		bodyModel[365].setRotationPoint(-56.7F, -29.1F, -2.7F);
		bodyModel[365].rotateAngleX = 5.49778714F;

		bodyModel[366].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 417
		bodyModel[366].setRotationPoint(-56.7F, -29.1F, -2.7F);
		bodyModel[366].rotateAngleX = 4.71238898F;

		bodyModel[367].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 418
		bodyModel[367].setRotationPoint(-56.6F, -29.1F, -2.7F);

		bodyModel[368].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F); // Box 419
		bodyModel[368].setRotationPoint(-56.7F, -29.1F, -2.7F);
		bodyModel[368].rotateAngleX = -1.57079633F;

		bodyModel[369].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 421
		bodyModel[369].setRotationPoint(-56.6F, -27.1F, -1.1F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 422
		bodyModel[370].setRotationPoint(-56.6F, -27.1F, -1.1F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F); // Box 423
		bodyModel[371].setRotationPoint(-56.6F, -27.1F, -1.1F);

		bodyModel[372].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F); // Box 424
		bodyModel[372].setRotationPoint(-56.6F, -27.1F, -1.1F);

		bodyModel[373].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F); // Box 425
		bodyModel[373].setRotationPoint(-56.6F, -27.1F, -1.1F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F); // Box 426
		bodyModel[374].setRotationPoint(-56.6F, -27.1F, -1.1F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F); // Box 427
		bodyModel[375].setRotationPoint(-56.6F, -27.1F, -1.1F);

		bodyModel[376].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 428
		bodyModel[376].setRotationPoint(-56.6F, -27.1F, -1.1F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 429
		bodyModel[377].setRotationPoint(-56.8F, -32.6F, -4.4F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 430
		bodyModel[378].setRotationPoint(-56.8F, -32.6F, -4.4F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F); // Box 431
		bodyModel[379].setRotationPoint(-56.8F, -32.6F, -5.4F);

		bodyModel[380].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F); // Box 432
		bodyModel[380].setRotationPoint(-56.8F, -32.6F, -5.4F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F); // Box 433
		bodyModel[381].setRotationPoint(-56.8F, -32.6F, -5.4F);

		bodyModel[382].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 434
		bodyModel[382].setRotationPoint(-56.8F, -31.6F, -5.4F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 435
		bodyModel[383].setRotationPoint(-56.8F, -31.6F, -5.4F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 436
		bodyModel[384].setRotationPoint(-56.8F, -31.6F, -4.4F);

		bodyModel[385].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 437
		bodyModel[385].setRotationPoint(-56.9F, -31.6F, -4.4F);
		bodyModel[385].rotateAngleX = 5.49778714F;

		bodyModel[386].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 438
		bodyModel[386].setRotationPoint(-56.9F, -31.6F, -4.4F);

		bodyModel[387].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 439
		bodyModel[387].setRotationPoint(-56.9F, -31.6F, -4.4F);
		bodyModel[387].rotateAngleX = 0.78539816F;

		bodyModel[388].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 440
		bodyModel[388].setRotationPoint(-56.9F, -31.6F, -4.4F);
		bodyModel[388].rotateAngleX = 1.57079633F;

		bodyModel[389].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 441
		bodyModel[389].setRotationPoint(-56.9F, -31.6F, -4.4F);
		bodyModel[389].rotateAngleX = 2.35619449F;

		bodyModel[390].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 442
		bodyModel[390].setRotationPoint(-56.9F, -31.6F, -4.4F);
		bodyModel[390].rotateAngleX = 3.14159265F;

		bodyModel[391].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 443
		bodyModel[391].setRotationPoint(-56.9F, -31.6F, -4.4F);
		bodyModel[391].rotateAngleX = 3.92699082F;

		bodyModel[392].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 444
		bodyModel[392].setRotationPoint(-56.9F, -31.6F, -4.4F);
		bodyModel[392].rotateAngleX = 4.71238898F;

		bodyModel[393].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 445
		bodyModel[393].setRotationPoint(-56.8F, -31.6F, -4.4F);

		bodyModel[394].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, 0F, 0F, -0.48F, 0F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, 0F, 0F, -0.48F, 0F); // Box 446
		bodyModel[394].setRotationPoint(-56.9F, -31.6F, -4.4F);
		bodyModel[394].rotateAngleX = -4.36332313F;

		bodyModel[395].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, 0F, 0F, -0.48F, 0F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, 0F, 0F, -0.48F, 0F); // Box 447
		bodyModel[395].setRotationPoint(-56.9F, -31.6F, -4.4F);
		bodyModel[395].rotateAngleX = -1.32645023F;

		bodyModel[396].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 448
		bodyModel[396].setRotationPoint(-56.8F, -26.5F, 3.5F);

		bodyModel[397].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F); // Box 449
		bodyModel[397].setRotationPoint(-56.8F, -27F, 3F);

		bodyModel[398].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F); // Box 450
		bodyModel[398].setRotationPoint(-56.8F, -27F, 3F);

		bodyModel[399].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F); // Box 451
		bodyModel[399].setRotationPoint(-56.8F, -27F, 3F);

		bodyModel[400].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F); // Box 452
		bodyModel[400].setRotationPoint(-56.8F, -27F, 3F);

		bodyModel[401].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F); // Box 453
		bodyModel[401].setRotationPoint(-56.8F, -27F, 3F);

		bodyModel[402].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 454
		bodyModel[402].setRotationPoint(-56.8F, -27F, 3F);

		bodyModel[403].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 455
		bodyModel[403].setRotationPoint(-56.8F, -27F, 3F);

		bodyModel[404].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 456
		bodyModel[404].setRotationPoint(-56.8F, -27F, 3F);

		bodyModel[405].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F); // Box 457
		bodyModel[405].setRotationPoint(-56.9F, -26.5F, 3.5F);
		bodyModel[405].rotateAngleX = -1.57079633F;

		bodyModel[406].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F); // Box 458
		bodyModel[406].setRotationPoint(-56.7F, -26.6F, 1.5F);
		bodyModel[406].rotateAngleX = -1.57079633F;

		bodyModel[407].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 459
		bodyModel[407].setRotationPoint(-56.6F, -26.6F, 1.5F);

		bodyModel[408].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F); // Box 460
		bodyModel[408].setRotationPoint(-56.6F, -27.1F, 1F);

		bodyModel[409].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F); // Box 461
		bodyModel[409].setRotationPoint(-56.6F, -27.1F, 1F);

		bodyModel[410].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F); // Box 462
		bodyModel[410].setRotationPoint(-56.6F, -27.1F, 1F);

		bodyModel[411].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 463
		bodyModel[411].setRotationPoint(-56.6F, -27.1F, 1F);

		bodyModel[412].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 464
		bodyModel[412].setRotationPoint(-56.6F, -27.1F, 1F);

		bodyModel[413].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 465
		bodyModel[413].setRotationPoint(-56.6F, -27.1F, 1F);

		bodyModel[414].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F); // Box 466
		bodyModel[414].setRotationPoint(-56.6F, -27.1F, 1F);

		bodyModel[415].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F); // Box 467
		bodyModel[415].setRotationPoint(-56.6F, -27.1F, 1F);

		bodyModel[416].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F); // Box 468
		bodyModel[416].setRotationPoint(-56.9F, -32F, 2F);
		bodyModel[416].rotateAngleX = 1.57079633F;

		bodyModel[417].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 469
		bodyModel[417].setRotationPoint(-56.8F, -32F, 2F);

		bodyModel[418].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F); // Box 470
		bodyModel[418].setRotationPoint(-56.8F, -32.5F, 1.5F);

		bodyModel[419].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F); // Box 471
		bodyModel[419].setRotationPoint(-56.8F, -32.5F, 1.5F);

		bodyModel[420].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F); // Box 472
		bodyModel[420].setRotationPoint(-56.8F, -32.5F, 1.5F);

		bodyModel[421].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 473
		bodyModel[421].setRotationPoint(-56.8F, -32.5F, 1.5F);

		bodyModel[422].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 474
		bodyModel[422].setRotationPoint(-56.8F, -32.5F, 1.5F);

		bodyModel[423].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 475
		bodyModel[423].setRotationPoint(-56.8F, -32.5F, 1.5F);

		bodyModel[424].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F); // Box 476
		bodyModel[424].setRotationPoint(-56.8F, -32.5F, 1.5F);

		bodyModel[425].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F); // Box 477
		bodyModel[425].setRotationPoint(-56.8F, -32.5F, 1.5F);

		bodyModel[426].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F); // Box 478
		bodyModel[426].setRotationPoint(-56.8F, -27F, -6.5F);

		bodyModel[427].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F); // Box 480
		bodyModel[427].setRotationPoint(-56.8F, -27F, -6.5F);

		bodyModel[428].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F); // Box 481
		bodyModel[428].setRotationPoint(-56.8F, -27F, -6.5F);

		bodyModel[429].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F); // Box 482
		bodyModel[429].setRotationPoint(-56.8F, -27F, -6.5F);

		bodyModel[430].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F); // Box 483
		bodyModel[430].setRotationPoint(-56.8F, -27F, -6.5F);

		bodyModel[431].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 484
		bodyModel[431].setRotationPoint(-56.8F, -27F, -6.5F);

		bodyModel[432].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 485
		bodyModel[432].setRotationPoint(-56.8F, -27F, -6.5F);

		bodyModel[433].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 486
		bodyModel[433].setRotationPoint(-56.8F, -27F, -6.5F);

		bodyModel[434].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, 0F, 0F, -0.48F, 0F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, 0F, 0F, -0.48F, 0F); // Box 487
		bodyModel[434].setRotationPoint(-56.9F, -26.5F, -6.6F);
		bodyModel[434].rotateAngleX = -0.38397244F;

		bodyModel[435].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 488
		bodyModel[435].setRotationPoint(-56.8F, -24.3F, -1.6F);

		bodyModel[436].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 489
		bodyModel[436].setRotationPoint(-56.8F, -24.3F, 0.4F);

		bodyModel[437].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F); // Box 460
		bodyModel[437].setRotationPoint(-56.8F, -27.5F, 4.8F);

		bodyModel[438].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 461
		bodyModel[438].setRotationPoint(-56.8F, -27.5F, 5.8F);

		bodyModel[439].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 462
		bodyModel[439].setRotationPoint(-56.8F, -26.5F, 5.8F);

		bodyModel[440].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 463
		bodyModel[440].setRotationPoint(-56.8F, -26.5F, 4.8F);

		bodyModel[441].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 464
		bodyModel[441].setRotationPoint(-56.8F, -26.5F, 4.8F);

		bodyModel[442].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F); // Box 465
		bodyModel[442].setRotationPoint(-56.8F, -27.5F, 4.8F);

		bodyModel[443].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 466
		bodyModel[443].setRotationPoint(-56.9F, -26.5F, 5.8F);
		bodyModel[443].rotateAngleX = 3.14159265F;

		bodyModel[444].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F); // Box 467
		bodyModel[444].setRotationPoint(-56.8F, -27.5F, 4.8F);

		bodyModel[445].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F); // Box 468
		bodyModel[445].setRotationPoint(-56.9F, -26.5F, 5.8F);
		bodyModel[445].rotateAngleX = -3.90953752F;

		bodyModel[446].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 469
		bodyModel[446].setRotationPoint(-56.8F, -26.5F, 5.8F);

		bodyModel[447].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 470
		bodyModel[447].setRotationPoint(-56.9F, -26.5F, 5.8F);
		bodyModel[447].rotateAngleX = 3.92699082F;

		bodyModel[448].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 471
		bodyModel[448].setRotationPoint(-56.9F, -26.5F, 5.8F);
		bodyModel[448].rotateAngleX = 5.49778714F;

		bodyModel[449].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 472
		bodyModel[449].setRotationPoint(-56.9F, -26.5F, 5.8F);

		bodyModel[450].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 473
		bodyModel[450].setRotationPoint(-56.9F, -26.5F, 5.8F);
		bodyModel[450].rotateAngleX = 0.78539816F;

		bodyModel[451].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 474
		bodyModel[451].setRotationPoint(-56.9F, -26.5F, 5.8F);
		bodyModel[451].rotateAngleX = 1.57079633F;

		bodyModel[452].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 475
		bodyModel[452].setRotationPoint(-56.9F, -26.5F, 5.8F);
		bodyModel[452].rotateAngleX = 2.35619449F;

		bodyModel[453].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 476
		bodyModel[453].setRotationPoint(-56.8F, -27.5F, 5.8F);

		bodyModel[454].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F); // Box 477
		bodyModel[454].setRotationPoint(-56.9F, -31.5F, -2F);
		bodyModel[454].rotateAngleX = 1.57079633F;

		bodyModel[455].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 478
		bodyModel[455].setRotationPoint(-56.8F, -32F, -2F);

		bodyModel[456].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 479
		bodyModel[456].setRotationPoint(-56.8F, -32.5F, -2.5F);

		bodyModel[457].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 480
		bodyModel[457].setRotationPoint(-56.8F, -32.5F, -2.5F);

		bodyModel[458].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F); // Box 481
		bodyModel[458].setRotationPoint(-56.8F, -32.5F, -2.5F);

		bodyModel[459].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F); // Box 482
		bodyModel[459].setRotationPoint(-56.8F, -32.5F, -2.5F);

		bodyModel[460].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F); // Box 483
		bodyModel[460].setRotationPoint(-56.8F, -32.5F, -2.5F);

		bodyModel[461].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F); // Box 484
		bodyModel[461].setRotationPoint(-56.8F, -32.5F, -2.5F);

		bodyModel[462].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F); // Box 485
		bodyModel[462].setRotationPoint(-56.8F, -32.5F, -2.5F);

		bodyModel[463].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 486
		bodyModel[463].setRotationPoint(-56.8F, -32.5F, -2.5F);

		bodyModel[464].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 487
		bodyModel[464].setRotationPoint(-56.8F, -27.8F, -4F);

		bodyModel[465].addShapeBox(0F, 0F, 0F, 12, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 462
		bodyModel[465].setRotationPoint(-67F, -34F, -5F);

		bodyModel[466].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F,0F, -2F, 0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 2F, 2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 463
		bodyModel[466].setRotationPoint(-60F, -34F, -9F);

		bodyModel[467].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 465
		bodyModel[467].setRotationPoint(-56.5F, -34.5F, -1F);

		bodyModel[468].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, 0F); // Box 466
		bodyModel[468].setRotationPoint(-56.5F, -35F, -1F);

		bodyModel[469].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 467
		bodyModel[469].setRotationPoint(-55F, -35.25F, -1F);

		bodyModel[470].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 468
		bodyModel[470].setRotationPoint(-55F, -34.25F, -1F);

		bodyModel[471].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.6F, -0.25F, 0F); // Box 469
		bodyModel[471].setRotationPoint(-55.1F, -33.75F, -1F);

		bodyModel[472].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.7F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.5F, 0F, -0.7F, -0.5F, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 470
		bodyModel[472].setRotationPoint(-56.5F, -36F, -1F);

		bodyModel[473].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.7F, -0.5F, -0.3F, -0.2F, -0.5F, -0.3F, -0.2F, -0.3F, 0F, -0.7F, -0.3F, 0F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 471
		bodyModel[473].setRotationPoint(-56.5F, -36F, 0F);

		bodyModel[474].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.1F); // Box 472
		bodyModel[474].setRotationPoint(-54.7F, -35F, -1F);

		bodyModel[475].addShapeBox(0F, 0F, 0F, 7, 3, 4, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 512
		bodyModel[475].setRotationPoint(-67F, -34F, -9F);

		bodyModel[476].addShapeBox(0F, 0F, 0F, 14, 2, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 513
		bodyModel[476].setRotationPoint(-67F, -32F, -10F);

		bodyModel[477].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 514
		bodyModel[477].setRotationPoint(-59F, -30F, -10F);

		bodyModel[478].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 2F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 2F, 2F, 0F, 0F, 2F, 0F); // Box 491
		bodyModel[478].setRotationPoint(-60F, -34F, 5F);

		bodyModel[479].addShapeBox(0F, 0F, 0F, 7, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 492
		bodyModel[479].setRotationPoint(-67F, -34F, 5F);

		bodyModel[480].addShapeBox(0F, 0F, 0F, 14, 2, 2, 0F,0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 493
		bodyModel[480].setRotationPoint(-67F, -32F, 8F);

		bodyModel[481].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 494
		bodyModel[481].setRotationPoint(-59F, -30F, 9F);

		bodyModel[482].addShapeBox(0F, 0F, 0F, 7, 1, 5, 0F,0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, 1F, -3F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, -1F); // Box 496
		bodyModel[482].setRotationPoint(-38F, -41F, 0F);

		bodyModel[483].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 1F, 1.9999F, 0F, -0.9999F, 0.9999F, 0F, -0.9999F, -0.9999F, 0F, 1F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0.9999F, 0F, 0F, -0.9999F, 0F, 0F, 0F); // Box 497
		bodyModel[483].setRotationPoint(-38F, -40F, 5F);
	}

	private void initnoseModel_1()
	{
		noseModel[0] = new ModelRendererTurbo(this, 289, 980, textureX, textureY); // Box 28
		noseModel[1] = new ModelRendererTurbo(this, 353, 980, textureX, textureY); // Box 29
		noseModel[2] = new ModelRendererTurbo(this, 417, 980, textureX, textureY); // Box 30
		noseModel[3] = new ModelRendererTurbo(this, 457, 980, textureX, textureY); // Box 31
		noseModel[4] = new ModelRendererTurbo(this, 521, 980, textureX, textureY); // Box 51
		noseModel[5] = new ModelRendererTurbo(this, 585, 980, textureX, textureY); // Box 52
		noseModel[6] = new ModelRendererTurbo(this, 641, 980, textureX, textureY); // Box 53
		noseModel[7] = new ModelRendererTurbo(this, 697, 980, textureX, textureY); // Box 54
		noseModel[8] = new ModelRendererTurbo(this, 745, 980, textureX, textureY); // Box 55
		noseModel[9] = new ModelRendererTurbo(this, 801, 980, textureX, textureY); // Box 56
		noseModel[10] = new ModelRendererTurbo(this, 849, 980, textureX, textureY); // Box 57
		noseModel[11] = new ModelRendererTurbo(this, 897, 980, textureX, textureY); // Box 58
		noseModel[12] = new ModelRendererTurbo(this, 945, 980, textureX, textureY); // Box 59
		noseModel[13] = new ModelRendererTurbo(this, 985, 980, textureX, textureY); // Box 60
		noseModel[14] = new ModelRendererTurbo(this, 1009, 980, textureX, textureY); // Box 95
		noseModel[15] = new ModelRendererTurbo(this, 1065, 980, textureX, textureY); // Box 96
		noseModel[16] = new ModelRendererTurbo(this, 1137, 980, textureX, textureY); // Box 98
		noseModel[17] = new ModelRendererTurbo(this, 1177, 980, textureX, textureY); // Box 99
		noseModel[18] = new ModelRendererTurbo(this, 1217, 980, textureX, textureY); // Box 100
		noseModel[19] = new ModelRendererTurbo(this, 1265, 980, textureX, textureY); // Box 101
		noseModel[20] = new ModelRendererTurbo(this, 1305, 980, textureX, textureY); // Box 102
		noseModel[21] = new ModelRendererTurbo(this, 41, 980, textureX, textureY); // Box 103
		noseModel[22] = new ModelRendererTurbo(this, 97, 980, textureX, textureY); // Box 104
		noseModel[23] = new ModelRendererTurbo(this, 153, 980, textureX, textureY); // Box 105
		noseModel[24] = new ModelRendererTurbo(this, 201, 980, textureX, textureY); // Box 106
		noseModel[25] = new ModelRendererTurbo(this, 337, 980, textureX, textureY); // Box 107
		noseModel[26] = new ModelRendererTurbo(this, 401, 980, textureX, textureY); // Box 108
		noseModel[27] = new ModelRendererTurbo(this, 289, 1002, textureX, textureY); // Box 214
		noseModel[28] = new ModelRendererTurbo(this, 353, 1002, textureX, textureY); // Box 215
		noseModel[29] = new ModelRendererTurbo(this, 417, 1002, textureX, textureY); // Box 216
		noseModel[30] = new ModelRendererTurbo(this, 457, 1002, textureX, textureY); // Box 217
		noseModel[31] = new ModelRendererTurbo(this, 521, 1002, textureX, textureY); // Box 237
		noseModel[32] = new ModelRendererTurbo(this, 585, 1002, textureX, textureY); // Box 238
		noseModel[33] = new ModelRendererTurbo(this, 641, 1002, textureX, textureY); // Box 239
		noseModel[34] = new ModelRendererTurbo(this, 697, 1002, textureX, textureY); // Box 240
		noseModel[35] = new ModelRendererTurbo(this, 745, 1002, textureX, textureY); // Box 241
		noseModel[36] = new ModelRendererTurbo(this, 801, 1002, textureX, textureY); // Box 242
		noseModel[37] = new ModelRendererTurbo(this, 849, 1002, textureX, textureY); // Box 243
		noseModel[38] = new ModelRendererTurbo(this, 897, 1002, textureX, textureY); // Box 244
		noseModel[39] = new ModelRendererTurbo(this, 945, 1002, textureX, textureY); // Box 245
		noseModel[40] = new ModelRendererTurbo(this, 985, 1002, textureX, textureY); // Box 246
		noseModel[41] = new ModelRendererTurbo(this, 1009, 1002, textureX, textureY); // Box 280
		noseModel[42] = new ModelRendererTurbo(this, 1065, 1002, textureX, textureY); // Box 281
		noseModel[43] = new ModelRendererTurbo(this, 1137, 1002, textureX, textureY); // Box 283
		noseModel[44] = new ModelRendererTurbo(this, 1177, 1002, textureX, textureY); // Box 284
		noseModel[45] = new ModelRendererTurbo(this, 1217, 1002, textureX, textureY); // Box 285
		noseModel[46] = new ModelRendererTurbo(this, 1265, 1002, textureX, textureY); // Box 286
		noseModel[47] = new ModelRendererTurbo(this, 1305, 1002, textureX, textureY); // Box 287
		noseModel[48] = new ModelRendererTurbo(this, 41, 1002, textureX, textureY); // Box 288
		noseModel[49] = new ModelRendererTurbo(this, 97, 1002, textureX, textureY); // Box 289
		noseModel[50] = new ModelRendererTurbo(this, 153, 1002, textureX, textureY); // Box 290
		noseModel[51] = new ModelRendererTurbo(this, 201, 1002, textureX, textureY); // Box 291
		noseModel[52] = new ModelRendererTurbo(this, 337, 1002, textureX, textureY); // Box 292
		noseModel[53] = new ModelRendererTurbo(this, 401, 1002, textureX, textureY); // Box 293
		noseModel[54] = new ModelRendererTurbo(this, 1, 980, textureX, textureY); // Box 388
		noseModel[55] = new ModelRendererTurbo(this, 41, 980, textureX, textureY); // Box 389
		noseModel[56] = new ModelRendererTurbo(this, 57, 980, textureX, textureY); // Box 390
		noseModel[57] = new ModelRendererTurbo(this, 97, 980, textureX, textureY); // Box 479
		noseModel[58] = new ModelRendererTurbo(this, 113, 980, textureX, textureY); // Box 480
		noseModel[59] = new ModelRendererTurbo(this, 153, 980, textureX, textureY); // Box 481
		noseModel[60] = new ModelRendererTurbo(this, 505, 980, textureX, textureY); // Box 432
		noseModel[61] = new ModelRendererTurbo(this, 569, 980, textureX, textureY); // Box 433
		noseModel[62] = new ModelRendererTurbo(this, 729, 980, textureX, textureY); // Box 434
		noseModel[63] = new ModelRendererTurbo(this, 505, 1002, textureX, textureY); // Box 435
		noseModel[64] = new ModelRendererTurbo(this, 569, 1002, textureX, textureY); // Box 436
		noseModel[65] = new ModelRendererTurbo(this, 729, 1002, textureX, textureY); // Box 437
		noseModel[66] = new ModelRendererTurbo(this, 833, 1002, textureX, textureY); // Box 438
		noseModel[67] = new ModelRendererTurbo(this, 1337, 1002, textureX, textureY); // Box 439
		noseModel[68] = new ModelRendererTurbo(this, 1361, 1002, textureX, textureY); // Box 440
		noseModel[69] = new ModelRendererTurbo(this, 1393, 1002, textureX, textureY); // Box 441
		noseModel[70] = new ModelRendererTurbo(this, 1425, 1002, textureX, textureY); // Box 442
		noseModel[71] = new ModelRendererTurbo(this, 1449, 1002, textureX, textureY); // Box 443
		noseModel[72] = new ModelRendererTurbo(this, 1481, 1002, textureX, textureY); // Box 444
		noseModel[73] = new ModelRendererTurbo(this, 1505, 1002, textureX, textureY); // Box 445
		noseModel[74] = new ModelRendererTurbo(this, 1529, 1002, textureX, textureY); // Box 446
		noseModel[75] = new ModelRendererTurbo(this, 1553, 1002, textureX, textureY); // Box 447
		noseModel[76] = new ModelRendererTurbo(this, 1577, 1002, textureX, textureY); // Box 448
		noseModel[77] = new ModelRendererTurbo(this, 1601, 1002, textureX, textureY); // Box 449

		noseModel[0].addShapeBox(0F, 0F, 0F, 17, 5, 13, 0F,0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		noseModel[0].setRotationPoint(-95F, -24F, -13F);

		noseModel[1].addShapeBox(0F, 0F, 0F, 17, 7, 12, 0F,0F, -1F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		noseModel[1].setRotationPoint(-95F, -31F, -12F);

		noseModel[2].addShapeBox(0F, 0F, 0F, 17, 3, 9, 0F,0F, -2F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 30
		noseModel[2].setRotationPoint(-95F, -34F, -9F);

		noseModel[3].addShapeBox(0F, 0F, 0F, 17, 7, 13, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 31
		noseModel[3].setRotationPoint(-95F, -19F, -13F);

		noseModel[4].addShapeBox(0F, 0F, 0F, 17, 5, 12, 0F,0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 51
		noseModel[4].setRotationPoint(-95F, -12F, -12F);

		noseModel[5].addShapeBox(0F, 0F, 0F, 17, 3, 9, 0F,0F, 2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 52
		noseModel[5].setRotationPoint(-95F, -7F, -9F);

		noseModel[6].addShapeBox(0F, 0F, 0F, 15, 5, 12, 0F,0F, -1F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		noseModel[6].setRotationPoint(-110F, -24F, -12F);

		noseModel[7].addShapeBox(0F, 0F, 0F, 11, 4, 9, 0F,0F, -1F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		noseModel[7].setRotationPoint(-121F, -23F, -9F);

		noseModel[8].addShapeBox(0F, 0F, 0F, 15, 6, 12, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 55
		noseModel[8].setRotationPoint(-110F, -19F, -12F);

		noseModel[9].addShapeBox(0F, 0F, 0F, 11, 4, 9, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 56
		noseModel[9].setRotationPoint(-121F, -19F, -9F);

		noseModel[10].addShapeBox(0F, 0F, 0F, 15, 6, 11, 0F,0F, -3F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 57
		noseModel[10].setRotationPoint(-110F, -30F, -11F);

		noseModel[11].addShapeBox(0F, 0F, 0F, 15, 2, 7, 0F,0F, -3F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 58
		noseModel[11].setRotationPoint(-110F, -32F, -7F);

		noseModel[12].addShapeBox(0F, 0F, 0F, 11, 4, 8, 0F,0F, -3F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 59
		noseModel[12].setRotationPoint(-121F, -27F, -8F);

		noseModel[13].addShapeBox(0F, 0F, 0F, 11, 2, 6, 0F,0F, -3F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 60
		noseModel[13].setRotationPoint(-121F, -29F, -6F);

		noseModel[14].addShapeBox(0F, 0F, 0F, 15, 4, 11, 0F,0F, 2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -3F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 95
		noseModel[14].setRotationPoint(-110F, -13F, -11F);

		noseModel[15].addShapeBox(0F, 0F, 0F, 11, 3, 8, 0F,0F, 2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -3F, -5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 96
		noseModel[15].setRotationPoint(-121F, -15F, -8F);

		noseModel[16].addShapeBox(0F, 0F, 0F, 17, 1, 6, 0F,0F, 1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, -2F, 0F, 1F, -2F, 0F, 1F, 0F, 0F, -1F, 0F); // Box 98
		noseModel[16].setRotationPoint(-95F, -5F, -6F);

		noseModel[17].addShapeBox(0F, 0F, 0F, 15, 3, 8, 0F,0F, 3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -4F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 99
		noseModel[17].setRotationPoint(-110F, -9F, -8F);

		noseModel[18].addShapeBox(0F, 0F, 0F, 15, 1, 5, 0F,0F, 3F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 3F, 0F, 0F, -3F, -2F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, -3F, 0F); // Box 100
		noseModel[18].setRotationPoint(-110F, -7F, -5F);

		noseModel[19].addShapeBox(0F, 0F, 0F, 11, 2, 6, 0F,0F, 2.9999F, -2.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.9999F, 0F, 0F, -4.9999F, -2.9999F, 0F, 0F, -1.9999F, 0F, 0F, 0F, 0F, -4.9999F, 0F); // Box 101
		noseModel[19].setRotationPoint(-121F, -12F, -6F);

		noseModel[20].addShapeBox(0F, 0F, 0F, 11, 1, 5, 0F,0F, 4F, -2F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 4F, 0F, 0F, -4F, -3F, 0F, 1F, -2F, 0F, 1F, 0F, 0F, -4F, 0F); // Box 102
		noseModel[20].setRotationPoint(-121F, -11F, -5F);

		noseModel[21].addShapeBox(0F, 0F, 0F, 4, 3, 6, 0F,0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		noseModel[21].setRotationPoint(-125F, -22F, -6F);

		noseModel[22].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 104
		noseModel[22].setRotationPoint(-125F, -19F, -6F);

		noseModel[23].addShapeBox(0F, 0F, 0F, 4, 2, 5, 0F,0F, 0.9999F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.9999F, 0F, 0F, -2.9999F, -1.9999F, 0F, 0F, -1.9999F, 0F, 0F, 0F, 0F, -2.9999F, 0F); // Box 105
		noseModel[23].setRotationPoint(-125F, -17F, -5F);

		noseModel[24].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 106
		noseModel[24].setRotationPoint(-125F, -15F, -3F);

		noseModel[25].addShapeBox(0F, 0F, 0F, 4, 2, 5, 0F,0F, -1.9999F, -1.9999F, 0F, 0F, -0.9999F, 0F, 0F, 0F, 0F, -1.9999F, 0F, 0F, 0F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		noseModel[25].setRotationPoint(-125F, -24F, -5F);

		noseModel[26].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, -3F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 108
		noseModel[26].setRotationPoint(-125F, -26F, -4F);

		noseModel[27].addShapeBox(0F, 0F, 0F, 17, 5, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 214
		noseModel[27].setRotationPoint(-95F, -24F, 0F);

		noseModel[28].addShapeBox(0F, 0F, 0F, 17, 7, 12, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 215
		noseModel[28].setRotationPoint(-95F, -31F, 0F);

		noseModel[29].addShapeBox(0F, 0F, 0F, 17, 3, 9, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -2F, -5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F); // Box 216
		noseModel[29].setRotationPoint(-95F, -34F, 0F);

		noseModel[30].addShapeBox(0F, 0F, 0F, 17, 7, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -2F); // Box 217
		noseModel[30].setRotationPoint(-95F, -19F, 0F);

		noseModel[31].addShapeBox(0F, 0F, 0F, 17, 5, 12, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -4F); // Box 237
		noseModel[31].setRotationPoint(-95F, -12F, 0F);

		noseModel[32].addShapeBox(0F, 0F, 0F, 17, 3, 9, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -4F); // Box 238
		noseModel[32].setRotationPoint(-95F, -7F, 0F);

		noseModel[33].addShapeBox(0F, 0F, 0F, 15, 5, 12, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 239
		noseModel[33].setRotationPoint(-110F, -24F, 0F);

		noseModel[34].addShapeBox(0F, 0F, 0F, 11, 4, 9, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 240
		noseModel[34].setRotationPoint(-121F, -23F, 0F);

		noseModel[35].addShapeBox(0F, 0F, 0F, 15, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -4F); // Box 241
		noseModel[35].setRotationPoint(-110F, -19F, 0F);

		noseModel[36].addShapeBox(0F, 0F, 0F, 11, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -4F); // Box 242
		noseModel[36].setRotationPoint(-121F, -19F, 0F);

		noseModel[37].addShapeBox(0F, 0F, 0F, 15, 6, 11, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -3F, -5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -3F); // Box 243
		noseModel[37].setRotationPoint(-110F, -30F, 0F);

		noseModel[38].addShapeBox(0F, 0F, 0F, 15, 2, 7, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, -4F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -1F); // Box 244
		noseModel[38].setRotationPoint(-110F, -32F, 0F);

		noseModel[39].addShapeBox(0F, 0F, 0F, 11, 4, 8, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, -4F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -3F); // Box 245
		noseModel[39].setRotationPoint(-121F, -27F, 0F);

		noseModel[40].addShapeBox(0F, 0F, 0F, 11, 2, 6, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, -4F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -2F); // Box 246
		noseModel[40].setRotationPoint(-121F, -29F, 0F);

		noseModel[41].addShapeBox(0F, 0F, 0F, 15, 4, 11, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, -5F); // Box 280
		noseModel[41].setRotationPoint(-110F, -13F, 0F);

		noseModel[42].addShapeBox(0F, 0F, 0F, 11, 3, 8, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, -5F); // Box 281
		noseModel[42].setRotationPoint(-121F, -15F, 0F);

		noseModel[43].addShapeBox(0F, 0F, 0F, 17, 1, 6, 0F,0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, -1F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, -2F, 0F, -1F, -2F); // Box 283
		noseModel[43].setRotationPoint(-95F, -5F, 0F);

		noseModel[44].addShapeBox(0F, 0F, 0F, 15, 3, 8, 0F,0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -2F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -4F, -4F); // Box 284
		noseModel[44].setRotationPoint(-110F, -9F, 0F);

		noseModel[45].addShapeBox(0F, 0F, 0F, 15, 1, 5, 0F,0F, 3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 3F, -1F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, -3F, -2F); // Box 285
		noseModel[45].setRotationPoint(-110F, -7F, 0F);

		noseModel[46].addShapeBox(0F, 0F, 0F, 11, 2, 6, 0F,0F, 2.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.9999F, -2.9999F, 0F, -4.9999F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9999F, 0F, -4.9999F, -2.9999F); // Box 286
		noseModel[46].setRotationPoint(-121F, -12F, 0F);

		noseModel[47].addShapeBox(0F, 0F, 0F, 11, 1, 5, 0F,0F, 4F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 4F, -2F, 0F, -4F, 0F, 0F, 1F, 0F, 0F, 1F, -2F, 0F, -4F, -3F); // Box 287
		noseModel[47].setRotationPoint(-121F, -11F, 0F);

		noseModel[48].addShapeBox(0F, 0F, 0F, 4, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 288
		noseModel[48].setRotationPoint(-125F, -22F, 0F);

		noseModel[49].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -3F); // Box 289
		noseModel[49].setRotationPoint(-125F, -19F, 0F);

		noseModel[50].addShapeBox(0F, 0F, 0F, 4, 2, 5, 0F,0F, 0.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.9999F, -1.9999F, 0F, -2.9999F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9999F, 0F, -2.9999F, -1.9999F); // Box 290
		noseModel[50].setRotationPoint(-125F, -17F, 0F);

		noseModel[51].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, -2F); // Box 291
		noseModel[51].setRotationPoint(-125F, -15F, 0F);

		noseModel[52].addShapeBox(0F, 0F, 0F, 4, 2, 5, 0F,0F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9999F, 0F, -1.9999F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9999F); // Box 292
		noseModel[52].setRotationPoint(-125F, -24F, 0F);

		noseModel[53].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, -3F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1F); // Box 293
		noseModel[53].setRotationPoint(-125F, -26F, 0F);

		noseModel[54].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 388
		noseModel[54].setRotationPoint(-130F, -22.5F, -6.5F);

		noseModel[55].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 389
		noseModel[55].setRotationPoint(-127F, -22.5F, -6.5F);

		noseModel[56].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 390
		noseModel[56].setRotationPoint(-130F, -21.5F, -6.5F);

		noseModel[57].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 479
		noseModel[57].setRotationPoint(-130F, -22.5F, -6.5F);

		noseModel[58].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 480
		noseModel[58].setRotationPoint(-127F, -22.5F, -5.5F);

		noseModel[59].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 481
		noseModel[59].setRotationPoint(-130F, -22.5F, -5.5F);

		noseModel[60].addShapeBox(0F, 0F, 0F, 10, 2, 2, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 432
		noseModel[60].setRotationPoint(-126F, -22.5F, -6.25F);

		noseModel[61].addShapeBox(0F, 0F, 0F, 10, 1, 2, 0F,0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 433
		noseModel[61].setRotationPoint(-126F, -22.5F, -6.25F);

		noseModel[62].addShapeBox(0F, 0F, 0F, 10, 1, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1F, 0F, -0.25F, -1F); // Box 434
		noseModel[62].setRotationPoint(-126F, -21.5F, -6.25F);

		noseModel[63].addShapeBox(0F, 0F, 0F, 10, 1, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1F, 0F, -0.25F, -1F); // Box 435
		noseModel[63].setRotationPoint(-126F, -24F, 2F);

		noseModel[64].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 436
		noseModel[64].setRotationPoint(-126F, -25F, 2F);

		noseModel[65].addShapeBox(0F, 0F, 0F, 10, 1, 2, 0F,0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 437
		noseModel[65].setRotationPoint(-126F, -25F, 2F);

		noseModel[66].addShapeBox(0F, 0F, 0F, 10, 1, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1F, 0F, -0.25F, -1F); // Box 438
		noseModel[66].setRotationPoint(-127F, -24.5F, -0.25F);

		noseModel[67].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 439
		noseModel[67].setRotationPoint(-127F, -25.5F, -0.25F);

		noseModel[68].addShapeBox(0F, 0F, 0F, 10, 1, 2, 0F,0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 440
		noseModel[68].setRotationPoint(-127F, -25.5F, -0.25F);

		noseModel[69].addShapeBox(0F, 0F, 0F, 10, 1, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1F, 0F, -0.25F, -1F); // Box 441
		noseModel[69].setRotationPoint(-121F, -21.5F, 5.5F);

		noseModel[70].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 442
		noseModel[70].setRotationPoint(-121F, -22.5F, 5.5F);

		noseModel[71].addShapeBox(0F, 0F, 0F, 10, 1, 2, 0F,0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 443
		noseModel[71].setRotationPoint(-121F, -22.5F, 5.5F);

		noseModel[72].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 444
		noseModel[72].setRotationPoint(-127F, -25.5F, 0.75F);

		noseModel[73].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 445
		noseModel[73].setRotationPoint(-126F, -25F, 3F);

		noseModel[74].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 446
		noseModel[74].setRotationPoint(-121F, -22.5F, 6.5F);

		noseModel[75].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 447
		noseModel[75].setRotationPoint(-126F, -25.5F, 0.25F);

		noseModel[76].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 448
		noseModel[76].setRotationPoint(-125F, -25F, 2.5F);

		noseModel[77].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 449
		noseModel[77].setRotationPoint(-120F, -22.5F, 6F);
	}

	private void inittailModel_1()
	{
		tailModel[0] = new ModelRendererTurbo(this, 1, 862, textureX, textureY); // Box 18
		tailModel[1] = new ModelRendererTurbo(this, 97, 862, textureX, textureY); // Box 20
		tailModel[2] = new ModelRendererTurbo(this, 193, 862, textureX, textureY); // Box 22
		tailModel[3] = new ModelRendererTurbo(this, 273, 862, textureX, textureY); // Box 24
		tailModel[4] = new ModelRendererTurbo(this, 353, 862, textureX, textureY); // Box 32
		tailModel[5] = new ModelRendererTurbo(this, 449, 862, textureX, textureY); // Box 33
		tailModel[6] = new ModelRendererTurbo(this, 521, 862, textureX, textureY); // Box 34
		tailModel[7] = new ModelRendererTurbo(this, 593, 862, textureX, textureY); // Box 35
		tailModel[8] = new ModelRendererTurbo(this, 657, 862, textureX, textureY); // Box 36
		tailModel[9] = new ModelRendererTurbo(this, 721, 862, textureX, textureY); // Box 38
		tailModel[10] = new ModelRendererTurbo(this, 801, 862, textureX, textureY); // Box 41
		tailModel[11] = new ModelRendererTurbo(this, 889, 862, textureX, textureY); // Box 43
		tailModel[12] = new ModelRendererTurbo(this, 953, 862, textureX, textureY); // Box 44
		tailModel[13] = new ModelRendererTurbo(this, 1017, 862, textureX, textureY); // Box 45
		tailModel[14] = new ModelRendererTurbo(this, 1089, 862, textureX, textureY); // Box 46
		tailModel[15] = new ModelRendererTurbo(this, 1161, 862, textureX, textureY); // Box 47
		tailModel[16] = new ModelRendererTurbo(this, 1225, 862, textureX, textureY); // Box 48
		tailModel[17] = new ModelRendererTurbo(this, 1289, 862, textureX, textureY); // Box 49
		tailModel[18] = new ModelRendererTurbo(this, 1353, 862, textureX, textureY); // Box 50
		tailModel[19] = new ModelRendererTurbo(this, 1, 758, textureX, textureY); // Box 149
		tailModel[20] = new ModelRendererTurbo(this, 65, 758, textureX, textureY); // Box 150
		tailModel[21] = new ModelRendererTurbo(this, 97, 758, textureX, textureY); // Box 151
		tailModel[22] = new ModelRendererTurbo(this, 153, 758, textureX, textureY); // Box 152
		tailModel[23] = new ModelRendererTurbo(this, 201, 758, textureX, textureY); // Box 153
		tailModel[24] = new ModelRendererTurbo(this, 233, 758, textureX, textureY); // Box 154
		tailModel[25] = new ModelRendererTurbo(this, 265, 758, textureX, textureY); // Box 155
		tailModel[26] = new ModelRendererTurbo(this, 297, 758, textureX, textureY); // Box 156
		tailModel[27] = new ModelRendererTurbo(this, 321, 758, textureX, textureY); // Box 157
		tailModel[28] = new ModelRendererTurbo(this, 1, 796, textureX, textureY); // Box 158
		tailModel[29] = new ModelRendererTurbo(this, 73, 796, textureX, textureY); // Box 159
		tailModel[30] = new ModelRendererTurbo(this, 129, 796, textureX, textureY); // Box 160
		tailModel[31] = new ModelRendererTurbo(this, 297, 796, textureX, textureY); // Box 164
		tailModel[32] = new ModelRendererTurbo(this, 361, 796, textureX, textureY); // Box 165
		tailModel[33] = new ModelRendererTurbo(this, 393, 796, textureX, textureY); // Box 166
		tailModel[34] = new ModelRendererTurbo(this, 449, 796, textureX, textureY); // Box 167
		tailModel[35] = new ModelRendererTurbo(this, 425, 796, textureX, textureY); // Box 168
		tailModel[36] = new ModelRendererTurbo(this, 1, 880, textureX, textureY); // Box 204
		tailModel[37] = new ModelRendererTurbo(this, 97, 880, textureX, textureY); // Box 206
		tailModel[38] = new ModelRendererTurbo(this, 193, 880, textureX, textureY); // Box 208
		tailModel[39] = new ModelRendererTurbo(this, 273, 880, textureX, textureY); // Box 210
		tailModel[40] = new ModelRendererTurbo(this, 353, 880, textureX, textureY); // Box 218
		tailModel[41] = new ModelRendererTurbo(this, 449, 880, textureX, textureY); // Box 219
		tailModel[42] = new ModelRendererTurbo(this, 521, 880, textureX, textureY); // Box 220
		tailModel[43] = new ModelRendererTurbo(this, 593, 880, textureX, textureY); // Box 221
		tailModel[44] = new ModelRendererTurbo(this, 657, 880, textureX, textureY); // Box 222
		tailModel[45] = new ModelRendererTurbo(this, 721, 880, textureX, textureY); // Box 224
		tailModel[46] = new ModelRendererTurbo(this, 801, 880, textureX, textureY); // Box 227
		tailModel[47] = new ModelRendererTurbo(this, 889, 880, textureX, textureY); // Box 229
		tailModel[48] = new ModelRendererTurbo(this, 953, 880, textureX, textureY); // Box 230
		tailModel[49] = new ModelRendererTurbo(this, 1017, 880, textureX, textureY); // Box 231
		tailModel[50] = new ModelRendererTurbo(this, 1089, 880, textureX, textureY); // Box 232
		tailModel[51] = new ModelRendererTurbo(this, 1161, 880, textureX, textureY); // Box 233
		tailModel[52] = new ModelRendererTurbo(this, 1225, 880, textureX, textureY); // Box 234
		tailModel[53] = new ModelRendererTurbo(this, 1289, 880, textureX, textureY); // Box 235
		tailModel[54] = new ModelRendererTurbo(this, 1353, 880, textureX, textureY); // Box 236
		tailModel[55] = new ModelRendererTurbo(this, 1, 777, textureX, textureY); // Box 334
		tailModel[56] = new ModelRendererTurbo(this, 65, 777, textureX, textureY); // Box 335
		tailModel[57] = new ModelRendererTurbo(this, 97, 777, textureX, textureY); // Box 336
		tailModel[58] = new ModelRendererTurbo(this, 153, 777, textureX, textureY); // Box 337
		tailModel[59] = new ModelRendererTurbo(this, 201, 777, textureX, textureY); // Box 338
		tailModel[60] = new ModelRendererTurbo(this, 233, 777, textureX, textureY); // Box 339
		tailModel[61] = new ModelRendererTurbo(this, 265, 777, textureX, textureY); // Box 340
		tailModel[62] = new ModelRendererTurbo(this, 297, 777, textureX, textureY); // Box 341
		tailModel[63] = new ModelRendererTurbo(this, 321, 777, textureX, textureY); // Box 342
		tailModel[64] = new ModelRendererTurbo(this, 1, 829, textureX, textureY); // Box 343
		tailModel[65] = new ModelRendererTurbo(this, 73, 829, textureX, textureY); // Box 344
		tailModel[66] = new ModelRendererTurbo(this, 129, 829, textureX, textureY); // Box 345
		tailModel[67] = new ModelRendererTurbo(this, 297, 829, textureX, textureY); // Box 349
		tailModel[68] = new ModelRendererTurbo(this, 361, 829, textureX, textureY); // Box 350
		tailModel[69] = new ModelRendererTurbo(this, 393, 829, textureX, textureY); // Box 351
		tailModel[70] = new ModelRendererTurbo(this, 449, 829, textureX, textureY); // Box 352
		tailModel[71] = new ModelRendererTurbo(this, 425, 829, textureX, textureY); // Box 353
		tailModel[72] = new ModelRendererTurbo(this, 1089, 919, textureX, textureY); // Box 452
		tailModel[73] = new ModelRendererTurbo(this, 473, 777, textureX, textureY); // Box 453
		tailModel[74] = new ModelRendererTurbo(this, 409, 777, textureX, textureY); // Box 454

		tailModel[0].addShapeBox(0F, 0F, 0F, 35, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		tailModel[0].setRotationPoint(32F, -24F, -10F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 35, 7, 10, 0F,0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		tailModel[1].setRotationPoint(32F, -31F, -10F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 35, 4, 9, 0F,0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		tailModel[2].setRotationPoint(32F, -35F, -9F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 35, 2, 6, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		tailModel[3].setRotationPoint(32F, -37F, -6F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 35, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -5F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 32
		tailModel[4].setRotationPoint(32F, -19F, -10F);

		tailModel[5].addShapeBox(0F, 0F, 0F, 24, 7, 8, 0F,0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		tailModel[5].setRotationPoint(67F, -31F, -8F);

		tailModel[6].addShapeBox(0F, 0F, 0F, 24, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 34
		tailModel[6].setRotationPoint(67F, -24F, -8F);

		tailModel[7].addShapeBox(0F, 0F, 0F, 24, 3, 7, 0F,0F, 0F, 0F, 0F, 2F, -2F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 35
		tailModel[7].setRotationPoint(67F, -19F, -7F);

		tailModel[8].addShapeBox(0F, 0F, 0F, 24, 4, 7, 0F,0F, 0F, -2F, 0F, -1F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		tailModel[8].setRotationPoint(67F, -35F, -7F);

		tailModel[9].addShapeBox(0F, 0F, 0F, 35, 3, 8, 0F,0F, 0F, 0F, 0F, 2F, -3F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -6F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 38
		tailModel[9].setRotationPoint(32F, -14F, -8F);

		tailModel[10].addShapeBox(0F, 0F, 0F, 35, 2, 5, 0F,0F, 0F, 0F, 0F, 1.9999F, -2.9999F, -0.9999F, 1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, -2.9999F, 0F, -3.9999F, -2.9999F, 0F, -3.9999F, 0F, 0F, 0F, 0F); // Box 41
		tailModel[10].setRotationPoint(32F, -11F, -5F);

		tailModel[11].addShapeBox(0F, 0F, 0F, 24, 3, 5, 0F,0F, 0F, 0F, 0F, 3F, -1F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -4F, -3F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 43
		tailModel[11].setRotationPoint(67F, -16F, -5F);

		tailModel[12].addShapeBox(0F, 0F, 0F, 24, 2, 5, 0F,0F, 0F, -2F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 44
		tailModel[12].setRotationPoint(67F, -37F, -5F);

		tailModel[13].addShapeBox(0F, 0F, 0F, 26, 7, 6, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 45
		tailModel[13].setRotationPoint(91F, -31F, -6F);

		tailModel[14].addShapeBox(0F, 0F, 0F, 26, 3, 6, 0F,0F, 0F, 0F, 0F, 2F, -4F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -4F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 46
		tailModel[14].setRotationPoint(91F, -24F, -6F);

		tailModel[15].addShapeBox(0F, 0F, 0F, 26, 2, 5, 0F,0F, 0F, 0F, 0F, 2F, -3F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 47
		tailModel[15].setRotationPoint(91F, -21F, -5F);

		tailModel[16].addShapeBox(0F, 0F, 0F, 26, 2, 4, 0F,0F, 0F, 0F, 0F, 3F, -2F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 48
		tailModel[16].setRotationPoint(91F, -19F, -4F);

		tailModel[17].addShapeBox(0F, 0F, 0F, 26, 3, 6, 0F,0F, 0F, -2F, 0F, -1F, -4F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		tailModel[17].setRotationPoint(91F, -34F, -6F);

		tailModel[18].addShapeBox(0F, 0F, 0F, 26, 1, 4, 0F,0F, 0F, -2F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 50
		tailModel[18].setRotationPoint(91F, -35F, -4F);

		tailModel[19].addShapeBox(0F, 0F, 0F, 26, 14, 2, 0F,-6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		tailModel[19].setRotationPoint(91F, -48F, -2F);

		tailModel[20].addShapeBox(0F, 0F, 0F, 11, 14, 2, 0F,-6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 11F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 11F, 0F, 0F); // Box 150
		tailModel[20].setRotationPoint(86F, -48F, -2F);

		tailModel[21].addShapeBox(0F, 0F, 0F, 22, 14, 2, 0F,-19F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -19F, 0F, 0F, 11F, 0F, -1F, -17F, 0F, 0F, -17F, 0F, 0F, 11F, 0F, 0F); // Box 151
		tailModel[21].setRotationPoint(70F, -48F, -2F);

		tailModel[22].addShapeBox(0F, 0F, 0F, 20, 16, 2, 0F,-8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152
		tailModel[22].setRotationPoint(97F, -64F, -2F);

		tailModel[23].addShapeBox(0F, 0F, 0F, 13, 16, 2, 0F,-10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F); // Box 153
		tailModel[23].setRotationPoint(92F, -64F, -2F);

		tailModel[24].addShapeBox(0F, 0F, 0F, 13, 16, 2, 0F,-11F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, -1F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F); // Box 154
		tailModel[24].setRotationPoint(89F, -64F, -2F);

		tailModel[25].addShapeBox(0F, 0F, 0F, 12, 5, 2, 0F,-3F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		tailModel[25].setRotationPoint(105F, -69F, -2F);

		tailModel[26].addShapeBox(0F, 0F, 0F, 6, 5, 2, 0F,-3F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 156
		tailModel[26].setRotationPoint(102F, -69F, -2F);

		tailModel[27].addShapeBox(0F, 0F, 0F, 5, 4, 2, 0F,-3F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -3F, -1F, 0F, 0F, 0F, -1F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 157
		tailModel[27].setRotationPoint(100F, -68F, -2F);

		tailModel[28].addShapeBox(0F, 0F, 0F, 22, 5, 26, 0F,-5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -6F); // Box 158
		tailModel[28].setRotationPoint(91F, -40F, -29F);

		tailModel[29].addShapeBox(0F, 0F, 0F, 17, 4, 17, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		tailModel[29].setRotationPoint(96F, -39F, -46F);

		tailModel[30].addShapeBox(0F, 0F, 0F, 13, 4, 12, 0F,-5F, -1F, 0F, -4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -1F, 0F, -4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		tailModel[30].setRotationPoint(100F, -39F, -58F);

		tailModel[31].addShapeBox(0F, 0F, 0F, 22, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		tailModel[31].setRotationPoint(91F, -40F, -9F);

		tailModel[32].addShapeBox(0F, 0F, 0F, 15, 6, 8, 0F,-10F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, -10F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F); // Box 165
		tailModel[32].setRotationPoint(76F, -40F, -9F);

		tailModel[33].addShapeBox(0F, 0F, 0F, 5, 5, 20, 0F,-5F, -2F, 0F, 5F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -5F, -1F, 0F, 5F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F); // Box 166
		tailModel[33].setRotationPoint(86F, -40F, -29F);

		tailModel[34].addShapeBox(0F, 0F, 0F, 5, 4, 17, 0F,-4F, -1F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -4F, -1F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 167
		tailModel[34].setRotationPoint(91F, -39F, -46F);

		tailModel[35].addShapeBox(0F, 0F, 0F, 5, 4, 12, 0F,-3F, -1F, -5F, 5F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, -1F, -5F, 5F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 168
		tailModel[35].setRotationPoint(95F, -39F, -58F);

		tailModel[36].addShapeBox(0F, 0F, 0F, 35, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 204
		tailModel[36].setRotationPoint(32F, -24F, 0F);

		tailModel[37].addShapeBox(0F, 0F, 0F, 35, 7, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 206
		tailModel[37].setRotationPoint(32F, -31F, 0F);

		tailModel[38].addShapeBox(0F, 0F, 0F, 35, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 208
		tailModel[38].setRotationPoint(32F, -35F, 0F);

		tailModel[39].addShapeBox(0F, 0F, 0F, 35, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 210
		tailModel[39].setRotationPoint(32F, -37F, 0F);

		tailModel[40].addShapeBox(0F, 0F, 0F, 35, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -5F, 0F, 0F, -2F); // Box 218
		tailModel[40].setRotationPoint(32F, -19F, 0F);

		tailModel[41].addShapeBox(0F, 0F, 0F, 24, 7, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 219
		tailModel[41].setRotationPoint(67F, -31F, 0F);

		tailModel[42].addShapeBox(0F, 0F, 0F, 24, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -3F, 0F, 0F, -1F); // Box 220
		tailModel[42].setRotationPoint(67F, -24F, 0F);

		tailModel[43].addShapeBox(0F, 0F, 0F, 24, 3, 7, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -3F, 0F, 0F, -2F); // Box 221
		tailModel[43].setRotationPoint(67F, -19F, 0F);

		tailModel[44].addShapeBox(0F, 0F, 0F, 24, 4, 7, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 222
		tailModel[44].setRotationPoint(67F, -35F, 0F);

		tailModel[45].addShapeBox(0F, 0F, 0F, 35, 3, 8, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -6F, 0F, 0F, -3F); // Box 224
		tailModel[45].setRotationPoint(32F, -14F, 0F);

		tailModel[46].addShapeBox(0F, 0F, 0F, 35, 2, 5, 0F,0F, 0F, 0F, -0.9999F, 1.9999F, 0F, 0F, 1.9999F, -2.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.9999F, 0F, 0F, -3.9999F, -2.9999F, 0F, 0F, -2.9999F); // Box 227
		tailModel[46].setRotationPoint(32F, -11F, 0F);

		tailModel[47].addShapeBox(0F, 0F, 0F, 24, 3, 5, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, -3F, 0F, 0F, -3F); // Box 229
		tailModel[47].setRotationPoint(67F, -16F, 0F);

		tailModel[48].addShapeBox(0F, 0F, 0F, 24, 2, 5, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 0F, 0F); // Box 230
		tailModel[48].setRotationPoint(67F, -37F, 0F);

		tailModel[49].addShapeBox(0F, 0F, 0F, 26, 7, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -4F, 0F, 0F, 0F); // Box 231
		tailModel[49].setRotationPoint(91F, -31F, 0F);

		tailModel[50].addShapeBox(0F, 0F, 0F, 26, 3, 6, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -4F, 0F, 0F, -1F); // Box 232
		tailModel[50].setRotationPoint(91F, -24F, 0F);

		tailModel[51].addShapeBox(0F, 0F, 0F, 26, 2, 5, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -3F, 0F, 0F, -1F); // Box 233
		tailModel[51].setRotationPoint(91F, -21F, 0F);

		tailModel[52].addShapeBox(0F, 0F, 0F, 26, 2, 4, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -3F, 0F, 0F, -2F); // Box 234
		tailModel[52].setRotationPoint(91F, -19F, 0F);

		tailModel[53].addShapeBox(0F, 0F, 0F, 26, 3, 6, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 235
		tailModel[53].setRotationPoint(91F, -34F, 0F);

		tailModel[54].addShapeBox(0F, 0F, 0F, 26, 1, 4, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -2F, 0F, 0F, 0F); // Box 236
		tailModel[54].setRotationPoint(91F, -35F, 0F);

		tailModel[55].addShapeBox(0F, 0F, 0F, 26, 14, 2, 0F,-6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 334
		tailModel[55].setRotationPoint(91F, -48F, 0F);

		tailModel[56].addShapeBox(0F, 0F, 0F, 11, 14, 2, 0F,-6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 11F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 11F, 0F, 0F); // Box 335
		tailModel[56].setRotationPoint(86F, -48F, 0F);

		tailModel[57].addShapeBox(0F, 0F, 0F, 22, 14, 2, 0F,-19F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -19F, 0F, -1F, 11F, 0F, 0F, -17F, 0F, 0F, -17F, 0F, 0F, 11F, 0F, -1F); // Box 336
		tailModel[57].setRotationPoint(70F, -48F, 0F);

		tailModel[58].addShapeBox(0F, 0F, 0F, 20, 16, 2, 0F,-8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 337
		tailModel[58].setRotationPoint(97F, -64F, 0F);

		tailModel[59].addShapeBox(0F, 0F, 0F, 13, 16, 2, 0F,-10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F); // Box 338
		tailModel[59].setRotationPoint(92F, -64F, 0F);

		tailModel[60].addShapeBox(0F, 0F, 0F, 13, 16, 2, 0F,-11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, -1F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, -1F); // Box 339
		tailModel[60].setRotationPoint(89F, -64F, 0F);

		tailModel[61].addShapeBox(0F, 0F, 0F, 12, 5, 2, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 340
		tailModel[61].setRotationPoint(105F, -69F, 0F);

		tailModel[62].addShapeBox(0F, 0F, 0F, 6, 5, 2, 0F,-3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, -1F, -1F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 341
		tailModel[62].setRotationPoint(102F, -69F, 0F);

		tailModel[63].addShapeBox(0F, 0F, 0F, 5, 4, 2, 0F,-3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, -1F, -1F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -1F); // Box 342
		tailModel[63].setRotationPoint(100F, -68F, 0F);

		tailModel[64].addShapeBox(0F, 0F, 0F, 22, 5, 26, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, -1F, 0F, -5F, -1F, 0F, 0F, 1F, -6F, 0F, 1F, 0F, 0F, 0F, 0F, -5F, 0F, 0F); // Box 343
		tailModel[64].setRotationPoint(91F, -40F, 3F);

		tailModel[65].addShapeBox(0F, 0F, 0F, 17, 4, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 344
		tailModel[65].setRotationPoint(96F, -39F, 29F);

		tailModel[66].addShapeBox(0F, 0F, 0F, 13, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4F, -1F, 0F, -5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -1F, 0F, -5F, -1F, 0F); // Box 345
		tailModel[66].setRotationPoint(100F, -39F, 46F);

		tailModel[67].addShapeBox(0F, 0F, 0F, 22, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 349
		tailModel[67].setRotationPoint(91F, -40F, 1F);

		tailModel[68].addShapeBox(0F, 0F, 0F, 15, 6, 8, 0F,1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, -2F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, -2F, 0F); // Box 350
		tailModel[68].setRotationPoint(76F, -40F, 1F);

		tailModel[69].addShapeBox(0F, 0F, 0F, 5, 5, 20, 0F,0F, -2F, 0F, 0F, 0F, 0F, 5F, -1F, 0F, -5F, -2F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 5F, 0F, 0F, -5F, -1F, 0F); // Box 351
		tailModel[69].setRotationPoint(86F, -40F, 9F);

		tailModel[70].addShapeBox(0F, 0F, 0F, 5, 4, 17, 0F,0F, -1F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, -1F, 0F); // Box 352
		tailModel[70].setRotationPoint(91F, -39F, 29F);

		tailModel[71].addShapeBox(0F, 0F, 0F, 5, 4, 12, 0F,0F, -1F, 0F, 0F, 0F, 0F, 5F, -1F, 0F, -3F, -1F, -5F, 0F, -1F, 0F, 0F, 0F, 0F, 5F, -1F, 0F, -3F, -1F, -5F); // Box 353
		tailModel[71].setRotationPoint(95F, -39F, 46F);

		tailModel[72].addShapeBox(0F, 0F, 0F, 124, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -2.75F, 0F, -0.25F, 2.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -2.75F, 0F, -0.25F, 2.25F, 0F, -0.25F, -0.25F); // Box 452
		tailModel[72].setRotationPoint(-18F, -39F, -3F);
		tailModel[72].rotateAngleZ = 0.21816616F;

		tailModel[73].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 453
		tailModel[73].setRotationPoint(115F, -73F, -0.5F);

		tailModel[74].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 454
		tailModel[74].setRotationPoint(111F, -73F, -0.5F);
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 1, 544, textureX, textureY); // Box 133
		leftWingModel[1] = new ModelRendererTurbo(this, 145, 544, textureX, textureY); // Box 134
		leftWingModel[2] = new ModelRendererTurbo(this, 281, 544, textureX, textureY); // Box 135
		leftWingModel[3] = new ModelRendererTurbo(this, 417, 544, textureX, textureY); // Box 136
		leftWingModel[4] = new ModelRendererTurbo(this, 537, 544, textureX, textureY); // Box 137
		leftWingModel[5] = new ModelRendererTurbo(this, 601, 544, textureX, textureY); // Box 138
		leftWingModel[6] = new ModelRendererTurbo(this, 785, 544, textureX, textureY); // Box 139
		leftWingModel[7] = new ModelRendererTurbo(this, 961, 544, textureX, textureY); // Box 140
		leftWingModel[8] = new ModelRendererTurbo(this, 721, 544, textureX, textureY); // Box 142
		leftWingModel[9] = new ModelRendererTurbo(this, 1297, 544, textureX, textureY); // Box 143
		leftWingModel[10] = new ModelRendererTurbo(this, 1, 544, textureX, textureY); // Box 144
		leftWingModel[11] = new ModelRendererTurbo(this, 97, 544, textureX, textureY); // Box 145
		leftWingModel[12] = new ModelRendererTurbo(this, 129, 544, textureX, textureY); // Box 146
		leftWingModel[13] = new ModelRendererTurbo(this, 233, 544, textureX, textureY); // Box 147
		leftWingModel[14] = new ModelRendererTurbo(this, 169, 544, textureX, textureY); // Box 148

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 20, 8, 51, 0F,0F, 3F, 0F, -11F, 1F, 0F, 0F, -3F, 1F, 0F, 0F, 0F, 0F, -3F, 0F, -11F, -3F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 133
		leftWingModel[0].setRotationPoint(-12F, -26F, -81F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 15, 8, 51, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F); // Box 134
		leftWingModel[1].setRotationPoint(-27F, -29F, -81F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 15, 9, 51, 0F,-3F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -3F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 135
		leftWingModel[2].setRotationPoint(-42F, -28F, -81F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 7, 9, 51, 0F,0F, -1F, 0F, 0F, 1F, 0F, -3F, 0F, -1F, 6F, -3F, -1F, 0F, -3F, 0F, 0F, -2F, 0F, -3F, 1F, 0F, 6F, 1F, -1F); // Box 136
		leftWingModel[3].setRotationPoint(-46F, -28F, -81F);

		leftWingModel[4].addShapeBox(0F, 0F, 0F, 10, 8, 52, 0F,0F, 1F, 0F, 0F, -3F, 0F, 11F, -7F, 7F, -11F, -3F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 11F, 0F, 7F, -11F, 0F, 0F); // Box 137
		leftWingModel[4].setRotationPoint(-3F, -26F, -81F);

		leftWingModel[5].addShapeBox(0F, 0F, 0F, 27, 10, 64, 0F,-6F, 0F, 0F, -11F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -6F, -4F, 0F, -11F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		leftWingModel[5].setRotationPoint(-39F, -31F, -145F);

		leftWingModel[6].addShapeBox(0F, 0F, 0F, 20, 10, 64, 0F,0F, 0F, 0F, -10F, -2F, 0F, 0F, -4F, 0F, -11F, -2F, 0F, 0F, -4F, 0F, -10F, -4F, 0F, 0F, 0F, 0F, -11F, 0F, 0F); // Box 139
		leftWingModel[6].setRotationPoint(-23F, -31F, -145F);

		leftWingModel[7].addShapeBox(0F, 0F, 0F, 13, 10, 64, 0F,-7F, -1F, 0F, 0F, 0F, 0F, -6F, -2F, 0F, 0F, -4F, 0F, -7F, -5F, 0F, 0F, -4F, 0F, -6F, 0F, 0F, 0F, -1F, 0F); // Box 140
		leftWingModel[7].setRotationPoint(-46F, -31F, -145F);

		leftWingModel[8].addShapeBox(0F, 0F, 0F, 3, 9, 51, 0F,1F, -2F, 0F, 0F, 0F, 0F, -6F, -2F, -1F, 9F, -6F, 3F, 1F, -6F, 0F, 0F, -4F, 0F, -6F, 0F, -1F, 9F, -2F, 3F); // Box 142
		leftWingModel[8].setRotationPoint(-49F, -27F, -81F);

		leftWingModel[9].addShapeBox(0F, 0F, 0F, 3, 4, 64, 0F,0F, -2F, 0F, 0F, 0F, 0F, -7F, -3F, 0F, 8F, -5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -7F, 4F, 0F, 8F, 2F, 0F); // Box 143
		leftWingModel[9].setRotationPoint(-42F, -30F, -145F);

		leftWingModel[10].addShapeBox(0F, 0F, 0F, 10, 6, 8, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		leftWingModel[10].setRotationPoint(-33F, -31F, -153F);

		leftWingModel[11].addShapeBox(0F, 0F, 0F, 6, 6, 8, 0F,0F, -2F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 145
		leftWingModel[11].setRotationPoint(-39F, -31F, -153F);

		leftWingModel[12].addShapeBox(0F, 0F, 0F, 10, 6, 8, 0F,0F, -1F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		leftWingModel[12].setRotationPoint(-23F, -31F, -153F);

		leftWingModel[13].addShapeBox(0F, 0F, 0F, 7, 4, 8, 0F,0F, -1F, 0F, -2F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 147
		leftWingModel[13].setRotationPoint(-13F, -29F, -153F);

		leftWingModel[14].addShapeBox(0F, 0F, 0F, 3, 4, 7, 0F,-1F, -2F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 148
		leftWingModel[14].setRotationPoint(-42F, -30F, -152F);
	}

	private void initrightWingModel_1()
	{
		rightWingModel[0] = new ModelRendererTurbo(this, 1, 651, textureX, textureY); // Box 318
		rightWingModel[1] = new ModelRendererTurbo(this, 145, 651, textureX, textureY); // Box 319
		rightWingModel[2] = new ModelRendererTurbo(this, 281, 651, textureX, textureY); // Box 320
		rightWingModel[3] = new ModelRendererTurbo(this, 417, 651, textureX, textureY); // Box 321
		rightWingModel[4] = new ModelRendererTurbo(this, 537, 651, textureX, textureY); // Box 322
		rightWingModel[5] = new ModelRendererTurbo(this, 601, 651, textureX, textureY); // Box 323
		rightWingModel[6] = new ModelRendererTurbo(this, 785, 651, textureX, textureY); // Box 324
		rightWingModel[7] = new ModelRendererTurbo(this, 961, 651, textureX, textureY); // Box 325
		rightWingModel[8] = new ModelRendererTurbo(this, 721, 651, textureX, textureY); // Box 327
		rightWingModel[9] = new ModelRendererTurbo(this, 1297, 651, textureX, textureY); // Box 328
		rightWingModel[10] = new ModelRendererTurbo(this, 1, 651, textureX, textureY); // Box 329
		rightWingModel[11] = new ModelRendererTurbo(this, 97, 651, textureX, textureY); // Box 330
		rightWingModel[12] = new ModelRendererTurbo(this, 129, 651, textureX, textureY); // Box 331
		rightWingModel[13] = new ModelRendererTurbo(this, 233, 651, textureX, textureY); // Box 332
		rightWingModel[14] = new ModelRendererTurbo(this, 169, 651, textureX, textureY); // Box 333

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 20, 8, 51, 0F,0F, 0F, 0F, 0F, -3F, 1F, -11F, 1F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -11F, -3F, 0F, 0F, -3F, 0F); // Box 318
		rightWingModel[0].setRotationPoint(-12F, -26F, 30F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 15, 8, 51, 0F,0F, -1F, -1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 319
		rightWingModel[1].setRotationPoint(-27F, -29F, 30F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 15, 9, 51, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, 0F, -3F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, -3F, -2F, 0F); // Box 320
		rightWingModel[2].setRotationPoint(-42F, -28F, 30F);

		rightWingModel[3].addShapeBox(0F, 0F, 0F, 7, 9, 51, 0F,6F, -3F, -1F, -3F, 0F, -1F, 0F, 1F, 0F, 0F, -1F, 0F, 6F, 1F, -1F, -3F, 1F, 0F, 0F, -2F, 0F, 0F, -3F, 0F); // Box 321
		rightWingModel[3].setRotationPoint(-46F, -28F, 30F);

		rightWingModel[4].addShapeBox(0F, 0F, 0F, 10, 8, 52, 0F,-11F, -3F, 0F, 11F, -7F, 7F, 0F, -3F, 0F, 0F, 1F, 0F, -11F, 0F, 0F, 11F, 0F, 7F, 0F, -4F, 0F, 0F, -3F, 0F); // Box 322
		rightWingModel[4].setRotationPoint(-3F, -26F, 29F);

		rightWingModel[5].addShapeBox(0F, 0F, 0F, 27, 10, 64, 0F,0F, -2F, 0F, 0F, -2F, 0F, -11F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, -4F, 0F, -6F, -4F, 0F); // Box 323
		rightWingModel[5].setRotationPoint(-39F, -31F, 81F);

		rightWingModel[6].addShapeBox(0F, 0F, 0F, 20, 10, 64, 0F,-11F, -2F, 0F, 0F, -4F, 0F, -10F, -2F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, -10F, -4F, 0F, 0F, -4F, 0F); // Box 324
		rightWingModel[6].setRotationPoint(-23F, -31F, 81F);

		rightWingModel[7].addShapeBox(0F, 0F, 0F, 13, 10, 64, 0F,0F, -4F, 0F, -6F, -2F, 0F, 0F, 0F, 0F, -7F, -1F, 0F, 0F, -1F, 0F, -6F, 0F, 0F, 0F, -4F, 0F, -7F, -5F, 0F); // Box 325
		rightWingModel[7].setRotationPoint(-46F, -31F, 81F);

		rightWingModel[8].addShapeBox(0F, 0F, 0F, 3, 9, 51, 0F,9F, -6F, 3F, -6F, -2F, -1F, 0F, 0F, 0F, 1F, -2F, 0F, 9F, -2F, 3F, -6F, 0F, -1F, 0F, -4F, 0F, 1F, -6F, 0F); // Box 327
		rightWingModel[8].setRotationPoint(-49F, -27F, 30F);

		rightWingModel[9].addShapeBox(0F, 0F, 0F, 3, 4, 64, 0F,8F, -5F, 0F, -7F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 8F, 2F, 0F, -7F, 4F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 328
		rightWingModel[9].setRotationPoint(-42F, -30F, 81F);

		rightWingModel[10].addShapeBox(0F, 0F, 0F, 10, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 329
		rightWingModel[10].setRotationPoint(-33F, -31F, 145F);

		rightWingModel[11].addShapeBox(0F, 0F, 0F, 6, 6, 8, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F); // Box 330
		rightWingModel[11].setRotationPoint(-39F, -31F, 145F);

		rightWingModel[12].addShapeBox(0F, 0F, 0F, 10, 6, 8, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 331
		rightWingModel[12].setRotationPoint(-23F, -31F, 145F);

		rightWingModel[13].addShapeBox(0F, 0F, 0F, 7, 4, 8, 0F,0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -1F, -2F, 0F, -1F, 0F); // Box 332
		rightWingModel[13].setRotationPoint(-13F, -29F, 145F);

		rightWingModel[14].addShapeBox(0F, 0F, 0F, 3, 4, 7, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -2F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, -2F); // Box 333
		rightWingModel[14].setRotationPoint(-42F, -30F, 145F);
	}

	private void inityawFlapModel_1()
	{
		yawFlapModel[0] = new ModelRendererTurbo(this, 481, 777, textureX, textureY); // Box 420
		yawFlapModel[1] = new ModelRendererTurbo(this, 521, 777, textureX, textureY); // Box 421
		yawFlapModel[2] = new ModelRendererTurbo(this, 337, 777, textureX, textureY); // Box 422
		yawFlapModel[3] = new ModelRendererTurbo(this, 377, 777, textureX, textureY); // Box 423
		yawFlapModel[4] = new ModelRendererTurbo(this, 417, 777, textureX, textureY); // Box 424
		yawFlapModel[5] = new ModelRendererTurbo(this, 441, 777, textureX, textureY); // Box 425

		yawFlapModel[0].addShapeBox(0F, -16F, -2F, 13, 16, 4, 0F,0F, 0F, 0F, -2F, 0F, -1.5F, -2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1.5F, 1F, 0F, -1.5F, 0F, 0F, 0F); // Box 420
		yawFlapModel[0].setRotationPoint(117F, -48F, 0F);

		yawFlapModel[1].addShapeBox(0F, 0F, -2F, 15, 16, 4, 0F,0F, 0F, 0F, -1F, 0F, -1.5F, -1F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 421
		yawFlapModel[1].setRotationPoint(117F, -48F, 0F);

		yawFlapModel[2].addShapeBox(0F, 16F, -2F, 15, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1.5F, -1.5F, 0F, -1.5F, 0F, 0F, 0F); // Box 422
		yawFlapModel[2].setRotationPoint(117F, -48F, 0F);

		yawFlapModel[3].addShapeBox(0F, 22F, -2F, 13, 4, 4, 0F,0F, 0F, 0F, 0.5F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -1.5F, -7F, 0F, -1.5F, 0F, 0F, 0F); // Box 423
		yawFlapModel[3].setRotationPoint(117F, -48F, 0F);

		yawFlapModel[4].addShapeBox(0F, 26F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, -1.49999F, 0F, 0F, -1.49999F, 0F, 0F, 0F, 0F, 0F, -0.9999F, 0F, -1.9999F, -1.49999F, 0F, -1.9999F, -1.49999F, 0F, 0F, -0.9999F); // Box 424
		yawFlapModel[4].setRotationPoint(117F, -48F, 0F);

		yawFlapModel[5].addShapeBox(0F, -21F, -2F, 10, 5, 4, 0F,0F, 0F, -1F, -4.5F, -1F, -1.5F, -4.5F, -1F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, -1.5F, 1F, 0F, -1.5F, 0F, 0F, 0F); // Box 425
		yawFlapModel[5].setRotationPoint(117F, -48F, 0F);
	}

	private void initpitchFlapLeftModel_1()
	{
		pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 161, 796, textureX, textureY); // Box 161
		pitchFlapLeftModel[1] = new ModelRendererTurbo(this, 217, 796, textureX, textureY); // Box 162
		pitchFlapLeftModel[2] = new ModelRendererTurbo(this, 257, 796, textureX, textureY); // Box 163

		pitchFlapLeftModel[0].addShapeBox(0F, 0F, -26F, 12, 6, 26, 0F,0F, -1F, 0F, -3F, -3F, 0F, 0F, -3F, -5F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, -2F, 0F, 0F, -2F, -5F, 0F, 0F, 0F); // Box 161
		pitchFlapLeftModel[0].setRotationPoint(113F, -40F, -3F);

		pitchFlapLeftModel[1].addShapeBox(0F, 1F, -43F, 9, 4, 17, 0F,0F, 0F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 162
		pitchFlapLeftModel[1].setRotationPoint(113F, -40F, -3F);

		pitchFlapLeftModel[2].addShapeBox(0F, 1F, -55F, 7, 4, 12, 0F,4F, -1F, 0F, -4F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 4F, -1F, 0F, -4F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 163
		pitchFlapLeftModel[2].setRotationPoint(113F, -40F, -3F);
	}

	private void initpitchFlapRightModel_1()
	{
		pitchFlapRightModel[0] = new ModelRendererTurbo(this, 161, 829, textureX, textureY); // Box 346
		pitchFlapRightModel[1] = new ModelRendererTurbo(this, 217, 829, textureX, textureY); // Box 347
		pitchFlapRightModel[2] = new ModelRendererTurbo(this, 257, 829, textureX, textureY); // Box 348

		pitchFlapRightModel[0].addShapeBox(0F, 0F, 0F, 12, 6, 26, 0F,0F, 0F, 0F, 0F, -3F, -5F, -3F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, -5F, -3F, -2F, 0F, 0F, -1F, 0F); // Box 346
		pitchFlapRightModel[0].setRotationPoint(113F, -40F, 3F);

		pitchFlapRightModel[1].addShapeBox(0F, 1F, 26F, 9, 4, 17, 0F,0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F); // Box 347
		pitchFlapRightModel[1].setRotationPoint(113F, -40F, 3F);

		pitchFlapRightModel[2].addShapeBox(0F, 1F, 43F, 7, 4, 12, 0F,0F, 0F, 0F, 0F, -2F, 0F, -4F, -2F, -2F, 4F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -4F, -1F, -2F, 4F, -1F, 0F); // Box 348
		pitchFlapRightModel[2].setRotationPoint(113F, -40F, 3F);
	}

	private void initpitchFlapLeftWingModel_1()
	{
		pitchFlapLeftWingModel[0] = new ModelRendererTurbo(this, 1121, 544, textureX, textureY); // Box 141

		pitchFlapLeftWingModel[0].addShapeBox(0F, 0F, 0F, 20, 8, 64, 0F,0F, 0F, 0F, -13F, -2F, 0F, 0F, -6F, 0F, -10F, -2F, 0F, 0F, -4F, 0F, -13F, -5F, 0F, 0F, -1F, 0F, -10F, 0F, 0F); // Box 141
		pitchFlapLeftWingModel[0].setRotationPoint(-13F, -29F, -145F);
	}

	private void initpitchFlapRightWingModel_1()
	{
		pitchFlapRightWingModel[0] = new ModelRendererTurbo(this, 1121, 651, textureX, textureY); // Box 326

		pitchFlapRightWingModel[0].addShapeBox(0F, 0F, 0F, 20, 8, 64, 0F,-10F, -2F, 0F, 0F, -6F, 0F, -13F, -2F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, -1F, 0F, -13F, -5F, 0F, 0F, -4F, 0F); // Box 326
		pitchFlapRightWingModel[0].setRotationPoint(-13F, -29F, 81F);
	}

	private void initbodyWheelModel_1()
	{
		bodyWheelModel[0] = new ModelRendererTurbo(this, 1, 500, textureX, textureY); // Box 181
		bodyWheelModel[1] = new ModelRendererTurbo(this, 41, 500, textureX, textureY); // Box 182
		bodyWheelModel[2] = new ModelRendererTurbo(this, 73, 500, textureX, textureY); // Box 366
		bodyWheelModel[3] = new ModelRendererTurbo(this, 113, 500, textureX, textureY); // Box 367
		bodyWheelModel[4] = new ModelRendererTurbo(this, 145, 500, textureX, textureY); // Box 410
		bodyWheelModel[5] = new ModelRendererTurbo(this, 161, 500, textureX, textureY); // Box 411
		bodyWheelModel[6] = new ModelRendererTurbo(this, 169, 500, textureX, textureY); // Box 412
		bodyWheelModel[7] = new ModelRendererTurbo(this, 177, 500, textureX, textureY); // Box 413
		bodyWheelModel[8] = new ModelRendererTurbo(this, 185, 500, textureX, textureY); // Box 414
		bodyWheelModel[9] = new ModelRendererTurbo(this, 193, 500, textureX, textureY); // Box 415
		bodyWheelModel[10] = new ModelRendererTurbo(this, 209, 500, textureX, textureY); // Box 416
		bodyWheelModel[11] = new ModelRendererTurbo(this, 217, 500, textureX, textureY); // Box 417
		bodyWheelModel[12] = new ModelRendererTurbo(this, 257, 500, textureX, textureY); // Box 418
		bodyWheelModel[13] = new ModelRendererTurbo(this, 297, 500, textureX, textureY); // Box 419

		bodyWheelModel[0].addShapeBox(0F, 0F, 0F, 18, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		bodyWheelModel[0].setRotationPoint(-95F, -7F, -6F);
		bodyWheelModel[0].rotateAngleZ = -0.13962634F;

		bodyWheelModel[1].addShapeBox(-14F, 0F, 0F, 14, 6, 1, 0F,0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182
		bodyWheelModel[1].setRotationPoint(-95F, -7F, -6F);
		bodyWheelModel[1].rotateAngleZ = -0.13962634F;

		bodyWheelModel[2].addShapeBox(0F, 0F, 0F, 18, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 366
		bodyWheelModel[2].setRotationPoint(-95F, -7F, 5F);
		bodyWheelModel[2].rotateAngleZ = -0.13962634F;

		bodyWheelModel[3].addShapeBox(-14F, 0F, 0F, 14, 6, 1, 0F,0F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 367
		bodyWheelModel[3].setRotationPoint(-95F, -7F, 5F);
		bodyWheelModel[3].rotateAngleZ = -0.13962634F;

		bodyWheelModel[4].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 410
		bodyWheelModel[4].setRotationPoint(-109F, -9F, -1F);

		bodyWheelModel[5].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 411
		bodyWheelModel[5].setRotationPoint(-109F, -5F, -2F);

		bodyWheelModel[6].addShapeBox(0F, 0F, 0F, 2, 10, 1, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 412
		bodyWheelModel[6].setRotationPoint(-109F, -5F, -3F);

		bodyWheelModel[7].addShapeBox(0F, 0F, 0F, 2, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413
		bodyWheelModel[7].setRotationPoint(-109F, -5F, 2F);

		bodyWheelModel[8].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 414
		bodyWheelModel[8].setRotationPoint(-109F, -5F, 1F);

		bodyWheelModel[9].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 415
		bodyWheelModel[9].setRotationPoint(-112F, -7F, -0.5F);

		bodyWheelModel[10].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 416
		bodyWheelModel[10].setRotationPoint(-112F, -5F, -0.5F);

		bodyWheelModel[11].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 417
		bodyWheelModel[11].setRotationPoint(-114F, 2F, -2F);

		bodyWheelModel[12].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 418
		bodyWheelModel[12].setRotationPoint(-114F, -2F, -2F);

		bodyWheelModel[13].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 419
		bodyWheelModel[13].setRotationPoint(-114F, 6F, -2F);
	}

	private void initleftWingWheelModel_1()
	{
		leftWingWheelModel[0] = new ModelRendererTurbo(this, 1, 512, textureX, textureY); // Box 169
		leftWingWheelModel[1] = new ModelRendererTurbo(this, 17, 512, textureX, textureY); // Box 170
		leftWingWheelModel[2] = new ModelRendererTurbo(this, 33, 512, textureX, textureY); // Box 171
		leftWingWheelModel[3] = new ModelRendererTurbo(this, 49, 512, textureX, textureY); // Box 172
		leftWingWheelModel[4] = new ModelRendererTurbo(this, 105, 512, textureX, textureY); // Box 173
		leftWingWheelModel[5] = new ModelRendererTurbo(this, 161, 512, textureX, textureY); // Box 174
		leftWingWheelModel[6] = new ModelRendererTurbo(this, 185, 512, textureX, textureY); // Box 175
		leftWingWheelModel[7] = new ModelRendererTurbo(this, 241, 512, textureX, textureY); // Box 176
		leftWingWheelModel[8] = new ModelRendererTurbo(this, 289, 512, textureX, textureY); // Box 177
		leftWingWheelModel[9] = new ModelRendererTurbo(this, 313, 512, textureX, textureY); // Box 178
		leftWingWheelModel[10] = new ModelRendererTurbo(this, 369, 512, textureX, textureY); // Box 179
		leftWingWheelModel[11] = new ModelRendererTurbo(this, 425, 512, textureX, textureY); // Box 180

		leftWingWheelModel[0].addShapeBox(0F, 0F, 0F, 3, 12, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		leftWingWheelModel[0].setRotationPoint(-19F, -21F, -77F);

		leftWingWheelModel[1].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
		leftWingWheelModel[1].setRotationPoint(-19F, -12F, -79F);

		leftWingWheelModel[2].addShapeBox(0F, 0F, 0F, 3, 13, 2, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		leftWingWheelModel[2].setRotationPoint(-19F, -12F, -81F);

		leftWingWheelModel[3].addShapeBox(0F, 0F, 0F, 25, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
		leftWingWheelModel[3].setRotationPoint(-32F, -5F, -82F);

		leftWingWheelModel[4].addShapeBox(0F, 0F, 0F, 25, 8, 1, 0F,-10F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		leftWingWheelModel[4].setRotationPoint(-32F, -13F, -82F);

		leftWingWheelModel[5].addShapeBox(0F, 0F, 0F, 8, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		leftWingWheelModel[5].setRotationPoint(-22F, -22F, -82F);

		leftWingWheelModel[6].addShapeBox(0F, 0F, 0F, 25, 8, 1, 0F,-10F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
		leftWingWheelModel[6].setRotationPoint(-32F, -23F, -38F);

		leftWingWheelModel[7].addShapeBox(0F, 0F, 0F, 25, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		leftWingWheelModel[7].setRotationPoint(-32F, -15F, -38F);

		leftWingWheelModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F); // Box 177
		leftWingWheelModel[8].setRotationPoint(-18F, -17F, -74F);

		leftWingWheelModel[9].addShapeBox(0F, 0F, 0F, 18, 6, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		leftWingWheelModel[9].setRotationPoint(-26.5F, -2F, -79F);

		leftWingWheelModel[10].addShapeBox(0F, 0F, 0F, 18, 6, 7, 0F,-6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		leftWingWheelModel[10].setRotationPoint(-26.5F, -8F, -79F);

		leftWingWheelModel[11].addShapeBox(0F, 0F, 0F, 18, 6, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Box 180
		leftWingWheelModel[11].setRotationPoint(-26.5F, 4F, -79F);
	}

	private void initrightWingWheelModel_1()
	{
		rightWingWheelModel[0] = new ModelRendererTurbo(this, 1, 528, textureX, textureY); // Box 354
		rightWingWheelModel[1] = new ModelRendererTurbo(this, 17, 528, textureX, textureY); // Box 355
		rightWingWheelModel[2] = new ModelRendererTurbo(this, 33, 528, textureX, textureY); // Box 356
		rightWingWheelModel[3] = new ModelRendererTurbo(this, 49, 528, textureX, textureY); // Box 357
		rightWingWheelModel[4] = new ModelRendererTurbo(this, 105, 528, textureX, textureY); // Box 358
		rightWingWheelModel[5] = new ModelRendererTurbo(this, 161, 528, textureX, textureY); // Box 359
		rightWingWheelModel[6] = new ModelRendererTurbo(this, 185, 528, textureX, textureY); // Box 360
		rightWingWheelModel[7] = new ModelRendererTurbo(this, 241, 528, textureX, textureY); // Box 361
		rightWingWheelModel[8] = new ModelRendererTurbo(this, 289, 528, textureX, textureY); // Box 362
		rightWingWheelModel[9] = new ModelRendererTurbo(this, 313, 528, textureX, textureY); // Box 363
		rightWingWheelModel[10] = new ModelRendererTurbo(this, 369, 528, textureX, textureY); // Box 364
		rightWingWheelModel[11] = new ModelRendererTurbo(this, 425, 528, textureX, textureY); // Box 365

		rightWingWheelModel[0].addShapeBox(0F, 0F, 0F, 3, 12, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 354
		rightWingWheelModel[0].setRotationPoint(-19F, -21F, 74F);

		rightWingWheelModel[1].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 355
		rightWingWheelModel[1].setRotationPoint(-19F, -12F, 77F);

		rightWingWheelModel[2].addShapeBox(0F, 0F, 0F, 3, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 356
		rightWingWheelModel[2].setRotationPoint(-19F, -12F, 79F);

		rightWingWheelModel[3].addShapeBox(0F, 0F, 0F, 25, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 357
		rightWingWheelModel[3].setRotationPoint(-32F, -5F, 81F);

		rightWingWheelModel[4].addShapeBox(0F, 0F, 0F, 25, 8, 1, 0F,-10F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 358
		rightWingWheelModel[4].setRotationPoint(-32F, -13F, 81F);

		rightWingWheelModel[5].addShapeBox(0F, 0F, 0F, 8, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 359
		rightWingWheelModel[5].setRotationPoint(-22F, -22F, 81F);

		rightWingWheelModel[6].addShapeBox(0F, 0F, 0F, 25, 8, 1, 0F,-10F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 360
		rightWingWheelModel[6].setRotationPoint(-32F, -23F, 37F);

		rightWingWheelModel[7].addShapeBox(0F, 0F, 0F, 25, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 361
		rightWingWheelModel[7].setRotationPoint(-32F, -15F, 37F);

		rightWingWheelModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 362
		rightWingWheelModel[8].setRotationPoint(-18F, -17F, 66F);

		rightWingWheelModel[9].addShapeBox(0F, 0F, 0F, 18, 6, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 363
		rightWingWheelModel[9].setRotationPoint(-26.5F, -2F, 72F);

		rightWingWheelModel[10].addShapeBox(0F, 0F, 0F, 18, 6, 7, 0F,-6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364
		rightWingWheelModel[10].setRotationPoint(-26.5F, -8F, 72F);

		rightWingWheelModel[11].addShapeBox(0F, 0F, 0F, 18, 6, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Box 365
		rightWingWheelModel[11].setRotationPoint(-26.5F, 4F, 72F);
	}

	private void inithudModel_1()
	{
		hudModel[0] = new ModelRendererTurbo(this, 0, 291, textureX, textureY); // Box 814

		hudModel[0].addShapeBox(0F, -1F, -1F, 0, 75, 75, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -73F, 0F, 0F, -73F, 0F, -73F, 0F, 0F, -73F, 0F, 0F, -73F, -73F, 0F, -73F, -73F); // Box 814
		hudModel[0].setRotationPoint(-55.5F, -36F, 0F);
		hudModel[0].rotateAngleX = -0.01745329F;
		hudModel[0].rotateAngleY = 0.01745329F;
		hudModel[0].rotateAngleZ = -0.29670597F;
	}
}