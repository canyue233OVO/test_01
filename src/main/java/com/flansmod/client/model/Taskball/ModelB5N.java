//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 24.05.2023 - 01:39:40
// Last changed on: 24.05.2023 - 01:39:40

package com.flansmod.client.model.Taskball; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelB5N extends ModelPlane //Same as Filename
{
	int textureX = 1024;
	int textureY = 512;

	public ModelB5N() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[208];
		noseModel = new ModelRendererTurbo[58];
		tailModel = new ModelRendererTurbo[45];
		leftWingModel = new ModelRendererTurbo[21];
		rightWingModel = new ModelRendererTurbo[19];
		yawFlapModel = new ModelRendererTurbo[4];
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

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 7
		bodyModel[5] = new ModelRendererTurbo(this, 537, 1, textureX, textureY); // Box 8
		bodyModel[6] = new ModelRendererTurbo(this, 593, 1, textureX, textureY); // Box 9
		bodyModel[7] = new ModelRendererTurbo(this, 673, 1, textureX, textureY); // Box 10
		bodyModel[8] = new ModelRendererTurbo(this, 737, 1, textureX, textureY); // Box 11
		bodyModel[9] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 15
		bodyModel[10] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 18
		bodyModel[11] = new ModelRendererTurbo(this, 401, 19, textureX, textureY); // Box 19
		bodyModel[12] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 20
		bodyModel[13] = new ModelRendererTurbo(this, 737, 17, textureX, textureY); // Box 21
		bodyModel[14] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 22
		bodyModel[15] = new ModelRendererTurbo(this, 561, 25, textureX, textureY); // Box 23
		bodyModel[16] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 29
		bodyModel[17] = new ModelRendererTurbo(this, 1009, 17, textureX, textureY); // Box 71
		bodyModel[18] = new ModelRendererTurbo(this, 993, 25, textureX, textureY); // Box 72
		bodyModel[19] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 73
		bodyModel[20] = new ModelRendererTurbo(this, 889, 73, textureX, textureY); // Box 74
		bodyModel[21] = new ModelRendererTurbo(this, 785, 57, textureX, textureY); // Box 75
		bodyModel[22] = new ModelRendererTurbo(this, 857, 57, textureX, textureY); // Box 76
		bodyModel[23] = new ModelRendererTurbo(this, 993, 57, textureX, textureY); // Box 77
		bodyModel[24] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 78
		bodyModel[25] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Box 79
		bodyModel[26] = new ModelRendererTurbo(this, 657, 9, textureX, textureY); // Box 80
		bodyModel[27] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 81
		bodyModel[28] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 82
		bodyModel[29] = new ModelRendererTurbo(this, 681, 1, textureX, textureY); // Box 83
		bodyModel[30] = new ModelRendererTurbo(this, 953, 41, textureX, textureY); // Box 84
		bodyModel[31] = new ModelRendererTurbo(this, 737, 1, textureX, textureY); // Box 85
		bodyModel[32] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 86
		bodyModel[33] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 87
		bodyModel[34] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 88
		bodyModel[35] = new ModelRendererTurbo(this, 585, 17, textureX, textureY); // Box 89
		bodyModel[36] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 90
		bodyModel[37] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 91
		bodyModel[38] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 92
		bodyModel[39] = new ModelRendererTurbo(this, 529, 1, textureX, textureY); // Box 93
		bodyModel[40] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 94
		bodyModel[41] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 95
		bodyModel[42] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 96
		bodyModel[43] = new ModelRendererTurbo(this, 577, 17, textureX, textureY); // Box 97
		bodyModel[44] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 98
		bodyModel[45] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 99
		bodyModel[46] = new ModelRendererTurbo(this, 385, 65, textureX, textureY); // Box 100
		bodyModel[47] = new ModelRendererTurbo(this, 641, 81, textureX, textureY); // Box 101
		bodyModel[48] = new ModelRendererTurbo(this, 249, 97, textureX, textureY); // Box 127
		bodyModel[49] = new ModelRendererTurbo(this, 489, 97, textureX, textureY); // Box 128
		bodyModel[50] = new ModelRendererTurbo(this, 617, 97, textureX, textureY); // Box 129
		bodyModel[51] = new ModelRendererTurbo(this, 921, 97, textureX, textureY); // Box 130
		bodyModel[52] = new ModelRendererTurbo(this, 249, 113, textureX, textureY); // Box 134
		bodyModel[53] = new ModelRendererTurbo(this, 489, 113, textureX, textureY); // Box 135
		bodyModel[54] = new ModelRendererTurbo(this, 617, 113, textureX, textureY); // Box 136
		bodyModel[55] = new ModelRendererTurbo(this, 353, 121, textureX, textureY); // Box 137
		bodyModel[56] = new ModelRendererTurbo(this, 417, 121, textureX, textureY); // Box 138
		bodyModel[57] = new ModelRendererTurbo(this, 81, 137, textureX, textureY); // Box 142
		bodyModel[58] = new ModelRendererTurbo(this, 753, 145, textureX, textureY); // Box 145
		bodyModel[59] = new ModelRendererTurbo(this, 617, 137, textureX, textureY); // Box 146
		bodyModel[60] = new ModelRendererTurbo(this, 769, 129, textureX, textureY); // Box 147
		bodyModel[61] = new ModelRendererTurbo(this, 425, 145, textureX, textureY); // Box 148
		bodyModel[62] = new ModelRendererTurbo(this, 849, 145, textureX, textureY); // Box 149
		bodyModel[63] = new ModelRendererTurbo(this, 929, 145, textureX, textureY); // Box 150
		bodyModel[64] = new ModelRendererTurbo(this, 689, 153, textureX, textureY); // Box 156
		bodyModel[65] = new ModelRendererTurbo(this, 377, 65, textureX, textureY); // Box 196
		bodyModel[66] = new ModelRendererTurbo(this, 833, 113, textureX, textureY); // Box 197
		bodyModel[67] = new ModelRendererTurbo(this, 177, 153, textureX, textureY); // Box 198
		bodyModel[68] = new ModelRendererTurbo(this, 513, 185, textureX, textureY); // Box 199
		bodyModel[69] = new ModelRendererTurbo(this, 985, 113, textureX, textureY); // Box 200
		bodyModel[70] = new ModelRendererTurbo(this, 993, 145, textureX, textureY); // Box 201
		bodyModel[71] = new ModelRendererTurbo(this, 337, 177, textureX, textureY); // Box 202
		bodyModel[72] = new ModelRendererTurbo(this, 857, 73, textureX, textureY); // Box 203
		bodyModel[73] = new ModelRendererTurbo(this, 681, 113, textureX, textureY); // Box 204
		bodyModel[74] = new ModelRendererTurbo(this, 809, 17, textureX, textureY); // Box 208
		bodyModel[75] = new ModelRendererTurbo(this, 857, 89, textureX, textureY); // Box 209
		bodyModel[76] = new ModelRendererTurbo(this, 873, 17, textureX, textureY); // Box 210
		bodyModel[77] = new ModelRendererTurbo(this, 569, 25, textureX, textureY); // Box 211
		bodyModel[78] = new ModelRendererTurbo(this, 953, 17, textureX, textureY); // Box 212
		bodyModel[79] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 213
		bodyModel[80] = new ModelRendererTurbo(this, 809, 41, textureX, textureY); // Box 214
		bodyModel[81] = new ModelRendererTurbo(this, 737, 25, textureX, textureY); // Box 215
		bodyModel[82] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 216
		bodyModel[83] = new ModelRendererTurbo(this, 929, 25, textureX, textureY); // Box 219
		bodyModel[84] = new ModelRendererTurbo(this, 985, 25, textureX, textureY); // Box 220
		bodyModel[85] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 222
		bodyModel[86] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 223
		bodyModel[87] = new ModelRendererTurbo(this, 729, 177, textureX, textureY); // Box 224
		bodyModel[88] = new ModelRendererTurbo(this, 761, 185, textureX, textureY); // Box 225
		bodyModel[89] = new ModelRendererTurbo(this, 497, 193, textureX, textureY); // Box 226
		bodyModel[90] = new ModelRendererTurbo(this, 625, 49, textureX, textureY); // Box 695
		bodyModel[91] = new ModelRendererTurbo(this, 185, 121, textureX, textureY); // Box 267
		bodyModel[92] = new ModelRendererTurbo(this, 833, 121, textureX, textureY); // Box 268
		bodyModel[93] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 269
		bodyModel[94] = new ModelRendererTurbo(this, 705, 33, textureX, textureY); // Box 270
		bodyModel[95] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 271
		bodyModel[96] = new ModelRendererTurbo(this, 537, 33, textureX, textureY); // Box 272
		bodyModel[97] = new ModelRendererTurbo(this, 561, 33, textureX, textureY); // Box 273
		bodyModel[98] = new ModelRendererTurbo(this, 697, 41, textureX, textureY); // Box 274
		bodyModel[99] = new ModelRendererTurbo(this, 33, 153, textureX, textureY); // Box 275
		bodyModel[100] = new ModelRendererTurbo(this, 129, 161, textureX, textureY); // Box 276
		bodyModel[101] = new ModelRendererTurbo(this, 841, 209, textureX, textureY); // Box 271
		bodyModel[102] = new ModelRendererTurbo(this, 897, 209, textureX, textureY); // Box 272
		bodyModel[103] = new ModelRendererTurbo(this, 281, 169, textureX, textureY); // Box 484
		bodyModel[104] = new ModelRendererTurbo(this, 953, 49, textureX, textureY); // Box 485
		bodyModel[105] = new ModelRendererTurbo(this, 289, 57, textureX, textureY); // Box 487
		bodyModel[106] = new ModelRendererTurbo(this, 617, 185, textureX, textureY); // Box 488
		bodyModel[107] = new ModelRendererTurbo(this, 265, 193, textureX, textureY); // Box 489
		bodyModel[108] = new ModelRendererTurbo(this, 153, 201, textureX, textureY); // Box 490
		bodyModel[109] = new ModelRendererTurbo(this, 417, 65, textureX, textureY); // Box 491
		bodyModel[110] = new ModelRendererTurbo(this, 185, 81, textureX, textureY); // Box 492
		bodyModel[111] = new ModelRendererTurbo(this, 529, 209, textureX, textureY); // Box 493
		bodyModel[112] = new ModelRendererTurbo(this, 865, 105, textureX, textureY); // Box 494
		bodyModel[113] = new ModelRendererTurbo(this, 561, 145, textureX, textureY); // Box 495
		bodyModel[114] = new ModelRendererTurbo(this, 1017, 49, textureX, textureY); // Box 496
		bodyModel[115] = new ModelRendererTurbo(this, 697, 57, textureX, textureY); // Box 497
		bodyModel[116] = new ModelRendererTurbo(this, 225, 65, textureX, textureY); // Box 498
		bodyModel[117] = new ModelRendererTurbo(this, 441, 65, textureX, textureY); // Box 499
		bodyModel[118] = new ModelRendererTurbo(this, 1017, 89, textureX, textureY); // Box 578
		bodyModel[119] = new ModelRendererTurbo(this, 569, 105, textureX, textureY); // Box 579
		bodyModel[120] = new ModelRendererTurbo(this, 585, 209, textureX, textureY); // Box 580
		bodyModel[121] = new ModelRendererTurbo(this, 937, 209, textureX, textureY); // Box 582
		bodyModel[122] = new ModelRendererTurbo(this, 361, 73, textureX, textureY); // Box 583
		bodyModel[123] = new ModelRendererTurbo(this, 713, 113, textureX, textureY); // Box 584
		bodyModel[124] = new ModelRendererTurbo(this, 881, 209, textureX, textureY); // Box 585
		bodyModel[125] = new ModelRendererTurbo(this, 113, 121, textureX, textureY); // Box 586
		bodyModel[126] = new ModelRendererTurbo(this, 249, 161, textureX, textureY); // Box 587
		bodyModel[127] = new ModelRendererTurbo(this, 609, 209, textureX, textureY); // Box 588
		bodyModel[128] = new ModelRendererTurbo(this, 81, 129, textureX, textureY); // Box 589
		bodyModel[129] = new ModelRendererTurbo(this, 89, 129, textureX, textureY); // Box 590
		bodyModel[130] = new ModelRendererTurbo(this, 977, 41, textureX, textureY); // Box 591
		bodyModel[131] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 592
		bodyModel[132] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Box 593
		bodyModel[133] = new ModelRendererTurbo(this, 841, 145, textureX, textureY); // Box 594
		bodyModel[134] = new ModelRendererTurbo(this, 193, 257, textureX, textureY); // Box 304
		bodyModel[135] = new ModelRendererTurbo(this, 553, 49, textureX, textureY); // Box 465
		bodyModel[136] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 466
		bodyModel[137] = new ModelRendererTurbo(this, 745, 57, textureX, textureY); // Box 467
		bodyModel[138] = new ModelRendererTurbo(this, 953, 57, textureX, textureY); // Box 468
		bodyModel[139] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 469
		bodyModel[140] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 470
		bodyModel[141] = new ModelRendererTurbo(this, 561, 25, textureX, textureY); // Box 471
		bodyModel[142] = new ModelRendererTurbo(this, 665, 65, textureX, textureY); // Box 472
		bodyModel[143] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); // Box 239
		bodyModel[144] = new ModelRendererTurbo(this, 49, 217, textureX, textureY); // Box 240
		bodyModel[145] = new ModelRendererTurbo(this, 721, 81, textureX, textureY); // Box 241
		bodyModel[146] = new ModelRendererTurbo(this, 817, 113, textureX, textureY); // Box 242
		bodyModel[147] = new ModelRendererTurbo(this, 137, 217, textureX, textureY); // Box 243
		bodyModel[148] = new ModelRendererTurbo(this, 193, 217, textureX, textureY); // Box 244
		bodyModel[149] = new ModelRendererTurbo(this, 921, 145, textureX, textureY); // Box 245
		bodyModel[150] = new ModelRendererTurbo(this, 73, 217, textureX, textureY); // Box 246
		bodyModel[151] = new ModelRendererTurbo(this, 1017, 161, textureX, textureY); // Box 247
		bodyModel[152] = new ModelRendererTurbo(this, 601, 193, textureX, textureY); // Box 248
		bodyModel[153] = new ModelRendererTurbo(this, 1017, 201, textureX, textureY); // Box 250
		bodyModel[154] = new ModelRendererTurbo(this, 561, 209, textureX, textureY); // Box 251
		bodyModel[155] = new ModelRendererTurbo(this, 273, 161, textureX, textureY); // Box 252
		bodyModel[156] = new ModelRendererTurbo(this, 297, 161, textureX, textureY); // Box 253
		bodyModel[157] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 962
		bodyModel[158] = new ModelRendererTurbo(this, 737, 49, textureX, textureY); // Box 964
		bodyModel[159] = new ModelRendererTurbo(this, 993, 57, textureX, textureY); // Box 966
		bodyModel[160] = new ModelRendererTurbo(this, 889, 65, textureX, textureY); // Box 259
		bodyModel[161] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 260
		bodyModel[162] = new ModelRendererTurbo(this, 217, 217, textureX, textureY); // Box 256
		bodyModel[163] = new ModelRendererTurbo(this, 321, 177, textureX, textureY); // Box 249
		bodyModel[164] = new ModelRendererTurbo(this, 969, 209, textureX, textureY); // Box 254
		bodyModel[165] = new ModelRendererTurbo(this, 921, 81, textureX, textureY); // Box 263
		bodyModel[166] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 264
		bodyModel[167] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 265
		bodyModel[168] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 266
		bodyModel[169] = new ModelRendererTurbo(this, 657, 217, textureX, textureY); // Box 814
		bodyModel[170] = new ModelRendererTurbo(this, 241, 217, textureX, textureY); // Box 340
		bodyModel[171] = new ModelRendererTurbo(this, 705, 217, textureX, textureY); // Box 341
		bodyModel[172] = new ModelRendererTurbo(this, 289, 217, textureX, textureY); // Box 342
		bodyModel[173] = new ModelRendererTurbo(this, 865, 121, textureX, textureY); // Box 343
		bodyModel[174] = new ModelRendererTurbo(this, 753, 161, textureX, textureY); // Box 344
		bodyModel[175] = new ModelRendererTurbo(this, 729, 217, textureX, textureY); // Box 345
		bodyModel[176] = new ModelRendererTurbo(this, 761, 129, textureX, textureY); // Box 346
		bodyModel[177] = new ModelRendererTurbo(this, 385, 193, textureX, textureY); // Box 347
		bodyModel[178] = new ModelRendererTurbo(this, 161, 217, textureX, textureY); // Box 348
		bodyModel[179] = new ModelRendererTurbo(this, 753, 217, textureX, textureY); // Box 349
		bodyModel[180] = new ModelRendererTurbo(this, 169, 217, textureX, textureY); // Box 350
		bodyModel[181] = new ModelRendererTurbo(this, 921, 169, textureX, textureY); // Box 351
		bodyModel[182] = new ModelRendererTurbo(this, 689, 65, textureX, textureY); // Box 352
		bodyModel[183] = new ModelRendererTurbo(this, 809, 65, textureX, textureY); // Box 353
		bodyModel[184] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 354
		bodyModel[185] = new ModelRendererTurbo(this, 313, 217, textureX, textureY); // Box 355
		bodyModel[186] = new ModelRendererTurbo(this, 321, 217, textureX, textureY); // Box 356
		bodyModel[187] = new ModelRendererTurbo(this, 1, 281, textureX, textureY); // Box 675
		bodyModel[188] = new ModelRendererTurbo(this, 9, 281, textureX, textureY); // Box 676
		bodyModel[189] = new ModelRendererTurbo(this, 17, 281, textureX, textureY); // Box 677
		bodyModel[190] = new ModelRendererTurbo(this, 25, 281, textureX, textureY); // Box 400
		bodyModel[191] = new ModelRendererTurbo(this, 33, 281, textureX, textureY); // Box 401
		bodyModel[192] = new ModelRendererTurbo(this, 41, 281, textureX, textureY); // Box 402
		bodyModel[193] = new ModelRendererTurbo(this, 49, 281, textureX, textureY); // Box 415
		bodyModel[194] = new ModelRendererTurbo(this, 65, 281, textureX, textureY); // Box 416
		bodyModel[195] = new ModelRendererTurbo(this, 81, 281, textureX, textureY); // Box 417
		bodyModel[196] = new ModelRendererTurbo(this, 97, 281, textureX, textureY); // Box 227
		bodyModel[197] = new ModelRendererTurbo(this, 105, 281, textureX, textureY); // Box 228
		bodyModel[198] = new ModelRendererTurbo(this, 113, 281, textureX, textureY); // Box 229
		bodyModel[199] = new ModelRendererTurbo(this, 121, 281, textureX, textureY); // Box 230
		bodyModel[200] = new ModelRendererTurbo(this, 129, 281, textureX, textureY); // Box 231
		bodyModel[201] = new ModelRendererTurbo(this, 137, 281, textureX, textureY); // Box 232
		bodyModel[202] = new ModelRendererTurbo(this, 41, 281, textureX, textureY); // Box 372
		bodyModel[203] = new ModelRendererTurbo(this, 33, 281, textureX, textureY); // Box 373
		bodyModel[204] = new ModelRendererTurbo(this, 25, 281, textureX, textureY); // Box 374
		bodyModel[205] = new ModelRendererTurbo(this, 41, 281, textureX, textureY); // Box 375
		bodyModel[206] = new ModelRendererTurbo(this, 33, 281, textureX, textureY); // Box 376
		bodyModel[207] = new ModelRendererTurbo(this, 25, 281, textureX, textureY); // Box 377

		bodyModel[0].addShapeBox(0F, 0F, 0F, 28, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-34F, -30F, -13F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 28, 10, 5, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[1].setRotationPoint(-34F, -40F, -13F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 35, 10, 5, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[2].setRotationPoint(-69F, -40F, -13F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 35, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[3].setRotationPoint(-69F, -30F, -13F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 27, 10, 5, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[4].setRotationPoint(-6F, -40F, -13F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 27, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[5].setRotationPoint(-6F, -30F, -13F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 24, 6, 13, 0F,0F, 0F, 0F, 0F, -2F, -4F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, 2F, -5F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 9
		bodyModel[6].setRotationPoint(21F, -30F, -13F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 24, 10, 13, 0F,0F, 0F, -3F, 0F, -2F, -6F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -4F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[7].setRotationPoint(21F, -40F, -13F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 24, 2, 10, 0F,0F, 1.5F, -5F, 0F, -1F, -6F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 2F, -3F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[8].setRotationPoint(21F, -42F, -10F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 35, 5, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[9].setRotationPoint(-69F, -24F, -13F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 35, 4, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 2F, -5F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 18
		bodyModel[10].setRotationPoint(-69F, -19F, -11F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 28, 5, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[11].setRotationPoint(-34F, -24F, -13F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 28, 4, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -5F, 0F, 0F, 3F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 20
		bodyModel[12].setRotationPoint(-34F, -19F, -11F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 27, 5, 13, 0F,0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[13].setRotationPoint(-6F, -24F, -13F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 27, 6, 11, 0F,0F, 0F, 0F, 0F, 0F, 1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9999F, 2.9999F, 0F, -5.9999F, 1.9999F, 0F, -1.9999F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[14].setRotationPoint(-6F, -19F, -11F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 24, 3, 13, 0F,0F, 0F, -1F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -7F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[15].setRotationPoint(21F, -22F, -13F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 24, 4, 13, 0F,0F, 0F, 0F, 0F, -1F, -7F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -3F, -7F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[16].setRotationPoint(21F, -19F, -13F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,0F, 0F, -3F, 0F, -1F, -2F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 71
		bodyModel[17].setRotationPoint(-59F, -43F, -10F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 10, 3, 4, 0F,0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 72
		bodyModel[18].setRotationPoint(-69F, -43F, -10F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 10, 2, 6, 0F,0F, -1.9999F, 0F, 0F, -1.9999F, 0.9999F, -6.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.9999F, -6.9999F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[19].setRotationPoint(-69F, -45F, -6F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 53, 2, 3, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 74
		bodyModel[20].setRotationPoint(-56F, -42F, -10F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 12, 2, 3, 0F,0F, 0F, -2F, 0F, 1F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 75
		bodyModel[21].setRotationPoint(-3F, -42F, -10F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 8, 2, 6, 0F,0F, 1F, -2F, 0F, 2F, -5F, 0F, 2F, 0F, 0F, 1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 76
		bodyModel[22].setRotationPoint(9F, -42F, -10F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 4, 5, 10, 0F,0F, -1F, -5F, 0F, -1.5F, -5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[23].setRotationPoint(17F, -45F, -10F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 78
		bodyModel[24].setRotationPoint(-42F, -43F, -8F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[25].setRotationPoint(-17F, -43F, -8F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 80
		bodyModel[26].setRotationPoint(-16F, -48F, -5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 81
		bodyModel[27].setRotationPoint(-17F, -48F, -5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 82
		bodyModel[28].setRotationPoint(-4F, -48F, -5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 83
		bodyModel[29].setRotationPoint(-42F, -49F, -5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[30].setRotationPoint(-42F, -49F, -5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 85
		bodyModel[31].setRotationPoint(-31F, -49F, -5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 86
		bodyModel[32].setRotationPoint(-56F, -49F, -5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 87
		bodyModel[33].setRotationPoint(-56F, -49F, -5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[34].setRotationPoint(-56F, -52F, -1F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F); // Box 89
		bodyModel[35].setRotationPoint(-56F, -49F, -5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 90
		bodyModel[36].setRotationPoint(-42F, -49F, -5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 91
		bodyModel[37].setRotationPoint(-31F, -49F, -5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 1F, -2F, 0F); // Box 92
		bodyModel[38].setRotationPoint(-4F, -48F, -5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 93
		bodyModel[39].setRotationPoint(-17F, -48F, -5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		bodyModel[40].setRotationPoint(-42F, -52F, -2F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[41].setRotationPoint(-31F, -51F, -2F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[42].setRotationPoint(-17F, -51F, -2F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[43].setRotationPoint(-5F, -50F, -2F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 4, 16, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		bodyModel[44].setRotationPoint(17F, -40F, -9F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 10, 3, 7, 0F,0F, 0F, -1F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -7F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[45].setRotationPoint(-69F, -43F, -7F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 10, 16, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[46].setRotationPoint(-69F, -40F, -8F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 27, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[47].setRotationPoint(-6F, -24F, -8F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 28, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		bodyModel[48].setRotationPoint(-34F, -30F, 8F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 28, 10, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[49].setRotationPoint(-34F, -40F, 8F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 35, 10, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[50].setRotationPoint(-69F, -40F, 8F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 35, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[51].setRotationPoint(-69F, -30F, 8F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 27, 10, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134
		bodyModel[52].setRotationPoint(-6F, -40F, 8F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 27, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -1F, 0F, 0F, 0F); // Box 135
		bodyModel[53].setRotationPoint(-6F, -30F, 8F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 24, 6, 13, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -4F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, -5F, 0F, 2F, -1F); // Box 136
		bodyModel[54].setRotationPoint(21F, -30F, 0F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 24, 10, 13, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -6F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -4F, 0F, 0F, 0F); // Box 137
		bodyModel[55].setRotationPoint(21F, -40F, 0F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 24, 2, 10, 0F,0F, 2.5F, 0F, 0F, 0F, 0F, 0F, -1F, -6F, 0F, 1.5F, -5F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -3F, 0F, 0F, 0F); // Box 138
		bodyModel[56].setRotationPoint(21F, -42F, 0F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 35, 5, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 142
		bodyModel[57].setRotationPoint(-69F, -24F, 0F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 35, 4, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, -5F, 0F, 0F, -5F); // Box 145
		bodyModel[58].setRotationPoint(-69F, -19F, 0F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 28, 5, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 146
		bodyModel[59].setRotationPoint(-34F, -24F, 0F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 28, 4, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 3F, 0F, 2F, -5F); // Box 147
		bodyModel[60].setRotationPoint(-34F, -19F, 0F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 27, 5, 13, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 148
		bodyModel[61].setRotationPoint(-6F, -24F, 0F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 27, 6, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9999F, 0F, 0F, -5.9999F, 1.9999F, 0F, -1.9999F, 2.9999F); // Box 149
		bodyModel[62].setRotationPoint(-6F, -19F, 0F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 24, 3, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -7F, 0F, 0F, 0F); // Box 150
		bodyModel[63].setRotationPoint(21F, -22F, 0F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 24, 4, 13, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, -7F, 0F, -4F, 0F); // Box 156
		bodyModel[64].setRotationPoint(21F, -19F, 0F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -2F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[65].setRotationPoint(-59F, -43F, 6F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 10, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		bodyModel[66].setRotationPoint(-69F, -43F, 6F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 10, 2, 6, 0F,0F, 0F, 0F, -6.9999F, 0F, 0F, 0F, -1.9999F, 0.9999F, 0F, -1.9999F, 0F, 0F, 0F, 0F, -6.9999F, 0F, 0F, 0F, 0F, 0.9999F, 0F, 0F, 0F); // Box 198
		bodyModel[67].setRotationPoint(-69F, -45F, 0F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 53, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		bodyModel[68].setRotationPoint(-56F, -42F, 7F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 12, 2, 3, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
		bodyModel[69].setRotationPoint(-3F, -42F, 7F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 8, 2, 6, 0F,0F, 1F, -3F, 0F, 2F, 0F, 0F, 2F, -5F, 0F, 1F, -2F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
		bodyModel[70].setRotationPoint(9F, -42F, 4F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 4, 5, 10, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, -5F, 0F, -1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[71].setRotationPoint(17F, -45F, 0F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 203
		bodyModel[72].setRotationPoint(-42F, -43F, 7F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[73].setRotationPoint(-17F, -43F, 7F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 208
		bodyModel[74].setRotationPoint(-42F, -49F, 4F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 209
		bodyModel[75].setRotationPoint(-42F, -49F, 4F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 210
		bodyModel[76].setRotationPoint(-31F, -49F, 4F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 211
		bodyModel[77].setRotationPoint(-56F, -49F, 4F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 212
		bodyModel[78].setRotationPoint(-56F, -49F, 1F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 213
		bodyModel[79].setRotationPoint(-56F, -52F, 0F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F); // Box 214
		bodyModel[80].setRotationPoint(-56F, -49F, 4F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 215
		bodyModel[81].setRotationPoint(-42F, -49F, 2F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 216
		bodyModel[82].setRotationPoint(-31F, -49F, 2F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		bodyModel[83].setRotationPoint(-42F, -52F, 0F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		bodyModel[84].setRotationPoint(-31F, -51F, 0F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 222
		bodyModel[85].setRotationPoint(-5F, -50F, 0F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 4, 16, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[86].setRotationPoint(17F, -40F, 0F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 10, 3, 7, 0F,0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 224
		bodyModel[87].setRotationPoint(-69F, -43F, 0F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 10, 16, 8, 0F,0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		bodyModel[88].setRotationPoint(-69F, -40F, 0F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 27, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
		bodyModel[89].setRotationPoint(-6F, -24F, 0F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 695
		bodyModel[90].setRotationPoint(-5F, -62F, -0.5F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 267
		bodyModel[91].setRotationPoint(-56F, -49F, -5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 268
		bodyModel[92].setRotationPoint(-30F, -49F, -5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 269
		bodyModel[93].setRotationPoint(-16F, -48F, 4F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 270
		bodyModel[94].setRotationPoint(-17F, -48F, 4F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 271
		bodyModel[95].setRotationPoint(-4F, -48F, 4F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,1F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		bodyModel[96].setRotationPoint(-4F, -48F, 2F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 3F, 0F, 0F, 3F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 273
		bodyModel[97].setRotationPoint(-17F, -48F, 2F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 274
		bodyModel[98].setRotationPoint(-17F, -51F, 0F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 275
		bodyModel[99].setRotationPoint(-56F, -49F, 4F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 276
		bodyModel[100].setRotationPoint(-30F, -49F, 4F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 11, 9, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 271
		bodyModel[101].setRotationPoint(-69F, -40F, -8F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 11, 4, 16, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		bodyModel[102].setRotationPoint(-69F, -44F, -8F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 12, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 484
		bodyModel[103].setRotationPoint(-4F, -41F, -8F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 3, 5, 2, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 1F); // Box 485
		bodyModel[104].setRotationPoint(-7F, -41F, -8F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 3, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, 1F, 0F, 0F, 0F); // Box 487
		bodyModel[105].setRotationPoint(8F, -41F, -8F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 2, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 488
		bodyModel[106].setRotationPoint(9F, -41F, -5F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 2, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 489
		bodyModel[107].setRotationPoint(-7F, -41F, -5F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 12, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 490
		bodyModel[108].setRotationPoint(-4F, -41F, 6F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 3, 5, 2, 0F,-2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 491
		bodyModel[109].setRotationPoint(-7F, -41F, 6F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 3, 5, 2, 0F,0F, 0F, 0F, -2F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 492
		bodyModel[110].setRotationPoint(8F, -41F, 6F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 6, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 493
		bodyModel[111].setRotationPoint(11F, -40F, -4F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 494
		bodyModel[112].setRotationPoint(13F, -42F, -4F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 495
		bodyModel[113].setRotationPoint(13F, -43F, -4F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 496
		bodyModel[114].setRotationPoint(-4F, -36F, -8F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 497
		bodyModel[115].setRotationPoint(-4F, -36F, 7F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 498
		bodyModel[116].setRotationPoint(7F, -36F, 7F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 499
		bodyModel[117].setRotationPoint(7F, -36F, -8F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 578
		bodyModel[118].setRotationPoint(-3F, -41F, 3F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 579
		bodyModel[119].setRotationPoint(-3F, -41F, -4F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 15, 10, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 580
		bodyModel[120].setRotationPoint(-2F, -44F, -5F);

		bodyModel[121].addShapeBox(0F, 1F, 0F, 10, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 582
		bodyModel[121].setRotationPoint(-2F, -30F, -5F);
		bodyModel[121].rotateAngleZ = 0.08726646F;

		bodyModel[122].addShapeBox(-2F, 0.25F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 583
		bodyModel[122].setRotationPoint(0F, -30F, -5F);
		bodyModel[122].rotateAngleZ = 0.08726646F;

		bodyModel[123].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 584
		bodyModel[123].setRotationPoint(-2F, -36F, -6F);
		bodyModel[123].rotateAngleZ = -0.78539816F;

		bodyModel[124].addShapeBox(0F, -0.3F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 585
		bodyModel[124].setRotationPoint(7F, -30F, -5F);
		bodyModel[124].rotateAngleZ = 0.12217305F;

		bodyModel[125].addShapeBox(-2F, 0.25F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 586
		bodyModel[125].setRotationPoint(0F, -30F, 4F);
		bodyModel[125].rotateAngleZ = 0.08726646F;

		bodyModel[126].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 587
		bodyModel[126].setRotationPoint(-2F, -36F, 5F);
		bodyModel[126].rotateAngleZ = -0.78539816F;

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 15, 8, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 588
		bodyModel[127].setRotationPoint(-1F, -43F, -4F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 589
		bodyModel[128].setRotationPoint(-0.699999999999999F, -43.3F, 1F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 590
		bodyModel[129].setRotationPoint(-0.699999999999999F, -43.3F, -2F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 591
		bodyModel[130].setRotationPoint(-3.5F, -45.5F, -1.5F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 592
		bodyModel[131].setRotationPoint(-3.5F, -46.5F, -1.5F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 593
		bodyModel[132].setRotationPoint(-3.5F, -47.5F, -1.5F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 594
		bodyModel[133].setRotationPoint(-4F, -48F, -3F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 84, 3, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 304
		bodyModel[134].setRotationPoint(-66F, -27F, -8F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 465
		bodyModel[135].setRotationPoint(-58.5F, -45F, -1F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, 0F); // Box 466
		bodyModel[136].setRotationPoint(-58.5F, -45.5F, -1F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 467
		bodyModel[137].setRotationPoint(-57F, -45.75F, -1F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 468
		bodyModel[138].setRotationPoint(-57F, -44.75F, -1F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.6F, -0.25F, 0F); // Box 469
		bodyModel[139].setRotationPoint(-57.1F, -44.25F, -1F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.7F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.5F, 0F, -0.7F, -0.5F, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 470
		bodyModel[140].setRotationPoint(-58.5F, -46.5F, -1F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.7F, -0.5F, -0.3F, -0.2F, -0.5F, -0.3F, -0.2F, -0.3F, 0F, -0.7F, -0.3F, 0F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 471
		bodyModel[141].setRotationPoint(-58.5F, -46.5F, 0F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.1F); // Box 472
		bodyModel[142].setRotationPoint(-56.7F, -45.5F, -1F);

		bodyModel[143].addShapeBox(0F, 1F, 0F, 10, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
		bodyModel[143].setRotationPoint(-50F, -31.5F, -5F);
		bodyModel[143].rotateAngleZ = -0.10471976F;

		bodyModel[144].addShapeBox(9F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		bodyModel[144].setRotationPoint(-50F, -31.5F, -5F);
		bodyModel[144].rotateAngleZ = -0.10471976F;

		bodyModel[145].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		bodyModel[145].setRotationPoint(-50F, -31.5F, -5F);
		bodyModel[145].rotateAngleZ = -0.10471976F;

		bodyModel[146].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		bodyModel[146].setRotationPoint(-50F, -31.5F, 4F);
		bodyModel[146].rotateAngleZ = -0.10471976F;

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		bodyModel[147].setRotationPoint(-50F, -31.5F, -5F);
		bodyModel[147].rotateAngleZ = -0.10471976F;

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 17, 10, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		bodyModel[148].setRotationPoint(-41F, -47.5F, -5F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[149].setRotationPoint(-39F, -51.5F, -3F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 17, 8, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 246
		bodyModel[150].setRotationPoint(-42F, -46.5F, -4F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[151].setRotationPoint(-42.3F, -46.8F, -2F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[152].setRotationPoint(-42.3F, -46.8F, 1F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 2, 18, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[153].setRotationPoint(-41F, -44.5F, -4F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 2, 18, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 251
		bodyModel[154].setRotationPoint(-41F, -44.5F, 3F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[155].setRotationPoint(-47F, -30.5F, -6F);
		bodyModel[155].rotateAngleZ = 0.78539816F;

		bodyModel[156].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 253
		bodyModel[156].setRotationPoint(-47F, -30.5F, 5F);
		bodyModel[156].rotateAngleZ = 0.78539816F;

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 962
		bodyModel[157].setRotationPoint(-39.5F, -51F, -1.5F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 964
		bodyModel[158].setRotationPoint(-39.5F, -50F, -1.5F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 966
		bodyModel[159].setRotationPoint(-39.5F, -49F, -1.5F);

		bodyModel[160].addShapeBox(0F, -3F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 259
		bodyModel[160].setRotationPoint(-61F, -27.5F, -6F);
		bodyModel[160].rotateAngleZ = 0.15707963F;

		bodyModel[161].addShapeBox(0F, -3F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
		bodyModel[161].setRotationPoint(-61F, -27.5F, 4F);
		bodyModel[161].rotateAngleZ = 0.15707963F;

		bodyModel[162].addShapeBox(0F, 0F, 0F, 7, 9, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 256
		bodyModel[162].setRotationPoint(-66F, -35.5F, -2F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 8, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[163].setRotationPoint(-58F, -28.5F, -2F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 254
		bodyModel[164].setRotationPoint(-58F, -29.5F, -1.5F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 263
		bodyModel[165].setRotationPoint(-55.5F, -32.5F, -1F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 264
		bodyModel[166].setRotationPoint(-55F, -36.5F, -0.5F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 265
		bodyModel[167].setRotationPoint(-55F, -38.5F, -0.5F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 266
		bodyModel[168].setRotationPoint(-54.7F, -38.6F, -0.5F);

		bodyModel[169].addShapeBox(0F, -1F, -1F, 0, 75, 75, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -73F, 0F, 0F, -73F, 0F, -73F, 0F, 0F, -73F, 0F, 0F, -73F, -73F, 0F, -73F, -73F); // Box 814
		bodyModel[169].setRotationPoint(-57.5F, -46.5F, 0F);
		bodyModel[169].rotateAngleX = -0.01745329F;
		bodyModel[169].rotateAngleY = 0.01745329F;
		bodyModel[169].rotateAngleZ = -0.29670597F;

		bodyModel[170].addShapeBox(0F, 1F, 0F, 10, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 340
		bodyModel[170].setRotationPoint(-29F, -30.5F, -5F);
		bodyModel[170].rotateAngleZ = -0.10471976F;

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 17, 10, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 341
		bodyModel[171].setRotationPoint(-20F, -46.5F, -5F);

		bodyModel[172].addShapeBox(9F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 342
		bodyModel[172].setRotationPoint(-29F, -30.5F, -5F);
		bodyModel[172].rotateAngleZ = -0.10471976F;

		bodyModel[173].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 343
		bodyModel[173].setRotationPoint(-29F, -30.5F, 4F);
		bodyModel[173].rotateAngleZ = -0.10471976F;

		bodyModel[174].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 344
		bodyModel[174].setRotationPoint(-26F, -29.5F, 5F);
		bodyModel[174].rotateAngleZ = 0.78539816F;

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 345
		bodyModel[175].setRotationPoint(-29F, -30.5F, -5F);
		bodyModel[175].rotateAngleZ = -0.10471976F;

		bodyModel[176].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 346
		bodyModel[176].setRotationPoint(-29F, -30.5F, -5F);
		bodyModel[176].rotateAngleZ = -0.10471976F;

		bodyModel[177].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 347
		bodyModel[177].setRotationPoint(-26F, -29.5F, -6F);
		bodyModel[177].rotateAngleZ = 0.78539816F;

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 348
		bodyModel[178].setRotationPoint(-21.3F, -45.8F, -2F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 17, 8, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 349
		bodyModel[179].setRotationPoint(-21F, -45.5F, -4F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 350
		bodyModel[180].setRotationPoint(-21.3F, -45.8F, 1F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 351
		bodyModel[181].setRotationPoint(-18F, -50.5F, -3F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 352
		bodyModel[182].setRotationPoint(-18.5F, -50F, -1.5F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 353
		bodyModel[183].setRotationPoint(-18.5F, -48F, -1.5F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 354
		bodyModel[184].setRotationPoint(-18.5F, -49F, -1.5F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 2, 18, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 355
		bodyModel[185].setRotationPoint(-20F, -43.5F, -4F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 2, 18, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 356
		bodyModel[186].setRotationPoint(-20F, -43.5F, 3F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 675
		bodyModel[187].setRotationPoint(-58.75F, -41.5F, 2.5F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 676
		bodyModel[188].setRotationPoint(-58.75F, -41F, 2.5F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 677
		bodyModel[189].setRotationPoint(-58.75F, -41F, 2.5F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 400
		bodyModel[190].setRotationPoint(-58.75F, -41.5F, -4F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 401
		bodyModel[191].setRotationPoint(-58.75F, -41F, -4F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 402
		bodyModel[192].setRotationPoint(-58.75F, -41F, -4F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 415
		bodyModel[193].setRotationPoint(-58.75F, -42.5F, -1.25F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 416
		bodyModel[194].setRotationPoint(-58.75F, -42F, -1.25F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 417
		bodyModel[195].setRotationPoint(-58.75F, -41F, -1.25F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 227
		bodyModel[196].setRotationPoint(-58.75F, -39.5F, 1.5F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 228
		bodyModel[197].setRotationPoint(-58.75F, -39F, 1.5F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 229
		bodyModel[198].setRotationPoint(-58.75F, -39F, 1.5F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 230
		bodyModel[199].setRotationPoint(-58.75F, -39.5F, -3.5F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 231
		bodyModel[200].setRotationPoint(-58.75F, -39F, -3.5F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 232
		bodyModel[201].setRotationPoint(-58.75F, -39F, -3.5F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 372
		bodyModel[202].setRotationPoint(-58.75F, -38F, -6F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 373
		bodyModel[203].setRotationPoint(-58.75F, -38F, -6F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 374
		bodyModel[204].setRotationPoint(-58.75F, -38.5F, -6F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 375
		bodyModel[205].setRotationPoint(-58.75F, -38F, 4F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 376
		bodyModel[206].setRotationPoint(-58.75F, -38F, 4F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 377
		bodyModel[207].setRotationPoint(-58.75F, -38.5F, 4F);
	}

	private void initnoseModel_1()
	{
		noseModel[0] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 4
		noseModel[1] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 5
		noseModel[2] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 6
		noseModel[3] = new ModelRendererTurbo(this, 961, 1, textureX, textureY); // Box 16
		noseModel[4] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 17
		noseModel[5] = new ModelRendererTurbo(this, 977, 33, textureX, textureY); // Box 55
		noseModel[6] = new ModelRendererTurbo(this, 537, 33, textureX, textureY); // Box 56
		noseModel[7] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Box 57
		noseModel[8] = new ModelRendererTurbo(this, 953, 49, textureX, textureY); // Box 58
		noseModel[9] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 59
		noseModel[10] = new ModelRendererTurbo(this, 689, 57, textureX, textureY); // Box 60
		noseModel[11] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 61
		noseModel[12] = new ModelRendererTurbo(this, 745, 57, textureX, textureY); // Box 62
		noseModel[13] = new ModelRendererTurbo(this, 1001, 1, textureX, textureY); // Box 64
		noseModel[14] = new ModelRendererTurbo(this, 801, 1, textureX, textureY); // Box 65
		noseModel[15] = new ModelRendererTurbo(this, 873, 1, textureX, textureY); // Box 67
		noseModel[16] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 68
		noseModel[17] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 69
		noseModel[18] = new ModelRendererTurbo(this, 561, 17, textureX, textureY); // Box 70
		noseModel[19] = new ModelRendererTurbo(this, 537, 49, textureX, textureY); // Box 119
		noseModel[20] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Box 120
		noseModel[21] = new ModelRendererTurbo(this, 729, 57, textureX, textureY); // Box 121
		noseModel[22] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 122
		noseModel[23] = new ModelRendererTurbo(this, 353, 89, textureX, textureY); // Box 60
		noseModel[24] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // Box 61
		noseModel[25] = new ModelRendererTurbo(this, 793, 89, textureX, textureY); // Box 62
		noseModel[26] = new ModelRendererTurbo(this, 857, 33, textureX, textureY); // Box 63
		noseModel[27] = new ModelRendererTurbo(this, 817, 89, textureX, textureY); // Box 131
		noseModel[28] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 132
		noseModel[29] = new ModelRendererTurbo(this, 81, 105, textureX, textureY); // Box 133
		noseModel[30] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 143
		noseModel[31] = new ModelRendererTurbo(this, 249, 129, textureX, textureY); // Box 144
		noseModel[32] = new ModelRendererTurbo(this, 473, 169, textureX, textureY); // Box 182
		noseModel[33] = new ModelRendererTurbo(this, 353, 105, textureX, textureY); // Box 183
		noseModel[34] = new ModelRendererTurbo(this, 897, 169, textureX, textureY); // Box 184
		noseModel[35] = new ModelRendererTurbo(this, 545, 113, textureX, textureY); // Box 185
		noseModel[36] = new ModelRendererTurbo(this, 65, 177, textureX, textureY); // Box 186
		noseModel[37] = new ModelRendererTurbo(this, 281, 177, textureX, textureY); // Box 187
		noseModel[38] = new ModelRendererTurbo(this, 689, 177, textureX, textureY); // Box 188
		noseModel[39] = new ModelRendererTurbo(this, 977, 169, textureX, textureY); // Box 189
		noseModel[40] = new ModelRendererTurbo(this, 673, 65, textureX, textureY); // Box 190
		noseModel[41] = new ModelRendererTurbo(this, 289, 49, textureX, textureY); // Box 191
		noseModel[42] = new ModelRendererTurbo(this, 881, 57, textureX, textureY); // Box 192
		noseModel[43] = new ModelRendererTurbo(this, 793, 65, textureX, textureY); // Box 193
		noseModel[44] = new ModelRendererTurbo(this, 41, 89, textureX, textureY); // Box 194
		noseModel[45] = new ModelRendererTurbo(this, 705, 81, textureX, textureY); // Box 195
		noseModel[46] = new ModelRendererTurbo(this, 793, 105, textureX, textureY); // Box 244
		noseModel[47] = new ModelRendererTurbo(this, 249, 185, textureX, textureY); // Box 245
		noseModel[48] = new ModelRendererTurbo(this, 41, 129, textureX, textureY); // Box 246
		noseModel[49] = new ModelRendererTurbo(this, 289, 129, textureX, textureY); // Box 247
		noseModel[50] = new ModelRendererTurbo(this, 105, 177, textureX, textureY); // Box 248
		noseModel[51] = new ModelRendererTurbo(this, 961, 81, textureX, textureY); // Box 249
		noseModel[52] = new ModelRendererTurbo(this, 801, 185, textureX, textureY); // Box 250
		noseModel[53] = new ModelRendererTurbo(this, 617, 89, textureX, textureY); // Box 251
		noseModel[54] = new ModelRendererTurbo(this, 937, 169, textureX, textureY); // Box 205
		noseModel[55] = new ModelRendererTurbo(this, 585, 193, textureX, textureY); // Box 206
		noseModel[56] = new ModelRendererTurbo(this, 137, 201, textureX, textureY); // Box 207
		noseModel[57] = new ModelRendererTurbo(this, 1001, 201, textureX, textureY); // Box 208

		noseModel[0].addShapeBox(0F, 0F, 0F, 12, 10, 13, 0F,0F, -1F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		noseModel[0].setRotationPoint(-81F, -40F, -13F);

		noseModel[1].addShapeBox(0F, 0F, 0F, 12, 6, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 5
		noseModel[1].setRotationPoint(-81F, -30F, -13F);

		noseModel[2].addShapeBox(0F, 0F, 0F, 12, 3, 10, 0F,0F, -1F, -4F, 0F, 0F, -4F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 6
		noseModel[2].setRotationPoint(-81F, -43F, -10F);

		noseModel[3].addShapeBox(0F, 0F, 0F, 12, 5, 13, 0F,0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, -8F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 16
		noseModel[3].setRotationPoint(-81F, -24F, -13F);

		noseModel[4].addShapeBox(0F, 0F, 0F, 12, 4, 11, 0F,0F, -1.9999F, -5.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9999F, 0F, 0F, -1.9999F, -5.9999F, 0F, 0F, -4.9999F, 0F, 1.9999F, 0F, 0F, -0.9999F, 0F); // Box 17
		noseModel[4].setRotationPoint(-81F, -19F, -11F);

		noseModel[5].addShapeBox(0F, 0F, 0F, 5, 9, 13, 0F,0F, -1F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		noseModel[5].setRotationPoint(-86F, -39F, -13F);

		noseModel[6].addShapeBox(0F, 0F, 0F, 5, 3, 10, 0F,0F, -1F, -4F, 0F, 0F, -4F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 56
		noseModel[6].setRotationPoint(-86F, -42F, -10F);

		noseModel[7].addShapeBox(0F, 0F, 0F, 5, 5, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		noseModel[7].setRotationPoint(-86F, -30F, -13F);

		noseModel[8].addShapeBox(0F, 0F, 0F, 5, 8, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		noseModel[8].setRotationPoint(-86F, -25F, -12F);

		noseModel[9].addShapeBox(0F, 0F, 0F, 12, 5, 14, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		noseModel[9].setRotationPoint(-98F, -30F, -14F);

		noseModel[10].addShapeBox(0F, 0F, 0F, 12, 9, 13, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -8F, 0F, -1F, -7F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 60
		noseModel[10].setRotationPoint(-98F, -25F, -13F);

		noseModel[11].addShapeBox(0F, 0F, 0F, 12, 9, 14, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		noseModel[11].setRotationPoint(-98F, -39F, -14F);

		noseModel[12].addShapeBox(0F, 0F, 0F, 12, 3, 11, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		noseModel[12].setRotationPoint(-98F, -42F, -11F);

		noseModel[13].addShapeBox(0F, 0F, 0F, 4, 9, 3, 0F,0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 64
		noseModel[13].setRotationPoint(-102F, -39F, -10F);

		noseModel[14].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 65
		noseModel[14].setRotationPoint(-102F, -30F, -10F);

		noseModel[15].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 67
		noseModel[15].setRotationPoint(-86F, -17F, -5F);

		noseModel[16].addShapeBox(0F, 0F, 0F, 4, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 68
		noseModel[16].setRotationPoint(-73F, -17F, -5F);

		noseModel[17].addShapeBox(0F, 0F, 0F, 8, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		noseModel[17].setRotationPoint(-81F, -17F, -5F);

		noseModel[18].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		noseModel[18].setRotationPoint(-86F, -14F, -4F);

		noseModel[19].addShapeBox(0F, 0F, 0F, 4, 3, 6, 0F,0F, -3F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 2F, -3F); // Box 119
		noseModel[19].setRotationPoint(-102F, -42F, -10F);

		noseModel[20].addShapeBox(0F, 0F, 0F, 4, 7, 8, 0F,0F, 0F, -2F, 0F, -1F, 0F, 0F, -1F, -5F, 0F, 0F, -5F, 0F, -2F, -7F, 0F, 1F, -7F, 0F, 1F, 0F, 0F, -2F, 0F); // Box 120
		noseModel[20].setRotationPoint(-102F, -26F, -12F);

		noseModel[21].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F,0F, -5F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 4F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 121
		noseModel[21].setRotationPoint(-102F, -44F, -6F);

		noseModel[22].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F,0F, 4F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 3F, 0F, 0F, -5F, -1F, 0F, -2F, -1F, 0F, -1F, 0F, 0F, -3F, 0F); // Box 122
		noseModel[22].setRotationPoint(-102F, -18F, -6F);

		noseModel[23].addShapeBox(0F, 0F, 0F, 10, 4, 5, 0F,0F, -1F, -2F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		noseModel[23].setRotationPoint(-108F, -34F, -5F);

		noseModel[24].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,-0.5F, -1.5F, -2.5F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 61
		noseModel[24].setRotationPoint(-112F, -33F, -4F);

		noseModel[25].addShapeBox(0F, 0F, 0F, 10, 4, 5, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 62
		noseModel[25].setRotationPoint(-108F, -30F, -5F);

		noseModel[26].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -0.5F, -1.5F, -2.5F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, -1F, 0F); // Box 63
		noseModel[26].setRotationPoint(-112F, -30F, -4F);

		noseModel[27].addShapeBox(0F, 0F, 0F, 12, 10, 13, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		noseModel[27].setRotationPoint(-81F, -40F, 0F);

		noseModel[28].addShapeBox(0F, 0F, 0F, 12, 6, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 132
		noseModel[28].setRotationPoint(-81F, -30F, 0F);

		noseModel[29].addShapeBox(0F, 0F, 0F, 12, 3, 10, 0F,0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, -4F, 0F, -1F, -4F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 133
		noseModel[29].setRotationPoint(-81F, -43F, 0F);

		noseModel[30].addShapeBox(0F, 0F, 0F, 12, 5, 13, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 2F, -8F); // Box 143
		noseModel[30].setRotationPoint(-81F, -24F, 0F);

		noseModel[31].addShapeBox(0F, 0F, 0F, 12, 4, 11, 0F,0F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9999F, -5.9999F, 0F, -0.9999F, 0F, 0F, 1.9999F, 0F, 0F, 0F, -4.9999F, 0F, -1.9999F, -5.9999F); // Box 144
		noseModel[31].setRotationPoint(-81F, -19F, 0F);

		noseModel[32].addShapeBox(0F, 0F, 0F, 5, 9, 13, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182
		noseModel[32].setRotationPoint(-86F, -39F, 0F);

		noseModel[33].addShapeBox(0F, 0F, 0F, 5, 3, 10, 0F,0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, -4F, 0F, -1F, -4F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 183
		noseModel[33].setRotationPoint(-86F, -42F, 0F);

		noseModel[34].addShapeBox(0F, 0F, 0F, 5, 5, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 184
		noseModel[34].setRotationPoint(-86F, -30F, 0F);

		noseModel[35].addShapeBox(0F, 0F, 0F, 5, 8, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F); // Box 185
		noseModel[35].setRotationPoint(-86F, -25F, 0F);

		noseModel[36].addShapeBox(0F, 0F, 0F, 12, 5, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F); // Box 186
		noseModel[36].setRotationPoint(-98F, -30F, 0F);

		noseModel[37].addShapeBox(0F, 0F, 0F, 12, 9, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -7F, 0F, -2F, -8F); // Box 187
		noseModel[37].setRotationPoint(-98F, -25F, 0F);

		noseModel[38].addShapeBox(0F, 0F, 0F, 12, 9, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 188
		noseModel[38].setRotationPoint(-98F, -39F, 0F);

		noseModel[39].addShapeBox(0F, 0F, 0F, 12, 3, 11, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 189
		noseModel[39].setRotationPoint(-98F, -42F, 0F);

		noseModel[40].addShapeBox(0F, 0F, 0F, 4, 9, 3, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 3F, 0F, 0F, 0F); // Box 190
		noseModel[40].setRotationPoint(-102F, -39F, 7F);

		noseModel[41].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -1F, 0F); // Box 191
		noseModel[41].setRotationPoint(-102F, -30F, 9F);

		noseModel[42].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 192
		noseModel[42].setRotationPoint(-86F, -17F, 4F);

		noseModel[43].addShapeBox(0F, 0F, 0F, 4, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, 0F, -1F); // Box 193
		noseModel[43].setRotationPoint(-73F, -17F, 0F);

		noseModel[44].addShapeBox(0F, 0F, 0F, 8, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 194
		noseModel[44].setRotationPoint(-81F, -17F, 0F);

		noseModel[45].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		noseModel[45].setRotationPoint(-86F, -14F, 0F);

		noseModel[46].addShapeBox(0F, 0F, 0F, 4, 3, 6, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -3F, -5F, 0F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 2F, -2F); // Box 244
		noseModel[46].setRotationPoint(-102F, -42F, 4F);

		noseModel[47].addShapeBox(0F, 0F, 0F, 4, 7, 8, 0F,0F, 0F, -5F, 0F, -1F, -5F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, -7F, 0F, -2F, -7F); // Box 245
		noseModel[47].setRotationPoint(-102F, -26F, 4F);

		noseModel[48].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -5F, -1F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 4F, 0F); // Box 246
		noseModel[48].setRotationPoint(-102F, -44F, 0F);

		noseModel[49].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F,0F, 3F, 0F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 4F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -2F, -1F, 0F, -5F, -1F); // Box 247
		noseModel[49].setRotationPoint(-102F, -18F, 0F);

		noseModel[50].addShapeBox(0F, 0F, 0F, 10, 4, 5, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 248
		noseModel[50].setRotationPoint(-108F, -34F, 0F);

		noseModel[51].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, -0.5F, -1.5F, -2.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 249
		noseModel[51].setRotationPoint(-112F, -33F, 0F);

		noseModel[52].addShapeBox(0F, 0F, 0F, 10, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, -1F, -2F); // Box 250
		noseModel[52].setRotationPoint(-108F, -30F, 0F);

		noseModel[53].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, -0.5F, -1.5F, -2.5F); // Box 251
		noseModel[53].setRotationPoint(-112F, -30F, 0F);

		noseModel[54].addShapeBox(0F, -12F, -1F, 2, 24, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		noseModel[54].setRotationPoint(-99F, -30F, 0F);

		noseModel[55].addShapeBox(0F, -11F, -1F, 2, 22, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		noseModel[55].setRotationPoint(-99F, -30F, 0F);
		noseModel[55].rotateAngleX = -1.57079633F;

		noseModel[56].addShapeBox(0F, -11F, -1F, 2, 22, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		noseModel[56].setRotationPoint(-99F, -30F, 0F);
		noseModel[56].rotateAngleX = -0.78539816F;

		noseModel[57].addShapeBox(0F, -11F, -1F, 2, 22, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 208
		noseModel[57].setRotationPoint(-99F, -30F, 0F);
		noseModel[57].rotateAngleX = 0.78539816F;
	}

	private void inittailModel_1()
	{
		tailModel[0] = new ModelRendererTurbo(this, 809, 1, textureX, textureY); // Box 12
		tailModel[1] = new ModelRendererTurbo(this, 881, 1, textureX, textureY); // Box 13
		tailModel[2] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 14
		tailModel[3] = new ModelRendererTurbo(this, 809, 17, textureX, textureY); // Box 24
		tailModel[4] = new ModelRendererTurbo(this, 641, 25, textureX, textureY); // Box 25
		tailModel[5] = new ModelRendererTurbo(this, 873, 25, textureX, textureY); // Box 26
		tailModel[6] = new ModelRendererTurbo(this, 929, 25, textureX, textureY); // Box 27
		tailModel[7] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 28
		tailModel[8] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 30
		tailModel[9] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 31
		tailModel[10] = new ModelRendererTurbo(this, 817, 33, textureX, textureY); // Box 36
		tailModel[11] = new ModelRendererTurbo(this, 745, 41, textureX, textureY); // Box 37
		tailModel[12] = new ModelRendererTurbo(this, 857, 41, textureX, textureY); // Box 38
		tailModel[13] = new ModelRendererTurbo(this, 697, 25, textureX, textureY); // Box 39
		tailModel[14] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 40
		tailModel[15] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 41
		tailModel[16] = new ModelRendererTurbo(this, 657, 1, textureX, textureY); // Box 42
		tailModel[17] = new ModelRendererTurbo(this, 897, 41, textureX, textureY); // Box 44
		tailModel[18] = new ModelRendererTurbo(this, 953, 1, textureX, textureY); // Box 46
		tailModel[19] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 48
		tailModel[20] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Box 49
		tailModel[21] = new ModelRendererTurbo(this, 777, 41, textureX, textureY); // Box 50
		tailModel[22] = new ModelRendererTurbo(this, 481, 129, textureX, textureY); // Box 139
		tailModel[23] = new ModelRendererTurbo(this, 689, 129, textureX, textureY); // Box 140
		tailModel[24] = new ModelRendererTurbo(this, 921, 113, textureX, textureY); // Box 141
		tailModel[25] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 151
		tailModel[26] = new ModelRendererTurbo(this, 73, 161, textureX, textureY); // Box 152
		tailModel[27] = new ModelRendererTurbo(this, 969, 129, textureX, textureY); // Box 153
		tailModel[28] = new ModelRendererTurbo(this, 313, 161, textureX, textureY); // Box 154
		tailModel[29] = new ModelRendererTurbo(this, 249, 145, textureX, textureY); // Box 155
		tailModel[30] = new ModelRendererTurbo(this, 353, 145, textureX, textureY); // Box 157
		tailModel[31] = new ModelRendererTurbo(this, 497, 145, textureX, textureY); // Box 158
		tailModel[32] = new ModelRendererTurbo(this, 185, 97, textureX, textureY); // Box 163
		tailModel[33] = new ModelRendererTurbo(this, 385, 97, textureX, textureY); // Box 164
		tailModel[34] = new ModelRendererTurbo(this, 441, 97, textureX, textureY); // Box 165
		tailModel[35] = new ModelRendererTurbo(this, 185, 113, textureX, textureY); // Box 166
		tailModel[36] = new ModelRendererTurbo(this, 625, 25, textureX, textureY); // Box 167
		tailModel[37] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 168
		tailModel[38] = new ModelRendererTurbo(this, 137, 65, textureX, textureY); // Box 169
		tailModel[39] = new ModelRendererTurbo(this, 137, 169, textureX, textureY); // Box 171
		tailModel[40] = new ModelRendererTurbo(this, 537, 65, textureX, textureY); // Box 173
		tailModel[41] = new ModelRendererTurbo(this, 153, 169, textureX, textureY); // Box 175
		tailModel[42] = new ModelRendererTurbo(this, 185, 137, textureX, textureY); // Box 176
		tailModel[43] = new ModelRendererTurbo(this, 249, 169, textureX, textureY); // Box 177
		tailModel[44] = new ModelRendererTurbo(this, 193, 249, textureX, textureY); // Box 550

		tailModel[0].addShapeBox(0F, 0F, 0F, 26, 6, 9, 0F,0F, 0F, 0F, 2F, 3F, -2F, 2F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, -2F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 12
		tailModel[0].setRotationPoint(45F, -28F, -9F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 28, 10, 9, 0F,0F, 0F, -2F, 0F, -1F, -4F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 13
		tailModel[1].setRotationPoint(45F, -38F, -9F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 28, 3, 7, 0F,0F, 0F, -3F, 0F, -1F, -4F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 14
		tailModel[2].setRotationPoint(45F, -41F, -7F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 26, 4, 8, 0F,0F, 0F, 0F, 0F, 3F, -1F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -4F, -2F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 24
		tailModel[3].setRotationPoint(45F, -22F, -8F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 22, 6, 7, 0F,0F, 0F, -2F, 0F, -2F, -4F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		tailModel[4].setRotationPoint(73F, -37F, -7F);

		tailModel[5].addShapeBox(0F, 0F, 0F, 22, 3, 5, 0F,0F, 0F, -2F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -2F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 26
		tailModel[5].setRotationPoint(73F, -40F, -5F);

		tailModel[6].addShapeBox(0F, 0F, 0F, 22, 6, 7, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, -2F, -3F, 0F, -2F, 0F, 2F, 0F, 0F); // Box 27
		tailModel[6].setRotationPoint(73F, -31F, -7F);

		tailModel[7].addShapeBox(0F, 0F, 0F, 24, 3, 7, 0F,0F, 0F, 0F, 0F, 1.9999F, -2.9999F, 0F, 1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9999F, 0F, -4.9999F, -2.9999F, 0F, -4.9999F, 0F, 0F, 0F, 0F); // Box 28
		tailModel[7].setRotationPoint(71F, -25F, -7F);

		tailModel[8].addShapeBox(0F, 0F, 0F, 26, 2, 6, 0F,0F, 0F, 0F, 0F, 3.9999F, 0F, 0F, 3.9999F, 0F, 0F, 0F, 0F, 0F, -1.9999F, 0F, 0F, -3.9999F, -2.9999F, 0F, -2.9999F, 0F, 0F, 0F, 0F); // Box 30
		tailModel[8].setRotationPoint(45F, -18F, -6F);

		tailModel[9].addShapeBox(0F, 0F, 0F, 24, 3, 6, 0F,0F, 0F, 0F, 0F, 5F, -2F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -4.5F, -4F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 31
		tailModel[9].setRotationPoint(71F, -22F, -6F);

		tailModel[10].addShapeBox(0F, 0F, 0F, 15, 4, 4, 0F,0F, 0F, -1F, 0F, -1F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		tailModel[10].setRotationPoint(95F, -35F, -4F);

		tailModel[11].addShapeBox(0F, 0F, 0F, 15, 5, 4, 0F,0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 37
		tailModel[11].setRotationPoint(95F, -32F, -4F);

		tailModel[12].addShapeBox(0F, 0F, 0F, 15, 4, 4, 0F,0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 38
		tailModel[12].setRotationPoint(95F, -27F, -4F);

		tailModel[13].addShapeBox(0F, 0F, 0F, 15, 2, 3, 0F,0F, 0F, -1F, -3F, -1F, -2F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 39
		tailModel[13].setRotationPoint(95F, -37F, -3F);

		tailModel[14].addShapeBox(0F, 0F, 0F, 6, 3, 2, 0F,0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 40
		tailModel[14].setRotationPoint(110F, -31F, -2F);

		tailModel[15].addShapeBox(0F, 0F, 0F, 6, 3, 2, 0F,0F, 2.9999F, -0.9999F, 0F, -0.9999F, -0.9999F, 0F, -0.9999F, 0F, 0F, 2.9999F, 0F, 0F, -2.9999F, 0F, 0F, -1.9999F, -0.9999F, 0F, -1.9999F, 0F, 0F, -2.9999F, 0F); // Box 41
		tailModel[15].setRotationPoint(110F, -31F, -2F);

		tailModel[16].addShapeBox(0F, 0F, 0F, 6, 3, 2, 0F,0F, -2.9999F, 0F, 0F, -1.9999F, -0.9999F, 0F, -1.9999F, 0F, 0F, -2.9999F, 0F, 0F, 1.9999F, -0.9999F, 0F, -0.9999F, -0.9999F, 0F, -0.9999F, 0F, 0F, 1.9999F, 0F); // Box 42
		tailModel[16].setRotationPoint(110F, -31F, -2F);

		tailModel[17].addShapeBox(0F, 0F, 0F, 23, 27, 2, 0F,-17F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F); // Box 44
		tailModel[17].setRotationPoint(72F, -64F, -2F);

		tailModel[18].addShapeBox(0F, 0F, 0F, 8, 6, 2, 0F,-5F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		tailModel[18].setRotationPoint(87F, -70F, -2F);

		tailModel[19].addShapeBox(0F, 0F, 0F, 24, 4, 42, 0F,-14F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -14F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 48
		tailModel[19].setRotationPoint(71F, -33F, -43F);

		tailModel[20].addShapeBox(0F, 0F, 0F, 9, 4, 10, 0F,0F, -2F, 0F, -3F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 49
		tailModel[20].setRotationPoint(95F, -33F, -53F);

		tailModel[21].addShapeBox(0F, 0F, 0F, 10, 4, 10, 0F,-3F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 50
		tailModel[21].setRotationPoint(85F, -33F, -53F);

		tailModel[22].addShapeBox(0F, 0F, 0F, 26, 6, 9, 0F,0F, 0F, 0F, 2F, 3F, 0F, 2F, 3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -2F, 0F, 0F, -1F); // Box 139
		tailModel[22].setRotationPoint(45F, -28F, 0F);

		tailModel[23].addShapeBox(0F, 0F, 0F, 28, 10, 9, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -2F, 0F, 0F, 0F); // Box 140
		tailModel[23].setRotationPoint(45F, -38F, 0F);

		tailModel[24].addShapeBox(0F, 0F, 0F, 28, 3, 7, 0F,0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -2F, 0F, 0F, 0F); // Box 141
		tailModel[24].setRotationPoint(45F, -41F, 0F);

		tailModel[25].addShapeBox(0F, 0F, 0F, 26, 4, 8, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, -2F, 0F, 0F, -2F); // Box 151
		tailModel[25].setRotationPoint(45F, -22F, 0F);

		tailModel[26].addShapeBox(0F, 0F, 0F, 22, 6, 7, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 152
		tailModel[26].setRotationPoint(73F, -37F, 0F);

		tailModel[27].addShapeBox(0F, 0F, 0F, 22, 3, 5, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -2F, 0F, 0F, 0F); // Box 153
		tailModel[27].setRotationPoint(73F, -40F, 0F);

		tailModel[28].addShapeBox(0F, 0F, 0F, 22, 6, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -3F, 2F, 0F, 0F); // Box 154
		tailModel[28].setRotationPoint(73F, -31F, 0F);

		tailModel[29].addShapeBox(0F, 0F, 0F, 24, 3, 7, 0F,0F, 0F, 0F, 0F, 1.9999F, 0F, 0F, 1.9999F, -2.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.9999F, 0F, 0F, -4.9999F, -2.9999F, 0F, 0F, -0.9999F); // Box 155
		tailModel[29].setRotationPoint(71F, -25F, 0F);

		tailModel[30].addShapeBox(0F, 0F, 0F, 26, 2, 6, 0F,0F, 0F, 0F, 0F, 3.9999F, 0F, 0F, 3.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.9999F, 0F, 0F, -3.9999F, -2.9999F, 0F, -1.9999F, 0F); // Box 157
		tailModel[30].setRotationPoint(45F, -18F, 0F);

		tailModel[31].addShapeBox(0F, 0F, 0F, 24, 3, 6, 0F,0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4.5F, -4F, 0F, -1F, -3F); // Box 158
		tailModel[31].setRotationPoint(71F, -22F, 0F);

		tailModel[32].addShapeBox(0F, 0F, 0F, 15, 4, 4, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 163
		tailModel[32].setRotationPoint(95F, -35F, 0F);

		tailModel[33].addShapeBox(0F, 0F, 0F, 15, 5, 4, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, 0F, 0F); // Box 164
		tailModel[33].setRotationPoint(95F, -32F, 0F);

		tailModel[34].addShapeBox(0F, 0F, 0F, 15, 4, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -3F, 0F, -0.5F, -2F); // Box 165
		tailModel[34].setRotationPoint(95F, -27F, 0F);

		tailModel[35].addShapeBox(0F, 0F, 0F, 15, 2, 3, 0F,0F, 0F, 0F, -1F, -1F, 0F, -3F, -1F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -2F, 0F, 0F, 0F); // Box 166
		tailModel[35].setRotationPoint(95F, -37F, 0F);

		tailModel[36].addShapeBox(0F, 0F, 0F, 6, 3, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 0F); // Box 167
		tailModel[36].setRotationPoint(110F, -31F, 0F);

		tailModel[37].addShapeBox(0F, 0F, 0F, 6, 3, 2, 0F,0F, 2.9999F, 0F, 0F, -0.9999F, 0F, 0F, -0.9999F, -0.9999F, 0F, 2.9999F, -0.9999F, 0F, -2.9999F, 0F, 0F, -1.9999F, 0F, 0F, -1.9999F, -0.9999F, 0F, -2.9999F, 0F); // Box 168
		tailModel[37].setRotationPoint(110F, -31F, 0F);

		tailModel[38].addShapeBox(0F, 0F, 0F, 6, 3, 2, 0F,0F, -2.9999F, 0F, 0F, -1.9999F, 0F, 0F, -1.9999F, -0.9999F, 0F, -2.9999F, 0F, 0F, 1.9999F, 0F, 0F, -0.9999F, 0F, 0F, -0.9999F, -0.9999F, 0F, 1.9999F, -0.9999F); // Box 169
		tailModel[38].setRotationPoint(110F, -31F, 0F);

		tailModel[39].addShapeBox(0F, 0F, 0F, 23, 27, 2, 0F,-15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -17F, 0F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F); // Box 171
		tailModel[39].setRotationPoint(72F, -64F, 0F);

		tailModel[40].addShapeBox(0F, 0F, 0F, 8, 6, 2, 0F,-3F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 173
		tailModel[40].setRotationPoint(87F, -70F, 0F);

		tailModel[41].addShapeBox(0F, 0F, 0F, 24, 4, 42, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, -1F, 0F); // Box 175
		tailModel[41].setRotationPoint(71F, -33F, 1F);

		tailModel[42].addShapeBox(0F, 0F, 0F, 9, 4, 10, 0F,0F, 0F, 0F, 0F, -2F, 0F, -3F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, -1F, -2F, 0F, -1F, 0F); // Box 176
		tailModel[42].setRotationPoint(95F, -33F, 43F);

		tailModel[43].addShapeBox(0F, 0F, 0F, 10, 4, 10, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, -2F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, -1F, -2F); // Box 177
		tailModel[43].setRotationPoint(85F, -33F, 43F);

		tailModel[44].addShapeBox(0F, 0F, 0F, 105, 1, 1, 0F,0F, -1.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -1.25F, -0.25F, 0F, 0.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.75F, -0.25F); // Box 550
		tailModel[44].setRotationPoint(-4F, -63F, -0.5F);
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 32
		leftWingModel[1] = new ModelRendererTurbo(this, 377, 41, textureX, textureY); // Box 33
		leftWingModel[2] = new ModelRendererTurbo(this, 633, 41, textureX, textureY); // Box 34
		leftWingModel[3] = new ModelRendererTurbo(this, 705, 33, textureX, textureY); // Box 35
		leftWingModel[4] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Box 51
		leftWingModel[5] = new ModelRendererTurbo(this, 537, 49, textureX, textureY); // Box 52
		leftWingModel[6] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 53
		leftWingModel[7] = new ModelRendererTurbo(this, 793, 49, textureX, textureY); // Box 54
		leftWingModel[8] = new ModelRendererTurbo(this, 697, 73, textureX, textureY); // Box 102
		leftWingModel[9] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Box 103
		leftWingModel[10] = new ModelRendererTurbo(this, 385, 65, textureX, textureY); // Box 104
		leftWingModel[11] = new ModelRendererTurbo(this, 841, 81, textureX, textureY); // Box 105
		leftWingModel[12] = new ModelRendererTurbo(this, 249, 89, textureX, textureY); // Box 106
		leftWingModel[13] = new ModelRendererTurbo(this, 513, 89, textureX, textureY); // Box 107
		leftWingModel[14] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 108
		leftWingModel[15] = new ModelRendererTurbo(this, 921, 81, textureX, textureY); // Box 110
		leftWingModel[16] = new ModelRendererTurbo(this, 969, 81, textureX, textureY); // Box 111
		leftWingModel[17] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 112
		leftWingModel[18] = new ModelRendererTurbo(this, 1001, 33, textureX, textureY); // Box 113
		leftWingModel[19] = new ModelRendererTurbo(this, 81, 121, textureX, textureY); // Box 263
		leftWingModel[20] = new ModelRendererTurbo(this, 977, 57, textureX, textureY); // Box 264

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 27, 9, 7, 0F,0F, -2F, 0F, -11F, -6F, 0F, 0F, -4F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -11F, -2F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 32
		leftWingModel[0].setRotationPoint(-6F, -24F, -19F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 28, 9, 7, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 2F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 2F, 6F); // Box 33
		leftWingModel[1].setRotationPoint(-34F, -24F, -19F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 25, 9, 7, 0F,-3F, -1F, 0F, 0F, 0F, 0F, 0F, 2F, -1F, 3F, 0F, -1F, -3F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 6F, 3F, 0F, 6F); // Box 34
		leftWingModel[2].setRotationPoint(-59F, -24F, -19F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 10, 9, 7, 0F,-8F, -3F, 0F, 3F, -1F, 0F, -3F, 0F, -1F, 0F, 0F, 0F, -8F, -4F, 0F, 3F, 0F, 0F, -3F, 0F, 6F, 0F, -4F, 1F); // Box 35
		leftWingModel[3].setRotationPoint(-69F, -24F, -19F);

		leftWingModel[4].addShapeBox(0F, 0F, 0F, 28, 9, 27, 0F,-3F, 0F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -3F, 1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 51
		leftWingModel[4].setRotationPoint(-34F, -24F, -46F);

		leftWingModel[5].addShapeBox(0F, 0F, 0F, 28, 9, 27, 0F,-7F, -1F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -1F, 0F, -7F, -1F, 0F, 0F, 1F, 0F, -3F, 1F, 0F, -3F, 0F, 0F); // Box 52
		leftWingModel[5].setRotationPoint(-59F, -24F, -46F);

		leftWingModel[6].addShapeBox(0F, 0F, 0F, 12, 7, 27, 0F,-6F, -2F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -3F, -2F, 0F, -6F, -3F, 0F, 0F, 0F, 0F, -4F, 1F, 0F, -3F, -3F, 0F); // Box 53
		leftWingModel[6].setRotationPoint(-64F, -23F, -46F);

		leftWingModel[7].addShapeBox(0F, 0F, 0F, 18, 7, 27, 0F,0F, 0F, 0F, -6F, -4F, 0F, 0F, -4F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -6F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F); // Box 54
		leftWingModel[7].setRotationPoint(-8F, -22F, -46F);

		leftWingModel[8].addShapeBox(0F, 0F, 0F, 23, 9, 44, 0F,0F, 1F, 0F, -5F, -1F, 0F, 0F, -7F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, -5F, -2F, 0F, 0F, 5F, 0F, 0F, 6F, 0F); // Box 102
		leftWingModel[8].setRotationPoint(-31F, -29F, -90F);

		leftWingModel[9].addShapeBox(0F, 0F, 0F, 18, 9, 44, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, -5F, 0F, 3F, -6F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 6F, 0F, 3F, 4F, 0F); // Box 103
		leftWingModel[9].setRotationPoint(-49F, -29F, -90F);

		leftWingModel[10].addShapeBox(0F, 0F, 0F, 5, 9, 44, 0F,0F, -2F, 0F, 0F, 0F, 0F, -3F, -6F, 0F, 4F, -8F, 0F, 0F, -5F, 0F, 0F, -3F, 0F, -3F, 4F, 0F, 4F, 1F, 0F); // Box 104
		leftWingModel[10].setRotationPoint(-54F, -29F, -90F);

		leftWingModel[11].addShapeBox(0F, 0F, 0F, 17, 13, 44, 0F,0F, 0F, 0F, -7F, -3F, 0F, 0F, -10F, 0F, -5F, -6F, 0F, 0F, -7F, 0F, -7F, -9F, 0F, 0F, -2F, 0F, -5F, 0F, 0F); // Box 105
		leftWingModel[11].setRotationPoint(-13F, -28F, -90F);

		leftWingModel[12].addShapeBox(0F, 0F, 0F, 18, 3, 67, 0F,0F, 0F, 0F, -7F, 0F, 0F, 0F, -8F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 11F, 0F, 0F, 11F, 0F); // Box 106
		leftWingModel[12].setRotationPoint(-31F, -36F, -157F);

		leftWingModel[13].addShapeBox(0F, 0F, 0F, 18, 3, 67, 0F,-6F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -7F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 11F, 0F, 0F, 10F, 0F); // Box 107
		leftWingModel[13].setRotationPoint(-49F, -36F, -157F);

		leftWingModel[14].addShapeBox(0F, 0F, 0F, 5, 3, 67, 0F,-8F, -1F, 0F, 6F, 0F, 0F, 0F, -7F, 0F, 0F, -9F, 0F, -8F, -1F, 0F, 6F, 0F, 0F, 0F, 10F, 0F, 0F, 8F, 0F); // Box 108
		leftWingModel[14].setRotationPoint(-54F, -36F, -157F);

		leftWingModel[15].addShapeBox(0F, 0F, 0F, 11, 4, 10, 0F,0F, 0F, 0F, 0F, -1F, -5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -2F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		leftWingModel[15].setRotationPoint(-31F, -37F, -167F);

		leftWingModel[16].addShapeBox(0F, 0F, 0F, 12, 4, 10, 0F,-9F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -9F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		leftWingModel[16].setRotationPoint(-43F, -37F, -167F);

		leftWingModel[17].addShapeBox(0F, 0F, 0F, 12, 4, 10, 0F,-8F, 0F, -1F, 0F, 0F, 0F, -9F, -1F, 0F, 0F, -2F, 0F, -8F, -3F, -1F, 0F, -3F, 0F, -9F, 0F, 0F, 0F, -1F, 0F); // Box 112
		leftWingModel[17].setRotationPoint(-46F, -37F, -167F);

		leftWingModel[18].addShapeBox(0F, 0F, 0F, 6, 3, 5, 0F,0F, 0F, 0F, 0F, -1F, -5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, -5F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 113
		leftWingModel[18].setRotationPoint(-20F, -36F, -162F);

		leftWingModel[19].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 263
		leftWingModel[19].setRotationPoint(-58F, -33F, -145F);

		leftWingModel[20].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 264
		leftWingModel[20].setRotationPoint(-65F, -33F, -145F);
	}

	private void initrightWingModel_1()
	{
		rightWingModel[0] = new ModelRendererTurbo(this, 505, 161, textureX, textureY); // Box 159
		rightWingModel[1] = new ModelRendererTurbo(this, 577, 161, textureX, textureY); // Box 160
		rightWingModel[2] = new ModelRendererTurbo(this, 769, 161, textureX, textureY); // Box 161
		rightWingModel[3] = new ModelRendererTurbo(this, 705, 89, textureX, textureY); // Box 162
		rightWingModel[4] = new ModelRendererTurbo(this, 385, 169, textureX, textureY); // Box 178
		rightWingModel[5] = new ModelRendererTurbo(this, 809, 169, textureX, textureY); // Box 179
		rightWingModel[6] = new ModelRendererTurbo(this, 921, 169, textureX, textureY); // Box 180
		rightWingModel[7] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 181
		rightWingModel[8] = new ModelRendererTurbo(this, 289, 193, textureX, textureY); // Box 227
		rightWingModel[9] = new ModelRendererTurbo(this, 49, 201, textureX, textureY); // Box 228
		rightWingModel[10] = new ModelRendererTurbo(this, 529, 193, textureX, textureY); // Box 229
		rightWingModel[11] = new ModelRendererTurbo(this, 385, 209, textureX, textureY); // Box 230
		rightWingModel[12] = new ModelRendererTurbo(this, 561, 209, textureX, textureY); // Box 231
		rightWingModel[13] = new ModelRendererTurbo(this, 737, 209, textureX, textureY); // Box 232
		rightWingModel[14] = new ModelRendererTurbo(this, 113, 217, textureX, textureY); // Box 233
		rightWingModel[15] = new ModelRendererTurbo(this, 289, 201, textureX, textureY); // Box 235
		rightWingModel[16] = new ModelRendererTurbo(this, 721, 201, textureX, textureY); // Box 236
		rightWingModel[17] = new ModelRendererTurbo(this, 665, 209, textureX, textureY); // Box 237
		rightWingModel[18] = new ModelRendererTurbo(this, 41, 105, textureX, textureY); // Box 238

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 27, 9, 7, 0F,0F, 0F, -1F, 0F, -4F, 0F, -11F, -6F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -11F, -2F, 0F, 0F, 0F, 0F); // Box 159
		rightWingModel[0].setRotationPoint(-6F, -24F, 12F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 28, 9, 7, 0F,0F, 2F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 6F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 160
		rightWingModel[1].setRotationPoint(-34F, -24F, 12F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 25, 9, 7, 0F,3F, 0F, -1F, 0F, 2F, -1F, 0F, 0F, 0F, -3F, -1F, 0F, 3F, 0F, 6F, 0F, 2F, 6F, 0F, 1F, 0F, -3F, 0F, 0F); // Box 161
		rightWingModel[2].setRotationPoint(-59F, -24F, 12F);

		rightWingModel[3].addShapeBox(0F, 0F, 0F, 10, 9, 7, 0F,0F, 0F, 0F, -3F, 0F, -1F, 3F, -1F, 0F, -8F, -3F, 0F, 0F, -4F, 1F, -3F, 0F, 6F, 3F, 0F, 0F, -8F, -4F, 0F); // Box 162
		rightWingModel[3].setRotationPoint(-69F, -24F, 12F);

		rightWingModel[4].addShapeBox(0F, 0F, 0F, 28, 9, 27, 0F,0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -3F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 1F, 0F); // Box 178
		rightWingModel[4].setRotationPoint(-34F, -24F, 19F);

		rightWingModel[5].addShapeBox(0F, 0F, 0F, 28, 9, 27, 0F,-3F, -1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -7F, -1F, 0F, -3F, 0F, 0F, -3F, 1F, 0F, 0F, 1F, 0F, -7F, -1F, 0F); // Box 179
		rightWingModel[5].setRotationPoint(-59F, -24F, 19F);

		rightWingModel[6].addShapeBox(0F, 0F, 0F, 12, 7, 27, 0F,-3F, -2F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -6F, -2F, 0F, -3F, -3F, 0F, -4F, 1F, 0F, 0F, 0F, 0F, -6F, -3F, 0F); // Box 180
		rightWingModel[6].setRotationPoint(-64F, -23F, 19F);

		rightWingModel[7].addShapeBox(0F, 0F, 0F, 18, 7, 27, 0F,-2F, 0F, 0F, 0F, -4F, 0F, -6F, -4F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, -6F, -2F, 0F, 0F, 0F, 0F); // Box 181
		rightWingModel[7].setRotationPoint(-8F, -22F, 19F);

		rightWingModel[8].addShapeBox(0F, 0F, 0F, 23, 9, 44, 0F,0F, -5F, 0F, 0F, -7F, 0F, -5F, -1F, 0F, 0F, 1F, 0F, 0F, 6F, 0F, 0F, 5F, 0F, -5F, -2F, 0F, 0F, -2F, 0F); // Box 227
		rightWingModel[8].setRotationPoint(-31F, -29F, 46F);

		rightWingModel[9].addShapeBox(0F, 0F, 0F, 18, 9, 44, 0F,3F, -6F, 0F, 0F, -5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 3F, 4F, 0F, 0F, 6F, 0F, 0F, -2F, 0F, 0F, -3F, 0F); // Box 228
		rightWingModel[9].setRotationPoint(-49F, -29F, 46F);

		rightWingModel[10].addShapeBox(0F, 0F, 0F, 5, 9, 44, 0F,4F, -8F, 0F, -3F, -6F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 4F, 1F, 0F, -3F, 4F, 0F, 0F, -3F, 0F, 0F, -5F, 0F); // Box 229
		rightWingModel[10].setRotationPoint(-54F, -29F, 46F);

		rightWingModel[11].addShapeBox(0F, 0F, 0F, 17, 13, 44, 0F,-5F, -6F, 0F, 0F, -10F, 0F, -7F, -3F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, -2F, 0F, -7F, -9F, 0F, 0F, -7F, 0F); // Box 230
		rightWingModel[11].setRotationPoint(-13F, -28F, 46F);

		rightWingModel[12].addShapeBox(0F, 0F, 0F, 18, 3, 67, 0F,0F, -6F, 0F, 0F, -8F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 11F, 0F, 0F, 11F, 0F, -7F, 0F, 0F, 0F, 0F, 0F); // Box 231
		rightWingModel[12].setRotationPoint(-31F, -36F, 90F);

		rightWingModel[13].addShapeBox(0F, 0F, 0F, 18, 3, 67, 0F,0F, -7F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 10F, 0F, 0F, 11F, 0F, 0F, 0F, 0F, -6F, 0F, 0F); // Box 232
		rightWingModel[13].setRotationPoint(-49F, -36F, 90F);

		rightWingModel[14].addShapeBox(0F, 0F, 0F, 5, 3, 67, 0F,0F, -9F, 0F, 0F, -7F, 0F, 6F, 0F, 0F, -8F, -1F, 0F, 0F, 8F, 0F, 0F, 10F, 0F, 6F, 0F, 0F, -8F, -1F, 0F); // Box 233
		rightWingModel[14].setRotationPoint(-54F, -36F, 90F);

		rightWingModel[15].addShapeBox(0F, 0F, 0F, 11, 4, 10, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -5F, 0F, -3F, 0F); // Box 235
		rightWingModel[15].setRotationPoint(-31F, -37F, 157F);

		rightWingModel[16].addShapeBox(0F, 0F, 0F, 12, 4, 10, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -9F, -3F, 0F); // Box 236
		rightWingModel[16].setRotationPoint(-43F, -37F, 157F);

		rightWingModel[17].addShapeBox(0F, 0F, 0F, 12, 4, 10, 0F,0F, -2F, 0F, -9F, -1F, 0F, 0F, 0F, 0F, -8F, 0F, -1F, 0F, -1F, 0F, -9F, 0F, 0F, 0F, -3F, 0F, -8F, -3F, -1F); // Box 237
		rightWingModel[17].setRotationPoint(-46F, -37F, 157F);

		rightWingModel[18].addShapeBox(0F, 0F, 0F, 6, 3, 5, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -5F, 0F, -2F, 0F); // Box 238
		rightWingModel[18].setRotationPoint(-20F, -36F, 157F);
	}

	private void inityawFlapModel_1()
	{
		yawFlapModel[0] = new ModelRendererTurbo(this, 449, 41, textureX, textureY); // Box 43
		yawFlapModel[1] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 45
		yawFlapModel[2] = new ModelRendererTurbo(this, 377, 161, textureX, textureY); // Box 170
		yawFlapModel[3] = new ModelRendererTurbo(this, 273, 65, textureX, textureY); // Box 172

		yawFlapModel[0].addShapeBox(0F, 0F, 0F, 14, 27, 2, 0F,0F, 0F, 0F, -6F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 43
		yawFlapModel[0].setRotationPoint(95F, -64F, -2F);

		yawFlapModel[1].addShapeBox(0F, 0F, 0F, 10, 6, 2, 0F,0F, -2F, 0F, -5F, -3F, -1F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		yawFlapModel[1].setRotationPoint(95F, -70F, -2F);

		yawFlapModel[2].addShapeBox(0F, 0F, 0F, 14, 27, 2, 0F,0F, 0F, 0F, -4F, 0F, 0F, -6F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -2F, 1F, -1F, 0F, 0F, 0F); // Box 170
		yawFlapModel[2].setRotationPoint(95F, -64F, 0F);

		yawFlapModel[3].addShapeBox(0F, 0F, 0F, 10, 6, 2, 0F,0F, 0F, 0F, -3F, -1F, 0F, -5F, -3F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, 0F); // Box 172
		yawFlapModel[3].setRotationPoint(95F, -70F, 0F);
	}

	private void initpitchFlapLeftModel_1()
	{
		pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 47

		pitchFlapLeftModel[0].addShapeBox(0F, 0F, 0F, 16, 4, 42, 0F,0F, 0F, 0F, -7F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 47
		pitchFlapLeftModel[0].setRotationPoint(95F, -33F, -43F);
	}

	private void initpitchFlapRightModel_1()
	{
		pitchFlapRightModel[0] = new ModelRendererTurbo(this, 609, 161, textureX, textureY); // Box 174

		pitchFlapRightModel[0].addShapeBox(0F, 0F, 0F, 16, 4, 42, 0F,0F, 0F, 0F, 0F, -2F, 0F, -7F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -7F, -1F, 0F, 0F, 0F, 0F); // Box 174
		pitchFlapRightModel[0].setRotationPoint(95F, -33F, 1F);
	}

	private void initpitchFlapLeftWingModel_1()
	{
		pitchFlapLeftWingModel[0] = new ModelRendererTurbo(this, 161, 97, textureX, textureY); // Box 109

		pitchFlapLeftWingModel[0].addShapeBox(0F, 0F, 0F, 10, 3, 67, 0F,7F, 0F, 0F, -11F, -1F, 0F, 0F, -11F, 0F, 0F, -8F, 0F, 7F, 0F, 0F, -11F, -1F, 0F, 0F, 9F, 0F, 0F, 11F, 0F); // Box 109
		pitchFlapLeftWingModel[0].setRotationPoint(-13F, -36F, -157F);
	}

	private void initpitchFlapRightWingModel_1()
	{
		pitchFlapRightWingModel[0] = new ModelRendererTurbo(this, 441, 217, textureX, textureY); // Box 234

		pitchFlapRightWingModel[0].addShapeBox(0F, 0F, 0F, 10, 3, 67, 0F,0F, -8F, 0F, 0F, -11F, 0F, -11F, -1F, 0F, 7F, 0F, 0F, 0F, 11F, 0F, 0F, 9F, 0F, -11F, -1F, 0F, 7F, 0F, 0F); // Box 234
		pitchFlapRightWingModel[0].setRotationPoint(-13F, -36F, 90F);
	}

	private void inittailWheelModel_1()
	{
		tailWheelModel[0] = new ModelRendererTurbo(this, 993, 121, textureX, textureY); // Box 391
		tailWheelModel[1] = new ModelRendererTurbo(this, 169, 137, textureX, textureY); // Box 392
		tailWheelModel[2] = new ModelRendererTurbo(this, 625, 33, textureX, textureY); // Box 393
		tailWheelModel[3] = new ModelRendererTurbo(this, 121, 89, textureX, textureY); // Box 394
		tailWheelModel[4] = new ModelRendererTurbo(this, 553, 97, textureX, textureY); // Box 395
		tailWheelModel[5] = new ModelRendererTurbo(this, 857, 97, textureX, textureY); // Box 396
		tailWheelModel[6] = new ModelRendererTurbo(this, 433, 137, textureX, textureY); // Box 397
		tailWheelModel[7] = new ModelRendererTurbo(this, 553, 137, textureX, textureY); // Box 398
		tailWheelModel[8] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 399

		tailWheelModel[0].addShapeBox(0F, 0F, 0F, 10, 3, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 391
		tailWheelModel[0].setRotationPoint(99F, -28F, -2F);

		tailWheelModel[1].addShapeBox(0F, 0F, 0F, 8, 3, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F); // Box 392
		tailWheelModel[1].setRotationPoint(101F, -25F, -2F);

		tailWheelModel[2].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 393
		tailWheelModel[2].setRotationPoint(104F, -22F, -2F);

		tailWheelModel[3].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		tailWheelModel[3].setRotationPoint(104F, -19F, -1F);

		tailWheelModel[4].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 395
		tailWheelModel[4].setRotationPoint(104F, -21F, -1F);

		tailWheelModel[5].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 396
		tailWheelModel[5].setRotationPoint(104F, -17F, -1F);

		tailWheelModel[6].addShapeBox(0F, 0F, 0F, 10, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F); // Box 397
		tailWheelModel[6].setRotationPoint(99F, -28F, 0F);

		tailWheelModel[7].addShapeBox(0F, 0F, 0F, 8, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 398
		tailWheelModel[7].setRotationPoint(101F, -25F, 0F);

		tailWheelModel[8].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 399
		tailWheelModel[8].setRotationPoint(104F, -22F, 1F);
	}

	private void initleftWingWheelModel_1()
	{
		leftWingWheelModel[0] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Box 114
		leftWingWheelModel[1] = new ModelRendererTurbo(this, 361, 49, textureX, textureY); // Box 115
		leftWingWheelModel[2] = new ModelRendererTurbo(this, 625, 65, textureX, textureY); // Box 116
		leftWingWheelModel[3] = new ModelRendererTurbo(this, 441, 73, textureX, textureY); // Box 117
		leftWingWheelModel[4] = new ModelRendererTurbo(this, 81, 89, textureX, textureY); // Box 118

		leftWingWheelModel[0].addShapeBox(0F, 0F, 0F, 3, 10, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		leftWingWheelModel[0].setRotationPoint(-51F, -16F, -46F);

		leftWingWheelModel[1].addShapeBox(0F, 0F, 0F, 3, 14, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 115
		leftWingWheelModel[1].setRotationPoint(-51F, -9F, -43F);

		leftWingWheelModel[2].addShapeBox(0F, 0F, 0F, 15, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		leftWingWheelModel[2].setRotationPoint(-57.5F, 0F, -48F);

		leftWingWheelModel[3].addShapeBox(0F, 0F, 0F, 15, 5, 5, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		leftWingWheelModel[3].setRotationPoint(-57.5F, -5F, -48F);

		leftWingWheelModel[4].addShapeBox(0F, 0F, 0F, 15, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 118
		leftWingWheelModel[4].setRotationPoint(-57.5F, 5F, -48F);
	}

	private void initrightWingWheelModel_1()
	{
		rightWingWheelModel[0] = new ModelRendererTurbo(this, 1009, 73, textureX, textureY); // Box 239
		rightWingWheelModel[1] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Box 240
		rightWingWheelModel[2] = new ModelRendererTurbo(this, 977, 185, textureX, textureY); // Box 241
		rightWingWheelModel[3] = new ModelRendererTurbo(this, 385, 209, textureX, textureY); // Box 242
		rightWingWheelModel[4] = new ModelRendererTurbo(this, 465, 209, textureX, textureY); // Box 243

		rightWingWheelModel[0].addShapeBox(0F, 0F, 0F, 3, 10, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
		rightWingWheelModel[0].setRotationPoint(-51F, -16F, 43F);

		rightWingWheelModel[1].addShapeBox(0F, 0F, 0F, 3, 14, 3, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		rightWingWheelModel[1].setRotationPoint(-51F, -9F, 40F);

		rightWingWheelModel[2].addShapeBox(0F, 0F, 0F, 15, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		rightWingWheelModel[2].setRotationPoint(-57.5F, 0F, 43F);

		rightWingWheelModel[3].addShapeBox(0F, 0F, 0F, 15, 5, 5, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		rightWingWheelModel[3].setRotationPoint(-57.5F, -5F, 43F);

		rightWingWheelModel[4].addShapeBox(0F, 0F, 0F, 15, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 243
		rightWingWheelModel[4].setRotationPoint(-57.5F, 5F, 43F);
	}

	private void initPropeller()
	{
		propellerModels = new ModelRendererTurbo[1][3];
		propellerModels[0] = makeProp1(-106F, -30F, 0F);
	}

	private ModelRendererTurbo[] makeProp1(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[3];
		prop[0] = new ModelRendererTurbo(this, 0, 234, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 234, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 0, 234, textureX, textureY);
		prop[0].addBox(-1F, -35F, -2.5F, 2, 35, 5, 0.0F);
		prop[1].addBox(-1F, -35F, -2.5F, 2, 35, 5, 0.0F);
		prop[2].addBox(-1F, -35F, -2.5F, 2, 35, 5, 0.0F);
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
		gun_2_Model[1][0] = new ModelRendererTurbo(this, 7, 308, textureX, textureY); // Import 
		gun_2_Model[1][1] = new ModelRendererTurbo(this, 15, 308, textureX, textureY); // Import 
		gun_2_Model[1][2] = new ModelRendererTurbo(this, 23, 308, textureX, textureY); // Import 
		gun_2_Model[1][3] = new ModelRendererTurbo(this, 31, 308, textureX, textureY); // Import 
		gun_2_Model[1][4] = new ModelRendererTurbo(this, 39, 308, textureX, textureY); // Import 
		gun_2_Model[1][5] = new ModelRendererTurbo(this, 47, 308, textureX, textureY); // Import 
		gun_2_Model[1][6] = new ModelRendererTurbo(this, 63, 308, textureX, textureY); // Import 
		gun_2_Model[1][7] = new ModelRendererTurbo(this, 71, 308, textureX, textureY); // Import 
		gun_2_Model[1][8] = new ModelRendererTurbo(this, 87, 308, textureX, textureY); // Import 
		gun_2_Model[1][9] = new ModelRendererTurbo(this, 103, 308, textureX, textureY); // Import 
		gun_2_Model[1][10] = new ModelRendererTurbo(this, 119, 308, textureX, textureY); // Import 
		gun_2_Model[1][11] = new ModelRendererTurbo(this, 135, 308, textureX, textureY); // Import 
		gun_2_Model[1][12] = new ModelRendererTurbo(this, 143, 308, textureX, textureY); // Import 
		gun_2_Model[1][13] = new ModelRendererTurbo(this, 151, 308, textureX, textureY); // Import 
		gun_2_Model[1][14] = new ModelRendererTurbo(this, 159, 308, textureX, textureY); // Import 
		gun_2_Model[1][15] = new ModelRendererTurbo(this, 167, 308, textureX, textureY); // Import 
		gun_2_Model[1][16] = new ModelRendererTurbo(this, 175, 308, textureX, textureY); // Import 
		gun_2_Model[1][17] = new ModelRendererTurbo(this, 183, 308, textureX, textureY); // Import 
		gun_2_Model[1][18] = new ModelRendererTurbo(this, 191, 308, textureX, textureY); // Import 
		gun_2_Model[1][19] = new ModelRendererTurbo(this, 199, 308, textureX, textureY); // Import 
		gun_2_Model[1][20] = new ModelRendererTurbo(this, 207, 308, textureX, textureY); // Import 
		gun_2_Model[1][21] = new ModelRendererTurbo(this, 215, 308, textureX, textureY); // Import 
		gun_2_Model[1][22] = new ModelRendererTurbo(this, 223, 308, textureX, textureY); // Import 
		gun_2_Model[1][23] = new ModelRendererTurbo(this, 231, 308, textureX, textureY); // Import 
		gun_2_Model[1][24] = new ModelRendererTurbo(this, 239, 308, textureX, textureY); // Import 
		gun_2_Model[1][25] = new ModelRendererTurbo(this, 247, 308, textureX, textureY); // Import 
		gun_2_Model[1][26] = new ModelRendererTurbo(this, 255, 308, textureX, textureY); // Import 
		gun_2_Model[1][27] = new ModelRendererTurbo(this, 7, 316, textureX, textureY); // Import 
		gun_2_Model[1][28] = new ModelRendererTurbo(this, 15, 316, textureX, textureY); // Import 
		gun_2_Model[1][29] = new ModelRendererTurbo(this, 23, 316, textureX, textureY); // Import 
		gun_2_Model[1][30] = new ModelRendererTurbo(this, 39, 316, textureX, textureY); // Import 
		gun_2_Model[1][31] = new ModelRendererTurbo(this, 47, 316, textureX, textureY); // Import 
		gun_2_Model[1][32] = new ModelRendererTurbo(this, 55, 316, textureX, textureY); // Import 
		gun_2_Model[1][33] = new ModelRendererTurbo(this, 63, 316, textureX, textureY); // Import 
		gun_2_Model[1][34] = new ModelRendererTurbo(this, 79, 316, textureX, textureY); // Import 
		gun_2_Model[1][35] = new ModelRendererTurbo(this, 103, 316, textureX, textureY); // Import 
		gun_2_Model[1][36] = new ModelRendererTurbo(this, 135, 316, textureX, textureY); // Import 
		gun_2_Model[1][37] = new ModelRendererTurbo(this, 143, 316, textureX, textureY); // Import 
		gun_2_Model[1][38] = new ModelRendererTurbo(this, 151, 316, textureX, textureY); // Import 
		gun_2_Model[1][39] = new ModelRendererTurbo(this, 159, 316, textureX, textureY); // Import 
		gun_2_Model[1][40] = new ModelRendererTurbo(this, 167, 316, textureX, textureY); // Import 
		gun_2_Model[1][41] = new ModelRendererTurbo(this, 175, 316, textureX, textureY); // Import 
		gun_2_Model[1][42] = new ModelRendererTurbo(this, 183, 316, textureX, textureY); // Import 
		gun_2_Model[1][43] = new ModelRendererTurbo(this, 191, 316, textureX, textureY); // Import 
		gun_2_Model[1][44] = new ModelRendererTurbo(this, 199, 316, textureX, textureY); // Import 
		gun_2_Model[1][45] = new ModelRendererTurbo(this, 207, 316, textureX, textureY); // Import 
		gun_2_Model[1][46] = new ModelRendererTurbo(this, 215, 316, textureX, textureY); // Import 
		gun_2_Model[1][47] = new ModelRendererTurbo(this, 223, 316, textureX, textureY); // Import 
		gun_2_Model[1][48] = new ModelRendererTurbo(this, 231, 316, textureX, textureY); // Import 
		gun_2_Model[1][49] = new ModelRendererTurbo(this, 239, 316, textureX, textureY); // Import 
		gun_2_Model[1][50] = new ModelRendererTurbo(this, 247, 316, textureX, textureY); // Import 
		gun_2_Model[1][51] = new ModelRendererTurbo(this, 255, 316, textureX, textureY); // Import 
		gun_2_Model[1][52] = new ModelRendererTurbo(this, 7, 324, textureX, textureY); // Import 
		gun_2_Model[1][53] = new ModelRendererTurbo(this, 15, 324, textureX, textureY); // Import 
		gun_2_Model[1][54] = new ModelRendererTurbo(this, 23, 324, textureX, textureY); // Import 
		gun_2_Model[1][55] = new ModelRendererTurbo(this, 31, 324, textureX, textureY); // Import 
		gun_2_Model[1][56] = new ModelRendererTurbo(this, 39, 324, textureX, textureY); // Import 
		gun_2_Model[1][57] = new ModelRendererTurbo(this, 47, 324, textureX, textureY); // Import 
		gun_2_Model[1][58] = new ModelRendererTurbo(this, 55, 324, textureX, textureY); // Import 
		gun_2_Model[1][59] = new ModelRendererTurbo(this, 63, 324, textureX, textureY); // Import 
		gun_2_Model[1][60] = new ModelRendererTurbo(this, 71, 324, textureX, textureY); // Import 
		gun_2_Model[1][61] = new ModelRendererTurbo(this, 79, 324, textureX, textureY); // Import 
		gun_2_Model[1][62] = new ModelRendererTurbo(this, 87, 324, textureX, textureY); // Import 
		gun_2_Model[1][63] = new ModelRendererTurbo(this, 95, 324, textureX, textureY); // Import 
		gun_2_Model[1][64] = new ModelRendererTurbo(this, 103, 324, textureX, textureY); // Import 
		gun_2_Model[1][65] = new ModelRendererTurbo(this, 119, 324, textureX, textureY); // Import 
		gun_2_Model[1][66] = new ModelRendererTurbo(this, 127, 324, textureX, textureY); // Import 
		gun_2_Model[1][67] = new ModelRendererTurbo(this, 135, 324, textureX, textureY); // Import 
		gun_2_Model[1][68] = new ModelRendererTurbo(this, 143, 324, textureX, textureY); // Import 
		gun_2_Model[1][69] = new ModelRendererTurbo(this, 151, 324, textureX, textureY); // Import 
		gun_2_Model[1][70] = new ModelRendererTurbo(this, 159, 324, textureX, textureY); // Import 
		gun_2_Model[1][71] = new ModelRendererTurbo(this, 167, 324, textureX, textureY); // Import 
		gun_2_Model[1][72] = new ModelRendererTurbo(this, 175, 324, textureX, textureY); // Import 
		gun_2_Model[1][73] = new ModelRendererTurbo(this, 183, 324, textureX, textureY); // Import 
		gun_2_Model[1][74] = new ModelRendererTurbo(this, 191, 324, textureX, textureY); // Import 
		gun_2_Model[1][75] = new ModelRendererTurbo(this, 199, 324, textureX, textureY); // Import 
		gun_2_Model[1][76] = new ModelRendererTurbo(this, 207, 324, textureX, textureY); // Import 
		gun_2_Model[1][77] = new ModelRendererTurbo(this, 215, 324, textureX, textureY); // Import 

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
			gunPart.setRotationPoint(15F, -46F, 0F);
		}


		gun_2_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("TailGun", gun_2_Model);
	}
}