//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: p51h
// Model Creator: TaskForce51
// Created on: 07.04.2023 - 01:14:29
// Last changed on: 07.04.2023 - 01:14:29

package com.flansmod.client.model.Taskball; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelP51h extends ModelPlane //Same as Filename
{
	int textureX = 2048;
	int textureY = 1024;

	public ModelP51h() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[401];
		noseModel = new ModelRendererTurbo[56];
		tailModel = new ModelRendererTurbo[20];
		leftWingModel = new ModelRendererTurbo[43];
		rightWingModel = new ModelRendererTurbo[43];
		yawFlapModel = new ModelRendererTurbo[1];
		pitchFlapLeftModel = new ModelRendererTurbo[1];
		pitchFlapRightModel = new ModelRendererTurbo[1];
		pitchFlapLeftWingModel = new ModelRendererTurbo[2];
		tailWheelModel = new ModelRendererTurbo[7];
		leftWingWheelModel = new ModelRendererTurbo[12];
		rightWingWheelModel = new ModelRendererTurbo[12];

		initbodyModel_1();
		initnoseModel_1();
		inittailModel_1();
		initleftWingModel_1();
		initrightWingModel_1();
		inityawFlapModel_1();
		initpitchFlapLeftModel_1();
		initpitchFlapRightModel_1();
		initpitchFlapLeftWingModel_1();
		inittailWheelModel_1();
		initleftWingWheelModel_1();
		initrightWingWheelModel_1();

		initPropeller();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 880, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 121, 880, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 145, 880, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 161, 880, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 177, 880, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 233, 880, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 273, 880, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 289, 880, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 345, 880, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 393, 880, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 457, 880, textureX, textureY); // Box 10
		bodyModel[11] = new ModelRendererTurbo(this, 137, 880, textureX, textureY); // Box 11
		bodyModel[12] = new ModelRendererTurbo(this, 505, 880, textureX, textureY); // Box 12
		bodyModel[13] = new ModelRendererTurbo(this, 529, 880, textureX, textureY); // Box 13
		bodyModel[14] = new ModelRendererTurbo(this, 1, 949, textureX, textureY); // Box 14
		bodyModel[15] = new ModelRendererTurbo(this, 1, 927, textureX, textureY); // Box 15
		bodyModel[16] = new ModelRendererTurbo(this, 1, 841, textureX, textureY); // Box 18
		bodyModel[17] = new ModelRendererTurbo(this, 1, 822, textureX, textureY); // Box 19
		bodyModel[18] = new ModelRendererTurbo(this, 553, 880, textureX, textureY); // Box 20
		bodyModel[19] = new ModelRendererTurbo(this, 545, 880, textureX, textureY); // Box 26
		bodyModel[20] = new ModelRendererTurbo(this, 577, 880, textureX, textureY); // Box 27
		bodyModel[21] = new ModelRendererTurbo(this, 169, 880, textureX, textureY); // Box 28
		bodyModel[22] = new ModelRendererTurbo(this, 593, 880, textureX, textureY); // Box 30
		bodyModel[23] = new ModelRendererTurbo(this, 329, 927, textureX, textureY); // Box 37
		bodyModel[24] = new ModelRendererTurbo(this, 617, 880, textureX, textureY); // Box 38
		bodyModel[25] = new ModelRendererTurbo(this, 697, 880, textureX, textureY); // Box 39
		bodyModel[26] = new ModelRendererTurbo(this, 209, 841, textureX, textureY); // Box 40
		bodyModel[27] = new ModelRendererTurbo(this, 273, 841, textureX, textureY); // Box 41
		bodyModel[28] = new ModelRendererTurbo(this, 345, 841, textureX, textureY); // Box 42
		bodyModel[29] = new ModelRendererTurbo(this, 401, 841, textureX, textureY); // Box 43
		bodyModel[30] = new ModelRendererTurbo(this, 505, 841, textureX, textureY); // Box 46
		bodyModel[31] = new ModelRendererTurbo(this, 553, 841, textureX, textureY); // Box 47
		bodyModel[32] = new ModelRendererTurbo(this, 1, 902, textureX, textureY); // Box 48
		bodyModel[33] = new ModelRendererTurbo(this, 89, 902, textureX, textureY); // Box 49
		bodyModel[34] = new ModelRendererTurbo(this, 137, 902, textureX, textureY); // Box 50
		bodyModel[35] = new ModelRendererTurbo(this, 761, 880, textureX, textureY); // Box 52
		bodyModel[36] = new ModelRendererTurbo(this, 193, 902, textureX, textureY); // Box 53
		bodyModel[37] = new ModelRendererTurbo(this, 241, 902, textureX, textureY); // Box 54
		bodyModel[38] = new ModelRendererTurbo(this, 289, 902, textureX, textureY); // Box 55
		bodyModel[39] = new ModelRendererTurbo(this, 281, 822, textureX, textureY); // Box 112
		bodyModel[40] = new ModelRendererTurbo(this, 689, 880, textureX, textureY); // Box 118
		bodyModel[41] = new ModelRendererTurbo(this, 345, 822, textureX, textureY); // Box 137
		bodyModel[42] = new ModelRendererTurbo(this, 601, 841, textureX, textureY); // Box 139
		bodyModel[43] = new ModelRendererTurbo(this, 1113, 902, textureX, textureY); // Box 659
		bodyModel[44] = new ModelRendererTurbo(this, 1137, 902, textureX, textureY); // Box 660
		bodyModel[45] = new ModelRendererTurbo(this, 1161, 902, textureX, textureY); // Box 661
		bodyModel[46] = new ModelRendererTurbo(this, 369, 902, textureX, textureY); // Box 51
		bodyModel[47] = new ModelRendererTurbo(this, 1, 841, textureX, textureY); // Box 140
		bodyModel[48] = new ModelRendererTurbo(this, 121, 880, textureX, textureY); // Box 25
		bodyModel[49] = new ModelRendererTurbo(this, 417, 902, textureX, textureY); // Box 140
		bodyModel[50] = new ModelRendererTurbo(this, 641, 841, textureX, textureY); // Box 141
		bodyModel[51] = new ModelRendererTurbo(this, 377, 822, textureX, textureY); // Box 142
		bodyModel[52] = new ModelRendererTurbo(this, 1209, 902, textureX, textureY); // Box 143
		bodyModel[53] = new ModelRendererTurbo(this, 1233, 902, textureX, textureY); // Box 144
		bodyModel[54] = new ModelRendererTurbo(this, 425, 822, textureX, textureY); // Box 695
		bodyModel[55] = new ModelRendererTurbo(this, 505, 902, textureX, textureY); // Box 146
		bodyModel[56] = new ModelRendererTurbo(this, 73, 902, textureX, textureY); // Box 147
		bodyModel[57] = new ModelRendererTurbo(this, 121, 902, textureX, textureY); // Box 148
		bodyModel[58] = new ModelRendererTurbo(this, 89, 902, textureX, textureY); // Box 149
		bodyModel[59] = new ModelRendererTurbo(this, 625, 902, textureX, textureY); // Box 150
		bodyModel[60] = new ModelRendererTurbo(this, 681, 902, textureX, textureY); // Box 151
		bodyModel[61] = new ModelRendererTurbo(this, 137, 902, textureX, textureY); // Box 152
		bodyModel[62] = new ModelRendererTurbo(this, 721, 902, textureX, textureY); // Box 153
		bodyModel[63] = new ModelRendererTurbo(this, 777, 902, textureX, textureY); // Box 154
		bodyModel[64] = new ModelRendererTurbo(this, 825, 902, textureX, textureY); // Box 155
		bodyModel[65] = new ModelRendererTurbo(this, 889, 902, textureX, textureY); // Box 156
		bodyModel[66] = new ModelRendererTurbo(this, 9, 902, textureX, textureY); // Box 157
		bodyModel[67] = new ModelRendererTurbo(this, 177, 902, textureX, textureY); // Box 158
		bodyModel[68] = new ModelRendererTurbo(this, 225, 902, textureX, textureY); // Box 159
		bodyModel[69] = new ModelRendererTurbo(this, 209, 949, textureX, textureY); // Box 160
		bodyModel[70] = new ModelRendererTurbo(this, 713, 841, textureX, textureY); // Box 161
		bodyModel[71] = new ModelRendererTurbo(this, 273, 902, textureX, textureY); // Box 162
		bodyModel[72] = new ModelRendererTurbo(this, 241, 902, textureX, textureY); // Box 166
		bodyModel[73] = new ModelRendererTurbo(this, 353, 902, textureX, textureY); // Box 167
		bodyModel[74] = new ModelRendererTurbo(this, 369, 902, textureX, textureY); // Box 168
		bodyModel[75] = new ModelRendererTurbo(this, 1009, 902, textureX, textureY); // Box 169
		bodyModel[76] = new ModelRendererTurbo(this, 401, 902, textureX, textureY); // Box 170
		bodyModel[77] = new ModelRendererTurbo(this, 545, 949, textureX, textureY); // Box 177
		bodyModel[78] = new ModelRendererTurbo(this, 937, 902, textureX, textureY); // Box 178
		bodyModel[79] = new ModelRendererTurbo(this, 1017, 902, textureX, textureY); // Box 179
		bodyModel[80] = new ModelRendererTurbo(this, 1081, 902, textureX, textureY); // Box 181
		bodyModel[81] = new ModelRendererTurbo(this, 993, 841, textureX, textureY); // Box 182
		bodyModel[82] = new ModelRendererTurbo(this, 489, 902, textureX, textureY); // Box 183
		bodyModel[83] = new ModelRendererTurbo(this, 1057, 841, textureX, textureY); // Box 190
		bodyModel[84] = new ModelRendererTurbo(this, 73, 902, textureX, textureY); // Box 234
		bodyModel[85] = new ModelRendererTurbo(this, 1089, 841, textureX, textureY); // Box 235
		bodyModel[86] = new ModelRendererTurbo(this, 89, 841, textureX, textureY); // Box 236
		bodyModel[87] = new ModelRendererTurbo(this, 1, 413, textureX, textureY); // Box 217
		bodyModel[88] = new ModelRendererTurbo(this, 1, 387, textureX, textureY); // Box 239
		bodyModel[89] = new ModelRendererTurbo(this, 49, 387, textureX, textureY); // Box 240
		bodyModel[90] = new ModelRendererTurbo(this, 33, 387, textureX, textureY); // Box 241
		bodyModel[91] = new ModelRendererTurbo(this, 65, 387, textureX, textureY); // Box 242
		bodyModel[92] = new ModelRendererTurbo(this, 81, 387, textureX, textureY); // Box 243
		bodyModel[93] = new ModelRendererTurbo(this, 105, 387, textureX, textureY); // Box 244
		bodyModel[94] = new ModelRendererTurbo(this, 129, 387, textureX, textureY); // Box 245
		bodyModel[95] = new ModelRendererTurbo(this, 145, 387, textureX, textureY); // Box 246
		bodyModel[96] = new ModelRendererTurbo(this, 169, 387, textureX, textureY); // Box 247
		bodyModel[97] = new ModelRendererTurbo(this, 177, 387, textureX, textureY); // Box 248
		bodyModel[98] = new ModelRendererTurbo(this, 185, 387, textureX, textureY); // Box 250
		bodyModel[99] = new ModelRendererTurbo(this, 193, 387, textureX, textureY); // Box 251
		bodyModel[100] = new ModelRendererTurbo(this, 201, 387, textureX, textureY); // Box 252
		bodyModel[101] = new ModelRendererTurbo(this, 225, 387, textureX, textureY); // Box 253
		bodyModel[102] = new ModelRendererTurbo(this, 1, 387, textureX, textureY); // Box 962
		bodyModel[103] = new ModelRendererTurbo(this, 49, 387, textureX, textureY); // Box 964
		bodyModel[104] = new ModelRendererTurbo(this, 81, 387, textureX, textureY); // Box 966
		bodyModel[105] = new ModelRendererTurbo(this, 113, 413, textureX, textureY); // Box 268
		bodyModel[106] = new ModelRendererTurbo(this, 145, 413, textureX, textureY); // Box 269
		bodyModel[107] = new ModelRendererTurbo(this, 161, 413, textureX, textureY); // Box 922
		bodyModel[108] = new ModelRendererTurbo(this, 185, 413, textureX, textureY); // Box 923
		bodyModel[109] = new ModelRendererTurbo(this, 1, 413, textureX, textureY); // Box 924
		bodyModel[110] = new ModelRendererTurbo(this, 137, 413, textureX, textureY); // Box 925
		bodyModel[111] = new ModelRendererTurbo(this, 209, 413, textureX, textureY); // Box 926
		bodyModel[112] = new ModelRendererTurbo(this, 217, 413, textureX, textureY); // Box 927
		bodyModel[113] = new ModelRendererTurbo(this, 241, 413, textureX, textureY); // Box 928
		bodyModel[114] = new ModelRendererTurbo(this, 273, 413, textureX, textureY); // Box 929
		bodyModel[115] = new ModelRendererTurbo(this, 113, 413, textureX, textureY); // Box 930
		bodyModel[116] = new ModelRendererTurbo(this, 233, 413, textureX, textureY); // Box 931
		bodyModel[117] = new ModelRendererTurbo(this, 265, 413, textureX, textureY); // Box 932
		bodyModel[118] = new ModelRendererTurbo(this, 289, 413, textureX, textureY); // Box 933
		bodyModel[119] = new ModelRendererTurbo(this, 241, 413, textureX, textureY); // Box 934
		bodyModel[120] = new ModelRendererTurbo(this, 305, 413, textureX, textureY); // Box 935
		bodyModel[121] = new ModelRendererTurbo(this, 313, 413, textureX, textureY); // Box 936
		bodyModel[122] = new ModelRendererTurbo(this, 321, 413, textureX, textureY); // Box 937
		bodyModel[123] = new ModelRendererTurbo(this, 329, 413, textureX, textureY); // Box 938
		bodyModel[124] = new ModelRendererTurbo(this, 337, 413, textureX, textureY); // Box 939
		bodyModel[125] = new ModelRendererTurbo(this, 345, 413, textureX, textureY); // Box 940
		bodyModel[126] = new ModelRendererTurbo(this, 353, 413, textureX, textureY); // Box 941
		bodyModel[127] = new ModelRendererTurbo(this, 361, 413, textureX, textureY); // Box 942
		bodyModel[128] = new ModelRendererTurbo(this, 369, 413, textureX, textureY); // Box 943
		bodyModel[129] = new ModelRendererTurbo(this, 377, 413, textureX, textureY); // Box 945
		bodyModel[130] = new ModelRendererTurbo(this, 385, 413, textureX, textureY); // Box 947
		bodyModel[131] = new ModelRendererTurbo(this, 393, 413, textureX, textureY); // Box 948
		bodyModel[132] = new ModelRendererTurbo(this, 409, 413, textureX, textureY); // Box 949
		bodyModel[133] = new ModelRendererTurbo(this, 417, 413, textureX, textureY); // Box 950
		bodyModel[134] = new ModelRendererTurbo(this, 425, 413, textureX, textureY); // Box 951
		bodyModel[135] = new ModelRendererTurbo(this, 433, 413, textureX, textureY); // Box 952
		bodyModel[136] = new ModelRendererTurbo(this, 441, 413, textureX, textureY); // Box 953
		bodyModel[137] = new ModelRendererTurbo(this, 449, 413, textureX, textureY); // Box 954
		bodyModel[138] = new ModelRendererTurbo(this, 457, 413, textureX, textureY); // Box 955
		bodyModel[139] = new ModelRendererTurbo(this, 465, 413, textureX, textureY); // Box 956
		bodyModel[140] = new ModelRendererTurbo(this, 473, 413, textureX, textureY); // Box 957
		bodyModel[141] = new ModelRendererTurbo(this, 481, 413, textureX, textureY); // Box 958
		bodyModel[142] = new ModelRendererTurbo(this, 489, 413, textureX, textureY); // Box 959
		bodyModel[143] = new ModelRendererTurbo(this, 521, 413, textureX, textureY); // Box 355
		bodyModel[144] = new ModelRendererTurbo(this, 593, 413, textureX, textureY); // Box 357
		bodyModel[145] = new ModelRendererTurbo(this, 1, 374, textureX, textureY); // Box 259
		bodyModel[146] = new ModelRendererTurbo(this, 9, 374, textureX, textureY); // Box 260
		bodyModel[147] = new ModelRendererTurbo(this, 1, 351, textureX, textureY); // Box 262
		bodyModel[148] = new ModelRendererTurbo(this, 49, 351, textureX, textureY); // Box 255
		bodyModel[149] = new ModelRendererTurbo(this, 17, 374, textureX, textureY); // Box 256
		bodyModel[150] = new ModelRendererTurbo(this, 89, 351, textureX, textureY); // Box 257
		bodyModel[151] = new ModelRendererTurbo(this, 33, 351, textureX, textureY); // Box 258
		bodyModel[152] = new ModelRendererTurbo(this, 73, 351, textureX, textureY); // Box 213
		bodyModel[153] = new ModelRendererTurbo(this, 113, 351, textureX, textureY); // Box 214
		bodyModel[154] = new ModelRendererTurbo(this, 1, 351, textureX, textureY); // Box 233
		bodyModel[155] = new ModelRendererTurbo(this, 9, 351, textureX, textureY); // Box 234
		bodyModel[156] = new ModelRendererTurbo(this, 33, 351, textureX, textureY); // Box 235
		bodyModel[157] = new ModelRendererTurbo(this, 41, 351, textureX, textureY); // Box 236
		bodyModel[158] = new ModelRendererTurbo(this, 57, 351, textureX, textureY); // Box 237
		bodyModel[159] = new ModelRendererTurbo(this, 73, 351, textureX, textureY); // Box 238
		bodyModel[160] = new ModelRendererTurbo(this, 89, 351, textureX, textureY); // Box 239
		bodyModel[161] = new ModelRendererTurbo(this, 97, 351, textureX, textureY); // Box 240
		bodyModel[162] = new ModelRendererTurbo(this, 113, 351, textureX, textureY); // Box 241
		bodyModel[163] = new ModelRendererTurbo(this, 129, 351, textureX, textureY); // Box 242
		bodyModel[164] = new ModelRendererTurbo(this, 137, 351, textureX, textureY); // Box 243
		bodyModel[165] = new ModelRendererTurbo(this, 145, 351, textureX, textureY); // Box 244
		bodyModel[166] = new ModelRendererTurbo(this, 153, 351, textureX, textureY); // Box 248
		bodyModel[167] = new ModelRendererTurbo(this, 161, 351, textureX, textureY); // Box 249
		bodyModel[168] = new ModelRendererTurbo(this, 169, 351, textureX, textureY); // Box 250
		bodyModel[169] = new ModelRendererTurbo(this, 177, 351, textureX, textureY); // Box 251
		bodyModel[170] = new ModelRendererTurbo(this, 185, 351, textureX, textureY); // Box 252
		bodyModel[171] = new ModelRendererTurbo(this, 193, 351, textureX, textureY); // Box 253
		bodyModel[172] = new ModelRendererTurbo(this, 201, 351, textureX, textureY); // Box 254
		bodyModel[173] = new ModelRendererTurbo(this, 209, 351, textureX, textureY); // Box 255
		bodyModel[174] = new ModelRendererTurbo(this, 217, 351, textureX, textureY); // Box 256
		bodyModel[175] = new ModelRendererTurbo(this, 225, 351, textureX, textureY); // Box 257
		bodyModel[176] = new ModelRendererTurbo(this, 233, 351, textureX, textureY); // Box 258
		bodyModel[177] = new ModelRendererTurbo(this, 241, 351, textureX, textureY); // Box 259
		bodyModel[178] = new ModelRendererTurbo(this, 249, 351, textureX, textureY); // Box 260
		bodyModel[179] = new ModelRendererTurbo(this, 257, 351, textureX, textureY); // Box 261
		bodyModel[180] = new ModelRendererTurbo(this, 265, 351, textureX, textureY); // Box 262
		bodyModel[181] = new ModelRendererTurbo(this, 273, 351, textureX, textureY); // Box 263
		bodyModel[182] = new ModelRendererTurbo(this, 281, 351, textureX, textureY); // Box 265
		bodyModel[183] = new ModelRendererTurbo(this, 289, 351, textureX, textureY); // Box 266
		bodyModel[184] = new ModelRendererTurbo(this, 297, 351, textureX, textureY); // Box 267
		bodyModel[185] = new ModelRendererTurbo(this, 305, 351, textureX, textureY); // Box 268
		bodyModel[186] = new ModelRendererTurbo(this, 313, 351, textureX, textureY); // Box 269
		bodyModel[187] = new ModelRendererTurbo(this, 321, 351, textureX, textureY); // Box 270
		bodyModel[188] = new ModelRendererTurbo(this, 329, 351, textureX, textureY); // Box 271
		bodyModel[189] = new ModelRendererTurbo(this, 337, 351, textureX, textureY); // Box 272
		bodyModel[190] = new ModelRendererTurbo(this, 345, 351, textureX, textureY); // Box 273
		bodyModel[191] = new ModelRendererTurbo(this, 353, 351, textureX, textureY); // Box 274
		bodyModel[192] = new ModelRendererTurbo(this, 361, 351, textureX, textureY); // Box 275
		bodyModel[193] = new ModelRendererTurbo(this, 369, 351, textureX, textureY); // Box 276
		bodyModel[194] = new ModelRendererTurbo(this, 377, 351, textureX, textureY); // Box 277
		bodyModel[195] = new ModelRendererTurbo(this, 385, 351, textureX, textureY); // Box 278
		bodyModel[196] = new ModelRendererTurbo(this, 393, 351, textureX, textureY); // Box 279
		bodyModel[197] = new ModelRendererTurbo(this, 401, 351, textureX, textureY); // Box 280
		bodyModel[198] = new ModelRendererTurbo(this, 409, 351, textureX, textureY); // Box 281
		bodyModel[199] = new ModelRendererTurbo(this, 417, 351, textureX, textureY); // Box 282
		bodyModel[200] = new ModelRendererTurbo(this, 425, 351, textureX, textureY); // Box 283
		bodyModel[201] = new ModelRendererTurbo(this, 433, 351, textureX, textureY); // Box 284
		bodyModel[202] = new ModelRendererTurbo(this, 441, 351, textureX, textureY); // Box 285
		bodyModel[203] = new ModelRendererTurbo(this, 449, 351, textureX, textureY); // Box 286
		bodyModel[204] = new ModelRendererTurbo(this, 457, 351, textureX, textureY); // Box 287
		bodyModel[205] = new ModelRendererTurbo(this, 465, 351, textureX, textureY); // Box 288
		bodyModel[206] = new ModelRendererTurbo(this, 473, 351, textureX, textureY); // Box 289
		bodyModel[207] = new ModelRendererTurbo(this, 481, 351, textureX, textureY); // Box 290
		bodyModel[208] = new ModelRendererTurbo(this, 489, 351, textureX, textureY); // Box 318
		bodyModel[209] = new ModelRendererTurbo(this, 497, 351, textureX, textureY); // Box 319
		bodyModel[210] = new ModelRendererTurbo(this, 505, 351, textureX, textureY); // Box 320
		bodyModel[211] = new ModelRendererTurbo(this, 513, 351, textureX, textureY); // Box 321
		bodyModel[212] = new ModelRendererTurbo(this, 521, 351, textureX, textureY); // Box 322
		bodyModel[213] = new ModelRendererTurbo(this, 529, 351, textureX, textureY); // Box 323
		bodyModel[214] = new ModelRendererTurbo(this, 537, 351, textureX, textureY); // Box 324
		bodyModel[215] = new ModelRendererTurbo(this, 545, 351, textureX, textureY); // Box 325
		bodyModel[216] = new ModelRendererTurbo(this, 553, 351, textureX, textureY); // Box 326
		bodyModel[217] = new ModelRendererTurbo(this, 561, 351, textureX, textureY); // Box 327
		bodyModel[218] = new ModelRendererTurbo(this, 569, 351, textureX, textureY); // Box 328
		bodyModel[219] = new ModelRendererTurbo(this, 577, 351, textureX, textureY); // Box 329
		bodyModel[220] = new ModelRendererTurbo(this, 585, 351, textureX, textureY); // Box 330
		bodyModel[221] = new ModelRendererTurbo(this, 593, 351, textureX, textureY); // Box 331
		bodyModel[222] = new ModelRendererTurbo(this, 601, 351, textureX, textureY); // Box 332
		bodyModel[223] = new ModelRendererTurbo(this, 609, 351, textureX, textureY); // Box 333
		bodyModel[224] = new ModelRendererTurbo(this, 617, 351, textureX, textureY); // Box 334
		bodyModel[225] = new ModelRendererTurbo(this, 625, 351, textureX, textureY); // Box 340
		bodyModel[226] = new ModelRendererTurbo(this, 633, 351, textureX, textureY); // Box 341
		bodyModel[227] = new ModelRendererTurbo(this, 641, 351, textureX, textureY); // Box 342
		bodyModel[228] = new ModelRendererTurbo(this, 649, 351, textureX, textureY); // Box 343
		bodyModel[229] = new ModelRendererTurbo(this, 657, 351, textureX, textureY); // Box 344
		bodyModel[230] = new ModelRendererTurbo(this, 665, 351, textureX, textureY); // Box 345
		bodyModel[231] = new ModelRendererTurbo(this, 673, 351, textureX, textureY); // Box 346
		bodyModel[232] = new ModelRendererTurbo(this, 681, 351, textureX, textureY); // Box 347
		bodyModel[233] = new ModelRendererTurbo(this, 689, 351, textureX, textureY); // Box 348
		bodyModel[234] = new ModelRendererTurbo(this, 697, 351, textureX, textureY); // Box 349
		bodyModel[235] = new ModelRendererTurbo(this, 705, 351, textureX, textureY); // Box 350
		bodyModel[236] = new ModelRendererTurbo(this, 713, 351, textureX, textureY); // Box 351
		bodyModel[237] = new ModelRendererTurbo(this, 721, 351, textureX, textureY); // Box 352
		bodyModel[238] = new ModelRendererTurbo(this, 729, 351, textureX, textureY); // Box 353
		bodyModel[239] = new ModelRendererTurbo(this, 737, 351, textureX, textureY); // Box 354
		bodyModel[240] = new ModelRendererTurbo(this, 745, 351, textureX, textureY); // Box 355
		bodyModel[241] = new ModelRendererTurbo(this, 753, 351, textureX, textureY); // Box 356
		bodyModel[242] = new ModelRendererTurbo(this, 761, 351, textureX, textureY); // Box 387
		bodyModel[243] = new ModelRendererTurbo(this, 769, 351, textureX, textureY); // Box 388
		bodyModel[244] = new ModelRendererTurbo(this, 777, 351, textureX, textureY); // Box 390
		bodyModel[245] = new ModelRendererTurbo(this, 785, 351, textureX, textureY); // Box 391
		bodyModel[246] = new ModelRendererTurbo(this, 793, 351, textureX, textureY); // Box 392
		bodyModel[247] = new ModelRendererTurbo(this, 801, 351, textureX, textureY); // Box 393
		bodyModel[248] = new ModelRendererTurbo(this, 809, 351, textureX, textureY); // Box 394
		bodyModel[249] = new ModelRendererTurbo(this, 817, 351, textureX, textureY); // Box 395
		bodyModel[250] = new ModelRendererTurbo(this, 825, 351, textureX, textureY); // Box 396
		bodyModel[251] = new ModelRendererTurbo(this, 833, 351, textureX, textureY); // Box 397
		bodyModel[252] = new ModelRendererTurbo(this, 841, 351, textureX, textureY); // Box 398
		bodyModel[253] = new ModelRendererTurbo(this, 849, 351, textureX, textureY); // Box 399
		bodyModel[254] = new ModelRendererTurbo(this, 857, 351, textureX, textureY); // Box 400
		bodyModel[255] = new ModelRendererTurbo(this, 865, 351, textureX, textureY); // Box 401
		bodyModel[256] = new ModelRendererTurbo(this, 873, 351, textureX, textureY); // Box 402
		bodyModel[257] = new ModelRendererTurbo(this, 881, 351, textureX, textureY); // Box 403
		bodyModel[258] = new ModelRendererTurbo(this, 889, 351, textureX, textureY); // Box 404
		bodyModel[259] = new ModelRendererTurbo(this, 897, 351, textureX, textureY); // Box 405
		bodyModel[260] = new ModelRendererTurbo(this, 905, 351, textureX, textureY); // Box 406
		bodyModel[261] = new ModelRendererTurbo(this, 913, 351, textureX, textureY); // Box 407
		bodyModel[262] = new ModelRendererTurbo(this, 921, 351, textureX, textureY); // Box 408
		bodyModel[263] = new ModelRendererTurbo(this, 929, 351, textureX, textureY); // Box 409
		bodyModel[264] = new ModelRendererTurbo(this, 937, 351, textureX, textureY); // Box 410
		bodyModel[265] = new ModelRendererTurbo(this, 945, 351, textureX, textureY); // Box 411
		bodyModel[266] = new ModelRendererTurbo(this, 953, 351, textureX, textureY); // Box 412
		bodyModel[267] = new ModelRendererTurbo(this, 961, 351, textureX, textureY); // Box 413
		bodyModel[268] = new ModelRendererTurbo(this, 969, 351, textureX, textureY); // Box 414
		bodyModel[269] = new ModelRendererTurbo(this, 977, 351, textureX, textureY); // Box 415
		bodyModel[270] = new ModelRendererTurbo(this, 985, 351, textureX, textureY); // Box 416
		bodyModel[271] = new ModelRendererTurbo(this, 993, 351, textureX, textureY); // Box 417
		bodyModel[272] = new ModelRendererTurbo(this, 1001, 351, textureX, textureY); // Box 418
		bodyModel[273] = new ModelRendererTurbo(this, 1009, 351, textureX, textureY); // Box 419
		bodyModel[274] = new ModelRendererTurbo(this, 1017, 351, textureX, textureY); // Box 421
		bodyModel[275] = new ModelRendererTurbo(this, 1025, 351, textureX, textureY); // Box 422
		bodyModel[276] = new ModelRendererTurbo(this, 1033, 351, textureX, textureY); // Box 423
		bodyModel[277] = new ModelRendererTurbo(this, 1041, 351, textureX, textureY); // Box 424
		bodyModel[278] = new ModelRendererTurbo(this, 1049, 351, textureX, textureY); // Box 425
		bodyModel[279] = new ModelRendererTurbo(this, 1057, 351, textureX, textureY); // Box 426
		bodyModel[280] = new ModelRendererTurbo(this, 1065, 351, textureX, textureY); // Box 427
		bodyModel[281] = new ModelRendererTurbo(this, 1073, 351, textureX, textureY); // Box 428
		bodyModel[282] = new ModelRendererTurbo(this, 1081, 351, textureX, textureY); // Box 429
		bodyModel[283] = new ModelRendererTurbo(this, 1089, 351, textureX, textureY); // Box 430
		bodyModel[284] = new ModelRendererTurbo(this, 1097, 351, textureX, textureY); // Box 431
		bodyModel[285] = new ModelRendererTurbo(this, 1105, 351, textureX, textureY); // Box 432
		bodyModel[286] = new ModelRendererTurbo(this, 1113, 351, textureX, textureY); // Box 433
		bodyModel[287] = new ModelRendererTurbo(this, 1121, 351, textureX, textureY); // Box 434
		bodyModel[288] = new ModelRendererTurbo(this, 1129, 351, textureX, textureY); // Box 435
		bodyModel[289] = new ModelRendererTurbo(this, 1137, 351, textureX, textureY); // Box 436
		bodyModel[290] = new ModelRendererTurbo(this, 1145, 351, textureX, textureY); // Box 437
		bodyModel[291] = new ModelRendererTurbo(this, 1153, 351, textureX, textureY); // Box 438
		bodyModel[292] = new ModelRendererTurbo(this, 1161, 351, textureX, textureY); // Box 439
		bodyModel[293] = new ModelRendererTurbo(this, 1169, 351, textureX, textureY); // Box 440
		bodyModel[294] = new ModelRendererTurbo(this, 1177, 351, textureX, textureY); // Box 441
		bodyModel[295] = new ModelRendererTurbo(this, 1185, 351, textureX, textureY); // Box 442
		bodyModel[296] = new ModelRendererTurbo(this, 1193, 351, textureX, textureY); // Box 443
		bodyModel[297] = new ModelRendererTurbo(this, 1201, 351, textureX, textureY); // Box 444
		bodyModel[298] = new ModelRendererTurbo(this, 1209, 351, textureX, textureY); // Box 445
		bodyModel[299] = new ModelRendererTurbo(this, 1217, 351, textureX, textureY); // Box 446
		bodyModel[300] = new ModelRendererTurbo(this, 1225, 351, textureX, textureY); // Box 447
		bodyModel[301] = new ModelRendererTurbo(this, 1233, 351, textureX, textureY); // Box 448
		bodyModel[302] = new ModelRendererTurbo(this, 1241, 351, textureX, textureY); // Box 449
		bodyModel[303] = new ModelRendererTurbo(this, 1249, 351, textureX, textureY); // Box 450
		bodyModel[304] = new ModelRendererTurbo(this, 1257, 351, textureX, textureY); // Box 451
		bodyModel[305] = new ModelRendererTurbo(this, 1265, 351, textureX, textureY); // Box 452
		bodyModel[306] = new ModelRendererTurbo(this, 1273, 351, textureX, textureY); // Box 453
		bodyModel[307] = new ModelRendererTurbo(this, 1281, 351, textureX, textureY); // Box 454
		bodyModel[308] = new ModelRendererTurbo(this, 1289, 351, textureX, textureY); // Box 455
		bodyModel[309] = new ModelRendererTurbo(this, 1297, 351, textureX, textureY); // Box 456
		bodyModel[310] = new ModelRendererTurbo(this, 1305, 351, textureX, textureY); // Box 457
		bodyModel[311] = new ModelRendererTurbo(this, 1313, 351, textureX, textureY); // Box 458
		bodyModel[312] = new ModelRendererTurbo(this, 1321, 351, textureX, textureY); // Box 459
		bodyModel[313] = new ModelRendererTurbo(this, 1329, 351, textureX, textureY); // Box 460
		bodyModel[314] = new ModelRendererTurbo(this, 1337, 351, textureX, textureY); // Box 461
		bodyModel[315] = new ModelRendererTurbo(this, 1345, 351, textureX, textureY); // Box 462
		bodyModel[316] = new ModelRendererTurbo(this, 1353, 351, textureX, textureY); // Box 463
		bodyModel[317] = new ModelRendererTurbo(this, 1361, 351, textureX, textureY); // Box 464
		bodyModel[318] = new ModelRendererTurbo(this, 1369, 351, textureX, textureY); // Box 465
		bodyModel[319] = new ModelRendererTurbo(this, 1377, 351, textureX, textureY); // Box 466
		bodyModel[320] = new ModelRendererTurbo(this, 1385, 351, textureX, textureY); // Box 467
		bodyModel[321] = new ModelRendererTurbo(this, 1393, 351, textureX, textureY); // Box 468
		bodyModel[322] = new ModelRendererTurbo(this, 1401, 351, textureX, textureY); // Box 469
		bodyModel[323] = new ModelRendererTurbo(this, 1409, 351, textureX, textureY); // Box 470
		bodyModel[324] = new ModelRendererTurbo(this, 1417, 351, textureX, textureY); // Box 471
		bodyModel[325] = new ModelRendererTurbo(this, 1425, 351, textureX, textureY); // Box 472
		bodyModel[326] = new ModelRendererTurbo(this, 1433, 351, textureX, textureY); // Box 473
		bodyModel[327] = new ModelRendererTurbo(this, 1441, 351, textureX, textureY); // Box 474
		bodyModel[328] = new ModelRendererTurbo(this, 1449, 351, textureX, textureY); // Box 475
		bodyModel[329] = new ModelRendererTurbo(this, 1457, 351, textureX, textureY); // Box 476
		bodyModel[330] = new ModelRendererTurbo(this, 1465, 351, textureX, textureY); // Box 477
		bodyModel[331] = new ModelRendererTurbo(this, 1473, 351, textureX, textureY); // Box 478
		bodyModel[332] = new ModelRendererTurbo(this, 1481, 351, textureX, textureY); // Box 480
		bodyModel[333] = new ModelRendererTurbo(this, 1489, 351, textureX, textureY); // Box 481
		bodyModel[334] = new ModelRendererTurbo(this, 1497, 351, textureX, textureY); // Box 482
		bodyModel[335] = new ModelRendererTurbo(this, 1505, 351, textureX, textureY); // Box 483
		bodyModel[336] = new ModelRendererTurbo(this, 1513, 351, textureX, textureY); // Box 484
		bodyModel[337] = new ModelRendererTurbo(this, 1521, 351, textureX, textureY); // Box 485
		bodyModel[338] = new ModelRendererTurbo(this, 1529, 351, textureX, textureY); // Box 486
		bodyModel[339] = new ModelRendererTurbo(this, 1537, 351, textureX, textureY); // Box 487
		bodyModel[340] = new ModelRendererTurbo(this, 33, 374, textureX, textureY); // Box 488
		bodyModel[341] = new ModelRendererTurbo(this, 41, 374, textureX, textureY); // Box 489
		bodyModel[342] = new ModelRendererTurbo(this, 1545, 351, textureX, textureY); // Box 460
		bodyModel[343] = new ModelRendererTurbo(this, 1553, 351, textureX, textureY); // Box 461
		bodyModel[344] = new ModelRendererTurbo(this, 1561, 351, textureX, textureY); // Box 462
		bodyModel[345] = new ModelRendererTurbo(this, 1569, 351, textureX, textureY); // Box 463
		bodyModel[346] = new ModelRendererTurbo(this, 1577, 351, textureX, textureY); // Box 464
		bodyModel[347] = new ModelRendererTurbo(this, 1585, 351, textureX, textureY); // Box 465
		bodyModel[348] = new ModelRendererTurbo(this, 1593, 351, textureX, textureY); // Box 466
		bodyModel[349] = new ModelRendererTurbo(this, 1601, 351, textureX, textureY); // Box 467
		bodyModel[350] = new ModelRendererTurbo(this, 1609, 351, textureX, textureY); // Box 468
		bodyModel[351] = new ModelRendererTurbo(this, 1617, 351, textureX, textureY); // Box 469
		bodyModel[352] = new ModelRendererTurbo(this, 1625, 351, textureX, textureY); // Box 470
		bodyModel[353] = new ModelRendererTurbo(this, 1633, 351, textureX, textureY); // Box 471
		bodyModel[354] = new ModelRendererTurbo(this, 1641, 351, textureX, textureY); // Box 472
		bodyModel[355] = new ModelRendererTurbo(this, 1649, 351, textureX, textureY); // Box 473
		bodyModel[356] = new ModelRendererTurbo(this, 1657, 351, textureX, textureY); // Box 474
		bodyModel[357] = new ModelRendererTurbo(this, 1665, 351, textureX, textureY); // Box 475
		bodyModel[358] = new ModelRendererTurbo(this, 1673, 351, textureX, textureY); // Box 476
		bodyModel[359] = new ModelRendererTurbo(this, 1681, 351, textureX, textureY); // Box 477
		bodyModel[360] = new ModelRendererTurbo(this, 1689, 351, textureX, textureY); // Box 478
		bodyModel[361] = new ModelRendererTurbo(this, 1697, 351, textureX, textureY); // Box 479
		bodyModel[362] = new ModelRendererTurbo(this, 1705, 351, textureX, textureY); // Box 480
		bodyModel[363] = new ModelRendererTurbo(this, 1713, 351, textureX, textureY); // Box 481
		bodyModel[364] = new ModelRendererTurbo(this, 1721, 351, textureX, textureY); // Box 482
		bodyModel[365] = new ModelRendererTurbo(this, 1729, 351, textureX, textureY); // Box 483
		bodyModel[366] = new ModelRendererTurbo(this, 1737, 351, textureX, textureY); // Box 484
		bodyModel[367] = new ModelRendererTurbo(this, 1745, 351, textureX, textureY); // Box 485
		bodyModel[368] = new ModelRendererTurbo(this, 1753, 351, textureX, textureY); // Box 486
		bodyModel[369] = new ModelRendererTurbo(this, 1753, 351, textureX, textureY); // Box 487
		bodyModel[370] = new ModelRendererTurbo(this, 1769, 351, textureX, textureY); // Box 462
		bodyModel[371] = new ModelRendererTurbo(this, 1793, 351, textureX, textureY); // Box 463
		bodyModel[372] = new ModelRendererTurbo(this, 1809, 351, textureX, textureY); // Box 465
		bodyModel[373] = new ModelRendererTurbo(this, 1825, 351, textureX, textureY); // Box 466
		bodyModel[374] = new ModelRendererTurbo(this, 1769, 351, textureX, textureY); // Box 467
		bodyModel[375] = new ModelRendererTurbo(this, 1841, 351, textureX, textureY); // Box 468
		bodyModel[376] = new ModelRendererTurbo(this, 1849, 351, textureX, textureY); // Box 469
		bodyModel[377] = new ModelRendererTurbo(this, 1857, 351, textureX, textureY); // Box 470
		bodyModel[378] = new ModelRendererTurbo(this, 1865, 351, textureX, textureY); // Box 471
		bodyModel[379] = new ModelRendererTurbo(this, 1873, 351, textureX, textureY); // Box 472
		bodyModel[380] = new ModelRendererTurbo(this, 1881, 351, textureX, textureY); // Box 512
		bodyModel[381] = new ModelRendererTurbo(this, 1897, 351, textureX, textureY); // Box 513
		bodyModel[382] = new ModelRendererTurbo(this, 1921, 351, textureX, textureY); // Box 514
		bodyModel[383] = new ModelRendererTurbo(this, 1937, 351, textureX, textureY); // Box 515
		bodyModel[384] = new ModelRendererTurbo(this, 1953, 351, textureX, textureY); // Box 516
		bodyModel[385] = new ModelRendererTurbo(this, 1969, 351, textureX, textureY); // Box 517
		bodyModel[386] = new ModelRendererTurbo(this, 1993, 351, textureX, textureY); // Box 518
		bodyModel[387] = new ModelRendererTurbo(this, 49, 374, textureX, textureY); // Box 601
		bodyModel[388] = new ModelRendererTurbo(this, 65, 374, textureX, textureY); // Box 602
		bodyModel[389] = new ModelRendererTurbo(this, 81, 374, textureX, textureY); // Box 603
		bodyModel[390] = new ModelRendererTurbo(this, 89, 374, textureX, textureY); // Box 604
		bodyModel[391] = new ModelRendererTurbo(this, 97, 374, textureX, textureY); // Box 967
		bodyModel[392] = new ModelRendererTurbo(this, 137, 374, textureX, textureY); // Box 968
		bodyModel[393] = new ModelRendererTurbo(this, 153, 374, textureX, textureY); // Box 525
		bodyModel[394] = new ModelRendererTurbo(this, 193, 374, textureX, textureY); // Box 526
		bodyModel[395] = new ModelRendererTurbo(this, 209, 374, textureX, textureY); // Box 249
		bodyModel[396] = new ModelRendererTurbo(this, 233, 374, textureX, textureY); // Box 254
		bodyModel[397] = new ModelRendererTurbo(this, 257, 374, textureX, textureY); // Box 263
		bodyModel[398] = new ModelRendererTurbo(this, 273, 374, textureX, textureY); // Box 264
		bodyModel[399] = new ModelRendererTurbo(this, 281, 374, textureX, textureY); // Box 265
		bodyModel[400] = new ModelRendererTurbo(this, 145, 374, textureX, textureY); // Box 266

		bodyModel[0].addShapeBox(0F, 0F, 0F, 55, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-30F, -39F, -9F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 3, 7, 5, 0F,0F, 0F, -4F, 0F, -3F, -1F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 1
		bodyModel[1].setRotationPoint(-30F, -46F, -9F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 3, 4, 3, 0F,0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 2
		bodyModel[2].setRotationPoint(-27F, -43F, -9F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[3].setRotationPoint(-24F, -41F, -9F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 25, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[4].setRotationPoint(-21F, -41F, -9F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 17, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 5
		bodyModel[5].setRotationPoint(4F, -41F, -9F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 6
		bodyModel[6].setRotationPoint(21F, -41F, -9F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 25, 3, 2, 0F,0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 7
		bodyModel[7].setRotationPoint(-21F, -44F, -9F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 17, 4, 4, 0F,0F, -1F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -3F); // Box 8
		bodyModel[8].setRotationPoint(4F, -45F, -9F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 25, 5, 3, 0F,0F, -2F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -2F); // Box 9
		bodyModel[9].setRotationPoint(-21F, -48F, -9F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 17, 5, 6, 0F,0F, -1F, -1F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -3F, 0F, 0F, -5F); // Box 10
		bodyModel[10].setRotationPoint(4F, -49F, -8F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[11].setRotationPoint(-24F, -43F, -9F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 4, 4, 5, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 12
		bodyModel[12].setRotationPoint(21F, -45F, -8F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F,0F, -0.9999F, 0F, 0F, -0.9999F, 0F, 0F, 0F, 0F, -3.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9999F, 0F, -3.9999F, -0.9999F, 0F); // Box 13
		bodyModel[13].setRotationPoint(21F, -46F, -6F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 19, 20, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 14
		bodyModel[14].setRotationPoint(-49F, -39F, -9F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 19, 8, 9, 0F,0F, -1F, -4F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[15].setRotationPoint(-49F, -47F, -9F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 31, 20, 18, 0F,0F, 0F, 0F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -3F, 0F, -6F, -3F, 0F, 0F, 0F); // Box 18
		bodyModel[16].setRotationPoint(39F, -39F, -9F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 31, 9, 9, 0F,0F, -1.5F, -3F, 0F, -4F, -6F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 19
		bodyModel[17].setRotationPoint(39F, -46F, -9F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 4, 4, 6, 0F,0F, 0F, -3F, 0F, -3.5F, -5F, 0F, -3F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 20
		bodyModel[18].setRotationPoint(21F, -49F, -6F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 26
		bodyModel[19].setRotationPoint(-22F, -46F, -9F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 27
		bodyModel[20].setRotationPoint(-22F, -50F, -8F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -2F, 0F); // Box 28
		bodyModel[21].setRotationPoint(-22F, -53F, -6F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 8, 7, 3, 0F,0F, -6F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -6F, -2F, 0F, 0F, 0F, 0F, -6F, -2F, 0F, -6F, 0F, 0F, 0F, -2F); // Box 30
		bodyModel[22].setRotationPoint(-30F, -52F, -4F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 19, 5, 9, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, 0F, -2F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[23].setRotationPoint(-49F, -20F, -9F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 29, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 1F, 0F); // Box 38
		bodyModel[24].setRotationPoint(-30F, -19F, -9F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 27, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[25].setRotationPoint(-1F, -19F, -9F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 13, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9999F, 0F, -0.9999F, 0F, 0F, -0.9999F, 0F, 0F, 0F, -0.9999F); // Box 40
		bodyModel[26].setRotationPoint(26F, -19F, -9F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 15, 8, 18, 0F,-2F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, -1F, 0F, 1F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 1F, -2F); // Box 41
		bodyModel[27].setRotationPoint(24F, -19F, -9F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 7, 7, 18, 0F,0F, 0F, 0F, -6.9999F, 0F, 0F, -6.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9999F, 0F, -1.9999F, -1.9999F, 0F, -1.9999F, -1.9999F, 0F, 0F, -1.9999F); // Box 42
		bodyModel[28].setRotationPoint(39F, -19F, -9F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 31, 11, 18, 0F,0F, -6F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -6F, 0F, -7F, 0F, -2F, 0F, -9F, -4F, 0F, -9F, -4F, -7F, 0F, -2F); // Box 43
		bodyModel[29].setRotationPoint(39F, -25F, -9F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 7, 4, 14, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, -1F); // Box 46
		bodyModel[30].setRotationPoint(39F, -14F, -7F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 15, 3, 14, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 1F, -1F); // Box 47
		bodyModel[31].setRotationPoint(24F, -12F, -7F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 27, 8, 16, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, 2F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, -1F, 2F, -1F); // Box 48
		bodyModel[32].setRotationPoint(-1F, -18F, -8F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 6, 6, 16, 0F,0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 49
		bodyModel[33].setRotationPoint(-6F, -14F, -8F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 10, 3, 16, 0F,0F, -2F, -3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, -3F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -2F); // Box 50
		bodyModel[34].setRotationPoint(-16F, -15F, -8F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 10, 5, 3, 0F,0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, 0F); // Box 52
		bodyModel[35].setRotationPoint(-16F, -13F, -8F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 8, 2, 14, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, -1F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, -1F, -2F); // Box 53
		bodyModel[36].setRotationPoint(-14F, -8F, -7F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 6, 2, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 54
		bodyModel[37].setRotationPoint(-6F, -8F, -7F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 24, 3, 14, 0F,0F, -3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 2F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 2F, -1F); // Box 55
		bodyModel[38].setRotationPoint(0F, -11F, -7F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 24, 11, 7, 0F,0F, -8.9999F, 0F, 0F, 0F, -1.9999F, 0F, 0F, 0F, 0F, -8.9999F, 0F, 0F, 0F, -1.9999F, 0F, -10.9999F, -1.9999F, 0F, -8.9999F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[39].setRotationPoint(46F, -23F, -7F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 4, 4, 3, 0F,0F, 0F, 0F, 0F, -3.5F, -2F, 0F, -3F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, -3F, 0F); // Box 118
		bodyModel[40].setRotationPoint(21F, -49F, -3F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 17, 6, 2, 0F,0F, 0F, 0F, -2F, 1F, -1F, -2F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -6F, -1F, 0F, -6F, 0F, 0F, 0F, -1F); // Box 137
		bodyModel[41].setRotationPoint(46F, -18F, -5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 17, 2, 10, 0F,0F, -1.9999F, 0F, 0F, 4F, -0.9999F, 0F, 4F, -0.9999F, 0F, -1.9999F, 0F, 0F, 0F, 0F, 0.5F, -4.9999F, -1.9999F, 0.5F, -4.9999F, -1.9999F, 0F, 0F, 0F); // Box 139
		bodyModel[42].setRotationPoint(46F, -14F, -5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 659
		bodyModel[43].setRotationPoint(-21F, -55F, -2F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 6, 0, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 660
		bodyModel[44].setRotationPoint(-12F, -56F, -2F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 19, 6, 4, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Box 661
		bodyModel[45].setRotationPoint(3F, -55F, -2F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 5, 1, 16, 0F,0F, 0F, -0.9999F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -0.9999F, 0F, 1F, 0F, 0F, 9.9999999999989E-05F, 0F, 0F, 9.9999999999989E-05F, 0F, 0F, 1F, 0F); // Box 51
		bodyModel[46].setRotationPoint(-6F, -15F, -8F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		bodyModel[47].setRotationPoint(56F, -18F, -3.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[48].setRotationPoint(-22F, -43F, -9F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 27, 4, 16, 0F,0F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9999F, 0F, 0F, 0F, 0F, 0F, -3.9999F, 0F, 0F, -3.9999F, 0F, 0F, 0F, 0F); // Box 140
		bodyModel[49].setRotationPoint(-1F, -18F, -8F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 14, 20, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[50].setRotationPoint(25F, -39F, -9F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 14, 7, 9, 0F,0F, -1F, -3F, 0F, -1.5F, -3F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		bodyModel[51].setRotationPoint(25F, -46F, -9F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[52].setRotationPoint(-17F, -56F, -2F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 9, 1, 4, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 144
		bodyModel[53].setRotationPoint(-6F, -56F, -2F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 695
		bodyModel[54].setRotationPoint(39F, -56F, -2.5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 55, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[55].setRotationPoint(-30F, -39F, 8F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 3, 7, 5, 0F,0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F, -1F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[56].setRotationPoint(-30F, -46F, 4F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 3, 4, 3, 0F,0F, 0F, -1F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		bodyModel[57].setRotationPoint(-27F, -43F, 6F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[58].setRotationPoint(-24F, -41F, 8F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 25, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[59].setRotationPoint(-21F, -41F, 8F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 17, 2, 2, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
		bodyModel[60].setRotationPoint(4F, -41F, 7F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152
		bodyModel[61].setRotationPoint(21F, -41F, 7F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 25, 3, 2, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[62].setRotationPoint(-21F, -44F, 7F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 17, 4, 4, 0F,0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, -1F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 154
		bodyModel[63].setRotationPoint(4F, -45F, 5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 25, 5, 3, 0F,0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -1F, 0F, 0F, -2F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F); // Box 155
		bodyModel[64].setRotationPoint(-21F, -48F, 6F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 17, 5, 6, 0F,0F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -1F, -1F, 0F, 0F, -5F, 0F, -1F, -3F, 0F, -1F, -2F, 0F, 0F, 0F); // Box 156
		bodyModel[65].setRotationPoint(4F, -49F, 2F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[66].setRotationPoint(-24F, -43F, 8F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 4, 4, 5, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		bodyModel[67].setRotationPoint(21F, -45F, 3F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F,-3.9999F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9999F, 0F, 0F, -0.9999F, 0F, -3.9999F, -0.9999F, 0F, 0F, -0.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		bodyModel[68].setRotationPoint(21F, -46F, 0F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 19, 8, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		bodyModel[69].setRotationPoint(-49F, -47F, 0F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 31, 9, 9, 0F,0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -4F, -6F, 0F, -1.5F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -2F, 0F); // Box 161
		bodyModel[70].setRotationPoint(39F, -46F, 0F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 4, 4, 6, 0F,0F, 0F, -2F, 0F, -3F, 0F, 0F, -3.5F, -5F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 162
		bodyModel[71].setRotationPoint(21F, -49F, 0F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[72].setRotationPoint(-22F, -46F, 7F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[73].setRotationPoint(-22F, -50F, 5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 168
		bodyModel[74].setRotationPoint(-22F, -53F, 2F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 169
		bodyModel[75].setRotationPoint(-22F, -53F, -2F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 8, 7, 3, 0F,0F, -6F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -6F, 0F, 0F, 0F, -2F, 0F, -6F, 0F, 0F, -6F, -2F, 0F, 0F, 0F); // Box 170
		bodyModel[76].setRotationPoint(-30F, -52F, 1F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 19, 5, 9, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -2F, 0F, -1F, -3F); // Box 177
		bodyModel[77].setRotationPoint(-49F, -20F, 0F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 29, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, -2F); // Box 178
		bodyModel[78].setRotationPoint(-30F, -19F, 0F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 27, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, 0F, -1F); // Box 179
		bodyModel[79].setRotationPoint(-1F, -19F, 0F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 10, 5, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, -2F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, -2F); // Box 181
		bodyModel[80].setRotationPoint(-16F, -13F, 5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 24, 11, 7, 0F,0F, -8.9999F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9999F, 0F, -8.9999F, 0F, 0F, 0F, 0F, 0F, -8.9999F, 0F, 0F, -10.9999F, -1.9999F, 0F, 0F, -1.9999F); // Box 182
		bodyModel[81].setRotationPoint(46F, -23F, 0F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 4, 4, 3, 0F,-2F, 0F, 0F, 0F, -3F, 0F, 0F, -3.5F, -2F, 0F, 0F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, 0F); // Box 183
		bodyModel[82].setRotationPoint(21F, -49F, 0F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 17, 6, 2, 0F,0F, 0F, -1F, -2F, 1F, 0F, -2F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -6F, 0F, 0F, -6F, -1F, 0F, 0F, 0F); // Box 190
		bodyModel[83].setRotationPoint(46F, -18F, 3F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
		bodyModel[84].setRotationPoint(-22F, -43F, 8F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 14, 7, 9, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, -3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		bodyModel[85].setRotationPoint(25F, -46F, 0F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 236
		bodyModel[86].setRotationPoint(39F, -56F, 1.5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 46, 10, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		bodyModel[87].setRotationPoint(-30F, -30F, -8F);

		bodyModel[88].addShapeBox(0F, 1F, 0F, 10, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
		bodyModel[88].setRotationPoint(-18F, -34F, -5F);
		bodyModel[88].rotateAngleZ = -0.10471976F;

		bodyModel[89].addShapeBox(9F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		bodyModel[89].setRotationPoint(-18F, -34F, -5F);
		bodyModel[89].rotateAngleZ = -0.10471976F;

		bodyModel[90].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		bodyModel[90].setRotationPoint(-18F, -34F, -5F);
		bodyModel[90].rotateAngleZ = -0.10471976F;

		bodyModel[91].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		bodyModel[91].setRotationPoint(-18F, -34F, 4F);
		bodyModel[91].rotateAngleZ = -0.10471976F;

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		bodyModel[92].setRotationPoint(-18F, -34F, -5F);
		bodyModel[92].rotateAngleZ = -0.10471976F;

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 15, 10, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		bodyModel[93].setRotationPoint(-9F, -48F, -5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[94].setRotationPoint(-7F, -52F, -3F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 15, 8, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 246
		bodyModel[95].setRotationPoint(-10F, -47F, -4F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[96].setRotationPoint(-10.3F, -47.3F, -2F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[97].setRotationPoint(-10.3F, -47.3F, 1F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[98].setRotationPoint(-8F, -45F, -4F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 251
		bodyModel[99].setRotationPoint(-8F, -45F, 3F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[100].setRotationPoint(-15F, -33F, -6F);
		bodyModel[100].rotateAngleZ = 0.78539816F;

		bodyModel[101].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 253
		bodyModel[101].setRotationPoint(-15F, -33F, 5F);
		bodyModel[101].rotateAngleZ = 0.78539816F;

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 962
		bodyModel[102].setRotationPoint(-7.5F, -51.5F, -1.5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 964
		bodyModel[103].setRotationPoint(-7.5F, -50.5F, -1.5F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 966
		bodyModel[104].setRotationPoint(-7.5F, -49.5F, -1.5F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 7, 5, 7, 0F,-0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 268
		bodyModel[105].setRotationPoint(-3F, -49F, -3.5F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 5, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 269
		bodyModel[106].setRotationPoint(5F, -48F, -2.5F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 922
		bodyModel[107].setRotationPoint(-2.5F, -49.3F, -3F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 923
		bodyModel[108].setRotationPoint(-2.5F, -49.3F, 1F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 924
		bodyModel[109].setRotationPoint(-0.5F, -49.3F, -1F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.4F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Box 925
		bodyModel[110].setRotationPoint(1.5F, -49.3F, -1F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 926
		bodyModel[111].setRotationPoint(-2.5F, -49.3F, -1F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 5, 7, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 927
		bodyModel[112].setRotationPoint(-3F, -49F, -3.5F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 7, 1, 7, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 928
		bodyModel[113].setRotationPoint(-3F, -49.5F, -3.5F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 5, 7, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 929
		bodyModel[114].setRotationPoint(3F, -49F, -3.5F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 930
		bodyModel[115].setRotationPoint(2F, -48F, -3.3F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 931
		bodyModel[116].setRotationPoint(0F, -48F, -3.3F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 932
		bodyModel[117].setRotationPoint(-2F, -46F, -3.3F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 933
		bodyModel[118].setRotationPoint(5F, -48F, -0.5F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.2F, 0.6F, -0.1F, 0F, 0.6F, -0.1F, 0F, 0.6F, -0.1F, -0.2F, 0.6F, -0.1F, -0.2F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.2F, 0F, -0.1F); // Box 934
		bodyModel[119].setRotationPoint(4F, -48F, -0.5F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0.6F, -0.1F, -0.2F, 0.6F, -0.1F, -0.2F, 0.6F, -0.1F, 0F, 0.6F, -0.1F, 0F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 935
		bodyModel[120].setRotationPoint(10F, -48F, -0.5F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F); // Box 936
		bodyModel[121].setRotationPoint(6.5F, -47F, -3F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F); // Box 937
		bodyModel[122].setRotationPoint(8.5F, -47F, -3F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F); // Box 938
		bodyModel[123].setRotationPoint(5.5F, -47F, -3F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 939
		bodyModel[124].setRotationPoint(5.8F, -47F, -3.3F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 940
		bodyModel[125].setRotationPoint(-2.2F, -50.3F, -0.5F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 941
		bodyModel[126].setRotationPoint(2.2F, -50.3F, -0.5F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 942
		bodyModel[127].setRotationPoint(0F, -50.3F, -0.5F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 943
		bodyModel[128].setRotationPoint(0F, -50.3F, -0.5F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 945
		bodyModel[129].setRotationPoint(0F, -50.3F, 0.5F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 947
		bodyModel[130].setRotationPoint(0F, -50.6F, -0.5F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 948
		bodyModel[131].setRotationPoint(-3F, -49.8F, 0.5F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 949
		bodyModel[132].setRotationPoint(-2.2F, -50.6F, -0.5F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 950
		bodyModel[133].setRotationPoint(-2.2F, -50.3F, -0.5F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 951
		bodyModel[134].setRotationPoint(-2.2F, -50.3F, 0.5F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1.4F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -1.4F, -0.3F, -0.4F, 0.4F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.4F, 0.4F, -0.3F); // Box 952
		bodyModel[135].setRotationPoint(-4F, -49.8F, 0.5F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 953
		bodyModel[136].setRotationPoint(-4.3F, -48.4F, 0.5F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 954
		bodyModel[137].setRotationPoint(2.2F, -50.6F, -1.5F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 955
		bodyModel[138].setRotationPoint(2.2F, -50.3F, -0.5F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 956
		bodyModel[139].setRotationPoint(2.2F, -50.3F, -1.5F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.3F, -0.6F, 0.3F, -0.3F, -0.6F, 0.3F, -0.3F, -0.6F, 0.3F, -0.3F, -0.6F, 0.3F, -0.3F, 0F, 0.7F, -0.3F, 0F, 0.7F, -0.3F, 0F, 0.3F, -0.3F, 0F, 0.3F); // Box 957
		bodyModel[140].setRotationPoint(2.2F, -50.3F, -3.5F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 958
		bodyModel[141].setRotationPoint(2.2F, -49.3F, -4.5F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 959
		bodyModel[142].setRotationPoint(-4F, -44.8F, -4.5F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 25, 15, 8, 0F,0F, 0F, -1F, 1F, 0F, -3F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F); // Box 355
		bodyModel[143].setRotationPoint(-4F, -44.25F, -8F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 25, 15, 8, 0F,0F, 0F, 0F, 5F, 0F, 0F, 1F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 357
		bodyModel[144].setRotationPoint(-4F, -44.25F, 0F);

		bodyModel[145].addShapeBox(0F, -3F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 259
		bodyModel[145].setRotationPoint(-29F, -31F, -6F);
		bodyModel[145].rotateAngleZ = 0.15707963F;

		bodyModel[146].addShapeBox(0F, -3F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
		bodyModel[146].setRotationPoint(-29F, -31F, 4F);
		bodyModel[146].rotateAngleZ = 0.15707963F;

		bodyModel[147].addShapeBox(0F, 0F, 0F, 5, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 262
		bodyModel[147].setRotationPoint(-30F, -37F, -8F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 6, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 255
		bodyModel[148].setRotationPoint(-25F, -42F, -8F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 5, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 256
		bodyModel[149].setRotationPoint(-30F, -38F, -2F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 2, 16, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 257
		bodyModel[150].setRotationPoint(-25F, -44F, -8F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, 0.5F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 258
		bodyModel[151].setRotationPoint(-25F, -45F, -7F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 213
		bodyModel[152].setRotationPoint(-24.8F, -42.3F, -4F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, -0.4F, -3F, 0F, -0.4F, -3F, 0F, -0.4F, -3F, 0F, -0.4F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 214
		bodyModel[153].setRotationPoint(-24.8F, -43.3F, -4F);

		bodyModel[154].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F); // Box 233
		bodyModel[154].setRotationPoint(-24.7F, -41.1F, 2.7F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F); // Box 234
		bodyModel[155].setRotationPoint(-24.6F, -42.1F, -0.9F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F); // Box 235
		bodyModel[156].setRotationPoint(-24.6F, -42.1F, -0.9F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F); // Box 236
		bodyModel[157].setRotationPoint(-24.6F, -42.1F, -0.9F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 237
		bodyModel[158].setRotationPoint(-24.6F, -41.1F, -0.9F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 238
		bodyModel[159].setRotationPoint(-24.6F, -41.1F, -0.9F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 239
		bodyModel[160].setRotationPoint(-24.6F, -41.1F, 0.1F);

		bodyModel[161].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 240
		bodyModel[161].setRotationPoint(-24.7F, -41.1F, 0.1F);
		bodyModel[161].rotateAngleX = 5.49778714F;

		bodyModel[162].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 241
		bodyModel[162].setRotationPoint(-24.7F, -41.1F, 0.1F);

		bodyModel[163].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F); // Box 242
		bodyModel[163].setRotationPoint(-24.7F, -41.1F, 0.1F);

		bodyModel[164].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 243
		bodyModel[164].setRotationPoint(-24.6F, -41.1F, 0.1F);

		bodyModel[165].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 244
		bodyModel[165].setRotationPoint(-24.7F, -41.1F, 0.1F);
		bodyModel[165].rotateAngleX = 3.14159265F;

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 248
		bodyModel[166].setRotationPoint(-24.6F, -42.1F, 0.1F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 249
		bodyModel[167].setRotationPoint(-24.6F, -42.1F, 0.1F);

		bodyModel[168].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 250
		bodyModel[168].setRotationPoint(-24.7F, -41.1F, 0.1F);
		bodyModel[168].rotateAngleX = 4.71238898F;

		bodyModel[169].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 251
		bodyModel[169].setRotationPoint(-24.7F, -41.1F, 0.1F);
		bodyModel[169].rotateAngleX = 3.92699082F;

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F); // Box 252
		bodyModel[170].setRotationPoint(-24.6F, -42.1F, 1.7F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F); // Box 253
		bodyModel[171].setRotationPoint(-24.6F, -42.1F, 1.7F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F); // Box 254
		bodyModel[172].setRotationPoint(-24.6F, -42.1F, 1.7F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 255
		bodyModel[173].setRotationPoint(-24.6F, -42.1F, 2.7F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 256
		bodyModel[174].setRotationPoint(-24.6F, -42.1F, 2.7F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 257
		bodyModel[175].setRotationPoint(-24.6F, -41.1F, 2.7F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 258
		bodyModel[176].setRotationPoint(-24.6F, -41.1F, 1.7F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 259
		bodyModel[177].setRotationPoint(-24.6F, -41.1F, 1.7F);

		bodyModel[178].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 260
		bodyModel[178].setRotationPoint(-24.7F, -41.1F, 2.7F);
		bodyModel[178].rotateAngleX = 3.92699082F;

		bodyModel[179].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 261
		bodyModel[179].setRotationPoint(-24.7F, -41.1F, 2.7F);
		bodyModel[179].rotateAngleX = 4.71238898F;

		bodyModel[180].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 262
		bodyModel[180].setRotationPoint(-24.7F, -41.1F, 2.7F);
		bodyModel[180].rotateAngleX = 5.49778714F;

		bodyModel[181].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 263
		bodyModel[181].setRotationPoint(-24.7F, -41.1F, 2.7F);

		bodyModel[182].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 265
		bodyModel[182].setRotationPoint(-24.6F, -41.1F, 2.7F);

		bodyModel[183].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 266
		bodyModel[183].setRotationPoint(-24.7F, -41.1F, 2.7F);
		bodyModel[183].rotateAngleX = 0.78539816F;

		bodyModel[184].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 267
		bodyModel[184].setRotationPoint(-24.7F, -41.1F, 2.7F);
		bodyModel[184].rotateAngleX = 1.57079633F;

		bodyModel[185].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 268
		bodyModel[185].setRotationPoint(-24.7F, -41.1F, 2.7F);
		bodyModel[185].rotateAngleX = 2.35619449F;

		bodyModel[186].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 269
		bodyModel[186].setRotationPoint(-24.7F, -41.1F, 2.7F);
		bodyModel[186].rotateAngleX = 3.14159265F;

		bodyModel[187].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.45F, 0.3F, 0F, -0.45F, 0.3F, 0F, -0.45F, 0.3F, 0F, -0.45F, 0.3F, 0F, -0.45F, 0.3F, 0F, -0.45F, 0.3F, 0F, -0.45F, 0.3F, 0F, -0.45F, 0.3F); // Box 270
		bodyModel[187].setRotationPoint(-24.7F, -41.1F, 0.1F);
		bodyModel[187].rotateAngleX = -0.38397244F;

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F); // Box 271
		bodyModel[188].setRotationPoint(-24.7F, -41.9F, -0.9F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, -0.9F, 0F, -0.5F, -0.9F, 0F, -0.5F, -0.9F, 0F, -0.5F, -0.9F); // Box 272
		bodyModel[189].setRotationPoint(-24.7F, -41.7F, -0.9F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 273
		bodyModel[190].setRotationPoint(-24.6F, -38.5F, -3.7F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 274
		bodyModel[191].setRotationPoint(-24.6F, -38.5F, -3.7F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F); // Box 275
		bodyModel[192].setRotationPoint(-24.6F, -39.5F, -3.7F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F); // Box 276
		bodyModel[193].setRotationPoint(-24.6F, -39.5F, -3.7F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F); // Box 277
		bodyModel[194].setRotationPoint(-24.6F, -39.5F, -3.7F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 278
		bodyModel[195].setRotationPoint(-24.6F, -39.5F, -2.7F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 279
		bodyModel[196].setRotationPoint(-24.6F, -39.5F, -2.7F);

		bodyModel[197].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 280
		bodyModel[197].setRotationPoint(-24.7F, -38.5F, -2.7F);
		bodyModel[197].rotateAngleX = 0.78539816F;

		bodyModel[198].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 281
		bodyModel[198].setRotationPoint(-24.6F, -38.5F, -2.7F);

		bodyModel[199].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 282
		bodyModel[199].setRotationPoint(-24.7F, -38.5F, -2.7F);
		bodyModel[199].rotateAngleX = 5.49778714F;

		bodyModel[200].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 283
		bodyModel[200].setRotationPoint(-24.7F, -38.5F, -2.7F);

		bodyModel[201].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 284
		bodyModel[201].setRotationPoint(-24.7F, -38.5F, -2.7F);
		bodyModel[201].rotateAngleX = 1.57079633F;

		bodyModel[202].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 285
		bodyModel[202].setRotationPoint(-24.7F, -38.5F, -2.7F);
		bodyModel[202].rotateAngleX = 2.35619449F;

		bodyModel[203].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 286
		bodyModel[203].setRotationPoint(-24.7F, -38.5F, -2.7F);
		bodyModel[203].rotateAngleX = 3.14159265F;

		bodyModel[204].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 287
		bodyModel[204].setRotationPoint(-24.6F, -38.5F, -2.7F);

		bodyModel[205].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F); // Box 288
		bodyModel[205].setRotationPoint(-24.7F, -38.5F, -2.7F);
		bodyModel[205].rotateAngleX = -3.90953752F;

		bodyModel[206].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 289
		bodyModel[206].setRotationPoint(-24.7F, -38.5F, -2.7F);
		bodyModel[206].rotateAngleX = 4.71238898F;

		bodyModel[207].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 290
		bodyModel[207].setRotationPoint(-24.7F, -38.5F, -2.7F);
		bodyModel[207].rotateAngleX = 3.92699082F;

		bodyModel[208].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 318
		bodyModel[208].setRotationPoint(-24.8F, -41.1F, 4.8F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 319
		bodyModel[209].setRotationPoint(-24.8F, -41.1F, 4.8F);

		bodyModel[210].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 320
		bodyModel[210].setRotationPoint(-24.9F, -41.1F, 5.8F);
		bodyModel[210].rotateAngleX = 3.92699082F;

		bodyModel[211].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F); // Box 321
		bodyModel[211].setRotationPoint(-24.8F, -42.1F, 4.8F);

		bodyModel[212].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 322
		bodyModel[212].setRotationPoint(-24.9F, -41.1F, 5.8F);
		bodyModel[212].rotateAngleX = 3.14159265F;

		bodyModel[213].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F); // Box 323
		bodyModel[213].setRotationPoint(-24.8F, -42.1F, 4.8F);

		bodyModel[214].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 324
		bodyModel[214].setRotationPoint(-24.9F, -41.1F, 5.8F);
		bodyModel[214].rotateAngleX = 2.35619449F;

		bodyModel[215].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F); // Box 325
		bodyModel[215].setRotationPoint(-24.8F, -42.1F, 4.8F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 326
		bodyModel[216].setRotationPoint(-24.8F, -42.1F, 5.8F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 327
		bodyModel[217].setRotationPoint(-24.8F, -42.1F, 5.8F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 328
		bodyModel[218].setRotationPoint(-24.8F, -41.1F, 5.8F);

		bodyModel[219].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 329
		bodyModel[219].setRotationPoint(-24.9F, -41.1F, 5.8F);
		bodyModel[219].rotateAngleX = 5.49778714F;

		bodyModel[220].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 330
		bodyModel[220].setRotationPoint(-24.9F, -41.1F, 5.8F);

		bodyModel[221].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 331
		bodyModel[221].setRotationPoint(-24.9F, -41.1F, 5.8F);
		bodyModel[221].rotateAngleX = 0.78539816F;

		bodyModel[222].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 332
		bodyModel[222].setRotationPoint(-24.9F, -41.1F, 5.8F);
		bodyModel[222].rotateAngleX = 1.57079633F;

		bodyModel[223].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F); // Box 333
		bodyModel[223].setRotationPoint(-24.9F, -41.1F, 5.8F);
		bodyModel[223].rotateAngleX = -3.90953752F;

		bodyModel[224].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 334
		bodyModel[224].setRotationPoint(-24.8F, -41.1F, 5.8F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 340
		bodyModel[225].setRotationPoint(-24.8F, -44.6F, 4.4F);

		bodyModel[226].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F); // Box 341
		bodyModel[226].setRotationPoint(-24.9F, -43.6F, 4.4F);
		bodyModel[226].rotateAngleX = -1.57079633F;

		bodyModel[227].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 342
		bodyModel[227].setRotationPoint(-24.8F, -43.6F, 4.4F);

		bodyModel[228].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 343
		bodyModel[228].setRotationPoint(-24.9F, -43.6F, 4.4F);
		bodyModel[228].rotateAngleX = 5.49778714F;

		bodyModel[229].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 344
		bodyModel[229].setRotationPoint(-24.8F, -43.6F, 4.4F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 345
		bodyModel[230].setRotationPoint(-24.8F, -43.6F, 3.4F);

		bodyModel[231].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 346
		bodyModel[231].setRotationPoint(-24.9F, -43.6F, 4.4F);
		bodyModel[231].rotateAngleX = 4.71238898F;

		bodyModel[232].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 347
		bodyModel[232].setRotationPoint(-24.9F, -43.6F, 4.4F);
		bodyModel[232].rotateAngleX = 3.92699082F;

		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 348
		bodyModel[233].setRotationPoint(-24.8F, -43.6F, 3.4F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F); // Box 349
		bodyModel[234].setRotationPoint(-24.8F, -44.6F, 3.4F);

		bodyModel[235].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 350
		bodyModel[235].setRotationPoint(-24.9F, -43.6F, 4.4F);
		bodyModel[235].rotateAngleX = 3.14159265F;

		bodyModel[236].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F); // Box 351
		bodyModel[236].setRotationPoint(-24.8F, -44.6F, 3.4F);

		bodyModel[237].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 352
		bodyModel[237].setRotationPoint(-24.9F, -43.6F, 4.4F);
		bodyModel[237].rotateAngleX = 2.35619449F;

		bodyModel[238].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F); // Box 353
		bodyModel[238].setRotationPoint(-24.8F, -44.6F, 3.4F);

		bodyModel[239].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 354
		bodyModel[239].setRotationPoint(-24.9F, -43.6F, 4.4F);
		bodyModel[239].rotateAngleX = 1.57079633F;

		bodyModel[240].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 355
		bodyModel[240].setRotationPoint(-24.8F, -44.6F, 4.4F);

		bodyModel[241].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 356
		bodyModel[241].setRotationPoint(-24.9F, -43.6F, 4.4F);
		bodyModel[241].rotateAngleX = 0.78539816F;

		bodyModel[242].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 387
		bodyModel[242].setRotationPoint(-24.8F, -41.6F, -6.3F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F); // Box 388
		bodyModel[243].setRotationPoint(-24.8F, -41.6F, -7.3F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 390
		bodyModel[244].setRotationPoint(-24.8F, -41.6F, -6.3F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F); // Box 391
		bodyModel[245].setRotationPoint(-24.8F, -41.6F, -7.3F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 392
		bodyModel[246].setRotationPoint(-24.8F, -40.6F, -7.3F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 393
		bodyModel[247].setRotationPoint(-24.8F, -40.6F, -7.3F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 394
		bodyModel[248].setRotationPoint(-24.8F, -40.6F, -6.3F);

		bodyModel[249].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 395
		bodyModel[249].setRotationPoint(-24.8F, -41.2F, -6.3F);

		bodyModel[250].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, 0F, 0F, -0.48F, 0F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, 0F, 0F, -0.48F, 0F); // Box 396
		bodyModel[250].setRotationPoint(-24.9F, -41.2F, -6.3F);
		bodyModel[250].rotateAngleX = -1.29154365F;

		bodyModel[251].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 397
		bodyModel[251].setRotationPoint(-24.9F, -40.6F, -6.3F);
		bodyModel[251].rotateAngleX = 3.14159265F;

		bodyModel[252].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 398
		bodyModel[252].setRotationPoint(-24.9F, -40.6F, -6.3F);
		bodyModel[252].rotateAngleX = 3.92699082F;

		bodyModel[253].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 399
		bodyModel[253].setRotationPoint(-24.9F, -40.6F, -6.3F);
		bodyModel[253].rotateAngleX = 5.49778714F;

		bodyModel[254].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 400
		bodyModel[254].setRotationPoint(-24.9F, -40.6F, -6.3F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F); // Box 401
		bodyModel[255].setRotationPoint(-24.7F, -41.8F, -7.3F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F); // Box 402
		bodyModel[256].setRotationPoint(-24.6F, -42.1F, -3.7F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F); // Box 403
		bodyModel[257].setRotationPoint(-24.6F, -42.1F, -3.7F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F); // Box 404
		bodyModel[258].setRotationPoint(-24.6F, -42.1F, -3.7F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 405
		bodyModel[259].setRotationPoint(-24.6F, -42.1F, -2.7F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 406
		bodyModel[260].setRotationPoint(-24.6F, -42.1F, -2.7F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 407
		bodyModel[261].setRotationPoint(-24.6F, -41.1F, -2.7F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 408
		bodyModel[262].setRotationPoint(-24.6F, -41.1F, -3.7F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 409
		bodyModel[263].setRotationPoint(-24.6F, -41.1F, -3.7F);

		bodyModel[264].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 410
		bodyModel[264].setRotationPoint(-24.7F, -41.1F, -2.7F);
		bodyModel[264].rotateAngleX = 3.92699082F;

		bodyModel[265].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 411
		bodyModel[265].setRotationPoint(-24.7F, -41.1F, -2.7F);
		bodyModel[265].rotateAngleX = 3.14159265F;

		bodyModel[266].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 412
		bodyModel[266].setRotationPoint(-24.7F, -41.1F, -2.7F);
		bodyModel[266].rotateAngleX = 2.35619449F;

		bodyModel[267].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 413
		bodyModel[267].setRotationPoint(-24.7F, -41.1F, -2.7F);
		bodyModel[267].rotateAngleX = 1.57079633F;

		bodyModel[268].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 414
		bodyModel[268].setRotationPoint(-24.7F, -41.1F, -2.7F);
		bodyModel[268].rotateAngleX = 0.78539816F;

		bodyModel[269].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 415
		bodyModel[269].setRotationPoint(-24.7F, -41.1F, -2.7F);

		bodyModel[270].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 416
		bodyModel[270].setRotationPoint(-24.7F, -41.1F, -2.7F);
		bodyModel[270].rotateAngleX = 5.49778714F;

		bodyModel[271].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 417
		bodyModel[271].setRotationPoint(-24.7F, -41.1F, -2.7F);
		bodyModel[271].rotateAngleX = 4.71238898F;

		bodyModel[272].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 418
		bodyModel[272].setRotationPoint(-24.6F, -41.1F, -2.7F);

		bodyModel[273].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F); // Box 419
		bodyModel[273].setRotationPoint(-24.7F, -41.1F, -2.7F);
		bodyModel[273].rotateAngleX = -1.57079633F;

		bodyModel[274].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 421
		bodyModel[274].setRotationPoint(-24.6F, -39.1F, -1.1F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 422
		bodyModel[275].setRotationPoint(-24.6F, -39.1F, -1.1F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F); // Box 423
		bodyModel[276].setRotationPoint(-24.6F, -39.1F, -1.1F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F); // Box 424
		bodyModel[277].setRotationPoint(-24.6F, -39.1F, -1.1F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F); // Box 425
		bodyModel[278].setRotationPoint(-24.6F, -39.1F, -1.1F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F); // Box 426
		bodyModel[279].setRotationPoint(-24.6F, -39.1F, -1.1F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F); // Box 427
		bodyModel[280].setRotationPoint(-24.6F, -39.1F, -1.1F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 428
		bodyModel[281].setRotationPoint(-24.6F, -39.1F, -1.1F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 429
		bodyModel[282].setRotationPoint(-24.8F, -44.6F, -4.4F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 430
		bodyModel[283].setRotationPoint(-24.8F, -44.6F, -4.4F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F); // Box 431
		bodyModel[284].setRotationPoint(-24.8F, -44.6F, -5.4F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F); // Box 432
		bodyModel[285].setRotationPoint(-24.8F, -44.6F, -5.4F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F); // Box 433
		bodyModel[286].setRotationPoint(-24.8F, -44.6F, -5.4F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 434
		bodyModel[287].setRotationPoint(-24.8F, -43.6F, -5.4F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 435
		bodyModel[288].setRotationPoint(-24.8F, -43.6F, -5.4F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 436
		bodyModel[289].setRotationPoint(-24.8F, -43.6F, -4.4F);

		bodyModel[290].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 437
		bodyModel[290].setRotationPoint(-24.9F, -43.6F, -4.4F);
		bodyModel[290].rotateAngleX = 5.49778714F;

		bodyModel[291].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 438
		bodyModel[291].setRotationPoint(-24.9F, -43.6F, -4.4F);

		bodyModel[292].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 439
		bodyModel[292].setRotationPoint(-24.9F, -43.6F, -4.4F);
		bodyModel[292].rotateAngleX = 0.78539816F;

		bodyModel[293].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 440
		bodyModel[293].setRotationPoint(-24.9F, -43.6F, -4.4F);
		bodyModel[293].rotateAngleX = 1.57079633F;

		bodyModel[294].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 441
		bodyModel[294].setRotationPoint(-24.9F, -43.6F, -4.4F);
		bodyModel[294].rotateAngleX = 2.35619449F;

		bodyModel[295].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 442
		bodyModel[295].setRotationPoint(-24.9F, -43.6F, -4.4F);
		bodyModel[295].rotateAngleX = 3.14159265F;

		bodyModel[296].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 443
		bodyModel[296].setRotationPoint(-24.9F, -43.6F, -4.4F);
		bodyModel[296].rotateAngleX = 3.92699082F;

		bodyModel[297].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 444
		bodyModel[297].setRotationPoint(-24.9F, -43.6F, -4.4F);
		bodyModel[297].rotateAngleX = 4.71238898F;

		bodyModel[298].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 445
		bodyModel[298].setRotationPoint(-24.8F, -43.6F, -4.4F);

		bodyModel[299].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, 0F, 0F, -0.48F, 0F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, 0F, 0F, -0.48F, 0F); // Box 446
		bodyModel[299].setRotationPoint(-24.9F, -43.6F, -4.4F);
		bodyModel[299].rotateAngleX = -4.36332313F;

		bodyModel[300].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, 0F, 0F, -0.48F, 0F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, 0F, 0F, -0.48F, 0F); // Box 447
		bodyModel[300].setRotationPoint(-24.9F, -43.6F, -4.4F);
		bodyModel[300].rotateAngleX = -1.32645023F;

		bodyModel[301].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 448
		bodyModel[301].setRotationPoint(-24.8F, -38.5F, 3.5F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F); // Box 449
		bodyModel[302].setRotationPoint(-24.8F, -39F, 3F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F); // Box 450
		bodyModel[303].setRotationPoint(-24.8F, -39F, 3F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F); // Box 451
		bodyModel[304].setRotationPoint(-24.8F, -39F, 3F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F); // Box 452
		bodyModel[305].setRotationPoint(-24.8F, -39F, 3F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F); // Box 453
		bodyModel[306].setRotationPoint(-24.8F, -39F, 3F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 454
		bodyModel[307].setRotationPoint(-24.8F, -39F, 3F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 455
		bodyModel[308].setRotationPoint(-24.8F, -39F, 3F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 456
		bodyModel[309].setRotationPoint(-24.8F, -39F, 3F);

		bodyModel[310].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F); // Box 457
		bodyModel[310].setRotationPoint(-24.9F, -38.5F, 3.5F);
		bodyModel[310].rotateAngleX = -1.57079633F;

		bodyModel[311].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F); // Box 458
		bodyModel[311].setRotationPoint(-24.7F, -38.6F, 1.5F);
		bodyModel[311].rotateAngleX = -1.57079633F;

		bodyModel[312].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 459
		bodyModel[312].setRotationPoint(-24.6F, -38.6F, 1.5F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F); // Box 460
		bodyModel[313].setRotationPoint(-24.6F, -39.1F, 1F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F); // Box 461
		bodyModel[314].setRotationPoint(-24.6F, -39.1F, 1F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F); // Box 462
		bodyModel[315].setRotationPoint(-24.6F, -39.1F, 1F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 463
		bodyModel[316].setRotationPoint(-24.6F, -39.1F, 1F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 464
		bodyModel[317].setRotationPoint(-24.6F, -39.1F, 1F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 465
		bodyModel[318].setRotationPoint(-24.6F, -39.1F, 1F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F); // Box 466
		bodyModel[319].setRotationPoint(-24.6F, -39.1F, 1F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F); // Box 467
		bodyModel[320].setRotationPoint(-24.6F, -39.1F, 1F);

		bodyModel[321].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F); // Box 468
		bodyModel[321].setRotationPoint(-24.9F, -44F, 2F);
		bodyModel[321].rotateAngleX = 1.57079633F;

		bodyModel[322].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 469
		bodyModel[322].setRotationPoint(-24.8F, -44F, 2F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F); // Box 470
		bodyModel[323].setRotationPoint(-24.8F, -44.5F, 1.5F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F); // Box 471
		bodyModel[324].setRotationPoint(-24.8F, -44.5F, 1.5F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F); // Box 472
		bodyModel[325].setRotationPoint(-24.8F, -44.5F, 1.5F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 473
		bodyModel[326].setRotationPoint(-24.8F, -44.5F, 1.5F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 474
		bodyModel[327].setRotationPoint(-24.8F, -44.5F, 1.5F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 475
		bodyModel[328].setRotationPoint(-24.8F, -44.5F, 1.5F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F); // Box 476
		bodyModel[329].setRotationPoint(-24.8F, -44.5F, 1.5F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F); // Box 477
		bodyModel[330].setRotationPoint(-24.8F, -44.5F, 1.5F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F); // Box 478
		bodyModel[331].setRotationPoint(-24.8F, -39F, -6.5F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F); // Box 480
		bodyModel[332].setRotationPoint(-24.8F, -39F, -6.5F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F); // Box 481
		bodyModel[333].setRotationPoint(-24.8F, -39F, -6.5F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F); // Box 482
		bodyModel[334].setRotationPoint(-24.8F, -39F, -6.5F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F); // Box 483
		bodyModel[335].setRotationPoint(-24.8F, -39F, -6.5F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 484
		bodyModel[336].setRotationPoint(-24.8F, -39F, -6.5F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 485
		bodyModel[337].setRotationPoint(-24.8F, -39F, -6.5F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 486
		bodyModel[338].setRotationPoint(-24.8F, -39F, -6.5F);

		bodyModel[339].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, 0F, 0F, -0.48F, 0F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, 0F, 0F, -0.48F, 0F); // Box 487
		bodyModel[339].setRotationPoint(-24.9F, -38.5F, -6.6F);
		bodyModel[339].rotateAngleX = -0.38397244F;

		bodyModel[340].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 488
		bodyModel[340].setRotationPoint(-24.8F, -36.3F, -1.6F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 489
		bodyModel[341].setRotationPoint(-24.8F, -36.3F, 0.4F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F); // Box 460
		bodyModel[342].setRotationPoint(-24.8F, -39.5F, 4.8F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 461
		bodyModel[343].setRotationPoint(-24.8F, -39.5F, 5.8F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 462
		bodyModel[344].setRotationPoint(-24.8F, -38.5F, 5.8F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 463
		bodyModel[345].setRotationPoint(-24.8F, -38.5F, 4.8F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 464
		bodyModel[346].setRotationPoint(-24.8F, -38.5F, 4.8F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F); // Box 465
		bodyModel[347].setRotationPoint(-24.8F, -39.5F, 4.8F);

		bodyModel[348].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 466
		bodyModel[348].setRotationPoint(-24.9F, -38.5F, 5.8F);
		bodyModel[348].rotateAngleX = 3.14159265F;

		bodyModel[349].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F); // Box 467
		bodyModel[349].setRotationPoint(-24.8F, -39.5F, 4.8F);

		bodyModel[350].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F); // Box 468
		bodyModel[350].setRotationPoint(-24.9F, -38.5F, 5.8F);
		bodyModel[350].rotateAngleX = -3.90953752F;

		bodyModel[351].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 469
		bodyModel[351].setRotationPoint(-24.8F, -38.5F, 5.8F);

		bodyModel[352].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 470
		bodyModel[352].setRotationPoint(-24.9F, -38.5F, 5.8F);
		bodyModel[352].rotateAngleX = 3.92699082F;

		bodyModel[353].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 471
		bodyModel[353].setRotationPoint(-24.9F, -38.5F, 5.8F);
		bodyModel[353].rotateAngleX = 5.49778714F;

		bodyModel[354].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 472
		bodyModel[354].setRotationPoint(-24.9F, -38.5F, 5.8F);

		bodyModel[355].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 473
		bodyModel[355].setRotationPoint(-24.9F, -38.5F, 5.8F);
		bodyModel[355].rotateAngleX = 0.78539816F;

		bodyModel[356].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 474
		bodyModel[356].setRotationPoint(-24.9F, -38.5F, 5.8F);
		bodyModel[356].rotateAngleX = 1.57079633F;

		bodyModel[357].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 475
		bodyModel[357].setRotationPoint(-24.9F, -38.5F, 5.8F);
		bodyModel[357].rotateAngleX = 2.35619449F;

		bodyModel[358].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 476
		bodyModel[358].setRotationPoint(-24.8F, -39.5F, 5.8F);

		bodyModel[359].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F); // Box 477
		bodyModel[359].setRotationPoint(-24.9F, -43.5F, -2F);
		bodyModel[359].rotateAngleX = 1.57079633F;

		bodyModel[360].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 478
		bodyModel[360].setRotationPoint(-24.8F, -44F, -2F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 479
		bodyModel[361].setRotationPoint(-24.8F, -44.5F, -2.5F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 480
		bodyModel[362].setRotationPoint(-24.8F, -44.5F, -2.5F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F); // Box 481
		bodyModel[363].setRotationPoint(-24.8F, -44.5F, -2.5F);

		bodyModel[364].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F); // Box 482
		bodyModel[364].setRotationPoint(-24.8F, -44.5F, -2.5F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F); // Box 483
		bodyModel[365].setRotationPoint(-24.8F, -44.5F, -2.5F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F); // Box 484
		bodyModel[366].setRotationPoint(-24.8F, -44.5F, -2.5F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F); // Box 485
		bodyModel[367].setRotationPoint(-24.8F, -44.5F, -2.5F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 486
		bodyModel[368].setRotationPoint(-24.8F, -44.5F, -2.5F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 487
		bodyModel[369].setRotationPoint(-24.8F, -39.8F, -4F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 462
		bodyModel[370].setRotationPoint(-30F, -46F, -4F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, -2F, 0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 2F, 2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 463
		bodyModel[371].setRotationPoint(-27F, -46F, -7F);

		bodyModel[372].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 465
		bodyModel[372].setRotationPoint(-24.5F, -46.5F, -1F);

		bodyModel[373].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, 0F); // Box 466
		bodyModel[373].setRotationPoint(-24.5F, -47F, -1F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 467
		bodyModel[374].setRotationPoint(-23F, -47.25F, -1F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 468
		bodyModel[375].setRotationPoint(-23F, -46.25F, -1F);

		bodyModel[376].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.6F, -0.25F, 0F); // Box 469
		bodyModel[376].setRotationPoint(-23.1F, -45.75F, -1F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.7F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.5F, 0F, -0.7F, -0.5F, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 470
		bodyModel[377].setRotationPoint(-24.5F, -48F, -1F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.7F, -0.5F, -0.3F, -0.2F, -0.5F, -0.3F, -0.2F, -0.3F, 0F, -0.7F, -0.3F, 0F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 471
		bodyModel[378].setRotationPoint(-24.5F, -48F, 0F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.1F); // Box 472
		bodyModel[379].setRotationPoint(-22.7F, -47F, -1F);

		bodyModel[380].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,-2F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 512
		bodyModel[380].setRotationPoint(-30F, -46F, -7F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1F, 0F, -1.5F); // Box 513
		bodyModel[381].setRotationPoint(-28F, -44F, -8F);

		bodyModel[382].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 514
		bodyModel[382].setRotationPoint(-27F, -42F, -8F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 2F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 2F, 2F, 0F, 0F, 2F, 0F); // Box 515
		bodyModel[383].setRotationPoint(-27F, -46F, 4F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 516
		bodyModel[384].setRotationPoint(-30F, -46F, 4F);

		bodyModel[385].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 517
		bodyModel[385].setRotationPoint(-28F, -44F, 6F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 518
		bodyModel[386].setRotationPoint(-27F, -42F, 7F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 601
		bodyModel[387].setRotationPoint(-20F, -42.3F, -8F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 602
		bodyModel[388].setRotationPoint(-19.5F, -40.3F, -8.5F);

		bodyModel[389].addShapeBox(-1F, -2F, 0F, 1, 2, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 603
		bodyModel[389].setRotationPoint(-18.5F, -40.3F, -7.7F);
		bodyModel[389].rotateAngleZ = 0.36651914F;

		bodyModel[390].addShapeBox(-1F, -2F, 0F, 1, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 604
		bodyModel[390].setRotationPoint(-18.5F, -40.3F, -7.2F);
		bodyModel[390].rotateAngleZ = 0.36651914F;

		bodyModel[391].addShapeBox(0F, 0F, 0F, 15, 8, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 967
		bodyModel[391].setRotationPoint(-18.5F, -37.3F, -8.5F);

		bodyModel[392].addShapeBox(0F, 0F, 0F, 1, 8, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 968
		bodyModel[392].setRotationPoint(-19.5F, -37.3F, -8.5F);

		bodyModel[393].addShapeBox(0F, 0F, 0F, 15, 8, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 525
		bodyModel[393].setRotationPoint(-18.5F, -37.3F, 5.5F);

		bodyModel[394].addShapeBox(0F, 0F, 0F, 1, 8, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 526
		bodyModel[394].setRotationPoint(-19.5F, -37.3F, 5.5F);

		bodyModel[395].addShapeBox(0F, 0F, 0F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[395].setRotationPoint(-24F, -32F, -2F);

		bodyModel[396].addShapeBox(0F, 0F, 0F, 7, 3, 3, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 254
		bodyModel[396].setRotationPoint(-24F, -33F, -1.5F);

		bodyModel[397].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 263
		bodyModel[397].setRotationPoint(-22.5F, -36F, -1F);

		bodyModel[398].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 264
		bodyModel[398].setRotationPoint(-22F, -40F, -0.5F);

		bodyModel[399].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 265
		bodyModel[399].setRotationPoint(-22F, -42F, -0.5F);

		bodyModel[400].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 266
		bodyModel[400].setRotationPoint(-21.7F, -42.1F, -0.5F);
	}

	private void initnoseModel_1()
	{
		noseModel[0] = new ModelRendererTurbo(this, 81, 949, textureX, textureY); // Box 16
		noseModel[1] = new ModelRendererTurbo(this, 153, 949, textureX, textureY); // Box 17
		noseModel[2] = new ModelRendererTurbo(this, 65, 927, textureX, textureY); // Box 21
		noseModel[3] = new ModelRendererTurbo(this, 113, 927, textureX, textureY); // Box 22
		noseModel[4] = new ModelRendererTurbo(this, 545, 928, textureX, textureY); // Box 31
		noseModel[5] = new ModelRendererTurbo(this, 513, 928, textureX, textureY); // Box 32
		noseModel[6] = new ModelRendererTurbo(this, 169, 927, textureX, textureY); // Box 33
		noseModel[7] = new ModelRendererTurbo(this, 201, 927, textureX, textureY); // Box 34
		noseModel[8] = new ModelRendererTurbo(this, 225, 927, textureX, textureY); // Box 35
		noseModel[9] = new ModelRendererTurbo(this, 281, 927, textureX, textureY); // Box 36
		noseModel[10] = new ModelRendererTurbo(this, 1, 988, textureX, textureY); // Box 122
		noseModel[11] = new ModelRendererTurbo(this, 33, 988, textureX, textureY); // Box 123
		noseModel[12] = new ModelRendererTurbo(this, 65, 988, textureX, textureY); // Box 124
		noseModel[13] = new ModelRendererTurbo(this, 97, 988, textureX, textureY); // Box 125
		noseModel[14] = new ModelRendererTurbo(this, 129, 988, textureX, textureY); // Box 126
		noseModel[15] = new ModelRendererTurbo(this, 153, 988, textureX, textureY); // Box 127
		noseModel[16] = new ModelRendererTurbo(this, 49, 927, textureX, textureY); // Import CO_51
		noseModel[17] = new ModelRendererTurbo(this, 377, 927, textureX, textureY); // Import CO_52
		noseModel[18] = new ModelRendererTurbo(this, 105, 927, textureX, textureY); // Import CO_53
		noseModel[19] = new ModelRendererTurbo(this, 409, 927, textureX, textureY); // Import CO_54
		noseModel[20] = new ModelRendererTurbo(this, 1, 927, textureX, textureY); // Import CO_55
		noseModel[21] = new ModelRendererTurbo(this, 441, 927, textureX, textureY); // Import CO_57
		noseModel[22] = new ModelRendererTurbo(this, 465, 927, textureX, textureY); // Import CO_58
		noseModel[23] = new ModelRendererTurbo(this, 161, 927, textureX, textureY); // Import CO_59
		noseModel[24] = new ModelRendererTurbo(this, 193, 927, textureX, textureY); // Import CO_60
		noseModel[25] = new ModelRendererTurbo(this, 273, 927, textureX, textureY); // Import CO_61
		noseModel[26] = new ModelRendererTurbo(this, 321, 927, textureX, textureY); // Import CO_62
		noseModel[27] = new ModelRendererTurbo(this, 225, 927, textureX, textureY); // Import CO_63
		noseModel[28] = new ModelRendererTurbo(this, 497, 927, textureX, textureY); // Import CO_56
		noseModel[29] = new ModelRendererTurbo(this, 273, 949, textureX, textureY); // Box 163
		noseModel[30] = new ModelRendererTurbo(this, 321, 949, textureX, textureY); // Box 164
		noseModel[31] = new ModelRendererTurbo(this, 377, 949, textureX, textureY); // Box 171
		noseModel[32] = new ModelRendererTurbo(this, 409, 949, textureX, textureY); // Box 172
		noseModel[33] = new ModelRendererTurbo(this, 65, 949, textureX, textureY); // Box 173
		noseModel[34] = new ModelRendererTurbo(this, 129, 949, textureX, textureY); // Box 174
		noseModel[35] = new ModelRendererTurbo(this, 441, 949, textureX, textureY); // Box 175
		noseModel[36] = new ModelRendererTurbo(this, 497, 949, textureX, textureY); // Box 176
		noseModel[37] = new ModelRendererTurbo(this, 1, 1006, textureX, textureY); // Box 184
		noseModel[38] = new ModelRendererTurbo(this, 33, 1006, textureX, textureY); // Box 185
		noseModel[39] = new ModelRendererTurbo(this, 65, 1006, textureX, textureY); // Box 186
		noseModel[40] = new ModelRendererTurbo(this, 97, 1006, textureX, textureY); // Box 187
		noseModel[41] = new ModelRendererTurbo(this, 129, 1006, textureX, textureY); // Box 188
		noseModel[42] = new ModelRendererTurbo(this, 153, 1006, textureX, textureY); // Box 189
		noseModel[43] = new ModelRendererTurbo(this, 257, 949, textureX, textureY); // Box 206
		noseModel[44] = new ModelRendererTurbo(this, 593, 949, textureX, textureY); // Box 207
		noseModel[45] = new ModelRendererTurbo(this, 1, 949, textureX, textureY); // Box 208
		noseModel[46] = new ModelRendererTurbo(this, 625, 949, textureX, textureY); // Box 209
		noseModel[47] = new ModelRendererTurbo(this, 89, 949, textureX, textureY); // Box 210
		noseModel[48] = new ModelRendererTurbo(this, 657, 949, textureX, textureY); // Box 211
		noseModel[49] = new ModelRendererTurbo(this, 681, 949, textureX, textureY); // Box 212
		noseModel[50] = new ModelRendererTurbo(this, 153, 949, textureX, textureY); // Box 213
		noseModel[51] = new ModelRendererTurbo(this, 313, 949, textureX, textureY); // Box 214
		noseModel[52] = new ModelRendererTurbo(this, 369, 949, textureX, textureY); // Box 215
		noseModel[53] = new ModelRendererTurbo(this, 401, 949, textureX, textureY); // Box 216
		noseModel[54] = new ModelRendererTurbo(this, 209, 949, textureX, textureY); // Box 217
		noseModel[55] = new ModelRendererTurbo(this, 713, 949, textureX, textureY); // Box 233

		noseModel[0].addShapeBox(0F, 0F, 0F, 14, 19, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 16
		noseModel[0].setRotationPoint(-63F, -39F, -9F);

		noseModel[1].addShapeBox(0F, 0F, 0F, 16, 15, 18, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -1F); // Box 17
		noseModel[1].setRotationPoint(-79F, -39F, -9F);

		noseModel[2].addShapeBox(0F, 0F, 0F, 14, 8, 9, 0F,0F, -2F, -4F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		noseModel[2].setRotationPoint(-63F, -47F, -9F);

		noseModel[3].addShapeBox(0F, 0F, 0F, 16, 8, 9, 0F,0F, -2F, -4F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 22
		noseModel[3].setRotationPoint(-79F, -46F, -9F);

		noseModel[4].addShapeBox(0F, 0F, 0F, 6, 10, 8, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F); // Box 31
		noseModel[4].setRotationPoint(-85F, -38F, -8F);

		noseModel[5].addShapeBox(0F, 0F, 0F, 6, 10, 8, 0F,0F, -3F, -3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 32
		noseModel[5].setRotationPoint(-85F, -45F, -8F);

		noseModel[6].addShapeBox(0F, 0F, 0F, 6, 9, 6, 0F,0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -1F, -3F, 0F, -3F, -4F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, -3F, -1F); // Box 33
		noseModel[6].setRotationPoint(-85F, -29F, -8F);

		noseModel[7].addShapeBox(0F, 0F, 0F, 6, 5, 5, 0F,0F, 0F, -1F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, -4F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 34
		noseModel[7].setRotationPoint(-85F, -24F, -5F);

		noseModel[8].addShapeBox(0F, 0F, 0F, 16, 12, 9, 0F,0F, 0F, -1F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -3F, -4F, 0F, -1F, -3F, 0F, 1F, 0F, 0F, -2F, 0F); // Box 35
		noseModel[8].setRotationPoint(-79F, -29F, -9F);

		noseModel[9].addShapeBox(0F, 0F, 0F, 14, 8, 9, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, 0F, -3F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 36
		noseModel[9].setRotationPoint(-63F, -24F, -9F);

		noseModel[10].addShapeBox(0F, 0F, 0F, 7, 9, 8, 0F,0F, -4F, -4F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		noseModel[10].setRotationPoint(-92F, -44F, -8F);

		noseModel[11].addShapeBox(0F, 0F, 0F, 6, 7, 6, 0F,0F, -4F, -4F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		noseModel[11].setRotationPoint(-98F, -42F, -6F);

		noseModel[12].addShapeBox(0F, 0F, 0F, 7, 9, 8, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -4F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 124
		noseModel[12].setRotationPoint(-92F, -35F, -8F);

		noseModel[13].addShapeBox(0F, 0F, 0F, 6, 6, 6, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -4F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 125
		noseModel[13].setRotationPoint(-98F, -35F, -6F);

		noseModel[14].addShapeBox(0F, 0F, 0F, 5, 4, 3, 0F,0F, -3.9999F, -2.9999F, 0F, -0.9999F, -0.9999F, 0F, 0F, 0F, 0F, -3.9999F, 0F, 0F, 0F, -2.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		noseModel[14].setRotationPoint(-103F, -39F, -3F);

		noseModel[15].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F,0F, 0F, -2.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.9999F, -2.9999F, 0F, 0F, -0.9999F, 0F, 0F, 0F, 0F, -2.9999F, 0F); // Box 127
		noseModel[15].setRotationPoint(-103F, -35F, -3F);

		noseModel[16].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F,-1F, -0.3F, -1.2F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 1.2F, -1F, 0F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.2F); // Import CO_51
		noseModel[16].setRotationPoint(-79F, -37.5F, -10F);

		noseModel[17].addShapeBox(0F, 0F, 0F, 13, 1, 2, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import CO_52
		noseModel[17].setRotationPoint(-70F, -37.5F, -10F);

		noseModel[18].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Import CO_53
		noseModel[18].setRotationPoint(-61.5F, -36.5F, -11F);

		noseModel[19].addShapeBox(0F, 0F, 0F, 13, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import CO_54
		noseModel[19].setRotationPoint(-70F, -36.5F, -9.5F);

		noseModel[20].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1.2F, 0F, 0F, -1.03333333F, 0F, 0F, 0.93333333F, 0F, 0F, 1.2F, -1F, 0F, -1.2F, 0F, 0F, -1.03333333F, 0F, 0F, 0.93333333F, 0F, 0F, 1.2F); // Import CO_55
		noseModel[20].setRotationPoint(-79F, -36.5F, -10F);

		noseModel[21].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F,-1F, 0F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.2F, -1F, -0.3F, -1.2F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 1.2F); // Import CO_57
		noseModel[21].setRotationPoint(-79F, -35.5F, -10F);

		noseModel[22].addShapeBox(0F, 0F, 0F, 13, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import CO_58
		noseModel[22].setRotationPoint(-70F, -35.5F, -10F);

		noseModel[23].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Import CO_59
		noseModel[23].setRotationPoint(-65F, -36.5F, -11F);

		noseModel[24].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Import CO_60
		noseModel[24].setRotationPoint(-68.5F, -36.5F, -11F);

		noseModel[25].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Import CO_61
		noseModel[25].setRotationPoint(-72F, -36.5F, -11F);

		noseModel[26].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Import CO_62
		noseModel[26].setRotationPoint(-75.5F, -36.5F, -10.8F);

		noseModel[27].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Import CO_63
		noseModel[27].setRotationPoint(-78F, -36.5F, -10.2F);

		noseModel[28].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F,-1F, 0F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.2F, -1F, 0F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.2F); // Import CO_56
		noseModel[28].setRotationPoint(-79F, -36.5F, -9.5F);

		noseModel[29].addShapeBox(0F, 0F, 0F, 14, 8, 9, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -4F, 0F, -2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		noseModel[29].setRotationPoint(-63F, -47F, 0F);

		noseModel[30].addShapeBox(0F, 0F, 0F, 16, 8, 9, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -4F, 0F, -2F, -4F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F); // Box 164
		noseModel[30].setRotationPoint(-79F, -46F, 0F);

		noseModel[31].addShapeBox(0F, 0F, 0F, 6, 10, 8, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, -2F); // Box 171
		noseModel[31].setRotationPoint(-85F, -38F, 0F);

		noseModel[32].addShapeBox(0F, 0F, 0F, 6, 10, 8, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 172
		noseModel[32].setRotationPoint(-85F, -45F, 0F);

		noseModel[33].addShapeBox(0F, 0F, 0F, 6, 9, 6, 0F,0F, -1F, -3F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -3F, -1F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, -3F, -4F); // Box 173
		noseModel[33].setRotationPoint(-85F, -29F, 2F);

		noseModel[34].addShapeBox(0F, 0F, 0F, 6, 5, 5, 0F,0F, -2F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -4F, -1F); // Box 174
		noseModel[34].setRotationPoint(-85F, -24F, 0F);

		noseModel[35].addShapeBox(0F, 0F, 0F, 16, 12, 9, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, -1F, -3F, 0F, -3F, -4F); // Box 175
		noseModel[35].setRotationPoint(-79F, -29F, 0F);

		noseModel[36].addShapeBox(0F, 0F, 0F, 14, 8, 9, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -3F, 0F, -2F, -3F); // Box 176
		noseModel[36].setRotationPoint(-63F, -24F, 0F);

		noseModel[37].addShapeBox(0F, 0F, 0F, 7, 9, 8, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, -4F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 184
		noseModel[37].setRotationPoint(-92F, -44F, 0F);

		noseModel[38].addShapeBox(0F, 0F, 0F, 6, 7, 6, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -4F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 185
		noseModel[38].setRotationPoint(-98F, -42F, 0F);

		noseModel[39].addShapeBox(0F, 0F, 0F, 7, 9, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -4F, -4F); // Box 186
		noseModel[39].setRotationPoint(-92F, -35F, 0F);

		noseModel[40].addShapeBox(0F, 0F, 0F, 6, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -3F, -4F); // Box 187
		noseModel[40].setRotationPoint(-98F, -35F, 0F);

		noseModel[41].addShapeBox(0F, 0F, 0F, 5, 4, 3, 0F,0F, -3.9999F, 0F, 0F, 0F, 0F, 0F, -0.9999F, -0.9999F, 0F, -3.9999F, -2.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.9999F); // Box 188
		noseModel[41].setRotationPoint(-103F, -39F, 0F);

		noseModel[42].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.9999F, 0F, -2.9999F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9999F, 0F, -2.9999F, -2.9999F); // Box 189
		noseModel[42].setRotationPoint(-103F, -35F, 0F);

		noseModel[43].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F,0F, 0F, 1.2F, 0F, 0F, 0F, 0F, -0.3F, 0F, -1F, -0.3F, -1.2F, 0F, 0F, 1.2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.2F); // Box 206
		noseModel[43].setRotationPoint(-79F, -37.5F, 8F);

		noseModel[44].addShapeBox(0F, 0F, 0F, 13, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		noseModel[44].setRotationPoint(-70F, -37.5F, 8F);

		noseModel[45].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 208
		noseModel[45].setRotationPoint(-61.5F, -36.5F, 10F);

		noseModel[46].addShapeBox(0F, 0F, 0F, 13, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 209
		noseModel[46].setRotationPoint(-70F, -36.5F, 7.5F);

		noseModel[47].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 1.2F, 0F, 0F, 0.93333333F, 0F, 0F, -1.03333333F, -1F, 0F, -1.2F, 0F, 0F, 1.2F, 0F, 0F, 0.93333333F, 0F, 0F, -1.03333333F, -1F, 0F, -1.2F); // Box 210
		noseModel[47].setRotationPoint(-79F, -36.5F, 8F);

		noseModel[48].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F,0F, 0F, 1.2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.2F, 0F, 0F, 1.2F, 0F, 0F, 0F, 0F, -0.3F, 0F, -1F, -0.3F, -1.2F); // Box 211
		noseModel[48].setRotationPoint(-79F, -35.5F, 8F);

		noseModel[49].addShapeBox(0F, 0F, 0F, 13, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 212
		noseModel[49].setRotationPoint(-70F, -35.5F, 8F);

		noseModel[50].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 213
		noseModel[50].setRotationPoint(-65F, -36.5F, 10F);

		noseModel[51].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 214
		noseModel[51].setRotationPoint(-68.5F, -36.5F, 10F);

		noseModel[52].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 215
		noseModel[52].setRotationPoint(-72F, -36.5F, 10F);

		noseModel[53].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 216
		noseModel[53].setRotationPoint(-75.5F, -36.5F, 9.8F);

		noseModel[54].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 217
		noseModel[54].setRotationPoint(-78F, -36.5F, 9.2F);

		noseModel[55].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F,0F, 0F, 1.2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.2F, 0F, 0F, 1.2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.2F); // Box 233
		noseModel[55].setRotationPoint(-79F, -36.5F, 7.5F);
	}

	private void inittailModel_1()
	{
		tailModel[0] = new ModelRendererTurbo(this, 105, 841, textureX, textureY); // Box 23
		tailModel[1] = new ModelRendererTurbo(this, 89, 822, textureX, textureY); // Box 24
		tailModel[2] = new ModelRendererTurbo(this, 185, 822, textureX, textureY); // Box 44
		tailModel[3] = new ModelRendererTurbo(this, 41, 681, textureX, textureY); // Box 390
		tailModel[4] = new ModelRendererTurbo(this, 97, 681, textureX, textureY); // Box 391
		tailModel[5] = new ModelRendererTurbo(this, 121, 681, textureX, textureY); // Box 392
		tailModel[6] = new ModelRendererTurbo(this, 153, 681, textureX, textureY); // Box 393
		tailModel[7] = new ModelRendererTurbo(this, 257, 681, textureX, textureY); // Box 163
		tailModel[8] = new ModelRendererTurbo(this, 297, 681, textureX, textureY); // Box 164
		tailModel[9] = new ModelRendererTurbo(this, 337, 681, textureX, textureY); // Box 165
		tailModel[10] = new ModelRendererTurbo(this, 377, 681, textureX, textureY); // Box 166
		tailModel[11] = new ModelRendererTurbo(this, 409, 681, textureX, textureY); // Box 167
		tailModel[12] = new ModelRendererTurbo(this, 1, 724, textureX, textureY); // Import TA_11
		tailModel[13] = new ModelRendererTurbo(this, 1, 724, textureX, textureY); // Import TA_12
		tailModel[14] = new ModelRendererTurbo(this, 81, 724, textureX, textureY); // Import FPL_2
		tailModel[15] = new ModelRendererTurbo(this, 801, 841, textureX, textureY); // Box 165
		tailModel[16] = new ModelRendererTurbo(this, 897, 841, textureX, textureY); // Box 180
		tailModel[17] = new ModelRendererTurbo(this, 1, 773, textureX, textureY); // Box 229
		tailModel[18] = new ModelRendererTurbo(this, 1, 773, textureX, textureY); // Box 230
		tailModel[19] = new ModelRendererTurbo(this, 81, 773, textureX, textureY); // Box 232

		tailModel[0].addShapeBox(0F, 0F, 0F, 39, 14, 12, 0F,0F, -2F, -1F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, -3F, -4F, 0F, -3F, -4F, 0F, 0F, 0F); // Box 23
		tailModel[0].setRotationPoint(70F, -39F, -6F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 39, 7, 5, 0F,0F, -1.9999F, -1.9999F, 0F, -4.9999F, -2.9999F, 0F, -4.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9999F, -2.9999F, 0F, -1.9999F, 0F, 0F, 0F, 0F); // Box 24
		tailModel[1].setRotationPoint(70F, -44F, -5F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 39, 7, 6, 0F,0F, -2.9999F, 0F, 0F, 0F, -3.9999F, 0F, 0F, 0F, 0F, -2.9999F, 0F, 0F, -1.9999F, -0.9999F, 0F, -4.9999F, -5.5F, 0F, -4.9999F, 0F, 0F, 0F, 0F); // Box 44
		tailModel[2].setRotationPoint(70F, -28F, -6F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 23, 38, 4, 0F,-14F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, -1F, -14F, 0F, -1.5F, 4F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, -1.5F); // Box 390
		tailModel[3].setRotationPoint(86F, -77F, -2F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 5, 3, 4, 0F,0F, 0F, -1.5F, -2F, -1F, -1.5F, -2F, -1F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1F); // Box 391
		tailModel[4].setRotationPoint(109F, -80F, -2F);

		tailModel[5].addShapeBox(0F, 0F, 0F, 9, 3, 4, 0F,-2F, -1F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -2F, -1F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.5F); // Box 392
		tailModel[5].setRotationPoint(100F, -80F, -2F);

		tailModel[6].addShapeBox(0F, 0F, 0F, 49, 6, 2, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 393
		tailModel[6].setRotationPoint(60F, -46F, -1F);

		tailModel[7].addShapeBox(0F, 0F, 0F, 13, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 163
		tailModel[7].setRotationPoint(109F, -39F, -2F);

		tailModel[8].addShapeBox(0F, 0F, 0F, 13, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, -1F, 0F, -1.5F, 0F, 0F, 0F); // Box 164
		tailModel[8].setRotationPoint(109F, -36F, -2F);

		tailModel[9].addShapeBox(0F, 0F, 0F, 12, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1.5F, -3F, 0F, -1.5F, 0F, 0F, 0F); // Box 165
		tailModel[9].setRotationPoint(109F, -33F, -2F);

		tailModel[10].addShapeBox(0F, 0F, 0F, 9, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -1.5F, -5F, 0F, -1.5F, 0F, 0F, 0F); // Box 166
		tailModel[10].setRotationPoint(109F, -30F, -2F);

		tailModel[11].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, -1.49999F, 0F, 0F, -1.49999F, 0F, 0F, 0F, 0F, 0F, -1.49999F, 0F, -1.9999F, -1.49999F, 0F, -1.9999F, -1.49999F, 0F, 0F, -1.49999F); // Box 167
		tailModel[11].setRotationPoint(109F, -28F, -2F);

		tailModel[12].addShapeBox(0F, 0F, 0F, 11, 2, 4, 0F,-2F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Import TA_11
		tailModel[12].setRotationPoint(82F, -39F, -51F);

		tailModel[13].addShapeBox(0F, 0F, 0F, 16, 2, 46, 0F,-5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -0.5F, 0F, -5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -0.5F, 0F); // Import TA_12
		tailModel[13].setRotationPoint(77F, -39F, -47F);

		tailModel[14].addShapeBox(0F, -1F, 0F, 6, 2, 4, 0F,0F, 0F, -0.5F, -2.5F, -0.5F, -1.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2.5F, -0.5F, -1.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Import FPL_2
		tailModel[14].setRotationPoint(93F, -38F, -51F);

		tailModel[15].addShapeBox(0F, 0F, 0F, 39, 7, 5, 0F,0F, 0F, 0F, 0F, -4.9999F, 0F, 0F, -4.9999F, -2.9999F, 0F, -1.9999F, -1.9999F, 0F, 0F, 0F, 0F, -1.9999F, 0F, 0F, -1.9999F, -2.9999F, 0F, 0F, 0F); // Box 165
		tailModel[15].setRotationPoint(70F, -44F, 0F);

		tailModel[16].addShapeBox(0F, 0F, 0F, 39, 7, 6, 0F,0F, -2.9999F, 0F, 0F, 0F, 0F, 0F, 0F, -3.9999F, 0F, -2.9999F, 0F, 0F, 0F, 0F, 0F, -4.9999F, 0F, 0F, -4.9999F, -5.5F, 0F, -1.9999F, -0.9999F); // Box 180
		tailModel[16].setRotationPoint(70F, -28F, 0F);

		tailModel[17].addShapeBox(0F, 0F, 0F, 11, 2, 4, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, -0.5F, -1F); // Box 229
		tailModel[17].setRotationPoint(82F, -39F, 47F);

		tailModel[18].addShapeBox(0F, 0F, 0F, 16, 2, 46, 0F,2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -0.5F, 0F, 2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -0.5F, 0F); // Box 230
		tailModel[18].setRotationPoint(77F, -39F, 1F);

		tailModel[19].addShapeBox(0F, -1F, 0F, 6, 2, 4, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -2.5F, -0.5F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -2.5F, -0.5F, -1.5F, 0F, 0F, -0.5F); // Box 232
		tailModel[19].setRotationPoint(93F, -38F, 47F);
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 1, 489, textureX, textureY); // Import LW_01
		leftWingModel[1] = new ModelRendererTurbo(this, 1, 489, textureX, textureY); // Import LW_02
		leftWingModel[2] = new ModelRendererTurbo(this, 41, 489, textureX, textureY); // Import LW_03
		leftWingModel[3] = new ModelRendererTurbo(this, 193, 489, textureX, textureY); // Import LW_04
		leftWingModel[4] = new ModelRendererTurbo(this, 105, 489, textureX, textureY); // Import LW_05
		leftWingModel[5] = new ModelRendererTurbo(this, 129, 489, textureX, textureY); // Import LW_07
		leftWingModel[6] = new ModelRendererTurbo(this, 329, 489, textureX, textureY); // Import LW_08
		leftWingModel[7] = new ModelRendererTurbo(this, 385, 489, textureX, textureY); // Import LW_09
		leftWingModel[8] = new ModelRendererTurbo(this, 217, 489, textureX, textureY); // Import LW_10
		leftWingModel[9] = new ModelRendererTurbo(this, 537, 489, textureX, textureY); // Import LW_11
		leftWingModel[10] = new ModelRendererTurbo(this, 1, 489, textureX, textureY); // Import LW_12
		leftWingModel[11] = new ModelRendererTurbo(this, 73, 489, textureX, textureY); // Import LW_13
		leftWingModel[12] = new ModelRendererTurbo(this, 241, 489, textureX, textureY); // Import LW_14
		leftWingModel[13] = new ModelRendererTurbo(this, 585, 489, textureX, textureY); // Box 167
		leftWingModel[14] = new ModelRendererTurbo(this, 0, 345, textureX, textureY); // Box 612
		leftWingModel[15] = new ModelRendererTurbo(this, 0, 345, textureX, textureY); // Box 613
		leftWingModel[16] = new ModelRendererTurbo(this, 0, 345, textureX, textureY); // Box 614
		leftWingModel[17] = new ModelRendererTurbo(this, 0, 345, textureX, textureY); // Box 555
		leftWingModel[18] = new ModelRendererTurbo(this, 0, 345, textureX, textureY); // Box 556
		leftWingModel[19] = new ModelRendererTurbo(this, 0, 345, textureX, textureY); // Box 557
		leftWingModel[20] = new ModelRendererTurbo(this, 0, 345, textureX, textureY); // Box 558
		leftWingModel[21] = new ModelRendererTurbo(this, 0, 345, textureX, textureY); // Box 559
		leftWingModel[22] = new ModelRendererTurbo(this, 0, 345, textureX, textureY); // Box 560
		leftWingModel[23] = new ModelRendererTurbo(this, 249, 489, textureX, textureY); // Box 561
		leftWingModel[24] = new ModelRendererTurbo(this, 329, 489, textureX, textureY); // Box 562
		leftWingModel[25] = new ModelRendererTurbo(this, 481, 489, textureX, textureY); // Box 563
		leftWingModel[26] = new ModelRendererTurbo(this, 625, 489, textureX, textureY); // Box 564
		leftWingModel[27] = new ModelRendererTurbo(this, 649, 489, textureX, textureY); // Box 565
		leftWingModel[28] = new ModelRendererTurbo(this, 673, 489, textureX, textureY); // Box 566
		leftWingModel[29] = new ModelRendererTurbo(this, 697, 489, textureX, textureY); // Box 567
		leftWingModel[30] = new ModelRendererTurbo(this, 721, 489, textureX, textureY); // Box 568
		leftWingModel[31] = new ModelRendererTurbo(this, 745, 489, textureX, textureY); // Box 569
		leftWingModel[32] = new ModelRendererTurbo(this, 769, 489, textureX, textureY); // Box 570
		leftWingModel[33] = new ModelRendererTurbo(this, 793, 489, textureX, textureY); // Box 571
		leftWingModel[34] = new ModelRendererTurbo(this, 817, 489, textureX, textureY); // Box 572
		leftWingModel[35] = new ModelRendererTurbo(this, 841, 489, textureX, textureY); // Box 573
		leftWingModel[36] = new ModelRendererTurbo(this, 865, 489, textureX, textureY); // Box 574
		leftWingModel[37] = new ModelRendererTurbo(this, 889, 489, textureX, textureY); // Box 575
		leftWingModel[38] = new ModelRendererTurbo(this, 137, 489, textureX, textureY); // Box 576
		leftWingModel[39] = new ModelRendererTurbo(this, 217, 489, textureX, textureY); // Box 577
		leftWingModel[40] = new ModelRendererTurbo(this, 265, 489, textureX, textureY); // Box 578
		leftWingModel[41] = new ModelRendererTurbo(this, 473, 489, textureX, textureY); // Box 579
		leftWingModel[42] = new ModelRendererTurbo(this, 273, 489, textureX, textureY); // Box 613

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 8, 7, 20, 0F,-2F, 0.5F, 0F, 6F, 2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -4.5F, 0F, 6F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Import LW_01
		leftWingModel[0].setRotationPoint(-40F, -24F, -32F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 8, 8, 87, 0F,-1F, 4.5F, 0F, 3F, 5F, 0F, 0F, -2F, 0F, 4F, -3.5F, 0F, -1F, -11.5F, 0F, 3F, -10F, 0F, 0F, 0F, 0F, 4F, -1.5F, 0F); // Import LW_02
		leftWingModel[1].setRotationPoint(-34F, -28F, -119F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 10, 2, 5, 0F,-3F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -3F, -0.5F, -1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F); // Import LW_03
		leftWingModel[2].setRotationPoint(-33F, -33F, -124F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 22, 8, 87, 0F,-2.99999F, 5F, 0F, -7.99999F, 5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2.99999F, -10F, 0F, -7.99999F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LW_04
		leftWingModel[3].setRotationPoint(-26F, -28F, -119F);

		leftWingModel[4].addShapeBox(5F, 0F, 0F, 13, 2, 5, 0F,-5F, 0F, 0F, -6F, 0F, 0F, 0F, -1F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -6F, 0F, 0F, 0F, -0.5F, 0F, -5F, 1F, 0F); // Import LW_05
		leftWingModel[4].setRotationPoint(-22F, -33F, -124F);

		leftWingModel[5].addShapeBox(0F, 0F, 0F, 30, 7, 20, 0F,-6F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -3F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LW_07
		leftWingModel[5].setRotationPoint(-32F, -24F, -32F);

		leftWingModel[6].addShapeBox(0F, 0F, 0F, 17, 7, 20, 0F,2F, 2F, 0F, -4F, -2F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 2F, -3F, 0F, -4F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import LW_08
		leftWingModel[6].setRotationPoint(-2F, -24F, -32F);

		leftWingModel[7].addShapeBox(0F, 0F, 0F, 40, 8, 6, 0F,-4F, -1F, 0F, -6F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -6F, 0F, 0F, 0F, 1F, -2F, 0F, 0F, 0F); // Import LW_09
		leftWingModel[7].setRotationPoint(-36F, -25F, -12F);

		leftWingModel[8].addShapeBox(0F, 0F, 0F, 8, 8, 6, 0F,-4F, -3F, 0F, 4F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -4F, -2F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Import LW_10
		leftWingModel[8].setRotationPoint(-44F, -25F, -12F);

		leftWingModel[9].addShapeBox(0F, 0F, 0F, 17, 8, 6, 0F,6F, -1F, 0F, -6F, -5.5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, -2F); // Import LW_11
		leftWingModel[9].setRotationPoint(4F, -25F, -12F);

		leftWingModel[10].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Import LW_12
		leftWingModel[10].setRotationPoint(-37.6F, -24.5F, -44F);

		leftWingModel[11].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Import LW_13
		leftWingModel[11].setRotationPoint(-37.4F, -24.8F, -48F);

		leftWingModel[12].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Import LW_14
		leftWingModel[12].setRotationPoint(-37.1F, -25.1F, -52F);

		leftWingModel[13].addShapeBox(0F, 0F, 0F, 11, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		leftWingModel[13].setRotationPoint(-23F, -33F, -124F);

		leftWingModel[14].addShapeBox(0F, 0F, 0F, 68, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 612
		leftWingModel[14].setRotationPoint(-61F, -17.5F, -66.5F);

		leftWingModel[15].addShapeBox(0F, 0F, 0F, 68, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 613
		leftWingModel[15].setRotationPoint(-61F, -18.5F, -66.5F);

		leftWingModel[16].addShapeBox(0F, 0F, 0F, 68, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 614
		leftWingModel[16].setRotationPoint(-61F, -16.5F, -66.5F);

		leftWingModel[17].addShapeBox(0F, 0F, 0F, 68, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 555
		leftWingModel[17].setRotationPoint(-61F, -16.25F, -64.25F);

		leftWingModel[18].addShapeBox(0F, 0F, 0F, 68, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 556
		leftWingModel[18].setRotationPoint(-61F, -15.25F, -64.25F);

		leftWingModel[19].addShapeBox(0F, 0F, 0F, 68, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 557
		leftWingModel[19].setRotationPoint(-61F, -14.25F, -64.25F);

		leftWingModel[20].addShapeBox(0F, 0F, 0F, 68, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 558
		leftWingModel[20].setRotationPoint(-61F, -16.25F, -68.75F);

		leftWingModel[21].addShapeBox(0F, 0F, 0F, 68, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 559
		leftWingModel[21].setRotationPoint(-61F, -15.25F, -68.75F);

		leftWingModel[22].addShapeBox(0F, 0F, 0F, 68, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 560
		leftWingModel[22].setRotationPoint(-61F, -14.25F, -68.75F);

		leftWingModel[23].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 561
		leftWingModel[23].setRotationPoint(-60F, -16F, -69F);

		leftWingModel[24].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 562
		leftWingModel[24].setRotationPoint(-60F, -19F, -69F);

		leftWingModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 563
		leftWingModel[25].setRotationPoint(-60F, -14F, -69F);

		leftWingModel[26].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 564
		leftWingModel[26].setRotationPoint(-41F, -19F, -69F);

		leftWingModel[27].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 565
		leftWingModel[27].setRotationPoint(-41F, -16F, -69F);

		leftWingModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 566
		leftWingModel[28].setRotationPoint(-41F, -14F, -69F);

		leftWingModel[29].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 567
		leftWingModel[29].setRotationPoint(-31F, -19F, -69F);

		leftWingModel[30].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 568
		leftWingModel[30].setRotationPoint(-31F, -16F, -69F);

		leftWingModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 569
		leftWingModel[31].setRotationPoint(-31F, -14F, -69F);

		leftWingModel[32].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 570
		leftWingModel[32].setRotationPoint(-24F, -19F, -69F);

		leftWingModel[33].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 571
		leftWingModel[33].setRotationPoint(-24F, -16F, -69F);

		leftWingModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 572
		leftWingModel[34].setRotationPoint(-24F, -14F, -69F);

		leftWingModel[35].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 573
		leftWingModel[35].setRotationPoint(-8F, -19F, -69F);

		leftWingModel[36].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 574
		leftWingModel[36].setRotationPoint(-8F, -16F, -69F);

		leftWingModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 575
		leftWingModel[37].setRotationPoint(-8F, -14F, -69F);

		leftWingModel[38].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 576
		leftWingModel[38].setRotationPoint(-31.5F, -21F, -66F);

		leftWingModel[39].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 577
		leftWingModel[39].setRotationPoint(-31F, -25F, -65.5F);

		leftWingModel[40].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 578
		leftWingModel[40].setRotationPoint(-8F, -25F, -65.5F);

		leftWingModel[41].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 579
		leftWingModel[41].setRotationPoint(-8.5F, -21F, -66F);

		leftWingModel[42].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 613
		leftWingModel[42].setRotationPoint(-24F, -18F, -18.5F);
	}

	private void initrightWingModel_1()
	{
		rightWingModel[0] = new ModelRendererTurbo(this, 1, 585, textureX, textureY); // Box 191
		rightWingModel[1] = new ModelRendererTurbo(this, 1, 585, textureX, textureY); // Box 192
		rightWingModel[2] = new ModelRendererTurbo(this, 41, 585, textureX, textureY); // Box 193
		rightWingModel[3] = new ModelRendererTurbo(this, 193, 585, textureX, textureY); // Box 194
		rightWingModel[4] = new ModelRendererTurbo(this, 105, 585, textureX, textureY); // Box 195
		rightWingModel[5] = new ModelRendererTurbo(this, 129, 585, textureX, textureY); // Box 197
		rightWingModel[6] = new ModelRendererTurbo(this, 329, 585, textureX, textureY); // Box 198
		rightWingModel[7] = new ModelRendererTurbo(this, 385, 585, textureX, textureY); // Box 199
		rightWingModel[8] = new ModelRendererTurbo(this, 217, 585, textureX, textureY); // Box 200
		rightWingModel[9] = new ModelRendererTurbo(this, 537, 585, textureX, textureY); // Box 201
		rightWingModel[10] = new ModelRendererTurbo(this, 585, 585, textureX, textureY); // Box 205
		rightWingModel[11] = new ModelRendererTurbo(this, 1, 585, textureX, textureY); // Box 580
		rightWingModel[12] = new ModelRendererTurbo(this, 73, 585, textureX, textureY); // Box 581
		rightWingModel[13] = new ModelRendererTurbo(this, 241, 585, textureX, textureY); // Box 582
		rightWingModel[14] = new ModelRendererTurbo(this, 0, 345, textureX, textureY); // Box 583
		rightWingModel[15] = new ModelRendererTurbo(this, 0, 345, textureX, textureY); // Box 584
		rightWingModel[16] = new ModelRendererTurbo(this, 0, 345, textureX, textureY); // Box 585
		rightWingModel[17] = new ModelRendererTurbo(this, 0, 345, textureX, textureY); // Box 586
		rightWingModel[18] = new ModelRendererTurbo(this, 0, 345, textureX, textureY); // Box 587
		rightWingModel[19] = new ModelRendererTurbo(this, 0, 345, textureX, textureY); // Box 588
		rightWingModel[20] = new ModelRendererTurbo(this, 0, 345, textureX, textureY); // Box 589
		rightWingModel[21] = new ModelRendererTurbo(this, 0, 345, textureX, textureY); // Box 590
		rightWingModel[22] = new ModelRendererTurbo(this, 0, 345, textureX, textureY); // Box 591
		rightWingModel[23] = new ModelRendererTurbo(this, 249, 585, textureX, textureY); // Box 592
		rightWingModel[24] = new ModelRendererTurbo(this, 329, 585, textureX, textureY); // Box 593
		rightWingModel[25] = new ModelRendererTurbo(this, 481, 585, textureX, textureY); // Box 594
		rightWingModel[26] = new ModelRendererTurbo(this, 625, 585, textureX, textureY); // Box 595
		rightWingModel[27] = new ModelRendererTurbo(this, 649, 585, textureX, textureY); // Box 596
		rightWingModel[28] = new ModelRendererTurbo(this, 673, 585, textureX, textureY); // Box 597
		rightWingModel[29] = new ModelRendererTurbo(this, 697, 585, textureX, textureY); // Box 598
		rightWingModel[30] = new ModelRendererTurbo(this, 721, 585, textureX, textureY); // Box 599
		rightWingModel[31] = new ModelRendererTurbo(this, 745, 585, textureX, textureY); // Box 600
		rightWingModel[32] = new ModelRendererTurbo(this, 769, 585, textureX, textureY); // Box 601
		rightWingModel[33] = new ModelRendererTurbo(this, 793, 585, textureX, textureY); // Box 602
		rightWingModel[34] = new ModelRendererTurbo(this, 817, 585, textureX, textureY); // Box 603
		rightWingModel[35] = new ModelRendererTurbo(this, 841, 585, textureX, textureY); // Box 604
		rightWingModel[36] = new ModelRendererTurbo(this, 865, 585, textureX, textureY); // Box 605
		rightWingModel[37] = new ModelRendererTurbo(this, 889, 585, textureX, textureY); // Box 606
		rightWingModel[38] = new ModelRendererTurbo(this, 137, 585, textureX, textureY); // Box 607
		rightWingModel[39] = new ModelRendererTurbo(this, 217, 585, textureX, textureY); // Box 608
		rightWingModel[40] = new ModelRendererTurbo(this, 265, 585, textureX, textureY); // Box 609
		rightWingModel[41] = new ModelRendererTurbo(this, 473, 585, textureX, textureY); // Box 610
		rightWingModel[42] = new ModelRendererTurbo(this, 273, 585, textureX, textureY); // Box 614

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 8, 7, 20, 0F,0F, -2F, 0F, 0F, 0F, 0F, 6F, 2F, 0F, -2F, 0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 6F, -3F, 0F, -2F, -4.5F, 0F); // Box 191
		rightWingModel[0].setRotationPoint(-40F, -24F, 12F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 8, 8, 87, 0F,4F, -3.5F, 0F, 0F, -2F, 0F, 3F, 5F, 0F, -1F, 4.5F, 0F, 4F, -1.5F, 0F, 0F, 0F, 0F, 3F, -10F, 0F, -1F, -11.5F, 0F); // Box 192
		rightWingModel[1].setRotationPoint(-34F, -28F, 32F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 10, 2, 5, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -3F, -0.5F, -1F); // Box 193
		rightWingModel[2].setRotationPoint(-33F, -33F, 119F);

		rightWingModel[3].addShapeBox(0F, 0F, 0F, 22, 8, 87, 0F,0F, -2F, 0F, 0F, -2F, 0F, -7.99999F, 5F, 0F, -2.99999F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7.99999F, -10F, 0F, -2.99999F, -10F, 0F); // Box 194
		rightWingModel[3].setRotationPoint(-26F, -28F, 32F);

		rightWingModel[4].addShapeBox(5F, 0F, 0F, 13, 2, 5, 0F,-5F, 0F, 0F, 0F, -1F, 0F, -6F, 0F, 0F, -5F, 0F, 0F, -5F, 1F, 0F, 0F, -0.5F, 0F, -6F, 0F, 0F, -5F, 0F, 0F); // Box 195
		rightWingModel[4].setRotationPoint(-22F, -33F, 119F);

		rightWingModel[5].addShapeBox(0F, 0F, 0F, 30, 7, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -6F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, -6F, -3F, 0F); // Box 197
		rightWingModel[5].setRotationPoint(-32F, -24F, 12F);

		rightWingModel[6].addShapeBox(0F, 0F, 0F, 17, 7, 20, 0F,0F, 0F, 0F, 0F, -4.5F, 0F, -4F, -2F, 0F, 2F, 2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -4F, -4F, 0F, 2F, -3F, 0F); // Box 198
		rightWingModel[6].setRotationPoint(-2F, -24F, 12F);

		rightWingModel[7].addShapeBox(0F, 0F, 0F, 40, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -6F, -1F, 0F, -4F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, -6F, 0F, 0F, -4F, 0F, 0F); // Box 199
		rightWingModel[7].setRotationPoint(-36F, -25F, 6F);

		rightWingModel[8].addShapeBox(0F, 0F, 0F, 8, 8, 6, 0F,0F, -2F, 0F, 0F, 0F, 0F, 4F, -1F, 0F, -4F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, -2F, 0F); // Box 200
		rightWingModel[8].setRotationPoint(-44F, -25F, 6F);

		rightWingModel[9].addShapeBox(0F, 0F, 0F, 17, 8, 6, 0F,0F, 0F, 0F, 0F, -5F, 0F, -6F, -5.5F, 0F, 6F, -1F, 0F, 0F, 1F, -2F, 0F, -1F, 0F, -6F, -1F, 0F, 6F, 0F, 0F); // Box 201
		rightWingModel[9].setRotationPoint(4F, -25F, 6F);

		rightWingModel[10].addShapeBox(0F, 0F, 0F, 11, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 205
		rightWingModel[10].setRotationPoint(-23F, -33F, 119F);

		rightWingModel[11].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 580
		rightWingModel[11].setRotationPoint(-37.6F, -24.5F, 43F);

		rightWingModel[12].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 581
		rightWingModel[12].setRotationPoint(-37.4F, -24.8F, 47F);

		rightWingModel[13].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 582
		rightWingModel[13].setRotationPoint(-37.1F, -25.1F, 51F);

		rightWingModel[14].addShapeBox(0F, 0F, 0F, 68, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 583
		rightWingModel[14].setRotationPoint(-61F, -17.5F, 63.5F);

		rightWingModel[15].addShapeBox(0F, 0F, 0F, 68, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 584
		rightWingModel[15].setRotationPoint(-61F, -18.5F, 63.5F);

		rightWingModel[16].addShapeBox(0F, 0F, 0F, 68, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 585
		rightWingModel[16].setRotationPoint(-61F, -16.5F, 63.5F);

		rightWingModel[17].addShapeBox(0F, 0F, 0F, 68, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 586
		rightWingModel[17].setRotationPoint(-61F, -16.25F, 61.25F);

		rightWingModel[18].addShapeBox(0F, 0F, 0F, 68, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 587
		rightWingModel[18].setRotationPoint(-61F, -15.25F, 61.25F);

		rightWingModel[19].addShapeBox(0F, 0F, 0F, 68, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 588
		rightWingModel[19].setRotationPoint(-61F, -14.25F, 61.25F);

		rightWingModel[20].addShapeBox(0F, 0F, 0F, 68, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 589
		rightWingModel[20].setRotationPoint(-61F, -16.25F, 65.75F);

		rightWingModel[21].addShapeBox(0F, 0F, 0F, 68, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 590
		rightWingModel[21].setRotationPoint(-61F, -15.25F, 65.75F);

		rightWingModel[22].addShapeBox(0F, 0F, 0F, 68, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 591
		rightWingModel[22].setRotationPoint(-61F, -14.25F, 65.75F);

		rightWingModel[23].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 592
		rightWingModel[23].setRotationPoint(-60F, -16F, 61F);

		rightWingModel[24].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 593
		rightWingModel[24].setRotationPoint(-60F, -19F, 61F);

		rightWingModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 594
		rightWingModel[25].setRotationPoint(-60F, -14F, 61F);

		rightWingModel[26].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 595
		rightWingModel[26].setRotationPoint(-41F, -19F, 61F);

		rightWingModel[27].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 596
		rightWingModel[27].setRotationPoint(-41F, -16F, 61F);

		rightWingModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 597
		rightWingModel[28].setRotationPoint(-41F, -14F, 61F);

		rightWingModel[29].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 598
		rightWingModel[29].setRotationPoint(-31F, -19F, 61F);

		rightWingModel[30].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 599
		rightWingModel[30].setRotationPoint(-31F, -16F, 61F);

		rightWingModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 600
		rightWingModel[31].setRotationPoint(-31F, -14F, 61F);

		rightWingModel[32].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 601
		rightWingModel[32].setRotationPoint(-24F, -19F, 61F);

		rightWingModel[33].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 602
		rightWingModel[33].setRotationPoint(-24F, -16F, 61F);

		rightWingModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 603
		rightWingModel[34].setRotationPoint(-24F, -14F, 61F);

		rightWingModel[35].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 604
		rightWingModel[35].setRotationPoint(-8F, -19F, 61F);

		rightWingModel[36].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 605
		rightWingModel[36].setRotationPoint(-8F, -16F, 61F);

		rightWingModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 606
		rightWingModel[37].setRotationPoint(-8F, -14F, 61F);

		rightWingModel[38].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 607
		rightWingModel[38].setRotationPoint(-31.5F, -21F, 64F);

		rightWingModel[39].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 608
		rightWingModel[39].setRotationPoint(-31F, -25F, 64.5F);

		rightWingModel[40].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 609
		rightWingModel[40].setRotationPoint(-8F, -25F, 64.5F);

		rightWingModel[41].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 610
		rightWingModel[41].setRotationPoint(-8.5F, -21F, 64F);

		rightWingModel[42].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 614
		rightWingModel[42].setRotationPoint(-24F, -18F, 17.5F);
	}

	private void inityawFlapModel_1()
	{
		yawFlapModel[0] = new ModelRendererTurbo(this, 1, 681, textureX, textureY); // Box 377

		yawFlapModel[0].addShapeBox(0F, 0F, -2F, 13, 38, 4, 0F,0F, 0F, -1F, -8F, 0F, -1.5F, -8F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 377
		yawFlapModel[0].setRotationPoint(109F, -77F, 0F);
	}

	private void initpitchFlapLeftModel_1()
	{
		pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 129, 724, textureX, textureY); // Import FPL_1

		pitchFlapLeftModel[0].addShapeBox(0F, -1F, 0F, 9, 2, 46, 0F,0F, 0F, 0F, -3.5F, -0.5F, 0F, 2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, -0.5F, 0F, 2F, -0.5F, 0F, 0F, 0F, 0F); // Import FPL_1
		pitchFlapLeftModel[0].setRotationPoint(93F, -38F, -47F);
	}

	private void initpitchFlapRightModel_1()
	{
		pitchFlapRightModel[0] = new ModelRendererTurbo(this, 129, 773, textureX, textureY); // Box 231

		pitchFlapRightModel[0].addShapeBox(0F, -1F, 0F, 9, 2, 46, 0F,0F, 0F, 0F, 2F, -0.5F, 0F, -3.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -0.5F, 0F, -3.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 231
		pitchFlapRightModel[0].setRotationPoint(93F, -38F, 1F);
	}

	private void initpitchFlapLeftWingModel_1()
	{
		pitchFlapLeftWingModel[0] = new ModelRendererTurbo(this, 417, 489, textureX, textureY); // Import LW_06
		pitchFlapLeftWingModel[1] = new ModelRendererTurbo(this, 417, 585, textureX, textureY); // Box 196

		pitchFlapLeftWingModel[0].addShapeBox(0F, 0F, 0F, 15, 8, 87, 0F,8F, 5F, 0F, -15F, 4F, 0F, 0F, -6F, 0F, 0F, -2F, 0F, 8F, -10F, 0F, -15F, -11.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import LW_06
		pitchFlapLeftWingModel[0].setRotationPoint(-4F, -28F, -119F);

		pitchFlapLeftWingModel[1].addShapeBox(0F, 0F, 0F, 15, 8, 87, 0F,0F, -2F, 0F, 0F, -6F, 0F, -15F, 4F, 0F, 8F, 5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -15F, -11.5F, 0F, 8F, -10F, 0F); // Box 196
		pitchFlapLeftWingModel[1].setRotationPoint(-4F, -28F, 32F);
	}

	private void inittailWheelModel_1()
	{
		tailWheelModel[0] = new ModelRendererTurbo(this, 1, 480, textureX, textureY); // Import TW_1
		tailWheelModel[1] = new ModelRendererTurbo(this, 17, 480, textureX, textureY); // Import TW_2
		tailWheelModel[2] = new ModelRendererTurbo(this, 25, 480, textureX, textureY); // Import TW_4
		tailWheelModel[3] = new ModelRendererTurbo(this, 41, 480, textureX, textureY); // Import TW_5
		tailWheelModel[4] = new ModelRendererTurbo(this, 57, 480, textureX, textureY); // Import TW_6
		tailWheelModel[5] = new ModelRendererTurbo(this, 89, 480, textureX, textureY); // Box 276
		tailWheelModel[6] = new ModelRendererTurbo(this, 121, 480, textureX, textureY); // Import TW_3

		tailWheelModel[0].addBox(0F, 0F, 0F, 5, 3, 1, 0F); // Import TW_1
		tailWheelModel[0].setRotationPoint(81F, -16F, -0.5F);

		tailWheelModel[1].addShapeBox(0F, 0F, 0F, 1, 6, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -3F, 0F, -0.25F, 3F, 0F, -0.25F, 3F, 0F, -0.25F, -3F, 0F, -0.25F); // Import TW_2
		tailWheelModel[1].setRotationPoint(80F, -20F, -1F);

		tailWheelModel[2].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import TW_4
		tailWheelModel[2].setRotationPoint(81F, -17F, -0.5F);

		tailWheelModel[3].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import TW_5
		tailWheelModel[3].setRotationPoint(81F, -13F, -0.5F);

		tailWheelModel[4].addShapeBox(0F, -4F, 0F, 12, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Import TW_6
		tailWheelModel[4].setRotationPoint(74F, -18.5F, -2F);
		tailWheelModel[4].rotateAngleZ = 0.13962634F;

		tailWheelModel[5].addShapeBox(0F, -4F, 0F, 12, 4, 1, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 276
		tailWheelModel[5].setRotationPoint(74F, -18.5F, 1F);
		tailWheelModel[5].rotateAngleZ = 0.13962634F;

		tailWheelModel[6].addShapeBox(0F, -4F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import TW_3
		tailWheelModel[6].setRotationPoint(80F, -20F, -1F);
	}

	private void initleftWingWheelModel_1()
	{
		leftWingWheelModel[0] = new ModelRendererTurbo(this, 1, 460, textureX, textureY); // Import LWW_03
		leftWingWheelModel[1] = new ModelRendererTurbo(this, 41, 460, textureX, textureY); // Import LWW_04
		leftWingWheelModel[2] = new ModelRendererTurbo(this, 81, 460, textureX, textureY); // Import LWW_05
		leftWingWheelModel[3] = new ModelRendererTurbo(this, 121, 460, textureX, textureY); // Import LWW_07
		leftWingWheelModel[4] = new ModelRendererTurbo(this, 129, 460, textureX, textureY); // Import LWW_08
		leftWingWheelModel[5] = new ModelRendererTurbo(this, 145, 460, textureX, textureY); // Import LWW_09
		leftWingWheelModel[6] = new ModelRendererTurbo(this, 161, 460, textureX, textureY); // Import LWW_11
		leftWingWheelModel[7] = new ModelRendererTurbo(this, 185, 460, textureX, textureY); // Import LWW_12
		leftWingWheelModel[8] = new ModelRendererTurbo(this, 201, 460, textureX, textureY); // Import LWW_13
		leftWingWheelModel[9] = new ModelRendererTurbo(this, 217, 460, textureX, textureY); // Import LWW_06
		leftWingWheelModel[10] = new ModelRendererTurbo(this, 225, 460, textureX, textureY); // Box 762
		leftWingWheelModel[11] = new ModelRendererTurbo(this, 273, 460, textureX, textureY); // Box 763

		leftWingWheelModel[0].addShapeBox(0F, 0F, 0F, 14, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import LWW_03
		leftWingWheelModel[0].setRotationPoint(-45F, 6F, -38F);

		leftWingWheelModel[1].addBox(0F, 0F, 0F, 14, 6, 4, 0F); // Import LWW_04
		leftWingWheelModel[1].setRotationPoint(-45F, 0F, -38F);

		leftWingWheelModel[2].addShapeBox(0F, 0F, 0F, 14, 4, 4, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LWW_05
		leftWingWheelModel[2].setRotationPoint(-45F, -4F, -38F);

		leftWingWheelModel[3].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F,-1.66666667F, 0F, 0F, 1.66666667F, 0F, 0F, 1.66666667F, 0F, 0F, -1.66666667F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LWW_07
		leftWingWheelModel[3].setRotationPoint(-39F, -4F, -34F);

		leftWingWheelModel[4].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,-2.08333333F, -2F, 0F, 2.08333333F, -2F, 0F, 2.29166667F, -1F, 0F, -2.29166667F, -1F, 0F, -1.66666667F, 0F, -3F, 1.66666667F, 0F, -3F, 1.66666667F, 0F, 2F, -1.66666667F, 0F, 2F); // Import LWW_08
		leftWingWheelModel[4].setRotationPoint(-39F, -8F, -37F);

		leftWingWheelModel[5].addShapeBox(0F, 0F, 0F, 2, 17, 2, 0F,-6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, -2.08333333F, 0F, 0F, 2.08333333F, 0F, 0F, 2.08333333F, 0F, 0F, -2.08333333F, 0F, 0F); // Import LWW_09
		leftWingWheelModel[5].setRotationPoint(-39F, -23F, -37F);

		leftWingWheelModel[6].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LWW_11
		leftWingWheelModel[6].setRotationPoint(-36.5F, -11F, -39.5F);

		leftWingWheelModel[7].addShapeBox(0F, 0F, 0F, 4, 17, 1, 0F,-5F, 0F, 1.04347826F, 5F, 0F, 1.04347826F, 5F, 0F, -1.64347826F, -5F, 0F, -1.64347826F, -1F, -2F, 4F, 6F, 0F, 4F, 6F, 0F, -4.6F, -1F, -2F, -4.6F); // Import LWW_12
		leftWingWheelModel[7].setRotationPoint(-41F, -14F, -37.5F);

		leftWingWheelModel[8].addShapeBox(0F, 0F, 0F, 4, 9, 1, 0F,-6F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, -0.6F, -6F, 0F, -0.6F, -3F, 0F, 1.04347826F, 3F, 0F, 1.04347826F, 3F, 0F, -1.64347826F, -3F, 0F, -1.64347826F); // Import LWW_13
		leftWingWheelModel[8].setRotationPoint(-39F, -23F, -37.5F);

		leftWingWheelModel[9].addBox(0F, 0F, 0F, 2, 2, 5, 0F); // Import LWW_06
		leftWingWheelModel[9].setRotationPoint(-39F, 2F, -38.5F);

		leftWingWheelModel[10].addShapeBox(0F, 0F, 0F, 15, 2, 10, 0F,2.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 2.5F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 762
		leftWingWheelModel[10].setRotationPoint(-38F, -6.5F, -3F);
		leftWingWheelModel[10].rotateAngleX = 1.57079633F;

		leftWingWheelModel[11].addShapeBox(0F, 0F, 0F, 12, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 2F, -1.5F, 0F, 3.5F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 2F, 0F, 0F, 3.5F, 0F, 0F); // Box 763
		leftWingWheelModel[11].setRotationPoint(-37F, 0.5F, -4.5F);
		leftWingWheelModel[11].rotateAngleX = 1.57079633F;
	}

	private void initrightWingWheelModel_1()
	{
		rightWingWheelModel[0] = new ModelRendererTurbo(this, 1, 440, textureX, textureY); // Box 218
		rightWingWheelModel[1] = new ModelRendererTurbo(this, 41, 440, textureX, textureY); // Box 219
		rightWingWheelModel[2] = new ModelRendererTurbo(this, 81, 440, textureX, textureY); // Box 220
		rightWingWheelModel[3] = new ModelRendererTurbo(this, 121, 440, textureX, textureY); // Box 221
		rightWingWheelModel[4] = new ModelRendererTurbo(this, 129, 440, textureX, textureY); // Box 222
		rightWingWheelModel[5] = new ModelRendererTurbo(this, 145, 440, textureX, textureY); // Box 223
		rightWingWheelModel[6] = new ModelRendererTurbo(this, 161, 440, textureX, textureY); // Box 224
		rightWingWheelModel[7] = new ModelRendererTurbo(this, 185, 440, textureX, textureY); // Box 225
		rightWingWheelModel[8] = new ModelRendererTurbo(this, 201, 440, textureX, textureY); // Box 226
		rightWingWheelModel[9] = new ModelRendererTurbo(this, 217, 440, textureX, textureY); // Box 227
		rightWingWheelModel[10] = new ModelRendererTurbo(this, 225, 440, textureX, textureY); // Box 268
		rightWingWheelModel[11] = new ModelRendererTurbo(this, 273, 440, textureX, textureY); // Box 269

		rightWingWheelModel[0].addShapeBox(0F, 0F, 0F, 14, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 218
		rightWingWheelModel[0].setRotationPoint(-45F, 6F, 34F);

		rightWingWheelModel[1].addBox(0F, 0F, 0F, 14, 6, 4, 0F); // Box 219
		rightWingWheelModel[1].setRotationPoint(-45F, 0F, 34F);

		rightWingWheelModel[2].addShapeBox(0F, 0F, 0F, 14, 4, 4, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		rightWingWheelModel[2].setRotationPoint(-45F, -4F, 34F);

		rightWingWheelModel[3].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F,-1.66666667F, 0F, 0F, 1.66666667F, 0F, 0F, 1.66666667F, 0F, 0F, -1.66666667F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221
		rightWingWheelModel[3].setRotationPoint(-39F, -4F, 33F);

		rightWingWheelModel[4].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,-2.29166667F, -1F, 0F, 2.29166667F, -1F, 0F, 2.08333333F, -2F, 0F, -2.08333333F, -2F, 0F, -1.66666667F, 0F, 2F, 1.66666667F, 0F, 2F, 1.66666667F, 0F, -3F, -1.66666667F, 0F, -3F); // Box 222
		rightWingWheelModel[4].setRotationPoint(-39F, -8F, 35F);

		rightWingWheelModel[5].addShapeBox(0F, 0F, 0F, 2, 17, 2, 0F,-6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, -2.08333333F, 0F, 0F, 2.08333333F, 0F, 0F, 2.08333333F, 0F, 0F, -2.08333333F, 0F, 0F); // Box 223
		rightWingWheelModel[5].setRotationPoint(-39F, -23F, 35F);

		rightWingWheelModel[6].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 224
		rightWingWheelModel[6].setRotationPoint(-36.5F, -11F, 34.5F);

		rightWingWheelModel[7].addShapeBox(0F, 0F, 0F, 4, 17, 1, 0F,-5F, 0F, -1.64347826F, 5F, 0F, -1.64347826F, 5F, 0F, 1.04347826F, -5F, 0F, 1.04347826F, -1F, -2F, -4.6F, 6F, 0F, -4.6F, 6F, 0F, 4F, -1F, -2F, 4F); // Box 225
		rightWingWheelModel[7].setRotationPoint(-41F, -14F, 36.5F);

		rightWingWheelModel[8].addShapeBox(0F, 0F, 0F, 4, 9, 1, 0F,-6F, 0F, -0.6F, 5F, 0F, -0.6F, 5F, 0F, 0F, -6F, 0F, 0F, -3F, 0F, -1.64347826F, 3F, 0F, -1.64347826F, 3F, 0F, 1.04347826F, -3F, 0F, 1.04347826F); // Box 226
		rightWingWheelModel[8].setRotationPoint(-39F, -23F, 36.5F);

		rightWingWheelModel[9].addBox(0F, 0F, 0F, 2, 2, 5, 0F); // Box 227
		rightWingWheelModel[9].setRotationPoint(-39F, 2F, 33.5F);

		rightWingWheelModel[10].addShapeBox(0F, 0F, 0F, 15, 2, 10, 0F,2.5F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 268
		rightWingWheelModel[10].setRotationPoint(-38F, -6.5F, 1F);
		rightWingWheelModel[10].rotateAngleX = 1.57079633F;

		rightWingWheelModel[11].addShapeBox(0F, 0F, 0F, 12, 2, 7, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 2F, 0F, 0F, 3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1.5F, 0F, 3.5F, -1.5F, 0F); // Box 269
		rightWingWheelModel[11].setRotationPoint(-37F, 0.5F, 2.5F);
		rightWingWheelModel[11].rotateAngleX = 1.57079633F;
	}

	private void initPropeller()
	{
		propellerModels = new ModelRendererTurbo[1][4];
		propellerModels[0] = makeProp1(-92F, -35F, 0F);
	}

	private ModelRendererTurbo[] makeProp1(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[4];
		prop[0] = new ModelRendererTurbo(this, 0, 303, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 303, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 0, 303, textureX, textureY);
		prop[3] = new ModelRendererTurbo(this, 0, 303, textureX, textureY);
		prop[0].addBox(-1F, -35F, -2.5F, 2, 35, 5, 0.0F);
		prop[1].addBox(-1F, -35F, -2.5F, 2, 35, 5, 0.0F);
		prop[2].addBox(-1F, -35F, -2.5F, 2, 35, 5, 0.0F);
		prop[3].addBox(-1F, -35F, -2.5F, 2, 35, 5, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		prop[3].setRotationPoint(i, j, k);
		return prop;
	}
}