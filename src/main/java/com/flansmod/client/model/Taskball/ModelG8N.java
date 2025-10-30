//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: G8N
// Model Creator: 
// Created on: 23.05.2023 - 01:05:39
// Last changed on: 23.05.2023 - 01:05:39

package com.flansmod.client.model.Taskball; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelG8N extends ModelPlane //Same as Filename
{
	int textureX = 2048;
	int textureY = 1024;

	public ModelG8N() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[496];
		tailModel = new ModelRendererTurbo[5];
		leftWingModel = new ModelRendererTurbo[6];
		rightWingModel = new ModelRendererTurbo[6];
		bodyWheelModel = new ModelRendererTurbo[7];
		leftWingWheelModel = new ModelRendererTurbo[9];
		rightWingWheelModel = new ModelRendererTurbo[9];

		initbodyModel_1();
		inittailModel_1();
		initleftWingModel_1();
		initrightWingModel_1();
		initbodyWheelModel_1();
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
		bodyModel[1] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 5
		bodyModel[2] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 6
		bodyModel[3] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 7
		bodyModel[4] = new ModelRendererTurbo(this, 429, 589, textureX, textureY); // Box 8
		bodyModel[5] = new ModelRendererTurbo(this, 513, 589, textureX, textureY); // Box 9
		bodyModel[6] = new ModelRendererTurbo(this, 129, 589, textureX, textureY); // Box 10
		bodyModel[7] = new ModelRendererTurbo(this, 729, 1, textureX, textureY); // Box 11
		bodyModel[8] = new ModelRendererTurbo(this, 342, 589, textureX, textureY); // Box 12
		bodyModel[9] = new ModelRendererTurbo(this, 60, 589, textureX, textureY); // Box 13
		bodyModel[10] = new ModelRendererTurbo(this, 1041, 1, textureX, textureY); // Box 14
		bodyModel[11] = new ModelRendererTurbo(this, 1153, 1, textureX, textureY); // Box 15
		bodyModel[12] = new ModelRendererTurbo(this, 1481, 1, textureX, textureY); // Box 16
		bodyModel[13] = new ModelRendererTurbo(this, 0, 697, textureX, textureY); // Box 17
		bodyModel[14] = new ModelRendererTurbo(this, 161, 697, textureX, textureY); // Box 18
		bodyModel[15] = new ModelRendererTurbo(this, 1937, 1, textureX, textureY); // Box 19
		bodyModel[16] = new ModelRendererTurbo(this, 425, 41, textureX, textureY); // Box 20
		bodyModel[17] = new ModelRendererTurbo(this, 280, 697, textureX, textureY); // Box 21
		bodyModel[18] = new ModelRendererTurbo(this, 805, 697, textureX, textureY); // Box 22
		bodyModel[19] = new ModelRendererTurbo(this, 961, 41, textureX, textureY); // Box 23
		bodyModel[20] = new ModelRendererTurbo(this, 909, 697, textureX, textureY); // Box 24
		bodyModel[21] = new ModelRendererTurbo(this, 1145, 41, textureX, textureY); // Box 25
		bodyModel[22] = new ModelRendererTurbo(this, 597, 589, textureX, textureY); // Box 26
		bodyModel[23] = new ModelRendererTurbo(this, 1241, 41, textureX, textureY); // Box 27
		bodyModel[24] = new ModelRendererTurbo(this, 1329, 41, textureX, textureY); // Box 28
		bodyModel[25] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 29
		bodyModel[26] = new ModelRendererTurbo(this, 545, 1, textureX, textureY); // Box 30
		bodyModel[27] = new ModelRendererTurbo(this, 569, 1, textureX, textureY); // Box 31
		bodyModel[28] = new ModelRendererTurbo(this, 617, 1, textureX, textureY); // Box 32
		bodyModel[29] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 33
		bodyModel[30] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 34
		bodyModel[31] = new ModelRendererTurbo(this, 625, 1, textureX, textureY); // Box 35
		bodyModel[32] = new ModelRendererTurbo(this, 849, 1, textureX, textureY); // Box 36
		bodyModel[33] = new ModelRendererTurbo(this, 881, 1, textureX, textureY); // Box 37
		bodyModel[34] = new ModelRendererTurbo(this, 945, 1, textureX, textureY); // Box 38
		bodyModel[35] = new ModelRendererTurbo(this, 1129, 1, textureX, textureY); // Box 39
		bodyModel[36] = new ModelRendererTurbo(this, 1025, 1, textureX, textureY); // Box 40
		bodyModel[37] = new ModelRendererTurbo(this, 1449, 1, textureX, textureY); // Box 41
		bodyModel[38] = new ModelRendererTurbo(this, 1041, 1, textureX, textureY); // Box 42
		bodyModel[39] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 43
		bodyModel[40] = new ModelRendererTurbo(this, 641, 1, textureX, textureY); // Box 44
		bodyModel[41] = new ModelRendererTurbo(this, 865, 1, textureX, textureY); // Box 45
		bodyModel[42] = new ModelRendererTurbo(this, 1481, 1, textureX, textureY); // Box 46
		bodyModel[43] = new ModelRendererTurbo(this, 1777, 1, textureX, textureY); // Box 47
		bodyModel[44] = new ModelRendererTurbo(this, 625, 1, textureX, textureY); // Box 48
		bodyModel[45] = new ModelRendererTurbo(this, 668, 697, textureX, textureY); // Box 49
		bodyModel[46] = new ModelRendererTurbo(this, 1537, 41, textureX, textureY); // Box 50
		bodyModel[47] = new ModelRendererTurbo(this, 1649, 41, textureX, textureY); // Box 51
		bodyModel[48] = new ModelRendererTurbo(this, 1769, 41, textureX, textureY); // Box 52
		bodyModel[49] = new ModelRendererTurbo(this, 1129, 9, textureX, textureY); // Box 53
		bodyModel[50] = new ModelRendererTurbo(this, 1817, 41, textureX, textureY); // Box 54
		bodyModel[51] = new ModelRendererTurbo(this, 1785, 1, textureX, textureY); // Box 55
		bodyModel[52] = new ModelRendererTurbo(this, 1921, 41, textureX, textureY); // Box 56
		bodyModel[53] = new ModelRendererTurbo(this, 409, 697, textureX, textureY); // Box 57
		bodyModel[54] = new ModelRendererTurbo(this, 1023, 697, textureX, textureY); // Box 58
		bodyModel[55] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 59
		bodyModel[56] = new ModelRendererTurbo(this, 1961, 49, textureX, textureY); // Box 60
		bodyModel[57] = new ModelRendererTurbo(this, 345, 57, textureX, textureY); // Box 61
		bodyModel[58] = new ModelRendererTurbo(this, 377, 65, textureX, textureY); // Box 62
		bodyModel[59] = new ModelRendererTurbo(this, 481, 65, textureX, textureY); // Box 63
		bodyModel[60] = new ModelRendererTurbo(this, 425, 65, textureX, textureY); // Box 64
		bodyModel[61] = new ModelRendererTurbo(this, 1169, 57, textureX, textureY); // Box 65
		bodyModel[62] = new ModelRendererTurbo(this, 1609, 65, textureX, textureY); // Box 66
		bodyModel[63] = new ModelRendererTurbo(this, 180, 589, textureX, textureY); // Box 69
		bodyModel[64] = new ModelRendererTurbo(this, 243, 589, textureX, textureY); // Box 70
		bodyModel[65] = new ModelRendererTurbo(this, 1801, 65, textureX, textureY); // Box 373
		bodyModel[66] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 374
		bodyModel[67] = new ModelRendererTurbo(this, 137, 73, textureX, textureY); // Box 375
		bodyModel[68] = new ModelRendererTurbo(this, 1241, 65, textureX, textureY); // Box 376
		bodyModel[69] = new ModelRendererTurbo(this, 833, 73, textureX, textureY); // Box 377
		bodyModel[70] = new ModelRendererTurbo(this, 1129, 73, textureX, textureY); // Box 378
		bodyModel[71] = new ModelRendererTurbo(this, 1393, 73, textureX, textureY); // Box 379
		bodyModel[72] = new ModelRendererTurbo(this, 1473, 73, textureX, textureY); // Box 380
		bodyModel[73] = new ModelRendererTurbo(this, 1529, 73, textureX, textureY); // Box 381
		bodyModel[74] = new ModelRendererTurbo(this, 1993, 49, textureX, textureY); // Box 382
		bodyModel[75] = new ModelRendererTurbo(this, 2009, 1, textureX, textureY); // Box 383
		bodyModel[76] = new ModelRendererTurbo(this, 1961, 17, textureX, textureY); // Box 384
		bodyModel[77] = new ModelRendererTurbo(this, 1633, 73, textureX, textureY); // Box 385
		bodyModel[78] = new ModelRendererTurbo(this, 209, 81, textureX, textureY); // Box 386
		bodyModel[79] = new ModelRendererTurbo(this, 905, 81, textureX, textureY); // Box 387
		bodyModel[80] = new ModelRendererTurbo(this, 313, 89, textureX, textureY); // Box 388
		bodyModel[81] = new ModelRendererTurbo(this, 449, 89, textureX, textureY); // Box 389
		bodyModel[82] = new ModelRendererTurbo(this, 1937, 81, textureX, textureY); // Box 390
		bodyModel[83] = new ModelRendererTurbo(this, 673, 89, textureX, textureY); // Box 391
		bodyModel[84] = new ModelRendererTurbo(this, 1193, 89, textureX, textureY); // Box 392
		bodyModel[85] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 393
		bodyModel[86] = new ModelRendererTurbo(this, 137, 105, textureX, textureY); // Box 394
		bodyModel[87] = new ModelRendererTurbo(this, 1361, 105, textureX, textureY); // Box 395
		bodyModel[88] = new ModelRendererTurbo(this, 1705, 73, textureX, textureY); // Box 396
		bodyModel[89] = new ModelRendererTurbo(this, 1457, 73, textureX, textureY); // Box 397
		bodyModel[90] = new ModelRendererTurbo(this, 1601, 73, textureX, textureY); // Box 398
		bodyModel[91] = new ModelRendererTurbo(this, 281, 81, textureX, textureY); // Box 399
		bodyModel[92] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 400
		bodyModel[93] = new ModelRendererTurbo(this, 1041, 9, textureX, textureY); // Box 401
		bodyModel[94] = new ModelRendererTurbo(this, 1449, 9, textureX, textureY); // Box 402
		bodyModel[95] = new ModelRendererTurbo(this, 985, 81, textureX, textureY); // Box 403
		bodyModel[96] = new ModelRendererTurbo(this, 2025, 17, textureX, textureY); // Box 404
		bodyModel[97] = new ModelRendererTurbo(this, 1513, 41, textureX, textureY); // Box 405
		bodyModel[98] = new ModelRendererTurbo(this, 833, 65, textureX, textureY); // Box 406
		bodyModel[99] = new ModelRendererTurbo(this, 1905, 81, textureX, textureY); // Box 483
		bodyModel[100] = new ModelRendererTurbo(this, 1017, 81, textureX, textureY); // Box 484
		bodyModel[101] = new ModelRendererTurbo(this, 417, 89, textureX, textureY); // Box 485
		bodyModel[102] = new ModelRendererTurbo(this, 833, 113, textureX, textureY); // Box 316
		bodyModel[103] = new ModelRendererTurbo(this, 1097, 113, textureX, textureY); // Box 332
		bodyModel[104] = new ModelRendererTurbo(this, 1473, 113, textureX, textureY); // Box 333
		bodyModel[105] = new ModelRendererTurbo(this, 1553, 121, textureX, textureY); // Box 334
		bodyModel[106] = new ModelRendererTurbo(this, 1801, 121, textureX, textureY); // Box 335
		bodyModel[107] = new ModelRendererTurbo(this, 1905, 121, textureX, textureY); // Box 336
		bodyModel[108] = new ModelRendererTurbo(this, 281, 129, textureX, textureY); // Box 337
		bodyModel[109] = new ModelRendererTurbo(this, 137, 153, textureX, textureY); // Box 338
		bodyModel[110] = new ModelRendererTurbo(this, 1361, 153, textureX, textureY); // Box 339
		bodyModel[111] = new ModelRendererTurbo(this, 1209, 129, textureX, textureY); // Box 340
		bodyModel[112] = new ModelRendererTurbo(this, 1625, 129, textureX, textureY); // Box 341
		bodyModel[113] = new ModelRendererTurbo(this, 457, 137, textureX, textureY); // Box 342
		bodyModel[114] = new ModelRendererTurbo(this, 673, 137, textureX, textureY); // Box 343
		bodyModel[115] = new ModelRendererTurbo(this, 913, 137, textureX, textureY); // Box 344
		bodyModel[116] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 345
		bodyModel[117] = new ModelRendererTurbo(this, 1801, 169, textureX, textureY); // Box 346
		bodyModel[118] = new ModelRendererTurbo(this, 1537, 161, textureX, textureY); // Box 347
		bodyModel[119] = new ModelRendererTurbo(this, 1193, 169, textureX, textureY); // Box 348
		bodyModel[120] = new ModelRendererTurbo(this, 1929, 169, textureX, textureY); // Box 349
		bodyModel[121] = new ModelRendererTurbo(this, 289, 177, textureX, textureY); // Box 350
		bodyModel[122] = new ModelRendererTurbo(this, 985, 137, textureX, textureY); // Box 351
		bodyModel[123] = new ModelRendererTurbo(this, 1433, 105, textureX, textureY); // Box 352
		bodyModel[124] = new ModelRendererTurbo(this, 385, 185, textureX, textureY); // Box 353
		bodyModel[125] = new ModelRendererTurbo(this, 505, 185, textureX, textureY); // Box 354
		bodyModel[126] = new ModelRendererTurbo(this, 1625, 185, textureX, textureY); // Box 355
		bodyModel[127] = new ModelRendererTurbo(this, 673, 193, textureX, textureY); // Box 356
		bodyModel[128] = new ModelRendererTurbo(this, 1265, 89, textureX, textureY); // Box 134
		bodyModel[129] = new ModelRendererTurbo(this, 1017, 97, textureX, textureY); // Box 135
		bodyModel[130] = new ModelRendererTurbo(this, 713, 41, textureX, textureY); // Box 136
		bodyModel[131] = new ModelRendererTurbo(this, 1633, 41, textureX, textureY); // Box 137
		bodyModel[132] = new ModelRendererTurbo(this, 1305, 65, textureX, textureY); // Box 138
		bodyModel[133] = new ModelRendererTurbo(this, 1801, 65, textureX, textureY); // Box 139
		bodyModel[134] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 140
		bodyModel[135] = new ModelRendererTurbo(this, 905, 73, textureX, textureY); // Box 141
		bodyModel[136] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Box 142
		bodyModel[137] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Box 143
		bodyModel[138] = new ModelRendererTurbo(this, 1873, 121, textureX, textureY); // Box 144
		bodyModel[139] = new ModelRendererTurbo(this, 753, 81, textureX, textureY); // Box 145
		bodyModel[140] = new ModelRendererTurbo(this, 305, 89, textureX, textureY); // Box 146
		bodyModel[141] = new ModelRendererTurbo(this, 73, 105, textureX, textureY); // Box 147
		bodyModel[142] = new ModelRendererTurbo(this, 1433, 121, textureX, textureY); // Box 148
		bodyModel[143] = new ModelRendererTurbo(this, 1009, 121, textureX, textureY); // Box 149
		bodyModel[144] = new ModelRendererTurbo(this, 1985, 121, textureX, textureY); // Box 150
		bodyModel[145] = new ModelRendererTurbo(this, 1097, 169, textureX, textureY); // Box 109
		bodyModel[146] = new ModelRendererTurbo(this, 841, 193, textureX, textureY); // Box 110
		bodyModel[147] = new ModelRendererTurbo(this, 1361, 81, textureX, textureY); // Box 111
		bodyModel[148] = new ModelRendererTurbo(this, 153, 193, textureX, textureY); // Box 102
		bodyModel[149] = new ModelRendererTurbo(this, 881, 193, textureX, textureY); // Box 103
		bodyModel[150] = new ModelRendererTurbo(this, 1289, 121, textureX, textureY); // Box 105
		bodyModel[151] = new ModelRendererTurbo(this, 753, 105, textureX, textureY); // Box 106
		bodyModel[152] = new ModelRendererTurbo(this, 1177, 129, textureX, textureY); // Box 107
		bodyModel[153] = new ModelRendererTurbo(this, 303, 589, textureX, textureY); // Box 163
		bodyModel[154] = new ModelRendererTurbo(this, 0, 589, textureX, textureY); // Box 164
		bodyModel[155] = new ModelRendererTurbo(this, 961, 1, textureX, textureY); // Box 165
		bodyModel[156] = new ModelRendererTurbo(this, 2001, 1, textureX, textureY); // Box 166
		bodyModel[157] = new ModelRendererTurbo(this, 849, 1, textureX, textureY); // Box 167
		bodyModel[158] = new ModelRendererTurbo(this, 945, 1, textureX, textureY); // Box 168
		bodyModel[159] = new ModelRendererTurbo(this, 1025, 1, textureX, textureY); // Box 169
		bodyModel[160] = new ModelRendererTurbo(this, 537, 697, textureX, textureY); // Box 170
		bodyModel[161] = new ModelRendererTurbo(this, 1139, 697, textureX, textureY); // Box 171
		bodyModel[162] = new ModelRendererTurbo(this, 2033, 1, textureX, textureY); // Box 172
		bodyModel[163] = new ModelRendererTurbo(this, 553, 9, textureX, textureY); // Box 173
		bodyModel[164] = new ModelRendererTurbo(this, 553, 17, textureX, textureY); // Box 174
		bodyModel[165] = new ModelRendererTurbo(this, 617, 17, textureX, textureY); // Box 175
		bodyModel[166] = new ModelRendererTurbo(this, 1825, 1, textureX, textureY); // Box 176
		bodyModel[167] = new ModelRendererTurbo(this, 1497, 1, textureX, textureY); // Box 177
		bodyModel[168] = new ModelRendererTurbo(this, 649, 9, textureX, textureY); // Box 178
		bodyModel[169] = new ModelRendererTurbo(this, 873, 1, textureX, textureY); // Box 179
		bodyModel[170] = new ModelRendererTurbo(this, 2033, 9, textureX, textureY); // Box 180
		bodyModel[171] = new ModelRendererTurbo(this, 617, 9, textureX, textureY); // Box 181
		bodyModel[172] = new ModelRendererTurbo(this, 729, 17, textureX, textureY); // Box 182
		bodyModel[173] = new ModelRendererTurbo(this, 1473, 9, textureX, textureY); // Box 183
		bodyModel[174] = new ModelRendererTurbo(this, 657, 9, textureX, textureY); // Box 184
		bodyModel[175] = new ModelRendererTurbo(this, 881, 1, textureX, textureY); // Box 185
		bodyModel[176] = new ModelRendererTurbo(this, 849, 17, textureX, textureY); // Box 186
		bodyModel[177] = new ModelRendererTurbo(this, 897, 1, textureX, textureY); // Box 187
		bodyModel[178] = new ModelRendererTurbo(this, 865, 17, textureX, textureY); // Box 188
		bodyModel[179] = new ModelRendererTurbo(this, 633, 17, textureX, textureY); // Box 189
		bodyModel[180] = new ModelRendererTurbo(this, 553, 89, textureX, textureY); // Box 190
		bodyModel[181] = new ModelRendererTurbo(this, 1465, 17, textureX, textureY); // Box 191
		bodyModel[182] = new ModelRendererTurbo(this, 1633, 73, textureX, textureY); // Box 192
		bodyModel[183] = new ModelRendererTurbo(this, 1001, 233, textureX, textureY); // Box 193
		bodyModel[184] = new ModelRendererTurbo(this, 425, 137, textureX, textureY); // Box 194
		bodyModel[185] = new ModelRendererTurbo(this, 1697, 145, textureX, textureY); // Box 195
		bodyModel[186] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 196
		bodyModel[187] = new ModelRendererTurbo(this, 429, 550, textureX, textureY); // Box 197
		bodyModel[188] = new ModelRendererTurbo(this, 513, 550, textureX, textureY); // Box 198
		bodyModel[189] = new ModelRendererTurbo(this, 129, 550, textureX, textureY); // Box 199
		bodyModel[190] = new ModelRendererTurbo(this, 1329, 233, textureX, textureY); // Box 200
		bodyModel[191] = new ModelRendererTurbo(this, 342, 550, textureX, textureY); // Box 201
		bodyModel[192] = new ModelRendererTurbo(this, 60, 550, textureX, textureY); // Box 202
		bodyModel[193] = new ModelRendererTurbo(this, 137, 217, textureX, textureY); // Box 203
		bodyModel[194] = new ModelRendererTurbo(this, 345, 241, textureX, textureY); // Box 204
		bodyModel[195] = new ModelRendererTurbo(this, 1577, 241, textureX, textureY); // Box 205
		bodyModel[196] = new ModelRendererTurbo(this, 0, 650, textureX, textureY); // Box 206
		bodyModel[197] = new ModelRendererTurbo(this, 161, 650, textureX, textureY); // Box 207
		bodyModel[198] = new ModelRendererTurbo(this, 833, 169, textureX, textureY); // Box 208
		bodyModel[199] = new ModelRendererTurbo(this, 393, 281, textureX, textureY); // Box 209
		bodyModel[200] = new ModelRendererTurbo(this, 280, 650, textureX, textureY); // Box 210
		bodyModel[201] = new ModelRendererTurbo(this, 805, 650, textureX, textureY); // Box 211
		bodyModel[202] = new ModelRendererTurbo(this, 1905, 241, textureX, textureY); // Box 212
		bodyModel[203] = new ModelRendererTurbo(this, 909, 650, textureX, textureY); // Box 213
		bodyModel[204] = new ModelRendererTurbo(this, 137, 257, textureX, textureY); // Box 214
		bodyModel[205] = new ModelRendererTurbo(this, 597, 550, textureX, textureY); // Box 215
		bodyModel[206] = new ModelRendererTurbo(this, 1241, 201, textureX, textureY); // Box 216
		bodyModel[207] = new ModelRendererTurbo(this, 465, 209, textureX, textureY); // Box 217
		bodyModel[208] = new ModelRendererTurbo(this, 705, 17, textureX, textureY); // Box 218
		bodyModel[209] = new ModelRendererTurbo(this, 873, 17, textureX, textureY); // Box 219
		bodyModel[210] = new ModelRendererTurbo(this, 969, 33, textureX, textureY); // Box 220
		bodyModel[211] = new ModelRendererTurbo(this, 1129, 9, textureX, textureY); // Box 221
		bodyModel[212] = new ModelRendererTurbo(this, 1777, 1, textureX, textureY); // Box 222
		bodyModel[213] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 223
		bodyModel[214] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 224
		bodyModel[215] = new ModelRendererTurbo(this, 2017, 81, textureX, textureY); // Box 225
		bodyModel[216] = new ModelRendererTurbo(this, 1537, 73, textureX, textureY); // Box 226
		bodyModel[217] = new ModelRendererTurbo(this, 537, 25, textureX, textureY); // Box 227
		bodyModel[218] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Box 228
		bodyModel[219] = new ModelRendererTurbo(this, 1705, 73, textureX, textureY); // Box 229
		bodyModel[220] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 230
		bodyModel[221] = new ModelRendererTurbo(this, 945, 17, textureX, textureY); // Box 231
		bodyModel[222] = new ModelRendererTurbo(this, 969, 9, textureX, textureY); // Box 232
		bodyModel[223] = new ModelRendererTurbo(this, 1937, 17, textureX, textureY); // Box 233
		bodyModel[224] = new ModelRendererTurbo(this, 625, 25, textureX, textureY); // Box 234
		bodyModel[225] = new ModelRendererTurbo(this, 1745, 73, textureX, textureY); // Box 235
		bodyModel[226] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // Box 236
		bodyModel[227] = new ModelRendererTurbo(this, 1169, 9, textureX, textureY); // Box 237
		bodyModel[228] = new ModelRendererTurbo(this, 668, 650, textureX, textureY); // Box 238
		bodyModel[229] = new ModelRendererTurbo(this, 1457, 265, textureX, textureY); // Box 239
		bodyModel[230] = new ModelRendererTurbo(this, 1313, 273, textureX, textureY); // Box 240
		bodyModel[231] = new ModelRendererTurbo(this, 745, 137, textureX, textureY); // Box 241
		bodyModel[232] = new ModelRendererTurbo(this, 1281, 137, textureX, textureY); // Box 242
		bodyModel[233] = new ModelRendererTurbo(this, 1001, 209, textureX, textureY); // Box 243
		bodyModel[234] = new ModelRendererTurbo(this, 529, 153, textureX, textureY); // Box 244
		bodyModel[235] = new ModelRendererTurbo(this, 73, 153, textureX, textureY); // Box 245
		bodyModel[236] = new ModelRendererTurbo(this, 409, 650, textureX, textureY); // Box 246
		bodyModel[237] = new ModelRendererTurbo(this, 1023, 650, textureX, textureY); // Box 247
		bodyModel[238] = new ModelRendererTurbo(this, 1113, 281, textureX, textureY); // Box 248
		bodyModel[239] = new ModelRendererTurbo(this, 1505, 153, textureX, textureY); // Box 249
		bodyModel[240] = new ModelRendererTurbo(this, 1017, 161, textureX, textureY); // Box 250
		bodyModel[241] = new ModelRendererTurbo(this, 1, 265, textureX, textureY); // Box 251
		bodyModel[242] = new ModelRendererTurbo(this, 289, 281, textureX, textureY); // Box 252
		bodyModel[243] = new ModelRendererTurbo(this, 1409, 281, textureX, textureY); // Box 253
		bodyModel[244] = new ModelRendererTurbo(this, 665, 289, textureX, textureY); // Box 254
		bodyModel[245] = new ModelRendererTurbo(this, 1073, 297, textureX, textureY); // Box 255
		bodyModel[246] = new ModelRendererTurbo(this, 180, 550, textureX, textureY); // Box 262
		bodyModel[247] = new ModelRendererTurbo(this, 243, 550, textureX, textureY); // Box 263
		bodyModel[248] = new ModelRendererTurbo(this, 1817, 281, textureX, textureY); // Box 264
		bodyModel[249] = new ModelRendererTurbo(this, 1921, 281, textureX, textureY); // Box 265
		bodyModel[250] = new ModelRendererTurbo(this, 1457, 297, textureX, textureY); // Box 266
		bodyModel[251] = new ModelRendererTurbo(this, 257, 305, textureX, textureY); // Box 267
		bodyModel[252] = new ModelRendererTurbo(this, 313, 305, textureX, textureY); // Box 268
		bodyModel[253] = new ModelRendererTurbo(this, 417, 305, textureX, textureY); // Box 269
		bodyModel[254] = new ModelRendererTurbo(this, 1697, 289, textureX, textureY); // Box 270
		bodyModel[255] = new ModelRendererTurbo(this, 489, 305, textureX, textureY); // Box 271
		bodyModel[256] = new ModelRendererTurbo(this, 545, 305, textureX, textureY); // Box 272
		bodyModel[257] = new ModelRendererTurbo(this, 641, 241, textureX, textureY); // Box 273
		bodyModel[258] = new ModelRendererTurbo(this, 673, 89, textureX, textureY); // Box 274
		bodyModel[259] = new ModelRendererTurbo(this, 1305, 89, textureX, textureY); // Box 275
		bodyModel[260] = new ModelRendererTurbo(this, 649, 305, textureX, textureY); // Box 276
		bodyModel[261] = new ModelRendererTurbo(this, 857, 305, textureX, textureY); // Box 277
		bodyModel[262] = new ModelRendererTurbo(this, 961, 305, textureX, textureY); // Box 278
		bodyModel[263] = new ModelRendererTurbo(this, 1073, 305, textureX, textureY); // Box 279
		bodyModel[264] = new ModelRendererTurbo(this, 1265, 305, textureX, textureY); // Box 280
		bodyModel[265] = new ModelRendererTurbo(this, 1, 313, textureX, textureY); // Box 281
		bodyModel[266] = new ModelRendererTurbo(this, 113, 313, textureX, textureY); // Box 282
		bodyModel[267] = new ModelRendererTurbo(this, 1921, 313, textureX, textureY); // Box 283
		bodyModel[268] = new ModelRendererTurbo(this, 721, 321, textureX, textureY); // Box 284
		bodyModel[269] = new ModelRendererTurbo(this, 1457, 321, textureX, textureY); // Box 285
		bodyModel[270] = new ModelRendererTurbo(this, 1657, 321, textureX, textureY); // Box 286
		bodyModel[271] = new ModelRendererTurbo(this, 929, 305, textureX, textureY); // Box 287
		bodyModel[272] = new ModelRendererTurbo(this, 2009, 161, textureX, textureY); // Box 288
		bodyModel[273] = new ModelRendererTurbo(this, 1585, 209, textureX, textureY); // Box 289
		bodyModel[274] = new ModelRendererTurbo(this, 361, 177, textureX, textureY); // Box 290
		bodyModel[275] = new ModelRendererTurbo(this, 833, 89, textureX, textureY); // Box 291
		bodyModel[276] = new ModelRendererTurbo(this, 905, 89, textureX, textureY); // Box 292
		bodyModel[277] = new ModelRendererTurbo(this, 1201, 89, textureX, textureY); // Box 293
		bodyModel[278] = new ModelRendererTurbo(this, 537, 209, textureX, textureY); // Box 294
		bodyModel[279] = new ModelRendererTurbo(this, 1641, 89, textureX, textureY); // Box 295
		bodyModel[280] = new ModelRendererTurbo(this, 137, 97, textureX, textureY); // Box 296
		bodyModel[281] = new ModelRendererTurbo(this, 209, 97, textureX, textureY); // Box 297
		bodyModel[282] = new ModelRendererTurbo(this, 289, 249, textureX, textureY); // Box 298
		bodyModel[283] = new ModelRendererTurbo(this, 1521, 249, textureX, textureY); // Box 299
		bodyModel[284] = new ModelRendererTurbo(this, 1, 289, textureX, textureY); // Box 300
		bodyModel[285] = new ModelRendererTurbo(this, 1817, 337, textureX, textureY); // Box 301
		bodyModel[286] = new ModelRendererTurbo(this, 257, 345, textureX, textureY); // Box 302
		bodyModel[287] = new ModelRendererTurbo(this, 369, 345, textureX, textureY); // Box 303
		bodyModel[288] = new ModelRendererTurbo(this, 481, 345, textureX, textureY); // Box 304
		bodyModel[289] = new ModelRendererTurbo(this, 1041, 345, textureX, textureY); // Box 305
		bodyModel[290] = new ModelRendererTurbo(this, 1, 353, textureX, textureY); // Box 306
		bodyModel[291] = new ModelRendererTurbo(this, 553, 361, textureX, textureY); // Box 307
		bodyModel[292] = new ModelRendererTurbo(this, 857, 361, textureX, textureY); // Box 308
		bodyModel[293] = new ModelRendererTurbo(this, 377, 385, textureX, textureY); // Box 309
		bodyModel[294] = new ModelRendererTurbo(this, 1265, 353, textureX, textureY); // Box 310
		bodyModel[295] = new ModelRendererTurbo(this, 1937, 353, textureX, textureY); // Box 311
		bodyModel[296] = new ModelRendererTurbo(this, 113, 361, textureX, textureY); // Box 312
		bodyModel[297] = new ModelRendererTurbo(this, 1113, 361, textureX, textureY); // Box 313
		bodyModel[298] = new ModelRendererTurbo(this, 729, 369, textureX, textureY); // Box 314
		bodyModel[299] = new ModelRendererTurbo(this, 1009, 393, textureX, textureY); // Box 315
		bodyModel[300] = new ModelRendererTurbo(this, 1265, 401, textureX, textureY); // Box 316
		bodyModel[301] = new ModelRendererTurbo(this, 1, 401, textureX, textureY); // Box 317
		bodyModel[302] = new ModelRendererTurbo(this, 857, 401, textureX, textureY); // Box 318
		bodyModel[303] = new ModelRendererTurbo(this, 921, 401, textureX, textureY); // Box 319
		bodyModel[304] = new ModelRendererTurbo(this, 1657, 369, textureX, textureY); // Box 320
		bodyModel[305] = new ModelRendererTurbo(this, 1337, 353, textureX, textureY); // Box 321
		bodyModel[306] = new ModelRendererTurbo(this, 1217, 281, textureX, textureY); // Box 322
		bodyModel[307] = new ModelRendererTurbo(this, 1401, 401, textureX, textureY); // Box 323
		bodyModel[308] = new ModelRendererTurbo(this, 553, 409, textureX, textureY); // Box 324
		bodyModel[309] = new ModelRendererTurbo(this, 641, 409, textureX, textureY); // Box 325
		bodyModel[310] = new ModelRendererTurbo(this, 721, 409, textureX, textureY); // Box 326
		bodyModel[311] = new ModelRendererTurbo(this, 385, 305, textureX, textureY); // Box 327
		bodyModel[312] = new ModelRendererTurbo(this, 801, 241, textureX, textureY); // Box 328
		bodyModel[313] = new ModelRendererTurbo(this, 1049, 97, textureX, textureY); // Box 329
		bodyModel[314] = new ModelRendererTurbo(this, 1361, 97, textureX, textureY); // Box 330
		bodyModel[315] = new ModelRendererTurbo(this, 2017, 97, textureX, textureY); // Box 331
		bodyModel[316] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 332
		bodyModel[317] = new ModelRendererTurbo(this, 553, 105, textureX, textureY); // Box 333
		bodyModel[318] = new ModelRendererTurbo(this, 673, 105, textureX, textureY); // Box 334
		bodyModel[319] = new ModelRendererTurbo(this, 1097, 105, textureX, textureY); // Box 335
		bodyModel[320] = new ModelRendererTurbo(this, 1745, 105, textureX, textureY); // Box 336
		bodyModel[321] = new ModelRendererTurbo(this, 1041, 305, textureX, textureY); // Box 337
		bodyModel[322] = new ModelRendererTurbo(this, 617, 305, textureX, textureY); // Box 338
		bodyModel[323] = new ModelRendererTurbo(this, 937, 257, textureX, textureY); // Box 339
		bodyModel[324] = new ModelRendererTurbo(this, 1177, 305, textureX, textureY); // Box 340
		bodyModel[325] = new ModelRendererTurbo(this, 1369, 305, textureX, textureY); // Box 341
		bodyModel[326] = new ModelRendererTurbo(this, 721, 305, textureX, textureY); // Box 342
		bodyModel[327] = new ModelRendererTurbo(this, 81, 313, textureX, textureY); // Box 343
		bodyModel[328] = new ModelRendererTurbo(this, 1361, 209, textureX, textureY); // Box 344
		bodyModel[329] = new ModelRendererTurbo(this, 1425, 209, textureX, textureY); // Box 345
		bodyModel[330] = new ModelRendererTurbo(this, 1825, 409, textureX, textureY); // Box 346
		bodyModel[331] = new ModelRendererTurbo(this, 73, 169, textureX, textureY); // Box 347
		bodyModel[332] = new ModelRendererTurbo(this, 1913, 409, textureX, textureY); // Box 348
		bodyModel[333] = new ModelRendererTurbo(this, 2009, 185, textureX, textureY); // Box 349
		bodyModel[334] = new ModelRendererTurbo(this, 1, 433, textureX, textureY); // Box 350
		bodyModel[335] = new ModelRendererTurbo(this, 241, 433, textureX, textureY); // Box 351
		bodyModel[336] = new ModelRendererTurbo(this, 1873, 241, textureX, textureY); // Box 353
		bodyModel[337] = new ModelRendererTurbo(this, 737, 193, textureX, textureY); // Box 354
		bodyModel[338] = new ModelRendererTurbo(this, 2001, 241, textureX, textureY); // Box 355
		bodyModel[339] = new ModelRendererTurbo(this, 303, 550, textureX, textureY); // Box 356
		bodyModel[340] = new ModelRendererTurbo(this, 0, 550, textureX, textureY); // Box 357
		bodyModel[341] = new ModelRendererTurbo(this, 561, 33, textureX, textureY); // Box 358
		bodyModel[342] = new ModelRendererTurbo(this, 1489, 17, textureX, textureY); // Box 359
		bodyModel[343] = new ModelRendererTurbo(this, 1937, 1, textureX, textureY); // Box 360
		bodyModel[344] = new ModelRendererTurbo(this, 1497, 9, textureX, textureY); // Box 361
		bodyModel[345] = new ModelRendererTurbo(this, 721, 17, textureX, textureY); // Box 362
		bodyModel[346] = new ModelRendererTurbo(this, 537, 650, textureX, textureY); // Box 363
		bodyModel[347] = new ModelRendererTurbo(this, 1139, 650, textureX, textureY); // Box 364
		bodyModel[348] = new ModelRendererTurbo(this, 585, 33, textureX, textureY); // Box 365
		bodyModel[349] = new ModelRendererTurbo(this, 601, 33, textureX, textureY); // Box 366
		bodyModel[350] = new ModelRendererTurbo(this, 617, 33, textureX, textureY); // Box 367
		bodyModel[351] = new ModelRendererTurbo(this, 977, 33, textureX, textureY); // Box 368
		bodyModel[352] = new ModelRendererTurbo(this, 745, 17, textureX, textureY); // Box 369
		bodyModel[353] = new ModelRendererTurbo(this, 1777, 17, textureX, textureY); // Box 370
		bodyModel[354] = new ModelRendererTurbo(this, 961, 41, textureX, textureY); // Box 371
		bodyModel[355] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 372
		bodyModel[356] = new ModelRendererTurbo(this, 993, 33, textureX, textureY); // Box 373
		bodyModel[357] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 374
		bodyModel[358] = new ModelRendererTurbo(this, 1009, 33, textureX, textureY); // Box 375
		bodyModel[359] = new ModelRendererTurbo(this, 529, 33, textureX, textureY); // Box 376
		bodyModel[360] = new ModelRendererTurbo(this, 1417, 41, textureX, textureY); // Box 377
		bodyModel[361] = new ModelRendererTurbo(this, 1025, 33, textureX, textureY); // Box 378
		bodyModel[362] = new ModelRendererTurbo(this, 1321, 41, textureX, textureY); // Box 379
		bodyModel[363] = new ModelRendererTurbo(this, 1033, 33, textureX, textureY); // Box 380
		bodyModel[364] = new ModelRendererTurbo(this, 553, 33, textureX, textureY); // Box 381
		bodyModel[365] = new ModelRendererTurbo(this, 2025, 33, textureX, textureY); // Box 382
		bodyModel[366] = new ModelRendererTurbo(this, 1553, 265, textureX, textureY); // Box 383
		bodyModel[367] = new ModelRendererTurbo(this, 1801, 89, textureX, textureY); // Box 384
		bodyModel[368] = new ModelRendererTurbo(this, 281, 105, textureX, textureY); // Box 385
		bodyModel[369] = new ModelRendererTurbo(this, 577, 33, textureX, textureY); // Box 386
		bodyModel[370] = new ModelRendererTurbo(this, 1537, 41, textureX, textureY); // Box 387
		bodyModel[371] = new ModelRendererTurbo(this, 137, 433, textureX, textureY); // Box 413
		bodyModel[372] = new ModelRendererTurbo(this, 361, 441, textureX, textureY); // Box 414
		bodyModel[373] = new ModelRendererTurbo(this, 1409, 457, textureX, textureY); // Box 415
		bodyModel[374] = new ModelRendererTurbo(this, 473, 441, textureX, textureY); // Box 416
		bodyModel[375] = new ModelRendererTurbo(this, 233, 433, textureX, textureY); // Box 417
		bodyModel[376] = new ModelRendererTurbo(this, 993, 433, textureX, textureY); // Box 418
		bodyModel[377] = new ModelRendererTurbo(this, 193, 313, textureX, textureY); // Box 239
		bodyModel[378] = new ModelRendererTurbo(this, 1361, 113, textureX, textureY); // Box 240
		bodyModel[379] = new ModelRendererTurbo(this, 1753, 41, textureX, textureY); // Box 241
		bodyModel[380] = new ModelRendererTurbo(this, 1809, 41, textureX, textureY); // Box 242
		bodyModel[381] = new ModelRendererTurbo(this, 1553, 113, textureX, textureY); // Box 243
		bodyModel[382] = new ModelRendererTurbo(this, 1097, 121, textureX, textureY); // Box 244
		bodyModel[383] = new ModelRendererTurbo(this, 2033, 49, textureX, textureY); // Box 245
		bodyModel[384] = new ModelRendererTurbo(this, 1801, 121, textureX, textureY); // Box 246
		bodyModel[385] = new ModelRendererTurbo(this, 1657, 41, textureX, textureY); // Box 247
		bodyModel[386] = new ModelRendererTurbo(this, 329, 57, textureX, textureY); // Box 248
		bodyModel[387] = new ModelRendererTurbo(this, 1905, 65, textureX, textureY); // Box 250
		bodyModel[388] = new ModelRendererTurbo(this, 857, 73, textureX, textureY); // Box 251
		bodyModel[389] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 252
		bodyModel[390] = new ModelRendererTurbo(this, 257, 49, textureX, textureY); // Box 253
		bodyModel[391] = new ModelRendererTurbo(this, 1361, 57, textureX, textureY); // Box 263
		bodyModel[392] = new ModelRendererTurbo(this, 705, 1, textureX, textureY); // Box 264
		bodyModel[393] = new ModelRendererTurbo(this, 737, 41, textureX, textureY); // Box 962
		bodyModel[394] = new ModelRendererTurbo(this, 1769, 41, textureX, textureY); // Box 964
		bodyModel[395] = new ModelRendererTurbo(this, 1921, 41, textureX, textureY); // Box 966
		bodyModel[396] = new ModelRendererTurbo(this, 337, 57, textureX, textureY); // Box 782
		bodyModel[397] = new ModelRendererTurbo(this, 1953, 57, textureX, textureY); // Box 783
		bodyModel[398] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 786
		bodyModel[399] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Box 789
		bodyModel[400] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 791
		bodyModel[401] = new ModelRendererTurbo(this, 1449, 9, textureX, textureY); // Box 792
		bodyModel[402] = new ModelRendererTurbo(this, 1529, 321, textureX, textureY); // Box 444
		bodyModel[403] = new ModelRendererTurbo(this, 1729, 113, textureX, textureY); // Box 445
		bodyModel[404] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Box 446
		bodyModel[405] = new ModelRendererTurbo(this, 305, 49, textureX, textureY); // Box 447
		bodyModel[406] = new ModelRendererTurbo(this, 1481, 121, textureX, textureY); // Box 448
		bodyModel[407] = new ModelRendererTurbo(this, 1873, 121, textureX, textureY); // Box 449
		bodyModel[408] = new ModelRendererTurbo(this, 673, 65, textureX, textureY); // Box 450
		bodyModel[409] = new ModelRendererTurbo(this, 1913, 121, textureX, textureY); // Box 451
		bodyModel[410] = new ModelRendererTurbo(this, 953, 65, textureX, textureY); // Box 452
		bodyModel[411] = new ModelRendererTurbo(this, 1913, 65, textureX, textureY); // Box 453
		bodyModel[412] = new ModelRendererTurbo(this, 1961, 81, textureX, textureY); // Box 454
		bodyModel[413] = new ModelRendererTurbo(this, 473, 89, textureX, textureY); // Box 455
		bodyModel[414] = new ModelRendererTurbo(this, 385, 57, textureX, textureY); // Box 456
		bodyModel[415] = new ModelRendererTurbo(this, 1513, 57, textureX, textureY); // Box 457
		bodyModel[416] = new ModelRendererTurbo(this, 137, 73, textureX, textureY); // Box 458
		bodyModel[417] = new ModelRendererTurbo(this, 849, 17, textureX, textureY); // Box 459
		bodyModel[418] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Box 460
		bodyModel[419] = new ModelRendererTurbo(this, 969, 49, textureX, textureY); // Box 461
		bodyModel[420] = new ModelRendererTurbo(this, 1545, 49, textureX, textureY); // Box 462
		bodyModel[421] = new ModelRendererTurbo(this, 1601, 73, textureX, textureY); // Box 463
		bodyModel[422] = new ModelRendererTurbo(this, 1609, 73, textureX, textureY); // Box 464
		bodyModel[423] = new ModelRendererTurbo(this, 1753, 49, textureX, textureY); // Box 465
		bodyModel[424] = new ModelRendererTurbo(this, 1817, 49, textureX, textureY); // Box 466
		bodyModel[425] = new ModelRendererTurbo(this, 1473, 9, textureX, textureY); // Box 467
		bodyModel[426] = new ModelRendererTurbo(this, 569, 17, textureX, textureY); // Box 468
		bodyModel[427] = new ModelRendererTurbo(this, 1729, 321, textureX, textureY); // Box 469
		bodyModel[428] = new ModelRendererTurbo(this, 1745, 121, textureX, textureY); // Box 470
		bodyModel[429] = new ModelRendererTurbo(this, 1401, 57, textureX, textureY); // Box 471
		bodyModel[430] = new ModelRendererTurbo(this, 929, 73, textureX, textureY); // Box 472
		bodyModel[431] = new ModelRendererTurbo(this, 841, 129, textureX, textureY); // Box 473
		bodyModel[432] = new ModelRendererTurbo(this, 1625, 129, textureX, textureY); // Box 474
		bodyModel[433] = new ModelRendererTurbo(this, 985, 81, textureX, textureY); // Box 475
		bodyModel[434] = new ModelRendererTurbo(this, 1217, 129, textureX, textureY); // Box 476
		bodyModel[435] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Box 477
		bodyModel[436] = new ModelRendererTurbo(this, 1265, 89, textureX, textureY); // Box 478
		bodyModel[437] = new ModelRendererTurbo(this, 1385, 97, textureX, textureY); // Box 479
		bodyModel[438] = new ModelRendererTurbo(this, 25, 105, textureX, textureY); // Box 480
		bodyModel[439] = new ModelRendererTurbo(this, 1969, 73, textureX, textureY); // Box 481
		bodyModel[440] = new ModelRendererTurbo(this, 313, 81, textureX, textureY); // Box 482
		bodyModel[441] = new ModelRendererTurbo(this, 2001, 49, textureX, textureY); // Box 483
		bodyModel[442] = new ModelRendererTurbo(this, 345, 57, textureX, textureY); // Box 484
		bodyModel[443] = new ModelRendererTurbo(this, 409, 57, textureX, textureY); // Box 485
		bodyModel[444] = new ModelRendererTurbo(this, 1401, 81, textureX, textureY); // Box 486
		bodyModel[445] = new ModelRendererTurbo(this, 1409, 81, textureX, textureY); // Box 487
		bodyModel[446] = new ModelRendererTurbo(this, 193, 329, textureX, textureY); // Box 488
		bodyModel[447] = new ModelRendererTurbo(this, 1553, 129, textureX, textureY); // Box 489
		bodyModel[448] = new ModelRendererTurbo(this, 345, 81, textureX, textureY); // Box 490
		bodyModel[449] = new ModelRendererTurbo(this, 745, 81, textureX, textureY); // Box 491
		bodyModel[450] = new ModelRendererTurbo(this, 673, 137, textureX, textureY); // Box 492
		bodyModel[451] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 493
		bodyModel[452] = new ModelRendererTurbo(this, 1137, 89, textureX, textureY); // Box 494
		bodyModel[453] = new ModelRendererTurbo(this, 137, 153, textureX, textureY); // Box 495
		bodyModel[454] = new ModelRendererTurbo(this, 1273, 89, textureX, textureY); // Box 496
		bodyModel[455] = new ModelRendererTurbo(this, 233, 97, textureX, textureY); // Box 497
		bodyModel[456] = new ModelRendererTurbo(this, 113, 105, textureX, textureY); // Box 498
		bodyModel[457] = new ModelRendererTurbo(this, 1121, 105, textureX, textureY); // Box 499
		bodyModel[458] = new ModelRendererTurbo(this, 1305, 81, textureX, textureY); // Box 500
		bodyModel[459] = new ModelRendererTurbo(this, 1705, 89, textureX, textureY); // Box 501
		bodyModel[460] = new ModelRendererTurbo(this, 577, 65, textureX, textureY); // Box 502
		bodyModel[461] = new ModelRendererTurbo(this, 729, 65, textureX, textureY); // Box 503
		bodyModel[462] = new ModelRendererTurbo(this, 777, 65, textureX, textureY); // Box 504
		bodyModel[463] = new ModelRendererTurbo(this, 929, 89, textureX, textureY); // Box 505
		bodyModel[464] = new ModelRendererTurbo(this, 1153, 89, textureX, textureY); // Box 506
		bodyModel[465] = new ModelRendererTurbo(this, 1361, 153, textureX, textureY); // Box 721
		bodyModel[466] = new ModelRendererTurbo(this, 297, 137, textureX, textureY); // Box 722
		bodyModel[467] = new ModelRendererTurbo(this, 1305, 161, textureX, textureY); // Box 723
		bodyModel[468] = new ModelRendererTurbo(this, 1001, 361, textureX, textureY); // Box 724
		bodyModel[469] = new ModelRendererTurbo(this, 1969, 409, textureX, textureY); // Box 725
		bodyModel[470] = new ModelRendererTurbo(this, 1545, 161, textureX, textureY); // Box 726
		bodyModel[471] = new ModelRendererTurbo(this, 1801, 169, textureX, textureY); // Box 727
		bodyModel[472] = new ModelRendererTurbo(this, 1537, 89, textureX, textureY); // Box 728
		bodyModel[473] = new ModelRendererTurbo(this, 1049, 137, textureX, textureY); // Box 729
		bodyModel[474] = new ModelRendererTurbo(this, 1745, 89, textureX, textureY); // Box 730
		bodyModel[475] = new ModelRendererTurbo(this, 1529, 337, textureX, textureY); // Box 731
		bodyModel[476] = new ModelRendererTurbo(this, 2017, 145, textureX, textureY); // Box 732
		bodyModel[477] = new ModelRendererTurbo(this, 161, 113, textureX, textureY); // Box 519
		bodyModel[478] = new ModelRendererTurbo(this, 857, 113, textureX, textureY); // Box 520
		bodyModel[479] = new ModelRendererTurbo(this, 577, 105, textureX, textureY); // Box 521
		bodyModel[480] = new ModelRendererTurbo(this, 1433, 105, textureX, textureY); // Box 522
		bodyModel[481] = new ModelRendererTurbo(this, 673, 153, textureX, textureY); // Box 523
		bodyModel[482] = new ModelRendererTurbo(this, 1729, 337, textureX, textureY); // Box 524
		bodyModel[483] = new ModelRendererTurbo(this, 161, 97, textureX, textureY); // Box 525
		bodyModel[484] = new ModelRendererTurbo(this, 185, 97, textureX, textureY); // Box 526
		bodyModel[485] = new ModelRendererTurbo(this, 1937, 169, textureX, textureY); // Box 527
		bodyModel[486] = new ModelRendererTurbo(this, 1065, 113, textureX, textureY); // Box 528
		bodyModel[487] = new ModelRendererTurbo(this, 1577, 113, textureX, textureY); // Box 529
		bodyModel[488] = new ModelRendererTurbo(this, 569, 177, textureX, textureY); // Box 530
		bodyModel[489] = new ModelRendererTurbo(this, 1097, 65, textureX, textureY); // Box 531
		bodyModel[490] = new ModelRendererTurbo(this, 1921, 65, textureX, textureY); // Box 532
		bodyModel[491] = new ModelRendererTurbo(this, 1457, 73, textureX, textureY); // Box 533
		bodyModel[492] = new ModelRendererTurbo(this, 2033, 121, textureX, textureY); // Box 534
		bodyModel[493] = new ModelRendererTurbo(this, 1601, 97, textureX, textureY); // Box 535
		bodyModel[494] = new ModelRendererTurbo(this, 985, 105, textureX, textureY); // Box 536
		bodyModel[495] = new ModelRendererTurbo(this, 1001, 169, textureX, textureY); // Box 537

		bodyModel[0].addShapeBox(0F, 0F, 0F, 135, 22, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-47F, -41F, -25F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 28, 22, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[1].setRotationPoint(-75F, -41F, -25F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 28, 8, 8, 0F,0F, 0F, -7F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F); // Box 6
		bodyModel[2].setRotationPoint(-75F, -49F, -25F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 47, 22, 5, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 7
		bodyModel[3].setRotationPoint(-122F, -41F, -25F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 19, 9, 21, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[4].setRotationPoint(-141F, -28F, -21F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 19, 13, 21, 0F,0F, -2F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[5].setRotationPoint(-141F, -41F, -21F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 18, 9, 6, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 10
		bodyModel[6].setRotationPoint(-159F, -28F, -18F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 47, 14, 25, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -12F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 11
		bodyModel[7].setRotationPoint(-122F, -19F, -25F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 19, 13, 21, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -11F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 12
		bodyModel[8].setRotationPoint(-141F, -19F, -21F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 18, 12, 14, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -8F, 0F, -2F, -13F, 0F, 0F, -8F, 0F, -1F, -6F, 0F, -3F, -1F); // Box 13
		bodyModel[9].setRotationPoint(-159F, -19F, -18F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 28, 14, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[10].setRotationPoint(-75F, -19F, -25F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 135, 14, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[11].setRotationPoint(-47F, -19F, -25F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 135, 8, 25, 0F,0F, 0F, -6F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[12].setRotationPoint(-47F, -49F, -25F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 50, 14, 25, 0F,0F, 0F, 0F, 0F, 2F, -4F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -7F, -12F, 0F, -7F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[13].setRotationPoint(88F, -19F, -25F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 50, 22, 5, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[14].setRotationPoint(88F, -41F, -25F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 28, 6, 7, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, -7F, 0F, 0F, -7F); // Box 19
		bodyModel[15].setRotationPoint(-75F, -55F, -17F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 135, 6, 17, 0F,0F, 0F, -6F, 0F, 2F, -6F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[16].setRotationPoint(-47F, -55F, -17F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 50, 8, 9, 0F,0F, 0F, -5F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 21
		bodyModel[17].setRotationPoint(88F, -49F, -25F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 44, 20, 4, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, 0F, -3F); // Box 22
		bodyModel[18].setRotationPoint(138F, -41F, -21F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 37, 17, 18, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[19].setRotationPoint(182F, -41F, -18F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 44, 8, 8, 0F,0F, 0F, -4F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -7F); // Box 24
		bodyModel[20].setRotationPoint(138F, -49F, -21F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 37, 7, 18, 0F,0F, 1F, -4F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[21].setRotationPoint(182F, -48F, -18F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 19, 3, 21, 0F,0F, -2F, -11F, -6F, 0F, -6F, -6F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 26
		bodyModel[22].setRotationPoint(-141F, -44F, -21F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 35, 8, 8, 0F,0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, -7F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -7F, 0F); // Box 27
		bodyModel[23].setRotationPoint(-110F, -49F, -25F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 35, 6, 8, 0F,0F, 0F, -7F, 0F, 0F, -7F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F); // Box 28
		bodyModel[24].setRotationPoint(-110F, -55F, -18F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 29
		bodyModel[25].setRotationPoint(-118F, -49F, -18F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, -5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 1F, 0F, 5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 1F); // Box 30
		bodyModel[26].setRotationPoint(-128F, -49F, -16F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 31
		bodyModel[27].setRotationPoint(-118F, -49F, -16F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 32
		bodyModel[28].setRotationPoint(-110F, -48F, -18F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 33
		bodyModel[29].setRotationPoint(-99F, -46F, -19F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 3.5F, 0F, 0F, 3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F); // Box 34
		bodyModel[30].setRotationPoint(-90F, -44F, -20F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[31].setRotationPoint(-110F, -55F, -11F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 6, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[32].setRotationPoint(-103F, -55F, -11F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[33].setRotationPoint(-90F, -55F, -11F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[34].setRotationPoint(-83F, -55F, -11F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 21, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[35].setRotationPoint(-110F, -55F, -3F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[36].setRotationPoint(-76F, -55F, -11F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 14, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[37].setRotationPoint(-89F, -55F, -2F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 42
		bodyModel[38].setRotationPoint(-118F, -55F, -3F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[39].setRotationPoint(-125F, -49F, -3F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F,0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[40].setRotationPoint(-125F, -49F, -3F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,-7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[41].setRotationPoint(-125F, -49F, -16F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[42].setRotationPoint(-118F, -53F, -8F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[43].setRotationPoint(-118F, -53F, -16F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F); // Box 48
		bodyModel[44].setRotationPoint(-125F, -49F, -3F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 44, 9, 21, 0F,0F, 0F, 0F, 0F, 3F, -3F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -4F, -11F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[45].setRotationPoint(138F, -21F, -21F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 37, 8, 18, 0F,0F, 0F, 0F, 0F, 3F, -2F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -4F, -10F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[46].setRotationPoint(182F, -24F, -18F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 42, 14, 16, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -5F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[47].setRotationPoint(219F, -41F, -16F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 13, 9, 9, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, -3F); // Box 52
		bodyModel[48].setRotationPoint(261F, -41F, -11F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 13, 7, 9, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[49].setRotationPoint(274F, -41F, -9F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 42, 7, 16, 0F,0F, 0F, 0F, 0F, 5F, -5F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -6F, -11F, 0F, -6F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[50].setRotationPoint(219F, -27F, -16F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 13, 6, 11, 0F,0F, 0F, 0F, 0F, 2F, -2F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -3F, -7F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[51].setRotationPoint(261F, -32F, -11F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 13, 5, 9, 0F,0F, 0F, 0F, 0F, 2F, -4F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -2F, -4F, -6F, -2F, -4F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[52].setRotationPoint(274F, -34F, -9F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 50, 8, 11, 0F,0F, 0F, -9F, 0F, -1F, -10F, 0F, -2F, -1F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -7F, 0F, 0F, -7F); // Box 57
		bodyModel[53].setRotationPoint(88F, -57F, -20F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 44, 7, 10, 0F,0F, 0F, -6F, 0F, -2F, -9F, 0F, -3F, -1F, 0F, -1F, -4F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -7F, 0F, 0F, -10F); // Box 58
		bodyModel[54].setRotationPoint(138F, -56F, -16F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 42, 7, 16, 0F,0F, 0F, -5F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[55].setRotationPoint(219F, -48F, -16F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 13, 7, 9, 0F,0F, 0F, -5F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 60
		bodyModel[56].setRotationPoint(261F, -48F, -11F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 13, 7, 9, 0F,0F, 0F, -6F, -6F, -3F, -8F, -6F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[57].setRotationPoint(274F, -48F, -9F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 37, 5, 13, 0F,0F, 0F, -6F, 0F, -1F, -8F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, -2F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[58].setRotationPoint(182F, -54F, -13F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 42, 5, 11, 0F,0F, 0F, -6F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[59].setRotationPoint(219F, -53F, -11F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 41, 11, 164, 0F,0F, 0F, 0F, 0F, 0F, 0F, 5F, -10F, 0F, 14F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 16F, 0F, 14F, 16F, 0F); // Box 64
		bodyModel[60].setRotationPoint(-4F, -46F, -189F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 10, 11, 164, 0F,0F, -4F, 0F, 0F, 0F, 0F, -14F, -10F, 0F, 19F, -16F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -14F, 16F, 0F, 19F, 10F, 0F); // Box 65
		bodyModel[61].setRotationPoint(-14F, -46F, -189F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 13, 11, 164, 0F,0F, 0F, 0F, 0F, -5F, 0F, 20F, -18F, 0F, -5F, -10F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 20F, 8F, 0F, -5F, 16F, 0F); // Box 66
		bodyModel[62].setRotationPoint(37F, -46F, -189F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 18, 11, 11, 0F,0F, -3F, -10F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -3F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -5F); // Box 69
		bodyModel[63].setRotationPoint(-159F, -39F, -18F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 18, 3, 10, 0F,0F, -3F, -9F, 0F, 0F, -3F, 0F, -1F, -7F, 0F, -4F, -1F, 0F, 3F, -5F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 3F, -4F); // Box 70
		bodyModel[64].setRotationPoint(-159F, -42F, -13F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 33, 16, 34, 0F,0F, 0F, -4F, 0F, -7F, -7F, 0F, -7F, -7F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -5F, -1F, 0F, -5F, -1F, 0F, 0F, 0F); // Box 373
		bodyModel[65].setRotationPoint(0F, -48F, -166F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 33, 3, 26, 0F,0F, 0F, -3F, 0F, -8F, -8F, 0F, -8F, -8F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 7F, -3F, 0F, 7F, -3F, 0F, 0F, 0F); // Box 374
		bodyModel[66].setRotationPoint(0F, -51F, -162F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 33, 3, 16, 0F,0F, 0F, -4F, 0F, -11F, -3F, 0F, -11F, -3F, 0F, 0F, -4F, 0F, 0F, 2F, 0F, 8F, -3F, 0F, 8F, -3F, 0F, 0F, 2F); // Box 375
		bodyModel[67].setRotationPoint(0F, -54F, -157F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 20, 3, 20, 0F,0F, 0F, -6F, 0F, -2F, -6F, 0F, -2F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 376
		bodyModel[68].setRotationPoint(-20F, -56F, -159F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 20, 5, 30, 0F,0F, 0F, -5F, 0F, -2F, -5F, 0F, -2F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 377
		bodyModel[69].setRotationPoint(-20F, -53F, -164F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 17, 5, 30, 0F,0F, 0F, -4F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 378
		bodyModel[70].setRotationPoint(-37F, -53F, -164F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 17, 4, 22, 0F,0F, 0F, -7F, 0F, -1F, -7F, 0F, -1F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 379
		bodyModel[71].setRotationPoint(-37F, -57F, -160F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 18, 4, 22, 0F,0F, -2F, -8F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -2F, -8F, 0F, 2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1F); // Box 380
		bodyModel[72].setRotationPoint(-55F, -57F, -160F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 18, 5, 30, 0F,0F, -2F, -5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, -5F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F); // Box 381
		bodyModel[73].setRotationPoint(-55F, -53F, -164F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 6, 4, 20, 0F,0F, -3F, -8F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -3F, -8F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F); // Box 382
		bodyModel[74].setRotationPoint(-61F, -55F, -159F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 6, 5, 6, 0F,0F, -1F, -5F, 0F, 0F, -3F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -4F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F); // Box 383
		bodyModel[75].setRotationPoint(-61F, -51F, -162F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 6, 13, 4, 0F,0F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, -1F, 1.5F, 0F, 0F, -3F, 0F, 0F, 2F, 0F, 0F, 1.5F, 0F, 0F, 1.5F); // Box 384
		bodyModel[76].setRotationPoint(-61F, -47F, -162F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 18, 14, 34, 0F,0F, -1F, -4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 385
		bodyModel[77].setRotationPoint(-55F, -48F, -166F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 17, 16, 34, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 386
		bodyModel[78].setRotationPoint(-37F, -48F, -166F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 20, 16, 34, 0F,0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 387
		bodyModel[79].setRotationPoint(-20F, -48F, -166F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 33, 3, 34, 0F,0F, 0F, 0F, 0F, 5F, -1F, 0F, 5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -1F, 0F, -6F, -1F, 0F, 0F, 0F); // Box 388
		bodyModel[80].setRotationPoint(0F, -32F, -166F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 33, 11, 34, 0F,0F, 0F, 0F, 0F, 6F, -1F, 0F, 6F, -1F, 0F, 0F, 0F, 0F, 0F, -10F, 9F, -16F, -11F, 9F, -15F, -11F, 0F, 0F, -10F); // Box 389
		bodyModel[81].setRotationPoint(0F, -29F, -166F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 20, 3, 34, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 390
		bodyModel[82].setRotationPoint(-20F, -32F, -166F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 20, 11, 34, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F); // Box 391
		bodyModel[83].setRotationPoint(-20F, -29F, -166F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 17, 3, 34, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 392
		bodyModel[84].setRotationPoint(-37F, -32F, -166F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 17, 11, 34, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -9F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -9F); // Box 393
		bodyModel[85].setRotationPoint(-37F, -29F, -166F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 18, 6, 34, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F); // Box 394
		bodyModel[86].setRotationPoint(-55F, -34F, -166F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 18, 10, 34, 0F,0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, -2F, -10F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, -2F, -10F); // Box 395
		bodyModel[87].setRotationPoint(-55F, -28F, -166F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 6, 5, 26, 0F,0F, 0F, -3F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -3F, 0F, -1F, -4F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -1F, -4F); // Box 396
		bodyModel[88].setRotationPoint(-61F, -34F, -162F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 6, 9, 12, 0F,0F, 1F, -6F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 1F, -3F, 0F, -3F, -10F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 397
		bodyModel[89].setRotationPoint(-61F, -29F, -164F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 6, 5, 14, 0F,0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F); // Box 398
		bodyModel[90].setRotationPoint(-61F, -25F, -156F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 6, 9, 12, 0F,0F, 1F, -3F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 1F, -6F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -3F, -10F); // Box 399
		bodyModel[91].setRotationPoint(-61F, -29F, -146F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 6, 5, 5, 0F,0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 400
		bodyModel[92].setRotationPoint(-61F, -39F, -146.5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 6, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 401
		bodyModel[93].setRotationPoint(-61F, -39F, -156.5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 6, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F); // Box 402
		bodyModel[94].setRotationPoint(-61F, -49F, -156.5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 6, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 403
		bodyModel[95].setRotationPoint(-61F, -50F, -156.5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 6, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 404
		bodyModel[96].setRotationPoint(-61F, -49F, -146.5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 6, 5, 6, 0F,0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3F, 0F, -1F, -5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, -4F); // Box 405
		bodyModel[97].setRotationPoint(-61F, -51F, -142F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 6, 13, 4, 0F,0F, -1F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, -1F, -4F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 2F, 0F, 0F, -3F); // Box 406
		bodyModel[98].setRotationPoint(-61F, -47F, -140F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 15, 5, 12, 0F,0F, -5F, -5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -5F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 483
		bodyModel[99].setRotationPoint(-70F, -47.5F, -154.5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 15, 2, 12, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 484
		bodyModel[100].setRotationPoint(-70F, -42.5F, -154.5F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 15, 5, 12, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -5F, -5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -5F, -5F); // Box 485
		bodyModel[101].setRotationPoint(-70F, -40.5F, -154.5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 17, 16, 34, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 316
		bodyModel[102].setRotationPoint(-42F, -43F, -83F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 20, 16, 34, 0F,0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 332
		bodyModel[103].setRotationPoint(-25F, -43F, -83F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 20, 3, 34, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 333
		bodyModel[104].setRotationPoint(-25F, -27F, -83F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 17, 3, 34, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 334
		bodyModel[105].setRotationPoint(-42F, -27F, -83F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 17, 11, 34, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -9F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -9F); // Box 335
		bodyModel[106].setRotationPoint(-42F, -24F, -83F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 20, 11, 34, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F); // Box 336
		bodyModel[107].setRotationPoint(-25F, -24F, -83F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 53, 11, 34, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, -3F, -11F, 0F, -3F, -11F, 0F, 0F, -10F); // Box 337
		bodyModel[108].setRotationPoint(-5F, -24F, -83F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 53, 3, 34, 0F,0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F); // Box 338
		bodyModel[109].setRotationPoint(-5F, -27F, -83F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 53, 16, 34, 0F,0F, 0F, -4F, 0F, -7F, -7F, 0F, -7F, -7F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, 0F, 0F); // Box 339
		bodyModel[110].setRotationPoint(-5F, -43F, -83F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 17, 5, 30, 0F,0F, 0F, -4F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 340
		bodyModel[111].setRotationPoint(-42F, -48F, -81F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 18, 14, 34, 0F,0F, -1F, -4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 341
		bodyModel[112].setRotationPoint(-60F, -43F, -83F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 18, 6, 34, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F); // Box 342
		bodyModel[113].setRotationPoint(-60F, -29F, -83F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 18, 10, 34, 0F,0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, -2F, -10F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, -2F, -10F); // Box 343
		bodyModel[114].setRotationPoint(-60F, -23F, -83F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 18, 5, 30, 0F,0F, -2F, -5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, -5F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F); // Box 344
		bodyModel[115].setRotationPoint(-60F, -48F, -81F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 20, 5, 30, 0F,0F, 0F, -5F, 0F, -2F, -5F, 0F, -2F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 345
		bodyModel[116].setRotationPoint(-25F, -48F, -81F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 53, 3, 26, 0F,0F, 0F, -3F, 0F, -8F, -8F, 0F, -8F, -8F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 7F, -3F, 0F, 7F, -3F, 0F, 0F, 0F); // Box 346
		bodyModel[117].setRotationPoint(-5F, -46F, -79F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 20, 11, 32, 0F,0F, 0F, -6F, 0F, -4F, -9F, 0F, -4F, -9F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, 0F, 0F); // Box 347
		bodyModel[118].setRotationPoint(48F, -36F, -82F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 21, 7, 24, 0F,0F, 0F, -5F, 0F, -7F, -12F, 0F, -7F, -12F, 0F, 0F, -5F, 0F, -1F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, -1F, 0F); // Box 348
		bodyModel[119].setRotationPoint(68F, -32F, -78F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 20, 9, 32, 0F,0F, 0F, 0F, 0F, 1F, -4F, 0F, 1F, -4F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, -4F, -12F, 0F, -4F, -12F, 0F, 0F, -10F); // Box 349
		bodyModel[120].setRotationPoint(48F, -25F, -82F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 21, 6, 24, 0F,0F, 0F, 0F, 0F, -1F, -12F, 0F, -1F, -12F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -5F, -12F, 0F, -5F, -12F, 0F, 0F, -8F); // Box 350
		bodyModel[121].setRotationPoint(68F, -26F, -78F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 20, 2, 20, 0F,0F, 0F, -5F, 0F, -5F, -8F, 0F, -5F, -8F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 4F, -3F, 0F, 4F, -3F, 0F, 0F, 0F); // Box 351
		bodyModel[122].setRotationPoint(48F, -38F, -76F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 21, 1, 14, 0F,0F, 0F, -5F, 0F, -8F, -7F, 0F, -8F, -7F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 7F, -7F, 0F, 7F, -7F, 0F, 0F, 0F); // Box 352
		bodyModel[123].setRotationPoint(68F, -33F, -73F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 53, 3, 16, 0F,0F, 0F, -4F, 0F, -11F, -3F, 0F, -11F, -3F, 0F, 0F, -4F, 0F, 0F, 2F, 0F, 8F, -3F, 0F, 8F, -3F, 0F, 0F, 2F); // Box 353
		bodyModel[124].setRotationPoint(-5F, -49F, -74F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 20, 3, 20, 0F,0F, 0F, -6F, 0F, -2F, -6F, 0F, -2F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 354
		bodyModel[125].setRotationPoint(-25F, -51F, -76F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 17, 4, 22, 0F,0F, 0F, -7F, 0F, -1F, -7F, 0F, -1F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 355
		bodyModel[126].setRotationPoint(-42F, -52F, -77F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 18, 4, 22, 0F,0F, -2F, -8F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -2F, -8F, 0F, 2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1F); // Box 356
		bodyModel[127].setRotationPoint(-60F, -52F, -77F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 6, 4, 20, 0F,0F, -3F, -8F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -3F, -8F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F); // Box 134
		bodyModel[128].setRotationPoint(-66F, -50F, -76F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 6, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[129].setRotationPoint(-66F, -45F, -73.5F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 6, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F); // Box 136
		bodyModel[130].setRotationPoint(-66F, -44F, -73.5F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 6, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
		bodyModel[131].setRotationPoint(-66F, -44F, -63.5F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 6, 5, 6, 0F,0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3F, 0F, -1F, -5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, -4F); // Box 138
		bodyModel[132].setRotationPoint(-66F, -46F, -59F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 6, 13, 4, 0F,0F, -1F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, -1F, -4F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 2F, 0F, 0F, -3F); // Box 139
		bodyModel[133].setRotationPoint(-66F, -42F, -57F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 6, 13, 4, 0F,0F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, -1F, 1.5F, 0F, 0F, -3F, 0F, 0F, 2F, 0F, 0F, 1.5F, 0F, 0F, 1.5F); // Box 140
		bodyModel[134].setRotationPoint(-66F, -42F, -79F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 6, 5, 6, 0F,0F, -1F, -5F, 0F, 0F, -3F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -4F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F); // Box 141
		bodyModel[135].setRotationPoint(-66F, -46F, -79F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 6, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		bodyModel[136].setRotationPoint(-66F, -34F, -73.5F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 6, 5, 5, 0F,0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[137].setRotationPoint(-66F, -34F, -63.5F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 6, 5, 26, 0F,0F, 0F, -3F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -3F, 0F, -1F, -4F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -1F, -4F); // Box 144
		bodyModel[138].setRotationPoint(-66F, -29F, -79F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 6, 9, 12, 0F,0F, 1F, -3F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 1F, -6F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -3F, -10F); // Box 145
		bodyModel[139].setRotationPoint(-66F, -24F, -63F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 6, 5, 14, 0F,0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F); // Box 146
		bodyModel[140].setRotationPoint(-66F, -20F, -73F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 6, 9, 12, 0F,0F, 1F, -6F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 1F, -3F, 0F, -3F, -10F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 147
		bodyModel[141].setRotationPoint(-66F, -24F, -81F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 15, 5, 12, 0F,0F, -5F, -5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -5F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 148
		bodyModel[142].setRotationPoint(-75F, -42.5F, -71.5F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 15, 2, 12, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 149
		bodyModel[143].setRotationPoint(-75F, -37.5F, -71.5F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 15, 5, 12, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -5F, -5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -5F, -5F); // Box 150
		bodyModel[144].setRotationPoint(-75F, -35.5F, -71.5F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 42, 8, 3, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F); // Box 109
		bodyModel[145].setRotationPoint(192F, -61F, -3F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 40, 55, 3, 0F,-27F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -24F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F); // Box 110
		bodyModel[146].setRotationPoint(194F, -116F, -3F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 14, 10, 3, 0F,-7F, -3F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, -4F, -3F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 111
		bodyModel[147].setRotationPoint(220F, -126F, -3F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 11, 5, 106, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 17F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 17F, 0F, 0F); // Box 102
		bodyModel[148].setRotationPoint(239F, -47F, -113F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 6, 5, 106, 0F,-2F, -2F, 0F, 0F, 0F, 0F, -17F, 0F, 0F, 17F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, -17F, 0F, 0F, 17F, -2F, 0F); // Box 103
		bodyModel[149].setRotationPoint(233F, -47F, -113F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 12, 5, 8, 0F,0F, -2F, 0F, -5F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -5F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[150].setRotationPoint(250F, -47F, -121F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 10, 5, 8, 0F,-5F, -2F, -2F, 0F, -2F, 0F, -6F, 0F, 0F, 0F, -2F, 0F, -5F, -2F, -2F, 0F, -2F, 0F, -6F, 0F, 0F, 0F, -2F, 0F); // Box 106
		bodyModel[151].setRotationPoint(235F, -47F, -121F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 10, 5, 8, 0F,-5F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -5F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 107
		bodyModel[152].setRotationPoint(240F, -47F, -121F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 18, 1, 10, 0F,0F, -3F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 163
		bodyModel[153].setRotationPoint(-159F, -42F, -10F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 18, 1, 10, 0F,0F, 2F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 164
		bodyModel[154].setRotationPoint(-159F, -8F, -10F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		bodyModel[155].setRotationPoint(261F, -53F, -3F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[156].setRotationPoint(269F, -53F, -3F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 167
		bodyModel[157].setRotationPoint(265F, -53F, -3F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[158].setRotationPoint(265F, -53F, -3F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		bodyModel[159].setRotationPoint(268F, -53F, -3F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 50, 1, 11, 0F,0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 170
		bodyModel[160].setRotationPoint(88F, -57F, -11F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 44, 1, 10, 0F,0F, 0F, 0F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -3F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 171
		bodyModel[161].setRotationPoint(138F, -56F, -10F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 172
		bodyModel[162].setRotationPoint(-165F, -28F, -13F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 173
		bodyModel[163].setRotationPoint(-165F, -39F, -4F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 174
		bodyModel[164].setRotationPoint(-165F, -10F, -4F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 175
		bodyModel[165].setRotationPoint(-165F, -20F, -13F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		bodyModel[166].setRotationPoint(-165F, -35F, -11F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 177
		bodyModel[167].setRotationPoint(-165F, -35F, -7F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		bodyModel[168].setRotationPoint(-165F, -28F, -11F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, 7F); // Box 179
		bodyModel[169].setRotationPoint(-165F, -19F, -11F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[170].setRotationPoint(-171F, -28F, -6F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		bodyModel[171].setRotationPoint(-171F, -28F, -11F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182
		bodyModel[172].setRotationPoint(-171F, -20F, -6F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		bodyModel[173].setRotationPoint(-171F, -20F, -11F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
		bodyModel[174].setRotationPoint(-171F, -28F, -6F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -2F, 6F, 0F, -2F, 6F, 0F, 2F, -6F, 0F, 2F); // Box 185
		bodyModel[175].setRotationPoint(-171F, -19F, -6F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		bodyModel[176].setRotationPoint(-171F, -24F, -6F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		bodyModel[177].setRotationPoint(-171F, -24F, -1F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[178].setRotationPoint(-171F, -24F, -11F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 189
		bodyModel[179].setRotationPoint(-165F, -24F, -13F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 6, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 190
		bodyModel[180].setRotationPoint(-53F, -55F, -11F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 7, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F); // Box 191
		bodyModel[181].setRotationPoint(-75F, -55F, -11F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 7, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F); // Box 192
		bodyModel[182].setRotationPoint(-60F, -55F, -11F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 135, 22, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[183].setRotationPoint(-47F, -41F, 0F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 28, 22, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[184].setRotationPoint(-75F, -41F, 24F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 28, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		bodyModel[185].setRotationPoint(-75F, -49F, 17F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 47, 22, 5, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 196
		bodyModel[186].setRotationPoint(-122F, -41F, 20F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 19, 9, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 197
		bodyModel[187].setRotationPoint(-141F, -28F, 0F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 19, 13, 21, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 198
		bodyModel[188].setRotationPoint(-141F, -41F, 0F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 18, 9, 6, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 199
		bodyModel[189].setRotationPoint(-159F, -28F, 12F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 47, 14, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -1F, -12F); // Box 200
		bodyModel[190].setRotationPoint(-122F, -19F, 0F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 19, 13, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -1F, -11F); // Box 201
		bodyModel[191].setRotationPoint(-141F, -19F, 0F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 18, 12, 14, 0F,0F, 0F, -8F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -3F, -1F, 0F, -1F, -6F, 0F, 0F, -8F, 0F, -2F, -13F); // Box 202
		bodyModel[192].setRotationPoint(-159F, -19F, 4F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 28, 14, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F); // Box 203
		bodyModel[193].setRotationPoint(-75F, -19F, 0F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 135, 14, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F); // Box 204
		bodyModel[194].setRotationPoint(-47F, -19F, 0F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 135, 8, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		bodyModel[195].setRotationPoint(-47F, -49F, 0F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 50, 14, 25, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, -12F, 0F, 0F, -8F); // Box 206
		bodyModel[196].setRotationPoint(88F, -19F, 0F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 50, 22, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -4F, 0F, 0F, 0F); // Box 207
		bodyModel[197].setRotationPoint(88F, -41F, 20F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 28, 6, 7, 0F,0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 2F, 0F, 0F, 1F); // Box 208
		bodyModel[198].setRotationPoint(-75F, -55F, 10F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 135, 6, 17, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 2F); // Box 209
		bodyModel[199].setRotationPoint(-47F, -55F, 0F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 50, 8, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 210
		bodyModel[200].setRotationPoint(88F, -49F, 16F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 44, 20, 4, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, 0F, 0F, -3F, -3F, 0F, 0F, 0F); // Box 211
		bodyModel[201].setRotationPoint(138F, -41F, 17F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 37, 17, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -2F, 0F, 0F, 0F); // Box 212
		bodyModel[202].setRotationPoint(182F, -41F, 0F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 44, 8, 8, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -4F, 0F, 0F, -7F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 213
		bodyModel[203].setRotationPoint(138F, -49F, 13F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 37, 7, 18, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 214
		bodyModel[204].setRotationPoint(182F, -48F, 0F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 19, 3, 21, 0F,0F, -2F, 0F, -6F, 0F, 0F, -6F, 0F, -6F, 0F, -2F, -11F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -8F); // Box 215
		bodyModel[205].setRotationPoint(-141F, -44F, 0F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 35, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -7F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, -7F, -7F); // Box 216
		bodyModel[206].setRotationPoint(-110F, -49F, 17F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 35, 6, 8, 0F,0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		bodyModel[207].setRotationPoint(-110F, -55F, 10F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 218
		bodyModel[208].setRotationPoint(-118F, -49F, 17F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, -5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -1F, 0F, 5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, -1F); // Box 219
		bodyModel[209].setRotationPoint(-128F, -49F, 15F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 5F); // Box 220
		bodyModel[210].setRotationPoint(-118F, -49F, 15F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F); // Box 221
		bodyModel[211].setRotationPoint(-110F, -48F, 17F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F); // Box 222
		bodyModel[212].setRotationPoint(-99F, -46F, 18F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 3.5F, 0F, 0F, 3.5F); // Box 223
		bodyModel[213].setRotationPoint(-90F, -44F, 19F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[214].setRotationPoint(-110F, -55F, 3F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 6, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		bodyModel[215].setRotationPoint(-103F, -55F, 3F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
		bodyModel[216].setRotationPoint(-90F, -55F, 3F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 227
		bodyModel[217].setRotationPoint(-83F, -55F, 2F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 21, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 228
		bodyModel[218].setRotationPoint(-110F, -55F, 0F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 229
		bodyModel[219].setRotationPoint(-76F, -55F, 2F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 14, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 230
		bodyModel[220].setRotationPoint(-89F, -55F, 0F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 231
		bodyModel[221].setRotationPoint(-118F, -55F, 0F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		bodyModel[222].setRotationPoint(-125F, -49F, 0F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F,0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 233
		bodyModel[223].setRotationPoint(-125F, -49F, 0F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F); // Box 234
		bodyModel[224].setRotationPoint(-125F, -49F, 3F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		bodyModel[225].setRotationPoint(-118F, -53F, 0F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F); // Box 236
		bodyModel[226].setRotationPoint(-118F, -53F, 8F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F); // Box 237
		bodyModel[227].setRotationPoint(-125F, -49F, 2F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 44, 9, 21, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, -11F, 0F, 0F, -8F); // Box 238
		bodyModel[228].setRotationPoint(138F, -21F, 0F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 37, 8, 18, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, -10F, 0F, 0F, -8F); // Box 239
		bodyModel[229].setRotationPoint(182F, -24F, 0F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 42, 14, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, -5F, 0F, 0F, 0F); // Box 240
		bodyModel[230].setRotationPoint(219F, -41F, 0F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 13, 9, 9, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, 0F, 0F); // Box 241
		bodyModel[231].setRotationPoint(261F, -41F, 2F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 13, 7, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -4F, 0F, 0F, 0F); // Box 242
		bodyModel[232].setRotationPoint(274F, -41F, 0F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 42, 7, 16, 0F,0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, -11F, 0F, 0F, -8F); // Box 243
		bodyModel[233].setRotationPoint(219F, -27F, 0F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 13, 6, 11, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -7F, 0F, 0F, -6F); // Box 244
		bodyModel[234].setRotationPoint(261F, -32F, 0F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 13, 5, 9, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, -2F, -4F, -6F, 0F, 0F, -5F); // Box 245
		bodyModel[235].setRotationPoint(274F, -34F, 0F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 50, 8, 11, 0F,0F, -1F, -2F, 0F, -2F, -1F, 0F, -1F, -10F, 0F, 0F, -9F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 246
		bodyModel[236].setRotationPoint(88F, -57F, 9F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 44, 7, 10, 0F,0F, -1F, -4F, 0F, -3F, -1F, 0F, -2F, -9F, 0F, 0F, -6F, 0F, 0F, -10F, 0F, 0F, -7F, 0F, 0F, -2F, 0F, 0F, 1F); // Box 247
		bodyModel[237].setRotationPoint(138F, -56F, 6F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 42, 7, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 248
		bodyModel[238].setRotationPoint(219F, -48F, 0F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 13, 7, 9, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 249
		bodyModel[239].setRotationPoint(261F, -48F, 2F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 13, 7, 9, 0F,0F, 0F, 0F, -6F, -3F, 0F, -6F, -3F, -8F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 250
		bodyModel[240].setRotationPoint(274F, -48F, 0F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 37, 5, 13, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -8F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -2F, 0F, 0F, 1F); // Box 251
		bodyModel[241].setRotationPoint(182F, -54F, 0F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 42, 5, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 252
		bodyModel[242].setRotationPoint(219F, -53F, 0F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 41, 11, 164, 0F,14F, -10F, 0F, 5F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 14F, 16F, 0F, 5F, 16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 253
		bodyModel[243].setRotationPoint(-4F, -46F, 25F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 10, 11, 164, 0F,19F, -16F, 0F, -14F, -10F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 19F, 10F, 0F, -14F, 16F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 254
		bodyModel[244].setRotationPoint(-14F, -46F, 25F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 13, 11, 164, 0F,-5F, -10F, 0F, 20F, -18F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -5F, 16F, 0F, 20F, 8F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 255
		bodyModel[245].setRotationPoint(37F, -46F, 25F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 18, 11, 11, 0F,0F, -3F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -3F, -10F, 0F, 0F, -5F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 262
		bodyModel[246].setRotationPoint(-159F, -39F, 7F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 18, 3, 10, 0F,0F, -4F, -1F, 0F, -1F, -7F, 0F, 0F, -3F, 0F, -3F, -9F, 0F, 3F, -4F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 3F, -5F); // Box 263
		bodyModel[247].setRotationPoint(-159F, -42F, 3F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 33, 16, 34, 0F,0F, 0F, -4F, 0F, -7F, -7F, 0F, -7F, -7F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -5F, -1F, 0F, -5F, -1F, 0F, 0F, 0F); // Box 264
		bodyModel[248].setRotationPoint(0F, -48F, 132F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 33, 3, 26, 0F,0F, 0F, -3F, 0F, -8F, -8F, 0F, -8F, -8F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 7F, -3F, 0F, 7F, -3F, 0F, 0F, 0F); // Box 265
		bodyModel[249].setRotationPoint(0F, -51F, 136F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 33, 3, 16, 0F,0F, 0F, -4F, 0F, -11F, -3F, 0F, -11F, -3F, 0F, 0F, -4F, 0F, 0F, 2F, 0F, 8F, -3F, 0F, 8F, -3F, 0F, 0F, 2F); // Box 266
		bodyModel[250].setRotationPoint(0F, -54F, 141F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 20, 3, 20, 0F,0F, 0F, -6F, 0F, -2F, -6F, 0F, -2F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 267
		bodyModel[251].setRotationPoint(-20F, -56F, 139F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 20, 5, 30, 0F,0F, 0F, -5F, 0F, -2F, -5F, 0F, -2F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 268
		bodyModel[252].setRotationPoint(-20F, -53F, 134F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 17, 5, 30, 0F,0F, 0F, -4F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 269
		bodyModel[253].setRotationPoint(-37F, -53F, 134F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 17, 4, 22, 0F,0F, 0F, -7F, 0F, -1F, -7F, 0F, -1F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 270
		bodyModel[254].setRotationPoint(-37F, -57F, 138F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 18, 4, 22, 0F,0F, -2F, -8F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -2F, -8F, 0F, 2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1F); // Box 271
		bodyModel[255].setRotationPoint(-55F, -57F, 138F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 18, 5, 30, 0F,0F, -2F, -5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, -5F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F); // Box 272
		bodyModel[256].setRotationPoint(-55F, -53F, 134F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 6, 4, 20, 0F,0F, -3F, -8F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -3F, -8F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F); // Box 273
		bodyModel[257].setRotationPoint(-61F, -55F, 139F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 6, 5, 6, 0F,0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3F, 0F, -1F, -5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, -4F); // Box 274
		bodyModel[258].setRotationPoint(-61F, -51F, 156F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 6, 13, 4, 0F,0F, -1F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, -1F, -4F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 2F, 0F, 0F, -3F); // Box 275
		bodyModel[259].setRotationPoint(-61F, -47F, 158F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 18, 14, 34, 0F,0F, -1F, -4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 276
		bodyModel[260].setRotationPoint(-55F, -48F, 132F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 17, 16, 34, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 277
		bodyModel[261].setRotationPoint(-37F, -48F, 132F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 20, 16, 34, 0F,0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
		bodyModel[262].setRotationPoint(-20F, -48F, 132F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 33, 3, 34, 0F,0F, 0F, 0F, 0F, 5F, -1F, 0F, 5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -1F, 0F, -6F, -1F, 0F, 0F, 0F); // Box 279
		bodyModel[263].setRotationPoint(0F, -32F, 132F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 33, 11, 34, 0F,0F, 0F, 0F, 0F, 6F, -1F, 0F, 6F, -1F, 0F, 0F, 0F, 0F, 0F, -10F, 9F, -15F, -11F, 9F, -16F, -11F, 0F, 0F, -10F); // Box 280
		bodyModel[264].setRotationPoint(0F, -29F, 132F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 20, 3, 34, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		bodyModel[265].setRotationPoint(-20F, -32F, 132F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 20, 11, 34, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F); // Box 282
		bodyModel[266].setRotationPoint(-20F, -29F, 132F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 17, 3, 34, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 283
		bodyModel[267].setRotationPoint(-37F, -32F, 132F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 17, 11, 34, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -9F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -9F); // Box 284
		bodyModel[268].setRotationPoint(-37F, -29F, 132F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 18, 6, 34, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F); // Box 285
		bodyModel[269].setRotationPoint(-55F, -34F, 132F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 18, 10, 34, 0F,0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, -2F, -10F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, -2F, -10F); // Box 286
		bodyModel[270].setRotationPoint(-55F, -28F, 132F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 6, 5, 26, 0F,0F, 0F, -3F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -3F, 0F, -1F, -4F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -1F, -4F); // Box 287
		bodyModel[271].setRotationPoint(-61F, -34F, 136F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 6, 9, 12, 0F,0F, 1F, -3F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 1F, -6F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -3F, -10F); // Box 288
		bodyModel[272].setRotationPoint(-61F, -29F, 152F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 6, 5, 14, 0F,0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F); // Box 289
		bodyModel[273].setRotationPoint(-61F, -25F, 142F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 6, 9, 12, 0F,0F, 1F, -6F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 1F, -3F, 0F, -3F, -10F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 290
		bodyModel[274].setRotationPoint(-61F, -29F, 134F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 6, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 291
		bodyModel[275].setRotationPoint(-61F, -39F, 141.5F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 6, 5, 5, 0F,0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 292
		bodyModel[276].setRotationPoint(-61F, -39F, 151.5F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 6, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 293
		bodyModel[277].setRotationPoint(-61F, -49F, 151.5F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 6, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 294
		bodyModel[278].setRotationPoint(-61F, -50F, 141.5F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 6, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F); // Box 295
		bodyModel[279].setRotationPoint(-61F, -49F, 141.5F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 6, 5, 6, 0F,0F, -1F, -5F, 0F, 0F, -3F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -4F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F); // Box 296
		bodyModel[280].setRotationPoint(-61F, -51F, 136F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 6, 13, 4, 0F,0F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, -1F, 1.5F, 0F, 0F, -3F, 0F, 0F, 2F, 0F, 0F, 1.5F, 0F, 0F, 1.5F); // Box 297
		bodyModel[281].setRotationPoint(-61F, -47F, 136F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 15, 5, 12, 0F,0F, -5F, -5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -5F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 298
		bodyModel[282].setRotationPoint(-70F, -47.5F, 142.5F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 15, 2, 12, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 299
		bodyModel[283].setRotationPoint(-70F, -42.5F, 142.5F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 15, 5, 12, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -5F, -5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -5F, -5F); // Box 300
		bodyModel[284].setRotationPoint(-70F, -40.5F, 142.5F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 17, 16, 34, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 301
		bodyModel[285].setRotationPoint(-42F, -43F, 49F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 20, 16, 34, 0F,0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 302
		bodyModel[286].setRotationPoint(-25F, -43F, 49F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 20, 3, 34, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 303
		bodyModel[287].setRotationPoint(-25F, -27F, 49F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 17, 3, 34, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 304
		bodyModel[288].setRotationPoint(-42F, -27F, 49F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 17, 11, 34, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -9F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -9F); // Box 305
		bodyModel[289].setRotationPoint(-42F, -24F, 49F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 20, 11, 34, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F); // Box 306
		bodyModel[290].setRotationPoint(-25F, -24F, 49F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 53, 11, 34, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, -3F, -11F, 0F, -3F, -11F, 0F, 0F, -10F); // Box 307
		bodyModel[291].setRotationPoint(-5F, -24F, 49F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 53, 3, 34, 0F,0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F); // Box 308
		bodyModel[292].setRotationPoint(-5F, -27F, 49F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 53, 16, 34, 0F,0F, 0F, -4F, 0F, -7F, -7F, 0F, -7F, -7F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, 0F, 0F); // Box 309
		bodyModel[293].setRotationPoint(-5F, -43F, 49F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 17, 5, 30, 0F,0F, 0F, -4F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 310
		bodyModel[294].setRotationPoint(-42F, -48F, 51F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 18, 14, 34, 0F,0F, -1F, -4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 311
		bodyModel[295].setRotationPoint(-60F, -43F, 49F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 18, 6, 34, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F); // Box 312
		bodyModel[296].setRotationPoint(-60F, -29F, 49F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 18, 10, 34, 0F,0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, -2F, -10F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, -2F, -10F); // Box 313
		bodyModel[297].setRotationPoint(-60F, -23F, 49F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 18, 5, 30, 0F,0F, -2F, -5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, -5F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F); // Box 314
		bodyModel[298].setRotationPoint(-60F, -48F, 51F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 20, 5, 30, 0F,0F, 0F, -5F, 0F, -2F, -5F, 0F, -2F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 315
		bodyModel[299].setRotationPoint(-25F, -48F, 51F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 53, 3, 26, 0F,0F, 0F, -3F, 0F, -8F, -8F, 0F, -8F, -8F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 7F, -3F, 0F, 7F, -3F, 0F, 0F, 0F); // Box 316
		bodyModel[300].setRotationPoint(-5F, -46F, 53F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 20, 11, 32, 0F,0F, 0F, -6F, 0F, -4F, -9F, 0F, -4F, -9F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, 0F, 0F); // Box 317
		bodyModel[301].setRotationPoint(48F, -36F, 50F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 21, 7, 24, 0F,0F, 0F, -5F, 0F, -7F, -12F, 0F, -7F, -12F, 0F, 0F, -5F, 0F, -1F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, -1F, 0F); // Box 318
		bodyModel[302].setRotationPoint(68F, -32F, 54F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 20, 9, 32, 0F,0F, 0F, 0F, 0F, 1F, -4F, 0F, 1F, -4F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, -4F, -12F, 0F, -4F, -12F, 0F, 0F, -10F); // Box 319
		bodyModel[303].setRotationPoint(48F, -25F, 50F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 21, 6, 24, 0F,0F, 0F, 0F, 0F, -1F, -12F, 0F, -1F, -12F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -5F, -12F, 0F, -5F, -12F, 0F, 0F, -8F); // Box 320
		bodyModel[304].setRotationPoint(68F, -26F, 54F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 20, 2, 20, 0F,0F, 0F, -5F, 0F, -5F, -8F, 0F, -5F, -8F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 4F, -3F, 0F, 4F, -3F, 0F, 0F, 0F); // Box 321
		bodyModel[305].setRotationPoint(48F, -38F, 56F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 21, 1, 14, 0F,0F, 0F, -5F, 0F, -8F, -7F, 0F, -8F, -7F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 7F, -7F, 0F, 7F, -7F, 0F, 0F, 0F); // Box 322
		bodyModel[306].setRotationPoint(68F, -33F, 59F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 53, 3, 16, 0F,0F, 0F, -4F, 0F, -11F, -3F, 0F, -11F, -3F, 0F, 0F, -4F, 0F, 0F, 2F, 0F, 8F, -3F, 0F, 8F, -3F, 0F, 0F, 2F); // Box 323
		bodyModel[307].setRotationPoint(-5F, -49F, 58F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 20, 3, 20, 0F,0F, 0F, -6F, 0F, -2F, -6F, 0F, -2F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 324
		bodyModel[308].setRotationPoint(-25F, -51F, 56F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 17, 4, 22, 0F,0F, 0F, -7F, 0F, -1F, -7F, 0F, -1F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 325
		bodyModel[309].setRotationPoint(-42F, -52F, 55F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 18, 4, 22, 0F,0F, -2F, -8F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -2F, -8F, 0F, 2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1F); // Box 326
		bodyModel[310].setRotationPoint(-60F, -52F, 55F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 6, 4, 20, 0F,0F, -3F, -8F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -3F, -8F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F); // Box 327
		bodyModel[311].setRotationPoint(-66F, -50F, 56F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 6, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 328
		bodyModel[312].setRotationPoint(-66F, -45F, 58.5F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 6, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 329
		bodyModel[313].setRotationPoint(-66F, -44F, 68.5F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 6, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F); // Box 330
		bodyModel[314].setRotationPoint(-66F, -44F, 58.5F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 6, 5, 6, 0F,0F, -1F, -5F, 0F, 0F, -3F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -4F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F); // Box 331
		bodyModel[315].setRotationPoint(-66F, -46F, 53F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 6, 13, 4, 0F,0F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, -1F, 1.5F, 0F, 0F, -3F, 0F, 0F, 2F, 0F, 0F, 1.5F, 0F, 0F, 1.5F); // Box 332
		bodyModel[316].setRotationPoint(-66F, -42F, 53F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 6, 13, 4, 0F,0F, -1F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, -1F, -4F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 2F, 0F, 0F, -3F); // Box 333
		bodyModel[317].setRotationPoint(-66F, -42F, 75F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 6, 5, 6, 0F,0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3F, 0F, -1F, -5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, -4F); // Box 334
		bodyModel[318].setRotationPoint(-66F, -46F, 73F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 6, 5, 5, 0F,0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 335
		bodyModel[319].setRotationPoint(-66F, -34F, 68.5F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 6, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 336
		bodyModel[320].setRotationPoint(-66F, -34F, 58.5F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 6, 5, 26, 0F,0F, 0F, -3F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -3F, 0F, -1F, -4F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -1F, -4F); // Box 337
		bodyModel[321].setRotationPoint(-66F, -29F, 53F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 6, 9, 12, 0F,0F, 1F, -6F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 1F, -3F, 0F, -3F, -10F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 338
		bodyModel[322].setRotationPoint(-66F, -24F, 51F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 6, 5, 14, 0F,0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F); // Box 339
		bodyModel[323].setRotationPoint(-66F, -20F, 59F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 6, 9, 12, 0F,0F, 1F, -3F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 1F, -6F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -3F, -10F); // Box 340
		bodyModel[324].setRotationPoint(-66F, -24F, 69F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 15, 5, 12, 0F,0F, -5F, -5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -5F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 341
		bodyModel[325].setRotationPoint(-75F, -42.5F, 59.5F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 15, 2, 12, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 342
		bodyModel[326].setRotationPoint(-75F, -37.5F, 59.5F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 15, 5, 12, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -5F, -5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -5F, -5F); // Box 343
		bodyModel[327].setRotationPoint(-75F, -35.5F, 59.5F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 25, 8, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0F); // Box 344
		bodyModel[328].setRotationPoint(234F, -61F, 0F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 42, 8, 3, 0F,2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F); // Box 345
		bodyModel[329].setRotationPoint(192F, -61F, 0F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 40, 55, 3, 0F,-24F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -27F, 0F, -1F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 346
		bodyModel[330].setRotationPoint(194F, -116F, 0F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 14, 10, 3, 0F,-4F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, -7F, -3F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F); // Box 347
		bodyModel[331].setRotationPoint(220F, -126F, 0F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 22, 55, 3, 0F,0F, 0F, 0F, -6F, 0F, 0F, -9F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 348
		bodyModel[332].setRotationPoint(234F, -116F, 0F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 16, 10, 3, 0F,0F, 0F, 0F, -6F, -3F, 0F, -9F, -3F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, 0F, 0F, 0F); // Box 349
		bodyModel[333].setRotationPoint(234F, -126F, 0F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 11, 5, 106, 0F,17F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 17F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 350
		bodyModel[334].setRotationPoint(239F, -47F, 7F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 6, 5, 106, 0F,17F, -2F, 0F, -17F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, 17F, -2F, 0F, -17F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F); // Box 351
		bodyModel[335].setRotationPoint(233F, -47F, 7F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 12, 5, 8, 0F,0F, 0F, 0F, 0F, -2F, 0F, -5F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -5F, -2F, -2F, 0F, -2F, 0F); // Box 353
		bodyModel[336].setRotationPoint(250F, -47F, 113F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 10, 5, 8, 0F,0F, -2F, 0F, -6F, 0F, 0F, 0F, -2F, 0F, -5F, -2F, -2F, 0F, -2F, 0F, -6F, 0F, 0F, 0F, -2F, 0F, -5F, -2F, -2F); // Box 354
		bodyModel[337].setRotationPoint(235F, -47F, 113F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 10, 5, 8, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -5F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -5F, -2F, 0F); // Box 355
		bodyModel[338].setRotationPoint(240F, -47F, 113F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 18, 1, 10, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -6F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -6F); // Box 356
		bodyModel[339].setRotationPoint(-159F, -42F, 0F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 18, 1, 10, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -5F); // Box 357
		bodyModel[340].setRotationPoint(-159F, -8F, 0F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 358
		bodyModel[341].setRotationPoint(261F, -53F, 2F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F); // Box 359
		bodyModel[342].setRotationPoint(269F, -53F, 2F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 360
		bodyModel[343].setRotationPoint(265F, -53F, 2F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 361
		bodyModel[344].setRotationPoint(265F, -53F, 0F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 362
		bodyModel[345].setRotationPoint(268F, -53F, 0F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 50, 1, 11, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 0F, 0F); // Box 363
		bodyModel[346].setRotationPoint(88F, -57F, 0F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 44, 1, 10, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -3F, 0F, 0F, 0F); // Box 364
		bodyModel[347].setRotationPoint(138F, -56F, 0F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 365
		bodyModel[348].setRotationPoint(-165F, -28F, 12F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 366
		bodyModel[349].setRotationPoint(-165F, -39F, 3F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 367
		bodyModel[350].setRotationPoint(-165F, -10F, 3F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 368
		bodyModel[351].setRotationPoint(-165F, -20F, 12F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 369
		bodyModel[352].setRotationPoint(-165F, -35F, 10F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 370
		bodyModel[353].setRotationPoint(-165F, -35F, 4F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 371
		bodyModel[354].setRotationPoint(-165F, -28F, 10F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, -7F); // Box 372
		bodyModel[355].setRotationPoint(-165F, -19F, 10F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 373
		bodyModel[356].setRotationPoint(-171F, -28F, 0F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F); // Box 374
		bodyModel[357].setRotationPoint(-171F, -28F, 6F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 375
		bodyModel[358].setRotationPoint(-171F, -20F, 0F);

		bodyModel[359].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F); // Box 376
		bodyModel[359].setRotationPoint(-171F, -20F, 6F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 377
		bodyModel[360].setRotationPoint(-171F, -28F, 5F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 2F, 6F, 0F, 2F, 6F, 0F, -2F, -6F, 0F, -2F); // Box 378
		bodyModel[361].setRotationPoint(-171F, -19F, 5F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 379
		bodyModel[362].setRotationPoint(-171F, -24F, 0F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 380
		bodyModel[363].setRotationPoint(-171F, -24F, 0F);

		bodyModel[364].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F); // Box 381
		bodyModel[364].setRotationPoint(-171F, -24F, 6F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 382
		bodyModel[365].setRotationPoint(-165F, -24F, 12F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 6, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 383
		bodyModel[366].setRotationPoint(-53F, -55F, 0F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 7, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 384
		bodyModel[367].setRotationPoint(-75F, -55F, 4F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 7, 1, 7, 0F,0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 385
		bodyModel[368].setRotationPoint(-60F, -55F, 4F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 386
		bodyModel[369].setRotationPoint(-165F, -37F, -4F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 387
		bodyModel[370].setRotationPoint(-165F, -37F, 0F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 47, 9, 20, 0F,0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413
		bodyModel[371].setRotationPoint(-122F, -28F, -20F);

		bodyModel[372].addShapeBox(0F, 0F, 0F, 28, 9, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 414
		bodyModel[372].setRotationPoint(-75F, -28F, -24F);

		bodyModel[373].addShapeBox(0F, 0F, 0F, 47, 9, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 0F); // Box 415
		bodyModel[373].setRotationPoint(-122F, -28F, 0F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 28, 9, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 416
		bodyModel[374].setRotationPoint(-75F, -28F, 0F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 10, 8, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 417
		bodyModel[375].setRotationPoint(-122F, -41F, -20F);

		bodyModel[376].addShapeBox(0F, 0F, 0F, 16, 3, 40, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F); // Box 418
		bodyModel[376].setRotationPoint(-128F, -44F, -20F);

		bodyModel[377].addShapeBox(0F, 1F, 0F, 10, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
		bodyModel[377].setRotationPoint(-103F, -33F, -14F);
		bodyModel[377].rotateAngleZ = -0.10471976F;

		bodyModel[378].addShapeBox(9F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		bodyModel[378].setRotationPoint(-103F, -33F, -14F);
		bodyModel[378].rotateAngleZ = -0.10471976F;

		bodyModel[379].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		bodyModel[379].setRotationPoint(-103F, -33F, -14F);
		bodyModel[379].rotateAngleZ = -0.10471976F;

		bodyModel[380].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		bodyModel[380].setRotationPoint(-103F, -33F, -5F);
		bodyModel[380].rotateAngleZ = -0.10471976F;

		bodyModel[381].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		bodyModel[381].setRotationPoint(-103F, -33F, -14F);
		bodyModel[381].rotateAngleZ = -0.10471976F;

		bodyModel[382].addShapeBox(0F, 0F, 0F, 1, 13, 10, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		bodyModel[382].setRotationPoint(-94F, -45F, -14F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[383].setRotationPoint(-92F, -49F, -12F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 1, 13, 8, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 246
		bodyModel[384].setRotationPoint(-95F, -44F, -13F);

		bodyModel[385].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[385].setRotationPoint(-95.3F, -44.3F, -11F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[386].setRotationPoint(-95.3F, -44.3F, -8F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[387].setRotationPoint(-94F, -42F, -13F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 251
		bodyModel[388].setRotationPoint(-94F, -42F, -6F);

		bodyModel[389].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[389].setRotationPoint(-100F, -32F, -15F);
		bodyModel[389].rotateAngleZ = 0.78539816F;

		bodyModel[390].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 253
		bodyModel[390].setRotationPoint(-100F, -32F, -4F);
		bodyModel[390].rotateAngleZ = 0.78539816F;

		bodyModel[391].addShapeBox(-1F, -1F, 0F, 2, 11, 2, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 263
		bodyModel[391].setRotationPoint(-104.5F, -37.25F, -10F);
		bodyModel[391].rotateAngleZ = -1.13446401F;

		bodyModel[392].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 264
		bodyModel[392].setRotationPoint(-104F, -41F, -9.5F);

		bodyModel[393].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 962
		bodyModel[393].setRotationPoint(-92.5F, -48.5F, -10.5F);

		bodyModel[394].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 964
		bodyModel[394].setRotationPoint(-92.5F, -47.5F, -10.5F);

		bodyModel[395].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 966
		bodyModel[395].setRotationPoint(-92.5F, -46.5F, -10.5F);

		bodyModel[396].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 782
		bodyModel[396].setRotationPoint(-99F, -31F, -13F);

		bodyModel[397].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 783
		bodyModel[397].setRotationPoint(-99F, -31F, -6F);

		bodyModel[398].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 786
		bodyModel[398].setRotationPoint(-104F, -40.75F, -8.5F);

		bodyModel[399].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 789
		bodyModel[399].setRotationPoint(-104F, -40.75F, -12.5F);

		bodyModel[400].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 791
		bodyModel[400].setRotationPoint(-104F, -43.75F, -12.5F);

		bodyModel[401].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 792
		bodyModel[401].setRotationPoint(-104F, -43.75F, -6.5F);

		bodyModel[402].addShapeBox(0F, 1F, 0F, 10, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 444
		bodyModel[402].setRotationPoint(-103F, -33F, 4F);
		bodyModel[402].rotateAngleZ = -0.10471976F;

		bodyModel[403].addShapeBox(9F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 445
		bodyModel[403].setRotationPoint(-103F, -33F, 4F);
		bodyModel[403].rotateAngleZ = -0.10471976F;

		bodyModel[404].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 446
		bodyModel[404].setRotationPoint(-103F, -33F, 13F);
		bodyModel[404].rotateAngleZ = -0.10471976F;

		bodyModel[405].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 447
		bodyModel[405].setRotationPoint(-103F, -33F, 4F);
		bodyModel[405].rotateAngleZ = -0.10471976F;

		bodyModel[406].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 448
		bodyModel[406].setRotationPoint(-103F, -33F, 4F);
		bodyModel[406].rotateAngleZ = -0.10471976F;

		bodyModel[407].addShapeBox(0F, 0F, 0F, 1, 13, 10, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 449
		bodyModel[407].setRotationPoint(-94F, -45F, 4F);

		bodyModel[408].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 450
		bodyModel[408].setRotationPoint(-92F, -49F, 6F);

		bodyModel[409].addShapeBox(0F, 0F, 0F, 1, 13, 8, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 451
		bodyModel[409].setRotationPoint(-95F, -44F, 5F);

		bodyModel[410].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 452
		bodyModel[410].setRotationPoint(-95.3F, -44.3F, 10F);

		bodyModel[411].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 453
		bodyModel[411].setRotationPoint(-95.3F, -44.3F, 7F);

		bodyModel[412].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 454
		bodyModel[412].setRotationPoint(-94F, -42F, 12F);

		bodyModel[413].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 455
		bodyModel[413].setRotationPoint(-94F, -42F, 5F);

		bodyModel[414].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 456
		bodyModel[414].setRotationPoint(-100F, -32F, 14F);
		bodyModel[414].rotateAngleZ = 0.78539816F;

		bodyModel[415].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 457
		bodyModel[415].setRotationPoint(-100F, -32F, 3F);
		bodyModel[415].rotateAngleZ = 0.78539816F;

		bodyModel[416].addShapeBox(-1F, -1F, 0F, 2, 11, 2, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 458
		bodyModel[416].setRotationPoint(-104.5F, -37.25F, 8F);
		bodyModel[416].rotateAngleZ = -1.13446401F;

		bodyModel[417].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 459
		bodyModel[417].setRotationPoint(-104F, -41F, 8.5F);

		bodyModel[418].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 460
		bodyModel[418].setRotationPoint(-92.5F, -48.5F, 7.5F);

		bodyModel[419].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 461
		bodyModel[419].setRotationPoint(-92.5F, -47.5F, 7.5F);

		bodyModel[420].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 462
		bodyModel[420].setRotationPoint(-92.5F, -46.5F, 7.5F);

		bodyModel[421].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 463
		bodyModel[421].setRotationPoint(-99F, -31F, 12F);

		bodyModel[422].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 464
		bodyModel[422].setRotationPoint(-99F, -31F, 5F);

		bodyModel[423].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 465
		bodyModel[423].setRotationPoint(-104F, -40.75F, 5.5F);

		bodyModel[424].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 466
		bodyModel[424].setRotationPoint(-104F, -40.75F, 9.5F);

		bodyModel[425].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 467
		bodyModel[425].setRotationPoint(-104F, -43.75F, 11.5F);

		bodyModel[426].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 468
		bodyModel[426].setRotationPoint(-104F, -43.75F, 5.5F);

		bodyModel[427].addShapeBox(0F, 1F, 0F, 10, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 469
		bodyModel[427].setRotationPoint(-82F, -33F, 4F);
		bodyModel[427].rotateAngleZ = -0.10471976F;

		bodyModel[428].addShapeBox(9F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 470
		bodyModel[428].setRotationPoint(-82F, -33F, 4F);
		bodyModel[428].rotateAngleZ = -0.10471976F;

		bodyModel[429].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 471
		bodyModel[429].setRotationPoint(-82F, -33F, 13F);
		bodyModel[429].rotateAngleZ = -0.10471976F;

		bodyModel[430].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 472
		bodyModel[430].setRotationPoint(-82F, -33F, 4F);
		bodyModel[430].rotateAngleZ = -0.10471976F;

		bodyModel[431].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 473
		bodyModel[431].setRotationPoint(-82F, -33F, 4F);
		bodyModel[431].rotateAngleZ = -0.10471976F;

		bodyModel[432].addShapeBox(0F, 0F, 0F, 1, 13, 10, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 474
		bodyModel[432].setRotationPoint(-73F, -45F, 4F);

		bodyModel[433].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 475
		bodyModel[433].setRotationPoint(-71F, -49F, 6F);

		bodyModel[434].addShapeBox(0F, 0F, 0F, 1, 13, 8, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 476
		bodyModel[434].setRotationPoint(-74F, -44F, 5F);

		bodyModel[435].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 477
		bodyModel[435].setRotationPoint(-74.3F, -44.3F, 10F);

		bodyModel[436].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 478
		bodyModel[436].setRotationPoint(-74.3F, -44.3F, 7F);

		bodyModel[437].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 479
		bodyModel[437].setRotationPoint(-73F, -42F, 12F);

		bodyModel[438].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 480
		bodyModel[438].setRotationPoint(-73F, -42F, 5F);

		bodyModel[439].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 481
		bodyModel[439].setRotationPoint(-79F, -32F, 14F);
		bodyModel[439].rotateAngleZ = 0.78539816F;

		bodyModel[440].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 482
		bodyModel[440].setRotationPoint(-79F, -32F, 3F);
		bodyModel[440].rotateAngleZ = 0.78539816F;

		bodyModel[441].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 483
		bodyModel[441].setRotationPoint(-71.5F, -48.5F, 7.5F);

		bodyModel[442].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 484
		bodyModel[442].setRotationPoint(-71.5F, -47.5F, 7.5F);

		bodyModel[443].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 485
		bodyModel[443].setRotationPoint(-71.5F, -46.5F, 7.5F);

		bodyModel[444].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 486
		bodyModel[444].setRotationPoint(-78F, -31F, 12F);

		bodyModel[445].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 487
		bodyModel[445].setRotationPoint(-78F, -31F, 5F);

		bodyModel[446].addShapeBox(0F, 1F, 0F, 10, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 488
		bodyModel[446].setRotationPoint(-82F, -33F, -14F);
		bodyModel[446].rotateAngleZ = -0.10471976F;

		bodyModel[447].addShapeBox(9F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 489
		bodyModel[447].setRotationPoint(-82F, -33F, -14F);
		bodyModel[447].rotateAngleZ = -0.10471976F;

		bodyModel[448].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 490
		bodyModel[448].setRotationPoint(-82F, -33F, -14F);
		bodyModel[448].rotateAngleZ = -0.10471976F;

		bodyModel[449].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 491
		bodyModel[449].setRotationPoint(-82F, -33F, -5F);
		bodyModel[449].rotateAngleZ = -0.10471976F;

		bodyModel[450].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 492
		bodyModel[450].setRotationPoint(-82F, -33F, -14F);
		bodyModel[450].rotateAngleZ = -0.10471976F;

		bodyModel[451].addShapeBox(0F, 0F, 0F, 1, 13, 10, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 493
		bodyModel[451].setRotationPoint(-73F, -45F, -14F);

		bodyModel[452].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 494
		bodyModel[452].setRotationPoint(-71F, -49F, -12F);

		bodyModel[453].addShapeBox(0F, 0F, 0F, 1, 13, 8, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 495
		bodyModel[453].setRotationPoint(-74F, -44F, -13F);

		bodyModel[454].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 496
		bodyModel[454].setRotationPoint(-74.3F, -44.3F, -11F);

		bodyModel[455].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 497
		bodyModel[455].setRotationPoint(-74.3F, -44.3F, -8F);

		bodyModel[456].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 498
		bodyModel[456].setRotationPoint(-73F, -42F, -13F);

		bodyModel[457].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 499
		bodyModel[457].setRotationPoint(-73F, -42F, -6F);

		bodyModel[458].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 500
		bodyModel[458].setRotationPoint(-79F, -32F, -15F);
		bodyModel[458].rotateAngleZ = 0.78539816F;

		bodyModel[459].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 501
		bodyModel[459].setRotationPoint(-79F, -32F, -4F);
		bodyModel[459].rotateAngleZ = 0.78539816F;

		bodyModel[460].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 502
		bodyModel[460].setRotationPoint(-71.5F, -48.5F, -10.5F);

		bodyModel[461].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 503
		bodyModel[461].setRotationPoint(-71.5F, -47.5F, -10.5F);

		bodyModel[462].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 504
		bodyModel[462].setRotationPoint(-71.5F, -46.5F, -10.5F);

		bodyModel[463].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 505
		bodyModel[463].setRotationPoint(-78F, -31F, -13F);

		bodyModel[464].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 506
		bodyModel[464].setRotationPoint(-78F, -31F, -6F);

		bodyModel[465].addShapeBox(0F, 0F, 0F, 3, 16, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 721
		bodyModel[465].setRotationPoint(-73F, -55F, -3F);

		bodyModel[466].addShapeBox(0F, 0F, 0F, 2, 16, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 722
		bodyModel[466].setRotationPoint(-75F, -55F, -3F);

		bodyModel[467].addShapeBox(0F, 0F, 0F, 2, 16, 6, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 723
		bodyModel[467].setRotationPoint(-70F, -55F, -3F);

		bodyModel[468].addShapeBox(0F, 0F, 0F, 24, 4, 9, 0F,0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 724
		bodyModel[468].setRotationPoint(-76F, -39F, -4F);

		bodyModel[469].addShapeBox(0F, 0F, 0F, 24, 10, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 725
		bodyModel[469].setRotationPoint(-76F, -35F, -4F);

		bodyModel[470].addShapeBox(0F, 0F, 0F, 1, 13, 10, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 726
		bodyModel[470].setRotationPoint(-66.75F, -55.5F, -5F);

		bodyModel[471].addShapeBox(0F, 0F, 0F, 1, 12, 8, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 727
		bodyModel[471].setRotationPoint(-65.75F, -54.5F, -4F);

		bodyModel[472].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 728
		bodyModel[472].setRotationPoint(-66.75F, -43.5F, -5F);
		bodyModel[472].rotateAngleZ = 0.10471976F;

		bodyModel[473].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 729
		bodyModel[473].setRotationPoint(-66.75F, -43.5F, -5F);
		bodyModel[473].rotateAngleZ = 0.10471976F;

		bodyModel[474].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 730
		bodyModel[474].setRotationPoint(-66.75F, -43.5F, 4F);
		bodyModel[474].rotateAngleZ = 0.10471976F;

		bodyModel[475].addShapeBox(0F, 1F, 0F, 10, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 731
		bodyModel[475].setRotationPoint(-66.75F, -43.5F, -5F);
		bodyModel[475].rotateAngleZ = 0.10471976F;

		bodyModel[476].addShapeBox(9F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 732
		bodyModel[476].setRotationPoint(-66.75F, -43.5F, -5F);
		bodyModel[476].rotateAngleZ = 0.10471976F;

		bodyModel[477].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 519
		bodyModel[477].setRotationPoint(-149F, -31F, 3F);

		bodyModel[478].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 520
		bodyModel[478].setRotationPoint(-149F, -31F, -4F);

		bodyModel[479].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 521
		bodyModel[479].setRotationPoint(-154F, -20F, -4F);

		bodyModel[480].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 522
		bodyModel[480].setRotationPoint(-154F, -20F, 3F);

		bodyModel[481].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 523
		bodyModel[481].setRotationPoint(-158F, -22F, -5F);
		bodyModel[481].rotateAngleZ = -0.10471976F;

		bodyModel[482].addShapeBox(0F, 1F, 0F, 10, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 524
		bodyModel[482].setRotationPoint(-158F, -22F, -5F);
		bodyModel[482].rotateAngleZ = -0.10471976F;

		bodyModel[483].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 525
		bodyModel[483].setRotationPoint(-158F, -22F, -5F);
		bodyModel[483].rotateAngleZ = -0.10471976F;

		bodyModel[484].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 526
		bodyModel[484].setRotationPoint(-155F, -21F, -6F);
		bodyModel[484].rotateAngleZ = 0.78539816F;

		bodyModel[485].addShapeBox(0F, 0F, 0F, 1, 13, 10, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 527
		bodyModel[485].setRotationPoint(-149F, -34F, -5F);

		bodyModel[486].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 528
		bodyModel[486].setRotationPoint(-150.3F, -33.3F, -2F);

		bodyModel[487].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 529
		bodyModel[487].setRotationPoint(-150.3F, -33.3F, 1F);

		bodyModel[488].addShapeBox(0F, 0F, 0F, 1, 13, 8, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 530
		bodyModel[488].setRotationPoint(-150F, -33F, -4F);

		bodyModel[489].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 531
		bodyModel[489].setRotationPoint(-147.5F, -35.5F, -1.5F);

		bodyModel[490].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 532
		bodyModel[490].setRotationPoint(-147.5F, -36.5F, -1.5F);

		bodyModel[491].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 533
		bodyModel[491].setRotationPoint(-147.5F, -37.5F, -1.5F);

		bodyModel[492].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 534
		bodyModel[492].setRotationPoint(-147F, -38F, -3F);

		bodyModel[493].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 535
		bodyModel[493].setRotationPoint(-155F, -21F, 5F);
		bodyModel[493].rotateAngleZ = 0.78539816F;

		bodyModel[494].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 536
		bodyModel[494].setRotationPoint(-158F, -22F, 4F);
		bodyModel[494].rotateAngleZ = -0.10471976F;

		bodyModel[495].addShapeBox(9F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 537
		bodyModel[495].setRotationPoint(-158F, -22F, -5F);
		bodyModel[495].rotateAngleZ = -0.10471976F;
	}

	private void inittailModel_1()
	{
		tailModel[0] = new ModelRendererTurbo(this, 1201, 73, textureX, textureY); // Box 108
		tailModel[1] = new ModelRendererTurbo(this, 929, 193, textureX, textureY); // Box 112
		tailModel[2] = new ModelRendererTurbo(this, 1097, 89, textureX, textureY); // Box 113
		tailModel[3] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 104
		tailModel[4] = new ModelRendererTurbo(this, 473, 433, textureX, textureY); // Box 352

		tailModel[0].addShapeBox(0F, 0F, 0F, 25, 8, 3, 0F,0F, 0F, 0F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 108
		tailModel[0].setRotationPoint(234F, -61F, -3F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 22, 55, 3, 0F,0F, 0F, 0F, -9F, 0F, -2F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 3F, 0F, 0F, 0F, 0F, 0F); // Box 112
		tailModel[1].setRotationPoint(234F, -116F, -3F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 16, 10, 3, 0F,0F, -1F, -2F, -9F, -3F, -2F, -6F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		tailModel[2].setRotationPoint(234F, -126F, -3F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 12, 5, 106, 0F,0F, 0F, 0F, 0F, -2F, 0F, 13F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 13F, -2F, 2F, 0F, 0F, 0F); // Box 104
		tailModel[3].setRotationPoint(250F, -47F, -113F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 12, 5, 106, 0F,0F, 0F, 0F, 13F, -2F, 2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 13F, -2F, 2F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 352
		tailModel[4].setRotationPoint(250F, -47F, 7F);
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 673, 65, textureX, textureY); // Box 67
		leftWingModel[1] = new ModelRendererTurbo(this, 953, 65, textureX, textureY); // Box 68
		leftWingModel[2] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 69
		leftWingModel[3] = new ModelRendererTurbo(this, 673, 65, textureX, textureY); // Box 70
		leftWingModel[4] = new ModelRendererTurbo(this, 1361, 57, textureX, textureY); // Box 71
		leftWingModel[5] = new ModelRendererTurbo(this, 1921, 57, textureX, textureY); // Box 72

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 19, 5, 119, 0F,0F, 0F, 0F, 0F, 0F, 0F, 10F, -6F, 0F, 12F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 12F, 0F, 12F, 12F, 0F); // Box 67
		leftWingModel[0].setRotationPoint(8F, -52F, -308F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 9, 5, 119, 0F,0F, -1F, 0F, 0F, 0F, 0F, -12F, -6F, 0F, 13F, -10F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -12F, 12F, 0F, 13F, 8F, 0F); // Box 68
		leftWingModel[1].setRotationPoint(-1F, -52F, -308F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 7, 5, 119, 0F,0F, 0F, 0F, 0F, -2F, 0F, 16F, -11F, 0F, -10F, -6F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 16F, 7F, 0F, -10F, 12F, 0F); // Box 69
		leftWingModel[2].setRotationPoint(27F, -52F, -308F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 19, 5, 16, 0F,0F, -2F, 0F, -7F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -7F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		leftWingModel[3].setRotationPoint(8F, -52F, -324F);

		leftWingModel[4].addShapeBox(0F, 0F, 0F, 9, 5, 16, 0F,-3F, -2F, -5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, -2F, -5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 71
		leftWingModel[4].setRotationPoint(-1F, -52F, -324F);

		leftWingModel[5].addShapeBox(0F, 0F, 0F, 7, 5, 16, 0F,7F, -2F, 0F, -6F, -2F, -5F, 0F, -2F, 0F, 0F, 0F, 0F, 7F, -2F, 0F, -6F, -2F, -5F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 72
		leftWingModel[5].setRotationPoint(27F, -52F, -324F);
	}

	private void initrightWingModel_1()
	{
		rightWingModel[0] = new ModelRendererTurbo(this, 1657, 281, textureX, textureY); // Box 256
		rightWingModel[1] = new ModelRendererTurbo(this, 1313, 273, textureX, textureY); // Box 257
		rightWingModel[2] = new ModelRendererTurbo(this, 121, 305, textureX, textureY); // Box 258
		rightWingModel[3] = new ModelRendererTurbo(this, 1969, 217, textureX, textureY); // Box 259
		rightWingModel[4] = new ModelRendererTurbo(this, 1265, 169, textureX, textureY); // Box 260
		rightWingModel[5] = new ModelRendererTurbo(this, 1721, 169, textureX, textureY); // Box 261

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 19, 5, 119, 0F,12F, -6F, 0F, 10F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 12F, 0F, 10F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 256
		rightWingModel[0].setRotationPoint(8F, -52F, 189F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 9, 5, 119, 0F,13F, -10F, 0F, -12F, -6F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 13F, 8F, 0F, -12F, 12F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 257
		rightWingModel[1].setRotationPoint(-1F, -52F, 189F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 7, 5, 119, 0F,-10F, -6F, 0F, 16F, -11F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -10F, 12F, 0F, 16F, 7F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 258
		rightWingModel[2].setRotationPoint(27F, -52F, 189F);

		rightWingModel[3].addShapeBox(0F, 0F, 0F, 19, 5, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, -7F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, -2F, 0F, 0F, -2F, 0F); // Box 259
		rightWingModel[3].setRotationPoint(8F, -52F, 308F);

		rightWingModel[4].addShapeBox(0F, 0F, 0F, 9, 5, 16, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, -2F, -5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, -2F, -5F); // Box 260
		rightWingModel[4].setRotationPoint(-1F, -52F, 308F);

		rightWingModel[5].addShapeBox(0F, 0F, 0F, 7, 5, 16, 0F,0F, 0F, 0F, 0F, -2F, 0F, -6F, -2F, -5F, 7F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -6F, -2F, -5F, 7F, -2F, 0F); // Box 261
		rightWingModel[5].setRotationPoint(27F, -52F, 308F);
	}

	private void initbodyWheelModel_1()
	{
		bodyWheelModel[0] = new ModelRendererTurbo(this, 417, 113, textureX, textureY); // Box 511
		bodyWheelModel[1] = new ModelRendererTurbo(this, 1825, 65, textureX, textureY); // Box 516
		bodyWheelModel[2] = new ModelRendererTurbo(this, 1177, 113, textureX, textureY); // Box 517
		bodyWheelModel[3] = new ModelRendererTurbo(this, 73, 129, textureX, textureY); // Box 518
		bodyWheelModel[4] = new ModelRendererTurbo(this, 905, 137, textureX, textureY); // Box 521
		bodyWheelModel[5] = new ModelRendererTurbo(this, 1985, 145, textureX, textureY); // Box 522
		bodyWheelModel[6] = new ModelRendererTurbo(this, 745, 161, textureX, textureY); // Box 523

		bodyWheelModel[0].addShapeBox(0F, 0F, 0F, 12, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 511
		bodyWheelModel[0].setRotationPoint(-131F, 2F, -6F);

		bodyWheelModel[1].addShapeBox(0F, 0F, 0F, 2, 20, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 516
		bodyWheelModel[1].setRotationPoint(-126F, -13F, -1F);

		bodyWheelModel[2].addShapeBox(0F, 0F, 0F, 12, 4, 5, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 517
		bodyWheelModel[2].setRotationPoint(-131F, -2F, -6F);

		bodyWheelModel[3].addShapeBox(0F, 0F, 0F, 12, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 518
		bodyWheelModel[3].setRotationPoint(-131F, 6F, -6F);

		bodyWheelModel[4].addShapeBox(0F, 0F, 0F, 12, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 521
		bodyWheelModel[4].setRotationPoint(-131F, 2F, 1F);

		bodyWheelModel[5].addShapeBox(0F, 0F, 0F, 12, 4, 5, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 522
		bodyWheelModel[5].setRotationPoint(-131F, -2F, 1F);

		bodyWheelModel[6].addShapeBox(0F, 0F, 0F, 12, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 523
		bodyWheelModel[6].setRotationPoint(-131F, 6F, 1F);
	}

	private void initleftWingWheelModel_1()
	{
		leftWingWheelModel[0] = new ModelRendererTurbo(this, 137, 113, textureX, textureY); // Box 492
		leftWingWheelModel[1] = new ModelRendererTurbo(this, 57, 289, textureX, textureY); // Box 493
		leftWingWheelModel[2] = new ModelRendererTurbo(this, 777, 305, textureX, textureY); // Box 494
		leftWingWheelModel[3] = new ModelRendererTurbo(this, 1993, 313, textureX, textureY); // Box 495
		leftWingWheelModel[4] = new ModelRendererTurbo(this, 257, 329, textureX, textureY); // Box 496
		leftWingWheelModel[5] = new ModelRendererTurbo(this, 1993, 329, textureX, textureY); // Box 497
		leftWingWheelModel[6] = new ModelRendererTurbo(this, 337, 345, textureX, textureY); // Box 498
		leftWingWheelModel[7] = new ModelRendererTurbo(this, 257, 401, textureX, textureY); // Box 499
		leftWingWheelModel[8] = new ModelRendererTurbo(this, 1113, 409, textureX, textureY); // Box 500

		leftWingWheelModel[0].addShapeBox(0F, 0F, 0F, 4, 20, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 492
		leftWingWheelModel[0].setRotationPoint(-39F, -13F, -69F);

		leftWingWheelModel[1].addShapeBox(0F, 0F, 0F, 18, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 493
		leftWingWheelModel[1].setRotationPoint(-46F, -2F, -75F);

		leftWingWheelModel[2].addShapeBox(0F, 0F, 0F, 18, 6, 6, 0F,-6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 494
		leftWingWheelModel[2].setRotationPoint(-46F, -8F, -75F);

		leftWingWheelModel[3].addShapeBox(0F, 0F, 0F, 18, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Box 495
		leftWingWheelModel[3].setRotationPoint(-46F, 4F, -75F);

		leftWingWheelModel[4].addShapeBox(0F, 0F, 0F, 18, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 496
		leftWingWheelModel[4].setRotationPoint(-46F, -2F, -65F);

		leftWingWheelModel[5].addShapeBox(0F, 0F, 0F, 18, 6, 6, 0F,-6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 497
		leftWingWheelModel[5].setRotationPoint(-46F, -8F, -65F);

		leftWingWheelModel[6].addShapeBox(0F, 0F, 0F, 18, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Box 498
		leftWingWheelModel[6].setRotationPoint(-46F, 4F, -65F);

		leftWingWheelModel[7].addShapeBox(0F, 0F, 0F, 48, 17, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 499
		leftWingWheelModel[7].setRotationPoint(-46F, -22F, -80F);

		leftWingWheelModel[8].addShapeBox(0F, 0F, 0F, 48, 17, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 500
		leftWingWheelModel[8].setRotationPoint(-46F, -22F, -55F);
	}

	private void initrightWingWheelModel_1()
	{
		rightWingWheelModel[0] = new ModelRendererTurbo(this, 833, 113, textureX, textureY); // Box 406
		rightWingWheelModel[1] = new ModelRendererTurbo(this, 449, 345, textureX, textureY); // Box 407
		rightWingWheelModel[2] = new ModelRendererTurbo(this, 553, 345, textureX, textureY); // Box 408
		rightWingWheelModel[3] = new ModelRendererTurbo(this, 1889, 353, textureX, textureY); // Box 409
		rightWingWheelModel[4] = new ModelRendererTurbo(this, 81, 361, textureX, textureY); // Box 410
		rightWingWheelModel[5] = new ModelRendererTurbo(this, 185, 361, textureX, textureY); // Box 411
		rightWingWheelModel[6] = new ModelRendererTurbo(this, 337, 361, textureX, textureY); // Box 412
		rightWingWheelModel[7] = new ModelRendererTurbo(this, 1657, 409, textureX, textureY); // Box 413
		rightWingWheelModel[8] = new ModelRendererTurbo(this, 1425, 425, textureX, textureY); // Box 414

		rightWingWheelModel[0].addShapeBox(0F, 0F, 0F, 4, 20, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 406
		rightWingWheelModel[0].setRotationPoint(-39F, -13F, 65F);

		rightWingWheelModel[1].addShapeBox(0F, 0F, 0F, 18, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 407
		rightWingWheelModel[1].setRotationPoint(-46F, -2F, 69F);

		rightWingWheelModel[2].addShapeBox(0F, 0F, 0F, 18, 6, 6, 0F,-6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 408
		rightWingWheelModel[2].setRotationPoint(-46F, -8F, 69F);

		rightWingWheelModel[3].addShapeBox(0F, 0F, 0F, 18, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Box 409
		rightWingWheelModel[3].setRotationPoint(-46F, 4F, 69F);

		rightWingWheelModel[4].addShapeBox(0F, 0F, 0F, 18, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 410
		rightWingWheelModel[4].setRotationPoint(-46F, -2F, 59F);

		rightWingWheelModel[5].addShapeBox(0F, 0F, 0F, 18, 6, 6, 0F,-6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 411
		rightWingWheelModel[5].setRotationPoint(-46F, -8F, 59F);

		rightWingWheelModel[6].addShapeBox(0F, 0F, 0F, 18, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Box 412
		rightWingWheelModel[6].setRotationPoint(-46F, 4F, 59F);

		rightWingWheelModel[7].addShapeBox(0F, 0F, 0F, 48, 17, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413
		rightWingWheelModel[7].setRotationPoint(-46F, -22F, 79F);

		rightWingWheelModel[8].addShapeBox(0F, 0F, 0F, 48, 17, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 414
		rightWingWheelModel[8].setRotationPoint(-46F, -22F, 54F);
	}

	private void initPropeller()
	{
		propellerModels = new ModelRendererTurbo[4][4];
		propellerModels[0] = makeProp1(-68F, -36.5F, -65.5F);
		propellerModels[1] = makeProp2(-63F, -41.5F, -148.5F);
		propellerModels[2] = makeProp3(-68F, -36.5F, 65.5F);
		propellerModels[3] = makeProp4(-63F, -41.5F, 148.5F);
	}

	private ModelRendererTurbo[] makeProp1(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[4];
		prop[0] = new ModelRendererTurbo(this, 0, 445, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 445, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 0, 445, textureX, textureY);
		prop[3] = new ModelRendererTurbo(this, 0, 445, textureX, textureY);
		prop[0].addBox(-1F, -37F, -2.5F, 2, 37, 5, 0.0F);
		prop[1].addBox(-1F, -37F, -2.5F, 2, 37, 5, 0.0F);
		prop[2].addBox(-1F, -37F, -2.5F, 2, 37, 5, 0.0F);
		prop[3].addBox(-1F, -37F, -2.5F, 2, 37, 5, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		prop[3].setRotationPoint(i, j, k);
		return prop;
	}

	private ModelRendererTurbo[] makeProp2(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[4];
		prop[0] = new ModelRendererTurbo(this, 0, 445, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 445, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 0, 445, textureX, textureY);
		prop[3] = new ModelRendererTurbo(this, 0, 445, textureX, textureY);
		prop[0].addBox(-1F, -37F, -2.5F, 2, 37, 5, 0.0F);
		prop[1].addBox(-1F, -37F, -2.5F, 2, 37, 5, 0.0F);
		prop[2].addBox(-1F, -37F, -2.5F, 2, 37, 5, 0.0F);
		prop[3].addBox(-1F, -37F, -2.5F, 2, 37, 5, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		prop[3].setRotationPoint(i, j, k);
		return prop;
	}

	private ModelRendererTurbo[] makeProp3(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[4];
		prop[0] = new ModelRendererTurbo(this, 0, 445, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 445, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 0, 445, textureX, textureY);
		prop[3] = new ModelRendererTurbo(this, 0, 445, textureX, textureY);
		prop[0].addBox(-1F, -37F, -2.5F, 2, 37, 5, 0.0F);
		prop[1].addBox(-1F, -37F, -2.5F, 2, 37, 5, 0.0F);
		prop[2].addBox(-1F, -37F, -2.5F, 2, 37, 5, 0.0F);
		prop[3].addBox(-1F, -37F, -2.5F, 2, 37, 5, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		prop[3].setRotationPoint(i, j, k);
		return prop;
	}

	private ModelRendererTurbo[] makeProp4(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[4];
		prop[0] = new ModelRendererTurbo(this, 0, 445, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 445, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 0, 445, textureX, textureY);
		prop[3] = new ModelRendererTurbo(this, 0, 445, textureX, textureY);
		prop[0].addBox(-1F, -37F, -2.5F, 2, 37, 5, 0.0F);
		prop[1].addBox(-1F, -37F, -2.5F, 2, 37, 5, 0.0F);
		prop[2].addBox(-1F, -37F, -2.5F, 2, 37, 5, 0.0F);
		prop[3].addBox(-1F, -37F, -2.5F, 2, 37, 5, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		prop[3].setRotationPoint(i, j, k);
		return prop;
	}

	private void initGuns() {
	}
	{

		// Passenger 3
		ModelRendererTurbo[][] gun_2_Model = new ModelRendererTurbo[3][];

		gun_2_Model[0] = new ModelRendererTurbo[37];
		gun_2_Model[0][0] = new ModelRendererTurbo(this, 621, 517, textureX, textureY); // Import GT_01
		gun_2_Model[0][1] = new ModelRendererTurbo(this, 629, 517, textureX, textureY); // Import GT_02
		gun_2_Model[0][2] = new ModelRendererTurbo(this, 645, 517, textureX, textureY); // Import GT_03
		gun_2_Model[0][3] = new ModelRendererTurbo(this, 661, 517, textureX, textureY); // Import GT_04
		gun_2_Model[0][4] = new ModelRendererTurbo(this, 685, 517, textureX, textureY); // Import GT_05
		gun_2_Model[0][5] = new ModelRendererTurbo(this, 701, 517, textureX, textureY); // Import GT_06
		gun_2_Model[0][6] = new ModelRendererTurbo(this, 733, 517, textureX, textureY); // Import GT_07
		gun_2_Model[0][7] = new ModelRendererTurbo(this, 717, 517, textureX, textureY); // Import GT_08
		gun_2_Model[0][8] = new ModelRendererTurbo(this, 733, 517, textureX, textureY); // Import GT_09
		gun_2_Model[0][9] = new ModelRendererTurbo(this, 749, 517, textureX, textureY); // Import GT_10
		gun_2_Model[0][10] = new ModelRendererTurbo(this, 757, 517, textureX, textureY); // Import GT_11
		gun_2_Model[0][11] = new ModelRendererTurbo(this, 765, 517, textureX, textureY); // Import GT_12
		gun_2_Model[0][12] = new ModelRendererTurbo(this, 773, 517, textureX, textureY); // Import GT_13
		gun_2_Model[0][13] = new ModelRendererTurbo(this, 781, 517, textureX, textureY); // Import GT_14
		gun_2_Model[0][14] = new ModelRendererTurbo(this, 789, 517, textureX, textureY); // Import GT_15
		gun_2_Model[0][15] = new ModelRendererTurbo(this, 797, 517, textureX, textureY); // Import GT_16
		gun_2_Model[0][16] = new ModelRendererTurbo(this, 805, 517, textureX, textureY); // Import GT_17
		gun_2_Model[0][17] = new ModelRendererTurbo(this, 813, 517, textureX, textureY); // Import GT_18
		gun_2_Model[0][18] = new ModelRendererTurbo(this, 821, 517, textureX, textureY); // Import GT_19
		gun_2_Model[0][19] = new ModelRendererTurbo(this, 837, 517, textureX, textureY); // Import GT_20
		gun_2_Model[0][20] = new ModelRendererTurbo(this, 861, 517, textureX, textureY); // Import GT_21
		gun_2_Model[0][21] = new ModelRendererTurbo(this, 885, 517, textureX, textureY); // Import GT_23
		gun_2_Model[0][22] = new ModelRendererTurbo(this, 893, 517, textureX, textureY); // Import GT_24
		gun_2_Model[0][23] = new ModelRendererTurbo(this, 901, 517, textureX, textureY); // Import GT_25
		gun_2_Model[0][24] = new ModelRendererTurbo(this, 917, 517, textureX, textureY); // Import GT_26
		gun_2_Model[0][25] = new ModelRendererTurbo(this, 933, 517, textureX, textureY); // Import GT_27
		gun_2_Model[0][26] = new ModelRendererTurbo(this, 949, 517, textureX, textureY); // Import GT_28
		gun_2_Model[0][27] = new ModelRendererTurbo(this, 965, 517, textureX, textureY); // Import GT_29
		gun_2_Model[0][28] = new ModelRendererTurbo(this, 973, 517, textureX, textureY); // Import GT_30
		gun_2_Model[0][29] = new ModelRendererTurbo(this, 981, 517, textureX, textureY); // Import GT_31
		gun_2_Model[0][30] = new ModelRendererTurbo(this, 989, 517, textureX, textureY); // Import GT_32
		gun_2_Model[0][31] = new ModelRendererTurbo(this, 909, 517, textureX, textureY); // Import GT_35
		gun_2_Model[0][32] = new ModelRendererTurbo(this, 925, 517, textureX, textureY); // Import GT_36
		gun_2_Model[0][33] = new ModelRendererTurbo(this, 997, 517, textureX, textureY); // Import GT_22
		gun_2_Model[0][34] = new ModelRendererTurbo(this, 1037, 517, textureX, textureY); // Import GT_33
		gun_2_Model[0][35] = new ModelRendererTurbo(this, 1077, 517, textureX, textureY); // Import GT_34
		gun_2_Model[0][36] = new ModelRendererTurbo(this, 1109, 517, textureX, textureY); // Import GT_37

		gun_2_Model[0][0].addBox(-4F, -6.5F, -5F, 4, 1, 2, 0F); // Import GT_01

		gun_2_Model[0][1].addBox(-11F, 2.5F, -5F, 2, 1, 10, 0F); // Import GT_02

		gun_2_Model[0][2].addShapeBox(-11F, 2.5F, -10F, 5, 1, 5, 0F,-5F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F); // Import GT_03

		gun_2_Model[0][3].addBox(-6F, 2.5F, -10F, 12, 1, 2, 0F); // Import GT_04

		gun_2_Model[0][4].addShapeBox(6F, 2.5F, -10F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, -5F, -2F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -5F, -2F, 0F, 0F, 0F, 0F, -3F); // Import GT_05

		gun_2_Model[0][5].addBox(9F, 2.5F, -5F, 2, 1, 10, 0F); // Import GT_06

		gun_2_Model[0][6].addBox(-0.5F, -6.5F, -5F, 1, 1, 10, 0F); // Import GT_07

		gun_2_Model[0][7].addBox(-4F, -6.5F, 3F, 4, 1, 2, 0F); // Import GT_08

		gun_2_Model[0][8].addShapeBox(-0.5F, -2.5F, -9F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import GT_09

		gun_2_Model[0][9].addShapeBox(-10F, -2.5F, -5F, 1, 5, 2, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Import GT_10

		gun_2_Model[0][10].addShapeBox(-4F, -6.5F, -5F, 1, 4, 2, 0F,0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0.5F, 0F, -6F, 0.5F, 0F, 6F, 0F, 0F); // Import GT_11

		gun_2_Model[0][11].addShapeBox(3F, -6.5F, -5F, 1, 4, 1, 0F,-1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, -1F, -0.5F, -6F, 0.5F, 0F, 6F, 0F, 0F, 6F, 0F, -0.5F, -6F, 0.5F, -0.5F); // Import GT_12

		gun_2_Model[0][12].addShapeBox(9F, -2.5F, -5F, 1, 5, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, -1F, 0F, -0.5F); // Import GT_13

		gun_2_Model[0][13].addShapeBox(-0.5F, -6.5F, -5F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0.5F, -4F, 0F, 0.5F, -4F); // Import GT_14

		gun_2_Model[0][14].addShapeBox(-4F, -6.5F, 3F, 1, 4, 2, 0F,0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0.5F, 0F, -6F, 0.5F, 0F, 6F, 0F, 0F); // Import GT_15

		gun_2_Model[0][15].addShapeBox(-10F, -2.5F, 3F, 1, 5, 2, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Import GT_16

		gun_2_Model[0][16].addShapeBox(-0.5F, -6.5F, 4F, 1, 4, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -4F, 0F, 0.5F, -4F, 0F, 0F, 4F, 0F, 0F, 4F); // Import GT_17

		gun_2_Model[0][17].addShapeBox(-0.5F, -2.5F, 8F, 1, 5, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Import GT_18

		gun_2_Model[0][18].addShapeBox(-11F, 2.5F, 5F, 5, 1, 5, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -2F, -5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -2F, -5F, 0F, 0F); // Import GT_19

		gun_2_Model[0][19].addBox(-6F, 2.5F, 8F, 12, 1, 2, 0F); // Import GT_20

		gun_2_Model[0][20].addShapeBox(6F, 2.5F, 5F, 5, 1, 5, 0F,0F, 0F, -3F, -2F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F); // Import GT_21

		gun_2_Model[0][21].addShapeBox(3F, -6.5F, -4F, 1, 4, 1, 0F,-1F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, -1F, 0F, -6F, 0.5F, -0.5F, 6F, 0F, -0.5F, 6F, 0F, 0F, -6F, 0.5F, 0F); // Import GT_23

		gun_2_Model[0][22].addShapeBox(9F, -2.5F, -4F, 1, 5, 1, 0F,0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, -1F, 0F, 0F); // Import GT_24

		gun_2_Model[0][23].addShapeBox(0F, -6.5F, -5F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import GT_25

		gun_2_Model[0][24].addShapeBox(0F, -6.5F, -4F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import GT_26

		gun_2_Model[0][25].addShapeBox(0F, -6.5F, 3F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import GT_27

		gun_2_Model[0][26].addShapeBox(0F, -6.5F, 4F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import GT_28

		gun_2_Model[0][27].addShapeBox(3F, -6.5F, 4F, 1, 4, 1, 0F,-1F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, -1F, 0F, -6F, 0.5F, -0.5F, 6F, 0F, -0.5F, 6F, 0F, 0F, -6F, 0.5F, 0F); // Import GT_29

		gun_2_Model[0][28].addShapeBox(3F, -6.5F, 3F, 1, 4, 1, 0F,-1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, -1F, -0.5F, -6F, 0.5F, 0F, 6F, 0F, 0F, 6F, 0F, -0.5F, -6F, 0.5F, -0.5F); // Import GT_30

		gun_2_Model[0][29].addShapeBox(9F, -2.5F, 3F, 1, 5, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, -1F, 0F, -0.5F); // Import GT_31

		gun_2_Model[0][30].addShapeBox(9F, -2.5F, 4F, 1, 5, 1, 0F,0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, -1F, 0F, 0F); // Import GT_32

		gun_2_Model[0][31].addBox(-0.5F, -0.5F, -9F, 1, 1, 4, 0F); // Import GT_35

		gun_2_Model[0][32].addBox(-0.5F, -0.5F, 5F, 1, 1, 4, 0F); // Import GT_36

		gun_2_Model[0][33].addBox(6F, -0.5F, -4.5F, 16, 1, 1, 0F); // Import GT_22

		gun_2_Model[0][34].addBox(6F, -0.5F, 3.5F, 16, 1, 1, 0F); // Import GT_33

		gun_2_Model[0][35].addBox(-4F, -1F, -5F, 10, 2, 2, 0F); // Import GT_34

		gun_2_Model[0][36].addBox(-4F, -1F, 3F, 10, 2, 2, 0F); // Import GT_37

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[0])
		{
			gunPart.setRotationPoint(-64F, -58F, 0F);
		}


		gun_2_Model[1] = new ModelRendererTurbo[0];

		gun_2_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("DorsalGun", gun_2_Model);

		// Passenger 4
		ModelRendererTurbo[][] gun_3_Model = new ModelRendererTurbo[3][];

		gun_3_Model[0] = new ModelRendererTurbo[18];
		gun_3_Model[0][0] = new ModelRendererTurbo(this, 731, 551, textureX, textureY); // Import GB_01
		gun_3_Model[0][1] = new ModelRendererTurbo(this, 755, 551, textureX, textureY); // Import GB_03
		gun_3_Model[0][2] = new ModelRendererTurbo(this, 771, 551, textureX, textureY); // Import GB_04
		gun_3_Model[0][3] = new ModelRendererTurbo(this, 787, 551, textureX, textureY); // Import GB_05
		gun_3_Model[0][4] = new ModelRendererTurbo(this, 795, 551, textureX, textureY); // Import GB_06
		gun_3_Model[0][5] = new ModelRendererTurbo(this, 811, 551, textureX, textureY); // Import GB_07
		gun_3_Model[0][6] = new ModelRendererTurbo(this, 827, 551, textureX, textureY); // Import GB_08
		gun_3_Model[0][7] = new ModelRendererTurbo(this, 835, 551, textureX, textureY); // Import GB_09
		gun_3_Model[0][8] = new ModelRendererTurbo(this, 851, 551, textureX, textureY); // Import GB_13
		gun_3_Model[0][9] = new ModelRendererTurbo(this, 867, 551, textureX, textureY); // Import GB_14
		gun_3_Model[0][10] = new ModelRendererTurbo(this, 883, 551, textureX, textureY); // Import GB_15
		gun_3_Model[0][11] = new ModelRendererTurbo(this, 891, 551, textureX, textureY); // Import GB_16
		gun_3_Model[0][12] = new ModelRendererTurbo(this, 899, 551, textureX, textureY); // Import GB_17
		gun_3_Model[0][13] = new ModelRendererTurbo(this, 915, 551, textureX, textureY); // Import GB_18
		gun_3_Model[0][14] = new ModelRendererTurbo(this, 931, 551, textureX, textureY); // Import GB_02
		gun_3_Model[0][15] = new ModelRendererTurbo(this, 971, 551, textureX, textureY); // Import GB_10
		gun_3_Model[0][16] = new ModelRendererTurbo(this, 987, 551, textureX, textureY); // Import GB_11
		gun_3_Model[0][17] = new ModelRendererTurbo(this, 1003, 551, textureX, textureY); // Import GB_12

		gun_3_Model[0][0].addBox(-3F, -7F, -2F, 4, 14, 4, 0F); // Import GB_01

		gun_3_Model[0][1].addShapeBox(1F, -7F, -2F, 2, 14, 4, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Import GB_03

		gun_3_Model[0][2].addBox(-3F, -7F, 3F, 4, 14, 1, 0F); // Import GB_04

		gun_3_Model[0][3].addShapeBox(1F, -7F, 3F, 2, 14, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Import GB_05

		gun_3_Model[0][4].addShapeBox(-3F, -7F, 4F, 4, 14, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Import GB_06

		gun_3_Model[0][5].addShapeBox(1F, -7F, 4F, 2, 14, 2, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, -2F, 0F); // Import GB_07

		gun_3_Model[0][6].addShapeBox(0.5F, -6.5F, 2F, 2, 13, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Import GB_08

		gun_3_Model[0][7].addBox(-3.5F, -6.5F, 2F, 4, 13, 1, 0F); // Import GB_09

		gun_3_Model[0][8].addShapeBox(1F, -7F, -6F, 2, 14, 2, 0F,0F, -2F, 0F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F); // Import GB_13

		gun_3_Model[0][9].addShapeBox(-3F, -7F, -6F, 4, 14, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import GB_14

		gun_3_Model[0][10].addShapeBox(1F, -7F, -4F, 2, 14, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Import GB_15

		gun_3_Model[0][11].addShapeBox(0.5F, -6.5F, -3F, 2, 13, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Import GB_16

		gun_3_Model[0][12].addBox(-3.5F, -6.5F, -3F, 4, 13, 1, 0F); // Import GB_17

		gun_3_Model[0][13].addBox(-3F, -7F, -4F, 4, 14, 1, 0F); // Import GB_18

		gun_3_Model[0][14].addBox(0F, -0.5F, 2F, 17, 1, 1, 0F); // Import GB_02

		gun_3_Model[0][15].addShapeBox(13F, -0.5F, 2F, 5, 1, 1, 0F,0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F); // Import GB_10

		gun_3_Model[0][16].addShapeBox(13F, -0.5F, -3F, 5, 1, 1, 0F,0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F); // Import GB_11

		gun_3_Model[0][17].addBox(0F, -0.5F, -3F, 17, 1, 1, 0F); // Import GB_12

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_3_Model[0])
		{
			gunPart.setRotationPoint(287F, -38F, 0F);
		}


		gun_3_Model[1] = new ModelRendererTurbo[0];

		gun_3_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("TailGun", gun_3_Model);

		// Passenger 5
		ModelRendererTurbo[][] gun_4_Model = new ModelRendererTurbo[3][];

		gun_4_Model[0] = new ModelRendererTurbo[33];
		gun_4_Model[0][0] = new ModelRendererTurbo(this, 1172, 514, textureX, textureY); // Import GD_01
		gun_4_Model[0][1] = new ModelRendererTurbo(this, 1228, 514, textureX, textureY); // Import GD_02
		gun_4_Model[0][2] = new ModelRendererTurbo(this, 1260, 514, textureX, textureY); // Import GD_03
		gun_4_Model[0][3] = new ModelRendererTurbo(this, 1292, 514, textureX, textureY); // Import GD_04
		gun_4_Model[0][4] = new ModelRendererTurbo(this, 1172, 514, textureX, textureY); // Import GD_05
		gun_4_Model[0][5] = new ModelRendererTurbo(this, 1324, 514, textureX, textureY); // Import GD_06
		gun_4_Model[0][6] = new ModelRendererTurbo(this, 1212, 514, textureX, textureY); // Import GD_07
		gun_4_Model[0][7] = new ModelRendererTurbo(this, 1244, 514, textureX, textureY); // Import GD_08
		gun_4_Model[0][8] = new ModelRendererTurbo(this, 1356, 514, textureX, textureY); // Import GD_09
		gun_4_Model[0][9] = new ModelRendererTurbo(this, 1252, 514, textureX, textureY); // Import GD_10
		gun_4_Model[0][10] = new ModelRendererTurbo(this, 1260, 514, textureX, textureY); // Import GD_11
		gun_4_Model[0][11] = new ModelRendererTurbo(this, 1388, 514, textureX, textureY); // Import GD_12
		gun_4_Model[0][12] = new ModelRendererTurbo(this, 1404, 514, textureX, textureY); // Import GD_13
		gun_4_Model[0][13] = new ModelRendererTurbo(this, 1276, 514, textureX, textureY); // Import GD_16
		gun_4_Model[0][14] = new ModelRendererTurbo(this, 1420, 514, textureX, textureY); // Import GD_17
		gun_4_Model[0][15] = new ModelRendererTurbo(this, 1308, 514, textureX, textureY); // Import GD_18
		gun_4_Model[0][16] = new ModelRendererTurbo(this, 1452, 514, textureX, textureY); // Import GD_19
		gun_4_Model[0][17] = new ModelRendererTurbo(this, 1356, 514, textureX, textureY); // Import GD_20
		gun_4_Model[0][18] = new ModelRendererTurbo(this, 1372, 514, textureX, textureY); // Import GD_21
		gun_4_Model[0][19] = new ModelRendererTurbo(this, 1420, 514, textureX, textureY); // Import GD_22
		gun_4_Model[0][20] = new ModelRendererTurbo(this, 1436, 514, textureX, textureY); // Import GD_23
		gun_4_Model[0][21] = new ModelRendererTurbo(this, 1468, 514, textureX, textureY); // Import GD_24
		gun_4_Model[0][22] = new ModelRendererTurbo(this, 1484, 514, textureX, textureY); // Import GD_25
		gun_4_Model[0][23] = new ModelRendererTurbo(this, 1516, 514, textureX, textureY); // Import GD_26
		gun_4_Model[0][24] = new ModelRendererTurbo(this, 1532, 514, textureX, textureY); // Import GD_29
		gun_4_Model[0][25] = new ModelRendererTurbo(this, 1548, 514, textureX, textureY); // Import GD_30
		gun_4_Model[0][26] = new ModelRendererTurbo(this, 1580, 514, textureX, textureY); // Import GD_31
		gun_4_Model[0][27] = new ModelRendererTurbo(this, 1596, 514, textureX, textureY); // Import GD_32
		gun_4_Model[0][28] = new ModelRendererTurbo(this, 1612, 514, textureX, textureY); // Import GD_33
		gun_4_Model[0][29] = new ModelRendererTurbo(this, 1628, 514, textureX, textureY); // Import GD_14
		gun_4_Model[0][30] = new ModelRendererTurbo(this, 1652, 514, textureX, textureY); // Import GD_15
		gun_4_Model[0][31] = new ModelRendererTurbo(this, 1676, 514, textureX, textureY); // Import GD_27
		gun_4_Model[0][32] = new ModelRendererTurbo(this, 1700, 514, textureX, textureY); // Import GD_28

		gun_4_Model[0][0].addBox(-6F, 11F, -6F, 12, 1, 12, 0F); // Import GD_01

		gun_4_Model[0][1].addBox(-10F, -6F, -6F, 1, 14, 12, 0F); // Import GD_02

		gun_4_Model[0][2].addBox(9F, 7F, -6F, 1, 1, 12, 0F); // Import GD_03

		gun_4_Model[0][3].addShapeBox(-10F, 8F, -6F, 1, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F); // Import GD_04

		gun_4_Model[0][4].addShapeBox(9F, 8F, -6F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F); // Import GD_05

		gun_4_Model[0][5].addBox(-6F, -6F, -10F, 12, 14, 1, 0F); // Import GD_06

		gun_4_Model[0][6].addShapeBox(-6F, 8F, -10F, 12, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F); // Import GD_07

		gun_4_Model[0][7].addShapeBox(9F, 8F, 5F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F); // Import GD_08

		gun_4_Model[0][8].addBox(9F, -6F, -6F, 1, 3, 12, 0F); // Import GD_09

		gun_4_Model[0][9].addBox(9F, -3F, -6F, 1, 10, 1, 0F); // Import GD_10

		gun_4_Model[0][10].addBox(-2F, -3F, -10.5F, 4, 4, 1, 0F); // Import GD_11

		gun_4_Model[0][11].addShapeBox(-10F, -6F, -10F, 1, 8, 4, 0F,-4F, 0F, 0F, 3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import GD_12

		gun_4_Model[0][12].addShapeBox(9F, -6F, -10F, 1, 8, 4, 0F,3F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import GD_13

		gun_4_Model[0][13].addShapeBox(-6F, -10F, -10F, 12, 4, 1, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import GD_16

		gun_4_Model[0][14].addShapeBox(-10F, -10F, -6F, 1, 4, 12, 0F,-4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import GD_17

		gun_4_Model[0][15].addShapeBox(-10F, 8F, -10F, 1, 4, 4, 0F,-4F, 0F, 0F, 3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -4F, 3F, -1F, -4F, 3F, -1F, 0F, -4F, 0F, 0F); // Import GD_18

		gun_4_Model[0][16].addShapeBox(9F, -10F, -6F, 1, 4, 12, 0F,4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import GD_19

		gun_4_Model[0][17].addShapeBox(-10F, -10F, -10F, 1, 4, 4, 0F,-4F, 0F, -4F, 3F, -1F, -4F, 3F, -1F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import GD_20

		gun_4_Model[0][18].addShapeBox(6F, -10F, -10F, 4, 4, 1, 0F,0F, 0F, -4F, -4F, 0F, -4F, -4F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, -4F, -1F, 0F, 3F, 0F, 0F, 0F); // Import GD_21

		gun_4_Model[0][19].addShapeBox(-10F, 8F, 6F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, -1F, -4F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F, 3F, -1F, -4F, -4F, 0F, -4F); // Import GD_22

		gun_4_Model[0][20].addShapeBox(-6F, 8F, 9F, 12, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F); // Import GD_23

		gun_4_Model[0][21].addBox(9F, -3F, 5F, 1, 10, 1, 0F); // Import GD_24

		gun_4_Model[0][22].addBox(-6F, -6F, 9F, 12, 14, 1, 0F); // Import GD_25

		gun_4_Model[0][23].addShapeBox(-10F, -6F, 6F, 1, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, -1F, -4F, 0F, 0F); // Import GD_26

		gun_4_Model[0][24].addShapeBox(6F, -10F, 9F, 4, 4, 1, 0F,0F, -1F, 3F, -4F, -1F, 3F, -4F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -1F, 0F, 3F, 0F, 0F, -4F, 0F, 0F, 0F); // Import GD_29

		gun_4_Model[0][25].addShapeBox(-6F, -10F, 9F, 12, 4, 1, 0F,0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import GD_30

		gun_4_Model[0][26].addShapeBox(-10F, -10F, 6F, 1, 4, 4, 0F,-4F, 0F, 0F, 3F, -1F, 0F, 3F, -1F, -4F, -4F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, -1F, -4F, 0F, 0F); // Import GD_31

		gun_4_Model[0][27].addShapeBox(9F, -6F, 6F, 1, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 3F, 0F, -1F); // Import GD_32

		gun_4_Model[0][28].addBox(-2F, -3F, 9.5F, 4, 4, 1, 0F); // Import GD_33

		gun_4_Model[0][29].addBox(0F, -1F, -9F, 9, 2, 2, 0F); // Import GD_14

		gun_4_Model[0][30].addBox(9F, -0.5F, -8.5F, 10, 1, 1, 0F); // Import GD_15

		gun_4_Model[0][31].addBox(0F, -1F, 7F, 9, 2, 2, 0F); // Import GD_27

		gun_4_Model[0][32].addBox(9F, -0.5F, 7.5F, 10, 1, 1, 0F); // Import GD_28

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_4_Model[0])
		{
			gunPart.setRotationPoint(83F, -3F, 0F);
		}


		gun_4_Model[1] = new ModelRendererTurbo[0];

		gun_4_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("VentralGun", gun_4_Model);

		// Passenger 6
		ModelRendererTurbo[][] gun_5_Model = new ModelRendererTurbo[3][];

		gun_5_Model[0] = new ModelRendererTurbo[0];

		gun_5_Model[1] = new ModelRendererTurbo[84];
		gun_5_Model[1][0] = new ModelRendererTurbo(this, 1293, 549, textureX, textureY); // Box 88
		gun_5_Model[1][1] = new ModelRendererTurbo(this, 1317, 549, textureX, textureY); // Box 89
		gun_5_Model[1][2] = new ModelRendererTurbo(this, 1341, 549, textureX, textureY); // Box 90
		gun_5_Model[1][3] = new ModelRendererTurbo(this, 1293, 549, textureX, textureY); // Box 97
		gun_5_Model[1][4] = new ModelRendererTurbo(this, 1309, 549, textureX, textureY); // Box 101
		gun_5_Model[1][5] = new ModelRendererTurbo(this, 1357, 549, textureX, textureY); // Box 102
		gun_5_Model[1][6] = new ModelRendererTurbo(this, 1381, 549, textureX, textureY); // Box 103
		gun_5_Model[1][7] = new ModelRendererTurbo(this, 1317, 549, textureX, textureY); // Box 105
		gun_5_Model[1][8] = new ModelRendererTurbo(this, 1365, 557, textureX, textureY); // Box 109
		gun_5_Model[1][9] = new ModelRendererTurbo(this, 1389, 557, textureX, textureY); // Box 110
		gun_5_Model[1][10] = new ModelRendererTurbo(this, 1293, 565, textureX, textureY); // Box 111
		gun_5_Model[1][11] = new ModelRendererTurbo(this, 1333, 549, textureX, textureY); // Box 112
		gun_5_Model[1][12] = new ModelRendererTurbo(this, 1317, 565, textureX, textureY); // Box 88
		gun_5_Model[1][13] = new ModelRendererTurbo(this, 1341, 565, textureX, textureY); // Box 3
		gun_5_Model[1][14] = new ModelRendererTurbo(this, 1373, 565, textureX, textureY); // Box 4
		gun_5_Model[1][15] = new ModelRendererTurbo(this, 1397, 565, textureX, textureY); // Box 5
		gun_5_Model[1][16] = new ModelRendererTurbo(this, 1341, 549, textureX, textureY); // Box 7
		gun_5_Model[1][17] = new ModelRendererTurbo(this, 1293, 573, textureX, textureY); // Box 339
		gun_5_Model[1][18] = new ModelRendererTurbo(this, 1317, 573, textureX, textureY); // Box 340
		gun_5_Model[1][19] = new ModelRendererTurbo(this, 1349, 573, textureX, textureY); // Box 341
		gun_5_Model[1][20] = new ModelRendererTurbo(this, 1373, 573, textureX, textureY); // Box 342
		gun_5_Model[1][21] = new ModelRendererTurbo(this, 1405, 549, textureX, textureY); // Box 344
		gun_5_Model[1][22] = new ModelRendererTurbo(this, 1413, 549, textureX, textureY); // Box 359
		gun_5_Model[1][23] = new ModelRendererTurbo(this, 1413, 557, textureX, textureY); // Box 362
		gun_5_Model[1][24] = new ModelRendererTurbo(this, 1389, 573, textureX, textureY); // Box 156
		gun_5_Model[1][25] = new ModelRendererTurbo(this, 1293, 581, textureX, textureY); // Box 158
		gun_5_Model[1][26] = new ModelRendererTurbo(this, 1413, 573, textureX, textureY); // Box 159
		gun_5_Model[1][27] = new ModelRendererTurbo(this, 1309, 581, textureX, textureY); // Box 160
		gun_5_Model[1][28] = new ModelRendererTurbo(this, 1309, 581, textureX, textureY); // Box 166
		gun_5_Model[1][29] = new ModelRendererTurbo(this, 1341, 581, textureX, textureY); // Box 172
		gun_5_Model[1][30] = new ModelRendererTurbo(this, 1365, 581, textureX, textureY); // Box 174
		gun_5_Model[1][31] = new ModelRendererTurbo(this, 1333, 581, textureX, textureY); // Box 175
		gun_5_Model[1][32] = new ModelRendererTurbo(this, 1341, 581, textureX, textureY); // Box 176
		gun_5_Model[1][33] = new ModelRendererTurbo(this, 1365, 589, textureX, textureY); // Box 182
		gun_5_Model[1][34] = new ModelRendererTurbo(this, 1293, 589, textureX, textureY); // Box 186
		gun_5_Model[1][35] = new ModelRendererTurbo(this, 1381, 581, textureX, textureY); // Box 187
		gun_5_Model[1][36] = new ModelRendererTurbo(this, 1301, 589, textureX, textureY); // Box 189
		gun_5_Model[1][37] = new ModelRendererTurbo(this, 1389, 589, textureX, textureY); // Box 190
		gun_5_Model[1][38] = new ModelRendererTurbo(this, 1397, 589, textureX, textureY); // Box 669
		gun_5_Model[1][39] = new ModelRendererTurbo(this, 1293, 597, textureX, textureY); // Box 670
		gun_5_Model[1][40] = new ModelRendererTurbo(this, 1309, 597, textureX, textureY); // Box 132
		gun_5_Model[1][41] = new ModelRendererTurbo(this, 1333, 597, textureX, textureY); // Box 677
		gun_5_Model[1][42] = new ModelRendererTurbo(this, 1397, 597, textureX, textureY); // Box 686
		gun_5_Model[1][43] = new ModelRendererTurbo(this, 1349, 597, textureX, textureY); // Box 688
		gun_5_Model[1][44] = new ModelRendererTurbo(this, 1317, 605, textureX, textureY); // Box 690
		gun_5_Model[1][45] = new ModelRendererTurbo(this, 1333, 605, textureX, textureY); // Box 692
		gun_5_Model[1][46] = new ModelRendererTurbo(this, 1373, 605, textureX, textureY); // Box 693
		gun_5_Model[1][47] = new ModelRendererTurbo(this, 1389, 605, textureX, textureY); // Box 694
		gun_5_Model[1][48] = new ModelRendererTurbo(this, 1397, 605, textureX, textureY); // Box 118
		gun_5_Model[1][49] = new ModelRendererTurbo(this, 1293, 613, textureX, textureY); // Box 119
		gun_5_Model[1][50] = new ModelRendererTurbo(this, 1309, 613, textureX, textureY); // Box 125
		gun_5_Model[1][51] = new ModelRendererTurbo(this, 1357, 613, textureX, textureY); // Box 126
		gun_5_Model[1][52] = new ModelRendererTurbo(this, 1317, 621, textureX, textureY); // Box 130
		gun_5_Model[1][53] = new ModelRendererTurbo(this, 1341, 621, textureX, textureY); // Box 131
		gun_5_Model[1][54] = new ModelRendererTurbo(this, 1365, 621, textureX, textureY); // Box 132
		gun_5_Model[1][55] = new ModelRendererTurbo(this, 1389, 621, textureX, textureY); // Box 145
		gun_5_Model[1][56] = new ModelRendererTurbo(this, 1293, 629, textureX, textureY); // Box 146
		gun_5_Model[1][57] = new ModelRendererTurbo(this, 1317, 629, textureX, textureY); // Box 150
		gun_5_Model[1][58] = new ModelRendererTurbo(this, 1357, 629, textureX, textureY); // Box 161
		gun_5_Model[1][59] = new ModelRendererTurbo(this, 1381, 629, textureX, textureY); // Box 162
		gun_5_Model[1][60] = new ModelRendererTurbo(this, 1397, 637, textureX, textureY); // Box 163
		gun_5_Model[1][61] = new ModelRendererTurbo(this, 1293, 597, textureX, textureY); // Box 164
		gun_5_Model[1][62] = new ModelRendererTurbo(this, 1293, 645, textureX, textureY); // Box 165
		gun_5_Model[1][63] = new ModelRendererTurbo(this, 1317, 645, textureX, textureY); // Box 166
		gun_5_Model[1][64] = new ModelRendererTurbo(this, 1341, 645, textureX, textureY); // Box 167
		gun_5_Model[1][65] = new ModelRendererTurbo(this, 1413, 605, textureX, textureY); // Box 168
		gun_5_Model[1][66] = new ModelRendererTurbo(this, 1293, 613, textureX, textureY); // Box 169
		gun_5_Model[1][67] = new ModelRendererTurbo(this, 1381, 613, textureX, textureY); // Box 170
		gun_5_Model[1][68] = new ModelRendererTurbo(this, 1309, 629, textureX, textureY); // Box 171
		gun_5_Model[1][69] = new ModelRendererTurbo(this, 1405, 621, textureX, textureY); // Box 172
		gun_5_Model[1][70] = new ModelRendererTurbo(this, 1349, 629, textureX, textureY); // Box 175
		gun_5_Model[1][71] = new ModelRendererTurbo(this, 1309, 637, textureX, textureY); // Box 176
		gun_5_Model[1][72] = new ModelRendererTurbo(this, 1373, 637, textureX, textureY); // Box 177
		gun_5_Model[1][73] = new ModelRendererTurbo(this, 1373, 629, textureX, textureY); // Box 178
		gun_5_Model[1][74] = new ModelRendererTurbo(this, 1333, 645, textureX, textureY); // Box 179
		gun_5_Model[1][75] = new ModelRendererTurbo(this, 1365, 645, textureX, textureY); // Box 180
		gun_5_Model[1][76] = new ModelRendererTurbo(this, 1357, 645, textureX, textureY); // Box 181
		gun_5_Model[1][77] = new ModelRendererTurbo(this, 1381, 653, textureX, textureY); // Box 183
		gun_5_Model[1][78] = new ModelRendererTurbo(this, 1397, 653, textureX, textureY); // Box 184
		gun_5_Model[1][79] = new ModelRendererTurbo(this, 1293, 661, textureX, textureY); // Box 185
		gun_5_Model[1][80] = new ModelRendererTurbo(this, 1309, 661, textureX, textureY); // Box 186
		gun_5_Model[1][81] = new ModelRendererTurbo(this, 1325, 661, textureX, textureY); // Box 187
		gun_5_Model[1][82] = new ModelRendererTurbo(this, 1341, 661, textureX, textureY); // Box 188
		gun_5_Model[1][83] = new ModelRendererTurbo(this, 1357, 661, textureX, textureY); // Box 189

		gun_5_Model[1][0].addShapeBox(-12F, -3F, -4F, 1, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88

		gun_5_Model[1][1].addShapeBox(-12F, -7F, -4F, 1, 4, 8, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89

		gun_5_Model[1][2].addShapeBox(-10F, -10F, -4F, 1, 3, 8, 0F,-3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90

		gun_5_Model[1][3].addShapeBox(3F, -3F, -12F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97

		gun_5_Model[1][4].addShapeBox(-4F, -3F, -12F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101

		gun_5_Model[1][5].addShapeBox(-4F, -7F, -12F, 8, 4, 1, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102

		gun_5_Model[1][6].addShapeBox(-4F, -10F, -10F, 8, 3, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103

		gun_5_Model[1][7].addShapeBox(3F, -3F, 11F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105

		gun_5_Model[1][8].addShapeBox(-4F, -11F, 6F, 8, 1, 1, 0F,0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109

		gun_5_Model[1][9].addShapeBox(-4F, -10F, 9F, 8, 3, 1, 0F,0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110

		gun_5_Model[1][10].addShapeBox(-4F, -7F, 11F, 8, 4, 1, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111

		gun_5_Model[1][11].addShapeBox(-4F, -3F, 11F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112

		gun_5_Model[1][12].addShapeBox(8.5F, -0.350000000000001F, -7.3F, 10, 1, 1, 0F,0F, -0.35F, -0.25F, 0F, -0.35F, -0.25F, 0F, -0.35F, -0.25F, 0F, -0.35F, -0.252F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 88

		gun_5_Model[1][13].addShapeBox(-2.5F, -1.25F, -8.3F, 11, 4, 3, 0F,-0.5F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, -0.5F, -1F, -0.75F, -0.5F, -0.8F, -0.75F, 0F, -0.8F, -0.75F, 0F, -0.8F, -0.75F, -0.5F, -0.8F, -0.75F); // Box 3

		gun_5_Model[1][14].addShapeBox(8.5F, 0.35F, -7.3F, 10, 1, 1, 0F,0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -0.25F, 0F, -0.35F, -0.25F, 0F, -0.35F, -0.25F, 0F, -0.35F, -0.25F); // Box 4

		gun_5_Model[1][15].addShapeBox(8.5F, 0F, -7.3F, 10, 1, 1, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 5

		gun_5_Model[1][16].addShapeBox(18.5F, 0F, -7.3F, 1, 1, 1, 0F,0F, -0.15F, -0.15F, -0.7F, -0.15F, -0.15F, -0.7F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, -0.7F, -0.15F, -0.15F, -0.7F, -0.15F, -0.15F, 0F, -0.15F, -0.15F); // Box 7

		gun_5_Model[1][17].addShapeBox(8.5F, -0.350000000000001F, 6.3F, 10, 1, 1, 0F,0F, -0.35F, -0.25F, 0F, -0.35F, -0.25F, 0F, -0.35F, -0.25F, 0F, -0.35F, -0.252F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 339

		gun_5_Model[1][18].addShapeBox(-2.5F, -1.25F, 5.3F, 11, 4, 3, 0F,-0.5F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, -0.5F, -1F, -0.75F, -0.5F, -0.8F, -0.75F, 0F, -0.8F, -0.75F, 0F, -0.8F, -0.75F, -0.5F, -0.8F, -0.75F); // Box 340

		gun_5_Model[1][19].addShapeBox(8.5F, 0.35F, 6.3F, 10, 1, 1, 0F,0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -0.25F, 0F, -0.35F, -0.25F, 0F, -0.35F, -0.25F, 0F, -0.35F, -0.25F); // Box 341

		gun_5_Model[1][20].addShapeBox(8.5F, 0F, 6.3F, 10, 1, 1, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 342

		gun_5_Model[1][21].addShapeBox(18.5F, 0F, 6.3F, 1, 1, 1, 0F,0F, -0.15F, -0.15F, -0.7F, -0.15F, -0.15F, -0.7F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, -0.7F, -0.15F, -0.15F, -0.7F, -0.15F, -0.15F, 0F, -0.15F, -0.15F); // Box 344

		gun_5_Model[1][22].addShapeBox(-3.5F, 1.3F, 6.3F, 2, 1, 1, 0F,0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F); // Box 359

		gun_5_Model[1][23].addShapeBox(-3.5F, 1.3F, -7.3F, 2, 1, 1, 0F,0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F); // Box 362

		gun_5_Model[1][24].addShapeBox(1.5F, -1.45F, -10.3F, 7, 2, 7, 0F,0F, -1F, -2.8F, 0F, -1F, -2.8F, 0F, -1F, -2.8F, 0F, -1F, -2.8F, 0F, -0.8F, -2.8F, 0F, -0.8F, -2.8F, 0F, -0.8F, -2.8F, 0F, -0.8F, -2.8F); // Box 156

		gun_5_Model[1][25].addShapeBox(-2F, -1.45F, -8.3F, 6, 2, 3, 0F,0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.75F, 0F, -0.8F, -0.75F, 0F, -0.8F, -0.75F, 0F, -0.8F, -0.75F); // Box 158

		gun_5_Model[1][26].addShapeBox(7.4F, -0.7F, -7.3F, 1, 1, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 159

		gun_5_Model[1][27].addShapeBox(7.4F, -1.2F, -7.3F, 1, 1, 1, 0F,-0.38F, -0.44F, -0.38F, -0.38F, -0.44F, -0.38F, -0.38F, -0.44F, -0.38F, -0.38F, -0.44F, -0.38F, -0.38F, -0.44F, -0.38F, -0.38F, -0.44F, -0.38F, -0.38F, -0.44F, -0.38F, -0.38F, -0.44F, -0.38F); // Box 160

		gun_5_Model[1][28].addShapeBox(0F, -1.45F, -10.3F, 7, 2, 7, 0F,0.65F, -0.95F, -3F, 0.65F, -0.95F, -3F, 0.65F, -0.95F, -3F, 0.65F, -0.95F, -3F, 0.65F, -0.95F, -3F, 0.65F, -0.95F, -3F, 0.65F, -0.95F, -3F, 0.65F, -0.95F, -3F); // Box 166

		gun_5_Model[1][29].addShapeBox(1.5F, -1.45F, 3.3F, 7, 2, 7, 0F,0F, -1F, -2.8F, 0F, -1F, -2.8F, 0F, -1F, -2.8F, 0F, -1F, -2.8F, 0F, -0.8F, -2.8F, 0F, -0.8F, -2.8F, 0F, -0.8F, -2.8F, 0F, -0.8F, -2.8F); // Box 172

		gun_5_Model[1][30].addShapeBox(-2F, -1.45F, 5.3F, 6, 2, 3, 0F,0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.75F, 0F, -0.8F, -0.75F, 0F, -0.8F, -0.75F, 0F, -0.8F, -0.75F); // Box 174

		gun_5_Model[1][31].addShapeBox(7.4F, -0.7F, 6.3F, 1, 1, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 175

		gun_5_Model[1][32].addShapeBox(7.4F, -1.2F, 6.3F, 1, 1, 1, 0F,-0.38F, -0.44F, -0.38F, -0.38F, -0.44F, -0.38F, -0.38F, -0.44F, -0.38F, -0.38F, -0.44F, -0.38F, -0.38F, -0.44F, -0.38F, -0.38F, -0.44F, -0.38F, -0.38F, -0.44F, -0.38F, -0.38F, -0.44F, -0.38F); // Box 176

		gun_5_Model[1][33].addShapeBox(0F, -1.45F, 3.3F, 7, 2, 7, 0F,0.65F, -0.95F, -3F, 0.65F, -0.95F, -3F, 0.65F, -0.95F, -3F, 0.65F, -0.95F, -3F, 0.65F, -0.95F, -3F, 0.65F, -0.95F, -3F, 0.65F, -0.95F, -3F, 0.65F, -0.95F, -3F); // Box 182

		gun_5_Model[1][34].addShapeBox(-4F, -2F, 6.3F, 1, 5, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 186

		gun_5_Model[1][35].addShapeBox(-3.5F, -1F, 6.3F, 2, 1, 1, 0F,0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F); // Box 187

		gun_5_Model[1][36].addShapeBox(-3.5F, -1F, -7.3F, 2, 1, 1, 0F,0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F); // Box 189

		gun_5_Model[1][37].addShapeBox(-4F, -2F, -7.3F, 1, 5, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 190

		gun_5_Model[1][38].addShapeBox(-4F, -11F, -7F, 8, 1, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 669

		gun_5_Model[1][39].addShapeBox(-7F, -11F, -4F, 1, 1, 8, 0F,-3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 670

		gun_5_Model[1][40].addShapeBox(-4F, -11F, -4F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, 0F); // Box 132

		gun_5_Model[1][41].addShapeBox(-4F, -11F, 3F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, 0F); // Box 677

		gun_5_Model[1][42].addShapeBox(-12F, -3F, -12F, 8, 6, 1, 0F,0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 7F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 7F); // Box 686

		gun_5_Model[1][43].addShapeBox(-12F, -3F, 4F, 1, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, -1F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, -1F, -8F, 0F, 0F); // Box 688

		gun_5_Model[1][44].addShapeBox(4F, -3F, 11F, 8, 6, 1, 0F,0F, 0F, 0F, -1F, 0F, 7F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 7F, 0F, 0F, -8F, 0F, 0F, 0F); // Box 690

		gun_5_Model[1][45].addShapeBox(11F, -3F, -12F, 1, 6, 8, 0F,7F, 0F, -1F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, -1F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 692

		gun_5_Model[1][46].addShapeBox(-3F, -3F, -13F, 6, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 693

		gun_5_Model[1][47].addShapeBox(-3F, -3F, 12F, 6, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 694

		gun_5_Model[1][48].addShapeBox(-12F, 3F, -4F, 1, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 118

		gun_5_Model[1][49].addShapeBox(-10F, 7F, -4F, 1, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F); // Box 119

		gun_5_Model[1][50].addShapeBox(-4F, 3F, -12F, 8, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 125

		gun_5_Model[1][51].addShapeBox(-4F, 7F, -10F, 8, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 126

		gun_5_Model[1][52].addShapeBox(-4F, 10F, 6F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 130

		gun_5_Model[1][53].addShapeBox(-4F, 7F, 9F, 8, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 131

		gun_5_Model[1][54].addShapeBox(-4F, 3F, 11F, 8, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 132

		gun_5_Model[1][55].addShapeBox(-4F, 10F, -7F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 145

		gun_5_Model[1][56].addShapeBox(-7F, 10F, -4F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F); // Box 146

		gun_5_Model[1][57].addShapeBox(-4F, 10F, -4F, 8, 1, 8, 0F,0F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150

		gun_5_Model[1][58].addShapeBox(9F, 7F, -4F, 1, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F); // Box 161

		gun_5_Model[1][59].addShapeBox(6F, 10F, -4F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F); // Box 162

		gun_5_Model[1][60].addShapeBox(11F, 4F, -4F, 1, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 163

		gun_5_Model[1][61].addShapeBox(11F, -3F, -4F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 164

		gun_5_Model[1][62].addShapeBox(9F, -10F, -4F, 1, 3, 8, 0F,3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165

		gun_5_Model[1][63].addShapeBox(6F, -11F, -4F, 1, 1, 8, 0F,3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166

		gun_5_Model[1][64].addShapeBox(11F, -7F, -4F, 1, 4, 8, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167

		gun_5_Model[1][65].addShapeBox(11F, 2F, -4F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168

		gun_5_Model[1][66].addShapeBox(11F, 2F, 2F, 1, 2, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169

		gun_5_Model[1][67].addShapeBox(11F, -3F, 2F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170

		gun_5_Model[1][68].addShapeBox(-9F, 7F, 9F, 5, 3, 1, 0F,0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -6F, -3F, 0F, 5F, 0F, 0F, 3F, 0F, 0F, -3F, -2F, 0F, -6F); // Box 171

		gun_5_Model[1][69].addShapeBox(9F, 7F, 4F, 1, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 1F, 5F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -6F, 0F, -2F, 5F, 0F, -3F); // Box 172

		gun_5_Model[1][70].addShapeBox(-9F, 7F, -10F, 5, 3, 1, 0F,1F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, -2F, 0F, -6F, 0F, 0F, -3F, 0F, 0F, 3F, -3F, 0F, 5F); // Box 175

		gun_5_Model[1][71].addShapeBox(9F, 7F, -9F, 1, 3, 5, 0F,5F, 0F, 0F, -6F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, -3F, -6F, 0F, -2F, -3F, 0F, 0F, 3F, 0F, 0F); // Box 176

		gun_5_Model[1][72].addShapeBox(9F, -10F, 4F, 1, 3, 5, 0F,3F, 0F, 0F, -3F, 0F, 0F, -6F, 0F, -2F, 5F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 1F, 5F, 0F, 0F); // Box 177

		gun_5_Model[1][73].addShapeBox(-9F, -10F, 9F, 5, 3, 1, 0F,-3F, 0F, 5F, 0F, 0F, 3F, 0F, 0F, -3F, -2F, 0F, -6F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -6F); // Box 178

		gun_5_Model[1][74].addShapeBox(-9F, -10F, -10F, 5, 3, 1, 0F,-2F, 0F, -6F, 0F, 0F, -3F, 0F, 0F, 3F, -3F, 0F, 5F, 1F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F); // Box 179

		gun_5_Model[1][75].addShapeBox(9F, -10F, -9F, 1, 3, 5, 0F,5F, 0F, -3F, -6F, 0F, -2F, -3F, 0F, 0F, 3F, 0F, 0F, 5F, 0F, 0F, -6F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180

		gun_5_Model[1][76].addShapeBox(-7F, -11F, 4F, 3, 1, 3, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 181

		gun_5_Model[1][77].addShapeBox(4F, -11F, 4F, 3, 1, 3, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 183

		gun_5_Model[1][78].addShapeBox(4F, -11F, -7F, 3, 1, 3, 0F,0F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184

		gun_5_Model[1][79].addShapeBox(-7F, -11F, -7F, 3, 1, 3, 0F,-3F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185

		gun_5_Model[1][80].addShapeBox(4F, 10F, -7F, 3, 1, 3, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 186

		gun_5_Model[1][81].addShapeBox(-7F, 10F, -7F, 3, 1, 3, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 187

		gun_5_Model[1][82].addShapeBox(-7F, 10F, 4F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F); // Box 188

		gun_5_Model[1][83].addShapeBox(4F, 10F, 4F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -3F, 0F, 0F, -3F); // Box 189

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_5_Model[1])
		{
			gunPart.setRotationPoint(-161F, -25F, 0F);
		}


		gun_5_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("NoseGun", gun_5_Model);

		// Passenger 7
		ModelRendererTurbo[][] gun_6_Model = new ModelRendererTurbo[3][];

		gun_6_Model[0] = new ModelRendererTurbo[35];
		gun_6_Model[0][0] = new ModelRendererTurbo(this, 381, 481, textureX, textureY); // Box 0
		gun_6_Model[0][1] = new ModelRendererTurbo(this, 413, 481, textureX, textureY); // Box 1
		gun_6_Model[0][2] = new ModelRendererTurbo(this, 445, 481, textureX, textureY); // Box 2
		gun_6_Model[0][3] = new ModelRendererTurbo(this, 485, 481, textureX, textureY); // Box 3
		gun_6_Model[0][4] = new ModelRendererTurbo(this, 381, 489, textureX, textureY); // Box 4
		gun_6_Model[0][5] = new ModelRendererTurbo(this, 501, 481, textureX, textureY); // Box 5
		gun_6_Model[0][6] = new ModelRendererTurbo(this, 397, 489, textureX, textureY); // Box 6
		gun_6_Model[0][7] = new ModelRendererTurbo(this, 405, 489, textureX, textureY); // Box 7
		gun_6_Model[0][8] = new ModelRendererTurbo(this, 413, 489, textureX, textureY); // Box 8
		gun_6_Model[0][9] = new ModelRendererTurbo(this, 421, 489, textureX, textureY); // Box 9
		gun_6_Model[0][10] = new ModelRendererTurbo(this, 429, 489, textureX, textureY); // Box 10
		gun_6_Model[0][11] = new ModelRendererTurbo(this, 437, 481, textureX, textureY); // Box 11
		gun_6_Model[0][12] = new ModelRendererTurbo(this, 477, 481, textureX, textureY); // Box 12
		gun_6_Model[0][13] = new ModelRendererTurbo(this, 437, 489, textureX, textureY); // Box 13
		gun_6_Model[0][14] = new ModelRendererTurbo(this, 453, 489, textureX, textureY); // Box 14
		gun_6_Model[0][15] = new ModelRendererTurbo(this, 469, 489, textureX, textureY); // Box 15
		gun_6_Model[0][16] = new ModelRendererTurbo(this, 445, 489, textureX, textureY); // Box 16
		gun_6_Model[0][17] = new ModelRendererTurbo(this, 461, 489, textureX, textureY); // Box 18
		gun_6_Model[0][18] = new ModelRendererTurbo(this, 477, 489, textureX, textureY); // Box 19
		gun_6_Model[0][19] = new ModelRendererTurbo(this, 485, 489, textureX, textureY); // Box 20
		gun_6_Model[0][20] = new ModelRendererTurbo(this, 381, 497, textureX, textureY); // Box 21
		gun_6_Model[0][21] = new ModelRendererTurbo(this, 493, 489, textureX, textureY); // Box 22
		gun_6_Model[0][22] = new ModelRendererTurbo(this, 501, 489, textureX, textureY); // Box 23
		gun_6_Model[0][23] = new ModelRendererTurbo(this, 389, 497, textureX, textureY); // Box 24
		gun_6_Model[0][24] = new ModelRendererTurbo(this, 397, 497, textureX, textureY); // Box 25
		gun_6_Model[0][25] = new ModelRendererTurbo(this, 413, 497, textureX, textureY); // Box 26
		gun_6_Model[0][26] = new ModelRendererTurbo(this, 429, 497, textureX, textureY); // Box 27
		gun_6_Model[0][27] = new ModelRendererTurbo(this, 453, 497, textureX, textureY); // Box 28
		gun_6_Model[0][28] = new ModelRendererTurbo(this, 469, 497, textureX, textureY); // Box 29
		gun_6_Model[0][29] = new ModelRendererTurbo(this, 477, 497, textureX, textureY); // Box 30
		gun_6_Model[0][30] = new ModelRendererTurbo(this, 485, 497, textureX, textureY); // Box 31
		gun_6_Model[0][31] = new ModelRendererTurbo(this, 381, 505, textureX, textureY); // Box 32
		gun_6_Model[0][32] = new ModelRendererTurbo(this, 397, 505, textureX, textureY); // Box 33
		gun_6_Model[0][33] = new ModelRendererTurbo(this, 501, 497, textureX, textureY); // Box 34
		gun_6_Model[0][34] = new ModelRendererTurbo(this, 413, 505, textureX, textureY); // Box 35

		gun_6_Model[0][0].addShapeBox(-11F, -1.5F, -1F, 13, 2, 2, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 0

		gun_6_Model[0][1].addShapeBox(2F, -1.5F, -0.5F, 11, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 1

		gun_6_Model[0][2].addShapeBox(2F, -0.5F, -0.5F, 15, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 2

		gun_6_Model[0][3].addShapeBox(2F, -1.5F, -0.5F, 5, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 3

		gun_6_Model[0][4].addShapeBox(2F, -0.5F, -0.5F, 5, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 4

		gun_6_Model[0][5].addShapeBox(6.5F, -1.5F, -0.5F, 1, 1, 1, 0F,0F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 5

		gun_6_Model[0][6].addShapeBox(6.5F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 6

		gun_6_Model[0][7].addShapeBox(12F, -1.5F, -0.5F, 1, 2, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 7

		gun_6_Model[0][8].addShapeBox(12.5F, -1.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 8

		gun_6_Model[0][9].addShapeBox(-0.5F, -0.5F, -1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 9

		gun_6_Model[0][10].addShapeBox(-12F, -1F, -0.5F, 1, 1, 1, 0F,-0.4F, -0.3F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -0.3F, -0.3F); // Box 10

		gun_6_Model[0][11].addShapeBox(-11F, -1.5F, -1.5F, 1, 1, 3, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 11

		gun_6_Model[0][12].addShapeBox(-13F, -1.5F, -1.5F, 2, 1, 3, 0F,0F, 0F, -2.75F, 0F, 0F, -2.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -2.75F, 0F, -0.75F, -2.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 12

		gun_6_Model[0][13].addShapeBox(-13F, 1.5F, -1.5F, 2, 1, 3, 0F,0F, 0F, -2.75F, 0F, 0F, -2.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -2.75F, 0F, -0.75F, -2.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 13

		gun_6_Model[0][14].addShapeBox(-11F, 1.5F, -1.5F, 1, 1, 3, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 14

		gun_6_Model[0][15].addShapeBox(-11F, 0.5F, -1F, 1, 1, 2, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.75F, 0F, -0.2F, -0.75F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 15

		gun_6_Model[0][16].addShapeBox(-13.25F, -1.25F, 0.75F, 1, 1, 1, 0F,-0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 16

		gun_6_Model[0][17].addShapeBox(-13.25F, 0.75F, 0.75F, 1, 1, 1, 0F,0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Box 18

		gun_6_Model[0][18].addShapeBox(-13.25F, -0.25F, 0.75F, 1, 1, 1, 0F,0F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 19

		gun_6_Model[0][19].addShapeBox(-13F, -1.5F, -1.5F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.75F, 0F, 0F, -2.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -2.75F, 0F, -0.75F, -2.75F); // Box 20

		gun_6_Model[0][20].addShapeBox(-13F, 1.5F, -1.5F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.75F, 0F, 0F, -2.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -2.75F, 0F, -0.75F, -2.75F); // Box 21

		gun_6_Model[0][21].addShapeBox(-13.25F, -1.25F, -1.75F, 1, 1, 1, 0F,-0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 22

		gun_6_Model[0][22].addShapeBox(-13.25F, 0.75F, -1.75F, 1, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F); // Box 23

		gun_6_Model[0][23].addShapeBox(-13.25F, -0.25F, -1.75F, 1, 1, 1, 0F,0F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 24

		gun_6_Model[0][24].addShapeBox(-5F, -1.5F, -1.8F, 4, 2, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.1F, -0.8F, -0.2F, -0.1F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25

		gun_6_Model[0][25].addShapeBox(-10F, -1F, -1F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26

		gun_6_Model[0][26].addShapeBox(-7F, -1.6F, -0.5F, 7, 2, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 27

		gun_6_Model[0][27].addShapeBox(-7F, -2.6F, -0.5F, 6, 1, 1, 0F,0F, -0.9F, -0.2F, 0F, -0.9F, 0.6F, 0F, -0.9F, -1F, 0F, -0.9F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.6F, 0F, 0F, -1F, 0F, 0F, -0.2F); // Box 28

		gun_6_Model[0][28].addShapeBox(-6F, -1.5F, -1.8F, 1, 2, 1, 0F,0F, -0.2F, 0F, -0.6F, -0.2F, 0F, -0.6F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.6F, -0.2F, 0F, -0.6F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 29

		gun_6_Model[0][29].addShapeBox(-0.95F, -3.5F, -2.45F, 1, 2, 1, 0F,0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.2F, 0F, -0.6F, -0.2F, 0F, -0.6F, -0.2F, -0.6F, 0F, -0.2F, -0.6F); // Box 30

		gun_6_Model[0][30].addShapeBox(-1.5F, -2.6F, -3F, 1, 1, 3, 0F,-0.5F, -0.9F, -0.5F, 0F, -0.9F, -0.5F, 0F, -0.9F, 0F, -0.5F, -0.9F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 31

		gun_6_Model[0][31].addShapeBox(-0.5F, -0.5F, -1.5F, 1, 1, 3, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 32

		gun_6_Model[0][32].addShapeBox(-1F, 0.5F, -1.5F, 2, 1, 3, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33

		gun_6_Model[0][33].addShapeBox(-1F, -0.5F, -1.5F, 2, 2, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.8F, -0.5F, 0F, -0.8F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.8F); // Box 34

		gun_6_Model[0][34].addShapeBox(-1F, -0.5F, 0.5F, 2, 2, 1, 0F,-0.5F, 0F, -0.8F, -0.5F, 0F, -0.8F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 35

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_6_Model[0])
		{
			gunPart.setRotationPoint(150F, -28F, 19F);
		}


		gun_6_Model[1] = new ModelRendererTurbo[0];

		gun_6_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("WaistGunRight", gun_6_Model);

		// Passenger 8
		ModelRendererTurbo[][] gun_7_Model = new ModelRendererTurbo[3][];

		gun_7_Model[0] = new ModelRendererTurbo[35];
		gun_7_Model[0][0] = new ModelRendererTurbo(this, 381, 481, textureX, textureY); // Box 0
		gun_7_Model[0][1] = new ModelRendererTurbo(this, 413, 481, textureX, textureY); // Box 1
		gun_7_Model[0][2] = new ModelRendererTurbo(this, 445, 481, textureX, textureY); // Box 2
		gun_7_Model[0][3] = new ModelRendererTurbo(this, 485, 481, textureX, textureY); // Box 3
		gun_7_Model[0][4] = new ModelRendererTurbo(this, 381, 489, textureX, textureY); // Box 4
		gun_7_Model[0][5] = new ModelRendererTurbo(this, 501, 481, textureX, textureY); // Box 5
		gun_7_Model[0][6] = new ModelRendererTurbo(this, 397, 489, textureX, textureY); // Box 6
		gun_7_Model[0][7] = new ModelRendererTurbo(this, 405, 489, textureX, textureY); // Box 7
		gun_7_Model[0][8] = new ModelRendererTurbo(this, 413, 489, textureX, textureY); // Box 8
		gun_7_Model[0][9] = new ModelRendererTurbo(this, 421, 489, textureX, textureY); // Box 9
		gun_7_Model[0][10] = new ModelRendererTurbo(this, 429, 489, textureX, textureY); // Box 10
		gun_7_Model[0][11] = new ModelRendererTurbo(this, 437, 481, textureX, textureY); // Box 11
		gun_7_Model[0][12] = new ModelRendererTurbo(this, 477, 481, textureX, textureY); // Box 12
		gun_7_Model[0][13] = new ModelRendererTurbo(this, 437, 489, textureX, textureY); // Box 13
		gun_7_Model[0][14] = new ModelRendererTurbo(this, 453, 489, textureX, textureY); // Box 14
		gun_7_Model[0][15] = new ModelRendererTurbo(this, 469, 489, textureX, textureY); // Box 15
		gun_7_Model[0][16] = new ModelRendererTurbo(this, 445, 489, textureX, textureY); // Box 16
		gun_7_Model[0][17] = new ModelRendererTurbo(this, 461, 489, textureX, textureY); // Box 18
		gun_7_Model[0][18] = new ModelRendererTurbo(this, 477, 489, textureX, textureY); // Box 19
		gun_7_Model[0][19] = new ModelRendererTurbo(this, 485, 489, textureX, textureY); // Box 20
		gun_7_Model[0][20] = new ModelRendererTurbo(this, 381, 497, textureX, textureY); // Box 21
		gun_7_Model[0][21] = new ModelRendererTurbo(this, 493, 489, textureX, textureY); // Box 22
		gun_7_Model[0][22] = new ModelRendererTurbo(this, 501, 489, textureX, textureY); // Box 23
		gun_7_Model[0][23] = new ModelRendererTurbo(this, 389, 497, textureX, textureY); // Box 24
		gun_7_Model[0][24] = new ModelRendererTurbo(this, 397, 497, textureX, textureY); // Box 25
		gun_7_Model[0][25] = new ModelRendererTurbo(this, 413, 497, textureX, textureY); // Box 26
		gun_7_Model[0][26] = new ModelRendererTurbo(this, 429, 497, textureX, textureY); // Box 27
		gun_7_Model[0][27] = new ModelRendererTurbo(this, 453, 497, textureX, textureY); // Box 28
		gun_7_Model[0][28] = new ModelRendererTurbo(this, 469, 497, textureX, textureY); // Box 29
		gun_7_Model[0][29] = new ModelRendererTurbo(this, 477, 497, textureX, textureY); // Box 30
		gun_7_Model[0][30] = new ModelRendererTurbo(this, 485, 497, textureX, textureY); // Box 31
		gun_7_Model[0][31] = new ModelRendererTurbo(this, 381, 505, textureX, textureY); // Box 32
		gun_7_Model[0][32] = new ModelRendererTurbo(this, 397, 505, textureX, textureY); // Box 33
		gun_7_Model[0][33] = new ModelRendererTurbo(this, 501, 497, textureX, textureY); // Box 34
		gun_7_Model[0][34] = new ModelRendererTurbo(this, 413, 505, textureX, textureY); // Box 35

		gun_7_Model[0][0].addShapeBox(-11F, -1.5F, -1F, 13, 2, 2, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 0

		gun_7_Model[0][1].addShapeBox(2F, -1.5F, -0.5F, 11, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 1

		gun_7_Model[0][2].addShapeBox(2F, -0.5F, -0.5F, 15, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 2

		gun_7_Model[0][3].addShapeBox(2F, -1.5F, -0.5F, 5, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 3

		gun_7_Model[0][4].addShapeBox(2F, -0.5F, -0.5F, 5, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 4

		gun_7_Model[0][5].addShapeBox(6.5F, -1.5F, -0.5F, 1, 1, 1, 0F,0F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 5

		gun_7_Model[0][6].addShapeBox(6.5F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 6

		gun_7_Model[0][7].addShapeBox(12F, -1.5F, -0.5F, 1, 2, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 7

		gun_7_Model[0][8].addShapeBox(12.5F, -1.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 8

		gun_7_Model[0][9].addShapeBox(-0.5F, -0.5F, -1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 9

		gun_7_Model[0][10].addShapeBox(-12F, -1F, -0.5F, 1, 1, 1, 0F,-0.4F, -0.3F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -0.3F, -0.3F); // Box 10

		gun_7_Model[0][11].addShapeBox(-11F, -1.5F, -1.5F, 1, 1, 3, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 11

		gun_7_Model[0][12].addShapeBox(-13F, -1.5F, -1.5F, 2, 1, 3, 0F,0F, 0F, -2.75F, 0F, 0F, -2.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -2.75F, 0F, -0.75F, -2.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 12

		gun_7_Model[0][13].addShapeBox(-13F, 1.5F, -1.5F, 2, 1, 3, 0F,0F, 0F, -2.75F, 0F, 0F, -2.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -2.75F, 0F, -0.75F, -2.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 13

		gun_7_Model[0][14].addShapeBox(-11F, 1.5F, -1.5F, 1, 1, 3, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 14

		gun_7_Model[0][15].addShapeBox(-11F, 0.5F, -1F, 1, 1, 2, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.75F, 0F, -0.2F, -0.75F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 15

		gun_7_Model[0][16].addShapeBox(-13.25F, -1.25F, 0.75F, 1, 1, 1, 0F,-0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 16

		gun_7_Model[0][17].addShapeBox(-13.25F, 0.75F, 0.75F, 1, 1, 1, 0F,0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Box 18

		gun_7_Model[0][18].addShapeBox(-13.25F, -0.25F, 0.75F, 1, 1, 1, 0F,0F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 19

		gun_7_Model[0][19].addShapeBox(-13F, -1.5F, -1.5F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.75F, 0F, 0F, -2.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -2.75F, 0F, -0.75F, -2.75F); // Box 20

		gun_7_Model[0][20].addShapeBox(-13F, 1.5F, -1.5F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.75F, 0F, 0F, -2.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -2.75F, 0F, -0.75F, -2.75F); // Box 21

		gun_7_Model[0][21].addShapeBox(-13.25F, -1.25F, -1.75F, 1, 1, 1, 0F,-0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 22

		gun_7_Model[0][22].addShapeBox(-13.25F, 0.75F, -1.75F, 1, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F); // Box 23

		gun_7_Model[0][23].addShapeBox(-13.25F, -0.25F, -1.75F, 1, 1, 1, 0F,0F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 24

		gun_7_Model[0][24].addShapeBox(-5F, -1.5F, -1.8F, 4, 2, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.1F, -0.8F, -0.2F, -0.1F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25

		gun_7_Model[0][25].addShapeBox(-10F, -1F, -1F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26

		gun_7_Model[0][26].addShapeBox(-7F, -1.6F, -0.5F, 7, 2, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 27

		gun_7_Model[0][27].addShapeBox(-7F, -2.6F, -0.5F, 6, 1, 1, 0F,0F, -0.9F, -0.2F, 0F, -0.9F, 0.6F, 0F, -0.9F, -1F, 0F, -0.9F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.6F, 0F, 0F, -1F, 0F, 0F, -0.2F); // Box 28

		gun_7_Model[0][28].addShapeBox(-6F, -1.5F, -1.8F, 1, 2, 1, 0F,0F, -0.2F, 0F, -0.6F, -0.2F, 0F, -0.6F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.6F, -0.2F, 0F, -0.6F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 29

		gun_7_Model[0][29].addShapeBox(-0.95F, -3.5F, -2.45F, 1, 2, 1, 0F,0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.2F, 0F, -0.6F, -0.2F, 0F, -0.6F, -0.2F, -0.6F, 0F, -0.2F, -0.6F); // Box 30

		gun_7_Model[0][30].addShapeBox(-1.5F, -2.6F, -3F, 1, 1, 3, 0F,-0.5F, -0.9F, -0.5F, 0F, -0.9F, -0.5F, 0F, -0.9F, 0F, -0.5F, -0.9F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 31

		gun_7_Model[0][31].addShapeBox(-0.5F, -0.5F, -1.5F, 1, 1, 3, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 32

		gun_7_Model[0][32].addShapeBox(-1F, 0.5F, -1.5F, 2, 1, 3, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33

		gun_7_Model[0][33].addShapeBox(-1F, -0.5F, -1.5F, 2, 2, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.8F, -0.5F, 0F, -0.8F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.8F); // Box 34

		gun_7_Model[0][34].addShapeBox(-1F, -0.5F, 0.5F, 2, 2, 1, 0F,-0.5F, 0F, -0.8F, -0.5F, 0F, -0.8F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 35

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_7_Model[0])
		{
			gunPart.setRotationPoint(150F, -28F, -19F);
		}


		gun_7_Model[1] = new ModelRendererTurbo[0];

		gun_7_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("WasitGunLeft", gun_7_Model);
	}
}