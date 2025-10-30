//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: B24
// Model Creator: 
// Created on: 30.04.2023 - 21:06:40
// Last changed on: 30.04.2023 - 21:06:40

package com.flansmod.client.model.Taskball; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelB24 extends ModelPlane //Same as Filename
{
	int textureX = 2048;
	int textureY = 2048;

	public ModelB24() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[587];
		noseModel = new ModelRendererTurbo[42];
		tailModel = new ModelRendererTurbo[37];
		bayModel = new ModelRendererTurbo[192];
		rightWingModel = new ModelRendererTurbo[156];
		hudModel = new ModelRendererTurbo[46];

		initbodyModel_1();
		initbodyModel_2();
		initnoseModel_1();
		inittailModel_1();
		initbayModel_1();
		initrightWingModel_1();
		inithudModel_1();

		initPropeller();

		initGuns();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 566, 561, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 697, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 905, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 1129, 1, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 1329, 1, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 1441, 1, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 1553, 1, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 1689, 1, textureX, textureY); // Box 10
		bodyModel[11] = new ModelRendererTurbo(this, 1777, 1, textureX, textureY); // Box 11
		bodyModel[12] = new ModelRendererTurbo(this, 905, 17, textureX, textureY); // Box 12
		bodyModel[13] = new ModelRendererTurbo(this, 1905, 1, textureX, textureY); // Box 13
		bodyModel[14] = new ModelRendererTurbo(this, 1441, 17, textureX, textureY); // Box 14
		bodyModel[15] = new ModelRendererTurbo(this, 1025, 17, textureX, textureY); // Box 15
		bodyModel[16] = new ModelRendererTurbo(this, 721, 25, textureX, textureY); // Box 16
		bodyModel[17] = new ModelRendererTurbo(this, 785, 25, textureX, textureY); // Box 17
		bodyModel[18] = new ModelRendererTurbo(this, 1073, 25, textureX, textureY); // Box 18
		bodyModel[19] = new ModelRendererTurbo(this, 841, 25, textureX, textureY); // Box 19
		bodyModel[20] = new ModelRendererTurbo(this, 1209, 25, textureX, textureY); // Box 20
		bodyModel[21] = new ModelRendererTurbo(this, 1265, 33, textureX, textureY); // Box 21
		bodyModel[22] = new ModelRendererTurbo(this, 1537, 25, textureX, textureY); // Box 22
		bodyModel[23] = new ModelRendererTurbo(this, 1577, 25, textureX, textureY); // Box 23
		bodyModel[24] = new ModelRendererTurbo(this, 1649, 25, textureX, textureY); // Box 24
		bodyModel[25] = new ModelRendererTurbo(this, 1905, 25, textureX, textureY); // Box 25
		bodyModel[26] = new ModelRendererTurbo(this, 17, 463, textureX, textureY); // Box 26
		bodyModel[27] = new ModelRendererTurbo(this, 136, 6, textureX, textureY); // Box 27
		bodyModel[28] = new ModelRendererTurbo(this, 161, 41, textureX, textureY); // Box 28
		bodyModel[29] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // Box 29
		bodyModel[30] = new ModelRendererTurbo(this, 173, 29, textureX, textureY); // Box 30
		bodyModel[31] = new ModelRendererTurbo(this, 537, 41, textureX, textureY); // Box 31
		bodyModel[32] = new ModelRendererTurbo(this, 657, 41, textureX, textureY); // Box 32
		bodyModel[33] = new ModelRendererTurbo(this, 721, 41, textureX, textureY); // Box 33
		bodyModel[34] = new ModelRendererTurbo(this, 777, 41, textureX, textureY); // Box 34
		bodyModel[35] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 35
		bodyModel[36] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 36
		bodyModel[37] = new ModelRendererTurbo(this, 1761, 41, textureX, textureY); // Box 37
		bodyModel[38] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 38
		bodyModel[39] = new ModelRendererTurbo(this, 1825, 41, textureX, textureY); // Box 39
		bodyModel[40] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // Box 40
		bodyModel[41] = new ModelRendererTurbo(this, 289, 49, textureX, textureY); // Box 41
		bodyModel[42] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 42
		bodyModel[43] = new ModelRendererTurbo(this, 841, 49, textureX, textureY); // Box 43
		bodyModel[44] = new ModelRendererTurbo(this, 953, 49, textureX, textureY); // Box 44
		bodyModel[45] = new ModelRendererTurbo(this, 1009, 49, textureX, textureY); // Box 45
		bodyModel[46] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 46
		bodyModel[47] = new ModelRendererTurbo(this, 1561, 25, textureX, textureY); // Box 47
		bodyModel[48] = new ModelRendererTurbo(this, 1073, 49, textureX, textureY); // Box 48
		bodyModel[49] = new ModelRendererTurbo(this, 1121, 49, textureX, textureY); // Box 49
		bodyModel[50] = new ModelRendererTurbo(this, 1177, 49, textureX, textureY); // Box 50
		bodyModel[51] = new ModelRendererTurbo(this, 1289, 49, textureX, textureY); // Box 51
		bodyModel[52] = new ModelRendererTurbo(this, 1353, 49, textureX, textureY); // Box 52
		bodyModel[53] = new ModelRendererTurbo(this, 1409, 49, textureX, textureY); // Box 56
		bodyModel[54] = new ModelRendererTurbo(this, 1696, 466, textureX, textureY); // Box 57
		bodyModel[55] = new ModelRendererTurbo(this, 521, 57, textureX, textureY); // Box 58
		bodyModel[56] = new ModelRendererTurbo(this, 633, 57, textureX, textureY); // Box 59
		bodyModel[57] = new ModelRendererTurbo(this, 1673, 49, textureX, textureY); // Box 60
		bodyModel[58] = new ModelRendererTurbo(this, 761, 57, textureX, textureY); // Box 61
		bodyModel[59] = new ModelRendererTurbo(this, 1729, 57, textureX, textureY); // Box 62
		bodyModel[60] = new ModelRendererTurbo(this, 1793, 57, textureX, textureY); // Box 63
		bodyModel[61] = new ModelRendererTurbo(this, 1857, 57, textureX, textureY); // Box 64
		bodyModel[62] = new ModelRendererTurbo(this, 1921, 57, textureX, textureY); // Box 65
		bodyModel[63] = new ModelRendererTurbo(this, 222, 334, textureX, textureY); // Box 66
		bodyModel[64] = new ModelRendererTurbo(this, 145, 65, textureX, textureY); // Box 67
		bodyModel[65] = new ModelRendererTurbo(this, 1993, 57, textureX, textureY); // Box 68
		bodyModel[66] = new ModelRendererTurbo(this, 54, 363, textureX, textureY); // Box 69
		bodyModel[67] = new ModelRendererTurbo(this, 273, 65, textureX, textureY); // Box 71
		bodyModel[68] = new ModelRendererTurbo(this, 265, 81, textureX, textureY); // Box 154
		bodyModel[69] = new ModelRendererTurbo(this, 1793, 81, textureX, textureY); // Box 155
		bodyModel[70] = new ModelRendererTurbo(this, 1401, 25, textureX, textureY); // Box 156
		bodyModel[71] = new ModelRendererTurbo(this, 897, 73, textureX, textureY); // Box 157
		bodyModel[72] = new ModelRendererTurbo(this, 134, 230, textureX, textureY); // Box 159
		bodyModel[73] = new ModelRendererTurbo(this, 1761, 25, textureX, textureY); // Box 160
		bodyModel[74] = new ModelRendererTurbo(this, 1585, 25, textureX, textureY); // Box 161
		bodyModel[75] = new ModelRendererTurbo(this, 1425, 25, textureX, textureY); // Box 162
		bodyModel[76] = new ModelRendererTurbo(this, 1521, 33, textureX, textureY); // Box 163
		bodyModel[77] = new ModelRendererTurbo(this, 1577, 41, textureX, textureY); // Box 164
		bodyModel[78] = new ModelRendererTurbo(this, 1073, 33, textureX, textureY); // Box 165
		bodyModel[79] = new ModelRendererTurbo(this, 1265, 33, textureX, textureY); // Box 166
		bodyModel[80] = new ModelRendererTurbo(this, 1561, 25, textureX, textureY); // Box 167
		bodyModel[81] = new ModelRendererTurbo(this, 793, 73, textureX, textureY); // Box 813
		bodyModel[82] = new ModelRendererTurbo(this, 209, 113, textureX, textureY); // Box 185
		bodyModel[83] = new ModelRendererTurbo(this, 2001, 73, textureX, textureY); // Box 186
		bodyModel[84] = new ModelRendererTurbo(this, 1321, 105, textureX, textureY); // Box 187
		bodyModel[85] = new ModelRendererTurbo(this, 297, 113, textureX, textureY); // Box 188
		bodyModel[86] = new ModelRendererTurbo(this, 881, 105, textureX, textureY); // Box 189
		bodyModel[87] = new ModelRendererTurbo(this, 921, 113, textureX, textureY); // Box 190
		bodyModel[88] = new ModelRendererTurbo(this, 977, 113, textureX, textureY); // Box 191
		bodyModel[89] = new ModelRendererTurbo(this, 1033, 113, textureX, textureY); // Box 192
		bodyModel[90] = new ModelRendererTurbo(this, 1089, 113, textureX, textureY); // Box 193
		bodyModel[91] = new ModelRendererTurbo(this, 1145, 113, textureX, textureY); // Box 194
		bodyModel[92] = new ModelRendererTurbo(this, 353, 113, textureX, textureY); // Box 195
		bodyModel[93] = new ModelRendererTurbo(this, 1233, 113, textureX, textureY); // Box 196
		bodyModel[94] = new ModelRendererTurbo(this, 1585, 113, textureX, textureY); // Box 197
		bodyModel[95] = new ModelRendererTurbo(this, 1641, 113, textureX, textureY); // Box 198
		bodyModel[96] = new ModelRendererTurbo(this, 1697, 113, textureX, textureY); // Box 199
		bodyModel[97] = new ModelRendererTurbo(this, 1737, 113, textureX, textureY); // Box 200
		bodyModel[98] = new ModelRendererTurbo(this, 1297, 105, textureX, textureY); // Box 201
		bodyModel[99] = new ModelRendererTurbo(this, 25, 121, textureX, textureY); // Box 202
		bodyModel[100] = new ModelRendererTurbo(this, 313, 121, textureX, textureY); // Box 203
		bodyModel[101] = new ModelRendererTurbo(this, 129, 121, textureX, textureY); // Box 204
		bodyModel[102] = new ModelRendererTurbo(this, 417, 121, textureX, textureY); // Box 205
		bodyModel[103] = new ModelRendererTurbo(this, 897, 81, textureX, textureY); // Box 206
		bodyModel[104] = new ModelRendererTurbo(this, 1537, 33, textureX, textureY); // Box 207
		bodyModel[105] = new ModelRendererTurbo(this, 42, 119, textureX, textureY); // Box 208
		bodyModel[106] = new ModelRendererTurbo(this, 141, 40, textureX, textureY); // Box 209
		bodyModel[107] = new ModelRendererTurbo(this, 1881, 41, textureX, textureY); // Box 210
		bodyModel[108] = new ModelRendererTurbo(this, 1105, 49, textureX, textureY); // Box 211
		bodyModel[109] = new ModelRendererTurbo(this, 1737, 49, textureX, textureY); // Box 212
		bodyModel[110] = new ModelRendererTurbo(this, 1489, 1067, textureX, textureY); // Box 213
		bodyModel[111] = new ModelRendererTurbo(this, 1265, 129, textureX, textureY); // Box 214
		bodyModel[112] = new ModelRendererTurbo(this, 1585, 137, textureX, textureY); // Box 215
		bodyModel[113] = new ModelRendererTurbo(this, 1054, 893, textureX, textureY); // Box 216
		bodyModel[114] = new ModelRendererTurbo(this, 1518, 799, textureX, textureY); // Box 217
		bodyModel[115] = new ModelRendererTurbo(this, 961, 153, textureX, textureY); // Box 218
		bodyModel[116] = new ModelRendererTurbo(this, 297, 329, textureX, textureY); // Box 208
		bodyModel[117] = new ModelRendererTurbo(this, 1489, 145, textureX, textureY); // Box 209
		bodyModel[118] = new ModelRendererTurbo(this, 1489, 185, textureX, textureY); // Box 210
		bodyModel[119] = new ModelRendererTurbo(this, 297, 209, textureX, textureY); // Box 211
		bodyModel[120] = new ModelRendererTurbo(this, 1825, 153, textureX, textureY); // Box 212
		bodyModel[121] = new ModelRendererTurbo(this, 1249, 145, textureX, textureY); // Box 213
		bodyModel[122] = new ModelRendererTurbo(this, 687, 104, textureX, textureY); // Box 214
		bodyModel[123] = new ModelRendererTurbo(this, 961, 153, textureX, textureY); // Box 215
		bodyModel[124] = new ModelRendererTurbo(this, 729, 161, textureX, textureY); // Box 216
		bodyModel[125] = new ModelRendererTurbo(this, 1249, 161, textureX, textureY); // Box 217
		bodyModel[126] = new ModelRendererTurbo(this, 553, 169, textureX, textureY); // Box 218
		bodyModel[127] = new ModelRendererTurbo(this, 961, 177, textureX, textureY); // Box 219
		bodyModel[128] = new ModelRendererTurbo(this, 1825, 177, textureX, textureY); // Box 220
		bodyModel[129] = new ModelRendererTurbo(this, 729, 185, textureX, textureY); // Box 221
		bodyModel[130] = new ModelRendererTurbo(this, 513, 193, textureX, textureY); // Box 222
		bodyModel[131] = new ModelRendererTurbo(this, 1249, 193, textureX, textureY); // Box 223
		bodyModel[132] = new ModelRendererTurbo(this, 1969, 121, textureX, textureY); // Box 224
		bodyModel[133] = new ModelRendererTurbo(this, 961, 201, textureX, textureY); // Box 227
		bodyModel[134] = new ModelRendererTurbo(this, 1164, 632, textureX, textureY); // Box 228
		bodyModel[135] = new ModelRendererTurbo(this, 1385, 129, textureX, textureY); // Box 229
		bodyModel[136] = new ModelRendererTurbo(this, 1489, 225, textureX, textureY); // Box 230
		bodyModel[137] = new ModelRendererTurbo(this, 417, 121, textureX, textureY); // Box 231
		bodyModel[138] = new ModelRendererTurbo(this, 297, 145, textureX, textureY); // Box 232
		bodyModel[139] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 233
		bodyModel[140] = new ModelRendererTurbo(this, 1249, 209, textureX, textureY); // Box 234
		bodyModel[141] = new ModelRendererTurbo(this, 833, 137, textureX, textureY); // Box 235
		bodyModel[142] = new ModelRendererTurbo(this, 129, 137, textureX, textureY); // Box 236
		bodyModel[143] = new ModelRendererTurbo(this, 1489, 241, textureX, textureY); // Box 237
		bodyModel[144] = new ModelRendererTurbo(this, 513, 217, textureX, textureY); // Box 238
		bodyModel[145] = new ModelRendererTurbo(this, 689, 73, textureX, textureY); // Box 239
		bodyModel[146] = new ModelRendererTurbo(this, 647, 627, textureX, textureY); // Box 240
		bodyModel[147] = new ModelRendererTurbo(this, 1489, 129, textureX, textureY); // Box 241
		bodyModel[148] = new ModelRendererTurbo(this, 1825, 137, textureX, textureY); // Box 242
		bodyModel[149] = new ModelRendererTurbo(this, 1985, 137, textureX, textureY); // Box 243
		bodyModel[150] = new ModelRendererTurbo(this, 521, 81, textureX, textureY); // Box 244
		bodyModel[151] = new ModelRendererTurbo(this, 1721, 73, textureX, textureY); // Box 245
		bodyModel[152] = new ModelRendererTurbo(this, 1705, 145, textureX, textureY); // Box 246
		bodyModel[153] = new ModelRendererTurbo(this, 1881, 49, textureX, textureY); // Box 247
		bodyModel[154] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 248
		bodyModel[155] = new ModelRendererTurbo(this, 1825, 217, textureX, textureY); // Box 249
		bodyModel[156] = new ModelRendererTurbo(this, 961, 225, textureX, textureY); // Box 250
		bodyModel[157] = new ModelRendererTurbo(this, 3, 122, textureX, textureY); // Box 251
		bodyModel[158] = new ModelRendererTurbo(this, 625, 153, textureX, textureY); // Box 253
		bodyModel[159] = new ModelRendererTurbo(this, 1385, 153, textureX, textureY); // Box 254
		bodyModel[160] = new ModelRendererTurbo(this, 1881, 81, textureX, textureY); // Box 255
		bodyModel[161] = new ModelRendererTurbo(this, 265, 89, textureX, textureY); // Box 256
		bodyModel[162] = new ModelRendererTurbo(this, 1481, 97, textureX, textureY); // Box 257
		bodyModel[163] = new ModelRendererTurbo(this, 49, 161, textureX, textureY); // Box 258
		bodyModel[164] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Box 259
		bodyModel[165] = new ModelRendererTurbo(this, 129, 161, textureX, textureY); // Box 260
		bodyModel[166] = new ModelRendererTurbo(this, 417, 161, textureX, textureY); // Box 261
		bodyModel[167] = new ModelRendererTurbo(this, 609, 81, textureX, textureY); // Box 262
		bodyModel[168] = new ModelRendererTurbo(this, 401, 89, textureX, textureY); // Box 263
		bodyModel[169] = new ModelRendererTurbo(this, 793, 89, textureX, textureY); // Box 264
		bodyModel[170] = new ModelRendererTurbo(this, 521, 233, textureX, textureY); // Box 268
		bodyModel[171] = new ModelRendererTurbo(this, 841, 169, textureX, textureY); // Box 270
		bodyModel[172] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 274
		bodyModel[173] = new ModelRendererTurbo(this, 129, 177, textureX, textureY); // Box 275
		bodyModel[174] = new ModelRendererTurbo(this, 1073, 177, textureX, textureY); // Box 276
		bodyModel[175] = new ModelRendererTurbo(this, 1729, 161, textureX, textureY); // Box 277
		bodyModel[176] = new ModelRendererTurbo(this, 521, 97, textureX, textureY); // Box 278
		bodyModel[177] = new ModelRendererTurbo(this, 1561, 97, textureX, textureY); // Box 279
		bodyModel[178] = new ModelRendererTurbo(this, 1385, 169, textureX, textureY); // Box 360
		bodyModel[179] = new ModelRendererTurbo(this, 1953, 177, textureX, textureY); // Box 361
		bodyModel[180] = new ModelRendererTurbo(this, 689, 89, textureX, textureY); // Box 362
		bodyModel[181] = new ModelRendererTurbo(this, 513, 169, textureX, textureY); // Box 363
		bodyModel[182] = new ModelRendererTurbo(this, 1385, 105, textureX, textureY); // Box 367
		bodyModel[183] = new ModelRendererTurbo(this, 2025, 25, textureX, textureY); // Box 368
		bodyModel[184] = new ModelRendererTurbo(this, 713, 33, textureX, textureY); // Box 369
		bodyModel[185] = new ModelRendererTurbo(this, 1729, 49, textureX, textureY); // Box 370
		bodyModel[186] = new ModelRendererTurbo(this, 1905, 81, textureX, textureY); // Box 371
		bodyModel[187] = new ModelRendererTurbo(this, 1177, 89, textureX, textureY); // Box 372
		bodyModel[188] = new ModelRendererTurbo(this, 1785, 57, textureX, textureY); // Box 373
		bodyModel[189] = new ModelRendererTurbo(this, 1721, 89, textureX, textureY); // Box 374
		bodyModel[190] = new ModelRendererTurbo(this, 1897, 41, textureX, textureY); // Box 375
		bodyModel[191] = new ModelRendererTurbo(this, 1849, 57, textureX, textureY); // Box 376
		bodyModel[192] = new ModelRendererTurbo(this, 1793, 89, textureX, textureY); // Box 377
		bodyModel[193] = new ModelRendererTurbo(this, 1401, 105, textureX, textureY); // Box 378
		bodyModel[194] = new ModelRendererTurbo(this, 711, 467, textureX, textureY); // Box 380
		bodyModel[195] = new ModelRendererTurbo(this, 873, 185, textureX, textureY); // Box 381
		bodyModel[196] = new ModelRendererTurbo(this, 641, 193, textureX, textureY); // Box 382
		bodyModel[197] = new ModelRendererTurbo(this, 1737, 241, textureX, textureY); // Box 383
		bodyModel[198] = new ModelRendererTurbo(this, 1745, 209, textureX, textureY); // Box 384
		bodyModel[199] = new ModelRendererTurbo(this, 873, 249, textureX, textureY); // Box 385
		bodyModel[200] = new ModelRendererTurbo(this, 1737, 273, textureX, textureY); // Box 386
		bodyModel[201] = new ModelRendererTurbo(this, 641, 281, textureX, textureY); // Box 387
		bodyModel[202] = new ModelRendererTurbo(this, 1612, 755, textureX, textureY); // Box 388
		bodyModel[203] = new ModelRendererTurbo(this, 1249, 289, textureX, textureY); // Box 389
		bodyModel[204] = new ModelRendererTurbo(this, 1425, 249, textureX, textureY); // Box 390
		bodyModel[205] = new ModelRendererTurbo(this, 873, 281, textureX, textureY); // Box 391
		bodyModel[206] = new ModelRendererTurbo(this, 1889, 281, textureX, textureY); // Box 392
		bodyModel[207] = new ModelRendererTurbo(this, 1633, 289, textureX, textureY); // Box 393
		bodyModel[208] = new ModelRendererTurbo(this, 1121, 289, textureX, textureY); // Box 394
		bodyModel[209] = new ModelRendererTurbo(this, 1, 297, textureX, textureY); // Box 395
		bodyModel[210] = new ModelRendererTurbo(this, 1361, 193, textureX, textureY); // Box 399
		bodyModel[211] = new ModelRendererTurbo(this, 529, 329, textureX, textureY); // Box 400
		bodyModel[212] = new ModelRendererTurbo(this, 417, 185, textureX, textureY); // Box 401
		bodyModel[213] = new ModelRendererTurbo(this, 1145, 65, textureX, textureY); // Box 402
		bodyModel[214] = new ModelRendererTurbo(this, 1393, 65, textureX, textureY); // Box 403
		bodyModel[215] = new ModelRendererTurbo(this, 1537, 65, textureX, textureY); // Box 404
		bodyModel[216] = new ModelRendererTurbo(this, 489, 97, textureX, textureY); // Box 405
		bodyModel[217] = new ModelRendererTurbo(this, 210, 166, textureX, textureY); // Box 406
		bodyModel[218] = new ModelRendererTurbo(this, 609, 105, textureX, textureY); // Box 407
		bodyModel[219] = new ModelRendererTurbo(this, 465, 281, textureX, textureY); // Box 440
		bodyModel[220] = new ModelRendererTurbo(this, 1121, 185, textureX, textureY); // Box 441
		bodyModel[221] = new ModelRendererTurbo(this, 1689, 289, textureX, textureY); // Box 442
		bodyModel[222] = new ModelRendererTurbo(this, 1129, 209, textureX, textureY); // Box 443
		bodyModel[223] = new ModelRendererTurbo(this, 505, 297, textureX, textureY); // Box 468
		bodyModel[224] = new ModelRendererTurbo(this, 1489, 297, textureX, textureY); // Box 469
		bodyModel[225] = new ModelRendererTurbo(this, 177, 257, textureX, textureY); // Box 470
		bodyModel[226] = new ModelRendererTurbo(this, 2017, 177, textureX, textureY); // Box 471
		bodyModel[227] = new ModelRendererTurbo(this, 1433, 193, textureX, textureY); // Box 472
		bodyModel[228] = new ModelRendererTurbo(this, 1729, 89, textureX, textureY); // Box 473
		bodyModel[229] = new ModelRendererTurbo(this, 57, 297, textureX, textureY); // Box 474
		bodyModel[230] = new ModelRendererTurbo(this, 729, 233, textureX, textureY); // Box 475
		bodyModel[231] = new ModelRendererTurbo(this, 1433, 217, textureX, textureY); // Box 476
		bodyModel[232] = new ModelRendererTurbo(this, 1353, 137, textureX, textureY); // Box 477
		bodyModel[233] = new ModelRendererTurbo(this, 297, 329, textureX, textureY); // Box 494
		bodyModel[234] = new ModelRendererTurbo(this, 1433, 353, textureX, textureY); // Box 495
		bodyModel[235] = new ModelRendererTurbo(this, 1617, 353, textureX, textureY); // Box 496
		bodyModel[236] = new ModelRendererTurbo(this, 681, 361, textureX, textureY); // Box 498
		bodyModel[237] = new ModelRendererTurbo(this, 641, 225, textureX, textureY); // Box 499
		bodyModel[238] = new ModelRendererTurbo(this, 601, 129, textureX, textureY); // Box 500
		bodyModel[239] = new ModelRendererTurbo(this, 993, 145, textureX, textureY); // Box 501
		bodyModel[240] = new ModelRendererTurbo(this, 1601, 249, textureX, textureY); // Box 502
		bodyModel[241] = new ModelRendererTurbo(this, 1993, 297, textureX, textureY); // Box 503
		bodyModel[242] = new ModelRendererTurbo(this, 339, 278, textureX, textureY); // Box 504
		bodyModel[243] = new ModelRendererTurbo(this, 1121, 257, textureX, textureY); // Box 505
		bodyModel[244] = new ModelRendererTurbo(this, 113, 209, textureX, textureY); // Box 506
		bodyModel[245] = new ModelRendererTurbo(this, 1713, 281, textureX, textureY); // Box 507
		bodyModel[246] = new ModelRendererTurbo(this, 961, 305, textureX, textureY); // Box 508
		bodyModel[247] = new ModelRendererTurbo(this, 1409, 297, textureX, textureY); // Box 509
		bodyModel[248] = new ModelRendererTurbo(this, 935, 294, textureX, textureY); // Box 510
		bodyModel[249] = new ModelRendererTurbo(this, 161, 209, textureX, textureY); // Box 511
		bodyModel[250] = new ModelRendererTurbo(this, 1289, 137, textureX, textureY); // Box 512
		bodyModel[251] = new ModelRendererTurbo(this, 57, 153, textureX, textureY); // Box 513
		bodyModel[252] = new ModelRendererTurbo(this, 81, 153, textureX, textureY); // Box 514
		bodyModel[253] = new ModelRendererTurbo(this, 1017, 145, textureX, textureY); // Box 515
		bodyModel[254] = new ModelRendererTurbo(this, 1705, 161, textureX, textureY); // Box 516
		bodyModel[255] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 517
		bodyModel[256] = new ModelRendererTurbo(this, 97, 313, textureX, textureY); // Box 518
		bodyModel[257] = new ModelRendererTurbo(this, 625, 329, textureX, textureY); // Box 519
		bodyModel[258] = new ModelRendererTurbo(this, 737, 329, textureX, textureY); // Box 520
		bodyModel[259] = new ModelRendererTurbo(this, 1, 337, textureX, textureY); // Box 521
		bodyModel[260] = new ModelRendererTurbo(this, 1337, 249, textureX, textureY); // Box 522
		bodyModel[261] = new ModelRendererTurbo(this, 1025, 305, textureX, textureY); // Box 523
		bodyModel[262] = new ModelRendererTurbo(this, 1721, 321, textureX, textureY); // Box 524
		bodyModel[263] = new ModelRendererTurbo(this, 849, 329, textureX, textureY); // Box 525
		bodyModel[264] = new ModelRendererTurbo(this, 1761, 353, textureX, textureY); // Box 526
		bodyModel[265] = new ModelRendererTurbo(this, 823, 364, textureX, textureY); // Box 527
		bodyModel[266] = new ModelRendererTurbo(this, 1849, 361, textureX, textureY); // Box 528
		bodyModel[267] = new ModelRendererTurbo(this, 1953, 185, textureX, textureY); // Box 529
		bodyModel[268] = new ModelRendererTurbo(this, 1409, 193, textureX, textureY); // Box 530
		bodyModel[269] = new ModelRendererTurbo(this, 1, 369, textureX, textureY); // Box 531
		bodyModel[270] = new ModelRendererTurbo(this, 881, 369, textureX, textureY); // Box 533
		bodyModel[271] = new ModelRendererTurbo(this, 1161, 369, textureX, textureY); // Box 534
		bodyModel[272] = new ModelRendererTurbo(this, 145, 377, textureX, textureY); // Box 535
		bodyModel[273] = new ModelRendererTurbo(this, 793, 89, textureX, textureY); // Box 536
		bodyModel[274] = new ModelRendererTurbo(this, 1809, 89, textureX, textureY); // Box 537
		bodyModel[275] = new ModelRendererTurbo(this, 505, 97, textureX, textureY); // Box 538
		bodyModel[276] = new ModelRendererTurbo(this, 1481, 97, textureX, textureY); // Box 539
		bodyModel[277] = new ModelRendererTurbo(this, 113, 337, textureX, textureY); // Box 540
		bodyModel[278] = new ModelRendererTurbo(this, 529, 329, textureX, textureY); // Box 541
		bodyModel[279] = new ModelRendererTurbo(this, 1513, 97, textureX, textureY); // Box 542
		bodyModel[280] = new ModelRendererTurbo(this, 289, 105, textureX, textureY); // Box 543
		bodyModel[281] = new ModelRendererTurbo(this, 65, 113, textureX, textureY); // Box 544
		bodyModel[282] = new ModelRendererTurbo(this, 1289, 113, textureX, textureY); // Box 545
		bodyModel[283] = new ModelRendererTurbo(this, 1329, 377, textureX, textureY); // Box 546
		bodyModel[284] = new ModelRendererTurbo(this, 1505, 385, textureX, textureY); // Box 547
		bodyModel[285] = new ModelRendererTurbo(this, 529, 393, textureX, textureY); // Box 548
		bodyModel[286] = new ModelRendererTurbo(this, 1617, 441, textureX, textureY); // Box 549
		bodyModel[287] = new ModelRendererTurbo(this, 625, 449, textureX, textureY); // Box 550
		bodyModel[288] = new ModelRendererTurbo(this, 841, 505, textureX, textureY); // Box 551
		bodyModel[289] = new ModelRendererTurbo(this, 757, 969, textureX, textureY); // Box 552
		bodyModel[290] = new ModelRendererTurbo(this, 1081, 513, textureX, textureY); // Box 553
		bodyModel[291] = new ModelRendererTurbo(this, 241, 545, textureX, textureY); // Box 554
		bodyModel[292] = new ModelRendererTurbo(this, 1369, 521, textureX, textureY); // Box 555
		bodyModel[293] = new ModelRendererTurbo(this, 1681, 649, textureX, textureY); // Box 556
		bodyModel[294] = new ModelRendererTurbo(this, 601, 657, textureX, textureY); // Box 557
		bodyModel[295] = new ModelRendererTurbo(this, 745, 721, textureX, textureY); // Box 558
		bodyModel[296] = new ModelRendererTurbo(this, 1, 729, textureX, textureY); // Box 559
		bodyModel[297] = new ModelRendererTurbo(this, 913, 729, textureX, textureY); // Box 560
		bodyModel[298] = new ModelRendererTurbo(this, 1089, 737, textureX, textureY); // Box 561
		bodyModel[299] = new ModelRendererTurbo(this, 1401, 737, textureX, textureY); // Box 562
		bodyModel[300] = new ModelRendererTurbo(this, 1047, 457, textureX, textureY); // Box 565
		bodyModel[301] = new ModelRendererTurbo(this, 1249, 337, textureX, textureY); // Box 566
		bodyModel[302] = new ModelRendererTurbo(this, 457, 321, textureX, textureY); // Box 567
		bodyModel[303] = new ModelRendererTurbo(this, 529, 345, textureX, textureY); // Box 568
		bodyModel[304] = new ModelRendererTurbo(this, 1289, 337, textureX, textureY); // Box 569
		bodyModel[305] = new ModelRendererTurbo(this, 1025, 369, textureX, textureY); // Box 570
		bodyModel[306] = new ModelRendererTurbo(this, 625, 345, textureX, textureY); // Box 571
		bodyModel[307] = new ModelRendererTurbo(this, 25, 169, textureX, textureY); // Box 572
		bodyModel[308] = new ModelRendererTurbo(this, 905, 169, textureX, textureY); // Box 573
		bodyModel[309] = new ModelRendererTurbo(this, 1281, 177, textureX, textureY); // Box 574
		bodyModel[310] = new ModelRendererTurbo(this, 1329, 177, textureX, textureY); // Box 575
		bodyModel[311] = new ModelRendererTurbo(this, 1625, 249, textureX, textureY); // Box 538
		bodyModel[312] = new ModelRendererTurbo(this, 1337, 137, textureX, textureY); // Box 539
		bodyModel[313] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 540
		bodyModel[314] = new ModelRendererTurbo(this, 1305, 113, textureX, textureY); // Box 541
		bodyModel[315] = new ModelRendererTurbo(this, 1881, 137, textureX, textureY); // Box 542
		bodyModel[316] = new ModelRendererTurbo(this, 1233, 145, textureX, textureY); // Box 543
		bodyModel[317] = new ModelRendererTurbo(this, 1353, 161, textureX, textureY); // Box 544
		bodyModel[318] = new ModelRendererTurbo(this, 449, 153, textureX, textureY); // Box 545
		bodyModel[319] = new ModelRendererTurbo(this, 1673, 49, textureX, textureY); // Box 546
		bodyModel[320] = new ModelRendererTurbo(this, 11, 137, textureX, textureY); // Box 547
		bodyModel[321] = new ModelRendererTurbo(this, 673, 177, textureX, textureY); // Box 548
		bodyModel[322] = new ModelRendererTurbo(this, 1129, 177, textureX, textureY); // Box 549
		bodyModel[323] = new ModelRendererTurbo(this, 409, 57, textureX, textureY); // Box 550
		bodyModel[324] = new ModelRendererTurbo(this, 1193, 89, textureX, textureY); // Box 551
		bodyModel[325] = new ModelRendererTurbo(this, 401, 89, textureX, textureY); // Box 552
		bodyModel[326] = new ModelRendererTurbo(this, 1297, 89, textureX, textureY); // Box 553
		bodyModel[327] = new ModelRendererTurbo(this, 1417, 25, textureX, textureY); // Box 554
		bodyModel[328] = new ModelRendererTurbo(this, 129, 121, textureX, textureY); // Box 555
		bodyModel[329] = new ModelRendererTurbo(this, 65, 177, textureX, textureY); // Box 556
		bodyModel[330] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 557
		bodyModel[331] = new ModelRendererTurbo(this, 505, 81, textureX, textureY); // Box 558
		bodyModel[332] = new ModelRendererTurbo(this, 441, 121, textureX, textureY); // Box 559
		bodyModel[333] = new ModelRendererTurbo(this, 1825, 177, textureX, textureY); // Box 560
		bodyModel[334] = new ModelRendererTurbo(this, 1825, 233, textureX, textureY); // Box 561
		bodyModel[335] = new ModelRendererTurbo(this, 2017, 233, textureX, textureY); // Box 562
		bodyModel[336] = new ModelRendererTurbo(this, 2009, 177, textureX, textureY); // Box 566
		bodyModel[337] = new ModelRendererTurbo(this, 449, 121, textureX, textureY); // Box 567
		bodyModel[338] = new ModelRendererTurbo(this, 1457, 129, textureX, textureY); // Box 568
		bodyModel[339] = new ModelRendererTurbo(this, 369, 185, textureX, textureY); // Box 569
		bodyModel[340] = new ModelRendererTurbo(this, 1705, 185, textureX, textureY); // Box 570
		bodyModel[341] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 571
		bodyModel[342] = new ModelRendererTurbo(this, 681, 185, textureX, textureY); // Box 572
		bodyModel[343] = new ModelRendererTurbo(this, 521, 57, textureX, textureY); // Box 573
		bodyModel[344] = new ModelRendererTurbo(this, 905, 97, textureX, textureY); // Box 574
		bodyModel[345] = new ModelRendererTurbo(this, 25, 193, textureX, textureY); // Box 575
		bodyModel[346] = new ModelRendererTurbo(this, 49, 193, textureX, textureY); // Box 576
		bodyModel[347] = new ModelRendererTurbo(this, 2041, 57, textureX, textureY); // Box 577
		bodyModel[348] = new ModelRendererTurbo(this, 1809, 113, textureX, textureY); // Box 578
		bodyModel[349] = new ModelRendererTurbo(this, 745, 121, textureX, textureY); // Box 579
		bodyModel[350] = new ModelRendererTurbo(this, 625, 129, textureX, textureY); // Box 580
		bodyModel[351] = new ModelRendererTurbo(this, 385, 65, textureX, textureY); // Box 581
		bodyModel[352] = new ModelRendererTurbo(this, 1577, 129, textureX, textureY); // Box 582
		bodyModel[353] = new ModelRendererTurbo(this, 729, 185, textureX, textureY); // Box 583
		bodyModel[354] = new ModelRendererTurbo(this, 1065, 41, textureX, textureY); // Box 584
		bodyModel[355] = new ModelRendererTurbo(this, 81, 121, textureX, textureY); // Box 585
		bodyModel[356] = new ModelRendererTurbo(this, 97, 137, textureX, textureY); // Box 586
		bodyModel[357] = new ModelRendererTurbo(this, 1705, 193, textureX, textureY); // Box 587
		bodyModel[358] = new ModelRendererTurbo(this, 1825, 193, textureX, textureY); // Box 588
		bodyModel[359] = new ModelRendererTurbo(this, 193, 137, textureX, textureY); // Box 589
		bodyModel[360] = new ModelRendererTurbo(this, 193, 193, textureX, textureY); // Box 590
		bodyModel[361] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 591
		bodyModel[362] = new ModelRendererTurbo(this, 1873, 145, textureX, textureY); // Box 592
		bodyModel[363] = new ModelRendererTurbo(this, 497, 201, textureX, textureY); // Box 593
		bodyModel[364] = new ModelRendererTurbo(this, 1721, 65, textureX, textureY); // Box 594
		bodyModel[365] = new ModelRendererTurbo(this, 425, 89, textureX, textureY); // Box 595
		bodyModel[366] = new ModelRendererTurbo(this, 1081, 201, textureX, textureY); // Box 596
		bodyModel[367] = new ModelRendererTurbo(this, 329, 81, textureX, textureY); // Box 597
		bodyModel[368] = new ModelRendererTurbo(this, 689, 153, textureX, textureY); // Box 598
		bodyModel[369] = new ModelRendererTurbo(this, 601, 137, textureX, textureY); // Box 599
		bodyModel[370] = new ModelRendererTurbo(this, 2017, 209, textureX, textureY); // Box 600
		bodyModel[371] = new ModelRendererTurbo(this, 913, 137, textureX, textureY); // Box 601
		bodyModel[372] = new ModelRendererTurbo(this, 1353, 193, textureX, textureY); // Box 602
		bodyModel[373] = new ModelRendererTurbo(this, 345, 137, textureX, textureY); // Box 604
		bodyModel[374] = new ModelRendererTurbo(this, 745, 137, textureX, textureY); // Box 605
		bodyModel[375] = new ModelRendererTurbo(this, 817, 137, textureX, textureY); // Box 606
		bodyModel[376] = new ModelRendererTurbo(this, 1369, 145, textureX, textureY); // Box 607
		bodyModel[377] = new ModelRendererTurbo(this, 905, 209, textureX, textureY); // Box 608
		bodyModel[378] = new ModelRendererTurbo(this, 393, 113, textureX, textureY); // Box 609
		bodyModel[379] = new ModelRendererTurbo(this, 1825, 153, textureX, textureY); // Box 610
		bodyModel[380] = new ModelRendererTurbo(this, 369, 65, textureX, textureY); // Box 611
		bodyModel[381] = new ModelRendererTurbo(this, 897, 81, textureX, textureY); // Box 612
		bodyModel[382] = new ModelRendererTurbo(this, 193, 225, textureX, textureY); // Box 613
		bodyModel[383] = new ModelRendererTurbo(this, 2033, 153, textureX, textureY); // Box 614
		bodyModel[384] = new ModelRendererTurbo(this, 617, 153, textureX, textureY); // Box 615
		bodyModel[385] = new ModelRendererTurbo(this, 569, 129, textureX, textureY); // Box 616
		bodyModel[386] = new ModelRendererTurbo(this, 897, 225, textureX, textureY); // Box 617
		bodyModel[387] = new ModelRendererTurbo(this, 297, 225, textureX, textureY); // Box 618
		bodyModel[388] = new ModelRendererTurbo(this, 1441, 161, textureX, textureY); // Box 619
		bodyModel[389] = new ModelRendererTurbo(this, 193, 233, textureX, textureY); // Box 620
		bodyModel[390] = new ModelRendererTurbo(this, 841, 233, textureX, textureY); // Box 621
		bodyModel[391] = new ModelRendererTurbo(this, 689, 177, textureX, textureY); // Box 622
		bodyModel[392] = new ModelRendererTurbo(this, 897, 233, textureX, textureY); // Box 623
		bodyModel[393] = new ModelRendererTurbo(this, 945, 81, textureX, textureY); // Box 624
		bodyModel[394] = new ModelRendererTurbo(this, 1457, 145, textureX, textureY); // Box 625
		bodyModel[395] = new ModelRendererTurbo(this, 1129, 233, textureX, textureY); // Box 626
		bodyModel[396] = new ModelRendererTurbo(this, 1313, 113, textureX, textureY); // Box 627
		bodyModel[397] = new ModelRendererTurbo(this, 905, 177, textureX, textureY); // Box 628
		bodyModel[398] = new ModelRendererTurbo(this, 1457, 161, textureX, textureY); // Box 629
		bodyModel[399] = new ModelRendererTurbo(this, 1937, 233, textureX, textureY); // Box 630
		bodyModel[400] = new ModelRendererTurbo(this, 2033, 177, textureX, textureY); // Box 631
		bodyModel[401] = new ModelRendererTurbo(this, 193, 241, textureX, textureY); // Box 632
		bodyModel[402] = new ModelRendererTurbo(this, 1329, 137, textureX, textureY); // Box 633
		bodyModel[403] = new ModelRendererTurbo(this, 1633, 137, textureX, textureY); // Box 634
		bodyModel[404] = new ModelRendererTurbo(this, 1689, 137, textureX, textureY); // Box 635
		bodyModel[405] = new ModelRendererTurbo(this, 201, 169, textureX, textureY); // Box 636
		bodyModel[406] = new ModelRendererTurbo(this, 1369, 209, textureX, textureY); // Box 637
		bodyModel[407] = new ModelRendererTurbo(this, 513, 121, textureX, textureY); // Box 638
		bodyModel[408] = new ModelRendererTurbo(this, 345, 185, textureX, textureY); // Box 639
		bodyModel[409] = new ModelRendererTurbo(this, 1033, 65, textureX, textureY); // Box 640
		bodyModel[410] = new ModelRendererTurbo(this, 177, 121, textureX, textureY); // Box 641
		bodyModel[411] = new ModelRendererTurbo(this, 961, 241, textureX, textureY); // Box 642
		bodyModel[412] = new ModelRendererTurbo(this, 1097, 201, textureX, textureY); // Box 643
		bodyModel[413] = new ModelRendererTurbo(this, 465, 185, textureX, textureY); // Box 644
		bodyModel[414] = new ModelRendererTurbo(this, 1969, 137, textureX, textureY); // Box 645
		bodyModel[415] = new ModelRendererTurbo(this, 961, 201, textureX, textureY); // Box 660
		bodyModel[416] = new ModelRendererTurbo(this, 841, 249, textureX, textureY); // Box 661
		bodyModel[417] = new ModelRendererTurbo(this, 441, 281, textureX, textureY); // Box 662
		bodyModel[418] = new ModelRendererTurbo(this, 1969, 201, textureX, textureY); // Box 665
		bodyModel[419] = new ModelRendererTurbo(this, 1129, 209, textureX, textureY); // Box 666
		bodyModel[420] = new ModelRendererTurbo(this, 89, 257, textureX, textureY); // Box 667
		bodyModel[421] = new ModelRendererTurbo(this, 1729, 313, textureX, textureY); // Box 668
		bodyModel[422] = new ModelRendererTurbo(this, 356, 303, textureX, textureY); // Box 669
		bodyModel[423] = new ModelRendererTurbo(this, 1881, 329, textureX, textureY); // Box 670
		bodyModel[424] = new ModelRendererTurbo(this, 1025, 385, textureX, textureY); // Box 671
		bodyModel[425] = new ModelRendererTurbo(this, 1145, 385, textureX, textureY); // Box 672
		bodyModel[426] = new ModelRendererTurbo(this, 1849, 353, textureX, textureY); // Box 669
		bodyModel[427] = new ModelRendererTurbo(this, 161, 337, textureX, textureY); // Box 670
		bodyModel[428] = new ModelRendererTurbo(this, 1225, 369, textureX, textureY); // Box 671
		bodyModel[429] = new ModelRendererTurbo(this, 1825, 249, textureX, textureY); // Box 672
		bodyModel[430] = new ModelRendererTurbo(this, 89, 265, textureX, textureY); // Box 673
		bodyModel[431] = new ModelRendererTurbo(this, 1393, 377, textureX, textureY); // Box 674
		bodyModel[432] = new ModelRendererTurbo(this, 1849, 377, textureX, textureY); // Box 675
		bodyModel[433] = new ModelRendererTurbo(this, 1953, 377, textureX, textureY); // Box 676
		bodyModel[434] = new ModelRendererTurbo(this, 297, 281, textureX, textureY); // Box 677
		bodyModel[435] = new ModelRendererTurbo(this, 1825, 281, textureX, textureY); // Box 678
		bodyModel[436] = new ModelRendererTurbo(this, 313, 393, textureX, textureY); // Box 686
		bodyModel[437] = new ModelRendererTurbo(this, 297, 297, textureX, textureY); // Box 1209
		bodyModel[438] = new ModelRendererTurbo(this, 89, 177, textureX, textureY); // Box 1210
		bodyModel[439] = new ModelRendererTurbo(this, 1433, 193, textureX, textureY); // Box 1211
		bodyModel[440] = new ModelRendererTurbo(this, 1601, 297, textureX, textureY); // Box 1215
		bodyModel[441] = new ModelRendererTurbo(this, 1249, 209, textureX, textureY); // Box 1216
		bodyModel[442] = new ModelRendererTurbo(this, 1729, 209, textureX, textureY); // Box 1217
		bodyModel[443] = new ModelRendererTurbo(this, 1825, 297, textureX, textureY); // Box 693
		bodyModel[444] = new ModelRendererTurbo(this, 849, 217, textureX, textureY); // Box 694
		bodyModel[445] = new ModelRendererTurbo(this, 1433, 217, textureX, textureY); // Box 695
		bodyModel[446] = new ModelRendererTurbo(this, 1689, 329, textureX, textureY); // Box 696
		bodyModel[447] = new ModelRendererTurbo(this, 1081, 225, textureX, textureY); // Box 697
		bodyModel[448] = new ModelRendererTurbo(this, 1489, 225, textureX, textureY); // Box 698
		bodyModel[449] = new ModelRendererTurbo(this, 1105, 65, textureX, textureY); // Box 699
		bodyModel[450] = new ModelRendererTurbo(this, 1297, 65, textureX, textureY); // Box 700
		bodyModel[451] = new ModelRendererTurbo(this, 745, 233, textureX, textureY); // Box 701
		bodyModel[452] = new ModelRendererTurbo(this, 609, 249, textureX, textureY); // Box 702
		bodyModel[453] = new ModelRendererTurbo(this, 1337, 241, textureX, textureY); // Box 703
		bodyModel[454] = new ModelRendererTurbo(this, 961, 337, textureX, textureY); // Box 704
		bodyModel[455] = new ModelRendererTurbo(this, 1073, 337, textureX, textureY); // Box 705
		bodyModel[456] = new ModelRendererTurbo(this, 1121, 337, textureX, textureY); // Box 706
		bodyModel[457] = new ModelRendererTurbo(this, 1505, 249, textureX, textureY); // Box 707
		bodyModel[458] = new ModelRendererTurbo(this, 1609, 313, textureX, textureY); // Box 708
		bodyModel[459] = new ModelRendererTurbo(this, 681, 249, textureX, textureY); // Box 709
		bodyModel[460] = new ModelRendererTurbo(this, 961, 249, textureX, textureY); // Box 710
		bodyModel[461] = new ModelRendererTurbo(this, 1441, 65, textureX, textureY); // Box 675
		bodyModel[462] = new ModelRendererTurbo(this, 1625, 65, textureX, textureY); // Box 676
		bodyModel[463] = new ModelRendererTurbo(this, 817, 73, textureX, textureY); // Box 677
		bodyModel[464] = new ModelRendererTurbo(this, 1049, 81, textureX, textureY); // Box 400
		bodyModel[465] = new ModelRendererTurbo(this, 1105, 81, textureX, textureY); // Box 401
		bodyModel[466] = new ModelRendererTurbo(this, 1441, 81, textureX, textureY); // Box 402
		bodyModel[467] = new ModelRendererTurbo(this, 1137, 145, textureX, textureY); // Box 415
		bodyModel[468] = new ModelRendererTurbo(this, 1225, 145, textureX, textureY); // Box 416
		bodyModel[469] = new ModelRendererTurbo(this, 1505, 145, textureX, textureY); // Box 417
		bodyModel[470] = new ModelRendererTurbo(this, 673, 153, textureX, textureY); // Box 605
		bodyModel[471] = new ModelRendererTurbo(this, 1361, 153, textureX, textureY); // Box 606
		bodyModel[472] = new ModelRendererTurbo(this, 1385, 153, textureX, textureY); // Box 607
		bodyModel[473] = new ModelRendererTurbo(this, 1625, 81, textureX, textureY); // Box 608
		bodyModel[474] = new ModelRendererTurbo(this, 1849, 81, textureX, textureY); // Box 609
		bodyModel[475] = new ModelRendererTurbo(this, 705, 89, textureX, textureY); // Box 610
		bodyModel[476] = new ModelRendererTurbo(this, 17, 105, textureX, textureY); // Box 611
		bodyModel[477] = new ModelRendererTurbo(this, 633, 105, textureX, textureY); // Box 612
		bodyModel[478] = new ModelRendererTurbo(this, 873, 105, textureX, textureY); // Box 613
		bodyModel[479] = new ModelRendererTurbo(this, 1505, 161, textureX, textureY); // Box 614
		bodyModel[480] = new ModelRendererTurbo(this, 1729, 161, textureX, textureY); // Box 615
		bodyModel[481] = new ModelRendererTurbo(this, 1777, 161, textureX, textureY); // Box 616
		bodyModel[482] = new ModelRendererTurbo(this, 1417, 105, textureX, textureY); // Box 617
		bodyModel[483] = new ModelRendererTurbo(this, 1417, 113, textureX, textureY); // Box 618
		bodyModel[484] = new ModelRendererTurbo(this, 1521, 113, textureX, textureY); // Box 619
		bodyModel[485] = new ModelRendererTurbo(this, 17, 121, textureX, textureY); // Box 620
		bodyModel[486] = new ModelRendererTurbo(this, 193, 121, textureX, textureY); // Box 621
		bodyModel[487] = new ModelRendererTurbo(this, 697, 121, textureX, textureY); // Box 622
		bodyModel[488] = new ModelRendererTurbo(this, 873, 121, textureX, textureY); // Box 403
		bodyModel[489] = new ModelRendererTurbo(this, 593, 129, textureX, textureY); // Box 404
		bodyModel[490] = new ModelRendererTurbo(this, 1441, 129, textureX, textureY); // Box 405
		bodyModel[491] = new ModelRendererTurbo(this, 1569, 129, textureX, textureY); // Box 406
		bodyModel[492] = new ModelRendererTurbo(this, 801, 137, textureX, textureY); // Box 407
		bodyModel[493] = new ModelRendererTurbo(this, 841, 137, textureX, textureY); // Box 408
		bodyModel[494] = new ModelRendererTurbo(this, 1905, 137, textureX, textureY); // Box 409
		bodyModel[495] = new ModelRendererTurbo(this, 1889, 145, textureX, textureY); // Box 410
		bodyModel[496] = new ModelRendererTurbo(this, 1441, 153, textureX, textureY); // Box 411
		bodyModel[497] = new ModelRendererTurbo(this, 1825, 161, textureX, textureY); // Box 412
		bodyModel[498] = new ModelRendererTurbo(this, 1833, 161, textureX, textureY); // Box 413
		bodyModel[499] = new ModelRendererTurbo(this, 2033, 161, textureX, textureY); // Box 414

		bodyModel[0].addShapeBox(0F, 0F, 0F, 94, 11, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -0.25F); // Box 0
		bodyModel[0].setRotationPoint(-45F, -56F, 0F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 94, 11, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F); // Box 1
		bodyModel[1].setRotationPoint(-45F, -67F, 0F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 94, 11, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -5.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1F); // Box 2
		bodyModel[2].setRotationPoint(-45F, -78F, 0F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 94, 5, 15, 0F,0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -1.25F, -7F, 0F, -1.25F, -5.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F); // Box 3
		bodyModel[3].setRotationPoint(-45F, -83F, 0F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 50, 11, 3, 0F,0F, 0F, -0.75F, 0F, 0F, 2F, 0F, 0F, -3.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -3.25F, 0F, 0F, -0.5F); // Box 4
		bodyModel[4].setRotationPoint(49F, -56F, 21F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 50, 11, 3, 0F,0F, 0F, 1.25F, 0F, 0F, 3.25F, 0F, 0F, -4.5F, 0F, 0F, -2.5F, 0F, 0F, -0.75F, 0F, 0F, 2F, 0F, 0F, -3.25F, 0F, 0F, -0.75F); // Box 5
		bodyModel[5].setRotationPoint(49F, -67F, 21F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 94, 19, 3, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, -0.25F, 0F, 0F, 1.75F, 0F, 0F, 5F, 0F, 0F, -4F, 0F, 0F, -2.25F); // Box 6
		bodyModel[6].setRotationPoint(-45F, -45F, 22F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 50, 19, 3, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -3.25F, 0F, 0F, -0.5F, 0F, 0F, 3.75F, 0F, -3F, 4.75F, 0F, -3F, -6F, 0F, 0F, -3F); // Box 7
		bodyModel[7].setRotationPoint(49F, -45F, 21F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 50, 11, 3, 0F,0F, 0F, 1.25F, 0F, 0F, 2.5F, 0F, 0F, -3.75F, 0F, 0F, -2.75F, 0F, 0F, -4.75F, 0F, 0F, -2.75F, 0F, 0F, 1.5F, 0F, 0F, 3.5F); // Box 8
		bodyModel[8].setRotationPoint(49F, -78F, 15F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 50, 4, 14, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.75F, -6.5F, 0F, -0.25F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 1.25F); // Box 9
		bodyModel[9].setRotationPoint(49F, -82F, 0F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 50, 16, 2, 0F,0F, 0F, 0F, 0F, 1.5F, 3.5F, 0F, 1.5F, -3.75F, 0F, 0F, -0.25F, 0F, 0F, 2.75F, 0F, -5.25F, 6.25F, 0F, -5.25F, -6.75F, 0F, 0F, -3F); // Box 10
		bodyModel[10].setRotationPoint(99F, -45F, 19F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 50, 11, 21, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, -3F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, -5.25F, 0F, 0F, -9.25F, -6.5F, 0F, -2.5F, -6.75F); // Box 11
		bodyModel[11].setRotationPoint(49F, -26F, 0F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 50, 8, 18, 0F,0F, 0F, 0F, 0F, 5.5F, 0F, 0F, 5.25F, -3.75F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, -7.5F, 0F, 0F, -9.5F, -7.75F, 0F, -3.25F, -3.5F); // Box 12
		bodyModel[12].setRotationPoint(99F, -29F, 0F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 50, 4, 13, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, -6.5F, 0F, -0.75F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 1.25F); // Box 13
		bodyModel[13].setRotationPoint(99F, -82F, 0F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 50, 11, 3, 0F,0F, 0F, 1.5F, 0F, 0F, 3.25F, 0F, 0F, -4.75F, 0F, 0F, -2.75F, 0F, 0F, -3.75F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, 2.5F); // Box 14
		bodyModel[14].setRotationPoint(99F, -78F, 14F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 27, 11, 3, 0F,0F, 0F, 1.5F, 0F, 0F, 3F, 0F, 0F, -4.25F, 0F, 0F, -2.75F, 0F, 0F, 0F, 0F, 0F, 2.25F, 0F, 0F, -3.5F, 0F, 0F, -1.5F); // Box 15
		bodyModel[15].setRotationPoint(122F, -67F, 18F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 27, 10, 3, 0F,0F, 0F, -1F, 0F, 0F, 1.25F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0.25F, -0.25F, 0F, -0.5F, 1.5F, 0F, -0.5F, -2.75F, 0F, 0.25F, -0.9F); // Box 16
		bodyModel[16].setRotationPoint(122F, -56F, 17F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 23, 7, 3, 0F,0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, -1.65F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, -0.75F, 0.75F, 0F, -0.75F, -1.9F, 0F, 0F, -0.25F); // Box 17
		bodyModel[17].setRotationPoint(99F, -52F, 18F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 50, 5, 14, 0F,0F, 0.5F, 0F, 0F, 7.5F, 0F, 0F, 7.5F, -3.25F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0F, 0F, -9F, 0F, 0F, -10.25F, -6.5F, 0F, -1.5F, -3.75F); // Box 18
		bodyModel[18].setRotationPoint(149F, -34F, 0F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 26, 19, 3, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1.75F, 0F, 0F, -2.25F, 0F, 0F, -2F); // Box 19
		bodyModel[19].setRotationPoint(-71F, -45F, 22F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 24, 19, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2.75F); // Box 20
		bodyModel[20].setRotationPoint(-95F, -45F, 22F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 119, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[21].setRotationPoint(-71F, -45F, 9F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 19, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.75F, 0F, 0F, -3.75F); // Box 22
		bodyModel[22].setRotationPoint(48F, -45F, 6F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 24, 13, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -3F, -6.25F, 0F, -3.25F, -7.75F); // Box 23
		bodyModel[23].setRotationPoint(-95F, -26F, 0F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 51, 19, 2, 0F,0F, 0F, 2.25F, 0F, 0F, -2F, 0F, 0F, 2.25F, 0F, 0F, -2.75F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -5.75F); // Box 24
		bodyModel[24].setRotationPoint(-146F, -45F, 20F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 51, 8, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 4.5F, 0F, 0F, 1.75F, -1.75F, 0F, -2F, -5.25F); // Box 25
		bodyModel[25].setRotationPoint(-146F, -26F, 0F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 29, 8, 16, 0F,0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0.25F, 0F, -1F, -5.5F, 0F, -1.5F, 0F, 0F, 2F, 0F, 0F, 0F, -5.25F, 0F, -3F, -9.25F); // Box 26
		bodyModel[26].setRotationPoint(-175F, -28F, 0F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 29, 18, 2, 0F,0F, 0F, -4F, 0F, 0F, -9.75F, 0F, 0F, 9.25F, 0F, 0F, 4.25F, 0F, 0F, -0.5F, 0F, 1F, -5F, 0F, 1F, 6.25F, 0F, 0F, 0.5F); // Box 27
		bodyModel[27].setRotationPoint(-175F, -45F, 8F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 120, 1, 3, 0F,0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0.25F, 0F, 0.5F, 0F, 0F, -1.25F, 0F, 0F, -2F, 0F, 0F, -0.25F, 0.25F); // Box 28
		bodyModel[28].setRotationPoint(-71F, -14F, 0F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 59, 9, 2, 0F,0F, 0F, 1F, 0F, 0F, 2.75F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, -1.25F, 4.5F, 0F, -1.5F, 7.75F, 0F, -0.5F, -7.75F, 0F, 0F, -4.5F); // Box 29
		bodyModel[29].setRotationPoint(-10F, -26F, 20F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 4, 9, 2, 0F,0F, 0F, 0.75F, 0F, 0F, 1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -1.25F, 4.25F, 0F, -1.25F, 4.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F); // Box 30
		bodyModel[30].setRotationPoint(-14F, -26F, 20F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 57, 9, 2, 0F,0F, 0F, -1F, 0F, 0F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, 1F, 0F, 0F, 5.5F, 0F, -1.25F, 4.25F, 0F, 0F, -4.5F, 0F, 1F, -6.25F); // Box 31
		bodyModel[31].setRotationPoint(-71F, -26F, 20F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 26, 11, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, -0.25F, 0F, 0F, 0F); // Box 32
		bodyModel[32].setRotationPoint(-71F, -56F, 23F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 24, 11, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0.75F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -0.75F); // Box 33
		bodyModel[33].setRotationPoint(-95F, -56F, 23F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 26, 11, 2, 0F,0F, 0F, 1.5F, 0F, 0F, 1.75F, 0F, 0F, -2F, 0F, 0F, -2.5F, 0F, 0F, 0.25F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -0.5F); // Box 34
		bodyModel[34].setRotationPoint(-71F, -67F, 23F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 11, 11, 2, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.75F); // Box 35
		bodyModel[35].setRotationPoint(-82F, -67F, 23F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 5, 11, 2, 0F,0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F, 0F, -2.75F, 0F, 0F, -2.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -1F); // Box 36
		bodyModel[36].setRotationPoint(-95F, -67F, 23F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 26, 11, 2, 0F,0F, 0F, 7.25F, 0F, 0F, 6.75F, 0F, 0F, -6.75F, 0F, 0F, -7.25F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 37
		bodyModel[37].setRotationPoint(-71F, -78F, 21F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 8, 5, 2, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, -1.65F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 38
		bodyModel[38].setRotationPoint(-90F, -61F, 23F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 24, 11, 2, 0F,0F, 0F, 7.25F, 0F, 0F, 7.25F, 0F, 0F, -7.25F, 0F, 0F, -7.75F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F); // Box 39
		bodyModel[39].setRotationPoint(-95F, -78F, 21F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 59, 9, 2, 0F,0F, 1.25F, -0.5F, 0F, 1.5F, 2.75F, 0F, 0.5F, -2.75F, 0F, 0F, 0.5F, 0F, -6.75F, 12F, 0F, -7.5F, 12.25F, 0F, -7F, -14.25F, 0F, -6.25F, -14F); // Box 40
		bodyModel[40].setRotationPoint(-10F, -17F, 15F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 57, 9, 2, 0F,0F, 0F, 0.5F, 0F, 1.25F, -0.75F, 0F, 0F, 0.5F, 0F, -1F, -1.25F, 0F, -6F, 11.75F, 0F, -6.75F, 12F, 0F, -6.25F, -14F, 0F, -5.25F, -13.75F); // Box 41
		bodyModel[41].setRotationPoint(-71F, -17F, 15F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,0F, 1.25F, 0.25F, 0F, 1.25F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2.75F, 13F, 0F, -2.75F, 13F, 0F, -2.25F, -14F, 0F, -2.25F, -14F); // Box 42
		bodyModel[42].setRotationPoint(-14F, -17F, 16F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 50, 12, 5, 0F,0F, 0.5F, -3.5F, 0F, 3F, 0F, 0F, 3F, -3.25F, 0F, 0.5F, 0.25F, 0F, -0.25F, -0.75F, 0F, -7.5F, 3F, 0F, -7.5F, -6.25F, 0F, -0.25F, -2.75F); // Box 43
		bodyModel[43].setRotationPoint(149F, -46F, 12F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 17, 1, 9, 0F,0F, 0.5F, 0F, 0F, 0.75F, 0F, 0F, -0.25F, 0.25F, 3.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.25F, 3.75F, 0.75F, 0F); // Box 44
		bodyModel[44].setRotationPoint(-62F, -82F, 0F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 21, 1, 9, 0F,-0.25F, -0.5F, 0F, 0F, -0.25F, -0.25F, 0F, -4F, -1.75F, 0F, -4F, -2.25F, -0.25F, 0.75F, 0F, 0F, 0.5F, -0.25F, 0F, 3F, -3.75F, 0F, 3F, -4F); // Box 45
		bodyModel[45].setRotationPoint(-66F, -82F, 9F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 7, 1, 9, 0F,-0.25F, -0.5F, -0.75F, 0.25F, -0.5F, 0F, 0F, -4F, -2.25F, 0F, -4F, -2.25F, -0.25F, 0.75F, -1F, 0.25F, 0.75F, 0F, 0F, 3F, -4F, 0F, 3F, -4.25F); // Box 46
		bodyModel[46].setRotationPoint(-73F, -82F, 9F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 7, 1, 9, 0F,0.25F, -0.5F, 0F, 0.25F, -0.5F, -0.75F, 0F, -4F, -2.25F, 0F, -4F, -2.25F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, -1F, 0F, 3F, -4.25F, 0F, 3F, -4F); // Box 47
		bodyModel[47].setRotationPoint(-80F, -82F, 9F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 11, 1, 9, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 3.75F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.75F, 0.75F, 0F, 0F, 0.5F, 0.25F); // Box 48
		bodyModel[48].setRotationPoint(-95F, -82F, 0F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 15, 1, 9, 0F,0F, -0.25F, 0F, -0.25F, -0.5F, 0F, 0F, -4F, -2.25F, 0F, -4F, -2.75F, 0F, 0.5F, -0.25F, -0.25F, 0.75F, 0F, 0F, 3F, -4F, 0F, 3F, -4F); // Box 49
		bodyModel[49].setRotationPoint(-95F, -82F, 9F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 51, 11, 2, 0F,0F, 0F, -0.75F, 0F, 0F, -5.75F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -5.25F, 0F, 0F, 5.25F, 0F, 0F, 0.25F); // Box 50
		bodyModel[50].setRotationPoint(-146F, -56F, 17F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 27, 11, 2, 0F,0F, -1.25F, 3F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -1.25F, -3.5F, 0F, 0F, 1F, 0F, 0F, -1.75F, 0F, 0F, 1F, 0F, 0F, -1.5F); // Box 51
		bodyModel[51].setRotationPoint(-122F, -67F, 21F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 24, 11, 2, 0F,0F, -2.5F, 3.5F, 0F, -1.25F, 1F, 0F, -1.25F, -1.5F, 0F, -2.5F, -3.75F, 0F, 0F, 1.25F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -2F); // Box 52
		bodyModel[52].setRotationPoint(-146F, -67F, 19F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 50, 10, 5, 0F,0F, 0F, -3.75F, 0F, 1F, 0F, 0F, 1F, -3F, 0F, 0F, 0.5F, 0F, -0.5F, -3.5F, 0F, -3F, 0F, 0F, -3F, -3.25F, 0F, -0.5F, 0.25F); // Box 56
		bodyModel[53].setRotationPoint(149F, -56F, 12F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 50, 10, 5, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3.25F, 0F, 0F, -0.25F, 0F, 1F, -3.75F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 1F, 0.5F); // Box 57
		bodyModel[54].setRotationPoint(149F, -67F, 12F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 50, 11, 5, 0F,0F, 0F, 1.25F, 0F, 0F, 4.75F, 0F, 0F, -7F, 0F, 0F, -4.75F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3.25F, 0F, 0F, -0.25F); // Box 58
		bodyModel[55].setRotationPoint(149F, -78F, 12F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 50, 3, 12, 0F,0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -6.75F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0.25F); // Box 59
		bodyModel[56].setRotationPoint(149F, -81F, 0F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 24, 7, 5, 0F,0F, 0F, -4F, 0F, 2F, -2.25F, 0F, 2F, -1.5F, 0F, 0F, 0.75F, 0F, 0.5F, -1F, 0F, -3.5F, 0F, 0F, -3.5F, -4F, 0F, 0.5F, -2.25F); // Box 60
		bodyModel[57].setRotationPoint(199F, -49F, 8F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 24, 3, 10, 0F,0F, -0.5F, 0F, 0F, 3.5F, 0F, 0F, 3.5F, -1F, 0F, -0.5F, 0.75F, 0F, 1F, 0F, 0F, -4F, 0F, 0F, -4.75F, -4.75F, 0F, -0.25F, -2.5F); // Box 61
		bodyModel[58].setRotationPoint(199F, -42F, 0F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 24, 7, 5, 0F,0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 1F, -4F, 0F, -1F, -2.25F, 0F, -1F, -1.5F, 0F, 1F, 0.75F); // Box 62
		bodyModel[59].setRotationPoint(199F, -57F, 8F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 24, 10, 6, 0F,0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -0.25F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 63
		bodyModel[60].setRotationPoint(199F, -67F, 8F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 24, 11, 6, 0F,0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, -1F, -3.5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -0.25F); // Box 64
		bodyModel[61].setRotationPoint(199F, -78F, 8F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 24, 3, 10, 0F,0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -1F, -4F, 0F, -0.5F, -4.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0.5F, 0F, 0F, 0F); // Box 65
		bodyModel[62].setRotationPoint(199F, -81F, 0F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 20, 5, 11, 0F,0F, 0F, 0F, 1.25F, 0F, 0F, -2.75F, 0F, -2.25F, 0F, 0F, 1F, 0F, 1F, 0F, 0F, -1F, 0F, -3F, -1F, -3.25F, 0F, 1F, 0.5F); // Box 66
		bodyModel[63].setRotationPoint(223F, -57F, 0F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 20, 5, 11, 0F,0F, 0F, 0F, 0F, 2F, 0F, -3F, 2F, -3.25F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, -3F, -2.5F, 0F, -4.75F, -2.25F, -5.25F, 0F, 0.5F, -2F); // Box 67
		bodyModel[64].setRotationPoint(223F, -51F, 0F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 17, 2, 9, 0F,0F, 0.5F, 0F, 0F, 3.5F, 0F, -1.75F, 3.25F, -3.25F, 0F, 0.5F, 0F, 0F, 0F, 0F, -4F, -3.25F, 0F, -5F, -3F, -5.75F, 0F, -0.75F, -3.75F); // Box 68
		bodyModel[65].setRotationPoint(223F, -45F, 0F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 29, 11, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -5.75F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.75F, 0F, 0F, 5.25F, 0F, 0F, 0.25F); // Box 69
		bodyModel[66].setRotationPoint(-175F, -56F, 12F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 29, 10, 2, 0F,0F, -3.75F, 3F, 0F, -1.5F, -1.5F, 0F, -1.5F, 1.25F, 0F, -3.75F, -3.5F, 0F, 0F, 1.5F, 0F, 0F, -3.75F, 0F, 0F, 3F, 0F, 0F, -2F); // Box 71
		bodyModel[67].setRotationPoint(-175F, -66F, 14F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 29, 5, 2, 0F,0F, -2.5F, 1.25F, 0F, 0.25F, -2.75F, 0F, 1F, 1.25F, 0F, -1.75F, -2.5F, 0F, -0.25F, -1F, 0F, -2.5F, -5.5F, 0F, -2.5F, 5.25F, 0F, -0.25F, 0.5F); // Box 154
		bodyModel[68].setRotationPoint(-175F, -67F, 10F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 24, 1, 4, 0F,0F, 1F, 0F, 0F, 3.25F, 0F, 0F, 1F, 3.25F, 0F, -1.25F, 0.25F, 0F, -1.5F, 0F, 0F, -3F, 0F, 0F, -1.25F, 2.75F, 0F, 1F, -0.5F); // Box 155
		bodyModel[69].setRotationPoint(-170F, -67F, 6F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F,0F, 0F, 0.25F, 0F, 1F, 0F, 0F, -1.25F, 0.25F, 0F, -1.75F, -0.5F, 0F, -0.25F, 0.25F, 0F, -1.5F, 0F, 0F, 1F, -0.5F, 0F, 1.5F, -1.25F); // Box 156
		bodyModel[70].setRotationPoint(-175F, -67F, 6F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 24, 5, 2, 0F,0F, -1.75F, 2.25F, 0F, -0.5F, 1.25F, 0F, 0.25F, -2.5F, 0F, -1F, -3.75F, 0F, -0.5F, -0.5F, 0F, -1.75F, -3F, 0F, -1.75F, 2.5F, 0F, -0.5F, 0.25F); // Box 157
		bodyModel[71].setRotationPoint(-146F, -69F, 15F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 4, 14, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, 2.75F, 0F, 0F, 2.75F, 0F, 0F, -2.65F, 0F, 0F, -2.75F); // Box 159
		bodyModel[72].setRotationPoint(-179F, -45F, 12F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 4, 11, 2, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.75F); // Box 160
		bodyModel[73].setRotationPoint(-179F, -56F, 12F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 4, 6, 2, 0F,0F, -0.25F, 0.75F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, -0.25F, -1.5F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 0.25F); // Box 161
		bodyModel[74].setRotationPoint(-179F, -62F, 11F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -1F, 0.5F, 0F, -0.5F, 0.25F, 0F, 0.25F, -0.5F, 0F, -0.75F, -0.75F, 0F, 0.25F, -1.25F, 0F, -0.25F, -2F, 0F, -0.25F, 2.5F, 0F, 0.25F, 1.5F); // Box 162
		bodyModel[75].setRotationPoint(-179F, -65F, 9F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, -1F, 0F, 0F, 0F, 0.25F, 0F, -1.75F, 0.5F, 0F, -2.75F, 0.25F, 0F, 0.75F, 0.25F, 0F, -0.25F, 0.25F, 0F, 1.5F, -0.25F, 0F, 2F, -0.5F); // Box 163
		bodyModel[76].setRotationPoint(-179F, -67F, 6F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.25F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, -0.25F, 0F, 0.75F, -0.25F); // Box 164
		bodyModel[77].setRotationPoint(-179F, -67F, 2F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F); // Box 165
		bodyModel[78].setRotationPoint(-179F, -67F, 0F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.35F, 0F, 0F, 0.25F, -2F, 0F, 0.75F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, -2F, 0F, -1.25F); // Box 166
		bodyModel[79].setRotationPoint(-179F, -31F, 9F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0.25F, -2F, 0.25F, 2.75F, 0F, 0.25F, 2.75F, 0F, 0F, -2.75F, -2F, 0F, -2.75F); // Box 167
		bodyModel[80].setRotationPoint(-177F, -27F, 8.5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 9, 4, 5, 0F,0F, 0F, 0F, 0F, -1.75F, -2.25F, 0F, -1.75F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, -2.25F, 0F, -1.25F, -2F, 0F, 0F, 0F); // Box 813
		bodyModel[81].setRotationPoint(43F, -90F, -2.5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 39, 31, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.75F, 0F, -0.5F); // Box 185
		bodyModel[82].setRotationPoint(173F, -98F, 87.5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 16, 24, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		bodyModel[83].setRotationPoint(196F, -122F, 87.5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 23, 24, 2, 0F,-7.75F, -9.75F, 0F, 0F, 0F, 0F, 0F, -2.25F, -0.75F, -9.25F, -10.75F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.75F, 0F, -0.5F); // Box 187
		bodyModel[84].setRotationPoint(173F, -122F, 87.5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 23, 24, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.75F, 0F, -0.5F, -7.75F, -9.75F, 0F, 0F, 0F, 0F, 0F, -2.25F, -0.75F, -9.25F, -10.75F, -1F); // Box 188
		bodyModel[85].setRotationPoint(173F, -67F, 87.5F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 16, 24, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2.25F, -0.75F); // Box 189
		bodyModel[86].setRotationPoint(196F, -67F, 87.5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 23, 24, 2, 0F,0F, 0F, 0F, -7.75F, -9.75F, 0F, -9.25F, -10.75F, -1F, 0F, -2.25F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, -3.25F, 0F, -1.25F, 0F, 0F, -0.5F); // Box 190
		bodyModel[87].setRotationPoint(212F, -122F, 87.5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 23, 24, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3.75F, 0F, -1F, 0F, 0F, -0.75F, 0F, 0F, 0F, -7.75F, -9.75F, 0F, -9.25F, -10.75F, -1.5F, 0F, -2.25F, -1.25F); // Box 191
		bodyModel[88].setRotationPoint(212F, -67F, 87.5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 23, 31, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3.75F, 0F, -1.25F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -3.75F, 0F, -1F, 0F, 0F, -0.75F); // Box 192
		bodyModel[89].setRotationPoint(212F, -98F, 87.5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 23, 31, 2, 0F,0F, 0F, -0.5F, -3.75F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -3.75F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[90].setRotationPoint(212F, -98F, 85.5F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 39, 31, 2, 0F,-3.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[91].setRotationPoint(173F, -98F, 85.5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 16, 24, 2, 0F,0F, -2.25F, -0.75F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		bodyModel[92].setRotationPoint(196F, -122F, 85.5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 23, 24, 2, 0F,0F, -2.25F, -1.25F, -9.25F, -10.75F, -1F, -7.75F, -9.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -3.25F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[93].setRotationPoint(212F, -122F, 85.5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 23, 24, 2, 0F,-9.25F, -10.75F, -1F, 0F, -2.25F, -0.75F, 0F, 0F, 0F, -7.75F, -9.75F, 0F, -3.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		bodyModel[94].setRotationPoint(173F, -122F, 85.5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 23, 24, 2, 0F,0F, 0F, -0.75F, -3.75F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, -1.25F, -9.25F, -10.75F, -1.5F, -7.75F, -9.75F, 0F, 0F, 0F, 0F); // Box 198
		bodyModel[95].setRotationPoint(212F, -67F, 85.5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 16, 24, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, -0.75F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		bodyModel[96].setRotationPoint(196F, -67F, 85.5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 23, 24, 2, 0F,-3.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9.25F, -10.75F, -1F, 0F, -2.25F, -0.75F, 0F, 0F, 0F, -7.75F, -9.75F, 0F); // Box 200
		bodyModel[97].setRotationPoint(173F, -67F, 85.5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 5, 6, 77, 0F,0F, -3F, 0F, 0F, -0.75F, 3F, 0F, -0.75F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -3F, 0F); // Box 201
		bodyModel[98].setRotationPoint(181F, -81F, 9F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 13, 5, 77, 0F,0F, -0.25F, 3F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.25F, 0F); // Box 202
		bodyModel[99].setRotationPoint(186F, -80.5F, 9F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 13, 5, 77, 0F,0F, 0F, 4F, 0F, -1.75F, 3F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.75F, 0F); // Box 203
		bodyModel[100].setRotationPoint(199F, -80.5F, 9F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 18, 3, 11, 0F,0F, 0.25F, 1.5F, -0.25F, -2.5F, -1F, 0F, -2.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.25F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0.25F, 0F); // Box 204
		bodyModel[101].setRotationPoint(212F, -78.5F, 9F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 18, 3, 56, 0F,0F, 0.25F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F); // Box 205
		bodyModel[102].setRotationPoint(212F, -78.5F, 20F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 18, 3, 7, 0F,0F, 0.25F, 0F, 0F, -2.5F, 0F, -11.75F, -1.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, -11.75F, -1.5F, 0F, 0F, 0.25F, 0F); // Box 206
		bodyModel[103].setRotationPoint(212F, -78.5F, 76F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 4.25F, 0F, 1.25F, 4.25F, 0F, -1.5F, 0F, 0F, 0F); // Box 207
		bodyModel[104].setRotationPoint(223F, -62F, 11F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F); // Box 208
		bodyModel[105].setRotationPoint(223F, -67F, 11F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,0F, 0F, 1F, 1.25F, 0F, 1F, 1.25F, 0F, -1F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F); // Box 209
		bodyModel[106].setRotationPoint(223F, -72F, 11F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 5, 6, 1, 0F,0F, -0.75F, 1F, 1.75F, -2F, 0.5F, 1.75F, -2F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0.25F); // Box 210
		bodyModel[107].setRotationPoint(223F, -78F, 10F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, -0.25F, 0F, 0.75F, -4F, 1.5F, 0F, -3F, 1.5F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0.75F, 3F, 0.5F, 0F, 1.75F, 0F); // Box 211
		bodyModel[108].setRotationPoint(223F, -80F, 6F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, 0.5F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F); // Box 212
		bodyModel[109].setRotationPoint(223F, -80F, 0F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 9, 7, 200, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 9F, 11.25F, 0F, -12F, 11.25F, 0F, -1.5F, -2.25F, 0F, 0F, 0.75F, 0F, 9F, -14.75F, 0F, -14.5F, -15.75F, 0F); // Box 213
		bodyModel[110].setRotationPoint(-58F, -63F, 23F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 9, 7, 200, 0F,-1.5F, -2.25F, 1.5F, 0F, 0.75F, 2.75F, 9F, 8.5F, 0F, -14F, 6.75F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 9F, -11.25F, 0F, -12F, -11.25F, 0F); // Box 214
		bodyModel[111].setRotationPoint(-58F, -70F, 23F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 15, 7, 203, 0F,0F, -0.25F, 0F, 0F, 2.5F, 1.5F, 9F, 9.25F, 0F, -9F, 7.5F, 0F, 0F, 0F, -2.5F, 0F, 0F, -1F, 9F, -10.25F, 0F, -9F, -10.25F, 0F); // Box 215
		bodyModel[112].setRotationPoint(-49F, -71F, 20F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 15, 7, 203, 0F,0F, 0F, -1.75F, 0F, 0F, -1F, 9F, 10.25F, 0F, -9F, 10.25F, 0F, 0F, 2F, -2.5F, 0F, 4F, -0.75F, 9F, -12.75F, 0F, -9F, -13.75F, 0F); // Box 216
		bodyModel[113].setRotationPoint(-49F, -64F, 20F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 40, 7, 203, 0F,0F, -0.5F, 2F, 9.75F, -13.5F, 0F, -8.5F, 1F, 0F, -9F, 6.25F, 0F, 0F, 0F, 0F, 10F, 8.75F, 0F, -8.5F, -6.75F, 0F, -9F, -7.25F, 0F); // Box 217
		bodyModel[114].setRotationPoint(-34F, -74F, 20F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 40, 7, 203, 0F,0F, 0F, 0F, 10F, -8.5F, 0F, -8.5F, 6.75F, 0F, -9F, 7.25F, 0F, 0F, 7F, -0.5F, 9.75F, 5.25F, 0F, -8.25F, -10.5F, 0F, -9F, -9.75F, 0F); // Box 218
		bodyModel[115].setRotationPoint(-34F, -67F, 20F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 14, 5, 203, 0F,0.25F, 0.5F, 0F, 1.75F, -5.25F, 0F, -16.75F, 10.75F, 0F, 18.5F, 15F, 0F, 0.25F, 0.25F, 0F, 1.75F, 0.25F, 0F, -16.75F, -15.75F, 0F, 18.25F, -15.5F, 0F); // Box 208
		bodyModel[116].setRotationPoint(16F, -60F, 20F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 94, 11, 25, 0F,0F, 0F, -1F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 209
		bodyModel[117].setRotationPoint(-45F, -56F, -25F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 94, 11, 24, 0F,0F, 0F, -1F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		bodyModel[118].setRotationPoint(-45F, -67F, -24F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 94, 11, 22, 0F,0F, 0F, -5.75F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
		bodyModel[119].setRotationPoint(-45F, -78F, -22F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 94, 5, 15, 0F,0F, -1.25F, -5.75F, 0F, -1.25F, -7F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, 1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 212
		bodyModel[120].setRotationPoint(-45F, -83F, -15F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 50, 11, 3, 0F,0F, 0F, -0.75F, 0F, 0F, -3.25F, 0F, 0F, 2F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -3.25F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 213
		bodyModel[121].setRotationPoint(49F, -56F, -24F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 50, 11, 3, 0F,0F, 0F, -2.5F, 0F, 0F, -4.5F, 0F, 0F, 3.25F, 0F, 0F, 1.25F, 0F, 0F, -0.75F, 0F, 0F, -3.25F, 0F, 0F, 2F, 0F, 0F, -0.75F); // Box 214
		bodyModel[122].setRotationPoint(49F, -67F, -24F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 94, 19, 3, 0F,0F, 0F, -0.25F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2.25F, 0F, 0F, -4F, 0F, 0F, 5F, 0F, 0F, 1.75F); // Box 215
		bodyModel[123].setRotationPoint(-45F, -45F, -25F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 50, 19, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -3.25F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, -6F, 0F, -3F, 4.75F, 0F, 0F, 3.75F); // Box 216
		bodyModel[124].setRotationPoint(49F, -45F, -24F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 50, 11, 3, 0F,0F, 0F, -2.75F, 0F, 0F, -3.75F, 0F, 0F, 2.5F, 0F, 0F, 1.25F, 0F, 0F, 3.5F, 0F, 0F, 1.5F, 0F, 0F, -2.75F, 0F, 0F, -4.75F); // Box 217
		bodyModel[125].setRotationPoint(49F, -78F, -18F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 50, 4, 14, 0F,0F, -0.25F, -6F, 0F, -0.75F, -6.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 1.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 218
		bodyModel[126].setRotationPoint(49F, -82F, -14F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 50, 16, 2, 0F,0F, 0F, -0.25F, 0F, 1.5F, -3.75F, 0F, 1.5F, 3.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -5.25F, -6.75F, 0F, -5.25F, 6.25F, 0F, 0F, 2.75F); // Box 219
		bodyModel[127].setRotationPoint(99F, -45F, -21F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 50, 11, 21, 0F,0F, 0F, 0F, 0F, 3F, -3F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, -2.5F, -6.75F, 0F, -9.25F, -6.5F, 0F, -5.25F, 0F, 0F, 0.75F, 0F); // Box 220
		bodyModel[128].setRotationPoint(49F, -26F, -21F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 50, 8, 18, 0F,0F, 0F, 0F, 0F, 5.25F, -3.75F, 0F, 5.5F, 0F, 0F, 0F, 0F, 0F, -3.25F, -3.5F, 0F, -9.5F, -7.75F, 0F, -7.5F, 0F, 0F, 0.75F, 0F); // Box 221
		bodyModel[129].setRotationPoint(99F, -29F, -18F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 50, 4, 13, 0F,0F, -0.75F, -5.5F, 0F, -1F, -6.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 222
		bodyModel[130].setRotationPoint(99F, -82F, -13F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 50, 11, 3, 0F,0F, 0F, -2.75F, 0F, 0F, -4.75F, 0F, 0F, 3.25F, 0F, 0F, 1.5F, 0F, 0F, 2.5F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, -3.75F); // Box 223
		bodyModel[131].setRotationPoint(99F, -78F, -17F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 27, 11, 3, 0F,0F, 0F, -2.75F, 0F, 0F, -4.25F, 0F, 0F, 3F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -3.5F, 0F, 0F, 2.25F, 0F, 0F, 0F); // Box 224
		bodyModel[132].setRotationPoint(122F, -67F, -21F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 50, 5, 14, 0F,0F, 0.25F, 0.25F, 0F, 7.5F, -3.25F, 0F, 7.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, -3.75F, 0F, -10.25F, -6.5F, 0F, -9F, 0F, 0F, 0.5F, 0F); // Box 227
		bodyModel[133].setRotationPoint(149F, -34F, -14F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 26, 19, 3, 0F,0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2.25F, 0F, 0F, 1.75F, 0F, 0F, 1F); // Box 228
		bodyModel[134].setRotationPoint(-71F, -45F, -25F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 24, 19, 4, 0F,0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1.25F, 0F, 0F, -2.75F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 229
		bodyModel[135].setRotationPoint(-95F, -45F, -25F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 119, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 230
		bodyModel[136].setRotationPoint(-71F, -45F, -22F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 19, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.75F, 0F, 0F, -3.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 231
		bodyModel[137].setRotationPoint(48F, -45F, -21F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 24, 13, 22, 0F,0F, 0F, 0.25F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.25F, -7.75F, 0F, -3F, -6.25F, 0F, 0.5F, 0F, 0F, -0.5F, 0F); // Box 232
		bodyModel[138].setRotationPoint(-95F, -26F, -22F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 51, 19, 2, 0F,0F, 0F, -2.75F, 0F, 0F, 2.25F, 0F, 0F, -2.25F, 0F, 0F, 2.25F, 0F, 0F, -5.75F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 7F); // Box 233
		bodyModel[139].setRotationPoint(-146F, -45F, -22F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 51, 8, 16, 0F,0F, 0F, 0.25F, 0F, 0F, 6.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -5.25F, 0F, 1.75F, -1.75F, 0F, 4.5F, 0F, 0F, 0F, 0F); // Box 234
		bodyModel[140].setRotationPoint(-146F, -26F, -16F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 29, 8, 16, 0F,0F, -1F, -5.5F, 0F, -2F, 0.25F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -3F, -9.25F, 0F, 0F, -5.25F, 0F, 2F, 0F, 0F, -1.5F, 0F); // Box 235
		bodyModel[141].setRotationPoint(-175F, -28F, -16F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 29, 18, 2, 0F,0F, 0F, 4.05F, 0F, 0F, 9.25F, 0F, 0F, -9.75F, 0F, 0F, -4.5F, 0F, 0F, 0.5F, 0F, 1F, 6.25F, 0F, 1F, -5F, 0F, 0F, -0.5F); // Box 236
		bodyModel[142].setRotationPoint(-175F, -45F, -10F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 120, 1, 3, 0F,0F, 0F, 0.25F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0.25F, 0F, -2F, 0F, 0F, -1.25F, 0F, 0F, 0.5F, 0F); // Box 237
		bodyModel[143].setRotationPoint(-71F, -14F, -3F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 59, 9, 2, 0F,0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, 2.75F, 0F, 0F, 1F, 0F, 0F, -4.5F, 0F, -0.5F, -7.75F, 0F, -1.5F, 7.75F, 0F, -1.25F, 4.5F); // Box 238
		bodyModel[144].setRotationPoint(-10F, -26F, -22F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 4, 9, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1F, 0F, 0F, 0.75F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, -1.25F, 4.5F, 0F, -1.25F, 4.25F); // Box 239
		bodyModel[145].setRotationPoint(-14F, -26F, -22F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 57, 9, 2, 0F,0F, 0F, 1F, 0F, 0F, 0.25F, 0F, 0F, 0.75F, 0F, 0F, -1F, 0F, 1F, -6.25F, 0F, 0F, -4.5F, 0F, -1.25F, 4.25F, 0F, 0F, 5.5F); // Box 240
		bodyModel[146].setRotationPoint(-71F, -26F, -22F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 26, 11, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 2F, 0F, 0F, 1F); // Box 241
		bodyModel[147].setRotationPoint(-71F, -56F, -25F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 24, 11, 2, 0F,0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0.75F); // Box 242
		bodyModel[148].setRotationPoint(-95F, -56F, -25F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 26, 11, 2, 0F,0F, 0F, -2.5F, 0F, 0F, -2F, 0F, 0F, 1.75F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0.25F); // Box 243
		bodyModel[149].setRotationPoint(-71F, -67F, -25F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 11, 11, 2, 0F,0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 244
		bodyModel[150].setRotationPoint(-82F, -67F, -25F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 5, 11, 2, 0F,0F, 0F, -2.75F, 0F, 0F, -2.75F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F, 0F, -1F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 245
		bodyModel[151].setRotationPoint(-95F, -67F, -25F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 26, 11, 2, 0F,0F, 0F, -7.25F, 0F, 0F, -6.75F, 0F, 0F, 6.75F, 0F, 0F, 7.25F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.5F); // Box 246
		bodyModel[152].setRotationPoint(-71F, -78F, -23F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 8, 5, 2, 0F,0F, 0F, -1.65F, 0F, 0F, -1.5F, 0F, 0F, 0.75F, 0F, 0F, 1F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 247
		bodyModel[153].setRotationPoint(-90F, -61F, -25F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 24, 11, 2, 0F,0F, 0F, -7.75F, 0F, 0F, -7.25F, 0F, 0F, 7.25F, 0F, 0F, 7.25F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F); // Box 248
		bodyModel[154].setRotationPoint(-95F, -78F, -23F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 59, 9, 2, 0F,0F, 0F, 0.5F, 0F, 0.5F, -2.75F, 0F, 1.5F, 2.75F, 0F, 1.25F, -0.5F, 0F, -6.25F, -14F, 0F, -7F, -14.25F, 0F, -7.5F, 12.25F, 0F, -6.75F, 12F); // Box 249
		bodyModel[155].setRotationPoint(-10F, -17F, -17F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 57, 9, 2, 0F,0F, -1F, -1.25F, 0F, 0F, 0.5F, 0F, 1.25F, -0.75F, 0F, 0F, 0.5F, 0F, -5.25F, -13.75F, 0F, -6.25F, -14F, 0F, -6.75F, 12F, 0F, -6F, 11.75F); // Box 250
		bodyModel[156].setRotationPoint(-71F, -17F, -17F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 1.25F, 0.5F, 0F, 1.25F, 0.25F, 0F, -2.25F, -14F, 0F, -2.25F, -14F, 0F, -2.75F, 13F, 0F, -2.75F, 13F); // Box 251
		bodyModel[157].setRotationPoint(-14F, -17F, -17F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 17, 1, 9, 0F,3.75F, -0.5F, 0F, 0F, -0.25F, 0.25F, 0F, 0.75F, 0F, 0F, 0.5F, 0F, 3.75F, 0.75F, 0F, 0F, 0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 253
		bodyModel[158].setRotationPoint(-62F, -82F, -9F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 21, 1, 9, 0F,0F, -4F, -2.25F, 0F, -4F, -1.75F, 0F, -0.25F, -0.25F, -0.25F, -0.5F, 0F, 0F, 3F, -4F, 0F, 3F, -3.75F, 0F, 0.5F, -0.25F, -0.25F, 0.75F, 0F); // Box 254
		bodyModel[159].setRotationPoint(-66F, -82F, -18F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 7, 1, 9, 0F,0F, -4F, -2.25F, 0F, -4F, -2.25F, 0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.75F, 0F, 3F, -4.25F, 0F, 3F, -4F, 0.25F, 0.75F, 0F, -0.25F, 0.75F, -1F); // Box 255
		bodyModel[160].setRotationPoint(-73F, -82F, -18F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 7, 1, 9, 0F,0F, -4F, -2.25F, 0F, -4F, -2.25F, 0.25F, -0.5F, -0.75F, 0.25F, -0.5F, 0F, 0F, 3F, -4F, 0F, 3F, -4.25F, 0.25F, 0.75F, -1F, 0.25F, 0.75F, 0F); // Box 256
		bodyModel[161].setRotationPoint(-80F, -82F, -18F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 11, 1, 9, 0F,0F, -0.25F, 0F, 3.75F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.25F, 3.75F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 257
		bodyModel[162].setRotationPoint(-95F, -82F, -9F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 15, 1, 9, 0F,0F, -4F, -2.75F, 0F, -4F, -2.25F, -0.25F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, 3F, -4F, 0F, 3F, -4F, -0.25F, 0.75F, 0F, 0F, 0.5F, -0.25F); // Box 258
		bodyModel[163].setRotationPoint(-95F, -82F, -18F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 51, 11, 2, 0F,0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -5.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 5.25F, 0F, 0F, -5.25F, 0F, 0F, -0.75F); // Box 259
		bodyModel[164].setRotationPoint(-146F, -56F, -19F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 27, 11, 2, 0F,0F, -1.25F, -3.5F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -1.25F, 3F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, -1.75F, 0F, 0F, 1F); // Box 260
		bodyModel[165].setRotationPoint(-122F, -67F, -23F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 24, 11, 2, 0F,0F, -2.5F, -3.75F, 0F, -1.25F, -1.5F, 0F, -1.25F, 1F, 0F, -2.5F, 3.5F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 1.25F); // Box 261
		bodyModel[166].setRotationPoint(-146F, -67F, -21F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 6, 11, 2, 0F,0F, -0.5F, -8F, 0F, 0F, -7.75F, 0F, 0F, 7.25F, 0F, -0.5F, 7F, 2F, 0.4F, -1.5F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 2F, 0.5F, 0.75F); // Box 262
		bodyModel[167].setRotationPoint(-101F, -78F, -23F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 6, 1, 9, 0F,0F, -4.5F, -3F, 0F, -4F, -2.75F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, 3.5F, -4F, 0F, 3F, -4F, 0F, 0.5F, 0F, 0F, 0.75F, 0.5F); // Box 263
		bodyModel[168].setRotationPoint(-101F, -82F, -18F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 6, 1, 9, 0F,0F, -1F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0F, -3F, 0F, 0.75F, -0.25F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 264
		bodyModel[169].setRotationPoint(-101F, -82F, -9F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 50, 3, 12, 0F,0F, 0F, -5.5F, 0F, -0.5F, -6.75F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.25F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 268
		bodyModel[170].setRotationPoint(149F, -81F, -12F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 24, 3, 10, 0F,0F, -0.5F, 0.75F, 0F, 3.5F, -1F, 0F, 3.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, -2.5F, 0F, -4.75F, -4.75F, 0F, -4F, 0F, 0F, 1F, 0F); // Box 270
		bodyModel[171].setRotationPoint(199F, -42F, -10F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 24, 3, 10, 0F,0F, -0.5F, -4.75F, 0F, -1F, -4F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 274
		bodyModel[172].setRotationPoint(199F, -81F, -10F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 20, 5, 11, 0F,0F, 0F, 1F, -2.75F, 0F, -2.25F, 1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0.5F, -3F, -1F, -3.25F, 0F, -1F, 0F, 0F, 1F, 0F); // Box 275
		bodyModel[173].setRotationPoint(223F, -57F, -11F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 20, 5, 11, 0F,0F, 0F, 0.5F, -3F, 2F, -3.25F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0.5F, -2F, -4.75F, -2.25F, -5.25F, -3F, -2.5F, 0F, 0F, 0.5F, 0F); // Box 276
		bodyModel[174].setRotationPoint(223F, -51F, -11F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 17, 2, 9, 0F,0F, 0.5F, 0F, -1.75F, 3.25F, -3.25F, 0F, 3.5F, 0F, 0F, 0.5F, 0F, 0F, -0.75F, -3.75F, -5F, -3F, -5.75F, -4F, -3.25F, 0F, 0F, 0F, 0F); // Box 277
		bodyModel[175].setRotationPoint(223F, -45F, -9F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 12, 11, 2, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.75F, 0F, 0F, -0.5F, 0F, 0F, 0.15F, 0F, 0F, 2.25F, 0F, 0F, -2.75F, 0F, 0F, -0.6F); // Box 278
		bodyModel[176].setRotationPoint(-158F, -56F, -17F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 12, 10, 2, 0F,0F, -2.45F, -0.85F, 0F, -1.5F, 1.25F, 0F, -1.5F, -1.5F, 0F, -2.5F, 0.45F, 0F, 0F, 1F, 0F, 0F, 3F, 0F, 0F, -3.75F, 0F, 0F, -1.5F); // Box 279
		bodyModel[177].setRotationPoint(-158F, -66F, -16F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 29, 5, 2, 0F,0F, -1.75F, -2.5F, 0F, 1F, 1.25F, 0F, 0.25F, -2.75F, 0F, -2.5F, 1.25F, 0F, -0.25F, 0.25F, 0F, -2.5F, 5.25F, 0F, -2.5F, -5.5F, 0F, -0.25F, -0.8F); // Box 360
		bodyModel[178].setRotationPoint(-175F, -67F, -12F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 24, 1, 4, 0F,0F, -1.25F, 0.25F, 0F, 1F, 3.25F, 0F, 3.25F, 0F, 0F, 1F, 0F, 0F, 1F, -0.5F, 0F, -1.25F, 2.75F, 0F, -3F, 0F, 0F, -1.5F, 0F); // Box 361
		bodyModel[179].setRotationPoint(-170F, -67F, -10F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F,0F, -1.75F, -0.5F, 0F, -1.25F, 0.25F, 0F, 1F, 0F, 0F, 0F, 0.25F, 0F, 1.5F, -1.25F, 0F, 1F, -0.5F, 0F, -1.5F, 0F, 0F, -0.25F, 0.25F); // Box 362
		bodyModel[180].setRotationPoint(-175F, -67F, -10F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 24, 5, 2, 0F,0F, -1F, -3.75F, 0F, 0.25F, -2.5F, 0F, -0.5F, 1.25F, 0F, -1.75F, 2.25F, 0F, -0.5F, 0.25F, 0F, -1.75F, 2.5F, 0F, -1.75F, -3F, 0F, -0.5F, -0.5F); // Box 363
		bodyModel[181].setRotationPoint(-146F, -69F, -17F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 4, 14, 2, 0F,0F, 0F, -0.75F, 0F, 0F, 0.0500000000000001F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.75F, 0F, 0F, -2.65F, 0F, 0F, 2.65F, 0F, 0F, 2.75F); // Box 367
		bodyModel[182].setRotationPoint(-179F, -45F, -14F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 11, 2, 0F,0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.45F, 0F, 0F, -0.1F, 0F, 0F, 0F); // Box 368
		bodyModel[183].setRotationPoint(-179F, -56F, -14F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 6, 2, 0F,0F, -0.25F, -1.5F, 0F, 0F, -1.35F, 0F, 0F, 0.75F, 0F, -0.25F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.75F, 0F, 0F, -1.5F, 0F, 0F, -1F); // Box 369
		bodyModel[184].setRotationPoint(-179F, -62F, -13F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.75F, -0.75F, 0F, 0.25F, -0.5F, 0F, -0.5F, 0.25F, 0F, -1F, 0.5F, 0F, 0.25F, 1.5F, 0F, -0.25F, 2.25F, 0F, -0.25F, -1.8F, 0F, 0.25F, -1.25F); // Box 370
		bodyModel[185].setRotationPoint(-179F, -65F, -10F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, -2.75F, 0.25F, 0F, -1.75F, 0.5F, 0F, 0F, 0.25F, 0F, -1F, 0F, 0F, 2F, -0.5F, 0F, 1.5F, -0.25F, 0F, -0.25F, 0.25F, 0F, 0.75F, 0.25F); // Box 371
		bodyModel[186].setRotationPoint(-179F, -67F, -9F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, -1F, 0F, 0F, 0F, -0.25F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, 0.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.75F, 0F, 0F, 0F, 0F); // Box 372
		bodyModel[187].setRotationPoint(-179F, -67F, -6F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F); // Box 373
		bodyModel[188].setRotationPoint(-179F, -67F, -2F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.35F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -2F, 0F, -1.25F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -2F, 0F, 0.75F); // Box 374
		bodyModel[189].setRotationPoint(-179F, -31F, -11F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0.25F, -2F, 0F, -2.75F, 0F, 0F, -2.75F, 0F, 0.25F, 2.75F, -2F, 0.25F, 2.75F); // Box 375
		bodyModel[190].setRotationPoint(-177F, -27F, -9.5F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 376
		bodyModel[191].setRotationPoint(39F, -86F, -0.5F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 5, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 377
		bodyModel[192].setRotationPoint(38F, -90F, -2.5F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 3, 4, 5, 0F,0F, -1.25F, -2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, -1.75F, 0F, -1.5F, -2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.75F); // Box 378
		bodyModel[193].setRotationPoint(35F, -90F, -2.5F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 39, 31, 2, 0F,-3.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 380
		bodyModel[194].setRotationPoint(173F, -98F, -89.5F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 16, 24, 2, 0F,0F, -2.25F, -0.75F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 381
		bodyModel[195].setRotationPoint(196F, -122F, -89.5F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 23, 24, 2, 0F,-9.25F, -10.75F, -1F, 0F, -2.25F, -0.75F, 0F, 0F, 0F, -7.75F, -9.75F, 0F, -3.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 382
		bodyModel[196].setRotationPoint(173F, -122F, -89.5F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 23, 24, 2, 0F,-3.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9.25F, -10.75F, -1F, 0F, -2.25F, -0.75F, 0F, 0F, 0F, -7.75F, -9.75F, 0F); // Box 383
		bodyModel[197].setRotationPoint(173F, -67F, -89.5F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 16, 24, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, -0.75F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 384
		bodyModel[198].setRotationPoint(196F, -67F, -89.5F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 23, 24, 2, 0F,0F, -2.25F, -1.25F, -9.25F, -10.75F, -1F, -7.75F, -9.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -3.25F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 385
		bodyModel[199].setRotationPoint(212F, -122F, -89.5F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 23, 24, 2, 0F,0F, 0F, -0.75F, -3.75F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, -1.25F, -9.25F, -10.75F, -1.5F, -7.75F, -9.75F, 0F, 0F, 0F, 0F); // Box 386
		bodyModel[200].setRotationPoint(212F, -67F, -89.5F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 23, 31, 2, 0F,0F, 0F, -0.5F, -3.75F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -3.75F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 387
		bodyModel[201].setRotationPoint(212F, -98F, -89.5F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 23, 31, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3.75F, 0F, -1.25F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -3.75F, 0F, -1F, 0F, 0F, -0.75F); // Box 388
		bodyModel[202].setRotationPoint(212F, -98F, -87.5F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 39, 31, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.75F, 0F, -0.5F); // Box 389
		bodyModel[203].setRotationPoint(173F, -98F, -87.5F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 16, 24, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 390
		bodyModel[204].setRotationPoint(196F, -122F, -87.5F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 23, 24, 2, 0F,0F, 0F, 0F, -7.75F, -9.75F, 0F, -9.25F, -10.75F, -1F, 0F, -2.25F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, -3.25F, 0F, -1.25F, 0F, 0F, -0.5F); // Box 391
		bodyModel[205].setRotationPoint(212F, -122F, -87.5F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 23, 24, 2, 0F,-7.75F, -9.75F, 0F, 0F, 0F, 0F, 0F, -2.25F, -0.75F, -9.25F, -10.75F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.75F, 0F, -0.5F); // Box 392
		bodyModel[206].setRotationPoint(173F, -122F, -87.5F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 23, 24, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3.75F, 0F, -1F, 0F, 0F, -0.75F, 0F, 0F, 0F, -7.75F, -9.75F, 0F, -9.25F, -10.75F, -1.5F, 0F, -2.25F, -1.25F); // Box 393
		bodyModel[207].setRotationPoint(212F, -67F, -87.5F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 16, 24, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2.25F, -0.75F); // Box 394
		bodyModel[208].setRotationPoint(196F, -67F, -87.5F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 23, 24, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.75F, 0F, -0.5F, -7.75F, -9.75F, 0F, 0F, 0F, 0F, 0F, -2.25F, -0.75F, -9.25F, -10.75F, -1F); // Box 395
		bodyModel[209].setRotationPoint(173F, -67F, -87.5F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 18, 3, 11, 0F,0F, 0.25F, 0F, 0F, -2.5F, 0F, -0.25F, -2.5F, -1F, 0F, 0.25F, 1.5F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, -1F, 0F, 0.25F, 0F); // Box 399
		bodyModel[210].setRotationPoint(212F, -78.5F, -20F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 18, 3, 56, 0F,0F, 0.25F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F); // Box 400
		bodyModel[211].setRotationPoint(212F, -78.5F, -76F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 18, 3, 7, 0F,0F, 0.25F, 0F, -11.75F, -1.5F, 0F, 0F, -2.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -11.75F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F); // Box 401
		bodyModel[212].setRotationPoint(212F, -78.5F, -83F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 4.25F, 0F, -1.5F, 4.25F, 0F, 1.25F, 0F, 0F, 0F); // Box 402
		bodyModel[213].setRotationPoint(223F, -62F, -12F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F); // Box 403
		bodyModel[214].setRotationPoint(223F, -67F, -12F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,0F, 0F, -0.75F, 1.25F, 0F, -1F, 1.25F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F); // Box 404
		bodyModel[215].setRotationPoint(223F, -72F, -12F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 5, 6, 1, 0F,0F, -1F, -0.5F, 1.75F, -2F, -0.5F, 1.75F, -2F, 0.5F, 0F, -0.75F, 1F, 0F, 0F, 0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 405
		bodyModel[216].setRotationPoint(223F, -78F, -11F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, -3F, 1.5F, 0.75F, -4F, 1.5F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, 0.75F, 3F, 0.5F, 0F, 0.25F, 0F, 0F, 0F, 0F); // Box 406
		bodyModel[217].setRotationPoint(223F, -80F, -9F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 407
		bodyModel[218].setRotationPoint(223F, -80F, -6F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 1, 19, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 440
		bodyModel[219].setRotationPoint(-140F, -64F, 0F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 1, 5, 15, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 441
		bodyModel[220].setRotationPoint(-140F, -69F, 0F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 1, 19, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 442
		bodyModel[221].setRotationPoint(-140F, -64F, -17F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 1, 5, 15, 0F,0F, -1F, -1F, 0F, -1F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 443
		bodyModel[222].setRotationPoint(-140F, -69F, -15F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 45, 5, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F); // Box 468
		bodyModel[223].setRotationPoint(-139F, -50F, 0F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 45, 5, 18, 0F,0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 469
		bodyModel[224].setRotationPoint(-139F, -50F, -18F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 1, 17, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 470
		bodyModel[225].setRotationPoint(-95F, -67F, -22F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 1, 11, 13, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 471
		bodyModel[226].setRotationPoint(-95F, -78F, -20F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 1, 3, 14, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 472
		bodyModel[227].setRotationPoint(-95F, -81F, -14F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 473
		bodyModel[228].setRotationPoint(-95F, -78F, -7F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 1, 17, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 474
		bodyModel[229].setRotationPoint(-95F, -67F, 7F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 1, 11, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 475
		bodyModel[230].setRotationPoint(-95F, -78F, 7F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 1, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 476
		bodyModel[231].setRotationPoint(-95F, -81F, 0F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 477
		bodyModel[232].setRotationPoint(-95F, -78F, 0F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 69, 1, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F); // Box 494
		bodyModel[233].setRotationPoint(-140F, -45F, 0F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 69, 1, 19, 0F,0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 495
		bodyModel[234].setRotationPoint(-140F, -45F, -19F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 95, 9, 15, 0F,0F, 0F, 6.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, -5.25F, -5F, 0F, -3.5F, 0F, 0F, 0F, 0F); // Box 496
		bodyModel[235].setRotationPoint(55F, -34.5F, -15F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 95, 9, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 6.75F, 0F, 0F, 0F, 0F, -3.75F, 0F, 0F, -5.5F, -5F, 0F, 0F, 5F); // Box 498
		bodyModel[236].setRotationPoint(55F, -34.5F, 0F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 25, 13, 4, 0F,0F, 0F, -0.25F, 0F, 0F, -1.75F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1.25F, 0F, -0.75F, -3F, 0F, -0.75F, 0.5F, 0F, 0F, -1F); // Box 499
		bodyModel[237].setRotationPoint(98F, -50.5F, -20F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 7, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 500
		bodyModel[238].setRotationPoint(87F, -46.5F, -20F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 7, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 501
		bodyModel[239].setRotationPoint(79F, -46.5F, -20F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 2, 5, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 502
		bodyModel[240].setRotationPoint(85.5F, -39F, 0F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 3, 5, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 503
		bodyModel[241].setRotationPoint(56.5F, -39F, 0F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 6, 5, 13, 0F,0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 504
		bodyModel[242].setRotationPoint(59.5F, -39F, 7F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 6, 5, 13, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 505
		bodyModel[243].setRotationPoint(79.5F, -39F, 7F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 14, 5, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 506
		bodyModel[244].setRotationPoint(65.5F, -39F, 13F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 2, 5, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 507
		bodyModel[245].setRotationPoint(85.5F, -39F, -19F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 3, 5, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 508
		bodyModel[246].setRotationPoint(56.5F, -39F, -19F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 6, 5, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 509
		bodyModel[247].setRotationPoint(59.5F, -39F, -20F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 6, 5, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 510
		bodyModel[248].setRotationPoint(79.5F, -39F, -20F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 14, 5, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 511
		bodyModel[249].setRotationPoint(65.5F, -39F, -20F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 6, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 512
		bodyModel[250].setRotationPoint(132F, -53.5F, -17.75F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 7, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 513
		bodyModel[251].setRotationPoint(124F, -53.5F, -18F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 7, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 514
		bodyModel[252].setRotationPoint(139F, -53.5F, -17.5F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 6, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 515
		bodyModel[253].setRotationPoint(132F, -53.5F, 15.75F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 7, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 516
		bodyModel[254].setRotationPoint(124F, -53.5F, 16F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 7, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 517
		bodyModel[255].setRotationPoint(139F, -53.5F, 15.5F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 50, 12, 5, 0F,0F, 0.5F, 0.25F, 0F, 3F, -3.25F, 0F, 3F, 0F, 0F, 0.5F, -3.5F, 0F, -0.25F, -2.75F, 0F, -7.5F, -6.25F, 0F, -7.5F, 3F, 0F, -0.25F, -0.75F); // Box 518
		bodyModel[256].setRotationPoint(149F, -46F, -17F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 50, 10, 5, 0F,0F, 0F, 0.5F, 0F, 1F, -3F, 0F, 1F, 0F, 0F, 0F, -3.75F, 0F, -0.5F, 0.25F, 0F, -3F, -3.25F, 0F, -3F, 0F, 0F, -0.5F, -3.5F); // Box 519
		bodyModel[257].setRotationPoint(149F, -56F, -17F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 50, 10, 5, 0F,0F, 0F, -0.25F, 0F, 0F, -3.25F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 1F, 0.5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 1F, -3.75F); // Box 520
		bodyModel[258].setRotationPoint(149F, -67F, -17F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 50, 11, 5, 0F,0F, 0F, -4.75F, 0F, 0F, -7F, 0F, 0F, 4.75F, 0F, 0F, 1.25F, 0F, 0F, -0.25F, 0F, 0F, -3.25F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 521
		bodyModel[259].setRotationPoint(149F, -78F, -17F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 24, 7, 5, 0F,0F, 0F, 0.75F, 0F, 2F, -1.5F, 0F, 2F, -2.25F, 0F, 0F, -4F, 0F, 0.5F, -2.25F, 0F, -3.5F, -4F, 0F, -3.5F, 0F, 0F, 0.5F, -1F); // Box 522
		bodyModel[260].setRotationPoint(199F, -49F, -13F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 24, 7, 5, 0F,0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 1F, 0.75F, 0F, -1F, -1.5F, 0F, -1F, -2.25F, 0F, 1F, -4F); // Box 523
		bodyModel[261].setRotationPoint(199F, -57F, -13F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 24, 10, 6, 0F,0F, 0F, -0.25F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -4F); // Box 524
		bodyModel[262].setRotationPoint(199F, -67F, -14F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 24, 11, 6, 0F,0F, 0F, -4F, 0F, -1F, -3.5F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.25F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -4F); // Box 525
		bodyModel[263].setRotationPoint(199F, -78F, -14F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 5, 6, 77, 0F,0F, -3F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 3F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -3F, 0F); // Box 526
		bodyModel[264].setRotationPoint(181F, -81F, -86F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 13, 5, 77, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, -0.25F, 3F, 0F, 0.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.25F, -0.5F); // Box 527
		bodyModel[265].setRotationPoint(186F, -80.5F, -86F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 13, 5, 77, 0F,0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 3F, 0F, 0F, 4F, 0F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.75F, 0F); // Box 528
		bodyModel[266].setRotationPoint(199F, -80.5F, -86F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 4, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 529
		bodyModel[267].setRotationPoint(-71F, -45F, 0F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 4, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 530
		bodyModel[268].setRotationPoint(-71F, -45F, -9F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 6, 3, 130, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 6.75F, 8.75F, 0F, -9.5F, 8.75F, 0F, -2.5F, -0.75F, 0F, 0F, 0.25F, 0F, 6.75F, -10F, 0F, -10F, -10.5F, 0F); // Box 531
		bodyModel[269].setRotationPoint(-46F, -74F, 223F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 6, 3, 130, 0F,-2F, -1.25F, 0F, 0F, 0.5F, 0F, 6.75F, 6F, 0F, -11F, 5.5F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 6.75F, -7.75F, 0F, -9.5F, -7.75F, 0F); // Box 533
		bodyModel[270].setRotationPoint(-46F, -78F, 223F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 15, 4, 130, 0F,0F, 0.5F, 0F, 0F, 2.25F, 0F, 3F, 6.5F, 0F, -6.75F, 6F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 3F, -8.75F, 0F, -6.75F, -8.75F, 0F); // Box 534
		bodyModel[271].setRotationPoint(-40F, -78F, 223F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 15, 3, 130, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 3F, 7.75F, 0F, -6.75F, 7.75F, 0F, 0F, 1.25F, 0F, 0F, 2.25F, 0F, 3F, -8.75F, 0F, -6.75F, -9F, 0F); // Box 535
		bodyModel[272].setRotationPoint(-40F, -75F, 223F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.4F, 0F, 0F, 0.35F, 0F, 0F, 0.5F, 0F, 0F, -0.1F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0.5F, 0F, 0F, 0.85F); // Box 536
		bodyModel[273].setRotationPoint(99F, -67F, 18F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0.25F, -1.5F, -1.5F, 0.25F, -1.5F, -1.5F, 0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.4F, 0F, 0F, 0.35F, 0F, 0F, 0.5F); // Box 537
		bodyModel[274].setRotationPoint(99F, -55F, 19.25F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-1.5F, -1.5F, 0.25F, 0F, 0F, 0.35F, 0F, 0F, 0.15F, -1.5F, -1.5F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.5F, 0F, 0F, 0.1F, 0F, 0F, 0.2F); // Box 538
		bodyModel[275].setRotationPoint(119F, -55F, 18.25F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0.4F, 0F, 0F, 0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.45F, -1.5F, -1.5F, 0.25F, 0F, 0F, 0.05F, 0F, 0F, 0.6F, -1.5F, -1.5F, 0.5F); // Box 539
		bodyModel[276].setRotationPoint(119F, -67F, 17F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 27, 10, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 1.25F, 0F, 0F, -1F, 0F, 0.25F, -0.9F, 0F, -0.5F, -2.75F, 0F, -0.5F, 1.5F, 0F, 0.25F, -0.25F); // Box 540
		bodyModel[277].setRotationPoint(122F, -56F, -20F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 23, 7, 3, 0F,0F, 0F, -0.25F, 0F, 0F, -1.65F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, -0.75F, -1.9F, 0F, -0.75F, 0.75F, 0F, 0F, -1F); // Box 541
		bodyModel[278].setRotationPoint(99F, -52F, -21F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.35F, 0F, 0F, 0.4F, 0F, 0F, 0.25F, 0F, 0F, 0.85F, -1.5F, -1.5F, 0.5F, -1.5F, -1.5F, 0F, 0F, 0F, -0.1F); // Box 542
		bodyModel[279].setRotationPoint(99F, -67F, -19F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0.5F, -1.5F, -1.5F, 0.25F, -1.5F, -1.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.35F, 0F, 0F, 0.4F, 0F, 0F, 0.25F); // Box 543
		bodyModel[280].setRotationPoint(99F, -55F, -20.25F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-1.5F, -1.5F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0.35F, -1.5F, -1.5F, 0.25F, 0F, 0F, 0.2F, 0F, 0F, 0.1F, 0F, 0F, 0.5F, 0F, 0F, 0.4F); // Box 544
		bodyModel[281].setRotationPoint(119F, -55F, -19.25F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0.45F, 0F, 0F, 0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.4F, -1.5F, -1.5F, 0.5F, 0F, 0F, 0.6F, 0F, 0F, 0.05F, -1.5F, -1.5F, 0.25F); // Box 545
		bodyModel[282].setRotationPoint(119F, -67F, -18F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 22, 4, 130, 0F,0F, 2.25F, 0F, 0.5F, -3F, 0F, -5.5F, 4.5F, 0F, -3F, 6.5F, 0F, 0F, -0.25F, 0F, 0.5F, 0.25F, 0F, -5.5F, -8.25F, 0F, -3F, -8.75F, 0F); // Box 546
		bodyModel[283].setRotationPoint(-25F, -78F, 223F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 22, 4, 130, 0F,0F, 0.25F, 0F, 0.5F, -0.25F, 0F, -5.5F, 8.25F, 0F, -3F, 8.75F, 0F, 0F, 0.25F, 0F, 0.5F, -0.5F, 0F, -5.5F, -11F, 0F, -3F, -10.75F, 0F); // Box 547
		bodyModel[284].setRotationPoint(-25F, -74F, 223F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 15, 4, 130, 0F,0F, 2F, 0F, 0.75F, -2.25F, 0F, -14.25F, 8.25F, 0F, 6F, 9.5F, 0F, 0F, -1.5F, 0F, 0.75F, -1.75F, 0F, -14.25F, -12.25F, 0F, 6F, -12F, 0F); // Box 548
		bodyModel[285].setRotationPoint(-2.5F, -73F, 223F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 9, 7, 200, 0F,-12F, 11.25F, 0F, 9F, 11.25F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -14.5F, -15.75F, 0F, 9F, -14.75F, 0F, 0F, 0.75F, 0F, -1.5F, -2.25F, 0F); // Box 549
		bodyModel[286].setRotationPoint(-58F, -63F, -223F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 9, 7, 200, 0F,-14F, 6.75F, 0F, 9F, 8.5F, 0F, 0F, 0.75F, 2.75F, -1.5F, -2.25F, 1.5F, -12F, -11.25F, 0F, 9F, -11.25F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 550
		bodyModel[287].setRotationPoint(-58F, -70F, -223F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 15, 7, 203, 0F,-9F, 7.5F, 0F, 9F, 9.25F, 0F, 0F, 2.5F, 1.5F, 0F, -0.25F, 0F, -9F, -10.25F, 0F, 9F, -10.25F, 0F, 0F, 0F, -1F, 0F, 0F, -2.5F); // Box 551
		bodyModel[288].setRotationPoint(-49F, -71F, -223F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 15, 7, 203, 0F,-9F, 10.25F, 0F, 9F, 10.25F, 0F, 0F, 0F, -1F, 0F, 0F, -1.75F, -9F, -13.75F, 0F, 9F, -12.75F, 0F, 0F, 4F, -0.75F, 0F, 2F, -2.5F); // Box 552
		bodyModel[289].setRotationPoint(-49F, -64F, -223F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 40, 7, 203, 0F,-9F, 6.25F, 0F, -8.5F, 1F, 0F, 9.75F, -13.5F, 0F, 0F, -0.5F, 2F, -9F, -7.25F, 0F, -8.5F, -6.75F, 0F, 10F, 8.75F, 0F, 0F, 0F, 0F); // Box 553
		bodyModel[290].setRotationPoint(-34F, -74F, -223F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 40, 7, 203, 0F,-9F, 7.25F, 0F, -8.5F, 6.75F, 0F, 10F, -8.5F, 0F, 0F, 0F, 0F, -9F, -9.75F, 0F, -8.25F, -10.5F, 0F, 9.75F, 5.25F, 0F, 0F, 7F, -0.5F); // Box 554
		bodyModel[291].setRotationPoint(-34F, -67F, -223F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 14, 5, 203, 0F,18.5F, 15F, 0F, -16.75F, 10.75F, 0F, 1.75F, -5.25F, 0F, 0.25F, 0.5F, 0F, 18.25F, -15.5F, 0F, -16.75F, -15.75F, 0F, 1.75F, 0.25F, 0F, 0.25F, 0.25F, 0F); // Box 555
		bodyModel[292].setRotationPoint(16F, -60F, -223F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 6, 3, 130, 0F,-9.5F, 8.75F, 0F, 6.75F, 8.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -10F, -10.5F, 0F, 6.75F, -10F, 0F, 0F, 0.25F, 0F, -2.5F, -0.75F, 0F); // Box 556
		bodyModel[293].setRotationPoint(-46F, -74F, -353F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 6, 3, 130, 0F,-11F, 5.5F, 0F, 6.75F, 6F, 0F, 0F, 0.5F, 0F, -2F, -1.25F, 0F, -9.5F, -7.75F, 0F, 6.75F, -7.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F); // Box 557
		bodyModel[294].setRotationPoint(-46F, -78F, -353F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 15, 4, 130, 0F,-6.75F, 6F, 0F, 3F, 6.5F, 0F, 0F, 2.25F, 0F, 0F, 0.5F, 0F, -6.75F, -8.75F, 0F, 3F, -8.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 558
		bodyModel[295].setRotationPoint(-40F, -78F, -353F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 15, 3, 130, 0F,-6.75F, 7.75F, 0F, 3F, 7.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -6.75F, -9F, 0F, 3F, -8.75F, 0F, 0F, 2.25F, 0F, 0F, 1.25F, 0F); // Box 559
		bodyModel[296].setRotationPoint(-40F, -75F, -353F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 22, 4, 130, 0F,-3F, 6.5F, 0F, -5.5F, 4.5F, 0F, 0.5F, -3F, 0F, 0F, 2.25F, 0F, -3F, -8.75F, 0F, -5.5F, -8.25F, 0F, 0.5F, 0.25F, 0F, 0F, -0.25F, 0F); // Box 560
		bodyModel[297].setRotationPoint(-25F, -78F, -353F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 22, 4, 130, 0F,-3F, 8.75F, 0F, -5.5F, 8.25F, 0F, 0.5F, -0.25F, 0F, 0F, 0.25F, 0F, -3F, -10.75F, 0F, -5.5F, -11F, 0F, 0.5F, -0.5F, 0F, 0F, 0.25F, 0F); // Box 561
		bodyModel[298].setRotationPoint(-25F, -74F, -353F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 15, 4, 130, 0F,6F, 9.5F, 0F, -14.25F, 8.25F, 0F, 0.75F, -2.25F, 0F, 0F, 2F, 0F, 6F, -12F, 0F, -14.25F, -12.25F, 0F, 0.75F, -1.75F, 0F, 0F, -1.5F, 0F); // Box 562
		bodyModel[299].setRotationPoint(-2.5F, -73F, -353F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 10, 1, 17, 0F,0F, 0F, 0.25F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 565
		bodyModel[300].setRotationPoint(-150F, -45F, -17F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 10, 1, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0F); // Box 566
		bodyModel[301].setRotationPoint(-150F, -45F, 0F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 6, 9, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 567
		bodyModel[302].setRotationPoint(49F, -34.5F, -19F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 6, 9, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 568
		bodyModel[303].setRotationPoint(49F, -34.5F, 7F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 94, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 569
		bodyModel[304].setRotationPoint(-45F, -45F, -9F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 94, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 570
		bodyModel[305].setRotationPoint(-45F, -45F, 0F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 25, 13, 4, 0F,0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, -1.75F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, -0.75F, 0.5F, 0F, -0.75F, -3F, 0F, 0F, -1.25F); // Box 571
		bodyModel[306].setRotationPoint(98F, -50.5F, 16F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 7, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 572
		bodyModel[307].setRotationPoint(87F, -46.5F, 18F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 7, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 573
		bodyModel[308].setRotationPoint(79F, -46.5F, 18F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 19, 1, 2, 0F,0F, -1F, 2F, 0.5F, 0.75F, -1.25F, 0.5F, 0.75F, 0.25F, 0F, -1F, -2.25F, 0F, 1.25F, 0F, 0F, 0.5F, -2.25F, 0F, 0.5F, 1.5F, 0F, 1.25F, -0.5F); // Box 574
		bodyModel[309].setRotationPoint(-122F, -68F, 18F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 19, 1, 2, 0F,0F, -1F, -2.25F, 0.5F, 0.75F, 0.25F, 0.5F, 0.75F, -1.25F, 0F, -1F, 2F, 0F, 1.25F, -0.5F, 0F, 0.5F, 1.5F, 0F, 0.5F, -2.25F, 0F, 1.25F, 0F); // Box 575
		bodyModel[310].setRotationPoint(-122F, -68F, -20F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 14, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F); // Box 538
		bodyModel[311].setRotationPoint(82F, -60.5F, -20F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F); // Box 539
		bodyModel[312].setRotationPoint(-109F, -78F, -15F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, 1.5F, 0F, 0.5F, 1.5F, 4F, 0F, 3F, -4F, 0F, 3F, -4F, 0F, -3F, 4F, 0F, -3F); // Box 540
		bodyModel[313].setRotationPoint(-118F, -76F, -15F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 541
		bodyModel[314].setRotationPoint(-108F, -77F, -15F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, -0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1.5F, 0F, 0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 1.5F); // Box 542
		bodyModel[315].setRotationPoint(-118F, -77F, -15F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 543
		bodyModel[316].setRotationPoint(-109F, -81F, -9F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 544
		bodyModel[317].setRotationPoint(-109F, -82F, -3F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0.5F, -3F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 545
		bodyModel[318].setRotationPoint(-101F, -82F, -3F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0.5F, -6F, 0F, 0.5F, -6F, 0F, -0.5F, 5F, 0F, -0.5F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 546
		bodyModel[319].setRotationPoint(-109F, -80F, -15F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 547
		bodyModel[320].setRotationPoint(-109F, -82F, -9F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.25F, 0F); // Box 548
		bodyModel[321].setRotationPoint(-118F, -81F, -9F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, 0F); // Box 549
		bodyModel[322].setRotationPoint(-118F, -82F, -3F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0.5F, -5F, 0F, 0.5F, -5F, 0F, -0.5F, 4F, 0F, -0.5F, 4F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 550
		bodyModel[323].setRotationPoint(-118F, -79F, -14F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 551
		bodyModel[324].setRotationPoint(-118F, -81F, -9F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 552
		bodyModel[325].setRotationPoint(-109F, -81.5F, -3F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 553
		bodyModel[326].setRotationPoint(-118F, -80.5F, -3F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0.5F, 0F, 2.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, -0.5F, 0F, 2.5F, -0.5F, 0F); // Box 554
		bodyModel[327].setRotationPoint(-118F, -76.5F, -13.5F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5.5F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 5.5F, 0F, 0F); // Box 555
		bodyModel[328].setRotationPoint(-120.5F, -77F, -11.5F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 1.5F, 0F, 3F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1.5F, 0F, 3F, -1.5F, 0F); // Box 556
		bodyModel[329].setRotationPoint(-120.5F, -77F, -11.5F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 557
		bodyModel[330].setRotationPoint(-123.5F, -78.5F, -4.5F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, -0.5F, 2F, -1.5F, -0.5F, 2F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, -1.5F, -0.5F, -2F, 1.5F, 0F, 0F, 0F); // Box 558
		bodyModel[331].setRotationPoint(-123.5F, -78.5F, -4.5F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6.5F, 0F, 0F, -6.5F, 0F, 0F, -6.5F, 0F, 0F, 6.5F, 0F, 0F); // Box 559
		bodyModel[332].setRotationPoint(-123.5F, -78.5F, -4.5F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 6, 11, 2, 0F,0F, -0.5F, 7F, 0F, 0F, 7.25F, 0F, 0F, -7.75F, 0F, -0.5F, -8F, 2F, 0.5F, 0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 2F, 0.4F, -1.5F); // Box 560
		bodyModel[333].setRotationPoint(-101F, -78F, 21F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 6, 1, 9, 0F,0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -4F, -2.75F, 0F, -4.5F, -3F, 0F, 0.75F, 0.5F, 0F, 0.5F, 0F, 0F, 3F, -4F, 0F, 3.5F, -4F); // Box 561
		bodyModel[334].setRotationPoint(-101F, -82F, 9F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 6, 1, 9, 0F,0F, 0F, -3F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.75F, -0.25F); // Box 562
		bodyModel[335].setRotationPoint(-101F, -82F, 0F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F); // Box 566
		bodyModel[336].setRotationPoint(-109F, -78F, 14F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0.5F, 1.5F, 0F, 0.5F, 1.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 4F, 0F, -3F, -4F, 0F, -3F, -4F, 0F, 3F, 4F, 0F, 3F); // Box 567
		bodyModel[337].setRotationPoint(-118F, -76F, 14F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 5F); // Box 568
		bodyModel[338].setRotationPoint(-108F, -77F, 14F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, -0.5F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.5F, 0F, 0.5F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1.5F); // Box 569
		bodyModel[339].setRotationPoint(-118F, -77F, 14F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 570
		bodyModel[340].setRotationPoint(-109F, -81F, 8F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 571
		bodyModel[341].setRotationPoint(-109F, -82F, 2F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 572
		bodyModel[342].setRotationPoint(-101F, -82F, 0F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -0.5F, 5F, 0F, -0.5F, 5F, 0F, 0.5F, -6F, 0F, 0.5F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 573
		bodyModel[343].setRotationPoint(-109F, -80F, 14F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F); // Box 574
		bodyModel[344].setRotationPoint(-109F, -82F, 3F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, 1.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, 0F); // Box 575
		bodyModel[345].setRotationPoint(-118F, -81F, 8F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, 0F); // Box 576
		bodyModel[346].setRotationPoint(-118F, -82F, 2F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -0.5F, 4F, 0F, -0.5F, 4F, 0F, 0.5F, -5F, 0F, 0.5F, -5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 577
		bodyModel[347].setRotationPoint(-118F, -79F, 13F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F); // Box 578
		bodyModel[348].setRotationPoint(-118F, -81F, 3F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 579
		bodyModel[349].setRotationPoint(-109F, -81.5F, 0F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 580
		bodyModel[350].setRotationPoint(-118F, -80.5F, 0F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,2.5F, 0.5F, 0F, -2.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 581
		bodyModel[351].setRotationPoint(-118F, -76.5F, 11.5F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5.5F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 5.5F, 0F, 0F); // Box 582
		bodyModel[352].setRotationPoint(-120.5F, -77F, 10.5F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,3F, 1.5F, 0F, -3F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -1.5F, 0F, -3F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 583
		bodyModel[353].setRotationPoint(-120.5F, -77F, 4.5F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 584
		bodyModel[354].setRotationPoint(-123.5F, -78.5F, -0.5F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, -0.5F, 2F, 1.5F, -0.5F, 2F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 1.5F, -0.5F, -2F, -1.5F, 0F, 0F, 0F); // Box 585
		bodyModel[355].setRotationPoint(-123.5F, -78.5F, 3.5F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6.5F, 0F, 0F, -6.5F, 0F, 0F, -6.5F, 0F, 0F, 6.5F, 0F, 0F); // Box 586
		bodyModel[356].setRotationPoint(-123.5F, -78.5F, 3.5F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 2.25F, 0F, 0F, -2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.25F, 0F, 0F, -2.25F, 0F, 0F, 0F); // Box 587
		bodyModel[357].setRotationPoint(-189F, -52F, -11F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4.5F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4.5F); // Box 588
		bodyModel[358].setRotationPoint(-198F, -52F, -11F);

		bodyModel[359].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 589
		bodyModel[359].setRotationPoint(-199F, -52F, -6F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, -4.5F, 0F, 1F, -1F, 0F, 1F, 1F, 0F, 0F, 4.5F, 0F, 0F, -4.5F, 0F, -1F, -1F, 0F, -1F, 1F, 0F, 0F, 4.5F); // Box 590
		bodyModel[360].setRotationPoint(-197F, -58F, -11F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, -1F, 0F, 1.25F, 1F, 0F, 1.25F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -1.25F, 1.25F, 0F, -1.25F, -1.25F, 0F, 0F, 1F); // Box 591
		bodyModel[361].setRotationPoint(-189F, -59F, -11F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 592
		bodyModel[362].setRotationPoint(-198F, -58F, -6F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 593
		bodyModel[363].setRotationPoint(-189F, -66F, -6F);

		bodyModel[364].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 594
		bodyModel[364].setRotationPoint(-189F, -64F, -6F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 595
		bodyModel[365].setRotationPoint(-189F, -59F, -10F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 6F, 1F, 0F, 6F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 1F, 0F, -6F, -1F, 0F, 0F, 0F); // Box 596
		bodyModel[366].setRotationPoint(-198F, -58F, -5F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, -3F, 1F, 0F, -3F); // Box 597
		bodyModel[367].setRotationPoint(-198F, -57F, -1F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 598
		bodyModel[368].setRotationPoint(-189F, -64F, -6F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 599
		bodyModel[369].setRotationPoint(-189F, -51F, -11F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F); // Box 600
		bodyModel[370].setRotationPoint(-189F, -43F, -11F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 1F, -2F, 0F, 1F); // Box 601
		bodyModel[371].setRotationPoint(-189F, -42F, -10F);

		bodyModel[372].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 2.25F, 0F, 0F, -2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.25F, 0F, 0F, -2.25F, 0F, 0F, 0F); // Box 602
		bodyModel[372].setRotationPoint(-187F, -33F, -9F);

		bodyModel[373].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 604
		bodyModel[373].setRotationPoint(-192F, -37F, -3F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 605
		bodyModel[374].setRotationPoint(-190F, -33F, -3F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 606
		bodyModel[375].setRotationPoint(-188F, -28F, -3F);

		bodyModel[376].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, 3.5F, 0F, 0F, 3.5F, 0F, 0F, -3.5F, 0F, 0F); // Box 607
		bodyModel[376].setRotationPoint(-199F, -51F, -4F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F, 0F, 6.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F, 0F, 6.5F, 0F, 0F); // Box 608
		bodyModel[377].setRotationPoint(-189F, -43F, -11F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -4F, 0F, -1F, 4F, 0F, -1F, 4F, 0F, 1F, -4F, 0F, 1F); // Box 609
		bodyModel[378].setRotationPoint(-196F, -42F, -4F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F); // Box 610
		bodyModel[379].setRotationPoint(-187F, -33F, -9F);

		bodyModel[380].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 611
		bodyModel[380].setRotationPoint(-192F, -36F, -3F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 612
		bodyModel[381].setRotationPoint(-190F, -32F, -3F);

		bodyModel[382].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -3.5F, -1.5F, 0F, 0F, 2.25F, 0F, 0F, -2.25F, -1F, -3.5F, 1F, 0F, 3.5F, -1.5F, 0F, 0F, 2.25F, 0F, 0F, -2.25F, -1F, 3.5F, 1F); // Box 613
		bodyModel[382].setRotationPoint(-187F, -33F, -9F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -0.5F, -1.5F, 0F, -0.5F, -2F, -1F, -2F, 0F, 1F, -2F, 0F, 0F, 0.5F, -1.5F, 0F, 0.5F, -2F, -1F, 2F, 0F, 1F, 2F, 0F); // Box 614
		bodyModel[383].setRotationPoint(-187F, -30F, -9F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, -3.5F, 2.5F, 0F, -3.5F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.5F, 2.5F, 0F, 3.5F, -2.5F, 0F, 0F, 0F); // Box 615
		bodyModel[384].setRotationPoint(-188F, -28F, -3F);

		bodyModel[385].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 1F, -0.5F, 1F, 1F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0.5F, 1F, 1F, 0.5F, -1F, 0F, 0F, 0F); // Box 616
		bodyModel[385].setRotationPoint(-181F, -24.5F, -5.5F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -2.25F, 0F, 0F, 2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, 0F, 0F, 2.25F, 0F, 0F, 0F); // Box 617
		bodyModel[386].setRotationPoint(-189F, -52F, 10F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, 4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F); // Box 618
		bodyModel[387].setRotationPoint(-198F, -52F, 10F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F); // Box 619
		bodyModel[388].setRotationPoint(-199F, -52F, 0F);

		bodyModel[389].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 4.5F, 0F, 1F, 1F, 0F, 1F, -1F, 0F, 0F, -4.5F, 0F, 0F, 4.5F, 0F, -1F, 1F, 0F, -1F, -1F, 0F, 0F, -4.5F); // Box 620
		bodyModel[389].setRotationPoint(-197F, -58F, 10F);

		bodyModel[390].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 1F, 0F, 1.25F, -1F, 0F, 1.25F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, -1.25F, -1.25F, 0F, -1.25F, 1.25F, 0F, 0F, -1F); // Box 621
		bodyModel[390].setRotationPoint(-189F, -59F, 10F);

		bodyModel[391].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F); // Box 622
		bodyModel[391].setRotationPoint(-198F, -58F, 0F);

		bodyModel[392].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 623
		bodyModel[392].setRotationPoint(-189F, -66F, 5F);

		bodyModel[393].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F); // Box 624
		bodyModel[393].setRotationPoint(-189F, -64F, 5F);

		bodyModel[394].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 625
		bodyModel[394].setRotationPoint(-189F, -59F, 9F);

		bodyModel[395].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 6F, -1F, 0F, 6F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -1F, 0F, -6F, 1F, 0F, 0F, 0F); // Box 626
		bodyModel[395].setRotationPoint(-198F, -58F, 4F);

		bodyModel[396].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, 3F, 1F, 0F, 3F); // Box 627
		bodyModel[396].setRotationPoint(-198F, -57F, 0F);

		bodyModel[397].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 628
		bodyModel[397].setRotationPoint(-189F, -64F, 0F);

		bodyModel[398].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 629
		bodyModel[398].setRotationPoint(-189F, -51F, 10F);

		bodyModel[399].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, 1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, 1.75F, 0F, 0F, 0F); // Box 630
		bodyModel[399].setRotationPoint(-189F, -43F, 10F);

		bodyModel[400].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, -2F, 0F, 1F, 2F, 0F, 1F, 2F, 0F, -1F, -2F, 0F, -1F); // Box 631
		bodyModel[400].setRotationPoint(-189F, -42F, 9F);

		bodyModel[401].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -2.25F, 0F, 0F, 2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, 0F, 0F, 2.25F, 0F, 0F, 0F); // Box 632
		bodyModel[401].setRotationPoint(-187F, -33F, 8F);

		bodyModel[402].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 633
		bodyModel[402].setRotationPoint(-192F, -37F, 0F);

		bodyModel[403].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 634
		bodyModel[403].setRotationPoint(-190F, -33F, 0F);

		bodyModel[404].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 635
		bodyModel[404].setRotationPoint(-188F, -28F, 0F);

		bodyModel[405].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, 3.5F, 0F, 0F, 3.5F, 0F, 0F, -3.5F, 0F, 0F); // Box 636
		bodyModel[405].setRotationPoint(-199F, -51F, 3F);

		bodyModel[406].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,6.5F, 0F, 0F, -6.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6.5F, 0F, 0F, -6.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 637
		bodyModel[406].setRotationPoint(-189F, -43F, 4F);

		bodyModel[407].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -4F, 0F, 1F, 4F, 0F, 1F, 4F, 0F, -1F, -4F, 0F, -1F); // Box 638
		bodyModel[407].setRotationPoint(-196F, -42F, 3F);

		bodyModel[408].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 639
		bodyModel[408].setRotationPoint(-187F, -33F, 3F);

		bodyModel[409].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 640
		bodyModel[409].setRotationPoint(-192F, -36F, 2F);

		bodyModel[410].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 641
		bodyModel[410].setRotationPoint(-190F, -32F, 2F);

		bodyModel[411].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,-1F, -3.5F, 1F, 0F, 0F, -2.25F, 0F, 0F, 2.25F, 0F, -3.5F, -1.5F, -1F, 3.5F, 1F, 0F, 0F, -2.25F, 0F, 0F, 2.25F, 0F, 3.5F, -1.5F); // Box 642
		bodyModel[411].setRotationPoint(-187F, -33F, 8F);

		bodyModel[412].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,1F, -2F, 0F, -1F, -2F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -1.5F, 1F, 2F, 0F, -1F, 2F, 0F, 0F, 0.5F, -2F, 0F, 0.5F, -1.5F); // Box 643
		bodyModel[412].setRotationPoint(-187F, -30F, 3F);

		bodyModel[413].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, -3.5F, -2.5F, 0F, -3.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.5F, -2.5F, 0F, 3.5F, 2.5F, 0F, 0F, 0F); // Box 644
		bodyModel[413].setRotationPoint(-188F, -28F, 2F);

		bodyModel[414].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 1F, -0.5F, -1F, 1F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0.5F, -1F, 1F, 0.5F, 1F, 0F, 0F, 0F); // Box 645
		bodyModel[414].setRotationPoint(-181F, -24.5F, 4.5F);

		bodyModel[415].addShapeBox(0F, 0F, 0F, 3, 9, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 660
		bodyModel[415].setRotationPoint(-137F, -18F, -1.5F);

		bodyModel[416].addShapeBox(0F, 0F, 0F, 3, 3, 11, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 661
		bodyModel[416].setRotationPoint(-137F, -9F, -5.5F);

		bodyModel[417].addShapeBox(0F, 0F, 0F, 15, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 662
		bodyModel[417].setRotationPoint(-143F, 0F, -2.5F);

		bodyModel[418].addShapeBox(0F, 0F, 0F, 3, 11, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 665
		bodyModel[418].setRotationPoint(-137F, -6F, -5.5F);

		bodyModel[419].addShapeBox(0F, 0F, 0F, 3, 11, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 666
		bodyModel[419].setRotationPoint(-137F, -6F, 2.5F);

		bodyModel[420].addShapeBox(0F, 0F, 0F, 25, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, 1F, 2F, 0F, 1F, -2F, 0F, -1F, -2F); // Box 667
		bodyModel[420].setRotationPoint(-147F, -20F, -9.5F);

		bodyModel[421].addShapeBox(0F, 0F, 0F, 25, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, 1F, -2F, 0F, 1F, 2F, 0F, -1F, 2F); // Box 668
		bodyModel[421].setRotationPoint(-147F, -20F, 8.5F);

		bodyModel[422].addShapeBox(0F, 0F, 0F, 15, 5, 5, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 669
		bodyModel[422].setRotationPoint(-143F, -5F, -2.5F);

		bodyModel[423].addShapeBox(0F, 0F, 0F, 15, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 670
		bodyModel[423].setRotationPoint(-143F, 5F, -2.5F);

		bodyModel[424].addShapeBox(0F, 0F, 0F, 17, 7, 40, 0F,0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 671
		bodyModel[424].setRotationPoint(-139F, -66F, -20F);

		bodyModel[425].addShapeBox(0F, 0F, 0F, 17, 4, 38, 0F,0F, 0F, -12F, 0F, 0F, -9F, 0F, 0F, -10F, 0F, 0F, -13F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -4F); // Box 672
		bodyModel[425].setRotationPoint(-139F, -70F, -18F);

		bodyModel[426].addShapeBox(0F, 0F, 0F, 13, 4, 17, 0F,0F, -1F, 0F, 0.5F, -1F, -3F, 0.5F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, -2F, 0F, 0.5F, -2F, -3F, 0.5F, -1F, 0F, 0F, -0.75F, 0F); // Box 669
		bodyModel[426].setRotationPoint(-22F, -84F, -370F);

		bodyModel[427].addShapeBox(0F, 0F, 0F, 6, 4, 14, 0F,0.5F, -1F, 0F, -6.5F, -1F, 0F, 0.25F, -2.75F, 0F, 0.5F, -1.5F, 0F, 0.5F, -2F, 0F, -6.5F, -2F, 0F, 0.25F, -1.25F, 0F, 0.5F, -1F, 0F); // Box 670
		bodyModel[427].setRotationPoint(-8F, -84F, -367F);

		bodyModel[428].addShapeBox(0F, 0F, 0F, 11, 4, 17, 0F,0.25F, -1F, -6F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, -2F, -6F, 0F, -2F, 0F, 0F, -0.75F, 0F, 0.25F, -1F, 0F); // Box 671
		bodyModel[428].setRotationPoint(-33F, -84F, -370F);

		bodyModel[429].addShapeBox(0F, 0F, 0F, 4, 3, 11, 0F,-3.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -3.75F, -2F, 0F, -0.25F, -2F, 0F, -0.25F, -1F, 0F, -1F, -1.5F, 0F); // Box 672
		bodyModel[429].setRotationPoint(-37F, -83F, -364F);

		bodyModel[430].addShapeBox(0F, 0F, 0F, 4, 1, 11, 0F,-3.75F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, -2F, -0.5F, 0F, -3.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.25F, 0F, -0.5F, 0.25F, 0F); // Box 673
		bodyModel[430].setRotationPoint(-37F, -84F, -364F);

		bodyModel[431].addShapeBox(0F, 0F, 0F, 13, 4, 17, 0F,0F, 0.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1F, -3F, 0F, -1F, 0F, 0F, -0.75F, 0F, 0.5F, -1F, 0F, 0.5F, -2F, -3F, 0F, -2F, 0F); // Box 674
		bodyModel[431].setRotationPoint(-22F, -84F, 353F);

		bodyModel[432].addShapeBox(0F, 0F, 0F, 6, 4, 14, 0F,0.5F, -1.5F, 0F, 0.25F, -2.75F, 0F, -6.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.25F, -1.25F, 0F, -6.5F, -2F, 0F, 0.5F, -2F, 0F); // Box 675
		bodyModel[432].setRotationPoint(-8F, -84F, 353F);

		bodyModel[433].addShapeBox(0F, 0F, 0F, 11, 4, 17, 0F,0.25F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0.25F, -1F, -6F, 0.25F, -1F, 0F, 0F, -0.75F, 0F, 0F, -2F, 0F, 0.25F, -2F, -6F); // Box 676
		bodyModel[433].setRotationPoint(-33F, -84F, 353F);

		bodyModel[434].addShapeBox(0F, 0F, 0F, 4, 3, 11, 0F,-0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -3.75F, 0F, 0F, -1F, -1.5F, 0F, -0.25F, -1F, 0F, -0.25F, -2F, 0F, -3.75F, -2F, 0F); // Box 677
		bodyModel[434].setRotationPoint(-37F, -83F, 353F);

		bodyModel[435].addShapeBox(0F, 0F, 0F, 4, 1, 11, 0F,-2F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -3.75F, -1F, 0F, -0.5F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0F, 0F, -3.75F, 0F, 0F); // Box 678
		bodyModel[435].setRotationPoint(-37F, -84F, 353F);

		bodyModel[436].addShapeBox(0F, 0F, 0F, 69, 18, 13, 0F,0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 686
		bodyModel[436].setRotationPoint(-140F, -44F, -19F);

		bodyModel[437].addBox(0F, 1F, 0F, 9, 4, 4, 0F); // Box 1209
		bodyModel[437].setRotationPoint(84F, -77.5F, -13.5F);

		bodyModel[438].addShapeBox(0F, 1F, 0F, 2, 4, 4, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 1210
		bodyModel[438].setRotationPoint(82F, -77.5F, -13.5F);

		bodyModel[439].addShapeBox(0F, 1F, 0F, 2, 4, 4, 0F,0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F); // Box 1211
		bodyModel[439].setRotationPoint(93F, -77.5F, -13.5F);

		bodyModel[440].addBox(0F, 1F, 0F, 9, 4, 4, 0F); // Box 1215
		bodyModel[440].setRotationPoint(84F, -80F, -6F);

		bodyModel[441].addShapeBox(0F, 1F, 0F, 2, 4, 4, 0F,0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F); // Box 1216
		bodyModel[441].setRotationPoint(93F, -80F, -6F);

		bodyModel[442].addShapeBox(0F, 1F, 0F, 2, 4, 4, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 1217
		bodyModel[442].setRotationPoint(82F, -80F, -6F);

		bodyModel[443].addBox(0F, 1F, 0F, 9, 4, 4, 0F); // Box 693
		bodyModel[443].setRotationPoint(84F, -77.5F, 9.5F);

		bodyModel[444].addShapeBox(0F, 1F, 0F, 2, 4, 4, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 694
		bodyModel[444].setRotationPoint(82F, -77.5F, 9.5F);

		bodyModel[445].addShapeBox(0F, 1F, 0F, 2, 4, 4, 0F,0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F); // Box 695
		bodyModel[445].setRotationPoint(93F, -77.5F, 9.5F);

		bodyModel[446].addBox(0F, 1F, 0F, 9, 4, 4, 0F); // Box 696
		bodyModel[446].setRotationPoint(84F, -80F, 2F);

		bodyModel[447].addShapeBox(0F, 1F, 0F, 2, 4, 4, 0F,0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F); // Box 697
		bodyModel[447].setRotationPoint(93F, -80F, 2F);

		bodyModel[448].addShapeBox(0F, 1F, 0F, 2, 4, 4, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 698
		bodyModel[448].setRotationPoint(82F, -80F, 2F);

		bodyModel[449].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 699
		bodyModel[449].setRotationPoint(108.5F, -55F, -19.5F);

		bodyModel[450].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 700
		bodyModel[450].setRotationPoint(108.5F, -55F, 18.5F);

		bodyModel[451].addShapeBox(0F, 0F, 0F, 5, 9, 2, 0F,0F, -2.25F, 0.3F, 0F, -1.8F, 1.15F, 0F, -1.75F, -1.55F, 0F, -2.25F, -0.8F, 0F, 0F, 2.5F, 0F, 0F, 3F, 0F, 0F, -3.75F, 0F, 0F, -2.5F); // Box 701
		bodyModel[451].setRotationPoint(-169F, -65F, -13F);

		bodyModel[452].addShapeBox(0F, 0F, 0F, 5, 11, 2, 0F,0F, 0F, 1.5F, 0F, 0F, 2F, 0F, 0F, -2.75F, 0F, 0F, -1.5F, 0F, 0F, 1.15F, 0F, 0F, 2.05F, 0F, 0F, -2.45F, 0F, 0F, -1.65F); // Box 702
		bodyModel[452].setRotationPoint(-169F, -56F, -14F);

		bodyModel[453].addShapeBox(0F, 0F, 0F, 9, 3, 2, 0F,0F, 0F, -1.35F, 0F, 0.75F, 0.3F, 0F, 0.75F, -0.8F, 0F, 0F, 0.75F, 0F, -0.5F, -0.45F, 0F, -1.15F, 1.15F, 0F, -1.2F, -1.45F, 0F, -0.5F, -0.25F); // Box 703
		bodyModel[453].setRotationPoint(-178F, -62F, -13F);

		bodyModel[454].addShapeBox(0F, 0F, 0F, 15, 5, 5, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 704
		bodyModel[454].setRotationPoint(-134F, -41F, -2.5F);

		bodyModel[455].addShapeBox(0F, 0F, 0F, 15, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 705
		bodyModel[455].setRotationPoint(-134F, -36F, -2.5F);

		bodyModel[456].addShapeBox(0F, 0F, 0F, 15, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 706
		bodyModel[456].setRotationPoint(-134F, -31F, -2.5F);

		bodyModel[457].addShapeBox(-1F, -28F, -1.5F, 3, 19, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 707
		bodyModel[457].setRotationPoint(-124F, -35F, 0F);
		bodyModel[457].rotateAngleZ = -1.13446401F;

		bodyModel[458].addShapeBox(-1F, -9F, -5.5F, 3, 3, 11, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 708
		bodyModel[458].setRotationPoint(-124F, -35F, 0F);
		bodyModel[458].rotateAngleZ = -1.13446401F;

		bodyModel[459].addShapeBox(-1F, -6F, 2.5F, 3, 11, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 709
		bodyModel[459].setRotationPoint(-124F, -35F, 0F);
		bodyModel[459].rotateAngleZ = -1.13446401F;

		bodyModel[460].addShapeBox(-1F, -6F, -5.5F, 3, 11, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 710
		bodyModel[460].setRotationPoint(-124F, -35F, 0F);
		bodyModel[460].rotateAngleZ = -1.13446401F;

		bodyModel[461].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 675
		bodyModel[461].setRotationPoint(-122.75F, -68.25F, 1F);

		bodyModel[462].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 676
		bodyModel[462].setRotationPoint(-122.75F, -67.75F, 1F);

		bodyModel[463].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 677
		bodyModel[463].setRotationPoint(-122.75F, -67.75F, 1F);

		bodyModel[464].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 400
		bodyModel[464].setRotationPoint(-122.75F, -68.25F, -1.5F);

		bodyModel[465].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 401
		bodyModel[465].setRotationPoint(-122.75F, -67.75F, -1.5F);

		bodyModel[466].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 402
		bodyModel[466].setRotationPoint(-122.75F, -67.75F, -1.5F);

		bodyModel[467].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 415
		bodyModel[467].setRotationPoint(-122.75F, -66.25F, -0.75F);

		bodyModel[468].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 416
		bodyModel[468].setRotationPoint(-122.75F, -65.75F, -0.75F);

		bodyModel[469].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 417
		bodyModel[469].setRotationPoint(-122.75F, -64.75F, -0.75F);

		bodyModel[470].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 605
		bodyModel[470].setRotationPoint(-122.75F, -66.75F, 4.25F);

		bodyModel[471].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 606
		bodyModel[471].setRotationPoint(-122.75F, -67.75F, 4.25F);

		bodyModel[472].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 607
		bodyModel[472].setRotationPoint(-122.75F, -68.25F, 4.25F);

		bodyModel[473].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 608
		bodyModel[473].setRotationPoint(-122.75F, -64.75F, 3.5F);

		bodyModel[474].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 609
		bodyModel[474].setRotationPoint(-122.75F, -64.75F, 3.5F);

		bodyModel[475].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 610
		bodyModel[475].setRotationPoint(-122.75F, -65.25F, 3.5F);

		bodyModel[476].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 611
		bodyModel[476].setRotationPoint(-122.75F, -64.75F, 6F);

		bodyModel[477].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 612
		bodyModel[477].setRotationPoint(-122.75F, -64.75F, 6F);

		bodyModel[478].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 613
		bodyModel[478].setRotationPoint(-122.75F, -65.25F, 6F);

		bodyModel[479].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 614
		bodyModel[479].setRotationPoint(-122.75F, -66.75F, -6.25F);

		bodyModel[480].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 615
		bodyModel[480].setRotationPoint(-122.75F, -67.75F, -6.25F);

		bodyModel[481].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 616
		bodyModel[481].setRotationPoint(-122.75F, -68.25F, -6.25F);

		bodyModel[482].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 617
		bodyModel[482].setRotationPoint(-122.75F, -64.75F, -4.5F);

		bodyModel[483].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 618
		bodyModel[483].setRotationPoint(-122.75F, -64.75F, -4.5F);

		bodyModel[484].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 619
		bodyModel[484].setRotationPoint(-122.75F, -65.25F, -4.5F);

		bodyModel[485].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 620
		bodyModel[485].setRotationPoint(-122.75F, -64.75F, -7F);

		bodyModel[486].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 621
		bodyModel[486].setRotationPoint(-122.75F, -64.75F, -7F);

		bodyModel[487].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 622
		bodyModel[487].setRotationPoint(-122.75F, -65.25F, -7F);

		bodyModel[488].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 403
		bodyModel[488].setRotationPoint(-122.75F, -68.5F, -9.75F);

		bodyModel[489].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 404
		bodyModel[489].setRotationPoint(-122.75F, -68F, -9.75F);

		bodyModel[490].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 405
		bodyModel[490].setRotationPoint(-122.75F, -68F, -9.75F);

		bodyModel[491].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 406
		bodyModel[491].setRotationPoint(-122.75F, -68.5F, -11.5F);

		bodyModel[492].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 407
		bodyModel[492].setRotationPoint(-122.75F, -68F, -11.5F);

		bodyModel[493].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 408
		bodyModel[493].setRotationPoint(-122.75F, -68F, -11.5F);

		bodyModel[494].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 409
		bodyModel[494].setRotationPoint(-122.75F, -66.75F, -11.5F);

		bodyModel[495].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 410
		bodyModel[495].setRotationPoint(-122.75F, -66.25F, -11.5F);

		bodyModel[496].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 411
		bodyModel[496].setRotationPoint(-122.75F, -66.25F, -11.5F);

		bodyModel[497].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 412
		bodyModel[497].setRotationPoint(-122.75F, -66.75F, -9.75F);

		bodyModel[498].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 413
		bodyModel[498].setRotationPoint(-122.75F, -66.25F, -9.75F);

		bodyModel[499].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 414
		bodyModel[499].setRotationPoint(-122.75F, -66.25F, -9.75F);
	}

	private void initbodyModel_2()
	{
		bodyModel[500] = new ModelRendererTurbo(this, 2041, 161, textureX, textureY); // Box 635
		bodyModel[501] = new ModelRendererTurbo(this, 841, 169, textureX, textureY); // Box 636
		bodyModel[502] = new ModelRendererTurbo(this, 1361, 169, textureX, textureY); // Box 637
		bodyModel[503] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 638
		bodyModel[504] = new ModelRendererTurbo(this, 65, 177, textureX, textureY); // Box 639
		bodyModel[505] = new ModelRendererTurbo(this, 129, 177, textureX, textureY); // Box 640
		bodyModel[506] = new ModelRendererTurbo(this, 1073, 177, textureX, textureY); // Box 641
		bodyModel[507] = new ModelRendererTurbo(this, 1249, 177, textureX, textureY); // Box 642
		bodyModel[508] = new ModelRendererTurbo(this, 1425, 177, textureX, textureY); // Box 643
		bodyModel[509] = new ModelRendererTurbo(this, 1433, 177, textureX, textureY); // Box 644
		bodyModel[510] = new ModelRendererTurbo(this, 1761, 177, textureX, textureY); // Box 645
		bodyModel[511] = new ModelRendererTurbo(this, 1777, 177, textureX, textureY); // Box 646
		bodyModel[512] = new ModelRendererTurbo(this, 1497, 337, textureX, textureY); // Box 762
		bodyModel[513] = new ModelRendererTurbo(this, 2041, 177, textureX, textureY); // Box 905
		bodyModel[514] = new ModelRendererTurbo(this, 297, 185, textureX, textureY); // Box 906
		bodyModel[515] = new ModelRendererTurbo(this, 417, 185, textureX, textureY); // Box 438
		bodyModel[516] = new ModelRendererTurbo(this, 545, 185, textureX, textureY); // Box 439
		bodyModel[517] = new ModelRendererTurbo(this, 513, 193, textureX, textureY); // Box 382
		bodyModel[518] = new ModelRendererTurbo(this, 153, 209, textureX, textureY); // Box 383
		bodyModel[519] = new ModelRendererTurbo(this, 1545, 1, textureX, textureY); // Box 922
		bodyModel[520] = new ModelRendererTurbo(this, 1425, 65, textureX, textureY); // Box 927
		bodyModel[521] = new ModelRendererTurbo(this, 1545, 17, textureX, textureY); // Box 929
		bodyModel[522] = new ModelRendererTurbo(this, 1609, 65, textureX, textureY); // Box 930
		bodyModel[523] = new ModelRendererTurbo(this, 793, 73, textureX, textureY); // Box 440
		bodyModel[524] = new ModelRendererTurbo(this, 897, 25, textureX, textureY); // Box 441
		bodyModel[525] = new ModelRendererTurbo(this, 729, 185, textureX, textureY); // Box 775
		bodyModel[526] = new ModelRendererTurbo(this, 849, 185, textureX, textureY); // Box 776
		bodyModel[527] = new ModelRendererTurbo(this, 865, 185, textureX, textureY); // Box 777
		bodyModel[528] = new ModelRendererTurbo(this, 913, 185, textureX, textureY); // Box 778
		bodyModel[529] = new ModelRendererTurbo(this, 81, 89, textureX, textureY); // Box 779
		bodyModel[530] = new ModelRendererTurbo(this, 1121, 49, textureX, textureY); // Box 780
		bodyModel[531] = new ModelRendererTurbo(this, 1489, 185, textureX, textureY); // Box 781
		bodyModel[532] = new ModelRendererTurbo(this, 1505, 185, textureX, textureY); // Box 782
		bodyModel[533] = new ModelRendererTurbo(this, 1953, 185, textureX, textureY); // Box 783
		bodyModel[534] = new ModelRendererTurbo(this, 1977, 185, textureX, textureY); // Box 784
		bodyModel[535] = new ModelRendererTurbo(this, 2017, 185, textureX, textureY); // Box 785
		bodyModel[536] = new ModelRendererTurbo(this, 2041, 185, textureX, textureY); // Box 786
		bodyModel[537] = new ModelRendererTurbo(this, 377, 193, textureX, textureY); // Box 787
		bodyModel[538] = new ModelRendererTurbo(this, 633, 193, textureX, textureY); // Box 788
		bodyModel[539] = new ModelRendererTurbo(this, 697, 193, textureX, textureY); // Box 789
		bodyModel[540] = new ModelRendererTurbo(this, 913, 193, textureX, textureY); // Box 790
		bodyModel[541] = new ModelRendererTurbo(this, 1409, 193, textureX, textureY); // Box 791
		bodyModel[542] = new ModelRendererTurbo(this, 1457, 193, textureX, textureY); // Box 792
		bodyModel[543] = new ModelRendererTurbo(this, 1393, 249, textureX, textureY); // Box 793
		bodyModel[544] = new ModelRendererTurbo(this, 2017, 249, textureX, textureY); // Box 794
		bodyModel[545] = new ModelRendererTurbo(this, 1601, 249, textureX, textureY); // Box 795
		bodyModel[546] = new ModelRendererTurbo(this, 1081, 209, textureX, textureY); // Box 796
		bodyModel[547] = new ModelRendererTurbo(this, 529, 369, textureX, textureY); // Box 804
		bodyModel[548] = new ModelRendererTurbo(this, 145, 257, textureX, textureY); // Box 805
		bodyModel[549] = new ModelRendererTurbo(this, 1012, 251, textureX, textureY); // Box 806
		bodyModel[550] = new ModelRendererTurbo(this, 529, 49, textureX, textureY); // Box 807
		bodyModel[551] = new ModelRendererTurbo(this, 2009, 329, textureX, textureY); // Box 809
		bodyModel[552] = new ModelRendererTurbo(this, 465, 345, textureX, textureY); // Box 810
		bodyModel[553] = new ModelRendererTurbo(this, 1145, 233, textureX, textureY); // Box 840
		bodyModel[554] = new ModelRendererTurbo(this, 409, 249, textureX, textureY); // Box 841
		bodyModel[555] = new ModelRendererTurbo(this, 1065, 257, textureX, textureY); // Box 842
		bodyModel[556] = new ModelRendererTurbo(this, 1593, 377, textureX, textureY); // Box 843
		bodyModel[557] = new ModelRendererTurbo(this, 1153, 209, textureX, textureY); // Box 844
		bodyModel[558] = new ModelRendererTurbo(this, 1657, 321, textureX, textureY); // Box 845
		bodyModel[559] = new ModelRendererTurbo(this, 697, 353, textureX, textureY); // Box 846
		bodyModel[560] = new ModelRendererTurbo(this, 1593, 353, textureX, textureY); // Box 847
		bodyModel[561] = new ModelRendererTurbo(this, 1457, 217, textureX, textureY); // Box 848
		bodyModel[562] = new ModelRendererTurbo(this, 729, 233, textureX, textureY); // Box 849
		bodyModel[563] = new ModelRendererTurbo(this, 913, 201, textureX, textureY); // Box 850
		bodyModel[564] = new ModelRendererTurbo(this, 1113, 201, textureX, textureY); // Box 851
		bodyModel[565] = new ModelRendererTurbo(this, 113, 209, textureX, textureY); // Box 852
		bodyModel[566] = new ModelRendererTurbo(this, 377, 249, textureX, textureY); // Box 853
		bodyModel[567] = new ModelRendererTurbo(this, 1921, 353, textureX, textureY); // Box 1039
		bodyModel[568] = new ModelRendererTurbo(this, 929, 361, textureX, textureY); // Box 1040
		bodyModel[569] = new ModelRendererTurbo(this, 1593, 361, textureX, textureY); // Box 1041
		bodyModel[570] = new ModelRendererTurbo(this, 737, 233, textureX, textureY); // Box 1042
		bodyModel[571] = new ModelRendererTurbo(this, 1489, 297, textureX, textureY); // Box 1146
		bodyModel[572] = new ModelRendererTurbo(this, 2041, 209, textureX, textureY); // Box 1147
		bodyModel[573] = new ModelRendererTurbo(this, 1849, 233, textureX, textureY); // Box 1148
		bodyModel[574] = new ModelRendererTurbo(this, 1409, 297, textureX, textureY); // Box 1149
		bodyModel[575] = new ModelRendererTurbo(this, 1689, 297, textureX, textureY); // Box 1150
		bodyModel[576] = new ModelRendererTurbo(this, 1993, 297, textureX, textureY); // Box 1151
		bodyModel[577] = new ModelRendererTurbo(this, 65, 121, textureX, textureY); // Box 1152
		bodyModel[578] = new ModelRendererTurbo(this, 1289, 121, textureX, textureY); // Box 1153
		bodyModel[579] = new ModelRendererTurbo(this, 1153, 153, textureX, textureY); // Box 1155
		bodyModel[580] = new ModelRendererTurbo(this, 1065, 97, textureX, textureY); // Box 1156
		bodyModel[581] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 1157
		bodyModel[582] = new ModelRendererTurbo(this, 609, 105, textureX, textureY); // Box 1158
		bodyModel[583] = new ModelRendererTurbo(this, 857, 105, textureX, textureY); // Box 1159
		bodyModel[584] = new ModelRendererTurbo(this, 1401, 105, textureX, textureY); // Box 1160
		bodyModel[585] = new ModelRendererTurbo(this, 417, 121, textureX, textureY); // Box 1161
		bodyModel[586] = new ModelRendererTurbo(this, 681, 121, textureX, textureY); // Box 1162

		bodyModel[500].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 635
		bodyModel[500].setRotationPoint(-122.75F, -68.5F, 11F);

		bodyModel[501].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 636
		bodyModel[501].setRotationPoint(-122.75F, -66.25F, 11F);

		bodyModel[502].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 637
		bodyModel[502].setRotationPoint(-122.75F, -66.25F, 9.25F);

		bodyModel[503].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 638
		bodyModel[503].setRotationPoint(-122.75F, -66.25F, 11F);

		bodyModel[504].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 639
		bodyModel[504].setRotationPoint(-122.75F, -66.25F, 9.25F);

		bodyModel[505].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 640
		bodyModel[505].setRotationPoint(-122.75F, -66.75F, 9.25F);

		bodyModel[506].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 641
		bodyModel[506].setRotationPoint(-122.75F, -66.75F, 11F);

		bodyModel[507].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 642
		bodyModel[507].setRotationPoint(-122.75F, -68F, 11F);

		bodyModel[508].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 643
		bodyModel[508].setRotationPoint(-122.75F, -68F, 11F);

		bodyModel[509].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 644
		bodyModel[509].setRotationPoint(-122.75F, -68F, 9.25F);

		bodyModel[510].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 645
		bodyModel[510].setRotationPoint(-122.75F, -68F, 9.25F);

		bodyModel[511].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 646
		bodyModel[511].setRotationPoint(-122.75F, -68.5F, 9.25F);

		bodyModel[512].addShapeBox(0F, 0F, 0F, 28, 9, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F); // Box 762
		bodyModel[512].setRotationPoint(-139F, -59F, -3F);

		bodyModel[513].addShapeBox(0F, -1F, 0F, 1, 1, 2, 0F,0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Box 905
		bodyModel[513].setRotationPoint(-125F, -53.5F, -15F);
		bodyModel[513].rotateAngleZ = 0.41887903F;

		bodyModel[514].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Box 906
		bodyModel[514].setRotationPoint(-125F, -53.5F, -15F);
		bodyModel[514].rotateAngleZ = 0.41887903F;

		bodyModel[515].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Box 438
		bodyModel[515].setRotationPoint(-125F, -53.5F, -9F);
		bodyModel[515].rotateAngleZ = 0.41887903F;

		bodyModel[516].addShapeBox(0F, -1F, 0F, 1, 1, 2, 0F,0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Box 439
		bodyModel[516].setRotationPoint(-125F, -53.5F, -9F);
		bodyModel[516].rotateAngleZ = 0.41887903F;

		bodyModel[517].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 382
		bodyModel[517].setRotationPoint(-113F, -61F, -2F);

		bodyModel[518].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,-0.5F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 383
		bodyModel[518].setRotationPoint(-115F, -61F, -2F);

		bodyModel[519].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 922
		bodyModel[519].setRotationPoint(-113F, -63.5F, -0.25F);

		bodyModel[520].addShapeBox(-0.5F, 0F, -0.5F, 1, 2, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 927
		bodyModel[520].setRotationPoint(-113F, -63F, -0.25F);

		bodyModel[521].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 929
		bodyModel[521].setRotationPoint(-113F, -63.5F, -1F);

		bodyModel[522].addShapeBox(-0.5F, 0F, -0.5F, 1, 2, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 930
		bodyModel[522].setRotationPoint(-113F, -63F, -1F);

		bodyModel[523].addShapeBox(-0.5F, 0F, -0.5F, 1, 2, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 440
		bodyModel[523].setRotationPoint(-113F, -63F, 0.5F);

		bodyModel[524].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 441
		bodyModel[524].setRotationPoint(-113F, -63.5F, 0.5F);

		bodyModel[525].addShapeBox(0F, -1F, 0F, 1, 1, 2, 0F,0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Box 775
		bodyModel[525].setRotationPoint(-125F, -53.5F, 13F);
		bodyModel[525].rotateAngleZ = 0.41887903F;

		bodyModel[526].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Box 776
		bodyModel[526].setRotationPoint(-125F, -53.5F, 13F);
		bodyModel[526].rotateAngleZ = 0.41887903F;

		bodyModel[527].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Box 777
		bodyModel[527].setRotationPoint(-125F, -53.5F, 7F);
		bodyModel[527].rotateAngleZ = 0.41887903F;

		bodyModel[528].addShapeBox(0F, -1F, 0F, 1, 1, 2, 0F,0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Box 778
		bodyModel[528].setRotationPoint(-125F, -53.5F, 7F);
		bodyModel[528].rotateAngleZ = 0.41887903F;

		bodyModel[529].addShapeBox(-0.5F, 0F, -0.5F, 1, 2, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 779
		bodyModel[529].setRotationPoint(-113F, -63F, 1.25F);

		bodyModel[530].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 780
		bodyModel[530].setRotationPoint(-113F, -63.5F, 1.25F);

		bodyModel[531].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 781
		bodyModel[531].setRotationPoint(-122.75F, -62.75F, -1.5F);

		bodyModel[532].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 782
		bodyModel[532].setRotationPoint(-122.75F, -62.75F, -1.5F);

		bodyModel[533].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 783
		bodyModel[533].setRotationPoint(-122.75F, -63.25F, -1.5F);

		bodyModel[534].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 784
		bodyModel[534].setRotationPoint(-122.75F, -62.75F, 1F);

		bodyModel[535].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 785
		bodyModel[535].setRotationPoint(-122.75F, -62.75F, 1F);

		bodyModel[536].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 786
		bodyModel[536].setRotationPoint(-122.75F, -63.25F, 1F);

		bodyModel[537].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 787
		bodyModel[537].setRotationPoint(-122.75F, -60.75F, -1.5F);

		bodyModel[538].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 788
		bodyModel[538].setRotationPoint(-122.75F, -60.75F, -1.5F);

		bodyModel[539].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 789
		bodyModel[539].setRotationPoint(-122.75F, -61.25F, -1.5F);

		bodyModel[540].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 790
		bodyModel[540].setRotationPoint(-122.75F, -60.75F, 1F);

		bodyModel[541].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 791
		bodyModel[541].setRotationPoint(-122.75F, -60.75F, 1F);

		bodyModel[542].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 792
		bodyModel[542].setRotationPoint(-122.75F, -61.25F, 1F);

		bodyModel[543].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F,0F, 0F, -0.4F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.3F, 0F, 0F, -0.4F, 0F, 0F, 1.4F, 0F, 0F, -1.4F, 0F, 0F, -0.3F); // Box 793
		bodyModel[543].setRotationPoint(-178F, -52.5F, -14F);

		bodyModel[544].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F,0F, 0F, -0.5F, 0F, 0F, 1.3F, 0F, 0F, -1.6F, 0F, 0F, -0.1F, 0F, 0F, -0.5F, 0F, 0F, 1.2F, 0F, 0F, -1.6F, 0F, 0F, -0.1F); // Box 794
		bodyModel[544].setRotationPoint(-178F, -47F, -14F);

		bodyModel[545].addShapeBox(0F, 0F, 0F, 6, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 1.1F, 0F, 0F, -1.6F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1.1F, 0F, 0F, -1.6F, 0F, 0F, -0.5F); // Box 795
		bodyModel[545].setRotationPoint(-164F, -50F, -16F);

		bodyModel[546].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F,0F, 0.0999999999999999F, 0.2F, 0F, 0.5F, 1.2F, 0F, 0.6F, -0.5F, 0F, 0.1F, 0.4F, 0F, 0F, 1.4F, 0F, 0F, 2.3F, 0F, 0F, -1.7F, 0F, 0F, -0.8F); // Box 796
		bodyModel[546].setRotationPoint(-164F, -63F, -14F);

		bodyModel[547].addShapeBox(0F, 0F, 0F, 12, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 804
		bodyModel[547].setRotationPoint(-56F, -58.5F, 12F);

		bodyModel[548].addShapeBox(0F, 0F, 0F, 16, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 805
		bodyModel[548].setRotationPoint(-94F, -58.5F, 17F);

		bodyModel[549].addShapeBox(0F, 0F, 0F, 16, 1, 4, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 806
		bodyModel[549].setRotationPoint(-94F, -58.5F, 13.5F);

		bodyModel[550].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, -0.5F, 0F, -9F, -0.5F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 9F, -0.5F, 0F, 9F, -0.5F); // Box 807
		bodyModel[550].setRotationPoint(-94F, -57.5F, 19F);

		bodyModel[551].addShapeBox(0F, 0F, 0F, 8, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 809
		bodyModel[551].setRotationPoint(-53F, -45F, -9F);

		bodyModel[552].addShapeBox(0F, 0F, 0F, 8, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 810
		bodyModel[552].setRotationPoint(-53F, -45F, 0F);

		bodyModel[553].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, -0.5F, 0F, -9F, -0.5F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 9F, -0.5F, 0F, 9F, -0.5F); // Box 840
		bodyModel[553].setRotationPoint(-79F, -57.5F, 19F);

		bodyModel[554].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, -0.5F, 0F, -9F, -0.5F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 9F, -0.5F, 0F, 9F, -0.5F); // Box 841
		bodyModel[554].setRotationPoint(-55F, -57.5F, 19F);

		bodyModel[555].addShapeBox(0F, 0F, 0F, 6, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 842
		bodyModel[555].setRotationPoint(-81.5F, -62.5F, 21F);

		bodyModel[556].addShapeBox(0F, 0F, 0F, 9, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 843
		bodyModel[556].setRotationPoint(-71F, -63.5F, 19F);

		bodyModel[557].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 844
		bodyModel[557].setRotationPoint(-89F, -52.5F, 9.5F);

		bodyModel[558].addShapeBox(0F, 0F, 0F, 9, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 845
		bodyModel[558].setRotationPoint(-93F, -53.5F, 8.5F);

		bodyModel[559].addShapeBox(0F, 0F, 0F, 9, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 846
		bodyModel[559].setRotationPoint(-93F, -53.5F, 11.5F);

		bodyModel[560].addShapeBox(0F, 0F, 0F, 9, 1, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 847
		bodyModel[560].setRotationPoint(-93F, -53.5F, 5.5F);

		bodyModel[561].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 848
		bodyModel[561].setRotationPoint(-87.5F, -63.5F, 6.5F);

		bodyModel[562].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 849
		bodyModel[562].setRotationPoint(-90.5F, -63.5F, 6.5F);

		bodyModel[563].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 850
		bodyModel[563].setRotationPoint(-90.5F, -65.5F, 7F);

		bodyModel[564].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 1F, 0F, 0F, 0F); // Box 851
		bodyModel[564].setRotationPoint(-86.5F, -65.5F, 7F);

		bodyModel[565].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -1F, 0F); // Box 852
		bodyModel[565].setRotationPoint(-92.5F, -65.5F, 8F);

		bodyModel[566].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 853
		bodyModel[566].setRotationPoint(-94F, -49F, 9.5F);

		bodyModel[567].addShapeBox(0F, 0F, 0F, 9, 1, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1039
		bodyModel[567].setRotationPoint(-165F, -36.5F, -4.5F);

		bodyModel[568].addShapeBox(0F, 0F, 0F, 9, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1040
		bodyModel[568].setRotationPoint(-165F, -36.5F, -1.5F);

		bodyModel[569].addShapeBox(0F, 0F, 0F, 9, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 1041
		bodyModel[569].setRotationPoint(-165F, -36.5F, 1.5F);

		bodyModel[570].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1042
		bodyModel[570].setRotationPoint(-161F, -35.5F, -0.5F);

		bodyModel[571].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1146
		bodyModel[571].setRotationPoint(-98F, -61.5F, 11F);

		bodyModel[572].addShapeBox(0F, -6F, 0F, 1, 6, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 1147
		bodyModel[572].setRotationPoint(-98F, -60.5F, 10.5F);
		bodyModel[572].rotateAngleZ = -0.48869219F;

		bodyModel[573].addShapeBox(0F, -6F, 0F, 1, 6, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 1148
		bodyModel[573].setRotationPoint(-98F, -60.5F, 14.5F);
		bodyModel[573].rotateAngleZ = -0.48869219F;

		bodyModel[574].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -1F, 0F, -0.4F, -1F, 0F, -0.4F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -1F, 0F, -0.4F, -1F, 0F, -0.4F); // Box 1149
		bodyModel[574].setRotationPoint(-97.6F, -65.5F, 13.5F);

		bodyModel[575].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F); // Box 1150
		bodyModel[575].setRotationPoint(-97.6F, -65.5F, 12.5F);

		bodyModel[576].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,-1F, 0F, -0.4F, -1F, 0F, -0.4F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -1F, 0F, -0.4F, -1F, 0F, -0.4F, -0.4F, 0F, 0F, -0.4F, 0F, 0F); // Box 1151
		bodyModel[576].setRotationPoint(-97.6F, -65.5F, 11.5F);

		bodyModel[577].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.8F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F); // Box 1152
		bodyModel[577].setRotationPoint(-97.6F, -66.5F, 12.5F);

		bodyModel[578].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.8F, 0F, 0.2F, -0.8F, 0F, 0.2F, -1.2F, 0F, -0.8F, -1.2F, 0F, -0.8F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -1F, 0F, -0.4F, -1F, 0F, -0.4F); // Box 1153
		bodyModel[578].setRotationPoint(-97.6F, -66.5F, 13.5F);

		bodyModel[579].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1.2F, 0F, -0.8F, -1.2F, 0F, -0.8F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0.2F, -1F, 0F, -0.4F, -1F, 0F, -0.4F, -0.4F, 0F, 0F, -0.4F, 0F, 0F); // Box 1155
		bodyModel[579].setRotationPoint(-97.6F, -66.5F, 11.5F);

		bodyModel[580].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 1156
		bodyModel[580].setRotationPoint(-96.6F, -67.5F, 12.5F);

		bodyModel[581].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.2F, -0.35F, -0.15F, 0.2F, -0.35F, -0.15F, 0.2F, -0.35F, -0.15F, 0.2F, -0.35F, -0.15F, 0.2F, -0.35F, -0.15F, 0.2F, -0.25F, -0.15F, 0.2F, -0.25F, -0.15F, 0.2F, -0.35F, -0.15F); // Box 1157
		bodyModel[581].setRotationPoint(-96.3F, -67.5F, 12.5F);

		bodyModel[582].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, -0.35F, -0.1F, 0.3F, -0.25F, -0.1F, 0.3F, -0.25F, -0.1F, 0.3F, -0.35F, -0.1F, 0.3F, -0.35F, -0.1F, 0.3F, -0.35F, -0.1F, 0.3F, -0.35F, -0.1F, 0.3F, -0.35F, -0.1F); // Box 1158
		bodyModel[582].setRotationPoint(-96.5F, -67.7F, 12.5F);
		bodyModel[582].rotateAngleZ = 0.38397244F;

		bodyModel[583].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 1159
		bodyModel[583].setRotationPoint(-97.1F, -67.5F, 12.5F);

		bodyModel[584].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 1160
		bodyModel[584].setRotationPoint(-97.8F, -67.5F, 12.5F);

		bodyModel[585].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 1161
		bodyModel[585].setRotationPoint(-97.8F, -66.75F, 12.5F);

		bodyModel[586].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1162
		bodyModel[586].setRotationPoint(-98.05F, -64.75F, 12.5F);
	}

	private void initnoseModel_1()
	{
		noseModel[0] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 1043
		noseModel[1] = new ModelRendererTurbo(this, 1113, 17, textureX, textureY); // Box 1044
		noseModel[2] = new ModelRendererTurbo(this, 1265, 25, textureX, textureY); // Box 1045
		noseModel[3] = new ModelRendererTurbo(this, 1281, 25, textureX, textureY); // Box 1050
		noseModel[4] = new ModelRendererTurbo(this, 1681, 17, textureX, textureY); // Box 1051
		noseModel[5] = new ModelRendererTurbo(this, 1297, 25, textureX, textureY); // Box 1046
		noseModel[6] = new ModelRendererTurbo(this, 1321, 25, textureX, textureY); // Box 1047
		noseModel[7] = new ModelRendererTurbo(this, 1905, 9, textureX, textureY); // Box 1048
		noseModel[8] = new ModelRendererTurbo(this, 1369, 25, textureX, textureY); // Box 1049
		noseModel[9] = new ModelRendererTurbo(this, 1041, 41, textureX, textureY); // Box 351
		noseModel[10] = new ModelRendererTurbo(this, 1409, 65, textureX, textureY); // Box 352
		noseModel[11] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 353
		noseModel[12] = new ModelRendererTurbo(this, 1561, 81, textureX, textureY); // Box 354
		noseModel[13] = new ModelRendererTurbo(this, 1113, 57, textureX, textureY); // Box 355
		noseModel[14] = new ModelRendererTurbo(this, 146, 106, textureX, textureY); // Box 356
		noseModel[15] = new ModelRendererTurbo(this, 289, 89, textureX, textureY); // Box 357
		noseModel[16] = new ModelRendererTurbo(this, 1265, 41, textureX, textureY); // Box 358
		noseModel[17] = new ModelRendererTurbo(this, 1145, 89, textureX, textureY); // Box 359
		noseModel[18] = new ModelRendererTurbo(this, 1881, 97, textureX, textureY); // Box 364
		noseModel[19] = new ModelRendererTurbo(this, 1481, 113, textureX, textureY); // Box 365
		noseModel[20] = new ModelRendererTurbo(this, 297, 185, textureX, textureY); // Box 366
		noseModel[21] = new ModelRendererTurbo(this, 681, 121, textureX, textureY); // Box 1405
		noseModel[22] = new ModelRendererTurbo(this, 1553, 129, textureX, textureY); // Box 1406
		noseModel[23] = new ModelRendererTurbo(this, 1769, 145, textureX, textureY); // Box 1407
		noseModel[24] = new ModelRendererTurbo(this, 1313, 65, textureX, textureY); // Box 1408
		noseModel[25] = new ModelRendererTurbo(this, 177, 121, textureX, textureY); // Box 1409
		noseModel[26] = new ModelRendererTurbo(this, 801, 137, textureX, textureY); // Box 1410
		noseModel[27] = new ModelRendererTurbo(this, 825, 137, textureX, textureY); // Box 1411
		noseModel[28] = new ModelRendererTurbo(this, 633, 65, textureX, textureY); // Box 1412
		noseModel[29] = new ModelRendererTurbo(this, 1337, 65, textureX, textureY); // Box 1413
		noseModel[30] = new ModelRendererTurbo(this, 489, 73, textureX, textureY); // Box 1414
		noseModel[31] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 1415
		noseModel[32] = new ModelRendererTurbo(this, 2025, 9, textureX, textureY); // Box 1416
		noseModel[33] = new ModelRendererTurbo(this, 1009, 1, textureX, textureY); // Box 1417
		noseModel[34] = new ModelRendererTurbo(this, 1737, 73, textureX, textureY); // Box 1418
		noseModel[35] = new ModelRendererTurbo(this, 1121, 1, textureX, textureY); // Box 1419
		noseModel[36] = new ModelRendererTurbo(this, 1321, 1, textureX, textureY); // Box 1420
		noseModel[37] = new ModelRendererTurbo(this, 1433, 1, textureX, textureY); // Box 1421
		noseModel[38] = new ModelRendererTurbo(this, 1385, 177, textureX, textureY); // Box 563
		noseModel[39] = new ModelRendererTurbo(this, 505, 185, textureX, textureY); // Box 564
		noseModel[40] = new ModelRendererTurbo(this, 1825, 329, textureX, textureY); // Box 565
		noseModel[41] = new ModelRendererTurbo(this, 1337, 297, textureX, textureY); // Box 1043

		noseModel[0].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1043
		noseModel[0].setRotationPoint(-173F, -69.5F, 0F);

		noseModel[1].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F); // Box 1044
		noseModel[1].setRotationPoint(-170F, -69.5F, 5F);

		noseModel[2].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, 0F, -3F, -1F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, -0.1F, -1F, 0F, -0.2F, -3F, 0F, -0.4F, 0F); // Box 1045
		noseModel[2].setRotationPoint(-164F, -69.5F, 2F);

		noseModel[3].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,-1F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 1050
		noseModel[3].setRotationPoint(-173F, -69.5F, 2F);

		noseModel[4].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.1F, 0F); // Box 1051
		noseModel[4].setRotationPoint(-162F, -69.5F, 0F);

		noseModel[5].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,0F, -0.5F, 0F, -3F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -2.25F, 0F, 0.25F, 0F, -3F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, 0.75F, -2.25F); // Box 1046
		noseModel[5].setRotationPoint(-175F, -68F, 2F);

		noseModel[6].addShapeBox(0F, 0F, 0F, 18, 1, 4, 0F,-3F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.25F, 0F, 0F, -0.5F, 0F, -3F, 0.4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.1F, 0F); // Box 1047
		noseModel[6].setRotationPoint(-164F, -69F, 2F);

		noseModel[7].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F); // Box 1048
		noseModel[7].setRotationPoint(-175F, -68F, 0F);

		noseModel[8].addShapeBox(0F, 0F, 0F, 15, 1, 2, 0F,0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.4F, 0F); // Box 1049
		noseModel[8].setRotationPoint(-161F, -69F, 0F);

		noseModel[9].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 351
		noseModel[9].setRotationPoint(-173F, -69.5F, -3F);

		noseModel[10].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F); // Box 352
		noseModel[10].setRotationPoint(-170F, -69.5F, -6F);

		noseModel[11].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, -1F, 0F, 0F, -3F, 0F, -0.4F, 0F, 0F, -0.2F, -3F, -1F, -0.2F, -1F, 0F, -0.4F, -3F); // Box 353
		noseModel[11].setRotationPoint(-164F, -69.5F, -6F);

		noseModel[12].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, -1F); // Box 354
		noseModel[12].setRotationPoint(-173F, -69.5F, -6F);

		noseModel[13].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 355
		noseModel[13].setRotationPoint(-162F, -69.5F, -3F);

		noseModel[14].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,0F, -1F, -2.25F, 0F, 0F, -2F, -3F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.75F, -2.25F, 0F, -0.5F, -2F, -3F, -0.5F, 0F, 0F, 0.25F, 0F); // Box 356
		noseModel[14].setRotationPoint(-175F, -68F, -8F);

		noseModel[15].addShapeBox(0F, 0F, 0F, 18, 1, 4, 0F,0F, -0.5F, 0F, 0F, 1.25F, 0F, 0F, 1.5F, 0F, -3F, 0F, 0F, 0F, 0.1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -3F, 0.4F, 0F); // Box 357
		noseModel[15].setRotationPoint(-164F, -69F, -6F);

		noseModel[16].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F); // Box 358
		noseModel[16].setRotationPoint(-175F, -68F, -2F);

		noseModel[17].addShapeBox(0F, 0F, 0F, 15, 1, 2, 0F,0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F); // Box 359
		noseModel[17].setRotationPoint(-161F, -69F, -2F);

		noseModel[18].addShapeBox(0F, 0F, 0F, 17, 2, 2, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364
		noseModel[18].setRotationPoint(-146F, -71F, -2F);

		noseModel[19].addShapeBox(0F, 0F, 0F, 16, 2, 4, 0F,0F, -0.75F, 0F, 1.75F, -0.25F, 0F, 1F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 1.75F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 365
		noseModel[19].setRotationPoint(-146F, -71F, -6F);

		noseModel[20].addShapeBox(0F, 0F, 0F, 18, 2, 8, 0F,0F, -3F, -0.75F, 6F, -1.75F, 0.5F, -0.25F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 1.75F, -1.25F, 6F, 0.5F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 366
		noseModel[20].setRotationPoint(-146F, -71F, -14F);

		noseModel[21].addShapeBox(0F, 0F, 0F, 3, 9, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1405
		noseModel[21].setRotationPoint(-172.5F, -36F, -3F);

		noseModel[22].addShapeBox(0F, 0F, 0F, 2, 9, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 1406
		noseModel[22].setRotationPoint(-174.5F, -36F, -3F);

		noseModel[23].addShapeBox(0F, 0F, 0F, 2, 9, 6, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 1407
		noseModel[23].setRotationPoint(-169.5F, -36F, -3F);

		noseModel[24].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 1408
		noseModel[24].setRotationPoint(-178.5F, -36F, -1F);

		noseModel[25].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 1409
		noseModel[25].setRotationPoint(-179.5F, -37F, -4F);

		noseModel[26].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1410
		noseModel[26].setRotationPoint(-179.5F, -38F, -4F);

		noseModel[27].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1411
		noseModel[27].setRotationPoint(-179.5F, -39F, -4F);

		noseModel[28].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1412
		noseModel[28].setRotationPoint(-179.5F, -40F, -2F);

		noseModel[29].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 1413
		noseModel[29].setRotationPoint(-179.5F, -40F, -1F);

		noseModel[30].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1414
		noseModel[30].setRotationPoint(-179.5F, -40F, -3F);

		noseModel[31].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1415
		noseModel[31].setRotationPoint(-179.5F, -41F, -2F);

		noseModel[32].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1416
		noseModel[32].setRotationPoint(-177.5F, -40F, 1F);

		noseModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1417
		noseModel[33].setRotationPoint(-178.5F, -38F, 3F);

		noseModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 1418
		noseModel[34].setRotationPoint(-175.5F, -36F, 1F);

		noseModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1419
		noseModel[35].setRotationPoint(-175.5F, -36F, 4F);

		noseModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1420
		noseModel[36].setRotationPoint(-177.5F, -38F, -5F);

		noseModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1421
		noseModel[37].setRotationPoint(-176.5F, -38F, -3F);

		noseModel[38].addShapeBox(0F, 0F, 0F, 17, 2, 2, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 563
		noseModel[38].setRotationPoint(-146F, -71F, 0F);

		noseModel[39].addShapeBox(0F, 0F, 0F, 16, 2, 4, 0F,0F, -0.5F, 0F, 1F, 0F, 0F, 1.75F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1.75F, 0F, 0F, 0F, 0F, 0F); // Box 564
		noseModel[39].setRotationPoint(-146F, -71F, 2F);

		noseModel[40].addShapeBox(0F, 0F, 0F, 18, 2, 8, 0F,0F, -0.75F, 0F, -0.25F, -0.25F, 0F, 6F, -1.75F, 0.5F, 0F, -3F, -0.75F, 0F, 0F, 0F, -0.25F, 0F, 0F, 6F, 0.5F, -0.25F, 0F, 1.75F, -1.25F); // Box 565
		noseModel[40].setRotationPoint(-146F, -71F, 6F);

		noseModel[41].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 1043
		noseModel[41].setRotationPoint(-174F, -48.5F, 11.5F);
	}

	private void inittailModel_1()
	{
		tailModel[0] = new ModelRendererTurbo(this, 1193, 89, textureX, textureY); // Box 278
		tailModel[1] = new ModelRendererTurbo(this, 169, 761, textureX, textureY); // Box 798
		tailModel[2] = new ModelRendererTurbo(this, 1793, 89, textureX, textureY); // Box 799
		tailModel[3] = new ModelRendererTurbo(this, 169, 769, textureX, textureY); // Box 800
		tailModel[4] = new ModelRendererTurbo(this, 1369, 169, textureX, textureY); // Box 801
		tailModel[5] = new ModelRendererTurbo(this, 297, 201, textureX, textureY); // Box 802
		tailModel[6] = new ModelRendererTurbo(this, 1489, 321, textureX, textureY); // Box 803
		tailModel[7] = new ModelRendererTurbo(this, 697, 249, textureX, textureY); // Box 808
		tailModel[8] = new ModelRendererTurbo(this, 25, 249, textureX, textureY); // Box 811
		tailModel[9] = new ModelRendererTurbo(this, 1337, 265, textureX, textureY); // Box 812
		tailModel[10] = new ModelRendererTurbo(this, 1625, 265, textureX, textureY); // Box 813
		tailModel[11] = new ModelRendererTurbo(this, 1425, 281, textureX, textureY); // Box 814
		tailModel[12] = new ModelRendererTurbo(this, 1761, 305, textureX, textureY); // Box 815
		tailModel[13] = new ModelRendererTurbo(this, 2041, 249, textureX, textureY); // Box 816
		tailModel[14] = new ModelRendererTurbo(this, 1457, 281, textureX, textureY); // Box 817
		tailModel[15] = new ModelRendererTurbo(this, 1921, 313, textureX, textureY); // Box 818
		tailModel[16] = new ModelRendererTurbo(this, 1425, 321, textureX, textureY); // Box 819
		tailModel[17] = new ModelRendererTurbo(this, 697, 289, textureX, textureY); // Box 820
		tailModel[18] = new ModelRendererTurbo(this, 1633, 321, textureX, textureY); // Box 821
		tailModel[19] = new ModelRendererTurbo(this, 1449, 289, textureX, textureY); // Box 822
		tailModel[20] = new ModelRendererTurbo(this, 1, 329, textureX, textureY); // Box 823
		tailModel[21] = new ModelRendererTurbo(this, 697, 201, textureX, textureY); // Box 824
		tailModel[22] = new ModelRendererTurbo(this, 313, 249, textureX, textureY); // Box 825
		tailModel[23] = new ModelRendererTurbo(this, 2041, 297, textureX, textureY); // Box 826
		tailModel[24] = new ModelRendererTurbo(this, 569, 345, textureX, textureY); // Box 827
		tailModel[25] = new ModelRendererTurbo(this, 33, 329, textureX, textureY); // Box 828
		tailModel[26] = new ModelRendererTurbo(this, 1024, 334, textureX, textureY); // Box 829
		tailModel[27] = new ModelRendererTurbo(this, 1561, 337, textureX, textureY); // Box 830
		tailModel[28] = new ModelRendererTurbo(this, 1593, 337, textureX, textureY); // Box 831
		tailModel[29] = new ModelRendererTurbo(this, 577, 345, textureX, textureY); // Box 832
		tailModel[30] = new ModelRendererTurbo(this, 2041, 345, textureX, textureY); // Box 833
		tailModel[31] = new ModelRendererTurbo(this, 1625, 337, textureX, textureY); // Box 834
		tailModel[32] = new ModelRendererTurbo(this, 1657, 337, textureX, textureY); // Box 835
		tailModel[33] = new ModelRendererTurbo(this, 1913, 353, textureX, textureY); // Box 836
		tailModel[34] = new ModelRendererTurbo(this, 1929, 337, textureX, textureY); // Box 837
		tailModel[35] = new ModelRendererTurbo(this, 689, 345, textureX, textureY); // Box 838
		tailModel[36] = new ModelRendererTurbo(this, 1961, 337, textureX, textureY); // Box 839

		tailModel[0].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
		tailModel[0].setRotationPoint(-18.5F, -84F, 4.5F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 215, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, 36.75F, -82.25F, 0F, 36.75F, 81.75F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -37.25F, -82.25F, 0F, -37.25F, 81.75F, 0F, -0.25F, -0.25F); // Box 798
		tailModel[1].setRotationPoint(-18F, -84F, 4.5F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 799
		tailModel[2].setRotationPoint(-18.5F, -84F, -5.5F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 215, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, 36.75F, 81.75F, 0F, 36.75F, -82.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -37.25F, 81.75F, 0F, -37.25F, -82.25F, 0F, -0.25F, -0.25F); // Box 800
		tailModel[3].setRotationPoint(-18F, -84F, -5.5F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 801
		tailModel[4].setRotationPoint(-42F, -13F, -0.5F);

		tailModel[5].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 802
		tailModel[5].setRotationPoint(16F, -14F, -0.5F);

		tailModel[6].addShapeBox(0F, 0F, 0F, 58, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.25F, -0.25F); // Box 803
		tailModel[6].setRotationPoint(-41.5F, -8.5F, -0.5F);

		tailModel[7].addShapeBox(0F, 0F, 0F, 1, 31, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 808
		tailModel[7].setRotationPoint(-52.5F, -45F, -4.5F);

		tailModel[8].addShapeBox(0F, 0F, 0F, 1, 30, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 811
		tailModel[8].setRotationPoint(-43F, -45F, -4.5F);

		tailModel[9].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F); // Box 812
		tailModel[9].setRotationPoint(-53F, -40.5F, -3.5F);

		tailModel[10].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F); // Box 813
		tailModel[10].setRotationPoint(-53F, -33.5F, -3.5F);

		tailModel[11].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F); // Box 814
		tailModel[11].setRotationPoint(-53F, -27F, -3.5F);

		tailModel[12].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F); // Box 815
		tailModel[12].setRotationPoint(-53F, -20F, -3.5F);

		tailModel[13].addShapeBox(0F, 0F, 0F, 1, 30, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 816
		tailModel[13].setRotationPoint(-33.5F, -45F, -4.5F);

		tailModel[14].addShapeBox(0F, 0F, 0F, 1, 30, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 817
		tailModel[14].setRotationPoint(16.5F, -45F, -4.5F);

		tailModel[15].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F); // Box 818
		tailModel[15].setRotationPoint(6.5F, -40.5F, -3.5F);

		tailModel[16].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F); // Box 819
		tailModel[16].setRotationPoint(6.5F, -33.5F, -3.5F);

		tailModel[17].addShapeBox(0F, 0F, 0F, 1, 30, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 820
		tailModel[17].setRotationPoint(7F, -45F, -4.5F);

		tailModel[18].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F); // Box 821
		tailModel[18].setRotationPoint(6.5F, -27F, -3.5F);

		tailModel[19].addShapeBox(0F, 0F, 0F, 1, 29, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 822
		tailModel[19].setRotationPoint(26F, -45F, -4.5F);

		tailModel[20].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F); // Box 823
		tailModel[20].setRotationPoint(6.5F, -20F, -3.5F);

		tailModel[21].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 18F, 0F, 0F, 18F, 0F, 2F, -19F, 0F, 2F, -19F); // Box 824
		tailModel[21].setRotationPoint(-12.5F, -45F, -1.5F);

		tailModel[22].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -19F, 0F, 2F, -19F, 0F, 0F, 18F, 0F, 0F, 18F); // Box 825
		tailModel[22].setRotationPoint(-12.5F, -45F, 0.5F);

		tailModel[23].addShapeBox(0F, 0F, 0F, 1, 31, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 826
		tailModel[23].setRotationPoint(-52.5F, -45F, 3.5F);

		tailModel[24].addShapeBox(0F, 0F, 0F, 1, 30, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 827
		tailModel[24].setRotationPoint(-43F, -45F, 3.5F);

		tailModel[25].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,-0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 828
		tailModel[25].setRotationPoint(-53F, -40.5F, 2.5F);

		tailModel[26].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,-0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 829
		tailModel[26].setRotationPoint(-53F, -33.5F, 2.5F);

		tailModel[27].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,-0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 830
		tailModel[27].setRotationPoint(-53F, -27F, 2.5F);

		tailModel[28].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,-0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 831
		tailModel[28].setRotationPoint(-53F, -20F, 2.5F);

		tailModel[29].addShapeBox(0F, 0F, 0F, 1, 30, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 832
		tailModel[29].setRotationPoint(-33.5F, -45F, 3.5F);

		tailModel[30].addShapeBox(0F, 0F, 0F, 1, 30, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 833
		tailModel[30].setRotationPoint(16.5F, -45F, 3.5F);

		tailModel[31].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,-0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 834
		tailModel[31].setRotationPoint(6.5F, -40.5F, 2.5F);

		tailModel[32].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,-0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 835
		tailModel[32].setRotationPoint(6.5F, -33.5F, 2.5F);

		tailModel[33].addShapeBox(0F, 0F, 0F, 1, 30, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 836
		tailModel[33].setRotationPoint(7F, -45F, 3.5F);

		tailModel[34].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,-0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 837
		tailModel[34].setRotationPoint(6.5F, -27F, 2.5F);

		tailModel[35].addShapeBox(0F, 0F, 0F, 1, 29, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 838
		tailModel[35].setRotationPoint(26F, -45F, 3.5F);

		tailModel[36].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,-0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 839
		tailModel[36].setRotationPoint(6.5F, -20F, 2.5F);
	}

	private void initbayModel_1()
	{
		bayModel[0] = new ModelRendererTurbo(this, 735, 301, textureX, textureY); // Box 823
		bayModel[1] = new ModelRendererTurbo(this, 1881, 377, textureX, textureY); // Box 824
		bayModel[2] = new ModelRendererTurbo(this, 1993, 377, textureX, textureY); // Box 825
		bayModel[3] = new ModelRendererTurbo(this, 1025, 385, textureX, textureY); // Box 826
		bayModel[4] = new ModelRendererTurbo(this, 1105, 385, textureX, textureY); // Box 827
		bayModel[5] = new ModelRendererTurbo(this, 1145, 385, textureX, textureY); // Box 828
		bayModel[6] = new ModelRendererTurbo(this, 1681, 385, textureX, textureY); // Box 829
		bayModel[7] = new ModelRendererTurbo(this, 1721, 385, textureX, textureY); // Box 830
		bayModel[8] = new ModelRendererTurbo(this, 1761, 385, textureX, textureY); // Box 831
		bayModel[9] = new ModelRendererTurbo(this, 1801, 385, textureX, textureY); // Box 832
		bayModel[10] = new ModelRendererTurbo(this, 465, 393, textureX, textureY); // Box 833
		bayModel[11] = new ModelRendererTurbo(this, 2017, 385, textureX, textureY); // Box 834
		bayModel[12] = new ModelRendererTurbo(this, 529, 393, textureX, textureY); // Box 835
		bayModel[13] = new ModelRendererTurbo(this, 561, 393, textureX, textureY); // Box 836
		bayModel[14] = new ModelRendererTurbo(this, 377, 257, textureX, textureY); // Box 837
		bayModel[15] = new ModelRendererTurbo(this, 409, 257, textureX, textureY); // Box 838
		bayModel[16] = new ModelRendererTurbo(this, 1121, 257, textureX, textureY); // Box 839
		bayModel[17] = new ModelRendererTurbo(this, 17, 193, textureX, textureY); // Box 840
		bayModel[18] = new ModelRendererTurbo(this, 1065, 193, textureX, textureY); // Box 841
		bayModel[19] = new ModelRendererTurbo(this, 201, 209, textureX, textureY); // Box 842
		bayModel[20] = new ModelRendererTurbo(this, 1161, 65, textureX, textureY); // Box 843
		bayModel[21] = new ModelRendererTurbo(this, 593, 393, textureX, textureY); // Box 844
		bayModel[22] = new ModelRendererTurbo(this, 697, 393, textureX, textureY); // Box 845
		bayModel[23] = new ModelRendererTurbo(this, 737, 393, textureX, textureY); // Box 846
		bayModel[24] = new ModelRendererTurbo(this, 1401, 257, textureX, textureY); // Box 871
		bayModel[25] = new ModelRendererTurbo(this, 1601, 257, textureX, textureY); // Box 872
		bayModel[26] = new ModelRendererTurbo(this, 177, 265, textureX, textureY); // Box 873
		bayModel[27] = new ModelRendererTurbo(this, 777, 393, textureX, textureY); // Box 874
		bayModel[28] = new ModelRendererTurbo(this, 817, 393, textureX, textureY); // Box 875
		bayModel[29] = new ModelRendererTurbo(this, 857, 393, textureX, textureY); // Box 876
		bayModel[30] = new ModelRendererTurbo(this, 929, 393, textureX, textureY); // Box 877
		bayModel[31] = new ModelRendererTurbo(this, 969, 393, textureX, textureY); // Box 878
		bayModel[32] = new ModelRendererTurbo(this, 1225, 393, textureX, textureY); // Box 879
		bayModel[33] = new ModelRendererTurbo(this, 1329, 393, textureX, textureY); // Box 880
		bayModel[34] = new ModelRendererTurbo(this, 18, 376, textureX, textureY); // Box 881
		bayModel[35] = new ModelRendererTurbo(this, 1881, 393, textureX, textureY); // Box 882
		bayModel[36] = new ModelRendererTurbo(this, 41, 401, textureX, textureY); // Box 883
		bayModel[37] = new ModelRendererTurbo(this, 59, 386, textureX, textureY); // Box 884
		bayModel[38] = new ModelRendererTurbo(this, 1369, 393, textureX, textureY); // Box 885
		bayModel[39] = new ModelRendererTurbo(this, 145, 401, textureX, textureY); // Box 886
		bayModel[40] = new ModelRendererTurbo(this, 185, 401, textureX, textureY); // Box 887
		bayModel[41] = new ModelRendererTurbo(this, 225, 401, textureX, textureY); // Box 888
		bayModel[42] = new ModelRendererTurbo(this, 617, 401, textureX, textureY); // Box 889
		bayModel[43] = new ModelRendererTurbo(this, 1025, 401, textureX, textureY); // Box 890
		bayModel[44] = new ModelRendererTurbo(this, 865, 209, textureX, textureY); // Box 891
		bayModel[45] = new ModelRendererTurbo(this, 897, 217, textureX, textureY); // Box 892
		bayModel[46] = new ModelRendererTurbo(this, 1825, 233, textureX, textureY); // Box 893
		bayModel[47] = new ModelRendererTurbo(this, 1177, 65, textureX, textureY); // Box 894
		bayModel[48] = new ModelRendererTurbo(this, 1105, 401, textureX, textureY); // Box 895
		bayModel[49] = new ModelRendererTurbo(this, 1145, 401, textureX, textureY); // Box 896
		bayModel[50] = new ModelRendererTurbo(this, 1249, 401, textureX, textureY); // Box 897
		bayModel[51] = new ModelRendererTurbo(this, 1393, 401, textureX, textureY); // Box 898
		bayModel[52] = new ModelRendererTurbo(this, 1505, 401, textureX, textureY); // Box 899
		bayModel[53] = new ModelRendererTurbo(this, 1545, 401, textureX, textureY); // Box 900
		bayModel[54] = new ModelRendererTurbo(this, 1585, 401, textureX, textureY); // Box 901
		bayModel[55] = new ModelRendererTurbo(this, 1681, 401, textureX, textureY); // Box 902
		bayModel[56] = new ModelRendererTurbo(this, 1713, 401, textureX, textureY); // Box 903
		bayModel[57] = new ModelRendererTurbo(this, 2017, 233, textureX, textureY); // Box 904
		bayModel[58] = new ModelRendererTurbo(this, 841, 249, textureX, textureY); // Box 905
		bayModel[59] = new ModelRendererTurbo(this, 1825, 249, textureX, textureY); // Box 906
		bayModel[60] = new ModelRendererTurbo(this, 82, 70, textureX, textureY); // Box 907
		bayModel[61] = new ModelRendererTurbo(this, 1745, 401, textureX, textureY); // Box 908
		bayModel[62] = new ModelRendererTurbo(this, 1785, 401, textureX, textureY); // Box 909
		bayModel[63] = new ModelRendererTurbo(this, 1849, 401, textureX, textureY); // Box 910
		bayModel[64] = new ModelRendererTurbo(this, 1953, 401, textureX, textureY); // Box 911
		bayModel[65] = new ModelRendererTurbo(this, 1993, 401, textureX, textureY); // Box 912
		bayModel[66] = new ModelRendererTurbo(this, 529, 409, textureX, textureY); // Box 913
		bayModel[67] = new ModelRendererTurbo(this, 505, 265, textureX, textureY); // Box 914
		bayModel[68] = new ModelRendererTurbo(this, 1121, 265, textureX, textureY); // Box 915
		bayModel[69] = new ModelRendererTurbo(this, 1249, 265, textureX, textureY); // Box 916
		bayModel[70] = new ModelRendererTurbo(this, 569, 409, textureX, textureY); // Box 917
		bayModel[71] = new ModelRendererTurbo(this, 697, 409, textureX, textureY); // Box 918
		bayModel[72] = new ModelRendererTurbo(this, 737, 409, textureX, textureY); // Box 919
		bayModel[73] = new ModelRendererTurbo(this, 777, 409, textureX, textureY); // Box 920
		bayModel[74] = new ModelRendererTurbo(this, 817, 409, textureX, textureY); // Box 921
		bayModel[75] = new ModelRendererTurbo(this, 2025, 265, textureX, textureY); // Box 922
		bayModel[76] = new ModelRendererTurbo(this, 1, 273, textureX, textureY); // Box 923
		bayModel[77] = new ModelRendererTurbo(this, 961, 273, textureX, textureY); // Box 924
		bayModel[78] = new ModelRendererTurbo(this, 857, 409, textureX, textureY); // Box 925
		bayModel[79] = new ModelRendererTurbo(this, 929, 409, textureX, textureY); // Box 926
		bayModel[80] = new ModelRendererTurbo(this, 969, 409, textureX, textureY); // Box 927
		bayModel[81] = new ModelRendererTurbo(this, 1225, 409, textureX, textureY); // Box 928
		bayModel[82] = new ModelRendererTurbo(this, 1329, 409, textureX, textureY); // Box 929
		bayModel[83] = new ModelRendererTurbo(this, 1417, 409, textureX, textureY); // Box 930
		bayModel[84] = new ModelRendererTurbo(this, 1873, 409, textureX, textureY); // Box 931
		bayModel[85] = new ModelRendererTurbo(this, 1, 417, textureX, textureY); // Box 932
		bayModel[86] = new ModelRendererTurbo(this, 1369, 409, textureX, textureY); // Box 933
		bayModel[87] = new ModelRendererTurbo(this, 41, 417, textureX, textureY); // Box 934
		bayModel[88] = new ModelRendererTurbo(this, 1809, 409, textureX, textureY); // Box 935
		bayModel[89] = new ModelRendererTurbo(this, 81, 417, textureX, textureY); // Box 936
		bayModel[90] = new ModelRendererTurbo(this, 2017, 409, textureX, textureY); // Box 937
		bayModel[91] = new ModelRendererTurbo(this, 145, 417, textureX, textureY); // Box 938
		bayModel[92] = new ModelRendererTurbo(this, 201, 257, textureX, textureY); // Box 939
		bayModel[93] = new ModelRendererTurbo(this, 1153, 257, textureX, textureY); // Box 940
		bayModel[94] = new ModelRendererTurbo(this, 89, 265, textureX, textureY); // Box 941
		bayModel[95] = new ModelRendererTurbo(this, 393, 73, textureX, textureY); // Box 942
		bayModel[96] = new ModelRendererTurbo(this, 177, 417, textureX, textureY); // Box 943
		bayModel[97] = new ModelRendererTurbo(this, 217, 417, textureX, textureY); // Box 944
		bayModel[98] = new ModelRendererTurbo(this, 593, 417, textureX, textureY); // Box 945
		bayModel[99] = new ModelRendererTurbo(this, 1257, 417, textureX, textureY); // Box 946
		bayModel[100] = new ModelRendererTurbo(this, 1393, 417, textureX, textureY); // Box 947
		bayModel[101] = new ModelRendererTurbo(this, 1505, 417, textureX, textureY); // Box 948
		bayModel[102] = new ModelRendererTurbo(this, 1545, 417, textureX, textureY); // Box 949
		bayModel[103] = new ModelRendererTurbo(this, 1577, 417, textureX, textureY); // Box 950
		bayModel[104] = new ModelRendererTurbo(this, 1681, 417, textureX, textureY); // Box 951
		bayModel[105] = new ModelRendererTurbo(this, 201, 265, textureX, textureY); // Box 952
		bayModel[106] = new ModelRendererTurbo(this, 1153, 265, textureX, textureY); // Box 953
		bayModel[107] = new ModelRendererTurbo(this, 1649, 265, textureX, textureY); // Box 954
		bayModel[108] = new ModelRendererTurbo(this, 1145, 73, textureX, textureY); // Box 955
		bayModel[109] = new ModelRendererTurbo(this, 1713, 417, textureX, textureY); // Box 956
		bayModel[110] = new ModelRendererTurbo(this, 1753, 417, textureX, textureY); // Box 957
		bayModel[111] = new ModelRendererTurbo(this, 1849, 417, textureX, textureY); // Box 958
		bayModel[112] = new ModelRendererTurbo(this, 1953, 417, textureX, textureY); // Box 959
		bayModel[113] = new ModelRendererTurbo(this, 1993, 417, textureX, textureY); // Box 960
		bayModel[114] = new ModelRendererTurbo(this, 313, 425, textureX, textureY); // Box 961
		bayModel[115] = new ModelRendererTurbo(this, 1065, 273, textureX, textureY); // Box 962
		bayModel[116] = new ModelRendererTurbo(this, 1505, 273, textureX, textureY); // Box 963
		bayModel[117] = new ModelRendererTurbo(this, 2025, 273, textureX, textureY); // Box 964
		bayModel[118] = new ModelRendererTurbo(this, 353, 425, textureX, textureY); // Box 965
		bayModel[119] = new ModelRendererTurbo(this, 393, 425, textureX, textureY); // Box 966
		bayModel[120] = new ModelRendererTurbo(this, 433, 425, textureX, textureY); // Box 967
		bayModel[121] = new ModelRendererTurbo(this, 529, 425, textureX, textureY); // Box 968
		bayModel[122] = new ModelRendererTurbo(this, 569, 425, textureX, textureY); // Box 969
		bayModel[123] = new ModelRendererTurbo(this, 385, 281, textureX, textureY); // Box 970
		bayModel[124] = new ModelRendererTurbo(this, 961, 281, textureX, textureY); // Box 971
		bayModel[125] = new ModelRendererTurbo(this, 1145, 281, textureX, textureY); // Box 972
		bayModel[126] = new ModelRendererTurbo(this, 625, 425, textureX, textureY); // Box 973
		bayModel[127] = new ModelRendererTurbo(this, 697, 425, textureX, textureY); // Box 974
		bayModel[128] = new ModelRendererTurbo(this, 737, 425, textureX, textureY); // Box 975
		bayModel[129] = new ModelRendererTurbo(this, 777, 425, textureX, textureY); // Box 976
		bayModel[130] = new ModelRendererTurbo(this, 817, 425, textureX, textureY); // Box 977
		bayModel[131] = new ModelRendererTurbo(this, 857, 425, textureX, textureY); // Box 978
		bayModel[132] = new ModelRendererTurbo(this, 929, 425, textureX, textureY); // Box 979
		bayModel[133] = new ModelRendererTurbo(this, 969, 425, textureX, textureY); // Box 980
		bayModel[134] = new ModelRendererTurbo(this, 1329, 425, textureX, textureY); // Box 981
		bayModel[135] = new ModelRendererTurbo(this, 1369, 425, textureX, textureY); // Box 982
		bayModel[136] = new ModelRendererTurbo(this, 1417, 425, textureX, textureY); // Box 983
		bayModel[137] = new ModelRendererTurbo(this, 1601, 425, textureX, textureY); // Box 984
		bayModel[138] = new ModelRendererTurbo(this, 2017, 425, textureX, textureY); // Box 985
		bayModel[139] = new ModelRendererTurbo(this, 1, 433, textureX, textureY); // Box 986
		bayModel[140] = new ModelRendererTurbo(this, 1729, 265, textureX, textureY); // Box 987
		bayModel[141] = new ModelRendererTurbo(this, 297, 281, textureX, textureY); // Box 988
		bayModel[142] = new ModelRendererTurbo(this, 1825, 281, textureX, textureY); // Box 989
		bayModel[143] = new ModelRendererTurbo(this, 1393, 73, textureX, textureY); // Box 990
		bayModel[144] = new ModelRendererTurbo(this, 33, 433, textureX, textureY); // Box 991
		bayModel[145] = new ModelRendererTurbo(this, 73, 433, textureX, textureY); // Box 992
		bayModel[146] = new ModelRendererTurbo(this, 145, 433, textureX, textureY); // Box 993
		bayModel[147] = new ModelRendererTurbo(this, 185, 433, textureX, textureY); // Box 994
		bayModel[148] = new ModelRendererTurbo(this, 225, 433, textureX, textureY); // Box 995
		bayModel[149] = new ModelRendererTurbo(this, 457, 433, textureX, textureY); // Box 996
		bayModel[150] = new ModelRendererTurbo(this, 593, 433, textureX, textureY); // Box 997
		bayModel[151] = new ModelRendererTurbo(this, 1025, 433, textureX, textureY); // Box 998
		bayModel[152] = new ModelRendererTurbo(this, 1065, 433, textureX, textureY); // Box 999
		bayModel[153] = new ModelRendererTurbo(this, 1105, 433, textureX, textureY); // Box 1000
		bayModel[154] = new ModelRendererTurbo(this, 1145, 433, textureX, textureY); // Box 1001
		bayModel[155] = new ModelRendererTurbo(this, 1185, 433, textureX, textureY); // Box 1002
		bayModel[156] = new ModelRendererTurbo(this, 1217, 433, textureX, textureY); // Box 1003
		bayModel[157] = new ModelRendererTurbo(this, 1249, 433, textureX, textureY); // Box 1004
		bayModel[158] = new ModelRendererTurbo(this, 1945, 281, textureX, textureY); // Box 1005
		bayModel[159] = new ModelRendererTurbo(this, 2025, 281, textureX, textureY); // Box 1006
		bayModel[160] = new ModelRendererTurbo(this, 385, 289, textureX, textureY); // Box 1007
		bayModel[161] = new ModelRendererTurbo(this, 961, 289, textureX, textureY); // Box 1008
		bayModel[162] = new ModelRendererTurbo(this, 1065, 289, textureX, textureY); // Box 1009
		bayModel[163] = new ModelRendererTurbo(this, 1689, 289, textureX, textureY); // Box 1010
		bayModel[164] = new ModelRendererTurbo(this, 1537, 73, textureX, textureY); // Box 1011
		bayModel[165] = new ModelRendererTurbo(this, 1505, 433, textureX, textureY); // Box 1012
		bayModel[166] = new ModelRendererTurbo(this, 1545, 433, textureX, textureY); // Box 1013
		bayModel[167] = new ModelRendererTurbo(this, 1681, 433, textureX, textureY); // Box 1014
		bayModel[168] = new ModelRendererTurbo(this, 1713, 289, textureX, textureY); // Box 1015
		bayModel[169] = new ModelRendererTurbo(this, 57, 297, textureX, textureY); // Box 1016
		bayModel[170] = new ModelRendererTurbo(this, 385, 297, textureX, textureY); // Box 1017
		bayModel[171] = new ModelRendererTurbo(this, 1393, 433, textureX, textureY); // Box 1018
		bayModel[172] = new ModelRendererTurbo(this, 1721, 433, textureX, textureY); // Box 1019
		bayModel[173] = new ModelRendererTurbo(this, 313, 441, textureX, textureY); // Box 1020
		bayModel[174] = new ModelRendererTurbo(this, 353, 441, textureX, textureY); // Box 1021
		bayModel[175] = new ModelRendererTurbo(this, 393, 441, textureX, textureY); // Box 1022
		bayModel[176] = new ModelRendererTurbo(this, 433, 441, textureX, textureY); // Box 1023
		bayModel[177] = new ModelRendererTurbo(this, 529, 441, textureX, textureY); // Box 1024
		bayModel[178] = new ModelRendererTurbo(this, 697, 441, textureX, textureY); // Box 1025
		bayModel[179] = new ModelRendererTurbo(this, 617, 441, textureX, textureY); // Box 1026
		bayModel[180] = new ModelRendererTurbo(this, 737, 441, textureX, textureY); // Box 1027
		bayModel[181] = new ModelRendererTurbo(this, 777, 441, textureX, textureY); // Box 1028
		bayModel[182] = new ModelRendererTurbo(this, 569, 441, textureX, textureY); // Box 1029
		bayModel[183] = new ModelRendererTurbo(this, 1329, 441, textureX, textureY); // Box 1030
		bayModel[184] = new ModelRendererTurbo(this, 1369, 441, textureX, textureY); // Box 1031
		bayModel[185] = new ModelRendererTurbo(this, 1417, 441, textureX, textureY); // Box 1032
		bayModel[186] = new ModelRendererTurbo(this, 1569, 441, textureX, textureY); // Box 1033
		bayModel[187] = new ModelRendererTurbo(this, 1601, 441, textureX, textureY); // Box 1034
		bayModel[188] = new ModelRendererTurbo(this, 441, 297, textureX, textureY); // Box 1035
		bayModel[189] = new ModelRendererTurbo(this, 505, 297, textureX, textureY); // Box 1036
		bayModel[190] = new ModelRendererTurbo(this, 617, 297, textureX, textureY); // Box 1037
		bayModel[191] = new ModelRendererTurbo(this, 489, 81, textureX, textureY); // Box 1038

		bayModel[0].addBox(-8F, -2F, -4.5F, 9, 3, 9, 0F); // Box 823
		bayModel[0].setRotationPoint(-41F, -30F, 9F);

		bayModel[1].addShapeBox(-8F, 1F, -4.5F, 9, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 824
		bayModel[1].setRotationPoint(-41F, -30F, 9F);

		bayModel[2].addShapeBox(1F, -2F, -4.5F, 7, 3, 9, 0F,0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F); // Box 825
		bayModel[2].setRotationPoint(-41F, -30F, 9F);

		bayModel[3].addShapeBox(1F, -5F, -4.5F, 7, 3, 9, 0F,0F, 0F, -3F, 0F, -0.5F, -3.5F, 0F, -0.5F, -3.5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, 0F); // Box 826
		bayModel[3].setRotationPoint(-41F, -30F, 9F);

		bayModel[4].addShapeBox(1F, 1F, -4.5F, 7, 3, 9, 0F,0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -0.5F, -3.5F, 0F, -0.5F, -3.5F, 0F, 0F, -3F); // Box 827
		bayModel[4].setRotationPoint(-41F, -30F, 9F);

		bayModel[5].addShapeBox(-15F, -5F, -4.5F, 7, 3, 9, 0F,0F, -0.5F, -3.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, -3.5F, 0F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F); // Box 828
		bayModel[5].setRotationPoint(-41F, -30F, 9F);

		bayModel[6].addShapeBox(-15F, 1F, -4.5F, 7, 3, 9, 0F,0F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, -0.5F, -3.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, -3.5F); // Box 829
		bayModel[6].setRotationPoint(-41F, -30F, 9F);

		bayModel[7].addShapeBox(-15F, -2F, -4.5F, 7, 3, 9, 0F,0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F); // Box 830
		bayModel[7].setRotationPoint(-41F, -30F, 9F);

		bayModel[8].addShapeBox(8F, -2F, -4.5F, 7, 3, 9, 0F,0F, -0.25F, -0.5F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, -0.25F, -0.5F); // Box 831
		bayModel[8].setRotationPoint(-41F, -30F, 9F);

		bayModel[9].addShapeBox(8F, -5F, -4.5F, 7, 3, 9, 0F,0F, -0.5F, -3.5F, 0F, -3F, -4F, 0F, -3F, -4F, 0F, -0.5F, -3.5F, 0F, 0.25F, -0.5F, 0F, 1F, -3F, 0F, 1F, -3F, 0F, 0.25F, -0.5F); // Box 832
		bayModel[9].setRotationPoint(-41F, -30F, 9F);

		bayModel[10].addShapeBox(8F, 1F, -4.5F, 7, 3, 9, 0F,0F, 0.25F, -0.5F, 0F, 1F, -3F, 0F, 1F, -3F, 0F, 0.25F, -0.5F, 0F, -0.5F, -3.5F, 0F, -3F, -4F, 0F, -3F, -4F, 0F, -0.5F, -3.5F); // Box 833
		bayModel[10].setRotationPoint(-41F, -30F, 9F);

		bayModel[11].addShapeBox(-20F, 1F, -4.5F, 5, 3, 9, 0F,0F, 1F, -3F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 1F, -3F, 0F, -3F, -4F, 0F, -0.5F, -3.5F, 0F, -0.5F, -3.5F, 0F, -3F, -4F); // Box 834
		bayModel[11].setRotationPoint(-41F, -30F, 9F);

		bayModel[12].addShapeBox(-20F, -2F, -4.5F, 5, 3, 9, 0F,0F, -1F, -3F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -1F, -3F); // Box 835
		bayModel[12].setRotationPoint(-41F, -30F, 9F);

		bayModel[13].addShapeBox(-20F, -5F, -4.5F, 5, 3, 9, 0F,0F, -3F, -4F, 0F, -0.5F, -3.5F, 0F, -0.5F, -3.5F, 0F, -3F, -4F, 0F, 1F, -3F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 1F, -3F); // Box 836
		bayModel[13].setRotationPoint(-41F, -30F, 9F);

		bayModel[14].addShapeBox(15F, -1F, -1.5F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, -0.4F, -1.2F, 0F, -0.4F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -1.2F, 0F, -0.4F, -1.2F, 0F, 0F, 0F); // Box 837
		bayModel[14].setRotationPoint(-41F, -30F, 9F);

		bayModel[15].addShapeBox(15F, -2F, -1.5F, 3, 1, 3, 0F,0F, 0F, -1F, 0F, -1.2F, -1.4F, 0F, -1.2F, -1.4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0.4F, -1.2F, 0F, 0.4F, -1.2F, 0F, 0F, 0F); // Box 838
		bayModel[15].setRotationPoint(-41F, -30F, 9F);

		bayModel[16].addShapeBox(15F, 0F, -1.5F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0.4F, -1.2F, 0F, 0.4F, -1.2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.2F, -1.4F, 0F, -1.2F, -1.4F, 0F, 0F, -1F); // Box 839
		bayModel[16].setRotationPoint(-41F, -30F, 9F);

		bayModel[17].addShapeBox(-21F, 0F, -1.5F, 1, 1, 3, 0F,0F, 0.4F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, -1.2F, 0F, -1.2F, -1.4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1.2F, -1.4F); // Box 840
		bayModel[17].setRotationPoint(-41F, -30F, 9F);

		bayModel[18].addShapeBox(-21F, -2F, -1.5F, 1, 1, 3, 0F,0F, -1.2F, -1.4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1.2F, -1.4F, 0F, 0.4F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, -1.2F); // Box 841
		bayModel[18].setRotationPoint(-41F, -30F, 9F);

		bayModel[19].addShapeBox(-21F, -1F, -1.5F, 1, 1, 3, 0F,0F, -0.4F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -1.2F, 0F, -0.4F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -1.2F); // Box 842
		bayModel[19].setRotationPoint(-41F, -30F, 9F);

		bayModel[20].addShapeBox(-22F, -1F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 843
		bayModel[20].setRotationPoint(-41F, -30F, 9F);

		bayModel[21].addShapeBox(7F, -5F, -4.5F, 15, 9, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -8.5F, 0F, 0F, -8.5F, 0F, -0.5F, 8F, 0F, -0.5F, 8F); // Box 844
		bayModel[21].setRotationPoint(-41F, -30F, 9F);

		bayModel[22].addShapeBox(7F, -5F, 3.5F, 15, 9, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 8F, 0F, -0.5F, 8F, 0F, 0F, -8.5F, 0F, 0F, -8.5F); // Box 845
		bayModel[22].setRotationPoint(-41F, -30F, 9F);

		bayModel[23].addShapeBox(-8F, -5F, -4.5F, 9, 3, 9, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 846
		bayModel[23].setRotationPoint(-41F, -30F, 9F);

		bayModel[24].addShapeBox(15F, 0F, -1.5F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0.4F, -1.2F, 0F, 0.4F, -1.2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.2F, -1.4F, 0F, -1.2F, -1.4F, 0F, 0F, -1F); // Box 871
		bayModel[24].setRotationPoint(-41F, -20F, 9F);

		bayModel[25].addShapeBox(15F, -1F, -1.5F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, -0.4F, -1.2F, 0F, -0.4F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -1.2F, 0F, -0.4F, -1.2F, 0F, 0F, 0F); // Box 872
		bayModel[25].setRotationPoint(-41F, -20F, 9F);

		bayModel[26].addShapeBox(15F, -2F, -1.5F, 3, 1, 3, 0F,0F, 0F, -1F, 0F, -1.2F, -1.4F, 0F, -1.2F, -1.4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0.4F, -1.2F, 0F, 0.4F, -1.2F, 0F, 0F, 0F); // Box 873
		bayModel[26].setRotationPoint(-41F, -20F, 9F);

		bayModel[27].addShapeBox(8F, -5F, -4.5F, 7, 3, 9, 0F,0F, -0.5F, -3.5F, 0F, -3F, -4F, 0F, -3F, -4F, 0F, -0.5F, -3.5F, 0F, 0.25F, -0.5F, 0F, 1F, -3F, 0F, 1F, -3F, 0F, 0.25F, -0.5F); // Box 874
		bayModel[27].setRotationPoint(-41F, -20F, 9F);

		bayModel[28].addShapeBox(8F, -2F, -4.5F, 7, 3, 9, 0F,0F, -0.25F, -0.5F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, -0.25F, -0.5F); // Box 875
		bayModel[28].setRotationPoint(-41F, -20F, 9F);

		bayModel[29].addShapeBox(8F, 1F, -4.5F, 7, 3, 9, 0F,0F, 0.25F, -0.5F, 0F, 1F, -3F, 0F, 1F, -3F, 0F, 0.25F, -0.5F, 0F, -0.5F, -3.5F, 0F, -3F, -4F, 0F, -3F, -4F, 0F, -0.5F, -3.5F); // Box 876
		bayModel[29].setRotationPoint(-41F, -20F, 9F);

		bayModel[30].addShapeBox(1F, 1F, -4.5F, 7, 3, 9, 0F,0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -0.5F, -3.5F, 0F, -0.5F, -3.5F, 0F, 0F, -3F); // Box 877
		bayModel[30].setRotationPoint(-41F, -20F, 9F);

		bayModel[31].addShapeBox(1F, -2F, -4.5F, 7, 3, 9, 0F,0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F); // Box 878
		bayModel[31].setRotationPoint(-41F, -20F, 9F);

		bayModel[32].addShapeBox(1F, -5F, -4.5F, 7, 3, 9, 0F,0F, 0F, -3F, 0F, -0.5F, -3.5F, 0F, -0.5F, -3.5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, 0F); // Box 879
		bayModel[32].setRotationPoint(-41F, -20F, 9F);

		bayModel[33].addShapeBox(7F, -5F, -4.5F, 15, 9, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -8.5F, 0F, 0F, -8.5F, 0F, -0.5F, 8F, 0F, -0.5F, 8F); // Box 880
		bayModel[33].setRotationPoint(-41F, -20F, 9F);

		bayModel[34].addShapeBox(7F, -5F, 3.5F, 15, 9, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 8F, 0F, -0.5F, 8F, 0F, 0F, -8.5F, 0F, 0F, -8.5F); // Box 881
		bayModel[34].setRotationPoint(-41F, -20F, 9F);

		bayModel[35].addShapeBox(-8F, 1F, -4.5F, 9, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 882
		bayModel[35].setRotationPoint(-41F, -20F, 9F);

		bayModel[36].addBox(-8F, -2F, -4.5F, 9, 3, 9, 0F); // Box 883
		bayModel[36].setRotationPoint(-41F, -20F, 9F);

		bayModel[37].addShapeBox(-8F, -5F, -4.5F, 9, 3, 9, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 884
		bayModel[37].setRotationPoint(-41F, -20F, 9F);

		bayModel[38].addShapeBox(-15F, -5F, -4.5F, 7, 3, 9, 0F,0F, -0.5F, -3.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, -3.5F, 0F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F); // Box 885
		bayModel[38].setRotationPoint(-41F, -20F, 9F);

		bayModel[39].addShapeBox(-15F, -2F, -4.5F, 7, 3, 9, 0F,0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F); // Box 886
		bayModel[39].setRotationPoint(-41F, -20F, 9F);

		bayModel[40].addShapeBox(-15F, 1F, -4.5F, 7, 3, 9, 0F,0F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, -0.5F, -3.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, -3.5F); // Box 887
		bayModel[40].setRotationPoint(-41F, -20F, 9F);

		bayModel[41].addShapeBox(-20F, 1F, -4.5F, 5, 3, 9, 0F,0F, 1F, -3F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 1F, -3F, 0F, -3F, -4F, 0F, -0.5F, -3.5F, 0F, -0.5F, -3.5F, 0F, -3F, -4F); // Box 888
		bayModel[41].setRotationPoint(-41F, -20F, 9F);

		bayModel[42].addShapeBox(-20F, -2F, -4.5F, 5, 3, 9, 0F,0F, -1F, -3F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -1F, -3F); // Box 889
		bayModel[42].setRotationPoint(-41F, -20F, 9F);

		bayModel[43].addShapeBox(-20F, -5F, -4.5F, 5, 3, 9, 0F,0F, -3F, -4F, 0F, -0.5F, -3.5F, 0F, -0.5F, -3.5F, 0F, -3F, -4F, 0F, 1F, -3F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 1F, -3F); // Box 890
		bayModel[43].setRotationPoint(-41F, -20F, 9F);

		bayModel[44].addShapeBox(-21F, 0F, -1.5F, 1, 1, 3, 0F,0F, 0.4F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, -1.2F, 0F, -1.2F, -1.4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1.2F, -1.4F); // Box 891
		bayModel[44].setRotationPoint(-41F, -20F, 9F);

		bayModel[45].addShapeBox(-21F, -1F, -1.5F, 1, 1, 3, 0F,0F, -0.4F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -1.2F, 0F, -0.4F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -1.2F); // Box 892
		bayModel[45].setRotationPoint(-41F, -20F, 9F);

		bayModel[46].addShapeBox(-21F, -2F, -1.5F, 1, 1, 3, 0F,0F, -1.2F, -1.4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1.2F, -1.4F, 0F, 0.4F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, -1.2F); // Box 893
		bayModel[46].setRotationPoint(-41F, -20F, 9F);

		bayModel[47].addShapeBox(-22F, -1F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 894
		bayModel[47].setRotationPoint(-41F, -20F, 9F);

		bayModel[48].addShapeBox(-8F, 1F, -4.5F, 9, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 895
		bayModel[48].setRotationPoint(21F, -31F, 9F);

		bayModel[49].addBox(-8F, -2F, -4.5F, 9, 3, 9, 0F); // Box 896
		bayModel[49].setRotationPoint(21F, -31F, 9F);

		bayModel[50].addShapeBox(-8F, -5F, -4.5F, 9, 3, 9, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 897
		bayModel[50].setRotationPoint(21F, -31F, 9F);

		bayModel[51].addShapeBox(-15F, -5F, -4.5F, 7, 3, 9, 0F,0F, -0.5F, -3.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, -3.5F, 0F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F); // Box 898
		bayModel[51].setRotationPoint(21F, -31F, 9F);

		bayModel[52].addShapeBox(-15F, -2F, -4.5F, 7, 3, 9, 0F,0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F); // Box 899
		bayModel[52].setRotationPoint(21F, -31F, 9F);

		bayModel[53].addShapeBox(-15F, 1F, -4.5F, 7, 3, 9, 0F,0F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, -0.5F, -3.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, -3.5F); // Box 900
		bayModel[53].setRotationPoint(21F, -31F, 9F);

		bayModel[54].addShapeBox(-20F, 1F, -4.5F, 5, 3, 9, 0F,0F, 1F, -3F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 1F, -3F, 0F, -3F, -4F, 0F, -0.5F, -3.5F, 0F, -0.5F, -3.5F, 0F, -3F, -4F); // Box 901
		bayModel[54].setRotationPoint(21F, -31F, 9F);

		bayModel[55].addShapeBox(-20F, -2F, -4.5F, 5, 3, 9, 0F,0F, -1F, -3F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -1F, -3F); // Box 902
		bayModel[55].setRotationPoint(21F, -31F, 9F);

		bayModel[56].addShapeBox(-20F, -5F, -4.5F, 5, 3, 9, 0F,0F, -3F, -4F, 0F, -0.5F, -3.5F, 0F, -0.5F, -3.5F, 0F, -3F, -4F, 0F, 1F, -3F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 1F, -3F); // Box 903
		bayModel[56].setRotationPoint(21F, -31F, 9F);

		bayModel[57].addShapeBox(-21F, 0F, -1.5F, 1, 1, 3, 0F,0F, 0.4F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, -1.2F, 0F, -1.2F, -1.4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1.2F, -1.4F); // Box 904
		bayModel[57].setRotationPoint(21F, -31F, 9F);

		bayModel[58].addShapeBox(-21F, -1F, -1.5F, 1, 1, 3, 0F,0F, -0.4F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -1.2F, 0F, -0.4F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -1.2F); // Box 905
		bayModel[58].setRotationPoint(21F, -31F, 9F);

		bayModel[59].addShapeBox(-21F, -2F, -1.5F, 1, 1, 3, 0F,0F, -1.2F, -1.4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1.2F, -1.4F, 0F, 0.4F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, -1.2F); // Box 906
		bayModel[59].setRotationPoint(21F, -31F, 9F);

		bayModel[60].addShapeBox(-22F, -1F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 907
		bayModel[60].setRotationPoint(21F, -31F, 9F);

		bayModel[61].addShapeBox(1F, -2F, -4.5F, 7, 3, 9, 0F,0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F); // Box 908
		bayModel[61].setRotationPoint(21F, -31F, 9F);

		bayModel[62].addShapeBox(1F, 1F, -4.5F, 7, 3, 9, 0F,0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -0.5F, -3.5F, 0F, -0.5F, -3.5F, 0F, 0F, -3F); // Box 909
		bayModel[62].setRotationPoint(21F, -31F, 9F);

		bayModel[63].addShapeBox(1F, -5F, -4.5F, 7, 3, 9, 0F,0F, 0F, -3F, 0F, -0.5F, -3.5F, 0F, -0.5F, -3.5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, 0F); // Box 910
		bayModel[63].setRotationPoint(21F, -31F, 9F);

		bayModel[64].addShapeBox(8F, -5F, -4.5F, 7, 3, 9, 0F,0F, -0.5F, -3.5F, 0F, -3F, -4F, 0F, -3F, -4F, 0F, -0.5F, -3.5F, 0F, 0.25F, -0.5F, 0F, 1F, -3F, 0F, 1F, -3F, 0F, 0.25F, -0.5F); // Box 911
		bayModel[64].setRotationPoint(21F, -31F, 9F);

		bayModel[65].addShapeBox(8F, -2F, -4.5F, 7, 3, 9, 0F,0F, -0.25F, -0.5F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, -0.25F, -0.5F); // Box 912
		bayModel[65].setRotationPoint(21F, -31F, 9F);

		bayModel[66].addShapeBox(8F, 1F, -4.5F, 7, 3, 9, 0F,0F, 0.25F, -0.5F, 0F, 1F, -3F, 0F, 1F, -3F, 0F, 0.25F, -0.5F, 0F, -0.5F, -3.5F, 0F, -3F, -4F, 0F, -3F, -4F, 0F, -0.5F, -3.5F); // Box 913
		bayModel[66].setRotationPoint(21F, -31F, 9F);

		bayModel[67].addShapeBox(15F, -1F, -1.5F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, -0.4F, -1.2F, 0F, -0.4F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -1.2F, 0F, -0.4F, -1.2F, 0F, 0F, 0F); // Box 914
		bayModel[67].setRotationPoint(21F, -31F, 9F);

		bayModel[68].addShapeBox(15F, -2F, -1.5F, 3, 1, 3, 0F,0F, 0F, -1F, 0F, -1.2F, -1.4F, 0F, -1.2F, -1.4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0.4F, -1.2F, 0F, 0.4F, -1.2F, 0F, 0F, 0F); // Box 915
		bayModel[68].setRotationPoint(21F, -31F, 9F);

		bayModel[69].addShapeBox(15F, 0F, -1.5F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0.4F, -1.2F, 0F, 0.4F, -1.2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.2F, -1.4F, 0F, -1.2F, -1.4F, 0F, 0F, -1F); // Box 916
		bayModel[69].setRotationPoint(21F, -31F, 9F);

		bayModel[70].addShapeBox(7F, -5F, 3.5F, 15, 9, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 8F, 0F, -0.5F, 8F, 0F, 0F, -8.5F, 0F, 0F, -8.5F); // Box 917
		bayModel[70].setRotationPoint(21F, -31F, 9F);

		bayModel[71].addShapeBox(7F, -5F, -4.5F, 15, 9, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -8.5F, 0F, 0F, -8.5F, 0F, -0.5F, 8F, 0F, -0.5F, 8F); // Box 918
		bayModel[71].setRotationPoint(21F, -31F, 9F);

		bayModel[72].addShapeBox(7F, -5F, -4.5F, 15, 9, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -8.5F, 0F, 0F, -8.5F, 0F, -0.5F, 8F, 0F, -0.5F, 8F); // Box 919
		bayModel[72].setRotationPoint(21F, -21F, 9F);

		bayModel[73].addShapeBox(7F, -5F, 3.5F, 15, 9, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 8F, 0F, -0.5F, 8F, 0F, 0F, -8.5F, 0F, 0F, -8.5F); // Box 920
		bayModel[73].setRotationPoint(21F, -21F, 9F);

		bayModel[74].addShapeBox(8F, -5F, -4.5F, 7, 3, 9, 0F,0F, -0.5F, -3.5F, 0F, -3F, -4F, 0F, -3F, -4F, 0F, -0.5F, -3.5F, 0F, 0.25F, -0.5F, 0F, 1F, -3F, 0F, 1F, -3F, 0F, 0.25F, -0.5F); // Box 921
		bayModel[74].setRotationPoint(21F, -21F, 9F);

		bayModel[75].addShapeBox(15F, -2F, -1.5F, 3, 1, 3, 0F,0F, 0F, -1F, 0F, -1.2F, -1.4F, 0F, -1.2F, -1.4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0.4F, -1.2F, 0F, 0.4F, -1.2F, 0F, 0F, 0F); // Box 922
		bayModel[75].setRotationPoint(21F, -21F, 9F);

		bayModel[76].addShapeBox(15F, 0F, -1.5F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0.4F, -1.2F, 0F, 0.4F, -1.2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.2F, -1.4F, 0F, -1.2F, -1.4F, 0F, 0F, -1F); // Box 923
		bayModel[76].setRotationPoint(21F, -21F, 9F);

		bayModel[77].addShapeBox(15F, -1F, -1.5F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, -0.4F, -1.2F, 0F, -0.4F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -1.2F, 0F, -0.4F, -1.2F, 0F, 0F, 0F); // Box 924
		bayModel[77].setRotationPoint(21F, -21F, 9F);

		bayModel[78].addShapeBox(8F, 1F, -4.5F, 7, 3, 9, 0F,0F, 0.25F, -0.5F, 0F, 1F, -3F, 0F, 1F, -3F, 0F, 0.25F, -0.5F, 0F, -0.5F, -3.5F, 0F, -3F, -4F, 0F, -3F, -4F, 0F, -0.5F, -3.5F); // Box 925
		bayModel[78].setRotationPoint(21F, -21F, 9F);

		bayModel[79].addShapeBox(8F, -2F, -4.5F, 7, 3, 9, 0F,0F, -0.25F, -0.5F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, -0.25F, -0.5F); // Box 926
		bayModel[79].setRotationPoint(21F, -21F, 9F);

		bayModel[80].addShapeBox(1F, -2F, -4.5F, 7, 3, 9, 0F,0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F); // Box 927
		bayModel[80].setRotationPoint(21F, -21F, 9F);

		bayModel[81].addShapeBox(1F, 1F, -4.5F, 7, 3, 9, 0F,0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -0.5F, -3.5F, 0F, -0.5F, -3.5F, 0F, 0F, -3F); // Box 928
		bayModel[81].setRotationPoint(21F, -21F, 9F);

		bayModel[82].addShapeBox(1F, -5F, -4.5F, 7, 3, 9, 0F,0F, 0F, -3F, 0F, -0.5F, -3.5F, 0F, -0.5F, -3.5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, 0F); // Box 929
		bayModel[82].setRotationPoint(21F, -21F, 9F);

		bayModel[83].addShapeBox(-8F, -5F, -4.5F, 9, 3, 9, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 930
		bayModel[83].setRotationPoint(21F, -21F, 9F);

		bayModel[84].addBox(-8F, -2F, -4.5F, 9, 3, 9, 0F); // Box 931
		bayModel[84].setRotationPoint(21F, -21F, 9F);

		bayModel[85].addShapeBox(-8F, 1F, -4.5F, 9, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 932
		bayModel[85].setRotationPoint(21F, -21F, 9F);

		bayModel[86].addShapeBox(-15F, -2F, -4.5F, 7, 3, 9, 0F,0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F); // Box 933
		bayModel[86].setRotationPoint(21F, -21F, 9F);

		bayModel[87].addShapeBox(-15F, -5F, -4.5F, 7, 3, 9, 0F,0F, -0.5F, -3.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, -3.5F, 0F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F); // Box 934
		bayModel[87].setRotationPoint(21F, -21F, 9F);

		bayModel[88].addShapeBox(-20F, 1F, -4.5F, 5, 3, 9, 0F,0F, 1F, -3F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 1F, -3F, 0F, -3F, -4F, 0F, -0.5F, -3.5F, 0F, -0.5F, -3.5F, 0F, -3F, -4F); // Box 935
		bayModel[88].setRotationPoint(21F, -21F, 9F);

		bayModel[89].addShapeBox(-15F, 1F, -4.5F, 7, 3, 9, 0F,0F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, -0.5F, -3.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, -3.5F); // Box 936
		bayModel[89].setRotationPoint(21F, -21F, 9F);

		bayModel[90].addShapeBox(-20F, -2F, -4.5F, 5, 3, 9, 0F,0F, -1F, -3F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -1F, -3F); // Box 937
		bayModel[90].setRotationPoint(21F, -21F, 9F);

		bayModel[91].addShapeBox(-20F, -5F, -4.5F, 5, 3, 9, 0F,0F, -3F, -4F, 0F, -0.5F, -3.5F, 0F, -0.5F, -3.5F, 0F, -3F, -4F, 0F, 1F, -3F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 1F, -3F); // Box 938
		bayModel[91].setRotationPoint(21F, -21F, 9F);

		bayModel[92].addShapeBox(-21F, 0F, -1.5F, 1, 1, 3, 0F,0F, 0.4F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, -1.2F, 0F, -1.2F, -1.4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1.2F, -1.4F); // Box 939
		bayModel[92].setRotationPoint(21F, -21F, 9F);

		bayModel[93].addShapeBox(-21F, -1F, -1.5F, 1, 1, 3, 0F,0F, -0.4F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -1.2F, 0F, -0.4F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -1.2F); // Box 940
		bayModel[93].setRotationPoint(21F, -21F, 9F);

		bayModel[94].addShapeBox(-21F, -2F, -1.5F, 1, 1, 3, 0F,0F, -1.2F, -1.4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1.2F, -1.4F, 0F, 0.4F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, -1.2F); // Box 941
		bayModel[94].setRotationPoint(21F, -21F, 9F);

		bayModel[95].addShapeBox(-22F, -1F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 942
		bayModel[95].setRotationPoint(21F, -21F, 9F);

		bayModel[96].addShapeBox(-8F, 1F, -4.5F, 9, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 943
		bayModel[96].setRotationPoint(21F, -31F, -8F);

		bayModel[97].addBox(-8F, -2F, -4.5F, 9, 3, 9, 0F); // Box 944
		bayModel[97].setRotationPoint(21F, -31F, -8F);

		bayModel[98].addShapeBox(-8F, -5F, -4.5F, 9, 3, 9, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 945
		bayModel[98].setRotationPoint(21F, -31F, -8F);

		bayModel[99].addShapeBox(-15F, -5F, -4.5F, 7, 3, 9, 0F,0F, -0.5F, -3.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, -3.5F, 0F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F); // Box 946
		bayModel[99].setRotationPoint(21F, -31F, -8F);

		bayModel[100].addShapeBox(-15F, -2F, -4.5F, 7, 3, 9, 0F,0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F); // Box 947
		bayModel[100].setRotationPoint(21F, -31F, -8F);

		bayModel[101].addShapeBox(-15F, 1F, -4.5F, 7, 3, 9, 0F,0F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, -0.5F, -3.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, -3.5F); // Box 948
		bayModel[101].setRotationPoint(21F, -31F, -8F);

		bayModel[102].addShapeBox(-20F, 1F, -4.5F, 5, 3, 9, 0F,0F, 1F, -3F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 1F, -3F, 0F, -3F, -4F, 0F, -0.5F, -3.5F, 0F, -0.5F, -3.5F, 0F, -3F, -4F); // Box 949
		bayModel[102].setRotationPoint(21F, -31F, -8F);

		bayModel[103].addShapeBox(-20F, -2F, -4.5F, 5, 3, 9, 0F,0F, -1F, -3F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -1F, -3F); // Box 950
		bayModel[103].setRotationPoint(21F, -31F, -8F);

		bayModel[104].addShapeBox(-20F, -5F, -4.5F, 5, 3, 9, 0F,0F, -3F, -4F, 0F, -0.5F, -3.5F, 0F, -0.5F, -3.5F, 0F, -3F, -4F, 0F, 1F, -3F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 1F, -3F); // Box 951
		bayModel[104].setRotationPoint(21F, -31F, -8F);

		bayModel[105].addShapeBox(-21F, 0F, -1.5F, 1, 1, 3, 0F,0F, 0.4F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, -1.2F, 0F, -1.2F, -1.4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1.2F, -1.4F); // Box 952
		bayModel[105].setRotationPoint(21F, -31F, -8F);

		bayModel[106].addShapeBox(-21F, -1F, -1.5F, 1, 1, 3, 0F,0F, -0.4F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -1.2F, 0F, -0.4F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -1.2F); // Box 953
		bayModel[106].setRotationPoint(21F, -31F, -8F);

		bayModel[107].addShapeBox(-21F, -2F, -1.5F, 1, 1, 3, 0F,0F, -1.2F, -1.4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1.2F, -1.4F, 0F, 0.4F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, -1.2F); // Box 954
		bayModel[107].setRotationPoint(21F, -31F, -8F);

		bayModel[108].addShapeBox(-22F, -1F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 955
		bayModel[108].setRotationPoint(21F, -31F, -8F);

		bayModel[109].addShapeBox(1F, -2F, -4.5F, 7, 3, 9, 0F,0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F); // Box 956
		bayModel[109].setRotationPoint(21F, -31F, -8F);

		bayModel[110].addShapeBox(1F, 1F, -4.5F, 7, 3, 9, 0F,0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -0.5F, -3.5F, 0F, -0.5F, -3.5F, 0F, 0F, -3F); // Box 957
		bayModel[110].setRotationPoint(21F, -31F, -8F);

		bayModel[111].addShapeBox(1F, -5F, -4.5F, 7, 3, 9, 0F,0F, 0F, -3F, 0F, -0.5F, -3.5F, 0F, -0.5F, -3.5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, 0F); // Box 958
		bayModel[111].setRotationPoint(21F, -31F, -8F);

		bayModel[112].addShapeBox(8F, -5F, -4.5F, 7, 3, 9, 0F,0F, -0.5F, -3.5F, 0F, -3F, -4F, 0F, -3F, -4F, 0F, -0.5F, -3.5F, 0F, 0.25F, -0.5F, 0F, 1F, -3F, 0F, 1F, -3F, 0F, 0.25F, -0.5F); // Box 959
		bayModel[112].setRotationPoint(21F, -31F, -8F);

		bayModel[113].addShapeBox(8F, -2F, -4.5F, 7, 3, 9, 0F,0F, -0.25F, -0.5F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, -0.25F, -0.5F); // Box 960
		bayModel[113].setRotationPoint(21F, -31F, -8F);

		bayModel[114].addShapeBox(8F, 1F, -4.5F, 7, 3, 9, 0F,0F, 0.25F, -0.5F, 0F, 1F, -3F, 0F, 1F, -3F, 0F, 0.25F, -0.5F, 0F, -0.5F, -3.5F, 0F, -3F, -4F, 0F, -3F, -4F, 0F, -0.5F, -3.5F); // Box 961
		bayModel[114].setRotationPoint(21F, -31F, -8F);

		bayModel[115].addShapeBox(15F, -1F, -1.5F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, -0.4F, -1.2F, 0F, -0.4F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -1.2F, 0F, -0.4F, -1.2F, 0F, 0F, 0F); // Box 962
		bayModel[115].setRotationPoint(21F, -31F, -8F);

		bayModel[116].addShapeBox(15F, -2F, -1.5F, 3, 1, 3, 0F,0F, 0F, -1F, 0F, -1.2F, -1.4F, 0F, -1.2F, -1.4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0.4F, -1.2F, 0F, 0.4F, -1.2F, 0F, 0F, 0F); // Box 963
		bayModel[116].setRotationPoint(21F, -31F, -8F);

		bayModel[117].addShapeBox(15F, 0F, -1.5F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0.4F, -1.2F, 0F, 0.4F, -1.2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.2F, -1.4F, 0F, -1.2F, -1.4F, 0F, 0F, -1F); // Box 964
		bayModel[117].setRotationPoint(21F, -31F, -8F);

		bayModel[118].addShapeBox(7F, -5F, 3.5F, 15, 9, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -8.5F, 0F, 0F, -8.5F, 0F, -0.5F, 8F, 0F, -0.5F, 8F); // Box 965
		bayModel[118].setRotationPoint(21F, -31F, -16F);

		bayModel[119].addShapeBox(7F, -5F, -4.5F, 15, 9, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 8F, 0F, -0.5F, 8F, 0F, 0F, -8.5F, 0F, 0F, -8.5F); // Box 966
		bayModel[119].setRotationPoint(21F, -31F, 0F);

		bayModel[120].addShapeBox(7F, -5F, -4.5F, 15, 9, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 8F, 0F, -0.5F, 8F, 0F, 0F, -8.5F, 0F, 0F, -8.5F); // Box 967
		bayModel[120].setRotationPoint(21F, -21F, 0F);

		bayModel[121].addShapeBox(7F, -5F, 3.5F, 15, 9, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -8.5F, 0F, 0F, -8.5F, 0F, -0.5F, 8F, 0F, -0.5F, 8F); // Box 968
		bayModel[121].setRotationPoint(21F, -21F, -16F);

		bayModel[122].addShapeBox(8F, -5F, -4.5F, 7, 3, 9, 0F,0F, -0.5F, -3.5F, 0F, -3F, -4F, 0F, -3F, -4F, 0F, -0.5F, -3.5F, 0F, 0.25F, -0.5F, 0F, 1F, -3F, 0F, 1F, -3F, 0F, 0.25F, -0.5F); // Box 969
		bayModel[122].setRotationPoint(21F, -21F, -8F);

		bayModel[123].addShapeBox(15F, -2F, -1.5F, 3, 1, 3, 0F,0F, 0F, -1F, 0F, -1.2F, -1.4F, 0F, -1.2F, -1.4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0.4F, -1.2F, 0F, 0.4F, -1.2F, 0F, 0F, 0F); // Box 970
		bayModel[123].setRotationPoint(21F, -21F, -8F);

		bayModel[124].addShapeBox(15F, 0F, -1.5F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0.4F, -1.2F, 0F, 0.4F, -1.2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.2F, -1.4F, 0F, -1.2F, -1.4F, 0F, 0F, -1F); // Box 971
		bayModel[124].setRotationPoint(21F, -21F, -8F);

		bayModel[125].addShapeBox(15F, -1F, -1.5F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, -0.4F, -1.2F, 0F, -0.4F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -1.2F, 0F, -0.4F, -1.2F, 0F, 0F, 0F); // Box 972
		bayModel[125].setRotationPoint(21F, -21F, -8F);

		bayModel[126].addShapeBox(8F, 1F, -4.5F, 7, 3, 9, 0F,0F, 0.25F, -0.5F, 0F, 1F, -3F, 0F, 1F, -3F, 0F, 0.25F, -0.5F, 0F, -0.5F, -3.5F, 0F, -3F, -4F, 0F, -3F, -4F, 0F, -0.5F, -3.5F); // Box 973
		bayModel[126].setRotationPoint(21F, -21F, -8F);

		bayModel[127].addShapeBox(8F, -2F, -4.5F, 7, 3, 9, 0F,0F, -0.25F, -0.5F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, -0.25F, -0.5F); // Box 974
		bayModel[127].setRotationPoint(21F, -21F, -8F);

		bayModel[128].addShapeBox(1F, -2F, -4.5F, 7, 3, 9, 0F,0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F); // Box 975
		bayModel[128].setRotationPoint(21F, -21F, -8F);

		bayModel[129].addShapeBox(1F, 1F, -4.5F, 7, 3, 9, 0F,0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -0.5F, -3.5F, 0F, -0.5F, -3.5F, 0F, 0F, -3F); // Box 976
		bayModel[129].setRotationPoint(21F, -21F, -8F);

		bayModel[130].addShapeBox(1F, -5F, -4.5F, 7, 3, 9, 0F,0F, 0F, -3F, 0F, -0.5F, -3.5F, 0F, -0.5F, -3.5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, 0F); // Box 977
		bayModel[130].setRotationPoint(21F, -21F, -8F);

		bayModel[131].addShapeBox(-8F, -5F, -4.5F, 9, 3, 9, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 978
		bayModel[131].setRotationPoint(21F, -21F, -8F);

		bayModel[132].addBox(-8F, -2F, -4.5F, 9, 3, 9, 0F); // Box 979
		bayModel[132].setRotationPoint(21F, -21F, -8F);

		bayModel[133].addShapeBox(-8F, 1F, -4.5F, 9, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 980
		bayModel[133].setRotationPoint(21F, -21F, -8F);

		bayModel[134].addShapeBox(-15F, -2F, -4.5F, 7, 3, 9, 0F,0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F); // Box 981
		bayModel[134].setRotationPoint(21F, -21F, -8F);

		bayModel[135].addShapeBox(-15F, -5F, -4.5F, 7, 3, 9, 0F,0F, -0.5F, -3.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, -3.5F, 0F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F); // Box 982
		bayModel[135].setRotationPoint(21F, -21F, -8F);

		bayModel[136].addShapeBox(-20F, 1F, -4.5F, 5, 3, 9, 0F,0F, 1F, -3F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 1F, -3F, 0F, -3F, -4F, 0F, -0.5F, -3.5F, 0F, -0.5F, -3.5F, 0F, -3F, -4F); // Box 983
		bayModel[136].setRotationPoint(21F, -21F, -8F);

		bayModel[137].addShapeBox(-15F, 1F, -4.5F, 7, 3, 9, 0F,0F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, -0.5F, -3.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, -3.5F); // Box 984
		bayModel[137].setRotationPoint(21F, -21F, -8F);

		bayModel[138].addShapeBox(-20F, -2F, -4.5F, 5, 3, 9, 0F,0F, -1F, -3F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -1F, -3F); // Box 985
		bayModel[138].setRotationPoint(21F, -21F, -8F);

		bayModel[139].addShapeBox(-20F, -5F, -4.5F, 5, 3, 9, 0F,0F, -3F, -4F, 0F, -0.5F, -3.5F, 0F, -0.5F, -3.5F, 0F, -3F, -4F, 0F, 1F, -3F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 1F, -3F); // Box 986
		bayModel[139].setRotationPoint(21F, -21F, -8F);

		bayModel[140].addShapeBox(-21F, 0F, -1.5F, 1, 1, 3, 0F,0F, 0.4F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, -1.2F, 0F, -1.2F, -1.4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1.2F, -1.4F); // Box 987
		bayModel[140].setRotationPoint(21F, -21F, -8F);

		bayModel[141].addShapeBox(-21F, -1F, -1.5F, 1, 1, 3, 0F,0F, -0.4F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -1.2F, 0F, -0.4F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -1.2F); // Box 988
		bayModel[141].setRotationPoint(21F, -21F, -8F);

		bayModel[142].addShapeBox(-21F, -2F, -1.5F, 1, 1, 3, 0F,0F, -1.2F, -1.4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1.2F, -1.4F, 0F, 0.4F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, -1.2F); // Box 989
		bayModel[142].setRotationPoint(21F, -21F, -8F);

		bayModel[143].addShapeBox(-22F, -1F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 990
		bayModel[143].setRotationPoint(21F, -21F, -8F);

		bayModel[144].addBox(-8F, -2F, -4.5F, 9, 3, 9, 0F); // Box 991
		bayModel[144].setRotationPoint(-41F, -30F, -9F);

		bayModel[145].addShapeBox(-8F, 1F, -4.5F, 9, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 992
		bayModel[145].setRotationPoint(-41F, -30F, -9F);

		bayModel[146].addShapeBox(1F, -2F, -4.5F, 7, 3, 9, 0F,0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F); // Box 993
		bayModel[146].setRotationPoint(-41F, -30F, -9F);

		bayModel[147].addShapeBox(1F, -5F, -4.5F, 7, 3, 9, 0F,0F, 0F, -3F, 0F, -0.5F, -3.5F, 0F, -0.5F, -3.5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, 0F); // Box 994
		bayModel[147].setRotationPoint(-41F, -30F, -9F);

		bayModel[148].addShapeBox(1F, 1F, -4.5F, 7, 3, 9, 0F,0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -0.5F, -3.5F, 0F, -0.5F, -3.5F, 0F, 0F, -3F); // Box 995
		bayModel[148].setRotationPoint(-41F, -30F, -9F);

		bayModel[149].addShapeBox(-15F, -5F, -4.5F, 7, 3, 9, 0F,0F, -0.5F, -3.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, -3.5F, 0F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F); // Box 996
		bayModel[149].setRotationPoint(-41F, -30F, -9F);

		bayModel[150].addShapeBox(-15F, 1F, -4.5F, 7, 3, 9, 0F,0F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, -0.5F, -3.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, -3.5F); // Box 997
		bayModel[150].setRotationPoint(-41F, -30F, -9F);

		bayModel[151].addShapeBox(-15F, -2F, -4.5F, 7, 3, 9, 0F,0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F); // Box 998
		bayModel[151].setRotationPoint(-41F, -30F, -9F);

		bayModel[152].addShapeBox(8F, -2F, -4.5F, 7, 3, 9, 0F,0F, -0.25F, -0.5F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, -0.25F, -0.5F); // Box 999
		bayModel[152].setRotationPoint(-41F, -30F, -9F);

		bayModel[153].addShapeBox(8F, -5F, -4.5F, 7, 3, 9, 0F,0F, -0.5F, -3.5F, 0F, -3F, -4F, 0F, -3F, -4F, 0F, -0.5F, -3.5F, 0F, 0.25F, -0.5F, 0F, 1F, -3F, 0F, 1F, -3F, 0F, 0.25F, -0.5F); // Box 1000
		bayModel[153].setRotationPoint(-41F, -30F, -9F);

		bayModel[154].addShapeBox(8F, 1F, -4.5F, 7, 3, 9, 0F,0F, 0.25F, -0.5F, 0F, 1F, -3F, 0F, 1F, -3F, 0F, 0.25F, -0.5F, 0F, -0.5F, -3.5F, 0F, -3F, -4F, 0F, -3F, -4F, 0F, -0.5F, -3.5F); // Box 1001
		bayModel[154].setRotationPoint(-41F, -30F, -9F);

		bayModel[155].addShapeBox(-20F, 1F, -4.5F, 5, 3, 9, 0F,0F, 1F, -3F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 1F, -3F, 0F, -3F, -4F, 0F, -0.5F, -3.5F, 0F, -0.5F, -3.5F, 0F, -3F, -4F); // Box 1002
		bayModel[155].setRotationPoint(-41F, -30F, -9F);

		bayModel[156].addShapeBox(-20F, -2F, -4.5F, 5, 3, 9, 0F,0F, -1F, -3F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -1F, -3F); // Box 1003
		bayModel[156].setRotationPoint(-41F, -30F, -9F);

		bayModel[157].addShapeBox(-20F, -5F, -4.5F, 5, 3, 9, 0F,0F, -3F, -4F, 0F, -0.5F, -3.5F, 0F, -0.5F, -3.5F, 0F, -3F, -4F, 0F, 1F, -3F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 1F, -3F); // Box 1004
		bayModel[157].setRotationPoint(-41F, -30F, -9F);

		bayModel[158].addShapeBox(15F, -1F, -1.5F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, -0.4F, -1.2F, 0F, -0.4F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -1.2F, 0F, -0.4F, -1.2F, 0F, 0F, 0F); // Box 1005
		bayModel[158].setRotationPoint(-41F, -30F, -9F);

		bayModel[159].addShapeBox(15F, -2F, -1.5F, 3, 1, 3, 0F,0F, 0F, -1F, 0F, -1.2F, -1.4F, 0F, -1.2F, -1.4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0.4F, -1.2F, 0F, 0.4F, -1.2F, 0F, 0F, 0F); // Box 1006
		bayModel[159].setRotationPoint(-41F, -30F, -9F);

		bayModel[160].addShapeBox(15F, 0F, -1.5F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0.4F, -1.2F, 0F, 0.4F, -1.2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.2F, -1.4F, 0F, -1.2F, -1.4F, 0F, 0F, -1F); // Box 1007
		bayModel[160].setRotationPoint(-41F, -30F, -9F);

		bayModel[161].addShapeBox(-21F, 0F, -1.5F, 1, 1, 3, 0F,0F, 0.4F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, -1.2F, 0F, -1.2F, -1.4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1.2F, -1.4F); // Box 1008
		bayModel[161].setRotationPoint(-41F, -30F, -9F);

		bayModel[162].addShapeBox(-21F, -2F, -1.5F, 1, 1, 3, 0F,0F, -1.2F, -1.4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1.2F, -1.4F, 0F, 0.4F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, -1.2F); // Box 1009
		bayModel[162].setRotationPoint(-41F, -30F, -9F);

		bayModel[163].addShapeBox(-21F, -1F, -1.5F, 1, 1, 3, 0F,0F, -0.4F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -1.2F, 0F, -0.4F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -1.2F); // Box 1010
		bayModel[163].setRotationPoint(-41F, -30F, -9F);

		bayModel[164].addShapeBox(-22F, -1F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1011
		bayModel[164].setRotationPoint(-41F, -30F, -9F);

		bayModel[165].addShapeBox(7F, -5F, -4.5F, 15, 9, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 8F, 0F, -0.5F, 8F, 0F, 0F, -8.5F, 0F, 0F, -8.5F); // Box 1012
		bayModel[165].setRotationPoint(-41F, -30F, -1F);

		bayModel[166].addShapeBox(7F, -5F, 3.5F, 15, 9, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -8.5F, 0F, 0F, -8.5F, 0F, -0.5F, 8F, 0F, -0.5F, 8F); // Box 1013
		bayModel[166].setRotationPoint(-41F, -30F, -17F);

		bayModel[167].addShapeBox(-8F, -5F, -4.5F, 9, 3, 9, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1014
		bayModel[167].setRotationPoint(-41F, -30F, -9F);

		bayModel[168].addShapeBox(15F, 0F, -1.5F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0.4F, -1.2F, 0F, 0.4F, -1.2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.2F, -1.4F, 0F, -1.2F, -1.4F, 0F, 0F, -1F); // Box 1015
		bayModel[168].setRotationPoint(-41F, -20F, -9F);

		bayModel[169].addShapeBox(15F, -1F, -1.5F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, -0.4F, -1.2F, 0F, -0.4F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -1.2F, 0F, -0.4F, -1.2F, 0F, 0F, 0F); // Box 1016
		bayModel[169].setRotationPoint(-41F, -20F, -9F);

		bayModel[170].addShapeBox(15F, -2F, -1.5F, 3, 1, 3, 0F,0F, 0F, -1F, 0F, -1.2F, -1.4F, 0F, -1.2F, -1.4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0.4F, -1.2F, 0F, 0.4F, -1.2F, 0F, 0F, 0F); // Box 1017
		bayModel[170].setRotationPoint(-41F, -20F, -9F);

		bayModel[171].addShapeBox(8F, -5F, -4.5F, 7, 3, 9, 0F,0F, -0.5F, -3.5F, 0F, -3F, -4F, 0F, -3F, -4F, 0F, -0.5F, -3.5F, 0F, 0.25F, -0.5F, 0F, 1F, -3F, 0F, 1F, -3F, 0F, 0.25F, -0.5F); // Box 1018
		bayModel[171].setRotationPoint(-41F, -20F, -9F);

		bayModel[172].addShapeBox(8F, -2F, -4.5F, 7, 3, 9, 0F,0F, -0.25F, -0.5F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, -0.25F, -0.5F); // Box 1019
		bayModel[172].setRotationPoint(-41F, -20F, -9F);

		bayModel[173].addShapeBox(8F, 1F, -4.5F, 7, 3, 9, 0F,0F, 0.25F, -0.5F, 0F, 1F, -3F, 0F, 1F, -3F, 0F, 0.25F, -0.5F, 0F, -0.5F, -3.5F, 0F, -3F, -4F, 0F, -3F, -4F, 0F, -0.5F, -3.5F); // Box 1020
		bayModel[173].setRotationPoint(-41F, -20F, -9F);

		bayModel[174].addShapeBox(1F, 1F, -4.5F, 7, 3, 9, 0F,0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -0.5F, -3.5F, 0F, -0.5F, -3.5F, 0F, 0F, -3F); // Box 1021
		bayModel[174].setRotationPoint(-41F, -20F, -9F);

		bayModel[175].addShapeBox(1F, -2F, -4.5F, 7, 3, 9, 0F,0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F); // Box 1022
		bayModel[175].setRotationPoint(-41F, -20F, -9F);

		bayModel[176].addShapeBox(1F, -5F, -4.5F, 7, 3, 9, 0F,0F, 0F, -3F, 0F, -0.5F, -3.5F, 0F, -0.5F, -3.5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, 0F); // Box 1023
		bayModel[176].setRotationPoint(-41F, -20F, -9F);

		bayModel[177].addShapeBox(7F, -5F, -4.5F, 15, 9, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 8F, 0F, -0.5F, 8F, 0F, 0F, -8.5F, 0F, 0F, -8.5F); // Box 1024
		bayModel[177].setRotationPoint(-41F, -20F, -1F);

		bayModel[178].addShapeBox(7F, -5F, 3.5F, 15, 9, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -8.5F, 0F, 0F, -8.5F, 0F, -0.5F, 8F, 0F, -0.5F, 8F); // Box 1025
		bayModel[178].setRotationPoint(-41F, -20F, -17F);

		bayModel[179].addShapeBox(-8F, 1F, -4.5F, 9, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 1026
		bayModel[179].setRotationPoint(-41F, -20F, -9F);

		bayModel[180].addBox(-8F, -2F, -4.5F, 9, 3, 9, 0F); // Box 1027
		bayModel[180].setRotationPoint(-41F, -20F, -9F);

		bayModel[181].addShapeBox(-8F, -5F, -4.5F, 9, 3, 9, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1028
		bayModel[181].setRotationPoint(-41F, -20F, -9F);

		bayModel[182].addShapeBox(-15F, -5F, -4.5F, 7, 3, 9, 0F,0F, -0.5F, -3.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, -3.5F, 0F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F); // Box 1029
		bayModel[182].setRotationPoint(-41F, -20F, -9F);

		bayModel[183].addShapeBox(-15F, -2F, -4.5F, 7, 3, 9, 0F,0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F); // Box 1030
		bayModel[183].setRotationPoint(-41F, -20F, -9F);

		bayModel[184].addShapeBox(-15F, 1F, -4.5F, 7, 3, 9, 0F,0F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, -0.5F, -3.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, -3.5F); // Box 1031
		bayModel[184].setRotationPoint(-41F, -20F, -9F);

		bayModel[185].addShapeBox(-20F, 1F, -4.5F, 5, 3, 9, 0F,0F, 1F, -3F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 1F, -3F, 0F, -3F, -4F, 0F, -0.5F, -3.5F, 0F, -0.5F, -3.5F, 0F, -3F, -4F); // Box 1032
		bayModel[185].setRotationPoint(-41F, -20F, -9F);

		bayModel[186].addShapeBox(-20F, -2F, -4.5F, 5, 3, 9, 0F,0F, -1F, -3F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -1F, -3F); // Box 1033
		bayModel[186].setRotationPoint(-41F, -20F, -9F);

		bayModel[187].addShapeBox(-20F, -5F, -4.5F, 5, 3, 9, 0F,0F, -3F, -4F, 0F, -0.5F, -3.5F, 0F, -0.5F, -3.5F, 0F, -3F, -4F, 0F, 1F, -3F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 1F, -3F); // Box 1034
		bayModel[187].setRotationPoint(-41F, -20F, -9F);

		bayModel[188].addShapeBox(-21F, 0F, -1.5F, 1, 1, 3, 0F,0F, 0.4F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, -1.2F, 0F, -1.2F, -1.4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1.2F, -1.4F); // Box 1035
		bayModel[188].setRotationPoint(-41F, -20F, -9F);

		bayModel[189].addShapeBox(-21F, -1F, -1.5F, 1, 1, 3, 0F,0F, -0.4F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -1.2F, 0F, -0.4F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -1.2F); // Box 1036
		bayModel[189].setRotationPoint(-41F, -20F, -9F);

		bayModel[190].addShapeBox(-21F, -2F, -1.5F, 1, 1, 3, 0F,0F, -1.2F, -1.4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1.2F, -1.4F, 0F, 0.4F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, -1.2F); // Box 1037
		bayModel[190].setRotationPoint(-41F, -20F, -9F);

		bayModel[191].addShapeBox(-22F, -1F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1038
		bayModel[191].setRotationPoint(-41F, -20F, -9F);
	}

	private void initrightWingModel_1()
	{
		rightWingModel[0] = new ModelRendererTurbo(this, 305, 65, textureX, textureY); // Box 1063
		rightWingModel[1] = new ModelRendererTurbo(this, 1393, 630, textureX, textureY); // Box 1064
		rightWingModel[2] = new ModelRendererTurbo(this, 1033, 65, textureX, textureY); // Box 1065
		rightWingModel[3] = new ModelRendererTurbo(this, 1081, 65, textureX, textureY); // Box 1068
		rightWingModel[4] = new ModelRendererTurbo(this, 1177, 65, textureX, textureY); // Box 1069
		rightWingModel[5] = new ModelRendererTurbo(this, 1321, 65, textureX, textureY); // Box 1070
		rightWingModel[6] = new ModelRendererTurbo(this, 1425, 65, textureX, textureY); // Box 1072
		rightWingModel[7] = new ModelRendererTurbo(this, 1553, 65, textureX, textureY); // Box 1073
		rightWingModel[8] = new ModelRendererTurbo(this, 1161, 57, textureX, textureY); // Box 1074
		rightWingModel[9] = new ModelRendererTurbo(this, 369, 65, textureX, textureY); // Box 1075
		rightWingModel[10] = new ModelRendererTurbo(this, 825, 65, textureX, textureY); // Box 1076
		rightWingModel[11] = new ModelRendererTurbo(this, 393, 65, textureX, textureY); // Box 1077
		rightWingModel[12] = new ModelRendererTurbo(this, 1145, 65, textureX, textureY); // Box 1078
		rightWingModel[13] = new ModelRendererTurbo(this, 1033, 65, textureX, textureY); // Box 1079
		rightWingModel[14] = new ModelRendererTurbo(this, 1089, 65, textureX, textureY); // Box 1080
		rightWingModel[15] = new ModelRendererTurbo(this, 1177, 65, textureX, textureY); // Box 1081
		rightWingModel[16] = new ModelRendererTurbo(this, 2025, 1, textureX, textureY); // Box 1082
		rightWingModel[17] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 1083
		rightWingModel[18] = new ModelRendererTurbo(this, 162, 90, textureX, textureY); // Box 1084
		rightWingModel[19] = new ModelRendererTurbo(this, 124, 86, textureX, textureY); // Box 1085
		rightWingModel[20] = new ModelRendererTurbo(this, 697, 1, textureX, textureY); // Box 1086
		rightWingModel[21] = new ModelRendererTurbo(this, 1553, 1, textureX, textureY); // Box 1087
		rightWingModel[22] = new ModelRendererTurbo(this, 1673, 1, textureX, textureY); // Box 1088
		rightWingModel[23] = new ModelRendererTurbo(this, 697, 9, textureX, textureY); // Box 1089
		rightWingModel[24] = new ModelRendererTurbo(this, 1673, 9, textureX, textureY); // Box 1090
		rightWingModel[25] = new ModelRendererTurbo(this, 1601, 65, textureX, textureY); // Box 1091
		rightWingModel[26] = new ModelRendererTurbo(this, 156, 457, textureX, textureY); // Box 1092
		rightWingModel[27] = new ModelRendererTurbo(this, 401, 73, textureX, textureY); // Box 1093
		rightWingModel[28] = new ModelRendererTurbo(this, 609, 73, textureX, textureY); // Box 1094
		rightWingModel[29] = new ModelRendererTurbo(this, 2033, 9, textureX, textureY); // Box 1503
		rightWingModel[30] = new ModelRendererTurbo(this, 2041, 9, textureX, textureY); // Box 1504
		rightWingModel[31] = new ModelRendererTurbo(this, 1529, 49, textureX, textureY); // Box 1505
		rightWingModel[32] = new ModelRendererTurbo(this, 1289, 65, textureX, textureY); // Box 1506
		rightWingModel[33] = new ModelRendererTurbo(this, 1416, 560, textureX, textureY); // Box 110
		rightWingModel[34] = new ModelRendererTurbo(this, 1889, 73, textureX, textureY); // Box 111
		rightWingModel[35] = new ModelRendererTurbo(this, 1721, 73, textureX, textureY); // Box 112
		rightWingModel[36] = new ModelRendererTurbo(this, 323, 463, textureX, textureY); // Box 113
		rightWingModel[37] = new ModelRendererTurbo(this, 825, 73, textureX, textureY); // Box 114
		rightWingModel[38] = new ModelRendererTurbo(this, 185, 81, textureX, textureY); // Box 115
		rightWingModel[39] = new ModelRendererTurbo(this, 1118, 452, textureX, textureY); // Box 116
		rightWingModel[40] = new ModelRendererTurbo(this, 1793, 89, textureX, textureY); // Box 117
		rightWingModel[41] = new ModelRendererTurbo(this, 1401, 97, textureX, textureY); // Box 118
		rightWingModel[42] = new ModelRendererTurbo(this, 1505, 97, textureX, textureY); // Box 119
		rightWingModel[43] = new ModelRendererTurbo(this, 563, 665, textureX, textureY); // Box 120
		rightWingModel[44] = new ModelRendererTurbo(this, 609, 105, textureX, textureY); // Box 121
		rightWingModel[45] = new ModelRendererTurbo(this, 801, 105, textureX, textureY); // Box 122
		rightWingModel[46] = new ModelRendererTurbo(this, 1297, 65, textureX, textureY); // Box 123
		rightWingModel[47] = new ModelRendererTurbo(this, 1393, 65, textureX, textureY); // Box 124
		rightWingModel[48] = new ModelRendererTurbo(this, 1537, 65, textureX, textureY); // Box 125
		rightWingModel[49] = new ModelRendererTurbo(this, 1321, 65, textureX, textureY); // Box 126
		rightWingModel[50] = new ModelRendererTurbo(this, 1689, 65, textureX, textureY); // Box 127
		rightWingModel[51] = new ModelRendererTurbo(this, 1697, 65, textureX, textureY); // Box 128
		rightWingModel[52] = new ModelRendererTurbo(this, 1705, 65, textureX, textureY); // Box 129
		rightWingModel[53] = new ModelRendererTurbo(this, 1713, 65, textureX, textureY); // Box 130
		rightWingModel[54] = new ModelRendererTurbo(this, 1425, 65, textureX, textureY); // Box 131
		rightWingModel[55] = new ModelRendererTurbo(this, 377, 73, textureX, textureY); // Box 132
		rightWingModel[56] = new ModelRendererTurbo(this, 489, 73, textureX, textureY); // Box 133
		rightWingModel[57] = new ModelRendererTurbo(this, 1609, 65, textureX, textureY); // Box 134
		rightWingModel[58] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 135
		rightWingModel[59] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 136
		rightWingModel[60] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 137
		rightWingModel[61] = new ModelRendererTurbo(this, 1089, 17, textureX, textureY); // Box 138
		rightWingModel[62] = new ModelRendererTurbo(this, 1049, 33, textureX, textureY); // Box 139
		rightWingModel[63] = new ModelRendererTurbo(this, 905, 25, textureX, textureY); // Box 140
		rightWingModel[64] = new ModelRendererTurbo(this, 1905, 1, textureX, textureY); // Box 141
		rightWingModel[65] = new ModelRendererTurbo(this, 1193, 25, textureX, textureY); // Box 142
		rightWingModel[66] = new ModelRendererTurbo(this, 135, 95, textureX, textureY); // Box 143
		rightWingModel[67] = new ModelRendererTurbo(this, 729, 121, textureX, textureY); // Box 206
		rightWingModel[68] = new ModelRendererTurbo(this, 1897, 121, textureX, textureY); // Box 207
		rightWingModel[69] = new ModelRendererTurbo(this, 1953, 185, textureX, textureY); // Box 280
		rightWingModel[70] = new ModelRendererTurbo(this, 1632, 663, textureX, textureY); // Box 281
		rightWingModel[71] = new ModelRendererTurbo(this, 1705, 177, textureX, textureY); // Box 282
		rightWingModel[72] = new ModelRendererTurbo(this, 301, 624, textureX, textureY); // Box 283
		rightWingModel[73] = new ModelRendererTurbo(this, 1065, 209, textureX, textureY); // Box 285
		rightWingModel[74] = new ModelRendererTurbo(this, 1825, 233, textureX, textureY); // Box 286
		rightWingModel[75] = new ModelRendererTurbo(this, 1361, 209, textureX, textureY); // Box 287
		rightWingModel[76] = new ModelRendererTurbo(this, 1122, 559, textureX, textureY); // Box 288
		rightWingModel[77] = new ModelRendererTurbo(this, 841, 217, textureX, textureY); // Box 289
		rightWingModel[78] = new ModelRendererTurbo(this, 1305, 73, textureX, textureY); // Box 290
		rightWingModel[79] = new ModelRendererTurbo(this, 33, 132, textureX, textureY); // Box 291
		rightWingModel[80] = new ModelRendererTurbo(this, 857, 105, textureX, textureY); // Box 292
		rightWingModel[81] = new ModelRendererTurbo(this, 65, 113, textureX, textureY); // Box 293
		rightWingModel[82] = new ModelRendererTurbo(this, 1289, 113, textureX, textureY); // Box 294
		rightWingModel[83] = new ModelRendererTurbo(this, 729, 121, textureX, textureY); // Box 295
		rightWingModel[84] = new ModelRendererTurbo(this, 577, 129, textureX, textureY); // Box 296
		rightWingModel[85] = new ModelRendererTurbo(this, 1305, 121, textureX, textureY); // Box 297
		rightWingModel[86] = new ModelRendererTurbo(this, 1001, 49, textureX, textureY); // Box 298
		rightWingModel[87] = new ModelRendererTurbo(this, 1553, 65, textureX, textureY); // Box 299
		rightWingModel[88] = new ModelRendererTurbo(this, 1065, 49, textureX, textureY); // Box 300
		rightWingModel[89] = new ModelRendererTurbo(this, 140, 83, textureX, textureY); // Box 301
		rightWingModel[90] = new ModelRendererTurbo(this, 953, 49, textureX, textureY); // Box 302
		rightWingModel[91] = new ModelRendererTurbo(this, 753, 57, textureX, textureY); // Box 303
		rightWingModel[92] = new ModelRendererTurbo(this, 1521, 41, textureX, textureY); // Box 304
		rightWingModel[93] = new ModelRendererTurbo(this, 1161, 49, textureX, textureY); // Box 305
		rightWingModel[94] = new ModelRendererTurbo(this, 825, 57, textureX, textureY); // Box 306
		rightWingModel[95] = new ModelRendererTurbo(this, 1249, 241, textureX, textureY); // Box 307
		rightWingModel[96] = new ModelRendererTurbo(this, 1937, 233, textureX, textureY); // Box 308
		rightWingModel[97] = new ModelRendererTurbo(this, 902, 569, textureX, textureY); // Box 309
		rightWingModel[98] = new ModelRendererTurbo(this, 200, 598, textureX, textureY); // Box 310
		rightWingModel[99] = new ModelRendererTurbo(this, 2041, 73, textureX, textureY); // Box 311
		rightWingModel[100] = new ModelRendererTurbo(this, 127, 52, textureX, textureY); // Box 312
		rightWingModel[101] = new ModelRendererTurbo(this, 673, 105, textureX, textureY); // Box 313
		rightWingModel[102] = new ModelRendererTurbo(this, 2033, 105, textureX, textureY); // Box 314
		rightWingModel[103] = new ModelRendererTurbo(this, 401, 249, textureX, textureY); // Box 315
		rightWingModel[104] = new ModelRendererTurbo(this, 876, 511, textureX, textureY); // Box 317
		rightWingModel[105] = new ModelRendererTurbo(this, 1489, 249, textureX, textureY); // Box 318
		rightWingModel[106] = new ModelRendererTurbo(this, 1633, 249, textureX, textureY); // Box 319
		rightWingModel[107] = new ModelRendererTurbo(this, 1627, 558, textureX, textureY); // Box 320
		rightWingModel[108] = new ModelRendererTurbo(this, 609, 249, textureX, textureY); // Box 321
		rightWingModel[109] = new ModelRendererTurbo(this, 1345, 265, textureX, textureY); // Box 322
		rightWingModel[110] = new ModelRendererTurbo(this, 39, 594, textureX, textureY); // Box 323
		rightWingModel[111] = new ModelRendererTurbo(this, 450, 786, textureX, textureY); // Box 324
		rightWingModel[112] = new ModelRendererTurbo(this, 1945, 265, textureX, textureY); // Box 325
		rightWingModel[113] = new ModelRendererTurbo(this, 1065, 257, textureX, textureY); // Box 326
		rightWingModel[114] = new ModelRendererTurbo(this, 1825, 281, textureX, textureY); // Box 327
		rightWingModel[115] = new ModelRendererTurbo(this, 1057, 289, textureX, textureY); // Box 328
		rightWingModel[116] = new ModelRendererTurbo(this, 204, 225, textureX, textureY); // Box 329
		rightWingModel[117] = new ModelRendererTurbo(this, 193, 145, textureX, textureY); // Box 330
		rightWingModel[118] = new ModelRendererTurbo(this, 961, 129, textureX, textureY); // Box 331
		rightWingModel[119] = new ModelRendererTurbo(this, 673, 153, textureX, textureY); // Box 332
		rightWingModel[120] = new ModelRendererTurbo(this, 297, 145, textureX, textureY); // Box 333
		rightWingModel[121] = new ModelRendererTurbo(this, 2041, 105, textureX, textureY); // Box 334
		rightWingModel[122] = new ModelRendererTurbo(this, 457, 121, textureX, textureY); // Box 335
		rightWingModel[123] = new ModelRendererTurbo(this, 465, 121, textureX, textureY); // Box 336
		rightWingModel[124] = new ModelRendererTurbo(this, 1449, 129, textureX, textureY); // Box 337
		rightWingModel[125] = new ModelRendererTurbo(this, 369, 145, textureX, textureY); // Box 338
		rightWingModel[126] = new ModelRendererTurbo(this, 185, 169, textureX, textureY); // Box 339
		rightWingModel[127] = new ModelRendererTurbo(this, 73, 177, textureX, textureY); // Box 340
		rightWingModel[128] = new ModelRendererTurbo(this, 1489, 145, textureX, textureY); // Box 341
		rightWingModel[129] = new ModelRendererTurbo(this, 1913, 57, textureX, textureY); // Box 342
		rightWingModel[130] = new ModelRendererTurbo(this, 1985, 57, textureX, textureY); // Box 343
		rightWingModel[131] = new ModelRendererTurbo(this, 137, 65, textureX, textureY); // Box 344
		rightWingModel[132] = new ModelRendererTurbo(this, 505, 73, textureX, textureY); // Box 345
		rightWingModel[133] = new ModelRendererTurbo(this, 185, 89, textureX, textureY); // Box 346
		rightWingModel[134] = new ModelRendererTurbo(this, 1857, 81, textureX, textureY); // Box 347
		rightWingModel[135] = new ModelRendererTurbo(this, 633, 57, textureX, textureY); // Box 348
		rightWingModel[136] = new ModelRendererTurbo(this, 1193, 65, textureX, textureY); // Box 349
		rightWingModel[137] = new ModelRendererTurbo(this, 393, 65, textureX, textureY); // Box 350
		rightWingModel[138] = new ModelRendererTurbo(this, 1921, 297, textureX, textureY); // Box 414
		rightWingModel[139] = new ModelRendererTurbo(this, 1337, 297, textureX, textureY); // Box 415
		rightWingModel[140] = new ModelRendererTurbo(this, 293, 570, textureX, textureY); // Box 563
		rightWingModel[141] = new ModelRendererTurbo(this, 145, 369, textureX, textureY); // Box 564
		rightWingModel[142] = new ModelRendererTurbo(this, 1249, 241, textureX, textureY); // Box 646
		rightWingModel[143] = new ModelRendererTurbo(this, 1937, 241, textureX, textureY); // Box 647
		rightWingModel[144] = new ModelRendererTurbo(this, 1265, 241, textureX, textureY); // Box 648
		rightWingModel[145] = new ModelRendererTurbo(this, 1, 249, textureX, textureY); // Box 649
		rightWingModel[146] = new ModelRendererTurbo(this, 1953, 353, textureX, textureY); // Box 650
		rightWingModel[147] = new ModelRendererTurbo(this, 313, 369, textureX, textureY); // Box 651
		rightWingModel[148] = new ModelRendererTurbo(this, 401, 369, textureX, textureY); // Box 652
		rightWingModel[149] = new ModelRendererTurbo(this, 297, 249, textureX, textureY); // Box 653
		rightWingModel[150] = new ModelRendererTurbo(this, 505, 249, textureX, textureY); // Box 654
		rightWingModel[151] = new ModelRendererTurbo(this, 1489, 249, textureX, textureY); // Box 655
		rightWingModel[152] = new ModelRendererTurbo(this, 1705, 249, textureX, textureY); // Box 656
		rightWingModel[153] = new ModelRendererTurbo(this, 929, 369, textureX, textureY); // Box 657
		rightWingModel[154] = new ModelRendererTurbo(this, 1329, 369, textureX, textureY); // Box 658
		rightWingModel[155] = new ModelRendererTurbo(this, 1505, 377, textureX, textureY); // Box 659

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 15, 12, 32, 0F,0F, -1F, -5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -1F, -5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 1063
		rightWingModel[0].setRotationPoint(-94F, -73F, 62F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 37, 12, 32, 0F,0F, 0F, -4F, 0F, -3F, -6F, 0F, -3F, -6F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 1064
		rightWingModel[1].setRotationPoint(-52F, -73F, 62F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 15, 5, 24, 0F,0F, -1F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, -1F, -12F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F); // Box 1065
		rightWingModel[2].setRotationPoint(-94F, -77F, 66F);

		rightWingModel[3].addShapeBox(0F, 0F, 0F, 15, 12, 32, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -1F, -5F); // Box 1068
		rightWingModel[3].setRotationPoint(-94F, -61F, 62F);

		rightWingModel[4].addShapeBox(0F, 0F, 0F, 37, 12, 32, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -3F, -6F, 0F, -3F, -6F, 0F, 0F, -4F); // Box 1069
		rightWingModel[4].setRotationPoint(-52F, -61F, 62F);

		rightWingModel[5].addShapeBox(0F, 0F, 0F, 22, 9, 26, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -6F, -4F, 0F, -6F, -4F, 0F, 0F, -3F); // Box 1070
		rightWingModel[5].setRotationPoint(-15F, -61F, 65F);

		rightWingModel[6].addShapeBox(0F, 0F, 0F, 37, 7, 24, 0F,0F, -3F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -3F, 0F, 0F, 0F, -12F, 0F, -4F, -12F, 0F, -4F, -12F, 0F, 0F, -12F); // Box 1072
		rightWingModel[6].setRotationPoint(-52F, -52F, 66F);

		rightWingModel[7].addShapeBox(0F, 0F, 0F, 15, 5, 24, 0F,0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -1F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, -1F, -12F); // Box 1073
		rightWingModel[7].setRotationPoint(-94F, -50F, 66F);

		rightWingModel[8].addShapeBox(0F, 0F, 0F, 2, 6, 11, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -5F, -1F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 1F, -1F); // Box 1074
		rightWingModel[8].setRotationPoint(-96F, -76F, 78F);

		rightWingModel[9].addShapeBox(0F, 0F, 0F, 2, 11, 6, 0F,0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, -5F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 1075
		rightWingModel[9].setRotationPoint(-96F, -72F, 87F);

		rightWingModel[10].addShapeBox(0F, 0F, 0F, 2, 11, 6, 0F,0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, -5F); // Box 1076
		rightWingModel[10].setRotationPoint(-96F, -61F, 87F);

		rightWingModel[11].addShapeBox(0F, 0F, 0F, 2, 6, 11, 0F,0F, -3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -5F, -1F); // Box 1077
		rightWingModel[11].setRotationPoint(-96F, -52F, 78F);

		rightWingModel[12].addShapeBox(0F, 0F, 0F, 2, 6, 11, 0F,0F, -5F, -1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -3F, 0F); // Box 1078
		rightWingModel[12].setRotationPoint(-96F, -76F, 67F);

		rightWingModel[13].addShapeBox(0F, 0F, 0F, 2, 11, 6, 0F,0F, -1F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -3F); // Box 1079
		rightWingModel[13].setRotationPoint(-96F, -72F, 63F);

		rightWingModel[14].addShapeBox(0F, 0F, 0F, 2, 11, 6, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, -1F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -1F, 1F); // Box 1080
		rightWingModel[14].setRotationPoint(-96F, -61F, 63F);

		rightWingModel[15].addShapeBox(0F, 0F, 0F, 2, 6, 11, 0F,0F, 1F, -1F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, -5F, -1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 1081
		rightWingModel[15].setRotationPoint(-96F, -52F, 67F);

		rightWingModel[16].addShapeBox(0F, 0F, 0F, 7, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 1082
		rightWingModel[16].setRotationPoint(-106F, -63.5F, 79.5F);

		rightWingModel[17].addBox(0F, 0F, 0F, 7, 5, 3, 0F); // Box 1083
		rightWingModel[17].setRotationPoint(-106F, -63.5F, 76.5F);

		rightWingModel[18].addShapeBox(0F, 0F, 0F, 7, 5, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1084
		rightWingModel[18].setRotationPoint(-106F, -63.5F, 75.5F);

		rightWingModel[19].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, -0.9999F, 0F, 0F, 0F, 0F, 0F, -0.9999F, 0F, 0F, -0.9999F, -0.9999F, 0F, -0.9999F, 0F, 0F, 0F, 0F, 0F, -0.9999F, 0F, 0F, -0.9999F, -0.9999F); // Box 1085
		rightWingModel[19].setRotationPoint(-109F, -63.5F, 79.5F);

		rightWingModel[20].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, -0.9999F, -0.9999F, 0F, -0.9999F, 0F, 0F, 0F, 0F, 0F, -0.9999F, 0F, 0F, -0.9999F, -0.9999F, 0F, -0.9999F, 0F, 0F, 0F, 0F, 0F, -0.9999F, 0F); // Box 1086
		rightWingModel[20].setRotationPoint(-109F, -63.5F, 75.5F);

		rightWingModel[21].addShapeBox(0F, 0F, 0F, 3, 5, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 1087
		rightWingModel[21].setRotationPoint(-109F, -63.5F, 76.5F);

		rightWingModel[22].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1088
		rightWingModel[22].setRotationPoint(-100F, -62.5F, 77.5F);

		rightWingModel[23].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 1089
		rightWingModel[23].setRotationPoint(-100F, -62.5F, 78.5F);

		rightWingModel[24].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1090
		rightWingModel[24].setRotationPoint(-100F, -62.5F, 76.5F);

		rightWingModel[25].addShapeBox(0F, 0F, 0F, 27, 12, 32, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1091
		rightWingModel[25].setRotationPoint(-79F, -73F, 62F);

		rightWingModel[26].addShapeBox(0F, 0F, 0F, 27, 4, 24, 0F,0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1092
		rightWingModel[26].setRotationPoint(-79F, -77F, 66F);

		rightWingModel[27].addShapeBox(0F, 0F, 0F, 27, 12, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 1093
		rightWingModel[27].setRotationPoint(-79F, -61F, 62F);

		rightWingModel[28].addShapeBox(0F, 0F, 0F, 27, 4, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F); // Box 1094
		rightWingModel[28].setRotationPoint(-79F, -49F, 66F);

		rightWingModel[29].addShapeBox(0F, -12.5F, -1F, 1, 25, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1503
		rightWingModel[29].setRotationPoint(-95F, -61F, 78F);

		rightWingModel[30].addShapeBox(0F, -12.5F, -1F, 1, 25, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1504
		rightWingModel[30].setRotationPoint(-95F, -61F, 78F);
		rightWingModel[30].rotateAngleX = -0.78539816F;

		rightWingModel[31].addShapeBox(0F, -12.5F, -1F, 1, 25, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1505
		rightWingModel[31].setRotationPoint(-95F, -61F, 78F);
		rightWingModel[31].rotateAngleX = 1.57079633F;

		rightWingModel[32].addShapeBox(0F, -12.5F, -1F, 1, 25, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1506
		rightWingModel[32].setRotationPoint(-95F, -61F, 78F);
		rightWingModel[32].rotateAngleX = 0.78539816F;

		rightWingModel[33].addShapeBox(0F, 0F, 0F, 37, 12, 32, 0F,0F, 0F, -4F, 0F, -3.5F, -6F, 0F, -3F, -6F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 110
		rightWingModel[33].setRotationPoint(-45F, -76.5F, 156.5F);

		rightWingModel[34].addShapeBox(0F, 0F, 0F, 37, 12, 32, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -3F, -6F, 0F, -3F, -6F, 0F, 0F, -4F); // Box 111
		rightWingModel[34].setRotationPoint(-45F, -64.5F, 156.5F);

		rightWingModel[35].addShapeBox(0F, 0F, 0F, 22, 9, 26, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -6F, -4F, 0F, -6F, -4F, 0F, 0F, -3F); // Box 112
		rightWingModel[35].setRotationPoint(-8F, -64.5F, 159.5F);

		rightWingModel[36].addShapeBox(0F, 0F, 0F, 37, 7, 24, 0F,0F, -3F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -3F, 0F, 0F, 0F, -12F, 0F, -4F, -12F, 0F, -4F, -12F, 0F, 0F, -12F); // Box 113
		rightWingModel[36].setRotationPoint(-45F, -55.5F, 160.5F);

		rightWingModel[37].addShapeBox(0F, 0F, 0F, 22, 9, 20, 0F,0F, -5.9999F, 0F, 0F, 0F, -0.9999F, 0F, 0F, -0.9999F, 0F, -5.9999F, 0F, 0F, 0F, -9.9999F, 0F, -5.9999F, -5.9999F, 0F, -5.9999F, -4.9999F, 0F, 0F, -9.9999F); // Box 114
		rightWingModel[37].setRotationPoint(-8F, -61.5F, 162.5F);

		rightWingModel[38].addShapeBox(0F, 0F, 0F, 27, 4, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F); // Box 115
		rightWingModel[38].setRotationPoint(-72F, -52.5F, 160.5F);

		rightWingModel[39].addShapeBox(0F, 0F, 0F, 27, 12, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 116
		rightWingModel[39].setRotationPoint(-72F, -64.5F, 156.5F);

		rightWingModel[40].addShapeBox(0F, 0F, 0F, 27, 12, 32, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		rightWingModel[40].setRotationPoint(-72F, -76.5F, 156.5F);

		rightWingModel[41].addShapeBox(0F, 0F, 0F, 27, 4, 24, 0F,0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		rightWingModel[41].setRotationPoint(-72F, -80.5F, 160.5F);

		rightWingModel[42].addShapeBox(0F, 0F, 0F, 15, 5, 24, 0F,0F, -1F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, -1F, -12F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F); // Box 119
		rightWingModel[42].setRotationPoint(-87F, -80.5F, 160.5F);

		rightWingModel[43].addShapeBox(0F, 0F, 0F, 15, 12, 32, 0F,0F, -1F, -5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -1F, -5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 120
		rightWingModel[43].setRotationPoint(-87F, -76.5F, 156.5F);

		rightWingModel[44].addShapeBox(0F, 0F, 0F, 15, 12, 32, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -1F, -5F); // Box 121
		rightWingModel[44].setRotationPoint(-87F, -64.5F, 156.5F);

		rightWingModel[45].addShapeBox(0F, 0F, 0F, 15, 5, 24, 0F,0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -1F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, -1F, -12F); // Box 122
		rightWingModel[45].setRotationPoint(-87F, -53.5F, 160.5F);

		rightWingModel[46].addShapeBox(0F, 0F, 0F, 2, 11, 6, 0F,0F, -1F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -3F); // Box 123
		rightWingModel[46].setRotationPoint(-89F, -75.5F, 157.5F);

		rightWingModel[47].addShapeBox(0F, 0F, 0F, 2, 6, 11, 0F,0F, -5F, -1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -3F, 0F); // Box 124
		rightWingModel[47].setRotationPoint(-89F, -79.5F, 161.5F);

		rightWingModel[48].addShapeBox(0F, 0F, 0F, 2, 6, 11, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -5F, -1F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 1F, -1F); // Box 125
		rightWingModel[48].setRotationPoint(-89F, -79.5F, 172.5F);

		rightWingModel[49].addShapeBox(0F, 0F, 0F, 2, 11, 6, 0F,0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, -5F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 126
		rightWingModel[49].setRotationPoint(-89F, -75.5F, 181.5F);

		rightWingModel[50].addShapeBox(0F, -12.5F, -1F, 1, 25, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		rightWingModel[50].setRotationPoint(-88F, -64.5F, 172.5F);
		rightWingModel[50].rotateAngleX = -0.78539816F;

		rightWingModel[51].addShapeBox(0F, -12.5F, -1F, 1, 25, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		rightWingModel[51].setRotationPoint(-88F, -64.5F, 172.5F);

		rightWingModel[52].addShapeBox(0F, -12.5F, -1F, 1, 25, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		rightWingModel[52].setRotationPoint(-88F, -64.5F, 172.5F);
		rightWingModel[52].rotateAngleX = 0.78539816F;

		rightWingModel[53].addShapeBox(0F, -12.5F, -1F, 1, 25, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		rightWingModel[53].setRotationPoint(-88F, -64.5F, 172.5F);
		rightWingModel[53].rotateAngleX = 1.57079633F;

		rightWingModel[54].addShapeBox(0F, 0F, 0F, 2, 11, 6, 0F,0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, -5F); // Box 131
		rightWingModel[54].setRotationPoint(-89F, -64.5F, 181.5F);

		rightWingModel[55].addShapeBox(0F, 0F, 0F, 2, 6, 11, 0F,0F, -3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -5F, -1F); // Box 132
		rightWingModel[55].setRotationPoint(-89F, -55.5F, 172.5F);

		rightWingModel[56].addShapeBox(0F, 0F, 0F, 2, 6, 11, 0F,0F, 1F, -1F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, -5F, -1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 133
		rightWingModel[56].setRotationPoint(-89F, -55.5F, 161.5F);

		rightWingModel[57].addShapeBox(0F, 0F, 0F, 2, 11, 6, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, -1F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -1F, 1F); // Box 134
		rightWingModel[57].setRotationPoint(-89F, -64.5F, 157.5F);

		rightWingModel[58].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 135
		rightWingModel[58].setRotationPoint(-93F, -66F, 173F);

		rightWingModel[59].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		rightWingModel[59].setRotationPoint(-93F, -66F, 172F);

		rightWingModel[60].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
		rightWingModel[60].setRotationPoint(-93F, -66F, 171F);

		rightWingModel[61].addShapeBox(0F, 0F, 0F, 7, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 138
		rightWingModel[61].setRotationPoint(-99F, -67F, 174F);

		rightWingModel[62].addBox(0F, 0F, 0F, 7, 5, 3, 0F); // Box 139
		rightWingModel[62].setRotationPoint(-99F, -67F, 171F);

		rightWingModel[63].addShapeBox(0F, 0F, 0F, 7, 5, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		rightWingModel[63].setRotationPoint(-99F, -67F, 170F);

		rightWingModel[64].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, -0.9999F, -0.9999F, 0F, -0.9999F, 0F, 0F, 0F, 0F, 0F, -0.9999F, 0F, 0F, -0.9999F, -0.9999F, 0F, -0.9999F, 0F, 0F, 0F, 0F, 0F, -0.9999F, 0F); // Box 141
		rightWingModel[64].setRotationPoint(-102F, -67F, 170F);

		rightWingModel[65].addShapeBox(0F, 0F, 0F, 3, 5, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 142
		rightWingModel[65].setRotationPoint(-102F, -67F, 171F);

		rightWingModel[66].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, -0.9999F, 0F, 0F, 0F, 0F, 0F, -0.9999F, 0F, 0F, -0.9999F, -0.9999F, 0F, -0.9999F, 0F, 0F, 0F, 0F, 0F, -0.9999F, 0F, 0F, -0.9999F, -0.9999F); // Box 143
		rightWingModel[66].setRotationPoint(-102F, -67F, 174F);

		rightWingModel[67].addShapeBox(0F, 0F, 0F, 22, 9, 26, 0F,0F, -0.75F, -3F, 0F, -6.5F, -4F, 0F, -6F, -4F, 0F, -0.25F, -3F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 206
		rightWingModel[67].setRotationPoint(-8F, -73.5F, 159.5F);

		rightWingModel[68].addShapeBox(0F, 0F, 0F, 22, 9, 20, 0F,0F, -5.9999F, 0F, 0F, 0F, -0.9999F, 0F, 0F, -0.9999F, 0F, -5.9999F, 0F, 0F, 0F, -9.9999F, 0F, -5.9999F, -5.9999F, 0F, -5.9999F, -4.9999F, 0F, 0F, -9.9999F); // Box 207
		rightWingModel[68].setRotationPoint(-15F, -58F, 68F);

		rightWingModel[69].addShapeBox(0F, 0F, 0F, 15, 12, 32, 0F,0F, -1F, -5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -1F, -5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 280
		rightWingModel[69].setRotationPoint(-94F, -73F, -94F);

		rightWingModel[70].addShapeBox(0F, 0F, 0F, 37, 12, 32, 0F,0F, 0F, -4F, 0F, -3F, -6F, 0F, -3F, -6F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 281
		rightWingModel[70].setRotationPoint(-52F, -73F, -94F);

		rightWingModel[71].addShapeBox(0F, 0F, 0F, 15, 5, 24, 0F,0F, -1F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, -1F, -12F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F); // Box 282
		rightWingModel[71].setRotationPoint(-94F, -77F, -90F);

		rightWingModel[72].addShapeBox(0F, 0F, 0F, 37, 7, 24, 0F,0F, 0F, -12F, 0F, -6F, -12F, 0F, -5.75F, -12F, 0F, 0F, -12F, 0F, -3F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -3F, 0F); // Box 283
		rightWingModel[72].setRotationPoint(-52F, -77F, -90F);

		rightWingModel[73].addShapeBox(0F, 0F, 0F, 15, 12, 32, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -1F, -5F); // Box 285
		rightWingModel[73].setRotationPoint(-94F, -61F, -94F);

		rightWingModel[74].addShapeBox(0F, 0F, 0F, 37, 12, 32, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -3F, -6F, 0F, -3F, -6F, 0F, 0F, -4F); // Box 286
		rightWingModel[74].setRotationPoint(-52F, -61F, -94F);

		rightWingModel[75].addShapeBox(0F, 0F, 0F, 22, 9, 26, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -6F, -4F, 0F, -6F, -4F, 0F, 0F, -3F); // Box 287
		rightWingModel[75].setRotationPoint(-15F, -61F, -91F);

		rightWingModel[76].addShapeBox(0F, 0F, 0F, 37, 7, 24, 0F,0F, -3F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -3F, 0F, 0F, 0F, -12F, 0F, -4F, -12F, 0F, -4F, -12F, 0F, 0F, -12F); // Box 288
		rightWingModel[76].setRotationPoint(-52F, -52F, -90F);

		rightWingModel[77].addShapeBox(0F, 0F, 0F, 15, 5, 24, 0F,0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -1F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, -1F, -12F); // Box 289
		rightWingModel[77].setRotationPoint(-94F, -50F, -90F);

		rightWingModel[78].addShapeBox(0F, 0F, 0F, 2, 6, 11, 0F,0F, -5F, -1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -3F, 0F); // Box 290
		rightWingModel[78].setRotationPoint(-96F, -76F, -89F);

		rightWingModel[79].addShapeBox(0F, 0F, 0F, 2, 11, 6, 0F,0F, -1F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -3F); // Box 291
		rightWingModel[79].setRotationPoint(-96F, -72F, -93F);

		rightWingModel[80].addShapeBox(0F, 0F, 0F, 2, 11, 6, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, -1F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -1F, 1F); // Box 292
		rightWingModel[80].setRotationPoint(-96F, -61F, -93F);

		rightWingModel[81].addShapeBox(0F, 0F, 0F, 2, 6, 11, 0F,0F, 1F, -1F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, -5F, -1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 293
		rightWingModel[81].setRotationPoint(-96F, -52F, -89F);

		rightWingModel[82].addShapeBox(0F, 0F, 0F, 2, 6, 11, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -5F, -1F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 1F, -1F); // Box 294
		rightWingModel[82].setRotationPoint(-96F, -76F, -78F);

		rightWingModel[83].addShapeBox(0F, 0F, 0F, 2, 11, 6, 0F,0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, -5F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 295
		rightWingModel[83].setRotationPoint(-96F, -72F, -69F);

		rightWingModel[84].addShapeBox(0F, 0F, 0F, 2, 11, 6, 0F,0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, -5F); // Box 296
		rightWingModel[84].setRotationPoint(-96F, -61F, -69F);

		rightWingModel[85].addShapeBox(0F, 0F, 0F, 2, 6, 11, 0F,0F, -3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -5F, -1F); // Box 297
		rightWingModel[85].setRotationPoint(-96F, -52F, -78F);

		rightWingModel[86].addShapeBox(0F, 0F, 0F, 7, 5, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
		rightWingModel[86].setRotationPoint(-106F, -63.5F, -80.5F);

		rightWingModel[87].addBox(0F, 0F, 0F, 7, 5, 3, 0F); // Box 299
		rightWingModel[87].setRotationPoint(-106F, -63.5F, -79.5F);

		rightWingModel[88].addShapeBox(0F, 0F, 0F, 7, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 300
		rightWingModel[88].setRotationPoint(-106F, -63.5F, -76.5F);

		rightWingModel[89].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, -0.9999F, -0.9999F, 0F, -0.9999F, 0F, 0F, 0F, 0F, 0F, -0.9999F, 0F, 0F, -0.9999F, -0.9999F, 0F, -0.9999F, 0F, 0F, 0F, 0F, 0F, -0.9999F, 0F); // Box 301
		rightWingModel[89].setRotationPoint(-109F, -63.5F, -80.5F);

		rightWingModel[90].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, -0.9999F, 0F, 0F, 0F, 0F, 0F, -0.9999F, 0F, 0F, -0.9999F, -0.9999F, 0F, -0.9999F, 0F, 0F, 0F, 0F, 0F, -0.9999F, 0F, 0F, -0.9999F, -0.9999F); // Box 302
		rightWingModel[90].setRotationPoint(-109F, -63.5F, -76.5F);

		rightWingModel[91].addShapeBox(0F, 0F, 0F, 3, 5, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 303
		rightWingModel[91].setRotationPoint(-109F, -63.5F, -79.5F);

		rightWingModel[92].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 304
		rightWingModel[92].setRotationPoint(-100F, -62.5F, -78.5F);

		rightWingModel[93].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305
		rightWingModel[93].setRotationPoint(-100F, -62.5F, -79.5F);

		rightWingModel[94].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 306
		rightWingModel[94].setRotationPoint(-100F, -62.5F, -77.5F);

		rightWingModel[95].addShapeBox(0F, 0F, 0F, 27, 12, 32, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 307
		rightWingModel[95].setRotationPoint(-79F, -73F, -94F);

		rightWingModel[96].addShapeBox(0F, 0F, 0F, 27, 4, 24, 0F,0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 308
		rightWingModel[96].setRotationPoint(-79F, -77F, -90F);

		rightWingModel[97].addShapeBox(0F, 0F, 0F, 27, 12, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 309
		rightWingModel[97].setRotationPoint(-79F, -61F, -94F);

		rightWingModel[98].addShapeBox(0F, 0F, 0F, 27, 4, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F); // Box 310
		rightWingModel[98].setRotationPoint(-79F, -49F, -90F);

		rightWingModel[99].addShapeBox(0F, -12.5F, -1F, 1, 25, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 311
		rightWingModel[99].setRotationPoint(-95F, -61F, -78F);

		rightWingModel[100].addShapeBox(0F, -12.5F, -1F, 1, 25, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 312
		rightWingModel[100].setRotationPoint(-95F, -61F, -78F);
		rightWingModel[100].rotateAngleX = -0.78539816F;

		rightWingModel[101].addShapeBox(0F, -12.5F, -1F, 1, 25, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 313
		rightWingModel[101].setRotationPoint(-95F, -61F, -78F);
		rightWingModel[101].rotateAngleX = 1.57079633F;

		rightWingModel[102].addShapeBox(0F, -12.5F, -1F, 1, 25, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 314
		rightWingModel[102].setRotationPoint(-95F, -61F, -78F);
		rightWingModel[102].rotateAngleX = 0.78539816F;

		rightWingModel[103].addShapeBox(0F, 0F, 0F, 37, 7, 24, 0F,0F, 0F, -12F, 0F, -7F, -12F, 0F, -7F, -12F, 0F, 0F, -12F, 0F, -3F, 0F, 0F, 0F, -2F, 0F, 0.25F, -2F, 0F, -3F, 0F); // Box 315
		rightWingModel[103].setRotationPoint(-45F, -80.5F, -184.5F);

		rightWingModel[104].addShapeBox(0F, 0F, 0F, 37, 12, 32, 0F,0F, 0F, -4F, 0F, -3F, -6F, 0F, -3F, -6F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 317
		rightWingModel[104].setRotationPoint(-45F, -76.5F, -188.5F);

		rightWingModel[105].addShapeBox(0F, 0F, 0F, 37, 12, 32, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -3F, -6F, 0F, -3F, -6F, 0F, 0F, -4F); // Box 318
		rightWingModel[105].setRotationPoint(-45F, -64.5F, -188.5F);

		rightWingModel[106].addShapeBox(0F, 0F, 0F, 22, 9, 26, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -6F, -4F, 0F, -6F, -4F, 0F, 0F, -3F); // Box 319
		rightWingModel[106].setRotationPoint(-8F, -64.5F, -185.5F);

		rightWingModel[107].addShapeBox(0F, 0F, 0F, 37, 7, 24, 0F,0F, -3F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -3F, 0F, 0F, 0F, -12F, 0F, -4F, -12F, 0F, -4F, -12F, 0F, 0F, -12F); // Box 320
		rightWingModel[107].setRotationPoint(-45F, -55.5F, -184.5F);

		rightWingModel[108].addShapeBox(0F, 0F, 0F, 22, 9, 20, 0F,0F, -5.9999F, 0F, 0F, 0F, -0.9999F, 0F, 0F, -0.9999F, 0F, -5.9999F, 0F, 0F, 0F, -9.9999F, 0F, -5.9999F, -4.9999F, 0F, -5.9999F, -5.9999F, 0F, 0F, -9.9999F); // Box 321
		rightWingModel[108].setRotationPoint(-8F, -61.5F, -182.5F);

		rightWingModel[109].addShapeBox(0F, 0F, 0F, 27, 4, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F); // Box 322
		rightWingModel[109].setRotationPoint(-72F, -52.5F, -184.5F);

		rightWingModel[110].addShapeBox(0F, 0F, 0F, 27, 12, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 323
		rightWingModel[110].setRotationPoint(-72F, -64.5F, -188.5F);

		rightWingModel[111].addShapeBox(0F, 0F, 0F, 27, 12, 32, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324
		rightWingModel[111].setRotationPoint(-72F, -76.5F, -188.5F);

		rightWingModel[112].addShapeBox(0F, 0F, 0F, 27, 4, 24, 0F,0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 325
		rightWingModel[112].setRotationPoint(-72F, -80.5F, -184.5F);

		rightWingModel[113].addShapeBox(0F, 0F, 0F, 15, 5, 24, 0F,0F, -1F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, -1F, -12F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F); // Box 326
		rightWingModel[113].setRotationPoint(-87F, -80.5F, -184.5F);

		rightWingModel[114].addShapeBox(0F, 0F, 0F, 15, 12, 32, 0F,0F, -1F, -5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -1F, -5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 327
		rightWingModel[114].setRotationPoint(-87F, -76.5F, -188.5F);

		rightWingModel[115].addShapeBox(0F, 0F, 0F, 15, 12, 32, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -1F, -5F); // Box 328
		rightWingModel[115].setRotationPoint(-87F, -64.5F, -188.5F);

		rightWingModel[116].addShapeBox(0F, 0F, 0F, 15, 5, 24, 0F,0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -1F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, -1F, -12F); // Box 329
		rightWingModel[116].setRotationPoint(-87F, -53.5F, -184.5F);

		rightWingModel[117].addShapeBox(0F, 0F, 0F, 2, 11, 6, 0F,0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, -5F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 330
		rightWingModel[117].setRotationPoint(-89F, -75.5F, -163.5F);

		rightWingModel[118].addShapeBox(0F, 0F, 0F, 2, 6, 11, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -5F, -1F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 1F, -1F); // Box 331
		rightWingModel[118].setRotationPoint(-89F, -79.5F, -172.5F);

		rightWingModel[119].addShapeBox(0F, 0F, 0F, 2, 6, 11, 0F,0F, -5F, -1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -3F, 0F); // Box 332
		rightWingModel[119].setRotationPoint(-89F, -79.5F, -183.5F);

		rightWingModel[120].addShapeBox(0F, 0F, 0F, 2, 11, 6, 0F,0F, -1F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -3F); // Box 333
		rightWingModel[120].setRotationPoint(-89F, -75.5F, -187.5F);

		rightWingModel[121].addShapeBox(0F, -12.5F, -1F, 1, 25, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 334
		rightWingModel[121].setRotationPoint(-88F, -64.5F, -172.5F);
		rightWingModel[121].rotateAngleX = -0.78539816F;

		rightWingModel[122].addShapeBox(0F, -12.5F, -1F, 1, 25, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 335
		rightWingModel[122].setRotationPoint(-88F, -64.5F, -172.5F);

		rightWingModel[123].addShapeBox(0F, -12.5F, -1F, 1, 25, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 336
		rightWingModel[123].setRotationPoint(-88F, -64.5F, -172.5F);
		rightWingModel[123].rotateAngleX = 0.78539816F;

		rightWingModel[124].addShapeBox(0F, -12.5F, -1F, 1, 25, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 337
		rightWingModel[124].setRotationPoint(-88F, -64.5F, -172.5F);
		rightWingModel[124].rotateAngleX = 1.57079633F;

		rightWingModel[125].addShapeBox(0F, 0F, 0F, 2, 11, 6, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, -1F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -1F, 1F); // Box 338
		rightWingModel[125].setRotationPoint(-89F, -64.5F, -187.5F);

		rightWingModel[126].addShapeBox(0F, 0F, 0F, 2, 6, 11, 0F,0F, 1F, -1F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, -5F, -1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 339
		rightWingModel[126].setRotationPoint(-89F, -55.5F, -183.5F);

		rightWingModel[127].addShapeBox(0F, 0F, 0F, 2, 6, 11, 0F,0F, -3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -5F, -1F); // Box 340
		rightWingModel[127].setRotationPoint(-89F, -55.5F, -172.5F);

		rightWingModel[128].addShapeBox(0F, 0F, 0F, 2, 11, 6, 0F,0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, -5F); // Box 341
		rightWingModel[128].setRotationPoint(-89F, -64.5F, -163.5F);

		rightWingModel[129].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 342
		rightWingModel[129].setRotationPoint(-93F, -66F, -174F);

		rightWingModel[130].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 343
		rightWingModel[130].setRotationPoint(-93F, -66F, -173F);

		rightWingModel[131].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 344
		rightWingModel[131].setRotationPoint(-93F, -66F, -172F);

		rightWingModel[132].addShapeBox(0F, 0F, 0F, 7, 5, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 345
		rightWingModel[132].setRotationPoint(-99F, -67F, -175F);

		rightWingModel[133].addBox(0F, 0F, 0F, 7, 5, 3, 0F); // Box 346
		rightWingModel[133].setRotationPoint(-99F, -67F, -174F);

		rightWingModel[134].addShapeBox(0F, 0F, 0F, 7, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 347
		rightWingModel[134].setRotationPoint(-99F, -67F, -171F);

		rightWingModel[135].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, -0.9999F, 0F, 0F, 0F, 0F, 0F, -0.9999F, 0F, 0F, -0.9999F, -0.9999F, 0F, -0.9999F, 0F, 0F, 0F, 0F, 0F, -0.9999F, 0F, 0F, -0.9999F, -0.9999F); // Box 348
		rightWingModel[135].setRotationPoint(-102F, -67F, -171F);

		rightWingModel[136].addShapeBox(0F, 0F, 0F, 3, 5, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 349
		rightWingModel[136].setRotationPoint(-102F, -67F, -174F);

		rightWingModel[137].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, -0.9999F, -0.9999F, 0F, -0.9999F, 0F, 0F, 0F, 0F, 0F, -0.9999F, 0F, 0F, -0.9999F, -0.9999F, 0F, -0.9999F, 0F, 0F, 0F, 0F, 0F, -0.9999F, 0F); // Box 350
		rightWingModel[137].setRotationPoint(-102F, -67F, -175F);

		rightWingModel[138].addShapeBox(0F, 0F, 0F, 22, 9, 26, 0F,0F, -0.25F, -3F, 0F, -6.25F, -4F, 0F, -6.25F, -4F, 0F, -0.25F, -3F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 414
		rightWingModel[138].setRotationPoint(-8F, -73.5F, -185.5F);

		rightWingModel[139].addShapeBox(0F, 0F, 0F, 22, 9, 20, 0F,0F, -5.9999F, 0F, 0F, 0F, -0.9999F, 0F, 0F, -0.9999F, 0F, -5.9999F, 0F, 0F, 0F, -9.9999F, 0F, -5.9999F, -4.9999F, 0F, -5.9999F, -5.9999F, 0F, 0F, -9.9999F); // Box 415
		rightWingModel[139].setRotationPoint(-15F, -58F, -88F);

		rightWingModel[140].addShapeBox(0F, 0F, 0F, 37, 7, 24, 0F,0F, 0F, -12F, 0F, -6F, -12F, 0F, -6F, -12F, 0F, 0F, -12F, 0F, -3F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -3F, 0F); // Box 563
		rightWingModel[140].setRotationPoint(-52F, -77F, 66F);

		rightWingModel[141].addShapeBox(0F, 0F, 0F, 37, 7, 24, 0F,0F, 0F, -12F, 0F, -7F, -12F, 0F, -7F, -12F, 0F, 0F, -12F, 0F, -3F, 0F, 0F, 0.25F, -2F, 0F, 0F, -2F, 0F, -3F, 0F); // Box 564
		rightWingModel[141].setRotationPoint(-45F, -80.5F, 160.5F);

		rightWingModel[142].addShapeBox(0F, 0F, 0F, 3, 19, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 646
		rightWingModel[142].setRotationPoint(-41F, -49F, -80F);

		rightWingModel[143].addShapeBox(0F, 0F, 0F, 3, 3, 8, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 647
		rightWingModel[143].setRotationPoint(-41F, -30F, -85F);

		rightWingModel[144].addShapeBox(0F, 0F, 0F, 3, 24, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 648
		rightWingModel[144].setRotationPoint(-41F, -27F, -85F);

		rightWingModel[145].addShapeBox(0F, 0F, 0F, 10, 22, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 2F, 0F); // Box 649
		rightWingModel[145].setRotationPoint(-45F, -49F, -75F);

		rightWingModel[146].addShapeBox(0F, 0F, 0F, 30, 10, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 650
		rightWingModel[146].setRotationPoint(-54.5F, -10F, -83F);

		rightWingModel[147].addShapeBox(0F, 0F, 0F, 30, 10, 10, 0F,-10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 651
		rightWingModel[147].setRotationPoint(-54.5F, -20F, -83F);

		rightWingModel[148].addShapeBox(0F, 0F, 0F, 30, 10, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F); // Box 652
		rightWingModel[148].setRotationPoint(-54.5F, 0F, -83F);

		rightWingModel[149].addShapeBox(0F, 0F, 0F, 3, 19, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 653
		rightWingModel[149].setRotationPoint(-41F, -49F, 77F);

		rightWingModel[150].addShapeBox(0F, 0F, 0F, 3, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 654
		rightWingModel[150].setRotationPoint(-41F, -30F, 77F);

		rightWingModel[151].addShapeBox(0F, 0F, 0F, 3, 24, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 655
		rightWingModel[151].setRotationPoint(-41F, -27F, 82F);

		rightWingModel[152].addShapeBox(0F, 0F, 0F, 10, 22, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 2F, 0F); // Box 656
		rightWingModel[152].setRotationPoint(-45F, -49F, 74F);

		rightWingModel[153].addShapeBox(0F, 0F, 0F, 30, 10, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 657
		rightWingModel[153].setRotationPoint(-54.5F, -10F, 73F);

		rightWingModel[154].addShapeBox(0F, 0F, 0F, 30, 10, 10, 0F,-10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 658
		rightWingModel[154].setRotationPoint(-54.5F, -20F, 73F);

		rightWingModel[155].addShapeBox(0F, 0F, 0F, 30, 10, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F); // Box 659
		rightWingModel[155].setRotationPoint(-54.5F, 0F, 73F);
	}

	private void inithudModel_1()
	{
		hudModel[0] = new ModelRendererTurbo(this, 1249, 177, textureX, textureY); // Box 746
		hudModel[1] = new ModelRendererTurbo(this, 585, 137, textureX, textureY); // Box 747
		hudModel[2] = new ModelRendererTurbo(this, 137, 73, textureX, textureY); // Box 748
		hudModel[3] = new ModelRendererTurbo(this, 409, 73, textureX, textureY); // Box 749
		hudModel[4] = new ModelRendererTurbo(this, 1441, 169, textureX, textureY); // Box 750
		hudModel[5] = new ModelRendererTurbo(this, 1761, 177, textureX, textureY); // Box 751
		hudModel[6] = new ModelRendererTurbo(this, 1065, 97, textureX, textureY); // Box 752
		hudModel[7] = new ModelRendererTurbo(this, 1145, 177, textureX, textureY); // Box 753
		hudModel[8] = new ModelRendererTurbo(this, 2041, 41, textureX, textureY); // Box 754
		hudModel[9] = new ModelRendererTurbo(this, 1521, 49, textureX, textureY); // Box 755
		hudModel[10] = new ModelRendererTurbo(this, 817, 89, textureX, textureY); // Box 758
		hudModel[11] = new ModelRendererTurbo(this, 86, 102, textureX, textureY); // Box 759
		hudModel[12] = new ModelRendererTurbo(this, 1297, 25, textureX, textureY); // Box 761
		hudModel[13] = new ModelRendererTurbo(this, 1169, 81, textureX, textureY); // Box 762
		hudModel[14] = new ModelRendererTurbo(this, 1337, 81, textureX, textureY); // Box 763
		hudModel[15] = new ModelRendererTurbo(this, 1417, 81, textureX, textureY); // Box 764
		hudModel[16] = new ModelRendererTurbo(this, 60, 89, textureX, textureY); // Box 784
		hudModel[17] = new ModelRendererTurbo(this, 705, 73, textureX, textureY); // Box 785
		hudModel[18] = new ModelRendererTurbo(this, 1529, 81, textureX, textureY); // Box 787
		hudModel[19] = new ModelRendererTurbo(this, 1737, 81, textureX, textureY); // Box 788
		hudModel[20] = new ModelRendererTurbo(this, 841, 49, textureX, textureY); // Box 790
		hudModel[21] = new ModelRendererTurbo(this, 1409, 49, textureX, textureY); // Box 793
		hudModel[22] = new ModelRendererTurbo(this, 1409, 73, textureX, textureY); // Box 467
		hudModel[23] = new ModelRendererTurbo(this, 473, 185, textureX, textureY); // Box 478
		hudModel[24] = new ModelRendererTurbo(this, 353, 185, textureX, textureY); // Box 479
		hudModel[25] = new ModelRendererTurbo(this, 1561, 113, textureX, textureY); // Box 480
		hudModel[26] = new ModelRendererTurbo(this, 1793, 113, textureX, textureY); // Box 481
		hudModel[27] = new ModelRendererTurbo(this, 849, 185, textureX, textureY); // Box 482
		hudModel[28] = new ModelRendererTurbo(this, 1489, 185, textureX, textureY); // Box 483
		hudModel[29] = new ModelRendererTurbo(this, 417, 121, textureX, textureY); // Box 484
		hudModel[30] = new ModelRendererTurbo(this, 297, 201, textureX, textureY); // Box 485
		hudModel[31] = new ModelRendererTurbo(this, 1593, 97, textureX, textureY); // Box 486
		hudModel[32] = new ModelRendererTurbo(this, 1881, 105, textureX, textureY); // Box 487
		hudModel[33] = new ModelRendererTurbo(this, 801, 121, textureX, textureY); // Box 488
		hudModel[34] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 489
		hudModel[35] = new ModelRendererTurbo(this, 1881, 81, textureX, textureY); // Box 490
		hudModel[36] = new ModelRendererTurbo(this, 265, 89, textureX, textureY); // Box 491
		hudModel[37] = new ModelRendererTurbo(this, 369, 89, textureX, textureY); // Box 492
		hudModel[38] = new ModelRendererTurbo(this, 97, 121, textureX, textureY); // Box 493
		hudModel[39] = new ModelRendererTurbo(this, 201, 121, textureX, textureY); // Box 494
		hudModel[40] = new ModelRendererTurbo(this, 1593, 41, textureX, textureY); // Box 673
		hudModel[41] = new ModelRendererTurbo(this, 289, 145, textureX, textureY); // Box 674
		hudModel[42] = new ModelRendererTurbo(this, 1081, 145, textureX, textureY); // Box 675
		hudModel[43] = new ModelRendererTurbo(this, 1049, 65, textureX, textureY); // Box 676
		hudModel[44] = new ModelRendererTurbo(this, 1089, 65, textureX, textureY); // Box 677
		hudModel[45] = new ModelRendererTurbo(this, 89, 161, textureX, textureY); // Box 678

		hudModel[0].addShapeBox(0F, 1F, 0F, 10, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 746
		hudModel[0].setRotationPoint(-116F, -57F, 5.5F);
		hudModel[0].rotateAngleZ = -0.10471976F;

		hudModel[1].addShapeBox(9F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 747
		hudModel[1].setRotationPoint(-116F, -57F, 5.5F);
		hudModel[1].rotateAngleZ = -0.10471976F;

		hudModel[2].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 748
		hudModel[2].setRotationPoint(-116F, -57F, 14.5F);
		hudModel[2].rotateAngleZ = -0.10471976F;

		hudModel[3].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 749
		hudModel[3].setRotationPoint(-116F, -57F, 5.5F);
		hudModel[3].rotateAngleZ = -0.10471976F;

		hudModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 750
		hudModel[4].setRotationPoint(-116F, -57F, 5.5F);
		hudModel[4].rotateAngleZ = -0.10471976F;

		hudModel[5].addShapeBox(0F, 0F, 0F, 1, 13, 10, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 751
		hudModel[5].setRotationPoint(-107F, -69F, 5.5F);

		hudModel[6].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 752
		hudModel[6].setRotationPoint(-105F, -73F, 7.5F);

		hudModel[7].addShapeBox(0F, 0F, 0F, 1, 13, 8, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 753
		hudModel[7].setRotationPoint(-108F, -68F, 6.5F);

		hudModel[8].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 754
		hudModel[8].setRotationPoint(-108.3F, -68.3F, 11.5F);

		hudModel[9].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 755
		hudModel[9].setRotationPoint(-108.3F, -68.3F, 8.5F);

		hudModel[10].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 758
		hudModel[10].setRotationPoint(-113F, -56F, 15.5F);
		hudModel[10].rotateAngleZ = 0.78539816F;

		hudModel[11].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 759
		hudModel[11].setRotationPoint(-113F, -56F, 4.5F);
		hudModel[11].rotateAngleZ = 0.78539816F;

		hudModel[12].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 761
		hudModel[12].setRotationPoint(-120.5F, -63F, 10.5F);

		hudModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 762
		hudModel[13].setRotationPoint(-105.5F, -72.5F, 9F);

		hudModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 763
		hudModel[14].setRotationPoint(-105.5F, -71.5F, 9F);

		hudModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 764
		hudModel[15].setRotationPoint(-105.5F, -70.5F, 9F);

		hudModel[16].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 784
		hudModel[16].setRotationPoint(-112F, -55F, 13.5F);

		hudModel[17].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 785
		hudModel[17].setRotationPoint(-112F, -55F, 6.5F);

		hudModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 787
		hudModel[18].setRotationPoint(-120.5F, -62.75F, 11.5F);

		hudModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 788
		hudModel[19].setRotationPoint(-120.5F, -62.75F, 7.5F);

		hudModel[20].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 790
		hudModel[20].setRotationPoint(-120.5F, -65.75F, 7.5F);

		hudModel[21].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 793
		hudModel[21].setRotationPoint(-120.5F, -65.75F, 13.5F);

		hudModel[22].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 467
		hudModel[22].setRotationPoint(-125.5F, -62.75F, 10.5F);

		hudModel[23].addShapeBox(0F, 1F, 0F, 10, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 478
		hudModel[23].setRotationPoint(-116F, -57F, -15.5F);
		hudModel[23].rotateAngleZ = -0.10471976F;

		hudModel[24].addShapeBox(9F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 479
		hudModel[24].setRotationPoint(-116F, -57F, -15.5F);
		hudModel[24].rotateAngleZ = -0.10471976F;

		hudModel[25].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 480
		hudModel[25].setRotationPoint(-116F, -57F, -15.5F);
		hudModel[25].rotateAngleZ = -0.10471976F;

		hudModel[26].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 481
		hudModel[26].setRotationPoint(-116F, -57F, -6.5F);
		hudModel[26].rotateAngleZ = -0.10471976F;

		hudModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 482
		hudModel[27].setRotationPoint(-116F, -57F, -15.5F);
		hudModel[27].rotateAngleZ = -0.10471976F;

		hudModel[28].addShapeBox(0F, 0F, 0F, 1, 13, 10, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 483
		hudModel[28].setRotationPoint(-107F, -69F, -15.5F);

		hudModel[29].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 484
		hudModel[29].setRotationPoint(-105F, -73F, -13.5F);

		hudModel[30].addShapeBox(0F, 0F, 0F, 1, 13, 8, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 485
		hudModel[30].setRotationPoint(-108F, -68F, -14.5F);

		hudModel[31].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 486
		hudModel[31].setRotationPoint(-108.3F, -68.3F, -12.5F);

		hudModel[32].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 487
		hudModel[32].setRotationPoint(-108.3F, -68.3F, -9.5F);

		hudModel[33].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 488
		hudModel[33].setRotationPoint(-113F, -56F, -16.5F);
		hudModel[33].rotateAngleZ = 0.78539816F;

		hudModel[34].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 489
		hudModel[34].setRotationPoint(-113F, -56F, -5.5F);
		hudModel[34].rotateAngleZ = 0.78539816F;

		hudModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 490
		hudModel[35].setRotationPoint(-105.5F, -72.5F, -12F);

		hudModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 491
		hudModel[36].setRotationPoint(-105.5F, -71.5F, -12F);

		hudModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 492
		hudModel[37].setRotationPoint(-105.5F, -70.5F, -12F);

		hudModel[38].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 493
		hudModel[38].setRotationPoint(-112F, -55F, -14.5F);

		hudModel[39].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 494
		hudModel[39].setRotationPoint(-112F, -55F, -7.5F);

		hudModel[40].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 673
		hudModel[40].setRotationPoint(-120.5F, -63F, -11.5F);

		hudModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 674
		hudModel[41].setRotationPoint(-120.5F, -62.75F, -14.5F);

		hudModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 675
		hudModel[42].setRotationPoint(-120.5F, -62.75F, -10.5F);

		hudModel[43].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 676
		hudModel[43].setRotationPoint(-120.5F, -65.75F, -8.5F);

		hudModel[44].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 677
		hudModel[44].setRotationPoint(-120.5F, -65.75F, -14.5F);

		hudModel[45].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 678
		hudModel[45].setRotationPoint(-125.5F, -62.75F, -11.5F);
	}

	private void initPropeller()
	{
		propellerModels = new ModelRendererTurbo[4][3];
		propellerModels[0] = makeProp1(-100F, -61.5F, 78F);
		propellerModels[1] = makeProp2(-94F, -65F, 172.5F);
		propellerModels[2] = makeProp3(-94F, -65F, -172.5F);
		propellerModels[3] = makeProp4(-100F, -61.5F, -78F);
	}

	private ModelRendererTurbo[] makeProp1(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[3];
		prop[0] = new ModelRendererTurbo(this, 0, 540, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 540, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 0, 540, textureX, textureY);
		prop[0].addBox(-0.5F, -42F, -2.5F, 1, 42, 5, 0.0F);
		prop[1].addBox(-0.5F, -42F, -2.5F, 1, 42, 5, 0.0F);
		prop[2].addBox(-0.5F, -42F, -2.5F, 1, 42, 5, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		return prop;
	}

	private ModelRendererTurbo[] makeProp2(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[3];
		prop[0] = new ModelRendererTurbo(this, 0, 540, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 540, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 0, 540, textureX, textureY);
		prop[0].addBox(-0.5F, -42F, -2.5F, 1, 42, 5, 0.0F);
		prop[1].addBox(-0.5F, -42F, -2.5F, 1, 42, 5, 0.0F);
		prop[2].addBox(-0.5F, -42F, -2.5F, 1, 42, 5, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		return prop;
	}

	private ModelRendererTurbo[] makeProp3(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[3];
		prop[0] = new ModelRendererTurbo(this, 0, 540, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 540, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 0, 540, textureX, textureY);
		prop[0].addBox(-0.5F, -42F, -2.5F, 1, 42, 5, 0.0F);
		prop[1].addBox(-0.5F, -42F, -2.5F, 1, 42, 5, 0.0F);
		prop[2].addBox(-0.5F, -42F, -2.5F, 1, 42, 5, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		return prop;
	}

	private ModelRendererTurbo[] makeProp4(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[3];
		prop[0] = new ModelRendererTurbo(this, 0, 540, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 540, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 0, 540, textureX, textureY);
		prop[0].addBox(-0.5F, -42F, -2.5F, 1, 42, 5, 0.0F);
		prop[1].addBox(-0.5F, -42F, -2.5F, 1, 42, 5, 0.0F);
		prop[2].addBox(-0.5F, -42F, -2.5F, 1, 42, 5, 0.0F);
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

		gun_2_Model[1] = new ModelRendererTurbo[10];
		gun_2_Model[1][0] = new ModelRendererTurbo(this, 1731, 903, textureX, textureY); // Box 299
		gun_2_Model[1][1] = new ModelRendererTurbo(this, 1739, 903, textureX, textureY); // Box 299
		gun_2_Model[1][2] = new ModelRendererTurbo(this, 1763, 903, textureX, textureY); // Box 299
		gun_2_Model[1][3] = new ModelRendererTurbo(this, 1731, 911, textureX, textureY); // Box 299
		gun_2_Model[1][4] = new ModelRendererTurbo(this, 1779, 903, textureX, textureY); // Box 299
		gun_2_Model[1][5] = new ModelRendererTurbo(this, 1779, 911, textureX, textureY); // Box 299
		gun_2_Model[1][6] = new ModelRendererTurbo(this, 1787, 903, textureX, textureY); // Box 299
		gun_2_Model[1][7] = new ModelRendererTurbo(this, 1731, 919, textureX, textureY); // Box 299
		gun_2_Model[1][8] = new ModelRendererTurbo(this, 1755, 911, textureX, textureY); // Box 299
		gun_2_Model[1][9] = new ModelRendererTurbo(this, 1771, 911, textureX, textureY); // Box 299

		gun_2_Model[1][0].addShapeBox(7F, -0.8F, -1.5F, 1, 1, 2, 0F,0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F); // Box 299

		gun_2_Model[1][1].addShapeBox(7F, -1.5F, -0.5F, 7, 1, 1, 0F,0F, -0.2F, -0.2F, 3F, -0.2F, -0.2F, 3F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 3F, -0.2F, -0.2F, 3F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 299

		gun_2_Model[1][2].addShapeBox(4F, -1.5F, -0.5F, 5, 1, 1, 0F,0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F); // Box 299

		gun_2_Model[1][3].addShapeBox(-5F, -2F, -1F, 9, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299

		gun_2_Model[1][4].addShapeBox(-3F, -1.8F, -2F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299

		gun_2_Model[1][5].addShapeBox(-9F, -2F, -1F, 4, 2, 2, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 299

		gun_2_Model[1][6].addShapeBox(-11F, -2.5F, 1F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299

		gun_2_Model[1][7].addShapeBox(-11F, -2.5F, -2F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299

		gun_2_Model[1][8].addShapeBox(-10F, -2F, -1F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299

		gun_2_Model[1][9].addShapeBox(-10F, -2F, 1F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[1])
		{
			gunPart.setRotationPoint(-187F, -44F, 0F);
		}


		gun_2_Model[2] = new ModelRendererTurbo[1];
		gun_2_Model[2][0] = new ModelRendererTurbo(this, 1755, 911, textureX, textureY); // Box 299

		gun_2_Model[2][0].addShapeBox(-4.5F, -1.5F, 1F, 4, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[2])
		{
			gunPart.setRotationPoint(-187F, -44F, 0F);
		}


		registerGunModel("NoseGun", gun_2_Model);

		// Passenger 6
		ModelRendererTurbo[][] gun_3_Model = new ModelRendererTurbo[3][];

		gun_3_Model[0] = new ModelRendererTurbo[37];
		gun_3_Model[0][0] = new ModelRendererTurbo(this, 1, 889, textureX, textureY); // Import GT_01
		gun_3_Model[0][1] = new ModelRendererTurbo(this, 9, 889, textureX, textureY); // Import GT_02
		gun_3_Model[0][2] = new ModelRendererTurbo(this, 25, 889, textureX, textureY); // Import GT_03
		gun_3_Model[0][3] = new ModelRendererTurbo(this, 41, 889, textureX, textureY); // Import GT_04
		gun_3_Model[0][4] = new ModelRendererTurbo(this, 65, 889, textureX, textureY); // Import GT_05
		gun_3_Model[0][5] = new ModelRendererTurbo(this, 81, 889, textureX, textureY); // Import GT_06
		gun_3_Model[0][6] = new ModelRendererTurbo(this, 113, 889, textureX, textureY); // Import GT_07
		gun_3_Model[0][7] = new ModelRendererTurbo(this, 97, 889, textureX, textureY); // Import GT_08
		gun_3_Model[0][8] = new ModelRendererTurbo(this, 113, 889, textureX, textureY); // Import GT_09
		gun_3_Model[0][9] = new ModelRendererTurbo(this, 129, 889, textureX, textureY); // Import GT_10
		gun_3_Model[0][10] = new ModelRendererTurbo(this, 137, 889, textureX, textureY); // Import GT_11
		gun_3_Model[0][11] = new ModelRendererTurbo(this, 145, 889, textureX, textureY); // Import GT_12
		gun_3_Model[0][12] = new ModelRendererTurbo(this, 153, 889, textureX, textureY); // Import GT_13
		gun_3_Model[0][13] = new ModelRendererTurbo(this, 161, 889, textureX, textureY); // Import GT_14
		gun_3_Model[0][14] = new ModelRendererTurbo(this, 169, 889, textureX, textureY); // Import GT_15
		gun_3_Model[0][15] = new ModelRendererTurbo(this, 177, 889, textureX, textureY); // Import GT_16
		gun_3_Model[0][16] = new ModelRendererTurbo(this, 185, 889, textureX, textureY); // Import GT_17
		gun_3_Model[0][17] = new ModelRendererTurbo(this, 193, 889, textureX, textureY); // Import GT_18
		gun_3_Model[0][18] = new ModelRendererTurbo(this, 201, 889, textureX, textureY); // Import GT_19
		gun_3_Model[0][19] = new ModelRendererTurbo(this, 217, 889, textureX, textureY); // Import GT_20
		gun_3_Model[0][20] = new ModelRendererTurbo(this, 241, 889, textureX, textureY); // Import GT_21
		gun_3_Model[0][21] = new ModelRendererTurbo(this, 265, 889, textureX, textureY); // Import GT_23
		gun_3_Model[0][22] = new ModelRendererTurbo(this, 273, 889, textureX, textureY); // Import GT_24
		gun_3_Model[0][23] = new ModelRendererTurbo(this, 281, 889, textureX, textureY); // Import GT_25
		gun_3_Model[0][24] = new ModelRendererTurbo(this, 297, 889, textureX, textureY); // Import GT_26
		gun_3_Model[0][25] = new ModelRendererTurbo(this, 313, 889, textureX, textureY); // Import GT_27
		gun_3_Model[0][26] = new ModelRendererTurbo(this, 329, 889, textureX, textureY); // Import GT_28
		gun_3_Model[0][27] = new ModelRendererTurbo(this, 345, 889, textureX, textureY); // Import GT_29
		gun_3_Model[0][28] = new ModelRendererTurbo(this, 353, 889, textureX, textureY); // Import GT_30
		gun_3_Model[0][29] = new ModelRendererTurbo(this, 361, 889, textureX, textureY); // Import GT_31
		gun_3_Model[0][30] = new ModelRendererTurbo(this, 369, 889, textureX, textureY); // Import GT_32
		gun_3_Model[0][31] = new ModelRendererTurbo(this, 289, 889, textureX, textureY); // Import GT_35
		gun_3_Model[0][32] = new ModelRendererTurbo(this, 305, 889, textureX, textureY); // Import GT_36
		gun_3_Model[0][33] = new ModelRendererTurbo(this, 377, 889, textureX, textureY); // Import GT_22
		gun_3_Model[0][34] = new ModelRendererTurbo(this, 417, 889, textureX, textureY); // Import GT_33
		gun_3_Model[0][35] = new ModelRendererTurbo(this, 457, 889, textureX, textureY); // Import GT_34
		gun_3_Model[0][36] = new ModelRendererTurbo(this, 489, 889, textureX, textureY); // Import GT_37

		gun_3_Model[0][0].addBox(-4F, -6.5F, -5F, 4, 1, 2, 0F); // Import GT_01

		gun_3_Model[0][1].addBox(-11F, 2.5F, -5F, 2, 1, 10, 0F); // Import GT_02

		gun_3_Model[0][2].addShapeBox(-11F, 2.5F, -10F, 5, 1, 5, 0F,-5F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F); // Import GT_03

		gun_3_Model[0][3].addBox(-6F, 2.5F, -10F, 12, 1, 2, 0F); // Import GT_04

		gun_3_Model[0][4].addShapeBox(6F, 2.5F, -10F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, -5F, -2F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -5F, -2F, 0F, 0F, 0F, 0F, -3F); // Import GT_05

		gun_3_Model[0][5].addBox(9F, 2.5F, -5F, 2, 1, 10, 0F); // Import GT_06

		gun_3_Model[0][6].addBox(-0.5F, -6.5F, -5F, 1, 1, 10, 0F); // Import GT_07

		gun_3_Model[0][7].addBox(-4F, -6.5F, 3F, 4, 1, 2, 0F); // Import GT_08

		gun_3_Model[0][8].addShapeBox(-0.5F, -2.5F, -9F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import GT_09

		gun_3_Model[0][9].addShapeBox(-10F, -2.5F, -5F, 1, 5, 2, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Import GT_10

		gun_3_Model[0][10].addShapeBox(-4F, -6.5F, -5F, 1, 4, 2, 0F,0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0.5F, 0F, -6F, 0.5F, 0F, 6F, 0F, 0F); // Import GT_11

		gun_3_Model[0][11].addShapeBox(3F, -6.5F, -5F, 1, 4, 1, 0F,-1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, -1F, -0.5F, -6F, 0.5F, 0F, 6F, 0F, 0F, 6F, 0F, -0.5F, -6F, 0.5F, -0.5F); // Import GT_12

		gun_3_Model[0][12].addShapeBox(9F, -2.5F, -5F, 1, 5, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, -1F, 0F, -0.5F); // Import GT_13

		gun_3_Model[0][13].addShapeBox(-0.5F, -6.5F, -5F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0.5F, -4F, 0F, 0.5F, -4F); // Import GT_14

		gun_3_Model[0][14].addShapeBox(-4F, -6.5F, 3F, 1, 4, 2, 0F,0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0.5F, 0F, -6F, 0.5F, 0F, 6F, 0F, 0F); // Import GT_15

		gun_3_Model[0][15].addShapeBox(-10F, -2.5F, 3F, 1, 5, 2, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Import GT_16

		gun_3_Model[0][16].addShapeBox(-0.5F, -6.5F, 4F, 1, 4, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -4F, 0F, 0.5F, -4F, 0F, 0F, 4F, 0F, 0F, 4F); // Import GT_17

		gun_3_Model[0][17].addShapeBox(-0.5F, -2.5F, 8F, 1, 5, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Import GT_18

		gun_3_Model[0][18].addShapeBox(-11F, 2.5F, 5F, 5, 1, 5, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -2F, -5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -2F, -5F, 0F, 0F); // Import GT_19

		gun_3_Model[0][19].addBox(-6F, 2.5F, 8F, 12, 1, 2, 0F); // Import GT_20

		gun_3_Model[0][20].addShapeBox(6F, 2.5F, 5F, 5, 1, 5, 0F,0F, 0F, -3F, -2F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F); // Import GT_21

		gun_3_Model[0][21].addShapeBox(3F, -6.5F, -4F, 1, 4, 1, 0F,-1F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, -1F, 0F, -6F, 0.5F, -0.5F, 6F, 0F, -0.5F, 6F, 0F, 0F, -6F, 0.5F, 0F); // Import GT_23

		gun_3_Model[0][22].addShapeBox(9F, -2.5F, -4F, 1, 5, 1, 0F,0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, -1F, 0F, 0F); // Import GT_24

		gun_3_Model[0][23].addShapeBox(0F, -6.5F, -5F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import GT_25

		gun_3_Model[0][24].addShapeBox(0F, -6.5F, -4F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import GT_26

		gun_3_Model[0][25].addShapeBox(0F, -6.5F, 3F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import GT_27

		gun_3_Model[0][26].addShapeBox(0F, -6.5F, 4F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import GT_28

		gun_3_Model[0][27].addShapeBox(3F, -6.5F, 4F, 1, 4, 1, 0F,-1F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, -1F, 0F, -6F, 0.5F, -0.5F, 6F, 0F, -0.5F, 6F, 0F, 0F, -6F, 0.5F, 0F); // Import GT_29

		gun_3_Model[0][28].addShapeBox(3F, -6.5F, 3F, 1, 4, 1, 0F,-1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, -1F, -0.5F, -6F, 0.5F, 0F, 6F, 0F, 0F, 6F, 0F, -0.5F, -6F, 0.5F, -0.5F); // Import GT_30

		gun_3_Model[0][29].addShapeBox(9F, -2.5F, 3F, 1, 5, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, -1F, 0F, -0.5F); // Import GT_31

		gun_3_Model[0][30].addShapeBox(9F, -2.5F, 4F, 1, 5, 1, 0F,0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, -1F, 0F, 0F); // Import GT_32

		gun_3_Model[0][31].addBox(-0.5F, -0.5F, -9F, 1, 1, 4, 0F); // Import GT_35

		gun_3_Model[0][32].addBox(-0.5F, -0.5F, 5F, 1, 1, 4, 0F); // Import GT_36

		gun_3_Model[0][33].addBox(6F, -0.5F, -4.5F, 16, 1, 1, 0F); // Import GT_22

		gun_3_Model[0][34].addBox(6F, -0.5F, 3.5F, 16, 1, 1, 0F); // Import GT_33

		gun_3_Model[0][35].addBox(-4F, -1F, -5F, 10, 2, 2, 0F); // Import GT_34

		gun_3_Model[0][36].addBox(-4F, -1F, 3F, 10, 2, 2, 0F); // Import GT_37

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_3_Model[0])
		{
			gunPart.setRotationPoint(-73F, -85F, 0F);
		}


		gun_3_Model[1] = new ModelRendererTurbo[0];

		gun_3_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("DorsalGunFront", gun_3_Model);

		// Passenger 7
		ModelRendererTurbo[][] gun_4_Model = new ModelRendererTurbo[3][];

		gun_4_Model[0] = new ModelRendererTurbo[33];
		gun_4_Model[0][0] = new ModelRendererTurbo(this, 1, 889, textureX, textureY); // Import GD_01
		gun_4_Model[0][1] = new ModelRendererTurbo(this, 57, 889, textureX, textureY); // Import GD_02
		gun_4_Model[0][2] = new ModelRendererTurbo(this, 89, 889, textureX, textureY); // Import GD_03
		gun_4_Model[0][3] = new ModelRendererTurbo(this, 121, 889, textureX, textureY); // Import GD_04
		gun_4_Model[0][4] = new ModelRendererTurbo(this, 1, 889, textureX, textureY); // Import GD_05
		gun_4_Model[0][5] = new ModelRendererTurbo(this, 153, 889, textureX, textureY); // Import GD_06
		gun_4_Model[0][6] = new ModelRendererTurbo(this, 41, 889, textureX, textureY); // Import GD_07
		gun_4_Model[0][7] = new ModelRendererTurbo(this, 73, 889, textureX, textureY); // Import GD_08
		gun_4_Model[0][8] = new ModelRendererTurbo(this, 185, 889, textureX, textureY); // Import GD_09
		gun_4_Model[0][9] = new ModelRendererTurbo(this, 81, 889, textureX, textureY); // Import GD_10
		gun_4_Model[0][10] = new ModelRendererTurbo(this, 89, 889, textureX, textureY); // Import GD_11
		gun_4_Model[0][11] = new ModelRendererTurbo(this, 217, 889, textureX, textureY); // Import GD_12
		gun_4_Model[0][12] = new ModelRendererTurbo(this, 233, 889, textureX, textureY); // Import GD_13
		gun_4_Model[0][13] = new ModelRendererTurbo(this, 105, 889, textureX, textureY); // Import GD_16
		gun_4_Model[0][14] = new ModelRendererTurbo(this, 249, 889, textureX, textureY); // Import GD_17
		gun_4_Model[0][15] = new ModelRendererTurbo(this, 137, 889, textureX, textureY); // Import GD_18
		gun_4_Model[0][16] = new ModelRendererTurbo(this, 281, 889, textureX, textureY); // Import GD_19
		gun_4_Model[0][17] = new ModelRendererTurbo(this, 185, 889, textureX, textureY); // Import GD_20
		gun_4_Model[0][18] = new ModelRendererTurbo(this, 201, 889, textureX, textureY); // Import GD_21
		gun_4_Model[0][19] = new ModelRendererTurbo(this, 249, 889, textureX, textureY); // Import GD_22
		gun_4_Model[0][20] = new ModelRendererTurbo(this, 265, 889, textureX, textureY); // Import GD_23
		gun_4_Model[0][21] = new ModelRendererTurbo(this, 297, 889, textureX, textureY); // Import GD_24
		gun_4_Model[0][22] = new ModelRendererTurbo(this, 313, 889, textureX, textureY); // Import GD_25
		gun_4_Model[0][23] = new ModelRendererTurbo(this, 345, 889, textureX, textureY); // Import GD_26
		gun_4_Model[0][24] = new ModelRendererTurbo(this, 361, 889, textureX, textureY); // Import GD_29
		gun_4_Model[0][25] = new ModelRendererTurbo(this, 377, 889, textureX, textureY); // Import GD_30
		gun_4_Model[0][26] = new ModelRendererTurbo(this, 409, 889, textureX, textureY); // Import GD_31
		gun_4_Model[0][27] = new ModelRendererTurbo(this, 425, 889, textureX, textureY); // Import GD_32
		gun_4_Model[0][28] = new ModelRendererTurbo(this, 441, 889, textureX, textureY); // Import GD_33
		gun_4_Model[0][29] = new ModelRendererTurbo(this, 457, 889, textureX, textureY); // Import GD_14
		gun_4_Model[0][30] = new ModelRendererTurbo(this, 481, 889, textureX, textureY); // Import GD_15
		gun_4_Model[0][31] = new ModelRendererTurbo(this, 505, 889, textureX, textureY); // Import GD_27
		gun_4_Model[0][32] = new ModelRendererTurbo(this, 529, 889, textureX, textureY); // Import GD_28

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
			gunPart.setRotationPoint(72.5F, -14F, 0F);
		}


		gun_4_Model[1] = new ModelRendererTurbo[0];

		gun_4_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("DorsalGunRear", gun_4_Model);

		// Passenger 8
		ModelRendererTurbo[][] gun_5_Model = new ModelRendererTurbo[3][];

		gun_5_Model[0] = new ModelRendererTurbo[54];
		gun_5_Model[0][0] = new ModelRendererTurbo(this, 1, 981, textureX, textureY); // Box 0
		gun_5_Model[0][1] = new ModelRendererTurbo(this, 57, 981, textureX, textureY); // Box 13
		gun_5_Model[0][2] = new ModelRendererTurbo(this, 97, 981, textureX, textureY); // Box 24
		gun_5_Model[0][3] = new ModelRendererTurbo(this, 113, 981, textureX, textureY); // Box 76
		gun_5_Model[0][4] = new ModelRendererTurbo(this, 153, 981, textureX, textureY); // Box 80
		gun_5_Model[0][5] = new ModelRendererTurbo(this, 49, 981, textureX, textureY); // Box 82
		gun_5_Model[0][6] = new ModelRendererTurbo(this, 81, 981, textureX, textureY); // Box 84
		gun_5_Model[0][7] = new ModelRendererTurbo(this, 193, 981, textureX, textureY); // Box 86
		gun_5_Model[0][8] = new ModelRendererTurbo(this, 201, 981, textureX, textureY); // Box 87
		gun_5_Model[0][9] = new ModelRendererTurbo(this, 209, 981, textureX, textureY); // Box 88
		gun_5_Model[0][10] = new ModelRendererTurbo(this, 217, 981, textureX, textureY); // Box 89
		gun_5_Model[0][11] = new ModelRendererTurbo(this, 361, 981, textureX, textureY); // Box 99
		gun_5_Model[0][12] = new ModelRendererTurbo(this, 377, 981, textureX, textureY); // Box 100
		gun_5_Model[0][13] = new ModelRendererTurbo(this, 393, 981, textureX, textureY); // Box 101
		gun_5_Model[0][14] = new ModelRendererTurbo(this, 409, 981, textureX, textureY); // Box 102
		gun_5_Model[0][15] = new ModelRendererTurbo(this, 425, 981, textureX, textureY); // Box 103
		gun_5_Model[0][16] = new ModelRendererTurbo(this, 449, 981, textureX, textureY); // Box 104
		gun_5_Model[0][17] = new ModelRendererTurbo(this, 473, 981, textureX, textureY); // Box 105
		gun_5_Model[0][18] = new ModelRendererTurbo(this, 489, 981, textureX, textureY); // Box 106
		gun_5_Model[0][19] = new ModelRendererTurbo(this, 505, 981, textureX, textureY); // Box 107
		gun_5_Model[0][20] = new ModelRendererTurbo(this, 521, 981, textureX, textureY); // Box 108
		gun_5_Model[0][21] = new ModelRendererTurbo(this, 537, 981, textureX, textureY); // Box 109
		gun_5_Model[0][22] = new ModelRendererTurbo(this, 545, 981, textureX, textureY); // Box 110
		gun_5_Model[0][23] = new ModelRendererTurbo(this, 553, 981, textureX, textureY); // Box 111
		gun_5_Model[0][24] = new ModelRendererTurbo(this, 561, 981, textureX, textureY); // Box 112
		gun_5_Model[0][25] = new ModelRendererTurbo(this, 601, 981, textureX, textureY); // Box 116
		gun_5_Model[0][26] = new ModelRendererTurbo(this, 609, 981, textureX, textureY); // Box 117
		gun_5_Model[0][27] = new ModelRendererTurbo(this, 97, 981, textureX, textureY); // Box 118
		gun_5_Model[0][28] = new ModelRendererTurbo(this, 617, 981, textureX, textureY); // Box 119
		gun_5_Model[0][29] = new ModelRendererTurbo(this, 633, 981, textureX, textureY); // Box 120
		gun_5_Model[0][30] = new ModelRendererTurbo(this, 649, 981, textureX, textureY); // Box 121
		gun_5_Model[0][31] = new ModelRendererTurbo(this, 657, 981, textureX, textureY); // Box 122
		gun_5_Model[0][32] = new ModelRendererTurbo(this, 249, 981, textureX, textureY); // Box 123
		gun_5_Model[0][33] = new ModelRendererTurbo(this, 665, 981, textureX, textureY); // Box 124
		gun_5_Model[0][34] = new ModelRendererTurbo(this, 681, 981, textureX, textureY); // Box 125
		gun_5_Model[0][35] = new ModelRendererTurbo(this, 281, 981, textureX, textureY); // Box 126
		gun_5_Model[0][36] = new ModelRendererTurbo(this, 697, 981, textureX, textureY); // Box 127
		gun_5_Model[0][37] = new ModelRendererTurbo(this, 713, 981, textureX, textureY); // Box 128
		gun_5_Model[0][38] = new ModelRendererTurbo(this, 369, 981, textureX, textureY); // Box 129
		gun_5_Model[0][39] = new ModelRendererTurbo(this, 385, 981, textureX, textureY); // Box 130
		gun_5_Model[0][40] = new ModelRendererTurbo(this, 401, 981, textureX, textureY); // Box 131
		gun_5_Model[0][41] = new ModelRendererTurbo(this, 721, 981, textureX, textureY); // Box 132
		gun_5_Model[0][42] = new ModelRendererTurbo(this, 737, 981, textureX, textureY); // Box 133
		gun_5_Model[0][43] = new ModelRendererTurbo(this, 745, 981, textureX, textureY); // Box 134
		gun_5_Model[0][44] = new ModelRendererTurbo(this, 761, 981, textureX, textureY); // Box 135
		gun_5_Model[0][45] = new ModelRendererTurbo(this, 777, 981, textureX, textureY); // Box 136
		gun_5_Model[0][46] = new ModelRendererTurbo(this, 793, 981, textureX, textureY); // Box 137
		gun_5_Model[0][47] = new ModelRendererTurbo(this, 809, 981, textureX, textureY); // Box 138
		gun_5_Model[0][48] = new ModelRendererTurbo(this, 825, 981, textureX, textureY); // Box 139
		gun_5_Model[0][49] = new ModelRendererTurbo(this, 841, 981, textureX, textureY); // Box 140
		gun_5_Model[0][50] = new ModelRendererTurbo(this, 857, 981, textureX, textureY); // Box 141
		gun_5_Model[0][51] = new ModelRendererTurbo(this, 865, 981, textureX, textureY); // Box 142
		gun_5_Model[0][52] = new ModelRendererTurbo(this, 897, 981, textureX, textureY); // Box 143
		gun_5_Model[0][53] = new ModelRendererTurbo(this, 889, 981, textureX, textureY); // Box 144

		gun_5_Model[0][0].addShapeBox(-8F, 0F, -6F, 14, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0

		gun_5_Model[0][1].addShapeBox(6F, 0F, -6F, 4, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13

		gun_5_Model[0][2].addShapeBox(10F, 0F, -6F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 24

		gun_5_Model[0][3].addShapeBox(-8F, 0F, -10F, 14, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76

		gun_5_Model[0][4].addShapeBox(-8F, 0F, 6F, 14, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80

		gun_5_Model[0][5].addShapeBox(6F, 0F, -10F, 4, 1, 4, 0F,0F, 0F, 0F, -1.75F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82

		gun_5_Model[0][6].addShapeBox(6F, 0F, 6F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, -1.75F, 0F, 0F, 0F); // Box 84

		gun_5_Model[0][7].addShapeBox(5F, -11F, -10F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86

		gun_5_Model[0][8].addShapeBox(5F, -11F, 9F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87

		gun_5_Model[0][9].addShapeBox(9F, -11F, 4F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88

		gun_5_Model[0][10].addShapeBox(9F, -11F, -5F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89

		gun_5_Model[0][11].addShapeBox(1F, -6F, 5F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F); // Box 99

		gun_5_Model[0][12].addShapeBox(4F, -2F, 5F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, -1F, 0F, 0F); // Box 100

		gun_5_Model[0][13].addShapeBox(1F, -6F, -9F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F); // Box 101

		gun_5_Model[0][14].addShapeBox(4F, -2F, -9F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, -1F, 0F, 0F); // Box 102

		gun_5_Model[0][15].addShapeBox(-1F, -9F, 4F, 10, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103

		gun_5_Model[0][16].addShapeBox(-1F, -9F, -5F, 10, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104

		gun_5_Model[0][17].addShapeBox(5F, -3F, -9F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -0.5F, 0F, 0F, -0.5F); // Box 105

		gun_5_Model[0][18].addShapeBox(5F, -3F, -6F, 6, 1, 1, 0F,0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 2F, -0.5F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 106

		gun_5_Model[0][19].addShapeBox(5F, -3F, 8F, 6, 1, 1, 0F,0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 2F, -0.5F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 107

		gun_5_Model[0][20].addShapeBox(5F, -3F, 5F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -0.5F, 0F, 0F, -0.5F); // Box 108

		gun_5_Model[0][21].addShapeBox(-4F, -15F, 9F, 1, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109

		gun_5_Model[0][22].addShapeBox(-8F, -15F, 9F, 1, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110

		gun_5_Model[0][23].addShapeBox(-4F, -15F, -10F, 1, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111

		gun_5_Model[0][24].addShapeBox(-8F, -15F, -10F, 1, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112

		gun_5_Model[0][25].addShapeBox(8F, -14F, 4F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 116

		gun_5_Model[0][26].addShapeBox(6F, -17F, 4F, 1, 3, 1, 0F,-1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 117

		gun_5_Model[0][27].addShapeBox(3F, -18F, 4F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 118

		gun_5_Model[0][28].addShapeBox(-3F, -19F, 4F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 119

		gun_5_Model[0][29].addShapeBox(-8F, -19F, 4F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120

		gun_5_Model[0][30].addShapeBox(8F, -14F, -5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 121

		gun_5_Model[0][31].addShapeBox(6F, -17F, -5F, 1, 3, 1, 0F,-1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 122

		gun_5_Model[0][32].addShapeBox(3F, -18F, -5F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 123

		gun_5_Model[0][33].addShapeBox(-3F, -19F, -5F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 124

		gun_5_Model[0][34].addShapeBox(-8F, -19F, -5F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125

		gun_5_Model[0][35].addShapeBox(2F, -15F, -10F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 126

		gun_5_Model[0][36].addShapeBox(-3F, -15F, -10F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127

		gun_5_Model[0][37].addShapeBox(3F, -14F, -10F, 1, 3, 1, 0F,-1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 128

		gun_5_Model[0][38].addShapeBox(-7F, -6F, -10F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129

		gun_5_Model[0][39].addShapeBox(-7F, -6F, 9F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130

		gun_5_Model[0][40].addShapeBox(2F, -15F, 9F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 131

		gun_5_Model[0][41].addShapeBox(-3F, -15F, 9F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132

		gun_5_Model[0][42].addShapeBox(3F, -14F, 9F, 1, 3, 1, 0F,-1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 133

		gun_5_Model[0][43].addShapeBox(-8F, -17F, 9F, 5, 2, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134

		gun_5_Model[0][44].addShapeBox(-7F, -15F, 9F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135

		gun_5_Model[0][45].addShapeBox(-8F, -19F, 8F, 5, 2, 1, 0F,0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136

		gun_5_Model[0][46].addShapeBox(-8F, -19F, 5F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137

		gun_5_Model[0][47].addShapeBox(-8F, -19F, -7F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138

		gun_5_Model[0][48].addShapeBox(-8F, -17F, -10F, 5, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139

		gun_5_Model[0][49].addShapeBox(-7F, -15F, -10F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140

		gun_5_Model[0][50].addShapeBox(-8F, -19F, -9F, 5, 2, 1, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141

		gun_5_Model[0][51].addShapeBox(-8F, -19F, -4F, 5, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142

		gun_5_Model[0][52].addShapeBox(9F, -11F, -4F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143

		gun_5_Model[0][53].addShapeBox(8F, -11F, -1F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_5_Model[0])
		{
			gunPart.setRotationPoint(232F, -58F, 0F);
		}


		gun_5_Model[1] = new ModelRendererTurbo[2];
		gun_5_Model[1][0] = new ModelRendererTurbo(this, 297, 981, textureX, textureY); // Box 96
		gun_5_Model[1][1] = new ModelRendererTurbo(this, 569, 981, textureX, textureY); // Box 113

		gun_5_Model[1][0].addShapeBox(6F, -9F, 6F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96

		gun_5_Model[1][1].addShapeBox(6F, -9F, -7F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_5_Model[1])
		{
			gunPart.setRotationPoint(232F, -58F, 0F);
		}


		gun_5_Model[2] = new ModelRendererTurbo[8];
		gun_5_Model[2][0] = new ModelRendererTurbo(this, 225, 981, textureX, textureY); // Box 90
		gun_5_Model[2][1] = new ModelRendererTurbo(this, 1, 981, textureX, textureY); // Box 91
		gun_5_Model[2][2] = new ModelRendererTurbo(this, 241, 981, textureX, textureY); // Box 92
		gun_5_Model[2][3] = new ModelRendererTurbo(this, 257, 981, textureX, textureY); // Box 93
		gun_5_Model[2][4] = new ModelRendererTurbo(this, 273, 981, textureX, textureY); // Box 94
		gun_5_Model[2][5] = new ModelRendererTurbo(this, 289, 981, textureX, textureY); // Box 95
		gun_5_Model[2][6] = new ModelRendererTurbo(this, 329, 981, textureX, textureY); // Box 97
		gun_5_Model[2][7] = new ModelRendererTurbo(this, 345, 981, textureX, textureY); // Box 98

		gun_5_Model[2][0].addShapeBox(2F, -11F, -8F, 3, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90

		gun_5_Model[2][1].addShapeBox(5F, -11F, -8F, 1, 5, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 91

		gun_5_Model[2][2].addShapeBox(1F, -11F, -8F, 1, 5, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 92

		gun_5_Model[2][3].addShapeBox(2F, -11F, 5F, 3, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93

		gun_5_Model[2][4].addShapeBox(5F, -11F, 5F, 1, 5, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 94

		gun_5_Model[2][5].addShapeBox(1F, -11F, 5F, 1, 5, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 95

		gun_5_Model[2][6].addShapeBox(2F, -10F, 8F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97

		gun_5_Model[2][7].addShapeBox(2F, -10F, -9F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_5_Model[2])
		{
			gunPart.setRotationPoint(232F, -58F, 0F);
		}


		registerGunModel("TailGun", gun_5_Model);

		// Passenger 9
		ModelRendererTurbo[][] gun_6_Model = new ModelRendererTurbo[3][];

		gun_6_Model[0] = new ModelRendererTurbo[0];

		gun_6_Model[1] = new ModelRendererTurbo[25];
		gun_6_Model[1][0] = new ModelRendererTurbo(this, 1730, 909, textureX, textureY); // MG 1
		gun_6_Model[1][1] = new ModelRendererTurbo(this, 1730, 902, textureX, textureY); // MG 2
		gun_6_Model[1][2] = new ModelRendererTurbo(this, 1730, 921, textureX, textureY); // MG 3
		gun_6_Model[1][3] = new ModelRendererTurbo(this, 1730, 927, textureX, textureY); // MG 4
		gun_6_Model[1][4] = new ModelRendererTurbo(this, 1739, 927, textureX, textureY); // MG 5
		gun_6_Model[1][5] = new ModelRendererTurbo(this, 1730, 931, textureX, textureY); // MG 6
		gun_6_Model[1][6] = new ModelRendererTurbo(this, 1730, 934, textureX, textureY); // MG 7
		gun_6_Model[1][7] = new ModelRendererTurbo(this, 1735, 934, textureX, textureY); // MG 8
		gun_6_Model[1][8] = new ModelRendererTurbo(this, 1741, 931, textureX, textureY); // MG 9
		gun_6_Model[1][9] = new ModelRendererTurbo(this, 1746, 931, textureX, textureY); // MG 10
		gun_6_Model[1][10] = new ModelRendererTurbo(this, 1730, 938, textureX, textureY); // MG 11
		gun_6_Model[1][11] = new ModelRendererTurbo(this, 1742, 935, textureX, textureY); // MG 12
		gun_6_Model[1][12] = new ModelRendererTurbo(this, 1755, 921, textureX, textureY); // B1
		gun_6_Model[1][13] = new ModelRendererTurbo(this, 1755, 924, textureX, textureY); // B2
		gun_6_Model[1][14] = new ModelRendererTurbo(this, 1754, 927, textureX, textureY); // G1
		gun_6_Model[1][15] = new ModelRendererTurbo(this, 1754, 930, textureX, textureY); // G2
		gun_6_Model[1][16] = new ModelRendererTurbo(this, 1754, 934, textureX, textureY); // G3
		gun_6_Model[1][17] = new ModelRendererTurbo(this, 1761, 927, textureX, textureY); // G4
		gun_6_Model[1][18] = new ModelRendererTurbo(this, 1761, 930, textureX, textureY); // G5
		gun_6_Model[1][19] = new ModelRendererTurbo(this, 1761, 934, textureX, textureY); // G6
		gun_6_Model[1][20] = new ModelRendererTurbo(this, 1730, 912, textureX, textureY); // Ammo 1
		gun_6_Model[1][21] = new ModelRendererTurbo(this, 1743, 912, textureX, textureY); // Ammo 2
		gun_6_Model[1][22] = new ModelRendererTurbo(this, 1755, 921, textureX, textureY); // B1 Inner
		gun_6_Model[1][23] = new ModelRendererTurbo(this, 1755, 924, textureX, textureY); // B2 Inner
		gun_6_Model[1][24] = new ModelRendererTurbo(this, 1730, 902, textureX, textureY); // MG 2 Inner

		gun_6_Model[1][0].addShapeBox(7.5F, -1.5F, -0.5F, 11, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // MG 1

		gun_6_Model[1][1].addShapeBox(-5.5F, -2.5F, -1.5F, 13, 3, 3, 0F,0F, -0.5F, -0.5F, 0F, -0.85F, -0.85F, 0F, -0.85F, -0.85F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.85F, -0.85F, 0F, -0.85F, -0.85F, 0F, -0.5F, -0.5F); // MG 2

		gun_6_Model[1][2].addBox(-8.5F, -2.5F, -1F, 10, 3, 2, 0F); // MG 3

		gun_6_Model[1][3].addBox(-3F, -2F, 0.2F, 3, 2, 1, 0F); // MG 4

		gun_6_Model[1][4].addBox(-7.5F, -1.5F, -1.1F, 6, 1, 1, 0F); // MG 5

		gun_6_Model[1][5].addTrapezoid(-9.2F, -1.5F, -0.5F, 4, 1, 1, 0F, -0.20F, ModelRendererTurbo.MR_RIGHT); // MG 6

		gun_6_Model[1][6].addShapeBox(-2.5F, -2.5F, -1.3F, 1, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, -0.5F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // MG 7

		gun_6_Model[1][7].addShapeBox(-2.5F, -2.5F, -3.3F, 1, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // MG 8

		gun_6_Model[1][8].addShapeBox(0.4F, -3.5F, -0.5F, 1, 2, 1, 0F,-0.4F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // MG 9

		gun_6_Model[1][9].addShapeBox(-7.6F, -3.5F, -0.5F, 2, 2, 1, 0F,-0.6F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.6F, -0.4F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // MG 10

		gun_6_Model[1][10].addBox(1.5F, -1.5F, -0.5F, 7, 1, 1, 0F); // MG 11

		gun_6_Model[1][11].addBox(18.5F, -1.5F, -0.5F, 1, 1, 1, 0F); // MG 12

		gun_6_Model[1][12].addShapeBox(7.5F, -0.8F, -0.5F, 1, 1, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // B1

		gun_6_Model[1][13].addShapeBox(6.5F, 0.2F, -0.5F, 3, 1, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // B2

		gun_6_Model[1][14].addShapeBox(-10F, -3F, 0.5F, 2, 1, 1, 0F,0F, -0.6F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, -0.4999F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, -0.4999F, 0F, 0F, 0F); // G1

		gun_6_Model[1][15].addShapeBox(-10F, -2F, 0.5F, 1, 2, 1, 0F,0F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, 0F, 0F, 0F, 0F); // G2

		gun_6_Model[1][16].addShapeBox(-10F, 0F, 0.5F, 2, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, -0.4999F, 0F, 0F, 0F, 0F, -0.6F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, -0.4999F, 0F, -0.6F, 0F); // G3

		gun_6_Model[1][17].addShapeBox(-10F, -3F, -1.5F, 2, 1, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, -0.4999F, 0F, -0.6F, 0F, 0F, -0.6F, -0.4F, 0F, 0F, 0F, 0F, 0F, -0.4999F, 0F, 0F, 0F, 0F, 0F, -0.4F); // G4

		gun_6_Model[1][18].addShapeBox(-10F, -2F, -1.5F, 1, 2, 1, 0F,0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.4F, 0F, 0F, -0.4F); // G5

		gun_6_Model[1][19].addShapeBox(-10F, 0F, -1.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.4999F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, -0.4999F, 0F, -0.6F, 0F, 0F, -0.6F, -0.4F); // G6

		gun_6_Model[1][20].addBox(-2.5F, -0.5F, 1F, 2, 4, 4, 0F); // Ammo 1

		gun_6_Model[1][21].addShapeBox(-2.5F, -2F, 0.6F, 2, 1, 3, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, 0F); // Ammo 2

		gun_6_Model[1][22].addShapeBox(7.5F, -0.8F, -0.5F, 1, 1, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // B1 Inner

		gun_6_Model[1][23].addShapeBox(6.5F, 0.2F, -0.5F, 3, 1, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // B2 Inner

		gun_6_Model[1][24].addShapeBox(-5.5F, -2.5F, -1.5F, 13, 3, 3, 0F,0F, -0.5F, -0.5F, 0F, -0.85F, -0.85F, 0F, -0.85F, -0.85F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.85F, -0.85F, 0F, -0.85F, -0.85F, 0F, -0.5F, -0.5F); // MG 2 Inner

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_6_Model[1])
		{
			gunPart.setRotationPoint(109F, -55.5F, -19F);
		}


		gun_6_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("LeftWaistGun", gun_6_Model);

		// Passenger 10
		ModelRendererTurbo[][] gun_7_Model = new ModelRendererTurbo[3][];

		gun_7_Model[0] = new ModelRendererTurbo[0];

		gun_7_Model[1] = new ModelRendererTurbo[25];
		gun_7_Model[1][0] = new ModelRendererTurbo(this, 1730, 909, textureX, textureY); // MG 1
		gun_7_Model[1][1] = new ModelRendererTurbo(this, 1730, 902, textureX, textureY); // MG 2
		gun_7_Model[1][2] = new ModelRendererTurbo(this, 1730, 921, textureX, textureY); // MG 3
		gun_7_Model[1][3] = new ModelRendererTurbo(this, 1730, 927, textureX, textureY); // MG 4
		gun_7_Model[1][4] = new ModelRendererTurbo(this, 1739, 927, textureX, textureY); // MG 5
		gun_7_Model[1][5] = new ModelRendererTurbo(this, 1730, 931, textureX, textureY); // MG 6
		gun_7_Model[1][6] = new ModelRendererTurbo(this, 1730, 934, textureX, textureY); // MG 7
		gun_7_Model[1][7] = new ModelRendererTurbo(this, 1735, 934, textureX, textureY); // MG 8
		gun_7_Model[1][8] = new ModelRendererTurbo(this, 1741, 931, textureX, textureY); // MG 9
		gun_7_Model[1][9] = new ModelRendererTurbo(this, 1746, 931, textureX, textureY); // MG 10
		gun_7_Model[1][10] = new ModelRendererTurbo(this, 1730, 938, textureX, textureY); // MG 11
		gun_7_Model[1][11] = new ModelRendererTurbo(this, 1742, 935, textureX, textureY); // MG 12
		gun_7_Model[1][12] = new ModelRendererTurbo(this, 1755, 921, textureX, textureY); // B1
		gun_7_Model[1][13] = new ModelRendererTurbo(this, 1755, 924, textureX, textureY); // B2
		gun_7_Model[1][14] = new ModelRendererTurbo(this, 1754, 927, textureX, textureY); // G1
		gun_7_Model[1][15] = new ModelRendererTurbo(this, 1754, 930, textureX, textureY); // G2
		gun_7_Model[1][16] = new ModelRendererTurbo(this, 1754, 934, textureX, textureY); // G3
		gun_7_Model[1][17] = new ModelRendererTurbo(this, 1761, 927, textureX, textureY); // G4
		gun_7_Model[1][18] = new ModelRendererTurbo(this, 1761, 930, textureX, textureY); // G5
		gun_7_Model[1][19] = new ModelRendererTurbo(this, 1761, 934, textureX, textureY); // G6
		gun_7_Model[1][20] = new ModelRendererTurbo(this, 1730, 912, textureX, textureY); // Ammo 1
		gun_7_Model[1][21] = new ModelRendererTurbo(this, 1743, 912, textureX, textureY); // Ammo 2
		gun_7_Model[1][22] = new ModelRendererTurbo(this, 1755, 921, textureX, textureY); // B1 Inner
		gun_7_Model[1][23] = new ModelRendererTurbo(this, 1755, 924, textureX, textureY); // B2 Inner
		gun_7_Model[1][24] = new ModelRendererTurbo(this, 1730, 902, textureX, textureY); // MG 2 Inner

		gun_7_Model[1][0].addShapeBox(7.5F, -1.5F, -0.5F, 11, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // MG 1

		gun_7_Model[1][1].addShapeBox(-5.5F, -2.5F, -1.5F, 13, 3, 3, 0F,0F, -0.5F, -0.5F, 0F, -0.85F, -0.85F, 0F, -0.85F, -0.85F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.85F, -0.85F, 0F, -0.85F, -0.85F, 0F, -0.5F, -0.5F); // MG 2

		gun_7_Model[1][2].addBox(-8.5F, -2.5F, -1F, 10, 3, 2, 0F); // MG 3

		gun_7_Model[1][3].addBox(-3F, -2F, 0.2F, 3, 2, 1, 0F); // MG 4

		gun_7_Model[1][4].addBox(-7.5F, -1.5F, -1.1F, 6, 1, 1, 0F); // MG 5

		gun_7_Model[1][5].addTrapezoid(-9.2F, -1.5F, -0.5F, 4, 1, 1, 0F, -0.20F, ModelRendererTurbo.MR_RIGHT); // MG 6

		gun_7_Model[1][6].addShapeBox(-2.5F, -2.5F, -1.3F, 1, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, -0.5F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // MG 7

		gun_7_Model[1][7].addShapeBox(-2.5F, -2.5F, -3.3F, 1, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // MG 8

		gun_7_Model[1][8].addShapeBox(0.4F, -3.5F, -0.5F, 1, 2, 1, 0F,-0.4F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // MG 9

		gun_7_Model[1][9].addShapeBox(-7.6F, -3.5F, -0.5F, 2, 2, 1, 0F,-0.6F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.6F, -0.4F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // MG 10

		gun_7_Model[1][10].addBox(1.5F, -1.5F, -0.5F, 7, 1, 1, 0F); // MG 11

		gun_7_Model[1][11].addBox(18.5F, -1.5F, -0.5F, 1, 1, 1, 0F); // MG 12

		gun_7_Model[1][12].addShapeBox(7.5F, -0.8F, -0.5F, 1, 1, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // B1

		gun_7_Model[1][13].addShapeBox(6.5F, 0.2F, -0.5F, 3, 1, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // B2

		gun_7_Model[1][14].addShapeBox(-10F, -3F, 0.5F, 2, 1, 1, 0F,0F, -0.6F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, -0.4999F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, -0.4999F, 0F, 0F, 0F); // G1

		gun_7_Model[1][15].addShapeBox(-10F, -2F, 0.5F, 1, 2, 1, 0F,0F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, 0F, 0F, 0F, 0F); // G2

		gun_7_Model[1][16].addShapeBox(-10F, 0F, 0.5F, 2, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, -0.4999F, 0F, 0F, 0F, 0F, -0.6F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, -0.4999F, 0F, -0.6F, 0F); // G3

		gun_7_Model[1][17].addShapeBox(-10F, -3F, -1.5F, 2, 1, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, -0.4999F, 0F, -0.6F, 0F, 0F, -0.6F, -0.4F, 0F, 0F, 0F, 0F, 0F, -0.4999F, 0F, 0F, 0F, 0F, 0F, -0.4F); // G4

		gun_7_Model[1][18].addShapeBox(-10F, -2F, -1.5F, 1, 2, 1, 0F,0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.4F, 0F, 0F, -0.4F); // G5

		gun_7_Model[1][19].addShapeBox(-10F, 0F, -1.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.4999F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, -0.4999F, 0F, -0.6F, 0F, 0F, -0.6F, -0.4F); // G6

		gun_7_Model[1][20].addBox(-2.5F, -0.5F, 1F, 2, 4, 4, 0F); // Ammo 1

		gun_7_Model[1][21].addShapeBox(-2.5F, -2F, 0.6F, 2, 1, 3, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, 0F); // Ammo 2

		gun_7_Model[1][22].addShapeBox(7.5F, -0.8F, -0.5F, 1, 1, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // B1 Inner

		gun_7_Model[1][23].addShapeBox(6.5F, 0.2F, -0.5F, 3, 1, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // B2 Inner

		gun_7_Model[1][24].addShapeBox(-5.5F, -2.5F, -1.5F, 13, 3, 3, 0F,0F, -0.5F, -0.5F, 0F, -0.85F, -0.85F, 0F, -0.85F, -0.85F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.85F, -0.85F, 0F, -0.85F, -0.85F, 0F, -0.5F, -0.5F); // MG 2 Inner

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_7_Model[1])
		{
			gunPart.setRotationPoint(109F, -55.5F, 19F);
		}


		gun_7_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("RightWaistGun", gun_7_Model);
	}
}