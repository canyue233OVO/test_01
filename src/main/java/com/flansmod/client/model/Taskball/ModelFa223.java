//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Fa223
// Model Creator: 
// Created on: 03.06.2023 - 00:38:47
// Last changed on: 03.06.2023 - 00:38:47

package com.flansmod.client.model.Taskball; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelFa223 extends ModelPlane //Same as Filename
{
	int textureX = 1024;
	int textureY = 512;

	public ModelFa223() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[229];
		hudModel = new ModelRendererTurbo[64];

		initbodyModel_1();
		inithudModel_1();

		initPropeller();

		initGuns();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 10
		bodyModel[11] = new ModelRendererTurbo(this, 609, 1, textureX, textureY); // Box 11
		bodyModel[12] = new ModelRendererTurbo(this, 745, 1, textureX, textureY); // Box 12
		bodyModel[13] = new ModelRendererTurbo(this, 825, 1, textureX, textureY); // Box 13
		bodyModel[14] = new ModelRendererTurbo(this, 929, 1, textureX, textureY); // Box 14
		bodyModel[15] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 15
		bodyModel[16] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 16
		bodyModel[17] = new ModelRendererTurbo(this, 977, 17, textureX, textureY); // Box 17
		bodyModel[18] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 18
		bodyModel[19] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 19
		bodyModel[20] = new ModelRendererTurbo(this, 569, 33, textureX, textureY); // Box 20
		bodyModel[21] = new ModelRendererTurbo(this, 649, 33, textureX, textureY); // Box 21
		bodyModel[22] = new ModelRendererTurbo(this, 769, 33, textureX, textureY); // Box 22
		bodyModel[23] = new ModelRendererTurbo(this, 873, 33, textureX, textureY); // Box 23
		bodyModel[24] = new ModelRendererTurbo(this, 873, 49, textureX, textureY); // Box 24
		bodyModel[25] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 25
		bodyModel[26] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 26
		bodyModel[27] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Box 27
		bodyModel[28] = new ModelRendererTurbo(this, 385, 49, textureX, textureY); // Box 28
		bodyModel[29] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // Box 29
		bodyModel[30] = new ModelRendererTurbo(this, 721, 57, textureX, textureY); // Box 30
		bodyModel[31] = new ModelRendererTurbo(this, 777, 57, textureX, textureY); // Box 31
		bodyModel[32] = new ModelRendererTurbo(this, 529, 65, textureX, textureY); // Box 32
		bodyModel[33] = new ModelRendererTurbo(this, 513, 65, textureX, textureY); // Box 33
		bodyModel[34] = new ModelRendererTurbo(this, 273, 41, textureX, textureY); // Box 34
		bodyModel[35] = new ModelRendererTurbo(this, 825, 57, textureX, textureY); // Box 35
		bodyModel[36] = new ModelRendererTurbo(this, 993, 49, textureX, textureY); // Box 36
		bodyModel[37] = new ModelRendererTurbo(this, 633, 65, textureX, textureY); // Box 37
		bodyModel[38] = new ModelRendererTurbo(this, 81, 73, textureX, textureY); // Box 38
		bodyModel[39] = new ModelRendererTurbo(this, 1009, 49, textureX, textureY); // Box 39
		bodyModel[40] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Box 40
		bodyModel[41] = new ModelRendererTurbo(this, 593, 1, textureX, textureY); // Box 41
		bodyModel[42] = new ModelRendererTurbo(this, 729, 1, textureX, textureY); // Box 42
		bodyModel[43] = new ModelRendererTurbo(this, 681, 65, textureX, textureY); // Box 43
		bodyModel[44] = new ModelRendererTurbo(this, 449, 73, textureX, textureY); // Box 44
		bodyModel[45] = new ModelRendererTurbo(this, 473, 73, textureX, textureY); // Box 45
		bodyModel[46] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 46
		bodyModel[47] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 47
		bodyModel[48] = new ModelRendererTurbo(this, 201, 81, textureX, textureY); // Box 48
		bodyModel[49] = new ModelRendererTurbo(this, 977, 1, textureX, textureY); // Box 49
		bodyModel[50] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 50
		bodyModel[51] = new ModelRendererTurbo(this, 809, 1, textureX, textureY); // Box 51
		bodyModel[52] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 52
		bodyModel[53] = new ModelRendererTurbo(this, 913, 1, textureX, textureY); // Box 53
		bodyModel[54] = new ModelRendererTurbo(this, 593, 9, textureX, textureY); // Box 54
		bodyModel[55] = new ModelRendererTurbo(this, 761, 1, textureX, textureY); // Box 55
		bodyModel[56] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 56
		bodyModel[57] = new ModelRendererTurbo(this, 841, 1, textureX, textureY); // Box 57
		bodyModel[58] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 58
		bodyModel[59] = new ModelRendererTurbo(this, 929, 1, textureX, textureY); // Box 59
		bodyModel[60] = new ModelRendererTurbo(this, 729, 9, textureX, textureY); // Box 60
		bodyModel[61] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Box 61
		bodyModel[62] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 62
		bodyModel[63] = new ModelRendererTurbo(this, 809, 9, textureX, textureY); // Box 63
		bodyModel[64] = new ModelRendererTurbo(this, 825, 9, textureX, textureY); // Box 64
		bodyModel[65] = new ModelRendererTurbo(this, 913, 9, textureX, textureY); // Box 65
		bodyModel[66] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 66
		bodyModel[67] = new ModelRendererTurbo(this, 745, 9, textureX, textureY); // Box 67
		bodyModel[68] = new ModelRendererTurbo(this, 593, 17, textureX, textureY); // Box 68
		bodyModel[69] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 69
		bodyModel[70] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 70
		bodyModel[71] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 71
		bodyModel[72] = new ModelRendererTurbo(this, 945, 9, textureX, textureY); // Box 72
		bodyModel[73] = new ModelRendererTurbo(this, 977, 1, textureX, textureY); // Box 73
		bodyModel[74] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 74
		bodyModel[75] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Box 75
		bodyModel[76] = new ModelRendererTurbo(this, 649, 33, textureX, textureY); // Box 76
		bodyModel[77] = new ModelRendererTurbo(this, 745, 33, textureX, textureY); // Box 77
		bodyModel[78] = new ModelRendererTurbo(this, 809, 17, textureX, textureY); // Box 78
		bodyModel[79] = new ModelRendererTurbo(this, 1009, 17, textureX, textureY); // Box 79
		bodyModel[80] = new ModelRendererTurbo(this, 761, 33, textureX, textureY); // Box 80
		bodyModel[81] = new ModelRendererTurbo(this, 745, 17, textureX, textureY); // Box 81
		bodyModel[82] = new ModelRendererTurbo(this, 977, 17, textureX, textureY); // Box 82
		bodyModel[83] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 83
		bodyModel[84] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Box 84
		bodyModel[85] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 85
		bodyModel[86] = new ModelRendererTurbo(this, 129, 73, textureX, textureY); // Box 86
		bodyModel[87] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 87
		bodyModel[88] = new ModelRendererTurbo(this, 873, 81, textureX, textureY); // Box 88
		bodyModel[89] = new ModelRendererTurbo(this, 713, 65, textureX, textureY); // Box 89
		bodyModel[90] = new ModelRendererTurbo(this, 929, 81, textureX, textureY); // Box 90
		bodyModel[91] = new ModelRendererTurbo(this, 249, 89, textureX, textureY); // Box 91
		bodyModel[92] = new ModelRendererTurbo(this, 633, 65, textureX, textureY); // Box 92
		bodyModel[93] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 93
		bodyModel[94] = new ModelRendererTurbo(this, 777, 57, textureX, textureY); // Box 94
		bodyModel[95] = new ModelRendererTurbo(this, 921, 97, textureX, textureY); // Box 95
		bodyModel[96] = new ModelRendererTurbo(this, 257, 89, textureX, textureY); // Box 96
		bodyModel[97] = new ModelRendererTurbo(this, 377, 89, textureX, textureY); // Box 97
		bodyModel[98] = new ModelRendererTurbo(this, 129, 105, textureX, textureY); // Box 98
		bodyModel[99] = new ModelRendererTurbo(this, 217, 89, textureX, textureY); // Box 99
		bodyModel[100] = new ModelRendererTurbo(this, 945, 1, textureX, textureY); // Import Shape1
		bodyModel[101] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Import Shape1
		bodyModel[102] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Import Shape1
		bodyModel[103] = new ModelRendererTurbo(this, 945, 33, textureX, textureY); // Import Shape1
		bodyModel[104] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Import Shape1
		bodyModel[105] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Import Shape1
		bodyModel[106] = new ModelRendererTurbo(this, 625, 9, textureX, textureY); // Import Shape1
		bodyModel[107] = new ModelRendererTurbo(this, 489, 113, textureX, textureY); // Box 108
		bodyModel[108] = new ModelRendererTurbo(this, 633, 113, textureX, textureY); // Box 109
		bodyModel[109] = new ModelRendererTurbo(this, 49, 97, textureX, textureY); // Box 110
		bodyModel[110] = new ModelRendererTurbo(this, 833, 57, textureX, textureY); // Box 111
		bodyModel[111] = new ModelRendererTurbo(this, 969, 49, textureX, textureY); // Box 112
		bodyModel[112] = new ModelRendererTurbo(this, 769, 113, textureX, textureY); // Box 113
		bodyModel[113] = new ModelRendererTurbo(this, 833, 113, textureX, textureY); // Box 114
		bodyModel[114] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 115
		bodyModel[115] = new ModelRendererTurbo(this, 1017, 17, textureX, textureY); // Box 116
		bodyModel[116] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 117
		bodyModel[117] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 118
		bodyModel[118] = new ModelRendererTurbo(this, 833, 137, textureX, textureY); // Box 119
		bodyModel[119] = new ModelRendererTurbo(this, 233, 145, textureX, textureY); // Box 120
		bodyModel[120] = new ModelRendererTurbo(this, 313, 145, textureX, textureY); // Box 121
		bodyModel[121] = new ModelRendererTurbo(this, 417, 145, textureX, textureY); // Box 122
		bodyModel[122] = new ModelRendererTurbo(this, 569, 113, textureX, textureY); // Box 123
		bodyModel[123] = new ModelRendererTurbo(this, 521, 73, textureX, textureY); // Box 124
		bodyModel[124] = new ModelRendererTurbo(this, 441, 105, textureX, textureY); // Box 125
		bodyModel[125] = new ModelRendererTurbo(this, 121, 161, textureX, textureY); // Box 126
		bodyModel[126] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 127
		bodyModel[127] = new ModelRendererTurbo(this, 761, 161, textureX, textureY); // Box 128
		bodyModel[128] = new ModelRendererTurbo(this, 825, 169, textureX, textureY); // Box 129
		bodyModel[129] = new ModelRendererTurbo(this, 241, 177, textureX, textureY); // Box 130
		bodyModel[130] = new ModelRendererTurbo(this, 81, 121, textureX, textureY); // Box 131
		bodyModel[131] = new ModelRendererTurbo(this, 361, 177, textureX, textureY); // Box 132
		bodyModel[132] = new ModelRendererTurbo(this, 481, 185, textureX, textureY); // Box 133
		bodyModel[133] = new ModelRendererTurbo(this, 209, 121, textureX, textureY); // Box 134
		bodyModel[134] = new ModelRendererTurbo(this, 937, 137, textureX, textureY); // Box 135
		bodyModel[135] = new ModelRendererTurbo(this, 705, 169, textureX, textureY); // Box 136
		bodyModel[136] = new ModelRendererTurbo(this, 897, 177, textureX, textureY); // Box 137
		bodyModel[137] = new ModelRendererTurbo(this, 561, 185, textureX, textureY); // Box 138
		bodyModel[138] = new ModelRendererTurbo(this, 617, 185, textureX, textureY); // Box 139
		bodyModel[139] = new ModelRendererTurbo(this, 753, 193, textureX, textureY); // Box 140
		bodyModel[140] = new ModelRendererTurbo(this, 129, 201, textureX, textureY); // Box 141
		bodyModel[141] = new ModelRendererTurbo(this, 433, 177, textureX, textureY); // Box 142
		bodyModel[142] = new ModelRendererTurbo(this, 249, 201, textureX, textureY); // Box 143
		bodyModel[143] = new ModelRendererTurbo(this, 1001, 177, textureX, textureY); // Box 144
		bodyModel[144] = new ModelRendererTurbo(this, 809, 201, textureX, textureY); // Box 145
		bodyModel[145] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 146
		bodyModel[146] = new ModelRendererTurbo(this, 1009, 105, textureX, textureY); // Box 147
		bodyModel[147] = new ModelRendererTurbo(this, 297, 201, textureX, textureY); // Box 148
		bodyModel[148] = new ModelRendererTurbo(this, 321, 65, textureX, textureY); // Box 149
		bodyModel[149] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 150
		bodyModel[150] = new ModelRendererTurbo(this, 889, 105, textureX, textureY); // Box 151
		bodyModel[151] = new ModelRendererTurbo(this, 673, 185, textureX, textureY); // Box 152
		bodyModel[152] = new ModelRendererTurbo(this, 49, 209, textureX, textureY); // Box 153
		bodyModel[153] = new ModelRendererTurbo(this, 129, 209, textureX, textureY); // Box 154
		bodyModel[154] = new ModelRendererTurbo(this, 129, 89, textureX, textureY); // Box 155
		bodyModel[155] = new ModelRendererTurbo(this, 681, 97, textureX, textureY); // Box 156
		bodyModel[156] = new ModelRendererTurbo(this, 377, 73, textureX, textureY); // Box 157
		bodyModel[157] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 158
		bodyModel[158] = new ModelRendererTurbo(this, 969, 33, textureX, textureY); // Box 159
		bodyModel[159] = new ModelRendererTurbo(this, 553, 33, textureX, textureY); // Box 160
		bodyModel[160] = new ModelRendererTurbo(this, 953, 41, textureX, textureY); // Box 161
		bodyModel[161] = new ModelRendererTurbo(this, 369, 65, textureX, textureY); // Box 162
		bodyModel[162] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); // Box 163
		bodyModel[163] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 164
		bodyModel[164] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Box 165
		bodyModel[165] = new ModelRendererTurbo(this, 321, 73, textureX, textureY); // Box 166
		bodyModel[166] = new ModelRendererTurbo(this, 873, 57, textureX, textureY); // Box 167
		bodyModel[167] = new ModelRendererTurbo(this, 433, 65, textureX, textureY); // Box 168
		bodyModel[168] = new ModelRendererTurbo(this, 321, 81, textureX, textureY); // Box 169
		bodyModel[169] = new ModelRendererTurbo(this, 585, 65, textureX, textureY); // Box 170
		bodyModel[170] = new ModelRendererTurbo(this, 745, 49, textureX, textureY); // Box 171
		bodyModel[171] = new ModelRendererTurbo(this, 641, 33, textureX, textureY); // Box 172
		bodyModel[172] = new ModelRendererTurbo(this, 601, 65, textureX, textureY); // Box 173
		bodyModel[173] = new ModelRendererTurbo(this, 833, 73, textureX, textureY); // Box 174
		bodyModel[174] = new ModelRendererTurbo(this, 929, 17, textureX, textureY); // Box 175
		bodyModel[175] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 176
		bodyModel[176] = new ModelRendererTurbo(this, 681, 65, textureX, textureY); // Box 177
		bodyModel[177] = new ModelRendererTurbo(this, 449, 73, textureX, textureY); // Box 178
		bodyModel[178] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 179
		bodyModel[179] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // Box 180
		bodyModel[180] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Box 181
		bodyModel[181] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 182
		bodyModel[182] = new ModelRendererTurbo(this, 521, 73, textureX, textureY); // Box 183
		bodyModel[183] = new ModelRendererTurbo(this, 585, 81, textureX, textureY); // Box 184
		bodyModel[184] = new ModelRendererTurbo(this, 681, 81, textureX, textureY); // Box 185
		bodyModel[185] = new ModelRendererTurbo(this, 281, 81, textureX, textureY); // Box 186
		bodyModel[186] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 187
		bodyModel[187] = new ModelRendererTurbo(this, 601, 81, textureX, textureY); // Box 188
		bodyModel[188] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Box 189
		bodyModel[189] = new ModelRendererTurbo(this, 649, 49, textureX, textureY); // Box 190
		bodyModel[190] = new ModelRendererTurbo(this, 777, 33, textureX, textureY); // Box 191
		bodyModel[191] = new ModelRendererTurbo(this, 785, 81, textureX, textureY); // Box 192
		bodyModel[192] = new ModelRendererTurbo(this, 9, 57, textureX, textureY); // Box 193
		bodyModel[193] = new ModelRendererTurbo(this, 329, 121, textureX, textureY); // Box 194
		bodyModel[194] = new ModelRendererTurbo(this, 121, 137, textureX, textureY); // Box 195
		bodyModel[195] = new ModelRendererTurbo(this, 769, 145, textureX, textureY); // Box 196
		bodyModel[196] = new ModelRendererTurbo(this, 569, 161, textureX, textureY); // Box 197
		bodyModel[197] = new ModelRendererTurbo(this, 857, 201, textureX, textureY); // Box 198
		bodyModel[198] = new ModelRendererTurbo(this, 97, 209, textureX, textureY); // Box 199
		bodyModel[199] = new ModelRendererTurbo(this, 377, 89, textureX, textureY); // Box 200
		bodyModel[200] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Box 201
		bodyModel[201] = new ModelRendererTurbo(this, 985, 121, textureX, textureY); // Box 202
		bodyModel[202] = new ModelRendererTurbo(this, 177, 209, textureX, textureY); // Box 203
		bodyModel[203] = new ModelRendererTurbo(this, 337, 209, textureX, textureY); // Box 204
		bodyModel[204] = new ModelRendererTurbo(this, 481, 209, textureX, textureY); // Box 205
		bodyModel[205] = new ModelRendererTurbo(this, 665, 217, textureX, textureY); // Box 206
		bodyModel[206] = new ModelRendererTurbo(this, 409, 225, textureX, textureY); // Box 207
		bodyModel[207] = new ModelRendererTurbo(this, 729, 9, textureX, textureY); // Box 208
		bodyModel[208] = new ModelRendererTurbo(this, 801, 57, textureX, textureY); // Box 209
		bodyModel[209] = new ModelRendererTurbo(this, 713, 81, textureX, textureY); // Box 210
		bodyModel[210] = new ModelRendererTurbo(this, 833, 81, textureX, textureY); // Box 211
		bodyModel[211] = new ModelRendererTurbo(this, 913, 9, textureX, textureY); // Box 212
		bodyModel[212] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 213
		bodyModel[213] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 214
		bodyModel[214] = new ModelRendererTurbo(this, 585, 65, textureX, textureY); // Box 220
		bodyModel[215] = new ModelRendererTurbo(this, 745, 81, textureX, textureY); // Box 221
		bodyModel[216] = new ModelRendererTurbo(this, 553, 73, textureX, textureY); // Box 222
		bodyModel[217] = new ModelRendererTurbo(this, 561, 73, textureX, textureY); // Box 223
		bodyModel[218] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 224
		bodyModel[219] = new ModelRendererTurbo(this, 201, 89, textureX, textureY); // Box 225
		bodyModel[220] = new ModelRendererTurbo(this, 329, 89, textureX, textureY); // Box 226
		bodyModel[221] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 227
		bodyModel[222] = new ModelRendererTurbo(this, 425, 265, textureX, textureY); // Box 228
		bodyModel[223] = new ModelRendererTurbo(this, 441, 89, textureX, textureY); // Box 229
		bodyModel[224] = new ModelRendererTurbo(this, 481, 89, textureX, textureY); // Box 230
		bodyModel[225] = new ModelRendererTurbo(this, 633, 89, textureX, textureY); // Box 231
		bodyModel[226] = new ModelRendererTurbo(this, 129, 97, textureX, textureY); // Box 232
		bodyModel[227] = new ModelRendererTurbo(this, 417, 65, textureX, textureY); // Box 233
		bodyModel[228] = new ModelRendererTurbo(this, 761, 33, textureX, textureY); // Box 234

		bodyModel[0].addShapeBox(0F, 0F, 0F, 17, 28, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-62F, -47F, -22F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 45, 28, 22, 0F,0F, 0F, 0F, 0F, 1F, -3F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[1].setRotationPoint(-45F, -47F, -22F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 29, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[2].setRotationPoint(-91F, -33F, -22F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 11, 14, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F); // Box 3
		bodyModel[3].setRotationPoint(-102F, -33F, -22F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 9, 13, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F); // Box 4
		bodyModel[4].setRotationPoint(-111F, -33F, -21F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 17, 8, 22, 0F,0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[5].setRotationPoint(-62F, -55F, -22F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 29, 8, 9, 0F,0F, 0F, -8F, 0F, 0F, -8F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F); // Box 6
		bodyModel[6].setRotationPoint(-91F, -55F, -22F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 29, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[7].setRotationPoint(-91F, -55F, -14F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[8].setRotationPoint(-91F, -47F, -22F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 3, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[9].setRotationPoint(-77F, -47F, -22F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 45, 8, 22, 0F,0F, 0F, -8F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[10].setRotationPoint(-45F, -55F, -22F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 45, 7, 22, 0F,0F, 0F, 0F, 0F, 3F, -3F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -4F, -9F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[11].setRotationPoint(-45F, -19F, -22F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 17, 7, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[12].setRotationPoint(-62F, -19F, -22F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 29, 7, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[13].setRotationPoint(-91F, -19F, -22F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 11, 7, 22, 0F,0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, -8F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 14
		bodyModel[14].setRotationPoint(-102F, -19F, -22F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 4, 26, 19, 0F,0F, -1F, -2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 15
		bodyModel[15].setRotationPoint(0F, -48F, -19F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 4, 6, 19, 0F,0F, -1F, -8F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 16
		bodyModel[16].setRotationPoint(0F, -55F, -19F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 4, 6, 19, 0F,0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -1F, -8F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 17
		bodyModel[17].setRotationPoint(0F, -22F, -19F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 38, 27, 19, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -4F, 0F, -6F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[18].setRotationPoint(4F, -49F, -19F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 43, 22, 15, 0F,0F, -1F, 0F, 0F, 1F, -7F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -6F, -7F, 0F, -6F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[19].setRotationPoint(42F, -50F, -15F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 31, 17, 8, 0F,0F, 0F, 0F, 0F, 2F, -5F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -5F, 0F, -6F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[20].setRotationPoint(85F, -51F, -8F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 38, 6, 19, 0F,0F, 0F, -6F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[21].setRotationPoint(4F, -55F, -19F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 43, 6, 15, 0F,0F, 0F, -5F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -7F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[22].setRotationPoint(42F, -55F, -15F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 31, 4, 8, 0F,0F, 0F, -2F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -5F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[23].setRotationPoint(85F, -55F, -8F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 38, 6, 19, 0F,0F, 0F, 0F, 0F, 6F, -4F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -6F, -10F, 0F, -6F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[24].setRotationPoint(4F, -22F, -19F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 43, 6, 15, 0F,0F, 0F, 0F, 0F, 6F, -7F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -7F, -10F, 0F, -7F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[25].setRotationPoint(42F, -28F, -15F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 31, 5, 8, 0F,0F, 0F, 0F, 0F, 6F, -5F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -7F, -5F, 0F, -7F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[26].setRotationPoint(85F, -34F, -8F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 5, 2, 37, 0F,0F, 0F, 0F, 0F, 0F, 0F, -11F, -10F, 0F, 11F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 10F, 0F, 11F, 10F, 0F); // Box 27
		bodyModel[27].setRotationPoint(-78F, -65F, -51F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 5, 2, 37, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, 10F, 0F); // Box 28
		bodyModel[28].setRotationPoint(-48F, -65F, -51F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 5, 2, 43, 0F,0F, -6F, 0F, 0F, -6F, 0F, -13F, -17F, 0F, 13F, -17F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, -13F, 17F, 0F, 13F, 17F, 0F); // Box 29
		bodyModel[29].setRotationPoint(-65F, -82F, -94F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 5, 2, 43, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 11F, 0F, 0F, 11F, 0F); // Box 30
		bodyModel[30].setRotationPoint(-48F, -76F, -94F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 5, 2, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, -12F, -11F, 0F, 12F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 11F, 0F, 12F, 11F, 0F); // Box 31
		bodyModel[31].setRotationPoint(-53F, -87F, -134F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 5, 2, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 11F, 0F, 0F, 11F, 0F); // Box 32
		bodyModel[32].setRotationPoint(-48F, -87F, -134F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 2, 2, 112, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -50F, 0F, 0F, -50F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 50F, 0F, 0F, 50F, 0F); // Box 33
		bodyModel[33].setRotationPoint(-49F, -87F, -134F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 2, 2, 43, 0F,0F, 0F, 0F, 0F, 0F, 0F, 7F, -38F, 0F, -7F, -38F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 38F, 0F, -7F, 38F, 0F); // Box 34
		bodyModel[34].setRotationPoint(-53F, -87F, -134F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 2, 2, 43, 0F,0F, 0F, 0F, 0F, 0F, 0F, 4F, -38F, 0F, -4F, -38F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 38F, 0F, -4F, 38F, 0F); // Box 35
		bodyModel[35].setRotationPoint(-45F, -87F, -134F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 2, 68, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, -8F, 0F, 0F); // Box 36
		bodyModel[36].setRotationPoint(-45F, -64F, -51F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 2, 2, 42, 0F,0F, 0F, 0F, 0F, 0F, 0F, 3F, -34F, 0F, -3F, -34F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 34F, 0F, -3F, 34F, 0F); // Box 37
		bodyModel[37].setRotationPoint(-41F, -49F, -91F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 2, 2, 42, 0F,5F, 0F, 0F, -5F, 0F, 0F, 3F, -34F, 0F, -3F, -34F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, 3F, 34F, 0F, -3F, 34F, 0F); // Box 38
		bodyModel[38].setRotationPoint(-41F, -49F, -91F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 2, 50, 2, 0F,40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, 0F, 40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[39].setRotationPoint(-38F, -64F, -51F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 16F, 0F, -1F, 16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -16F, 0F, -1F, -16F, 0F); // Box 40
		bodyModel[40].setRotationPoint(-45F, -49F, -91F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 17, 1, 1, 0F,0F, 27F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 27F, -3F, 0F, -27F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -27F, -3F); // Box 41
		bodyModel[41].setRotationPoint(-61F, -49F, -91F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[42].setRotationPoint(-61F, -75F, -94F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 27, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -44F, 0F, 0F, -44F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 44F, 0F, 0F, 44F, 0F); // Box 43
		bodyModel[43].setRotationPoint(-44F, -65F, -49F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 2, 2, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, -9F, 32F, 0F, 9F, 32F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, -32F, 0F, 9F, -32F, 0F); // Box 44
		bodyModel[44].setRotationPoint(-38F, -15F, -49F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 2, 2, 36, 0F,0F, 0F, 0F, 0F, 0F, 0F, 9F, 1F, 0F, -9F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, -1F, 0F, -9F, -1F, 0F); // Box 45
		bodyModel[45].setRotationPoint(-38F, -15F, -49F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 2, 2, 36, 0F,0F, 0F, 0F, 0F, 0F, 0F, -25F, 0F, 0F, 25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -24F, 0F, 0F, 24F, 0F, 0F); // Box 46
		bodyModel[46].setRotationPoint(-38F, -15F, -49F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 27, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[47].setRotationPoint(-74F, -64F, -51F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 36, 1, 1, 0F,0F, -9F, -36F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 36F, 0F, 9F, -36F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 36F); // Box 48
		bodyModel[48].setRotationPoint(-84F, -64F, -51F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 11, 2, 10, 0F,-4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[49].setRotationPoint(-53F, -87F, -144F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[50].setRotationPoint(-102F, -42F, -21F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 51
		bodyModel[51].setRotationPoint(-102F, -42F, -21F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 52
		bodyModel[52].setRotationPoint(-111F, -42F, -21F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 53
		bodyModel[53].setRotationPoint(-111F, -47F, -21F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 54
		bodyModel[54].setRotationPoint(-102F, -47F, -21F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[55].setRotationPoint(-111F, -47F, -20F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[56].setRotationPoint(-111F, -55F, -20F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 57
		bodyModel[57].setRotationPoint(-102F, -55F, -20F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[58].setRotationPoint(-111F, -55F, -14F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 59
		bodyModel[59].setRotationPoint(-111F, -55F, -14F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[60].setRotationPoint(-112F, -55F, -7F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[61].setRotationPoint(-111F, -55F, -1F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[62].setRotationPoint(-102F, -55F, -14F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F); // Box 63
		bodyModel[63].setRotationPoint(-120F, -47F, -20F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F); // Box 64
		bodyModel[64].setRotationPoint(-120F, -47F, -13F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[65].setRotationPoint(-127F, -47F, -7F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F); // Box 66
		bodyModel[66].setRotationPoint(-127F, -55F, -7F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -5F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -2F, 0F, 5F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, -2F); // Box 67
		bodyModel[67].setRotationPoint(-126F, -47F, -13F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 68
		bodyModel[68].setRotationPoint(-126F, -42F, -15F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[69].setRotationPoint(-133F, -42F, -7F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[70].setRotationPoint(-135F, -34F, -7F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[71].setRotationPoint(-132F, -23F, -7F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F); // Box 72
		bodyModel[72].setRotationPoint(-135F, -33F, -7F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[73].setRotationPoint(-135F, -42F, -7F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[74].setRotationPoint(-133F, -42F, -7F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F); // Box 75
		bodyModel[75].setRotationPoint(-126F, -42F, -15F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 9F, 0F, 0F); // Box 76
		bodyModel[76].setRotationPoint(-126F, -34F, -15F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, -6F, -11F, 0F, 6F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 11F, 0F, 6F, 11F, 0F); // Box 77
		bodyModel[77].setRotationPoint(-126F, -34F, -15F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 78
		bodyModel[78].setRotationPoint(-126F, -34F, -15F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 2F, 7F, 0F, 2F, 7F, 0F, -2F, -7F, 0F, -2F); // Box 79
		bodyModel[79].setRotationPoint(-126F, -34F, -15F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, 13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, 13F, 0F, 0F); // Box 80
		bodyModel[80].setRotationPoint(-119F, -23F, -17F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 3F, 0F, 1F, -3F, 0F, 0F, 0F); // Box 81
		bodyModel[81].setRotationPoint(-119F, -23F, -17F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 10F, 3F, 0F, 10F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 3F, 0F, -10F, -3F, 0F, 0F, 0F); // Box 82
		bodyModel[82].setRotationPoint(-119F, -23F, -17F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 5F); // Box 83
		bodyModel[83].setRotationPoint(-119F, -23F, -17F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[84].setRotationPoint(-119F, -17F, -12F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[85].setRotationPoint(-126F, -42F, -15F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 18, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[86].setRotationPoint(-45F, -2F, -59F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 18, 6, 8, 0F,-6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[87].setRotationPoint(-45F, -8F, -59F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 18, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Box 88
		bodyModel[88].setRotationPoint(-45F, 4F, -59F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 21, 8, 3, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		bodyModel[89].setRotationPoint(116F, -55F, -3F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 21, 11, 3, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -5F, -2F, -3F, -5F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[90].setRotationPoint(116F, -47F, -3F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 21, 14, 3, 0F,0F, 0F, 0F, -4F, 0F, -2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[91].setRotationPoint(116F, -69F, -3F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 17, 14, 3, 0F,0F, 0F, 0F, -9F, 0F, -2F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		bodyModel[92].setRotationPoint(116F, -83F, -3F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 8, 3, 3, 0F,0F, 0F, 0F, -4F, 0F, -2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		bodyModel[93].setRotationPoint(116F, -86F, -3F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 6, 31, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		bodyModel[94].setRotationPoint(110F, -86F, -3F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 26, 31, 3, 0F,-21F, -3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -21F, -3F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[95].setRotationPoint(84F, -86F, -3F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 8, 3, 48, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[96].setRotationPoint(110F, -89F, -47F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 4, 3, 48, 0F,-1F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 97
		bodyModel[97].setRotationPoint(106F, -89F, -47F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 13, 3, 48, 0F,0F, 0F, 0F, -8F, -1F, -5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, -1F, -5F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 98
		bodyModel[98].setRotationPoint(118F, -89F, -47F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -21F, 0F, 0F, -21F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 21F, 0F, 0F, 21F, 0F); // Box 99
		bodyModel[99].setRotationPoint(113F, -87F, -28F);

		bodyModel[100].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Import Shape1
		bodyModel[100].setRotationPoint(-49.5F, -94F, -137F);

		bodyModel[101].addBox(0F, 0F, 0F, 2, 7, 2, 0F); // Import Shape1
		bodyModel[101].setRotationPoint(-48F, -94F, -139F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Shape1
		bodyModel[102].setRotationPoint(-50F, -96F, -141F);

		bodyModel[103].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Import Shape1
		bodyModel[103].setRotationPoint(-50F, -91F, -141F);

		bodyModel[104].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Import Shape1
		bodyModel[104].setRotationPoint(-45.5F, -94F, -140F);

		bodyModel[105].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Import Shape1
		bodyModel[105].setRotationPoint(-49.5F, -94F, -140F);

		bodyModel[106].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Import Shape1
		bodyModel[106].setRotationPoint(-45.5F, -94F, -137F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 17, 28, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[107].setRotationPoint(-62F, -47F, 0F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 45, 28, 22, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -3F, 0F, 0F, 0F); // Box 109
		bodyModel[108].setRotationPoint(-45F, -47F, 0F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 29, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[109].setRotationPoint(-91F, -33F, 21F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 11, 14, 1, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 111
		bodyModel[110].setRotationPoint(-102F, -33F, 21F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 9, 13, 1, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 112
		bodyModel[111].setRotationPoint(-111F, -33F, 20F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 17, 8, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[112].setRotationPoint(-62F, -55F, 0F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 29, 8, 9, 0F,0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[113].setRotationPoint(-91F, -55F, 13F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 29, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[114].setRotationPoint(-91F, -55F, 0F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 2, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[115].setRotationPoint(-91F, -47F, 21F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 3, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		bodyModel[116].setRotationPoint(-77F, -47F, 21F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 45, 8, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -3F, 0F, 0F, 0F); // Box 118
		bodyModel[117].setRotationPoint(-45F, -55F, 0F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 45, 7, 22, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, -9F, 0F, 0F, -7F); // Box 119
		bodyModel[118].setRotationPoint(-45F, -19F, 0F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 17, 7, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F); // Box 120
		bodyModel[119].setRotationPoint(-62F, -19F, 0F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 29, 7, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F); // Box 121
		bodyModel[120].setRotationPoint(-91F, -19F, 0F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 11, 7, 22, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -1F, -8F); // Box 122
		bodyModel[121].setRotationPoint(-102F, -19F, 0F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 4, 26, 19, 0F,0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F); // Box 123
		bodyModel[122].setRotationPoint(0F, -48F, 0F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 4, 6, 19, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -1F, -8F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -2F); // Box 124
		bodyModel[123].setRotationPoint(0F, -55F, 0F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 4, 6, 19, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -1F, -8F); // Box 125
		bodyModel[124].setRotationPoint(0F, -22F, 0F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 38, 27, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, -4F, 0F, 0F, 0F); // Box 126
		bodyModel[125].setRotationPoint(4F, -49F, 0F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 43, 22, 15, 0F,0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, -7F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, -7F, 0F, 0F, 0F); // Box 127
		bodyModel[126].setRotationPoint(42F, -50F, 0F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 31, 17, 8, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, -5F, 0F, 0F, 0F); // Box 128
		bodyModel[127].setRotationPoint(85F, -51F, 0F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 38, 6, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 129
		bodyModel[128].setRotationPoint(4F, -55F, 0F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 43, 6, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -7F, 0F, 0F, 0F); // Box 130
		bodyModel[129].setRotationPoint(42F, -55F, 0F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 31, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -5F, 0F, 0F, 0F); // Box 131
		bodyModel[130].setRotationPoint(85F, -55F, 0F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 38, 6, 19, 0F,0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, -10F, 0F, 0F, -6F); // Box 132
		bodyModel[131].setRotationPoint(4F, -22F, 0F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 43, 6, 15, 0F,0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, -10F, 0F, 0F, -6F); // Box 133
		bodyModel[132].setRotationPoint(42F, -28F, 0F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 31, 5, 8, 0F,0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, -5F, 0F, 0F, -3F); // Box 134
		bodyModel[133].setRotationPoint(85F, -34F, 0F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 5, 2, 37, 0F,11F, -10F, 0F, -11F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 11F, 10F, 0F, -11F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[134].setRotationPoint(-78F, -65F, 14F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 5, 2, 37, 0F,0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		bodyModel[135].setRotationPoint(-48F, -65F, 14F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 5, 2, 43, 0F,13F, -17F, 0F, -13F, -17F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 13F, 17F, 0F, -13F, 17F, 0F, 0F, 6F, 0F, 0F, 6F, 0F); // Box 137
		bodyModel[136].setRotationPoint(-65F, -82F, 51F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 5, 2, 43, 0F,0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 11F, 0F, 0F, 11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[137].setRotationPoint(-48F, -76F, 51F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 5, 2, 40, 0F,12F, -11F, 0F, -12F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 11F, 0F, -12F, 11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		bodyModel[138].setRotationPoint(-53F, -87F, 94F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 5, 2, 40, 0F,0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 11F, 0F, 0F, 11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		bodyModel[139].setRotationPoint(-48F, -87F, 94F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 2, 2, 112, 0F,0F, -50F, 0F, 0F, -50F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 50F, 0F, 0F, 50F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[140].setRotationPoint(-49F, -87F, 22F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 2, 2, 43, 0F,-7F, -38F, 0F, 7F, -38F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 38F, 0F, 7F, 38F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		bodyModel[141].setRotationPoint(-53F, -87F, 91F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 2, 2, 43, 0F,-4F, -38F, 0F, 4F, -38F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 38F, 0F, 4F, 38F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[142].setRotationPoint(-45F, -87F, 91F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 2, 68, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, -8F, 0F, 0F); // Box 144
		bodyModel[143].setRotationPoint(-45F, -64F, 49F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 2, 2, 42, 0F,-3F, -34F, 0F, 3F, -34F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 34F, 0F, 3F, 34F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		bodyModel[144].setRotationPoint(-41F, -49F, 49F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 2, 2, 42, 0F,-3F, -34F, 0F, 3F, -34F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, -3F, 34F, 0F, 3F, 34F, 0F, -5F, 0F, 0F, 5F, 0F, 0F); // Box 146
		bodyModel[145].setRotationPoint(-41F, -49F, 49F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 2, 50, 2, 0F,40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, 0F, 40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[146].setRotationPoint(-38F, -64F, 49F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 1, 40, 0F,-1F, 16F, 0F, 1F, 16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -16F, 0F, 1F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		bodyModel[147].setRotationPoint(-45F, -49F, 51F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 17, 1, 1, 0F,0F, 27F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 27F, 3F, 0F, -27F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -27F, 3F); // Box 149
		bodyModel[148].setRotationPoint(-61F, -49F, 90F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[149].setRotationPoint(-61F, -75F, 93F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 1, 27, 0F,0F, -44F, 0F, 0F, -44F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 44F, 0F, 0F, 44F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 151
		bodyModel[150].setRotationPoint(-44F, -65F, 22F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 2, 2, 27, 0F,9F, 32F, 0F, -9F, 32F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, -32F, 0F, -9F, -32F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152
		bodyModel[151].setRotationPoint(-38F, -15F, 22F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 2, 2, 36, 0F,-9F, 1F, 0F, 9F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, -1F, 0F, 9F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[152].setRotationPoint(-38F, -15F, 13F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 2, 2, 36, 0F,25F, 0F, 0F, -25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 24F, 0F, 0F, -24F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		bodyModel[153].setRotationPoint(-38F, -15F, 13F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 27, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[154].setRotationPoint(-74F, -64F, 50F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 36, 1, 1, 0F,0F, -9F, 36F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, -36F, 0F, 9F, 36F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, -36F); // Box 156
		bodyModel[155].setRotationPoint(-84F, -64F, 50F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 11, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F); // Box 157
		bodyModel[156].setRotationPoint(-53F, -87F, 134F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		bodyModel[157].setRotationPoint(-102F, -42F, 20F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 159
		bodyModel[158].setRotationPoint(-102F, -42F, 20F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 160
		bodyModel[159].setRotationPoint(-111F, -42F, 20F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 161
		bodyModel[160].setRotationPoint(-111F, -47F, 20F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 162
		bodyModel[161].setRotationPoint(-102F, -47F, 20F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		bodyModel[162].setRotationPoint(-111F, -47F, 19F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[163].setRotationPoint(-111F, -55F, 19F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 165
		bodyModel[164].setRotationPoint(-102F, -55F, 19F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[165].setRotationPoint(-111F, -55F, 13F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[166].setRotationPoint(-111F, -55F, 7F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[167].setRotationPoint(-112F, -55F, 0F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		bodyModel[168].setRotationPoint(-111F, -55F, 0F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
		bodyModel[169].setRotationPoint(-102F, -55F, 1F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F); // Box 171
		bodyModel[170].setRotationPoint(-120F, -47F, 19F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
		bodyModel[171].setRotationPoint(-120F, -47F, 7F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		bodyModel[172].setRotationPoint(-127F, -47F, 0F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F); // Box 174
		bodyModel[173].setRotationPoint(-127F, -55F, 6F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 2F, 0F, 5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 2F); // Box 175
		bodyModel[174].setRotationPoint(-126F, -47F, 12F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 0F); // Box 176
		bodyModel[175].setRotationPoint(-126F, -42F, 14F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[176].setRotationPoint(-133F, -42F, 0F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		bodyModel[177].setRotationPoint(-135F, -34F, 0F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		bodyModel[178].setRotationPoint(-132F, -23F, 0F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F); // Box 180
		bodyModel[179].setRotationPoint(-135F, -33F, 6F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		bodyModel[180].setRotationPoint(-135F, -42F, 6F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 182
		bodyModel[181].setRotationPoint(-133F, -42F, 6F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		bodyModel[182].setRotationPoint(-126F, -42F, 7F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
		bodyModel[183].setRotationPoint(-126F, -34F, 7F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,6F, -11F, 0F, -6F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 11F, 0F, -6F, 11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		bodyModel[184].setRotationPoint(-126F, -34F, 7F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 0F); // Box 186
		bodyModel[185].setRotationPoint(-126F, -34F, 14F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -2F, 7F, 0F, -2F, 7F, 0F, 2F, -7F, 0F, 2F); // Box 187
		bodyModel[186].setRotationPoint(-126F, -34F, 14F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[187].setRotationPoint(-119F, -23F, 7F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -3F, 0F, 1F, 3F, 0F, 0F, 0F); // Box 189
		bodyModel[188].setRotationPoint(-119F, -23F, 16F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 10F, -3F, 0F, 10F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, -3F, 0F, -10F, 3F, 0F, 0F, 0F); // Box 190
		bodyModel[189].setRotationPoint(-119F, -23F, 16F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 191
		bodyModel[190].setRotationPoint(-119F, -23F, 16F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 192
		bodyModel[191].setRotationPoint(-119F, -17F, 0F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[192].setRotationPoint(-126F, -42F, 14F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 18, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[193].setRotationPoint(-45F, -2F, 51F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 18, 6, 8, 0F,-6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		bodyModel[194].setRotationPoint(-45F, -8F, 51F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 18, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Box 196
		bodyModel[195].setRotationPoint(-45F, 4F, 51F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 21, 8, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 197
		bodyModel[196].setRotationPoint(116F, -55F, 0F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 21, 11, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -5F, 0F, -3F, -5F, -2F, 0F, 0F, 0F); // Box 198
		bodyModel[197].setRotationPoint(116F, -47F, 0F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 21, 14, 3, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 199
		bodyModel[198].setRotationPoint(116F, -69F, 0F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 17, 14, 3, 0F,0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 200
		bodyModel[199].setRotationPoint(116F, -83F, 0F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 8, 3, 3, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 201
		bodyModel[200].setRotationPoint(116F, -86F, 0F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 6, 31, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[201].setRotationPoint(110F, -86F, 0F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 26, 31, 3, 0F,-21F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -21F, -3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 203
		bodyModel[202].setRotationPoint(84F, -86F, 0F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 8, 3, 48, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[203].setRotationPoint(110F, -89F, -1F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 4, 3, 48, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, -2F); // Box 205
		bodyModel[204].setRotationPoint(106F, -89F, -1F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 13, 3, 48, 0F,0F, 0F, 0F, 0F, -1F, 0F, -8F, -1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -8F, -1F, -5F, 0F, 0F, 0F); // Box 206
		bodyModel[205].setRotationPoint(118F, -89F, -1F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 1, 25, 0F,0F, -21F, 0F, 0F, -21F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 21F, 0F, 0F, 21F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		bodyModel[206].setRotationPoint(113F, -87F, 3F);

		bodyModel[207].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 208
		bodyModel[207].setRotationPoint(-49.5F, -94F, 136F);

		bodyModel[208].addBox(0F, 0F, 0F, 2, 7, 2, 0F); // Box 209
		bodyModel[208].setRotationPoint(-48F, -94F, 137F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		bodyModel[209].setRotationPoint(-50F, -96F, 135F);

		bodyModel[210].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 211
		bodyModel[210].setRotationPoint(-50F, -91F, 135F);

		bodyModel[211].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 212
		bodyModel[211].setRotationPoint(-45.5F, -94F, 139F);

		bodyModel[212].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 213
		bodyModel[212].setRotationPoint(-49.5F, -94F, 139F);

		bodyModel[213].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 214
		bodyModel[213].setRotationPoint(-45.5F, -94F, 136F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		bodyModel[214].setRotationPoint(-99F, -13F, -1F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221
		bodyModel[215].setRotationPoint(-99F, -5F, -3F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 2, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -3F, 0F, 0F); // Box 222
		bodyModel[216].setRotationPoint(-99F, -4F, -3F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 2, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -3F, 0F, 0F); // Box 223
		bodyModel[217].setRotationPoint(-99F, -4F, 2F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[218].setRotationPoint(-101F, 2F, -2F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		bodyModel[219].setRotationPoint(-101F, -2F, -2F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 226
		bodyModel[220].setRotationPoint(-101F, 6F, -2F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 3, 19, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 227
		bodyModel[221].setRotationPoint(19F, -74F, -0.5F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 92, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 228
		bodyModel[222].setRotationPoint(21F, -74F, -0.5F);
		bodyModel[222].rotateAngleZ = 0.13962634F;

		bodyModel[223].addShapeBox(0F, 0F, 0F, 5, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 229
		bodyModel[223].setRotationPoint(-23F, -58F, -3F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 230
		bodyModel[224].setRotationPoint(-23F, -60F, -3F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,0F, -3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 231
		bodyModel[225].setRotationPoint(-26F, -58F, -3F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,0F, -3F, -2F, 0F, 2F, -2F, 0F, 2F, -2F, 0F, -3F, -2F, 0F, 0F, -2F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -2F); // Box 232
		bodyModel[226].setRotationPoint(-26F, -58F, -3F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 233
		bodyModel[227].setRotationPoint(109F, -37F, -0.5F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 234
		bodyModel[228].setRotationPoint(107F, -28F, -0.5F);
	}

	private void inithudModel_1()
	{
		hudModel[0] = new ModelRendererTurbo(this, 553, 41, textureX, textureY); // Box 328
		hudModel[1] = new ModelRendererTurbo(this, 385, 121, textureX, textureY); // Box 329
		hudModel[2] = new ModelRendererTurbo(this, 649, 89, textureX, textureY); // Box 330
		hudModel[3] = new ModelRendererTurbo(this, 553, 113, textureX, textureY); // Box 311
		hudModel[4] = new ModelRendererTurbo(this, 753, 113, textureX, textureY); // Box 312
		hudModel[5] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 313
		hudModel[6] = new ModelRendererTurbo(this, 801, 73, textureX, textureY); // Box 314
		hudModel[7] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box 315
		hudModel[8] = new ModelRendererTurbo(this, 969, 65, textureX, textureY); // Box 316
		hudModel[9] = new ModelRendererTurbo(this, 209, 137, textureX, textureY); // Box 320
		hudModel[10] = new ModelRendererTurbo(this, 1009, 33, textureX, textureY); // Box 321
		hudModel[11] = new ModelRendererTurbo(this, 401, 65, textureX, textureY); // Box 322
		hudModel[12] = new ModelRendererTurbo(this, 697, 65, textureX, textureY); // Box 2
		hudModel[13] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 3
		hudModel[14] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 4
		hudModel[15] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 5
		hudModel[16] = new ModelRendererTurbo(this, 745, 33, textureX, textureY); // Box 6
		hudModel[17] = new ModelRendererTurbo(this, 433, 81, textureX, textureY); // Box 331
		hudModel[18] = new ModelRendererTurbo(this, 801, 81, textureX, textureY); // Box 335
		hudModel[19] = new ModelRendererTurbo(this, 177, 73, textureX, textureY); // Box 340
		hudModel[20] = new ModelRendererTurbo(this, 737, 81, textureX, textureY); // Box 341
		hudModel[21] = new ModelRendererTurbo(this, 2, 485, textureX, textureY); // Shape 11
		hudModel[22] = new ModelRendererTurbo(this, 297, 145, textureX, textureY); // Box 259
		hudModel[23] = new ModelRendererTurbo(this, 745, 89, textureX, textureY); // Box 260
		hudModel[24] = new ModelRendererTurbo(this, 985, 161, textureX, textureY); // Box 261
		hudModel[25] = new ModelRendererTurbo(this, 281, 113, textureX, textureY); // Box 262
		hudModel[26] = new ModelRendererTurbo(this, 401, 145, textureX, textureY); // Box 263
		hudModel[27] = new ModelRendererTurbo(this, 953, 177, textureX, textureY); // Box 264
		hudModel[28] = new ModelRendererTurbo(this, 601, 113, textureX, textureY); // Box 265
		hudModel[29] = new ModelRendererTurbo(this, 833, 89, textureX, textureY); // Box 266
		hudModel[30] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 267
		hudModel[31] = new ModelRendererTurbo(this, 521, 89, textureX, textureY); // Box 268
		hudModel[32] = new ModelRendererTurbo(this, 481, 169, textureX, textureY); // Box 269
		hudModel[33] = new ModelRendererTurbo(this, 377, 73, textureX, textureY); // Box 270
		hudModel[34] = new ModelRendererTurbo(this, 801, 89, textureX, textureY); // Box 271
		hudModel[35] = new ModelRendererTurbo(this, 497, 73, textureX, textureY); // Box 272
		hudModel[36] = new ModelRendererTurbo(this, 873, 33, textureX, textureY); // Box 273
		hudModel[37] = new ModelRendererTurbo(this, 345, 49, textureX, textureY); // Box 274
		hudModel[38] = new ModelRendererTurbo(this, 641, 33, textureX, textureY); // Box 275
		hudModel[39] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 276
		hudModel[40] = new ModelRendererTurbo(this, 849, 89, textureX, textureY); // Box 277
		hudModel[41] = new ModelRendererTurbo(this, 585, 97, textureX, textureY); // Box 278
		hudModel[42] = new ModelRendererTurbo(this, 697, 73, textureX, textureY); // Box 279
		hudModel[43] = new ModelRendererTurbo(this, 601, 97, textureX, textureY); // Box 280
		hudModel[44] = new ModelRendererTurbo(this, 2, 485, textureX, textureY); // Shape 281
		hudModel[45] = new ModelRendererTurbo(this, 617, 185, textureX, textureY); // Box 282
		hudModel[46] = new ModelRendererTurbo(this, 17, 105, textureX, textureY); // Box 283
		hudModel[47] = new ModelRendererTurbo(this, 753, 193, textureX, textureY); // Box 284
		hudModel[48] = new ModelRendererTurbo(this, 481, 121, textureX, textureY); // Box 285
		hudModel[49] = new ModelRendererTurbo(this, 153, 105, textureX, textureY); // Box 286
		hudModel[50] = new ModelRendererTurbo(this, 209, 105, textureX, textureY); // Box 287
		hudModel[51] = new ModelRendererTurbo(this, 225, 105, textureX, textureY); // Box 288
		hudModel[52] = new ModelRendererTurbo(this, 673, 185, textureX, textureY); // Box 289
		hudModel[53] = new ModelRendererTurbo(this, 705, 185, textureX, textureY); // Box 290
		hudModel[54] = new ModelRendererTurbo(this, 465, 145, textureX, textureY); // Box 291
		hudModel[55] = new ModelRendererTurbo(this, 329, 105, textureX, textureY); // Box 292
		hudModel[56] = new ModelRendererTurbo(this, 249, 201, textureX, textureY); // Box 293
		hudModel[57] = new ModelRendererTurbo(this, 825, 145, textureX, textureY); // Box 294
		hudModel[58] = new ModelRendererTurbo(this, 345, 105, textureX, textureY); // Box 295
		hudModel[59] = new ModelRendererTurbo(this, 441, 105, textureX, textureY); // Box 296
		hudModel[60] = new ModelRendererTurbo(this, 273, 113, textureX, textureY); // Box 297
		hudModel[61] = new ModelRendererTurbo(this, 969, 185, textureX, textureY); // Box 298
		hudModel[62] = new ModelRendererTurbo(this, 809, 193, textureX, textureY); // Box 299
		hudModel[63] = new ModelRendererTurbo(this, 345, 177, textureX, textureY); // Box 300

		hudModel[0].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 328
		hudModel[0].setRotationPoint(-91F, -22F, -13F);

		hudModel[1].addShapeBox(0F, 0F, 0F, 9, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 329
		hudModel[1].setRotationPoint(-93F, -23F, -14F);

		hudModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 330
		hudModel[2].setRotationPoint(-94F, -23F, -14F);

		hudModel[3].addShapeBox(0F, 0F, 0F, 2, 5, 10, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 311
		hudModel[3].setRotationPoint(-85F, -28F, -14F);

		hudModel[4].addShapeBox(0F, 0F, 0F, 2, 7, 10, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 312
		hudModel[4].setRotationPoint(-84F, -35F, -14F);

		hudModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 313
		hudModel[5].setRotationPoint(-83F, -36F, -14F);

		hudModel[6].addShapeBox(0F, 0F, 0F, 6, 5, 1, 0F,-5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 314
		hudModel[6].setRotationPoint(-89F, -28F, -14F);

		hudModel[7].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 315
		hudModel[7].setRotationPoint(-86F, -22F, -17F);

		hudModel[8].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 316
		hudModel[8].setRotationPoint(-92F, -26F, -16.5F);
		hudModel[8].rotateAngleZ = -0.61086524F;

		hudModel[9].addShapeBox(0F, 0F, 0F, 4, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 320
		hudModel[9].setRotationPoint(-106F, -20F, -16F);

		hudModel[10].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 321
		hudModel[10].setRotationPoint(-104F, -20F, -15F);
		hudModel[10].rotateAngleZ = 1.11701072F;

		hudModel[11].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 322
		hudModel[11].setRotationPoint(-102.5F, -24F, -15.5F);
		hudModel[11].rotateAngleZ = -0.9424778F;

		hudModel[12].addShapeBox(0F, -10F, 0F, 3, 5, 1, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 2
		hudModel[12].setRotationPoint(-97F, -20F, -9.5F);

		hudModel[13].addShapeBox(0F, -5F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		hudModel[13].setRotationPoint(-97F, -20F, -9.5F);

		hudModel[14].addShapeBox(2F, -11F, -0.5F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		hudModel[14].setRotationPoint(-97F, -20F, -9.5F);

		hudModel[15].addShapeBox(2.5F, -11.5F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		hudModel[15].setRotationPoint(-97F, -20F, -9.5F);

		hudModel[16].addShapeBox(2F, -12F, -0.5F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		hudModel[16].setRotationPoint(-97F, -20F, -9.5F);

		hudModel[17].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 331
		hudModel[17].setRotationPoint(-91F, -22F, -6F);

		hudModel[18].addShapeBox(0F, 0F, 0F, 6, 5, 1, 0F,-5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 335
		hudModel[18].setRotationPoint(-89F, -28F, -5F);

		hudModel[19].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 340
		hudModel[19].setRotationPoint(-104F, -20F, -4F);
		hudModel[19].rotateAngleZ = 1.11701072F;

		hudModel[20].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 341
		hudModel[20].setRotationPoint(-102.5F, -24F, -4.5F);
		hudModel[20].rotateAngleZ = -0.9424778F;

		hudModel[21].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(3, 9, 3, 9), new Coord2D(3, 2, 3, 2), new Coord2D(8, 9, 8, 9), new Coord2D(10, 12, 10, 12), new Coord2D(10, 17, 10, 17), new Coord2D(4, 17, 4, 17), new Coord2D(1, 9, 1, 9), new Coord2D(3, 9, 3, 9) }), 8, 10, 17, 42, 8, ModelRendererTurbo.MR_FRONT, new float[] {0 ,2 ,9 ,6 ,5 ,4 ,9 ,7}); // Shape 11
		hudModel[21].setRotationPoint(-99F, -11F, -5F);

		hudModel[22].addShapeBox(0F, 0F, 0F, 6, 7, 12, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 259
		hudModel[22].setRotationPoint(-109F, -35F, -15F);

		hudModel[23].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 260
		hudModel[23].setRotationPoint(-91F, -22F, 12F);

		hudModel[24].addShapeBox(0F, 0F, 0F, 9, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 261
		hudModel[24].setRotationPoint(-93F, -23F, 4F);

		hudModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 262
		hudModel[25].setRotationPoint(-94F, -23F, 4F);

		hudModel[26].addShapeBox(0F, 0F, 0F, 2, 5, 10, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 263
		hudModel[26].setRotationPoint(-85F, -28F, 4F);

		hudModel[27].addShapeBox(0F, 0F, 0F, 2, 7, 10, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 264
		hudModel[27].setRotationPoint(-84F, -35F, 4F);

		hudModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 265
		hudModel[28].setRotationPoint(-83F, -36F, 4F);

		hudModel[29].addShapeBox(0F, 0F, 0F, 6, 5, 1, 0F,-5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 266
		hudModel[29].setRotationPoint(-89F, -28F, 13F);

		hudModel[30].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 267
		hudModel[30].setRotationPoint(-86F, -21F, 15F);

		hudModel[31].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 268
		hudModel[31].setRotationPoint(-92F, -25F, 15.5F);
		hudModel[31].rotateAngleZ = -0.61086524F;

		hudModel[32].addShapeBox(0F, 0F, 0F, 4, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 269
		hudModel[32].setRotationPoint(-106F, -20F, 2F);

		hudModel[33].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 270
		hudModel[33].setRotationPoint(-104F, -20F, 14F);
		hudModel[33].rotateAngleZ = 1.11701072F;

		hudModel[34].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 271
		hudModel[34].setRotationPoint(-102.5F, -24F, 13.5F);
		hudModel[34].rotateAngleZ = -0.9424778F;

		hudModel[35].addShapeBox(0F, -10F, 0F, 3, 5, 1, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 272
		hudModel[35].setRotationPoint(-97F, -20F, 8.5F);

		hudModel[36].addShapeBox(0F, -5F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 273
		hudModel[36].setRotationPoint(-97F, -20F, 8.5F);

		hudModel[37].addShapeBox(2F, -11F, -0.5F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 274
		hudModel[37].setRotationPoint(-97F, -20F, 8.5F);

		hudModel[38].addShapeBox(2.5F, -11.5F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 275
		hudModel[38].setRotationPoint(-97F, -20F, 8.5F);

		hudModel[39].addShapeBox(2F, -12F, -0.5F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 276
		hudModel[39].setRotationPoint(-97F, -20F, 8.5F);

		hudModel[40].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 277
		hudModel[40].setRotationPoint(-91F, -22F, 5F);

		hudModel[41].addShapeBox(0F, 0F, 0F, 6, 5, 1, 0F,-5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 278
		hudModel[41].setRotationPoint(-89F, -28F, 4F);

		hudModel[42].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 279
		hudModel[42].setRotationPoint(-104F, -20F, 3F);
		hudModel[42].rotateAngleZ = 1.11701072F;

		hudModel[43].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 280
		hudModel[43].setRotationPoint(-102.5F, -24F, 2.5F);
		hudModel[43].rotateAngleZ = -0.9424778F;

		hudModel[44].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(3, 9, 3, 9), new Coord2D(3, 2, 3, 2), new Coord2D(8, 9, 8, 9), new Coord2D(10, 12, 10, 12), new Coord2D(10, 17, 10, 17), new Coord2D(4, 17, 4, 17), new Coord2D(1, 9, 1, 9), new Coord2D(3, 9, 3, 9) }), 8, 10, 17, 42, 8, ModelRendererTurbo.MR_FRONT, new float[] {0 ,2 ,9 ,6 ,5 ,4 ,9 ,7}); // Shape 281
		hudModel[44].setRotationPoint(-99F, -11F, 13F);

		hudModel[45].addShapeBox(0F, 0F, 0F, 6, 7, 12, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 282
		hudModel[45].setRotationPoint(-109F, -35F, 3F);

		hudModel[46].addShapeBox(0F, 0F, 0F, 6, 5, 1, 0F,-5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 283
		hudModel[46].setRotationPoint(-71F, -28F, -5F);

		hudModel[47].addShapeBox(0F, 0F, 0F, 9, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 284
		hudModel[47].setRotationPoint(-75F, -23F, -14F);

		hudModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 285
		hudModel[48].setRotationPoint(-76F, -23F, -14F);

		hudModel[49].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 286
		hudModel[49].setRotationPoint(-73F, -22F, -6F);

		hudModel[50].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 287
		hudModel[50].setRotationPoint(-73F, -22F, -13F);

		hudModel[51].addShapeBox(0F, 0F, 0F, 6, 5, 1, 0F,-5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 288
		hudModel[51].setRotationPoint(-71F, -28F, -14F);

		hudModel[52].addShapeBox(0F, 0F, 0F, 2, 5, 10, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 289
		hudModel[52].setRotationPoint(-67F, -28F, -14F);

		hudModel[53].addShapeBox(0F, 0F, 0F, 2, 7, 10, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 290
		hudModel[53].setRotationPoint(-66F, -35F, -14F);

		hudModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 291
		hudModel[54].setRotationPoint(-65F, -36F, -14F);

		hudModel[55].addShapeBox(0F, 0F, 0F, 6, 5, 1, 0F,-5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 292
		hudModel[55].setRotationPoint(-71F, -28F, 4F);

		hudModel[56].addShapeBox(0F, 0F, 0F, 9, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 293
		hudModel[56].setRotationPoint(-75F, -23F, 4F);

		hudModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 294
		hudModel[57].setRotationPoint(-76F, -23F, 4F);

		hudModel[58].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 295
		hudModel[58].setRotationPoint(-73F, -22F, 5F);

		hudModel[59].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 296
		hudModel[59].setRotationPoint(-73F, -22F, 12F);

		hudModel[60].addShapeBox(0F, 0F, 0F, 6, 5, 1, 0F,-5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 297
		hudModel[60].setRotationPoint(-71F, -28F, 13F);

		hudModel[61].addShapeBox(0F, 0F, 0F, 2, 5, 10, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 298
		hudModel[61].setRotationPoint(-67F, -28F, 4F);

		hudModel[62].addShapeBox(0F, 0F, 0F, 2, 7, 10, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 299
		hudModel[62].setRotationPoint(-66F, -35F, 4F);

		hudModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		hudModel[63].setRotationPoint(-65F, -36F, 4F);
	}

	private void initPropeller()
	{
		propellerModels = new ModelRendererTurbo[2][3];
		propellerModels[0] = makeProp1(-48F, -93F, -138F);
		propellerModels[1] = makeProp2(-48F, -93F, 138F);
	}

	private ModelRendererTurbo[] makeProp1(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[3];
		prop[0] = new ModelRendererTurbo(this, 1008, 50, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 1008, 50, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 1008, 50, textureX, textureY);
		prop[0].addBox(-0.5F, -86F, -2F, 1, 86, 4, 0.0F);
		prop[1].addBox(-0.5F, -86F, -2F, 1, 86, 4, 0.0F);
		prop[2].addBox(-0.5F, -86F, -2F, 1, 86, 4, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		prop[0].rotateAngleY = -1.57079633F;
		prop[1].rotateAngleY = -1.57079633F;
		prop[2].rotateAngleY = -1.57079633F;
		return prop;
	}

	private ModelRendererTurbo[] makeProp2(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[3];
		prop[0] = new ModelRendererTurbo(this, 1008, 50, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 1008, 50, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 1008, 50, textureX, textureY);
		prop[0].addBox(-0.5F, -86F, -2F, 1, 86, 4, 0.0F);
		prop[1].addBox(-0.5F, -86F, -2F, 1, 86, 4, 0.0F);
		prop[2].addBox(-0.5F, -86F, -2F, 1, 86, 4, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		prop[0].rotateAngleY = 1.04719755F;
		prop[1].rotateAngleY = 1.04719755F;
		prop[2].rotateAngleY = 1.04719755F;
		prop[0].rotateAngleY = -4.71238898F;
		prop[1].rotateAngleY = -4.71238898F;
		prop[2].rotateAngleY = -4.71238898F;
		return prop;
	}

	private void initGuns() {
	}
	{

		// Passenger 5
		ModelRendererTurbo[][] gun_4_Model = new ModelRendererTurbo[3][];

		gun_4_Model[0] = new ModelRendererTurbo[0];

		gun_4_Model[1] = new ModelRendererTurbo[18];
		gun_4_Model[1][0] = new ModelRendererTurbo(this, 109, 0, textureX, textureY); // MG 1
		gun_4_Model[1][1] = new ModelRendererTurbo(this, 109, 0, textureX, textureY); // MG 1 Inner
		gun_4_Model[1][2] = new ModelRendererTurbo(this, 109, 3, textureX, textureY); // MG 2 Lauf
		gun_4_Model[1][3] = new ModelRendererTurbo(this, 109, 6, textureX, textureY); // MG 3
		gun_4_Model[1][4] = new ModelRendererTurbo(this, 128, 6, textureX, textureY); // MG 4
		gun_4_Model[1][5] = new ModelRendererTurbo(this, 109, 25, textureX, textureY); // MG 5
		gun_4_Model[1][6] = new ModelRendererTurbo(this, 114, 25, textureX, textureY); // MG 6
		gun_4_Model[1][7] = new ModelRendererTurbo(this, 109, 11, textureX, textureY); // MG 7
		gun_4_Model[1][8] = new ModelRendererTurbo(this, 116, 11, textureX, textureY); // MG 8
		gun_4_Model[1][9] = new ModelRendererTurbo(this, 116, 11, textureX, textureY); // MG 8 Inner
		gun_4_Model[1][10] = new ModelRendererTurbo(this, 123, 11, textureX, textureY); // MG 9
		gun_4_Model[1][11] = new ModelRendererTurbo(this, 123, 11, textureX, textureY); // MG 10
		gun_4_Model[1][12] = new ModelRendererTurbo(this, 132, 10, textureX, textureY); // MG 11
		gun_4_Model[1][13] = new ModelRendererTurbo(this, 109, 16, textureX, textureY); // Ammo 1
		gun_4_Model[1][14] = new ModelRendererTurbo(this, 109, 16, textureX, textureY); // Ammo 2
		gun_4_Model[1][15] = new ModelRendererTurbo(this, 115, 16, textureX, textureY); // Ammo 3
		gun_4_Model[1][16] = new ModelRendererTurbo(this, 126, 16, textureX, textureY); // Ammo 4
		gun_4_Model[1][17] = new ModelRendererTurbo(this, 126, 16, textureX, textureY); // Ammo 5

		gun_4_Model[1][0].addBox(-2F, -0.5F, -0.5F, 13, 1, 1, 0F); // MG 1

		gun_4_Model[1][1].addBox(-2F, -0.5F, -0.5F, 13, 1, 1, 0F); // MG 1 Inner

		gun_4_Model[1][2].addShapeBox(-2F, -0.5F, -0.5F, 13, 1, 1, 0F,0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F); // MG 2 Lauf

		gun_4_Model[1][3].addBox(-9F, -1F, -1F, 7, 2, 2, 0F); // MG 3

		gun_4_Model[1][4].addShapeBox(-6F, -1.5F, -1F, 4, 1, 2, 0F,-2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // MG 4

		gun_4_Model[1][5].addShapeBox(9F, -2.5F, -0.5F, 1, 2, 1, 0F,-0.4F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.4F, 0F, -0.4F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // MG 5

		gun_4_Model[1][6].addShapeBox(-4F, -2F, -0.5F, 1, 2, 1, 0F,-0.4F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.4F, 0F, -0.4F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // MG 6

		gun_4_Model[1][7].addShapeBox(-8.2F, 1F, -0.5F, 2, 3, 1, 0F,-1F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -1F, 0F, -0.1F, 0F, -1F, -0.1F, -1F, 0F, -0.1F, -1F, 0F, -0.1F, 0F, -1F, -0.1F); // MG 7

		gun_4_Model[1][8].addShapeBox(-7F, 1F, -0.5F, 2, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // MG 8

		gun_4_Model[1][9].addShapeBox(-7F, 1F, -0.5F, 2, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // MG 8 Inner

		gun_4_Model[1][10].addBox(-5.5F, -0.5F, 0.2F, 3, 1, 1, 0F); // MG 9

		gun_4_Model[1][11].addBox(-5.5F, -0.5F, -1.2F, 3, 1, 1, 0F); // MG 10

		gun_4_Model[1][12].addShapeBox(-2F, -1F, -1F, 2, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.25F, -0.25F); // MG 11

		gun_4_Model[1][13].addShapeBox(-5F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Ammo 1

		gun_4_Model[1][14].addShapeBox(-5F, 0F, -3F, 2, 1, 3, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Ammo 2

		gun_4_Model[1][15].addBox(-5F, 1F, -3F, 2, 1, 6, 0F); // Ammo 3

		gun_4_Model[1][16].addShapeBox(-5F, 2F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Ammo 4

		gun_4_Model[1][17].addShapeBox(-5F, 2F, -3F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Ammo 5

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_4_Model[1])
		{
			gunPart.setRotationPoint(-133F, -27F, 0F);
		}


		gun_4_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("NoseGun", gun_4_Model);
	}
}