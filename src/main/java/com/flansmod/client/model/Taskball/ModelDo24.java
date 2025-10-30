//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Do24
// Model Creator: 
// Created on: 24.05.2023 - 23:55:32
// Last changed on: 24.05.2023 - 23:55:32

package com.flansmod.client.model.Taskball; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelDo24 extends ModelPlane //Same as Filename
{
	int textureX = 2048;
	int textureY = 512;

	public ModelDo24() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[192];
		leftWingModel = new ModelRendererTurbo[70];
		rightWingModel = new ModelRendererTurbo[37];
		topWingModel = new ModelRendererTurbo[4];
		planeModeParts = new ModelRendererTurbo[50];

		initbodyModel_1();
		initleftWingModel_1();
		initrightWingModel_1();
		inittopWingModel_1();
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
		bodyModel[2] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 561, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 713, 1, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 833, 1, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 961, 1, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 1041, 1, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 1161, 1, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 1289, 1, textureX, textureY); // Box 10
		bodyModel[11] = new ModelRendererTurbo(this, 1393, 1, textureX, textureY); // Box 11
		bodyModel[12] = new ModelRendererTurbo(this, 1561, 1, textureX, textureY); // Box 12
		bodyModel[13] = new ModelRendererTurbo(this, 1713, 1, textureX, textureY); // Box 13
		bodyModel[14] = new ModelRendererTurbo(this, 1849, 1, textureX, textureY); // Box 14
		bodyModel[15] = new ModelRendererTurbo(this, 1945, 9, textureX, textureY); // Box 15
		bodyModel[16] = new ModelRendererTurbo(this, 841, 25, textureX, textureY); // Box 16
		bodyModel[17] = new ModelRendererTurbo(this, 953, 25, textureX, textureY); // Box 17
		bodyModel[18] = new ModelRendererTurbo(this, 1721, 25, textureX, textureY); // Box 18
		bodyModel[19] = new ModelRendererTurbo(this, 553, 33, textureX, textureY); // Box 19
		bodyModel[20] = new ModelRendererTurbo(this, 641, 33, textureX, textureY); // Box 20
		bodyModel[21] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 21
		bodyModel[22] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 22
		bodyModel[23] = new ModelRendererTurbo(this, 737, 33, textureX, textureY); // Box 23
		bodyModel[24] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 24
		bodyModel[25] = new ModelRendererTurbo(this, 545, 1, textureX, textureY); // Box 25
		bodyModel[26] = new ModelRendererTurbo(this, 1049, 33, textureX, textureY); // Box 26
		bodyModel[27] = new ModelRendererTurbo(this, 681, 1, textureX, textureY); // Box 27
		bodyModel[28] = new ModelRendererTurbo(this, 1137, 1, textureX, textureY); // Box 28
		bodyModel[29] = new ModelRendererTurbo(this, 1113, 33, textureX, textureY); // Box 29
		bodyModel[30] = new ModelRendererTurbo(this, 1217, 33, textureX, textureY); // Box 30
		bodyModel[31] = new ModelRendererTurbo(this, 1401, 33, textureX, textureY); // Box 31
		bodyModel[32] = new ModelRendererTurbo(this, 1473, 33, textureX, textureY); // Box 32
		bodyModel[33] = new ModelRendererTurbo(this, 1553, 33, textureX, textureY); // Box 33
		bodyModel[34] = new ModelRendererTurbo(this, 1793, 25, textureX, textureY); // Box 34
		bodyModel[35] = new ModelRendererTurbo(this, 1625, 33, textureX, textureY); // Box 35
		bodyModel[36] = new ModelRendererTurbo(this, 1873, 33, textureX, textureY); // Box 36
		bodyModel[37] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 37
		bodyModel[38] = new ModelRendererTurbo(this, 1265, 1, textureX, textureY); // Box 38
		bodyModel[39] = new ModelRendererTurbo(this, 833, 1, textureX, textureY); // Box 39
		bodyModel[40] = new ModelRendererTurbo(this, 433, 41, textureX, textureY); // Box 40
		bodyModel[41] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 41
		bodyModel[42] = new ModelRendererTurbo(this, 1937, 41, textureX, textureY); // Box 42
		bodyModel[43] = new ModelRendererTurbo(this, 945, 1, textureX, textureY); // Box 43
		bodyModel[44] = new ModelRendererTurbo(this, 1289, 1, textureX, textureY); // Box 44
		bodyModel[45] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 45
		bodyModel[46] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Box 46
		bodyModel[47] = new ModelRendererTurbo(this, 1537, 1, textureX, textureY); // Box 47
		bodyModel[48] = new ModelRendererTurbo(this, 1185, 33, textureX, textureY); // Box 48
		bodyModel[49] = new ModelRendererTurbo(this, 1393, 1, textureX, textureY); // Box 49
		bodyModel[50] = new ModelRendererTurbo(this, 809, 41, textureX, textureY); // Box 50
		bodyModel[51] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // Box 51
		bodyModel[52] = new ModelRendererTurbo(this, 553, 57, textureX, textureY); // Box 52
		bodyModel[53] = new ModelRendererTurbo(this, 833, 57, textureX, textureY); // Box 53
		bodyModel[54] = new ModelRendererTurbo(this, 689, 49, textureX, textureY); // Box 54
		bodyModel[55] = new ModelRendererTurbo(this, 1657, 49, textureX, textureY); // Box 55
		bodyModel[56] = new ModelRendererTurbo(this, 961, 57, textureX, textureY); // Box 56
		bodyModel[57] = new ModelRendererTurbo(this, 1481, 57, textureX, textureY); // Box 57
		bodyModel[58] = new ModelRendererTurbo(this, 1737, 49, textureX, textureY); // Box 58
		bodyModel[59] = new ModelRendererTurbo(this, 1985, 57, textureX, textureY); // Box 59
		bodyModel[60] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 60
		bodyModel[61] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 61
		bodyModel[62] = new ModelRendererTurbo(this, 337, 73, textureX, textureY); // Box 62
		bodyModel[63] = new ModelRendererTurbo(this, 1209, 65, textureX, textureY); // Box 63
		bodyModel[64] = new ModelRendererTurbo(this, 497, 81, textureX, textureY); // Box 64
		bodyModel[65] = new ModelRendererTurbo(this, 1473, 65, textureX, textureY); // Box 65
		bodyModel[66] = new ModelRendererTurbo(this, 1769, 73, textureX, textureY); // Box 66
		bodyModel[67] = new ModelRendererTurbo(this, 753, 81, textureX, textureY); // Box 67
		bodyModel[68] = new ModelRendererTurbo(this, 1185, 73, textureX, textureY); // Box 68
		bodyModel[69] = new ModelRendererTurbo(this, 81, 89, textureX, textureY); // Box 69
		bodyModel[70] = new ModelRendererTurbo(this, 201, 89, textureX, textureY); // Box 70
		bodyModel[71] = new ModelRendererTurbo(this, 833, 81, textureX, textureY); // Box 71
		bodyModel[72] = new ModelRendererTurbo(this, 1057, 89, textureX, textureY); // Box 72
		bodyModel[73] = new ModelRendererTurbo(this, 1913, 65, textureX, textureY); // Box 73
		bodyModel[74] = new ModelRendererTurbo(this, 1601, 121, textureX, textureY); // Box 100
		bodyModel[75] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 101
		bodyModel[76] = new ModelRendererTurbo(this, 1937, 1, textureX, textureY); // Box 102
		bodyModel[77] = new ModelRendererTurbo(this, 1401, 73, textureX, textureY); // Box 103
		bodyModel[78] = new ModelRendererTurbo(this, 513, 65, textureX, textureY); // Box 104
		bodyModel[79] = new ModelRendererTurbo(this, 1601, 73, textureX, textureY); // Box 105
		bodyModel[80] = new ModelRendererTurbo(this, 1729, 49, textureX, textureY); // Box 106
		bodyModel[81] = new ModelRendererTurbo(this, 1401, 73, textureX, textureY); // Box 107
		bodyModel[82] = new ModelRendererTurbo(this, 777, 49, textureX, textureY); // Box 108
		bodyModel[83] = new ModelRendererTurbo(this, 1073, 57, textureX, textureY); // Box 109
		bodyModel[84] = new ModelRendererTurbo(this, 1073, 65, textureX, textureY); // Box 110
		bodyModel[85] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 111
		bodyModel[86] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 112
		bodyModel[87] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 113
		bodyModel[88] = new ModelRendererTurbo(this, 305, 81, textureX, textureY); // Box 114
		bodyModel[89] = new ModelRendererTurbo(this, 961, 121, textureX, textureY); // Box 115
		bodyModel[90] = new ModelRendererTurbo(this, 153, 177, textureX, textureY); // Box 116
		bodyModel[91] = new ModelRendererTurbo(this, 1913, 97, textureX, textureY); // Box 117
		bodyModel[92] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 118
		bodyModel[93] = new ModelRendererTurbo(this, 1481, 161, textureX, textureY); // Box 119
		bodyModel[94] = new ModelRendererTurbo(this, 1729, 113, textureX, textureY); // Box 120
		bodyModel[95] = new ModelRendererTurbo(this, 689, 113, textureX, textureY); // Box 121
		bodyModel[96] = new ModelRendererTurbo(this, 305, 121, textureX, textureY); // Box 122
		bodyModel[97] = new ModelRendererTurbo(this, 1177, 129, textureX, textureY); // Box 123
		bodyModel[98] = new ModelRendererTurbo(this, 361, 169, textureX, textureY); // Box 124
		bodyModel[99] = new ModelRendererTurbo(this, 1241, 185, textureX, textureY); // Box 125
		bodyModel[100] = new ModelRendererTurbo(this, 753, 193, textureX, textureY); // Box 126
		bodyModel[101] = new ModelRendererTurbo(this, 921, 193, textureX, textureY); // Box 127
		bodyModel[102] = new ModelRendererTurbo(this, 1345, 185, textureX, textureY); // Box 128
		bodyModel[103] = new ModelRendererTurbo(this, 1729, 145, textureX, textureY); // Box 129
		bodyModel[104] = new ModelRendererTurbo(this, 1913, 145, textureX, textureY); // Box 130
		bodyModel[105] = new ModelRendererTurbo(this, 1073, 193, textureX, textureY); // Box 131
		bodyModel[106] = new ModelRendererTurbo(this, 1481, 193, textureX, textureY); // Box 132
		bodyModel[107] = new ModelRendererTurbo(this, 1161, 193, textureX, textureY); // Box 133
		bodyModel[108] = new ModelRendererTurbo(this, 1465, 97, textureX, textureY); // Box 134
		bodyModel[109] = new ModelRendererTurbo(this, 1793, 193, textureX, textureY); // Box 135
		bodyModel[110] = new ModelRendererTurbo(this, 865, 81, textureX, textureY); // Box 136
		bodyModel[111] = new ModelRendererTurbo(this, 1265, 73, textureX, textureY); // Box 137
		bodyModel[112] = new ModelRendererTurbo(this, 1649, 105, textureX, textureY); // Box 138
		bodyModel[113] = new ModelRendererTurbo(this, 1793, 81, textureX, textureY); // Box 139
		bodyModel[114] = new ModelRendererTurbo(this, 929, 25, textureX, textureY); // Box 140
		bodyModel[115] = new ModelRendererTurbo(this, 1889, 193, textureX, textureY); // Box 141
		bodyModel[116] = new ModelRendererTurbo(this, 225, 89, textureX, textureY); // Box 142
		bodyModel[117] = new ModelRendererTurbo(this, 1825, 89, textureX, textureY); // Box 143
		bodyModel[118] = new ModelRendererTurbo(this, 305, 201, textureX, textureY); // Box 144
		bodyModel[119] = new ModelRendererTurbo(this, 1953, 193, textureX, textureY); // Box 145
		bodyModel[120] = new ModelRendererTurbo(this, 409, 201, textureX, textureY); // Box 146
		bodyModel[121] = new ModelRendererTurbo(this, 513, 121, textureX, textureY); // Box 147
		bodyModel[122] = new ModelRendererTurbo(this, 865, 105, textureX, textureY); // Box 148
		bodyModel[123] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 149
		bodyModel[124] = new ModelRendererTurbo(this, 689, 137, textureX, textureY); // Box 151
		bodyModel[125] = new ModelRendererTurbo(this, 553, 81, textureX, textureY); // Box 152
		bodyModel[126] = new ModelRendererTurbo(this, 2025, 1, textureX, textureY); // Box 153
		bodyModel[127] = new ModelRendererTurbo(this, 1049, 1, textureX, textureY); // Box 154
		bodyModel[128] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 155
		bodyModel[129] = new ModelRendererTurbo(this, 1089, 121, textureX, textureY); // Box 157
		bodyModel[130] = new ModelRendererTurbo(this, 1289, 17, textureX, textureY); // Box 158
		bodyModel[131] = new ModelRendererTurbo(this, 1937, 9, textureX, textureY); // Box 159
		bodyModel[132] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 160
		bodyModel[133] = new ModelRendererTurbo(this, 481, 201, textureX, textureY); // Box 161
		bodyModel[134] = new ModelRendererTurbo(this, 225, 113, textureX, textureY); // Box 162
		bodyModel[135] = new ModelRendererTurbo(this, 2009, 89, textureX, textureY); // Box 163
		bodyModel[136] = new ModelRendererTurbo(this, 1217, 33, textureX, textureY); // Box 164
		bodyModel[137] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Box 165
		bodyModel[138] = new ModelRendererTurbo(this, 577, 201, textureX, textureY); // Box 166
		bodyModel[139] = new ModelRendererTurbo(this, 1577, 201, textureX, textureY); // Box 167
		bodyModel[140] = new ModelRendererTurbo(this, 1745, 217, textureX, textureY); // Box 168
		bodyModel[141] = new ModelRendererTurbo(this, 1337, 209, textureX, textureY); // Box 169
		bodyModel[142] = new ModelRendererTurbo(this, 1137, 217, textureX, textureY); // Box 170
		bodyModel[143] = new ModelRendererTurbo(this, 713, 225, textureX, textureY); // Box 171
		bodyModel[144] = new ModelRendererTurbo(this, 1425, 209, textureX, textureY); // Box 172
		bodyModel[145] = new ModelRendererTurbo(this, 1913, 217, textureX, textureY); // Box 173
		bodyModel[146] = new ModelRendererTurbo(this, 825, 225, textureX, textureY); // Box 174
		bodyModel[147] = new ModelRendererTurbo(this, 881, 225, textureX, textureY); // Box 175
		bodyModel[148] = new ModelRendererTurbo(this, 1401, 137, textureX, textureY); // Box 176
		bodyModel[149] = new ModelRendererTurbo(this, 881, 225, textureX, textureY); // Box 177
		bodyModel[150] = new ModelRendererTurbo(this, 1393, 225, textureX, textureY); // Box 178
		bodyModel[151] = new ModelRendererTurbo(this, 409, 233, textureX, textureY); // Box 179
		bodyModel[152] = new ModelRendererTurbo(this, 1585, 225, textureX, textureY); // Box 180
		bodyModel[153] = new ModelRendererTurbo(this, 137, 233, textureX, textureY); // Box 181
		bodyModel[154] = new ModelRendererTurbo(this, 601, 233, textureX, textureY); // Box 182
		bodyModel[155] = new ModelRendererTurbo(this, 1937, 233, textureX, textureY); // Box 183
		bodyModel[156] = new ModelRendererTurbo(this, 1, 249, textureX, textureY); // Box 184
		bodyModel[157] = new ModelRendererTurbo(this, 1713, 241, textureX, textureY); // Box 185
		bodyModel[158] = new ModelRendererTurbo(this, 1153, 249, textureX, textureY); // Box 186
		bodyModel[159] = new ModelRendererTurbo(this, 289, 257, textureX, textureY); // Box 187
		bodyModel[160] = new ModelRendererTurbo(this, 1057, 225, textureX, textureY); // Box 188
		bodyModel[161] = new ModelRendererTurbo(this, 705, 289, textureX, textureY); // Box 215
		bodyModel[162] = new ModelRendererTurbo(this, 1817, 289, textureX, textureY); // Box 216
		bodyModel[163] = new ModelRendererTurbo(this, 1985, 1, textureX, textureY); // Box 217
		bodyModel[164] = new ModelRendererTurbo(this, 1585, 225, textureX, textureY); // Box 218
		bodyModel[165] = new ModelRendererTurbo(this, 601, 233, textureX, textureY); // Box 219
		bodyModel[166] = new ModelRendererTurbo(this, 409, 241, textureX, textureY); // Box 220
		bodyModel[167] = new ModelRendererTurbo(this, 817, 225, textureX, textureY); // Box 221
		bodyModel[168] = new ModelRendererTurbo(this, 1073, 225, textureX, textureY); // Box 222
		bodyModel[169] = new ModelRendererTurbo(this, 105, 97, textureX, textureY); // Box 223
		bodyModel[170] = new ModelRendererTurbo(this, 1121, 145, textureX, textureY); // Box 224
		bodyModel[171] = new ModelRendererTurbo(this, 1985, 161, textureX, textureY); // Box 225
		bodyModel[172] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 226
		bodyModel[173] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 227
		bodyModel[174] = new ModelRendererTurbo(this, 681, 1, textureX, textureY); // Box 228
		bodyModel[175] = new ModelRendererTurbo(this, 1817, 241, textureX, textureY); // Box 229
		bodyModel[176] = new ModelRendererTurbo(this, 145, 249, textureX, textureY); // Box 256
		bodyModel[177] = new ModelRendererTurbo(this, 1713, 241, textureX, textureY); // Box 257
		bodyModel[178] = new ModelRendererTurbo(this, 1601, 161, textureX, textureY); // Box 258
		bodyModel[179] = new ModelRendererTurbo(this, 281, 257, textureX, textureY); // Box 259
		bodyModel[180] = new ModelRendererTurbo(this, 1057, 257, textureX, textureY); // Box 260
		bodyModel[181] = new ModelRendererTurbo(this, 2025, 41, textureX, textureY); // Box 261
		bodyModel[182] = new ModelRendererTurbo(this, 1137, 225, textureX, textureY); // Box 262
		bodyModel[183] = new ModelRendererTurbo(this, 1961, 65, textureX, textureY); // Box 263
		bodyModel[184] = new ModelRendererTurbo(this, 713, 233, textureX, textureY); // Box 264
		bodyModel[185] = new ModelRendererTurbo(this, 393, 81, textureX, textureY); // Box 265
		bodyModel[186] = new ModelRendererTurbo(this, 1121, 97, textureX, textureY); // Box 266
		bodyModel[187] = new ModelRendererTurbo(this, 689, 1, textureX, textureY); // Box 272
		bodyModel[188] = new ModelRendererTurbo(this, 721, 1, textureX, textureY); // Box 273
		bodyModel[189] = new ModelRendererTurbo(this, 1617, 345, textureX, textureY); // Box 468
		bodyModel[190] = new ModelRendererTurbo(this, 633, 353, textureX, textureY); // Box 469
		bodyModel[191] = new ModelRendererTurbo(this, 1169, 361, textureX, textureY); // Box 470

		bodyModel[0].addShapeBox(0F, 0F, 0F, 45, 25, 31, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-82F, -15F, -31F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 58, 21, 29, 0F,0F, 0F, -1F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, -6F, -4F, 0F, 2F, 0F, 0F, 4F, 0F); // Box 1
		bodyModel[1].setRotationPoint(-37F, -15F, -29F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 32, 15, 25, 0F,0F, 0F, -3F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, 7F, 0F, 0F, 8F, 0F); // Box 2
		bodyModel[2].setRotationPoint(21F, -15F, -25F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 29, 12, 22, 0F,0F, 0F, -3F, 0F, -1F, -5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, -5F, 0F, -4F, 0F, 0F, 2F, 0F); // Box 3
		bodyModel[3].setRotationPoint(53F, -15F, -22F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 45, 3, 28, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[4].setRotationPoint(-82F, -18F, -28F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 45, 5, 25, 0F,0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[5].setRotationPoint(-82F, -23F, -25F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 45, 3, 18, 0F,0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[6].setRotationPoint(-82F, -26F, -18F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 34, 3, 18, 0F,0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[7].setRotationPoint(-116F, -26F, -18F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 34, 5, 25, 0F,0F, 0F, -8F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[8].setRotationPoint(-116F, -23F, -25F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 34, 3, 28, 0F,0F, 0F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[9].setRotationPoint(-116F, -18F, -28F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 34, 25, 31, 0F,0F, 0F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F); // Box 10
		bodyModel[10].setRotationPoint(-116F, -15F, -31F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 58, 5, 25, 0F,0F, 0F, -7F, 0F, 3F, -10F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -5F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[11].setRotationPoint(-37F, -23F, -25F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 58, 3, 28, 0F,0F, 0F, -3F, 0F, 1F, -8F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[12].setRotationPoint(-37F, -18F, -28F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 58, 3, 18, 0F,0F, 0F, -11F, 0F, 4F, -11F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[13].setRotationPoint(-37F, -26F, -18F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 32, 4, 22, 0F,0F, 0F, -2F, 0F, 1F, -5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[14].setRotationPoint(21F, -19F, -22F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 29, 6, 19, 0F,0F, -1F, -2F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[15].setRotationPoint(53F, -21F, -19F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 32, 7, 20, 0F,0F, 0F, -5F, 0F, 2F, -7F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[16].setRotationPoint(21F, -26F, -20F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 29, 9, 17, 0F,0F, -1F, -4F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[17].setRotationPoint(53F, -29F, -17F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 32, 4, 15, 0F,0F, 0F, -8F, 0F, 2F, -8F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[18].setRotationPoint(21F, -30F, -15F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 29, 4, 13, 0F,0F, 0F, -6F, 0F, 2F, -9F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[19].setRotationPoint(53F, -32F, -13F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 30, 8, 14, 0F,0F, 0F, -4F, 0F, 6F, -5F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -1F, 0F, -6F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[20].setRotationPoint(82F, -29F, -14F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 12, 8, 13, 0F,0F, 0F, -4F, 0F, 4F, -4F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -1F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[21].setRotationPoint(112F, -35F, -13F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 8, 8, 12, 0F,0F, 0F, -3F, 0F, 7F, -4F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -1F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[22].setRotationPoint(124F, -39F, -12F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 30, 5, 10, 0F,0F, 0F, -6F, 0F, 5F, -6F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -1F, 0F, -6F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[23].setRotationPoint(82F, -34F, -10F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 12, 9, 9, 0F,0F, -5F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[24].setRotationPoint(112F, -44F, -9F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 8, 7, 9, 0F,0F, -9F, -5F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 7F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 7F, 0F); // Box 25
		bodyModel[25].setRotationPoint(124F, -53F, -9F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 30, 7, 14, 0F,0F, 0F, 0F, 0F, 6F, -1F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, -7F, 0F, 0F, 1F, 0F, 0F, 7F, 0F); // Box 26
		bodyModel[26].setRotationPoint(82F, -21F, -14F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 12, 6, 14, 0F,0F, 0F, -1F, 0F, 4F, -2F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, 5F, 0F, 0F, 8F, 0F); // Box 27
		bodyModel[27].setRotationPoint(112F, -27F, -14F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 8, 6, 12, 0F,0F, 0F, 0F, 0F, 4F, -1F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, -1F, 0F, 0F, 7F, 0F, 0F, 9F, 0F); // Box 28
		bodyModel[28].setRotationPoint(124F, -31F, -12F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 19, 25, 30, 0F,0F, 0F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F); // Box 29
		bodyModel[29].setRotationPoint(-135F, -15F, -30F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 19, 6, 26, 0F,0F, 0F, -3F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[30].setRotationPoint(-135F, -21F, -26F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 19, 6, 26, 0F,0F, 0F, -5F, 0F, -3F, -9F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, 2F, -3F, 0F, 2F, 0F, 0F, -1F, 0F); // Box 31
		bodyModel[31].setRotationPoint(-135F, -26F, -26F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 19, 4, 17, 0F,0F, 0F, -1F, 0F, -3F, -10F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, 4F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -1F, 0F); // Box 32
		bodyModel[32].setRotationPoint(-135F, -29F, -17F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 28, 25, 6, 0F,0F, 0F, -7F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, -2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 33
		bodyModel[33].setRotationPoint(-163F, -15F, -29F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 12, 23, 25, 0F,0F, -2F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 6F, 0F); // Box 34
		bodyModel[34].setRotationPoint(-175F, -15F, -25F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 20, 19, 15, 0F,0F, 0F, -6F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 35
		bodyModel[35].setRotationPoint(-195F, -13F, -22F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 13, 16, 16, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -6F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, 5F, 0F); // Box 36
		bodyModel[36].setRotationPoint(-208F, -13F, -16F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 5, 13, 10, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 4F, 0F); // Box 37
		bodyModel[37].setRotationPoint(-213F, -13F, -10F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 4, 12, 7, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 1F, 0F); // Box 38
		bodyModel[38].setRotationPoint(-217F, -13F, -7F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 3, 10, 4, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -2F, 0F); // Box 39
		bodyModel[39].setRotationPoint(-220F, -13F, -4F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 12, 6, 24, 0F,0F, 0F, -11F, -5F, 0F, -9F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[40].setRotationPoint(-175F, -19F, -24F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 20, 6, 14, 0F,0F, 0F, -13F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[41].setRotationPoint(-195F, -19F, -21F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 13, 6, 16, 0F,0F, -2F, -11F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[42].setRotationPoint(-208F, -19F, -16F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 5, 4, 10, 0F,0F, -1F, -6F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[43].setRotationPoint(-213F, -17F, -10F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 4, 3, 7, 0F,0F, -1F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[44].setRotationPoint(-217F, -16F, -7F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, -2F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[45].setRotationPoint(-220F, -15F, -4F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 23, 3, 21, 0F,0F, 0F, -7F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[46].setRotationPoint(-158F, -29F, -21F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 8, 3, 16, 0F,-2F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[47].setRotationPoint(-166F, -29F, -16F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 4, 11, 11, 0F,0F, 0F, -3F, 0F, 8F, -3F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[48].setRotationPoint(132F, -46F, -11F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 4, 8, 8, 0F,0F, -9F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F); // Box 49
		bodyModel[49].setRotationPoint(132F, -62F, -8F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 4, 8, 11, 0F,0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 0F, 1F, 0F, 8F, 0F, 0F, 9F, 0F); // Box 50
		bodyModel[50].setRotationPoint(132F, -35F, -11F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 74, 15, 11, 0F,0F, 0F, -3F, 0F, 7F, -5F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -17F, -5F, 0F, -17F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[51].setRotationPoint(136F, -54F, -11F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 74, 12, 11, 0F,0F, 0F, 0F, 0F, 17F, -5F, 0F, 17F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -18F, -5F, 0F, -12F, 0F, 0F, 8F, 0F); // Box 52
		bodyModel[52].setRotationPoint(136F, -39F, -11F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 74, 8, 8, 0F,0F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, -2F, 0F, -7F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[53].setRotationPoint(136F, -62F, -8F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 22, 14, 42, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 13F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 13F, -2F, 0F); // Box 54
		bodyModel[54].setRotationPoint(-103F, -12F, -68F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 16, 12, 42, 0F,-4F, -4F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, 13F, -4F, 0F, -4F, -6F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, 13F, -6F, 0F); // Box 55
		bodyModel[55].setRotationPoint(-119F, -12F, -68F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 34, 14, 42, 0F,0F, 0F, 0F, 0F, -13F, 0F, 31F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 31F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[56].setRotationPoint(-81F, -12F, -68F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 20, 19, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[57].setRotationPoint(-92F, -17F, -80F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 12, 19, 13, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 58
		bodyModel[58].setRotationPoint(-104F, -17F, -80F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 12, 16, 13, 0F,-5F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -5F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F); // Box 59
		bodyModel[59].setRotationPoint(-116F, -15F, -80F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 26, 19, 13, 0F,0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[60].setRotationPoint(-72F, -17F, -80F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 10, 11, 13, 0F,0F, 0F, 0F, 0F, -7F, -6F, 0F, -7F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -6F, 0F, -2F, -6F, 0F, 0F, 0F); // Box 61
		bodyModel[61].setRotationPoint(-46F, -9F, -80F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 45, 14, 80, 0F,0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[62].setRotationPoint(-61F, -66F, -80F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 45, 14, 101, 0F,0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[63].setRotationPoint(-61F, -66F, -181F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 45, 19, 95, 0F,0F, 0F, -26F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -5F, -26F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -5F, 0F); // Box 64
		bodyModel[64].setRotationPoint(-61F, -66F, -276F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 20, 14, 80, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 65
		bodyModel[65].setRotationPoint(-81F, -66F, -80F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 20, 14, 101, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 66
		bodyModel[66].setRotationPoint(-81F, -66F, -181F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 20, 14, 68, 0F,0F, -4F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -5F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 67
		bodyModel[67].setRotationPoint(-81F, -66F, -249F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 20, 14, 34, 0F,-3F, -6F, -18F, 0F, -6F, 0F, 0F, 0F, -14F, 0F, -4F, 0F, -3F, -7F, -18F, 0F, -6F, 0F, 0F, 0F, -14F, 0F, -5F, 0F); // Box 68
		bodyModel[68].setRotationPoint(-81F, -66F, -269F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 45, 19, 52, 0F,0F, -6F, -33F, 0F, -8F, 0F, 0F, -7F, -26F, 0F, 0F, 0F, 0F, -11F, -33F, 0F, -9F, 0F, 0F, -8F, -26F, 0F, -5F, 1F); // Box 69
		bodyModel[69].setRotationPoint(-61F, -66F, -302F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 10, 4, 80, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[70].setRotationPoint(-16F, -59F, -80F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 10, 4, 101, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[71].setRotationPoint(-16F, -59F, -181F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 10, 4, 95, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 72
		bodyModel[72].setRotationPoint(-16F, -59F, -276F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 10, 4, 26, 0F,0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[73].setRotationPoint(-16F, -59F, -302F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 26, 2, 75, 0F,0F, 0F, 0F, -5F, 0F, -9F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -9F, 0F, 0F, -8F, 0F, 0F, 0F); // Box 100
		bodyModel[74].setRotationPoint(172F, -63F, -80F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 36, 2, 79, 0F,-16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[75].setRotationPoint(136F, -63F, -80F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 19, 2, 4, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[76].setRotationPoint(172F, -63F, -4F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 23, 52, 2, 0F,-8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[77].setRotationPoint(156F, -104F, -82F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 14, 52, 2, 0F,0F, 0F, 0F, -4F, -6F, 0F, -4F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Box 104
		bodyModel[78].setRotationPoint(179F, -104F, -82F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 19, 52, 2, 0F,-5F, -21F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -21F, 0F, 0F, -7F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, -7F, 0F); // Box 105
		bodyModel[79].setRotationPoint(145F, -104F, -82F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 2, 2, 59, 0F,0F, 48F, 0F, 0F, 48F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -48F, 0F, 0F, -48F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[80].setRotationPoint(-73F, -10F, -139F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 2, 2, 59, 0F,0F, 48F, 0F, 0F, 48F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -48F, 0F, 0F, -48F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		bodyModel[81].setRotationPoint(-54F, -10F, -139F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 7, 33, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 15F, 0F, 12F, -15F, 0F, 11F, -15F, 0F, -11F, 15F, 0F, -12F); // Box 108
		bodyModel[82].setRotationPoint(-77F, -57F, -2F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 7, 33, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 11F, 0F, 0F, 11F, 0F, 0F, -11F, 0F, 0F, -11F); // Box 109
		bodyModel[83].setRotationPoint(-42F, -57F, -2F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 30, 0F,0F, 22F, 0F, 0F, 22F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -22F, 0F, 0F, -22F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[84].setRotationPoint(146F, -41F, -34F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 4F, -3F, 0F, 4F, -3F, 0F, -4F, 3F, 0F, -4F); // Box 111
		bodyModel[85].setRotationPoint(-166F, -26F, -11F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F); // Box 112
		bodyModel[86].setRotationPoint(-166F, -26F, -6F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, -7F); // Box 113
		bodyModel[87].setRotationPoint(-158F, -26F, -16F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 28, 8, 25, 0F,0F, 0F, 0F, 0F, -2F, 4F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -6F, 4F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 114
		bodyModel[88].setRotationPoint(-163F, 8F, -25F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 45, 25, 31, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[89].setRotationPoint(-82F, -15F, 0F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 58, 21, 29, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -1F, 0F, 4F, 0F, 0F, 2F, 0F, 0F, -6F, -4F, 0F, 0F, 1.5F); // Box 116
		bodyModel[90].setRotationPoint(-37F, -15F, 0F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 32, 15, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -3F, 0F, 8F, 0F, 0F, 7F, 0F, 0F, -3F, -3F, 0F, 0F, 0F); // Box 117
		bodyModel[91].setRotationPoint(21F, -15F, 0F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 29, 12, 22, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -5F, 0F, 0F, -3F, 0F, 2F, 0F, 0F, -4F, 0F, 0F, -11F, -5F, 0F, 0F, 0F); // Box 118
		bodyModel[92].setRotationPoint(53F, -15F, 0F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 45, 3, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[93].setRotationPoint(-82F, -18F, 0F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 45, 5, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[94].setRotationPoint(-82F, -23F, 0F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 45, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[95].setRotationPoint(-82F, -26F, 0F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 34, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 122
		bodyModel[96].setRotationPoint(-116F, -26F, 0F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 34, 5, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 123
		bodyModel[97].setRotationPoint(-116F, -23F, 0F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 34, 3, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 124
		bodyModel[98].setRotationPoint(-116F, -18F, 0F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 34, 25, 31, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 125
		bodyModel[99].setRotationPoint(-116F, -15F, 0F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 58, 5, 25, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, -10F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -5F, 0F, 0F, 0F); // Box 126
		bodyModel[100].setRotationPoint(-37F, -23F, 0F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 58, 3, 28, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -8F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 127
		bodyModel[101].setRotationPoint(-37F, -18F, 0F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 58, 3, 18, 0F,0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -3F, 0F, 0F, 0F); // Box 128
		bodyModel[102].setRotationPoint(-37F, -26F, 0F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 32, 4, 22, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 129
		bodyModel[103].setRotationPoint(21F, -19F, 0F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 29, 6, 19, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -2F, 0F, 0F, 0F); // Box 130
		bodyModel[104].setRotationPoint(53F, -21F, 0F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 32, 7, 20, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -7F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -3F, 0F, 0F, 0F); // Box 131
		bodyModel[105].setRotationPoint(21F, -26F, 0F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 29, 9, 17, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -3F, 0F, 0F, 0F); // Box 132
		bodyModel[106].setRotationPoint(53F, -29F, 0F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 32, 4, 15, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, 0F, 0F); // Box 133
		bodyModel[107].setRotationPoint(21F, -30F, 0F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 29, 4, 13, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -9F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -3F, 0F, 0F, 0F); // Box 134
		bodyModel[108].setRotationPoint(53F, -32F, 0F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 30, 8, 14, 0F,0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, -1F, 0F, 0F, 0F); // Box 135
		bodyModel[109].setRotationPoint(82F, -29F, 0F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 12, 8, 13, 0F,0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, -1F, 0F, 0F, 0F); // Box 136
		bodyModel[110].setRotationPoint(112F, -35F, 0F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 8, 8, 12, 0F,0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, -1F, 0F, 0F, 0F); // Box 137
		bodyModel[111].setRotationPoint(124F, -39F, 0F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 30, 5, 10, 0F,0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, -1F, 0F, 0F, 0F); // Box 138
		bodyModel[112].setRotationPoint(82F, -34F, 0F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 12, 9, 9, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -5F, -5F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 139
		bodyModel[113].setRotationPoint(112F, -44F, 0F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 8, 7, 9, 0F,0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -9F, -5F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 7F, 0F); // Box 140
		bodyModel[114].setRotationPoint(124F, -53F, 0F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 30, 7, 14, 0F,0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, -1F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 1F, 0F, 0F, -7F, 0F, 0F, 0F, 3F); // Box 141
		bodyModel[115].setRotationPoint(82F, -21F, 0F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 12, 6, 14, 0F,0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, -2F, 0F, 0F, -1F, 0F, 8F, 0F, 0F, 5F, 0F, 0F, -3F, -1F, 0F, 0F, 0F); // Box 142
		bodyModel[116].setRotationPoint(112F, -27F, 0F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 8, 6, 12, 0F,0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, -1F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, 7F, 0F, 0F, -1F, 0F, 0F, 1F, 1F); // Box 143
		bodyModel[117].setRotationPoint(124F, -31F, 0F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 19, 25, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -5F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 144
		bodyModel[118].setRotationPoint(-135F, -15F, 0F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 19, 6, 26, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 145
		bodyModel[119].setRotationPoint(-135F, -21F, 0F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 19, 6, 26, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -9F, 0F, 0F, -5F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, -3F, 0F, -1F, -3F); // Box 146
		bodyModel[120].setRotationPoint(-135F, -26F, 0F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 19, 4, 17, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -10F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -1F, 4F); // Box 147
		bodyModel[121].setRotationPoint(-135F, -29F, 0F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 28, 25, 6, 0F,0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, -7F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F); // Box 148
		bodyModel[122].setRotationPoint(-163F, -15F, 23F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 12, 23, 25, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -4F, 0F, 6F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, -2F, -3F); // Box 149
		bodyModel[123].setRotationPoint(-175F, -15F, 0F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 13, 16, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 5F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, -3F, -6F); // Box 151
		bodyModel[124].setRotationPoint(-208F, -13F, 0F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 5, 13, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 4F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, -1F, -3F); // Box 152
		bodyModel[125].setRotationPoint(-213F, -13F, 0F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 4, 12, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 1F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, -2F, -3F); // Box 153
		bodyModel[126].setRotationPoint(-217F, -13F, 0F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 3, 10, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -2F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, -2F, -4F); // Box 154
		bodyModel[127].setRotationPoint(-220F, -13F, 0F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 12, 6, 24, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -9F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, 0F, -3F); // Box 155
		bodyModel[128].setRotationPoint(-175F, -19F, 0F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 13, 6, 16, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -2F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 157
		bodyModel[129].setRotationPoint(-208F, -19F, 0F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 5, 4, 10, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -1F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 158
		bodyModel[130].setRotationPoint(-213F, -17F, 0F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 4, 3, 7, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 159
		bodyModel[131].setRotationPoint(-217F, -16F, 0F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 160
		bodyModel[132].setRotationPoint(-220F, -15F, 0F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 23, 3, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 161
		bodyModel[133].setRotationPoint(-158F, -29F, 0F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 8, 3, 16, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 162
		bodyModel[134].setRotationPoint(-166F, -29F, 0F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 4, 11, 11, 0F,0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 163
		bodyModel[135].setRotationPoint(132F, -46F, 0F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 4, 8, 8, 0F,0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -9F, -5F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F); // Box 164
		bodyModel[136].setRotationPoint(132F, -62F, 0F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 4, 8, 11, 0F,0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, 8F, 0F, 0F, 0F, 1F, 0F, 1F, 1F); // Box 165
		bodyModel[137].setRotationPoint(132F, -35F, 0F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 74, 15, 11, 0F,0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -17F, 0F, 0F, -17F, -5F, 0F, 0F, 0F); // Box 166
		bodyModel[138].setRotationPoint(136F, -54F, 0F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 74, 12, 11, 0F,0F, 0F, 0F, 0F, 17F, 0F, 0F, 17F, -5F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, -12F, 0F, 0F, -18F, -5F, 0F, 0F, 1F); // Box 167
		bodyModel[139].setRotationPoint(136F, -39F, 0F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 74, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, -2F, 0F, 0F, 0F); // Box 168
		bodyModel[140].setRotationPoint(136F, -62F, 0F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 22, 14, 42, 0F,13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 13F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 169
		bodyModel[141].setRotationPoint(-103F, -12F, 26F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 16, 12, 42, 0F,13F, -4F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, -4F, -4F, 0F, 13F, -6F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, -4F, -6F, 0F); // Box 170
		bodyModel[142].setRotationPoint(-119F, -12F, 26F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 34, 14, 42, 0F,0F, 0F, 0F, 31F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 31F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		bodyModel[143].setRotationPoint(-81F, -12F, 26F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 20, 19, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
		bodyModel[144].setRotationPoint(-92F, -17F, 67F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 12, 19, 13, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 173
		bodyModel[145].setRotationPoint(-104F, -17F, 67F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 12, 16, 13, 0F,0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -7F, 0F); // Box 174
		bodyModel[146].setRotationPoint(-116F, -15F, 67F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 26, 19, 13, 0F,0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
		bodyModel[147].setRotationPoint(-72F, -17F, 67F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 10, 11, 13, 0F,0F, 0F, 0F, 0F, -7F, -6F, 0F, -7F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -6F, 0F, -2F, -6F, 0F, 0F, 0F); // Box 176
		bodyModel[148].setRotationPoint(-46F, -9F, 67F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 45, 14, 80, 0F,0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[149].setRotationPoint(-61F, -66F, 0F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 45, 14, 101, 0F,0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 178
		bodyModel[150].setRotationPoint(-61F, -66F, 80F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 45, 19, 95, 0F,0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, -26F, 0F, -5F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -5F, -26F); // Box 179
		bodyModel[151].setRotationPoint(-61F, -66F, 181F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 20, 14, 81, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 180
		bodyModel[152].setRotationPoint(-81F, -66F, 0F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 20, 14, 100, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 181
		bodyModel[153].setRotationPoint(-81F, -66F, 81F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 20, 14, 68, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -14F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -14F); // Box 182
		bodyModel[154].setRotationPoint(-81F, -66F, 181F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 20, 14, 34, 0F,0F, -4F, 0F, 0F, 0F, -14F, 0F, -6F, 0F, -3F, -6F, -18F, 0F, -5F, 0F, 0F, 0F, -14F, 0F, -6F, 0F, -3F, -7F, -18F); // Box 183
		bodyModel[155].setRotationPoint(-81F, -66F, 235F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 45, 19, 52, 0F,0F, 0F, 0F, 0F, -7F, -26F, 0F, -8F, 0F, 0F, -6F, -33F, 0F, -5F, 1F, 0F, -8F, -26F, 0F, -9F, 0F, 0F, -11F, -33F); // Box 184
		bodyModel[156].setRotationPoint(-61F, -66F, 250F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 10, 4, 80, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 185
		bodyModel[157].setRotationPoint(-16F, -59F, 0F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 10, 4, 101, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 186
		bodyModel[158].setRotationPoint(-16F, -59F, 80F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 10, 4, 95, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 187
		bodyModel[159].setRotationPoint(-16F, -59F, 181F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 10, 4, 26, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 188
		bodyModel[160].setRotationPoint(-16F, -59F, 276F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 26, 2, 75, 0F,0F, 0F, 0F, 0F, 0F, -8F, -5F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, -5F, 0F, -9F, 0F, 0F, 0F); // Box 215
		bodyModel[161].setRotationPoint(172F, -63F, 5F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 36, 2, 79, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F); // Box 216
		bodyModel[162].setRotationPoint(136F, -63F, 1F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 19, 2, 4, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		bodyModel[163].setRotationPoint(172F, -63F, 0F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 23, 52, 2, 0F,-8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 218
		bodyModel[164].setRotationPoint(156F, -104F, 80F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 14, 52, 2, 0F,0F, 0F, 0F, -4F, -6F, 0F, -4F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Box 219
		bodyModel[165].setRotationPoint(179F, -104F, 80F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 19, 52, 2, 0F,-5F, -21F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -21F, 0F, 0F, -7F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, -7F, 0F); // Box 220
		bodyModel[166].setRotationPoint(145F, -104F, 80F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 2, 2, 59, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 48F, 0F, 0F, 48F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -48F, 0F, 0F, -48F, 0F); // Box 221
		bodyModel[167].setRotationPoint(-73F, -10F, 80F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 2, 2, 59, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 48F, 0F, 0F, 48F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -48F, 0F, 0F, -48F, 0F); // Box 222
		bodyModel[168].setRotationPoint(-54F, -10F, 80F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 7, 33, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 15F, 0F, -12F, -15F, 0F, -11F, -15F, 0F, 11F, 15F, 0F, 12F); // Box 223
		bodyModel[169].setRotationPoint(-77F, -57F, 0F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 7, 33, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 11F, 0F, 0F, 11F); // Box 224
		bodyModel[170].setRotationPoint(-42F, -57F, 0F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 1, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 22F, 0F, 0F, 22F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -22F, 0F, 0F, -22F, 0F); // Box 225
		bodyModel[171].setRotationPoint(146F, -41F, 4F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, -4F, -3F, 0F, -4F, -3F, 0F, 4F, 3F, 0F, 4F); // Box 226
		bodyModel[172].setRotationPoint(-166F, -26F, 10F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F); // Box 227
		bodyModel[173].setRotationPoint(-166F, -26F, 5F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, 7F); // Box 228
		bodyModel[174].setRotationPoint(-158F, -26F, 15F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 28, 8, 25, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 4F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -6F, 4F, 0F, -8F, 0F); // Box 229
		bodyModel[175].setRotationPoint(-163F, 8F, 0F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 20, 11, 22, 0F,0F, 0F, -6F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -11F, -6F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 256
		bodyModel[176].setRotationPoint(-195F, 3F, -22F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 20, 19, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -6F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -6F); // Box 257
		bodyModel[177].setRotationPoint(-195F, -13F, 7F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 20, 6, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 258
		bodyModel[178].setRotationPoint(-195F, -19F, 7F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 20, 11, 22, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -6F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -11F, -6F); // Box 259
		bodyModel[179].setRotationPoint(-195F, 3F, 0F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 20, 9, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
		bodyModel[180].setRotationPoint(-195F, -5F, -7F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 5, 14, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[181].setRotationPoint(-193F, -19F, -7F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 5, 14, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 262
		bodyModel[182].setRotationPoint(-180F, -19F, -7F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 5, 14, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F); // Box 263
		bodyModel[183].setRotationPoint(-185F, -19F, -7F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 2, 14, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 264
		bodyModel[184].setRotationPoint(-195F, -19F, -7F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 5, 14, 5, 0F,0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 265
		bodyModel[185].setRotationPoint(-193F, -19F, 2F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 5, 14, 5, 0F,-5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 266
		bodyModel[186].setRotationPoint(-185F, -19F, 2F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, -7F); // Box 272
		bodyModel[187].setRotationPoint(-146F, -26F, -17F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, 7F); // Box 273
		bodyModel[188].setRotationPoint(-146F, -26F, 16F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 5, 6, 42, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 468
		bodyModel[189].setRotationPoint(-163F, -15F, -21F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 5, 4, 42, 0F,5F, 0F, -6F, 0F, 0F, -5F, 0F, 0F, -5F, 5F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 469
		bodyModel[190].setRotationPoint(-163F, -19F, -21F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 28, 12, 42, 0F,0F, 0F, 1F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 470
		bodyModel[191].setRotationPoint(-163F, -4F, -21F);
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 1281, 257, textureX, textureY); // Box 90
		leftWingModel[1] = new ModelRendererTurbo(this, 1633, 121, textureX, textureY); // Box 91
		leftWingModel[2] = new ModelRendererTurbo(this, 1329, 273, textureX, textureY); // Box 92
		leftWingModel[3] = new ModelRendererTurbo(this, 1137, 289, textureX, textureY); // Box 93
		leftWingModel[4] = new ModelRendererTurbo(this, 281, 297, textureX, textureY); // Box 94
		leftWingModel[5] = new ModelRendererTurbo(this, 409, 297, textureX, textureY); // Box 95
		leftWingModel[6] = new ModelRendererTurbo(this, 1273, 129, textureX, textureY); // Box 96
		leftWingModel[7] = new ModelRendererTurbo(this, 1417, 273, textureX, textureY); // Box 97
		leftWingModel[8] = new ModelRendererTurbo(this, 1913, 97, textureX, textureY); // Box 100
		leftWingModel[9] = new ModelRendererTurbo(this, 569, 105, textureX, textureY); // Box 101
		leftWingModel[10] = new ModelRendererTurbo(this, 1849, 33, textureX, textureY); // Box 102
		leftWingModel[11] = new ModelRendererTurbo(this, 1921, 33, textureX, textureY); // Box 104
		leftWingModel[12] = new ModelRendererTurbo(this, 961, 121, textureX, textureY); // Box 105
		leftWingModel[13] = new ModelRendererTurbo(this, 1529, 121, textureX, textureY); // Box 106
		leftWingModel[14] = new ModelRendererTurbo(this, 1985, 41, textureX, textureY); // Box 107
		leftWingModel[15] = new ModelRendererTurbo(this, 425, 49, textureX, textureY); // Box 108
		leftWingModel[16] = new ModelRendererTurbo(this, 1817, 281, textureX, textureY); // Box 109
		leftWingModel[17] = new ModelRendererTurbo(this, 785, 169, textureX, textureY); // Box 110
		leftWingModel[18] = new ModelRendererTurbo(this, 1281, 297, textureX, textureY); // Box 111
		leftWingModel[19] = new ModelRendererTurbo(this, 1121, 313, textureX, textureY); // Box 112
		leftWingModel[20] = new ModelRendererTurbo(this, 1, 321, textureX, textureY); // Box 113
		leftWingModel[21] = new ModelRendererTurbo(this, 833, 321, textureX, textureY); // Box 114
		leftWingModel[22] = new ModelRendererTurbo(this, 897, 193, textureX, textureY); // Box 115
		leftWingModel[23] = new ModelRendererTurbo(this, 1969, 289, textureX, textureY); // Box 116
		leftWingModel[24] = new ModelRendererTurbo(this, 1169, 1, textureX, textureY); // Import Box0
		leftWingModel[25] = new ModelRendererTurbo(this, 1849, 1, textureX, textureY); // Box 242
		leftWingModel[26] = new ModelRendererTurbo(this, 1713, 1, textureX, textureY); // Box 243
		leftWingModel[27] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 244
		leftWingModel[28] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 245
		leftWingModel[29] = new ModelRendererTurbo(this, 545, 1, textureX, textureY); // Box 246
		leftWingModel[30] = new ModelRendererTurbo(this, 1281, 1, textureX, textureY); // Box 247
		leftWingModel[31] = new ModelRendererTurbo(this, 1305, 1, textureX, textureY); // Box 248
		leftWingModel[32] = new ModelRendererTurbo(this, 1537, 1, textureX, textureY); // Box 249
		leftWingModel[33] = new ModelRendererTurbo(this, 1465, 345, textureX, textureY); // Box 373
		leftWingModel[34] = new ModelRendererTurbo(this, 1561, 345, textureX, textureY); // Box 374
		leftWingModel[35] = new ModelRendererTurbo(this, 121, 353, textureX, textureY); // Box 375
		leftWingModel[36] = new ModelRendererTurbo(this, 489, 353, textureX, textureY); // Box 376
		leftWingModel[37] = new ModelRendererTurbo(this, 585, 353, textureX, textureY); // Box 377
		leftWingModel[38] = new ModelRendererTurbo(this, 217, 361, textureX, textureY); // Box 378
		leftWingModel[39] = new ModelRendererTurbo(this, 1, 249, textureX, textureY); // Box 379
		leftWingModel[40] = new ModelRendererTurbo(this, 1217, 273, textureX, textureY); // Box 380
		leftWingModel[41] = new ModelRendererTurbo(this, 1601, 129, textureX, textureY); // Box 381
		leftWingModel[42] = new ModelRendererTurbo(this, 305, 145, textureX, textureY); // Box 382
		leftWingModel[43] = new ModelRendererTurbo(this, 57, 145, textureX, textureY); // Box 383
		leftWingModel[44] = new ModelRendererTurbo(this, 1097, 345, textureX, textureY); // Box 384
		leftWingModel[45] = new ModelRendererTurbo(this, 1817, 145, textureX, textureY); // Box 385
		leftWingModel[46] = new ModelRendererTurbo(this, 1, 353, textureX, textureY); // Box 386
		leftWingModel[47] = new ModelRendererTurbo(this, 1753, 353, textureX, textureY); // Box 387
		leftWingModel[48] = new ModelRendererTurbo(this, 457, 273, textureX, textureY); // Box 388
		leftWingModel[49] = new ModelRendererTurbo(this, 305, 361, textureX, textureY); // Box 389
		leftWingModel[50] = new ModelRendererTurbo(this, 1993, 145, textureX, textureY); // Box 390
		leftWingModel[51] = new ModelRendererTurbo(this, 1841, 145, textureX, textureY); // Box 391
		leftWingModel[52] = new ModelRendererTurbo(this, 393, 361, textureX, textureY); // Box 392
		leftWingModel[53] = new ModelRendererTurbo(this, 1625, 273, textureX, textureY); // Box 393
		leftWingModel[54] = new ModelRendererTurbo(this, 1145, 361, textureX, textureY); // Box 394
		leftWingModel[55] = new ModelRendererTurbo(this, 153, 161, textureX, textureY); // Box 395
		leftWingModel[56] = new ModelRendererTurbo(this, 1177, 161, textureX, textureY); // Box 396
		leftWingModel[57] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 397
		leftWingModel[58] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 398
		leftWingModel[59] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 399
		leftWingModel[60] = new ModelRendererTurbo(this, 1801, 25, textureX, textureY); // Box 400
		leftWingModel[61] = new ModelRendererTurbo(this, 721, 33, textureX, textureY); // Box 401
		leftWingModel[62] = new ModelRendererTurbo(this, 945, 1, textureX, textureY); // Box 402
		leftWingModel[63] = new ModelRendererTurbo(this, 969, 1, textureX, textureY); // Box 403
		leftWingModel[64] = new ModelRendererTurbo(this, 809, 33, textureX, textureY); // Box 404
		leftWingModel[65] = new ModelRendererTurbo(this, 1137, 1, textureX, textureY); // Box 405
		leftWingModel[66] = new ModelRendererTurbo(this, 2041, 65, textureX, textureY); // Box 269
		leftWingModel[67] = new ModelRendererTurbo(this, 1465, 73, textureX, textureY); // Box 271
		leftWingModel[68] = new ModelRendererTurbo(this, 585, 81, textureX, textureY); // Box 273
		leftWingModel[69] = new ModelRendererTurbo(this, 1145, 89, textureX, textureY); // Box 275

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 14, 11, 15, 0F,0F, 1F, -4F, 0F, 0F, -6F, 0F, 2F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		leftWingModel[0].setRotationPoint(-118F, -71F, -90F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 5, 10, 13, 0F,0F, 1F, -4F, 0F, 0F, -4F, 0F, 2F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		leftWingModel[1].setRotationPoint(-104F, -70F, -88F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 30, 10, 13, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		leftWingModel[2].setRotationPoint(-99F, -70F, -88F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 32, 10, 13, 0F,0F, 0F, -3.9999F, 0F, -8.9999F, -12.9999F, 0F, -8.9999F, 0F, 0F, 0.9999F, 0F, 0F, 0F, 0F, 0F, 0F, -12.9999F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		leftWingModel[3].setRotationPoint(-69F, -70F, -88F);

		leftWingModel[4].addShapeBox(0F, 0F, 0F, 30, 11, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 1F, 0F, 0F, 2F, 0F); // Box 94
		leftWingModel[4].setRotationPoint(-99F, -60F, -88F);

		leftWingModel[5].addShapeBox(0F, 0F, 0F, 32, 11, 13, 0F,0F, 0F, 0F, 0F, 0F, -12.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.9999F, 0F, -9.9999F, -12.9999F, 0F, -9.9999F, 0F, 0F, 0.9999F, 0F); // Box 95
		leftWingModel[5].setRotationPoint(-69F, -60F, -88F);

		leftWingModel[6].addShapeBox(0F, 0F, 0F, 5, 11, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -4F, 0F, 0F, -4F, 0F, 2F, 0F, 0F, 3F, 0F); // Box 96
		leftWingModel[6].setRotationPoint(-104F, -60F, -88F);

		leftWingModel[7].addShapeBox(0F, 0F, 0F, 14, 12, 15, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -4F, 0F, 0F, -6F, 0F, 2F, 0F, 0F, 4F, 0F); // Box 97
		leftWingModel[7].setRotationPoint(-118F, -60F, -90F);

		leftWingModel[8].addShapeBox(0F, 0F, 0F, 4, 12, 7, 0F,0F, -2F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 100
		leftWingModel[8].setRotationPoint(-122F, -72F, -90F);

		leftWingModel[9].addShapeBox(0F, 0F, 0F, 4, 13, 7, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 101
		leftWingModel[9].setRotationPoint(-122F, -60F, -90F);

		leftWingModel[10].addShapeBox(0F, 0F, 0F, 4, 4, 11, 0F,0F, -2F, -1F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 102
		leftWingModel[10].setRotationPoint(-122F, -72F, -86F);

		leftWingModel[11].addShapeBox(0F, 0F, 0F, 4, 4, 11, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 1F, 0F); // Box 104
		leftWingModel[11].setRotationPoint(-122F, -51F, -86F);

		leftWingModel[12].addShapeBox(0F, 0F, 0F, 4, 12, 7, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -2F, -5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 105
		leftWingModel[12].setRotationPoint(-122F, -72F, -67F);

		leftWingModel[13].addShapeBox(0F, 0F, 0F, 4, 13, 7, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -2F, -5F); // Box 106
		leftWingModel[13].setRotationPoint(-122F, -60F, -67F);

		leftWingModel[14].addShapeBox(0F, 0F, 0F, 4, 4, 11, 0F,0F, 1F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 107
		leftWingModel[14].setRotationPoint(-122F, -72F, -75F);

		leftWingModel[15].addShapeBox(0F, 0F, 0F, 4, 4, 11, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, -2F, -1F); // Box 108
		leftWingModel[15].setRotationPoint(-122F, -51F, -75F);

		leftWingModel[16].addShapeBox(0F, 0F, 0F, 14, 11, 15, 0F,0F, 4F, 0F, 0F, 2F, 0F, 0F, 0F, -6F, 0F, 1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 109
		leftWingModel[16].setRotationPoint(-118F, -71F, -75F);

		leftWingModel[17].addShapeBox(0F, 0F, 0F, 5, 10, 13, 0F,0F, 3F, 0F, 0F, 2F, 0F, 0F, 0F, -4F, 0F, 1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		leftWingModel[17].setRotationPoint(-104F, -70F, -75F);

		leftWingModel[18].addShapeBox(0F, 0F, 0F, 30, 10, 13, 0F,0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		leftWingModel[18].setRotationPoint(-99F, -70F, -75F);

		leftWingModel[19].addShapeBox(0F, 0F, 0F, 32, 10, 13, 0F,0F, 0.9999F, 0F, 0F, -8.9999F, 0F, 0F, -8.9999F, -12.9999F, 0F, 0F, -3.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12.9999F, 0F, 0F, 0F); // Box 112
		leftWingModel[19].setRotationPoint(-69F, -70F, -75F);

		leftWingModel[20].addShapeBox(0F, 0F, 0F, 30, 11, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 113
		leftWingModel[20].setRotationPoint(-99F, -60F, -75F);

		leftWingModel[21].addShapeBox(0F, 0F, 0F, 32, 11, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12.9999F, 0F, 0F, 0F, 0F, 0.9999F, 0F, 0F, -9.9999F, 0F, 0F, -9.9999F, -12.9999F, 0F, 0F, -3.9999F); // Box 114
		leftWingModel[21].setRotationPoint(-69F, -60F, -75F);

		leftWingModel[22].addShapeBox(0F, 0F, 0F, 5, 11, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 2F, 0F, 0F, 0F, -4F, 0F, 1F, -4F); // Box 115
		leftWingModel[22].setRotationPoint(-104F, -60F, -75F);

		leftWingModel[23].addShapeBox(0F, 0F, 0F, 14, 12, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 2F, 0F, 0F, 0F, -6F, 0F, 1F, -4F); // Box 116
		leftWingModel[23].setRotationPoint(-118F, -60F, -75F);

		leftWingModel[24].addShapeBox(0F, 0F, 0F, 7, 5, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		leftWingModel[24].setRotationPoint(-130F, -62.5F, -77.5F);

		leftWingModel[25].addBox(0F, 0F, 0F, 7, 5, 3, 0F); // Box 242
		leftWingModel[25].setRotationPoint(-130F, -62.5F, -76.5F);

		leftWingModel[26].addShapeBox(0F, 0F, 0F, 7, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 243
		leftWingModel[26].setRotationPoint(-130F, -62.5F, -73.5F);

		leftWingModel[27].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, -0.9999F, -0.9999F, 0F, -0.9999F, 0F, 0F, 0F, 0F, 0F, -0.9999F, 0F, 0F, -0.9999F, -0.9999F, 0F, -0.9999F, 0F, 0F, 0F, 0F, 0F, -0.9999F, 0F); // Box 244
		leftWingModel[27].setRotationPoint(-131F, -62.5F, -77.5F);

		leftWingModel[28].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, -0.9999F, 0F, 0F, 0F, 0F, 0F, -0.9999F, 0F, 0F, -0.9999F, -0.9999F, 0F, -0.9999F, 0F, 0F, 0F, 0F, 0F, -0.9999F, 0F, 0F, -0.9999F, -0.9999F); // Box 245
		leftWingModel[28].setRotationPoint(-131F, -62.5F, -73.5F);

		leftWingModel[29].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 246
		leftWingModel[29].setRotationPoint(-131F, -62.5F, -76.5F);

		leftWingModel[30].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		leftWingModel[30].setRotationPoint(-124F, -61.5F, -75.5F);

		leftWingModel[31].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		leftWingModel[31].setRotationPoint(-124F, -61.5F, -76.5F);

		leftWingModel[32].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 249
		leftWingModel[32].setRotationPoint(-124F, -61.5F, -74.5F);

		leftWingModel[33].addShapeBox(0F, 0F, 0F, 32, 10, 13, 0F,0F, 0F, -3.9999F, 0F, -8.9999F, -12.9999F, 0F, -8.9999F, 0F, 0F, 0.9999F, 0F, 0F, 0F, 0F, 0F, 0F, -12.9999F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 373
		leftWingModel[33].setRotationPoint(-69F, -70F, -13F);

		leftWingModel[34].addShapeBox(0F, 0F, 0F, 32, 10, 13, 0F,0F, 0.9999F, 0F, 0F, -8.9999F, 0F, 0F, -8.9999F, -12.9999F, 0F, 0F, -3.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12.9999F, 0F, 0F, 0F); // Box 374
		leftWingModel[34].setRotationPoint(-69F, -70F, 0F);

		leftWingModel[35].addShapeBox(0F, 0F, 0F, 32, 11, 13, 0F,0F, 0F, 0F, 0F, 0F, -12.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.9999F, 0F, -9.9999F, -12.9999F, 0F, -9.9999F, 0F, 0F, 0.9999F, 0F); // Box 375
		leftWingModel[35].setRotationPoint(-69F, -60F, -13F);

		leftWingModel[36].addShapeBox(0F, 0F, 0F, 32, 11, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12.9999F, 0F, 0F, 0F, 0F, 0.9999F, 0F, 0F, -9.9999F, 0F, 0F, -9.9999F, -12.9999F, 0F, 0F, -3.9999F); // Box 376
		leftWingModel[36].setRotationPoint(-69F, -60F, 0F);

		leftWingModel[37].addShapeBox(0F, 0F, 0F, 30, 11, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 1F, 0F, 0F, 2F, 0F); // Box 377
		leftWingModel[37].setRotationPoint(-99F, -60F, -13F);

		leftWingModel[38].addShapeBox(0F, 0F, 0F, 30, 11, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 378
		leftWingModel[38].setRotationPoint(-99F, -60F, 0F);

		leftWingModel[39].addShapeBox(0F, 0F, 0F, 5, 11, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -4F, 0F, 0F, -4F, 0F, 2F, 0F, 0F, 3F, 0F); // Box 379
		leftWingModel[39].setRotationPoint(-104F, -60F, -13F);

		leftWingModel[40].addShapeBox(0F, 0F, 0F, 5, 11, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 2F, 0F, 0F, 0F, -4F, 0F, 1F, -4F); // Box 380
		leftWingModel[40].setRotationPoint(-104F, -60F, 0F);

		leftWingModel[41].addShapeBox(0F, 0F, 0F, 4, 4, 11, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 1F, 0F); // Box 381
		leftWingModel[41].setRotationPoint(-122F, -51F, -11F);

		leftWingModel[42].addShapeBox(0F, 0F, 0F, 4, 4, 11, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, -2F, -1F); // Box 382
		leftWingModel[42].setRotationPoint(-122F, -51F, 0F);

		leftWingModel[43].addShapeBox(0F, 0F, 0F, 4, 13, 7, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -2F, -5F); // Box 383
		leftWingModel[43].setRotationPoint(-122F, -60F, 8F);

		leftWingModel[44].addShapeBox(0F, 0F, 0F, 14, 12, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 2F, 0F, 0F, 0F, -6F, 0F, 1F, -4F); // Box 384
		leftWingModel[44].setRotationPoint(-118F, -60F, 0F);

		leftWingModel[45].addShapeBox(0F, 0F, 0F, 4, 13, 7, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 385
		leftWingModel[45].setRotationPoint(-122F, -60F, -15F);

		leftWingModel[46].addShapeBox(0F, 0F, 0F, 14, 12, 15, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -4F, 0F, 0F, -6F, 0F, 2F, 0F, 0F, 4F, 0F); // Box 386
		leftWingModel[46].setRotationPoint(-118F, -60F, -15F);

		leftWingModel[47].addShapeBox(0F, 0F, 0F, 14, 11, 15, 0F,0F, 1F, -4F, 0F, 0F, -6F, 0F, 2F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 387
		leftWingModel[47].setRotationPoint(-118F, -71F, -15F);

		leftWingModel[48].addShapeBox(0F, 0F, 0F, 5, 10, 13, 0F,0F, 1F, -4F, 0F, 0F, -4F, 0F, 2F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 388
		leftWingModel[48].setRotationPoint(-104F, -70F, -13F);

		leftWingModel[49].addShapeBox(0F, 0F, 0F, 30, 10, 13, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 389
		leftWingModel[49].setRotationPoint(-99F, -70F, -13F);

		leftWingModel[50].addShapeBox(0F, 0F, 0F, 4, 4, 11, 0F,0F, -2F, -1F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 390
		leftWingModel[50].setRotationPoint(-122F, -72F, -11F);

		leftWingModel[51].addShapeBox(0F, 0F, 0F, 4, 12, 7, 0F,0F, -2F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 391
		leftWingModel[51].setRotationPoint(-122F, -72F, -15F);

		leftWingModel[52].addShapeBox(0F, 0F, 0F, 30, 10, 13, 0F,0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 392
		leftWingModel[52].setRotationPoint(-99F, -70F, 0F);

		leftWingModel[53].addShapeBox(0F, 0F, 0F, 5, 10, 13, 0F,0F, 3F, 0F, 0F, 2F, 0F, 0F, 0F, -4F, 0F, 1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 393
		leftWingModel[53].setRotationPoint(-104F, -70F, 0F);

		leftWingModel[54].addShapeBox(0F, 0F, 0F, 14, 11, 15, 0F,0F, 4F, 0F, 0F, 2F, 0F, 0F, 0F, -6F, 0F, 1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 394
		leftWingModel[54].setRotationPoint(-118F, -71F, 0F);

		leftWingModel[55].addShapeBox(0F, 0F, 0F, 4, 4, 11, 0F,0F, 1F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 395
		leftWingModel[55].setRotationPoint(-122F, -72F, 0F);

		leftWingModel[56].addShapeBox(0F, 0F, 0F, 4, 12, 7, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -2F, -5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 396
		leftWingModel[56].setRotationPoint(-122F, -72F, 8F);

		leftWingModel[57].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 397
		leftWingModel[57].setRotationPoint(-124F, -61.5F, 0.5F);

		leftWingModel[58].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 398
		leftWingModel[58].setRotationPoint(-124F, -61.5F, -0.5F);

		leftWingModel[59].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 399
		leftWingModel[59].setRotationPoint(-124F, -61.5F, -1.5F);

		leftWingModel[60].addShapeBox(0F, 0F, 0F, 7, 5, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 400
		leftWingModel[60].setRotationPoint(-130F, -62.5F, -2.5F);

		leftWingModel[61].addBox(0F, 0F, 0F, 7, 5, 3, 0F); // Box 401
		leftWingModel[61].setRotationPoint(-130F, -62.5F, -1.5F);

		leftWingModel[62].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 402
		leftWingModel[62].setRotationPoint(-131F, -62.5F, -1.5F);

		leftWingModel[63].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, -0.9999F, -0.9999F, 0F, -0.9999F, 0F, 0F, 0F, 0F, 0F, -0.9999F, 0F, 0F, -0.9999F, -0.9999F, 0F, -0.9999F, 0F, 0F, 0F, 0F, 0F, -0.9999F, 0F); // Box 403
		leftWingModel[63].setRotationPoint(-131F, -62.5F, -2.5F);

		leftWingModel[64].addShapeBox(0F, 0F, 0F, 7, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 404
		leftWingModel[64].setRotationPoint(-130F, -62.5F, 1.5F);

		leftWingModel[65].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, -0.9999F, 0F, 0F, 0F, 0F, 0F, -0.9999F, 0F, 0F, -0.9999F, -0.9999F, 0F, -0.9999F, 0F, 0F, 0F, 0F, 0F, -0.9999F, 0F, 0F, -0.9999F, -0.9999F); // Box 405
		leftWingModel[65].setRotationPoint(-131F, -62.5F, 1.5F);

		leftWingModel[66].addShapeBox(0F, -12.5F, -1F, 1, 25, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 269
		leftWingModel[66].setRotationPoint(-119F, -60F, -75F);

		leftWingModel[67].addShapeBox(0F, -12.5F, -1F, 1, 25, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 271
		leftWingModel[67].setRotationPoint(-119F, -60F, -75F);
		leftWingModel[67].rotateAngleX = 1.57079633F;

		leftWingModel[68].addShapeBox(0F, -12.5F, -1F, 1, 25, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 273
		leftWingModel[68].setRotationPoint(-119F, -60F, -75F);
		leftWingModel[68].rotateAngleX = 0.78539816F;

		leftWingModel[69].addShapeBox(0F, -12.5F, -1F, 1, 25, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 275
		leftWingModel[69].setRotationPoint(-119F, -60F, -75F);
		leftWingModel[69].rotateAngleX = -0.78539816F;
	}

	private void initrightWingModel_1()
	{
		rightWingModel[0] = new ModelRendererTurbo(this, 1369, 297, textureX, textureY); // Box 307
		rightWingModel[1] = new ModelRendererTurbo(this, 305, 177, textureX, textureY); // Box 308
		rightWingModel[2] = new ModelRendererTurbo(this, 929, 321, textureX, textureY); // Box 309
		rightWingModel[3] = new ModelRendererTurbo(this, 1017, 321, textureX, textureY); // Box 310
		rightWingModel[4] = new ModelRendererTurbo(this, 1281, 321, textureX, textureY); // Box 311
		rightWingModel[5] = new ModelRendererTurbo(this, 1673, 329, textureX, textureY); // Box 312
		rightWingModel[6] = new ModelRendererTurbo(this, 377, 201, textureX, textureY); // Box 313
		rightWingModel[7] = new ModelRendererTurbo(this, 697, 321, textureX, textureY); // Box 314
		rightWingModel[8] = new ModelRendererTurbo(this, 1177, 129, textureX, textureY); // Box 315
		rightWingModel[9] = new ModelRendererTurbo(this, 1449, 137, textureX, textureY); // Box 316
		rightWingModel[10] = new ModelRendererTurbo(this, 801, 65, textureX, textureY); // Box 317
		rightWingModel[11] = new ModelRendererTurbo(this, 1649, 73, textureX, textureY); // Box 318
		rightWingModel[12] = new ModelRendererTurbo(this, 2025, 137, textureX, textureY); // Box 319
		rightWingModel[13] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 320
		rightWingModel[14] = new ModelRendererTurbo(this, 961, 81, textureX, textureY); // Box 321
		rightWingModel[15] = new ModelRendererTurbo(this, 1177, 89, textureX, textureY); // Box 322
		rightWingModel[16] = new ModelRendererTurbo(this, 1969, 321, textureX, textureY); // Box 323
		rightWingModel[17] = new ModelRendererTurbo(this, 1217, 233, textureX, textureY); // Box 324
		rightWingModel[18] = new ModelRendererTurbo(this, 1769, 329, textureX, textureY); // Box 325
		rightWingModel[19] = new ModelRendererTurbo(this, 913, 345, textureX, textureY); // Box 326
		rightWingModel[20] = new ModelRendererTurbo(this, 1009, 345, textureX, textureY); // Box 327
		rightWingModel[21] = new ModelRendererTurbo(this, 1193, 377, textureX, textureY); // Box 328
		rightWingModel[22] = new ModelRendererTurbo(this, 457, 241, textureX, textureY); // Box 329
		rightWingModel[23] = new ModelRendererTurbo(this, 73, 337, textureX, textureY); // Box 330
		rightWingModel[24] = new ModelRendererTurbo(this, 1713, 9, textureX, textureY); // Box 331
		rightWingModel[25] = new ModelRendererTurbo(this, 625, 33, textureX, textureY); // Box 332
		rightWingModel[26] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 333
		rightWingModel[27] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 334
		rightWingModel[28] = new ModelRendererTurbo(this, 577, 1, textureX, textureY); // Box 335
		rightWingModel[29] = new ModelRendererTurbo(this, 729, 1, textureX, textureY); // Box 336
		rightWingModel[30] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 337
		rightWingModel[31] = new ModelRendererTurbo(this, 1537, 9, textureX, textureY); // Box 338
		rightWingModel[32] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 339
		rightWingModel[33] = new ModelRendererTurbo(this, 1177, 105, textureX, textureY); // Box 414
		rightWingModel[34] = new ModelRendererTurbo(this, 985, 121, textureX, textureY); // Box 415
		rightWingModel[35] = new ModelRendererTurbo(this, 1145, 145, textureX, textureY); // Box 416
		rightWingModel[36] = new ModelRendererTurbo(this, 2025, 161, textureX, textureY); // Box 417

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 14, 11, 15, 0F,0F, 4F, 0F, 0F, 2F, 0F, 0F, 0F, -6F, 0F, 1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 307
		rightWingModel[0].setRotationPoint(-118F, -71F, 75F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 5, 10, 13, 0F,0F, 3F, 0F, 0F, 2F, 0F, 0F, 0F, -4F, 0F, 1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 308
		rightWingModel[1].setRotationPoint(-104F, -70F, 75F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 30, 10, 13, 0F,0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309
		rightWingModel[2].setRotationPoint(-99F, -70F, 75F);

		rightWingModel[3].addShapeBox(0F, 0F, 0F, 32, 10, 13, 0F,0F, 0.9999F, 0F, 0F, -8.9999F, 0F, 0F, -8.9999F, -12.9999F, 0F, 0F, -3.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12.9999F, 0F, 0F, 0F); // Box 310
		rightWingModel[3].setRotationPoint(-69F, -70F, 75F);

		rightWingModel[4].addShapeBox(0F, 0F, 0F, 30, 11, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 311
		rightWingModel[4].setRotationPoint(-99F, -60F, 75F);

		rightWingModel[5].addShapeBox(0F, 0F, 0F, 32, 11, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12.9999F, 0F, 0F, 0F, 0F, 0.9999F, 0F, 0F, -9.9999F, 0F, 0F, -9.9999F, -12.9999F, 0F, 0F, -3.9999F); // Box 312
		rightWingModel[5].setRotationPoint(-69F, -60F, 75F);

		rightWingModel[6].addShapeBox(0F, 0F, 0F, 5, 11, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 2F, 0F, 0F, 0F, -4F, 0F, 1F, -4F); // Box 313
		rightWingModel[6].setRotationPoint(-104F, -60F, 75F);

		rightWingModel[7].addShapeBox(0F, 0F, 0F, 14, 12, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 2F, 0F, 0F, 0F, -6F, 0F, 1F, -4F); // Box 314
		rightWingModel[7].setRotationPoint(-118F, -60F, 75F);

		rightWingModel[8].addShapeBox(0F, 0F, 0F, 4, 12, 7, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -2F, -5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 315
		rightWingModel[8].setRotationPoint(-122F, -72F, 83F);

		rightWingModel[9].addShapeBox(0F, 0F, 0F, 4, 13, 7, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -2F, -5F); // Box 316
		rightWingModel[9].setRotationPoint(-122F, -60F, 83F);

		rightWingModel[10].addShapeBox(0F, 0F, 0F, 4, 4, 11, 0F,0F, 1F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 317
		rightWingModel[10].setRotationPoint(-122F, -72F, 75F);

		rightWingModel[11].addShapeBox(0F, 0F, 0F, 4, 4, 11, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, -2F, -1F); // Box 318
		rightWingModel[11].setRotationPoint(-122F, -51F, 75F);

		rightWingModel[12].addShapeBox(0F, 0F, 0F, 4, 12, 7, 0F,0F, -2F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 319
		rightWingModel[12].setRotationPoint(-122F, -72F, 60F);

		rightWingModel[13].addShapeBox(0F, 0F, 0F, 4, 13, 7, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 320
		rightWingModel[13].setRotationPoint(-122F, -60F, 60F);

		rightWingModel[14].addShapeBox(0F, 0F, 0F, 4, 4, 11, 0F,0F, -2F, -1F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 321
		rightWingModel[14].setRotationPoint(-122F, -72F, 64F);

		rightWingModel[15].addShapeBox(0F, 0F, 0F, 4, 4, 11, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 1F, 0F); // Box 322
		rightWingModel[15].setRotationPoint(-122F, -51F, 64F);

		rightWingModel[16].addShapeBox(0F, 0F, 0F, 14, 11, 15, 0F,0F, 1F, -4F, 0F, 0F, -6F, 0F, 2F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 323
		rightWingModel[16].setRotationPoint(-118F, -71F, 60F);

		rightWingModel[17].addShapeBox(0F, 0F, 0F, 5, 10, 13, 0F,0F, 1F, -4F, 0F, 0F, -4F, 0F, 2F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324
		rightWingModel[17].setRotationPoint(-104F, -70F, 62F);

		rightWingModel[18].addShapeBox(0F, 0F, 0F, 30, 10, 13, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 325
		rightWingModel[18].setRotationPoint(-99F, -70F, 62F);

		rightWingModel[19].addShapeBox(0F, 0F, 0F, 32, 10, 13, 0F,0F, 0F, -3.9999F, 0F, -8.9999F, -12.9999F, 0F, -8.9999F, 0F, 0F, 0.9999F, 0F, 0F, 0F, 0F, 0F, 0F, -12.9999F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 326
		rightWingModel[19].setRotationPoint(-69F, -70F, 62F);

		rightWingModel[20].addShapeBox(0F, 0F, 0F, 30, 11, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 1F, 0F, 0F, 2F, 0F); // Box 327
		rightWingModel[20].setRotationPoint(-99F, -60F, 62F);

		rightWingModel[21].addShapeBox(0F, 0F, 0F, 32, 11, 13, 0F,0F, 0F, 0F, 0F, 0F, -12.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.9999F, 0F, -9.9999F, -12.9999F, 0F, -9.9999F, 0F, 0F, 0.9999F, 0F); // Box 328
		rightWingModel[21].setRotationPoint(-69F, -60F, 62F);

		rightWingModel[22].addShapeBox(0F, 0F, 0F, 5, 11, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -4F, 0F, 0F, -4F, 0F, 2F, 0F, 0F, 3F, 0F); // Box 329
		rightWingModel[22].setRotationPoint(-104F, -60F, 62F);

		rightWingModel[23].addShapeBox(0F, 0F, 0F, 14, 12, 15, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -4F, 0F, 0F, -6F, 0F, 2F, 0F, 0F, 4F, 0F); // Box 330
		rightWingModel[23].setRotationPoint(-118F, -60F, 60F);

		rightWingModel[24].addShapeBox(0F, 0F, 0F, 7, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 331
		rightWingModel[24].setRotationPoint(-130F, -62.5F, 76.5F);

		rightWingModel[25].addBox(0F, 0F, 0F, 7, 5, 3, 0F); // Box 332
		rightWingModel[25].setRotationPoint(-130F, -62.5F, 73.5F);

		rightWingModel[26].addShapeBox(0F, 0F, 0F, 7, 5, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 333
		rightWingModel[26].setRotationPoint(-130F, -62.5F, 72.5F);

		rightWingModel[27].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, -0.9999F, 0F, 0F, 0F, 0F, 0F, -0.9999F, 0F, 0F, -0.9999F, -0.9999F, 0F, -0.9999F, 0F, 0F, 0F, 0F, 0F, -0.9999F, 0F, 0F, -0.9999F, -0.9999F); // Box 334
		rightWingModel[27].setRotationPoint(-131F, -62.5F, 76.5F);

		rightWingModel[28].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, -0.9999F, -0.9999F, 0F, -0.9999F, 0F, 0F, 0F, 0F, 0F, -0.9999F, 0F, 0F, -0.9999F, -0.9999F, 0F, -0.9999F, 0F, 0F, 0F, 0F, 0F, -0.9999F, 0F); // Box 335
		rightWingModel[28].setRotationPoint(-131F, -62.5F, 72.5F);

		rightWingModel[29].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 336
		rightWingModel[29].setRotationPoint(-131F, -62.5F, 73.5F);

		rightWingModel[30].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 337
		rightWingModel[30].setRotationPoint(-124F, -61.5F, 74.5F);

		rightWingModel[31].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 338
		rightWingModel[31].setRotationPoint(-124F, -61.5F, 75.5F);

		rightWingModel[32].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 339
		rightWingModel[32].setRotationPoint(-124F, -61.5F, 73.5F);

		rightWingModel[33].addShapeBox(0F, -12.5F, -1F, 1, 25, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 414
		rightWingModel[33].setRotationPoint(-119F, -60F, 75F);

		rightWingModel[34].addShapeBox(0F, -12.5F, -1F, 1, 25, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 415
		rightWingModel[34].setRotationPoint(-119F, -60F, 75F);
		rightWingModel[34].rotateAngleX = 1.57079633F;

		rightWingModel[35].addShapeBox(0F, -12.5F, -1F, 1, 25, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 416
		rightWingModel[35].setRotationPoint(-119F, -60F, 75F);
		rightWingModel[35].rotateAngleX = 0.78539816F;

		rightWingModel[36].addShapeBox(0F, -12.5F, -1F, 1, 25, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 417
		rightWingModel[36].setRotationPoint(-119F, -60F, 75F);
		rightWingModel[36].rotateAngleX = -0.78539816F;
	}

	private void inittopWingModel_1()
	{
		topWingModel[0] = new ModelRendererTurbo(this, 89, 97, textureX, textureY); // Box 410
		topWingModel[1] = new ModelRendererTurbo(this, 97, 97, textureX, textureY); // Box 411
		topWingModel[2] = new ModelRendererTurbo(this, 1297, 97, textureX, textureY); // Box 412
		topWingModel[3] = new ModelRendererTurbo(this, 2041, 97, textureX, textureY); // Box 413

		topWingModel[0].addShapeBox(0F, -12.5F, -1F, 1, 25, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 410
		topWingModel[0].setRotationPoint(-119F, -60F, 0F);

		topWingModel[1].addShapeBox(0F, -12.5F, -1F, 1, 25, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 411
		topWingModel[1].setRotationPoint(-119F, -60F, 0F);
		topWingModel[1].rotateAngleX = 1.57079633F;

		topWingModel[2].addShapeBox(0F, -12.5F, -1F, 1, 25, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 412
		topWingModel[2].setRotationPoint(-119F, -60F, 0F);
		topWingModel[2].rotateAngleX = 0.78539816F;

		topWingModel[3].addShapeBox(0F, -12.5F, -1F, 1, 25, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413
		topWingModel[3].setRotationPoint(-119F, -60F, 0F);
		topWingModel[3].rotateAngleX = -0.78539816F;
	}

	private void initplaneModeParts_1()
	{
		planeModeParts[0] = new ModelRendererTurbo(this, 737, 137, textureX, textureY); // Box 239
		planeModeParts[1] = new ModelRendererTurbo(this, 833, 33, textureX, textureY); // Box 240
		planeModeParts[2] = new ModelRendererTurbo(this, 1169, 9, textureX, textureY); // Box 241
		planeModeParts[3] = new ModelRendererTurbo(this, 561, 25, textureX, textureY); // Box 242
		planeModeParts[4] = new ModelRendererTurbo(this, 1529, 33, textureX, textureY); // Box 243
		planeModeParts[5] = new ModelRendererTurbo(this, 1729, 113, textureX, textureY); // Box 244
		planeModeParts[6] = new ModelRendererTurbo(this, 1473, 33, textureX, textureY); // Box 245
		planeModeParts[7] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 246
		planeModeParts[8] = new ModelRendererTurbo(this, 1577, 1, textureX, textureY); // Box 247
		planeModeParts[9] = new ModelRendererTurbo(this, 1313, 9, textureX, textureY); // Box 248
		planeModeParts[10] = new ModelRendererTurbo(this, 337, 49, textureX, textureY); // Box 250
		planeModeParts[11] = new ModelRendererTurbo(this, 801, 49, textureX, textureY); // Box 251
		planeModeParts[12] = new ModelRendererTurbo(this, 681, 25, textureX, textureY); // Box 252
		planeModeParts[13] = new ModelRendererTurbo(this, 1161, 25, textureX, textureY); // Box 253
		planeModeParts[14] = new ModelRendererTurbo(this, 1049, 33, textureX, textureY); // Box 263
		planeModeParts[15] = new ModelRendererTurbo(this, 1265, 1, textureX, textureY); // Box 264
		planeModeParts[16] = new ModelRendererTurbo(this, 1953, 9, textureX, textureY); // Box 962
		planeModeParts[17] = new ModelRendererTurbo(this, 577, 17, textureX, textureY); // Box 964
		planeModeParts[18] = new ModelRendererTurbo(this, 1177, 17, textureX, textureY); // Box 966
		planeModeParts[19] = new ModelRendererTurbo(this, 1393, 1, textureX, textureY); // Box 782
		planeModeParts[20] = new ModelRendererTurbo(this, 2041, 1, textureX, textureY); // Box 783
		planeModeParts[21] = new ModelRendererTurbo(this, 1289, 17, textureX, textureY); // Box 786
		planeModeParts[22] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 789
		planeModeParts[23] = new ModelRendererTurbo(this, 1937, 9, textureX, textureY); // Box 791
		planeModeParts[24] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 792
		planeModeParts[25] = new ModelRendererTurbo(this, 865, 137, textureX, textureY); // Box 443
		planeModeParts[26] = new ModelRendererTurbo(this, 1681, 33, textureX, textureY); // Box 444
		planeModeParts[27] = new ModelRendererTurbo(this, 1265, 25, textureX, textureY); // Box 445
		planeModeParts[28] = new ModelRendererTurbo(this, 1561, 25, textureX, textureY); // Box 446
		planeModeParts[29] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 447
		planeModeParts[30] = new ModelRendererTurbo(this, 465, 169, textureX, textureY); // Box 448
		planeModeParts[31] = new ModelRendererTurbo(this, 1625, 33, textureX, textureY); // Box 449
		planeModeParts[32] = new ModelRendererTurbo(this, 1849, 113, textureX, textureY); // Box 450
		planeModeParts[33] = new ModelRendererTurbo(this, 1033, 25, textureX, textureY); // Box 451
		planeModeParts[34] = new ModelRendererTurbo(this, 1705, 33, textureX, textureY); // Box 452
		planeModeParts[35] = new ModelRendererTurbo(this, 1097, 57, textureX, textureY); // Box 453
		planeModeParts[36] = new ModelRendererTurbo(this, 1473, 73, textureX, textureY); // Box 454
		planeModeParts[37] = new ModelRendererTurbo(this, 1713, 25, textureX, textureY); // Box 455
		planeModeParts[38] = new ModelRendererTurbo(this, 2025, 25, textureX, textureY); // Box 456
		planeModeParts[39] = new ModelRendererTurbo(this, 1129, 33, textureX, textureY); // Box 457
		planeModeParts[40] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 458
		planeModeParts[41] = new ModelRendererTurbo(this, 929, 25, textureX, textureY); // Box 459
		planeModeParts[42] = new ModelRendererTurbo(this, 961, 25, textureX, textureY); // Box 460
		planeModeParts[43] = new ModelRendererTurbo(this, 833, 33, textureX, textureY); // Box 461
		planeModeParts[44] = new ModelRendererTurbo(this, 561, 33, textureX, textureY); // Box 462
		planeModeParts[45] = new ModelRendererTurbo(this, 649, 33, textureX, textureY); // Box 463
		planeModeParts[46] = new ModelRendererTurbo(this, 849, 33, textureX, textureY); // Box 464
		planeModeParts[47] = new ModelRendererTurbo(this, 1185, 33, textureX, textureY); // Box 465
		planeModeParts[48] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 466
		planeModeParts[49] = new ModelRendererTurbo(this, 1041, 33, textureX, textureY); // Box 467

		planeModeParts[0].addShapeBox(0F, 1F, 0F, 10, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
		planeModeParts[0].setRotationPoint(-155F, -9F, -17F);
		planeModeParts[0].rotateAngleZ = -0.10471976F;

		planeModeParts[1].addShapeBox(9F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		planeModeParts[1].setRotationPoint(-155F, -9F, -17F);
		planeModeParts[1].rotateAngleZ = -0.10471976F;

		planeModeParts[2].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		planeModeParts[2].setRotationPoint(-155F, -9F, -17F);
		planeModeParts[2].rotateAngleZ = -0.10471976F;

		planeModeParts[3].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		planeModeParts[3].setRotationPoint(-155F, -9F, -8F);
		planeModeParts[3].rotateAngleZ = -0.10471976F;

		planeModeParts[4].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		planeModeParts[4].setRotationPoint(-155F, -9F, -17F);
		planeModeParts[4].rotateAngleZ = -0.10471976F;

		planeModeParts[5].addShapeBox(0F, 0F, 0F, 1, 13, 10, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		planeModeParts[5].setRotationPoint(-146F, -21F, -17F);

		planeModeParts[6].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		planeModeParts[6].setRotationPoint(-144F, -25F, -15F);

		planeModeParts[7].addShapeBox(0F, 0F, 0F, 1, 13, 8, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 246
		planeModeParts[7].setRotationPoint(-147F, -20F, -16F);

		planeModeParts[8].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		planeModeParts[8].setRotationPoint(-147.3F, -20.3F, -14F);

		planeModeParts[9].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		planeModeParts[9].setRotationPoint(-147.3F, -20.3F, -11F);

		planeModeParts[10].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 250
		planeModeParts[10].setRotationPoint(-146F, -18F, -16F);

		planeModeParts[11].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 251
		planeModeParts[11].setRotationPoint(-146F, -18F, -9F);

		planeModeParts[12].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 252
		planeModeParts[12].setRotationPoint(-152F, -8F, -18F);
		planeModeParts[12].rotateAngleZ = 0.78539816F;

		planeModeParts[13].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 253
		planeModeParts[13].setRotationPoint(-152F, -8F, -7F);
		planeModeParts[13].rotateAngleZ = 0.78539816F;

		planeModeParts[14].addShapeBox(-1F, -1F, 0F, 2, 11, 2, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 263
		planeModeParts[14].setRotationPoint(-156.5F, -13.25F, -13F);
		planeModeParts[14].rotateAngleZ = -1.13446401F;

		planeModeParts[15].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 264
		planeModeParts[15].setRotationPoint(-156F, -17F, -12.5F);

		planeModeParts[16].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 962
		planeModeParts[16].setRotationPoint(-144.5F, -24.5F, -13.5F);

		planeModeParts[17].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 964
		planeModeParts[17].setRotationPoint(-144.5F, -23.5F, -13.5F);

		planeModeParts[18].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 966
		planeModeParts[18].setRotationPoint(-144.5F, -22.5F, -13.5F);

		planeModeParts[19].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 782
		planeModeParts[19].setRotationPoint(-151F, -7F, -16F);

		planeModeParts[20].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 783
		planeModeParts[20].setRotationPoint(-151F, -7F, -9F);

		planeModeParts[21].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 786
		planeModeParts[21].setRotationPoint(-156F, -16.75F, -11.5F);

		planeModeParts[22].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 789
		planeModeParts[22].setRotationPoint(-156F, -16.75F, -15.5F);

		planeModeParts[23].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 791
		planeModeParts[23].setRotationPoint(-156F, -19.75F, -15.5F);

		planeModeParts[24].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 792
		planeModeParts[24].setRotationPoint(-156F, -19.75F, -9.5F);

		planeModeParts[25].addShapeBox(0F, 1F, 0F, 10, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 443
		planeModeParts[25].setRotationPoint(-155F, -9F, 7F);
		planeModeParts[25].rotateAngleZ = -0.10471976F;

		planeModeParts[26].addShapeBox(9F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 444
		planeModeParts[26].setRotationPoint(-155F, -9F, 7F);
		planeModeParts[26].rotateAngleZ = -0.10471976F;

		planeModeParts[27].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 445
		planeModeParts[27].setRotationPoint(-155F, -9F, 16F);
		planeModeParts[27].rotateAngleZ = -0.10471976F;

		planeModeParts[28].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 446
		planeModeParts[28].setRotationPoint(-155F, -9F, 7F);
		planeModeParts[28].rotateAngleZ = -0.10471976F;

		planeModeParts[29].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 447
		planeModeParts[29].setRotationPoint(-155F, -9F, 7F);
		planeModeParts[29].rotateAngleZ = -0.10471976F;

		planeModeParts[30].addShapeBox(0F, 0F, 0F, 1, 13, 10, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 448
		planeModeParts[30].setRotationPoint(-146F, -21F, 7F);

		planeModeParts[31].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 449
		planeModeParts[31].setRotationPoint(-144F, -25F, 9F);

		planeModeParts[32].addShapeBox(0F, 0F, 0F, 1, 13, 8, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 450
		planeModeParts[32].setRotationPoint(-147F, -20F, 8F);

		planeModeParts[33].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 451
		planeModeParts[33].setRotationPoint(-147.3F, -20.3F, 13F);

		planeModeParts[34].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 452
		planeModeParts[34].setRotationPoint(-147.3F, -20.3F, 10F);

		planeModeParts[35].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 453
		planeModeParts[35].setRotationPoint(-146F, -18F, 15F);

		planeModeParts[36].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 454
		planeModeParts[36].setRotationPoint(-146F, -18F, 8F);

		planeModeParts[37].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 455
		planeModeParts[37].setRotationPoint(-152F, -8F, 17F);
		planeModeParts[37].rotateAngleZ = 0.78539816F;

		planeModeParts[38].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 456
		planeModeParts[38].setRotationPoint(-152F, -8F, 6F);
		planeModeParts[38].rotateAngleZ = 0.78539816F;

		planeModeParts[39].addShapeBox(-1F, -1F, 0F, 2, 11, 2, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 457
		planeModeParts[39].setRotationPoint(-156.5F, -13.25F, 11F);
		planeModeParts[39].rotateAngleZ = -1.13446401F;

		planeModeParts[40].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 458
		planeModeParts[40].setRotationPoint(-156F, -17F, 11.5F);

		planeModeParts[41].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 459
		planeModeParts[41].setRotationPoint(-144.5F, -24.5F, 10.5F);

		planeModeParts[42].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 460
		planeModeParts[42].setRotationPoint(-144.5F, -23.5F, 10.5F);

		planeModeParts[43].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 461
		planeModeParts[43].setRotationPoint(-144.5F, -22.5F, 10.5F);

		planeModeParts[44].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 462
		planeModeParts[44].setRotationPoint(-151F, -7F, 15F);

		planeModeParts[45].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 463
		planeModeParts[45].setRotationPoint(-151F, -7F, 8F);

		planeModeParts[46].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 464
		planeModeParts[46].setRotationPoint(-156F, -16.75F, 8.5F);

		planeModeParts[47].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 465
		planeModeParts[47].setRotationPoint(-156F, -16.75F, 12.5F);

		planeModeParts[48].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 466
		planeModeParts[48].setRotationPoint(-156F, -19.75F, 14.5F);

		planeModeParts[49].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 467
		planeModeParts[49].setRotationPoint(-156F, -19.75F, 8.5F);
	}

	private void initPropeller()
	{
		propellerModels = new ModelRendererTurbo[3][3];
		propellerModels[0] = makeProp1(-125F, -66F, 0F);
		propellerModels[1] = makeProp2(-125F, -66F, -75F);
		propellerModels[2] = makeProp3(-125F, -66F, 75F);
	}

	private ModelRendererTurbo[] makeProp1(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[3];
		prop[0] = new ModelRendererTurbo(this, 0, 385, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 385, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 0, 385, textureX, textureY);
		prop[0].addBox(-1F, -30F, -2.5F, 2, 30, 5, 0.0F);
		prop[1].addBox(-1F, -30F, -2.5F, 2, 30, 5, 0.0F);
		prop[2].addBox(-1F, -30F, -2.5F, 2, 30, 5, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		return prop;
	}

	private ModelRendererTurbo[] makeProp2(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[3];
		prop[0] = new ModelRendererTurbo(this, 0, 385, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 385, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 0, 385, textureX, textureY);
		prop[0].addBox(-1F, -30F, -2.5F, 2, 30, 5, 0.0F);
		prop[1].addBox(-1F, -30F, -2.5F, 2, 30, 5, 0.0F);
		prop[2].addBox(-1F, -30F, -2.5F, 2, 30, 5, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		return prop;
	}

	private ModelRendererTurbo[] makeProp3(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[3];
		prop[0] = new ModelRendererTurbo(this, 0, 385, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 385, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 0, 385, textureX, textureY);
		prop[0].addBox(-1F, -30F, -2.5F, 2, 30, 5, 0.0F);
		prop[1].addBox(-1F, -30F, -2.5F, 2, 30, 5, 0.0F);
		prop[2].addBox(-1F, -30F, -2.5F, 2, 30, 5, 0.0F);
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

		gun_2_Model[1] = new ModelRendererTurbo[18];
		gun_2_Model[1][0] = new ModelRendererTurbo(this, 1218, 364, textureX, textureY); // MG 1
		gun_2_Model[1][1] = new ModelRendererTurbo(this, 1218, 364, textureX, textureY); // MG 1 Inner
		gun_2_Model[1][2] = new ModelRendererTurbo(this, 1218, 367, textureX, textureY); // MG 2 Lauf
		gun_2_Model[1][3] = new ModelRendererTurbo(this, 1218, 370, textureX, textureY); // MG 3
		gun_2_Model[1][4] = new ModelRendererTurbo(this, 1237, 370, textureX, textureY); // MG 4
		gun_2_Model[1][5] = new ModelRendererTurbo(this, 1218, 389, textureX, textureY); // MG 5
		gun_2_Model[1][6] = new ModelRendererTurbo(this, 1223, 389, textureX, textureY); // MG 6
		gun_2_Model[1][7] = new ModelRendererTurbo(this, 1218, 375, textureX, textureY); // MG 7
		gun_2_Model[1][8] = new ModelRendererTurbo(this, 1225, 375, textureX, textureY); // MG 8
		gun_2_Model[1][9] = new ModelRendererTurbo(this, 1225, 375, textureX, textureY); // MG 8 Inner
		gun_2_Model[1][10] = new ModelRendererTurbo(this, 1232, 375, textureX, textureY); // MG 9
		gun_2_Model[1][11] = new ModelRendererTurbo(this, 1232, 375, textureX, textureY); // MG 10
		gun_2_Model[1][12] = new ModelRendererTurbo(this, 1241, 374, textureX, textureY); // MG 11
		gun_2_Model[1][13] = new ModelRendererTurbo(this, 1218, 380, textureX, textureY); // Ammo 1
		gun_2_Model[1][14] = new ModelRendererTurbo(this, 1218, 380, textureX, textureY); // Ammo 2
		gun_2_Model[1][15] = new ModelRendererTurbo(this, 1224, 380, textureX, textureY); // Ammo 3
		gun_2_Model[1][16] = new ModelRendererTurbo(this, 1235, 380, textureX, textureY); // Ammo 4
		gun_2_Model[1][17] = new ModelRendererTurbo(this, 1235, 380, textureX, textureY); // Ammo 5

		gun_2_Model[1][0].addBox(-2F, -0.5F, -0.5F, 13, 1, 1, 0F); // MG 1

		gun_2_Model[1][1].addBox(-2F, -0.5F, -0.5F, 13, 1, 1, 0F); // MG 1 Inner

		gun_2_Model[1][2].addShapeBox(-2F, -0.5F, -0.5F, 13, 1, 1, 0F,0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F); // MG 2 Lauf

		gun_2_Model[1][3].addBox(-9F, -1F, -1F, 7, 2, 2, 0F); // MG 3

		gun_2_Model[1][4].addShapeBox(-6F, -1.5F, -1F, 4, 1, 2, 0F,-2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // MG 4

		gun_2_Model[1][5].addShapeBox(9F, -2.5F, -0.5F, 1, 2, 1, 0F,-0.4F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.4F, 0F, -0.4F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // MG 5

		gun_2_Model[1][6].addShapeBox(-4F, -2F, -0.5F, 1, 2, 1, 0F,-0.4F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.4F, 0F, -0.4F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // MG 6

		gun_2_Model[1][7].addShapeBox(-8.2F, 1F, -0.5F, 2, 3, 1, 0F,-1F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -1F, 0F, -0.1F, 0F, -1F, -0.1F, -1F, 0F, -0.1F, -1F, 0F, -0.1F, 0F, -1F, -0.1F); // MG 7

		gun_2_Model[1][8].addShapeBox(-7F, 1F, -0.5F, 2, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // MG 8

		gun_2_Model[1][9].addShapeBox(-7F, 1F, -0.5F, 2, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // MG 8 Inner

		gun_2_Model[1][10].addBox(-5.5F, -0.5F, 0.2F, 3, 1, 1, 0F); // MG 9

		gun_2_Model[1][11].addBox(-5.5F, -0.5F, -1.2F, 3, 1, 1, 0F); // MG 10

		gun_2_Model[1][12].addShapeBox(-2F, -1F, -1F, 2, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.25F, -0.25F); // MG 11

		gun_2_Model[1][13].addShapeBox(-5F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Ammo 1

		gun_2_Model[1][14].addShapeBox(-5F, 0F, -3F, 2, 1, 3, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Ammo 2

		gun_2_Model[1][15].addBox(-5F, 1F, -3F, 2, 1, 6, 0F); // Ammo 3

		gun_2_Model[1][16].addShapeBox(-5F, 2F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Ammo 4

		gun_2_Model[1][17].addShapeBox(-5F, 2F, -3F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Ammo 5

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[1])
		{
			gunPart.setRotationPoint(-200F, -20F, 0F);
		}


		gun_2_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("NoseGun", gun_2_Model);

		// Passenger 4
		ModelRendererTurbo[][] gun_3_Model = new ModelRendererTurbo[3][];

		gun_3_Model[0] = new ModelRendererTurbo[0];

		gun_3_Model[1] = new ModelRendererTurbo[20];
		gun_3_Model[1][0] = new ModelRendererTurbo(this, 1227, 360, textureX, textureY); // Ammo 1
		gun_3_Model[1][1] = new ModelRendererTurbo(this, 1218, 364, textureX, textureY); // Ammo 2
		gun_3_Model[1][2] = new ModelRendererTurbo(this, 1218, 369, textureX, textureY); // Barrel 1
		gun_3_Model[1][3] = new ModelRendererTurbo(this, 1218, 372, textureX, textureY); // Barrel 2
		gun_3_Model[1][4] = new ModelRendererTurbo(this, 1223, 369, textureX, textureY); // Barrel 3
		gun_3_Model[1][5] = new ModelRendererTurbo(this, 1218, 375, textureX, textureY); // Barrel 4
		gun_3_Model[1][6] = new ModelRendererTurbo(this, 1223, 372, textureX, textureY); // Barrel 5
		gun_3_Model[1][7] = new ModelRendererTurbo(this, 1223, 375, textureX, textureY); // Barrel 6
		gun_3_Model[1][8] = new ModelRendererTurbo(this, 1218, 378, textureX, textureY); // Barrel 7
		gun_3_Model[1][9] = new ModelRendererTurbo(this, 1218, 381, textureX, textureY); // Body 1
		gun_3_Model[1][10] = new ModelRendererTurbo(this, 1218, 384, textureX, textureY); // Body 2
		gun_3_Model[1][11] = new ModelRendererTurbo(this, 1218, 387, textureX, textureY); // Body 3
		gun_3_Model[1][12] = new ModelRendererTurbo(this, 1230, 372, textureX, textureY); // Griff 1
		gun_3_Model[1][13] = new ModelRendererTurbo(this, 1237, 372, textureX, textureY); // Griff 2
		gun_3_Model[1][14] = new ModelRendererTurbo(this, 1237, 381, textureX, textureY); // Griff 3
		gun_3_Model[1][15] = new ModelRendererTurbo(this, 1218, 360, textureX, textureY); // Mun 1
		gun_3_Model[1][16] = new ModelRendererTurbo(this, 1223, 360, textureX, textureY); // Mun 2
		gun_3_Model[1][17] = new ModelRendererTurbo(this, 1240, 360, textureX, textureY); // Schulter 1
		gun_3_Model[1][18] = new ModelRendererTurbo(this, 1240, 363, textureX, textureY); // Schulter 2
		gun_3_Model[1][19] = new ModelRendererTurbo(this, 1240, 366, textureX, textureY); // Schulter 3

		gun_3_Model[1][0].addBox(-3.4F, -0.2F, 0F, 2, 3, 4, 0F); // Ammo 1

		gun_3_Model[1][1].addShapeBox(-2.9F, -0.8F, 0F, 1, 0, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Ammo 2

		gun_3_Model[1][2].addShapeBox(11F, -1F, -0.5F, 1, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.2F, -0.2F); // Barrel 1

		gun_3_Model[1][3].addShapeBox(10F, -1F, -0.5F, 1, 1, 1, 0F,0F, -0.05F, -0.05F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.05F, -0.05F); // Barrel 2

		gun_3_Model[1][4].addShapeBox(-1F, -1F, -0.5F, 11, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Barrel 3

		gun_3_Model[1][5].addShapeBox(8F, -1.9F, -0.5F, 1, 1, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.2F, 0F, -0.3F); // Barrel 4

		gun_3_Model[1][6].addShapeBox(0F, -2F, -0.5F, 2, 1, 1, 0F,-0.2F, -0.3F, -0.4F, -1F, -0.3F, -0.4F, -1F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Barrel 5

		gun_3_Model[1][7].addShapeBox(-1F, -1F, -0.5F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F); // Barrel 6

		gun_3_Model[1][8].addShapeBox(-1F, -1F, -0.5F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F); // Barrel 7

		gun_3_Model[1][9].addBox(-9F, -1F, -0.5F, 8, 1, 1, 0F); // Body 1

		gun_3_Model[1][10].addShapeBox(-9F, -2F, -0.5F, 8, 1, 1, 0F,-5F, -0.6F, 0F, -0.4F, -0.6F, 0F, -0.4F, -0.6F, 0F, -5F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Body 2

		gun_3_Model[1][11].addShapeBox(-3.4F, -1.2F, -0.3F, 2, 1, 1, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F); // Body 3

		gun_3_Model[1][12].addShapeBox(-5.5F, 0F, -0.5F, 2, 1, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 0F, 0F, -0.3F); // Griff 1

		gun_3_Model[1][13].addShapeBox(-5.5F, 0F, -0.5F, 2, 1, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 0F, 0F, -0.3F); // Griff 2

		gun_3_Model[1][14].addShapeBox(-5.5F, 0F, -0.5F, 1, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 1F, -0.8F, -0.2F, -1F, -0.5F, -0.2F, -1F, -0.5F, -0.2F, 01F, -0.8F, -0.2F); // Griff 3

		gun_3_Model[1][15].addShapeBox(-4.2F, -1F, -1.2F, 1, 1, 1, 0F,-0.4F, -0.25F, 0F, -0.1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Mun 1

		gun_3_Model[1][16].addShapeBox(-4F, -1.5F, -1.3F, 1, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Mun 2

		gun_3_Model[1][17].addShapeBox(-12F, -2F, -0.5F, 2, 1, 1, 0F,0.5F, -0.5F, -0.25F, -2F, -0.5F, -0.2F, -2F, -0.5F, -0.2F, 0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.08F, 0F, 0F, -0.08F, 0F, 0F, -0.25F); // Schulter 1

		gun_3_Model[1][18].addShapeBox(-12F, -1F, -0.5F, 3, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F); // Schulter 2

		gun_3_Model[1][19].addShapeBox(-12F, 0F, -0.5F, 3, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.3F, -0.9F, 0F, -0.3F, -0.9F, 0F, 0F, 0F, -0.25F); // Schulter 3

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_3_Model[1])
		{
			gunPart.setRotationPoint(47F, -34F, 0F);
		}


		gun_3_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("DorsalGun", gun_3_Model);

		// Passenger 5
		ModelRendererTurbo[][] gun_4_Model = new ModelRendererTurbo[3][];

		gun_4_Model[0] = new ModelRendererTurbo[0];

		gun_4_Model[1] = new ModelRendererTurbo[18];
		gun_4_Model[1][0] = new ModelRendererTurbo(this, 1218, 364, textureX, textureY); // MG 1
		gun_4_Model[1][1] = new ModelRendererTurbo(this, 1218, 364, textureX, textureY); // MG 1 Inner
		gun_4_Model[1][2] = new ModelRendererTurbo(this, 1218, 367, textureX, textureY); // MG 2 Lauf
		gun_4_Model[1][3] = new ModelRendererTurbo(this, 1218, 370, textureX, textureY); // MG 3
		gun_4_Model[1][4] = new ModelRendererTurbo(this, 1237, 370, textureX, textureY); // MG 4
		gun_4_Model[1][5] = new ModelRendererTurbo(this, 1218, 389, textureX, textureY); // MG 5
		gun_4_Model[1][6] = new ModelRendererTurbo(this, 1223, 389, textureX, textureY); // MG 6
		gun_4_Model[1][7] = new ModelRendererTurbo(this, 1218, 375, textureX, textureY); // MG 7
		gun_4_Model[1][8] = new ModelRendererTurbo(this, 1225, 375, textureX, textureY); // MG 8
		gun_4_Model[1][9] = new ModelRendererTurbo(this, 1225, 375, textureX, textureY); // MG 8 Inner
		gun_4_Model[1][10] = new ModelRendererTurbo(this, 1232, 375, textureX, textureY); // MG 9
		gun_4_Model[1][11] = new ModelRendererTurbo(this, 1232, 375, textureX, textureY); // MG 10
		gun_4_Model[1][12] = new ModelRendererTurbo(this, 1241, 374, textureX, textureY); // MG 11
		gun_4_Model[1][13] = new ModelRendererTurbo(this, 1218, 380, textureX, textureY); // Ammo 1
		gun_4_Model[1][14] = new ModelRendererTurbo(this, 1218, 380, textureX, textureY); // Ammo 2
		gun_4_Model[1][15] = new ModelRendererTurbo(this, 1224, 380, textureX, textureY); // Ammo 3
		gun_4_Model[1][16] = new ModelRendererTurbo(this, 1235, 380, textureX, textureY); // Ammo 4
		gun_4_Model[1][17] = new ModelRendererTurbo(this, 1235, 380, textureX, textureY); // Ammo 5

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
			gunPart.setRotationPoint(211F, -66F, 0F);
		}


		gun_4_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("TailGun", gun_4_Model);
	}
}