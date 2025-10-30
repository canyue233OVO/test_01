//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2025 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Chengdu6
// Model Creator: 
// Created on: 25.04.2020 - 12:08:47
// Last changed on: 25.04.2020 - 12:08:47

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelChengdu6 extends ModelPlane //Same as Filename
{
	int textureX = 2048;
	int textureY = 1024;

	public ModelChengdu6() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[208];
		noseModel = new ModelRendererTurbo[23];
		tailModel = new ModelRendererTurbo[13];
		bayModel = new ModelRendererTurbo[114];
		leftWingModel = new ModelRendererTurbo[7];
		rightWingModel = new ModelRendererTurbo[6];
		pitchFlapLeftWingModel = new ModelRendererTurbo[2];
		pitchFlapRightWingModel = new ModelRendererTurbo[2];
		bodyWheelModel = new ModelRendererTurbo[30];
		bodyDoorOpenModel = new ModelRendererTurbo[6];
		bodyDoorCloseModel = new ModelRendererTurbo[4];
		hudModel = new ModelRendererTurbo[2];

		initbodyModel_1();
		initnoseModel_1();
		inittailModel_1();
		initbayModel_1();
		initleftWingModel_1();
		initrightWingModel_1();
		initpitchFlapLeftWingModel_1();
		initpitchFlapRightWingModel_1();
		initbodyWheelModel_1();
		initbodyDoorOpenModel_1();
		initbodyDoorCloseModel_1();
		inithudModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 4
		bodyModel[4] = new ModelRendererTurbo(this, 641, 1, textureX, textureY); // Box 5
		bodyModel[5] = new ModelRendererTurbo(this, 801, 1, textureX, textureY); // Box 6
		bodyModel[6] = new ModelRendererTurbo(this, 945, 1, textureX, textureY); // Box 7
		bodyModel[7] = new ModelRendererTurbo(this, 1089, 1, textureX, textureY); // Box 8
		bodyModel[8] = new ModelRendererTurbo(this, 1249, 1, textureX, textureY); // Box 9
		bodyModel[9] = new ModelRendererTurbo(this, 1409, 1, textureX, textureY); // Box 10
		bodyModel[10] = new ModelRendererTurbo(this, 1553, 1, textureX, textureY); // Box 11
		bodyModel[11] = new ModelRendererTurbo(this, 1697, 1, textureX, textureY); // Box 14
		bodyModel[12] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 15
		bodyModel[13] = new ModelRendererTurbo(this, 1889, 1, textureX, textureY); // Box 16
		bodyModel[14] = new ModelRendererTurbo(this, 1913, 1, textureX, textureY); // Box 17
		bodyModel[15] = new ModelRendererTurbo(this, 1937, 1, textureX, textureY); // Box 18
		bodyModel[16] = new ModelRendererTurbo(this, 1961, 1, textureX, textureY); // Box 19
		bodyModel[17] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 20
		bodyModel[18] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 21
		bodyModel[19] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 22
		bodyModel[20] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 23
		bodyModel[21] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 24
		bodyModel[22] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 25
		bodyModel[23] = new ModelRendererTurbo(this, 577, 17, textureX, textureY); // Box 26
		bodyModel[24] = new ModelRendererTurbo(this, 601, 17, textureX, textureY); // Box 27
		bodyModel[25] = new ModelRendererTurbo(this, 681, 17, textureX, textureY); // Box 28
		bodyModel[26] = new ModelRendererTurbo(this, 849, 17, textureX, textureY); // Box 29
		bodyModel[27] = new ModelRendererTurbo(this, 1041, 17, textureX, textureY); // Box 30
		bodyModel[28] = new ModelRendererTurbo(this, 1209, 17, textureX, textureY); // Box 31
		bodyModel[29] = new ModelRendererTurbo(this, 1313, 17, textureX, textureY); // Box 32
		bodyModel[30] = new ModelRendererTurbo(this, 1489, 17, textureX, textureY); // Box 35
		bodyModel[31] = new ModelRendererTurbo(this, 1593, 17, textureX, textureY); // Box 36
		bodyModel[32] = new ModelRendererTurbo(this, 290, 421, textureX, textureY); // Box 37
		bodyModel[33] = new ModelRendererTurbo(this, 873, 33, textureX, textureY); // Box 38
		bodyModel[34] = new ModelRendererTurbo(this, 1769, 41, textureX, textureY); // Box 40
		bodyModel[35] = new ModelRendererTurbo(this, 473, 49, textureX, textureY); // Box 41
		bodyModel[36] = new ModelRendererTurbo(this, 473, 81, textureX, textureY); // Box 38
		bodyModel[37] = new ModelRendererTurbo(this, 1041, 33, textureX, textureY); // Box 39
		bodyModel[38] = new ModelRendererTurbo(this, 1241, 81, textureX, textureY); // Box 40
		bodyModel[39] = new ModelRendererTurbo(this, 1385, 81, textureX, textureY); // Box 41
		bodyModel[40] = new ModelRendererTurbo(this, 1529, 81, textureX, textureY); // Box 42
		bodyModel[41] = new ModelRendererTurbo(this, 1649, 89, textureX, textureY); // Box 43
		bodyModel[42] = new ModelRendererTurbo(this, 593, 97, textureX, textureY); // Box 44
		bodyModel[43] = new ModelRendererTurbo(this, 1769, 25, textureX, textureY); // Box 45
		bodyModel[44] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 47
		bodyModel[45] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 48
		bodyModel[46] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 49
		bodyModel[47] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 50
		bodyModel[48] = new ModelRendererTurbo(this, 1161, 33, textureX, textureY); // Box 51
		bodyModel[49] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 52
		bodyModel[50] = new ModelRendererTurbo(this, 729, 97, textureX, textureY); // Box 53
		bodyModel[51] = new ModelRendererTurbo(this, 1745, 105, textureX, textureY); // Box 54
		bodyModel[52] = new ModelRendererTurbo(this, 1865, 105, textureX, textureY); // Box 55
		bodyModel[53] = new ModelRendererTurbo(this, 1241, 113, textureX, textureY); // Box 56
		bodyModel[54] = new ModelRendererTurbo(this, 1321, 121, textureX, textureY); // Box 57
		bodyModel[55] = new ModelRendererTurbo(this, 1385, 145, textureX, textureY); // Box 58
		bodyModel[56] = new ModelRendererTurbo(this, 1681, 177, textureX, textureY); // Box 60
		bodyModel[57] = new ModelRendererTurbo(this, 801, 97, textureX, textureY); // Box 61
		bodyModel[58] = new ModelRendererTurbo(this, 473, 121, textureX, textureY); // Box 62
		bodyModel[59] = new ModelRendererTurbo(this, 473, 145, textureX, textureY); // Box 63
		bodyModel[60] = new ModelRendererTurbo(this, 1929, 105, textureX, textureY); // Box 64
		bodyModel[61] = new ModelRendererTurbo(this, 1593, 121, textureX, textureY); // Box 65
		bodyModel[62] = new ModelRendererTurbo(this, 617, 169, textureX, textureY); // Box 66
		bodyModel[63] = new ModelRendererTurbo(this, 777, 217, textureX, textureY); // Box 88
		bodyModel[64] = new ModelRendererTurbo(this, 1993, 49, textureX, textureY); // Box 91
		bodyModel[65] = new ModelRendererTurbo(this, 1361, 81, textureX, textureY); // Box 92
		bodyModel[66] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 93
		bodyModel[67] = new ModelRendererTurbo(this, 929, 217, textureX, textureY); // Box 94
		bodyModel[68] = new ModelRendererTurbo(this, 1521, 73, textureX, textureY); // Box 95
		bodyModel[69] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 96
		bodyModel[70] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 97
		bodyModel[71] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 98
		bodyModel[72] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 99
		bodyModel[73] = new ModelRendererTurbo(this, 633, 1, textureX, textureY); // Box 100
		bodyModel[74] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 101
		bodyModel[75] = new ModelRendererTurbo(this, 1241, 1, textureX, textureY); // Box 102
		bodyModel[76] = new ModelRendererTurbo(this, 1769, 17, textureX, textureY); // Box 103
		bodyModel[77] = new ModelRendererTurbo(this, 1833, 17, textureX, textureY); // Box 104
		bodyModel[78] = new ModelRendererTurbo(this, 1977, 169, textureX, textureY); // Box 105
		bodyModel[79] = new ModelRendererTurbo(this, 1081, 217, textureX, textureY); // Box 106
		bodyModel[80] = new ModelRendererTurbo(this, 81, 121, textureX, textureY); // Box 130
		bodyModel[81] = new ModelRendererTurbo(this, 801, 129, textureX, textureY); // Box 132
		bodyModel[82] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Box 133
		bodyModel[83] = new ModelRendererTurbo(this, 81, 137, textureX, textureY); // Box 135
		bodyModel[84] = new ModelRendererTurbo(this, 25, 241, textureX, textureY); // Box 136
		bodyModel[85] = new ModelRendererTurbo(this, 241, 225, textureX, textureY); // Box 137
		bodyModel[86] = new ModelRendererTurbo(this, 393, 225, textureX, textureY); // Box 138
		bodyModel[87] = new ModelRendererTurbo(this, 625, 233, textureX, textureY); // Box 141
		bodyModel[88] = new ModelRendererTurbo(this, 1049, 241, textureX, textureY); // Box 142
		bodyModel[89] = new ModelRendererTurbo(this, 449, 241, textureX, textureY); // Box 143
		bodyModel[90] = new ModelRendererTurbo(this, 1137, 241, textureX, textureY); // Box 144
		bodyModel[91] = new ModelRendererTurbo(this, 1177, 241, textureX, textureY); // Box 145
		bodyModel[92] = new ModelRendererTurbo(this, 1265, 241, textureX, textureY); // Box 146
		bodyModel[93] = new ModelRendererTurbo(this, 1337, 241, textureX, textureY); // Box 147
		bodyModel[94] = new ModelRendererTurbo(this, 689, 25, textureX, textureY); // Box 149
		bodyModel[95] = new ModelRendererTurbo(this, 1409, 241, textureX, textureY); // Box 150
		bodyModel[96] = new ModelRendererTurbo(this, 1513, 241, textureX, textureY); // Box 151
		bodyModel[97] = new ModelRendererTurbo(this, 241, 249, textureX, textureY); // Box 154
		bodyModel[98] = new ModelRendererTurbo(this, 777, 249, textureX, textureY); // Box 155
		bodyModel[99] = new ModelRendererTurbo(this, 881, 249, textureX, textureY); // Box 156
		bodyModel[100] = new ModelRendererTurbo(this, 1601, 249, textureX, textureY); // Box 157
		bodyModel[101] = new ModelRendererTurbo(this, 1705, 249, textureX, textureY); // Box 158
		bodyModel[102] = new ModelRendererTurbo(this, 1817, 249, textureX, textureY); // Box 159
		bodyModel[103] = new ModelRendererTurbo(this, 393, 265, textureX, textureY); // Box 160
		bodyModel[104] = new ModelRendererTurbo(this, 793, 265, textureX, textureY); // Box 161
		bodyModel[105] = new ModelRendererTurbo(this, 1313, 265, textureX, textureY); // Box 162
		bodyModel[106] = new ModelRendererTurbo(this, 1697, 265, textureX, textureY); // Box 163
		bodyModel[107] = new ModelRendererTurbo(this, 1401, 281, textureX, textureY); // Box 165
		bodyModel[108] = new ModelRendererTurbo(this, 985, 289, textureX, textureY); // Box 166
		bodyModel[109] = new ModelRendererTurbo(this, 985, 249, textureX, textureY); // Box 167
		bodyModel[110] = new ModelRendererTurbo(this, 777, 273, textureX, textureY); // Box 168
		bodyModel[111] = new ModelRendererTurbo(this, 625, 257, textureX, textureY); // Box 169
		bodyModel[112] = new ModelRendererTurbo(this, 2001, 257, textureX, textureY); // Box 170
		bodyModel[113] = new ModelRendererTurbo(this, 737, 25, textureX, textureY); // Box 171
		bodyModel[114] = new ModelRendererTurbo(this, 1817, 273, textureX, textureY); // Box 172
		bodyModel[115] = new ModelRendererTurbo(this, 1897, 33, textureX, textureY); // Box 173
		bodyModel[116] = new ModelRendererTurbo(this, 1897, 33, textureX, textureY); // Box 174
		bodyModel[117] = new ModelRendererTurbo(this, 665, 233, textureX, textureY); // Box 175
		bodyModel[118] = new ModelRendererTurbo(this, 1913, 273, textureX, textureY); // Box 176
		bodyModel[119] = new ModelRendererTurbo(this, 1137, 289, textureX, textureY); // Box 177
		bodyModel[120] = new ModelRendererTurbo(this, 1, 249, textureX, textureY); // Box 178
		bodyModel[121] = new ModelRendererTurbo(this, 241, 273, textureX, textureY); // Box 179
		bodyModel[122] = new ModelRendererTurbo(this, 1, 361, textureX, textureY); // Box 180
		bodyModel[123] = new ModelRendererTurbo(this, 1, 281, textureX, textureY); // Box 181
		bodyModel[124] = new ModelRendererTurbo(this, 1281, 289, textureX, textureY); // Box 182
		bodyModel[125] = new ModelRendererTurbo(this, 473, 81, textureX, textureY); // Box 316
		bodyModel[126] = new ModelRendererTurbo(this, 1241, 81, textureX, textureY); // Box 317
		bodyModel[127] = new ModelRendererTurbo(this, 1657, 81, textureX, textureY); // Box 318
		bodyModel[128] = new ModelRendererTurbo(this, 1689, 81, textureX, textureY); // Box 319
		bodyModel[129] = new ModelRendererTurbo(this, 1721, 81, textureX, textureY); // Box 320
		bodyModel[130] = new ModelRendererTurbo(this, 1745, 81, textureX, textureY); // Box 321
		bodyModel[131] = new ModelRendererTurbo(this, 473, 89, textureX, textureY); // Box 322
		bodyModel[132] = new ModelRendererTurbo(this, 1241, 89, textureX, textureY); // Box 323
		bodyModel[133] = new ModelRendererTurbo(this, 134, 458, textureX, textureY); // Box 357
		bodyModel[134] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 656
		bodyModel[135] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 657
		bodyModel[136] = new ModelRendererTurbo(this, 633, 1, textureX, textureY); // Box 658
		bodyModel[137] = new ModelRendererTurbo(this, 793, 1, textureX, textureY); // Box 659
		bodyModel[138] = new ModelRendererTurbo(this, 1089, 1, textureX, textureY); // Box 660
		bodyModel[139] = new ModelRendererTurbo(this, 1401, 1, textureX, textureY); // Box 662
		bodyModel[140] = new ModelRendererTurbo(this, 1697, 1, textureX, textureY); // Box 663
		bodyModel[141] = new ModelRendererTurbo(this, 1889, 1, textureX, textureY); // Box 664
		bodyModel[142] = new ModelRendererTurbo(this, 2041, 1, textureX, textureY); // Box 665
		bodyModel[143] = new ModelRendererTurbo(this, 569, 17, textureX, textureY); // Box 347
		bodyModel[144] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 348
		bodyModel[145] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 349
		bodyModel[146] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 350
		bodyModel[147] = new ModelRendererTurbo(this, 593, 17, textureX, textureY); // Box 351
		bodyModel[148] = new ModelRendererTurbo(this, 601, 17, textureX, textureY); // Box 352
		bodyModel[149] = new ModelRendererTurbo(this, 1025, 17, textureX, textureY); // Box 353
		bodyModel[150] = new ModelRendererTurbo(this, 1033, 17, textureX, textureY); // Box 354
		bodyModel[151] = new ModelRendererTurbo(this, 1209, 17, textureX, textureY); // Box 355
		bodyModel[152] = new ModelRendererTurbo(this, 1985, 33, textureX, textureY); // Box 366
		bodyModel[153] = new ModelRendererTurbo(this, 1945, 329, textureX, textureY); // Box 367
		bodyModel[154] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // Box 369
		bodyModel[155] = new ModelRendererTurbo(this, 1224, 421, textureX, textureY); // Box 373
		bodyModel[156] = new ModelRendererTurbo(this, 1224, 421, textureX, textureY); // Box 374
		bodyModel[157] = new ModelRendererTurbo(this, 250, 486, textureX, textureY); // Box 377
		bodyModel[158] = new ModelRendererTurbo(this, 250, 486, textureX, textureY); // Box 378
		bodyModel[159] = new ModelRendererTurbo(this, 250, 486, textureX, textureY); // Box 379
		bodyModel[160] = new ModelRendererTurbo(this, 250, 486, textureX, textureY); // Box 380
		bodyModel[161] = new ModelRendererTurbo(this, 1232, 422, textureX, textureY); // Box 387
		bodyModel[162] = new ModelRendererTurbo(this, 1232, 422, textureX, textureY); // Box 388
		bodyModel[163] = new ModelRendererTurbo(this, 1985, 33, textureX, textureY); // Box 390
		bodyModel[164] = new ModelRendererTurbo(this, 1945, 329, textureX, textureY); // Box 391
		bodyModel[165] = new ModelRendererTurbo(this, 689, 33, textureX, textureY); // Box 235
		bodyModel[166] = new ModelRendererTurbo(this, 729, 33, textureX, textureY); // Box 235
		bodyModel[167] = new ModelRendererTurbo(this, 841, 33, textureX, textureY); // Box 235
		bodyModel[168] = new ModelRendererTurbo(this, 689, 49, textureX, textureY); // Box 235
		bodyModel[169] = new ModelRendererTurbo(this, 713, 49, textureX, textureY); // Box 5
		bodyModel[170] = new ModelRendererTurbo(this, 857, 33, textureX, textureY); // Box 6
		bodyModel[171] = new ModelRendererTurbo(this, 737, 41, textureX, textureY); // Box 7
		bodyModel[172] = new ModelRendererTurbo(this, 729, 49, textureX, textureY); // Box 8
		bodyModel[173] = new ModelRendererTurbo(this, 761, 49, textureX, textureY); // Box 9
		bodyModel[174] = new ModelRendererTurbo(this, 841, 41, textureX, textureY); // Box 10
		bodyModel[175] = new ModelRendererTurbo(this, 777, 49, textureX, textureY); // Box 11
		bodyModel[176] = new ModelRendererTurbo(this, 681, 49, textureX, textureY); // Box 12
		bodyModel[177] = new ModelRendererTurbo(this, 793, 49, textureX, textureY); // Box 13
		bodyModel[178] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 14
		bodyModel[179] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 15
		bodyModel[180] = new ModelRendererTurbo(this, 1489, 17, textureX, textureY); // Box 16
		bodyModel[181] = new ModelRendererTurbo(this, 841, 25, textureX, textureY); // Box 17
		bodyModel[182] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 18
		bodyModel[183] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 19
		bodyModel[184] = new ModelRendererTurbo(this, 865, 41, textureX, textureY); // Box 20
		bodyModel[185] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 21
		bodyModel[186] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // Box 22
		bodyModel[187] = new ModelRendererTurbo(this, 689, 49, textureX, textureY); // Box 406
		bodyModel[188] = new ModelRendererTurbo(this, 713, 49, textureX, textureY); // Box 407
		bodyModel[189] = new ModelRendererTurbo(this, 761, 49, textureX, textureY); // Box 408
		bodyModel[190] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 409
		bodyModel[191] = new ModelRendererTurbo(this, 865, 41, textureX, textureY); // Box 410
		bodyModel[192] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 411
		bodyModel[193] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // Box 412
		bodyModel[194] = new ModelRendererTurbo(this, 841, 41, textureX, textureY); // Box 413
		bodyModel[195] = new ModelRendererTurbo(this, 857, 33, textureX, textureY); // Box 414
		bodyModel[196] = new ModelRendererTurbo(this, 737, 41, textureX, textureY); // Box 415
		bodyModel[197] = new ModelRendererTurbo(this, 777, 49, textureX, textureY); // Box 416
		bodyModel[198] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 417
		bodyModel[199] = new ModelRendererTurbo(this, 841, 25, textureX, textureY); // Box 418
		bodyModel[200] = new ModelRendererTurbo(this, 1489, 17, textureX, textureY); // Box 419
		bodyModel[201] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 420
		bodyModel[202] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 421
		bodyModel[203] = new ModelRendererTurbo(this, 793, 49, textureX, textureY); // Box 422
		bodyModel[204] = new ModelRendererTurbo(this, 841, 33, textureX, textureY); // Box 423
		bodyModel[205] = new ModelRendererTurbo(this, 729, 33, textureX, textureY); // Box 424
		bodyModel[206] = new ModelRendererTurbo(this, 729, 49, textureX, textureY); // Box 425
		bodyModel[207] = new ModelRendererTurbo(this, 689, 33, textureX, textureY); // Box 426

		bodyModel[0].addShapeBox(0F, 0F, 0F, 70, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[0].setRotationPoint(-30F, -72F, -4F);
		bodyModel[0].rotateAngleZ = -0.05235988F;

		bodyModel[1].addShapeBox(0F, 0F, 0F, 70, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[1].setRotationPoint(39.9F, -68.35F, -4F);
		bodyModel[1].rotateAngleZ = -0.10471976F;

		bodyModel[2].addShapeBox(0F, 0F, 0F, 83, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[2].setRotationPoint(109.5F, -61F, -4F);
		bodyModel[2].rotateAngleZ = -0.17453293F;

		bodyModel[3].addShapeBox(0F, 0F, 0F, 70, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, -1.3F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5.5F, 0F, -1.5F, 5.5F, 0F); // Box 4
		bodyModel[3].setRotationPoint(-30F, -72F, 4F);
		bodyModel[3].rotateAngleZ = -0.05235988F;

		bodyModel[4].addShapeBox(0F, 0F, 0F, 70, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5.5F, 0F, 0F, 5.5F, 0F); // Box 5
		bodyModel[4].setRotationPoint(39.9F, -68.35F, 4F);
		bodyModel[4].rotateAngleZ = -0.10471976F;

		bodyModel[5].addShapeBox(0F, 0F, 0F, 69, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 3F, -7F, 0F, 0F, -7F, 0F, 0F, 7F, -3F, 3F, 7F); // Box 6
		bodyModel[5].setRotationPoint(-29F, -66.5F, 12F);
		bodyModel[5].rotateAngleZ = -0.05235988F;

		bodyModel[6].addShapeBox(0F, 0F, 0F, 70, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, 7F); // Box 7
		bodyModel[6].setRotationPoint(39.9F, -62.85F, 12F);
		bodyModel[6].rotateAngleZ = -0.10471976F;

		bodyModel[7].addShapeBox(0F, 0F, 0F, 70, 1, 9, 0F,-1.3F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 5.5F, 0F, 0F, 5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[7].setRotationPoint(-30F, -72F, -13F);
		bodyModel[7].rotateAngleZ = -0.05235988F;

		bodyModel[8].addShapeBox(0F, 0F, 0F, 70, 1, 9, 0F,0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5.5F, 0F, 0F, 5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[8].setRotationPoint(39.9F, -68.35F, -13F);
		bodyModel[8].rotateAngleZ = -0.10471976F;

		bodyModel[9].addShapeBox(0F, 0F, 0F, 69, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 3F, 7F, 0F, 0F, 7F, 0F, 0F, -7F, -3F, 3F, -7F); // Box 10
		bodyModel[9].setRotationPoint(-29F, -66.5F, -13F);
		bodyModel[9].rotateAngleZ = -0.05235988F;

		bodyModel[10].addShapeBox(0F, 0F, 0F, 70, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, -7F); // Box 11
		bodyModel[10].setRotationPoint(39.9F, -62.85F, -13F);
		bodyModel[10].rotateAngleZ = -0.10471976F;

		bodyModel[11].addShapeBox(0F, 0F, 0F, 83, 1, 9, 0F,0F, -5.5F, 0F, -4F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5.5F, 0F, -4F, 5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[11].setRotationPoint(109.5F, -61F, -13F);
		bodyModel[11].rotateAngleZ = -0.17453293F;

		bodyModel[12].addShapeBox(0F, 0F, 0F, 79, 10, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, -4.5F, 0F, 7F, -4.5F, 0F, -7F, 0F, 0F, -7F); // Box 15
		bodyModel[12].setRotationPoint(109.5F, -55.5F, -13F);
		bodyModel[12].rotateAngleZ = -0.17453293F;

		bodyModel[13].addShapeBox(0F, 0F, 0F, 3, 18, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[13].setRotationPoint(171.5F, -47.8F, -3F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 3, 18, 6, 0F,0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[14].setRotationPoint(171.5F, -47.8F, -9F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 3, 18, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F); // Box 18
		bodyModel[15].setRotationPoint(171.5F, -47.8F, 3F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 34, 21, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[16].setRotationPoint(137.5F, -49.3F, -3.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 34, 21, 7, 0F,0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[17].setRotationPoint(137.5F, -49.3F, -10.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 34, 21, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F); // Box 21
		bodyModel[18].setRotationPoint(137.5F, -49.3F, 3.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 3, 18, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F); // Box 22
		bodyModel[19].setRotationPoint(171.5F, -47.8F, 35F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 34, 21, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F); // Box 23
		bodyModel[20].setRotationPoint(137.5F, -49F, 35.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 3, 18, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[21].setRotationPoint(171.5F, -47.8F, 29F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 34, 21, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[22].setRotationPoint(137.5F, -49F, 28.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 3, 18, 6, 0F,0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[23].setRotationPoint(171.5F, -47.8F, 23F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 34, 21, 7, 0F,0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[24].setRotationPoint(137.5F, -49F, 21.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 83, 1, 4, 0F,0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[25].setRotationPoint(109.5F, -61F, 0F);
		bodyModel[25].rotateAngleZ = -0.17453293F;

		bodyModel[26].addShapeBox(0F, 0F, 0F, 83, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 5.5F, 0F, 0F, 5.5F, 0F); // Box 29
		bodyModel[26].setRotationPoint(109.5F, -61F, 4F);
		bodyModel[26].rotateAngleZ = -0.17453293F;

		bodyModel[27].addShapeBox(0F, 0F, 0F, 79, 10, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, -4.5F, 0F, -7F, -4.5F, 0F, 7F, 0F, 0F, 7F); // Box 30
		bodyModel[27].setRotationPoint(109.5F, -55.5F, 12F);
		bodyModel[27].rotateAngleZ = -0.17453293F;

		bodyModel[28].addShapeBox(0F, 0F, 0F, 67, 19, 5, 0F,0F, -1.8F, 1F, 0F, 2F, 5F, 0F, -3F, 0F, 0F, -3.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[28].setRotationPoint(-27F, -56.5F, 20F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 67, 21, 41, 0F,0F, -0.7F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[29].setRotationPoint(-27F, -53.5F, 25F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 67, 19, 5, 0F,0F, -3.7F, 0F, 0F, -3F, 0F, 0F, 2F, 5F, 0F, -1.8F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[30].setRotationPoint(-27F, -56.5F, -25F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 67, 21, 41, 0F,0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[31].setRotationPoint(-27F, -53.5F, -66F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 88, 21, 41, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[32].setRotationPoint(40F, -53.5F, 25F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 88, 19, 5, 0F,0F, 2F, 5F, 0F, -2.8F, 10F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[33].setRotationPoint(40F, -56.5F, 20F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 88, 21, 41, 0F,0F, -12F, 0F, 0F, -12F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[34].setRotationPoint(40F, -53.5F, -66F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 88, 19, 5, 0F,0F, -3F, 0F, 0F, -4F, 0F, 0F, -2.8F, 10F, 0F, 2F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[35].setRotationPoint(40F, -56.5F, -25F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 46, 12, 26, 0F,0F, 1.5F, -3.5F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, 1.5F, -3.5F, 0F, 0F, 3F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 3F); // Box 38
		bodyModel[36].setRotationPoint(-103F, -50F, -13F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 44, 5, 26, 0F,0F, 2F, -10F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 2F, -10F, 2F, -1.5F, -3.5F, 0F, -1F, -4F, 0F, -1F, -4F, 2F, -1.5F, -3.5F); // Box 39
		bodyModel[37].setRotationPoint(-101F, -55F, -13F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 44, 5, 26, 0F,0F, 0F, -7F, 0F, -2F, -7F, 0F, -2F, -7F, 0F, 0F, -7F, 0F, -1F, -4F, 0F, 2F, 1F, 0F, 2F, 1F, 0F, -1F, -4F); // Box 40
		bodyModel[38].setRotationPoint(-57F, -55F, -13F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 44, 11, 26, 0F,0F, 0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 6F); // Box 41
		bodyModel[39].setRotationPoint(-57F, -49F, -13F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 50, 11, 22, 0F,0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, 0F, 9F, 14F, 0F, 7F, 14F, 0F, 7F, 0F, 0F, 9F); // Box 42
		bodyModel[40].setRotationPoint(-13F, -49F, -11F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 45, 5, 26, 0F,0F, -2F, -7F, -16F, -3F, -6F, -16F, -3F, -6F, 0F, -2F, -7F, 0F, 2F, 1F, 5F, 1F, -2F, 5F, 1F, -2F, 0F, 2F, 1F); // Box 43
		bodyModel[41].setRotationPoint(-13F, -55F, -13F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 59, 1, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[42].setRotationPoint(-159F, -28F, -15F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 59, 12, 1, 0F,0F, -1.3F, -0.5F, 0F, 5.3F, 1.7F, 0F, 5.3F, 0F, 0F, -1.3F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1.7F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[43].setRotationPoint(-159F, -40F, -15F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 3, 18, 6, 0F,0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[44].setRotationPoint(171.5F, -47.8F, -41F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 34, 21, 7, 0F,0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[45].setRotationPoint(137.5F, -49F, -42.5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 3, 18, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[46].setRotationPoint(171.5F, -47.8F, -35F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 34, 21, 7, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[47].setRotationPoint(137.5F, -49F, -35.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 3, 18, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F); // Box 51
		bodyModel[48].setRotationPoint(171.5F, -47.8F, -29F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 34, 21, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F); // Box 52
		bodyModel[49].setRotationPoint(137.5F, -49F, -28.5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 10, 21, 47, 0F,0F, -12F, 0F, 0F, -12F, 0F, 0F, 1.2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[50].setRotationPoint(-37F, -53.5F, -66F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 10, 21, 47, 0F,0F, -1F, 0F, 0F, 1.2F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[51].setRotationPoint(-37F, -53.5F, 19F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 10, 16, 38, 0F,0.1F, -1F, 0F, 0F, 1.2F, 0F, 0F, 1.2F, 0F, 0.1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[52].setRotationPoint(-37F, -53.5F, -19F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 18, 16, 38, 0F,0F, 1.2F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 1.2F, 0F, 0F, 0F, 0F, 10F, 0F, 8F, 10F, 0F, 8F, 0F, 0F, 0F); // Box 56
		bodyModel[53].setRotationPoint(-27F, -53.5F, -19F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 122, 9, 10, 0F,0F, -7F, -36F, 0F, -1F, 21F, 0F, 0F, -16F, 0F, -3F, 35F, 0F, 3F, -33F, 0F, -1F, 24F, 0F, 0F, -16F, 0F, 5F, 35F); // Box 57
		bodyModel[54].setRotationPoint(-159F, -41.5F, -60F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 122, 20, 47, 0F,0F, -15F, -51F, 0F, -12F, 0F, 0F, -1F, 0F, 0F, -14.8F, 4.5F, 0F, 6F, -51F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 6F, 4.5F); // Box 58
		bodyModel[55].setRotationPoint(-159F, -53.5F, -66F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 122, 20, 47, 0F,0F, -14.8F, 4.5F, 0F, -1F, 0F, 0F, -12F, 0F, 0F, -15F, -51F, 0F, 6F, 4.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 6F, -51F); // Box 60
		bodyModel[56].setRotationPoint(-159F, -53.5F, 19F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 48, 19, 5, 0F,0F, -2.8F, 10F, 0F, -11F, 11F, 0F, -6F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 1F, 2F, 0F, 1F, -4F, 0F, 0F, 0F); // Box 61
		bodyModel[57].setRotationPoint(128F, -56.5F, 20F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 48, 1, 17, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -2.55F, 0F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 3F, 1F, 0F, 3F, 0F); // Box 62
		bodyModel[58].setRotationPoint(128F, -50.5F, 25F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 48, 12, 24, 0F,0F, -0.55F, 0F, 0F, 0.5F, 0F, 0F, -8.5F, -8F, 0F, -7F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -8F, 0F, 0F, 0F); // Box 63
		bodyModel[59].setRotationPoint(128F, -48.5F, 42F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 48, 19, 5, 0F,0F, -4F, 0F, 0F, -6F, 0F, 0F, -11F, 11F, 0F, -2.8F, 10F, 0F, 0F, 0F, 0F, 1F, -4F, 0F, 1F, 2F, 0F, 0F, 0F); // Box 64
		bodyModel[60].setRotationPoint(128F, -56.5F, -25F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 48, 1, 17, 0F,0F, -2.55F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 3F, 0F, 0F, 3F, 1F, 0F, 1F, 1F, 0F, 0F, 1F); // Box 65
		bodyModel[61].setRotationPoint(128F, -50.5F, -42F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 48, 12, 24, 0F,0F, -7F, 0F, 0F, -8.5F, -8F, 0F, 0.5F, 0F, 0F, -0.55F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 66
		bodyModel[62].setRotationPoint(128F, -48.5F, -66F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 64, 14, 11, 0F,6.9F, -7.05F, -2.6F, -0.1F, 1F, 0F, -0.1F, 1F, 0.5F, 1.9F, 0F, -1.5F, 12.9F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 12.9F, 0F, -6F); // Box 88
		bodyModel[63].setRotationPoint(-101F, -51.5F, -19F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 13, 12, 9, 0F,0F, -0.8F, 0.5F, 0F, 0.64F, 0.1F, 0F, 0.64F, -9F, 0F, 3F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.1F, 0F, 0F, -9F, 0F, 0F, 0F); // Box 91
		bodyModel[64].setRotationPoint(-159F, -39.5F, -14F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 13, 12, 9, 0F,0F, 3F, 0F, 0F, 0.64F, -9F, 0F, 0.64F, 0.1F, 0F, -0.8F, 0.5F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0.1F, 0F, 0F, 0.5F); // Box 92
		bodyModel[65].setRotationPoint(-159F, -39.5F, 5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 59, 12, 1, 0F,0F, -1.3F, 0F, 0F, 5.3F, 0F, 0F, 5.3F, 1.7F, 0F, -1.3F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.7F, 0F, 0F, -0.5F); // Box 93
		bodyModel[66].setRotationPoint(-159F, -40F, 14F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 64, 14, 11, 0F,1.9F, 0F, -1.5F, -0.1F, 1F, 0.5F, -0.1F, 1F, 0F, 6.9F, -7.05F, -2.6F, 12.9F, 0F, -6F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 12.9F, 0F, 0F); // Box 94
		bodyModel[67].setRotationPoint(-101F, -51.5F, 8F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 2, 15, 12, 0F,0F, 0F, -1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F); // Box 95
		bodyModel[68].setRotationPoint(-159F, -42.5F, -6F);

		bodyModel[69].addShapeBox(-1F, -2F, -0.5F, 2, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[69].setRotationPoint(-135F, -48F, -11F);
		bodyModel[69].rotateAngleX = -0.52359878F;
		bodyModel[69].rotateAngleZ = 0.31415927F;

		bodyModel[70].addShapeBox(-1F, -9F, -0.5F, 2, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[70].setRotationPoint(-135.5F, -49.5F, -10F);
		bodyModel[70].rotateAngleX = -0.89011792F;
		bodyModel[70].rotateAngleZ = 0.31415927F;

		bodyModel[71].addShapeBox(-1F, -2F, -0.5F, 2, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		bodyModel[71].setRotationPoint(-135F, -48F, 11F);
		bodyModel[71].rotateAngleX = 0.52359878F;
		bodyModel[71].rotateAngleZ = 0.31415927F;

		bodyModel[72].addShapeBox(-1F, -9F, -0.5F, 2, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[72].setRotationPoint(-135.5F, -49.5F, 10F);
		bodyModel[72].rotateAngleX = 0.89011792F;
		bodyModel[72].rotateAngleZ = 0.31415927F;

		bodyModel[73].addShapeBox(0F, 0F, -3F, 2, 1, 6, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[73].setRotationPoint(-138.35F, -54.9F, 0F);
		bodyModel[73].rotateAngleZ = 0.31415927F;

		bodyModel[74].addShapeBox(1.9F, 0F, -1F, 5, 1, 2, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 101
		bodyModel[74].setRotationPoint(-138.35F, -55.2F, 0F);
		bodyModel[74].rotateAngleZ = 0.31415927F;

		bodyModel[75].addShapeBox(0F, 0F, -1F, 5, 1, 2, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 102
		bodyModel[75].setRotationPoint(-131.8F, -57.3F, 0F);
		bodyModel[75].rotateAngleZ = 0.17453293F;

		bodyModel[76].addShapeBox(0F, 0F, -1F, 26, 1, 2, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 103
		bodyModel[76].setRotationPoint(-126.9F, -58.2F, 0F);
		bodyModel[76].rotateAngleZ = -0.03490659F;

		bodyModel[77].addShapeBox(-1.2F, 0F, -1F, 25, 1, 2, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 104
		bodyModel[77].setRotationPoint(-159F, -43F, 0F);
		bodyModel[77].rotateAngleZ = 0.53232542F;

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 10, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[78].setRotationPoint(-100F, -38F, -15F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 122, 9, 10, 0F,0F, -3F, 35F, 0F, 0F, -16F, 0F, -1F, 21F, 0F, -7F, -36F, 0F, 5F, 35F, 0F, 0F, -16F, 0F, -1F, 24F, 0F, 3F, -33F); // Box 106
		bodyModel[79].setRotationPoint(-159F, -41.5F, 50F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 16, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, -2F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 2F, 0F, -3.5F, -2F); // Box 130
		bodyModel[80].setRotationPoint(-159F, -17F, 5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 16, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F); // Box 132
		bodyModel[81].setRotationPoint(-159F, -17F, -5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 16, 12, 10, 0F,0F, 0.5F, 1.5F, 0F, 1F, 5F, 0F, 1F, -2F, 0F, -2F, 0F, 0F, -0.5F, -9.5F, 0F, 1.5F, -8F, 0F, 1.5F, -1.95F, 0F, 0.5F, 2F); // Box 133
		bodyModel[82].setRotationPoint(-159F, -29F, -25F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 16, 4, 10, 0F,0F, 0F, -2F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, -2F, 0F, -2.5F, 2F, 0F, -2.5F, 0F, 0F, -2.5F, 0F); // Box 135
		bodyModel[83].setRotationPoint(-159F, -17F, -15F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 21, 4, 34, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 2F, 0F, -2.5F, 2F, 0F, -2.5F, 0F); // Box 136
		bodyModel[84].setRotationPoint(-143F, -17F, -17F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 16, 12, 10, 0F,0F, -2F, 0F, 0F, 1F, -2F, 0F, 1F, 5F, 0F, 0.5F, 1.5F, 0F, 0.5F, 2F, 0F, 1.5F, -1.95F, 0F, 1.5F, -8F, 0F, -0.5F, -9.5F); // Box 137
		bodyModel[85].setRotationPoint(-159F, -29F, 15F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 21, 12, 10, 0F,0F, 1F, 5F, 0F, 0.5F, 8.5F, 0F, 0F, -14F, 0F, 1F, -12F, 0F, 1.5F, -8F, 0F, 1.5F, -6F, 0F, 1.5F, -3.95F, 0F, 1.5F, -1.95F); // Box 138
		bodyModel[86].setRotationPoint(-143F, -29F, -25F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 21, 12, 10, 0F,0F, 1F, -12F, 0F, 0F, -14F, 0F, 0.5F, 8.5F, 0F, 1F, 5F, 0F, 1.5F, -1.95F, 0F, 1.5F, -3.95F, 0F, 1.5F, -6F, 0F, 1.5F, -8F); // Box 141
		bodyModel[87].setRotationPoint(-143F, -29F, 15F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 22, 4, 38, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 2F, 0F, -2.5F, 2F, 0F, -2.5F, 0F); // Box 142
		bodyModel[88].setRotationPoint(-122F, -17F, -19F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 22, 12, 10, 0F,0F, 0.5F, 8.5F, 0F, 1F, 9.5F, 0F, 1F, -17F, 0F, 0F, -14F, 0F, 1.5F, -6F, 0F, 1.5F, -4F, 0F, 1.5F, -5.95F, 0F, 1.5F, -3.95F); // Box 143
		bodyModel[89].setRotationPoint(-122F, -29F, -25F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 22, 12, 10, 0F,0F, 0F, -14F, 0F, 1F, -17F, 0F, 1F, 9.5F, 0F, 0.5F, 8.5F, 0F, 1.5F, -3.95F, 0F, 1.5F, -5.95F, 0F, 1.5F, -4F, 0F, 1.5F, -6F); // Box 144
		bodyModel[90].setRotationPoint(-122F, -29F, 15F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 22, 4, 42, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 1F, 0F, -2.5F, 1F, 0F, -2.5F, 0F); // Box 145
		bodyModel[91].setRotationPoint(-100F, -17F, -21F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 22, 12, 10, 0F,0F, 1F, 7.5F, 0F, 2F, 8F, 0F, 2F, -17F, 0F, 1F, -13F, 0F, 1.5F, -6F, 0F, 1.5F, -5F, 0F, 1.5F, -4.95F, 0F, 1.5F, -3.95F); // Box 146
		bodyModel[92].setRotationPoint(-100F, -29F, -27F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 22, 12, 10, 0F,0F, 1F, -13F, 0F, 2F, -17F, 0F, 2F, 8F, 0F, 1F, 7.5F, 0F, 1.5F, -3.95F, 0F, 1.5F, -4.95F, 0F, 1.5F, -5F, 0F, 1.5F, -6F); // Box 147
		bodyModel[93].setRotationPoint(-100F, -29F, 17F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 20, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 149
		bodyModel[94].setRotationPoint(-78F, -17.5F, 20F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 40, 2, 21, 0F,12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, 1F, 12F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 2F, -2F, 0F, 0F); // Box 150
		bodyModel[95].setRotationPoint(-78F, -17.5F, 22F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 40, 17, 3, 0F,11F, 0F, -10F, 0F, 0.5F, -11F, 0F, 0.5F, 17F, 11F, 0F, 12F, -2F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, 2F, -2F, -1F, 0F); // Box 151
		bodyModel[96].setRotationPoint(-78F, -32.5F, 43F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 40, 17, 3, 0F,11F, 0F, 12F, 0F, 0.5F, 17F, 0F, 0.5F, -11F, 11F, 0F, -10F, -2F, -1F, 0F, 0F, -1F, 2F, 0F, 0F, -2F, -2F, 0F, 0F); // Box 154
		bodyModel[97].setRotationPoint(-78F, -32.5F, -46F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 48, 17, 3, 0F,0F, 0.5F, -11F, 0F, 0.5F, -15F, 0F, 0.5F, 22F, 0F, 0.5F, 17F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, -1F, 3F, 0F, -1F, 2F); // Box 155
		bodyModel[98].setRotationPoint(-38F, -32.5F, 43F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 48, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 156
		bodyModel[99].setRotationPoint(-38F, -17.5F, 38F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 48, 17, 3, 0F,0F, 0.5F, 17F, 0F, 0.5F, 22F, 0F, 0.5F, -15F, 0F, 0.5F, -11F, 0F, -1F, 2F, 0F, -1F, 3F, 0F, 0F, -3F, 0F, 0F, -2F); // Box 157
		bodyModel[100].setRotationPoint(-38F, -32.5F, -46F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 48, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		bodyModel[101].setRotationPoint(-38F, -17.5F, -45F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 94, 17, 3, 0F,0F, 0.5F, -15F, 0F, 0.5F, -15F, 0F, 0.5F, 22F, 0F, 0.5F, 22F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, 3F, 0F, -1F, 3F); // Box 159
		bodyModel[102].setRotationPoint(10F, -32.5F, 43F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 48, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		bodyModel[103].setRotationPoint(10F, -17.5F, 38F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 46, 2, 92, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[104].setRotationPoint(58F, -17.5F, -46F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 94, 17, 3, 0F,0F, 0.5F, 22F, 0F, 0.5F, 22F, 0F, 0.5F, -15F, 0F, 0.5F, -15F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 162
		bodyModel[105].setRotationPoint(10F, -32.5F, -46F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 48, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		bodyModel[106].setRotationPoint(10F, -17.5F, -46F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 150, 1, 108, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		bodyModel[107].setRotationPoint(-42F, -32.8F, -54F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 57, 1, 62, 0F,0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 2F, 0F); // Box 166
		bodyModel[108].setRotationPoint(-99F, -32.8F, -31F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 40, 12, 10, 0F,0F, 2F, -17F, 0F, 4F, -15F, 0F, 4F, 9.5F, 0F, 2F, 8F, 0F, 1.5F, -4.95F, 0F, 1.5F, -5.95F, 0F, 1.5F, -4F, 0F, 1.5F, -5F); // Box 167
		bodyModel[109].setRotationPoint(-78F, -29F, 17F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 40, 12, 10, 0F,0F, 2F, 8F, 0F, 4F, 9.5F, 0F, 4F, -15F, 0F, 2F, -17F, 0F, 1.5F, -5F, 0F, 1.5F, -4F, 0F, 1.5F, -5.95F, 0F, 1.5F, -4.95F); // Box 168
		bodyModel[110].setRotationPoint(-78F, -29F, -27F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 5, 16, 18, 0F,0.5F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 16F, 0F, -7.5F, 0F, 0F, -8F, 0F, 0F, 12F, 20F, 0F, 11F); // Box 169
		bodyModel[111].setRotationPoint(-42F, -32.8F, -53F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 5, 16, 18, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 2F, 20F, 0F, 11F, 0F, 0F, 12F, 0F, 0F, -8F, 16F, 0F, -7.5F); // Box 170
		bodyModel[112].setRotationPoint(-42F, -32.8F, 35F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 20, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		bodyModel[113].setRotationPoint(-78F, -17.5F, -22F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 40, 2, 21, 0F,-1F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 12F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -1F, 12F, 0F, 0F); // Box 172
		bodyModel[114].setRotationPoint(-78F, -17.5F, -43F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 20, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 173
		bodyModel[115].setRotationPoint(-58F, -17.5F, 20F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 20, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[116].setRotationPoint(-58F, -17.5F, -22F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 14, 24, 0F,0F, 0F, 19.5F, 0F, 0F, 19.5F, 0F, 0F, 19.5F, 0F, 0F, 19.5F, 0F, 0F, 9.8F, 0F, 0F, 9.8F, 0F, 0F, 9.8F, 0F, 0F, 9.8F); // Box 175
		bodyModel[117].setRotationPoint(-94F, -30.5F, -12F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 10, 32, 0F,0F, 6F, 47F, 0F, 6F, 47F, 0F, 6F, 47F, 0F, 6F, 47F, 0F, 6F, 32F, 0F, 6F, 32F, 0F, 6F, 32F, 0F, 6F, 32F); // Box 176
		bodyModel[118].setRotationPoint(96F, -32.5F, -16F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 24, 2, 92, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[119].setRotationPoint(104F, -17.5F, -46F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 24, 17, 3, 0F,0F, 0.5F, 22F, 0F, 0.5F, 21F, 0F, 0.5F, -14F, 0F, 0.5F, -15F, 0F, -1F, 3F, 0F, -4F, 3F, 0F, -3F, -3F, 0F, 0F, -3F); // Box 178
		bodyModel[120].setRotationPoint(104F, -32.5F, -46F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 24, 17, 3, 0F,0F, 0.5F, -15F, 0F, 0.5F, -14F, 0F, 0.5F, 21F, 0F, 0.5F, 22F, 0F, 0F, -3F, 0F, -3F, -3F, 0F, -4F, 3F, 0F, -1F, 3F); // Box 179
		bodyModel[121].setRotationPoint(104F, -32.5F, 43F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 48, 2, 92, 0F,0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[122].setRotationPoint(128F, -20.5F, -46F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 48, 14, 3, 0F,0F, 0.5F, 21F, 0F, 0.5F, 13F, 0F, 0.5F, -10F, 0F, 0.5F, -14F, 0F, -1F, 3F, 0F, -9F, 3F, 0F, -8F, -3F, 0F, 0F, -3F); // Box 181
		bodyModel[123].setRotationPoint(128F, -32.5F, -46F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 48, 14, 3, 0F,0F, 0.5F, -14F, 0F, 0.5F, -10F, 0F, 0.5F, 13F, 0F, 0.5F, 21F, 0F, 0F, -3F, 0F, -8F, -3F, 0F, -9F, 3F, 0F, -1F, 3F); // Box 182
		bodyModel[124].setRotationPoint(128F, -32.5F, 43F);

		bodyModel[125].addShapeBox(0F, -1F, 0F, 9, 6, 1, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, 1F, -1F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 1F, 1F); // Box 316
		bodyModel[125].setRotationPoint(-143F, -27F, -29.5F);
		bodyModel[125].rotateAngleX = 0.71558499F;

		bodyModel[126].addShapeBox(0F, 5F, 0F, 9, 6, 1, 0F,0F, -1F, -1F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, -1F, 1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F); // Box 317
		bodyModel[126].setRotationPoint(-143F, -27F, -29.5F);
		bodyModel[126].rotateAngleX = 0.71558499F;

		bodyModel[127].addShapeBox(-11F, -1F, 0F, 11, 6, 1, 0F,0F, -1F, -0.5F, 0F, 0.2F, 1F, 0F, 0.2F, -1F, 0F, -1F, 0.5F, 3F, 1F, -1F, 0F, -0.2F, 1F, 0F, -0.2F, -1F, 3F, 1F, 1F); // Box 318
		bodyModel[127].setRotationPoint(-143F, -27.5F, -27F);
		bodyModel[127].rotateAngleX = 0.71558499F;

		bodyModel[128].addShapeBox(-11F, 5F, 0F, 11, 6, 1, 0F,3F, -1F, -1F, 0F, 0.2F, 1F, 0F, 0.2F, -1F, 3F, -1F, 1F, 0F, 0F, -0.5F, 0F, -0.2F, 1F, 0F, -0.2F, -1F, 0F, 0F, 0.5F); // Box 319
		bodyModel[128].setRotationPoint(-143F, -27.5F, -27F);
		bodyModel[128].rotateAngleX = 0.71558499F;

		bodyModel[129].addShapeBox(0F, -1F, 0F, 9, 6, 1, 0F,0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 1F, 1F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 1F, -1F); // Box 320
		bodyModel[129].setRotationPoint(-143F, -27F, 28F);
		bodyModel[129].rotateAngleX = -0.71558499F;

		bodyModel[130].addShapeBox(0F, 5F, 0F, 9, 6, 1, 0F,0F, -1F, 1F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, -1F, -1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F); // Box 321
		bodyModel[130].setRotationPoint(-143F, -27F, 28F);
		bodyModel[130].rotateAngleX = -0.71558499F;

		bodyModel[131].addShapeBox(-11F, -1F, 0F, 11, 6, 1, 0F,0F, -1F, 0.5F, 0F, 0.2F, -1F, 0F, 0.2F, 1F, 0F, -1F, -0.5F, 3F, 1F, 1F, 0F, -0.2F, -1F, 0F, -0.2F, 1F, 3F, 1F, -1F); // Box 322
		bodyModel[131].setRotationPoint(-143F, -27.5F, 25.5F);
		bodyModel[131].rotateAngleX = -0.71558499F;

		bodyModel[132].addShapeBox(-11F, 5F, 0F, 11, 6, 1, 0F,3F, -1F, 1F, 0F, 0.2F, -1F, 0F, 0.2F, 1F, 3F, -1F, -1F, 0F, 0F, 0.5F, 0F, -0.2F, -1F, 0F, -0.2F, 1F, 0F, 0F, -0.5F); // Box 323
		bodyModel[132].setRotationPoint(-143F, -27.5F, 25.5F);
		bodyModel[132].rotateAngleX = -0.71558499F;

		bodyModel[133].addShapeBox(0F, 0F, 0F, 26, 8, 26, 0F,0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 357
		bodyModel[133].setRotationPoint(-159F, -39.5F, -13F);
		bodyModel[133].rotateAngleZ = 0.17453293F;

		bodyModel[134].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 656
		bodyModel[134].setRotationPoint(-132.5F, -40F, -7.5F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 657
		bodyModel[135].setRotationPoint(-130F, -40F, -6.5F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 658
		bodyModel[136].setRotationPoint(-130F, -40F, -8.5F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 659
		bodyModel[137].setRotationPoint(-130F, -41F, -10.5F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 660
		bodyModel[138].setRotationPoint(-130F, -42F, -10.5F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 662
		bodyModel[139].setRotationPoint(-130F, -44F, -9.5F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 663
		bodyModel[140].setRotationPoint(-130F, -44F, -5.5F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, -2F, 0F, 1F, -2F); // Box 664
		bodyModel[141].setRotationPoint(-130F, -41F, -4.5F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 665
		bodyModel[142].setRotationPoint(-130F, -42F, -4.5F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 347
		bodyModel[143].setRotationPoint(-132.5F, -40F, 6.5F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 348
		bodyModel[144].setRotationPoint(-130F, -40F, 5.5F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 349
		bodyModel[145].setRotationPoint(-130F, -40F, 7.5F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, -2F, 0F, 1F, -2F); // Box 350
		bodyModel[146].setRotationPoint(-130F, -41F, 9.5F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 351
		bodyModel[147].setRotationPoint(-130F, -42F, 9.5F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 352
		bodyModel[148].setRotationPoint(-130F, -44F, 8.5F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 353
		bodyModel[149].setRotationPoint(-130F, -44F, 4.5F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 354
		bodyModel[150].setRotationPoint(-130F, -41F, 3.5F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 355
		bodyModel[151].setRotationPoint(-130F, -42F, 3.5F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 366
		bodyModel[152].setRotationPoint(-134F, -44.5F, -10F);

		bodyModel[153].addShapeBox(0F, -20F, -20F, 1, 47, 47, 0F,-0.4F, -20F, -21F, -0.4F, -20F, -21F, -0.4F, -20F, -21F, -0.4F, -20F, -21F, -0.4F, -20F, -21F, -0.4F, -20F, -21F, -0.4F, -20F, -21F, -0.4F, -20F, -21F); // Box 367
		bodyModel[153].setRotationPoint(-134.3F, -51.5F, -10.5F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 369
		bodyModel[154].setRotationPoint(-134F, -44.5F, 3.5F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 13, 11, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 4F, 5F, 0F, 2F, 5F, 0F, 2F, 0F, 4F, 4F); // Box 373
		bodyModel[155].setRotationPoint(-111F, -42F, -12.5F);
		bodyModel[155].rotateAngleZ = -0.33161256F;

		bodyModel[156].addShapeBox(0F, 0F, 0F, 13, 11, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 4F, 5F, 0F, 2F, 5F, 0F, 2F, 0F, 4F, 4F); // Box 374
		bodyModel[156].setRotationPoint(-111F, -42F, 2.5F);
		bodyModel[156].rotateAngleZ = -0.33161256F;

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 25, 32, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -37F, 0F, 6F, 37F, 0F, 6F, 37F, 0F, 6F, -37F, 0F, 6F); // Box 377
		bodyModel[157].setRotationPoint(58F, -56.5F, -16F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 4, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F); // Box 378
		bodyModel[158].setRotationPoint(58F, -60.5F, -13F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 25, 32, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -37F, 0F, 6F, 37F, 0F, 6F, 37F, 0F, 6F, -37F, 0F, 6F); // Box 379
		bodyModel[159].setRotationPoint(58F, -56.5F, -16F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 6, 12, 0F,0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F); // Box 380
		bodyModel[160].setRotationPoint(58F, -66.5F, -6F);

		bodyModel[161].addShapeBox(-100F, 1F, -25F, 200, 1, 50, 0F,-67F, -8F, -17F, -67F, -7F, -17F, -67F, 10F, -17F, -67F, 3.2F, -17F, -67F, 8F, -17F, -67F, 8F, -17F, -67F, 0F, -17F, -67F, 0F, -17F); // Box 387
		bodyModel[161].setRotationPoint(-46F, -24.5F, -57.75F);
		bodyModel[161].rotateAngleX = 1.57079633F;

		bodyModel[162].addShapeBox(-100F, 1F, -25F, 200, 1, 50, 0F,-67F, -7F, -17F, -67F, -8F, -17F, -67F, 3F, -17F, -67F, 10F, -17F, -67F, 8F, -17F, -67F, 8F, -17F, -67F, 0F, -17F, -67F, 0F, -17F); // Box 388
		bodyModel[162].setRotationPoint(-46F, -24.5F, 58.15F);
		bodyModel[162].rotateAngleX = 1.57079633F;
		bodyModel[162].rotateAngleY = -3.14159265F;

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 390
		bodyModel[163].setRotationPoint(-134F, -44.5F, 4.5F);

		bodyModel[164].addShapeBox(0F, -20F, -20F, 1, 47, 47, 0F,-0.4F, -20F, -21F, -0.4F, -20F, -21F, -0.4F, -20F, -21F, -0.4F, -20F, -21F, -0.4F, -20F, -21F, -0.4F, -20F, -21F, -0.4F, -20F, -21F, -0.4F, -20F, -21F); // Box 391
		bodyModel[164].setRotationPoint(-134.3F, -51.5F, 3.5F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		bodyModel[165].setRotationPoint(-127F, -32F, 3F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 11, 6, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		bodyModel[166].setRotationPoint(-128F, -34F, 2F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		bodyModel[167].setRotationPoint(-117F, -34F, 2F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 2, 20, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		bodyModel[168].setRotationPoint(-115F, -48F, 3F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 4, 14, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[169].setRotationPoint(-117F, -48F, 2F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[170].setRotationPoint(-125F, -37F, 2F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[171].setRotationPoint(-126F, -38F, 1.5F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 11, 6, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[172].setRotationPoint(-128F, -34F, 11F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 4, 14, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[173].setRotationPoint(-117F, -48F, 11F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[174].setRotationPoint(-125F, -37F, 11F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[175].setRotationPoint(-126F, -38F, 10.5F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[176].setRotationPoint(-117F, -34F, 11.5F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 12, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[177].setRotationPoint(-127F, -33F, 3F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[178].setRotationPoint(-123F, -33.5F, 3F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[179].setRotationPoint(-123F, -33.5F, 9F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[180].setRotationPoint(-123F, -33.5F, 8F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[181].setRotationPoint(-121F, -33.5F, 8F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[182].setRotationPoint(-122F, -33.5F, 5F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 11, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[183].setRotationPoint(-116F, -48F, 3.5F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 11, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[184].setRotationPoint(-116F, -48F, 8.5F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[185].setRotationPoint(-116F, -37F, 8.5F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[186].setRotationPoint(-116F, -37F, 3.5F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 2, 20, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 406
		bodyModel[187].setRotationPoint(-115F, -48F, -11F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 4, 14, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 407
		bodyModel[188].setRotationPoint(-117F, -48F, -12F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 4, 14, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 408
		bodyModel[189].setRotationPoint(-117F, -48F, -3F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 409
		bodyModel[190].setRotationPoint(-116F, -37F, -5.5F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 11, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 410
		bodyModel[191].setRotationPoint(-116F, -48F, -5.5F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 11, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 411
		bodyModel[192].setRotationPoint(-116F, -48F, -10.5F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 412
		bodyModel[193].setRotationPoint(-116F, -37F, -10.5F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413
		bodyModel[194].setRotationPoint(-125F, -37F, -3F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 414
		bodyModel[195].setRotationPoint(-125F, -37F, -12F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 415
		bodyModel[196].setRotationPoint(-126F, -38F, -12.5F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 416
		bodyModel[197].setRotationPoint(-126F, -38F, -3.5F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 417
		bodyModel[198].setRotationPoint(-123F, -33.5F, -5F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 418
		bodyModel[199].setRotationPoint(-121F, -33.5F, -6F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 419
		bodyModel[200].setRotationPoint(-123F, -33.5F, -6F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 420
		bodyModel[201].setRotationPoint(-122F, -33.5F, -9F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 421
		bodyModel[202].setRotationPoint(-123F, -33.5F, -11F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 12, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 422
		bodyModel[203].setRotationPoint(-127F, -33F, -11F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 423
		bodyModel[204].setRotationPoint(-117F, -34F, -12F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 11, 6, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 424
		bodyModel[205].setRotationPoint(-128F, -34F, -12F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 11, 6, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 425
		bodyModel[206].setRotationPoint(-128F, -34F, -3F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 426
		bodyModel[207].setRotationPoint(-127F, -32F, -11F);
	}

	private void initnoseModel_1()
	{
		noseModel[0] = new ModelRendererTurbo(this, 1681, 153, textureX, textureY); // Box 107
		noseModel[1] = new ModelRendererTurbo(this, 745, 169, textureX, textureY); // Box 108
		noseModel[2] = new ModelRendererTurbo(this, 1241, 169, textureX, textureY); // Box 109
		noseModel[3] = new ModelRendererTurbo(this, 809, 177, textureX, textureY); // Box 110
		noseModel[4] = new ModelRendererTurbo(this, 1305, 177, textureX, textureY); // Box 111
		noseModel[5] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 112
		noseModel[6] = new ModelRendererTurbo(this, 241, 201, textureX, textureY); // Box 113
		noseModel[7] = new ModelRendererTurbo(this, 393, 201, textureX, textureY); // Box 114
		noseModel[8] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 115
		noseModel[9] = new ModelRendererTurbo(this, 1545, 65, textureX, textureY); // Box 118
		noseModel[10] = new ModelRendererTurbo(this, 593, 81, textureX, textureY); // Box 119
		noseModel[11] = new ModelRendererTurbo(this, 625, 209, textureX, textureY); // Box 120
		noseModel[12] = new ModelRendererTurbo(this, 65, 217, textureX, textureY); // Box 121
		noseModel[13] = new ModelRendererTurbo(this, 89, 97, textureX, textureY); // Box 122
		noseModel[14] = new ModelRendererTurbo(this, 1353, 217, textureX, textureY); // Box 123
		noseModel[15] = new ModelRendererTurbo(this, 457, 217, textureX, textureY); // Box 125
		noseModel[16] = new ModelRendererTurbo(this, 681, 129, textureX, textureY); // Box 126
		noseModel[17] = new ModelRendererTurbo(this, 1433, 217, textureX, textureY); // Box 127
		noseModel[18] = new ModelRendererTurbo(this, 1497, 217, textureX, textureY); // Box 128
		noseModel[19] = new ModelRendererTurbo(this, 1577, 217, textureX, textureY); // Box 129
		noseModel[20] = new ModelRendererTurbo(this, 801, 129, textureX, textureY); // Box 354
		noseModel[21] = new ModelRendererTurbo(this, 801, 129, textureX, textureY); // Box 355
		noseModel[22] = new ModelRendererTurbo(this, 801, 129, textureX, textureY); // Box 356

		noseModel[0].addShapeBox(0F, 0F, 0F, 20, 12, 10, 0F,0F, -4F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 107
		noseModel[0].setRotationPoint(-179F, -42F, -5F);

		noseModel[1].addShapeBox(0F, 0F, 0F, 20, 12, 10, 0F,0F, -4F, 0F, 0F, 0.5F, 0F, 0F, -3.5F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 2.5F); // Box 108
		noseModel[1].setRotationPoint(-179F, -42F, 5F);

		noseModel[2].addShapeBox(0F, 0F, 0F, 20, 8, 10, 0F,0F, -2F, 0.05F, 0F, 0.5F, 0F, 0F, -3.5F, -1F, 0F, -2F, -10F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0.5F, 2F, 0F, 0F, -7.5F); // Box 109
		noseModel[2].setRotationPoint(-179F, -38F, 15F);

		noseModel[3].addShapeBox(0F, 0F, 0F, 20, 12, 10, 0F,0F, -6F, 0F, 0F, -3.5F, 0F, 0F, 0.5F, 0F, 0F, -4F, 0F, 0F, 0F, 2.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 110
		noseModel[3].setRotationPoint(-179F, -42F, -15F);

		noseModel[4].addShapeBox(0F, 0F, 0F, 20, 8, 10, 0F,0F, -2F, -10F, 0F, -3.5F, -1F, 0F, 0.5F, 0F, 0F, -2F, 0.05F, 0F, 0F, -7.5F, 0F, 0.5F, 2F, 0F, -2F, 0F, 0F, 0F, -2F); // Box 111
		noseModel[4].setRotationPoint(-179F, -38F, -25F);

		noseModel[5].addShapeBox(0F, 0F, 0F, 26, 8, 10, 0F,0F, -7.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7.5F, -2F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F); // Box 112
		noseModel[5].setRotationPoint(-205F, -38F, -5F);

		noseModel[6].addShapeBox(0F, 0F, 0F, 26, 8, 10, 0F,0F, -7.5F, 2.05F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -7.5F, -12F, 0F, 2.5F, 0.05F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 2.5F, -10F); // Box 113
		noseModel[6].setRotationPoint(-205F, -38F, 5F);

		noseModel[7].addShapeBox(0F, 0F, 0F, 26, 8, 10, 0F,0F, -7.5F, -12F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -7.5F, 2.05F, 0F, 2.5F, -10F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 2.5F, 0.05F); // Box 114
		noseModel[7].setRotationPoint(-205F, -38F, -15F);

		noseModel[8].addShapeBox(0F, 0F, 0F, 11, 3, 10, 0F,0F, -3.4F, -4.9F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -3.4F, -4.9F, 0F, 0.5F, -4.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -4.9F); // Box 115
		noseModel[8].setRotationPoint(-216.09F, -30.51F, -5F);

		noseModel[9].addShapeBox(0F, 0F, 0F, 11, 3, 10, 0F,0F, -3.4F, -4.9F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -3.4F, -4.9F, 0F, 0.5F, -4.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -4.9F); // Box 118
		noseModel[9].setRotationPoint(-216F, -30.5F, -5F);

		noseModel[10].addShapeBox(0F, 0F, 0F, 11, 3, 10, 0F,0F, -0.5F, -4.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -4.9F, 0F, -2.4F, -4.9F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, -2.4F, -4.9F); // Box 119
		noseModel[10].setRotationPoint(-216.02F, -27.53F, -5F);

		noseModel[11].addShapeBox(0F, 0F, 0F, 20, 12, 10, 0F,0F, 1F, -2F, 0F, -2F, 0F, 0F, 0.5F, 1.5F, 0F, 1F, -7.5F, 0F, -2F, 3.05F, 0F, 0.5F, 2F, 0F, -0.5F, -9.5F, 0F, -2F, -13F); // Box 120
		noseModel[11].setRotationPoint(-179F, -29F, 15F);

		noseModel[12].addShapeBox(0F, 0F, 0F, 26, 8, 10, 0F,0F, -2.5F, 0.05F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, -2.5F, -10F, 0F, -1.5F, 2.05F, 0F, 4F, 0F, 0F, 3F, -3F, 0F, -1.5F, -12F); // Box 121
		noseModel[12].setRotationPoint(-205F, -30F, 5F);

		noseModel[13].addShapeBox(0F, 0F, 0F, 11, 3, 10, 0F,0F, -0.5F, -4.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -4.9F, 0F, -2.4F, -4.9F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, -2.4F, -4.9F); // Box 122
		noseModel[13].setRotationPoint(-216.05F, -27.49F, -5F);

		noseModel[14].addShapeBox(0F, 0F, 0F, 26, 8, 10, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -4.5F, -2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -4.5F, -2F); // Box 123
		noseModel[14].setRotationPoint(-205F, -27F, -5F);

		noseModel[15].addShapeBox(0F, 0F, 0F, 20, 8, 10, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, 0F, -2.5F, 0F, -5F, 0F, 0F, -2.5F, 0F, 0F, -3.5F, -2F, 0F, -6F, -3F); // Box 125
		noseModel[15].setRotationPoint(-179F, -21F, 5F);

		noseModel[16].addShapeBox(0F, 0F, 0F, 20, 3, 10, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -2F, 0F); // Box 126
		noseModel[16].setRotationPoint(-179F, -19F, -5F);

		noseModel[17].addShapeBox(0F, 0F, 0F, 20, 12, 10, 0F,0F, 1F, -7.5F, 0F, 0.5F, 1.5F, 0F, -2F, 0F, 0F, 1F, -2F, 0F, -2F, -13F, 0F, -0.5F, -9.5F, 0F, 0.5F, 2F, 0F, -2F, 3.05F); // Box 127
		noseModel[17].setRotationPoint(-179F, -29F, -25F);

		noseModel[18].addShapeBox(0F, 0F, 0F, 26, 8, 10, 0F,0F, -2.5F, -10F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, -2.5F, 0.05F, 0F, -1.5F, -12F, 0F, 3F, -3F, 0F, 4F, 0F, 0F, -1.5F, 2.05F); // Box 128
		noseModel[18].setRotationPoint(-205F, -30F, -15F);

		noseModel[19].addShapeBox(0F, 0F, 0F, 20, 8, 10, 0F,0F, 0F, -2.5F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -6F, -3F, 0F, -3.5F, -2F, 0F, -2.5F, 0F, 0F, -5F, 0F); // Box 129
		noseModel[19].setRotationPoint(-179F, -21F, -15F);

		noseModel[20].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.33F, 0F, 0F, -0.33F, 0F, 0F, -0.33F, 0F, 0F, -0.33F, 0F, 0F, -0.33F, 0F, 0F, -0.33F, 0F, 0F, -0.33F, 0F, 0F, -0.33F, 0F); // Box 354
		noseModel[20].setRotationPoint(-216.5F, -27.5F, -0.5F);

		noseModel[21].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.33F, -0.3F, 0F, -0.33F, -0.3F, 0F, -0.33F, -0.3F, 0F, -0.33F, -0.3F, 0F, -0.33F, 0F, 0F, -0.33F, 0F, 0F, -0.33F, 0F, 0F, -0.33F, 0F); // Box 355
		noseModel[21].setRotationPoint(-216.5F, -27.83F, -0.5F);

		noseModel[22].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.33F, 0F, 0F, -0.33F, 0F, 0F, -0.33F, 0F, 0F, -0.33F, 0F, 0F, -0.33F, -0.3F, 0F, -0.33F, -0.3F, 0F, -0.33F, -0.3F, 0F, -0.33F, -0.3F); // Box 356
		noseModel[22].setRotationPoint(-216.5F, -27.17F, -0.5F);
	}

	private void inittailModel_1()
	{
		tailModel[0] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 67
		tailModel[1] = new ModelRendererTurbo(this, 601, 129, textureX, textureY); // Box 68
		tailModel[2] = new ModelRendererTurbo(this, 1241, 49, textureX, textureY); // Box 69
		tailModel[3] = new ModelRendererTurbo(this, 1185, 49, textureX, textureY); // Box 70
		tailModel[4] = new ModelRendererTurbo(this, 1817, 105, textureX, textureY); // Box 71
		tailModel[5] = new ModelRendererTurbo(this, 73, 81, textureX, textureY); // Box 73
		tailModel[6] = new ModelRendererTurbo(this, 1361, 289, textureX, textureY); // Box 183
		tailModel[7] = new ModelRendererTurbo(this, 1817, 297, textureX, textureY); // Box 185
		tailModel[8] = new ModelRendererTurbo(this, 985, 353, textureX, textureY); // Box 186
		tailModel[9] = new ModelRendererTurbo(this, 1441, 289, textureX, textureY); // Box 188
		tailModel[10] = new ModelRendererTurbo(this, 1, 305, textureX, textureY); // Box 189
		tailModel[11] = new ModelRendererTurbo(this, 1985, 297, textureX, textureY); // Box 190
		tailModel[12] = new ModelRendererTurbo(this, 241, 305, textureX, textureY); // Box 191

		tailModel[0].addShapeBox(0F, 0F, 0F, 25, 12, 24, 0F,0F, -8.5F, -8F, -3F, -8.5F, -10F, -3F, -4.55F, -4F, 0F, 0.5F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 2F, 0F, -9F, 0F, 0F, -1F); // Box 67
		tailModel[0].setRotationPoint(176F, -48.5F, -66F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 25, 12, 24, 0F,0F, 0.5F, 0F, -3F, -4.55F, -4F, -3F, -8.5F, -10F, 0F, -8.5F, -8F, 0F, 0F, -1F, 2F, 0F, -9F, 0F, 0F, -8F, 0F, 0F, -8F); // Box 68
		tailModel[1].setRotationPoint(176F, -48.5F, 42F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 16, 1, 17, 0F,0F, -1.5F, 0F, -8F, -3.55F, 1.5F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 3F, 1F, -8F, 8F, 5F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 69
		tailModel[2].setRotationPoint(176F, -50.5F, -42F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 16, 1, 14, 0F,0F, 0F, 0F, 0F, 2F, 0F, -8F, -5.5F, 3F, 0F, -4.5F, 3F, 0F, 1F, 0F, 0F, 0F, 0F, -8F, 7F, -1.5F, 0F, 7F, -2F); // Box 70
		tailModel[3].setRotationPoint(176F, -50.5F, -25F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 16, 1, 17, 0F,0F, 0F, 0F, 0F, 2F, 0F, -8F, -3.55F, 1.5F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -8F, 8F, 5F, 0F, 3F, 1F); // Box 71
		tailModel[4].setRotationPoint(176F, -50.5F, 25F);

		tailModel[5].addShapeBox(0F, 0F, 0F, 16, 1, 14, 0F,0F, -4.5F, 3F, -8F, -5.5F, 3F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 7F, -2F, -8F, 7F, -1.5F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 73
		tailModel[5].setRotationPoint(176F, -50.5F, 11F);

		tailModel[6].addShapeBox(0F, 0F, 0F, 25, 12, 24, 0F,0F, 0F, -1F, 2F, 0F, -9F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, -1.5F, -3F, -3F, -4.55F, -4F, -3F, -8.5F, -10F, 0F, -8.5F, -8F); // Box 183
		tailModel[6].setRotationPoint(176F, -36.5F, 42F);

		tailModel[7].addShapeBox(0F, 0F, 0F, 25, 12, 24, 0F,0F, 0F, -8F, 0F, 0F, -8F, 2F, 0F, -9F, 0F, 0F, -1F, 0F, -8.5F, -8F, -3F, -8.5F, -10F, -3F, -4.55F, -4F, 0F, -1.5F, -3F); // Box 185
		tailModel[7].setRotationPoint(176F, -36.5F, -66F);

		tailModel[8].addShapeBox(0F, 0F, 0F, 23, 2, 92, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 186
		tailModel[8].setRotationPoint(176F, -28.5F, -46F);

		tailModel[9].addShapeBox(-1F, -1F, 0F, 17, 2, 14, 0F,0F, 0F, 3F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -10F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
		tailModel[9].setRotationPoint(199F, -30.5F, -46F);
		tailModel[9].rotateAngleZ = 0.01745329F;

		tailModel[10].addShapeBox(-1F, -1F, 0F, 17, 2, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F); // Box 189
		tailModel[10].setRotationPoint(199F, -30.5F, -32F);
		tailModel[10].rotateAngleZ = 0.01745329F;

		tailModel[11].addShapeBox(-1F, -1F, 0F, 17, 2, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, -2F, 0F, 0F, 1F); // Box 190
		tailModel[11].setRotationPoint(199F, -30.5F, 32F);
		tailModel[11].rotateAngleZ = 0.01745329F;

		tailModel[12].addShapeBox(-1F, -1F, 0F, 17, 2, 32, 0F,0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 191
		tailModel[12].setRotationPoint(199F, -30.5F, 0F);
		tailModel[12].rotateAngleZ = 0.01745329F;
	}

	private void initbayModel_1()
	{
		bayModel[0] = new ModelRendererTurbo(this, 313, 305, textureX, textureY); // Box 0
		bayModel[1] = new ModelRendererTurbo(this, 313, 321, textureX, textureY); // Box 6
		bayModel[2] = new ModelRendererTurbo(this, 625, 321, textureX, textureY); // Box 7
		bayModel[3] = new ModelRendererTurbo(this, 1489, 49, textureX, textureY); // Box 8
		bayModel[4] = new ModelRendererTurbo(this, 1521, 49, textureX, textureY); // Box 9
		bayModel[5] = new ModelRendererTurbo(this, 1585, 49, textureX, textureY); // Box 10
		bayModel[6] = new ModelRendererTurbo(this, 1873, 1, textureX, textureY); // Box 11
		bayModel[7] = new ModelRendererTurbo(this, 1905, 1, textureX, textureY); // Box 12
		bayModel[8] = new ModelRendererTurbo(this, 1929, 1, textureX, textureY); // Box 13
		bayModel[9] = new ModelRendererTurbo(this, 873, 65, textureX, textureY); // Box 14
		bayModel[10] = new ModelRendererTurbo(this, 1993, 73, textureX, textureY); // Box 15
		bayModel[11] = new ModelRendererTurbo(this, 593, 97, textureX, textureY); // Box 16
		bayModel[12] = new ModelRendererTurbo(this, 1185, 33, textureX, textureY); // Box 12
		bayModel[13] = new ModelRendererTurbo(this, 1945, 33, textureX, textureY); // Box 13
		bayModel[14] = new ModelRendererTurbo(this, 1969, 33, textureX, textureY); // Box 14
		bayModel[15] = new ModelRendererTurbo(this, 305, 41, textureX, textureY); // Box 15
		bayModel[16] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Box 16
		bayModel[17] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Box 17
		bayModel[18] = new ModelRendererTurbo(this, 377, 41, textureX, textureY); // Box 18
		bayModel[19] = new ModelRendererTurbo(this, 401, 41, textureX, textureY); // Box 19
		bayModel[20] = new ModelRendererTurbo(this, 425, 41, textureX, textureY); // Box 20
		bayModel[21] = new ModelRendererTurbo(this, 449, 41, textureX, textureY); // Box 21
		bayModel[22] = new ModelRendererTurbo(this, 1185, 41, textureX, textureY); // Box 22
		bayModel[23] = new ModelRendererTurbo(this, 657, 49, textureX, textureY); // Box 23
		bayModel[24] = new ModelRendererTurbo(this, 1281, 329, textureX, textureY); // Box 216
		bayModel[25] = new ModelRendererTurbo(this, 625, 337, textureX, textureY); // Box 217
		bayModel[26] = new ModelRendererTurbo(this, 1817, 337, textureX, textureY); // Box 218
		bayModel[27] = new ModelRendererTurbo(this, 745, 97, textureX, textureY); // Box 219
		bayModel[28] = new ModelRendererTurbo(this, 1873, 105, textureX, textureY); // Box 220
		bayModel[29] = new ModelRendererTurbo(this, 745, 113, textureX, textureY); // Box 221
		bayModel[30] = new ModelRendererTurbo(this, 1953, 1, textureX, textureY); // Box 222
		bayModel[31] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 223
		bayModel[32] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 224
		bayModel[33] = new ModelRendererTurbo(this, 1241, 113, textureX, textureY); // Box 225
		bayModel[34] = new ModelRendererTurbo(this, 1577, 121, textureX, textureY); // Box 226
		bayModel[35] = new ModelRendererTurbo(this, 1761, 121, textureX, textureY); // Box 227
		bayModel[36] = new ModelRendererTurbo(this, 1233, 49, textureX, textureY); // Box 228
		bayModel[37] = new ModelRendererTurbo(this, 1337, 49, textureX, textureY); // Box 229
		bayModel[38] = new ModelRendererTurbo(this, 1609, 49, textureX, textureY); // Box 230
		bayModel[39] = new ModelRendererTurbo(this, 665, 57, textureX, textureY); // Box 231
		bayModel[40] = new ModelRendererTurbo(this, 1233, 57, textureX, textureY); // Box 232
		bayModel[41] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 233
		bayModel[42] = new ModelRendererTurbo(this, 665, 65, textureX, textureY); // Box 234
		bayModel[43] = new ModelRendererTurbo(this, 1537, 65, textureX, textureY); // Box 235
		bayModel[44] = new ModelRendererTurbo(this, 1241, 73, textureX, textureY); // Box 236
		bayModel[45] = new ModelRendererTurbo(this, 1265, 73, textureX, textureY); // Box 237
		bayModel[46] = new ModelRendererTurbo(this, 1289, 73, textureX, textureY); // Box 238
		bayModel[47] = new ModelRendererTurbo(this, 2017, 73, textureX, textureY); // Box 239
		bayModel[48] = new ModelRendererTurbo(this, 1281, 345, textureX, textureY); // Box 240
		bayModel[49] = new ModelRendererTurbo(this, 1817, 353, textureX, textureY); // Box 241
		bayModel[50] = new ModelRendererTurbo(this, 193, 361, textureX, textureY); // Box 242
		bayModel[51] = new ModelRendererTurbo(this, 753, 361, textureX, textureY); // Box 243
		bayModel[52] = new ModelRendererTurbo(this, 881, 361, textureX, textureY); // Box 244
		bayModel[53] = new ModelRendererTurbo(this, 345, 369, textureX, textureY); // Box 245
		bayModel[54] = new ModelRendererTurbo(this, 1865, 161, textureX, textureY); // Box 246
		bayModel[55] = new ModelRendererTurbo(this, 1369, 177, textureX, textureY); // Box 247
		bayModel[56] = new ModelRendererTurbo(this, 1513, 265, textureX, textureY); // Box 248
		bayModel[57] = new ModelRendererTurbo(this, 313, 305, textureX, textureY); // Box 249
		bayModel[58] = new ModelRendererTurbo(this, 313, 321, textureX, textureY); // Box 250
		bayModel[59] = new ModelRendererTurbo(this, 625, 321, textureX, textureY); // Box 251
		bayModel[60] = new ModelRendererTurbo(this, 1489, 49, textureX, textureY); // Box 252
		bayModel[61] = new ModelRendererTurbo(this, 1521, 49, textureX, textureY); // Box 253
		bayModel[62] = new ModelRendererTurbo(this, 1585, 49, textureX, textureY); // Box 254
		bayModel[63] = new ModelRendererTurbo(this, 1873, 1, textureX, textureY); // Box 255
		bayModel[64] = new ModelRendererTurbo(this, 1905, 1, textureX, textureY); // Box 256
		bayModel[65] = new ModelRendererTurbo(this, 1929, 1, textureX, textureY); // Box 257
		bayModel[66] = new ModelRendererTurbo(this, 873, 65, textureX, textureY); // Box 258
		bayModel[67] = new ModelRendererTurbo(this, 1993, 73, textureX, textureY); // Box 259
		bayModel[68] = new ModelRendererTurbo(this, 593, 97, textureX, textureY); // Box 260
		bayModel[69] = new ModelRendererTurbo(this, 1185, 33, textureX, textureY); // Box 261
		bayModel[70] = new ModelRendererTurbo(this, 1945, 33, textureX, textureY); // Box 262
		bayModel[71] = new ModelRendererTurbo(this, 1969, 33, textureX, textureY); // Box 263
		bayModel[72] = new ModelRendererTurbo(this, 305, 41, textureX, textureY); // Box 264
		bayModel[73] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Box 265
		bayModel[74] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Box 266
		bayModel[75] = new ModelRendererTurbo(this, 377, 41, textureX, textureY); // Box 267
		bayModel[76] = new ModelRendererTurbo(this, 401, 41, textureX, textureY); // Box 268
		bayModel[77] = new ModelRendererTurbo(this, 425, 41, textureX, textureY); // Box 269
		bayModel[78] = new ModelRendererTurbo(this, 449, 41, textureX, textureY); // Box 270
		bayModel[79] = new ModelRendererTurbo(this, 1185, 41, textureX, textureY); // Box 271
		bayModel[80] = new ModelRendererTurbo(this, 657, 49, textureX, textureY); // Box 272
		bayModel[81] = new ModelRendererTurbo(this, 1281, 329, textureX, textureY); // Box 273
		bayModel[82] = new ModelRendererTurbo(this, 625, 337, textureX, textureY); // Box 274
		bayModel[83] = new ModelRendererTurbo(this, 1817, 337, textureX, textureY); // Box 275
		bayModel[84] = new ModelRendererTurbo(this, 745, 97, textureX, textureY); // Box 276
		bayModel[85] = new ModelRendererTurbo(this, 1873, 105, textureX, textureY); // Box 277
		bayModel[86] = new ModelRendererTurbo(this, 745, 113, textureX, textureY); // Box 278
		bayModel[87] = new ModelRendererTurbo(this, 1953, 1, textureX, textureY); // Box 279
		bayModel[88] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 280
		bayModel[89] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 281
		bayModel[90] = new ModelRendererTurbo(this, 1241, 113, textureX, textureY); // Box 282
		bayModel[91] = new ModelRendererTurbo(this, 1577, 121, textureX, textureY); // Box 283
		bayModel[92] = new ModelRendererTurbo(this, 1761, 121, textureX, textureY); // Box 284
		bayModel[93] = new ModelRendererTurbo(this, 1233, 49, textureX, textureY); // Box 285
		bayModel[94] = new ModelRendererTurbo(this, 1337, 49, textureX, textureY); // Box 286
		bayModel[95] = new ModelRendererTurbo(this, 1609, 49, textureX, textureY); // Box 287
		bayModel[96] = new ModelRendererTurbo(this, 665, 57, textureX, textureY); // Box 288
		bayModel[97] = new ModelRendererTurbo(this, 1233, 57, textureX, textureY); // Box 289
		bayModel[98] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 290
		bayModel[99] = new ModelRendererTurbo(this, 665, 65, textureX, textureY); // Box 291
		bayModel[100] = new ModelRendererTurbo(this, 1537, 65, textureX, textureY); // Box 292
		bayModel[101] = new ModelRendererTurbo(this, 1241, 73, textureX, textureY); // Box 293
		bayModel[102] = new ModelRendererTurbo(this, 1265, 73, textureX, textureY); // Box 294
		bayModel[103] = new ModelRendererTurbo(this, 1289, 73, textureX, textureY); // Box 295
		bayModel[104] = new ModelRendererTurbo(this, 2017, 73, textureX, textureY); // Box 296
		bayModel[105] = new ModelRendererTurbo(this, 1281, 345, textureX, textureY); // Box 297
		bayModel[106] = new ModelRendererTurbo(this, 1817, 353, textureX, textureY); // Box 298
		bayModel[107] = new ModelRendererTurbo(this, 193, 361, textureX, textureY); // Box 299
		bayModel[108] = new ModelRendererTurbo(this, 753, 361, textureX, textureY); // Box 300
		bayModel[109] = new ModelRendererTurbo(this, 881, 361, textureX, textureY); // Box 301
		bayModel[110] = new ModelRendererTurbo(this, 345, 369, textureX, textureY); // Box 302
		bayModel[111] = new ModelRendererTurbo(this, 1865, 161, textureX, textureY); // Box 303
		bayModel[112] = new ModelRendererTurbo(this, 1369, 177, textureX, textureY); // Box 304
		bayModel[113] = new ModelRendererTurbo(this, 1513, 265, textureX, textureY); // Box 305

		bayModel[0].addShapeBox(0F, 0F, 0F, 69, 2, 6, 0F,0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bayModel[0].setRotationPoint(-18F, -30F, 29F);

		bayModel[1].addShapeBox(0F, 0F, 0F, 69, 2, 6, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 6
		bayModel[1].setRotationPoint(-18F, -28F, 29F);

		bayModel[2].addShapeBox(0F, 0F, 0F, 69, 2, 6, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F); // Box 7
		bayModel[2].setRotationPoint(-18F, -26F, 29F);

		bayModel[3].addShapeBox(0F, 0F, 0F, 7, 2, 6, 0F,0F, -0.25F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -1.5F); // Box 8
		bayModel[3].setRotationPoint(-25F, -28F, 29F);

		bayModel[4].addShapeBox(0F, 0F, 0F, 7, 2, 6, 0F,0F, -0.25F, -2.25F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, -0.25F, -2.25F, 0F, -0.75F, -1.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.75F, -1.5F); // Box 9
		bayModel[4].setRotationPoint(-25F, -29F, 29F);

		bayModel[5].addShapeBox(0F, 0F, 0F, 7, 2, 6, 0F,0F, -0.75F, -1.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.75F, -1.5F, 0F, -0.25F, -2.25F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, -0.25F, -2.25F); // Box 10
		bayModel[5].setRotationPoint(-25F, -27F, 29F);

		bayModel[6].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, -0.9999F, -0.9999F, 0F, -0.24999F, 0.4999F, 0F, -0.24999F, 0.4999F, 0F, -0.9999F, -0.9999F, 0F, -0.9999F, -0.9999F, 0F, -0.24999F, 0.4999F, 0F, -0.24999F, 0.4999F, 0F, -0.9999F, -0.9999F); // Box 11
		bayModel[6].setRotationPoint(-29F, -28F, 31F);

		bayModel[7].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, -0.9999F, -0.9999F, 0F, 0.74999F, -0.24999F, 0F, 0.74999F, -0.24999F, 0F, -0.9999F, -0.9999F, 0F, -0.9999F, -0.9999F, 0F, -1.74999F, 0.4999F, 0F, -1.74999F, 0.4999F, 0F, -0.9999F, -0.9999F); // Box 12
		bayModel[7].setRotationPoint(-29F, -28F, 31F);

		bayModel[8].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, -0.9999F, -0.9999F, 0F, -1.74999F, 0.4999F, 0F, -1.74999F, 0.4999F, 0F, -0.9999F, -0.9999F, 0F, -0.9999F, -0.9999F, 0F, 0.74999F, -0.24999F, 0F, 0.74999F, -0.24999F, 0F, -0.9999F, -0.9999F); // Box 13
		bayModel[8].setRotationPoint(-29F, -28F, 31F);

		bayModel[9].addShapeBox(0F, 0F, 0F, 8, 2, 6, 0F,0F, 0.5F, -2F, 0F, -0.25F, -2.25F, 0F, -0.25F, -2.25F, 0F, 0.5F, -2F, 0F, -1F, -0.5F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, -1F, -0.5F); // Box 14
		bayModel[9].setRotationPoint(51F, -29F, 29F);

		bayModel[10].addShapeBox(0F, 0F, 0F, 8, 2, 6, 0F,0F, 0F, -0.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, 0F, -0.5F); // Box 15
		bayModel[10].setRotationPoint(51F, -28F, 29F);

		bayModel[11].addShapeBox(0F, 0F, 0F, 8, 2, 6, 0F,0F, -1F, -0.5F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, -1F, -0.5F, 0F, 0.5F, -2F, 0F, -0.25F, -2.25F, 0F, -0.25F, -2.25F, 0F, 0.5F, -2F); // Box 16
		bayModel[11].setRotationPoint(51F, -27F, 29F);

		bayModel[12].addShapeBox(0F, 0F, 0F, 9, 5, 1, 0F,-8.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8.9999F, 0F, 0F, 0F, 0F, -3.9999F, 0F, 0F, -3.9999F, 0F, 0F, 3.9999F, 0F, 0F, 3.9999F); // Box 12
		bayModel[12].setRotationPoint(16F, -33F, 26F);

		bayModel[13].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 1F, -2F, 0F, 1F); // Box 13
		bayModel[13].setRotationPoint(51F, -30F, 29F);

		bayModel[14].addShapeBox(0F, 0F, 0F, 7, 3, 1, 0F,-6F, 0F, 3F, 1F, -1F, 2F, 1F, -1F, -2F, -6F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 14
		bayModel[14].setRotationPoint(51F, -33F, 29F);

		bayModel[15].addShapeBox(0F, 0F, 0F, 9, 5, 1, 0F,0F, 0F, -3.9999F, 0F, 0F, -3.9999F, 0F, 0F, 3.9999F, 0F, 0F, 3.9999F, -8.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8.9999F, 0F, 0F); // Box 15
		bayModel[15].setRotationPoint(16F, -26F, 26F);

		bayModel[16].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,-2F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 1F, -2F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 16
		bayModel[16].setRotationPoint(51F, -26F, 29F);

		bayModel[17].addShapeBox(0F, 0F, 0F, 7, 3, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -6F, 0F, 3F, 1F, -1F, 2F, 1F, -1F, -2F, -6F, 0F, -3F); // Box 17
		bayModel[17].setRotationPoint(51F, -24F, 29F);

		bayModel[18].addShapeBox(0F, 0F, 0F, 9, 5, 1, 0F,-8.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8.9999F, 0F, 0F, 0F, 0F, 3.9999F, 0F, 0F, 3.9999F, 0F, 0F, -3.9999F, 0F, 0F, -3.9999F); // Box 18
		bayModel[18].setRotationPoint(16F, -33F, 37F);

		bayModel[19].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -2F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, -1F, -2F, 0F, -1F); // Box 19
		bayModel[19].setRotationPoint(51F, -30F, 34F);

		bayModel[20].addShapeBox(0F, 0F, 0F, 7, 3, 1, 0F,-6F, 0F, -3F, 1F, -1F, -2F, 1F, -1F, 2F, -6F, 0F, 3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 20
		bayModel[20].setRotationPoint(51F, -33F, 34F);

		bayModel[21].addShapeBox(0F, 0F, 0F, 9, 5, 1, 0F,0F, 0F, 3.9999F, 0F, 0F, 3.9999F, 0F, 0F, -3.9999F, 0F, 0F, -3.9999F, -8.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8.9999F, 0F, 0F); // Box 21
		bayModel[21].setRotationPoint(16F, -26F, 37F);

		bayModel[22].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,-2F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 22
		bayModel[22].setRotationPoint(51F, -26F, 34F);

		bayModel[23].addShapeBox(0F, 0F, 0F, 7, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -6F, 0F, -3F, 1F, -1F, -2F, 1F, -1F, 2F, -6F, 0F, 3F); // Box 23
		bayModel[23].setRotationPoint(51F, -24F, 34F);

		bayModel[24].addShapeBox(0F, 0F, 0F, 69, 2, 6, 0F,0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 216
		bayModel[24].setRotationPoint(-26F, -27F, 21F);

		bayModel[25].addShapeBox(0F, 0F, 0F, 69, 2, 6, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 217
		bayModel[25].setRotationPoint(-26F, -25F, 21F);

		bayModel[26].addShapeBox(0F, 0F, 0F, 69, 2, 6, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F); // Box 218
		bayModel[26].setRotationPoint(-26F, -23F, 21F);

		bayModel[27].addShapeBox(0F, 0F, 0F, 7, 2, 6, 0F,0F, -0.25F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -1.5F); // Box 219
		bayModel[27].setRotationPoint(-33F, -25F, 21F);

		bayModel[28].addShapeBox(0F, 0F, 0F, 7, 2, 6, 0F,0F, -0.25F, -2.25F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, -0.25F, -2.25F, 0F, -0.75F, -1.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.75F, -1.5F); // Box 220
		bayModel[28].setRotationPoint(-33F, -26F, 21F);

		bayModel[29].addShapeBox(0F, 0F, 0F, 7, 2, 6, 0F,0F, -0.75F, -1.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.75F, -1.5F, 0F, -0.25F, -2.25F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, -0.25F, -2.25F); // Box 221
		bayModel[29].setRotationPoint(-33F, -24F, 21F);

		bayModel[30].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, -0.9999F, -0.9999F, 0F, -0.24999F, 0.4999F, 0F, -0.24999F, 0.4999F, 0F, -0.9999F, -0.9999F, 0F, -0.9999F, -0.9999F, 0F, -0.24999F, 0.4999F, 0F, -0.24999F, 0.4999F, 0F, -0.9999F, -0.9999F); // Box 222
		bayModel[30].setRotationPoint(-37F, -25F, 23F);

		bayModel[31].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, -0.9999F, -0.9999F, 0F, 0.74999F, -0.24999F, 0F, 0.74999F, -0.24999F, 0F, -0.9999F, -0.9999F, 0F, -0.9999F, -0.9999F, 0F, -1.74999F, 0.4999F, 0F, -1.74999F, 0.4999F, 0F, -0.9999F, -0.9999F); // Box 223
		bayModel[31].setRotationPoint(-37F, -25F, 23F);

		bayModel[32].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, -0.9999F, -0.9999F, 0F, -1.74999F, 0.4999F, 0F, -1.74999F, 0.4999F, 0F, -0.9999F, -0.9999F, 0F, -0.9999F, -0.9999F, 0F, 0.74999F, -0.24999F, 0F, 0.74999F, -0.24999F, 0F, -0.9999F, -0.9999F); // Box 224
		bayModel[32].setRotationPoint(-37F, -25F, 23F);

		bayModel[33].addShapeBox(0F, 0F, 0F, 8, 2, 6, 0F,0F, 0.5F, -2F, 0F, -0.25F, -2.25F, 0F, -0.25F, -2.25F, 0F, 0.5F, -2F, 0F, -1F, -0.5F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, -1F, -0.5F); // Box 225
		bayModel[33].setRotationPoint(43F, -26F, 21F);

		bayModel[34].addShapeBox(0F, 0F, 0F, 8, 2, 6, 0F,0F, 0F, -0.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, 0F, -0.5F); // Box 226
		bayModel[34].setRotationPoint(43F, -25F, 21F);

		bayModel[35].addShapeBox(0F, 0F, 0F, 8, 2, 6, 0F,0F, -1F, -0.5F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, -1F, -0.5F, 0F, 0.5F, -2F, 0F, -0.25F, -2.25F, 0F, -0.25F, -2.25F, 0F, 0.5F, -2F); // Box 227
		bayModel[35].setRotationPoint(43F, -24F, 21F);

		bayModel[36].addShapeBox(0F, 0F, 0F, 9, 5, 1, 0F,-8.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8.9999F, 0F, 0F, 0F, 0F, -3.9999F, 0F, 0F, -3.9999F, 0F, 0F, 3.9999F, 0F, 0F, 3.9999F); // Box 228
		bayModel[36].setRotationPoint(8F, -30F, 18F);

		bayModel[37].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 1F, -2F, 0F, 1F); // Box 229
		bayModel[37].setRotationPoint(43F, -27F, 21F);

		bayModel[38].addShapeBox(0F, 0F, 0F, 7, 3, 1, 0F,-6F, 0F, 3F, 1F, -1F, 2F, 1F, -1F, -2F, -6F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 230
		bayModel[38].setRotationPoint(43F, -30F, 21F);

		bayModel[39].addShapeBox(0F, 0F, 0F, 9, 5, 1, 0F,0F, 0F, -3.9999F, 0F, 0F, -3.9999F, 0F, 0F, 3.9999F, 0F, 0F, 3.9999F, -8.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8.9999F, 0F, 0F); // Box 231
		bayModel[39].setRotationPoint(8F, -23F, 18F);

		bayModel[40].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,-2F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 1F, -2F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 232
		bayModel[40].setRotationPoint(43F, -23F, 21F);

		bayModel[41].addShapeBox(0F, 0F, 0F, 7, 3, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -6F, 0F, 3F, 1F, -1F, 2F, 1F, -1F, -2F, -6F, 0F, -3F); // Box 233
		bayModel[41].setRotationPoint(43F, -21F, 21F);

		bayModel[42].addShapeBox(0F, 0F, 0F, 9, 5, 1, 0F,-8.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8.9999F, 0F, 0F, 0F, 0F, 3.9999F, 0F, 0F, 3.9999F, 0F, 0F, -3.9999F, 0F, 0F, -3.9999F); // Box 234
		bayModel[42].setRotationPoint(8F, -30F, 29F);

		bayModel[43].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -2F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, -1F, -2F, 0F, -1F); // Box 235
		bayModel[43].setRotationPoint(43F, -27F, 26F);

		bayModel[44].addShapeBox(0F, 0F, 0F, 7, 3, 1, 0F,-6F, 0F, -3F, 1F, -1F, -2F, 1F, -1F, 2F, -6F, 0F, 3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 236
		bayModel[44].setRotationPoint(43F, -30F, 26F);

		bayModel[45].addShapeBox(0F, 0F, 0F, 9, 5, 1, 0F,0F, 0F, 3.9999F, 0F, 0F, 3.9999F, 0F, 0F, -3.9999F, 0F, 0F, -3.9999F, -8.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8.9999F, 0F, 0F); // Box 237
		bayModel[45].setRotationPoint(8F, -23F, 29F);

		bayModel[46].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,-2F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 238
		bayModel[46].setRotationPoint(43F, -23F, 26F);

		bayModel[47].addShapeBox(0F, 0F, 0F, 7, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -6F, 0F, -3F, 1F, -1F, -2F, 1F, -1F, 2F, -6F, 0F, 3F); // Box 239
		bayModel[47].setRotationPoint(43F, -21F, 26F);

		bayModel[48].addShapeBox(0F, 0F, 0F, 66, 5, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		bayModel[48].setRotationPoint(-11F, -27F, 3F);

		bayModel[49].addShapeBox(0F, 0F, 0F, 66, 5, 15, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		bayModel[49].setRotationPoint(-11F, -32F, 3F);

		bayModel[50].addShapeBox(0F, 0F, 0F, 66, 5, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 242
		bayModel[50].setRotationPoint(-11F, -22F, 3F);

		bayModel[51].addShapeBox(0F, 0F, 0F, 45, 5, 15, 0F,0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F); // Box 243
		bayModel[51].setRotationPoint(-56F, -27F, 3F);

		bayModel[52].addShapeBox(0F, 0F, 0F, 45, 5, 15, 0F,0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, -3F, -6F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -3F, -6F); // Box 244
		bayModel[52].setRotationPoint(-56F, -22F, 3F);

		bayModel[53].addShapeBox(0F, 0F, 0F, 45, 5, 15, 0F,0F, -3F, -6F, 0F, 0F, -5F, 0F, 0F, -6F, 0F, -3F, -6F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F); // Box 245
		bayModel[53].setRotationPoint(-56F, -32F, 3F);

		bayModel[54].addShapeBox(0F, 0F, 0F, 20, 3, 11, 0F,0F, -1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -5F, 0F, -1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -5F); // Box 246
		bayModel[54].setRotationPoint(-76F, -26F, 5F);

		bayModel[55].addShapeBox(0F, 0F, 0F, 20, 3, 11, 0F,-4F, -3F, -5F, 0F, 0F, -4F, 0F, 0F, -4F, -4F, -3F, -5F, 0F, 1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -5F); // Box 247
		bayModel[55].setRotationPoint(-76F, -29F, 5F);

		bayModel[56].addShapeBox(0F, 0F, 0F, 20, 3, 11, 0F,0F, 1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -5F, -4F, -3F, -5F, 0F, 0F, -4F, 0F, 0F, -4F, -4F, -3F, -5F); // Box 248
		bayModel[56].setRotationPoint(-76F, -23F, 5F);

		bayModel[57].addShapeBox(0F, 0F, 0F, 69, 2, 6, 0F,0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 249
		bayModel[57].setRotationPoint(-18F, -30F, -35F);

		bayModel[58].addShapeBox(0F, 0F, 0F, 69, 2, 6, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 250
		bayModel[58].setRotationPoint(-18F, -28F, -35F);

		bayModel[59].addShapeBox(0F, 0F, 0F, 69, 2, 6, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F); // Box 251
		bayModel[59].setRotationPoint(-18F, -26F, -35F);

		bayModel[60].addShapeBox(0F, 0F, 0F, 7, 2, 6, 0F,0F, -0.25F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -1.5F); // Box 252
		bayModel[60].setRotationPoint(-25F, -28F, -35F);

		bayModel[61].addShapeBox(0F, 0F, 0F, 7, 2, 6, 0F,0F, -0.25F, -2.25F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, -0.25F, -2.25F, 0F, -0.75F, -1.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.75F, -1.5F); // Box 253
		bayModel[61].setRotationPoint(-25F, -29F, -35F);

		bayModel[62].addShapeBox(0F, 0F, 0F, 7, 2, 6, 0F,0F, -0.75F, -1.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.75F, -1.5F, 0F, -0.25F, -2.25F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, -0.25F, -2.25F); // Box 254
		bayModel[62].setRotationPoint(-25F, -27F, -35F);

		bayModel[63].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, -0.9999F, -0.9999F, 0F, -0.24999F, 0.4999F, 0F, -0.24999F, 0.4999F, 0F, -0.9999F, -0.9999F, 0F, -0.9999F, -0.9999F, 0F, -0.24999F, 0.4999F, 0F, -0.24999F, 0.4999F, 0F, -0.9999F, -0.9999F); // Box 255
		bayModel[63].setRotationPoint(-29F, -28F, -33F);

		bayModel[64].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, -0.9999F, -0.9999F, 0F, 0.74999F, -0.24999F, 0F, 0.74999F, -0.24999F, 0F, -0.9999F, -0.9999F, 0F, -0.9999F, -0.9999F, 0F, -1.74999F, 0.4999F, 0F, -1.74999F, 0.4999F, 0F, -0.9999F, -0.9999F); // Box 256
		bayModel[64].setRotationPoint(-29F, -28F, -33F);

		bayModel[65].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, -0.9999F, -0.9999F, 0F, -1.74999F, 0.4999F, 0F, -1.74999F, 0.4999F, 0F, -0.9999F, -0.9999F, 0F, -0.9999F, -0.9999F, 0F, 0.74999F, -0.24999F, 0F, 0.74999F, -0.24999F, 0F, -0.9999F, -0.9999F); // Box 257
		bayModel[65].setRotationPoint(-29F, -28F, -33F);

		bayModel[66].addShapeBox(0F, 0F, 0F, 8, 2, 6, 0F,0F, 0.5F, -2F, 0F, -0.25F, -2.25F, 0F, -0.25F, -2.25F, 0F, 0.5F, -2F, 0F, -1F, -0.5F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, -1F, -0.5F); // Box 258
		bayModel[66].setRotationPoint(51F, -29F, -35F);

		bayModel[67].addShapeBox(0F, 0F, 0F, 8, 2, 6, 0F,0F, 0F, -0.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, 0F, -0.5F); // Box 259
		bayModel[67].setRotationPoint(51F, -28F, -35F);

		bayModel[68].addShapeBox(0F, 0F, 0F, 8, 2, 6, 0F,0F, -1F, -0.5F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, -1F, -0.5F, 0F, 0.5F, -2F, 0F, -0.25F, -2.25F, 0F, -0.25F, -2.25F, 0F, 0.5F, -2F); // Box 260
		bayModel[68].setRotationPoint(51F, -27F, -35F);

		bayModel[69].addShapeBox(0F, 0F, 0F, 9, 5, 1, 0F,-8.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8.9999F, 0F, 0F, 0F, 0F, 3.9999F, 0F, 0F, 3.9999F, 0F, 0F, -3.9999F, 0F, 0F, -3.9999F); // Box 261
		bayModel[69].setRotationPoint(16F, -33F, -27F);

		bayModel[70].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -2F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, -1F, -2F, 0F, -1F); // Box 262
		bayModel[70].setRotationPoint(51F, -30F, -30F);

		bayModel[71].addShapeBox(0F, 0F, 0F, 7, 3, 1, 0F,-6F, 0F, -3F, 1F, -1F, -2F, 1F, -1F, 2F, -6F, 0F, 3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 263
		bayModel[71].setRotationPoint(51F, -33F, -30F);

		bayModel[72].addShapeBox(0F, 0F, 0F, 9, 5, 1, 0F,0F, 0F, 3.9999F, 0F, 0F, 3.9999F, 0F, 0F, -3.9999F, 0F, 0F, -3.9999F, -8.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8.9999F, 0F, 0F); // Box 264
		bayModel[72].setRotationPoint(16F, -26F, -27F);

		bayModel[73].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,-2F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 265
		bayModel[73].setRotationPoint(51F, -26F, -30F);

		bayModel[74].addShapeBox(0F, 0F, 0F, 7, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -6F, 0F, -3F, 1F, -1F, -2F, 1F, -1F, 2F, -6F, 0F, 3F); // Box 266
		bayModel[74].setRotationPoint(51F, -24F, -30F);

		bayModel[75].addShapeBox(0F, 0F, 0F, 9, 5, 1, 0F,-8.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8.9999F, 0F, 0F, 0F, 0F, -3.9999F, 0F, 0F, -3.9999F, 0F, 0F, 3.9999F, 0F, 0F, 3.9999F); // Box 267
		bayModel[75].setRotationPoint(16F, -33F, -38F);

		bayModel[76].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 1F, -2F, 0F, 1F); // Box 268
		bayModel[76].setRotationPoint(51F, -30F, -35F);

		bayModel[77].addShapeBox(0F, 0F, 0F, 7, 3, 1, 0F,-6F, 0F, 3F, 1F, -1F, 2F, 1F, -1F, -2F, -6F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 269
		bayModel[77].setRotationPoint(51F, -33F, -35F);

		bayModel[78].addShapeBox(0F, 0F, 0F, 9, 5, 1, 0F,0F, 0F, -3.9999F, 0F, 0F, -3.9999F, 0F, 0F, 3.9999F, 0F, 0F, 3.9999F, -8.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8.9999F, 0F, 0F); // Box 270
		bayModel[78].setRotationPoint(16F, -26F, -38F);

		bayModel[79].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,-2F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 1F, -2F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 271
		bayModel[79].setRotationPoint(51F, -26F, -35F);

		bayModel[80].addShapeBox(0F, 0F, 0F, 7, 3, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -6F, 0F, 3F, 1F, -1F, 2F, 1F, -1F, -2F, -6F, 0F, -3F); // Box 272
		bayModel[80].setRotationPoint(51F, -24F, -35F);

		bayModel[81].addShapeBox(0F, 0F, 0F, 69, 2, 6, 0F,0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 273
		bayModel[81].setRotationPoint(-26F, -27F, -27F);

		bayModel[82].addShapeBox(0F, 0F, 0F, 69, 2, 6, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 274
		bayModel[82].setRotationPoint(-26F, -25F, -27F);

		bayModel[83].addShapeBox(0F, 0F, 0F, 69, 2, 6, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F); // Box 275
		bayModel[83].setRotationPoint(-26F, -23F, -27F);

		bayModel[84].addShapeBox(0F, 0F, 0F, 7, 2, 6, 0F,0F, -0.25F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -1.5F); // Box 276
		bayModel[84].setRotationPoint(-33F, -25F, -27F);

		bayModel[85].addShapeBox(0F, 0F, 0F, 7, 2, 6, 0F,0F, -0.25F, -2.25F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, -0.25F, -2.25F, 0F, -0.75F, -1.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.75F, -1.5F); // Box 277
		bayModel[85].setRotationPoint(-33F, -26F, -27F);

		bayModel[86].addShapeBox(0F, 0F, 0F, 7, 2, 6, 0F,0F, -0.75F, -1.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.75F, -1.5F, 0F, -0.25F, -2.25F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, -0.25F, -2.25F); // Box 278
		bayModel[86].setRotationPoint(-33F, -24F, -27F);

		bayModel[87].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, -0.9999F, -0.9999F, 0F, -0.24999F, 0.4999F, 0F, -0.24999F, 0.4999F, 0F, -0.9999F, -0.9999F, 0F, -0.9999F, -0.9999F, 0F, -0.24999F, 0.4999F, 0F, -0.24999F, 0.4999F, 0F, -0.9999F, -0.9999F); // Box 279
		bayModel[87].setRotationPoint(-37F, -25F, -25F);

		bayModel[88].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, -0.9999F, -0.9999F, 0F, 0.74999F, -0.24999F, 0F, 0.74999F, -0.24999F, 0F, -0.9999F, -0.9999F, 0F, -0.9999F, -0.9999F, 0F, -1.74999F, 0.4999F, 0F, -1.74999F, 0.4999F, 0F, -0.9999F, -0.9999F); // Box 280
		bayModel[88].setRotationPoint(-37F, -25F, -25F);

		bayModel[89].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, -0.9999F, -0.9999F, 0F, -1.74999F, 0.4999F, 0F, -1.74999F, 0.4999F, 0F, -0.9999F, -0.9999F, 0F, -0.9999F, -0.9999F, 0F, 0.74999F, -0.24999F, 0F, 0.74999F, -0.24999F, 0F, -0.9999F, -0.9999F); // Box 281
		bayModel[89].setRotationPoint(-37F, -25F, -25F);

		bayModel[90].addShapeBox(0F, 0F, 0F, 8, 2, 6, 0F,0F, 0.5F, -2F, 0F, -0.25F, -2.25F, 0F, -0.25F, -2.25F, 0F, 0.5F, -2F, 0F, -1F, -0.5F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, -1F, -0.5F); // Box 282
		bayModel[90].setRotationPoint(43F, -26F, -27F);

		bayModel[91].addShapeBox(0F, 0F, 0F, 8, 2, 6, 0F,0F, 0F, -0.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, 0F, -0.5F); // Box 283
		bayModel[91].setRotationPoint(43F, -25F, -27F);

		bayModel[92].addShapeBox(0F, 0F, 0F, 8, 2, 6, 0F,0F, -1F, -0.5F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, -1F, -0.5F, 0F, 0.5F, -2F, 0F, -0.25F, -2.25F, 0F, -0.25F, -2.25F, 0F, 0.5F, -2F); // Box 284
		bayModel[92].setRotationPoint(43F, -24F, -27F);

		bayModel[93].addShapeBox(0F, 0F, 0F, 9, 5, 1, 0F,-8.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8.9999F, 0F, 0F, 0F, 0F, 3.9999F, 0F, 0F, 3.9999F, 0F, 0F, -3.9999F, 0F, 0F, -3.9999F); // Box 285
		bayModel[93].setRotationPoint(8F, -30F, -19F);

		bayModel[94].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -2F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, -1F, -2F, 0F, -1F); // Box 286
		bayModel[94].setRotationPoint(43F, -27F, -22F);

		bayModel[95].addShapeBox(0F, 0F, 0F, 7, 3, 1, 0F,-6F, 0F, -3F, 1F, -1F, -2F, 1F, -1F, 2F, -6F, 0F, 3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 287
		bayModel[95].setRotationPoint(43F, -30F, -22F);

		bayModel[96].addShapeBox(0F, 0F, 0F, 9, 5, 1, 0F,0F, 0F, 3.9999F, 0F, 0F, 3.9999F, 0F, 0F, -3.9999F, 0F, 0F, -3.9999F, -8.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8.9999F, 0F, 0F); // Box 288
		bayModel[96].setRotationPoint(8F, -23F, -19F);

		bayModel[97].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,-2F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 289
		bayModel[97].setRotationPoint(43F, -23F, -22F);

		bayModel[98].addShapeBox(0F, 0F, 0F, 7, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -6F, 0F, -3F, 1F, -1F, -2F, 1F, -1F, 2F, -6F, 0F, 3F); // Box 290
		bayModel[98].setRotationPoint(43F, -21F, -22F);

		bayModel[99].addShapeBox(0F, 0F, 0F, 9, 5, 1, 0F,-8.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8.9999F, 0F, 0F, 0F, 0F, -3.9999F, 0F, 0F, -3.9999F, 0F, 0F, 3.9999F, 0F, 0F, 3.9999F); // Box 291
		bayModel[99].setRotationPoint(8F, -30F, -30F);

		bayModel[100].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 1F, -2F, 0F, 1F); // Box 292
		bayModel[100].setRotationPoint(43F, -27F, -27F);

		bayModel[101].addShapeBox(0F, 0F, 0F, 7, 3, 1, 0F,-6F, 0F, 3F, 1F, -1F, 2F, 1F, -1F, -2F, -6F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 293
		bayModel[101].setRotationPoint(43F, -30F, -27F);

		bayModel[102].addShapeBox(0F, 0F, 0F, 9, 5, 1, 0F,0F, 0F, -3.9999F, 0F, 0F, -3.9999F, 0F, 0F, 3.9999F, 0F, 0F, 3.9999F, -8.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8.9999F, 0F, 0F); // Box 294
		bayModel[102].setRotationPoint(8F, -23F, -30F);

		bayModel[103].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,-2F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 1F, -2F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 295
		bayModel[103].setRotationPoint(43F, -23F, -27F);

		bayModel[104].addShapeBox(0F, 0F, 0F, 7, 3, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -6F, 0F, 3F, 1F, -1F, 2F, 1F, -1F, -2F, -6F, 0F, -3F); // Box 296
		bayModel[104].setRotationPoint(43F, -21F, -27F);

		bayModel[105].addShapeBox(0F, 0F, 0F, 66, 5, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 297
		bayModel[105].setRotationPoint(-11F, -27F, -18F);

		bayModel[106].addShapeBox(0F, 0F, 0F, 66, 5, 15, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
		bayModel[106].setRotationPoint(-11F, -32F, -18F);

		bayModel[107].addShapeBox(0F, 0F, 0F, 66, 5, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 299
		bayModel[107].setRotationPoint(-11F, -22F, -18F);

		bayModel[108].addShapeBox(0F, 0F, 0F, 45, 5, 15, 0F,0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F); // Box 300
		bayModel[108].setRotationPoint(-56F, -27F, -18F);

		bayModel[109].addShapeBox(0F, 0F, 0F, 45, 5, 15, 0F,0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, -3F, -6F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -3F, -6F); // Box 301
		bayModel[109].setRotationPoint(-56F, -22F, -18F);

		bayModel[110].addShapeBox(0F, 0F, 0F, 45, 5, 15, 0F,0F, -3F, -6F, 0F, 0F, -6F, 0F, 0F, -5F, 0F, -3F, -6F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F); // Box 302
		bayModel[110].setRotationPoint(-56F, -32F, -18F);

		bayModel[111].addShapeBox(0F, 0F, 0F, 20, 3, 11, 0F,0F, -1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -5F, 0F, -1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -5F); // Box 303
		bayModel[111].setRotationPoint(-76F, -26F, -16F);

		bayModel[112].addShapeBox(0F, 0F, 0F, 20, 3, 11, 0F,-4F, -3F, -5F, 0F, 0F, -4F, 0F, 0F, -4F, -4F, -3F, -5F, 0F, 1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -5F); // Box 304
		bayModel[112].setRotationPoint(-76F, -29F, -16F);

		bayModel[113].addShapeBox(0F, 0F, 0F, 20, 3, 11, 0F,0F, 1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -5F, -4F, -3F, -5F, 0F, 0F, -4F, 0F, 0F, -4F, -4F, -3F, -5F); // Box 305
		bayModel[113].setRotationPoint(-76F, -23F, -16F);
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 769, 65, textureX, textureY); // Box 42
		leftWingModel[1] = new ModelRendererTurbo(this, 385, 209, textureX, textureY); // Box 75
		leftWingModel[2] = new ModelRendererTurbo(this, 625, 217, textureX, textureY); // Box 79
		leftWingModel[3] = new ModelRendererTurbo(this, 1537, 49, textureX, textureY); // Box 80
		leftWingModel[4] = new ModelRendererTurbo(this, 1297, 49, textureX, textureY); // Box 81
		leftWingModel[5] = new ModelRendererTurbo(this, 368, 442, textureX, textureY); // Box 376
		leftWingModel[6] = new ModelRendererTurbo(this, 1232, 422, textureX, textureY); // Box 385

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 165, 9, 139, 0F,0F, -1F, -124F, 0F, -3F, 15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -121F, 0F, -4F, 15F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		leftWingModel[0].setRotationPoint(-37F, -41.5F, -205F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 48, 12, 140, 0F,0F, -10F, 14F, -47.8F, -10F, 14F, 0F, -8.5F, 8F, 0F, -7F, 0F, 0F, 0F, 14F, -47.8F, 0F, 14F, 0F, 4F, 8F, 0F, 4F, 0F); // Box 75
		leftWingModel[1].setRotationPoint(128F, -48.5F, -206F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 29, 7, 93, 0F,27.45F, -1.1F, 0F, -38F, -3F, 0F, -4F, -3.4F, 1F, 0F, -0.2F, 0F, 27.45F, -1.8F, 0F, -38F, -3F, 0F, -4F, -3F, 1F, 0F, 0.5F, 0F); // Box 79
		leftWingModel[2].setRotationPoint(176F, -40F, -151F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 14, 2, 13, 0F,3.9F, 0F, 0F, -4.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 3.9F, 0F, 0F, -4.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F); // Box 80
		leftWingModel[3].setRotationPoint(132F, -38.5F, -220F);

		leftWingModel[4].addShapeBox(0F, 0F, 0F, 14, 2, 6, 0F,-3F, 0F, 0F, -7F, 0F, -0.2F, -4.4F, 0F, 0F, 3.9F, 0F, 0F, -3F, 0F, 0F, -7F, 0F, -0.2F, -4.4F, 0F, 0F, 3.9F, 0F, 0F); // Box 81
		leftWingModel[4].setRotationPoint(132F, -38.5F, -226F);

		leftWingModel[5].addShapeBox(-100F, 0F, -100F, 200, 1, 200, 0F,-50F, 0F, -50F, -50F, 2F, -50F, -50F, 2.5F, -50F, -50F, 0.7F, -50F, -50F, 0F, -50F, -50F, 0F, -50F, -50F, 0F, -50F, -50F, 0F, -50F); // Box 376
		leftWingModel[5].setRotationPoint(74F, -39.8F, -111F);
		leftWingModel[5].rotateAngleY = 1.23918377F;

		leftWingModel[6].addShapeBox(-100F, 1F, -25F, 200, 1, 50, 0F,-66F, 0.5F, -15F, -66F, 1F, -15F, -66F, 2F, -15F, -66F, 0F, -15F, -66F, 0F, -15F, -66F, 0F, -15F, -66F, 0F, -15F, -66F, 0F, -15F); // Box 385
		leftWingModel[6].setRotationPoint(131F, -40.4F, -149F);
		leftWingModel[6].rotateAngleY = 1.30899694F;
	}

	private void initrightWingModel_1()
	{
		rightWingModel[0] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 39
		rightWingModel[1] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 74
		rightWingModel[2] = new ModelRendererTurbo(this, 1993, 33, textureX, textureY); // Box 76
		rightWingModel[3] = new ModelRendererTurbo(this, 1769, 41, textureX, textureY); // Box 77
		rightWingModel[4] = new ModelRendererTurbo(this, 241, 201, textureX, textureY); // Box 78
		rightWingModel[5] = new ModelRendererTurbo(this, 1232, 422, textureX, textureY); // Box 386

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 165, 9, 139, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 15F, 0F, -1F, -124F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 15F, 0F, -1F, -121F); // Box 39
		rightWingModel[0].setRotationPoint(-37F, -41.5F, 66F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 48, 12, 140, 0F,0F, -7F, 0F, 0F, -8.5F, 8F, -47.8F, -10F, 14F, 0F, -10F, 14F, 0F, 4F, 0F, 0F, 4F, 8F, -47.8F, 0F, 14F, 0F, 0F, 14F); // Box 74
		rightWingModel[1].setRotationPoint(128F, -48.5F, 66F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 14, 2, 13, 0F,0F, 0.1F, 0F, 0F, 0F, 0F, -4.4F, 0F, 0F, 3.9F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, -4.4F, 0F, 0F, 3.9F, 0F, 0F); // Box 76
		rightWingModel[2].setRotationPoint(132F, -38.5F, 207F);

		rightWingModel[3].addShapeBox(0F, 0F, 0F, 14, 2, 6, 0F,3.9F, 0F, 0F, -4.4F, 0F, 0F, -7F, 0F, -0.2F, -3F, 0F, 0F, 3.9F, 0F, 0F, -4.4F, 0F, 0F, -7F, 0F, -0.2F, -3F, 0F, 0F); // Box 77
		rightWingModel[3].setRotationPoint(132F, -38.5F, 220F);

		rightWingModel[4].addShapeBox(0F, 0F, 0F, 29, 7, 93, 0F,0F, -0.2F, 0F, -4F, -3F, 1F, -38F, -3F, 0F, 27.45F, -1.1F, 0F, 0F, 0.5F, 0F, -4F, -3F, 1F, -38F, -3F, 0F, 27.45F, -1.8F, 0F); // Box 78
		rightWingModel[4].setRotationPoint(176F, -40F, 58F);

		rightWingModel[5].addShapeBox(-100F, 1F, -25F, 200, 1, 50, 0F,-66F, 1F, -15F, -66F, 0.5F, -15F, -66F, 0F, -15F, -66F, 2F, -15F, -66F, 0F, -15F, -66F, 0F, -15F, -66F, 0F, -15F, -66F, 0F, -15F); // Box 386
		rightWingModel[5].setRotationPoint(131F, -40.5F, 149F);
		rightWingModel[5].rotateAngleY = 1.83259571F;
	}

	private void initpitchFlapLeftWingModel_1()
	{
		pitchFlapLeftWingModel[0] = new ModelRendererTurbo(this, 817, 145, textureX, textureY); // Box 84
		pitchFlapLeftWingModel[1] = new ModelRendererTurbo(this, 1329, 145, textureX, textureY); // Box 86

		pitchFlapLeftWingModel[0].addShapeBox(0F, 0F, -14F, 17, 2, 28, 0F,0F, 0.1F, 1.2F, -2.1F, -1F, -3.8F, 0.66F, -1.5F, 5.75F, 0F, 0.4F, 0.5F, 0F, 1F, 1.2F, -2.1F, 0.3F, -3.8F, 0.66F, 0.5F, 5.75F, 0F, 1.7F, 0.5F); // Box 84
		pitchFlapLeftWingModel[0].setRotationPoint(144.5F, -38.5F, -165F);
		pitchFlapLeftWingModel[0].rotateAngleY = -0.28448867F;

		pitchFlapLeftWingModel[1].addShapeBox(0F, 0F, -14F, 15, 2, 28, 0F,0F, -0.1F, 0.5F, -1.7F, 0F, -3.3F, 0F, -1F, 5F, 0F, 0.1F, 0F, 0F, 0.3F, 0.5F, -1.7F, 0F, -3.3F, 0F, 0.3F, 5F, 0F, 1F, 0F); // Box 86
		pitchFlapLeftWingModel[1].setRotationPoint(136.2F, -38.5F, -193F);
		pitchFlapLeftWingModel[1].rotateAngleY = -0.28448867F;
	}

	private void initpitchFlapRightWingModel_1()
	{
		pitchFlapRightWingModel[0] = new ModelRendererTurbo(this, 1697, 121, textureX, textureY); // Box 82
		pitchFlapRightWingModel[1] = new ModelRendererTurbo(this, 1937, 137, textureX, textureY); // Box 83

		pitchFlapRightWingModel[0].addShapeBox(0F, 0F, -14F, 15, 2, 28, 0F,0F, 0.1F, 0F, 0F, -1F, 5F, -1.7F, 0F, -3.3F, 0F, -0.1F, 0.5F, 0F, 1F, 0F, 0F, 0.3F, 5F, -1.7F, 0F, -3.3F, 0F, 0.3F, 0.5F); // Box 82
		pitchFlapRightWingModel[0].setRotationPoint(136.2F, -38.5F, 193F);
		pitchFlapRightWingModel[0].rotateAngleY = 0.28448867F;

		pitchFlapRightWingModel[1].addShapeBox(0F, 0F, -14F, 17, 2, 28, 0F,0F, 0.4F, 0.5F, 0.66F, -1.5F, 5.75F, -2.1F, -1F, -3.8F, 0F, 0.1F, 1.2F, 0F, 1.7F, 0.5F, 0.66F, 0.5F, 5.75F, -2.1F, 0.3F, -3.8F, 0F, 1F, 1.2F); // Box 83
		pitchFlapRightWingModel[1].setRotationPoint(144.5F, -38.5F, 165F);
		pitchFlapRightWingModel[1].rotateAngleY = 0.28448867F;
	}

	private void initbodyWheelModel_1()
	{
		bodyWheelModel[0] = new ModelRendererTurbo(this, 857, 129, textureX, textureY); // Box 324
		bodyWheelModel[1] = new ModelRendererTurbo(this, 1817, 129, textureX, textureY); // Box 325
		bodyWheelModel[2] = new ModelRendererTurbo(this, 2001, 137, textureX, textureY); // Box 326
		bodyWheelModel[3] = new ModelRendererTurbo(this, 2001, 153, textureX, textureY); // Box 327
		bodyWheelModel[4] = new ModelRendererTurbo(this, 1681, 177, textureX, textureY); // Box 328
		bodyWheelModel[5] = new ModelRendererTurbo(this, 81, 201, textureX, textureY); // Box 329
		bodyWheelModel[6] = new ModelRendererTurbo(this, 1137, 265, textureX, textureY); // Box 330
		bodyWheelModel[7] = new ModelRendererTurbo(this, 321, 201, textureX, textureY); // Box 331
		bodyWheelModel[8] = new ModelRendererTurbo(this, 129, 153, textureX, textureY); // Box 332
		bodyWheelModel[9] = new ModelRendererTurbo(this, 473, 201, textureX, textureY); // Box 333
		bodyWheelModel[10] = new ModelRendererTurbo(this, 1633, 233, textureX, textureY); // Box 334
		bodyWheelModel[11] = new ModelRendererTurbo(this, 393, 249, textureX, textureY); // Box 335
		bodyWheelModel[12] = new ModelRendererTurbo(this, 1265, 265, textureX, textureY); // Box 336
		bodyWheelModel[13] = new ModelRendererTurbo(this, 985, 273, textureX, textureY); // Box 337
		bodyWheelModel[14] = new ModelRendererTurbo(this, 1953, 273, textureX, textureY); // Box 338
		bodyWheelModel[15] = new ModelRendererTurbo(this, 393, 281, textureX, textureY); // Box 339
		bodyWheelModel[16] = new ModelRendererTurbo(this, 697, 209, textureX, textureY); // Box 340
		bodyWheelModel[17] = new ModelRendererTurbo(this, 2025, 217, textureX, textureY); // Box 341
		bodyWheelModel[18] = new ModelRendererTurbo(this, 897, 385, textureX, textureY); // Box 342
		bodyWheelModel[19] = new ModelRendererTurbo(this, 1793, 393, textureX, textureY); // Box 343
		bodyWheelModel[20] = new ModelRendererTurbo(this, 737, 129, textureX, textureY); // Box 344
		bodyWheelModel[21] = new ModelRendererTurbo(this, 1393, 145, textureX, textureY); // Box 345
		bodyWheelModel[22] = new ModelRendererTurbo(this, 1393, 161, textureX, textureY); // Box 346
		bodyWheelModel[23] = new ModelRendererTurbo(this, 865, 177, textureX, textureY); // Box 347
		bodyWheelModel[24] = new ModelRendererTurbo(this, 769, 193, textureX, textureY); // Box 348
		bodyWheelModel[25] = new ModelRendererTurbo(this, 1241, 193, textureX, textureY); // Box 349
		bodyWheelModel[26] = new ModelRendererTurbo(this, 121, 81, textureX, textureY); // Box 350
		bodyWheelModel[27] = new ModelRendererTurbo(this, 1505, 81, textureX, textureY); // Box 351
		bodyWheelModel[28] = new ModelRendererTurbo(this, 625, 297, textureX, textureY); // Box 352
		bodyWheelModel[29] = new ModelRendererTurbo(this, 777, 297, textureX, textureY); // Box 353

		bodyWheelModel[0].addShapeBox(0F, 0F, 0F, 18, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Box 324
		bodyWheelModel[0].setRotationPoint(67F, 4F, -64F);

		bodyWheelModel[1].addShapeBox(0F, 0F, 0F, 18, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 325
		bodyWheelModel[1].setRotationPoint(67F, -2F, -64F);

		bodyWheelModel[2].addShapeBox(0F, 0F, 0F, 18, 6, 5, 0F,-6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 326
		bodyWheelModel[2].setRotationPoint(67F, -8F, -64F);

		bodyWheelModel[3].addShapeBox(0F, 0F, 0F, 18, 6, 5, 0F,-6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 327
		bodyWheelModel[3].setRotationPoint(43F, -8F, -64F);

		bodyWheelModel[4].addShapeBox(0F, 0F, 0F, 18, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 328
		bodyWheelModel[4].setRotationPoint(43F, -2F, -64F);

		bodyWheelModel[5].addShapeBox(0F, 0F, 0F, 18, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Box 329
		bodyWheelModel[5].setRotationPoint(43F, 4F, -64F);

		bodyWheelModel[6].addShapeBox(0F, 0F, 0F, 33, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 330
		bodyWheelModel[6].setRotationPoint(48F, -1F, -66F);

		bodyWheelModel[7].addShapeBox(0F, 0F, 0F, 3, 32, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 331
		bodyWheelModel[7].setRotationPoint(63F, -32F, -65.5F);

		bodyWheelModel[8].addShapeBox(0F, 0F, 0F, 3, 31, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 332
		bodyWheelModel[8].setRotationPoint(63F, -27F, -66.5F);
		bodyWheelModel[8].rotateAngleZ = -0.48869219F;

		bodyWheelModel[9].addShapeBox(0F, 0F, 0F, 18, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Box 333
		bodyWheelModel[9].setRotationPoint(67F, 4F, 59F);

		bodyWheelModel[10].addShapeBox(0F, 0F, 0F, 18, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 334
		bodyWheelModel[10].setRotationPoint(67F, -2F, 59F);

		bodyWheelModel[11].addShapeBox(0F, 0F, 0F, 18, 6, 5, 0F,-6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 335
		bodyWheelModel[11].setRotationPoint(67F, -8F, 59F);

		bodyWheelModel[12].addShapeBox(0F, 0F, 0F, 18, 6, 5, 0F,-6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 336
		bodyWheelModel[12].setRotationPoint(43F, -8F, 59F);

		bodyWheelModel[13].addShapeBox(0F, 0F, 0F, 18, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 337
		bodyWheelModel[13].setRotationPoint(43F, -2F, 59F);

		bodyWheelModel[14].addShapeBox(0F, 0F, 0F, 18, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Box 338
		bodyWheelModel[14].setRotationPoint(43F, 4F, 59F);

		bodyWheelModel[15].addShapeBox(0F, 0F, 0F, 33, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 339
		bodyWheelModel[15].setRotationPoint(48F, -1F, 62F);

		bodyWheelModel[16].addShapeBox(0F, 0F, 0F, 3, 32, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 340
		bodyWheelModel[16].setRotationPoint(63F, -32F, 62.5F);

		bodyWheelModel[17].addShapeBox(0F, 0F, 0F, 3, 31, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 341
		bodyWheelModel[17].setRotationPoint(63F, -27F, 65.5F);
		bodyWheelModel[17].rotateAngleZ = -0.48869219F;

		bodyWheelModel[18].addShapeBox(0F, 0F, 20F, 71, 15, 3, 0F,0F, 0.5F, 22F, 0F, 0.5F, 22F, 0F, 0.5F, -15F, 0F, 0.5F, -15F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 342
		bodyWheelModel[18].setRotationPoint(16F, -32.5F, -67F);
		bodyWheelModel[18].rotateAngleX = -1.1693706F;

		bodyWheelModel[19].addShapeBox(0F, 0F, -20F, 71, 15, 3, 0F,0F, 0.5F, -15F, 0F, 0.5F, -15F, 0F, 0.5F, 22F, 0F, 0.5F, 22F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, 3F, 0F, -1F, 3F); // Box 343
		bodyWheelModel[19].setRotationPoint(16F, -32.5F, 64F);
		bodyWheelModel[19].rotateAngleX = 1.1693706F;

		bodyWheelModel[20].addShapeBox(0F, 0F, 0F, 15, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 344
		bodyWheelModel[20].setRotationPoint(-125F, 5F, -6F);

		bodyWheelModel[21].addShapeBox(0F, 0F, 0F, 15, 5, 4, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 345
		bodyWheelModel[21].setRotationPoint(-125F, -5F, -6F);

		bodyWheelModel[22].addShapeBox(0F, 0F, 0F, 15, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 346
		bodyWheelModel[22].setRotationPoint(-125F, 0F, -6F);

		bodyWheelModel[23].addShapeBox(0F, 0F, 0F, 15, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 347
		bodyWheelModel[23].setRotationPoint(-125F, 5F, 2F);

		bodyWheelModel[24].addShapeBox(0F, 0F, 0F, 15, 5, 4, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 348
		bodyWheelModel[24].setRotationPoint(-125F, -5F, 2F);

		bodyWheelModel[25].addShapeBox(0F, 0F, 0F, 15, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 349
		bodyWheelModel[25].setRotationPoint(-125F, 0F, 2F);

		bodyWheelModel[26].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 350
		bodyWheelModel[26].setRotationPoint(-119F, 1F, -3F);

		bodyWheelModel[27].addShapeBox(0F, 0F, 0F, 2, 18, 2, 0F,-0.5F, 0F, 1F, 3F, 0F, 1F, 3F, 0F, 1F, -0.5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 351
		bodyWheelModel[27].setRotationPoint(-118.5F, -17F, -1F);

		bodyWheelModel[28].addShapeBox(0F, 0F, -0.5F, 43, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 352
		bodyWheelModel[28].setRotationPoint(-121.5F, -16F, -10F);
		bodyWheelModel[28].rotateAngleX = -0.19198622F;

		bodyWheelModel[29].addShapeBox(0F, 0F, -0.5F, 43, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 353
		bodyWheelModel[29].setRotationPoint(-121.5F, -16F, 10F);
		bodyWheelModel[29].rotateAngleX = 0.19198622F;
	}

	private void initbodyDoorOpenModel_1()
	{
		bodyDoorOpenModel[0] = new ModelRendererTurbo(this, 0, 482, textureX, textureY); // Box 310
		bodyDoorOpenModel[1] = new ModelRendererTurbo(this, 0, 508, textureX, textureY); // Box 311
		bodyDoorOpenModel[2] = new ModelRendererTurbo(this, 1129, 385, textureX, textureY); // Box 312
		bodyDoorOpenModel[3] = new ModelRendererTurbo(this, 193, 393, textureX, textureY); // Box 313
		bodyDoorOpenModel[4] = new ModelRendererTurbo(this, 1345, 393, textureX, textureY); // Box 314
		bodyDoorOpenModel[5] = new ModelRendererTurbo(this, 1577, 393, textureX, textureY); // Box 315

		bodyDoorOpenModel[0].addShapeBox(0F, -0.5F, 0F, 40, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 310
		bodyDoorOpenModel[0].setRotationPoint(-78F, -16F, -20F);
		bodyDoorOpenModel[0].rotateAngleX = -2.61799388F;

		bodyDoorOpenModel[1].addShapeBox(0F, -0.5F, -20F, 40, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 311
		bodyDoorOpenModel[1].setRotationPoint(-78F, -16F, 20F);
		bodyDoorOpenModel[1].rotateAngleX = 2.61799388F;

		bodyDoorOpenModel[2].addShapeBox(0F, -0.5F, 0F, 96, 1, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 312
		bodyDoorOpenModel[2].setRotationPoint(-38F, -16F, -38F);
		bodyDoorOpenModel[2].rotateAngleX = -2.44346095F;

		bodyDoorOpenModel[3].addShapeBox(0F, -0.5F, 0F, 96, 1, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 313
		bodyDoorOpenModel[3].setRotationPoint(-38F, -4F, -53F);
		bodyDoorOpenModel[3].rotateAngleX = -0.17453293F;

		bodyDoorOpenModel[4].addShapeBox(0F, -0.5F, -19F, 96, 1, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 314
		bodyDoorOpenModel[4].setRotationPoint(-38F, -16F, 38F);
		bodyDoorOpenModel[4].rotateAngleX = 2.44346095F;

		bodyDoorOpenModel[5].addShapeBox(0F, -0.5F, -19F, 96, 1, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 315
		bodyDoorOpenModel[5].setRotationPoint(-38F, -4F, 53F);
		bodyDoorOpenModel[5].rotateAngleX = 0.17453293F;
	}

	private void initbodyDoorCloseModel_1()
	{
		bodyDoorCloseModel[0] = new ModelRendererTurbo(this, 433, 369, textureX, textureY); // Box 306
		bodyDoorCloseModel[1] = new ModelRendererTurbo(this, 665, 385, textureX, textureY); // Box 307
		bodyDoorCloseModel[2] = new ModelRendererTurbo(this, 737, 25, textureX, textureY); // Box 308
		bodyDoorCloseModel[3] = new ModelRendererTurbo(this, 0, 458, textureX, textureY); // Box 309

		bodyDoorCloseModel[0].addShapeBox(0F, -0.5F, 0F, 96, 1, 38, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 306
		bodyDoorCloseModel[0].setRotationPoint(-38F, -16F, -38F);

		bodyDoorCloseModel[1].addShapeBox(0F, -0.5F, -38F, 96, 1, 38, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 307
		bodyDoorCloseModel[1].setRotationPoint(-38F, -16F, 38F);

		bodyDoorCloseModel[2].addShapeBox(0F, -0.5F, 0F, 40, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 308
		bodyDoorCloseModel[2].setRotationPoint(-78F, -16F, -20F);

		bodyDoorCloseModel[3].addShapeBox(0F, -0.5F, -20F, 40, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309
		bodyDoorCloseModel[3].setRotationPoint(-78F, -16F, 20F);
	}

	private void inithudModel_1()
	{
		hudModel[0] = new ModelRendererTurbo(this, 1945, 381, textureX, textureY); // Box 372
		hudModel[1] = new ModelRendererTurbo(this, 1945, 381, textureX, textureY); // Box 389

		hudModel[0].addShapeBox(-0.4F, -23.5F, -23.5F, 1, 47, 47, 0F,-0.4F, -20F, -20.5F, -0.4F, -20F, -20.5F, -0.4F, -20F, -20.5F, -0.4F, -20F, -20.5F, -0.4F, -20F, -20.5F, -0.4F, -20F, -20.5F, -0.4F, -20F, -20.5F, -0.4F, -20F, -20.5F); // Box 372
		hudModel[0].setRotationPoint(-133.7F, -48F, -7F);

		hudModel[1].addShapeBox(-0.4F, -23.5F, -23.5F, 1, 47, 47, 0F,-0.4F, -20F, -20.5F, -0.4F, -20F, -20.5F, -0.4F, -20F, -20.5F, -0.4F, -20F, -20.5F, -0.4F, -20F, -20.5F, -0.4F, -20F, -20.5F, -0.4F, -20F, -20.5F, -0.4F, -20F, -20.5F); // Box 389
		hudModel[1].setRotationPoint(-133.7F, -48F, 7F);
	}
}