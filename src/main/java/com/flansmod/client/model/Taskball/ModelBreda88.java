//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: breda88
// Model Creator: 
// Created on: 27.09.2022 - 15:29:04
// Last changed on: 27.09.2022 - 15:29:04

package com.flansmod.client.model.Taskball; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelBreda88 extends ModelPlane //Same as Filename
{
	int textureX = 1024;
	int textureY = 512;

	public ModelBreda88() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[292];
		tailModel = new ModelRendererTurbo[4];
		leftWingModel = new ModelRendererTurbo[38];
		tailWheelModel = new ModelRendererTurbo[5];
		leftWingWheelModel = new ModelRendererTurbo[10];

		initbodyModel_1();
		inittailModel_1();
		initleftWingModel_1();
		inittailWheelModel_1();
		initleftWingWheelModel_1();

		initPropeller();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 553, 1, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 689, 1, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 761, 1, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 801, 1, textureX, textureY); // Box 10
		bodyModel[11] = new ModelRendererTurbo(this, 841, 1, textureX, textureY); // Box 11
		bodyModel[12] = new ModelRendererTurbo(this, 881, 1, textureX, textureY); // Box 13
		bodyModel[13] = new ModelRendererTurbo(this, 913, 1, textureX, textureY); // Box 14
		bodyModel[14] = new ModelRendererTurbo(this, 953, 1, textureX, textureY); // Box 15
		bodyModel[15] = new ModelRendererTurbo(this, 985, 17, textureX, textureY); // Box 16
		bodyModel[16] = new ModelRendererTurbo(this, 681, 25, textureX, textureY); // Box 17
		bodyModel[17] = new ModelRendererTurbo(this, 745, 25, textureX, textureY); // Box 18
		bodyModel[18] = new ModelRendererTurbo(this, 801, 25, textureX, textureY); // Box 19
		bodyModel[19] = new ModelRendererTurbo(this, 849, 25, textureX, textureY); // Box 20
		bodyModel[20] = new ModelRendererTurbo(this, 897, 25, textureX, textureY); // Box 21
		bodyModel[21] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 22
		bodyModel[22] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 23
		bodyModel[23] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 24
		bodyModel[24] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 25
		bodyModel[25] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 26
		bodyModel[26] = new ModelRendererTurbo(this, 937, 25, textureX, textureY); // Box 27
		bodyModel[27] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 28
		bodyModel[28] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 29
		bodyModel[29] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 30
		bodyModel[30] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 31
		bodyModel[31] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Box 32
		bodyModel[32] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Box 33
		bodyModel[33] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Box 34
		bodyModel[34] = new ModelRendererTurbo(this, 537, 1, textureX, textureY); // Box 35
		bodyModel[35] = new ModelRendererTurbo(this, 993, 1, textureX, textureY); // Box 36
		bodyModel[36] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 37
		bodyModel[37] = new ModelRendererTurbo(this, 673, 1, textureX, textureY); // Box 38
		bodyModel[38] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 39
		bodyModel[39] = new ModelRendererTurbo(this, 753, 1, textureX, textureY); // Box 40
		bodyModel[40] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 41
		bodyModel[41] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 42
		bodyModel[42] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 43
		bodyModel[43] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 44
		bodyModel[44] = new ModelRendererTurbo(this, 521, 33, textureX, textureY); // Box 45
		bodyModel[45] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 46
		bodyModel[46] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 47
		bodyModel[47] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 48
		bodyModel[48] = new ModelRendererTurbo(this, 529, 41, textureX, textureY); // Box 49
		bodyModel[49] = new ModelRendererTurbo(this, 561, 41, textureX, textureY); // Box 50
		bodyModel[50] = new ModelRendererTurbo(this, 577, 41, textureX, textureY); // Box 51
		bodyModel[51] = new ModelRendererTurbo(this, 793, 1, textureX, textureY); // Box 52
		bodyModel[52] = new ModelRendererTurbo(this, 833, 1, textureX, textureY); // Box 53
		bodyModel[53] = new ModelRendererTurbo(this, 873, 1, textureX, textureY); // Box 54
		bodyModel[54] = new ModelRendererTurbo(this, 609, 41, textureX, textureY); // Box 55
		bodyModel[55] = new ModelRendererTurbo(this, 641, 41, textureX, textureY); // Box 56
		bodyModel[56] = new ModelRendererTurbo(this, 745, 41, textureX, textureY); // Box 57
		bodyModel[57] = new ModelRendererTurbo(this, 905, 1, textureX, textureY); // Box 58
		bodyModel[58] = new ModelRendererTurbo(this, 945, 1, textureX, textureY); // Box 59
		bodyModel[59] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 60
		bodyModel[60] = new ModelRendererTurbo(this, 777, 41, textureX, textureY); // Box 61
		bodyModel[61] = new ModelRendererTurbo(this, 809, 41, textureX, textureY); // Box 62
		bodyModel[62] = new ModelRendererTurbo(this, 841, 41, textureX, textureY); // Box 63
		bodyModel[63] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 64
		bodyModel[64] = new ModelRendererTurbo(this, 857, 41, textureX, textureY); // Box 65
		bodyModel[65] = new ModelRendererTurbo(this, 881, 41, textureX, textureY); // Box 66
		bodyModel[66] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 67
		bodyModel[67] = new ModelRendererTurbo(this, 913, 41, textureX, textureY); // Box 68
		bodyModel[68] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 69
		bodyModel[69] = new ModelRendererTurbo(this, 1001, 41, textureX, textureY); // Box 70
		bodyModel[70] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Box 71
		bodyModel[71] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 72
		bodyModel[72] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Box 73
		bodyModel[73] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 74
		bodyModel[74] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Box 75
		bodyModel[75] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 76
		bodyModel[76] = new ModelRendererTurbo(this, 513, 49, textureX, textureY); // Box 77
		bodyModel[77] = new ModelRendererTurbo(this, 609, 49, textureX, textureY); // Box 78
		bodyModel[78] = new ModelRendererTurbo(this, 633, 49, textureX, textureY); // Box 79
		bodyModel[79] = new ModelRendererTurbo(this, 825, 49, textureX, textureY); // Box 80
		bodyModel[80] = new ModelRendererTurbo(this, 713, 49, textureX, textureY); // Box 81
		bodyModel[81] = new ModelRendererTurbo(this, 929, 49, textureX, textureY); // Box 82
		bodyModel[82] = new ModelRendererTurbo(this, 305, 57, textureX, textureY); // Box 83
		bodyModel[83] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 84
		bodyModel[84] = new ModelRendererTurbo(this, 561, 65, textureX, textureY); // Box 85
		bodyModel[85] = new ModelRendererTurbo(this, 401, 73, textureX, textureY); // Box 86
		bodyModel[86] = new ModelRendererTurbo(this, 905, 73, textureX, textureY); // Box 87
		bodyModel[87] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 88
		bodyModel[88] = new ModelRendererTurbo(this, 961, 49, textureX, textureY); // Box 89
		bodyModel[89] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Box 90
		bodyModel[90] = new ModelRendererTurbo(this, 225, 81, textureX, textureY); // Box 91
		bodyModel[91] = new ModelRendererTurbo(this, 793, 57, textureX, textureY); // Box 92
		bodyModel[92] = new ModelRendererTurbo(this, 489, 65, textureX, textureY); // Box 93
		bodyModel[93] = new ModelRendererTurbo(this, 753, 73, textureX, textureY); // Box 94
		bodyModel[94] = new ModelRendererTurbo(this, 361, 81, textureX, textureY); // Box 97
		bodyModel[95] = new ModelRendererTurbo(this, 521, 81, textureX, textureY); // Box 98
		bodyModel[96] = new ModelRendererTurbo(this, 793, 81, textureX, textureY); // Box 99
		bodyModel[97] = new ModelRendererTurbo(this, 833, 81, textureX, textureY); // Box 100
		bodyModel[98] = new ModelRendererTurbo(this, 257, 65, textureX, textureY); // Box 101
		bodyModel[99] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 102
		bodyModel[100] = new ModelRendererTurbo(this, 561, 97, textureX, textureY); // Box 103
		bodyModel[101] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 104
		bodyModel[102] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 105
		bodyModel[103] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 106
		bodyModel[104] = new ModelRendererTurbo(this, 393, 57, textureX, textureY); // Box 107
		bodyModel[105] = new ModelRendererTurbo(this, 609, 97, textureX, textureY); // Box 108
		bodyModel[106] = new ModelRendererTurbo(this, 681, 97, textureX, textureY); // Box 109
		bodyModel[107] = new ModelRendererTurbo(this, 833, 81, textureX, textureY); // Box 110
		bodyModel[108] = new ModelRendererTurbo(this, 449, 89, textureX, textureY); // Box 111
		bodyModel[109] = new ModelRendererTurbo(this, 665, 97, textureX, textureY); // Box 112
		bodyModel[110] = new ModelRendererTurbo(this, 281, 105, textureX, textureY); // Box 113
		bodyModel[111] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 114
		bodyModel[112] = new ModelRendererTurbo(this, 97, 121, textureX, textureY); // Box 115
		bodyModel[113] = new ModelRendererTurbo(this, 521, 113, textureX, textureY); // Box 116
		bodyModel[114] = new ModelRendererTurbo(this, 193, 137, textureX, textureY); // Box 117
		bodyModel[115] = new ModelRendererTurbo(this, 377, 105, textureX, textureY); // Box 118
		bodyModel[116] = new ModelRendererTurbo(this, 761, 113, textureX, textureY); // Box 119
		bodyModel[117] = new ModelRendererTurbo(this, 793, 145, textureX, textureY); // Box 120
		bodyModel[118] = new ModelRendererTurbo(this, 409, 153, textureX, textureY); // Box 121
		bodyModel[119] = new ModelRendererTurbo(this, 513, 177, textureX, textureY); // Box 122
		bodyModel[120] = new ModelRendererTurbo(this, 929, 113, textureX, textureY); // Box 123
		bodyModel[121] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 124
		bodyModel[122] = new ModelRendererTurbo(this, 281, 121, textureX, textureY); // Box 125
		bodyModel[123] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // Box 126
		bodyModel[124] = new ModelRendererTurbo(this, 897, 57, textureX, textureY); // Box 127
		bodyModel[125] = new ModelRendererTurbo(this, 961, 57, textureX, textureY); // Box 128
		bodyModel[126] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 129
		bodyModel[127] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 130
		bodyModel[128] = new ModelRendererTurbo(this, 529, 65, textureX, textureY); // Box 131
		bodyModel[129] = new ModelRendererTurbo(this, 641, 185, textureX, textureY); // Box 132
		bodyModel[130] = new ModelRendererTurbo(this, 105, 193, textureX, textureY); // Box 133
		bodyModel[131] = new ModelRendererTurbo(this, 681, 185, textureX, textureY); // Box 134
		bodyModel[132] = new ModelRendererTurbo(this, 257, 193, textureX, textureY); // Box 135
		bodyModel[133] = new ModelRendererTurbo(this, 177, 201, textureX, textureY); // Box 136
		bodyModel[134] = new ModelRendererTurbo(this, 865, 209, textureX, textureY); // Box 137
		bodyModel[135] = new ModelRendererTurbo(this, 385, 225, textureX, textureY); // Box 138
		bodyModel[136] = new ModelRendererTurbo(this, 473, 241, textureX, textureY); // Box 139
		bodyModel[137] = new ModelRendererTurbo(this, 609, 121, textureX, textureY); // Box 140
		bodyModel[138] = new ModelRendererTurbo(this, 377, 137, textureX, textureY); // Box 141
		bodyModel[139] = new ModelRendererTurbo(this, 1, 257, textureX, textureY); // Box 142
		bodyModel[140] = new ModelRendererTurbo(this, 561, 249, textureX, textureY); // Box 143
		bodyModel[141] = new ModelRendererTurbo(this, 129, 265, textureX, textureY); // Box 144
		bodyModel[142] = new ModelRendererTurbo(this, 761, 145, textureX, textureY); // Box 145
		bodyModel[143] = new ModelRendererTurbo(this, 665, 273, textureX, textureY); // Box 146
		bodyModel[144] = new ModelRendererTurbo(this, 921, 145, textureX, textureY); // Box 147
		bodyModel[145] = new ModelRendererTurbo(this, 713, 73, textureX, textureY); // Box 148
		bodyModel[146] = new ModelRendererTurbo(this, 993, 73, textureX, textureY); // Box 149
		bodyModel[147] = new ModelRendererTurbo(this, 49, 97, textureX, textureY); // Box 150
		bodyModel[148] = new ModelRendererTurbo(this, 761, 97, textureX, textureY); // Box 151
		bodyModel[149] = new ModelRendererTurbo(this, 825, 97, textureX, textureY); // Box 152
		bodyModel[150] = new ModelRendererTurbo(this, 441, 105, textureX, textureY); // Box 153
		bodyModel[151] = new ModelRendererTurbo(this, 193, 137, textureX, textureY); // Box 203
		bodyModel[152] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 204
		bodyModel[153] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Box 206
		bodyModel[154] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 207
		bodyModel[155] = new ModelRendererTurbo(this, 97, 145, textureX, textureY); // Box 208
		bodyModel[156] = new ModelRendererTurbo(this, 537, 9, textureX, textureY); // Box 209
		bodyModel[157] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // Box 210
		bodyModel[158] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 211
		bodyModel[159] = new ModelRendererTurbo(this, 553, 9, textureX, textureY); // Import Box0
		bodyModel[160] = new ModelRendererTurbo(this, 985, 1, textureX, textureY); // Import Box0
		bodyModel[161] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Import Box35
		bodyModel[162] = new ModelRendererTurbo(this, 129, 73, textureX, textureY); // Import Box0
		bodyModel[163] = new ModelRendererTurbo(this, 673, 9, textureX, textureY); // Import Box0
		bodyModel[164] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Import Box0
		bodyModel[165] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Import Box0
		bodyModel[166] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Import Box0
		bodyModel[167] = new ModelRendererTurbo(this, 561, 9, textureX, textureY); // Import Box0
		bodyModel[168] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Import Box0
		bodyModel[169] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Import Box0
		bodyModel[170] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Import Box0
		bodyModel[171] = new ModelRendererTurbo(this, 545, 33, textureX, textureY); // Import Box0
		bodyModel[172] = new ModelRendererTurbo(this, 1017, 17, textureX, textureY); // Import Box0
		bodyModel[173] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Import Box0
		bodyModel[174] = new ModelRendererTurbo(this, 289, 41, textureX, textureY); // Import Box0
		bodyModel[175] = new ModelRendererTurbo(this, 673, 41, textureX, textureY); // Box 35
		bodyModel[176] = new ModelRendererTurbo(this, 737, 25, textureX, textureY); // Box 36
		bodyModel[177] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 37
		bodyModel[178] = new ModelRendererTurbo(this, 609, 49, textureX, textureY); // Box 235
		bodyModel[179] = new ModelRendererTurbo(this, 713, 49, textureX, textureY); // Box 236
		bodyModel[180] = new ModelRendererTurbo(this, 929, 105, textureX, textureY); // Box 237
		bodyModel[181] = new ModelRendererTurbo(this, 369, 41, textureX, textureY); // Box 238
		bodyModel[182] = new ModelRendererTurbo(this, 761, 49, textureX, textureY); // Box 239
		bodyModel[183] = new ModelRendererTurbo(this, 897, 49, textureX, textureY); // Box 240
		bodyModel[184] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Box 241
		bodyModel[185] = new ModelRendererTurbo(this, 721, 49, textureX, textureY); // Box 242
		bodyModel[186] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 243
		bodyModel[187] = new ModelRendererTurbo(this, 289, 57, textureX, textureY); // Box 244
		bodyModel[188] = new ModelRendererTurbo(this, 993, 49, textureX, textureY); // Box 245
		bodyModel[189] = new ModelRendererTurbo(this, 1017, 49, textureX, textureY); // Box 246
		bodyModel[190] = new ModelRendererTurbo(this, 337, 57, textureX, textureY); // Box 247
		bodyModel[191] = new ModelRendererTurbo(this, 345, 57, textureX, textureY); // Box 248
		bodyModel[192] = new ModelRendererTurbo(this, 137, 113, textureX, textureY); // Box 249
		bodyModel[193] = new ModelRendererTurbo(this, 297, 57, textureX, textureY); // Box 250
		bodyModel[194] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Box 251
		bodyModel[195] = new ModelRendererTurbo(this, 545, 57, textureX, textureY); // Box 252
		bodyModel[196] = new ModelRendererTurbo(this, 601, 57, textureX, textureY); // Box 253
		bodyModel[197] = new ModelRendererTurbo(this, 825, 57, textureX, textureY); // Box 254
		bodyModel[198] = new ModelRendererTurbo(this, 713, 57, textureX, textureY); // Box 255
		bodyModel[199] = new ModelRendererTurbo(this, 761, 57, textureX, textureY); // Box 256
		bodyModel[200] = new ModelRendererTurbo(this, 833, 57, textureX, textureY); // Box 258
		bodyModel[201] = new ModelRendererTurbo(this, 409, 65, textureX, textureY); // Box 259
		bodyModel[202] = new ModelRendererTurbo(this, 929, 65, textureX, textureY); // Box 260
		bodyModel[203] = new ModelRendererTurbo(this, 305, 73, textureX, textureY); // Box 261
		bodyModel[204] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 262
		bodyModel[205] = new ModelRendererTurbo(this, 985, 129, textureX, textureY); // Box 263
		bodyModel[206] = new ModelRendererTurbo(this, 897, 57, textureX, textureY); // Box 264
		bodyModel[207] = new ModelRendererTurbo(this, 209, 81, textureX, textureY); // Box 265
		bodyModel[208] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 266
		bodyModel[209] = new ModelRendererTurbo(this, 521, 65, textureX, textureY); // Box 267
		bodyModel[210] = new ModelRendererTurbo(this, 209, 89, textureX, textureY); // Box 268
		bodyModel[211] = new ModelRendererTurbo(this, 921, 57, textureX, textureY); // Box 269
		bodyModel[212] = new ModelRendererTurbo(this, 713, 89, textureX, textureY); // Box 270
		bodyModel[213] = new ModelRendererTurbo(this, 777, 65, textureX, textureY); // Box 271
		bodyModel[214] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 272
		bodyModel[215] = new ModelRendererTurbo(this, 473, 105, textureX, textureY); // Box 273
		bodyModel[216] = new ModelRendererTurbo(this, 769, 57, textureX, textureY); // Box 274
		bodyModel[217] = new ModelRendererTurbo(this, 817, 145, textureX, textureY); // Box 277
		bodyModel[218] = new ModelRendererTurbo(this, 737, 73, textureX, textureY); // Box 278
		bodyModel[219] = new ModelRendererTurbo(this, 977, 145, textureX, textureY); // Box 279
		bodyModel[220] = new ModelRendererTurbo(this, 1017, 57, textureX, textureY); // Box 649
		bodyModel[221] = new ModelRendererTurbo(this, 673, 97, textureX, textureY); // Box 650
		bodyModel[222] = new ModelRendererTurbo(this, 297, 41, textureX, textureY); // Box 656
		bodyModel[223] = new ModelRendererTurbo(this, 721, 57, textureX, textureY); // Box 657
		bodyModel[224] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 658
		bodyModel[225] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 659
		bodyModel[226] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 660
		bodyModel[227] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box 662
		bodyModel[228] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 663
		bodyModel[229] = new ModelRendererTurbo(this, 769, 49, textureX, textureY); // Box 664
		bodyModel[230] = new ModelRendererTurbo(this, 905, 49, textureX, textureY); // Box 665
		bodyModel[231] = new ModelRendererTurbo(this, 377, 105, textureX, textureY); // Box 638
		bodyModel[232] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 639
		bodyModel[233] = new ModelRendererTurbo(this, 761, 113, textureX, textureY); // Box 640
		bodyModel[234] = new ModelRendererTurbo(this, 273, 121, textureX, textureY); // Box 641
		bodyModel[235] = new ModelRendererTurbo(this, 217, 153, textureX, textureY); // Box 642
		bodyModel[236] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Box 643
		bodyModel[237] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 644
		bodyModel[238] = new ModelRendererTurbo(this, 833, 73, textureX, textureY); // Box 645
		bodyModel[239] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // Box 646
		bodyModel[240] = new ModelRendererTurbo(this, 953, 65, textureX, textureY); // Box 905
		bodyModel[241] = new ModelRendererTurbo(this, 569, 73, textureX, textureY); // Box 906
		bodyModel[242] = new ModelRendererTurbo(this, 305, 57, textureX, textureY); // Import 
		bodyModel[243] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Import 
		bodyModel[244] = new ModelRendererTurbo(this, 553, 57, textureX, textureY); // Import 
		bodyModel[245] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Import 
		bodyModel[246] = new ModelRendererTurbo(this, 393, 65, textureX, textureY); // Import 
		bodyModel[247] = new ModelRendererTurbo(this, 169, 73, textureX, textureY); // Box 922
		bodyModel[248] = new ModelRendererTurbo(this, 713, 73, textureX, textureY); // Box 927
		bodyModel[249] = new ModelRendererTurbo(this, 737, 73, textureX, textureY); // Box 929
		bodyModel[250] = new ModelRendererTurbo(this, 753, 73, textureX, textureY); // Box 930
		bodyModel[251] = new ModelRendererTurbo(this, 785, 73, textureX, textureY); // Box 444
		bodyModel[252] = new ModelRendererTurbo(this, 897, 73, textureX, textureY); // Box 445
		bodyModel[253] = new ModelRendererTurbo(this, 905, 73, textureX, textureY); // Box 325
		bodyModel[254] = new ModelRendererTurbo(this, 913, 73, textureX, textureY); // Box 326
		bodyModel[255] = new ModelRendererTurbo(this, 993, 73, textureX, textureY); // Box 675
		bodyModel[256] = new ModelRendererTurbo(this, 1017, 73, textureX, textureY); // Box 676
		bodyModel[257] = new ModelRendererTurbo(this, 345, 81, textureX, textureY); // Box 677
		bodyModel[258] = new ModelRendererTurbo(this, 353, 81, textureX, textureY); // Box 400
		bodyModel[259] = new ModelRendererTurbo(this, 361, 81, textureX, textureY); // Box 401
		bodyModel[260] = new ModelRendererTurbo(this, 393, 81, textureX, textureY); // Box 402
		bodyModel[261] = new ModelRendererTurbo(this, 401, 81, textureX, textureY); // Box 403
		bodyModel[262] = new ModelRendererTurbo(this, 409, 81, textureX, textureY); // Box 404
		bodyModel[263] = new ModelRendererTurbo(this, 553, 81, textureX, textureY); // Box 405
		bodyModel[264] = new ModelRendererTurbo(this, 665, 81, textureX, textureY); // Box 406
		bodyModel[265] = new ModelRendererTurbo(this, 793, 81, textureX, textureY); // Box 407
		bodyModel[266] = new ModelRendererTurbo(this, 825, 81, textureX, textureY); // Box 408
		bodyModel[267] = new ModelRendererTurbo(this, 905, 81, textureX, textureY); // Box 409
		bodyModel[268] = new ModelRendererTurbo(this, 913, 81, textureX, textureY); // Box 410
		bodyModel[269] = new ModelRendererTurbo(this, 345, 89, textureX, textureY); // Box 411
		bodyModel[270] = new ModelRendererTurbo(this, 353, 89, textureX, textureY); // Box 412
		bodyModel[271] = new ModelRendererTurbo(this, 665, 89, textureX, textureY); // Box 413
		bodyModel[272] = new ModelRendererTurbo(this, 745, 89, textureX, textureY); // Box 414
		bodyModel[273] = new ModelRendererTurbo(this, 489, 65, textureX, textureY); // Box 415
		bodyModel[274] = new ModelRendererTurbo(this, 769, 65, textureX, textureY); // Box 416
		bodyModel[275] = new ModelRendererTurbo(this, 993, 65, textureX, textureY); // Box 417
		bodyModel[276] = new ModelRendererTurbo(this, 49, 97, textureX, textureY); // Box 339
		bodyModel[277] = new ModelRendererTurbo(this, 81, 97, textureX, textureY); // Box 340
		bodyModel[278] = new ModelRendererTurbo(this, 673, 97, textureX, textureY); // Box 341
		bodyModel[279] = new ModelRendererTurbo(this, 737, 97, textureX, textureY); // Box 342
		bodyModel[280] = new ModelRendererTurbo(this, 761, 97, textureX, textureY); // Box 343
		bodyModel[281] = new ModelRendererTurbo(this, 857, 97, textureX, textureY); // Box 344
		bodyModel[282] = new ModelRendererTurbo(this, 377, 105, textureX, textureY); // Box 345
		bodyModel[283] = new ModelRendererTurbo(this, 393, 105, textureX, textureY); // Box 346
		bodyModel[284] = new ModelRendererTurbo(this, 441, 105, textureX, textureY); // Box 347
		bodyModel[285] = new ModelRendererTurbo(this, 521, 105, textureX, textureY); // Box 348
		bodyModel[286] = new ModelRendererTurbo(this, 545, 105, textureX, textureY); // Box 349
		bodyModel[287] = new ModelRendererTurbo(this, 553, 105, textureX, textureY); // Box 350
		bodyModel[288] = new ModelRendererTurbo(this, 137, 369, textureX, textureY); // Box 347
		bodyModel[289] = new ModelRendererTurbo(this, 497, 369, textureX, textureY); // Box 348
		bodyModel[290] = new ModelRendererTurbo(this, 593, 369, textureX, textureY); // Box 349
		bodyModel[291] = new ModelRendererTurbo(this, 689, 369, textureX, textureY); // Box 352

		bodyModel[0].addShapeBox(0F, 0F, 0F, 36, 12, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8.5F, 0F, 0F, -5F, 0F, 3.5F, 0F, 0F, -0.5F, 0F, 0F, -5.5F, -9.5F, 0F, -2.75F, -6.75F); // Box 0
		bodyModel[0].setRotationPoint(36F, -22F, 0F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 36, 10, 15, 0F,0F, 3.25F, 0F, 0F, -0.25F, 0F, 0F, -5F, -9.75F, 0F, -2.75F, -6.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8.5F, 0F, 0F, -5F); // Box 1
		bodyModel[1].setRotationPoint(36F, -32F, 0F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 34, 10, 15, 0F,0F, -0.25F, 0F, 0F, -6F, 0F, 0F, -7.75F, -13.25F, 0F, -5F, -9.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12.75F, 0F, 0F, -8.5F); // Box 2
		bodyModel[2].setRotationPoint(72F, -32F, 0F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 34, 12, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12.75F, 0F, 0F, -8.5F, 0F, -0.5F, 0F, 0F, -7.25F, 0F, 0F, -9.25F, -13.25F, 0F, -5.5F, -9.5F); // Box 3
		bodyModel[3].setRotationPoint(72F, -22F, 0F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 11, 4, 2, 0F,0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -4F, -1.5F, 0F, -1.75F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0.25F); // Box 4
		bodyModel[4].setRotationPoint(106F, -26F, 0F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 11, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0.25F, 0F, -0.25F, 0F, 0F, -4.25F, 0F, 0F, -4.75F, -1.5F, 0F, -2.25F, -0.25F); // Box 5
		bodyModel[5].setRotationPoint(106F, -22F, 0F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 52, 15, 15, 0F,0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -7.75F, -6.75F, 0F, -6.5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -2.75F); // Box 6
		bodyModel[6].setRotationPoint(-16F, -37F, 0F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 52, 17, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -2.75F, 0F, -0.25F, 0F, 0F, -1.5F, 0F, 0F, -7.75F, -6.75F, 0F, -6.5F, -5.5F); // Box 7
		bodyModel[7].setRotationPoint(-16F, -22F, 0F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 24, 6, 10, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -1.25F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -6.5F, -0.5F, 0F, -6.5F, -1.25F); // Box 8
		bodyModel[8].setRotationPoint(-40F, -11F, 0F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 10, 12, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, -0.25F, 0F, 0F, 1.25F, 0F, 0F, -4.25F, -1.25F, 0F, -5.25F, -2.25F); // Box 9
		bodyModel[9].setRotationPoint(-70F, -21F, 0F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 10, 12, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2.5F, 0F, -2.25F, 0F, 0F, -0.25F, 0F, 0F, -5.25F, -2.25F, 0F, -6.5F, -3.5F); // Box 10
		bodyModel[10].setRotationPoint(-80F, -21F, 0F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 10, 12, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -4.5F, 0F, -5.25F, 0F, 0F, -2.25F, 0F, 0F, -6.5F, -3.5F, 0F, -8F, -5.25F); // Box 11
		bodyModel[11].setRotationPoint(-90F, -21F, 0F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 6, 11, 9, 0F,0F, -8F, 0F, 0F, -5.25F, 0F, 0F, -8F, -5.25F, 0F, -9F, -7.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, -6.75F); // Box 13
		bodyModel[12].setRotationPoint(-96F, -32F, 0F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 10, 11, 9, 0F,0F, -5.25F, 0F, 0F, -2.25F, 0F, 0F, -6.5F, -3.5F, 0F, -8F, -5.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -4.5F); // Box 14
		bodyModel[13].setRotationPoint(-90F, -32F, 0F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 10, 11, 9, 0F,0F, -2.25F, 0F, 0F, -0.25F, 0F, 0F, -5.25F, -2.25F, 0F, -6.5F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2.5F); // Box 15
		bodyModel[14].setRotationPoint(-80F, -32F, 0F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 10, 11, 9, 0F,0F, -0.25F, 0F, 0F, 1.25F, 0F, 0F, -4.25F, -1.25F, 0F, -5.25F, -2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -1F); // Box 16
		bodyModel[15].setRotationPoint(-70F, -32F, 0F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 20, 6, 10, 0F,0F, 1.75F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1.25F, 0F, 2.25F, -2.25F, 0F, -2.75F, 0F, 0F, -0.75F, 0F, 0F, -6.5F, -1.25F, 0F, -8.25F, -2.25F); // Box 17
		bodyModel[16].setRotationPoint(-60F, -11F, 0F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 24, 11, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, -0.25F, 3.5F, 0F, 0F, 3F, 0F, -0.25F, -2.5F, 0F, -0.5F, -3.25F); // Box 18
		bodyModel[17].setRotationPoint(-40F, -22F, 10F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 20, 11, 2, 0F,0F, -1F, 2.75F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -2.75F, 0F, -2.25F, 3.5F, 0F, 0F, 3.5F, 0F, -0.5F, -3.25F, 0F, -2.25F, -4.25F); // Box 19
		bodyModel[18].setRotationPoint(-60F, -22F, 10F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 20, 10, 2, 0F,0F, -2.25F, 3.5F, 0F, -1.75F, 0.5F, 0F, -1.75F, -1.25F, 0F, -2.25F, -4.25F, 0F, -1F, 2.75F, 0F, -2F, 0F, 0F, -2F, -0.5F, 0F, -1F, -2.75F); // Box 20
		bodyModel[19].setRotationPoint(-60F, -30F, 10F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 24, 6, 2, 0F,0F, 0.25F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.65F, 0F, 0.25F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.5F); // Box 21
		bodyModel[20].setRotationPoint(-40F, -28F, 10F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F,-0.5F, 0.25F, 7F, 0F, 0.25F, 2.75F, 0F, 0F, -2.75F, 0F, 0.25F, -8F, 0F, 0.25F, 0.5F, 0F, 0.25F, -0.25F, 0F, 0.25F, 0.5F, 0F, 0.25F, -0.25F); // Box 22
		bodyModel[21].setRotationPoint(-60F, -33F, 7F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F,0F, 0.25F, 2.75F, 0F, 0.25F, 1.5F, 0F, 0F, -1.25F, 0F, 0F, -2.75F, 0F, 0.25F, -0.25F, 0F, 0F, -1F, 0F, 0F, 1.25F, 0F, 0.25F, 0.5F); // Box 23
		bodyModel[22].setRotationPoint(-55F, -33F, 7F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 10, 5, 1, 0F,0F, 0.25F, 1.5F, 0F, 1.25F, 2F, 0F, 0.75F, -1.5F, 0F, 0F, -1.25F, 0F, 0F, -1F, 0F, -0.25F, -2.5F, 0F, -0.25F, 2.75F, 0F, 0F, 1.25F); // Box 24
		bodyModel[23].setRotationPoint(-50F, -33F, 7F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 24, 5, 1, 0F,0F, 1.25F, 5F, 0F, 0.75F, 4.5F, 0F, -2.5F, 0F, 0F, 0.75F, -4.5F, 0F, -0.25F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0.35F, 0F, -0.25F, -0.25F); // Box 25
		bodyModel[24].setRotationPoint(-40F, -33F, 10F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 17, 1, 30, 0F,0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.75F, 0F, 0F, 1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F); // Box 26
		bodyModel[25].setRotationPoint(76F, -26F, 3F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 14, 1, 15, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.25F, 0F, 0F, 1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.75F, 0F, 0F); // Box 27
		bodyModel[26].setRotationPoint(79F, -26F, 33F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 8, 1, 9, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -1.75F, -5F, -0.5F, -2.25F, 1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, -3.5F, 0F, -1F); // Box 28
		bodyModel[27].setRotationPoint(83F, -26F, 48F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 10, 1, 9, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, -6F, -0.5F, -2.25F, 0F, -0.25F, -1.75F, 0F, 0F, 0F, 0.5F, 0F, 0F, -5F, 0F, -1F, 0F, 0F, 0.75F); // Box 29
		bodyModel[28].setRotationPoint(91F, -26F, 48F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 15, 1, 44, 0F,0F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[29].setRotationPoint(93F, -25.5F, 4F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 17, 1, 30, 0F,1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.75F, 0F, 0F); // Box 31
		bodyModel[30].setRotationPoint(76F, -25F, 3F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 14, 1, 15, 0F,1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.75F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.25F, 0F, 0F); // Box 32
		bodyModel[31].setRotationPoint(79F, -25F, 33F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 8, 1, 9, 0F,1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, -3.5F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -1.75F, -5F, -0.5F, -2.25F); // Box 33
		bodyModel[32].setRotationPoint(83F, -25F, 48F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 10, 1, 9, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, -5F, 0F, -1F, 0F, 0F, 0.75F, 0F, 0F, 0F, -1.5F, 0F, 0F, -6F, -0.5F, -2.25F, 0F, -0.25F, -1.75F); // Box 34
		bodyModel[33].setRotationPoint(91F, -25F, 48F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 11, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -4.75F, -1F, 0F, 0F, 0.75F, 0F, 0F, -1F, 0F, -5.75F, -2.25F, 0F); // Box 35
		bodyModel[34].setRotationPoint(72F, -23F, 29.25F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 13, 12, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F); // Box 36
		bodyModel[35].setRotationPoint(69F, -35F, 29.25F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 13, 6, 1, 0F,-1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -3.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F); // Box 37
		bodyModel[36].setRotationPoint(69F, -41F, 29.25F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 7, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F); // Box 38
		bodyModel[37].setRotationPoint(75F, -45F, 29.25F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 3, 6, 1, 0F,-1.75F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -2F, -0.5F, -0.25F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[38].setRotationPoint(72F, -47F, 29.25F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 7, 6, 1, 0F,0F, -3F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, -0.25F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F); // Box 40
		bodyModel[39].setRotationPoint(75F, -51F, 29.25F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 11, 16, 1, 0F,0F, 0.5F, 0F, -2.5F, -6.75F, 0F, -4F, -8F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, -2.75F, 0F, -0.25F, 0F, 0F, 0F); // Box 41
		bodyModel[40].setRotationPoint(87F, -51F, 29.25F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 11, 9, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, -2.75F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -4.25F, 0F, -3F, -6.5F, -0.25F, 0F, -2.75F, 0F); // Box 42
		bodyModel[41].setRotationPoint(87F, -35F, 29.25F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 5, 24, 1, 0F,0F, 1.75F, 0F, 0F, 1.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, -0.25F, -2.25F, 0F); // Box 43
		bodyModel[42].setRotationPoint(82F, -50F, 29.25F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 9, 6, 1, 0F,0F, 0F, 0F, -1.25F, 0F, 0F, -2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, -3.25F, -1.25F, 0F, -4.5F, -2.25F, 0F, 0F, -1F, 0F); // Box 44
		bodyModel[43].setRotationPoint(83F, -23F, 29.25F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 9, 6, 1, 0F,0F, 0F, 0F, -2.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -4.5F, -2.25F, 0F, -3.25F, -1.25F, 0F, 0F, 0.75F, 0F); // Box 45
		bodyModel[44].setRotationPoint(83F, -23F, 28.25F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 11, 6, 1, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.75F, -2.25F, 0F, 0F, -1F, 0F, 0F, 0.75F, 0F, -4.75F, -1F, 0F); // Box 46
		bodyModel[45].setRotationPoint(72F, -23F, 28.25F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 13, 12, 1, 0F,-1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 47
		bodyModel[46].setRotationPoint(69F, -35F, 28.25F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 11, 9, 1, 0F,0F, 0F, 0F, -2.75F, 0F, -0.25F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -2.75F, 0F, -3F, -6.5F, -0.25F, -0.25F, -4.25F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[47].setRotationPoint(87F, -35F, 28.25F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 13, 6, 1, 0F,-3.25F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 49
		bodyModel[48].setRotationPoint(69F, -41F, 28.25F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 5, 24, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1.5F, 0F, 0F, 1.75F, 0F, -0.25F, -2.25F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[49].setRotationPoint(82F, -50F, 28.25F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 11, 16, 1, 0F,0F, -1F, -0.25F, -4F, -8F, -0.25F, -2.5F, -6.75F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -2.75F, 0F, -0.25F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[50].setRotationPoint(87F, -51F, 28.25F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 7, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[51].setRotationPoint(75F, -45F, 28.25F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 7, 6, 1, 0F,0F, -4F, 0F, 0F, -0.75F, -0.25F, 0F, 0.75F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[52].setRotationPoint(75F, -51F, 28.25F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 3, 6, 1, 0F,-2F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 1F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 54
		bodyModel[53].setRotationPoint(72F, -47F, 28.25F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 11, 6, 1, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.75F, -2.25F, 0F, 0F, -1F, 0F, 0F, 0.75F, 0F, -4.75F, -1F, 0F); // Box 55
		bodyModel[54].setRotationPoint(72F, -23F, -30.25F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 13, 12, 1, 0F,-1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 56
		bodyModel[55].setRotationPoint(69F, -35F, -30.25F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 13, 6, 1, 0F,-3.25F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 57
		bodyModel[56].setRotationPoint(69F, -41F, -30.25F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 7, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[57].setRotationPoint(75F, -45F, -30.25F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 3, 6, 1, 0F,-2F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 1F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 59
		bodyModel[58].setRotationPoint(72F, -47F, -30.25F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 7, 6, 1, 0F,0F, -4F, 0F, 0F, -0.75F, -0.25F, 0F, 0.75F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[59].setRotationPoint(75F, -51F, -30.25F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 11, 16, 1, 0F,0F, -1F, -0.25F, -4F, -8F, -0.25F, -2.5F, -6.75F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -2.75F, 0F, -0.25F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[60].setRotationPoint(87F, -51F, -30.25F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 11, 9, 1, 0F,0F, 0F, 0F, -2.75F, 0F, -0.25F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -2.75F, 0F, -3F, -6.5F, -0.25F, -0.25F, -4.25F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[61].setRotationPoint(87F, -35F, -30.25F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 5, 24, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1.5F, 0F, 0F, 1.75F, 0F, -0.25F, -2.25F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[62].setRotationPoint(82F, -50F, -30.25F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 9, 6, 1, 0F,0F, 0F, 0F, -2.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -4.5F, -2.25F, 0F, -3.25F, -1.25F, 0F, 0F, 0.75F, 0F); // Box 64
		bodyModel[63].setRotationPoint(83F, -23F, -30.25F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 9, 6, 1, 0F,0F, 0F, 0F, -1.25F, 0F, 0F, -2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, -3.25F, -1.25F, 0F, -4.5F, -2.25F, 0F, 0F, -1F, 0F); // Box 65
		bodyModel[64].setRotationPoint(83F, -23F, -29.25F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 11, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -4.75F, -1F, 0F, 0F, 0.75F, 0F, 0F, -1F, 0F, -5.75F, -2.25F, 0F); // Box 66
		bodyModel[65].setRotationPoint(72F, -23F, -29.25F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 13, 12, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F); // Box 67
		bodyModel[66].setRotationPoint(69F, -35F, -29.25F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 11, 9, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, -2.75F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -4.25F, 0F, -3F, -6.5F, -0.25F, 0F, -2.75F, 0F); // Box 68
		bodyModel[67].setRotationPoint(87F, -35F, -29.25F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 13, 6, 1, 0F,-1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -3.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F); // Box 69
		bodyModel[68].setRotationPoint(69F, -41F, -29.25F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 5, 24, 1, 0F,0F, 1.75F, 0F, 0F, 1.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, -0.25F, -2.25F, 0F); // Box 70
		bodyModel[69].setRotationPoint(82F, -50F, -29.25F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 11, 16, 1, 0F,0F, 0.5F, 0F, -2.5F, -6.75F, 0F, -4F, -8F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, -2.75F, 0F, -0.25F, 0F, 0F, 0F); // Box 71
		bodyModel[70].setRotationPoint(87F, -51F, -29.25F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 7, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F); // Box 72
		bodyModel[71].setRotationPoint(75F, -45F, -29.25F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 7, 6, 1, 0F,0F, -3F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, -0.25F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F); // Box 73
		bodyModel[72].setRotationPoint(75F, -51F, -29.25F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 3, 6, 1, 0F,-1.75F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -2F, -0.5F, -0.25F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[73].setRotationPoint(72F, -47F, -29.25F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 17, 1, 30, 0F,-2.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, 0F); // Box 75
		bodyModel[74].setRotationPoint(76F, -26F, -33F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 14, 1, 15, 0F,-4.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -2.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, 0F); // Box 76
		bodyModel[75].setRotationPoint(79F, -26F, -48F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 8, 1, 9, 0F,-5F, -0.5F, -2.25F, 0F, -0.25F, -1.75F, 0F, 0F, 0F, -0.25F, 0F, 0F, -3.5F, 0F, -1F, 0F, 0F, 0.75F, 0F, 0F, 0F, 1.25F, 0F, 0F); // Box 77
		bodyModel[76].setRotationPoint(83F, -26F, -57F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 10, 1, 9, 0F,0F, -0.25F, -1.75F, -6F, -0.5F, -2.25F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, -5F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[77].setRotationPoint(91F, -26F, -57F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 15, 1, 44, 0F,0F, 0F, 0F, -6.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[78].setRotationPoint(93F, -25.5F, -48F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 17, 1, 30, 0F,-1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, 0F, -2.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F); // Box 80
		bodyModel[79].setRotationPoint(76F, -25F, -33F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 14, 1, 15, 0F,-2.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, 0F, -4.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 81
		bodyModel[80].setRotationPoint(79F, -25F, -48F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 8, 1, 9, 0F,-3.5F, 0F, -1F, 0F, 0F, 0.75F, 0F, 0F, 0F, 1.25F, 0F, 0F, -5F, -0.5F, -2.25F, 0F, -0.25F, -1.75F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 82
		bodyModel[81].setRotationPoint(83F, -25F, -57F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 10, 1, 9, 0F,0F, 0F, 0.75F, -5F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -1.75F, -6F, -0.5F, -2.25F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[82].setRotationPoint(91F, -25F, -57F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 36, 12, 15, 0F,0F, 0F, -5F, 0F, 0F, -8.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.75F, -6.75F, 0F, -5.5F, -9.5F, 0F, -0.5F, 0F, 0F, 3.5F, 0F); // Box 84
		bodyModel[83].setRotationPoint(36F, -22F, -15F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 36, 10, 15, 0F,0F, -2.75F, -6.75F, 0F, -5F, -9.75F, 0F, -0.25F, 0F, 0F, 3.25F, 0F, 0F, 0F, -5F, 0F, 0F, -8.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[84].setRotationPoint(36F, -32F, -15F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 34, 10, 15, 0F,0F, -5F, -9.75F, 0F, -7.75F, -13.25F, 0F, -6F, 0F, 0F, -0.25F, 0F, 0F, 0F, -8.5F, 0F, 0F, -12.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[85].setRotationPoint(72F, -32F, -15F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 34, 12, 15, 0F,0F, 0F, -8.5F, 0F, 0F, -12.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, -9.5F, 0F, -9.25F, -13.25F, 0F, -7.25F, 0F, 0F, -0.5F, 0F); // Box 87
		bodyModel[86].setRotationPoint(72F, -22F, -15F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 11, 4, 2, 0F,0F, -1.75F, -0.25F, 0F, -4F, -1.5F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[87].setRotationPoint(106F, -26F, -2F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 11, 5, 2, 0F,0F, 0F, 0.25F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, -0.25F, 0F, -4.75F, -1.5F, 0F, -4.25F, 0F, 0F, -0.25F, 0F); // Box 89
		bodyModel[88].setRotationPoint(106F, -22F, -2F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 52, 15, 15, 0F,0F, -6.5F, -4F, 0F, -7.75F, -6.75F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, -2.75F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[89].setRotationPoint(-16F, -37F, -15F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 52, 17, 15, 0F,0F, 0F, -2.75F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, -5.5F, 0F, -7.75F, -6.75F, 0F, -1.5F, 0F, 0F, -0.25F, 0F); // Box 91
		bodyModel[90].setRotationPoint(-16F, -22F, -15F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 10, 12, 9, 0F,0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.25F, -2.25F, 0F, -4.25F, -1.25F, 0F, 1.25F, 0F, 0F, -0.25F, 0F); // Box 92
		bodyModel[91].setRotationPoint(-70F, -21F, -9F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 10, 12, 9, 0F,0F, 0F, -2.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, -3.5F, 0F, -5.25F, -2.25F, 0F, -0.25F, 0F, 0F, -2.25F, 0F); // Box 93
		bodyModel[92].setRotationPoint(-80F, -21F, -9F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 10, 12, 9, 0F,0F, 0F, -4.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, -5.25F, 0F, -6.5F, -3.5F, 0F, -2.25F, 0F, 0F, -5.25F, 0F); // Box 94
		bodyModel[93].setRotationPoint(-90F, -21F, -9F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 10, 11, 9, 0F,0F, -8F, -5.25F, 0F, -6.5F, -3.5F, 0F, -2.25F, 0F, 0F, -5.25F, 0F, 0F, 0F, -4.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[94].setRotationPoint(-90F, -32F, -9F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 10, 11, 9, 0F,0F, -6.5F, -3.5F, 0F, -5.25F, -2.25F, 0F, -0.25F, 0F, 0F, -2.25F, 0F, 0F, 0F, -2.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		bodyModel[95].setRotationPoint(-80F, -32F, -9F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 10, 11, 9, 0F,0F, -5.25F, -2.25F, 0F, -4.25F, -1.25F, 0F, 1.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[96].setRotationPoint(-70F, -32F, -9F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 24, 11, 2, 0F,0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -3.25F, 0F, -0.25F, -2.5F, 0F, 0F, 3F, 0F, -0.25F, 3.5F); // Box 100
		bodyModel[97].setRotationPoint(-40F, -22F, -12F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 20, 11, 2, 0F,0F, -1F, -2.75F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F, 2.75F, 0F, -2.25F, -4.25F, 0F, -0.5F, -3.25F, 0F, 0F, 3.5F, 0F, -2.25F, 3.5F); // Box 101
		bodyModel[98].setRotationPoint(-60F, -22F, -12F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 20, 10, 2, 0F,0F, -2.25F, -4.25F, 0F, -1.75F, -1.25F, 0F, -1.75F, 0.5F, 0F, -2.25F, 3.5F, 0F, -1F, -2.75F, 0F, -2F, -0.5F, 0F, -2F, 0F, 0F, -1F, 2.75F); // Box 102
		bodyModel[99].setRotationPoint(-60F, -30F, -12F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 24, 6, 2, 0F,0F, 0.25F, -1.25F, 0F, 0F, -0.65F, 0F, 0F, 0F, 0F, 0.25F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[100].setRotationPoint(-40F, -28F, -12F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F,-0.1F, 0.25F, -8F, 0F, 0F, -2.75F, 0F, 0.25F, 2.75F, -0.7F, 0.25F, 7F, 0F, 0.25F, -0.25F, 0F, 0.15F, 0.6F, 0F, 0.25F, -0.25F, 0F, 0.25F, 0.5F); // Box 104
		bodyModel[101].setRotationPoint(-60F, -33F, -8F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F,0F, 0F, -2.75F, 0F, 0F, -1.25F, 0F, 0.25F, 1.5F, 0F, 0.25F, 2.75F, 0F, 0.25F, 0.5F, 0F, 0F, 1.25F, 0F, 0F, -1F, 0F, 0.25F, -0.25F); // Box 105
		bodyModel[102].setRotationPoint(-55F, -33F, -8F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 10, 5, 1, 0F,0F, 0F, -1.25F, 0F, 0.75F, -1.25F, 0F, 1.5F, 2F, 0F, 0.25F, 1.5F, 0F, 0F, 1.25F, 0F, -0.25F, 2.75F, 0F, -0.25F, -2.5F, 0F, 0F, -1F); // Box 106
		bodyModel[103].setRotationPoint(-50F, -33F, -8F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 24, 5, 1, 0F,0F, 0.75F, -4.25F, 0F, -2.5F, 0F, 0F, 0.75F, 4.5F, 0F, 1.5F, 5F, 0F, -0.25F, -0.25F, 0F, 0F, 0.35F, 0F, 0F, 0F, 0F, -0.25F, 0.5F); // Box 107
		bodyModel[104].setRotationPoint(-40F, -33F, -11F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 24, 6, 10, 0F,0F, 0.5F, -1.25F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -6.5F, -1.25F, 0F, -6.5F, -0.5F, 0F, -0.25F, 0F, 0F, -0.75F, 0F); // Box 108
		bodyModel[105].setRotationPoint(-40F, -11F, -10F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 20, 6, 10, 0F,0F, 2.25F, -2.25F, 0F, 0.5F, -1.25F, 0F, 0.5F, 0F, 0F, 1.75F, 0F, 0F, -8.25F, -2.25F, 0F, -6.5F, -1.25F, 0F, -0.75F, 0F, 0F, -2.75F, 0F); // Box 109
		bodyModel[106].setRotationPoint(-60F, -11F, -10F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 6, 4, 53, 0F,1F, 0F, 0F, 0F, 0F, -0.25F, 0F, 1.5F, 0F, -0.5F, 1.5F, 0F, 0F, -1.75F, 0F, 0F, 0F, -0.75F, 0F, -2.75F, 0F, -1.5F, -4F, 0F); // Box 110
		bodyModel[107].setRotationPoint(-47F, -29F, 9F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 6, 4, 55, 0F,-0.75F, -1.25F, -0.25F, 0F, 0.75F, 0.25F, 0F, 1.25F, 0F, -2.25F, -0.25F, 0F, 1F, 0F, -1.25F, 0F, 0F, -2F, 0F, -1.5F, 0F, -0.5F, -1.5F, 0F); // Box 111
		bodyModel[108].setRotationPoint(-47F, -33F, 7F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 5, 2, 83, 0F,-1.25F, -0.25F, 0F, 0F, 1.25F, 0F, 0F, 4.5F, 0F, -1.5F, 4F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -5.25F, 0F, 0F, -5.25F, 0F); // Box 112
		bodyModel[109].setRotationPoint(-46F, -33F, 62F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 5, 2, 83, 0F,0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 6.25F, 0F, 0F, 6.25F, 0F, -0.5F, -1F, 0F, 0F, 0.25F, 0F, 0F, -7F, 0F, -1.5F, -7.75F, 0F); // Box 113
		bodyModel[110].setRotationPoint(-46F, -30F, 62F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 18, 4, 56, 0F,0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 1F, -3.25F, 0F, 0.75F, -3.25F, 0F, -0.75F, 0F, 0F, -0.5F, 0F); // Box 114
		bodyModel[111].setRotationPoint(-41F, -34F, 6F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 18, 3, 56, 0F,0F, 1F, -3.25F, 0F, -1.75F, -3.25F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, 3F, -4.25F, 0F, 3.25F, -4F, 0F, -0.25F, 0F, 0F, 0.25F, 0F); // Box 115
		bodyModel[112].setRotationPoint(-41F, -31F, 6F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 15, 4, 56, 0F,0F, 0.25F, 0F, 3F, -0.25F, 0F, 0F, 2.25F, 0F, 0F, 2.5F, 0F, 0F, -0.25F, 0F, 3F, -0.5F, 0F, 0F, -4.25F, 0F, 0F, -4.5F, 0F); // Box 116
		bodyModel[113].setRotationPoint(-41F, -34F, 62F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 15, 4, 56, 0F,0F, 0.25F, 0F, 3F, -1.5F, 0F, 0F, 2.25F, 0F, 0F, 2.5F, 0F, 0F, 0.25F, 0F, 3F, -0.25F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F); // Box 117
		bodyModel[114].setRotationPoint(-41F, -32F, 62F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 15, 2, 27, 0F,0F, 0.5F, 0F, 0F, 0.25F, 0F, -5.75F, 1.25F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, -5.75F, -2.25F, 0F, 0F, -2.25F, 0F); // Box 118
		bodyModel[115].setRotationPoint(-41F, -36F, 118F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 15, 2, 27, 0F,0F, 0.5F, 0F, 0F, 0.25F, 0F, -5.75F, 2.25F, 0F, 0F, 2.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -5.75F, -2.75F, 0F, 0F, -3F, 0F); // Box 119
		bodyModel[116].setRotationPoint(-41F, -34F, 118F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 34, 4, 56, 0F,0F, -0.75F, 0.25F, -13.25F, -1.75F, -0.5F, -23.25F, -1.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, -2.5F, 5F, 2.25F, -1.75F, -10.5F, 0.5F, 0F, 0F, -0.5F, 0F); // Box 120
		bodyModel[117].setRotationPoint(-23F, -34F, 6F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 22, 4, 56, 0F,0F, -0.25F, 0F, -11.25F, -1.5F, 0F, -20.75F, 1.5F, 0F, 3F, 2.25F, 0F, 0F, 0F, 0F, 1.5F, 0.5F, 0F, -12F, -3.5F, 0F, 3F, -4.25F, 0F); // Box 121
		bodyModel[118].setRotationPoint(-23F, -34F, 62F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 34, 3, 56, 0F,0F, 0F, -3F, 5F, -3.25F, -1.5F, -10.5F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 3.25F, -4.25F, -9F, 2.5F, -1.25F, -23.25F, 0F, 0F, 0F, -0.25F, 0F); // Box 122
		bodyModel[119].setRotationPoint(-23F, -31F, 6F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 13, 2, 27, 0F,0F, 0.25F, 0F, -9F, -0.5F, 0F, -14.75F, 0.75F, 0F, 5.75F, 1.25F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -9.75F, -1.75F, 0F, 5.75F, -2.25F, 0F); // Box 123
		bodyModel[120].setRotationPoint(-26F, -36F, 118F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 22, 3, 56, 0F,0F, 1F, 0F, 1.5F, 0.5F, 0F, -12F, 4.5F, 0F, 3F, 5.25F, 0F, 0F, -2.25F, 0F, -11.25F, -1.5F, 0F, -19.75F, -6.5F, 0F, 3F, -6.5F, 0F); // Box 124
		bodyModel[121].setRotationPoint(-23F, -29F, 62F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 13, 2, 27, 0F,0F, 1F, 0F, 0F, 0.5F, 0F, -9.75F, 2.75F, 0F, 5.75F, 3.25F, 0F, 0F, -1.5F, 0F, -8F, -1.5F, 0F, -14.75F, -4F, 0F, 5.75F, -3.75F, 0F); // Box 125
		bodyModel[122].setRotationPoint(-26F, -33F, 118F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 5, 1, 10, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1F, -0.75F, -1.5F, 0.75F, -4.25F, -1.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, -1.25F, -3F, -2.75F, -1F, -5.25F); // Box 126
		bodyModel[123].setRotationPoint(-46F, -36F, 145F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 5, 1, 10, 0F,-1.5F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, -4.25F, -2.75F, -0.75F, -5.25F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, -0.75F, -1.5F, 0.25F, -4.25F); // Box 127
		bodyModel[124].setRotationPoint(-46F, -38F, 145F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 1F, 1.25F, 0F, 1F, 1.25F, 0F, -1F, 0F, 0.25F, -0.75F, 0F, 0F, -1.75F, -0.75F, 0F, -2.25F, -1F); // Box 128
		bodyModel[125].setRotationPoint(-41F, -36F, 145F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,0F, -0.5F, 0F, 0.25F, -0.75F, 0F, 0F, -0.75F, -2.25F, 0F, -0.75F, -2.25F, 0F, 0.25F, 0F, 0.25F, -0.25F, 0F, 0F, -1F, 1.25F, 0F, -1F, 1.25F); // Box 129
		bodyModel[126].setRotationPoint(-41F, -38F, 145F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,0F, -0.75F, 0F, -5.25F, -1.25F, 0F, -6F, -0.75F, -4.75F, 0F, -0.75F, -2.25F, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F, -4.25F, -0.75F, -2.25F, 0F, -1F, 1.25F); // Box 130
		bodyModel[127].setRotationPoint(-32F, -38F, 145F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,0F, 0.25F, 0F, 0.25F, -0.25F, 0F, -4.25F, 0.75F, -2.25F, 0F, 1F, 1.25F, 0F, -0.75F, 0F, -4.5F, -1F, 0F, -6.5F, -1.75F, -3.25F, 0F, -1.75F, -0.75F); // Box 131
		bodyModel[128].setRotationPoint(-32F, -36F, 145F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 6, 4, 53, 0F,-0.5F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, -0.25F, 1F, 0F, 0F, -1.5F, -4F, 0F, 0F, -2.75F, 0F, 0F, 0F, -0.75F, 0F, -1.75F, 0F); // Box 132
		bodyModel[129].setRotationPoint(-47F, -29F, -62F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 6, 4, 55, 0F,-2.25F, -0.25F, 0F, 0F, 1.25F, 0F, 0F, 0.75F, 1F, -0.75F, -1.25F, -0.25F, -0.5F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -2F, 1F, 0F, -1.25F); // Box 133
		bodyModel[130].setRotationPoint(-47F, -33F, -62F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 5, 2, 83, 0F,-1.5F, 4F, 0F, 0F, 4.5F, 0F, 0F, 1.25F, 0F, -1.25F, -0.25F, 0F, 0F, -5.25F, 0F, 0F, -5.25F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F); // Box 134
		bodyModel[131].setRotationPoint(-46F, -33F, -145F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 5, 2, 83, 0F,0F, 6.25F, 0F, 0F, 6.25F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, -1.5F, -7.75F, 0F, 0F, -7F, 0F, 0F, 0.25F, 0F, -0.5F, -1F, 0F); // Box 135
		bodyModel[132].setRotationPoint(-46F, -30F, -145F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 18, 4, 56, 0F,0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, -3.25F, 0F, 1F, -3.25F); // Box 136
		bodyModel[133].setRotationPoint(-41F, -34F, -62F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 18, 3, 56, 0F,0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -1.75F, -3.25F, 0F, 1F, -3.25F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 3.25F, -4F, 0F, 3F, -4.25F); // Box 137
		bodyModel[134].setRotationPoint(-41F, -31F, -62F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 15, 4, 56, 0F,0F, 2.5F, 0F, 0F, 2.25F, 0F, 3F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -4.5F, 0F, 0F, -4.25F, 0F, 3F, -0.5F, 0F, 0F, -0.25F, 0F); // Box 138
		bodyModel[135].setRotationPoint(-41F, -34F, -118F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 15, 4, 56, 0F,0F, 2.5F, 0F, 0F, 2.25F, 0F, 3F, -1.5F, 0F, 0F, 0.25F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 3F, -0.25F, 0F, 0F, 0.25F, 0F); // Box 139
		bodyModel[136].setRotationPoint(-41F, -32F, -118F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 15, 2, 27, 0F,0F, 1.5F, 0F, -5.75F, 1.25F, 0F, 0F, 0.25F, 0F, 0F, 0.5F, 0F, 0F, -2.25F, 0F, -5.75F, -2.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F); // Box 140
		bodyModel[137].setRotationPoint(-41F, -36F, -145F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 15, 2, 27, 0F,0F, 2.25F, 0F, -5.75F, 2.25F, 0F, 0F, 0.25F, 0F, 0F, 0.5F, 0F, 0F, -3F, 0F, -5.75F, -2.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 141
		bodyModel[138].setRotationPoint(-41F, -34F, -145F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 34, 4, 56, 0F,0F, -0.25F, 0F, -23.25F, -1.5F, 0F, -13.25F, -1.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -10.5F, 0.5F, 0F, 5F, 2.25F, -1.5F, 0F, 0F, -2.75F); // Box 142
		bodyModel[139].setRotationPoint(-23F, -34F, -62F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 22, 4, 56, 0F,3F, 2.25F, 0F, -20.75F, 1.5F, 0F, -11.25F, -1.5F, 0F, 0F, -0.25F, 0F, 3F, -4.25F, 0F, -12F, -3.5F, 0F, 1.5F, 0.5F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[140].setRotationPoint(-23F, -34F, -118F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 34, 3, 56, 0F,0F, -0.5F, 0F, -10.5F, -1.5F, 0F, 5F, -3.25F, -1.5F, 0F, 0F, -3F, 0F, -0.25F, 0F, -23.25F, 0F, 0F, -9F, 2.5F, -1.25F, 0F, 3.25F, -4.25F); // Box 144
		bodyModel[141].setRotationPoint(-23F, -31F, -62F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 13, 2, 27, 0F,5.75F, 1.25F, 0F, -14.75F, 0.75F, 0F, -9F, -0.5F, 0F, 0F, 0.25F, 0F, 5.75F, -2.25F, 0F, -9.75F, -1.75F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 145
		bodyModel[142].setRotationPoint(-26F, -36F, -145F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 22, 3, 56, 0F,3F, 5.25F, 0F, -12F, 4.5F, 0F, 1.5F, 0.5F, 0F, 0F, 1F, 0F, 3F, -6.5F, 0F, -19.75F, -6.5F, 0F, -11.25F, -1.5F, 0F, 0F, -2.25F, 0F); // Box 146
		bodyModel[143].setRotationPoint(-23F, -29F, -118F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 13, 2, 27, 0F,5.75F, 3.25F, 0F, -9.75F, 2.75F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 5.75F, -3.75F, 0F, -14.75F, -4F, 0F, -8F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 147
		bodyModel[144].setRotationPoint(-26F, -33F, -145F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 5, 1, 10, 0F,-1.5F, 0.75F, -4.25F, 0F, 1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -2.75F, -1F, -5.25F, 0F, -1.25F, -3F, 0F, 0F, 0F, -1.5F, -0.75F, 0F); // Box 148
		bodyModel[145].setRotationPoint(-46F, -36F, -155F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 5, 1, 10, 0F,-2.75F, -0.75F, -5.25F, 0F, -0.75F, -4.25F, 0F, -0.5F, 0F, -1.5F, -1F, 0F, -1.5F, 0.25F, -4.25F, 0F, 0F, -0.75F, 0F, 0.75F, 0F, 0F, 0.75F, 0F); // Box 149
		bodyModel[146].setRotationPoint(-46F, -38F, -155F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,0F, 1F, 1.25F, 0F, 1F, 1.25F, 0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -2.25F, -1F, 0F, -1.75F, -0.75F, 0.25F, -0.75F, 0F, 0F, -1F, 0F); // Box 150
		bodyModel[147].setRotationPoint(-41F, -36F, -153F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,0F, -0.75F, -2.25F, 0F, -0.75F, -2.25F, 0.25F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -1F, 1.25F, 0F, -1F, 1.25F, 0.25F, -0.25F, 0F, 0F, 0.25F, 0F); // Box 151
		bodyModel[148].setRotationPoint(-41F, -38F, -153F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,0F, -0.75F, -2.25F, -6F, -0.75F, -4.75F, -5.25F, -1.25F, 0F, 0F, -0.75F, 0F, 0F, -1F, 1.25F, -4.25F, -0.75F, -2.25F, 0.25F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 152
		bodyModel[149].setRotationPoint(-32F, -38F, -153F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,0F, 1F, 1.25F, -4.25F, 0.75F, -2.25F, 0.25F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -1.75F, -0.75F, -6.5F, -1.75F, -3.25F, -4.5F, -1F, 0F, 0F, -0.75F, 0F); // Box 153
		bodyModel[150].setRotationPoint(-32F, -36F, -153F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 6, 12, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, -6.75F, 0F, -8F, 0F, 0F, -5.25F, 0F, 0F, -8F, -5.25F, 0F, -9F, -7.25F); // Box 203
		bodyModel[151].setRotationPoint(-96F, -21F, 0F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -1F, -1.25F, 0F, -2.75F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -2.5F); // Box 204
		bodyModel[152].setRotationPoint(-99F, -24F, 0F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 3, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -2.5F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -1F, -1.25F, 0F, -2.75F, -2.5F); // Box 206
		bodyModel[153].setRotationPoint(-99F, -21F, 0F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 6, 11, 9, 0F,0F, -9F, -7.25F, 0F, -8F, -5.25F, 0F, -5.25F, 0F, 0F, -8F, 0F, 0F, 0F, -6.75F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		bodyModel[154].setRotationPoint(-96F, -32F, -9F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 6, 12, 9, 0F,0F, 0F, -6.75F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, -7.25F, 0F, -8F, -5.25F, 0F, -5.25F, 0F, 0F, -8F, 0F); // Box 208
		bodyModel[155].setRotationPoint(-96F, -21F, -9F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, -2.75F, -2.5F, 0F, -1F, -1.25F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, -2.5F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 209
		bodyModel[156].setRotationPoint(-99F, -24F, -3F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 3, 4, 3, 0F,0F, 0F, -2.5F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.75F, -2.5F, 0F, -1F, -1.25F, 0F, 0F, 0F, 0F, -2.5F, 0F); // Box 210
		bodyModel[157].setRotationPoint(-99F, -21F, -3F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -2.75F, 0F, 0.25F, -3F, 0F, 0F, 2.75F, 0F, 0F, 2.75F); // Box 211
		bodyModel[158].setRotationPoint(-50F, -39F, 3F);

		bodyModel[159].addShapeBox(-1F, 0.5F, -1.5F, 2, 1, 3, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		bodyModel[159].setRotationPoint(-16F, -39F, 0F);

		bodyModel[160].addShapeBox(-1F, -0.5F, -1.5F, 2, 2, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.8F, -0.5F, 0F, -0.8F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.8F); // Import Box0
		bodyModel[160].setRotationPoint(-16F, -39F, 0F);

		bodyModel[161].addShapeBox(-1F, -0.5F, 0.5F, 2, 2, 1, 0F,-0.5F, 0F, -0.8F, -0.5F, 0F, -0.8F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Import Box35
		bodyModel[161].setRotationPoint(-16F, -39F, 0F);

		bodyModel[162].addShapeBox(2F, -0.5F, -0.5F, 15, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Import Box0
		bodyModel[162].setRotationPoint(-16F, -39F, 0F);

		bodyModel[163].addShapeBox(2F, -0.5F, -0.5F, 5, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Import Box0
		bodyModel[163].setRotationPoint(-16F, -39F, 0F);

		bodyModel[164].addShapeBox(-6F, -1.5F, -1F, 8, 2, 2, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Import Box0
		bodyModel[164].setRotationPoint(-16F, -39F, 0F);

		bodyModel[165].addShapeBox(1.5F, -0.5F, -0.5F, 14, 1, 1, 0F,0F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Import Box0
		bodyModel[165].setRotationPoint(-16F, -39F, 0F);

		bodyModel[166].addShapeBox(-0.5F, -0.5F, -1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Import Box0
		bodyModel[166].setRotationPoint(-16F, -39F, 0F);

		bodyModel[167].addShapeBox(-8F, -0.6F, -0.5F, 2, 1, 1, 0F,-0.4F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -0.2F, -0.2F); // Import Box0
		bodyModel[167].setRotationPoint(-16F, -39F, 0F);

		bodyModel[168].addShapeBox(-1F, -1.5F, -2.8F, 2, 1, 2, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.1F, -0.8F, -0.2F, -0.1F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		bodyModel[168].setRotationPoint(-16F, -39F, 0F);

		bodyModel[169].addShapeBox(-5.5F, -1F, -1F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		bodyModel[169].setRotationPoint(-16F, -39F, 0F);

		bodyModel[170].addShapeBox(-5F, -1.6F, -0.5F, 7, 2, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Import Box0
		bodyModel[170].setRotationPoint(-16F, -39F, 0F);

		bodyModel[171].addShapeBox(-5F, -0.75F, -1.8F, 3, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box0
		bodyModel[171].setRotationPoint(-16F, -39F, 0F);

		bodyModel[172].addShapeBox(-4.95F, -0.9F, -2.45F, 1, 2, 1, 0F,0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.2F, 0F, -0.6F, -0.2F, 0F, -0.6F, -0.2F, -0.6F, 0F, -0.2F, -0.6F); // Import Box0
		bodyModel[172].setRotationPoint(-16F, -39F, 0F);

		bodyModel[173].addShapeBox(-5.5F, -1F, -3F, 1, 1, 3, 0F,-0.5F, -0.9F, -0.5F, 0F, -0.9F, -0.5F, 0F, -0.9F, 0F, -0.5F, -0.9F, 0F, -0.5F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, 0F, -0.5F, 0.2F, 0F); // Import Box0
		bodyModel[173].setRotationPoint(-16F, -39F, 0F);

		bodyModel[174].addShapeBox(-0.5F, -0.5F, -1.5F, 1, 1, 3, 0F,-0.25F, -0.25F, -0.1F, -0.25F, -0.25F, -0.1F, -0.25F, -0.25F, -0.1F, -0.25F, -0.25F, -0.1F, -0.25F, -0.25F, -0.1F, -0.25F, -0.25F, -0.1F, -0.25F, -0.25F, -0.1F, -0.25F, -0.25F, -0.1F); // Import Box0
		bodyModel[174].setRotationPoint(-16F, -39F, 0F);

		bodyModel[175].addShapeBox(3F, -0.8F, -0.5F, 3, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 35
		bodyModel[175].setRotationPoint(-16F, -39F, 0F);

		bodyModel[176].addShapeBox(5F, -2.8F, -0.5F, 1, 2, 1, 0F,0F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 36
		bodyModel[176].setRotationPoint(-16F, -39F, 0F);

		bodyModel[177].addShapeBox(14F, -2.4F, -0.5F, 1, 2, 1, 0F,0F, 0F, -0.3F, -0.8F, 0F, -0.3F, -0.8F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.8F, 0F, -0.3F, -0.8F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 37
		bodyModel[177].setRotationPoint(-16F, -39F, 0F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -3F, 0F, 0.25F, -3F, 0F, 0F, 2.75F, 0F, 0F, 2.75F); // Box 235
		bodyModel[178].setRotationPoint(-44F, -39F, 3F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -3F, 0F, 0.25F, -3.25F, 0F, 0F, 2.75F, 0F, 0F, 2.75F); // Box 236
		bodyModel[179].setRotationPoint(-38F, -39F, 3F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 23, 1, 1, 0F,0F, 0F, 0F, 0F, 0.25F, 0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 237
		bodyModel[180].setRotationPoint(-50F, -40F, 3F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 238
		bodyModel[181].setRotationPoint(-50F, -41F, 0F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 239
		bodyModel[182].setRotationPoint(-44F, -41F, 0F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 240
		bodyModel[183].setRotationPoint(-38F, -41F, 0F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 241
		bodyModel[184].setRotationPoint(-28F, -41F, 0F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-2.75F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -2.75F, 0F, 0F, 0F, 0.25F, -3.25F, 0F, 0.25F, -3.25F, 0F, 0F, 2.75F, 0F, 0F, 2.75F); // Box 242
		bodyModel[185].setRotationPoint(-31F, -39F, 3F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0.25F, 0F, -0.75F, 0F, 0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, 1F, -0.25F, 0F, -0.75F, 0F, 0.25F); // Box 243
		bodyModel[186].setRotationPoint(-55F, -39F, 0F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-1F, 0.25F, 0F, 0F, 1F, -1F, 0F, 0.75F, 0.5F, 0.25F, 0F, -0.75F, -1F, -0.25F, 0F, 0F, -1F, -1F, 0F, -1F, 1F, 0.25F, 0F, -0.75F); // Box 244
		bodyModel[187].setRotationPoint(-54F, -39F, 2F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0.5F, 0F, -0.5F, -1F, 0F, -0.75F, 5F, 0F, 0F, -5F, 0F, 0F, -4.25F, 0F, 0F, 4.5F, 0.25F, -0.25F); // Box 245
		bodyModel[188].setRotationPoint(-55F, -39F, 2F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.75F, 0F, 0F, 2.75F, 0F, 0.25F, -3F, 0F, 0.25F, -2.75F); // Box 246
		bodyModel[189].setRotationPoint(-50F, -39F, -4F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.75F, 0F, 0F, 2.75F, 0F, 0.25F, -3F, 0F, 0.25F, -2.75F); // Box 247
		bodyModel[190].setRotationPoint(-44F, -39F, -4F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.75F, 0F, 0F, 2.75F, 0F, 0.25F, -3.25F, 0F, 0.25F, -3.25F); // Box 248
		bodyModel[191].setRotationPoint(-38F, -39F, -4F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 23, 1, 1, 0F,0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[192].setRotationPoint(-50F, -40F, -4F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[193].setRotationPoint(-50F, -41F, -3F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 251
		bodyModel[194].setRotationPoint(-44F, -41F, -3F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[195].setRotationPoint(-38F, -41F, -3F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 253
		bodyModel[196].setRotationPoint(-28F, -41F, -3F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-2.75F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -2.75F, 0F, 0F, 0F, 0F, 2.75F, 0F, 0F, 2.75F, 0F, 0.25F, -3.25F, 0F, 0.25F, -3.25F); // Box 254
		bodyModel[197].setRotationPoint(-31F, -39F, -4F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.75F, 0F, 0.25F, 1F, 0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0.25F, 1F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 255
		bodyModel[198].setRotationPoint(-55F, -39F, -2F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0.25F, 0F, -0.75F, 0F, 0.75F, 0.5F, 0F, 1F, -1F, -1F, 0.25F, 0F, 0.25F, 0F, -0.75F, 0F, -1F, 1F, 0F, -1F, -1F, -1F, -0.25F, 0F); // Box 256
		bodyModel[199].setRotationPoint(-54F, -39F, -3F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-1F, 0F, -0.75F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0.25F, -0.75F, 0F, 0.25F, 4.5F, 0.25F, -0.25F, -4.25F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F); // Box 258
		bodyModel[200].setRotationPoint(-55F, -39F, -3F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 259
		bodyModel[201].setRotationPoint(-93F, -27F, -2F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
		bodyModel[202].setRotationPoint(-91F, -22.5F, -6F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[203].setRotationPoint(-87F, -13F, -2F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 2, 20, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1F); // Box 262
		bodyModel[204].setRotationPoint(-36.5F, -32F, -10F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 10, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 263
		bodyModel[205].setRotationPoint(-34.5F, -19F, -4F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 264
		bodyModel[206].setRotationPoint(-30.5F, -31.5F, 4.5F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 265
		bodyModel[207].setRotationPoint(-29.5F, -31.5F, 4.5F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F); // Box 266
		bodyModel[208].setRotationPoint(-34.5F, -31.5F, 0.5F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F); // Box 267
		bodyModel[209].setRotationPoint(-34.5F, -25.5F, 0.5F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 268
		bodyModel[210].setRotationPoint(-29.5F, -25.5F, 4.5F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 269
		bodyModel[211].setRotationPoint(-30.5F, -31.5F, -5.5F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 270
		bodyModel[212].setRotationPoint(-29.5F, -31.5F, -5.5F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 271
		bodyModel[213].setRotationPoint(-34.5F, -31.5F, -1.5F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 272
		bodyModel[214].setRotationPoint(-34.5F, -25.5F, -1.5F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 273
		bodyModel[215].setRotationPoint(-29.5F, -25.5F, -5.5F);

		bodyModel[216].addShapeBox(-1F, 0.5F, -1.5F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 274
		bodyModel[216].setRotationPoint(-16F, -38F, 0F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 2, 4, 12, 0F,0F, 0F, -4.25F, 0F, 0F, -2.75F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 277
		bodyModel[217].setRotationPoint(-59.5F, -32F, -6F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F,0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -3F, 0F, 0F, -2.75F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, -1.25F); // Box 278
		bodyModel[218].setRotationPoint(-59.5F, -33F, -4F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 2, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 279
		bodyModel[219].setRotationPoint(-59.5F, -28F, -6F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 2, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 649
		bodyModel[220].setRotationPoint(-56F, -27F, 5.5F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 650
		bodyModel[221].setRotationPoint(-56F, -27F, -0.5F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 656
		bodyModel[222].setRotationPoint(-55F, -27F, -0.5F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 657
		bodyModel[223].setRotationPoint(-54.5F, -27F, 0.5F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 658
		bodyModel[224].setRotationPoint(-54.5F, -27F, -2.5F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 659
		bodyModel[225].setRotationPoint(-54.5F, -28F, -4.5F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 660
		bodyModel[226].setRotationPoint(-54.5F, -29F, -4.5F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 662
		bodyModel[227].setRotationPoint(-54.5F, -32F, -3.5F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 663
		bodyModel[228].setRotationPoint(-54.5F, -32F, 2.5F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, -2F, 0F, 1F, -2F); // Box 664
		bodyModel[229].setRotationPoint(-54.5F, -28F, 3.5F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 665
		bodyModel[230].setRotationPoint(-54.5F, -29F, 3.5F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 1, 14, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F); // Box 638
		bodyModel[231].setRotationPoint(-38F, -33F, -6F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 1, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F); // Box 639
		bodyModel[232].setRotationPoint(-41F, -19F, -6F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -1F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F); // Box 640
		bodyModel[233].setRotationPoint(-44F, -16F, -6F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 641
		bodyModel[234].setRotationPoint(-50F, -15F, -6F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 642
		bodyModel[235].setRotationPoint(-53F, -17F, -6F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 7, 4, 1, 0F,4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F); // Box 643
		bodyModel[236].setRotationPoint(-48F, -19F, -6F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F); // Box 644
		bodyModel[237].setRotationPoint(-53F, -19F, -6F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 7, 4, 1, 0F,4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F); // Box 645
		bodyModel[238].setRotationPoint(-48F, -19F, 5F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F); // Box 646
		bodyModel[239].setRotationPoint(-53F, -19F, 5F);

		bodyModel[240].addShapeBox(0F, -1F, 0F, 1, 1, 2, 0F,0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Box 905
		bodyModel[240].setRotationPoint(-59.75F, -15.5F, -5F);
		bodyModel[240].rotateAngleZ = 0.41887903F;

		bodyModel[241].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Box 906
		bodyModel[241].setRotationPoint(-59.75F, -15.5F, -5F);
		bodyModel[241].rotateAngleZ = 0.41887903F;

		bodyModel[242].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.3F, 0.0F, 0.2F, 0.3F, 0.0F, 0.2F, -0.5F, 0.0F, 0.2F, -0.5F, 0.0F, 0.2F, 0.3F, 0.0F, 0.2F); // Import 
		bodyModel[242].setRotationPoint(-57.7F, -33.5F, -0.5F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, 0.0F, 0.2F, -0.5F, 0.0F, 0.2F, -0.5F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, -0.5F, 0.2F, -0.5F, -0.5F, 0.2F, -0.5F, -0.5F, 0.2F, 0.0F, -0.5F, 0.2F); // Import 
		bodyModel[243].setRotationPoint(-57.7F, -34.02F, -0.5F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, 0.0F, 0.2F, -0.5F, 0.0F, -0.3F, -0.5F, 0.0F, -0.3F, 0.0F, 0.0F, 0.2F, 0.0F, -0.5F, 0.2F, -0.5F, -0.5F, -0.3F, -0.5F, -0.5F, -0.3F, 0.0F, -0.5F, 0.2F); // Import 
		bodyModel[244].setRotationPoint(-57.2F, -34.02F, -0.5F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0.0F, -0.3F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, -0.5F, 0.0F, -0.3F, -0.5F, -0.5F, -0.3F, 0.0F, -0.5F, 0.2F, 0.0F, -0.5F, 0.2F, -0.5F, -0.5F, -0.3F); // Import 
		bodyModel[245].setRotationPoint(-58.7F, -34.02F, -0.5F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F); // Import 
		bodyModel[246].setRotationPoint(-58F, -34.32F, -0.5F);

		bodyModel[247].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 922
		bodyModel[247].setRotationPoint(-49F, -29.5F, -4.8F);
		bodyModel[247].rotateAngleX = -1.55334303F;
		bodyModel[247].rotateAngleZ = -0.01745329F;

		bodyModel[248].addShapeBox(-0.5F, 0F, -0.5F, 1, 3, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 927
		bodyModel[248].setRotationPoint(-49F, -29.5F, -4.8F);
		bodyModel[248].rotateAngleX = -1.55334303F;
		bodyModel[248].rotateAngleZ = -0.01745329F;

		bodyModel[249].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 929
		bodyModel[249].setRotationPoint(-49F, -30.5F, -4.75F);
		bodyModel[249].rotateAngleX = -1.55334303F;
		bodyModel[249].rotateAngleZ = -0.01745329F;

		bodyModel[250].addShapeBox(-0.5F, 0F, -0.5F, 1, 3, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 930
		bodyModel[250].setRotationPoint(-49F, -30.5F, -4.75F);
		bodyModel[250].rotateAngleX = -1.55334303F;
		bodyModel[250].rotateAngleZ = -0.01745329F;

		bodyModel[251].addShapeBox(0F, -1F, 0F, 1, 1, 2, 0F,0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Box 444
		bodyModel[251].setRotationPoint(-59.75F, -15.5F, 3F);
		bodyModel[251].rotateAngleZ = 0.41887903F;

		bodyModel[252].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Box 445
		bodyModel[252].setRotationPoint(-59.75F, -15.5F, 3F);
		bodyModel[252].rotateAngleZ = 0.41887903F;

		bodyModel[253].addShapeBox(-0.5F, 0F, -0.5F, 1, 4, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 325
		bodyModel[253].setRotationPoint(-49F, -28.5F, -4.8F);
		bodyModel[253].rotateAngleX = -1.55334303F;
		bodyModel[253].rotateAngleZ = -0.01745329F;

		bodyModel[254].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 326
		bodyModel[254].setRotationPoint(-49F, -28.5F, -4.8F);
		bodyModel[254].rotateAngleX = -1.55334303F;
		bodyModel[254].rotateAngleZ = -0.01745329F;

		bodyModel[255].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 675
		bodyModel[255].setRotationPoint(-58F, -32F, 0F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 676
		bodyModel[256].setRotationPoint(-58F, -31.5F, 0F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 677
		bodyModel[257].setRotationPoint(-58F, -31.5F, 0F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 400
		bodyModel[258].setRotationPoint(-58F, -32F, -2.5F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 401
		bodyModel[259].setRotationPoint(-58F, -31.5F, -2.5F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 402
		bodyModel[260].setRotationPoint(-58F, -31.5F, -2.5F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 403
		bodyModel[261].setRotationPoint(-58F, -28.5F, -4F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 404
		bodyModel[262].setRotationPoint(-58F, -28F, -4F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 405
		bodyModel[263].setRotationPoint(-58F, -28F, -4F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 406
		bodyModel[264].setRotationPoint(-58F, -28.5F, -5.75F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 407
		bodyModel[265].setRotationPoint(-58F, -28F, -5.75F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 408
		bodyModel[266].setRotationPoint(-58F, -28F, -5.75F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 409
		bodyModel[267].setRotationPoint(-58F, -26.75F, -5.75F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 410
		bodyModel[268].setRotationPoint(-58F, -26.25F, -5.75F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 411
		bodyModel[269].setRotationPoint(-58F, -26.25F, -5.75F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 412
		bodyModel[270].setRotationPoint(-58F, -26.75F, -4F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 413
		bodyModel[271].setRotationPoint(-58F, -26.25F, -4F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 414
		bodyModel[272].setRotationPoint(-58F, -26.25F, -4F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 415
		bodyModel[273].setRotationPoint(-58F, -30F, -1.75F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 416
		bodyModel[274].setRotationPoint(-58F, -29.5F, -1.75F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 417
		bodyModel[275].setRotationPoint(-58F, -28.5F, -1.75F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 339
		bodyModel[276].setRotationPoint(-58F, -28.5F, 3.5F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 340
		bodyModel[277].setRotationPoint(-58F, -28F, 3.5F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 341
		bodyModel[278].setRotationPoint(-58F, -26.75F, 3.5F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 342
		bodyModel[279].setRotationPoint(-58F, -26.25F, 3.5F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 343
		bodyModel[280].setRotationPoint(-58F, -26.75F, 1.75F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 344
		bodyModel[281].setRotationPoint(-58F, -26.25F, 3.5F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 345
		bodyModel[282].setRotationPoint(-58F, -28.5F, 1.75F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 346
		bodyModel[283].setRotationPoint(-58F, -28F, 1.75F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 347
		bodyModel[284].setRotationPoint(-58F, -28F, 1.75F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 348
		bodyModel[285].setRotationPoint(-58F, -26.25F, 1.75F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 349
		bodyModel[286].setRotationPoint(-58F, -26.25F, 1.75F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 350
		bodyModel[287].setRotationPoint(-58F, -28F, 3.5F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 30, 0, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 347
		bodyModel[288].setRotationPoint(-44F, -28.5F, 75F);
		bodyModel[288].rotateAngleX = 0.08726646F;

		bodyModel[289].addShapeBox(0F, 0F, 0F, 30, 0, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 348
		bodyModel[289].setRotationPoint(-44F, -37F, -127F);
		bodyModel[289].rotateAngleX = -0.03490659F;

		bodyModel[290].addShapeBox(0F, 0F, 0F, 30, 0, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 349
		bodyModel[290].setRotationPoint(-44F, -30.5F, -105F);
		bodyModel[290].rotateAngleX = -0.08726646F;

		bodyModel[291].addShapeBox(0F, 0F, 0F, 30, 0, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 352
		bodyModel[291].setRotationPoint(-44F, -36F, 97F);
		bodyModel[291].rotateAngleX = 0.03490659F;
	}

	private void inittailModel_1()
	{
		tailModel[0] = new ModelRendererTurbo(this, 1017, 41, textureX, textureY); // Import 
		tailModel[1] = new ModelRendererTurbo(this, 545, 49, textureX, textureY); // Import 
		tailModel[2] = new ModelRendererTurbo(this, 689, 9, textureX, textureY); // Import 
		tailModel[3] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Import 

		tailModel[0].addShapeBox(-5.85F, 0.75F, -0.5F, 1, 2, 1, 0F,-0.15F, 0.0F, -0.15F, 0.1F, 0.0F, -0.15F, 0.1F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, 0.5F, 0.0F, -0.15F, -0.6F, 0.2F, -0.15F, -0.6F, 0.2F, -0.15F, 0.5F, 0.0F, -0.15F); // Import 
		tailModel[0].setRotationPoint(-16F, -39F, 0F);

		tailModel[1].addShapeBox(-5.85F, 0.5F, -0.5F, 3, 1, 1, 0F,0.15F, 0.0F, -0.15F, 0.25F, 0.0F, -0.15F, 0.25F, 0.0F, -0.15F, 0.15F, 0.0F, -0.15F, -0.15F, -0.75F, -0.15F, 0.0F, -0.75F, -0.15F, 0.0F, -0.75F, -0.15F, -0.15F, -0.75F, -0.15F); // Import 
		tailModel[1].setRotationPoint(-16F, -39F, 0F);

		tailModel[2].addShapeBox(-5.35F, 1.5F, -0.5F, 2, 0, 1, 0F,-0.25F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, -0.25F, 0.0F, -0.15F, -0.25F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, -0.25F, 0.0F, -0.15F); // Import 
		tailModel[2].setRotationPoint(-16F, -39F, 0F);

		tailModel[3].addShapeBox(-3.35F, 0.5F, -0.5F, 0, 1, 1, 0F,-0.5F, -0.25F, -0.15F, 0.5F, -0.25F, -0.15F, 0.5F, -0.25F, -0.15F, -0.5F, -0.25F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F); // Import 
		tailModel[3].setRotationPoint(-16F, -39F, 0F);
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 777, 209, textureX, textureY); // Box 135
		leftWingModel[1] = new ModelRendererTurbo(this, 353, 217, textureX, textureY); // Box 136
		leftWingModel[2] = new ModelRendererTurbo(this, 769, 273, textureX, textureY); // Box 137
		leftWingModel[3] = new ModelRendererTurbo(this, 521, 105, textureX, textureY); // Box 138
		leftWingModel[4] = new ModelRendererTurbo(this, 673, 129, textureX, textureY); // Box 139
		leftWingModel[5] = new ModelRendererTurbo(this, 281, 153, textureX, textureY); // Box 140
		leftWingModel[6] = new ModelRendererTurbo(this, 905, 105, textureX, textureY); // Box 141
		leftWingModel[7] = new ModelRendererTurbo(this, 857, 273, textureX, textureY); // Box 142
		leftWingModel[8] = new ModelRendererTurbo(this, 841, 225, textureX, textureY); // Box 143
		leftWingModel[9] = new ModelRendererTurbo(this, 937, 273, textureX, textureY); // Box 144
		leftWingModel[10] = new ModelRendererTurbo(this, 313, 281, textureX, textureY); // Box 145
		leftWingModel[11] = new ModelRendererTurbo(this, 401, 289, textureX, textureY); // Box 146
		leftWingModel[12] = new ModelRendererTurbo(this, 465, 305, textureX, textureY); // Box 147
		leftWingModel[13] = new ModelRendererTurbo(this, 921, 177, textureX, textureY); // Box 148
		leftWingModel[14] = new ModelRendererTurbo(this, 553, 313, textureX, textureY); // Box 149
		leftWingModel[15] = new ModelRendererTurbo(this, 921, 313, textureX, textureY); // Box 150
		leftWingModel[16] = new ModelRendererTurbo(this, 193, 121, textureX, textureY); // Box 462
		leftWingModel[17] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 463
		leftWingModel[18] = new ModelRendererTurbo(this, 393, 65, textureX, textureY); // Box 464
		leftWingModel[19] = new ModelRendererTurbo(this, 1, 321, textureX, textureY); // Box 178
		leftWingModel[20] = new ModelRendererTurbo(this, 377, 321, textureX, textureY); // Box 179
		leftWingModel[21] = new ModelRendererTurbo(this, 801, 321, textureX, textureY); // Box 180
		leftWingModel[22] = new ModelRendererTurbo(this, 985, 105, textureX, textureY); // Box 181
		leftWingModel[23] = new ModelRendererTurbo(this, 273, 201, textureX, textureY); // Box 182
		leftWingModel[24] = new ModelRendererTurbo(this, 617, 313, textureX, textureY); // Box 183
		leftWingModel[25] = new ModelRendererTurbo(this, 473, 113, textureX, textureY); // Box 184
		leftWingModel[26] = new ModelRendererTurbo(this, 89, 329, textureX, textureY); // Box 185
		leftWingModel[27] = new ModelRendererTurbo(this, 169, 329, textureX, textureY); // Box 186
		leftWingModel[28] = new ModelRendererTurbo(this, 249, 329, textureX, textureY); // Box 187
		leftWingModel[29] = new ModelRendererTurbo(this, 305, 337, textureX, textureY); // Box 188
		leftWingModel[30] = new ModelRendererTurbo(this, 665, 337, textureX, textureY); // Box 189
		leftWingModel[31] = new ModelRendererTurbo(this, 441, 345, textureX, textureY); // Box 190
		leftWingModel[32] = new ModelRendererTurbo(this, 505, 345, textureX, textureY); // Box 191
		leftWingModel[33] = new ModelRendererTurbo(this, 729, 337, textureX, textureY); // Box 192
		leftWingModel[34] = new ModelRendererTurbo(this, 873, 345, textureX, textureY); // Box 193
		leftWingModel[35] = new ModelRendererTurbo(this, 521, 129, textureX, textureY); // Box 199
		leftWingModel[36] = new ModelRendererTurbo(this, 337, 121, textureX, textureY); // Box 350
		leftWingModel[37] = new ModelRendererTurbo(this, 609, 121, textureX, textureY); // Box 351

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 16, 14, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		leftWingModel[0].setRotationPoint(-70F, -27F, 32F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 16, 6, 26, 0F,0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		leftWingModel[1].setRotationPoint(-70F, -33F, 32F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 16, 6, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F); // Box 137
		leftWingModel[2].setRotationPoint(-70F, -13F, 32F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 7, 14, 8, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F); // Box 138
		leftWingModel[3].setRotationPoint(-77F, -27F, 50F);

		leftWingModel[4].addShapeBox(0F, 0F, 0F, 7, 6, 26, 0F,0F, -4F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, -4F, -8F, 0F, 2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -4F); // Box 139
		leftWingModel[4].setRotationPoint(-77F, -33F, 32F);

		leftWingModel[5].addShapeBox(0F, 0F, 0F, 7, 6, 26, 0F,0F, 2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -4F, 0F, -4F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, -4F, -8F); // Box 140
		leftWingModel[5].setRotationPoint(-77F, -13F, 32F);

		leftWingModel[6].addShapeBox(0F, 0F, 0F, 7, 14, 8, 0F,0F, -2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 141
		leftWingModel[6].setRotationPoint(-77F, -27F, 32F);

		leftWingModel[7].addShapeBox(0F, 0F, 0F, 11, 14, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		leftWingModel[7].setRotationPoint(-54F, -27F, 32F);

		leftWingModel[8].addShapeBox(0F, 0F, 0F, 11, 6, 26, 0F,0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		leftWingModel[8].setRotationPoint(-54F, -33F, 32F);

		leftWingModel[9].addShapeBox(0F, 0F, 0F, 11, 6, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F); // Box 144
		leftWingModel[9].setRotationPoint(-54F, -13F, 32F);

		leftWingModel[10].addShapeBox(0F, 0F, 0F, 16, 14, 26, 0F,0F, 0F, 0F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, 0F, 0F); // Box 145
		leftWingModel[10].setRotationPoint(-43F, -27F, 32F);

		leftWingModel[11].addShapeBox(0F, 0F, 0F, 16, 5, 26, 0F,0F, 0F, -6.5F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 2F, -4F, 0F, 2F, -4F, 0F, 0F, 0F); // Box 146
		leftWingModel[11].setRotationPoint(-43F, -32F, 32F);

		leftWingModel[12].addShapeBox(0F, 0F, 0F, 16, 6, 26, 0F,0F, 0F, 0F, 0F, 2F, -4F, 0F, 2F, -4F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -1.5F, -9F, 0F, -1.5F, -9F, 0F, 0F, -8F); // Box 147
		leftWingModel[12].setRotationPoint(-43F, -13F, 32F);

		leftWingModel[13].addShapeBox(0F, 0F, 0F, 31, 5, 18, 0F,0F, 0F, 3F, 1.25F, -1.25F, -4F, -1.25F, -1F, -4.25F, 0F, 0F, 4F, 0F, 0F, 0F, -0.75F, 0F, -5F, -1.25F, 0F, -5F, 0F, 0F, 0F); // Box 148
		leftWingModel[13].setRotationPoint(-27F, -30F, 36F);

		leftWingModel[14].addShapeBox(0F, 0F, 0F, 26, 6, 18, 0F,0F, 0F, 0F, 0F, 1F, -5F, 0F, 1F, -5F, 0F, 0F, 0F, 0F, 0.5F, -5F, -6F, -2F, -6F, -6F, -2F, -6F, 0F, 0.5F, -5F); // Box 149
		leftWingModel[14].setRotationPoint(-27F, -15F, 36F);

		leftWingModel[15].addShapeBox(0F, 0F, 0F, 26, 9, 18, 0F,0F, 0F, 0F, 4.25F, 0F, -5.25F, 3.75F, 0F, -5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 1F, 0F); // Box 150
		leftWingModel[15].setRotationPoint(-27F, -25F, 36F);

		leftWingModel[16].addShapeBox(0F, 0F, 0F, 16, 4, 4, 0F,0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 462
		leftWingModel[16].setRotationPoint(-85F, -22F, 43F);

		leftWingModel[17].addShapeBox(0F, 0F, 0F, 4, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 463
		leftWingModel[17].setRotationPoint(-83F, -23F, 42F);

		leftWingModel[18].addShapeBox(0F, 0F, 0F, 4, 6, 6, 0F,0F, -1.9F, -1.9F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1.9F, -1.9F, 0F, -1.9F, -1.9F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1.9F, -1.9F); // Box 464
		leftWingModel[18].setRotationPoint(-87.5F, -23F, 42F);

		leftWingModel[19].addShapeBox(0F, 0F, 0F, 16, 14, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		leftWingModel[19].setRotationPoint(-70F, -27F, -58F);

		leftWingModel[20].addShapeBox(0F, 0F, 0F, 16, 6, 26, 0F,0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		leftWingModel[20].setRotationPoint(-70F, -33F, -58F);

		leftWingModel[21].addShapeBox(0F, 0F, 0F, 16, 6, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F); // Box 180
		leftWingModel[21].setRotationPoint(-70F, -13F, -58F);

		leftWingModel[22].addShapeBox(0F, 0F, 0F, 7, 14, 8, 0F,0F, -2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 181
		leftWingModel[22].setRotationPoint(-77F, -27F, -58F);

		leftWingModel[23].addShapeBox(0F, 0F, 0F, 7, 6, 26, 0F,0F, -4F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, -4F, -8F, 0F, 2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -4F); // Box 182
		leftWingModel[23].setRotationPoint(-77F, -33F, -58F);

		leftWingModel[24].addShapeBox(0F, 0F, 0F, 7, 6, 26, 0F,0F, 2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -4F, 0F, -4F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, -4F, -8F); // Box 183
		leftWingModel[24].setRotationPoint(-77F, -13F, -58F);

		leftWingModel[25].addShapeBox(0F, 0F, 0F, 7, 14, 8, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F); // Box 184
		leftWingModel[25].setRotationPoint(-77F, -27F, -40F);

		leftWingModel[26].addShapeBox(0F, 0F, 0F, 11, 14, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		leftWingModel[26].setRotationPoint(-54F, -27F, -58F);

		leftWingModel[27].addShapeBox(0F, 0F, 0F, 11, 6, 26, 0F,0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		leftWingModel[27].setRotationPoint(-54F, -33F, -58F);

		leftWingModel[28].addShapeBox(0F, 0F, 0F, 11, 6, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F); // Box 187
		leftWingModel[28].setRotationPoint(-54F, -13F, -58F);

		leftWingModel[29].addShapeBox(0F, 0F, 0F, 16, 14, 26, 0F,0F, 0F, 0F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, 0F, 0F); // Box 188
		leftWingModel[29].setRotationPoint(-43F, -27F, -58F);

		leftWingModel[30].addShapeBox(0F, 0F, 0F, 16, 5, 26, 0F,0F, 0F, -8F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, 0F, -6.5F, 0F, 0F, 0F, 0F, 2F, -4F, 0F, 2F, -4F, 0F, 0F, 0F); // Box 189
		leftWingModel[30].setRotationPoint(-43F, -32F, -58F);

		leftWingModel[31].addShapeBox(0F, 0F, 0F, 16, 6, 26, 0F,0F, 0F, 0F, 0F, 2F, -4F, 0F, 2F, -4F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -1.5F, -9F, 0F, -1.5F, -9F, 0F, 0F, -8F); // Box 190
		leftWingModel[31].setRotationPoint(-43F, -13F, -58F);

		leftWingModel[32].addShapeBox(0F, 0F, 0F, 31, 5, 18, 0F,0F, 0F, 4F, -1.25F, -1F, -4.25F, 1.25F, -1.25F, -4F, 0F, 0F, 3F, 0F, 0F, 0F, -1.25F, 0F, -5F, -0.75F, 0F, -5F, 0F, 0F, 0F); // Box 191
		leftWingModel[32].setRotationPoint(-27F, -30F, -54F);

		leftWingModel[33].addShapeBox(0F, 0F, 0F, 26, 6, 18, 0F,0F, 0F, 0F, 0F, 1F, -5F, 0F, 1F, -5F, 0F, 0F, 0F, 0F, 0.5F, -5F, -6F, -2F, -6F, -6F, -2F, -6F, 0F, 0.5F, -5F); // Box 192
		leftWingModel[33].setRotationPoint(-27F, -15F, -54F);

		leftWingModel[34].addShapeBox(0F, 0F, 0F, 26, 9, 18, 0F,0F, 0F, 0F, 3.75F, 0F, -5F, 4.25F, 0F, -5.25F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 1F, 0F); // Box 193
		leftWingModel[34].setRotationPoint(-27F, -25F, -54F);

		leftWingModel[35].addShapeBox(0F, 0F, 0F, 16, 4, 4, 0F,0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 199
		leftWingModel[35].setRotationPoint(-85F, -22F, -47F);

		leftWingModel[36].addShapeBox(0F, 0F, 0F, 4, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 350
		leftWingModel[36].setRotationPoint(-83F, -23F, -48F);

		leftWingModel[37].addShapeBox(0F, 0F, 0F, 4, 6, 6, 0F,0F, -1.9F, -1.9F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1.9F, -1.9F, 0F, -1.9F, -1.9F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1.9F, -1.9F); // Box 351
		leftWingModel[37].setRotationPoint(-87.5F, -23F, -48F);
	}

	private void inittailWheelModel_1()
	{
		tailWheelModel[0] = new ModelRendererTurbo(this, 441, 121, textureX, textureY); // Box 256
		tailWheelModel[1] = new ModelRendererTurbo(this, 793, 105, textureX, textureY); // Box 257
		tailWheelModel[2] = new ModelRendererTurbo(this, 185, 113, textureX, textureY); // Box 258
		tailWheelModel[3] = new ModelRendererTurbo(this, 553, 113, textureX, textureY); // Box 259
		tailWheelModel[4] = new ModelRendererTurbo(this, 937, 113, textureX, textureY); // Box 260

		tailWheelModel[0].addShapeBox(0F, 0F, 0F, 10, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 256
		tailWheelModel[0].setRotationPoint(91F, -11.5F, -2F);

		tailWheelModel[1].addShapeBox(0F, 0F, 0F, 10, 3, 4, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 257
		tailWheelModel[1].setRotationPoint(91F, -14.5F, -2F);

		tailWheelModel[2].addShapeBox(0F, 0F, 0F, 10, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 258
		tailWheelModel[2].setRotationPoint(91F, -7.5F, -2F);

		tailWheelModel[3].addShapeBox(0F, 0F, 0F, 4, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 259
		tailWheelModel[3].setRotationPoint(88F, -18.5F, -3F);
		tailWheelModel[3].rotateAngleZ = 0.57595865F;

		tailWheelModel[4].addShapeBox(0F, 0F, 0F, 4, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
		tailWheelModel[4].setRotationPoint(88F, -18.5F, 2F);
		tailWheelModel[4].rotateAngleZ = 0.57595865F;
	}

	private void initleftWingWheelModel_1()
	{
		leftWingWheelModel[0] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 160
		leftWingWheelModel[1] = new ModelRendererTurbo(this, 97, 113, textureX, textureY); // Box 161
		leftWingWheelModel[2] = new ModelRendererTurbo(this, 825, 113, textureX, textureY); // Box 162
		leftWingWheelModel[3] = new ModelRendererTurbo(this, 649, 57, textureX, textureY); // Box 163
		leftWingWheelModel[4] = new ModelRendererTurbo(this, 665, 57, textureX, textureY); // Box 164
		leftWingWheelModel[5] = new ModelRendererTurbo(this, 241, 121, textureX, textureY); // Box 194
		leftWingWheelModel[6] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 195
		leftWingWheelModel[7] = new ModelRendererTurbo(this, 97, 129, textureX, textureY); // Box 196
		leftWingWheelModel[8] = new ModelRendererTurbo(this, 1009, 89, textureX, textureY); // Box 197
		leftWingWheelModel[9] = new ModelRendererTurbo(this, 865, 97, textureX, textureY); // Box 198

		leftWingWheelModel[0].addShapeBox(0F, 0F, 0F, 15, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 160
		leftWingWheelModel[0].setRotationPoint(-54F, 10F, 42F);

		leftWingWheelModel[1].addShapeBox(0F, 0F, 0F, 15, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		leftWingWheelModel[1].setRotationPoint(-54F, 5F, 42F);

		leftWingWheelModel[2].addShapeBox(0F, 0F, 0F, 15, 5, 6, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		leftWingWheelModel[2].setRotationPoint(-54F, 0F, 42F);

		leftWingWheelModel[3].addShapeBox(0F, 0F, 0F, 3, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		leftWingWheelModel[3].setRotationPoint(-48F, -11F, 48F);

		leftWingWheelModel[4].addShapeBox(0F, 0F, 0F, 3, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		leftWingWheelModel[4].setRotationPoint(-48F, -11F, 41F);

		leftWingWheelModel[5].addShapeBox(0F, 0F, 0F, 15, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 194
		leftWingWheelModel[5].setRotationPoint(-54F, 10F, -48F);

		leftWingWheelModel[6].addShapeBox(0F, 0F, 0F, 15, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		leftWingWheelModel[6].setRotationPoint(-54F, 5F, -48F);

		leftWingWheelModel[7].addShapeBox(0F, 0F, 0F, 15, 5, 6, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		leftWingWheelModel[7].setRotationPoint(-54F, 0F, -48F);

		leftWingWheelModel[8].addShapeBox(0F, 0F, 0F, 3, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		leftWingWheelModel[8].setRotationPoint(-48F, -11F, -49F);

		leftWingWheelModel[9].addShapeBox(0F, 0F, 0F, 3, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		leftWingWheelModel[9].setRotationPoint(-48F, -11F, -42F);
	}

	private void initPropeller()
	{
		propellerModels = new ModelRendererTurbo[2][3];
		propellerModels[0] = makeProp1(-80F, -20.5F, -45F);
		propellerModels[1] = makeProp2(-81F, -20.5F, 45F);
	}

	private ModelRendererTurbo[] makeProp1(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[3];
		prop[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		prop[0].addBox(-1F, -30F, -1.5F, 2, 30, 3, 0.0F);
		prop[1].addBox(-1F, -30F, -1.5F, 2, 30, 3, 0.0F);
		prop[2].addBox(-1F, -30F, -1.5F, 2, 30, 3, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		return prop;
	}

	private ModelRendererTurbo[] makeProp2(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[3];
		prop[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		prop[0].addBox(-1F, -30F, -1.5F, 2, 30, 3, 0.0F);
		prop[1].addBox(-1F, -30F, -1.5F, 2, 30, 3, 0.0F);
		prop[2].addBox(-1F, -30F, -1.5F, 2, 30, 3, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		return prop;
	}
}