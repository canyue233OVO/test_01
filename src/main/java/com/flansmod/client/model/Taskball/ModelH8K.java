//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: H8K
// Model Creator: 
// Created on: 22.05.2023 - 23:49:09
// Last changed on: 22.05.2023 - 23:49:09

package com.flansmod.client.model.Taskball; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelH8K extends ModelPlane //Same as Filename
{
	int textureX = 2048;
	int textureY = 2048;

	public ModelH8K() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[351];
		tailModel = new ModelRendererTurbo[8];
		leftWingModel = new ModelRendererTurbo[22];
		rightWingModel = new ModelRendererTurbo[22];

		initbodyModel_1();
		inittailModel_1();
		initleftWingModel_1();
		initrightWingModel_1();

		initPropeller();

		initGuns();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 537, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 673, 1, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 793, 1, textureX, textureY); // Box 7
		bodyModel[7] = new ModelRendererTurbo(this, 841, 1, textureX, textureY); // Box 8
		bodyModel[8] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 9
		bodyModel[9] = new ModelRendererTurbo(this, 1153, 1, textureX, textureY); // Box 10
		bodyModel[10] = new ModelRendererTurbo(this, 1305, 1, textureX, textureY); // Box 11
		bodyModel[11] = new ModelRendererTurbo(this, 1505, 1, textureX, textureY); // Box 12
		bodyModel[12] = new ModelRendererTurbo(this, 1617, 1, textureX, textureY); // Box 13
		bodyModel[13] = new ModelRendererTurbo(this, 1689, 1, textureX, textureY); // Box 14
		bodyModel[14] = new ModelRendererTurbo(this, 1905, 1, textureX, textureY); // Box 15
		bodyModel[15] = new ModelRendererTurbo(this, 1489, 33, textureX, textureY); // Box 16
		bodyModel[16] = new ModelRendererTurbo(this, 993, 41, textureX, textureY); // Box 18
		bodyModel[17] = new ModelRendererTurbo(this, 1113, 41, textureX, textureY); // Box 19
		bodyModel[18] = new ModelRendererTurbo(this, 1281, 41, textureX, textureY); // Box 20
		bodyModel[19] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Box 21
		bodyModel[20] = new ModelRendererTurbo(this, 681, 57, textureX, textureY); // Box 22
		bodyModel[21] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 23
		bodyModel[22] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Box 24
		bodyModel[23] = new ModelRendererTurbo(this, 1585, 33, textureX, textureY); // Box 25
		bodyModel[24] = new ModelRendererTurbo(this, 857, 65, textureX, textureY); // Box 26
		bodyModel[25] = new ModelRendererTurbo(this, 1585, 81, textureX, textureY); // Box 27
		bodyModel[26] = new ModelRendererTurbo(this, 1881, 65, textureX, textureY); // Box 28
		bodyModel[27] = new ModelRendererTurbo(this, 377, 89, textureX, textureY); // Box 29
		bodyModel[28] = new ModelRendererTurbo(this, 857, 97, textureX, textureY); // Box 30
		bodyModel[29] = new ModelRendererTurbo(this, 1761, 97, textureX, textureY); // Box 31
		bodyModel[30] = new ModelRendererTurbo(this, 1433, 89, textureX, textureY); // Box 32
		bodyModel[31] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 33
		bodyModel[32] = new ModelRendererTurbo(this, 233, 113, textureX, textureY); // Box 34
		bodyModel[33] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 35
		bodyModel[34] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 36
		bodyModel[35] = new ModelRendererTurbo(this, 1409, 113, textureX, textureY); // Box 37
		bodyModel[36] = new ModelRendererTurbo(this, 1977, 105, textureX, textureY); // Box 38
		bodyModel[37] = new ModelRendererTurbo(this, 1569, 113, textureX, textureY); // Box 39
		bodyModel[38] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 40
		bodyModel[39] = new ModelRendererTurbo(this, 1249, 41, textureX, textureY); // Box 41
		bodyModel[40] = new ModelRendererTurbo(this, 393, 65, textureX, textureY); // Box 42
		bodyModel[41] = new ModelRendererTurbo(this, 1641, 113, textureX, textureY); // Box 43
		bodyModel[42] = new ModelRendererTurbo(this, 1097, 121, textureX, textureY); // Box 44
		bodyModel[43] = new ModelRendererTurbo(this, 369, 121, textureX, textureY); // Box 45
		bodyModel[44] = new ModelRendererTurbo(this, 1401, 41, textureX, textureY); // Box 46
		bodyModel[45] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 47
		bodyModel[46] = new ModelRendererTurbo(this, 1265, 121, textureX, textureY); // Box 48
		bodyModel[47] = new ModelRendererTurbo(this, 481, 129, textureX, textureY); // Box 49
		bodyModel[48] = new ModelRendererTurbo(this, 1569, 129, textureX, textureY); // Box 50
		bodyModel[49] = new ModelRendererTurbo(this, 1073, 137, textureX, textureY); // Box 51
		bodyModel[50] = new ModelRendererTurbo(this, 585, 137, textureX, textureY); // Box 58
		bodyModel[51] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 59
		bodyModel[52] = new ModelRendererTurbo(this, 1017, 145, textureX, textureY); // Box 60
		bodyModel[53] = new ModelRendererTurbo(this, 1865, 129, textureX, textureY); // Box 61
		bodyModel[54] = new ModelRendererTurbo(this, 1609, 57, textureX, textureY); // Box 63
		bodyModel[55] = new ModelRendererTurbo(this, 649, 57, textureX, textureY); // Box 64
		bodyModel[56] = new ModelRendererTurbo(this, 337, 145, textureX, textureY); // Box 66
		bodyModel[57] = new ModelRendererTurbo(this, 801, 145, textureX, textureY); // Box 67
		bodyModel[58] = new ModelRendererTurbo(this, 985, 1, textureX, textureY); // Box 69
		bodyModel[59] = new ModelRendererTurbo(this, 649, 1, textureX, textureY); // Box 70
		bodyModel[60] = new ModelRendererTurbo(this, 769, 1, textureX, textureY); // Box 72
		bodyModel[61] = new ModelRendererTurbo(this, 1281, 1, textureX, textureY); // Box 73
		bodyModel[62] = new ModelRendererTurbo(this, 1729, 137, textureX, textureY); // Box 74
		bodyModel[63] = new ModelRendererTurbo(this, 2025, 65, textureX, textureY); // Box 75
		bodyModel[64] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 76
		bodyModel[65] = new ModelRendererTurbo(this, 1761, 81, textureX, textureY); // Box 77
		bodyModel[66] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 78
		bodyModel[67] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 79
		bodyModel[68] = new ModelRendererTurbo(this, 537, 1, textureX, textureY); // Box 80
		bodyModel[69] = new ModelRendererTurbo(this, 665, 1, textureX, textureY); // Box 81
		bodyModel[70] = new ModelRendererTurbo(this, 681, 1, textureX, textureY); // Box 82
		bodyModel[71] = new ModelRendererTurbo(this, 545, 1, textureX, textureY); // Box 83
		bodyModel[72] = new ModelRendererTurbo(this, 841, 1, textureX, textureY); // Box 84
		bodyModel[73] = new ModelRendererTurbo(this, 1481, 1, textureX, textureY); // Box 85
		bodyModel[74] = new ModelRendererTurbo(this, 1873, 1, textureX, textureY); // Box 86
		bodyModel[75] = new ModelRendererTurbo(this, 1905, 1, textureX, textureY); // Box 87
		bodyModel[76] = new ModelRendererTurbo(this, 2017, 1, textureX, textureY); // Box 88
		bodyModel[77] = new ModelRendererTurbo(this, 1481, 9, textureX, textureY); // Box 89
		bodyModel[78] = new ModelRendererTurbo(this, 833, 1, textureX, textureY); // Box 90
		bodyModel[79] = new ModelRendererTurbo(this, 1873, 9, textureX, textureY); // Box 91
		bodyModel[80] = new ModelRendererTurbo(this, 2017, 9, textureX, textureY); // Box 93
		bodyModel[81] = new ModelRendererTurbo(this, 841, 17, textureX, textureY); // Box 94
		bodyModel[82] = new ModelRendererTurbo(this, 1281, 17, textureX, textureY); // Box 95
		bodyModel[83] = new ModelRendererTurbo(this, 849, 1, textureX, textureY); // Box 96
		bodyModel[84] = new ModelRendererTurbo(this, 1513, 1, textureX, textureY); // Box 97
		bodyModel[85] = new ModelRendererTurbo(this, 769, 9, textureX, textureY); // Box 98
		bodyModel[86] = new ModelRendererTurbo(this, 1617, 1, textureX, textureY); // Box 99
		bodyModel[87] = new ModelRendererTurbo(this, 1905, 9, textureX, textureY); // Box 100
		bodyModel[88] = new ModelRendererTurbo(this, 785, 41, textureX, textureY); // Box 101
		bodyModel[89] = new ModelRendererTurbo(this, 1713, 1, textureX, textureY); // Box 102
		bodyModel[90] = new ModelRendererTurbo(this, 2041, 1, textureX, textureY); // Box 103
		bodyModel[91] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 104
		bodyModel[92] = new ModelRendererTurbo(this, 1161, 145, textureX, textureY); // Box 105
		bodyModel[93] = new ModelRendererTurbo(this, 1449, 145, textureX, textureY); // Box 316
		bodyModel[94] = new ModelRendererTurbo(this, 1545, 153, textureX, textureY); // Box 317
		bodyModel[95] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 318
		bodyModel[96] = new ModelRendererTurbo(this, 65, 169, textureX, textureY); // Box 319
		bodyModel[97] = new ModelRendererTurbo(this, 577, 161, textureX, textureY); // Box 320
		bodyModel[98] = new ModelRendererTurbo(this, 1609, 169, textureX, textureY); // Box 321
		bodyModel[99] = new ModelRendererTurbo(this, 1825, 161, textureX, textureY); // Box 322
		bodyModel[100] = new ModelRendererTurbo(this, 497, 185, textureX, textureY); // Box 323
		bodyModel[101] = new ModelRendererTurbo(this, 1489, 193, textureX, textureY); // Box 324
		bodyModel[102] = new ModelRendererTurbo(this, 1689, 185, textureX, textureY); // Box 325
		bodyModel[103] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 326
		bodyModel[104] = new ModelRendererTurbo(this, 857, 201, textureX, textureY); // Box 327
		bodyModel[105] = new ModelRendererTurbo(this, 1089, 41, textureX, textureY); // Box 328
		bodyModel[106] = new ModelRendererTurbo(this, 825, 65, textureX, textureY); // Box 329
		bodyModel[107] = new ModelRendererTurbo(this, 1545, 113, textureX, textureY); // Box 330
		bodyModel[108] = new ModelRendererTurbo(this, 1825, 209, textureX, textureY); // Box 121
		bodyModel[109] = new ModelRendererTurbo(this, 577, 209, textureX, textureY); // Box 122
		bodyModel[110] = new ModelRendererTurbo(this, 1953, 209, textureX, textureY); // Box 123
		bodyModel[111] = new ModelRendererTurbo(this, 57, 217, textureX, textureY); // Box 124
		bodyModel[112] = new ModelRendererTurbo(this, 1017, 225, textureX, textureY); // Box 125
		bodyModel[113] = new ModelRendererTurbo(this, 1609, 217, textureX, textureY); // Box 126
		bodyModel[114] = new ModelRendererTurbo(this, 1169, 225, textureX, textureY); // Box 127
		bodyModel[115] = new ModelRendererTurbo(this, 337, 225, textureX, textureY); // Box 128
		bodyModel[116] = new ModelRendererTurbo(this, 497, 225, textureX, textureY); // Box 129
		bodyModel[117] = new ModelRendererTurbo(this, 1329, 225, textureX, textureY); // Box 130
		bodyModel[118] = new ModelRendererTurbo(this, 801, 225, textureX, textureY); // Box 131
		bodyModel[119] = new ModelRendererTurbo(this, 129, 233, textureX, textureY); // Box 132
		bodyModel[120] = new ModelRendererTurbo(this, 1689, 233, textureX, textureY); // Box 133
		bodyModel[121] = new ModelRendererTurbo(this, 1977, 137, textureX, textureY); // Box 134
		bodyModel[122] = new ModelRendererTurbo(this, 433, 145, textureX, textureY); // Box 135
		bodyModel[123] = new ModelRendererTurbo(this, 889, 145, textureX, textureY); // Box 136
		bodyModel[124] = new ModelRendererTurbo(this, 1481, 241, textureX, textureY); // Box 137
		bodyModel[125] = new ModelRendererTurbo(this, 1017, 145, textureX, textureY); // Box 160
		bodyModel[126] = new ModelRendererTurbo(this, 1521, 145, textureX, textureY); // Box 187
		bodyModel[127] = new ModelRendererTurbo(this, 1097, 97, textureX, textureY); // Box 188
		bodyModel[128] = new ModelRendererTurbo(this, 665, 153, textureX, textureY); // Box 164
		bodyModel[129] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 165
		bodyModel[130] = new ModelRendererTurbo(this, 41, 297, textureX, textureY); // Box 166
		bodyModel[131] = new ModelRendererTurbo(this, 193, 297, textureX, textureY); // Box 167
		bodyModel[132] = new ModelRendererTurbo(this, 329, 353, textureX, textureY); // Box 168
		bodyModel[133] = new ModelRendererTurbo(this, 1825, 281, textureX, textureY); // Box 169
		bodyModel[134] = new ModelRendererTurbo(this, 1649, 281, textureX, textureY); // Box 170
		bodyModel[135] = new ModelRendererTurbo(this, 1977, 161, textureX, textureY); // Box 171
		bodyModel[136] = new ModelRendererTurbo(this, 545, 353, textureX, textureY); // Box 172
		bodyModel[137] = new ModelRendererTurbo(this, 361, 297, textureX, textureY); // Box 173
		bodyModel[138] = new ModelRendererTurbo(this, 1001, 305, textureX, textureY); // Box 174
		bodyModel[139] = new ModelRendererTurbo(this, 1329, 305, textureX, textureY); // Box 175
		bodyModel[140] = new ModelRendererTurbo(this, 721, 353, textureX, textureY); // Box 176
		bodyModel[141] = new ModelRendererTurbo(this, 1937, 281, textureX, textureY); // Box 177
		bodyModel[142] = new ModelRendererTurbo(this, 857, 353, textureX, textureY); // Box 178
		bodyModel[143] = new ModelRendererTurbo(this, 1505, 353, textureX, textureY); // Box 179
		bodyModel[144] = new ModelRendererTurbo(this, 1641, 353, textureX, textureY); // Box 180
		bodyModel[145] = new ModelRendererTurbo(this, 1761, 353, textureX, textureY); // Box 181
		bodyModel[146] = new ModelRendererTurbo(this, 1881, 353, textureX, textureY); // Box 182
		bodyModel[147] = new ModelRendererTurbo(this, 1, 361, textureX, textureY); // Box 183
		bodyModel[148] = new ModelRendererTurbo(this, 153, 361, textureX, textureY); // Box 184
		bodyModel[149] = new ModelRendererTurbo(this, 1073, 361, textureX, textureY); // Box 185
		bodyModel[150] = new ModelRendererTurbo(this, 1249, 361, textureX, textureY); // Box 186
		bodyModel[151] = new ModelRendererTurbo(this, 1249, 409, textureX, textureY); // Box 187
		bodyModel[152] = new ModelRendererTurbo(this, 1537, 289, textureX, textureY); // Box 188
		bodyModel[153] = new ModelRendererTurbo(this, 801, 305, textureX, textureY); // Box 189
		bodyModel[154] = new ModelRendererTurbo(this, 1625, 409, textureX, textureY); // Box 190
		bodyModel[155] = new ModelRendererTurbo(this, 697, 393, textureX, textureY); // Box 191
		bodyModel[156] = new ModelRendererTurbo(this, 1153, 305, textureX, textureY); // Box 192
		bodyModel[157] = new ModelRendererTurbo(this, 313, 417, textureX, textureY); // Box 193
		bodyModel[158] = new ModelRendererTurbo(this, 553, 425, textureX, textureY); // Box 194
		bodyModel[159] = new ModelRendererTurbo(this, 497, 313, textureX, textureY); // Box 195
		bodyModel[160] = new ModelRendererTurbo(this, 1401, 425, textureX, textureY); // Box 196
		bodyModel[161] = new ModelRendererTurbo(this, 793, 433, textureX, textureY); // Box 197
		bodyModel[162] = new ModelRendererTurbo(this, 1017, 185, textureX, textureY); // Box 198
		bodyModel[163] = new ModelRendererTurbo(this, 1449, 145, textureX, textureY); // Box 199
		bodyModel[164] = new ModelRendererTurbo(this, 921, 433, textureX, textureY); // Box 200
		bodyModel[165] = new ModelRendererTurbo(this, 1825, 417, textureX, textureY); // Box 201
		bodyModel[166] = new ModelRendererTurbo(this, 1081, 433, textureX, textureY); // Box 202
		bodyModel[167] = new ModelRendererTurbo(this, 433, 169, textureX, textureY); // Box 203
		bodyModel[168] = new ModelRendererTurbo(this, 417, 209, textureX, textureY); // Box 204
		bodyModel[169] = new ModelRendererTurbo(this, 1529, 313, textureX, textureY); // Box 205
		bodyModel[170] = new ModelRendererTurbo(this, 1881, 433, textureX, textureY); // Box 206
		bodyModel[171] = new ModelRendererTurbo(this, 1, 441, textureX, textureY); // Box 207
		bodyModel[172] = new ModelRendererTurbo(this, 913, 305, textureX, textureY); // Box 208
		bodyModel[173] = new ModelRendererTurbo(this, 497, 169, textureX, textureY); // Box 209
		bodyModel[174] = new ModelRendererTurbo(this, 1153, 449, textureX, textureY); // Box 210
		bodyModel[175] = new ModelRendererTurbo(this, 1017, 273, textureX, textureY); // Box 211
		bodyModel[176] = new ModelRendererTurbo(this, 1433, 441, textureX, textureY); // Box 212
		bodyModel[177] = new ModelRendererTurbo(this, 1, 441, textureX, textureY); // Box 213
		bodyModel[178] = new ModelRendererTurbo(this, 345, 457, textureX, textureY); // Box 214
		bodyModel[179] = new ModelRendererTurbo(this, 1961, 305, textureX, textureY); // Box 221
		bodyModel[180] = new ModelRendererTurbo(this, 497, 65, textureX, textureY); // Box 222
		bodyModel[181] = new ModelRendererTurbo(this, 1793, 457, textureX, textureY); // Box 223
		bodyModel[182] = new ModelRendererTurbo(this, 1, 465, textureX, textureY); // Box 224
		bodyModel[183] = new ModelRendererTurbo(this, 761, 457, textureX, textureY); // Box 226
		bodyModel[184] = new ModelRendererTurbo(this, 1449, 193, textureX, textureY); // Box 227
		bodyModel[185] = new ModelRendererTurbo(this, 449, 465, textureX, textureY); // Box 229
		bodyModel[186] = new ModelRendererTurbo(this, 977, 465, textureX, textureY); // Box 230
		bodyModel[187] = new ModelRendererTurbo(this, 1921, 209, textureX, textureY); // Box 232
		bodyModel[188] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 233
		bodyModel[189] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 235
		bodyModel[190] = new ModelRendererTurbo(this, 1401, 57, textureX, textureY); // Box 236
		bodyModel[191] = new ModelRendererTurbo(this, 185, 161, textureX, textureY); // Box 237
		bodyModel[192] = new ModelRendererTurbo(this, 1745, 177, textureX, textureY); // Box 238
		bodyModel[193] = new ModelRendererTurbo(this, 2041, 25, textureX, textureY); // Box 239
		bodyModel[194] = new ModelRendererTurbo(this, 1761, 89, textureX, textureY); // Box 240
		bodyModel[195] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 241
		bodyModel[196] = new ModelRendererTurbo(this, 673, 9, textureX, textureY); // Box 242
		bodyModel[197] = new ModelRendererTurbo(this, 1513, 9, textureX, textureY); // Box 243
		bodyModel[198] = new ModelRendererTurbo(this, 545, 17, textureX, textureY); // Box 244
		bodyModel[199] = new ModelRendererTurbo(this, 1617, 9, textureX, textureY); // Box 245
		bodyModel[200] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 246
		bodyModel[201] = new ModelRendererTurbo(this, 1305, 17, textureX, textureY); // Box 247
		bodyModel[202] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 248
		bodyModel[203] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 249
		bodyModel[204] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 250
		bodyModel[205] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 251
		bodyModel[206] = new ModelRendererTurbo(this, 801, 41, textureX, textureY); // Box 252
		bodyModel[207] = new ModelRendererTurbo(this, 537, 17, textureX, textureY); // Box 253
		bodyModel[208] = new ModelRendererTurbo(this, 801, 129, textureX, textureY); // Box 254
		bodyModel[209] = new ModelRendererTurbo(this, 1577, 89, textureX, textureY); // Box 255
		bodyModel[210] = new ModelRendererTurbo(this, 1625, 113, textureX, textureY); // Box 256
		bodyModel[211] = new ModelRendererTurbo(this, 985, 25, textureX, textureY); // Box 257
		bodyModel[212] = new ModelRendererTurbo(this, 1121, 41, textureX, textureY); // Box 258
		bodyModel[213] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Box 259
		bodyModel[214] = new ModelRendererTurbo(this, 1121, 57, textureX, textureY); // Box 260
		bodyModel[215] = new ModelRendererTurbo(this, 521, 25, textureX, textureY); // Box 261
		bodyModel[216] = new ModelRendererTurbo(this, 225, 65, textureX, textureY); // Box 262
		bodyModel[217] = new ModelRendererTurbo(this, 385, 65, textureX, textureY); // Box 263
		bodyModel[218] = new ModelRendererTurbo(this, 1673, 25, textureX, textureY); // Box 264
		bodyModel[219] = new ModelRendererTurbo(this, 1681, 25, textureX, textureY); // Box 265
		bodyModel[220] = new ModelRendererTurbo(this, 1585, 33, textureX, textureY); // Box 266
		bodyModel[221] = new ModelRendererTurbo(this, 1937, 457, textureX, textureY); // Box 267
		bodyModel[222] = new ModelRendererTurbo(this, 1065, 473, textureX, textureY); // Box 268
		bodyModel[223] = new ModelRendererTurbo(this, 1161, 473, textureX, textureY); // Box 269
		bodyModel[224] = new ModelRendererTurbo(this, 1257, 473, textureX, textureY); // Box 270
		bodyModel[225] = new ModelRendererTurbo(this, 1489, 481, textureX, textureY); // Box 271
		bodyModel[226] = new ModelRendererTurbo(this, 1753, 481, textureX, textureY); // Box 272
		bodyModel[227] = new ModelRendererTurbo(this, 601, 489, textureX, textureY); // Box 273
		bodyModel[228] = new ModelRendererTurbo(this, 761, 505, textureX, textureY); // Box 274
		bodyModel[229] = new ModelRendererTurbo(this, 1137, 513, textureX, textureY); // Box 275
		bodyModel[230] = new ModelRendererTurbo(this, 1217, 521, textureX, textureY); // Box 276
		bodyModel[231] = new ModelRendererTurbo(this, 113, 465, textureX, textureY); // Box 277
		bodyModel[232] = new ModelRendererTurbo(this, 1033, 521, textureX, textureY); // Box 278
		bodyModel[233] = new ModelRendererTurbo(this, 1489, 529, textureX, textureY); // Box 279
		bodyModel[234] = new ModelRendererTurbo(this, 185, 217, textureX, textureY); // Box 280
		bodyModel[235] = new ModelRendererTurbo(this, 1137, 225, textureX, textureY); // Box 281
		bodyModel[236] = new ModelRendererTurbo(this, 1449, 225, textureX, textureY); // Box 282
		bodyModel[237] = new ModelRendererTurbo(this, 601, 537, textureX, textureY); // Box 283
		bodyModel[238] = new ModelRendererTurbo(this, 1753, 537, textureX, textureY); // Box 284
		bodyModel[239] = new ModelRendererTurbo(this, 1849, 537, textureX, textureY); // Box 285
		bodyModel[240] = new ModelRendererTurbo(this, 1945, 537, textureX, textureY); // Box 286
		bodyModel[241] = new ModelRendererTurbo(this, 1, 545, textureX, textureY); // Box 287
		bodyModel[242] = new ModelRendererTurbo(this, 257, 545, textureX, textureY); // Box 288
		bodyModel[243] = new ModelRendererTurbo(this, 369, 545, textureX, textureY); // Box 289
		bodyModel[244] = new ModelRendererTurbo(this, 761, 545, textureX, textureY); // Box 290
		bodyModel[245] = new ModelRendererTurbo(this, 1097, 553, textureX, textureY); // Box 291
		bodyModel[246] = new ModelRendererTurbo(this, 977, 561, textureX, textureY); // Box 292
		bodyModel[247] = new ModelRendererTurbo(this, 1545, 545, textureX, textureY); // Box 293
		bodyModel[248] = new ModelRendererTurbo(this, 121, 561, textureX, textureY); // Box 294
		bodyModel[249] = new ModelRendererTurbo(this, 449, 561, textureX, textureY); // Box 295
		bodyModel[250] = new ModelRendererTurbo(this, 417, 233, textureX, textureY); // Box 296
		bodyModel[251] = new ModelRendererTurbo(this, 185, 241, textureX, textureY); // Box 297
		bodyModel[252] = new ModelRendererTurbo(this, 897, 249, textureX, textureY); // Box 298
		bodyModel[253] = new ModelRendererTurbo(this, 1825, 577, textureX, textureY); // Box 299
		bodyModel[254] = new ModelRendererTurbo(this, 257, 441, textureX, textureY); // Box 316
		bodyModel[255] = new ModelRendererTurbo(this, 161, 297, textureX, textureY); // Box 317
		bodyModel[256] = new ModelRendererTurbo(this, 913, 193, textureX, textureY); // Box 318
		bodyModel[257] = new ModelRendererTurbo(this, 1249, 217, textureX, textureY); // Box 319
		bodyModel[258] = new ModelRendererTurbo(this, 1209, 609, textureX, textureY); // Box 310
		bodyModel[259] = new ModelRendererTurbo(this, 601, 617, textureX, textureY); // Box 311
		bodyModel[260] = new ModelRendererTurbo(this, 1329, 617, textureX, textureY); // Box 312
		bodyModel[261] = new ModelRendererTurbo(this, 1441, 369, textureX, textureY); // Box 313
		bodyModel[262] = new ModelRendererTurbo(this, 321, 593, textureX, textureY); // Box 314
		bodyModel[263] = new ModelRendererTurbo(this, 1689, 169, textureX, textureY); // Box 239
		bodyModel[264] = new ModelRendererTurbo(this, 969, 65, textureX, textureY); // Box 240
		bodyModel[265] = new ModelRendererTurbo(this, 1641, 25, textureX, textureY); // Box 241
		bodyModel[266] = new ModelRendererTurbo(this, 1689, 25, textureX, textureY); // Box 242
		bodyModel[267] = new ModelRendererTurbo(this, 481, 89, textureX, textureY); // Box 243
		bodyModel[268] = new ModelRendererTurbo(this, 73, 161, textureX, textureY); // Box 244
		bodyModel[269] = new ModelRendererTurbo(this, 1249, 41, textureX, textureY); // Box 245
		bodyModel[270] = new ModelRendererTurbo(this, 1825, 161, textureX, textureY); // Box 246
		bodyModel[271] = new ModelRendererTurbo(this, 1505, 33, textureX, textureY); // Box 247
		bodyModel[272] = new ModelRendererTurbo(this, 1297, 41, textureX, textureY); // Box 248
		bodyModel[273] = new ModelRendererTurbo(this, 1481, 57, textureX, textureY); // Box 250
		bodyModel[274] = new ModelRendererTurbo(this, 497, 121, textureX, textureY); // Box 251
		bodyModel[275] = new ModelRendererTurbo(this, 1873, 25, textureX, textureY); // Box 252
		bodyModel[276] = new ModelRendererTurbo(this, 1441, 57, textureX, textureY); // Box 253
		bodyModel[277] = new ModelRendererTurbo(this, 649, 57, textureX, textureY); // Box 263
		bodyModel[278] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 264
		bodyModel[279] = new ModelRendererTurbo(this, 1281, 1, textureX, textureY); // Box 962
		bodyModel[280] = new ModelRendererTurbo(this, 1321, 1, textureX, textureY); // Box 964
		bodyModel[281] = new ModelRendererTurbo(this, 1921, 1, textureX, textureY); // Box 966
		bodyModel[282] = new ModelRendererTurbo(this, 1593, 33, textureX, textureY); // Box 782
		bodyModel[283] = new ModelRendererTurbo(this, 1305, 41, textureX, textureY); // Box 783
		bodyModel[284] = new ModelRendererTurbo(this, 769, 9, textureX, textureY); // Box 786
		bodyModel[285] = new ModelRendererTurbo(this, 1905, 9, textureX, textureY); // Box 789
		bodyModel[286] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 791
		bodyModel[287] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 792
		bodyModel[288] = new ModelRendererTurbo(this, 433, 193, textureX, textureY); // Box 340
		bodyModel[289] = new ModelRendererTurbo(this, 1409, 121, textureX, textureY); // Box 341
		bodyModel[290] = new ModelRendererTurbo(this, 1489, 49, textureX, textureY); // Box 342
		bodyModel[291] = new ModelRendererTurbo(this, 857, 65, textureX, textureY); // Box 343
		bodyModel[292] = new ModelRendererTurbo(this, 833, 129, textureX, textureY); // Box 344
		bodyModel[293] = new ModelRendererTurbo(this, 1905, 161, textureX, textureY); // Box 345
		bodyModel[294] = new ModelRendererTurbo(this, 697, 57, textureX, textureY); // Box 346
		bodyModel[295] = new ModelRendererTurbo(this, 585, 169, textureX, textureY); // Box 347
		bodyModel[296] = new ModelRendererTurbo(this, 825, 57, textureX, textureY); // Box 348
		bodyModel[297] = new ModelRendererTurbo(this, 1609, 57, textureX, textureY); // Box 349
		bodyModel[298] = new ModelRendererTurbo(this, 681, 129, textureX, textureY); // Box 350
		bodyModel[299] = new ModelRendererTurbo(this, 1393, 137, textureX, textureY); // Box 351
		bodyModel[300] = new ModelRendererTurbo(this, 1249, 65, textureX, textureY); // Box 352
		bodyModel[301] = new ModelRendererTurbo(this, 1273, 65, textureX, textureY); // Box 353
		bodyModel[302] = new ModelRendererTurbo(this, 1617, 57, textureX, textureY); // Box 354
		bodyModel[303] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 355
		bodyModel[304] = new ModelRendererTurbo(this, 1921, 9, textureX, textureY); // Box 356
		bodyModel[305] = new ModelRendererTurbo(this, 1321, 17, textureX, textureY); // Box 357
		bodyModel[306] = new ModelRendererTurbo(this, 1657, 25, textureX, textureY); // Box 358
		bodyModel[307] = new ModelRendererTurbo(this, 1673, 57, textureX, textureY); // Box 359
		bodyModel[308] = new ModelRendererTurbo(this, 1681, 57, textureX, textureY); // Box 360
		bodyModel[309] = new ModelRendererTurbo(this, 1705, 25, textureX, textureY); // Box 361
		bodyModel[310] = new ModelRendererTurbo(this, 1089, 41, textureX, textureY); // Box 362
		bodyModel[311] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 363
		bodyModel[312] = new ModelRendererTurbo(this, 865, 1, textureX, textureY); // Box 364
		bodyModel[313] = new ModelRendererTurbo(this, 129, 217, textureX, textureY); // Box 365
		bodyModel[314] = new ModelRendererTurbo(this, 1705, 137, textureX, textureY); // Box 366
		bodyModel[315] = new ModelRendererTurbo(this, 2009, 65, textureX, textureY); // Box 367
		bodyModel[316] = new ModelRendererTurbo(this, 857, 73, textureX, textureY); // Box 368
		bodyModel[317] = new ModelRendererTurbo(this, 1617, 169, textureX, textureY); // Box 369
		bodyModel[318] = new ModelRendererTurbo(this, 497, 185, textureX, textureY); // Box 370
		bodyModel[319] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 371
		bodyModel[320] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 372
		bodyModel[321] = new ModelRendererTurbo(this, 985, 81, textureX, textureY); // Box 373
		bodyModel[322] = new ModelRendererTurbo(this, 393, 89, textureX, textureY); // Box 374
		bodyModel[323] = new ModelRendererTurbo(this, 1769, 137, textureX, textureY); // Box 375
		bodyModel[324] = new ModelRendererTurbo(this, 1081, 145, textureX, textureY); // Box 376
		bodyModel[325] = new ModelRendererTurbo(this, 649, 81, textureX, textureY); // Box 377
		bodyModel[326] = new ModelRendererTurbo(this, 673, 81, textureX, textureY); // Box 378
		bodyModel[327] = new ModelRendererTurbo(this, 1121, 41, textureX, textureY); // Box 379
		bodyModel[328] = new ModelRendererTurbo(this, 1489, 41, textureX, textureY); // Box 380
		bodyModel[329] = new ModelRendererTurbo(this, 1673, 41, textureX, textureY); // Box 381
		bodyModel[330] = new ModelRendererTurbo(this, 2041, 57, textureX, textureY); // Box 382
		bodyModel[331] = new ModelRendererTurbo(this, 2009, 73, textureX, textureY); // Box 383
		bodyModel[332] = new ModelRendererTurbo(this, 1, 241, textureX, textureY); // Box 384
		bodyModel[333] = new ModelRendererTurbo(this, 1689, 185, textureX, textureY); // Box 385
		bodyModel[334] = new ModelRendererTurbo(this, 1881, 81, textureX, textureY); // Box 386
		bodyModel[335] = new ModelRendererTurbo(this, 1081, 97, textureX, textureY); // Box 387
		bodyModel[336] = new ModelRendererTurbo(this, 1497, 193, textureX, textureY); // Box 388
		bodyModel[337] = new ModelRendererTurbo(this, 1825, 201, textureX, textureY); // Box 389
		bodyModel[338] = new ModelRendererTurbo(this, 857, 97, textureX, textureY); // Box 390
		bodyModel[339] = new ModelRendererTurbo(this, 649, 209, textureX, textureY); // Box 391
		bodyModel[340] = new ModelRendererTurbo(this, 1977, 97, textureX, textureY); // Box 392
		bodyModel[341] = new ModelRendererTurbo(this, 1985, 97, textureX, textureY); // Box 393
		bodyModel[342] = new ModelRendererTurbo(this, 1265, 145, textureX, textureY); // Box 394
		bodyModel[343] = new ModelRendererTurbo(this, 1273, 145, textureX, textureY); // Box 395
		bodyModel[344] = new ModelRendererTurbo(this, 1993, 97, textureX, textureY); // Box 396
		bodyModel[345] = new ModelRendererTurbo(this, 241, 105, textureX, textureY); // Box 397
		bodyModel[346] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // Box 398
		bodyModel[347] = new ModelRendererTurbo(this, 313, 57, textureX, textureY); // Box 399
		bodyModel[348] = new ModelRendererTurbo(this, 833, 57, textureX, textureY); // Box 400
		bodyModel[349] = new ModelRendererTurbo(this, 2017, 73, textureX, textureY); // Box 401
		bodyModel[350] = new ModelRendererTurbo(this, 2033, 105, textureX, textureY); // Box 402

		bodyModel[0].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 0
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 41, 27, 31, 0F,0F, 0F, -7F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[1].setRotationPoint(-143F, -70F, -31F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 49, 27, 31, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[2].setRotationPoint(-102F, -70F, -31F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 74, 27, 31, 0F,0F, 0F, -6F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[3].setRotationPoint(-53F, -70F, -31F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 42, 27, 25, 0F,0F, 0F, -2F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[4].setRotationPoint(21F, -70F, -25F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 37, 27, 21, 0F,0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[5].setRotationPoint(63F, -70F, -21F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 14, 27, 8, 0F,0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[6].setRotationPoint(-199F, -70F, -31F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 55, 27, 31, 0F,0F, -14F, -15F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, -14F, 0F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[7].setRotationPoint(-254F, -70F, -31F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 41, 9, 25, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[8].setRotationPoint(-143F, -79F, -25F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 49, 9, 25, 0F,0F, 0F, -4F, 0F, -1F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[9].setRotationPoint(-102F, -79F, -25F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 74, 8, 25, 0F,0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[10].setRotationPoint(-53F, -78F, -25F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 42, 8, 23, 0F,0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[11].setRotationPoint(21F, -78F, -23F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 37, 8, 14, 0F,0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[12].setRotationPoint(63F, -78F, -20F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 74, 41, 31, 0F,0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, -6F, 0F, 3F, 0F, 0F, 10F, 0F); // Box 14
		bodyModel[13].setRotationPoint(-53F, -43F, -31F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 42, 34, 25, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 10F, 0F, 0F, 10F, 0F); // Box 15
		bodyModel[14].setRotationPoint(21F, -43F, -25F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 37, 27, 21, 0F,0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[15].setRotationPoint(63F, -70F, -21F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 37, 32, 21, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, -3F, 0F, 0F, 0F, 0F, 9F, 0F); // Box 18
		bodyModel[16].setRotationPoint(63F, -43F, -21F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 49, 46, 31, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, 0F); // Box 19
		bodyModel[17].setRotationPoint(-102F, -43F, -31F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 41, 44, 31, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, 7F, 0F); // Box 20
		bodyModel[18].setRotationPoint(-143F, -43F, -31F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 56, 41, 31, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, 4F, 0F); // Box 21
		bodyModel[19].setRotationPoint(-199F, -43F, -31F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 55, 33, 31, 0F,0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, -13F, 0F, 0F, 0F, 0F, 12F, 0F, 0F, -9F, 0F); // Box 22
		bodyModel[20].setRotationPoint(-254F, -43F, -31F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 99, 27, 18, 0F,0F, 0F, -1F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[21].setRotationPoint(100F, -70F, -18F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 63, 27, 12, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, -2F, 0F, -11F, 0F, 0F, 5F, 0F); // Box 24
		bodyModel[22].setRotationPoint(199F, -70F, -12F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 37, 7, 13, 0F,0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[23].setRotationPoint(63F, -85F, -19F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 42, 7, 20, 0F,0F, 0F, -6F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[24].setRotationPoint(21F, -85F, -20F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 74, 7, 22, 0F,0F, 0F, -6F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[25].setRotationPoint(-53F, -85F, -22F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 49, 6, 22, 0F,0F, 1F, -5F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[26].setRotationPoint(-102F, -85F, -22F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 41, 7, 21, 0F,0F, -1F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[27].setRotationPoint(-143F, -86F, -21F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 99, 23, 18, 0F,0F, 0F, 0F, 0F, 0F, -5.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -22.9999F, -5.9999F, 0F, -17.9999F, 0F, 0F, 8.9999F, 0F); // Box 30
		bodyModel[28].setRotationPoint(100F, -43F, -18F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 99, 8, 17, 0F,0F, 0F, -1F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[29].setRotationPoint(100F, -78F, -17F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 63, 8, 12, 0F,0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[30].setRotationPoint(199F, -78F, -12F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 99, 7, 16, 0F,0F, 0F, -4F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[31].setRotationPoint(100F, -85F, -16F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 63, 7, 10, 0F,0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[32].setRotationPoint(199F, -85F, -10F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 15, 13, 10, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -1F, 0F, 0F, 3F, 0F); // Box 35
		bodyModel[33].setRotationPoint(262F, -70F, -10F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 5, 11, 8, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 36
		bodyModel[34].setRotationPoint(277F, -70F, -8F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 55, 2, 24, 0F,0F, -9F, -13F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 14F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 14F, 0F); // Box 37
		bodyModel[35].setRotationPoint(-254F, -72F, -24F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 15, 13, 18, 0F,0F, -2F, -6F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[36].setRotationPoint(-269F, -56F, -18F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 15, 18, 18, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, -5F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0F); // Box 39
		bodyModel[37].setRotationPoint(-269F, -43F, -18F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 10, 6, 13, 0F,0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -9F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F); // Box 40
		bodyModel[38].setRotationPoint(-279F, -40F, -13F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 15, 7, 16, 0F,0F, -3F, -7F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 41
		bodyModel[39].setRotationPoint(-269F, -63F, -16F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 41, 3, 17, 0F,0F, -2F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 42
		bodyModel[40].setRotationPoint(-143F, -89F, -17F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 49, 3, 17, 0F,0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[41].setRotationPoint(-102F, -89F, -17F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 74, 4, 16, 0F,0F, 0F, -6F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[42].setRotationPoint(-53F, -89F, -16F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 42, 4, 14, 0F,0F, 0F, -6F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[43].setRotationPoint(21F, -89F, -14F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 37, 4, 6, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[44].setRotationPoint(63F, -89F, -12F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 99, 4, 12, 0F,0F, 0F, -6F, 0F, -1F, -8F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[45].setRotationPoint(100F, -89F, -12F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 63, 3, 8, 0F,0F, 0F, -4F, 0F, 1F, -4F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[46].setRotationPoint(199F, -88F, -8F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 54, 12, 205, 0F,0F, 0F, 0F, 0F, 0F, 0F, 28F, -14F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 28F, 24F, 0F, 0F, 24F, 0F); // Box 49
		bodyModel[47].setRotationPoint(-77F, -102F, -213F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 23, 12, 205, 0F,-11F, -4F, 0F, 1F, 0F, 0F, 1F, -14F, 0F, 0F, -19F, 0F, -11F, -4F, 0F, 1F, 0F, 0F, 1F, 24F, 0F, 0F, 19F, 0F); // Box 50
		bodyModel[48].setRotationPoint(-101F, -102F, -213F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 23, 12, 205, 0F,0F, 0F, 0F, -10F, -5F, 0F, 24F, -24F, 0F, -28F, -14F, 0F, 0F, 0F, 0F, -10F, -5F, 0F, 24F, 14F, 0F, -28F, 24F, 0F); // Box 51
		bodyModel[49].setRotationPoint(-23F, -102F, -213F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 33, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[50].setRotationPoint(213F, -88F, -10F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 9, 8, 8, 0F,-2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 59
		bodyModel[51].setRotationPoint(204F, -88F, -10F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 33, 8, 70, 0F,-13F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[52].setRotationPoint(213F, -88F, -80F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 20, 8, 70, 0F,-15F, -4F, 0F, 0F, -3F, 0F, -13F, 0F, 0F, 0F, -3F, 0F, -15F, -3F, 0F, 0F, -2F, 0F, -13F, 0F, 0F, 0F, -3F, 0F); // Box 61
		bodyModel[53].setRotationPoint(206F, -88F, -80F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 20, 3, 17, 0F,-9F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[54].setRotationPoint(226F, -85F, -97F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 14, 3, 17, 0F,-7F, -1F, -3F, 0F, -1F, 0F, -9F, 0F, 0F, 0F, -1F, 0F, -7F, -1F, -3F, 0F, -1F, 0F, -9F, 0F, 0F, 0F, -1F, 0F); // Box 64
		bodyModel[55].setRotationPoint(221F, -85F, -97F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 41, 76, 3, 0F,-19F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -19F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[56].setRotationPoint(202F, -153F, -3F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 39, 76, 3, 0F,-33F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -33F, 0F, 0F, 0F, 0F, -2F, -19F, 0F, 0F, -19F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[57].setRotationPoint(182F, -153F, -3F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 22, 18, 3, 0F,-11F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[58].setRotationPoint(221F, -171F, -3F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 6, 18, 3, 0F,-9F, -5F, -2F, 11F, 0F, -1F, 11F, 0F, 0F, -9F, -5F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[59].setRotationPoint(215F, -171F, -3F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 9, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		bodyModel[60].setRotationPoint(262F, -89F, -4F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 14, 2, 10, 0F,0F, 0F, -8.9999F, 0F, -1.9999F, 0F, -4.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.9999F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[61].setRotationPoint(-199F, -72F, -24F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 9, 29, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[62].setRotationPoint(-199F, -72F, -14F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 5, 29, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[63].setRotationPoint(-199F, -72F, -6F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 29, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		bodyModel[64].setRotationPoint(-199F, -72F, -1F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 56, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[65].setRotationPoint(-181F, -79F, -21F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -9F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, -3F, 0F, 9F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, -3F); // Box 78
		bodyModel[66].setRotationPoint(-185F, -79F, -21F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,-4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[67].setRotationPoint(-185F, -79F, -21F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F); // Box 80
		bodyModel[68].setRotationPoint(-191F, -79F, -14F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F); // Box 81
		bodyModel[69].setRotationPoint(-195F, -79F, -7F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -7F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, -7F, 0F, 0F, 7F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 7F, 0F); // Box 82
		bodyModel[70].setRotationPoint(-198F, -79F, -1F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,-4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[71].setRotationPoint(-189F, -79F, -14F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,-3F, 0F, 0F, 3F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 84
		bodyModel[72].setRotationPoint(-192F, -79F, -7F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 11, 1, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 85
		bodyModel[73].setRotationPoint(-154F, -87F, -7F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 11, 5, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 4F, 0F, 1F, 4F, 0F, 1F, -4F, 0F, 1F, -4F); // Box 86
		bodyModel[74].setRotationPoint(-154F, -85F, -17F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 87
		bodyModel[75].setRotationPoint(-162F, -84F, -17F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 88
		bodyModel[76].setRotationPoint(-169F, -83F, -17F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 12, 1, 7, 0F,0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F); // Box 89
		bodyModel[77].setRotationPoint(-181F, -83F, -7F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[78].setRotationPoint(-181F, -80F, -21F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 11, 1, 7, 0F,-3F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 1F, 0F, 0F); // Box 91
		bodyModel[79].setRotationPoint(-192F, -79F, -7F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 7, 1, 7, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 93
		bodyModel[80].setRotationPoint(-169F, -85F, -7F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 8, 1, 7, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 94
		bodyModel[81].setRotationPoint(-162F, -86F, -7F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F); // Box 95
		bodyModel[82].setRotationPoint(-181F, -81F, -17F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 96
		bodyModel[83].setRotationPoint(-181F, -81F, -17F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 97
		bodyModel[84].setRotationPoint(-169F, -79F, -21F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 98
		bodyModel[85].setRotationPoint(-169F, -82F, -17F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 99
		bodyModel[86].setRotationPoint(-162F, -79F, -21F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 100
		bodyModel[87].setRotationPoint(-162F, -83F, -17F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 101
		bodyModel[88].setRotationPoint(-154F, -84F, -17F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 102
		bodyModel[89].setRotationPoint(-169F, -79F, -21F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 103
		bodyModel[90].setRotationPoint(-162F, -79F, -21F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 2, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 104
		bodyModel[91].setRotationPoint(-154F, -79F, -21F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 42, 27, 8, 0F,0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[92].setRotationPoint(-185F, -70F, -31F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 17, 10, 30, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 316
		bodyModel[93].setRotationPoint(-123F, -88.5F, -78F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 17, 9, 30, 0F,0F, 0F, -10F, 0F, 1F, -9F, 0F, 1F, -9F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 317
		bodyModel[94].setRotationPoint(-123F, -97.5F, -78F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 17, 9, 30, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 1F, -9F, 0F, 1F, -9F, 0F, 0F, -10F); // Box 318
		bodyModel[95].setRotationPoint(-123F, -78.5F, -78F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 41, 10, 32, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 319
		bodyModel[96].setRotationPoint(-106F, -88.5F, -79F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 20, 10, 32, 0F,0F, 0F, -10F, 0F, -0.5F, -12F, 0F, -0.5F, -12F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 320
		bodyModel[97].setRotationPoint(-106F, -98.5F, -79F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 21, 10, 32, 0F,0F, -0.5F, -12F, 0F, -3F, -14F, 0F, -3F, -14F, 0F, -0.5F, -12F, 0F, 0F, -1.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -1.5F); // Box 321
		bodyModel[98].setRotationPoint(-86F, -98.5F, -79F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 26, 10, 26, 0F,0F, 0F, 0F, 8F, 0F, -7F, 8F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F); // Box 322
		bodyModel[99].setRotationPoint(-65F, -88.5F, -76F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 26, 10, 26, 0F,0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, -2F, -8F, -12F, -5F, -7F, -12F, -5F, -7F, 0F, -2F, -8F); // Box 323
		bodyModel[100].setRotationPoint(-65F, -78.5F, -76F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 41, 10, 32, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, -2F, -11F, 0F, -2F, -11F, 0F, 0F, -10F); // Box 324
		bodyModel[101].setRotationPoint(-106F, -78.5F, -79F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 11, 9, 30, 0F,0F, -4.5F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, -4.5F, -10F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 325
		bodyModel[102].setRotationPoint(-134F, -97.5F, -78F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 11, 9, 30, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -4.5F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, -4.5F, -10F); // Box 326
		bodyModel[103].setRotationPoint(-134F, -78.5F, -78F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 11, 10, 30, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 327
		bodyModel[104].setRotationPoint(-134F, -88.5F, -78F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 8, 4, 12, 0F,0F, -1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -5F, 0F, -1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -5F); // Box 328
		bodyModel[105].setRotationPoint(-142F, -85.5F, -69F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 8, 4, 12, 0F,-3F, -2.5F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, -3F, -2.5F, -5F, 0F, 1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -5F); // Box 329
		bodyModel[106].setRotationPoint(-142F, -89.5F, -69F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 8, 4, 12, 0F,0F, 1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -5F, -3F, -2.5F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, -3F, -2.5F, -5F); // Box 330
		bodyModel[107].setRotationPoint(-142F, -81.5F, -69F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 34, 8, 26, 0F,0F, -1F, -11F, -12F, -5F, -12F, -12F, -5F, -12F, 0F, -1F, -11F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F); // Box 121
		bodyModel[108].setRotationPoint(-65F, -96.5F, -76F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 17, 10, 30, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 122
		bodyModel[109].setRotationPoint(-121F, -96.5F, -158F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 17, 9, 30, 0F,0F, 0F, -10F, 0F, 1F, -9F, 0F, 1F, -9F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 123
		bodyModel[110].setRotationPoint(-121F, -105.5F, -158F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 17, 9, 30, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 1F, -9F, 0F, 1F, -9F, 0F, 0F, -10F); // Box 124
		bodyModel[111].setRotationPoint(-121F, -86.5F, -158F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 41, 10, 32, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 125
		bodyModel[112].setRotationPoint(-104F, -96.5F, -159F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 20, 10, 32, 0F,0F, 0F, -10F, 0F, -0.5F, -12F, 0F, -0.5F, -12F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 126
		bodyModel[113].setRotationPoint(-104F, -106.5F, -159F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 21, 10, 32, 0F,0F, -0.5F, -12F, 0F, -3F, -14F, 0F, -3F, -14F, 0F, -0.5F, -12F, 0F, 0F, -1.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -1.5F); // Box 127
		bodyModel[114].setRotationPoint(-84F, -106.5F, -159F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 26, 10, 26, 0F,0F, 0F, 0F, 8F, 0F, -7F, 8F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F); // Box 128
		bodyModel[115].setRotationPoint(-63F, -96.5F, -156F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 26, 10, 26, 0F,0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, -2F, -8F, -12F, -5F, -7F, -12F, -5F, -7F, 0F, -2F, -8F); // Box 129
		bodyModel[116].setRotationPoint(-63F, -86.5F, -156F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 41, 10, 32, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, -2F, -11F, 0F, -2F, -11F, 0F, 0F, -10F); // Box 130
		bodyModel[117].setRotationPoint(-104F, -86.5F, -159F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 11, 9, 30, 0F,0F, -4.5F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, -4.5F, -10F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 131
		bodyModel[118].setRotationPoint(-132F, -105.5F, -158F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 11, 9, 30, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -4.5F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, -4.5F, -10F); // Box 132
		bodyModel[119].setRotationPoint(-132F, -86.5F, -158F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 11, 10, 30, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 133
		bodyModel[120].setRotationPoint(-132F, -96.5F, -158F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 8, 4, 12, 0F,0F, -1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -5F, 0F, -1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -5F); // Box 134
		bodyModel[121].setRotationPoint(-140F, -93.5F, -149F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 8, 4, 12, 0F,-3F, -2.5F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, -3F, -2.5F, -5F, 0F, 1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -5F); // Box 135
		bodyModel[122].setRotationPoint(-140F, -97.5F, -149F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 8, 4, 12, 0F,0F, 1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -5F, -3F, -2.5F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, -3F, -2.5F, -5F); // Box 136
		bodyModel[123].setRotationPoint(-140F, -89.5F, -149F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 34, 8, 26, 0F,0F, -1F, -11F, -12F, -5F, -12F, -12F, -5F, -12F, 0F, -1F, -11F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F); // Box 137
		bodyModel[124].setRotationPoint(-63F, -104.5F, -156F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 14, 27, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F); // Box 160
		bodyModel[125].setRotationPoint(-199F, -70F, -24F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 16, 19, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		bodyModel[126].setRotationPoint(84F, -89F, -6F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 4, 32, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[127].setRotationPoint(63F, -89F, -6F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 4, 32, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 164
		bodyModel[128].setRotationPoint(80F, -89F, -6F);

		bodyModel[129].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 165
		bodyModel[129].setRotationPoint(0F, 0F, -1F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 41, 27, 31, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[130].setRotationPoint(-143F, -70F, 0F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 49, 27, 31, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[131].setRotationPoint(-102F, -70F, 0F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 74, 27, 31, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 168
		bodyModel[132].setRotationPoint(-53F, -70F, 0F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 42, 27, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 169
		bodyModel[133].setRotationPoint(21F, -70F, 0F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 37, 27, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 170
		bodyModel[134].setRotationPoint(63F, -70F, 0F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 14, 27, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		bodyModel[135].setRotationPoint(-199F, -70F, 23F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 55, 27, 31, 0F,0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -14F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F); // Box 172
		bodyModel[136].setRotationPoint(-254F, -70F, 0F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 41, 9, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 173
		bodyModel[137].setRotationPoint(-143F, -79F, 0F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 49, 9, 25, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[138].setRotationPoint(-102F, -79F, 0F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 74, 8, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 175
		bodyModel[139].setRotationPoint(-53F, -78F, 0F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 42, 8, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 176
		bodyModel[140].setRotationPoint(21F, -78F, 0F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 37, 8, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 177
		bodyModel[141].setRotationPoint(63F, -78F, 6F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 74, 41, 31, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, 3F, 0F, 0F, -7F, -6F, 0F, 0F, 0F); // Box 178
		bodyModel[142].setRotationPoint(-53F, -43F, 0F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 42, 34, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 179
		bodyModel[143].setRotationPoint(21F, -43F, 0F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 37, 27, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 180
		bodyModel[144].setRotationPoint(63F, -70F, 0F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 37, 32, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, -9F, -3F, 0F, 0F, 0F); // Box 181
		bodyModel[145].setRotationPoint(63F, -43F, 0F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 49, 46, 31, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 182
		bodyModel[146].setRotationPoint(-102F, -43F, 0F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 41, 44, 31, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 183
		bodyModel[147].setRotationPoint(-143F, -43F, 0F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 56, 41, 31, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, -8F, 0F); // Box 184
		bodyModel[148].setRotationPoint(-199F, -43F, 0F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 55, 33, 31, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, -9F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, 0F, -15F, -13F); // Box 185
		bodyModel[149].setRotationPoint(-254F, -43F, 0F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 99, 27, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 186
		bodyModel[150].setRotationPoint(100F, -70F, 0F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 63, 27, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -11F, 0F, 0F, -14F, -2F, 0F, 0F, 0F); // Box 187
		bodyModel[151].setRotationPoint(199F, -70F, 0F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 37, 7, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 188
		bodyModel[152].setRotationPoint(63F, -85F, 6F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 42, 7, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 189
		bodyModel[153].setRotationPoint(21F, -85F, 0F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 74, 7, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 190
		bodyModel[154].setRotationPoint(-53F, -85F, 0F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 49, 6, 22, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 1F, -5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1F); // Box 191
		bodyModel[155].setRotationPoint(-102F, -85F, 0F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 41, 7, 21, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 192
		bodyModel[156].setRotationPoint(-143F, -86F, 0F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 99, 23, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.9999F, 0F, 0F, 0F, 0F, 8.9999F, 0F, 0F, -17.9999F, 0F, 0F, -22.9999F, -5.9999F, 0F, 0F, 0F); // Box 193
		bodyModel[157].setRotationPoint(100F, -43F, 0F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 99, 8, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 194
		bodyModel[158].setRotationPoint(100F, -78F, 0F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 63, 8, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 195
		bodyModel[159].setRotationPoint(199F, -78F, 0F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 99, 7, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 196
		bodyModel[160].setRotationPoint(100F, -85F, 0F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 63, 7, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 197
		bodyModel[161].setRotationPoint(199F, -85F, 0F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 15, 13, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -1F, 0F, 0F, -2F, -2F, 0F, 0F, 0F); // Box 198
		bodyModel[162].setRotationPoint(262F, -70F, 0F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 5, 11, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 199
		bodyModel[163].setRotationPoint(277F, -70F, 0F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 55, 2, 24, 0F,0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, -9F, -13F, 0F, 14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 14F, -8F); // Box 200
		bodyModel[164].setRotationPoint(-254F, -72F, 0F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 15, 13, 18, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 201
		bodyModel[165].setRotationPoint(-269F, -56F, 0F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 15, 18, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, -9F, -5F); // Box 202
		bodyModel[166].setRotationPoint(-269F, -43F, 0F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 10, 6, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, -4F, -9F); // Box 203
		bodyModel[167].setRotationPoint(-279F, -40F, 0F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 15, 7, 16, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -3F, -7F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -4F); // Box 204
		bodyModel[168].setRotationPoint(-269F, -63F, 0F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 41, 3, 17, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -2F, -7F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 205
		bodyModel[169].setRotationPoint(-143F, -89F, 0F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 49, 3, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 0F, 0F); // Box 206
		bodyModel[170].setRotationPoint(-102F, -89F, 0F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 74, 4, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 207
		bodyModel[171].setRotationPoint(-53F, -89F, 0F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 42, 4, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 208
		bodyModel[172].setRotationPoint(21F, -89F, 0F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 37, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 209
		bodyModel[173].setRotationPoint(63F, -89F, 6F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 99, 4, 12, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -8F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 210
		bodyModel[174].setRotationPoint(100F, -89F, 0F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 63, 3, 8, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 211
		bodyModel[175].setRotationPoint(199F, -88F, 0F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 54, 12, 205, 0F,0F, -14F, 0F, 28F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 24F, 0F, 28F, 24F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 212
		bodyModel[176].setRotationPoint(-77F, -102F, 8F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 23, 12, 205, 0F,0F, -19F, 0F, 1F, -14F, 0F, 1F, 0F, 0F, -11F, -4F, 0F, 0F, 19F, 0F, 1F, 24F, 0F, 1F, 0F, 0F, -11F, -4F, 0F); // Box 213
		bodyModel[177].setRotationPoint(-101F, -102F, 8F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 23, 12, 205, 0F,-28F, -14F, 0F, 24F, -24F, 0F, -10F, -5F, 0F, 0F, 0F, 0F, -28F, 24F, 0F, 24F, 14F, 0F, -10F, -5F, 0F, 0F, 0F, 0F); // Box 214
		bodyModel[178].setRotationPoint(-23F, -102F, 8F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 33, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221
		bodyModel[179].setRotationPoint(213F, -88F, 2F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 9, 8, 8, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -3F, 0F); // Box 222
		bodyModel[180].setRotationPoint(204F, -88F, 2F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 33, 8, 70, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -13F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -13F, -2F, 0F); // Box 223
		bodyModel[181].setRotationPoint(213F, -88F, 10F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 20, 8, 70, 0F,0F, -3F, 0F, -13F, 0F, 0F, 0F, -3F, 0F, -15F, -4F, 0F, 0F, -3F, 0F, -13F, 0F, 0F, 0F, -2F, 0F, -15F, -3F, 0F); // Box 224
		bodyModel[182].setRotationPoint(206F, -88F, 10F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 20, 3, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -9F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -9F, -1F, 0F); // Box 226
		bodyModel[183].setRotationPoint(226F, -85F, 80F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 14, 3, 17, 0F,0F, -1F, 0F, -9F, 0F, 0F, 0F, -1F, 0F, -7F, -1F, -3F, 0F, -1F, 0F, -9F, 0F, 0F, 0F, -1F, 0F, -7F, -1F, -3F); // Box 227
		bodyModel[184].setRotationPoint(221F, -85F, 80F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 41, 76, 3, 0F,-19F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -19F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 229
		bodyModel[185].setRotationPoint(202F, -153F, 0F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 39, 76, 3, 0F,-33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -33F, 0F, -2F, 0F, 0F, 0F, -19F, 0F, 0F, -19F, 0F, 0F, 0F, 0F, -2F); // Box 230
		bodyModel[186].setRotationPoint(182F, -153F, 0F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 22, 18, 3, 0F,-11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -11F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		bodyModel[187].setRotationPoint(221F, -171F, 0F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 6, 18, 3, 0F,-9F, -5F, 0F, 11F, 0F, 0F, 11F, 0F, -1F, -9F, -5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 233
		bodyModel[188].setRotationPoint(215F, -171F, 0F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 9, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 235
		bodyModel[189].setRotationPoint(262F, -89F, 0F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 14, 2, 10, 0F,0F, 0F, 0F, -4.9999F, 0F, 0F, 0F, -1.9999F, 0F, 0F, 0F, -8.9999F, 0F, 0F, 0F, -4.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 236
		bodyModel[190].setRotationPoint(-199F, -72F, 14F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 9, 29, 8, 0F,0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 237
		bodyModel[191].setRotationPoint(-199F, -72F, 6F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 5, 29, 5, 0F,0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 238
		bodyModel[192].setRotationPoint(-199F, -72F, 1F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 29, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
		bodyModel[193].setRotationPoint(-199F, -72F, 0F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 56, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		bodyModel[194].setRotationPoint(-181F, -79F, 20F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -9F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 3F, 0F, 9F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 3F); // Box 241
		bodyModel[195].setRotationPoint(-185F, -79F, 20F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F); // Box 242
		bodyModel[196].setRotationPoint(-185F, -79F, 14F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F); // Box 243
		bodyModel[197].setRotationPoint(-191F, -79F, 13F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F); // Box 244
		bodyModel[198].setRotationPoint(-195F, -79F, 6F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,1F, -7F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -7F, 0F, 1F, 7F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 7F, 0F); // Box 245
		bodyModel[199].setRotationPoint(-198F, -79F, 0F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F); // Box 246
		bodyModel[200].setRotationPoint(-189F, -79F, 7F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,1F, 0F, 0F, -1F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F); // Box 247
		bodyModel[201].setRotationPoint(-192F, -79F, 0F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 11, 1, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 248
		bodyModel[202].setRotationPoint(-154F, -87F, 4F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 11, 5, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, -4F, 0F, 1F, -4F, 0F, 1F, 4F, 0F, 1F, 4F); // Box 249
		bodyModel[203].setRotationPoint(-154F, -85F, 16F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 250
		bodyModel[204].setRotationPoint(-162F, -84F, 16F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 251
		bodyModel[205].setRotationPoint(-169F, -83F, 16F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 12, 1, 7, 0F,0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F); // Box 252
		bodyModel[206].setRotationPoint(-181F, -83F, 0F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 253
		bodyModel[207].setRotationPoint(-181F, -80F, 17F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 11, 1, 7, 0F,1F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -3F, 0F, 0F); // Box 254
		bodyModel[208].setRotationPoint(-192F, -79F, 0F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 7, 1, 7, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 255
		bodyModel[209].setRotationPoint(-169F, -85F, 0F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 8, 1, 7, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 256
		bodyModel[210].setRotationPoint(-162F, -86F, 0F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F); // Box 257
		bodyModel[211].setRotationPoint(-181F, -81F, 16F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 258
		bodyModel[212].setRotationPoint(-181F, -81F, 7F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 259
		bodyModel[213].setRotationPoint(-169F, -79F, 17F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
		bodyModel[214].setRotationPoint(-169F, -82F, 7F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[215].setRotationPoint(-162F, -79F, 17F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 262
		bodyModel[216].setRotationPoint(-162F, -83F, 7F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 263
		bodyModel[217].setRotationPoint(-154F, -84F, 7F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 264
		bodyModel[218].setRotationPoint(-169F, -79F, 20F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 265
		bodyModel[219].setRotationPoint(-162F, -79F, 20F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 2, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 266
		bodyModel[220].setRotationPoint(-154F, -79F, 20F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 42, 27, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 267
		bodyModel[221].setRotationPoint(-185F, -70F, 23F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 17, 10, 30, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 268
		bodyModel[222].setRotationPoint(-123F, -88.5F, 48F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 17, 9, 30, 0F,0F, 0F, -10F, 0F, 1F, -9F, 0F, 1F, -9F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 269
		bodyModel[223].setRotationPoint(-123F, -97.5F, 48F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 17, 9, 30, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 1F, -9F, 0F, 1F, -9F, 0F, 0F, -10F); // Box 270
		bodyModel[224].setRotationPoint(-123F, -78.5F, 48F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 41, 10, 32, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 271
		bodyModel[225].setRotationPoint(-106F, -88.5F, 47F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 20, 10, 32, 0F,0F, 0F, -10F, 0F, -0.5F, -12F, 0F, -0.5F, -12F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 272
		bodyModel[226].setRotationPoint(-106F, -98.5F, 47F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 21, 10, 32, 0F,0F, -0.5F, -12F, 0F, -3F, -14F, 0F, -3F, -14F, 0F, -0.5F, -12F, 0F, 0F, -1.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -1.5F); // Box 273
		bodyModel[227].setRotationPoint(-86F, -98.5F, 47F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 26, 10, 26, 0F,0F, 0F, 0F, 8F, 0F, -7F, 8F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F); // Box 274
		bodyModel[228].setRotationPoint(-65F, -88.5F, 50F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 26, 10, 26, 0F,0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, -2F, -8F, -12F, -5F, -7F, -12F, -5F, -7F, 0F, -2F, -8F); // Box 275
		bodyModel[229].setRotationPoint(-65F, -78.5F, 50F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 41, 10, 32, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, -2F, -11F, 0F, -2F, -11F, 0F, 0F, -10F); // Box 276
		bodyModel[230].setRotationPoint(-106F, -78.5F, 47F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 11, 9, 30, 0F,0F, -4.5F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, -4.5F, -10F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 277
		bodyModel[231].setRotationPoint(-134F, -97.5F, 48F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 11, 9, 30, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -4.5F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, -4.5F, -10F); // Box 278
		bodyModel[232].setRotationPoint(-134F, -78.5F, 48F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 11, 10, 30, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 279
		bodyModel[233].setRotationPoint(-134F, -88.5F, 48F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 8, 4, 12, 0F,0F, -1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -5F, 0F, -1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -5F); // Box 280
		bodyModel[234].setRotationPoint(-142F, -85.5F, 57F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 8, 4, 12, 0F,-3F, -2.5F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, -3F, -2.5F, -5F, 0F, 1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -5F); // Box 281
		bodyModel[235].setRotationPoint(-142F, -89.5F, 57F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 8, 4, 12, 0F,0F, 1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -5F, -3F, -2.5F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, -3F, -2.5F, -5F); // Box 282
		bodyModel[236].setRotationPoint(-142F, -81.5F, 57F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 34, 8, 26, 0F,0F, -1F, -11F, -12F, -5F, -12F, -12F, -5F, -12F, 0F, -1F, -11F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F); // Box 283
		bodyModel[237].setRotationPoint(-65F, -96.5F, 50F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 17, 10, 30, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 284
		bodyModel[238].setRotationPoint(-121F, -96.5F, 128F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 17, 9, 30, 0F,0F, 0F, -10F, 0F, 1F, -9F, 0F, 1F, -9F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 285
		bodyModel[239].setRotationPoint(-121F, -105.5F, 128F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 17, 9, 30, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 1F, -9F, 0F, 1F, -9F, 0F, 0F, -10F); // Box 286
		bodyModel[240].setRotationPoint(-121F, -86.5F, 128F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 41, 10, 32, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 287
		bodyModel[241].setRotationPoint(-104F, -96.5F, 127F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 20, 10, 32, 0F,0F, 0F, -10F, 0F, -0.5F, -12F, 0F, -0.5F, -12F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 288
		bodyModel[242].setRotationPoint(-104F, -106.5F, 127F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 21, 10, 32, 0F,0F, -0.5F, -12F, 0F, -3F, -14F, 0F, -3F, -14F, 0F, -0.5F, -12F, 0F, 0F, -1.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -1.5F); // Box 289
		bodyModel[243].setRotationPoint(-84F, -106.5F, 127F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 26, 10, 26, 0F,0F, 0F, 0F, 8F, 0F, -7F, 8F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F); // Box 290
		bodyModel[244].setRotationPoint(-63F, -96.5F, 130F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 26, 10, 26, 0F,0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, -2F, -8F, -12F, -5F, -7F, -12F, -5F, -7F, 0F, -2F, -8F); // Box 291
		bodyModel[245].setRotationPoint(-63F, -86.5F, 130F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 41, 10, 32, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, -2F, -11F, 0F, -2F, -11F, 0F, 0F, -10F); // Box 292
		bodyModel[246].setRotationPoint(-104F, -86.5F, 127F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 11, 9, 30, 0F,0F, -4.5F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, -4.5F, -10F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 293
		bodyModel[247].setRotationPoint(-132F, -105.5F, 128F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 11, 9, 30, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -4.5F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, -4.5F, -10F); // Box 294
		bodyModel[248].setRotationPoint(-132F, -86.5F, 128F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 11, 10, 30, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 295
		bodyModel[249].setRotationPoint(-132F, -96.5F, 128F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 8, 4, 12, 0F,0F, -1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -5F, 0F, -1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -5F); // Box 296
		bodyModel[250].setRotationPoint(-140F, -93.5F, 137F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 8, 4, 12, 0F,-3F, -2.5F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, -3F, -2.5F, -5F, 0F, 1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -5F); // Box 297
		bodyModel[251].setRotationPoint(-140F, -97.5F, 137F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 8, 4, 12, 0F,0F, 1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -5F, -3F, -2.5F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, -3F, -2.5F, -5F); // Box 298
		bodyModel[252].setRotationPoint(-140F, -89.5F, 137F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 34, 8, 26, 0F,0F, -1F, -11F, -12F, -5F, -12F, -12F, -5F, -12F, 0F, -1F, -11F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F); // Box 299
		bodyModel[253].setRotationPoint(-63F, -104.5F, 130F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 14, 27, 10, 0F,0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 316
		bodyModel[254].setRotationPoint(-199F, -70F, 14F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 16, 19, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 317
		bodyModel[255].setRotationPoint(84F, -89F, 0F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 4, 32, 3, 0F,0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 318
		bodyModel[256].setRotationPoint(63F, -89F, 3F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 4, 32, 3, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 319
		bodyModel[257].setRotationPoint(80F, -89F, 3F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 56, 14, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 310
		bodyModel[258].setRotationPoint(-199F, -57F, -23F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 56, 14, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 311
		bodyModel[259].setRotationPoint(-199F, -57F, 0F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 14, 13, 46, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 312
		bodyModel[260].setRotationPoint(-199F, -70F, -23F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 4, 8, 46, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 313
		bodyModel[261].setRotationPoint(-185F, -70F, -23F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 17, 1, 46, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 314
		bodyModel[262].setRotationPoint(-198F, -71F, -23F);

		bodyModel[263].addShapeBox(0F, 1F, 0F, 10, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
		bodyModel[263].setRotationPoint(-177F, -62F, -14F);
		bodyModel[263].rotateAngleZ = -0.10471976F;

		bodyModel[264].addShapeBox(9F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		bodyModel[264].setRotationPoint(-177F, -62F, -14F);
		bodyModel[264].rotateAngleZ = -0.10471976F;

		bodyModel[265].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		bodyModel[265].setRotationPoint(-177F, -62F, -14F);
		bodyModel[265].rotateAngleZ = -0.10471976F;

		bodyModel[266].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		bodyModel[266].setRotationPoint(-177F, -62F, -5F);
		bodyModel[266].rotateAngleZ = -0.10471976F;

		bodyModel[267].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		bodyModel[267].setRotationPoint(-177F, -62F, -14F);
		bodyModel[267].rotateAngleZ = -0.10471976F;

		bodyModel[268].addShapeBox(0F, 0F, 0F, 1, 13, 10, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		bodyModel[268].setRotationPoint(-168F, -74F, -14F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[269].setRotationPoint(-166F, -78F, -12F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 1, 13, 8, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 246
		bodyModel[270].setRotationPoint(-169F, -73F, -13F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[271].setRotationPoint(-169.3F, -73.3F, -11F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[272].setRotationPoint(-169.3F, -73.3F, -8F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[273].setRotationPoint(-168F, -71F, -13F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 251
		bodyModel[274].setRotationPoint(-168F, -71F, -6F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[275].setRotationPoint(-174F, -61F, -15F);
		bodyModel[275].rotateAngleZ = 0.78539816F;

		bodyModel[276].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 253
		bodyModel[276].setRotationPoint(-174F, -61F, -4F);
		bodyModel[276].rotateAngleZ = 0.78539816F;

		bodyModel[277].addShapeBox(-1F, -1F, 0F, 2, 11, 2, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 263
		bodyModel[277].setRotationPoint(-178.5F, -66.25F, -10F);
		bodyModel[277].rotateAngleZ = -1.13446401F;

		bodyModel[278].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 264
		bodyModel[278].setRotationPoint(-178F, -70F, -9.5F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 962
		bodyModel[279].setRotationPoint(-166.5F, -77.5F, -10.5F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 964
		bodyModel[280].setRotationPoint(-166.5F, -76.5F, -10.5F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 966
		bodyModel[281].setRotationPoint(-166.5F, -75.5F, -10.5F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 782
		bodyModel[282].setRotationPoint(-173F, -60F, -13F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 783
		bodyModel[283].setRotationPoint(-173F, -60F, -6F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 786
		bodyModel[284].setRotationPoint(-178F, -69.75F, -8.5F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 789
		bodyModel[285].setRotationPoint(-178F, -69.75F, -12.5F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 791
		bodyModel[286].setRotationPoint(-178F, -72.75F, -12.5F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 792
		bodyModel[287].setRotationPoint(-178F, -72.75F, -6.5F);

		bodyModel[288].addShapeBox(0F, 1F, 0F, 10, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 340
		bodyModel[288].setRotationPoint(-177F, -62F, 4F);
		bodyModel[288].rotateAngleZ = -0.10471976F;

		bodyModel[289].addShapeBox(9F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 341
		bodyModel[289].setRotationPoint(-177F, -62F, 4F);
		bodyModel[289].rotateAngleZ = -0.10471976F;

		bodyModel[290].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 342
		bodyModel[290].setRotationPoint(-177F, -62F, 13F);
		bodyModel[290].rotateAngleZ = -0.10471976F;

		bodyModel[291].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 343
		bodyModel[291].setRotationPoint(-177F, -62F, 4F);
		bodyModel[291].rotateAngleZ = -0.10471976F;

		bodyModel[292].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 344
		bodyModel[292].setRotationPoint(-177F, -62F, 4F);
		bodyModel[292].rotateAngleZ = -0.10471976F;

		bodyModel[293].addShapeBox(0F, 0F, 0F, 1, 13, 10, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 345
		bodyModel[293].setRotationPoint(-168F, -74F, 4F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 346
		bodyModel[294].setRotationPoint(-166F, -78F, 6F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 1, 13, 8, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 347
		bodyModel[295].setRotationPoint(-169F, -73F, 5F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 348
		bodyModel[296].setRotationPoint(-169.3F, -73.3F, 10F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 349
		bodyModel[297].setRotationPoint(-169.3F, -73.3F, 7F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 350
		bodyModel[298].setRotationPoint(-168F, -71F, 12F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 351
		bodyModel[299].setRotationPoint(-168F, -71F, 5F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 352
		bodyModel[300].setRotationPoint(-174F, -61F, 14F);
		bodyModel[300].rotateAngleZ = 0.78539816F;

		bodyModel[301].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 353
		bodyModel[301].setRotationPoint(-174F, -61F, 3F);
		bodyModel[301].rotateAngleZ = 0.78539816F;

		bodyModel[302].addShapeBox(-1F, -1F, 0F, 2, 11, 2, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 354
		bodyModel[302].setRotationPoint(-178.5F, -66.25F, 8F);
		bodyModel[302].rotateAngleZ = -1.13446401F;

		bodyModel[303].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 355
		bodyModel[303].setRotationPoint(-178F, -70F, 8.5F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 356
		bodyModel[304].setRotationPoint(-166.5F, -77.5F, 7.5F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 357
		bodyModel[305].setRotationPoint(-166.5F, -76.5F, 7.5F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 358
		bodyModel[306].setRotationPoint(-166.5F, -75.5F, 7.5F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 359
		bodyModel[307].setRotationPoint(-173F, -60F, 12F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 360
		bodyModel[308].setRotationPoint(-173F, -60F, 5F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 361
		bodyModel[309].setRotationPoint(-178F, -69.75F, 5.5F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 362
		bodyModel[310].setRotationPoint(-178F, -69.75F, 9.5F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 363
		bodyModel[311].setRotationPoint(-178F, -72.75F, 11.5F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364
		bodyModel[312].setRotationPoint(-178F, -72.75F, 5.5F);

		bodyModel[313].addShapeBox(0F, 1F, 0F, 10, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 365
		bodyModel[313].setRotationPoint(-160F, -62F, 4F);
		bodyModel[313].rotateAngleZ = -0.10471976F;

		bodyModel[314].addShapeBox(9F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 366
		bodyModel[314].setRotationPoint(-160F, -62F, 4F);
		bodyModel[314].rotateAngleZ = -0.10471976F;

		bodyModel[315].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 367
		bodyModel[315].setRotationPoint(-160F, -62F, 13F);
		bodyModel[315].rotateAngleZ = -0.10471976F;

		bodyModel[316].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 368
		bodyModel[316].setRotationPoint(-160F, -62F, 4F);
		bodyModel[316].rotateAngleZ = -0.10471976F;

		bodyModel[317].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 369
		bodyModel[317].setRotationPoint(-160F, -62F, 4F);
		bodyModel[317].rotateAngleZ = -0.10471976F;

		bodyModel[318].addShapeBox(0F, 0F, 0F, 1, 13, 10, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 370
		bodyModel[318].setRotationPoint(-151F, -74F, 4F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 371
		bodyModel[319].setRotationPoint(-149F, -78F, 6F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 1, 13, 8, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372
		bodyModel[320].setRotationPoint(-152F, -73F, 5F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 373
		bodyModel[321].setRotationPoint(-152.3F, -73.3F, 10F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 374
		bodyModel[322].setRotationPoint(-152.3F, -73.3F, 7F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 375
		bodyModel[323].setRotationPoint(-151F, -71F, 12F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 376
		bodyModel[324].setRotationPoint(-151F, -71F, 5F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 377
		bodyModel[325].setRotationPoint(-157F, -61F, 14F);
		bodyModel[325].rotateAngleZ = 0.78539816F;

		bodyModel[326].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 378
		bodyModel[326].setRotationPoint(-157F, -61F, 3F);
		bodyModel[326].rotateAngleZ = 0.78539816F;

		bodyModel[327].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 379
		bodyModel[327].setRotationPoint(-149.5F, -77.5F, 7.5F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 380
		bodyModel[328].setRotationPoint(-149.5F, -76.5F, 7.5F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 381
		bodyModel[329].setRotationPoint(-149.5F, -75.5F, 7.5F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 382
		bodyModel[330].setRotationPoint(-156F, -60F, 12F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 383
		bodyModel[331].setRotationPoint(-156F, -60F, 5F);

		bodyModel[332].addShapeBox(0F, 1F, 0F, 10, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 384
		bodyModel[332].setRotationPoint(-160F, -62F, -14F);
		bodyModel[332].rotateAngleZ = -0.10471976F;

		bodyModel[333].addShapeBox(9F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 385
		bodyModel[333].setRotationPoint(-160F, -62F, -14F);
		bodyModel[333].rotateAngleZ = -0.10471976F;

		bodyModel[334].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 386
		bodyModel[334].setRotationPoint(-160F, -62F, -14F);
		bodyModel[334].rotateAngleZ = -0.10471976F;

		bodyModel[335].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 387
		bodyModel[335].setRotationPoint(-160F, -62F, -5F);
		bodyModel[335].rotateAngleZ = -0.10471976F;

		bodyModel[336].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 388
		bodyModel[336].setRotationPoint(-160F, -62F, -14F);
		bodyModel[336].rotateAngleZ = -0.10471976F;

		bodyModel[337].addShapeBox(0F, 0F, 0F, 1, 13, 10, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 389
		bodyModel[337].setRotationPoint(-151F, -74F, -14F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 390
		bodyModel[338].setRotationPoint(-149F, -78F, -12F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 1, 13, 8, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 391
		bodyModel[339].setRotationPoint(-152F, -73F, -13F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 392
		bodyModel[340].setRotationPoint(-152.3F, -73.3F, -11F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 393
		bodyModel[341].setRotationPoint(-152.3F, -73.3F, -8F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[342].setRotationPoint(-151F, -71F, -13F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 395
		bodyModel[343].setRotationPoint(-151F, -71F, -6F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 396
		bodyModel[344].setRotationPoint(-157F, -61F, -15F);
		bodyModel[344].rotateAngleZ = 0.78539816F;

		bodyModel[345].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 397
		bodyModel[345].setRotationPoint(-157F, -61F, -4F);
		bodyModel[345].rotateAngleZ = 0.78539816F;

		bodyModel[346].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 398
		bodyModel[346].setRotationPoint(-149.5F, -77.5F, -10.5F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 399
		bodyModel[347].setRotationPoint(-149.5F, -76.5F, -10.5F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 400
		bodyModel[348].setRotationPoint(-149.5F, -75.5F, -10.5F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 401
		bodyModel[349].setRotationPoint(-156F, -60F, -13F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 402
		bodyModel[350].setRotationPoint(-156F, -60F, -6F);
	}

	private void inittailModel_1()
	{
		tailModel[0] = new ModelRendererTurbo(this, 1329, 145, textureX, textureY); // Box 62
		tailModel[1] = new ModelRendererTurbo(this, 1433, 65, textureX, textureY); // Box 65
		tailModel[2] = new ModelRendererTurbo(this, 1329, 137, textureX, textureY); // Box 68
		tailModel[3] = new ModelRendererTurbo(this, 1129, 1, textureX, textureY); // Box 71
		tailModel[4] = new ModelRendererTurbo(this, 257, 465, textureX, textureY); // Box 225
		tailModel[5] = new ModelRendererTurbo(this, 1, 305, textureX, textureY); // Box 228
		tailModel[6] = new ModelRendererTurbo(this, 841, 457, textureX, textureY); // Box 231
		tailModel[7] = new ModelRendererTurbo(this, 889, 169, textureX, textureY); // Box 234

		tailModel[0].addShapeBox(0F, 0F, 0F, 24, 8, 70, 0F,0F, -3F, 0F, -9F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -9F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 62
		tailModel[0].setRotationPoint(246F, -88F, -80F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 15, 3, 17, 0F,0F, -1F, 0F, -5F, -1F, -6F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -5F, -1F, -6F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 65
		tailModel[1].setRotationPoint(246F, -85F, -97F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 27, 64, 3, 0F,0F, 0F, 0F, -9F, 0F, -2F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 68
		tailModel[2].setRotationPoint(243F, -153F, -3F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 18, 18, 3, 0F,0F, 0F, -1F, -6F, -6F, -2F, -6F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 71
		tailModel[3].setRotationPoint(243F, -171F, -3F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 24, 8, 70, 0F,0F, 0F, 0F, 0F, -3F, 0F, -9F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -9F, -3F, 0F, 0F, -2F, 0F); // Box 225
		tailModel[4].setRotationPoint(246F, -88F, 10F);

		tailModel[5].addShapeBox(0F, 0F, 0F, 15, 3, 17, 0F,0F, 0F, 0F, 0F, -1F, 0F, -5F, -1F, -6F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -5F, -1F, -6F, 0F, -1F, 0F); // Box 228
		tailModel[5].setRotationPoint(246F, -85F, 80F);

		tailModel[6].addShapeBox(0F, 0F, 0F, 27, 64, 3, 0F,0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, -2F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -2F, 0F, 0.5F, 0F); // Box 231
		tailModel[6].setRotationPoint(243F, -153F, 0F);

		tailModel[7].addShapeBox(0F, 0F, 0F, 18, 18, 3, 0F,0F, 0F, 0F, -6F, -6F, 0F, -6F, -6F, -2F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 234
		tailModel[7].setRotationPoint(243F, -171F, 0F);
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 81, 137, textureX, textureY); // Box 52
		leftWingModel[1] = new ModelRendererTurbo(this, 337, 121, textureX, textureY); // Box 53
		leftWingModel[2] = new ModelRendererTurbo(this, 801, 145, textureX, textureY); // Box 54
		leftWingModel[3] = new ModelRendererTurbo(this, 1825, 129, textureX, textureY); // Box 55
		leftWingModel[4] = new ModelRendererTurbo(this, 497, 137, textureX, textureY); // Box 56
		leftWingModel[5] = new ModelRendererTurbo(this, 1617, 137, textureX, textureY); // Box 57
		leftWingModel[6] = new ModelRendererTurbo(this, 2025, 137, textureX, textureY); // Import Box69
		leftWingModel[7] = new ModelRendererTurbo(this, 2033, 137, textureX, textureY); // Import Box70
		leftWingModel[8] = new ModelRendererTurbo(this, 2041, 137, textureX, textureY); // Import Box71
		leftWingModel[9] = new ModelRendererTurbo(this, 937, 145, textureX, textureY); // Import Box72
		leftWingModel[10] = new ModelRendererTurbo(this, 1161, 185, textureX, textureY); // Import Box164
		leftWingModel[11] = new ModelRendererTurbo(this, 1825, 249, textureX, textureY); // Import Box165
		leftWingModel[12] = new ModelRendererTurbo(this, 1937, 249, textureX, textureY); // Import Box167
		leftWingModel[13] = new ModelRendererTurbo(this, 1, 257, textureX, textureY); // Import Box169
		leftWingModel[14] = new ModelRendererTurbo(this, 801, 265, textureX, textureY); // Import Box170
		leftWingModel[15] = new ModelRendererTurbo(this, 1593, 265, textureX, textureY); // Import Box173
		leftWingModel[16] = new ModelRendererTurbo(this, 1161, 273, textureX, textureY); // Box 154
		leftWingModel[17] = new ModelRendererTurbo(this, 1329, 273, textureX, textureY); // Box 155
		leftWingModel[18] = new ModelRendererTurbo(this, 1, 281, textureX, textureY); // Box 156
		leftWingModel[19] = new ModelRendererTurbo(this, 489, 281, textureX, textureY); // Box 157
		leftWingModel[20] = new ModelRendererTurbo(this, 561, 281, textureX, textureY); // Box 158
		leftWingModel[21] = new ModelRendererTurbo(this, 1441, 281, textureX, textureY); // Box 159

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 54, 12, 146, 0F,0F, 0F, 0F, -21F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -7F, 0F, -21F, -7F, 0F, 0F, 9F, 0F, 0F, 9F, 0F); // Box 52
		leftWingModel[0].setRotationPoint(-77F, -111F, -359F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 5, 12, 146, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 8F, -13F, 0F, 0F, -9F, 0F, 0F, -7F, 0F, 0F, 9F, 0F, 8F, 5F, 0F); // Box 53
		leftWingModel[1].setRotationPoint(-82F, -111F, -359F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 32, 12, 146, 0F,0F, 0F, 0F, -21F, -2F, 0F, 2F, -14F, 0F, -21F, -9F, 0F, 0F, -7F, 0F, -21F, -9F, 0F, 2F, 4F, 0F, -21F, 9F, 0F); // Box 54
		leftWingModel[2].setRotationPoint(-44F, -111F, -359F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 33, 5, 20, 0F,-11F, -1F, 0F, -16F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, -3F, 0F, -16F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		leftWingModel[3].setRotationPoint(-77F, -111F, -379F);

		leftWingModel[4].addShapeBox(0F, 0F, 0F, 32, 5, 20, 0F,-9F, -1F, -3F, -16F, -1F, 0F, -27F, 0F, 0F, 0F, -2F, 0F, -9F, -3F, -3F, -16F, -3F, 0F, -27F, 0F, 0F, 0F, -2F, 0F); // Box 56
		leftWingModel[4].setRotationPoint(-82F, -111F, -379F);

		leftWingModel[5].addShapeBox(0F, 0F, 0F, 32, 5, 20, 0F,-15F, -1F, 0F, -4F, -1F, -4F, 10F, -2F, 0F, -31F, 0F, 0F, -15F, -3F, 0F, -4F, -3F, -4F, 10F, -2F, 0F, -31F, 0F, 0F); // Box 57
		leftWingModel[5].setRotationPoint(-75F, -111F, -379F);

		leftWingModel[6].addShapeBox(0F, 0F, 0F, 2, 58, 1, 0F,0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 3F, 0F, 0F); // Import Box69
		leftWingModel[6].setRotationPoint(-76F, -98F, -245.5F);

		leftWingModel[7].addShapeBox(0F, 0F, 0F, 2, 58, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 4F, 0F, 0F); // Import Box70
		leftWingModel[7].setRotationPoint(-46F, -94F, -246.5F);

		leftWingModel[8].addShapeBox(0F, 0F, 0F, 2, 58, 1, 0F,0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 3F, 0F, 0F); // Import Box71
		leftWingModel[8].setRotationPoint(-46F, -94F, -245.5F);

		leftWingModel[9].addShapeBox(0F, 0F, 0F, 2, 58, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 4F, 0F, 0F); // Import Box72
		leftWingModel[9].setRotationPoint(-76F, -98F, -246.5F);

		leftWingModel[10].addShapeBox(0F, 0F, 0F, 41, 16, 12, 0F,0F, -1F, 0F, 0F, -7F, 0F, -12F, -7F, -6F, 0F, -4F, -3F, 0F, 0F, 0F, 0F, 2F, 0F, -11F, 1F, -5F, 0F, 0F, -0.3F); // Import Box164
		leftWingModel[10].setRotationPoint(-49F, -42F, -245.5F);

		leftWingModel[11].addShapeBox(0F, 0F, 0F, 42, 16, 12, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -4F, -3F, 0F, -3F, -3F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F); // Import Box165
		leftWingModel[11].setRotationPoint(-91F, -42F, -245.5F);

		leftWingModel[12].addShapeBox(0F, 0F, 0F, 23, 16, 12, 0F,-6F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, -6F, -3F, -6F, 0F, -7F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -5F, -5F, -4F); // Import Box167
		leftWingModel[12].setRotationPoint(-114F, -42F, -245.5F);

		leftWingModel[13].addShapeBox(0F, 0F, 0F, 42, 11, 12, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -2F, -5F, 0F, -6F, -3F); // Import Box169
		leftWingModel[13].setRotationPoint(-91F, -28F, -245.5F);

		leftWingModel[14].addShapeBox(0F, 0F, 0F, 41, 7, 12, 0F,0F, 0F, 0F, 0F, -2F, 0F, -11F, -1F, -5F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, -3F, 0F, -13F, -1F, -9F, 0F, 0F, -9F); // Import Box170
		leftWingModel[14].setRotationPoint(-49F, -26F, -245.5F);

		leftWingModel[15].addShapeBox(0F, 0F, 0F, 23, 11, 12, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -5F, -2F, -4F, -7F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, -3F, -8F, -3F, -4F); // Import Box173
		leftWingModel[15].setRotationPoint(-114F, -33F, -245.5F);

		leftWingModel[16].addShapeBox(0F, 0F, 0F, 42, 16, 12, 0F,0F, -3F, -3F, 0F, -4F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F); // Box 154
		leftWingModel[16].setRotationPoint(-91F, -42F, -257.5F);

		leftWingModel[17].addShapeBox(0F, 0F, 0F, 42, 11, 12, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -6F, -3F, 0F, -2F, -5F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 155
		leftWingModel[17].setRotationPoint(-91F, -28F, -257.5F);

		leftWingModel[18].addShapeBox(0F, 0F, 0F, 23, 11, 12, 0F,-5F, -2F, -4F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -8F, -3F, -4F, 0F, -1F, -3F, 0F, 1F, 0F, -7F, -1F, 0F); // Box 156
		leftWingModel[18].setRotationPoint(-114F, -33F, -257.5F);

		leftWingModel[19].addShapeBox(0F, 0F, 0F, 23, 16, 12, 0F,-6F, -3F, -6F, 0F, -3F, -3F, 0F, 0F, 0F, -6F, -1F, 0F, -5F, -5F, -4F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -7F, 0F); // Box 157
		leftWingModel[19].setRotationPoint(-114F, -42F, -257.5F);

		leftWingModel[20].addShapeBox(0F, 0F, 0F, 41, 16, 12, 0F,0F, -4F, -3F, -12F, -7F, -6F, 0F, -7F, 0F, 0F, -1F, 0F, 0F, 0F, -0.3F, -11F, 1F, -5F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 158
		leftWingModel[20].setRotationPoint(-49F, -42F, -257.5F);

		leftWingModel[21].addShapeBox(0F, 0F, 0F, 41, 7, 12, 0F,0F, 0F, -0.3F, -11F, -1F, -5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, -13F, -1F, -9F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 159
		leftWingModel[21].setRotationPoint(-49F, -26F, -257.5F);
	}

	private void initrightWingModel_1()
	{
		rightWingModel[0] = new ModelRendererTurbo(this, 1233, 449, textureX, textureY); // Box 215
		rightWingModel[1] = new ModelRendererTurbo(this, 601, 457, textureX, textureY); // Box 216
		rightWingModel[2] = new ModelRendererTurbo(this, 761, 473, textureX, textureY); // Box 217
		rightWingModel[3] = new ModelRendererTurbo(this, 1489, 449, textureX, textureY); // Box 218
		rightWingModel[4] = new ModelRendererTurbo(this, 1753, 449, textureX, textureY); // Box 219
		rightWingModel[5] = new ModelRendererTurbo(this, 601, 457, textureX, textureY); // Box 220
		rightWingModel[6] = new ModelRendererTurbo(this, 1073, 145, textureX, textureY); // Box 300
		rightWingModel[7] = new ModelRendererTurbo(this, 673, 209, textureX, textureY); // Box 301
		rightWingModel[8] = new ModelRendererTurbo(this, 2041, 249, textureX, textureY); // Box 302
		rightWingModel[9] = new ModelRendererTurbo(this, 673, 273, textureX, textureY); // Box 303
		rightWingModel[10] = new ModelRendererTurbo(this, 1937, 497, textureX, textureY); // Box 304
		rightWingModel[11] = new ModelRendererTurbo(this, 1, 593, textureX, textureY); // Box 305
		rightWingModel[12] = new ModelRendererTurbo(this, 377, 465, textureX, textureY); // Box 306
		rightWingModel[13] = new ModelRendererTurbo(this, 1209, 569, textureX, textureY); // Box 307
		rightWingModel[14] = new ModelRendererTurbo(this, 601, 577, textureX, textureY); // Box 308
		rightWingModel[15] = new ModelRendererTurbo(this, 761, 481, textureX, textureY); // Box 309
		rightWingModel[16] = new ModelRendererTurbo(this, 257, 593, textureX, textureY); // Box 310
		rightWingModel[17] = new ModelRendererTurbo(this, 1921, 577, textureX, textureY); // Box 311
		rightWingModel[18] = new ModelRendererTurbo(this, 377, 497, textureX, textureY); // Box 312
		rightWingModel[19] = new ModelRendererTurbo(this, 113, 505, textureX, textureY); // Box 313
		rightWingModel[20] = new ModelRendererTurbo(this, 1121, 593, textureX, textureY); // Box 314
		rightWingModel[21] = new ModelRendererTurbo(this, 1937, 601, textureX, textureY); // Box 315

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 54, 12, 146, 0F,0F, -9F, 0F, 0F, -9F, 0F, -21F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, -21F, -7F, 0F, 0F, -7F, 0F); // Box 215
		rightWingModel[0].setRotationPoint(-77F, -111F, 213F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 5, 12, 146, 0F,8F, -13F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 8F, 5F, 0F, 0F, 9F, 0F, 0F, -7F, 0F, 0F, -9F, 0F); // Box 216
		rightWingModel[1].setRotationPoint(-82F, -111F, 213F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 32, 12, 146, 0F,-21F, -9F, 0F, 2F, -14F, 0F, -21F, -2F, 0F, 0F, 0F, 0F, -21F, 9F, 0F, 2F, 4F, 0F, -21F, -9F, 0F, 0F, -7F, 0F); // Box 217
		rightWingModel[2].setRotationPoint(-44F, -111F, 213F);

		rightWingModel[3].addShapeBox(0F, 0F, 0F, 33, 5, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, -16F, -1F, 0F, -11F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, -3F, 0F, -11F, -3F, 0F); // Box 218
		rightWingModel[3].setRotationPoint(-77F, -111F, 359F);

		rightWingModel[4].addShapeBox(0F, 0F, 0F, 32, 5, 20, 0F,0F, -2F, 0F, -27F, 0F, 0F, -16F, -1F, 0F, -9F, -1F, -3F, 0F, -2F, 0F, -27F, 0F, 0F, -16F, -3F, 0F, -9F, -3F, -3F); // Box 219
		rightWingModel[4].setRotationPoint(-82F, -111F, 359F);

		rightWingModel[5].addShapeBox(0F, 0F, 0F, 32, 5, 20, 0F,-31F, 0F, 0F, 10F, -2F, 0F, -4F, -1F, -4F, -15F, -1F, 0F, -31F, 0F, 0F, 10F, -2F, 0F, -4F, -3F, -4F, -15F, -3F, 0F); // Box 220
		rightWingModel[5].setRotationPoint(-75F, -111F, 359F);

		rightWingModel[6].addShapeBox(0F, 0F, 0F, 2, 58, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 4F, 0F, 0F); // Box 300
		rightWingModel[6].setRotationPoint(-76F, -98F, 244.5F);

		rightWingModel[7].addShapeBox(0F, 0F, 0F, 2, 58, 1, 0F,0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 3F, 0F, 0F); // Box 301
		rightWingModel[7].setRotationPoint(-46F, -94F, 245.5F);

		rightWingModel[8].addShapeBox(0F, 0F, 0F, 2, 58, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 4F, 0F, 0F); // Box 302
		rightWingModel[8].setRotationPoint(-46F, -94F, 244.5F);

		rightWingModel[9].addShapeBox(0F, 0F, 0F, 2, 58, 1, 0F,0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 3F, 0F, 0F); // Box 303
		rightWingModel[9].setRotationPoint(-76F, -98F, 245.5F);

		rightWingModel[10].addShapeBox(0F, 0F, 0F, 41, 16, 12, 0F,0F, -4F, -3F, -12F, -7F, -6F, 0F, -7F, 0F, 0F, -1F, 0F, 0F, 0F, -0.3F, -11F, 1F, -5F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 304
		rightWingModel[10].setRotationPoint(-49F, -42F, 233.5F);

		rightWingModel[11].addShapeBox(0F, 0F, 0F, 42, 16, 12, 0F,0F, -3F, -3F, 0F, -4F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F); // Box 305
		rightWingModel[11].setRotationPoint(-91F, -42F, 233.5F);

		rightWingModel[12].addShapeBox(0F, 0F, 0F, 23, 16, 12, 0F,-6F, -3F, -6F, 0F, -3F, -3F, 0F, 0F, 0F, -6F, -1F, 0F, -5F, -5F, -4F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -7F, 0F); // Box 306
		rightWingModel[12].setRotationPoint(-114F, -42F, 233.5F);

		rightWingModel[13].addShapeBox(0F, 0F, 0F, 42, 11, 12, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -6F, -3F, 0F, -2F, -5F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 307
		rightWingModel[13].setRotationPoint(-91F, -28F, 233.5F);

		rightWingModel[14].addShapeBox(0F, 0F, 0F, 41, 7, 12, 0F,0F, 0F, -0.3F, -11F, -1F, -5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, -13F, -1F, -9F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 308
		rightWingModel[14].setRotationPoint(-49F, -26F, 233.5F);

		rightWingModel[15].addShapeBox(0F, 0F, 0F, 23, 11, 12, 0F,-5F, -2F, -4F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -8F, -3F, -4F, 0F, -1F, -3F, 0F, 1F, 0F, -7F, -1F, 0F); // Box 309
		rightWingModel[15].setRotationPoint(-114F, -33F, 233.5F);

		rightWingModel[16].addShapeBox(0F, 0F, 0F, 42, 16, 12, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -4F, -3F, 0F, -3F, -3F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F); // Box 310
		rightWingModel[16].setRotationPoint(-91F, -42F, 245.5F);

		rightWingModel[17].addShapeBox(0F, 0F, 0F, 42, 11, 12, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -2F, -5F, 0F, -6F, -3F); // Box 311
		rightWingModel[17].setRotationPoint(-91F, -28F, 245.5F);

		rightWingModel[18].addShapeBox(0F, 0F, 0F, 23, 11, 12, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -5F, -2F, -4F, -7F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, -3F, -8F, -3F, -4F); // Box 312
		rightWingModel[18].setRotationPoint(-114F, -33F, 245.5F);

		rightWingModel[19].addShapeBox(0F, 0F, 0F, 23, 16, 12, 0F,-6F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, -6F, -3F, -6F, 0F, -7F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -5F, -5F, -4F); // Box 313
		rightWingModel[19].setRotationPoint(-114F, -42F, 245.5F);

		rightWingModel[20].addShapeBox(0F, 0F, 0F, 41, 16, 12, 0F,0F, -1F, 0F, 0F, -7F, 0F, -12F, -7F, -6F, 0F, -4F, -3F, 0F, 0F, 0F, 0F, 2F, 0F, -11F, 1F, -5F, 0F, 0F, -0.3F); // Box 314
		rightWingModel[20].setRotationPoint(-49F, -42F, 245.5F);

		rightWingModel[21].addShapeBox(0F, 0F, 0F, 41, 7, 12, 0F,0F, 0F, 0F, 0F, -2F, 0F, -11F, -1F, -5F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, -3F, 0F, -13F, -1F, -9F, 0F, 0F, -9F); // Box 315
		rightWingModel[21].setRotationPoint(-49F, -26F, 245.5F);
	}

	private void initPropeller()
	{
		propellerModels = new ModelRendererTurbo[4][4];
		propellerModels[0] = makeProp1(-136F, -84F, -63F);
		propellerModels[1] = makeProp2(-134F, -91F, -143F);
		propellerModels[2] = makeProp3(-136F, -84F, 63F);
		propellerModels[3] = makeProp4(-134F, -91F, 143F);
	}

	private ModelRendererTurbo[] makeProp1(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[4];
		prop[0] = new ModelRendererTurbo(this, 0, 470, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 470, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 0, 470, textureX, textureY);
		prop[3] = new ModelRendererTurbo(this, 0, 470, textureX, textureY);
		prop[0].addBox(-1F, -35F, -3F, 2, 35, 6, 0.0F);
		prop[1].addBox(-1F, -35F, -3F, 2, 35, 6, 0.0F);
		prop[2].addBox(-1F, -35F, -3F, 2, 35, 6, 0.0F);
		prop[3].addBox(-1F, -35F, -3F, 2, 35, 6, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		prop[3].setRotationPoint(i, j, k);
		return prop;
	}

	private ModelRendererTurbo[] makeProp2(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[4];
		prop[0] = new ModelRendererTurbo(this, 0, 470, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 470, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 0, 470, textureX, textureY);
		prop[3] = new ModelRendererTurbo(this, 0, 470, textureX, textureY);
		prop[0].addBox(-1F, -35F, -3F, 2, 35, 6, 0.0F);
		prop[1].addBox(-1F, -35F, -3F, 2, 35, 6, 0.0F);
		prop[2].addBox(-1F, -35F, -3F, 2, 35, 6, 0.0F);
		prop[3].addBox(-1F, -35F, -3F, 2, 35, 6, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		prop[3].setRotationPoint(i, j, k);
		return prop;
	}

	private ModelRendererTurbo[] makeProp3(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[4];
		prop[0] = new ModelRendererTurbo(this, 0, 470, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 470, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 0, 470, textureX, textureY);
		prop[3] = new ModelRendererTurbo(this, 0, 470, textureX, textureY);
		prop[0].addBox(-1F, -35F, -3F, 2, 35, 6, 0.0F);
		prop[1].addBox(-1F, -35F, -3F, 2, 35, 6, 0.0F);
		prop[2].addBox(-1F, -35F, -3F, 2, 35, 6, 0.0F);
		prop[3].addBox(-1F, -35F, -3F, 2, 35, 6, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		prop[3].setRotationPoint(i, j, k);
		return prop;
	}

	private ModelRendererTurbo[] makeProp4(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[4];
		prop[0] = new ModelRendererTurbo(this, 0, 471, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 471, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 0, 471, textureX, textureY);
		prop[3] = new ModelRendererTurbo(this, 0, 471, textureX, textureY);
		prop[0].addBox(-1F, -35F, -3F, 2, 35, 6, 0.0F);
		prop[1].addBox(-1F, -35F, -3F, 2, 35, 6, 0.0F);
		prop[2].addBox(-1F, -35F, -3F, 2, 35, 6, 0.0F);
		prop[3].addBox(-1F, -35F, -3F, 2, 35, 6, 0.0F);
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

		gun_2_Model[0] = new ModelRendererTurbo[118];
		gun_2_Model[0][0] = new ModelRendererTurbo(this, 1471, 661, textureX, textureY); // Box 4
		gun_2_Model[0][1] = new ModelRendererTurbo(this, 1527, 661, textureX, textureY); // Box 7
		gun_2_Model[0][2] = new ModelRendererTurbo(this, 1567, 661, textureX, textureY); // Box 8
		gun_2_Model[0][3] = new ModelRendererTurbo(this, 1607, 661, textureX, textureY); // Box 0
		gun_2_Model[0][4] = new ModelRendererTurbo(this, 1647, 661, textureX, textureY); // Box 1
		gun_2_Model[0][5] = new ModelRendererTurbo(this, 1687, 661, textureX, textureY); // Box 0
		gun_2_Model[0][6] = new ModelRendererTurbo(this, 1695, 661, textureX, textureY); // Box 1
		gun_2_Model[0][7] = new ModelRendererTurbo(this, 1703, 661, textureX, textureY); // Box 2
		gun_2_Model[0][8] = new ModelRendererTurbo(this, 1711, 661, textureX, textureY); // Box 3
		gun_2_Model[0][9] = new ModelRendererTurbo(this, 1719, 661, textureX, textureY); // Box 4
		gun_2_Model[0][10] = new ModelRendererTurbo(this, 1727, 661, textureX, textureY); // Box 5
		gun_2_Model[0][11] = new ModelRendererTurbo(this, 1735, 661, textureX, textureY); // Box 12
		gun_2_Model[0][12] = new ModelRendererTurbo(this, 1743, 661, textureX, textureY); // Box 13
		gun_2_Model[0][13] = new ModelRendererTurbo(this, 1751, 661, textureX, textureY); // Box 14
		gun_2_Model[0][14] = new ModelRendererTurbo(this, 1759, 661, textureX, textureY); // Box 15
		gun_2_Model[0][15] = new ModelRendererTurbo(this, 1767, 661, textureX, textureY); // Box 16
		gun_2_Model[0][16] = new ModelRendererTurbo(this, 1775, 661, textureX, textureY); // Box 17
		gun_2_Model[0][17] = new ModelRendererTurbo(this, 1783, 661, textureX, textureY); // Box 18
		gun_2_Model[0][18] = new ModelRendererTurbo(this, 1791, 661, textureX, textureY); // Box 19
		gun_2_Model[0][19] = new ModelRendererTurbo(this, 1799, 661, textureX, textureY); // Box 20
		gun_2_Model[0][20] = new ModelRendererTurbo(this, 1807, 661, textureX, textureY); // Box 21
		gun_2_Model[0][21] = new ModelRendererTurbo(this, 1815, 661, textureX, textureY); // Box 22
		gun_2_Model[0][22] = new ModelRendererTurbo(this, 1823, 661, textureX, textureY); // Box 23
		gun_2_Model[0][23] = new ModelRendererTurbo(this, 1831, 661, textureX, textureY); // Box 24
		gun_2_Model[0][24] = new ModelRendererTurbo(this, 1839, 661, textureX, textureY); // Box 25
		gun_2_Model[0][25] = new ModelRendererTurbo(this, 1847, 661, textureX, textureY); // Box 26
		gun_2_Model[0][26] = new ModelRendererTurbo(this, 1855, 661, textureX, textureY); // Box 27
		gun_2_Model[0][27] = new ModelRendererTurbo(this, 1863, 661, textureX, textureY); // Box 28
		gun_2_Model[0][28] = new ModelRendererTurbo(this, 1871, 661, textureX, textureY); // Box 29
		gun_2_Model[0][29] = new ModelRendererTurbo(this, 1879, 661, textureX, textureY); // Box 2
		gun_2_Model[0][30] = new ModelRendererTurbo(this, 1471, 669, textureX, textureY); // Box 3
		gun_2_Model[0][31] = new ModelRendererTurbo(this, 1527, 669, textureX, textureY); // Box 4
		gun_2_Model[0][32] = new ModelRendererTurbo(this, 1935, 661, textureX, textureY); // Box 0
		gun_2_Model[0][33] = new ModelRendererTurbo(this, 1943, 661, textureX, textureY); // Box 1
		gun_2_Model[0][34] = new ModelRendererTurbo(this, 1951, 661, textureX, textureY); // Box 2
		gun_2_Model[0][35] = new ModelRendererTurbo(this, 1959, 661, textureX, textureY); // Box 3
		gun_2_Model[0][36] = new ModelRendererTurbo(this, 1967, 661, textureX, textureY); // Box 6
		gun_2_Model[0][37] = new ModelRendererTurbo(this, 1975, 661, textureX, textureY); // Box 8
		gun_2_Model[0][38] = new ModelRendererTurbo(this, 1583, 669, textureX, textureY); // Box 9
		gun_2_Model[0][39] = new ModelRendererTurbo(this, 1591, 669, textureX, textureY); // Box 10
		gun_2_Model[0][40] = new ModelRendererTurbo(this, 1599, 669, textureX, textureY); // Box 11
		gun_2_Model[0][41] = new ModelRendererTurbo(this, 1607, 669, textureX, textureY); // Box 12
		gun_2_Model[0][42] = new ModelRendererTurbo(this, 1615, 669, textureX, textureY); // Box 13
		gun_2_Model[0][43] = new ModelRendererTurbo(this, 1623, 669, textureX, textureY); // Box 14
		gun_2_Model[0][44] = new ModelRendererTurbo(this, 1631, 669, textureX, textureY); // Box 15
		gun_2_Model[0][45] = new ModelRendererTurbo(this, 1639, 669, textureX, textureY); // Box 15
		gun_2_Model[0][46] = new ModelRendererTurbo(this, 1647, 669, textureX, textureY); // Box 15
		gun_2_Model[0][47] = new ModelRendererTurbo(this, 1655, 669, textureX, textureY); // Box 15
		gun_2_Model[0][48] = new ModelRendererTurbo(this, 1663, 669, textureX, textureY); // Box 15
		gun_2_Model[0][49] = new ModelRendererTurbo(this, 1671, 669, textureX, textureY); // Box 15
		gun_2_Model[0][50] = new ModelRendererTurbo(this, 1679, 669, textureX, textureY); // Box 15
		gun_2_Model[0][51] = new ModelRendererTurbo(this, 1687, 669, textureX, textureY); // Box 15
		gun_2_Model[0][52] = new ModelRendererTurbo(this, 1695, 669, textureX, textureY); // Box 23
		gun_2_Model[0][53] = new ModelRendererTurbo(this, 1703, 669, textureX, textureY); // Box 24
		gun_2_Model[0][54] = new ModelRendererTurbo(this, 1711, 669, textureX, textureY); // Box 25
		gun_2_Model[0][55] = new ModelRendererTurbo(this, 1719, 669, textureX, textureY); // Box 26
		gun_2_Model[0][56] = new ModelRendererTurbo(this, 1727, 669, textureX, textureY); // Box 27
		gun_2_Model[0][57] = new ModelRendererTurbo(this, 1735, 669, textureX, textureY); // Box 28
		gun_2_Model[0][58] = new ModelRendererTurbo(this, 1743, 669, textureX, textureY); // Box 29
		gun_2_Model[0][59] = new ModelRendererTurbo(this, 1751, 669, textureX, textureY); // Box 30
		gun_2_Model[0][60] = new ModelRendererTurbo(this, 1759, 669, textureX, textureY); // Box 31
		gun_2_Model[0][61] = new ModelRendererTurbo(this, 1767, 669, textureX, textureY); // Box 32
		gun_2_Model[0][62] = new ModelRendererTurbo(this, 1775, 669, textureX, textureY); // Box 33
		gun_2_Model[0][63] = new ModelRendererTurbo(this, 1783, 669, textureX, textureY); // Box 34
		gun_2_Model[0][64] = new ModelRendererTurbo(this, 1791, 669, textureX, textureY); // Box 35
		gun_2_Model[0][65] = new ModelRendererTurbo(this, 1799, 669, textureX, textureY); // Box 36
		gun_2_Model[0][66] = new ModelRendererTurbo(this, 1807, 669, textureX, textureY); // Box 37
		gun_2_Model[0][67] = new ModelRendererTurbo(this, 1815, 669, textureX, textureY); // Box 38
		gun_2_Model[0][68] = new ModelRendererTurbo(this, 1823, 669, textureX, textureY); // Box 39
		gun_2_Model[0][69] = new ModelRendererTurbo(this, 1831, 669, textureX, textureY); // Box 40
		gun_2_Model[0][70] = new ModelRendererTurbo(this, 1839, 669, textureX, textureY); // Box 41
		gun_2_Model[0][71] = new ModelRendererTurbo(this, 1847, 669, textureX, textureY); // Box 42
		gun_2_Model[0][72] = new ModelRendererTurbo(this, 1855, 669, textureX, textureY); // Box 43
		gun_2_Model[0][73] = new ModelRendererTurbo(this, 1863, 669, textureX, textureY); // Box 44
		gun_2_Model[0][74] = new ModelRendererTurbo(this, 1871, 669, textureX, textureY); // Box 45
		gun_2_Model[0][75] = new ModelRendererTurbo(this, 1911, 669, textureX, textureY); // Box 46
		gun_2_Model[0][76] = new ModelRendererTurbo(this, 1935, 669, textureX, textureY); // Box 47
		gun_2_Model[0][77] = new ModelRendererTurbo(this, 1959, 669, textureX, textureY); // Box 48
		gun_2_Model[0][78] = new ModelRendererTurbo(this, 1471, 677, textureX, textureY); // Box 49
		gun_2_Model[0][79] = new ModelRendererTurbo(this, 1495, 677, textureX, textureY); // Box 0
		gun_2_Model[0][80] = new ModelRendererTurbo(this, 1535, 677, textureX, textureY); // Box 1
		gun_2_Model[0][81] = new ModelRendererTurbo(this, 1575, 677, textureX, textureY); // Box 3
		gun_2_Model[0][82] = new ModelRendererTurbo(this, 1615, 677, textureX, textureY); // Box 4
		gun_2_Model[0][83] = new ModelRendererTurbo(this, 1655, 677, textureX, textureY); // Box 0
		gun_2_Model[0][84] = new ModelRendererTurbo(this, 1679, 677, textureX, textureY); // Box 5
		gun_2_Model[0][85] = new ModelRendererTurbo(this, 1703, 677, textureX, textureY); // Box 0
		gun_2_Model[0][86] = new ModelRendererTurbo(this, 1735, 677, textureX, textureY); // Box 1
		gun_2_Model[0][87] = new ModelRendererTurbo(this, 1767, 677, textureX, textureY); // Box 2
		gun_2_Model[0][88] = new ModelRendererTurbo(this, 1799, 677, textureX, textureY); // Box 3
		gun_2_Model[0][89] = new ModelRendererTurbo(this, 1831, 677, textureX, textureY); // Box 5
		gun_2_Model[0][90] = new ModelRendererTurbo(this, 1847, 677, textureX, textureY); // Box 6
		gun_2_Model[0][91] = new ModelRendererTurbo(this, 1863, 677, textureX, textureY); // Box 9
		gun_2_Model[0][92] = new ModelRendererTurbo(this, 1871, 677, textureX, textureY); // Box 10
		gun_2_Model[0][93] = new ModelRendererTurbo(this, 1879, 677, textureX, textureY); // Box 11
		gun_2_Model[0][94] = new ModelRendererTurbo(this, 1887, 677, textureX, textureY); // Box 12
		gun_2_Model[0][95] = new ModelRendererTurbo(this, 1903, 677, textureX, textureY); // Box 13
		gun_2_Model[0][96] = new ModelRendererTurbo(this, 1927, 677, textureX, textureY); // Box 14
		gun_2_Model[0][97] = new ModelRendererTurbo(this, 1951, 677, textureX, textureY); // Box 15
		gun_2_Model[0][98] = new ModelRendererTurbo(this, 1975, 677, textureX, textureY); // Box 25
		gun_2_Model[0][99] = new ModelRendererTurbo(this, 1791, 685, textureX, textureY); // Box 27
		gun_2_Model[0][100] = new ModelRendererTurbo(this, 1799, 685, textureX, textureY); // Box 28
		gun_2_Model[0][101] = new ModelRendererTurbo(this, 1807, 685, textureX, textureY); // Box 29
		gun_2_Model[0][102] = new ModelRendererTurbo(this, 1815, 685, textureX, textureY); // Box 29
		gun_2_Model[0][103] = new ModelRendererTurbo(this, 1823, 685, textureX, textureY); // Box 31
		gun_2_Model[0][104] = new ModelRendererTurbo(this, 1831, 685, textureX, textureY); // Box 32
		gun_2_Model[0][105] = new ModelRendererTurbo(this, 1839, 685, textureX, textureY); // Box 33
		gun_2_Model[0][106] = new ModelRendererTurbo(this, 1847, 685, textureX, textureY); // Box 34
		gun_2_Model[0][107] = new ModelRendererTurbo(this, 1855, 685, textureX, textureY); // Box 35
		gun_2_Model[0][108] = new ModelRendererTurbo(this, 1863, 685, textureX, textureY); // Box 36
		gun_2_Model[0][109] = new ModelRendererTurbo(this, 1871, 685, textureX, textureY); // Box 37
		gun_2_Model[0][110] = new ModelRendererTurbo(this, 1879, 685, textureX, textureY); // Box 38
		gun_2_Model[0][111] = new ModelRendererTurbo(this, 1887, 685, textureX, textureY); // Box 38
		gun_2_Model[0][112] = new ModelRendererTurbo(this, 1895, 685, textureX, textureY); // Box 38
		gun_2_Model[0][113] = new ModelRendererTurbo(this, 1903, 685, textureX, textureY); // Box 0
		gun_2_Model[0][114] = new ModelRendererTurbo(this, 1943, 685, textureX, textureY); // Box 1
		gun_2_Model[0][115] = new ModelRendererTurbo(this, 1471, 693, textureX, textureY); // Box 2
		gun_2_Model[0][116] = new ModelRendererTurbo(this, 1511, 693, textureX, textureY); // Box 3
		gun_2_Model[0][117] = new ModelRendererTurbo(this, 1551, 693, textureX, textureY); // Box 4

		gun_2_Model[0][0].addShapeBox(0F, 0F, 0F, 24, 1, 1, 0F,-18F, 0F, 0F, 23.125F, 0F, 0F, 23.125F, 0F, -0.625F, -18F, 0F, -0.625F, -18F, -0.625F, 0F, 23.125F, -0.625F, 0F, 23.125F, -0.75F, -0.75F, -18F, -0.75F, -0.75F); // Box 4

		gun_2_Model[0][1].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,-18F, 0.93F, -0.25F, 18F, 0.93F, -0.25F, 18F, 0.75F, -0.25F, -18F, 0.75F, -0.25F, -18F, -1.75F, -0.75F, 18F, -1.75F, -0.75F, 18F, -1.25F, -0.08F, -18F, -1.25F, -0.08F); // Box 7

		gun_2_Model[0][2].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,-18F, -0.75F, -0.75F, 18F, -0.75F, -0.75F, 18F, -0.25F, -0.08F, -18F, -0.25F, -0.08F, -18F, -0.07F, -0.25F, 18F, -0.07F, -0.25F, 18F, -0.25F, -0.25F, -18F, -0.25F, -0.25F); // Box 8

		gun_2_Model[0][3].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,-18F, -0.25F, 0.92F, 18F, -0.25F, 0.92F, 18F, -0.75F, -1.75F, -18F, -0.75F, -1.75F, -18F, -0.25F, 0.75F, 18F, -0.25F, 0.75F, 18F, -0.07F, -1.25F, -18F, -0.07F, -1.25F); // Box 0

		gun_2_Model[0][4].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,-18F, 0.75F, 0.75F, 18F, 0.75F, 0.75F, 18F, 0.93F, -1.25F, -18F, 0.93F, -1.25F, -18F, -1.25F, 0.92F, 18F, -1.25F, 0.92F, 18F, -1.75F, -1.75F, -18F, -1.75F, -1.75F); // Box 1

		gun_2_Model[0][5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-20F, 1F, 0F, 20F, 1F, 0F, 20F, 0.75F, -0.25F, -20F, 0.75F, -0.25F, -20F, -1.75F, -0.75F, 20F, -1.75F, -0.75F, 20F, -1F, 0F, -20F, -1F, 0F); // Box 0

		gun_2_Model[0][6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-23F, 1F, 0F, 23F, 1F, 0F, 23F, 0.75F, -0.25F, -23F, 0.75F, -0.25F, -23F, -1.75F, -0.75F, 23F, -1.75F, -0.75F, 23F, -1F, 0F, -23F, -1F, 0F); // Box 1

		gun_2_Model[0][7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-35F, 1F, 0F, 35F, 1F, 0F, 35F, 0.75F, -0.25F, -35F, 0.75F, -0.25F, -35F, -1.75F, -0.75F, 35F, -1.75F, -0.75F, 35F, -1F, 0F, -35F, -1F, 0F); // Box 2

		gun_2_Model[0][8].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-26F, 1F, 0F, 26F, 1F, 0F, 26F, 0.75F, -0.25F, -26F, 0.75F, -0.25F, -26F, -1.75F, -0.75F, 26F, -1.75F, -0.75F, 26F, -1F, 0F, -26F, -1F, 0F); // Box 3

		gun_2_Model[0][9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-29F, 1F, 0F, 29F, 1F, 0F, 29F, 0.75F, -0.25F, -29F, 0.75F, -0.25F, -29F, -1.75F, -0.75F, 29F, -1.75F, -0.75F, 29F, -1F, 0F, -29F, -1F, 0F); // Box 4

		gun_2_Model[0][10].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-32F, 1F, 0F, 32F, 1F, 0F, 32F, 0.75F, -0.25F, -32F, 0.75F, -0.25F, -32F, -1.75F, -0.75F, 32F, -1.75F, -0.75F, 32F, -1F, 0F, -32F, -1F, 0F); // Box 5

		gun_2_Model[0][11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-32F, 0.75F, 0.75F, 32F, 0.75F, 0.75F, 32F, 1F, -1F, -32F, 1F, -1F, -32F, -1F, 1F, 32F, -1F, 1F, 32F, -1.75F, -1.75F, -32F, -1.75F, -1.75F); // Box 12

		gun_2_Model[0][12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-29F, 0.75F, 0.75F, 29F, 0.75F, 0.75F, 29F, 1F, -1F, -29F, 1F, -1F, -29F, -1F, 1F, 29F, -1F, 1F, 29F, -1.75F, -1.75F, -29F, -1.75F, -1.75F); // Box 13

		gun_2_Model[0][13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-26F, 0.75F, 0.75F, 26F, 0.75F, 0.75F, 26F, 1F, -1F, -26F, 1F, -1F, -26F, -1F, 1F, 26F, -1F, 1F, 26F, -1.75F, -1.75F, -26F, -1.75F, -1.75F); // Box 14

		gun_2_Model[0][14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-35F, 0.75F, 0.75F, 35F, 0.75F, 0.75F, 35F, 1F, -1F, -35F, 1F, -1F, -35F, -1F, 1F, 35F, -1F, 1F, 35F, -1.75F, -1.75F, -35F, -1.75F, -1.75F); // Box 15

		gun_2_Model[0][15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-23F, 0.75F, 0.75F, 23F, 0.75F, 0.75F, 23F, 1F, -1F, -23F, 1F, -1F, -23F, -1F, 1F, 23F, -1F, 1F, 23F, -1.75F, -1.75F, -23F, -1.75F, -1.75F); // Box 16

		gun_2_Model[0][16].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-20F, 0.75F, 0.75F, 20F, 0.75F, 0.75F, 20F, 1F, -1F, -20F, 1F, -1F, -20F, -1F, 1F, 20F, -1F, 1F, 20F, -1.75F, -1.75F, -20F, -1.75F, -1.75F); // Box 17

		gun_2_Model[0][17].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-32F, 0F, 1F, 32F, 0F, 1F, 32F, -0.75F, -1.75F, -32F, -0.75F, -1.75F, -32F, -0.25F, 0.75F, 32F, -0.25F, 0.75F, 32F, 0F, -1F, -32F, 0F, -1F); // Box 18

		gun_2_Model[0][18].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-29F, 0F, 1F, 29F, 0F, 1F, 29F, -0.75F, -1.75F, -29F, -0.75F, -1.75F, -29F, -0.25F, 0.75F, 29F, -0.25F, 0.75F, 29F, 0F, -1F, -29F, 0F, -1F); // Box 19

		gun_2_Model[0][19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-26F, 0F, 1F, 26F, 0F, 1F, 26F, -0.75F, -1.75F, -26F, -0.75F, -1.75F, -26F, -0.25F, 0.75F, 26F, -0.25F, 0.75F, 26F, 0F, -1F, -26F, 0F, -1F); // Box 20

		gun_2_Model[0][20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-35F, 0F, 1F, 35F, 0F, 1F, 35F, -0.75F, -1.75F, -35F, -0.75F, -1.75F, -35F, -0.25F, 0.75F, 35F, -0.25F, 0.75F, 35F, 0F, -1F, -35F, 0F, -1F); // Box 21

		gun_2_Model[0][21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-23F, 0F, 1F, 23F, 0F, 1F, 23F, -0.75F, -1.75F, -23F, -0.75F, -1.75F, -23F, -0.25F, 0.75F, 23F, -0.25F, 0.75F, 23F, 0F, -1F, -23F, 0F, -1F); // Box 22

		gun_2_Model[0][22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-20F, 0F, 1F, 20F, 0F, 1F, 20F, -0.75F, -1.75F, -20F, -0.75F, -1.75F, -20F, -0.25F, 0.75F, 20F, -0.25F, 0.75F, 20F, 0F, -1F, -20F, 0F, -1F); // Box 23

		gun_2_Model[0][23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-20F, -0.75F, -0.75F, 20F, -0.75F, -0.75F, 20F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, 0F, 20F, 0F, 0F, 20F, -0.25F, -0.25F, -20F, -0.25F, -0.25F); // Box 24

		gun_2_Model[0][24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-23F, -0.75F, -0.75F, 23F, -0.75F, -0.75F, 23F, 0F, 0F, -23F, 0F, 0F, -23F, 0F, 0F, 23F, 0F, 0F, 23F, -0.25F, -0.25F, -23F, -0.25F, -0.25F); // Box 25

		gun_2_Model[0][25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-35F, -0.75F, -0.75F, 35F, -0.75F, -0.75F, 35F, 0F, 0F, -35F, 0F, 0F, -35F, 0F, 0F, 35F, 0F, 0F, 35F, -0.25F, -0.25F, -35F, -0.25F, -0.25F); // Box 26

		gun_2_Model[0][26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-26F, -0.75F, -0.75F, 26F, -0.75F, -0.75F, 26F, 0F, 0F, -26F, 0F, 0F, -26F, 0F, 0F, 26F, 0F, 0F, 26F, -0.25F, -0.25F, -26F, -0.25F, -0.25F); // Box 27

		gun_2_Model[0][27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-29F, -0.75F, -0.75F, 29F, -0.75F, -0.75F, 29F, 0F, 0F, -29F, 0F, 0F, -29F, 0F, 0F, 29F, 0F, 0F, 29F, -0.25F, -0.25F, -29F, -0.25F, -0.25F); // Box 28

		gun_2_Model[0][28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-32F, -0.75F, -0.75F, 32F, -0.75F, -0.75F, 32F, 0F, 0F, -32F, 0F, 0F, -32F, 0F, 0F, 32F, 0F, 0F, 32F, -0.25F, -0.25F, -32F, -0.25F, -0.25F); // Box 29

		gun_2_Model[0][29].addShapeBox(0F, 0F, 0F, 24, 1, 1, 0F,-18F, 0F, 0.375F, 23.125F, 0F, 0.375F, 23.125F, 0F, -1F, -18F, 0F, -1F, -18F, -0.75F, 0.25F, 23.125F, -0.75F, 0.25F, 23.125F, -0.625F, -1F, -18F, -0.625F, -1F); // Box 2

		gun_2_Model[0][30].addShapeBox(0F, 0F, 0F, 24, 1, 1, 0F,-18F, 0.25F, 0.25F, 23.125F, 0.25F, 0.25F, 23.125F, 0.375F, -1F, -18F, 0.375F, -1F, -18F, -1F, 0.375F, 23.125F, -1F, 0.375F, 23.125F, -1F, -1F, -18F, -1F, -1F); // Box 3

		gun_2_Model[0][31].addShapeBox(0F, 0F, 0F, 24, 1, 1, 0F,-18F, 0.375F, 0F, 23.125F, 0.375F, 0F, 23.125F, 0.25F, -0.75F, -18F, 0.25F, -0.75F, -18F, -1F, 0F, 23.125F, -1F, 0F, 23.125F, -1F, -0.625F, -18F, -1F, -0.625F); // Box 4

		gun_2_Model[0][32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-36F, 1F, 0F, 36F, 1F, 0F, 36F, 0.75F, -0.25F, -36F, 0.75F, -0.25F, -36F, -1F, 0F, 36F, -1F, 0F, 36F, -1F, 0F, -36F, -1F, 0F); // Box 0

		gun_2_Model[0][33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-36F, 0.75F, 0.75F, 36F, 0.75F, 0.75F, 36F, 1F, -1F, -36F, 1F, -1F, -36F, -1F, 1F, 36F, -1F, 1F, 36F, -1F, -1F, -36F, -1F, -1F); // Box 1

		gun_2_Model[0][34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-36F, 0F, 1F, 36F, 0F, 1F, 36F, 0F, -1F, -36F, 0F, -1F, -36F, -0.25F, 0.75F, 36F, -0.25F, 0.75F, 36F, 0F, -1F, -36F, 0F, -1F); // Box 2

		gun_2_Model[0][35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-36F, 0F, 0F, 36F, 0F, 0F, 36F, 0F, 0F, -36F, 0F, 0F, -36F, 0F, 0F, 36F, 0F, 0F, 36F, -0.25F, -0.25F, -36F, -0.25F, -0.25F); // Box 3

		gun_2_Model[0][36].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-43F, 0F, 0F, 44.25F, 0F, 0F, 44.25F, 0F, -0.375F, -43F, 0F, -0.5F, -43F, -0.5F, 0F, 44.25F, -0.375F, 0F, 44.25F, -0.5F, -0.5F, -43F, -0.625F, -0.625F); // Box 6

		gun_2_Model[0][37].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-46.75F, 0F, 0F, 46F, 0F, 0F, 46F, 0F, -0.375F, -46.75F, 0F, -0.375F, -46.75F, -0.375F, 0F, 46F, -0.375F, 0F, 46F, -0.5F, -0.5F, -46.75F, -0.5F, -0.5F); // Box 8

		gun_2_Model[0][38].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-46.5F, -0.25F, 0F, 45.75F, 0F, 0F, 45.75F, 0F, -0.375F, -46.5F, -0.25F, -0.45F, -46.5F, -0.375F, 0F, 45.75F, -0.375F, 0F, 45.75F, -0.5F, -0.5F, -46.5F, -0.5F, -0.5F); // Box 9

		gun_2_Model[0][39].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-46.25F, 0F, 0F, 45.5F, -0.25F, 0F, 45.5F, -0.25F, -0.45F, -46.25F, 0F, -0.375F, -46.25F, -0.375F, 0F, 45.5F, -0.375F, 0F, 45.5F, -0.5F, -0.5F, -46.25F, -0.5F, -0.5F); // Box 10

		gun_2_Model[0][40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-46F, -0.25F, 0F, 45.25F, 0F, 0F, 45.25F, 0F, -0.375F, -46F, -0.25F, -0.45F, -46F, -0.375F, 0F, 45.25F, -0.375F, 0F, 45.25F, -0.5F, -0.5F, -46F, -0.5F, -0.5F); // Box 11

		gun_2_Model[0][41].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-45.75F, 0F, 0F, 45F, -0.25F, 0F, 45F, -0.25F, -0.45F, -45.75F, 0F, -0.375F, -45.75F, -0.375F, 0F, 45F, -0.375F, 0F, 45F, -0.5F, -0.5F, -45.75F, -0.5F, -0.5F); // Box 12

		gun_2_Model[0][42].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-45.25F, 0F, 0F, 44.5F, -0.25F, 0F, 44.5F, -0.25F, -0.45F, -45.25F, 0F, -0.375F, -45.25F, -0.375F, 0F, 44.5F, -0.375F, 0F, 44.5F, -0.5F, -0.5F, -45.25F, -0.5F, -0.5F); // Box 13

		gun_2_Model[0][43].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-45.5F, -0.25F, 0F, 44.75F, 0F, 0F, 44.75F, 0F, -0.375F, -45.5F, -0.25F, -0.45F, -45.5F, -0.375F, 0F, 44.75F, -0.375F, 0F, 44.75F, -0.5F, -0.5F, -45.5F, -0.5F, -0.5F); // Box 14

		gun_2_Model[0][44].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-43F, 0.5F, 0F, 44.25F, 0.625F, 0F, 44.25F, 0.5F, -0.5F, -43F, 0.375F, -0.625F, -43F, -1F, 0F, 44.25F, -1F, 0F, 44.25F, -1F, -0.375F, -43F, -1F, -0.5F); // Box 15

		gun_2_Model[0][45].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-46.75F, 0.625F, 0F, 46F, 0.625F, 0F, 46F, 0.5F, -0.5F, -46.75F, 0.5F, -0.5F, -46.75F, -1F, 0F, 46F, -1F, 0F, 46F, -1F, -0.375F, -46.75F, -1F, -0.375F); // Box 15

		gun_2_Model[0][46].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-46.5F, 0.625F, 0F, 45.75F, 0.625F, 0F, 45.75F, 0.5F, -0.5F, -46.5F, 0.5F, -0.5F, -46.5F, -1.25F, 0F, 45.75F, -1F, 0F, 45.75F, -1F, -0.375F, -46.5F, -1.25F, -0.45F); // Box 15

		gun_2_Model[0][47].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-46.25F, 0.625F, 0F, 45.5F, 0.625F, 0F, 45.5F, 0.5F, -0.5F, -46.25F, 0.5F, -0.5F, -46.25F, -1F, 0F, 45.5F, -1.25F, 0F, 45.5F, -1.25F, -0.45F, -46.25F, -1F, -0.375F); // Box 15

		gun_2_Model[0][48].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-46F, 0.625F, 0F, 45.25F, 0.625F, 0F, 45.25F, 0.5F, -0.5F, -46F, 0.5F, -0.5F, -46F, -1.25F, 0F, 45.25F, -1F, 0F, 45.25F, -1F, -0.375F, -46F, -1.25F, -0.45F); // Box 15

		gun_2_Model[0][49].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-45.75F, 0.625F, 0F, 45F, 0.625F, 0F, 45F, 0.5F, -0.5F, -45.75F, 0.5F, -0.5F, -45.75F, -1F, 0F, 45F, -1.25F, 0F, 45F, -1.25F, -0.45F, -45.75F, -1F, -0.375F); // Box 15

		gun_2_Model[0][50].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-45.25F, 0.625F, 0F, 44.5F, 0.625F, 0F, 44.5F, 0.5F, -0.5F, -45.25F, 0.5F, -0.5F, -45.25F, -1F, 0F, 44.5F, -1.25F, 0F, 44.5F, -1.25F, -0.45F, -45.25F, -1F, -0.375F); // Box 15

		gun_2_Model[0][51].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-45.5F, 0.625F, 0F, 44.75F, 0.625F, 0F, 44.75F, 0.5F, -0.5F, -45.5F, 0.5F, -0.5F, -45.5F, -1.25F, 0F, 44.75F, -1F, 0F, 44.75F, -1F, -0.375F, -45.5F, -1.25F, -0.45F); // Box 15

		gun_2_Model[0][52].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-43F, 0F, 0.5F, 44.25F, 0F, 0.625F, 44.25F, 0F, -1F, -43F, 0F, -1F, -43F, -0.625F, 0.375F, 44.25F, -0.5F, 0.5F, 44.25F, -0.375F, -1F, -43F, -0.5F, -1F); // Box 23

		gun_2_Model[0][53].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-46.75F, 0F, 0.625F, 46F, 0F, 0.625F, 46F, 0F, -1F, -46.75F, 0F, -1F, -46.75F, -0.5F, 0.5F, 46F, -0.5F, 0.5F, 46F, -0.375F, -1F, -46.75F, -0.375F, -1F); // Box 24

		gun_2_Model[0][54].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-46.5F, -0.25F, 0.55F, 45.75F, 0F, 0.625F, 45.75F, 0F, -1F, -46.5F, -0.25F, -1F, -46.5F, -0.5F, 0.5F, 45.75F, -0.5F, 0.5F, 45.75F, -0.375F, -1F, -46.5F, -0.375F, -1F); // Box 25

		gun_2_Model[0][55].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-46.25F, 0F, 0.625F, 45.5F, -0.25F, 0.55F, 45.5F, -0.25F, -1F, -46.25F, 0F, -1F, -46.25F, -0.5F, 0.5F, 45.5F, -0.5F, 0.5F, 45.5F, -0.375F, -1F, -46.25F, -0.375F, -1F); // Box 26

		gun_2_Model[0][56].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-46F, -0.25F, 0.55F, 45.25F, 0F, 0.625F, 45.25F, 0F, -1F, -46F, -0.25F, -1F, -46F, -0.5F, 0.5F, 45.25F, -0.5F, 0.5F, 45.25F, -0.375F, -1F, -46F, -0.375F, -1F); // Box 27

		gun_2_Model[0][57].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-45.75F, 0F, 0.625F, 45F, -0.25F, 0.55F, 45F, -0.25F, -1F, -45.75F, 0F, -1F, -45.75F, -0.5F, 0.5F, 45F, -0.5F, 0.5F, 45F, -0.375F, -1F, -45.75F, -0.375F, -1F); // Box 28

		gun_2_Model[0][58].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-45.25F, 0F, 0.625F, 44.5F, -0.25F, 0.55F, 44.5F, -0.25F, -1F, -45.25F, 0F, -1F, -45.25F, -0.5F, 0.5F, 44.5F, -0.5F, 0.5F, 44.5F, -0.375F, -1F, -45.25F, -0.375F, -1F); // Box 29

		gun_2_Model[0][59].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-45.5F, -0.25F, 0.55F, 44.75F, 0F, 0.625F, 44.75F, 0F, -1F, -45.5F, -0.25F, -1F, -45.5F, -0.5F, 0.5F, 44.75F, -0.5F, 0.5F, 44.75F, -0.375F, -1F, -45.5F, -0.375F, -1F); // Box 30

		gun_2_Model[0][60].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-43F, 0.375F, 0.375F, 44.25F, 0.5F, 0.5F, 44.25F, 0.625F, -1F, -43F, 0.5F, -1F, -43F, -1F, 0.5F, 44.25F, -1F, 0.625F, 44.25F, -1F, -1F, -43F, -1F, -1F); // Box 31

		gun_2_Model[0][61].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-46.75F, 0.5F, 0.5F, 46F, 0.5F, 0.5F, 46F, 0.625F, -1F, -46.75F, 0.625F, -1F, -46.75F, -1F, 0.625F, 46F, -1F, 0.625F, 46F, -1F, -1F, -46.75F, -1F, -1F); // Box 32

		gun_2_Model[0][62].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-46.5F, 0.5F, 0.5F, 45.75F, 0.5F, 0.5F, 45.75F, 0.625F, -1F, -46.5F, 0.625F, -1F, -46.5F, -1.25F, 0.55F, 45.75F, -1F, 0.625F, 45.75F, -1F, -1F, -46.5F, -1.25F, -1F); // Box 33

		gun_2_Model[0][63].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-46.25F, 0.5F, 0.5F, 45.5F, 0.5F, 0.5F, 45.5F, 0.625F, -1F, -46.25F, 0.625F, -1F, -46.25F, -1F, 0.625F, 45.5F, -1.25F, 0.55F, 45.5F, -1.25F, -1F, -46.25F, -1F, -1F); // Box 34

		gun_2_Model[0][64].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-46F, 0.5F, 0.5F, 45.25F, 0.5F, 0.5F, 45.25F, 0.625F, -1F, -46F, 0.625F, -1F, -46F, -1.25F, 0.55F, 45.25F, -1F, 0.625F, 45.25F, -1F, -1F, -46F, -1.25F, -1F); // Box 35

		gun_2_Model[0][65].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-45.75F, 0.5F, 0.5F, 45F, 0.5F, 0.5F, 45F, 0.625F, -1F, -45.75F, 0.625F, -1F, -45.75F, -1F, 0.625F, 45F, -1.25F, 0.55F, 45F, -1.25F, -1F, -45.75F, -1F, -1F); // Box 36

		gun_2_Model[0][66].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-45.25F, 0.5F, 0.5F, 44.5F, 0.5F, 0.5F, 44.5F, 0.625F, -1F, -45.25F, 0.625F, -1F, -45.25F, -1F, 0.625F, 44.5F, -1.25F, 0.55F, 44.5F, -1.25F, -1F, -45.25F, -1F, -1F); // Box 37

		gun_2_Model[0][67].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-45.5F, 0.5F, 0.5F, 44.75F, 0.5F, 0.5F, 44.75F, 0.625F, -1F, -45.5F, 0.625F, -1F, -45.5F, -1.25F, 0.55F, 44.75F, -1F, 0.625F, 44.75F, -1F, -1F, -45.5F, -1.25F, -1F); // Box 38

		gun_2_Model[0][68].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-36.25F, 1.5F, 0F, 35.75F, 1.5F, 0F, 35.75F, 1.5F, -0.875F, -36.25F, 1.5F, -0.875F, -36.25F, -1F, 0F, 35.75F, -1F, 0F, 35.75F, -1F, -0.875F, -36.25F, -1F, -0.875F); // Box 39

		gun_2_Model[0][69].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-36.25F, 1.5F, 0.125F, 35.75F, 1.5F, 0.125F, 35.75F, 1.5F, -1F, -36.25F, 1.5F, -1F, -36.25F, -1F, 0.125F, 35.75F, -1F, 0.125F, 35.75F, -1F, -1F, -36.25F, -1F, -1F); // Box 40

		gun_2_Model[0][70].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-36.25F, 1.5F, 0F, 35.75F, 1.5F, 0F, 35.75F, 1.625F, -0.75F, -36.25F, 1.625F, -0.75F, -36.25F, -2.375F, 0F, 35.75F, -2.375F, 0F, 35.75F, -2.5F, -0.75F, -36.25F, -2.5F, -0.75F); // Box 41

		gun_2_Model[0][71].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-36.25F, 1.625F, 0.25F, 35.75F, 1.625F, 0.25F, 35.75F, 1.5F, -1F, -36.25F, 1.5F, -1F, -36.25F, -2.5F, 0.25F, 35.75F, -2.5F, 0.25F, 35.75F, -2.375F, -1F, -36.25F, -2.375F, -1F); // Box 42

		gun_2_Model[0][72].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-36.25F, 2F, -0.25F, 35.75F, 2F, -0.25F, 35.75F, 1.875F, -0.625F, -36.25F, 1.875F, -0.625F, -36.25F, -2.5F, -0.25F, 35.75F, -2.5F, -0.25F, 35.75F, -2.625F, -0.625F, -36.25F, -2.625F, -0.625F); // Box 43

		gun_2_Model[0][73].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-36.25F, 1.875F, 0.375F, 35.75F, 1.875F, 0.375F, 35.75F, 2F, -1.25F, -36.25F, 2F, -1.25F, -36.25F, -2.625F, 0.375F, 35.75F, -2.625F, 0.375F, 35.75F, -2.5F, -1.25F, -36.25F, -2.5F, -1.25F); // Box 44

		gun_2_Model[0][74].addShapeBox(0F, 0F, 0F, 14, 2, 2, 0F,0F, 1F, 1.5F, -4.75F, 1.75F, 1.5F, -4.75F, 1.75F, -0.5F, 0F, 1F, -0.5F, 0F, 0.25F, 1.5F, -4.75F, 0.25F, 1.5F, -4.75F, 0.25F, -0.5F, 0F, 0.25F, -0.5F); // Box 45

		gun_2_Model[0][75].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,-14F, 0F, 0F, 11F, 0F, 0F, 11F, 0F, 0F, -14F, 0F, 0.5F, -14F, 0.5F, 0F, 11F, 0F, 0F, 11F, -0.25F, -0.25F, -14F, 0.125F, 0.125F); // Box 46

		gun_2_Model[0][76].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,-14F, 1.5F, 0F, 11F, 1F, 0F, 11F, 0.75F, -0.25F, -14F, 1.125F, 0.125F, -14F, -1F, 0F, 11F, -1F, 0F, 11F, -1F, 0F, -14F, -1F, 0.5F); // Box 47

		gun_2_Model[0][77].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,-14F, 1.125F, 1.125F, 11F, 0.75F, 0.75F, 11F, 1F, -1F, -14F, 1.5F, -1F, -14F, -1F, 1.5F, 11F, -1F, 1F, 11F, -1F, -1F, -14F, -1F, -1F); // Box 48

		gun_2_Model[0][78].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,-14F, 0F, 1.5F, 11F, 0F, 1F, 11F, 0F, -1F, -14F, 0F, -1F, -14F, 0.125F, 1.125F, 11F, -0.25F, 0.75F, 11F, 0F, -1F, -14F, 0.5F, -1F); // Box 49

		gun_2_Model[0][79].addShapeBox(0F, 0F, 0F, 14, 2, 2, 0F,-13.5F, 2.25F, -0.875F, 0F, 1.5F, -0.875F, 0F, 1.5F, -0.5F, -13.5F, 2.25F, -0.5F, -13.5F, 0.25F, -0.875F, 0F, -0.25F, -0.875F, 0F, -0.25F, -0.5F, -13.5F, 0.25F, -0.5F); // Box 0

		gun_2_Model[0][80].addShapeBox(0F, 0F, 0F, 14, 2, 2, 0F,-9.25F, 2.25F, 1.5F, -0.5F, 2.25F, 1.5F, -0.5F, 2.25F, -2.875F, -9.25F, 2.25F, -2.875F, -9.25F, 0.25F, 1.5F, -0.5F, 0.25F, 1.5F, -0.5F, 0.25F, -2.625F, -9.25F, 0.25F, -2.625F); // Box 1

		gun_2_Model[0][81].addShapeBox(0F, 0F, 0F, 14, 2, 2, 0F,0F, 1.25F, -0.875F, -4.75F, 2.25F, -0.875F, -4.75F, 2.25F, -0.5F, 0F, 1.25F, -0.5F, 0F, 0.25F, -0.875F, -4.75F, 0.25F, -0.875F, -4.75F, 0.25F, -0.5F, 0F, 0.25F, -0.5F); // Box 3

		gun_2_Model[0][82].addShapeBox(0F, 0F, 0F, 14, 2, 2, 0F,0F, 1.25F, 1.5F, -4.75F, 2.25F, 1.5F, -4.75F, 2.25F, -2.875F, 0F, 1.25F, -2.875F, 0F, 0.25F, 1.5F, -4.75F, 0.25F, 1.5F, -4.75F, 0.25F, -2.875F, 0F, 0.25F, -2.875F); // Box 4

		gun_2_Model[0][83].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,-13.5F, 2.25F, 0.25F, 10.25F, 1.375F, 0.25F, 10.25F, 1.375F, -0.75F, -13.5F, 2.25F, -0.75F, -13.5F, -1F, 0.25F, 11F, -1.875F, 0.25F, 11F, -1.875F, -0.75F, -13.5F, -1F, -0.75F); // Box 0

		gun_2_Model[0][84].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,-2.7F, -1.25F, 2.05F, -2.7F, -1.25F, 2.05F, -2.7F, -1.25F, -3.5F, -2.7F, -1.25F, -3.5F, -2.7F, 1F, 2.05F, -2.7F, 1F, 2.05F, -2.7F, 1F, -3.5F, -2.7F, 1F, -3.5F); // Box 5

		gun_2_Model[0][85].addShapeBox(0F, 0F, 0F, 13, 2, 2, 0F,-8F, 2.75F, -1.5F, 0F, 2.25F, -2F, 0F, 2.25F, 2F, -8F, 2.75F, 2.5F, -8F, -2.75F, -1.5F, 0F, -3.25F, -2F, 0F, -3.25F, 2F, -8F, -2.75F, 2.5F); // Box 0

		gun_2_Model[0][86].addShapeBox(0F, 0F, 0F, 13, 2, 2, 0F,-8F, 3.25F, -2F, 0F, 2.75F, -2.5F, 0F, 2.75F, 1.5F, -8F, 3.25F, 2F, -8F, -4.75F, -1.5F, 0F, -4.25F, -2F, 0F, -4.25F, 2F, -8F, -4.75F, 2.5F); // Box 1

		gun_2_Model[0][87].addShapeBox(0F, 0F, 0F, 13, 2, 2, 0F,-8F, 0.75F, -1.5F, 0F, 1.25F, -2F, 0F, 1.25F, 2F, -8F, 0.75F, 2.5F, -8F, -2.25F, -2F, 0F, -2.75F, -2.5F, 0F, -2.75F, 1.5F, -8F, -2.25F, 2F); // Box 2

		gun_2_Model[0][88].addShapeBox(0F, 0F, 0F, 13, 2, 2, 0F,-8F, 0.875F, -1.5F, 0F, 1.375F, -1.5F, 0F, 1.375F, 2F, -8F, 0.875F, 2.5F, -8F, -2.25F, -1.5F, 0F, -2.75F, -1.5F, 0F, -2.75F, 1.5F, -8F, -2.25F, 2F); // Box 3

		gun_2_Model[0][89].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 1.25F, -0.875F, -4.75F, -0.125F, -0.875F, -4.75F, -0.125F, -0.5F, 0F, 1.25F, -0.5F, 0F, 0.25F, -0.875F, -4.75F, -0.875F, -0.875F, -4.75F, -0.875F, -0.5F, 0F, 0.25F, -0.5F); // Box 5

		gun_2_Model[0][90].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 1.25F, 1.5F, -4.75F, -0.125F, 1.5F, -4.75F, -0.125F, -2.875F, 0F, 1.25F, -2.875F, 0F, 0.25F, 1.5F, -4.75F, -0.875F, 1.5F, -4.75F, -0.875F, -2.875F, 0F, 0.25F, -2.875F); // Box 6

		gun_2_Model[0][91].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.375F, -0.125F, 3.75F, -0.625F, -0.125F, 3.75F, -0.625F, -0.125F, 2.75F, 0.375F, -0.125F, 2.75F, 0.125F, -0.625F, 3.75F, -0.875F, -0.625F, 3.75F, -0.875F, -0.625F, 2.75F, 0.125F, -0.625F, 2.75F); // Box 9

		gun_2_Model[0][92].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.375F, 0.125F, 3.75F, -0.625F, 0.125F, 3.75F, -0.625F, 0.125F, 2.75F, 0.375F, 0.125F, 2.75F, 0.375F, -0.875F, 3.75F, -0.625F, -0.875F, 3.75F, -0.625F, -0.875F, 2.75F, 0.375F, -0.875F, 2.75F); // Box 10

		gun_2_Model[0][93].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.125F, 0.375F, 3.75F, -0.875F, 0.375F, 3.75F, -0.875F, 0.375F, 2.75F, 0.125F, 0.375F, 2.75F, 0.375F, -1.125F, 3.75F, -0.625F, -1.125F, 3.75F, -0.625F, -1.125F, 2.75F, 0.375F, -1.125F, 2.75F); // Box 11

		gun_2_Model[0][94].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 1F, 1.5F, -4.75F, -0.125F, 1.5F, -4.75F, -0.125F, -0.5F, 0F, 1F, -0.5F, 0F, 0.25F, 1.5F, -4.75F, -0.875F, 1.5F, -4.75F, -0.875F, -0.5F, 0F, 0.25F, -0.5F); // Box 12

		gun_2_Model[0][95].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,-3.575F, 2.65F, 1.85F, -2.025F, 2.5F, 1.85F, -2.025F, 2.5F, -3.65F, -3.575F, 2.65F, -3.65F, -2.775F, 0.25F, 1.85F, -2.775F, 0.5F, 1.85F, -2.775F, 0.5F, -3.65F, -2.775F, 0.25F, -3.65F); // Box 13

		gun_2_Model[0][96].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,-3.675F, 2.6F, 1.975F, -2.125F, 2.52F, 1.975F, -2.025F, 2.5F, -3.85F, -3.575F, 2.65F, -3.85F, -2.875F, 0.25F, 1.975F, -2.875F, 0.5F, 1.975F, -2.775F, 0.5F, -3.85F, -2.775F, 0.25F, -3.85F); // Box 14

		gun_2_Model[0][97].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,-3.575F, 2.65F, 1.65F, -2.025F, 2.5F, 1.65F, -2.125F, 2.52F, -3.525F, -3.675F, 2.6F, -3.525F, -2.775F, 0.25F, 1.65F, -2.775F, 0.5F, 1.65F, -2.875F, 0.5F, -3.525F, -2.875F, 0.25F, -3.525F); // Box 15

		gun_2_Model[0][98].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,1.25F, 0.5F, -1.5F, -1.75F, -0.125F, -1F, -1.75F, -0.125F, -0.5F, 1.25F, 0.5F, 0F, 1.25F, -2.25F, -1.5F, -1.75F, -1.625F, -1F, -1.75F, -1.625F, -0.5F, 1.25F, -2.25F, 0F); // Box 25

		gun_2_Model[0][99].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-4.125F, -1.75F, 1.75F, 3.375F, -1.75F, 1.75F, 3.375F, -1.75F, -0.25F, -4.125F, -1.75F, -0.25F, -4.075F, 1.25F, 1.75F, 3.325F, 1.25F, 1.75F, 3.325F, 1.25F, -0.25F, -4.075F, 1.25F, -0.25F); // Box 27

		gun_2_Model[0][100].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,1.25F, -1.5F, -1.5F, -1.75F, -0.875F, -1F, -1.75F, -0.875F, -0.5F, 1.25F, -1.5F, 0F, 1.25F, -0.25F, -1.5F, -1.75F, -0.875F, -1F, -1.75F, -0.875F, -0.5F, 1.25F, -0.25F, 0F); // Box 28

		gun_2_Model[0][101].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,1.25F, 0.5F, 2F, -1.75F, -0.125F, 1.5F, -1.75F, -0.125F, -3F, 1.25F, 0.5F, -3.5F, 1.25F, -2.25F, 2F, -1.75F, -1.625F, 1.5F, -1.75F, -1.625F, -3F, 1.25F, -2.25F, -3.5F); // Box 29

		gun_2_Model[0][102].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,1.25F, -1.5F, 2F, -1.75F, -0.875F, 1.5F, -1.75F, -0.875F, -3F, 1.25F, -1.5F, -3.5F, 1.25F, -0.25F, 2F, -1.75F, -0.875F, 1.5F, -1.75F, -0.875F, -3F, 1.25F, -0.25F, -3.5F); // Box 29

		gun_2_Model[0][103].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,2.5F, 0.375F, -2F, -3F, 0.325F, -1.95F, -3.125F, 0.325F, 0.125F, 2.375F, 0.375F, 0.125F, 2.5F, -0.375F, -2F, -3F, -0.425F, -1.95F, -3.125F, -0.425F, 0.125F, 2.375F, -0.375F, 0.125F); // Box 31

		gun_2_Model[0][104].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,2.5F, 0.625F, -1.625F, -2.25F, 0.5F, -1.5F, -2.25F, 0.5F, 0F, 2.5F, 0.625F, 0.125F, 2.5F, -2.375F, -1.625F, -2.25F, -2.25F, -1.5F, -2.25F, -2.25F, 0F, 2.5F, -2.375F, 0.125F); // Box 32

		gun_2_Model[0][105].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,2.5F, 0.625F, 2.125F, -2.25F, 0.5F, 2F, -2.25F, 0.5F, -3.5F, 2.5F, 0.625F, -3.625F, 2.5F, -2.375F, 2.125F, -2.25F, -2.25F, 2F, -2.25F, -2.25F, -3.5F, 2.5F, -2.375F, -3.625F); // Box 33

		gun_2_Model[0][106].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,2.5F, -1.625F, -1.625F, -2.25F, -1.5F, -1.5F, -2.25F, -1.5F, 0F, 2.5F, -1.625F, 0.125F, 2.5F, -0.125F, -1.625F, -2.25F, -0.25F, -1.5F, -2.25F, -0.25F, 0F, 2.5F, -0.125F, 0.125F); // Box 34

		gun_2_Model[0][107].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,2.5F, -1.625F, 2.125F, -2.25F, -1.5F, 2F, -2.25F, -1.5F, -3.5F, 2.5F, -1.625F, -3.625F, 2.5F, -0.125F, 2.125F, -2.25F, -0.25F, 2F, -2.25F, -0.25F, -3.5F, 2.5F, -0.125F, -3.625F); // Box 35

		gun_2_Model[0][108].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,2.5F, 0.375F, -1.75F, -3F, 0.325F, -1.7F, -3F, 0.325F, 0F, 2.5F, 0.375F, 0F, 2.5F, -0.375F, -1.75F, -3F, -0.425F, -1.7F, -3F, -0.425F, 0F, 2.5F, -0.375F, 0F); // Box 36

		gun_2_Model[0][109].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,2.375F, 0.375F, -1.625F, -3.125F, 0.325F, -1.575F, -3F, 0.325F, -0.25F, 2.5F, 0.375F, -0.25F, 2.375F, -0.375F, -1.625F, -3.125F, -0.425F, -1.575F, -3F, -0.425F, -0.25F, 2.5F, -0.375F, -0.25F); // Box 37

		gun_2_Model[0][110].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,2.375F, 0.375F, 2.125F, -3.125F, 0.325F, 2.125F, -3F, 0.325F, -3.95F, 2.5F, 0.375F, -4F, 2.375F, -0.375F, 2.125F, -3.125F, -0.425F, 2.125F, -3F, -0.425F, -3.95F, 2.5F, -0.375F, -4F); // Box 38

		gun_2_Model[0][111].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,2.5F, 0.375F, 2F, -3F, 0.325F, 2F, -3F, 0.325F, -3.7F, 2.5F, 0.375F, -3.75F, 2.5F, -0.375F, 2F, -3F, -0.425F, 2F, -3F, -0.425F, -3.7F, 2.5F, -0.375F, -3.75F); // Box 38

		gun_2_Model[0][112].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,2.5F, 0.375F, 1.75F, -3F, 0.325F, 1.75F, -3.125F, 0.325F, -3.575F, 2.375F, 0.375F, -3.625F, 2.5F, -0.375F, 1.75F, -3F, -0.425F, 1.75F, -3.125F, -0.425F, -3.575F, 2.375F, -0.375F, -3.625F); // Box 38

		gun_2_Model[0][113].addShapeBox(0F, 0F, 0F, 14, 2, 2, 0F,-9.25F, 1.75F, 1.5F, -0.5F, 1.75F, 1.5F, -0.5F, 1.75F, -0.5F, -9.25F, 1.75F, -0.5F, -9.25F, 0.25F, 1.5F, -0.5F, 0.25F, 1.5F, -0.5F, 0.25F, -0.5F, -9.25F, 0.25F, -0.5F); // Box 0

		gun_2_Model[0][114].addShapeBox(0F, 0F, 0F, 14, 2, 2, 0F,-9.25F, 2.25F, -0.875F, -0.5F, 2.25F, -0.875F, -0.5F, 2.25F, -0.5F, -9.25F, 2.25F, -0.5F, -9.25F, 0.25F, -0.875F, -0.5F, 0.25F, -0.875F, -0.5F, 0.25F, -0.5F, -9.25F, 0.25F, -0.5F); // Box 1

		gun_2_Model[0][115].addShapeBox(0F, 0F, 0F, 14, 2, 2, 0F,-13.5F, 1.75F, 1.5F, 0F, 1.5F, 1.5F, 0F, 1.5F, -0.5F, -13.5F, 1.75F, -0.5F, -13.5F, 0.25F, 1.5F, 0F, -0.25F, 1.5F, 0F, -0.25F, -0.5F, -13.5F, 0.25F, -0.5F); // Box 2

		gun_2_Model[0][116].addShapeBox(0F, 0F, 0F, 14, 2, 2, 0F,-13.5F, 2.25F, 1.5F, 0F, 1.5F, 1.5F, 0F, 1.5F, -2.875F, -13.5F, 2.25F, -2.875F, -13.5F, 0.25F, 1.5F, 0F, -0.25F, 1.5F, 0F, -0.25F, -2.875F, -13.5F, 0.25F, -2.875F); // Box 3

		gun_2_Model[0][117].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,-12.25F, 2.125F, 0.25F, 6.5F, 2.25F, 0.25F, 6.5F, 2.25F, -0.75F, -12.25F, 2.125F, -0.75F, -10F, -1.875F, 0.25F, 6.5F, -1F, 0.25F, 6.5F, -1F, -0.75F, -10F, -1.875F, -0.75F); // Box 4

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[0])
		{
			gunPart.setRotationPoint(-261F, -44F, 0F);
		}


		gun_2_Model[1] = new ModelRendererTurbo[0];

		gun_2_Model[2] = new ModelRendererTurbo[12];
		gun_2_Model[2][0] = new ModelRendererTurbo(this, 1599, 685, textureX, textureY); // Box 8
		gun_2_Model[2][1] = new ModelRendererTurbo(this, 1615, 685, textureX, textureY); // Box 13
		gun_2_Model[2][2] = new ModelRendererTurbo(this, 1631, 685, textureX, textureY); // Box 15
		gun_2_Model[2][3] = new ModelRendererTurbo(this, 1647, 685, textureX, textureY); // Box 16
		gun_2_Model[2][4] = new ModelRendererTurbo(this, 1663, 685, textureX, textureY); // Box 17
		gun_2_Model[2][5] = new ModelRendererTurbo(this, 1679, 685, textureX, textureY); // Box 18
		gun_2_Model[2][6] = new ModelRendererTurbo(this, 1695, 685, textureX, textureY); // Box 19
		gun_2_Model[2][7] = new ModelRendererTurbo(this, 1711, 685, textureX, textureY); // Box 19
		gun_2_Model[2][8] = new ModelRendererTurbo(this, 1727, 685, textureX, textureY); // Box 19
		gun_2_Model[2][9] = new ModelRendererTurbo(this, 1743, 685, textureX, textureY); // Box 19
		gun_2_Model[2][10] = new ModelRendererTurbo(this, 1759, 685, textureX, textureY); // Box 19
		gun_2_Model[2][11] = new ModelRendererTurbo(this, 1775, 685, textureX, textureY); // Box 19

		gun_2_Model[2][0].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-2.5F, -4F, 1.75F, -1.25F, -3.5F, 1.75F, -1.25F, -3.5F, -2.5F, -2.5F, -4F, -2.5F, -2.5F, 3.25F, 1.75F, -1.25F, 2.75F, 1.75F, -1.25F, 2.75F, -2.5F, -2.5F, 3.25F, -2.5F); // Box 8

		gun_2_Model[2][1].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -4.75F, 1.75F, -2.5F, -4F, 1.75F, -2.5F, -4F, -2.5F, 0F, -4.75F, -2.5F, 0F, 4F, 1.75F, -2.5F, 3.25F, 1.75F, -2.5F, 3.25F, -2.5F, 0F, 4F, -2.5F); // Box 13

		gun_2_Model[2][2].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-4F, -2.5F, 1.75F, -0.75F, -2.5F, 1.75F, -0.75F, -2.5F, -2.5F, -4F, -2.5F, -2.5F, -3.5F, 2.75F, 1.75F, -1.25F, 2.75F, 1.75F, -1.25F, 2.75F, -2.5F, -3.5F, 2.75F, -2.5F); // Box 15

		gun_2_Model[2][3].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,2.5F, -4F, 1.75F, -5F, -4.75F, 1.75F, -5F, -4.75F, -2.5F, 2.5F, -4F, -2.5F, 2.5F, 3.25F, 1.75F, -5F, 4F, 1.75F, -5F, 4F, -2.5F, 2.5F, 3.25F, -2.5F); // Box 16

		gun_2_Model[2][4].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,3.75F, -3.5F, 1.75F, -7.5F, -4F, 1.75F, -7.5F, -4F, -2.5F, 3.75F, -3.5F, -2.5F, 3.75F, 2.75F, 1.75F, -7.5F, 3.25F, 1.75F, -7.5F, 3.25F, -2.5F, 3.75F, 2.75F, -2.5F); // Box 17

		gun_2_Model[2][5].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-4.075F, -2.25F, 1.75F, -0.675F, -2.25F, 1.75F, -0.675F, -2.25F, -2.5F, -4.125F, -2.25F, -2.5F, -4F, 1.5F, 1.75F, -0.75F, 1.5F, 1.75F, -0.75F, 1.5F, -2.5F, -4F, 1.5F, -2.5F); // Box 18

		gun_2_Model[2][6].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-2.5F, -4F, -1.5F, -1.25F, -3.5F, -1.5F, -1.25F, -3.5F, 0.75F, -2.5F, -4F, 0.75F, -2.5F, 3.25F, -1.5F, -1.25F, 2.75F, -1.5F, -1.25F, 2.75F, 0.75F, -2.5F, 3.25F, 0.75F); // Box 19

		gun_2_Model[2][7].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -4.75F, -1.5F, -2.5F, -4F, -1.5F, -2.5F, -4F, 0.75F, 0F, -4.75F, 0.75F, 0F, 4F, -1.5F, -2.5F, 3.25F, -1.5F, -2.5F, 3.25F, 0.75F, 0F, 4F, 0.75F); // Box 19

		gun_2_Model[2][8].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-4F, -2.5F, -1.5F, -0.75F, -2.5F, -1.5F, -0.75F, -2.5F, 0.75F, -4F, -2.5F, 0.75F, -3.5F, 2.75F, -1.5F, -1.25F, 2.75F, -1.5F, -1.25F, 2.75F, 0.75F, -3.5F, 2.75F, 0.75F); // Box 19

		gun_2_Model[2][9].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,2.5F, -4F, -1.5F, -5F, -4.75F, -1.5F, -5F, -4.75F, 0.75F, 2.5F, -4F, 0.75F, 2.5F, 3.25F, -1.5F, -5F, 4F, -1.5F, -5F, 4F, 0.75F, 2.5F, 3.25F, 0.75F); // Box 19

		gun_2_Model[2][10].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,3.75F, -3.5F, -1.5F, -7.5F, -4F, -1.5F, -7.5F, -4F, 0.75F, 3.75F, -3.5F, 0.75F, 3.75F, 2.75F, -1.5F, -7.5F, 3.25F, -1.5F, -7.5F, 3.25F, 0.75F, 3.75F, 2.75F, 0.75F); // Box 19

		gun_2_Model[2][11].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-4.125F, -2.25F, -1.5F, -0.675F, -2.25F, -1.5F, -0.675F, -2.25F, 0.75F, -4.075F, -2.25F, 0.75F, -4F, 1.5F, -1.5F, -0.75F, 1.5F, -1.5F, -0.75F, 1.5F, 0.75F, -4F, 1.5F, 0.75F); // Box 19

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[2])
		{
			gunPart.setRotationPoint(-261F, -44F, 0F);
		}


		registerGunModel("NoseGun", gun_2_Model);

		// Passenger 4
		ModelRendererTurbo[][] gun_3_Model = new ModelRendererTurbo[3][];

		gun_3_Model[0] = new ModelRendererTurbo[118];
		gun_3_Model[0][0] = new ModelRendererTurbo(this, 1471, 661, textureX, textureY); // Box 4
		gun_3_Model[0][1] = new ModelRendererTurbo(this, 1527, 661, textureX, textureY); // Box 7
		gun_3_Model[0][2] = new ModelRendererTurbo(this, 1567, 661, textureX, textureY); // Box 8
		gun_3_Model[0][3] = new ModelRendererTurbo(this, 1607, 661, textureX, textureY); // Box 0
		gun_3_Model[0][4] = new ModelRendererTurbo(this, 1647, 661, textureX, textureY); // Box 1
		gun_3_Model[0][5] = new ModelRendererTurbo(this, 1687, 661, textureX, textureY); // Box 0
		gun_3_Model[0][6] = new ModelRendererTurbo(this, 1695, 661, textureX, textureY); // Box 1
		gun_3_Model[0][7] = new ModelRendererTurbo(this, 1703, 661, textureX, textureY); // Box 2
		gun_3_Model[0][8] = new ModelRendererTurbo(this, 1711, 661, textureX, textureY); // Box 3
		gun_3_Model[0][9] = new ModelRendererTurbo(this, 1719, 661, textureX, textureY); // Box 4
		gun_3_Model[0][10] = new ModelRendererTurbo(this, 1727, 661, textureX, textureY); // Box 5
		gun_3_Model[0][11] = new ModelRendererTurbo(this, 1735, 661, textureX, textureY); // Box 12
		gun_3_Model[0][12] = new ModelRendererTurbo(this, 1743, 661, textureX, textureY); // Box 13
		gun_3_Model[0][13] = new ModelRendererTurbo(this, 1751, 661, textureX, textureY); // Box 14
		gun_3_Model[0][14] = new ModelRendererTurbo(this, 1759, 661, textureX, textureY); // Box 15
		gun_3_Model[0][15] = new ModelRendererTurbo(this, 1767, 661, textureX, textureY); // Box 16
		gun_3_Model[0][16] = new ModelRendererTurbo(this, 1775, 661, textureX, textureY); // Box 17
		gun_3_Model[0][17] = new ModelRendererTurbo(this, 1783, 661, textureX, textureY); // Box 18
		gun_3_Model[0][18] = new ModelRendererTurbo(this, 1791, 661, textureX, textureY); // Box 19
		gun_3_Model[0][19] = new ModelRendererTurbo(this, 1799, 661, textureX, textureY); // Box 20
		gun_3_Model[0][20] = new ModelRendererTurbo(this, 1807, 661, textureX, textureY); // Box 21
		gun_3_Model[0][21] = new ModelRendererTurbo(this, 1815, 661, textureX, textureY); // Box 22
		gun_3_Model[0][22] = new ModelRendererTurbo(this, 1823, 661, textureX, textureY); // Box 23
		gun_3_Model[0][23] = new ModelRendererTurbo(this, 1831, 661, textureX, textureY); // Box 24
		gun_3_Model[0][24] = new ModelRendererTurbo(this, 1839, 661, textureX, textureY); // Box 25
		gun_3_Model[0][25] = new ModelRendererTurbo(this, 1847, 661, textureX, textureY); // Box 26
		gun_3_Model[0][26] = new ModelRendererTurbo(this, 1855, 661, textureX, textureY); // Box 27
		gun_3_Model[0][27] = new ModelRendererTurbo(this, 1863, 661, textureX, textureY); // Box 28
		gun_3_Model[0][28] = new ModelRendererTurbo(this, 1871, 661, textureX, textureY); // Box 29
		gun_3_Model[0][29] = new ModelRendererTurbo(this, 1879, 661, textureX, textureY); // Box 2
		gun_3_Model[0][30] = new ModelRendererTurbo(this, 1471, 669, textureX, textureY); // Box 3
		gun_3_Model[0][31] = new ModelRendererTurbo(this, 1527, 669, textureX, textureY); // Box 4
		gun_3_Model[0][32] = new ModelRendererTurbo(this, 1935, 661, textureX, textureY); // Box 0
		gun_3_Model[0][33] = new ModelRendererTurbo(this, 1943, 661, textureX, textureY); // Box 1
		gun_3_Model[0][34] = new ModelRendererTurbo(this, 1951, 661, textureX, textureY); // Box 2
		gun_3_Model[0][35] = new ModelRendererTurbo(this, 1959, 661, textureX, textureY); // Box 3
		gun_3_Model[0][36] = new ModelRendererTurbo(this, 1967, 661, textureX, textureY); // Box 6
		gun_3_Model[0][37] = new ModelRendererTurbo(this, 1975, 661, textureX, textureY); // Box 8
		gun_3_Model[0][38] = new ModelRendererTurbo(this, 1583, 669, textureX, textureY); // Box 9
		gun_3_Model[0][39] = new ModelRendererTurbo(this, 1591, 669, textureX, textureY); // Box 10
		gun_3_Model[0][40] = new ModelRendererTurbo(this, 1599, 669, textureX, textureY); // Box 11
		gun_3_Model[0][41] = new ModelRendererTurbo(this, 1607, 669, textureX, textureY); // Box 12
		gun_3_Model[0][42] = new ModelRendererTurbo(this, 1615, 669, textureX, textureY); // Box 13
		gun_3_Model[0][43] = new ModelRendererTurbo(this, 1623, 669, textureX, textureY); // Box 14
		gun_3_Model[0][44] = new ModelRendererTurbo(this, 1631, 669, textureX, textureY); // Box 15
		gun_3_Model[0][45] = new ModelRendererTurbo(this, 1639, 669, textureX, textureY); // Box 15
		gun_3_Model[0][46] = new ModelRendererTurbo(this, 1647, 669, textureX, textureY); // Box 15
		gun_3_Model[0][47] = new ModelRendererTurbo(this, 1655, 669, textureX, textureY); // Box 15
		gun_3_Model[0][48] = new ModelRendererTurbo(this, 1663, 669, textureX, textureY); // Box 15
		gun_3_Model[0][49] = new ModelRendererTurbo(this, 1671, 669, textureX, textureY); // Box 15
		gun_3_Model[0][50] = new ModelRendererTurbo(this, 1679, 669, textureX, textureY); // Box 15
		gun_3_Model[0][51] = new ModelRendererTurbo(this, 1687, 669, textureX, textureY); // Box 15
		gun_3_Model[0][52] = new ModelRendererTurbo(this, 1695, 669, textureX, textureY); // Box 23
		gun_3_Model[0][53] = new ModelRendererTurbo(this, 1703, 669, textureX, textureY); // Box 24
		gun_3_Model[0][54] = new ModelRendererTurbo(this, 1711, 669, textureX, textureY); // Box 25
		gun_3_Model[0][55] = new ModelRendererTurbo(this, 1719, 669, textureX, textureY); // Box 26
		gun_3_Model[0][56] = new ModelRendererTurbo(this, 1727, 669, textureX, textureY); // Box 27
		gun_3_Model[0][57] = new ModelRendererTurbo(this, 1735, 669, textureX, textureY); // Box 28
		gun_3_Model[0][58] = new ModelRendererTurbo(this, 1743, 669, textureX, textureY); // Box 29
		gun_3_Model[0][59] = new ModelRendererTurbo(this, 1751, 669, textureX, textureY); // Box 30
		gun_3_Model[0][60] = new ModelRendererTurbo(this, 1759, 669, textureX, textureY); // Box 31
		gun_3_Model[0][61] = new ModelRendererTurbo(this, 1767, 669, textureX, textureY); // Box 32
		gun_3_Model[0][62] = new ModelRendererTurbo(this, 1775, 669, textureX, textureY); // Box 33
		gun_3_Model[0][63] = new ModelRendererTurbo(this, 1783, 669, textureX, textureY); // Box 34
		gun_3_Model[0][64] = new ModelRendererTurbo(this, 1791, 669, textureX, textureY); // Box 35
		gun_3_Model[0][65] = new ModelRendererTurbo(this, 1799, 669, textureX, textureY); // Box 36
		gun_3_Model[0][66] = new ModelRendererTurbo(this, 1807, 669, textureX, textureY); // Box 37
		gun_3_Model[0][67] = new ModelRendererTurbo(this, 1815, 669, textureX, textureY); // Box 38
		gun_3_Model[0][68] = new ModelRendererTurbo(this, 1823, 669, textureX, textureY); // Box 39
		gun_3_Model[0][69] = new ModelRendererTurbo(this, 1831, 669, textureX, textureY); // Box 40
		gun_3_Model[0][70] = new ModelRendererTurbo(this, 1839, 669, textureX, textureY); // Box 41
		gun_3_Model[0][71] = new ModelRendererTurbo(this, 1847, 669, textureX, textureY); // Box 42
		gun_3_Model[0][72] = new ModelRendererTurbo(this, 1855, 669, textureX, textureY); // Box 43
		gun_3_Model[0][73] = new ModelRendererTurbo(this, 1863, 669, textureX, textureY); // Box 44
		gun_3_Model[0][74] = new ModelRendererTurbo(this, 1871, 669, textureX, textureY); // Box 45
		gun_3_Model[0][75] = new ModelRendererTurbo(this, 1911, 669, textureX, textureY); // Box 46
		gun_3_Model[0][76] = new ModelRendererTurbo(this, 1935, 669, textureX, textureY); // Box 47
		gun_3_Model[0][77] = new ModelRendererTurbo(this, 1959, 669, textureX, textureY); // Box 48
		gun_3_Model[0][78] = new ModelRendererTurbo(this, 1471, 677, textureX, textureY); // Box 49
		gun_3_Model[0][79] = new ModelRendererTurbo(this, 1495, 677, textureX, textureY); // Box 0
		gun_3_Model[0][80] = new ModelRendererTurbo(this, 1535, 677, textureX, textureY); // Box 1
		gun_3_Model[0][81] = new ModelRendererTurbo(this, 1575, 677, textureX, textureY); // Box 3
		gun_3_Model[0][82] = new ModelRendererTurbo(this, 1615, 677, textureX, textureY); // Box 4
		gun_3_Model[0][83] = new ModelRendererTurbo(this, 1655, 677, textureX, textureY); // Box 0
		gun_3_Model[0][84] = new ModelRendererTurbo(this, 1679, 677, textureX, textureY); // Box 5
		gun_3_Model[0][85] = new ModelRendererTurbo(this, 1703, 677, textureX, textureY); // Box 0
		gun_3_Model[0][86] = new ModelRendererTurbo(this, 1735, 677, textureX, textureY); // Box 1
		gun_3_Model[0][87] = new ModelRendererTurbo(this, 1767, 677, textureX, textureY); // Box 2
		gun_3_Model[0][88] = new ModelRendererTurbo(this, 1799, 677, textureX, textureY); // Box 3
		gun_3_Model[0][89] = new ModelRendererTurbo(this, 1831, 677, textureX, textureY); // Box 5
		gun_3_Model[0][90] = new ModelRendererTurbo(this, 1847, 677, textureX, textureY); // Box 6
		gun_3_Model[0][91] = new ModelRendererTurbo(this, 1863, 677, textureX, textureY); // Box 9
		gun_3_Model[0][92] = new ModelRendererTurbo(this, 1871, 677, textureX, textureY); // Box 10
		gun_3_Model[0][93] = new ModelRendererTurbo(this, 1879, 677, textureX, textureY); // Box 11
		gun_3_Model[0][94] = new ModelRendererTurbo(this, 1887, 677, textureX, textureY); // Box 12
		gun_3_Model[0][95] = new ModelRendererTurbo(this, 1903, 677, textureX, textureY); // Box 13
		gun_3_Model[0][96] = new ModelRendererTurbo(this, 1927, 677, textureX, textureY); // Box 14
		gun_3_Model[0][97] = new ModelRendererTurbo(this, 1951, 677, textureX, textureY); // Box 15
		gun_3_Model[0][98] = new ModelRendererTurbo(this, 1975, 677, textureX, textureY); // Box 25
		gun_3_Model[0][99] = new ModelRendererTurbo(this, 1791, 685, textureX, textureY); // Box 27
		gun_3_Model[0][100] = new ModelRendererTurbo(this, 1799, 685, textureX, textureY); // Box 28
		gun_3_Model[0][101] = new ModelRendererTurbo(this, 1807, 685, textureX, textureY); // Box 29
		gun_3_Model[0][102] = new ModelRendererTurbo(this, 1815, 685, textureX, textureY); // Box 29
		gun_3_Model[0][103] = new ModelRendererTurbo(this, 1823, 685, textureX, textureY); // Box 31
		gun_3_Model[0][104] = new ModelRendererTurbo(this, 1831, 685, textureX, textureY); // Box 32
		gun_3_Model[0][105] = new ModelRendererTurbo(this, 1839, 685, textureX, textureY); // Box 33
		gun_3_Model[0][106] = new ModelRendererTurbo(this, 1847, 685, textureX, textureY); // Box 34
		gun_3_Model[0][107] = new ModelRendererTurbo(this, 1855, 685, textureX, textureY); // Box 35
		gun_3_Model[0][108] = new ModelRendererTurbo(this, 1863, 685, textureX, textureY); // Box 36
		gun_3_Model[0][109] = new ModelRendererTurbo(this, 1871, 685, textureX, textureY); // Box 37
		gun_3_Model[0][110] = new ModelRendererTurbo(this, 1879, 685, textureX, textureY); // Box 38
		gun_3_Model[0][111] = new ModelRendererTurbo(this, 1887, 685, textureX, textureY); // Box 38
		gun_3_Model[0][112] = new ModelRendererTurbo(this, 1895, 685, textureX, textureY); // Box 38
		gun_3_Model[0][113] = new ModelRendererTurbo(this, 1903, 685, textureX, textureY); // Box 0
		gun_3_Model[0][114] = new ModelRendererTurbo(this, 1943, 685, textureX, textureY); // Box 1
		gun_3_Model[0][115] = new ModelRendererTurbo(this, 1471, 693, textureX, textureY); // Box 2
		gun_3_Model[0][116] = new ModelRendererTurbo(this, 1511, 693, textureX, textureY); // Box 3
		gun_3_Model[0][117] = new ModelRendererTurbo(this, 1551, 693, textureX, textureY); // Box 4

		gun_3_Model[0][0].addShapeBox(0F, 0F, 0F, 24, 1, 1, 0F,-18F, 0F, 0F, 23.125F, 0F, 0F, 23.125F, 0F, -0.625F, -18F, 0F, -0.625F, -18F, -0.625F, 0F, 23.125F, -0.625F, 0F, 23.125F, -0.75F, -0.75F, -18F, -0.75F, -0.75F); // Box 4

		gun_3_Model[0][1].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,-18F, 0.93F, -0.25F, 18F, 0.93F, -0.25F, 18F, 0.75F, -0.25F, -18F, 0.75F, -0.25F, -18F, -1.75F, -0.75F, 18F, -1.75F, -0.75F, 18F, -1.25F, -0.08F, -18F, -1.25F, -0.08F); // Box 7

		gun_3_Model[0][2].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,-18F, -0.75F, -0.75F, 18F, -0.75F, -0.75F, 18F, -0.25F, -0.08F, -18F, -0.25F, -0.08F, -18F, -0.07F, -0.25F, 18F, -0.07F, -0.25F, 18F, -0.25F, -0.25F, -18F, -0.25F, -0.25F); // Box 8

		gun_3_Model[0][3].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,-18F, -0.25F, 0.92F, 18F, -0.25F, 0.92F, 18F, -0.75F, -1.75F, -18F, -0.75F, -1.75F, -18F, -0.25F, 0.75F, 18F, -0.25F, 0.75F, 18F, -0.07F, -1.25F, -18F, -0.07F, -1.25F); // Box 0

		gun_3_Model[0][4].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,-18F, 0.75F, 0.75F, 18F, 0.75F, 0.75F, 18F, 0.93F, -1.25F, -18F, 0.93F, -1.25F, -18F, -1.25F, 0.92F, 18F, -1.25F, 0.92F, 18F, -1.75F, -1.75F, -18F, -1.75F, -1.75F); // Box 1

		gun_3_Model[0][5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-20F, 1F, 0F, 20F, 1F, 0F, 20F, 0.75F, -0.25F, -20F, 0.75F, -0.25F, -20F, -1.75F, -0.75F, 20F, -1.75F, -0.75F, 20F, -1F, 0F, -20F, -1F, 0F); // Box 0

		gun_3_Model[0][6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-23F, 1F, 0F, 23F, 1F, 0F, 23F, 0.75F, -0.25F, -23F, 0.75F, -0.25F, -23F, -1.75F, -0.75F, 23F, -1.75F, -0.75F, 23F, -1F, 0F, -23F, -1F, 0F); // Box 1

		gun_3_Model[0][7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-35F, 1F, 0F, 35F, 1F, 0F, 35F, 0.75F, -0.25F, -35F, 0.75F, -0.25F, -35F, -1.75F, -0.75F, 35F, -1.75F, -0.75F, 35F, -1F, 0F, -35F, -1F, 0F); // Box 2

		gun_3_Model[0][8].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-26F, 1F, 0F, 26F, 1F, 0F, 26F, 0.75F, -0.25F, -26F, 0.75F, -0.25F, -26F, -1.75F, -0.75F, 26F, -1.75F, -0.75F, 26F, -1F, 0F, -26F, -1F, 0F); // Box 3

		gun_3_Model[0][9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-29F, 1F, 0F, 29F, 1F, 0F, 29F, 0.75F, -0.25F, -29F, 0.75F, -0.25F, -29F, -1.75F, -0.75F, 29F, -1.75F, -0.75F, 29F, -1F, 0F, -29F, -1F, 0F); // Box 4

		gun_3_Model[0][10].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-32F, 1F, 0F, 32F, 1F, 0F, 32F, 0.75F, -0.25F, -32F, 0.75F, -0.25F, -32F, -1.75F, -0.75F, 32F, -1.75F, -0.75F, 32F, -1F, 0F, -32F, -1F, 0F); // Box 5

		gun_3_Model[0][11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-32F, 0.75F, 0.75F, 32F, 0.75F, 0.75F, 32F, 1F, -1F, -32F, 1F, -1F, -32F, -1F, 1F, 32F, -1F, 1F, 32F, -1.75F, -1.75F, -32F, -1.75F, -1.75F); // Box 12

		gun_3_Model[0][12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-29F, 0.75F, 0.75F, 29F, 0.75F, 0.75F, 29F, 1F, -1F, -29F, 1F, -1F, -29F, -1F, 1F, 29F, -1F, 1F, 29F, -1.75F, -1.75F, -29F, -1.75F, -1.75F); // Box 13

		gun_3_Model[0][13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-26F, 0.75F, 0.75F, 26F, 0.75F, 0.75F, 26F, 1F, -1F, -26F, 1F, -1F, -26F, -1F, 1F, 26F, -1F, 1F, 26F, -1.75F, -1.75F, -26F, -1.75F, -1.75F); // Box 14

		gun_3_Model[0][14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-35F, 0.75F, 0.75F, 35F, 0.75F, 0.75F, 35F, 1F, -1F, -35F, 1F, -1F, -35F, -1F, 1F, 35F, -1F, 1F, 35F, -1.75F, -1.75F, -35F, -1.75F, -1.75F); // Box 15

		gun_3_Model[0][15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-23F, 0.75F, 0.75F, 23F, 0.75F, 0.75F, 23F, 1F, -1F, -23F, 1F, -1F, -23F, -1F, 1F, 23F, -1F, 1F, 23F, -1.75F, -1.75F, -23F, -1.75F, -1.75F); // Box 16

		gun_3_Model[0][16].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-20F, 0.75F, 0.75F, 20F, 0.75F, 0.75F, 20F, 1F, -1F, -20F, 1F, -1F, -20F, -1F, 1F, 20F, -1F, 1F, 20F, -1.75F, -1.75F, -20F, -1.75F, -1.75F); // Box 17

		gun_3_Model[0][17].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-32F, 0F, 1F, 32F, 0F, 1F, 32F, -0.75F, -1.75F, -32F, -0.75F, -1.75F, -32F, -0.25F, 0.75F, 32F, -0.25F, 0.75F, 32F, 0F, -1F, -32F, 0F, -1F); // Box 18

		gun_3_Model[0][18].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-29F, 0F, 1F, 29F, 0F, 1F, 29F, -0.75F, -1.75F, -29F, -0.75F, -1.75F, -29F, -0.25F, 0.75F, 29F, -0.25F, 0.75F, 29F, 0F, -1F, -29F, 0F, -1F); // Box 19

		gun_3_Model[0][19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-26F, 0F, 1F, 26F, 0F, 1F, 26F, -0.75F, -1.75F, -26F, -0.75F, -1.75F, -26F, -0.25F, 0.75F, 26F, -0.25F, 0.75F, 26F, 0F, -1F, -26F, 0F, -1F); // Box 20

		gun_3_Model[0][20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-35F, 0F, 1F, 35F, 0F, 1F, 35F, -0.75F, -1.75F, -35F, -0.75F, -1.75F, -35F, -0.25F, 0.75F, 35F, -0.25F, 0.75F, 35F, 0F, -1F, -35F, 0F, -1F); // Box 21

		gun_3_Model[0][21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-23F, 0F, 1F, 23F, 0F, 1F, 23F, -0.75F, -1.75F, -23F, -0.75F, -1.75F, -23F, -0.25F, 0.75F, 23F, -0.25F, 0.75F, 23F, 0F, -1F, -23F, 0F, -1F); // Box 22

		gun_3_Model[0][22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-20F, 0F, 1F, 20F, 0F, 1F, 20F, -0.75F, -1.75F, -20F, -0.75F, -1.75F, -20F, -0.25F, 0.75F, 20F, -0.25F, 0.75F, 20F, 0F, -1F, -20F, 0F, -1F); // Box 23

		gun_3_Model[0][23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-20F, -0.75F, -0.75F, 20F, -0.75F, -0.75F, 20F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, 0F, 20F, 0F, 0F, 20F, -0.25F, -0.25F, -20F, -0.25F, -0.25F); // Box 24

		gun_3_Model[0][24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-23F, -0.75F, -0.75F, 23F, -0.75F, -0.75F, 23F, 0F, 0F, -23F, 0F, 0F, -23F, 0F, 0F, 23F, 0F, 0F, 23F, -0.25F, -0.25F, -23F, -0.25F, -0.25F); // Box 25

		gun_3_Model[0][25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-35F, -0.75F, -0.75F, 35F, -0.75F, -0.75F, 35F, 0F, 0F, -35F, 0F, 0F, -35F, 0F, 0F, 35F, 0F, 0F, 35F, -0.25F, -0.25F, -35F, -0.25F, -0.25F); // Box 26

		gun_3_Model[0][26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-26F, -0.75F, -0.75F, 26F, -0.75F, -0.75F, 26F, 0F, 0F, -26F, 0F, 0F, -26F, 0F, 0F, 26F, 0F, 0F, 26F, -0.25F, -0.25F, -26F, -0.25F, -0.25F); // Box 27

		gun_3_Model[0][27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-29F, -0.75F, -0.75F, 29F, -0.75F, -0.75F, 29F, 0F, 0F, -29F, 0F, 0F, -29F, 0F, 0F, 29F, 0F, 0F, 29F, -0.25F, -0.25F, -29F, -0.25F, -0.25F); // Box 28

		gun_3_Model[0][28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-32F, -0.75F, -0.75F, 32F, -0.75F, -0.75F, 32F, 0F, 0F, -32F, 0F, 0F, -32F, 0F, 0F, 32F, 0F, 0F, 32F, -0.25F, -0.25F, -32F, -0.25F, -0.25F); // Box 29

		gun_3_Model[0][29].addShapeBox(0F, 0F, 0F, 24, 1, 1, 0F,-18F, 0F, 0.375F, 23.125F, 0F, 0.375F, 23.125F, 0F, -1F, -18F, 0F, -1F, -18F, -0.75F, 0.25F, 23.125F, -0.75F, 0.25F, 23.125F, -0.625F, -1F, -18F, -0.625F, -1F); // Box 2

		gun_3_Model[0][30].addShapeBox(0F, 0F, 0F, 24, 1, 1, 0F,-18F, 0.25F, 0.25F, 23.125F, 0.25F, 0.25F, 23.125F, 0.375F, -1F, -18F, 0.375F, -1F, -18F, -1F, 0.375F, 23.125F, -1F, 0.375F, 23.125F, -1F, -1F, -18F, -1F, -1F); // Box 3

		gun_3_Model[0][31].addShapeBox(0F, 0F, 0F, 24, 1, 1, 0F,-18F, 0.375F, 0F, 23.125F, 0.375F, 0F, 23.125F, 0.25F, -0.75F, -18F, 0.25F, -0.75F, -18F, -1F, 0F, 23.125F, -1F, 0F, 23.125F, -1F, -0.625F, -18F, -1F, -0.625F); // Box 4

		gun_3_Model[0][32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-36F, 1F, 0F, 36F, 1F, 0F, 36F, 0.75F, -0.25F, -36F, 0.75F, -0.25F, -36F, -1F, 0F, 36F, -1F, 0F, 36F, -1F, 0F, -36F, -1F, 0F); // Box 0

		gun_3_Model[0][33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-36F, 0.75F, 0.75F, 36F, 0.75F, 0.75F, 36F, 1F, -1F, -36F, 1F, -1F, -36F, -1F, 1F, 36F, -1F, 1F, 36F, -1F, -1F, -36F, -1F, -1F); // Box 1

		gun_3_Model[0][34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-36F, 0F, 1F, 36F, 0F, 1F, 36F, 0F, -1F, -36F, 0F, -1F, -36F, -0.25F, 0.75F, 36F, -0.25F, 0.75F, 36F, 0F, -1F, -36F, 0F, -1F); // Box 2

		gun_3_Model[0][35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-36F, 0F, 0F, 36F, 0F, 0F, 36F, 0F, 0F, -36F, 0F, 0F, -36F, 0F, 0F, 36F, 0F, 0F, 36F, -0.25F, -0.25F, -36F, -0.25F, -0.25F); // Box 3

		gun_3_Model[0][36].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-43F, 0F, 0F, 44.25F, 0F, 0F, 44.25F, 0F, -0.375F, -43F, 0F, -0.5F, -43F, -0.5F, 0F, 44.25F, -0.375F, 0F, 44.25F, -0.5F, -0.5F, -43F, -0.625F, -0.625F); // Box 6

		gun_3_Model[0][37].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-46.75F, 0F, 0F, 46F, 0F, 0F, 46F, 0F, -0.375F, -46.75F, 0F, -0.375F, -46.75F, -0.375F, 0F, 46F, -0.375F, 0F, 46F, -0.5F, -0.5F, -46.75F, -0.5F, -0.5F); // Box 8

		gun_3_Model[0][38].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-46.5F, -0.25F, 0F, 45.75F, 0F, 0F, 45.75F, 0F, -0.375F, -46.5F, -0.25F, -0.45F, -46.5F, -0.375F, 0F, 45.75F, -0.375F, 0F, 45.75F, -0.5F, -0.5F, -46.5F, -0.5F, -0.5F); // Box 9

		gun_3_Model[0][39].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-46.25F, 0F, 0F, 45.5F, -0.25F, 0F, 45.5F, -0.25F, -0.45F, -46.25F, 0F, -0.375F, -46.25F, -0.375F, 0F, 45.5F, -0.375F, 0F, 45.5F, -0.5F, -0.5F, -46.25F, -0.5F, -0.5F); // Box 10

		gun_3_Model[0][40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-46F, -0.25F, 0F, 45.25F, 0F, 0F, 45.25F, 0F, -0.375F, -46F, -0.25F, -0.45F, -46F, -0.375F, 0F, 45.25F, -0.375F, 0F, 45.25F, -0.5F, -0.5F, -46F, -0.5F, -0.5F); // Box 11

		gun_3_Model[0][41].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-45.75F, 0F, 0F, 45F, -0.25F, 0F, 45F, -0.25F, -0.45F, -45.75F, 0F, -0.375F, -45.75F, -0.375F, 0F, 45F, -0.375F, 0F, 45F, -0.5F, -0.5F, -45.75F, -0.5F, -0.5F); // Box 12

		gun_3_Model[0][42].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-45.25F, 0F, 0F, 44.5F, -0.25F, 0F, 44.5F, -0.25F, -0.45F, -45.25F, 0F, -0.375F, -45.25F, -0.375F, 0F, 44.5F, -0.375F, 0F, 44.5F, -0.5F, -0.5F, -45.25F, -0.5F, -0.5F); // Box 13

		gun_3_Model[0][43].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-45.5F, -0.25F, 0F, 44.75F, 0F, 0F, 44.75F, 0F, -0.375F, -45.5F, -0.25F, -0.45F, -45.5F, -0.375F, 0F, 44.75F, -0.375F, 0F, 44.75F, -0.5F, -0.5F, -45.5F, -0.5F, -0.5F); // Box 14

		gun_3_Model[0][44].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-43F, 0.5F, 0F, 44.25F, 0.625F, 0F, 44.25F, 0.5F, -0.5F, -43F, 0.375F, -0.625F, -43F, -1F, 0F, 44.25F, -1F, 0F, 44.25F, -1F, -0.375F, -43F, -1F, -0.5F); // Box 15

		gun_3_Model[0][45].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-46.75F, 0.625F, 0F, 46F, 0.625F, 0F, 46F, 0.5F, -0.5F, -46.75F, 0.5F, -0.5F, -46.75F, -1F, 0F, 46F, -1F, 0F, 46F, -1F, -0.375F, -46.75F, -1F, -0.375F); // Box 15

		gun_3_Model[0][46].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-46.5F, 0.625F, 0F, 45.75F, 0.625F, 0F, 45.75F, 0.5F, -0.5F, -46.5F, 0.5F, -0.5F, -46.5F, -1.25F, 0F, 45.75F, -1F, 0F, 45.75F, -1F, -0.375F, -46.5F, -1.25F, -0.45F); // Box 15

		gun_3_Model[0][47].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-46.25F, 0.625F, 0F, 45.5F, 0.625F, 0F, 45.5F, 0.5F, -0.5F, -46.25F, 0.5F, -0.5F, -46.25F, -1F, 0F, 45.5F, -1.25F, 0F, 45.5F, -1.25F, -0.45F, -46.25F, -1F, -0.375F); // Box 15

		gun_3_Model[0][48].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-46F, 0.625F, 0F, 45.25F, 0.625F, 0F, 45.25F, 0.5F, -0.5F, -46F, 0.5F, -0.5F, -46F, -1.25F, 0F, 45.25F, -1F, 0F, 45.25F, -1F, -0.375F, -46F, -1.25F, -0.45F); // Box 15

		gun_3_Model[0][49].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-45.75F, 0.625F, 0F, 45F, 0.625F, 0F, 45F, 0.5F, -0.5F, -45.75F, 0.5F, -0.5F, -45.75F, -1F, 0F, 45F, -1.25F, 0F, 45F, -1.25F, -0.45F, -45.75F, -1F, -0.375F); // Box 15

		gun_3_Model[0][50].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-45.25F, 0.625F, 0F, 44.5F, 0.625F, 0F, 44.5F, 0.5F, -0.5F, -45.25F, 0.5F, -0.5F, -45.25F, -1F, 0F, 44.5F, -1.25F, 0F, 44.5F, -1.25F, -0.45F, -45.25F, -1F, -0.375F); // Box 15

		gun_3_Model[0][51].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-45.5F, 0.625F, 0F, 44.75F, 0.625F, 0F, 44.75F, 0.5F, -0.5F, -45.5F, 0.5F, -0.5F, -45.5F, -1.25F, 0F, 44.75F, -1F, 0F, 44.75F, -1F, -0.375F, -45.5F, -1.25F, -0.45F); // Box 15

		gun_3_Model[0][52].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-43F, 0F, 0.5F, 44.25F, 0F, 0.625F, 44.25F, 0F, -1F, -43F, 0F, -1F, -43F, -0.625F, 0.375F, 44.25F, -0.5F, 0.5F, 44.25F, -0.375F, -1F, -43F, -0.5F, -1F); // Box 23

		gun_3_Model[0][53].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-46.75F, 0F, 0.625F, 46F, 0F, 0.625F, 46F, 0F, -1F, -46.75F, 0F, -1F, -46.75F, -0.5F, 0.5F, 46F, -0.5F, 0.5F, 46F, -0.375F, -1F, -46.75F, -0.375F, -1F); // Box 24

		gun_3_Model[0][54].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-46.5F, -0.25F, 0.55F, 45.75F, 0F, 0.625F, 45.75F, 0F, -1F, -46.5F, -0.25F, -1F, -46.5F, -0.5F, 0.5F, 45.75F, -0.5F, 0.5F, 45.75F, -0.375F, -1F, -46.5F, -0.375F, -1F); // Box 25

		gun_3_Model[0][55].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-46.25F, 0F, 0.625F, 45.5F, -0.25F, 0.55F, 45.5F, -0.25F, -1F, -46.25F, 0F, -1F, -46.25F, -0.5F, 0.5F, 45.5F, -0.5F, 0.5F, 45.5F, -0.375F, -1F, -46.25F, -0.375F, -1F); // Box 26

		gun_3_Model[0][56].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-46F, -0.25F, 0.55F, 45.25F, 0F, 0.625F, 45.25F, 0F, -1F, -46F, -0.25F, -1F, -46F, -0.5F, 0.5F, 45.25F, -0.5F, 0.5F, 45.25F, -0.375F, -1F, -46F, -0.375F, -1F); // Box 27

		gun_3_Model[0][57].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-45.75F, 0F, 0.625F, 45F, -0.25F, 0.55F, 45F, -0.25F, -1F, -45.75F, 0F, -1F, -45.75F, -0.5F, 0.5F, 45F, -0.5F, 0.5F, 45F, -0.375F, -1F, -45.75F, -0.375F, -1F); // Box 28

		gun_3_Model[0][58].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-45.25F, 0F, 0.625F, 44.5F, -0.25F, 0.55F, 44.5F, -0.25F, -1F, -45.25F, 0F, -1F, -45.25F, -0.5F, 0.5F, 44.5F, -0.5F, 0.5F, 44.5F, -0.375F, -1F, -45.25F, -0.375F, -1F); // Box 29

		gun_3_Model[0][59].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-45.5F, -0.25F, 0.55F, 44.75F, 0F, 0.625F, 44.75F, 0F, -1F, -45.5F, -0.25F, -1F, -45.5F, -0.5F, 0.5F, 44.75F, -0.5F, 0.5F, 44.75F, -0.375F, -1F, -45.5F, -0.375F, -1F); // Box 30

		gun_3_Model[0][60].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-43F, 0.375F, 0.375F, 44.25F, 0.5F, 0.5F, 44.25F, 0.625F, -1F, -43F, 0.5F, -1F, -43F, -1F, 0.5F, 44.25F, -1F, 0.625F, 44.25F, -1F, -1F, -43F, -1F, -1F); // Box 31

		gun_3_Model[0][61].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-46.75F, 0.5F, 0.5F, 46F, 0.5F, 0.5F, 46F, 0.625F, -1F, -46.75F, 0.625F, -1F, -46.75F, -1F, 0.625F, 46F, -1F, 0.625F, 46F, -1F, -1F, -46.75F, -1F, -1F); // Box 32

		gun_3_Model[0][62].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-46.5F, 0.5F, 0.5F, 45.75F, 0.5F, 0.5F, 45.75F, 0.625F, -1F, -46.5F, 0.625F, -1F, -46.5F, -1.25F, 0.55F, 45.75F, -1F, 0.625F, 45.75F, -1F, -1F, -46.5F, -1.25F, -1F); // Box 33

		gun_3_Model[0][63].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-46.25F, 0.5F, 0.5F, 45.5F, 0.5F, 0.5F, 45.5F, 0.625F, -1F, -46.25F, 0.625F, -1F, -46.25F, -1F, 0.625F, 45.5F, -1.25F, 0.55F, 45.5F, -1.25F, -1F, -46.25F, -1F, -1F); // Box 34

		gun_3_Model[0][64].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-46F, 0.5F, 0.5F, 45.25F, 0.5F, 0.5F, 45.25F, 0.625F, -1F, -46F, 0.625F, -1F, -46F, -1.25F, 0.55F, 45.25F, -1F, 0.625F, 45.25F, -1F, -1F, -46F, -1.25F, -1F); // Box 35

		gun_3_Model[0][65].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-45.75F, 0.5F, 0.5F, 45F, 0.5F, 0.5F, 45F, 0.625F, -1F, -45.75F, 0.625F, -1F, -45.75F, -1F, 0.625F, 45F, -1.25F, 0.55F, 45F, -1.25F, -1F, -45.75F, -1F, -1F); // Box 36

		gun_3_Model[0][66].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-45.25F, 0.5F, 0.5F, 44.5F, 0.5F, 0.5F, 44.5F, 0.625F, -1F, -45.25F, 0.625F, -1F, -45.25F, -1F, 0.625F, 44.5F, -1.25F, 0.55F, 44.5F, -1.25F, -1F, -45.25F, -1F, -1F); // Box 37

		gun_3_Model[0][67].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-45.5F, 0.5F, 0.5F, 44.75F, 0.5F, 0.5F, 44.75F, 0.625F, -1F, -45.5F, 0.625F, -1F, -45.5F, -1.25F, 0.55F, 44.75F, -1F, 0.625F, 44.75F, -1F, -1F, -45.5F, -1.25F, -1F); // Box 38

		gun_3_Model[0][68].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-36.25F, 1.5F, 0F, 35.75F, 1.5F, 0F, 35.75F, 1.5F, -0.875F, -36.25F, 1.5F, -0.875F, -36.25F, -1F, 0F, 35.75F, -1F, 0F, 35.75F, -1F, -0.875F, -36.25F, -1F, -0.875F); // Box 39

		gun_3_Model[0][69].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-36.25F, 1.5F, 0.125F, 35.75F, 1.5F, 0.125F, 35.75F, 1.5F, -1F, -36.25F, 1.5F, -1F, -36.25F, -1F, 0.125F, 35.75F, -1F, 0.125F, 35.75F, -1F, -1F, -36.25F, -1F, -1F); // Box 40

		gun_3_Model[0][70].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-36.25F, 1.5F, 0F, 35.75F, 1.5F, 0F, 35.75F, 1.625F, -0.75F, -36.25F, 1.625F, -0.75F, -36.25F, -2.375F, 0F, 35.75F, -2.375F, 0F, 35.75F, -2.5F, -0.75F, -36.25F, -2.5F, -0.75F); // Box 41

		gun_3_Model[0][71].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-36.25F, 1.625F, 0.25F, 35.75F, 1.625F, 0.25F, 35.75F, 1.5F, -1F, -36.25F, 1.5F, -1F, -36.25F, -2.5F, 0.25F, 35.75F, -2.5F, 0.25F, 35.75F, -2.375F, -1F, -36.25F, -2.375F, -1F); // Box 42

		gun_3_Model[0][72].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-36.25F, 2F, -0.25F, 35.75F, 2F, -0.25F, 35.75F, 1.875F, -0.625F, -36.25F, 1.875F, -0.625F, -36.25F, -2.5F, -0.25F, 35.75F, -2.5F, -0.25F, 35.75F, -2.625F, -0.625F, -36.25F, -2.625F, -0.625F); // Box 43

		gun_3_Model[0][73].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-36.25F, 1.875F, 0.375F, 35.75F, 1.875F, 0.375F, 35.75F, 2F, -1.25F, -36.25F, 2F, -1.25F, -36.25F, -2.625F, 0.375F, 35.75F, -2.625F, 0.375F, 35.75F, -2.5F, -1.25F, -36.25F, -2.5F, -1.25F); // Box 44

		gun_3_Model[0][74].addShapeBox(0F, 0F, 0F, 14, 2, 2, 0F,0F, 1F, 1.5F, -4.75F, 1.75F, 1.5F, -4.75F, 1.75F, -0.5F, 0F, 1F, -0.5F, 0F, 0.25F, 1.5F, -4.75F, 0.25F, 1.5F, -4.75F, 0.25F, -0.5F, 0F, 0.25F, -0.5F); // Box 45

		gun_3_Model[0][75].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,-14F, 0F, 0F, 11F, 0F, 0F, 11F, 0F, 0F, -14F, 0F, 0.5F, -14F, 0.5F, 0F, 11F, 0F, 0F, 11F, -0.25F, -0.25F, -14F, 0.125F, 0.125F); // Box 46

		gun_3_Model[0][76].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,-14F, 1.5F, 0F, 11F, 1F, 0F, 11F, 0.75F, -0.25F, -14F, 1.125F, 0.125F, -14F, -1F, 0F, 11F, -1F, 0F, 11F, -1F, 0F, -14F, -1F, 0.5F); // Box 47

		gun_3_Model[0][77].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,-14F, 1.125F, 1.125F, 11F, 0.75F, 0.75F, 11F, 1F, -1F, -14F, 1.5F, -1F, -14F, -1F, 1.5F, 11F, -1F, 1F, 11F, -1F, -1F, -14F, -1F, -1F); // Box 48

		gun_3_Model[0][78].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,-14F, 0F, 1.5F, 11F, 0F, 1F, 11F, 0F, -1F, -14F, 0F, -1F, -14F, 0.125F, 1.125F, 11F, -0.25F, 0.75F, 11F, 0F, -1F, -14F, 0.5F, -1F); // Box 49

		gun_3_Model[0][79].addShapeBox(0F, 0F, 0F, 14, 2, 2, 0F,-13.5F, 2.25F, -0.875F, 0F, 1.5F, -0.875F, 0F, 1.5F, -0.5F, -13.5F, 2.25F, -0.5F, -13.5F, 0.25F, -0.875F, 0F, -0.25F, -0.875F, 0F, -0.25F, -0.5F, -13.5F, 0.25F, -0.5F); // Box 0

		gun_3_Model[0][80].addShapeBox(0F, 0F, 0F, 14, 2, 2, 0F,-9.25F, 2.25F, 1.5F, -0.5F, 2.25F, 1.5F, -0.5F, 2.25F, -2.875F, -9.25F, 2.25F, -2.875F, -9.25F, 0.25F, 1.5F, -0.5F, 0.25F, 1.5F, -0.5F, 0.25F, -2.625F, -9.25F, 0.25F, -2.625F); // Box 1

		gun_3_Model[0][81].addShapeBox(0F, 0F, 0F, 14, 2, 2, 0F,0F, 1.25F, -0.875F, -4.75F, 2.25F, -0.875F, -4.75F, 2.25F, -0.5F, 0F, 1.25F, -0.5F, 0F, 0.25F, -0.875F, -4.75F, 0.25F, -0.875F, -4.75F, 0.25F, -0.5F, 0F, 0.25F, -0.5F); // Box 3

		gun_3_Model[0][82].addShapeBox(0F, 0F, 0F, 14, 2, 2, 0F,0F, 1.25F, 1.5F, -4.75F, 2.25F, 1.5F, -4.75F, 2.25F, -2.875F, 0F, 1.25F, -2.875F, 0F, 0.25F, 1.5F, -4.75F, 0.25F, 1.5F, -4.75F, 0.25F, -2.875F, 0F, 0.25F, -2.875F); // Box 4

		gun_3_Model[0][83].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,-13.5F, 2.25F, 0.25F, 10.25F, 1.375F, 0.25F, 10.25F, 1.375F, -0.75F, -13.5F, 2.25F, -0.75F, -13.5F, -1F, 0.25F, 11F, -1.875F, 0.25F, 11F, -1.875F, -0.75F, -13.5F, -1F, -0.75F); // Box 0

		gun_3_Model[0][84].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,-2.7F, -1.25F, 2.05F, -2.7F, -1.25F, 2.05F, -2.7F, -1.25F, -3.5F, -2.7F, -1.25F, -3.5F, -2.7F, 1F, 2.05F, -2.7F, 1F, 2.05F, -2.7F, 1F, -3.5F, -2.7F, 1F, -3.5F); // Box 5

		gun_3_Model[0][85].addShapeBox(0F, 0F, 0F, 13, 2, 2, 0F,-8F, 2.75F, -1.5F, 0F, 2.25F, -2F, 0F, 2.25F, 2F, -8F, 2.75F, 2.5F, -8F, -2.75F, -1.5F, 0F, -3.25F, -2F, 0F, -3.25F, 2F, -8F, -2.75F, 2.5F); // Box 0

		gun_3_Model[0][86].addShapeBox(0F, 0F, 0F, 13, 2, 2, 0F,-8F, 3.25F, -2F, 0F, 2.75F, -2.5F, 0F, 2.75F, 1.5F, -8F, 3.25F, 2F, -8F, -4.75F, -1.5F, 0F, -4.25F, -2F, 0F, -4.25F, 2F, -8F, -4.75F, 2.5F); // Box 1

		gun_3_Model[0][87].addShapeBox(0F, 0F, 0F, 13, 2, 2, 0F,-8F, 0.75F, -1.5F, 0F, 1.25F, -2F, 0F, 1.25F, 2F, -8F, 0.75F, 2.5F, -8F, -2.25F, -2F, 0F, -2.75F, -2.5F, 0F, -2.75F, 1.5F, -8F, -2.25F, 2F); // Box 2

		gun_3_Model[0][88].addShapeBox(0F, 0F, 0F, 13, 2, 2, 0F,-8F, 0.875F, -1.5F, 0F, 1.375F, -1.5F, 0F, 1.375F, 2F, -8F, 0.875F, 2.5F, -8F, -2.25F, -1.5F, 0F, -2.75F, -1.5F, 0F, -2.75F, 1.5F, -8F, -2.25F, 2F); // Box 3

		gun_3_Model[0][89].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 1.25F, -0.875F, -4.75F, -0.125F, -0.875F, -4.75F, -0.125F, -0.5F, 0F, 1.25F, -0.5F, 0F, 0.25F, -0.875F, -4.75F, -0.875F, -0.875F, -4.75F, -0.875F, -0.5F, 0F, 0.25F, -0.5F); // Box 5

		gun_3_Model[0][90].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 1.25F, 1.5F, -4.75F, -0.125F, 1.5F, -4.75F, -0.125F, -2.875F, 0F, 1.25F, -2.875F, 0F, 0.25F, 1.5F, -4.75F, -0.875F, 1.5F, -4.75F, -0.875F, -2.875F, 0F, 0.25F, -2.875F); // Box 6

		gun_3_Model[0][91].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.375F, -0.125F, 3.75F, -0.625F, -0.125F, 3.75F, -0.625F, -0.125F, 2.75F, 0.375F, -0.125F, 2.75F, 0.125F, -0.625F, 3.75F, -0.875F, -0.625F, 3.75F, -0.875F, -0.625F, 2.75F, 0.125F, -0.625F, 2.75F); // Box 9

		gun_3_Model[0][92].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.375F, 0.125F, 3.75F, -0.625F, 0.125F, 3.75F, -0.625F, 0.125F, 2.75F, 0.375F, 0.125F, 2.75F, 0.375F, -0.875F, 3.75F, -0.625F, -0.875F, 3.75F, -0.625F, -0.875F, 2.75F, 0.375F, -0.875F, 2.75F); // Box 10

		gun_3_Model[0][93].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.125F, 0.375F, 3.75F, -0.875F, 0.375F, 3.75F, -0.875F, 0.375F, 2.75F, 0.125F, 0.375F, 2.75F, 0.375F, -1.125F, 3.75F, -0.625F, -1.125F, 3.75F, -0.625F, -1.125F, 2.75F, 0.375F, -1.125F, 2.75F); // Box 11

		gun_3_Model[0][94].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 1F, 1.5F, -4.75F, -0.125F, 1.5F, -4.75F, -0.125F, -0.5F, 0F, 1F, -0.5F, 0F, 0.25F, 1.5F, -4.75F, -0.875F, 1.5F, -4.75F, -0.875F, -0.5F, 0F, 0.25F, -0.5F); // Box 12

		gun_3_Model[0][95].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,-3.575F, 2.65F, 1.85F, -2.025F, 2.5F, 1.85F, -2.025F, 2.5F, -3.65F, -3.575F, 2.65F, -3.65F, -2.775F, 0.25F, 1.85F, -2.775F, 0.5F, 1.85F, -2.775F, 0.5F, -3.65F, -2.775F, 0.25F, -3.65F); // Box 13

		gun_3_Model[0][96].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,-3.675F, 2.6F, 1.975F, -2.125F, 2.52F, 1.975F, -2.025F, 2.5F, -3.85F, -3.575F, 2.65F, -3.85F, -2.875F, 0.25F, 1.975F, -2.875F, 0.5F, 1.975F, -2.775F, 0.5F, -3.85F, -2.775F, 0.25F, -3.85F); // Box 14

		gun_3_Model[0][97].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,-3.575F, 2.65F, 1.65F, -2.025F, 2.5F, 1.65F, -2.125F, 2.52F, -3.525F, -3.675F, 2.6F, -3.525F, -2.775F, 0.25F, 1.65F, -2.775F, 0.5F, 1.65F, -2.875F, 0.5F, -3.525F, -2.875F, 0.25F, -3.525F); // Box 15

		gun_3_Model[0][98].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,1.25F, 0.5F, -1.5F, -1.75F, -0.125F, -1F, -1.75F, -0.125F, -0.5F, 1.25F, 0.5F, 0F, 1.25F, -2.25F, -1.5F, -1.75F, -1.625F, -1F, -1.75F, -1.625F, -0.5F, 1.25F, -2.25F, 0F); // Box 25

		gun_3_Model[0][99].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-4.125F, -1.75F, 1.75F, 3.375F, -1.75F, 1.75F, 3.375F, -1.75F, -0.25F, -4.125F, -1.75F, -0.25F, -4.075F, 1.25F, 1.75F, 3.325F, 1.25F, 1.75F, 3.325F, 1.25F, -0.25F, -4.075F, 1.25F, -0.25F); // Box 27

		gun_3_Model[0][100].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,1.25F, -1.5F, -1.5F, -1.75F, -0.875F, -1F, -1.75F, -0.875F, -0.5F, 1.25F, -1.5F, 0F, 1.25F, -0.25F, -1.5F, -1.75F, -0.875F, -1F, -1.75F, -0.875F, -0.5F, 1.25F, -0.25F, 0F); // Box 28

		gun_3_Model[0][101].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,1.25F, 0.5F, 2F, -1.75F, -0.125F, 1.5F, -1.75F, -0.125F, -3F, 1.25F, 0.5F, -3.5F, 1.25F, -2.25F, 2F, -1.75F, -1.625F, 1.5F, -1.75F, -1.625F, -3F, 1.25F, -2.25F, -3.5F); // Box 29

		gun_3_Model[0][102].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,1.25F, -1.5F, 2F, -1.75F, -0.875F, 1.5F, -1.75F, -0.875F, -3F, 1.25F, -1.5F, -3.5F, 1.25F, -0.25F, 2F, -1.75F, -0.875F, 1.5F, -1.75F, -0.875F, -3F, 1.25F, -0.25F, -3.5F); // Box 29

		gun_3_Model[0][103].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,2.5F, 0.375F, -2F, -3F, 0.325F, -1.95F, -3.125F, 0.325F, 0.125F, 2.375F, 0.375F, 0.125F, 2.5F, -0.375F, -2F, -3F, -0.425F, -1.95F, -3.125F, -0.425F, 0.125F, 2.375F, -0.375F, 0.125F); // Box 31

		gun_3_Model[0][104].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,2.5F, 0.625F, -1.625F, -2.25F, 0.5F, -1.5F, -2.25F, 0.5F, 0F, 2.5F, 0.625F, 0.125F, 2.5F, -2.375F, -1.625F, -2.25F, -2.25F, -1.5F, -2.25F, -2.25F, 0F, 2.5F, -2.375F, 0.125F); // Box 32

		gun_3_Model[0][105].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,2.5F, 0.625F, 2.125F, -2.25F, 0.5F, 2F, -2.25F, 0.5F, -3.5F, 2.5F, 0.625F, -3.625F, 2.5F, -2.375F, 2.125F, -2.25F, -2.25F, 2F, -2.25F, -2.25F, -3.5F, 2.5F, -2.375F, -3.625F); // Box 33

		gun_3_Model[0][106].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,2.5F, -1.625F, -1.625F, -2.25F, -1.5F, -1.5F, -2.25F, -1.5F, 0F, 2.5F, -1.625F, 0.125F, 2.5F, -0.125F, -1.625F, -2.25F, -0.25F, -1.5F, -2.25F, -0.25F, 0F, 2.5F, -0.125F, 0.125F); // Box 34

		gun_3_Model[0][107].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,2.5F, -1.625F, 2.125F, -2.25F, -1.5F, 2F, -2.25F, -1.5F, -3.5F, 2.5F, -1.625F, -3.625F, 2.5F, -0.125F, 2.125F, -2.25F, -0.25F, 2F, -2.25F, -0.25F, -3.5F, 2.5F, -0.125F, -3.625F); // Box 35

		gun_3_Model[0][108].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,2.5F, 0.375F, -1.75F, -3F, 0.325F, -1.7F, -3F, 0.325F, 0F, 2.5F, 0.375F, 0F, 2.5F, -0.375F, -1.75F, -3F, -0.425F, -1.7F, -3F, -0.425F, 0F, 2.5F, -0.375F, 0F); // Box 36

		gun_3_Model[0][109].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,2.375F, 0.375F, -1.625F, -3.125F, 0.325F, -1.575F, -3F, 0.325F, -0.25F, 2.5F, 0.375F, -0.25F, 2.375F, -0.375F, -1.625F, -3.125F, -0.425F, -1.575F, -3F, -0.425F, -0.25F, 2.5F, -0.375F, -0.25F); // Box 37

		gun_3_Model[0][110].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,2.375F, 0.375F, 2.125F, -3.125F, 0.325F, 2.125F, -3F, 0.325F, -3.95F, 2.5F, 0.375F, -4F, 2.375F, -0.375F, 2.125F, -3.125F, -0.425F, 2.125F, -3F, -0.425F, -3.95F, 2.5F, -0.375F, -4F); // Box 38

		gun_3_Model[0][111].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,2.5F, 0.375F, 2F, -3F, 0.325F, 2F, -3F, 0.325F, -3.7F, 2.5F, 0.375F, -3.75F, 2.5F, -0.375F, 2F, -3F, -0.425F, 2F, -3F, -0.425F, -3.7F, 2.5F, -0.375F, -3.75F); // Box 38

		gun_3_Model[0][112].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,2.5F, 0.375F, 1.75F, -3F, 0.325F, 1.75F, -3.125F, 0.325F, -3.575F, 2.375F, 0.375F, -3.625F, 2.5F, -0.375F, 1.75F, -3F, -0.425F, 1.75F, -3.125F, -0.425F, -3.575F, 2.375F, -0.375F, -3.625F); // Box 38

		gun_3_Model[0][113].addShapeBox(0F, 0F, 0F, 14, 2, 2, 0F,-9.25F, 1.75F, 1.5F, -0.5F, 1.75F, 1.5F, -0.5F, 1.75F, -0.5F, -9.25F, 1.75F, -0.5F, -9.25F, 0.25F, 1.5F, -0.5F, 0.25F, 1.5F, -0.5F, 0.25F, -0.5F, -9.25F, 0.25F, -0.5F); // Box 0

		gun_3_Model[0][114].addShapeBox(0F, 0F, 0F, 14, 2, 2, 0F,-9.25F, 2.25F, -0.875F, -0.5F, 2.25F, -0.875F, -0.5F, 2.25F, -0.5F, -9.25F, 2.25F, -0.5F, -9.25F, 0.25F, -0.875F, -0.5F, 0.25F, -0.875F, -0.5F, 0.25F, -0.5F, -9.25F, 0.25F, -0.5F); // Box 1

		gun_3_Model[0][115].addShapeBox(0F, 0F, 0F, 14, 2, 2, 0F,-13.5F, 1.75F, 1.5F, 0F, 1.5F, 1.5F, 0F, 1.5F, -0.5F, -13.5F, 1.75F, -0.5F, -13.5F, 0.25F, 1.5F, 0F, -0.25F, 1.5F, 0F, -0.25F, -0.5F, -13.5F, 0.25F, -0.5F); // Box 2

		gun_3_Model[0][116].addShapeBox(0F, 0F, 0F, 14, 2, 2, 0F,-13.5F, 2.25F, 1.5F, 0F, 1.5F, 1.5F, 0F, 1.5F, -2.875F, -13.5F, 2.25F, -2.875F, -13.5F, 0.25F, 1.5F, 0F, -0.25F, 1.5F, 0F, -0.25F, -2.875F, -13.5F, 0.25F, -2.875F); // Box 3

		gun_3_Model[0][117].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,-12.25F, 2.125F, 0.25F, 6.5F, 2.25F, 0.25F, 6.5F, 2.25F, -0.75F, -12.25F, 2.125F, -0.75F, -10F, -1.875F, 0.25F, 6.5F, -1F, 0.25F, 6.5F, -1F, -0.75F, -10F, -1.875F, -0.75F); // Box 4

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_3_Model[0])
		{
			gunPart.setRotationPoint(263F, -71F, 0F);
		}


		gun_3_Model[1] = new ModelRendererTurbo[0];

		gun_3_Model[2] = new ModelRendererTurbo[12];
		gun_3_Model[2][0] = new ModelRendererTurbo(this, 1599, 685, textureX, textureY); // Box 8
		gun_3_Model[2][1] = new ModelRendererTurbo(this, 1615, 685, textureX, textureY); // Box 13
		gun_3_Model[2][2] = new ModelRendererTurbo(this, 1631, 685, textureX, textureY); // Box 15
		gun_3_Model[2][3] = new ModelRendererTurbo(this, 1647, 685, textureX, textureY); // Box 16
		gun_3_Model[2][4] = new ModelRendererTurbo(this, 1663, 685, textureX, textureY); // Box 17
		gun_3_Model[2][5] = new ModelRendererTurbo(this, 1679, 685, textureX, textureY); // Box 18
		gun_3_Model[2][6] = new ModelRendererTurbo(this, 1695, 685, textureX, textureY); // Box 19
		gun_3_Model[2][7] = new ModelRendererTurbo(this, 1711, 685, textureX, textureY); // Box 19
		gun_3_Model[2][8] = new ModelRendererTurbo(this, 1727, 685, textureX, textureY); // Box 19
		gun_3_Model[2][9] = new ModelRendererTurbo(this, 1743, 685, textureX, textureY); // Box 19
		gun_3_Model[2][10] = new ModelRendererTurbo(this, 1759, 685, textureX, textureY); // Box 19
		gun_3_Model[2][11] = new ModelRendererTurbo(this, 1775, 685, textureX, textureY); // Box 19

		gun_3_Model[2][0].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-2.5F, -4F, 1.75F, -1.25F, -3.5F, 1.75F, -1.25F, -3.5F, -2.5F, -2.5F, -4F, -2.5F, -2.5F, 3.25F, 1.75F, -1.25F, 2.75F, 1.75F, -1.25F, 2.75F, -2.5F, -2.5F, 3.25F, -2.5F); // Box 8

		gun_3_Model[2][1].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -4.75F, 1.75F, -2.5F, -4F, 1.75F, -2.5F, -4F, -2.5F, 0F, -4.75F, -2.5F, 0F, 4F, 1.75F, -2.5F, 3.25F, 1.75F, -2.5F, 3.25F, -2.5F, 0F, 4F, -2.5F); // Box 13

		gun_3_Model[2][2].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-4F, -2.5F, 1.75F, -0.75F, -2.5F, 1.75F, -0.75F, -2.5F, -2.5F, -4F, -2.5F, -2.5F, -3.5F, 2.75F, 1.75F, -1.25F, 2.75F, 1.75F, -1.25F, 2.75F, -2.5F, -3.5F, 2.75F, -2.5F); // Box 15

		gun_3_Model[2][3].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,2.5F, -4F, 1.75F, -5F, -4.75F, 1.75F, -5F, -4.75F, -2.5F, 2.5F, -4F, -2.5F, 2.5F, 3.25F, 1.75F, -5F, 4F, 1.75F, -5F, 4F, -2.5F, 2.5F, 3.25F, -2.5F); // Box 16

		gun_3_Model[2][4].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,3.75F, -3.5F, 1.75F, -7.5F, -4F, 1.75F, -7.5F, -4F, -2.5F, 3.75F, -3.5F, -2.5F, 3.75F, 2.75F, 1.75F, -7.5F, 3.25F, 1.75F, -7.5F, 3.25F, -2.5F, 3.75F, 2.75F, -2.5F); // Box 17

		gun_3_Model[2][5].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-4.075F, -2.25F, 1.75F, -0.675F, -2.25F, 1.75F, -0.675F, -2.25F, -2.5F, -4.125F, -2.25F, -2.5F, -4F, 1.5F, 1.75F, -0.75F, 1.5F, 1.75F, -0.75F, 1.5F, -2.5F, -4F, 1.5F, -2.5F); // Box 18

		gun_3_Model[2][6].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-2.5F, -4F, -1.5F, -1.25F, -3.5F, -1.5F, -1.25F, -3.5F, 0.75F, -2.5F, -4F, 0.75F, -2.5F, 3.25F, -1.5F, -1.25F, 2.75F, -1.5F, -1.25F, 2.75F, 0.75F, -2.5F, 3.25F, 0.75F); // Box 19

		gun_3_Model[2][7].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -4.75F, -1.5F, -2.5F, -4F, -1.5F, -2.5F, -4F, 0.75F, 0F, -4.75F, 0.75F, 0F, 4F, -1.5F, -2.5F, 3.25F, -1.5F, -2.5F, 3.25F, 0.75F, 0F, 4F, 0.75F); // Box 19

		gun_3_Model[2][8].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-4F, -2.5F, -1.5F, -0.75F, -2.5F, -1.5F, -0.75F, -2.5F, 0.75F, -4F, -2.5F, 0.75F, -3.5F, 2.75F, -1.5F, -1.25F, 2.75F, -1.5F, -1.25F, 2.75F, 0.75F, -3.5F, 2.75F, 0.75F); // Box 19

		gun_3_Model[2][9].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,2.5F, -4F, -1.5F, -5F, -4.75F, -1.5F, -5F, -4.75F, 0.75F, 2.5F, -4F, 0.75F, 2.5F, 3.25F, -1.5F, -5F, 4F, -1.5F, -5F, 4F, 0.75F, 2.5F, 3.25F, 0.75F); // Box 19

		gun_3_Model[2][10].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,3.75F, -3.5F, -1.5F, -7.5F, -4F, -1.5F, -7.5F, -4F, 0.75F, 3.75F, -3.5F, 0.75F, 3.75F, 2.75F, -1.5F, -7.5F, 3.25F, -1.5F, -7.5F, 3.25F, 0.75F, 3.75F, 2.75F, 0.75F); // Box 19

		gun_3_Model[2][11].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-4.125F, -2.25F, -1.5F, -0.675F, -2.25F, -1.5F, -0.675F, -2.25F, 0.75F, -4.075F, -2.25F, 0.75F, -4F, 1.5F, -1.5F, -0.75F, 1.5F, -1.5F, -0.75F, 1.5F, 0.75F, -4F, 1.5F, 0.75F); // Box 19

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_3_Model[2])
		{
			gunPart.setRotationPoint(263F, -71F, 0F);
		}


		registerGunModel("TailGun", gun_3_Model);

		// Passenger 5
		ModelRendererTurbo[][] gun_4_Model = new ModelRendererTurbo[3][];

		gun_4_Model[0] = new ModelRendererTurbo[118];
		gun_4_Model[0][0] = new ModelRendererTurbo(this, 1471, 661, textureX, textureY); // Box 4
		gun_4_Model[0][1] = new ModelRendererTurbo(this, 1527, 661, textureX, textureY); // Box 7
		gun_4_Model[0][2] = new ModelRendererTurbo(this, 1567, 661, textureX, textureY); // Box 8
		gun_4_Model[0][3] = new ModelRendererTurbo(this, 1607, 661, textureX, textureY); // Box 0
		gun_4_Model[0][4] = new ModelRendererTurbo(this, 1647, 661, textureX, textureY); // Box 1
		gun_4_Model[0][5] = new ModelRendererTurbo(this, 1687, 661, textureX, textureY); // Box 0
		gun_4_Model[0][6] = new ModelRendererTurbo(this, 1695, 661, textureX, textureY); // Box 1
		gun_4_Model[0][7] = new ModelRendererTurbo(this, 1703, 661, textureX, textureY); // Box 2
		gun_4_Model[0][8] = new ModelRendererTurbo(this, 1711, 661, textureX, textureY); // Box 3
		gun_4_Model[0][9] = new ModelRendererTurbo(this, 1719, 661, textureX, textureY); // Box 4
		gun_4_Model[0][10] = new ModelRendererTurbo(this, 1727, 661, textureX, textureY); // Box 5
		gun_4_Model[0][11] = new ModelRendererTurbo(this, 1735, 661, textureX, textureY); // Box 12
		gun_4_Model[0][12] = new ModelRendererTurbo(this, 1743, 661, textureX, textureY); // Box 13
		gun_4_Model[0][13] = new ModelRendererTurbo(this, 1751, 661, textureX, textureY); // Box 14
		gun_4_Model[0][14] = new ModelRendererTurbo(this, 1759, 661, textureX, textureY); // Box 15
		gun_4_Model[0][15] = new ModelRendererTurbo(this, 1767, 661, textureX, textureY); // Box 16
		gun_4_Model[0][16] = new ModelRendererTurbo(this, 1775, 661, textureX, textureY); // Box 17
		gun_4_Model[0][17] = new ModelRendererTurbo(this, 1783, 661, textureX, textureY); // Box 18
		gun_4_Model[0][18] = new ModelRendererTurbo(this, 1791, 661, textureX, textureY); // Box 19
		gun_4_Model[0][19] = new ModelRendererTurbo(this, 1799, 661, textureX, textureY); // Box 20
		gun_4_Model[0][20] = new ModelRendererTurbo(this, 1807, 661, textureX, textureY); // Box 21
		gun_4_Model[0][21] = new ModelRendererTurbo(this, 1815, 661, textureX, textureY); // Box 22
		gun_4_Model[0][22] = new ModelRendererTurbo(this, 1823, 661, textureX, textureY); // Box 23
		gun_4_Model[0][23] = new ModelRendererTurbo(this, 1831, 661, textureX, textureY); // Box 24
		gun_4_Model[0][24] = new ModelRendererTurbo(this, 1839, 661, textureX, textureY); // Box 25
		gun_4_Model[0][25] = new ModelRendererTurbo(this, 1847, 661, textureX, textureY); // Box 26
		gun_4_Model[0][26] = new ModelRendererTurbo(this, 1855, 661, textureX, textureY); // Box 27
		gun_4_Model[0][27] = new ModelRendererTurbo(this, 1863, 661, textureX, textureY); // Box 28
		gun_4_Model[0][28] = new ModelRendererTurbo(this, 1871, 661, textureX, textureY); // Box 29
		gun_4_Model[0][29] = new ModelRendererTurbo(this, 1879, 661, textureX, textureY); // Box 2
		gun_4_Model[0][30] = new ModelRendererTurbo(this, 1471, 669, textureX, textureY); // Box 3
		gun_4_Model[0][31] = new ModelRendererTurbo(this, 1527, 669, textureX, textureY); // Box 4
		gun_4_Model[0][32] = new ModelRendererTurbo(this, 1935, 661, textureX, textureY); // Box 0
		gun_4_Model[0][33] = new ModelRendererTurbo(this, 1943, 661, textureX, textureY); // Box 1
		gun_4_Model[0][34] = new ModelRendererTurbo(this, 1951, 661, textureX, textureY); // Box 2
		gun_4_Model[0][35] = new ModelRendererTurbo(this, 1959, 661, textureX, textureY); // Box 3
		gun_4_Model[0][36] = new ModelRendererTurbo(this, 1967, 661, textureX, textureY); // Box 6
		gun_4_Model[0][37] = new ModelRendererTurbo(this, 1975, 661, textureX, textureY); // Box 8
		gun_4_Model[0][38] = new ModelRendererTurbo(this, 1583, 669, textureX, textureY); // Box 9
		gun_4_Model[0][39] = new ModelRendererTurbo(this, 1591, 669, textureX, textureY); // Box 10
		gun_4_Model[0][40] = new ModelRendererTurbo(this, 1599, 669, textureX, textureY); // Box 11
		gun_4_Model[0][41] = new ModelRendererTurbo(this, 1607, 669, textureX, textureY); // Box 12
		gun_4_Model[0][42] = new ModelRendererTurbo(this, 1615, 669, textureX, textureY); // Box 13
		gun_4_Model[0][43] = new ModelRendererTurbo(this, 1623, 669, textureX, textureY); // Box 14
		gun_4_Model[0][44] = new ModelRendererTurbo(this, 1631, 669, textureX, textureY); // Box 15
		gun_4_Model[0][45] = new ModelRendererTurbo(this, 1639, 669, textureX, textureY); // Box 15
		gun_4_Model[0][46] = new ModelRendererTurbo(this, 1647, 669, textureX, textureY); // Box 15
		gun_4_Model[0][47] = new ModelRendererTurbo(this, 1655, 669, textureX, textureY); // Box 15
		gun_4_Model[0][48] = new ModelRendererTurbo(this, 1663, 669, textureX, textureY); // Box 15
		gun_4_Model[0][49] = new ModelRendererTurbo(this, 1671, 669, textureX, textureY); // Box 15
		gun_4_Model[0][50] = new ModelRendererTurbo(this, 1679, 669, textureX, textureY); // Box 15
		gun_4_Model[0][51] = new ModelRendererTurbo(this, 1687, 669, textureX, textureY); // Box 15
		gun_4_Model[0][52] = new ModelRendererTurbo(this, 1695, 669, textureX, textureY); // Box 23
		gun_4_Model[0][53] = new ModelRendererTurbo(this, 1703, 669, textureX, textureY); // Box 24
		gun_4_Model[0][54] = new ModelRendererTurbo(this, 1711, 669, textureX, textureY); // Box 25
		gun_4_Model[0][55] = new ModelRendererTurbo(this, 1719, 669, textureX, textureY); // Box 26
		gun_4_Model[0][56] = new ModelRendererTurbo(this, 1727, 669, textureX, textureY); // Box 27
		gun_4_Model[0][57] = new ModelRendererTurbo(this, 1735, 669, textureX, textureY); // Box 28
		gun_4_Model[0][58] = new ModelRendererTurbo(this, 1743, 669, textureX, textureY); // Box 29
		gun_4_Model[0][59] = new ModelRendererTurbo(this, 1751, 669, textureX, textureY); // Box 30
		gun_4_Model[0][60] = new ModelRendererTurbo(this, 1759, 669, textureX, textureY); // Box 31
		gun_4_Model[0][61] = new ModelRendererTurbo(this, 1767, 669, textureX, textureY); // Box 32
		gun_4_Model[0][62] = new ModelRendererTurbo(this, 1775, 669, textureX, textureY); // Box 33
		gun_4_Model[0][63] = new ModelRendererTurbo(this, 1783, 669, textureX, textureY); // Box 34
		gun_4_Model[0][64] = new ModelRendererTurbo(this, 1791, 669, textureX, textureY); // Box 35
		gun_4_Model[0][65] = new ModelRendererTurbo(this, 1799, 669, textureX, textureY); // Box 36
		gun_4_Model[0][66] = new ModelRendererTurbo(this, 1807, 669, textureX, textureY); // Box 37
		gun_4_Model[0][67] = new ModelRendererTurbo(this, 1815, 669, textureX, textureY); // Box 38
		gun_4_Model[0][68] = new ModelRendererTurbo(this, 1823, 669, textureX, textureY); // Box 39
		gun_4_Model[0][69] = new ModelRendererTurbo(this, 1831, 669, textureX, textureY); // Box 40
		gun_4_Model[0][70] = new ModelRendererTurbo(this, 1839, 669, textureX, textureY); // Box 41
		gun_4_Model[0][71] = new ModelRendererTurbo(this, 1847, 669, textureX, textureY); // Box 42
		gun_4_Model[0][72] = new ModelRendererTurbo(this, 1855, 669, textureX, textureY); // Box 43
		gun_4_Model[0][73] = new ModelRendererTurbo(this, 1863, 669, textureX, textureY); // Box 44
		gun_4_Model[0][74] = new ModelRendererTurbo(this, 1871, 669, textureX, textureY); // Box 45
		gun_4_Model[0][75] = new ModelRendererTurbo(this, 1911, 669, textureX, textureY); // Box 46
		gun_4_Model[0][76] = new ModelRendererTurbo(this, 1935, 669, textureX, textureY); // Box 47
		gun_4_Model[0][77] = new ModelRendererTurbo(this, 1959, 669, textureX, textureY); // Box 48
		gun_4_Model[0][78] = new ModelRendererTurbo(this, 1471, 677, textureX, textureY); // Box 49
		gun_4_Model[0][79] = new ModelRendererTurbo(this, 1495, 677, textureX, textureY); // Box 0
		gun_4_Model[0][80] = new ModelRendererTurbo(this, 1535, 677, textureX, textureY); // Box 1
		gun_4_Model[0][81] = new ModelRendererTurbo(this, 1575, 677, textureX, textureY); // Box 3
		gun_4_Model[0][82] = new ModelRendererTurbo(this, 1615, 677, textureX, textureY); // Box 4
		gun_4_Model[0][83] = new ModelRendererTurbo(this, 1655, 677, textureX, textureY); // Box 0
		gun_4_Model[0][84] = new ModelRendererTurbo(this, 1679, 677, textureX, textureY); // Box 5
		gun_4_Model[0][85] = new ModelRendererTurbo(this, 1703, 677, textureX, textureY); // Box 0
		gun_4_Model[0][86] = new ModelRendererTurbo(this, 1735, 677, textureX, textureY); // Box 1
		gun_4_Model[0][87] = new ModelRendererTurbo(this, 1767, 677, textureX, textureY); // Box 2
		gun_4_Model[0][88] = new ModelRendererTurbo(this, 1799, 677, textureX, textureY); // Box 3
		gun_4_Model[0][89] = new ModelRendererTurbo(this, 1831, 677, textureX, textureY); // Box 5
		gun_4_Model[0][90] = new ModelRendererTurbo(this, 1847, 677, textureX, textureY); // Box 6
		gun_4_Model[0][91] = new ModelRendererTurbo(this, 1863, 677, textureX, textureY); // Box 9
		gun_4_Model[0][92] = new ModelRendererTurbo(this, 1871, 677, textureX, textureY); // Box 10
		gun_4_Model[0][93] = new ModelRendererTurbo(this, 1879, 677, textureX, textureY); // Box 11
		gun_4_Model[0][94] = new ModelRendererTurbo(this, 1887, 677, textureX, textureY); // Box 12
		gun_4_Model[0][95] = new ModelRendererTurbo(this, 1903, 677, textureX, textureY); // Box 13
		gun_4_Model[0][96] = new ModelRendererTurbo(this, 1927, 677, textureX, textureY); // Box 14
		gun_4_Model[0][97] = new ModelRendererTurbo(this, 1951, 677, textureX, textureY); // Box 15
		gun_4_Model[0][98] = new ModelRendererTurbo(this, 1975, 677, textureX, textureY); // Box 25
		gun_4_Model[0][99] = new ModelRendererTurbo(this, 1791, 685, textureX, textureY); // Box 27
		gun_4_Model[0][100] = new ModelRendererTurbo(this, 1799, 685, textureX, textureY); // Box 28
		gun_4_Model[0][101] = new ModelRendererTurbo(this, 1807, 685, textureX, textureY); // Box 29
		gun_4_Model[0][102] = new ModelRendererTurbo(this, 1815, 685, textureX, textureY); // Box 29
		gun_4_Model[0][103] = new ModelRendererTurbo(this, 1823, 685, textureX, textureY); // Box 31
		gun_4_Model[0][104] = new ModelRendererTurbo(this, 1831, 685, textureX, textureY); // Box 32
		gun_4_Model[0][105] = new ModelRendererTurbo(this, 1839, 685, textureX, textureY); // Box 33
		gun_4_Model[0][106] = new ModelRendererTurbo(this, 1847, 685, textureX, textureY); // Box 34
		gun_4_Model[0][107] = new ModelRendererTurbo(this, 1855, 685, textureX, textureY); // Box 35
		gun_4_Model[0][108] = new ModelRendererTurbo(this, 1863, 685, textureX, textureY); // Box 36
		gun_4_Model[0][109] = new ModelRendererTurbo(this, 1871, 685, textureX, textureY); // Box 37
		gun_4_Model[0][110] = new ModelRendererTurbo(this, 1879, 685, textureX, textureY); // Box 38
		gun_4_Model[0][111] = new ModelRendererTurbo(this, 1887, 685, textureX, textureY); // Box 38
		gun_4_Model[0][112] = new ModelRendererTurbo(this, 1895, 685, textureX, textureY); // Box 38
		gun_4_Model[0][113] = new ModelRendererTurbo(this, 1903, 685, textureX, textureY); // Box 0
		gun_4_Model[0][114] = new ModelRendererTurbo(this, 1943, 685, textureX, textureY); // Box 1
		gun_4_Model[0][115] = new ModelRendererTurbo(this, 1471, 693, textureX, textureY); // Box 2
		gun_4_Model[0][116] = new ModelRendererTurbo(this, 1511, 693, textureX, textureY); // Box 3
		gun_4_Model[0][117] = new ModelRendererTurbo(this, 1551, 693, textureX, textureY); // Box 4

		gun_4_Model[0][0].addShapeBox(0F, 0F, 0F, 24, 1, 1, 0F,-18F, 0F, 0F, 23.125F, 0F, 0F, 23.125F, 0F, -0.625F, -18F, 0F, -0.625F, -18F, -0.625F, 0F, 23.125F, -0.625F, 0F, 23.125F, -0.75F, -0.75F, -18F, -0.75F, -0.75F); // Box 4

		gun_4_Model[0][1].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,-18F, 0.93F, -0.25F, 18F, 0.93F, -0.25F, 18F, 0.75F, -0.25F, -18F, 0.75F, -0.25F, -18F, -1.75F, -0.75F, 18F, -1.75F, -0.75F, 18F, -1.25F, -0.08F, -18F, -1.25F, -0.08F); // Box 7

		gun_4_Model[0][2].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,-18F, -0.75F, -0.75F, 18F, -0.75F, -0.75F, 18F, -0.25F, -0.08F, -18F, -0.25F, -0.08F, -18F, -0.07F, -0.25F, 18F, -0.07F, -0.25F, 18F, -0.25F, -0.25F, -18F, -0.25F, -0.25F); // Box 8

		gun_4_Model[0][3].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,-18F, -0.25F, 0.92F, 18F, -0.25F, 0.92F, 18F, -0.75F, -1.75F, -18F, -0.75F, -1.75F, -18F, -0.25F, 0.75F, 18F, -0.25F, 0.75F, 18F, -0.07F, -1.25F, -18F, -0.07F, -1.25F); // Box 0

		gun_4_Model[0][4].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,-18F, 0.75F, 0.75F, 18F, 0.75F, 0.75F, 18F, 0.93F, -1.25F, -18F, 0.93F, -1.25F, -18F, -1.25F, 0.92F, 18F, -1.25F, 0.92F, 18F, -1.75F, -1.75F, -18F, -1.75F, -1.75F); // Box 1

		gun_4_Model[0][5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-20F, 1F, 0F, 20F, 1F, 0F, 20F, 0.75F, -0.25F, -20F, 0.75F, -0.25F, -20F, -1.75F, -0.75F, 20F, -1.75F, -0.75F, 20F, -1F, 0F, -20F, -1F, 0F); // Box 0

		gun_4_Model[0][6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-23F, 1F, 0F, 23F, 1F, 0F, 23F, 0.75F, -0.25F, -23F, 0.75F, -0.25F, -23F, -1.75F, -0.75F, 23F, -1.75F, -0.75F, 23F, -1F, 0F, -23F, -1F, 0F); // Box 1

		gun_4_Model[0][7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-35F, 1F, 0F, 35F, 1F, 0F, 35F, 0.75F, -0.25F, -35F, 0.75F, -0.25F, -35F, -1.75F, -0.75F, 35F, -1.75F, -0.75F, 35F, -1F, 0F, -35F, -1F, 0F); // Box 2

		gun_4_Model[0][8].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-26F, 1F, 0F, 26F, 1F, 0F, 26F, 0.75F, -0.25F, -26F, 0.75F, -0.25F, -26F, -1.75F, -0.75F, 26F, -1.75F, -0.75F, 26F, -1F, 0F, -26F, -1F, 0F); // Box 3

		gun_4_Model[0][9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-29F, 1F, 0F, 29F, 1F, 0F, 29F, 0.75F, -0.25F, -29F, 0.75F, -0.25F, -29F, -1.75F, -0.75F, 29F, -1.75F, -0.75F, 29F, -1F, 0F, -29F, -1F, 0F); // Box 4

		gun_4_Model[0][10].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-32F, 1F, 0F, 32F, 1F, 0F, 32F, 0.75F, -0.25F, -32F, 0.75F, -0.25F, -32F, -1.75F, -0.75F, 32F, -1.75F, -0.75F, 32F, -1F, 0F, -32F, -1F, 0F); // Box 5

		gun_4_Model[0][11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-32F, 0.75F, 0.75F, 32F, 0.75F, 0.75F, 32F, 1F, -1F, -32F, 1F, -1F, -32F, -1F, 1F, 32F, -1F, 1F, 32F, -1.75F, -1.75F, -32F, -1.75F, -1.75F); // Box 12

		gun_4_Model[0][12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-29F, 0.75F, 0.75F, 29F, 0.75F, 0.75F, 29F, 1F, -1F, -29F, 1F, -1F, -29F, -1F, 1F, 29F, -1F, 1F, 29F, -1.75F, -1.75F, -29F, -1.75F, -1.75F); // Box 13

		gun_4_Model[0][13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-26F, 0.75F, 0.75F, 26F, 0.75F, 0.75F, 26F, 1F, -1F, -26F, 1F, -1F, -26F, -1F, 1F, 26F, -1F, 1F, 26F, -1.75F, -1.75F, -26F, -1.75F, -1.75F); // Box 14

		gun_4_Model[0][14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-35F, 0.75F, 0.75F, 35F, 0.75F, 0.75F, 35F, 1F, -1F, -35F, 1F, -1F, -35F, -1F, 1F, 35F, -1F, 1F, 35F, -1.75F, -1.75F, -35F, -1.75F, -1.75F); // Box 15

		gun_4_Model[0][15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-23F, 0.75F, 0.75F, 23F, 0.75F, 0.75F, 23F, 1F, -1F, -23F, 1F, -1F, -23F, -1F, 1F, 23F, -1F, 1F, 23F, -1.75F, -1.75F, -23F, -1.75F, -1.75F); // Box 16

		gun_4_Model[0][16].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-20F, 0.75F, 0.75F, 20F, 0.75F, 0.75F, 20F, 1F, -1F, -20F, 1F, -1F, -20F, -1F, 1F, 20F, -1F, 1F, 20F, -1.75F, -1.75F, -20F, -1.75F, -1.75F); // Box 17

		gun_4_Model[0][17].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-32F, 0F, 1F, 32F, 0F, 1F, 32F, -0.75F, -1.75F, -32F, -0.75F, -1.75F, -32F, -0.25F, 0.75F, 32F, -0.25F, 0.75F, 32F, 0F, -1F, -32F, 0F, -1F); // Box 18

		gun_4_Model[0][18].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-29F, 0F, 1F, 29F, 0F, 1F, 29F, -0.75F, -1.75F, -29F, -0.75F, -1.75F, -29F, -0.25F, 0.75F, 29F, -0.25F, 0.75F, 29F, 0F, -1F, -29F, 0F, -1F); // Box 19

		gun_4_Model[0][19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-26F, 0F, 1F, 26F, 0F, 1F, 26F, -0.75F, -1.75F, -26F, -0.75F, -1.75F, -26F, -0.25F, 0.75F, 26F, -0.25F, 0.75F, 26F, 0F, -1F, -26F, 0F, -1F); // Box 20

		gun_4_Model[0][20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-35F, 0F, 1F, 35F, 0F, 1F, 35F, -0.75F, -1.75F, -35F, -0.75F, -1.75F, -35F, -0.25F, 0.75F, 35F, -0.25F, 0.75F, 35F, 0F, -1F, -35F, 0F, -1F); // Box 21

		gun_4_Model[0][21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-23F, 0F, 1F, 23F, 0F, 1F, 23F, -0.75F, -1.75F, -23F, -0.75F, -1.75F, -23F, -0.25F, 0.75F, 23F, -0.25F, 0.75F, 23F, 0F, -1F, -23F, 0F, -1F); // Box 22

		gun_4_Model[0][22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-20F, 0F, 1F, 20F, 0F, 1F, 20F, -0.75F, -1.75F, -20F, -0.75F, -1.75F, -20F, -0.25F, 0.75F, 20F, -0.25F, 0.75F, 20F, 0F, -1F, -20F, 0F, -1F); // Box 23

		gun_4_Model[0][23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-20F, -0.75F, -0.75F, 20F, -0.75F, -0.75F, 20F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, 0F, 20F, 0F, 0F, 20F, -0.25F, -0.25F, -20F, -0.25F, -0.25F); // Box 24

		gun_4_Model[0][24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-23F, -0.75F, -0.75F, 23F, -0.75F, -0.75F, 23F, 0F, 0F, -23F, 0F, 0F, -23F, 0F, 0F, 23F, 0F, 0F, 23F, -0.25F, -0.25F, -23F, -0.25F, -0.25F); // Box 25

		gun_4_Model[0][25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-35F, -0.75F, -0.75F, 35F, -0.75F, -0.75F, 35F, 0F, 0F, -35F, 0F, 0F, -35F, 0F, 0F, 35F, 0F, 0F, 35F, -0.25F, -0.25F, -35F, -0.25F, -0.25F); // Box 26

		gun_4_Model[0][26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-26F, -0.75F, -0.75F, 26F, -0.75F, -0.75F, 26F, 0F, 0F, -26F, 0F, 0F, -26F, 0F, 0F, 26F, 0F, 0F, 26F, -0.25F, -0.25F, -26F, -0.25F, -0.25F); // Box 27

		gun_4_Model[0][27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-29F, -0.75F, -0.75F, 29F, -0.75F, -0.75F, 29F, 0F, 0F, -29F, 0F, 0F, -29F, 0F, 0F, 29F, 0F, 0F, 29F, -0.25F, -0.25F, -29F, -0.25F, -0.25F); // Box 28

		gun_4_Model[0][28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-32F, -0.75F, -0.75F, 32F, -0.75F, -0.75F, 32F, 0F, 0F, -32F, 0F, 0F, -32F, 0F, 0F, 32F, 0F, 0F, 32F, -0.25F, -0.25F, -32F, -0.25F, -0.25F); // Box 29

		gun_4_Model[0][29].addShapeBox(0F, 0F, 0F, 24, 1, 1, 0F,-18F, 0F, 0.375F, 23.125F, 0F, 0.375F, 23.125F, 0F, -1F, -18F, 0F, -1F, -18F, -0.75F, 0.25F, 23.125F, -0.75F, 0.25F, 23.125F, -0.625F, -1F, -18F, -0.625F, -1F); // Box 2

		gun_4_Model[0][30].addShapeBox(0F, 0F, 0F, 24, 1, 1, 0F,-18F, 0.25F, 0.25F, 23.125F, 0.25F, 0.25F, 23.125F, 0.375F, -1F, -18F, 0.375F, -1F, -18F, -1F, 0.375F, 23.125F, -1F, 0.375F, 23.125F, -1F, -1F, -18F, -1F, -1F); // Box 3

		gun_4_Model[0][31].addShapeBox(0F, 0F, 0F, 24, 1, 1, 0F,-18F, 0.375F, 0F, 23.125F, 0.375F, 0F, 23.125F, 0.25F, -0.75F, -18F, 0.25F, -0.75F, -18F, -1F, 0F, 23.125F, -1F, 0F, 23.125F, -1F, -0.625F, -18F, -1F, -0.625F); // Box 4

		gun_4_Model[0][32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-36F, 1F, 0F, 36F, 1F, 0F, 36F, 0.75F, -0.25F, -36F, 0.75F, -0.25F, -36F, -1F, 0F, 36F, -1F, 0F, 36F, -1F, 0F, -36F, -1F, 0F); // Box 0

		gun_4_Model[0][33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-36F, 0.75F, 0.75F, 36F, 0.75F, 0.75F, 36F, 1F, -1F, -36F, 1F, -1F, -36F, -1F, 1F, 36F, -1F, 1F, 36F, -1F, -1F, -36F, -1F, -1F); // Box 1

		gun_4_Model[0][34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-36F, 0F, 1F, 36F, 0F, 1F, 36F, 0F, -1F, -36F, 0F, -1F, -36F, -0.25F, 0.75F, 36F, -0.25F, 0.75F, 36F, 0F, -1F, -36F, 0F, -1F); // Box 2

		gun_4_Model[0][35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-36F, 0F, 0F, 36F, 0F, 0F, 36F, 0F, 0F, -36F, 0F, 0F, -36F, 0F, 0F, 36F, 0F, 0F, 36F, -0.25F, -0.25F, -36F, -0.25F, -0.25F); // Box 3

		gun_4_Model[0][36].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-43F, 0F, 0F, 44.25F, 0F, 0F, 44.25F, 0F, -0.375F, -43F, 0F, -0.5F, -43F, -0.5F, 0F, 44.25F, -0.375F, 0F, 44.25F, -0.5F, -0.5F, -43F, -0.625F, -0.625F); // Box 6

		gun_4_Model[0][37].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-46.75F, 0F, 0F, 46F, 0F, 0F, 46F, 0F, -0.375F, -46.75F, 0F, -0.375F, -46.75F, -0.375F, 0F, 46F, -0.375F, 0F, 46F, -0.5F, -0.5F, -46.75F, -0.5F, -0.5F); // Box 8

		gun_4_Model[0][38].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-46.5F, -0.25F, 0F, 45.75F, 0F, 0F, 45.75F, 0F, -0.375F, -46.5F, -0.25F, -0.45F, -46.5F, -0.375F, 0F, 45.75F, -0.375F, 0F, 45.75F, -0.5F, -0.5F, -46.5F, -0.5F, -0.5F); // Box 9

		gun_4_Model[0][39].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-46.25F, 0F, 0F, 45.5F, -0.25F, 0F, 45.5F, -0.25F, -0.45F, -46.25F, 0F, -0.375F, -46.25F, -0.375F, 0F, 45.5F, -0.375F, 0F, 45.5F, -0.5F, -0.5F, -46.25F, -0.5F, -0.5F); // Box 10

		gun_4_Model[0][40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-46F, -0.25F, 0F, 45.25F, 0F, 0F, 45.25F, 0F, -0.375F, -46F, -0.25F, -0.45F, -46F, -0.375F, 0F, 45.25F, -0.375F, 0F, 45.25F, -0.5F, -0.5F, -46F, -0.5F, -0.5F); // Box 11

		gun_4_Model[0][41].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-45.75F, 0F, 0F, 45F, -0.25F, 0F, 45F, -0.25F, -0.45F, -45.75F, 0F, -0.375F, -45.75F, -0.375F, 0F, 45F, -0.375F, 0F, 45F, -0.5F, -0.5F, -45.75F, -0.5F, -0.5F); // Box 12

		gun_4_Model[0][42].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-45.25F, 0F, 0F, 44.5F, -0.25F, 0F, 44.5F, -0.25F, -0.45F, -45.25F, 0F, -0.375F, -45.25F, -0.375F, 0F, 44.5F, -0.375F, 0F, 44.5F, -0.5F, -0.5F, -45.25F, -0.5F, -0.5F); // Box 13

		gun_4_Model[0][43].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-45.5F, -0.25F, 0F, 44.75F, 0F, 0F, 44.75F, 0F, -0.375F, -45.5F, -0.25F, -0.45F, -45.5F, -0.375F, 0F, 44.75F, -0.375F, 0F, 44.75F, -0.5F, -0.5F, -45.5F, -0.5F, -0.5F); // Box 14

		gun_4_Model[0][44].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-43F, 0.5F, 0F, 44.25F, 0.625F, 0F, 44.25F, 0.5F, -0.5F, -43F, 0.375F, -0.625F, -43F, -1F, 0F, 44.25F, -1F, 0F, 44.25F, -1F, -0.375F, -43F, -1F, -0.5F); // Box 15

		gun_4_Model[0][45].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-46.75F, 0.625F, 0F, 46F, 0.625F, 0F, 46F, 0.5F, -0.5F, -46.75F, 0.5F, -0.5F, -46.75F, -1F, 0F, 46F, -1F, 0F, 46F, -1F, -0.375F, -46.75F, -1F, -0.375F); // Box 15

		gun_4_Model[0][46].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-46.5F, 0.625F, 0F, 45.75F, 0.625F, 0F, 45.75F, 0.5F, -0.5F, -46.5F, 0.5F, -0.5F, -46.5F, -1.25F, 0F, 45.75F, -1F, 0F, 45.75F, -1F, -0.375F, -46.5F, -1.25F, -0.45F); // Box 15

		gun_4_Model[0][47].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-46.25F, 0.625F, 0F, 45.5F, 0.625F, 0F, 45.5F, 0.5F, -0.5F, -46.25F, 0.5F, -0.5F, -46.25F, -1F, 0F, 45.5F, -1.25F, 0F, 45.5F, -1.25F, -0.45F, -46.25F, -1F, -0.375F); // Box 15

		gun_4_Model[0][48].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-46F, 0.625F, 0F, 45.25F, 0.625F, 0F, 45.25F, 0.5F, -0.5F, -46F, 0.5F, -0.5F, -46F, -1.25F, 0F, 45.25F, -1F, 0F, 45.25F, -1F, -0.375F, -46F, -1.25F, -0.45F); // Box 15

		gun_4_Model[0][49].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-45.75F, 0.625F, 0F, 45F, 0.625F, 0F, 45F, 0.5F, -0.5F, -45.75F, 0.5F, -0.5F, -45.75F, -1F, 0F, 45F, -1.25F, 0F, 45F, -1.25F, -0.45F, -45.75F, -1F, -0.375F); // Box 15

		gun_4_Model[0][50].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-45.25F, 0.625F, 0F, 44.5F, 0.625F, 0F, 44.5F, 0.5F, -0.5F, -45.25F, 0.5F, -0.5F, -45.25F, -1F, 0F, 44.5F, -1.25F, 0F, 44.5F, -1.25F, -0.45F, -45.25F, -1F, -0.375F); // Box 15

		gun_4_Model[0][51].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-45.5F, 0.625F, 0F, 44.75F, 0.625F, 0F, 44.75F, 0.5F, -0.5F, -45.5F, 0.5F, -0.5F, -45.5F, -1.25F, 0F, 44.75F, -1F, 0F, 44.75F, -1F, -0.375F, -45.5F, -1.25F, -0.45F); // Box 15

		gun_4_Model[0][52].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-43F, 0F, 0.5F, 44.25F, 0F, 0.625F, 44.25F, 0F, -1F, -43F, 0F, -1F, -43F, -0.625F, 0.375F, 44.25F, -0.5F, 0.5F, 44.25F, -0.375F, -1F, -43F, -0.5F, -1F); // Box 23

		gun_4_Model[0][53].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-46.75F, 0F, 0.625F, 46F, 0F, 0.625F, 46F, 0F, -1F, -46.75F, 0F, -1F, -46.75F, -0.5F, 0.5F, 46F, -0.5F, 0.5F, 46F, -0.375F, -1F, -46.75F, -0.375F, -1F); // Box 24

		gun_4_Model[0][54].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-46.5F, -0.25F, 0.55F, 45.75F, 0F, 0.625F, 45.75F, 0F, -1F, -46.5F, -0.25F, -1F, -46.5F, -0.5F, 0.5F, 45.75F, -0.5F, 0.5F, 45.75F, -0.375F, -1F, -46.5F, -0.375F, -1F); // Box 25

		gun_4_Model[0][55].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-46.25F, 0F, 0.625F, 45.5F, -0.25F, 0.55F, 45.5F, -0.25F, -1F, -46.25F, 0F, -1F, -46.25F, -0.5F, 0.5F, 45.5F, -0.5F, 0.5F, 45.5F, -0.375F, -1F, -46.25F, -0.375F, -1F); // Box 26

		gun_4_Model[0][56].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-46F, -0.25F, 0.55F, 45.25F, 0F, 0.625F, 45.25F, 0F, -1F, -46F, -0.25F, -1F, -46F, -0.5F, 0.5F, 45.25F, -0.5F, 0.5F, 45.25F, -0.375F, -1F, -46F, -0.375F, -1F); // Box 27

		gun_4_Model[0][57].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-45.75F, 0F, 0.625F, 45F, -0.25F, 0.55F, 45F, -0.25F, -1F, -45.75F, 0F, -1F, -45.75F, -0.5F, 0.5F, 45F, -0.5F, 0.5F, 45F, -0.375F, -1F, -45.75F, -0.375F, -1F); // Box 28

		gun_4_Model[0][58].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-45.25F, 0F, 0.625F, 44.5F, -0.25F, 0.55F, 44.5F, -0.25F, -1F, -45.25F, 0F, -1F, -45.25F, -0.5F, 0.5F, 44.5F, -0.5F, 0.5F, 44.5F, -0.375F, -1F, -45.25F, -0.375F, -1F); // Box 29

		gun_4_Model[0][59].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-45.5F, -0.25F, 0.55F, 44.75F, 0F, 0.625F, 44.75F, 0F, -1F, -45.5F, -0.25F, -1F, -45.5F, -0.5F, 0.5F, 44.75F, -0.5F, 0.5F, 44.75F, -0.375F, -1F, -45.5F, -0.375F, -1F); // Box 30

		gun_4_Model[0][60].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-43F, 0.375F, 0.375F, 44.25F, 0.5F, 0.5F, 44.25F, 0.625F, -1F, -43F, 0.5F, -1F, -43F, -1F, 0.5F, 44.25F, -1F, 0.625F, 44.25F, -1F, -1F, -43F, -1F, -1F); // Box 31

		gun_4_Model[0][61].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-46.75F, 0.5F, 0.5F, 46F, 0.5F, 0.5F, 46F, 0.625F, -1F, -46.75F, 0.625F, -1F, -46.75F, -1F, 0.625F, 46F, -1F, 0.625F, 46F, -1F, -1F, -46.75F, -1F, -1F); // Box 32

		gun_4_Model[0][62].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-46.5F, 0.5F, 0.5F, 45.75F, 0.5F, 0.5F, 45.75F, 0.625F, -1F, -46.5F, 0.625F, -1F, -46.5F, -1.25F, 0.55F, 45.75F, -1F, 0.625F, 45.75F, -1F, -1F, -46.5F, -1.25F, -1F); // Box 33

		gun_4_Model[0][63].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-46.25F, 0.5F, 0.5F, 45.5F, 0.5F, 0.5F, 45.5F, 0.625F, -1F, -46.25F, 0.625F, -1F, -46.25F, -1F, 0.625F, 45.5F, -1.25F, 0.55F, 45.5F, -1.25F, -1F, -46.25F, -1F, -1F); // Box 34

		gun_4_Model[0][64].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-46F, 0.5F, 0.5F, 45.25F, 0.5F, 0.5F, 45.25F, 0.625F, -1F, -46F, 0.625F, -1F, -46F, -1.25F, 0.55F, 45.25F, -1F, 0.625F, 45.25F, -1F, -1F, -46F, -1.25F, -1F); // Box 35

		gun_4_Model[0][65].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-45.75F, 0.5F, 0.5F, 45F, 0.5F, 0.5F, 45F, 0.625F, -1F, -45.75F, 0.625F, -1F, -45.75F, -1F, 0.625F, 45F, -1.25F, 0.55F, 45F, -1.25F, -1F, -45.75F, -1F, -1F); // Box 36

		gun_4_Model[0][66].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-45.25F, 0.5F, 0.5F, 44.5F, 0.5F, 0.5F, 44.5F, 0.625F, -1F, -45.25F, 0.625F, -1F, -45.25F, -1F, 0.625F, 44.5F, -1.25F, 0.55F, 44.5F, -1.25F, -1F, -45.25F, -1F, -1F); // Box 37

		gun_4_Model[0][67].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-45.5F, 0.5F, 0.5F, 44.75F, 0.5F, 0.5F, 44.75F, 0.625F, -1F, -45.5F, 0.625F, -1F, -45.5F, -1.25F, 0.55F, 44.75F, -1F, 0.625F, 44.75F, -1F, -1F, -45.5F, -1.25F, -1F); // Box 38

		gun_4_Model[0][68].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-36.25F, 1.5F, 0F, 35.75F, 1.5F, 0F, 35.75F, 1.5F, -0.875F, -36.25F, 1.5F, -0.875F, -36.25F, -1F, 0F, 35.75F, -1F, 0F, 35.75F, -1F, -0.875F, -36.25F, -1F, -0.875F); // Box 39

		gun_4_Model[0][69].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-36.25F, 1.5F, 0.125F, 35.75F, 1.5F, 0.125F, 35.75F, 1.5F, -1F, -36.25F, 1.5F, -1F, -36.25F, -1F, 0.125F, 35.75F, -1F, 0.125F, 35.75F, -1F, -1F, -36.25F, -1F, -1F); // Box 40

		gun_4_Model[0][70].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-36.25F, 1.5F, 0F, 35.75F, 1.5F, 0F, 35.75F, 1.625F, -0.75F, -36.25F, 1.625F, -0.75F, -36.25F, -2.375F, 0F, 35.75F, -2.375F, 0F, 35.75F, -2.5F, -0.75F, -36.25F, -2.5F, -0.75F); // Box 41

		gun_4_Model[0][71].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-36.25F, 1.625F, 0.25F, 35.75F, 1.625F, 0.25F, 35.75F, 1.5F, -1F, -36.25F, 1.5F, -1F, -36.25F, -2.5F, 0.25F, 35.75F, -2.5F, 0.25F, 35.75F, -2.375F, -1F, -36.25F, -2.375F, -1F); // Box 42

		gun_4_Model[0][72].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-36.25F, 2F, -0.25F, 35.75F, 2F, -0.25F, 35.75F, 1.875F, -0.625F, -36.25F, 1.875F, -0.625F, -36.25F, -2.5F, -0.25F, 35.75F, -2.5F, -0.25F, 35.75F, -2.625F, -0.625F, -36.25F, -2.625F, -0.625F); // Box 43

		gun_4_Model[0][73].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-36.25F, 1.875F, 0.375F, 35.75F, 1.875F, 0.375F, 35.75F, 2F, -1.25F, -36.25F, 2F, -1.25F, -36.25F, -2.625F, 0.375F, 35.75F, -2.625F, 0.375F, 35.75F, -2.5F, -1.25F, -36.25F, -2.5F, -1.25F); // Box 44

		gun_4_Model[0][74].addShapeBox(0F, 0F, 0F, 14, 2, 2, 0F,0F, 1F, 1.5F, -4.75F, 1.75F, 1.5F, -4.75F, 1.75F, -0.5F, 0F, 1F, -0.5F, 0F, 0.25F, 1.5F, -4.75F, 0.25F, 1.5F, -4.75F, 0.25F, -0.5F, 0F, 0.25F, -0.5F); // Box 45

		gun_4_Model[0][75].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,-14F, 0F, 0F, 11F, 0F, 0F, 11F, 0F, 0F, -14F, 0F, 0.5F, -14F, 0.5F, 0F, 11F, 0F, 0F, 11F, -0.25F, -0.25F, -14F, 0.125F, 0.125F); // Box 46

		gun_4_Model[0][76].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,-14F, 1.5F, 0F, 11F, 1F, 0F, 11F, 0.75F, -0.25F, -14F, 1.125F, 0.125F, -14F, -1F, 0F, 11F, -1F, 0F, 11F, -1F, 0F, -14F, -1F, 0.5F); // Box 47

		gun_4_Model[0][77].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,-14F, 1.125F, 1.125F, 11F, 0.75F, 0.75F, 11F, 1F, -1F, -14F, 1.5F, -1F, -14F, -1F, 1.5F, 11F, -1F, 1F, 11F, -1F, -1F, -14F, -1F, -1F); // Box 48

		gun_4_Model[0][78].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,-14F, 0F, 1.5F, 11F, 0F, 1F, 11F, 0F, -1F, -14F, 0F, -1F, -14F, 0.125F, 1.125F, 11F, -0.25F, 0.75F, 11F, 0F, -1F, -14F, 0.5F, -1F); // Box 49

		gun_4_Model[0][79].addShapeBox(0F, 0F, 0F, 14, 2, 2, 0F,-13.5F, 2.25F, -0.875F, 0F, 1.5F, -0.875F, 0F, 1.5F, -0.5F, -13.5F, 2.25F, -0.5F, -13.5F, 0.25F, -0.875F, 0F, -0.25F, -0.875F, 0F, -0.25F, -0.5F, -13.5F, 0.25F, -0.5F); // Box 0

		gun_4_Model[0][80].addShapeBox(0F, 0F, 0F, 14, 2, 2, 0F,-9.25F, 2.25F, 1.5F, -0.5F, 2.25F, 1.5F, -0.5F, 2.25F, -2.875F, -9.25F, 2.25F, -2.875F, -9.25F, 0.25F, 1.5F, -0.5F, 0.25F, 1.5F, -0.5F, 0.25F, -2.625F, -9.25F, 0.25F, -2.625F); // Box 1

		gun_4_Model[0][81].addShapeBox(0F, 0F, 0F, 14, 2, 2, 0F,0F, 1.25F, -0.875F, -4.75F, 2.25F, -0.875F, -4.75F, 2.25F, -0.5F, 0F, 1.25F, -0.5F, 0F, 0.25F, -0.875F, -4.75F, 0.25F, -0.875F, -4.75F, 0.25F, -0.5F, 0F, 0.25F, -0.5F); // Box 3

		gun_4_Model[0][82].addShapeBox(0F, 0F, 0F, 14, 2, 2, 0F,0F, 1.25F, 1.5F, -4.75F, 2.25F, 1.5F, -4.75F, 2.25F, -2.875F, 0F, 1.25F, -2.875F, 0F, 0.25F, 1.5F, -4.75F, 0.25F, 1.5F, -4.75F, 0.25F, -2.875F, 0F, 0.25F, -2.875F); // Box 4

		gun_4_Model[0][83].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,-13.5F, 2.25F, 0.25F, 10.25F, 1.375F, 0.25F, 10.25F, 1.375F, -0.75F, -13.5F, 2.25F, -0.75F, -13.5F, -1F, 0.25F, 11F, -1.875F, 0.25F, 11F, -1.875F, -0.75F, -13.5F, -1F, -0.75F); // Box 0

		gun_4_Model[0][84].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,-2.7F, -1.25F, 2.05F, -2.7F, -1.25F, 2.05F, -2.7F, -1.25F, -3.5F, -2.7F, -1.25F, -3.5F, -2.7F, 1F, 2.05F, -2.7F, 1F, 2.05F, -2.7F, 1F, -3.5F, -2.7F, 1F, -3.5F); // Box 5

		gun_4_Model[0][85].addShapeBox(0F, 0F, 0F, 13, 2, 2, 0F,-8F, 2.75F, -1.5F, 0F, 2.25F, -2F, 0F, 2.25F, 2F, -8F, 2.75F, 2.5F, -8F, -2.75F, -1.5F, 0F, -3.25F, -2F, 0F, -3.25F, 2F, -8F, -2.75F, 2.5F); // Box 0

		gun_4_Model[0][86].addShapeBox(0F, 0F, 0F, 13, 2, 2, 0F,-8F, 3.25F, -2F, 0F, 2.75F, -2.5F, 0F, 2.75F, 1.5F, -8F, 3.25F, 2F, -8F, -4.75F, -1.5F, 0F, -4.25F, -2F, 0F, -4.25F, 2F, -8F, -4.75F, 2.5F); // Box 1

		gun_4_Model[0][87].addShapeBox(0F, 0F, 0F, 13, 2, 2, 0F,-8F, 0.75F, -1.5F, 0F, 1.25F, -2F, 0F, 1.25F, 2F, -8F, 0.75F, 2.5F, -8F, -2.25F, -2F, 0F, -2.75F, -2.5F, 0F, -2.75F, 1.5F, -8F, -2.25F, 2F); // Box 2

		gun_4_Model[0][88].addShapeBox(0F, 0F, 0F, 13, 2, 2, 0F,-8F, 0.875F, -1.5F, 0F, 1.375F, -1.5F, 0F, 1.375F, 2F, -8F, 0.875F, 2.5F, -8F, -2.25F, -1.5F, 0F, -2.75F, -1.5F, 0F, -2.75F, 1.5F, -8F, -2.25F, 2F); // Box 3

		gun_4_Model[0][89].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 1.25F, -0.875F, -4.75F, -0.125F, -0.875F, -4.75F, -0.125F, -0.5F, 0F, 1.25F, -0.5F, 0F, 0.25F, -0.875F, -4.75F, -0.875F, -0.875F, -4.75F, -0.875F, -0.5F, 0F, 0.25F, -0.5F); // Box 5

		gun_4_Model[0][90].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 1.25F, 1.5F, -4.75F, -0.125F, 1.5F, -4.75F, -0.125F, -2.875F, 0F, 1.25F, -2.875F, 0F, 0.25F, 1.5F, -4.75F, -0.875F, 1.5F, -4.75F, -0.875F, -2.875F, 0F, 0.25F, -2.875F); // Box 6

		gun_4_Model[0][91].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.375F, -0.125F, 3.75F, -0.625F, -0.125F, 3.75F, -0.625F, -0.125F, 2.75F, 0.375F, -0.125F, 2.75F, 0.125F, -0.625F, 3.75F, -0.875F, -0.625F, 3.75F, -0.875F, -0.625F, 2.75F, 0.125F, -0.625F, 2.75F); // Box 9

		gun_4_Model[0][92].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.375F, 0.125F, 3.75F, -0.625F, 0.125F, 3.75F, -0.625F, 0.125F, 2.75F, 0.375F, 0.125F, 2.75F, 0.375F, -0.875F, 3.75F, -0.625F, -0.875F, 3.75F, -0.625F, -0.875F, 2.75F, 0.375F, -0.875F, 2.75F); // Box 10

		gun_4_Model[0][93].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.125F, 0.375F, 3.75F, -0.875F, 0.375F, 3.75F, -0.875F, 0.375F, 2.75F, 0.125F, 0.375F, 2.75F, 0.375F, -1.125F, 3.75F, -0.625F, -1.125F, 3.75F, -0.625F, -1.125F, 2.75F, 0.375F, -1.125F, 2.75F); // Box 11

		gun_4_Model[0][94].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 1F, 1.5F, -4.75F, -0.125F, 1.5F, -4.75F, -0.125F, -0.5F, 0F, 1F, -0.5F, 0F, 0.25F, 1.5F, -4.75F, -0.875F, 1.5F, -4.75F, -0.875F, -0.5F, 0F, 0.25F, -0.5F); // Box 12

		gun_4_Model[0][95].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,-3.575F, 2.65F, 1.85F, -2.025F, 2.5F, 1.85F, -2.025F, 2.5F, -3.65F, -3.575F, 2.65F, -3.65F, -2.775F, 0.25F, 1.85F, -2.775F, 0.5F, 1.85F, -2.775F, 0.5F, -3.65F, -2.775F, 0.25F, -3.65F); // Box 13

		gun_4_Model[0][96].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,-3.675F, 2.6F, 1.975F, -2.125F, 2.52F, 1.975F, -2.025F, 2.5F, -3.85F, -3.575F, 2.65F, -3.85F, -2.875F, 0.25F, 1.975F, -2.875F, 0.5F, 1.975F, -2.775F, 0.5F, -3.85F, -2.775F, 0.25F, -3.85F); // Box 14

		gun_4_Model[0][97].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,-3.575F, 2.65F, 1.65F, -2.025F, 2.5F, 1.65F, -2.125F, 2.52F, -3.525F, -3.675F, 2.6F, -3.525F, -2.775F, 0.25F, 1.65F, -2.775F, 0.5F, 1.65F, -2.875F, 0.5F, -3.525F, -2.875F, 0.25F, -3.525F); // Box 15

		gun_4_Model[0][98].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,1.25F, 0.5F, -1.5F, -1.75F, -0.125F, -1F, -1.75F, -0.125F, -0.5F, 1.25F, 0.5F, 0F, 1.25F, -2.25F, -1.5F, -1.75F, -1.625F, -1F, -1.75F, -1.625F, -0.5F, 1.25F, -2.25F, 0F); // Box 25

		gun_4_Model[0][99].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-4.125F, -1.75F, 1.75F, 3.375F, -1.75F, 1.75F, 3.375F, -1.75F, -0.25F, -4.125F, -1.75F, -0.25F, -4.075F, 1.25F, 1.75F, 3.325F, 1.25F, 1.75F, 3.325F, 1.25F, -0.25F, -4.075F, 1.25F, -0.25F); // Box 27

		gun_4_Model[0][100].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,1.25F, -1.5F, -1.5F, -1.75F, -0.875F, -1F, -1.75F, -0.875F, -0.5F, 1.25F, -1.5F, 0F, 1.25F, -0.25F, -1.5F, -1.75F, -0.875F, -1F, -1.75F, -0.875F, -0.5F, 1.25F, -0.25F, 0F); // Box 28

		gun_4_Model[0][101].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,1.25F, 0.5F, 2F, -1.75F, -0.125F, 1.5F, -1.75F, -0.125F, -3F, 1.25F, 0.5F, -3.5F, 1.25F, -2.25F, 2F, -1.75F, -1.625F, 1.5F, -1.75F, -1.625F, -3F, 1.25F, -2.25F, -3.5F); // Box 29

		gun_4_Model[0][102].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,1.25F, -1.5F, 2F, -1.75F, -0.875F, 1.5F, -1.75F, -0.875F, -3F, 1.25F, -1.5F, -3.5F, 1.25F, -0.25F, 2F, -1.75F, -0.875F, 1.5F, -1.75F, -0.875F, -3F, 1.25F, -0.25F, -3.5F); // Box 29

		gun_4_Model[0][103].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,2.5F, 0.375F, -2F, -3F, 0.325F, -1.95F, -3.125F, 0.325F, 0.125F, 2.375F, 0.375F, 0.125F, 2.5F, -0.375F, -2F, -3F, -0.425F, -1.95F, -3.125F, -0.425F, 0.125F, 2.375F, -0.375F, 0.125F); // Box 31

		gun_4_Model[0][104].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,2.5F, 0.625F, -1.625F, -2.25F, 0.5F, -1.5F, -2.25F, 0.5F, 0F, 2.5F, 0.625F, 0.125F, 2.5F, -2.375F, -1.625F, -2.25F, -2.25F, -1.5F, -2.25F, -2.25F, 0F, 2.5F, -2.375F, 0.125F); // Box 32

		gun_4_Model[0][105].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,2.5F, 0.625F, 2.125F, -2.25F, 0.5F, 2F, -2.25F, 0.5F, -3.5F, 2.5F, 0.625F, -3.625F, 2.5F, -2.375F, 2.125F, -2.25F, -2.25F, 2F, -2.25F, -2.25F, -3.5F, 2.5F, -2.375F, -3.625F); // Box 33

		gun_4_Model[0][106].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,2.5F, -1.625F, -1.625F, -2.25F, -1.5F, -1.5F, -2.25F, -1.5F, 0F, 2.5F, -1.625F, 0.125F, 2.5F, -0.125F, -1.625F, -2.25F, -0.25F, -1.5F, -2.25F, -0.25F, 0F, 2.5F, -0.125F, 0.125F); // Box 34

		gun_4_Model[0][107].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,2.5F, -1.625F, 2.125F, -2.25F, -1.5F, 2F, -2.25F, -1.5F, -3.5F, 2.5F, -1.625F, -3.625F, 2.5F, -0.125F, 2.125F, -2.25F, -0.25F, 2F, -2.25F, -0.25F, -3.5F, 2.5F, -0.125F, -3.625F); // Box 35

		gun_4_Model[0][108].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,2.5F, 0.375F, -1.75F, -3F, 0.325F, -1.7F, -3F, 0.325F, 0F, 2.5F, 0.375F, 0F, 2.5F, -0.375F, -1.75F, -3F, -0.425F, -1.7F, -3F, -0.425F, 0F, 2.5F, -0.375F, 0F); // Box 36

		gun_4_Model[0][109].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,2.375F, 0.375F, -1.625F, -3.125F, 0.325F, -1.575F, -3F, 0.325F, -0.25F, 2.5F, 0.375F, -0.25F, 2.375F, -0.375F, -1.625F, -3.125F, -0.425F, -1.575F, -3F, -0.425F, -0.25F, 2.5F, -0.375F, -0.25F); // Box 37

		gun_4_Model[0][110].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,2.375F, 0.375F, 2.125F, -3.125F, 0.325F, 2.125F, -3F, 0.325F, -3.95F, 2.5F, 0.375F, -4F, 2.375F, -0.375F, 2.125F, -3.125F, -0.425F, 2.125F, -3F, -0.425F, -3.95F, 2.5F, -0.375F, -4F); // Box 38

		gun_4_Model[0][111].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,2.5F, 0.375F, 2F, -3F, 0.325F, 2F, -3F, 0.325F, -3.7F, 2.5F, 0.375F, -3.75F, 2.5F, -0.375F, 2F, -3F, -0.425F, 2F, -3F, -0.425F, -3.7F, 2.5F, -0.375F, -3.75F); // Box 38

		gun_4_Model[0][112].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,2.5F, 0.375F, 1.75F, -3F, 0.325F, 1.75F, -3.125F, 0.325F, -3.575F, 2.375F, 0.375F, -3.625F, 2.5F, -0.375F, 1.75F, -3F, -0.425F, 1.75F, -3.125F, -0.425F, -3.575F, 2.375F, -0.375F, -3.625F); // Box 38

		gun_4_Model[0][113].addShapeBox(0F, 0F, 0F, 14, 2, 2, 0F,-9.25F, 1.75F, 1.5F, -0.5F, 1.75F, 1.5F, -0.5F, 1.75F, -0.5F, -9.25F, 1.75F, -0.5F, -9.25F, 0.25F, 1.5F, -0.5F, 0.25F, 1.5F, -0.5F, 0.25F, -0.5F, -9.25F, 0.25F, -0.5F); // Box 0

		gun_4_Model[0][114].addShapeBox(0F, 0F, 0F, 14, 2, 2, 0F,-9.25F, 2.25F, -0.875F, -0.5F, 2.25F, -0.875F, -0.5F, 2.25F, -0.5F, -9.25F, 2.25F, -0.5F, -9.25F, 0.25F, -0.875F, -0.5F, 0.25F, -0.875F, -0.5F, 0.25F, -0.5F, -9.25F, 0.25F, -0.5F); // Box 1

		gun_4_Model[0][115].addShapeBox(0F, 0F, 0F, 14, 2, 2, 0F,-13.5F, 1.75F, 1.5F, 0F, 1.5F, 1.5F, 0F, 1.5F, -0.5F, -13.5F, 1.75F, -0.5F, -13.5F, 0.25F, 1.5F, 0F, -0.25F, 1.5F, 0F, -0.25F, -0.5F, -13.5F, 0.25F, -0.5F); // Box 2

		gun_4_Model[0][116].addShapeBox(0F, 0F, 0F, 14, 2, 2, 0F,-13.5F, 2.25F, 1.5F, 0F, 1.5F, 1.5F, 0F, 1.5F, -2.875F, -13.5F, 2.25F, -2.875F, -13.5F, 0.25F, 1.5F, 0F, -0.25F, 1.5F, 0F, -0.25F, -2.875F, -13.5F, 0.25F, -2.875F); // Box 3

		gun_4_Model[0][117].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,-12.25F, 2.125F, 0.25F, 6.5F, 2.25F, 0.25F, 6.5F, 2.25F, -0.75F, -12.25F, 2.125F, -0.75F, -10F, -1.875F, 0.25F, 6.5F, -1F, 0.25F, 6.5F, -1F, -0.75F, -10F, -1.875F, -0.75F); // Box 4

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_4_Model[0])
		{
			gunPart.setRotationPoint(74F, -92F, 0F);
		}


		gun_4_Model[1] = new ModelRendererTurbo[0];

		gun_4_Model[2] = new ModelRendererTurbo[12];
		gun_4_Model[2][0] = new ModelRendererTurbo(this, 1599, 685, textureX, textureY); // Box 8
		gun_4_Model[2][1] = new ModelRendererTurbo(this, 1615, 685, textureX, textureY); // Box 13
		gun_4_Model[2][2] = new ModelRendererTurbo(this, 1631, 685, textureX, textureY); // Box 15
		gun_4_Model[2][3] = new ModelRendererTurbo(this, 1647, 685, textureX, textureY); // Box 16
		gun_4_Model[2][4] = new ModelRendererTurbo(this, 1663, 685, textureX, textureY); // Box 17
		gun_4_Model[2][5] = new ModelRendererTurbo(this, 1679, 685, textureX, textureY); // Box 18
		gun_4_Model[2][6] = new ModelRendererTurbo(this, 1695, 685, textureX, textureY); // Box 19
		gun_4_Model[2][7] = new ModelRendererTurbo(this, 1711, 685, textureX, textureY); // Box 19
		gun_4_Model[2][8] = new ModelRendererTurbo(this, 1727, 685, textureX, textureY); // Box 19
		gun_4_Model[2][9] = new ModelRendererTurbo(this, 1743, 685, textureX, textureY); // Box 19
		gun_4_Model[2][10] = new ModelRendererTurbo(this, 1759, 685, textureX, textureY); // Box 19
		gun_4_Model[2][11] = new ModelRendererTurbo(this, 1775, 685, textureX, textureY); // Box 19

		gun_4_Model[2][0].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-2.5F, -4F, 1.75F, -1.25F, -3.5F, 1.75F, -1.25F, -3.5F, -2.5F, -2.5F, -4F, -2.5F, -2.5F, 3.25F, 1.75F, -1.25F, 2.75F, 1.75F, -1.25F, 2.75F, -2.5F, -2.5F, 3.25F, -2.5F); // Box 8

		gun_4_Model[2][1].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -4.75F, 1.75F, -2.5F, -4F, 1.75F, -2.5F, -4F, -2.5F, 0F, -4.75F, -2.5F, 0F, 4F, 1.75F, -2.5F, 3.25F, 1.75F, -2.5F, 3.25F, -2.5F, 0F, 4F, -2.5F); // Box 13

		gun_4_Model[2][2].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-4F, -2.5F, 1.75F, -0.75F, -2.5F, 1.75F, -0.75F, -2.5F, -2.5F, -4F, -2.5F, -2.5F, -3.5F, 2.75F, 1.75F, -1.25F, 2.75F, 1.75F, -1.25F, 2.75F, -2.5F, -3.5F, 2.75F, -2.5F); // Box 15

		gun_4_Model[2][3].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,2.5F, -4F, 1.75F, -5F, -4.75F, 1.75F, -5F, -4.75F, -2.5F, 2.5F, -4F, -2.5F, 2.5F, 3.25F, 1.75F, -5F, 4F, 1.75F, -5F, 4F, -2.5F, 2.5F, 3.25F, -2.5F); // Box 16

		gun_4_Model[2][4].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,3.75F, -3.5F, 1.75F, -7.5F, -4F, 1.75F, -7.5F, -4F, -2.5F, 3.75F, -3.5F, -2.5F, 3.75F, 2.75F, 1.75F, -7.5F, 3.25F, 1.75F, -7.5F, 3.25F, -2.5F, 3.75F, 2.75F, -2.5F); // Box 17

		gun_4_Model[2][5].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-4.075F, -2.25F, 1.75F, -0.675F, -2.25F, 1.75F, -0.675F, -2.25F, -2.5F, -4.125F, -2.25F, -2.5F, -4F, 1.5F, 1.75F, -0.75F, 1.5F, 1.75F, -0.75F, 1.5F, -2.5F, -4F, 1.5F, -2.5F); // Box 18

		gun_4_Model[2][6].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-2.5F, -4F, -1.5F, -1.25F, -3.5F, -1.5F, -1.25F, -3.5F, 0.75F, -2.5F, -4F, 0.75F, -2.5F, 3.25F, -1.5F, -1.25F, 2.75F, -1.5F, -1.25F, 2.75F, 0.75F, -2.5F, 3.25F, 0.75F); // Box 19

		gun_4_Model[2][7].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -4.75F, -1.5F, -2.5F, -4F, -1.5F, -2.5F, -4F, 0.75F, 0F, -4.75F, 0.75F, 0F, 4F, -1.5F, -2.5F, 3.25F, -1.5F, -2.5F, 3.25F, 0.75F, 0F, 4F, 0.75F); // Box 19

		gun_4_Model[2][8].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-4F, -2.5F, -1.5F, -0.75F, -2.5F, -1.5F, -0.75F, -2.5F, 0.75F, -4F, -2.5F, 0.75F, -3.5F, 2.75F, -1.5F, -1.25F, 2.75F, -1.5F, -1.25F, 2.75F, 0.75F, -3.5F, 2.75F, 0.75F); // Box 19

		gun_4_Model[2][9].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,2.5F, -4F, -1.5F, -5F, -4.75F, -1.5F, -5F, -4.75F, 0.75F, 2.5F, -4F, 0.75F, 2.5F, 3.25F, -1.5F, -5F, 4F, -1.5F, -5F, 4F, 0.75F, 2.5F, 3.25F, 0.75F); // Box 19

		gun_4_Model[2][10].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,3.75F, -3.5F, -1.5F, -7.5F, -4F, -1.5F, -7.5F, -4F, 0.75F, 3.75F, -3.5F, 0.75F, 3.75F, 2.75F, -1.5F, -7.5F, 3.25F, -1.5F, -7.5F, 3.25F, 0.75F, 3.75F, 2.75F, 0.75F); // Box 19

		gun_4_Model[2][11].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-4.125F, -2.25F, -1.5F, -0.675F, -2.25F, -1.5F, -0.675F, -2.25F, 0.75F, -4.075F, -2.25F, 0.75F, -4F, 1.5F, -1.5F, -0.75F, 1.5F, -1.5F, -0.75F, 1.5F, 0.75F, -4F, 1.5F, 0.75F); // Box 19

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_4_Model[2])
		{
			gunPart.setRotationPoint(74F, -92F, 0F);
		}


		registerGunModel("DorsalGun", gun_4_Model);

		// Passenger 6
		ModelRendererTurbo[][] gun_5_Model = new ModelRendererTurbo[3][];

		gun_5_Model[0] = new ModelRendererTurbo[118];
		gun_5_Model[0][0] = new ModelRendererTurbo(this, 1471, 661, textureX, textureY); // Box 4
		gun_5_Model[0][1] = new ModelRendererTurbo(this, 1527, 661, textureX, textureY); // Box 7
		gun_5_Model[0][2] = new ModelRendererTurbo(this, 1567, 661, textureX, textureY); // Box 8
		gun_5_Model[0][3] = new ModelRendererTurbo(this, 1607, 661, textureX, textureY); // Box 0
		gun_5_Model[0][4] = new ModelRendererTurbo(this, 1647, 661, textureX, textureY); // Box 1
		gun_5_Model[0][5] = new ModelRendererTurbo(this, 1687, 661, textureX, textureY); // Box 0
		gun_5_Model[0][6] = new ModelRendererTurbo(this, 1695, 661, textureX, textureY); // Box 1
		gun_5_Model[0][7] = new ModelRendererTurbo(this, 1703, 661, textureX, textureY); // Box 2
		gun_5_Model[0][8] = new ModelRendererTurbo(this, 1711, 661, textureX, textureY); // Box 3
		gun_5_Model[0][9] = new ModelRendererTurbo(this, 1719, 661, textureX, textureY); // Box 4
		gun_5_Model[0][10] = new ModelRendererTurbo(this, 1727, 661, textureX, textureY); // Box 5
		gun_5_Model[0][11] = new ModelRendererTurbo(this, 1735, 661, textureX, textureY); // Box 12
		gun_5_Model[0][12] = new ModelRendererTurbo(this, 1743, 661, textureX, textureY); // Box 13
		gun_5_Model[0][13] = new ModelRendererTurbo(this, 1751, 661, textureX, textureY); // Box 14
		gun_5_Model[0][14] = new ModelRendererTurbo(this, 1759, 661, textureX, textureY); // Box 15
		gun_5_Model[0][15] = new ModelRendererTurbo(this, 1767, 661, textureX, textureY); // Box 16
		gun_5_Model[0][16] = new ModelRendererTurbo(this, 1775, 661, textureX, textureY); // Box 17
		gun_5_Model[0][17] = new ModelRendererTurbo(this, 1783, 661, textureX, textureY); // Box 18
		gun_5_Model[0][18] = new ModelRendererTurbo(this, 1791, 661, textureX, textureY); // Box 19
		gun_5_Model[0][19] = new ModelRendererTurbo(this, 1799, 661, textureX, textureY); // Box 20
		gun_5_Model[0][20] = new ModelRendererTurbo(this, 1807, 661, textureX, textureY); // Box 21
		gun_5_Model[0][21] = new ModelRendererTurbo(this, 1815, 661, textureX, textureY); // Box 22
		gun_5_Model[0][22] = new ModelRendererTurbo(this, 1823, 661, textureX, textureY); // Box 23
		gun_5_Model[0][23] = new ModelRendererTurbo(this, 1831, 661, textureX, textureY); // Box 24
		gun_5_Model[0][24] = new ModelRendererTurbo(this, 1839, 661, textureX, textureY); // Box 25
		gun_5_Model[0][25] = new ModelRendererTurbo(this, 1847, 661, textureX, textureY); // Box 26
		gun_5_Model[0][26] = new ModelRendererTurbo(this, 1855, 661, textureX, textureY); // Box 27
		gun_5_Model[0][27] = new ModelRendererTurbo(this, 1863, 661, textureX, textureY); // Box 28
		gun_5_Model[0][28] = new ModelRendererTurbo(this, 1871, 661, textureX, textureY); // Box 29
		gun_5_Model[0][29] = new ModelRendererTurbo(this, 1879, 661, textureX, textureY); // Box 2
		gun_5_Model[0][30] = new ModelRendererTurbo(this, 1471, 669, textureX, textureY); // Box 3
		gun_5_Model[0][31] = new ModelRendererTurbo(this, 1527, 669, textureX, textureY); // Box 4
		gun_5_Model[0][32] = new ModelRendererTurbo(this, 1935, 661, textureX, textureY); // Box 0
		gun_5_Model[0][33] = new ModelRendererTurbo(this, 1943, 661, textureX, textureY); // Box 1
		gun_5_Model[0][34] = new ModelRendererTurbo(this, 1951, 661, textureX, textureY); // Box 2
		gun_5_Model[0][35] = new ModelRendererTurbo(this, 1959, 661, textureX, textureY); // Box 3
		gun_5_Model[0][36] = new ModelRendererTurbo(this, 1967, 661, textureX, textureY); // Box 6
		gun_5_Model[0][37] = new ModelRendererTurbo(this, 1975, 661, textureX, textureY); // Box 8
		gun_5_Model[0][38] = new ModelRendererTurbo(this, 1583, 669, textureX, textureY); // Box 9
		gun_5_Model[0][39] = new ModelRendererTurbo(this, 1591, 669, textureX, textureY); // Box 10
		gun_5_Model[0][40] = new ModelRendererTurbo(this, 1599, 669, textureX, textureY); // Box 11
		gun_5_Model[0][41] = new ModelRendererTurbo(this, 1607, 669, textureX, textureY); // Box 12
		gun_5_Model[0][42] = new ModelRendererTurbo(this, 1615, 669, textureX, textureY); // Box 13
		gun_5_Model[0][43] = new ModelRendererTurbo(this, 1623, 669, textureX, textureY); // Box 14
		gun_5_Model[0][44] = new ModelRendererTurbo(this, 1631, 669, textureX, textureY); // Box 15
		gun_5_Model[0][45] = new ModelRendererTurbo(this, 1639, 669, textureX, textureY); // Box 15
		gun_5_Model[0][46] = new ModelRendererTurbo(this, 1647, 669, textureX, textureY); // Box 15
		gun_5_Model[0][47] = new ModelRendererTurbo(this, 1655, 669, textureX, textureY); // Box 15
		gun_5_Model[0][48] = new ModelRendererTurbo(this, 1663, 669, textureX, textureY); // Box 15
		gun_5_Model[0][49] = new ModelRendererTurbo(this, 1671, 669, textureX, textureY); // Box 15
		gun_5_Model[0][50] = new ModelRendererTurbo(this, 1679, 669, textureX, textureY); // Box 15
		gun_5_Model[0][51] = new ModelRendererTurbo(this, 1687, 669, textureX, textureY); // Box 15
		gun_5_Model[0][52] = new ModelRendererTurbo(this, 1695, 669, textureX, textureY); // Box 23
		gun_5_Model[0][53] = new ModelRendererTurbo(this, 1703, 669, textureX, textureY); // Box 24
		gun_5_Model[0][54] = new ModelRendererTurbo(this, 1711, 669, textureX, textureY); // Box 25
		gun_5_Model[0][55] = new ModelRendererTurbo(this, 1719, 669, textureX, textureY); // Box 26
		gun_5_Model[0][56] = new ModelRendererTurbo(this, 1727, 669, textureX, textureY); // Box 27
		gun_5_Model[0][57] = new ModelRendererTurbo(this, 1735, 669, textureX, textureY); // Box 28
		gun_5_Model[0][58] = new ModelRendererTurbo(this, 1743, 669, textureX, textureY); // Box 29
		gun_5_Model[0][59] = new ModelRendererTurbo(this, 1751, 669, textureX, textureY); // Box 30
		gun_5_Model[0][60] = new ModelRendererTurbo(this, 1759, 669, textureX, textureY); // Box 31
		gun_5_Model[0][61] = new ModelRendererTurbo(this, 1767, 669, textureX, textureY); // Box 32
		gun_5_Model[0][62] = new ModelRendererTurbo(this, 1775, 669, textureX, textureY); // Box 33
		gun_5_Model[0][63] = new ModelRendererTurbo(this, 1783, 669, textureX, textureY); // Box 34
		gun_5_Model[0][64] = new ModelRendererTurbo(this, 1791, 669, textureX, textureY); // Box 35
		gun_5_Model[0][65] = new ModelRendererTurbo(this, 1799, 669, textureX, textureY); // Box 36
		gun_5_Model[0][66] = new ModelRendererTurbo(this, 1807, 669, textureX, textureY); // Box 37
		gun_5_Model[0][67] = new ModelRendererTurbo(this, 1815, 669, textureX, textureY); // Box 38
		gun_5_Model[0][68] = new ModelRendererTurbo(this, 1823, 669, textureX, textureY); // Box 39
		gun_5_Model[0][69] = new ModelRendererTurbo(this, 1831, 669, textureX, textureY); // Box 40
		gun_5_Model[0][70] = new ModelRendererTurbo(this, 1839, 669, textureX, textureY); // Box 41
		gun_5_Model[0][71] = new ModelRendererTurbo(this, 1847, 669, textureX, textureY); // Box 42
		gun_5_Model[0][72] = new ModelRendererTurbo(this, 1855, 669, textureX, textureY); // Box 43
		gun_5_Model[0][73] = new ModelRendererTurbo(this, 1863, 669, textureX, textureY); // Box 44
		gun_5_Model[0][74] = new ModelRendererTurbo(this, 1871, 669, textureX, textureY); // Box 45
		gun_5_Model[0][75] = new ModelRendererTurbo(this, 1911, 669, textureX, textureY); // Box 46
		gun_5_Model[0][76] = new ModelRendererTurbo(this, 1935, 669, textureX, textureY); // Box 47
		gun_5_Model[0][77] = new ModelRendererTurbo(this, 1959, 669, textureX, textureY); // Box 48
		gun_5_Model[0][78] = new ModelRendererTurbo(this, 1471, 677, textureX, textureY); // Box 49
		gun_5_Model[0][79] = new ModelRendererTurbo(this, 1495, 677, textureX, textureY); // Box 0
		gun_5_Model[0][80] = new ModelRendererTurbo(this, 1535, 677, textureX, textureY); // Box 1
		gun_5_Model[0][81] = new ModelRendererTurbo(this, 1575, 677, textureX, textureY); // Box 3
		gun_5_Model[0][82] = new ModelRendererTurbo(this, 1615, 677, textureX, textureY); // Box 4
		gun_5_Model[0][83] = new ModelRendererTurbo(this, 1655, 677, textureX, textureY); // Box 0
		gun_5_Model[0][84] = new ModelRendererTurbo(this, 1679, 677, textureX, textureY); // Box 5
		gun_5_Model[0][85] = new ModelRendererTurbo(this, 1703, 677, textureX, textureY); // Box 0
		gun_5_Model[0][86] = new ModelRendererTurbo(this, 1735, 677, textureX, textureY); // Box 1
		gun_5_Model[0][87] = new ModelRendererTurbo(this, 1767, 677, textureX, textureY); // Box 2
		gun_5_Model[0][88] = new ModelRendererTurbo(this, 1799, 677, textureX, textureY); // Box 3
		gun_5_Model[0][89] = new ModelRendererTurbo(this, 1831, 677, textureX, textureY); // Box 5
		gun_5_Model[0][90] = new ModelRendererTurbo(this, 1847, 677, textureX, textureY); // Box 6
		gun_5_Model[0][91] = new ModelRendererTurbo(this, 1863, 677, textureX, textureY); // Box 9
		gun_5_Model[0][92] = new ModelRendererTurbo(this, 1871, 677, textureX, textureY); // Box 10
		gun_5_Model[0][93] = new ModelRendererTurbo(this, 1879, 677, textureX, textureY); // Box 11
		gun_5_Model[0][94] = new ModelRendererTurbo(this, 1887, 677, textureX, textureY); // Box 12
		gun_5_Model[0][95] = new ModelRendererTurbo(this, 1903, 677, textureX, textureY); // Box 13
		gun_5_Model[0][96] = new ModelRendererTurbo(this, 1927, 677, textureX, textureY); // Box 14
		gun_5_Model[0][97] = new ModelRendererTurbo(this, 1951, 677, textureX, textureY); // Box 15
		gun_5_Model[0][98] = new ModelRendererTurbo(this, 1975, 677, textureX, textureY); // Box 25
		gun_5_Model[0][99] = new ModelRendererTurbo(this, 1791, 685, textureX, textureY); // Box 27
		gun_5_Model[0][100] = new ModelRendererTurbo(this, 1799, 685, textureX, textureY); // Box 28
		gun_5_Model[0][101] = new ModelRendererTurbo(this, 1807, 685, textureX, textureY); // Box 29
		gun_5_Model[0][102] = new ModelRendererTurbo(this, 1815, 685, textureX, textureY); // Box 29
		gun_5_Model[0][103] = new ModelRendererTurbo(this, 1823, 685, textureX, textureY); // Box 31
		gun_5_Model[0][104] = new ModelRendererTurbo(this, 1831, 685, textureX, textureY); // Box 32
		gun_5_Model[0][105] = new ModelRendererTurbo(this, 1839, 685, textureX, textureY); // Box 33
		gun_5_Model[0][106] = new ModelRendererTurbo(this, 1847, 685, textureX, textureY); // Box 34
		gun_5_Model[0][107] = new ModelRendererTurbo(this, 1855, 685, textureX, textureY); // Box 35
		gun_5_Model[0][108] = new ModelRendererTurbo(this, 1863, 685, textureX, textureY); // Box 36
		gun_5_Model[0][109] = new ModelRendererTurbo(this, 1871, 685, textureX, textureY); // Box 37
		gun_5_Model[0][110] = new ModelRendererTurbo(this, 1879, 685, textureX, textureY); // Box 38
		gun_5_Model[0][111] = new ModelRendererTurbo(this, 1887, 685, textureX, textureY); // Box 38
		gun_5_Model[0][112] = new ModelRendererTurbo(this, 1895, 685, textureX, textureY); // Box 38
		gun_5_Model[0][113] = new ModelRendererTurbo(this, 1903, 685, textureX, textureY); // Box 0
		gun_5_Model[0][114] = new ModelRendererTurbo(this, 1943, 685, textureX, textureY); // Box 1
		gun_5_Model[0][115] = new ModelRendererTurbo(this, 1471, 693, textureX, textureY); // Box 2
		gun_5_Model[0][116] = new ModelRendererTurbo(this, 1511, 693, textureX, textureY); // Box 3
		gun_5_Model[0][117] = new ModelRendererTurbo(this, 1551, 693, textureX, textureY); // Box 4

		gun_5_Model[0][0].addShapeBox(0F, 0F, 0F, 24, 1, 1, 0F,-18F, 0F, 0F, 23.125F, 0F, 0F, 23.125F, 0F, -0.625F, -18F, 0F, -0.625F, -18F, -0.625F, 0F, 23.125F, -0.625F, 0F, 23.125F, -0.75F, -0.75F, -18F, -0.75F, -0.75F); // Box 4

		gun_5_Model[0][1].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,-18F, 0.93F, -0.25F, 18F, 0.93F, -0.25F, 18F, 0.75F, -0.25F, -18F, 0.75F, -0.25F, -18F, -1.75F, -0.75F, 18F, -1.75F, -0.75F, 18F, -1.25F, -0.08F, -18F, -1.25F, -0.08F); // Box 7

		gun_5_Model[0][2].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,-18F, -0.75F, -0.75F, 18F, -0.75F, -0.75F, 18F, -0.25F, -0.08F, -18F, -0.25F, -0.08F, -18F, -0.07F, -0.25F, 18F, -0.07F, -0.25F, 18F, -0.25F, -0.25F, -18F, -0.25F, -0.25F); // Box 8

		gun_5_Model[0][3].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,-18F, -0.25F, 0.92F, 18F, -0.25F, 0.92F, 18F, -0.75F, -1.75F, -18F, -0.75F, -1.75F, -18F, -0.25F, 0.75F, 18F, -0.25F, 0.75F, 18F, -0.07F, -1.25F, -18F, -0.07F, -1.25F); // Box 0

		gun_5_Model[0][4].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,-18F, 0.75F, 0.75F, 18F, 0.75F, 0.75F, 18F, 0.93F, -1.25F, -18F, 0.93F, -1.25F, -18F, -1.25F, 0.92F, 18F, -1.25F, 0.92F, 18F, -1.75F, -1.75F, -18F, -1.75F, -1.75F); // Box 1

		gun_5_Model[0][5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-20F, 1F, 0F, 20F, 1F, 0F, 20F, 0.75F, -0.25F, -20F, 0.75F, -0.25F, -20F, -1.75F, -0.75F, 20F, -1.75F, -0.75F, 20F, -1F, 0F, -20F, -1F, 0F); // Box 0

		gun_5_Model[0][6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-23F, 1F, 0F, 23F, 1F, 0F, 23F, 0.75F, -0.25F, -23F, 0.75F, -0.25F, -23F, -1.75F, -0.75F, 23F, -1.75F, -0.75F, 23F, -1F, 0F, -23F, -1F, 0F); // Box 1

		gun_5_Model[0][7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-35F, 1F, 0F, 35F, 1F, 0F, 35F, 0.75F, -0.25F, -35F, 0.75F, -0.25F, -35F, -1.75F, -0.75F, 35F, -1.75F, -0.75F, 35F, -1F, 0F, -35F, -1F, 0F); // Box 2

		gun_5_Model[0][8].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-26F, 1F, 0F, 26F, 1F, 0F, 26F, 0.75F, -0.25F, -26F, 0.75F, -0.25F, -26F, -1.75F, -0.75F, 26F, -1.75F, -0.75F, 26F, -1F, 0F, -26F, -1F, 0F); // Box 3

		gun_5_Model[0][9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-29F, 1F, 0F, 29F, 1F, 0F, 29F, 0.75F, -0.25F, -29F, 0.75F, -0.25F, -29F, -1.75F, -0.75F, 29F, -1.75F, -0.75F, 29F, -1F, 0F, -29F, -1F, 0F); // Box 4

		gun_5_Model[0][10].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-32F, 1F, 0F, 32F, 1F, 0F, 32F, 0.75F, -0.25F, -32F, 0.75F, -0.25F, -32F, -1.75F, -0.75F, 32F, -1.75F, -0.75F, 32F, -1F, 0F, -32F, -1F, 0F); // Box 5

		gun_5_Model[0][11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-32F, 0.75F, 0.75F, 32F, 0.75F, 0.75F, 32F, 1F, -1F, -32F, 1F, -1F, -32F, -1F, 1F, 32F, -1F, 1F, 32F, -1.75F, -1.75F, -32F, -1.75F, -1.75F); // Box 12

		gun_5_Model[0][12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-29F, 0.75F, 0.75F, 29F, 0.75F, 0.75F, 29F, 1F, -1F, -29F, 1F, -1F, -29F, -1F, 1F, 29F, -1F, 1F, 29F, -1.75F, -1.75F, -29F, -1.75F, -1.75F); // Box 13

		gun_5_Model[0][13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-26F, 0.75F, 0.75F, 26F, 0.75F, 0.75F, 26F, 1F, -1F, -26F, 1F, -1F, -26F, -1F, 1F, 26F, -1F, 1F, 26F, -1.75F, -1.75F, -26F, -1.75F, -1.75F); // Box 14

		gun_5_Model[0][14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-35F, 0.75F, 0.75F, 35F, 0.75F, 0.75F, 35F, 1F, -1F, -35F, 1F, -1F, -35F, -1F, 1F, 35F, -1F, 1F, 35F, -1.75F, -1.75F, -35F, -1.75F, -1.75F); // Box 15

		gun_5_Model[0][15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-23F, 0.75F, 0.75F, 23F, 0.75F, 0.75F, 23F, 1F, -1F, -23F, 1F, -1F, -23F, -1F, 1F, 23F, -1F, 1F, 23F, -1.75F, -1.75F, -23F, -1.75F, -1.75F); // Box 16

		gun_5_Model[0][16].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-20F, 0.75F, 0.75F, 20F, 0.75F, 0.75F, 20F, 1F, -1F, -20F, 1F, -1F, -20F, -1F, 1F, 20F, -1F, 1F, 20F, -1.75F, -1.75F, -20F, -1.75F, -1.75F); // Box 17

		gun_5_Model[0][17].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-32F, 0F, 1F, 32F, 0F, 1F, 32F, -0.75F, -1.75F, -32F, -0.75F, -1.75F, -32F, -0.25F, 0.75F, 32F, -0.25F, 0.75F, 32F, 0F, -1F, -32F, 0F, -1F); // Box 18

		gun_5_Model[0][18].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-29F, 0F, 1F, 29F, 0F, 1F, 29F, -0.75F, -1.75F, -29F, -0.75F, -1.75F, -29F, -0.25F, 0.75F, 29F, -0.25F, 0.75F, 29F, 0F, -1F, -29F, 0F, -1F); // Box 19

		gun_5_Model[0][19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-26F, 0F, 1F, 26F, 0F, 1F, 26F, -0.75F, -1.75F, -26F, -0.75F, -1.75F, -26F, -0.25F, 0.75F, 26F, -0.25F, 0.75F, 26F, 0F, -1F, -26F, 0F, -1F); // Box 20

		gun_5_Model[0][20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-35F, 0F, 1F, 35F, 0F, 1F, 35F, -0.75F, -1.75F, -35F, -0.75F, -1.75F, -35F, -0.25F, 0.75F, 35F, -0.25F, 0.75F, 35F, 0F, -1F, -35F, 0F, -1F); // Box 21

		gun_5_Model[0][21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-23F, 0F, 1F, 23F, 0F, 1F, 23F, -0.75F, -1.75F, -23F, -0.75F, -1.75F, -23F, -0.25F, 0.75F, 23F, -0.25F, 0.75F, 23F, 0F, -1F, -23F, 0F, -1F); // Box 22

		gun_5_Model[0][22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-20F, 0F, 1F, 20F, 0F, 1F, 20F, -0.75F, -1.75F, -20F, -0.75F, -1.75F, -20F, -0.25F, 0.75F, 20F, -0.25F, 0.75F, 20F, 0F, -1F, -20F, 0F, -1F); // Box 23

		gun_5_Model[0][23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-20F, -0.75F, -0.75F, 20F, -0.75F, -0.75F, 20F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, 0F, 20F, 0F, 0F, 20F, -0.25F, -0.25F, -20F, -0.25F, -0.25F); // Box 24

		gun_5_Model[0][24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-23F, -0.75F, -0.75F, 23F, -0.75F, -0.75F, 23F, 0F, 0F, -23F, 0F, 0F, -23F, 0F, 0F, 23F, 0F, 0F, 23F, -0.25F, -0.25F, -23F, -0.25F, -0.25F); // Box 25

		gun_5_Model[0][25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-35F, -0.75F, -0.75F, 35F, -0.75F, -0.75F, 35F, 0F, 0F, -35F, 0F, 0F, -35F, 0F, 0F, 35F, 0F, 0F, 35F, -0.25F, -0.25F, -35F, -0.25F, -0.25F); // Box 26

		gun_5_Model[0][26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-26F, -0.75F, -0.75F, 26F, -0.75F, -0.75F, 26F, 0F, 0F, -26F, 0F, 0F, -26F, 0F, 0F, 26F, 0F, 0F, 26F, -0.25F, -0.25F, -26F, -0.25F, -0.25F); // Box 27

		gun_5_Model[0][27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-29F, -0.75F, -0.75F, 29F, -0.75F, -0.75F, 29F, 0F, 0F, -29F, 0F, 0F, -29F, 0F, 0F, 29F, 0F, 0F, 29F, -0.25F, -0.25F, -29F, -0.25F, -0.25F); // Box 28

		gun_5_Model[0][28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-32F, -0.75F, -0.75F, 32F, -0.75F, -0.75F, 32F, 0F, 0F, -32F, 0F, 0F, -32F, 0F, 0F, 32F, 0F, 0F, 32F, -0.25F, -0.25F, -32F, -0.25F, -0.25F); // Box 29

		gun_5_Model[0][29].addShapeBox(0F, 0F, 0F, 24, 1, 1, 0F,-18F, 0F, 0.375F, 23.125F, 0F, 0.375F, 23.125F, 0F, -1F, -18F, 0F, -1F, -18F, -0.75F, 0.25F, 23.125F, -0.75F, 0.25F, 23.125F, -0.625F, -1F, -18F, -0.625F, -1F); // Box 2

		gun_5_Model[0][30].addShapeBox(0F, 0F, 0F, 24, 1, 1, 0F,-18F, 0.25F, 0.25F, 23.125F, 0.25F, 0.25F, 23.125F, 0.375F, -1F, -18F, 0.375F, -1F, -18F, -1F, 0.375F, 23.125F, -1F, 0.375F, 23.125F, -1F, -1F, -18F, -1F, -1F); // Box 3

		gun_5_Model[0][31].addShapeBox(0F, 0F, 0F, 24, 1, 1, 0F,-18F, 0.375F, 0F, 23.125F, 0.375F, 0F, 23.125F, 0.25F, -0.75F, -18F, 0.25F, -0.75F, -18F, -1F, 0F, 23.125F, -1F, 0F, 23.125F, -1F, -0.625F, -18F, -1F, -0.625F); // Box 4

		gun_5_Model[0][32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-36F, 1F, 0F, 36F, 1F, 0F, 36F, 0.75F, -0.25F, -36F, 0.75F, -0.25F, -36F, -1F, 0F, 36F, -1F, 0F, 36F, -1F, 0F, -36F, -1F, 0F); // Box 0

		gun_5_Model[0][33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-36F, 0.75F, 0.75F, 36F, 0.75F, 0.75F, 36F, 1F, -1F, -36F, 1F, -1F, -36F, -1F, 1F, 36F, -1F, 1F, 36F, -1F, -1F, -36F, -1F, -1F); // Box 1

		gun_5_Model[0][34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-36F, 0F, 1F, 36F, 0F, 1F, 36F, 0F, -1F, -36F, 0F, -1F, -36F, -0.25F, 0.75F, 36F, -0.25F, 0.75F, 36F, 0F, -1F, -36F, 0F, -1F); // Box 2

		gun_5_Model[0][35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-36F, 0F, 0F, 36F, 0F, 0F, 36F, 0F, 0F, -36F, 0F, 0F, -36F, 0F, 0F, 36F, 0F, 0F, 36F, -0.25F, -0.25F, -36F, -0.25F, -0.25F); // Box 3

		gun_5_Model[0][36].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-43F, 0F, 0F, 44.25F, 0F, 0F, 44.25F, 0F, -0.375F, -43F, 0F, -0.5F, -43F, -0.5F, 0F, 44.25F, -0.375F, 0F, 44.25F, -0.5F, -0.5F, -43F, -0.625F, -0.625F); // Box 6

		gun_5_Model[0][37].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-46.75F, 0F, 0F, 46F, 0F, 0F, 46F, 0F, -0.375F, -46.75F, 0F, -0.375F, -46.75F, -0.375F, 0F, 46F, -0.375F, 0F, 46F, -0.5F, -0.5F, -46.75F, -0.5F, -0.5F); // Box 8

		gun_5_Model[0][38].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-46.5F, -0.25F, 0F, 45.75F, 0F, 0F, 45.75F, 0F, -0.375F, -46.5F, -0.25F, -0.45F, -46.5F, -0.375F, 0F, 45.75F, -0.375F, 0F, 45.75F, -0.5F, -0.5F, -46.5F, -0.5F, -0.5F); // Box 9

		gun_5_Model[0][39].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-46.25F, 0F, 0F, 45.5F, -0.25F, 0F, 45.5F, -0.25F, -0.45F, -46.25F, 0F, -0.375F, -46.25F, -0.375F, 0F, 45.5F, -0.375F, 0F, 45.5F, -0.5F, -0.5F, -46.25F, -0.5F, -0.5F); // Box 10

		gun_5_Model[0][40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-46F, -0.25F, 0F, 45.25F, 0F, 0F, 45.25F, 0F, -0.375F, -46F, -0.25F, -0.45F, -46F, -0.375F, 0F, 45.25F, -0.375F, 0F, 45.25F, -0.5F, -0.5F, -46F, -0.5F, -0.5F); // Box 11

		gun_5_Model[0][41].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-45.75F, 0F, 0F, 45F, -0.25F, 0F, 45F, -0.25F, -0.45F, -45.75F, 0F, -0.375F, -45.75F, -0.375F, 0F, 45F, -0.375F, 0F, 45F, -0.5F, -0.5F, -45.75F, -0.5F, -0.5F); // Box 12

		gun_5_Model[0][42].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-45.25F, 0F, 0F, 44.5F, -0.25F, 0F, 44.5F, -0.25F, -0.45F, -45.25F, 0F, -0.375F, -45.25F, -0.375F, 0F, 44.5F, -0.375F, 0F, 44.5F, -0.5F, -0.5F, -45.25F, -0.5F, -0.5F); // Box 13

		gun_5_Model[0][43].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-45.5F, -0.25F, 0F, 44.75F, 0F, 0F, 44.75F, 0F, -0.375F, -45.5F, -0.25F, -0.45F, -45.5F, -0.375F, 0F, 44.75F, -0.375F, 0F, 44.75F, -0.5F, -0.5F, -45.5F, -0.5F, -0.5F); // Box 14

		gun_5_Model[0][44].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-43F, 0.5F, 0F, 44.25F, 0.625F, 0F, 44.25F, 0.5F, -0.5F, -43F, 0.375F, -0.625F, -43F, -1F, 0F, 44.25F, -1F, 0F, 44.25F, -1F, -0.375F, -43F, -1F, -0.5F); // Box 15

		gun_5_Model[0][45].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-46.75F, 0.625F, 0F, 46F, 0.625F, 0F, 46F, 0.5F, -0.5F, -46.75F, 0.5F, -0.5F, -46.75F, -1F, 0F, 46F, -1F, 0F, 46F, -1F, -0.375F, -46.75F, -1F, -0.375F); // Box 15

		gun_5_Model[0][46].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-46.5F, 0.625F, 0F, 45.75F, 0.625F, 0F, 45.75F, 0.5F, -0.5F, -46.5F, 0.5F, -0.5F, -46.5F, -1.25F, 0F, 45.75F, -1F, 0F, 45.75F, -1F, -0.375F, -46.5F, -1.25F, -0.45F); // Box 15

		gun_5_Model[0][47].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-46.25F, 0.625F, 0F, 45.5F, 0.625F, 0F, 45.5F, 0.5F, -0.5F, -46.25F, 0.5F, -0.5F, -46.25F, -1F, 0F, 45.5F, -1.25F, 0F, 45.5F, -1.25F, -0.45F, -46.25F, -1F, -0.375F); // Box 15

		gun_5_Model[0][48].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-46F, 0.625F, 0F, 45.25F, 0.625F, 0F, 45.25F, 0.5F, -0.5F, -46F, 0.5F, -0.5F, -46F, -1.25F, 0F, 45.25F, -1F, 0F, 45.25F, -1F, -0.375F, -46F, -1.25F, -0.45F); // Box 15

		gun_5_Model[0][49].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-45.75F, 0.625F, 0F, 45F, 0.625F, 0F, 45F, 0.5F, -0.5F, -45.75F, 0.5F, -0.5F, -45.75F, -1F, 0F, 45F, -1.25F, 0F, 45F, -1.25F, -0.45F, -45.75F, -1F, -0.375F); // Box 15

		gun_5_Model[0][50].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-45.25F, 0.625F, 0F, 44.5F, 0.625F, 0F, 44.5F, 0.5F, -0.5F, -45.25F, 0.5F, -0.5F, -45.25F, -1F, 0F, 44.5F, -1.25F, 0F, 44.5F, -1.25F, -0.45F, -45.25F, -1F, -0.375F); // Box 15

		gun_5_Model[0][51].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-45.5F, 0.625F, 0F, 44.75F, 0.625F, 0F, 44.75F, 0.5F, -0.5F, -45.5F, 0.5F, -0.5F, -45.5F, -1.25F, 0F, 44.75F, -1F, 0F, 44.75F, -1F, -0.375F, -45.5F, -1.25F, -0.45F); // Box 15

		gun_5_Model[0][52].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-43F, 0F, 0.5F, 44.25F, 0F, 0.625F, 44.25F, 0F, -1F, -43F, 0F, -1F, -43F, -0.625F, 0.375F, 44.25F, -0.5F, 0.5F, 44.25F, -0.375F, -1F, -43F, -0.5F, -1F); // Box 23

		gun_5_Model[0][53].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-46.75F, 0F, 0.625F, 46F, 0F, 0.625F, 46F, 0F, -1F, -46.75F, 0F, -1F, -46.75F, -0.5F, 0.5F, 46F, -0.5F, 0.5F, 46F, -0.375F, -1F, -46.75F, -0.375F, -1F); // Box 24

		gun_5_Model[0][54].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-46.5F, -0.25F, 0.55F, 45.75F, 0F, 0.625F, 45.75F, 0F, -1F, -46.5F, -0.25F, -1F, -46.5F, -0.5F, 0.5F, 45.75F, -0.5F, 0.5F, 45.75F, -0.375F, -1F, -46.5F, -0.375F, -1F); // Box 25

		gun_5_Model[0][55].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-46.25F, 0F, 0.625F, 45.5F, -0.25F, 0.55F, 45.5F, -0.25F, -1F, -46.25F, 0F, -1F, -46.25F, -0.5F, 0.5F, 45.5F, -0.5F, 0.5F, 45.5F, -0.375F, -1F, -46.25F, -0.375F, -1F); // Box 26

		gun_5_Model[0][56].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-46F, -0.25F, 0.55F, 45.25F, 0F, 0.625F, 45.25F, 0F, -1F, -46F, -0.25F, -1F, -46F, -0.5F, 0.5F, 45.25F, -0.5F, 0.5F, 45.25F, -0.375F, -1F, -46F, -0.375F, -1F); // Box 27

		gun_5_Model[0][57].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-45.75F, 0F, 0.625F, 45F, -0.25F, 0.55F, 45F, -0.25F, -1F, -45.75F, 0F, -1F, -45.75F, -0.5F, 0.5F, 45F, -0.5F, 0.5F, 45F, -0.375F, -1F, -45.75F, -0.375F, -1F); // Box 28

		gun_5_Model[0][58].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-45.25F, 0F, 0.625F, 44.5F, -0.25F, 0.55F, 44.5F, -0.25F, -1F, -45.25F, 0F, -1F, -45.25F, -0.5F, 0.5F, 44.5F, -0.5F, 0.5F, 44.5F, -0.375F, -1F, -45.25F, -0.375F, -1F); // Box 29

		gun_5_Model[0][59].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-45.5F, -0.25F, 0.55F, 44.75F, 0F, 0.625F, 44.75F, 0F, -1F, -45.5F, -0.25F, -1F, -45.5F, -0.5F, 0.5F, 44.75F, -0.5F, 0.5F, 44.75F, -0.375F, -1F, -45.5F, -0.375F, -1F); // Box 30

		gun_5_Model[0][60].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-43F, 0.375F, 0.375F, 44.25F, 0.5F, 0.5F, 44.25F, 0.625F, -1F, -43F, 0.5F, -1F, -43F, -1F, 0.5F, 44.25F, -1F, 0.625F, 44.25F, -1F, -1F, -43F, -1F, -1F); // Box 31

		gun_5_Model[0][61].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-46.75F, 0.5F, 0.5F, 46F, 0.5F, 0.5F, 46F, 0.625F, -1F, -46.75F, 0.625F, -1F, -46.75F, -1F, 0.625F, 46F, -1F, 0.625F, 46F, -1F, -1F, -46.75F, -1F, -1F); // Box 32

		gun_5_Model[0][62].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-46.5F, 0.5F, 0.5F, 45.75F, 0.5F, 0.5F, 45.75F, 0.625F, -1F, -46.5F, 0.625F, -1F, -46.5F, -1.25F, 0.55F, 45.75F, -1F, 0.625F, 45.75F, -1F, -1F, -46.5F, -1.25F, -1F); // Box 33

		gun_5_Model[0][63].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-46.25F, 0.5F, 0.5F, 45.5F, 0.5F, 0.5F, 45.5F, 0.625F, -1F, -46.25F, 0.625F, -1F, -46.25F, -1F, 0.625F, 45.5F, -1.25F, 0.55F, 45.5F, -1.25F, -1F, -46.25F, -1F, -1F); // Box 34

		gun_5_Model[0][64].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-46F, 0.5F, 0.5F, 45.25F, 0.5F, 0.5F, 45.25F, 0.625F, -1F, -46F, 0.625F, -1F, -46F, -1.25F, 0.55F, 45.25F, -1F, 0.625F, 45.25F, -1F, -1F, -46F, -1.25F, -1F); // Box 35

		gun_5_Model[0][65].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-45.75F, 0.5F, 0.5F, 45F, 0.5F, 0.5F, 45F, 0.625F, -1F, -45.75F, 0.625F, -1F, -45.75F, -1F, 0.625F, 45F, -1.25F, 0.55F, 45F, -1.25F, -1F, -45.75F, -1F, -1F); // Box 36

		gun_5_Model[0][66].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-45.25F, 0.5F, 0.5F, 44.5F, 0.5F, 0.5F, 44.5F, 0.625F, -1F, -45.25F, 0.625F, -1F, -45.25F, -1F, 0.625F, 44.5F, -1.25F, 0.55F, 44.5F, -1.25F, -1F, -45.25F, -1F, -1F); // Box 37

		gun_5_Model[0][67].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-45.5F, 0.5F, 0.5F, 44.75F, 0.5F, 0.5F, 44.75F, 0.625F, -1F, -45.5F, 0.625F, -1F, -45.5F, -1.25F, 0.55F, 44.75F, -1F, 0.625F, 44.75F, -1F, -1F, -45.5F, -1.25F, -1F); // Box 38

		gun_5_Model[0][68].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-36.25F, 1.5F, 0F, 35.75F, 1.5F, 0F, 35.75F, 1.5F, -0.875F, -36.25F, 1.5F, -0.875F, -36.25F, -1F, 0F, 35.75F, -1F, 0F, 35.75F, -1F, -0.875F, -36.25F, -1F, -0.875F); // Box 39

		gun_5_Model[0][69].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-36.25F, 1.5F, 0.125F, 35.75F, 1.5F, 0.125F, 35.75F, 1.5F, -1F, -36.25F, 1.5F, -1F, -36.25F, -1F, 0.125F, 35.75F, -1F, 0.125F, 35.75F, -1F, -1F, -36.25F, -1F, -1F); // Box 40

		gun_5_Model[0][70].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-36.25F, 1.5F, 0F, 35.75F, 1.5F, 0F, 35.75F, 1.625F, -0.75F, -36.25F, 1.625F, -0.75F, -36.25F, -2.375F, 0F, 35.75F, -2.375F, 0F, 35.75F, -2.5F, -0.75F, -36.25F, -2.5F, -0.75F); // Box 41

		gun_5_Model[0][71].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-36.25F, 1.625F, 0.25F, 35.75F, 1.625F, 0.25F, 35.75F, 1.5F, -1F, -36.25F, 1.5F, -1F, -36.25F, -2.5F, 0.25F, 35.75F, -2.5F, 0.25F, 35.75F, -2.375F, -1F, -36.25F, -2.375F, -1F); // Box 42

		gun_5_Model[0][72].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-36.25F, 2F, -0.25F, 35.75F, 2F, -0.25F, 35.75F, 1.875F, -0.625F, -36.25F, 1.875F, -0.625F, -36.25F, -2.5F, -0.25F, 35.75F, -2.5F, -0.25F, 35.75F, -2.625F, -0.625F, -36.25F, -2.625F, -0.625F); // Box 43

		gun_5_Model[0][73].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-36.25F, 1.875F, 0.375F, 35.75F, 1.875F, 0.375F, 35.75F, 2F, -1.25F, -36.25F, 2F, -1.25F, -36.25F, -2.625F, 0.375F, 35.75F, -2.625F, 0.375F, 35.75F, -2.5F, -1.25F, -36.25F, -2.5F, -1.25F); // Box 44

		gun_5_Model[0][74].addShapeBox(0F, 0F, 0F, 14, 2, 2, 0F,0F, 1F, 1.5F, -4.75F, 1.75F, 1.5F, -4.75F, 1.75F, -0.5F, 0F, 1F, -0.5F, 0F, 0.25F, 1.5F, -4.75F, 0.25F, 1.5F, -4.75F, 0.25F, -0.5F, 0F, 0.25F, -0.5F); // Box 45

		gun_5_Model[0][75].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,-14F, 0F, 0F, 11F, 0F, 0F, 11F, 0F, 0F, -14F, 0F, 0.5F, -14F, 0.5F, 0F, 11F, 0F, 0F, 11F, -0.25F, -0.25F, -14F, 0.125F, 0.125F); // Box 46

		gun_5_Model[0][76].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,-14F, 1.5F, 0F, 11F, 1F, 0F, 11F, 0.75F, -0.25F, -14F, 1.125F, 0.125F, -14F, -1F, 0F, 11F, -1F, 0F, 11F, -1F, 0F, -14F, -1F, 0.5F); // Box 47

		gun_5_Model[0][77].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,-14F, 1.125F, 1.125F, 11F, 0.75F, 0.75F, 11F, 1F, -1F, -14F, 1.5F, -1F, -14F, -1F, 1.5F, 11F, -1F, 1F, 11F, -1F, -1F, -14F, -1F, -1F); // Box 48

		gun_5_Model[0][78].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,-14F, 0F, 1.5F, 11F, 0F, 1F, 11F, 0F, -1F, -14F, 0F, -1F, -14F, 0.125F, 1.125F, 11F, -0.25F, 0.75F, 11F, 0F, -1F, -14F, 0.5F, -1F); // Box 49

		gun_5_Model[0][79].addShapeBox(0F, 0F, 0F, 14, 2, 2, 0F,-13.5F, 2.25F, -0.875F, 0F, 1.5F, -0.875F, 0F, 1.5F, -0.5F, -13.5F, 2.25F, -0.5F, -13.5F, 0.25F, -0.875F, 0F, -0.25F, -0.875F, 0F, -0.25F, -0.5F, -13.5F, 0.25F, -0.5F); // Box 0

		gun_5_Model[0][80].addShapeBox(0F, 0F, 0F, 14, 2, 2, 0F,-9.25F, 2.25F, 1.5F, -0.5F, 2.25F, 1.5F, -0.5F, 2.25F, -2.875F, -9.25F, 2.25F, -2.875F, -9.25F, 0.25F, 1.5F, -0.5F, 0.25F, 1.5F, -0.5F, 0.25F, -2.625F, -9.25F, 0.25F, -2.625F); // Box 1

		gun_5_Model[0][81].addShapeBox(0F, 0F, 0F, 14, 2, 2, 0F,0F, 1.25F, -0.875F, -4.75F, 2.25F, -0.875F, -4.75F, 2.25F, -0.5F, 0F, 1.25F, -0.5F, 0F, 0.25F, -0.875F, -4.75F, 0.25F, -0.875F, -4.75F, 0.25F, -0.5F, 0F, 0.25F, -0.5F); // Box 3

		gun_5_Model[0][82].addShapeBox(0F, 0F, 0F, 14, 2, 2, 0F,0F, 1.25F, 1.5F, -4.75F, 2.25F, 1.5F, -4.75F, 2.25F, -2.875F, 0F, 1.25F, -2.875F, 0F, 0.25F, 1.5F, -4.75F, 0.25F, 1.5F, -4.75F, 0.25F, -2.875F, 0F, 0.25F, -2.875F); // Box 4

		gun_5_Model[0][83].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,-13.5F, 2.25F, 0.25F, 10.25F, 1.375F, 0.25F, 10.25F, 1.375F, -0.75F, -13.5F, 2.25F, -0.75F, -13.5F, -1F, 0.25F, 11F, -1.875F, 0.25F, 11F, -1.875F, -0.75F, -13.5F, -1F, -0.75F); // Box 0

		gun_5_Model[0][84].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,-2.7F, -1.25F, 2.05F, -2.7F, -1.25F, 2.05F, -2.7F, -1.25F, -3.5F, -2.7F, -1.25F, -3.5F, -2.7F, 1F, 2.05F, -2.7F, 1F, 2.05F, -2.7F, 1F, -3.5F, -2.7F, 1F, -3.5F); // Box 5

		gun_5_Model[0][85].addShapeBox(0F, 0F, 0F, 13, 2, 2, 0F,-8F, 2.75F, -1.5F, 0F, 2.25F, -2F, 0F, 2.25F, 2F, -8F, 2.75F, 2.5F, -8F, -2.75F, -1.5F, 0F, -3.25F, -2F, 0F, -3.25F, 2F, -8F, -2.75F, 2.5F); // Box 0

		gun_5_Model[0][86].addShapeBox(0F, 0F, 0F, 13, 2, 2, 0F,-8F, 3.25F, -2F, 0F, 2.75F, -2.5F, 0F, 2.75F, 1.5F, -8F, 3.25F, 2F, -8F, -4.75F, -1.5F, 0F, -4.25F, -2F, 0F, -4.25F, 2F, -8F, -4.75F, 2.5F); // Box 1

		gun_5_Model[0][87].addShapeBox(0F, 0F, 0F, 13, 2, 2, 0F,-8F, 0.75F, -1.5F, 0F, 1.25F, -2F, 0F, 1.25F, 2F, -8F, 0.75F, 2.5F, -8F, -2.25F, -2F, 0F, -2.75F, -2.5F, 0F, -2.75F, 1.5F, -8F, -2.25F, 2F); // Box 2

		gun_5_Model[0][88].addShapeBox(0F, 0F, 0F, 13, 2, 2, 0F,-8F, 0.875F, -1.5F, 0F, 1.375F, -1.5F, 0F, 1.375F, 2F, -8F, 0.875F, 2.5F, -8F, -2.25F, -1.5F, 0F, -2.75F, -1.5F, 0F, -2.75F, 1.5F, -8F, -2.25F, 2F); // Box 3

		gun_5_Model[0][89].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 1.25F, -0.875F, -4.75F, -0.125F, -0.875F, -4.75F, -0.125F, -0.5F, 0F, 1.25F, -0.5F, 0F, 0.25F, -0.875F, -4.75F, -0.875F, -0.875F, -4.75F, -0.875F, -0.5F, 0F, 0.25F, -0.5F); // Box 5

		gun_5_Model[0][90].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 1.25F, 1.5F, -4.75F, -0.125F, 1.5F, -4.75F, -0.125F, -2.875F, 0F, 1.25F, -2.875F, 0F, 0.25F, 1.5F, -4.75F, -0.875F, 1.5F, -4.75F, -0.875F, -2.875F, 0F, 0.25F, -2.875F); // Box 6

		gun_5_Model[0][91].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.375F, -0.125F, 3.75F, -0.625F, -0.125F, 3.75F, -0.625F, -0.125F, 2.75F, 0.375F, -0.125F, 2.75F, 0.125F, -0.625F, 3.75F, -0.875F, -0.625F, 3.75F, -0.875F, -0.625F, 2.75F, 0.125F, -0.625F, 2.75F); // Box 9

		gun_5_Model[0][92].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.375F, 0.125F, 3.75F, -0.625F, 0.125F, 3.75F, -0.625F, 0.125F, 2.75F, 0.375F, 0.125F, 2.75F, 0.375F, -0.875F, 3.75F, -0.625F, -0.875F, 3.75F, -0.625F, -0.875F, 2.75F, 0.375F, -0.875F, 2.75F); // Box 10

		gun_5_Model[0][93].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.125F, 0.375F, 3.75F, -0.875F, 0.375F, 3.75F, -0.875F, 0.375F, 2.75F, 0.125F, 0.375F, 2.75F, 0.375F, -1.125F, 3.75F, -0.625F, -1.125F, 3.75F, -0.625F, -1.125F, 2.75F, 0.375F, -1.125F, 2.75F); // Box 11

		gun_5_Model[0][94].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 1F, 1.5F, -4.75F, -0.125F, 1.5F, -4.75F, -0.125F, -0.5F, 0F, 1F, -0.5F, 0F, 0.25F, 1.5F, -4.75F, -0.875F, 1.5F, -4.75F, -0.875F, -0.5F, 0F, 0.25F, -0.5F); // Box 12

		gun_5_Model[0][95].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,-3.575F, 2.65F, 1.85F, -2.025F, 2.5F, 1.85F, -2.025F, 2.5F, -3.65F, -3.575F, 2.65F, -3.65F, -2.775F, 0.25F, 1.85F, -2.775F, 0.5F, 1.85F, -2.775F, 0.5F, -3.65F, -2.775F, 0.25F, -3.65F); // Box 13

		gun_5_Model[0][96].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,-3.675F, 2.6F, 1.975F, -2.125F, 2.52F, 1.975F, -2.025F, 2.5F, -3.85F, -3.575F, 2.65F, -3.85F, -2.875F, 0.25F, 1.975F, -2.875F, 0.5F, 1.975F, -2.775F, 0.5F, -3.85F, -2.775F, 0.25F, -3.85F); // Box 14

		gun_5_Model[0][97].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,-3.575F, 2.65F, 1.65F, -2.025F, 2.5F, 1.65F, -2.125F, 2.52F, -3.525F, -3.675F, 2.6F, -3.525F, -2.775F, 0.25F, 1.65F, -2.775F, 0.5F, 1.65F, -2.875F, 0.5F, -3.525F, -2.875F, 0.25F, -3.525F); // Box 15

		gun_5_Model[0][98].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,1.25F, 0.5F, -1.5F, -1.75F, -0.125F, -1F, -1.75F, -0.125F, -0.5F, 1.25F, 0.5F, 0F, 1.25F, -2.25F, -1.5F, -1.75F, -1.625F, -1F, -1.75F, -1.625F, -0.5F, 1.25F, -2.25F, 0F); // Box 25

		gun_5_Model[0][99].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-4.125F, -1.75F, 1.75F, 3.375F, -1.75F, 1.75F, 3.375F, -1.75F, -0.25F, -4.125F, -1.75F, -0.25F, -4.075F, 1.25F, 1.75F, 3.325F, 1.25F, 1.75F, 3.325F, 1.25F, -0.25F, -4.075F, 1.25F, -0.25F); // Box 27

		gun_5_Model[0][100].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,1.25F, -1.5F, -1.5F, -1.75F, -0.875F, -1F, -1.75F, -0.875F, -0.5F, 1.25F, -1.5F, 0F, 1.25F, -0.25F, -1.5F, -1.75F, -0.875F, -1F, -1.75F, -0.875F, -0.5F, 1.25F, -0.25F, 0F); // Box 28

		gun_5_Model[0][101].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,1.25F, 0.5F, 2F, -1.75F, -0.125F, 1.5F, -1.75F, -0.125F, -3F, 1.25F, 0.5F, -3.5F, 1.25F, -2.25F, 2F, -1.75F, -1.625F, 1.5F, -1.75F, -1.625F, -3F, 1.25F, -2.25F, -3.5F); // Box 29

		gun_5_Model[0][102].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,1.25F, -1.5F, 2F, -1.75F, -0.875F, 1.5F, -1.75F, -0.875F, -3F, 1.25F, -1.5F, -3.5F, 1.25F, -0.25F, 2F, -1.75F, -0.875F, 1.5F, -1.75F, -0.875F, -3F, 1.25F, -0.25F, -3.5F); // Box 29

		gun_5_Model[0][103].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,2.5F, 0.375F, -2F, -3F, 0.325F, -1.95F, -3.125F, 0.325F, 0.125F, 2.375F, 0.375F, 0.125F, 2.5F, -0.375F, -2F, -3F, -0.425F, -1.95F, -3.125F, -0.425F, 0.125F, 2.375F, -0.375F, 0.125F); // Box 31

		gun_5_Model[0][104].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,2.5F, 0.625F, -1.625F, -2.25F, 0.5F, -1.5F, -2.25F, 0.5F, 0F, 2.5F, 0.625F, 0.125F, 2.5F, -2.375F, -1.625F, -2.25F, -2.25F, -1.5F, -2.25F, -2.25F, 0F, 2.5F, -2.375F, 0.125F); // Box 32

		gun_5_Model[0][105].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,2.5F, 0.625F, 2.125F, -2.25F, 0.5F, 2F, -2.25F, 0.5F, -3.5F, 2.5F, 0.625F, -3.625F, 2.5F, -2.375F, 2.125F, -2.25F, -2.25F, 2F, -2.25F, -2.25F, -3.5F, 2.5F, -2.375F, -3.625F); // Box 33

		gun_5_Model[0][106].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,2.5F, -1.625F, -1.625F, -2.25F, -1.5F, -1.5F, -2.25F, -1.5F, 0F, 2.5F, -1.625F, 0.125F, 2.5F, -0.125F, -1.625F, -2.25F, -0.25F, -1.5F, -2.25F, -0.25F, 0F, 2.5F, -0.125F, 0.125F); // Box 34

		gun_5_Model[0][107].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,2.5F, -1.625F, 2.125F, -2.25F, -1.5F, 2F, -2.25F, -1.5F, -3.5F, 2.5F, -1.625F, -3.625F, 2.5F, -0.125F, 2.125F, -2.25F, -0.25F, 2F, -2.25F, -0.25F, -3.5F, 2.5F, -0.125F, -3.625F); // Box 35

		gun_5_Model[0][108].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,2.5F, 0.375F, -1.75F, -3F, 0.325F, -1.7F, -3F, 0.325F, 0F, 2.5F, 0.375F, 0F, 2.5F, -0.375F, -1.75F, -3F, -0.425F, -1.7F, -3F, -0.425F, 0F, 2.5F, -0.375F, 0F); // Box 36

		gun_5_Model[0][109].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,2.375F, 0.375F, -1.625F, -3.125F, 0.325F, -1.575F, -3F, 0.325F, -0.25F, 2.5F, 0.375F, -0.25F, 2.375F, -0.375F, -1.625F, -3.125F, -0.425F, -1.575F, -3F, -0.425F, -0.25F, 2.5F, -0.375F, -0.25F); // Box 37

		gun_5_Model[0][110].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,2.375F, 0.375F, 2.125F, -3.125F, 0.325F, 2.125F, -3F, 0.325F, -3.95F, 2.5F, 0.375F, -4F, 2.375F, -0.375F, 2.125F, -3.125F, -0.425F, 2.125F, -3F, -0.425F, -3.95F, 2.5F, -0.375F, -4F); // Box 38

		gun_5_Model[0][111].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,2.5F, 0.375F, 2F, -3F, 0.325F, 2F, -3F, 0.325F, -3.7F, 2.5F, 0.375F, -3.75F, 2.5F, -0.375F, 2F, -3F, -0.425F, 2F, -3F, -0.425F, -3.7F, 2.5F, -0.375F, -3.75F); // Box 38

		gun_5_Model[0][112].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,2.5F, 0.375F, 1.75F, -3F, 0.325F, 1.75F, -3.125F, 0.325F, -3.575F, 2.375F, 0.375F, -3.625F, 2.5F, -0.375F, 1.75F, -3F, -0.425F, 1.75F, -3.125F, -0.425F, -3.575F, 2.375F, -0.375F, -3.625F); // Box 38

		gun_5_Model[0][113].addShapeBox(0F, 0F, 0F, 14, 2, 2, 0F,-9.25F, 1.75F, 1.5F, -0.5F, 1.75F, 1.5F, -0.5F, 1.75F, -0.5F, -9.25F, 1.75F, -0.5F, -9.25F, 0.25F, 1.5F, -0.5F, 0.25F, 1.5F, -0.5F, 0.25F, -0.5F, -9.25F, 0.25F, -0.5F); // Box 0

		gun_5_Model[0][114].addShapeBox(0F, 0F, 0F, 14, 2, 2, 0F,-9.25F, 2.25F, -0.875F, -0.5F, 2.25F, -0.875F, -0.5F, 2.25F, -0.5F, -9.25F, 2.25F, -0.5F, -9.25F, 0.25F, -0.875F, -0.5F, 0.25F, -0.875F, -0.5F, 0.25F, -0.5F, -9.25F, 0.25F, -0.5F); // Box 1

		gun_5_Model[0][115].addShapeBox(0F, 0F, 0F, 14, 2, 2, 0F,-13.5F, 1.75F, 1.5F, 0F, 1.5F, 1.5F, 0F, 1.5F, -0.5F, -13.5F, 1.75F, -0.5F, -13.5F, 0.25F, 1.5F, 0F, -0.25F, 1.5F, 0F, -0.25F, -0.5F, -13.5F, 0.25F, -0.5F); // Box 2

		gun_5_Model[0][116].addShapeBox(0F, 0F, 0F, 14, 2, 2, 0F,-13.5F, 2.25F, 1.5F, 0F, 1.5F, 1.5F, 0F, 1.5F, -2.875F, -13.5F, 2.25F, -2.875F, -13.5F, 0.25F, 1.5F, 0F, -0.25F, 1.5F, 0F, -0.25F, -2.875F, -13.5F, 0.25F, -2.875F); // Box 3

		gun_5_Model[0][117].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,-12.25F, 2.125F, 0.25F, 6.5F, 2.25F, 0.25F, 6.5F, 2.25F, -0.75F, -12.25F, 2.125F, -0.75F, -10F, -1.875F, 0.25F, 6.5F, -1F, 0.25F, 6.5F, -1F, -0.75F, -10F, -1.875F, -0.75F); // Box 4

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_5_Model[0])
		{
			gunPart.setRotationPoint(17F, -84F, -16F);
		}


		gun_5_Model[1] = new ModelRendererTurbo[0];

		gun_5_Model[2] = new ModelRendererTurbo[12];
		gun_5_Model[2][0] = new ModelRendererTurbo(this, 1599, 685, textureX, textureY); // Box 8
		gun_5_Model[2][1] = new ModelRendererTurbo(this, 1615, 685, textureX, textureY); // Box 13
		gun_5_Model[2][2] = new ModelRendererTurbo(this, 1631, 685, textureX, textureY); // Box 15
		gun_5_Model[2][3] = new ModelRendererTurbo(this, 1647, 685, textureX, textureY); // Box 16
		gun_5_Model[2][4] = new ModelRendererTurbo(this, 1663, 685, textureX, textureY); // Box 17
		gun_5_Model[2][5] = new ModelRendererTurbo(this, 1679, 685, textureX, textureY); // Box 18
		gun_5_Model[2][6] = new ModelRendererTurbo(this, 1695, 685, textureX, textureY); // Box 19
		gun_5_Model[2][7] = new ModelRendererTurbo(this, 1711, 685, textureX, textureY); // Box 19
		gun_5_Model[2][8] = new ModelRendererTurbo(this, 1727, 685, textureX, textureY); // Box 19
		gun_5_Model[2][9] = new ModelRendererTurbo(this, 1743, 685, textureX, textureY); // Box 19
		gun_5_Model[2][10] = new ModelRendererTurbo(this, 1759, 685, textureX, textureY); // Box 19
		gun_5_Model[2][11] = new ModelRendererTurbo(this, 1775, 685, textureX, textureY); // Box 19

		gun_5_Model[2][0].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-2.5F, -4F, 1.75F, -1.25F, -3.5F, 1.75F, -1.25F, -3.5F, -2.5F, -2.5F, -4F, -2.5F, -2.5F, 3.25F, 1.75F, -1.25F, 2.75F, 1.75F, -1.25F, 2.75F, -2.5F, -2.5F, 3.25F, -2.5F); // Box 8

		gun_5_Model[2][1].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -4.75F, 1.75F, -2.5F, -4F, 1.75F, -2.5F, -4F, -2.5F, 0F, -4.75F, -2.5F, 0F, 4F, 1.75F, -2.5F, 3.25F, 1.75F, -2.5F, 3.25F, -2.5F, 0F, 4F, -2.5F); // Box 13

		gun_5_Model[2][2].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-4F, -2.5F, 1.75F, -0.75F, -2.5F, 1.75F, -0.75F, -2.5F, -2.5F, -4F, -2.5F, -2.5F, -3.5F, 2.75F, 1.75F, -1.25F, 2.75F, 1.75F, -1.25F, 2.75F, -2.5F, -3.5F, 2.75F, -2.5F); // Box 15

		gun_5_Model[2][3].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,2.5F, -4F, 1.75F, -5F, -4.75F, 1.75F, -5F, -4.75F, -2.5F, 2.5F, -4F, -2.5F, 2.5F, 3.25F, 1.75F, -5F, 4F, 1.75F, -5F, 4F, -2.5F, 2.5F, 3.25F, -2.5F); // Box 16

		gun_5_Model[2][4].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,3.75F, -3.5F, 1.75F, -7.5F, -4F, 1.75F, -7.5F, -4F, -2.5F, 3.75F, -3.5F, -2.5F, 3.75F, 2.75F, 1.75F, -7.5F, 3.25F, 1.75F, -7.5F, 3.25F, -2.5F, 3.75F, 2.75F, -2.5F); // Box 17

		gun_5_Model[2][5].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-4.075F, -2.25F, 1.75F, -0.675F, -2.25F, 1.75F, -0.675F, -2.25F, -2.5F, -4.125F, -2.25F, -2.5F, -4F, 1.5F, 1.75F, -0.75F, 1.5F, 1.75F, -0.75F, 1.5F, -2.5F, -4F, 1.5F, -2.5F); // Box 18

		gun_5_Model[2][6].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-2.5F, -4F, -1.5F, -1.25F, -3.5F, -1.5F, -1.25F, -3.5F, 0.75F, -2.5F, -4F, 0.75F, -2.5F, 3.25F, -1.5F, -1.25F, 2.75F, -1.5F, -1.25F, 2.75F, 0.75F, -2.5F, 3.25F, 0.75F); // Box 19

		gun_5_Model[2][7].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -4.75F, -1.5F, -2.5F, -4F, -1.5F, -2.5F, -4F, 0.75F, 0F, -4.75F, 0.75F, 0F, 4F, -1.5F, -2.5F, 3.25F, -1.5F, -2.5F, 3.25F, 0.75F, 0F, 4F, 0.75F); // Box 19

		gun_5_Model[2][8].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-4F, -2.5F, -1.5F, -0.75F, -2.5F, -1.5F, -0.75F, -2.5F, 0.75F, -4F, -2.5F, 0.75F, -3.5F, 2.75F, -1.5F, -1.25F, 2.75F, -1.5F, -1.25F, 2.75F, 0.75F, -3.5F, 2.75F, 0.75F); // Box 19

		gun_5_Model[2][9].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,2.5F, -4F, -1.5F, -5F, -4.75F, -1.5F, -5F, -4.75F, 0.75F, 2.5F, -4F, 0.75F, 2.5F, 3.25F, -1.5F, -5F, 4F, -1.5F, -5F, 4F, 0.75F, 2.5F, 3.25F, 0.75F); // Box 19

		gun_5_Model[2][10].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,3.75F, -3.5F, -1.5F, -7.5F, -4F, -1.5F, -7.5F, -4F, 0.75F, 3.75F, -3.5F, 0.75F, 3.75F, 2.75F, -1.5F, -7.5F, 3.25F, -1.5F, -7.5F, 3.25F, 0.75F, 3.75F, 2.75F, 0.75F); // Box 19

		gun_5_Model[2][11].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-4.125F, -2.25F, -1.5F, -0.675F, -2.25F, -1.5F, -0.675F, -2.25F, 0.75F, -4.075F, -2.25F, 0.75F, -4F, 1.5F, -1.5F, -0.75F, 1.5F, -1.5F, -0.75F, 1.5F, 0.75F, -4F, 1.5F, 0.75F); // Box 19

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_5_Model[2])
		{
			gunPart.setRotationPoint(17F, -84F, -16F);
		}


		registerGunModel("LeftBlister", gun_5_Model);

		// Passenger 7
		ModelRendererTurbo[][] gun_6_Model = new ModelRendererTurbo[3][];

		gun_6_Model[0] = new ModelRendererTurbo[118];
		gun_6_Model[0][0] = new ModelRendererTurbo(this, 1471, 661, textureX, textureY); // Box 4
		gun_6_Model[0][1] = new ModelRendererTurbo(this, 1527, 661, textureX, textureY); // Box 7
		gun_6_Model[0][2] = new ModelRendererTurbo(this, 1567, 661, textureX, textureY); // Box 8
		gun_6_Model[0][3] = new ModelRendererTurbo(this, 1607, 661, textureX, textureY); // Box 0
		gun_6_Model[0][4] = new ModelRendererTurbo(this, 1647, 661, textureX, textureY); // Box 1
		gun_6_Model[0][5] = new ModelRendererTurbo(this, 1687, 661, textureX, textureY); // Box 0
		gun_6_Model[0][6] = new ModelRendererTurbo(this, 1695, 661, textureX, textureY); // Box 1
		gun_6_Model[0][7] = new ModelRendererTurbo(this, 1703, 661, textureX, textureY); // Box 2
		gun_6_Model[0][8] = new ModelRendererTurbo(this, 1711, 661, textureX, textureY); // Box 3
		gun_6_Model[0][9] = new ModelRendererTurbo(this, 1719, 661, textureX, textureY); // Box 4
		gun_6_Model[0][10] = new ModelRendererTurbo(this, 1727, 661, textureX, textureY); // Box 5
		gun_6_Model[0][11] = new ModelRendererTurbo(this, 1735, 661, textureX, textureY); // Box 12
		gun_6_Model[0][12] = new ModelRendererTurbo(this, 1743, 661, textureX, textureY); // Box 13
		gun_6_Model[0][13] = new ModelRendererTurbo(this, 1751, 661, textureX, textureY); // Box 14
		gun_6_Model[0][14] = new ModelRendererTurbo(this, 1759, 661, textureX, textureY); // Box 15
		gun_6_Model[0][15] = new ModelRendererTurbo(this, 1767, 661, textureX, textureY); // Box 16
		gun_6_Model[0][16] = new ModelRendererTurbo(this, 1775, 661, textureX, textureY); // Box 17
		gun_6_Model[0][17] = new ModelRendererTurbo(this, 1783, 661, textureX, textureY); // Box 18
		gun_6_Model[0][18] = new ModelRendererTurbo(this, 1791, 661, textureX, textureY); // Box 19
		gun_6_Model[0][19] = new ModelRendererTurbo(this, 1799, 661, textureX, textureY); // Box 20
		gun_6_Model[0][20] = new ModelRendererTurbo(this, 1807, 661, textureX, textureY); // Box 21
		gun_6_Model[0][21] = new ModelRendererTurbo(this, 1815, 661, textureX, textureY); // Box 22
		gun_6_Model[0][22] = new ModelRendererTurbo(this, 1823, 661, textureX, textureY); // Box 23
		gun_6_Model[0][23] = new ModelRendererTurbo(this, 1831, 661, textureX, textureY); // Box 24
		gun_6_Model[0][24] = new ModelRendererTurbo(this, 1839, 661, textureX, textureY); // Box 25
		gun_6_Model[0][25] = new ModelRendererTurbo(this, 1847, 661, textureX, textureY); // Box 26
		gun_6_Model[0][26] = new ModelRendererTurbo(this, 1855, 661, textureX, textureY); // Box 27
		gun_6_Model[0][27] = new ModelRendererTurbo(this, 1863, 661, textureX, textureY); // Box 28
		gun_6_Model[0][28] = new ModelRendererTurbo(this, 1871, 661, textureX, textureY); // Box 29
		gun_6_Model[0][29] = new ModelRendererTurbo(this, 1879, 661, textureX, textureY); // Box 2
		gun_6_Model[0][30] = new ModelRendererTurbo(this, 1471, 669, textureX, textureY); // Box 3
		gun_6_Model[0][31] = new ModelRendererTurbo(this, 1527, 669, textureX, textureY); // Box 4
		gun_6_Model[0][32] = new ModelRendererTurbo(this, 1935, 661, textureX, textureY); // Box 0
		gun_6_Model[0][33] = new ModelRendererTurbo(this, 1943, 661, textureX, textureY); // Box 1
		gun_6_Model[0][34] = new ModelRendererTurbo(this, 1951, 661, textureX, textureY); // Box 2
		gun_6_Model[0][35] = new ModelRendererTurbo(this, 1959, 661, textureX, textureY); // Box 3
		gun_6_Model[0][36] = new ModelRendererTurbo(this, 1967, 661, textureX, textureY); // Box 6
		gun_6_Model[0][37] = new ModelRendererTurbo(this, 1975, 661, textureX, textureY); // Box 8
		gun_6_Model[0][38] = new ModelRendererTurbo(this, 1583, 669, textureX, textureY); // Box 9
		gun_6_Model[0][39] = new ModelRendererTurbo(this, 1591, 669, textureX, textureY); // Box 10
		gun_6_Model[0][40] = new ModelRendererTurbo(this, 1599, 669, textureX, textureY); // Box 11
		gun_6_Model[0][41] = new ModelRendererTurbo(this, 1607, 669, textureX, textureY); // Box 12
		gun_6_Model[0][42] = new ModelRendererTurbo(this, 1615, 669, textureX, textureY); // Box 13
		gun_6_Model[0][43] = new ModelRendererTurbo(this, 1623, 669, textureX, textureY); // Box 14
		gun_6_Model[0][44] = new ModelRendererTurbo(this, 1631, 669, textureX, textureY); // Box 15
		gun_6_Model[0][45] = new ModelRendererTurbo(this, 1639, 669, textureX, textureY); // Box 15
		gun_6_Model[0][46] = new ModelRendererTurbo(this, 1647, 669, textureX, textureY); // Box 15
		gun_6_Model[0][47] = new ModelRendererTurbo(this, 1655, 669, textureX, textureY); // Box 15
		gun_6_Model[0][48] = new ModelRendererTurbo(this, 1663, 669, textureX, textureY); // Box 15
		gun_6_Model[0][49] = new ModelRendererTurbo(this, 1671, 669, textureX, textureY); // Box 15
		gun_6_Model[0][50] = new ModelRendererTurbo(this, 1679, 669, textureX, textureY); // Box 15
		gun_6_Model[0][51] = new ModelRendererTurbo(this, 1687, 669, textureX, textureY); // Box 15
		gun_6_Model[0][52] = new ModelRendererTurbo(this, 1695, 669, textureX, textureY); // Box 23
		gun_6_Model[0][53] = new ModelRendererTurbo(this, 1703, 669, textureX, textureY); // Box 24
		gun_6_Model[0][54] = new ModelRendererTurbo(this, 1711, 669, textureX, textureY); // Box 25
		gun_6_Model[0][55] = new ModelRendererTurbo(this, 1719, 669, textureX, textureY); // Box 26
		gun_6_Model[0][56] = new ModelRendererTurbo(this, 1727, 669, textureX, textureY); // Box 27
		gun_6_Model[0][57] = new ModelRendererTurbo(this, 1735, 669, textureX, textureY); // Box 28
		gun_6_Model[0][58] = new ModelRendererTurbo(this, 1743, 669, textureX, textureY); // Box 29
		gun_6_Model[0][59] = new ModelRendererTurbo(this, 1751, 669, textureX, textureY); // Box 30
		gun_6_Model[0][60] = new ModelRendererTurbo(this, 1759, 669, textureX, textureY); // Box 31
		gun_6_Model[0][61] = new ModelRendererTurbo(this, 1767, 669, textureX, textureY); // Box 32
		gun_6_Model[0][62] = new ModelRendererTurbo(this, 1775, 669, textureX, textureY); // Box 33
		gun_6_Model[0][63] = new ModelRendererTurbo(this, 1783, 669, textureX, textureY); // Box 34
		gun_6_Model[0][64] = new ModelRendererTurbo(this, 1791, 669, textureX, textureY); // Box 35
		gun_6_Model[0][65] = new ModelRendererTurbo(this, 1799, 669, textureX, textureY); // Box 36
		gun_6_Model[0][66] = new ModelRendererTurbo(this, 1807, 669, textureX, textureY); // Box 37
		gun_6_Model[0][67] = new ModelRendererTurbo(this, 1815, 669, textureX, textureY); // Box 38
		gun_6_Model[0][68] = new ModelRendererTurbo(this, 1823, 669, textureX, textureY); // Box 39
		gun_6_Model[0][69] = new ModelRendererTurbo(this, 1831, 669, textureX, textureY); // Box 40
		gun_6_Model[0][70] = new ModelRendererTurbo(this, 1839, 669, textureX, textureY); // Box 41
		gun_6_Model[0][71] = new ModelRendererTurbo(this, 1847, 669, textureX, textureY); // Box 42
		gun_6_Model[0][72] = new ModelRendererTurbo(this, 1855, 669, textureX, textureY); // Box 43
		gun_6_Model[0][73] = new ModelRendererTurbo(this, 1863, 669, textureX, textureY); // Box 44
		gun_6_Model[0][74] = new ModelRendererTurbo(this, 1871, 669, textureX, textureY); // Box 45
		gun_6_Model[0][75] = new ModelRendererTurbo(this, 1911, 669, textureX, textureY); // Box 46
		gun_6_Model[0][76] = new ModelRendererTurbo(this, 1935, 669, textureX, textureY); // Box 47
		gun_6_Model[0][77] = new ModelRendererTurbo(this, 1959, 669, textureX, textureY); // Box 48
		gun_6_Model[0][78] = new ModelRendererTurbo(this, 1471, 677, textureX, textureY); // Box 49
		gun_6_Model[0][79] = new ModelRendererTurbo(this, 1495, 677, textureX, textureY); // Box 0
		gun_6_Model[0][80] = new ModelRendererTurbo(this, 1535, 677, textureX, textureY); // Box 1
		gun_6_Model[0][81] = new ModelRendererTurbo(this, 1575, 677, textureX, textureY); // Box 3
		gun_6_Model[0][82] = new ModelRendererTurbo(this, 1615, 677, textureX, textureY); // Box 4
		gun_6_Model[0][83] = new ModelRendererTurbo(this, 1655, 677, textureX, textureY); // Box 0
		gun_6_Model[0][84] = new ModelRendererTurbo(this, 1679, 677, textureX, textureY); // Box 5
		gun_6_Model[0][85] = new ModelRendererTurbo(this, 1703, 677, textureX, textureY); // Box 0
		gun_6_Model[0][86] = new ModelRendererTurbo(this, 1735, 677, textureX, textureY); // Box 1
		gun_6_Model[0][87] = new ModelRendererTurbo(this, 1767, 677, textureX, textureY); // Box 2
		gun_6_Model[0][88] = new ModelRendererTurbo(this, 1799, 677, textureX, textureY); // Box 3
		gun_6_Model[0][89] = new ModelRendererTurbo(this, 1831, 677, textureX, textureY); // Box 5
		gun_6_Model[0][90] = new ModelRendererTurbo(this, 1847, 677, textureX, textureY); // Box 6
		gun_6_Model[0][91] = new ModelRendererTurbo(this, 1863, 677, textureX, textureY); // Box 9
		gun_6_Model[0][92] = new ModelRendererTurbo(this, 1871, 677, textureX, textureY); // Box 10
		gun_6_Model[0][93] = new ModelRendererTurbo(this, 1879, 677, textureX, textureY); // Box 11
		gun_6_Model[0][94] = new ModelRendererTurbo(this, 1887, 677, textureX, textureY); // Box 12
		gun_6_Model[0][95] = new ModelRendererTurbo(this, 1903, 677, textureX, textureY); // Box 13
		gun_6_Model[0][96] = new ModelRendererTurbo(this, 1927, 677, textureX, textureY); // Box 14
		gun_6_Model[0][97] = new ModelRendererTurbo(this, 1951, 677, textureX, textureY); // Box 15
		gun_6_Model[0][98] = new ModelRendererTurbo(this, 1975, 677, textureX, textureY); // Box 25
		gun_6_Model[0][99] = new ModelRendererTurbo(this, 1791, 685, textureX, textureY); // Box 27
		gun_6_Model[0][100] = new ModelRendererTurbo(this, 1799, 685, textureX, textureY); // Box 28
		gun_6_Model[0][101] = new ModelRendererTurbo(this, 1807, 685, textureX, textureY); // Box 29
		gun_6_Model[0][102] = new ModelRendererTurbo(this, 1815, 685, textureX, textureY); // Box 29
		gun_6_Model[0][103] = new ModelRendererTurbo(this, 1823, 685, textureX, textureY); // Box 31
		gun_6_Model[0][104] = new ModelRendererTurbo(this, 1831, 685, textureX, textureY); // Box 32
		gun_6_Model[0][105] = new ModelRendererTurbo(this, 1839, 685, textureX, textureY); // Box 33
		gun_6_Model[0][106] = new ModelRendererTurbo(this, 1847, 685, textureX, textureY); // Box 34
		gun_6_Model[0][107] = new ModelRendererTurbo(this, 1855, 685, textureX, textureY); // Box 35
		gun_6_Model[0][108] = new ModelRendererTurbo(this, 1863, 685, textureX, textureY); // Box 36
		gun_6_Model[0][109] = new ModelRendererTurbo(this, 1871, 685, textureX, textureY); // Box 37
		gun_6_Model[0][110] = new ModelRendererTurbo(this, 1879, 685, textureX, textureY); // Box 38
		gun_6_Model[0][111] = new ModelRendererTurbo(this, 1887, 685, textureX, textureY); // Box 38
		gun_6_Model[0][112] = new ModelRendererTurbo(this, 1895, 685, textureX, textureY); // Box 38
		gun_6_Model[0][113] = new ModelRendererTurbo(this, 1903, 685, textureX, textureY); // Box 0
		gun_6_Model[0][114] = new ModelRendererTurbo(this, 1943, 685, textureX, textureY); // Box 1
		gun_6_Model[0][115] = new ModelRendererTurbo(this, 1471, 693, textureX, textureY); // Box 2
		gun_6_Model[0][116] = new ModelRendererTurbo(this, 1511, 693, textureX, textureY); // Box 3
		gun_6_Model[0][117] = new ModelRendererTurbo(this, 1551, 693, textureX, textureY); // Box 4

		gun_6_Model[0][0].addShapeBox(0F, 0F, 0F, 24, 1, 1, 0F,-18F, 0F, 0F, 23.125F, 0F, 0F, 23.125F, 0F, -0.625F, -18F, 0F, -0.625F, -18F, -0.625F, 0F, 23.125F, -0.625F, 0F, 23.125F, -0.75F, -0.75F, -18F, -0.75F, -0.75F); // Box 4

		gun_6_Model[0][1].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,-18F, 0.93F, -0.25F, 18F, 0.93F, -0.25F, 18F, 0.75F, -0.25F, -18F, 0.75F, -0.25F, -18F, -1.75F, -0.75F, 18F, -1.75F, -0.75F, 18F, -1.25F, -0.08F, -18F, -1.25F, -0.08F); // Box 7

		gun_6_Model[0][2].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,-18F, -0.75F, -0.75F, 18F, -0.75F, -0.75F, 18F, -0.25F, -0.08F, -18F, -0.25F, -0.08F, -18F, -0.07F, -0.25F, 18F, -0.07F, -0.25F, 18F, -0.25F, -0.25F, -18F, -0.25F, -0.25F); // Box 8

		gun_6_Model[0][3].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,-18F, -0.25F, 0.92F, 18F, -0.25F, 0.92F, 18F, -0.75F, -1.75F, -18F, -0.75F, -1.75F, -18F, -0.25F, 0.75F, 18F, -0.25F, 0.75F, 18F, -0.07F, -1.25F, -18F, -0.07F, -1.25F); // Box 0

		gun_6_Model[0][4].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,-18F, 0.75F, 0.75F, 18F, 0.75F, 0.75F, 18F, 0.93F, -1.25F, -18F, 0.93F, -1.25F, -18F, -1.25F, 0.92F, 18F, -1.25F, 0.92F, 18F, -1.75F, -1.75F, -18F, -1.75F, -1.75F); // Box 1

		gun_6_Model[0][5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-20F, 1F, 0F, 20F, 1F, 0F, 20F, 0.75F, -0.25F, -20F, 0.75F, -0.25F, -20F, -1.75F, -0.75F, 20F, -1.75F, -0.75F, 20F, -1F, 0F, -20F, -1F, 0F); // Box 0

		gun_6_Model[0][6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-23F, 1F, 0F, 23F, 1F, 0F, 23F, 0.75F, -0.25F, -23F, 0.75F, -0.25F, -23F, -1.75F, -0.75F, 23F, -1.75F, -0.75F, 23F, -1F, 0F, -23F, -1F, 0F); // Box 1

		gun_6_Model[0][7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-35F, 1F, 0F, 35F, 1F, 0F, 35F, 0.75F, -0.25F, -35F, 0.75F, -0.25F, -35F, -1.75F, -0.75F, 35F, -1.75F, -0.75F, 35F, -1F, 0F, -35F, -1F, 0F); // Box 2

		gun_6_Model[0][8].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-26F, 1F, 0F, 26F, 1F, 0F, 26F, 0.75F, -0.25F, -26F, 0.75F, -0.25F, -26F, -1.75F, -0.75F, 26F, -1.75F, -0.75F, 26F, -1F, 0F, -26F, -1F, 0F); // Box 3

		gun_6_Model[0][9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-29F, 1F, 0F, 29F, 1F, 0F, 29F, 0.75F, -0.25F, -29F, 0.75F, -0.25F, -29F, -1.75F, -0.75F, 29F, -1.75F, -0.75F, 29F, -1F, 0F, -29F, -1F, 0F); // Box 4

		gun_6_Model[0][10].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-32F, 1F, 0F, 32F, 1F, 0F, 32F, 0.75F, -0.25F, -32F, 0.75F, -0.25F, -32F, -1.75F, -0.75F, 32F, -1.75F, -0.75F, 32F, -1F, 0F, -32F, -1F, 0F); // Box 5

		gun_6_Model[0][11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-32F, 0.75F, 0.75F, 32F, 0.75F, 0.75F, 32F, 1F, -1F, -32F, 1F, -1F, -32F, -1F, 1F, 32F, -1F, 1F, 32F, -1.75F, -1.75F, -32F, -1.75F, -1.75F); // Box 12

		gun_6_Model[0][12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-29F, 0.75F, 0.75F, 29F, 0.75F, 0.75F, 29F, 1F, -1F, -29F, 1F, -1F, -29F, -1F, 1F, 29F, -1F, 1F, 29F, -1.75F, -1.75F, -29F, -1.75F, -1.75F); // Box 13

		gun_6_Model[0][13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-26F, 0.75F, 0.75F, 26F, 0.75F, 0.75F, 26F, 1F, -1F, -26F, 1F, -1F, -26F, -1F, 1F, 26F, -1F, 1F, 26F, -1.75F, -1.75F, -26F, -1.75F, -1.75F); // Box 14

		gun_6_Model[0][14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-35F, 0.75F, 0.75F, 35F, 0.75F, 0.75F, 35F, 1F, -1F, -35F, 1F, -1F, -35F, -1F, 1F, 35F, -1F, 1F, 35F, -1.75F, -1.75F, -35F, -1.75F, -1.75F); // Box 15

		gun_6_Model[0][15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-23F, 0.75F, 0.75F, 23F, 0.75F, 0.75F, 23F, 1F, -1F, -23F, 1F, -1F, -23F, -1F, 1F, 23F, -1F, 1F, 23F, -1.75F, -1.75F, -23F, -1.75F, -1.75F); // Box 16

		gun_6_Model[0][16].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-20F, 0.75F, 0.75F, 20F, 0.75F, 0.75F, 20F, 1F, -1F, -20F, 1F, -1F, -20F, -1F, 1F, 20F, -1F, 1F, 20F, -1.75F, -1.75F, -20F, -1.75F, -1.75F); // Box 17

		gun_6_Model[0][17].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-32F, 0F, 1F, 32F, 0F, 1F, 32F, -0.75F, -1.75F, -32F, -0.75F, -1.75F, -32F, -0.25F, 0.75F, 32F, -0.25F, 0.75F, 32F, 0F, -1F, -32F, 0F, -1F); // Box 18

		gun_6_Model[0][18].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-29F, 0F, 1F, 29F, 0F, 1F, 29F, -0.75F, -1.75F, -29F, -0.75F, -1.75F, -29F, -0.25F, 0.75F, 29F, -0.25F, 0.75F, 29F, 0F, -1F, -29F, 0F, -1F); // Box 19

		gun_6_Model[0][19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-26F, 0F, 1F, 26F, 0F, 1F, 26F, -0.75F, -1.75F, -26F, -0.75F, -1.75F, -26F, -0.25F, 0.75F, 26F, -0.25F, 0.75F, 26F, 0F, -1F, -26F, 0F, -1F); // Box 20

		gun_6_Model[0][20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-35F, 0F, 1F, 35F, 0F, 1F, 35F, -0.75F, -1.75F, -35F, -0.75F, -1.75F, -35F, -0.25F, 0.75F, 35F, -0.25F, 0.75F, 35F, 0F, -1F, -35F, 0F, -1F); // Box 21

		gun_6_Model[0][21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-23F, 0F, 1F, 23F, 0F, 1F, 23F, -0.75F, -1.75F, -23F, -0.75F, -1.75F, -23F, -0.25F, 0.75F, 23F, -0.25F, 0.75F, 23F, 0F, -1F, -23F, 0F, -1F); // Box 22

		gun_6_Model[0][22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-20F, 0F, 1F, 20F, 0F, 1F, 20F, -0.75F, -1.75F, -20F, -0.75F, -1.75F, -20F, -0.25F, 0.75F, 20F, -0.25F, 0.75F, 20F, 0F, -1F, -20F, 0F, -1F); // Box 23

		gun_6_Model[0][23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-20F, -0.75F, -0.75F, 20F, -0.75F, -0.75F, 20F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, 0F, 20F, 0F, 0F, 20F, -0.25F, -0.25F, -20F, -0.25F, -0.25F); // Box 24

		gun_6_Model[0][24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-23F, -0.75F, -0.75F, 23F, -0.75F, -0.75F, 23F, 0F, 0F, -23F, 0F, 0F, -23F, 0F, 0F, 23F, 0F, 0F, 23F, -0.25F, -0.25F, -23F, -0.25F, -0.25F); // Box 25

		gun_6_Model[0][25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-35F, -0.75F, -0.75F, 35F, -0.75F, -0.75F, 35F, 0F, 0F, -35F, 0F, 0F, -35F, 0F, 0F, 35F, 0F, 0F, 35F, -0.25F, -0.25F, -35F, -0.25F, -0.25F); // Box 26

		gun_6_Model[0][26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-26F, -0.75F, -0.75F, 26F, -0.75F, -0.75F, 26F, 0F, 0F, -26F, 0F, 0F, -26F, 0F, 0F, 26F, 0F, 0F, 26F, -0.25F, -0.25F, -26F, -0.25F, -0.25F); // Box 27

		gun_6_Model[0][27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-29F, -0.75F, -0.75F, 29F, -0.75F, -0.75F, 29F, 0F, 0F, -29F, 0F, 0F, -29F, 0F, 0F, 29F, 0F, 0F, 29F, -0.25F, -0.25F, -29F, -0.25F, -0.25F); // Box 28

		gun_6_Model[0][28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-32F, -0.75F, -0.75F, 32F, -0.75F, -0.75F, 32F, 0F, 0F, -32F, 0F, 0F, -32F, 0F, 0F, 32F, 0F, 0F, 32F, -0.25F, -0.25F, -32F, -0.25F, -0.25F); // Box 29

		gun_6_Model[0][29].addShapeBox(0F, 0F, 0F, 24, 1, 1, 0F,-18F, 0F, 0.375F, 23.125F, 0F, 0.375F, 23.125F, 0F, -1F, -18F, 0F, -1F, -18F, -0.75F, 0.25F, 23.125F, -0.75F, 0.25F, 23.125F, -0.625F, -1F, -18F, -0.625F, -1F); // Box 2

		gun_6_Model[0][30].addShapeBox(0F, 0F, 0F, 24, 1, 1, 0F,-18F, 0.25F, 0.25F, 23.125F, 0.25F, 0.25F, 23.125F, 0.375F, -1F, -18F, 0.375F, -1F, -18F, -1F, 0.375F, 23.125F, -1F, 0.375F, 23.125F, -1F, -1F, -18F, -1F, -1F); // Box 3

		gun_6_Model[0][31].addShapeBox(0F, 0F, 0F, 24, 1, 1, 0F,-18F, 0.375F, 0F, 23.125F, 0.375F, 0F, 23.125F, 0.25F, -0.75F, -18F, 0.25F, -0.75F, -18F, -1F, 0F, 23.125F, -1F, 0F, 23.125F, -1F, -0.625F, -18F, -1F, -0.625F); // Box 4

		gun_6_Model[0][32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-36F, 1F, 0F, 36F, 1F, 0F, 36F, 0.75F, -0.25F, -36F, 0.75F, -0.25F, -36F, -1F, 0F, 36F, -1F, 0F, 36F, -1F, 0F, -36F, -1F, 0F); // Box 0

		gun_6_Model[0][33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-36F, 0.75F, 0.75F, 36F, 0.75F, 0.75F, 36F, 1F, -1F, -36F, 1F, -1F, -36F, -1F, 1F, 36F, -1F, 1F, 36F, -1F, -1F, -36F, -1F, -1F); // Box 1

		gun_6_Model[0][34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-36F, 0F, 1F, 36F, 0F, 1F, 36F, 0F, -1F, -36F, 0F, -1F, -36F, -0.25F, 0.75F, 36F, -0.25F, 0.75F, 36F, 0F, -1F, -36F, 0F, -1F); // Box 2

		gun_6_Model[0][35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-36F, 0F, 0F, 36F, 0F, 0F, 36F, 0F, 0F, -36F, 0F, 0F, -36F, 0F, 0F, 36F, 0F, 0F, 36F, -0.25F, -0.25F, -36F, -0.25F, -0.25F); // Box 3

		gun_6_Model[0][36].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-43F, 0F, 0F, 44.25F, 0F, 0F, 44.25F, 0F, -0.375F, -43F, 0F, -0.5F, -43F, -0.5F, 0F, 44.25F, -0.375F, 0F, 44.25F, -0.5F, -0.5F, -43F, -0.625F, -0.625F); // Box 6

		gun_6_Model[0][37].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-46.75F, 0F, 0F, 46F, 0F, 0F, 46F, 0F, -0.375F, -46.75F, 0F, -0.375F, -46.75F, -0.375F, 0F, 46F, -0.375F, 0F, 46F, -0.5F, -0.5F, -46.75F, -0.5F, -0.5F); // Box 8

		gun_6_Model[0][38].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-46.5F, -0.25F, 0F, 45.75F, 0F, 0F, 45.75F, 0F, -0.375F, -46.5F, -0.25F, -0.45F, -46.5F, -0.375F, 0F, 45.75F, -0.375F, 0F, 45.75F, -0.5F, -0.5F, -46.5F, -0.5F, -0.5F); // Box 9

		gun_6_Model[0][39].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-46.25F, 0F, 0F, 45.5F, -0.25F, 0F, 45.5F, -0.25F, -0.45F, -46.25F, 0F, -0.375F, -46.25F, -0.375F, 0F, 45.5F, -0.375F, 0F, 45.5F, -0.5F, -0.5F, -46.25F, -0.5F, -0.5F); // Box 10

		gun_6_Model[0][40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-46F, -0.25F, 0F, 45.25F, 0F, 0F, 45.25F, 0F, -0.375F, -46F, -0.25F, -0.45F, -46F, -0.375F, 0F, 45.25F, -0.375F, 0F, 45.25F, -0.5F, -0.5F, -46F, -0.5F, -0.5F); // Box 11

		gun_6_Model[0][41].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-45.75F, 0F, 0F, 45F, -0.25F, 0F, 45F, -0.25F, -0.45F, -45.75F, 0F, -0.375F, -45.75F, -0.375F, 0F, 45F, -0.375F, 0F, 45F, -0.5F, -0.5F, -45.75F, -0.5F, -0.5F); // Box 12

		gun_6_Model[0][42].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-45.25F, 0F, 0F, 44.5F, -0.25F, 0F, 44.5F, -0.25F, -0.45F, -45.25F, 0F, -0.375F, -45.25F, -0.375F, 0F, 44.5F, -0.375F, 0F, 44.5F, -0.5F, -0.5F, -45.25F, -0.5F, -0.5F); // Box 13

		gun_6_Model[0][43].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-45.5F, -0.25F, 0F, 44.75F, 0F, 0F, 44.75F, 0F, -0.375F, -45.5F, -0.25F, -0.45F, -45.5F, -0.375F, 0F, 44.75F, -0.375F, 0F, 44.75F, -0.5F, -0.5F, -45.5F, -0.5F, -0.5F); // Box 14

		gun_6_Model[0][44].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-43F, 0.5F, 0F, 44.25F, 0.625F, 0F, 44.25F, 0.5F, -0.5F, -43F, 0.375F, -0.625F, -43F, -1F, 0F, 44.25F, -1F, 0F, 44.25F, -1F, -0.375F, -43F, -1F, -0.5F); // Box 15

		gun_6_Model[0][45].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-46.75F, 0.625F, 0F, 46F, 0.625F, 0F, 46F, 0.5F, -0.5F, -46.75F, 0.5F, -0.5F, -46.75F, -1F, 0F, 46F, -1F, 0F, 46F, -1F, -0.375F, -46.75F, -1F, -0.375F); // Box 15

		gun_6_Model[0][46].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-46.5F, 0.625F, 0F, 45.75F, 0.625F, 0F, 45.75F, 0.5F, -0.5F, -46.5F, 0.5F, -0.5F, -46.5F, -1.25F, 0F, 45.75F, -1F, 0F, 45.75F, -1F, -0.375F, -46.5F, -1.25F, -0.45F); // Box 15

		gun_6_Model[0][47].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-46.25F, 0.625F, 0F, 45.5F, 0.625F, 0F, 45.5F, 0.5F, -0.5F, -46.25F, 0.5F, -0.5F, -46.25F, -1F, 0F, 45.5F, -1.25F, 0F, 45.5F, -1.25F, -0.45F, -46.25F, -1F, -0.375F); // Box 15

		gun_6_Model[0][48].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-46F, 0.625F, 0F, 45.25F, 0.625F, 0F, 45.25F, 0.5F, -0.5F, -46F, 0.5F, -0.5F, -46F, -1.25F, 0F, 45.25F, -1F, 0F, 45.25F, -1F, -0.375F, -46F, -1.25F, -0.45F); // Box 15

		gun_6_Model[0][49].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-45.75F, 0.625F, 0F, 45F, 0.625F, 0F, 45F, 0.5F, -0.5F, -45.75F, 0.5F, -0.5F, -45.75F, -1F, 0F, 45F, -1.25F, 0F, 45F, -1.25F, -0.45F, -45.75F, -1F, -0.375F); // Box 15

		gun_6_Model[0][50].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-45.25F, 0.625F, 0F, 44.5F, 0.625F, 0F, 44.5F, 0.5F, -0.5F, -45.25F, 0.5F, -0.5F, -45.25F, -1F, 0F, 44.5F, -1.25F, 0F, 44.5F, -1.25F, -0.45F, -45.25F, -1F, -0.375F); // Box 15

		gun_6_Model[0][51].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-45.5F, 0.625F, 0F, 44.75F, 0.625F, 0F, 44.75F, 0.5F, -0.5F, -45.5F, 0.5F, -0.5F, -45.5F, -1.25F, 0F, 44.75F, -1F, 0F, 44.75F, -1F, -0.375F, -45.5F, -1.25F, -0.45F); // Box 15

		gun_6_Model[0][52].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-43F, 0F, 0.5F, 44.25F, 0F, 0.625F, 44.25F, 0F, -1F, -43F, 0F, -1F, -43F, -0.625F, 0.375F, 44.25F, -0.5F, 0.5F, 44.25F, -0.375F, -1F, -43F, -0.5F, -1F); // Box 23

		gun_6_Model[0][53].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-46.75F, 0F, 0.625F, 46F, 0F, 0.625F, 46F, 0F, -1F, -46.75F, 0F, -1F, -46.75F, -0.5F, 0.5F, 46F, -0.5F, 0.5F, 46F, -0.375F, -1F, -46.75F, -0.375F, -1F); // Box 24

		gun_6_Model[0][54].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-46.5F, -0.25F, 0.55F, 45.75F, 0F, 0.625F, 45.75F, 0F, -1F, -46.5F, -0.25F, -1F, -46.5F, -0.5F, 0.5F, 45.75F, -0.5F, 0.5F, 45.75F, -0.375F, -1F, -46.5F, -0.375F, -1F); // Box 25

		gun_6_Model[0][55].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-46.25F, 0F, 0.625F, 45.5F, -0.25F, 0.55F, 45.5F, -0.25F, -1F, -46.25F, 0F, -1F, -46.25F, -0.5F, 0.5F, 45.5F, -0.5F, 0.5F, 45.5F, -0.375F, -1F, -46.25F, -0.375F, -1F); // Box 26

		gun_6_Model[0][56].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-46F, -0.25F, 0.55F, 45.25F, 0F, 0.625F, 45.25F, 0F, -1F, -46F, -0.25F, -1F, -46F, -0.5F, 0.5F, 45.25F, -0.5F, 0.5F, 45.25F, -0.375F, -1F, -46F, -0.375F, -1F); // Box 27

		gun_6_Model[0][57].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-45.75F, 0F, 0.625F, 45F, -0.25F, 0.55F, 45F, -0.25F, -1F, -45.75F, 0F, -1F, -45.75F, -0.5F, 0.5F, 45F, -0.5F, 0.5F, 45F, -0.375F, -1F, -45.75F, -0.375F, -1F); // Box 28

		gun_6_Model[0][58].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-45.25F, 0F, 0.625F, 44.5F, -0.25F, 0.55F, 44.5F, -0.25F, -1F, -45.25F, 0F, -1F, -45.25F, -0.5F, 0.5F, 44.5F, -0.5F, 0.5F, 44.5F, -0.375F, -1F, -45.25F, -0.375F, -1F); // Box 29

		gun_6_Model[0][59].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-45.5F, -0.25F, 0.55F, 44.75F, 0F, 0.625F, 44.75F, 0F, -1F, -45.5F, -0.25F, -1F, -45.5F, -0.5F, 0.5F, 44.75F, -0.5F, 0.5F, 44.75F, -0.375F, -1F, -45.5F, -0.375F, -1F); // Box 30

		gun_6_Model[0][60].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-43F, 0.375F, 0.375F, 44.25F, 0.5F, 0.5F, 44.25F, 0.625F, -1F, -43F, 0.5F, -1F, -43F, -1F, 0.5F, 44.25F, -1F, 0.625F, 44.25F, -1F, -1F, -43F, -1F, -1F); // Box 31

		gun_6_Model[0][61].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-46.75F, 0.5F, 0.5F, 46F, 0.5F, 0.5F, 46F, 0.625F, -1F, -46.75F, 0.625F, -1F, -46.75F, -1F, 0.625F, 46F, -1F, 0.625F, 46F, -1F, -1F, -46.75F, -1F, -1F); // Box 32

		gun_6_Model[0][62].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-46.5F, 0.5F, 0.5F, 45.75F, 0.5F, 0.5F, 45.75F, 0.625F, -1F, -46.5F, 0.625F, -1F, -46.5F, -1.25F, 0.55F, 45.75F, -1F, 0.625F, 45.75F, -1F, -1F, -46.5F, -1.25F, -1F); // Box 33

		gun_6_Model[0][63].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-46.25F, 0.5F, 0.5F, 45.5F, 0.5F, 0.5F, 45.5F, 0.625F, -1F, -46.25F, 0.625F, -1F, -46.25F, -1F, 0.625F, 45.5F, -1.25F, 0.55F, 45.5F, -1.25F, -1F, -46.25F, -1F, -1F); // Box 34

		gun_6_Model[0][64].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-46F, 0.5F, 0.5F, 45.25F, 0.5F, 0.5F, 45.25F, 0.625F, -1F, -46F, 0.625F, -1F, -46F, -1.25F, 0.55F, 45.25F, -1F, 0.625F, 45.25F, -1F, -1F, -46F, -1.25F, -1F); // Box 35

		gun_6_Model[0][65].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-45.75F, 0.5F, 0.5F, 45F, 0.5F, 0.5F, 45F, 0.625F, -1F, -45.75F, 0.625F, -1F, -45.75F, -1F, 0.625F, 45F, -1.25F, 0.55F, 45F, -1.25F, -1F, -45.75F, -1F, -1F); // Box 36

		gun_6_Model[0][66].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-45.25F, 0.5F, 0.5F, 44.5F, 0.5F, 0.5F, 44.5F, 0.625F, -1F, -45.25F, 0.625F, -1F, -45.25F, -1F, 0.625F, 44.5F, -1.25F, 0.55F, 44.5F, -1.25F, -1F, -45.25F, -1F, -1F); // Box 37

		gun_6_Model[0][67].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-45.5F, 0.5F, 0.5F, 44.75F, 0.5F, 0.5F, 44.75F, 0.625F, -1F, -45.5F, 0.625F, -1F, -45.5F, -1.25F, 0.55F, 44.75F, -1F, 0.625F, 44.75F, -1F, -1F, -45.5F, -1.25F, -1F); // Box 38

		gun_6_Model[0][68].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-36.25F, 1.5F, 0F, 35.75F, 1.5F, 0F, 35.75F, 1.5F, -0.875F, -36.25F, 1.5F, -0.875F, -36.25F, -1F, 0F, 35.75F, -1F, 0F, 35.75F, -1F, -0.875F, -36.25F, -1F, -0.875F); // Box 39

		gun_6_Model[0][69].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-36.25F, 1.5F, 0.125F, 35.75F, 1.5F, 0.125F, 35.75F, 1.5F, -1F, -36.25F, 1.5F, -1F, -36.25F, -1F, 0.125F, 35.75F, -1F, 0.125F, 35.75F, -1F, -1F, -36.25F, -1F, -1F); // Box 40

		gun_6_Model[0][70].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-36.25F, 1.5F, 0F, 35.75F, 1.5F, 0F, 35.75F, 1.625F, -0.75F, -36.25F, 1.625F, -0.75F, -36.25F, -2.375F, 0F, 35.75F, -2.375F, 0F, 35.75F, -2.5F, -0.75F, -36.25F, -2.5F, -0.75F); // Box 41

		gun_6_Model[0][71].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-36.25F, 1.625F, 0.25F, 35.75F, 1.625F, 0.25F, 35.75F, 1.5F, -1F, -36.25F, 1.5F, -1F, -36.25F, -2.5F, 0.25F, 35.75F, -2.5F, 0.25F, 35.75F, -2.375F, -1F, -36.25F, -2.375F, -1F); // Box 42

		gun_6_Model[0][72].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-36.25F, 2F, -0.25F, 35.75F, 2F, -0.25F, 35.75F, 1.875F, -0.625F, -36.25F, 1.875F, -0.625F, -36.25F, -2.5F, -0.25F, 35.75F, -2.5F, -0.25F, 35.75F, -2.625F, -0.625F, -36.25F, -2.625F, -0.625F); // Box 43

		gun_6_Model[0][73].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-36.25F, 1.875F, 0.375F, 35.75F, 1.875F, 0.375F, 35.75F, 2F, -1.25F, -36.25F, 2F, -1.25F, -36.25F, -2.625F, 0.375F, 35.75F, -2.625F, 0.375F, 35.75F, -2.5F, -1.25F, -36.25F, -2.5F, -1.25F); // Box 44

		gun_6_Model[0][74].addShapeBox(0F, 0F, 0F, 14, 2, 2, 0F,0F, 1F, 1.5F, -4.75F, 1.75F, 1.5F, -4.75F, 1.75F, -0.5F, 0F, 1F, -0.5F, 0F, 0.25F, 1.5F, -4.75F, 0.25F, 1.5F, -4.75F, 0.25F, -0.5F, 0F, 0.25F, -0.5F); // Box 45

		gun_6_Model[0][75].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,-14F, 0F, 0F, 11F, 0F, 0F, 11F, 0F, 0F, -14F, 0F, 0.5F, -14F, 0.5F, 0F, 11F, 0F, 0F, 11F, -0.25F, -0.25F, -14F, 0.125F, 0.125F); // Box 46

		gun_6_Model[0][76].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,-14F, 1.5F, 0F, 11F, 1F, 0F, 11F, 0.75F, -0.25F, -14F, 1.125F, 0.125F, -14F, -1F, 0F, 11F, -1F, 0F, 11F, -1F, 0F, -14F, -1F, 0.5F); // Box 47

		gun_6_Model[0][77].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,-14F, 1.125F, 1.125F, 11F, 0.75F, 0.75F, 11F, 1F, -1F, -14F, 1.5F, -1F, -14F, -1F, 1.5F, 11F, -1F, 1F, 11F, -1F, -1F, -14F, -1F, -1F); // Box 48

		gun_6_Model[0][78].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,-14F, 0F, 1.5F, 11F, 0F, 1F, 11F, 0F, -1F, -14F, 0F, -1F, -14F, 0.125F, 1.125F, 11F, -0.25F, 0.75F, 11F, 0F, -1F, -14F, 0.5F, -1F); // Box 49

		gun_6_Model[0][79].addShapeBox(0F, 0F, 0F, 14, 2, 2, 0F,-13.5F, 2.25F, -0.875F, 0F, 1.5F, -0.875F, 0F, 1.5F, -0.5F, -13.5F, 2.25F, -0.5F, -13.5F, 0.25F, -0.875F, 0F, -0.25F, -0.875F, 0F, -0.25F, -0.5F, -13.5F, 0.25F, -0.5F); // Box 0

		gun_6_Model[0][80].addShapeBox(0F, 0F, 0F, 14, 2, 2, 0F,-9.25F, 2.25F, 1.5F, -0.5F, 2.25F, 1.5F, -0.5F, 2.25F, -2.875F, -9.25F, 2.25F, -2.875F, -9.25F, 0.25F, 1.5F, -0.5F, 0.25F, 1.5F, -0.5F, 0.25F, -2.625F, -9.25F, 0.25F, -2.625F); // Box 1

		gun_6_Model[0][81].addShapeBox(0F, 0F, 0F, 14, 2, 2, 0F,0F, 1.25F, -0.875F, -4.75F, 2.25F, -0.875F, -4.75F, 2.25F, -0.5F, 0F, 1.25F, -0.5F, 0F, 0.25F, -0.875F, -4.75F, 0.25F, -0.875F, -4.75F, 0.25F, -0.5F, 0F, 0.25F, -0.5F); // Box 3

		gun_6_Model[0][82].addShapeBox(0F, 0F, 0F, 14, 2, 2, 0F,0F, 1.25F, 1.5F, -4.75F, 2.25F, 1.5F, -4.75F, 2.25F, -2.875F, 0F, 1.25F, -2.875F, 0F, 0.25F, 1.5F, -4.75F, 0.25F, 1.5F, -4.75F, 0.25F, -2.875F, 0F, 0.25F, -2.875F); // Box 4

		gun_6_Model[0][83].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,-13.5F, 2.25F, 0.25F, 10.25F, 1.375F, 0.25F, 10.25F, 1.375F, -0.75F, -13.5F, 2.25F, -0.75F, -13.5F, -1F, 0.25F, 11F, -1.875F, 0.25F, 11F, -1.875F, -0.75F, -13.5F, -1F, -0.75F); // Box 0

		gun_6_Model[0][84].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,-2.7F, -1.25F, 2.05F, -2.7F, -1.25F, 2.05F, -2.7F, -1.25F, -3.5F, -2.7F, -1.25F, -3.5F, -2.7F, 1F, 2.05F, -2.7F, 1F, 2.05F, -2.7F, 1F, -3.5F, -2.7F, 1F, -3.5F); // Box 5

		gun_6_Model[0][85].addShapeBox(0F, 0F, 0F, 13, 2, 2, 0F,-8F, 2.75F, -1.5F, 0F, 2.25F, -2F, 0F, 2.25F, 2F, -8F, 2.75F, 2.5F, -8F, -2.75F, -1.5F, 0F, -3.25F, -2F, 0F, -3.25F, 2F, -8F, -2.75F, 2.5F); // Box 0

		gun_6_Model[0][86].addShapeBox(0F, 0F, 0F, 13, 2, 2, 0F,-8F, 3.25F, -2F, 0F, 2.75F, -2.5F, 0F, 2.75F, 1.5F, -8F, 3.25F, 2F, -8F, -4.75F, -1.5F, 0F, -4.25F, -2F, 0F, -4.25F, 2F, -8F, -4.75F, 2.5F); // Box 1

		gun_6_Model[0][87].addShapeBox(0F, 0F, 0F, 13, 2, 2, 0F,-8F, 0.75F, -1.5F, 0F, 1.25F, -2F, 0F, 1.25F, 2F, -8F, 0.75F, 2.5F, -8F, -2.25F, -2F, 0F, -2.75F, -2.5F, 0F, -2.75F, 1.5F, -8F, -2.25F, 2F); // Box 2

		gun_6_Model[0][88].addShapeBox(0F, 0F, 0F, 13, 2, 2, 0F,-8F, 0.875F, -1.5F, 0F, 1.375F, -1.5F, 0F, 1.375F, 2F, -8F, 0.875F, 2.5F, -8F, -2.25F, -1.5F, 0F, -2.75F, -1.5F, 0F, -2.75F, 1.5F, -8F, -2.25F, 2F); // Box 3

		gun_6_Model[0][89].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 1.25F, -0.875F, -4.75F, -0.125F, -0.875F, -4.75F, -0.125F, -0.5F, 0F, 1.25F, -0.5F, 0F, 0.25F, -0.875F, -4.75F, -0.875F, -0.875F, -4.75F, -0.875F, -0.5F, 0F, 0.25F, -0.5F); // Box 5

		gun_6_Model[0][90].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 1.25F, 1.5F, -4.75F, -0.125F, 1.5F, -4.75F, -0.125F, -2.875F, 0F, 1.25F, -2.875F, 0F, 0.25F, 1.5F, -4.75F, -0.875F, 1.5F, -4.75F, -0.875F, -2.875F, 0F, 0.25F, -2.875F); // Box 6

		gun_6_Model[0][91].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.375F, -0.125F, 3.75F, -0.625F, -0.125F, 3.75F, -0.625F, -0.125F, 2.75F, 0.375F, -0.125F, 2.75F, 0.125F, -0.625F, 3.75F, -0.875F, -0.625F, 3.75F, -0.875F, -0.625F, 2.75F, 0.125F, -0.625F, 2.75F); // Box 9

		gun_6_Model[0][92].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.375F, 0.125F, 3.75F, -0.625F, 0.125F, 3.75F, -0.625F, 0.125F, 2.75F, 0.375F, 0.125F, 2.75F, 0.375F, -0.875F, 3.75F, -0.625F, -0.875F, 3.75F, -0.625F, -0.875F, 2.75F, 0.375F, -0.875F, 2.75F); // Box 10

		gun_6_Model[0][93].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.125F, 0.375F, 3.75F, -0.875F, 0.375F, 3.75F, -0.875F, 0.375F, 2.75F, 0.125F, 0.375F, 2.75F, 0.375F, -1.125F, 3.75F, -0.625F, -1.125F, 3.75F, -0.625F, -1.125F, 2.75F, 0.375F, -1.125F, 2.75F); // Box 11

		gun_6_Model[0][94].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 1F, 1.5F, -4.75F, -0.125F, 1.5F, -4.75F, -0.125F, -0.5F, 0F, 1F, -0.5F, 0F, 0.25F, 1.5F, -4.75F, -0.875F, 1.5F, -4.75F, -0.875F, -0.5F, 0F, 0.25F, -0.5F); // Box 12

		gun_6_Model[0][95].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,-3.575F, 2.65F, 1.85F, -2.025F, 2.5F, 1.85F, -2.025F, 2.5F, -3.65F, -3.575F, 2.65F, -3.65F, -2.775F, 0.25F, 1.85F, -2.775F, 0.5F, 1.85F, -2.775F, 0.5F, -3.65F, -2.775F, 0.25F, -3.65F); // Box 13

		gun_6_Model[0][96].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,-3.675F, 2.6F, 1.975F, -2.125F, 2.52F, 1.975F, -2.025F, 2.5F, -3.85F, -3.575F, 2.65F, -3.85F, -2.875F, 0.25F, 1.975F, -2.875F, 0.5F, 1.975F, -2.775F, 0.5F, -3.85F, -2.775F, 0.25F, -3.85F); // Box 14

		gun_6_Model[0][97].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,-3.575F, 2.65F, 1.65F, -2.025F, 2.5F, 1.65F, -2.125F, 2.52F, -3.525F, -3.675F, 2.6F, -3.525F, -2.775F, 0.25F, 1.65F, -2.775F, 0.5F, 1.65F, -2.875F, 0.5F, -3.525F, -2.875F, 0.25F, -3.525F); // Box 15

		gun_6_Model[0][98].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,1.25F, 0.5F, -1.5F, -1.75F, -0.125F, -1F, -1.75F, -0.125F, -0.5F, 1.25F, 0.5F, 0F, 1.25F, -2.25F, -1.5F, -1.75F, -1.625F, -1F, -1.75F, -1.625F, -0.5F, 1.25F, -2.25F, 0F); // Box 25

		gun_6_Model[0][99].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-4.125F, -1.75F, 1.75F, 3.375F, -1.75F, 1.75F, 3.375F, -1.75F, -0.25F, -4.125F, -1.75F, -0.25F, -4.075F, 1.25F, 1.75F, 3.325F, 1.25F, 1.75F, 3.325F, 1.25F, -0.25F, -4.075F, 1.25F, -0.25F); // Box 27

		gun_6_Model[0][100].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,1.25F, -1.5F, -1.5F, -1.75F, -0.875F, -1F, -1.75F, -0.875F, -0.5F, 1.25F, -1.5F, 0F, 1.25F, -0.25F, -1.5F, -1.75F, -0.875F, -1F, -1.75F, -0.875F, -0.5F, 1.25F, -0.25F, 0F); // Box 28

		gun_6_Model[0][101].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,1.25F, 0.5F, 2F, -1.75F, -0.125F, 1.5F, -1.75F, -0.125F, -3F, 1.25F, 0.5F, -3.5F, 1.25F, -2.25F, 2F, -1.75F, -1.625F, 1.5F, -1.75F, -1.625F, -3F, 1.25F, -2.25F, -3.5F); // Box 29

		gun_6_Model[0][102].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,1.25F, -1.5F, 2F, -1.75F, -0.875F, 1.5F, -1.75F, -0.875F, -3F, 1.25F, -1.5F, -3.5F, 1.25F, -0.25F, 2F, -1.75F, -0.875F, 1.5F, -1.75F, -0.875F, -3F, 1.25F, -0.25F, -3.5F); // Box 29

		gun_6_Model[0][103].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,2.5F, 0.375F, -2F, -3F, 0.325F, -1.95F, -3.125F, 0.325F, 0.125F, 2.375F, 0.375F, 0.125F, 2.5F, -0.375F, -2F, -3F, -0.425F, -1.95F, -3.125F, -0.425F, 0.125F, 2.375F, -0.375F, 0.125F); // Box 31

		gun_6_Model[0][104].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,2.5F, 0.625F, -1.625F, -2.25F, 0.5F, -1.5F, -2.25F, 0.5F, 0F, 2.5F, 0.625F, 0.125F, 2.5F, -2.375F, -1.625F, -2.25F, -2.25F, -1.5F, -2.25F, -2.25F, 0F, 2.5F, -2.375F, 0.125F); // Box 32

		gun_6_Model[0][105].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,2.5F, 0.625F, 2.125F, -2.25F, 0.5F, 2F, -2.25F, 0.5F, -3.5F, 2.5F, 0.625F, -3.625F, 2.5F, -2.375F, 2.125F, -2.25F, -2.25F, 2F, -2.25F, -2.25F, -3.5F, 2.5F, -2.375F, -3.625F); // Box 33

		gun_6_Model[0][106].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,2.5F, -1.625F, -1.625F, -2.25F, -1.5F, -1.5F, -2.25F, -1.5F, 0F, 2.5F, -1.625F, 0.125F, 2.5F, -0.125F, -1.625F, -2.25F, -0.25F, -1.5F, -2.25F, -0.25F, 0F, 2.5F, -0.125F, 0.125F); // Box 34

		gun_6_Model[0][107].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,2.5F, -1.625F, 2.125F, -2.25F, -1.5F, 2F, -2.25F, -1.5F, -3.5F, 2.5F, -1.625F, -3.625F, 2.5F, -0.125F, 2.125F, -2.25F, -0.25F, 2F, -2.25F, -0.25F, -3.5F, 2.5F, -0.125F, -3.625F); // Box 35

		gun_6_Model[0][108].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,2.5F, 0.375F, -1.75F, -3F, 0.325F, -1.7F, -3F, 0.325F, 0F, 2.5F, 0.375F, 0F, 2.5F, -0.375F, -1.75F, -3F, -0.425F, -1.7F, -3F, -0.425F, 0F, 2.5F, -0.375F, 0F); // Box 36

		gun_6_Model[0][109].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,2.375F, 0.375F, -1.625F, -3.125F, 0.325F, -1.575F, -3F, 0.325F, -0.25F, 2.5F, 0.375F, -0.25F, 2.375F, -0.375F, -1.625F, -3.125F, -0.425F, -1.575F, -3F, -0.425F, -0.25F, 2.5F, -0.375F, -0.25F); // Box 37

		gun_6_Model[0][110].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,2.375F, 0.375F, 2.125F, -3.125F, 0.325F, 2.125F, -3F, 0.325F, -3.95F, 2.5F, 0.375F, -4F, 2.375F, -0.375F, 2.125F, -3.125F, -0.425F, 2.125F, -3F, -0.425F, -3.95F, 2.5F, -0.375F, -4F); // Box 38

		gun_6_Model[0][111].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,2.5F, 0.375F, 2F, -3F, 0.325F, 2F, -3F, 0.325F, -3.7F, 2.5F, 0.375F, -3.75F, 2.5F, -0.375F, 2F, -3F, -0.425F, 2F, -3F, -0.425F, -3.7F, 2.5F, -0.375F, -3.75F); // Box 38

		gun_6_Model[0][112].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,2.5F, 0.375F, 1.75F, -3F, 0.325F, 1.75F, -3.125F, 0.325F, -3.575F, 2.375F, 0.375F, -3.625F, 2.5F, -0.375F, 1.75F, -3F, -0.425F, 1.75F, -3.125F, -0.425F, -3.575F, 2.375F, -0.375F, -3.625F); // Box 38

		gun_6_Model[0][113].addShapeBox(0F, 0F, 0F, 14, 2, 2, 0F,-9.25F, 1.75F, 1.5F, -0.5F, 1.75F, 1.5F, -0.5F, 1.75F, -0.5F, -9.25F, 1.75F, -0.5F, -9.25F, 0.25F, 1.5F, -0.5F, 0.25F, 1.5F, -0.5F, 0.25F, -0.5F, -9.25F, 0.25F, -0.5F); // Box 0

		gun_6_Model[0][114].addShapeBox(0F, 0F, 0F, 14, 2, 2, 0F,-9.25F, 2.25F, -0.875F, -0.5F, 2.25F, -0.875F, -0.5F, 2.25F, -0.5F, -9.25F, 2.25F, -0.5F, -9.25F, 0.25F, -0.875F, -0.5F, 0.25F, -0.875F, -0.5F, 0.25F, -0.5F, -9.25F, 0.25F, -0.5F); // Box 1

		gun_6_Model[0][115].addShapeBox(0F, 0F, 0F, 14, 2, 2, 0F,-13.5F, 1.75F, 1.5F, 0F, 1.5F, 1.5F, 0F, 1.5F, -0.5F, -13.5F, 1.75F, -0.5F, -13.5F, 0.25F, 1.5F, 0F, -0.25F, 1.5F, 0F, -0.25F, -0.5F, -13.5F, 0.25F, -0.5F); // Box 2

		gun_6_Model[0][116].addShapeBox(0F, 0F, 0F, 14, 2, 2, 0F,-13.5F, 2.25F, 1.5F, 0F, 1.5F, 1.5F, 0F, 1.5F, -2.875F, -13.5F, 2.25F, -2.875F, -13.5F, 0.25F, 1.5F, 0F, -0.25F, 1.5F, 0F, -0.25F, -2.875F, -13.5F, 0.25F, -2.875F); // Box 3

		gun_6_Model[0][117].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,-12.25F, 2.125F, 0.25F, 6.5F, 2.25F, 0.25F, 6.5F, 2.25F, -0.75F, -12.25F, 2.125F, -0.75F, -10F, -1.875F, 0.25F, 6.5F, -1F, 0.25F, 6.5F, -1F, -0.75F, -10F, -1.875F, -0.75F); // Box 4

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_6_Model[0])
		{
			gunPart.setRotationPoint(17F, -84F, 16F);
		}


		gun_6_Model[1] = new ModelRendererTurbo[0];

		gun_6_Model[2] = new ModelRendererTurbo[12];
		gun_6_Model[2][0] = new ModelRendererTurbo(this, 1599, 685, textureX, textureY); // Box 8
		gun_6_Model[2][1] = new ModelRendererTurbo(this, 1615, 685, textureX, textureY); // Box 13
		gun_6_Model[2][2] = new ModelRendererTurbo(this, 1631, 685, textureX, textureY); // Box 15
		gun_6_Model[2][3] = new ModelRendererTurbo(this, 1647, 685, textureX, textureY); // Box 16
		gun_6_Model[2][4] = new ModelRendererTurbo(this, 1663, 685, textureX, textureY); // Box 17
		gun_6_Model[2][5] = new ModelRendererTurbo(this, 1679, 685, textureX, textureY); // Box 18
		gun_6_Model[2][6] = new ModelRendererTurbo(this, 1695, 685, textureX, textureY); // Box 19
		gun_6_Model[2][7] = new ModelRendererTurbo(this, 1711, 685, textureX, textureY); // Box 19
		gun_6_Model[2][8] = new ModelRendererTurbo(this, 1727, 685, textureX, textureY); // Box 19
		gun_6_Model[2][9] = new ModelRendererTurbo(this, 1743, 685, textureX, textureY); // Box 19
		gun_6_Model[2][10] = new ModelRendererTurbo(this, 1759, 685, textureX, textureY); // Box 19
		gun_6_Model[2][11] = new ModelRendererTurbo(this, 1775, 685, textureX, textureY); // Box 19

		gun_6_Model[2][0].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-2.5F, -4F, 1.75F, -1.25F, -3.5F, 1.75F, -1.25F, -3.5F, -2.5F, -2.5F, -4F, -2.5F, -2.5F, 3.25F, 1.75F, -1.25F, 2.75F, 1.75F, -1.25F, 2.75F, -2.5F, -2.5F, 3.25F, -2.5F); // Box 8

		gun_6_Model[2][1].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -4.75F, 1.75F, -2.5F, -4F, 1.75F, -2.5F, -4F, -2.5F, 0F, -4.75F, -2.5F, 0F, 4F, 1.75F, -2.5F, 3.25F, 1.75F, -2.5F, 3.25F, -2.5F, 0F, 4F, -2.5F); // Box 13

		gun_6_Model[2][2].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-4F, -2.5F, 1.75F, -0.75F, -2.5F, 1.75F, -0.75F, -2.5F, -2.5F, -4F, -2.5F, -2.5F, -3.5F, 2.75F, 1.75F, -1.25F, 2.75F, 1.75F, -1.25F, 2.75F, -2.5F, -3.5F, 2.75F, -2.5F); // Box 15

		gun_6_Model[2][3].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,2.5F, -4F, 1.75F, -5F, -4.75F, 1.75F, -5F, -4.75F, -2.5F, 2.5F, -4F, -2.5F, 2.5F, 3.25F, 1.75F, -5F, 4F, 1.75F, -5F, 4F, -2.5F, 2.5F, 3.25F, -2.5F); // Box 16

		gun_6_Model[2][4].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,3.75F, -3.5F, 1.75F, -7.5F, -4F, 1.75F, -7.5F, -4F, -2.5F, 3.75F, -3.5F, -2.5F, 3.75F, 2.75F, 1.75F, -7.5F, 3.25F, 1.75F, -7.5F, 3.25F, -2.5F, 3.75F, 2.75F, -2.5F); // Box 17

		gun_6_Model[2][5].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-4.075F, -2.25F, 1.75F, -0.675F, -2.25F, 1.75F, -0.675F, -2.25F, -2.5F, -4.125F, -2.25F, -2.5F, -4F, 1.5F, 1.75F, -0.75F, 1.5F, 1.75F, -0.75F, 1.5F, -2.5F, -4F, 1.5F, -2.5F); // Box 18

		gun_6_Model[2][6].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-2.5F, -4F, -1.5F, -1.25F, -3.5F, -1.5F, -1.25F, -3.5F, 0.75F, -2.5F, -4F, 0.75F, -2.5F, 3.25F, -1.5F, -1.25F, 2.75F, -1.5F, -1.25F, 2.75F, 0.75F, -2.5F, 3.25F, 0.75F); // Box 19

		gun_6_Model[2][7].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -4.75F, -1.5F, -2.5F, -4F, -1.5F, -2.5F, -4F, 0.75F, 0F, -4.75F, 0.75F, 0F, 4F, -1.5F, -2.5F, 3.25F, -1.5F, -2.5F, 3.25F, 0.75F, 0F, 4F, 0.75F); // Box 19

		gun_6_Model[2][8].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-4F, -2.5F, -1.5F, -0.75F, -2.5F, -1.5F, -0.75F, -2.5F, 0.75F, -4F, -2.5F, 0.75F, -3.5F, 2.75F, -1.5F, -1.25F, 2.75F, -1.5F, -1.25F, 2.75F, 0.75F, -3.5F, 2.75F, 0.75F); // Box 19

		gun_6_Model[2][9].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,2.5F, -4F, -1.5F, -5F, -4.75F, -1.5F, -5F, -4.75F, 0.75F, 2.5F, -4F, 0.75F, 2.5F, 3.25F, -1.5F, -5F, 4F, -1.5F, -5F, 4F, 0.75F, 2.5F, 3.25F, 0.75F); // Box 19

		gun_6_Model[2][10].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,3.75F, -3.5F, -1.5F, -7.5F, -4F, -1.5F, -7.5F, -4F, 0.75F, 3.75F, -3.5F, 0.75F, 3.75F, 2.75F, -1.5F, -7.5F, 3.25F, -1.5F, -7.5F, 3.25F, 0.75F, 3.75F, 2.75F, 0.75F); // Box 19

		gun_6_Model[2][11].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-4.125F, -2.25F, -1.5F, -0.675F, -2.25F, -1.5F, -0.675F, -2.25F, 0.75F, -4.075F, -2.25F, 0.75F, -4F, 1.5F, -1.5F, -0.75F, 1.5F, -1.5F, -0.75F, 1.5F, 0.75F, -4F, 1.5F, 0.75F); // Box 19

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_6_Model[2])
		{
			gunPart.setRotationPoint(17F, -84F, 16F);
		}


		registerGunModel("RightBlister", gun_6_Model);
	}
}