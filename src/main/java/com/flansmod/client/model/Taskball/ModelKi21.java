//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Ki21
// Model Creator: 
// Created on: 29.05.2023 - 00:05:10
// Last changed on: 29.05.2023 - 00:05:10

package com.flansmod.client.model.Taskball; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelKi21 extends ModelPlane //Same as Filename
{
	int textureX = 2048;
	int textureY = 1024;

	public ModelKi21() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[345];
		leftWingModel = new ModelRendererTurbo[32];
		tailWheelModel = new ModelRendererTurbo[8];
		leftWingWheelModel = new ModelRendererTurbo[10];
		rightWingWheelModel = new ModelRendererTurbo[10];
		helicopterModeParts = new ModelRendererTurbo[31];
		planeModeParts = new ModelRendererTurbo[25];

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
		bodyModel[1] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 633, 1, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 785, 1, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 889, 1, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 969, 1, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 10
		bodyModel[11] = new ModelRendererTurbo(this, 1081, 1, textureX, textureY); // Box 12
		bodyModel[12] = new ModelRendererTurbo(this, 1217, 1, textureX, textureY); // Box 13
		bodyModel[13] = new ModelRendererTurbo(this, 1337, 1, textureX, textureY); // Box 14
		bodyModel[14] = new ModelRendererTurbo(this, 1529, 1, textureX, textureY); // Box 15
		bodyModel[15] = new ModelRendererTurbo(this, 1665, 1, textureX, textureY); // Box 16
		bodyModel[16] = new ModelRendererTurbo(this, 1785, 1, textureX, textureY); // Box 17
		bodyModel[17] = new ModelRendererTurbo(this, 0, 485, textureX, textureY); // Box 18
		bodyModel[18] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 19
		bodyModel[19] = new ModelRendererTurbo(this, 889, 25, textureX, textureY); // Box 20
		bodyModel[20] = new ModelRendererTurbo(this, 140, 485, textureX, textureY); // Box 21
		bodyModel[21] = new ModelRendererTurbo(this, 284, 485, textureX, textureY); // Box 22
		bodyModel[22] = new ModelRendererTurbo(this, 1961, 1, textureX, textureY); // Box 23
		bodyModel[23] = new ModelRendererTurbo(this, 1785, 25, textureX, textureY); // Box 24
		bodyModel[24] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 25
		bodyModel[25] = new ModelRendererTurbo(this, 1009, 33, textureX, textureY); // Box 26
		bodyModel[26] = new ModelRendererTurbo(this, 1209, 33, textureX, textureY); // Box 27
		bodyModel[27] = new ModelRendererTurbo(this, 337, 41, textureX, textureY); // Box 28
		bodyModel[28] = new ModelRendererTurbo(this, 777, 49, textureX, textureY); // Box 29
		bodyModel[29] = new ModelRendererTurbo(this, 1641, 49, textureX, textureY); // Box 30
		bodyModel[30] = new ModelRendererTurbo(this, 307, 413, textureX, textureY); // Box 31
		bodyModel[31] = new ModelRendererTurbo(this, 173, 413, textureX, textureY); // Box 32
		bodyModel[32] = new ModelRendererTurbo(this, 424, 413, textureX, textureY); // Box 33
		bodyModel[33] = new ModelRendererTurbo(this, 539, 413, textureX, textureY); // Box 34
		bodyModel[34] = new ModelRendererTurbo(this, 1985, 33, textureX, textureY); // Box 35
		bodyModel[35] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 36
		bodyModel[36] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 37
		bodyModel[37] = new ModelRendererTurbo(this, 664, 413, textureX, textureY); // Box 38
		bodyModel[38] = new ModelRendererTurbo(this, 376, 413, textureX, textureY); // Box 39
		bodyModel[39] = new ModelRendererTurbo(this, 486, 413, textureX, textureY); // Box 40
		bodyModel[40] = new ModelRendererTurbo(this, 610, 413, textureX, textureY); // Box 41
		bodyModel[41] = new ModelRendererTurbo(this, 250, 413, textureX, textureY); // Box 42
		bodyModel[42] = new ModelRendererTurbo(this, 114, 413, textureX, textureY); // Box 43
		bodyModel[43] = new ModelRendererTurbo(this, 1761, 49, textureX, textureY); // Box 44
		bodyModel[44] = new ModelRendererTurbo(this, 905, 49, textureX, textureY); // Box 45
		bodyModel[45] = new ModelRendererTurbo(this, 265, 57, textureX, textureY); // Box 46
		bodyModel[46] = new ModelRendererTurbo(this, 305, 57, textureX, textureY); // Box 47
		bodyModel[47] = new ModelRendererTurbo(this, 929, 57, textureX, textureY); // Box 48
		bodyModel[48] = new ModelRendererTurbo(this, 1265, 57, textureX, textureY); // Box 49
		bodyModel[49] = new ModelRendererTurbo(this, 1961, 49, textureX, textureY); // Box 50
		bodyModel[50] = new ModelRendererTurbo(this, 385, 57, textureX, textureY); // Box 51
		bodyModel[51] = new ModelRendererTurbo(this, 553, 57, textureX, textureY); // Box 52
		bodyModel[52] = new ModelRendererTurbo(this, 1113, 97, textureX, textureY); // Box 102
		bodyModel[53] = new ModelRendererTurbo(this, 41, 105, textureX, textureY); // Box 103
		bodyModel[54] = new ModelRendererTurbo(this, 553, 105, textureX, textureY); // Box 104
		bodyModel[55] = new ModelRendererTurbo(this, 1329, 57, textureX, textureY); // Box 105
		bodyModel[56] = new ModelRendererTurbo(this, 2009, 49, textureX, textureY); // Box 106
		bodyModel[57] = new ModelRendererTurbo(this, 1569, 57, textureX, textureY); // Box 107
		bodyModel[58] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 108
		bodyModel[59] = new ModelRendererTurbo(this, 881, 73, textureX, textureY); // Box 109
		bodyModel[60] = new ModelRendererTurbo(this, 129, 105, textureX, textureY); // Box 110
		bodyModel[61] = new ModelRendererTurbo(this, 1377, 57, textureX, textureY); // Box 111
		bodyModel[62] = new ModelRendererTurbo(this, 1361, 73, textureX, textureY); // Box 112
		bodyModel[63] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 113
		bodyModel[64] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 81
		bodyModel[65] = new ModelRendererTurbo(this, 905, 17, textureX, textureY); // Box 82
		bodyModel[66] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 83
		bodyModel[67] = new ModelRendererTurbo(this, 1065, 1, textureX, textureY); // Box 84
		bodyModel[68] = new ModelRendererTurbo(this, 1081, 1, textureX, textureY); // Box 85
		bodyModel[69] = new ModelRendererTurbo(this, 1089, 1, textureX, textureY); // Box 86
		bodyModel[70] = new ModelRendererTurbo(this, 1201, 1, textureX, textureY); // Box 87
		bodyModel[71] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 88
		bodyModel[72] = new ModelRendererTurbo(this, 1217, 1, textureX, textureY); // Box 89
		bodyModel[73] = new ModelRendererTurbo(this, 1321, 1, textureX, textureY); // Box 90
		bodyModel[74] = new ModelRendererTurbo(this, 1073, 1, textureX, textureY); // Box 91
		bodyModel[75] = new ModelRendererTurbo(this, 1225, 1, textureX, textureY); // Box 92
		bodyModel[76] = new ModelRendererTurbo(this, 1337, 1, textureX, textureY); // Box 93
		bodyModel[77] = new ModelRendererTurbo(this, 1209, 1, textureX, textureY); // Box 94
		bodyModel[78] = new ModelRendererTurbo(this, 1513, 1, textureX, textureY); // Box 95
		bodyModel[79] = new ModelRendererTurbo(this, 1521, 1, textureX, textureY); // Box 96
		bodyModel[80] = new ModelRendererTurbo(this, 1329, 1, textureX, textureY); // Box 97
		bodyModel[81] = new ModelRendererTurbo(this, 1009, 25, textureX, textureY); // Box 98
		bodyModel[82] = new ModelRendererTurbo(this, 1649, 1, textureX, textureY); // Box 99
		bodyModel[83] = new ModelRendererTurbo(this, 1345, 1, textureX, textureY); // Box 100
		bodyModel[84] = new ModelRendererTurbo(this, 1665, 1, textureX, textureY); // Box 101
		bodyModel[85] = new ModelRendererTurbo(this, 1769, 1, textureX, textureY); // Box 102
		bodyModel[86] = new ModelRendererTurbo(this, 1529, 1, textureX, textureY); // Box 103
		bodyModel[87] = new ModelRendererTurbo(this, 1065, 9, textureX, textureY); // Box 104
		bodyModel[88] = new ModelRendererTurbo(this, 1081, 9, textureX, textureY); // Box 105
		bodyModel[89] = new ModelRendererTurbo(this, 1961, 73, textureX, textureY); // Box 106
		bodyModel[90] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Box 107
		bodyModel[91] = new ModelRendererTurbo(this, 1009, 81, textureX, textureY); // Box 108
		bodyModel[92] = new ModelRendererTurbo(this, 1793, 1, textureX, textureY); // Box 109
		bodyModel[93] = new ModelRendererTurbo(this, 1201, 9, textureX, textureY); // Box 110
		bodyModel[94] = new ModelRendererTurbo(this, 1209, 9, textureX, textureY); // Box 111
		bodyModel[95] = new ModelRendererTurbo(this, 1321, 9, textureX, textureY); // Box 112
		bodyModel[96] = new ModelRendererTurbo(this, 1337, 9, textureX, textureY); // Box 113
		bodyModel[97] = new ModelRendererTurbo(this, 649, 17, textureX, textureY); // Box 114
		bodyModel[98] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 115
		bodyModel[99] = new ModelRendererTurbo(this, 1513, 9, textureX, textureY); // Box 116
		bodyModel[100] = new ModelRendererTurbo(this, 657, 17, textureX, textureY); // Box 117
		bodyModel[101] = new ModelRendererTurbo(this, 1521, 9, textureX, textureY); // Box 118
		bodyModel[102] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 119
		bodyModel[103] = new ModelRendererTurbo(this, 1225, 9, textureX, textureY); // Box 79
		bodyModel[104] = new ModelRendererTurbo(this, 1649, 9, textureX, textureY); // Box 78
		bodyModel[105] = new ModelRendererTurbo(this, 1657, 9, textureX, textureY); // Box 122
		bodyModel[106] = new ModelRendererTurbo(this, 1769, 9, textureX, textureY); // Box 123
		bodyModel[107] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 124
		bodyModel[108] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 125
		bodyModel[109] = new ModelRendererTurbo(this, 769, 17, textureX, textureY); // Box 126
		bodyModel[110] = new ModelRendererTurbo(this, 1721, 65, textureX, textureY); // Box 127
		bodyModel[111] = new ModelRendererTurbo(this, 1665, 9, textureX, textureY); // Box 114
		bodyModel[112] = new ModelRendererTurbo(this, 1785, 9, textureX, textureY); // Box 115
		bodyModel[113] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 116
		bodyModel[114] = new ModelRendererTurbo(this, 961, 17, textureX, textureY); // Box 117
		bodyModel[115] = new ModelRendererTurbo(this, 2033, 17, textureX, textureY); // Box 118
		bodyModel[116] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 120
		bodyModel[117] = new ModelRendererTurbo(this, 769, 25, textureX, textureY); // Box 121
		bodyModel[118] = new ModelRendererTurbo(this, 633, 1, textureX, textureY); // Box 122
		bodyModel[119] = new ModelRendererTurbo(this, 1633, 25, textureX, textureY); // Box 123
		bodyModel[120] = new ModelRendererTurbo(this, 1209, 105, textureX, textureY); // Box 137
		bodyModel[121] = new ModelRendererTurbo(this, 1489, 105, textureX, textureY); // Box 138
		bodyModel[122] = new ModelRendererTurbo(this, 217, 105, textureX, textureY); // Box 139
		bodyModel[123] = new ModelRendererTurbo(this, 795, 413, textureX, textureY); // Box 139
		bodyModel[124] = new ModelRendererTurbo(this, 739, 413, textureX, textureY); // Box 140
		bodyModel[125] = new ModelRendererTurbo(this, 45, 413, textureX, textureY); // Box 141
		bodyModel[126] = new ModelRendererTurbo(this, 0, 413, textureX, textureY); // Box 142
		bodyModel[127] = new ModelRendererTurbo(this, 1113, 97, textureX, textureY); // Box 143
		bodyModel[128] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 144
		bodyModel[129] = new ModelRendererTurbo(this, 1721, 81, textureX, textureY); // Box 145
		bodyModel[130] = new ModelRendererTurbo(this, 1593, 113, textureX, textureY); // Box 146
		bodyModel[131] = new ModelRendererTurbo(this, 761, 121, textureX, textureY); // Box 147
		bodyModel[132] = new ModelRendererTurbo(this, 1209, 129, textureX, textureY); // Box 148
		bodyModel[133] = new ModelRendererTurbo(this, 217, 145, textureX, textureY); // Box 149
		bodyModel[134] = new ModelRendererTurbo(this, 1489, 129, textureX, textureY); // Box 150
		bodyModel[135] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 151
		bodyModel[136] = new ModelRendererTurbo(this, 657, 145, textureX, textureY); // Box 152
		bodyModel[137] = new ModelRendererTurbo(this, 857, 33, textureX, textureY); // Box 153
		bodyModel[138] = new ModelRendererTurbo(this, 865, 145, textureX, textureY); // Box 155
		bodyModel[139] = new ModelRendererTurbo(this, 1593, 145, textureX, textureY); // Box 156
		bodyModel[140] = new ModelRendererTurbo(this, 1785, 145, textureX, textureY); // Box 157
		bodyModel[141] = new ModelRendererTurbo(this, 1921, 145, textureX, textureY); // Box 158
		bodyModel[142] = new ModelRendererTurbo(this, 201, 161, textureX, textureY); // Box 159
		bodyModel[143] = new ModelRendererTurbo(this, 0, 443, textureX, textureY); // Box 160
		bodyModel[144] = new ModelRendererTurbo(this, 1265, 169, textureX, textureY); // Box 161
		bodyModel[145] = new ModelRendererTurbo(this, 1777, 169, textureX, textureY); // Box 162
		bodyModel[146] = new ModelRendererTurbo(this, 140, 443, textureX, textureY); // Box 163
		bodyModel[147] = new ModelRendererTurbo(this, 284, 443, textureX, textureY); // Box 164
		bodyModel[148] = new ModelRendererTurbo(this, 1961, 97, textureX, textureY); // Box 165
		bodyModel[149] = new ModelRendererTurbo(this, 1113, 177, textureX, textureY); // Box 166
		bodyModel[150] = new ModelRendererTurbo(this, 1489, 177, textureX, textureY); // Box 167
		bodyModel[151] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 168
		bodyModel[152] = new ModelRendererTurbo(this, 201, 185, textureX, textureY); // Box 169
		bodyModel[153] = new ModelRendererTurbo(this, 1689, 193, textureX, textureY); // Box 170
		bodyModel[154] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 171
		bodyModel[155] = new ModelRendererTurbo(this, 705, 209, textureX, textureY); // Box 172
		bodyModel[156] = new ModelRendererTurbo(this, 307, 386, textureX, textureY); // Box 173
		bodyModel[157] = new ModelRendererTurbo(this, 173, 386, textureX, textureY); // Box 174
		bodyModel[158] = new ModelRendererTurbo(this, 424, 386, textureX, textureY); // Box 175
		bodyModel[159] = new ModelRendererTurbo(this, 539, 386, textureX, textureY); // Box 176
		bodyModel[160] = new ModelRendererTurbo(this, 801, 89, textureX, textureY); // Box 177
		bodyModel[161] = new ModelRendererTurbo(this, 1769, 25, textureX, textureY); // Box 178
		bodyModel[162] = new ModelRendererTurbo(this, 1673, 1, textureX, textureY); // Box 179
		bodyModel[163] = new ModelRendererTurbo(this, 664, 386, textureX, textureY); // Box 180
		bodyModel[164] = new ModelRendererTurbo(this, 376, 386, textureX, textureY); // Box 181
		bodyModel[165] = new ModelRendererTurbo(this, 486, 386, textureX, textureY); // Box 182
		bodyModel[166] = new ModelRendererTurbo(this, 610, 386, textureX, textureY); // Box 183
		bodyModel[167] = new ModelRendererTurbo(this, 250, 386, textureX, textureY); // Box 184
		bodyModel[168] = new ModelRendererTurbo(this, 114, 386, textureX, textureY); // Box 185
		bodyModel[169] = new ModelRendererTurbo(this, 1569, 209, textureX, textureY); // Box 186
		bodyModel[170] = new ModelRendererTurbo(this, 825, 201, textureX, textureY); // Box 187
		bodyModel[171] = new ModelRendererTurbo(this, 1833, 201, textureX, textureY); // Box 188
		bodyModel[172] = new ModelRendererTurbo(this, 49, 209, textureX, textureY); // Box 189
		bodyModel[173] = new ModelRendererTurbo(this, 826, 414, textureX, textureY); // Box 190
		bodyModel[174] = new ModelRendererTurbo(this, 889, 233, textureX, textureY); // Box 191
		bodyModel[175] = new ModelRendererTurbo(this, 553, 137, textureX, textureY); // Box 192
		bodyModel[176] = new ModelRendererTurbo(this, 377, 145, textureX, textureY); // Box 193
		bodyModel[177] = new ModelRendererTurbo(this, 985, 145, textureX, textureY); // Box 194
		bodyModel[178] = new ModelRendererTurbo(this, 1113, 273, textureX, textureY); // Box 211
		bodyModel[179] = new ModelRendererTurbo(this, 737, 265, textureX, textureY); // Box 212
		bodyModel[180] = new ModelRendererTurbo(this, 1305, 273, textureX, textureY); // Box 213
		bodyModel[181] = new ModelRendererTurbo(this, 217, 129, textureX, textureY); // Box 214
		bodyModel[182] = new ModelRendererTurbo(this, 865, 121, textureX, textureY); // Box 215
		bodyModel[183] = new ModelRendererTurbo(this, 1713, 129, textureX, textureY); // Box 216
		bodyModel[184] = new ModelRendererTurbo(this, 129, 153, textureX, textureY); // Box 217
		bodyModel[185] = new ModelRendererTurbo(this, 985, 169, textureX, textureY); // Box 218
		bodyModel[186] = new ModelRendererTurbo(this, 1409, 273, textureX, textureY); // Box 219
		bodyModel[187] = new ModelRendererTurbo(this, 1033, 145, textureX, textureY); // Box 220
		bodyModel[188] = new ModelRendererTurbo(this, 633, 233, textureX, textureY); // Box 221
		bodyModel[189] = new ModelRendererTurbo(this, 553, 161, textureX, textureY); // Box 222
		bodyModel[190] = new ModelRendererTurbo(this, 1905, 25, textureX, textureY); // Box 223
		bodyModel[191] = new ModelRendererTurbo(this, 193, 81, textureX, textureY); // Box 224
		bodyModel[192] = new ModelRendererTurbo(this, 2041, 1, textureX, textureY); // Box 225
		bodyModel[193] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 226
		bodyModel[194] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 227
		bodyModel[195] = new ModelRendererTurbo(this, 1073, 25, textureX, textureY); // Box 228
		bodyModel[196] = new ModelRendererTurbo(this, 649, 25, textureX, textureY); // Box 229
		bodyModel[197] = new ModelRendererTurbo(this, 1209, 9, textureX, textureY); // Box 230
		bodyModel[198] = new ModelRendererTurbo(this, 1641, 25, textureX, textureY); // Box 231
		bodyModel[199] = new ModelRendererTurbo(this, 777, 25, textureX, textureY); // Box 232
		bodyModel[200] = new ModelRendererTurbo(this, 1321, 9, textureX, textureY); // Box 233
		bodyModel[201] = new ModelRendererTurbo(this, 1649, 25, textureX, textureY); // Box 234
		bodyModel[202] = new ModelRendererTurbo(this, 1209, 25, textureX, textureY); // Box 235
		bodyModel[203] = new ModelRendererTurbo(this, 1345, 9, textureX, textureY); // Box 236
		bodyModel[204] = new ModelRendererTurbo(this, 1657, 25, textureX, textureY); // Box 237
		bodyModel[205] = new ModelRendererTurbo(this, 1329, 25, textureX, textureY); // Box 238
		bodyModel[206] = new ModelRendererTurbo(this, 1537, 9, textureX, textureY); // Box 239
		bodyModel[207] = new ModelRendererTurbo(this, 553, 81, textureX, textureY); // Box 240
		bodyModel[208] = new ModelRendererTurbo(this, 881, 33, textureX, textureY); // Box 241
		bodyModel[209] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 242
		bodyModel[210] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Box 243
		bodyModel[211] = new ModelRendererTurbo(this, 1193, 33, textureX, textureY); // Box 244
		bodyModel[212] = new ModelRendererTurbo(this, 849, 33, textureX, textureY); // Box 245
		bodyModel[213] = new ModelRendererTurbo(this, 1505, 33, textureX, textureY); // Box 246
		bodyModel[214] = new ModelRendererTurbo(this, 1641, 33, textureX, textureY); // Box 247
		bodyModel[215] = new ModelRendererTurbo(this, 1753, 105, textureX, textureY); // Box 248
		bodyModel[216] = new ModelRendererTurbo(this, 753, 113, textureX, textureY); // Box 249
		bodyModel[217] = new ModelRendererTurbo(this, 1009, 113, textureX, textureY); // Box 250
		bodyModel[218] = new ModelRendererTurbo(this, 2041, 25, textureX, textureY); // Box 251
		bodyModel[219] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 252
		bodyModel[220] = new ModelRendererTurbo(this, 1513, 33, textureX, textureY); // Box 253
		bodyModel[221] = new ModelRendererTurbo(this, 513, 41, textureX, textureY); // Box 254
		bodyModel[222] = new ModelRendererTurbo(this, 1209, 33, textureX, textureY); // Box 255
		bodyModel[223] = new ModelRendererTurbo(this, 785, 33, textureX, textureY); // Box 256
		bodyModel[224] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 257
		bodyModel[225] = new ModelRendererTurbo(this, 1977, 33, textureX, textureY); // Box 258
		bodyModel[226] = new ModelRendererTurbo(this, 1393, 33, textureX, textureY); // Box 259
		bodyModel[227] = new ModelRendererTurbo(this, 1905, 33, textureX, textureY); // Box 260
		bodyModel[228] = new ModelRendererTurbo(this, 433, 57, textureX, textureY); // Box 261
		bodyModel[229] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Box 262
		bodyModel[230] = new ModelRendererTurbo(this, 1009, 33, textureX, textureY); // Box 263
		bodyModel[231] = new ModelRendererTurbo(this, 2033, 33, textureX, textureY); // Box 264
		bodyModel[232] = new ModelRendererTurbo(this, 321, 41, textureX, textureY); // Box 265
		bodyModel[233] = new ModelRendererTurbo(this, 585, 41, textureX, textureY); // Box 266
		bodyModel[234] = new ModelRendererTurbo(this, 1457, 33, textureX, textureY); // Box 267
		bodyModel[235] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 268
		bodyModel[236] = new ModelRendererTurbo(this, 177, 161, textureX, textureY); // Box 269
		bodyModel[237] = new ModelRendererTurbo(this, 633, 41, textureX, textureY); // Box 270
		bodyModel[238] = new ModelRendererTurbo(this, 1193, 41, textureX, textureY); // Box 271
		bodyModel[239] = new ModelRendererTurbo(this, 1065, 1, textureX, textureY); // Box 272
		bodyModel[240] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 273
		bodyModel[241] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 274
		bodyModel[242] = new ModelRendererTurbo(this, 1201, 41, textureX, textureY); // Box 275
		bodyModel[243] = new ModelRendererTurbo(this, 961, 49, textureX, textureY); // Box 276
		bodyModel[244] = new ModelRendererTurbo(this, 977, 1, textureX, textureY); // Box 277
		bodyModel[245] = new ModelRendererTurbo(this, 2041, 41, textureX, textureY); // Box 278
		bodyModel[246] = new ModelRendererTurbo(this, 1, 281, textureX, textureY); // Box 279
		bodyModel[247] = new ModelRendererTurbo(this, 297, 281, textureX, textureY); // Box 280
		bodyModel[248] = new ModelRendererTurbo(this, 553, 185, textureX, textureY); // Box 281
		bodyModel[249] = new ModelRendererTurbo(this, 795, 386, textureX, textureY); // Box 282
		bodyModel[250] = new ModelRendererTurbo(this, 739, 386, textureX, textureY); // Box 283
		bodyModel[251] = new ModelRendererTurbo(this, 45, 386, textureX, textureY); // Box 284
		bodyModel[252] = new ModelRendererTurbo(this, 0, 386, textureX, textureY); // Box 285
		bodyModel[253] = new ModelRendererTurbo(this, 2041, 65, textureX, textureY); // Box 314
		bodyModel[254] = new ModelRendererTurbo(this, 1865, 201, textureX, textureY); // Box 315
		bodyModel[255] = new ModelRendererTurbo(this, 145, 273, textureX, textureY); // Box 316
		bodyModel[256] = new ModelRendererTurbo(this, 2041, 113, textureX, textureY); // Box 317
		bodyModel[257] = new ModelRendererTurbo(this, 1001, 233, textureX, textureY); // Box 318
		bodyModel[258] = new ModelRendererTurbo(this, 1113, 273, textureX, textureY); // Box 319
		bodyModel[259] = new ModelRendererTurbo(this, 385, 281, textureX, textureY); // Box 320
		bodyModel[260] = new ModelRendererTurbo(this, 1209, 281, textureX, textureY); // Box 321
		bodyModel[261] = new ModelRendererTurbo(this, 1817, 289, textureX, textureY); // Box 322
		bodyModel[262] = new ModelRendererTurbo(this, 825, 297, textureX, textureY); // Box 323
		bodyModel[263] = new ModelRendererTurbo(this, 1561, 161, textureX, textureY); // Box 374
		bodyModel[264] = new ModelRendererTurbo(this, 1801, 65, textureX, textureY); // Box 375
		bodyModel[265] = new ModelRendererTurbo(this, 305, 73, textureX, textureY); // Box 376
		bodyModel[266] = new ModelRendererTurbo(this, 753, 73, textureX, textureY); // Box 377
		bodyModel[267] = new ModelRendererTurbo(this, 1329, 73, textureX, textureY); // Box 378
		bodyModel[268] = new ModelRendererTurbo(this, 601, 129, textureX, textureY); // Box 379
		bodyModel[269] = new ModelRendererTurbo(this, 1225, 57, textureX, textureY); // Box 380
		bodyModel[270] = new ModelRendererTurbo(this, 1953, 201, textureX, textureY); // Box 381
		bodyModel[271] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 382
		bodyModel[272] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Box 383
		bodyModel[273] = new ModelRendererTurbo(this, 1777, 65, textureX, textureY); // Box 384
		bodyModel[274] = new ModelRendererTurbo(this, 2033, 65, textureX, textureY); // Box 385
		bodyModel[275] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 386
		bodyModel[276] = new ModelRendererTurbo(this, 305, 81, textureX, textureY); // Box 387
		bodyModel[277] = new ModelRendererTurbo(this, 849, 73, textureX, textureY); // Box 388
		bodyModel[278] = new ModelRendererTurbo(this, 1769, 25, textureX, textureY); // Box 389
		bodyModel[279] = new ModelRendererTurbo(this, 961, 57, textureX, textureY); // Box 390
		bodyModel[280] = new ModelRendererTurbo(this, 1009, 57, textureX, textureY); // Box 391
		bodyModel[281] = new ModelRendererTurbo(this, 1185, 57, textureX, textureY); // Box 392
		bodyModel[282] = new ModelRendererTurbo(this, 1137, 65, textureX, textureY); // Box 393
		bodyModel[283] = new ModelRendererTurbo(this, 705, 73, textureX, textureY); // Box 394
		bodyModel[284] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 395
		bodyModel[285] = new ModelRendererTurbo(this, 321, 65, textureX, textureY); // Box 396
		bodyModel[286] = new ModelRendererTurbo(this, 1337, 1, textureX, textureY); // Box 397
		bodyModel[287] = new ModelRendererTurbo(this, 1521, 1, textureX, textureY); // Box 398
		bodyModel[288] = new ModelRendererTurbo(this, 1025, 193, textureX, textureY); // Box 399
		bodyModel[289] = new ModelRendererTurbo(this, 1801, 81, textureX, textureY); // Box 400
		bodyModel[290] = new ModelRendererTurbo(this, 1345, 73, textureX, textureY); // Box 401
		bodyModel[291] = new ModelRendererTurbo(this, 753, 81, textureX, textureY); // Box 402
		bodyModel[292] = new ModelRendererTurbo(this, 657, 105, textureX, textureY); // Box 403
		bodyModel[293] = new ModelRendererTurbo(this, 2025, 201, textureX, textureY); // Box 404
		bodyModel[294] = new ModelRendererTurbo(this, 313, 105, textureX, textureY); // Box 405
		bodyModel[295] = new ModelRendererTurbo(this, 1769, 209, textureX, textureY); // Box 406
		bodyModel[296] = new ModelRendererTurbo(this, 777, 73, textureX, textureY); // Box 407
		bodyModel[297] = new ModelRendererTurbo(this, 1233, 73, textureX, textureY); // Box 408
		bodyModel[298] = new ModelRendererTurbo(this, 1753, 113, textureX, textureY); // Box 409
		bodyModel[299] = new ModelRendererTurbo(this, 97, 137, textureX, textureY); // Box 410
		bodyModel[300] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 411
		bodyModel[301] = new ModelRendererTurbo(this, 1601, 89, textureX, textureY); // Box 412
		bodyModel[302] = new ModelRendererTurbo(this, 1065, 65, textureX, textureY); // Box 414
		bodyModel[303] = new ModelRendererTurbo(this, 1489, 65, textureX, textureY); // Box 415
		bodyModel[304] = new ModelRendererTurbo(this, 1801, 65, textureX, textureY); // Box 416
		bodyModel[305] = new ModelRendererTurbo(this, 1769, 73, textureX, textureY); // Box 417
		bodyModel[306] = new ModelRendererTurbo(this, 777, 89, textureX, textureY); // Box 418
		bodyModel[307] = new ModelRendererTurbo(this, 1233, 193, textureX, textureY); // Box 419
		bodyModel[308] = new ModelRendererTurbo(this, 969, 145, textureX, textureY); // Box 420
		bodyModel[309] = new ModelRendererTurbo(this, 753, 97, textureX, textureY); // Box 421
		bodyModel[310] = new ModelRendererTurbo(this, 881, 97, textureX, textureY); // Box 422
		bodyModel[311] = new ModelRendererTurbo(this, 1769, 145, textureX, textureY); // Box 423
		bodyModel[312] = new ModelRendererTurbo(this, 1841, 209, textureX, textureY); // Box 424
		bodyModel[313] = new ModelRendererTurbo(this, 1209, 105, textureX, textureY); // Box 425
		bodyModel[314] = new ModelRendererTurbo(this, 737, 225, textureX, textureY); // Box 426
		bodyModel[315] = new ModelRendererTurbo(this, 961, 97, textureX, textureY); // Box 427
		bodyModel[316] = new ModelRendererTurbo(this, 1489, 105, textureX, textureY); // Box 428
		bodyModel[317] = new ModelRendererTurbo(this, 105, 137, textureX, textureY); // Box 429
		bodyModel[318] = new ModelRendererTurbo(this, 617, 153, textureX, textureY); // Box 430
		bodyModel[319] = new ModelRendererTurbo(this, 1761, 113, textureX, textureY); // Box 431
		bodyModel[320] = new ModelRendererTurbo(this, 1785, 113, textureX, textureY); // Box 432
		bodyModel[321] = new ModelRendererTurbo(this, 1817, 65, textureX, textureY); // Box 434
		bodyModel[322] = new ModelRendererTurbo(this, 321, 73, textureX, textureY); // Box 435
		bodyModel[323] = new ModelRendererTurbo(this, 1329, 73, textureX, textureY); // Box 436
		bodyModel[324] = new ModelRendererTurbo(this, 857, 89, textureX, textureY); // Box 437
		bodyModel[325] = new ModelRendererTurbo(this, 217, 105, textureX, textureY); // Box 438
		bodyModel[326] = new ModelRendererTurbo(this, 1281, 193, textureX, textureY); // Box 439
		bodyModel[327] = new ModelRendererTurbo(this, 1905, 145, textureX, textureY); // Box 440
		bodyModel[328] = new ModelRendererTurbo(this, 1809, 113, textureX, textureY); // Box 441
		bodyModel[329] = new ModelRendererTurbo(this, 1961, 113, textureX, textureY); // Box 442
		bodyModel[330] = new ModelRendererTurbo(this, 2025, 145, textureX, textureY); // Box 443
		bodyModel[331] = new ModelRendererTurbo(this, 1985, 113, textureX, textureY); // Box 444
		bodyModel[332] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Box 445
		bodyModel[333] = new ModelRendererTurbo(this, 1497, 105, textureX, textureY); // Box 446
		bodyModel[334] = new ModelRendererTurbo(this, 1593, 105, textureX, textureY); // Box 447
		bodyModel[335] = new ModelRendererTurbo(this, 297, 233, textureX, textureY); // Box 448
		bodyModel[336] = new ModelRendererTurbo(this, 385, 121, textureX, textureY); // Box 449
		bodyModel[337] = new ModelRendererTurbo(this, 753, 137, textureX, textureY); // Box 450
		bodyModel[338] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 451
		bodyModel[339] = new ModelRendererTurbo(this, 785, 49, textureX, textureY); // Box 452
		bodyModel[340] = new ModelRendererTurbo(this, 2041, 161, textureX, textureY); // Box 453
		bodyModel[341] = new ModelRendererTurbo(this, 1753, 73, textureX, textureY); // Box 454
		bodyModel[342] = new ModelRendererTurbo(this, 129, 81, textureX, textureY); // Box 455
		bodyModel[343] = new ModelRendererTurbo(this, 1801, 81, textureX, textureY); // Box 456
		bodyModel[344] = new ModelRendererTurbo(this, 1209, 129, textureX, textureY); // Box 457

		bodyModel[0].addShapeBox(0F, 0F, 0F, 31, 7, 3, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-34F, -57F, -17F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 49, 17, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[1].setRotationPoint(-52F, -50F, -17F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 18, 7, 4, 0F,0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[2].setRotationPoint(-52F, -57F, -17F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 41, 7, 17, 0F,0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[3].setRotationPoint(-3F, -57F, -17F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 41, 17, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[4].setRotationPoint(-3F, -50F, -17F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 78, 17, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[5].setRotationPoint(38F, -50F, -17F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 78, 7, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[6].setRotationPoint(38F, -57F, -17F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 41, 8, 16, 0F,0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[7].setRotationPoint(-3F, -65F, -16F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 41, 8, 4, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[8].setRotationPoint(38F, -65F, -16F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 41, 6, 13, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[9].setRotationPoint(-3F, -71F, -13F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 7, 6, 7, 0F,0F, 0F, -6F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F); // Box 10
		bodyModel[10].setRotationPoint(38F, -71F, -13F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 49, 7, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[11].setRotationPoint(-52F, -33F, -17F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 41, 7, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[12].setRotationPoint(-3F, -33F, -17F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 78, 7, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -3F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[13].setRotationPoint(38F, -33F, -17F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 49, 6, 15, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -9F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 15
		bodyModel[14].setRotationPoint(-52F, -26F, -15F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 41, 6, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[15].setRotationPoint(-3F, -26F, -15F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 78, 6, 15, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -2F, -7F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[16].setRotationPoint(38F, -26F, -15F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 50, 17, 17, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -3F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[17].setRotationPoint(116F, -50F, -17F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 50, 6, 17, 0F,0F, 0F, 0F, 0F, 5F, -3F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -7F, -7F, 0F, -7F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[18].setRotationPoint(116F, -33F, -17F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 50, 5, 14, 0F,0F, 0F, 0F, 0F, 7F, -4F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -9F, -9F, 0F, -9F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[19].setRotationPoint(116F, -27F, -14F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 50, 7, 17, 0F,0F, 0F, -1F, 0F, -1F, -4F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[20].setRotationPoint(116F, -57F, -17F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 50, 8, 15, 0F,0F, 0F, -2F, 0F, -4F, -6F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, -2F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[21].setRotationPoint(116F, -65F, -15F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 37, 8, 4, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[22].setRotationPoint(79F, -65F, -16F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 50, 3, 13, 0F,0F, 0F, -6F, 0F, -4F, -8F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -4F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[23].setRotationPoint(116F, -68F, -13F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 82, 12, 14, 0F,0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, -12F, 0F, -11F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[24].setRotationPoint(166F, -50F, -14F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 82, 6, 14, 0F,0F, 0F, -1F, 0F, -6F, -12F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[25].setRotationPoint(166F, -56F, -14F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 82, 5, 13, 0F,0F, 0F, -4F, 0F, -11F, -11F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, -11F, 0F, 6F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[26].setRotationPoint(166F, -61F, -13F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 82, 3, 9, 0F,0F, 0F, -4F, 0F, -13F, -8F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 11F, -7F, 0F, 11F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[27].setRotationPoint(166F, -64F, -9F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 82, 4, 14, 0F,0F, 0F, 0F, 0F, 11F, -12F, 0F, 11F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -15F, -12F, 0F, -15F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[28].setRotationPoint(166F, -38F, -14F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 82, 3, 10, 0F,0F, 0F, 0F, 0F, 15F, -8F, 0F, 15F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -17F, -9F, 0F, -17F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[29].setRotationPoint(166F, -34F, -10F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 25, 7, 7, 0F,0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 2F, -4F, 0F, -3F, -6F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 31
		bodyModel[30].setRotationPoint(-77F, -33F, -17F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 25, 5, 10, 0F,0F, 3F, -2F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 3F, -7F, 0F, -4F, -9F, 0F, 0F, -7F, 0F, -1F, -3F, 0F, -5F, -1F); // Box 32
		bodyModel[31].setRotationPoint(-77F, -26F, -13F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 25, 17, 3, 0F,0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 33
		bodyModel[32].setRotationPoint(-77F, -50F, -17F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 25, 7, 7, 0F,0F, -4F, -6F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -4F, 0F, 0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 2F, -4F); // Box 34
		bodyModel[33].setRotationPoint(-77F, -57F, -17F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 18, 3, 8, 0F,0F, 1F, -8F, -10F, 0F, -6F, -10F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -6F); // Box 35
		bodyModel[34].setRotationPoint(-52F, -60F, -15F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 8, 2, 6, 0F,0F, 0F, 0F, 0F, -1F, 2F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -6F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[35].setRotationPoint(-52F, -61F, -7F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[36].setRotationPoint(-52F, -61F, -1F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 25, 4, 9, 0F,0F, -4F, -8F, 0F, 0F, -7F, 0F, -1F, -2F, 0F, -5F, -1F, 0F, 4F, -3F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 4F, -5F); // Box 38
		bodyModel[37].setRotationPoint(-77F, -61F, -14F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 16, 13, 5, 0F,0F, -2F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -2F, 0F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, 0F); // Box 39
		bodyModel[38].setRotationPoint(-93F, -48F, -15F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 16, 5, 7, 0F,0F, -4F, -6F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, -4F, 0F, 0F, 2F, -4F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 2F, -2F); // Box 40
		bodyModel[39].setRotationPoint(-93F, -53F, -15F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 16, 4, 8, 0F,0F, -4F, -7F, 0F, 0F, -5F, 0F, -1F, -3F, 0F, -5F, -1F, 0F, 4F, -2F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 4F, -5F); // Box 41
		bodyModel[40].setRotationPoint(-93F, -57F, -11F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 16, 6, 9, 0F,0F, 1F, -4F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 1F, -4F, 0F, -2F, -8F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, 0F); // Box 42
		bodyModel[41].setRotationPoint(-93F, -35F, -15F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 16, 4, 10, 0F,0F, 2F, -4F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 2F, -5F, 0F, -4F, -9F, 0F, 0F, -7F, 0F, -1F, -3F, 0F, -5F, -1F); // Box 43
		bodyModel[42].setRotationPoint(-93F, -29F, -11F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 62, 20, 68, 0F,0F, 0F, 0F, -13F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -8F, 0F, -13F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[43].setRotationPoint(3F, -53F, -85F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 16, 20, 68, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 10F, -10F, 0F, 0F, -10F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 10F, -3F, 0F); // Box 45
		bodyModel[44].setRotationPoint(-13F, -53F, -85F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 25, 15, 68, 0F,14F, 5F, 0F, -21F, -4F, 0F, 0F, -10F, 0F, 1F, 0F, 0F, 14F, -8F, 0F, -21F, -10F, 0F, 0F, -4F, 0F, 1F, 0F, 0F); // Box 46
		bodyModel[45].setRotationPoint(66F, -48F, -85F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 49, 20, 148, 0F,-11F, 0F, 0F, -24F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, -11F, -16F, 0F, -24F, -16F, 0F, 0F, 4F, 0F, 0F, 4F, 0F); // Box 47
		bodyModel[46].setRotationPoint(3F, -65F, -233F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 16, 20, 148, 0F,-22F, -1F, 0F, 11F, 0F, 0F, 0F, -12F, 0F, 0F, -16F, 0F, -22F, -17F, 0F, 11F, -16F, 0F, 0F, 4F, 0F, 0F, 2F, 0F); // Box 48
		bodyModel[47].setRotationPoint(-13F, -65F, -233F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 37, 20, 148, 0F,0F, 0F, 0F, -24F, -2F, 0F, 5F, -21F, 0F, -24F, -12F, 0F, 0F, -16F, 0F, -24F, -17F, 0F, 5F, 2F, 0F, -24F, 4F, 0F); // Box 49
		bodyModel[48].setRotationPoint(28F, -65F, -233F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 14, 4, 16, 0F,-3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -4F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[49].setRotationPoint(14F, -65F, -249F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 12, 4, 16, 0F,-3F, 0F, -4F, -4F, 0F, 0F, -7F, 0F, 0F, 0F, -1F, 0F, -3F, -3F, -4F, -4F, -3F, 0F, -7F, 0F, 0F, 0F, -1F, 0F); // Box 51
		bodyModel[50].setRotationPoint(9F, -65F, -249F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 12, 4, 16, 0F,0F, 0F, 0F, -3F, -1F, -5F, 5F, -2F, 0F, -4F, 0F, 0F, 0F, -3F, 0F, -3F, -2F, -5F, 5F, -1F, 0F, -4F, 0F, 0F); // Box 52
		bodyModel[51].setRotationPoint(24F, -65F, -249F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 11, 5, 72, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 17F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 17F, 0F, 0F); // Box 102
		bodyModel[52].setRotationPoint(209F, -52F, -75F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 6, 5, 72, 0F,-2F, -2F, 0F, 0F, 0F, 0F, -17F, 0F, 0F, 26F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, -17F, 0F, 0F, 26F, -2F, 0F); // Box 103
		bodyModel[53].setRotationPoint(203F, -52F, -75F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 12, 5, 72, 0F,0F, 0F, 0F, 0F, -2F, 0F, 4F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 4F, -2F, 0F, 0F, 0F, 0F); // Box 104
		bodyModel[54].setRotationPoint(220F, -52F, -75F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 12, 5, 8, 0F,0F, -2F, 0F, -5F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -5F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[55].setRotationPoint(220F, -52F, -83F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 10, 5, 8, 0F,-5F, -2F, -2F, 0F, -2F, 0F, -6F, 0F, 0F, 0F, -2F, 0F, -5F, -2F, -2F, 0F, -2F, 0F, -6F, 0F, 0F, 0F, -2F, 0F); // Box 106
		bodyModel[56].setRotationPoint(205F, -52F, -83F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 10, 5, 8, 0F,-5F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -5F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 107
		bodyModel[57].setRotationPoint(210F, -52F, -83F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 22, 11, 3, 0F,0F, 0F, 0F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[58].setRotationPoint(224F, -62F, -3F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 42, 19, 3, 0F,-11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F); // Box 109
		bodyModel[59].setRotationPoint(182F, -70F, -3F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 40, 43, 3, 0F,-29F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -26F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F); // Box 110
		bodyModel[60].setRotationPoint(184F, -113F, -3F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 14, 10, 3, 0F,-9F, -3F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, -6F, -3F, 0F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[61].setRotationPoint(210F, -123F, -3F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 22, 51, 3, 0F,0F, 0F, 0F, -9F, 0F, -2F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[62].setRotationPoint(224F, -113F, -3F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 16, 10, 3, 0F,0F, -1F, -2F, -9F, -3F, -2F, -6F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[63].setRotationPoint(224F, -123F, -3F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 27, 3, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		bodyModel[64].setRotationPoint(52F, -68F, -13F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 27, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[65].setRotationPoint(52F, -76F, -1F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[66].setRotationPoint(52F, -76F, -3F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[67].setRotationPoint(52F, -76F, -8F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 85
		bodyModel[68].setRotationPoint(52F, -74F, -8F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 86
		bodyModel[69].setRotationPoint(58F, -74F, -8F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[70].setRotationPoint(58F, -76F, -8F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[71].setRotationPoint(58F, -76F, -3F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 89
		bodyModel[72].setRotationPoint(64F, -74F, -8F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[73].setRotationPoint(64F, -76F, -8F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[74].setRotationPoint(64F, -76F, -3F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 92
		bodyModel[75].setRotationPoint(71F, -74F, -8F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		bodyModel[76].setRotationPoint(71F, -76F, -8F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		bodyModel[77].setRotationPoint(71F, -76F, -3F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 95
		bodyModel[78].setRotationPoint(78F, -74F, -8F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[79].setRotationPoint(78F, -76F, -8F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[80].setRotationPoint(78F, -76F, -3F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 27, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		bodyModel[81].setRotationPoint(52F, -74F, -8F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 2F); // Box 99
		bodyModel[82].setRotationPoint(44F, -74F, -8F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[83].setRotationPoint(44F, -73F, -9F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 101
		bodyModel[84].setRotationPoint(44F, -73F, -6F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 102
		bodyModel[85].setRotationPoint(44F, -76F, -1F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 103
		bodyModel[86].setRotationPoint(38F, -73F, -6F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F); // Box 104
		bodyModel[87].setRotationPoint(38F, -73F, -1F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 7, 5, 1, 0F,0F, 0F, -3F, 0F, -2F, -1F, 0F, -2F, 1F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[88].setRotationPoint(45F, -70F, -13F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 31, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[89].setRotationPoint(-34F, -65F, -12F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 31, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		bodyModel[90].setRotationPoint(-34F, -71F, -7F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 31, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[91].setRotationPoint(-34F, -71F, -1F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 109
		bodyModel[92].setRotationPoint(-34F, -65F, -12F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F); // Box 110
		bodyModel[93].setRotationPoint(-34F, -65F, -12F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[94].setRotationPoint(-34F, -71F, -7F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[95].setRotationPoint(-23F, -71F, -7F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F); // Box 113
		bodyModel[96].setRotationPoint(-23F, -65F, -12F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 114
		bodyModel[97].setRotationPoint(-23F, -65F, -12F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[98].setRotationPoint(-13F, -71F, -7F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F); // Box 116
		bodyModel[99].setRotationPoint(-13F, -65F, -12F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 117
		bodyModel[100].setRotationPoint(-13F, -65F, -12F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 1F, -3F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 1F, 3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F); // Box 118
		bodyModel[101].setRotationPoint(-40F, -65F, -12F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, -1F, -4F, 1F, 0F, 4F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -1F, -1F, 4F, -1F, 0F); // Box 119
		bodyModel[102].setRotationPoint(-40F, -66F, -9F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[103].setRotationPoint(-35F, -71F, -3F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[104].setRotationPoint(-37F, -71F, -3F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,5F, -5F, 0F, -5F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 5F, 0F, -5F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[105].setRotationPoint(-35F, -71F, -8F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[106].setRotationPoint(-44F, -67F, -1F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F); // Box 124
		bodyModel[107].setRotationPoint(-44F, -67F, -1F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 6F, 0F); // Box 125
		bodyModel[108].setRotationPoint(-44F, -66F, -9F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,-4F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, -4F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[109].setRotationPoint(-7F, -61F, -15F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 10, 3, 7, 0F,-10F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F); // Box 127
		bodyModel[110].setRotationPoint(106F, -68F, -13F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 114
		bodyModel[111].setRotationPoint(-99F, -41F, -11F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-3F, 0F, 0F, 3F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 115
		bodyModel[112].setRotationPoint(-102F, -41F, -9F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[113].setRotationPoint(-104F, -42F, -5F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 117
		bodyModel[114].setRotationPoint(-104F, -42F, -5F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F); // Box 118
		bodyModel[115].setRotationPoint(-104F, -40F, -5F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[116].setRotationPoint(-104F, -45F, -1F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F); // Box 121
		bodyModel[117].setRotationPoint(-97F, -52F, -1F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[118].setRotationPoint(-104F, -37F, -1F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -11F, 0F, 1F, 11F, 0F, 1F, 11F, 0F, -1F, -11F, 0F, -1F); // Box 123
		bodyModel[119].setRotationPoint(-104F, -37F, -1F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 41, 8, 15, 0F,0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
		bodyModel[120].setRotationPoint(38F, -65F, -15F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 41, 7, 16, 0F,0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[121].setRotationPoint(38F, -57F, -16F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 41, 6, 13, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		bodyModel[122].setRotationPoint(38F, -71F, -13F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 25, 4, 7, 0F,0F, -4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 1F, -1F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 1F, 0F); // Box 139
		bodyModel[123].setRotationPoint(-77F, -61F, -7F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 16, 4, 6, 0F,0F, -4F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 1F, -2F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 1F, 0F); // Box 140
		bodyModel[124].setRotationPoint(-93F, -57F, -6F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 25, 5, 6, 0F,0F, 0F, -2F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 141
		bodyModel[125].setRotationPoint(-77F, -26F, -6F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 16, 5, 4, 0F,0F, 0F, -2F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 142
		bodyModel[126].setRotationPoint(-93F, -30F, -4F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 31, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[127].setRotationPoint(-34F, -57F, 14F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 49, 17, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		bodyModel[128].setRotationPoint(-52F, -50F, 14F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 18, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		bodyModel[129].setRotationPoint(-52F, -57F, 13F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 41, 7, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[130].setRotationPoint(-3F, -57F, 0F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 41, 17, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[131].setRotationPoint(-3F, -50F, 0F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 78, 17, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		bodyModel[132].setRotationPoint(38F, -50F, 0F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 78, 7, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[133].setRotationPoint(38F, -57F, 12F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 41, 8, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 150
		bodyModel[134].setRotationPoint(-3F, -65F, 0F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 41, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
		bodyModel[135].setRotationPoint(38F, -65F, 12F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 41, 6, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 152
		bodyModel[136].setRotationPoint(-3F, -71F, 0F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 7, 6, 7, 0F,0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[137].setRotationPoint(38F, -71F, 6F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 41, 7, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 155
		bodyModel[138].setRotationPoint(-3F, -33F, 0F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 78, 7, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -3F, 0F, 0F, -2F); // Box 156
		bodyModel[139].setRotationPoint(38F, -33F, 0F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 49, 6, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -1F, -9F); // Box 157
		bodyModel[140].setRotationPoint(-52F, -26F, 0F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 41, 6, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F); // Box 158
		bodyModel[141].setRotationPoint(-3F, -26F, 0F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 78, 6, 15, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -7F, 0F, 0F, -7F); // Box 159
		bodyModel[142].setRotationPoint(38F, -26F, 0F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 50, 17, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, -3F, 0F, 0F, 0F); // Box 160
		bodyModel[143].setRotationPoint(116F, -50F, 0F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 50, 6, 17, 0F,0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, -7F, 0F, 0F, -3F); // Box 161
		bodyModel[144].setRotationPoint(116F, -33F, 0F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 50, 5, 14, 0F,0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, -9F, 0F, 0F, -6F); // Box 162
		bodyModel[145].setRotationPoint(116F, -27F, 0F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 50, 7, 17, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 163
		bodyModel[146].setRotationPoint(116F, -57F, 0F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 50, 8, 15, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, -6F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -2F, 0F, 0F, 1F); // Box 164
		bodyModel[147].setRotationPoint(116F, -65F, 0F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 37, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		bodyModel[148].setRotationPoint(79F, -65F, 12F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 50, 3, 13, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, -8F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, -4F, 0F, 0F, 0F); // Box 166
		bodyModel[149].setRotationPoint(116F, -68F, 0F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 82, 12, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, -12F, 0F, 0F, 0F); // Box 167
		bodyModel[150].setRotationPoint(166F, -50F, 0F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 82, 6, 14, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, -12F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 0F); // Box 168
		bodyModel[151].setRotationPoint(166F, -56F, 0F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 82, 5, 13, 0F,0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, -11F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, -11F, 0F, 0F, 0F); // Box 169
		bodyModel[152].setRotationPoint(166F, -61F, 0F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 82, 3, 9, 0F,0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, -8F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 11F, 0F, 0F, 11F, -7F, 0F, 0F, 0F); // Box 170
		bodyModel[153].setRotationPoint(166F, -64F, 0F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 82, 4, 14, 0F,0F, 0F, 0F, 0F, 11F, 0F, 0F, 11F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, -12F, 0F, 0F, -4F); // Box 171
		bodyModel[154].setRotationPoint(166F, -38F, 0F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 82, 3, 10, 0F,0F, 0F, 0F, 0F, 15F, 0F, 0F, 15F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -17F, 0F, 0F, -17F, -9F, 0F, 0F, -5F); // Box 172
		bodyModel[155].setRotationPoint(166F, -34F, 0F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 25, 7, 7, 0F,0F, 2F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 2F, -2F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -3F, -6F); // Box 173
		bodyModel[156].setRotationPoint(-77F, -33F, 10F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 25, 5, 10, 0F,0F, 3F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 3F, -2F, 0F, -5F, -1F, 0F, -1F, -3F, 0F, 0F, -7F, 0F, -4F, -9F); // Box 174
		bodyModel[157].setRotationPoint(-77F, -26F, 3F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 25, 17, 3, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F); // Box 175
		bodyModel[158].setRotationPoint(-77F, -50F, 14F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 25, 7, 7, 0F,0F, -4F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -4F, -6F, 0F, 2F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 2F, -2F); // Box 176
		bodyModel[159].setRotationPoint(-77F, -57F, 10F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 18, 3, 8, 0F,0F, 0F, 0F, -10F, -1F, -2F, -10F, 0F, -6F, 0F, 1F, -8F, 0F, 0F, -6F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 177
		bodyModel[160].setRotationPoint(-52F, -60F, 7F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 8, 2, 6, 0F,0F, 0F, 0F, -6F, 0F, 0F, 0F, -1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 178
		bodyModel[161].setRotationPoint(-52F, -61F, 1F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		bodyModel[162].setRotationPoint(-52F, -61F, 0F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 25, 4, 9, 0F,0F, -5F, -1F, 0F, -1F, -2F, 0F, 0F, -7F, 0F, -4F, -8F, 0F, 4F, -5F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 4F, -3F); // Box 180
		bodyModel[163].setRotationPoint(-77F, -61F, 5F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 16, 13, 5, 0F,0F, -2F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, -1F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -1F, -4F); // Box 181
		bodyModel[164].setRotationPoint(-93F, -48F, 10F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 16, 5, 7, 0F,0F, -4F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, -4F, -6F, 0F, 2F, -2F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 2F, -4F); // Box 182
		bodyModel[165].setRotationPoint(-93F, -53F, 8F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 16, 4, 8, 0F,0F, -5F, -1F, 0F, -1F, -3F, 0F, 0F, -5F, 0F, -4F, -7F, 0F, 4F, -5F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 4F, -2F); // Box 183
		bodyModel[166].setRotationPoint(-93F, -57F, 3F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 16, 6, 9, 0F,0F, 1F, -4F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 1F, -4F, 0F, -2F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, -8F); // Box 184
		bodyModel[167].setRotationPoint(-93F, -35F, 6F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 16, 4, 10, 0F,0F, 2F, -5F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 2F, -4F, 0F, -5F, -1F, 0F, -1F, -3F, 0F, 0F, -7F, 0F, -4F, -9F); // Box 185
		bodyModel[168].setRotationPoint(-93F, -29F, 1F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 62, 20, 68, 0F,0F, -5F, 0F, 0F, -5F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, -8F, 0F, 0F, -8F, 0F); // Box 186
		bodyModel[169].setRotationPoint(3F, -53F, 17F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 16, 20, 68, 0F,10F, -10F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 10F, -3F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -10F, 0F); // Box 187
		bodyModel[170].setRotationPoint(-13F, -53F, 17F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 25, 15, 68, 0F,1F, 0F, 0F, 0F, -10F, 0F, -21F, -4F, 0F, 14F, 5F, 0F, 1F, 0F, 0F, 0F, -4F, 0F, -21F, -10F, 0F, 14F, -8F, 0F); // Box 188
		bodyModel[171].setRotationPoint(66F, -48F, 17F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 49, 20, 148, 0F,0F, -12F, 0F, 0F, -12F, 0F, -24F, 0F, 0F, -11F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, -24F, -16F, 0F, -11F, -16F, 0F); // Box 189
		bodyModel[172].setRotationPoint(3F, -65F, 85F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 16, 20, 148, 0F,0F, -16F, 0F, 0F, -12F, 0F, 11F, 0F, 0F, -22F, -1F, 0F, 0F, 2F, 0F, 0F, 4F, 0F, 11F, -16F, 0F, -22F, -17F, 0F); // Box 190
		bodyModel[173].setRotationPoint(-13F, -65F, 85F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 37, 20, 148, 0F,-24F, -12F, 0F, 5F, -21F, 0F, -24F, -2F, 0F, 0F, 0F, 0F, -24F, 4F, 0F, 5F, 2F, 0F, -24F, -17F, 0F, 0F, -16F, 0F); // Box 191
		bodyModel[174].setRotationPoint(28F, -65F, 85F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 14, 4, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -3F, 0F, -3F, -3F, 0F); // Box 192
		bodyModel[175].setRotationPoint(14F, -65F, 233F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 12, 4, 16, 0F,0F, -1F, 0F, -7F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, -4F, 0F, -1F, 0F, -7F, 0F, 0F, -4F, -3F, 0F, -3F, -3F, -4F); // Box 193
		bodyModel[176].setRotationPoint(9F, -65F, 233F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 12, 4, 16, 0F,-4F, 0F, 0F, 5F, -2F, 0F, -3F, -1F, -5F, 0F, 0F, 0F, -4F, 0F, 0F, 5F, -1F, 0F, -3F, -2F, -5F, 0F, -3F, 0F); // Box 194
		bodyModel[177].setRotationPoint(24F, -65F, 233F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 11, 5, 72, 0F,17F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 17F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
		bodyModel[178].setRotationPoint(209F, -52F, 3F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 6, 5, 72, 0F,26F, -2F, 0F, -17F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, 26F, -2F, 0F, -17F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F); // Box 212
		bodyModel[179].setRotationPoint(203F, -52F, 3F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 12, 5, 72, 0F,0F, 0F, 0F, 4F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 213
		bodyModel[180].setRotationPoint(220F, -52F, 3F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 12, 5, 8, 0F,0F, 0F, 0F, 0F, -2F, 0F, -5F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -5F, -2F, -2F, 0F, -2F, 0F); // Box 214
		bodyModel[181].setRotationPoint(220F, -52F, 75F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 10, 5, 8, 0F,0F, -2F, 0F, -6F, 0F, 0F, 0F, -2F, 0F, -5F, -2F, -2F, 0F, -2F, 0F, -6F, 0F, 0F, 0F, -2F, 0F, -5F, -2F, -2F); // Box 215
		bodyModel[182].setRotationPoint(205F, -52F, 75F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 10, 5, 8, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -5F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -5F, -2F, 0F); // Box 216
		bodyModel[183].setRotationPoint(210F, -52F, 75F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 22, 11, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0F); // Box 217
		bodyModel[184].setRotationPoint(224F, -62F, 0F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 42, 19, 3, 0F,-8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 218
		bodyModel[185].setRotationPoint(182F, -70F, 0F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 40, 43, 3, 0F,-26F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -29F, 0F, -1F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F); // Box 219
		bodyModel[186].setRotationPoint(184F, -113F, 0F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 14, 10, 3, 0F,-6F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, -9F, -3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F); // Box 220
		bodyModel[187].setRotationPoint(210F, -123F, 0F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 22, 51, 3, 0F,0F, 0F, 0F, -6F, 0F, 0F, -9F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, 0F, 0F, 0F); // Box 221
		bodyModel[188].setRotationPoint(224F, -113F, 0F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 16, 10, 3, 0F,0F, 0F, 0F, -6F, -3F, 0F, -9F, -3F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, 0F, 0F, 0F); // Box 222
		bodyModel[189].setRotationPoint(224F, -123F, 0F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 27, 3, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[190].setRotationPoint(52F, -68F, 12F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 27, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[191].setRotationPoint(52F, -76F, 0F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		bodyModel[192].setRotationPoint(52F, -76F, 1F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 226
		bodyModel[193].setRotationPoint(52F, -76F, 3F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F); // Box 227
		bodyModel[194].setRotationPoint(52F, -74F, 7F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F); // Box 228
		bodyModel[195].setRotationPoint(58F, -74F, 7F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 229
		bodyModel[196].setRotationPoint(58F, -76F, 3F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 230
		bodyModel[197].setRotationPoint(58F, -76F, 1F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F); // Box 231
		bodyModel[198].setRotationPoint(64F, -74F, 7F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 232
		bodyModel[199].setRotationPoint(64F, -76F, 3F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 233
		bodyModel[200].setRotationPoint(64F, -76F, 1F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F); // Box 234
		bodyModel[201].setRotationPoint(71F, -74F, 7F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 235
		bodyModel[202].setRotationPoint(71F, -76F, 3F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 236
		bodyModel[203].setRotationPoint(71F, -76F, 1F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F); // Box 237
		bodyModel[204].setRotationPoint(78F, -74F, 7F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 238
		bodyModel[205].setRotationPoint(78F, -76F, 3F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
		bodyModel[206].setRotationPoint(78F, -76F, 1F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 27, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		bodyModel[207].setRotationPoint(52F, -74F, 7F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, 1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F); // Box 241
		bodyModel[208].setRotationPoint(44F, -74F, 7F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F); // Box 242
		bodyModel[209].setRotationPoint(44F, -73F, 6F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		bodyModel[210].setRotationPoint(44F, -73F, 1F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 244
		bodyModel[211].setRotationPoint(44F, -76F, 0F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 245
		bodyModel[212].setRotationPoint(38F, -73F, 5F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F); // Box 246
		bodyModel[213].setRotationPoint(38F, -73F, 0F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 7, 5, 1, 0F,0F, 0F, 3F, 0F, -2F, 1F, 0F, -2F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[214].setRotationPoint(45F, -70F, 12F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 31, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[215].setRotationPoint(-34F, -65F, 11F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 31, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[216].setRotationPoint(-34F, -71F, 6F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 31, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[217].setRotationPoint(-34F, -71F, 0F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 251
		bodyModel[218].setRotationPoint(-34F, -65F, 11F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[219].setRotationPoint(-34F, -65F, 7F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 253
		bodyModel[220].setRotationPoint(-34F, -71F, 0F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 254
		bodyModel[221].setRotationPoint(-23F, -71F, 0F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 255
		bodyModel[222].setRotationPoint(-23F, -65F, 7F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 256
		bodyModel[223].setRotationPoint(-23F, -65F, 11F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 257
		bodyModel[224].setRotationPoint(-13F, -71F, 0F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 258
		bodyModel[225].setRotationPoint(-13F, -65F, 7F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 259
		bodyModel[226].setRotationPoint(-13F, -65F, 11F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,-1F, 1F, 3F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F); // Box 260
		bodyModel[227].setRotationPoint(-40F, -65F, 11F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,4F, 1F, 0F, -4F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 4F, -1F, 0F, -4F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[228].setRotationPoint(-40F, -66F, 1F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 262
		bodyModel[229].setRotationPoint(-35F, -71F, 0F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 263
		bodyModel[230].setRotationPoint(-37F, -71F, 0F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -5F, -5F, 0F, 5F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 5F, 0F, 5F, 5F, 0F); // Box 264
		bodyModel[231].setRotationPoint(-35F, -71F, 3F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 265
		bodyModel[232].setRotationPoint(-44F, -67F, 0F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F); // Box 266
		bodyModel[233].setRotationPoint(-44F, -67F, 0F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,1F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 1F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F); // Box 267
		bodyModel[234].setRotationPoint(-44F, -66F, 8F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,-4F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, -4F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 268
		bodyModel[235].setRotationPoint(-7F, -61F, 14F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 10, 3, 7, 0F,-10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -10F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 269
		bodyModel[236].setRotationPoint(106F, -68F, 6F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 270
		bodyModel[237].setRotationPoint(-99F, -41F, 10F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,2F, 0F, 0F, -2F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F); // Box 271
		bodyModel[238].setRotationPoint(-102F, -41F, 5F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		bodyModel[239].setRotationPoint(-104F, -42F, 4F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 273
		bodyModel[240].setRotationPoint(-104F, -42F, 1F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 274
		bodyModel[241].setRotationPoint(-104F, -40F, 1F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Box 275
		bodyModel[242].setRotationPoint(-104F, -45F, 0F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F); // Box 276
		bodyModel[243].setRotationPoint(-97F, -52F, 0F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
		bodyModel[244].setRotationPoint(-104F, -37F, 0F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -11F, 0F, -1F, 11F, 0F, -1F, 11F, 0F, 1F, -11F, 0F, 1F); // Box 278
		bodyModel[245].setRotationPoint(-104F, -37F, 0F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 41, 8, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 279
		bodyModel[246].setRotationPoint(38F, -65F, 0F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 41, 7, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 280
		bodyModel[247].setRotationPoint(38F, -57F, 0F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 41, 6, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 281
		bodyModel[248].setRotationPoint(38F, -71F, 0F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 25, 4, 7, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -1F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 1F, -1F); // Box 282
		bodyModel[249].setRotationPoint(-77F, -61F, 0F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 16, 4, 6, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -2F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 1F, -2F); // Box 283
		bodyModel[250].setRotationPoint(-93F, -57F, 0F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 25, 5, 6, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -2F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -2F); // Box 284
		bodyModel[251].setRotationPoint(-77F, -26F, 0F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 16, 5, 4, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -2F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -2F); // Box 285
		bodyModel[252].setRotationPoint(-93F, -30F, 0F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 2, 33, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 314
		bodyModel[253].setRotationPoint(-52F, -59F, -1F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 8, 33, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[254].setRotationPoint(-52F, -59F, -9F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 18, 33, 5, 0F,0F, -2F, 0F, 0F, -2F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -10F, 0F, 0F, 0F, 0F, 0F); // Box 316
		bodyModel[255].setRotationPoint(-52F, -59F, -14F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 2, 33, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 317
		bodyModel[256].setRotationPoint(-52F, -59F, 0F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 8, 33, 8, 0F,0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 318
		bodyModel[257].setRotationPoint(-52F, -59F, 1F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 18, 33, 5, 0F,0F, 0F, 0F, -10F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 319
		bodyModel[258].setRotationPoint(-52F, -59F, 9F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 17, 9, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 320
		bodyModel[259].setRotationPoint(-50F, -57F, -14F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 17, 3, 28, 0F,0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 321
		bodyModel[260].setRotationPoint(-50F, -60F, -14F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 49, 7, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -4F); // Box 322
		bodyModel[261].setRotationPoint(-52F, -33F, 0F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 48, 9, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 323
		bodyModel[262].setRotationPoint(-51F, -42F, -14F);

		bodyModel[263].addShapeBox(0F, 1F, 0F, 10, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 374
		bodyModel[263].setRotationPoint(-31F, -49F, 2F);
		bodyModel[263].rotateAngleZ = -0.10471976F;

		bodyModel[264].addShapeBox(9F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 375
		bodyModel[264].setRotationPoint(-31F, -49F, 2F);
		bodyModel[264].rotateAngleZ = -0.10471976F;

		bodyModel[265].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 376
		bodyModel[265].setRotationPoint(-31F, -49F, 11F);
		bodyModel[265].rotateAngleZ = -0.10471976F;

		bodyModel[266].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 377
		bodyModel[266].setRotationPoint(-31F, -49F, 2F);
		bodyModel[266].rotateAngleZ = -0.10471976F;

		bodyModel[267].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 378
		bodyModel[267].setRotationPoint(-31F, -49F, 2F);
		bodyModel[267].rotateAngleZ = -0.10471976F;

		bodyModel[268].addShapeBox(0F, 0F, 0F, 1, 13, 10, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 379
		bodyModel[268].setRotationPoint(-22F, -61F, 2F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 380
		bodyModel[269].setRotationPoint(-20F, -65F, 4F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 1, 13, 8, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 381
		bodyModel[270].setRotationPoint(-23F, -60F, 3F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 382
		bodyModel[271].setRotationPoint(-23.3F, -60.3F, 8F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 383
		bodyModel[272].setRotationPoint(-23.3F, -60.3F, 5F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 384
		bodyModel[273].setRotationPoint(-22F, -58F, 10F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 385
		bodyModel[274].setRotationPoint(-22F, -58F, 3F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 386
		bodyModel[275].setRotationPoint(-28F, -48F, 12F);
		bodyModel[275].rotateAngleZ = 0.78539816F;

		bodyModel[276].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 387
		bodyModel[276].setRotationPoint(-28F, -48F, 1F);
		bodyModel[276].rotateAngleZ = 0.78539816F;

		bodyModel[277].addShapeBox(-1F, -1F, 0F, 2, 11, 2, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 388
		bodyModel[277].setRotationPoint(-32.5F, -53.25F, 6F);
		bodyModel[277].rotateAngleZ = -1.13446401F;

		bodyModel[278].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 389
		bodyModel[278].setRotationPoint(-32F, -57F, 6.5F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 390
		bodyModel[279].setRotationPoint(-20.5F, -64.5F, 5.5F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 391
		bodyModel[280].setRotationPoint(-20.5F, -63.5F, 5.5F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 392
		bodyModel[281].setRotationPoint(-20.5F, -62.5F, 5.5F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 393
		bodyModel[282].setRotationPoint(-27F, -47F, 10F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[283].setRotationPoint(-27F, -47F, 3F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 395
		bodyModel[284].setRotationPoint(-32F, -56.75F, 3.5F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 396
		bodyModel[285].setRotationPoint(-32F, -56.75F, 7.5F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 397
		bodyModel[286].setRotationPoint(-32F, -59.75F, 9.5F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 398
		bodyModel[287].setRotationPoint(-32F, -59.75F, 3.5F);

		bodyModel[288].addShapeBox(0F, 1F, 0F, 10, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 399
		bodyModel[288].setRotationPoint(-15F, -49F, 2F);
		bodyModel[288].rotateAngleZ = -0.10471976F;

		bodyModel[289].addShapeBox(9F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 400
		bodyModel[289].setRotationPoint(-15F, -49F, 2F);
		bodyModel[289].rotateAngleZ = -0.10471976F;

		bodyModel[290].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 401
		bodyModel[290].setRotationPoint(-15F, -49F, 11F);
		bodyModel[290].rotateAngleZ = -0.10471976F;

		bodyModel[291].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 402
		bodyModel[291].setRotationPoint(-15F, -49F, 2F);
		bodyModel[291].rotateAngleZ = -0.10471976F;

		bodyModel[292].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 403
		bodyModel[292].setRotationPoint(-15F, -49F, 2F);
		bodyModel[292].rotateAngleZ = -0.10471976F;

		bodyModel[293].addShapeBox(0F, 0F, 0F, 1, 13, 10, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 404
		bodyModel[293].setRotationPoint(-6F, -61F, 2F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 405
		bodyModel[294].setRotationPoint(-4F, -65F, 4F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 1, 13, 8, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 406
		bodyModel[295].setRotationPoint(-7F, -60F, 3F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 407
		bodyModel[296].setRotationPoint(-7.3F, -60.3F, 8F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 408
		bodyModel[297].setRotationPoint(-7.3F, -60.3F, 5F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 409
		bodyModel[298].setRotationPoint(-6F, -58F, 10F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 410
		bodyModel[299].setRotationPoint(-6F, -58F, 3F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 411
		bodyModel[300].setRotationPoint(-12F, -48F, 12F);
		bodyModel[300].rotateAngleZ = 0.78539816F;

		bodyModel[301].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 412
		bodyModel[301].setRotationPoint(-12F, -48F, 1F);
		bodyModel[301].rotateAngleZ = 0.78539816F;

		bodyModel[302].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 414
		bodyModel[302].setRotationPoint(-4.5F, -64.5F, 5.5F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 415
		bodyModel[303].setRotationPoint(-4.5F, -63.5F, 5.5F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 416
		bodyModel[304].setRotationPoint(-4.5F, -62.5F, 5.5F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 417
		bodyModel[305].setRotationPoint(-11F, -47F, 10F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 418
		bodyModel[306].setRotationPoint(-11F, -47F, 3F);

		bodyModel[307].addShapeBox(0F, 1F, 0F, 10, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 419
		bodyModel[307].setRotationPoint(-15F, -49F, -12F);
		bodyModel[307].rotateAngleZ = -0.10471976F;

		bodyModel[308].addShapeBox(9F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 420
		bodyModel[308].setRotationPoint(-15F, -49F, -12F);
		bodyModel[308].rotateAngleZ = -0.10471976F;

		bodyModel[309].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 421
		bodyModel[309].setRotationPoint(-15F, -49F, -12F);
		bodyModel[309].rotateAngleZ = -0.10471976F;

		bodyModel[310].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 422
		bodyModel[310].setRotationPoint(-15F, -49F, -3F);
		bodyModel[310].rotateAngleZ = -0.10471976F;

		bodyModel[311].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 423
		bodyModel[311].setRotationPoint(-15F, -49F, -12F);
		bodyModel[311].rotateAngleZ = -0.10471976F;

		bodyModel[312].addShapeBox(0F, 0F, 0F, 1, 13, 10, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 424
		bodyModel[312].setRotationPoint(-6F, -61F, -12F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 425
		bodyModel[313].setRotationPoint(-4F, -65F, -10F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 1, 13, 8, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 426
		bodyModel[314].setRotationPoint(-7F, -60F, -11F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 427
		bodyModel[315].setRotationPoint(-7.3F, -60.3F, -9F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 428
		bodyModel[316].setRotationPoint(-7.3F, -60.3F, -6F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 429
		bodyModel[317].setRotationPoint(-6F, -58F, -11F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 430
		bodyModel[318].setRotationPoint(-6F, -58F, -4F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 431
		bodyModel[319].setRotationPoint(-12F, -48F, -13F);
		bodyModel[319].rotateAngleZ = 0.78539816F;

		bodyModel[320].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 432
		bodyModel[320].setRotationPoint(-12F, -48F, -2F);
		bodyModel[320].rotateAngleZ = 0.78539816F;

		bodyModel[321].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 434
		bodyModel[321].setRotationPoint(-4.5F, -64.5F, -8.5F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 435
		bodyModel[322].setRotationPoint(-4.5F, -63.5F, -8.5F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 436
		bodyModel[323].setRotationPoint(-4.5F, -62.5F, -8.5F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 437
		bodyModel[324].setRotationPoint(-11F, -47F, -11F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 438
		bodyModel[325].setRotationPoint(-11F, -47F, -4F);

		bodyModel[326].addShapeBox(0F, 1F, 0F, 10, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 439
		bodyModel[326].setRotationPoint(-86F, -35F, -5F);
		bodyModel[326].rotateAngleZ = -0.10471976F;

		bodyModel[327].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 440
		bodyModel[327].setRotationPoint(-86F, -35F, -5F);
		bodyModel[327].rotateAngleZ = -0.10471976F;

		bodyModel[328].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 441
		bodyModel[328].setRotationPoint(-86F, -35F, -5F);
		bodyModel[328].rotateAngleZ = -0.10471976F;

		bodyModel[329].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 442
		bodyModel[329].setRotationPoint(-86F, -35F, 4F);
		bodyModel[329].rotateAngleZ = -0.10471976F;

		bodyModel[330].addShapeBox(9F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 443
		bodyModel[330].setRotationPoint(-86F, -35F, -5F);
		bodyModel[330].rotateAngleZ = -0.10471976F;

		bodyModel[331].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 444
		bodyModel[331].setRotationPoint(-83F, -34F, 5F);
		bodyModel[331].rotateAngleZ = 0.78539816F;

		bodyModel[332].addShapeBox(0F, 0F, 0F, 1, 13, 10, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 445
		bodyModel[332].setRotationPoint(-77F, -47F, -5F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 446
		bodyModel[333].setRotationPoint(-78.3F, -46.3F, 1F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 447
		bodyModel[334].setRotationPoint(-78.3F, -46.3F, -2F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 1, 13, 8, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 448
		bodyModel[335].setRotationPoint(-78F, -46F, -4F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 449
		bodyModel[336].setRotationPoint(-83F, -34F, -6F);
		bodyModel[336].rotateAngleZ = 0.78539816F;

		bodyModel[337].addShapeBox(0F, 0F, 0F, 1, 19, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 450
		bodyModel[337].setRotationPoint(-77F, -44F, 3F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 451
		bodyModel[338].setRotationPoint(-82F, -33F, 3F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 452
		bodyModel[339].setRotationPoint(-82F, -33F, -4F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 1, 19, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 453
		bodyModel[340].setRotationPoint(-77F, -44F, -4F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 454
		bodyModel[341].setRotationPoint(-75.5F, -48.5F, -1.5F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 455
		bodyModel[342].setRotationPoint(-75.5F, -49.5F, -1.5F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 456
		bodyModel[343].setRotationPoint(-75.5F, -50.5F, -1.5F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 457
		bodyModel[344].setRotationPoint(-75F, -51F, -3F);
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 585, 57, textureX, textureY); // Box 316
		leftWingModel[1] = new ModelRendererTurbo(this, 681, 57, textureX, textureY); // Box 317
		leftWingModel[2] = new ModelRendererTurbo(this, 1113, 57, textureX, textureY); // Box 318
		leftWingModel[3] = new ModelRendererTurbo(this, 1209, 57, textureX, textureY); // Box 319
		leftWingModel[4] = new ModelRendererTurbo(this, 1489, 57, textureX, textureY); // Box 320
		leftWingModel[5] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 321
		leftWingModel[6] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 322
		leftWingModel[7] = new ModelRendererTurbo(this, 225, 65, textureX, textureY); // Box 323
		leftWingModel[8] = new ModelRendererTurbo(this, 1601, 65, textureX, textureY); // Box 324
		leftWingModel[9] = new ModelRendererTurbo(this, 1753, 65, textureX, textureY); // Box 325
		leftWingModel[10] = new ModelRendererTurbo(this, 753, 73, textureX, textureY); // Box 326
		leftWingModel[11] = new ModelRendererTurbo(this, 833, 73, textureX, textureY); // Box 327
		leftWingModel[12] = new ModelRendererTurbo(this, 657, 57, textureX, textureY); // Box 328
		leftWingModel[13] = new ModelRendererTurbo(this, 1009, 57, textureX, textureY); // Box 329
		leftWingModel[14] = new ModelRendererTurbo(this, 1185, 57, textureX, textureY); // Box 330
		leftWingModel[15] = new ModelRendererTurbo(this, 657, 97, textureX, textureY); // Box 121
		leftWingModel[16] = new ModelRendererTurbo(this, 1953, 201, textureX, textureY); // Box 195
		leftWingModel[17] = new ModelRendererTurbo(this, 1769, 209, textureX, textureY); // Box 196
		leftWingModel[18] = new ModelRendererTurbo(this, 737, 225, textureX, textureY); // Box 197
		leftWingModel[19] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Box 198
		leftWingModel[20] = new ModelRendererTurbo(this, 297, 233, textureX, textureY); // Box 199
		leftWingModel[21] = new ModelRendererTurbo(this, 409, 233, textureX, textureY); // Box 200
		leftWingModel[22] = new ModelRendererTurbo(this, 521, 233, textureX, textureY); // Box 201
		leftWingModel[23] = new ModelRendererTurbo(this, 1113, 233, textureX, textureY); // Box 202
		leftWingModel[24] = new ModelRendererTurbo(this, 1225, 233, textureX, textureY); // Box 203
		leftWingModel[25] = new ModelRendererTurbo(this, 1377, 233, textureX, textureY); // Box 204
		leftWingModel[26] = new ModelRendererTurbo(this, 1457, 233, textureX, textureY); // Box 205
		leftWingModel[27] = new ModelRendererTurbo(this, 1537, 233, textureX, textureY); // Box 206
		leftWingModel[28] = new ModelRendererTurbo(this, 1113, 145, textureX, textureY); // Box 207
		leftWingModel[29] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 208
		leftWingModel[30] = new ModelRendererTurbo(this, 57, 153, textureX, textureY); // Box 209
		leftWingModel[31] = new ModelRendererTurbo(this, 497, 273, textureX, textureY); // Box 210

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 17, 10, 30, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 316
		leftWingModel[0].setRotationPoint(-47F, -46.5F, -74F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 17, 9, 30, 0F,0F, 0F, -10F, 0F, 1F, -9F, 0F, 1F, -9F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 317
		leftWingModel[1].setRotationPoint(-47F, -55.5F, -74F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 17, 9, 30, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 1F, -9F, 0F, 1F, -9F, 0F, 0F, -10F); // Box 318
		leftWingModel[2].setRotationPoint(-47F, -36.5F, -74F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 41, 10, 32, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 319
		leftWingModel[3].setRotationPoint(-30F, -46.5F, -75F);

		leftWingModel[4].addShapeBox(0F, 0F, 0F, 20, 10, 32, 0F,0F, 0F, -10F, 0F, -0.5F, -12F, 0F, -0.5F, -12F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 320
		leftWingModel[4].setRotationPoint(-30F, -56.5F, -75F);

		leftWingModel[5].addShapeBox(0F, 0F, 0F, 21, 10, 32, 0F,0F, -0.5F, -12F, 0F, -3F, -14F, 0F, -3F, -14F, 0F, -0.5F, -12F, 0F, 0F, -1.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -1.5F); // Box 321
		leftWingModel[5].setRotationPoint(-10F, -56.5F, -75F);

		leftWingModel[6].addShapeBox(0F, 0F, 0F, 26, 10, 26, 0F,0F, 0F, 0F, 8F, 0F, -7F, 8F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F); // Box 322
		leftWingModel[6].setRotationPoint(11F, -46.5F, -72F);

		leftWingModel[7].addShapeBox(0F, 0F, 0F, 26, 10, 26, 0F,0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, -2F, -8F, -12F, -5F, -7F, -12F, -5F, -7F, 0F, -2F, -8F); // Box 323
		leftWingModel[7].setRotationPoint(11F, -36.5F, -72F);

		leftWingModel[8].addShapeBox(0F, 0F, 0F, 41, 10, 32, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, -2F, -11F, 0F, -2F, -11F, 0F, 0F, -10F); // Box 324
		leftWingModel[8].setRotationPoint(-30F, -36.5F, -75F);

		leftWingModel[9].addShapeBox(0F, 0F, 0F, 7, 9, 30, 0F,0F, -4.5F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, -4.5F, -10F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 325
		leftWingModel[9].setRotationPoint(-54F, -55.5F, -74F);

		leftWingModel[10].addShapeBox(0F, 0F, 0F, 7, 9, 30, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -4.5F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, -4.5F, -10F); // Box 326
		leftWingModel[10].setRotationPoint(-54F, -36.5F, -74F);

		leftWingModel[11].addShapeBox(0F, 0F, 0F, 7, 10, 30, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 327
		leftWingModel[11].setRotationPoint(-54F, -46.5F, -74F);

		leftWingModel[12].addShapeBox(0F, 0F, 0F, 12, 4, 12, 0F,0F, -1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -5F, 0F, -1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -5F); // Box 328
		leftWingModel[12].setRotationPoint(-66F, -43.5F, -65F);

		leftWingModel[13].addShapeBox(0F, 0F, 0F, 12, 4, 12, 0F,-3F, -2.5F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, -3F, -2.5F, -5F, 0F, 1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -5F); // Box 329
		leftWingModel[13].setRotationPoint(-66F, -47.5F, -65F);

		leftWingModel[14].addShapeBox(0F, 0F, 0F, 12, 4, 12, 0F,0F, 1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -5F, -3F, -2.5F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, -3F, -2.5F, -5F); // Box 330
		leftWingModel[14].setRotationPoint(-66F, -39.5F, -65F);

		leftWingModel[15].addShapeBox(0F, 0F, 0F, 34, 8, 26, 0F,0F, -1F, -11F, -12F, -5F, -12F, -12F, -5F, -12F, 0F, -1F, -11F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F); // Box 121
		leftWingModel[15].setRotationPoint(11F, -54.5F, -72F);

		leftWingModel[16].addShapeBox(0F, 0F, 0F, 17, 10, 30, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 195
		leftWingModel[16].setRotationPoint(-47F, -46.5F, 44F);

		leftWingModel[17].addShapeBox(0F, 0F, 0F, 17, 9, 30, 0F,0F, 0F, -10F, 0F, 1F, -9F, 0F, 1F, -9F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 196
		leftWingModel[17].setRotationPoint(-47F, -55.5F, 44F);

		leftWingModel[18].addShapeBox(0F, 0F, 0F, 17, 9, 30, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 1F, -9F, 0F, 1F, -9F, 0F, 0F, -10F); // Box 197
		leftWingModel[18].setRotationPoint(-47F, -36.5F, 44F);

		leftWingModel[19].addShapeBox(0F, 0F, 0F, 41, 10, 32, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 198
		leftWingModel[19].setRotationPoint(-30F, -46.5F, 43F);

		leftWingModel[20].addShapeBox(0F, 0F, 0F, 20, 10, 32, 0F,0F, 0F, -10F, 0F, -0.5F, -12F, 0F, -0.5F, -12F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 199
		leftWingModel[20].setRotationPoint(-30F, -56.5F, 43F);

		leftWingModel[21].addShapeBox(0F, 0F, 0F, 21, 10, 32, 0F,0F, -0.5F, -12F, 0F, -3F, -14F, 0F, -3F, -14F, 0F, -0.5F, -12F, 0F, 0F, -1.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -1.5F); // Box 200
		leftWingModel[21].setRotationPoint(-10F, -56.5F, 43F);

		leftWingModel[22].addShapeBox(0F, 0F, 0F, 26, 10, 26, 0F,0F, 0F, 0F, 8F, 0F, -7F, 8F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F); // Box 201
		leftWingModel[22].setRotationPoint(11F, -46.5F, 46F);

		leftWingModel[23].addShapeBox(0F, 0F, 0F, 26, 10, 26, 0F,0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, -2F, -8F, -12F, -5F, -7F, -12F, -5F, -7F, 0F, -2F, -8F); // Box 202
		leftWingModel[23].setRotationPoint(11F, -36.5F, 46F);

		leftWingModel[24].addShapeBox(0F, 0F, 0F, 41, 10, 32, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, -2F, -11F, 0F, -2F, -11F, 0F, 0F, -10F); // Box 203
		leftWingModel[24].setRotationPoint(-30F, -36.5F, 43F);

		leftWingModel[25].addShapeBox(0F, 0F, 0F, 7, 9, 30, 0F,0F, -4.5F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, -4.5F, -10F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 204
		leftWingModel[25].setRotationPoint(-54F, -55.5F, 44F);

		leftWingModel[26].addShapeBox(0F, 0F, 0F, 7, 9, 30, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -4.5F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, -4.5F, -10F); // Box 205
		leftWingModel[26].setRotationPoint(-54F, -36.5F, 44F);

		leftWingModel[27].addShapeBox(0F, 0F, 0F, 7, 10, 30, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 206
		leftWingModel[27].setRotationPoint(-54F, -46.5F, 44F);

		leftWingModel[28].addShapeBox(0F, 0F, 0F, 12, 4, 12, 0F,0F, -1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -5F, 0F, -1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -5F); // Box 207
		leftWingModel[28].setRotationPoint(-66F, -43.5F, 53F);

		leftWingModel[29].addShapeBox(0F, 0F, 0F, 12, 4, 12, 0F,-3F, -2.5F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, -3F, -2.5F, -5F, 0F, 1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -5F); // Box 208
		leftWingModel[29].setRotationPoint(-66F, -47.5F, 53F);

		leftWingModel[30].addShapeBox(0F, 0F, 0F, 12, 4, 12, 0F,0F, 1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -5F, -3F, -2.5F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, -3F, -2.5F, -5F); // Box 209
		leftWingModel[30].setRotationPoint(-66F, -39.5F, 53F);

		leftWingModel[31].addShapeBox(0F, 0F, 0F, 34, 8, 26, 0F,0F, -1F, -11F, -12F, -5F, -12F, -12F, -5F, -12F, 0F, -1F, -11F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F); // Box 210
		leftWingModel[31].setRotationPoint(11F, -54.5F, 46F);
	}

	private void inittailWheelModel_1()
	{
		tailWheelModel[0] = new ModelRendererTurbo(this, 977, 193, textureX, textureY); // Box 433
		tailWheelModel[1] = new ModelRendererTurbo(this, 1113, 57, textureX, textureY); // Box 434
		tailWheelModel[2] = new ModelRendererTurbo(this, 753, 57, textureX, textureY); // Box 435
		tailWheelModel[3] = new ModelRendererTurbo(this, 1049, 57, textureX, textureY); // Box 436
		tailWheelModel[4] = new ModelRendererTurbo(this, 1489, 57, textureX, textureY); // Box 437
		tailWheelModel[5] = new ModelRendererTurbo(this, 825, 161, textureX, textureY); // Box 438
		tailWheelModel[6] = new ModelRendererTurbo(this, 1897, 169, textureX, textureY); // Box 439
		tailWheelModel[7] = new ModelRendererTurbo(this, 1233, 177, textureX, textureY); // Box 440

		tailWheelModel[0].addShapeBox(0F, 0F, 0F, 16, 7, 4, 0F,0F, -4F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -4F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F); // Box 433
		tailWheelModel[0].setRotationPoint(207F, -44F, -2F);

		tailWheelModel[1].addShapeBox(0F, 0F, 0F, 10, 2, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F); // Box 434
		tailWheelModel[1].setRotationPoint(215F, -37F, -2F);

		tailWheelModel[2].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 435
		tailWheelModel[2].setRotationPoint(221F, -35F, -3F);

		tailWheelModel[3].addShapeBox(0F, 0F, 0F, 9, 5, 1, 0F,-4F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -4F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 436
		tailWheelModel[3].setRotationPoint(221F, -35F, -3F);

		tailWheelModel[4].addShapeBox(0F, 0F, 0F, 9, 5, 1, 0F,-4F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -4F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 437
		tailWheelModel[4].setRotationPoint(221F, -35F, 2F);

		tailWheelModel[5].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 438
		tailWheelModel[5].setRotationPoint(224F, -33F, -2F);

		tailWheelModel[6].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 439
		tailWheelModel[6].setRotationPoint(224F, -37F, -2F);

		tailWheelModel[7].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 440
		tailWheelModel[7].setRotationPoint(224F, -29F, -2F);
	}

	private void initleftWingWheelModel_1()
	{
		leftWingWheelModel[0] = new ModelRendererTurbo(this, 809, 225, textureX, textureY); // Box 206
		leftWingWheelModel[1] = new ModelRendererTurbo(this, 121, 233, textureX, textureY); // Box 207
		leftWingWheelModel[2] = new ModelRendererTurbo(this, 929, 233, textureX, textureY); // Box 208
		leftWingWheelModel[3] = new ModelRendererTurbo(this, 2025, 113, textureX, textureY); // Box 209
		leftWingWheelModel[4] = new ModelRendererTurbo(this, 1601, 57, textureX, textureY); // Box 210
		leftWingWheelModel[5] = new ModelRendererTurbo(this, 417, 185, textureX, textureY); // Box 211
		leftWingWheelModel[6] = new ModelRendererTurbo(this, 657, 81, textureX, textureY); // Box 212
		leftWingWheelModel[7] = new ModelRendererTurbo(this, 1169, 129, textureX, textureY); // Box 213
		leftWingWheelModel[8] = new ModelRendererTurbo(this, 1185, 81, textureX, textureY); // Box 214
		leftWingWheelModel[9] = new ModelRendererTurbo(this, 1497, 41, textureX, textureY); // Box 215

		leftWingWheelModel[0].addShapeBox(0F, 0F, 0F, 24, 8, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		leftWingWheelModel[0].setRotationPoint(-37F, -6F, -64F);

		leftWingWheelModel[1].addShapeBox(0F, 0F, 0F, 24, 8, 11, 0F,-8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		leftWingWheelModel[1].setRotationPoint(-37F, -14F, -64F);

		leftWingWheelModel[2].addShapeBox(0F, 0F, 0F, 24, 8, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F); // Box 208
		leftWingWheelModel[2].setRotationPoint(-37F, 2F, -64F);

		leftWingWheelModel[3].addShapeBox(0F, 0F, 0F, 2, 32, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 209
		leftWingWheelModel[3].setRotationPoint(-26F, -30F, -66F);

		leftWingWheelModel[4].addShapeBox(0F, 0F, 0F, 17, 2, 2, 0F,0F, 0F, 0F, 0F, 16F, 0F, 0F, 16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, 0F); // Box 210
		leftWingWheelModel[4].setRotationPoint(-24F, 0F, -66F);

		leftWingWheelModel[5].addShapeBox(0F, 0F, 0F, 2, 2, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
		leftWingWheelModel[5].setRotationPoint(-7F, -16F, -66F);

		leftWingWheelModel[6].addShapeBox(0F, 0F, 0F, 18, 2, 2, 0F,0F, 0F, 0F, 0F, 16F, 0F, 0F, 16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, 0F); // Box 212
		leftWingWheelModel[6].setRotationPoint(-7F, -16F, -60F);

		leftWingWheelModel[7].addShapeBox(0F, 0F, 0F, 2, 32, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 213
		leftWingWheelModel[7].setRotationPoint(-26F, -30F, -53F);

		leftWingWheelModel[8].addShapeBox(0F, 0F, 0F, 17, 2, 2, 0F,0F, 0F, 0F, 0F, 16F, 0F, 0F, 16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, 0F); // Box 214
		leftWingWheelModel[8].setRotationPoint(-24F, 0F, -53F);

		leftWingWheelModel[9].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 215
		leftWingWheelModel[9].setRotationPoint(-26F, -18F, -64F);
	}

	private void initrightWingWheelModel_1()
	{
		rightWingWheelModel[0] = new ModelRendererTurbo(this, 1769, 249, textureX, textureY); // Box 296
		rightWingWheelModel[1] = new ModelRendererTurbo(this, 1953, 249, textureX, textureY); // Box 297
		rightWingWheelModel[2] = new ModelRendererTurbo(this, 737, 265, textureX, textureY); // Box 298
		rightWingWheelModel[3] = new ModelRendererTurbo(this, 1401, 129, textureX, textureY); // Box 299
		rightWingWheelModel[4] = new ModelRendererTurbo(this, 657, 137, textureX, textureY); // Box 300
		rightWingWheelModel[5] = new ModelRendererTurbo(this, 665, 185, textureX, textureY); // Box 301
		rightWingWheelModel[6] = new ModelRendererTurbo(this, 697, 137, textureX, textureY); // Box 302
		rightWingWheelModel[7] = new ModelRendererTurbo(this, 441, 145, textureX, textureY); // Box 303
		rightWingWheelModel[8] = new ModelRendererTurbo(this, 769, 161, textureX, textureY); // Box 304
		rightWingWheelModel[9] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 305

		rightWingWheelModel[0].addShapeBox(0F, 0F, 0F, 24, 8, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 296
		rightWingWheelModel[0].setRotationPoint(-37F, -6F, 53F);

		rightWingWheelModel[1].addShapeBox(0F, 0F, 0F, 24, 8, 11, 0F,-8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 297
		rightWingWheelModel[1].setRotationPoint(-37F, -14F, 53F);

		rightWingWheelModel[2].addShapeBox(0F, 0F, 0F, 24, 8, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F); // Box 298
		rightWingWheelModel[2].setRotationPoint(-37F, 2F, 53F);

		rightWingWheelModel[3].addShapeBox(0F, 0F, 0F, 2, 32, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		rightWingWheelModel[3].setRotationPoint(-26F, -30F, 64F);

		rightWingWheelModel[4].addShapeBox(0F, 0F, 0F, 17, 2, 2, 0F,0F, 0F, 0F, 0F, 16F, 0F, 0F, 16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, 0F); // Box 300
		rightWingWheelModel[4].setRotationPoint(-24F, 0F, 64F);

		rightWingWheelModel[5].addShapeBox(0F, 0F, 0F, 2, 2, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
		rightWingWheelModel[5].setRotationPoint(-7F, -16F, 51F);

		rightWingWheelModel[6].addShapeBox(0F, 0F, 0F, 18, 2, 2, 0F,0F, 0F, 0F, 0F, 16F, 0F, 0F, 16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, 0F); // Box 302
		rightWingWheelModel[6].setRotationPoint(-7F, -16F, 58F);

		rightWingWheelModel[7].addShapeBox(0F, 0F, 0F, 2, 32, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 303
		rightWingWheelModel[7].setRotationPoint(-26F, -30F, 51F);

		rightWingWheelModel[8].addShapeBox(0F, 0F, 0F, 17, 2, 2, 0F,0F, 0F, 0F, 0F, 16F, 0F, 0F, 16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, 0F); // Box 304
		rightWingWheelModel[8].setRotationPoint(-24F, 0F, 51F);

		rightWingWheelModel[9].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305
		rightWingWheelModel[9].setRotationPoint(-26F, -18F, 53F);
	}

	private void inithelicopterModeParts_1()
	{
		helicopterModeParts[0] = new ModelRendererTurbo(this, 1329, 121, textureX, textureY); // Box 484
		helicopterModeParts[1] = new ModelRendererTurbo(this, 1817, 81, textureX, textureY); // Box 485
		helicopterModeParts[2] = new ModelRendererTurbo(this, 601, 121, textureX, textureY); // Box 487
		helicopterModeParts[3] = new ModelRendererTurbo(this, 41, 161, textureX, textureY); // Box 488
		helicopterModeParts[4] = new ModelRendererTurbo(this, 849, 161, textureX, textureY); // Box 489
		helicopterModeParts[5] = new ModelRendererTurbo(this, 185, 153, textureX, textureY); // Box 490
		helicopterModeParts[6] = new ModelRendererTurbo(this, 1385, 129, textureX, textureY); // Box 491
		helicopterModeParts[7] = new ModelRendererTurbo(this, 1489, 129, textureX, textureY); // Box 492
		helicopterModeParts[8] = new ModelRendererTurbo(this, 1737, 177, textureX, textureY); // Box 493
		helicopterModeParts[9] = new ModelRendererTurbo(this, 593, 161, textureX, textureY); // Box 494
		helicopterModeParts[10] = new ModelRendererTurbo(this, 1385, 169, textureX, textureY); // Box 495
		helicopterModeParts[11] = new ModelRendererTurbo(this, 225, 105, textureX, textureY); // Box 496
		helicopterModeParts[12] = new ModelRendererTurbo(this, 617, 121, textureX, textureY); // Box 497
		helicopterModeParts[13] = new ModelRendererTurbo(this, 553, 137, textureX, textureY); // Box 498
		helicopterModeParts[14] = new ModelRendererTurbo(this, 561, 137, textureX, textureY); // Box 499
		helicopterModeParts[15] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 578
		helicopterModeParts[16] = new ModelRendererTurbo(this, 1401, 185, textureX, textureY); // Box 579
		helicopterModeParts[17] = new ModelRendererTurbo(this, 377, 233, textureX, textureY); // Box 580
		helicopterModeParts[18] = new ModelRendererTurbo(this, 1329, 193, textureX, textureY); // Box 582
		helicopterModeParts[19] = new ModelRendererTurbo(this, 409, 121, textureX, textureY); // Box 583
		helicopterModeParts[20] = new ModelRendererTurbo(this, 881, 137, textureX, textureY); // Box 584
		helicopterModeParts[21] = new ModelRendererTurbo(this, 961, 177, textureX, textureY); // Box 585
		helicopterModeParts[22] = new ModelRendererTurbo(this, 41, 153, textureX, textureY); // Box 586
		helicopterModeParts[23] = new ModelRendererTurbo(this, 1049, 161, textureX, textureY); // Box 587
		helicopterModeParts[24] = new ModelRendererTurbo(this, 401, 233, textureX, textureY); // Box 588
		helicopterModeParts[25] = new ModelRendererTurbo(this, 2033, 169, textureX, textureY); // Box 589
		helicopterModeParts[26] = new ModelRendererTurbo(this, 9, 177, textureX, textureY); // Box 590
		helicopterModeParts[27] = new ModelRendererTurbo(this, 553, 89, textureX, textureY); // Box 591
		helicopterModeParts[28] = new ModelRendererTurbo(this, 1769, 89, textureX, textureY); // Box 592
		helicopterModeParts[29] = new ModelRendererTurbo(this, 897, 97, textureX, textureY); // Box 593
		helicopterModeParts[30] = new ModelRendererTurbo(this, 425, 145, textureX, textureY); // Box 594

		helicopterModeParts[0].addShapeBox(0F, 0F, 0F, 12, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 484
		helicopterModeParts[0].setRotationPoint(97F, -66F, -8F);

		helicopterModeParts[1].addShapeBox(0F, 0F, 0F, 3, 5, 2, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 1F); // Box 485
		helicopterModeParts[1].setRotationPoint(94F, -66F, -8F);

		helicopterModeParts[2].addShapeBox(0F, 0F, 0F, 3, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, 1F, 0F, 0F, 0F); // Box 487
		helicopterModeParts[2].setRotationPoint(109F, -66F, -8F);

		helicopterModeParts[3].addShapeBox(0F, 0F, 0F, 2, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 488
		helicopterModeParts[3].setRotationPoint(110F, -66F, -5F);

		helicopterModeParts[4].addShapeBox(0F, 0F, 0F, 2, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 489
		helicopterModeParts[4].setRotationPoint(94F, -66F, -5F);

		helicopterModeParts[5].addShapeBox(0F, 0F, 0F, 12, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 490
		helicopterModeParts[5].setRotationPoint(97F, -66F, 6F);

		helicopterModeParts[6].addShapeBox(0F, 0F, 0F, 3, 5, 2, 0F,-2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 491
		helicopterModeParts[6].setRotationPoint(94F, -66F, 6F);

		helicopterModeParts[7].addShapeBox(0F, 0F, 0F, 3, 5, 2, 0F,0F, 0F, 0F, -2F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 492
		helicopterModeParts[7].setRotationPoint(109F, -66F, 6F);

		helicopterModeParts[8].addShapeBox(0F, 0F, 0F, 6, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 493
		helicopterModeParts[8].setRotationPoint(112F, -65F, -4F);

		helicopterModeParts[9].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 494
		helicopterModeParts[9].setRotationPoint(114F, -67F, -4F);

		helicopterModeParts[10].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 495
		helicopterModeParts[10].setRotationPoint(114F, -68F, -4F);

		helicopterModeParts[11].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 496
		helicopterModeParts[11].setRotationPoint(97F, -61F, -8F);

		helicopterModeParts[12].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 497
		helicopterModeParts[12].setRotationPoint(97F, -61F, 7F);

		helicopterModeParts[13].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 498
		helicopterModeParts[13].setRotationPoint(108F, -61F, 7F);

		helicopterModeParts[14].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 499
		helicopterModeParts[14].setRotationPoint(108F, -61F, -8F);

		helicopterModeParts[15].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 578
		helicopterModeParts[15].setRotationPoint(98F, -66F, 3F);

		helicopterModeParts[16].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 579
		helicopterModeParts[16].setRotationPoint(98F, -66F, -4F);

		helicopterModeParts[17].addShapeBox(0F, 0F, 0F, 1, 15, 10, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 580
		helicopterModeParts[17].setRotationPoint(99F, -69F, -5F);

		helicopterModeParts[18].addShapeBox(0F, 1F, 0F, 10, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 582
		helicopterModeParts[18].setRotationPoint(99F, -55F, -5F);
		helicopterModeParts[18].rotateAngleZ = 0.08726646F;

		helicopterModeParts[19].addShapeBox(-2F, 0.25F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 583
		helicopterModeParts[19].setRotationPoint(101F, -55F, -5F);
		helicopterModeParts[19].rotateAngleZ = 0.08726646F;

		helicopterModeParts[20].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 584
		helicopterModeParts[20].setRotationPoint(99F, -61F, -6F);
		helicopterModeParts[20].rotateAngleZ = -0.78539816F;

		helicopterModeParts[21].addShapeBox(0F, -0.3F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 585
		helicopterModeParts[21].setRotationPoint(108F, -55F, -5F);
		helicopterModeParts[21].rotateAngleZ = 0.12217305F;

		helicopterModeParts[22].addShapeBox(-2F, 0.25F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 586
		helicopterModeParts[22].setRotationPoint(101F, -55F, 4F);
		helicopterModeParts[22].rotateAngleZ = 0.08726646F;

		helicopterModeParts[23].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 587
		helicopterModeParts[23].setRotationPoint(99F, -61F, 5F);
		helicopterModeParts[23].rotateAngleZ = -0.78539816F;

		helicopterModeParts[24].addShapeBox(0F, 0F, 0F, 1, 15, 8, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 588
		helicopterModeParts[24].setRotationPoint(100F, -68F, -4F);

		helicopterModeParts[25].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 589
		helicopterModeParts[25].setRotationPoint(100.3F, -68.3F, 1F);

		helicopterModeParts[26].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 590
		helicopterModeParts[26].setRotationPoint(100.3F, -68.3F, -2F);

		helicopterModeParts[27].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 591
		helicopterModeParts[27].setRotationPoint(97.5F, -70.5F, -1.5F);

		helicopterModeParts[28].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 592
		helicopterModeParts[28].setRotationPoint(97.5F, -71.5F, -1.5F);

		helicopterModeParts[29].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 593
		helicopterModeParts[29].setRotationPoint(97.5F, -72.5F, -1.5F);

		helicopterModeParts[30].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 594
		helicopterModeParts[30].setRotationPoint(97F, -73F, -3F);
	}

	private void initplaneModeParts_1()
	{
		planeModeParts[0] = new ModelRendererTurbo(this, 553, 89, textureX, textureY); // Box 239
		planeModeParts[1] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 240
		planeModeParts[2] = new ModelRendererTurbo(this, 769, 57, textureX, textureY); // Box 241
		planeModeParts[3] = new ModelRendererTurbo(this, 305, 65, textureX, textureY); // Box 242
		planeModeParts[4] = new ModelRendererTurbo(this, 1049, 65, textureX, textureY); // Box 243
		planeModeParts[5] = new ModelRendererTurbo(this, 1489, 65, textureX, textureY); // Box 244
		planeModeParts[6] = new ModelRendererTurbo(this, 1961, 49, textureX, textureY); // Box 245
		planeModeParts[7] = new ModelRendererTurbo(this, 1113, 65, textureX, textureY); // Box 246
		planeModeParts[8] = new ModelRendererTurbo(this, 385, 57, textureX, textureY); // Box 247
		planeModeParts[9] = new ModelRendererTurbo(this, 393, 57, textureX, textureY); // Box 248
		planeModeParts[10] = new ModelRendererTurbo(this, 1513, 57, textureX, textureY); // Box 250
		planeModeParts[11] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 251
		planeModeParts[12] = new ModelRendererTurbo(this, 1609, 65, textureX, textureY); // Box 252
		planeModeParts[13] = new ModelRendererTurbo(this, 1753, 65, textureX, textureY); // Box 253
		planeModeParts[14] = new ModelRendererTurbo(this, 553, 57, textureX, textureY); // Box 263
		planeModeParts[15] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 264
		planeModeParts[16] = new ModelRendererTurbo(this, 337, 41, textureX, textureY); // Box 962
		planeModeParts[17] = new ModelRendererTurbo(this, 641, 49, textureX, textureY); // Box 964
		planeModeParts[18] = new ModelRendererTurbo(this, 1817, 49, textureX, textureY); // Box 966
		planeModeParts[19] = new ModelRendererTurbo(this, 601, 57, textureX, textureY); // Box 782
		planeModeParts[20] = new ModelRendererTurbo(this, 609, 57, textureX, textureY); // Box 783
		planeModeParts[21] = new ModelRendererTurbo(this, 657, 57, textureX, textureY); // Box 786
		planeModeParts[22] = new ModelRendererTurbo(this, 697, 57, textureX, textureY); // Box 789
		planeModeParts[23] = new ModelRendererTurbo(this, 1201, 1, textureX, textureY); // Box 791
		planeModeParts[24] = new ModelRendererTurbo(this, 1321, 1, textureX, textureY); // Box 792

		planeModeParts[0].addShapeBox(0F, 1F, 0F, 10, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
		planeModeParts[0].setRotationPoint(-31F, -49F, -12F);
		planeModeParts[0].rotateAngleZ = -0.10471976F;

		planeModeParts[1].addShapeBox(9F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		planeModeParts[1].setRotationPoint(-31F, -49F, -12F);
		planeModeParts[1].rotateAngleZ = -0.10471976F;

		planeModeParts[2].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		planeModeParts[2].setRotationPoint(-31F, -49F, -12F);
		planeModeParts[2].rotateAngleZ = -0.10471976F;

		planeModeParts[3].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		planeModeParts[3].setRotationPoint(-31F, -49F, -3F);
		planeModeParts[3].rotateAngleZ = -0.10471976F;

		planeModeParts[4].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		planeModeParts[4].setRotationPoint(-31F, -49F, -12F);
		planeModeParts[4].rotateAngleZ = -0.10471976F;

		planeModeParts[5].addShapeBox(0F, 0F, 0F, 1, 13, 10, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		planeModeParts[5].setRotationPoint(-22F, -61F, -12F);

		planeModeParts[6].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		planeModeParts[6].setRotationPoint(-20F, -65F, -10F);

		planeModeParts[7].addShapeBox(0F, 0F, 0F, 1, 13, 8, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 246
		planeModeParts[7].setRotationPoint(-23F, -60F, -11F);

		planeModeParts[8].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		planeModeParts[8].setRotationPoint(-23.3F, -60.3F, -9F);

		planeModeParts[9].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		planeModeParts[9].setRotationPoint(-23.3F, -60.3F, -6F);

		planeModeParts[10].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 250
		planeModeParts[10].setRotationPoint(-22F, -58F, -11F);

		planeModeParts[11].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 251
		planeModeParts[11].setRotationPoint(-22F, -58F, -4F);

		planeModeParts[12].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 252
		planeModeParts[12].setRotationPoint(-28F, -48F, -13F);
		planeModeParts[12].rotateAngleZ = 0.78539816F;

		planeModeParts[13].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 253
		planeModeParts[13].setRotationPoint(-28F, -48F, -2F);
		planeModeParts[13].rotateAngleZ = 0.78539816F;

		planeModeParts[14].addShapeBox(-1F, -1F, 0F, 2, 11, 2, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 263
		planeModeParts[14].setRotationPoint(-32.5F, -53.25F, -8F);
		planeModeParts[14].rotateAngleZ = -1.13446401F;

		planeModeParts[15].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 264
		planeModeParts[15].setRotationPoint(-32F, -57F, -7.5F);

		planeModeParts[16].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 962
		planeModeParts[16].setRotationPoint(-20.5F, -64.5F, -8.5F);

		planeModeParts[17].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 964
		planeModeParts[17].setRotationPoint(-20.5F, -63.5F, -8.5F);

		planeModeParts[18].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 966
		planeModeParts[18].setRotationPoint(-20.5F, -62.5F, -8.5F);

		planeModeParts[19].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 782
		planeModeParts[19].setRotationPoint(-27F, -47F, -11F);

		planeModeParts[20].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 783
		planeModeParts[20].setRotationPoint(-27F, -47F, -4F);

		planeModeParts[21].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 786
		planeModeParts[21].setRotationPoint(-32F, -56.75F, -6.5F);

		planeModeParts[22].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 789
		planeModeParts[22].setRotationPoint(-32F, -56.75F, -10.5F);

		planeModeParts[23].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 791
		planeModeParts[23].setRotationPoint(-32F, -59.75F, -10.5F);

		planeModeParts[24].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 792
		planeModeParts[24].setRotationPoint(-32F, -59.75F, -4.5F);
	}

	private void initPropeller()
	{
		propellerModels = new ModelRendererTurbo[2][3];
		propellerModels[0] = makeProp1(-59F, -41.5F, -59F);
		propellerModels[1] = makeProp2(-59F, -41.5F, 59F);
	}

	private ModelRendererTurbo[] makeProp1(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[3];
		prop[0] = new ModelRendererTurbo(this, 0, 335, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 335, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 0, 335, textureX, textureY);
		prop[0].addBox(-1F, -35F, -2.5F, 2, 35, 5, 0.0F);
		prop[1].addBox(-1F, -35F, -2.5F, 2, 35, 5, 0.0F);
		prop[2].addBox(-1F, -35F, -2.5F, 2, 35, 5, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		return prop;
	}

	private ModelRendererTurbo[] makeProp2(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[3];
		prop[0] = new ModelRendererTurbo(this, 0, 335, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 335, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 0, 335, textureX, textureY);
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

		gun_2_Model[0] = new ModelRendererTurbo[4];
		gun_2_Model[0][0] = new ModelRendererTurbo(this, 461, 355, textureX, textureY); // Box 0
		gun_2_Model[0][1] = new ModelRendererTurbo(this, 477, 355, textureX, textureY); // Box 0
		gun_2_Model[0][2] = new ModelRendererTurbo(this, 581, 347, textureX, textureY); // Box 0
		gun_2_Model[0][3] = new ModelRendererTurbo(this, 493, 355, textureX, textureY); // Box 35

		gun_2_Model[0][0].addShapeBox(-0.5F, -0.5F, -1.5F, 1, 1, 3, 0F,-0.25F, -0.25F, -0.1F, -0.25F, -0.25F, -0.1F, -0.25F, -0.25F, -0.1F, -0.25F, -0.25F, -0.1F, -0.25F, -0.25F, -0.1F, -0.25F, -0.25F, -0.1F, -0.25F, -0.25F, -0.1F, -0.25F, -0.25F, -0.1F); // Box 0

		gun_2_Model[0][1].addShapeBox(-1F, 0.5F, -1.5F, 2, 1, 3, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0

		gun_2_Model[0][2].addShapeBox(-1F, -0.5F, -1.5F, 2, 2, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.8F, -0.5F, 0F, -0.8F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.8F); // Box 0

		gun_2_Model[0][3].addShapeBox(-1F, -0.5F, 0.5F, 2, 2, 1, 0F,-0.5F, 0F, -0.8F, -0.5F, 0F, -0.8F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 35

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[0])
		{
			gunPart.setRotationPoint(115F, -69F, 0F);
		}


		gun_2_Model[1] = new ModelRendererTurbo[2];
		gun_2_Model[1][0] = new ModelRendererTurbo(this, 525, 331, textureX, textureY); // Box 0
		gun_2_Model[1][1] = new ModelRendererTurbo(this, 461, 339, textureX, textureY); // Box 0

		gun_2_Model[1][0].addShapeBox(2F, -0.5F, -0.5F, 15, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 0

		gun_2_Model[1][1].addShapeBox(2F, -0.5F, -0.5F, 5, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 0

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[1])
		{
			gunPart.setRotationPoint(115F, -69F, 0F);
		}


		gun_2_Model[2] = new ModelRendererTurbo[29];
		gun_2_Model[2][0] = new ModelRendererTurbo(this, 461, 331, textureX, textureY); // Box 0
		gun_2_Model[2][1] = new ModelRendererTurbo(this, 493, 331, textureX, textureY); // Box 0
		gun_2_Model[2][2] = new ModelRendererTurbo(this, 565, 331, textureX, textureY); // Box 0
		gun_2_Model[2][3] = new ModelRendererTurbo(this, 581, 331, textureX, textureY); // Box 0
		gun_2_Model[2][4] = new ModelRendererTurbo(this, 477, 339, textureX, textureY); // Box 0
		gun_2_Model[2][5] = new ModelRendererTurbo(this, 485, 339, textureX, textureY); // Box 0
		gun_2_Model[2][6] = new ModelRendererTurbo(this, 493, 339, textureX, textureY); // Box 0
		gun_2_Model[2][7] = new ModelRendererTurbo(this, 501, 339, textureX, textureY); // Box 0
		gun_2_Model[2][8] = new ModelRendererTurbo(this, 509, 339, textureX, textureY); // Box 0
		gun_2_Model[2][9] = new ModelRendererTurbo(this, 517, 331, textureX, textureY); // Box 0
		gun_2_Model[2][10] = new ModelRendererTurbo(this, 557, 331, textureX, textureY); // Box 0
		gun_2_Model[2][11] = new ModelRendererTurbo(this, 517, 339, textureX, textureY); // Box 0
		gun_2_Model[2][12] = new ModelRendererTurbo(this, 533, 339, textureX, textureY); // Box 0
		gun_2_Model[2][13] = new ModelRendererTurbo(this, 549, 339, textureX, textureY); // Box 0
		gun_2_Model[2][14] = new ModelRendererTurbo(this, 525, 339, textureX, textureY); // Box 0
		gun_2_Model[2][15] = new ModelRendererTurbo(this, 541, 339, textureX, textureY); // Box 0
		gun_2_Model[2][16] = new ModelRendererTurbo(this, 557, 339, textureX, textureY); // Box 0
		gun_2_Model[2][17] = new ModelRendererTurbo(this, 565, 339, textureX, textureY); // Box 0
		gun_2_Model[2][18] = new ModelRendererTurbo(this, 461, 347, textureX, textureY); // Box 0
		gun_2_Model[2][19] = new ModelRendererTurbo(this, 573, 339, textureX, textureY); // Box 0
		gun_2_Model[2][20] = new ModelRendererTurbo(this, 581, 339, textureX, textureY); // Box 0
		gun_2_Model[2][21] = new ModelRendererTurbo(this, 469, 347, textureX, textureY); // Box 0
		gun_2_Model[2][22] = new ModelRendererTurbo(this, 477, 347, textureX, textureY); // Box 0
		gun_2_Model[2][23] = new ModelRendererTurbo(this, 493, 347, textureX, textureY); // Box 0
		gun_2_Model[2][24] = new ModelRendererTurbo(this, 509, 347, textureX, textureY); // Box 0
		gun_2_Model[2][25] = new ModelRendererTurbo(this, 533, 347, textureX, textureY); // Box 0
		gun_2_Model[2][26] = new ModelRendererTurbo(this, 549, 347, textureX, textureY); // Box 0
		gun_2_Model[2][27] = new ModelRendererTurbo(this, 557, 347, textureX, textureY); // Box 0
		gun_2_Model[2][28] = new ModelRendererTurbo(this, 565, 347, textureX, textureY); // Box 0

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
			gunPart.setRotationPoint(115F, -69F, 0F);
		}


		registerGunModel("RearGun", gun_2_Model);

		// Passenger 4
		ModelRendererTurbo[][] gun_3_Model = new ModelRendererTurbo[3][];

		gun_3_Model[0] = new ModelRendererTurbo[0];

		gun_3_Model[1] = new ModelRendererTurbo[12];
		gun_3_Model[1][0] = new ModelRendererTurbo(this, 30, 310, textureX, textureY); // MG1
		gun_3_Model[1][1] = new ModelRendererTurbo(this, 30, 313, textureX, textureY); // MG1 Innen
		gun_3_Model[1][2] = new ModelRendererTurbo(this, 30, 316, textureX, textureY); // MG1 Lauf
		gun_3_Model[1][3] = new ModelRendererTurbo(this, 30, 319, textureX, textureY); // MG2
		gun_3_Model[1][4] = new ModelRendererTurbo(this, 30, 324, textureX, textureY); // MG3
		gun_3_Model[1][5] = new ModelRendererTurbo(this, 37, 324, textureX, textureY); // MG4
		gun_3_Model[1][6] = new ModelRendererTurbo(this, 44, 324, textureX, textureY); // MG5
		gun_3_Model[1][7] = new ModelRendererTurbo(this, 57, 310, textureX, textureY); // MG6
		gun_3_Model[1][8] = new ModelRendererTurbo(this, 57, 314, textureX, textureY); // MG7
		gun_3_Model[1][9] = new ModelRendererTurbo(this, 51, 319, textureX, textureY); // MG8
		gun_3_Model[1][10] = new ModelRendererTurbo(this, 63, 319, textureX, textureY); // MG9
		gun_3_Model[1][11] = new ModelRendererTurbo(this, 53, 319, textureX, textureY); // Ammo

		gun_3_Model[1][0].addBox(0.5F, -1F, -0.5F, 12, 1, 1, 0F); // MG1

		gun_3_Model[1][1].addBox(0.5F, -1F, -0.5F, 12, 1, 1, 0F); // MG1 Innen

		gun_3_Model[1][2].addShapeBox(0.5F, -1F, -0.5F, 12, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // MG1 Lauf

		gun_3_Model[1][3].addBox(-7.5F, -1.5F, -1F, 8, 2, 2, 0F); // MG2

		gun_3_Model[1][4].addBox(-9.5F, -1F, -0.5F, 2, 1, 1, 0F); // MG3

		gun_3_Model[1][5].addShapeBox(-10.5F, 0F, -0.5F, 2, 2, 1, 0F,-1F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, -1F, 0F, -0.15F, 0F, 0F, -0.15F, -0.6F, 0F, -0.15F, -0.6F, 0F, -0.15F, 0F, 0F, -0.15F); // MG4

		gun_3_Model[1][6].addBox(-2.5F, -1F, -0.9F, 2, 1, 2, 0F); // MG5

		gun_3_Model[1][7].addBox(-2.5F, -1F, -1.1F, 2, 1, 2, 0F); // MG6

		gun_3_Model[1][8].addShapeBox(-3.5F, -1F, -3F, 1, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // MG7

		gun_3_Model[1][9].addShapeBox(-0.6F, -2F, -0.5F, 1, 2, 1, 0F,-0.4F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.4F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // MG8

		gun_3_Model[1][10].addShapeBox(-6.5F, -2F, -0.5F, 2, 2, 1, 0F,-0.2F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // MG9

		gun_3_Model[1][11].addBox(-2.5F, -3F, 1F, 2, 3, 5, 0F); // Ammo

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_3_Model[1])
		{
			gunPart.setRotationPoint(-101F, -40F, 0F);
		}


		gun_3_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("NoeGun", gun_3_Model);
	}
}