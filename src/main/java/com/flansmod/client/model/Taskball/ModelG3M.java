//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: G3M
// Model Creator: 
// Created on: 02.06.2023 - 00:10:51
// Last changed on: 02.06.2023 - 00:10:51

package com.flansmod.client.model.Taskball; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelG3M extends ModelPlane //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelG3M() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[214];
		tailModel = new ModelRendererTurbo[38];
		leftWingModel = new ModelRendererTurbo[102];
		rightWingModel = new ModelRendererTurbo[10];
		tailWheelModel = new ModelRendererTurbo[9];
		hudModel = new ModelRendererTurbo[63];

		initbodyModel_1();
		inittailModel_1();
		initleftWingModel_1();
		initrightWingModel_1();
		inittailWheelModel_1();
		inithudModel_1();

		initPropeller();

		initGuns();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 697, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 681, 25, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 817, 25, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 945, 1, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 10
		bodyModel[11] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 11
		bodyModel[12] = new ModelRendererTurbo(this, 681, 1, textureX, textureY); // Box 12
		bodyModel[13] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 13
		bodyModel[14] = new ModelRendererTurbo(this, 929, 1, textureX, textureY); // Box 15
		bodyModel[15] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Box 16
		bodyModel[16] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 17
		bodyModel[17] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 18
		bodyModel[18] = new ModelRendererTurbo(this, 529, 33, textureX, textureY); // Box 19
		bodyModel[19] = new ModelRendererTurbo(this, 553, 33, textureX, textureY); // Box 20
		bodyModel[20] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 21
		bodyModel[21] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Box 22
		bodyModel[22] = new ModelRendererTurbo(this, 625, 33, textureX, textureY); // Box 23
		bodyModel[23] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 24
		bodyModel[24] = new ModelRendererTurbo(this, 633, 57, textureX, textureY); // Box 25
		bodyModel[25] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 26
		bodyModel[26] = new ModelRendererTurbo(this, 257, 89, textureX, textureY); // Box 27
		bodyModel[27] = new ModelRendererTurbo(this, 497, 89, textureX, textureY); // Box 28
		bodyModel[28] = new ModelRendererTurbo(this, 977, 57, textureX, textureY); // Box 34
		bodyModel[29] = new ModelRendererTurbo(this, 553, 65, textureX, textureY); // Box 35
		bodyModel[30] = new ModelRendererTurbo(this, 881, 73, textureX, textureY); // Box 36
		bodyModel[31] = new ModelRendererTurbo(this, 929, 73, textureX, textureY); // Box 37
		bodyModel[32] = new ModelRendererTurbo(this, 945, 1, textureX, textureY); // Box 38
		bodyModel[33] = new ModelRendererTurbo(this, 1001, 1, textureX, textureY); // Box 39
		bodyModel[34] = new ModelRendererTurbo(this, 657, 33, textureX, textureY); // Box 40
		bodyModel[35] = new ModelRendererTurbo(this, 745, 89, textureX, textureY); // Box 41
		bodyModel[36] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 42
		bodyModel[37] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 43
		bodyModel[38] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 44
		bodyModel[39] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 45
		bodyModel[40] = new ModelRendererTurbo(this, 681, 9, textureX, textureY); // Box 46
		bodyModel[41] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 47
		bodyModel[42] = new ModelRendererTurbo(this, 697, 9, textureX, textureY); // Box 48
		bodyModel[43] = new ModelRendererTurbo(this, 929, 25, textureX, textureY); // Box 49
		bodyModel[44] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 50
		bodyModel[45] = new ModelRendererTurbo(this, 929, 9, textureX, textureY); // Box 51
		bodyModel[46] = new ModelRendererTurbo(this, 609, 33, textureX, textureY); // Box 52
		bodyModel[47] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 53
		bodyModel[48] = new ModelRendererTurbo(this, 705, 1, textureX, textureY); // Box 54
		bodyModel[49] = new ModelRendererTurbo(this, 1017, 17, textureX, textureY); // Box 55
		bodyModel[50] = new ModelRendererTurbo(this, 929, 33, textureX, textureY); // Box 56
		bodyModel[51] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 57
		bodyModel[52] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 58
		bodyModel[53] = new ModelRendererTurbo(this, 937, 33, textureX, textureY); // Box 59
		bodyModel[54] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 60
		bodyModel[55] = new ModelRendererTurbo(this, 1009, 41, textureX, textureY); // Box 61
		bodyModel[56] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 62
		bodyModel[57] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 63
		bodyModel[58] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Box 64
		bodyModel[59] = new ModelRendererTurbo(this, 457, 41, textureX, textureY); // Box 65
		bodyModel[60] = new ModelRendererTurbo(this, 121, 73, textureX, textureY); // Box 66
		bodyModel[61] = new ModelRendererTurbo(this, 777, 89, textureX, textureY); // Box 67
		bodyModel[62] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 68
		bodyModel[63] = new ModelRendererTurbo(this, 681, 33, textureX, textureY); // Box 69
		bodyModel[64] = new ModelRendererTurbo(this, 985, 41, textureX, textureY); // Box 70
		bodyModel[65] = new ModelRendererTurbo(this, 601, 65, textureX, textureY); // Box 71
		bodyModel[66] = new ModelRendererTurbo(this, 937, 41, textureX, textureY); // Box 72
		bodyModel[67] = new ModelRendererTurbo(this, 609, 41, textureX, textureY); // Box 73
		bodyModel[68] = new ModelRendererTurbo(this, 617, 41, textureX, textureY); // Box 74
		bodyModel[69] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 75
		bodyModel[70] = new ModelRendererTurbo(this, 841, 49, textureX, textureY); // Box 76
		bodyModel[71] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 77
		bodyModel[72] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 78
		bodyModel[73] = new ModelRendererTurbo(this, 625, 33, textureX, textureY); // Box 79
		bodyModel[74] = new ModelRendererTurbo(this, 649, 33, textureX, textureY); // Box 80
		bodyModel[75] = new ModelRendererTurbo(this, 617, 65, textureX, textureY); // Box 81
		bodyModel[76] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 82
		bodyModel[77] = new ModelRendererTurbo(this, 497, 73, textureX, textureY); // Box 83
		bodyModel[78] = new ModelRendererTurbo(this, 1009, 33, textureX, textureY); // Box 84
		bodyModel[79] = new ModelRendererTurbo(this, 513, 41, textureX, textureY); // Box 85
		bodyModel[80] = new ModelRendererTurbo(this, 529, 73, textureX, textureY); // Box 86
		bodyModel[81] = new ModelRendererTurbo(this, 465, 81, textureX, textureY); // Box 87
		bodyModel[82] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 88
		bodyModel[83] = new ModelRendererTurbo(this, 793, 89, textureX, textureY); // Box 90
		bodyModel[84] = new ModelRendererTurbo(this, 457, 113, textureX, textureY); // Box 91
		bodyModel[85] = new ModelRendererTurbo(this, 465, 225, textureX, textureY); // Box 158
		bodyModel[86] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Box 159
		bodyModel[87] = new ModelRendererTurbo(this, 777, 249, textureX, textureY); // Box 160
		bodyModel[88] = new ModelRendererTurbo(this, 369, 265, textureX, textureY); // Box 161
		bodyModel[89] = new ModelRendererTurbo(this, 1, 265, textureX, textureY); // Box 162
		bodyModel[90] = new ModelRendererTurbo(this, 777, 273, textureX, textureY); // Box 163
		bodyModel[91] = new ModelRendererTurbo(this, 1, 329, textureX, textureY); // Box 164
		bodyModel[92] = new ModelRendererTurbo(this, 625, 233, textureX, textureY); // Box 165
		bodyModel[93] = new ModelRendererTurbo(this, 625, 257, textureX, textureY); // Box 166
		bodyModel[94] = new ModelRendererTurbo(this, 913, 257, textureX, textureY); // Box 167
		bodyModel[95] = new ModelRendererTurbo(this, 161, 257, textureX, textureY); // Box 168
		bodyModel[96] = new ModelRendererTurbo(this, 657, 49, textureX, textureY); // Box 169
		bodyModel[97] = new ModelRendererTurbo(this, 513, 81, textureX, textureY); // Box 170
		bodyModel[98] = new ModelRendererTurbo(this, 865, 49, textureX, textureY); // Box 171
		bodyModel[99] = new ModelRendererTurbo(this, 953, 121, textureX, textureY); // Box 172
		bodyModel[100] = new ModelRendererTurbo(this, 913, 281, textureX, textureY); // Box 173
		bodyModel[101] = new ModelRendererTurbo(this, 673, 33, textureX, textureY); // Box 174
		bodyModel[102] = new ModelRendererTurbo(this, 537, 81, textureX, textureY); // Box 175
		bodyModel[103] = new ModelRendererTurbo(this, 873, 233, textureX, textureY); // Box 176
		bodyModel[104] = new ModelRendererTurbo(this, 681, 273, textureX, textureY); // Box 177
		bodyModel[105] = new ModelRendererTurbo(this, 961, 289, textureX, textureY); // Box 178
		bodyModel[106] = new ModelRendererTurbo(this, 489, 145, textureX, textureY); // Box 179
		bodyModel[107] = new ModelRendererTurbo(this, 985, 217, textureX, textureY); // Box 180
		bodyModel[108] = new ModelRendererTurbo(this, 241, 425, textureX, textureY); // Box 181
		bodyModel[109] = new ModelRendererTurbo(this, 505, 425, textureX, textureY); // Box 182
		bodyModel[110] = new ModelRendererTurbo(this, 769, 425, textureX, textureY); // Box 183
		bodyModel[111] = new ModelRendererTurbo(this, 745, 449, textureX, textureY); // Box 184
		bodyModel[112] = new ModelRendererTurbo(this, 489, 457, textureX, textureY); // Box 185
		bodyModel[113] = new ModelRendererTurbo(this, 969, 249, textureX, textureY); // Box 191
		bodyModel[114] = new ModelRendererTurbo(this, 369, 241, textureX, textureY); // Box 192
		bodyModel[115] = new ModelRendererTurbo(this, 913, 289, textureX, textureY); // Box 193
		bodyModel[116] = new ModelRendererTurbo(this, 961, 313, textureX, textureY); // Box 194
		bodyModel[117] = new ModelRendererTurbo(this, 41, 161, textureX, textureY); // Box 195
		bodyModel[118] = new ModelRendererTurbo(this, 225, 161, textureX, textureY); // Box 196
		bodyModel[119] = new ModelRendererTurbo(this, 489, 161, textureX, textureY); // Box 197
		bodyModel[120] = new ModelRendererTurbo(this, 993, 321, textureX, textureY); // Box 198
		bodyModel[121] = new ModelRendererTurbo(this, 833, 49, textureX, textureY); // Box 199
		bodyModel[122] = new ModelRendererTurbo(this, 993, 49, textureX, textureY); // Box 200
		bodyModel[123] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 201
		bodyModel[124] = new ModelRendererTurbo(this, 617, 57, textureX, textureY); // Box 202
		bodyModel[125] = new ModelRendererTurbo(this, 585, 65, textureX, textureY); // Box 203
		bodyModel[126] = new ModelRendererTurbo(this, 969, 41, textureX, textureY); // Box 204
		bodyModel[127] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 205
		bodyModel[128] = new ModelRendererTurbo(this, 737, 89, textureX, textureY); // Box 206
		bodyModel[129] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 207
		bodyModel[130] = new ModelRendererTurbo(this, 489, 73, textureX, textureY); // Box 208
		bodyModel[131] = new ModelRendererTurbo(this, 569, 113, textureX, textureY); // Box 209
		bodyModel[132] = new ModelRendererTurbo(this, 673, 49, textureX, textureY); // Box 210
		bodyModel[133] = new ModelRendererTurbo(this, 497, 89, textureX, textureY); // Box 211
		bodyModel[134] = new ModelRendererTurbo(this, 505, 89, textureX, textureY); // Box 212
		bodyModel[135] = new ModelRendererTurbo(this, 1017, 89, textureX, textureY); // Box 213
		bodyModel[136] = new ModelRendererTurbo(this, 625, 73, textureX, textureY); // Box 214
		bodyModel[137] = new ModelRendererTurbo(this, 201, 129, textureX, textureY); // Box 215
		bodyModel[138] = new ModelRendererTurbo(this, 649, 113, textureX, textureY); // Box 216
		bodyModel[139] = new ModelRendererTurbo(this, 569, 169, textureX, textureY); // Box 217
		bodyModel[140] = new ModelRendererTurbo(this, 1009, 129, textureX, textureY); // Box 218
		bodyModel[141] = new ModelRendererTurbo(this, 777, 113, textureX, textureY); // Box 219
		bodyModel[142] = new ModelRendererTurbo(this, 33, 137, textureX, textureY); // Box 220
		bodyModel[143] = new ModelRendererTurbo(this, 833, 169, textureX, textureY); // Box 221
		bodyModel[144] = new ModelRendererTurbo(this, 921, 169, textureX, textureY); // Box 222
		bodyModel[145] = new ModelRendererTurbo(this, 601, 297, textureX, textureY); // Box 223
		bodyModel[146] = new ModelRendererTurbo(this, 241, 329, textureX, textureY); // Box 224
		bodyModel[147] = new ModelRendererTurbo(this, 73, 193, textureX, textureY); // Box 225
		bodyModel[148] = new ModelRendererTurbo(this, 705, 153, textureX, textureY); // Box 226
		bodyModel[149] = new ModelRendererTurbo(this, 881, 113, textureX, textureY); // Box 227
		bodyModel[150] = new ModelRendererTurbo(this, 777, 153, textureX, textureY); // Box 228
		bodyModel[151] = new ModelRendererTurbo(this, 705, 225, textureX, textureY); // Box 229
		bodyModel[152] = new ModelRendererTurbo(this, 929, 73, textureX, textureY); // Box 230
		bodyModel[153] = new ModelRendererTurbo(this, 769, 89, textureX, textureY); // Box 231
		bodyModel[154] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 232
		bodyModel[155] = new ModelRendererTurbo(this, 185, 169, textureX, textureY); // Box 233
		bodyModel[156] = new ModelRendererTurbo(this, 921, 177, textureX, textureY); // Box 234
		bodyModel[157] = new ModelRendererTurbo(this, 513, 193, textureX, textureY); // Box 235
		bodyModel[158] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 236
		bodyModel[159] = new ModelRendererTurbo(this, 1001, 41, textureX, textureY); // Box 237
		bodyModel[160] = new ModelRendererTurbo(this, 601, 193, textureX, textureY); // Box 238
		bodyModel[161] = new ModelRendererTurbo(this, 513, 201, textureX, textureY); // Box 239
		bodyModel[162] = new ModelRendererTurbo(this, 601, 201, textureX, textureY); // Box 240
		bodyModel[163] = new ModelRendererTurbo(this, 689, 113, textureX, textureY); // Box 241
		bodyModel[164] = new ModelRendererTurbo(this, 369, 121, textureX, textureY); // Box 242
		bodyModel[165] = new ModelRendererTurbo(this, 217, 217, textureX, textureY); // Box 243
		bodyModel[166] = new ModelRendererTurbo(this, 681, 257, textureX, textureY); // Box 244
		bodyModel[167] = new ModelRendererTurbo(this, 369, 481, textureX, textureY); // Box 245
		bodyModel[168] = new ModelRendererTurbo(this, 625, 329, textureX, textureY); // Box 246
		bodyModel[169] = new ModelRendererTurbo(this, 833, 329, textureX, textureY); // Box 247
		bodyModel[170] = new ModelRendererTurbo(this, 889, 521, textureX, textureY); // Box 329
		bodyModel[171] = new ModelRendererTurbo(this, 1, 537, textureX, textureY); // Box 330
		bodyModel[172] = new ModelRendererTurbo(this, 73, 545, textureX, textureY); // Box 331
		bodyModel[173] = new ModelRendererTurbo(this, 921, 409, textureX, textureY); // Box 239
		bodyModel[174] = new ModelRendererTurbo(this, 673, 137, textureX, textureY); // Box 240
		bodyModel[175] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 241
		bodyModel[176] = new ModelRendererTurbo(this, 945, 17, textureX, textureY); // Box 242
		bodyModel[177] = new ModelRendererTurbo(this, 969, 337, textureX, textureY); // Box 243
		bodyModel[178] = new ModelRendererTurbo(this, 1001, 401, textureX, textureY); // Box 244
		bodyModel[179] = new ModelRendererTurbo(this, 369, 161, textureX, textureY); // Box 245
		bodyModel[180] = new ModelRendererTurbo(this, 161, 465, textureX, textureY); // Box 246
		bodyModel[181] = new ModelRendererTurbo(this, 849, 129, textureX, textureY); // Box 247
		bodyModel[182] = new ModelRendererTurbo(this, 57, 137, textureX, textureY); // Box 248
		bodyModel[183] = new ModelRendererTurbo(this, 745, 161, textureX, textureY); // Box 250
		bodyModel[184] = new ModelRendererTurbo(this, 745, 185, textureX, textureY); // Box 251
		bodyModel[185] = new ModelRendererTurbo(this, 145, 249, textureX, textureY); // Box 252
		bodyModel[186] = new ModelRendererTurbo(this, 713, 305, textureX, textureY); // Box 253
		bodyModel[187] = new ModelRendererTurbo(this, 1009, 177, textureX, textureY); // Box 263
		bodyModel[188] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 264
		bodyModel[189] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 962
		bodyModel[190] = new ModelRendererTurbo(this, 641, 65, textureX, textureY); // Box 964
		bodyModel[191] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 966
		bodyModel[192] = new ModelRendererTurbo(this, 33, 129, textureX, textureY); // Box 782
		bodyModel[193] = new ModelRendererTurbo(this, 745, 137, textureX, textureY); // Box 783
		bodyModel[194] = new ModelRendererTurbo(this, 457, 81, textureX, textureY); // Box 786
		bodyModel[195] = new ModelRendererTurbo(this, 921, 97, textureX, textureY); // Box 789
		bodyModel[196] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 791
		bodyModel[197] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 792
		bodyModel[198] = new ModelRendererTurbo(this, 1017, 449, textureX, textureY); // Box 578
		bodyModel[199] = new ModelRendererTurbo(this, 737, 457, textureX, textureY); // Box 579
		bodyModel[200] = new ModelRendererTurbo(this, 889, 521, textureX, textureY); // Box 580
		bodyModel[201] = new ModelRendererTurbo(this, 81, 505, textureX, textureY); // Box 582
		bodyModel[202] = new ModelRendererTurbo(this, 393, 409, textureX, textureY); // Box 583
		bodyModel[203] = new ModelRendererTurbo(this, 417, 409, textureX, textureY); // Box 584
		bodyModel[204] = new ModelRendererTurbo(this, 969, 409, textureX, textureY); // Box 585
		bodyModel[205] = new ModelRendererTurbo(this, 473, 409, textureX, textureY); // Box 586
		bodyModel[206] = new ModelRendererTurbo(this, 497, 409, textureX, textureY); // Box 587
		bodyModel[207] = new ModelRendererTurbo(this, 593, 513, textureX, textureY); // Box 588
		bodyModel[208] = new ModelRendererTurbo(this, 737, 273, textureX, textureY); // Box 589
		bodyModel[209] = new ModelRendererTurbo(this, 745, 273, textureX, textureY); // Box 590
		bodyModel[210] = new ModelRendererTurbo(this, 369, 129, textureX, textureY); // Box 591
		bodyModel[211] = new ModelRendererTurbo(this, 209, 137, textureX, textureY); // Box 592
		bodyModel[212] = new ModelRendererTurbo(this, 633, 145, textureX, textureY); // Box 593
		bodyModel[213] = new ModelRendererTurbo(this, 777, 273, textureX, textureY); // Box 594

		bodyModel[0].addShapeBox(0F, 0F, 0F, 60, 15, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-91F, -45F, -19F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 60, 11, 19, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[1].setRotationPoint(-91F, -56F, -19F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 60, 4, 14, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[2].setRotationPoint(-91F, -60F, -14F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 107, 7, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[3].setRotationPoint(-97F, -30F, -19F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 107, 7, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[4].setRotationPoint(-97F, -23F, -15F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 58, 7, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[5].setRotationPoint(-155F, -23F, -15F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 58, 7, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[6].setRotationPoint(-155F, -30F, -19F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 54, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[7].setRotationPoint(-151F, -45F, -19F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 15, 15, 19, 0F,0F, -3F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -1F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 8
		bodyModel[8].setRotationPoint(-170F, -45F, -19F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 15, 4, 19, 0F,0F, -2F, -12F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 3F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 9
		bodyModel[9].setRotationPoint(-170F, -49F, -19F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 39, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[10].setRotationPoint(-136F, -56F, -14F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[11].setRotationPoint(-143F, -56F, -14F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 4F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 2F, 0F, 0F); // Box 12
		bodyModel[12].setRotationPoint(-143F, -56F, -9F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 13
		bodyModel[13].setRotationPoint(-138F, -56F, -14F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F,0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[14].setRotationPoint(-145F, -56F, -3F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 45, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[15].setRotationPoint(-136F, -60F, -2F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[16].setRotationPoint(-138F, -60F, -3F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[17].setRotationPoint(-138F, -60F, -9F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 11, 4, 10, 0F,0F, 0F, -10F, -11F, 0F, -10F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F); // Box 19
		bodyModel[18].setRotationPoint(-151F, -49F, -19F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 15, 7, 19, 0F,0F, 1F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, -9F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 20
		bodyModel[19].setRotationPoint(-170F, -30F, -19F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 15, 7, 15, 0F,0F, 2F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -4F, -10F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 21
		bodyModel[20].setRotationPoint(-170F, -23F, -15F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 4, 4, 10, 0F,0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[21].setRotationPoint(-155F, -49F, -19F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 4, 19, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[22].setRotationPoint(-155F, -49F, -9F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 109, 15, 19, 0F,0F, 0F, 0F, 0F, -2F, -8F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, -8F, 0F, -8F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[23].setRotationPoint(10F, -45F, -19F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 109, 7, 19, 0F,0F, 0F, 0F, 0F, 8F, -8F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -12F, -10F, 0F, -12F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[24].setRotationPoint(10F, -30F, -19F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 109, 7, 15, 0F,0F, 0F, 0F, 0F, 12F, -6F, 0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -15F, -11F, 0F, -15F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[25].setRotationPoint(10F, -23F, -15F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 109, 11, 19, 0F,0F, 0F, -5F, 0F, -5F, -12F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -8F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[26].setRotationPoint(10F, -56F, -19F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 109, 4, 14, 0F,0F, 0F, -5F, 0F, -6F, -11F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, -7F, 0F, 5F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[27].setRotationPoint(10F, -60F, -14F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 9, 11, 13, 0F,0F, -5F, -7F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[28].setRotationPoint(-179F, -42F, -13F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 9, 5, 11, 0F,0F, -6F, -8F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 5F, -5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 5F, 0F); // Box 35
		bodyModel[29].setRotationPoint(-179F, -47F, -11F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 9, 6, 13, 0F,0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -7F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -6F, 0F); // Box 36
		bodyModel[30].setRotationPoint(-179F, -31F, -13F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 9, 5, 11, 0F,0F, 5F, -5F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 5F, 0F, 0F, -6F, -8F, 0F, 1F, -6F, 0F, 1F, 0F, 0F, -6F, 0F); // Box 37
		bodyModel[31].setRotationPoint(-179F, -26F, -11F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 2, 6, 6, 0F,0F, -2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 38
		bodyModel[32].setRotationPoint(-181F, -37F, -6F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 2, 6, 6, 0F,0F, -5F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, -4F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[33].setRotationPoint(-181F, -41F, -6F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 2, 6, 6, 0F,0F, 0F, -4F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -5F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 40
		bodyModel[34].setRotationPoint(-181F, -33F, -6F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 4, 15, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[35].setRotationPoint(-155F, -45F, -19F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 42
		bodyModel[36].setRotationPoint(-131F, -56F, -14F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[37].setRotationPoint(-131F, -60F, -9F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[38].setRotationPoint(-131F, -60F, -3F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 45
		bodyModel[39].setRotationPoint(-125F, -56F, -14F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[40].setRotationPoint(-125F, -60F, -9F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[41].setRotationPoint(-125F, -60F, -3F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 48
		bodyModel[42].setRotationPoint(-119F, -56F, -14F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[43].setRotationPoint(-119F, -60F, -9F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[44].setRotationPoint(-119F, -60F, -3F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 51
		bodyModel[45].setRotationPoint(-108F, -56F, -14F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[46].setRotationPoint(-108F, -60F, -9F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[47].setRotationPoint(-108F, -60F, -3F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 54
		bodyModel[48].setRotationPoint(-119F, -56F, -14F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 55
		bodyModel[49].setRotationPoint(-127F, -56F, -14F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 5F, -1F, 0F, 5F, -1F, 0F, -5F, 1F, 0F, -5F); // Box 56
		bodyModel[50].setRotationPoint(-139F, -56F, -14F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F); // Box 57
		bodyModel[51].setRotationPoint(-152F, -56F, -9F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F); // Box 58
		bodyModel[52].setRotationPoint(-155F, -56F, -1F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 59
		bodyModel[53].setRotationPoint(-108F, -56F, -14F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 22, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[54].setRotationPoint(-119F, -50.5F, -16.5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 6, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[55].setRotationPoint(-97F, -45F, -19F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 6, 11, 1, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[56].setRotationPoint(-97F, -56F, -19F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 6, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -3F, 0F); // Box 63
		bodyModel[57].setRotationPoint(-97F, -56F, -14F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 6, 1, 7, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[58].setRotationPoint(-97F, -60F, -9F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 12, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -4F, 0F); // Box 65
		bodyModel[59].setRotationPoint(-31F, -56F, -14F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 37, 11, 1, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[60].setRotationPoint(-31F, -56F, -19F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 37, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[61].setRotationPoint(-31F, -45F, -19F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 4, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[62].setRotationPoint(6F, -60F, -9F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 69
		bodyModel[63].setRotationPoint(6F, -56F, -14F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 4, 11, 1, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[64].setRotationPoint(6F, -56F, -19F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 4, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[65].setRotationPoint(6F, -45F, -19F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 12, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, -4F); // Box 72
		bodyModel[66].setRotationPoint(-6F, -56F, -14F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[67].setRotationPoint(-19F, -64F, -14F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[68].setRotationPoint(-7F, -64F, -14F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[69].setRotationPoint(-19F, -64F, -11F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, -4F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 2F, 0F, 4F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 2F); // Box 76
		bodyModel[70].setRotationPoint(-31F, -64F, -11F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, -4F, -2F, 0F, -4F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -2F, 0F, 4F, 2F, 0F, 0F, 0F); // Box 77
		bodyModel[71].setRotationPoint(-6F, -64F, -11F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[72].setRotationPoint(-19F, -69F, -7F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[73].setRotationPoint(-19F, -69F, -11F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[74].setRotationPoint(-7F, -69F, -11F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F); // Box 81
		bodyModel[75].setRotationPoint(-31F, -69F, -7F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[76].setRotationPoint(-6F, -69F, -7F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[77].setRotationPoint(-19F, -71F, -1F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 84
		bodyModel[78].setRotationPoint(-19F, -69F, -7F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 85
		bodyModel[79].setRotationPoint(-7F, -69F, -7F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, 11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 11F, 0F); // Box 86
		bodyModel[80].setRotationPoint(-31F, -71F, -1F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 22, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[81].setRotationPoint(-119F, -59F, -9F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 58, 15, 62, 0F,0F, 0F, 0F, 0F, 0F, 0F, 6F, -4F, 0F, 5F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 6F, 4F, 0F, 5F, 4F, 0F); // Box 88
		bodyModel[82].setRotationPoint(-82F, -49F, -81F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 10, 15, 62, 0F,-1F, -3F, 0F, 0F, 0F, 0F, -5F, -4F, 0F, 5F, -8F, 0F, -1F, -7F, 0F, 0F, -4F, 0F, -5F, 4F, 0F, 5F, 0F, 0F); // Box 90
		bodyModel[83].setRotationPoint(-92F, -49F, -81F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 23, 15, 62, 0F,-1F, 0F, 0F, 0F, -6F, 0F, 12F, -12F, 0F, -7F, -4F, 0F, -1F, -4F, 0F, 0F, -8F, 0F, 12F, -2F, 0F, -7F, 4F, 0F); // Box 91
		bodyModel[84].setRotationPoint(-25F, -49F, -81F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 60, 15, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		bodyModel[85].setRotationPoint(-91F, -45F, 0F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 60, 11, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		bodyModel[86].setRotationPoint(-91F, -56F, 0F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 60, 4, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		bodyModel[87].setRotationPoint(-91F, -60F, 0F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 107, 7, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 161
		bodyModel[88].setRotationPoint(-97F, -30F, 0F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 107, 7, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F); // Box 162
		bodyModel[89].setRotationPoint(-97F, -23F, 0F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 58, 7, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F); // Box 163
		bodyModel[90].setRotationPoint(-155F, -23F, 0F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 58, 7, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 164
		bodyModel[91].setRotationPoint(-155F, -30F, 0F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 54, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		bodyModel[92].setRotationPoint(-151F, -45F, 18F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 15, 15, 19, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -7F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -6F); // Box 166
		bodyModel[93].setRotationPoint(-170F, -45F, 0F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 15, 4, 19, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, -2F, -12F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -7F); // Box 167
		bodyModel[94].setRotationPoint(-170F, -49F, 0F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 39, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[95].setRotationPoint(-136F, -56F, 13F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 169
		bodyModel[96].setRotationPoint(-143F, -56F, 9F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,2F, 0F, 0F, 0F, 4F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 170
		bodyModel[97].setRotationPoint(-143F, -56F, 3F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		bodyModel[98].setRotationPoint(-138F, -56F, 9F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F,0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 172
		bodyModel[99].setRotationPoint(-145F, -56F, 0F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 45, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		bodyModel[100].setRotationPoint(-136F, -60F, 0F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[101].setRotationPoint(-138F, -60F, 0F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 175
		bodyModel[102].setRotationPoint(-138F, -60F, 3F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 11, 4, 10, 0F,0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		bodyModel[103].setRotationPoint(-151F, -49F, 9F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 15, 7, 19, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -6F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -2F, -9F); // Box 177
		bodyModel[104].setRotationPoint(-170F, -30F, 0F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 15, 7, 15, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -5F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -4F, -10F); // Box 178
		bodyModel[105].setRotationPoint(-170F, -23F, 0F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 4, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		bodyModel[106].setRotationPoint(-155F, -49F, 9F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 4, 19, 8, 0F,0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[107].setRotationPoint(-155F, -49F, 1F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 109, 15, 19, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, -8F, 0F, 0F, 0F); // Box 181
		bodyModel[108].setRotationPoint(10F, -45F, 0F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 109, 7, 19, 0F,0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, -10F, 0F, 0F, -4F); // Box 182
		bodyModel[109].setRotationPoint(10F, -30F, 0F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 109, 7, 15, 0F,0F, 0F, 0F, 0F, 12F, 0F, 0F, 12F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, -11F, 0F, 0F, -8F); // Box 183
		bodyModel[110].setRotationPoint(10F, -23F, 0F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 109, 11, 19, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, -12F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -8F, 0F, 0F, 0F); // Box 184
		bodyModel[111].setRotationPoint(10F, -56F, 0F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 109, 4, 14, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, -11F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, -7F, 0F, 0F, 0F); // Box 185
		bodyModel[112].setRotationPoint(10F, -60F, 0F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 9, 11, 13, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -5F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F); // Box 191
		bodyModel[113].setRotationPoint(-179F, -42F, 0F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 9, 5, 11, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -6F, -8F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 5F, -5F); // Box 192
		bodyModel[114].setRotationPoint(-179F, -47F, 0F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 9, 6, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -6F, -7F); // Box 193
		bodyModel[115].setRotationPoint(-179F, -31F, 0F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 9, 5, 11, 0F,0F, 5F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 5F, -5F, 0F, -6F, 0F, 0F, 1F, 0F, 0F, 1F, -6F, 0F, -6F, -8F); // Box 194
		bodyModel[116].setRotationPoint(-179F, -26F, 0F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 2, 6, 6, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F); // Box 195
		bodyModel[117].setRotationPoint(-181F, -37F, 0F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 2, 6, 6, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -5F, -5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -4F); // Box 196
		bodyModel[118].setRotationPoint(-181F, -41F, 0F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 2, 6, 6, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -4F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -5F, -5F); // Box 197
		bodyModel[119].setRotationPoint(-181F, -33F, 0F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 4, 15, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		bodyModel[120].setRotationPoint(-155F, -45F, 9F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		bodyModel[121].setRotationPoint(-131F, -56F, 9F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 200
		bodyModel[122].setRotationPoint(-131F, -60F, 3F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
		bodyModel[123].setRotationPoint(-131F, -60F, 0F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[124].setRotationPoint(-125F, -56F, 9F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 203
		bodyModel[125].setRotationPoint(-125F, -60F, 3F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[126].setRotationPoint(-125F, -60F, 0F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		bodyModel[127].setRotationPoint(-119F, -56F, 9F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 206
		bodyModel[128].setRotationPoint(-119F, -60F, 3F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		bodyModel[129].setRotationPoint(-119F, -60F, 0F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 208
		bodyModel[130].setRotationPoint(-108F, -56F, 9F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 209
		bodyModel[131].setRotationPoint(-108F, -60F, 3F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		bodyModel[132].setRotationPoint(-108F, -60F, 0F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 5F); // Box 211
		bodyModel[133].setRotationPoint(-119F, -56F, 13F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 5F); // Box 212
		bodyModel[134].setRotationPoint(-127F, -56F, 13F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -5F, -1F, 0F, -5F, -1F, 0F, 5F, 1F, 0F, 5F); // Box 213
		bodyModel[135].setRotationPoint(-139F, -56F, 13F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F); // Box 214
		bodyModel[136].setRotationPoint(-152F, -56F, 8F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F); // Box 215
		bodyModel[137].setRotationPoint(-155F, -56F, 0F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 5F); // Box 216
		bodyModel[138].setRotationPoint(-108F, -56F, 13F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 22, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		bodyModel[139].setRotationPoint(-119F, -50.5F, 15.5F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 6, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 218
		bodyModel[140].setRotationPoint(-97F, -45F, 18F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 6, 11, 1, 0F,0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		bodyModel[141].setRotationPoint(-97F, -56F, 18F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 6, 1, 5, 0F,0F, 3F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		bodyModel[142].setRotationPoint(-97F, -56F, 9F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 6, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 221
		bodyModel[143].setRotationPoint(-97F, -60F, 2F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 12, 1, 5, 0F,0F, 4F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 222
		bodyModel[144].setRotationPoint(-31F, -56F, 9F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 37, 11, 1, 0F,0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[145].setRotationPoint(-31F, -56F, 18F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 37, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[146].setRotationPoint(-31F, -45F, 18F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 4, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		bodyModel[147].setRotationPoint(6F, -60F, 0F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
		bodyModel[148].setRotationPoint(6F, -56F, 9F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 4, 11, 1, 0F,0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 227
		bodyModel[149].setRotationPoint(6F, -56F, 18F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 4, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 228
		bodyModel[150].setRotationPoint(6F, -45F, 18F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 12, 1, 5, 0F,0F, 0F, -4F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 229
		bodyModel[151].setRotationPoint(-6F, -56F, 9F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 230
		bodyModel[152].setRotationPoint(-19F, -64F, 13F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 231
		bodyModel[153].setRotationPoint(-7F, -64F, 13F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		bodyModel[154].setRotationPoint(-19F, -64F, 10F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, -4F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -2F, 0F, 4F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -2F); // Box 233
		bodyModel[155].setRotationPoint(-31F, -64F, 10F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, -4F, 2F, 0F, -4F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 2F, 0F, 4F, -2F, 0F, 0F, 0F); // Box 234
		bodyModel[156].setRotationPoint(-6F, -64F, 10F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		bodyModel[157].setRotationPoint(-19F, -69F, 6F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 236
		bodyModel[158].setRotationPoint(-19F, -69F, 10F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 237
		bodyModel[159].setRotationPoint(-7F, -69F, 10F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F); // Box 238
		bodyModel[160].setRotationPoint(-31F, -69F, 6F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F); // Box 239
		bodyModel[161].setRotationPoint(-6F, -69F, 6F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		bodyModel[162].setRotationPoint(-19F, -71F, 0F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		bodyModel[163].setRotationPoint(-19F, -69F, 1F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		bodyModel[164].setRotationPoint(-7F, -69F, 1F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, 11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 11F, 0F); // Box 243
		bodyModel[165].setRotationPoint(-31F, -71F, 0F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 22, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		bodyModel[166].setRotationPoint(-119F, -59F, 8F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 58, 15, 62, 0F,5F, -4F, 0F, 6F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 4F, 0F, 6F, 4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 245
		bodyModel[167].setRotationPoint(-82F, -49F, 19F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 10, 15, 62, 0F,5F, -8F, 0F, -5F, -4F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, 5F, 0F, 0F, -5F, 4F, 0F, 0F, -4F, 0F, -1F, -7F, 0F); // Box 246
		bodyModel[168].setRotationPoint(-92F, -49F, 19F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 23, 15, 62, 0F,-7F, -4F, 0F, 12F, -12F, 0F, 0F, -6F, 0F, -1F, 0F, 0F, -7F, 4F, 0F, 12F, -2F, 0F, 0F, -8F, 0F, -1F, -4F, 0F); // Box 247
		bodyModel[169].setRotationPoint(-25F, -49F, 19F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 13, 15, 36, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 329
		bodyModel[170].setRotationPoint(-155F, -45F, -18F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 15, 3, 36, 0F,0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 330
		bodyModel[171].setRotationPoint(-155F, -48F, -18F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 15, 9, 36, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 331
		bodyModel[172].setRotationPoint(-155F, -45F, -18F);

		bodyModel[173].addShapeBox(0F, 1F, 0F, 10, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
		bodyModel[173].setRotationPoint(-130F, -37F, -14F);
		bodyModel[173].rotateAngleZ = -0.10471976F;

		bodyModel[174].addShapeBox(9F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		bodyModel[174].setRotationPoint(-130F, -37F, -14F);
		bodyModel[174].rotateAngleZ = -0.10471976F;

		bodyModel[175].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		bodyModel[175].setRotationPoint(-130F, -37F, -14F);
		bodyModel[175].rotateAngleZ = -0.10471976F;

		bodyModel[176].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		bodyModel[176].setRotationPoint(-130F, -37F, -5F);
		bodyModel[176].rotateAngleZ = -0.10471976F;

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		bodyModel[177].setRotationPoint(-130F, -37F, -14F);
		bodyModel[177].rotateAngleZ = -0.10471976F;

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 13, 10, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		bodyModel[178].setRotationPoint(-121F, -49F, -14F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[179].setRotationPoint(-119F, -53F, -12F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 13, 8, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 246
		bodyModel[180].setRotationPoint(-122F, -48F, -13F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[181].setRotationPoint(-122.3F, -48.3F, -11F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[182].setRotationPoint(-122.3F, -48.3F, -8F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[183].setRotationPoint(-121F, -46F, -13F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 251
		bodyModel[184].setRotationPoint(-121F, -46F, -6F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[185].setRotationPoint(-127F, -36F, -15F);
		bodyModel[185].rotateAngleZ = 0.78539816F;

		bodyModel[186].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 253
		bodyModel[186].setRotationPoint(-127F, -36F, -4F);
		bodyModel[186].rotateAngleZ = 0.78539816F;

		bodyModel[187].addShapeBox(-1F, -1F, 0F, 2, 11, 2, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 263
		bodyModel[187].setRotationPoint(-131.5F, -41.25F, -10F);
		bodyModel[187].rotateAngleZ = -1.13446401F;

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 264
		bodyModel[188].setRotationPoint(-131F, -45F, -9.5F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 962
		bodyModel[189].setRotationPoint(-119.5F, -52.5F, -10.5F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 964
		bodyModel[190].setRotationPoint(-119.5F, -51.5F, -10.5F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 966
		bodyModel[191].setRotationPoint(-119.5F, -50.5F, -10.5F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 782
		bodyModel[192].setRotationPoint(-126F, -35F, -13F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 783
		bodyModel[193].setRotationPoint(-126F, -35F, -6F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 786
		bodyModel[194].setRotationPoint(-131F, -44.75F, -8.5F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 789
		bodyModel[195].setRotationPoint(-131F, -44.75F, -12.5F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 791
		bodyModel[196].setRotationPoint(-131F, -47.75F, -12.5F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 792
		bodyModel[197].setRotationPoint(-131F, -47.75F, -6.5F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 2, 29, 1, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 578
		bodyModel[198].setRotationPoint(-13F, -58F, 3F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 2, 29, 1, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 579
		bodyModel[199].setRotationPoint(-13F, -58F, -4F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 15, 10, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 580
		bodyModel[200].setRotationPoint(-12F, -61F, -5F);

		bodyModel[201].addShapeBox(0F, 1F, 0F, 10, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 582
		bodyModel[201].setRotationPoint(-12F, -47F, -5F);
		bodyModel[201].rotateAngleZ = 0.08726646F;

		bodyModel[202].addShapeBox(-2F, 0.25F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 583
		bodyModel[202].setRotationPoint(-10F, -47F, -5F);
		bodyModel[202].rotateAngleZ = 0.08726646F;

		bodyModel[203].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 584
		bodyModel[203].setRotationPoint(-12F, -53F, -6F);
		bodyModel[203].rotateAngleZ = -0.78539816F;

		bodyModel[204].addShapeBox(0F, -0.3F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 585
		bodyModel[204].setRotationPoint(-3F, -47F, -5F);
		bodyModel[204].rotateAngleZ = 0.12217305F;

		bodyModel[205].addShapeBox(-2F, 0.25F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 586
		bodyModel[205].setRotationPoint(-10F, -47F, 4F);
		bodyModel[205].rotateAngleZ = 0.08726646F;

		bodyModel[206].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 587
		bodyModel[206].setRotationPoint(-12F, -53F, 5F);
		bodyModel[206].rotateAngleZ = -0.78539816F;

		bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 14, 8, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 588
		bodyModel[207].setRotationPoint(-11F, -60F, -4F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 589
		bodyModel[208].setRotationPoint(-10.7F, -60.3F, 1F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 590
		bodyModel[209].setRotationPoint(-10.7F, -60.3F, -2F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 591
		bodyModel[210].setRotationPoint(-13.5F, -62.5F, -1.5F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 592
		bodyModel[211].setRotationPoint(-13.5F, -63.5F, -1.5F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 593
		bodyModel[212].setRotationPoint(-13.5F, -64.5F, -1.5F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 594
		bodyModel[213].setRotationPoint(-14F, -65F, -3F);
	}

	private void inittailModel_1()
	{
		tailModel[0] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 29
		tailModel[1] = new ModelRendererTurbo(this, 873, 49, textureX, textureY); // Box 30
		tailModel[2] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 31
		tailModel[3] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 32
		tailModel[4] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 33
		tailModel[5] = new ModelRendererTurbo(this, 929, 97, textureX, textureY); // Box 98
		tailModel[6] = new ModelRendererTurbo(this, 961, 105, textureX, textureY); // Box 99
		tailModel[7] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 100
		tailModel[8] = new ModelRendererTurbo(this, 185, 113, textureX, textureY); // Box 101
		tailModel[9] = new ModelRendererTurbo(this, 241, 329, textureX, textureY); // Box 166
		tailModel[10] = new ModelRendererTurbo(this, 473, 329, textureX, textureY); // Box 167
		tailModel[11] = new ModelRendererTurbo(this, 705, 329, textureX, textureY); // Box 168
		tailModel[12] = new ModelRendererTurbo(this, 177, 217, textureX, textureY); // Box 169
		tailModel[13] = new ModelRendererTurbo(this, 945, 217, textureX, textureY); // Box 170
		tailModel[14] = new ModelRendererTurbo(this, 569, 153, textureX, textureY); // Box 171
		tailModel[15] = new ModelRendererTurbo(this, 441, 161, textureX, textureY); // Box 172
		tailModel[16] = new ModelRendererTurbo(this, 369, 225, textureX, textureY); // Box 173
		tailModel[17] = new ModelRendererTurbo(this, 609, 153, textureX, textureY); // Box 174
		tailModel[18] = new ModelRendererTurbo(this, 417, 225, textureX, textureY); // Box 157
		tailModel[19] = new ModelRendererTurbo(this, 1, 289, textureX, textureY); // Box 186
		tailModel[20] = new ModelRendererTurbo(this, 121, 289, textureX, textureY); // Box 187
		tailModel[21] = new ModelRendererTurbo(this, 369, 297, textureX, textureY); // Box 188
		tailModel[22] = new ModelRendererTurbo(this, 393, 329, textureX, textureY); // Box 189
		tailModel[23] = new ModelRendererTurbo(this, 481, 297, textureX, textureY); // Box 190
		tailModel[24] = new ModelRendererTurbo(this, 873, 297, textureX, textureY); // Box 254
		tailModel[25] = new ModelRendererTurbo(this, 1, 313, textureX, textureY); // Box 255
		tailModel[26] = new ModelRendererTurbo(this, 609, 265, textureX, textureY); // Box 256
		tailModel[27] = new ModelRendererTurbo(this, 137, 329, textureX, textureY); // Box 257
		tailModel[28] = new ModelRendererTurbo(this, 737, 521, textureX, textureY); // Box 304
		tailModel[29] = new ModelRendererTurbo(this, 217, 537, textureX, textureY); // Box 305
		tailModel[30] = new ModelRendererTurbo(this, 369, 561, textureX, textureY); // Box 306
		tailModel[31] = new ModelRendererTurbo(this, 553, 481, textureX, textureY); // Box 307
		tailModel[32] = new ModelRendererTurbo(this, 1, 481, textureX, textureY); // Box 308
		tailModel[33] = new ModelRendererTurbo(this, 625, 369, textureX, textureY); // Box 309
		tailModel[34] = new ModelRendererTurbo(this, 105, 401, textureX, textureY); // Box 310
		tailModel[35] = new ModelRendererTurbo(this, 145, 409, textureX, textureY); // Box 311
		tailModel[36] = new ModelRendererTurbo(this, 833, 369, textureX, textureY); // Box 312
		tailModel[37] = new ModelRendererTurbo(this, 737, 513, textureX, textureY); // Box 313

		tailModel[0].addShapeBox(0F, 0F, 0F, 47, 5, 11, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -4F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 29
		tailModel[0].setRotationPoint(119F, -43F, -11F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 47, 8, 11, 0F,0F, 0F, -4F, 0F, -4F, -5F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		tailModel[1].setRotationPoint(119F, -51F, -11F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 47, 3, 7, 0F,0F, 0F, -4F, 0F, -5F, -4F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -1F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 31
		tailModel[2].setRotationPoint(119F, -54F, -7F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 47, 3, 11, 0F,0F, 0F, 0F, 0F, 4F, -4F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -6F, -4F, 0F, -6F, 0F, 0F, 0F, 0F); // Box 32
		tailModel[3].setRotationPoint(119F, -38F, -11F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 47, 4, 9, 0F,0F, 0F, 0F, 0F, 6F, -2F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -8F, -6F, 0F, -8F, 0F, 0F, 0F, 0F); // Box 33
		tailModel[4].setRotationPoint(119F, -35F, -9F);

		tailModel[5].addShapeBox(0F, 0F, 0F, 11, 2, 7, 0F,0F, 0F, 0F, 0F, 2F, -5F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -5F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 98
		tailModel[5].setRotationPoint(166F, -43F, -7F);

		tailModel[6].addShapeBox(0F, 0F, 0F, 11, 3, 7, 0F,0F, 0F, -1F, 0F, -2F, -5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, -5F, 0F, -1F, 0F, 0F, 1F, 0F); // Box 99
		tailModel[6].setRotationPoint(166F, -47F, -7F);

		tailModel[7].addShapeBox(0F, 0F, 0F, 11, 2, 6, 0F,0F, 0F, -3F, 0F, -3F, -5F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -4F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 100
		tailModel[7].setRotationPoint(166F, -49F, -6F);

		tailModel[8].addShapeBox(0F, 0F, 0F, 11, 2, 6, 0F,0F, 0F, 1F, 0F, 3F, -4F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -4F, -5F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 101
		tailModel[8].setRotationPoint(166F, -41F, -6F);

		tailModel[9].addShapeBox(0F, 0F, 0F, 30, 7, 84, 0F,-25F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -25F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		tailModel[9].setRotationPoint(125F, -47F, -90F);

		tailModel[10].addShapeBox(0F, 0F, 0F, 31, 7, 84, 0F,-25F, -3F, -3F, 1F, -2F, 0F, -24F, 0F, 0F, 2F, -2F, 0F, -25F, -3F, -3F, 1F, -2F, 0F, -24F, 0F, 0F, 2F, -2F, 0F); // Box 167
		tailModel[10].setRotationPoint(118F, -47F, -90F);

		tailModel[11].addShapeBox(0F, 0F, 0F, 20, 7, 84, 0F,0F, -2F, 0F, -7F, -3F, -8F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -7F, -3F, -8F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 168
		tailModel[11].setRotationPoint(155F, -47F, -90F);

		tailModel[12].addShapeBox(0F, 0F, 0F, 18, 35, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		tailModel[12].setRotationPoint(137F, -81F, -47F);

		tailModel[13].addShapeBox(0F, 0F, 0F, 14, 31, 3, 0F,-9F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 170
		tailModel[13].setRotationPoint(123F, -81F, -47F);

		tailModel[14].addShapeBox(0F, 0F, 0F, 14, 7, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F); // Box 171
		tailModel[14].setRotationPoint(123F, -50F, -47F);

		tailModel[15].addShapeBox(0F, 0F, 0F, 18, 7, 3, 0F,-4F, 0F, -1F, -7F, 0F, -1F, -7F, 0F, -1F, -4F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
		tailModel[15].setRotationPoint(137F, -88F, -47F);

		tailModel[16].addShapeBox(0F, 0F, 0F, 18, 7, 3, 0F,-4F, -2F, -1F, -9F, 0F, -1F, -9F, 0F, -1F, -4F, -2F, -1F, 0F, 0F, -1F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, -1F); // Box 173
		tailModel[16].setRotationPoint(132F, -88F, -47F);

		tailModel[17].addShapeBox(0F, 0F, 0F, 16, 7, 3, 0F,0F, 0F, -1F, -7F, -2F, -1F, -7F, -2F, -1F, 0F, 0F, -1F, -7F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -7F, 0F, 0F); // Box 174
		tailModel[17].setRotationPoint(148F, -88F, -47F);

		tailModel[18].addShapeBox(0F, 0F, 0F, 18, 35, 3, 0F,0F, 0F, 0F, -9F, 0F, -1F, -9F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -1F, 0F, -6F, -1F, 0F, 0F, 0F); // Box 157
		tailModel[18].setRotationPoint(155F, -81F, -47F);

		tailModel[19].addShapeBox(0F, 0F, 0F, 47, 5, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, -4F, 0F, 0F, 0F); // Box 186
		tailModel[19].setRotationPoint(119F, -43F, 0F);

		tailModel[20].addShapeBox(0F, 0F, 0F, 47, 8, 11, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 187
		tailModel[20].setRotationPoint(119F, -51F, 0F);

		tailModel[21].addShapeBox(0F, 0F, 0F, 47, 3, 7, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, -1F, 0F, 0F, 0F); // Box 188
		tailModel[21].setRotationPoint(119F, -54F, 0F);

		tailModel[22].addShapeBox(0F, 0F, 0F, 47, 3, 11, 0F,0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, -4F, 0F, 0F, -2F); // Box 189
		tailModel[22].setRotationPoint(119F, -38F, 0F);

		tailModel[23].addShapeBox(0F, 0F, 0F, 47, 4, 9, 0F,0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, -6F, 0F, 0F, -5F); // Box 190
		tailModel[23].setRotationPoint(119F, -35F, 0F);

		tailModel[24].addShapeBox(0F, 0F, 0F, 11, 2, 7, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -5F, 0F, 0F, 0F); // Box 254
		tailModel[24].setRotationPoint(166F, -43F, 0F);

		tailModel[25].addShapeBox(0F, 0F, 0F, 11, 3, 7, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -5F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, -5F, 0F, 1F, 0F); // Box 255
		tailModel[25].setRotationPoint(166F, -47F, 0F);

		tailModel[26].addShapeBox(0F, 0F, 0F, 11, 2, 6, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -4F, 0F, 0F, 0F); // Box 256
		tailModel[26].setRotationPoint(166F, -49F, 0F);

		tailModel[27].addShapeBox(0F, 0F, 0F, 11, 2, 6, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, -4F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, -5F, 0F, 0F, -3F); // Box 257
		tailModel[27].setRotationPoint(166F, -41F, 0F);

		tailModel[28].addShapeBox(0F, 0F, 0F, 30, 7, 84, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -25F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -25F, -2F, 0F); // Box 304
		tailModel[28].setRotationPoint(125F, -47F, 6F);

		tailModel[29].addShapeBox(0F, 0F, 0F, 31, 7, 84, 0F,2F, -2F, 0F, -24F, 0F, 0F, 1F, -2F, 0F, -25F, -3F, -3F, 2F, -2F, 0F, -24F, 0F, 0F, 1F, -2F, 0F, -25F, -3F, -3F); // Box 305
		tailModel[29].setRotationPoint(118F, -47F, 6F);

		tailModel[30].addShapeBox(0F, 0F, 0F, 20, 7, 84, 0F,0F, 0F, 0F, 0F, -3F, 0F, -7F, -3F, -8F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -7F, -3F, -8F, 0F, -2F, 0F); // Box 306
		tailModel[30].setRotationPoint(155F, -47F, 6F);

		tailModel[31].addShapeBox(0F, 0F, 0F, 18, 35, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 307
		tailModel[31].setRotationPoint(137F, -81F, 44F);

		tailModel[32].addShapeBox(0F, 0F, 0F, 14, 31, 3, 0F,-9F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 308
		tailModel[32].setRotationPoint(123F, -81F, 44F);

		tailModel[33].addShapeBox(0F, 0F, 0F, 14, 7, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F); // Box 309
		tailModel[33].setRotationPoint(123F, -50F, 44F);

		tailModel[34].addShapeBox(0F, 0F, 0F, 18, 7, 3, 0F,-4F, 0F, -1F, -7F, 0F, -1F, -7F, 0F, -1F, -4F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 310
		tailModel[34].setRotationPoint(137F, -88F, 44F);

		tailModel[35].addShapeBox(0F, 0F, 0F, 18, 7, 3, 0F,-4F, -2F, -1F, -9F, 0F, -1F, -9F, 0F, -1F, -4F, -2F, -1F, 0F, 0F, -1F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, -1F); // Box 311
		tailModel[35].setRotationPoint(132F, -88F, 44F);

		tailModel[36].addShapeBox(0F, 0F, 0F, 16, 7, 3, 0F,0F, 0F, -1F, -7F, -2F, -1F, -7F, -2F, -1F, 0F, 0F, -1F, -7F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -7F, 0F, 0F); // Box 312
		tailModel[36].setRotationPoint(148F, -88F, 44F);

		tailModel[37].addShapeBox(0F, 0F, 0F, 18, 35, 3, 0F,0F, 0F, 0F, -9F, 0F, -1F, -9F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -1F, 0F, -6F, -1F, 0F, 0F, 0F); // Box 313
		tailModel[37].setRotationPoint(155F, -81F, 44F);
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 57, 121, textureX, textureY); // Box 92
		leftWingModel[1] = new ModelRendererTurbo(this, 561, 121, textureX, textureY); // Box 93
		leftWingModel[2] = new ModelRendererTurbo(this, 1, 329, textureX, textureY); // Box 94
		leftWingModel[3] = new ModelRendererTurbo(this, 969, 89, textureX, textureY); // Box 95
		leftWingModel[4] = new ModelRendererTurbo(this, 241, 89, textureX, textureY); // Box 96
		leftWingModel[5] = new ModelRendererTurbo(this, 881, 97, textureX, textureY); // Box 97
		leftWingModel[6] = new ModelRendererTurbo(this, 569, 113, textureX, textureY); // Box 297
		leftWingModel[7] = new ModelRendererTurbo(this, 641, 113, textureX, textureY); // Box 298
		leftWingModel[8] = new ModelRendererTurbo(this, 585, 73, textureX, textureY); // Box 299
		leftWingModel[9] = new ModelRendererTurbo(this, 1001, 105, textureX, textureY); // Box 300
		leftWingModel[10] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Box 301
		leftWingModel[11] = new ModelRendererTurbo(this, 881, 113, textureX, textureY); // Box 302
		leftWingModel[12] = new ModelRendererTurbo(this, 777, 113, textureX, textureY); // Box 303
		leftWingModel[13] = new ModelRendererTurbo(this, 689, 113, textureX, textureY); // Box 304
		leftWingModel[14] = new ModelRendererTurbo(this, 609, 73, textureX, textureY); // Box 305
		leftWingModel[15] = new ModelRendererTurbo(this, 41, 113, textureX, textureY); // Box 306
		leftWingModel[16] = new ModelRendererTurbo(this, 913, 73, textureX, textureY); // Box 307
		leftWingModel[17] = new ModelRendererTurbo(this, 369, 121, textureX, textureY); // Box 308
		leftWingModel[18] = new ModelRendererTurbo(this, 633, 153, textureX, textureY); // Box 309
		leftWingModel[19] = new ModelRendererTurbo(this, 953, 137, textureX, textureY); // Box 310
		leftWingModel[20] = new ModelRendererTurbo(this, 457, 121, textureX, textureY); // Box 311
		leftWingModel[21] = new ModelRendererTurbo(this, 225, 113, textureX, textureY); // Box 312
		leftWingModel[22] = new ModelRendererTurbo(this, 625, 113, textureX, textureY); // Box 313
		leftWingModel[23] = new ModelRendererTurbo(this, 961, 73, textureX, textureY); // Box 314
		leftWingModel[24] = new ModelRendererTurbo(this, 369, 161, textureX, textureY); // Box 315
		leftWingModel[25] = new ModelRendererTurbo(this, 777, 169, textureX, textureY); // Box 316
		leftWingModel[26] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 317
		leftWingModel[27] = new ModelRendererTurbo(this, 185, 129, textureX, textureY); // Box 318
		leftWingModel[28] = new ModelRendererTurbo(this, 673, 113, textureX, textureY); // Box 319
		leftWingModel[29] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 320
		leftWingModel[30] = new ModelRendererTurbo(this, 441, 121, textureX, textureY); // Box 321
		leftWingModel[31] = new ModelRendererTurbo(this, 969, 121, textureX, textureY); // Box 322
		leftWingModel[32] = new ModelRendererTurbo(this, 209, 137, textureX, textureY); // Box 323
		leftWingModel[33] = new ModelRendererTurbo(this, 721, 113, textureX, textureY); // Box 324
		leftWingModel[34] = new ModelRendererTurbo(this, 833, 113, textureX, textureY); // Box 325
		leftWingModel[35] = new ModelRendererTurbo(this, 489, 121, textureX, textureY); // Box 326
		leftWingModel[36] = new ModelRendererTurbo(this, 729, 145, textureX, textureY); // Box 327
		leftWingModel[37] = new ModelRendererTurbo(this, 185, 153, textureX, textureY); // Box 328
		leftWingModel[38] = new ModelRendererTurbo(this, 209, 153, textureX, textureY); // Box 329
		leftWingModel[39] = new ModelRendererTurbo(this, 849, 169, textureX, textureY); // Box 336
		leftWingModel[40] = new ModelRendererTurbo(this, 937, 177, textureX, textureY); // Box 337
		leftWingModel[41] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 338
		leftWingModel[42] = new ModelRendererTurbo(this, 89, 193, textureX, textureY); // Box 339
		leftWingModel[43] = new ModelRendererTurbo(this, 441, 193, textureX, textureY); // Box 340
		leftWingModel[44] = new ModelRendererTurbo(this, 529, 193, textureX, textureY); // Box 341
		leftWingModel[45] = new ModelRendererTurbo(this, 617, 193, textureX, textureY); // Box 342
		leftWingModel[46] = new ModelRendererTurbo(this, 777, 209, textureX, textureY); // Box 343
		leftWingModel[47] = new ModelRendererTurbo(this, 177, 193, textureX, textureY); // Box 344
		leftWingModel[48] = new ModelRendererTurbo(this, 369, 201, textureX, textureY); // Box 345
		leftWingModel[49] = new ModelRendererTurbo(this, 873, 209, textureX, textureY); // Box 346
		leftWingModel[50] = new ModelRendererTurbo(this, 721, 161, textureX, textureY); // Box 349
		leftWingModel[51] = new ModelRendererTurbo(this, 713, 193, textureX, textureY); // Box 350
		leftWingModel[52] = new ModelRendererTurbo(this, 713, 329, textureX, textureY); // Box 258
		leftWingModel[53] = new ModelRendererTurbo(this, 497, 329, textureX, textureY); // Box 259
		leftWingModel[54] = new ModelRendererTurbo(this, 921, 233, textureX, textureY); // Box 260
		leftWingModel[55] = new ModelRendererTurbo(this, 225, 225, textureX, textureY); // Box 261
		leftWingModel[56] = new ModelRendererTurbo(this, 737, 121, textureX, textureY); // Box 262
		leftWingModel[57] = new ModelRendererTurbo(this, 393, 345, textureX, textureY); // Box 263
		leftWingModel[58] = new ModelRendererTurbo(this, 241, 353, textureX, textureY); // Box 264
		leftWingModel[59] = new ModelRendererTurbo(this, 625, 329, textureX, textureY); // Box 265
		leftWingModel[60] = new ModelRendererTurbo(this, 1001, 241, textureX, textureY); // Box 266
		leftWingModel[61] = new ModelRendererTurbo(this, 729, 249, textureX, textureY); // Box 267
		leftWingModel[62] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 268
		leftWingModel[63] = new ModelRendererTurbo(this, 1, 361, textureX, textureY); // Box 269
		leftWingModel[64] = new ModelRendererTurbo(this, 89, 361, textureX, textureY); // Box 270
		leftWingModel[65] = new ModelRendererTurbo(this, 945, 353, textureX, textureY); // Box 271
		leftWingModel[66] = new ModelRendererTurbo(this, 833, 329, textureX, textureY); // Box 272
		leftWingModel[67] = new ModelRendererTurbo(this, 945, 329, textureX, textureY); // Box 273
		leftWingModel[68] = new ModelRendererTurbo(this, 529, 329, textureX, textureY); // Box 274
		leftWingModel[69] = new ModelRendererTurbo(this, 505, 129, textureX, textureY); // Box 275
		leftWingModel[70] = new ModelRendererTurbo(this, 465, 369, textureX, textureY); // Box 276
		leftWingModel[71] = new ModelRendererTurbo(this, 1, 401, textureX, textureY); // Box 277
		leftWingModel[72] = new ModelRendererTurbo(this, 73, 401, textureX, textureY); // Box 278
		leftWingModel[73] = new ModelRendererTurbo(this, 169, 337, textureX, textureY); // Box 279
		leftWingModel[74] = new ModelRendererTurbo(this, 657, 329, textureX, textureY); // Box 280
		leftWingModel[75] = new ModelRendererTurbo(this, 233, 137, textureX, textureY); // Box 281
		leftWingModel[76] = new ModelRendererTurbo(this, 945, 289, textureX, textureY); // Box 282
		leftWingModel[77] = new ModelRendererTurbo(this, 465, 345, textureX, textureY); // Box 283
		leftWingModel[78] = new ModelRendererTurbo(this, 73, 361, textureX, textureY); // Box 284
		leftWingModel[79] = new ModelRendererTurbo(this, 465, 225, textureX, textureY); // Box 285
		leftWingModel[80] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Box 286
		leftWingModel[81] = new ModelRendererTurbo(this, 913, 249, textureX, textureY); // Box 287
		leftWingModel[82] = new ModelRendererTurbo(this, 369, 265, textureX, textureY); // Box 288
		leftWingModel[83] = new ModelRendererTurbo(this, 681, 265, textureX, textureY); // Box 289
		leftWingModel[84] = new ModelRendererTurbo(this, 113, 289, textureX, textureY); // Box 290
		leftWingModel[85] = new ModelRendererTurbo(this, 105, 425, textureX, textureY); // Box 291
		leftWingModel[86] = new ModelRendererTurbo(this, 1, 441, textureX, textureY); // Box 292
		leftWingModel[87] = new ModelRendererTurbo(this, 73, 465, textureX, textureY); // Box 293
		leftWingModel[88] = new ModelRendererTurbo(this, 241, 465, textureX, textureY); // Box 294
		leftWingModel[89] = new ModelRendererTurbo(this, 329, 465, textureX, textureY); // Box 295
		leftWingModel[90] = new ModelRendererTurbo(this, 737, 481, textureX, textureY); // Box 296
		leftWingModel[91] = new ModelRendererTurbo(this, 825, 481, textureX, textureY); // Box 297
		leftWingModel[92] = new ModelRendererTurbo(this, 921, 481, textureX, textureY); // Box 298
		leftWingModel[93] = new ModelRendererTurbo(this, 713, 369, textureX, textureY); // Box 299
		leftWingModel[94] = new ModelRendererTurbo(this, 393, 385, textureX, textureY); // Box 300
		leftWingModel[95] = new ModelRendererTurbo(this, 241, 393, textureX, textureY); // Box 301
		leftWingModel[96] = new ModelRendererTurbo(this, 665, 361, textureX, textureY); // Box 302
		leftWingModel[97] = new ModelRendererTurbo(this, 873, 361, textureX, textureY); // Box 303
		leftWingModel[98] = new ModelRendererTurbo(this, 737, 193, textureX, textureY); // Box 802
		leftWingModel[99] = new ModelRendererTurbo(this, 1017, 217, textureX, textureY); // Box 803
		leftWingModel[100] = new ModelRendererTurbo(this, 1017, 257, textureX, textureY); // Box 804
		leftWingModel[101] = new ModelRendererTurbo(this, 881, 329, textureX, textureY); // Box 805

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 58, 15, 190, 0F,-15F, 0F, 0F, -27F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, -15F, -11F, 0F, -27F, -11F, 0F, 0F, 6F, 0F, 0F, 6F, 0F); // Box 92
		leftWingModel[0].setRotationPoint(-82F, -59F, -271F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 9, 15, 190, 0F,-18F, -1F, 0F, 15F, 0F, 0F, 0F, -10F, 0F, 0F, -13F, 0F, -18F, -12F, 0F, 15F, -11F, 0F, 0F, 6F, 0F, 0F, 3F, 0F); // Box 93
		leftWingModel[1].setRotationPoint(-91F, -59F, -271F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 22, 15, 190, 0F,27F, 0F, 0F, -40F, -1F, 0F, 0F, -16F, 0F, 0F, -10F, 0F, 27F, -11F, 0F, -40F, -13F, 0F, 0F, 2F, 0F, 0F, 6F, 0F); // Box 94
		leftWingModel[2].setRotationPoint(-24F, -59F, -271F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 16, 4, 7, 0F,0F, -1F, 0F, -8F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -8F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		leftWingModel[3].setRotationPoint(-67F, -59F, -278F);

		leftWingModel[4].addShapeBox(0F, 0F, 0F, 6, 4, 7, 0F,-3F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 96
		leftWingModel[4].setRotationPoint(-73F, -59F, -278F);

		leftWingModel[5].addShapeBox(0F, 0F, 0F, 16, 4, 7, 0F,0F, -1F, 0F, -8F, -1F, -1F, 1F, -1F, 0F, -8F, 0F, 0F, 0F, -2F, 0F, -8F, -2F, -1F, 1F, -1F, 0F, -8F, 0F, 0F); // Box 97
		leftWingModel[5].setRotationPoint(-59F, -59F, -278F);

		leftWingModel[6].addShapeBox(0F, 0F, 0F, 17, 18, 16, 0F,0F, -5F, -4F, 0F, -4F, -4F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 297
		leftWingModel[6].setRotationPoint(-104F, -53F, -72.5F);

		leftWingModel[7].addShapeBox(0F, 0F, 0F, 4, 17, 16, 0F,0F, -5F, -7F, 0F, -4F, -4F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
		leftWingModel[7].setRotationPoint(-108F, -52F, -72.5F);

		leftWingModel[8].addShapeBox(0F, 0F, 0F, 2, 5, 9, 0F,0F, -4.9999F, 0F, 0F, -1.9999F, 0F, 0F, 0F, 0F, 0F, -2.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		leftWingModel[8].setRotationPoint(-110F, -49F, -65.5F);

		leftWingModel[9].addShapeBox(0F, 0F, 0F, 2, 12, 7, 0F,0F, -2.9999F, -5.9999F, 0F, 0F, -5.9999F, 0F, 0F, -0.9999F, 0F, -2.9999F, -0.9999F, 0F, 0F, -2.9999F, 0F, 0F, -0.9999F, 0F, 0F, -0.9999F, 0F, 0F, -0.9999F); // Box 300
		leftWingModel[9].setRotationPoint(-110F, -47F, -71.5F);

		leftWingModel[10].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.9999F, 0F, 0F, -3.9999F, 0F); // Box 301
		leftWingModel[10].setRotationPoint(-110F, -44F, -65.5F);

		leftWingModel[11].addShapeBox(0F, 0F, 0F, 26, 18, 16, 0F,0F, -4F, -4F, 0F, -5F, -3F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 302
		leftWingModel[11].setRotationPoint(-87F, -53F, -72.5F);

		leftWingModel[12].addShapeBox(0F, 0F, 0F, 17, 18, 16, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -4F, -4F, 0F, -5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 303
		leftWingModel[12].setRotationPoint(-104F, -53F, -56.5F);

		leftWingModel[13].addShapeBox(0F, 0F, 0F, 4, 17, 16, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, -4F, -4F, 0F, -5F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 304
		leftWingModel[13].setRotationPoint(-108F, -52F, -56.5F);

		leftWingModel[14].addShapeBox(0F, 0F, 0F, 2, 5, 9, 0F,0F, -2.9999F, 0F, 0F, 0F, 0F, 0F, -1.9999F, 0F, 0F, -4.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305
		leftWingModel[14].setRotationPoint(-110F, -49F, -56.5F);

		leftWingModel[15].addShapeBox(0F, 0F, 0F, 2, 12, 7, 0F,0F, -2.9999F, -0.9999F, 0F, 0F, -0.9999F, 0F, 0F, -5.9999F, 0F, -2.9999F, -5.9999F, 0F, 0F, -0.9999F, 0F, 0F, -0.9999F, 0F, 0F, -0.9999F, 0F, 0F, -2.9999F); // Box 306
		leftWingModel[15].setRotationPoint(-110F, -47F, -48.5F);

		leftWingModel[16].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.9999F, 0F, 0F, -3.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 307
		leftWingModel[16].setRotationPoint(-110F, -44F, -51.5F);

		leftWingModel[17].addShapeBox(0F, 0F, 0F, 26, 18, 16, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, -5F, -3F, 0F, -4F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 308
		leftWingModel[17].setRotationPoint(-87F, -53F, -56.5F);

		leftWingModel[18].addShapeBox(0F, 0F, 0F, 26, 18, 16, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -4F, 0F, -5F, -5F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 309
		leftWingModel[18].setRotationPoint(-87F, -35F, -72.5F);

		leftWingModel[19].addShapeBox(0F, 0F, 0F, 17, 18, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -4F, 0F, -4F, -4F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 310
		leftWingModel[19].setRotationPoint(-104F, -35F, -72.5F);

		leftWingModel[20].addShapeBox(0F, 0F, 0F, 4, 17, 16, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -7F, 0F, -4F, -4F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 311
		leftWingModel[20].setRotationPoint(-108F, -35F, -72.5F);

		leftWingModel[21].addShapeBox(0F, 0F, 0F, 2, 12, 7, 0F,0F, 0F, -2.9999F, 0F, 0F, -0.9999F, 0F, 0F, -0.9999F, 0F, 0F, -0.9999F, 0F, -2.9999F, -5.9999F, 0F, 0F, -5.9999F, 0F, 0F, -0.9999F, 0F, -2.9999F, -0.9999F); // Box 312
		leftWingModel[21].setRotationPoint(-110F, -35F, -71.5F);

		leftWingModel[22].addShapeBox(0F, 0F, 0F, 2, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.9999F, 0F, 0F, -1.9999F, 0F, 0F, 0F, 0F, 0F, -2.9999F, 0F); // Box 313
		leftWingModel[22].setRotationPoint(-110F, -26F, -65.5F);

		leftWingModel[23].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.9999F, 0F, 0F, -3.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 314
		leftWingModel[23].setRotationPoint(-110F, -30F, -65.5F);

		leftWingModel[24].addShapeBox(0F, 0F, 0F, 26, 18, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -5F, -5F, 0F, -4F, -4F); // Box 315
		leftWingModel[24].setRotationPoint(-87F, -35F, -56.5F);

		leftWingModel[25].addShapeBox(0F, 0F, 0F, 17, 18, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -4F, -4F, 0F, -5F, -4F); // Box 316
		leftWingModel[25].setRotationPoint(-104F, -35F, -56.5F);

		leftWingModel[26].addShapeBox(0F, 0F, 0F, 4, 17, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -4F, -4F, 0F, -5F, -7F); // Box 317
		leftWingModel[26].setRotationPoint(-108F, -35F, -56.5F);

		leftWingModel[27].addShapeBox(0F, 0F, 0F, 2, 12, 7, 0F,0F, 0F, -0.9999F, 0F, 0F, -0.9999F, 0F, 0F, -0.9999F, 0F, 0F, -2.9999F, 0F, -2.9999F, -0.9999F, 0F, 0F, -0.9999F, 0F, 0F, -5.9999F, 0F, -2.9999F, -5.9999F); // Box 318
		leftWingModel[27].setRotationPoint(-110F, -35F, -48.5F);

		leftWingModel[28].addShapeBox(0F, 0F, 0F, 2, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.9999F, 0F, 0F, 0F, 0F, 0F, -1.9999F, 0F, 0F, -4.9999F, 0F); // Box 319
		leftWingModel[28].setRotationPoint(-110F, -26F, -56.5F);

		leftWingModel[29].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, -3.9999F, 0F, 0F, -3.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 320
		leftWingModel[29].setRotationPoint(-110F, -30F, -51.5F);

		leftWingModel[30].addShapeBox(0F, 0F, 0F, 6, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 321
		leftWingModel[30].setRotationPoint(-114F, -37.5F, -61F);

		leftWingModel[31].addShapeBox(0F, 0F, 0F, 6, 3, 9, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 322
		leftWingModel[31].setRotationPoint(-114F, -40.5F, -61F);

		leftWingModel[32].addShapeBox(0F, 0F, 0F, 6, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 323
		leftWingModel[32].setRotationPoint(-114F, -34.5F, -61F);

		leftWingModel[33].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324
		leftWingModel[33].setRotationPoint(-117F, -37F, -59.5F);

		leftWingModel[34].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 325
		leftWingModel[34].setRotationPoint(-117F, -39F, -59.5F);

		leftWingModel[35].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 326
		leftWingModel[35].setRotationPoint(-117F, -35F, -59.5F);

		leftWingModel[36].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 327
		leftWingModel[36].setRotationPoint(-120F, -37F, -59.5F);

		leftWingModel[37].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, -1.9999F, -1.9999F, 0F, 0F, -1.9999F, 0F, 0F, -1.9999F, 0F, -1.9999F, -1.9999F, 0F, 0F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9999F); // Box 328
		leftWingModel[37].setRotationPoint(-120F, -39F, -59.5F);

		leftWingModel[38].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, 0F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9999F, 0F, -1.9999F, -1.9999F, 0F, 0F, -1.9999F, 0F, 0F, -1.9999F, 0F, -1.9999F, -1.9999F); // Box 329
		leftWingModel[38].setRotationPoint(-120F, -35F, -59.5F);

		leftWingModel[39].addShapeBox(0F, 0F, 0F, 26, 18, 16, 0F,0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -5F, 0F, -4F, -7F, 0F, 1F, 0F, 0F, 2F, 0F); // Box 336
		leftWingModel[39].setRotationPoint(-61F, -35F, -72.5F);

		leftWingModel[40].addShapeBox(0F, 0F, 0F, 26, 18, 16, 0F,0F, -5F, -3F, 0F, -10F, -6F, 0F, -5F, 0F, 0F, 1F, 0F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 337
		leftWingModel[40].setRotationPoint(-61F, -53F, -72.5F);

		leftWingModel[41].addShapeBox(0F, 0F, 0F, 26, 18, 16, 0F,0F, 1F, 0F, 0F, -5F, 0F, 0F, -10F, -6F, 0F, -5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 1F); // Box 338
		leftWingModel[41].setRotationPoint(-61F, -53F, -56.5F);

		leftWingModel[42].addShapeBox(0F, 0F, 0F, 26, 18, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 1F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, -4F, -7F, 0F, -5F, -5F); // Box 339
		leftWingModel[42].setRotationPoint(-61F, -35F, -56.5F);

		leftWingModel[43].addShapeBox(0F, 0F, 0F, 26, 13, 16, 0F,0F, -5F, -6F, -12F, -8F, -10F, -4F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -4F, 3F, -7F, 4F, 3F, 0F, 0F, 0F, 0F); // Box 340
		leftWingModel[43].setRotationPoint(-35F, -48F, -72.5F);

		leftWingModel[44].addShapeBox(0F, 0F, 0F, 26, 13, 16, 0F,0F, 0F, 0F, -4F, -9F, 0F, -12F, -8F, -10F, 0F, -5F, -6F, 0F, 0F, 0F, 4F, 3F, 0F, -4F, 3F, -7F, 0F, 0F, -3F); // Box 341
		leftWingModel[44].setRotationPoint(-35F, -48F, -56.5F);

		leftWingModel[45].addShapeBox(0F, 0F, 0F, 30, 18, 16, 0F,0F, 0F, -3F, -8F, -3F, -7F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -4F, -7F, -13F, -6F, -10F, -7F, -4F, 0F, 0F, 1F, 0F); // Box 342
		leftWingModel[45].setRotationPoint(-35F, -35F, -72.5F);

		leftWingModel[46].addShapeBox(0F, 0F, 0F, 30, 18, 16, 0F,0F, 0F, 0F, 0F, -3F, 0F, -8F, -3F, -7F, 0F, 0F, -3F, 0F, 1F, 0F, -7F, -4F, 0F, -13F, -6F, -10F, 0F, -4F, -7F); // Box 343
		leftWingModel[46].setRotationPoint(-35F, -35F, -56.5F);

		leftWingModel[47].addShapeBox(0F, 0F, 0F, 24, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 344
		leftWingModel[47].setRotationPoint(-87F, -6F, -60.5F);

		leftWingModel[48].addShapeBox(0F, 0F, 0F, 24, 8, 8, 0F,-8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 345
		leftWingModel[48].setRotationPoint(-87F, -14F, -60.5F);

		leftWingModel[49].addShapeBox(0F, 0F, 0F, 24, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F); // Box 346
		leftWingModel[49].setRotationPoint(-87F, 2F, -60.5F);

		leftWingModel[50].addShapeBox(0F, 0F, 0F, 6, 24, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 349
		leftWingModel[50].setRotationPoint(-78F, -19F, -62.5F);

		leftWingModel[51].addShapeBox(0F, 0F, 0F, 6, 25, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 350
		leftWingModel[51].setRotationPoint(-78F, -20F, -52.5F);

		leftWingModel[52].addShapeBox(0F, 0F, 0F, 17, 18, 16, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -4F, -4F, 0F, -5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 258
		leftWingModel[52].setRotationPoint(-104F, -53F, 56.5F);

		leftWingModel[53].addShapeBox(0F, 0F, 0F, 4, 17, 16, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, -4F, -4F, 0F, -5F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 259
		leftWingModel[53].setRotationPoint(-108F, -52F, 56.5F);

		leftWingModel[54].addShapeBox(0F, 0F, 0F, 2, 5, 9, 0F,0F, -2.9999F, 0F, 0F, 0F, 0F, 0F, -1.9999F, 0F, 0F, -4.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
		leftWingModel[54].setRotationPoint(-110F, -49F, 56.5F);

		leftWingModel[55].addShapeBox(0F, 0F, 0F, 2, 12, 7, 0F,0F, -2.9999F, -0.9999F, 0F, 0F, -0.9999F, 0F, 0F, -5.9999F, 0F, -2.9999F, -5.9999F, 0F, 0F, -0.9999F, 0F, 0F, -0.9999F, 0F, 0F, -0.9999F, 0F, 0F, -2.9999F); // Box 261
		leftWingModel[55].setRotationPoint(-110F, -47F, 64.5F);

		leftWingModel[56].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.9999F, 0F, 0F, -3.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 262
		leftWingModel[56].setRotationPoint(-110F, -44F, 61.5F);

		leftWingModel[57].addShapeBox(0F, 0F, 0F, 26, 18, 16, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, -5F, -3F, 0F, -4F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 263
		leftWingModel[57].setRotationPoint(-87F, -53F, 56.5F);

		leftWingModel[58].addShapeBox(0F, 0F, 0F, 17, 18, 16, 0F,0F, -5F, -4F, 0F, -4F, -4F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 264
		leftWingModel[58].setRotationPoint(-104F, -53F, 40.5F);

		leftWingModel[59].addShapeBox(0F, 0F, 0F, 4, 17, 16, 0F,0F, -5F, -7F, 0F, -4F, -4F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 265
		leftWingModel[59].setRotationPoint(-108F, -52F, 40.5F);

		leftWingModel[60].addShapeBox(0F, 0F, 0F, 2, 5, 9, 0F,0F, -4.9999F, 0F, 0F, -1.9999F, 0F, 0F, 0F, 0F, 0F, -2.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 266
		leftWingModel[60].setRotationPoint(-110F, -49F, 47.5F);

		leftWingModel[61].addShapeBox(0F, 0F, 0F, 2, 12, 7, 0F,0F, -2.9999F, -5.9999F, 0F, 0F, -5.9999F, 0F, 0F, -0.9999F, 0F, -2.9999F, -0.9999F, 0F, 0F, -2.9999F, 0F, 0F, -0.9999F, 0F, 0F, -0.9999F, 0F, 0F, -0.9999F); // Box 267
		leftWingModel[61].setRotationPoint(-110F, -47F, 41.5F);

		leftWingModel[62].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.9999F, 0F, 0F, -3.9999F, 0F); // Box 268
		leftWingModel[62].setRotationPoint(-110F, -44F, 47.5F);

		leftWingModel[63].addShapeBox(0F, 0F, 0F, 26, 18, 16, 0F,0F, -4F, -4F, 0F, -5F, -3F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 269
		leftWingModel[63].setRotationPoint(-87F, -53F, 40.5F);

		leftWingModel[64].addShapeBox(0F, 0F, 0F, 26, 18, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -5F, -5F, 0F, -4F, -4F); // Box 270
		leftWingModel[64].setRotationPoint(-87F, -35F, 56.5F);

		leftWingModel[65].addShapeBox(0F, 0F, 0F, 17, 18, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -4F, -4F, 0F, -5F, -4F); // Box 271
		leftWingModel[65].setRotationPoint(-104F, -35F, 56.5F);

		leftWingModel[66].addShapeBox(0F, 0F, 0F, 4, 17, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -4F, -4F, 0F, -5F, -7F); // Box 272
		leftWingModel[66].setRotationPoint(-108F, -35F, 56.5F);

		leftWingModel[67].addShapeBox(0F, 0F, 0F, 2, 12, 7, 0F,0F, 0F, -0.9999F, 0F, 0F, -0.9999F, 0F, 0F, -0.9999F, 0F, 0F, -2.9999F, 0F, -2.9999F, -0.9999F, 0F, 0F, -0.9999F, 0F, 0F, -5.9999F, 0F, -2.9999F, -5.9999F); // Box 273
		leftWingModel[67].setRotationPoint(-110F, -35F, 64.5F);

		leftWingModel[68].addShapeBox(0F, 0F, 0F, 2, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.9999F, 0F, 0F, 0F, 0F, 0F, -1.9999F, 0F, 0F, -4.9999F, 0F); // Box 274
		leftWingModel[68].setRotationPoint(-110F, -26F, 56.5F);

		leftWingModel[69].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, -3.9999F, 0F, 0F, -3.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 275
		leftWingModel[69].setRotationPoint(-110F, -30F, 61.5F);

		leftWingModel[70].addShapeBox(0F, 0F, 0F, 26, 18, 16, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -4F, 0F, -5F, -5F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 276
		leftWingModel[70].setRotationPoint(-87F, -35F, 40.5F);

		leftWingModel[71].addShapeBox(0F, 0F, 0F, 17, 18, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -4F, 0F, -4F, -4F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 277
		leftWingModel[71].setRotationPoint(-104F, -35F, 40.5F);

		leftWingModel[72].addShapeBox(0F, 0F, 0F, 4, 17, 16, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -7F, 0F, -4F, -4F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 278
		leftWingModel[72].setRotationPoint(-108F, -35F, 40.5F);

		leftWingModel[73].addShapeBox(0F, 0F, 0F, 2, 12, 7, 0F,0F, 0F, -2.9999F, 0F, 0F, -0.9999F, 0F, 0F, -0.9999F, 0F, 0F, -0.9999F, 0F, -2.9999F, -5.9999F, 0F, 0F, -5.9999F, 0F, 0F, -0.9999F, 0F, -2.9999F, -0.9999F); // Box 279
		leftWingModel[73].setRotationPoint(-110F, -35F, 41.5F);

		leftWingModel[74].addShapeBox(0F, 0F, 0F, 2, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.9999F, 0F, 0F, -1.9999F, 0F, 0F, 0F, 0F, 0F, -2.9999F, 0F); // Box 280
		leftWingModel[74].setRotationPoint(-110F, -26F, 47.5F);

		leftWingModel[75].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.9999F, 0F, 0F, -3.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		leftWingModel[75].setRotationPoint(-110F, -30F, 47.5F);

		leftWingModel[76].addShapeBox(0F, 0F, 0F, 6, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 282
		leftWingModel[76].setRotationPoint(-114F, -37.5F, 52F);

		leftWingModel[77].addShapeBox(0F, 0F, 0F, 6, 3, 9, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 283
		leftWingModel[77].setRotationPoint(-114F, -40.5F, 52F);

		leftWingModel[78].addShapeBox(0F, 0F, 0F, 6, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 284
		leftWingModel[78].setRotationPoint(-114F, -34.5F, 52F);

		leftWingModel[79].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 285
		leftWingModel[79].setRotationPoint(-117F, -37F, 53.5F);

		leftWingModel[80].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 286
		leftWingModel[80].setRotationPoint(-117F, -39F, 53.5F);

		leftWingModel[81].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 287
		leftWingModel[81].setRotationPoint(-117F, -35F, 53.5F);

		leftWingModel[82].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 288
		leftWingModel[82].setRotationPoint(-120F, -37F, 53.5F);

		leftWingModel[83].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, -1.9999F, -1.9999F, 0F, 0F, -1.9999F, 0F, 0F, -1.9999F, 0F, -1.9999F, -1.9999F, 0F, 0F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9999F); // Box 289
		leftWingModel[83].setRotationPoint(-120F, -39F, 53.5F);

		leftWingModel[84].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, 0F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9999F, 0F, -1.9999F, -1.9999F, 0F, 0F, -1.9999F, 0F, 0F, -1.9999F, 0F, -1.9999F, -1.9999F); // Box 290
		leftWingModel[84].setRotationPoint(-120F, -35F, 53.5F);

		leftWingModel[85].addShapeBox(0F, 0F, 0F, 26, 18, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 1F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, -4F, -7F, 0F, -5F, -5F); // Box 291
		leftWingModel[85].setRotationPoint(-61F, -35F, 56.5F);

		leftWingModel[86].addShapeBox(0F, 0F, 0F, 26, 18, 16, 0F,0F, 1F, 0F, 0F, -5F, 0F, 0F, -10F, -6F, 0F, -5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 1F); // Box 292
		leftWingModel[86].setRotationPoint(-61F, -53F, 56.5F);

		leftWingModel[87].addShapeBox(0F, 0F, 0F, 26, 18, 16, 0F,0F, -5F, -3F, 0F, -10F, -6F, 0F, -5F, 0F, 0F, 1F, 0F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 293
		leftWingModel[87].setRotationPoint(-61F, -53F, 40.5F);

		leftWingModel[88].addShapeBox(0F, 0F, 0F, 26, 18, 16, 0F,0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -5F, 0F, -4F, -7F, 0F, 1F, 0F, 0F, 2F, 0F); // Box 294
		leftWingModel[88].setRotationPoint(-61F, -35F, 40.5F);

		leftWingModel[89].addShapeBox(0F, 0F, 0F, 26, 13, 16, 0F,0F, 0F, 0F, -4F, -9F, 0F, -12F, -8F, -10F, 0F, -5F, -6F, 0F, 0F, 0F, 4F, 3F, 0F, -4F, 3F, -7F, 0F, 0F, -3F); // Box 295
		leftWingModel[89].setRotationPoint(-35F, -48F, 56.5F);

		leftWingModel[90].addShapeBox(0F, 0F, 0F, 26, 13, 16, 0F,0F, -5F, -6F, -12F, -8F, -10F, -4F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -4F, 3F, -7F, 4F, 3F, 0F, 0F, 0F, 0F); // Box 296
		leftWingModel[90].setRotationPoint(-35F, -48F, 40.5F);

		leftWingModel[91].addShapeBox(0F, 0F, 0F, 30, 18, 16, 0F,0F, 0F, 0F, 0F, -3F, 0F, -8F, -3F, -7F, 0F, 0F, -3F, 0F, 1F, 0F, -7F, -4F, 0F, -13F, -6F, -10F, 0F, -4F, -7F); // Box 297
		leftWingModel[91].setRotationPoint(-35F, -35F, 56.5F);

		leftWingModel[92].addShapeBox(0F, 0F, 0F, 30, 18, 16, 0F,0F, 0F, -3F, -8F, -3F, -7F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -4F, -7F, -13F, -6F, -10F, -7F, -4F, 0F, 0F, 1F, 0F); // Box 298
		leftWingModel[92].setRotationPoint(-35F, -35F, 40.5F);

		leftWingModel[93].addShapeBox(0F, 0F, 0F, 24, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		leftWingModel[93].setRotationPoint(-87F, -6F, 52.5F);

		leftWingModel[94].addShapeBox(0F, 0F, 0F, 24, 8, 8, 0F,-8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		leftWingModel[94].setRotationPoint(-87F, -14F, 52.5F);

		leftWingModel[95].addShapeBox(0F, 0F, 0F, 24, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F); // Box 301
		leftWingModel[95].setRotationPoint(-87F, 2F, 52.5F);

		leftWingModel[96].addShapeBox(0F, 0F, 0F, 6, 24, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 302
		leftWingModel[96].setRotationPoint(-78F, -19F, 60.5F);

		leftWingModel[97].addShapeBox(0F, 0F, 0F, 6, 25, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 303
		leftWingModel[97].setRotationPoint(-78F, -20F, 50.5F);

		leftWingModel[98].addShapeBox(0F, -8F, -1F, 1, 19, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 802
		leftWingModel[98].setRotationPoint(-109F, -36F, -57F);

		leftWingModel[99].addShapeBox(0F, -9F, -1F, 1, 21, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 803
		leftWingModel[99].setRotationPoint(-109F, -36F, -57F);
		leftWingModel[99].rotateAngleX = 1.57079633F;

		leftWingModel[100].addShapeBox(0F, -11F, -1F, 1, 22, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 804
		leftWingModel[100].setRotationPoint(-109F, -36F, -57F);
		leftWingModel[100].rotateAngleX = 2.35619449F;

		leftWingModel[101].addShapeBox(0F, -10F, -1F, 1, 22, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 805
		leftWingModel[101].setRotationPoint(-109F, -36F, -57F);
		leftWingModel[101].rotateAngleX = 0.78539816F;
	}

	private void initrightWingModel_1()
	{
		rightWingModel[0] = new ModelRendererTurbo(this, 425, 481, textureX, textureY); // Box 248
		rightWingModel[1] = new ModelRendererTurbo(this, 1, 537, textureX, textureY); // Box 249
		rightWingModel[2] = new ModelRendererTurbo(this, 217, 689, textureX, textureY); // Box 250
		rightWingModel[3] = new ModelRendererTurbo(this, 777, 297, textureX, textureY); // Box 251
		rightWingModel[4] = new ModelRendererTurbo(this, 145, 233, textureX, textureY); // Box 252
		rightWingModel[5] = new ModelRendererTurbo(this, 825, 297, textureX, textureY); // Box 253
		rightWingModel[6] = new ModelRendererTurbo(this, 161, 345, textureX, textureY); // Box 316
		rightWingModel[7] = new ModelRendererTurbo(this, 545, 345, textureX, textureY); // Box 317
		rightWingModel[8] = new ModelRendererTurbo(this, 313, 353, textureX, textureY); // Box 318
		rightWingModel[9] = new ModelRendererTurbo(this, 1009, 281, textureX, textureY); // Box 319

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 58, 15, 190, 0F,0F, -10F, 0F, 0F, -10F, 0F, -27F, 0F, 0F, -15F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, -27F, -11F, 0F, -15F, -11F, 0F); // Box 248
		rightWingModel[0].setRotationPoint(-82F, -59F, 81F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 9, 15, 190, 0F,0F, -13F, 0F, 0F, -10F, 0F, 15F, 0F, 0F, -18F, -1F, 0F, 0F, 3F, 0F, 0F, 6F, 0F, 15F, -11F, 0F, -18F, -12F, 0F); // Box 249
		rightWingModel[1].setRotationPoint(-91F, -59F, 81F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 22, 15, 190, 0F,0F, -10F, 0F, 0F, -16F, 0F, -40F, -1F, 0F, 27F, 0F, 0F, 0F, 6F, 0F, 0F, 2F, 0F, -40F, -13F, 0F, 27F, -11F, 0F); // Box 250
		rightWingModel[2].setRotationPoint(-24F, -59F, 81F);

		rightWingModel[3].addShapeBox(0F, 0F, 0F, 16, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -8F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, -2F, 0F, 0F, -2F, 0F); // Box 251
		rightWingModel[3].setRotationPoint(-67F, -59F, 271F);

		rightWingModel[4].addShapeBox(0F, 0F, 0F, 6, 4, 7, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, -2F, -2F); // Box 252
		rightWingModel[4].setRotationPoint(-73F, -59F, 271F);

		rightWingModel[5].addShapeBox(0F, 0F, 0F, 16, 4, 7, 0F,-8F, 0F, 0F, 1F, -1F, 0F, -8F, -1F, -1F, 0F, -1F, 0F, -8F, 0F, 0F, 1F, -1F, 0F, -8F, -2F, -1F, 0F, -2F, 0F); // Box 253
		rightWingModel[5].setRotationPoint(-59F, -59F, 271F);

		rightWingModel[6].addShapeBox(0F, -11F, -1F, 1, 22, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 316
		rightWingModel[6].setRotationPoint(-109F, -36F, 56F);
		rightWingModel[6].rotateAngleX = 2.35619449F;

		rightWingModel[7].addShapeBox(0F, -9F, -1F, 1, 21, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 317
		rightWingModel[7].setRotationPoint(-109F, -36F, 56F);
		rightWingModel[7].rotateAngleX = 1.57079633F;

		rightWingModel[8].addShapeBox(0F, -10F, -1F, 1, 22, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 318
		rightWingModel[8].setRotationPoint(-109F, -36F, 56F);
		rightWingModel[8].rotateAngleX = 0.78539816F;

		rightWingModel[9].addShapeBox(0F, -8F, -1F, 1, 19, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 319
		rightWingModel[9].setRotationPoint(-109F, -36F, 56F);
	}

	private void inittailWheelModel_1()
	{
		tailWheelModel[0] = new ModelRendererTurbo(this, 697, 265, textureX, textureY); // Box 391
		tailWheelModel[1] = new ModelRendererTurbo(this, 225, 153, textureX, textureY); // Box 392
		tailWheelModel[2] = new ModelRendererTurbo(this, 1009, 65, textureX, textureY); // Box 393
		tailWheelModel[3] = new ModelRendererTurbo(this, 161, 193, textureX, textureY); // Box 394
		tailWheelModel[4] = new ModelRendererTurbo(this, 433, 201, textureX, textureY); // Box 395
		tailWheelModel[5] = new ModelRendererTurbo(this, 857, 209, textureX, textureY); // Box 396
		tailWheelModel[6] = new ModelRendererTurbo(this, 681, 305, textureX, textureY); // Box 397
		tailWheelModel[7] = new ModelRendererTurbo(this, 225, 249, textureX, textureY); // Box 398
		tailWheelModel[8] = new ModelRendererTurbo(this, 265, 89, textureX, textureY); // Box 399

		tailWheelModel[0].addShapeBox(0F, 0F, 0F, 10, 3, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 391
		tailWheelModel[0].setRotationPoint(120F, -34F, -2F);

		tailWheelModel[1].addShapeBox(0F, 0F, 0F, 8, 3, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F); // Box 392
		tailWheelModel[1].setRotationPoint(122F, -31F, -2F);

		tailWheelModel[2].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 393
		tailWheelModel[2].setRotationPoint(125F, -28F, -2F);

		tailWheelModel[3].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		tailWheelModel[3].setRotationPoint(125F, -25F, -1F);

		tailWheelModel[4].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 395
		tailWheelModel[4].setRotationPoint(125F, -27F, -1F);

		tailWheelModel[5].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 396
		tailWheelModel[5].setRotationPoint(125F, -23F, -1F);

		tailWheelModel[6].addShapeBox(0F, 0F, 0F, 10, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F); // Box 397
		tailWheelModel[6].setRotationPoint(120F, -34F, 0F);

		tailWheelModel[7].addShapeBox(0F, 0F, 0F, 8, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 398
		tailWheelModel[7].setRotationPoint(122F, -31F, 0F);

		tailWheelModel[8].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 399
		tailWheelModel[8].setRotationPoint(125F, -28F, 1F);
	}

	private void inithudModel_1()
	{
		hudModel[0] = new ModelRendererTurbo(this, 481, 425, textureX, textureY); // Box 357
		hudModel[1] = new ModelRendererTurbo(this, 1001, 353, textureX, textureY); // Box 358
		hudModel[2] = new ModelRendererTurbo(this, 681, 41, textureX, textureY); // Box 359
		hudModel[3] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 360
		hudModel[4] = new ModelRendererTurbo(this, 161, 361, textureX, textureY); // Box 361
		hudModel[5] = new ModelRendererTurbo(this, 1001, 473, textureX, textureY); // Box 362
		hudModel[6] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 363
		hudModel[7] = new ModelRendererTurbo(this, 41, 481, textureX, textureY); // Box 364
		hudModel[8] = new ModelRendererTurbo(this, 49, 145, textureX, textureY); // Box 365
		hudModel[9] = new ModelRendererTurbo(this, 945, 153, textureX, textureY); // Box 366
		hudModel[10] = new ModelRendererTurbo(this, 745, 209, textureX, textureY); // Box 367
		hudModel[11] = new ModelRendererTurbo(this, 681, 329, textureX, textureY); // Box 368
		hudModel[12] = new ModelRendererTurbo(this, 33, 313, textureX, textureY); // Box 369
		hudModel[13] = new ModelRendererTurbo(this, 993, 313, textureX, textureY); // Box 370
		hudModel[14] = new ModelRendererTurbo(this, 697, 193, textureX, textureY); // Box 371
		hudModel[15] = new ModelRendererTurbo(this, 681, 1, textureX, textureY); // Box 372
		hudModel[16] = new ModelRendererTurbo(this, 993, 105, textureX, textureY); // Box 373
		hudModel[17] = new ModelRendererTurbo(this, 33, 113, textureX, textureY); // Box 374
		hudModel[18] = new ModelRendererTurbo(this, 217, 113, textureX, textureY); // Box 375
		hudModel[19] = new ModelRendererTurbo(this, 57, 153, textureX, textureY); // Box 376
		hudModel[20] = new ModelRendererTurbo(this, 513, 161, textureX, textureY); // Box 377
		hudModel[21] = new ModelRendererTurbo(this, 241, 113, textureX, textureY); // Box 378
		hudModel[22] = new ModelRendererTurbo(this, 625, 113, textureX, textureY); // Box 379
		hudModel[23] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 380
		hudModel[24] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 381
		hudModel[25] = new ModelRendererTurbo(this, 401, 465, textureX, textureY); // Box 382
		hudModel[26] = new ModelRendererTurbo(this, 57, 401, textureX, textureY); // Box 383
		hudModel[27] = new ModelRendererTurbo(this, 553, 49, textureX, textureY); // Box 384
		hudModel[28] = new ModelRendererTurbo(this, 873, 73, textureX, textureY); // Box 385
		hudModel[29] = new ModelRendererTurbo(this, 297, 401, textureX, textureY); // Box 386
		hudModel[30] = new ModelRendererTurbo(this, 161, 489, textureX, textureY); // Box 387
		hudModel[31] = new ModelRendererTurbo(this, 777, 209, textureX, textureY); // Box 388
		hudModel[32] = new ModelRendererTurbo(this, 409, 489, textureX, textureY); // Box 389
		hudModel[33] = new ModelRendererTurbo(this, 609, 225, textureX, textureY); // Box 390
		hudModel[34] = new ModelRendererTurbo(this, 937, 225, textureX, textureY); // Box 391
		hudModel[35] = new ModelRendererTurbo(this, 889, 329, textureX, textureY); // Box 392
		hudModel[36] = new ModelRendererTurbo(this, 185, 361, textureX, textureY); // Box 393
		hudModel[37] = new ModelRendererTurbo(this, 137, 345, textureX, textureY); // Box 394
		hudModel[38] = new ModelRendererTurbo(this, 625, 385, textureX, textureY); // Box 395
		hudModel[39] = new ModelRendererTurbo(this, 673, 113, textureX, textureY); // Box 396
		hudModel[40] = new ModelRendererTurbo(this, 737, 113, textureX, textureY); // Box 397
		hudModel[41] = new ModelRendererTurbo(this, 953, 113, textureX, textureY); // Box 398
		hudModel[42] = new ModelRendererTurbo(this, 737, 217, textureX, textureY); // Box 399
		hudModel[43] = new ModelRendererTurbo(this, 737, 233, textureX, textureY); // Box 400
		hudModel[44] = new ModelRendererTurbo(this, 321, 497, textureX, textureY); // Box 401
		hudModel[45] = new ModelRendererTurbo(this, 449, 401, textureX, textureY); // Box 402
		hudModel[46] = new ModelRendererTurbo(this, 257, 105, textureX, textureY); // Box 403
		hudModel[47] = new ModelRendererTurbo(this, 465, 241, textureX, textureY); // Box 404
		hudModel[48] = new ModelRendererTurbo(this, 761, 401, textureX, textureY); // Box 405
		hudModel[49] = new ModelRendererTurbo(this, 785, 513, textureX, textureY); // Box 406
		hudModel[50] = new ModelRendererTurbo(this, 401, 241, textureX, textureY); // Box 407
		hudModel[51] = new ModelRendererTurbo(this, 57, 497, textureX, textureY); // Box 408
		hudModel[52] = new ModelRendererTurbo(this, 745, 233, textureX, textureY); // Box 409
		hudModel[53] = new ModelRendererTurbo(this, 1, 265, textureX, textureY); // Box 410
		hudModel[54] = new ModelRendererTurbo(this, 1017, 369, textureX, textureY); // Box 411
		hudModel[55] = new ModelRendererTurbo(this, 177, 377, textureX, textureY); // Box 412
		hudModel[56] = new ModelRendererTurbo(this, 833, 385, textureX, textureY); // Box 413
		hudModel[57] = new ModelRendererTurbo(this, 145, 401, textureX, textureY); // Box 414
		hudModel[58] = new ModelRendererTurbo(this, 441, 121, textureX, textureY); // Box 415
		hudModel[59] = new ModelRendererTurbo(this, 505, 121, textureX, textureY); // Box 416
		hudModel[60] = new ModelRendererTurbo(this, 569, 121, textureX, textureY); // Box 417
		hudModel[61] = new ModelRendererTurbo(this, 777, 249, textureX, textureY); // Box 418
		hudModel[62] = new ModelRendererTurbo(this, 785, 249, textureX, textureY); // Box 419

		hudModel[0].addShapeBox(0F, 1F, 0F, 10, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 357
		hudModel[0].setRotationPoint(-130F, -37F, 4F);
		hudModel[0].rotateAngleZ = -0.10471976F;

		hudModel[1].addShapeBox(9F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 358
		hudModel[1].setRotationPoint(-130F, -37F, 4F);
		hudModel[1].rotateAngleZ = -0.10471976F;

		hudModel[2].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 359
		hudModel[2].setRotationPoint(-130F, -37F, 13F);
		hudModel[2].rotateAngleZ = -0.10471976F;

		hudModel[3].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 360
		hudModel[3].setRotationPoint(-130F, -37F, 4F);
		hudModel[3].rotateAngleZ = -0.10471976F;

		hudModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 361
		hudModel[4].setRotationPoint(-130F, -37F, 4F);
		hudModel[4].rotateAngleZ = -0.10471976F;

		hudModel[5].addShapeBox(0F, 0F, 0F, 1, 13, 10, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 362
		hudModel[5].setRotationPoint(-121F, -49F, 4F);

		hudModel[6].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 363
		hudModel[6].setRotationPoint(-119F, -53F, 6F);

		hudModel[7].addShapeBox(0F, 0F, 0F, 1, 13, 8, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364
		hudModel[7].setRotationPoint(-122F, -48F, 5F);

		hudModel[8].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 365
		hudModel[8].setRotationPoint(-122.3F, -48.3F, 10F);

		hudModel[9].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 366
		hudModel[9].setRotationPoint(-122.3F, -48.3F, 7F);

		hudModel[10].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 367
		hudModel[10].setRotationPoint(-121F, -46F, 12F);

		hudModel[11].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 368
		hudModel[11].setRotationPoint(-121F, -46F, 5F);

		hudModel[12].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 369
		hudModel[12].setRotationPoint(-127F, -36F, 14F);
		hudModel[12].rotateAngleZ = 0.78539816F;

		hudModel[13].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 370
		hudModel[13].setRotationPoint(-127F, -36F, 3F);
		hudModel[13].rotateAngleZ = 0.78539816F;

		hudModel[14].addShapeBox(-1F, -1F, 0F, 2, 11, 2, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 371
		hudModel[14].setRotationPoint(-131.5F, -41.25F, 8F);
		hudModel[14].rotateAngleZ = -1.13446401F;

		hudModel[15].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 372
		hudModel[15].setRotationPoint(-131F, -45F, 8.5F);

		hudModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 373
		hudModel[16].setRotationPoint(-119.5F, -52.5F, 7.5F);

		hudModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 374
		hudModel[17].setRotationPoint(-119.5F, -51.5F, 7.5F);

		hudModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 375
		hudModel[18].setRotationPoint(-119.5F, -50.5F, 7.5F);

		hudModel[19].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 376
		hudModel[19].setRotationPoint(-126F, -35F, 12F);

		hudModel[20].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 377
		hudModel[20].setRotationPoint(-126F, -35F, 5F);

		hudModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 378
		hudModel[21].setRotationPoint(-131F, -44.75F, 5.5F);

		hudModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 379
		hudModel[22].setRotationPoint(-131F, -44.75F, 9.5F);

		hudModel[23].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 380
		hudModel[23].setRotationPoint(-131F, -47.75F, 11.5F);

		hudModel[24].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 381
		hudModel[24].setRotationPoint(-131F, -47.75F, 5.5F);

		hudModel[25].addShapeBox(0F, 1F, 0F, 10, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 382
		hudModel[25].setRotationPoint(-109F, -37F, 4F);
		hudModel[25].rotateAngleZ = -0.10471976F;

		hudModel[26].addShapeBox(9F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 383
		hudModel[26].setRotationPoint(-109F, -37F, 4F);
		hudModel[26].rotateAngleZ = -0.10471976F;

		hudModel[27].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 384
		hudModel[27].setRotationPoint(-109F, -37F, 13F);
		hudModel[27].rotateAngleZ = -0.10471976F;

		hudModel[28].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 385
		hudModel[28].setRotationPoint(-109F, -37F, 4F);
		hudModel[28].rotateAngleZ = -0.10471976F;

		hudModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 386
		hudModel[29].setRotationPoint(-109F, -37F, 4F);
		hudModel[29].rotateAngleZ = -0.10471976F;

		hudModel[30].addShapeBox(0F, 0F, 0F, 1, 13, 10, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 387
		hudModel[30].setRotationPoint(-100F, -49F, 4F);

		hudModel[31].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 388
		hudModel[31].setRotationPoint(-98F, -53F, 6F);

		hudModel[32].addShapeBox(0F, 0F, 0F, 1, 13, 8, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 389
		hudModel[32].setRotationPoint(-101F, -48F, 5F);

		hudModel[33].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 390
		hudModel[33].setRotationPoint(-101.3F, -48.3F, 10F);

		hudModel[34].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 391
		hudModel[34].setRotationPoint(-101.3F, -48.3F, 7F);

		hudModel[35].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 392
		hudModel[35].setRotationPoint(-100F, -46F, 12F);

		hudModel[36].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 393
		hudModel[36].setRotationPoint(-100F, -46F, 5F);

		hudModel[37].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 394
		hudModel[37].setRotationPoint(-106F, -36F, 14F);
		hudModel[37].rotateAngleZ = 0.78539816F;

		hudModel[38].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 395
		hudModel[38].setRotationPoint(-106F, -36F, 3F);
		hudModel[38].rotateAngleZ = 0.78539816F;

		hudModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 396
		hudModel[39].setRotationPoint(-98.5F, -52.5F, 7.5F);

		hudModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 397
		hudModel[40].setRotationPoint(-98.5F, -51.5F, 7.5F);

		hudModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 398
		hudModel[41].setRotationPoint(-98.5F, -50.5F, 7.5F);

		hudModel[42].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 399
		hudModel[42].setRotationPoint(-105F, -35F, 12F);

		hudModel[43].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 400
		hudModel[43].setRotationPoint(-105F, -35F, 5F);

		hudModel[44].addShapeBox(0F, 1F, 0F, 10, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 401
		hudModel[44].setRotationPoint(-109F, -37F, -14F);
		hudModel[44].rotateAngleZ = -0.10471976F;

		hudModel[45].addShapeBox(9F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 402
		hudModel[45].setRotationPoint(-109F, -37F, -14F);
		hudModel[45].rotateAngleZ = -0.10471976F;

		hudModel[46].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 403
		hudModel[46].setRotationPoint(-109F, -37F, -14F);
		hudModel[46].rotateAngleZ = -0.10471976F;

		hudModel[47].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 404
		hudModel[47].setRotationPoint(-109F, -37F, -5F);
		hudModel[47].rotateAngleZ = -0.10471976F;

		hudModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 405
		hudModel[48].setRotationPoint(-109F, -37F, -14F);
		hudModel[48].rotateAngleZ = -0.10471976F;

		hudModel[49].addShapeBox(0F, 0F, 0F, 1, 13, 10, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 406
		hudModel[49].setRotationPoint(-100F, -49F, -14F);

		hudModel[50].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 407
		hudModel[50].setRotationPoint(-98F, -53F, -12F);

		hudModel[51].addShapeBox(0F, 0F, 0F, 1, 13, 8, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 408
		hudModel[51].setRotationPoint(-101F, -48F, -13F);

		hudModel[52].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 409
		hudModel[52].setRotationPoint(-101.3F, -48.3F, -11F);

		hudModel[53].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 410
		hudModel[53].setRotationPoint(-101.3F, -48.3F, -8F);

		hudModel[54].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 411
		hudModel[54].setRotationPoint(-100F, -46F, -13F);

		hudModel[55].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 412
		hudModel[55].setRotationPoint(-100F, -46F, -6F);

		hudModel[56].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413
		hudModel[56].setRotationPoint(-106F, -36F, -15F);
		hudModel[56].rotateAngleZ = 0.78539816F;

		hudModel[57].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 414
		hudModel[57].setRotationPoint(-106F, -36F, -4F);
		hudModel[57].rotateAngleZ = 0.78539816F;

		hudModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 415
		hudModel[58].setRotationPoint(-98.5F, -52.5F, -10.5F);

		hudModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 416
		hudModel[59].setRotationPoint(-98.5F, -51.5F, -10.5F);

		hudModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 417
		hudModel[60].setRotationPoint(-98.5F, -50.5F, -10.5F);

		hudModel[61].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 418
		hudModel[61].setRotationPoint(-105F, -35F, -13F);

		hudModel[62].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 419
		hudModel[62].setRotationPoint(-105F, -35F, -6F);
	}

	private void initPropeller()
	{
		propellerModels = new ModelRendererTurbo[2][3];
		propellerModels[0] = makeProp1(-115F, -36.5F, -56.5F);
		propellerModels[1] = makeProp2(-115F, -36.5F, 56.5F);
	}

	private ModelRendererTurbo[] makeProp1(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[3];
		prop[0] = new ModelRendererTurbo(this, 0, 537, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 537, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 0, 537, textureX, textureY);
		prop[0].addBox(-0.5F, -30F, -2F, 1, 30, 4, 0.0F);
		prop[1].addBox(-0.5F, -30F, -2F, 1, 30, 4, 0.0F);
		prop[2].addBox(-0.5F, -30F, -2F, 1, 30, 4, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		return prop;
	}

	private ModelRendererTurbo[] makeProp2(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[3];
		prop[0] = new ModelRendererTurbo(this, 0, 537, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 537, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 0, 537, textureX, textureY);
		prop[0].addBox(-0.5F, -30F, -2F, 1, 30, 4, 0.0F);
		prop[1].addBox(-0.5F, -30F, -2F, 1, 30, 4, 0.0F);
		prop[2].addBox(-0.5F, -30F, -2F, 1, 30, 4, 0.0F);
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

		gun_2_Model[0] = new ModelRendererTurbo[118];
		gun_2_Model[0][0] = new ModelRendererTurbo(this, 467, 697, textureX, textureY); // Box 4
		gun_2_Model[0][1] = new ModelRendererTurbo(this, 523, 697, textureX, textureY); // Box 7
		gun_2_Model[0][2] = new ModelRendererTurbo(this, 563, 697, textureX, textureY); // Box 8
		gun_2_Model[0][3] = new ModelRendererTurbo(this, 603, 697, textureX, textureY); // Box 0
		gun_2_Model[0][4] = new ModelRendererTurbo(this, 643, 697, textureX, textureY); // Box 1
		gun_2_Model[0][5] = new ModelRendererTurbo(this, 683, 697, textureX, textureY); // Box 0
		gun_2_Model[0][6] = new ModelRendererTurbo(this, 691, 697, textureX, textureY); // Box 1
		gun_2_Model[0][7] = new ModelRendererTurbo(this, 699, 697, textureX, textureY); // Box 2
		gun_2_Model[0][8] = new ModelRendererTurbo(this, 707, 697, textureX, textureY); // Box 3
		gun_2_Model[0][9] = new ModelRendererTurbo(this, 715, 697, textureX, textureY); // Box 4
		gun_2_Model[0][10] = new ModelRendererTurbo(this, 723, 697, textureX, textureY); // Box 5
		gun_2_Model[0][11] = new ModelRendererTurbo(this, 731, 697, textureX, textureY); // Box 12
		gun_2_Model[0][12] = new ModelRendererTurbo(this, 739, 697, textureX, textureY); // Box 13
		gun_2_Model[0][13] = new ModelRendererTurbo(this, 747, 697, textureX, textureY); // Box 14
		gun_2_Model[0][14] = new ModelRendererTurbo(this, 755, 697, textureX, textureY); // Box 15
		gun_2_Model[0][15] = new ModelRendererTurbo(this, 763, 697, textureX, textureY); // Box 16
		gun_2_Model[0][16] = new ModelRendererTurbo(this, 771, 697, textureX, textureY); // Box 17
		gun_2_Model[0][17] = new ModelRendererTurbo(this, 779, 697, textureX, textureY); // Box 18
		gun_2_Model[0][18] = new ModelRendererTurbo(this, 787, 697, textureX, textureY); // Box 19
		gun_2_Model[0][19] = new ModelRendererTurbo(this, 795, 697, textureX, textureY); // Box 20
		gun_2_Model[0][20] = new ModelRendererTurbo(this, 803, 697, textureX, textureY); // Box 21
		gun_2_Model[0][21] = new ModelRendererTurbo(this, 811, 697, textureX, textureY); // Box 22
		gun_2_Model[0][22] = new ModelRendererTurbo(this, 819, 697, textureX, textureY); // Box 23
		gun_2_Model[0][23] = new ModelRendererTurbo(this, 827, 697, textureX, textureY); // Box 24
		gun_2_Model[0][24] = new ModelRendererTurbo(this, 835, 697, textureX, textureY); // Box 25
		gun_2_Model[0][25] = new ModelRendererTurbo(this, 843, 697, textureX, textureY); // Box 26
		gun_2_Model[0][26] = new ModelRendererTurbo(this, 851, 697, textureX, textureY); // Box 27
		gun_2_Model[0][27] = new ModelRendererTurbo(this, 859, 697, textureX, textureY); // Box 28
		gun_2_Model[0][28] = new ModelRendererTurbo(this, 867, 697, textureX, textureY); // Box 29
		gun_2_Model[0][29] = new ModelRendererTurbo(this, 875, 697, textureX, textureY); // Box 2
		gun_2_Model[0][30] = new ModelRendererTurbo(this, 467, 705, textureX, textureY); // Box 3
		gun_2_Model[0][31] = new ModelRendererTurbo(this, 523, 705, textureX, textureY); // Box 4
		gun_2_Model[0][32] = new ModelRendererTurbo(this, 931, 697, textureX, textureY); // Box 0
		gun_2_Model[0][33] = new ModelRendererTurbo(this, 939, 697, textureX, textureY); // Box 1
		gun_2_Model[0][34] = new ModelRendererTurbo(this, 947, 697, textureX, textureY); // Box 2
		gun_2_Model[0][35] = new ModelRendererTurbo(this, 955, 697, textureX, textureY); // Box 3
		gun_2_Model[0][36] = new ModelRendererTurbo(this, 963, 697, textureX, textureY); // Box 6
		gun_2_Model[0][37] = new ModelRendererTurbo(this, 971, 697, textureX, textureY); // Box 8
		gun_2_Model[0][38] = new ModelRendererTurbo(this, 579, 705, textureX, textureY); // Box 9
		gun_2_Model[0][39] = new ModelRendererTurbo(this, 587, 705, textureX, textureY); // Box 10
		gun_2_Model[0][40] = new ModelRendererTurbo(this, 595, 705, textureX, textureY); // Box 11
		gun_2_Model[0][41] = new ModelRendererTurbo(this, 603, 705, textureX, textureY); // Box 12
		gun_2_Model[0][42] = new ModelRendererTurbo(this, 611, 705, textureX, textureY); // Box 13
		gun_2_Model[0][43] = new ModelRendererTurbo(this, 619, 705, textureX, textureY); // Box 14
		gun_2_Model[0][44] = new ModelRendererTurbo(this, 627, 705, textureX, textureY); // Box 15
		gun_2_Model[0][45] = new ModelRendererTurbo(this, 635, 705, textureX, textureY); // Box 15
		gun_2_Model[0][46] = new ModelRendererTurbo(this, 643, 705, textureX, textureY); // Box 15
		gun_2_Model[0][47] = new ModelRendererTurbo(this, 651, 705, textureX, textureY); // Box 15
		gun_2_Model[0][48] = new ModelRendererTurbo(this, 659, 705, textureX, textureY); // Box 15
		gun_2_Model[0][49] = new ModelRendererTurbo(this, 667, 705, textureX, textureY); // Box 15
		gun_2_Model[0][50] = new ModelRendererTurbo(this, 675, 705, textureX, textureY); // Box 15
		gun_2_Model[0][51] = new ModelRendererTurbo(this, 683, 705, textureX, textureY); // Box 15
		gun_2_Model[0][52] = new ModelRendererTurbo(this, 691, 705, textureX, textureY); // Box 23
		gun_2_Model[0][53] = new ModelRendererTurbo(this, 699, 705, textureX, textureY); // Box 24
		gun_2_Model[0][54] = new ModelRendererTurbo(this, 707, 705, textureX, textureY); // Box 25
		gun_2_Model[0][55] = new ModelRendererTurbo(this, 715, 705, textureX, textureY); // Box 26
		gun_2_Model[0][56] = new ModelRendererTurbo(this, 723, 705, textureX, textureY); // Box 27
		gun_2_Model[0][57] = new ModelRendererTurbo(this, 731, 705, textureX, textureY); // Box 28
		gun_2_Model[0][58] = new ModelRendererTurbo(this, 739, 705, textureX, textureY); // Box 29
		gun_2_Model[0][59] = new ModelRendererTurbo(this, 747, 705, textureX, textureY); // Box 30
		gun_2_Model[0][60] = new ModelRendererTurbo(this, 755, 705, textureX, textureY); // Box 31
		gun_2_Model[0][61] = new ModelRendererTurbo(this, 763, 705, textureX, textureY); // Box 32
		gun_2_Model[0][62] = new ModelRendererTurbo(this, 771, 705, textureX, textureY); // Box 33
		gun_2_Model[0][63] = new ModelRendererTurbo(this, 779, 705, textureX, textureY); // Box 34
		gun_2_Model[0][64] = new ModelRendererTurbo(this, 787, 705, textureX, textureY); // Box 35
		gun_2_Model[0][65] = new ModelRendererTurbo(this, 795, 705, textureX, textureY); // Box 36
		gun_2_Model[0][66] = new ModelRendererTurbo(this, 803, 705, textureX, textureY); // Box 37
		gun_2_Model[0][67] = new ModelRendererTurbo(this, 811, 705, textureX, textureY); // Box 38
		gun_2_Model[0][68] = new ModelRendererTurbo(this, 819, 705, textureX, textureY); // Box 39
		gun_2_Model[0][69] = new ModelRendererTurbo(this, 827, 705, textureX, textureY); // Box 40
		gun_2_Model[0][70] = new ModelRendererTurbo(this, 835, 705, textureX, textureY); // Box 41
		gun_2_Model[0][71] = new ModelRendererTurbo(this, 843, 705, textureX, textureY); // Box 42
		gun_2_Model[0][72] = new ModelRendererTurbo(this, 851, 705, textureX, textureY); // Box 43
		gun_2_Model[0][73] = new ModelRendererTurbo(this, 859, 705, textureX, textureY); // Box 44
		gun_2_Model[0][74] = new ModelRendererTurbo(this, 867, 705, textureX, textureY); // Box 45
		gun_2_Model[0][75] = new ModelRendererTurbo(this, 907, 705, textureX, textureY); // Box 46
		gun_2_Model[0][76] = new ModelRendererTurbo(this, 931, 705, textureX, textureY); // Box 47
		gun_2_Model[0][77] = new ModelRendererTurbo(this, 955, 705, textureX, textureY); // Box 48
		gun_2_Model[0][78] = new ModelRendererTurbo(this, 467, 713, textureX, textureY); // Box 49
		gun_2_Model[0][79] = new ModelRendererTurbo(this, 491, 713, textureX, textureY); // Box 0
		gun_2_Model[0][80] = new ModelRendererTurbo(this, 531, 713, textureX, textureY); // Box 1
		gun_2_Model[0][81] = new ModelRendererTurbo(this, 571, 713, textureX, textureY); // Box 3
		gun_2_Model[0][82] = new ModelRendererTurbo(this, 611, 713, textureX, textureY); // Box 4
		gun_2_Model[0][83] = new ModelRendererTurbo(this, 651, 713, textureX, textureY); // Box 0
		gun_2_Model[0][84] = new ModelRendererTurbo(this, 675, 713, textureX, textureY); // Box 5
		gun_2_Model[0][85] = new ModelRendererTurbo(this, 699, 713, textureX, textureY); // Box 0
		gun_2_Model[0][86] = new ModelRendererTurbo(this, 731, 713, textureX, textureY); // Box 1
		gun_2_Model[0][87] = new ModelRendererTurbo(this, 763, 713, textureX, textureY); // Box 2
		gun_2_Model[0][88] = new ModelRendererTurbo(this, 795, 713, textureX, textureY); // Box 3
		gun_2_Model[0][89] = new ModelRendererTurbo(this, 827, 713, textureX, textureY); // Box 5
		gun_2_Model[0][90] = new ModelRendererTurbo(this, 843, 713, textureX, textureY); // Box 6
		gun_2_Model[0][91] = new ModelRendererTurbo(this, 859, 713, textureX, textureY); // Box 9
		gun_2_Model[0][92] = new ModelRendererTurbo(this, 867, 713, textureX, textureY); // Box 10
		gun_2_Model[0][93] = new ModelRendererTurbo(this, 875, 713, textureX, textureY); // Box 11
		gun_2_Model[0][94] = new ModelRendererTurbo(this, 883, 713, textureX, textureY); // Box 12
		gun_2_Model[0][95] = new ModelRendererTurbo(this, 899, 713, textureX, textureY); // Box 13
		gun_2_Model[0][96] = new ModelRendererTurbo(this, 923, 713, textureX, textureY); // Box 14
		gun_2_Model[0][97] = new ModelRendererTurbo(this, 947, 713, textureX, textureY); // Box 15
		gun_2_Model[0][98] = new ModelRendererTurbo(this, 971, 713, textureX, textureY); // Box 25
		gun_2_Model[0][99] = new ModelRendererTurbo(this, 787, 721, textureX, textureY); // Box 27
		gun_2_Model[0][100] = new ModelRendererTurbo(this, 795, 721, textureX, textureY); // Box 28
		gun_2_Model[0][101] = new ModelRendererTurbo(this, 803, 721, textureX, textureY); // Box 29
		gun_2_Model[0][102] = new ModelRendererTurbo(this, 811, 721, textureX, textureY); // Box 29
		gun_2_Model[0][103] = new ModelRendererTurbo(this, 819, 721, textureX, textureY); // Box 31
		gun_2_Model[0][104] = new ModelRendererTurbo(this, 827, 721, textureX, textureY); // Box 32
		gun_2_Model[0][105] = new ModelRendererTurbo(this, 835, 721, textureX, textureY); // Box 33
		gun_2_Model[0][106] = new ModelRendererTurbo(this, 843, 721, textureX, textureY); // Box 34
		gun_2_Model[0][107] = new ModelRendererTurbo(this, 851, 721, textureX, textureY); // Box 35
		gun_2_Model[0][108] = new ModelRendererTurbo(this, 859, 721, textureX, textureY); // Box 36
		gun_2_Model[0][109] = new ModelRendererTurbo(this, 867, 721, textureX, textureY); // Box 37
		gun_2_Model[0][110] = new ModelRendererTurbo(this, 875, 721, textureX, textureY); // Box 38
		gun_2_Model[0][111] = new ModelRendererTurbo(this, 883, 721, textureX, textureY); // Box 38
		gun_2_Model[0][112] = new ModelRendererTurbo(this, 891, 721, textureX, textureY); // Box 38
		gun_2_Model[0][113] = new ModelRendererTurbo(this, 899, 721, textureX, textureY); // Box 0
		gun_2_Model[0][114] = new ModelRendererTurbo(this, 939, 721, textureX, textureY); // Box 1
		gun_2_Model[0][115] = new ModelRendererTurbo(this, 467, 729, textureX, textureY); // Box 2
		gun_2_Model[0][116] = new ModelRendererTurbo(this, 507, 729, textureX, textureY); // Box 3
		gun_2_Model[0][117] = new ModelRendererTurbo(this, 547, 729, textureX, textureY); // Box 4

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
			gunPart.setRotationPoint(2F, -62F, 0F);
		}


		gun_2_Model[1] = new ModelRendererTurbo[0];

		gun_2_Model[2] = new ModelRendererTurbo[12];
		gun_2_Model[2][0] = new ModelRendererTurbo(this, 595, 721, textureX, textureY); // Box 8
		gun_2_Model[2][1] = new ModelRendererTurbo(this, 611, 721, textureX, textureY); // Box 13
		gun_2_Model[2][2] = new ModelRendererTurbo(this, 627, 721, textureX, textureY); // Box 15
		gun_2_Model[2][3] = new ModelRendererTurbo(this, 643, 721, textureX, textureY); // Box 16
		gun_2_Model[2][4] = new ModelRendererTurbo(this, 659, 721, textureX, textureY); // Box 17
		gun_2_Model[2][5] = new ModelRendererTurbo(this, 675, 721, textureX, textureY); // Box 18
		gun_2_Model[2][6] = new ModelRendererTurbo(this, 691, 721, textureX, textureY); // Box 19
		gun_2_Model[2][7] = new ModelRendererTurbo(this, 707, 721, textureX, textureY); // Box 19
		gun_2_Model[2][8] = new ModelRendererTurbo(this, 723, 721, textureX, textureY); // Box 19
		gun_2_Model[2][9] = new ModelRendererTurbo(this, 739, 721, textureX, textureY); // Box 19
		gun_2_Model[2][10] = new ModelRendererTurbo(this, 755, 721, textureX, textureY); // Box 19
		gun_2_Model[2][11] = new ModelRendererTurbo(this, 771, 721, textureX, textureY); // Box 19

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
			gunPart.setRotationPoint(2F, -62F, 0F);
		}


		registerGunModel("DorsalGun", gun_2_Model);
	}
}