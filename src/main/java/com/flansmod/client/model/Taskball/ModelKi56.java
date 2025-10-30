//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Ki56
// Model Creator: TaskForce51
// Created on: 20.04.2023 - 00:48:07
// Last changed on: 20.04.2023 - 00:48:07

package com.flansmod.client.model.Taskball; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelKi56 extends ModelPlane //Same as Filename
{
	int textureX = 2048;
	int textureY = 1024;

	public ModelKi56() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[240];
		noseModel = new ModelRendererTurbo[36];
		tailModel = new ModelRendererTurbo[72];
		leftWingModel = new ModelRendererTurbo[54];
		rightWingModel = new ModelRendererTurbo[56];
		yawFlapModel = new ModelRendererTurbo[8];
		pitchFlapLeftModel = new ModelRendererTurbo[1];
		pitchFlapRightModel = new ModelRendererTurbo[1];
		pitchFlapLeftWingModel = new ModelRendererTurbo[1];
		pitchFlapRightWingModel = new ModelRendererTurbo[1];
		tailWheelModel = new ModelRendererTurbo[7];
		leftWingWheelModel = new ModelRendererTurbo[13];
		rightWingWheelModel = new ModelRendererTurbo[11];
		skidsModel = new ModelRendererTurbo[317];

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
		initskidsModel_1();

		initPropeller();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1329, 955, textureX, textureY); // Box 28
		bodyModel[1] = new ModelRendererTurbo(this, 1, 955, textureX, textureY); // Box 32
		bodyModel[2] = new ModelRendererTurbo(this, 41, 955, textureX, textureY); // Box 33
		bodyModel[3] = new ModelRendererTurbo(this, 89, 955, textureX, textureY); // Box 34
		bodyModel[4] = new ModelRendererTurbo(this, 121, 955, textureX, textureY); // Box 45
		bodyModel[5] = new ModelRendererTurbo(this, 185, 955, textureX, textureY); // Box 48
		bodyModel[6] = new ModelRendererTurbo(this, 1, 989, textureX, textureY); // Box 247
		bodyModel[7] = new ModelRendererTurbo(this, 65, 989, textureX, textureY); // Box 249
		bodyModel[8] = new ModelRendererTurbo(this, 105, 989, textureX, textureY); // Box 250
		bodyModel[9] = new ModelRendererTurbo(this, 153, 989, textureX, textureY); // Box 251
		bodyModel[10] = new ModelRendererTurbo(this, 185, 989, textureX, textureY); // Box 256
		bodyModel[11] = new ModelRendererTurbo(this, 249, 989, textureX, textureY); // Box 257
		bodyModel[12] = new ModelRendererTurbo(this, 241, 955, textureX, textureY); // Box 29
		bodyModel[13] = new ModelRendererTurbo(this, 409, 955, textureX, textureY); // Box 35
		bodyModel[14] = new ModelRendererTurbo(this, 497, 955, textureX, textureY); // Box 36
		bodyModel[15] = new ModelRendererTurbo(this, 569, 955, textureX, textureY); // Box 43
		bodyModel[16] = new ModelRendererTurbo(this, 633, 955, textureX, textureY); // Box 46
		bodyModel[17] = new ModelRendererTurbo(this, 801, 955, textureX, textureY); // Box 49
		bodyModel[18] = new ModelRendererTurbo(this, 305, 989, textureX, textureY); // Box 576
		bodyModel[19] = new ModelRendererTurbo(this, 473, 989, textureX, textureY); // Box 578
		bodyModel[20] = new ModelRendererTurbo(this, 561, 989, textureX, textureY); // Box 579
		bodyModel[21] = new ModelRendererTurbo(this, 633, 989, textureX, textureY); // Box 580
		bodyModel[22] = new ModelRendererTurbo(this, 697, 989, textureX, textureY); // Box 581
		bodyModel[23] = new ModelRendererTurbo(this, 865, 989, textureX, textureY); // Box 583
		bodyModel[24] = new ModelRendererTurbo(this, 1, 878, textureX, textureY); // Box 0
		bodyModel[25] = new ModelRendererTurbo(this, 121, 878, textureX, textureY); // Box 1
		bodyModel[26] = new ModelRendererTurbo(this, 233, 878, textureX, textureY); // Box 2
		bodyModel[27] = new ModelRendererTurbo(this, 353, 878, textureX, textureY); // Box 3
		bodyModel[28] = new ModelRendererTurbo(this, 417, 878, textureX, textureY); // Box 4
		bodyModel[29] = new ModelRendererTurbo(this, 521, 878, textureX, textureY); // Box 5
		bodyModel[30] = new ModelRendererTurbo(this, 1, 802, textureX, textureY); // Box 6
		bodyModel[31] = new ModelRendererTurbo(this, 105, 802, textureX, textureY); // Box 7
		bodyModel[32] = new ModelRendererTurbo(this, 201, 802, textureX, textureY); // Box 8
		bodyModel[33] = new ModelRendererTurbo(this, 313, 802, textureX, textureY); // Box 9
		bodyModel[34] = new ModelRendererTurbo(this, 393, 802, textureX, textureY); // Box 10
		bodyModel[35] = new ModelRendererTurbo(this, 537, 802, textureX, textureY); // Box 11
		bodyModel[36] = new ModelRendererTurbo(this, 617, 878, textureX, textureY); // Box 12
		bodyModel[37] = new ModelRendererTurbo(this, 729, 878, textureX, textureY); // Box 13
		bodyModel[38] = new ModelRendererTurbo(this, 641, 802, textureX, textureY); // Box 14
		bodyModel[39] = new ModelRendererTurbo(this, 753, 802, textureX, textureY); // Box 15
		bodyModel[40] = new ModelRendererTurbo(this, 801, 878, textureX, textureY); // Box 19
		bodyModel[41] = new ModelRendererTurbo(this, 945, 878, textureX, textureY); // Box 20
		bodyModel[42] = new ModelRendererTurbo(this, 833, 802, textureX, textureY); // Box 21
		bodyModel[43] = new ModelRendererTurbo(this, 977, 802, textureX, textureY); // Box 22
		bodyModel[44] = new ModelRendererTurbo(this, 1073, 878, textureX, textureY); // Box 24
		bodyModel[45] = new ModelRendererTurbo(this, 1209, 878, textureX, textureY); // Box 25
		bodyModel[46] = new ModelRendererTurbo(this, 1097, 802, textureX, textureY); // Box 26
		bodyModel[47] = new ModelRendererTurbo(this, 1329, 878, textureX, textureY); // Box 27
		bodyModel[48] = new ModelRendererTurbo(this, 921, 878, textureX, textureY); // Box 31
		bodyModel[49] = new ModelRendererTurbo(this, 1409, 878, textureX, textureY); // Box 37
		bodyModel[50] = new ModelRendererTurbo(this, 1489, 878, textureX, textureY); // Box 38
		bodyModel[51] = new ModelRendererTurbo(this, 1, 878, textureX, textureY); // Box 39
		bodyModel[52] = new ModelRendererTurbo(this, 225, 878, textureX, textureY); // Box 44
		bodyModel[53] = new ModelRendererTurbo(this, 1233, 802, textureX, textureY); // Box 54
		bodyModel[54] = new ModelRendererTurbo(this, 1561, 878, textureX, textureY); // Box 57
		bodyModel[55] = new ModelRendererTurbo(this, 1689, 878, textureX, textureY); // Box 58
		bodyModel[56] = new ModelRendererTurbo(this, 1337, 802, textureX, textureY); // Box 59
		bodyModel[57] = new ModelRendererTurbo(this, 1457, 803, textureX, textureY); // Box 60
		bodyModel[58] = new ModelRendererTurbo(this, 1193, 878, textureX, textureY); // Box 181
		bodyModel[59] = new ModelRendererTurbo(this, 1313, 878, textureX, textureY); // Box 182
		bodyModel[60] = new ModelRendererTurbo(this, 569, 98, textureX, textureY); // Box 213
		bodyModel[61] = new ModelRendererTurbo(this, 217, 98, textureX, textureY); // Box 214
		bodyModel[62] = new ModelRendererTurbo(this, 281, 98, textureX, textureY); // Box 215
		bodyModel[63] = new ModelRendererTurbo(this, 601, 98, textureX, textureY); // Box 216
		bodyModel[64] = new ModelRendererTurbo(this, 321, 98, textureX, textureY); // Box 217
		bodyModel[65] = new ModelRendererTurbo(this, 641, 98, textureX, textureY); // Box 218
		bodyModel[66] = new ModelRendererTurbo(this, 1, 916, textureX, textureY); // Box 219
		bodyModel[67] = new ModelRendererTurbo(this, 121, 916, textureX, textureY); // Box 220
		bodyModel[68] = new ModelRendererTurbo(this, 233, 916, textureX, textureY); // Box 221
		bodyModel[69] = new ModelRendererTurbo(this, 353, 916, textureX, textureY); // Box 222
		bodyModel[70] = new ModelRendererTurbo(this, 417, 916, textureX, textureY); // Box 223
		bodyModel[71] = new ModelRendererTurbo(this, 521, 916, textureX, textureY); // Box 224
		bodyModel[72] = new ModelRendererTurbo(this, 1, 840, textureX, textureY); // Box 225
		bodyModel[73] = new ModelRendererTurbo(this, 105, 840, textureX, textureY); // Box 226
		bodyModel[74] = new ModelRendererTurbo(this, 201, 840, textureX, textureY); // Box 227
		bodyModel[75] = new ModelRendererTurbo(this, 313, 840, textureX, textureY); // Box 228
		bodyModel[76] = new ModelRendererTurbo(this, 393, 840, textureX, textureY); // Box 229
		bodyModel[77] = new ModelRendererTurbo(this, 537, 840, textureX, textureY); // Box 230
		bodyModel[78] = new ModelRendererTurbo(this, 617, 916, textureX, textureY); // Box 231
		bodyModel[79] = new ModelRendererTurbo(this, 729, 916, textureX, textureY); // Box 232
		bodyModel[80] = new ModelRendererTurbo(this, 641, 840, textureX, textureY); // Box 233
		bodyModel[81] = new ModelRendererTurbo(this, 753, 840, textureX, textureY); // Box 234
		bodyModel[82] = new ModelRendererTurbo(this, 801, 916, textureX, textureY); // Box 238
		bodyModel[83] = new ModelRendererTurbo(this, 945, 916, textureX, textureY); // Box 239
		bodyModel[84] = new ModelRendererTurbo(this, 833, 840, textureX, textureY); // Box 240
		bodyModel[85] = new ModelRendererTurbo(this, 977, 840, textureX, textureY); // Box 241
		bodyModel[86] = new ModelRendererTurbo(this, 1073, 916, textureX, textureY); // Box 243
		bodyModel[87] = new ModelRendererTurbo(this, 1209, 916, textureX, textureY); // Box 244
		bodyModel[88] = new ModelRendererTurbo(this, 1097, 840, textureX, textureY); // Box 245
		bodyModel[89] = new ModelRendererTurbo(this, 1329, 916, textureX, textureY); // Box 246
		bodyModel[90] = new ModelRendererTurbo(this, 921, 916, textureX, textureY); // Box 248
		bodyModel[91] = new ModelRendererTurbo(this, 1409, 916, textureX, textureY); // Box 252
		bodyModel[92] = new ModelRendererTurbo(this, 1489, 916, textureX, textureY); // Box 253
		bodyModel[93] = new ModelRendererTurbo(this, 1, 916, textureX, textureY); // Box 254
		bodyModel[94] = new ModelRendererTurbo(this, 1481, 916, textureX, textureY); // Box 255
		bodyModel[95] = new ModelRendererTurbo(this, 1233, 840, textureX, textureY); // Box 258
		bodyModel[96] = new ModelRendererTurbo(this, 1561, 916, textureX, textureY); // Box 260
		bodyModel[97] = new ModelRendererTurbo(this, 1689, 916, textureX, textureY); // Box 261
		bodyModel[98] = new ModelRendererTurbo(this, 1337, 840, textureX, textureY); // Box 262
		bodyModel[99] = new ModelRendererTurbo(this, 1457, 841, textureX, textureY); // Box 263
		bodyModel[100] = new ModelRendererTurbo(this, 1193, 916, textureX, textureY); // Box 372
		bodyModel[101] = new ModelRendererTurbo(this, 1313, 916, textureX, textureY); // Box 373
		bodyModel[102] = new ModelRendererTurbo(this, 1113, 98, textureX, textureY); // Box 392
		bodyModel[103] = new ModelRendererTurbo(this, 361, 98, textureX, textureY); // Box 393
		bodyModel[104] = new ModelRendererTurbo(this, 425, 98, textureX, textureY); // Box 394
		bodyModel[105] = new ModelRendererTurbo(this, 1145, 98, textureX, textureY); // Box 395
		bodyModel[106] = new ModelRendererTurbo(this, 489, 98, textureX, textureY); // Box 396
		bodyModel[107] = new ModelRendererTurbo(this, 1185, 98, textureX, textureY); // Box 397
		bodyModel[108] = new ModelRendererTurbo(this, 9, 98, textureX, textureY); // Box 426
		bodyModel[109] = new ModelRendererTurbo(this, 1497, 98, textureX, textureY); // Box 427
		bodyModel[110] = new ModelRendererTurbo(this, 1569, 98, textureX, textureY); // Box 428
		bodyModel[111] = new ModelRendererTurbo(this, 1665, 98, textureX, textureY); // Box 429
		bodyModel[112] = new ModelRendererTurbo(this, 1537, 98, textureX, textureY); // Box 690
		bodyModel[113] = new ModelRendererTurbo(this, 1633, 98, textureX, textureY); // Box 691
		bodyModel[114] = new ModelRendererTurbo(this, 105, 98, textureX, textureY); // Box 692
		bodyModel[115] = new ModelRendererTurbo(this, 777, 98, textureX, textureY); // Box 693
		bodyModel[116] = new ModelRendererTurbo(this, 1353, 98, textureX, textureY); // Box 695
		bodyModel[117] = new ModelRendererTurbo(this, 1425, 98, textureX, textureY); // Box 696
		bodyModel[118] = new ModelRendererTurbo(this, 1473, 98, textureX, textureY); // Box 697
		bodyModel[119] = new ModelRendererTurbo(this, 49, 98, textureX, textureY); // Box 264
		bodyModel[120] = new ModelRendererTurbo(this, 625, 98, textureX, textureY); // Box 786
		bodyModel[121] = new ModelRendererTurbo(this, 641, 98, textureX, textureY); // Box 789
		bodyModel[122] = new ModelRendererTurbo(this, 665, 98, textureX, textureY); // Box 791
		bodyModel[123] = new ModelRendererTurbo(this, 721, 98, textureX, textureY); // Box 792
		bodyModel[124] = new ModelRendererTurbo(this, 1449, 98, textureX, textureY); // Box 1114
		bodyModel[125] = new ModelRendererTurbo(this, 1593, 98, textureX, textureY); // Box 1115
		bodyModel[126] = new ModelRendererTurbo(this, 1649, 98, textureX, textureY); // Box 678
		bodyModel[127] = new ModelRendererTurbo(this, 1673, 98, textureX, textureY); // Box 679
		bodyModel[128] = new ModelRendererTurbo(this, 1729, 98, textureX, textureY); // Box 680
		bodyModel[129] = new ModelRendererTurbo(this, 1745, 98, textureX, textureY); // Box 1017
		bodyModel[130] = new ModelRendererTurbo(this, 1769, 98, textureX, textureY); // Box 239
		bodyModel[131] = new ModelRendererTurbo(this, 1817, 98, textureX, textureY); // Box 240
		bodyModel[132] = new ModelRendererTurbo(this, 1801, 98, textureX, textureY); // Box 241
		bodyModel[133] = new ModelRendererTurbo(this, 1833, 98, textureX, textureY); // Box 242
		bodyModel[134] = new ModelRendererTurbo(this, 1849, 98, textureX, textureY); // Box 243
		bodyModel[135] = new ModelRendererTurbo(this, 1873, 98, textureX, textureY); // Box 244
		bodyModel[136] = new ModelRendererTurbo(this, 1897, 98, textureX, textureY); // Box 245
		bodyModel[137] = new ModelRendererTurbo(this, 1913, 98, textureX, textureY); // Box 246
		bodyModel[138] = new ModelRendererTurbo(this, 1937, 98, textureX, textureY); // Box 247
		bodyModel[139] = new ModelRendererTurbo(this, 1945, 98, textureX, textureY); // Box 248
		bodyModel[140] = new ModelRendererTurbo(this, 1953, 98, textureX, textureY); // Box 250
		bodyModel[141] = new ModelRendererTurbo(this, 1961, 98, textureX, textureY); // Box 251
		bodyModel[142] = new ModelRendererTurbo(this, 1969, 98, textureX, textureY); // Box 252
		bodyModel[143] = new ModelRendererTurbo(this, 1993, 98, textureX, textureY); // Box 253
		bodyModel[144] = new ModelRendererTurbo(this, 1513, 98, textureX, textureY); // Box 962
		bodyModel[145] = new ModelRendererTurbo(this, 1769, 98, textureX, textureY); // Box 964
		bodyModel[146] = new ModelRendererTurbo(this, 1817, 98, textureX, textureY); // Box 966
		bodyModel[147] = new ModelRendererTurbo(this, 2017, 98, textureX, textureY); // Box 782
		bodyModel[148] = new ModelRendererTurbo(this, 2025, 98, textureX, textureY); // Box 783
		bodyModel[149] = new ModelRendererTurbo(this, 161, 106, textureX, textureY); // Box 475
		bodyModel[150] = new ModelRendererTurbo(this, 97, 106, textureX, textureY); // Box 476
		bodyModel[151] = new ModelRendererTurbo(this, 193, 106, textureX, textureY); // Box 477
		bodyModel[152] = new ModelRendererTurbo(this, 233, 106, textureX, textureY); // Box 478
		bodyModel[153] = new ModelRendererTurbo(this, 249, 106, textureX, textureY); // Box 479
		bodyModel[154] = new ModelRendererTurbo(this, 393, 106, textureX, textureY); // Box 480
		bodyModel[155] = new ModelRendererTurbo(this, 2033, 98, textureX, textureY); // Box 481
		bodyModel[156] = new ModelRendererTurbo(this, 457, 106, textureX, textureY); // Box 482
		bodyModel[157] = new ModelRendererTurbo(this, 273, 106, textureX, textureY); // Box 483
		bodyModel[158] = new ModelRendererTurbo(this, 313, 106, textureX, textureY); // Box 484
		bodyModel[159] = new ModelRendererTurbo(this, 353, 106, textureX, textureY); // Box 485
		bodyModel[160] = new ModelRendererTurbo(this, 417, 106, textureX, textureY); // Box 486
		bodyModel[161] = new ModelRendererTurbo(this, 377, 106, textureX, textureY); // Box 487
		bodyModel[162] = new ModelRendererTurbo(this, 441, 106, textureX, textureY); // Box 488
		bodyModel[163] = new ModelRendererTurbo(this, 1849, 98, textureX, textureY); // Box 489
		bodyModel[164] = new ModelRendererTurbo(this, 1865, 98, textureX, textureY); // Box 490
		bodyModel[165] = new ModelRendererTurbo(this, 1889, 98, textureX, textureY); // Box 491
		bodyModel[166] = new ModelRendererTurbo(this, 481, 106, textureX, textureY); // Box 492
		bodyModel[167] = new ModelRendererTurbo(this, 521, 106, textureX, textureY); // Box 493
		bodyModel[168] = new ModelRendererTurbo(this, 1217, 98, textureX, textureY); // Box 494
		bodyModel[169] = new ModelRendererTurbo(this, 209, 106, textureX, textureY); // Box 495
		bodyModel[170] = new ModelRendererTurbo(this, 249, 106, textureX, textureY); // Box 496
		bodyModel[171] = new ModelRendererTurbo(this, 1241, 98, textureX, textureY); // Box 497
		bodyModel[172] = new ModelRendererTurbo(this, 1265, 98, textureX, textureY); // Box 498
		bodyModel[173] = new ModelRendererTurbo(this, 529, 106, textureX, textureY); // Box 499
		bodyModel[174] = new ModelRendererTurbo(this, 545, 106, textureX, textureY); // Box 500
		bodyModel[175] = new ModelRendererTurbo(this, 233, 916, textureX, textureY); // Box 810
		bodyModel[176] = new ModelRendererTurbo(this, 1465, 916, textureX, textureY); // Box 811
		bodyModel[177] = new ModelRendererTurbo(this, 1417, 916, textureX, textureY); // Box 812
		bodyModel[178] = new ModelRendererTurbo(this, 1545, 916, textureX, textureY); // Box 813
		bodyModel[179] = new ModelRendererTurbo(this, 1009, 106, textureX, textureY); // Box 676
		bodyModel[180] = new ModelRendererTurbo(this, 1041, 106, textureX, textureY); // Box 677
		bodyModel[181] = new ModelRendererTurbo(this, 1057, 106, textureX, textureY); // Box 678
		bodyModel[182] = new ModelRendererTurbo(this, 1969, 106, textureX, textureY); // Box 239
		bodyModel[183] = new ModelRendererTurbo(this, 561, 106, textureX, textureY); // Box 241
		bodyModel[184] = new ModelRendererTurbo(this, 593, 106, textureX, textureY); // Box 242
		bodyModel[185] = new ModelRendererTurbo(this, 705, 106, textureX, textureY); // Box 243
		bodyModel[186] = new ModelRendererTurbo(this, 769, 106, textureX, textureY); // Box 244
		bodyModel[187] = new ModelRendererTurbo(this, 1633, 106, textureX, textureY); // Box 246
		bodyModel[188] = new ModelRendererTurbo(this, 833, 106, textureX, textureY); // Box 690
		bodyModel[189] = new ModelRendererTurbo(this, 1097, 106, textureX, textureY); // Box 691
		bodyModel[190] = new ModelRendererTurbo(this, 1353, 98, textureX, textureY); // Box 1
		bodyModel[191] = new ModelRendererTurbo(this, 1673, 106, textureX, textureY); // Box 2
		bodyModel[192] = new ModelRendererTurbo(this, 1425, 98, textureX, textureY); // Box 3
		bodyModel[193] = new ModelRendererTurbo(this, 1729, 106, textureX, textureY); // Box 4
		bodyModel[194] = new ModelRendererTurbo(this, 49, 114, textureX, textureY); // Box 5
		bodyModel[195] = new ModelRendererTurbo(this, 2001, 106, textureX, textureY); // Box 6
		bodyModel[196] = new ModelRendererTurbo(this, 81, 114, textureX, textureY); // Box 7
		bodyModel[197] = new ModelRendererTurbo(this, 113, 114, textureX, textureY); // Box 8
		bodyModel[198] = new ModelRendererTurbo(this, 1449, 98, textureX, textureY); // Box 9
		bodyModel[199] = new ModelRendererTurbo(this, 1473, 98, textureX, textureY); // Box 10
		bodyModel[200] = new ModelRendererTurbo(this, 1521, 98, textureX, textureY); // Box 11
		bodyModel[201] = new ModelRendererTurbo(this, 1537, 98, textureX, textureY); // Box 12
		bodyModel[202] = new ModelRendererTurbo(this, 1585, 98, textureX, textureY); // Box 13
		bodyModel[203] = new ModelRendererTurbo(this, 1913, 98, textureX, textureY); // Box 14
		bodyModel[204] = new ModelRendererTurbo(this, 1649, 98, textureX, textureY); // Box 15
		bodyModel[205] = new ModelRendererTurbo(this, 1689, 98, textureX, textureY); // Box 16
		bodyModel[206] = new ModelRendererTurbo(this, 1745, 98, textureX, textureY); // Box 17
		bodyModel[207] = new ModelRendererTurbo(this, 1873, 98, textureX, textureY); // Box 18
		bodyModel[208] = new ModelRendererTurbo(this, 1929, 98, textureX, textureY); // Box 19
		bodyModel[209] = new ModelRendererTurbo(this, 265, 106, textureX, textureY); // Box 20
		bodyModel[210] = new ModelRendererTurbo(this, 281, 106, textureX, textureY); // Box 21
		bodyModel[211] = new ModelRendererTurbo(this, 297, 106, textureX, textureY); // Box 22
		bodyModel[212] = new ModelRendererTurbo(this, 305, 106, textureX, textureY); // Box 23
		bodyModel[213] = new ModelRendererTurbo(this, 321, 106, textureX, textureY); // Box 24
		bodyModel[214] = new ModelRendererTurbo(this, 1897, 98, textureX, textureY); // Box 25
		bodyModel[215] = new ModelRendererTurbo(this, 2033, 98, textureX, textureY); // Box 27
		bodyModel[216] = new ModelRendererTurbo(this, 1137, 106, textureX, textureY); // Box 28
		bodyModel[217] = new ModelRendererTurbo(this, 409, 106, textureX, textureY); // Box 29
		bodyModel[218] = new ModelRendererTurbo(this, 217, 106, textureX, textureY); // Box 30
		bodyModel[219] = new ModelRendererTurbo(this, 225, 106, textureX, textureY); // Box 31
		bodyModel[220] = new ModelRendererTurbo(this, 289, 106, textureX, textureY); // Box 32
		bodyModel[221] = new ModelRendererTurbo(this, 329, 106, textureX, textureY); // Box 33
		bodyModel[222] = new ModelRendererTurbo(this, 729, 114, textureX, textureY); // Box 725
		bodyModel[223] = new ModelRendererTurbo(this, 793, 114, textureX, textureY); // Box 726
		bodyModel[224] = new ModelRendererTurbo(this, 193, 114, textureX, textureY); // Box 724
		bodyModel[225] = new ModelRendererTurbo(this, 849, 114, textureX, textureY); // Box 607
		bodyModel[226] = new ModelRendererTurbo(this, 1289, 114, textureX, textureY); // Box 608
		bodyModel[227] = new ModelRendererTurbo(this, 1217, 916, textureX, textureY); // Box 660
		bodyModel[228] = new ModelRendererTurbo(this, 1049, 879, textureX, textureY); // Box 40
		bodyModel[229] = new ModelRendererTurbo(this, 1793, 879, textureX, textureY); // Box 41
		bodyModel[230] = new ModelRendererTurbo(this, 1841, 879, textureX, textureY); // Box 42
		bodyModel[231] = new ModelRendererTurbo(this, 1889, 879, textureX, textureY); // Box 56
		bodyModel[232] = new ModelRendererTurbo(this, 1049, 917, textureX, textureY); // Box 531
		bodyModel[233] = new ModelRendererTurbo(this, 1793, 917, textureX, textureY); // Box 532
		bodyModel[234] = new ModelRendererTurbo(this, 1841, 917, textureX, textureY); // Box 533
		bodyModel[235] = new ModelRendererTurbo(this, 1889, 917, textureX, textureY); // Box 534
		bodyModel[236] = new ModelRendererTurbo(this, 0, 63, textureX, textureY); // Box 587
		bodyModel[237] = new ModelRendererTurbo(this, 0, 63, textureX, textureY); // Box 593
		bodyModel[238] = new ModelRendererTurbo(this, 0, 63, textureX, textureY); // Box 537
		bodyModel[239] = new ModelRendererTurbo(this, 0, 63, textureX, textureY); // Box 538

		bodyModel[0].addShapeBox(0F, 0F, 0F, 12, 16, 18, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[0].setRotationPoint(-112F, -38F, -18F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 12, 13, 5, 0F,0F, -2.9999F, -1.9999F, 0F, 0F, -0.9999F, 0F, 0F, -3.9999F, 0F, 0F, 0F, 0F, 0F, -0.9999F, 0F, 0F, 0F, 0F, 0F, -3.9999F, 0F, 0F, 0F); // Box 32
		bodyModel[1].setRotationPoint(-112F, -51F, -18F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 12, 16, 10, 0F,0F, -3F, -4F, 0F, -3F, 0F, -7F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, -7F, 0F, -1F, 0F, 0F, 0F); // Box 33
		bodyModel[2].setRotationPoint(-112F, -54F, -17F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 5, 16, 7, 0F,0F, 0F, 0F, 0F, 0F, 0.9999F, -4.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.9999F, -4.9999F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[3].setRotationPoint(-112F, -54F, -7F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 12, 9, 18, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 45
		bodyModel[4].setRotationPoint(-112F, -22F, -18F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 12, 5, 15, 0F,0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -6F, 0F, 2F, -6F, 0F, 2F, 0F, 0F, 1F, 0F); // Box 48
		bodyModel[5].setRotationPoint(-112F, -13F, -15F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 12, 16, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 247
		bodyModel[6].setRotationPoint(-112F, -38F, 0F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 12, 13, 5, 0F,0F, 0F, 0F, 0F, 0F, -3.9999F, 0F, 0F, -0.9999F, 0F, -2.9999F, -1.9999F, 0F, 0F, 0F, 0F, 0F, -3.9999F, 0F, 0F, 0F, 0F, 0F, -0.9999F); // Box 249
		bodyModel[7].setRotationPoint(-112F, -51F, 13F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 12, 16, 10, 0F,0F, 0F, 0F, -7F, 0F, -1F, 0F, -3F, 0F, 0F, -3F, -4F, 0F, 0F, 0F, -7F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 250
		bodyModel[8].setRotationPoint(-112F, -54F, 7F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 5, 16, 7, 0F,0F, 0F, 0F, -4.9999F, 0F, 0F, 0F, 0F, 0.9999F, 0F, 0F, 0F, 0F, 0F, 0F, -4.9999F, 0F, 0F, 0F, 0F, 0.9999F, 0F, 0F, 0F); // Box 251
		bodyModel[9].setRotationPoint(-112F, -54F, 0F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 12, 9, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, -4F); // Box 256
		bodyModel[10].setRotationPoint(-112F, -22F, 0F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 12, 5, 15, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 2F, -6F, 0F, 1F, -6F); // Box 257
		bodyModel[11].setRotationPoint(-112F, -13F, 0F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 25, 16, 17, 0F,0F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 29
		bodyModel[12].setRotationPoint(-137F, -38F, -17F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 25, 10, 17, 0F,0F, -4F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 35
		bodyModel[13].setRotationPoint(-137F, -48F, -17F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 25, 6, 17, 0F,0F, -4F, -6F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 1F, -4F, 0F, -3F, -1F, 0F, -3F, 0F, 0F, 1F, 0F); // Box 36
		bodyModel[14].setRotationPoint(-137F, -51F, -17F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 25, 3, 13, 0F,0F, -4F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); // Box 43
		bodyModel[15].setRotationPoint(-137F, -54F, -13F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 25, 8, 17, 0F,0F, 2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -3F, -6F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 46
		bodyModel[16].setRotationPoint(-137F, -22F, -17F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 25, 7, 14, 0F,0F, 3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -4F, -7F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 49
		bodyModel[17].setRotationPoint(-137F, -14F, -14F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 25, 16, 17, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -4F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F); // Box 576
		bodyModel[18].setRotationPoint(-137F, -38F, 0F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 25, 10, 17, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -4F, -4F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -4F); // Box 578
		bodyModel[19].setRotationPoint(-137F, -48F, 0F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 25, 6, 17, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -4F, -6F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, -3F, -1F, 0F, 1F, -4F); // Box 579
		bodyModel[20].setRotationPoint(-137F, -51F, 0F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 25, 3, 13, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -4F, -6F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -2F); // Box 580
		bodyModel[21].setRotationPoint(-137F, -54F, 0F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 25, 8, 17, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -4F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, -6F); // Box 581
		bodyModel[22].setRotationPoint(-137F, -22F, 0F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 25, 7, 14, 0F,0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -3F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -4F, -7F); // Box 583
		bodyModel[23].setRotationPoint(-137F, -14F, 0F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 49, 16, 21, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[24].setRotationPoint(-83F, -38F, -21F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 49, 13, 4, 0F,0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -1F); // Box 1
		bodyModel[25].setRotationPoint(-83F, -51F, -21F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 49, 10, 7, 0F,0F, 0F, -6F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -4F); // Box 2
		bodyModel[26].setRotationPoint(-83F, -61F, -20F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 39, 13, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 3
		bodyModel[27].setRotationPoint(-34F, -51F, -21F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 39, 16, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[28].setRotationPoint(-34F, -38F, -21F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 39, 10, 5, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 5
		bodyModel[29].setRotationPoint(-34F, -61F, -20F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 47, 13, 4, 0F,0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -3F); // Box 6
		bodyModel[30].setRotationPoint(5F, -51F, -21F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 40, 13, 5, 0F,0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 7
		bodyModel[31].setRotationPoint(52F, -51F, -19F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 47, 10, 6, 0F,0F, 0F, -4F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -5F); // Box 8
		bodyModel[32].setRotationPoint(5F, -61F, -20F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 40, 10, 7, 0F,0F, 0F, -3F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -6F); // Box 9
		bodyModel[33].setRotationPoint(52F, -61F, -18F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 47, 16, 21, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, -2F, 0F, -7F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[34].setRotationPoint(5F, -38F, -21F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 40, 9, 19, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, -4F, 0F, -7F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[35].setRotationPoint(52F, -38F, -19F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 49, 5, 6, 0F,0F, -2F, -6F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -3F); // Box 12
		bodyModel[36].setRotationPoint(-83F, -66F, -16F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 39, 5, 5, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 13
		bodyModel[37].setRotationPoint(-34F, -66F, -16F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 47, 5, 5, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -4F); // Box 14
		bodyModel[38].setRotationPoint(5F, -66F, -16F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 40, 5, 8, 0F,0F, 0F, -4F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -7F); // Box 15
		bodyModel[39].setRotationPoint(52F, -66F, -15F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 49, 9, 21, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[40].setRotationPoint(-83F, -22F, -21F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 39, 9, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[41].setRotationPoint(-34F, -22F, -21F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 47, 6, 21, 0F,0F, 0F, 0F, 0F, 7F, -2F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -7F, -5F, 0F, -7F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[42].setRotationPoint(5F, -22F, -21F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 40, 6, 19, 0F,0F, 0F, 0F, 0F, 7F, -4F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -8F, -6F, 0F, -8F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[43].setRotationPoint(52F, -29F, -19F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 49, 7, 16, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[44].setRotationPoint(-83F, -13F, -16F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 39, 7, 18, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -5F, -6F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[45].setRotationPoint(-34F, -13F, -18F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 47, 5, 18, 0F,0F, 0F, 0F, 0F, 7F, -2F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -7F, -8F, 0F, -7F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[46].setRotationPoint(5F, -16F, -18F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 17, 16, 19, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[47].setRotationPoint(-100F, -38F, -19F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 17, 13, 3, 0F,0F, 0F, -2F, -0.5F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F); // Box 31
		bodyModel[48].setRotationPoint(-100F, -51F, -19F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 17, 9, 19, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[49].setRotationPoint(-100F, -22F, -19F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 17, 7, 15, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[50].setRotationPoint(-100F, -13F, -15F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,-4F, 0F, -4F, 4F, 0F, -4F, 4F, 0F, 4F, -4F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[51].setRotationPoint(-100F, -61F, -17F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F); // Box 44
		bodyModel[52].setRotationPoint(-112F, -61F, -1F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 40, 5, 16, 0F,0F, 0F, 0F, 0F, 8F, -3F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -11F, -8F, 0F, -11F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[53].setRotationPoint(52F, -23F, -16F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 49, 4, 12, 0F,0F, -3F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 2F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 57
		bodyModel[54].setRotationPoint(-83F, -70F, -12F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 39, 4, 12, 0F,0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[55].setRotationPoint(-34F, -70F, -12F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 47, 4, 11, 0F,0F, 0F, -7F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[56].setRotationPoint(5F, -70F, -11F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 40, 4, 12, 0F,0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[57].setRotationPoint(52F, -70F, -12F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F, 0F, -12F, 0F, 0F, 0F); // Box 181
		bodyModel[58].setRotationPoint(-106F, -61F, -1F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 182
		bodyModel[59].setRotationPoint(-96F, -61F, -13F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 16, 14, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 213
		bodyModel[60].setRotationPoint(-79F, -51F, -19F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 10, 13, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 214
		bodyModel[61].setRotationPoint(-79F, -61F, -18F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 4, 13, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 215
		bodyModel[62].setRotationPoint(-79F, -65F, -13F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 5, 15, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 216
		bodyModel[63].setRotationPoint(-48F, -66F, -15F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 10, 13, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		bodyModel[64].setRotationPoint(-48F, -61F, -19F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 16, 14, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 218
		bodyModel[65].setRotationPoint(-48F, -51F, -20F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 49, 16, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 219
		bodyModel[66].setRotationPoint(-83F, -38F, 0F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 49, 13, 4, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 220
		bodyModel[67].setRotationPoint(-83F, -51F, 17F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 49, 10, 7, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, -6F, 0F, 0F, -4F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 221
		bodyModel[68].setRotationPoint(-83F, -61F, 13F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 39, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 222
		bodyModel[69].setRotationPoint(-34F, -51F, 19F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 39, 16, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[70].setRotationPoint(-34F, -38F, 0F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 39, 10, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[71].setRotationPoint(-34F, -61F, 15F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 47, 13, 4, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 225
		bodyModel[72].setRotationPoint(5F, -51F, 17F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 40, 13, 5, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 226
		bodyModel[73].setRotationPoint(52F, -51F, 14F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 47, 10, 6, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -4F, 0F, 0F, -5F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 227
		bodyModel[74].setRotationPoint(5F, -61F, 14F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 40, 10, 7, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -3F, 0F, 0F, -6F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 228
		bodyModel[75].setRotationPoint(52F, -61F, 11F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 47, 16, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, -2F, 0F, 0F, 0F); // Box 229
		bodyModel[76].setRotationPoint(5F, -38F, 0F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 40, 9, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, -4F, 0F, 0F, 0F); // Box 230
		bodyModel[77].setRotationPoint(52F, -38F, 0F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 49, 5, 6, 0F,0F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -2F, -6F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 231
		bodyModel[78].setRotationPoint(-83F, -66F, 10F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 39, 5, 5, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		bodyModel[79].setRotationPoint(-34F, -66F, 11F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 47, 5, 5, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 233
		bodyModel[80].setRotationPoint(5F, -66F, 11F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 40, 5, 8, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -4F, 0F, 0F, -7F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 234
		bodyModel[81].setRotationPoint(52F, -66F, 7F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 49, 9, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F); // Box 238
		bodyModel[82].setRotationPoint(-83F, -22F, 0F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 39, 9, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -3F, 0F, 0F, -3F); // Box 239
		bodyModel[83].setRotationPoint(-34F, -22F, 0F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 47, 6, 21, 0F,0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, -5F, 0F, 0F, -3F); // Box 240
		bodyModel[84].setRotationPoint(5F, -22F, 0F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 40, 6, 19, 0F,0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, -6F, 0F, 0F, -3F); // Box 241
		bodyModel[85].setRotationPoint(52F, -29F, 0F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 49, 7, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -6F); // Box 243
		bodyModel[86].setRotationPoint(-83F, -13F, 0F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 39, 7, 18, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, -6F, 0F, 0F, -6F); // Box 244
		bodyModel[87].setRotationPoint(-34F, -13F, 0F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 47, 5, 18, 0F,0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, -8F, 0F, 0F, -6F); // Box 245
		bodyModel[88].setRotationPoint(5F, -16F, 0F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 17, 16, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 246
		bodyModel[89].setRotationPoint(-100F, -38F, 0F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 17, 13, 3, 0F,1F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 248
		bodyModel[90].setRotationPoint(-100F, -51F, 16F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 17, 9, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F); // Box 252
		bodyModel[91].setRotationPoint(-100F, -22F, 0F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 17, 7, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -6F); // Box 253
		bodyModel[92].setRotationPoint(-100F, -13F, 0F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,-4F, 0F, 4F, 4F, 0F, 4F, 4F, 0F, -4F, -4F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 254
		bodyModel[93].setRotationPoint(-100F, -61F, 16F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F); // Box 255
		bodyModel[94].setRotationPoint(-112F, -61F, 0F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 40, 5, 16, 0F,0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, -8F, 0F, 0F, -6F); // Box 258
		bodyModel[95].setRotationPoint(52F, -23F, 0F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 49, 4, 12, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -3F, -8F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 2F, -2F); // Box 260
		bodyModel[96].setRotationPoint(-83F, -70F, 0F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 39, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 261
		bodyModel[97].setRotationPoint(-34F, -70F, 0F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 47, 4, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 262
		bodyModel[98].setRotationPoint(5F, -70F, 0F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 40, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -1F); // Box 263
		bodyModel[99].setRotationPoint(52F, -70F, 0F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 12F, 0F, 0F, 0F); // Box 372
		bodyModel[100].setRotationPoint(-106F, -61F, 0F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 373
		bodyModel[101].setRotationPoint(-96F, -61F, 12F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 16, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 392
		bodyModel[102].setRotationPoint(-79F, -51F, 5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 10, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 393
		bodyModel[103].setRotationPoint(-79F, -61F, 5F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 4, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[104].setRotationPoint(-79F, -65F, 0F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 5, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 395
		bodyModel[105].setRotationPoint(-48F, -66F, 0F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 10, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 396
		bodyModel[106].setRotationPoint(-48F, -61F, 6F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 16, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 397
		bodyModel[107].setRotationPoint(-48F, -51F, 6F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 2, 8, 34, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 426
		bodyModel[108].setRotationPoint(-100F, -51F, -17F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 2, 3, 32, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 427
		bodyModel[109].setRotationPoint(-100F, -54F, -16F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 12, 13, 34, 0F,0F, 0F, -5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 428
		bodyModel[110].setRotationPoint(-112F, -51F, -17F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 12, 3, 32, 0F,0F, 0F, -16F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -16F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F); // Box 429
		bodyModel[111].setRotationPoint(-112F, -54F, -16F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 19, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 690
		bodyModel[112].setRotationPoint(-107F, -46F, -3F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 691
		bodyModel[113].setRotationPoint(-95F, -47F, -2F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 692
		bodyModel[114].setRotationPoint(-95F, -48F, -2F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 693
		bodyModel[115].setRotationPoint(-95F, -48F, 0F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 695
		bodyModel[116].setRotationPoint(-93F, -50F, -3F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 696
		bodyModel[117].setRotationPoint(-93F, -51F, -3F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 697
		bodyModel[118].setRotationPoint(-93F, -52F, -3F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 264
		bodyModel[119].setRotationPoint(-94F, -52F, -8.5F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 786
		bodyModel[120].setRotationPoint(-94F, -51.75F, -7.5F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 789
		bodyModel[121].setRotationPoint(-94F, -51.75F, -11.5F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 791
		bodyModel[122].setRotationPoint(-94F, -54.75F, -11.5F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 792
		bodyModel[123].setRotationPoint(-94F, -54.75F, -5.5F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1114
		bodyModel[124].setRotationPoint(-96F, -49.5F, -12.5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 2, 13, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1115
		bodyModel[125].setRotationPoint(-96F, -49.5F, -14.5F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 6, 3, 6, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 678
		bodyModel[126].setRotationPoint(-102F, -49F, -3F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 679
		bodyModel[127].setRotationPoint(-107F, -44F, -7F);
		bodyModel[127].rotateAngleZ = -0.97738438F;

		bodyModel[128].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 680
		bodyModel[128].setRotationPoint(-107F, -44F, -11F);
		bodyModel[128].rotateAngleZ = -0.97738438F;

		bodyModel[129].addShapeBox(0F, 0F, 0F, 5, 8, 6, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1017
		bodyModel[129].setRotationPoint(-88F, -46F, -3F);

		bodyModel[130].addShapeBox(0F, 1F, 0F, 10, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
		bodyModel[130].setRotationPoint(-92F, -45F, -14F);
		bodyModel[130].rotateAngleZ = -0.10471976F;

		bodyModel[131].addShapeBox(9F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		bodyModel[131].setRotationPoint(-92F, -45F, -14F);
		bodyModel[131].rotateAngleZ = -0.10471976F;

		bodyModel[132].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		bodyModel[132].setRotationPoint(-92F, -45F, -14F);
		bodyModel[132].rotateAngleZ = -0.10471976F;

		bodyModel[133].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		bodyModel[133].setRotationPoint(-92F, -45F, -5F);
		bodyModel[133].rotateAngleZ = -0.10471976F;

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		bodyModel[134].setRotationPoint(-92F, -45F, -14F);
		bodyModel[134].rotateAngleZ = -0.10471976F;

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 13, 10, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		bodyModel[135].setRotationPoint(-83F, -57F, -14F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[136].setRotationPoint(-81F, -61F, -12F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 13, 8, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 246
		bodyModel[137].setRotationPoint(-84F, -56F, -13F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[138].setRotationPoint(-84.3F, -56.3F, -11F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[139].setRotationPoint(-84.3F, -56.3F, -8F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 20, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[140].setRotationPoint(-83F, -54F, -13F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 20, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 251
		bodyModel[141].setRotationPoint(-83F, -54F, -6F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[142].setRotationPoint(-89F, -44F, -15F);
		bodyModel[142].rotateAngleZ = 0.78539816F;

		bodyModel[143].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 253
		bodyModel[143].setRotationPoint(-89F, -44F, -4F);
		bodyModel[143].rotateAngleZ = 0.78539816F;

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 962
		bodyModel[144].setRotationPoint(-81.5F, -60.5F, -10.5F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 964
		bodyModel[145].setRotationPoint(-81.5F, -59.5F, -10.5F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 966
		bodyModel[146].setRotationPoint(-81.5F, -58.5F, -10.5F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 782
		bodyModel[147].setRotationPoint(-88F, -43F, -13F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 783
		bodyModel[148].setRotationPoint(-88F, -43F, -6F);

		bodyModel[149].addShapeBox(0F, 1F, 0F, 10, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 475
		bodyModel[149].setRotationPoint(-92F, -45F, 4F);
		bodyModel[149].rotateAngleZ = -0.10471976F;

		bodyModel[150].addShapeBox(9F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 476
		bodyModel[150].setRotationPoint(-92F, -45F, 4F);
		bodyModel[150].rotateAngleZ = -0.10471976F;

		bodyModel[151].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 477
		bodyModel[151].setRotationPoint(-92F, -45F, 13F);
		bodyModel[151].rotateAngleZ = -0.10471976F;

		bodyModel[152].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 478
		bodyModel[152].setRotationPoint(-92F, -45F, 4F);
		bodyModel[152].rotateAngleZ = -0.10471976F;

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 479
		bodyModel[153].setRotationPoint(-92F, -45F, 4F);
		bodyModel[153].rotateAngleZ = -0.10471976F;

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 13, 10, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 480
		bodyModel[154].setRotationPoint(-83F, -57F, 4F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 481
		bodyModel[155].setRotationPoint(-81F, -61F, 6F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 13, 8, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 482
		bodyModel[156].setRotationPoint(-84F, -56F, 5F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 483
		bodyModel[157].setRotationPoint(-84.3F, -56.3F, 10F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 484
		bodyModel[158].setRotationPoint(-84.3F, -56.3F, 7F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 20, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 485
		bodyModel[159].setRotationPoint(-83F, -54F, 12F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 20, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 486
		bodyModel[160].setRotationPoint(-83F, -54F, 5F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 487
		bodyModel[161].setRotationPoint(-89F, -44F, 14F);
		bodyModel[161].rotateAngleZ = 0.78539816F;

		bodyModel[162].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 488
		bodyModel[162].setRotationPoint(-89F, -44F, 3F);
		bodyModel[162].rotateAngleZ = 0.78539816F;

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 489
		bodyModel[163].setRotationPoint(-81.5F, -60.5F, 7.5F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 490
		bodyModel[164].setRotationPoint(-81.5F, -59.5F, 7.5F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 491
		bodyModel[165].setRotationPoint(-81.5F, -58.5F, 7.5F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 492
		bodyModel[166].setRotationPoint(-88F, -43F, 12F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 493
		bodyModel[167].setRotationPoint(-88F, -43F, 5F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 494
		bodyModel[168].setRotationPoint(-94F, -52F, 7.5F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 495
		bodyModel[169].setRotationPoint(-94F, -51.75F, 4.5F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 496
		bodyModel[170].setRotationPoint(-94F, -51.75F, 8.5F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 497
		bodyModel[171].setRotationPoint(-94F, -54.75F, 10.5F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 498
		bodyModel[172].setRotationPoint(-94F, -54.75F, 4.5F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 499
		bodyModel[173].setRotationPoint(-96F, -49.5F, 7.5F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 2, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 500
		bodyModel[174].setRotationPoint(-96F, -49.5F, 12.5F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 810
		bodyModel[175].setRotationPoint(-53F, -72F, -0.5F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 5, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 811
		bodyModel[176].setRotationPoint(-55F, -75F, -1.5F);

		bodyModel[177].addTrapezoid(0F, 0F, 0F, 2, 4, 3, 0F, -1.00F, ModelRendererTurbo.MR_RIGHT); // Box 812
		bodyModel[177].setRotationPoint(-57F, -75F, -1.5F);

		bodyModel[178].addTrapezoid(0F, 0F, 0F, 5, 4, 3, 0F, -1.00F, ModelRendererTurbo.MR_LEFT); // Box 813
		bodyModel[178].setRotationPoint(-50F, -75F, -1.5F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 11, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 676
		bodyModel[179].setRotationPoint(-78F, -47F, -16.5F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 11, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 677
		bodyModel[180].setRotationPoint(-78F, -47F, -3.5F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 11, 1, 15, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 678
		bodyModel[181].setRotationPoint(-78F, -48F, -17.5F);

		bodyModel[182].addShapeBox(0F, 1F, 0F, 10, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
		bodyModel[182].setRotationPoint(-66F, -45F, -15F);
		bodyModel[182].rotateAngleZ = -0.10471976F;

		bodyModel[183].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		bodyModel[183].setRotationPoint(-66F, -45F, -15F);
		bodyModel[183].rotateAngleZ = -0.10471976F;

		bodyModel[184].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		bodyModel[184].setRotationPoint(-66F, -45F, -6F);
		bodyModel[184].rotateAngleZ = -0.10471976F;

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		bodyModel[185].setRotationPoint(-66F, -45F, -15F);
		bodyModel[185].rotateAngleZ = -0.10471976F;

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 13, 10, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		bodyModel[186].setRotationPoint(-57F, -57F, -15F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 13, 8, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 246
		bodyModel[187].setRotationPoint(-58F, -56F, -14F);

		bodyModel[188].addShapeBox(9F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 690
		bodyModel[188].setRotationPoint(-66F, -45F, -15F);
		bodyModel[188].rotateAngleZ = -0.10471976F;

		bodyModel[189].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 691
		bodyModel[189].setRotationPoint(-62F, -43F, -11F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[190].setRotationPoint(-69.5F, -52.5F, -11.75F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 2
		bodyModel[191].setRotationPoint(-69.5F, -53.5F, -10.75F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[192].setRotationPoint(-69.5F, -52.5F, -3.75F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[193].setRotationPoint(-69.5F, -49.5F, -10.75F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 8, 6, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[194].setRotationPoint(-77F, -54F, -12.25F);

		bodyModel[195].addShapeBox(0.5F, 0F, 0F, 5, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[195].setRotationPoint(-75F, -52F, -17.75F);
		bodyModel[195].rotateAngleY = 0.05235988F;

		bodyModel[196].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[196].setRotationPoint(-74.5F, -55F, -16F);
		bodyModel[196].rotateAngleY = -0.05235988F;

		bodyModel[197].addShapeBox(0F, 0F, 0F, 6, 3, 9, 0F,0.3F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.3F, -0.25F, 0F, 0.3F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.3F, -0.25F, 0F); // Box 8
		bodyModel[197].setRotationPoint(-76F, -57F, -11.75F);
		bodyModel[197].rotateAngleY = -0.06981317F;
		bodyModel[197].rotateAngleZ = 0.05235988F;

		bodyModel[198].addShapeBox(0.5F, 0F, 0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[198].setRotationPoint(-76F, -54.5F, -11.75F);
		bodyModel[198].rotateAngleY = -0.06981317F;

		bodyModel[199].addShapeBox(4.5F, 0F, 0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[199].setRotationPoint(-76F, -54.5F, -11.75F);
		bodyModel[199].rotateAngleY = -0.06981317F;

		bodyModel[200].addShapeBox(4.5F, 0F, 7.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[200].setRotationPoint(-76F, -54.5F, -11.75F);
		bodyModel[200].rotateAngleY = -0.06981317F;

		bodyModel[201].addShapeBox(0.5F, 0F, 7.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[201].setRotationPoint(-76F, -54.5F, -11.75F);
		bodyModel[201].rotateAngleY = -0.06981317F;

		bodyModel[202].addShapeBox(5.2F, 0.5F, 0.8F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[202].setRotationPoint(-76F, -56F, -11.75F);
		bodyModel[202].rotateAngleY = -0.06981317F;
		bodyModel[202].rotateAngleZ = 0.05235988F;

		bodyModel[203].addShapeBox(5.2F, 0.5F, 3.3F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[203].setRotationPoint(-76F, -56F, -11.75F);
		bodyModel[203].rotateAngleY = -0.06981317F;
		bodyModel[203].rotateAngleZ = 0.05235988F;

		bodyModel[204].addShapeBox(5.25F, 0.5F, 5.7F, 1, 1, 1, 0F,0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F); // Box 15
		bodyModel[204].setRotationPoint(-76F, -57F, -11.75F);
		bodyModel[204].rotateAngleY = -0.06981317F;
		bodyModel[204].rotateAngleZ = 0.05235988F;

		bodyModel[205].addShapeBox(5.25F, 1.5F, 5.7F, 1, 1, 1, 0F,0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F); // Box 16
		bodyModel[205].setRotationPoint(-76F, -57F, -11.75F);
		bodyModel[205].rotateAngleY = -0.06981317F;
		bodyModel[205].rotateAngleZ = 0.05235988F;

		bodyModel[206].addShapeBox(5.25F, 1.5F, 7F, 1, 1, 1, 0F,0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F); // Box 17
		bodyModel[206].setRotationPoint(-76F, -57F, -11.75F);
		bodyModel[206].rotateAngleY = -0.06981317F;
		bodyModel[206].rotateAngleZ = 0.05235988F;

		bodyModel[207].addShapeBox(5.25F, 0.5F, 7F, 1, 1, 1, 0F,0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F); // Box 18
		bodyModel[207].setRotationPoint(-76F, -57F, -11.75F);
		bodyModel[207].rotateAngleY = -0.06981317F;
		bodyModel[207].rotateAngleZ = 0.05235988F;

		bodyModel[208].addShapeBox(5.2F, 0.5F, 3.3F, 1, 1, 2, 0F,0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[208].setRotationPoint(-76F, -57F, -11.75F);
		bodyModel[208].rotateAngleY = -0.06981317F;
		bodyModel[208].rotateAngleZ = 0.05235988F;

		bodyModel[209].addShapeBox(5.2F, 0.5F, 0.8F, 1, 1, 2, 0F,0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[209].setRotationPoint(-76F, -57F, -11.75F);
		bodyModel[209].rotateAngleY = -0.06981317F;
		bodyModel[209].rotateAngleZ = 0.05235988F;

		bodyModel[210].addShapeBox(5.2F, 1F, 0.8F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[210].setRotationPoint(-75F, -52F, -11F);

		bodyModel[211].addShapeBox(5.2F, 1F, 0.8F, 1, 1, 2, 0F,0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[211].setRotationPoint(-75F, -53F, -11F);

		bodyModel[212].addShapeBox(5.2F, 1F, 0.8F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[212].setRotationPoint(-75F, -52F, -8.5F);

		bodyModel[213].addShapeBox(5.2F, 1F, 0.8F, 1, 1, 2, 0F,0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[213].setRotationPoint(-75F, -53F, -8.5F);

		bodyModel[214].addShapeBox(5.25F, 1.5F, 7F, 1, 1, 1, 0F,0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F); // Box 25
		bodyModel[214].setRotationPoint(-75F, -53.5F, -12F);

		bodyModel[215].addShapeBox(5.25F, 1.5F, 7F, 1, 1, 1, 0F,0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F); // Box 27
		bodyModel[215].setRotationPoint(-75F, -52.5F, -12F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[216].setRotationPoint(-74.5F, -56F, -16F);
		bodyModel[216].rotateAngleY = -0.05235988F;

		bodyModel[217].addShapeBox(1F, 0F, 1F, 1, 8, 1, 0F,-0.37F, 0F, -0.37F, -0.37F, 0F, -0.37F, -0.37F, 0F, -0.37F, -0.37F, 0F, -0.37F, -0.37F, 0F, -0.37F, -0.37F, 0F, -0.37F, -0.37F, 0F, -0.37F, -0.37F, 0F, -0.37F); // Box 29
		bodyModel[217].setRotationPoint(-76.5F, -64F, -5F);
		bodyModel[217].rotateAngleY = -0.08726646F;
		bodyModel[217].rotateAngleZ = 0.03490659F;

		bodyModel[218].addShapeBox(5.3F, -1.3F, 1.25F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 30
		bodyModel[218].setRotationPoint(-76F, -54.5F, -11.75F);
		bodyModel[218].rotateAngleY = -0.06981317F;

		bodyModel[219].addShapeBox(5.3F, -0.3F, 3.8F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 31
		bodyModel[219].setRotationPoint(-76F, -54.5F, -11.75F);
		bodyModel[219].rotateAngleX = 0.2443461F;
		bodyModel[219].rotateAngleY = -0.06981317F;

		bodyModel[220].addShapeBox(0F, 0F, -0.3F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 32
		bodyModel[220].setRotationPoint(-69.7F, -50.9F, -9.75F);
		bodyModel[220].rotateAngleX = 0.50614548F;

		bodyModel[221].addShapeBox(0F, 0F, -0.3F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 33
		bodyModel[221].setRotationPoint(-69.7F, -51F, -6.4F);
		bodyModel[221].rotateAngleX = -0.50614548F;

		bodyModel[222].addShapeBox(0F, 0F, 0F, 8, 20, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 725
		bodyModel[222].setRotationPoint(-30.25F, -58F, -15F);
		bodyModel[222].rotateAngleY = 0.03490659F;

		bodyModel[223].addShapeBox(0F, 0F, 0F, 10, 20, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 726
		bodyModel[223].setRotationPoint(-41.25F, -58F, -15F);
		bodyModel[223].rotateAngleY = -0.03490659F;

		bodyModel[224].addShapeBox(0F, 0F, 0F, 5, 20, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 724
		bodyModel[224].setRotationPoint(-21.25F, -58F, -16F);
		bodyModel[224].rotateAngleY = 0.03490659F;

		bodyModel[225].addShapeBox(0F, 0F, 0F, 25, 1, 11, 0F,0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F); // Box 607
		bodyModel[225].setRotationPoint(-19F, -48.25F, 7F);
		bodyModel[225].rotateAngleX = 0.01745329F;

		bodyModel[226].addShapeBox(0F, 0F, 0F, 25, 10, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 608
		bodyModel[226].setRotationPoint(-19F, -48F, 7F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 2, 13, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 660
		bodyModel[227].setRotationPoint(-67F, -80F, -0.5F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 13, 3, 5, 0F,0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -5F, 0F, 0F, -4F); // Box 40
		bodyModel[228].setRotationPoint(-96F, -64F, -13F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 10, 3, 13, 0F,0F, -3F, -12F, 0F, 0F, -4F, 0F, 0F, -8F, 0F, -3F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 0F); // Box 41
		bodyModel[229].setRotationPoint(-106F, -64F, -13F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 10, 3, 13, 0F,0F, -3F, -12F, 0F, 1F, -10F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, 0F, -12F, 0F, -3F, -4F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[230].setRotationPoint(-106F, -64F, -13F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 13, 3, 11, 0F,0F, -2F, -8F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[231].setRotationPoint(-96F, -67F, -11F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 13, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -5F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 531
		bodyModel[232].setRotationPoint(-96F, -64F, 8F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 10, 3, 13, 0F,0F, -3F, 0F, 0F, 0F, -8F, 0F, 0F, -4F, 0F, -3F, -12F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, -12F); // Box 532
		bodyModel[233].setRotationPoint(-106F, -64F, 0F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 10, 3, 13, 0F,0F, -3F, 0F, 0F, 1F, 0F, 0F, 1F, -10F, 0F, -3F, -12F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -4F, 0F, 0F, -12F); // Box 533
		bodyModel[234].setRotationPoint(-106F, -64F, 0F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 13, 3, 11, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -2F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F); // Box 534
		bodyModel[235].setRotationPoint(-96F, -67F, 0F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 16, 16, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 587
		bodyModel[236].setRotationPoint(25F, -54F, 0F);
		bodyModel[236].rotateAngleY = -0.13962634F;

		bodyModel[237].addShapeBox(0F, 0F, 0F, 16, 16, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 593
		bodyModel[237].setRotationPoint(9F, -54F, 0F);
		bodyModel[237].rotateAngleY = 0.13962634F;

		bodyModel[238].addShapeBox(0F, 0F, 0F, 16, 16, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 537
		bodyModel[238].setRotationPoint(46F, -54F, -3F);
		bodyModel[238].rotateAngleY = 0.13962634F;

		bodyModel[239].addShapeBox(0F, 0F, 0F, 16, 16, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 538
		bodyModel[239].setRotationPoint(65F, -54F, -5F);
		bodyModel[239].rotateAngleY = 0.13962634F;
	}

	private void initnoseModel_1()
	{
		noseModel[0] = new ModelRendererTurbo(this, 329, 955, textureX, textureY); // Box 30
		noseModel[1] = new ModelRendererTurbo(this, 721, 955, textureX, textureY); // Box 47
		noseModel[2] = new ModelRendererTurbo(this, 881, 955, textureX, textureY); // Box 50
		noseModel[3] = new ModelRendererTurbo(this, 953, 955, textureX, textureY); // Box 51
		noseModel[4] = new ModelRendererTurbo(this, 1033, 955, textureX, textureY); // Box 52
		noseModel[5] = new ModelRendererTurbo(this, 1113, 955, textureX, textureY); // Box 53
		noseModel[6] = new ModelRendererTurbo(this, 481, 955, textureX, textureY); // Box 128
		noseModel[7] = new ModelRendererTurbo(this, 169, 955, textureX, textureY); // Box 129
		noseModel[8] = new ModelRendererTurbo(this, 225, 955, textureX, textureY); // Box 130
		noseModel[9] = new ModelRendererTurbo(this, 1185, 955, textureX, textureY); // Box 131
		noseModel[10] = new ModelRendererTurbo(this, 313, 955, textureX, textureY); // Box 132
		noseModel[11] = new ModelRendererTurbo(this, 393, 955, textureX, textureY); // Box 133
		noseModel[12] = new ModelRendererTurbo(this, 705, 955, textureX, textureY); // Box 134
		noseModel[13] = new ModelRendererTurbo(this, 785, 955, textureX, textureY); // Box 135
		noseModel[14] = new ModelRendererTurbo(this, 1017, 955, textureX, textureY); // Box 136
		noseModel[15] = new ModelRendererTurbo(this, 1097, 955, textureX, textureY); // Box 137
		noseModel[16] = new ModelRendererTurbo(this, 1217, 955, textureX, textureY); // Box 138
		noseModel[17] = new ModelRendererTurbo(this, 1241, 955, textureX, textureY); // Box 139
		noseModel[18] = new ModelRendererTurbo(this, 393, 989, textureX, textureY); // Box 577
		noseModel[19] = new ModelRendererTurbo(this, 785, 989, textureX, textureY); // Box 582
		noseModel[20] = new ModelRendererTurbo(this, 945, 989, textureX, textureY); // Box 584
		noseModel[21] = new ModelRendererTurbo(this, 1017, 989, textureX, textureY); // Box 585
		noseModel[22] = new ModelRendererTurbo(this, 1097, 989, textureX, textureY); // Box 586
		noseModel[23] = new ModelRendererTurbo(this, 1177, 989, textureX, textureY); // Box 587
		noseModel[24] = new ModelRendererTurbo(this, 545, 989, textureX, textureY); // Box 588
		noseModel[25] = new ModelRendererTurbo(this, 233, 989, textureX, textureY); // Box 589
		noseModel[26] = new ModelRendererTurbo(this, 289, 989, textureX, textureY); // Box 590
		noseModel[27] = new ModelRendererTurbo(this, 1249, 989, textureX, textureY); // Box 591
		noseModel[28] = new ModelRendererTurbo(this, 377, 989, textureX, textureY); // Box 592
		noseModel[29] = new ModelRendererTurbo(this, 457, 989, textureX, textureY); // Box 593
		noseModel[30] = new ModelRendererTurbo(this, 769, 989, textureX, textureY); // Box 594
		noseModel[31] = new ModelRendererTurbo(this, 849, 989, textureX, textureY); // Box 595
		noseModel[32] = new ModelRendererTurbo(this, 1081, 989, textureX, textureY); // Box 596
		noseModel[33] = new ModelRendererTurbo(this, 1161, 989, textureX, textureY); // Box 597
		noseModel[34] = new ModelRendererTurbo(this, 1281, 989, textureX, textureY); // Box 598
		noseModel[35] = new ModelRendererTurbo(this, 1305, 989, textureX, textureY); // Box 599

		noseModel[0].addShapeBox(0F, 0F, 0F, 23, 13, 13, 0F,0F, -4F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -2F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 30
		noseModel[0].setRotationPoint(-160F, -37F, -13F);

		noseModel[1].addShapeBox(0F, 0F, 0F, 23, 7, 13, 0F,0F, 2F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -4F, -6F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 47
		noseModel[1].setRotationPoint(-160F, -24F, -13F);

		noseModel[2].addShapeBox(0F, 0F, 0F, 23, 6, 11, 0F,0F, 4F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -6F, -6F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -6F, 0F); // Box 50
		noseModel[2].setRotationPoint(-160F, -17F, -11F);

		noseModel[3].addShapeBox(0F, 0F, 0F, 23, 7, 13, 0F,0F, -6F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 4F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); // Box 51
		noseModel[3].setRotationPoint(-160F, -44F, -13F);

		noseModel[4].addShapeBox(0F, 0F, 0F, 23, 3, 13, 0F,0F, -7F, -7F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 6F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F); // Box 52
		noseModel[4].setRotationPoint(-160F, -47F, -13F);

		noseModel[5].addShapeBox(0F, 0F, 0F, 23, 3, 11, 0F,0F, -8F, -7F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 7F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F); // Box 53
		noseModel[5].setRotationPoint(-160F, -50F, -11F);

		noseModel[6].addShapeBox(0F, 0F, 0F, 7, 7, 8, 0F,0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 128
		noseModel[6].setRotationPoint(-167F, -33F, -8F);

		noseModel[7].addShapeBox(0F, 0F, 0F, 6, 5, 6, 0F,0F, -2F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 129
		noseModel[7].setRotationPoint(-173F, -32F, -6F);

		noseModel[8].addShapeBox(0F, 0F, 0F, 7, 5, 8, 0F,0F, -2F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 130
		noseModel[8].setRotationPoint(-167F, -38F, -8F);

		noseModel[9].addShapeBox(0F, 0F, 0F, 7, 5, 8, 0F,0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 131
		noseModel[9].setRotationPoint(-167F, -26F, -8F);

		noseModel[10].addShapeBox(0F, 0F, 0F, 7, 2, 7, 0F,0F, -3F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 132
		noseModel[10].setRotationPoint(-167F, -40F, -7F);

		noseModel[11].addShapeBox(0F, 0F, 0F, 7, 2, 6, 0F,0F, -4F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 133
		noseModel[11].setRotationPoint(-167F, -42F, -6F);

		noseModel[12].addShapeBox(0F, 0F, 0F, 7, 4, 7, 0F,0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -4F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 134
		noseModel[12].setRotationPoint(-167F, -21F, -7F);

		noseModel[13].addShapeBox(0F, 0F, 0F, 6, 4, 6, 0F,0F, -5.9999F, -4.9999F, 0F, 0F, -0.9999F, 0F, 0F, 0F, 0F, -5.9999F, 0F, 0F, 1.9999F, -4.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.9999F, 0F); // Box 135
		noseModel[13].setRotationPoint(-173F, -36F, -6F);

		noseModel[14].addShapeBox(0F, 0F, 0F, 6, 4, 5, 0F,0F, -5.9999F, -3.9999F, 0F, 0.9999F, -0.9999F, 0F, 0.9999F, 0F, 0F, -5.9999F, 0F, 0F, 1.9999F, -3.9999F, 0F, -3.9999F, 0F, 0F, -3.9999F, 0F, 0F, 1.9999F, 0F); // Box 136
		noseModel[14].setRotationPoint(-173F, -36F, -5F);

		noseModel[15].addShapeBox(0F, 0F, 0F, 6, 4, 5, 0F,0F, -4.9999F, -4.9999F, 0F, 1.9999F, -2.9999F, 0F, 1.9999F, 0F, 0F, -4.9999F, 0F, 0F, 1.9999F, -3.9999F, 0F, -4.9999F, -0.9999F, 0F, -4.9999F, 0F, 0F, 1.9999F, 0F); // Box 137
		noseModel[15].setRotationPoint(-173F, -36F, -5F);

		noseModel[16].addShapeBox(0F, 0F, 0F, 6, 4, 5, 0F,0F, -6.9999F, -3.9999F, 0F, -8.9999F, 0.9999F, 0F, -8.9999F, 0F, 0F, -6.9999F, 0F, 0F, 2.9999F, -3.9999F, 0F, 8.9999F, 0F, 0F, 8.9999F, 0F, 0F, 2.9999F, 0F); // Box 138
		noseModel[16].setRotationPoint(-173F, -36F, -5F);

		noseModel[17].addShapeBox(0F, 0F, 0F, 6, 4, 5, 0F,0F, -6.9999F, -3.9999F, 0F, -12.9999F, 0F, 0F, -12.9999F, 0F, 0F, -6.9999F, 0F, 0F, 3.9999F, -4.9999F, 0F, 10.9999F, -0.9999F, 0F, 10.9999F, 0F, 0F, 3.9999F, 0F); // Box 139
		noseModel[17].setRotationPoint(-173F, -36F, -5F);

		noseModel[18].addShapeBox(0F, 0F, 0F, 23, 13, 13, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -5F); // Box 577
		noseModel[18].setRotationPoint(-160F, -37F, 0F);

		noseModel[19].addShapeBox(0F, 0F, 0F, 23, 7, 13, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -5F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -4F, -6F); // Box 582
		noseModel[19].setRotationPoint(-160F, -24F, 0F);

		noseModel[20].addShapeBox(0F, 0F, 0F, 23, 6, 11, 0F,0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -4F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -6F, -6F); // Box 584
		noseModel[20].setRotationPoint(-160F, -17F, 0F);

		noseModel[21].addShapeBox(0F, 0F, 0F, 23, 7, 13, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -6F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -5F); // Box 585
		noseModel[21].setRotationPoint(-160F, -44F, 0F);

		noseModel[22].addShapeBox(0F, 0F, 0F, 23, 3, 13, 0F,0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -7F, -7F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, -6F); // Box 586
		noseModel[22].setRotationPoint(-160F, -47F, 0F);

		noseModel[23].addShapeBox(0F, 0F, 0F, 23, 3, 11, 0F,0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -8F, -7F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, -5F); // Box 587
		noseModel[23].setRotationPoint(-160F, -50F, 0F);

		noseModel[24].addShapeBox(0F, 0F, 0F, 7, 7, 8, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F); // Box 588
		noseModel[24].setRotationPoint(-167F, -33F, 0F);

		noseModel[25].addShapeBox(0F, 0F, 0F, 6, 5, 6, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -5F); // Box 589
		noseModel[25].setRotationPoint(-173F, -32F, 0F);

		noseModel[26].addShapeBox(0F, 0F, 0F, 7, 5, 8, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -3F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F); // Box 590
		noseModel[26].setRotationPoint(-167F, -38F, 0F);

		noseModel[27].addShapeBox(0F, 0F, 0F, 7, 5, 8, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -3F); // Box 591
		noseModel[27].setRotationPoint(-167F, -26F, 0F);

		noseModel[28].addShapeBox(0F, 0F, 0F, 7, 2, 7, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, -3F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -2F); // Box 592
		noseModel[28].setRotationPoint(-167F, -40F, 0F);

		noseModel[29].addShapeBox(0F, 0F, 0F, 7, 2, 6, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -4F, -4F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -2F); // Box 593
		noseModel[29].setRotationPoint(-167F, -42F, 0F);

		noseModel[30].addShapeBox(0F, 0F, 0F, 7, 4, 7, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -2F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -4F, -3F); // Box 594
		noseModel[30].setRotationPoint(-167F, -21F, 0F);

		noseModel[31].addShapeBox(0F, 0F, 0F, 6, 4, 6, 0F,0F, -5.9999F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9999F, 0F, -5.9999F, -4.9999F, 0F, 1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.9999F, -4.9999F); // Box 595
		noseModel[31].setRotationPoint(-173F, -36F, 0F);

		noseModel[32].addShapeBox(0F, 0F, 0F, 6, 4, 5, 0F,0F, -5.9999F, 0F, 0F, 0.9999F, 0F, 0F, 0.9999F, -0.9999F, 0F, -5.9999F, -3.9999F, 0F, 1.9999F, 0F, 0F, -3.9999F, 0F, 0F, -3.9999F, 0F, 0F, 1.9999F, -3.9999F); // Box 596
		noseModel[32].setRotationPoint(-173F, -36F, 0F);

		noseModel[33].addShapeBox(0F, 0F, 0F, 6, 4, 5, 0F,0F, -4.9999F, 0F, 0F, 1.9999F, 0F, 0F, 1.9999F, -2.9999F, 0F, -4.9999F, -4.9999F, 0F, 1.9999F, 0F, 0F, -4.9999F, 0F, 0F, -4.9999F, -0.9999F, 0F, 1.9999F, -3.9999F); // Box 597
		noseModel[33].setRotationPoint(-173F, -36F, 0F);

		noseModel[34].addShapeBox(0F, 0F, 0F, 6, 4, 5, 0F,0F, -6.9999F, 0F, 0F, -8.9999F, 0F, 0F, -8.9999F, 0.9999F, 0F, -6.9999F, -3.9999F, 0F, 2.9999F, 0F, 0F, 8.9999F, 0F, 0F, 8.9999F, 0F, 0F, 2.9999F, -3.9999F); // Box 598
		noseModel[34].setRotationPoint(-173F, -36F, 0F);

		noseModel[35].addShapeBox(0F, 0F, 0F, 6, 4, 5, 0F,0F, -6.9999F, 0F, 0F, -12.9999F, 0F, 0F, -12.9999F, 0F, 0F, -6.9999F, -3.9999F, 0F, 3.9999F, 0F, 0F, 10.9999F, 0F, 0F, 10.9999F, -0.9999F, 0F, 3.9999F, -4.9999F); // Box 599
		noseModel[35].setRotationPoint(-173F, -36F, 0F);
	}

	private void inittailModel_1()
	{
		tailModel[0] = new ModelRendererTurbo(this, 1, 740, textureX, textureY); // Box 16
		tailModel[1] = new ModelRendererTurbo(this, 65, 740, textureX, textureY); // Box 17
		tailModel[2] = new ModelRendererTurbo(this, 129, 740, textureX, textureY); // Box 18
		tailModel[3] = new ModelRendererTurbo(this, 201, 740, textureX, textureY); // Box 23
		tailModel[4] = new ModelRendererTurbo(this, 273, 740, textureX, textureY); // Box 55
		tailModel[5] = new ModelRendererTurbo(this, 321, 740, textureX, textureY); // Box 61
		tailModel[6] = new ModelRendererTurbo(this, 377, 740, textureX, textureY); // Box 113
		tailModel[7] = new ModelRendererTurbo(this, 433, 740, textureX, textureY); // Box 114
		tailModel[8] = new ModelRendererTurbo(this, 545, 740, textureX, textureY); // Box 115
		tailModel[9] = new ModelRendererTurbo(this, 609, 740, textureX, textureY); // Box 116
		tailModel[10] = new ModelRendererTurbo(this, 665, 740, textureX, textureY); // Box 117
		tailModel[11] = new ModelRendererTurbo(this, 713, 740, textureX, textureY); // Box 118
		tailModel[12] = new ModelRendererTurbo(this, 817, 740, textureX, textureY); // Box 119
		tailModel[13] = new ModelRendererTurbo(this, 905, 740, textureX, textureY); // Box 120
		tailModel[14] = new ModelRendererTurbo(this, 1017, 740, textureX, textureY); // Box 121
		tailModel[15] = new ModelRendererTurbo(this, 1081, 740, textureX, textureY); // Box 122
		tailModel[16] = new ModelRendererTurbo(this, 1193, 740, textureX, textureY); // Box 123
		tailModel[17] = new ModelRendererTurbo(this, 1249, 740, textureX, textureY); // Box 124
		tailModel[18] = new ModelRendererTurbo(this, 185, 741, textureX, textureY); // Box 125
		tailModel[19] = new ModelRendererTurbo(this, 49, 741, textureX, textureY); // Box 126
		tailModel[20] = new ModelRendererTurbo(this, 113, 741, textureX, textureY); // Box 127
		tailModel[21] = new ModelRendererTurbo(this, 1, 579, textureX, textureY); // Box 140
		tailModel[22] = new ModelRendererTurbo(this, 193, 579, textureX, textureY); // Box 141
		tailModel[23] = new ModelRendererTurbo(this, 1, 579, textureX, textureY); // Box 143
		tailModel[24] = new ModelRendererTurbo(this, 121, 579, textureX, textureY); // Box 144
		tailModel[25] = new ModelRendererTurbo(this, 169, 579, textureX, textureY); // Box 145
		tailModel[26] = new ModelRendererTurbo(this, 233, 579, textureX, textureY); // Box 146
		tailModel[27] = new ModelRendererTurbo(this, 305, 579, textureX, textureY); // Box 147
		tailModel[28] = new ModelRendererTurbo(this, 537, 579, textureX, textureY); // Box 151
		tailModel[29] = new ModelRendererTurbo(this, 417, 579, textureX, textureY); // Box 152
		tailModel[30] = new ModelRendererTurbo(this, 585, 579, textureX, textureY); // Box 153
		tailModel[31] = new ModelRendererTurbo(this, 41, 579, textureX, textureY); // Box 154
		tailModel[32] = new ModelRendererTurbo(this, 609, 579, textureX, textureY); // Box 155
		tailModel[33] = new ModelRendererTurbo(this, 649, 579, textureX, textureY); // Box 156
		tailModel[34] = new ModelRendererTurbo(this, 681, 579, textureX, textureY); // Box 157
		tailModel[35] = new ModelRendererTurbo(this, 713, 579, textureX, textureY); // Box 158
		tailModel[36] = new ModelRendererTurbo(this, 1, 771, textureX, textureY); // Box 235
		tailModel[37] = new ModelRendererTurbo(this, 65, 771, textureX, textureY); // Box 236
		tailModel[38] = new ModelRendererTurbo(this, 129, 771, textureX, textureY); // Box 237
		tailModel[39] = new ModelRendererTurbo(this, 201, 771, textureX, textureY); // Box 242
		tailModel[40] = new ModelRendererTurbo(this, 273, 771, textureX, textureY); // Box 259
		tailModel[41] = new ModelRendererTurbo(this, 321, 771, textureX, textureY); // Box 264
		tailModel[42] = new ModelRendererTurbo(this, 377, 771, textureX, textureY); // Box 316
		tailModel[43] = new ModelRendererTurbo(this, 433, 771, textureX, textureY); // Box 317
		tailModel[44] = new ModelRendererTurbo(this, 545, 771, textureX, textureY); // Box 318
		tailModel[45] = new ModelRendererTurbo(this, 609, 771, textureX, textureY); // Box 319
		tailModel[46] = new ModelRendererTurbo(this, 665, 771, textureX, textureY); // Box 320
		tailModel[47] = new ModelRendererTurbo(this, 713, 771, textureX, textureY); // Box 321
		tailModel[48] = new ModelRendererTurbo(this, 817, 771, textureX, textureY); // Box 322
		tailModel[49] = new ModelRendererTurbo(this, 905, 771, textureX, textureY); // Box 323
		tailModel[50] = new ModelRendererTurbo(this, 1017, 771, textureX, textureY); // Box 324
		tailModel[51] = new ModelRendererTurbo(this, 1081, 771, textureX, textureY); // Box 325
		tailModel[52] = new ModelRendererTurbo(this, 1193, 771, textureX, textureY); // Box 326
		tailModel[53] = new ModelRendererTurbo(this, 1249, 771, textureX, textureY); // Box 327
		tailModel[54] = new ModelRendererTurbo(this, 185, 771, textureX, textureY); // Box 328
		tailModel[55] = new ModelRendererTurbo(this, 49, 771, textureX, textureY); // Box 329
		tailModel[56] = new ModelRendererTurbo(this, 113, 771, textureX, textureY); // Box 330
		tailModel[57] = new ModelRendererTurbo(this, 1, 660, textureX, textureY); // Box 331
		tailModel[58] = new ModelRendererTurbo(this, 193, 660, textureX, textureY); // Box 332
		tailModel[59] = new ModelRendererTurbo(this, 1, 660, textureX, textureY); // Box 334
		tailModel[60] = new ModelRendererTurbo(this, 121, 660, textureX, textureY); // Box 335
		tailModel[61] = new ModelRendererTurbo(this, 169, 660, textureX, textureY); // Box 336
		tailModel[62] = new ModelRendererTurbo(this, 233, 660, textureX, textureY); // Box 337
		tailModel[63] = new ModelRendererTurbo(this, 305, 660, textureX, textureY); // Box 338
		tailModel[64] = new ModelRendererTurbo(this, 329, 660, textureX, textureY); // Box 343
		tailModel[65] = new ModelRendererTurbo(this, 369, 660, textureX, textureY); // Box 344
		tailModel[66] = new ModelRendererTurbo(this, 41, 660, textureX, textureY); // Box 345
		tailModel[67] = new ModelRendererTurbo(this, 393, 660, textureX, textureY); // Box 347
		tailModel[68] = new ModelRendererTurbo(this, 425, 660, textureX, textureY); // Box 348
		tailModel[69] = new ModelRendererTurbo(this, 489, 660, textureX, textureY); // Box 349
		tailModel[70] = new ModelRendererTurbo(this, 697, 660, textureX, textureY); // Box 402
		tailModel[71] = new ModelRendererTurbo(this, 745, 660, textureX, textureY); // Box 403

		tailModel[0].addShapeBox(0F, 0F, 0F, 17, 5, 12, 0F,0F, 0F, -4F, 0F, 1F, -5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 16
		tailModel[0].setRotationPoint(92F, -66F, -12F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 17, 10, 12, 0F,0F, 0F, 0F, 0F, 2F, -2F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		tailModel[1].setRotationPoint(92F, -61F, -12F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 17, 15, 15, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, -2F, 0F, -7F, 0F, 0F, 0F, 0F); // Box 18
		tailModel[2].setRotationPoint(92F, -51F, -15F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 17, 5, 15, 0F,0F, 0F, 0F, 0F, 7F, -2F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -9F, -4F, 0F, -9F, 0F, 0F, 0F, 0F); // Box 23
		tailModel[3].setRotationPoint(92F, -36F, -15F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 17, 2, 13, 0F,0F, 0F, 0F, 0F, 9F, -2F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -8F, -7F, 0F, -8F, 0F, 0F, 0F, 0F); // Box 55
		tailModel[4].setRotationPoint(92F, -31F, -13F);

		tailModel[5].addShapeBox(0F, 0F, 0F, 17, 4, 8, 0F,0F, 0F, -5F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 61
		tailModel[5].setRotationPoint(92F, -70F, -8F);

		tailModel[6].addShapeBox(0F, 0F, 0F, 15, 12, 12, 0F,0F, 0F, -2F, 0F, 2F, -4F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -3F, -1F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 113
		tailModel[6].setRotationPoint(109F, -63F, -12F);

		tailModel[7].addShapeBox(0F, 0F, 0F, 44, 11, 11, 0F,0F, 0F, -3F, 0F, 4F, -8F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, -8F, 0F, -7F, 0F, 0F, 0F, 0F); // Box 114
		tailModel[7].setRotationPoint(124F, -65F, -11F);

		tailModel[8].addShapeBox(0F, 0F, 0F, 15, 8, 13, 0F,0F, 0F, 0F, 0F, 3F, -2F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -2F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 115
		tailModel[8].setRotationPoint(109F, -51F, -13F);

		tailModel[9].addShapeBox(0F, 0F, 0F, 15, 4, 10, 0F,0F, 0F, -3F, 0F, 2F, -5F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 116
		tailModel[9].setRotationPoint(109F, -67F, -10F);

		tailModel[10].addShapeBox(0F, 0F, 0F, 15, 3, 7, 0F,0F, 0F, -5F, 0F, 1F, -5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 117
		tailModel[10].setRotationPoint(109F, -70F, -7F);

		tailModel[11].addShapeBox(0F, 0F, 0F, 44, 4, 8, 0F,0F, 0F, -2.9999F, 0F, 0F, -4.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.9999F, -4.9999F, 0F, -3.9999F, 0F, 0F, 0F, 0F); // Box 118
		tailModel[11].setRotationPoint(124F, -69F, -8F);

		tailModel[12].addShapeBox(0F, 0F, 0F, 44, 2, 5, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		tailModel[12].setRotationPoint(124F, -71F, -5F);

		tailModel[13].addShapeBox(0F, 0F, 0F, 44, 7, 11, 0F,0F, 0F, 0F, 0F, 7F, -8F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, -8F, 0F, -12F, 0F, 0F, 0F, 0F); // Box 120
		tailModel[13].setRotationPoint(124F, -54F, -11F);

		tailModel[14].addShapeBox(0F, 0F, 0F, 15, 3, 13, 0F,0F, 0F, 0F, 0F, 4F, -2F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, -4F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 121
		tailModel[14].setRotationPoint(109F, -43F, -13F);

		tailModel[15].addShapeBox(0F, 0F, 0F, 44, 4, 11, 0F,0F, 0F, 0F, 0F, 11.9999F, -7.9999F, 0F, 11.9999F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9999F, 0F, -15.9999F, -7.9999F, 0F, -15.9999F, 0F, 0F, 0F, 0F); // Box 122
		tailModel[15].setRotationPoint(124F, -47F, -11F);

		tailModel[16].addShapeBox(0F, 0F, 0F, 15, 3, 11, 0F,0F, 0F, 0F, 0F, 3F, -2F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -4F, -6F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 123
		tailModel[16].setRotationPoint(109F, -40F, -11F);

		tailModel[17].addShapeBox(0F, 0F, 0F, 44, 2, 9, 0F,0F, 0F, 0F, 0F, 16F, -6F, 0F, 16F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -16F, -7F, 0F, -16F, 0F, 0F, 0F, 0F); // Box 124
		tailModel[17].setRotationPoint(124F, -43F, -9F);

		tailModel[18].addShapeBox(0F, 0F, 0F, 8, 10, 3, 0F,0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -2F, 0F, -6F, 0F, 0F, 0F, 0F); // Box 125
		tailModel[18].setRotationPoint(168F, -69F, -3F);

		tailModel[19].addShapeBox(0F, 0F, 0F, 8, 2, 3, 0F,0F, 0F, -0.9999F, 0F, -3.9999F, -1.9999F, 0F, -3.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.9999F, -1.9999F, 0F, 1.9999F, 0F, 0F, 0F, 0F); // Box 126
		tailModel[19].setRotationPoint(168F, -71F, -3F);

		tailModel[20].addShapeBox(0F, 0F, 0F, 8, 2, 3, 0F,0F, 0F, 0F, 0F, 5.9999F, -1.9999F, 0F, 5.9999F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9999F, 0F, -7.9999F, -1.9999F, 0F, -7.9999F, 0F, 0F, 0F, 0F); // Box 127
		tailModel[20].setRotationPoint(168F, -59F, -3F);

		tailModel[21].addShapeBox(0F, 0F, 0F, 19, 5, 74, 0F,-8F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		tailModel[21].setRotationPoint(132F, -74F, -74F);

		tailModel[22].addShapeBox(0F, 0F, 0F, 16, 5, 74, 0F,-9F, -2F, 0F, 0F, -1F, 0F, -8F, 0F, 0F, 0F, -2F, 0F, -9F, -2F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, -2F, 0F); // Box 141
		tailModel[22].setRotationPoint(124F, -74F, -74F);

		tailModel[23].addShapeBox(0F, 0F, 0F, 11, 4, 14, 0F,-3F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		tailModel[23].setRotationPoint(140F, -73F, -88F);

		tailModel[24].addShapeBox(0F, 0F, 0F, 10, 4, 13, 0F,-4F, -1F, -4F, 0F, -1F, 0F, -3F, 0F, 0F, 0F, -1F, 0F, -4F, -2F, -4F, 0F, -2F, 0F, -3F, 0F, 0F, 0F, -2F, 0F); // Box 144
		tailModel[24].setRotationPoint(133F, -73F, -87F);

		tailModel[25].addShapeBox(0F, 0F, 0F, 15, 4, 14, 0F,0F, -1F, 0F, -4F, -1F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -4F, -2F, -3F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 145
		tailModel[25].setRotationPoint(151F, -73F, -88F);

		tailModel[26].addShapeBox(0F, 0F, 0F, 12, 27, 4, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		tailModel[26].setRotationPoint(139F, -99F, -76F);

		tailModel[27].addShapeBox(0F, 0F, 0F, 7, 27, 4, 0F,-6F, 0F, -1.5F, 4F, 0F, 0F, 4F, 0F, 0F, -6F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F); // Box 147
		tailModel[27].setRotationPoint(132F, -99F, -76F);

		tailModel[28].addShapeBox(0F, 0F, 0F, 16, 11, 4, 0F,0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1.5F, -3F, 0F, -1.5F, 0F, 0F, 0F); // Box 151
		tailModel[28].setRotationPoint(151F, -71F, -76F);

		tailModel[29].addShapeBox(0F, 0F, 0F, 12, 12, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F); // Box 152
		tailModel[29].setRotationPoint(139F, -72F, -76F);

		tailModel[30].addShapeBox(0F, 0F, 0F, 7, 12, 4, 0F,0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -3F, 0F, -1.5F, 5F, 0F, 0F, 5F, 0F, 0F, -3F, 0F, -1.5F); // Box 153
		tailModel[30].setRotationPoint(132F, -72F, -76F);

		tailModel[31].addShapeBox(0F, 0F, 0F, 7, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 154
		tailModel[31].setRotationPoint(144F, -60F, -76F);

		tailModel[32].addShapeBox(0F, 0F, 0F, 13, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, -5F, -2F, -1.5F, -5F, -2F, -1.5F, 0F, 0F, -1.5F); // Box 155
		tailModel[32].setRotationPoint(151F, -60F, -76F);

		tailModel[33].addShapeBox(0F, 0F, 0F, 9, 7, 4, 0F,0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -3F, -2F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -3F, -2F, -1.5F); // Box 156
		tailModel[33].setRotationPoint(135F, -60F, -76F);

		tailModel[34].addShapeBox(0F, 0F, 0F, 8, 13, 4, 0F,-6F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -6F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		tailModel[34].setRotationPoint(143F, -112F, -76F);

		tailModel[35].addShapeBox(0F, 0F, 0F, 8, 13, 4, 0F,-6F, -3F, -1.5F, 3F, 0F, -1.5F, 3F, 0F, -1.5F, -6F, -3F, -1.5F, 0F, 0F, -1.5F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -1.5F); // Box 158
		tailModel[35].setRotationPoint(138F, -112F, -76F);

		tailModel[36].addShapeBox(0F, 0F, 0F, 17, 5, 12, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, 0F, 0F); // Box 235
		tailModel[36].setRotationPoint(92F, -66F, 0F);

		tailModel[37].addShapeBox(0F, 0F, 0F, 17, 10, 12, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 3F); // Box 236
		tailModel[37].setRotationPoint(92F, -61F, 0F);

		tailModel[38].addShapeBox(0F, 0F, 0F, 17, 15, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, -2F, 0F, 0F, 0F); // Box 237
		tailModel[38].setRotationPoint(92F, -51F, 0F);

		tailModel[39].addShapeBox(0F, 0F, 0F, 17, 5, 15, 0F,0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, -4F, 0F, 0F, -2F); // Box 242
		tailModel[39].setRotationPoint(92F, -36F, 0F);

		tailModel[40].addShapeBox(0F, 0F, 0F, 17, 2, 13, 0F,0F, 0F, 0F, 0F, 9F, 0F, 0F, 9F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, -7F, 0F, 0F, -5F); // Box 259
		tailModel[40].setRotationPoint(92F, -31F, 0F);

		tailModel[41].addShapeBox(0F, 0F, 0F, 17, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 0F); // Box 264
		tailModel[41].setRotationPoint(92F, -70F, 0F);

		tailModel[42].addShapeBox(0F, 0F, 0F, 15, 12, 12, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -1F, 0F, 0F, 1F); // Box 316
		tailModel[42].setRotationPoint(109F, -63F, 0F);

		tailModel[43].addShapeBox(0F, 0F, 0F, 44, 11, 11, 0F,0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, -8F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, -8F, 0F, 0F, 0F); // Box 317
		tailModel[43].setRotationPoint(124F, -65F, 0F);

		tailModel[44].addShapeBox(0F, 0F, 0F, 15, 8, 13, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, -2F, 0F, 0F, 0F); // Box 318
		tailModel[44].setRotationPoint(109F, -51F, 0F);

		tailModel[45].addShapeBox(0F, 0F, 0F, 15, 4, 10, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, 0F, 0F); // Box 319
		tailModel[45].setRotationPoint(109F, -67F, 0F);

		tailModel[46].addShapeBox(0F, 0F, 0F, 15, 3, 7, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, 0F, 0F); // Box 320
		tailModel[46].setRotationPoint(109F, -70F, 0F);

		tailModel[47].addShapeBox(0F, 0F, 0F, 44, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.9999F, 0F, 0F, -2.9999F, 0F, 0F, 0F, 0F, -3.9999F, 0F, 0F, -3.9999F, -4.9999F, 0F, 0F, 0F); // Box 321
		tailModel[47].setRotationPoint(124F, -69F, 0F);

		tailModel[48].addShapeBox(0F, 0F, 0F, 44, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 322
		tailModel[48].setRotationPoint(124F, -71F, 0F);

		tailModel[49].addShapeBox(0F, 0F, 0F, 44, 7, 11, 0F,0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, -8F, 0F, 0F, 0F); // Box 323
		tailModel[49].setRotationPoint(124F, -54F, 0F);

		tailModel[50].addShapeBox(0F, 0F, 0F, 15, 3, 13, 0F,0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -4F, 0F, 0F, -2F); // Box 324
		tailModel[50].setRotationPoint(109F, -43F, 0F);

		tailModel[51].addShapeBox(0F, 0F, 0F, 44, 4, 11, 0F,0F, 0F, 0F, 0F, 11.9999F, 0F, 0F, 11.9999F, -7.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15.9999F, 0F, 0F, -15.9999F, -7.9999F, 0F, 0F, -1.9999F); // Box 325
		tailModel[51].setRotationPoint(124F, -47F, 0F);

		tailModel[52].addShapeBox(0F, 0F, 0F, 15, 3, 11, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, -6F, 0F, 0F, -5F); // Box 326
		tailModel[52].setRotationPoint(109F, -40F, 0F);

		tailModel[53].addShapeBox(0F, 0F, 0F, 44, 2, 9, 0F,0F, 0F, 0F, 0F, 16F, 0F, 0F, 16F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, -16F, -7F, 0F, 0F, -4F); // Box 327
		tailModel[53].setRotationPoint(124F, -43F, 0F);

		tailModel[54].addShapeBox(0F, 0F, 0F, 8, 10, 3, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, -2F, 0F, 0F, 0F); // Box 328
		tailModel[54].setRotationPoint(168F, -69F, 0F);

		tailModel[55].addShapeBox(0F, 0F, 0F, 8, 2, 3, 0F,0F, 0F, 0F, 0F, -3.9999F, 0F, 0F, -3.9999F, -1.9999F, 0F, 0F, -0.9999F, 0F, 0F, 0F, 0F, 1.9999F, 0F, 0F, 1.9999F, -1.9999F, 0F, 0F, 0F); // Box 329
		tailModel[55].setRotationPoint(168F, -71F, 0F);

		tailModel[56].addShapeBox(0F, 0F, 0F, 8, 2, 3, 0F,0F, 0F, 0F, 0F, 5.9999F, 0F, 0F, 5.9999F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7.9999F, 0F, 0F, -7.9999F, -1.9999F, 0F, 0F, -0.9999F); // Box 330
		tailModel[56].setRotationPoint(168F, -59F, 0F);

		tailModel[57].addShapeBox(0F, 0F, 0F, 19, 5, 74, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -8F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F); // Box 331
		tailModel[57].setRotationPoint(132F, -74F, 0F);

		tailModel[58].addShapeBox(0F, 0F, 0F, 16, 5, 74, 0F,0F, -2F, 0F, -8F, 0F, 0F, 0F, -1F, 0F, -9F, -2F, 0F, 0F, -2F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, -9F, -2F, 0F); // Box 332
		tailModel[58].setRotationPoint(124F, -74F, 0F);

		tailModel[59].addShapeBox(0F, 0F, 0F, 11, 4, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, -2F, -1F); // Box 334
		tailModel[59].setRotationPoint(140F, -73F, 74F);

		tailModel[60].addShapeBox(0F, 0F, 0F, 10, 4, 13, 0F,0F, -1F, 0F, -3F, 0F, 0F, 0F, -1F, 0F, -4F, -1F, -4F, 0F, -2F, 0F, -3F, 0F, 0F, 0F, -2F, 0F, -4F, -2F, -4F); // Box 335
		tailModel[60].setRotationPoint(133F, -73F, 74F);

		tailModel[61].addShapeBox(0F, 0F, 0F, 15, 4, 14, 0F,0F, 0F, 0F, 0F, -1F, 0F, -4F, -1F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -4F, -2F, -3F, 0F, -2F, 0F); // Box 336
		tailModel[61].setRotationPoint(151F, -73F, 74F);

		tailModel[62].addShapeBox(0F, 0F, 0F, 12, 27, 4, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 337
		tailModel[62].setRotationPoint(139F, -99F, 72F);

		tailModel[63].addShapeBox(0F, 0F, 0F, 7, 27, 4, 0F,-6F, 0F, -1.5F, 4F, 0F, 0F, 4F, 0F, 0F, -6F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F); // Box 338
		tailModel[63].setRotationPoint(132F, -99F, 72F);

		tailModel[64].addShapeBox(0F, 0F, 0F, 12, 12, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F); // Box 343
		tailModel[64].setRotationPoint(139F, -72F, 72F);

		tailModel[65].addShapeBox(0F, 0F, 0F, 7, 12, 4, 0F,0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -3F, 0F, -1.5F, 5F, 0F, 0F, 5F, 0F, 0F, -3F, 0F, -1.5F); // Box 344
		tailModel[65].setRotationPoint(132F, -72F, 72F);

		tailModel[66].addShapeBox(0F, 0F, 0F, 7, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 345
		tailModel[66].setRotationPoint(144F, -60F, 72F);

		tailModel[67].addShapeBox(0F, 0F, 0F, 9, 7, 4, 0F,0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -3F, -2F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -3F, -2F, -1.5F); // Box 347
		tailModel[67].setRotationPoint(135F, -60F, 72F);

		tailModel[68].addShapeBox(0F, 0F, 0F, 8, 13, 4, 0F,-6F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -6F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 348
		tailModel[68].setRotationPoint(143F, -112F, 72F);

		tailModel[69].addShapeBox(0F, 0F, 0F, 8, 13, 4, 0F,-6F, -3F, -1.5F, 3F, 0F, -1.5F, 3F, 0F, -1.5F, -6F, -3F, -1.5F, 0F, 0F, -1.5F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -1.5F); // Box 349
		tailModel[69].setRotationPoint(138F, -112F, 72F);

		tailModel[70].addShapeBox(0F, 0F, 0F, 16, 11, 4, 0F,0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1.5F, -3F, 0F, -1.5F, 0F, 0F, 0F); // Box 402
		tailModel[70].setRotationPoint(151F, -71F, 72F);

		tailModel[71].addShapeBox(0F, 0F, 0F, 13, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, -5F, -2F, -1.5F, -5F, -2F, -1.5F, 0F, 0F, -1.5F); // Box 403
		tailModel[71].setRotationPoint(151F, -60F, 72F);
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 1, 300, textureX, textureY); // Box 62
		leftWingModel[1] = new ModelRendererTurbo(this, 137, 300, textureX, textureY); // Box 63
		leftWingModel[2] = new ModelRendererTurbo(this, 281, 300, textureX, textureY); // Box 64
		leftWingModel[3] = new ModelRendererTurbo(this, 449, 300, textureX, textureY); // Box 65
		leftWingModel[4] = new ModelRendererTurbo(this, 593, 300, textureX, textureY); // Box 66
		leftWingModel[5] = new ModelRendererTurbo(this, 1, 229, textureX, textureY); // Box 67
		leftWingModel[6] = new ModelRendererTurbo(this, 161, 229, textureX, textureY); // Box 68
		leftWingModel[7] = new ModelRendererTurbo(this, 313, 229, textureX, textureY); // Box 69
		leftWingModel[8] = new ModelRendererTurbo(this, 473, 229, textureX, textureY); // Box 70
		leftWingModel[9] = new ModelRendererTurbo(this, 625, 229, textureX, textureY); // Box 71
		leftWingModel[10] = new ModelRendererTurbo(this, 81, 146, textureX, textureY); // Box 72
		leftWingModel[11] = new ModelRendererTurbo(this, 265, 146, textureX, textureY); // Box 73
		leftWingModel[12] = new ModelRendererTurbo(this, 449, 146, textureX, textureY); // Box 74
		leftWingModel[13] = new ModelRendererTurbo(this, 633, 146, textureX, textureY); // Box 75
		leftWingModel[14] = new ModelRendererTurbo(this, 185, 146, textureX, textureY); // Box 77
		leftWingModel[15] = new ModelRendererTurbo(this, 233, 146, textureX, textureY); // Box 78
		leftWingModel[16] = new ModelRendererTurbo(this, 273, 146, textureX, textureY); // Box 79
		leftWingModel[17] = new ModelRendererTurbo(this, 369, 146, textureX, textureY); // Box 80
		leftWingModel[18] = new ModelRendererTurbo(this, 425, 146, textureX, textureY); // Box 81
		leftWingModel[19] = new ModelRendererTurbo(this, 665, 300, textureX, textureY); // Box 100
		leftWingModel[20] = new ModelRendererTurbo(this, 865, 300, textureX, textureY); // Box 101
		leftWingModel[21] = new ModelRendererTurbo(this, 1001, 300, textureX, textureY); // Box 102
		leftWingModel[22] = new ModelRendererTurbo(this, 1137, 300, textureX, textureY); // Box 103
		leftWingModel[23] = new ModelRendererTurbo(this, 1273, 300, textureX, textureY); // Box 104
		leftWingModel[24] = new ModelRendererTurbo(this, 1473, 300, textureX, textureY); // Box 105
		leftWingModel[25] = new ModelRendererTurbo(this, 1, 300, textureX, textureY); // Box 106
		leftWingModel[26] = new ModelRendererTurbo(this, 89, 300, textureX, textureY); // Box 107
		leftWingModel[27] = new ModelRendererTurbo(this, 129, 300, textureX, textureY); // Box 108
		leftWingModel[28] = new ModelRendererTurbo(this, 233, 300, textureX, textureY); // Box 109
		leftWingModel[29] = new ModelRendererTurbo(this, 25, 300, textureX, textureY); // Box 110
		leftWingModel[30] = new ModelRendererTurbo(this, 265, 300, textureX, textureY); // Box 111
		leftWingModel[31] = new ModelRendererTurbo(this, 297, 300, textureX, textureY); // Box 112
		leftWingModel[32] = new ModelRendererTurbo(this, 401, 300, textureX, textureY); // Box 113
		leftWingModel[33] = new ModelRendererTurbo(this, 113, 300, textureX, textureY); // Box 114
		leftWingModel[34] = new ModelRendererTurbo(this, 153, 300, textureX, textureY); // Box 115
		leftWingModel[35] = new ModelRendererTurbo(this, 425, 300, textureX, textureY); // Box 116
		leftWingModel[36] = new ModelRendererTurbo(this, 545, 300, textureX, textureY); // Box 117
		leftWingModel[37] = new ModelRendererTurbo(this, 449, 300, textureX, textureY); // Box 118
		leftWingModel[38] = new ModelRendererTurbo(this, 833, 300, textureX, textureY); // Box 119
		leftWingModel[39] = new ModelRendererTurbo(this, 1641, 300, textureX, textureY); // Box 120
		leftWingModel[40] = new ModelRendererTurbo(this, 969, 300, textureX, textureY); // Box 121
		leftWingModel[41] = new ModelRendererTurbo(this, 1105, 300, textureX, textureY); // Box 122
		leftWingModel[42] = new ModelRendererTurbo(this, 1241, 300, textureX, textureY); // Box 123
		leftWingModel[43] = new ModelRendererTurbo(this, 609, 300, textureX, textureY); // Box 124
		leftWingModel[44] = new ModelRendererTurbo(this, 665, 300, textureX, textureY); // Box 125
		leftWingModel[45] = new ModelRendererTurbo(this, 1441, 300, textureX, textureY); // Box 126
		leftWingModel[46] = new ModelRendererTurbo(this, 1713, 300, textureX, textureY); // Box 127
		leftWingModel[47] = new ModelRendererTurbo(this, 1753, 300, textureX, textureY); // Box 128
		leftWingModel[48] = new ModelRendererTurbo(this, 1793, 300, textureX, textureY); // Box 129
		leftWingModel[49] = new ModelRendererTurbo(this, 1841, 300, textureX, textureY); // Box 130
		leftWingModel[50] = new ModelRendererTurbo(this, 169, 300, textureX, textureY); // Box 269
		leftWingModel[51] = new ModelRendererTurbo(this, 177, 300, textureX, textureY); // Box 271
		leftWingModel[52] = new ModelRendererTurbo(this, 633, 300, textureX, textureY); // Box 273
		leftWingModel[53] = new ModelRendererTurbo(this, 689, 300, textureX, textureY); // Box 275

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 18, 13, 48, 0F,-2F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 62
		leftWingModel[0].setRotationPoint(-63F, -38F, -67F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 22, 13, 48, 0F,0F, 3F, 0F, -6F, -2F, 0F, 0F, -5F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, -6F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 63
		leftWingModel[1].setRotationPoint(-45F, -38F, -67F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 34, 8, 48, 0F,0F, 3F, 0F, -8F, -4F, 0F, 0F, -9F, 0F, -6F, 0F, 0F, 0F, -1F, 0F, -8F, -3F, 0F, 0F, 2F, 0F, -6F, 2F, 0F); // Box 64
		leftWingModel[2].setRotationPoint(-29F, -33F, -67F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 20, 13, 48, 0F,-8F, 0F, 0F, 2F, 3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -8F, -3F, 0F, 2F, -1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 65
		leftWingModel[3].setRotationPoint(-83F, -38F, -67F);

		leftWingModel[4].addShapeBox(0F, 0F, 0F, 8, 13, 48, 0F,0F, -4F, 0F, 0F, 0F, 0F, -8F, -3F, 0F, 7F, -8F, 1F, 0F, -7F, 0F, 0F, -3F, 0F, -8F, 0F, 0F, 7F, -3F, 1F); // Box 66
		leftWingModel[4].setRotationPoint(-83F, -38F, -67F);

		leftWingModel[5].addShapeBox(0F, 0F, 0F, 16, 9, 61, 0F,-1F, 0F, 0F, -4F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, 0F, 9F, 0F, 0F, 9F, 0F); // Box 67
		leftWingModel[5].setRotationPoint(-61F, -44F, -128F);

		leftWingModel[6].addShapeBox(0F, 0F, 0F, 14, 9, 61, 0F,0F, 0F, 0F, 0F, -3F, 0F, 6F, -8F, 0F, -4F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 9F, 0F, -4F, 9F, 0F); // Box 68
		leftWingModel[6].setRotationPoint(-49F, -44F, -128F);

		leftWingModel[7].addShapeBox(0F, 0F, 0F, 16, 6, 61, 0F,0F, 0F, 0F, 0F, -4F, 0F, 16F, -12F, 0F, -6F, -5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 16F, 7F, 0F, -6F, 9F, 0F); // Box 69
		leftWingModel[7].setRotationPoint(-35F, -41F, -128F);

		leftWingModel[8].addShapeBox(0F, 0F, 0F, 13, 9, 61, 0F,-1F, -2F, 0F, -4F, 0F, 0F, -5F, -3F, 0F, 6F, -6F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, -5F, 9F, 0F, 6F, 7F, 0F); // Box 70
		leftWingModel[8].setRotationPoint(-69F, -44F, -128F);

		leftWingModel[9].addShapeBox(0F, 0F, 0F, 11, 5, 61, 0F,-1F, -2F, 0F, -4F, 0F, 0F, -11F, -4F, 0F, 8F, -8F, 0F, -1F, -1F, 0F, -4F, 2F, 0F, -11F, 9F, 0F, 8F, 5F, 0F); // Box 71
		leftWingModel[9].setRotationPoint(-75F, -42F, -128F);

		leftWingModel[10].addShapeBox(0F, 0F, 0F, 11, 5, 77, 0F,-4F, 0F, 0F, -1F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F); // Box 72
		leftWingModel[10].setRotationPoint(-60F, -48F, -205F);

		leftWingModel[11].addShapeBox(0F, 0F, 0F, 11, 5, 77, 0F,-4F, -1F, 0F, -3F, 0F, 0F, -7F, -4F, 0F, 4F, -6F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, -7F, 8F, 0F, 4F, 8F, 0F); // Box 73
		leftWingModel[11].setRotationPoint(-64F, -48F, -205F);

		leftWingModel[12].addShapeBox(0F, 0F, 0F, 11, 5, 77, 0F,-7F, -2F, 0F, -1F, -1F, 0F, -9F, -6F, 0F, 4F, -8F, 0F, -7F, -2F, 0F, -1F, 0F, 0F, -9F, 8F, 0F, 4F, 5F, 0F); // Box 74
		leftWingModel[12].setRotationPoint(-70F, -48F, -205F);

		leftWingModel[13].addShapeBox(0F, 0F, 0F, 11, 5, 77, 0F,1F, 0F, 0F, -5F, -1F, 0F, 3F, -7F, 0F, 0F, -4F, 0F, 1F, 0F, 0F, -5F, 0F, 0F, 3F, 8F, 0F, 0F, 8F, 0F); // Box 75
		leftWingModel[13].setRotationPoint(-49F, -48F, -205F);

		leftWingModel[14].addShapeBox(0F, 0F, 0F, 6, 5, 17, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -2F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		leftWingModel[14].setRotationPoint(-56F, -48F, -222F);

		leftWingModel[15].addShapeBox(0F, 0F, 0F, 4, 5, 15, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -4F, -2F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		leftWingModel[15].setRotationPoint(-60F, -48F, -220F);

		leftWingModel[16].addShapeBox(0F, 0F, 0F, 3, 5, 13, 0F,-2.9999F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9999F, 0F, 0F, -1.9999F, 0F, -2.9999F, -3.9999F, 0F, 0F, -3.9999F, 0F, 0F, 0F, 0F, 0F, -1.9999F, 0F); // Box 79
		leftWingModel[16].setRotationPoint(-63F, -48F, -218F);

		leftWingModel[17].addShapeBox(0F, 0F, 0F, 7, 5, 17, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		leftWingModel[17].setRotationPoint(-50F, -48F, -222F);

		leftWingModel[18].addShapeBox(0F, 0F, 0F, 10, 5, 15, 0F,0F, 0F, 0F, -9.9999F, 0F, 0F, 0F, -2.9999F, 0F, 0F, -0.9999F, 0F, 0F, -3.9999F, 0F, -9.9999F, -3.9999F, 0F, 0F, -0.9999F, 0F, 0F, 0F, 0F); // Box 81
		leftWingModel[18].setRotationPoint(-43F, -48F, -220F);

		leftWingModel[19].addShapeBox(0F, 0F, 0F, 67, 9, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		leftWingModel[19].setRotationPoint(-129F, -34F, -66F);

		leftWingModel[20].addShapeBox(0F, 0F, 0F, 33, 9, 32, 0F,0F, 0F, 0F, 0F, 0F, -15.9999F, 0F, 0F, -15.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8.9999F, -15.9999F, 0F, -8.9999F, -15.9999F, 0F, 0F, 0F); // Box 101
		leftWingModel[20].setRotationPoint(-62F, -34F, -66F);

		leftWingModel[21].addShapeBox(0F, 0F, 0F, 33, 18, 32, 0F,0F, -8.9999F, 0F, 0F, 0F, -15.9999F, 0F, 0F, -15.9999F, 0F, -8.9999F, 0F, 0F, 0F, -9.9999F, 0F, -17.9999F, -15.9999F, 0F, -17.9999F, -15.9999F, 0F, 0F, -9.9999F); // Box 102
		leftWingModel[21].setRotationPoint(-62F, -34F, -66F);

		leftWingModel[22].addShapeBox(0F, 0F, 0F, 33, 9, 32, 0F,0F, 0F, -9.9999F, 0F, -8.9999F, -15.9999F, 0F, -8.9999F, -15.9999F, 0F, 0F, -9.9999F, 0F, 0F, 0F, 0F, 0F, -15.9999F, 0F, 0F, -15.9999F, 0F, 0F, 0F); // Box 103
		leftWingModel[22].setRotationPoint(-62F, -43F, -66F);

		leftWingModel[23].addShapeBox(0F, 0F, 0F, 67, 9, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F); // Box 104
		leftWingModel[23].setRotationPoint(-129F, -25F, -66F);

		leftWingModel[24].addShapeBox(0F, 0F, 0F, 67, 9, 32, 0F,0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		leftWingModel[24].setRotationPoint(-129F, -43F, -66F);

		leftWingModel[25].addShapeBox(0F, 0F, 0F, 4, 9, 5, 0F,0F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F); // Box 106
		leftWingModel[25].setRotationPoint(-133F, -34F, -66F);

		leftWingModel[26].addShapeBox(0F, 0F, 0F, 4, 4, 12, 0F,0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F); // Box 107
		leftWingModel[26].setRotationPoint(-133F, -43F, -56F);

		leftWingModel[27].addShapeBox(0F, 0F, 0F, 4, 10, 11, 0F,0F, -10F, -4F, 0F, -9F, 0F, 0F, 0F, -1F, 0F, -3F, 0F, 0F, 0F, -5F, 0F, 0F, -4F, 0F, -7F, -1F, 0F, -6F, 0F); // Box 108
		leftWingModel[27].setRotationPoint(-133F, -43F, -66F);

		leftWingModel[28].addShapeBox(0F, 0F, 0F, 4, 10, 11, 0F,0F, -3F, 0F, 0F, 0F, -1F, 0F, -9F, 0F, 0F, -10F, -4F, 0F, -6F, 0F, 0F, -7F, -1F, 0F, 0F, -4F, 0F, 0F, -5F); // Box 109
		leftWingModel[28].setRotationPoint(-133F, -43F, -45F);

		leftWingModel[29].addShapeBox(0F, 0F, 0F, 4, 9, 5, 0F,0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -4F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -4F); // Box 110
		leftWingModel[29].setRotationPoint(-133F, -34F, -39F);

		leftWingModel[30].addShapeBox(0F, 0F, 0F, 4, 10, 11, 0F,0F, -6F, 0F, 0F, -7F, -1F, 0F, 0F, -4F, 0F, 0F, -5F, 0F, -3F, 0F, 0F, 0F, -1F, 0F, -9F, 0F, 0F, -10F, -4F); // Box 111
		leftWingModel[30].setRotationPoint(-133F, -26F, -45F);

		leftWingModel[31].addShapeBox(0F, 0F, 0F, 4, 10, 11, 0F,0F, 0F, -5F, 0F, 0F, -4F, 0F, -7F, -1F, 0F, -6F, 0F, 0F, -10F, -4F, 0F, -9F, 0F, 0F, 0F, -1F, 0F, -3F, 0F); // Box 112
		leftWingModel[31].setRotationPoint(-133F, -26F, -66F);

		leftWingModel[32].addShapeBox(0F, 0F, 0F, 4, 4, 12, 0F,0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1F); // Box 113
		leftWingModel[32].setRotationPoint(-133F, -20F, -56F);

		leftWingModel[33].addShapeBox(0F, 0F, 0F, 5, 6, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, 0F, 0F); // Box 114
		leftWingModel[33].setRotationPoint(-134F, -46F, -53F);

		leftWingModel[34].addShapeBox(0F, 0F, 0F, 5, 6, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, 0F, 0F); // Box 115
		leftWingModel[34].setRotationPoint(-134F, -46F, -48F);

		leftWingModel[35].addShapeBox(0F, 0F, 0F, 5, 3, 6, 0F,0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 116
		leftWingModel[35].setRotationPoint(-134F, -47F, -53F);

		leftWingModel[36].addShapeBox(0F, 0F, 0F, 28, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		leftWingModel[36].setRotationPoint(-129F, -46F, -53F);

		leftWingModel[37].addShapeBox(0F, 0F, 0F, 17, 3, 6, 0F,0F, 0F, 0F, 0F, -2.9999F, 0F, 0F, -2.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		leftWingModel[37].setRotationPoint(-101F, -46F, -53F);

		leftWingModel[38].addShapeBox(0F, 0F, 0F, 17, 4, 6, 0F,0F, 0F, -1F, 1F, -3.9999F, -1F, 1F, -3.9999F, -1F, 0F, 0F, -1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 119
		leftWingModel[38].setRotationPoint(-101F, -47F, -53F);

		leftWingModel[39].addShapeBox(0F, 0F, 0F, 28, 1, 6, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		leftWingModel[39].setRotationPoint(-129F, -47F, -53F);

		leftWingModel[40].addShapeBox(0F, 0F, 0F, 17, 4, 9, 0F,0F, -3.9999F, -3.9999F, 0F, 0F, -2.9999F, 0F, 0F, -2.9999F, 0F, -3.9999F, -3.9999F, 0F, 0F, -3.9999F, 0F, -0.9999F, 0F, 0F, -0.9999F, 0F, 0F, 0F, -3.9999F); // Box 121
		leftWingModel[40].setRotationPoint(-146F, -34F, -54.5F);

		leftWingModel[41].addShapeBox(0F, 0F, 0F, 17, 3, 9, 0F,0F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -4F); // Box 122
		leftWingModel[41].setRotationPoint(-146F, -31F, -54.5F);

		leftWingModel[42].addShapeBox(0F, 0F, 0F, 17, 4, 9, 0F,0F, 0F, -3.9999F, 0F, -0.9999F, 0F, 0F, -0.9999F, 0F, 0F, 0F, -3.9999F, 0F, -3.9999F, -3.9999F, 0F, 0F, -2.9999F, 0F, 0F, -2.9999F, 0F, -3.9999F, -3.9999F); // Box 123
		leftWingModel[42].setRotationPoint(-146F, -29F, -54.5F);

		leftWingModel[43].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 124
		leftWingModel[43].setRotationPoint(-125F, -16F, -53F);

		leftWingModel[44].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 125
		leftWingModel[44].setRotationPoint(-125F, -16F, -48F);

		leftWingModel[45].addShapeBox(0F, 0F, 0F, 8, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -7F, 0F, -1F); // Box 126
		leftWingModel[45].setRotationPoint(-123F, -13F, -53F);

		leftWingModel[46].addShapeBox(0F, 0F, 0F, 13, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		leftWingModel[46].setRotationPoint(-115F, -16F, -53F);

		leftWingModel[47].addShapeBox(0F, 0F, 0F, 13, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 128
		leftWingModel[47].setRotationPoint(-115F, -13F, -53F);

		leftWingModel[48].addShapeBox(0F, 0F, 0F, 17, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.9999F, 0F, 0F, -2.9999F, 0F, 0F, 0F, 0F); // Box 129
		leftWingModel[48].setRotationPoint(-102F, -16F, -53F);

		leftWingModel[49].addShapeBox(0F, 0F, 0F, 17, 4, 6, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, -1F, 1F, -3.9999F, -1F, 1F, -3.9999F, -1F, 0F, 0F, -1F); // Box 130
		leftWingModel[49].setRotationPoint(-102F, -16F, -53F);

		leftWingModel[50].addShapeBox(0F, -12.5F, -1F, 1, 25, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 269
		leftWingModel[50].setRotationPoint(-130F, -29.5F, -50F);

		leftWingModel[51].addShapeBox(0F, -12.5F, -1F, 1, 25, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 271
		leftWingModel[51].setRotationPoint(-130F, -29.5F, -50F);
		leftWingModel[51].rotateAngleX = 1.57079633F;

		leftWingModel[52].addShapeBox(0F, -12.5F, -1F, 1, 25, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 273
		leftWingModel[52].setRotationPoint(-130F, -29.5F, -50F);
		leftWingModel[52].rotateAngleX = 0.78539816F;

		leftWingModel[53].addShapeBox(0F, -12.5F, -1F, 1, 25, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 275
		leftWingModel[53].setRotationPoint(-130F, -29.5F, -50F);
		leftWingModel[53].rotateAngleX = -0.78539816F;
	}

	private void initrightWingModel_1()
	{
		rightWingModel[0] = new ModelRendererTurbo(this, 1, 516, textureX, textureY); // Box 265
		rightWingModel[1] = new ModelRendererTurbo(this, 137, 516, textureX, textureY); // Box 266
		rightWingModel[2] = new ModelRendererTurbo(this, 281, 516, textureX, textureY); // Box 267
		rightWingModel[3] = new ModelRendererTurbo(this, 449, 516, textureX, textureY); // Box 268
		rightWingModel[4] = new ModelRendererTurbo(this, 593, 516, textureX, textureY); // Box 269
		rightWingModel[5] = new ModelRendererTurbo(this, 1, 445, textureX, textureY); // Box 270
		rightWingModel[6] = new ModelRendererTurbo(this, 161, 445, textureX, textureY); // Box 271
		rightWingModel[7] = new ModelRendererTurbo(this, 313, 445, textureX, textureY); // Box 272
		rightWingModel[8] = new ModelRendererTurbo(this, 473, 445, textureX, textureY); // Box 273
		rightWingModel[9] = new ModelRendererTurbo(this, 625, 445, textureX, textureY); // Box 274
		rightWingModel[10] = new ModelRendererTurbo(this, 1, 362, textureX, textureY); // Box 275
		rightWingModel[11] = new ModelRendererTurbo(this, 185, 362, textureX, textureY); // Box 276
		rightWingModel[12] = new ModelRendererTurbo(this, 369, 362, textureX, textureY); // Box 277
		rightWingModel[13] = new ModelRendererTurbo(this, 553, 362, textureX, textureY); // Box 278
		rightWingModel[14] = new ModelRendererTurbo(this, 1, 362, textureX, textureY); // Box 280
		rightWingModel[15] = new ModelRendererTurbo(this, 105, 362, textureX, textureY); // Box 281
		rightWingModel[16] = new ModelRendererTurbo(this, 145, 362, textureX, textureY); // Box 282
		rightWingModel[17] = new ModelRendererTurbo(this, 185, 362, textureX, textureY); // Box 283
		rightWingModel[18] = new ModelRendererTurbo(this, 289, 362, textureX, textureY); // Box 284
		rightWingModel[19] = new ModelRendererTurbo(this, 665, 516, textureX, textureY); // Box 285
		rightWingModel[20] = new ModelRendererTurbo(this, 865, 516, textureX, textureY); // Box 286
		rightWingModel[21] = new ModelRendererTurbo(this, 1001, 516, textureX, textureY); // Box 287
		rightWingModel[22] = new ModelRendererTurbo(this, 1137, 516, textureX, textureY); // Box 288
		rightWingModel[23] = new ModelRendererTurbo(this, 1273, 516, textureX, textureY); // Box 289
		rightWingModel[24] = new ModelRendererTurbo(this, 1473, 516, textureX, textureY); // Box 290
		rightWingModel[25] = new ModelRendererTurbo(this, 1, 516, textureX, textureY); // Box 291
		rightWingModel[26] = new ModelRendererTurbo(this, 89, 516, textureX, textureY); // Box 292
		rightWingModel[27] = new ModelRendererTurbo(this, 129, 516, textureX, textureY); // Box 293
		rightWingModel[28] = new ModelRendererTurbo(this, 233, 516, textureX, textureY); // Box 294
		rightWingModel[29] = new ModelRendererTurbo(this, 25, 516, textureX, textureY); // Box 295
		rightWingModel[30] = new ModelRendererTurbo(this, 265, 516, textureX, textureY); // Box 296
		rightWingModel[31] = new ModelRendererTurbo(this, 297, 516, textureX, textureY); // Box 297
		rightWingModel[32] = new ModelRendererTurbo(this, 401, 516, textureX, textureY); // Box 298
		rightWingModel[33] = new ModelRendererTurbo(this, 113, 516, textureX, textureY); // Box 299
		rightWingModel[34] = new ModelRendererTurbo(this, 153, 516, textureX, textureY); // Box 300
		rightWingModel[35] = new ModelRendererTurbo(this, 425, 516, textureX, textureY); // Box 301
		rightWingModel[36] = new ModelRendererTurbo(this, 545, 516, textureX, textureY); // Box 302
		rightWingModel[37] = new ModelRendererTurbo(this, 449, 516, textureX, textureY); // Box 303
		rightWingModel[38] = new ModelRendererTurbo(this, 833, 516, textureX, textureY); // Box 304
		rightWingModel[39] = new ModelRendererTurbo(this, 1641, 516, textureX, textureY); // Box 305
		rightWingModel[40] = new ModelRendererTurbo(this, 969, 516, textureX, textureY); // Box 306
		rightWingModel[41] = new ModelRendererTurbo(this, 1105, 516, textureX, textureY); // Box 307
		rightWingModel[42] = new ModelRendererTurbo(this, 1241, 516, textureX, textureY); // Box 308
		rightWingModel[43] = new ModelRendererTurbo(this, 609, 516, textureX, textureY); // Box 309
		rightWingModel[44] = new ModelRendererTurbo(this, 665, 516, textureX, textureY); // Box 310
		rightWingModel[45] = new ModelRendererTurbo(this, 1441, 516, textureX, textureY); // Box 311
		rightWingModel[46] = new ModelRendererTurbo(this, 1713, 516, textureX, textureY); // Box 312
		rightWingModel[47] = new ModelRendererTurbo(this, 1753, 516, textureX, textureY); // Box 313
		rightWingModel[48] = new ModelRendererTurbo(this, 1793, 516, textureX, textureY); // Box 314
		rightWingModel[49] = new ModelRendererTurbo(this, 1841, 516, textureX, textureY); // Box 315
		rightWingModel[50] = new ModelRendererTurbo(this, 1889, 516, textureX, textureY); // Box 360
		rightWingModel[51] = new ModelRendererTurbo(this, 1953, 516, textureX, textureY); // Box 361
		rightWingModel[52] = new ModelRendererTurbo(this, 169, 516, textureX, textureY); // Box 410
		rightWingModel[53] = new ModelRendererTurbo(this, 177, 516, textureX, textureY); // Box 411
		rightWingModel[54] = new ModelRendererTurbo(this, 633, 516, textureX, textureY); // Box 412
		rightWingModel[55] = new ModelRendererTurbo(this, 689, 516, textureX, textureY); // Box 413

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 18, 13, 48, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 3F, 0F, -2F, 3F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, -2F, -1F, 0F); // Box 265
		rightWingModel[0].setRotationPoint(-63F, -38F, 19F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 22, 13, 48, 0F,0F, 0F, -1F, 0F, -5F, 0F, -6F, -2F, 0F, 0F, 3F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -6F, -1F, 0F, 0F, -1F, 0F); // Box 266
		rightWingModel[1].setRotationPoint(-45F, -38F, 19F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 34, 8, 48, 0F,-6F, 0F, 0F, 0F, -9F, 0F, -8F, -4F, 0F, 0F, 3F, 0F, -6F, 2F, 0F, 0F, 2F, 0F, -8F, -3F, 0F, 0F, -1F, 0F); // Box 267
		rightWingModel[2].setRotationPoint(-29F, -33F, 19F);

		rightWingModel[3].addShapeBox(0F, 0F, 0F, 20, 13, 48, 0F,0F, -3F, 0F, 0F, 0F, 0F, 2F, 3F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 2F, -1F, 0F, -8F, -3F, 0F); // Box 268
		rightWingModel[3].setRotationPoint(-83F, -38F, 19F);

		rightWingModel[4].addShapeBox(0F, 0F, 0F, 8, 13, 48, 0F,7F, -8F, 1F, -8F, -3F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 7F, -3F, 1F, -8F, 0F, 0F, 0F, -3F, 0F, 0F, -7F, 0F); // Box 269
		rightWingModel[4].setRotationPoint(-83F, -38F, 19F);

		rightWingModel[5].addShapeBox(0F, 0F, 0F, 16, 9, 61, 0F,0F, -3F, 0F, 0F, -3F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, -4F, 0F, 0F, -1F, 0F, 0F); // Box 270
		rightWingModel[5].setRotationPoint(-61F, -44F, 67F);

		rightWingModel[6].addShapeBox(0F, 0F, 0F, 14, 9, 61, 0F,-4F, -3F, 0F, 6F, -8F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -4F, 9F, 0F, 6F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 271
		rightWingModel[6].setRotationPoint(-49F, -44F, 67F);

		rightWingModel[7].addShapeBox(0F, 0F, 0F, 16, 6, 61, 0F,-6F, -5F, 0F, 16F, -12F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -6F, 9F, 0F, 16F, 7F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 272
		rightWingModel[7].setRotationPoint(-35F, -41F, 67F);

		rightWingModel[8].addShapeBox(0F, 0F, 0F, 13, 9, 61, 0F,6F, -6F, 0F, -5F, -3F, 0F, -4F, 0F, 0F, -1F, -2F, 0F, 6F, 7F, 0F, -5F, 9F, 0F, -4F, 0F, 0F, -1F, 0F, 0F); // Box 273
		rightWingModel[8].setRotationPoint(-69F, -44F, 67F);

		rightWingModel[9].addShapeBox(0F, 0F, 0F, 11, 5, 61, 0F,8F, -8F, 0F, -11F, -4F, 0F, -4F, 0F, 0F, -1F, -2F, 0F, 8F, 5F, 0F, -11F, 9F, 0F, -4F, 2F, 0F, -1F, -1F, 0F); // Box 274
		rightWingModel[9].setRotationPoint(-75F, -42F, 67F);

		rightWingModel[10].addShapeBox(0F, 0F, 0F, 11, 5, 77, 0F,0F, -4F, 0F, 0F, -4F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, -1F, 0F, 0F, -4F, 0F, 0F); // Box 275
		rightWingModel[10].setRotationPoint(-60F, -48F, 128F);

		rightWingModel[11].addShapeBox(0F, 0F, 0F, 11, 5, 77, 0F,4F, -6F, 0F, -7F, -4F, 0F, -3F, 0F, 0F, -4F, -1F, 0F, 4F, 8F, 0F, -7F, 8F, 0F, -3F, 0F, 0F, -4F, 0F, 0F); // Box 276
		rightWingModel[11].setRotationPoint(-64F, -48F, 128F);

		rightWingModel[12].addShapeBox(0F, 0F, 0F, 11, 5, 77, 0F,4F, -8F, 0F, -9F, -6F, 0F, -1F, -1F, 0F, -7F, -2F, 0F, 4F, 5F, 0F, -9F, 8F, 0F, -1F, 0F, 0F, -7F, -2F, 0F); // Box 277
		rightWingModel[12].setRotationPoint(-70F, -48F, 128F);

		rightWingModel[13].addShapeBox(0F, 0F, 0F, 11, 5, 77, 0F,0F, -4F, 0F, 3F, -7F, 0F, -5F, -1F, 0F, 1F, 0F, 0F, 0F, 8F, 0F, 3F, 8F, 0F, -5F, 0F, 0F, 1F, 0F, 0F); // Box 278
		rightWingModel[13].setRotationPoint(-49F, -48F, 128F);

		rightWingModel[14].addShapeBox(0F, 0F, 0F, 6, 5, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, -2F); // Box 280
		rightWingModel[14].setRotationPoint(-56F, -48F, 205F);

		rightWingModel[15].addShapeBox(0F, 0F, 0F, 4, 5, 15, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, -2F); // Box 281
		rightWingModel[15].setRotationPoint(-60F, -48F, 205F);

		rightWingModel[16].addShapeBox(0F, 0F, 0F, 3, 5, 13, 0F,0F, -1.9999F, 0F, 0F, -0.9999F, 0F, 0F, 0F, 0F, -2.9999F, 0F, 0F, 0F, -1.9999F, 0F, 0F, 0F, 0F, 0F, -3.9999F, 0F, -2.9999F, -3.9999F, 0F); // Box 282
		rightWingModel[16].setRotationPoint(-63F, -48F, 205F);

		rightWingModel[17].addShapeBox(0F, 0F, 0F, 7, 5, 17, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -2F, 0F, -4F, 0F); // Box 283
		rightWingModel[17].setRotationPoint(-50F, -48F, 205F);

		rightWingModel[18].addShapeBox(0F, 0F, 0F, 10, 5, 15, 0F,0F, -0.9999F, 0F, 0F, -2.9999F, 0F, -9.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9999F, 0F, -9.9999F, -3.9999F, 0F, 0F, -3.9999F, 0F); // Box 284
		rightWingModel[18].setRotationPoint(-43F, -48F, 205F);

		rightWingModel[19].addShapeBox(0F, 0F, 0F, 67, 9, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 285
		rightWingModel[19].setRotationPoint(-129F, -34F, 34F);

		rightWingModel[20].addShapeBox(0F, 0F, 0F, 33, 9, 32, 0F,0F, 0F, 0F, 0F, 0F, -15.9999F, 0F, 0F, -15.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8.9999F, -15.9999F, 0F, -8.9999F, -15.9999F, 0F, 0F, 0F); // Box 286
		rightWingModel[20].setRotationPoint(-62F, -34F, 34F);

		rightWingModel[21].addShapeBox(0F, 0F, 0F, 33, 18, 32, 0F,0F, -8.9999F, 0F, 0F, 0F, -15.9999F, 0F, 0F, -15.9999F, 0F, -8.9999F, 0F, 0F, 0F, -9.9999F, 0F, -17.9999F, -15.9999F, 0F, -17.9999F, -15.9999F, 0F, 0F, -9.9999F); // Box 287
		rightWingModel[21].setRotationPoint(-62F, -34F, 34F);

		rightWingModel[22].addShapeBox(0F, 0F, 0F, 33, 9, 32, 0F,0F, 0F, -9.9999F, 0F, -8.9999F, -15.9999F, 0F, -8.9999F, -15.9999F, 0F, 0F, -9.9999F, 0F, 0F, 0F, 0F, 0F, -15.9999F, 0F, 0F, -15.9999F, 0F, 0F, 0F); // Box 288
		rightWingModel[22].setRotationPoint(-62F, -43F, 34F);

		rightWingModel[23].addShapeBox(0F, 0F, 0F, 67, 9, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F); // Box 289
		rightWingModel[23].setRotationPoint(-129F, -25F, 34F);

		rightWingModel[24].addShapeBox(0F, 0F, 0F, 67, 9, 32, 0F,0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 290
		rightWingModel[24].setRotationPoint(-129F, -43F, 34F);

		rightWingModel[25].addShapeBox(0F, 0F, 0F, 4, 9, 5, 0F,0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -4F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -4F); // Box 291
		rightWingModel[25].setRotationPoint(-133F, -34F, 61F);

		rightWingModel[26].addShapeBox(0F, 0F, 0F, 4, 4, 12, 0F,0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F); // Box 292
		rightWingModel[26].setRotationPoint(-133F, -43F, 44F);

		rightWingModel[27].addShapeBox(0F, 0F, 0F, 4, 10, 11, 0F,0F, -3F, 0F, 0F, 0F, -1F, 0F, -9F, 0F, 0F, -10F, -4F, 0F, -6F, 0F, 0F, -7F, -1F, 0F, 0F, -4F, 0F, 0F, -5F); // Box 293
		rightWingModel[27].setRotationPoint(-133F, -43F, 55F);

		rightWingModel[28].addShapeBox(0F, 0F, 0F, 4, 10, 11, 0F,0F, -10F, -4F, 0F, -9F, 0F, 0F, 0F, -1F, 0F, -3F, 0F, 0F, 0F, -5F, 0F, 0F, -4F, 0F, -7F, -1F, 0F, -6F, 0F); // Box 294
		rightWingModel[28].setRotationPoint(-133F, -43F, 34F);

		rightWingModel[29].addShapeBox(0F, 0F, 0F, 4, 9, 5, 0F,0F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F); // Box 295
		rightWingModel[29].setRotationPoint(-133F, -34F, 34F);

		rightWingModel[30].addShapeBox(0F, 0F, 0F, 4, 10, 11, 0F,0F, 0F, -5F, 0F, 0F, -4F, 0F, -7F, -1F, 0F, -6F, 0F, 0F, -10F, -4F, 0F, -9F, 0F, 0F, 0F, -1F, 0F, -3F, 0F); // Box 296
		rightWingModel[30].setRotationPoint(-133F, -26F, 34F);

		rightWingModel[31].addShapeBox(0F, 0F, 0F, 4, 10, 11, 0F,0F, -6F, 0F, 0F, -7F, -1F, 0F, 0F, -4F, 0F, 0F, -5F, 0F, -3F, 0F, 0F, 0F, -1F, 0F, -9F, 0F, 0F, -10F, -4F); // Box 297
		rightWingModel[31].setRotationPoint(-133F, -26F, 55F);

		rightWingModel[32].addShapeBox(0F, 0F, 0F, 4, 4, 12, 0F,0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1F); // Box 298
		rightWingModel[32].setRotationPoint(-133F, -20F, 44F);

		rightWingModel[33].addShapeBox(0F, 0F, 0F, 5, 6, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, 0F, 0F); // Box 299
		rightWingModel[33].setRotationPoint(-134F, -46F, 52F);

		rightWingModel[34].addShapeBox(0F, 0F, 0F, 5, 6, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, 0F, 0F); // Box 300
		rightWingModel[34].setRotationPoint(-134F, -46F, 47F);

		rightWingModel[35].addShapeBox(0F, 0F, 0F, 5, 3, 6, 0F,0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 301
		rightWingModel[35].setRotationPoint(-134F, -47F, 47F);

		rightWingModel[36].addShapeBox(0F, 0F, 0F, 28, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 302
		rightWingModel[36].setRotationPoint(-129F, -46F, 47F);

		rightWingModel[37].addShapeBox(0F, 0F, 0F, 17, 3, 6, 0F,0F, 0F, 0F, 0F, -2.9999F, 0F, 0F, -2.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 303
		rightWingModel[37].setRotationPoint(-101F, -46F, 47F);

		rightWingModel[38].addShapeBox(0F, 0F, 0F, 17, 4, 6, 0F,0F, 0F, -1F, 1F, -3.9999F, -1F, 1F, -3.9999F, -1F, 0F, 0F, -1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 304
		rightWingModel[38].setRotationPoint(-101F, -47F, 47F);

		rightWingModel[39].addShapeBox(0F, 0F, 0F, 28, 1, 6, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305
		rightWingModel[39].setRotationPoint(-129F, -47F, 47F);

		rightWingModel[40].addShapeBox(0F, 0F, 0F, 17, 4, 9, 0F,0F, -3.9999F, -3.9999F, 0F, 0F, -2.9999F, 0F, 0F, -2.9999F, 0F, -3.9999F, -3.9999F, 0F, 0F, -3.9999F, 0F, -0.9999F, 0F, 0F, -0.9999F, 0F, 0F, 0F, -3.9999F); // Box 306
		rightWingModel[40].setRotationPoint(-146F, -34F, 45.5F);

		rightWingModel[41].addShapeBox(0F, 0F, 0F, 17, 3, 9, 0F,0F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -4F); // Box 307
		rightWingModel[41].setRotationPoint(-146F, -31F, 45.5F);

		rightWingModel[42].addShapeBox(0F, 0F, 0F, 17, 4, 9, 0F,0F, 0F, -3.9999F, 0F, -0.9999F, 0F, 0F, -0.9999F, 0F, 0F, 0F, -3.9999F, 0F, -3.9999F, -3.9999F, 0F, 0F, -2.9999F, 0F, 0F, -2.9999F, 0F, -3.9999F, -3.9999F); // Box 308
		rightWingModel[42].setRotationPoint(-146F, -29F, 45.5F);

		rightWingModel[43].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 309
		rightWingModel[43].setRotationPoint(-125F, -16F, 52F);

		rightWingModel[44].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 310
		rightWingModel[44].setRotationPoint(-125F, -16F, 47F);

		rightWingModel[45].addShapeBox(0F, 0F, 0F, 8, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -7F, 0F, -1F); // Box 311
		rightWingModel[45].setRotationPoint(-123F, -13F, 47F);

		rightWingModel[46].addShapeBox(0F, 0F, 0F, 13, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 312
		rightWingModel[46].setRotationPoint(-115F, -16F, 47F);

		rightWingModel[47].addShapeBox(0F, 0F, 0F, 13, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 313
		rightWingModel[47].setRotationPoint(-115F, -13F, 47F);

		rightWingModel[48].addShapeBox(0F, 0F, 0F, 17, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.9999F, 0F, 0F, -2.9999F, 0F, 0F, 0F, 0F); // Box 314
		rightWingModel[48].setRotationPoint(-102F, -16F, 47F);

		rightWingModel[49].addShapeBox(0F, 0F, 0F, 17, 4, 6, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, -1F, 1F, -3.9999F, -1F, 1F, -3.9999F, -1F, 0F, 0F, -1F); // Box 315
		rightWingModel[49].setRotationPoint(-102F, -16F, 47F);

		rightWingModel[50].addShapeBox(0F, 0F, 0F, 28, 4, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 360
		rightWingModel[50].setRotationPoint(-90F, -16F, 56F);

		rightWingModel[51].addShapeBox(0F, 0F, 0F, 28, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 361
		rightWingModel[51].setRotationPoint(-90F, -12F, 56F);

		rightWingModel[52].addShapeBox(0F, -12.5F, -1F, 1, 25, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 410
		rightWingModel[52].setRotationPoint(-130F, -29.5F, 50F);
		rightWingModel[52].rotateAngleX = 1.57079633F;

		rightWingModel[53].addShapeBox(0F, -12.5F, -1F, 1, 25, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 411
		rightWingModel[53].setRotationPoint(-130F, -29.5F, 50F);

		rightWingModel[54].addShapeBox(0F, -12.5F, -1F, 1, 25, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 412
		rightWingModel[54].setRotationPoint(-130F, -29.5F, 50F);
		rightWingModel[54].rotateAngleX = -0.78539816F;

		rightWingModel[55].addShapeBox(0F, -12.5F, -1F, 1, 25, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413
		rightWingModel[55].setRotationPoint(-130F, -29.5F, 50F);
		rightWingModel[55].rotateAngleX = 0.78539816F;
	}

	private void inityawFlapModel_1()
	{
		yawFlapModel[0] = new ModelRendererTurbo(this, 329, 579, textureX, textureY); // Box 148
		yawFlapModel[1] = new ModelRendererTurbo(this, 369, 579, textureX, textureY); // Box 149
		yawFlapModel[2] = new ModelRendererTurbo(this, 489, 579, textureX, textureY); // Box 150
		yawFlapModel[3] = new ModelRendererTurbo(this, 745, 579, textureX, textureY); // Box 159
		yawFlapModel[4] = new ModelRendererTurbo(this, 521, 660, textureX, textureY); // Box 398
		yawFlapModel[5] = new ModelRendererTurbo(this, 569, 660, textureX, textureY); // Box 399
		yawFlapModel[6] = new ModelRendererTurbo(this, 617, 660, textureX, textureY); // Box 400
		yawFlapModel[7] = new ModelRendererTurbo(this, 657, 660, textureX, textureY); // Box 401

		yawFlapModel[0].addShapeBox(0F, 13F, -2F, 15, 9, 4, 0F,0F, 0F, 0F, -3F, 0F, -1.5F, -3F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 148
		yawFlapModel[0].setRotationPoint(151F, -112F, -74F);

		yawFlapModel[1].addShapeBox(0F, 22F, -2F, 16, 8, 4, 0F,0F, 0F, 0F, -1F, 0F, -1.5F, -1F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 149
		yawFlapModel[1].setRotationPoint(151F, -112F, -74F);

		yawFlapModel[2].addShapeBox(0F, 30F, -2F, 16, 11, 4, 0F,0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 150
		yawFlapModel[2].setRotationPoint(151F, -112F, -74F);

		yawFlapModel[3].addShapeBox(0F, 0F, -2F, 12, 13, 4, 0F,0F, 0F, -1.5F, -7F, -2F, -1.5F, -7F, -2F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 159
		yawFlapModel[3].setRotationPoint(151F, -112F, -74F);

		yawFlapModel[4].addShapeBox(0F, 30F, -2F, 16, 11, 4, 0F,0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 398
		yawFlapModel[4].setRotationPoint(151F, -112F, 74F);

		yawFlapModel[5].addShapeBox(0F, 22F, -2F, 16, 8, 4, 0F,0F, 0F, 0F, -1F, 0F, -1.5F, -1F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 399
		yawFlapModel[5].setRotationPoint(151F, -112F, 74F);

		yawFlapModel[6].addShapeBox(0F, 13F, -2F, 15, 9, 4, 0F,0F, 0F, 0F, -3F, 0F, -1.5F, -3F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 400
		yawFlapModel[6].setRotationPoint(151F, -112F, 74F);

		yawFlapModel[7].addShapeBox(0F, 0F, -2F, 12, 13, 4, 0F,0F, 0F, -1.5F, -7F, -2F, -1.5F, -7F, -2F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 401
		yawFlapModel[7].setRotationPoint(151F, -112F, 74F);
	}

	private void initpitchFlapLeftModel_1()
	{
		pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 377, 579, textureX, textureY); // Box 142

		pitchFlapLeftModel[0].addShapeBox(0F, 0F, 0F, 18, 5, 74, 0F,0F, -1F, 0F, -3F, -2F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, -1F, -1F, 0F, 0F, 0F, 0F); // Box 142
		pitchFlapLeftModel[0].setRotationPoint(151F, -74F, -74F);
	}

	private void initpitchFlapRightModel_1()
	{
		pitchFlapRightModel[0] = new ModelRendererTurbo(this, 377, 660, textureX, textureY); // Box 333

		pitchFlapRightModel[0].addShapeBox(0F, 0F, 0F, 18, 5, 74, 0F,0F, 0F, 0F, -1F, -3F, 0F, -3F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -3F, -2F, 0F, 0F, 0F, 0F); // Box 333
		pitchFlapRightModel[0].setRotationPoint(151F, -74F, 0F);
	}

	private void initpitchFlapLeftWingModel_1()
	{
		pitchFlapLeftWingModel[0] = new ModelRendererTurbo(this, 817, 146, textureX, textureY); // Box 76

		pitchFlapLeftWingModel[0].addShapeBox(0F, 0F, 0F, 15, 3, 77, 0F,0F, 1F, 0F, -5F, -1F, 0F, 9F, -9F, 0F, -8F, -5F, 0F, 0F, 0F, 0F, -5F, -1F, 0F, 9F, 7F, 0F, -8F, 8F, 0F); // Box 76
		pitchFlapLeftWingModel[0].setRotationPoint(-43F, -46F, -205F);
	}

	private void initpitchFlapRightWingModel_1()
	{
		pitchFlapRightWingModel[0] = new ModelRendererTurbo(this, 737, 362, textureX, textureY); // Box 279

		pitchFlapRightWingModel[0].addShapeBox(0F, 0F, 0F, 15, 3, 77, 0F,-8F, -5F, 0F, 9F, -9F, 0F, -5F, -1F, 0F, 0F, 1F, 0F, -8F, 8F, 0F, 9F, 7F, 0F, -5F, -1F, 0F, 0F, 0F, 0F); // Box 279
		pitchFlapRightWingModel[0].setRotationPoint(-43F, -46F, 128F);
	}

	private void inittailWheelModel_1()
	{
		tailWheelModel[0] = new ModelRendererTurbo(this, 0, 225, textureX, textureY); // WheelTail01
		tailWheelModel[1] = new ModelRendererTurbo(this, 849, 106, textureX, textureY); // WheelTail02
		tailWheelModel[2] = new ModelRendererTurbo(this, 881, 106, textureX, textureY); // WheelTail03
		tailWheelModel[3] = new ModelRendererTurbo(this, 913, 106, textureX, textureY); // WheelTail04
		tailWheelModel[4] = new ModelRendererTurbo(this, 937, 106, textureX, textureY); // WheelTail05
		tailWheelModel[5] = new ModelRendererTurbo(this, 961, 106, textureX, textureY); // WheelTail06
		tailWheelModel[6] = new ModelRendererTurbo(this, 985, 106, textureX, textureY); // WheelTail07

		tailWheelModel[0].addShapeBox(0F, 0F, 0F, 9, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // WheelTail01
		tailWheelModel[0].setRotationPoint(148F, -38F, -2F);

		tailWheelModel[1].addShapeBox(0F, 0F, 0F, 9, 3, 4, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // WheelTail02
		tailWheelModel[1].setRotationPoint(148F, -41F, -2F);

		tailWheelModel[2].addShapeBox(0F, 0F, 0F, 9, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // WheelTail03
		tailWheelModel[2].setRotationPoint(148F, -35F, -2F);

		tailWheelModel[3].addShapeBox(0F, 0F, 0F, 7, 5, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F); // WheelTail04
		tailWheelModel[3].setRotationPoint(147F, -40F, -3F);

		tailWheelModel[4].addShapeBox(0F, 0F, 0F, 7, 9, 3, 0F,0F, 0F, -2F, -5F, 0F, -2F, -5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, -2F); // WheelTail05
		tailWheelModel[4].setRotationPoint(144F, -49F, -3F);

		tailWheelModel[5].addShapeBox(0F, 0F, 0F, 7, 5, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F); // WheelTail06
		tailWheelModel[5].setRotationPoint(147F, -40F, 2F);

		tailWheelModel[6].addShapeBox(0F, 0F, 0F, 7, 9, 3, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -2F, 0F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F); // WheelTail07
		tailWheelModel[6].setRotationPoint(144F, -49F, 0F);
	}

	private void initleftWingWheelModel_1()
	{
		leftWingWheelModel[0] = new ModelRendererTurbo(this, 1, 98, textureX, textureY); // Box 189
		leftWingWheelModel[1] = new ModelRendererTurbo(this, 0, 234, textureX, textureY); // Box 190
		leftWingWheelModel[2] = new ModelRendererTurbo(this, 17, 98, textureX, textureY); // Box 191
		leftWingWheelModel[3] = new ModelRendererTurbo(this, 49, 98, textureX, textureY); // Box 192
		leftWingWheelModel[4] = new ModelRendererTurbo(this, 113, 98, textureX, textureY); // Box 193
		leftWingWheelModel[5] = new ModelRendererTurbo(this, 169, 98, textureX, textureY); // Box 194
		leftWingWheelModel[6] = new ModelRendererTurbo(this, 233, 98, textureX, textureY); // Box 195
		leftWingWheelModel[7] = new ModelRendererTurbo(this, 297, 98, textureX, textureY); // Box 173
		leftWingWheelModel[8] = new ModelRendererTurbo(this, 337, 98, textureX, textureY); // Box 174
		leftWingWheelModel[9] = new ModelRendererTurbo(this, 377, 98, textureX, textureY); // Box 175
		leftWingWheelModel[10] = new ModelRendererTurbo(this, 441, 98, textureX, textureY); // Box 176
		leftWingWheelModel[11] = new ModelRendererTurbo(this, 505, 98, textureX, textureY); // Box 177
		leftWingWheelModel[12] = new ModelRendererTurbo(this, 545, 98, textureX, textureY); // Box 178

		leftWingWheelModel[0].addShapeBox(0F, 0F, 0F, 2, 22, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		leftWingWheelModel[0].setRotationPoint(-82F, -19F, -47F);

		leftWingWheelModel[1].addShapeBox(0F, 0F, 0F, 21, 7, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 190
		leftWingWheelModel[1].setRotationPoint(-91.5F, -4F, -54F);

		leftWingWheelModel[2].addShapeBox(0F, 0F, 0F, 10, 15, 2, 0F,0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F); // Box 191
		leftWingWheelModel[2].setRotationPoint(-90F, -19F, -47F);

		leftWingWheelModel[3].addShapeBox(0F, 0F, 0F, 21, 7, 7, 0F,-7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 192
		leftWingWheelModel[3].setRotationPoint(-91.5F, -11F, -54F);

		leftWingWheelModel[4].addShapeBox(0F, 0F, 0F, 21, 7, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F); // Box 193
		leftWingWheelModel[4].setRotationPoint(-91.5F, 3F, -54F);

		leftWingWheelModel[5].addShapeBox(0F, 0F, 0F, 28, 4, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		leftWingWheelModel[5].setRotationPoint(-90F, -16F, -57F);

		leftWingWheelModel[6].addShapeBox(0F, 0F, 0F, 28, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		leftWingWheelModel[6].setRotationPoint(-90F, -12F, -57F);

		leftWingWheelModel[7].addShapeBox(0F, 0F, 0F, 16, 4, 1, 0F,0F, 0F, -1F, 0F, 9F, -4F, 0F, 9F, 4F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -9F, -3F, 0F, -9F, 3F, 0F, 0F, 0F); // Box 173
		leftWingWheelModel[7].setRotationPoint(-62F, -16F, -57F);

		leftWingWheelModel[8].addShapeBox(0F, 0F, 0F, 16, 4, 1, 0F,0F, 0F, 0F, 0F, 9F, -3F, 0F, 9F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, -3F, 0F, -9F, 3F, 0F, 0F, 0F); // Box 174
		leftWingWheelModel[8].setRotationPoint(-62F, -12F, -57F);

		leftWingWheelModel[9].addShapeBox(0F, 0F, 0F, 28, 4, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
		leftWingWheelModel[9].setRotationPoint(-90F, -16F, -44F);

		leftWingWheelModel[10].addShapeBox(0F, 0F, 0F, 28, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		leftWingWheelModel[10].setRotationPoint(-90F, -12F, -44F);

		leftWingWheelModel[11].addShapeBox(0F, 0F, 0F, 16, 4, 1, 0F,0F, 0F, 1F, 0F, 9F, 4F, 0F, 9F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -9F, 3F, 0F, -9F, -3F, 0F, 0F, 0F); // Box 177
		leftWingWheelModel[11].setRotationPoint(-62F, -16F, -44F);

		leftWingWheelModel[12].addShapeBox(0F, 0F, 0F, 16, 4, 1, 0F,0F, 0F, 0F, 0F, 9F, 3F, 0F, 9F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 3F, 0F, -9F, -3F, 0F, 0F, 0F); // Box 178
		leftWingWheelModel[12].setRotationPoint(-62F, -12F, -44F);
	}

	private void initrightWingWheelModel_1()
	{
		rightWingWheelModel[0] = new ModelRendererTurbo(this, 673, 98, textureX, textureY); // Box 355
		rightWingWheelModel[1] = new ModelRendererTurbo(this, 0, 234, textureX, textureY); // Box 356
		rightWingWheelModel[2] = new ModelRendererTurbo(this, 689, 98, textureX, textureY); // Box 357
		rightWingWheelModel[3] = new ModelRendererTurbo(this, 721, 98, textureX, textureY); // Box 358
		rightWingWheelModel[4] = new ModelRendererTurbo(this, 785, 98, textureX, textureY); // Box 359
		rightWingWheelModel[5] = new ModelRendererTurbo(this, 841, 98, textureX, textureY); // Box 362
		rightWingWheelModel[6] = new ModelRendererTurbo(this, 881, 98, textureX, textureY); // Box 363
		rightWingWheelModel[7] = new ModelRendererTurbo(this, 921, 98, textureX, textureY); // Box 364
		rightWingWheelModel[8] = new ModelRendererTurbo(this, 985, 98, textureX, textureY); // Box 365
		rightWingWheelModel[9] = new ModelRendererTurbo(this, 1049, 98, textureX, textureY); // Box 366
		rightWingWheelModel[10] = new ModelRendererTurbo(this, 1089, 98, textureX, textureY); // Box 367

		rightWingWheelModel[0].addShapeBox(0F, 0F, 0F, 2, 22, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 355
		rightWingWheelModel[0].setRotationPoint(-82F, -19F, 45F);

		rightWingWheelModel[1].addShapeBox(0F, 0F, 0F, 21, 7, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 356
		rightWingWheelModel[1].setRotationPoint(-91.5F, -4F, 47F);

		rightWingWheelModel[2].addShapeBox(0F, 0F, 0F, 10, 15, 2, 0F,0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F); // Box 357
		rightWingWheelModel[2].setRotationPoint(-90F, -19F, 45F);

		rightWingWheelModel[3].addShapeBox(0F, 0F, 0F, 21, 7, 7, 0F,-7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 358
		rightWingWheelModel[3].setRotationPoint(-91.5F, -11F, 47F);

		rightWingWheelModel[4].addShapeBox(0F, 0F, 0F, 21, 7, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F); // Box 359
		rightWingWheelModel[4].setRotationPoint(-91.5F, 3F, 47F);

		rightWingWheelModel[5].addShapeBox(0F, 0F, 0F, 16, 4, 1, 0F,0F, 0F, 1F, 0F, 9F, 4F, 0F, 9F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -9F, 3F, 0F, -9F, -3F, 0F, 0F, 0F); // Box 362
		rightWingWheelModel[5].setRotationPoint(-62F, -16F, 56F);

		rightWingWheelModel[6].addShapeBox(0F, 0F, 0F, 16, 4, 1, 0F,0F, 0F, 0F, 0F, 9F, 3F, 0F, 9F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 3F, 0F, -9F, -3F, 0F, 0F, 0F); // Box 363
		rightWingWheelModel[6].setRotationPoint(-62F, -12F, 56F);

		rightWingWheelModel[7].addShapeBox(0F, 0F, 0F, 28, 4, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364
		rightWingWheelModel[7].setRotationPoint(-90F, -16F, 43F);

		rightWingWheelModel[8].addShapeBox(0F, 0F, 0F, 28, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 365
		rightWingWheelModel[8].setRotationPoint(-90F, -12F, 43F);

		rightWingWheelModel[9].addShapeBox(0F, 0F, 0F, 16, 4, 1, 0F,0F, 0F, -1F, 0F, 9F, -4F, 0F, 9F, 4F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -9F, -3F, 0F, -9F, 3F, 0F, 0F, 0F); // Box 366
		rightWingWheelModel[9].setRotationPoint(-62F, -16F, 43F);

		rightWingWheelModel[10].addShapeBox(0F, 0F, 0F, 16, 4, 1, 0F,0F, 0F, 0F, 0F, 9F, -3F, 0F, 9F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, -3F, 0F, -9F, 3F, 0F, 0F, 0F); // Box 367
		rightWingWheelModel[10].setRotationPoint(-62F, -12F, 43F);
	}

	private void initskidsModel_1()
	{
		skidsModel[0] = new ModelRendererTurbo(this, 961, 371, textureX, textureY); // Import 
		skidsModel[1] = new ModelRendererTurbo(this, 969, 371, textureX, textureY); // Import 
		skidsModel[2] = new ModelRendererTurbo(this, 977, 371, textureX, textureY); // Import 
		skidsModel[3] = new ModelRendererTurbo(this, 985, 371, textureX, textureY); // Import 
		skidsModel[4] = new ModelRendererTurbo(this, 993, 371, textureX, textureY); // Import 
		skidsModel[5] = new ModelRendererTurbo(this, 1001, 371, textureX, textureY); // Import 
		skidsModel[6] = new ModelRendererTurbo(this, 1009, 371, textureX, textureY); // Import 
		skidsModel[7] = new ModelRendererTurbo(this, 1017, 371, textureX, textureY); // Import 
		skidsModel[8] = new ModelRendererTurbo(this, 1025, 371, textureX, textureY); // Import 
		skidsModel[9] = new ModelRendererTurbo(this, 1033, 371, textureX, textureY); // Import 
		skidsModel[10] = new ModelRendererTurbo(this, 1041, 371, textureX, textureY); // Import 
		skidsModel[11] = new ModelRendererTurbo(this, 1049, 371, textureX, textureY); // Import 
		skidsModel[12] = new ModelRendererTurbo(this, 1057, 371, textureX, textureY); // Import 
		skidsModel[13] = new ModelRendererTurbo(this, 1065, 371, textureX, textureY); // Import 
		skidsModel[14] = new ModelRendererTurbo(this, 1073, 371, textureX, textureY); // Import 
		skidsModel[15] = new ModelRendererTurbo(this, 1081, 371, textureX, textureY); // Import 
		skidsModel[16] = new ModelRendererTurbo(this, 1089, 371, textureX, textureY); // Box 653
		skidsModel[17] = new ModelRendererTurbo(this, 1097, 371, textureX, textureY); // Box 654
		skidsModel[18] = new ModelRendererTurbo(this, 1105, 371, textureX, textureY); // Box 655
		skidsModel[19] = new ModelRendererTurbo(this, 1113, 371, textureX, textureY); // Box 656
		skidsModel[20] = new ModelRendererTurbo(this, 1121, 371, textureX, textureY); // Box 657
		skidsModel[21] = new ModelRendererTurbo(this, 1129, 371, textureX, textureY); // Box 658
		skidsModel[22] = new ModelRendererTurbo(this, 1137, 371, textureX, textureY); // Box 659
		skidsModel[23] = new ModelRendererTurbo(this, 1145, 371, textureX, textureY); // Box 660
		skidsModel[24] = new ModelRendererTurbo(this, 1153, 371, textureX, textureY); // Box 661
		skidsModel[25] = new ModelRendererTurbo(this, 1161, 371, textureX, textureY); // Box 662
		skidsModel[26] = new ModelRendererTurbo(this, 1169, 371, textureX, textureY); // Box 663
		skidsModel[27] = new ModelRendererTurbo(this, 1177, 371, textureX, textureY); // Box 664
		skidsModel[28] = new ModelRendererTurbo(this, 1185, 371, textureX, textureY); // Box 665
		skidsModel[29] = new ModelRendererTurbo(this, 1193, 371, textureX, textureY); // Box 666
		skidsModel[30] = new ModelRendererTurbo(this, 1201, 371, textureX, textureY); // Box 667
		skidsModel[31] = new ModelRendererTurbo(this, 1209, 371, textureX, textureY); // Box 668
		skidsModel[32] = new ModelRendererTurbo(this, 1217, 371, textureX, textureY); // Box 669
		skidsModel[33] = new ModelRendererTurbo(this, 1225, 371, textureX, textureY); // Box 670
		skidsModel[34] = new ModelRendererTurbo(this, 1233, 371, textureX, textureY); // Box 671
		skidsModel[35] = new ModelRendererTurbo(this, 1241, 371, textureX, textureY); // Box 672
		skidsModel[36] = new ModelRendererTurbo(this, 1249, 371, textureX, textureY); // Box 673
		skidsModel[37] = new ModelRendererTurbo(this, 1257, 371, textureX, textureY); // Box 674
		skidsModel[38] = new ModelRendererTurbo(this, 1265, 371, textureX, textureY); // Box 675
		skidsModel[39] = new ModelRendererTurbo(this, 1273, 371, textureX, textureY); // Box 676
		skidsModel[40] = new ModelRendererTurbo(this, 1281, 371, textureX, textureY); // Box 677
		skidsModel[41] = new ModelRendererTurbo(this, 1289, 371, textureX, textureY); // Box 678
		skidsModel[42] = new ModelRendererTurbo(this, 1297, 371, textureX, textureY); // Box 679
		skidsModel[43] = new ModelRendererTurbo(this, 1305, 371, textureX, textureY); // Box 680
		skidsModel[44] = new ModelRendererTurbo(this, 1313, 371, textureX, textureY); // Box 681
		skidsModel[45] = new ModelRendererTurbo(this, 1321, 371, textureX, textureY); // Box 682
		skidsModel[46] = new ModelRendererTurbo(this, 1329, 371, textureX, textureY); // Box 683
		skidsModel[47] = new ModelRendererTurbo(this, 1337, 371, textureX, textureY); // Box 684
		skidsModel[48] = new ModelRendererTurbo(this, 1345, 371, textureX, textureY); // Box 685
		skidsModel[49] = new ModelRendererTurbo(this, 1353, 371, textureX, textureY); // Box 686
		skidsModel[50] = new ModelRendererTurbo(this, 1361, 371, textureX, textureY); // Box 687
		skidsModel[51] = new ModelRendererTurbo(this, 1369, 371, textureX, textureY); // Box 688
		skidsModel[52] = new ModelRendererTurbo(this, 1377, 371, textureX, textureY); // Box 689
		skidsModel[53] = new ModelRendererTurbo(this, 1385, 371, textureX, textureY); // Box 690
		skidsModel[54] = new ModelRendererTurbo(this, 1393, 371, textureX, textureY); // Import 
		skidsModel[55] = new ModelRendererTurbo(this, 1401, 371, textureX, textureY); // Import 
		skidsModel[56] = new ModelRendererTurbo(this, 1409, 371, textureX, textureY); // Import 
		skidsModel[57] = new ModelRendererTurbo(this, 1417, 371, textureX, textureY); // Import 
		skidsModel[58] = new ModelRendererTurbo(this, 1425, 371, textureX, textureY); // Import 
		skidsModel[59] = new ModelRendererTurbo(this, 1433, 371, textureX, textureY); // Import 
		skidsModel[60] = new ModelRendererTurbo(this, 1441, 371, textureX, textureY); // Import 
		skidsModel[61] = new ModelRendererTurbo(this, 1449, 371, textureX, textureY); // Import 
		skidsModel[62] = new ModelRendererTurbo(this, 1457, 371, textureX, textureY); // Import 
		skidsModel[63] = new ModelRendererTurbo(this, 1465, 371, textureX, textureY); // Box 702
		skidsModel[64] = new ModelRendererTurbo(this, 1473, 371, textureX, textureY); // Box 703
		skidsModel[65] = new ModelRendererTurbo(this, 1481, 371, textureX, textureY); // Box 704
		skidsModel[66] = new ModelRendererTurbo(this, 1489, 371, textureX, textureY); // Box 705
		skidsModel[67] = new ModelRendererTurbo(this, 1497, 371, textureX, textureY); // Box 706
		skidsModel[68] = new ModelRendererTurbo(this, 1505, 371, textureX, textureY); // Box 707
		skidsModel[69] = new ModelRendererTurbo(this, 1513, 371, textureX, textureY); // Box 708
		skidsModel[70] = new ModelRendererTurbo(this, 1521, 371, textureX, textureY); // Box 709
		skidsModel[71] = new ModelRendererTurbo(this, 1529, 371, textureX, textureY); // Box 710
		skidsModel[72] = new ModelRendererTurbo(this, 1537, 371, textureX, textureY); // Box 711
		skidsModel[73] = new ModelRendererTurbo(this, 1545, 371, textureX, textureY); // Box 712
		skidsModel[74] = new ModelRendererTurbo(this, 1553, 371, textureX, textureY); // Import 
		skidsModel[75] = new ModelRendererTurbo(this, 1561, 371, textureX, textureY); // Import 
		skidsModel[76] = new ModelRendererTurbo(this, 1569, 371, textureX, textureY); // Import 
		skidsModel[77] = new ModelRendererTurbo(this, 1577, 371, textureX, textureY); // Import 
		skidsModel[78] = new ModelRendererTurbo(this, 1585, 371, textureX, textureY); // Import 
		skidsModel[79] = new ModelRendererTurbo(this, 1593, 371, textureX, textureY); // Import 
		skidsModel[80] = new ModelRendererTurbo(this, 1601, 371, textureX, textureY); // Import 
		skidsModel[81] = new ModelRendererTurbo(this, 1609, 371, textureX, textureY); // Import 
		skidsModel[82] = new ModelRendererTurbo(this, 1617, 371, textureX, textureY); // Import 
		skidsModel[83] = new ModelRendererTurbo(this, 1625, 371, textureX, textureY); // Import 
		skidsModel[84] = new ModelRendererTurbo(this, 1633, 371, textureX, textureY); // Import 
		skidsModel[85] = new ModelRendererTurbo(this, 1641, 371, textureX, textureY); // Import 
		skidsModel[86] = new ModelRendererTurbo(this, 1649, 371, textureX, textureY); // Import 
		skidsModel[87] = new ModelRendererTurbo(this, 1657, 371, textureX, textureY); // Import 
		skidsModel[88] = new ModelRendererTurbo(this, 1665, 371, textureX, textureY); // Import 
		skidsModel[89] = new ModelRendererTurbo(this, 1673, 371, textureX, textureY); // Import 
		skidsModel[90] = new ModelRendererTurbo(this, 1681, 371, textureX, textureY); // Import 
		skidsModel[91] = new ModelRendererTurbo(this, 1689, 371, textureX, textureY); // Import 
		skidsModel[92] = new ModelRendererTurbo(this, 1697, 371, textureX, textureY); // Import 
		skidsModel[93] = new ModelRendererTurbo(this, 1705, 371, textureX, textureY); // Import 
		skidsModel[94] = new ModelRendererTurbo(this, 1713, 371, textureX, textureY); // Import 
		skidsModel[95] = new ModelRendererTurbo(this, 1721, 371, textureX, textureY); // Import 
		skidsModel[96] = new ModelRendererTurbo(this, 1729, 371, textureX, textureY); // Import 
		skidsModel[97] = new ModelRendererTurbo(this, 1737, 371, textureX, textureY); // Import 
		skidsModel[98] = new ModelRendererTurbo(this, 1745, 371, textureX, textureY); // Import 
		skidsModel[99] = new ModelRendererTurbo(this, 1753, 371, textureX, textureY); // Import 
		skidsModel[100] = new ModelRendererTurbo(this, 1761, 371, textureX, textureY); // Import 
		skidsModel[101] = new ModelRendererTurbo(this, 1769, 371, textureX, textureY); // Import 
		skidsModel[102] = new ModelRendererTurbo(this, 1777, 371, textureX, textureY); // Import 
		skidsModel[103] = new ModelRendererTurbo(this, 1785, 371, textureX, textureY); // Import 
		skidsModel[104] = new ModelRendererTurbo(this, 1793, 371, textureX, textureY); // Import 
		skidsModel[105] = new ModelRendererTurbo(this, 1801, 371, textureX, textureY); // Import 
		skidsModel[106] = new ModelRendererTurbo(this, 1809, 371, textureX, textureY); // Import 
		skidsModel[107] = new ModelRendererTurbo(this, 1817, 371, textureX, textureY); // Import 
		skidsModel[108] = new ModelRendererTurbo(this, 1825, 371, textureX, textureY); // Import 
		skidsModel[109] = new ModelRendererTurbo(this, 1833, 371, textureX, textureY); // Box 836
		skidsModel[110] = new ModelRendererTurbo(this, 1841, 371, textureX, textureY); // Box 837
		skidsModel[111] = new ModelRendererTurbo(this, 1849, 371, textureX, textureY); // Box 838
		skidsModel[112] = new ModelRendererTurbo(this, 1857, 371, textureX, textureY); // Box 839
		skidsModel[113] = new ModelRendererTurbo(this, 1865, 371, textureX, textureY); // Box 840
		skidsModel[114] = new ModelRendererTurbo(this, 1873, 371, textureX, textureY); // Box 841
		skidsModel[115] = new ModelRendererTurbo(this, 1881, 371, textureX, textureY); // Box 842
		skidsModel[116] = new ModelRendererTurbo(this, 1889, 371, textureX, textureY); // Box 843
		skidsModel[117] = new ModelRendererTurbo(this, 1897, 371, textureX, textureY); // Box 844
		skidsModel[118] = new ModelRendererTurbo(this, 1905, 371, textureX, textureY); // Box 845
		skidsModel[119] = new ModelRendererTurbo(this, 1913, 371, textureX, textureY); // Box 846
		skidsModel[120] = new ModelRendererTurbo(this, 1921, 371, textureX, textureY); // Box 888
		skidsModel[121] = new ModelRendererTurbo(this, 1929, 371, textureX, textureY); // Box 889
		skidsModel[122] = new ModelRendererTurbo(this, 1937, 371, textureX, textureY); // Box 890
		skidsModel[123] = new ModelRendererTurbo(this, 1945, 371, textureX, textureY); // Box 891
		skidsModel[124] = new ModelRendererTurbo(this, 1953, 371, textureX, textureY); // Box 892
		skidsModel[125] = new ModelRendererTurbo(this, 1961, 371, textureX, textureY); // Box 893
		skidsModel[126] = new ModelRendererTurbo(this, 1969, 371, textureX, textureY); // Box 894
		skidsModel[127] = new ModelRendererTurbo(this, 1977, 371, textureX, textureY); // Box 895
		skidsModel[128] = new ModelRendererTurbo(this, 1985, 371, textureX, textureY); // Box 896
		skidsModel[129] = new ModelRendererTurbo(this, 1993, 371, textureX, textureY); // Box 897
		skidsModel[130] = new ModelRendererTurbo(this, 2001, 371, textureX, textureY); // Box 898
		skidsModel[131] = new ModelRendererTurbo(this, 2009, 371, textureX, textureY); // Box 924
		skidsModel[132] = new ModelRendererTurbo(this, 2017, 371, textureX, textureY); // Box 925
		skidsModel[133] = new ModelRendererTurbo(this, 2025, 371, textureX, textureY); // Box 926
		skidsModel[134] = new ModelRendererTurbo(this, 2033, 371, textureX, textureY); // Box 927
		skidsModel[135] = new ModelRendererTurbo(this, 2041, 371, textureX, textureY); // Box 928
		skidsModel[136] = new ModelRendererTurbo(this, 961, 379, textureX, textureY); // Box 929
		skidsModel[137] = new ModelRendererTurbo(this, 969, 379, textureX, textureY); // Box 930
		skidsModel[138] = new ModelRendererTurbo(this, 977, 379, textureX, textureY); // Box 931
		skidsModel[139] = new ModelRendererTurbo(this, 985, 379, textureX, textureY); // Box 932
		skidsModel[140] = new ModelRendererTurbo(this, 993, 379, textureX, textureY); // Box 933
		skidsModel[141] = new ModelRendererTurbo(this, 1001, 379, textureX, textureY); // Box 934
		skidsModel[142] = new ModelRendererTurbo(this, 1009, 379, textureX, textureY); // Box 935
		skidsModel[143] = new ModelRendererTurbo(this, 1017, 379, textureX, textureY); // Box 936
		skidsModel[144] = new ModelRendererTurbo(this, 1025, 379, textureX, textureY); // Box 937
		skidsModel[145] = new ModelRendererTurbo(this, 1033, 379, textureX, textureY); // Box 938
		skidsModel[146] = new ModelRendererTurbo(this, 1041, 379, textureX, textureY); // Box 939
		skidsModel[147] = new ModelRendererTurbo(this, 1049, 379, textureX, textureY); // Box 940
		skidsModel[148] = new ModelRendererTurbo(this, 1057, 379, textureX, textureY); // Box 941
		skidsModel[149] = new ModelRendererTurbo(this, 1065, 379, textureX, textureY); // Box 942
		skidsModel[150] = new ModelRendererTurbo(this, 1073, 379, textureX, textureY); // Box 943
		skidsModel[151] = new ModelRendererTurbo(this, 1081, 379, textureX, textureY); // Box 944
		skidsModel[152] = new ModelRendererTurbo(this, 1089, 379, textureX, textureY); // Box 945
		skidsModel[153] = new ModelRendererTurbo(this, 1097, 379, textureX, textureY); // Box 946
		skidsModel[154] = new ModelRendererTurbo(this, 1105, 379, textureX, textureY); // Box 947
		skidsModel[155] = new ModelRendererTurbo(this, 1113, 379, textureX, textureY); // Box 948
		skidsModel[156] = new ModelRendererTurbo(this, 1121, 379, textureX, textureY); // Box 949
		skidsModel[157] = new ModelRendererTurbo(this, 1129, 379, textureX, textureY); // Box 950
		skidsModel[158] = new ModelRendererTurbo(this, 1137, 379, textureX, textureY); // Box 951
		skidsModel[159] = new ModelRendererTurbo(this, 1145, 379, textureX, textureY); // Box 952
		skidsModel[160] = new ModelRendererTurbo(this, 1153, 379, textureX, textureY); // Box 953
		skidsModel[161] = new ModelRendererTurbo(this, 1161, 379, textureX, textureY); // Box 954
		skidsModel[162] = new ModelRendererTurbo(this, 1169, 379, textureX, textureY); // Box 955
		skidsModel[163] = new ModelRendererTurbo(this, 1177, 379, textureX, textureY); // Box 956
		skidsModel[164] = new ModelRendererTurbo(this, 1185, 379, textureX, textureY); // Box 957
		skidsModel[165] = new ModelRendererTurbo(this, 1193, 379, textureX, textureY); // Box 814
		skidsModel[166] = new ModelRendererTurbo(this, 1201, 379, textureX, textureY); // Box 815
		skidsModel[167] = new ModelRendererTurbo(this, 1209, 379, textureX, textureY); // Box 816
		skidsModel[168] = new ModelRendererTurbo(this, 1217, 379, textureX, textureY); // Box 817
		skidsModel[169] = new ModelRendererTurbo(this, 1225, 379, textureX, textureY); // Box 818
		skidsModel[170] = new ModelRendererTurbo(this, 1233, 379, textureX, textureY); // Box 819
		skidsModel[171] = new ModelRendererTurbo(this, 1241, 379, textureX, textureY); // Box 820
		skidsModel[172] = new ModelRendererTurbo(this, 1249, 379, textureX, textureY); // Box 821
		skidsModel[173] = new ModelRendererTurbo(this, 1257, 379, textureX, textureY); // Box 822
		skidsModel[174] = new ModelRendererTurbo(this, 1265, 379, textureX, textureY); // Box 823
		skidsModel[175] = new ModelRendererTurbo(this, 1273, 379, textureX, textureY); // Box 824
		skidsModel[176] = new ModelRendererTurbo(this, 1281, 379, textureX, textureY); // Box 825
		skidsModel[177] = new ModelRendererTurbo(this, 1289, 379, textureX, textureY); // Box 826
		skidsModel[178] = new ModelRendererTurbo(this, 1297, 379, textureX, textureY); // Box 827
		skidsModel[179] = new ModelRendererTurbo(this, 1305, 379, textureX, textureY); // Box 828
		skidsModel[180] = new ModelRendererTurbo(this, 1313, 379, textureX, textureY); // Box 829
		skidsModel[181] = new ModelRendererTurbo(this, 1321, 379, textureX, textureY); // Box 830
		skidsModel[182] = new ModelRendererTurbo(this, 1329, 379, textureX, textureY); // Box 831
		skidsModel[183] = new ModelRendererTurbo(this, 1337, 379, textureX, textureY); // Box 832
		skidsModel[184] = new ModelRendererTurbo(this, 1345, 379, textureX, textureY); // Box 833
		skidsModel[185] = new ModelRendererTurbo(this, 1353, 379, textureX, textureY); // Box 834
		skidsModel[186] = new ModelRendererTurbo(this, 1361, 379, textureX, textureY); // Box 835
		skidsModel[187] = new ModelRendererTurbo(this, 1369, 379, textureX, textureY); // Box 983
		skidsModel[188] = new ModelRendererTurbo(this, 1377, 379, textureX, textureY); // Box 984
		skidsModel[189] = new ModelRendererTurbo(this, 1385, 379, textureX, textureY); // Box 985
		skidsModel[190] = new ModelRendererTurbo(this, 1393, 379, textureX, textureY); // Box 986
		skidsModel[191] = new ModelRendererTurbo(this, 1401, 379, textureX, textureY); // Box 987
		skidsModel[192] = new ModelRendererTurbo(this, 1409, 379, textureX, textureY); // Box 988
		skidsModel[193] = new ModelRendererTurbo(this, 1417, 379, textureX, textureY); // Box 989
		skidsModel[194] = new ModelRendererTurbo(this, 1425, 379, textureX, textureY); // Box 990
		skidsModel[195] = new ModelRendererTurbo(this, 1433, 379, textureX, textureY); // Box 991
		skidsModel[196] = new ModelRendererTurbo(this, 1441, 379, textureX, textureY); // Box 992
		skidsModel[197] = new ModelRendererTurbo(this, 1449, 379, textureX, textureY); // Box 993
		skidsModel[198] = new ModelRendererTurbo(this, 1457, 379, textureX, textureY); // Box 994
		skidsModel[199] = new ModelRendererTurbo(this, 1465, 379, textureX, textureY); // Box 995
		skidsModel[200] = new ModelRendererTurbo(this, 1473, 379, textureX, textureY); // Box 996
		skidsModel[201] = new ModelRendererTurbo(this, 1481, 379, textureX, textureY); // Box 997
		skidsModel[202] = new ModelRendererTurbo(this, 1489, 379, textureX, textureY); // Box 998
		skidsModel[203] = new ModelRendererTurbo(this, 1497, 379, textureX, textureY); // Box 999
		skidsModel[204] = new ModelRendererTurbo(this, 1505, 379, textureX, textureY); // Box 1000
		skidsModel[205] = new ModelRendererTurbo(this, 1513, 379, textureX, textureY); // Box 1001
		skidsModel[206] = new ModelRendererTurbo(this, 1521, 379, textureX, textureY); // Box 1002
		skidsModel[207] = new ModelRendererTurbo(this, 1529, 379, textureX, textureY); // Box 1003
		skidsModel[208] = new ModelRendererTurbo(this, 1537, 379, textureX, textureY); // Box 1004
		skidsModel[209] = new ModelRendererTurbo(this, 1545, 379, textureX, textureY); // Box 1005
		skidsModel[210] = new ModelRendererTurbo(this, 1553, 379, textureX, textureY); // Box 1006
		skidsModel[211] = new ModelRendererTurbo(this, 1561, 379, textureX, textureY); // Box 1007
		skidsModel[212] = new ModelRendererTurbo(this, 1569, 379, textureX, textureY); // Box 634
		skidsModel[213] = new ModelRendererTurbo(this, 1577, 379, textureX, textureY); // Box 635
		skidsModel[214] = new ModelRendererTurbo(this, 1585, 379, textureX, textureY); // Box 636
		skidsModel[215] = new ModelRendererTurbo(this, 1593, 379, textureX, textureY); // Box 637
		skidsModel[216] = new ModelRendererTurbo(this, 1601, 379, textureX, textureY); // Box 638
		skidsModel[217] = new ModelRendererTurbo(this, 1609, 379, textureX, textureY); // Box 639
		skidsModel[218] = new ModelRendererTurbo(this, 1617, 379, textureX, textureY); // Box 640
		skidsModel[219] = new ModelRendererTurbo(this, 1625, 379, textureX, textureY); // Box 641
		skidsModel[220] = new ModelRendererTurbo(this, 1633, 379, textureX, textureY); // Box 642
		skidsModel[221] = new ModelRendererTurbo(this, 1641, 379, textureX, textureY); // Box 643
		skidsModel[222] = new ModelRendererTurbo(this, 1649, 379, textureX, textureY); // Box 644
		skidsModel[223] = new ModelRendererTurbo(this, 1657, 379, textureX, textureY); // Box 645
		skidsModel[224] = new ModelRendererTurbo(this, 1665, 379, textureX, textureY); // Box 647
		skidsModel[225] = new ModelRendererTurbo(this, 1673, 379, textureX, textureY); // Box 648
		skidsModel[226] = new ModelRendererTurbo(this, 1681, 379, textureX, textureY); // Box 649
		skidsModel[227] = new ModelRendererTurbo(this, 1689, 379, textureX, textureY); // Box 650
		skidsModel[228] = new ModelRendererTurbo(this, 1697, 379, textureX, textureY); // Box 651
		skidsModel[229] = new ModelRendererTurbo(this, 1705, 379, textureX, textureY); // Box 652
		skidsModel[230] = new ModelRendererTurbo(this, 1713, 379, textureX, textureY); // Box 772
		skidsModel[231] = new ModelRendererTurbo(this, 1721, 379, textureX, textureY); // Box 773
		skidsModel[232] = new ModelRendererTurbo(this, 1729, 379, textureX, textureY); // Box 774
		skidsModel[233] = new ModelRendererTurbo(this, 1737, 379, textureX, textureY); // Box 775
		skidsModel[234] = new ModelRendererTurbo(this, 1745, 379, textureX, textureY); // Box 776
		skidsModel[235] = new ModelRendererTurbo(this, 1753, 379, textureX, textureY); // Box 777
		skidsModel[236] = new ModelRendererTurbo(this, 1761, 379, textureX, textureY); // Box 778
		skidsModel[237] = new ModelRendererTurbo(this, 1769, 379, textureX, textureY); // Box 779
		skidsModel[238] = new ModelRendererTurbo(this, 1777, 379, textureX, textureY); // Box 780
		skidsModel[239] = new ModelRendererTurbo(this, 1785, 379, textureX, textureY); // Box 781
		skidsModel[240] = new ModelRendererTurbo(this, 1793, 379, textureX, textureY); // Box 782
		skidsModel[241] = new ModelRendererTurbo(this, 1801, 379, textureX, textureY); // Box 783
		skidsModel[242] = new ModelRendererTurbo(this, 1809, 379, textureX, textureY); // Box 784
		skidsModel[243] = new ModelRendererTurbo(this, 1817, 379, textureX, textureY); // Box 785
		skidsModel[244] = new ModelRendererTurbo(this, 1825, 379, textureX, textureY); // Box 786
		skidsModel[245] = new ModelRendererTurbo(this, 1833, 379, textureX, textureY); // Box 787
		skidsModel[246] = new ModelRendererTurbo(this, 1841, 379, textureX, textureY); // Box 788
		skidsModel[247] = new ModelRendererTurbo(this, 1849, 379, textureX, textureY); // Box 789
		skidsModel[248] = new ModelRendererTurbo(this, 1857, 379, textureX, textureY); // Box 790
		skidsModel[249] = new ModelRendererTurbo(this, 1865, 379, textureX, textureY); // Box 791
		skidsModel[250] = new ModelRendererTurbo(this, 1873, 379, textureX, textureY); // Box 792
		skidsModel[251] = new ModelRendererTurbo(this, 1881, 379, textureX, textureY); // Box 793
		skidsModel[252] = new ModelRendererTurbo(this, 1889, 379, textureX, textureY); // Box 794
		skidsModel[253] = new ModelRendererTurbo(this, 1897, 379, textureX, textureY); // Box 877
		skidsModel[254] = new ModelRendererTurbo(this, 1905, 379, textureX, textureY); // Box 878
		skidsModel[255] = new ModelRendererTurbo(this, 1913, 379, textureX, textureY); // Box 879
		skidsModel[256] = new ModelRendererTurbo(this, 1921, 379, textureX, textureY); // Box 880
		skidsModel[257] = new ModelRendererTurbo(this, 1929, 379, textureX, textureY); // Box 881
		skidsModel[258] = new ModelRendererTurbo(this, 1937, 379, textureX, textureY); // Box 882
		skidsModel[259] = new ModelRendererTurbo(this, 1945, 379, textureX, textureY); // Box 883
		skidsModel[260] = new ModelRendererTurbo(this, 1953, 379, textureX, textureY); // Box 884
		skidsModel[261] = new ModelRendererTurbo(this, 1961, 379, textureX, textureY); // Box 885
		skidsModel[262] = new ModelRendererTurbo(this, 1969, 379, textureX, textureY); // Box 886
		skidsModel[263] = new ModelRendererTurbo(this, 1977, 379, textureX, textureY); // Box 887
		skidsModel[264] = new ModelRendererTurbo(this, 1985, 379, textureX, textureY); // Box 1061
		skidsModel[265] = new ModelRendererTurbo(this, 1993, 379, textureX, textureY); // Box 1062
		skidsModel[266] = new ModelRendererTurbo(this, 2001, 379, textureX, textureY); // Box 1063
		skidsModel[267] = new ModelRendererTurbo(this, 2009, 379, textureX, textureY); // Box 1064
		skidsModel[268] = new ModelRendererTurbo(this, 2017, 379, textureX, textureY); // Box 1065
		skidsModel[269] = new ModelRendererTurbo(this, 2025, 379, textureX, textureY); // Box 1066
		skidsModel[270] = new ModelRendererTurbo(this, 2033, 379, textureX, textureY); // Box 1067
		skidsModel[271] = new ModelRendererTurbo(this, 2041, 379, textureX, textureY); // Box 1068
		skidsModel[272] = new ModelRendererTurbo(this, 961, 387, textureX, textureY); // Box 1069
		skidsModel[273] = new ModelRendererTurbo(this, 969, 387, textureX, textureY); // Box 1070
		skidsModel[274] = new ModelRendererTurbo(this, 977, 387, textureX, textureY); // Box 1071
		skidsModel[275] = new ModelRendererTurbo(this, 985, 387, textureX, textureY); // Box 1072
		skidsModel[276] = new ModelRendererTurbo(this, 993, 387, textureX, textureY); // Box 1073
		skidsModel[277] = new ModelRendererTurbo(this, 1001, 387, textureX, textureY); // Box 1074
		skidsModel[278] = new ModelRendererTurbo(this, 1009, 387, textureX, textureY); // Box 1075
		skidsModel[279] = new ModelRendererTurbo(this, 1017, 387, textureX, textureY); // Box 1076
		skidsModel[280] = new ModelRendererTurbo(this, 1025, 387, textureX, textureY); // Box 1077
		skidsModel[281] = new ModelRendererTurbo(this, 1033, 387, textureX, textureY); // Box 1078
		skidsModel[282] = new ModelRendererTurbo(this, 1041, 387, textureX, textureY); // Box 1079
		skidsModel[283] = new ModelRendererTurbo(this, 1049, 387, textureX, textureY); // Box 1080
		skidsModel[284] = new ModelRendererTurbo(this, 1057, 387, textureX, textureY); // Box 1081
		skidsModel[285] = new ModelRendererTurbo(this, 1065, 387, textureX, textureY); // Box 1082
		skidsModel[286] = new ModelRendererTurbo(this, 1073, 387, textureX, textureY); // Box 1083
		skidsModel[287] = new ModelRendererTurbo(this, 1081, 387, textureX, textureY); // Box 1084
		skidsModel[288] = new ModelRendererTurbo(this, 1089, 387, textureX, textureY); // Box 1085
		skidsModel[289] = new ModelRendererTurbo(this, 1097, 387, textureX, textureY); // Box 1086
		skidsModel[290] = new ModelRendererTurbo(this, 1105, 387, textureX, textureY); // Box 1087
		skidsModel[291] = new ModelRendererTurbo(this, 1113, 387, textureX, textureY); // Box 1088
		skidsModel[292] = new ModelRendererTurbo(this, 1121, 387, textureX, textureY); // Box 1089
		skidsModel[293] = new ModelRendererTurbo(this, 1129, 387, textureX, textureY); // Box 1090
		skidsModel[294] = new ModelRendererTurbo(this, 1137, 387, textureX, textureY); // Box 1091
		skidsModel[295] = new ModelRendererTurbo(this, 1145, 387, textureX, textureY); // Box 1092
		skidsModel[296] = new ModelRendererTurbo(this, 1153, 387, textureX, textureY); // Box 1093
		skidsModel[297] = new ModelRendererTurbo(this, 1161, 387, textureX, textureY); // Box 1094
		skidsModel[298] = new ModelRendererTurbo(this, 1169, 387, textureX, textureY); // Box 1095
		skidsModel[299] = new ModelRendererTurbo(this, 1177, 387, textureX, textureY); // Box 1096
		skidsModel[300] = new ModelRendererTurbo(this, 1185, 387, textureX, textureY); // Box 1097
		skidsModel[301] = new ModelRendererTurbo(this, 1193, 387, textureX, textureY); // Box 1098
		skidsModel[302] = new ModelRendererTurbo(this, 1201, 387, textureX, textureY); // Box 1099
		skidsModel[303] = new ModelRendererTurbo(this, 1209, 387, textureX, textureY); // Box 1100
		skidsModel[304] = new ModelRendererTurbo(this, 1217, 387, textureX, textureY); // Box 1101
		skidsModel[305] = new ModelRendererTurbo(this, 1225, 387, textureX, textureY); // Box 1102
		skidsModel[306] = new ModelRendererTurbo(this, 1233, 387, textureX, textureY); // Box 1103
		skidsModel[307] = new ModelRendererTurbo(this, 1241, 387, textureX, textureY); // Box 1104
		skidsModel[308] = new ModelRendererTurbo(this, 1249, 387, textureX, textureY); // Box 1105
		skidsModel[309] = new ModelRendererTurbo(this, 1257, 387, textureX, textureY); // Box 1106
		skidsModel[310] = new ModelRendererTurbo(this, 1265, 387, textureX, textureY); // Box 1107
		skidsModel[311] = new ModelRendererTurbo(this, 1273, 387, textureX, textureY); // Box 1108
		skidsModel[312] = new ModelRendererTurbo(this, 1281, 387, textureX, textureY); // Box 1109
		skidsModel[313] = new ModelRendererTurbo(this, 1289, 387, textureX, textureY); // Box 1110
		skidsModel[314] = new ModelRendererTurbo(this, 1297, 387, textureX, textureY); // Box 1111
		skidsModel[315] = new ModelRendererTurbo(this, 1305, 387, textureX, textureY); // Box 1112
		skidsModel[316] = new ModelRendererTurbo(this, 1313, 387, textureX, textureY); // Box 1113

		skidsModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.0F, -0.8F, -0.6F, 0.0F, -0.8F, -0.6F, 0.0F, -0.8F, -0.6F, 0.0F, -0.8F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F); // Import 
		skidsModel[0].setRotationPoint(-98.6F, -52.25F, -1F);

		skidsModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -0.8F, -0.4F, 0.0F, -0.8F, -0.4F, 0.0F, -0.4F, -0.2F, 0.0F, -0.4F, -0.2F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F); // Import 
		skidsModel[1].setRotationPoint(-98.6F, -52.25F, -2.22044604925031E-16F);

		skidsModel[2].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.0F, -0.6F, -0.8F, 0.0F, -0.6F, -0.8F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, -0.8F, 0.0F, -0.6F, -0.8F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F); // Import 
		skidsModel[2].setRotationPoint(-98.6F, -53.25F, -2.22044604925031E-16F);

		skidsModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.8F, -0.4F, 0.0F, -0.8F, -0.4F, 0.0F, -0.4F, -0.2F, 0.0F, -0.4F, -0.2F); // Import 
		skidsModel[3].setRotationPoint(-98.6F, -53.25F, -2.22044604925031E-16F);

		skidsModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, -0.8F, -0.6F, 0.0F, -0.8F, -0.6F, 0.0F, -0.8F, -0.6F, 0.0F, -0.8F, -0.6F); // Import 
		skidsModel[4].setRotationPoint(-98.6F, -53.25F, -1F);

		skidsModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, -0.4F, -0.2F, 0.0F, -0.4F, -0.2F, 0.0F, -0.8F, -0.4F, 0.0F, -0.8F, -0.4F); // Import 
		skidsModel[5].setRotationPoint(-98.6F, -53.25F, -1F);

		skidsModel[6].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, -0.9F, -0.4F, 0.0F, -0.9F, -0.4F, 0.0F, -0.9F, -0.4F, 0.0F, -0.9F, -0.4F); // Import 
		skidsModel[6].setRotationPoint(-98.7F, -52.25F, -2.22044604925031E-16F);
		skidsModel[6].rotateAngleX = 4.712389F;

		skidsModel[7].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, -0.9F, -0.4F, 0.0F, -0.9F, -0.4F, 0.0F, -0.9F, -0.3F, 0.0F, -0.9F, -0.3F); // Import 
		skidsModel[7].setRotationPoint(-98.7F, -52.25F, -2.22044604925031E-16F);
		skidsModel[7].rotateAngleX = 3.9269907F;

		skidsModel[8].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, -0.9F, -0.4F, 0.0F, -0.9F, -0.4F, 0.0F, -0.9F, -0.4F, 0.0F, -0.9F, -0.4F); // Import 
		skidsModel[8].setRotationPoint(-98.7F, -52.25F, -2.22044604925031E-16F);
		skidsModel[8].rotateAngleX = 3.1415927F;

		skidsModel[9].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, -0.9F, -0.4F, 0.0F, -0.9F, -0.4F, 0.0F, -0.9F, -0.3F, 0.0F, -0.9F, -0.3F); // Import 
		skidsModel[9].setRotationPoint(-98.7F, -52.25F, -2.22044604925031E-16F);
		skidsModel[9].rotateAngleX = 2.3561945F;

		skidsModel[10].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, -0.9F, -0.4F, 0.0F, -0.9F, -0.4F, 0.0F, -0.9F, -0.4F, 0.0F, -0.9F, -0.4F); // Import 
		skidsModel[10].setRotationPoint(-98.7F, -52.25F, -2.22044604925031E-16F);
		skidsModel[10].rotateAngleX = 1.5707964F;

		skidsModel[11].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, -0.9F, -0.4F, 0.0F, -0.9F, -0.4F, 0.0F, -0.9F, -0.3F, 0.0F, -0.9F, -0.3F); // Import 
		skidsModel[11].setRotationPoint(-98.7F, -52.25F, -2.22044604925031E-16F);
		skidsModel[11].rotateAngleX = 0.7853982F;

		skidsModel[12].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, -0.9F, -0.4F, 0.0F, -0.9F, -0.4F, 0.0F, -0.9F, -0.4F, 0.0F, -0.9F, -0.4F); // Import 
		skidsModel[12].setRotationPoint(-98.7F, -52.25F, -2.22044604925031E-16F);

		skidsModel[13].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, -0.9F, -0.4F, 0.0F, -0.9F, -0.4F, 0.0F, -0.9F, -0.3F, 0.0F, -0.9F, -0.3F); // Import 
		skidsModel[13].setRotationPoint(-98.7F, -52.25F, -2.22044604925031E-16F);
		skidsModel[13].rotateAngleX = 5.497787F;

		skidsModel[14].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0.0F, -0.45F, -0.3F, 0.0F, -0.45F, -0.3F, 0.0F, -0.48F, 0.0F, 0.0F, -0.48F, 0.0F, 0.0F, -0.45F, -0.3F, 0.0F, -0.45F, -0.3F, 0.0F, -0.48F, 0.0F, 0.0F, -0.48F, 0.0F); // Import 
		skidsModel[14].setRotationPoint(-98.7F, -52.25F, -2.22044604925031E-16F);
		skidsModel[14].rotateAngleX = -4.363323F;

		skidsModel[15].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F); // Import 
		skidsModel[15].setRotationPoint(-98.6F, -53.25F, -1F);

		skidsModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.0F, -0.8F, -0.6F, 0.0F, -0.8F, -0.6F, 0.0F, -0.8F, -0.6F, 0.0F, -0.8F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F); // Box 653
		skidsModel[16].setRotationPoint(-98.6F, -51.75F, 1.5F);

		skidsModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -0.8F, -0.4F, 0.0F, -0.8F, -0.4F, 0.0F, -0.4F, -0.2F, 0.0F, -0.4F, -0.2F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F); // Box 654
		skidsModel[17].setRotationPoint(-98.6F, -51.75F, 2.5F);

		skidsModel[18].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.0F, -0.6F, -0.8F, 0.0F, -0.6F, -0.8F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, -0.8F, 0.0F, -0.6F, -0.8F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F); // Box 655
		skidsModel[18].setRotationPoint(-98.6F, -52.75F, 2.5F);

		skidsModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.8F, -0.4F, 0.0F, -0.8F, -0.4F, 0.0F, -0.4F, -0.2F, 0.0F, -0.4F, -0.2F); // Box 656
		skidsModel[19].setRotationPoint(-98.6F, -52.75F, 2.5F);

		skidsModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, -0.8F, -0.6F, 0.0F, -0.8F, -0.6F, 0.0F, -0.8F, -0.6F, 0.0F, -0.8F, -0.6F); // Box 657
		skidsModel[20].setRotationPoint(-98.6F, -52.75F, 1.5F);

		skidsModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, -0.4F, -0.2F, 0.0F, -0.4F, -0.2F, 0.0F, -0.8F, -0.4F, 0.0F, -0.8F, -0.4F); // Box 658
		skidsModel[21].setRotationPoint(-98.6F, -52.75F, 1.5F);

		skidsModel[22].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, -0.8F, 0.0F, -0.6F, -0.8F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, -0.8F, 0.0F, -0.6F, -0.8F); // Box 659
		skidsModel[22].setRotationPoint(-98.6F, -52.75F, 1.5F);

		skidsModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -0.4F, -0.2F, 0.0F, -0.4F, -0.2F, 0.0F, -0.8F, -0.4F, 0.0F, -0.8F, -0.4F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F); // Box 660
		skidsModel[23].setRotationPoint(-98.6F, -51.75F, 1.5F);

		skidsModel[24].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, -0.9F, -0.4F, 0.0F, -0.9F, -0.4F, 0.0F, -0.9F, -0.4F, 0.0F, -0.9F, -0.4F); // Box 661
		skidsModel[24].setRotationPoint(-98.7F, -51.75F, 2.5F);
		skidsModel[24].rotateAngleX = 4.712389F;

		skidsModel[25].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, -0.9F, -0.4F, 0.0F, -0.9F, -0.4F, 0.0F, -0.9F, -0.3F, 0.0F, -0.9F, -0.3F); // Box 662
		skidsModel[25].setRotationPoint(-98.7F, -51.75F, 2.5F);
		skidsModel[25].rotateAngleX = 3.9269907F;

		skidsModel[26].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, -0.9F, -0.4F, 0.0F, -0.9F, -0.4F, 0.0F, -0.9F, -0.4F, 0.0F, -0.9F, -0.4F); // Box 663
		skidsModel[26].setRotationPoint(-98.7F, -51.75F, 2.5F);
		skidsModel[26].rotateAngleX = 3.1415927F;

		skidsModel[27].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, -0.9F, -0.4F, 0.0F, -0.9F, -0.4F, 0.0F, -0.9F, -0.3F, 0.0F, -0.9F, -0.3F); // Box 664
		skidsModel[27].setRotationPoint(-98.7F, -51.75F, 2.5F);
		skidsModel[27].rotateAngleX = 2.3561945F;

		skidsModel[28].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, -0.9F, -0.4F, 0.0F, -0.9F, -0.4F, 0.0F, -0.9F, -0.4F, 0.0F, -0.9F, -0.4F); // Box 665
		skidsModel[28].setRotationPoint(-98.7F, -51.75F, 2.5F);
		skidsModel[28].rotateAngleX = 1.5707964F;

		skidsModel[29].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, -0.9F, -0.4F, 0.0F, -0.9F, -0.4F, 0.0F, -0.9F, -0.3F, 0.0F, -0.9F, -0.3F); // Box 666
		skidsModel[29].setRotationPoint(-98.7F, -51.75F, 2.5F);
		skidsModel[29].rotateAngleX = 0.7853982F;

		skidsModel[30].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, -0.9F, -0.4F, 0.0F, -0.9F, -0.4F, 0.0F, -0.9F, -0.4F, 0.0F, -0.9F, -0.4F); // Box 667
		skidsModel[30].setRotationPoint(-98.7F, -51.75F, 2.5F);

		skidsModel[31].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, -0.9F, -0.4F, 0.0F, -0.9F, -0.4F, 0.0F, -0.9F, -0.3F, 0.0F, -0.9F, -0.3F); // Box 668
		skidsModel[31].setRotationPoint(-98.7F, -51.75F, 2.5F);
		skidsModel[31].rotateAngleX = 5.497787F;

		skidsModel[32].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F); // Box 669
		skidsModel[32].setRotationPoint(-98.6F, -51.75F, 2.5F);

		skidsModel[33].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0.0F, -0.45F, -0.3F, 0.0F, -0.45F, -0.3F, 0.0F, -0.48F, 0.0F, 0.0F, -0.48F, 0.0F, 0.0F, -0.45F, -0.3F, 0.0F, -0.45F, -0.3F, 0.0F, -0.48F, 0.0F, 0.0F, -0.48F, 0.0F); // Box 670
		skidsModel[33].setRotationPoint(-98.7F, -51.75F, 2.5F);
		skidsModel[33].rotateAngleX = -4.363323F;

		skidsModel[34].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F); // Box 671
		skidsModel[34].setRotationPoint(-98.6F, -52.75F, 1.5F);

		skidsModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.0F, -0.8F, -0.6F, 0.0F, -0.8F, -0.6F, 0.0F, -0.8F, -0.6F, 0.0F, -0.8F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F); // Box 672
		skidsModel[35].setRotationPoint(-98.6F, -51.75F, -3.5F);

		skidsModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -0.8F, -0.4F, 0.0F, -0.8F, -0.4F, 0.0F, -0.4F, -0.2F, 0.0F, -0.4F, -0.2F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F); // Box 673
		skidsModel[36].setRotationPoint(-98.6F, -51.75F, -2.5F);

		skidsModel[37].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.0F, -0.6F, -0.8F, 0.0F, -0.6F, -0.8F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, -0.8F, 0.0F, -0.6F, -0.8F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F); // Box 674
		skidsModel[37].setRotationPoint(-98.6F, -52.75F, -2.5F);

		skidsModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.8F, -0.4F, 0.0F, -0.8F, -0.4F, 0.0F, -0.4F, -0.2F, 0.0F, -0.4F, -0.2F); // Box 675
		skidsModel[38].setRotationPoint(-98.6F, -52.75F, -2.5F);

		skidsModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, -0.8F, -0.6F, 0.0F, -0.8F, -0.6F, 0.0F, -0.8F, -0.6F, 0.0F, -0.8F, -0.6F); // Box 676
		skidsModel[39].setRotationPoint(-98.6F, -52.75F, -3.5F);

		skidsModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, -0.4F, -0.2F, 0.0F, -0.4F, -0.2F, 0.0F, -0.8F, -0.4F, 0.0F, -0.8F, -0.4F); // Box 677
		skidsModel[40].setRotationPoint(-98.6F, -52.75F, -3.5F);

		skidsModel[41].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, -0.8F, 0.0F, -0.6F, -0.8F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, -0.8F, 0.0F, -0.6F, -0.8F); // Box 678
		skidsModel[41].setRotationPoint(-98.6F, -52.75F, -3.5F);

		skidsModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -0.4F, -0.2F, 0.0F, -0.4F, -0.2F, 0.0F, -0.8F, -0.4F, 0.0F, -0.8F, -0.4F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F); // Box 679
		skidsModel[42].setRotationPoint(-98.6F, -51.75F, -3.5F);

		skidsModel[43].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, -0.9F, -0.4F, 0.0F, -0.9F, -0.4F, 0.0F, -0.9F, -0.4F, 0.0F, -0.9F, -0.4F); // Box 680
		skidsModel[43].setRotationPoint(-98.7F, -51.75F, -2.5F);
		skidsModel[43].rotateAngleX = 4.712389F;

		skidsModel[44].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, -0.9F, -0.4F, 0.0F, -0.9F, -0.4F, 0.0F, -0.9F, -0.3F, 0.0F, -0.9F, -0.3F); // Box 681
		skidsModel[44].setRotationPoint(-98.7F, -51.75F, -2.5F);
		skidsModel[44].rotateAngleX = 3.9269907F;

		skidsModel[45].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, -0.9F, -0.4F, 0.0F, -0.9F, -0.4F, 0.0F, -0.9F, -0.4F, 0.0F, -0.9F, -0.4F); // Box 682
		skidsModel[45].setRotationPoint(-98.7F, -51.75F, -2.5F);
		skidsModel[45].rotateAngleX = 3.1415927F;

		skidsModel[46].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, -0.9F, -0.4F, 0.0F, -0.9F, -0.4F, 0.0F, -0.9F, -0.3F, 0.0F, -0.9F, -0.3F); // Box 683
		skidsModel[46].setRotationPoint(-98.7F, -51.75F, -2.5F);
		skidsModel[46].rotateAngleX = 2.3561945F;

		skidsModel[47].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, -0.9F, -0.4F, 0.0F, -0.9F, -0.4F, 0.0F, -0.9F, -0.4F, 0.0F, -0.9F, -0.4F); // Box 684
		skidsModel[47].setRotationPoint(-98.7F, -51.75F, -2.5F);
		skidsModel[47].rotateAngleX = 1.5707964F;

		skidsModel[48].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, -0.9F, -0.4F, 0.0F, -0.9F, -0.4F, 0.0F, -0.9F, -0.3F, 0.0F, -0.9F, -0.3F); // Box 685
		skidsModel[48].setRotationPoint(-98.7F, -51.75F, -2.5F);
		skidsModel[48].rotateAngleX = 0.7853982F;

		skidsModel[49].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, -0.9F, -0.4F, 0.0F, -0.9F, -0.4F, 0.0F, -0.9F, -0.4F, 0.0F, -0.9F, -0.4F); // Box 686
		skidsModel[49].setRotationPoint(-98.7F, -51.75F, -2.5F);

		skidsModel[50].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, -0.9F, -0.4F, 0.0F, -0.9F, -0.4F, 0.0F, -0.9F, -0.3F, 0.0F, -0.9F, -0.3F); // Box 687
		skidsModel[50].setRotationPoint(-98.7F, -51.75F, -2.5F);
		skidsModel[50].rotateAngleX = 5.497787F;

		skidsModel[51].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F); // Box 688
		skidsModel[51].setRotationPoint(-98.6F, -51.75F, -2.5F);

		skidsModel[52].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0.0F, -0.45F, -0.3F, 0.0F, -0.45F, -0.3F, 0.0F, -0.48F, 0.0F, 0.0F, -0.48F, 0.0F, 0.0F, -0.45F, -0.3F, 0.0F, -0.45F, -0.3F, 0.0F, -0.48F, 0.0F, 0.0F, -0.48F, 0.0F); // Box 689
		skidsModel[52].setRotationPoint(-98.7F, -51.75F, -2.5F);
		skidsModel[52].rotateAngleX = -4.363323F;

		skidsModel[53].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F); // Box 690
		skidsModel[53].setRotationPoint(-98.6F, -52.75F, -3.5F);

		skidsModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, 0.2F, -0.2F, 0.0F, 0.2F, -0.2F, 0.0F, 0.2F, -0.2F, 0.0F, 0.2F, -0.2F, 0.0F, -1.0F, -0.2F, 0.0F, -1.0F, -0.2F, 0.0F, -1.0F, -0.2F, 0.0F, -1.0F, -0.2F); // Import 
		skidsModel[54].setRotationPoint(-98.6F, -50.45F, -1.5F);

		skidsModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F, 0.0F, 0.2F, -0.8F, 0.0F, 0.2F, -0.8F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -1.0F, -0.8F, 0.0F, -1.0F, -0.8F); // Import 
		skidsModel[55].setRotationPoint(-98.6F, -50.45F, -1.5F);

		skidsModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, -1.0F, 0.0F, -0.2F, -1.0F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, -1.0F, 0.0F, -0.2F, -1.0F); // Import 
		skidsModel[56].setRotationPoint(-98.6F, -50.45F, -1.5F);

		skidsModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -1.0F, -0.2F, 0.0F, -1.0F, -0.2F, 0.0F, -1.0F, -0.2F, 0.0F, -1.0F, -0.2F, 0.0F, 0.2F, -0.2F, 0.0F, 0.2F, -0.2F, 0.0F, 0.2F, -0.2F, 0.0F, 0.2F, -0.2F); // Import 
		skidsModel[57].setRotationPoint(-98.6F, -50.45F, -1.5F);

		skidsModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -1.0F, -0.8F, 0.0F, -1.0F, -0.8F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F, 0.0F, 0.2F, -0.8F, 0.0F, 0.2F, -0.8F); // Import 
		skidsModel[58].setRotationPoint(-98.6F, -50.45F, -1.5F);

		skidsModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F); // Import 
		skidsModel[59].setRotationPoint(-98.7F, -50.45F, -1.5F);

		skidsModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -1.0F, -0.8F, 0.0F, -1.0F, -0.8F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, 0.2F, -0.8F, 0.0F, 0.2F, -0.8F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F); // Import 
		skidsModel[60].setRotationPoint(-98.6F, -50.45F, -1.5F);

		skidsModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -0.2F, -1.0F, 0.0F, -0.2F, -1.0F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, -1.0F, 0.0F, -0.2F, -1.0F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F); // Import 
		skidsModel[61].setRotationPoint(-98.6F, -50.45F, -1.5F);

		skidsModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, 0.2F, -0.8F, 0.0F, 0.2F, -0.8F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F, 0.0F, -1.0F, -0.8F, 0.0F, -1.0F, -0.8F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F); // Import 
		skidsModel[62].setRotationPoint(-98.6F, -50.45F, -1.5F);

		skidsModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, 0.2F, -0.2F, 0.0F, 0.2F, -0.2F, 0.0F, 0.2F, -0.2F, 0.0F, 0.2F, -0.2F, 0.0F, -1.0F, -0.2F, 0.0F, -1.0F, -0.2F, 0.0F, -1.0F, -0.2F, 0.0F, -1.0F, -0.2F); // Box 702
		skidsModel[63].setRotationPoint(-98.6F, -48.45F, -1.5F);

		skidsModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F, 0.0F, 0.2F, -0.8F, 0.0F, 0.2F, -0.8F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -1.0F, -0.8F, 0.0F, -1.0F, -0.8F); // Box 703
		skidsModel[64].setRotationPoint(-98.6F, -48.45F, -1.5F);

		skidsModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, -1.0F, 0.0F, -0.2F, -1.0F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, -1.0F, 0.0F, -0.2F, -1.0F); // Box 704
		skidsModel[65].setRotationPoint(-98.6F, -48.45F, -1.5F);

		skidsModel[66].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0.0F, -0.45F, -0.3F, 0.0F, -0.45F, -0.3F, 0.0F, -0.48F, -0.3F, 0.0F, -0.48F, -0.3F, 0.0F, -0.45F, -0.3F, 0.0F, -0.45F, -0.3F, 0.0F, -0.48F, -0.3F, 0.0F, -0.48F, -0.3F); // Box 705
		skidsModel[66].setRotationPoint(-98.7F, -47.95F, -1F);
		skidsModel[66].rotateAngleX = 4.5553093F;

		skidsModel[67].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F); // Box 706
		skidsModel[67].setRotationPoint(-98.6F, -47.95F, -1F);

		skidsModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -1.0F, -0.2F, 0.0F, -1.0F, -0.2F, 0.0F, -1.0F, -0.2F, 0.0F, -1.0F, -0.2F, 0.0F, 0.2F, -0.2F, 0.0F, 0.2F, -0.2F, 0.0F, 0.2F, -0.2F, 0.0F, 0.2F, -0.2F); // Box 707
		skidsModel[68].setRotationPoint(-98.6F, -48.45F, -1.5F);

		skidsModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -1.0F, -0.8F, 0.0F, -1.0F, -0.8F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F, 0.0F, 0.2F, -0.8F, 0.0F, 0.2F, -0.8F); // Box 708
		skidsModel[69].setRotationPoint(-98.6F, -48.45F, -1.5F);

		skidsModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F); // Box 709
		skidsModel[70].setRotationPoint(-98.7F, -48.45F, -1.5F);

		skidsModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -1.0F, -0.8F, 0.0F, -1.0F, -0.8F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, 0.2F, -0.8F, 0.0F, 0.2F, -0.8F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F); // Box 710
		skidsModel[71].setRotationPoint(-98.6F, -48.45F, -1.5F);

		skidsModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -0.2F, -1.0F, 0.0F, -0.2F, -1.0F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, -1.0F, 0.0F, -0.2F, -1.0F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F); // Box 711
		skidsModel[72].setRotationPoint(-98.6F, -48.45F, -1.5F);

		skidsModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, 0.2F, -0.8F, 0.0F, 0.2F, -0.8F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F, 0.0F, -1.0F, -0.8F, 0.0F, -1.0F, -0.8F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F); // Box 712
		skidsModel[73].setRotationPoint(-98.6F, -48.45F, -1.5F);

		skidsModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -0.2F, -1.0F, 0.0F, -0.2F, -1.0F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, -1.0F, 0.0F, -0.2F, -1.0F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F); // Import 
		skidsModel[74].setRotationPoint(-98.6F, -50.55F, 0.4F);

		skidsModel[75].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F); // Import 
		skidsModel[75].setRotationPoint(-98.6F, -50.05F, 0.9F);

		skidsModel[76].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0.0F, -0.45F, -0.3F, 0.0F, -0.45F, -0.3F, 0.0F, -0.48F, -0.3F, 0.0F, -0.48F, -0.3F, 0.0F, -0.45F, -0.3F, 0.0F, -0.45F, -0.3F, 0.0F, -0.48F, -0.3F, 0.0F, -0.48F, -0.3F); // Import 
		skidsModel[76].setRotationPoint(-98.7F, -50.05F, 0.9F);
		skidsModel[76].rotateAngleX = 3.7524579F;

		skidsModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F); // Import 
		skidsModel[77].setRotationPoint(-98.7F, -50.55F, 0.4F);

		skidsModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -1.0F, -0.8F, 0.0F, -1.0F, -0.8F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F, 0.0F, 0.2F, -0.8F, 0.0F, 0.2F, -0.8F); // Import 
		skidsModel[78].setRotationPoint(-98.6F, -50.55F, 0.4F);

		skidsModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, -1.0F, 0.0F, -0.2F, -1.0F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, -1.0F, 0.0F, -0.2F, -1.0F); // Import 
		skidsModel[79].setRotationPoint(-98.6F, -50.55F, 0.4F);

		skidsModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F, 0.0F, 0.2F, -0.8F, 0.0F, 0.2F, -0.8F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -1.0F, -0.8F, 0.0F, -1.0F, -0.8F); // Import 
		skidsModel[80].setRotationPoint(-98.6F, -50.55F, 0.4F);

		skidsModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, 0.2F, -0.2F, 0.0F, 0.2F, -0.2F, 0.0F, 0.2F, -0.2F, 0.0F, 0.2F, -0.2F, 0.0F, -1.0F, -0.2F, 0.0F, -1.0F, -0.2F, 0.0F, -1.0F, -0.2F, 0.0F, -1.0F, -0.2F); // Import 
		skidsModel[81].setRotationPoint(-98.6F, -50.55F, 0.4F);

		skidsModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, 0.2F, -0.8F, 0.0F, 0.2F, -0.8F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F, 0.0F, -1.0F, -0.8F, 0.0F, -1.0F, -0.8F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F); // Import 
		skidsModel[82].setRotationPoint(-98.6F, -50.55F, 0.4F);

		skidsModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -1.0F, -0.8F, 0.0F, -1.0F, -0.8F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, 0.2F, -0.8F, 0.0F, 0.2F, -0.8F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F); // Import 
		skidsModel[83].setRotationPoint(-98.6F, -50.55F, 0.4F);

		skidsModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -1.0F, -0.2F, 0.0F, -1.0F, -0.2F, 0.0F, -1.0F, -0.2F, 0.0F, -1.0F, -0.2F, 0.0F, 0.2F, -0.2F, 0.0F, 0.2F, -0.2F, 0.0F, 0.2F, -0.2F, 0.0F, 0.2F, -0.2F); // Import 
		skidsModel[84].setRotationPoint(-98.6F, -50.55F, 0.4F);

		skidsModel[85].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0.0F, -0.45F, -0.3F, 0.0F, -0.45F, -0.3F, 0.0F, -0.48F, -0.3F, 0.0F, -0.48F, -0.3F, 0.0F, -0.45F, -0.3F, 0.0F, -0.45F, -0.3F, 0.0F, -0.48F, -0.3F, 0.0F, -0.48F, -0.3F); // Import 
		skidsModel[85].setRotationPoint(-98.7F, -50.05F, 0.9F);
		skidsModel[85].rotateAngleX = -3.7524579F;

		skidsModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, 0.2F, -0.3F, 0.0F, 0.2F, -0.3F, 0.0F, 0.2F, -0.3F, 0.0F, 0.2F, -0.3F, 0.0F, -1.0F, -0.3F, 0.0F, -1.0F, -0.3F, 0.0F, -1.0F, -0.3F, 0.0F, -1.0F, -0.3F); // Import 
		skidsModel[86].setRotationPoint(-98.6F, -49.65F, -7.4F);

		skidsModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, 0.2F, -0.8F, 0.0F, 0.2F, -0.8F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F, 0.0F, -1.0F, -0.8F, 0.0F, -1.0F, -0.8F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F); // Import 
		skidsModel[87].setRotationPoint(-98.6F, -49.65F, -7.5F);

		skidsModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -0.3F, -1.0F, 0.0F, -0.3F, -1.0F, 0.0F, -0.3F, 0.2F, 0.0F, -0.3F, 0.2F, 0.0F, -0.3F, -1.0F, 0.0F, -0.3F, -1.0F, 0.0F, -0.3F, 0.2F, 0.0F, -0.3F, 0.2F); // Import 
		skidsModel[88].setRotationPoint(-98.6F, -49.75F, -7.5F);

		skidsModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -1.0F, -0.8F, 0.0F, -1.0F, -0.8F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, 0.2F, -0.8F, 0.0F, 0.2F, -0.8F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F); // Import 
		skidsModel[89].setRotationPoint(-98.6F, -49.85F, -7.5F);

		skidsModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -1.0F, -0.3F, 0.0F, -1.0F, -0.3F, 0.0F, -1.0F, -0.3F, 0.0F, -1.0F, -0.3F, 0.0F, 0.2F, -0.3F, 0.0F, 0.2F, -0.3F, 0.0F, 0.2F, -0.3F, 0.0F, 0.2F, -0.3F); // Import 
		skidsModel[90].setRotationPoint(-98.6F, -49.85F, -7.4F);

		skidsModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -1.0F, -0.8F, 0.0F, -1.0F, -0.8F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F, 0.0F, 0.2F, -0.8F, 0.0F, 0.2F, -0.8F); // Import 
		skidsModel[91].setRotationPoint(-98.6F, -49.85F, -7.3F);

		skidsModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -0.3F, 0.2F, 0.0F, -0.3F, 0.2F, 0.0F, -0.3F, -1.0F, 0.0F, -0.3F, -1.0F, 0.0F, -0.3F, 0.2F, 0.0F, -0.3F, 0.2F, 0.0F, -0.3F, -1.0F, 0.0F, -0.3F, -1.0F); // Import 
		skidsModel[92].setRotationPoint(-98.6F, -49.75F, -7.3F);

		skidsModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F, 0.0F, 0.2F, -0.8F, 0.0F, 0.2F, -0.8F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -1.0F, -0.8F, 0.0F, -1.0F, -0.8F); // Import 
		skidsModel[93].setRotationPoint(-98.6F, -49.65F, -7.3F);

		skidsModel[94].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0.0F, -0.45F, -0.3F, 0.0F, -0.45F, -0.3F, 0.0F, -0.48F, -0.3F, 0.0F, -0.48F, -0.3F, 0.0F, -0.45F, -0.3F, 0.0F, -0.45F, -0.3F, 0.0F, -0.48F, -0.3F, 0.0F, -0.48F, -0.3F); // Import 
		skidsModel[94].setRotationPoint(-98.7F, -49.05F, -6.9F);
		skidsModel[94].rotateAngleX = -3.7524579F;

		skidsModel[95].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F); // Import 
		skidsModel[95].setRotationPoint(-98.6F, -49.05F, -6.9F);

		skidsModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F); // Import 
		skidsModel[96].setRotationPoint(-98.6F, -49.75F, -7.4F);

		skidsModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, 0.2F, -0.3F, 0.0F, 0.2F, -0.3F, 0.0F, 0.2F, -0.3F, 0.0F, 0.2F, -0.3F, 0.0F, -1.0F, -0.3F, 0.0F, -1.0F, -0.3F, 0.0F, -1.0F, -0.3F, 0.0F, -1.0F, -0.3F); // Import 
		skidsModel[97].setRotationPoint(-98.6F, -48.35F, -7.4F);

		skidsModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, 0.2F, -0.8F, 0.0F, 0.2F, -0.8F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F, 0.0F, -1.0F, -0.8F, 0.0F, -1.0F, -0.8F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F); // Import 
		skidsModel[98].setRotationPoint(-98.6F, -48.35F, -7.5F);

		skidsModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -0.3F, -1.0F, 0.0F, -0.3F, -1.0F, 0.0F, -0.3F, 0.2F, 0.0F, -0.3F, 0.2F, 0.0F, -0.3F, -1.0F, 0.0F, -0.3F, -1.0F, 0.0F, -0.3F, 0.2F, 0.0F, -0.3F, 0.2F); // Import 
		skidsModel[99].setRotationPoint(-98.6F, -48.45F, -7.5F);

		skidsModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -1.0F, -0.8F, 0.0F, -1.0F, -0.8F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, 0.2F, -0.8F, 0.0F, 0.2F, -0.8F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F); // Import 
		skidsModel[100].setRotationPoint(-98.6F, -48.55F, -7.5F);

		skidsModel[101].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -1.0F, -0.3F, 0.0F, -1.0F, -0.3F, 0.0F, -1.0F, -0.3F, 0.0F, -1.0F, -0.3F, 0.0F, 0.2F, -0.3F, 0.0F, 0.2F, -0.3F, 0.0F, 0.2F, -0.3F, 0.0F, 0.2F, -0.3F); // Import 
		skidsModel[101].setRotationPoint(-98.6F, -48.55F, -7.4F);

		skidsModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -1.0F, -0.8F, 0.0F, -1.0F, -0.8F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F, 0.0F, 0.2F, -0.8F, 0.0F, 0.2F, -0.8F); // Import 
		skidsModel[102].setRotationPoint(-98.6F, -48.55F, -7.3F);

		skidsModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -0.3F, 0.2F, 0.0F, -0.3F, 0.2F, 0.0F, -0.3F, -1.0F, 0.0F, -0.3F, -1.0F, 0.0F, -0.3F, 0.2F, 0.0F, -0.3F, 0.2F, 0.0F, -0.3F, -1.0F, 0.0F, -0.3F, -1.0F); // Import 
		skidsModel[103].setRotationPoint(-98.6F, -48.45F, -7.3F);

		skidsModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F, 0.0F, 0.2F, -0.8F, 0.0F, 0.2F, -0.8F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -1.0F, -0.8F, 0.0F, -1.0F, -0.8F); // Import 
		skidsModel[104].setRotationPoint(-98.6F, -48.35F, -7.3F);

		skidsModel[105].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0.0F, -0.45F, -0.3F, 0.0F, -0.45F, -0.3F, 0.0F, -0.48F, -0.3F, 0.0F, -0.48F, -0.3F, 0.0F, -0.45F, -0.3F, 0.0F, -0.45F, -0.3F, 0.0F, -0.48F, -0.3F, 0.0F, -0.48F, -0.3F); // Import 
		skidsModel[105].setRotationPoint(-98.7F, -47.95F, -6.9F);
		skidsModel[105].rotateAngleX = 4.2586036F;

		skidsModel[106].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F); // Import 
		skidsModel[106].setRotationPoint(-98.6F, -47.95F, -6.9F);

		skidsModel[107].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F); // Import 
		skidsModel[107].setRotationPoint(-98.6F, -48.45F, -7.4F);

		skidsModel[108].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0.0F, -0.45F, -0.3F, 0.0F, -0.45F, -0.3F, 0.0F, -0.48F, -0.3F, 0.0F, -0.48F, -0.3F, 0.0F, -0.45F, -0.3F, 0.0F, -0.45F, -0.3F, 0.0F, -0.48F, -0.3F, 0.0F, -0.48F, -0.3F); // Import 
		skidsModel[108].setRotationPoint(-98.7F, -47.95F, -6.9F);
		skidsModel[108].rotateAngleX = 4.9741883F;

		skidsModel[109].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F); // Box 836
		skidsModel[109].setRotationPoint(-98.6F, -48.55F, 0.5F);

		skidsModel[110].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -0.3F, 0.2F, 0.0F, -0.3F, 0.2F, 0.0F, -0.3F, -1.0F, 0.0F, -0.3F, -1.0F, 0.0F, -0.3F, 0.2F, 0.0F, -0.3F, 0.2F, 0.0F, -0.3F, -1.0F, 0.0F, -0.3F, -1.0F); // Box 837
		skidsModel[110].setRotationPoint(-98.6F, -48.55F, 0.600000000000001F);

		skidsModel[111].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0.0F, -0.45F, -0.3F, 0.0F, -0.45F, -0.3F, 0.0F, -0.48F, -0.3F, 0.0F, -0.48F, -0.3F, 0.0F, -0.45F, -0.3F, 0.0F, -0.45F, -0.3F, 0.0F, -0.48F, -0.3F, 0.0F, -0.48F, -0.3F); // Box 838
		skidsModel[111].setRotationPoint(-98.7F, -47.85F, 1F);
		skidsModel[111].rotateAngleX = -3.7524579F;

		skidsModel[112].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F); // Box 839
		skidsModel[112].setRotationPoint(-98.6F, -47.85F, 1F);

		skidsModel[113].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -1.0F, -0.8F, 0.0F, -1.0F, -0.8F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F, 0.0F, 0.2F, -0.8F, 0.0F, 0.2F, -0.8F); // Box 840
		skidsModel[113].setRotationPoint(-98.6F, -48.65F, 0.600000000000001F);

		skidsModel[114].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -1.0F, -0.3F, 0.0F, -1.0F, -0.3F, 0.0F, -1.0F, -0.3F, 0.0F, -1.0F, -0.3F, 0.0F, 0.2F, -0.3F, 0.0F, 0.2F, -0.3F, 0.0F, 0.2F, -0.3F, 0.0F, 0.2F, -0.3F); // Box 841
		skidsModel[114].setRotationPoint(-98.6F, -48.65F, 0.5F);

		skidsModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -1.0F, -0.8F, 0.0F, -1.0F, -0.8F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, 0.2F, -0.8F, 0.0F, 0.2F, -0.8F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F); // Box 842
		skidsModel[115].setRotationPoint(-98.6F, -48.65F, 0.4F);

		skidsModel[116].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -0.3F, -1.0F, 0.0F, -0.3F, -1.0F, 0.0F, -0.3F, 0.2F, 0.0F, -0.3F, 0.2F, 0.0F, -0.3F, -1.0F, 0.0F, -0.3F, -1.0F, 0.0F, -0.3F, 0.2F, 0.0F, -0.3F, 0.2F); // Box 843
		skidsModel[116].setRotationPoint(-98.6F, -48.55F, 0.4F);

		skidsModel[117].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, 0.2F, -0.8F, 0.0F, 0.2F, -0.8F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F, 0.0F, -1.0F, -0.8F, 0.0F, -1.0F, -0.8F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F); // Box 844
		skidsModel[117].setRotationPoint(-98.6F, -48.45F, 0.4F);

		skidsModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F, 0.0F, 0.2F, -0.8F, 0.0F, 0.2F, -0.8F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -1.0F, -0.8F, 0.0F, -1.0F, -0.8F); // Box 845
		skidsModel[118].setRotationPoint(-98.6F, -48.45F, 0.600000000000001F);

		skidsModel[119].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, 0.2F, -0.3F, 0.0F, 0.2F, -0.3F, 0.0F, 0.2F, -0.3F, 0.0F, 0.2F, -0.3F, 0.0F, -1.0F, -0.3F, 0.0F, -1.0F, -0.3F, 0.0F, -1.0F, -0.3F, 0.0F, -1.0F, -0.3F); // Box 846
		skidsModel[119].setRotationPoint(-98.6F, -48.45F, 0.5F);

		skidsModel[120].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F); // Box 888
		skidsModel[120].setRotationPoint(-98.7F, -51.05F, -8.6F);

		skidsModel[121].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F); // Box 889
		skidsModel[121].setRotationPoint(-98.6F, -50.55F, -8.1F);

		skidsModel[122].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, -1.0F, 0.0F, -0.2F, -1.0F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, -1.0F, 0.0F, -0.2F, -1.0F); // Box 890
		skidsModel[122].setRotationPoint(-98.6F, -51.05F, -8.6F);

		skidsModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, 0.2F, -0.2F, 0.0F, 0.2F, -0.2F, 0.0F, 0.2F, -0.2F, 0.0F, 0.2F, -0.2F, 0.0F, -1.0F, -0.2F, 0.0F, -1.0F, -0.2F, 0.0F, -1.0F, -0.2F, 0.0F, -1.0F, -0.2F); // Box 891
		skidsModel[123].setRotationPoint(-98.6F, -51.05F, -8.6F);

		skidsModel[124].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F, 0.0F, 0.2F, -0.8F, 0.0F, 0.2F, -0.8F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -1.0F, -0.8F, 0.0F, -1.0F, -0.8F); // Box 892
		skidsModel[124].setRotationPoint(-98.6F, -51.05F, -8.6F);

		skidsModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, 0.2F, -0.8F, 0.0F, 0.2F, -0.8F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F, 0.0F, -1.0F, -0.8F, 0.0F, -1.0F, -0.8F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F); // Box 893
		skidsModel[125].setRotationPoint(-98.6F, -51.05F, -8.6F);

		skidsModel[126].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -0.2F, -1.0F, 0.0F, -0.2F, -1.0F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, -1.0F, 0.0F, -0.2F, -1.0F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F); // Box 894
		skidsModel[126].setRotationPoint(-98.6F, -51.05F, -8.6F);

		skidsModel[127].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0.0F, -0.45F, -0.3F, 0.0F, -0.45F, -0.3F, 0.0F, -0.48F, -0.3F, 0.0F, -0.48F, -0.3F, 0.0F, -0.45F, -0.3F, 0.0F, -0.45F, -0.3F, 0.0F, -0.48F, -0.3F, 0.0F, -0.48F, -0.3F); // Box 895
		skidsModel[127].setRotationPoint(-98.7F, -50.55F, -8.1F);
		skidsModel[127].rotateAngleX = 4.5553093F;

		skidsModel[128].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -1.0F, -0.8F, 0.0F, -1.0F, -0.8F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F, 0.0F, 0.2F, -0.8F, 0.0F, 0.2F, -0.8F); // Box 896
		skidsModel[128].setRotationPoint(-98.6F, -51.05F, -8.6F);

		skidsModel[129].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -1.0F, -0.2F, 0.0F, -1.0F, -0.2F, 0.0F, -1.0F, -0.2F, 0.0F, -1.0F, -0.2F, 0.0F, 0.2F, -0.2F, 0.0F, 0.2F, -0.2F, 0.0F, 0.2F, -0.2F, 0.0F, 0.2F, -0.2F); // Box 897
		skidsModel[129].setRotationPoint(-98.6F, -51.05F, -8.6F);

		skidsModel[130].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -1.0F, -0.8F, 0.0F, -1.0F, -0.8F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, 0.2F, -0.8F, 0.0F, 0.2F, -0.8F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F); // Box 898
		skidsModel[130].setRotationPoint(-98.6F, -51.05F, -8.6F);

		skidsModel[131].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, 0.2F, -0.3F, 0.0F, 0.2F, -0.3F, 0.0F, 0.2F, -0.3F, 0.0F, 0.2F, -0.3F, 0.0F, -1.0F, -0.3F, 0.0F, -1.0F, -0.3F, 0.0F, -1.0F, -0.3F, 0.0F, -1.0F, -0.3F); // Box 924
		skidsModel[131].setRotationPoint(-98.6F, -49.65F, 6.3F);

		skidsModel[132].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F, 0.0F, 0.2F, -0.8F, 0.0F, 0.2F, -0.8F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -1.0F, -0.8F, 0.0F, -1.0F, -0.8F); // Box 925
		skidsModel[132].setRotationPoint(-98.6F, -49.65F, 6.4F);

		skidsModel[133].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -0.3F, 0.2F, 0.0F, -0.3F, 0.2F, 0.0F, -0.3F, -1.0F, 0.0F, -0.3F, -1.0F, 0.0F, -0.3F, 0.2F, 0.0F, -0.3F, 0.2F, 0.0F, -0.3F, -1.0F, 0.0F, -0.3F, -1.0F); // Box 926
		skidsModel[133].setRotationPoint(-98.6F, -49.75F, 6.4F);

		skidsModel[134].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -1.0F, -0.8F, 0.0F, -1.0F, -0.8F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F, 0.0F, 0.2F, -0.8F, 0.0F, 0.2F, -0.8F); // Box 927
		skidsModel[134].setRotationPoint(-98.6F, -49.85F, 6.4F);

		skidsModel[135].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -1.0F, -0.3F, 0.0F, -1.0F, -0.3F, 0.0F, -1.0F, -0.3F, 0.0F, -1.0F, -0.3F, 0.0F, 0.2F, -0.3F, 0.0F, 0.2F, -0.3F, 0.0F, 0.2F, -0.3F, 0.0F, 0.2F, -0.3F); // Box 928
		skidsModel[135].setRotationPoint(-98.6F, -49.85F, 6.3F);

		skidsModel[136].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -1.0F, -0.8F, 0.0F, -1.0F, -0.8F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, 0.2F, -0.8F, 0.0F, 0.2F, -0.8F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F); // Box 929
		skidsModel[136].setRotationPoint(-98.6F, -49.85F, 6.2F);

		skidsModel[137].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -0.3F, -1.0F, 0.0F, -0.3F, -1.0F, 0.0F, -0.3F, 0.2F, 0.0F, -0.3F, 0.2F, 0.0F, -0.3F, -1.0F, 0.0F, -0.3F, -1.0F, 0.0F, -0.3F, 0.2F, 0.0F, -0.3F, 0.2F); // Box 930
		skidsModel[137].setRotationPoint(-98.6F, -49.75F, 6.2F);

		skidsModel[138].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, 0.2F, -0.8F, 0.0F, 0.2F, -0.8F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F, 0.0F, -1.0F, -0.8F, 0.0F, -1.0F, -0.8F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F); // Box 931
		skidsModel[138].setRotationPoint(-98.6F, -49.65F, 6.2F);

		skidsModel[139].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0.0F, -0.48F, -0.3F, 0.0F, -0.48F, -0.3F, 0.0F, -0.45F, -0.3F, 0.0F, -0.45F, -0.3F, 0.0F, -0.48F, -0.3F, 0.0F, -0.48F, -0.3F, 0.0F, -0.45F, -0.3F, 0.0F, -0.45F, -0.3F); // Box 932
		skidsModel[139].setRotationPoint(-98.7F, -49.05F, 6.8F);
		skidsModel[139].rotateAngleX = -3.7524579F;

		skidsModel[140].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F); // Box 933
		skidsModel[140].setRotationPoint(-98.6F, -49.05F, 6.8F);

		skidsModel[141].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F); // Box 934
		skidsModel[141].setRotationPoint(-98.6F, -49.75F, 6.3F);

		skidsModel[142].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, 0.2F, -0.3F, 0.0F, 0.2F, -0.3F, 0.0F, 0.2F, -0.3F, 0.0F, 0.2F, -0.3F, 0.0F, -1.0F, -0.3F, 0.0F, -1.0F, -0.3F, 0.0F, -1.0F, -0.3F, 0.0F, -1.0F, -0.3F); // Box 935
		skidsModel[142].setRotationPoint(-98.6F, -48.35F, 6.3F);

		skidsModel[143].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F, 0.0F, 0.2F, -0.8F, 0.0F, 0.2F, -0.8F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -1.0F, -0.8F, 0.0F, -1.0F, -0.8F); // Box 936
		skidsModel[143].setRotationPoint(-98.6F, -48.35F, 6.4F);

		skidsModel[144].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -0.3F, 0.2F, 0.0F, -0.3F, 0.2F, 0.0F, -0.3F, -1.0F, 0.0F, -0.3F, -1.0F, 0.0F, -0.3F, 0.2F, 0.0F, -0.3F, 0.2F, 0.0F, -0.3F, -1.0F, 0.0F, -0.3F, -1.0F); // Box 937
		skidsModel[144].setRotationPoint(-98.6F, -48.45F, 6.4F);

		skidsModel[145].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -1.0F, -0.8F, 0.0F, -1.0F, -0.8F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F, 0.0F, 0.2F, -0.8F, 0.0F, 0.2F, -0.8F); // Box 938
		skidsModel[145].setRotationPoint(-98.6F, -48.55F, 6.4F);

		skidsModel[146].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -1.0F, -0.3F, 0.0F, -1.0F, -0.3F, 0.0F, -1.0F, -0.3F, 0.0F, -1.0F, -0.3F, 0.0F, 0.2F, -0.3F, 0.0F, 0.2F, -0.3F, 0.0F, 0.2F, -0.3F, 0.0F, 0.2F, -0.3F); // Box 939
		skidsModel[146].setRotationPoint(-98.6F, -48.55F, 6.3F);

		skidsModel[147].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -1.0F, -0.8F, 0.0F, -1.0F, -0.8F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, 0.2F, -0.8F, 0.0F, 0.2F, -0.8F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F); // Box 940
		skidsModel[147].setRotationPoint(-98.6F, -48.55F, 6.2F);

		skidsModel[148].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -0.3F, -1.0F, 0.0F, -0.3F, -1.0F, 0.0F, -0.3F, 0.2F, 0.0F, -0.3F, 0.2F, 0.0F, -0.3F, -1.0F, 0.0F, -0.3F, -1.0F, 0.0F, -0.3F, 0.2F, 0.0F, -0.3F, 0.2F); // Box 941
		skidsModel[148].setRotationPoint(-98.6F, -48.45F, 6.2F);

		skidsModel[149].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, 0.2F, -0.8F, 0.0F, 0.2F, -0.8F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F, 0.0F, -1.0F, -0.8F, 0.0F, -1.0F, -0.8F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F); // Box 942
		skidsModel[149].setRotationPoint(-98.6F, -48.35F, 6.2F);

		skidsModel[150].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0.0F, -0.48F, -0.3F, 0.0F, -0.48F, -0.3F, 0.0F, -0.45F, -0.3F, 0.0F, -0.45F, -0.3F, 0.0F, -0.48F, -0.3F, 0.0F, -0.48F, -0.3F, 0.0F, -0.45F, -0.3F, 0.0F, -0.45F, -0.3F); // Box 943
		skidsModel[150].setRotationPoint(-98.7F, -47.95F, 6.8F);
		skidsModel[150].rotateAngleX = 4.2586036F;

		skidsModel[151].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F); // Box 944
		skidsModel[151].setRotationPoint(-98.6F, -47.95F, 6.8F);

		skidsModel[152].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F); // Box 945
		skidsModel[152].setRotationPoint(-98.6F, -48.45F, 6.3F);

		skidsModel[153].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0.0F, -0.48F, -0.3F, 0.0F, -0.48F, -0.3F, 0.0F, -0.45F, -0.3F, 0.0F, -0.45F, -0.3F, 0.0F, -0.48F, -0.3F, 0.0F, -0.48F, -0.3F, 0.0F, -0.45F, -0.3F, 0.0F, -0.45F, -0.3F); // Box 946
		skidsModel[153].setRotationPoint(-98.7F, -47.95F, 6.8F);
		skidsModel[153].rotateAngleX = 4.9741883F;

		skidsModel[154].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F); // Box 947
		skidsModel[154].setRotationPoint(-98.7F, -51.05F, 7.5F);

		skidsModel[155].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F); // Box 948
		skidsModel[155].setRotationPoint(-98.6F, -50.55F, 8F);

		skidsModel[156].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -0.2F, -1.0F, 0.0F, -0.2F, -1.0F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, -1.0F, 0.0F, -0.2F, -1.0F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F); // Box 949
		skidsModel[156].setRotationPoint(-98.6F, -51.05F, 7.5F);

		skidsModel[157].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, 0.2F, -0.2F, 0.0F, 0.2F, -0.2F, 0.0F, 0.2F, -0.2F, 0.0F, 0.2F, -0.2F, 0.0F, -1.0F, -0.2F, 0.0F, -1.0F, -0.2F, 0.0F, -1.0F, -0.2F, 0.0F, -1.0F, -0.2F); // Box 950
		skidsModel[157].setRotationPoint(-98.6F, -51.05F, 7.5F);

		skidsModel[158].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, 0.2F, -0.8F, 0.0F, 0.2F, -0.8F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F, 0.0F, -1.0F, -0.8F, 0.0F, -1.0F, -0.8F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F); // Box 951
		skidsModel[158].setRotationPoint(-98.6F, -51.05F, 7.5F);

		skidsModel[159].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F, 0.0F, 0.2F, -0.8F, 0.0F, 0.2F, -0.8F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -1.0F, -0.8F, 0.0F, -1.0F, -0.8F); // Box 952
		skidsModel[159].setRotationPoint(-98.6F, -51.05F, 7.5F);

		skidsModel[160].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, -1.0F, 0.0F, -0.2F, -1.0F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, -1.0F, 0.0F, -0.2F, -1.0F); // Box 953
		skidsModel[160].setRotationPoint(-98.6F, -51.05F, 7.5F);

		skidsModel[161].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0.0F, -0.48F, -0.3F, 0.0F, -0.48F, -0.3F, 0.0F, -0.45F, -0.3F, 0.0F, -0.45F, -0.3F, 0.0F, -0.48F, -0.3F, 0.0F, -0.48F, -0.3F, 0.0F, -0.45F, -0.3F, 0.0F, -0.45F, -0.3F); // Box 954
		skidsModel[161].setRotationPoint(-98.7F, -50.55F, 8F);
		skidsModel[161].rotateAngleX = 4.5553093F;

		skidsModel[162].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -1.0F, -0.8F, 0.0F, -1.0F, -0.8F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, 0.2F, -0.8F, 0.0F, 0.2F, -0.8F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F); // Box 955
		skidsModel[162].setRotationPoint(-98.6F, -51.05F, 7.5F);

		skidsModel[163].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -1.0F, -0.2F, 0.0F, -1.0F, -0.2F, 0.0F, -1.0F, -0.2F, 0.0F, -1.0F, -0.2F, 0.0F, 0.2F, -0.2F, 0.0F, 0.2F, -0.2F, 0.0F, 0.2F, -0.2F, 0.0F, 0.2F, -0.2F); // Box 956
		skidsModel[163].setRotationPoint(-98.6F, -51.05F, 7.5F);

		skidsModel[164].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -1.0F, -0.8F, 0.0F, -1.0F, -0.8F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F, 0.0F, 0.2F, -0.8F, 0.0F, 0.2F, -0.8F); // Box 957
		skidsModel[164].setRotationPoint(-98.6F, -51.05F, 7.5F);

		skidsModel[165].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F); // Box 814
		skidsModel[165].setRotationPoint(-98.6F, -53.05F, -7.7F);

		skidsModel[166].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -0.3F, 0.2F, 0.0F, -0.3F, 0.2F, 0.0F, -0.3F, -1.0F, 0.0F, -0.3F, -1.0F, 0.0F, -0.3F, 0.2F, 0.0F, -0.3F, 0.2F, 0.0F, -0.3F, -1.0F, 0.0F, -0.3F, -1.0F); // Box 815
		skidsModel[166].setRotationPoint(-98.6F, -53.05F, -7.6F);

		skidsModel[167].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0.0F, -0.45F, -0.3F, 0.0F, -0.45F, -0.3F, 0.0F, -0.48F, -0.3F, 0.0F, -0.48F, -0.3F, 0.0F, -0.45F, -0.3F, 0.0F, -0.45F, -0.3F, 0.0F, -0.48F, -0.3F, 0.0F, -0.48F, -0.3F); // Box 816
		skidsModel[167].setRotationPoint(-98.7F, -52.35F, -7.2F);
		skidsModel[167].rotateAngleX = -3.7524579F;

		skidsModel[168].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F); // Box 817
		skidsModel[168].setRotationPoint(-98.6F, -52.35F, -7.2F);

		skidsModel[169].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -1.0F, -0.8F, 0.0F, -1.0F, -0.8F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F, 0.0F, 0.2F, -0.8F, 0.0F, 0.2F, -0.8F); // Box 818
		skidsModel[169].setRotationPoint(-98.6F, -53.15F, -7.6F);

		skidsModel[170].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -1.0F, -0.3F, 0.0F, -1.0F, -0.3F, 0.0F, -1.0F, -0.3F, 0.0F, -1.0F, -0.3F, 0.0F, 0.2F, -0.3F, 0.0F, 0.2F, -0.3F, 0.0F, 0.2F, -0.3F, 0.0F, 0.2F, -0.3F); // Box 819
		skidsModel[170].setRotationPoint(-98.6F, -53.15F, -7.7F);

		skidsModel[171].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -1.0F, -0.8F, 0.0F, -1.0F, -0.8F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, 0.2F, -0.8F, 0.0F, 0.2F, -0.8F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F); // Box 820
		skidsModel[171].setRotationPoint(-98.6F, -53.15F, -7.8F);

		skidsModel[172].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -0.3F, -1.0F, 0.0F, -0.3F, -1.0F, 0.0F, -0.3F, 0.2F, 0.0F, -0.3F, 0.2F, 0.0F, -0.3F, -1.0F, 0.0F, -0.3F, -1.0F, 0.0F, -0.3F, 0.2F, 0.0F, -0.3F, 0.2F); // Box 821
		skidsModel[172].setRotationPoint(-98.6F, -53.05F, -7.8F);

		skidsModel[173].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, 0.2F, -0.8F, 0.0F, 0.2F, -0.8F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F, 0.0F, -1.0F, -0.8F, 0.0F, -1.0F, -0.8F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F); // Box 822
		skidsModel[173].setRotationPoint(-98.6F, -52.95F, -7.8F);

		skidsModel[174].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F, 0.0F, 0.2F, -0.8F, 0.0F, 0.2F, -0.8F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -1.0F, -0.8F, 0.0F, -1.0F, -0.8F); // Box 823
		skidsModel[174].setRotationPoint(-98.6F, -52.95F, -7.6F);

		skidsModel[175].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, 0.2F, -0.3F, 0.0F, 0.2F, -0.3F, 0.0F, 0.2F, -0.3F, 0.0F, 0.2F, -0.3F, 0.0F, -1.0F, -0.3F, 0.0F, -1.0F, -0.3F, 0.0F, -1.0F, -0.3F, 0.0F, -1.0F, -0.3F); // Box 824
		skidsModel[175].setRotationPoint(-98.6F, -52.95F, -7.7F);

		skidsModel[176].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F); // Box 825
		skidsModel[176].setRotationPoint(-98.6F, -53.05F, -5.7F);

		skidsModel[177].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -0.3F, 0.2F, 0.0F, -0.3F, 0.2F, 0.0F, -0.3F, -1.0F, 0.0F, -0.3F, -1.0F, 0.0F, -0.3F, 0.2F, 0.0F, -0.3F, 0.2F, 0.0F, -0.3F, -1.0F, 0.0F, -0.3F, -1.0F); // Box 826
		skidsModel[177].setRotationPoint(-98.6F, -53.05F, -5.6F);

		skidsModel[178].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0.0F, -0.45F, -0.3F, 0.0F, -0.45F, -0.3F, 0.0F, -0.48F, -0.3F, 0.0F, -0.48F, -0.3F, 0.0F, -0.45F, -0.3F, 0.0F, -0.45F, -0.3F, 0.0F, -0.48F, -0.3F, 0.0F, -0.48F, -0.3F); // Box 827
		skidsModel[178].setRotationPoint(-98.7F, -52.35F, -5.2F);
		skidsModel[178].rotateAngleX = -3.7524579F;

		skidsModel[179].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F); // Box 828
		skidsModel[179].setRotationPoint(-98.6F, -52.35F, -5.2F);

		skidsModel[180].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -1.0F, -0.8F, 0.0F, -1.0F, -0.8F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F, 0.0F, 0.2F, -0.8F, 0.0F, 0.2F, -0.8F); // Box 829
		skidsModel[180].setRotationPoint(-98.6F, -53.15F, -5.6F);

		skidsModel[181].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -1.0F, -0.3F, 0.0F, -1.0F, -0.3F, 0.0F, -1.0F, -0.3F, 0.0F, -1.0F, -0.3F, 0.0F, 0.2F, -0.3F, 0.0F, 0.2F, -0.3F, 0.0F, 0.2F, -0.3F, 0.0F, 0.2F, -0.3F); // Box 830
		skidsModel[181].setRotationPoint(-98.6F, -53.15F, -5.7F);

		skidsModel[182].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -1.0F, -0.8F, 0.0F, -1.0F, -0.8F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, 0.2F, -0.8F, 0.0F, 0.2F, -0.8F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F); // Box 831
		skidsModel[182].setRotationPoint(-98.6F, -53.15F, -5.8F);

		skidsModel[183].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -0.3F, -1.0F, 0.0F, -0.3F, -1.0F, 0.0F, -0.3F, 0.2F, 0.0F, -0.3F, 0.2F, 0.0F, -0.3F, -1.0F, 0.0F, -0.3F, -1.0F, 0.0F, -0.3F, 0.2F, 0.0F, -0.3F, 0.2F); // Box 832
		skidsModel[183].setRotationPoint(-98.6F, -53.05F, -5.8F);

		skidsModel[184].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, 0.2F, -0.8F, 0.0F, 0.2F, -0.8F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F, 0.0F, -1.0F, -0.8F, 0.0F, -1.0F, -0.8F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F); // Box 833
		skidsModel[184].setRotationPoint(-98.6F, -52.95F, -5.8F);

		skidsModel[185].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F, 0.0F, 0.2F, -0.8F, 0.0F, 0.2F, -0.8F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -1.0F, -0.8F, 0.0F, -1.0F, -0.8F); // Box 834
		skidsModel[185].setRotationPoint(-98.6F, -52.95F, -5.6F);

		skidsModel[186].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, 0.2F, -0.3F, 0.0F, 0.2F, -0.3F, 0.0F, 0.2F, -0.3F, 0.0F, 0.2F, -0.3F, 0.0F, -1.0F, -0.3F, 0.0F, -1.0F, -0.3F, 0.0F, -1.0F, -0.3F, 0.0F, -1.0F, -0.3F); // Box 835
		skidsModel[186].setRotationPoint(-98.6F, -52.95F, -5.7F);

		skidsModel[187].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F); // Box 983
		skidsModel[187].setRotationPoint(-98.6F, -53.05F, 6.7F);

		skidsModel[188].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -0.3F, -1.0F, 0.0F, -0.3F, -1.0F, 0.0F, -0.3F, 0.2F, 0.0F, -0.3F, 0.2F, 0.0F, -0.3F, -1.0F, 0.0F, -0.3F, -1.0F, 0.0F, -0.3F, 0.2F, 0.0F, -0.3F, 0.2F); // Box 984
		skidsModel[188].setRotationPoint(-98.6F, -53.05F, 6.6F);

		skidsModel[189].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0.0F, -0.48F, -0.3F, 0.0F, -0.48F, -0.3F, 0.0F, -0.45F, -0.3F, 0.0F, -0.45F, -0.3F, 0.0F, -0.48F, -0.3F, 0.0F, -0.48F, -0.3F, 0.0F, -0.45F, -0.3F, 0.0F, -0.45F, -0.3F); // Box 985
		skidsModel[189].setRotationPoint(-98.7F, -52.35F, 7.2F);
		skidsModel[189].rotateAngleX = -3.7524579F;

		skidsModel[190].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F); // Box 986
		skidsModel[190].setRotationPoint(-98.6F, -52.35F, 7.2F);

		skidsModel[191].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -1.0F, -0.8F, 0.0F, -1.0F, -0.8F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, 0.2F, -0.8F, 0.0F, 0.2F, -0.8F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F); // Box 987
		skidsModel[191].setRotationPoint(-98.6F, -53.15F, 6.6F);

		skidsModel[192].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -1.0F, -0.3F, 0.0F, -1.0F, -0.3F, 0.0F, -1.0F, -0.3F, 0.0F, -1.0F, -0.3F, 0.0F, 0.2F, -0.3F, 0.0F, 0.2F, -0.3F, 0.0F, 0.2F, -0.3F, 0.0F, 0.2F, -0.3F); // Box 988
		skidsModel[192].setRotationPoint(-98.6F, -53.15F, 6.7F);

		skidsModel[193].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -1.0F, -0.8F, 0.0F, -1.0F, -0.8F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F, 0.0F, 0.2F, -0.8F, 0.0F, 0.2F, -0.8F); // Box 989
		skidsModel[193].setRotationPoint(-98.6F, -53.15F, 6.8F);

		skidsModel[194].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -0.3F, 0.2F, 0.0F, -0.3F, 0.2F, 0.0F, -0.3F, -1.0F, 0.0F, -0.3F, -1.0F, 0.0F, -0.3F, 0.2F, 0.0F, -0.3F, 0.2F, 0.0F, -0.3F, -1.0F, 0.0F, -0.3F, -1.0F); // Box 990
		skidsModel[194].setRotationPoint(-98.6F, -53.05F, 6.8F);

		skidsModel[195].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F, 0.0F, 0.2F, -0.8F, 0.0F, 0.2F, -0.8F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -1.0F, -0.8F, 0.0F, -1.0F, -0.8F); // Box 991
		skidsModel[195].setRotationPoint(-98.6F, -52.95F, 6.8F);

		skidsModel[196].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, 0.2F, -0.8F, 0.0F, 0.2F, -0.8F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F, 0.0F, -1.0F, -0.8F, 0.0F, -1.0F, -0.8F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F); // Box 992
		skidsModel[196].setRotationPoint(-98.6F, -52.95F, 6.6F);

		skidsModel[197].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, 0.2F, -0.3F, 0.0F, 0.2F, -0.3F, 0.0F, 0.2F, -0.3F, 0.0F, 0.2F, -0.3F, 0.0F, -1.0F, -0.3F, 0.0F, -1.0F, -0.3F, 0.0F, -1.0F, -0.3F, 0.0F, -1.0F, -0.3F); // Box 993
		skidsModel[197].setRotationPoint(-98.6F, -52.95F, 6.7F);

		skidsModel[198].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F); // Box 994
		skidsModel[198].setRotationPoint(-98.6F, -53.05F, 4.7F);

		skidsModel[199].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -0.3F, -1.0F, 0.0F, -0.3F, -1.0F, 0.0F, -0.3F, 0.2F, 0.0F, -0.3F, 0.2F, 0.0F, -0.3F, -1.0F, 0.0F, -0.3F, -1.0F, 0.0F, -0.3F, 0.2F, 0.0F, -0.3F, 0.2F); // Box 995
		skidsModel[199].setRotationPoint(-98.6F, -53.05F, 4.6F);

		skidsModel[200].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0.0F, -0.48F, -0.3F, 0.0F, -0.48F, -0.3F, 0.0F, -0.45F, -0.3F, 0.0F, -0.45F, -0.3F, 0.0F, -0.48F, -0.3F, 0.0F, -0.48F, -0.3F, 0.0F, -0.45F, -0.3F, 0.0F, -0.45F, -0.3F); // Box 996
		skidsModel[200].setRotationPoint(-98.7F, -52.35F, 5.2F);
		skidsModel[200].rotateAngleX = -3.7524579F;

		skidsModel[201].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F); // Box 997
		skidsModel[201].setRotationPoint(-98.6F, -52.35F, 5.2F);

		skidsModel[202].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -1.0F, -0.8F, 0.0F, -1.0F, -0.8F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, 0.2F, -0.8F, 0.0F, 0.2F, -0.8F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F); // Box 998
		skidsModel[202].setRotationPoint(-98.6F, -53.15F, 4.6F);

		skidsModel[203].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -1.0F, -0.3F, 0.0F, -1.0F, -0.3F, 0.0F, -1.0F, -0.3F, 0.0F, -1.0F, -0.3F, 0.0F, 0.2F, -0.3F, 0.0F, 0.2F, -0.3F, 0.0F, 0.2F, -0.3F, 0.0F, 0.2F, -0.3F); // Box 999
		skidsModel[203].setRotationPoint(-98.6F, -53.15F, 4.7F);

		skidsModel[204].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -1.0F, -0.8F, 0.0F, -1.0F, -0.8F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F, 0.0F, 0.2F, -0.8F, 0.0F, 0.2F, -0.8F); // Box 1000
		skidsModel[204].setRotationPoint(-98.6F, -53.15F, 4.8F);

		skidsModel[205].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -0.3F, 0.2F, 0.0F, -0.3F, 0.2F, 0.0F, -0.3F, -1.0F, 0.0F, -0.3F, -1.0F, 0.0F, -0.3F, 0.2F, 0.0F, -0.3F, 0.2F, 0.0F, -0.3F, -1.0F, 0.0F, -0.3F, -1.0F); // Box 1001
		skidsModel[205].setRotationPoint(-98.6F, -53.05F, 4.8F);

		skidsModel[206].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F, 0.0F, 0.2F, -0.8F, 0.0F, 0.2F, -0.8F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -1.0F, -0.8F, 0.0F, -1.0F, -0.8F); // Box 1002
		skidsModel[206].setRotationPoint(-98.6F, -52.95F, 4.8F);

		skidsModel[207].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, 0.2F, -0.8F, 0.0F, 0.2F, -0.8F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F, 0.0F, -1.0F, -0.8F, 0.0F, -1.0F, -0.8F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F); // Box 1003
		skidsModel[207].setRotationPoint(-98.6F, -52.95F, 4.6F);

		skidsModel[208].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, 0.2F, -0.3F, 0.0F, 0.2F, -0.3F, 0.0F, 0.2F, -0.3F, 0.0F, 0.2F, -0.3F, 0.0F, -1.0F, -0.3F, 0.0F, -1.0F, -0.3F, 0.0F, -1.0F, -0.3F, 0.0F, -1.0F, -0.3F); // Box 1004
		skidsModel[208].setRotationPoint(-98.6F, -52.95F, 4.7F);

		skidsModel[209].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -0.4F, -0.2F, 0.0F, -0.4F, -0.2F, 0.0F, -0.8F, -0.4F, 0.0F, -0.8F, -0.4F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F); // Box 1005
		skidsModel[209].setRotationPoint(-98.6F, -52.3F, -1F);

		skidsModel[210].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, -0.8F, 0.0F, -0.6F, -0.8F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, -0.8F, 0.0F, -0.6F, -0.8F); // Box 1006
		skidsModel[210].setRotationPoint(-98.6F, -53.3F, -1F);

		skidsModel[211].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F); // Box 1007
		skidsModel[211].setRotationPoint(-98.6F, -52.3F, 0F);

		skidsModel[212].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.0F, -0.8F, -0.6F, 0.0F, -0.8F, -0.6F, 0.0F, -0.8F, -0.6F, 0.0F, -0.8F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F); // Box 634
		skidsModel[212].setRotationPoint(-98.6F, -50.55F, 11F);

		skidsModel[213].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -0.8F, -0.4F, 0.0F, -0.8F, -0.4F, 0.0F, -0.4F, -0.2F, 0.0F, -0.4F, -0.2F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F); // Box 635
		skidsModel[213].setRotationPoint(-98.6F, -50.55F, 12F);

		skidsModel[214].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.0F, -0.6F, -0.8F, 0.0F, -0.6F, -0.8F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, -0.8F, 0.0F, -0.6F, -0.8F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F); // Box 636
		skidsModel[214].setRotationPoint(-98.6F, -51.55F, 12F);

		skidsModel[215].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.8F, -0.4F, 0.0F, -0.8F, -0.4F, 0.0F, -0.4F, -0.2F, 0.0F, -0.4F, -0.2F); // Box 637
		skidsModel[215].setRotationPoint(-98.6F, -51.55F, 12F);

		skidsModel[216].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, -0.8F, -0.6F, 0.0F, -0.8F, -0.6F, 0.0F, -0.8F, -0.6F, 0.0F, -0.8F, -0.6F); // Box 638
		skidsModel[216].setRotationPoint(-98.6F, -51.55F, 11F);

		skidsModel[217].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, -0.4F, -0.2F, 0.0F, -0.4F, -0.2F, 0.0F, -0.8F, -0.4F, 0.0F, -0.8F, -0.4F); // Box 639
		skidsModel[217].setRotationPoint(-98.6F, -51.55F, 11F);

		skidsModel[218].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, -0.8F, 0.0F, -0.6F, -0.8F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, -0.8F, 0.0F, -0.6F, -0.8F); // Box 640
		skidsModel[218].setRotationPoint(-98.6F, -51.55F, 11F);

		skidsModel[219].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -0.4F, -0.2F, 0.0F, -0.4F, -0.2F, 0.0F, -0.8F, -0.4F, 0.0F, -0.8F, -0.4F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F); // Box 641
		skidsModel[219].setRotationPoint(-98.6F, -50.55F, 11F);

		skidsModel[220].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, -0.9F, -0.4F, 0.0F, -0.9F, -0.4F, 0.0F, -0.9F, -0.4F, 0.0F, -0.9F, -0.4F); // Box 642
		skidsModel[220].setRotationPoint(-98.7F, -50.55F, 12F);
		skidsModel[220].rotateAngleX = 4.712389F;

		skidsModel[221].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, -0.9F, -0.4F, 0.0F, -0.9F, -0.4F, 0.0F, -0.9F, -0.3F, 0.0F, -0.9F, -0.3F); // Box 643
		skidsModel[221].setRotationPoint(-98.7F, -50.55F, 12F);
		skidsModel[221].rotateAngleX = 3.9269907F;

		skidsModel[222].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, -0.9F, -0.4F, 0.0F, -0.9F, -0.4F, 0.0F, -0.9F, -0.4F, 0.0F, -0.9F, -0.4F); // Box 644
		skidsModel[222].setRotationPoint(-98.7F, -50.55F, 12F);
		skidsModel[222].rotateAngleX = 3.1415927F;

		skidsModel[223].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, -0.9F, -0.4F, 0.0F, -0.9F, -0.4F, 0.0F, -0.9F, -0.3F, 0.0F, -0.9F, -0.3F); // Box 645
		skidsModel[223].setRotationPoint(-98.7F, -50.55F, 12F);
		skidsModel[223].rotateAngleX = 2.3561945F;

		skidsModel[224].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, -0.9F, -0.4F, 0.0F, -0.9F, -0.4F, 0.0F, -0.9F, -0.3F, 0.0F, -0.9F, -0.3F); // Box 647
		skidsModel[224].setRotationPoint(-98.7F, -50.55F, 12F);
		skidsModel[224].rotateAngleX = 0.7853982F;

		skidsModel[225].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, -0.9F, -0.4F, 0.0F, -0.9F, -0.4F, 0.0F, -0.9F, -0.4F, 0.0F, -0.9F, -0.4F); // Box 648
		skidsModel[225].setRotationPoint(-98.7F, -50.55F, 12F);

		skidsModel[226].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, -0.9F, -0.4F, 0.0F, -0.9F, -0.4F, 0.0F, -0.9F, -0.3F, 0.0F, -0.9F, -0.3F); // Box 649
		skidsModel[226].setRotationPoint(-98.7F, -50.55F, 12F);
		skidsModel[226].rotateAngleX = 5.497787F;

		skidsModel[227].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F); // Box 650
		skidsModel[227].setRotationPoint(-98.6F, -50.55F, 12F);

		skidsModel[228].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0.0F, -0.45F, -0.3F, 0.0F, -0.45F, -0.3F, 0.0F, -0.48F, 0.0F, 0.0F, -0.48F, 0.0F, 0.0F, -0.45F, -0.3F, 0.0F, -0.45F, -0.3F, 0.0F, -0.48F, 0.0F, 0.0F, -0.48F, 0.0F); // Box 651
		skidsModel[228].setRotationPoint(-98.7F, -50.55F, 12F);
		skidsModel[228].rotateAngleX = -4.363323F;

		skidsModel[229].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F); // Box 652
		skidsModel[229].setRotationPoint(-98.6F, -51.55F, 11F);

		skidsModel[230].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, 0.2F, -0.3F, 0.0F, 0.2F, -0.3F, 0.0F, 0.2F, -0.3F, 0.0F, 0.2F, -0.3F, 0.0F, -1.0F, -0.3F, 0.0F, -1.0F, -0.3F, 0.0F, -1.0F, -0.3F, 0.0F, -1.0F, -0.3F); // Box 772
		skidsModel[230].setRotationPoint(-98.6F, -49.25F, 12.6F);

		skidsModel[231].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, 0.2F, -0.8F, 0.0F, 0.2F, -0.8F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F, 0.0F, -1.0F, -0.8F, 0.0F, -1.0F, -0.8F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F); // Box 773
		skidsModel[231].setRotationPoint(-98.6F, -49.25F, 12.5F);

		skidsModel[232].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -0.3F, -1.0F, 0.0F, -0.3F, -1.0F, 0.0F, -0.3F, 0.2F, 0.0F, -0.3F, 0.2F, 0.0F, -0.3F, -1.0F, 0.0F, -0.3F, -1.0F, 0.0F, -0.3F, 0.2F, 0.0F, -0.3F, 0.2F); // Box 774
		skidsModel[232].setRotationPoint(-98.6F, -49.35F, 12.5F);

		skidsModel[233].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -1.0F, -0.8F, 0.0F, -1.0F, -0.8F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, 0.2F, -0.8F, 0.0F, 0.2F, -0.8F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F); // Box 775
		skidsModel[233].setRotationPoint(-98.6F, -49.45F, 12.5F);

		skidsModel[234].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -1.0F, -0.3F, 0.0F, -1.0F, -0.3F, 0.0F, -1.0F, -0.3F, 0.0F, -1.0F, -0.3F, 0.0F, 0.2F, -0.3F, 0.0F, 0.2F, -0.3F, 0.0F, 0.2F, -0.3F, 0.0F, 0.2F, -0.3F); // Box 776
		skidsModel[234].setRotationPoint(-98.6F, -49.45F, 12.6F);

		skidsModel[235].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -1.0F, -0.8F, 0.0F, -1.0F, -0.8F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F, 0.0F, 0.2F, -0.8F, 0.0F, 0.2F, -0.8F); // Box 777
		skidsModel[235].setRotationPoint(-98.6F, -49.45F, 12.7F);

		skidsModel[236].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -0.3F, 0.2F, 0.0F, -0.3F, 0.2F, 0.0F, -0.3F, -1.0F, 0.0F, -0.3F, -1.0F, 0.0F, -0.3F, 0.2F, 0.0F, -0.3F, 0.2F, 0.0F, -0.3F, -1.0F, 0.0F, -0.3F, -1.0F); // Box 778
		skidsModel[236].setRotationPoint(-98.6F, -49.35F, 12.7F);

		skidsModel[237].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F, 0.0F, 0.2F, -0.8F, 0.0F, 0.2F, -0.8F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -1.0F, -0.8F, 0.0F, -1.0F, -0.8F); // Box 779
		skidsModel[237].setRotationPoint(-98.6F, -49.25F, 12.7F);

		skidsModel[238].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0.0F, -0.45F, -0.3F, 0.0F, -0.45F, -0.3F, 0.0F, -0.48F, -0.3F, 0.0F, -0.48F, -0.3F, 0.0F, -0.45F, -0.3F, 0.0F, -0.45F, -0.3F, 0.0F, -0.48F, -0.3F, 0.0F, -0.48F, -0.3F); // Box 780
		skidsModel[238].setRotationPoint(-98.7F, -48.65F, 13.1F);
		skidsModel[238].rotateAngleX = -3.7524579F;

		skidsModel[239].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F); // Box 781
		skidsModel[239].setRotationPoint(-98.6F, -48.65F, 13.1F);

		skidsModel[240].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F); // Box 782
		skidsModel[240].setRotationPoint(-98.6F, -49.35F, 12.6F);

		skidsModel[241].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, 0.2F, -0.3F, 0.0F, 0.2F, -0.3F, 0.0F, 0.2F, -0.3F, 0.0F, 0.2F, -0.3F, 0.0F, -1.0F, -0.3F, 0.0F, -1.0F, -0.3F, 0.0F, -1.0F, -0.3F, 0.0F, -1.0F, -0.3F); // Box 783
		skidsModel[241].setRotationPoint(-98.6F, -47.95F, 12.6F);

		skidsModel[242].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, 0.2F, -0.8F, 0.0F, 0.2F, -0.8F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F, 0.0F, -1.0F, -0.8F, 0.0F, -1.0F, -0.8F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F); // Box 784
		skidsModel[242].setRotationPoint(-98.6F, -47.95F, 12.5F);

		skidsModel[243].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -0.3F, -1.0F, 0.0F, -0.3F, -1.0F, 0.0F, -0.3F, 0.2F, 0.0F, -0.3F, 0.2F, 0.0F, -0.3F, -1.0F, 0.0F, -0.3F, -1.0F, 0.0F, -0.3F, 0.2F, 0.0F, -0.3F, 0.2F); // Box 785
		skidsModel[243].setRotationPoint(-98.6F, -48.05F, 12.5F);

		skidsModel[244].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -1.0F, -0.8F, 0.0F, -1.0F, -0.8F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, 0.2F, -0.8F, 0.0F, 0.2F, -0.8F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F); // Box 786
		skidsModel[244].setRotationPoint(-98.6F, -48.15F, 12.5F);

		skidsModel[245].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -1.0F, -0.3F, 0.0F, -1.0F, -0.3F, 0.0F, -1.0F, -0.3F, 0.0F, -1.0F, -0.3F, 0.0F, 0.2F, -0.3F, 0.0F, 0.2F, -0.3F, 0.0F, 0.2F, -0.3F, 0.0F, 0.2F, -0.3F); // Box 787
		skidsModel[245].setRotationPoint(-98.6F, -48.15F, 12.6F);

		skidsModel[246].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -1.0F, -0.8F, 0.0F, -1.0F, -0.8F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F, 0.0F, 0.2F, -0.8F, 0.0F, 0.2F, -0.8F); // Box 788
		skidsModel[246].setRotationPoint(-98.6F, -48.15F, 12.7F);

		skidsModel[247].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -0.3F, 0.2F, 0.0F, -0.3F, 0.2F, 0.0F, -0.3F, -1.0F, 0.0F, -0.3F, -1.0F, 0.0F, -0.3F, 0.2F, 0.0F, -0.3F, 0.2F, 0.0F, -0.3F, -1.0F, 0.0F, -0.3F, -1.0F); // Box 789
		skidsModel[247].setRotationPoint(-98.6F, -48.05F, 12.7F);

		skidsModel[248].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F, 0.0F, 0.2F, -0.8F, 0.0F, 0.2F, -0.8F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -1.0F, -0.8F, 0.0F, -1.0F, -0.8F); // Box 790
		skidsModel[248].setRotationPoint(-98.6F, -47.95F, 12.7F);

		skidsModel[249].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0.0F, -0.45F, -0.3F, 0.0F, -0.45F, -0.3F, 0.0F, -0.48F, -0.3F, 0.0F, -0.48F, -0.3F, 0.0F, -0.45F, -0.3F, 0.0F, -0.45F, -0.3F, 0.0F, -0.48F, -0.3F, 0.0F, -0.48F, -0.3F); // Box 791
		skidsModel[249].setRotationPoint(-98.7F, -47.55F, 13.1F);
		skidsModel[249].rotateAngleX = 4.2586036F;

		skidsModel[250].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F); // Box 792
		skidsModel[250].setRotationPoint(-98.6F, -47.55F, 13.1F);

		skidsModel[251].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F); // Box 793
		skidsModel[251].setRotationPoint(-98.6F, -48.05F, 12.6F);

		skidsModel[252].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0.0F, -0.45F, -0.3F, 0.0F, -0.45F, -0.3F, 0.0F, -0.48F, -0.3F, 0.0F, -0.48F, -0.3F, 0.0F, -0.45F, -0.3F, 0.0F, -0.45F, -0.3F, 0.0F, -0.48F, -0.3F, 0.0F, -0.48F, -0.3F); // Box 794
		skidsModel[252].setRotationPoint(-98.7F, -47.55F, 13.1F);
		skidsModel[252].rotateAngleX = 4.9741883F;

		skidsModel[253].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F); // Box 877
		skidsModel[253].setRotationPoint(-98.7F, -49.75F, 9.5F);

		skidsModel[254].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F); // Box 878
		skidsModel[254].setRotationPoint(-98.6F, -49.25F, 10F);

		skidsModel[255].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, -1.0F, 0.0F, -0.2F, -1.0F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, -1.0F, 0.0F, -0.2F, -1.0F); // Box 879
		skidsModel[255].setRotationPoint(-98.6F, -49.75F, 9.5F);

		skidsModel[256].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, 0.2F, -0.2F, 0.0F, 0.2F, -0.2F, 0.0F, 0.2F, -0.2F, 0.0F, 0.2F, -0.2F, 0.0F, -1.0F, -0.2F, 0.0F, -1.0F, -0.2F, 0.0F, -1.0F, -0.2F, 0.0F, -1.0F, -0.2F); // Box 880
		skidsModel[256].setRotationPoint(-98.6F, -49.75F, 9.5F);

		skidsModel[257].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F, 0.0F, 0.2F, -0.8F, 0.0F, 0.2F, -0.8F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -1.0F, -0.8F, 0.0F, -1.0F, -0.8F); // Box 881
		skidsModel[257].setRotationPoint(-98.6F, -49.75F, 9.5F);

		skidsModel[258].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, 0.2F, -0.8F, 0.0F, 0.2F, -0.8F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F, 0.0F, -1.0F, -0.8F, 0.0F, -1.0F, -0.8F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F); // Box 882
		skidsModel[258].setRotationPoint(-98.6F, -49.75F, 9.5F);

		skidsModel[259].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -0.2F, -1.0F, 0.0F, -0.2F, -1.0F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, -1.0F, 0.0F, -0.2F, -1.0F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F); // Box 883
		skidsModel[259].setRotationPoint(-98.6F, -49.75F, 9.5F);

		skidsModel[260].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0.0F, -0.45F, -0.3F, 0.0F, -0.45F, -0.3F, 0.0F, -0.48F, -0.3F, 0.0F, -0.48F, -0.3F, 0.0F, -0.45F, -0.3F, 0.0F, -0.45F, -0.3F, 0.0F, -0.48F, -0.3F, 0.0F, -0.48F, -0.3F); // Box 884
		skidsModel[260].setRotationPoint(-98.7F, -49.25F, 10F);
		skidsModel[260].rotateAngleX = 4.5553093F;

		skidsModel[261].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -1.0F, -0.8F, 0.0F, -1.0F, -0.8F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F, 0.0F, 0.2F, -0.8F, 0.0F, 0.2F, -0.8F); // Box 885
		skidsModel[261].setRotationPoint(-98.6F, -49.75F, 9.5F);

		skidsModel[262].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -1.0F, -0.2F, 0.0F, -1.0F, -0.2F, 0.0F, -1.0F, -0.2F, 0.0F, -1.0F, -0.2F, 0.0F, 0.2F, -0.2F, 0.0F, 0.2F, -0.2F, 0.0F, 0.2F, -0.2F, 0.0F, 0.2F, -0.2F); // Box 886
		skidsModel[262].setRotationPoint(-98.6F, -49.75F, 9.5F);

		skidsModel[263].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -1.0F, -0.8F, 0.0F, -1.0F, -0.8F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, 0.2F, -0.8F, 0.0F, 0.2F, -0.8F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F); // Box 887
		skidsModel[263].setRotationPoint(-98.6F, -49.75F, 9.5F);

		skidsModel[264].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.0F, -0.8F, -0.6F, 0.0F, -0.8F, -0.6F, 0.0F, -0.8F, -0.6F, 0.0F, -0.8F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F); // Box 1061
		skidsModel[264].setRotationPoint(-98.6F, -50.55F, -13F);

		skidsModel[265].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -0.4F, -0.2F, 0.0F, -0.4F, -0.2F, 0.0F, -0.8F, -0.4F, 0.0F, -0.8F, -0.4F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F); // Box 1062
		skidsModel[265].setRotationPoint(-98.6F, -50.55F, -13F);

		skidsModel[266].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, -0.8F, 0.0F, -0.6F, -0.8F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, -0.8F, 0.0F, -0.6F, -0.8F); // Box 1063
		skidsModel[266].setRotationPoint(-98.6F, -51.55F, -13F);

		skidsModel[267].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, -0.4F, -0.2F, 0.0F, -0.4F, -0.2F, 0.0F, -0.8F, -0.4F, 0.0F, -0.8F, -0.4F); // Box 1064
		skidsModel[267].setRotationPoint(-98.6F, -51.55F, -13F);

		skidsModel[268].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, -0.8F, -0.6F, 0.0F, -0.8F, -0.6F, 0.0F, -0.8F, -0.6F, 0.0F, -0.8F, -0.6F); // Box 1065
		skidsModel[268].setRotationPoint(-98.6F, -51.55F, -13F);

		skidsModel[269].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.8F, -0.4F, 0.0F, -0.8F, -0.4F, 0.0F, -0.4F, -0.2F, 0.0F, -0.4F, -0.2F); // Box 1066
		skidsModel[269].setRotationPoint(-98.6F, -51.55F, -12F);

		skidsModel[270].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.0F, -0.6F, -0.8F, 0.0F, -0.6F, -0.8F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, -0.8F, 0.0F, -0.6F, -0.8F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F); // Box 1067
		skidsModel[270].setRotationPoint(-98.6F, -51.55F, -12F);

		skidsModel[271].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -0.8F, -0.4F, 0.0F, -0.8F, -0.4F, 0.0F, -0.4F, -0.2F, 0.0F, -0.4F, -0.2F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F); // Box 1068
		skidsModel[271].setRotationPoint(-98.6F, -50.55F, -12F);

		skidsModel[272].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, -0.9F, -0.4F, 0.0F, -0.9F, -0.4F, 0.0F, -0.9F, -0.4F, 0.0F, -0.9F, -0.4F); // Box 1069
		skidsModel[272].setRotationPoint(-98.7F, -50.55F, -12F);
		skidsModel[272].rotateAngleX = 4.712389F;

		skidsModel[273].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, -0.9F, -0.3F, 0.0F, -0.9F, -0.3F, 0.0F, -0.9F, -0.4F, 0.0F, -0.9F, -0.4F); // Box 1070
		skidsModel[273].setRotationPoint(-98.7F, -50.55F, -12F);
		skidsModel[273].rotateAngleX = 3.9269907F;

		skidsModel[274].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, -0.9F, -0.4F, 0.0F, -0.9F, -0.4F, 0.0F, -0.9F, -0.4F, 0.0F, -0.9F, -0.4F); // Box 1071
		skidsModel[274].setRotationPoint(-98.7F, -50.55F, -12F);
		skidsModel[274].rotateAngleX = 3.1415927F;

		skidsModel[275].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, -0.9F, -0.3F, 0.0F, -0.9F, -0.3F, 0.0F, -0.9F, -0.4F, 0.0F, -0.9F, -0.4F); // Box 1072
		skidsModel[275].setRotationPoint(-98.7F, -50.55F, -12F);
		skidsModel[275].rotateAngleX = 2.3561945F;

		skidsModel[276].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, -0.9F, -0.4F, 0.0F, -0.9F, -0.4F, 0.0F, -0.9F, -0.4F, 0.0F, -0.9F, -0.4F); // Box 1073
		skidsModel[276].setRotationPoint(-98.7F, -50.55F, -12F);
		skidsModel[276].rotateAngleX = 1.5707964F;

		skidsModel[277].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, -0.9F, -0.3F, 0.0F, -0.9F, -0.3F, 0.0F, -0.9F, -0.4F, 0.0F, -0.9F, -0.4F); // Box 1074
		skidsModel[277].setRotationPoint(-98.7F, -50.55F, -12F);
		skidsModel[277].rotateAngleX = 0.7853982F;

		skidsModel[278].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, -0.9F, -0.4F, 0.0F, -0.9F, -0.4F, 0.0F, -0.9F, -0.4F, 0.0F, -0.9F, -0.4F); // Box 1075
		skidsModel[278].setRotationPoint(-98.7F, -50.55F, -12F);

		skidsModel[279].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, -0.9F, -0.3F, 0.0F, -0.9F, -0.3F, 0.0F, -0.9F, -0.4F, 0.0F, -0.9F, -0.4F); // Box 1076
		skidsModel[279].setRotationPoint(-98.7F, -50.55F, -12F);
		skidsModel[279].rotateAngleX = 5.497787F;

		skidsModel[280].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F); // Box 1077
		skidsModel[280].setRotationPoint(-98.6F, -50.55F, -12F);

		skidsModel[281].addShapeBox(0F, 0.5F, -1.2F, 1, 1, 1, 0F,0.0F, -0.48F, 0.0F, 0.0F, -0.48F, 0.0F, 0.0F, -0.45F, -0.3F, 0.0F, -0.45F, -0.3F, 0.0F, -0.48F, 0.0F, 0.0F, -0.48F, 0.0F, 0.0F, -0.45F, -0.3F, 0.0F, -0.45F, -0.3F); // Box 1078
		skidsModel[281].setRotationPoint(-98.7F, -50.55F, -13F);
		skidsModel[281].rotateAngleX = -4.363323F;

		skidsModel[282].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F); // Box 1079
		skidsModel[282].setRotationPoint(-98.6F, -51.55F, -13F);

		skidsModel[283].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, 0.2F, -0.3F, 0.0F, 0.2F, -0.3F, 0.0F, 0.2F, -0.3F, 0.0F, 0.2F, -0.3F, 0.0F, -1.0F, -0.3F, 0.0F, -1.0F, -0.3F, 0.0F, -1.0F, -0.3F, 0.0F, -1.0F, -0.3F); // Box 1080
		skidsModel[283].setRotationPoint(-98.6F, -49.25F, -13.6F);

		skidsModel[284].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F, 0.0F, 0.2F, -0.8F, 0.0F, 0.2F, -0.8F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -1.0F, -0.8F, 0.0F, -1.0F, -0.8F); // Box 1081
		skidsModel[284].setRotationPoint(-98.6F, -49.25F, -13.5F);

		skidsModel[285].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -0.3F, 0.2F, 0.0F, -0.3F, 0.2F, 0.0F, -0.3F, -1.0F, 0.0F, -0.3F, -1.0F, 0.0F, -0.3F, 0.2F, 0.0F, -0.3F, 0.2F, 0.0F, -0.3F, -1.0F, 0.0F, -0.3F, -1.0F); // Box 1082
		skidsModel[285].setRotationPoint(-98.6F, -49.35F, -13.5F);

		skidsModel[286].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -1.0F, -0.8F, 0.0F, -1.0F, -0.8F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F, 0.0F, 0.2F, -0.8F, 0.0F, 0.2F, -0.8F); // Box 1083
		skidsModel[286].setRotationPoint(-98.6F, -49.45F, -13.5F);

		skidsModel[287].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -1.0F, -0.3F, 0.0F, -1.0F, -0.3F, 0.0F, -1.0F, -0.3F, 0.0F, -1.0F, -0.3F, 0.0F, 0.2F, -0.3F, 0.0F, 0.2F, -0.3F, 0.0F, 0.2F, -0.3F, 0.0F, 0.2F, -0.3F); // Box 1084
		skidsModel[287].setRotationPoint(-98.6F, -49.45F, -13.6F);

		skidsModel[288].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -1.0F, -0.8F, 0.0F, -1.0F, -0.8F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, 0.2F, -0.8F, 0.0F, 0.2F, -0.8F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F); // Box 1085
		skidsModel[288].setRotationPoint(-98.6F, -49.45F, -13.7F);

		skidsModel[289].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -0.3F, -1.0F, 0.0F, -0.3F, -1.0F, 0.0F, -0.3F, 0.2F, 0.0F, -0.3F, 0.2F, 0.0F, -0.3F, -1.0F, 0.0F, -0.3F, -1.0F, 0.0F, -0.3F, 0.2F, 0.0F, -0.3F, 0.2F); // Box 1086
		skidsModel[289].setRotationPoint(-98.6F, -49.35F, -13.7F);

		skidsModel[290].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, 0.2F, -0.8F, 0.0F, 0.2F, -0.8F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F, 0.0F, -1.0F, -0.8F, 0.0F, -1.0F, -0.8F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F); // Box 1087
		skidsModel[290].setRotationPoint(-98.6F, -49.25F, -13.7F);

		skidsModel[291].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0.0F, -0.48F, -0.3F, 0.0F, -0.48F, -0.3F, 0.0F, -0.45F, -0.3F, 0.0F, -0.45F, -0.3F, 0.0F, -0.48F, -0.3F, 0.0F, -0.48F, -0.3F, 0.0F, -0.45F, -0.3F, 0.0F, -0.45F, -0.3F); // Box 1088
		skidsModel[291].setRotationPoint(-98.7F, -48.65F, -13.1F);
		skidsModel[291].rotateAngleX = -3.7524579F;

		skidsModel[292].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F); // Box 1089
		skidsModel[292].setRotationPoint(-98.6F, -48.65F, -13.1F);

		skidsModel[293].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F); // Box 1090
		skidsModel[293].setRotationPoint(-98.6F, -49.35F, -13.6F);

		skidsModel[294].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, 0.2F, -0.3F, 0.0F, 0.2F, -0.3F, 0.0F, 0.2F, -0.3F, 0.0F, 0.2F, -0.3F, 0.0F, -1.0F, -0.3F, 0.0F, -1.0F, -0.3F, 0.0F, -1.0F, -0.3F, 0.0F, -1.0F, -0.3F); // Box 1091
		skidsModel[294].setRotationPoint(-98.6F, -47.95F, -13.6F);

		skidsModel[295].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F, 0.0F, 0.2F, -0.8F, 0.0F, 0.2F, -0.8F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -1.0F, -0.8F, 0.0F, -1.0F, -0.8F); // Box 1092
		skidsModel[295].setRotationPoint(-98.6F, -47.95F, -13.5F);

		skidsModel[296].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -0.3F, 0.2F, 0.0F, -0.3F, 0.2F, 0.0F, -0.3F, -1.0F, 0.0F, -0.3F, -1.0F, 0.0F, -0.3F, 0.2F, 0.0F, -0.3F, 0.2F, 0.0F, -0.3F, -1.0F, 0.0F, -0.3F, -1.0F); // Box 1093
		skidsModel[296].setRotationPoint(-98.6F, -48.05F, -13.5F);

		skidsModel[297].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -1.0F, -0.8F, 0.0F, -1.0F, -0.8F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F, 0.0F, 0.2F, -0.8F, 0.0F, 0.2F, -0.8F); // Box 1094
		skidsModel[297].setRotationPoint(-98.6F, -48.15F, -13.5F);

		skidsModel[298].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -1.0F, -0.3F, 0.0F, -1.0F, -0.3F, 0.0F, -1.0F, -0.3F, 0.0F, -1.0F, -0.3F, 0.0F, 0.2F, -0.3F, 0.0F, 0.2F, -0.3F, 0.0F, 0.2F, -0.3F, 0.0F, 0.2F, -0.3F); // Box 1095
		skidsModel[298].setRotationPoint(-98.6F, -48.15F, -13.6F);

		skidsModel[299].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -1.0F, -0.8F, 0.0F, -1.0F, -0.8F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, 0.2F, -0.8F, 0.0F, 0.2F, -0.8F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F); // Box 1096
		skidsModel[299].setRotationPoint(-98.6F, -48.15F, -13.7F);

		skidsModel[300].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -0.3F, -1.0F, 0.0F, -0.3F, -1.0F, 0.0F, -0.3F, 0.2F, 0.0F, -0.3F, 0.2F, 0.0F, -0.3F, -1.0F, 0.0F, -0.3F, -1.0F, 0.0F, -0.3F, 0.2F, 0.0F, -0.3F, 0.2F); // Box 1097
		skidsModel[300].setRotationPoint(-98.6F, -48.05F, -13.7F);

		skidsModel[301].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, 0.2F, -0.8F, 0.0F, 0.2F, -0.8F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F, 0.0F, -1.0F, -0.8F, 0.0F, -1.0F, -0.8F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F); // Box 1098
		skidsModel[301].setRotationPoint(-98.6F, -47.95F, -13.7F);

		skidsModel[302].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0.0F, -0.48F, -0.3F, 0.0F, -0.48F, -0.3F, 0.0F, -0.45F, -0.3F, 0.0F, -0.45F, -0.3F, 0.0F, -0.48F, -0.3F, 0.0F, -0.48F, -0.3F, 0.0F, -0.45F, -0.3F, 0.0F, -0.45F, -0.3F); // Box 1099
		skidsModel[302].setRotationPoint(-98.7F, -47.55F, -13.1F);
		skidsModel[302].rotateAngleX = 4.2586036F;

		skidsModel[303].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F); // Box 1100
		skidsModel[303].setRotationPoint(-98.6F, -47.55F, -13.1F);

		skidsModel[304].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F); // Box 1101
		skidsModel[304].setRotationPoint(-98.6F, -48.05F, -13.6F);

		skidsModel[305].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0.0F, -0.48F, -0.3F, 0.0F, -0.48F, -0.3F, 0.0F, -0.45F, -0.3F, 0.0F, -0.45F, -0.3F, 0.0F, -0.48F, -0.3F, 0.0F, -0.48F, -0.3F, 0.0F, -0.45F, -0.3F, 0.0F, -0.45F, -0.3F); // Box 1102
		skidsModel[305].setRotationPoint(-98.7F, -47.55F, -13.1F);
		skidsModel[305].rotateAngleX = 4.9741883F;

		skidsModel[306].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F); // Box 1103
		skidsModel[306].setRotationPoint(-98.7F, -49.75F, -10.5F);

		skidsModel[307].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F); // Box 1104
		skidsModel[307].setRotationPoint(-98.6F, -49.25F, -10F);

		skidsModel[308].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -0.2F, -1.0F, 0.0F, -0.2F, -1.0F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, -1.0F, 0.0F, -0.2F, -1.0F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F); // Box 1105
		skidsModel[308].setRotationPoint(-98.6F, -49.75F, -10.5F);

		skidsModel[309].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, 0.2F, -0.2F, 0.0F, 0.2F, -0.2F, 0.0F, 0.2F, -0.2F, 0.0F, 0.2F, -0.2F, 0.0F, -1.0F, -0.2F, 0.0F, -1.0F, -0.2F, 0.0F, -1.0F, -0.2F, 0.0F, -1.0F, -0.2F); // Box 1106
		skidsModel[309].setRotationPoint(-98.6F, -49.75F, -10.5F);

		skidsModel[310].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, 0.2F, -0.8F, 0.0F, 0.2F, -0.8F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F, 0.0F, -1.0F, -0.8F, 0.0F, -1.0F, -0.8F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F); // Box 1107
		skidsModel[310].setRotationPoint(-98.6F, -49.75F, -10.5F);

		skidsModel[311].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F, 0.0F, 0.2F, -0.8F, 0.0F, 0.2F, -0.8F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -1.0F, -0.8F, 0.0F, -1.0F, -0.8F); // Box 1108
		skidsModel[311].setRotationPoint(-98.6F, -49.75F, -10.5F);

		skidsModel[312].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, -1.0F, 0.0F, -0.2F, -1.0F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, -1.0F, 0.0F, -0.2F, -1.0F); // Box 1109
		skidsModel[312].setRotationPoint(-98.6F, -49.75F, -10.5F);

		skidsModel[313].addShapeBox(0F, -0.5F, -0.75F, 1, 1, 1, 0F,0.0F, -0.48F, -0.3F, 0.0F, -0.48F, -0.3F, 0.0F, -0.45F, -0.3F, 0.0F, -0.45F, -0.3F, 0.0F, -0.48F, -0.3F, 0.0F, -0.48F, -0.3F, 0.0F, -0.45F, -0.3F, 0.0F, -0.45F, -0.3F); // Box 1110
		skidsModel[313].setRotationPoint(-98.7F, -49.25F, -10F);
		skidsModel[313].rotateAngleX = 4.5553093F;

		skidsModel[314].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -1.0F, -0.8F, 0.0F, -1.0F, -0.8F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, 0.2F, -0.8F, 0.0F, 0.2F, -0.8F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F); // Box 1111
		skidsModel[314].setRotationPoint(-98.6F, -49.75F, -10.5F);

		skidsModel[315].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -1.0F, -0.2F, 0.0F, -1.0F, -0.2F, 0.0F, -1.0F, -0.2F, 0.0F, -1.0F, -0.2F, 0.0F, 0.2F, -0.2F, 0.0F, 0.2F, -0.2F, 0.0F, 0.2F, -0.2F, 0.0F, 0.2F, -0.2F); // Box 1112
		skidsModel[315].setRotationPoint(-98.6F, -49.75F, -10.5F);

		skidsModel[316].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -1.0F, -0.8F, 0.0F, -1.0F, -0.8F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F, 0.0F, 0.2F, -0.8F, 0.0F, 0.2F, -0.8F); // Box 1113
		skidsModel[316].setRotationPoint(-98.6F, -49.75F, -10.5F);
	}

	private void initPropeller()
	{
		propellerModels = new ModelRendererTurbo[2][3];
		propellerModels[0] = makeProp1(-135F, -29.5F, -50F);
		propellerModels[1] = makeProp2(-135F, -29.5F, 50F);
	}

	private ModelRendererTurbo[] makeProp1(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[3];
		prop[0] = new ModelRendererTurbo(this, 0, 56, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 56, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 0, 56, textureX, textureY);
		prop[0].addBox(-0.5F, -35F, -2.5F, 1, 35, 5, 0.0F);
		prop[1].addBox(-0.5F, -35F, -2.5F, 1, 35, 5, 0.0F);
		prop[2].addBox(-0.5F, -35F, -2.5F, 1, 35, 5, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		return prop;
	}

	private ModelRendererTurbo[] makeProp2(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[3];
		prop[0] = new ModelRendererTurbo(this, 0, 56, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 56, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 0, 56, textureX, textureY);
		prop[0].addBox(-0.5F, -35F, -2.5F, 1, 35, 5, 0.0F);
		prop[1].addBox(-0.5F, -35F, -2.5F, 1, 35, 5, 0.0F);
		prop[2].addBox(-0.5F, -35F, -2.5F, 1, 35, 5, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		return prop;
	}
}