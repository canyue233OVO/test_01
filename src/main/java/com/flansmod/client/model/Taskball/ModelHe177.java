//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: He177
// Model Creator: 
// Created on: 02.06.2023 - 22:43:11
// Last changed on: 02.06.2023 - 22:43:11

package com.flansmod.client.model.Taskball; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelHe177 extends ModelPlane //Same as Filename
{
	int textureX = 2048;
	int textureY = 1024;

	public ModelHe177() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[327];
		leftWingModel = new ModelRendererTurbo[46];
		tailWheelModel = new ModelRendererTurbo[8];
		planeModeParts = new ModelRendererTurbo[54];

		initbodyModel_1();
		initleftWingModel_1();
		inittailWheelModel_1();
		initplaneModeParts_1();

		initPropeller();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 697, 1, textureX, textureY); // Box 4
		bodyModel[4] = new ModelRendererTurbo(this, 913, 1, textureX, textureY); // Box 5
		bodyModel[5] = new ModelRendererTurbo(this, 1033, 1, textureX, textureY); // Box 6
		bodyModel[6] = new ModelRendererTurbo(this, 1145, 1, textureX, textureY); // Box 7
		bodyModel[7] = new ModelRendererTurbo(this, 1265, 1, textureX, textureY); // Box 8
		bodyModel[8] = new ModelRendererTurbo(this, 1385, 1, textureX, textureY); // Box 9
		bodyModel[9] = new ModelRendererTurbo(this, 698, 472, textureX, textureY); // Box 10
		bodyModel[10] = new ModelRendererTurbo(this, 785, 472, textureX, textureY); // Box 11
		bodyModel[11] = new ModelRendererTurbo(this, 878, 472, textureX, textureY); // Box 12
		bodyModel[12] = new ModelRendererTurbo(this, 611, 472, textureX, textureY); // Box 13
		bodyModel[13] = new ModelRendererTurbo(this, 516, 472, textureX, textureY); // Box 14
		bodyModel[14] = new ModelRendererTurbo(this, 120, 472, textureX, textureY); // Box 15
		bodyModel[15] = new ModelRendererTurbo(this, 66, 472, textureX, textureY); // Box 16
		bodyModel[16] = new ModelRendererTurbo(this, 165, 472, textureX, textureY); // Box 17
		bodyModel[17] = new ModelRendererTurbo(this, 516, 538, textureX, textureY); // Box 18
		bodyModel[18] = new ModelRendererTurbo(this, 843, 538, textureX, textureY); // Box 19
		bodyModel[19] = new ModelRendererTurbo(this, 678, 538, textureX, textureY); // Box 20
		bodyModel[20] = new ModelRendererTurbo(this, 357, 538, textureX, textureY); // Box 21
		bodyModel[21] = new ModelRendererTurbo(this, 189, 538, textureX, textureY); // Box 22
		bodyModel[22] = new ModelRendererTurbo(this, 1775, 538, textureX, textureY); // Box 23
		bodyModel[23] = new ModelRendererTurbo(this, 1906, 538, textureX, textureY); // Box 24
		bodyModel[24] = new ModelRendererTurbo(this, 1652, 538, textureX, textureY); // Box 25
		bodyModel[25] = new ModelRendererTurbo(this, 1532, 538, textureX, textureY); // Box 26
		bodyModel[26] = new ModelRendererTurbo(this, 1401, 538, textureX, textureY); // Box 27
		bodyModel[27] = new ModelRendererTurbo(this, 204, 472, textureX, textureY); // Box 28
		bodyModel[28] = new ModelRendererTurbo(this, 252, 472, textureX, textureY); // Box 29
		bodyModel[29] = new ModelRendererTurbo(this, 969, 33, textureX, textureY); // Box 30
		bodyModel[30] = new ModelRendererTurbo(this, 1545, 33, textureX, textureY); // Box 31
		bodyModel[31] = new ModelRendererTurbo(this, 1697, 33, textureX, textureY); // Box 32
		bodyModel[32] = new ModelRendererTurbo(this, 1841, 33, textureX, textureY); // Box 33
		bodyModel[33] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 34
		bodyModel[34] = new ModelRendererTurbo(this, 1185, 17, textureX, textureY); // Box 35
		bodyModel[35] = new ModelRendererTurbo(this, 817, 33, textureX, textureY); // Box 36
		bodyModel[36] = new ModelRendererTurbo(this, 865, 33, textureX, textureY); // Box 37
		bodyModel[37] = new ModelRendererTurbo(this, 366, 472, textureX, textureY); // Box 38
		bodyModel[38] = new ModelRendererTurbo(this, 0, 472, textureX, textureY); // Box 39
		bodyModel[39] = new ModelRendererTurbo(this, 465, 472, textureX, textureY); // Box 40
		bodyModel[40] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 41
		bodyModel[41] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 42
		bodyModel[42] = new ModelRendererTurbo(this, 681, 1, textureX, textureY); // Box 43
		bodyModel[43] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 44
		bodyModel[44] = new ModelRendererTurbo(this, 1225, 41, textureX, textureY); // Box 45
		bodyModel[45] = new ModelRendererTurbo(this, 913, 41, textureX, textureY); // Box 46
		bodyModel[46] = new ModelRendererTurbo(this, 1313, 41, textureX, textureY); // Box 47
		bodyModel[47] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Box 48
		bodyModel[48] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Box 49
		bodyModel[49] = new ModelRendererTurbo(this, 1457, 41, textureX, textureY); // Box 50
		bodyModel[50] = new ModelRendererTurbo(this, 2017, 1, textureX, textureY); // Box 51
		bodyModel[51] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // Box 52
		bodyModel[52] = new ModelRendererTurbo(this, 625, 49, textureX, textureY); // Box 53
		bodyModel[53] = new ModelRendererTurbo(this, 817, 49, textureX, textureY); // Box 54
		bodyModel[54] = new ModelRendererTurbo(this, 979, 472, textureX, textureY); // Box 55
		bodyModel[55] = new ModelRendererTurbo(this, 309, 472, textureX, textureY); // Box 56
		bodyModel[56] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 57
		bodyModel[57] = new ModelRendererTurbo(this, 1125, 538, textureX, textureY); // Box 58
		bodyModel[58] = new ModelRendererTurbo(this, 0, 538, textureX, textureY); // Box 58
		bodyModel[59] = new ModelRendererTurbo(this, 1254, 538, textureX, textureY); // Box 59
		bodyModel[60] = new ModelRendererTurbo(this, 1906, 487, textureX, textureY); // Box 60
		bodyModel[61] = new ModelRendererTurbo(this, 1633, 57, textureX, textureY); // Box 61
		bodyModel[62] = new ModelRendererTurbo(this, 665, 65, textureX, textureY); // Box 62
		bodyModel[63] = new ModelRendererTurbo(this, 953, 65, textureX, textureY); // Box 63
		bodyModel[64] = new ModelRendererTurbo(this, 1199, 591, textureX, textureY); // Box 64
		bodyModel[65] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 65
		bodyModel[66] = new ModelRendererTurbo(this, 857, 57, textureX, textureY); // Box 66
		bodyModel[67] = new ModelRendererTurbo(this, 137, 73, textureX, textureY); // Box 67
		bodyModel[68] = new ModelRendererTurbo(this, 1105, 81, textureX, textureY); // Box 68
		bodyModel[69] = new ModelRendererTurbo(this, 1433, 81, textureX, textureY); // Box 69
		bodyModel[70] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 70
		bodyModel[71] = new ModelRendererTurbo(this, 521, 57, textureX, textureY); // Box 71
		bodyModel[72] = new ModelRendererTurbo(this, 1977, 57, textureX, textureY); // Box 72
		bodyModel[73] = new ModelRendererTurbo(this, 969, 65, textureX, textureY); // Box 73
		bodyModel[74] = new ModelRendererTurbo(this, 857, 65, textureX, textureY); // Box 74
		bodyModel[75] = new ModelRendererTurbo(this, 1105, 65, textureX, textureY); // Box 75
		bodyModel[76] = new ModelRendererTurbo(this, 1801, 65, textureX, textureY); // Box 76
		bodyModel[77] = new ModelRendererTurbo(this, 1865, 65, textureX, textureY); // Box 77
		bodyModel[78] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 78
		bodyModel[79] = new ModelRendererTurbo(this, 137, 73, textureX, textureY); // Box 79
		bodyModel[80] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 80
		bodyModel[81] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 81
		bodyModel[82] = new ModelRendererTurbo(this, 1105, 33, textureX, textureY); // Box 82
		bodyModel[83] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 83
		bodyModel[84] = new ModelRendererTurbo(this, 1673, 1, textureX, textureY); // Box 84
		bodyModel[85] = new ModelRendererTurbo(this, 2017, 9, textureX, textureY); // Box 85
		bodyModel[86] = new ModelRendererTurbo(this, 2033, 9, textureX, textureY); // Box 86
		bodyModel[87] = new ModelRendererTurbo(this, 1233, 17, textureX, textureY); // Box 87
		bodyModel[88] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 88
		bodyModel[89] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 89
		bodyModel[90] = new ModelRendererTurbo(this, 1265, 1, textureX, textureY); // Box 90
		bodyModel[91] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 91
		bodyModel[92] = new ModelRendererTurbo(this, 1553, 17, textureX, textureY); // Box 92
		bodyModel[93] = new ModelRendererTurbo(this, 2033, 17, textureX, textureY); // Box 93
		bodyModel[94] = new ModelRendererTurbo(this, 1681, 33, textureX, textureY); // Box 94
		bodyModel[95] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 95
		bodyModel[96] = new ModelRendererTurbo(this, 681, 17, textureX, textureY); // Box 96
		bodyModel[97] = new ModelRendererTurbo(this, 913, 17, textureX, textureY); // Box 97
		bodyModel[98] = new ModelRendererTurbo(this, 1825, 33, textureX, textureY); // Box 98
		bodyModel[99] = new ModelRendererTurbo(this, 1577, 9, textureX, textureY); // Box 99
		bodyModel[100] = new ModelRendererTurbo(this, 1865, 9, textureX, textureY); // Box 100
		bodyModel[101] = new ModelRendererTurbo(this, 2041, 17, textureX, textureY); // Box 101
		bodyModel[102] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 102
		bodyModel[103] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 103
		bodyModel[104] = new ModelRendererTurbo(this, 2009, 1, textureX, textureY); // Box 104
		bodyModel[105] = new ModelRendererTurbo(this, 1249, 17, textureX, textureY); // Box 105
		bodyModel[106] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 106
		bodyModel[107] = new ModelRendererTurbo(this, 705, 9, textureX, textureY); // Box 107
		bodyModel[108] = new ModelRendererTurbo(this, 1377, 25, textureX, textureY); // Box 108
		bodyModel[109] = new ModelRendererTurbo(this, 1072, 472, textureX, textureY); // Box 126
		bodyModel[110] = new ModelRendererTurbo(this, 1015, 472, textureX, textureY); // Box 127
		bodyModel[111] = new ModelRendererTurbo(this, 1042, 472, textureX, textureY); // Box 128
		bodyModel[112] = new ModelRendererTurbo(this, 1297, 41, textureX, textureY); // Box 129
		bodyModel[113] = new ModelRendererTurbo(this, 1513, 41, textureX, textureY); // Box 130
		bodyModel[114] = new ModelRendererTurbo(this, 1092, 538, textureX, textureY); // Box 132
		bodyModel[115] = new ModelRendererTurbo(this, 1062, 538, textureX, textureY); // Box 133
		bodyModel[116] = new ModelRendererTurbo(this, 1023, 538, textureX, textureY); // Box 134
		bodyModel[117] = new ModelRendererTurbo(this, 1169, 65, textureX, textureY); // Box 133
		bodyModel[118] = new ModelRendererTurbo(this, 761, 33, textureX, textureY); // Box 134
		bodyModel[119] = new ModelRendererTurbo(this, 705, 1, textureX, textureY); // Box 135
		bodyModel[120] = new ModelRendererTurbo(this, 1977, 33, textureX, textureY); // Box 136
		bodyModel[121] = new ModelRendererTurbo(this, 961, 41, textureX, textureY); // Box 137
		bodyModel[122] = new ModelRendererTurbo(this, 1777, 1, textureX, textureY); // Box 138
		bodyModel[123] = new ModelRendererTurbo(this, 713, 33, textureX, textureY); // Box 139
		bodyModel[124] = new ModelRendererTurbo(this, 913, 33, textureX, textureY); // Box 140
		bodyModel[125] = new ModelRendererTurbo(this, 977, 33, textureX, textureY); // Box 141
		bodyModel[126] = new ModelRendererTurbo(this, 1537, 41, textureX, textureY); // Box 142
		bodyModel[127] = new ModelRendererTurbo(this, 321, 73, textureX, textureY); // Box 143
		bodyModel[128] = new ModelRendererTurbo(this, 417, 73, textureX, textureY); // Box 144
		bodyModel[129] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Box 145
		bodyModel[130] = new ModelRendererTurbo(this, 753, 49, textureX, textureY); // Box 146
		bodyModel[131] = new ModelRendererTurbo(this, 1105, 33, textureX, textureY); // Box 147
		bodyModel[132] = new ModelRendererTurbo(this, 1841, 33, textureX, textureY); // Box 148
		bodyModel[133] = new ModelRendererTurbo(this, 1145, 33, textureX, textureY); // Box 149
		bodyModel[134] = new ModelRendererTurbo(this, 433, 169, textureX, textureY); // Box 157
		bodyModel[135] = new ModelRendererTurbo(this, 665, 177, textureX, textureY); // Box 158
		bodyModel[136] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 159
		bodyModel[137] = new ModelRendererTurbo(this, 881, 185, textureX, textureY); // Box 160
		bodyModel[138] = new ModelRendererTurbo(this, 625, 113, textureX, textureY); // Box 161
		bodyModel[139] = new ModelRendererTurbo(this, 1601, 121, textureX, textureY); // Box 162
		bodyModel[140] = new ModelRendererTurbo(this, 497, 145, textureX, textureY); // Box 163
		bodyModel[141] = new ModelRendererTurbo(this, 1601, 161, textureX, textureY); // Box 164
		bodyModel[142] = new ModelRendererTurbo(this, 217, 185, textureX, textureY); // Box 165
		bodyModel[143] = new ModelRendererTurbo(this, 698, 440, textureX, textureY); // Box 166
		bodyModel[144] = new ModelRendererTurbo(this, 785, 440, textureX, textureY); // Box 167
		bodyModel[145] = new ModelRendererTurbo(this, 878, 440, textureX, textureY); // Box 168
		bodyModel[146] = new ModelRendererTurbo(this, 611, 440, textureX, textureY); // Box 169
		bodyModel[147] = new ModelRendererTurbo(this, 516, 440, textureX, textureY); // Box 170
		bodyModel[148] = new ModelRendererTurbo(this, 120, 440, textureX, textureY); // Box 171
		bodyModel[149] = new ModelRendererTurbo(this, 66, 440, textureX, textureY); // Box 172
		bodyModel[150] = new ModelRendererTurbo(this, 165, 440, textureX, textureY); // Box 173
		bodyModel[151] = new ModelRendererTurbo(this, 516, 509, textureX, textureY); // Box 174
		bodyModel[152] = new ModelRendererTurbo(this, 843, 509, textureX, textureY); // Box 175
		bodyModel[153] = new ModelRendererTurbo(this, 678, 509, textureX, textureY); // Box 176
		bodyModel[154] = new ModelRendererTurbo(this, 357, 509, textureX, textureY); // Box 177
		bodyModel[155] = new ModelRendererTurbo(this, 189, 509, textureX, textureY); // Box 178
		bodyModel[156] = new ModelRendererTurbo(this, 1775, 509, textureX, textureY); // Box 179
		bodyModel[157] = new ModelRendererTurbo(this, 1906, 509, textureX, textureY); // Box 180
		bodyModel[158] = new ModelRendererTurbo(this, 1652, 509, textureX, textureY); // Box 181
		bodyModel[159] = new ModelRendererTurbo(this, 1532, 509, textureX, textureY); // Box 182
		bodyModel[160] = new ModelRendererTurbo(this, 1401, 509, textureX, textureY); // Box 183
		bodyModel[161] = new ModelRendererTurbo(this, 204, 440, textureX, textureY); // Box 184
		bodyModel[162] = new ModelRendererTurbo(this, 252, 440, textureX, textureY); // Box 185
		bodyModel[163] = new ModelRendererTurbo(this, 633, 209, textureX, textureY); // Box 186
		bodyModel[164] = new ModelRendererTurbo(this, 1097, 209, textureX, textureY); // Box 187
		bodyModel[165] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); // Box 188
		bodyModel[166] = new ModelRendererTurbo(this, 145, 217, textureX, textureY); // Box 189
		bodyModel[167] = new ModelRendererTurbo(this, 769, 217, textureX, textureY); // Box 190
		bodyModel[168] = new ModelRendererTurbo(this, 1297, 49, textureX, textureY); // Box 191
		bodyModel[169] = new ModelRendererTurbo(this, 1457, 105, textureX, textureY); // Box 192
		bodyModel[170] = new ModelRendererTurbo(this, 417, 113, textureX, textureY); // Box 193
		bodyModel[171] = new ModelRendererTurbo(this, 366, 440, textureX, textureY); // Box 194
		bodyModel[172] = new ModelRendererTurbo(this, 0, 440, textureX, textureY); // Box 195
		bodyModel[173] = new ModelRendererTurbo(this, 465, 440, textureX, textureY); // Box 196
		bodyModel[174] = new ModelRendererTurbo(this, 553, 49, textureX, textureY); // Box 197
		bodyModel[175] = new ModelRendererTurbo(this, 1345, 49, textureX, textureY); // Box 198
		bodyModel[176] = new ModelRendererTurbo(this, 625, 73, textureX, textureY); // Box 199
		bodyModel[177] = new ModelRendererTurbo(this, 1721, 161, textureX, textureY); // Box 200
		bodyModel[178] = new ModelRendererTurbo(this, 905, 217, textureX, textureY); // Box 201
		bodyModel[179] = new ModelRendererTurbo(this, 1993, 161, textureX, textureY); // Box 202
		bodyModel[180] = new ModelRendererTurbo(this, 897, 217, textureX, textureY); // Box 203
		bodyModel[181] = new ModelRendererTurbo(this, 1169, 217, textureX, textureY); // Box 204
		bodyModel[182] = new ModelRendererTurbo(this, 1393, 217, textureX, textureY); // Box 205
		bodyModel[183] = new ModelRendererTurbo(this, 953, 161, textureX, textureY); // Box 206
		bodyModel[184] = new ModelRendererTurbo(this, 1505, 49, textureX, textureY); // Box 207
		bodyModel[185] = new ModelRendererTurbo(this, 1313, 217, textureX, textureY); // Box 208
		bodyModel[186] = new ModelRendererTurbo(this, 1521, 217, textureX, textureY); // Box 209
		bodyModel[187] = new ModelRendererTurbo(this, 1649, 217, textureX, textureY); // Box 210
		bodyModel[188] = new ModelRendererTurbo(this, 979, 440, textureX, textureY); // Box 211
		bodyModel[189] = new ModelRendererTurbo(this, 309, 440, textureX, textureY); // Box 212
		bodyModel[190] = new ModelRendererTurbo(this, 1865, 217, textureX, textureY); // Box 213
		bodyModel[191] = new ModelRendererTurbo(this, 1125, 509, textureX, textureY); // Box 214
		bodyModel[192] = new ModelRendererTurbo(this, 0, 509, textureX, textureY); // Box 215
		bodyModel[193] = new ModelRendererTurbo(this, 1254, 509, textureX, textureY); // Box 216
		bodyModel[194] = new ModelRendererTurbo(this, 1906, 471, textureX, textureY); // Box 217
		bodyModel[195] = new ModelRendererTurbo(this, 449, 225, textureX, textureY); // Box 218
		bodyModel[196] = new ModelRendererTurbo(this, 193, 241, textureX, textureY); // Box 219
		bodyModel[197] = new ModelRendererTurbo(this, 1561, 233, textureX, textureY); // Box 220
		bodyModel[198] = new ModelRendererTurbo(this, 549, 569, textureX, textureY); // Box 221
		bodyModel[199] = new ModelRendererTurbo(this, 1817, 241, textureX, textureY); // Box 222
		bodyModel[200] = new ModelRendererTurbo(this, 1, 241, textureX, textureY); // Box 223
		bodyModel[201] = new ModelRendererTurbo(this, 617, 249, textureX, textureY); // Box 224
		bodyModel[202] = new ModelRendererTurbo(this, 737, 313, textureX, textureY); // Box 225
		bodyModel[203] = new ModelRendererTurbo(this, 1009, 313, textureX, textureY); // Box 226
		bodyModel[204] = new ModelRendererTurbo(this, 1417, 225, textureX, textureY); // Box 227
		bodyModel[205] = new ModelRendererTurbo(this, 905, 233, textureX, textureY); // Box 228
		bodyModel[206] = new ModelRendererTurbo(this, 1, 241, textureX, textureY); // Box 229
		bodyModel[207] = new ModelRendererTurbo(this, 1953, 241, textureX, textureY); // Box 230
		bodyModel[208] = new ModelRendererTurbo(this, 113, 249, textureX, textureY); // Box 231
		bodyModel[209] = new ModelRendererTurbo(this, 385, 241, textureX, textureY); // Box 232
		bodyModel[210] = new ModelRendererTurbo(this, 449, 241, textureX, textureY); // Box 233
		bodyModel[211] = new ModelRendererTurbo(this, 617, 241, textureX, textureY); // Box 234
		bodyModel[212] = new ModelRendererTurbo(this, 1313, 241, textureX, textureY); // Box 235
		bodyModel[213] = new ModelRendererTurbo(this, 1369, 241, textureX, textureY); // Box 236
		bodyModel[214] = new ModelRendererTurbo(this, 265, 57, textureX, textureY); // Box 237
		bodyModel[215] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 238
		bodyModel[216] = new ModelRendererTurbo(this, 897, 49, textureX, textureY); // Box 239
		bodyModel[217] = new ModelRendererTurbo(this, 1369, 49, textureX, textureY); // Box 240
		bodyModel[218] = new ModelRendererTurbo(this, 585, 33, textureX, textureY); // Box 241
		bodyModel[219] = new ModelRendererTurbo(this, 857, 33, textureX, textureY); // Box 242
		bodyModel[220] = new ModelRendererTurbo(this, 1121, 41, textureX, textureY); // Box 243
		bodyModel[221] = new ModelRendererTurbo(this, 1209, 41, textureX, textureY); // Box 244
		bodyModel[222] = new ModelRendererTurbo(this, 977, 17, textureX, textureY); // Box 245
		bodyModel[223] = new ModelRendererTurbo(this, 681, 1, textureX, textureY); // Box 246
		bodyModel[224] = new ModelRendererTurbo(this, 1705, 33, textureX, textureY); // Box 247
		bodyModel[225] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Box 248
		bodyModel[226] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // Box 249
		bodyModel[227] = new ModelRendererTurbo(this, 425, 49, textureX, textureY); // Box 250
		bodyModel[228] = new ModelRendererTurbo(this, 1841, 41, textureX, textureY); // Box 251
		bodyModel[229] = new ModelRendererTurbo(this, 777, 57, textureX, textureY); // Box 252
		bodyModel[230] = new ModelRendererTurbo(this, 913, 57, textureX, textureY); // Box 253
		bodyModel[231] = new ModelRendererTurbo(this, 1801, 57, textureX, textureY); // Box 254
		bodyModel[232] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 255
		bodyModel[233] = new ModelRendererTurbo(this, 1017, 25, textureX, textureY); // Box 256
		bodyModel[234] = new ModelRendererTurbo(this, 1721, 25, textureX, textureY); // Box 257
		bodyModel[235] = new ModelRendererTurbo(this, 625, 49, textureX, textureY); // Box 258
		bodyModel[236] = new ModelRendererTurbo(this, 1377, 33, textureX, textureY); // Box 259
		bodyModel[237] = new ModelRendererTurbo(this, 2041, 41, textureX, textureY); // Box 260
		bodyModel[238] = new ModelRendererTurbo(this, 1225, 17, textureX, textureY); // Box 261
		bodyModel[239] = new ModelRendererTurbo(this, 337, 57, textureX, textureY); // Box 262
		bodyModel[240] = new ModelRendererTurbo(this, 1825, 57, textureX, textureY); // Box 263
		bodyModel[241] = new ModelRendererTurbo(this, 1505, 41, textureX, textureY); // Box 264
		bodyModel[242] = new ModelRendererTurbo(this, 1193, 65, textureX, textureY); // Box 265
		bodyModel[243] = new ModelRendererTurbo(this, 1072, 440, textureX, textureY); // Box 282
		bodyModel[244] = new ModelRendererTurbo(this, 1015, 440, textureX, textureY); // Box 283
		bodyModel[245] = new ModelRendererTurbo(this, 1042, 440, textureX, textureY); // Box 284
		bodyModel[246] = new ModelRendererTurbo(this, 1185, 73, textureX, textureY); // Box 285
		bodyModel[247] = new ModelRendererTurbo(this, 1593, 73, textureX, textureY); // Box 286
		bodyModel[248] = new ModelRendererTurbo(this, 1092, 509, textureX, textureY); // Box 287
		bodyModel[249] = new ModelRendererTurbo(this, 1062, 509, textureX, textureY); // Box 288
		bodyModel[250] = new ModelRendererTurbo(this, 1023, 509, textureX, textureY); // Box 289
		bodyModel[251] = new ModelRendererTurbo(this, 1273, 81, textureX, textureY); // Box 290
		bodyModel[252] = new ModelRendererTurbo(this, 1121, 49, textureX, textureY); // Box 291
		bodyModel[253] = new ModelRendererTurbo(this, 1961, 1, textureX, textureY); // Box 292
		bodyModel[254] = new ModelRendererTurbo(this, 497, 73, textureX, textureY); // Box 293
		bodyModel[255] = new ModelRendererTurbo(this, 737, 81, textureX, textureY); // Box 294
		bodyModel[256] = new ModelRendererTurbo(this, 857, 41, textureX, textureY); // Box 295
		bodyModel[257] = new ModelRendererTurbo(this, 1697, 41, textureX, textureY); // Box 296
		bodyModel[258] = new ModelRendererTurbo(this, 1209, 49, textureX, textureY); // Box 297
		bodyModel[259] = new ModelRendererTurbo(this, 1529, 49, textureX, textureY); // Box 298
		bodyModel[260] = new ModelRendererTurbo(this, 1353, 81, textureX, textureY); // Box 299
		bodyModel[261] = new ModelRendererTurbo(this, 1601, 81, textureX, textureY); // Box 300
		bodyModel[262] = new ModelRendererTurbo(this, 1681, 81, textureX, textureY); // Box 301
		bodyModel[263] = new ModelRendererTurbo(this, 1513, 81, textureX, textureY); // Box 302
		bodyModel[264] = new ModelRendererTurbo(this, 1369, 81, textureX, textureY); // Box 303
		bodyModel[265] = new ModelRendererTurbo(this, 561, 57, textureX, textureY); // Box 304
		bodyModel[266] = new ModelRendererTurbo(this, 801, 57, textureX, textureY); // Box 305
		bodyModel[267] = new ModelRendererTurbo(this, 1377, 57, textureX, textureY); // Box 306
		bodyModel[268] = new ModelRendererTurbo(this, 1849, 281, textureX, textureY); // Box 352
		bodyModel[269] = new ModelRendererTurbo(this, 1137, 281, textureX, textureY); // Box 353
		bodyModel[270] = new ModelRendererTurbo(this, 2041, 57, textureX, textureY); // Box 354
		bodyModel[271] = new ModelRendererTurbo(this, 681, 73, textureX, textureY); // Box 355
		bodyModel[272] = new ModelRendererTurbo(this, 385, 305, textureX, textureY); // Box 357
		bodyModel[273] = new ModelRendererTurbo(this, 1969, 97, textureX, textureY); // Box 358
		bodyModel[274] = new ModelRendererTurbo(this, 473, 81, textureX, textureY); // Box 359
		bodyModel[275] = new ModelRendererTurbo(this, 1457, 81, textureX, textureY); // Box 360
		bodyModel[276] = new ModelRendererTurbo(this, 753, 241, textureX, textureY); // Box 721
		bodyModel[277] = new ModelRendererTurbo(this, 1641, 241, textureX, textureY); // Box 722
		bodyModel[278] = new ModelRendererTurbo(this, 1713, 241, textureX, textureY); // Box 723
		bodyModel[279] = new ModelRendererTurbo(this, 441, 289, textureX, textureY); // Box 724
		bodyModel[280] = new ModelRendererTurbo(this, 617, 289, textureX, textureY); // Box 725
		bodyModel[281] = new ModelRendererTurbo(this, 1505, 137, textureX, textureY); // Box 726
		bodyModel[282] = new ModelRendererTurbo(this, 1601, 137, textureX, textureY); // Box 727
		bodyModel[283] = new ModelRendererTurbo(this, 1273, 97, textureX, textureY); // Box 728
		bodyModel[284] = new ModelRendererTurbo(this, 473, 113, textureX, textureY); // Box 729
		bodyModel[285] = new ModelRendererTurbo(this, 1601, 97, textureX, textureY); // Box 730
		bodyModel[286] = new ModelRendererTurbo(this, 241, 249, textureX, textureY); // Box 731
		bodyModel[287] = new ModelRendererTurbo(this, 553, 113, textureX, textureY); // Box 732
		bodyModel[288] = new ModelRendererTurbo(this, 1161, 129, textureX, textureY); // Box 389
		bodyModel[289] = new ModelRendererTurbo(this, 1681, 97, textureX, textureY); // Box 390
		bodyModel[290] = new ModelRendererTurbo(this, 921, 257, textureX, textureY); // Box 391
		bodyModel[291] = new ModelRendererTurbo(this, 673, 145, textureX, textureY); // Box 392
		bodyModel[292] = new ModelRendererTurbo(this, 273, 105, textureX, textureY); // Box 393
		bodyModel[293] = new ModelRendererTurbo(this, 2025, 193, textureX, textureY); // Box 394
		bodyModel[294] = new ModelRendererTurbo(this, 1225, 233, textureX, textureY); // Box 395
		bodyModel[295] = new ModelRendererTurbo(this, 273, 265, textureX, textureY); // Box 396
		bodyModel[296] = new ModelRendererTurbo(this, 257, 297, textureX, textureY); // Box 397
		bodyModel[297] = new ModelRendererTurbo(this, 1017, 313, textureX, textureY); // Box 398
		bodyModel[298] = new ModelRendererTurbo(this, 809, 297, textureX, textureY); // Box 399
		bodyModel[299] = new ModelRendererTurbo(this, 1593, 305, textureX, textureY); // Box 400
		bodyModel[300] = new ModelRendererTurbo(this, 1809, 297, textureX, textureY); // Box 684
		bodyModel[301] = new ModelRendererTurbo(this, 1849, 305, textureX, textureY); // Box 685
		bodyModel[302] = new ModelRendererTurbo(this, 41, 97, textureX, textureY); // Box 686
		bodyModel[303] = new ModelRendererTurbo(this, 1121, 297, textureX, textureY); // Box 690
		bodyModel[304] = new ModelRendererTurbo(this, 65, 113, textureX, textureY); // Box 691
		bodyModel[305] = new ModelRendererTurbo(this, 561, 65, textureX, textureY); // Box 692
		bodyModel[306] = new ModelRendererTurbo(this, 1377, 97, textureX, textureY); // Box 693
		bodyModel[307] = new ModelRendererTurbo(this, 81, 113, textureX, textureY); // Box 695
		bodyModel[308] = new ModelRendererTurbo(this, 465, 113, textureX, textureY); // Box 696
		bodyModel[309] = new ModelRendererTurbo(this, 1801, 113, textureX, textureY); // Box 697
		bodyModel[310] = new ModelRendererTurbo(this, 1249, 17, textureX, textureY); // Box 264
		bodyModel[311] = new ModelRendererTurbo(this, 1953, 65, textureX, textureY); // Box 786
		bodyModel[312] = new ModelRendererTurbo(this, 1169, 81, textureX, textureY); // Box 789
		bodyModel[313] = new ModelRendererTurbo(this, 913, 1, textureX, textureY); // Box 791
		bodyModel[314] = new ModelRendererTurbo(this, 1873, 1, textureX, textureY); // Box 792
		bodyModel[315] = new ModelRendererTurbo(this, 1617, 97, textureX, textureY); // Box 1114
		bodyModel[316] = new ModelRendererTurbo(this, 1193, 97, textureX, textureY); // Box 1115
		bodyModel[317] = new ModelRendererTurbo(this, 2041, 1, textureX, textureY); // Box 1116
		bodyModel[318] = new ModelRendererTurbo(this, 1721, 17, textureX, textureY); // Box 1117
		bodyModel[319] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 420
		bodyModel[320] = new ModelRendererTurbo(this, 1889, 233, textureX, textureY); // Box 421
		bodyModel[321] = new ModelRendererTurbo(this, 953, 241, textureX, textureY); // Box 422
		bodyModel[322] = new ModelRendererTurbo(this, 1273, 145, textureX, textureY); // Box 423
		bodyModel[323] = new ModelRendererTurbo(this, 1881, 113, textureX, textureY); // Box 424
		bodyModel[324] = new ModelRendererTurbo(this, 809, 265, textureX, textureY); // Box 425
		bodyModel[325] = new ModelRendererTurbo(this, 481, 153, textureX, textureY); // Box 426
		bodyModel[326] = new ModelRendererTurbo(this, 137, 121, textureX, textureY); // Box 427

		bodyModel[0].addShapeBox(0F, 0F, 0F, 96, 17, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[0].setRotationPoint(-89F, -55F, -19F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 96, 7, 19, 0F,0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[1].setRotationPoint(-89F, -62F, -19F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 96, 10, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[2].setRotationPoint(-89F, -38F, -19F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 96, 7, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[3].setRotationPoint(-89F, -28F, -19F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 54, 7, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 5
		bodyModel[4].setRotationPoint(-143F, -28F, -19F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 54, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[5].setRotationPoint(-143F, -38F, -19F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 54, 8, 4, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 7
		bodyModel[6].setRotationPoint(-143F, -55F, -19F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 54, 7, 11, 0F,0F, 0F, -10F, 0F, 0F, -10F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F); // Box 8
		bodyModel[7].setRotationPoint(-143F, -62F, -19F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 54, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[8].setRotationPoint(-143F, -47F, -19F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 41, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[9].setRotationPoint(-184F, -47F, -19F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 41, 8, 4, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 11
		bodyModel[10].setRotationPoint(-184F, -55F, -19F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 41, 7, 8, 0F,0F, 0F, -7F, 0F, 0F, -7F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F); // Box 12
		bodyModel[11].setRotationPoint(-184F, -62F, -16F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 41, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[12].setRotationPoint(-184F, -38F, -19F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 41, 7, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 14
		bodyModel[13].setRotationPoint(-184F, -28F, -19F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 16, 10, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 15
		bodyModel[14].setRotationPoint(-200F, -38F, -19F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 16, 7, 9, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -5F, 0F, -2F, -8F, 0F, 0F, -4F, 0F, -1F, -5F, 0F, -3F, -1F); // Box 16
		bodyModel[15].setRotationPoint(-200F, -28F, -19F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 16, 9, 2, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 17
		bodyModel[16].setRotationPoint(-200F, -47F, -19F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 76, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[17].setRotationPoint(7F, -47F, -19F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 76, 7, 11, 0F,0F, 0F, -10F, 0F, 0F, -10F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -7F, 0F, 0F, -7F); // Box 19
		bodyModel[18].setRotationPoint(7F, -62F, -19F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 76, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 20
		bodyModel[19].setRotationPoint(7F, -55F, -19F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 76, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[20].setRotationPoint(7F, -38F, -19F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 76, 7, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 22
		bodyModel[21].setRotationPoint(7F, -28F, -19F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 54, 8, 6, 0F,0F, 0F, -3F, 0F, -1F, -5F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -5F); // Box 23
		bodyModel[22].setRotationPoint(83F, -55F, -19F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 54, 7, 9, 0F,0F, 0F, -7F, 0F, -3F, -8F, 0F, -4F, -1F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, -6F, 0F, 0F, -8F); // Box 24
		bodyModel[23].setRotationPoint(83F, -62F, -16F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 54, 9, 4, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -1F, 0F, 0F, -3F); // Box 25
		bodyModel[24].setRotationPoint(83F, -47F, -19F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 54, 10, 3, 0F,0F, 0F, 0F, 0F, 2F, -2F, 0F, 2F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -5F, -2F, 0F, -5F, 0F, 0F, 0F, -2F); // Box 26
		bodyModel[25].setRotationPoint(83F, -38F, -19F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 54, 7, 8, 0F,0F, 0F, 0F, 0F, 5F, -2F, 0F, 5F, -5F, 0F, 0F, -7F, 0F, 0F, -4F, 0F, -5F, -7F, 0F, -6F, -1F, 0F, -1F, -4F); // Box 27
		bodyModel[26].setRotationPoint(83F, -28F, -19F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 16, 8, 6, 0F,0F, -1F, -5F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -4F); // Box 28
		bodyModel[27].setRotationPoint(-200F, -55F, -19F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 16, 7, 11, 0F,0F, -3F, -9F, 0F, 0F, -7F, 0F, -1F, -4F, 0F, -4F, -2F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 1F, -8F); // Box 29
		bodyModel[28].setRotationPoint(-200F, -62F, -16F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 56, 7, 17, 0F,0F, 0F, -1F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -6F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[29].setRotationPoint(137F, -47F, -17F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 56, 7, 16, 0F,0F, 0F, -2F, 0F, -1F, -7F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[30].setRotationPoint(137F, -54F, -16F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 56, 5, 14, 0F,0F, 0F, -6F, 0F, -3F, -8F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -5F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[31].setRotationPoint(137F, -59F, -14F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 56, 7, 17, 0F,0F, 0F, 0F, 0F, 3F, -6F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -6F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[32].setRotationPoint(137F, -40F, -17F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 56, 7, 17, 0F,0F, 0F, 0F, 0F, 5F, -6F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -7F, -10F, 0F, -7F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[33].setRotationPoint(137F, -33F, -17F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 17, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, -2F); // Box 35
		bodyModel[34].setRotationPoint(193F, -47F, -11F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 17, 5, 3, 0F,0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F, 1F, 0F, 0F, -2F); // Box 36
		bodyModel[35].setRotationPoint(193F, -43F, -11F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 17, 5, 7, 0F,0F, 0F, 0F, 0F, 3F, -3F, 0F, 3F, -3F, 0F, 0F, -6F, 0F, 0F, -4F, 0F, -4F, -6F, 0F, -5F, -1F, 0F, -1F, -3F); // Box 37
		bodyModel[36].setRotationPoint(193F, -38F, -11F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 33, 8, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[37].setRotationPoint(-184F, -21F, -15F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 16, 8, 15, 0F,0F, 2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -8F, -1F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, -8F, -1F, 0F); // Box 39
		bodyModel[38].setRotationPoint(-200F, -21F, -15F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 8, 8, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -5F, -1F, -6F, -5F, -1F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[39].setRotationPoint(-151F, -21F, -15F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 7, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, -2F); // Box 41
		bodyModel[40].setRotationPoint(210F, -47F, -9F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 7, 3, 3, 0F,0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, -1F, -3F, 0F, -1F, 1F, 0F, 0F, -1F); // Box 42
		bodyModel[41].setRotationPoint(210F, -44F, -9F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 7, 4, 5, 0F,0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, -2F, -4F, 0F, -3F, -1F, 0F, -1F, -2F); // Box 43
		bodyModel[42].setRotationPoint(210F, -41F, -8F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 21, 6, 4, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 2F, 0F, 0F, 0F); // Box 44
		bodyModel[43].setRotationPoint(193F, -47F, -15F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 30, 10, 5, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[44].setRotationPoint(163F, -49F, -15F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 19, 10, 5, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 46
		bodyModel[45].setRotationPoint(144F, -49F, -15F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 30, 10, 80, 0F,-13F, -4F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -13F, -4F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[46].setRotationPoint(163F, -49F, -95F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 30, 10, 80, 0F,-21F, -4F, -2F, 2F, -4F, 0F, -11F, 0F, 0F, 0F, -3F, 0F, -21F, -4F, -2F, 2F, -4F, 0F, -11F, 0F, 0F, 0F, -3F, 0F); // Box 48
		bodyModel[47].setRotationPoint(144F, -49F, -95F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 21, 10, 80, 0F,0F, -4F, 0F, -7F, -5F, -2F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, -7F, -4F, -2F, 0F, -5F, 0F, 0F, -2F, 0F); // Box 49
		bodyModel[48].setRotationPoint(193F, -49F, -95F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 17, 1, 7, 0F,0F, 0F, 0F, 0F, 4F, -2F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -2F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[49].setRotationPoint(193F, -34F, -7F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 7, 1, 5, 0F,0F, 0F, 0F, 0F, 2F, -1F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[50].setRotationPoint(210F, -38F, -5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 41, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[51].setRotationPoint(-184F, -22F, -15F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 54, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[52].setRotationPoint(-143F, -22F, -15F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 36, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[53].setRotationPoint(-143F, -62F, -9F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 6, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[54].setRotationPoint(-184F, -62F, -9F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 16, 1, 9, 0F,0F, -3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 56
		bodyModel[55].setRotationPoint(-200F, -62F, -9F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 16, 1, 13, 0F,0F, 2F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 57
		bodyModel[56].setRotationPoint(-200F, -22F, -13F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 52, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[57].setRotationPoint(31F, -62F, -9F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 76, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[58].setRotationPoint(7F, -22F, -15F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 54, 1, 15, 0F,0F, 0F, 0F, 0F, 5F, -3F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -3F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[59].setRotationPoint(83F, -22F, -15F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 54, 1, 9, 0F,0F, 0F, 0F, 0F, -3F, -1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -1F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[60].setRotationPoint(83F, -62F, -9F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 43, 17, 79, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[61].setRotationPoint(-72F, -55F, -98F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 43, 10, 100, 0F,-4F, 0F, 0F, -9F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -4F, 0F, 0F, -9F, 0F, 0F, 0F, 13F, 0F, 0F, 13F, 0F); // Box 62
		bodyModel[62].setRotationPoint(-72F, -61F, -198F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 20, 10, 105, 0F,0F, 0F, 0F, -9F, 0F, 0F, 4F, -7F, 0F, 6F, -7F, 0F, 0F, -6F, 0F, -9F, -6F, 0F, 4F, 7F, 0F, 6F, 7F, 0F); // Box 63
		bodyModel[63].setRotationPoint(-62F, -68F, -303F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 10, 105, 0F,-4F, -1F, 0F, 9F, 0F, 0F, 3F, -7F, 0F, 6F, -10F, 0F, -4F, -7F, 0F, 9F, -6F, 0F, 5F, 7F, 0F, 6F, 4F, 0F); // Box 64
		bodyModel[64].setRotationPoint(-72F, -68F, -303F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 15, 10, 100, 0F,-9F, -3F, 0F, 4F, 0F, 0F, 0F, -6F, 0F, 0F, -11F, 0F, -9F, -3F, 0F, 4F, 0F, 0F, 0F, 13F, 0F, 0F, 8F, 0F); // Box 65
		bodyModel[65].setRotationPoint(-87F, -61F, -198F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 15, 17, 79, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 66
		bodyModel[66].setRotationPoint(-87F, -55F, -98F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 27, 17, 79, 0F,0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[67].setRotationPoint(-29F, -55F, -98F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 32, 10, 100, 0F,0F, 0F, 0F, -9F, -5F, 0F, 4F, -14F, 0F, -9F, -6F, 0F, 0F, 0F, 0F, -9F, -4F, 0F, 4F, 5F, 0F, -9F, 13F, 0F); // Box 68
		bodyModel[68].setRotationPoint(-38F, -61F, -198F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 28, 10, 105, 0F,0F, 0F, 0F, -9F, -1F, 0F, 8F, -12F, 0F, -13F, -7F, 0F, 0F, -6F, 0F, -9F, -8F, 0F, 8F, 3F, 0F, -13F, 7F, 0F); // Box 69
		bodyModel[69].setRotationPoint(-51F, -68F, -303F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 11, 4, 12, 0F,-4F, -1F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -2F, 0F, -3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[70].setRotationPoint(-62F, -68F, -315F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 13, 4, 12, 0F,-3F, -1F, -4F, -3F, -1F, 0F, -7F, 0F, 0F, 0F, -1F, 0F, -3F, -2F, -4F, -3F, -2F, 0F, -7F, 0F, 0F, 0F, -1F, 0F); // Box 71
		bodyModel[71].setRotationPoint(-68F, -68F, -315F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 22, 4, 12, 0F,0F, -1F, 0F, -6F, -1F, -4F, 0F, -1F, 0F, -3F, 0F, 0F, 0F, -2F, 0F, -6F, -2F, -4F, 0F, -2F, 0F, -3F, 0F, 0F); // Box 72
		bodyModel[72].setRotationPoint(-54F, -68F, -315F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 36, 58, 5, 0F,-16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[73].setRotationPoint(148F, -114F, -5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 28, 58, 5, 0F,-21F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -21F, 0F, 0F, 0F, -3F, -4F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, -3F, 0F); // Box 74
		bodyModel[74].setRotationPoint(136F, -114F, -5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 26, 45, 5, 0F,0F, 0F, 0F, -3F, 0F, -4F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[75].setRotationPoint(184F, -114F, -5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 26, 13, 5, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, -3F, -4F, -7F, -3F, 0F, 0F, 0F, 0F); // Box 76
		bodyModel[76].setRotationPoint(184F, -69F, -5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 23, 12, 5, 0F,0F, 0F, -3F, -8F, -2F, -4F, -8F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[77].setRotationPoint(184F, -126F, -5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 20, 12, 5, 0F,-12F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[78].setRotationPoint(164F, -126F, -5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 19, 12, 5, 0F,-7F, -3F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, -7F, -3F, 0F, 0F, 0F, -4F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[79].setRotationPoint(157F, -126F, -5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 80
		bodyModel[80].setRotationPoint(-202F, -59F, -7F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, -2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 81
		bodyModel[81].setRotationPoint(-204F, -58F, -5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 2, 1, 11, 0F,0F, 0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 82
		bodyModel[82].setRotationPoint(-202F, -24F, -11F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, -2F, 0F, -0.5F, 4F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0.5F, 4F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[83].setRotationPoint(-206F, -25F, -5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -4F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -1F, 0F, 4F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -1F); // Box 84
		bodyModel[84].setRotationPoint(-210F, -58F, -3F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,-2F, -4F, 5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2F, -4F, -5F, -2F, 4F, 5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 4F, -5F); // Box 85
		bodyModel[85].setRotationPoint(-208F, -58F, -5F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4.6F, 0F, 0F, -4.6F, 0F, 0F, 0F); // Box 86
		bodyModel[86].setRotationPoint(-206F, -54F, -10F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F); // Box 87
		bodyModel[87].setRotationPoint(-206F, -54F, -10F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 2F, -3F, 0F, 2F, -3F, 0F, -2F, 3F, 0F, -2F); // Box 88
		bodyModel[88].setRotationPoint(-206F, -54F, -10F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, -1F, 1F, 0F, -1F); // Box 89
		bodyModel[89].setRotationPoint(-209F, -48F, -12F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[90].setRotationPoint(-210F, -45F, -13F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, 3F, 0F, -3F, 3F, 0F, 3F, -3F, 0F, 3F); // Box 91
		bodyModel[91].setRotationPoint(-210F, -35F, -13F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 2F, -4F, 0F, 2F, -4F, 0F, -2F, 4F, 0F, -2F); // Box 92
		bodyModel[92].setRotationPoint(-210F, -54F, -4F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		bodyModel[93].setRotationPoint(-214F, -45F, -6F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F); // Box 94
		bodyModel[94].setRotationPoint(-210F, -45F, -13F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 95
		bodyModel[95].setRotationPoint(-210F, -45F, -13F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 5.4F, 0F, 0F, -5.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 96
		bodyModel[96].setRotationPoint(-209F, -48F, -12F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 4.6F, 0F, 0F, -4.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4.4F, 0F, 0F, -4.4F, 0F, 0F, 0F); // Box 97
		bodyModel[97].setRotationPoint(-210F, -36F, -13F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F); // Box 98
		bodyModel[98].setRotationPoint(-210F, -36F, -13F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[99].setRotationPoint(-214F, -45F, -5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[100].setRotationPoint(-214F, -36F, -5F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[101].setRotationPoint(-214F, -44F, -2F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[102].setRotationPoint(-210F, -54F, -4F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, 3F, 0F, -2F, 3F, 0F, 2F, -3F, 0F, 2F); // Box 103
		bodyModel[103].setRotationPoint(-214F, -35F, -6F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, -4F, -1F, 0F, -4F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -1F, 0F, 4F, 1F, 0F, 0F, 0F); // Box 104
		bodyModel[104].setRotationPoint(-211F, -29F, -4F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F); // Box 105
		bodyModel[105].setRotationPoint(-207F, -29F, -10F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 6.2F, 0F, 0F, -6.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 106
		bodyModel[106].setRotationPoint(-207F, -29F, -10F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		bodyModel[107].setRotationPoint(-211F, -29F, -4F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,-2F, 4F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 4F, -1F, -2F, -4F, 1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2F, -4F, -1F); // Box 108
		bodyModel[108].setRotationPoint(-209F, -25F, -9F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 17, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[109].setRotationPoint(-160F, -62F, -9F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F); // Box 127
		bodyModel[110].setRotationPoint(-178F, -62F, -9F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F); // Box 128
		bodyModel[111].setRotationPoint(-166F, -62F, -9F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F); // Box 129
		bodyModel[112].setRotationPoint(-95F, -62F, -9F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[113].setRotationPoint(-107F, -62F, -9F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F); // Box 132
		bodyModel[114].setRotationPoint(25F, -62F, -9F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F); // Box 133
		bodyModel[115].setRotationPoint(13F, -62F, -9F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 6, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134
		bodyModel[116].setRotationPoint(7F, -62F, -9F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 7, 6, 3, 0F,-4F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 1F, -4F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 133
		bodyModel[117].setRotationPoint(210F, -53F, -9F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 134
		bodyModel[118].setRotationPoint(214F, -53F, -6F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[119].setRotationPoint(214F, -56F, -2F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		bodyModel[120].setRotationPoint(193F, -53F, -9F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F); // Box 137
		bodyModel[121].setRotationPoint(203F, -53F, -9F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.9F, 0F, 0F, 0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.9F); // Box 138
		bodyModel[122].setRotationPoint(202F, -53F, -9F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 139
		bodyModel[123].setRotationPoint(202F, -53F, -9F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 140
		bodyModel[124].setRotationPoint(202F, -57F, -6F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[125].setRotationPoint(202F, -59F, -3F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 142
		bodyModel[126].setRotationPoint(193F, -57F, -6F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 7, 2, 7, 0F,-4F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[127].setRotationPoint(217F, -47F, -7F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 7, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -4F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 144
		bodyModel[128].setRotationPoint(217F, -45F, -7F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 6, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, -2F, -4F, -1F, -2F, 0F, 0F, 0F, 0F); // Box 145
		bodyModel[129].setRotationPoint(217F, -42F, -6F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 4, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[130].setRotationPoint(217F, -47F, -7F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[131].setRotationPoint(217F, -53F, -7F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 148
		bodyModel[132].setRotationPoint(217F, -53F, -6F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[133].setRotationPoint(217F, -56F, -2F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 96, 17, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[134].setRotationPoint(-89F, -55F, 0F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 96, 7, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		bodyModel[135].setRotationPoint(-89F, -62F, 0F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 96, 10, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		bodyModel[136].setRotationPoint(-89F, -38F, 0F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 96, 7, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 160
		bodyModel[137].setRotationPoint(-89F, -28F, 0F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 54, 7, 5, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 161
		bodyModel[138].setRotationPoint(-143F, -28F, 14F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 54, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[139].setRotationPoint(-143F, -38F, 18F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 54, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		bodyModel[140].setRotationPoint(-143F, -55F, 15F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 54, 7, 11, 0F,0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 164
		bodyModel[141].setRotationPoint(-143F, -62F, 8F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 54, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		bodyModel[142].setRotationPoint(-143F, -47F, 18F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 41, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[143].setRotationPoint(-184F, -47F, 18F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 41, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[144].setRotationPoint(-184F, -55F, 15F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 41, 7, 8, 0F,0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[145].setRotationPoint(-184F, -62F, 8F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 41, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		bodyModel[146].setRotationPoint(-184F, -38F, 18F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 41, 7, 5, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 170
		bodyModel[147].setRotationPoint(-184F, -28F, 14F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 16, 10, 4, 0F,0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 171
		bodyModel[148].setRotationPoint(-200F, -38F, 15F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 16, 7, 9, 0F,0F, 0F, -5F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, -1F, 0F, -1F, -5F, 0F, 0F, -4F, 0F, -2F, -8F); // Box 172
		bodyModel[149].setRotationPoint(-200F, -28F, 10F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 16, 9, 2, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 173
		bodyModel[150].setRotationPoint(-200F, -47F, 17F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 76, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[151].setRotationPoint(7F, -47F, 18F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 76, 7, 11, 0F,0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 175
		bodyModel[152].setRotationPoint(7F, -62F, 8F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 76, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		bodyModel[153].setRotationPoint(7F, -55F, 15F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 76, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[154].setRotationPoint(7F, -38F, 18F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 76, 7, 5, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 178
		bodyModel[155].setRotationPoint(7F, -28F, 14F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 54, 8, 6, 0F,0F, 0F, -2F, 0F, -1F, 0F, 0F, -1F, -5F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 179
		bodyModel[156].setRotationPoint(83F, -55F, 13F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 54, 7, 9, 0F,0F, -1F, -2F, 0F, -4F, -1F, 0F, -3F, -8F, 0F, 0F, -7F, 0F, 0F, -8F, 0F, 1F, -6F, 0F, 1F, -2F, 0F, 0F, 0F); // Box 180
		bodyModel[157].setRotationPoint(83F, -62F, 7F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 54, 9, 4, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -1F, 0F, -2F, -2F, 0F, 0F, 0F); // Box 181
		bodyModel[158].setRotationPoint(83F, -47F, 15F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 54, 10, 3, 0F,0F, 0F, -2F, 0F, 2F, 0F, 0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -5F, 0F, 0F, -5F, -2F, 0F, 0F, 0F); // Box 182
		bodyModel[159].setRotationPoint(83F, -38F, 16F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 54, 7, 8, 0F,0F, 0F, -7F, 0F, 5F, -5F, 0F, 5F, -2F, 0F, 0F, 0F, 0F, -1F, -4F, 0F, -6F, -1F, 0F, -5F, -7F, 0F, 0F, -4F); // Box 183
		bodyModel[160].setRotationPoint(83F, -28F, 11F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 16, 8, 6, 0F,0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, -1F, -5F, 0F, 0F, -4F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 184
		bodyModel[161].setRotationPoint(-200F, -55F, 13F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 16, 7, 11, 0F,0F, -4F, -2F, 0F, -1F, -4F, 0F, 0F, -7F, 0F, -3F, -9F, 0F, 1F, -8F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 1F, -2F); // Box 185
		bodyModel[162].setRotationPoint(-200F, -62F, 5F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 56, 7, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -6F, 0F, 0F, 0F); // Box 186
		bodyModel[163].setRotationPoint(137F, -47F, 0F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 56, 7, 16, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -7F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 187
		bodyModel[164].setRotationPoint(137F, -54F, 0F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 56, 5, 14, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -8F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -5F, 0F, 0F, 0F); // Box 188
		bodyModel[165].setRotationPoint(137F, -59F, 0F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 56, 7, 17, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, -6F, 0F, 0F, 0F); // Box 189
		bodyModel[166].setRotationPoint(137F, -40F, 0F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 56, 7, 17, 0F,0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, -10F, 0F, 0F, -5F); // Box 190
		bodyModel[167].setRotationPoint(137F, -33F, 0F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 17, 4, 3, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, 0F, 0F); // Box 191
		bodyModel[168].setRotationPoint(193F, -47F, 8F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 17, 5, 3, 0F,0F, 0F, -2F, 0F, 1F, 0F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, 1F, 0F, -3F, -3F, 0F, 0F, 0F); // Box 192
		bodyModel[169].setRotationPoint(193F, -43F, 8F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 17, 5, 7, 0F,0F, 0F, -6F, 0F, 3F, -3F, 0F, 3F, -3F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -5F, -1F, 0F, -4F, -6F, 0F, 0F, -4F); // Box 193
		bodyModel[170].setRotationPoint(193F, -38F, 4F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 33, 8, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F); // Box 194
		bodyModel[171].setRotationPoint(-184F, -21F, 0F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 16, 8, 15, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -4F, -8F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -8F, -1F, -6F); // Box 195
		bodyModel[172].setRotationPoint(-200F, -21F, 0F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 8, 8, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -1F, 0F, -5F, -1F, -6F, 0F, 0F, -6F); // Box 196
		bodyModel[173].setRotationPoint(-151F, -21F, 0F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 7, 3, 3, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, 0F, 0F); // Box 197
		bodyModel[174].setRotationPoint(210F, -47F, 6F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 7, 3, 3, 0F,0F, 0F, -2F, 0F, 1F, 0F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 1F, 0F, -1F, -3F, 0F, 0F, -1F); // Box 198
		bodyModel[175].setRotationPoint(210F, -44F, 6F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 7, 4, 5, 0F,0F, 0F, -4F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -3F, -1F, 0F, -2F, -4F, 0F, 0F, -3F); // Box 199
		bodyModel[176].setRotationPoint(210F, -41F, 3F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 21, 6, 4, 0F,0F, 0F, 0F, 0F, -2F, 2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 200
		bodyModel[177].setRotationPoint(193F, -47F, 11F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 30, 10, 5, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 201
		bodyModel[178].setRotationPoint(163F, -49F, 10F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 19, 10, 5, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 202
		bodyModel[179].setRotationPoint(144F, -49F, 10F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 30, 10, 80, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, -13F, -4F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, -13F, -4F, 0F); // Box 203
		bodyModel[180].setRotationPoint(163F, -49F, 15F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 30, 10, 80, 0F,0F, -3F, 0F, -11F, 0F, 0F, 2F, -4F, 0F, -21F, -4F, -2F, 0F, -3F, 0F, -11F, 0F, 0F, 2F, -4F, 0F, -21F, -4F, -2F); // Box 204
		bodyModel[181].setRotationPoint(144F, -49F, 15F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 21, 10, 80, 0F,0F, -2F, 0F, 0F, -4F, 0F, -7F, -5F, -2F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, -5F, 0F, -7F, -4F, -2F, 0F, -4F, 0F); // Box 205
		bodyModel[182].setRotationPoint(193F, -49F, 15F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 17, 1, 7, 0F,0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, -2F, 0F, 0F, 0F); // Box 206
		bodyModel[183].setRotationPoint(193F, -34F, 0F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 7, 1, 5, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, 0F, 0F); // Box 207
		bodyModel[184].setRotationPoint(210F, -38F, 0F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 41, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 208
		bodyModel[185].setRotationPoint(-184F, -22F, 0F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 54, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 209
		bodyModel[186].setRotationPoint(-143F, -22F, 0F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 36, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		bodyModel[187].setRotationPoint(-143F, -62F, 0F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 6, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
		bodyModel[188].setRotationPoint(-184F, -62F, 0F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 16, 1, 9, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -2F); // Box 212
		bodyModel[189].setRotationPoint(-200F, -62F, 0F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 16, 1, 13, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -2F, -2F); // Box 213
		bodyModel[190].setRotationPoint(-200F, -22F, 0F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 52, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 214
		bodyModel[191].setRotationPoint(31F, -62F, 0F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 76, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 215
		bodyModel[192].setRotationPoint(7F, -22F, 0F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 54, 1, 15, 0F,0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, -3F, 0F, 0F, 0F); // Box 216
		bodyModel[193].setRotationPoint(83F, -22F, 0F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 54, 1, 9, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, -1F, 0F, 0F, 0F); // Box 217
		bodyModel[194].setRotationPoint(83F, -62F, 0F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 43, 17, 79, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 218
		bodyModel[195].setRotationPoint(-72F, -55F, 19F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 43, 10, 100, 0F,0F, -6F, 0F, 0F, -6F, 0F, -9F, 0F, 0F, -4F, 0F, 0F, 0F, 13F, 0F, 0F, 13F, 0F, -9F, 0F, 0F, -4F, 0F, 0F); // Box 219
		bodyModel[196].setRotationPoint(-72F, -61F, 98F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 20, 10, 105, 0F,6F, -7F, 0F, 4F, -7F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 6F, 7F, 0F, 4F, 7F, 0F, -9F, -6F, 0F, 0F, -6F, 0F); // Box 220
		bodyModel[197].setRotationPoint(-62F, -68F, 198F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 1, 10, 105, 0F,6F, -10F, 0F, 3F, -7F, 0F, 9F, 0F, 0F, -4F, -1F, 0F, 6F, 4F, 0F, 3F, 7F, 0F, 9F, -6F, 0F, -4F, -7F, 0F); // Box 221
		bodyModel[198].setRotationPoint(-72F, -68F, 198F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 15, 10, 100, 0F,0F, -11F, 0F, 0F, -6F, 0F, 4F, 0F, 0F, -9F, -3F, 0F, 0F, 8F, 0F, 0F, 13F, 0F, 4F, 0F, 0F, -9F, -3F, 0F); // Box 222
		bodyModel[199].setRotationPoint(-87F, -61F, 98F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 15, 17, 79, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 223
		bodyModel[200].setRotationPoint(-87F, -55F, 19F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 27, 17, 79, 0F,0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[201].setRotationPoint(-29F, -55F, 19F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 32, 10, 100, 0F,-9F, -6F, 0F, 4F, -14F, 0F, -9F, -5F, 0F, 0F, 0F, 0F, -9F, 13F, 0F, 4F, 5F, 0F, -9F, -4F, 0F, 0F, 0F, 0F); // Box 225
		bodyModel[202].setRotationPoint(-38F, -61F, 98F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 28, 10, 105, 0F,-13F, -7F, 0F, 8F, -12F, 0F, -9F, -1F, 0F, 0F, 0F, 0F, -13F, 7F, 0F, 8F, 3F, 0F, -9F, -8F, 0F, 0F, -6F, 0F); // Box 226
		bodyModel[203].setRotationPoint(-51F, -68F, 198F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 11, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, -4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, -4F, -2F, 0F); // Box 227
		bodyModel[204].setRotationPoint(-62F, -68F, 303F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 13, 4, 12, 0F,0F, -1F, 0F, -7F, 0F, 0F, -3F, -1F, 0F, -3F, -1F, -4F, 0F, -1F, 0F, -7F, 0F, 0F, -3F, -2F, 0F, -3F, -2F, -4F); // Box 228
		bodyModel[205].setRotationPoint(-68F, -68F, 303F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 22, 4, 12, 0F,-3F, 0F, 0F, 0F, -1F, 0F, -6F, -1F, -4F, 0F, -1F, 0F, -3F, 0F, 0F, 0F, -2F, 0F, -6F, -2F, -4F, 0F, -2F, 0F); // Box 229
		bodyModel[206].setRotationPoint(-54F, -68F, 303F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 36, 58, 5, 0F,-16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 230
		bodyModel[207].setRotationPoint(148F, -114F, 0F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 28, 58, 5, 0F,-21F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -21F, 0F, -4F, 0F, -3F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, -3F, -4F); // Box 231
		bodyModel[208].setRotationPoint(136F, -114F, 0F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 26, 45, 5, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 232
		bodyModel[209].setRotationPoint(184F, -114F, 0F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 26, 13, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, -3F, 0F, -7F, -3F, -4F, 0F, 0F, 0F); // Box 233
		bodyModel[210].setRotationPoint(184F, -69F, 0F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 23, 12, 5, 0F,0F, 0F, 0F, -8F, -2F, 0F, -8F, -2F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 234
		bodyModel[211].setRotationPoint(184F, -126F, 0F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 20, 12, 5, 0F,-12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -12F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		bodyModel[212].setRotationPoint(164F, -126F, 0F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 19, 12, 5, 0F,-7F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -7F, -3F, -4F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, -4F); // Box 236
		bodyModel[213].setRotationPoint(157F, -126F, 0F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -2F); // Box 237
		bodyModel[214].setRotationPoint(-202F, -59F, 0F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -2F); // Box 238
		bodyModel[215].setRotationPoint(-204F, -58F, 0F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 2, 1, 11, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F); // Box 239
		bodyModel[216].setRotationPoint(-202F, -24F, 0F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 4F, 0F, 0F, -2F); // Box 240
		bodyModel[217].setRotationPoint(-206F, -25F, 0F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 1F, 0F, 4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 1F); // Box 241
		bodyModel[218].setRotationPoint(-210F, -58F, 2F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,-2F, -4F, -5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2F, -4F, 5F, -2F, 4F, -5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 4F, 5F); // Box 242
		bodyModel[219].setRotationPoint(-208F, -58F, 4F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.6F, 0F, 0F, 4.6F, 0F, 0F, 0F); // Box 243
		bodyModel[220].setRotationPoint(-206F, -54F, 9F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		bodyModel[221].setRotationPoint(-206F, -54F, 4F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, 2F, 3F, 0F, 2F); // Box 245
		bodyModel[222].setRotationPoint(-206F, -54F, 9F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 1F, 1F, 0F, 1F); // Box 246
		bodyModel[223].setRotationPoint(-209F, -48F, 11F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[224].setRotationPoint(-210F, -45F, 12F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, -3F, 0F, -3F); // Box 248
		bodyModel[225].setRotationPoint(-210F, -35F, 12F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, 2F, 4F, 0F, 2F); // Box 249
		bodyModel[226].setRotationPoint(-210F, -54F, 3F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[227].setRotationPoint(-214F, -45F, 5F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 251
		bodyModel[228].setRotationPoint(-210F, -45F, 6F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 0F); // Box 252
		bodyModel[229].setRotationPoint(-210F, -45F, 12F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -5.4F, 0F, 0F, 5.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 0F); // Box 253
		bodyModel[230].setRotationPoint(-209F, -48F, 11F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -4.6F, 0F, 0F, 4.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.4F, 0F, 0F, 4.4F, 0F, 0F, 0F); // Box 254
		bodyModel[231].setRotationPoint(-210F, -36F, 12F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 255
		bodyModel[232].setRotationPoint(-210F, -36F, 6F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 256
		bodyModel[233].setRotationPoint(-214F, -45F, 0F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 257
		bodyModel[234].setRotationPoint(-214F, -36F, 0F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 258
		bodyModel[235].setRotationPoint(-214F, -44F, 1F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 259
		bodyModel[236].setRotationPoint(-210F, -54F, 0F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 2F, 3F, 0F, 2F, 3F, 0F, -2F, -3F, 0F, -2F); // Box 260
		bodyModel[237].setRotationPoint(-214F, -35F, 5F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, -4F, 1F, 0F, -4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 1F, 0F, 4F, -1F, 0F, 0F, 0F); // Box 261
		bodyModel[238].setRotationPoint(-211F, -29F, 3F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 262
		bodyModel[239].setRotationPoint(-207F, -29F, 4F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -6.2F, 0F, 0F, 6.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 0F); // Box 263
		bodyModel[240].setRotationPoint(-207F, -29F, 9F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 264
		bodyModel[241].setRotationPoint(-211F, -29F, 0F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,-2F, 4F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 4F, 1F, -2F, -4F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2F, -4F, 1F); // Box 265
		bodyModel[242].setRotationPoint(-209F, -25F, 8F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 17, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 282
		bodyModel[243].setRotationPoint(-160F, -62F, 0F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[244].setRotationPoint(-178F, -62F, 3F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,-6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 284
		bodyModel[245].setRotationPoint(-166F, -62F, 3F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,-6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 285
		bodyModel[246].setRotationPoint(-95F, -62F, 3F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 286
		bodyModel[247].setRotationPoint(-107F, -62F, 3F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,-6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 287
		bodyModel[248].setRotationPoint(25F, -62F, 3F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 288
		bodyModel[249].setRotationPoint(13F, -62F, 3F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 6, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 289
		bodyModel[250].setRotationPoint(7F, -62F, 0F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 7, 6, 3, 0F,-4F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -3F, -4F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 290
		bodyModel[251].setRotationPoint(210F, -53F, 6F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 291
		bodyModel[252].setRotationPoint(214F, -53F, 2F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 292
		bodyModel[253].setRotationPoint(214F, -56F, 0F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 293
		bodyModel[254].setRotationPoint(193F, -53F, 8F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 294
		bodyModel[255].setRotationPoint(203F, -53F, 8F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.9F); // Box 295
		bodyModel[256].setRotationPoint(202F, -53F, 8F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 296
		bodyModel[257].setRotationPoint(202F, -53F, 6F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 297
		bodyModel[258].setRotationPoint(202F, -57F, 3F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
		bodyModel[259].setRotationPoint(202F, -59F, 0F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 299
		bodyModel[260].setRotationPoint(193F, -57F, 5F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 7, 2, 7, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 300
		bodyModel[261].setRotationPoint(217F, -47F, 0F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 7, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -4F, 0F, 0F, -1F); // Box 301
		bodyModel[262].setRotationPoint(217F, -45F, 0F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 6, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, -4F, 0F, 0F, -2F); // Box 302
		bodyModel[263].setRotationPoint(217F, -42F, 0F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 4, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 303
		bodyModel[264].setRotationPoint(217F, -47F, 0F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 304
		bodyModel[265].setRotationPoint(217F, -53F, 6F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305
		bodyModel[266].setRotationPoint(217F, -53F, 2F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 306
		bodyModel[267].setRotationPoint(217F, -56F, 0F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 16, 1, 17, 0F,0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 352
		bodyModel[268].setRotationPoint(-200F, -32F, -17F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 24, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 353
		bodyModel[269].setRotationPoint(-184F, -32F, -18F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 354
		bodyModel[270].setRotationPoint(-185F, -31F, -5F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 355
		bodyModel[271].setRotationPoint(-161F, -31F, -5F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 16, 1, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F); // Box 357
		bodyModel[272].setRotationPoint(-200F, -32F, 0F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 8, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 358
		bodyModel[273].setRotationPoint(-184F, -32F, 4F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 359
		bodyModel[274].setRotationPoint(-185F, -31F, 4F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 360
		bodyModel[275].setRotationPoint(-177F, -31F, 4F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 3, 30, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 721
		bodyModel[276].setRotationPoint(9F, -60F, -3F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 2, 30, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 722
		bodyModel[277].setRotationPoint(7F, -60F, -3F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 2, 30, 6, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 723
		bodyModel[278].setRotationPoint(12F, -60F, -3F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 24, 4, 9, 0F,0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 724
		bodyModel[279].setRotationPoint(6F, -30F, -4F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 24, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 725
		bodyModel[280].setRotationPoint(6F, -26F, -4F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 1, 13, 10, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 726
		bodyModel[281].setRotationPoint(15.25F, -60.5F, -5F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 1, 12, 8, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 727
		bodyModel[282].setRotationPoint(16.25F, -59.5F, -4F);

		bodyModel[283].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 728
		bodyModel[283].setRotationPoint(15.25F, -48.5F, -5F);
		bodyModel[283].rotateAngleZ = 0.10471976F;

		bodyModel[284].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 729
		bodyModel[284].setRotationPoint(15.25F, -48.5F, -5F);
		bodyModel[284].rotateAngleZ = 0.10471976F;

		bodyModel[285].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 730
		bodyModel[285].setRotationPoint(15.25F, -48.5F, 4F);
		bodyModel[285].rotateAngleZ = 0.10471976F;

		bodyModel[286].addShapeBox(0F, 1F, 0F, 10, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 731
		bodyModel[286].setRotationPoint(15.25F, -48.5F, -5F);
		bodyModel[286].rotateAngleZ = 0.10471976F;

		bodyModel[287].addShapeBox(9F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 732
		bodyModel[287].setRotationPoint(15.25F, -48.5F, -5F);
		bodyModel[287].rotateAngleZ = 0.10471976F;

		bodyModel[288].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 389
		bodyModel[288].setRotationPoint(-104.75F, -48.5F, -5F);
		bodyModel[288].rotateAngleZ = 0.10471976F;

		bodyModel[289].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 390
		bodyModel[289].setRotationPoint(-104.75F, -48.5F, 4F);
		bodyModel[289].rotateAngleZ = 0.10471976F;

		bodyModel[290].addShapeBox(0F, 1F, 0F, 10, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 391
		bodyModel[290].setRotationPoint(-104.75F, -48.5F, -5F);
		bodyModel[290].rotateAngleZ = 0.10471976F;

		bodyModel[291].addShapeBox(9F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 392
		bodyModel[291].setRotationPoint(-104.75F, -48.5F, -5F);
		bodyModel[291].rotateAngleZ = 0.10471976F;

		bodyModel[292].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 393
		bodyModel[292].setRotationPoint(-104.75F, -48.5F, -5F);
		bodyModel[292].rotateAngleZ = 0.10471976F;

		bodyModel[293].addShapeBox(0F, 0F, 0F, 1, 12, 8, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[293].setRotationPoint(-103.75F, -59.5F, -4F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 1, 13, 10, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 395
		bodyModel[294].setRotationPoint(-104.75F, -60.5F, -5F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 2, 30, 6, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 396
		bodyModel[295].setRotationPoint(-108F, -60F, -3F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 3, 30, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 397
		bodyModel[296].setRotationPoint(-111F, -60F, -3F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 2, 30, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 398
		bodyModel[297].setRotationPoint(-113F, -60F, -3F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 24, 4, 9, 0F,0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 399
		bodyModel[298].setRotationPoint(-114F, -30F, -4F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 24, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 400
		bodyModel[299].setRotationPoint(-114F, -26F, -4F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 5, 9, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 684
		bodyModel[300].setRotationPoint(-201F, -44F, -17F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 5, 4, 14, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 685
		bodyModel[301].setRotationPoint(-201F, -48F, -17F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 686
		bodyModel[302].setRotationPoint(-201F, -35F, -3F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 13, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 690
		bodyModel[303].setRotationPoint(-195F, -37F, -2F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 691
		bodyModel[304].setRotationPoint(-194F, -38F, -1F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 692
		bodyModel[305].setRotationPoint(-194F, -39F, -1F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 693
		bodyModel[306].setRotationPoint(-194F, -39F, 1F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 695
		bodyModel[307].setRotationPoint(-192F, -41F, -2F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 696
		bodyModel[308].setRotationPoint(-192F, -42F, -2F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 697
		bodyModel[309].setRotationPoint(-192F, -43F, -2F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 264
		bodyModel[310].setRotationPoint(-194F, -46F, -8.5F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 786
		bodyModel[311].setRotationPoint(-194F, -45.75F, -7.5F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 789
		bodyModel[312].setRotationPoint(-194F, -45.75F, -11.5F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 791
		bodyModel[313].setRotationPoint(-194F, -48.75F, -11.5F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 792
		bodyModel[314].setRotationPoint(-194F, -48.75F, -5.5F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1114
		bodyModel[315].setRotationPoint(-196F, -43.5F, -12.5F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 2, 15, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1115
		bodyModel[316].setRotationPoint(-196F, -43.5F, -14.5F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 1116
		bodyModel[317].setRotationPoint(-196F, -41.5F, -12.5F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 1117
		bodyModel[318].setRotationPoint(-196F, -43.5F, -7.5F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 420
		bodyModel[319].setRotationPoint(-191F, -41F, 0F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 1, 12, 8, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 421
		bodyModel[320].setRotationPoint(195.25F, -48.5F, -4F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 1, 13, 10, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 422
		bodyModel[321].setRotationPoint(194.25F, -49.5F, -5F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 423
		bodyModel[322].setRotationPoint(194.25F, -37.5F, -5F);
		bodyModel[322].rotateAngleZ = 0.10471976F;

		bodyModel[323].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 424
		bodyModel[323].setRotationPoint(194.25F, -37.5F, -5F);
		bodyModel[323].rotateAngleZ = 0.10471976F;

		bodyModel[324].addShapeBox(0F, 1F, 0F, 10, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 425
		bodyModel[324].setRotationPoint(194.25F, -37.5F, -5F);
		bodyModel[324].rotateAngleZ = 0.10471976F;

		bodyModel[325].addShapeBox(9F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 426
		bodyModel[325].setRotationPoint(194.25F, -37.5F, -5F);
		bodyModel[325].rotateAngleZ = 0.10471976F;

		bodyModel[326].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 427
		bodyModel[326].setRotationPoint(194.25F, -37.5F, 4F);
		bodyModel[326].rotateAngleZ = 0.10471976F;
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 1897, 65, textureX, textureY); // Box 316
		leftWingModel[1] = new ModelRendererTurbo(this, 417, 73, textureX, textureY); // Box 317
		leftWingModel[2] = new ModelRendererTurbo(this, 625, 73, textureX, textureY); // Box 318
		leftWingModel[3] = new ModelRendererTurbo(this, 1881, 113, textureX, textureY); // Box 319
		leftWingModel[4] = new ModelRendererTurbo(this, 1601, 73, textureX, textureY); // Box 320
		leftWingModel[5] = new ModelRendererTurbo(this, 1801, 89, textureX, textureY); // Box 321
		leftWingModel[6] = new ModelRendererTurbo(this, 1273, 81, textureX, textureY); // Box 322
		leftWingModel[7] = new ModelRendererTurbo(this, 1273, 137, textureX, textureY); // Box 323
		leftWingModel[8] = new ModelRendererTurbo(this, 1385, 137, textureX, textureY); // Box 324
		leftWingModel[9] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Box 325
		leftWingModel[10] = new ModelRendererTurbo(this, 273, 81, textureX, textureY); // Box 326
		leftWingModel[11] = new ModelRendererTurbo(this, 137, 97, textureX, textureY); // Box 327
		leftWingModel[12] = new ModelRendererTurbo(this, 681, 73, textureX, textureY); // Box 328
		leftWingModel[13] = new ModelRendererTurbo(this, 473, 81, textureX, textureY); // Box 329
		leftWingModel[14] = new ModelRendererTurbo(this, 1457, 81, textureX, textureY); // Box 330
		leftWingModel[15] = new ModelRendererTurbo(this, 329, 145, textureX, textureY); // Box 124
		leftWingModel[16] = new ModelRendererTurbo(this, 497, 105, textureX, textureY); // Box 344
		leftWingModel[17] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 345
		leftWingModel[18] = new ModelRendererTurbo(this, 1105, 121, textureX, textureY); // Box 346
		leftWingModel[19] = new ModelRendererTurbo(this, 193, 73, textureX, textureY); // Box 350
		leftWingModel[20] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 154
		leftWingModel[21] = new ModelRendererTurbo(this, 697, 137, textureX, textureY); // Box 155
		leftWingModel[22] = new ModelRendererTurbo(this, 425, 145, textureX, textureY); // Box 156
		leftWingModel[23] = new ModelRendererTurbo(this, 1521, 241, textureX, textureY); // Box 266
		leftWingModel[24] = new ModelRendererTurbo(this, 185, 249, textureX, textureY); // Box 267
		leftWingModel[25] = new ModelRendererTurbo(this, 753, 249, textureX, textureY); // Box 268
		leftWingModel[26] = new ModelRendererTurbo(this, 1713, 249, textureX, textureY); // Box 269
		leftWingModel[27] = new ModelRendererTurbo(this, 905, 313, textureX, textureY); // Box 270
		leftWingModel[28] = new ModelRendererTurbo(this, 1177, 313, textureX, textureY); // Box 271
		leftWingModel[29] = new ModelRendererTurbo(this, 841, 257, textureX, textureY); // Box 272
		leftWingModel[30] = new ModelRendererTurbo(this, 1041, 257, textureX, textureY); // Box 273
		leftWingModel[31] = new ModelRendererTurbo(this, 1289, 313, textureX, textureY); // Box 274
		leftWingModel[32] = new ModelRendererTurbo(this, 1841, 233, textureX, textureY); // Box 275
		leftWingModel[33] = new ModelRendererTurbo(this, 1393, 249, textureX, textureY); // Box 276
		leftWingModel[34] = new ModelRendererTurbo(this, 1, 265, textureX, textureY); // Box 277
		leftWingModel[35] = new ModelRendererTurbo(this, 1577, 241, textureX, textureY); // Box 278
		leftWingModel[36] = new ModelRendererTurbo(this, 1121, 257, textureX, textureY); // Box 279
		leftWingModel[37] = new ModelRendererTurbo(this, 1185, 257, textureX, textureY); // Box 280
		leftWingModel[38] = new ModelRendererTurbo(this, 1713, 297, textureX, textureY); // Box 281
		leftWingModel[39] = new ModelRendererTurbo(this, 449, 265, textureX, textureY); // Box 307
		leftWingModel[40] = new ModelRendererTurbo(this, 617, 265, textureX, textureY); // Box 308
		leftWingModel[41] = new ModelRendererTurbo(this, 1313, 265, textureX, textureY); // Box 309
		leftWingModel[42] = new ModelRendererTurbo(this, 1177, 97, textureX, textureY); // Box 310
		leftWingModel[43] = new ModelRendererTurbo(this, 1601, 281, textureX, textureY); // Box 311
		leftWingModel[44] = new ModelRendererTurbo(this, 185, 289, textureX, textureY); // Box 312
		leftWingModel[45] = new ModelRendererTurbo(this, 753, 289, textureX, textureY); // Box 313

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 11, 10, 30, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 316
		leftWingModel[0].setRotationPoint(-110F, -52F, -89F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 11, 9, 30, 0F,0F, 0F, -10F, 0F, 1F, -9F, 0F, 1F, -9F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 317
		leftWingModel[1].setRotationPoint(-110F, -61F, -89F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 11, 9, 30, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 1F, -9F, 0F, 1F, -9F, 0F, 0F, -10F); // Box 318
		leftWingModel[2].setRotationPoint(-110F, -42F, -89F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 41, 10, 32, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 319
		leftWingModel[3].setRotationPoint(-99F, -52F, -90F);

		leftWingModel[4].addShapeBox(0F, 0F, 0F, 20, 10, 32, 0F,0F, 0F, -10F, 0F, -0.5F, -12F, 0F, -0.5F, -12F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 320
		leftWingModel[4].setRotationPoint(-99F, -62F, -90F);

		leftWingModel[5].addShapeBox(0F, 0F, 0F, 21, 10, 32, 0F,0F, -0.5F, -12F, 0F, -3F, -14F, 0F, -3F, -14F, 0F, -0.5F, -12F, 0F, 0F, -1.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -1.5F); // Box 321
		leftWingModel[5].setRotationPoint(-79F, -62F, -90F);

		leftWingModel[6].addShapeBox(0F, 0F, 0F, 26, 10, 26, 0F,0F, 0F, 0F, 8F, 0F, -7F, 8F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F); // Box 322
		leftWingModel[6].setRotationPoint(-58F, -52F, -87F);

		leftWingModel[7].addShapeBox(0F, 0F, 0F, 26, 10, 26, 0F,0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, -2F, -8F, -12F, -5F, -7F, -12F, -5F, -7F, 0F, -2F, -8F); // Box 323
		leftWingModel[7].setRotationPoint(-58F, -42F, -87F);

		leftWingModel[8].addShapeBox(0F, 0F, 0F, 41, 10, 32, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, -2F, -11F, 0F, -2F, -11F, 0F, 0F, -10F); // Box 324
		leftWingModel[8].setRotationPoint(-99F, -42F, -90F);

		leftWingModel[9].addShapeBox(0F, 0F, 0F, 7, 9, 30, 0F,0F, -4.5F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, -4.5F, -10F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 325
		leftWingModel[9].setRotationPoint(-117F, -61F, -89F);

		leftWingModel[10].addShapeBox(0F, 0F, 0F, 7, 9, 30, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -4.5F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, -4.5F, -10F); // Box 326
		leftWingModel[10].setRotationPoint(-117F, -42F, -89F);

		leftWingModel[11].addShapeBox(0F, 0F, 0F, 7, 10, 30, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 327
		leftWingModel[11].setRotationPoint(-117F, -52F, -89F);

		leftWingModel[12].addShapeBox(0F, 0F, 0F, 18, 4, 12, 0F,0F, -1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -5F, 0F, -1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -5F); // Box 328
		leftWingModel[12].setRotationPoint(-135F, -49F, -80F);

		leftWingModel[13].addShapeBox(0F, 0F, 0F, 18, 4, 12, 0F,-3F, -2.5F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, -3F, -2.5F, -5F, 0F, 1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -5F); // Box 329
		leftWingModel[13].setRotationPoint(-135F, -53F, -80F);

		leftWingModel[14].addShapeBox(0F, 0F, 0F, 18, 4, 12, 0F,0F, 1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -5F, -3F, -2.5F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, -3F, -2.5F, -5F); // Box 330
		leftWingModel[14].setRotationPoint(-135F, -45F, -80F);

		leftWingModel[15].addShapeBox(0F, 0F, 0F, 34, 7, 26, 0F,0F, 0F, -11F, 0F, -6F, -7F, 0F, -6F, -7F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F); // Box 124
		leftWingModel[15].setRotationPoint(-58F, -59F, -87F);

		leftWingModel[16].addShapeBox(0F, 0F, 0F, 24, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 344
		leftWingModel[16].setRotationPoint(-95F, -6F, -83.5F);

		leftWingModel[17].addShapeBox(0F, 0F, 0F, 24, 8, 8, 0F,-8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 345
		leftWingModel[17].setRotationPoint(-95F, -14F, -83.5F);

		leftWingModel[18].addShapeBox(0F, 0F, 0F, 24, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F); // Box 346
		leftWingModel[18].setRotationPoint(-95F, 2F, -83.5F);

		leftWingModel[19].addShapeBox(0F, 0F, 0F, 3, 36, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 350
		leftWingModel[19].setRotationPoint(-84.5F, -34F, -75.5F);

		leftWingModel[20].addShapeBox(0F, 0F, 0F, 24, 8, 8, 0F,-8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		leftWingModel[20].setRotationPoint(-95F, -14F, -72.5F);

		leftWingModel[21].addShapeBox(0F, 0F, 0F, 24, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		leftWingModel[21].setRotationPoint(-95F, -6F, -72.5F);

		leftWingModel[22].addShapeBox(0F, 0F, 0F, 24, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F); // Box 156
		leftWingModel[22].setRotationPoint(-95F, 2F, -72.5F);

		leftWingModel[23].addShapeBox(0F, 0F, 0F, 11, 10, 30, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 266
		leftWingModel[23].setRotationPoint(-110F, -52F, 59F);

		leftWingModel[24].addShapeBox(0F, 0F, 0F, 11, 9, 30, 0F,0F, 0F, -10F, 0F, 1F, -9F, 0F, 1F, -9F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 267
		leftWingModel[24].setRotationPoint(-110F, -61F, 59F);

		leftWingModel[25].addShapeBox(0F, 0F, 0F, 11, 9, 30, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 1F, -9F, 0F, 1F, -9F, 0F, 0F, -10F); // Box 268
		leftWingModel[25].setRotationPoint(-110F, -42F, 59F);

		leftWingModel[26].addShapeBox(0F, 0F, 0F, 41, 10, 32, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 269
		leftWingModel[26].setRotationPoint(-99F, -52F, 58F);

		leftWingModel[27].addShapeBox(0F, 0F, 0F, 20, 10, 32, 0F,0F, 0F, -10F, 0F, -0.5F, -12F, 0F, -0.5F, -12F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 270
		leftWingModel[27].setRotationPoint(-99F, -62F, 58F);

		leftWingModel[28].addShapeBox(0F, 0F, 0F, 21, 10, 32, 0F,0F, -0.5F, -12F, 0F, -3F, -14F, 0F, -3F, -14F, 0F, -0.5F, -12F, 0F, 0F, -1.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -1.5F); // Box 271
		leftWingModel[28].setRotationPoint(-79F, -62F, 58F);

		leftWingModel[29].addShapeBox(0F, 0F, 0F, 26, 10, 26, 0F,0F, 0F, 0F, 8F, 0F, -7F, 8F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F); // Box 272
		leftWingModel[29].setRotationPoint(-58F, -52F, 61F);

		leftWingModel[30].addShapeBox(0F, 0F, 0F, 26, 10, 26, 0F,0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, -2F, -8F, -12F, -5F, -7F, -12F, -5F, -7F, 0F, -2F, -8F); // Box 273
		leftWingModel[30].setRotationPoint(-58F, -42F, 61F);

		leftWingModel[31].addShapeBox(0F, 0F, 0F, 41, 10, 32, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, -2F, -11F, 0F, -2F, -11F, 0F, 0F, -10F); // Box 274
		leftWingModel[31].setRotationPoint(-99F, -42F, 58F);

		leftWingModel[32].addShapeBox(0F, 0F, 0F, 7, 9, 30, 0F,0F, -4.5F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, -4.5F, -10F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 275
		leftWingModel[32].setRotationPoint(-117F, -61F, 59F);

		leftWingModel[33].addShapeBox(0F, 0F, 0F, 7, 9, 30, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -4.5F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, -4.5F, -10F); // Box 276
		leftWingModel[33].setRotationPoint(-117F, -42F, 59F);

		leftWingModel[34].addShapeBox(0F, 0F, 0F, 7, 10, 30, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 277
		leftWingModel[34].setRotationPoint(-117F, -52F, 59F);

		leftWingModel[35].addShapeBox(0F, 0F, 0F, 18, 4, 12, 0F,0F, -1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -5F, 0F, -1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -5F); // Box 278
		leftWingModel[35].setRotationPoint(-135F, -49F, 68F);

		leftWingModel[36].addShapeBox(0F, 0F, 0F, 18, 4, 12, 0F,-3F, -2.5F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, -3F, -2.5F, -5F, 0F, 1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -5F); // Box 279
		leftWingModel[36].setRotationPoint(-135F, -53F, 68F);

		leftWingModel[37].addShapeBox(0F, 0F, 0F, 18, 4, 12, 0F,0F, 1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -5F, -3F, -2.5F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, -3F, -2.5F, -5F); // Box 280
		leftWingModel[37].setRotationPoint(-135F, -45F, 68F);

		leftWingModel[38].addShapeBox(0F, 0F, 0F, 34, 7, 26, 0F,0F, 0F, -11F, 0F, -6F, -7F, 0F, -6F, -7F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F); // Box 281
		leftWingModel[38].setRotationPoint(-58F, -59F, 61F);

		leftWingModel[39].addShapeBox(0F, 0F, 0F, 24, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 307
		leftWingModel[39].setRotationPoint(-95F, -6F, 75.5F);

		leftWingModel[40].addShapeBox(0F, 0F, 0F, 24, 8, 8, 0F,-8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 308
		leftWingModel[40].setRotationPoint(-95F, -14F, 75.5F);

		leftWingModel[41].addShapeBox(0F, 0F, 0F, 24, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F); // Box 309
		leftWingModel[41].setRotationPoint(-95F, 2F, 75.5F);

		leftWingModel[42].addShapeBox(0F, 0F, 0F, 3, 36, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 310
		leftWingModel[42].setRotationPoint(-84.5F, -34F, 72.5F);

		leftWingModel[43].addShapeBox(0F, 0F, 0F, 24, 8, 8, 0F,-8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 311
		leftWingModel[43].setRotationPoint(-95F, -14F, 64.5F);

		leftWingModel[44].addShapeBox(0F, 0F, 0F, 24, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 312
		leftWingModel[44].setRotationPoint(-95F, -6F, 64.5F);

		leftWingModel[45].addShapeBox(0F, 0F, 0F, 24, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F); // Box 313
		leftWingModel[45].setRotationPoint(-95F, 2F, 64.5F);
	}

	private void inittailWheelModel_1()
	{
		tailWheelModel[0] = new ModelRendererTurbo(this, 1201, 281, textureX, textureY); // Box 433
		tailWheelModel[1] = new ModelRendererTurbo(this, 273, 121, textureX, textureY); // Box 434
		tailWheelModel[2] = new ModelRendererTurbo(this, 1009, 161, textureX, textureY); // Box 435
		tailWheelModel[3] = new ModelRendererTurbo(this, 305, 121, textureX, textureY); // Box 436
		tailWheelModel[4] = new ModelRendererTurbo(this, 329, 121, textureX, textureY); // Box 437
		tailWheelModel[5] = new ModelRendererTurbo(this, 1105, 161, textureX, textureY); // Box 438
		tailWheelModel[6] = new ModelRendererTurbo(this, 1145, 161, textureX, textureY); // Box 439
		tailWheelModel[7] = new ModelRendererTurbo(this, 1777, 161, textureX, textureY); // Box 440

		tailWheelModel[0].addShapeBox(0F, 0F, 0F, 16, 7, 4, 0F,0F, -4F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -4F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F); // Box 433
		tailWheelModel[0].setRotationPoint(180F, -36F, -2F);

		tailWheelModel[1].addShapeBox(0F, 0F, 0F, 10, 2, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F); // Box 434
		tailWheelModel[1].setRotationPoint(188F, -29F, -2F);

		tailWheelModel[2].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 435
		tailWheelModel[2].setRotationPoint(194F, -27F, -3F);

		tailWheelModel[3].addShapeBox(0F, 0F, 0F, 9, 5, 1, 0F,-4F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -4F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 436
		tailWheelModel[3].setRotationPoint(194F, -27F, -3F);

		tailWheelModel[4].addShapeBox(0F, 0F, 0F, 9, 5, 1, 0F,-4F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -4F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 437
		tailWheelModel[4].setRotationPoint(194F, -27F, 2F);

		tailWheelModel[5].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 438
		tailWheelModel[5].setRotationPoint(197F, -25F, -2F);

		tailWheelModel[6].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 439
		tailWheelModel[6].setRotationPoint(197F, -29F, -2F);

		tailWheelModel[7].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 440
		tailWheelModel[7].setRotationPoint(197F, -21F, -2F);
	}

	private void initplaneModeParts_1()
	{
		planeModeParts[0] = new ModelRendererTurbo(this, 1489, 105, textureX, textureY); // Box 239
		planeModeParts[1] = new ModelRendererTurbo(this, 73, 89, textureX, textureY); // Box 240
		planeModeParts[2] = new ModelRendererTurbo(this, 2001, 81, textureX, textureY); // Box 241
		planeModeParts[3] = new ModelRendererTurbo(this, 2025, 81, textureX, textureY); // Box 242
		planeModeParts[4] = new ModelRendererTurbo(this, 273, 89, textureX, textureY); // Box 243
		planeModeParts[5] = new ModelRendererTurbo(this, 1801, 89, textureX, textureY); // Box 244
		planeModeParts[6] = new ModelRendererTurbo(this, 1457, 57, textureX, textureY); // Box 245
		planeModeParts[7] = new ModelRendererTurbo(this, 321, 89, textureX, textureY); // Box 246
		planeModeParts[8] = new ModelRendererTurbo(this, 633, 49, textureX, textureY); // Box 247
		planeModeParts[9] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 248
		planeModeParts[10] = new ModelRendererTurbo(this, 929, 65, textureX, textureY); // Box 250
		planeModeParts[11] = new ModelRendererTurbo(this, 209, 73, textureX, textureY); // Box 251
		planeModeParts[12] = new ModelRendererTurbo(this, 417, 89, textureX, textureY); // Box 252
		planeModeParts[13] = new ModelRendererTurbo(this, 625, 89, textureX, textureY); // Box 253
		planeModeParts[14] = new ModelRendererTurbo(this, 313, 57, textureX, textureY); // Box 962
		planeModeParts[15] = new ModelRendererTurbo(this, 521, 57, textureX, textureY); // Box 964
		planeModeParts[16] = new ModelRendererTurbo(this, 1585, 57, textureX, textureY); // Box 966
		planeModeParts[17] = new ModelRendererTurbo(this, 1681, 33, textureX, textureY); // Box 782
		planeModeParts[18] = new ModelRendererTurbo(this, 1697, 33, textureX, textureY); // Box 783
		planeModeParts[19] = new ModelRendererTurbo(this, 57, 121, textureX, textureY); // Box 333
		planeModeParts[20] = new ModelRendererTurbo(this, 1353, 89, textureX, textureY); // Box 334
		planeModeParts[21] = new ModelRendererTurbo(this, 745, 89, textureX, textureY); // Box 335
		planeModeParts[22] = new ModelRendererTurbo(this, 1881, 89, textureX, textureY); // Box 336
		planeModeParts[23] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 337
		planeModeParts[24] = new ModelRendererTurbo(this, 137, 97, textureX, textureY); // Box 338
		planeModeParts[25] = new ModelRendererTurbo(this, 561, 89, textureX, textureY); // Box 339
		planeModeParts[26] = new ModelRendererTurbo(this, 745, 113, textureX, textureY); // Box 340
		planeModeParts[27] = new ModelRendererTurbo(this, 1625, 73, textureX, textureY); // Box 341
		planeModeParts[28] = new ModelRendererTurbo(this, 297, 89, textureX, textureY); // Box 342
		planeModeParts[29] = new ModelRendererTurbo(this, 345, 89, textureX, textureY); // Box 343
		planeModeParts[30] = new ModelRendererTurbo(this, 929, 89, textureX, textureY); // Box 344
		planeModeParts[31] = new ModelRendererTurbo(this, 17, 97, textureX, textureY); // Box 345
		planeModeParts[32] = new ModelRendererTurbo(this, 417, 97, textureX, textureY); // Box 346
		planeModeParts[33] = new ModelRendererTurbo(this, 1049, 65, textureX, textureY); // Box 347
		planeModeParts[34] = new ModelRendererTurbo(this, 1209, 65, textureX, textureY); // Box 348
		planeModeParts[35] = new ModelRendererTurbo(this, 1377, 65, textureX, textureY); // Box 349
		planeModeParts[36] = new ModelRendererTurbo(this, 1825, 33, textureX, textureY); // Box 350
		planeModeParts[37] = new ModelRendererTurbo(this, 1457, 41, textureX, textureY); // Box 351
		planeModeParts[38] = new ModelRendererTurbo(this, 1841, 41, textureX, textureY); // Box 361
		planeModeParts[39] = new ModelRendererTurbo(this, 1825, 89, textureX, textureY); // Box 362
		planeModeParts[40] = new ModelRendererTurbo(this, 161, 97, textureX, textureY); // Box 363
		planeModeParts[41] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 364
		planeModeParts[42] = new ModelRendererTurbo(this, 2001, 129, textureX, textureY); // Box 365
		planeModeParts[43] = new ModelRendererTurbo(this, 1905, 89, textureX, textureY); // Box 366
		planeModeParts[44] = new ModelRendererTurbo(this, 1881, 97, textureX, textureY); // Box 367
		planeModeParts[45] = new ModelRendererTurbo(this, 537, 97, textureX, textureY); // Box 368
		planeModeParts[46] = new ModelRendererTurbo(this, 185, 113, textureX, textureY); // Box 369
		planeModeParts[47] = new ModelRendererTurbo(this, 185, 97, textureX, textureY); // Box 370
		planeModeParts[48] = new ModelRendererTurbo(this, 209, 97, textureX, textureY); // Box 371
		planeModeParts[49] = new ModelRendererTurbo(this, 1273, 121, textureX, textureY); // Box 372
		planeModeParts[50] = new ModelRendererTurbo(this, 73, 137, textureX, textureY); // Box 373
		planeModeParts[51] = new ModelRendererTurbo(this, 1521, 97, textureX, textureY); // Box 374
		planeModeParts[52] = new ModelRendererTurbo(this, 625, 97, textureX, textureY); // Box 375
		planeModeParts[53] = new ModelRendererTurbo(this, 681, 97, textureX, textureY); // Box 376

		planeModeParts[0].addShapeBox(0F, 1F, 0F, 10, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
		planeModeParts[0].setRotationPoint(-194F, -39F, -13F);
		planeModeParts[0].rotateAngleZ = -0.10471976F;

		planeModeParts[1].addShapeBox(9F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		planeModeParts[1].setRotationPoint(-194F, -39F, -13F);
		planeModeParts[1].rotateAngleZ = -0.10471976F;

		planeModeParts[2].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		planeModeParts[2].setRotationPoint(-194F, -39F, -13F);
		planeModeParts[2].rotateAngleZ = -0.10471976F;

		planeModeParts[3].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		planeModeParts[3].setRotationPoint(-194F, -39F, -4F);
		planeModeParts[3].rotateAngleZ = -0.10471976F;

		planeModeParts[4].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		planeModeParts[4].setRotationPoint(-194F, -39F, -13F);
		planeModeParts[4].rotateAngleZ = -0.10471976F;

		planeModeParts[5].addShapeBox(0F, 0F, 0F, 1, 13, 10, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		planeModeParts[5].setRotationPoint(-185F, -51F, -13F);

		planeModeParts[6].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		planeModeParts[6].setRotationPoint(-183F, -55F, -11F);

		planeModeParts[7].addShapeBox(0F, 0F, 0F, 1, 13, 8, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 246
		planeModeParts[7].setRotationPoint(-186F, -50F, -12F);

		planeModeParts[8].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		planeModeParts[8].setRotationPoint(-186.3F, -50.3F, -10F);

		planeModeParts[9].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		planeModeParts[9].setRotationPoint(-186.3F, -50.3F, -7F);

		planeModeParts[10].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 250
		planeModeParts[10].setRotationPoint(-185F, -48F, -12F);

		planeModeParts[11].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 251
		planeModeParts[11].setRotationPoint(-185F, -48F, -5F);

		planeModeParts[12].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 252
		planeModeParts[12].setRotationPoint(-191F, -38F, -14F);
		planeModeParts[12].rotateAngleZ = 0.78539816F;

		planeModeParts[13].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 253
		planeModeParts[13].setRotationPoint(-191F, -38F, -3F);
		planeModeParts[13].rotateAngleZ = 0.78539816F;

		planeModeParts[14].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 962
		planeModeParts[14].setRotationPoint(-183.5F, -54.5F, -9.5F);

		planeModeParts[15].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 964
		planeModeParts[15].setRotationPoint(-183.5F, -53.5F, -9.5F);

		planeModeParts[16].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 966
		planeModeParts[16].setRotationPoint(-183.5F, -52.5F, -9.5F);

		planeModeParts[17].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 782
		planeModeParts[17].setRotationPoint(-190F, -37F, -12F);

		planeModeParts[18].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 783
		planeModeParts[18].setRotationPoint(-190F, -37F, -5F);

		planeModeParts[19].addShapeBox(0F, 1F, 0F, 10, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 333
		planeModeParts[19].setRotationPoint(-194F, -39F, 3F);
		planeModeParts[19].rotateAngleZ = -0.10471976F;

		planeModeParts[20].addShapeBox(9F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 334
		planeModeParts[20].setRotationPoint(-194F, -39F, 3F);
		planeModeParts[20].rotateAngleZ = -0.10471976F;

		planeModeParts[21].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 335
		planeModeParts[21].setRotationPoint(-194F, -39F, 3F);
		planeModeParts[21].rotateAngleZ = -0.10471976F;

		planeModeParts[22].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 336
		planeModeParts[22].setRotationPoint(-194F, -39F, 12F);
		planeModeParts[22].rotateAngleZ = -0.10471976F;

		planeModeParts[23].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 337
		planeModeParts[23].setRotationPoint(-194F, -39F, 3F);
		planeModeParts[23].rotateAngleZ = -0.10471976F;

		planeModeParts[24].addShapeBox(0F, 0F, 0F, 1, 13, 10, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 338
		planeModeParts[24].setRotationPoint(-185F, -51F, 3F);

		planeModeParts[25].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 339
		planeModeParts[25].setRotationPoint(-183F, -55F, 5F);

		planeModeParts[26].addShapeBox(0F, 0F, 0F, 1, 13, 8, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 340
		planeModeParts[26].setRotationPoint(-186F, -50F, 4F);

		planeModeParts[27].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 341
		planeModeParts[27].setRotationPoint(-186.3F, -50.3F, 6F);

		planeModeParts[28].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 342
		planeModeParts[28].setRotationPoint(-186.3F, -50.3F, 9F);

		planeModeParts[29].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 343
		planeModeParts[29].setRotationPoint(-185F, -48F, 4F);

		planeModeParts[30].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 344
		planeModeParts[30].setRotationPoint(-185F, -48F, 11F);

		planeModeParts[31].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 345
		planeModeParts[31].setRotationPoint(-191F, -38F, 2F);
		planeModeParts[31].rotateAngleZ = 0.78539816F;

		planeModeParts[32].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 346
		planeModeParts[32].setRotationPoint(-191F, -38F, 13F);
		planeModeParts[32].rotateAngleZ = 0.78539816F;

		planeModeParts[33].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 347
		planeModeParts[33].setRotationPoint(-183.5F, -54.5F, 6.5F);

		planeModeParts[34].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 348
		planeModeParts[34].setRotationPoint(-183.5F, -53.5F, 6.5F);

		planeModeParts[35].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 349
		planeModeParts[35].setRotationPoint(-183.5F, -52.5F, 6.5F);

		planeModeParts[36].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 350
		planeModeParts[36].setRotationPoint(-190F, -37F, 4F);

		planeModeParts[37].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 351
		planeModeParts[37].setRotationPoint(-190F, -37F, 11F);

		planeModeParts[38].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 361
		planeModeParts[38].setRotationPoint(-169F, -37F, -5F);

		planeModeParts[39].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 362
		planeModeParts[39].setRotationPoint(-164F, -48F, -12F);

		planeModeParts[40].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 363
		planeModeParts[40].setRotationPoint(-164F, -48F, -5F);

		planeModeParts[41].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 364
		planeModeParts[41].setRotationPoint(-169F, -37F, -12F);

		planeModeParts[42].addShapeBox(0F, 1F, 0F, 10, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 365
		planeModeParts[42].setRotationPoint(-173F, -39F, -13F);
		planeModeParts[42].rotateAngleZ = -0.10471976F;

		planeModeParts[43].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 366
		planeModeParts[43].setRotationPoint(-173F, -39F, -4F);
		planeModeParts[43].rotateAngleZ = -0.10471976F;

		planeModeParts[44].addShapeBox(9F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 367
		planeModeParts[44].setRotationPoint(-173F, -39F, -13F);
		planeModeParts[44].rotateAngleZ = -0.10471976F;

		planeModeParts[45].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 368
		planeModeParts[45].setRotationPoint(-173F, -39F, -13F);
		planeModeParts[45].rotateAngleZ = -0.10471976F;

		planeModeParts[46].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 369
		planeModeParts[46].setRotationPoint(-173F, -39F, -13F);
		planeModeParts[46].rotateAngleZ = -0.10471976F;

		planeModeParts[47].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 370
		planeModeParts[47].setRotationPoint(-165.3F, -50.3F, -7F);

		planeModeParts[48].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 371
		planeModeParts[48].setRotationPoint(-165.3F, -50.3F, -10F);

		planeModeParts[49].addShapeBox(0F, 0F, 0F, 1, 13, 8, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372
		planeModeParts[49].setRotationPoint(-165F, -50F, -12F);

		planeModeParts[50].addShapeBox(0F, 0F, 0F, 1, 13, 10, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 373
		planeModeParts[50].setRotationPoint(-164F, -51F, -13F);

		planeModeParts[51].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 374
		planeModeParts[51].setRotationPoint(-162F, -55F, -11F);

		planeModeParts[52].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 375
		planeModeParts[52].setRotationPoint(-170F, -38F, -3F);
		planeModeParts[52].rotateAngleZ = 0.78539816F;

		planeModeParts[53].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 376
		planeModeParts[53].setRotationPoint(-170F, -38F, -14F);
		planeModeParts[53].rotateAngleZ = 0.78539816F;
	}

	private void initPropeller()
	{
		propellerModels = new ModelRendererTurbo[2][4];
		propellerModels[0] = makeProp1(-123F, -47F, -74F);
		propellerModels[1] = makeProp2(-123F, -47F, 74F);
	}

	private ModelRendererTurbo[] makeProp1(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[4];
		prop[0] = new ModelRendererTurbo(this, 0, 380, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 380, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 0, 380, textureX, textureY);
		prop[3] = new ModelRendererTurbo(this, 0, 380, textureX, textureY);
		prop[0].addBox(-1F, -45F, -3F, 2, 45, 6, 0.0F);
		prop[1].addBox(-1F, -45F, -3F, 2, 45, 6, 0.0F);
		prop[2].addBox(-1F, -45F, -3F, 2, 45, 6, 0.0F);
		prop[3].addBox(-1F, -45F, -3F, 2, 45, 6, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		prop[3].setRotationPoint(i, j, k);
		return prop;
	}

	private ModelRendererTurbo[] makeProp2(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[4];
		prop[0] = new ModelRendererTurbo(this, 0, 380, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 380, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 0, 380, textureX, textureY);
		prop[3] = new ModelRendererTurbo(this, 0, 380, textureX, textureY);
		prop[0].addBox(-1F, -45F, -3F, 2, 45, 6, 0.0F);
		prop[1].addBox(-1F, -45F, -3F, 2, 45, 6, 0.0F);
		prop[2].addBox(-1F, -45F, -3F, 2, 45, 6, 0.0F);
		prop[3].addBox(-1F, -45F, -3F, 2, 45, 6, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		prop[3].setRotationPoint(i, j, k);
		return prop;
	}
}