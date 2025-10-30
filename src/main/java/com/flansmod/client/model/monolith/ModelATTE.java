//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2025 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: ATTE
// Model Creator: 
// Created on: 20.09.2019 - 22:07:55
// Last changed on: 20.09.2019 - 22:07:55

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelATTE extends ModelVehicle //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelATTE() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[166];
		leftAnimTrackModel1 = new ModelRendererTurbo[116];
		leftAnimTrackModel2 = new ModelRendererTurbo[116];
		leftAnimTrackModel3 = new ModelRendererTurbo[116];
		leftAnimTrackModel4 = new ModelRendererTurbo[116];
		//leftAnimTrackModel1 = new ModelRendererTurbo[116];
		//leftAnimTrackModel2 = new ModelRendererTurbo[116];
		//leftAnimTrackModel3 = new ModelRendererTurbo[116];
		//leftAnimTrackModel[3] = new ModelRendererTurbo[116];
		rightAnimTrackModel1 = new ModelRendererTurbo[116];
		rightAnimTrackModel2 = new ModelRendererTurbo[116];
		rightAnimTrackModel3 = new ModelRendererTurbo[116];
		rightAnimTrackModel4 = new ModelRendererTurbo[116];

		initbodyModel_0();
		initleftAnimTrackModel_0();
		initleftAnimTrackModel2_0();
		initleftAnimTrackModel3_0();
		initleftAnimTrackModel4_0();
		initrightAnimTrackModel1_0();
		initrightAnimTrackModel2_0();
		initrightAnimTrackModel3_0();
		initrightAnimTrackModel4_0();

		initGuns();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_0()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 2
		bodyModel[1] = new ModelRendererTurbo(this, 553, 1, textureX, textureY); // Box 3
		bodyModel[2] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 5
		bodyModel[3] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 8
		bodyModel[4] = new ModelRendererTurbo(this, 633, 1, textureX, textureY); // Box 9
		bodyModel[5] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 11
		bodyModel[6] = new ModelRendererTurbo(this, 561, 1, textureX, textureY); // Box 12
		bodyModel[7] = new ModelRendererTurbo(this, 713, 1, textureX, textureY); // Box 13
		bodyModel[8] = new ModelRendererTurbo(this, 769, 1, textureX, textureY); // Box 14
		bodyModel[9] = new ModelRendererTurbo(this, 745, 1, textureX, textureY); // Box 15
		bodyModel[10] = new ModelRendererTurbo(this, 289, 89, textureX, textureY); // Box 16
		bodyModel[11] = new ModelRendererTurbo(this, 441, 89, textureX, textureY); // Box 17
		bodyModel[12] = new ModelRendererTurbo(this, 561, 105, textureX, textureY); // Box 18
		bodyModel[13] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 19
		bodyModel[14] = new ModelRendererTurbo(this, 89, 113, textureX, textureY); // Box 20
		bodyModel[15] = new ModelRendererTurbo(this, 729, 9, textureX, textureY); // Box 21
		bodyModel[16] = new ModelRendererTurbo(this, 201, 113, textureX, textureY); // Box 22
		bodyModel[17] = new ModelRendererTurbo(this, 689, 113, textureX, textureY); // Box 23
		bodyModel[18] = new ModelRendererTurbo(this, 793, 113, textureX, textureY); // Box 24
		bodyModel[19] = new ModelRendererTurbo(this, 769, 161, textureX, textureY); // Box 39
		bodyModel[20] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 40
		bodyModel[21] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 41
		bodyModel[22] = new ModelRendererTurbo(this, 633, 33, textureX, textureY); // Box 42
		bodyModel[23] = new ModelRendererTurbo(this, 937, 33, textureX, textureY); // Box 43
		bodyModel[24] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 44
		bodyModel[25] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 45
		bodyModel[26] = new ModelRendererTurbo(this, 497, 193, textureX, textureY); // Box 46
		bodyModel[27] = new ModelRendererTurbo(this, 881, 177, textureX, textureY); // Box 47
		bodyModel[28] = new ModelRendererTurbo(this, 257, 201, textureX, textureY); // Box 49
		bodyModel[29] = new ModelRendererTurbo(this, 641, 193, textureX, textureY); // Box 50
		bodyModel[30] = new ModelRendererTurbo(this, 905, 137, textureX, textureY); // Box 51
		bodyModel[31] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 52
		bodyModel[32] = new ModelRendererTurbo(this, 513, 9, textureX, textureY); // Box 53
		bodyModel[33] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 54
		bodyModel[34] = new ModelRendererTurbo(this, 793, 9, textureX, textureY); // Box 55
		bodyModel[35] = new ModelRendererTurbo(this, 985, 9, textureX, textureY); // Box 56
		bodyModel[36] = new ModelRendererTurbo(this, 1001, 9, textureX, textureY); // Box 57
		bodyModel[37] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 58
		bodyModel[38] = new ModelRendererTurbo(this, 441, 89, textureX, textureY); // Box 58
		bodyModel[39] = new ModelRendererTurbo(this, 793, 17, textureX, textureY); // Box 59
		bodyModel[40] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 60
		bodyModel[41] = new ModelRendererTurbo(this, 1001, 25, textureX, textureY); // Box 61
		bodyModel[42] = new ModelRendererTurbo(this, 937, 57, textureX, textureY); // Box 62
		bodyModel[43] = new ModelRendererTurbo(this, 281, 113, textureX, textureY); // Box 63
		bodyModel[44] = new ModelRendererTurbo(this, 201, 161, textureX, textureY); // Box 64
		bodyModel[45] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 65
		bodyModel[46] = new ModelRendererTurbo(this, 817, 9, textureX, textureY); // Box 66
		bodyModel[47] = new ModelRendererTurbo(this, 697, 41, textureX, textureY); // Box 67
		bodyModel[48] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 68
		bodyModel[49] = new ModelRendererTurbo(this, 393, 201, textureX, textureY); // Box 69
		bodyModel[50] = new ModelRendererTurbo(this, 761, 209, textureX, textureY); // Box 70
		bodyModel[51] = new ModelRendererTurbo(this, 81, 217, textureX, textureY); // Box 71
		bodyModel[52] = new ModelRendererTurbo(this, 809, 17, textureX, textureY); // Box 72
		bodyModel[53] = new ModelRendererTurbo(this, 289, 57, textureX, textureY); // Box 73
		bodyModel[54] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 74
		bodyModel[55] = new ModelRendererTurbo(this, 561, 41, textureX, textureY); // Box 75
		bodyModel[56] = new ModelRendererTurbo(this, 161, 217, textureX, textureY); // Box 76
		bodyModel[57] = new ModelRendererTurbo(this, 817, 217, textureX, textureY); // Box 77
		bodyModel[58] = new ModelRendererTurbo(this, 649, 225, textureX, textureY); // Box 78
		bodyModel[59] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Box 79
		bodyModel[60] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Box 80
		bodyModel[61] = new ModelRendererTurbo(this, 561, 17, textureX, textureY); // Box 81
		bodyModel[62] = new ModelRendererTurbo(this, 593, 41, textureX, textureY); // Box 82
		bodyModel[63] = new ModelRendererTurbo(this, 873, 225, textureX, textureY); // Box 83
		bodyModel[64] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Box 84
		bodyModel[65] = new ModelRendererTurbo(this, 393, 233, textureX, textureY); // Box 85
		bodyModel[66] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 86
		bodyModel[67] = new ModelRendererTurbo(this, 609, 17, textureX, textureY); // Box 87
		bodyModel[68] = new ModelRendererTurbo(this, 633, 57, textureX, textureY); // Box 88
		bodyModel[69] = new ModelRendererTurbo(this, 793, 41, textureX, textureY); // Box 89
		bodyModel[70] = new ModelRendererTurbo(this, 705, 65, textureX, textureY); // Box 90
		bodyModel[71] = new ModelRendererTurbo(this, 905, 113, textureX, textureY); // Box 91
		bodyModel[72] = new ModelRendererTurbo(this, 561, 89, textureX, textureY); // Box 92
		bodyModel[73] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 93
		bodyModel[74] = new ModelRendererTurbo(this, 105, 113, textureX, textureY); // Box 94
		bodyModel[75] = new ModelRendererTurbo(this, 561, 121, textureX, textureY); // Box 95
		bodyModel[76] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 96
		bodyModel[77] = new ModelRendererTurbo(this, 609, 265, textureX, textureY); // Box 133
		bodyModel[78] = new ModelRendererTurbo(this, 121, 281, textureX, textureY); // Box 134
		bodyModel[79] = new ModelRendererTurbo(this, 297, 289, textureX, textureY); // Box 135
		bodyModel[80] = new ModelRendererTurbo(this, 481, 257, textureX, textureY); // Box 136
		bodyModel[81] = new ModelRendererTurbo(this, 841, 257, textureX, textureY); // Box 137
		bodyModel[82] = new ModelRendererTurbo(this, 897, 273, textureX, textureY); // Box 138
		bodyModel[83] = new ModelRendererTurbo(this, 1, 297, textureX, textureY); // Box 139
		bodyModel[84] = new ModelRendererTurbo(this, 57, 305, textureX, textureY); // Box 140
		bodyModel[85] = new ModelRendererTurbo(this, 537, 305, textureX, textureY); // Box 141
		bodyModel[86] = new ModelRendererTurbo(this, 521, 497, textureX, textureY); // Box 360
		bodyModel[87] = new ModelRendererTurbo(this, 841, 497, textureX, textureY); // Box 361
		bodyModel[88] = new ModelRendererTurbo(this, 737, 497, textureX, textureY); // Box 362
		bodyModel[89] = new ModelRendererTurbo(this, 41, 505, textureX, textureY); // Box 363
		bodyModel[90] = new ModelRendererTurbo(this, 105, 505, textureX, textureY); // Box 364
		bodyModel[91] = new ModelRendererTurbo(this, 305, 513, textureX, textureY); // Box 365
		bodyModel[92] = new ModelRendererTurbo(this, 761, 537, textureX, textureY); // Box 366
		bodyModel[93] = new ModelRendererTurbo(this, 657, 497, textureX, textureY); // Box 367
		bodyModel[94] = new ModelRendererTurbo(this, 697, 505, textureX, textureY); // Box 368
		bodyModel[95] = new ModelRendererTurbo(this, 425, 513, textureX, textureY); // Box 369
		bodyModel[96] = new ModelRendererTurbo(this, 993, 409, textureX, textureY); // Box 372
		bodyModel[97] = new ModelRendererTurbo(this, 993, 497, textureX, textureY); // Box 373
		bodyModel[98] = new ModelRendererTurbo(this, 801, 505, textureX, textureY); // Box 374
		bodyModel[99] = new ModelRendererTurbo(this, 521, 513, textureX, textureY); // Box 375
		bodyModel[100] = new ModelRendererTurbo(this, 657, 521, textureX, textureY); // Box 376
		bodyModel[101] = new ModelRendererTurbo(this, 225, 529, textureX, textureY); // Box 377
		bodyModel[102] = new ModelRendererTurbo(this, 1, 529, textureX, textureY); // Box 380
		bodyModel[103] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 381
		bodyModel[104] = new ModelRendererTurbo(this, 1017, 81, textureX, textureY); // Box 382
		bodyModel[105] = new ModelRendererTurbo(this, 497, 113, textureX, textureY); // Box 383
		bodyModel[106] = new ModelRendererTurbo(this, 361, 233, textureX, textureY); // Box 384
		bodyModel[107] = new ModelRendererTurbo(this, 713, 105, textureX, textureY); // Box 385
		bodyModel[108] = new ModelRendererTurbo(this, 817, 209, textureX, textureY); // Box 386
		bodyModel[109] = new ModelRendererTurbo(this, 601, 137, textureX, textureY); // Box 389
		bodyModel[110] = new ModelRendererTurbo(this, 737, 241, textureX, textureY); // Box 390
		bodyModel[111] = new ModelRendererTurbo(this, 937, 417, textureX, textureY); // Box 391
		bodyModel[112] = new ModelRendererTurbo(this, 921, 449, textureX, textureY); // Box 392
		bodyModel[113] = new ModelRendererTurbo(this, 41, 161, textureX, textureY); // Box 393
		bodyModel[114] = new ModelRendererTurbo(this, 641, 257, textureX, textureY); // Box 394
		bodyModel[115] = new ModelRendererTurbo(this, 521, 169, textureX, textureY); // Box 395
		bodyModel[116] = new ModelRendererTurbo(this, 185, 273, textureX, textureY); // Box 396
		bodyModel[117] = new ModelRendererTurbo(this, 241, 473, textureX, textureY); // Box 397
		bodyModel[118] = new ModelRendererTurbo(this, 113, 481, textureX, textureY); // Box 398
		bodyModel[119] = new ModelRendererTurbo(this, 881, 537, textureX, textureY); // Box 399
		bodyModel[120] = new ModelRendererTurbo(this, 281, 529, textureX, textureY); // Box 400
		bodyModel[121] = new ModelRendererTurbo(this, 425, 537, textureX, textureY); // Box 401
		bodyModel[122] = new ModelRendererTurbo(this, 489, 537, textureX, textureY); // Box 402
		bodyModel[123] = new ModelRendererTurbo(this, 273, 545, textureX, textureY); // Box 403
		bodyModel[124] = new ModelRendererTurbo(this, 1, 417, textureX, textureY); // Box 404
		bodyModel[125] = new ModelRendererTurbo(this, 761, 449, textureX, textureY); // Box 405
		bodyModel[126] = new ModelRendererTurbo(this, 1, 465, textureX, textureY); // Box 406
		bodyModel[127] = new ModelRendererTurbo(this, 1001, 465, textureX, textureY); // Box 407
		bodyModel[128] = new ModelRendererTurbo(this, 1, 497, textureX, textureY); // Box 408
		bodyModel[129] = new ModelRendererTurbo(this, 353, 497, textureX, textureY); // Box 409
		bodyModel[130] = new ModelRendererTurbo(this, 153, 505, textureX, textureY); // Box 410
		bodyModel[131] = new ModelRendererTurbo(this, 337, 529, textureX, textureY); // Box 411
		bodyModel[132] = new ModelRendererTurbo(this, 713, 545, textureX, textureY); // Box 412
		bodyModel[133] = new ModelRendererTurbo(this, 1, 553, textureX, textureY); // Box 413
		bodyModel[134] = new ModelRendererTurbo(this, 81, 553, textureX, textureY); // Box 414
		bodyModel[135] = new ModelRendererTurbo(this, 425, 553, textureX, textureY); // Box 415
		bodyModel[136] = new ModelRendererTurbo(this, 697, 577, textureX, textureY); // Box 416
		bodyModel[137] = new ModelRendererTurbo(this, 409, 585, textureX, textureY); // Box 417
		bodyModel[138] = new ModelRendererTurbo(this, 1, 593, textureX, textureY); // Box 418
		bodyModel[139] = new ModelRendererTurbo(this, 209, 609, textureX, textureY); // Box 419
		bodyModel[140] = new ModelRendererTurbo(this, 865, 313, textureX, textureY); // Box 420
		bodyModel[141] = new ModelRendererTurbo(this, 777, 545, textureX, textureY); // Box 421
		bodyModel[142] = new ModelRendererTurbo(this, 593, 617, textureX, textureY); // Box 424
		bodyModel[143] = new ModelRendererTurbo(this, 745, 641, textureX, textureY); // Box 425
		bodyModel[144] = new ModelRendererTurbo(this, 377, 705, textureX, textureY); // Box 426
		bodyModel[145] = new ModelRendererTurbo(this, 225, 553, textureX, textureY); // Box 427
		bodyModel[146] = new ModelRendererTurbo(this, 329, 553, textureX, textureY); // Box 428
		bodyModel[147] = new ModelRendererTurbo(this, 793, 17, textureX, textureY); // Box 429
		bodyModel[148] = new ModelRendererTurbo(this, 1017, 17, textureX, textureY); // Box 430
		bodyModel[149] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Box 431
		bodyModel[150] = new ModelRendererTurbo(this, 817, 33, textureX, textureY); // Box 432
		bodyModel[151] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Box 433
		bodyModel[152] = new ModelRendererTurbo(this, 561, 89, textureX, textureY); // Box 434
		bodyModel[153] = new ModelRendererTurbo(this, 617, 89, textureX, textureY); // Box 435
		bodyModel[154] = new ModelRendererTurbo(this, 737, 89, textureX, textureY); // Box 436
		bodyModel[155] = new ModelRendererTurbo(this, 369, 601, textureX, textureY); // Box 434
		bodyModel[156] = new ModelRendererTurbo(this, 1, 601, textureX, textureY); // Box 435
		bodyModel[157] = new ModelRendererTurbo(this, 585, 601, textureX, textureY); // Box 436
		bodyModel[158] = new ModelRendererTurbo(this, 81, 393, textureX, textureY); // Box 437
		bodyModel[159] = new ModelRendererTurbo(this, 305, 577, textureX, textureY); // Box 438
		bodyModel[160] = new ModelRendererTurbo(this, 937, 601, textureX, textureY); // Box 434
		bodyModel[161] = new ModelRendererTurbo(this, 121, 609, textureX, textureY); // Box 435
		bodyModel[162] = new ModelRendererTurbo(this, 1, 729, textureX, textureY); // Box 442
		bodyModel[163] = new ModelRendererTurbo(this, 609, 761, textureX, textureY); // Box 443
		bodyModel[164] = new ModelRendererTurbo(this, 1, 828, textureX, textureY); // Box 453
		bodyModel[165] = new ModelRendererTurbo(this, 105, 113, textureX, textureY); // Box 454

		bodyModel[0].addShapeBox(0F, 0F, 0F, 63, 15, 68, 0F,0F, 0F, -8F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, -8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F); // Box 2
		bodyModel[0].setRotationPoint(14F, -95F, -34F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 5, 15, 68, 0F,-5F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, -5F, 0F, -8F, 0F, -3F, 6F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, -3F, 6F); // Box 3
		bodyModel[1].setRotationPoint(9F, -95F, -34F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 9, 2, 52, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 5
		bodyModel[2].setRotationPoint(5F, -95F, -26F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 36, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, -3.35F, 0F, 0F, 3.35F, 0F, 0F, 0F, -4F, 0F, -1F, 0F, 0F, -4.35F, 0F, 0F, 4.35F, -4F, 0F, 1F); // Box 8
		bodyModel[3].setRotationPoint(27F, -56F, -50F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 36, 15, 3, 0F,-4F, 0F, 0F, 0F, 0F, -3.35F, 0F, 0F, 3.35F, -4F, 0F, 0F, -15F, 0F, -6F, -10F, 0F, -9.35F, -10F, 0F, 9.35F, -15F, 0F, 6F); // Box 9
		bodyModel[4].setRotationPoint(27F, -51F, -49F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 26, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[5].setRotationPoint(88F, -56F, 39F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 23, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 12
		bodyModel[6].setRotationPoint(88F, -52F, 39F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 23, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 13
		bodyModel[7].setRotationPoint(88F, -52F, -42F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 26, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[8].setRotationPoint(88F, -56F, -42F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 51, 24, 84, 0F,0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, -13F, 0F, 8F, -13F, 0F, 8F, 0F, 0F, 0F); // Box 15
		bodyModel[9].setRotationPoint(-79F, -80F, -42F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 31, 24, 84, 0F,0F, -13F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, -13F, -8F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F); // Box 16
		bodyModel[10].setRotationPoint(-110F, -80F, -42F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 24, 10, 68, 0F,0F, -10F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 3.75F, 0F, 0F, 3.75F, 0F, 0F, 0F); // Box 17
		bodyModel[11].setRotationPoint(-79F, -90F, -34F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 27, 12, 68, 0F,0F, -2F, -8F, 0F, 2F, -8F, 0F, 2F, -8F, 0F, -2F, -8F, 0F, 0F, 3.75F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 3.75F); // Box 18
		bodyModel[12].setRotationPoint(-55F, -92F, -34F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 15, 14, 68, 0F,0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 8F, -2F, -4F, 8F, -2F, -4F, 8F, 0F, 0F, 8F); // Box 19
		bodyModel[13].setRotationPoint(-28F, -94F, -34F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 10, 12, 84, 0F,0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[14].setRotationPoint(-114F, -69F, -42F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 8, 12, 40, 0F,-8F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 5F, 0F, 0F); // Box 21
		bodyModel[15].setRotationPoint(-122F, -69F, -42F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 18, 2, 42, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F); // Box 22
		bodyModel[16].setRotationPoint(-122F, -57F, -42F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 8, 12, 40, 0F,-3F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, -8F, -8F, 0F, -8F, 5F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[17].setRotationPoint(-122F, -69F, 2F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 45, 20, 20, 0F,-9F, -5F, -4F, 0F, 0F, 3F, 0F, 0F, -11F, -9F, -5F, -4F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[18].setRotationPoint(-100F, -90F, 3F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 45, 20, 20, 0F,-9F, -5F, -4F, 0F, 0F, -11F, 0F, 0F, 3F, -9F, -5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F); // Box 39
		bodyModel[19].setRotationPoint(-100F, -90F, -23F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 21, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 40
		bodyModel[20].setRotationPoint(-115F, -56F, -42F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 21, 9, 3, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -10F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -10F, 0F, 0F); // Box 41
		bodyModel[21].setRotationPoint(-115F, -51F, -42F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 26, 20, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, -0.5F, -16F, 0F, -1F, 3F, 0F, 1F, 3F, 0F, -1F, -16F, 0F, 1F); // Box 42
		bodyModel[22].setRotationPoint(-67F, -56F, -44F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 26, 20, 3, 0F,0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 0F, -16F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 1F, -16F, 0F, 1F); // Box 43
		bodyModel[23].setRotationPoint(-67F, -56F, 41F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 21, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 44
		bodyModel[24].setRotationPoint(-115F, -56F, 39F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 21, 9, 3, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -10F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -10F, 0F, 0F); // Box 45
		bodyModel[25].setRotationPoint(-115F, -51F, 39F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 57, 14, 26, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[26].setRotationPoint(19F, -94F, -13F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 42, 14, 26, 0F,0F, 0F, 0F, 0F, -29F, 0F, 0F, -29F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 27F, 0F, 0F, 27F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[27].setRotationPoint(76F, -94F, -13F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 43, 29, 22, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[28].setRotationPoint(76F, -94F, -11F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 43, 2, 22, 0F,-2F, 0F, -2F, -2F, -4F, -2F, -2F, -4F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[29].setRotationPoint(76F, -96F, -11F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 26, 12, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[30].setRotationPoint(93F, -65F, -11F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 26, 4, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 52
		bodyModel[31].setRotationPoint(93F, -53F, -11F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[32].setRotationPoint(112F, -67F, 13F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[33].setRotationPoint(121F, -67F, 0F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[34].setRotationPoint(112F, -67F, -14F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F); // Box 56
		bodyModel[35].setRotationPoint(121F, -67F, -13F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[36].setRotationPoint(107F, -67.5F, 12.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[37].setRotationPoint(107F, -67.5F, -14.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 2, 37, 22, 0F,0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F); // Box 58
		bodyModel[38].setRotationPoint(119F, -90F, -11F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 6, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[39].setRotationPoint(115F, -94F, -5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 5, 2, 10, 0F,-2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[40].setRotationPoint(115F, -96F, -5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 6, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[41].setRotationPoint(119F, -94F, -5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 18, 6, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, -4F); // Box 62
		bodyModel[42].setRotationPoint(90F, -66F, 15F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 18, 6, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[43].setRotationPoint(90F, -72F, 15F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 18, 6, 18, 0F,-4F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[44].setRotationPoint(90F, -78F, 15F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[45].setRotationPoint(108F, -71F, 22F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[46].setRotationPoint(118F, -70.5F, 22.5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 30, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[47].setRotationPoint(113F, -70F, 23F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 10, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[48].setRotationPoint(125F, -70.5F, 22.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 18, 6, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, -4F); // Box 69
		bodyModel[49].setRotationPoint(90F, -66F, -33F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 18, 6, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[50].setRotationPoint(90F, -72F, -33F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 18, 6, 18, 0F,-4F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[51].setRotationPoint(90F, -78F, -33F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		bodyModel[52].setRotationPoint(108F, -71F, -26F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 30, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[53].setRotationPoint(113F, -70F, -25F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[54].setRotationPoint(118F, -70.5F, -25.5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 10, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[55].setRotationPoint(125F, -70.5F, -25.5F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 18, 6, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, -4F); // Box 76
		bodyModel[56].setRotationPoint(94F, -46F, -33F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 18, 6, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[57].setRotationPoint(94F, -52F, -33F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 18, 6, 18, 0F,-4F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[58].setRotationPoint(94F, -58F, -33F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[59].setRotationPoint(112F, -51F, -26F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 30, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[60].setRotationPoint(117F, -50F, -25F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		bodyModel[61].setRotationPoint(122F, -50.5F, -25.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 10, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[62].setRotationPoint(129F, -50.5F, -25.5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 18, 6, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, -4F); // Box 83
		bodyModel[63].setRotationPoint(94F, -46F, 15F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 18, 6, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[64].setRotationPoint(94F, -52F, 15F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 18, 6, 18, 0F,-4F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[65].setRotationPoint(94F, -58F, 15F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[66].setRotationPoint(112F, -51F, 22F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[67].setRotationPoint(122F, -50.5F, 22.5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 30, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[68].setRotationPoint(117F, -50F, 23F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 10, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		bodyModel[69].setRotationPoint(129F, -50.5F, 22.5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 45, 14, 2, 0F,0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[70].setRotationPoint(21F, -96F, 14F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 45, 14, 2, 0F,0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[71].setRotationPoint(21F, -96F, -16F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 19, 14, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F); // Box 92
		bodyModel[72].setRotationPoint(21F, -96F, -14F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 19, 14, 14, 0F,0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		bodyModel[73].setRotationPoint(21F, -96F, 0F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 10, 8, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		bodyModel[74].setRotationPoint(41F, -99F, -11F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 6, 8, 22, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 95
		bodyModel[75].setRotationPoint(35F, -99F, -11F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 6, 8, 22, 0F,0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 96
		bodyModel[76].setRotationPoint(51F, -99F, -11F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 74, 30, 50, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133
		bodyModel[77].setRotationPoint(-40F, -82F, -25F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 85, 15, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134
		bodyModel[78].setRotationPoint(-31F, -57F, -12F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 65, 6, 50, 0F,0F, 2F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 2F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[79].setRotationPoint(-39F, -88F, -25F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 2, 5, 48, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		bodyModel[80].setRotationPoint(7F, -89F, -24F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 2, 5, 48, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
		bodyModel[81].setRotationPoint(3F, -89F, -24F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 2, 5, 48, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[82].setRotationPoint(-1F, -89.5F, -24F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 2, 5, 48, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		bodyModel[83].setRotationPoint(-5F, -90F, -24F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 2, 5, 48, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		bodyModel[84].setRotationPoint(-9F, -90.5F, -24F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 2, 5, 48, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[85].setRotationPoint(-13F, -91F, -24F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 36, 25, 58, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -15F, 0F, -5F, -10F, 0F, -5F, -10F, 0F, -5F, -15F, 0F, -5F); // Box 360
		bodyModel[86].setRotationPoint(27F, -56F, -29F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 63, 15, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F); // Box 361
		bodyModel[87].setRotationPoint(-94F, -57F, -12F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 13, 9, 36, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 362
		bodyModel[88].setRotationPoint(97F, -56F, -18F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 38, 10, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 363
		bodyModel[89].setRotationPoint(-31F, -42F, -15F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 20, 8, 76, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364
		bodyModel[90].setRotationPoint(-20F, -72F, -38.5F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 20, 6, 76, 0F,-6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 365
		bodyModel[91].setRotationPoint(-20F, -78F, -38.5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 20, 6, 76, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Box 366
		bodyModel[92].setRotationPoint(-20F, -64F, -38.5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 12, 4, 12, 0F,-3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 367
		bodyModel[93].setRotationPoint(-16.5F, -45.5F, -27F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 12, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 368
		bodyModel[94].setRotationPoint(-16.5F, -41.5F, -27F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 12, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F); // Box 369
		bodyModel[95].setRotationPoint(-16.5F, -37.5F, -27F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 2, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F); // Box 372
		bodyModel[96].setRotationPoint(-19.5F, -41.5F, -27F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 2, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F); // Box 373
		bodyModel[97].setRotationPoint(-3.5F, -41.5F, -27F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 2, 4, 12, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 374
		bodyModel[98].setRotationPoint(-3.5F, -41.5F, 15F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 12, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F); // Box 375
		bodyModel[99].setRotationPoint(-16.5F, -37.5F, 15F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 12, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 376
		bodyModel[100].setRotationPoint(-16.5F, -41.5F, 15F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 12, 4, 12, 0F,-3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 377
		bodyModel[101].setRotationPoint(-16.5F, -45.5F, 15F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 2, 4, 12, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 380
		bodyModel[102].setRotationPoint(-19.5F, -41.5F, 15F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 381
		bodyModel[103].setRotationPoint(121F, -59F, -0.5F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 382
		bodyModel[104].setRotationPoint(121F, -67F, 12.5F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 383
		bodyModel[105].setRotationPoint(121F, -67F, -13.5F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 384
		bodyModel[106].setRotationPoint(121F, -50F, -13.5F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 11, 2, 2, 0F,0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F); // Box 385
		bodyModel[107].setRotationPoint(-36F, -71F, 35.5F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 22, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, 0F); // Box 386
		bodyModel[108].setRotationPoint(5F, -71F, 35.5F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 11, 2, 2, 0F,0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F); // Box 389
		bodyModel[109].setRotationPoint(-36F, -66F, 35.5F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 22, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, 0F); // Box 390
		bodyModel[110].setRotationPoint(5F, -66F, 35.5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 7, 9, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 391
		bodyModel[111].setRotationPoint(18F, -72F, 29.5F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 7, 9, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 392
		bodyModel[112].setRotationPoint(-39F, -72F, 29.5F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 11, 2, 2, 0F,0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F); // Box 393
		bodyModel[113].setRotationPoint(-36F, -71F, -38.5F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 22, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, 0F); // Box 394
		bodyModel[114].setRotationPoint(5F, -71F, -38.5F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 11, 2, 2, 0F,0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F); // Box 395
		bodyModel[115].setRotationPoint(-36F, -66F, -38.5F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 22, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, 0F); // Box 396
		bodyModel[116].setRotationPoint(5F, -66F, -38.5F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 7, 9, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 397
		bodyModel[117].setRotationPoint(18F, -72F, -35.5F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 7, 9, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 398
		bodyModel[118].setRotationPoint(-39F, -72F, -35.5F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 38, 10, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 399
		bodyModel[119].setRotationPoint(-31F, -52F, -15F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 20, 8, 6, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F); // Box 400
		bodyModel[120].setRotationPoint(18F, -50F, 17F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 25, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 401
		bodyModel[121].setRotationPoint(-7F, -45F, 17F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 25, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 402
		bodyModel[122].setRotationPoint(-7F, -45F, -24F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 20, 8, 6, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F); // Box 403
		bodyModel[123].setRotationPoint(18F, -50F, -24F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 2, 10, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 404
		bodyModel[124].setRotationPoint(13F, -46F, 16F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 2, 10, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 405
		bodyModel[125].setRotationPoint(13F, -46F, -25F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 2, 10, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 406
		bodyModel[126].setRotationPoint(9F, -46F, 16F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 2, 10, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 407
		bodyModel[127].setRotationPoint(9F, -46F, -25F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 2, 10, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 408
		bodyModel[128].setRotationPoint(5F, -46F, 16F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 2, 10, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 409
		bodyModel[129].setRotationPoint(5F, -46F, -25F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 2, 10, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 410
		bodyModel[130].setRotationPoint(1F, -46F, 16F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 2, 10, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 411
		bodyModel[131].setRotationPoint(1F, -46F, -25F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 22, 6, 18, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 412
		bodyModel[132].setRotationPoint(54F, -56F, -9F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 37, 23, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -8F, 0F, -6F, -8F, 0F, 0F, 0F, 0F); // Box 413
		bodyModel[133].setRotationPoint(53F, -57F, -12F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 37, 23, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -8F, 0F, -6F, -8F, 0F, 0F, 0F, 0F); // Box 414
		bodyModel[134].setRotationPoint(53F, -57F, 10F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 22, 6, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 415
		bodyModel[135].setRotationPoint(54F, -50F, -9F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 22, 6, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F); // Box 416
		bodyModel[136].setRotationPoint(54F, -44F, -9F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 40, 22, 92, 0F,10F, 0F, -8F, -37F, 0F, -10F, -37F, 0F, -10F, 10F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 417
		bodyModel[137].setRotationPoint(72F, -79F, -46F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 11, 22, 92, 0F,10F, 0F, -6F, -10F, 0F, -8F, -10F, 0F, -8F, 10F, 0F, -7F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 418
		bodyModel[138].setRotationPoint(59F, -79F, -46F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 28, 15, 98, 0F,10F, 0F, -4F, -10F, 0F, -7F, -10F, 0F, -6F, 10F, 0F, -4F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F); // Box 419
		bodyModel[139].setRotationPoint(29F, -72F, -49F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 28, 5, 1, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, -4F, 0F, -1F); // Box 420
		bodyModel[140].setRotationPoint(29F, -57F, -48F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 28, 10, 1, 0F,-4F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -2F, -12F, 0F, -1F, -8F, 0F, -2.5F, -8F, 0F, 4F, -12F, 0F, 2F); // Box 421
		bodyModel[141].setRotationPoint(29F, -52F, -47F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 31, 22, 86, 0F,0F, -13F, -6F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -13F, -6F, 7F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 7F, 0F, 0F); // Box 424
		bodyModel[142].setRotationPoint(-110F, -79F, -43F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 12, 22, 90, 0F,0F, 0F, -9F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -9F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 425
		bodyModel[143].setRotationPoint(-79F, -79F, -45F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 22, 22, 90, 0F,0F, 0F, -8F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -8F, 0F, 0F, 1F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 1F); // Box 426
		bodyModel[144].setRotationPoint(-65F, -79F, -45F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 22, 17, 1, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 1F, -16F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 1F, -16F, 0F, 1F); // Box 427
		bodyModel[145].setRotationPoint(-65F, -57F, 44F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 22, 17, 1, 0F,0F, 0F, 1F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, 0F, -16F, 0F, 0F, 3F, 0F, 2F, 3F, 0F, 0F, -16F, 0F, 0F); // Box 428
		bodyModel[146].setRotationPoint(-65F, -57F, -45F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 429
		bodyModel[147].setRotationPoint(92.5F, -55F, 42F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 430
		bodyModel[148].setRotationPoint(96.5F, -55F, 42F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 431
		bodyModel[149].setRotationPoint(100.5F, -55F, 42F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 432
		bodyModel[150].setRotationPoint(104.5F, -55F, 42F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 433
		bodyModel[151].setRotationPoint(92.5F, -55F, -43F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 434
		bodyModel[152].setRotationPoint(96.5F, -55F, -43F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 435
		bodyModel[153].setRotationPoint(100.5F, -55F, -43F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 436
		bodyModel[154].setRotationPoint(104.5F, -55F, -43F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 18, 2, 42, 0F,5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 434
		bodyModel[155].setRotationPoint(-122F, -57F, 0F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 36, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 3.35F, 0F, 0F, -3.35F, 0F, 0F, 0F, -4F, 0F, 1F, 0F, 0F, 4.35F, 0F, 0F, -4.35F, -4F, 0F, -1F); // Box 435
		bodyModel[156].setRotationPoint(27F, -56F, 47F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 36, 15, 3, 0F,-4F, 0F, 0F, 0F, 0F, 3.35F, 0F, 0F, -3.35F, -4F, 0F, 0F, -15F, 0F, 6F, -10F, 0F, 9.35F, -10F, 0F, -9.35F, -15F, 0F, -6F); // Box 436
		bodyModel[157].setRotationPoint(27F, -51F, 46F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 28, 5, 1, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -4F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -0.5F, -4F, 0F, 1.5F); // Box 437
		bodyModel[158].setRotationPoint(29F, -57F, 47F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 28, 10, 1, 0F,-4F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0.5F, -4F, 0F, 2.5F, -12F, 0F, 2F, -8F, 0F, 4F, -8F, 0F, -3.5F, -12F, 0F, -1F); // Box 438
		bodyModel[159].setRotationPoint(29F, -52F, 46F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 12, 2, 23, 0F,1.7F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 434
		bodyModel[160].setRotationPoint(104F, -88F, -11.5F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 12, 16, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F); // Box 435
		bodyModel[161].setRotationPoint(104F, -86F, -11.5F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 100, 24, 42, 0F,0F, 0F, 0F, -37F, 0F, -8F, -37F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 8F, 0F, 0F, 0F, 7F, 0F, 0F, -13F, 0F, 0F); // Box 442
		bodyModel[162].setRotationPoint(14F, -80F, -42F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 100, 24, 42, 0F,0F, 0F, 0F, -37F, 0F, 0F, -37F, 0F, -8F, 0F, 0F, 0F, -13F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 8F); // Box 443
		bodyModel[163].setRotationPoint(14F, -80F, 0F);

		bodyModel[164].addShapeBox(-105F, -100F, -64F, 128, 1, 128, 0F,-50F, 0.25F, -50F, -50F, 4.25F, -50F, -50F, 4.25F, -50F, -50F, 0.25F, -50F, -50F, 0F, -50F, -50F, -4F, -50F, -50F, -4F, -50F, -50F, 0F, -50F); // Box 453
		bodyModel[164].setRotationPoint(0F, 10F, 0F);

		bodyModel[165].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 454
		bodyModel[165].setRotationPoint(46F, -100F, 0F);
	}

	
	private void initleftAnimTrackModel_0()
	{
		leftAnimTrackModel1[0] = new ModelRendererTurbo(this, 537, 273, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel1[1] = new ModelRendererTurbo(this, 993, 57, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel1[2] = new ModelRendererTurbo(this, 897, 257, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel1[3] = new ModelRendererTurbo(this, 473, 89, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel1[4] = new ModelRendererTurbo(this, 481, 273, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel1[5] = new ModelRendererTurbo(this, 953, 273, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel1[6] = new ModelRendererTurbo(this, 809, 281, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel1[7] = new ModelRendererTurbo(this, 953, 297, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel1[8] = new ModelRendererTurbo(this, 161, 321, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel1[9] = new ModelRendererTurbo(this, 241, 321, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel1[10] = new ModelRendererTurbo(this, 833, 321, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel1[11] = new ModelRendererTurbo(this, 873, 329, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel1[12] = new ModelRendererTurbo(this, 281, 353, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel1[13] = new ModelRendererTurbo(this, 393, 353, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel1[14] = new ModelRendererTurbo(this, 505, 321, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel1[15] = new ModelRendererTurbo(this, 937, 329, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel1[16] = new ModelRendererTurbo(this, 1, 353, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel1[17] = new ModelRendererTurbo(this, 521, 177, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel1[18] = new ModelRendererTurbo(this, 337, 113, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel1[19] = new ModelRendererTurbo(this, 689, 129, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel1[20] = new ModelRendererTurbo(this, 937, 57, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel1[21] = new ModelRendererTurbo(this, 801, 65, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel1[22] = new ModelRendererTurbo(this, 625, 353, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel1[23] = new ModelRendererTurbo(this, 721, 353, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel1[24] = new ModelRendererTurbo(this, 257, 161, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel1[25] = new ModelRendererTurbo(this, 753, 129, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel1[26] = new ModelRendererTurbo(this, 993, 129, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel1[27] = new ModelRendererTurbo(this, 985, 145, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel1[28] = new ModelRendererTurbo(this, 753, 169, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel1[29] = new ModelRendererTurbo(this, 369, 201, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel1[30] = new ModelRendererTurbo(this, 137, 217, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel1[31] = new ModelRendererTurbo(this, 217, 217, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel1[32] = new ModelRendererTurbo(this, 593, 57, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel1[33] = new ModelRendererTurbo(this, 1001, 113, textureX, textureY); // front Left Leg
		leftAnimTrackModel1[34] = new ModelRendererTurbo(this, 153, 113, textureX, textureY); // front Left Leg
		leftAnimTrackModel1[35] = new ModelRendererTurbo(this, 561, 121, textureX, textureY); // front Left Leg
		leftAnimTrackModel1[36] = new ModelRendererTurbo(this, 41, 145, textureX, textureY); // front Left Leg
		leftAnimTrackModel1[37] = new ModelRendererTurbo(this, 257, 361, textureX, textureY); // front Left Leg
		leftAnimTrackModel1[38] = new ModelRendererTurbo(this, 905, 393, textureX, textureY); // front Left Leg
		leftAnimTrackModel1[39] = new ModelRendererTurbo(this, 281, 401, textureX, textureY); // front Left Leg
		leftAnimTrackModel1[40] = new ModelRendererTurbo(this, 289, 321, textureX, textureY); // front Left Leg
		leftAnimTrackModel1[41] = new ModelRendererTurbo(this, 969, 393, textureX, textureY); // front Left Leg
		leftAnimTrackModel1[42] = new ModelRendererTurbo(this, 345, 401, textureX, textureY); // front Left Leg
		leftAnimTrackModel1[43] = new ModelRendererTurbo(this, 409, 401, textureX, textureY); // front Left Leg
		leftAnimTrackModel1[44] = new ModelRendererTurbo(this, 473, 401, textureX, textureY); // front Left Leg
		leftAnimTrackModel1[45] = new ModelRendererTurbo(this, 745, 393, textureX, textureY); // front Left Leg
		leftAnimTrackModel1[46] = new ModelRendererTurbo(this, 137, 409, textureX, textureY); // front Left Leg
		leftAnimTrackModel1[47] = new ModelRendererTurbo(this, 209, 409, textureX, textureY); // front Left Leg
		leftAnimTrackModel1[48] = new ModelRendererTurbo(this, 513, 409, textureX, textureY); // front Left Leg
		leftAnimTrackModel1[49] = new ModelRendererTurbo(this, 945, 409, textureX, textureY); // front Left Leg
		leftAnimTrackModel1[50] = new ModelRendererTurbo(this, 1, 417, textureX, textureY); // front Left Leg
		leftAnimTrackModel1[51] = new ModelRendererTurbo(this, 561, 409, textureX, textureY); // front Left Leg
		leftAnimTrackModel1[52] = new ModelRendererTurbo(this, 793, 409, textureX, textureY); // front Left Leg
		leftAnimTrackModel1[53] = new ModelRendererTurbo(this, 601, 417, textureX, textureY); // front Left Leg
		leftAnimTrackModel1[54] = new ModelRendererTurbo(this, 185, 409, textureX, textureY); // front Left Leg
		leftAnimTrackModel1[55] = new ModelRendererTurbo(this, 497, 313, textureX, textureY); // front Left Leg
		leftAnimTrackModel1[56] = new ModelRendererTurbo(this, 985, 321, textureX, textureY); // front Left Leg
		leftAnimTrackModel1[57] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // front Left Leg
		leftAnimTrackModel1[58] = new ModelRendererTurbo(this, 753, 201, textureX, textureY); // front Left Leg
		leftAnimTrackModel1[59] = new ModelRendererTurbo(this, 1001, 49, textureX, textureY); // front Left Leg
		leftAnimTrackModel1[60] = new ModelRendererTurbo(this, 57, 241, textureX, textureY); // front Left Leg
		leftAnimTrackModel1[61] = new ModelRendererTurbo(this, 321, 281, textureX, textureY); // front Left Leg
		leftAnimTrackModel1[62] = new ModelRendererTurbo(this, 593, 305, textureX, textureY); // front Left Leg
		leftAnimTrackModel1[63] = new ModelRendererTurbo(this, 809, 305, textureX, textureY); // front Left Leg
		leftAnimTrackModel1[64] = new ModelRendererTurbo(this, 729, 505, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel1[65] = new ModelRendererTurbo(this, 753, 145, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel1[66] = new ModelRendererTurbo(this, 49, 401, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel1[67] = new ModelRendererTurbo(this, 281, 121, textureX, textureY); // front Left Leg
		leftAnimTrackModel1[68] = new ModelRendererTurbo(this, 1, 585, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel1[69] = new ModelRendererTurbo(this, 585, 585, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel1[70] = new ModelRendererTurbo(this, 881, 585, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel1[71] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel1[72] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // front Left Leg
		leftAnimTrackModel1[73] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // front Left Leg
		leftAnimTrackModel1[74] = new ModelRendererTurbo(this, 1, 449, textureX, textureY); // Rear Left Leg
		leftAnimTrackModel1[75] = new ModelRendererTurbo(this, 249, 449, textureX, textureY); // Rear Left Leg
		leftAnimTrackModel1[76] = new ModelRendererTurbo(this, 305, 449, textureX, textureY); // Rear Left Leg
		leftAnimTrackModel1[77] = new ModelRendererTurbo(this, 369, 449, textureX, textureY); // Rear Left Leg
		leftAnimTrackModel1[78] = new ModelRendererTurbo(this, 857, 449, textureX, textureY); // Rear Left Leg
		leftAnimTrackModel1[79] = new ModelRendererTurbo(this, 1, 353, textureX, textureY); // Rear Left Leg
		leftAnimTrackModel1[80] = new ModelRendererTurbo(this, 705, 353, textureX, textureY); // Rear Left Leg
		leftAnimTrackModel1[81] = new ModelRendererTurbo(this, 49, 361, textureX, textureY); // Rear Left Leg
		leftAnimTrackModel1[82] = new ModelRendererTurbo(this, 209, 361, textureX, textureY); // Rear Left Leg
		leftAnimTrackModel1[83] = new ModelRendererTurbo(this, 49, 457, textureX, textureY); // Rear Left Leg
		leftAnimTrackModel1[84] = new ModelRendererTurbo(this, 425, 457, textureX, textureY); // Rear Left Leg
		leftAnimTrackModel1[85] = new ModelRendererTurbo(this, 545, 457, textureX, textureY); // Rear Left Leg
		leftAnimTrackModel1[86] = new ModelRendererTurbo(this, 409, 353, textureX, textureY); // Rear Left Leg
		leftAnimTrackModel1[87] = new ModelRendererTurbo(this, 553, 361, textureX, textureY); // Rear Left Leg
		leftAnimTrackModel1[88] = new ModelRendererTurbo(this, 705, 433, textureX, textureY); // Rear Left Leg
		leftAnimTrackModel1[89] = new ModelRendererTurbo(this, 601, 441, textureX, textureY); // Rear Left Leg
		leftAnimTrackModel1[90] = new ModelRendererTurbo(this, 177, 441, textureX, textureY); // Rear Left Leg
		leftAnimTrackModel1[91] = new ModelRendererTurbo(this, 977, 441, textureX, textureY); // Rear Left Leg
		leftAnimTrackModel1[92] = new ModelRendererTurbo(this, 721, 449, textureX, textureY); // Rear Left Leg
		leftAnimTrackModel1[93] = new ModelRendererTurbo(this, 1, 465, textureX, textureY); // Rear Left Leg
		leftAnimTrackModel1[94] = new ModelRendererTurbo(this, 249, 465, textureX, textureY); // Rear Left Leg
		leftAnimTrackModel1[95] = new ModelRendererTurbo(this, 89, 457, textureX, textureY); // Rear Left Leg
		leftAnimTrackModel1[96] = new ModelRendererTurbo(this, 585, 465, textureX, textureY); // Rear Left Leg
		leftAnimTrackModel1[97] = new ModelRendererTurbo(this, 841, 361, textureX, textureY); // Rear Left Leg
		leftAnimTrackModel1[98] = new ModelRendererTurbo(this, 657, 465, textureX, textureY); // Rear Left Leg
		leftAnimTrackModel1[99] = new ModelRendererTurbo(this, 1, 369, textureX, textureY); // Rear Left Leg
		leftAnimTrackModel1[100] = new ModelRendererTurbo(this, 657, 89, textureX, textureY); // Rear Left Leg
		leftAnimTrackModel1[101] = new ModelRendererTurbo(this, 761, 465, textureX, textureY); // Rear Left Leg
		leftAnimTrackModel1[102] = new ModelRendererTurbo(this, 121, 473, textureX, textureY); // Rear Left Leg
		leftAnimTrackModel1[103] = new ModelRendererTurbo(this, 353, 377, textureX, textureY); // Rear Left Leg
		leftAnimTrackModel1[104] = new ModelRendererTurbo(this, 385, 377, textureX, textureY); // Rear Left Leg
		leftAnimTrackModel1[105] = new ModelRendererTurbo(this, 353, 153, textureX, textureY); // Rear Left Leg
		leftAnimTrackModel1[106] = new ModelRendererTurbo(this, 1001, 361, textureX, textureY); // Rear Left Leg
		leftAnimTrackModel1[107] = new ModelRendererTurbo(this, 233, 241, textureX, textureY); // Rear Left Leg
		leftAnimTrackModel1[108] = new ModelRendererTurbo(this, 465, 377, textureX, textureY); // Rear Left Leg
		leftAnimTrackModel1[109] = new ModelRendererTurbo(this, 793, 113, textureX, textureY); // Rear Left Leg
		leftAnimTrackModel1[110] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Rear Left Leg
		leftAnimTrackModel1[111] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Rear Left Leg
		leftAnimTrackModel1[112] = new ModelRendererTurbo(this, 209, 361, textureX, textureY); // Box 455
		leftAnimTrackModel1[113] = new ModelRendererTurbo(this, 49, 361, textureX, textureY); // Box 456
		leftAnimTrackModel1[114] = new ModelRendererTurbo(this, 1, 353, textureX, textureY); // Box 457
		leftAnimTrackModel1[115] = new ModelRendererTurbo(this, 705, 353, textureX, textureY); // Box 458

		leftAnimTrackModel1[0].addShapeBox(0F, 0F, 0F, 30, 10, 16, 0F,-10F, 0F, 1.5F, -10F, 0F, 1.5F, -10F, 0F, -1.5F, -10F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Mid Left Leg
		leftAnimTrackModel1[0].setRotationPoint(-25F, -83F, 33F);

		leftAnimTrackModel1[1].addShapeBox(-14F, 7F, -2F, 11, 12, 4, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Mid Left Leg
		leftAnimTrackModel1[1].setRotationPoint(-10F, -66F, 44F);
		leftAnimTrackModel1[1].rotateAngleZ = 0.41887902F;

		leftAnimTrackModel1[2].addShapeBox(-14F, 19F, 0F, 11, 27, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, -5F, 0F, 3F); // Mid Left Leg
		leftAnimTrackModel1[2].setRotationPoint(-10F, -66F, 44F);
		leftAnimTrackModel1[2].rotateAngleZ = 0.41887902F;

		leftAnimTrackModel1[3].addShapeBox(3F, 7F, -2F, 11, 12, 4, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Mid Left Leg
		leftAnimTrackModel1[3].setRotationPoint(-10F, -66F, 44F);
		leftAnimTrackModel1[3].rotateAngleZ = 0.41887902F;

		leftAnimTrackModel1[4].addShapeBox(3F, 19F, 0F, 11, 27, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -3F, -5F, 6F, -3F, -5F, 6F, 3F, 0F, 4F, 3F); // Mid Left Leg
		leftAnimTrackModel1[4].setRotationPoint(-10F, -66F, 44F);
		leftAnimTrackModel1[4].rotateAngleZ = 0.41887902F;

		leftAnimTrackModel1[5].addShapeBox(0F, 0F, 0F, 20, 6, 12, 0F,-6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Mid Left Leg
		leftAnimTrackModel1[5].setRotationPoint(0F, -29F, 51F);

		leftAnimTrackModel1[6].addShapeBox(0F, 0F, 0F, 20, 8, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Mid Left Leg
		leftAnimTrackModel1[6].setRotationPoint(0F, -23F, 51F);

		leftAnimTrackModel1[7].addShapeBox(0F, 0F, 0F, 20, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Mid Left Leg
		leftAnimTrackModel1[7].setRotationPoint(0F, -15F, 51F);

		leftAnimTrackModel1[8].addShapeBox(0F, 0F, 0F, 10, 8, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F); // Mid Left Leg
		leftAnimTrackModel1[8].setRotationPoint(4F, -1F, 43F);

		leftAnimTrackModel1[9].addShapeBox(0F, 0F, 0F, 9, 8, 28, 0F,0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 5F, 0F, -8F, 0F, 0F, 5F, 0F, 0F, 5F, 5F, 0F, -8F); // Mid Left Leg
		leftAnimTrackModel1[9].setRotationPoint(-5F, -1F, 43F);

		leftAnimTrackModel1[10].addShapeBox(0F, 0F, 0F, 9, 8, 28, 0F,0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 5F, 5F, 0F, -8F, 5F, 0F, -8F, 0F, 0F, 5F); // Mid Left Leg
		leftAnimTrackModel1[10].setRotationPoint(14F, -1F, 43F);

		leftAnimTrackModel1[11].addShapeBox(0F, 0F, 0F, 10, 3, 38, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Mid Left Leg
		leftAnimTrackModel1[11].setRotationPoint(4F, 7F, 38F);

		leftAnimTrackModel1[12].addShapeBox(0F, 0F, 0F, 14, 3, 38, 0F,0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F); // Mid Left Leg
		leftAnimTrackModel1[12].setRotationPoint(14F, 7F, 38F);

		leftAnimTrackModel1[13].addShapeBox(0F, 0F, 0F, 14, 3, 38, 0F,0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F); // Mid Left Leg
		leftAnimTrackModel1[13].setRotationPoint(-10F, 7F, 38F);

		leftAnimTrackModel1[14].addShapeBox(0F, 0F, 0F, 10, 3, 28, 0F,0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Mid Left Leg
		leftAnimTrackModel1[14].setRotationPoint(4F, -4F, 43F);

		leftAnimTrackModel1[15].addShapeBox(0F, 0F, 0F, 9, 3, 28, 0F,0F, 0F, -8F, -5F, 0F, -12F, -5F, 0F, -12F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F); // Mid Left Leg
		leftAnimTrackModel1[15].setRotationPoint(14F, -4F, 43F);

		leftAnimTrackModel1[16].addShapeBox(0F, 0F, 0F, 9, 3, 28, 0F,-5F, 0F, -12F, 0F, 0F, -8F, 0F, 0F, -8F, -5F, 0F, -12F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F); // Mid Left Leg
		leftAnimTrackModel1[16].setRotationPoint(-5F, -4F, 43F);

		leftAnimTrackModel1[17].addShapeBox(0F, 0F, 0F, 10, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Mid Left Leg
		leftAnimTrackModel1[17].setRotationPoint(4F, -7F, 51F);

		leftAnimTrackModel1[18].addShapeBox(0F, 0F, 0F, 4, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Mid Left Leg
		leftAnimTrackModel1[18].setRotationPoint(14F, -7F, 51F);

		leftAnimTrackModel1[19].addShapeBox(0F, 0F, 0F, 4, 3, 12, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Mid Left Leg
		leftAnimTrackModel1[19].setRotationPoint(0F, -7F, 51F);

		leftAnimTrackModel1[20].addShapeBox(0F, 0F, 0F, 4, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Mid Left Leg
		leftAnimTrackModel1[20].setRotationPoint(1F, -15F, 55F);

		leftAnimTrackModel1[21].addShapeBox(0F, 0F, 0F, 4, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Mid Left Leg
		leftAnimTrackModel1[21].setRotationPoint(13F, -15F, 55F);

		leftAnimTrackModel1[22].addShapeBox(0F, 0F, 0F, 30, 10, 16, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Mid Left Leg
		leftAnimTrackModel1[22].setRotationPoint(-25F, -73F, 34.5F);

		leftAnimTrackModel1[23].addShapeBox(0F, 0F, 0F, 30, 10, 16, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F); // Mid Left Leg
		leftAnimTrackModel1[23].setRotationPoint(-25F, -63F, 36F);

		leftAnimTrackModel1[24].addShapeBox(0F, 0F, 0F, 22, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Mid Left Leg
		leftAnimTrackModel1[24].setRotationPoint(-1F, -23F, 46.5F);

		leftAnimTrackModel1[25].addShapeBox(0F, 0F, 0F, 8, 2, 7, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Mid Left Leg
		leftAnimTrackModel1[25].setRotationPoint(6F, -25F, 44.5F);

		leftAnimTrackModel1[26].addShapeBox(0F, 0F, 0F, 8, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Mid Left Leg
		leftAnimTrackModel1[26].setRotationPoint(6F, -19F, 44.5F);

		leftAnimTrackModel1[27].addShapeBox(0F, 0F, 0F, 8, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Mid Left Leg
		leftAnimTrackModel1[27].setRotationPoint(6F, -23F, 44.5F);

		leftAnimTrackModel1[28].addShapeBox(0F, 0F, 0F, 8, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Mid Left Leg
		leftAnimTrackModel1[28].setRotationPoint(-7F, 7F, 65F);

		leftAnimTrackModel1[29].addShapeBox(0F, 0F, 0F, 8, 3, 8, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Mid Left Leg
		leftAnimTrackModel1[29].setRotationPoint(-7F, 7F, 41F);

		leftAnimTrackModel1[30].addShapeBox(0F, 0F, 0F, 8, 3, 8, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Mid Left Leg
		leftAnimTrackModel1[30].setRotationPoint(17F, 7F, 41F);

		leftAnimTrackModel1[31].addShapeBox(0F, 0F, 0F, 8, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Mid Left Leg
		leftAnimTrackModel1[31].setRotationPoint(17F, 7F, 65F);

		leftAnimTrackModel1[32].addShapeBox(0F, 0F, 0F, 4, 3, 8, 0F,0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F); // Mid Left Leg
		leftAnimTrackModel1[32].setRotationPoint(-14F, 7F, 53F);

		leftAnimTrackModel1[33].addShapeBox(0F, 0F, 0F, 7, 7, 4, 0F,-7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // front Left Leg
		leftAnimTrackModel1[33].setRotationPoint(70F, -56F, 30F);

		leftAnimTrackModel1[34].addShapeBox(0F, 0F, 0F, 5, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F); // front Left Leg
		leftAnimTrackModel1[34].setRotationPoint(72F, -49F, 30F);

		leftAnimTrackModel1[35].addShapeBox(0F, 0F, 0F, 5, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F); // front Left Leg
		leftAnimTrackModel1[35].setRotationPoint(75F, -43F, 30F);

		leftAnimTrackModel1[36].addShapeBox(0F, 0F, 0F, 7, 7, 4, 0F,-7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // front Left Leg
		leftAnimTrackModel1[36].setRotationPoint(75F, -50F, 30F);

		leftAnimTrackModel1[37].addShapeBox(0F, 0F, 0F, 18, 6, 12, 0F,-6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // front Left Leg
		leftAnimTrackModel1[37].setRotationPoint(56F, -46F, 28F);

		leftAnimTrackModel1[38].addShapeBox(0F, 0F, 0F, 18, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // front Left Leg
		leftAnimTrackModel1[38].setRotationPoint(56F, -40F, 28F);

		leftAnimTrackModel1[39].addShapeBox(0F, 0F, 0F, 18, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // front Left Leg
		leftAnimTrackModel1[39].setRotationPoint(56F, -34F, 28F);

		leftAnimTrackModel1[40].addShapeBox(0F, 0F, 0F, 18, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // front Left Leg
		leftAnimTrackModel1[40].setRotationPoint(77F, -59F, 28F);

		leftAnimTrackModel1[41].addShapeBox(0F, 0F, 0F, 18, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // front Left Leg
		leftAnimTrackModel1[41].setRotationPoint(77F, -53F, 28F);

		leftAnimTrackModel1[42].addShapeBox(0F, 0F, 0F, 16, 5, 12, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // front Left Leg
		leftAnimTrackModel1[42].setRotationPoint(42F, -22F, 32F);

		leftAnimTrackModel1[43].addShapeBox(0F, 0F, 0F, 16, 5, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // front Left Leg
		leftAnimTrackModel1[43].setRotationPoint(42F, -11F, 32F);

		leftAnimTrackModel1[44].addShapeBox(0F, 0F, 0F, 16, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // front Left Leg
		leftAnimTrackModel1[44].setRotationPoint(42F, -17F, 32F);

		leftAnimTrackModel1[45].addShapeBox(0F, 0F, 0F, 8, 5, 24, 0F,-2F, 0F, -10F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, -10F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F); // front Left Leg
		leftAnimTrackModel1[45].setRotationPoint(38F, 2F, 26F);

		leftAnimTrackModel1[46].addShapeBox(0F, 0F, 0F, 8, 5, 24, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // front Left Leg
		leftAnimTrackModel1[46].setRotationPoint(46F, 2F, 26F);

		leftAnimTrackModel1[47].addShapeBox(0F, 0F, 0F, 8, 5, 24, 0F,0F, 0F, -2F, -2F, 0F, -10F, -2F, 0F, -10F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F); // front Left Leg
		leftAnimTrackModel1[47].setRotationPoint(54F, 2F, 26F);

		leftAnimTrackModel1[48].addShapeBox(0F, 0F, 0F, 8, 3, 24, 0F,0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F); // front Left Leg
		leftAnimTrackModel1[48].setRotationPoint(38F, 7F, 26F);

		leftAnimTrackModel1[49].addShapeBox(0F, 0F, 0F, 8, 3, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // front Left Leg
		leftAnimTrackModel1[49].setRotationPoint(46F, 7F, 26F);

		leftAnimTrackModel1[50].addShapeBox(0F, 0F, 0F, 8, 3, 24, 0F,0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F); // front Left Leg
		leftAnimTrackModel1[50].setRotationPoint(54F, 7F, 26F);

		leftAnimTrackModel1[51].addShapeBox(0F, 0F, 0F, 6, 3, 20, 0F,0F, 0F, -3F, -3F, 0F, -8F, -3F, 0F, -8F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F); // front Left Leg
		leftAnimTrackModel1[51].setRotationPoint(54F, -1F, 28F);

		leftAnimTrackModel1[52].addShapeBox(0F, 0F, 0F, 8, 3, 20, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // front Left Leg
		leftAnimTrackModel1[52].setRotationPoint(46F, -1F, 28F);

		leftAnimTrackModel1[53].addShapeBox(0F, 0F, 0F, 6, 3, 20, 0F,-3F, 0F, -8F, 0F, 0F, -3F, 0F, 0F, -3F, -3F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F); // front Left Leg
		leftAnimTrackModel1[53].setRotationPoint(40F, -1F, 28F);

		leftAnimTrackModel1[54].addShapeBox(0F, 0F, 0F, 8, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // front Left Leg
		leftAnimTrackModel1[54].setRotationPoint(46F, -4F, 31F);

		leftAnimTrackModel1[55].addShapeBox(0F, 0F, 0F, 3, 3, 14, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // front Left Leg
		leftAnimTrackModel1[55].setRotationPoint(43F, -4F, 31F);

		leftAnimTrackModel1[56].addShapeBox(0F, 0F, 0F, 3, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // front Left Leg
		leftAnimTrackModel1[56].setRotationPoint(54F, -4F, 31F);

		leftAnimTrackModel1[57].addShapeBox(0F, 0F, 0F, 4, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // front Left Leg
		leftAnimTrackModel1[57].setRotationPoint(45F, -8F, 35F);

		leftAnimTrackModel1[58].addShapeBox(0F, 0F, 0F, 4, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // front Left Leg
		leftAnimTrackModel1[58].setRotationPoint(51F, -8F, 35F);

		leftAnimTrackModel1[59].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F); // front Left Leg
		leftAnimTrackModel1[59].setRotationPoint(34F, 7F, 36F);

		leftAnimTrackModel1[60].addShapeBox(0F, 0F, 0F, 6, 3, 6, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // front Left Leg
		leftAnimTrackModel1[60].setRotationPoint(39F, 7F, 27F);

		leftAnimTrackModel1[61].addShapeBox(0F, 0F, 0F, 6, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // front Left Leg
		leftAnimTrackModel1[61].setRotationPoint(39F, 7F, 43F);

		leftAnimTrackModel1[62].addShapeBox(0F, 0F, 0F, 6, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // front Left Leg
		leftAnimTrackModel1[62].setRotationPoint(55F, 7F, 43F);

		leftAnimTrackModel1[63].addShapeBox(0F, 0F, 0F, 6, 3, 6, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // front Left Leg
		leftAnimTrackModel1[63].setRotationPoint(55F, 7F, 27F);

		leftAnimTrackModel1[64].addShapeBox(0F, 0F, 0F, 2, 2, 17, 0F,0F, 4F, 6F, 0F, 4F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, -4F, 6F, 0F, -4F, 6F, 0F, 0F, 6F, 0F, 0F, 6F); // Mid Left Leg
		leftAnimTrackModel1[64].setRotationPoint(-11F, -36.5F, 26.5F);
		leftAnimTrackModel1[64].rotateAngleX = 0.06981317F;
		leftAnimTrackModel1[64].rotateAngleY = -0.57595865F;

		leftAnimTrackModel1[65].addShapeBox(-8F, 30F, -0.5F, 16, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Mid Left Leg
		leftAnimTrackModel1[65].setRotationPoint(-10F, -66F, 44F);
		leftAnimTrackModel1[65].rotateAngleZ = 0.41887902F;

		leftAnimTrackModel1[66].addShapeBox(0F, 0F, 0F, 4, 3, 8, 0F,0F, 0F, 2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Mid Left Leg
		leftAnimTrackModel1[66].setRotationPoint(28F, 7F, 53F);

		leftAnimTrackModel1[67].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, 0F, 2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // front Left Leg
		leftAnimTrackModel1[67].setRotationPoint(62F, 7F, 36F);

		leftAnimTrackModel1[68].addShapeBox(0F, 0F, 0F, 30, 10, 4, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, -2F, 0F, -1.5F, -2F, 0F, -1.5F, -10F, 0F, 0F, -10F, 0F, 0F, -12F, -2F, 0F, -12F, -2F, 0F); // Mid Left Leg
		leftAnimTrackModel1[68].setRotationPoint(-25F, -63F, 52F);

		leftAnimTrackModel1[69].addShapeBox(0F, 0F, 0F, 30, 10, 4, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, -2F, 0F, -1.5F, -2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Mid Left Leg
		leftAnimTrackModel1[69].setRotationPoint(-25F, -73F, 50.5F);

		leftAnimTrackModel1[70].addShapeBox(0F, 0F, 0F, 30, 10, 4, 0F,-10F, 0F, 1.5F, -10F, 0F, 1.5F, -12F, -2F, -1.5F, -12F, -2F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Mid Left Leg
		leftAnimTrackModel1[70].setRotationPoint(-25F, -83F, 49F);

		leftAnimTrackModel1[71].addShapeBox(0F, 0F, 0F, 6, 22, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F); // Mid Left Leg
		leftAnimTrackModel1[71].setRotationPoint(-13F, -79F, 51.5F);

		leftAnimTrackModel1[72].addShapeBox(0F, 0F, 0F, 14, 4, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // front Left Leg
		leftAnimTrackModel1[72].setRotationPoint(58F, -39F, 27.5F);

		leftAnimTrackModel1[73].addShapeBox(0F, 0F, 0F, 4, 12, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // front Left Leg
		leftAnimTrackModel1[73].setRotationPoint(48F, -20F, 31F);

		leftAnimTrackModel1[74].addShapeBox(0F, 0F, 0F, 18, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Rear Left Leg
		leftAnimTrackModel1[74].setRotationPoint(-76F, -53F, 28F);

		leftAnimTrackModel1[75].addShapeBox(0F, 0F, 0F, 18, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear Left Leg
		leftAnimTrackModel1[75].setRotationPoint(-76F, -59F, 28F);

		leftAnimTrackModel1[76].addShapeBox(0F, 0F, 0F, 18, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Rear Left Leg
		leftAnimTrackModel1[76].setRotationPoint(-97F, -34F, 28F);

		leftAnimTrackModel1[77].addShapeBox(0F, 0F, 0F, 18, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear Left Leg
		leftAnimTrackModel1[77].setRotationPoint(-97F, -40F, 28F);

		leftAnimTrackModel1[78].addShapeBox(0F, 0F, 0F, 18, 6, 12, 0F,-6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear Left Leg
		leftAnimTrackModel1[78].setRotationPoint(-97F, -46F, 28F);

		leftAnimTrackModel1[79].addShapeBox(0F, 0F, 0F, 6, 6, 4, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F); // Rear Left Leg
		leftAnimTrackModel1[79].setRotationPoint(-100F, -40F, 34F);

		leftAnimTrackModel1[80].addShapeBox(0F, 0F, 0F, 9, 8, 4, 0F,0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, 13F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 13F, 0F); // Rear Left Leg
		leftAnimTrackModel1[80].setRotationPoint(-109F, -37F, 34F);

		leftAnimTrackModel1[81].addShapeBox(0F, 0F, 0F, 15, 9, 4, 0F,0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F); // Rear Left Leg
		leftAnimTrackModel1[81].setRotationPoint(-107F, -29F, 34F);

		leftAnimTrackModel1[82].addShapeBox(0F, 0F, 0F, 6, 9, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Rear Left Leg
		leftAnimTrackModel1[82].setRotationPoint(-92F, -29F, 34F);

		leftAnimTrackModel1[83].addShapeBox(0F, 0F, 0F, 16, 5, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Rear Left Leg
		leftAnimTrackModel1[83].setRotationPoint(-112F, -11F, 32F);

		leftAnimTrackModel1[84].addShapeBox(0F, 0F, 0F, 16, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear Left Leg
		leftAnimTrackModel1[84].setRotationPoint(-112F, -17F, 32F);

		leftAnimTrackModel1[85].addShapeBox(0F, 0F, 0F, 16, 5, 12, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear Left Leg
		leftAnimTrackModel1[85].setRotationPoint(-112F, -22F, 32F);

		leftAnimTrackModel1[86].addShapeBox(0F, 0F, 0F, 4, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear Left Leg
		leftAnimTrackModel1[86].setRotationPoint(-103F, -8F, 35F);

		leftAnimTrackModel1[87].addShapeBox(0F, 0F, 0F, 4, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear Left Leg
		leftAnimTrackModel1[87].setRotationPoint(-109F, -8F, 35F);

		leftAnimTrackModel1[88].addShapeBox(0F, 0F, 0F, 3, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Rear Left Leg
		leftAnimTrackModel1[88].setRotationPoint(-100F, -4F, 31F);

		leftAnimTrackModel1[89].addShapeBox(0F, 0F, 0F, 6, 3, 20, 0F,-3F, 0F, -8F, 0F, 0F, -3F, 0F, 0F, -3F, -3F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F); // Rear Left Leg
		leftAnimTrackModel1[89].setRotationPoint(-114F, -1F, 28F);

		leftAnimTrackModel1[90].addShapeBox(0F, 0F, 0F, 3, 3, 14, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Rear Left Leg
		leftAnimTrackModel1[90].setRotationPoint(-111F, -4F, 31F);

		leftAnimTrackModel1[91].addShapeBox(0F, 0F, 0F, 8, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear Left Leg
		leftAnimTrackModel1[91].setRotationPoint(-108F, -4F, 31F);

		leftAnimTrackModel1[92].addShapeBox(0F, 0F, 0F, 8, 3, 20, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear Left Leg
		leftAnimTrackModel1[92].setRotationPoint(-108F, -1F, 28F);

		leftAnimTrackModel1[93].addShapeBox(0F, 0F, 0F, 8, 5, 24, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear Left Leg
		leftAnimTrackModel1[93].setRotationPoint(-108F, 2F, 26F);

		leftAnimTrackModel1[94].addShapeBox(0F, 0F, 0F, 8, 5, 24, 0F,-2F, 0F, -10F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, -10F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F); // Rear Left Leg
		leftAnimTrackModel1[94].setRotationPoint(-116F, 2F, 26F);

		leftAnimTrackModel1[95].addShapeBox(0F, 0F, 0F, 6, 3, 20, 0F,0F, 0F, -3F, -3F, 0F, -8F, -3F, 0F, -8F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F); // Rear Left Leg
		leftAnimTrackModel1[95].setRotationPoint(-100F, -1F, 28F);

		leftAnimTrackModel1[96].addShapeBox(0F, 0F, 0F, 8, 5, 24, 0F,0F, 0F, -2F, -2F, 0F, -10F, -2F, 0F, -10F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F); // Rear Left Leg
		leftAnimTrackModel1[96].setRotationPoint(-100F, 2F, 26F);

		leftAnimTrackModel1[97].addShapeBox(0F, 0F, 0F, 6, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear Left Leg
		leftAnimTrackModel1[97].setRotationPoint(-115F, 7F, 43F);

		leftAnimTrackModel1[98].addShapeBox(0F, 0F, 0F, 8, 3, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear Left Leg
		leftAnimTrackModel1[98].setRotationPoint(-108F, 7F, 26F);

		leftAnimTrackModel1[99].addShapeBox(0F, 0F, 0F, 6, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear Left Leg
		leftAnimTrackModel1[99].setRotationPoint(-99F, 7F, 43F);

		leftAnimTrackModel1[100].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F); // Rear Left Leg
		leftAnimTrackModel1[100].setRotationPoint(-120F, 7F, 36F);

		leftAnimTrackModel1[101].addShapeBox(0F, 0F, 0F, 8, 3, 24, 0F,0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F); // Rear Left Leg
		leftAnimTrackModel1[101].setRotationPoint(-100F, 7F, 26F);

		leftAnimTrackModel1[102].addShapeBox(0F, 0F, 0F, 8, 3, 24, 0F,0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F); // Rear Left Leg
		leftAnimTrackModel1[102].setRotationPoint(-116F, 7F, 26F);

		leftAnimTrackModel1[103].addShapeBox(0F, 0F, 0F, 6, 3, 6, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear Left Leg
		leftAnimTrackModel1[103].setRotationPoint(-99F, 7F, 27F);

		leftAnimTrackModel1[104].addShapeBox(0F, 0F, 0F, 6, 3, 6, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear Left Leg
		leftAnimTrackModel1[104].setRotationPoint(-115F, 7F, 27F);

		leftAnimTrackModel1[105].addShapeBox(0F, 0F, 0F, 5, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F); // Rear Left Leg
		leftAnimTrackModel1[105].setRotationPoint(-79F, -43F, 30F);

		leftAnimTrackModel1[106].addShapeBox(0F, 0F, 0F, 7, 7, 4, 0F,-7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear Left Leg
		leftAnimTrackModel1[106].setRotationPoint(-79F, -50F, 30F);

		leftAnimTrackModel1[107].addShapeBox(0F, 0F, 0F, 5, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F); // Rear Left Leg
		leftAnimTrackModel1[107].setRotationPoint(-82F, -49F, 30F);

		leftAnimTrackModel1[108].addShapeBox(0F, 0F, 0F, 7, 7, 4, 0F,-7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear Left Leg
		leftAnimTrackModel1[108].setRotationPoint(-84F, -56F, 30F);

		leftAnimTrackModel1[109].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, 0F, 2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Rear Left Leg
		leftAnimTrackModel1[109].setRotationPoint(-92F, 7F, 36F);

		leftAnimTrackModel1[110].addShapeBox(0F, 0F, 0F, 14, 4, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear Left Leg
		leftAnimTrackModel1[110].setRotationPoint(-95F, -39F, 27.5F);

		leftAnimTrackModel1[111].addShapeBox(0F, 0F, 0F, 4, 12, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear Left Leg
		leftAnimTrackModel1[111].setRotationPoint(-106F, -20F, 31F);

		leftAnimTrackModel1[112].addShapeBox(0F, 0F, 0F, 6, 9, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Box 455
		leftAnimTrackModel1[112].setRotationPoint(62F, -29F, 34F);

		leftAnimTrackModel1[113].addShapeBox(0F, 0F, 0F, 15, 9, 4, 0F,0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F); // Box 456
		leftAnimTrackModel1[113].setRotationPoint(47F, -29F, 34F);

		leftAnimTrackModel1[114].addShapeBox(0F, 0F, 0F, 6, 6, 4, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F); // Box 457
		leftAnimTrackModel1[114].setRotationPoint(54F, -40F, 34F);

		leftAnimTrackModel1[115].addShapeBox(0F, 0F, 0F, 9, 8, 4, 0F,0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, 13F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 13F, 0F); // Box 458
		leftAnimTrackModel1[115].setRotationPoint(45F, -37F, 34F);
		
		
		
	} 
	
	private void initleftAnimTrackModel2_0()
	{
		leftAnimTrackModel2[0] = new ModelRendererTurbo(this, 537, 273, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel2[1] = new ModelRendererTurbo(this, 993, 57, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel2[2] = new ModelRendererTurbo(this, 897, 257, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel2[3] = new ModelRendererTurbo(this, 473, 89, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel2[4] = new ModelRendererTurbo(this, 481, 273, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel2[5] = new ModelRendererTurbo(this, 953, 273, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel2[6] = new ModelRendererTurbo(this, 809, 281, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel2[7] = new ModelRendererTurbo(this, 953, 297, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel2[8] = new ModelRendererTurbo(this, 161, 321, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel2[9] = new ModelRendererTurbo(this, 241, 321, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel2[10] = new ModelRendererTurbo(this, 833, 321, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel2[11] = new ModelRendererTurbo(this, 873, 329, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel2[12] = new ModelRendererTurbo(this, 281, 353, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel2[13] = new ModelRendererTurbo(this, 393, 353, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel2[14] = new ModelRendererTurbo(this, 505, 321, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel2[15] = new ModelRendererTurbo(this, 937, 329, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel2[16] = new ModelRendererTurbo(this, 1, 353, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel2[17] = new ModelRendererTurbo(this, 521, 177, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel2[18] = new ModelRendererTurbo(this, 337, 113, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel2[19] = new ModelRendererTurbo(this, 689, 129, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel2[20] = new ModelRendererTurbo(this, 937, 57, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel2[21] = new ModelRendererTurbo(this, 801, 65, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel2[22] = new ModelRendererTurbo(this, 625, 353, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel2[23] = new ModelRendererTurbo(this, 721, 353, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel2[24] = new ModelRendererTurbo(this, 257, 161, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel2[25] = new ModelRendererTurbo(this, 753, 129, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel2[26] = new ModelRendererTurbo(this, 993, 129, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel2[27] = new ModelRendererTurbo(this, 985, 145, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel2[28] = new ModelRendererTurbo(this, 753, 169, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel2[29] = new ModelRendererTurbo(this, 369, 201, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel2[30] = new ModelRendererTurbo(this, 137, 217, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel2[31] = new ModelRendererTurbo(this, 217, 217, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel2[32] = new ModelRendererTurbo(this, 593, 57, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel2[33] = new ModelRendererTurbo(this, 1001, 113, textureX, textureY); // front Left Leg
		leftAnimTrackModel2[34] = new ModelRendererTurbo(this, 153, 113, textureX, textureY); // front Left Leg
		leftAnimTrackModel2[35] = new ModelRendererTurbo(this, 561, 121, textureX, textureY); // front Left Leg
		leftAnimTrackModel2[36] = new ModelRendererTurbo(this, 41, 145, textureX, textureY); // front Left Leg
		leftAnimTrackModel2[37] = new ModelRendererTurbo(this, 257, 361, textureX, textureY); // front Left Leg
		leftAnimTrackModel2[38] = new ModelRendererTurbo(this, 905, 393, textureX, textureY); // front Left Leg
		leftAnimTrackModel2[39] = new ModelRendererTurbo(this, 281, 401, textureX, textureY); // front Left Leg
		leftAnimTrackModel2[40] = new ModelRendererTurbo(this, 289, 321, textureX, textureY); // front Left Leg
		leftAnimTrackModel2[41] = new ModelRendererTurbo(this, 969, 393, textureX, textureY); // front Left Leg
		leftAnimTrackModel2[42] = new ModelRendererTurbo(this, 345, 401, textureX, textureY); // front Left Leg
		leftAnimTrackModel2[43] = new ModelRendererTurbo(this, 409, 401, textureX, textureY); // front Left Leg
		leftAnimTrackModel2[44] = new ModelRendererTurbo(this, 473, 401, textureX, textureY); // front Left Leg
		leftAnimTrackModel2[45] = new ModelRendererTurbo(this, 745, 393, textureX, textureY); // front Left Leg
		leftAnimTrackModel2[46] = new ModelRendererTurbo(this, 137, 409, textureX, textureY); // front Left Leg
		leftAnimTrackModel2[47] = new ModelRendererTurbo(this, 209, 409, textureX, textureY); // front Left Leg
		leftAnimTrackModel2[48] = new ModelRendererTurbo(this, 513, 409, textureX, textureY); // front Left Leg
		leftAnimTrackModel2[49] = new ModelRendererTurbo(this, 945, 409, textureX, textureY); // front Left Leg
		leftAnimTrackModel2[50] = new ModelRendererTurbo(this, 1, 417, textureX, textureY); // front Left Leg
		leftAnimTrackModel2[51] = new ModelRendererTurbo(this, 561, 409, textureX, textureY); // front Left Leg
		leftAnimTrackModel2[52] = new ModelRendererTurbo(this, 793, 409, textureX, textureY); // front Left Leg
		leftAnimTrackModel2[53] = new ModelRendererTurbo(this, 601, 417, textureX, textureY); // front Left Leg
		leftAnimTrackModel2[54] = new ModelRendererTurbo(this, 185, 409, textureX, textureY); // front Left Leg
		leftAnimTrackModel2[55] = new ModelRendererTurbo(this, 497, 313, textureX, textureY); // front Left Leg
		leftAnimTrackModel2[56] = new ModelRendererTurbo(this, 985, 321, textureX, textureY); // front Left Leg
		leftAnimTrackModel2[57] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // front Left Leg
		leftAnimTrackModel2[58] = new ModelRendererTurbo(this, 753, 201, textureX, textureY); // front Left Leg
		leftAnimTrackModel2[59] = new ModelRendererTurbo(this, 1001, 49, textureX, textureY); // front Left Leg
		leftAnimTrackModel2[60] = new ModelRendererTurbo(this, 57, 241, textureX, textureY); // front Left Leg
		leftAnimTrackModel2[61] = new ModelRendererTurbo(this, 321, 281, textureX, textureY); // front Left Leg
		leftAnimTrackModel2[62] = new ModelRendererTurbo(this, 593, 305, textureX, textureY); // front Left Leg
		leftAnimTrackModel2[63] = new ModelRendererTurbo(this, 809, 305, textureX, textureY); // front Left Leg
		leftAnimTrackModel2[64] = new ModelRendererTurbo(this, 729, 505, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel2[65] = new ModelRendererTurbo(this, 753, 145, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel2[66] = new ModelRendererTurbo(this, 49, 401, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel2[67] = new ModelRendererTurbo(this, 281, 121, textureX, textureY); // front Left Leg
		leftAnimTrackModel2[68] = new ModelRendererTurbo(this, 1, 585, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel2[69] = new ModelRendererTurbo(this, 585, 585, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel2[70] = new ModelRendererTurbo(this, 881, 585, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel2[71] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel2[72] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // front Left Leg
		leftAnimTrackModel2[73] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // front Left Leg
		leftAnimTrackModel2[74] = new ModelRendererTurbo(this, 1, 449, textureX, textureY); // Rear Left Leg
		leftAnimTrackModel2[75] = new ModelRendererTurbo(this, 249, 449, textureX, textureY); // Rear Left Leg
		leftAnimTrackModel2[76] = new ModelRendererTurbo(this, 305, 449, textureX, textureY); // Rear Left Leg
		leftAnimTrackModel2[77] = new ModelRendererTurbo(this, 369, 449, textureX, textureY); // Rear Left Leg
		leftAnimTrackModel2[78] = new ModelRendererTurbo(this, 857, 449, textureX, textureY); // Rear Left Leg
		leftAnimTrackModel2[79] = new ModelRendererTurbo(this, 49, 457, textureX, textureY); // Rear Left Leg
		leftAnimTrackModel2[80] = new ModelRendererTurbo(this, 425, 457, textureX, textureY); // Rear Left Leg
		leftAnimTrackModel2[81] = new ModelRendererTurbo(this, 545, 457, textureX, textureY); // Rear Left Leg
		leftAnimTrackModel2[82] = new ModelRendererTurbo(this, 409, 353, textureX, textureY); // Rear Left Leg
		leftAnimTrackModel2[83] = new ModelRendererTurbo(this, 553, 361, textureX, textureY); // Rear Left Leg
		leftAnimTrackModel2[84] = new ModelRendererTurbo(this, 705, 433, textureX, textureY); // Rear Left Leg
		leftAnimTrackModel2[85] = new ModelRendererTurbo(this, 601, 441, textureX, textureY); // Rear Left Leg
		leftAnimTrackModel2[86] = new ModelRendererTurbo(this, 177, 441, textureX, textureY); // Rear Left Leg
		leftAnimTrackModel2[87] = new ModelRendererTurbo(this, 977, 441, textureX, textureY); // Rear Left Leg
		leftAnimTrackModel2[88] = new ModelRendererTurbo(this, 721, 449, textureX, textureY); // Rear Left Leg
		leftAnimTrackModel2[89] = new ModelRendererTurbo(this, 1, 465, textureX, textureY); // Rear Left Leg
		leftAnimTrackModel2[90] = new ModelRendererTurbo(this, 249, 465, textureX, textureY); // Rear Left Leg
		leftAnimTrackModel2[91] = new ModelRendererTurbo(this, 89, 457, textureX, textureY); // Rear Left Leg
		leftAnimTrackModel2[92] = new ModelRendererTurbo(this, 585, 465, textureX, textureY); // Rear Left Leg
		leftAnimTrackModel2[93] = new ModelRendererTurbo(this, 841, 361, textureX, textureY); // Rear Left Leg
		leftAnimTrackModel2[94] = new ModelRendererTurbo(this, 657, 465, textureX, textureY); // Rear Left Leg
		leftAnimTrackModel2[95] = new ModelRendererTurbo(this, 1, 369, textureX, textureY); // Rear Left Leg
		leftAnimTrackModel2[96] = new ModelRendererTurbo(this, 657, 89, textureX, textureY); // Rear Left Leg
		leftAnimTrackModel2[97] = new ModelRendererTurbo(this, 761, 465, textureX, textureY); // Rear Left Leg
		leftAnimTrackModel2[98] = new ModelRendererTurbo(this, 121, 473, textureX, textureY); // Rear Left Leg
		leftAnimTrackModel2[99] = new ModelRendererTurbo(this, 353, 377, textureX, textureY); // Rear Left Leg
		leftAnimTrackModel2[100] = new ModelRendererTurbo(this, 385, 377, textureX, textureY); // Rear Left Leg
		leftAnimTrackModel2[101] = new ModelRendererTurbo(this, 353, 153, textureX, textureY); // Rear Left Leg
		leftAnimTrackModel2[102] = new ModelRendererTurbo(this, 1001, 361, textureX, textureY); // Rear Left Leg
		leftAnimTrackModel2[103] = new ModelRendererTurbo(this, 233, 241, textureX, textureY); // Rear Left Leg
		leftAnimTrackModel2[104] = new ModelRendererTurbo(this, 465, 377, textureX, textureY); // Rear Left Leg
		leftAnimTrackModel2[105] = new ModelRendererTurbo(this, 793, 113, textureX, textureY); // Rear Left Leg
		leftAnimTrackModel2[106] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Rear Left Leg
		leftAnimTrackModel2[107] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Rear Left Leg
		leftAnimTrackModel2[108] = new ModelRendererTurbo(this, 993, 57, textureX, textureY); // Box 455
		leftAnimTrackModel2[109] = new ModelRendererTurbo(this, 897, 257, textureX, textureY); // Box 456
		leftAnimTrackModel2[110] = new ModelRendererTurbo(this, 897, 257, textureX, textureY); // Box 457
		leftAnimTrackModel2[111] = new ModelRendererTurbo(this, 993, 57, textureX, textureY); // Box 458
		leftAnimTrackModel2[112] = new ModelRendererTurbo(this, 993, 57, textureX, textureY); // Box 459
		leftAnimTrackModel2[113] = new ModelRendererTurbo(this, 897, 257, textureX, textureY); // Box 460
		leftAnimTrackModel2[114] = new ModelRendererTurbo(this, 897, 257, textureX, textureY); // Box 461
		leftAnimTrackModel2[115] = new ModelRendererTurbo(this, 993, 57, textureX, textureY); // Box 462

		leftAnimTrackModel2[0].addShapeBox(0F, 0F, 0F, 30, 10, 16, 0F,-10F, 0F, 1.5F, -10F, 0F, 1.5F, -10F, 0F, -1.5F, -10F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Mid Left Leg
		leftAnimTrackModel2[0].setRotationPoint(-25F, -82F, 33F);

		leftAnimTrackModel2[1].addShapeBox(0F, 0F, 0F, 11, 12, 4, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Mid Left Leg
		leftAnimTrackModel2[1].setRotationPoint(-24F, -59F, 42F);

		leftAnimTrackModel2[2].addShapeBox(0F, 0F, 0F, 11, 27, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, -5F, 0F, 3F); // Mid Left Leg
		leftAnimTrackModel2[2].setRotationPoint(-24F, -47F, 44F);

		leftAnimTrackModel2[3].addShapeBox(0F, 0F, 0F, 11, 12, 4, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Mid Left Leg
		leftAnimTrackModel2[3].setRotationPoint(-7F, -59F, 42F);

		leftAnimTrackModel2[4].addShapeBox(0F, 0F, 0F, 11, 27, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -5F, 0F, -3F, -5F, 0F, 3F, 0F, 0F, 3F); // Mid Left Leg
		leftAnimTrackModel2[4].setRotationPoint(-7F, -47F, 44F);

		leftAnimTrackModel2[5].addShapeBox(0F, 0F, 0F, 20, 6, 12, 0F,-6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Mid Left Leg
		leftAnimTrackModel2[5].setRotationPoint(-20F, -28F, 51F);

		leftAnimTrackModel2[6].addShapeBox(0F, 0F, 0F, 20, 8, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Mid Left Leg
		leftAnimTrackModel2[6].setRotationPoint(-20F, -22F, 51F);

		leftAnimTrackModel2[7].addShapeBox(0F, 0F, 0F, 20, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Mid Left Leg
		leftAnimTrackModel2[7].setRotationPoint(-20F, -14F, 51F);

		leftAnimTrackModel2[8].addShapeBox(0F, 0F, 0F, 10, 8, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F); // Mid Left Leg
		leftAnimTrackModel2[8].setRotationPoint(-16F, 0F, 43F);

		leftAnimTrackModel2[9].addShapeBox(0F, 0F, 0F, 9, 8, 28, 0F,0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 5F, 0F, -8F, 0F, 0F, 5F, 0F, 0F, 5F, 5F, 0F, -8F); // Mid Left Leg
		leftAnimTrackModel2[9].setRotationPoint(-25F, 0F, 43F);

		leftAnimTrackModel2[10].addShapeBox(0F, 0F, 0F, 9, 8, 28, 0F,0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 5F, 5F, 0F, -8F, 5F, 0F, -8F, 0F, 0F, 5F); // Mid Left Leg
		leftAnimTrackModel2[10].setRotationPoint(-6F, 0F, 43F);

		leftAnimTrackModel2[11].addShapeBox(0F, 0F, 0F, 10, 3, 38, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Mid Left Leg
		leftAnimTrackModel2[11].setRotationPoint(-16F, 8F, 38F);

		leftAnimTrackModel2[12].addShapeBox(0F, 0F, 0F, 14, 3, 38, 0F,0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F); // Mid Left Leg
		leftAnimTrackModel2[12].setRotationPoint(-6F, 8F, 38F);

		leftAnimTrackModel2[13].addShapeBox(0F, 0F, 0F, 14, 3, 38, 0F,0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F); // Mid Left Leg
		leftAnimTrackModel2[13].setRotationPoint(-30F, 8F, 38F);

		leftAnimTrackModel2[14].addShapeBox(0F, 0F, 0F, 10, 3, 28, 0F,0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Mid Left Leg
		leftAnimTrackModel2[14].setRotationPoint(-16F, -3F, 43F);

		leftAnimTrackModel2[15].addShapeBox(0F, 0F, 0F, 9, 3, 28, 0F,0F, 0F, -8F, -5F, 0F, -12F, -5F, 0F, -12F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F); // Mid Left Leg
		leftAnimTrackModel2[15].setRotationPoint(-6F, -3F, 43F);

		leftAnimTrackModel2[16].addShapeBox(0F, 0F, 0F, 9, 3, 28, 0F,-5F, 0F, -12F, 0F, 0F, -8F, 0F, 0F, -8F, -5F, 0F, -12F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F); // Mid Left Leg
		leftAnimTrackModel2[16].setRotationPoint(-25F, -3F, 43F);

		leftAnimTrackModel2[17].addShapeBox(0F, 0F, 0F, 10, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Mid Left Leg
		leftAnimTrackModel2[17].setRotationPoint(-16F, -6F, 51F);

		leftAnimTrackModel2[18].addShapeBox(0F, 0F, 0F, 4, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Mid Left Leg
		leftAnimTrackModel2[18].setRotationPoint(-6F, -6F, 51F);

		leftAnimTrackModel2[19].addShapeBox(0F, 0F, 0F, 4, 3, 12, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Mid Left Leg
		leftAnimTrackModel2[19].setRotationPoint(-20F, -6F, 51F);

		leftAnimTrackModel2[20].addShapeBox(0F, 0F, 0F, 4, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Mid Left Leg
		leftAnimTrackModel2[20].setRotationPoint(-19F, -14F, 55F);

		leftAnimTrackModel2[21].addShapeBox(0F, 0F, 0F, 4, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Mid Left Leg
		leftAnimTrackModel2[21].setRotationPoint(-7F, -14F, 55F);

		leftAnimTrackModel2[22].addShapeBox(0F, 0F, 0F, 30, 10, 16, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Mid Left Leg
		leftAnimTrackModel2[22].setRotationPoint(-25F, -72F, 34.5F);

		leftAnimTrackModel2[23].addShapeBox(0F, 0F, 0F, 30, 10, 16, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F); // Mid Left Leg
		leftAnimTrackModel2[23].setRotationPoint(-25F, -62F, 36F);

		leftAnimTrackModel2[24].addShapeBox(0F, 0F, 0F, 22, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Mid Left Leg
		leftAnimTrackModel2[24].setRotationPoint(-21F, -22F, 46.5F);

		leftAnimTrackModel2[25].addShapeBox(0F, 0F, 0F, 8, 2, 7, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Mid Left Leg
		leftAnimTrackModel2[25].setRotationPoint(-14F, -24F, 44.5F);

		leftAnimTrackModel2[26].addShapeBox(0F, 0F, 0F, 8, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Mid Left Leg
		leftAnimTrackModel2[26].setRotationPoint(-14F, -18F, 44.5F);

		leftAnimTrackModel2[27].addShapeBox(0F, 0F, 0F, 8, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Mid Left Leg
		leftAnimTrackModel2[27].setRotationPoint(-14F, -22F, 44.5F);

		leftAnimTrackModel2[28].addShapeBox(0F, 0F, 0F, 8, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Mid Left Leg
		leftAnimTrackModel2[28].setRotationPoint(-27F, 8F, 65F);

		leftAnimTrackModel2[29].addShapeBox(0F, 0F, 0F, 8, 3, 8, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Mid Left Leg
		leftAnimTrackModel2[29].setRotationPoint(-27F, 8F, 41F);

		leftAnimTrackModel2[30].addShapeBox(0F, 0F, 0F, 8, 3, 8, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Mid Left Leg
		leftAnimTrackModel2[30].setRotationPoint(-3F, 8F, 41F);

		leftAnimTrackModel2[31].addShapeBox(0F, 0F, 0F, 8, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Mid Left Leg
		leftAnimTrackModel2[31].setRotationPoint(-3F, 8F, 65F);

		leftAnimTrackModel2[32].addShapeBox(0F, 0F, 0F, 4, 3, 8, 0F,0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F); // Mid Left Leg
		leftAnimTrackModel2[32].setRotationPoint(-34F, 8F, 53F);

		leftAnimTrackModel2[33].addShapeBox(0F, 0F, 0F, 7, 7, 4, 0F,-7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // front Left Leg
		leftAnimTrackModel2[33].setRotationPoint(70F, -58F, 30F);
		leftAnimTrackModel2[33].rotateAngleZ = -0.29670597F;

		leftAnimTrackModel2[34].addShapeBox(0F, 7F, 0F, 5, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F); // front Left Leg
		leftAnimTrackModel2[34].setRotationPoint(72F, -58F, 30F);
		leftAnimTrackModel2[34].rotateAngleZ = -0.29670597F;

		leftAnimTrackModel2[35].addShapeBox(0F, 7F, 0F, 5, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F); // front Left Leg
		leftAnimTrackModel2[35].setRotationPoint(75F, -52F, 30F);
		leftAnimTrackModel2[35].rotateAngleZ = -0.29670597F;

		leftAnimTrackModel2[36].addShapeBox(0F, 0F, 0F, 7, 7, 4, 0F,-7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // front Left Leg
		leftAnimTrackModel2[36].setRotationPoint(75F, -52F, 30F);
		leftAnimTrackModel2[36].rotateAngleZ = -0.29670597F;

		leftAnimTrackModel2[37].addShapeBox(0F, 0F, 0F, 18, 6, 12, 0F,-6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // front Left Leg
		leftAnimTrackModel2[37].setRotationPoint(56F, -53F, 28F);

		leftAnimTrackModel2[38].addShapeBox(0F, 0F, 0F, 18, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // front Left Leg
		leftAnimTrackModel2[38].setRotationPoint(56F, -47F, 28F);

		leftAnimTrackModel2[39].addShapeBox(0F, 0F, 0F, 18, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // front Left Leg
		leftAnimTrackModel2[39].setRotationPoint(56F, -41F, 28F);

		leftAnimTrackModel2[40].addShapeBox(0F, 0F, 0F, 18, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // front Left Leg
		leftAnimTrackModel2[40].setRotationPoint(77F, -59F, 28F);

		leftAnimTrackModel2[41].addShapeBox(0F, 0F, 0F, 18, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // front Left Leg
		leftAnimTrackModel2[41].setRotationPoint(77F, -53F, 28F);

		leftAnimTrackModel2[42].addShapeBox(0F, 0F, 0F, 16, 5, 12, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // front Left Leg
		leftAnimTrackModel2[42].setRotationPoint(58F, -22F, 32F);

		leftAnimTrackModel2[43].addShapeBox(0F, 0F, 0F, 16, 5, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // front Left Leg
		leftAnimTrackModel2[43].setRotationPoint(58F, -11F, 32F);

		leftAnimTrackModel2[44].addShapeBox(0F, 0F, 0F, 16, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // front Left Leg
		leftAnimTrackModel2[44].setRotationPoint(58F, -17F, 32F);

		leftAnimTrackModel2[45].addShapeBox(0F, 0F, 0F, 8, 5, 24, 0F,-2F, 0F, -10F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, -10F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F); // front Left Leg
		leftAnimTrackModel2[45].setRotationPoint(54F, 2F, 26F);

		leftAnimTrackModel2[46].addShapeBox(0F, 0F, 0F, 8, 5, 24, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // front Left Leg
		leftAnimTrackModel2[46].setRotationPoint(62F, 2F, 26F);

		leftAnimTrackModel2[47].addShapeBox(0F, 0F, 0F, 8, 5, 24, 0F,0F, 0F, -2F, -2F, 0F, -10F, -2F, 0F, -10F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F); // front Left Leg
		leftAnimTrackModel2[47].setRotationPoint(70F, 2F, 26F);

		leftAnimTrackModel2[48].addShapeBox(0F, 0F, 0F, 8, 3, 24, 0F,0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F); // front Left Leg
		leftAnimTrackModel2[48].setRotationPoint(54F, 7F, 26F);

		leftAnimTrackModel2[49].addShapeBox(0F, 0F, 0F, 8, 3, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // front Left Leg
		leftAnimTrackModel2[49].setRotationPoint(62F, 7F, 26F);

		leftAnimTrackModel2[50].addShapeBox(0F, 0F, 0F, 8, 3, 24, 0F,0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F); // front Left Leg
		leftAnimTrackModel2[50].setRotationPoint(70F, 7F, 26F);

		leftAnimTrackModel2[51].addShapeBox(0F, 0F, 0F, 6, 3, 20, 0F,0F, 0F, -3F, -3F, 0F, -8F, -3F, 0F, -8F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F); // front Left Leg
		leftAnimTrackModel2[51].setRotationPoint(70F, -1F, 28F);

		leftAnimTrackModel2[52].addShapeBox(0F, 0F, 0F, 8, 3, 20, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // front Left Leg
		leftAnimTrackModel2[52].setRotationPoint(62F, -1F, 28F);

		leftAnimTrackModel2[53].addShapeBox(0F, 0F, 0F, 6, 3, 20, 0F,-3F, 0F, -8F, 0F, 0F, -3F, 0F, 0F, -3F, -3F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F); // front Left Leg
		leftAnimTrackModel2[53].setRotationPoint(56F, -1F, 28F);

		leftAnimTrackModel2[54].addShapeBox(0F, 0F, 0F, 8, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // front Left Leg
		leftAnimTrackModel2[54].setRotationPoint(62F, -4F, 31F);

		leftAnimTrackModel2[55].addShapeBox(0F, 0F, 0F, 3, 3, 14, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // front Left Leg
		leftAnimTrackModel2[55].setRotationPoint(59F, -4F, 31F);

		leftAnimTrackModel2[56].addShapeBox(0F, 0F, 0F, 3, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // front Left Leg
		leftAnimTrackModel2[56].setRotationPoint(70F, -4F, 31F);

		leftAnimTrackModel2[57].addShapeBox(0F, 0F, 0F, 4, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // front Left Leg
		leftAnimTrackModel2[57].setRotationPoint(61F, -8F, 35F);

		leftAnimTrackModel2[58].addShapeBox(0F, 0F, 0F, 4, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // front Left Leg
		leftAnimTrackModel2[58].setRotationPoint(67F, -8F, 35F);

		leftAnimTrackModel2[59].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F); // front Left Leg
		leftAnimTrackModel2[59].setRotationPoint(50F, 7F, 36F);

		leftAnimTrackModel2[60].addShapeBox(0F, 0F, 0F, 6, 3, 6, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // front Left Leg
		leftAnimTrackModel2[60].setRotationPoint(55F, 7F, 27F);

		leftAnimTrackModel2[61].addShapeBox(0F, 0F, 0F, 6, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // front Left Leg
		leftAnimTrackModel2[61].setRotationPoint(55F, 7F, 43F);

		leftAnimTrackModel2[62].addShapeBox(0F, 0F, 0F, 6, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // front Left Leg
		leftAnimTrackModel2[62].setRotationPoint(71F, 7F, 43F);

		leftAnimTrackModel2[63].addShapeBox(0F, 0F, 0F, 6, 3, 6, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // front Left Leg
		leftAnimTrackModel2[63].setRotationPoint(71F, 7F, 27F);

		leftAnimTrackModel2[64].addShapeBox(0F, 0F, 0F, 2, 2, 17, 0F,0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Mid Left Leg
		leftAnimTrackModel2[64].setRotationPoint(-11F, -36.5F, 26.5F);
		leftAnimTrackModel2[64].rotateAngleX = -0.03490659F;

		leftAnimTrackModel2[65].addShapeBox(0F, 0F, 0F, 16, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Mid Left Leg
		leftAnimTrackModel2[65].setRotationPoint(-18F, -36F, 43.5F);

		leftAnimTrackModel2[66].addShapeBox(0F, 0F, 0F, 4, 3, 8, 0F,0F, 0F, 2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Mid Left Leg
		leftAnimTrackModel2[66].setRotationPoint(8F, 8F, 53F);

		leftAnimTrackModel2[67].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, 0F, 2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // front Left Leg
		leftAnimTrackModel2[67].setRotationPoint(78F, 7F, 36F);

		leftAnimTrackModel2[68].addShapeBox(0F, 0F, 0F, 30, 10, 4, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, -2F, 0F, -1.5F, -2F, 0F, -1.5F, -10F, 0F, 0F, -10F, 0F, 0F, -12F, -2F, 0F, -12F, -2F, 0F); // Mid Left Leg
		leftAnimTrackModel2[68].setRotationPoint(-25F, -62F, 52F);

		leftAnimTrackModel2[69].addShapeBox(0F, 0F, 0F, 30, 10, 4, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, -2F, 0F, -1.5F, -2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Mid Left Leg
		leftAnimTrackModel2[69].setRotationPoint(-25F, -72F, 50.5F);

		leftAnimTrackModel2[70].addShapeBox(0F, 0F, 0F, 30, 10, 4, 0F,-10F, 0F, 1.5F, -10F, 0F, 1.5F, -12F, -2F, -1.5F, -12F, -2F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Mid Left Leg
		leftAnimTrackModel2[70].setRotationPoint(-25F, -82F, 49F);

		leftAnimTrackModel2[71].addShapeBox(0F, 0F, 0F, 6, 22, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F); // Mid Left Leg
		leftAnimTrackModel2[71].setRotationPoint(-13F, -78F, 51.5F);

		leftAnimTrackModel2[72].addShapeBox(0F, 0F, 0F, 14, 4, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // front Left Leg
		leftAnimTrackModel2[72].setRotationPoint(58F, -46F, 27.5F);

		leftAnimTrackModel2[73].addShapeBox(0F, 0F, 0F, 4, 12, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // front Left Leg
		leftAnimTrackModel2[73].setRotationPoint(64F, -20F, 31F);

		leftAnimTrackModel2[74].addShapeBox(0F, 0F, 0F, 18, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Rear Left Leg
		leftAnimTrackModel2[74].setRotationPoint(-76F, -53F, 28F);

		leftAnimTrackModel2[75].addShapeBox(0F, 0F, 0F, 18, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear Left Leg
		leftAnimTrackModel2[75].setRotationPoint(-76F, -59F, 28F);

		leftAnimTrackModel2[76].addShapeBox(0F, 0F, 0F, 18, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Rear Left Leg
		leftAnimTrackModel2[76].setRotationPoint(-97F, -44F, 28F);

		leftAnimTrackModel2[77].addShapeBox(0F, 0F, 0F, 18, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear Left Leg
		leftAnimTrackModel2[77].setRotationPoint(-97F, -50F, 28F);

		leftAnimTrackModel2[78].addShapeBox(0F, 0F, 0F, 18, 6, 12, 0F,-6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear Left Leg
		leftAnimTrackModel2[78].setRotationPoint(-97F, -56F, 28F);

		leftAnimTrackModel2[79].addShapeBox(0F, 0F, 0F, 16, 5, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Rear Left Leg
		leftAnimTrackModel2[79].setRotationPoint(-96F, -11F, 32F);

		leftAnimTrackModel2[80].addShapeBox(0F, 0F, 0F, 16, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear Left Leg
		leftAnimTrackModel2[80].setRotationPoint(-96F, -17F, 32F);

		leftAnimTrackModel2[81].addShapeBox(0F, 0F, 0F, 16, 5, 12, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear Left Leg
		leftAnimTrackModel2[81].setRotationPoint(-96F, -22F, 32F);

		leftAnimTrackModel2[82].addShapeBox(0F, 0F, 0F, 4, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear Left Leg
		leftAnimTrackModel2[82].setRotationPoint(-87F, -8F, 35F);

		leftAnimTrackModel2[83].addShapeBox(0F, 0F, 0F, 4, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear Left Leg
		leftAnimTrackModel2[83].setRotationPoint(-93F, -8F, 35F);

		leftAnimTrackModel2[84].addShapeBox(0F, 0F, 0F, 3, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Rear Left Leg
		leftAnimTrackModel2[84].setRotationPoint(-84F, -4F, 31F);

		leftAnimTrackModel2[85].addShapeBox(0F, 0F, 0F, 6, 3, 20, 0F,-3F, 0F, -8F, 0F, 0F, -3F, 0F, 0F, -3F, -3F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F); // Rear Left Leg
		leftAnimTrackModel2[85].setRotationPoint(-98F, -1F, 28F);

		leftAnimTrackModel2[86].addShapeBox(0F, 0F, 0F, 3, 3, 14, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Rear Left Leg
		leftAnimTrackModel2[86].setRotationPoint(-95F, -4F, 31F);

		leftAnimTrackModel2[87].addShapeBox(0F, 0F, 0F, 8, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear Left Leg
		leftAnimTrackModel2[87].setRotationPoint(-92F, -4F, 31F);

		leftAnimTrackModel2[88].addShapeBox(0F, 0F, 0F, 8, 3, 20, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear Left Leg
		leftAnimTrackModel2[88].setRotationPoint(-92F, -1F, 28F);

		leftAnimTrackModel2[89].addShapeBox(0F, 0F, 0F, 8, 5, 24, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear Left Leg
		leftAnimTrackModel2[89].setRotationPoint(-92F, 2F, 26F);

		leftAnimTrackModel2[90].addShapeBox(0F, 0F, 0F, 8, 5, 24, 0F,-2F, 0F, -10F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, -10F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F); // Rear Left Leg
		leftAnimTrackModel2[90].setRotationPoint(-100F, 2F, 26F);

		leftAnimTrackModel2[91].addShapeBox(0F, 0F, 0F, 6, 3, 20, 0F,0F, 0F, -3F, -3F, 0F, -8F, -3F, 0F, -8F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F); // Rear Left Leg
		leftAnimTrackModel2[91].setRotationPoint(-84F, -1F, 28F);

		leftAnimTrackModel2[92].addShapeBox(0F, 0F, 0F, 8, 5, 24, 0F,0F, 0F, -2F, -2F, 0F, -10F, -2F, 0F, -10F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F); // Rear Left Leg
		leftAnimTrackModel2[92].setRotationPoint(-84F, 2F, 26F);

		leftAnimTrackModel2[93].addShapeBox(0F, 0F, 0F, 6, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear Left Leg
		leftAnimTrackModel2[93].setRotationPoint(-99F, 7F, 43F);

		leftAnimTrackModel2[94].addShapeBox(0F, 0F, 0F, 8, 3, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear Left Leg
		leftAnimTrackModel2[94].setRotationPoint(-92F, 7F, 26F);

		leftAnimTrackModel2[95].addShapeBox(0F, 0F, 0F, 6, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear Left Leg
		leftAnimTrackModel2[95].setRotationPoint(-83F, 7F, 43F);

		leftAnimTrackModel2[96].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F); // Rear Left Leg
		leftAnimTrackModel2[96].setRotationPoint(-104F, 7F, 36F);

		leftAnimTrackModel2[97].addShapeBox(0F, 0F, 0F, 8, 3, 24, 0F,0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F); // Rear Left Leg
		leftAnimTrackModel2[97].setRotationPoint(-84F, 7F, 26F);

		leftAnimTrackModel2[98].addShapeBox(0F, 0F, 0F, 8, 3, 24, 0F,0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F); // Rear Left Leg
		leftAnimTrackModel2[98].setRotationPoint(-100F, 7F, 26F);

		leftAnimTrackModel2[99].addShapeBox(0F, 0F, 0F, 6, 3, 6, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear Left Leg
		leftAnimTrackModel2[99].setRotationPoint(-83F, 7F, 27F);

		leftAnimTrackModel2[100].addShapeBox(0F, 0F, 0F, 6, 3, 6, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear Left Leg
		leftAnimTrackModel2[100].setRotationPoint(-99F, 7F, 27F);

		leftAnimTrackModel2[101].addShapeBox(-6F, 5F, 0F, 5, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F); // Rear Left Leg
		leftAnimTrackModel2[101].setRotationPoint(-73F, -50F, 30F);
		leftAnimTrackModel2[101].rotateAngleZ = -0.2443461F;

		leftAnimTrackModel2[102].addShapeBox(0F, -2F, 0F, 7, 7, 4, 0F,-7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear Left Leg
		leftAnimTrackModel2[102].setRotationPoint(-79F, -50F, 30F);
		leftAnimTrackModel2[102].rotateAngleZ = -0.2443461F;

		leftAnimTrackModel2[103].addShapeBox(-6F, 5F, 0F, 5, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F); // Rear Left Leg
		leftAnimTrackModel2[103].setRotationPoint(-76F, -56F, 30F);
		leftAnimTrackModel2[103].rotateAngleZ = -0.2443461F;

		leftAnimTrackModel2[104].addShapeBox(0F, -2F, 0F, 7, 7, 4, 0F,-7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear Left Leg
		leftAnimTrackModel2[104].setRotationPoint(-84F, -56F, 30F);
		leftAnimTrackModel2[104].rotateAngleZ = -0.2443461F;

		leftAnimTrackModel2[105].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, 0F, 2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Rear Left Leg
		leftAnimTrackModel2[105].setRotationPoint(-76F, 7F, 36F);

		leftAnimTrackModel2[106].addShapeBox(0F, 0F, 0F, 14, 4, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear Left Leg
		leftAnimTrackModel2[106].setRotationPoint(-95F, -49F, 27.5F);

		leftAnimTrackModel2[107].addShapeBox(0F, 0F, 0F, 4, 12, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear Left Leg
		leftAnimTrackModel2[107].setRotationPoint(-90F, -20F, 31F);

		leftAnimTrackModel2[108].addShapeBox(0F, 0F, 0F, 11, 12, 4, 0F,-5F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -5F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F); // Box 455
		leftAnimTrackModel2[108].setRotationPoint(-99F, -48F, 34F);

		leftAnimTrackModel2[109].addShapeBox(0F, 0F, 0F, 11, 27, 4, 0F,-2F, -4F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, -7F, -4F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, -7F, -4F, 0F); // Box 456
		leftAnimTrackModel2[109].setRotationPoint(-99F, -41F, 34F);

		leftAnimTrackModel2[110].addShapeBox(0F, 0F, 0F, 11, 27, 4, 0F,-2F, -4F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, -7F, -4F, 0F, -7F, -4F, 0F, -2F, -4F, 0F); // Box 457
		leftAnimTrackModel2[110].setRotationPoint(-88F, -41F, 34F);

		leftAnimTrackModel2[111].addShapeBox(0F, 0F, 0F, 11, 12, 4, 0F,-2F, -1F, 0F, -5F, -1F, 0F, -5F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F); // Box 458
		leftAnimTrackModel2[111].setRotationPoint(-88F, -48F, 34F);

		leftAnimTrackModel2[112].addShapeBox(0F, 0F, 0F, 11, 12, 4, 0F,-5F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -5F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F); // Box 459
		leftAnimTrackModel2[112].setRotationPoint(55F, -44F, 34F);

		leftAnimTrackModel2[113].addShapeBox(0F, 0F, 0F, 11, 27, 4, 0F,-2F, -4F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, -7F, -4F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, -7F, -4F, 0F); // Box 460
		leftAnimTrackModel2[113].setRotationPoint(55F, -37F, 34F);

		leftAnimTrackModel2[114].addShapeBox(0F, 0F, 0F, 11, 27, 4, 0F,-2F, -4F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, -7F, -4F, 0F, -7F, -4F, 0F, -2F, -4F, 0F); // Box 461
		leftAnimTrackModel2[114].setRotationPoint(66F, -37F, 34F);

		leftAnimTrackModel2[115].addShapeBox(0F, 0F, 0F, 11, 12, 4, 0F,-2F, -1F, 0F, -5F, -1F, 0F, -5F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F); // Box 462
		leftAnimTrackModel2[115].setRotationPoint(66F, -44F, 34F);	
	}
	
	
	
	private void initleftAnimTrackModel3_0()
	{
		leftAnimTrackModel3[0] = new ModelRendererTurbo(this, 81, 361, textureX, textureY); // Box 455
		leftAnimTrackModel3[1] = new ModelRendererTurbo(this, 993, 177, textureX, textureY); // Box 456
		leftAnimTrackModel3[2] = new ModelRendererTurbo(this, 1, 297, textureX, textureY); // Box 457
		leftAnimTrackModel3[3] = new ModelRendererTurbo(this, 705, 225, textureX, textureY); // Box 458
		leftAnimTrackModel3[4] = new ModelRendererTurbo(this, 57, 297, textureX, textureY); // Box 459
		leftAnimTrackModel3[5] = new ModelRendererTurbo(this, 113, 321, textureX, textureY); // Box 460
		leftAnimTrackModel3[6] = new ModelRendererTurbo(this, 353, 353, textureX, textureY); // Box 461
		leftAnimTrackModel3[7] = new ModelRendererTurbo(this, 465, 353, textureX, textureY); // Box 462
		leftAnimTrackModel3[8] = new ModelRendererTurbo(this, 153, 361, textureX, textureY); // Box 463
		leftAnimTrackModel3[9] = new ModelRendererTurbo(this, 505, 361, textureX, textureY); // Box 464
		leftAnimTrackModel3[10] = new ModelRendererTurbo(this, 793, 361, textureX, textureY); // Box 465
		leftAnimTrackModel3[11] = new ModelRendererTurbo(this, 193, 361, textureX, textureY); // Box 466
		leftAnimTrackModel3[12] = new ModelRendererTurbo(this, 545, 361, textureX, textureY); // Box 467
		leftAnimTrackModel3[13] = new ModelRendererTurbo(this, 833, 377, textureX, textureY); // Box 468
		leftAnimTrackModel3[14] = new ModelRendererTurbo(this, 945, 361, textureX, textureY); // Box 469
		leftAnimTrackModel3[15] = new ModelRendererTurbo(this, 1, 385, textureX, textureY); // Box 470
		leftAnimTrackModel3[16] = new ModelRendererTurbo(this, 625, 385, textureX, textureY); // Box 471
		leftAnimTrackModel3[17] = new ModelRendererTurbo(this, 977, 249, textureX, textureY); // Box 472
		leftAnimTrackModel3[18] = new ModelRendererTurbo(this, 881, 161, textureX, textureY); // Box 473
		leftAnimTrackModel3[19] = new ModelRendererTurbo(this, 737, 225, textureX, textureY); // Box 474
		leftAnimTrackModel3[20] = new ModelRendererTurbo(this, 441, 89, textureX, textureY); // Box 475
		leftAnimTrackModel3[21] = new ModelRendererTurbo(this, 105, 113, textureX, textureY); // Box 476
		leftAnimTrackModel3[22] = new ModelRendererTurbo(this, 673, 385, textureX, textureY); // Box 477
		leftAnimTrackModel3[23] = new ModelRendererTurbo(this, 65, 401, textureX, textureY); // Box 478
		leftAnimTrackModel3[24] = new ModelRendererTurbo(this, 129, 265, textureX, textureY); // Box 479
		leftAnimTrackModel3[25] = new ModelRendererTurbo(this, 201, 145, textureX, textureY); // Box 480
		leftAnimTrackModel3[26] = new ModelRendererTurbo(this, 337, 257, textureX, textureY); // Box 481
		leftAnimTrackModel3[27] = new ModelRendererTurbo(this, 537, 257, textureX, textureY); // Box 482
		leftAnimTrackModel3[28] = new ModelRendererTurbo(this, 241, 265, textureX, textureY); // Box 483
		leftAnimTrackModel3[29] = new ModelRendererTurbo(this, 617, 273, textureX, textureY); // Box 484
		leftAnimTrackModel3[30] = new ModelRendererTurbo(this, 897, 289, textureX, textureY); // Box 485
		leftAnimTrackModel3[31] = new ModelRendererTurbo(this, 625, 297, textureX, textureY); // Box 486
		leftAnimTrackModel3[32] = new ModelRendererTurbo(this, 601, 121, textureX, textureY); // Box 487
		leftAnimTrackModel3[33] = new ModelRendererTurbo(this, 641, 417, textureX, textureY); // Box 488
		leftAnimTrackModel3[34] = new ModelRendererTurbo(this, 697, 417, textureX, textureY); // Box 489
		leftAnimTrackModel3[35] = new ModelRendererTurbo(this, 929, 225, textureX, textureY); // Box 490
		leftAnimTrackModel3[36] = new ModelRendererTurbo(this, 865, 281, textureX, textureY); // Box 491
		leftAnimTrackModel3[37] = new ModelRendererTurbo(this, 353, 137, textureX, textureY); // Box 492
		leftAnimTrackModel3[38] = new ModelRendererTurbo(this, 489, 145, textureX, textureY); // Box 493
		leftAnimTrackModel3[39] = new ModelRendererTurbo(this, 281, 425, textureX, textureY); // Box 494
		leftAnimTrackModel3[40] = new ModelRendererTurbo(this, 345, 425, textureX, textureY); // Box 495
		leftAnimTrackModel3[41] = new ModelRendererTurbo(this, 409, 425, textureX, textureY); // Box 496
		leftAnimTrackModel3[42] = new ModelRendererTurbo(this, 561, 313, textureX, textureY); // Box 497
		leftAnimTrackModel3[43] = new ModelRendererTurbo(this, 1, 329, textureX, textureY); // Box 498
		leftAnimTrackModel3[44] = new ModelRendererTurbo(this, 57, 329, textureX, textureY); // Box 499
		leftAnimTrackModel3[45] = new ModelRendererTurbo(this, 561, 329, textureX, textureY); // Box 500
		leftAnimTrackModel3[46] = new ModelRendererTurbo(this, 745, 425, textureX, textureY); // Box 501
		leftAnimTrackModel3[47] = new ModelRendererTurbo(this, 841, 425, textureX, textureY); // Box 502
		leftAnimTrackModel3[48] = new ModelRendererTurbo(this, 57, 433, textureX, textureY); // Box 503
		leftAnimTrackModel3[49] = new ModelRendererTurbo(this, 881, 321, textureX, textureY); // Box 504
		leftAnimTrackModel3[50] = new ModelRendererTurbo(this, 937, 329, textureX, textureY); // Box 505
		leftAnimTrackModel3[51] = new ModelRendererTurbo(this, 457, 425, textureX, textureY); // Box 506
		leftAnimTrackModel3[52] = new ModelRendererTurbo(this, 905, 425, textureX, textureY); // Box 507
		leftAnimTrackModel3[53] = new ModelRendererTurbo(this, 257, 409, textureX, textureY); // Box 508
		leftAnimTrackModel3[54] = new ModelRendererTurbo(this, 97, 433, textureX, textureY); // Box 509
		leftAnimTrackModel3[55] = new ModelRendererTurbo(this, 561, 433, textureX, textureY); // Box 510
		leftAnimTrackModel3[56] = new ModelRendererTurbo(this, 641, 433, textureX, textureY); // Box 511
		leftAnimTrackModel3[57] = new ModelRendererTurbo(this, 657, 433, textureX, textureY); // Box 512
		leftAnimTrackModel3[58] = new ModelRendererTurbo(this, 785, 433, textureX, textureY); // Box 513
		leftAnimTrackModel3[59] = new ModelRendererTurbo(this, 129, 441, textureX, textureY); // Box 514
		leftAnimTrackModel3[60] = new ModelRendererTurbo(this, 201, 441, textureX, textureY); // Box 515
		leftAnimTrackModel3[61] = new ModelRendererTurbo(this, 217, 337, textureX, textureY); // Box 516
		leftAnimTrackModel3[62] = new ModelRendererTurbo(this, 881, 337, textureX, textureY); // Box 517
		leftAnimTrackModel3[63] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 518
		leftAnimTrackModel3[64] = new ModelRendererTurbo(this, 937, 345, textureX, textureY); // Box 519
		leftAnimTrackModel3[65] = new ModelRendererTurbo(this, 985, 345, textureX, textureY); // Box 520
		leftAnimTrackModel3[66] = new ModelRendererTurbo(this, 489, 441, textureX, textureY); // Box 521
		leftAnimTrackModel3[67] = new ModelRendererTurbo(this, 929, 441, textureX, textureY); // Box 522
		leftAnimTrackModel3[68] = new ModelRendererTurbo(this, 809, 465, textureX, textureY); // Box 523
		leftAnimTrackModel3[69] = new ModelRendererTurbo(this, 169, 473, textureX, textureY); // Box 524
		leftAnimTrackModel3[70] = new ModelRendererTurbo(this, 321, 473, textureX, textureY); // Box 525
		leftAnimTrackModel3[71] = new ModelRendererTurbo(this, 473, 473, textureX, textureY); // Box 526
		leftAnimTrackModel3[72] = new ModelRendererTurbo(this, 857, 473, textureX, textureY); // Box 527
		leftAnimTrackModel3[73] = new ModelRendererTurbo(this, 921, 473, textureX, textureY); // Box 528
		leftAnimTrackModel3[74] = new ModelRendererTurbo(this, 377, 481, textureX, textureY); // Box 529
		leftAnimTrackModel3[75] = new ModelRendererTurbo(this, 713, 481, textureX, textureY); // Box 530
		leftAnimTrackModel3[76] = new ModelRendererTurbo(this, 489, 377, textureX, textureY); // Box 531
		leftAnimTrackModel3[77] = new ModelRendererTurbo(this, 553, 377, textureX, textureY); // Box 532
		leftAnimTrackModel3[78] = new ModelRendererTurbo(this, 633, 465, textureX, textureY); // Box 533
		leftAnimTrackModel3[79] = new ModelRendererTurbo(this, 961, 473, textureX, textureY); // Box 534
		leftAnimTrackModel3[80] = new ModelRendererTurbo(this, 57, 481, textureX, textureY); // Box 535
		leftAnimTrackModel3[81] = new ModelRendererTurbo(this, 209, 481, textureX, textureY); // Box 536
		leftAnimTrackModel3[82] = new ModelRendererTurbo(this, 73, 481, textureX, textureY); // Box 537
		leftAnimTrackModel3[83] = new ModelRendererTurbo(this, 417, 481, textureX, textureY); // Box 538
		leftAnimTrackModel3[84] = new ModelRendererTurbo(this, 513, 481, textureX, textureY); // Box 539
		leftAnimTrackModel3[85] = new ModelRendererTurbo(this, 809, 481, textureX, textureY); // Box 540
		leftAnimTrackModel3[86] = new ModelRendererTurbo(this, 1, 497, textureX, textureY); // Box 541
		leftAnimTrackModel3[87] = new ModelRendererTurbo(this, 841, 377, textureX, textureY); // Box 542
		leftAnimTrackModel3[88] = new ModelRendererTurbo(this, 233, 497, textureX, textureY); // Box 543
		leftAnimTrackModel3[89] = new ModelRendererTurbo(this, 937, 377, textureX, textureY); // Box 544
		leftAnimTrackModel3[90] = new ModelRendererTurbo(this, 697, 89, textureX, textureY); // Box 545
		leftAnimTrackModel3[91] = new ModelRendererTurbo(this, 305, 497, textureX, textureY); // Box 546
		leftAnimTrackModel3[92] = new ModelRendererTurbo(this, 465, 497, textureX, textureY); // Box 547
		leftAnimTrackModel3[93] = new ModelRendererTurbo(this, 49, 385, textureX, textureY); // Box 548
		leftAnimTrackModel3[94] = new ModelRendererTurbo(this, 617, 385, textureX, textureY); // Box 549
		leftAnimTrackModel3[95] = new ModelRendererTurbo(this, 929, 257, textureX, textureY); // Box 550
		leftAnimTrackModel3[96] = new ModelRendererTurbo(this, 1001, 377, textureX, textureY); // Box 551
		leftAnimTrackModel3[97] = new ModelRendererTurbo(this, 1, 265, textureX, textureY); // Box 552
		leftAnimTrackModel3[98] = new ModelRendererTurbo(this, 257, 385, textureX, textureY); // Box 553
		leftAnimTrackModel3[99] = new ModelRendererTurbo(this, 689, 145, textureX, textureY); // Box 554
		leftAnimTrackModel3[100] = new ModelRendererTurbo(this, 281, 497, textureX, textureY); // Box 555
		leftAnimTrackModel3[101] = new ModelRendererTurbo(this, 1, 401, textureX, textureY); // Box 556
		leftAnimTrackModel3[102] = new ModelRendererTurbo(this, 281, 113, textureX, textureY); // Box 557
		leftAnimTrackModel3[103] = new ModelRendererTurbo(this, 201, 161, textureX, textureY); // Box 558
		leftAnimTrackModel3[104] = new ModelRendererTurbo(this, 953, 585, textureX, textureY); // Box 559
		leftAnimTrackModel3[105] = new ModelRendererTurbo(this, 121, 593, textureX, textureY); // Box 560
		leftAnimTrackModel3[106] = new ModelRendererTurbo(this, 193, 593, textureX, textureY); // Box 561
		leftAnimTrackModel3[107] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 562
		leftAnimTrackModel3[108] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 563
		leftAnimTrackModel3[109] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 564
		leftAnimTrackModel3[110] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 565
		leftAnimTrackModel3[111] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 566
		leftAnimTrackModel3[112] = new ModelRendererTurbo(this, 1, 329, textureX, textureY); // Box 567
		leftAnimTrackModel3[113] = new ModelRendererTurbo(this, 561, 329, textureX, textureY); // Box 568
		leftAnimTrackModel3[114] = new ModelRendererTurbo(this, 57, 329, textureX, textureY); // Box 569
		leftAnimTrackModel3[115] = new ModelRendererTurbo(this, 561, 313, textureX, textureY); // Box 570
		

		leftAnimTrackModel3[0].addShapeBox(0F, 0F, 0F, 30, 10, 16, 0F,-10F, 0F, 1.5F, -10F, 0F, 1.5F, -10F, 0F, -1.5F, -10F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 455
		leftAnimTrackModel3[0].setRotationPoint(-25F, -83F, 33F);

		leftAnimTrackModel3[1].addShapeBox(-14F, 5F, 47F, 11, 12, 4, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 456
		leftAnimTrackModel3[1].setRotationPoint(-10F, -66F, -4F);
		leftAnimTrackModel3[1].rotateAngleZ = -0.38397244F;

		leftAnimTrackModel3[2].addShapeBox(-14F, 17F, 49F, 11, 27, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 7F, -3F, 0F, 4F, -3F, 0F, 4F, 3F, -5F, 7F, 3F); // Box 457
		leftAnimTrackModel3[2].setRotationPoint(-10F, -66F, -4F);
		leftAnimTrackModel3[2].rotateAngleZ = -0.38397244F;

		leftAnimTrackModel3[3].addShapeBox(3F, 5F, 47F, 11, 12, 4, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 458
		leftAnimTrackModel3[3].setRotationPoint(-10F, -66F, -4F);
		leftAnimTrackModel3[3].rotateAngleZ = -0.38397244F;

		leftAnimTrackModel3[4].addShapeBox(3F, 17F, 49F, 11, 27, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -5F, 0F, -3F, -5F, 0F, 3F, 0F, 0F, 3F); // Box 459
		leftAnimTrackModel3[4].setRotationPoint(-10F, -66F, -4F);
		leftAnimTrackModel3[4].rotateAngleZ = -0.38397244F;

		leftAnimTrackModel3[5].addShapeBox(0F, 0F, 0F, 20, 6, 12, 0F,-6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 460
		leftAnimTrackModel3[5].setRotationPoint(-38F, -29F, 52F);

		leftAnimTrackModel3[6].addShapeBox(0F, 0F, 0F, 20, 8, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 461
		leftAnimTrackModel3[6].setRotationPoint(-38F, -23F, 52F);

		leftAnimTrackModel3[7].addShapeBox(0F, 0F, 0F, 20, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Box 462
		leftAnimTrackModel3[7].setRotationPoint(-38F, -15F, 52F);

		leftAnimTrackModel3[8].addShapeBox(0F, 0F, 0F, 10, 8, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F); // Box 463
		leftAnimTrackModel3[8].setRotationPoint(-34F, -1F, 44F);

		leftAnimTrackModel3[9].addShapeBox(0F, 0F, 0F, 9, 8, 28, 0F,0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 5F, 0F, -8F, 0F, 0F, 5F, 0F, 0F, 5F, 5F, 0F, -8F); // Box 464
		leftAnimTrackModel3[9].setRotationPoint(-43F, -1F, 44F);

		leftAnimTrackModel3[10].addShapeBox(0F, 0F, 0F, 9, 8, 28, 0F,0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 5F, 5F, 0F, -8F, 5F, 0F, -8F, 0F, 0F, 5F); // Box 465
		leftAnimTrackModel3[10].setRotationPoint(-24F, -1F, 44F);

		leftAnimTrackModel3[11].addShapeBox(0F, 0F, 0F, 10, 3, 38, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 466
		leftAnimTrackModel3[11].setRotationPoint(-34F, 7F, 39F);

		leftAnimTrackModel3[12].addShapeBox(0F, 0F, 0F, 14, 3, 38, 0F,0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F); // Box 467
		leftAnimTrackModel3[12].setRotationPoint(-24F, 7F, 39F);

		leftAnimTrackModel3[13].addShapeBox(0F, 0F, 0F, 14, 3, 38, 0F,0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F); // Box 468
		leftAnimTrackModel3[13].setRotationPoint(-48F, 7F, 39F);

		leftAnimTrackModel3[14].addShapeBox(0F, 0F, 0F, 10, 3, 28, 0F,0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 469
		leftAnimTrackModel3[14].setRotationPoint(-34F, -4F, 44F);

		leftAnimTrackModel3[15].addShapeBox(0F, 0F, 0F, 9, 3, 28, 0F,0F, 0F, -8F, -5F, 0F, -12F, -5F, 0F, -12F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F); // Box 470
		leftAnimTrackModel3[15].setRotationPoint(-24F, -4F, 44F);

		leftAnimTrackModel3[16].addShapeBox(0F, 0F, 0F, 9, 3, 28, 0F,-5F, 0F, -12F, 0F, 0F, -8F, 0F, 0F, -8F, -5F, 0F, -12F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F); // Box 471
		leftAnimTrackModel3[16].setRotationPoint(-43F, -4F, 44F);

		leftAnimTrackModel3[17].addShapeBox(0F, 0F, 0F, 10, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 472
		leftAnimTrackModel3[17].setRotationPoint(-34F, -7F, 52F);

		leftAnimTrackModel3[18].addShapeBox(0F, 0F, 0F, 4, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 473
		leftAnimTrackModel3[18].setRotationPoint(-24F, -7F, 52F);

		leftAnimTrackModel3[19].addShapeBox(0F, 0F, 0F, 4, 3, 12, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 474
		leftAnimTrackModel3[19].setRotationPoint(-38F, -7F, 52F);

		leftAnimTrackModel3[20].addShapeBox(0F, 0F, 0F, 4, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 475
		leftAnimTrackModel3[20].setRotationPoint(-37F, -15F, 56F);

		leftAnimTrackModel3[21].addShapeBox(0F, 0F, 0F, 4, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 476
		leftAnimTrackModel3[21].setRotationPoint(-25F, -15F, 56F);

		leftAnimTrackModel3[22].addShapeBox(0F, 0F, 0F, 30, 10, 16, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 477
		leftAnimTrackModel3[22].setRotationPoint(-25F, -73F, 34.5F);

		leftAnimTrackModel3[23].addShapeBox(0F, 0F, 0F, 30, 10, 16, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F); // Box 478
		leftAnimTrackModel3[23].setRotationPoint(-25F, -63F, 36F);

		leftAnimTrackModel3[24].addShapeBox(0F, 0F, 0F, 22, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 479
		leftAnimTrackModel3[24].setRotationPoint(-39F, -23F, 47.5F);

		leftAnimTrackModel3[25].addShapeBox(0F, 0F, 0F, 8, 2, 7, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 480
		leftAnimTrackModel3[25].setRotationPoint(-32F, -25F, 45.5F);

		leftAnimTrackModel3[26].addShapeBox(0F, 0F, 0F, 8, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 481
		leftAnimTrackModel3[26].setRotationPoint(-32F, -19F, 45.5F);

		leftAnimTrackModel3[27].addShapeBox(0F, 0F, 0F, 8, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 482
		leftAnimTrackModel3[27].setRotationPoint(-32F, -23F, 45.5F);

		leftAnimTrackModel3[28].addShapeBox(0F, 0F, 0F, 8, 3, 8, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 483
		leftAnimTrackModel3[28].setRotationPoint(-45F, 7F, 42F);

		leftAnimTrackModel3[29].addShapeBox(0F, 0F, 0F, 8, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 484
		leftAnimTrackModel3[29].setRotationPoint(-45F, 7F, 66F);

		leftAnimTrackModel3[30].addShapeBox(0F, 0F, 0F, 8, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 485
		leftAnimTrackModel3[30].setRotationPoint(-21F, 7F, 66F);

		leftAnimTrackModel3[31].addShapeBox(0F, 0F, 0F, 8, 3, 8, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 486
		leftAnimTrackModel3[31].setRotationPoint(-21F, 7F, 42F);

		leftAnimTrackModel3[32].addShapeBox(0F, 0F, 0F, 4, 3, 8, 0F,0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 487
		leftAnimTrackModel3[32].setRotationPoint(-52F, 7F, 54F);

		leftAnimTrackModel3[33].addShapeBox(0F, 0F, 0F, 18, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Box 488
		leftAnimTrackModel3[33].setRotationPoint(77F, -53F, 28F);

		leftAnimTrackModel3[34].addShapeBox(0F, 0F, 0F, 18, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 489
		leftAnimTrackModel3[34].setRotationPoint(77F, -59F, 28F);

		leftAnimTrackModel3[35].addShapeBox(0F, 0F, 0F, 7, 7, 4, 0F,-7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 490
		leftAnimTrackModel3[35].setRotationPoint(70F, -56F, 30F);

		leftAnimTrackModel3[36].addShapeBox(0F, 0F, 0F, 7, 7, 4, 0F,-7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 491
		leftAnimTrackModel3[36].setRotationPoint(75F, -50F, 30F);

		leftAnimTrackModel3[37].addShapeBox(0F, 0F, 0F, 5, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F); // Box 492
		leftAnimTrackModel3[37].setRotationPoint(75F, -43F, 30F);

		leftAnimTrackModel3[38].addShapeBox(0F, 0F, 0F, 5, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F); // Box 493
		leftAnimTrackModel3[38].setRotationPoint(72F, -49F, 30F);

		leftAnimTrackModel3[39].addShapeBox(0F, 0F, 0F, 18, 6, 12, 0F,-6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 494
		leftAnimTrackModel3[39].setRotationPoint(56F, -46F, 28F);

		leftAnimTrackModel3[40].addShapeBox(0F, 0F, 0F, 18, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 495
		leftAnimTrackModel3[40].setRotationPoint(56F, -40F, 28F);

		leftAnimTrackModel3[41].addShapeBox(0F, 0F, 0F, 18, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Box 496
		leftAnimTrackModel3[41].setRotationPoint(56F, -34F, 28F);

		leftAnimTrackModel3[42].addShapeBox(0F, 0F, 0F, 6, 9, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Box 497
		leftAnimTrackModel3[42].setRotationPoint(63F, -29F, 34F);

		leftAnimTrackModel3[43].addShapeBox(0F, 0F, 0F, 15, 9, 4, 0F,0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 0F, 0F); // Box 498
		leftAnimTrackModel3[43].setRotationPoint(69F, -29F, 34F);

		leftAnimTrackModel3[44].addShapeBox(0F, 0F, 0F, 9, 8, 4, 0F,0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 13F, 0F, 0F, 13F, 0F, 0F, 1F, 0F); // Box 499
		leftAnimTrackModel3[44].setRotationPoint(80F, -37F, 34F);

		leftAnimTrackModel3[45].addShapeBox(0F, 0F, 0F, 6, 6, 4, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F); // Box 500
		leftAnimTrackModel3[45].setRotationPoint(74F, -40F, 34F);

		leftAnimTrackModel3[46].addShapeBox(0F, 0F, 0F, 16, 5, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 501
		leftAnimTrackModel3[46].setRotationPoint(81F, -11F, 32F);

		leftAnimTrackModel3[47].addShapeBox(0F, 0F, 0F, 16, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 502
		leftAnimTrackModel3[47].setRotationPoint(81F, -17F, 32F);

		leftAnimTrackModel3[48].addShapeBox(0F, 0F, 0F, 16, 5, 12, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 503
		leftAnimTrackModel3[48].setRotationPoint(81F, -22F, 32F);

		leftAnimTrackModel3[49].addShapeBox(0F, 0F, 0F, 4, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 504
		leftAnimTrackModel3[49].setRotationPoint(90F, -8F, 35F);

		leftAnimTrackModel3[50].addShapeBox(0F, 0F, 0F, 4, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 505
		leftAnimTrackModel3[50].setRotationPoint(84F, -8F, 35F);

		leftAnimTrackModel3[51].addShapeBox(0F, 0F, 0F, 6, 3, 20, 0F,-3F, 0F, -8F, 0F, 0F, -3F, 0F, 0F, -3F, -3F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F); // Box 506
		leftAnimTrackModel3[51].setRotationPoint(79F, -1F, 28F);

		leftAnimTrackModel3[52].addShapeBox(0F, 0F, 0F, 8, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 507
		leftAnimTrackModel3[52].setRotationPoint(85F, -4F, 31F);

		leftAnimTrackModel3[53].addShapeBox(0F, 0F, 0F, 3, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 508
		leftAnimTrackModel3[53].setRotationPoint(93F, -4F, 31F);

		leftAnimTrackModel3[54].addShapeBox(0F, 0F, 0F, 6, 3, 20, 0F,0F, 0F, -3F, -3F, 0F, -8F, -3F, 0F, -8F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F); // Box 509
		leftAnimTrackModel3[54].setRotationPoint(93F, -1F, 28F);

		leftAnimTrackModel3[55].addShapeBox(0F, 0F, 0F, 8, 3, 20, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 510
		leftAnimTrackModel3[55].setRotationPoint(85F, -1F, 28F);

		leftAnimTrackModel3[56].addShapeBox(0F, 0F, 0F, 3, 3, 14, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 511
		leftAnimTrackModel3[56].setRotationPoint(82F, -4F, 31F);

		leftAnimTrackModel3[57].addShapeBox(0F, 0F, 0F, 8, 5, 24, 0F,-2F, 0F, -10F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, -10F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F); // Box 512
		leftAnimTrackModel3[57].setRotationPoint(77F, 2F, 26F);

		leftAnimTrackModel3[58].addShapeBox(0F, 0F, 0F, 8, 5, 24, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 513
		leftAnimTrackModel3[58].setRotationPoint(85F, 2F, 26F);

		leftAnimTrackModel3[59].addShapeBox(0F, 0F, 0F, 8, 5, 24, 0F,0F, 0F, -2F, -2F, 0F, -10F, -2F, 0F, -10F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F); // Box 514
		leftAnimTrackModel3[59].setRotationPoint(93F, 2F, 26F);

		leftAnimTrackModel3[60].addShapeBox(0F, 0F, 0F, 8, 3, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 515
		leftAnimTrackModel3[60].setRotationPoint(85F, 7F, 26F);

		leftAnimTrackModel3[61].addShapeBox(0F, 0F, 0F, 6, 3, 6, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 516
		leftAnimTrackModel3[61].setRotationPoint(94F, 7F, 27F);

		leftAnimTrackModel3[62].addShapeBox(0F, 0F, 0F, 6, 3, 6, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 517
		leftAnimTrackModel3[62].setRotationPoint(78F, 7F, 27F);

		leftAnimTrackModel3[63].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 518
		leftAnimTrackModel3[63].setRotationPoint(73F, 7F, 36F);

		leftAnimTrackModel3[64].addShapeBox(0F, 0F, 0F, 6, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 519
		leftAnimTrackModel3[64].setRotationPoint(94F, 7F, 43F);

		leftAnimTrackModel3[65].addShapeBox(0F, 0F, 0F, 6, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 520
		leftAnimTrackModel3[65].setRotationPoint(78F, 7F, 43F);

		leftAnimTrackModel3[66].addShapeBox(0F, 0F, 0F, 8, 3, 24, 0F,0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F); // Box 521
		leftAnimTrackModel3[66].setRotationPoint(93F, 7F, 26F);

		leftAnimTrackModel3[67].addShapeBox(0F, 0F, 0F, 8, 3, 24, 0F,0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F); // Box 522
		leftAnimTrackModel3[67].setRotationPoint(77F, 7F, 26F);

		leftAnimTrackModel3[68].addShapeBox(0F, 0F, 0F, 18, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Box 523
		leftAnimTrackModel3[68].setRotationPoint(-76F, -53F, 28F);

		leftAnimTrackModel3[69].addShapeBox(0F, 0F, 0F, 18, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 524
		leftAnimTrackModel3[69].setRotationPoint(-76F, -59F, 28F);

		leftAnimTrackModel3[70].addShapeBox(0F, 0F, 0F, 18, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Box 525
		leftAnimTrackModel3[70].setRotationPoint(-97F, -34F, 28F);

		leftAnimTrackModel3[71].addShapeBox(0F, 0F, 0F, 18, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 526
		leftAnimTrackModel3[71].setRotationPoint(-97F, -40F, 28F);

		leftAnimTrackModel3[72].addShapeBox(0F, 0F, 0F, 18, 6, 12, 0F,-6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 527
		leftAnimTrackModel3[72].setRotationPoint(-97F, -46F, 28F);

		leftAnimTrackModel3[73].addShapeBox(0F, 0F, 0F, 16, 5, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 528
		leftAnimTrackModel3[73].setRotationPoint(-77F, -11F, 32F);

		leftAnimTrackModel3[74].addShapeBox(0F, 0F, 0F, 16, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 529
		leftAnimTrackModel3[74].setRotationPoint(-77F, -17F, 32F);

		leftAnimTrackModel3[75].addShapeBox(0F, 0F, 0F, 16, 5, 12, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 530
		leftAnimTrackModel3[75].setRotationPoint(-77F, -22F, 32F);

		leftAnimTrackModel3[76].addShapeBox(0F, 0F, 0F, 4, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 531
		leftAnimTrackModel3[76].setRotationPoint(-68F, -8F, 35F);

		leftAnimTrackModel3[77].addShapeBox(0F, 0F, 0F, 4, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 532
		leftAnimTrackModel3[77].setRotationPoint(-74F, -8F, 35F);

		leftAnimTrackModel3[78].addShapeBox(0F, 0F, 0F, 3, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 533
		leftAnimTrackModel3[78].setRotationPoint(-65F, -4F, 31F);

		leftAnimTrackModel3[79].addShapeBox(0F, 0F, 0F, 6, 3, 20, 0F,-3F, 0F, -8F, 0F, 0F, -3F, 0F, 0F, -3F, -3F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F); // Box 534
		leftAnimTrackModel3[79].setRotationPoint(-79F, -1F, 28F);

		leftAnimTrackModel3[80].addShapeBox(0F, 0F, 0F, 3, 3, 14, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 535
		leftAnimTrackModel3[80].setRotationPoint(-76F, -4F, 31F);

		leftAnimTrackModel3[81].addShapeBox(0F, 0F, 0F, 8, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 536
		leftAnimTrackModel3[81].setRotationPoint(-73F, -4F, 31F);

		leftAnimTrackModel3[82].addShapeBox(0F, 0F, 0F, 8, 3, 20, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 537
		leftAnimTrackModel3[82].setRotationPoint(-73F, -1F, 28F);

		leftAnimTrackModel3[83].addShapeBox(0F, 0F, 0F, 8, 5, 24, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 538
		leftAnimTrackModel3[83].setRotationPoint(-73F, 2F, 26F);

		leftAnimTrackModel3[84].addShapeBox(0F, 0F, 0F, 8, 5, 24, 0F,-2F, 0F, -10F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, -10F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F); // Box 539
		leftAnimTrackModel3[84].setRotationPoint(-81F, 2F, 26F);

		leftAnimTrackModel3[85].addShapeBox(0F, 0F, 0F, 6, 3, 20, 0F,0F, 0F, -3F, -3F, 0F, -8F, -3F, 0F, -8F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F); // Box 540
		leftAnimTrackModel3[85].setRotationPoint(-65F, -1F, 28F);

		leftAnimTrackModel3[86].addShapeBox(0F, 0F, 0F, 8, 5, 24, 0F,0F, 0F, -2F, -2F, 0F, -10F, -2F, 0F, -10F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F); // Box 541
		leftAnimTrackModel3[86].setRotationPoint(-65F, 2F, 26F);

		leftAnimTrackModel3[87].addShapeBox(0F, 0F, 0F, 6, 3, 6, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 542
		leftAnimTrackModel3[87].setRotationPoint(-80F, 7F, 27F);

		leftAnimTrackModel3[88].addShapeBox(0F, 0F, 0F, 8, 3, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 543
		leftAnimTrackModel3[88].setRotationPoint(-73F, 7F, 26F);

		leftAnimTrackModel3[89].addShapeBox(0F, 0F, 0F, 6, 3, 6, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 544
		leftAnimTrackModel3[89].setRotationPoint(-64F, 7F, 27F);

		leftAnimTrackModel3[90].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 545
		leftAnimTrackModel3[90].setRotationPoint(-85F, 7F, 36F);

		leftAnimTrackModel3[91].addShapeBox(0F, 0F, 0F, 8, 3, 24, 0F,0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F); // Box 546
		leftAnimTrackModel3[91].setRotationPoint(-65F, 7F, 26F);

		leftAnimTrackModel3[92].addShapeBox(0F, 0F, 0F, 8, 3, 24, 0F,0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F); // Box 547
		leftAnimTrackModel3[92].setRotationPoint(-81F, 7F, 26F);

		leftAnimTrackModel3[93].addShapeBox(0F, 0F, 0F, 6, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 548
		leftAnimTrackModel3[93].setRotationPoint(-64F, 7F, 43F);

		leftAnimTrackModel3[94].addShapeBox(0F, 0F, 0F, 6, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 549
		leftAnimTrackModel3[94].setRotationPoint(-80F, 7F, 43F);

		leftAnimTrackModel3[95].addShapeBox(0F, 0F, 0F, 5, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F); // Box 550
		leftAnimTrackModel3[95].setRotationPoint(-79F, -43F, 30F);

		leftAnimTrackModel3[96].addShapeBox(0F, 0F, 0F, 7, 7, 4, 0F,-7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 551
		leftAnimTrackModel3[96].setRotationPoint(-79F, -50F, 30F);

		leftAnimTrackModel3[97].addShapeBox(0F, 0F, 0F, 5, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F); // Box 552
		leftAnimTrackModel3[97].setRotationPoint(-82F, -49F, 30F);

		leftAnimTrackModel3[98].addShapeBox(0F, 0F, 0F, 7, 7, 4, 0F,-7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 553
		leftAnimTrackModel3[98].setRotationPoint(-84F, -56F, 30F);

		leftAnimTrackModel3[99].addShapeBox(-8F, 28F, 46.5F, 16, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 554
		leftAnimTrackModel3[99].setRotationPoint(-10F, -66F, -3F);
		leftAnimTrackModel3[99].rotateAngleZ = -0.38397244F;

		leftAnimTrackModel3[100].addShapeBox(0F, 0F, -17F, 2, 2, 17, 0F,0F, 4F, 5F, 0F, 4F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, -4F, 5F, 0F, -4F, 5F, 0F, 0F, 5F, 0F, 0F, 5F); // Box 555
		leftAnimTrackModel3[100].setRotationPoint(-11F, -36.5F, 9.5F);
		leftAnimTrackModel3[100].rotateAngleX = -0.15707963F;
		leftAnimTrackModel3[100].rotateAngleY = -0.57595865F;

		leftAnimTrackModel3[101].addShapeBox(0F, 0F, 0F, 4, 3, 8, 0F,0F, 0F, 2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 556
		leftAnimTrackModel3[101].setRotationPoint(-10F, 7F, 54F);

		leftAnimTrackModel3[102].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, 0F, 2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 557
		leftAnimTrackModel3[102].setRotationPoint(-57F, 7F, 36F);

		leftAnimTrackModel3[103].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, 0F, 2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 558
		leftAnimTrackModel3[103].setRotationPoint(101F, 7F, 36F);

		leftAnimTrackModel3[104].addShapeBox(0F, 0F, 0F, 30, 10, 4, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, -2F, 0F, -1.5F, -2F, 0F, -1.5F, -10F, 0F, 0F, -10F, 0F, 0F, -12F, -2F, 0F, -12F, -2F, 0F); // Box 559
		leftAnimTrackModel3[104].setRotationPoint(-25F, -63F, 52F);

		leftAnimTrackModel3[105].addShapeBox(0F, 0F, 0F, 30, 10, 4, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, -2F, 0F, -1.5F, -2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 560
		leftAnimTrackModel3[105].setRotationPoint(-25F, -73F, 50.5F);

		leftAnimTrackModel3[106].addShapeBox(0F, 0F, 0F, 30, 10, 4, 0F,-10F, 0F, 1.5F, -10F, 0F, 1.5F, -12F, -2F, -1.5F, -12F, -2F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 561
		leftAnimTrackModel3[106].setRotationPoint(-25F, -83F, 49F);

		leftAnimTrackModel3[107].addShapeBox(0F, 0F, 0F, 6, 22, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 562
		leftAnimTrackModel3[107].setRotationPoint(-13F, -79F, 51.5F);

		leftAnimTrackModel3[108].addShapeBox(0F, 0F, 0F, 14, 4, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 563
		leftAnimTrackModel3[108].setRotationPoint(58F, -39F, 27.5F);

		leftAnimTrackModel3[109].addShapeBox(0F, 0F, 0F, 14, 4, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 564
		leftAnimTrackModel3[109].setRotationPoint(-95F, -39F, 27.5F);

		leftAnimTrackModel3[110].addShapeBox(0F, 0F, 0F, 4, 12, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 565
		leftAnimTrackModel3[110].setRotationPoint(-71F, -20F, 31F);

		leftAnimTrackModel3[111].addShapeBox(0F, 0F, 0F, 4, 12, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 566
		leftAnimTrackModel3[111].setRotationPoint(87F, -20F, 31F);

		leftAnimTrackModel3[112].addShapeBox(0F, 0F, 0F, 15, 9, 4, 0F,0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 0F, 0F); // Box 567
		leftAnimTrackModel3[112].setRotationPoint(-84F, -29F, 34F);

		leftAnimTrackModel3[113].addShapeBox(0F, 0F, 0F, 6, 6, 4, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F); // Box 568
		leftAnimTrackModel3[113].setRotationPoint(-79F, -40F, 34F);

		leftAnimTrackModel3[114].addShapeBox(0F, 0F, 0F, 9, 8, 4, 0F,0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 13F, 0F, 0F, 13F, 0F, 0F, 1F, 0F); // Box 569
		leftAnimTrackModel3[114].setRotationPoint(-73F, -37F, 34F);

		leftAnimTrackModel3[115].addShapeBox(0F, 0F, 0F, 6, 9, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Box 570
		leftAnimTrackModel3[115].setRotationPoint(-90F, -29F, 34F);

		
	}
	
	
	
	private void initleftAnimTrackModel4_0()
	{
		leftAnimTrackModel4[0] = new ModelRendererTurbo(this, 537, 273, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel4[1] = new ModelRendererTurbo(this, 993, 57, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel4[2] = new ModelRendererTurbo(this, 897, 257, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel4[3] = new ModelRendererTurbo(this, 473, 89, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel4[4] = new ModelRendererTurbo(this, 481, 273, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel4[5] = new ModelRendererTurbo(this, 953, 273, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel4[6] = new ModelRendererTurbo(this, 809, 281, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel4[7] = new ModelRendererTurbo(this, 953, 297, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel4[8] = new ModelRendererTurbo(this, 161, 321, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel4[9] = new ModelRendererTurbo(this, 241, 321, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel4[10] = new ModelRendererTurbo(this, 833, 321, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel4[11] = new ModelRendererTurbo(this, 873, 329, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel4[12] = new ModelRendererTurbo(this, 281, 353, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel4[13] = new ModelRendererTurbo(this, 393, 353, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel4[14] = new ModelRendererTurbo(this, 505, 321, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel4[15] = new ModelRendererTurbo(this, 937, 329, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel4[16] = new ModelRendererTurbo(this, 1, 353, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel4[17] = new ModelRendererTurbo(this, 521, 177, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel4[18] = new ModelRendererTurbo(this, 337, 113, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel4[19] = new ModelRendererTurbo(this, 689, 129, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel4[20] = new ModelRendererTurbo(this, 937, 57, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel4[21] = new ModelRendererTurbo(this, 801, 65, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel4[22] = new ModelRendererTurbo(this, 625, 353, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel4[23] = new ModelRendererTurbo(this, 721, 353, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel4[24] = new ModelRendererTurbo(this, 257, 161, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel4[25] = new ModelRendererTurbo(this, 753, 129, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel4[26] = new ModelRendererTurbo(this, 993, 129, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel4[27] = new ModelRendererTurbo(this, 985, 145, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel4[28] = new ModelRendererTurbo(this, 753, 169, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel4[29] = new ModelRendererTurbo(this, 369, 201, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel4[30] = new ModelRendererTurbo(this, 137, 217, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel4[31] = new ModelRendererTurbo(this, 217, 217, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel4[32] = new ModelRendererTurbo(this, 593, 57, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel4[33] = new ModelRendererTurbo(this, 1001, 113, textureX, textureY); // front Left Leg
		leftAnimTrackModel4[34] = new ModelRendererTurbo(this, 153, 113, textureX, textureY); // front Left Leg
		leftAnimTrackModel4[35] = new ModelRendererTurbo(this, 561, 121, textureX, textureY); // front Left Leg
		leftAnimTrackModel4[36] = new ModelRendererTurbo(this, 41, 145, textureX, textureY); // front Left Leg
		leftAnimTrackModel4[37] = new ModelRendererTurbo(this, 257, 361, textureX, textureY); // front Left Leg
		leftAnimTrackModel4[38] = new ModelRendererTurbo(this, 905, 393, textureX, textureY); // front Left Leg
		leftAnimTrackModel4[39] = new ModelRendererTurbo(this, 281, 401, textureX, textureY); // front Left Leg
		leftAnimTrackModel4[40] = new ModelRendererTurbo(this, 289, 321, textureX, textureY); // front Left Leg
		leftAnimTrackModel4[41] = new ModelRendererTurbo(this, 969, 393, textureX, textureY); // front Left Leg
		leftAnimTrackModel4[42] = new ModelRendererTurbo(this, 345, 401, textureX, textureY); // front Left Leg
		leftAnimTrackModel4[43] = new ModelRendererTurbo(this, 409, 401, textureX, textureY); // front Left Leg
		leftAnimTrackModel4[44] = new ModelRendererTurbo(this, 473, 401, textureX, textureY); // front Left Leg
		leftAnimTrackModel4[45] = new ModelRendererTurbo(this, 745, 393, textureX, textureY); // front Left Leg
		leftAnimTrackModel4[46] = new ModelRendererTurbo(this, 137, 409, textureX, textureY); // front Left Leg
		leftAnimTrackModel4[47] = new ModelRendererTurbo(this, 209, 409, textureX, textureY); // front Left Leg
		leftAnimTrackModel4[48] = new ModelRendererTurbo(this, 513, 409, textureX, textureY); // front Left Leg
		leftAnimTrackModel4[49] = new ModelRendererTurbo(this, 945, 409, textureX, textureY); // front Left Leg
		leftAnimTrackModel4[50] = new ModelRendererTurbo(this, 1, 417, textureX, textureY); // front Left Leg
		leftAnimTrackModel4[51] = new ModelRendererTurbo(this, 561, 409, textureX, textureY); // front Left Leg
		leftAnimTrackModel4[52] = new ModelRendererTurbo(this, 793, 409, textureX, textureY); // front Left Leg
		leftAnimTrackModel4[53] = new ModelRendererTurbo(this, 601, 417, textureX, textureY); // front Left Leg
		leftAnimTrackModel4[54] = new ModelRendererTurbo(this, 185, 409, textureX, textureY); // front Left Leg
		leftAnimTrackModel4[55] = new ModelRendererTurbo(this, 497, 313, textureX, textureY); // front Left Leg
		leftAnimTrackModel4[56] = new ModelRendererTurbo(this, 985, 321, textureX, textureY); // front Left Leg
		leftAnimTrackModel4[57] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // front Left Leg
		leftAnimTrackModel4[58] = new ModelRendererTurbo(this, 753, 201, textureX, textureY); // front Left Leg
		leftAnimTrackModel4[59] = new ModelRendererTurbo(this, 1001, 49, textureX, textureY); // front Left Leg
		leftAnimTrackModel4[60] = new ModelRendererTurbo(this, 57, 241, textureX, textureY); // front Left Leg
		leftAnimTrackModel4[61] = new ModelRendererTurbo(this, 321, 281, textureX, textureY); // front Left Leg
		leftAnimTrackModel4[62] = new ModelRendererTurbo(this, 593, 305, textureX, textureY); // front Left Leg
		leftAnimTrackModel4[63] = new ModelRendererTurbo(this, 809, 305, textureX, textureY); // front Left Leg
		leftAnimTrackModel4[64] = new ModelRendererTurbo(this, 729, 505, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel4[65] = new ModelRendererTurbo(this, 753, 145, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel4[66] = new ModelRendererTurbo(this, 49, 401, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel4[67] = new ModelRendererTurbo(this, 281, 121, textureX, textureY); // front Left Leg
		leftAnimTrackModel4[68] = new ModelRendererTurbo(this, 1, 585, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel4[69] = new ModelRendererTurbo(this, 585, 585, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel4[70] = new ModelRendererTurbo(this, 881, 585, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel4[71] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Mid Left Leg
		leftAnimTrackModel4[72] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // front Left Leg
		leftAnimTrackModel4[73] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // front Left Leg
		leftAnimTrackModel4[74] = new ModelRendererTurbo(this, 1, 449, textureX, textureY); // Rear Left Leg
		leftAnimTrackModel4[75] = new ModelRendererTurbo(this, 249, 449, textureX, textureY); // Rear Left Leg
		leftAnimTrackModel4[76] = new ModelRendererTurbo(this, 305, 449, textureX, textureY); // Rear Left Leg
		leftAnimTrackModel4[77] = new ModelRendererTurbo(this, 369, 449, textureX, textureY); // Rear Left Leg
		leftAnimTrackModel4[78] = new ModelRendererTurbo(this, 857, 449, textureX, textureY); // Rear Left Leg
		leftAnimTrackModel4[79] = new ModelRendererTurbo(this, 49, 457, textureX, textureY); // Rear Left Leg
		leftAnimTrackModel4[80] = new ModelRendererTurbo(this, 425, 457, textureX, textureY); // Rear Left Leg
		leftAnimTrackModel4[81] = new ModelRendererTurbo(this, 545, 457, textureX, textureY); // Rear Left Leg
		leftAnimTrackModel4[82] = new ModelRendererTurbo(this, 409, 353, textureX, textureY); // Rear Left Leg
		leftAnimTrackModel4[83] = new ModelRendererTurbo(this, 553, 361, textureX, textureY); // Rear Left Leg
		leftAnimTrackModel4[84] = new ModelRendererTurbo(this, 705, 433, textureX, textureY); // Rear Left Leg
		leftAnimTrackModel4[85] = new ModelRendererTurbo(this, 601, 441, textureX, textureY); // Rear Left Leg
		leftAnimTrackModel4[86] = new ModelRendererTurbo(this, 177, 441, textureX, textureY); // Rear Left Leg
		leftAnimTrackModel4[87] = new ModelRendererTurbo(this, 977, 441, textureX, textureY); // Rear Left Leg
		leftAnimTrackModel4[88] = new ModelRendererTurbo(this, 721, 449, textureX, textureY); // Rear Left Leg
		leftAnimTrackModel4[89] = new ModelRendererTurbo(this, 1, 465, textureX, textureY); // Rear Left Leg
		leftAnimTrackModel4[90] = new ModelRendererTurbo(this, 249, 465, textureX, textureY); // Rear Left Leg
		leftAnimTrackModel4[91] = new ModelRendererTurbo(this, 89, 457, textureX, textureY); // Rear Left Leg
		leftAnimTrackModel4[92] = new ModelRendererTurbo(this, 585, 465, textureX, textureY); // Rear Left Leg
		leftAnimTrackModel4[93] = new ModelRendererTurbo(this, 841, 361, textureX, textureY); // Rear Left Leg
		leftAnimTrackModel4[94] = new ModelRendererTurbo(this, 657, 465, textureX, textureY); // Rear Left Leg
		leftAnimTrackModel4[95] = new ModelRendererTurbo(this, 1, 369, textureX, textureY); // Rear Left Leg
		leftAnimTrackModel4[96] = new ModelRendererTurbo(this, 657, 89, textureX, textureY); // Rear Left Leg
		leftAnimTrackModel4[97] = new ModelRendererTurbo(this, 761, 465, textureX, textureY); // Rear Left Leg
		leftAnimTrackModel4[98] = new ModelRendererTurbo(this, 121, 473, textureX, textureY); // Rear Left Leg
		leftAnimTrackModel4[99] = new ModelRendererTurbo(this, 353, 377, textureX, textureY); // Rear Left Leg
		leftAnimTrackModel4[100] = new ModelRendererTurbo(this, 385, 377, textureX, textureY); // Rear Left Leg
		leftAnimTrackModel4[101] = new ModelRendererTurbo(this, 353, 153, textureX, textureY); // Rear Left Leg
		leftAnimTrackModel4[102] = new ModelRendererTurbo(this, 1001, 361, textureX, textureY); // Rear Left Leg
		leftAnimTrackModel4[103] = new ModelRendererTurbo(this, 233, 241, textureX, textureY); // Rear Left Leg
		leftAnimTrackModel4[104] = new ModelRendererTurbo(this, 465, 377, textureX, textureY); // Rear Left Leg
		leftAnimTrackModel4[105] = new ModelRendererTurbo(this, 793, 113, textureX, textureY); // Rear Left Leg
		leftAnimTrackModel4[106] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Rear Left Leg
		leftAnimTrackModel4[107] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Rear Left Leg
		leftAnimTrackModel4[108] = new ModelRendererTurbo(this, 993, 57, textureX, textureY); // Box 455
		leftAnimTrackModel4[109] = new ModelRendererTurbo(this, 897, 257, textureX, textureY); // Box 456
		leftAnimTrackModel4[110] = new ModelRendererTurbo(this, 897, 257, textureX, textureY); // Box 457
		leftAnimTrackModel4[111] = new ModelRendererTurbo(this, 993, 57, textureX, textureY); // Box 458
		leftAnimTrackModel4[112] = new ModelRendererTurbo(this, 993, 57, textureX, textureY); // Box 459
		leftAnimTrackModel4[113] = new ModelRendererTurbo(this, 897, 257, textureX, textureY); // Box 460
		leftAnimTrackModel4[114] = new ModelRendererTurbo(this, 897, 257, textureX, textureY); // Box 461
		leftAnimTrackModel4[115] = new ModelRendererTurbo(this, 993, 57, textureX, textureY); // Box 462

		leftAnimTrackModel4[0].addShapeBox(0F, 0F, 0F, 30, 10, 16, 0F,-10F, 0F, 1.5F, -10F, 0F, 1.5F, -10F, 0F, -1.5F, -10F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Mid Left Leg
		leftAnimTrackModel4[0].setRotationPoint(-19F, -89F, 33F);

		leftAnimTrackModel4[1].addShapeBox(0F, 0F, 0F, 11, 12, 4, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Mid Left Leg
		leftAnimTrackModel4[1].setRotationPoint(-18F, -66F, 42F);

		leftAnimTrackModel4[2].addShapeBox(0F, 0F, 0F, 11, 27, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, -5F, 0F, 3F); // Mid Left Leg
		leftAnimTrackModel4[2].setRotationPoint(-18F, -54F, 44F);

		leftAnimTrackModel4[3].addShapeBox(0F, 0F, 0F, 11, 12, 4, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Mid Left Leg
		leftAnimTrackModel4[3].setRotationPoint(-1F, -66F, 42F);

		leftAnimTrackModel4[4].addShapeBox(0F, 0F, 0F, 11, 27, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -5F, 0F, -3F, -5F, 0F, 3F, 0F, 0F, 3F); // Mid Left Leg
		leftAnimTrackModel4[4].setRotationPoint(-1F, -54F, 44F);

		leftAnimTrackModel4[5].addShapeBox(0F, 0F, 0F, 20, 6, 12, 0F,-6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Mid Left Leg
		leftAnimTrackModel4[5].setRotationPoint(-14F, -35F, 51F);

		leftAnimTrackModel4[6].addShapeBox(0F, 0F, 0F, 20, 8, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Mid Left Leg
		leftAnimTrackModel4[6].setRotationPoint(-14F, -29F, 51F);

		leftAnimTrackModel4[7].addShapeBox(0F, 0F, 0F, 20, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Mid Left Leg
		leftAnimTrackModel4[7].setRotationPoint(-14F, -21F, 51F);

		leftAnimTrackModel4[8].addShapeBox(0F, 0F, 0F, 10, 8, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F); // Mid Left Leg
		leftAnimTrackModel4[8].setRotationPoint(-10F, -7F, 43F);

		leftAnimTrackModel4[9].addShapeBox(0F, 0F, 0F, 9, 8, 28, 0F,0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 5F, 0F, -8F, 0F, 0F, 5F, 0F, 0F, 5F, 5F, 0F, -8F); // Mid Left Leg
		leftAnimTrackModel4[9].setRotationPoint(-19F, -7F, 43F);

		leftAnimTrackModel4[10].addShapeBox(0F, 0F, 0F, 9, 8, 28, 0F,0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 5F, 5F, 0F, -8F, 5F, 0F, -8F, 0F, 0F, 5F); // Mid Left Leg
		leftAnimTrackModel4[10].setRotationPoint(0F, -7F, 43F);

		leftAnimTrackModel4[11].addShapeBox(0F, 0F, 0F, 10, 3, 38, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Mid Left Leg
		leftAnimTrackModel4[11].setRotationPoint(-10F, 1F, 38F);

		leftAnimTrackModel4[12].addShapeBox(0F, 0F, 0F, 14, 3, 38, 0F,0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F); // Mid Left Leg
		leftAnimTrackModel4[12].setRotationPoint(0F, 1F, 38F);

		leftAnimTrackModel4[13].addShapeBox(0F, 0F, 0F, 14, 3, 38, 0F,0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F); // Mid Left Leg
		leftAnimTrackModel4[13].setRotationPoint(-24F, 1F, 38F);

		leftAnimTrackModel4[14].addShapeBox(0F, 0F, 0F, 10, 3, 28, 0F,0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Mid Left Leg
		leftAnimTrackModel4[14].setRotationPoint(-10F, -10F, 43F);

		leftAnimTrackModel4[15].addShapeBox(0F, 0F, 0F, 9, 3, 28, 0F,0F, 0F, -8F, -5F, 0F, -12F, -5F, 0F, -12F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F); // Mid Left Leg
		leftAnimTrackModel4[15].setRotationPoint(0F, -10F, 43F);

		leftAnimTrackModel4[16].addShapeBox(0F, 0F, 0F, 9, 3, 28, 0F,-5F, 0F, -12F, 0F, 0F, -8F, 0F, 0F, -8F, -5F, 0F, -12F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F); // Mid Left Leg
		leftAnimTrackModel4[16].setRotationPoint(-19F, -10F, 43F);

		leftAnimTrackModel4[17].addShapeBox(0F, 0F, 0F, 10, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Mid Left Leg
		leftAnimTrackModel4[17].setRotationPoint(-10F, -13F, 51F);

		leftAnimTrackModel4[18].addShapeBox(0F, 0F, 0F, 4, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Mid Left Leg
		leftAnimTrackModel4[18].setRotationPoint(0F, -13F, 51F);

		leftAnimTrackModel4[19].addShapeBox(0F, 0F, 0F, 4, 3, 12, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Mid Left Leg
		leftAnimTrackModel4[19].setRotationPoint(-14F, -13F, 51F);

		leftAnimTrackModel4[20].addShapeBox(0F, 0F, 0F, 4, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Mid Left Leg
		leftAnimTrackModel4[20].setRotationPoint(-13F, -21F, 55F);

		leftAnimTrackModel4[21].addShapeBox(0F, 0F, 0F, 4, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Mid Left Leg
		leftAnimTrackModel4[21].setRotationPoint(-1F, -21F, 55F);

		leftAnimTrackModel4[22].addShapeBox(0F, 0F, 0F, 30, 10, 16, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Mid Left Leg
		leftAnimTrackModel4[22].setRotationPoint(-19F, -79F, 34.5F);

		leftAnimTrackModel4[23].addShapeBox(0F, 0F, 0F, 30, 10, 16, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F); // Mid Left Leg
		leftAnimTrackModel4[23].setRotationPoint(-19F, -69F, 36F);

		leftAnimTrackModel4[24].addShapeBox(0F, 0F, 0F, 22, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Mid Left Leg
		leftAnimTrackModel4[24].setRotationPoint(-15F, -29F, 46.5F);

		leftAnimTrackModel4[25].addShapeBox(0F, 0F, 0F, 8, 2, 7, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Mid Left Leg
		leftAnimTrackModel4[25].setRotationPoint(-8F, -31F, 44.5F);

		leftAnimTrackModel4[26].addShapeBox(0F, 0F, 0F, 8, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Mid Left Leg
		leftAnimTrackModel4[26].setRotationPoint(-8F, -25F, 44.5F);

		leftAnimTrackModel4[27].addShapeBox(0F, 0F, 0F, 8, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Mid Left Leg
		leftAnimTrackModel4[27].setRotationPoint(-8F, -29F, 44.5F);

		leftAnimTrackModel4[28].addShapeBox(0F, 0F, 0F, 8, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Mid Left Leg
		leftAnimTrackModel4[28].setRotationPoint(-21F, 1F, 65F);

		leftAnimTrackModel4[29].addShapeBox(0F, 0F, 0F, 8, 3, 8, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Mid Left Leg
		leftAnimTrackModel4[29].setRotationPoint(-21F, 1F, 41F);

		leftAnimTrackModel4[30].addShapeBox(0F, 0F, 0F, 8, 3, 8, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Mid Left Leg
		leftAnimTrackModel4[30].setRotationPoint(3F, 1F, 41F);

		leftAnimTrackModel4[31].addShapeBox(0F, 0F, 0F, 8, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Mid Left Leg
		leftAnimTrackModel4[31].setRotationPoint(3F, 1F, 65F);

		leftAnimTrackModel4[32].addShapeBox(0F, 0F, 0F, 4, 3, 8, 0F,0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F); // Mid Left Leg
		leftAnimTrackModel4[32].setRotationPoint(-28F, 1F, 53F);

		leftAnimTrackModel4[33].addShapeBox(0F, 0F, 0F, 7, 7, 4, 0F,-7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // front Left Leg
		leftAnimTrackModel4[33].setRotationPoint(70F, -58F, 30F);
		leftAnimTrackModel4[33].rotateAngleZ = -0.29670597F;

		leftAnimTrackModel4[34].addShapeBox(0F, 7F, 0F, 5, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F); // front Left Leg
		leftAnimTrackModel4[34].setRotationPoint(72F, -58F, 30F);
		leftAnimTrackModel4[34].rotateAngleZ = -0.29670597F;

		leftAnimTrackModel4[35].addShapeBox(0F, 7F, 0F, 5, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F); // front Left Leg
		leftAnimTrackModel4[35].setRotationPoint(75F, -52F, 30F);
		leftAnimTrackModel4[35].rotateAngleZ = -0.29670597F;

		leftAnimTrackModel4[36].addShapeBox(0F, 0F, 0F, 7, 7, 4, 0F,-7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // front Left Leg
		leftAnimTrackModel4[36].setRotationPoint(75F, -52F, 30F);
		leftAnimTrackModel4[36].rotateAngleZ = -0.29670597F;

		leftAnimTrackModel4[37].addShapeBox(0F, 0F, 0F, 18, 6, 12, 0F,-6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // front Left Leg
		leftAnimTrackModel4[37].setRotationPoint(56F, -53F, 28F);

		leftAnimTrackModel4[38].addShapeBox(0F, 0F, 0F, 18, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // front Left Leg
		leftAnimTrackModel4[38].setRotationPoint(56F, -47F, 28F);

		leftAnimTrackModel4[39].addShapeBox(0F, 0F, 0F, 18, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // front Left Leg
		leftAnimTrackModel4[39].setRotationPoint(56F, -41F, 28F);

		leftAnimTrackModel4[40].addShapeBox(0F, 0F, 0F, 18, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // front Left Leg
		leftAnimTrackModel4[40].setRotationPoint(77F, -59F, 28F);

		leftAnimTrackModel4[41].addShapeBox(0F, 0F, 0F, 18, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // front Left Leg
		leftAnimTrackModel4[41].setRotationPoint(77F, -53F, 28F);

		leftAnimTrackModel4[42].addShapeBox(0F, 0F, 0F, 16, 5, 12, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // front Left Leg
		leftAnimTrackModel4[42].setRotationPoint(58F, -22F, 32F);

		leftAnimTrackModel4[43].addShapeBox(0F, 0F, 0F, 16, 5, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // front Left Leg
		leftAnimTrackModel4[43].setRotationPoint(58F, -11F, 32F);

		leftAnimTrackModel4[44].addShapeBox(0F, 0F, 0F, 16, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // front Left Leg
		leftAnimTrackModel4[44].setRotationPoint(58F, -17F, 32F);

		leftAnimTrackModel4[45].addShapeBox(0F, 0F, 0F, 8, 5, 24, 0F,-2F, 0F, -10F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, -10F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F); // front Left Leg
		leftAnimTrackModel4[45].setRotationPoint(54F, 2F, 26F);

		leftAnimTrackModel4[46].addShapeBox(0F, 0F, 0F, 8, 5, 24, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // front Left Leg
		leftAnimTrackModel4[46].setRotationPoint(62F, 2F, 26F);

		leftAnimTrackModel4[47].addShapeBox(0F, 0F, 0F, 8, 5, 24, 0F,0F, 0F, -2F, -2F, 0F, -10F, -2F, 0F, -10F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F); // front Left Leg
		leftAnimTrackModel4[47].setRotationPoint(70F, 2F, 26F);

		leftAnimTrackModel4[48].addShapeBox(0F, 0F, 0F, 8, 3, 24, 0F,0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F); // front Left Leg
		leftAnimTrackModel4[48].setRotationPoint(54F, 7F, 26F);

		leftAnimTrackModel4[49].addShapeBox(0F, 0F, 0F, 8, 3, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // front Left Leg
		leftAnimTrackModel4[49].setRotationPoint(62F, 7F, 26F);

		leftAnimTrackModel4[50].addShapeBox(0F, 0F, 0F, 8, 3, 24, 0F,0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F); // front Left Leg
		leftAnimTrackModel4[50].setRotationPoint(70F, 7F, 26F);

		leftAnimTrackModel4[51].addShapeBox(0F, 0F, 0F, 6, 3, 20, 0F,0F, 0F, -3F, -3F, 0F, -8F, -3F, 0F, -8F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F); // front Left Leg
		leftAnimTrackModel4[51].setRotationPoint(70F, -1F, 28F);

		leftAnimTrackModel4[52].addShapeBox(0F, 0F, 0F, 8, 3, 20, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // front Left Leg
		leftAnimTrackModel4[52].setRotationPoint(62F, -1F, 28F);

		leftAnimTrackModel4[53].addShapeBox(0F, 0F, 0F, 6, 3, 20, 0F,-3F, 0F, -8F, 0F, 0F, -3F, 0F, 0F, -3F, -3F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F); // front Left Leg
		leftAnimTrackModel4[53].setRotationPoint(56F, -1F, 28F);

		leftAnimTrackModel4[54].addShapeBox(0F, 0F, 0F, 8, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // front Left Leg
		leftAnimTrackModel4[54].setRotationPoint(62F, -4F, 31F);

		leftAnimTrackModel4[55].addShapeBox(0F, 0F, 0F, 3, 3, 14, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // front Left Leg
		leftAnimTrackModel4[55].setRotationPoint(59F, -4F, 31F);

		leftAnimTrackModel4[56].addShapeBox(0F, 0F, 0F, 3, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // front Left Leg
		leftAnimTrackModel4[56].setRotationPoint(70F, -4F, 31F);

		leftAnimTrackModel4[57].addShapeBox(0F, 0F, 0F, 4, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // front Left Leg
		leftAnimTrackModel4[57].setRotationPoint(61F, -8F, 35F);

		leftAnimTrackModel4[58].addShapeBox(0F, 0F, 0F, 4, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // front Left Leg
		leftAnimTrackModel4[58].setRotationPoint(67F, -8F, 35F);

		leftAnimTrackModel4[59].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F); // front Left Leg
		leftAnimTrackModel4[59].setRotationPoint(50F, 7F, 36F);

		leftAnimTrackModel4[60].addShapeBox(0F, 0F, 0F, 6, 3, 6, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // front Left Leg
		leftAnimTrackModel4[60].setRotationPoint(55F, 7F, 27F);

		leftAnimTrackModel4[61].addShapeBox(0F, 0F, 0F, 6, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // front Left Leg
		leftAnimTrackModel4[61].setRotationPoint(55F, 7F, 43F);

		leftAnimTrackModel4[62].addShapeBox(0F, 0F, 0F, 6, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // front Left Leg
		leftAnimTrackModel4[62].setRotationPoint(71F, 7F, 43F);

		leftAnimTrackModel4[63].addShapeBox(0F, 0F, 0F, 6, 3, 6, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // front Left Leg
		leftAnimTrackModel4[63].setRotationPoint(71F, 7F, 27F);

		leftAnimTrackModel4[64].addShapeBox(0F, 0F, 0F, 2, 2, 17, 0F,0F, -4F, 2F, 0F, -4F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 4F, 2F, 0F, 4F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Mid Left Leg
		leftAnimTrackModel4[64].setRotationPoint(-11F, -44.5F, 26.5F);
		leftAnimTrackModel4[64].rotateAngleX = -0.10471976F;
		leftAnimTrackModel4[64].rotateAngleY = -0.26179939F;

		leftAnimTrackModel4[65].addShapeBox(0F, 0F, 0F, 16, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Mid Left Leg
		leftAnimTrackModel4[65].setRotationPoint(-12F, -43F, 43.5F);

		leftAnimTrackModel4[66].addShapeBox(0F, 0F, 0F, 4, 3, 8, 0F,0F, 0F, 2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Mid Left Leg
		leftAnimTrackModel4[66].setRotationPoint(14F, 1F, 53F);

		leftAnimTrackModel4[67].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, 0F, 2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // front Left Leg
		leftAnimTrackModel4[67].setRotationPoint(78F, 7F, 36F);

		leftAnimTrackModel4[68].addShapeBox(0F, 0F, 0F, 30, 10, 4, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, -2F, 0F, -1.5F, -2F, 0F, -1.5F, -10F, 0F, 0F, -10F, 0F, 0F, -12F, -2F, 0F, -12F, -2F, 0F); // Mid Left Leg
		leftAnimTrackModel4[68].setRotationPoint(-19F, -69F, 52F);

		leftAnimTrackModel4[69].addShapeBox(0F, 0F, 0F, 30, 10, 4, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, -2F, 0F, -1.5F, -2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Mid Left Leg
		leftAnimTrackModel4[69].setRotationPoint(-19F, -79F, 50.5F);

		leftAnimTrackModel4[70].addShapeBox(0F, 0F, 0F, 30, 10, 4, 0F,-10F, 0F, 1.5F, -10F, 0F, 1.5F, -12F, -2F, -1.5F, -12F, -2F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Mid Left Leg
		leftAnimTrackModel4[70].setRotationPoint(-19F, -89F, 49F);

		leftAnimTrackModel4[71].addShapeBox(0F, 0F, 0F, 6, 22, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F); // Mid Left Leg
		leftAnimTrackModel4[71].setRotationPoint(-7F, -85F, 51.5F);

		leftAnimTrackModel4[72].addShapeBox(0F, 0F, 0F, 14, 4, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // front Left Leg
		leftAnimTrackModel4[72].setRotationPoint(58F, -46F, 27.5F);

		leftAnimTrackModel4[73].addShapeBox(0F, 0F, 0F, 4, 12, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // front Left Leg
		leftAnimTrackModel4[73].setRotationPoint(64F, -20F, 31F);

		leftAnimTrackModel4[74].addShapeBox(0F, 0F, 0F, 18, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Rear Left Leg
		leftAnimTrackModel4[74].setRotationPoint(-76F, -53F, 28F);

		leftAnimTrackModel4[75].addShapeBox(0F, 0F, 0F, 18, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear Left Leg
		leftAnimTrackModel4[75].setRotationPoint(-76F, -59F, 28F);

		leftAnimTrackModel4[76].addShapeBox(0F, 0F, 0F, 18, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Rear Left Leg
		leftAnimTrackModel4[76].setRotationPoint(-97F, -44F, 28F);

		leftAnimTrackModel4[77].addShapeBox(0F, 0F, 0F, 18, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear Left Leg
		leftAnimTrackModel4[77].setRotationPoint(-97F, -50F, 28F);

		leftAnimTrackModel4[78].addShapeBox(0F, 0F, 0F, 18, 6, 12, 0F,-6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear Left Leg
		leftAnimTrackModel4[78].setRotationPoint(-97F, -56F, 28F);

		leftAnimTrackModel4[79].addShapeBox(0F, 0F, 0F, 16, 5, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Rear Left Leg
		leftAnimTrackModel4[79].setRotationPoint(-96F, -11F, 32F);

		leftAnimTrackModel4[80].addShapeBox(0F, 0F, 0F, 16, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear Left Leg
		leftAnimTrackModel4[80].setRotationPoint(-96F, -17F, 32F);

		leftAnimTrackModel4[81].addShapeBox(0F, 0F, 0F, 16, 5, 12, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear Left Leg
		leftAnimTrackModel4[81].setRotationPoint(-96F, -22F, 32F);

		leftAnimTrackModel4[82].addShapeBox(0F, 0F, 0F, 4, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear Left Leg
		leftAnimTrackModel4[82].setRotationPoint(-87F, -8F, 35F);

		leftAnimTrackModel4[83].addShapeBox(0F, 0F, 0F, 4, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear Left Leg
		leftAnimTrackModel4[83].setRotationPoint(-93F, -8F, 35F);

		leftAnimTrackModel4[84].addShapeBox(0F, 0F, 0F, 3, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Rear Left Leg
		leftAnimTrackModel4[84].setRotationPoint(-84F, -4F, 31F);

		leftAnimTrackModel4[85].addShapeBox(0F, 0F, 0F, 6, 3, 20, 0F,-3F, 0F, -8F, 0F, 0F, -3F, 0F, 0F, -3F, -3F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F); // Rear Left Leg
		leftAnimTrackModel4[85].setRotationPoint(-98F, -1F, 28F);

		leftAnimTrackModel4[86].addShapeBox(0F, 0F, 0F, 3, 3, 14, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Rear Left Leg
		leftAnimTrackModel4[86].setRotationPoint(-95F, -4F, 31F);

		leftAnimTrackModel4[87].addShapeBox(0F, 0F, 0F, 8, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear Left Leg
		leftAnimTrackModel4[87].setRotationPoint(-92F, -4F, 31F);

		leftAnimTrackModel4[88].addShapeBox(0F, 0F, 0F, 8, 3, 20, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear Left Leg
		leftAnimTrackModel4[88].setRotationPoint(-92F, -1F, 28F);

		leftAnimTrackModel4[89].addShapeBox(0F, 0F, 0F, 8, 5, 24, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear Left Leg
		leftAnimTrackModel4[89].setRotationPoint(-92F, 2F, 26F);

		leftAnimTrackModel4[90].addShapeBox(0F, 0F, 0F, 8, 5, 24, 0F,-2F, 0F, -10F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, -10F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F); // Rear Left Leg
		leftAnimTrackModel4[90].setRotationPoint(-100F, 2F, 26F);

		leftAnimTrackModel4[91].addShapeBox(0F, 0F, 0F, 6, 3, 20, 0F,0F, 0F, -3F, -3F, 0F, -8F, -3F, 0F, -8F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F); // Rear Left Leg
		leftAnimTrackModel4[91].setRotationPoint(-84F, -1F, 28F);

		leftAnimTrackModel4[92].addShapeBox(0F, 0F, 0F, 8, 5, 24, 0F,0F, 0F, -2F, -2F, 0F, -10F, -2F, 0F, -10F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F); // Rear Left Leg
		leftAnimTrackModel4[92].setRotationPoint(-84F, 2F, 26F);

		leftAnimTrackModel4[93].addShapeBox(0F, 0F, 0F, 6, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear Left Leg
		leftAnimTrackModel4[93].setRotationPoint(-99F, 7F, 43F);

		leftAnimTrackModel4[94].addShapeBox(0F, 0F, 0F, 8, 3, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear Left Leg
		leftAnimTrackModel4[94].setRotationPoint(-92F, 7F, 26F);

		leftAnimTrackModel4[95].addShapeBox(0F, 0F, 0F, 6, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear Left Leg
		leftAnimTrackModel4[95].setRotationPoint(-83F, 7F, 43F);

		leftAnimTrackModel4[96].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F); // Rear Left Leg
		leftAnimTrackModel4[96].setRotationPoint(-104F, 7F, 36F);

		leftAnimTrackModel4[97].addShapeBox(0F, 0F, 0F, 8, 3, 24, 0F,0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F); // Rear Left Leg
		leftAnimTrackModel4[97].setRotationPoint(-84F, 7F, 26F);

		leftAnimTrackModel4[98].addShapeBox(0F, 0F, 0F, 8, 3, 24, 0F,0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F); // Rear Left Leg
		leftAnimTrackModel4[98].setRotationPoint(-100F, 7F, 26F);

		leftAnimTrackModel4[99].addShapeBox(0F, 0F, 0F, 6, 3, 6, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear Left Leg
		leftAnimTrackModel4[99].setRotationPoint(-83F, 7F, 27F);

		leftAnimTrackModel4[100].addShapeBox(0F, 0F, 0F, 6, 3, 6, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear Left Leg
		leftAnimTrackModel4[100].setRotationPoint(-99F, 7F, 27F);

		leftAnimTrackModel4[101].addShapeBox(-6F, 5F, 0F, 5, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F); // Rear Left Leg
		leftAnimTrackModel4[101].setRotationPoint(-73F, -50F, 30F);
		leftAnimTrackModel4[101].rotateAngleZ = -0.2443461F;

		leftAnimTrackModel4[102].addShapeBox(0F, -2F, 0F, 7, 7, 4, 0F,-7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear Left Leg
		leftAnimTrackModel4[102].setRotationPoint(-79F, -50F, 30F);
		leftAnimTrackModel4[102].rotateAngleZ = -0.2443461F;

		leftAnimTrackModel4[103].addShapeBox(-6F, 5F, 0F, 5, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F); // Rear Left Leg
		leftAnimTrackModel4[103].setRotationPoint(-76F, -56F, 30F);
		leftAnimTrackModel4[103].rotateAngleZ = -0.2443461F;

		leftAnimTrackModel4[104].addShapeBox(0F, -2F, 0F, 7, 7, 4, 0F,-7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear Left Leg
		leftAnimTrackModel4[104].setRotationPoint(-84F, -56F, 30F);
		leftAnimTrackModel4[104].rotateAngleZ = -0.2443461F;

		leftAnimTrackModel4[105].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, 0F, 2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Rear Left Leg
		leftAnimTrackModel4[105].setRotationPoint(-76F, 7F, 36F);

		leftAnimTrackModel4[106].addShapeBox(0F, 0F, 0F, 14, 4, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear Left Leg
		leftAnimTrackModel4[106].setRotationPoint(-95F, -49F, 27.5F);

		leftAnimTrackModel4[107].addShapeBox(0F, 0F, 0F, 4, 12, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear Left Leg
		leftAnimTrackModel4[107].setRotationPoint(-90F, -20F, 31F);

		leftAnimTrackModel4[108].addShapeBox(0F, 0F, 0F, 11, 12, 4, 0F,-5F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -5F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F); // Box 455
		leftAnimTrackModel4[108].setRotationPoint(-99F, -48F, 34F);

		leftAnimTrackModel4[109].addShapeBox(0F, 0F, 0F, 11, 27, 4, 0F,-2F, -4F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, -7F, -4F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, -7F, -4F, 0F); // Box 456
		leftAnimTrackModel4[109].setRotationPoint(-99F, -41F, 34F);

		leftAnimTrackModel4[110].addShapeBox(0F, 0F, 0F, 11, 27, 4, 0F,-2F, -4F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, -7F, -4F, 0F, -7F, -4F, 0F, -2F, -4F, 0F); // Box 457
		leftAnimTrackModel4[110].setRotationPoint(-88F, -41F, 34F);

		leftAnimTrackModel4[111].addShapeBox(0F, 0F, 0F, 11, 12, 4, 0F,-2F, -1F, 0F, -5F, -1F, 0F, -5F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F); // Box 458
		leftAnimTrackModel4[111].setRotationPoint(-88F, -48F, 34F);

		leftAnimTrackModel4[112].addShapeBox(0F, 0F, 0F, 11, 12, 4, 0F,-5F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -5F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F); // Box 459
		leftAnimTrackModel4[112].setRotationPoint(55F, -44F, 34F);

		leftAnimTrackModel4[113].addShapeBox(0F, 0F, 0F, 11, 27, 4, 0F,-2F, -4F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, -7F, -4F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, -7F, -4F, 0F); // Box 460
		leftAnimTrackModel4[113].setRotationPoint(55F, -37F, 34F);

		leftAnimTrackModel4[114].addShapeBox(0F, 0F, 0F, 11, 27, 4, 0F,-2F, -4F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, -7F, -4F, 0F, -7F, -4F, 0F, -2F, -4F, 0F); // Box 461
		leftAnimTrackModel4[114].setRotationPoint(66F, -37F, 34F);

		leftAnimTrackModel4[115].addShapeBox(0F, 0F, 0F, 11, 12, 4, 0F,-2F, -1F, 0F, -5F, -1F, 0F, -5F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F); // Box 462
		leftAnimTrackModel4[115].setRotationPoint(66F, -44F, 34F);
	}

	private void initrightAnimTrackModel1_0()
	{
		rightAnimTrackModel1[0] = new ModelRendererTurbo(this, 81, 361, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel1[1] = new ModelRendererTurbo(this, 993, 177, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel1[2] = new ModelRendererTurbo(this, 1, 297, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel1[3] = new ModelRendererTurbo(this, 705, 225, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel1[4] = new ModelRendererTurbo(this, 57, 297, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel1[5] = new ModelRendererTurbo(this, 113, 321, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel1[6] = new ModelRendererTurbo(this, 353, 353, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel1[7] = new ModelRendererTurbo(this, 465, 353, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel1[8] = new ModelRendererTurbo(this, 153, 361, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel1[9] = new ModelRendererTurbo(this, 505, 361, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel1[10] = new ModelRendererTurbo(this, 793, 361, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel1[11] = new ModelRendererTurbo(this, 193, 361, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel1[12] = new ModelRendererTurbo(this, 545, 361, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel1[13] = new ModelRendererTurbo(this, 833, 377, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel1[14] = new ModelRendererTurbo(this, 945, 361, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel1[15] = new ModelRendererTurbo(this, 1, 385, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel1[16] = new ModelRendererTurbo(this, 625, 385, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel1[17] = new ModelRendererTurbo(this, 977, 249, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel1[18] = new ModelRendererTurbo(this, 881, 161, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel1[19] = new ModelRendererTurbo(this, 737, 225, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel1[20] = new ModelRendererTurbo(this, 441, 89, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel1[21] = new ModelRendererTurbo(this, 105, 113, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel1[22] = new ModelRendererTurbo(this, 673, 385, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel1[23] = new ModelRendererTurbo(this, 65, 401, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel1[24] = new ModelRendererTurbo(this, 129, 265, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel1[25] = new ModelRendererTurbo(this, 201, 145, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel1[26] = new ModelRendererTurbo(this, 337, 257, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel1[27] = new ModelRendererTurbo(this, 537, 257, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel1[28] = new ModelRendererTurbo(this, 241, 265, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel1[29] = new ModelRendererTurbo(this, 617, 273, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel1[30] = new ModelRendererTurbo(this, 897, 289, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel1[31] = new ModelRendererTurbo(this, 625, 297, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel1[32] = new ModelRendererTurbo(this, 601, 121, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel1[33] = new ModelRendererTurbo(this, 641, 417, textureX, textureY); // Front Right Leg
		rightAnimTrackModel1[34] = new ModelRendererTurbo(this, 697, 417, textureX, textureY); // Front Right Leg
		rightAnimTrackModel1[35] = new ModelRendererTurbo(this, 929, 225, textureX, textureY); // Front Right Leg
		rightAnimTrackModel1[36] = new ModelRendererTurbo(this, 865, 281, textureX, textureY); // Front Right Leg
		rightAnimTrackModel1[37] = new ModelRendererTurbo(this, 353, 137, textureX, textureY); // Front Right Leg
		rightAnimTrackModel1[38] = new ModelRendererTurbo(this, 489, 145, textureX, textureY); // Front Right Leg
		rightAnimTrackModel1[39] = new ModelRendererTurbo(this, 281, 425, textureX, textureY); // Front Right Leg
		rightAnimTrackModel1[40] = new ModelRendererTurbo(this, 345, 425, textureX, textureY); // Front Right Leg
		rightAnimTrackModel1[41] = new ModelRendererTurbo(this, 409, 425, textureX, textureY); // Front Right Leg
		rightAnimTrackModel1[42] = new ModelRendererTurbo(this, 561, 313, textureX, textureY); // Front Right Leg
		rightAnimTrackModel1[43] = new ModelRendererTurbo(this, 1, 329, textureX, textureY); // Front Right Leg
		rightAnimTrackModel1[44] = new ModelRendererTurbo(this, 57, 329, textureX, textureY); // Front Right Leg
		rightAnimTrackModel1[45] = new ModelRendererTurbo(this, 561, 329, textureX, textureY); // Front Right Leg
		rightAnimTrackModel1[46] = new ModelRendererTurbo(this, 745, 425, textureX, textureY); // Front Right Leg
		rightAnimTrackModel1[47] = new ModelRendererTurbo(this, 841, 425, textureX, textureY); // Front Right Leg
		rightAnimTrackModel1[48] = new ModelRendererTurbo(this, 57, 433, textureX, textureY); // Front Right Leg
		rightAnimTrackModel1[49] = new ModelRendererTurbo(this, 881, 321, textureX, textureY); // Front Right Leg
		rightAnimTrackModel1[50] = new ModelRendererTurbo(this, 937, 329, textureX, textureY); // Front Right Leg
		rightAnimTrackModel1[51] = new ModelRendererTurbo(this, 457, 425, textureX, textureY); // Front Right Leg
		rightAnimTrackModel1[52] = new ModelRendererTurbo(this, 905, 425, textureX, textureY); // Front Right Leg
		rightAnimTrackModel1[53] = new ModelRendererTurbo(this, 257, 409, textureX, textureY); // Front Right Leg
		rightAnimTrackModel1[54] = new ModelRendererTurbo(this, 97, 433, textureX, textureY); // Front Right Leg
		rightAnimTrackModel1[55] = new ModelRendererTurbo(this, 561, 433, textureX, textureY); // Front Right Leg
		rightAnimTrackModel1[56] = new ModelRendererTurbo(this, 641, 433, textureX, textureY); // Front Right Leg
		rightAnimTrackModel1[57] = new ModelRendererTurbo(this, 657, 433, textureX, textureY); // Front Right Leg
		rightAnimTrackModel1[58] = new ModelRendererTurbo(this, 785, 433, textureX, textureY); // Front Right Leg
		rightAnimTrackModel1[59] = new ModelRendererTurbo(this, 129, 441, textureX, textureY); // Front Right Leg
		rightAnimTrackModel1[60] = new ModelRendererTurbo(this, 201, 441, textureX, textureY); // Front Right Leg
		rightAnimTrackModel1[61] = new ModelRendererTurbo(this, 217, 337, textureX, textureY); // Front Right Leg
		rightAnimTrackModel1[62] = new ModelRendererTurbo(this, 881, 337, textureX, textureY); // Front Right Leg
		rightAnimTrackModel1[63] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Front Right Leg
		rightAnimTrackModel1[64] = new ModelRendererTurbo(this, 937, 345, textureX, textureY); // Front Right Leg
		rightAnimTrackModel1[65] = new ModelRendererTurbo(this, 985, 345, textureX, textureY); // Front Right Leg
		rightAnimTrackModel1[66] = new ModelRendererTurbo(this, 489, 441, textureX, textureY); // Front Right Leg
		rightAnimTrackModel1[67] = new ModelRendererTurbo(this, 929, 441, textureX, textureY); // Front Right Leg
		rightAnimTrackModel1[68] = new ModelRendererTurbo(this, 809, 465, textureX, textureY); // Rear Right Leg
		rightAnimTrackModel1[69] = new ModelRendererTurbo(this, 169, 473, textureX, textureY); // Rear Right Leg
		rightAnimTrackModel1[70] = new ModelRendererTurbo(this, 321, 473, textureX, textureY); // Rear Right Leg
		rightAnimTrackModel1[71] = new ModelRendererTurbo(this, 473, 473, textureX, textureY); // Rear Right Leg
		rightAnimTrackModel1[72] = new ModelRendererTurbo(this, 857, 473, textureX, textureY); // Rear Right Leg
		rightAnimTrackModel1[73] = new ModelRendererTurbo(this, 921, 473, textureX, textureY); // Rear Right Leg
		rightAnimTrackModel1[74] = new ModelRendererTurbo(this, 377, 481, textureX, textureY); // Rear Right Leg
		rightAnimTrackModel1[75] = new ModelRendererTurbo(this, 713, 481, textureX, textureY); // Rear Right Leg
		rightAnimTrackModel1[76] = new ModelRendererTurbo(this, 489, 377, textureX, textureY); // Rear Right Leg
		rightAnimTrackModel1[77] = new ModelRendererTurbo(this, 553, 377, textureX, textureY); // Rear Right Leg
		rightAnimTrackModel1[78] = new ModelRendererTurbo(this, 633, 465, textureX, textureY); // Rear Right Leg
		rightAnimTrackModel1[79] = new ModelRendererTurbo(this, 961, 473, textureX, textureY); // Rear Right Leg
		rightAnimTrackModel1[80] = new ModelRendererTurbo(this, 57, 481, textureX, textureY); // Rear Right Leg
		rightAnimTrackModel1[81] = new ModelRendererTurbo(this, 209, 481, textureX, textureY); // Rear Right Leg
		rightAnimTrackModel1[82] = new ModelRendererTurbo(this, 73, 481, textureX, textureY); // Rear Right Leg
		rightAnimTrackModel1[83] = new ModelRendererTurbo(this, 417, 481, textureX, textureY); // Rear Right Leg
		rightAnimTrackModel1[84] = new ModelRendererTurbo(this, 513, 481, textureX, textureY); // Rear Right Leg
		rightAnimTrackModel1[85] = new ModelRendererTurbo(this, 809, 481, textureX, textureY); // Rear Right Leg
		rightAnimTrackModel1[86] = new ModelRendererTurbo(this, 1, 497, textureX, textureY); // Rear Right Leg
		rightAnimTrackModel1[87] = new ModelRendererTurbo(this, 841, 377, textureX, textureY); // Rear Right Leg
		rightAnimTrackModel1[88] = new ModelRendererTurbo(this, 233, 497, textureX, textureY); // Rear Right Leg
		rightAnimTrackModel1[89] = new ModelRendererTurbo(this, 937, 377, textureX, textureY); // Rear Right Leg
		rightAnimTrackModel1[90] = new ModelRendererTurbo(this, 697, 89, textureX, textureY); // Rear Right Leg
		rightAnimTrackModel1[91] = new ModelRendererTurbo(this, 305, 497, textureX, textureY); // Rear Right Leg
		rightAnimTrackModel1[92] = new ModelRendererTurbo(this, 465, 497, textureX, textureY); // Rear Right Leg
		rightAnimTrackModel1[93] = new ModelRendererTurbo(this, 49, 385, textureX, textureY); // Rear Right Leg
		rightAnimTrackModel1[94] = new ModelRendererTurbo(this, 617, 385, textureX, textureY); // Rear Right Leg
		rightAnimTrackModel1[95] = new ModelRendererTurbo(this, 929, 257, textureX, textureY); // Rear Right Leg
		rightAnimTrackModel1[96] = new ModelRendererTurbo(this, 1001, 377, textureX, textureY); // Rear Right Leg
		rightAnimTrackModel1[97] = new ModelRendererTurbo(this, 1, 265, textureX, textureY); // Rear Right Leg
		rightAnimTrackModel1[98] = new ModelRendererTurbo(this, 257, 385, textureX, textureY); // Rear Right Leg
		rightAnimTrackModel1[99] = new ModelRendererTurbo(this, 689, 145, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel1[100] = new ModelRendererTurbo(this, 281, 497, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel1[101] = new ModelRendererTurbo(this, 1, 401, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel1[102] = new ModelRendererTurbo(this, 281, 113, textureX, textureY); // Rear Right Leg
		rightAnimTrackModel1[103] = new ModelRendererTurbo(this, 201, 161, textureX, textureY); // Front Right Leg
		rightAnimTrackModel1[104] = new ModelRendererTurbo(this, 953, 585, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel1[105] = new ModelRendererTurbo(this, 121, 593, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel1[106] = new ModelRendererTurbo(this, 193, 593, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel1[107] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel1[108] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Front Right Leg
		rightAnimTrackModel1[109] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Rear Right Leg
		rightAnimTrackModel1[110] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Rear Right Leg
		rightAnimTrackModel1[111] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Front Right Leg
		rightAnimTrackModel1[112] = new ModelRendererTurbo(this, 1, 329, textureX, textureY); // Box 459
		rightAnimTrackModel1[113] = new ModelRendererTurbo(this, 561, 329, textureX, textureY); // Box 460
		rightAnimTrackModel1[114] = new ModelRendererTurbo(this, 57, 329, textureX, textureY); // Box 461
		rightAnimTrackModel1[115] = new ModelRendererTurbo(this, 561, 313, textureX, textureY); // Box 462

		rightAnimTrackModel1[0].addShapeBox(0F, 0F, 0F, 30, 10, 16, 0F,-10F, 0F, -1.5F, -10F, 0F, -1.5F, -10F, 0F, 1.5F, -10F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Mid Right Leg
		rightAnimTrackModel1[0].setRotationPoint(-25F, -83F, -49F);

		rightAnimTrackModel1[1].addShapeBox(-14F, 5F, -47F, 11, 12, 4, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Mid Right Leg
		rightAnimTrackModel1[1].setRotationPoint(-10F, -66F, 0F);
		rightAnimTrackModel1[1].rotateAngleZ = -0.38397244F;

		rightAnimTrackModel1[2].addShapeBox(-14F, 17F, -49F, 11, 27, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 7F, 3F, 0F, 4F, 3F, 0F, 4F, -3F, -5F, 7F, -3F); // Mid Right Leg
		rightAnimTrackModel1[2].setRotationPoint(-10F, -66F, 0F);
		rightAnimTrackModel1[2].rotateAngleZ = -0.38397244F;

		rightAnimTrackModel1[3].addShapeBox(3F, 5F, -47F, 11, 12, 4, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Mid Right Leg
		rightAnimTrackModel1[3].setRotationPoint(-10F, -66F, 0F);
		rightAnimTrackModel1[3].rotateAngleZ = -0.38397244F;

		rightAnimTrackModel1[4].addShapeBox(3F, 17F, -49F, 11, 27, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -5F, 0F, 3F, -5F, 0F, -3F, 0F, 0F, -3F); // Mid Right Leg
		rightAnimTrackModel1[4].setRotationPoint(-10F, -66F, 0F);
		rightAnimTrackModel1[4].rotateAngleZ = -0.38397244F;

		rightAnimTrackModel1[5].addShapeBox(0F, 0F, 0F, 20, 6, 12, 0F,-6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Mid Right Leg
		rightAnimTrackModel1[5].setRotationPoint(-38F, -29F, -64F);

		rightAnimTrackModel1[6].addShapeBox(0F, 0F, 0F, 20, 8, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Mid Right Leg
		rightAnimTrackModel1[6].setRotationPoint(-38F, -23F, -64F);

		rightAnimTrackModel1[7].addShapeBox(0F, 0F, 0F, 20, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Mid Right Leg
		rightAnimTrackModel1[7].setRotationPoint(-38F, -15F, -64F);

		rightAnimTrackModel1[8].addShapeBox(0F, 0F, 0F, 10, 8, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F); // Mid Right Leg
		rightAnimTrackModel1[8].setRotationPoint(-34F, -1F, -72F);

		rightAnimTrackModel1[9].addShapeBox(0F, 0F, 0F, 9, 8, 28, 0F,0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 5F, 0F, -8F, 0F, 0F, 5F, 0F, 0F, 5F, 5F, 0F, -8F); // Mid Right Leg
		rightAnimTrackModel1[9].setRotationPoint(-43F, -1F, -72F);

		rightAnimTrackModel1[10].addShapeBox(0F, 0F, 0F, 9, 8, 28, 0F,0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 5F, 5F, 0F, -8F, 5F, 0F, -8F, 0F, 0F, 5F); // Mid Right Leg
		rightAnimTrackModel1[10].setRotationPoint(-24F, -1F, -72F);

		rightAnimTrackModel1[11].addShapeBox(0F, 0F, 0F, 10, 3, 38, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Mid Right Leg
		rightAnimTrackModel1[11].setRotationPoint(-34F, 7F, -77F);

		rightAnimTrackModel1[12].addShapeBox(0F, 0F, 0F, 14, 3, 38, 0F,0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F); // Mid Right Leg
		rightAnimTrackModel1[12].setRotationPoint(-24F, 7F, -77F);

		rightAnimTrackModel1[13].addShapeBox(0F, 0F, 0F, 14, 3, 38, 0F,0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F); // Mid Right Leg
		rightAnimTrackModel1[13].setRotationPoint(-48F, 7F, -77F);

		rightAnimTrackModel1[14].addShapeBox(0F, 0F, 0F, 10, 3, 28, 0F,0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Mid Right Leg
		rightAnimTrackModel1[14].setRotationPoint(-34F, -4F, -72F);

		rightAnimTrackModel1[15].addShapeBox(0F, 0F, 0F, 9, 3, 28, 0F,0F, 0F, -8F, -5F, 0F, -12F, -5F, 0F, -12F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F); // Mid Right Leg
		rightAnimTrackModel1[15].setRotationPoint(-24F, -4F, -72F);

		rightAnimTrackModel1[16].addShapeBox(0F, 0F, 0F, 9, 3, 28, 0F,-5F, 0F, -12F, 0F, 0F, -8F, 0F, 0F, -8F, -5F, 0F, -12F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F); // Mid Right Leg
		rightAnimTrackModel1[16].setRotationPoint(-43F, -4F, -72F);

		rightAnimTrackModel1[17].addShapeBox(0F, 0F, 0F, 10, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Mid Right Leg
		rightAnimTrackModel1[17].setRotationPoint(-34F, -7F, -64F);

		rightAnimTrackModel1[18].addShapeBox(0F, 0F, 0F, 4, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Mid Right Leg
		rightAnimTrackModel1[18].setRotationPoint(-24F, -7F, -64F);

		rightAnimTrackModel1[19].addShapeBox(0F, 0F, 0F, 4, 3, 12, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Mid Right Leg
		rightAnimTrackModel1[19].setRotationPoint(-38F, -7F, -64F);

		rightAnimTrackModel1[20].addShapeBox(0F, 0F, 0F, 4, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Mid Right Leg
		rightAnimTrackModel1[20].setRotationPoint(-37F, -15F, -60F);

		rightAnimTrackModel1[21].addShapeBox(0F, 0F, 0F, 4, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Mid Right Leg
		rightAnimTrackModel1[21].setRotationPoint(-25F, -15F, -60F);

		rightAnimTrackModel1[22].addShapeBox(0F, 0F, 0F, 30, 10, 16, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Mid Right Leg
		rightAnimTrackModel1[22].setRotationPoint(-25F, -73F, -50.5F);

		rightAnimTrackModel1[23].addShapeBox(0F, 0F, 0F, 30, 10, 16, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F); // Mid Right Leg
		rightAnimTrackModel1[23].setRotationPoint(-25F, -63F, -52F);

		rightAnimTrackModel1[24].addShapeBox(0F, 0F, 0F, 22, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Mid Right Leg
		rightAnimTrackModel1[24].setRotationPoint(-39F, -23F, -52.5F);

		rightAnimTrackModel1[25].addShapeBox(0F, 0F, 0F, 8, 2, 7, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Mid Right Leg
		rightAnimTrackModel1[25].setRotationPoint(-32F, -25F, -52.5F);

		rightAnimTrackModel1[26].addShapeBox(0F, 0F, 0F, 8, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Mid Right Leg
		rightAnimTrackModel1[26].setRotationPoint(-32F, -19F, -52.5F);

		rightAnimTrackModel1[27].addShapeBox(0F, 0F, 0F, 8, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Mid Right Leg
		rightAnimTrackModel1[27].setRotationPoint(-32F, -23F, -52.5F);

		rightAnimTrackModel1[28].addShapeBox(0F, 0F, 0F, 8, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Mid Right Leg
		rightAnimTrackModel1[28].setRotationPoint(-45F, 7F, -50F);

		rightAnimTrackModel1[29].addShapeBox(0F, 0F, 0F, 8, 3, 8, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Mid Right Leg
		rightAnimTrackModel1[29].setRotationPoint(-45F, 7F, -74F);

		rightAnimTrackModel1[30].addShapeBox(0F, 0F, 0F, 8, 3, 8, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Mid Right Leg
		rightAnimTrackModel1[30].setRotationPoint(-21F, 7F, -74F);

		rightAnimTrackModel1[31].addShapeBox(0F, 0F, 0F, 8, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Mid Right Leg
		rightAnimTrackModel1[31].setRotationPoint(-21F, 7F, -50F);

		rightAnimTrackModel1[32].addShapeBox(0F, 0F, 0F, 4, 3, 8, 0F,0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F); // Mid Right Leg
		rightAnimTrackModel1[32].setRotationPoint(-52F, 7F, -62F);

		rightAnimTrackModel1[33].addShapeBox(0F, 0F, 0F, 18, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Front Right Leg
		rightAnimTrackModel1[33].setRotationPoint(77F, -53F, -36F);

		rightAnimTrackModel1[34].addShapeBox(0F, 0F, 0F, 18, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Front Right Leg
		rightAnimTrackModel1[34].setRotationPoint(77F, -59F, -36F);

		rightAnimTrackModel1[35].addShapeBox(0F, 0F, 0F, 7, 7, 4, 0F,-7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Front Right Leg
		rightAnimTrackModel1[35].setRotationPoint(70F, -56F, -34F);

		rightAnimTrackModel1[36].addShapeBox(0F, 0F, 0F, 7, 7, 4, 0F,-7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Front Right Leg
		rightAnimTrackModel1[36].setRotationPoint(75F, -50F, -34F);

		rightAnimTrackModel1[37].addShapeBox(0F, 0F, 0F, 5, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F); // Front Right Leg
		rightAnimTrackModel1[37].setRotationPoint(75F, -43F, -34F);

		rightAnimTrackModel1[38].addShapeBox(0F, 0F, 0F, 5, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F); // Front Right Leg
		rightAnimTrackModel1[38].setRotationPoint(72F, -49F, -34F);

		rightAnimTrackModel1[39].addShapeBox(0F, 0F, 0F, 18, 6, 12, 0F,-6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Front Right Leg
		rightAnimTrackModel1[39].setRotationPoint(56F, -46F, -40F);

		rightAnimTrackModel1[40].addShapeBox(0F, 0F, 0F, 18, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Front Right Leg
		rightAnimTrackModel1[40].setRotationPoint(56F, -40F, -40F);

		rightAnimTrackModel1[41].addShapeBox(0F, 0F, 0F, 18, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Front Right Leg
		rightAnimTrackModel1[41].setRotationPoint(56F, -34F, -40F);

		rightAnimTrackModel1[42].addShapeBox(0F, 0F, 0F, 6, 9, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Front Right Leg
		rightAnimTrackModel1[42].setRotationPoint(63F, -29F, -38F);

		rightAnimTrackModel1[43].addShapeBox(0F, 0F, 0F, 15, 9, 4, 0F,0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 0F, 0F); // Front Right Leg
		rightAnimTrackModel1[43].setRotationPoint(69F, -29F, -38F);

		rightAnimTrackModel1[44].addShapeBox(0F, 0F, 0F, 9, 8, 4, 0F,0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 13F, 0F, 0F, 13F, 0F, 0F, 1F, 0F); // Front Right Leg
		rightAnimTrackModel1[44].setRotationPoint(80F, -37F, -38F);

		rightAnimTrackModel1[45].addShapeBox(0F, 0F, 0F, 6, 6, 4, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F); // Front Right Leg
		rightAnimTrackModel1[45].setRotationPoint(74F, -40F, -38F);

		rightAnimTrackModel1[46].addShapeBox(0F, 0F, 0F, 16, 5, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Front Right Leg
		rightAnimTrackModel1[46].setRotationPoint(81F, -11F, -44F);

		rightAnimTrackModel1[47].addShapeBox(0F, 0F, 0F, 16, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Front Right Leg
		rightAnimTrackModel1[47].setRotationPoint(81F, -17F, -44F);

		rightAnimTrackModel1[48].addShapeBox(0F, 0F, 0F, 16, 5, 12, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Front Right Leg
		rightAnimTrackModel1[48].setRotationPoint(81F, -22F, -44F);

		rightAnimTrackModel1[49].addShapeBox(0F, 0F, 0F, 4, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Front Right Leg
		rightAnimTrackModel1[49].setRotationPoint(90F, -8F, -41F);

		rightAnimTrackModel1[50].addShapeBox(0F, 0F, 0F, 4, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Front Right Leg
		rightAnimTrackModel1[50].setRotationPoint(84F, -8F, -41F);

		rightAnimTrackModel1[51].addShapeBox(0F, 0F, 0F, 6, 3, 20, 0F,-3F, 0F, -8F, 0F, 0F, -3F, 0F, 0F, -3F, -3F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F); // Front Right Leg
		rightAnimTrackModel1[51].setRotationPoint(79F, -1F, -48F);

		rightAnimTrackModel1[52].addShapeBox(0F, 0F, 0F, 8, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Front Right Leg
		rightAnimTrackModel1[52].setRotationPoint(85F, -4F, -45F);

		rightAnimTrackModel1[53].addShapeBox(0F, 0F, 0F, 3, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Front Right Leg
		rightAnimTrackModel1[53].setRotationPoint(93F, -4F, -45F);

		rightAnimTrackModel1[54].addShapeBox(0F, 0F, 0F, 6, 3, 20, 0F,0F, 0F, -3F, -3F, 0F, -8F, -3F, 0F, -8F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F); // Front Right Leg
		rightAnimTrackModel1[54].setRotationPoint(93F, -1F, -48F);

		rightAnimTrackModel1[55].addShapeBox(0F, 0F, 0F, 8, 3, 20, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Front Right Leg
		rightAnimTrackModel1[55].setRotationPoint(85F, -1F, -48F);

		rightAnimTrackModel1[56].addShapeBox(0F, 0F, 0F, 3, 3, 14, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Front Right Leg
		rightAnimTrackModel1[56].setRotationPoint(82F, -4F, -45F);

		rightAnimTrackModel1[57].addShapeBox(0F, 0F, 0F, 8, 5, 24, 0F,-2F, 0F, -10F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, -10F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F); // Front Right Leg
		rightAnimTrackModel1[57].setRotationPoint(77F, 2F, -50F);

		rightAnimTrackModel1[58].addShapeBox(0F, 0F, 0F, 8, 5, 24, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Front Right Leg
		rightAnimTrackModel1[58].setRotationPoint(85F, 2F, -50F);

		rightAnimTrackModel1[59].addShapeBox(0F, 0F, 0F, 8, 5, 24, 0F,0F, 0F, -2F, -2F, 0F, -10F, -2F, 0F, -10F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F); // Front Right Leg
		rightAnimTrackModel1[59].setRotationPoint(93F, 2F, -50F);

		rightAnimTrackModel1[60].addShapeBox(0F, 0F, 0F, 8, 3, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Front Right Leg
		rightAnimTrackModel1[60].setRotationPoint(85F, 7F, -50F);

		rightAnimTrackModel1[61].addShapeBox(0F, 0F, 0F, 6, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Front Right Leg
		rightAnimTrackModel1[61].setRotationPoint(94F, 7F, -33F);

		rightAnimTrackModel1[62].addShapeBox(0F, 0F, 0F, 6, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Front Right Leg
		rightAnimTrackModel1[62].setRotationPoint(78F, 7F, -33F);

		rightAnimTrackModel1[63].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F); // Front Right Leg
		rightAnimTrackModel1[63].setRotationPoint(73F, 7F, -40F);

		rightAnimTrackModel1[64].addShapeBox(0F, 0F, 0F, 6, 3, 6, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Front Right Leg
		rightAnimTrackModel1[64].setRotationPoint(94F, 7F, -49F);

		rightAnimTrackModel1[65].addShapeBox(0F, 0F, 0F, 6, 3, 6, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Front Right Leg
		rightAnimTrackModel1[65].setRotationPoint(78F, 7F, -49F);

		rightAnimTrackModel1[66].addShapeBox(0F, 0F, 0F, 8, 3, 24, 0F,0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F); // Front Right Leg
		rightAnimTrackModel1[66].setRotationPoint(93F, 7F, -50F);

		rightAnimTrackModel1[67].addShapeBox(0F, 0F, 0F, 8, 3, 24, 0F,0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F); // Front Right Leg
		rightAnimTrackModel1[67].setRotationPoint(77F, 7F, -50F);

		rightAnimTrackModel1[68].addShapeBox(0F, 0F, 0F, 18, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Rear Right Leg
		rightAnimTrackModel1[68].setRotationPoint(-76F, -53F, -36F);

		rightAnimTrackModel1[69].addShapeBox(0F, 0F, 0F, 18, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear Right Leg
		rightAnimTrackModel1[69].setRotationPoint(-76F, -59F, -36F);

		rightAnimTrackModel1[70].addShapeBox(0F, 0F, 0F, 18, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Rear Right Leg
		rightAnimTrackModel1[70].setRotationPoint(-97F, -34F, -40F);

		rightAnimTrackModel1[71].addShapeBox(0F, 0F, 0F, 18, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear Right Leg
		rightAnimTrackModel1[71].setRotationPoint(-97F, -40F, -40F);

		rightAnimTrackModel1[72].addShapeBox(0F, 0F, 0F, 18, 6, 12, 0F,-6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear Right Leg
		rightAnimTrackModel1[72].setRotationPoint(-97F, -46F, -40F);

		rightAnimTrackModel1[73].addShapeBox(0F, 0F, 0F, 16, 5, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Rear Right Leg
		rightAnimTrackModel1[73].setRotationPoint(-77F, -11F, -44F);

		rightAnimTrackModel1[74].addShapeBox(0F, 0F, 0F, 16, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear Right Leg
		rightAnimTrackModel1[74].setRotationPoint(-77F, -17F, -44F);

		rightAnimTrackModel1[75].addShapeBox(0F, 0F, 0F, 16, 5, 12, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear Right Leg
		rightAnimTrackModel1[75].setRotationPoint(-77F, -22F, -44F);

		rightAnimTrackModel1[76].addShapeBox(0F, 0F, 0F, 4, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear Right Leg
		rightAnimTrackModel1[76].setRotationPoint(-68F, -8F, -41F);

		rightAnimTrackModel1[77].addShapeBox(0F, 0F, 0F, 4, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear Right Leg
		rightAnimTrackModel1[77].setRotationPoint(-74F, -8F, -41F);

		rightAnimTrackModel1[78].addShapeBox(0F, 0F, 0F, 3, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Rear Right Leg
		rightAnimTrackModel1[78].setRotationPoint(-65F, -4F, -45F);

		rightAnimTrackModel1[79].addShapeBox(0F, 0F, 0F, 6, 3, 20, 0F,-3F, 0F, -8F, 0F, 0F, -3F, 0F, 0F, -3F, -3F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F); // Rear Right Leg
		rightAnimTrackModel1[79].setRotationPoint(-79F, -1F, -48F);

		rightAnimTrackModel1[80].addShapeBox(0F, 0F, 0F, 3, 3, 14, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Rear Right Leg
		rightAnimTrackModel1[80].setRotationPoint(-76F, -4F, -45F);

		rightAnimTrackModel1[81].addShapeBox(0F, 0F, 0F, 8, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear Right Leg
		rightAnimTrackModel1[81].setRotationPoint(-73F, -4F, -45F);

		rightAnimTrackModel1[82].addShapeBox(0F, 0F, 0F, 8, 3, 20, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear Right Leg
		rightAnimTrackModel1[82].setRotationPoint(-73F, -1F, -48F);

		rightAnimTrackModel1[83].addShapeBox(0F, 0F, 0F, 8, 5, 24, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear Right Leg
		rightAnimTrackModel1[83].setRotationPoint(-73F, 2F, -50F);

		rightAnimTrackModel1[84].addShapeBox(0F, 0F, 0F, 8, 5, 24, 0F,-2F, 0F, -10F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, -10F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F); // Rear Right Leg
		rightAnimTrackModel1[84].setRotationPoint(-81F, 2F, -50F);

		rightAnimTrackModel1[85].addShapeBox(0F, 0F, 0F, 6, 3, 20, 0F,0F, 0F, -3F, -3F, 0F, -8F, -3F, 0F, -8F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F); // Rear Right Leg
		rightAnimTrackModel1[85].setRotationPoint(-65F, -1F, -48F);

		rightAnimTrackModel1[86].addShapeBox(0F, 0F, 0F, 8, 5, 24, 0F,0F, 0F, -2F, -2F, 0F, -10F, -2F, 0F, -10F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F); // Rear Right Leg
		rightAnimTrackModel1[86].setRotationPoint(-65F, 2F, -50F);

		rightAnimTrackModel1[87].addShapeBox(0F, 0F, 0F, 6, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear Right Leg
		rightAnimTrackModel1[87].setRotationPoint(-80F, 7F, -33F);

		rightAnimTrackModel1[88].addShapeBox(0F, 0F, 0F, 8, 3, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear Right Leg
		rightAnimTrackModel1[88].setRotationPoint(-73F, 7F, -50F);

		rightAnimTrackModel1[89].addShapeBox(0F, 0F, 0F, 6, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear Right Leg
		rightAnimTrackModel1[89].setRotationPoint(-64F, 7F, -33F);

		rightAnimTrackModel1[90].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F); // Rear Right Leg
		rightAnimTrackModel1[90].setRotationPoint(-85F, 7F, -40F);

		rightAnimTrackModel1[91].addShapeBox(0F, 0F, 0F, 8, 3, 24, 0F,0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F); // Rear Right Leg
		rightAnimTrackModel1[91].setRotationPoint(-65F, 7F, -50F);

		rightAnimTrackModel1[92].addShapeBox(0F, 0F, 0F, 8, 3, 24, 0F,0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F); // Rear Right Leg
		rightAnimTrackModel1[92].setRotationPoint(-81F, 7F, -50F);

		rightAnimTrackModel1[93].addShapeBox(0F, 0F, 0F, 6, 3, 6, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear Right Leg
		rightAnimTrackModel1[93].setRotationPoint(-64F, 7F, -49F);

		rightAnimTrackModel1[94].addShapeBox(0F, 0F, 0F, 6, 3, 6, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear Right Leg
		rightAnimTrackModel1[94].setRotationPoint(-80F, 7F, -49F);

		rightAnimTrackModel1[95].addShapeBox(0F, 0F, 0F, 5, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F); // Rear Right Leg
		rightAnimTrackModel1[95].setRotationPoint(-79F, -43F, -34F);

		rightAnimTrackModel1[96].addShapeBox(0F, 0F, 0F, 7, 7, 4, 0F,-7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear Right Leg
		rightAnimTrackModel1[96].setRotationPoint(-79F, -50F, -34F);

		rightAnimTrackModel1[97].addShapeBox(0F, 0F, 0F, 5, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F); // Rear Right Leg
		rightAnimTrackModel1[97].setRotationPoint(-82F, -49F, -34F);

		rightAnimTrackModel1[98].addShapeBox(0F, 0F, 0F, 7, 7, 4, 0F,-7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear Right Leg
		rightAnimTrackModel1[98].setRotationPoint(-84F, -56F, -34F);

		rightAnimTrackModel1[99].addShapeBox(-8F, 28F, -46.5F, 16, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Mid Right Leg
		rightAnimTrackModel1[99].setRotationPoint(-10F, -66F, 0F);
		rightAnimTrackModel1[99].rotateAngleZ = -0.38397244F;

		rightAnimTrackModel1[100].addShapeBox(0F, 0F, -17F, 2, 2, 17, 0F,0F, 0F, 5F, 0F, 0F, 5F, 0F, 4F, 5F, 0F, 4F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, -4F, 5F, 0F, -4F, 5F); // Mid Right Leg
		rightAnimTrackModel1[100].setRotationPoint(-11F, -36.5F, -26.5F);
		rightAnimTrackModel1[100].rotateAngleX = -0.15707963F;
		rightAnimTrackModel1[100].rotateAngleY = -0.57595865F;

		rightAnimTrackModel1[101].addShapeBox(0F, 0F, 0F, 4, 3, 8, 0F,0F, 0F, 2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Mid Right Leg
		rightAnimTrackModel1[101].setRotationPoint(-10F, 7F, -62F);

		rightAnimTrackModel1[102].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, 0F, 2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Rear Right Leg
		rightAnimTrackModel1[102].setRotationPoint(-57F, 7F, -40F);

		rightAnimTrackModel1[103].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, 0F, 2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Front Right Leg
		rightAnimTrackModel1[103].setRotationPoint(101F, 7F, -40F);

		rightAnimTrackModel1[104].addShapeBox(0F, 0F, 0F, 30, 10, 4, 0F,-2F, 0F, -1.5F, -2F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, -12F, -2F, 0F, -12F, -2F, 0F, -10F, 0F, 0F, -10F, 0F, 0F); // Mid Right Leg
		rightAnimTrackModel1[104].setRotationPoint(-25F, -63F, -56F);

		rightAnimTrackModel1[105].addShapeBox(0F, 0F, 0F, 30, 10, 4, 0F,-2F, 0F, -1.5F, -2F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Mid Right Leg
		rightAnimTrackModel1[105].setRotationPoint(-25F, -73F, -54.5F);

		rightAnimTrackModel1[106].addShapeBox(0F, 0F, 0F, 30, 10, 4, 0F,-12F, -2F, -1.5F, -12F, -2F, -1.5F, -10F, 0F, 1.5F, -10F, 0F, 1.5F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Mid Right Leg
		rightAnimTrackModel1[106].setRotationPoint(-25F, -83F, -53F);

		rightAnimTrackModel1[107].addShapeBox(0F, 0F, 0F, 6, 22, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F); // Mid Right Leg
		rightAnimTrackModel1[107].setRotationPoint(-13F, -79F, -53.5F);

		rightAnimTrackModel1[108].addShapeBox(0F, 0F, 0F, 14, 4, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Front Right Leg
		rightAnimTrackModel1[108].setRotationPoint(58F, -39F, -40.5F);

		rightAnimTrackModel1[109].addShapeBox(0F, 0F, 0F, 14, 4, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear Right Leg
		rightAnimTrackModel1[109].setRotationPoint(-95F, -39F, -40.5F);

		rightAnimTrackModel1[110].addShapeBox(0F, 0F, 0F, 4, 12, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear Right Leg
		rightAnimTrackModel1[110].setRotationPoint(-71F, -20F, -45F);

		rightAnimTrackModel1[111].addShapeBox(0F, 0F, 0F, 4, 12, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Front Right Leg
		rightAnimTrackModel1[111].setRotationPoint(87F, -20F, -45F);

		rightAnimTrackModel1[112].addShapeBox(0F, 0F, 0F, 15, 9, 4, 0F,0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 0F, 0F); // Box 459
		rightAnimTrackModel1[112].setRotationPoint(-84F, -29F, -38F);

		rightAnimTrackModel1[113].addShapeBox(0F, 0F, 0F, 6, 6, 4, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F); // Box 460
		rightAnimTrackModel1[113].setRotationPoint(-79F, -40F, -38F);

		rightAnimTrackModel1[114].addShapeBox(0F, 0F, 0F, 9, 8, 4, 0F,0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 13F, 0F, 0F, 13F, 0F, 0F, 1F, 0F); // Box 461
		rightAnimTrackModel1[114].setRotationPoint(-73F, -37F, -38F);

		rightAnimTrackModel1[115].addShapeBox(0F, 0F, 0F, 6, 9, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Box 462
		rightAnimTrackModel1[115].setRotationPoint(-90F, -29F, -38F);
	}
	
	private void initrightAnimTrackModel2_0()
	{
		rightAnimTrackModel2[0] = new ModelRendererTurbo(this, 81, 361, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel2[1] = new ModelRendererTurbo(this, 993, 177, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel2[2] = new ModelRendererTurbo(this, 1, 297, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel2[3] = new ModelRendererTurbo(this, 705, 225, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel2[4] = new ModelRendererTurbo(this, 57, 297, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel2[5] = new ModelRendererTurbo(this, 113, 321, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel2[6] = new ModelRendererTurbo(this, 353, 353, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel2[7] = new ModelRendererTurbo(this, 465, 353, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel2[8] = new ModelRendererTurbo(this, 153, 361, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel2[9] = new ModelRendererTurbo(this, 505, 361, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel2[10] = new ModelRendererTurbo(this, 793, 361, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel2[11] = new ModelRendererTurbo(this, 193, 361, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel2[12] = new ModelRendererTurbo(this, 545, 361, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel2[13] = new ModelRendererTurbo(this, 833, 377, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel2[14] = new ModelRendererTurbo(this, 945, 361, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel2[15] = new ModelRendererTurbo(this, 1, 385, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel2[16] = new ModelRendererTurbo(this, 625, 385, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel2[17] = new ModelRendererTurbo(this, 977, 249, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel2[18] = new ModelRendererTurbo(this, 881, 161, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel2[19] = new ModelRendererTurbo(this, 737, 225, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel2[20] = new ModelRendererTurbo(this, 441, 89, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel2[21] = new ModelRendererTurbo(this, 105, 113, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel2[22] = new ModelRendererTurbo(this, 673, 385, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel2[23] = new ModelRendererTurbo(this, 65, 401, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel2[24] = new ModelRendererTurbo(this, 129, 265, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel2[25] = new ModelRendererTurbo(this, 201, 145, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel2[26] = new ModelRendererTurbo(this, 337, 257, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel2[27] = new ModelRendererTurbo(this, 537, 257, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel2[28] = new ModelRendererTurbo(this, 241, 265, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel2[29] = new ModelRendererTurbo(this, 617, 273, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel2[30] = new ModelRendererTurbo(this, 897, 289, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel2[31] = new ModelRendererTurbo(this, 625, 297, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel2[32] = new ModelRendererTurbo(this, 601, 121, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel2[33] = new ModelRendererTurbo(this, 641, 417, textureX, textureY); // Front Right Leg
		rightAnimTrackModel2[34] = new ModelRendererTurbo(this, 697, 417, textureX, textureY); // Front Right Leg
		rightAnimTrackModel2[35] = new ModelRendererTurbo(this, 809, 465, textureX, textureY); // Rear Right Leg
		rightAnimTrackModel2[36] = new ModelRendererTurbo(this, 169, 473, textureX, textureY); // Rear Right Leg
		rightAnimTrackModel2[37] = new ModelRendererTurbo(this, 689, 145, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel2[38] = new ModelRendererTurbo(this, 281, 497, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel2[39] = new ModelRendererTurbo(this, 1, 401, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel2[40] = new ModelRendererTurbo(this, 953, 585, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel2[41] = new ModelRendererTurbo(this, 121, 593, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel2[42] = new ModelRendererTurbo(this, 193, 593, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel2[43] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel2[44] = new ModelRendererTurbo(this, 1001, 113, textureX, textureY); // Box 463
		rightAnimTrackModel2[45] = new ModelRendererTurbo(this, 153, 113, textureX, textureY); // Box 464
		rightAnimTrackModel2[46] = new ModelRendererTurbo(this, 561, 121, textureX, textureY); // Box 465
		rightAnimTrackModel2[47] = new ModelRendererTurbo(this, 41, 145, textureX, textureY); // Box 466
		rightAnimTrackModel2[48] = new ModelRendererTurbo(this, 257, 361, textureX, textureY); // Box 467
		rightAnimTrackModel2[49] = new ModelRendererTurbo(this, 905, 393, textureX, textureY); // Box 468
		rightAnimTrackModel2[50] = new ModelRendererTurbo(this, 281, 401, textureX, textureY); // Box 469
		rightAnimTrackModel2[51] = new ModelRendererTurbo(this, 345, 401, textureX, textureY); // Box 470
		rightAnimTrackModel2[52] = new ModelRendererTurbo(this, 409, 401, textureX, textureY); // Box 471
		rightAnimTrackModel2[53] = new ModelRendererTurbo(this, 473, 401, textureX, textureY); // Box 472
		rightAnimTrackModel2[54] = new ModelRendererTurbo(this, 745, 393, textureX, textureY); // Box 473
		rightAnimTrackModel2[55] = new ModelRendererTurbo(this, 137, 409, textureX, textureY); // Box 474
		rightAnimTrackModel2[56] = new ModelRendererTurbo(this, 209, 409, textureX, textureY); // Box 475
		rightAnimTrackModel2[57] = new ModelRendererTurbo(this, 513, 409, textureX, textureY); // Box 476
		rightAnimTrackModel2[58] = new ModelRendererTurbo(this, 945, 409, textureX, textureY); // Box 477
		rightAnimTrackModel2[59] = new ModelRendererTurbo(this, 1, 417, textureX, textureY); // Box 478
		rightAnimTrackModel2[60] = new ModelRendererTurbo(this, 561, 409, textureX, textureY); // Box 479
		rightAnimTrackModel2[61] = new ModelRendererTurbo(this, 793, 409, textureX, textureY); // Box 480
		rightAnimTrackModel2[62] = new ModelRendererTurbo(this, 601, 417, textureX, textureY); // Box 481
		rightAnimTrackModel2[63] = new ModelRendererTurbo(this, 185, 409, textureX, textureY); // Box 482
		rightAnimTrackModel2[64] = new ModelRendererTurbo(this, 497, 313, textureX, textureY); // Box 483
		rightAnimTrackModel2[65] = new ModelRendererTurbo(this, 985, 321, textureX, textureY); // Box 484
		rightAnimTrackModel2[66] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 485
		rightAnimTrackModel2[67] = new ModelRendererTurbo(this, 753, 201, textureX, textureY); // Box 486
		rightAnimTrackModel2[68] = new ModelRendererTurbo(this, 1001, 49, textureX, textureY); // Box 487
		rightAnimTrackModel2[69] = new ModelRendererTurbo(this, 57, 241, textureX, textureY); // Box 488
		rightAnimTrackModel2[70] = new ModelRendererTurbo(this, 321, 281, textureX, textureY); // Box 489
		rightAnimTrackModel2[71] = new ModelRendererTurbo(this, 593, 305, textureX, textureY); // Box 490
		rightAnimTrackModel2[72] = new ModelRendererTurbo(this, 809, 305, textureX, textureY); // Box 491
		rightAnimTrackModel2[73] = new ModelRendererTurbo(this, 281, 121, textureX, textureY); // Box 492
		rightAnimTrackModel2[74] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 493
		rightAnimTrackModel2[75] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 494
		rightAnimTrackModel2[76] = new ModelRendererTurbo(this, 993, 57, textureX, textureY); // Box 495
		rightAnimTrackModel2[77] = new ModelRendererTurbo(this, 897, 257, textureX, textureY); // Box 496
		rightAnimTrackModel2[78] = new ModelRendererTurbo(this, 897, 257, textureX, textureY); // Box 497
		rightAnimTrackModel2[79] = new ModelRendererTurbo(this, 993, 57, textureX, textureY); // Box 498
		rightAnimTrackModel2[80] = new ModelRendererTurbo(this, 305, 449, textureX, textureY); // Box 499
		rightAnimTrackModel2[81] = new ModelRendererTurbo(this, 369, 449, textureX, textureY); // Box 500
		rightAnimTrackModel2[82] = new ModelRendererTurbo(this, 857, 449, textureX, textureY); // Box 501
		rightAnimTrackModel2[83] = new ModelRendererTurbo(this, 49, 457, textureX, textureY); // Box 502
		rightAnimTrackModel2[84] = new ModelRendererTurbo(this, 425, 457, textureX, textureY); // Box 503
		rightAnimTrackModel2[85] = new ModelRendererTurbo(this, 545, 457, textureX, textureY); // Box 504
		rightAnimTrackModel2[86] = new ModelRendererTurbo(this, 409, 353, textureX, textureY); // Box 505
		rightAnimTrackModel2[87] = new ModelRendererTurbo(this, 553, 361, textureX, textureY); // Box 506
		rightAnimTrackModel2[88] = new ModelRendererTurbo(this, 705, 433, textureX, textureY); // Box 507
		rightAnimTrackModel2[89] = new ModelRendererTurbo(this, 601, 441, textureX, textureY); // Box 508
		rightAnimTrackModel2[90] = new ModelRendererTurbo(this, 177, 441, textureX, textureY); // Box 509
		rightAnimTrackModel2[91] = new ModelRendererTurbo(this, 977, 441, textureX, textureY); // Box 510
		rightAnimTrackModel2[92] = new ModelRendererTurbo(this, 721, 449, textureX, textureY); // Box 511
		rightAnimTrackModel2[93] = new ModelRendererTurbo(this, 1, 465, textureX, textureY); // Box 512
		rightAnimTrackModel2[94] = new ModelRendererTurbo(this, 249, 465, textureX, textureY); // Box 513
		rightAnimTrackModel2[95] = new ModelRendererTurbo(this, 89, 457, textureX, textureY); // Box 514
		rightAnimTrackModel2[96] = new ModelRendererTurbo(this, 585, 465, textureX, textureY); // Box 515
		rightAnimTrackModel2[97] = new ModelRendererTurbo(this, 841, 361, textureX, textureY); // Box 516
		rightAnimTrackModel2[98] = new ModelRendererTurbo(this, 657, 465, textureX, textureY); // Box 517
		rightAnimTrackModel2[99] = new ModelRendererTurbo(this, 1, 369, textureX, textureY); // Box 518
		rightAnimTrackModel2[100] = new ModelRendererTurbo(this, 657, 89, textureX, textureY); // Box 519
		rightAnimTrackModel2[101] = new ModelRendererTurbo(this, 761, 465, textureX, textureY); // Box 520
		rightAnimTrackModel2[102] = new ModelRendererTurbo(this, 121, 473, textureX, textureY); // Box 521
		rightAnimTrackModel2[103] = new ModelRendererTurbo(this, 353, 377, textureX, textureY); // Box 522
		rightAnimTrackModel2[104] = new ModelRendererTurbo(this, 385, 377, textureX, textureY); // Box 523
		rightAnimTrackModel2[105] = new ModelRendererTurbo(this, 353, 153, textureX, textureY); // Box 524
		rightAnimTrackModel2[106] = new ModelRendererTurbo(this, 1001, 361, textureX, textureY); // Box 525
		rightAnimTrackModel2[107] = new ModelRendererTurbo(this, 233, 241, textureX, textureY); // Box 526
		rightAnimTrackModel2[108] = new ModelRendererTurbo(this, 465, 377, textureX, textureY); // Box 527
		rightAnimTrackModel2[109] = new ModelRendererTurbo(this, 793, 113, textureX, textureY); // Box 528
		rightAnimTrackModel2[110] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 529
		rightAnimTrackModel2[111] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 530
		rightAnimTrackModel2[112] = new ModelRendererTurbo(this, 993, 57, textureX, textureY); // Box 531
		rightAnimTrackModel2[113] = new ModelRendererTurbo(this, 897, 257, textureX, textureY); // Box 532
		rightAnimTrackModel2[114] = new ModelRendererTurbo(this, 897, 257, textureX, textureY); // Box 533
		rightAnimTrackModel2[115] = new ModelRendererTurbo(this, 993, 57, textureX, textureY); // Box 534

		rightAnimTrackModel2[0].addShapeBox(0F, 0F, 0F, 30, 10, 16, 0F,-10F, 0F, -1.5F, -10F, 0F, -1.5F, -10F, 0F, 1.5F, -10F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Mid Right Leg
		rightAnimTrackModel2[0].setRotationPoint(-19F, -89F, -49F);

		rightAnimTrackModel2[1].addShapeBox(0F, 0F, 0F, 11, 12, 4, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Mid Right Leg
		rightAnimTrackModel2[1].setRotationPoint(-18F, -66F, -47F);

		rightAnimTrackModel2[2].addShapeBox(0F, 0F, 0F, 11, 27, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, -5F, 0F, -3F); // Mid Right Leg
		rightAnimTrackModel2[2].setRotationPoint(-18F, -54F, -49F);

		rightAnimTrackModel2[3].addShapeBox(0F, 0F, 0F, 11, 12, 4, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Mid Right Leg
		rightAnimTrackModel2[3].setRotationPoint(-1F, -66F, -47F);

		rightAnimTrackModel2[4].addShapeBox(0F, 0F, 0F, 11, 27, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -5F, 0F, 3F, -5F, 0F, -3F, 0F, 0F, -3F); // Mid Right Leg
		rightAnimTrackModel2[4].setRotationPoint(-1F, -54F, -49F);

		rightAnimTrackModel2[5].addShapeBox(0F, 0F, 0F, 20, 6, 12, 0F,-6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Mid Right Leg
		rightAnimTrackModel2[5].setRotationPoint(-14F, -35F, -56F);

		rightAnimTrackModel2[6].addShapeBox(0F, 0F, 0F, 20, 8, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Mid Right Leg
		rightAnimTrackModel2[6].setRotationPoint(-14F, -29F, -56F);

		rightAnimTrackModel2[7].addShapeBox(0F, 0F, 0F, 20, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Mid Right Leg
		rightAnimTrackModel2[7].setRotationPoint(-14F, -21F, -56F);

		rightAnimTrackModel2[8].addShapeBox(0F, 0F, 0F, 10, 8, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F); // Mid Right Leg
		rightAnimTrackModel2[8].setRotationPoint(-10F, -7F, -64F);

		rightAnimTrackModel2[9].addShapeBox(0F, 0F, 0F, 9, 8, 28, 0F,0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 5F, 0F, -8F, 0F, 0F, 5F, 0F, 0F, 5F, 5F, 0F, -8F); // Mid Right Leg
		rightAnimTrackModel2[9].setRotationPoint(-19F, -7F, -64F);

		rightAnimTrackModel2[10].addShapeBox(0F, 0F, 0F, 9, 8, 28, 0F,0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 5F, 5F, 0F, -8F, 5F, 0F, -8F, 0F, 0F, 5F); // Mid Right Leg
		rightAnimTrackModel2[10].setRotationPoint(0F, -7F, -64F);

		rightAnimTrackModel2[11].addShapeBox(0F, 0F, 0F, 10, 3, 38, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Mid Right Leg
		rightAnimTrackModel2[11].setRotationPoint(-10F, 1F, -69F);

		rightAnimTrackModel2[12].addShapeBox(0F, 0F, 0F, 14, 3, 38, 0F,0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F); // Mid Right Leg
		rightAnimTrackModel2[12].setRotationPoint(0F, 1F, -69F);

		rightAnimTrackModel2[13].addShapeBox(0F, 0F, 0F, 14, 3, 38, 0F,0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F); // Mid Right Leg
		rightAnimTrackModel2[13].setRotationPoint(-24F, 1F, -69F);

		rightAnimTrackModel2[14].addShapeBox(0F, 0F, 0F, 10, 3, 28, 0F,0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Mid Right Leg
		rightAnimTrackModel2[14].setRotationPoint(-10F, -10F, -64F);

		rightAnimTrackModel2[15].addShapeBox(0F, 0F, 0F, 9, 3, 28, 0F,0F, 0F, -8F, -5F, 0F, -12F, -5F, 0F, -12F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F); // Mid Right Leg
		rightAnimTrackModel2[15].setRotationPoint(0F, -10F, -64F);

		rightAnimTrackModel2[16].addShapeBox(0F, 0F, 0F, 9, 3, 28, 0F,-5F, 0F, -12F, 0F, 0F, -8F, 0F, 0F, -8F, -5F, 0F, -12F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F); // Mid Right Leg
		rightAnimTrackModel2[16].setRotationPoint(-19F, -10F, -64F);

		rightAnimTrackModel2[17].addShapeBox(0F, 0F, 0F, 10, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Mid Right Leg
		rightAnimTrackModel2[17].setRotationPoint(-10F, -13F, -56F);

		rightAnimTrackModel2[18].addShapeBox(0F, 0F, 0F, 4, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Mid Right Leg
		rightAnimTrackModel2[18].setRotationPoint(0F, -13F, -56F);

		rightAnimTrackModel2[19].addShapeBox(0F, 0F, 0F, 4, 3, 12, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Mid Right Leg
		rightAnimTrackModel2[19].setRotationPoint(-14F, -13F, -56F);

		rightAnimTrackModel2[20].addShapeBox(0F, 0F, 0F, 4, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Mid Right Leg
		rightAnimTrackModel2[20].setRotationPoint(-13F, -21F, -52F);

		rightAnimTrackModel2[21].addShapeBox(0F, 0F, 0F, 4, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Mid Right Leg
		rightAnimTrackModel2[21].setRotationPoint(-1F, -21F, -52F);

		rightAnimTrackModel2[22].addShapeBox(0F, 0F, 0F, 30, 10, 16, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Mid Right Leg
		rightAnimTrackModel2[22].setRotationPoint(-19F, -79F, -50.5F);

		rightAnimTrackModel2[23].addShapeBox(0F, 0F, 0F, 30, 10, 16, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F); // Mid Right Leg
		rightAnimTrackModel2[23].setRotationPoint(-19F, -69F, -52F);

		rightAnimTrackModel2[24].addShapeBox(0F, 0F, 0F, 22, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Mid Right Leg
		rightAnimTrackModel2[24].setRotationPoint(-15F, -29F, -44.5F);

		rightAnimTrackModel2[25].addShapeBox(0F, 0F, 0F, 8, 2, 7, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Mid Right Leg
		rightAnimTrackModel2[25].setRotationPoint(-8F, -31F, -44.5F);

		rightAnimTrackModel2[26].addShapeBox(0F, 0F, 0F, 8, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Mid Right Leg
		rightAnimTrackModel2[26].setRotationPoint(-8F, -25F, -44.5F);

		rightAnimTrackModel2[27].addShapeBox(0F, 0F, 0F, 8, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Mid Right Leg
		rightAnimTrackModel2[27].setRotationPoint(-8F, -29F, -44.5F);

		rightAnimTrackModel2[28].addShapeBox(0F, 0F, 0F, 8, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Mid Right Leg
		rightAnimTrackModel2[28].setRotationPoint(-21F, 1F, -42F);

		rightAnimTrackModel2[29].addShapeBox(0F, 0F, 0F, 8, 3, 8, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Mid Right Leg
		rightAnimTrackModel2[29].setRotationPoint(-21F, 1F, -66F);

		rightAnimTrackModel2[30].addShapeBox(0F, 0F, 0F, 8, 3, 8, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Mid Right Leg
		rightAnimTrackModel2[30].setRotationPoint(3F, 1F, -66F);

		rightAnimTrackModel2[31].addShapeBox(0F, 0F, 0F, 8, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Mid Right Leg
		rightAnimTrackModel2[31].setRotationPoint(3F, 1F, -42F);

		rightAnimTrackModel2[32].addShapeBox(0F, 0F, 0F, 4, 3, 8, 0F,0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F); // Mid Right Leg
		rightAnimTrackModel2[32].setRotationPoint(-28F, 1F, -54F);

		rightAnimTrackModel2[33].addShapeBox(0F, 0F, 0F, 18, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Front Right Leg
		rightAnimTrackModel2[33].setRotationPoint(77F, -53F, -36F);

		rightAnimTrackModel2[34].addShapeBox(0F, 0F, 0F, 18, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Front Right Leg
		rightAnimTrackModel2[34].setRotationPoint(77F, -59F, -36F);

		rightAnimTrackModel2[35].addShapeBox(0F, 0F, 0F, 18, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Rear Right Leg
		rightAnimTrackModel2[35].setRotationPoint(-76F, -53F, -36F);

		rightAnimTrackModel2[36].addShapeBox(0F, 0F, 0F, 18, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear Right Leg
		rightAnimTrackModel2[36].setRotationPoint(-76F, -59F, -36F);

		rightAnimTrackModel2[37].addShapeBox(0F, 0F, 0F, 16, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Mid Right Leg
		rightAnimTrackModel2[37].setRotationPoint(-12F, -43F, -46.5F);

		rightAnimTrackModel2[38].addShapeBox(0F, 3F, -17F, 2, 2, 17, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 4F, 1F, 0F, 4F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -4F, 1F, 0F, -4F, 1F); // Mid Right Leg
		rightAnimTrackModel2[38].setRotationPoint(-11F, -39.5F, -26.5F);
		rightAnimTrackModel2[38].rotateAngleX = -0.34906585F;
		rightAnimTrackModel2[38].rotateAngleY = 0.27925268F;

		rightAnimTrackModel2[39].addShapeBox(0F, 0F, 0F, 4, 3, 8, 0F,0F, 0F, 2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Mid Right Leg
		rightAnimTrackModel2[39].setRotationPoint(14F, 1F, -54F);

		rightAnimTrackModel2[40].addShapeBox(0F, 0F, 0F, 30, 10, 4, 0F,-2F, 0F, -1.5F, -2F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, -12F, -2F, 0F, -12F, -2F, 0F, -10F, 0F, 0F, -10F, 0F, 0F); // Mid Right Leg
		rightAnimTrackModel2[40].setRotationPoint(-19F, -69F, -56F);

		rightAnimTrackModel2[41].addShapeBox(0F, 0F, 0F, 30, 10, 4, 0F,-2F, 0F, -1.5F, -2F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Mid Right Leg
		rightAnimTrackModel2[41].setRotationPoint(-19F, -79F, -54.5F);

		rightAnimTrackModel2[42].addShapeBox(0F, 0F, 0F, 30, 10, 4, 0F,-12F, -2F, -1.5F, -12F, -2F, -1.5F, -10F, 0F, 1.5F, -10F, 0F, 1.5F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Mid Right Leg
		rightAnimTrackModel2[42].setRotationPoint(-19F, -89F, -53F);

		rightAnimTrackModel2[43].addShapeBox(0F, 0F, 0F, 6, 22, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F); // Mid Right Leg
		rightAnimTrackModel2[43].setRotationPoint(-7F, -85F, -53.5F);

		rightAnimTrackModel2[44].addShapeBox(0F, 0F, 0F, 7, 7, 4, 0F,-7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 463
		rightAnimTrackModel2[44].setRotationPoint(70F, -58F, -34F);
		rightAnimTrackModel2[44].rotateAngleZ = -0.29670597F;

		rightAnimTrackModel2[45].addShapeBox(0F, 7F, 0F, 5, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F); // Box 464
		rightAnimTrackModel2[45].setRotationPoint(72F, -58F, -34F);
		rightAnimTrackModel2[45].rotateAngleZ = -0.29670597F;

		rightAnimTrackModel2[46].addShapeBox(0F, 7F, 0F, 5, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F); // Box 465
		rightAnimTrackModel2[46].setRotationPoint(75F, -52F, -34F);
		rightAnimTrackModel2[46].rotateAngleZ = -0.29670597F;

		rightAnimTrackModel2[47].addShapeBox(0F, 0F, 0F, 7, 7, 4, 0F,-7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 466
		rightAnimTrackModel2[47].setRotationPoint(75F, -52F, -34F);
		rightAnimTrackModel2[47].rotateAngleZ = -0.29670597F;

		rightAnimTrackModel2[48].addShapeBox(0F, 0F, 0F, 18, 6, 12, 0F,-6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 467
		rightAnimTrackModel2[48].setRotationPoint(56F, -53F, -40F);

		rightAnimTrackModel2[49].addShapeBox(0F, 0F, 0F, 18, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 468
		rightAnimTrackModel2[49].setRotationPoint(56F, -47F, -40F);

		rightAnimTrackModel2[50].addShapeBox(0F, 0F, 0F, 18, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Box 469
		rightAnimTrackModel2[50].setRotationPoint(56F, -41F, -40F);

		rightAnimTrackModel2[51].addShapeBox(0F, 0F, 0F, 16, 5, 12, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 470
		rightAnimTrackModel2[51].setRotationPoint(58F, -22F, -44F);

		rightAnimTrackModel2[52].addShapeBox(0F, 0F, 0F, 16, 5, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 471
		rightAnimTrackModel2[52].setRotationPoint(58F, -11F, -44F);

		rightAnimTrackModel2[53].addShapeBox(0F, 0F, 0F, 16, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 472
		rightAnimTrackModel2[53].setRotationPoint(58F, -17F, -44F);

		rightAnimTrackModel2[54].addShapeBox(0F, 0F, 0F, 8, 5, 24, 0F,-2F, 0F, -10F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, -10F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F); // Box 473
		rightAnimTrackModel2[54].setRotationPoint(54F, 2F, -50F);

		rightAnimTrackModel2[55].addShapeBox(0F, 0F, 0F, 8, 5, 24, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 474
		rightAnimTrackModel2[55].setRotationPoint(62F, 2F, -50F);

		rightAnimTrackModel2[56].addShapeBox(0F, 0F, 0F, 8, 5, 24, 0F,0F, 0F, -2F, -2F, 0F, -10F, -2F, 0F, -10F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F); // Box 475
		rightAnimTrackModel2[56].setRotationPoint(70F, 2F, -50F);

		rightAnimTrackModel2[57].addShapeBox(0F, 0F, 0F, 8, 3, 24, 0F,0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F); // Box 476
		rightAnimTrackModel2[57].setRotationPoint(54F, 7F, -50F);

		rightAnimTrackModel2[58].addShapeBox(0F, 0F, 0F, 8, 3, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 477
		rightAnimTrackModel2[58].setRotationPoint(62F, 7F, -50F);

		rightAnimTrackModel2[59].addShapeBox(0F, 0F, 0F, 8, 3, 24, 0F,0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F); // Box 478
		rightAnimTrackModel2[59].setRotationPoint(70F, 7F, -50F);

		rightAnimTrackModel2[60].addShapeBox(0F, 0F, 0F, 6, 3, 20, 0F,0F, 0F, -3F, -3F, 0F, -8F, -3F, 0F, -8F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F); // Box 479
		rightAnimTrackModel2[60].setRotationPoint(70F, -1F, -48F);

		rightAnimTrackModel2[61].addShapeBox(0F, 0F, 0F, 8, 3, 20, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 480
		rightAnimTrackModel2[61].setRotationPoint(62F, -1F, -48F);

		rightAnimTrackModel2[62].addShapeBox(0F, 0F, 0F, 6, 3, 20, 0F,-3F, 0F, -8F, 0F, 0F, -3F, 0F, 0F, -3F, -3F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F); // Box 481
		rightAnimTrackModel2[62].setRotationPoint(56F, -1F, -48F);

		rightAnimTrackModel2[63].addShapeBox(0F, 0F, 0F, 8, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 482
		rightAnimTrackModel2[63].setRotationPoint(62F, -4F, -45F);

		rightAnimTrackModel2[64].addShapeBox(0F, 0F, 0F, 3, 3, 14, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 483
		rightAnimTrackModel2[64].setRotationPoint(59F, -4F, -45F);

		rightAnimTrackModel2[65].addShapeBox(0F, 0F, 0F, 3, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 484
		rightAnimTrackModel2[65].setRotationPoint(70F, -4F, -45F);

		rightAnimTrackModel2[66].addShapeBox(0F, 0F, 0F, 4, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 485
		rightAnimTrackModel2[66].setRotationPoint(61F, -8F, -41F);

		rightAnimTrackModel2[67].addShapeBox(0F, 0F, 0F, 4, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 486
		rightAnimTrackModel2[67].setRotationPoint(67F, -8F, -41F);

		rightAnimTrackModel2[68].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 487
		rightAnimTrackModel2[68].setRotationPoint(50F, 7F, -40F);

		rightAnimTrackModel2[69].addShapeBox(0F, 0F, 0F, 6, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 488
		rightAnimTrackModel2[69].setRotationPoint(55F, 7F, -33F);

		rightAnimTrackModel2[70].addShapeBox(0F, 0F, 0F, 6, 3, 6, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 489
		rightAnimTrackModel2[70].setRotationPoint(55F, 7F, -49F);

		rightAnimTrackModel2[71].addShapeBox(0F, 0F, 0F, 6, 3, 6, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 490
		rightAnimTrackModel2[71].setRotationPoint(71F, 7F, -49F);

		rightAnimTrackModel2[72].addShapeBox(0F, 0F, 0F, 6, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 491
		rightAnimTrackModel2[72].setRotationPoint(71F, 7F, -33F);

		rightAnimTrackModel2[73].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, 0F, 2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 492
		rightAnimTrackModel2[73].setRotationPoint(78F, 7F, -40F);

		rightAnimTrackModel2[74].addShapeBox(0F, 0F, 0F, 14, 4, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 493
		rightAnimTrackModel2[74].setRotationPoint(58F, -46F, -40.5F);

		rightAnimTrackModel2[75].addShapeBox(0F, 0F, 0F, 4, 12, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 494
		rightAnimTrackModel2[75].setRotationPoint(64F, -20F, -45F);

		rightAnimTrackModel2[76].addShapeBox(0F, 0F, 0F, 11, 12, 4, 0F,-5F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -5F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F); // Box 495
		rightAnimTrackModel2[76].setRotationPoint(55F, -44F, -38F);

		rightAnimTrackModel2[77].addShapeBox(0F, 0F, 0F, 11, 27, 4, 0F,-2F, -4F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, -7F, -4F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, -7F, -4F, 0F); // Box 496
		rightAnimTrackModel2[77].setRotationPoint(55F, -37F, -38F);

		rightAnimTrackModel2[78].addShapeBox(0F, 0F, 0F, 11, 27, 4, 0F,-2F, -4F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, -7F, -4F, 0F, -7F, -4F, 0F, -2F, -4F, 0F); // Box 497
		rightAnimTrackModel2[78].setRotationPoint(66F, -37F, -38F);

		rightAnimTrackModel2[79].addShapeBox(0F, 0F, 0F, 11, 12, 4, 0F,-2F, -1F, 0F, -5F, -1F, 0F, -5F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F); // Box 498
		rightAnimTrackModel2[79].setRotationPoint(66F, -44F, -38F);

		rightAnimTrackModel2[80].addShapeBox(0F, 0F, 0F, 18, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Box 499
		rightAnimTrackModel2[80].setRotationPoint(-97F, -44F, -40F);

		rightAnimTrackModel2[81].addShapeBox(0F, 0F, 0F, 18, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 500
		rightAnimTrackModel2[81].setRotationPoint(-97F, -50F, -40F);

		rightAnimTrackModel2[82].addShapeBox(0F, 0F, 0F, 18, 6, 12, 0F,-6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 501
		rightAnimTrackModel2[82].setRotationPoint(-97F, -56F, -40F);

		rightAnimTrackModel2[83].addShapeBox(0F, 0F, 0F, 16, 5, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 502
		rightAnimTrackModel2[83].setRotationPoint(-96F, -11F, -44F);

		rightAnimTrackModel2[84].addShapeBox(0F, 0F, 0F, 16, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 503
		rightAnimTrackModel2[84].setRotationPoint(-96F, -17F, -44F);

		rightAnimTrackModel2[85].addShapeBox(0F, 0F, 0F, 16, 5, 12, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 504
		rightAnimTrackModel2[85].setRotationPoint(-96F, -22F, -44F);

		rightAnimTrackModel2[86].addShapeBox(0F, 0F, 0F, 4, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 505
		rightAnimTrackModel2[86].setRotationPoint(-87F, -8F, -41F);

		rightAnimTrackModel2[87].addShapeBox(0F, 0F, 0F, 4, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 506
		rightAnimTrackModel2[87].setRotationPoint(-93F, -8F, -41F);

		rightAnimTrackModel2[88].addShapeBox(0F, 0F, 0F, 3, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 507
		rightAnimTrackModel2[88].setRotationPoint(-84F, -4F, -45F);

		rightAnimTrackModel2[89].addShapeBox(0F, 0F, 0F, 6, 3, 20, 0F,-3F, 0F, -8F, 0F, 0F, -3F, 0F, 0F, -3F, -3F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F); // Box 508
		rightAnimTrackModel2[89].setRotationPoint(-98F, -1F, -48F);

		rightAnimTrackModel2[90].addShapeBox(0F, 0F, 0F, 3, 3, 14, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 509
		rightAnimTrackModel2[90].setRotationPoint(-95F, -4F, -45F);

		rightAnimTrackModel2[91].addShapeBox(0F, 0F, 0F, 8, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 510
		rightAnimTrackModel2[91].setRotationPoint(-92F, -4F, -45F);

		rightAnimTrackModel2[92].addShapeBox(0F, 0F, 0F, 8, 3, 20, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 511
		rightAnimTrackModel2[92].setRotationPoint(-92F, -1F, -48F);

		rightAnimTrackModel2[93].addShapeBox(0F, 0F, 0F, 8, 5, 24, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 512
		rightAnimTrackModel2[93].setRotationPoint(-92F, 2F, -50F);

		rightAnimTrackModel2[94].addShapeBox(0F, 0F, 0F, 8, 5, 24, 0F,-2F, 0F, -10F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, -10F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F); // Box 513
		rightAnimTrackModel2[94].setRotationPoint(-100F, 2F, -50F);

		rightAnimTrackModel2[95].addShapeBox(0F, 0F, 0F, 6, 3, 20, 0F,0F, 0F, -3F, -3F, 0F, -8F, -3F, 0F, -8F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F); // Box 514
		rightAnimTrackModel2[95].setRotationPoint(-84F, -1F, -48F);

		rightAnimTrackModel2[96].addShapeBox(0F, 0F, 0F, 8, 5, 24, 0F,0F, 0F, -2F, -2F, 0F, -10F, -2F, 0F, -10F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F); // Box 515
		rightAnimTrackModel2[96].setRotationPoint(-84F, 2F, -50F);

		rightAnimTrackModel2[97].addShapeBox(0F, 0F, 0F, 6, 3, 6, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 516
		rightAnimTrackModel2[97].setRotationPoint(-99F, 7F, -49F);

		rightAnimTrackModel2[98].addShapeBox(0F, 0F, 0F, 8, 3, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 517
		rightAnimTrackModel2[98].setRotationPoint(-92F, 7F, -50F);

		rightAnimTrackModel2[99].addShapeBox(0F, 0F, 0F, 6, 3, 6, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 518
		rightAnimTrackModel2[99].setRotationPoint(-83F, 7F, -49F);

		rightAnimTrackModel2[100].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 519
		rightAnimTrackModel2[100].setRotationPoint(-104F, 7F, -40F);

		rightAnimTrackModel2[101].addShapeBox(0F, 0F, 0F, 8, 3, 24, 0F,0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F); // Box 520
		rightAnimTrackModel2[101].setRotationPoint(-84F, 7F, -50F);

		rightAnimTrackModel2[102].addShapeBox(0F, 0F, 0F, 8, 3, 24, 0F,0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F); // Box 521
		rightAnimTrackModel2[102].setRotationPoint(-100F, 7F, -50F);

		rightAnimTrackModel2[103].addShapeBox(0F, 0F, 0F, 6, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 522
		rightAnimTrackModel2[103].setRotationPoint(-83F, 7F, -33F);

		rightAnimTrackModel2[104].addShapeBox(0F, 0F, 0F, 6, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 523
		rightAnimTrackModel2[104].setRotationPoint(-99F, 7F, -33F);

		rightAnimTrackModel2[105].addShapeBox(-6F, 5F, 0F, 5, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F); // Box 524
		rightAnimTrackModel2[105].setRotationPoint(-73F, -50F, -34F);
		rightAnimTrackModel2[105].rotateAngleZ = -0.2443461F;

		rightAnimTrackModel2[106].addShapeBox(0F, -2F, 0F, 7, 7, 4, 0F,-7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 525
		rightAnimTrackModel2[106].setRotationPoint(-79F, -50F, -34F);
		rightAnimTrackModel2[106].rotateAngleZ = -0.2443461F;

		rightAnimTrackModel2[107].addShapeBox(-6F, 5F, 0F, 5, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F); // Box 526
		rightAnimTrackModel2[107].setRotationPoint(-76F, -56F, -34F);
		rightAnimTrackModel2[107].rotateAngleZ = -0.2443461F;

		rightAnimTrackModel2[108].addShapeBox(0F, -2F, 0F, 7, 7, 4, 0F,-7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 527
		rightAnimTrackModel2[108].setRotationPoint(-84F, -56F, -34F);
		rightAnimTrackModel2[108].rotateAngleZ = -0.2443461F;

		rightAnimTrackModel2[109].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, 0F, 2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 528
		rightAnimTrackModel2[109].setRotationPoint(-76F, 7F, -40F);

		rightAnimTrackModel2[110].addShapeBox(0F, 0F, 0F, 14, 4, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 529
		rightAnimTrackModel2[110].setRotationPoint(-95F, -49F, -40.5F);

		rightAnimTrackModel2[111].addShapeBox(0F, 0F, 0F, 4, 12, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 530
		rightAnimTrackModel2[111].setRotationPoint(-90F, -20F, -45F);

		rightAnimTrackModel2[112].addShapeBox(0F, 0F, 0F, 11, 12, 4, 0F,-5F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -5F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F); // Box 531
		rightAnimTrackModel2[112].setRotationPoint(-99F, -48F, -38F);

		rightAnimTrackModel2[113].addShapeBox(0F, 0F, 0F, 11, 27, 4, 0F,-2F, -4F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, -7F, -4F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, -7F, -4F, 0F); // Box 532
		rightAnimTrackModel2[113].setRotationPoint(-99F, -41F, -38F);

		rightAnimTrackModel2[114].addShapeBox(0F, 0F, 0F, 11, 27, 4, 0F,-2F, -4F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, -7F, -4F, 0F, -7F, -4F, 0F, -2F, -4F, 0F); // Box 533
		rightAnimTrackModel2[114].setRotationPoint(-88F, -41F, -38F);

		rightAnimTrackModel2[115].addShapeBox(0F, 0F, 0F, 11, 12, 4, 0F,-2F, -1F, 0F, -5F, -1F, 0F, -5F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F); // Box 534
		rightAnimTrackModel2[115].setRotationPoint(-88F, -48F, -38F);	
	}
	
	private void initrightAnimTrackModel3_0()
	{
		rightAnimTrackModel3[0] = new ModelRendererTurbo(this, 537, 273, textureX, textureY); // Box 455
		rightAnimTrackModel3[1] = new ModelRendererTurbo(this, 993, 57, textureX, textureY); // Box 456
		rightAnimTrackModel3[2] = new ModelRendererTurbo(this, 897, 257, textureX, textureY); // Box 457
		rightAnimTrackModel3[3] = new ModelRendererTurbo(this, 473, 89, textureX, textureY); // Box 458
		rightAnimTrackModel3[4] = new ModelRendererTurbo(this, 481, 273, textureX, textureY); // Box 459
		rightAnimTrackModel3[5] = new ModelRendererTurbo(this, 953, 273, textureX, textureY); // Box 460
		rightAnimTrackModel3[6] = new ModelRendererTurbo(this, 809, 281, textureX, textureY); // Box 461
		rightAnimTrackModel3[7] = new ModelRendererTurbo(this, 953, 297, textureX, textureY); // Box 462
		rightAnimTrackModel3[8] = new ModelRendererTurbo(this, 161, 321, textureX, textureY); // Box 463
		rightAnimTrackModel3[9] = new ModelRendererTurbo(this, 241, 321, textureX, textureY); // Box 464
		rightAnimTrackModel3[10] = new ModelRendererTurbo(this, 833, 321, textureX, textureY); // Box 465
		rightAnimTrackModel3[11] = new ModelRendererTurbo(this, 873, 329, textureX, textureY); // Box 466
		rightAnimTrackModel3[12] = new ModelRendererTurbo(this, 281, 353, textureX, textureY); // Box 467
		rightAnimTrackModel3[13] = new ModelRendererTurbo(this, 393, 353, textureX, textureY); // Box 468
		rightAnimTrackModel3[14] = new ModelRendererTurbo(this, 505, 321, textureX, textureY); // Box 469
		rightAnimTrackModel3[15] = new ModelRendererTurbo(this, 937, 329, textureX, textureY); // Box 470
		rightAnimTrackModel3[16] = new ModelRendererTurbo(this, 1, 353, textureX, textureY); // Box 471
		rightAnimTrackModel3[17] = new ModelRendererTurbo(this, 521, 177, textureX, textureY); // Box 472
		rightAnimTrackModel3[18] = new ModelRendererTurbo(this, 337, 113, textureX, textureY); // Box 473
		rightAnimTrackModel3[19] = new ModelRendererTurbo(this, 689, 129, textureX, textureY); // Box 474
		rightAnimTrackModel3[20] = new ModelRendererTurbo(this, 937, 57, textureX, textureY); // Box 475
		rightAnimTrackModel3[21] = new ModelRendererTurbo(this, 801, 65, textureX, textureY); // Box 476
		rightAnimTrackModel3[22] = new ModelRendererTurbo(this, 625, 353, textureX, textureY); // Box 477
		rightAnimTrackModel3[23] = new ModelRendererTurbo(this, 721, 353, textureX, textureY); // Box 478
		rightAnimTrackModel3[24] = new ModelRendererTurbo(this, 257, 161, textureX, textureY); // Box 479
		rightAnimTrackModel3[25] = new ModelRendererTurbo(this, 753, 129, textureX, textureY); // Box 480
		rightAnimTrackModel3[26] = new ModelRendererTurbo(this, 993, 129, textureX, textureY); // Box 481
		rightAnimTrackModel3[27] = new ModelRendererTurbo(this, 985, 145, textureX, textureY); // Box 482
		rightAnimTrackModel3[28] = new ModelRendererTurbo(this, 753, 169, textureX, textureY); // Box 483
		rightAnimTrackModel3[29] = new ModelRendererTurbo(this, 369, 201, textureX, textureY); // Box 484
		rightAnimTrackModel3[30] = new ModelRendererTurbo(this, 137, 217, textureX, textureY); // Box 485
		rightAnimTrackModel3[31] = new ModelRendererTurbo(this, 217, 217, textureX, textureY); // Box 486
		rightAnimTrackModel3[32] = new ModelRendererTurbo(this, 593, 57, textureX, textureY); // Box 487
		rightAnimTrackModel3[33] = new ModelRendererTurbo(this, 1001, 113, textureX, textureY); // Box 488
		rightAnimTrackModel3[34] = new ModelRendererTurbo(this, 153, 113, textureX, textureY); // Box 489
		rightAnimTrackModel3[35] = new ModelRendererTurbo(this, 561, 121, textureX, textureY); // Box 490
		rightAnimTrackModel3[36] = new ModelRendererTurbo(this, 41, 145, textureX, textureY); // Box 491
		rightAnimTrackModel3[37] = new ModelRendererTurbo(this, 257, 361, textureX, textureY); // Box 492
		rightAnimTrackModel3[38] = new ModelRendererTurbo(this, 905, 393, textureX, textureY); // Box 493
		rightAnimTrackModel3[39] = new ModelRendererTurbo(this, 281, 401, textureX, textureY); // Box 494
		rightAnimTrackModel3[40] = new ModelRendererTurbo(this, 289, 321, textureX, textureY); // Box 495
		rightAnimTrackModel3[41] = new ModelRendererTurbo(this, 969, 393, textureX, textureY); // Box 496
		rightAnimTrackModel3[42] = new ModelRendererTurbo(this, 345, 401, textureX, textureY); // Box 497
		rightAnimTrackModel3[43] = new ModelRendererTurbo(this, 409, 401, textureX, textureY); // Box 498
		rightAnimTrackModel3[44] = new ModelRendererTurbo(this, 473, 401, textureX, textureY); // Box 499
		rightAnimTrackModel3[45] = new ModelRendererTurbo(this, 745, 393, textureX, textureY); // Box 500
		rightAnimTrackModel3[46] = new ModelRendererTurbo(this, 137, 409, textureX, textureY); // Box 501
		rightAnimTrackModel3[47] = new ModelRendererTurbo(this, 209, 409, textureX, textureY); // Box 502
		rightAnimTrackModel3[48] = new ModelRendererTurbo(this, 513, 409, textureX, textureY); // Box 503
		rightAnimTrackModel3[49] = new ModelRendererTurbo(this, 945, 409, textureX, textureY); // Box 504
		rightAnimTrackModel3[50] = new ModelRendererTurbo(this, 1, 417, textureX, textureY); // Box 505
		rightAnimTrackModel3[51] = new ModelRendererTurbo(this, 561, 409, textureX, textureY); // Box 506
		rightAnimTrackModel3[52] = new ModelRendererTurbo(this, 793, 409, textureX, textureY); // Box 507
		rightAnimTrackModel3[53] = new ModelRendererTurbo(this, 601, 417, textureX, textureY); // Box 508
		rightAnimTrackModel3[54] = new ModelRendererTurbo(this, 185, 409, textureX, textureY); // Box 509
		rightAnimTrackModel3[55] = new ModelRendererTurbo(this, 497, 313, textureX, textureY); // Box 510
		rightAnimTrackModel3[56] = new ModelRendererTurbo(this, 985, 321, textureX, textureY); // Box 511
		rightAnimTrackModel3[57] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 512
		rightAnimTrackModel3[58] = new ModelRendererTurbo(this, 753, 201, textureX, textureY); // Box 513
		rightAnimTrackModel3[59] = new ModelRendererTurbo(this, 1001, 49, textureX, textureY); // Box 514
		rightAnimTrackModel3[60] = new ModelRendererTurbo(this, 57, 241, textureX, textureY); // Box 515
		rightAnimTrackModel3[61] = new ModelRendererTurbo(this, 321, 281, textureX, textureY); // Box 516
		rightAnimTrackModel3[62] = new ModelRendererTurbo(this, 593, 305, textureX, textureY); // Box 517
		rightAnimTrackModel3[63] = new ModelRendererTurbo(this, 809, 305, textureX, textureY); // Box 518
		rightAnimTrackModel3[64] = new ModelRendererTurbo(this, 753, 145, textureX, textureY); // Box 520
		rightAnimTrackModel3[65] = new ModelRendererTurbo(this, 49, 401, textureX, textureY); // Box 521
		rightAnimTrackModel3[66] = new ModelRendererTurbo(this, 281, 121, textureX, textureY); // Box 522
		rightAnimTrackModel3[67] = new ModelRendererTurbo(this, 1, 585, textureX, textureY); // Box 523
		rightAnimTrackModel3[68] = new ModelRendererTurbo(this, 585, 585, textureX, textureY); // Box 524
		rightAnimTrackModel3[69] = new ModelRendererTurbo(this, 881, 585, textureX, textureY); // Box 525
		rightAnimTrackModel3[70] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 526
		rightAnimTrackModel3[71] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 527
		rightAnimTrackModel3[72] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 528
		rightAnimTrackModel3[73] = new ModelRendererTurbo(this, 1, 449, textureX, textureY); // Box 529
		rightAnimTrackModel3[74] = new ModelRendererTurbo(this, 249, 449, textureX, textureY); // Box 530
		rightAnimTrackModel3[75] = new ModelRendererTurbo(this, 305, 449, textureX, textureY); // Box 531
		rightAnimTrackModel3[76] = new ModelRendererTurbo(this, 369, 449, textureX, textureY); // Box 532
		rightAnimTrackModel3[77] = new ModelRendererTurbo(this, 857, 449, textureX, textureY); // Box 533
		rightAnimTrackModel3[78] = new ModelRendererTurbo(this, 1, 353, textureX, textureY); // Box 534
		rightAnimTrackModel3[79] = new ModelRendererTurbo(this, 705, 353, textureX, textureY); // Box 535
		rightAnimTrackModel3[80] = new ModelRendererTurbo(this, 49, 361, textureX, textureY); // Box 536
		rightAnimTrackModel3[81] = new ModelRendererTurbo(this, 209, 361, textureX, textureY); // Box 537
		rightAnimTrackModel3[82] = new ModelRendererTurbo(this, 49, 457, textureX, textureY); // Box 538
		rightAnimTrackModel3[83] = new ModelRendererTurbo(this, 425, 457, textureX, textureY); // Box 539
		rightAnimTrackModel3[84] = new ModelRendererTurbo(this, 545, 457, textureX, textureY); // Box 540
		rightAnimTrackModel3[85] = new ModelRendererTurbo(this, 409, 353, textureX, textureY); // Box 541
		rightAnimTrackModel3[86] = new ModelRendererTurbo(this, 553, 361, textureX, textureY); // Box 542
		rightAnimTrackModel3[87] = new ModelRendererTurbo(this, 705, 433, textureX, textureY); // Box 543
		rightAnimTrackModel3[88] = new ModelRendererTurbo(this, 601, 441, textureX, textureY); // Box 544
		rightAnimTrackModel3[89] = new ModelRendererTurbo(this, 177, 441, textureX, textureY); // Box 545
		rightAnimTrackModel3[90] = new ModelRendererTurbo(this, 977, 441, textureX, textureY); // Box 546
		rightAnimTrackModel3[91] = new ModelRendererTurbo(this, 721, 449, textureX, textureY); // Box 547
		rightAnimTrackModel3[92] = new ModelRendererTurbo(this, 1, 465, textureX, textureY); // Box 548
		rightAnimTrackModel3[93] = new ModelRendererTurbo(this, 249, 465, textureX, textureY); // Box 549
		rightAnimTrackModel3[94] = new ModelRendererTurbo(this, 89, 457, textureX, textureY); // Box 550
		rightAnimTrackModel3[95] = new ModelRendererTurbo(this, 585, 465, textureX, textureY); // Box 551
		rightAnimTrackModel3[96] = new ModelRendererTurbo(this, 841, 361, textureX, textureY); // Box 552
		rightAnimTrackModel3[97] = new ModelRendererTurbo(this, 657, 465, textureX, textureY); // Box 553
		rightAnimTrackModel3[98] = new ModelRendererTurbo(this, 1, 369, textureX, textureY); // Box 554
		rightAnimTrackModel3[99] = new ModelRendererTurbo(this, 657, 89, textureX, textureY); // Box 555
		rightAnimTrackModel3[100] = new ModelRendererTurbo(this, 761, 465, textureX, textureY); // Box 556
		rightAnimTrackModel3[101] = new ModelRendererTurbo(this, 121, 473, textureX, textureY); // Box 557
		rightAnimTrackModel3[102] = new ModelRendererTurbo(this, 353, 377, textureX, textureY); // Box 558
		rightAnimTrackModel3[103] = new ModelRendererTurbo(this, 385, 377, textureX, textureY); // Box 559
		rightAnimTrackModel3[104] = new ModelRendererTurbo(this, 353, 153, textureX, textureY); // Box 560
		rightAnimTrackModel3[105] = new ModelRendererTurbo(this, 1001, 361, textureX, textureY); // Box 561
		rightAnimTrackModel3[106] = new ModelRendererTurbo(this, 233, 241, textureX, textureY); // Box 562
		rightAnimTrackModel3[107] = new ModelRendererTurbo(this, 465, 377, textureX, textureY); // Box 563
		rightAnimTrackModel3[108] = new ModelRendererTurbo(this, 793, 113, textureX, textureY); // Box 564
		rightAnimTrackModel3[109] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 565
		rightAnimTrackModel3[110] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 566
		rightAnimTrackModel3[111] = new ModelRendererTurbo(this, 209, 361, textureX, textureY); // Box 567
		rightAnimTrackModel3[112] = new ModelRendererTurbo(this, 49, 361, textureX, textureY); // Box 568
		rightAnimTrackModel3[113] = new ModelRendererTurbo(this, 1, 353, textureX, textureY); // Box 569
		rightAnimTrackModel3[114] = new ModelRendererTurbo(this, 705, 353, textureX, textureY); // Box 570
		rightAnimTrackModel3[115] = new ModelRendererTurbo(this, 729, 505, textureX, textureY); // Box 688

		rightAnimTrackModel3[0].addShapeBox(0F, 0F, 0F, 30, 10, 16, 0F,-10F, 0F, -1.5F, -10F, 0F, -1.5F, -10F, 0F, 1.5F, -10F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 455
		rightAnimTrackModel3[0].setRotationPoint(-25F, -83F, -49F);

		rightAnimTrackModel3[1].addShapeBox(-14F, 7F, 2F, 11, 12, 4, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 456
		rightAnimTrackModel3[1].setRotationPoint(-10F, -66F, -48F);
		rightAnimTrackModel3[1].rotateAngleZ = 0.41887902F;

		rightAnimTrackModel3[2].addShapeBox(-14F, 19F, 0F, 11, 27, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, -5F, 0F, -3F); // Box 457
		rightAnimTrackModel3[2].setRotationPoint(-10F, -66F, -48F);
		rightAnimTrackModel3[2].rotateAngleZ = 0.41887902F;

		rightAnimTrackModel3[3].addShapeBox(3F, 7F, 2F, 11, 12, 4, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 458
		rightAnimTrackModel3[3].setRotationPoint(-10F, -66F, -48F);
		rightAnimTrackModel3[3].rotateAngleZ = 0.41887902F;

		rightAnimTrackModel3[4].addShapeBox(3F, 19F, 0F, 11, 27, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 3F, -5F, 6F, 3F, -5F, 6F, -3F, 0F, 4F, -3F); // Box 459
		rightAnimTrackModel3[4].setRotationPoint(-10F, -66F, -48F);
		rightAnimTrackModel3[4].rotateAngleZ = 0.41887902F;

		rightAnimTrackModel3[5].addShapeBox(0F, 0F, 0F, 20, 6, 12, 0F,-6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 460
		rightAnimTrackModel3[5].setRotationPoint(0F, -29F, -63F);

		rightAnimTrackModel3[6].addShapeBox(0F, 0F, 0F, 20, 8, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 461
		rightAnimTrackModel3[6].setRotationPoint(0F, -23F, -63F);

		rightAnimTrackModel3[7].addShapeBox(0F, 0F, 0F, 20, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Box 462
		rightAnimTrackModel3[7].setRotationPoint(0F, -15F, -63F);

		rightAnimTrackModel3[8].addShapeBox(0F, 0F, 0F, 10, 8, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F); // Box 463
		rightAnimTrackModel3[8].setRotationPoint(4F, -1F, -71F);

		rightAnimTrackModel3[9].addShapeBox(0F, 0F, 0F, 9, 8, 28, 0F,0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 5F, 0F, -8F, 0F, 0F, 5F, 0F, 0F, 5F, 5F, 0F, -8F); // Box 464
		rightAnimTrackModel3[9].setRotationPoint(-5F, -1F, -71F);

		rightAnimTrackModel3[10].addShapeBox(0F, 0F, 0F, 9, 8, 28, 0F,0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 5F, 5F, 0F, -8F, 5F, 0F, -8F, 0F, 0F, 5F); // Box 465
		rightAnimTrackModel3[10].setRotationPoint(14F, -1F, -71F);

		rightAnimTrackModel3[11].addShapeBox(0F, 0F, 0F, 10, 3, 38, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 466
		rightAnimTrackModel3[11].setRotationPoint(4F, 7F, -76F);

		rightAnimTrackModel3[12].addShapeBox(0F, 0F, 0F, 14, 3, 38, 0F,0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F); // Box 467
		rightAnimTrackModel3[12].setRotationPoint(14F, 7F, -76F);

		rightAnimTrackModel3[13].addShapeBox(0F, 0F, 0F, 14, 3, 38, 0F,0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F); // Box 468
		rightAnimTrackModel3[13].setRotationPoint(-10F, 7F, -76F);

		rightAnimTrackModel3[14].addShapeBox(0F, 0F, 0F, 10, 3, 28, 0F,0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 469
		rightAnimTrackModel3[14].setRotationPoint(4F, -4F, -71F);

		rightAnimTrackModel3[15].addShapeBox(0F, 0F, 0F, 9, 3, 28, 0F,0F, 0F, -8F, -5F, 0F, -12F, -5F, 0F, -12F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F); // Box 470
		rightAnimTrackModel3[15].setRotationPoint(14F, -4F, -71F);

		rightAnimTrackModel3[16].addShapeBox(0F, 0F, 0F, 9, 3, 28, 0F,-5F, 0F, -12F, 0F, 0F, -8F, 0F, 0F, -8F, -5F, 0F, -12F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F); // Box 471
		rightAnimTrackModel3[16].setRotationPoint(-5F, -4F, -71F);

		rightAnimTrackModel3[17].addShapeBox(0F, 0F, 0F, 10, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 472
		rightAnimTrackModel3[17].setRotationPoint(4F, -7F, -63F);

		rightAnimTrackModel3[18].addShapeBox(0F, 0F, 0F, 4, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 473
		rightAnimTrackModel3[18].setRotationPoint(14F, -7F, -63F);

		rightAnimTrackModel3[19].addShapeBox(0F, 0F, 0F, 4, 3, 12, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 474
		rightAnimTrackModel3[19].setRotationPoint(0F, -7F, -63F);

		rightAnimTrackModel3[20].addShapeBox(0F, 0F, 0F, 4, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 475
		rightAnimTrackModel3[20].setRotationPoint(1F, -15F, -59F);

		rightAnimTrackModel3[21].addShapeBox(0F, 0F, 0F, 4, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 476
		rightAnimTrackModel3[21].setRotationPoint(13F, -15F, -59F);

		rightAnimTrackModel3[22].addShapeBox(0F, 0F, 0F, 30, 10, 16, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 477
		rightAnimTrackModel3[22].setRotationPoint(-25F, -73F, -50.5F);

		rightAnimTrackModel3[23].addShapeBox(0F, 0F, 0F, 30, 10, 16, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F); // Box 478
		rightAnimTrackModel3[23].setRotationPoint(-25F, -63F, -52F);

		rightAnimTrackModel3[24].addShapeBox(0F, 0F, 0F, 22, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 479
		rightAnimTrackModel3[24].setRotationPoint(-1F, -23F, -51.5F);

		rightAnimTrackModel3[25].addShapeBox(0F, 0F, 0F, 8, 2, 7, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 480
		rightAnimTrackModel3[25].setRotationPoint(6F, -25F, -51.5F);

		rightAnimTrackModel3[26].addShapeBox(0F, 0F, 0F, 8, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 481
		rightAnimTrackModel3[26].setRotationPoint(6F, -19F, -51.5F);

		rightAnimTrackModel3[27].addShapeBox(0F, 0F, 0F, 8, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 482
		rightAnimTrackModel3[27].setRotationPoint(6F, -23F, -51.5F);

		rightAnimTrackModel3[28].addShapeBox(0F, 0F, 0F, 8, 3, 8, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 483
		rightAnimTrackModel3[28].setRotationPoint(-7F, 7F, -73F);

		rightAnimTrackModel3[29].addShapeBox(0F, 0F, 0F, 8, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 484
		rightAnimTrackModel3[29].setRotationPoint(-7F, 7F, -49F);

		rightAnimTrackModel3[30].addShapeBox(0F, 0F, 0F, 8, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 485
		rightAnimTrackModel3[30].setRotationPoint(17F, 7F, -49F);

		rightAnimTrackModel3[31].addShapeBox(0F, 0F, 0F, 8, 3, 8, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 486
		rightAnimTrackModel3[31].setRotationPoint(17F, 7F, -73F);

		rightAnimTrackModel3[32].addShapeBox(0F, 0F, 0F, 4, 3, 8, 0F,0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 487
		rightAnimTrackModel3[32].setRotationPoint(-14F, 7F, -61F);

		rightAnimTrackModel3[33].addShapeBox(0F, 0F, 0F, 7, 7, 4, 0F,-7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 488
		rightAnimTrackModel3[33].setRotationPoint(70F, -56F, -34F);

		rightAnimTrackModel3[34].addShapeBox(0F, 0F, 0F, 5, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F); // Box 489
		rightAnimTrackModel3[34].setRotationPoint(72F, -49F, -34F);

		rightAnimTrackModel3[35].addShapeBox(0F, 0F, 0F, 5, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F); // Box 490
		rightAnimTrackModel3[35].setRotationPoint(75F, -43F, -34F);

		rightAnimTrackModel3[36].addShapeBox(0F, 0F, 0F, 7, 7, 4, 0F,-7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 491
		rightAnimTrackModel3[36].setRotationPoint(75F, -50F, -34F);

		rightAnimTrackModel3[37].addShapeBox(0F, 0F, 0F, 18, 6, 12, 0F,-6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 492
		rightAnimTrackModel3[37].setRotationPoint(56F, -46F, -40F);

		rightAnimTrackModel3[38].addShapeBox(0F, 0F, 0F, 18, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 493
		rightAnimTrackModel3[38].setRotationPoint(56F, -40F, -40F);

		rightAnimTrackModel3[39].addShapeBox(0F, 0F, 0F, 18, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Box 494
		rightAnimTrackModel3[39].setRotationPoint(56F, -34F, -40F);

		rightAnimTrackModel3[40].addShapeBox(0F, 0F, 0F, 18, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 495
		rightAnimTrackModel3[40].setRotationPoint(77F, -59F, -36F);

		rightAnimTrackModel3[41].addShapeBox(0F, 0F, 0F, 18, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Box 496
		rightAnimTrackModel3[41].setRotationPoint(77F, -53F, -36F);

		rightAnimTrackModel3[42].addShapeBox(0F, 0F, 0F, 16, 5, 12, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 497
		rightAnimTrackModel3[42].setRotationPoint(42F, -22F, -44F);

		rightAnimTrackModel3[43].addShapeBox(0F, 0F, 0F, 16, 5, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 498
		rightAnimTrackModel3[43].setRotationPoint(42F, -11F, -44F);

		rightAnimTrackModel3[44].addShapeBox(0F, 0F, 0F, 16, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 499
		rightAnimTrackModel3[44].setRotationPoint(42F, -17F, -44F);

		rightAnimTrackModel3[45].addShapeBox(0F, 0F, 0F, 8, 5, 24, 0F,-2F, 0F, -10F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, -10F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F); // Box 500
		rightAnimTrackModel3[45].setRotationPoint(38F, 2F, -50F);

		rightAnimTrackModel3[46].addShapeBox(0F, 0F, 0F, 8, 5, 24, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 501
		rightAnimTrackModel3[46].setRotationPoint(46F, 2F, -50F);

		rightAnimTrackModel3[47].addShapeBox(0F, 0F, 0F, 8, 5, 24, 0F,0F, 0F, -2F, -2F, 0F, -10F, -2F, 0F, -10F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F); // Box 502
		rightAnimTrackModel3[47].setRotationPoint(54F, 2F, -50F);

		rightAnimTrackModel3[48].addShapeBox(0F, 0F, 0F, 8, 3, 24, 0F,0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F); // Box 503
		rightAnimTrackModel3[48].setRotationPoint(38F, 7F, -50F);

		rightAnimTrackModel3[49].addShapeBox(0F, 0F, 0F, 8, 3, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 504
		rightAnimTrackModel3[49].setRotationPoint(46F, 7F, -50F);

		rightAnimTrackModel3[50].addShapeBox(0F, 0F, 0F, 8, 3, 24, 0F,0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F); // Box 505
		rightAnimTrackModel3[50].setRotationPoint(54F, 7F, -50F);

		rightAnimTrackModel3[51].addShapeBox(0F, 0F, 0F, 6, 3, 20, 0F,0F, 0F, -3F, -3F, 0F, -8F, -3F, 0F, -8F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F); // Box 506
		rightAnimTrackModel3[51].setRotationPoint(54F, -1F, -48F);

		rightAnimTrackModel3[52].addShapeBox(0F, 0F, 0F, 8, 3, 20, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 507
		rightAnimTrackModel3[52].setRotationPoint(46F, -1F, -48F);

		rightAnimTrackModel3[53].addShapeBox(0F, 0F, 0F, 6, 3, 20, 0F,-3F, 0F, -8F, 0F, 0F, -3F, 0F, 0F, -3F, -3F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F); // Box 508
		rightAnimTrackModel3[53].setRotationPoint(40F, -1F, -48F);

		rightAnimTrackModel3[54].addShapeBox(0F, 0F, 0F, 8, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 509
		rightAnimTrackModel3[54].setRotationPoint(46F, -4F, -45F);

		rightAnimTrackModel3[55].addShapeBox(0F, 0F, 0F, 3, 3, 14, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 510
		rightAnimTrackModel3[55].setRotationPoint(43F, -4F, -45F);

		rightAnimTrackModel3[56].addShapeBox(0F, 0F, 0F, 3, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 511
		rightAnimTrackModel3[56].setRotationPoint(54F, -4F, -45F);

		rightAnimTrackModel3[57].addShapeBox(0F, 0F, 0F, 4, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 512
		rightAnimTrackModel3[57].setRotationPoint(45F, -8F, -41F);

		rightAnimTrackModel3[58].addShapeBox(0F, 0F, 0F, 4, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 513
		rightAnimTrackModel3[58].setRotationPoint(51F, -8F, -41F);

		rightAnimTrackModel3[59].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 514
		rightAnimTrackModel3[59].setRotationPoint(34F, 7F, -40F);

		rightAnimTrackModel3[60].addShapeBox(0F, 0F, 0F, 6, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 515
		rightAnimTrackModel3[60].setRotationPoint(39F, 7F, -33F);

		rightAnimTrackModel3[61].addShapeBox(0F, 0F, 0F, 6, 3, 6, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 516
		rightAnimTrackModel3[61].setRotationPoint(39F, 7F, -49F);

		rightAnimTrackModel3[62].addShapeBox(0F, 0F, 0F, 6, 3, 6, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 517
		rightAnimTrackModel3[62].setRotationPoint(55F, 7F, -49F);

		rightAnimTrackModel3[63].addShapeBox(0F, 0F, 0F, 6, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 518
		rightAnimTrackModel3[63].setRotationPoint(55F, 7F, -33F);

		rightAnimTrackModel3[64].addShapeBox(-8F, 30F, -0.5F, 16, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 520
		rightAnimTrackModel3[64].setRotationPoint(-10F, -66F, -47F);
		rightAnimTrackModel3[64].rotateAngleZ = 0.41887902F;

		rightAnimTrackModel3[65].addShapeBox(0F, 0F, 0F, 4, 3, 8, 0F,0F, 0F, 2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 521
		rightAnimTrackModel3[65].setRotationPoint(28F, 7F, -61F);

		rightAnimTrackModel3[66].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, 0F, 2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 522
		rightAnimTrackModel3[66].setRotationPoint(62F, 7F, -40F);

		rightAnimTrackModel3[67].addShapeBox(0F, 0F, 0F, 30, 10, 4, 0F,-2F, 0F, -1.5F, -2F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, -12F, -2F, 0F, -12F, -2F, 0F, -10F, 0F, 0F, -10F, 0F, 0F); // Box 523
		rightAnimTrackModel3[67].setRotationPoint(-25F, -63F, -56F);

		rightAnimTrackModel3[68].addShapeBox(0F, 0F, 0F, 30, 10, 4, 0F,-2F, 0F, -1.5F, -2F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 524
		rightAnimTrackModel3[68].setRotationPoint(-25F, -73F, -54.5F);

		rightAnimTrackModel3[69].addShapeBox(0F, 0F, 0F, 30, 10, 4, 0F,-12F, -2F, -1.5F, -12F, -2F, -1.5F, -10F, 0F, 1.5F, -10F, 0F, 1.5F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 525
		rightAnimTrackModel3[69].setRotationPoint(-25F, -83F, -53F);

		rightAnimTrackModel3[70].addShapeBox(0F, 0F, 0F, 6, 22, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 526
		rightAnimTrackModel3[70].setRotationPoint(-13F, -79F, -53.5F);

		rightAnimTrackModel3[71].addShapeBox(0F, 0F, 0F, 14, 4, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 527
		rightAnimTrackModel3[71].setRotationPoint(58F, -39F, -40.5F);

		rightAnimTrackModel3[72].addShapeBox(0F, 0F, 0F, 4, 12, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 528
		rightAnimTrackModel3[72].setRotationPoint(48F, -20F, -45F);

		rightAnimTrackModel3[73].addShapeBox(0F, 0F, 0F, 18, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Box 529
		rightAnimTrackModel3[73].setRotationPoint(-76F, -53F, -36F);

		rightAnimTrackModel3[74].addShapeBox(0F, 0F, 0F, 18, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 530
		rightAnimTrackModel3[74].setRotationPoint(-76F, -59F, -36F);

		rightAnimTrackModel3[75].addShapeBox(0F, 0F, 0F, 18, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Box 531
		rightAnimTrackModel3[75].setRotationPoint(-97F, -34F, -40F);

		rightAnimTrackModel3[76].addShapeBox(0F, 0F, 0F, 18, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 532
		rightAnimTrackModel3[76].setRotationPoint(-97F, -40F, -40F);

		rightAnimTrackModel3[77].addShapeBox(0F, 0F, 0F, 18, 6, 12, 0F,-6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 533
		rightAnimTrackModel3[77].setRotationPoint(-97F, -46F, -40F);

		rightAnimTrackModel3[78].addShapeBox(0F, 0F, 0F, 6, 6, 4, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F); // Box 534
		rightAnimTrackModel3[78].setRotationPoint(-100F, -40F, -38F);

		rightAnimTrackModel3[79].addShapeBox(0F, 0F, 0F, 9, 8, 4, 0F,0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, 13F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 13F, 0F); // Box 535
		rightAnimTrackModel3[79].setRotationPoint(-109F, -37F, -38F);

		rightAnimTrackModel3[80].addShapeBox(0F, 0F, 0F, 15, 9, 4, 0F,0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F); // Box 536
		rightAnimTrackModel3[80].setRotationPoint(-107F, -29F, -38F);

		rightAnimTrackModel3[81].addShapeBox(0F, 0F, 0F, 6, 9, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Box 537
		rightAnimTrackModel3[81].setRotationPoint(-92F, -29F, -38F);

		rightAnimTrackModel3[82].addShapeBox(0F, 0F, 0F, 16, 5, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 538
		rightAnimTrackModel3[82].setRotationPoint(-112F, -11F, -44F);

		rightAnimTrackModel3[83].addShapeBox(0F, 0F, 0F, 16, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 539
		rightAnimTrackModel3[83].setRotationPoint(-112F, -17F, -44F);

		rightAnimTrackModel3[84].addShapeBox(0F, 0F, 0F, 16, 5, 12, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 540
		rightAnimTrackModel3[84].setRotationPoint(-112F, -22F, -44F);

		rightAnimTrackModel3[85].addShapeBox(0F, 0F, 0F, 4, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 541
		rightAnimTrackModel3[85].setRotationPoint(-103F, -8F, -41F);

		rightAnimTrackModel3[86].addShapeBox(0F, 0F, 0F, 4, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 542
		rightAnimTrackModel3[86].setRotationPoint(-109F, -8F, -41F);

		rightAnimTrackModel3[87].addShapeBox(0F, 0F, 0F, 3, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 543
		rightAnimTrackModel3[87].setRotationPoint(-100F, -4F, -45F);

		rightAnimTrackModel3[88].addShapeBox(0F, 0F, 0F, 6, 3, 20, 0F,-3F, 0F, -8F, 0F, 0F, -3F, 0F, 0F, -3F, -3F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F); // Box 544
		rightAnimTrackModel3[88].setRotationPoint(-114F, -1F, -48F);

		rightAnimTrackModel3[89].addShapeBox(0F, 0F, 0F, 3, 3, 14, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 545
		rightAnimTrackModel3[89].setRotationPoint(-111F, -4F, -45F);

		rightAnimTrackModel3[90].addShapeBox(0F, 0F, 0F, 8, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 546
		rightAnimTrackModel3[90].setRotationPoint(-108F, -4F, -45F);

		rightAnimTrackModel3[91].addShapeBox(0F, 0F, 0F, 8, 3, 20, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 547
		rightAnimTrackModel3[91].setRotationPoint(-108F, -1F, -48F);

		rightAnimTrackModel3[92].addShapeBox(0F, 0F, 0F, 8, 5, 24, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 548
		rightAnimTrackModel3[92].setRotationPoint(-108F, 2F, -50F);

		rightAnimTrackModel3[93].addShapeBox(0F, 0F, 0F, 8, 5, 24, 0F,-2F, 0F, -10F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, -10F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F); // Box 549
		rightAnimTrackModel3[93].setRotationPoint(-116F, 2F, -50F);

		rightAnimTrackModel3[94].addShapeBox(0F, 0F, 0F, 6, 3, 20, 0F,0F, 0F, -3F, -3F, 0F, -8F, -3F, 0F, -8F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F); // Box 550
		rightAnimTrackModel3[94].setRotationPoint(-100F, -1F, -48F);

		rightAnimTrackModel3[95].addShapeBox(0F, 0F, 0F, 8, 5, 24, 0F,0F, 0F, -2F, -2F, 0F, -10F, -2F, 0F, -10F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F); // Box 551
		rightAnimTrackModel3[95].setRotationPoint(-100F, 2F, -50F);

		rightAnimTrackModel3[96].addShapeBox(0F, 0F, 0F, 6, 3, 6, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 552
		rightAnimTrackModel3[96].setRotationPoint(-115F, 7F, -49F);

		rightAnimTrackModel3[97].addShapeBox(0F, 0F, 0F, 8, 3, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 553
		rightAnimTrackModel3[97].setRotationPoint(-108F, 7F, -50F);

		rightAnimTrackModel3[98].addShapeBox(0F, 0F, 0F, 6, 3, 6, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 554
		rightAnimTrackModel3[98].setRotationPoint(-99F, 7F, -49F);

		rightAnimTrackModel3[99].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 555
		rightAnimTrackModel3[99].setRotationPoint(-120F, 7F, -40F);

		rightAnimTrackModel3[100].addShapeBox(0F, 0F, 0F, 8, 3, 24, 0F,0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F); // Box 556
		rightAnimTrackModel3[100].setRotationPoint(-100F, 7F, -50F);

		rightAnimTrackModel3[101].addShapeBox(0F, 0F, 0F, 8, 3, 24, 0F,0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F); // Box 557
		rightAnimTrackModel3[101].setRotationPoint(-116F, 7F, -50F);

		rightAnimTrackModel3[102].addShapeBox(0F, 0F, 0F, 6, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 558
		rightAnimTrackModel3[102].setRotationPoint(-99F, 7F, -33F);

		rightAnimTrackModel3[103].addShapeBox(0F, 0F, 0F, 6, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 559
		rightAnimTrackModel3[103].setRotationPoint(-115F, 7F, -33F);

		rightAnimTrackModel3[104].addShapeBox(0F, 0F, 0F, 5, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F); // Box 560
		rightAnimTrackModel3[104].setRotationPoint(-79F, -43F, -34F);

		rightAnimTrackModel3[105].addShapeBox(0F, 0F, 0F, 7, 7, 4, 0F,-7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 561
		rightAnimTrackModel3[105].setRotationPoint(-79F, -50F, -34F);

		rightAnimTrackModel3[106].addShapeBox(0F, 0F, 0F, 5, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F); // Box 562
		rightAnimTrackModel3[106].setRotationPoint(-82F, -49F, -34F);

		rightAnimTrackModel3[107].addShapeBox(0F, 0F, 0F, 7, 7, 4, 0F,-7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 563
		rightAnimTrackModel3[107].setRotationPoint(-84F, -56F, -34F);

		rightAnimTrackModel3[108].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, 0F, 2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 564
		rightAnimTrackModel3[108].setRotationPoint(-92F, 7F, -40F);

		rightAnimTrackModel3[109].addShapeBox(0F, 0F, 0F, 14, 4, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 565
		rightAnimTrackModel3[109].setRotationPoint(-95F, -39F, -40.5F);

		rightAnimTrackModel3[110].addShapeBox(0F, 0F, 0F, 4, 12, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 566
		rightAnimTrackModel3[110].setRotationPoint(-106F, -20F, -45F);

		rightAnimTrackModel3[111].addShapeBox(0F, 0F, 0F, 6, 9, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Box 567
		rightAnimTrackModel3[111].setRotationPoint(62F, -29F, -38F);

		rightAnimTrackModel3[112].addShapeBox(0F, 0F, 0F, 15, 9, 4, 0F,0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F); // Box 568
		rightAnimTrackModel3[112].setRotationPoint(47F, -29F, -38F);

		rightAnimTrackModel3[113].addShapeBox(0F, 0F, 0F, 6, 6, 4, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F); // Box 569
		rightAnimTrackModel3[113].setRotationPoint(54F, -40F, -38F);

		rightAnimTrackModel3[114].addShapeBox(0F, 0F, 0F, 9, 8, 4, 0F,0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, 13F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 13F, 0F); // Box 570
		rightAnimTrackModel3[114].setRotationPoint(45F, -37F, -38F);

		rightAnimTrackModel3[115].addShapeBox(0F, 0F, 0F, 2, 2, 17, 0F,0F, 0F, 6F, 0F, 0F, 6F, 0F, 4F, 6F, 0F, 4F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, -4F, 6F, 0F, -4F, 6F); // Box 688
		rightAnimTrackModel3[115].setRotationPoint(-1F, -37.5F, -41.5F);
		rightAnimTrackModel3[115].rotateAngleY = 0.57595865F;
	}
	
	private void initrightAnimTrackModel4_0()
	{
		rightAnimTrackModel4[0] = new ModelRendererTurbo(this, 81, 361, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel4[1] = new ModelRendererTurbo(this, 993, 177, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel4[2] = new ModelRendererTurbo(this, 1, 297, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel4[3] = new ModelRendererTurbo(this, 705, 225, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel4[4] = new ModelRendererTurbo(this, 57, 297, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel4[5] = new ModelRendererTurbo(this, 113, 321, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel4[6] = new ModelRendererTurbo(this, 353, 353, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel4[7] = new ModelRendererTurbo(this, 465, 353, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel4[8] = new ModelRendererTurbo(this, 153, 361, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel4[9] = new ModelRendererTurbo(this, 505, 361, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel4[10] = new ModelRendererTurbo(this, 793, 361, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel4[11] = new ModelRendererTurbo(this, 193, 361, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel4[12] = new ModelRendererTurbo(this, 545, 361, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel4[13] = new ModelRendererTurbo(this, 833, 377, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel4[14] = new ModelRendererTurbo(this, 945, 361, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel4[15] = new ModelRendererTurbo(this, 1, 385, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel4[16] = new ModelRendererTurbo(this, 625, 385, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel4[17] = new ModelRendererTurbo(this, 977, 249, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel4[18] = new ModelRendererTurbo(this, 881, 161, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel4[19] = new ModelRendererTurbo(this, 737, 225, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel4[20] = new ModelRendererTurbo(this, 441, 89, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel4[21] = new ModelRendererTurbo(this, 105, 113, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel4[22] = new ModelRendererTurbo(this, 673, 385, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel4[23] = new ModelRendererTurbo(this, 65, 401, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel4[24] = new ModelRendererTurbo(this, 129, 265, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel4[25] = new ModelRendererTurbo(this, 201, 145, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel4[26] = new ModelRendererTurbo(this, 337, 257, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel4[27] = new ModelRendererTurbo(this, 537, 257, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel4[28] = new ModelRendererTurbo(this, 241, 265, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel4[29] = new ModelRendererTurbo(this, 617, 273, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel4[30] = new ModelRendererTurbo(this, 897, 289, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel4[31] = new ModelRendererTurbo(this, 625, 297, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel4[32] = new ModelRendererTurbo(this, 601, 121, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel4[33] = new ModelRendererTurbo(this, 641, 417, textureX, textureY); // Front Right Leg
		rightAnimTrackModel4[34] = new ModelRendererTurbo(this, 697, 417, textureX, textureY); // Front Right Leg
		rightAnimTrackModel4[35] = new ModelRendererTurbo(this, 809, 465, textureX, textureY); // Rear Right Leg
		rightAnimTrackModel4[36] = new ModelRendererTurbo(this, 169, 473, textureX, textureY); // Rear Right Leg
		rightAnimTrackModel4[37] = new ModelRendererTurbo(this, 689, 145, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel4[38] = new ModelRendererTurbo(this, 281, 497, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel4[39] = new ModelRendererTurbo(this, 1, 401, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel4[40] = new ModelRendererTurbo(this, 953, 585, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel4[41] = new ModelRendererTurbo(this, 121, 593, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel4[42] = new ModelRendererTurbo(this, 193, 593, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel4[43] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Mid Right Leg
		rightAnimTrackModel4[44] = new ModelRendererTurbo(this, 1001, 113, textureX, textureY); // Box 463
		rightAnimTrackModel4[45] = new ModelRendererTurbo(this, 153, 113, textureX, textureY); // Box 464
		rightAnimTrackModel4[46] = new ModelRendererTurbo(this, 561, 121, textureX, textureY); // Box 465
		rightAnimTrackModel4[47] = new ModelRendererTurbo(this, 41, 145, textureX, textureY); // Box 466
		rightAnimTrackModel4[48] = new ModelRendererTurbo(this, 257, 361, textureX, textureY); // Box 467
		rightAnimTrackModel4[49] = new ModelRendererTurbo(this, 905, 393, textureX, textureY); // Box 468
		rightAnimTrackModel4[50] = new ModelRendererTurbo(this, 281, 401, textureX, textureY); // Box 469
		rightAnimTrackModel4[51] = new ModelRendererTurbo(this, 345, 401, textureX, textureY); // Box 470
		rightAnimTrackModel4[52] = new ModelRendererTurbo(this, 409, 401, textureX, textureY); // Box 471
		rightAnimTrackModel4[53] = new ModelRendererTurbo(this, 473, 401, textureX, textureY); // Box 472
		rightAnimTrackModel4[54] = new ModelRendererTurbo(this, 745, 393, textureX, textureY); // Box 473
		rightAnimTrackModel4[55] = new ModelRendererTurbo(this, 137, 409, textureX, textureY); // Box 474
		rightAnimTrackModel4[56] = new ModelRendererTurbo(this, 209, 409, textureX, textureY); // Box 475
		rightAnimTrackModel4[57] = new ModelRendererTurbo(this, 513, 409, textureX, textureY); // Box 476
		rightAnimTrackModel4[58] = new ModelRendererTurbo(this, 945, 409, textureX, textureY); // Box 477
		rightAnimTrackModel4[59] = new ModelRendererTurbo(this, 1, 417, textureX, textureY); // Box 478
		rightAnimTrackModel4[60] = new ModelRendererTurbo(this, 561, 409, textureX, textureY); // Box 479
		rightAnimTrackModel4[61] = new ModelRendererTurbo(this, 793, 409, textureX, textureY); // Box 480
		rightAnimTrackModel4[62] = new ModelRendererTurbo(this, 601, 417, textureX, textureY); // Box 481
		rightAnimTrackModel4[63] = new ModelRendererTurbo(this, 185, 409, textureX, textureY); // Box 482
		rightAnimTrackModel4[64] = new ModelRendererTurbo(this, 497, 313, textureX, textureY); // Box 483
		rightAnimTrackModel4[65] = new ModelRendererTurbo(this, 985, 321, textureX, textureY); // Box 484
		rightAnimTrackModel4[66] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 485
		rightAnimTrackModel4[67] = new ModelRendererTurbo(this, 753, 201, textureX, textureY); // Box 486
		rightAnimTrackModel4[68] = new ModelRendererTurbo(this, 1001, 49, textureX, textureY); // Box 487
		rightAnimTrackModel4[69] = new ModelRendererTurbo(this, 57, 241, textureX, textureY); // Box 488
		rightAnimTrackModel4[70] = new ModelRendererTurbo(this, 321, 281, textureX, textureY); // Box 489
		rightAnimTrackModel4[71] = new ModelRendererTurbo(this, 593, 305, textureX, textureY); // Box 490
		rightAnimTrackModel4[72] = new ModelRendererTurbo(this, 809, 305, textureX, textureY); // Box 491
		rightAnimTrackModel4[73] = new ModelRendererTurbo(this, 281, 121, textureX, textureY); // Box 492
		rightAnimTrackModel4[74] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 493
		rightAnimTrackModel4[75] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 494
		rightAnimTrackModel4[76] = new ModelRendererTurbo(this, 993, 57, textureX, textureY); // Box 495
		rightAnimTrackModel4[77] = new ModelRendererTurbo(this, 897, 257, textureX, textureY); // Box 496
		rightAnimTrackModel4[78] = new ModelRendererTurbo(this, 897, 257, textureX, textureY); // Box 497
		rightAnimTrackModel4[79] = new ModelRendererTurbo(this, 993, 57, textureX, textureY); // Box 498
		rightAnimTrackModel4[80] = new ModelRendererTurbo(this, 305, 449, textureX, textureY); // Box 499
		rightAnimTrackModel4[81] = new ModelRendererTurbo(this, 369, 449, textureX, textureY); // Box 500
		rightAnimTrackModel4[82] = new ModelRendererTurbo(this, 857, 449, textureX, textureY); // Box 501
		rightAnimTrackModel4[83] = new ModelRendererTurbo(this, 49, 457, textureX, textureY); // Box 502
		rightAnimTrackModel4[84] = new ModelRendererTurbo(this, 425, 457, textureX, textureY); // Box 503
		rightAnimTrackModel4[85] = new ModelRendererTurbo(this, 545, 457, textureX, textureY); // Box 504
		rightAnimTrackModel4[86] = new ModelRendererTurbo(this, 409, 353, textureX, textureY); // Box 505
		rightAnimTrackModel4[87] = new ModelRendererTurbo(this, 553, 361, textureX, textureY); // Box 506
		rightAnimTrackModel4[88] = new ModelRendererTurbo(this, 705, 433, textureX, textureY); // Box 507
		rightAnimTrackModel4[89] = new ModelRendererTurbo(this, 601, 441, textureX, textureY); // Box 508
		rightAnimTrackModel4[90] = new ModelRendererTurbo(this, 177, 441, textureX, textureY); // Box 509
		rightAnimTrackModel4[91] = new ModelRendererTurbo(this, 977, 441, textureX, textureY); // Box 510
		rightAnimTrackModel4[92] = new ModelRendererTurbo(this, 721, 449, textureX, textureY); // Box 511
		rightAnimTrackModel4[93] = new ModelRendererTurbo(this, 1, 465, textureX, textureY); // Box 512
		rightAnimTrackModel4[94] = new ModelRendererTurbo(this, 249, 465, textureX, textureY); // Box 513
		rightAnimTrackModel4[95] = new ModelRendererTurbo(this, 89, 457, textureX, textureY); // Box 514
		rightAnimTrackModel4[96] = new ModelRendererTurbo(this, 585, 465, textureX, textureY); // Box 515
		rightAnimTrackModel4[97] = new ModelRendererTurbo(this, 841, 361, textureX, textureY); // Box 516
		rightAnimTrackModel4[98] = new ModelRendererTurbo(this, 657, 465, textureX, textureY); // Box 517
		rightAnimTrackModel4[99] = new ModelRendererTurbo(this, 1, 369, textureX, textureY); // Box 518
		rightAnimTrackModel4[100] = new ModelRendererTurbo(this, 657, 89, textureX, textureY); // Box 519
		rightAnimTrackModel4[101] = new ModelRendererTurbo(this, 761, 465, textureX, textureY); // Box 520
		rightAnimTrackModel4[102] = new ModelRendererTurbo(this, 121, 473, textureX, textureY); // Box 521
		rightAnimTrackModel4[103] = new ModelRendererTurbo(this, 353, 377, textureX, textureY); // Box 522
		rightAnimTrackModel4[104] = new ModelRendererTurbo(this, 385, 377, textureX, textureY); // Box 523
		rightAnimTrackModel4[105] = new ModelRendererTurbo(this, 353, 153, textureX, textureY); // Box 524
		rightAnimTrackModel4[106] = new ModelRendererTurbo(this, 1001, 361, textureX, textureY); // Box 525
		rightAnimTrackModel4[107] = new ModelRendererTurbo(this, 233, 241, textureX, textureY); // Box 526
		rightAnimTrackModel4[108] = new ModelRendererTurbo(this, 465, 377, textureX, textureY); // Box 527
		rightAnimTrackModel4[109] = new ModelRendererTurbo(this, 793, 113, textureX, textureY); // Box 528
		rightAnimTrackModel4[110] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 529
		rightAnimTrackModel4[111] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 530
		rightAnimTrackModel4[112] = new ModelRendererTurbo(this, 993, 57, textureX, textureY); // Box 531
		rightAnimTrackModel4[113] = new ModelRendererTurbo(this, 897, 257, textureX, textureY); // Box 532
		rightAnimTrackModel4[114] = new ModelRendererTurbo(this, 897, 257, textureX, textureY); // Box 533
		rightAnimTrackModel4[115] = new ModelRendererTurbo(this, 993, 57, textureX, textureY); // Box 534

		rightAnimTrackModel4[0].addShapeBox(0F, 0F, 0F, 30, 10, 16, 0F,-10F, 0F, -1.5F, -10F, 0F, -1.5F, -10F, 0F, 1.5F, -10F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Mid Right Leg
		rightAnimTrackModel4[0].setRotationPoint(-25F, -82F, -49F);

		rightAnimTrackModel4[1].addShapeBox(0F, 0F, 0F, 11, 12, 4, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Mid Right Leg
		rightAnimTrackModel4[1].setRotationPoint(-24F, -59F, -47F);

		rightAnimTrackModel4[2].addShapeBox(0F, 0F, 0F, 11, 27, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, -5F, 0F, -3F); // Mid Right Leg
		rightAnimTrackModel4[2].setRotationPoint(-24F, -47F, -49F);

		rightAnimTrackModel4[3].addShapeBox(0F, 0F, 0F, 11, 12, 4, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Mid Right Leg
		rightAnimTrackModel4[3].setRotationPoint(-7F, -59F, -47F);

		rightAnimTrackModel4[4].addShapeBox(0F, 0F, 0F, 11, 27, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -5F, 0F, 3F, -5F, 0F, -3F, 0F, 0F, -3F); // Mid Right Leg
		rightAnimTrackModel4[4].setRotationPoint(-7F, -47F, -49F);

		rightAnimTrackModel4[5].addShapeBox(0F, 0F, 0F, 20, 6, 12, 0F,-6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Mid Right Leg
		rightAnimTrackModel4[5].setRotationPoint(-20F, -28F, -56F);

		rightAnimTrackModel4[6].addShapeBox(0F, 0F, 0F, 20, 8, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Mid Right Leg
		rightAnimTrackModel4[6].setRotationPoint(-20F, -22F, -56F);

		rightAnimTrackModel4[7].addShapeBox(0F, 0F, 0F, 20, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Mid Right Leg
		rightAnimTrackModel4[7].setRotationPoint(-20F, -14F, -56F);

		rightAnimTrackModel4[8].addShapeBox(0F, 0F, 0F, 10, 8, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F); // Mid Right Leg
		rightAnimTrackModel4[8].setRotationPoint(-16F, 0F, -64F);

		rightAnimTrackModel4[9].addShapeBox(0F, 0F, 0F, 9, 8, 28, 0F,0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 5F, 0F, -8F, 0F, 0F, 5F, 0F, 0F, 5F, 5F, 0F, -8F); // Mid Right Leg
		rightAnimTrackModel4[9].setRotationPoint(-25F, 0F, -64F);

		rightAnimTrackModel4[10].addShapeBox(0F, 0F, 0F, 9, 8, 28, 0F,0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 5F, 5F, 0F, -8F, 5F, 0F, -8F, 0F, 0F, 5F); // Mid Right Leg
		rightAnimTrackModel4[10].setRotationPoint(-6F, 0F, -64F);

		rightAnimTrackModel4[11].addShapeBox(0F, 0F, 0F, 10, 3, 38, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Mid Right Leg
		rightAnimTrackModel4[11].setRotationPoint(-16F, 8F, -69F);

		rightAnimTrackModel4[12].addShapeBox(0F, 0F, 0F, 14, 3, 38, 0F,0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F); // Mid Right Leg
		rightAnimTrackModel4[12].setRotationPoint(-6F, 8F, -69F);

		rightAnimTrackModel4[13].addShapeBox(0F, 0F, 0F, 14, 3, 38, 0F,0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F); // Mid Right Leg
		rightAnimTrackModel4[13].setRotationPoint(-30F, 8F, -69F);

		rightAnimTrackModel4[14].addShapeBox(0F, 0F, 0F, 10, 3, 28, 0F,0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Mid Right Leg
		rightAnimTrackModel4[14].setRotationPoint(-16F, -3F, -64F);

		rightAnimTrackModel4[15].addShapeBox(0F, 0F, 0F, 9, 3, 28, 0F,0F, 0F, -8F, -5F, 0F, -12F, -5F, 0F, -12F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F); // Mid Right Leg
		rightAnimTrackModel4[15].setRotationPoint(-6F, -3F, -64F);

		rightAnimTrackModel4[16].addShapeBox(0F, 0F, 0F, 9, 3, 28, 0F,-5F, 0F, -12F, 0F, 0F, -8F, 0F, 0F, -8F, -5F, 0F, -12F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F); // Mid Right Leg
		rightAnimTrackModel4[16].setRotationPoint(-25F, -3F, -64F);

		rightAnimTrackModel4[17].addShapeBox(0F, 0F, 0F, 10, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Mid Right Leg
		rightAnimTrackModel4[17].setRotationPoint(-16F, -6F, -56F);

		rightAnimTrackModel4[18].addShapeBox(0F, 0F, 0F, 4, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Mid Right Leg
		rightAnimTrackModel4[18].setRotationPoint(-6F, -6F, -56F);

		rightAnimTrackModel4[19].addShapeBox(0F, 0F, 0F, 4, 3, 12, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Mid Right Leg
		rightAnimTrackModel4[19].setRotationPoint(-20F, -6F, -56F);

		rightAnimTrackModel4[20].addShapeBox(0F, 0F, 0F, 4, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Mid Right Leg
		rightAnimTrackModel4[20].setRotationPoint(-19F, -14F, -52F);

		rightAnimTrackModel4[21].addShapeBox(0F, 0F, 0F, 4, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Mid Right Leg
		rightAnimTrackModel4[21].setRotationPoint(-7F, -14F, -52F);

		rightAnimTrackModel4[22].addShapeBox(0F, 0F, 0F, 30, 10, 16, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Mid Right Leg
		rightAnimTrackModel4[22].setRotationPoint(-25F, -72F, -50.5F);

		rightAnimTrackModel4[23].addShapeBox(0F, 0F, 0F, 30, 10, 16, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F); // Mid Right Leg
		rightAnimTrackModel4[23].setRotationPoint(-25F, -62F, -52F);

		rightAnimTrackModel4[24].addShapeBox(0F, 0F, 0F, 22, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Mid Right Leg
		rightAnimTrackModel4[24].setRotationPoint(-21F, -22F, -44.5F);

		rightAnimTrackModel4[25].addShapeBox(0F, 0F, 0F, 8, 2, 7, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Mid Right Leg
		rightAnimTrackModel4[25].setRotationPoint(-14F, -24F, -44.5F);

		rightAnimTrackModel4[26].addShapeBox(0F, 0F, 0F, 8, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Mid Right Leg
		rightAnimTrackModel4[26].setRotationPoint(-14F, -18F, -44.5F);

		rightAnimTrackModel4[27].addShapeBox(0F, 0F, 0F, 8, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Mid Right Leg
		rightAnimTrackModel4[27].setRotationPoint(-14F, -22F, -44.5F);

		rightAnimTrackModel4[28].addShapeBox(0F, 0F, 0F, 8, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Mid Right Leg
		rightAnimTrackModel4[28].setRotationPoint(-27F, 8F, -42F);

		rightAnimTrackModel4[29].addShapeBox(0F, 0F, 0F, 8, 3, 8, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Mid Right Leg
		rightAnimTrackModel4[29].setRotationPoint(-27F, 8F, -66F);

		rightAnimTrackModel4[30].addShapeBox(0F, 0F, 0F, 8, 3, 8, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Mid Right Leg
		rightAnimTrackModel4[30].setRotationPoint(-3F, 8F, -66F);

		rightAnimTrackModel4[31].addShapeBox(0F, 0F, 0F, 8, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Mid Right Leg
		rightAnimTrackModel4[31].setRotationPoint(-3F, 8F, -42F);

		rightAnimTrackModel4[32].addShapeBox(0F, 0F, 0F, 4, 3, 8, 0F,0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F); // Mid Right Leg
		rightAnimTrackModel4[32].setRotationPoint(-34F, 8F, -54F);

		rightAnimTrackModel4[33].addShapeBox(0F, 0F, 0F, 18, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Front Right Leg
		rightAnimTrackModel4[33].setRotationPoint(77F, -53F, -36F);

		rightAnimTrackModel4[34].addShapeBox(0F, 0F, 0F, 18, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Front Right Leg
		rightAnimTrackModel4[34].setRotationPoint(77F, -59F, -36F);

		rightAnimTrackModel4[35].addShapeBox(0F, 0F, 0F, 18, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Rear Right Leg
		rightAnimTrackModel4[35].setRotationPoint(-76F, -53F, -36F);

		rightAnimTrackModel4[36].addShapeBox(0F, 0F, 0F, 18, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear Right Leg
		rightAnimTrackModel4[36].setRotationPoint(-76F, -59F, -36F);

		rightAnimTrackModel4[37].addShapeBox(0F, 0F, 0F, 16, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Mid Right Leg
		rightAnimTrackModel4[37].setRotationPoint(-18F, -36F, -46.5F);

		rightAnimTrackModel4[38].addShapeBox(0F, 3F, -17F, 2, 2, 17, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 4F, 1F, 0F, 4F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -4F, 1F, 0F, -4F, 1F); // Mid Right Leg
		rightAnimTrackModel4[38].setRotationPoint(-11F, -39.5F, -26.5F);
		rightAnimTrackModel4[38].rotateAngleX = 0.05235988F;

		rightAnimTrackModel4[39].addShapeBox(0F, 0F, 0F, 4, 3, 8, 0F,0F, 0F, 2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Mid Right Leg
		rightAnimTrackModel4[39].setRotationPoint(8F, 8F, -54F);

		rightAnimTrackModel4[40].addShapeBox(0F, 0F, 0F, 30, 10, 4, 0F,-2F, 0F, -1.5F, -2F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, -12F, -2F, 0F, -12F, -2F, 0F, -10F, 0F, 0F, -10F, 0F, 0F); // Mid Right Leg
		rightAnimTrackModel4[40].setRotationPoint(-25F, -62F, -56F);

		rightAnimTrackModel4[41].addShapeBox(0F, 0F, 0F, 30, 10, 4, 0F,-2F, 0F, -1.5F, -2F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Mid Right Leg
		rightAnimTrackModel4[41].setRotationPoint(-25F, -72F, -54.5F);

		rightAnimTrackModel4[42].addShapeBox(0F, 0F, 0F, 30, 10, 4, 0F,-12F, -2F, -1.5F, -12F, -2F, -1.5F, -10F, 0F, 1.5F, -10F, 0F, 1.5F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Mid Right Leg
		rightAnimTrackModel4[42].setRotationPoint(-25F, -82F, -53F);

		rightAnimTrackModel4[43].addShapeBox(0F, 0F, 0F, 6, 22, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F); // Mid Right Leg
		rightAnimTrackModel4[43].setRotationPoint(-13F, -78F, -53.5F);

		rightAnimTrackModel4[44].addShapeBox(0F, 0F, 0F, 7, 7, 4, 0F,-7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 463
		rightAnimTrackModel4[44].setRotationPoint(70F, -58F, -34F);
		rightAnimTrackModel4[44].rotateAngleZ = -0.29670597F;

		rightAnimTrackModel4[45].addShapeBox(0F, 7F, 0F, 5, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F); // Box 464
		rightAnimTrackModel4[45].setRotationPoint(72F, -58F, -34F);
		rightAnimTrackModel4[45].rotateAngleZ = -0.29670597F;

		rightAnimTrackModel4[46].addShapeBox(0F, 7F, 0F, 5, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F); // Box 465
		rightAnimTrackModel4[46].setRotationPoint(75F, -52F, -34F);
		rightAnimTrackModel4[46].rotateAngleZ = -0.29670597F;

		rightAnimTrackModel4[47].addShapeBox(0F, 0F, 0F, 7, 7, 4, 0F,-7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 466
		rightAnimTrackModel4[47].setRotationPoint(75F, -52F, -34F);
		rightAnimTrackModel4[47].rotateAngleZ = -0.29670597F;

		rightAnimTrackModel4[48].addShapeBox(0F, 0F, 0F, 18, 6, 12, 0F,-6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 467
		rightAnimTrackModel4[48].setRotationPoint(56F, -53F, -40F);

		rightAnimTrackModel4[49].addShapeBox(0F, 0F, 0F, 18, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 468
		rightAnimTrackModel4[49].setRotationPoint(56F, -47F, -40F);

		rightAnimTrackModel4[50].addShapeBox(0F, 0F, 0F, 18, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Box 469
		rightAnimTrackModel4[50].setRotationPoint(56F, -41F, -40F);

		rightAnimTrackModel4[51].addShapeBox(0F, 0F, 0F, 16, 5, 12, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 470
		rightAnimTrackModel4[51].setRotationPoint(58F, -22F, -44F);

		rightAnimTrackModel4[52].addShapeBox(0F, 0F, 0F, 16, 5, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 471
		rightAnimTrackModel4[52].setRotationPoint(58F, -11F, -44F);

		rightAnimTrackModel4[53].addShapeBox(0F, 0F, 0F, 16, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 472
		rightAnimTrackModel4[53].setRotationPoint(58F, -17F, -44F);

		rightAnimTrackModel4[54].addShapeBox(0F, 0F, 0F, 8, 5, 24, 0F,-2F, 0F, -10F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, -10F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F); // Box 473
		rightAnimTrackModel4[54].setRotationPoint(54F, 2F, -50F);

		rightAnimTrackModel4[55].addShapeBox(0F, 0F, 0F, 8, 5, 24, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 474
		rightAnimTrackModel4[55].setRotationPoint(62F, 2F, -50F);

		rightAnimTrackModel4[56].addShapeBox(0F, 0F, 0F, 8, 5, 24, 0F,0F, 0F, -2F, -2F, 0F, -10F, -2F, 0F, -10F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F); // Box 475
		rightAnimTrackModel4[56].setRotationPoint(70F, 2F, -50F);

		rightAnimTrackModel4[57].addShapeBox(0F, 0F, 0F, 8, 3, 24, 0F,0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F); // Box 476
		rightAnimTrackModel4[57].setRotationPoint(54F, 7F, -50F);

		rightAnimTrackModel4[58].addShapeBox(0F, 0F, 0F, 8, 3, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 477
		rightAnimTrackModel4[58].setRotationPoint(62F, 7F, -50F);

		rightAnimTrackModel4[59].addShapeBox(0F, 0F, 0F, 8, 3, 24, 0F,0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F); // Box 478
		rightAnimTrackModel4[59].setRotationPoint(70F, 7F, -50F);

		rightAnimTrackModel4[60].addShapeBox(0F, 0F, 0F, 6, 3, 20, 0F,0F, 0F, -3F, -3F, 0F, -8F, -3F, 0F, -8F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F); // Box 479
		rightAnimTrackModel4[60].setRotationPoint(70F, -1F, -48F);

		rightAnimTrackModel4[61].addShapeBox(0F, 0F, 0F, 8, 3, 20, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 480
		rightAnimTrackModel4[61].setRotationPoint(62F, -1F, -48F);

		rightAnimTrackModel4[62].addShapeBox(0F, 0F, 0F, 6, 3, 20, 0F,-3F, 0F, -8F, 0F, 0F, -3F, 0F, 0F, -3F, -3F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F); // Box 481
		rightAnimTrackModel4[62].setRotationPoint(56F, -1F, -48F);

		rightAnimTrackModel4[63].addShapeBox(0F, 0F, 0F, 8, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 482
		rightAnimTrackModel4[63].setRotationPoint(62F, -4F, -45F);

		rightAnimTrackModel4[64].addShapeBox(0F, 0F, 0F, 3, 3, 14, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 483
		rightAnimTrackModel4[64].setRotationPoint(59F, -4F, -45F);

		rightAnimTrackModel4[65].addShapeBox(0F, 0F, 0F, 3, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 484
		rightAnimTrackModel4[65].setRotationPoint(70F, -4F, -45F);

		rightAnimTrackModel4[66].addShapeBox(0F, 0F, 0F, 4, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 485
		rightAnimTrackModel4[66].setRotationPoint(61F, -8F, -41F);

		rightAnimTrackModel4[67].addShapeBox(0F, 0F, 0F, 4, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 486
		rightAnimTrackModel4[67].setRotationPoint(67F, -8F, -41F);

		rightAnimTrackModel4[68].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 487
		rightAnimTrackModel4[68].setRotationPoint(50F, 7F, -40F);

		rightAnimTrackModel4[69].addShapeBox(0F, 0F, 0F, 6, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 488
		rightAnimTrackModel4[69].setRotationPoint(55F, 7F, -33F);

		rightAnimTrackModel4[70].addShapeBox(0F, 0F, 0F, 6, 3, 6, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 489
		rightAnimTrackModel4[70].setRotationPoint(55F, 7F, -49F);

		rightAnimTrackModel4[71].addShapeBox(0F, 0F, 0F, 6, 3, 6, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 490
		rightAnimTrackModel4[71].setRotationPoint(71F, 7F, -49F);

		rightAnimTrackModel4[72].addShapeBox(0F, 0F, 0F, 6, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 491
		rightAnimTrackModel4[72].setRotationPoint(71F, 7F, -33F);

		rightAnimTrackModel4[73].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, 0F, 2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 492
		rightAnimTrackModel4[73].setRotationPoint(78F, 7F, -40F);

		rightAnimTrackModel4[74].addShapeBox(0F, 0F, 0F, 14, 4, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 493
		rightAnimTrackModel4[74].setRotationPoint(58F, -46F, -40.5F);

		rightAnimTrackModel4[75].addShapeBox(0F, 0F, 0F, 4, 12, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 494
		rightAnimTrackModel4[75].setRotationPoint(64F, -20F, -45F);

		rightAnimTrackModel4[76].addShapeBox(0F, 0F, 0F, 11, 12, 4, 0F,-5F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -5F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F); // Box 495
		rightAnimTrackModel4[76].setRotationPoint(55F, -44F, -38F);

		rightAnimTrackModel4[77].addShapeBox(0F, 0F, 0F, 11, 27, 4, 0F,-2F, -4F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, -7F, -4F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, -7F, -4F, 0F); // Box 496
		rightAnimTrackModel4[77].setRotationPoint(55F, -37F, -38F);

		rightAnimTrackModel4[78].addShapeBox(0F, 0F, 0F, 11, 27, 4, 0F,-2F, -4F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, -7F, -4F, 0F, -7F, -4F, 0F, -2F, -4F, 0F); // Box 497
		rightAnimTrackModel4[78].setRotationPoint(66F, -37F, -38F);

		rightAnimTrackModel4[79].addShapeBox(0F, 0F, 0F, 11, 12, 4, 0F,-2F, -1F, 0F, -5F, -1F, 0F, -5F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F); // Box 498
		rightAnimTrackModel4[79].setRotationPoint(66F, -44F, -38F);

		rightAnimTrackModel4[80].addShapeBox(0F, 0F, 0F, 18, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Box 499
		rightAnimTrackModel4[80].setRotationPoint(-97F, -44F, -40F);

		rightAnimTrackModel4[81].addShapeBox(0F, 0F, 0F, 18, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 500
		rightAnimTrackModel4[81].setRotationPoint(-97F, -50F, -40F);

		rightAnimTrackModel4[82].addShapeBox(0F, 0F, 0F, 18, 6, 12, 0F,-6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 501
		rightAnimTrackModel4[82].setRotationPoint(-97F, -56F, -40F);

		rightAnimTrackModel4[83].addShapeBox(0F, 0F, 0F, 16, 5, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 502
		rightAnimTrackModel4[83].setRotationPoint(-96F, -11F, -44F);

		rightAnimTrackModel4[84].addShapeBox(0F, 0F, 0F, 16, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 503
		rightAnimTrackModel4[84].setRotationPoint(-96F, -17F, -44F);

		rightAnimTrackModel4[85].addShapeBox(0F, 0F, 0F, 16, 5, 12, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 504
		rightAnimTrackModel4[85].setRotationPoint(-96F, -22F, -44F);

		rightAnimTrackModel4[86].addShapeBox(0F, 0F, 0F, 4, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 505
		rightAnimTrackModel4[86].setRotationPoint(-87F, -8F, -41F);

		rightAnimTrackModel4[87].addShapeBox(0F, 0F, 0F, 4, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 506
		rightAnimTrackModel4[87].setRotationPoint(-93F, -8F, -41F);

		rightAnimTrackModel4[88].addShapeBox(0F, 0F, 0F, 3, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 507
		rightAnimTrackModel4[88].setRotationPoint(-84F, -4F, -45F);

		rightAnimTrackModel4[89].addShapeBox(0F, 0F, 0F, 6, 3, 20, 0F,-3F, 0F, -8F, 0F, 0F, -3F, 0F, 0F, -3F, -3F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F); // Box 508
		rightAnimTrackModel4[89].setRotationPoint(-98F, -1F, -48F);

		rightAnimTrackModel4[90].addShapeBox(0F, 0F, 0F, 3, 3, 14, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 509
		rightAnimTrackModel4[90].setRotationPoint(-95F, -4F, -45F);

		rightAnimTrackModel4[91].addShapeBox(0F, 0F, 0F, 8, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 510
		rightAnimTrackModel4[91].setRotationPoint(-92F, -4F, -45F);

		rightAnimTrackModel4[92].addShapeBox(0F, 0F, 0F, 8, 3, 20, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 511
		rightAnimTrackModel4[92].setRotationPoint(-92F, -1F, -48F);

		rightAnimTrackModel4[93].addShapeBox(0F, 0F, 0F, 8, 5, 24, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 512
		rightAnimTrackModel4[93].setRotationPoint(-92F, 2F, -50F);

		rightAnimTrackModel4[94].addShapeBox(0F, 0F, 0F, 8, 5, 24, 0F,-2F, 0F, -10F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, -10F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F); // Box 513
		rightAnimTrackModel4[94].setRotationPoint(-100F, 2F, -50F);

		rightAnimTrackModel4[95].addShapeBox(0F, 0F, 0F, 6, 3, 20, 0F,0F, 0F, -3F, -3F, 0F, -8F, -3F, 0F, -8F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F); // Box 514
		rightAnimTrackModel4[95].setRotationPoint(-84F, -1F, -48F);

		rightAnimTrackModel4[96].addShapeBox(0F, 0F, 0F, 8, 5, 24, 0F,0F, 0F, -2F, -2F, 0F, -10F, -2F, 0F, -10F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F); // Box 515
		rightAnimTrackModel4[96].setRotationPoint(-84F, 2F, -50F);

		rightAnimTrackModel4[97].addShapeBox(0F, 0F, 0F, 6, 3, 6, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 516
		rightAnimTrackModel4[97].setRotationPoint(-99F, 7F, -49F);

		rightAnimTrackModel4[98].addShapeBox(0F, 0F, 0F, 8, 3, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 517
		rightAnimTrackModel4[98].setRotationPoint(-92F, 7F, -50F);

		rightAnimTrackModel4[99].addShapeBox(0F, 0F, 0F, 6, 3, 6, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 518
		rightAnimTrackModel4[99].setRotationPoint(-83F, 7F, -49F);

		rightAnimTrackModel4[100].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 519
		rightAnimTrackModel4[100].setRotationPoint(-104F, 7F, -40F);

		rightAnimTrackModel4[101].addShapeBox(0F, 0F, 0F, 8, 3, 24, 0F,0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F); // Box 520
		rightAnimTrackModel4[101].setRotationPoint(-84F, 7F, -50F);

		rightAnimTrackModel4[102].addShapeBox(0F, 0F, 0F, 8, 3, 24, 0F,0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F); // Box 521
		rightAnimTrackModel4[102].setRotationPoint(-100F, 7F, -50F);

		rightAnimTrackModel4[103].addShapeBox(0F, 0F, 0F, 6, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 522
		rightAnimTrackModel4[103].setRotationPoint(-83F, 7F, -33F);

		rightAnimTrackModel4[104].addShapeBox(0F, 0F, 0F, 6, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 523
		rightAnimTrackModel4[104].setRotationPoint(-99F, 7F, -33F);

		rightAnimTrackModel4[105].addShapeBox(-6F, 5F, 0F, 5, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F); // Box 524
		rightAnimTrackModel4[105].setRotationPoint(-73F, -50F, -34F);
		rightAnimTrackModel4[105].rotateAngleZ = -0.2443461F;

		rightAnimTrackModel4[106].addShapeBox(0F, -2F, 0F, 7, 7, 4, 0F,-7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 525
		rightAnimTrackModel4[106].setRotationPoint(-79F, -50F, -34F);
		rightAnimTrackModel4[106].rotateAngleZ = -0.2443461F;

		rightAnimTrackModel4[107].addShapeBox(-6F, 5F, 0F, 5, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F); // Box 526
		rightAnimTrackModel4[107].setRotationPoint(-76F, -56F, -34F);
		rightAnimTrackModel4[107].rotateAngleZ = -0.2443461F;

		rightAnimTrackModel4[108].addShapeBox(0F, -2F, 0F, 7, 7, 4, 0F,-7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 527
		rightAnimTrackModel4[108].setRotationPoint(-84F, -56F, -34F);
		rightAnimTrackModel4[108].rotateAngleZ = -0.2443461F;

		rightAnimTrackModel4[109].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, 0F, 2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 528
		rightAnimTrackModel4[109].setRotationPoint(-76F, 7F, -40F);

		rightAnimTrackModel4[110].addShapeBox(0F, 0F, 0F, 14, 4, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 529
		rightAnimTrackModel4[110].setRotationPoint(-95F, -49F, -40.5F);

		rightAnimTrackModel4[111].addShapeBox(0F, 0F, 0F, 4, 12, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 530
		rightAnimTrackModel4[111].setRotationPoint(-90F, -20F, -45F);

		rightAnimTrackModel4[112].addShapeBox(0F, 0F, 0F, 11, 12, 4, 0F,-5F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -5F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F); // Box 531
		rightAnimTrackModel4[112].setRotationPoint(-99F, -48F, -38F);

		rightAnimTrackModel4[113].addShapeBox(0F, 0F, 0F, 11, 27, 4, 0F,-2F, -4F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, -7F, -4F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, -7F, -4F, 0F); // Box 532
		rightAnimTrackModel4[113].setRotationPoint(-99F, -41F, -38F);

		rightAnimTrackModel4[114].addShapeBox(0F, 0F, 0F, 11, 27, 4, 0F,-2F, -4F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, -7F, -4F, 0F, -7F, -4F, 0F, -2F, -4F, 0F); // Box 533
		rightAnimTrackModel4[114].setRotationPoint(-88F, -41F, -38F);

		rightAnimTrackModel4[115].addShapeBox(0F, 0F, 0F, 11, 12, 4, 0F,-2F, -1F, 0F, -5F, -1F, 0F, -5F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F); // Box 534
		rightAnimTrackModel4[115].setRotationPoint(-88F, -48F, -38F);
	}
	
	

	private void initGuns() {
	}
	{

		// Passenger 3
		ModelRendererTurbo[][] gun_2_Model = new ModelRendererTurbo[3][];

		gun_2_Model[0] = new ModelRendererTurbo[0];

		gun_2_Model[1] = new ModelRendererTurbo[7];
		gun_2_Model[1][0] = new ModelRendererTurbo(this, 937, 1, textureX, textureY); // Box 25
		gun_2_Model[1][1] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 26
		gun_2_Model[1][2] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 27
		gun_2_Model[1][3] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 28
		gun_2_Model[1][4] = new ModelRendererTurbo(this, 633, 25, textureX, textureY); // Box 29
		gun_2_Model[1][5] = new ModelRendererTurbo(this, 513, 1, textureX, textureY); // Box 30
		gun_2_Model[1][6] = new ModelRendererTurbo(this, 937, 1, textureX, textureY); // Box 31

		gun_2_Model[1][0].addShapeBox(-7F, -7F, -7F, 14, 4, 14, 0F,-4F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25

		gun_2_Model[1][1].addShapeBox(-7F, -3F, -7F, 14, 6, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26

		gun_2_Model[1][2].addShapeBox(-7F, 3F, -7F, 14, 4, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, -4F); // Box 27

		gun_2_Model[1][3].addShapeBox(7F, -2F, -2F, 5, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28

		gun_2_Model[1][4].addShapeBox(12F, -1F, -1F, 30, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29

		gun_2_Model[1][5].addShapeBox(20F, -1.5F, -1.5F, 10, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30

		gun_2_Model[1][6].addShapeBox(15F, -1.5F, -1.5F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[1])
		{
			gunPart.setRotationPoint(-103F, -75F, 13F);
		}


		gun_2_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun2", gun_2_Model);

		// Passenger 4
		ModelRendererTurbo[][] gun_3_Model = new ModelRendererTurbo[3][];

		gun_3_Model[0] = new ModelRendererTurbo[0];

		gun_3_Model[1] = new ModelRendererTurbo[7];
		gun_3_Model[1][0] = new ModelRendererTurbo(this, 937, 1, textureX, textureY); // Box 25
		gun_3_Model[1][1] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 26
		gun_3_Model[1][2] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 27
		gun_3_Model[1][3] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 28
		gun_3_Model[1][4] = new ModelRendererTurbo(this, 633, 25, textureX, textureY); // Box 29
		gun_3_Model[1][5] = new ModelRendererTurbo(this, 513, 1, textureX, textureY); // Box 30
		gun_3_Model[1][6] = new ModelRendererTurbo(this, 937, 1, textureX, textureY); // Box 31

		gun_3_Model[1][0].addShapeBox(-7F, -7F, -7F, 14, 4, 14, 0F,-4F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25

		gun_3_Model[1][1].addShapeBox(-7F, -3F, -7F, 14, 6, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26

		gun_3_Model[1][2].addShapeBox(-7F, 3F, -7F, 14, 4, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, -4F); // Box 27

		gun_3_Model[1][3].addShapeBox(7F, -2F, -2F, 5, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28

		gun_3_Model[1][4].addShapeBox(12F, -1F, -1F, 30, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29

		gun_3_Model[1][5].addShapeBox(20F, -1.5F, -1.5F, 10, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30

		gun_3_Model[1][6].addShapeBox(15F, -1.5F, -1.5F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_3_Model[1])
		{
			gunPart.setRotationPoint(-103F, -75F, -13F);
		}


		gun_3_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun3", gun_3_Model);

		// Passenger 5
		ModelRendererTurbo[][] gun_4_Model = new ModelRendererTurbo[3][];

		gun_4_Model[0] = new ModelRendererTurbo[1];
		gun_4_Model[0][0] = new ModelRendererTurbo(this, 201, 129, textureX, textureY); // Gun

		gun_4_Model[0][0].addShapeBox(-5F, 2F, -5F, 10, 1, 10, 0F,0F, 8F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 8F, 0F); // Gun

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_4_Model[0])
		{
			gunPart.setRotationPoint(46F, -102F, 0F);
		}


		gun_4_Model[1] = new ModelRendererTurbo[9];
		gun_4_Model[1][0] = new ModelRendererTurbo(this, 449, 241, textureX, textureY); // Gun
		gun_4_Model[1][1] = new ModelRendererTurbo(this, 81, 249, textureX, textureY); // Gun
		gun_4_Model[1][2] = new ModelRendererTurbo(this, 721, 249, textureX, textureY); // Gun
		gun_4_Model[1][3] = new ModelRendererTurbo(this, 105, 145, textureX, textureY); // Gun
		gun_4_Model[1][4] = new ModelRendererTurbo(this, 281, 145, textureX, textureY); // Gun
		gun_4_Model[1][5] = new ModelRendererTurbo(this, 105, 161, textureX, textureY); // Gun
		gun_4_Model[1][6] = new ModelRendererTurbo(this, 753, 17, textureX, textureY); // Gun
		gun_4_Model[1][7] = new ModelRendererTurbo(this, 697, 49, textureX, textureY); // Gun
		gun_4_Model[1][8] = new ModelRendererTurbo(this, 713, 49, textureX, textureY); // Gun

		gun_4_Model[1][0].addShapeBox(47F, -5F, -3F, 54, 2, 6, 0F,0F, 0F, -2F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Gun

		gun_4_Model[1][1].addShapeBox(47F, -3F, -3F, 54, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Gun

		gun_4_Model[1][2].addShapeBox(47F, -1F, -3F, 54, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, -2F); // Gun

		gun_4_Model[1][3].addShapeBox(103F, -5F, -3F, 20, 2, 6, 0F,0F, 0F, -2F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Gun

		gun_4_Model[1][4].addShapeBox(103F, -3F, -3F, 20, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Gun

		gun_4_Model[1][5].addShapeBox(103F, -1F, -3F, 20, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, -2F); // Gun

		gun_4_Model[1][6].addShapeBox(101F, -4.5F, -2.5F, 2, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun

		gun_4_Model[1][7].addShapeBox(101F, -0.5F, -2.5F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Gun

		gun_4_Model[1][8].addShapeBox(101F, -3.5F, -2.5F, 2, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_4_Model[1])
		{
			gunPart.setRotationPoint(46F, -102F, 0F);
		}


		gun_4_Model[2] = new ModelRendererTurbo[32];
		gun_4_Model[2][0] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Gun
		gun_4_Model[2][1] = new ModelRendererTurbo(this, 617, 89, textureX, textureY); // Gun
		gun_4_Model[2][2] = new ModelRendererTurbo(this, 665, 89, textureX, textureY); // Gun
		gun_4_Model[2][3] = new ModelRendererTurbo(this, 705, 89, textureX, textureY); // Gun
		gun_4_Model[2][4] = new ModelRendererTurbo(this, 753, 113, textureX, textureY); // Gun
		gun_4_Model[2][5] = new ModelRendererTurbo(this, 553, 57, textureX, textureY); // Gun
		gun_4_Model[2][6] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Gun
		gun_4_Model[2][7] = new ModelRendererTurbo(this, 953, 225, textureX, textureY); // Gun
		gun_4_Model[2][8] = new ModelRendererTurbo(this, 561, 241, textureX, textureY); // Gun
		gun_4_Model[2][9] = new ModelRendererTurbo(this, 193, 249, textureX, textureY); // Gun
		gun_4_Model[2][10] = new ModelRendererTurbo(this, 601, 249, textureX, textureY); // Gun
		gun_4_Model[2][11] = new ModelRendererTurbo(this, 825, 249, textureX, textureY); // Gun
		gun_4_Model[2][12] = new ModelRendererTurbo(this, 449, 217, textureX, textureY); // Gun
		gun_4_Model[2][13] = new ModelRendererTurbo(this, 929, 249, textureX, textureY); // Gun
		gun_4_Model[2][14] = new ModelRendererTurbo(this, 233, 233, textureX, textureY); // Gun
		gun_4_Model[2][15] = new ModelRendererTurbo(this, 257, 257, textureX, textureY); // Gun
		gun_4_Model[2][16] = new ModelRendererTurbo(this, 449, 201, textureX, textureY); // Gun
		gun_4_Model[2][17] = new ModelRendererTurbo(this, 465, 257, textureX, textureY); // Gun
		gun_4_Model[2][18] = new ModelRendererTurbo(this, 321, 145, textureX, textureY); // Gun
		gun_4_Model[2][19] = new ModelRendererTurbo(this, 689, 105, textureX, textureY); // Gun
		gun_4_Model[2][20] = new ModelRendererTurbo(this, 1, 265, textureX, textureY); // Gun
		gun_4_Model[2][21] = new ModelRendererTurbo(this, 361, 265, textureX, textureY); // Gun
		gun_4_Model[2][22] = new ModelRendererTurbo(this, 201, 113, textureX, textureY); // Gun
		gun_4_Model[2][23] = new ModelRendererTurbo(this, 273, 561, textureX, textureY); // Gun
		gun_4_Model[2][24] = new ModelRendererTurbo(this, 697, 529, textureX, textureY); // Gun
		gun_4_Model[2][25] = new ModelRendererTurbo(this, 785, 561, textureX, textureY); // Gun
		gun_4_Model[2][26] = new ModelRendererTurbo(this, 761, 577, textureX, textureY); // Gun
		gun_4_Model[2][27] = new ModelRendererTurbo(this, 89, 297, textureX, textureY); // Gun
		gun_4_Model[2][28] = new ModelRendererTurbo(this, 657, 585, textureX, textureY); // Gun
		gun_4_Model[2][29] = new ModelRendererTurbo(this, 145, 401, textureX, textureY); // Gun
		gun_4_Model[2][30] = new ModelRendererTurbo(this, 1001, 169, textureX, textureY); // Gun
		gun_4_Model[2][31] = new ModelRendererTurbo(this, 937, 9, textureX, textureY); // Gun

		gun_4_Model[2][0].addShapeBox(39F, -4F, -5F, 8, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun

		gun_4_Model[2][1].addShapeBox(26F, -2F, -5F, 13, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun

		gun_4_Model[2][2].addShapeBox(39F, -7F, -5F, 8, 3, 10, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun

		gun_4_Model[2][3].addShapeBox(39F, 0F, -5F, 8, 3, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, -3F); // Gun

		gun_4_Model[2][4].addShapeBox(26F, 0F, -5F, 13, 3, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 1F, -3F); // Gun

		gun_4_Model[2][5].addShapeBox(26F, -4F, -3F, 13, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun

		gun_4_Model[2][6].addShapeBox(26F, -6F, -3F, 13, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun

		gun_4_Model[2][7].addShapeBox(-1F, -8F, -4F, 27, 11, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Gun

		gun_4_Model[2][8].addShapeBox(13F, -5F, -8F, 10, 4, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun

		gun_4_Model[2][9].addShapeBox(13F, -8F, -8F, 10, 3, 16, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun

		gun_4_Model[2][10].addShapeBox(13F, -1F, -8F, 10, 3, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Gun

		gun_4_Model[2][11].addShapeBox(-1F, -7F, -9F, 12, 8, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun

		gun_4_Model[2][12].addShapeBox(-1F, -8F, -10F, 13, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun

		gun_4_Model[2][13].addShapeBox(-1F, 1F, -10F, 13, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun

		gun_4_Model[2][14].addShapeBox(-1F, -7F, -10F, 1, 8, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun

		gun_4_Model[2][15].addShapeBox(-29F, -7F, -10F, 28, 2, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun

		gun_4_Model[2][16].addShapeBox(-29F, -7F, 8F, 28, 10, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -2F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, -5F, -2F, 3F); // Gun

		gun_4_Model[2][17].addShapeBox(-29F, -7F, -10F, 28, 10, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -2F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, -5F, -2F, -3F); // Gun

		gun_4_Model[2][18].addShapeBox(-32F, -7F, -10F, 3, 2, 20, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Gun

		gun_4_Model[2][19].addShapeBox(-35F, -7F, -8F, 3, 2, 16, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Gun

		gun_4_Model[2][20].addShapeBox(-23F, -12F, -10F, 50, 5, 20, 0F,-7F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, -7F, 0F, -3F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Gun

		gun_4_Model[2][21].addShapeBox(-16F, -18F, -7F, 43, 6, 14, 0F,-17F, 0F, -4F, -14F, 0F, -4F, -14F, 0F, -4F, -17F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun

		gun_4_Model[2][22].addShapeBox(1F, -23F, -3F, 12, 5, 6, 0F,-14F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, -3F, -14F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun

		gun_4_Model[2][23].addShapeBox(-23F, -15F, -4.5F, 16, 6, 9, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun

		gun_4_Model[2][24].addShapeBox(-32F, -13F, -7F, 2, 6, 14, 0F,3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun

		gun_4_Model[2][25].addShapeBox(-35F, -17F, -7F, 2, 4, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun

		gun_4_Model[2][26].addShapeBox(-35F, -19F, -7F, 2, 2, 14, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun

		gun_4_Model[2][27].addShapeBox(15F, -10.5F, -2.5F, 19, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Gun

		gun_4_Model[2][28].addShapeBox(15F, -13.5F, -2.5F, 19, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun

		gun_4_Model[2][29].addShapeBox(15F, -14.5F, -2.5F, 19, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun

		gun_4_Model[2][30].addShapeBox(34F, -13.5F, -1.5F, 7, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun

		gun_4_Model[2][31].addShapeBox(41F, -13F, -1F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_4_Model[2])
		{
			gunPart.setRotationPoint(46F, -102F, 0F);
		}


		registerGunModel("PassengerGun4", gun_4_Model);
	}
}