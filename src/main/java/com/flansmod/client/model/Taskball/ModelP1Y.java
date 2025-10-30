//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: P1Y
// Model Creator: 
// Created on: 02.06.2023 - 01:28:33
// Last changed on: 02.06.2023 - 01:28:33

package com.flansmod.client.model.Taskball; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelP1Y extends ModelPlane //Same as Filename
{
	int textureX = 2048;
	int textureY = 1024;

	public ModelP1Y() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[234];
		leftWingModel = new ModelRendererTurbo[32];
		tailWheelModel = new ModelRendererTurbo[8];
		leftWingWheelModel = new ModelRendererTurbo[10];
		rightWingWheelModel = new ModelRendererTurbo[10];
		helicopterModeParts = new ModelRendererTurbo[31];
		planeModeParts = new ModelRendererTurbo[44];

		initbodyModel_1();
		initleftWingModel_1();
		inittailWheelModel_1();
		initleftWingWheelModel_1();
		initrightWingWheelModel_1();
		inithelicopterModeParts_1();
		initplaneModeParts_1();

		initPropeller();

		initGuns();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 396, 298, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 561, 1, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 327, 298, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 681, 1, textureX, textureY); // Box 10
		bodyModel[10] = new ModelRendererTurbo(this, 737, 1, textureX, textureY); // Box 11
		bodyModel[11] = new ModelRendererTurbo(this, 473, 298, textureX, textureY); // Box 12
		bodyModel[12] = new ModelRendererTurbo(this, 833, 1, textureX, textureY); // Box 13
		bodyModel[13] = new ModelRendererTurbo(this, 913, 1, textureX, textureY); // Box 14
		bodyModel[14] = new ModelRendererTurbo(this, 1153, 1, textureX, textureY); // Box 15
		bodyModel[15] = new ModelRendererTurbo(this, 1385, 1, textureX, textureY); // Box 16
		bodyModel[16] = new ModelRendererTurbo(this, 1433, 1, textureX, textureY); // Box 17
		bodyModel[17] = new ModelRendererTurbo(this, 255, 298, textureX, textureY); // Box 18
		bodyModel[18] = new ModelRendererTurbo(this, 174, 298, textureX, textureY); // Box 19
		bodyModel[19] = new ModelRendererTurbo(this, 0, 311, textureX, textureY); // Box 20
		bodyModel[20] = new ModelRendererTurbo(this, 1777, 1, textureX, textureY); // Box 21
		bodyModel[21] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 22
		bodyModel[22] = new ModelRendererTurbo(this, 665, 17, textureX, textureY); // Box 23
		bodyModel[23] = new ModelRendererTurbo(this, 1465, 17, textureX, textureY); // Box 24
		bodyModel[24] = new ModelRendererTurbo(this, 1921, 17, textureX, textureY); // Box 25
		bodyModel[25] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 26
		bodyModel[26] = new ModelRendererTurbo(this, 1921, 1, textureX, textureY); // Box 27
		bodyModel[27] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 28
		bodyModel[28] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 29
		bodyModel[29] = new ModelRendererTurbo(this, 825, 17, textureX, textureY); // Box 30
		bodyModel[30] = new ModelRendererTurbo(this, 921, 25, textureX, textureY); // Box 31
		bodyModel[31] = new ModelRendererTurbo(this, 1017, 25, textureX, textureY); // Box 32
		bodyModel[32] = new ModelRendererTurbo(this, 1113, 25, textureX, textureY); // Box 33
		bodyModel[33] = new ModelRendererTurbo(this, 1209, 25, textureX, textureY); // Box 34
		bodyModel[34] = new ModelRendererTurbo(this, 609, 25, textureX, textureY); // Box 35
		bodyModel[35] = new ModelRendererTurbo(this, 1305, 25, textureX, textureY); // Box 36
		bodyModel[36] = new ModelRendererTurbo(this, 1353, 25, textureX, textureY); // Box 37
		bodyModel[37] = new ModelRendererTurbo(this, 1289, 25, textureX, textureY); // Box 38
		bodyModel[38] = new ModelRendererTurbo(this, 1665, 25, textureX, textureY); // Box 39
		bodyModel[39] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 40
		bodyModel[40] = new ModelRendererTurbo(this, 1465, 33, textureX, textureY); // Box 41
		bodyModel[41] = new ModelRendererTurbo(this, 1801, 25, textureX, textureY); // Box 42
		bodyModel[42] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 43
		bodyModel[43] = new ModelRendererTurbo(this, 1801, 25, textureX, textureY); // Box 44
		bodyModel[44] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 45
		bodyModel[45] = new ModelRendererTurbo(this, 1849, 25, textureX, textureY); // Box 46
		bodyModel[46] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 102
		bodyModel[47] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Box 103
		bodyModel[48] = new ModelRendererTurbo(this, 929, 81, textureX, textureY); // Box 104
		bodyModel[49] = new ModelRendererTurbo(this, 1513, 33, textureX, textureY); // Box 105
		bodyModel[50] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 106
		bodyModel[51] = new ModelRendererTurbo(this, 745, 41, textureX, textureY); // Box 107
		bodyModel[52] = new ModelRendererTurbo(this, 857, 41, textureX, textureY); // Box 108
		bodyModel[53] = new ModelRendererTurbo(this, 1801, 41, textureX, textureY); // Box 109
		bodyModel[54] = new ModelRendererTurbo(this, 1801, 57, textureX, textureY); // Box 110
		bodyModel[55] = new ModelRendererTurbo(this, 969, 41, textureX, textureY); // Box 111
		bodyModel[56] = new ModelRendererTurbo(this, 337, 49, textureX, textureY); // Box 112
		bodyModel[57] = new ModelRendererTurbo(this, 1081, 41, textureX, textureY); // Box 113
		bodyModel[58] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 75
		bodyModel[59] = new ModelRendererTurbo(this, 1465, 73, textureX, textureY); // Box 76
		bodyModel[60] = new ModelRendererTurbo(this, 547, 298, textureX, textureY); // Box 77
		bodyModel[61] = new ModelRendererTurbo(this, 99, 298, textureX, textureY); // Box 78
		bodyModel[62] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 79
		bodyModel[63] = new ModelRendererTurbo(this, 593, 1, textureX, textureY); // Box 80
		bodyModel[64] = new ModelRendererTurbo(this, 905, 1, textureX, textureY); // Box 81
		bodyModel[65] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 82
		bodyModel[66] = new ModelRendererTurbo(this, 1137, 1, textureX, textureY); // Box 83
		bodyModel[67] = new ModelRendererTurbo(this, 561, 1, textureX, textureY); // Box 84
		bodyModel[68] = new ModelRendererTurbo(this, 1377, 1, textureX, textureY); // Box 85
		bodyModel[69] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 86
		bodyModel[70] = new ModelRendererTurbo(this, 1417, 1, textureX, textureY); // Box 87
		bodyModel[71] = new ModelRendererTurbo(this, 569, 1, textureX, textureY); // Box 88
		bodyModel[72] = new ModelRendererTurbo(this, 1425, 1, textureX, textureY); // Box 89
		bodyModel[73] = new ModelRendererTurbo(this, 1609, 1, textureX, textureY); // Box 90
		bodyModel[74] = new ModelRendererTurbo(this, 1761, 1, textureX, textureY); // Box 91
		bodyModel[75] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 92
		bodyModel[76] = new ModelRendererTurbo(this, 729, 1, textureX, textureY); // Box 93
		bodyModel[77] = new ModelRendererTurbo(this, 1761, 9, textureX, textureY); // Box 94
		bodyModel[78] = new ModelRendererTurbo(this, 593, 9, textureX, textureY); // Box 95
		bodyModel[79] = new ModelRendererTurbo(this, 761, 1, textureX, textureY); // Box 96
		bodyModel[80] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 97
		bodyModel[81] = new ModelRendererTurbo(this, 1137, 9, textureX, textureY); // Box 98
		bodyModel[82] = new ModelRendererTurbo(this, 75, 298, textureX, textureY); // Box 99
		bodyModel[83] = new ModelRendererTurbo(this, 51, 298, textureX, textureY); // Box 100
		bodyModel[84] = new ModelRendererTurbo(this, 27, 298, textureX, textureY); // Box 101
		bodyModel[85] = new ModelRendererTurbo(this, 1153, 1, textureX, textureY); // Box 102
		bodyModel[86] = new ModelRendererTurbo(this, 553, 1, textureX, textureY); // Box 103
		bodyModel[87] = new ModelRendererTurbo(this, 1377, 9, textureX, textureY); // Box 104
		bodyModel[88] = new ModelRendererTurbo(this, 1417, 9, textureX, textureY); // Box 105
		bodyModel[89] = new ModelRendererTurbo(this, 545, 17, textureX, textureY); // Box 106
		bodyModel[90] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Box 107
		bodyModel[91] = new ModelRendererTurbo(this, 537, 25, textureX, textureY); // Box 108
		bodyModel[92] = new ModelRendererTurbo(this, 1385, 1, textureX, textureY); // Box 109
		bodyModel[93] = new ModelRendererTurbo(this, 649, 25, textureX, textureY); // Box 110
		bodyModel[94] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 111
		bodyModel[95] = new ModelRendererTurbo(this, 913, 9, textureX, textureY); // Box 112
		bodyModel[96] = new ModelRendererTurbo(this, 1537, 1, textureX, textureY); // Box 113
		bodyModel[97] = new ModelRendererTurbo(this, 1921, 1, textureX, textureY); // Box 114
		bodyModel[98] = new ModelRendererTurbo(this, 2041, 1, textureX, textureY); // Box 115
		bodyModel[99] = new ModelRendererTurbo(this, 1617, 9, textureX, textureY); // Box 116
		bodyModel[100] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 117
		bodyModel[101] = new ModelRendererTurbo(this, 665, 25, textureX, textureY); // Box 118
		bodyModel[102] = new ModelRendererTurbo(this, 809, 25, textureX, textureY); // Box 119
		bodyModel[103] = new ModelRendererTurbo(this, 1009, 25, textureX, textureY); // Box 120
		bodyModel[104] = new ModelRendererTurbo(this, 1105, 25, textureX, textureY); // Box 121
		bodyModel[105] = new ModelRendererTurbo(this, 585, 33, textureX, textureY); // Box 122
		bodyModel[106] = new ModelRendererTurbo(this, 1153, 9, textureX, textureY); // Box 123
		bodyModel[107] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 124
		bodyModel[108] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 116
		bodyModel[109] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 117
		bodyModel[110] = new ModelRendererTurbo(this, 729, 9, textureX, textureY); // Box 118
		bodyModel[111] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 119
		bodyModel[112] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 122
		bodyModel[113] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 130
		bodyModel[114] = new ModelRendererTurbo(this, 1465, 33, textureX, textureY); // Box 131
		bodyModel[115] = new ModelRendererTurbo(this, 1033, 81, textureX, textureY); // Box 132
		bodyModel[116] = new ModelRendererTurbo(this, 1193, 41, textureX, textureY); // Box 133
		bodyModel[117] = new ModelRendererTurbo(this, 425, 81, textureX, textureY); // Box 134
		bodyModel[118] = new ModelRendererTurbo(this, 1729, 33, textureX, textureY); // Box 135
		bodyModel[119] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 136
		bodyModel[120] = new ModelRendererTurbo(this, 1345, 41, textureX, textureY); // Box 137
		bodyModel[121] = new ModelRendererTurbo(this, 396, 275, textureX, textureY); // Box 138
		bodyModel[122] = new ModelRendererTurbo(this, 1729, 41, textureX, textureY); // Box 139
		bodyModel[123] = new ModelRendererTurbo(this, 327, 275, textureX, textureY); // Box 140
		bodyModel[124] = new ModelRendererTurbo(this, 585, 57, textureX, textureY); // Box 141
		bodyModel[125] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 142
		bodyModel[126] = new ModelRendererTurbo(this, 473, 275, textureX, textureY); // Box 143
		bodyModel[127] = new ModelRendererTurbo(this, 201, 89, textureX, textureY); // Box 144
		bodyModel[128] = new ModelRendererTurbo(this, 585, 89, textureX, textureY); // Box 145
		bodyModel[129] = new ModelRendererTurbo(this, 1033, 105, textureX, textureY); // Box 146
		bodyModel[130] = new ModelRendererTurbo(this, 1193, 81, textureX, textureY); // Box 147
		bodyModel[131] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Box 148
		bodyModel[132] = new ModelRendererTurbo(this, 255, 275, textureX, textureY); // Box 149
		bodyModel[133] = new ModelRendererTurbo(this, 174, 275, textureX, textureY); // Box 150
		bodyModel[134] = new ModelRendererTurbo(this, 0, 353, textureX, textureY); // Box 151
		bodyModel[135] = new ModelRendererTurbo(this, 1617, 105, textureX, textureY); // Box 152
		bodyModel[136] = new ModelRendererTurbo(this, 585, 113, textureX, textureY); // Box 153
		bodyModel[137] = new ModelRendererTurbo(this, 217, 129, textureX, textureY); // Box 154
		bodyModel[138] = new ModelRendererTurbo(this, 1241, 89, textureX, textureY); // Box 155
		bodyModel[139] = new ModelRendererTurbo(this, 1921, 89, textureX, textureY); // Box 156
		bodyModel[140] = new ModelRendererTurbo(this, 137, 105, textureX, textureY); // Box 157
		bodyModel[141] = new ModelRendererTurbo(this, 1265, 105, textureX, textureY); // Box 158
		bodyModel[142] = new ModelRendererTurbo(this, 1913, 121, textureX, textureY); // Box 159
		bodyModel[143] = new ModelRendererTurbo(this, 1033, 129, textureX, textureY); // Box 160
		bodyModel[144] = new ModelRendererTurbo(this, 425, 97, textureX, textureY); // Box 161
		bodyModel[145] = new ModelRendererTurbo(this, 425, 121, textureX, textureY); // Box 162
		bodyModel[146] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 163
		bodyModel[147] = new ModelRendererTurbo(this, 1257, 121, textureX, textureY); // Box 164
		bodyModel[148] = new ModelRendererTurbo(this, 1465, 105, textureX, textureY); // Box 165
		bodyModel[149] = new ModelRendererTurbo(this, 337, 97, textureX, textureY); // Box 166
		bodyModel[150] = new ModelRendererTurbo(this, 745, 57, textureX, textureY); // Box 167
		bodyModel[151] = new ModelRendererTurbo(this, 857, 57, textureX, textureY); // Box 168
		bodyModel[152] = new ModelRendererTurbo(this, 625, 113, textureX, textureY); // Box 169
		bodyModel[153] = new ModelRendererTurbo(this, 1049, 129, textureX, textureY); // Box 170
		bodyModel[154] = new ModelRendererTurbo(this, 1465, 129, textureX, textureY); // Box 171
		bodyModel[155] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 172
		bodyModel[156] = new ModelRendererTurbo(this, 1729, 145, textureX, textureY); // Box 173
		bodyModel[157] = new ModelRendererTurbo(this, 153, 153, textureX, textureY); // Box 174
		bodyModel[158] = new ModelRendererTurbo(this, 969, 57, textureX, textureY); // Box 175
		bodyModel[159] = new ModelRendererTurbo(this, 1617, 33, textureX, textureY); // Box 176
		bodyModel[160] = new ModelRendererTurbo(this, 1513, 49, textureX, textureY); // Box 177
		bodyModel[161] = new ModelRendererTurbo(this, 369, 161, textureX, textureY); // Box 194
		bodyModel[162] = new ModelRendererTurbo(this, 1657, 145, textureX, textureY); // Box 195
		bodyModel[163] = new ModelRendererTurbo(this, 929, 161, textureX, textureY); // Box 196
		bodyModel[164] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 197
		bodyModel[165] = new ModelRendererTurbo(this, 585, 73, textureX, textureY); // Box 198
		bodyModel[166] = new ModelRendererTurbo(this, 961, 89, textureX, textureY); // Box 199
		bodyModel[167] = new ModelRendererTurbo(this, 1801, 105, textureX, textureY); // Box 200
		bodyModel[168] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 201
		bodyModel[169] = new ModelRendererTurbo(this, 1961, 145, textureX, textureY); // Box 202
		bodyModel[170] = new ModelRendererTurbo(this, 265, 105, textureX, textureY); // Box 203
		bodyModel[171] = new ModelRendererTurbo(this, 1505, 145, textureX, textureY); // Box 204
		bodyModel[172] = new ModelRendererTurbo(this, 1353, 121, textureX, textureY); // Box 205
		bodyModel[173] = new ModelRendererTurbo(this, 1201, 25, textureX, textureY); // Box 206
		bodyModel[174] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 207
		bodyModel[175] = new ModelRendererTurbo(this, 547, 275, textureX, textureY); // Box 208
		bodyModel[176] = new ModelRendererTurbo(this, 99, 275, textureX, textureY); // Box 209
		bodyModel[177] = new ModelRendererTurbo(this, 1609, 17, textureX, textureY); // Box 210
		bodyModel[178] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 211
		bodyModel[179] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 212
		bodyModel[180] = new ModelRendererTurbo(this, 1689, 33, textureX, textureY); // Box 213
		bodyModel[181] = new ModelRendererTurbo(this, 585, 41, textureX, textureY); // Box 214
		bodyModel[182] = new ModelRendererTurbo(this, 2041, 17, textureX, textureY); // Box 215
		bodyModel[183] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 216
		bodyModel[184] = new ModelRendererTurbo(this, 1785, 1, textureX, textureY); // Box 217
		bodyModel[185] = new ModelRendererTurbo(this, 1145, 17, textureX, textureY); // Box 218
		bodyModel[186] = new ModelRendererTurbo(this, 1489, 33, textureX, textureY); // Box 219
		bodyModel[187] = new ModelRendererTurbo(this, 777, 41, textureX, textureY); // Box 220
		bodyModel[188] = new ModelRendererTurbo(this, 1001, 41, textureX, textureY); // Box 221
		bodyModel[189] = new ModelRendererTurbo(this, 1465, 41, textureX, textureY); // Box 222
		bodyModel[190] = new ModelRendererTurbo(this, 1121, 41, textureX, textureY); // Box 223
		bodyModel[191] = new ModelRendererTurbo(this, 75, 275, textureX, textureY); // Box 230
		bodyModel[192] = new ModelRendererTurbo(this, 51, 275, textureX, textureY); // Box 231
		bodyModel[193] = new ModelRendererTurbo(this, 27, 275, textureX, textureY); // Box 232
		bodyModel[194] = new ModelRendererTurbo(this, 921, 25, textureX, textureY); // Box 233
		bodyModel[195] = new ModelRendererTurbo(this, 1297, 25, textureX, textureY); // Box 234
		bodyModel[196] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Box 235
		bodyModel[197] = new ModelRendererTurbo(this, 385, 49, textureX, textureY); // Box 236
		bodyModel[198] = new ModelRendererTurbo(this, 1841, 25, textureX, textureY); // Box 237
		bodyModel[199] = new ModelRendererTurbo(this, 793, 41, textureX, textureY); // Box 238
		bodyModel[200] = new ModelRendererTurbo(this, 785, 49, textureX, textureY); // Box 239
		bodyModel[201] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 240
		bodyModel[202] = new ModelRendererTurbo(this, 905, 41, textureX, textureY); // Box 241
		bodyModel[203] = new ModelRendererTurbo(this, 1345, 25, textureX, textureY); // Box 242
		bodyModel[204] = new ModelRendererTurbo(this, 1881, 25, textureX, textureY); // Box 243
		bodyModel[205] = new ModelRendererTurbo(this, 657, 33, textureX, textureY); // Box 244
		bodyModel[206] = new ModelRendererTurbo(this, 817, 33, textureX, textureY); // Box 245
		bodyModel[207] = new ModelRendererTurbo(this, 1513, 33, textureX, textureY); // Box 246
		bodyModel[208] = new ModelRendererTurbo(this, 1761, 33, textureX, textureY); // Box 247
		bodyModel[209] = new ModelRendererTurbo(this, 1881, 33, textureX, textureY); // Box 248
		bodyModel[210] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 249
		bodyModel[211] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 250
		bodyModel[212] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 251
		bodyModel[213] = new ModelRendererTurbo(this, 529, 41, textureX, textureY); // Box 252
		bodyModel[214] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 254
		bodyModel[215] = new ModelRendererTurbo(this, 1921, 25, textureX, textureY); // Box 255
		bodyModel[216] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 256
		bodyModel[217] = new ModelRendererTurbo(this, 1425, 17, textureX, textureY); // Box 257
		bodyModel[218] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 258
		bodyModel[219] = new ModelRendererTurbo(this, 593, 1, textureX, textureY); // Box 259
		bodyModel[220] = new ModelRendererTurbo(this, 681, 1, textureX, textureY); // Box 260
		bodyModel[221] = new ModelRendererTurbo(this, 1377, 49, textureX, textureY); // Box 261
		bodyModel[222] = new ModelRendererTurbo(this, 1465, 49, textureX, textureY); // Box 262
		bodyModel[223] = new ModelRendererTurbo(this, 1305, 193, textureX, textureY); // Box 315
		bodyModel[224] = new ModelRendererTurbo(this, 465, 193, textureX, textureY); // Box 316
		bodyModel[225] = new ModelRendererTurbo(this, 537, 193, textureX, textureY); // Box 317
		bodyModel[226] = new ModelRendererTurbo(this, 617, 193, textureX, textureY); // Box 318
		bodyModel[227] = new ModelRendererTurbo(this, 673, 193, textureX, textureY); // Box 319
		bodyModel[228] = new ModelRendererTurbo(this, 1729, 41, textureX, textureY); // Box 351
		bodyModel[229] = new ModelRendererTurbo(this, 553, 153, textureX, textureY); // Box 352
		bodyModel[230] = new ModelRendererTurbo(this, 1033, 193, textureX, textureY); // Box 353
		bodyModel[231] = new ModelRendererTurbo(this, 1849, 193, textureX, textureY); // Box 354
		bodyModel[232] = new ModelRendererTurbo(this, 0, 298, textureX, textureY); // Box 355
		bodyModel[233] = new ModelRendererTurbo(this, 0, 275, textureX, textureY); // Box 356

		bodyModel[0].addShapeBox(0F, 0F, 0F, 75, 18, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-31F, -55F, -13F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 19, 5, 6, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 1
		bodyModel[1].setRotationPoint(-31F, -60F, -13F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 45, 5, 6, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 2
		bodyModel[2].setRotationPoint(-12F, -60F, -13F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 11, 3, 4, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 3
		bodyModel[3].setRotationPoint(33F, -58F, -13F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 29, 3, 13, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[4].setRotationPoint(44F, -58F, -13F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 7, 5, 13, 0F,0F, -1F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 5
		bodyModel[5].setRotationPoint(-38F, -60F, -13F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 30, 7, 6, 0F,0F, -4F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 1F, -4F); // Box 6
		bodyModel[6].setRotationPoint(-68F, -59F, -13F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 7, 18, 13, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[7].setRotationPoint(-38F, -55F, -13F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 30, 15, 2, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 8
		bodyModel[8].setRotationPoint(-68F, -52F, -13F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 19, 3, 5, 0F,0F, 0F, -4F, -17F, 0F, -4F, -17F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 10
		bodyModel[9].setRotationPoint(-31F, -63F, -8F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 7, 3, 8, 0F,0F, -1F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 11
		bodyModel[10].setRotationPoint(-38F, -63F, -8F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 30, 3, 5, 0F,0F, -5F, -4F, 0F, 0F, -4F, 0F, -1F, -1F, 0F, -6F, -1F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 4F, -4F); // Box 12
		bodyModel[11].setRotationPoint(-68F, -62F, -8F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 29, 5, 10, 0F,-3F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[12].setRotationPoint(44F, -63F, -10F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 104, 6, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[13].setRotationPoint(-31F, -37F, -13F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 104, 5, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[14].setRotationPoint(-31F, -31F, -11F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 7, 6, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[15].setRotationPoint(-38F, -37F, -13F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 7, 5, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[16].setRotationPoint(-38F, -31F, -11F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 30, 6, 4, 0F,0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 1F, -2F, 0F, -3F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 18
		bodyModel[17].setRotationPoint(-68F, -37F, -13F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 30, 6, 8, 0F,0F, 1F, -1F, 0F, -2F, 0F, 0F, -2F, -6F, 0F, 1F, -6F, 0F, -3F, -7F, 0F, 1F, -6F, 0F, 0F, -2F, 0F, -4F, -1F); // Box 19
		bodyModel[18].setRotationPoint(-68F, -33F, -11F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 63, 18, 13, 0F,0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[19].setRotationPoint(73F, -55F, -13F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 63, 6, 13, 0F,0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -4F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[20].setRotationPoint(73F, -37F, -13F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 63, 5, 11, 0F,0F, 0F, 0F, 0F, 2F, -2F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -2F, -6F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[21].setRotationPoint(73F, -31F, -11F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 63, 3, 13, 0F,0F, 0F, -3F, 0F, -1F, -5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -2F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[22].setRotationPoint(73F, -58F, -13F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 63, 5, 10, 0F,0F, 0F, -7F, 0F, -3F, -6F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[23].setRotationPoint(73F, -63F, -10F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 52, 15, 11, 0F,0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[24].setRotationPoint(136F, -53F, -11F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 52, 4, 11, 0F,0F, 0F, -3F, 0F, -2F, -5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -2F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[25].setRotationPoint(136F, -57F, -11F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 52, 3, 8, 0F,0F, 0F, -4F, 0F, -2F, -6F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -2F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[26].setRotationPoint(136F, -60F, -8F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 52, 5, 11, 0F,0F, 0F, 0F, 0F, 2F, -2F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, -4F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[27].setRotationPoint(136F, -38F, -11F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 52, 5, 9, 0F,0F, 0F, 0F, 0F, 3F, -2F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -4F, -5F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[28].setRotationPoint(136F, -33F, -9F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 38, 11, 9, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[29].setRotationPoint(188F, -51F, -9F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 38, 4, 9, 0F,0F, 0F, -3F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[30].setRotationPoint(188F, -55F, -9F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 38, 3, 6, 0F,0F, 0F, -4F, 0F, -3F, -4F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[31].setRotationPoint(188F, -58F, -6F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 38, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -6F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[32].setRotationPoint(188F, -40F, -9F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 38, 4, 6, 0F,0F, 0F, 1F, 0F, 2F, -3F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -5F, -4F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[33].setRotationPoint(188F, -36F, -6F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 17, 11, 5, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -4F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[34].setRotationPoint(226F, -51F, -5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 17, 3, 5, 0F,0F, 0F, 0F, 0F, 4F, -4F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, -5F, -4F, -2F, -5F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[35].setRotationPoint(226F, -40F, -5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 17, 4, 5, 0F,0F, 0F, -3F, -1F, 0F, -4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[36].setRotationPoint(226F, -55F, -5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 29, 9, 110, 0F,0F, 0F, 0F, 0F, 0F, 0F, 12F, -2F, 0F, 7F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 9F, 0F, 7F, 9F, 0F); // Box 38
		bodyModel[37].setRotationPoint(-2F, -55F, -123F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 11, 9, 110, 0F,0F, -3F, 0F, 0F, 0F, 0F, -7F, -2F, 0F, 9F, -8F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -7F, 9F, 0F, 9F, 3F, 0F); // Box 39
		bodyModel[38].setRotationPoint(-13F, -55F, -123F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 19, 9, 110, 0F,0F, 0F, 0F, 0F, -6F, 0F, 23F, -13F, 0F, -12F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 23F, 5F, 0F, -12F, 9F, 0F); // Box 40
		bodyModel[39].setRotationPoint(27F, -55F, -123F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 29, 3, 92, 0F,-4F, 0F, 0F, -9F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -4F, 0F, 0F, -9F, 0F, 0F, 0F, 12F, 0F, 0F, 12F, 0F); // Box 41
		bodyModel[40].setRotationPoint(-2F, -61F, -215F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 11, 3, 92, 0F,-8F, -1F, 0F, 4F, 0F, 0F, 0F, -6F, 0F, 0F, -9F, 0F, -8F, -1F, 0F, 4F, 0F, 0F, 0F, 12F, 0F, 0F, 9F, 0F); // Box 42
		bodyModel[41].setRotationPoint(-13F, -61F, -215F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 19, 3, 92, 0F,0F, 0F, 0F, -9F, -1F, 0F, 9F, -12F, 0F, -9F, -6F, 0F, 0F, 0F, 0F, -9F, -1F, 0F, 9F, 10F, 0F, -9F, 12F, 0F); // Box 43
		bodyModel[42].setRotationPoint(18F, -61F, -215F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 16, 3, 6, 0F,-5F, -1F, 0F, -5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -1F, 0F, -5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[43].setRotationPoint(2F, -61F, -221F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 7, 3, 6, 0F,-6F, -1F, -2F, 5F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -6F, -1F, -2F, 5F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 45
		bodyModel[44].setRotationPoint(-5F, -61F, -221F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 10, 3, 6, 0F,5F, -1F, 0F, -6F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 5F, -1F, 0F, -6F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[45].setRotationPoint(18F, -61F, -221F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 11, 5, 72, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 17F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 17F, 0F, 0F); // Box 102
		bodyModel[46].setRotationPoint(212F, -56F, -73F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 6, 5, 72, 0F,-2F, -2F, 0F, 0F, 0F, 0F, -17F, 0F, 0F, 21F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, -17F, 0F, 0F, 21F, -2F, 0F); // Box 103
		bodyModel[47].setRotationPoint(206F, -56F, -73F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 12, 5, 72, 0F,0F, 0F, 0F, 0F, -2F, 0F, 3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 3F, -2F, 0F, 0F, 0F, 0F); // Box 104
		bodyModel[48].setRotationPoint(223F, -56F, -73F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 12, 5, 8, 0F,0F, -2F, 0F, -5F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -5F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[49].setRotationPoint(223F, -56F, -81F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 10, 5, 8, 0F,-5F, -2F, -2F, 0F, -2F, 0F, -6F, 0F, 0F, 0F, -2F, 0F, -5F, -2F, -2F, 0F, -2F, 0F, -6F, 0F, 0F, 0F, -2F, 0F); // Box 106
		bodyModel[50].setRotationPoint(208F, -56F, -81F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 10, 5, 8, 0F,-5F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -5F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 107
		bodyModel[51].setRotationPoint(213F, -56F, -81F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 22, 8, 3, 0F,0F, 0F, 0F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[52].setRotationPoint(218F, -59F, -3F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 42, 8, 3, 0F,-5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F); // Box 109
		bodyModel[53].setRotationPoint(176F, -59F, -3F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 40, 43, 3, 0F,-29F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -26F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[54].setRotationPoint(178F, -102F, -3F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 14, 10, 3, 0F,-9F, -3F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, -6F, -3F, 0F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[55].setRotationPoint(204F, -112F, -3F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 22, 43, 3, 0F,0F, 0F, 0F, -9F, 0F, -2F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[56].setRotationPoint(218F, -102F, -3F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 16, 10, 3, 0F,0F, -1F, -2F, -9F, -3F, -2F, -6F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[57].setRotationPoint(218F, -112F, -3F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[58].setRotationPoint(-31F, -63F, -4F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 29, 18, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		bodyModel[59].setRotationPoint(44F, -55F, -13F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 30, 1, 4, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F); // Box 77
		bodyModel[60].setRotationPoint(-68F, -62F, -4F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 30, 1, 5, 0F,0F, 4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 78
		bodyModel[61].setRotationPoint(-68F, -27F, -5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[62].setRotationPoint(-14F, -68F, -8F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -3F, 0F); // Box 80
		bodyModel[63].setRotationPoint(-14F, -68F, -6F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 81
		bodyModel[64].setRotationPoint(0F, -70F, -6F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 2, 10, 1, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[65].setRotationPoint(0F, -70F, -8F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, 3F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, -4F, 0F); // Box 83
		bodyModel[66].setRotationPoint(17F, -68F, -6F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[67].setRotationPoint(17F, -68F, -8F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 85
		bodyModel[68].setRotationPoint(11F, -69F, -6F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[69].setRotationPoint(11F, -69F, -8F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 87
		bodyModel[70].setRotationPoint(-7F, -69F, -6F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[71].setRotationPoint(-7F, -69F, -8F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 89
		bodyModel[72].setRotationPoint(-14F, -68F, -6F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[73].setRotationPoint(-7F, -69F, -6F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 91
		bodyModel[74].setRotationPoint(2F, -69F, -6F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 92
		bodyModel[75].setRotationPoint(12F, -68F, -6F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		bodyModel[76].setRotationPoint(0F, -74F, -1F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 94
		bodyModel[77].setRotationPoint(-7F, -74F, -1F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 95
		bodyModel[78].setRotationPoint(-12F, -73F, -1F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 96
		bodyModel[79].setRotationPoint(-14F, -72F, -1F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 10, 1, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[80].setRotationPoint(2F, -74F, -1F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 98
		bodyModel[81].setRotationPoint(12F, -73F, -1F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 8, 3, 2, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F); // Box 99
		bodyModel[82].setRotationPoint(-76F, -41F, -12F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 8, 4, 2, 0F,0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, -1F, -4F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, -1F, 3F); // Box 100
		bodyModel[83].setRotationPoint(-76F, -38F, -12F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 8, 4, 2, 0F,0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, 1F, 0F, -2F, -6F, 0F, 0F, -6F, 0F, -1F, 4F, 0F, -3F, 4F); // Box 101
		bodyModel[84].setRotationPoint(-76F, -34F, -10F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[85].setRotationPoint(-76F, -47F, -11F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[86].setRotationPoint(-76F, -50F, -11F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 1F, 2F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, -1F, -2F, 0F, 0F, 0F); // Box 104
		bodyModel[87].setRotationPoint(-76F, -50F, -10F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 105
		bodyModel[88].setRotationPoint(-76F, -46F, -12F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -3F, 0F); // Box 106
		bodyModel[89].setRotationPoint(-76F, -50F, -10F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 107
		bodyModel[90].setRotationPoint(-76F, -55F, -6F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 2F, 2F, 0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 3F, 0F, -2F, -3F, 0F, 0F, 0F); // Box 108
		bodyModel[91].setRotationPoint(-76F, -53F, -6F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 109
		bodyModel[92].setRotationPoint(-76F, -55F, -1F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[93].setRotationPoint(-74F, -55F, -1F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[94].setRotationPoint(-81F, -53F, -3F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[95].setRotationPoint(-81F, -53F, -5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 3.5F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -3.5F); // Box 113
		bodyModel[96].setRotationPoint(-81F, -52F, -5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F); // Box 114
		bodyModel[97].setRotationPoint(-81F, -47F, -9F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, 3.5F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -3.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 115
		bodyModel[98].setRotationPoint(-81F, -41F, -5F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 1.5F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[99].setRotationPoint(-81F, -35F, -4F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 117
		bodyModel[100].setRotationPoint(-81F, -35F, -2F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -1.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 1F, 0F, 1.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 1F); // Box 118
		bodyModel[101].setRotationPoint(-81F, -53F, -6F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F); // Box 119
		bodyModel[102].setRotationPoint(-81F, -46F, -11F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F); // Box 120
		bodyModel[103].setRotationPoint(-81F, -42F, -11F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 1.5F, -1F, 0F, 0F, 2.5F, 0F, 0F, -2.5F, 0F, 1.5F, 1F, 0F, -1.5F, -1F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, -1.5F, 1F); // Box 121
		bodyModel[104].setRotationPoint(-81F, -35F, -5F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 122
		bodyModel[105].setRotationPoint(-21F, -71F, -1F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 2F, -2F, 0F, 2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, 2F, 0F, 0F, 0F); // Box 123
		bodyModel[106].setRotationPoint(-25F, -66F, -3F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -3F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, 3F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -1F); // Box 124
		bodyModel[107].setRotationPoint(-29F, -66F, -3F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[108].setRotationPoint(-89F, -44F, -5F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 117
		bodyModel[109].setRotationPoint(-89F, -44F, -5F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F); // Box 118
		bodyModel[110].setRotationPoint(-89F, -42F, -5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[111].setRotationPoint(-89F, -47F, -1F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[112].setRotationPoint(-89F, -39F, -1F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 3F, 3.5F, 0F, 3F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 3.5F, 0F, -3F, -3.5F, 0F, 0F, 0F); // Box 130
		bodyModel[113].setRotationPoint(-89F, -44F, -5F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[114].setRotationPoint(-89F, -39F, -1F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 75, 18, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[115].setRotationPoint(-31F, -55F, 12F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 19, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133
		bodyModel[116].setRotationPoint(-31F, -60F, 7F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 45, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134
		bodyModel[117].setRotationPoint(-12F, -60F, 7F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 11, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[118].setRotationPoint(33F, -58F, 9F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 29, 3, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		bodyModel[119].setRotationPoint(44F, -58F, 0F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 7, 5, 13, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -1F, -5F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 137
		bodyModel[120].setRotationPoint(-38F, -60F, 0F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 30, 7, 6, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -4F, -5F, 0F, 1F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 1F, -1F); // Box 138
		bodyModel[121].setRotationPoint(-68F, -59F, 7F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 7, 18, 13, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		bodyModel[122].setRotationPoint(-38F, -55F, 0F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 30, 15, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 140
		bodyModel[123].setRotationPoint(-68F, -52F, 11F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 19, 3, 5, 0F,0F, -1F, -1F, -17F, -1F, -1F, -17F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[124].setRotationPoint(-31F, -63F, 3F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 7, 3, 8, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, -4F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 142
		bodyModel[125].setRotationPoint(-38F, -63F, 0F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 30, 3, 5, 0F,0F, -6F, -1F, 0F, -1F, -1F, 0F, 0F, -4F, 0F, -5F, -4F, 0F, 4F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 4F, 0F); // Box 143
		bodyModel[126].setRotationPoint(-68F, -62F, 3F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 29, 5, 10, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, -3F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		bodyModel[127].setRotationPoint(44F, -63F, 0F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 104, 6, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 145
		bodyModel[128].setRotationPoint(-31F, -37F, 0F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 104, 5, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F); // Box 146
		bodyModel[129].setRotationPoint(-31F, -31F, 0F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 7, 6, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 147
		bodyModel[130].setRotationPoint(-38F, -37F, 0F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 7, 5, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F); // Box 148
		bodyModel[131].setRotationPoint(-38F, -31F, 0F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 30, 6, 4, 0F,0F, 1F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, -3F); // Box 149
		bodyModel[132].setRotationPoint(-68F, -37F, 9F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 30, 6, 8, 0F,0F, 1F, -6F, 0F, -2F, -6F, 0F, -2F, 0F, 0F, 1F, -1F, 0F, -4F, -1F, 0F, 0F, -2F, 0F, 1F, -6F, 0F, -3F, -7F); // Box 150
		bodyModel[133].setRotationPoint(-68F, -33F, 3F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 63, 18, 13, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, 0F, 0F); // Box 151
		bodyModel[134].setRotationPoint(73F, -55F, 0F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 63, 6, 13, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -4F, 0F, 0F, -2F); // Box 152
		bodyModel[135].setRotationPoint(73F, -37F, 0F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 63, 5, 11, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -6F, 0F, 0F, -6F); // Box 153
		bodyModel[136].setRotationPoint(73F, -31F, 0F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 63, 3, 13, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -2F, 0F, 0F, 0F); // Box 154
		bodyModel[137].setRotationPoint(73F, -58F, 0F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 63, 5, 10, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -6F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -2F, 0F, 0F, 0F); // Box 155
		bodyModel[138].setRotationPoint(73F, -63F, 0F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 52, 15, 11, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, 0F, 0F); // Box 156
		bodyModel[139].setRotationPoint(136F, -53F, 0F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 52, 4, 11, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -2F, 0F, 0F, 0F); // Box 157
		bodyModel[140].setRotationPoint(136F, -57F, 0F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 52, 3, 8, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -6F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -2F, 0F, 0F, 0F); // Box 158
		bodyModel[141].setRotationPoint(136F, -60F, 0F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 52, 5, 11, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -4F, 0F, 0F, -2F); // Box 159
		bodyModel[142].setRotationPoint(136F, -38F, 0F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 52, 5, 9, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, -5F, 0F, 0F, -4F); // Box 160
		bodyModel[143].setRotationPoint(136F, -33F, 0F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 38, 11, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 161
		bodyModel[144].setRotationPoint(188F, -51F, 0F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 38, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 162
		bodyModel[145].setRotationPoint(188F, -55F, 0F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 38, 3, 6, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 163
		bodyModel[146].setRotationPoint(188F, -58F, 0F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 38, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -6F, 0F, 0F, -2F); // Box 164
		bodyModel[147].setRotationPoint(188F, -40F, 0F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 38, 4, 6, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -3F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, -4F, 0F, 0F, -2F); // Box 165
		bodyModel[148].setRotationPoint(188F, -36F, 0F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 17, 11, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, -4F, 0F, 0F, 0F); // Box 166
		bodyModel[149].setRotationPoint(226F, -51F, 0F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 17, 3, 5, 0F,0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -5F, 0F, -2F, -5F, -4F, 0F, 0F, -3F); // Box 167
		bodyModel[150].setRotationPoint(226F, -40F, 0F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 17, 4, 5, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 168
		bodyModel[151].setRotationPoint(226F, -55F, 0F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 29, 9, 110, 0F,7F, -2F, 0F, 12F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 9F, 0F, 12F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		bodyModel[152].setRotationPoint(-2F, -55F, 13F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 11, 9, 110, 0F,9F, -8F, 0F, -7F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 9F, 3F, 0F, -7F, 9F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 170
		bodyModel[153].setRotationPoint(-13F, -55F, 13F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 19, 9, 110, 0F,-12F, -2F, 0F, 23F, -13F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, -12F, 9F, 0F, 23F, 5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 171
		bodyModel[154].setRotationPoint(27F, -55F, 13F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 29, 3, 92, 0F,0F, -6F, 0F, 0F, -6F, 0F, -9F, 0F, 0F, -4F, 0F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, -9F, 0F, 0F, -4F, 0F, 0F); // Box 172
		bodyModel[155].setRotationPoint(-2F, -61F, 123F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 11, 3, 92, 0F,0F, -9F, 0F, 0F, -6F, 0F, 4F, 0F, 0F, -8F, -1F, 0F, 0F, 9F, 0F, 0F, 12F, 0F, 4F, 0F, 0F, -8F, -1F, 0F); // Box 173
		bodyModel[156].setRotationPoint(-13F, -61F, 123F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 19, 3, 92, 0F,-9F, -6F, 0F, 9F, -12F, 0F, -9F, -1F, 0F, 0F, 0F, 0F, -9F, 12F, 0F, 9F, 10F, 0F, -9F, -1F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[157].setRotationPoint(18F, -61F, 123F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 16, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -5F, -1F, 0F, -5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -1F, 0F, -5F, -1F, 0F); // Box 175
		bodyModel[158].setRotationPoint(2F, -61F, 215F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 7, 3, 6, 0F,0F, -1F, 0F, 0F, 0F, 0F, 5F, -1F, 0F, -6F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 5F, -1F, 0F, -6F, -1F, -2F); // Box 176
		bodyModel[159].setRotationPoint(-5F, -61F, 215F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 10, 3, 6, 0F,0F, 0F, 0F, 0F, -1F, 0F, -6F, -1F, -2F, 5F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -6F, -1F, -2F, 5F, -1F, 0F); // Box 177
		bodyModel[160].setRotationPoint(18F, -61F, 215F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 11, 5, 72, 0F,17F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 17F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[161].setRotationPoint(212F, -56F, 1F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 6, 5, 72, 0F,21F, -2F, 0F, -17F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, 21F, -2F, 0F, -17F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F); // Box 195
		bodyModel[162].setRotationPoint(206F, -56F, 1F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 12, 5, 72, 0F,0F, 0F, 0F, 3F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[163].setRotationPoint(223F, -56F, 1F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 12, 5, 8, 0F,0F, 0F, 0F, 0F, -2F, 0F, -5F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -5F, -2F, -2F, 0F, -2F, 0F); // Box 197
		bodyModel[164].setRotationPoint(223F, -56F, 73F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 10, 5, 8, 0F,0F, -2F, 0F, -6F, 0F, 0F, 0F, -2F, 0F, -5F, -2F, -2F, 0F, -2F, 0F, -6F, 0F, 0F, 0F, -2F, 0F, -5F, -2F, -2F); // Box 198
		bodyModel[165].setRotationPoint(208F, -56F, 73F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 10, 5, 8, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -5F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -5F, -2F, 0F); // Box 199
		bodyModel[166].setRotationPoint(213F, -56F, 73F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 22, 8, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0F); // Box 200
		bodyModel[167].setRotationPoint(218F, -59F, 0F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 42, 8, 3, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 201
		bodyModel[168].setRotationPoint(176F, -59F, 0F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 40, 43, 3, 0F,-26F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -29F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 202
		bodyModel[169].setRotationPoint(178F, -102F, 0F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 14, 10, 3, 0F,-6F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, -9F, -3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F); // Box 203
		bodyModel[170].setRotationPoint(204F, -112F, 0F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 22, 43, 3, 0F,0F, 0F, 0F, -6F, 0F, 0F, -9F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, 0F, 0F, 0F); // Box 204
		bodyModel[171].setRotationPoint(218F, -102F, 0F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 16, 10, 3, 0F,0F, 0F, 0F, -6F, -3F, 0F, -9F, -3F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, 0F, 0F, 0F); // Box 205
		bodyModel[172].setRotationPoint(218F, -112F, 0F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		bodyModel[173].setRotationPoint(-31F, -63F, 0F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 29, 18, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		bodyModel[174].setRotationPoint(44F, -55F, 0F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 30, 1, 4, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F); // Box 208
		bodyModel[175].setRotationPoint(-68F, -62F, 0F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 30, 1, 5, 0F,0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -1F); // Box 209
		bodyModel[176].setRotationPoint(-68F, -27F, 0F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		bodyModel[177].setRotationPoint(-14F, -68F, 7F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 3F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
		bodyModel[178].setRotationPoint(-14F, -68F, 1F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 212
		bodyModel[179].setRotationPoint(0F, -70F, 1F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 2, 10, 1, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 213
		bodyModel[180].setRotationPoint(0F, -70F, 7F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 4F, 0F, 0F, 3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 214
		bodyModel[181].setRotationPoint(17F, -68F, 1F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 215
		bodyModel[182].setRotationPoint(17F, -68F, 7F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 216
		bodyModel[183].setRotationPoint(11F, -69F, 1F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		bodyModel[184].setRotationPoint(11F, -69F, 7F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 218
		bodyModel[185].setRotationPoint(-7F, -69F, 1F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		bodyModel[186].setRotationPoint(-7F, -69F, 7F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 220
		bodyModel[187].setRotationPoint(-14F, -68F, 5F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 221
		bodyModel[188].setRotationPoint(-7F, -69F, 5F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 222
		bodyModel[189].setRotationPoint(2F, -69F, 5F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 223
		bodyModel[190].setRotationPoint(12F, -68F, 5F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 8, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 230
		bodyModel[191].setRotationPoint(-76F, -41F, 10F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 8, 4, 2, 0F,0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, -1F, 3F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, -1F, -4F); // Box 231
		bodyModel[192].setRotationPoint(-76F, -38F, 10F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 8, 4, 2, 0F,0F, 1F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, -3F, 4F, 0F, -1F, 4F, 0F, 0F, -6F, 0F, -2F, -6F); // Box 232
		bodyModel[193].setRotationPoint(-76F, -34F, 8F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 233
		bodyModel[194].setRotationPoint(-76F, -47F, 10F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
		bodyModel[195].setRotationPoint(-76F, -50F, 10F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, 2F, 0F, 0F, 0F); // Box 235
		bodyModel[196].setRotationPoint(-76F, -50F, 9F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 236
		bodyModel[197].setRotationPoint(-76F, -46F, 11F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 3F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 237
		bodyModel[198].setRotationPoint(-76F, -50F, 6F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F); // Box 238
		bodyModel[199].setRotationPoint(-76F, -55F, 1F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 2F, -2F, 0F, 2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, -2F, 3F, 0F, 0F, 0F); // Box 239
		bodyModel[200].setRotationPoint(-76F, -53F, 5F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 240
		bodyModel[201].setRotationPoint(-76F, -55F, 0F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 241
		bodyModel[202].setRotationPoint(-74F, -55F, 0F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 242
		bodyModel[203].setRotationPoint(-81F, -53F, 0F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1.5F, 0F); // Box 243
		bodyModel[204].setRotationPoint(-81F, -53F, 3F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, -3.5F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 3.5F); // Box 244
		bodyModel[205].setRotationPoint(-81F, -52F, 4F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 245
		bodyModel[206].setRotationPoint(-81F, -47F, 8F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, -3.5F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 3.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 246
		bodyModel[207].setRotationPoint(-81F, -41F, 4F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F); // Box 247
		bodyModel[208].setRotationPoint(-81F, -35F, 2F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[209].setRotationPoint(-81F, -35F, 0F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -1.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1F, 0F, 1.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, -1F); // Box 249
		bodyModel[210].setRotationPoint(-81F, -53F, 5F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F); // Box 250
		bodyModel[211].setRotationPoint(-81F, -46F, 10F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F); // Box 251
		bodyModel[212].setRotationPoint(-81F, -42F, 10F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 1.5F, 1F, 0F, 0F, -2.5F, 0F, 0F, 2.5F, 0F, 1.5F, -1F, 0F, -1.5F, 1F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, -1.5F, -1F); // Box 252
		bodyModel[213].setRotationPoint(-81F, -35F, 4F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 2F, 2F, 0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -2F, -2F, 0F, 0F, 0F); // Box 254
		bodyModel[214].setRotationPoint(-25F, -66F, 2F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 1F, 0F, 3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 1F); // Box 255
		bodyModel[215].setRotationPoint(-29F, -66F, 2F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 256
		bodyModel[216].setRotationPoint(-89F, -44F, 4F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 257
		bodyModel[217].setRotationPoint(-89F, -44F, 1F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 258
		bodyModel[218].setRotationPoint(-89F, -42F, 1F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 259
		bodyModel[219].setRotationPoint(-89F, -47F, 0F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
		bodyModel[220].setRotationPoint(-89F, -39F, 0F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 3F, -3.5F, 0F, 3F, 3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3.5F, 0F, -3F, 3.5F, 0F, 0F, 0F); // Box 261
		bodyModel[221].setRotationPoint(-89F, -44F, 4F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 262
		bodyModel[222].setRotationPoint(-89F, -39F, 0F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 104, 8, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[223].setRotationPoint(-31F, -45F, -12F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 10, 5, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 316
		bodyModel[224].setRotationPoint(-31F, -50F, -12F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 15, 5, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 317
		bodyModel[225].setRotationPoint(-31F, -55F, -12F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 15, 5, 24, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 318
		bodyModel[226].setRotationPoint(-31F, -60F, -12F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 15, 2, 14, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 319
		bodyModel[227].setRotationPoint(-31F, -62F, -7F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 351
		bodyModel[228].setRotationPoint(17F, -72F, -1F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 14, 2, 14, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 352
		bodyModel[229].setRotationPoint(3F, -62F, -7F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 14, 5, 24, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 353
		bodyModel[230].setRotationPoint(3F, -60F, -12F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 14, 10, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 354
		bodyModel[231].setRotationPoint(3F, -55F, -12F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 355
		bodyModel[232].setRotationPoint(-76F, -31F, -4F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 356
		bodyModel[233].setRotationPoint(-76F, -31F, 0F);
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 1617, 33, textureX, textureY); // Box 316
		leftWingModel[1] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 317
		leftWingModel[2] = new ModelRendererTurbo(this, 393, 41, textureX, textureY); // Box 318
		leftWingModel[3] = new ModelRendererTurbo(this, 625, 41, textureX, textureY); // Box 319
		leftWingModel[4] = new ModelRendererTurbo(this, 777, 41, textureX, textureY); // Box 320
		leftWingModel[5] = new ModelRendererTurbo(this, 889, 41, textureX, textureY); // Box 321
		leftWingModel[6] = new ModelRendererTurbo(this, 1001, 41, textureX, textureY); // Box 322
		leftWingModel[7] = new ModelRendererTurbo(this, 1113, 41, textureX, textureY); // Box 323
		leftWingModel[8] = new ModelRendererTurbo(this, 1225, 41, textureX, textureY); // Box 324
		leftWingModel[9] = new ModelRendererTurbo(this, 1465, 33, textureX, textureY); // Box 325
		leftWingModel[10] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 326
		leftWingModel[11] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 327
		leftWingModel[12] = new ModelRendererTurbo(this, 1689, 33, textureX, textureY); // Box 328
		leftWingModel[13] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 329
		leftWingModel[14] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Box 330
		leftWingModel[15] = new ModelRendererTurbo(this, 1921, 49, textureX, textureY); // Box 121
		leftWingModel[16] = new ModelRendererTurbo(this, 1185, 129, textureX, textureY); // Box 178
		leftWingModel[17] = new ModelRendererTurbo(this, 801, 137, textureX, textureY); // Box 179
		leftWingModel[18] = new ModelRendererTurbo(this, 1257, 145, textureX, textureY); // Box 180
		leftWingModel[19] = new ModelRendererTurbo(this, 1353, 145, textureX, textureY); // Box 181
		leftWingModel[20] = new ModelRendererTurbo(this, 1617, 145, textureX, textureY); // Box 182
		leftWingModel[21] = new ModelRendererTurbo(this, 1849, 145, textureX, textureY); // Box 183
		leftWingModel[22] = new ModelRendererTurbo(this, 473, 153, textureX, textureY); // Box 184
		leftWingModel[23] = new ModelRendererTurbo(this, 585, 153, textureX, textureY); // Box 185
		leftWingModel[24] = new ModelRendererTurbo(this, 289, 161, textureX, textureY); // Box 186
		leftWingModel[25] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 187
		leftWingModel[26] = new ModelRendererTurbo(this, 153, 137, textureX, textureY); // Box 188
		leftWingModel[27] = new ModelRendererTurbo(this, 1073, 145, textureX, textureY); // Box 189
		leftWingModel[28] = new ModelRendererTurbo(this, 873, 137, textureX, textureY); // Box 190
		leftWingModel[29] = new ModelRendererTurbo(this, 681, 145, textureX, textureY); // Box 191
		leftWingModel[30] = new ModelRendererTurbo(this, 1329, 145, textureX, textureY); // Box 192
		leftWingModel[31] = new ModelRendererTurbo(this, 873, 161, textureX, textureY); // Box 193

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 17, 10, 30, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 316
		leftWingModel[0].setRotationPoint(-51F, -45.5F, -70F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 17, 9, 30, 0F,0F, 0F, -10F, 0F, 1F, -9F, 0F, 1F, -9F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 317
		leftWingModel[1].setRotationPoint(-51F, -54.5F, -70F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 17, 9, 30, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 1F, -9F, 0F, 1F, -9F, 0F, 0F, -10F); // Box 318
		leftWingModel[2].setRotationPoint(-51F, -35.5F, -70F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 41, 10, 32, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 319
		leftWingModel[3].setRotationPoint(-34F, -45.5F, -71F);

		leftWingModel[4].addShapeBox(0F, 0F, 0F, 20, 10, 32, 0F,0F, 0F, -10F, 0F, -0.5F, -12F, 0F, -0.5F, -12F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 320
		leftWingModel[4].setRotationPoint(-34F, -55.5F, -71F);

		leftWingModel[5].addShapeBox(0F, 0F, 0F, 21, 10, 32, 0F,0F, -0.5F, -12F, 0F, -3F, -14F, 0F, -3F, -14F, 0F, -0.5F, -12F, 0F, 0F, -1.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -1.5F); // Box 321
		leftWingModel[5].setRotationPoint(-14F, -55.5F, -71F);

		leftWingModel[6].addShapeBox(0F, 0F, 0F, 26, 10, 26, 0F,0F, 0F, 0F, 8F, 0F, -7F, 8F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F); // Box 322
		leftWingModel[6].setRotationPoint(7F, -45.5F, -68F);

		leftWingModel[7].addShapeBox(0F, 0F, 0F, 26, 10, 26, 0F,0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, -2F, -8F, -12F, -5F, -7F, -12F, -5F, -7F, 0F, -2F, -8F); // Box 323
		leftWingModel[7].setRotationPoint(7F, -35.5F, -68F);

		leftWingModel[8].addShapeBox(0F, 0F, 0F, 41, 10, 32, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, -2F, -11F, 0F, -2F, -11F, 0F, 0F, -10F); // Box 324
		leftWingModel[8].setRotationPoint(-34F, -35.5F, -71F);

		leftWingModel[9].addShapeBox(0F, 0F, 0F, 7, 9, 30, 0F,0F, -4.5F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, -4.5F, -10F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 325
		leftWingModel[9].setRotationPoint(-58F, -54.5F, -70F);

		leftWingModel[10].addShapeBox(0F, 0F, 0F, 7, 9, 30, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -4.5F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, -4.5F, -10F); // Box 326
		leftWingModel[10].setRotationPoint(-58F, -35.5F, -70F);

		leftWingModel[11].addShapeBox(0F, 0F, 0F, 7, 10, 30, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 327
		leftWingModel[11].setRotationPoint(-58F, -45.5F, -70F);

		leftWingModel[12].addShapeBox(0F, 0F, 0F, 12, 4, 12, 0F,0F, -1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -5F, 0F, -1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -5F); // Box 328
		leftWingModel[12].setRotationPoint(-70F, -42.5F, -61F);

		leftWingModel[13].addShapeBox(0F, 0F, 0F, 12, 4, 12, 0F,-3F, -2.5F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, -3F, -2.5F, -5F, 0F, 1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -5F); // Box 329
		leftWingModel[13].setRotationPoint(-70F, -46.5F, -61F);

		leftWingModel[14].addShapeBox(0F, 0F, 0F, 12, 4, 12, 0F,0F, 1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -5F, -3F, -2.5F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, -3F, -2.5F, -5F); // Box 330
		leftWingModel[14].setRotationPoint(-70F, -38.5F, -61F);

		leftWingModel[15].addShapeBox(0F, 0F, 0F, 34, 8, 26, 0F,0F, -1F, -11F, -12F, -5F, -12F, -12F, -5F, -12F, 0F, -1F, -11F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F); // Box 121
		leftWingModel[15].setRotationPoint(7F, -53.5F, -68F);

		leftWingModel[16].addShapeBox(0F, 0F, 0F, 17, 10, 30, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 178
		leftWingModel[16].setRotationPoint(-51F, -45.5F, 40F);

		leftWingModel[17].addShapeBox(0F, 0F, 0F, 17, 9, 30, 0F,0F, 0F, -10F, 0F, 1F, -9F, 0F, 1F, -9F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 179
		leftWingModel[17].setRotationPoint(-51F, -54.5F, 40F);

		leftWingModel[18].addShapeBox(0F, 0F, 0F, 17, 9, 30, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 1F, -9F, 0F, 1F, -9F, 0F, 0F, -10F); // Box 180
		leftWingModel[18].setRotationPoint(-51F, -35.5F, 40F);

		leftWingModel[19].addShapeBox(0F, 0F, 0F, 41, 10, 32, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 181
		leftWingModel[19].setRotationPoint(-34F, -45.5F, 39F);

		leftWingModel[20].addShapeBox(0F, 0F, 0F, 20, 10, 32, 0F,0F, 0F, -10F, 0F, -0.5F, -12F, 0F, -0.5F, -12F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 182
		leftWingModel[20].setRotationPoint(-34F, -55.5F, 39F);

		leftWingModel[21].addShapeBox(0F, 0F, 0F, 21, 10, 32, 0F,0F, -0.5F, -12F, 0F, -3F, -14F, 0F, -3F, -14F, 0F, -0.5F, -12F, 0F, 0F, -1.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -1.5F); // Box 183
		leftWingModel[21].setRotationPoint(-14F, -55.5F, 39F);

		leftWingModel[22].addShapeBox(0F, 0F, 0F, 26, 10, 26, 0F,0F, 0F, 0F, 8F, 0F, -7F, 8F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F); // Box 184
		leftWingModel[22].setRotationPoint(7F, -45.5F, 42F);

		leftWingModel[23].addShapeBox(0F, 0F, 0F, 26, 10, 26, 0F,0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, -2F, -8F, -12F, -5F, -7F, -12F, -5F, -7F, 0F, -2F, -8F); // Box 185
		leftWingModel[23].setRotationPoint(7F, -35.5F, 42F);

		leftWingModel[24].addShapeBox(0F, 0F, 0F, 41, 10, 32, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, -2F, -11F, 0F, -2F, -11F, 0F, 0F, -10F); // Box 186
		leftWingModel[24].setRotationPoint(-34F, -35.5F, 39F);

		leftWingModel[25].addShapeBox(0F, 0F, 0F, 7, 9, 30, 0F,0F, -4.5F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, -4.5F, -10F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 187
		leftWingModel[25].setRotationPoint(-58F, -54.5F, 40F);

		leftWingModel[26].addShapeBox(0F, 0F, 0F, 7, 9, 30, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -4.5F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, -4.5F, -10F); // Box 188
		leftWingModel[26].setRotationPoint(-58F, -35.5F, 40F);

		leftWingModel[27].addShapeBox(0F, 0F, 0F, 7, 10, 30, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 189
		leftWingModel[27].setRotationPoint(-58F, -45.5F, 40F);

		leftWingModel[28].addShapeBox(0F, 0F, 0F, 12, 4, 12, 0F,0F, -1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -5F, 0F, -1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -5F); // Box 190
		leftWingModel[28].setRotationPoint(-70F, -42.5F, 49F);

		leftWingModel[29].addShapeBox(0F, 0F, 0F, 12, 4, 12, 0F,-3F, -2.5F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, -3F, -2.5F, -5F, 0F, 1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -5F); // Box 191
		leftWingModel[29].setRotationPoint(-70F, -46.5F, 49F);

		leftWingModel[30].addShapeBox(0F, 0F, 0F, 12, 4, 12, 0F,0F, 1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -5F, -3F, -2.5F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, -3F, -2.5F, -5F); // Box 192
		leftWingModel[30].setRotationPoint(-70F, -38.5F, 49F);

		leftWingModel[31].addShapeBox(0F, 0F, 0F, 34, 8, 26, 0F,0F, -1F, -11F, -12F, -5F, -12F, -12F, -5F, -12F, 0F, -1F, -11F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F); // Box 193
		leftWingModel[31].setRotationPoint(7F, -53.5F, 42F);
	}

	private void inittailWheelModel_1()
	{
		tailWheelModel[0] = new ModelRendererTurbo(this, 1801, 121, textureX, textureY); // Box 433
		tailWheelModel[1] = new ModelRendererTurbo(this, 2017, 49, textureX, textureY); // Box 434
		tailWheelModel[2] = new ModelRendererTurbo(this, 1921, 49, textureX, textureY); // Box 435
		tailWheelModel[3] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 436
		tailWheelModel[4] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Box 437
		tailWheelModel[5] = new ModelRendererTurbo(this, 273, 89, textureX, textureY); // Box 438
		tailWheelModel[6] = new ModelRendererTurbo(this, 1857, 105, textureX, textureY); // Box 439
		tailWheelModel[7] = new ModelRendererTurbo(this, 1849, 121, textureX, textureY); // Box 440

		tailWheelModel[0].addShapeBox(0F, 0F, 0F, 16, 7, 4, 0F,0F, -4F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -4F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F); // Box 433
		tailWheelModel[0].setRotationPoint(201F, -38F, -2F);

		tailWheelModel[1].addShapeBox(0F, 0F, 0F, 10, 2, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F); // Box 434
		tailWheelModel[1].setRotationPoint(209F, -31F, -2F);

		tailWheelModel[2].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 435
		tailWheelModel[2].setRotationPoint(215F, -29F, -3F);

		tailWheelModel[3].addShapeBox(0F, 0F, 0F, 9, 5, 1, 0F,-4F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -4F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 436
		tailWheelModel[3].setRotationPoint(215F, -29F, -3F);

		tailWheelModel[4].addShapeBox(0F, 0F, 0F, 9, 5, 1, 0F,-4F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -4F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 437
		tailWheelModel[4].setRotationPoint(215F, -29F, 2F);

		tailWheelModel[5].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 438
		tailWheelModel[5].setRotationPoint(218F, -27F, -2F);

		tailWheelModel[6].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 439
		tailWheelModel[6].setRotationPoint(218F, -31F, -2F);

		tailWheelModel[7].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 440
		tailWheelModel[7].setRotationPoint(218F, -23F, -2F);
	}

	private void initleftWingWheelModel_1()
	{
		leftWingWheelModel[0] = new ModelRendererTurbo(this, 1745, 145, textureX, textureY); // Box 206
		leftWingWheelModel[1] = new ModelRendererTurbo(this, 1745, 169, textureX, textureY); // Box 207
		leftWingWheelModel[2] = new ModelRendererTurbo(this, 153, 177, textureX, textureY); // Box 208
		leftWingWheelModel[3] = new ModelRendererTurbo(this, 1761, 73, textureX, textureY); // Box 209
		leftWingWheelModel[4] = new ModelRendererTurbo(this, 1081, 57, textureX, textureY); // Box 210
		leftWingWheelModel[5] = new ModelRendererTurbo(this, 505, 121, textureX, textureY); // Box 211
		leftWingWheelModel[6] = new ModelRendererTurbo(this, 1193, 57, textureX, textureY); // Box 212
		leftWingWheelModel[7] = new ModelRendererTurbo(this, 393, 81, textureX, textureY); // Box 213
		leftWingWheelModel[8] = new ModelRendererTurbo(this, 1689, 57, textureX, textureY); // Box 214
		leftWingWheelModel[9] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Box 215

		leftWingWheelModel[0].addShapeBox(0F, 0F, 0F, 24, 8, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		leftWingWheelModel[0].setRotationPoint(-45F, -6F, -61F);

		leftWingWheelModel[1].addShapeBox(0F, 0F, 0F, 24, 8, 11, 0F,-8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		leftWingWheelModel[1].setRotationPoint(-45F, -14F, -61F);

		leftWingWheelModel[2].addShapeBox(0F, 0F, 0F, 24, 8, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F); // Box 208
		leftWingWheelModel[2].setRotationPoint(-45F, 2F, -61F);

		leftWingWheelModel[3].addShapeBox(0F, 0F, 0F, 2, 32, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 209
		leftWingWheelModel[3].setRotationPoint(-34F, -30F, -63F);

		leftWingWheelModel[4].addShapeBox(0F, 0F, 0F, 17, 2, 2, 0F,0F, 0F, 0F, 0F, 16F, 0F, 0F, 16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, 0F); // Box 210
		leftWingWheelModel[4].setRotationPoint(-32F, 0F, -63F);

		leftWingWheelModel[5].addShapeBox(0F, 0F, 0F, 2, 2, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
		leftWingWheelModel[5].setRotationPoint(-15F, -16F, -63F);

		leftWingWheelModel[6].addShapeBox(0F, 0F, 0F, 18, 2, 2, 0F,0F, 0F, 0F, 0F, 16F, 0F, 0F, 16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, 0F); // Box 212
		leftWingWheelModel[6].setRotationPoint(-15F, -16F, -57F);

		leftWingWheelModel[7].addShapeBox(0F, 0F, 0F, 2, 32, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 213
		leftWingWheelModel[7].setRotationPoint(-34F, -30F, -50F);

		leftWingWheelModel[8].addShapeBox(0F, 0F, 0F, 17, 2, 2, 0F,0F, 0F, 0F, 0F, 16F, 0F, 0F, 16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, 0F); // Box 214
		leftWingWheelModel[8].setRotationPoint(-32F, 0F, -50F);

		leftWingWheelModel[9].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 215
		leftWingWheelModel[9].setRotationPoint(-34F, -18F, -61F);
	}

	private void initrightWingWheelModel_1()
	{
		rightWingWheelModel[0] = new ModelRendererTurbo(this, 801, 177, textureX, textureY); // Box 272
		rightWingWheelModel[1] = new ModelRendererTurbo(this, 1185, 177, textureX, textureY); // Box 273
		rightWingWheelModel[2] = new ModelRendererTurbo(this, 1257, 185, textureX, textureY); // Box 274
		rightWingWheelModel[3] = new ModelRendererTurbo(this, 529, 81, textureX, textureY); // Box 275
		rightWingWheelModel[4] = new ModelRendererTurbo(this, 209, 65, textureX, textureY); // Box 276
		rightWingWheelModel[5] = new ModelRendererTurbo(this, 953, 129, textureX, textureY); // Box 277
		rightWingWheelModel[6] = new ModelRendererTurbo(this, 1345, 65, textureX, textureY); // Box 278
		rightWingWheelModel[7] = new ModelRendererTurbo(this, 977, 105, textureX, textureY); // Box 279
		rightWingWheelModel[8] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Box 280
		rightWingWheelModel[9] = new ModelRendererTurbo(this, 1617, 49, textureX, textureY); // Box 281

		rightWingWheelModel[0].addShapeBox(0F, 0F, 0F, 24, 8, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		rightWingWheelModel[0].setRotationPoint(-45F, -6F, 50F);

		rightWingWheelModel[1].addShapeBox(0F, 0F, 0F, 24, 8, 11, 0F,-8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 273
		rightWingWheelModel[1].setRotationPoint(-45F, -14F, 50F);

		rightWingWheelModel[2].addShapeBox(0F, 0F, 0F, 24, 8, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F); // Box 274
		rightWingWheelModel[2].setRotationPoint(-45F, 2F, 50F);

		rightWingWheelModel[3].addShapeBox(0F, 0F, 0F, 2, 32, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 275
		rightWingWheelModel[3].setRotationPoint(-34F, -30F, 61F);

		rightWingWheelModel[4].addShapeBox(0F, 0F, 0F, 17, 2, 2, 0F,0F, 0F, 0F, 0F, 16F, 0F, 0F, 16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, 0F); // Box 276
		rightWingWheelModel[4].setRotationPoint(-32F, 0F, 61F);

		rightWingWheelModel[5].addShapeBox(0F, 0F, 0F, 2, 2, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
		rightWingWheelModel[5].setRotationPoint(-15F, -16F, 48F);

		rightWingWheelModel[6].addShapeBox(0F, 0F, 0F, 18, 2, 2, 0F,0F, 0F, 0F, 0F, 16F, 0F, 0F, 16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, 0F); // Box 278
		rightWingWheelModel[6].setRotationPoint(-15F, -16F, 55F);

		rightWingWheelModel[7].addShapeBox(0F, 0F, 0F, 2, 32, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 279
		rightWingWheelModel[7].setRotationPoint(-34F, -30F, 48F);

		rightWingWheelModel[8].addShapeBox(0F, 0F, 0F, 17, 2, 2, 0F,0F, 0F, 0F, 0F, 16F, 0F, 0F, 16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, 0F); // Box 280
		rightWingWheelModel[8].setRotationPoint(-32F, 0F, 48F);

		rightWingWheelModel[9].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		rightWingWheelModel[9].setRotationPoint(-34F, -18F, 50F);
	}

	private void inithelicopterModeParts_1()
	{
		helicopterModeParts[0] = new ModelRendererTurbo(this, 1225, 65, textureX, textureY); // Box 484
		helicopterModeParts[1] = new ModelRendererTurbo(this, 1345, 41, textureX, textureY); // Box 485
		helicopterModeParts[2] = new ModelRendererTurbo(this, 1761, 41, textureX, textureY); // Box 487
		helicopterModeParts[3] = new ModelRendererTurbo(this, 1705, 65, textureX, textureY); // Box 488
		helicopterModeParts[4] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 489
		helicopterModeParts[5] = new ModelRendererTurbo(this, 2017, 65, textureX, textureY); // Box 490
		helicopterModeParts[6] = new ModelRendererTurbo(this, 1121, 49, textureX, textureY); // Box 491
		helicopterModeParts[7] = new ModelRendererTurbo(this, 1617, 49, textureX, textureY); // Box 492
		helicopterModeParts[8] = new ModelRendererTurbo(this, 49, 137, textureX, textureY); // Box 493
		helicopterModeParts[9] = new ModelRendererTurbo(this, 1537, 65, textureX, textureY); // Box 494
		helicopterModeParts[10] = new ModelRendererTurbo(this, 1113, 57, textureX, textureY); // Box 495
		helicopterModeParts[11] = new ModelRendererTurbo(this, 537, 49, textureX, textureY); // Box 496
		helicopterModeParts[12] = new ModelRendererTurbo(this, 913, 49, textureX, textureY); // Box 497
		helicopterModeParts[13] = new ModelRendererTurbo(this, 1489, 49, textureX, textureY); // Box 498
		helicopterModeParts[14] = new ModelRendererTurbo(this, 257, 57, textureX, textureY); // Box 499
		helicopterModeParts[15] = new ModelRendererTurbo(this, 81, 73, textureX, textureY); // Box 578
		helicopterModeParts[16] = new ModelRendererTurbo(this, 1385, 73, textureX, textureY); // Box 579
		helicopterModeParts[17] = new ModelRendererTurbo(this, 153, 137, textureX, textureY); // Box 580
		helicopterModeParts[18] = new ModelRendererTurbo(this, 913, 137, textureX, textureY); // Box 582
		helicopterModeParts[19] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 583
		helicopterModeParts[20] = new ModelRendererTurbo(this, 137, 65, textureX, textureY); // Box 584
		helicopterModeParts[21] = new ModelRendererTurbo(this, 953, 105, textureX, textureY); // Box 585
		helicopterModeParts[22] = new ModelRendererTurbo(this, 393, 65, textureX, textureY); // Box 586
		helicopterModeParts[23] = new ModelRendererTurbo(this, 633, 65, textureX, textureY); // Box 587
		helicopterModeParts[24] = new ModelRendererTurbo(this, 801, 137, textureX, textureY); // Box 588
		helicopterModeParts[25] = new ModelRendererTurbo(this, 1393, 57, textureX, textureY); // Box 589
		helicopterModeParts[26] = new ModelRendererTurbo(this, 1393, 81, textureX, textureY); // Box 590
		helicopterModeParts[27] = new ModelRendererTurbo(this, 601, 41, textureX, textureY); // Box 591
		helicopterModeParts[28] = new ModelRendererTurbo(this, 1017, 41, textureX, textureY); // Box 592
		helicopterModeParts[29] = new ModelRendererTurbo(this, 1345, 49, textureX, textureY); // Box 593
		helicopterModeParts[30] = new ModelRendererTurbo(this, 209, 121, textureX, textureY); // Box 594

		helicopterModeParts[0].addShapeBox(0F, 0F, 0F, 12, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 484
		helicopterModeParts[0].setRotationPoint(20F, -61F, -8F);

		helicopterModeParts[1].addShapeBox(0F, 0F, 0F, 3, 5, 2, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 1F); // Box 485
		helicopterModeParts[1].setRotationPoint(17F, -61F, -8F);

		helicopterModeParts[2].addShapeBox(0F, 0F, 0F, 3, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, 1F, 0F, 0F, 0F); // Box 487
		helicopterModeParts[2].setRotationPoint(32F, -61F, -8F);

		helicopterModeParts[3].addShapeBox(0F, 0F, 0F, 2, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 488
		helicopterModeParts[3].setRotationPoint(33F, -61F, -5F);

		helicopterModeParts[4].addShapeBox(0F, 0F, 0F, 2, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 489
		helicopterModeParts[4].setRotationPoint(17F, -61F, -5F);

		helicopterModeParts[5].addShapeBox(0F, 0F, 0F, 12, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 490
		helicopterModeParts[5].setRotationPoint(20F, -61F, 6F);

		helicopterModeParts[6].addShapeBox(0F, 0F, 0F, 3, 5, 2, 0F,-2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 491
		helicopterModeParts[6].setRotationPoint(17F, -61F, 6F);

		helicopterModeParts[7].addShapeBox(0F, 0F, 0F, 3, 5, 2, 0F,0F, 0F, 0F, -2F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 492
		helicopterModeParts[7].setRotationPoint(32F, -61F, 6F);

		helicopterModeParts[8].addShapeBox(0F, 0F, 0F, 11, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 493
		helicopterModeParts[8].setRotationPoint(35F, -60F, -4F);

		helicopterModeParts[9].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 494
		helicopterModeParts[9].setRotationPoint(37F, -62F, -4F);

		helicopterModeParts[10].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 495
		helicopterModeParts[10].setRotationPoint(37F, -63F, -4F);

		helicopterModeParts[11].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 496
		helicopterModeParts[11].setRotationPoint(20F, -56F, -8F);

		helicopterModeParts[12].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 497
		helicopterModeParts[12].setRotationPoint(20F, -56F, 7F);

		helicopterModeParts[13].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 498
		helicopterModeParts[13].setRotationPoint(31F, -56F, 7F);

		helicopterModeParts[14].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 499
		helicopterModeParts[14].setRotationPoint(31F, -56F, -8F);

		helicopterModeParts[15].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 578
		helicopterModeParts[15].setRotationPoint(21F, -61F, 3F);

		helicopterModeParts[16].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 579
		helicopterModeParts[16].setRotationPoint(21F, -61F, -4F);

		helicopterModeParts[17].addShapeBox(0F, 0F, 0F, 1, 15, 10, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 580
		helicopterModeParts[17].setRotationPoint(22F, -64F, -5F);

		helicopterModeParts[18].addShapeBox(0F, 1F, 0F, 10, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 582
		helicopterModeParts[18].setRotationPoint(22F, -50F, -5F);
		helicopterModeParts[18].rotateAngleZ = 0.08726646F;

		helicopterModeParts[19].addShapeBox(-2F, 0.25F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 583
		helicopterModeParts[19].setRotationPoint(24F, -50F, -5F);
		helicopterModeParts[19].rotateAngleZ = 0.08726646F;

		helicopterModeParts[20].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 584
		helicopterModeParts[20].setRotationPoint(22F, -56F, -6F);
		helicopterModeParts[20].rotateAngleZ = -0.78539816F;

		helicopterModeParts[21].addShapeBox(0F, -0.3F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 585
		helicopterModeParts[21].setRotationPoint(31F, -50F, -5F);
		helicopterModeParts[21].rotateAngleZ = 0.12217305F;

		helicopterModeParts[22].addShapeBox(-2F, 0.25F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 586
		helicopterModeParts[22].setRotationPoint(24F, -50F, 4F);
		helicopterModeParts[22].rotateAngleZ = 0.08726646F;

		helicopterModeParts[23].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 587
		helicopterModeParts[23].setRotationPoint(22F, -56F, 5F);
		helicopterModeParts[23].rotateAngleZ = -0.78539816F;

		helicopterModeParts[24].addShapeBox(0F, 0F, 0F, 1, 15, 8, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 588
		helicopterModeParts[24].setRotationPoint(23F, -63F, -4F);

		helicopterModeParts[25].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 589
		helicopterModeParts[25].setRotationPoint(23.3F, -63.3F, 1F);

		helicopterModeParts[26].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 590
		helicopterModeParts[26].setRotationPoint(23.3F, -63.3F, -2F);

		helicopterModeParts[27].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 591
		helicopterModeParts[27].setRotationPoint(20.5F, -65.5F, -1.5F);

		helicopterModeParts[28].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 592
		helicopterModeParts[28].setRotationPoint(20.5F, -66.5F, -1.5F);

		helicopterModeParts[29].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 593
		helicopterModeParts[29].setRotationPoint(20.5F, -67.5F, -1.5F);

		helicopterModeParts[30].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 594
		helicopterModeParts[30].setRotationPoint(20F, -68F, -3F);
	}

	private void initplaneModeParts_1()
	{
		planeModeParts[0] = new ModelRendererTurbo(this, 361, 129, textureX, textureY); // Box 239
		planeModeParts[1] = new ModelRendererTurbo(this, 281, 57, textureX, textureY); // Box 240
		planeModeParts[2] = new ModelRendererTurbo(this, 633, 57, textureX, textureY); // Box 241
		planeModeParts[3] = new ModelRendererTurbo(this, 785, 57, textureX, textureY); // Box 242
		planeModeParts[4] = new ModelRendererTurbo(this, 897, 57, textureX, textureY); // Box 243
		planeModeParts[5] = new ModelRendererTurbo(this, 1185, 129, textureX, textureY); // Box 244
		planeModeParts[6] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Box 245
		planeModeParts[7] = new ModelRendererTurbo(this, 1617, 129, textureX, textureY); // Box 246
		planeModeParts[8] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // Box 247
		planeModeParts[9] = new ModelRendererTurbo(this, 1249, 41, textureX, textureY); // Box 248
		planeModeParts[10] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 250
		planeModeParts[11] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // Box 251
		planeModeParts[12] = new ModelRendererTurbo(this, 1465, 57, textureX, textureY); // Box 252
		planeModeParts[13] = new ModelRendererTurbo(this, 2017, 57, textureX, textureY); // Box 253
		planeModeParts[14] = new ModelRendererTurbo(this, 1009, 49, textureX, textureY); // Box 263
		planeModeParts[15] = new ModelRendererTurbo(this, 921, 1, textureX, textureY); // Box 264
		planeModeParts[16] = new ModelRendererTurbo(this, 1297, 33, textureX, textureY); // Box 962
		planeModeParts[17] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 964
		planeModeParts[18] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 966
		planeModeParts[19] = new ModelRendererTurbo(this, 1393, 1, textureX, textureY); // Box 782
		planeModeParts[20] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 783
		planeModeParts[21] = new ModelRendererTurbo(this, 281, 41, textureX, textureY); // Box 786
		planeModeParts[22] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Box 789
		planeModeParts[23] = new ModelRendererTurbo(this, 905, 1, textureX, textureY); // Box 791
		planeModeParts[24] = new ModelRendererTurbo(this, 1137, 1, textureX, textureY); // Box 792
		planeModeParts[25] = new ModelRendererTurbo(this, 49, 153, textureX, textureY); // Box 357
		planeModeParts[26] = new ModelRendererTurbo(this, 1873, 121, textureX, textureY); // Box 358
		planeModeParts[27] = new ModelRendererTurbo(this, 1737, 73, textureX, textureY); // Box 359
		planeModeParts[28] = new ModelRendererTurbo(this, 1537, 81, textureX, textureY); // Box 360
		planeModeParts[29] = new ModelRendererTurbo(this, 1641, 129, textureX, textureY); // Box 361
		planeModeParts[30] = new ModelRendererTurbo(this, 201, 137, textureX, textureY); // Box 362
		planeModeParts[31] = new ModelRendererTurbo(this, 1897, 121, textureX, textureY); // Box 363
		planeModeParts[32] = new ModelRendererTurbo(this, 1257, 137, textureX, textureY); // Box 364
		planeModeParts[33] = new ModelRendererTurbo(this, 1377, 73, textureX, textureY); // Box 365
		planeModeParts[34] = new ModelRendererTurbo(this, 137, 97, textureX, textureY); // Box 366
		planeModeParts[35] = new ModelRendererTurbo(this, 305, 97, textureX, textureY); // Box 367
		planeModeParts[36] = new ModelRendererTurbo(this, 385, 97, textureX, textureY); // Box 368
		planeModeParts[37] = new ModelRendererTurbo(this, 1225, 89, textureX, textureY); // Box 369
		planeModeParts[38] = new ModelRendererTurbo(this, 145, 97, textureX, textureY); // Box 370
		planeModeParts[39] = new ModelRendererTurbo(this, 1545, 49, textureX, textureY); // Box 371
		planeModeParts[40] = new ModelRendererTurbo(this, 1633, 49, textureX, textureY); // Box 372
		planeModeParts[41] = new ModelRendererTurbo(this, 1761, 49, textureX, textureY); // Box 373
		planeModeParts[42] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 374
		planeModeParts[43] = new ModelRendererTurbo(this, 745, 41, textureX, textureY); // Box 375

		planeModeParts[0].addShapeBox(0F, 1F, 0F, 10, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
		planeModeParts[0].setRotationPoint(-12F, -52F, -5F);
		planeModeParts[0].rotateAngleZ = -0.10471976F;

		planeModeParts[1].addShapeBox(9F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		planeModeParts[1].setRotationPoint(-12F, -52F, -5F);
		planeModeParts[1].rotateAngleZ = -0.10471976F;

		planeModeParts[2].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		planeModeParts[2].setRotationPoint(-12F, -52F, -5F);
		planeModeParts[2].rotateAngleZ = -0.10471976F;

		planeModeParts[3].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		planeModeParts[3].setRotationPoint(-12F, -52F, 4F);
		planeModeParts[3].rotateAngleZ = -0.10471976F;

		planeModeParts[4].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		planeModeParts[4].setRotationPoint(-12F, -52F, -5F);
		planeModeParts[4].rotateAngleZ = -0.10471976F;

		planeModeParts[5].addShapeBox(0F, 0F, 0F, 1, 13, 10, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		planeModeParts[5].setRotationPoint(-3F, -64F, -5F);

		planeModeParts[6].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		planeModeParts[6].setRotationPoint(-1F, -68F, -3F);

		planeModeParts[7].addShapeBox(0F, 0F, 0F, 1, 13, 8, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 246
		planeModeParts[7].setRotationPoint(-4F, -63F, -4F);

		planeModeParts[8].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		planeModeParts[8].setRotationPoint(-4.3F, -63.3F, -2F);

		planeModeParts[9].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		planeModeParts[9].setRotationPoint(-4.3F, -63.3F, 1F);

		planeModeParts[10].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 250
		planeModeParts[10].setRotationPoint(-3F, -61F, -4F);

		planeModeParts[11].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 251
		planeModeParts[11].setRotationPoint(-3F, -61F, 3F);

		planeModeParts[12].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 252
		planeModeParts[12].setRotationPoint(-9F, -51F, -6F);
		planeModeParts[12].rotateAngleZ = 0.78539816F;

		planeModeParts[13].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 253
		planeModeParts[13].setRotationPoint(-9F, -51F, 5F);
		planeModeParts[13].rotateAngleZ = 0.78539816F;

		planeModeParts[14].addShapeBox(-1F, -1F, 0F, 2, 11, 2, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 263
		planeModeParts[14].setRotationPoint(-13.5F, -56.25F, -1F);
		planeModeParts[14].rotateAngleZ = -1.13446401F;

		planeModeParts[15].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 264
		planeModeParts[15].setRotationPoint(-13F, -60F, -0.5F);

		planeModeParts[16].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 962
		planeModeParts[16].setRotationPoint(-1.5F, -67.5F, -1.5F);

		planeModeParts[17].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 964
		planeModeParts[17].setRotationPoint(-1.5F, -66.5F, -1.5F);

		planeModeParts[18].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 966
		planeModeParts[18].setRotationPoint(-1.5F, -65.5F, -1.5F);

		planeModeParts[19].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 782
		planeModeParts[19].setRotationPoint(-8F, -50F, -4F);

		planeModeParts[20].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 783
		planeModeParts[20].setRotationPoint(-8F, -50F, 3F);

		planeModeParts[21].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 786
		planeModeParts[21].setRotationPoint(-13F, -59.75F, 0.5F);

		planeModeParts[22].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 789
		planeModeParts[22].setRotationPoint(-13F, -59.75F, -3.5F);

		planeModeParts[23].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 791
		planeModeParts[23].setRotationPoint(-13F, -62.75F, -3.5F);

		planeModeParts[24].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 792
		planeModeParts[24].setRotationPoint(-13F, -62.75F, 2.5F);

		planeModeParts[25].addShapeBox(0F, 1F, 0F, 10, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 357
		planeModeParts[25].setRotationPoint(-71F, -37F, -5F);
		planeModeParts[25].rotateAngleZ = -0.10471976F;

		planeModeParts[26].addShapeBox(9F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 358
		planeModeParts[26].setRotationPoint(-71F, -37F, -5F);
		planeModeParts[26].rotateAngleZ = -0.10471976F;

		planeModeParts[27].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 359
		planeModeParts[27].setRotationPoint(-71F, -37F, -5F);
		planeModeParts[27].rotateAngleZ = -0.10471976F;

		planeModeParts[28].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 360
		planeModeParts[28].setRotationPoint(-71F, -37F, 4F);
		planeModeParts[28].rotateAngleZ = -0.10471976F;

		planeModeParts[29].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 361
		planeModeParts[29].setRotationPoint(-71F, -37F, -5F);
		planeModeParts[29].rotateAngleZ = -0.10471976F;

		planeModeParts[30].addShapeBox(0F, 0F, 0F, 1, 13, 10, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 362
		planeModeParts[30].setRotationPoint(-62F, -49F, -5F);

		planeModeParts[31].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 363
		planeModeParts[31].setRotationPoint(-60F, -53F, -3F);

		planeModeParts[32].addShapeBox(0F, 0F, 0F, 1, 13, 8, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364
		planeModeParts[32].setRotationPoint(-63F, -48F, -4F);

		planeModeParts[33].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 365
		planeModeParts[33].setRotationPoint(-63.3F, -48.3F, -2F);

		planeModeParts[34].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 366
		planeModeParts[34].setRotationPoint(-63.3F, -48.3F, 1F);

		planeModeParts[35].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 367
		planeModeParts[35].setRotationPoint(-62F, -46F, -4F);

		planeModeParts[36].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 368
		planeModeParts[36].setRotationPoint(-62F, -46F, 3F);

		planeModeParts[37].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 369
		planeModeParts[37].setRotationPoint(-68F, -36F, -6F);
		planeModeParts[37].rotateAngleZ = 0.78539816F;

		planeModeParts[38].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 370
		planeModeParts[38].setRotationPoint(-68F, -36F, 5F);
		planeModeParts[38].rotateAngleZ = 0.78539816F;

		planeModeParts[39].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 371
		planeModeParts[39].setRotationPoint(-60.5F, -52.5F, -1.5F);

		planeModeParts[40].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372
		planeModeParts[40].setRotationPoint(-60.5F, -51.5F, -1.5F);

		planeModeParts[41].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 373
		planeModeParts[41].setRotationPoint(-60.5F, -50.5F, -1.5F);

		planeModeParts[42].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 374
		planeModeParts[42].setRotationPoint(-67F, -35F, -4F);

		planeModeParts[43].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 375
		planeModeParts[43].setRotationPoint(-67F, -35F, 3F);
	}

	private void initPropeller()
	{
		propellerModels = new ModelRendererTurbo[2][3];
		propellerModels[0] = makeProp1(-61F, -41F, -55F);
		propellerModels[1] = makeProp2(-61F, -41F, 55F);
	}

	private ModelRendererTurbo[] makeProp1(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[3];
		prop[0] = new ModelRendererTurbo(this, 0, 400, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 400, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 0, 400, textureX, textureY);
		prop[0].addBox(-1F, -35F, -2F, 2, 35, 4, 0.0F);
		prop[1].addBox(-1F, -35F, -2F, 2, 35, 4, 0.0F);
		prop[2].addBox(-1F, -35F, -2F, 2, 35, 4, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		return prop;
	}

	private ModelRendererTurbo[] makeProp2(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[3];
		prop[0] = new ModelRendererTurbo(this, 0, 400, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 400, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 0, 400, textureX, textureY);
		prop[0].addBox(-1F, -35F, -2F, 2, 35, 4, 0.0F);
		prop[1].addBox(-1F, -35F, -2F, 2, 35, 4, 0.0F);
		prop[2].addBox(-1F, -35F, -2F, 2, 35, 4, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		return prop;
	}

	private void initGuns() {
	}
	{

		// Passenger 2
		ModelRendererTurbo[][] gun_1_Model = new ModelRendererTurbo[3][];

		gun_1_Model[0] = new ModelRendererTurbo[118];
		gun_1_Model[0][0] = new ModelRendererTurbo(this, 631, 254, textureX, textureY); // Box 4
		gun_1_Model[0][1] = new ModelRendererTurbo(this, 687, 254, textureX, textureY); // Box 7
		gun_1_Model[0][2] = new ModelRendererTurbo(this, 727, 254, textureX, textureY); // Box 8
		gun_1_Model[0][3] = new ModelRendererTurbo(this, 767, 254, textureX, textureY); // Box 0
		gun_1_Model[0][4] = new ModelRendererTurbo(this, 807, 254, textureX, textureY); // Box 1
		gun_1_Model[0][5] = new ModelRendererTurbo(this, 847, 254, textureX, textureY); // Box 0
		gun_1_Model[0][6] = new ModelRendererTurbo(this, 855, 254, textureX, textureY); // Box 1
		gun_1_Model[0][7] = new ModelRendererTurbo(this, 863, 254, textureX, textureY); // Box 2
		gun_1_Model[0][8] = new ModelRendererTurbo(this, 871, 254, textureX, textureY); // Box 3
		gun_1_Model[0][9] = new ModelRendererTurbo(this, 879, 254, textureX, textureY); // Box 4
		gun_1_Model[0][10] = new ModelRendererTurbo(this, 887, 254, textureX, textureY); // Box 5
		gun_1_Model[0][11] = new ModelRendererTurbo(this, 895, 254, textureX, textureY); // Box 12
		gun_1_Model[0][12] = new ModelRendererTurbo(this, 903, 254, textureX, textureY); // Box 13
		gun_1_Model[0][13] = new ModelRendererTurbo(this, 911, 254, textureX, textureY); // Box 14
		gun_1_Model[0][14] = new ModelRendererTurbo(this, 919, 254, textureX, textureY); // Box 15
		gun_1_Model[0][15] = new ModelRendererTurbo(this, 927, 254, textureX, textureY); // Box 16
		gun_1_Model[0][16] = new ModelRendererTurbo(this, 935, 254, textureX, textureY); // Box 17
		gun_1_Model[0][17] = new ModelRendererTurbo(this, 943, 254, textureX, textureY); // Box 18
		gun_1_Model[0][18] = new ModelRendererTurbo(this, 951, 254, textureX, textureY); // Box 19
		gun_1_Model[0][19] = new ModelRendererTurbo(this, 959, 254, textureX, textureY); // Box 20
		gun_1_Model[0][20] = new ModelRendererTurbo(this, 967, 254, textureX, textureY); // Box 21
		gun_1_Model[0][21] = new ModelRendererTurbo(this, 975, 254, textureX, textureY); // Box 22
		gun_1_Model[0][22] = new ModelRendererTurbo(this, 983, 254, textureX, textureY); // Box 23
		gun_1_Model[0][23] = new ModelRendererTurbo(this, 991, 254, textureX, textureY); // Box 24
		gun_1_Model[0][24] = new ModelRendererTurbo(this, 999, 254, textureX, textureY); // Box 25
		gun_1_Model[0][25] = new ModelRendererTurbo(this, 1007, 254, textureX, textureY); // Box 26
		gun_1_Model[0][26] = new ModelRendererTurbo(this, 1015, 254, textureX, textureY); // Box 27
		gun_1_Model[0][27] = new ModelRendererTurbo(this, 1023, 254, textureX, textureY); // Box 28
		gun_1_Model[0][28] = new ModelRendererTurbo(this, 1031, 254, textureX, textureY); // Box 29
		gun_1_Model[0][29] = new ModelRendererTurbo(this, 1039, 254, textureX, textureY); // Box 2
		gun_1_Model[0][30] = new ModelRendererTurbo(this, 631, 262, textureX, textureY); // Box 3
		gun_1_Model[0][31] = new ModelRendererTurbo(this, 687, 262, textureX, textureY); // Box 4
		gun_1_Model[0][32] = new ModelRendererTurbo(this, 1095, 254, textureX, textureY); // Box 0
		gun_1_Model[0][33] = new ModelRendererTurbo(this, 1103, 254, textureX, textureY); // Box 1
		gun_1_Model[0][34] = new ModelRendererTurbo(this, 1111, 254, textureX, textureY); // Box 2
		gun_1_Model[0][35] = new ModelRendererTurbo(this, 1119, 254, textureX, textureY); // Box 3
		gun_1_Model[0][36] = new ModelRendererTurbo(this, 1127, 254, textureX, textureY); // Box 6
		gun_1_Model[0][37] = new ModelRendererTurbo(this, 1135, 254, textureX, textureY); // Box 8
		gun_1_Model[0][38] = new ModelRendererTurbo(this, 743, 262, textureX, textureY); // Box 9
		gun_1_Model[0][39] = new ModelRendererTurbo(this, 751, 262, textureX, textureY); // Box 10
		gun_1_Model[0][40] = new ModelRendererTurbo(this, 759, 262, textureX, textureY); // Box 11
		gun_1_Model[0][41] = new ModelRendererTurbo(this, 767, 262, textureX, textureY); // Box 12
		gun_1_Model[0][42] = new ModelRendererTurbo(this, 775, 262, textureX, textureY); // Box 13
		gun_1_Model[0][43] = new ModelRendererTurbo(this, 783, 262, textureX, textureY); // Box 14
		gun_1_Model[0][44] = new ModelRendererTurbo(this, 791, 262, textureX, textureY); // Box 15
		gun_1_Model[0][45] = new ModelRendererTurbo(this, 799, 262, textureX, textureY); // Box 15
		gun_1_Model[0][46] = new ModelRendererTurbo(this, 807, 262, textureX, textureY); // Box 15
		gun_1_Model[0][47] = new ModelRendererTurbo(this, 815, 262, textureX, textureY); // Box 15
		gun_1_Model[0][48] = new ModelRendererTurbo(this, 823, 262, textureX, textureY); // Box 15
		gun_1_Model[0][49] = new ModelRendererTurbo(this, 831, 262, textureX, textureY); // Box 15
		gun_1_Model[0][50] = new ModelRendererTurbo(this, 839, 262, textureX, textureY); // Box 15
		gun_1_Model[0][51] = new ModelRendererTurbo(this, 847, 262, textureX, textureY); // Box 15
		gun_1_Model[0][52] = new ModelRendererTurbo(this, 855, 262, textureX, textureY); // Box 23
		gun_1_Model[0][53] = new ModelRendererTurbo(this, 863, 262, textureX, textureY); // Box 24
		gun_1_Model[0][54] = new ModelRendererTurbo(this, 871, 262, textureX, textureY); // Box 25
		gun_1_Model[0][55] = new ModelRendererTurbo(this, 879, 262, textureX, textureY); // Box 26
		gun_1_Model[0][56] = new ModelRendererTurbo(this, 887, 262, textureX, textureY); // Box 27
		gun_1_Model[0][57] = new ModelRendererTurbo(this, 895, 262, textureX, textureY); // Box 28
		gun_1_Model[0][58] = new ModelRendererTurbo(this, 903, 262, textureX, textureY); // Box 29
		gun_1_Model[0][59] = new ModelRendererTurbo(this, 911, 262, textureX, textureY); // Box 30
		gun_1_Model[0][60] = new ModelRendererTurbo(this, 919, 262, textureX, textureY); // Box 31
		gun_1_Model[0][61] = new ModelRendererTurbo(this, 927, 262, textureX, textureY); // Box 32
		gun_1_Model[0][62] = new ModelRendererTurbo(this, 935, 262, textureX, textureY); // Box 33
		gun_1_Model[0][63] = new ModelRendererTurbo(this, 943, 262, textureX, textureY); // Box 34
		gun_1_Model[0][64] = new ModelRendererTurbo(this, 951, 262, textureX, textureY); // Box 35
		gun_1_Model[0][65] = new ModelRendererTurbo(this, 959, 262, textureX, textureY); // Box 36
		gun_1_Model[0][66] = new ModelRendererTurbo(this, 967, 262, textureX, textureY); // Box 37
		gun_1_Model[0][67] = new ModelRendererTurbo(this, 975, 262, textureX, textureY); // Box 38
		gun_1_Model[0][68] = new ModelRendererTurbo(this, 983, 262, textureX, textureY); // Box 39
		gun_1_Model[0][69] = new ModelRendererTurbo(this, 991, 262, textureX, textureY); // Box 40
		gun_1_Model[0][70] = new ModelRendererTurbo(this, 999, 262, textureX, textureY); // Box 41
		gun_1_Model[0][71] = new ModelRendererTurbo(this, 1007, 262, textureX, textureY); // Box 42
		gun_1_Model[0][72] = new ModelRendererTurbo(this, 1015, 262, textureX, textureY); // Box 43
		gun_1_Model[0][73] = new ModelRendererTurbo(this, 1023, 262, textureX, textureY); // Box 44
		gun_1_Model[0][74] = new ModelRendererTurbo(this, 1031, 262, textureX, textureY); // Box 45
		gun_1_Model[0][75] = new ModelRendererTurbo(this, 1071, 262, textureX, textureY); // Box 46
		gun_1_Model[0][76] = new ModelRendererTurbo(this, 1095, 262, textureX, textureY); // Box 47
		gun_1_Model[0][77] = new ModelRendererTurbo(this, 1119, 262, textureX, textureY); // Box 48
		gun_1_Model[0][78] = new ModelRendererTurbo(this, 631, 270, textureX, textureY); // Box 49
		gun_1_Model[0][79] = new ModelRendererTurbo(this, 655, 270, textureX, textureY); // Box 0
		gun_1_Model[0][80] = new ModelRendererTurbo(this, 695, 270, textureX, textureY); // Box 1
		gun_1_Model[0][81] = new ModelRendererTurbo(this, 735, 270, textureX, textureY); // Box 3
		gun_1_Model[0][82] = new ModelRendererTurbo(this, 775, 270, textureX, textureY); // Box 4
		gun_1_Model[0][83] = new ModelRendererTurbo(this, 815, 270, textureX, textureY); // Box 0
		gun_1_Model[0][84] = new ModelRendererTurbo(this, 839, 270, textureX, textureY); // Box 5
		gun_1_Model[0][85] = new ModelRendererTurbo(this, 863, 270, textureX, textureY); // Box 0
		gun_1_Model[0][86] = new ModelRendererTurbo(this, 895, 270, textureX, textureY); // Box 1
		gun_1_Model[0][87] = new ModelRendererTurbo(this, 927, 270, textureX, textureY); // Box 2
		gun_1_Model[0][88] = new ModelRendererTurbo(this, 959, 270, textureX, textureY); // Box 3
		gun_1_Model[0][89] = new ModelRendererTurbo(this, 991, 270, textureX, textureY); // Box 5
		gun_1_Model[0][90] = new ModelRendererTurbo(this, 1007, 270, textureX, textureY); // Box 6
		gun_1_Model[0][91] = new ModelRendererTurbo(this, 1023, 270, textureX, textureY); // Box 9
		gun_1_Model[0][92] = new ModelRendererTurbo(this, 1031, 270, textureX, textureY); // Box 10
		gun_1_Model[0][93] = new ModelRendererTurbo(this, 1039, 270, textureX, textureY); // Box 11
		gun_1_Model[0][94] = new ModelRendererTurbo(this, 1047, 270, textureX, textureY); // Box 12
		gun_1_Model[0][95] = new ModelRendererTurbo(this, 1063, 270, textureX, textureY); // Box 13
		gun_1_Model[0][96] = new ModelRendererTurbo(this, 1087, 270, textureX, textureY); // Box 14
		gun_1_Model[0][97] = new ModelRendererTurbo(this, 1111, 270, textureX, textureY); // Box 15
		gun_1_Model[0][98] = new ModelRendererTurbo(this, 1135, 270, textureX, textureY); // Box 25
		gun_1_Model[0][99] = new ModelRendererTurbo(this, 951, 278, textureX, textureY); // Box 27
		gun_1_Model[0][100] = new ModelRendererTurbo(this, 959, 278, textureX, textureY); // Box 28
		gun_1_Model[0][101] = new ModelRendererTurbo(this, 967, 278, textureX, textureY); // Box 29
		gun_1_Model[0][102] = new ModelRendererTurbo(this, 975, 278, textureX, textureY); // Box 29
		gun_1_Model[0][103] = new ModelRendererTurbo(this, 983, 278, textureX, textureY); // Box 31
		gun_1_Model[0][104] = new ModelRendererTurbo(this, 991, 278, textureX, textureY); // Box 32
		gun_1_Model[0][105] = new ModelRendererTurbo(this, 999, 278, textureX, textureY); // Box 33
		gun_1_Model[0][106] = new ModelRendererTurbo(this, 1007, 278, textureX, textureY); // Box 34
		gun_1_Model[0][107] = new ModelRendererTurbo(this, 1015, 278, textureX, textureY); // Box 35
		gun_1_Model[0][108] = new ModelRendererTurbo(this, 1023, 278, textureX, textureY); // Box 36
		gun_1_Model[0][109] = new ModelRendererTurbo(this, 1031, 278, textureX, textureY); // Box 37
		gun_1_Model[0][110] = new ModelRendererTurbo(this, 1039, 278, textureX, textureY); // Box 38
		gun_1_Model[0][111] = new ModelRendererTurbo(this, 1047, 278, textureX, textureY); // Box 38
		gun_1_Model[0][112] = new ModelRendererTurbo(this, 1055, 278, textureX, textureY); // Box 38
		gun_1_Model[0][113] = new ModelRendererTurbo(this, 1063, 278, textureX, textureY); // Box 0
		gun_1_Model[0][114] = new ModelRendererTurbo(this, 1103, 278, textureX, textureY); // Box 1
		gun_1_Model[0][115] = new ModelRendererTurbo(this, 631, 286, textureX, textureY); // Box 2
		gun_1_Model[0][116] = new ModelRendererTurbo(this, 671, 286, textureX, textureY); // Box 3
		gun_1_Model[0][117] = new ModelRendererTurbo(this, 711, 286, textureX, textureY); // Box 4

		gun_1_Model[0][0].addShapeBox(0F, 0F, 0F, 24, 1, 1, 0F,-18F, 0F, 0F, 23.125F, 0F, 0F, 23.125F, 0F, -0.625F, -18F, 0F, -0.625F, -18F, -0.625F, 0F, 23.125F, -0.625F, 0F, 23.125F, -0.75F, -0.75F, -18F, -0.75F, -0.75F); // Box 4

		gun_1_Model[0][1].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,-18F, 0.93F, -0.25F, 18F, 0.93F, -0.25F, 18F, 0.75F, -0.25F, -18F, 0.75F, -0.25F, -18F, -1.75F, -0.75F, 18F, -1.75F, -0.75F, 18F, -1.25F, -0.08F, -18F, -1.25F, -0.08F); // Box 7

		gun_1_Model[0][2].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,-18F, -0.75F, -0.75F, 18F, -0.75F, -0.75F, 18F, -0.25F, -0.08F, -18F, -0.25F, -0.08F, -18F, -0.07F, -0.25F, 18F, -0.07F, -0.25F, 18F, -0.25F, -0.25F, -18F, -0.25F, -0.25F); // Box 8

		gun_1_Model[0][3].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,-18F, -0.25F, 0.92F, 18F, -0.25F, 0.92F, 18F, -0.75F, -1.75F, -18F, -0.75F, -1.75F, -18F, -0.25F, 0.75F, 18F, -0.25F, 0.75F, 18F, -0.07F, -1.25F, -18F, -0.07F, -1.25F); // Box 0

		gun_1_Model[0][4].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,-18F, 0.75F, 0.75F, 18F, 0.75F, 0.75F, 18F, 0.93F, -1.25F, -18F, 0.93F, -1.25F, -18F, -1.25F, 0.92F, 18F, -1.25F, 0.92F, 18F, -1.75F, -1.75F, -18F, -1.75F, -1.75F); // Box 1

		gun_1_Model[0][5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-20F, 1F, 0F, 20F, 1F, 0F, 20F, 0.75F, -0.25F, -20F, 0.75F, -0.25F, -20F, -1.75F, -0.75F, 20F, -1.75F, -0.75F, 20F, -1F, 0F, -20F, -1F, 0F); // Box 0

		gun_1_Model[0][6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-23F, 1F, 0F, 23F, 1F, 0F, 23F, 0.75F, -0.25F, -23F, 0.75F, -0.25F, -23F, -1.75F, -0.75F, 23F, -1.75F, -0.75F, 23F, -1F, 0F, -23F, -1F, 0F); // Box 1

		gun_1_Model[0][7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-35F, 1F, 0F, 35F, 1F, 0F, 35F, 0.75F, -0.25F, -35F, 0.75F, -0.25F, -35F, -1.75F, -0.75F, 35F, -1.75F, -0.75F, 35F, -1F, 0F, -35F, -1F, 0F); // Box 2

		gun_1_Model[0][8].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-26F, 1F, 0F, 26F, 1F, 0F, 26F, 0.75F, -0.25F, -26F, 0.75F, -0.25F, -26F, -1.75F, -0.75F, 26F, -1.75F, -0.75F, 26F, -1F, 0F, -26F, -1F, 0F); // Box 3

		gun_1_Model[0][9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-29F, 1F, 0F, 29F, 1F, 0F, 29F, 0.75F, -0.25F, -29F, 0.75F, -0.25F, -29F, -1.75F, -0.75F, 29F, -1.75F, -0.75F, 29F, -1F, 0F, -29F, -1F, 0F); // Box 4

		gun_1_Model[0][10].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-32F, 1F, 0F, 32F, 1F, 0F, 32F, 0.75F, -0.25F, -32F, 0.75F, -0.25F, -32F, -1.75F, -0.75F, 32F, -1.75F, -0.75F, 32F, -1F, 0F, -32F, -1F, 0F); // Box 5

		gun_1_Model[0][11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-32F, 0.75F, 0.75F, 32F, 0.75F, 0.75F, 32F, 1F, -1F, -32F, 1F, -1F, -32F, -1F, 1F, 32F, -1F, 1F, 32F, -1.75F, -1.75F, -32F, -1.75F, -1.75F); // Box 12

		gun_1_Model[0][12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-29F, 0.75F, 0.75F, 29F, 0.75F, 0.75F, 29F, 1F, -1F, -29F, 1F, -1F, -29F, -1F, 1F, 29F, -1F, 1F, 29F, -1.75F, -1.75F, -29F, -1.75F, -1.75F); // Box 13

		gun_1_Model[0][13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-26F, 0.75F, 0.75F, 26F, 0.75F, 0.75F, 26F, 1F, -1F, -26F, 1F, -1F, -26F, -1F, 1F, 26F, -1F, 1F, 26F, -1.75F, -1.75F, -26F, -1.75F, -1.75F); // Box 14

		gun_1_Model[0][14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-35F, 0.75F, 0.75F, 35F, 0.75F, 0.75F, 35F, 1F, -1F, -35F, 1F, -1F, -35F, -1F, 1F, 35F, -1F, 1F, 35F, -1.75F, -1.75F, -35F, -1.75F, -1.75F); // Box 15

		gun_1_Model[0][15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-23F, 0.75F, 0.75F, 23F, 0.75F, 0.75F, 23F, 1F, -1F, -23F, 1F, -1F, -23F, -1F, 1F, 23F, -1F, 1F, 23F, -1.75F, -1.75F, -23F, -1.75F, -1.75F); // Box 16

		gun_1_Model[0][16].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-20F, 0.75F, 0.75F, 20F, 0.75F, 0.75F, 20F, 1F, -1F, -20F, 1F, -1F, -20F, -1F, 1F, 20F, -1F, 1F, 20F, -1.75F, -1.75F, -20F, -1.75F, -1.75F); // Box 17

		gun_1_Model[0][17].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-32F, 0F, 1F, 32F, 0F, 1F, 32F, -0.75F, -1.75F, -32F, -0.75F, -1.75F, -32F, -0.25F, 0.75F, 32F, -0.25F, 0.75F, 32F, 0F, -1F, -32F, 0F, -1F); // Box 18

		gun_1_Model[0][18].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-29F, 0F, 1F, 29F, 0F, 1F, 29F, -0.75F, -1.75F, -29F, -0.75F, -1.75F, -29F, -0.25F, 0.75F, 29F, -0.25F, 0.75F, 29F, 0F, -1F, -29F, 0F, -1F); // Box 19

		gun_1_Model[0][19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-26F, 0F, 1F, 26F, 0F, 1F, 26F, -0.75F, -1.75F, -26F, -0.75F, -1.75F, -26F, -0.25F, 0.75F, 26F, -0.25F, 0.75F, 26F, 0F, -1F, -26F, 0F, -1F); // Box 20

		gun_1_Model[0][20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-35F, 0F, 1F, 35F, 0F, 1F, 35F, -0.75F, -1.75F, -35F, -0.75F, -1.75F, -35F, -0.25F, 0.75F, 35F, -0.25F, 0.75F, 35F, 0F, -1F, -35F, 0F, -1F); // Box 21

		gun_1_Model[0][21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-23F, 0F, 1F, 23F, 0F, 1F, 23F, -0.75F, -1.75F, -23F, -0.75F, -1.75F, -23F, -0.25F, 0.75F, 23F, -0.25F, 0.75F, 23F, 0F, -1F, -23F, 0F, -1F); // Box 22

		gun_1_Model[0][22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-20F, 0F, 1F, 20F, 0F, 1F, 20F, -0.75F, -1.75F, -20F, -0.75F, -1.75F, -20F, -0.25F, 0.75F, 20F, -0.25F, 0.75F, 20F, 0F, -1F, -20F, 0F, -1F); // Box 23

		gun_1_Model[0][23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-20F, -0.75F, -0.75F, 20F, -0.75F, -0.75F, 20F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, 0F, 20F, 0F, 0F, 20F, -0.25F, -0.25F, -20F, -0.25F, -0.25F); // Box 24

		gun_1_Model[0][24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-23F, -0.75F, -0.75F, 23F, -0.75F, -0.75F, 23F, 0F, 0F, -23F, 0F, 0F, -23F, 0F, 0F, 23F, 0F, 0F, 23F, -0.25F, -0.25F, -23F, -0.25F, -0.25F); // Box 25

		gun_1_Model[0][25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-35F, -0.75F, -0.75F, 35F, -0.75F, -0.75F, 35F, 0F, 0F, -35F, 0F, 0F, -35F, 0F, 0F, 35F, 0F, 0F, 35F, -0.25F, -0.25F, -35F, -0.25F, -0.25F); // Box 26

		gun_1_Model[0][26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-26F, -0.75F, -0.75F, 26F, -0.75F, -0.75F, 26F, 0F, 0F, -26F, 0F, 0F, -26F, 0F, 0F, 26F, 0F, 0F, 26F, -0.25F, -0.25F, -26F, -0.25F, -0.25F); // Box 27

		gun_1_Model[0][27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-29F, -0.75F, -0.75F, 29F, -0.75F, -0.75F, 29F, 0F, 0F, -29F, 0F, 0F, -29F, 0F, 0F, 29F, 0F, 0F, 29F, -0.25F, -0.25F, -29F, -0.25F, -0.25F); // Box 28

		gun_1_Model[0][28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-32F, -0.75F, -0.75F, 32F, -0.75F, -0.75F, 32F, 0F, 0F, -32F, 0F, 0F, -32F, 0F, 0F, 32F, 0F, 0F, 32F, -0.25F, -0.25F, -32F, -0.25F, -0.25F); // Box 29

		gun_1_Model[0][29].addShapeBox(0F, 0F, 0F, 24, 1, 1, 0F,-18F, 0F, 0.375F, 23.125F, 0F, 0.375F, 23.125F, 0F, -1F, -18F, 0F, -1F, -18F, -0.75F, 0.25F, 23.125F, -0.75F, 0.25F, 23.125F, -0.625F, -1F, -18F, -0.625F, -1F); // Box 2

		gun_1_Model[0][30].addShapeBox(0F, 0F, 0F, 24, 1, 1, 0F,-18F, 0.25F, 0.25F, 23.125F, 0.25F, 0.25F, 23.125F, 0.375F, -1F, -18F, 0.375F, -1F, -18F, -1F, 0.375F, 23.125F, -1F, 0.375F, 23.125F, -1F, -1F, -18F, -1F, -1F); // Box 3

		gun_1_Model[0][31].addShapeBox(0F, 0F, 0F, 24, 1, 1, 0F,-18F, 0.375F, 0F, 23.125F, 0.375F, 0F, 23.125F, 0.25F, -0.75F, -18F, 0.25F, -0.75F, -18F, -1F, 0F, 23.125F, -1F, 0F, 23.125F, -1F, -0.625F, -18F, -1F, -0.625F); // Box 4

		gun_1_Model[0][32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-36F, 1F, 0F, 36F, 1F, 0F, 36F, 0.75F, -0.25F, -36F, 0.75F, -0.25F, -36F, -1F, 0F, 36F, -1F, 0F, 36F, -1F, 0F, -36F, -1F, 0F); // Box 0

		gun_1_Model[0][33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-36F, 0.75F, 0.75F, 36F, 0.75F, 0.75F, 36F, 1F, -1F, -36F, 1F, -1F, -36F, -1F, 1F, 36F, -1F, 1F, 36F, -1F, -1F, -36F, -1F, -1F); // Box 1

		gun_1_Model[0][34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-36F, 0F, 1F, 36F, 0F, 1F, 36F, 0F, -1F, -36F, 0F, -1F, -36F, -0.25F, 0.75F, 36F, -0.25F, 0.75F, 36F, 0F, -1F, -36F, 0F, -1F); // Box 2

		gun_1_Model[0][35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-36F, 0F, 0F, 36F, 0F, 0F, 36F, 0F, 0F, -36F, 0F, 0F, -36F, 0F, 0F, 36F, 0F, 0F, 36F, -0.25F, -0.25F, -36F, -0.25F, -0.25F); // Box 3

		gun_1_Model[0][36].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-43F, 0F, 0F, 44.25F, 0F, 0F, 44.25F, 0F, -0.375F, -43F, 0F, -0.5F, -43F, -0.5F, 0F, 44.25F, -0.375F, 0F, 44.25F, -0.5F, -0.5F, -43F, -0.625F, -0.625F); // Box 6

		gun_1_Model[0][37].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-46.75F, 0F, 0F, 46F, 0F, 0F, 46F, 0F, -0.375F, -46.75F, 0F, -0.375F, -46.75F, -0.375F, 0F, 46F, -0.375F, 0F, 46F, -0.5F, -0.5F, -46.75F, -0.5F, -0.5F); // Box 8

		gun_1_Model[0][38].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-46.5F, -0.25F, 0F, 45.75F, 0F, 0F, 45.75F, 0F, -0.375F, -46.5F, -0.25F, -0.45F, -46.5F, -0.375F, 0F, 45.75F, -0.375F, 0F, 45.75F, -0.5F, -0.5F, -46.5F, -0.5F, -0.5F); // Box 9

		gun_1_Model[0][39].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-46.25F, 0F, 0F, 45.5F, -0.25F, 0F, 45.5F, -0.25F, -0.45F, -46.25F, 0F, -0.375F, -46.25F, -0.375F, 0F, 45.5F, -0.375F, 0F, 45.5F, -0.5F, -0.5F, -46.25F, -0.5F, -0.5F); // Box 10

		gun_1_Model[0][40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-46F, -0.25F, 0F, 45.25F, 0F, 0F, 45.25F, 0F, -0.375F, -46F, -0.25F, -0.45F, -46F, -0.375F, 0F, 45.25F, -0.375F, 0F, 45.25F, -0.5F, -0.5F, -46F, -0.5F, -0.5F); // Box 11

		gun_1_Model[0][41].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-45.75F, 0F, 0F, 45F, -0.25F, 0F, 45F, -0.25F, -0.45F, -45.75F, 0F, -0.375F, -45.75F, -0.375F, 0F, 45F, -0.375F, 0F, 45F, -0.5F, -0.5F, -45.75F, -0.5F, -0.5F); // Box 12

		gun_1_Model[0][42].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-45.25F, 0F, 0F, 44.5F, -0.25F, 0F, 44.5F, -0.25F, -0.45F, -45.25F, 0F, -0.375F, -45.25F, -0.375F, 0F, 44.5F, -0.375F, 0F, 44.5F, -0.5F, -0.5F, -45.25F, -0.5F, -0.5F); // Box 13

		gun_1_Model[0][43].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-45.5F, -0.25F, 0F, 44.75F, 0F, 0F, 44.75F, 0F, -0.375F, -45.5F, -0.25F, -0.45F, -45.5F, -0.375F, 0F, 44.75F, -0.375F, 0F, 44.75F, -0.5F, -0.5F, -45.5F, -0.5F, -0.5F); // Box 14

		gun_1_Model[0][44].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-43F, 0.5F, 0F, 44.25F, 0.625F, 0F, 44.25F, 0.5F, -0.5F, -43F, 0.375F, -0.625F, -43F, -1F, 0F, 44.25F, -1F, 0F, 44.25F, -1F, -0.375F, -43F, -1F, -0.5F); // Box 15

		gun_1_Model[0][45].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-46.75F, 0.625F, 0F, 46F, 0.625F, 0F, 46F, 0.5F, -0.5F, -46.75F, 0.5F, -0.5F, -46.75F, -1F, 0F, 46F, -1F, 0F, 46F, -1F, -0.375F, -46.75F, -1F, -0.375F); // Box 15

		gun_1_Model[0][46].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-46.5F, 0.625F, 0F, 45.75F, 0.625F, 0F, 45.75F, 0.5F, -0.5F, -46.5F, 0.5F, -0.5F, -46.5F, -1.25F, 0F, 45.75F, -1F, 0F, 45.75F, -1F, -0.375F, -46.5F, -1.25F, -0.45F); // Box 15

		gun_1_Model[0][47].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-46.25F, 0.625F, 0F, 45.5F, 0.625F, 0F, 45.5F, 0.5F, -0.5F, -46.25F, 0.5F, -0.5F, -46.25F, -1F, 0F, 45.5F, -1.25F, 0F, 45.5F, -1.25F, -0.45F, -46.25F, -1F, -0.375F); // Box 15

		gun_1_Model[0][48].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-46F, 0.625F, 0F, 45.25F, 0.625F, 0F, 45.25F, 0.5F, -0.5F, -46F, 0.5F, -0.5F, -46F, -1.25F, 0F, 45.25F, -1F, 0F, 45.25F, -1F, -0.375F, -46F, -1.25F, -0.45F); // Box 15

		gun_1_Model[0][49].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-45.75F, 0.625F, 0F, 45F, 0.625F, 0F, 45F, 0.5F, -0.5F, -45.75F, 0.5F, -0.5F, -45.75F, -1F, 0F, 45F, -1.25F, 0F, 45F, -1.25F, -0.45F, -45.75F, -1F, -0.375F); // Box 15

		gun_1_Model[0][50].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-45.25F, 0.625F, 0F, 44.5F, 0.625F, 0F, 44.5F, 0.5F, -0.5F, -45.25F, 0.5F, -0.5F, -45.25F, -1F, 0F, 44.5F, -1.25F, 0F, 44.5F, -1.25F, -0.45F, -45.25F, -1F, -0.375F); // Box 15

		gun_1_Model[0][51].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-45.5F, 0.625F, 0F, 44.75F, 0.625F, 0F, 44.75F, 0.5F, -0.5F, -45.5F, 0.5F, -0.5F, -45.5F, -1.25F, 0F, 44.75F, -1F, 0F, 44.75F, -1F, -0.375F, -45.5F, -1.25F, -0.45F); // Box 15

		gun_1_Model[0][52].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-43F, 0F, 0.5F, 44.25F, 0F, 0.625F, 44.25F, 0F, -1F, -43F, 0F, -1F, -43F, -0.625F, 0.375F, 44.25F, -0.5F, 0.5F, 44.25F, -0.375F, -1F, -43F, -0.5F, -1F); // Box 23

		gun_1_Model[0][53].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-46.75F, 0F, 0.625F, 46F, 0F, 0.625F, 46F, 0F, -1F, -46.75F, 0F, -1F, -46.75F, -0.5F, 0.5F, 46F, -0.5F, 0.5F, 46F, -0.375F, -1F, -46.75F, -0.375F, -1F); // Box 24

		gun_1_Model[0][54].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-46.5F, -0.25F, 0.55F, 45.75F, 0F, 0.625F, 45.75F, 0F, -1F, -46.5F, -0.25F, -1F, -46.5F, -0.5F, 0.5F, 45.75F, -0.5F, 0.5F, 45.75F, -0.375F, -1F, -46.5F, -0.375F, -1F); // Box 25

		gun_1_Model[0][55].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-46.25F, 0F, 0.625F, 45.5F, -0.25F, 0.55F, 45.5F, -0.25F, -1F, -46.25F, 0F, -1F, -46.25F, -0.5F, 0.5F, 45.5F, -0.5F, 0.5F, 45.5F, -0.375F, -1F, -46.25F, -0.375F, -1F); // Box 26

		gun_1_Model[0][56].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-46F, -0.25F, 0.55F, 45.25F, 0F, 0.625F, 45.25F, 0F, -1F, -46F, -0.25F, -1F, -46F, -0.5F, 0.5F, 45.25F, -0.5F, 0.5F, 45.25F, -0.375F, -1F, -46F, -0.375F, -1F); // Box 27

		gun_1_Model[0][57].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-45.75F, 0F, 0.625F, 45F, -0.25F, 0.55F, 45F, -0.25F, -1F, -45.75F, 0F, -1F, -45.75F, -0.5F, 0.5F, 45F, -0.5F, 0.5F, 45F, -0.375F, -1F, -45.75F, -0.375F, -1F); // Box 28

		gun_1_Model[0][58].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-45.25F, 0F, 0.625F, 44.5F, -0.25F, 0.55F, 44.5F, -0.25F, -1F, -45.25F, 0F, -1F, -45.25F, -0.5F, 0.5F, 44.5F, -0.5F, 0.5F, 44.5F, -0.375F, -1F, -45.25F, -0.375F, -1F); // Box 29

		gun_1_Model[0][59].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-45.5F, -0.25F, 0.55F, 44.75F, 0F, 0.625F, 44.75F, 0F, -1F, -45.5F, -0.25F, -1F, -45.5F, -0.5F, 0.5F, 44.75F, -0.5F, 0.5F, 44.75F, -0.375F, -1F, -45.5F, -0.375F, -1F); // Box 30

		gun_1_Model[0][60].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-43F, 0.375F, 0.375F, 44.25F, 0.5F, 0.5F, 44.25F, 0.625F, -1F, -43F, 0.5F, -1F, -43F, -1F, 0.5F, 44.25F, -1F, 0.625F, 44.25F, -1F, -1F, -43F, -1F, -1F); // Box 31

		gun_1_Model[0][61].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-46.75F, 0.5F, 0.5F, 46F, 0.5F, 0.5F, 46F, 0.625F, -1F, -46.75F, 0.625F, -1F, -46.75F, -1F, 0.625F, 46F, -1F, 0.625F, 46F, -1F, -1F, -46.75F, -1F, -1F); // Box 32

		gun_1_Model[0][62].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-46.5F, 0.5F, 0.5F, 45.75F, 0.5F, 0.5F, 45.75F, 0.625F, -1F, -46.5F, 0.625F, -1F, -46.5F, -1.25F, 0.55F, 45.75F, -1F, 0.625F, 45.75F, -1F, -1F, -46.5F, -1.25F, -1F); // Box 33

		gun_1_Model[0][63].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-46.25F, 0.5F, 0.5F, 45.5F, 0.5F, 0.5F, 45.5F, 0.625F, -1F, -46.25F, 0.625F, -1F, -46.25F, -1F, 0.625F, 45.5F, -1.25F, 0.55F, 45.5F, -1.25F, -1F, -46.25F, -1F, -1F); // Box 34

		gun_1_Model[0][64].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-46F, 0.5F, 0.5F, 45.25F, 0.5F, 0.5F, 45.25F, 0.625F, -1F, -46F, 0.625F, -1F, -46F, -1.25F, 0.55F, 45.25F, -1F, 0.625F, 45.25F, -1F, -1F, -46F, -1.25F, -1F); // Box 35

		gun_1_Model[0][65].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-45.75F, 0.5F, 0.5F, 45F, 0.5F, 0.5F, 45F, 0.625F, -1F, -45.75F, 0.625F, -1F, -45.75F, -1F, 0.625F, 45F, -1.25F, 0.55F, 45F, -1.25F, -1F, -45.75F, -1F, -1F); // Box 36

		gun_1_Model[0][66].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-45.25F, 0.5F, 0.5F, 44.5F, 0.5F, 0.5F, 44.5F, 0.625F, -1F, -45.25F, 0.625F, -1F, -45.25F, -1F, 0.625F, 44.5F, -1.25F, 0.55F, 44.5F, -1.25F, -1F, -45.25F, -1F, -1F); // Box 37

		gun_1_Model[0][67].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-45.5F, 0.5F, 0.5F, 44.75F, 0.5F, 0.5F, 44.75F, 0.625F, -1F, -45.5F, 0.625F, -1F, -45.5F, -1.25F, 0.55F, 44.75F, -1F, 0.625F, 44.75F, -1F, -1F, -45.5F, -1.25F, -1F); // Box 38

		gun_1_Model[0][68].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-36.25F, 1.5F, 0F, 35.75F, 1.5F, 0F, 35.75F, 1.5F, -0.875F, -36.25F, 1.5F, -0.875F, -36.25F, -1F, 0F, 35.75F, -1F, 0F, 35.75F, -1F, -0.875F, -36.25F, -1F, -0.875F); // Box 39

		gun_1_Model[0][69].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-36.25F, 1.5F, 0.125F, 35.75F, 1.5F, 0.125F, 35.75F, 1.5F, -1F, -36.25F, 1.5F, -1F, -36.25F, -1F, 0.125F, 35.75F, -1F, 0.125F, 35.75F, -1F, -1F, -36.25F, -1F, -1F); // Box 40

		gun_1_Model[0][70].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-36.25F, 1.5F, 0F, 35.75F, 1.5F, 0F, 35.75F, 1.625F, -0.75F, -36.25F, 1.625F, -0.75F, -36.25F, -2.375F, 0F, 35.75F, -2.375F, 0F, 35.75F, -2.5F, -0.75F, -36.25F, -2.5F, -0.75F); // Box 41

		gun_1_Model[0][71].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-36.25F, 1.625F, 0.25F, 35.75F, 1.625F, 0.25F, 35.75F, 1.5F, -1F, -36.25F, 1.5F, -1F, -36.25F, -2.5F, 0.25F, 35.75F, -2.5F, 0.25F, 35.75F, -2.375F, -1F, -36.25F, -2.375F, -1F); // Box 42

		gun_1_Model[0][72].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-36.25F, 2F, -0.25F, 35.75F, 2F, -0.25F, 35.75F, 1.875F, -0.625F, -36.25F, 1.875F, -0.625F, -36.25F, -2.5F, -0.25F, 35.75F, -2.5F, -0.25F, 35.75F, -2.625F, -0.625F, -36.25F, -2.625F, -0.625F); // Box 43

		gun_1_Model[0][73].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-36.25F, 1.875F, 0.375F, 35.75F, 1.875F, 0.375F, 35.75F, 2F, -1.25F, -36.25F, 2F, -1.25F, -36.25F, -2.625F, 0.375F, 35.75F, -2.625F, 0.375F, 35.75F, -2.5F, -1.25F, -36.25F, -2.5F, -1.25F); // Box 44

		gun_1_Model[0][74].addShapeBox(0F, 0F, 0F, 14, 2, 2, 0F,0F, 1F, 1.5F, -4.75F, 1.75F, 1.5F, -4.75F, 1.75F, -0.5F, 0F, 1F, -0.5F, 0F, 0.25F, 1.5F, -4.75F, 0.25F, 1.5F, -4.75F, 0.25F, -0.5F, 0F, 0.25F, -0.5F); // Box 45

		gun_1_Model[0][75].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,-14F, 0F, 0F, 11F, 0F, 0F, 11F, 0F, 0F, -14F, 0F, 0.5F, -14F, 0.5F, 0F, 11F, 0F, 0F, 11F, -0.25F, -0.25F, -14F, 0.125F, 0.125F); // Box 46

		gun_1_Model[0][76].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,-14F, 1.5F, 0F, 11F, 1F, 0F, 11F, 0.75F, -0.25F, -14F, 1.125F, 0.125F, -14F, -1F, 0F, 11F, -1F, 0F, 11F, -1F, 0F, -14F, -1F, 0.5F); // Box 47

		gun_1_Model[0][77].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,-14F, 1.125F, 1.125F, 11F, 0.75F, 0.75F, 11F, 1F, -1F, -14F, 1.5F, -1F, -14F, -1F, 1.5F, 11F, -1F, 1F, 11F, -1F, -1F, -14F, -1F, -1F); // Box 48

		gun_1_Model[0][78].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,-14F, 0F, 1.5F, 11F, 0F, 1F, 11F, 0F, -1F, -14F, 0F, -1F, -14F, 0.125F, 1.125F, 11F, -0.25F, 0.75F, 11F, 0F, -1F, -14F, 0.5F, -1F); // Box 49

		gun_1_Model[0][79].addShapeBox(0F, 0F, 0F, 14, 2, 2, 0F,-13.5F, 2.25F, -0.875F, 0F, 1.5F, -0.875F, 0F, 1.5F, -0.5F, -13.5F, 2.25F, -0.5F, -13.5F, 0.25F, -0.875F, 0F, -0.25F, -0.875F, 0F, -0.25F, -0.5F, -13.5F, 0.25F, -0.5F); // Box 0

		gun_1_Model[0][80].addShapeBox(0F, 0F, 0F, 14, 2, 2, 0F,-9.25F, 2.25F, 1.5F, -0.5F, 2.25F, 1.5F, -0.5F, 2.25F, -2.875F, -9.25F, 2.25F, -2.875F, -9.25F, 0.25F, 1.5F, -0.5F, 0.25F, 1.5F, -0.5F, 0.25F, -2.625F, -9.25F, 0.25F, -2.625F); // Box 1

		gun_1_Model[0][81].addShapeBox(0F, 0F, 0F, 14, 2, 2, 0F,0F, 1.25F, -0.875F, -4.75F, 2.25F, -0.875F, -4.75F, 2.25F, -0.5F, 0F, 1.25F, -0.5F, 0F, 0.25F, -0.875F, -4.75F, 0.25F, -0.875F, -4.75F, 0.25F, -0.5F, 0F, 0.25F, -0.5F); // Box 3

		gun_1_Model[0][82].addShapeBox(0F, 0F, 0F, 14, 2, 2, 0F,0F, 1.25F, 1.5F, -4.75F, 2.25F, 1.5F, -4.75F, 2.25F, -2.875F, 0F, 1.25F, -2.875F, 0F, 0.25F, 1.5F, -4.75F, 0.25F, 1.5F, -4.75F, 0.25F, -2.875F, 0F, 0.25F, -2.875F); // Box 4

		gun_1_Model[0][83].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,-13.5F, 2.25F, 0.25F, 10.25F, 1.375F, 0.25F, 10.25F, 1.375F, -0.75F, -13.5F, 2.25F, -0.75F, -13.5F, -1F, 0.25F, 11F, -1.875F, 0.25F, 11F, -1.875F, -0.75F, -13.5F, -1F, -0.75F); // Box 0

		gun_1_Model[0][84].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,-2.7F, -1.25F, 2.05F, -2.7F, -1.25F, 2.05F, -2.7F, -1.25F, -3.5F, -2.7F, -1.25F, -3.5F, -2.7F, 1F, 2.05F, -2.7F, 1F, 2.05F, -2.7F, 1F, -3.5F, -2.7F, 1F, -3.5F); // Box 5

		gun_1_Model[0][85].addShapeBox(0F, 0F, 0F, 13, 2, 2, 0F,-8F, 2.75F, -1.5F, 0F, 2.25F, -2F, 0F, 2.25F, 2F, -8F, 2.75F, 2.5F, -8F, -2.75F, -1.5F, 0F, -3.25F, -2F, 0F, -3.25F, 2F, -8F, -2.75F, 2.5F); // Box 0

		gun_1_Model[0][86].addShapeBox(0F, 0F, 0F, 13, 2, 2, 0F,-8F, 3.25F, -2F, 0F, 2.75F, -2.5F, 0F, 2.75F, 1.5F, -8F, 3.25F, 2F, -8F, -4.75F, -1.5F, 0F, -4.25F, -2F, 0F, -4.25F, 2F, -8F, -4.75F, 2.5F); // Box 1

		gun_1_Model[0][87].addShapeBox(0F, 0F, 0F, 13, 2, 2, 0F,-8F, 0.75F, -1.5F, 0F, 1.25F, -2F, 0F, 1.25F, 2F, -8F, 0.75F, 2.5F, -8F, -2.25F, -2F, 0F, -2.75F, -2.5F, 0F, -2.75F, 1.5F, -8F, -2.25F, 2F); // Box 2

		gun_1_Model[0][88].addShapeBox(0F, 0F, 0F, 13, 2, 2, 0F,-8F, 0.875F, -1.5F, 0F, 1.375F, -1.5F, 0F, 1.375F, 2F, -8F, 0.875F, 2.5F, -8F, -2.25F, -1.5F, 0F, -2.75F, -1.5F, 0F, -2.75F, 1.5F, -8F, -2.25F, 2F); // Box 3

		gun_1_Model[0][89].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 1.25F, -0.875F, -4.75F, -0.125F, -0.875F, -4.75F, -0.125F, -0.5F, 0F, 1.25F, -0.5F, 0F, 0.25F, -0.875F, -4.75F, -0.875F, -0.875F, -4.75F, -0.875F, -0.5F, 0F, 0.25F, -0.5F); // Box 5

		gun_1_Model[0][90].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 1.25F, 1.5F, -4.75F, -0.125F, 1.5F, -4.75F, -0.125F, -2.875F, 0F, 1.25F, -2.875F, 0F, 0.25F, 1.5F, -4.75F, -0.875F, 1.5F, -4.75F, -0.875F, -2.875F, 0F, 0.25F, -2.875F); // Box 6

		gun_1_Model[0][91].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.375F, -0.125F, 3.75F, -0.625F, -0.125F, 3.75F, -0.625F, -0.125F, 2.75F, 0.375F, -0.125F, 2.75F, 0.125F, -0.625F, 3.75F, -0.875F, -0.625F, 3.75F, -0.875F, -0.625F, 2.75F, 0.125F, -0.625F, 2.75F); // Box 9

		gun_1_Model[0][92].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.375F, 0.125F, 3.75F, -0.625F, 0.125F, 3.75F, -0.625F, 0.125F, 2.75F, 0.375F, 0.125F, 2.75F, 0.375F, -0.875F, 3.75F, -0.625F, -0.875F, 3.75F, -0.625F, -0.875F, 2.75F, 0.375F, -0.875F, 2.75F); // Box 10

		gun_1_Model[0][93].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.125F, 0.375F, 3.75F, -0.875F, 0.375F, 3.75F, -0.875F, 0.375F, 2.75F, 0.125F, 0.375F, 2.75F, 0.375F, -1.125F, 3.75F, -0.625F, -1.125F, 3.75F, -0.625F, -1.125F, 2.75F, 0.375F, -1.125F, 2.75F); // Box 11

		gun_1_Model[0][94].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 1F, 1.5F, -4.75F, -0.125F, 1.5F, -4.75F, -0.125F, -0.5F, 0F, 1F, -0.5F, 0F, 0.25F, 1.5F, -4.75F, -0.875F, 1.5F, -4.75F, -0.875F, -0.5F, 0F, 0.25F, -0.5F); // Box 12

		gun_1_Model[0][95].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,-3.575F, 2.65F, 1.85F, -2.025F, 2.5F, 1.85F, -2.025F, 2.5F, -3.65F, -3.575F, 2.65F, -3.65F, -2.775F, 0.25F, 1.85F, -2.775F, 0.5F, 1.85F, -2.775F, 0.5F, -3.65F, -2.775F, 0.25F, -3.65F); // Box 13

		gun_1_Model[0][96].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,-3.675F, 2.6F, 1.975F, -2.125F, 2.52F, 1.975F, -2.025F, 2.5F, -3.85F, -3.575F, 2.65F, -3.85F, -2.875F, 0.25F, 1.975F, -2.875F, 0.5F, 1.975F, -2.775F, 0.5F, -3.85F, -2.775F, 0.25F, -3.85F); // Box 14

		gun_1_Model[0][97].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,-3.575F, 2.65F, 1.65F, -2.025F, 2.5F, 1.65F, -2.125F, 2.52F, -3.525F, -3.675F, 2.6F, -3.525F, -2.775F, 0.25F, 1.65F, -2.775F, 0.5F, 1.65F, -2.875F, 0.5F, -3.525F, -2.875F, 0.25F, -3.525F); // Box 15

		gun_1_Model[0][98].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,1.25F, 0.5F, -1.5F, -1.75F, -0.125F, -1F, -1.75F, -0.125F, -0.5F, 1.25F, 0.5F, 0F, 1.25F, -2.25F, -1.5F, -1.75F, -1.625F, -1F, -1.75F, -1.625F, -0.5F, 1.25F, -2.25F, 0F); // Box 25

		gun_1_Model[0][99].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-4.125F, -1.75F, 1.75F, 3.375F, -1.75F, 1.75F, 3.375F, -1.75F, -0.25F, -4.125F, -1.75F, -0.25F, -4.075F, 1.25F, 1.75F, 3.325F, 1.25F, 1.75F, 3.325F, 1.25F, -0.25F, -4.075F, 1.25F, -0.25F); // Box 27

		gun_1_Model[0][100].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,1.25F, -1.5F, -1.5F, -1.75F, -0.875F, -1F, -1.75F, -0.875F, -0.5F, 1.25F, -1.5F, 0F, 1.25F, -0.25F, -1.5F, -1.75F, -0.875F, -1F, -1.75F, -0.875F, -0.5F, 1.25F, -0.25F, 0F); // Box 28

		gun_1_Model[0][101].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,1.25F, 0.5F, 2F, -1.75F, -0.125F, 1.5F, -1.75F, -0.125F, -3F, 1.25F, 0.5F, -3.5F, 1.25F, -2.25F, 2F, -1.75F, -1.625F, 1.5F, -1.75F, -1.625F, -3F, 1.25F, -2.25F, -3.5F); // Box 29

		gun_1_Model[0][102].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,1.25F, -1.5F, 2F, -1.75F, -0.875F, 1.5F, -1.75F, -0.875F, -3F, 1.25F, -1.5F, -3.5F, 1.25F, -0.25F, 2F, -1.75F, -0.875F, 1.5F, -1.75F, -0.875F, -3F, 1.25F, -0.25F, -3.5F); // Box 29

		gun_1_Model[0][103].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,2.5F, 0.375F, -2F, -3F, 0.325F, -1.95F, -3.125F, 0.325F, 0.125F, 2.375F, 0.375F, 0.125F, 2.5F, -0.375F, -2F, -3F, -0.425F, -1.95F, -3.125F, -0.425F, 0.125F, 2.375F, -0.375F, 0.125F); // Box 31

		gun_1_Model[0][104].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,2.5F, 0.625F, -1.625F, -2.25F, 0.5F, -1.5F, -2.25F, 0.5F, 0F, 2.5F, 0.625F, 0.125F, 2.5F, -2.375F, -1.625F, -2.25F, -2.25F, -1.5F, -2.25F, -2.25F, 0F, 2.5F, -2.375F, 0.125F); // Box 32

		gun_1_Model[0][105].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,2.5F, 0.625F, 2.125F, -2.25F, 0.5F, 2F, -2.25F, 0.5F, -3.5F, 2.5F, 0.625F, -3.625F, 2.5F, -2.375F, 2.125F, -2.25F, -2.25F, 2F, -2.25F, -2.25F, -3.5F, 2.5F, -2.375F, -3.625F); // Box 33

		gun_1_Model[0][106].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,2.5F, -1.625F, -1.625F, -2.25F, -1.5F, -1.5F, -2.25F, -1.5F, 0F, 2.5F, -1.625F, 0.125F, 2.5F, -0.125F, -1.625F, -2.25F, -0.25F, -1.5F, -2.25F, -0.25F, 0F, 2.5F, -0.125F, 0.125F); // Box 34

		gun_1_Model[0][107].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,2.5F, -1.625F, 2.125F, -2.25F, -1.5F, 2F, -2.25F, -1.5F, -3.5F, 2.5F, -1.625F, -3.625F, 2.5F, -0.125F, 2.125F, -2.25F, -0.25F, 2F, -2.25F, -0.25F, -3.5F, 2.5F, -0.125F, -3.625F); // Box 35

		gun_1_Model[0][108].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,2.5F, 0.375F, -1.75F, -3F, 0.325F, -1.7F, -3F, 0.325F, 0F, 2.5F, 0.375F, 0F, 2.5F, -0.375F, -1.75F, -3F, -0.425F, -1.7F, -3F, -0.425F, 0F, 2.5F, -0.375F, 0F); // Box 36

		gun_1_Model[0][109].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,2.375F, 0.375F, -1.625F, -3.125F, 0.325F, -1.575F, -3F, 0.325F, -0.25F, 2.5F, 0.375F, -0.25F, 2.375F, -0.375F, -1.625F, -3.125F, -0.425F, -1.575F, -3F, -0.425F, -0.25F, 2.5F, -0.375F, -0.25F); // Box 37

		gun_1_Model[0][110].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,2.375F, 0.375F, 2.125F, -3.125F, 0.325F, 2.125F, -3F, 0.325F, -3.95F, 2.5F, 0.375F, -4F, 2.375F, -0.375F, 2.125F, -3.125F, -0.425F, 2.125F, -3F, -0.425F, -3.95F, 2.5F, -0.375F, -4F); // Box 38

		gun_1_Model[0][111].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,2.5F, 0.375F, 2F, -3F, 0.325F, 2F, -3F, 0.325F, -3.7F, 2.5F, 0.375F, -3.75F, 2.5F, -0.375F, 2F, -3F, -0.425F, 2F, -3F, -0.425F, -3.7F, 2.5F, -0.375F, -3.75F); // Box 38

		gun_1_Model[0][112].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,2.5F, 0.375F, 1.75F, -3F, 0.325F, 1.75F, -3.125F, 0.325F, -3.575F, 2.375F, 0.375F, -3.625F, 2.5F, -0.375F, 1.75F, -3F, -0.425F, 1.75F, -3.125F, -0.425F, -3.575F, 2.375F, -0.375F, -3.625F); // Box 38

		gun_1_Model[0][113].addShapeBox(0F, 0F, 0F, 14, 2, 2, 0F,-9.25F, 1.75F, 1.5F, -0.5F, 1.75F, 1.5F, -0.5F, 1.75F, -0.5F, -9.25F, 1.75F, -0.5F, -9.25F, 0.25F, 1.5F, -0.5F, 0.25F, 1.5F, -0.5F, 0.25F, -0.5F, -9.25F, 0.25F, -0.5F); // Box 0

		gun_1_Model[0][114].addShapeBox(0F, 0F, 0F, 14, 2, 2, 0F,-9.25F, 2.25F, -0.875F, -0.5F, 2.25F, -0.875F, -0.5F, 2.25F, -0.5F, -9.25F, 2.25F, -0.5F, -9.25F, 0.25F, -0.875F, -0.5F, 0.25F, -0.875F, -0.5F, 0.25F, -0.5F, -9.25F, 0.25F, -0.5F); // Box 1

		gun_1_Model[0][115].addShapeBox(0F, 0F, 0F, 14, 2, 2, 0F,-13.5F, 1.75F, 1.5F, 0F, 1.5F, 1.5F, 0F, 1.5F, -0.5F, -13.5F, 1.75F, -0.5F, -13.5F, 0.25F, 1.5F, 0F, -0.25F, 1.5F, 0F, -0.25F, -0.5F, -13.5F, 0.25F, -0.5F); // Box 2

		gun_1_Model[0][116].addShapeBox(0F, 0F, 0F, 14, 2, 2, 0F,-13.5F, 2.25F, 1.5F, 0F, 1.5F, 1.5F, 0F, 1.5F, -2.875F, -13.5F, 2.25F, -2.875F, -13.5F, 0.25F, 1.5F, 0F, -0.25F, 1.5F, 0F, -0.25F, -2.875F, -13.5F, 0.25F, -2.875F); // Box 3

		gun_1_Model[0][117].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,-12.25F, 2.125F, 0.25F, 6.5F, 2.25F, 0.25F, 6.5F, 2.25F, -0.75F, -12.25F, 2.125F, -0.75F, -10F, -1.875F, 0.25F, 6.5F, -1F, 0.25F, 6.5F, -1F, -0.75F, -10F, -1.875F, -0.75F); // Box 4

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_1_Model[0])
		{
			gunPart.setRotationPoint(-65F, -43F, 0F);
		}


		gun_1_Model[1] = new ModelRendererTurbo[0];

		gun_1_Model[2] = new ModelRendererTurbo[12];
		gun_1_Model[2][0] = new ModelRendererTurbo(this, 759, 278, textureX, textureY); // Box 8
		gun_1_Model[2][1] = new ModelRendererTurbo(this, 775, 278, textureX, textureY); // Box 13
		gun_1_Model[2][2] = new ModelRendererTurbo(this, 791, 278, textureX, textureY); // Box 15
		gun_1_Model[2][3] = new ModelRendererTurbo(this, 807, 278, textureX, textureY); // Box 16
		gun_1_Model[2][4] = new ModelRendererTurbo(this, 823, 278, textureX, textureY); // Box 17
		gun_1_Model[2][5] = new ModelRendererTurbo(this, 839, 278, textureX, textureY); // Box 18
		gun_1_Model[2][6] = new ModelRendererTurbo(this, 855, 278, textureX, textureY); // Box 19
		gun_1_Model[2][7] = new ModelRendererTurbo(this, 871, 278, textureX, textureY); // Box 19
		gun_1_Model[2][8] = new ModelRendererTurbo(this, 887, 278, textureX, textureY); // Box 19
		gun_1_Model[2][9] = new ModelRendererTurbo(this, 903, 278, textureX, textureY); // Box 19
		gun_1_Model[2][10] = new ModelRendererTurbo(this, 919, 278, textureX, textureY); // Box 19
		gun_1_Model[2][11] = new ModelRendererTurbo(this, 935, 278, textureX, textureY); // Box 19

		gun_1_Model[2][0].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-2.5F, -4F, 1.75F, -1.25F, -3.5F, 1.75F, -1.25F, -3.5F, -2.5F, -2.5F, -4F, -2.5F, -2.5F, 3.25F, 1.75F, -1.25F, 2.75F, 1.75F, -1.25F, 2.75F, -2.5F, -2.5F, 3.25F, -2.5F); // Box 8

		gun_1_Model[2][1].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -4.75F, 1.75F, -2.5F, -4F, 1.75F, -2.5F, -4F, -2.5F, 0F, -4.75F, -2.5F, 0F, 4F, 1.75F, -2.5F, 3.25F, 1.75F, -2.5F, 3.25F, -2.5F, 0F, 4F, -2.5F); // Box 13

		gun_1_Model[2][2].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-4F, -2.5F, 1.75F, -0.75F, -2.5F, 1.75F, -0.75F, -2.5F, -2.5F, -4F, -2.5F, -2.5F, -3.5F, 2.75F, 1.75F, -1.25F, 2.75F, 1.75F, -1.25F, 2.75F, -2.5F, -3.5F, 2.75F, -2.5F); // Box 15

		gun_1_Model[2][3].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,2.5F, -4F, 1.75F, -5F, -4.75F, 1.75F, -5F, -4.75F, -2.5F, 2.5F, -4F, -2.5F, 2.5F, 3.25F, 1.75F, -5F, 4F, 1.75F, -5F, 4F, -2.5F, 2.5F, 3.25F, -2.5F); // Box 16

		gun_1_Model[2][4].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,3.75F, -3.5F, 1.75F, -7.5F, -4F, 1.75F, -7.5F, -4F, -2.5F, 3.75F, -3.5F, -2.5F, 3.75F, 2.75F, 1.75F, -7.5F, 3.25F, 1.75F, -7.5F, 3.25F, -2.5F, 3.75F, 2.75F, -2.5F); // Box 17

		gun_1_Model[2][5].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-4.075F, -2.25F, 1.75F, -0.675F, -2.25F, 1.75F, -0.675F, -2.25F, -2.5F, -4.125F, -2.25F, -2.5F, -4F, 1.5F, 1.75F, -0.75F, 1.5F, 1.75F, -0.75F, 1.5F, -2.5F, -4F, 1.5F, -2.5F); // Box 18

		gun_1_Model[2][6].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-2.5F, -4F, -1.5F, -1.25F, -3.5F, -1.5F, -1.25F, -3.5F, 0.75F, -2.5F, -4F, 0.75F, -2.5F, 3.25F, -1.5F, -1.25F, 2.75F, -1.5F, -1.25F, 2.75F, 0.75F, -2.5F, 3.25F, 0.75F); // Box 19

		gun_1_Model[2][7].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -4.75F, -1.5F, -2.5F, -4F, -1.5F, -2.5F, -4F, 0.75F, 0F, -4.75F, 0.75F, 0F, 4F, -1.5F, -2.5F, 3.25F, -1.5F, -2.5F, 3.25F, 0.75F, 0F, 4F, 0.75F); // Box 19

		gun_1_Model[2][8].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-4F, -2.5F, -1.5F, -0.75F, -2.5F, -1.5F, -0.75F, -2.5F, 0.75F, -4F, -2.5F, 0.75F, -3.5F, 2.75F, -1.5F, -1.25F, 2.75F, -1.5F, -1.25F, 2.75F, 0.75F, -3.5F, 2.75F, 0.75F); // Box 19

		gun_1_Model[2][9].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,2.5F, -4F, -1.5F, -5F, -4.75F, -1.5F, -5F, -4.75F, 0.75F, 2.5F, -4F, 0.75F, 2.5F, 3.25F, -1.5F, -5F, 4F, -1.5F, -5F, 4F, 0.75F, 2.5F, 3.25F, 0.75F); // Box 19

		gun_1_Model[2][10].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,3.75F, -3.5F, -1.5F, -7.5F, -4F, -1.5F, -7.5F, -4F, 0.75F, 3.75F, -3.5F, 0.75F, 3.75F, 2.75F, -1.5F, -7.5F, 3.25F, -1.5F, -7.5F, 3.25F, 0.75F, 3.75F, 2.75F, 0.75F); // Box 19

		gun_1_Model[2][11].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-4.125F, -2.25F, -1.5F, -0.675F, -2.25F, -1.5F, -0.675F, -2.25F, 0.75F, -4.075F, -2.25F, 0.75F, -4F, 1.5F, -1.5F, -0.75F, 1.5F, -1.5F, -0.75F, 1.5F, 0.75F, -4F, 1.5F, 0.75F); // Box 19

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_1_Model[2])
		{
			gunPart.setRotationPoint(-65F, -43F, 0F);
		}


		registerGunModel("FrontGun", gun_1_Model);

		// Passenger 3
		ModelRendererTurbo[][] gun_2_Model = new ModelRendererTurbo[3][];

		gun_2_Model[0] = new ModelRendererTurbo[4];
		gun_2_Model[0][0] = new ModelRendererTurbo(this, 201, 355, textureX, textureY); // Box 0
		gun_2_Model[0][1] = new ModelRendererTurbo(this, 217, 355, textureX, textureY); // Box 0
		gun_2_Model[0][2] = new ModelRendererTurbo(this, 321, 347, textureX, textureY); // Box 0
		gun_2_Model[0][3] = new ModelRendererTurbo(this, 233, 355, textureX, textureY); // Box 35

		gun_2_Model[0][0].addShapeBox(-0.5F, -0.5F, -1.5F, 1, 1, 3, 0F,-0.25F, -0.25F, -0.1F, -0.25F, -0.25F, -0.1F, -0.25F, -0.25F, -0.1F, -0.25F, -0.25F, -0.1F, -0.25F, -0.25F, -0.1F, -0.25F, -0.25F, -0.1F, -0.25F, -0.25F, -0.1F, -0.25F, -0.25F, -0.1F); // Box 0

		gun_2_Model[0][1].addShapeBox(-1F, 0.5F, -1.5F, 2, 1, 3, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0

		gun_2_Model[0][2].addShapeBox(-1F, -0.5F, -1.5F, 2, 2, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.8F, -0.5F, 0F, -0.8F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.8F); // Box 0

		gun_2_Model[0][3].addShapeBox(-1F, -0.5F, 0.5F, 2, 2, 1, 0F,-0.5F, 0F, -0.8F, -0.5F, 0F, -0.8F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 35

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[0])
		{
			gunPart.setRotationPoint(38F, -64F, 0F);
		}


		gun_2_Model[1] = new ModelRendererTurbo[2];
		gun_2_Model[1][0] = new ModelRendererTurbo(this, 265, 331, textureX, textureY); // Box 0
		gun_2_Model[1][1] = new ModelRendererTurbo(this, 201, 339, textureX, textureY); // Box 0

		gun_2_Model[1][0].addShapeBox(2F, -0.5F, -0.5F, 15, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 0

		gun_2_Model[1][1].addShapeBox(2F, -0.5F, -0.5F, 5, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 0

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[1])
		{
			gunPart.setRotationPoint(38F, -64F, 0F);
		}


		gun_2_Model[2] = new ModelRendererTurbo[29];
		gun_2_Model[2][0] = new ModelRendererTurbo(this, 201, 331, textureX, textureY); // Box 0
		gun_2_Model[2][1] = new ModelRendererTurbo(this, 233, 331, textureX, textureY); // Box 0
		gun_2_Model[2][2] = new ModelRendererTurbo(this, 305, 331, textureX, textureY); // Box 0
		gun_2_Model[2][3] = new ModelRendererTurbo(this, 321, 331, textureX, textureY); // Box 0
		gun_2_Model[2][4] = new ModelRendererTurbo(this, 217, 339, textureX, textureY); // Box 0
		gun_2_Model[2][5] = new ModelRendererTurbo(this, 225, 339, textureX, textureY); // Box 0
		gun_2_Model[2][6] = new ModelRendererTurbo(this, 233, 339, textureX, textureY); // Box 0
		gun_2_Model[2][7] = new ModelRendererTurbo(this, 241, 339, textureX, textureY); // Box 0
		gun_2_Model[2][8] = new ModelRendererTurbo(this, 249, 339, textureX, textureY); // Box 0
		gun_2_Model[2][9] = new ModelRendererTurbo(this, 257, 331, textureX, textureY); // Box 0
		gun_2_Model[2][10] = new ModelRendererTurbo(this, 297, 331, textureX, textureY); // Box 0
		gun_2_Model[2][11] = new ModelRendererTurbo(this, 257, 339, textureX, textureY); // Box 0
		gun_2_Model[2][12] = new ModelRendererTurbo(this, 273, 339, textureX, textureY); // Box 0
		gun_2_Model[2][13] = new ModelRendererTurbo(this, 289, 339, textureX, textureY); // Box 0
		gun_2_Model[2][14] = new ModelRendererTurbo(this, 265, 339, textureX, textureY); // Box 0
		gun_2_Model[2][15] = new ModelRendererTurbo(this, 281, 339, textureX, textureY); // Box 0
		gun_2_Model[2][16] = new ModelRendererTurbo(this, 297, 339, textureX, textureY); // Box 0
		gun_2_Model[2][17] = new ModelRendererTurbo(this, 305, 339, textureX, textureY); // Box 0
		gun_2_Model[2][18] = new ModelRendererTurbo(this, 201, 347, textureX, textureY); // Box 0
		gun_2_Model[2][19] = new ModelRendererTurbo(this, 313, 339, textureX, textureY); // Box 0
		gun_2_Model[2][20] = new ModelRendererTurbo(this, 321, 339, textureX, textureY); // Box 0
		gun_2_Model[2][21] = new ModelRendererTurbo(this, 209, 347, textureX, textureY); // Box 0
		gun_2_Model[2][22] = new ModelRendererTurbo(this, 217, 347, textureX, textureY); // Box 0
		gun_2_Model[2][23] = new ModelRendererTurbo(this, 233, 347, textureX, textureY); // Box 0
		gun_2_Model[2][24] = new ModelRendererTurbo(this, 249, 347, textureX, textureY); // Box 0
		gun_2_Model[2][25] = new ModelRendererTurbo(this, 273, 347, textureX, textureY); // Box 0
		gun_2_Model[2][26] = new ModelRendererTurbo(this, 289, 347, textureX, textureY); // Box 0
		gun_2_Model[2][27] = new ModelRendererTurbo(this, 297, 347, textureX, textureY); // Box 0
		gun_2_Model[2][28] = new ModelRendererTurbo(this, 305, 347, textureX, textureY); // Box 0

		gun_2_Model[2][0].addShapeBox(-6F, -1.5F, -1F, 8, 2, 2, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 0

		gun_2_Model[2][1].addShapeBox(2F, -1.5F, -0.5F, 11, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 0

		gun_2_Model[2][2].addShapeBox(2F, -1.5F, -0.5F, 5, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 0

		gun_2_Model[2][3].addShapeBox(6.5F, -1.5F, -0.5F, 1, 1, 1, 0F,0F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 0

		gun_2_Model[2][4].addShapeBox(6.5F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 0

		gun_2_Model[2][5].addShapeBox(12.01F, -1.5F, -0.5F, 1, 2, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 0

		gun_2_Model[2][6].addShapeBox(12.5F, -1.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 0

		gun_2_Model[2][7].addShapeBox(-0.5F, -0.5F, -1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 0

		gun_2_Model[2][8].addShapeBox(-7F, -1F, -0.5F, 1, 1, 1, 0F,-0.4F, -0.3F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -0.3F, -0.3F); // Box 0

		gun_2_Model[2][9].addShapeBox(-6F, -1.5F, -1.5F, 1, 1, 3, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 0

		gun_2_Model[2][10].addShapeBox(-8F, -1.5F, -1.5F, 2, 1, 3, 0F,0F, 0F, -2.75F, 0F, 0F, -2.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -2.75F, 0F, -0.75F, -2.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 0

		gun_2_Model[2][11].addShapeBox(-8F, 1.5F, -1.5F, 2, 1, 3, 0F,0F, 0F, -2.75F, 0F, 0F, -2.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -2.75F, 0F, -0.75F, -2.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 0

		gun_2_Model[2][12].addShapeBox(-6F, 1.5F, -1.5F, 1, 1, 3, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 0

		gun_2_Model[2][13].addShapeBox(-6F, 0.5F, -1F, 1, 1, 2, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.75F, 0F, -0.2F, -0.75F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 0

		gun_2_Model[2][14].addShapeBox(-8.25F, -1.25F, 0.75F, 1, 1, 1, 0F,-0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 0

		gun_2_Model[2][15].addShapeBox(-8.25F, 0.75F, 0.75F, 1, 1, 1, 0F,0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Box 0

		gun_2_Model[2][16].addShapeBox(-8.25F, -0.25F, 0.75F, 1, 1, 1, 0F,0F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 0

		gun_2_Model[2][17].addShapeBox(-8F, -1.5F, -1.5F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.75F, 0F, 0F, -2.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -2.75F, 0F, -0.75F, -2.75F); // Box 0

		gun_2_Model[2][18].addShapeBox(-8F, 1.5F, -1.5F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.75F, 0F, 0F, -2.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -2.75F, 0F, -0.75F, -2.75F); // Box 0

		gun_2_Model[2][19].addShapeBox(-8.25F, -1.25F, -1.75F, 1, 1, 1, 0F,-0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 0

		gun_2_Model[2][20].addShapeBox(-8.25F, 0.75F, -1.75F, 1, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F); // Box 0

		gun_2_Model[2][21].addShapeBox(-8.25F, -0.25F, -1.75F, 1, 1, 1, 0F,0F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 0

		gun_2_Model[2][22].addShapeBox(-3F, -1.5F, -1.8F, 2, 2, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.1F, -0.8F, -0.2F, -0.1F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0

		gun_2_Model[2][23].addShapeBox(-5.5F, -1F, -1F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0

		gun_2_Model[2][24].addShapeBox(-5F, -1.6F, -0.5F, 5, 2, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 0

		gun_2_Model[2][25].addShapeBox(-5F, -2.6F, -0.5F, 4, 1, 1, 0F,0F, -0.9F, -0.2F, 0F, -0.9F, 0.6F, 0F, -0.9F, -1F, 0F, -0.9F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.6F, 0F, 0F, -1F, 0F, 0F, -0.2F); // Box 0

		gun_2_Model[2][26].addShapeBox(-3.5F, -1.5F, -1.8F, 1, 2, 1, 0F,0F, -0.2F, 0F, -0.6F, -0.2F, 0F, -0.6F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.6F, -0.2F, 0F, -0.6F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 0

		gun_2_Model[2][27].addShapeBox(-0.95F, -3.5F, -2.45F, 1, 2, 1, 0F,0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.2F, 0F, -0.6F, -0.2F, 0F, -0.6F, -0.2F, -0.6F, 0F, -0.2F, -0.6F); // Box 0

		gun_2_Model[2][28].addShapeBox(-1.5F, -2.6F, -3F, 1, 1, 3, 0F,-0.5F, -0.9F, -0.5F, 0F, -0.9F, -0.5F, 0F, -0.9F, 0F, -0.5F, -0.9F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 0

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[2])
		{
			gunPart.setRotationPoint(38F, -64F, 0F);
		}


		registerGunModel("RearGun", gun_2_Model);
	}
}