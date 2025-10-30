//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: hispanoStang
// Model Creator: TaskForce51
// Created on: 06.04.2023 - 21:43:33
// Last changed on: 06.04.2023 - 21:43:33

package com.flansmod.client.model.Taskball; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelhispanoStang extends ModelPlane //Same as Filename
{
	int textureX = 2048;
	int textureY = 1024;

	public ModelhispanoStang() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[399];
		noseModel = new ModelRendererTurbo[62];
		tailModel = new ModelRendererTurbo[17];
		leftWingModel = new ModelRendererTurbo[19];
		rightWingModel = new ModelRendererTurbo[19];
		yawFlapModel = new ModelRendererTurbo[7];
		pitchFlapLeftModel = new ModelRendererTurbo[1];
		pitchFlapRightModel = new ModelRendererTurbo[1];
		pitchFlapLeftWingModel = new ModelRendererTurbo[1];
		pitchFlapRightWingModel = new ModelRendererTurbo[1];
		tailWheelModel = new ModelRendererTurbo[7];
		leftWingWheelModel = new ModelRendererTurbo[12];
		rightWingWheelModel = new ModelRendererTurbo[12];
		hudModel = new ModelRendererTurbo[1];

		initbodyModel_1();
		initnoseModel_1();
		inittailModel_1();
		initleftWingModel_1();
		initrightWingModel_1();
		inityawFlapModel_1();
		initpitchFlapLeftModel_1();
		initpitchFlapRightModel_1();
		initpitchFlapLeftWingModel_1();
		initpitchFlapRightWingModel_1();
		inittailWheelModel_1();
		initleftWingWheelModel_1();
		initrightWingWheelModel_1();
		inithudModel_1();

		initPropeller();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 875, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 97, 875, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 121, 875, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 137, 875, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 217, 875, textureX, textureY); // Box 11
		bodyModel[5] = new ModelRendererTurbo(this, 1, 946, textureX, textureY); // Box 14
		bodyModel[6] = new ModelRendererTurbo(this, 1, 924, textureX, textureY); // Box 15
		bodyModel[7] = new ModelRendererTurbo(this, 1, 835, textureX, textureY); // Box 18
		bodyModel[8] = new ModelRendererTurbo(this, 1, 813, textureX, textureY); // Box 19
		bodyModel[9] = new ModelRendererTurbo(this, 97, 875, textureX, textureY); // Box 25
		bodyModel[10] = new ModelRendererTurbo(this, 233, 875, textureX, textureY); // Box 26
		bodyModel[11] = new ModelRendererTurbo(this, 241, 875, textureX, textureY); // Box 27
		bodyModel[12] = new ModelRendererTurbo(this, 209, 875, textureX, textureY); // Box 28
		bodyModel[13] = new ModelRendererTurbo(this, 113, 875, textureX, textureY); // Box 29
		bodyModel[14] = new ModelRendererTurbo(this, 257, 875, textureX, textureY); // Box 30
		bodyModel[15] = new ModelRendererTurbo(this, 281, 924, textureX, textureY); // Box 37
		bodyModel[16] = new ModelRendererTurbo(this, 281, 875, textureX, textureY); // Box 38
		bodyModel[17] = new ModelRendererTurbo(this, 345, 875, textureX, textureY); // Box 39
		bodyModel[18] = new ModelRendererTurbo(this, 1, 897, textureX, textureY); // Box 40
		bodyModel[19] = new ModelRendererTurbo(this, 65, 897, textureX, textureY); // Box 41
		bodyModel[20] = new ModelRendererTurbo(this, 241, 835, textureX, textureY); // Box 42
		bodyModel[21] = new ModelRendererTurbo(this, 297, 835, textureX, textureY); // Box 43
		bodyModel[22] = new ModelRendererTurbo(this, 417, 835, textureX, textureY); // Box 46
		bodyModel[23] = new ModelRendererTurbo(this, 113, 897, textureX, textureY); // Box 47
		bodyModel[24] = new ModelRendererTurbo(this, 169, 897, textureX, textureY); // Box 48
		bodyModel[25] = new ModelRendererTurbo(this, 393, 875, textureX, textureY); // Box 49
		bodyModel[26] = new ModelRendererTurbo(this, 233, 897, textureX, textureY); // Box 51
		bodyModel[27] = new ModelRendererTurbo(this, 41, 897, textureX, textureY); // Box 54
		bodyModel[28] = new ModelRendererTurbo(this, 281, 897, textureX, textureY); // Box 55
		bodyModel[29] = new ModelRendererTurbo(this, 313, 813, textureX, textureY); // Box 112
		bodyModel[30] = new ModelRendererTurbo(this, 409, 875, textureX, textureY); // Box 109
		bodyModel[31] = new ModelRendererTurbo(this, 393, 813, textureX, textureY); // Box 110
		bodyModel[32] = new ModelRendererTurbo(this, 473, 875, textureX, textureY); // Box 111
		bodyModel[33] = new ModelRendererTurbo(this, 497, 875, textureX, textureY); // Box 113
		bodyModel[34] = new ModelRendererTurbo(this, 521, 875, textureX, textureY); // Box 114
		bodyModel[35] = new ModelRendererTurbo(this, 337, 875, textureX, textureY); // Box 115
		bodyModel[36] = new ModelRendererTurbo(this, 545, 875, textureX, textureY); // Box 116
		bodyModel[37] = new ModelRendererTurbo(this, 281, 875, textureX, textureY); // Box 117
		bodyModel[38] = new ModelRendererTurbo(this, 249, 875, textureX, textureY); // Box 118
		bodyModel[39] = new ModelRendererTurbo(this, 385, 875, textureX, textureY); // Box 119
		bodyModel[40] = new ModelRendererTurbo(this, 489, 875, textureX, textureY); // Box 120
		bodyModel[41] = new ModelRendererTurbo(this, 561, 875, textureX, textureY); // Box 121
		bodyModel[42] = new ModelRendererTurbo(this, 601, 875, textureX, textureY); // Box 122
		bodyModel[43] = new ModelRendererTurbo(this, 609, 875, textureX, textureY); // Box 123
		bodyModel[44] = new ModelRendererTurbo(this, 617, 875, textureX, textureY); // Box 124
		bodyModel[45] = new ModelRendererTurbo(this, 625, 875, textureX, textureY); // Box 125
		bodyModel[46] = new ModelRendererTurbo(this, 633, 875, textureX, textureY); // Box 126
		bodyModel[47] = new ModelRendererTurbo(this, 649, 875, textureX, textureY); // Box 127
		bodyModel[48] = new ModelRendererTurbo(this, 337, 897, textureX, textureY); // Box 128
		bodyModel[49] = new ModelRendererTurbo(this, 1, 897, textureX, textureY); // Box 129
		bodyModel[50] = new ModelRendererTurbo(this, 153, 897, textureX, textureY); // Box 130
		bodyModel[51] = new ModelRendererTurbo(this, 433, 897, textureX, textureY); // Box 131
		bodyModel[52] = new ModelRendererTurbo(this, 41, 897, textureX, textureY); // Box 132
		bodyModel[53] = new ModelRendererTurbo(this, 225, 946, textureX, textureY); // Box 133
		bodyModel[54] = new ModelRendererTurbo(this, 465, 835, textureX, textureY); // Box 134
		bodyModel[55] = new ModelRendererTurbo(this, 1, 897, textureX, textureY); // Box 138
		bodyModel[56] = new ModelRendererTurbo(this, 73, 897, textureX, textureY); // Box 139
		bodyModel[57] = new ModelRendererTurbo(this, 113, 897, textureX, textureY); // Box 140
		bodyModel[58] = new ModelRendererTurbo(this, 169, 897, textureX, textureY); // Box 141
		bodyModel[59] = new ModelRendererTurbo(this, 217, 897, textureX, textureY); // Box 142
		bodyModel[60] = new ModelRendererTurbo(this, 225, 897, textureX, textureY); // Box 143
		bodyModel[61] = new ModelRendererTurbo(this, 505, 946, textureX, textureY); // Box 150
		bodyModel[62] = new ModelRendererTurbo(this, 505, 897, textureX, textureY); // Box 151
		bodyModel[63] = new ModelRendererTurbo(this, 569, 897, textureX, textureY); // Box 152
		bodyModel[64] = new ModelRendererTurbo(this, 265, 897, textureX, textureY); // Box 154
		bodyModel[65] = new ModelRendererTurbo(this, 777, 835, textureX, textureY); // Box 155
		bodyModel[66] = new ModelRendererTurbo(this, 609, 897, textureX, textureY); // Box 208
		bodyModel[67] = new ModelRendererTurbo(this, 857, 835, textureX, textureY); // Box 209
		bodyModel[68] = new ModelRendererTurbo(this, 673, 897, textureX, textureY); // Box 210
		bodyModel[69] = new ModelRendererTurbo(this, 689, 897, textureX, textureY); // Box 212
		bodyModel[70] = new ModelRendererTurbo(this, 321, 897, textureX, textureY); // Box 213
		bodyModel[71] = new ModelRendererTurbo(this, 713, 897, textureX, textureY); // Box 214
		bodyModel[72] = new ModelRendererTurbo(this, 561, 897, textureX, textureY); // Box 215
		bodyModel[73] = new ModelRendererTurbo(this, 121, 897, textureX, textureY); // Box 216
		bodyModel[74] = new ModelRendererTurbo(this, 177, 897, textureX, textureY); // Box 217
		bodyModel[75] = new ModelRendererTurbo(this, 569, 897, textureX, textureY); // Box 218
		bodyModel[76] = new ModelRendererTurbo(this, 729, 897, textureX, textureY); // Box 219
		bodyModel[77] = new ModelRendererTurbo(this, 769, 897, textureX, textureY); // Box 220
		bodyModel[78] = new ModelRendererTurbo(this, 777, 897, textureX, textureY); // Box 221
		bodyModel[79] = new ModelRendererTurbo(this, 289, 897, textureX, textureY); // Box 222
		bodyModel[80] = new ModelRendererTurbo(this, 785, 897, textureX, textureY); // Box 223
		bodyModel[81] = new ModelRendererTurbo(this, 793, 897, textureX, textureY); // Box 224
		bodyModel[82] = new ModelRendererTurbo(this, 809, 897, textureX, textureY); // Box 695
		bodyModel[83] = new ModelRendererTurbo(this, 1, 425, textureX, textureY); // Box 217
		bodyModel[84] = new ModelRendererTurbo(this, 1, 399, textureX, textureY); // Box 239
		bodyModel[85] = new ModelRendererTurbo(this, 49, 399, textureX, textureY); // Box 240
		bodyModel[86] = new ModelRendererTurbo(this, 33, 399, textureX, textureY); // Box 241
		bodyModel[87] = new ModelRendererTurbo(this, 65, 399, textureX, textureY); // Box 242
		bodyModel[88] = new ModelRendererTurbo(this, 81, 399, textureX, textureY); // Box 243
		bodyModel[89] = new ModelRendererTurbo(this, 105, 399, textureX, textureY); // Box 244
		bodyModel[90] = new ModelRendererTurbo(this, 129, 399, textureX, textureY); // Box 245
		bodyModel[91] = new ModelRendererTurbo(this, 145, 399, textureX, textureY); // Box 246
		bodyModel[92] = new ModelRendererTurbo(this, 169, 399, textureX, textureY); // Box 247
		bodyModel[93] = new ModelRendererTurbo(this, 177, 399, textureX, textureY); // Box 248
		bodyModel[94] = new ModelRendererTurbo(this, 185, 399, textureX, textureY); // Box 250
		bodyModel[95] = new ModelRendererTurbo(this, 193, 399, textureX, textureY); // Box 251
		bodyModel[96] = new ModelRendererTurbo(this, 201, 399, textureX, textureY); // Box 252
		bodyModel[97] = new ModelRendererTurbo(this, 225, 399, textureX, textureY); // Box 253
		bodyModel[98] = new ModelRendererTurbo(this, 1, 399, textureX, textureY); // Box 962
		bodyModel[99] = new ModelRendererTurbo(this, 49, 399, textureX, textureY); // Box 964
		bodyModel[100] = new ModelRendererTurbo(this, 81, 399, textureX, textureY); // Box 966
		bodyModel[101] = new ModelRendererTurbo(this, 241, 425, textureX, textureY); // Box 268
		bodyModel[102] = new ModelRendererTurbo(this, 273, 425, textureX, textureY); // Box 269
		bodyModel[103] = new ModelRendererTurbo(this, 113, 425, textureX, textureY); // Box 922
		bodyModel[104] = new ModelRendererTurbo(this, 289, 425, textureX, textureY); // Box 923
		bodyModel[105] = new ModelRendererTurbo(this, 1, 425, textureX, textureY); // Box 924
		bodyModel[106] = new ModelRendererTurbo(this, 177, 425, textureX, textureY); // Box 925
		bodyModel[107] = new ModelRendererTurbo(this, 233, 425, textureX, textureY); // Box 926
		bodyModel[108] = new ModelRendererTurbo(this, 305, 425, textureX, textureY); // Box 927
		bodyModel[109] = new ModelRendererTurbo(this, 329, 425, textureX, textureY); // Box 928
		bodyModel[110] = new ModelRendererTurbo(this, 361, 425, textureX, textureY); // Box 929
		bodyModel[111] = new ModelRendererTurbo(this, 265, 425, textureX, textureY); // Box 930
		bodyModel[112] = new ModelRendererTurbo(this, 273, 425, textureX, textureY); // Box 931
		bodyModel[113] = new ModelRendererTurbo(this, 321, 425, textureX, textureY); // Box 932
		bodyModel[114] = new ModelRendererTurbo(this, 353, 425, textureX, textureY); // Box 933
		bodyModel[115] = new ModelRendererTurbo(this, 377, 425, textureX, textureY); // Box 934
		bodyModel[116] = new ModelRendererTurbo(this, 385, 425, textureX, textureY); // Box 935
		bodyModel[117] = new ModelRendererTurbo(this, 393, 425, textureX, textureY); // Box 936
		bodyModel[118] = new ModelRendererTurbo(this, 401, 425, textureX, textureY); // Box 937
		bodyModel[119] = new ModelRendererTurbo(this, 409, 425, textureX, textureY); // Box 938
		bodyModel[120] = new ModelRendererTurbo(this, 417, 425, textureX, textureY); // Box 939
		bodyModel[121] = new ModelRendererTurbo(this, 425, 425, textureX, textureY); // Box 940
		bodyModel[122] = new ModelRendererTurbo(this, 433, 425, textureX, textureY); // Box 941
		bodyModel[123] = new ModelRendererTurbo(this, 441, 425, textureX, textureY); // Box 942
		bodyModel[124] = new ModelRendererTurbo(this, 593, 425, textureX, textureY); // Box 943
		bodyModel[125] = new ModelRendererTurbo(this, 449, 425, textureX, textureY); // Box 945
		bodyModel[126] = new ModelRendererTurbo(this, 457, 425, textureX, textureY); // Box 947
		bodyModel[127] = new ModelRendererTurbo(this, 465, 425, textureX, textureY); // Box 948
		bodyModel[128] = new ModelRendererTurbo(this, 481, 425, textureX, textureY); // Box 949
		bodyModel[129] = new ModelRendererTurbo(this, 601, 425, textureX, textureY); // Box 950
		bodyModel[130] = new ModelRendererTurbo(this, 489, 425, textureX, textureY); // Box 951
		bodyModel[131] = new ModelRendererTurbo(this, 497, 425, textureX, textureY); // Box 952
		bodyModel[132] = new ModelRendererTurbo(this, 505, 425, textureX, textureY); // Box 953
		bodyModel[133] = new ModelRendererTurbo(this, 513, 425, textureX, textureY); // Box 954
		bodyModel[134] = new ModelRendererTurbo(this, 521, 425, textureX, textureY); // Box 955
		bodyModel[135] = new ModelRendererTurbo(this, 529, 425, textureX, textureY); // Box 956
		bodyModel[136] = new ModelRendererTurbo(this, 537, 425, textureX, textureY); // Box 957
		bodyModel[137] = new ModelRendererTurbo(this, 545, 425, textureX, textureY); // Box 958
		bodyModel[138] = new ModelRendererTurbo(this, 553, 425, textureX, textureY); // Box 959
		bodyModel[139] = new ModelRendererTurbo(this, 1, 386, textureX, textureY); // Box 259
		bodyModel[140] = new ModelRendererTurbo(this, 9, 386, textureX, textureY); // Box 260
		bodyModel[141] = new ModelRendererTurbo(this, 1, 363, textureX, textureY); // Box 262
		bodyModel[142] = new ModelRendererTurbo(this, 49, 363, textureX, textureY); // Box 255
		bodyModel[143] = new ModelRendererTurbo(this, 17, 386, textureX, textureY); // Box 256
		bodyModel[144] = new ModelRendererTurbo(this, 89, 363, textureX, textureY); // Box 257
		bodyModel[145] = new ModelRendererTurbo(this, 33, 363, textureX, textureY); // Box 258
		bodyModel[146] = new ModelRendererTurbo(this, 73, 363, textureX, textureY); // Box 213
		bodyModel[147] = new ModelRendererTurbo(this, 113, 363, textureX, textureY); // Box 214
		bodyModel[148] = new ModelRendererTurbo(this, 1, 363, textureX, textureY); // Box 233
		bodyModel[149] = new ModelRendererTurbo(this, 9, 363, textureX, textureY); // Box 234
		bodyModel[150] = new ModelRendererTurbo(this, 33, 363, textureX, textureY); // Box 235
		bodyModel[151] = new ModelRendererTurbo(this, 41, 363, textureX, textureY); // Box 236
		bodyModel[152] = new ModelRendererTurbo(this, 57, 363, textureX, textureY); // Box 237
		bodyModel[153] = new ModelRendererTurbo(this, 73, 363, textureX, textureY); // Box 238
		bodyModel[154] = new ModelRendererTurbo(this, 89, 363, textureX, textureY); // Box 239
		bodyModel[155] = new ModelRendererTurbo(this, 97, 363, textureX, textureY); // Box 240
		bodyModel[156] = new ModelRendererTurbo(this, 113, 363, textureX, textureY); // Box 241
		bodyModel[157] = new ModelRendererTurbo(this, 129, 363, textureX, textureY); // Box 242
		bodyModel[158] = new ModelRendererTurbo(this, 137, 363, textureX, textureY); // Box 243
		bodyModel[159] = new ModelRendererTurbo(this, 145, 363, textureX, textureY); // Box 244
		bodyModel[160] = new ModelRendererTurbo(this, 153, 363, textureX, textureY); // Box 248
		bodyModel[161] = new ModelRendererTurbo(this, 161, 363, textureX, textureY); // Box 249
		bodyModel[162] = new ModelRendererTurbo(this, 169, 363, textureX, textureY); // Box 250
		bodyModel[163] = new ModelRendererTurbo(this, 177, 363, textureX, textureY); // Box 251
		bodyModel[164] = new ModelRendererTurbo(this, 185, 363, textureX, textureY); // Box 252
		bodyModel[165] = new ModelRendererTurbo(this, 193, 363, textureX, textureY); // Box 253
		bodyModel[166] = new ModelRendererTurbo(this, 201, 363, textureX, textureY); // Box 254
		bodyModel[167] = new ModelRendererTurbo(this, 209, 363, textureX, textureY); // Box 255
		bodyModel[168] = new ModelRendererTurbo(this, 217, 363, textureX, textureY); // Box 256
		bodyModel[169] = new ModelRendererTurbo(this, 225, 363, textureX, textureY); // Box 257
		bodyModel[170] = new ModelRendererTurbo(this, 233, 363, textureX, textureY); // Box 258
		bodyModel[171] = new ModelRendererTurbo(this, 241, 363, textureX, textureY); // Box 259
		bodyModel[172] = new ModelRendererTurbo(this, 249, 363, textureX, textureY); // Box 260
		bodyModel[173] = new ModelRendererTurbo(this, 257, 363, textureX, textureY); // Box 261
		bodyModel[174] = new ModelRendererTurbo(this, 265, 363, textureX, textureY); // Box 262
		bodyModel[175] = new ModelRendererTurbo(this, 273, 363, textureX, textureY); // Box 263
		bodyModel[176] = new ModelRendererTurbo(this, 281, 363, textureX, textureY); // Box 265
		bodyModel[177] = new ModelRendererTurbo(this, 289, 363, textureX, textureY); // Box 266
		bodyModel[178] = new ModelRendererTurbo(this, 297, 363, textureX, textureY); // Box 267
		bodyModel[179] = new ModelRendererTurbo(this, 305, 363, textureX, textureY); // Box 268
		bodyModel[180] = new ModelRendererTurbo(this, 313, 363, textureX, textureY); // Box 269
		bodyModel[181] = new ModelRendererTurbo(this, 321, 363, textureX, textureY); // Box 270
		bodyModel[182] = new ModelRendererTurbo(this, 329, 363, textureX, textureY); // Box 271
		bodyModel[183] = new ModelRendererTurbo(this, 337, 363, textureX, textureY); // Box 272
		bodyModel[184] = new ModelRendererTurbo(this, 345, 363, textureX, textureY); // Box 273
		bodyModel[185] = new ModelRendererTurbo(this, 353, 363, textureX, textureY); // Box 274
		bodyModel[186] = new ModelRendererTurbo(this, 361, 363, textureX, textureY); // Box 275
		bodyModel[187] = new ModelRendererTurbo(this, 369, 363, textureX, textureY); // Box 276
		bodyModel[188] = new ModelRendererTurbo(this, 377, 363, textureX, textureY); // Box 277
		bodyModel[189] = new ModelRendererTurbo(this, 385, 363, textureX, textureY); // Box 278
		bodyModel[190] = new ModelRendererTurbo(this, 393, 363, textureX, textureY); // Box 279
		bodyModel[191] = new ModelRendererTurbo(this, 401, 363, textureX, textureY); // Box 280
		bodyModel[192] = new ModelRendererTurbo(this, 409, 363, textureX, textureY); // Box 281
		bodyModel[193] = new ModelRendererTurbo(this, 417, 363, textureX, textureY); // Box 282
		bodyModel[194] = new ModelRendererTurbo(this, 425, 363, textureX, textureY); // Box 283
		bodyModel[195] = new ModelRendererTurbo(this, 433, 363, textureX, textureY); // Box 284
		bodyModel[196] = new ModelRendererTurbo(this, 441, 363, textureX, textureY); // Box 285
		bodyModel[197] = new ModelRendererTurbo(this, 449, 363, textureX, textureY); // Box 286
		bodyModel[198] = new ModelRendererTurbo(this, 457, 363, textureX, textureY); // Box 287
		bodyModel[199] = new ModelRendererTurbo(this, 465, 363, textureX, textureY); // Box 288
		bodyModel[200] = new ModelRendererTurbo(this, 473, 363, textureX, textureY); // Box 289
		bodyModel[201] = new ModelRendererTurbo(this, 481, 363, textureX, textureY); // Box 290
		bodyModel[202] = new ModelRendererTurbo(this, 489, 363, textureX, textureY); // Box 318
		bodyModel[203] = new ModelRendererTurbo(this, 497, 363, textureX, textureY); // Box 319
		bodyModel[204] = new ModelRendererTurbo(this, 505, 363, textureX, textureY); // Box 320
		bodyModel[205] = new ModelRendererTurbo(this, 513, 363, textureX, textureY); // Box 321
		bodyModel[206] = new ModelRendererTurbo(this, 521, 363, textureX, textureY); // Box 322
		bodyModel[207] = new ModelRendererTurbo(this, 529, 363, textureX, textureY); // Box 323
		bodyModel[208] = new ModelRendererTurbo(this, 537, 363, textureX, textureY); // Box 324
		bodyModel[209] = new ModelRendererTurbo(this, 545, 363, textureX, textureY); // Box 325
		bodyModel[210] = new ModelRendererTurbo(this, 553, 363, textureX, textureY); // Box 326
		bodyModel[211] = new ModelRendererTurbo(this, 561, 363, textureX, textureY); // Box 327
		bodyModel[212] = new ModelRendererTurbo(this, 569, 363, textureX, textureY); // Box 328
		bodyModel[213] = new ModelRendererTurbo(this, 577, 363, textureX, textureY); // Box 329
		bodyModel[214] = new ModelRendererTurbo(this, 585, 363, textureX, textureY); // Box 330
		bodyModel[215] = new ModelRendererTurbo(this, 593, 363, textureX, textureY); // Box 331
		bodyModel[216] = new ModelRendererTurbo(this, 601, 363, textureX, textureY); // Box 332
		bodyModel[217] = new ModelRendererTurbo(this, 609, 363, textureX, textureY); // Box 333
		bodyModel[218] = new ModelRendererTurbo(this, 617, 363, textureX, textureY); // Box 334
		bodyModel[219] = new ModelRendererTurbo(this, 625, 363, textureX, textureY); // Box 340
		bodyModel[220] = new ModelRendererTurbo(this, 633, 363, textureX, textureY); // Box 341
		bodyModel[221] = new ModelRendererTurbo(this, 641, 363, textureX, textureY); // Box 342
		bodyModel[222] = new ModelRendererTurbo(this, 649, 363, textureX, textureY); // Box 343
		bodyModel[223] = new ModelRendererTurbo(this, 657, 363, textureX, textureY); // Box 344
		bodyModel[224] = new ModelRendererTurbo(this, 665, 363, textureX, textureY); // Box 345
		bodyModel[225] = new ModelRendererTurbo(this, 673, 363, textureX, textureY); // Box 346
		bodyModel[226] = new ModelRendererTurbo(this, 681, 363, textureX, textureY); // Box 347
		bodyModel[227] = new ModelRendererTurbo(this, 689, 363, textureX, textureY); // Box 348
		bodyModel[228] = new ModelRendererTurbo(this, 697, 363, textureX, textureY); // Box 349
		bodyModel[229] = new ModelRendererTurbo(this, 705, 363, textureX, textureY); // Box 350
		bodyModel[230] = new ModelRendererTurbo(this, 713, 363, textureX, textureY); // Box 351
		bodyModel[231] = new ModelRendererTurbo(this, 721, 363, textureX, textureY); // Box 352
		bodyModel[232] = new ModelRendererTurbo(this, 729, 363, textureX, textureY); // Box 353
		bodyModel[233] = new ModelRendererTurbo(this, 737, 363, textureX, textureY); // Box 354
		bodyModel[234] = new ModelRendererTurbo(this, 745, 363, textureX, textureY); // Box 355
		bodyModel[235] = new ModelRendererTurbo(this, 753, 363, textureX, textureY); // Box 356
		bodyModel[236] = new ModelRendererTurbo(this, 761, 363, textureX, textureY); // Box 387
		bodyModel[237] = new ModelRendererTurbo(this, 769, 363, textureX, textureY); // Box 388
		bodyModel[238] = new ModelRendererTurbo(this, 777, 363, textureX, textureY); // Box 390
		bodyModel[239] = new ModelRendererTurbo(this, 785, 363, textureX, textureY); // Box 391
		bodyModel[240] = new ModelRendererTurbo(this, 793, 363, textureX, textureY); // Box 392
		bodyModel[241] = new ModelRendererTurbo(this, 801, 363, textureX, textureY); // Box 393
		bodyModel[242] = new ModelRendererTurbo(this, 809, 363, textureX, textureY); // Box 394
		bodyModel[243] = new ModelRendererTurbo(this, 817, 363, textureX, textureY); // Box 395
		bodyModel[244] = new ModelRendererTurbo(this, 825, 363, textureX, textureY); // Box 396
		bodyModel[245] = new ModelRendererTurbo(this, 833, 363, textureX, textureY); // Box 397
		bodyModel[246] = new ModelRendererTurbo(this, 841, 363, textureX, textureY); // Box 398
		bodyModel[247] = new ModelRendererTurbo(this, 849, 363, textureX, textureY); // Box 399
		bodyModel[248] = new ModelRendererTurbo(this, 857, 363, textureX, textureY); // Box 400
		bodyModel[249] = new ModelRendererTurbo(this, 865, 363, textureX, textureY); // Box 401
		bodyModel[250] = new ModelRendererTurbo(this, 873, 363, textureX, textureY); // Box 402
		bodyModel[251] = new ModelRendererTurbo(this, 881, 363, textureX, textureY); // Box 403
		bodyModel[252] = new ModelRendererTurbo(this, 889, 363, textureX, textureY); // Box 404
		bodyModel[253] = new ModelRendererTurbo(this, 897, 363, textureX, textureY); // Box 405
		bodyModel[254] = new ModelRendererTurbo(this, 905, 363, textureX, textureY); // Box 406
		bodyModel[255] = new ModelRendererTurbo(this, 913, 363, textureX, textureY); // Box 407
		bodyModel[256] = new ModelRendererTurbo(this, 921, 363, textureX, textureY); // Box 408
		bodyModel[257] = new ModelRendererTurbo(this, 929, 363, textureX, textureY); // Box 409
		bodyModel[258] = new ModelRendererTurbo(this, 937, 363, textureX, textureY); // Box 410
		bodyModel[259] = new ModelRendererTurbo(this, 945, 363, textureX, textureY); // Box 411
		bodyModel[260] = new ModelRendererTurbo(this, 953, 363, textureX, textureY); // Box 412
		bodyModel[261] = new ModelRendererTurbo(this, 961, 363, textureX, textureY); // Box 413
		bodyModel[262] = new ModelRendererTurbo(this, 969, 363, textureX, textureY); // Box 414
		bodyModel[263] = new ModelRendererTurbo(this, 977, 363, textureX, textureY); // Box 415
		bodyModel[264] = new ModelRendererTurbo(this, 985, 363, textureX, textureY); // Box 416
		bodyModel[265] = new ModelRendererTurbo(this, 993, 363, textureX, textureY); // Box 417
		bodyModel[266] = new ModelRendererTurbo(this, 1001, 363, textureX, textureY); // Box 418
		bodyModel[267] = new ModelRendererTurbo(this, 1009, 363, textureX, textureY); // Box 419
		bodyModel[268] = new ModelRendererTurbo(this, 1017, 363, textureX, textureY); // Box 421
		bodyModel[269] = new ModelRendererTurbo(this, 1025, 363, textureX, textureY); // Box 422
		bodyModel[270] = new ModelRendererTurbo(this, 1033, 363, textureX, textureY); // Box 423
		bodyModel[271] = new ModelRendererTurbo(this, 1041, 363, textureX, textureY); // Box 424
		bodyModel[272] = new ModelRendererTurbo(this, 1049, 363, textureX, textureY); // Box 425
		bodyModel[273] = new ModelRendererTurbo(this, 1057, 363, textureX, textureY); // Box 426
		bodyModel[274] = new ModelRendererTurbo(this, 1065, 363, textureX, textureY); // Box 427
		bodyModel[275] = new ModelRendererTurbo(this, 1073, 363, textureX, textureY); // Box 428
		bodyModel[276] = new ModelRendererTurbo(this, 1081, 363, textureX, textureY); // Box 429
		bodyModel[277] = new ModelRendererTurbo(this, 1089, 363, textureX, textureY); // Box 430
		bodyModel[278] = new ModelRendererTurbo(this, 1097, 363, textureX, textureY); // Box 431
		bodyModel[279] = new ModelRendererTurbo(this, 1105, 363, textureX, textureY); // Box 432
		bodyModel[280] = new ModelRendererTurbo(this, 1113, 363, textureX, textureY); // Box 433
		bodyModel[281] = new ModelRendererTurbo(this, 1121, 363, textureX, textureY); // Box 434
		bodyModel[282] = new ModelRendererTurbo(this, 1129, 363, textureX, textureY); // Box 435
		bodyModel[283] = new ModelRendererTurbo(this, 1137, 363, textureX, textureY); // Box 436
		bodyModel[284] = new ModelRendererTurbo(this, 1145, 363, textureX, textureY); // Box 437
		bodyModel[285] = new ModelRendererTurbo(this, 1153, 363, textureX, textureY); // Box 438
		bodyModel[286] = new ModelRendererTurbo(this, 1161, 363, textureX, textureY); // Box 439
		bodyModel[287] = new ModelRendererTurbo(this, 1169, 363, textureX, textureY); // Box 440
		bodyModel[288] = new ModelRendererTurbo(this, 1177, 363, textureX, textureY); // Box 441
		bodyModel[289] = new ModelRendererTurbo(this, 1185, 363, textureX, textureY); // Box 442
		bodyModel[290] = new ModelRendererTurbo(this, 1193, 363, textureX, textureY); // Box 443
		bodyModel[291] = new ModelRendererTurbo(this, 1201, 363, textureX, textureY); // Box 444
		bodyModel[292] = new ModelRendererTurbo(this, 1209, 363, textureX, textureY); // Box 445
		bodyModel[293] = new ModelRendererTurbo(this, 1217, 363, textureX, textureY); // Box 446
		bodyModel[294] = new ModelRendererTurbo(this, 1225, 363, textureX, textureY); // Box 447
		bodyModel[295] = new ModelRendererTurbo(this, 1233, 363, textureX, textureY); // Box 448
		bodyModel[296] = new ModelRendererTurbo(this, 1241, 363, textureX, textureY); // Box 449
		bodyModel[297] = new ModelRendererTurbo(this, 1249, 363, textureX, textureY); // Box 450
		bodyModel[298] = new ModelRendererTurbo(this, 1257, 363, textureX, textureY); // Box 451
		bodyModel[299] = new ModelRendererTurbo(this, 1265, 363, textureX, textureY); // Box 452
		bodyModel[300] = new ModelRendererTurbo(this, 1273, 363, textureX, textureY); // Box 453
		bodyModel[301] = new ModelRendererTurbo(this, 1281, 363, textureX, textureY); // Box 454
		bodyModel[302] = new ModelRendererTurbo(this, 1289, 363, textureX, textureY); // Box 455
		bodyModel[303] = new ModelRendererTurbo(this, 1297, 363, textureX, textureY); // Box 456
		bodyModel[304] = new ModelRendererTurbo(this, 1305, 363, textureX, textureY); // Box 457
		bodyModel[305] = new ModelRendererTurbo(this, 1313, 363, textureX, textureY); // Box 458
		bodyModel[306] = new ModelRendererTurbo(this, 1321, 363, textureX, textureY); // Box 459
		bodyModel[307] = new ModelRendererTurbo(this, 1329, 363, textureX, textureY); // Box 460
		bodyModel[308] = new ModelRendererTurbo(this, 1337, 363, textureX, textureY); // Box 461
		bodyModel[309] = new ModelRendererTurbo(this, 1345, 363, textureX, textureY); // Box 462
		bodyModel[310] = new ModelRendererTurbo(this, 1353, 363, textureX, textureY); // Box 463
		bodyModel[311] = new ModelRendererTurbo(this, 1361, 363, textureX, textureY); // Box 464
		bodyModel[312] = new ModelRendererTurbo(this, 1369, 363, textureX, textureY); // Box 465
		bodyModel[313] = new ModelRendererTurbo(this, 1377, 363, textureX, textureY); // Box 466
		bodyModel[314] = new ModelRendererTurbo(this, 1385, 363, textureX, textureY); // Box 467
		bodyModel[315] = new ModelRendererTurbo(this, 1393, 363, textureX, textureY); // Box 468
		bodyModel[316] = new ModelRendererTurbo(this, 1401, 363, textureX, textureY); // Box 469
		bodyModel[317] = new ModelRendererTurbo(this, 1409, 363, textureX, textureY); // Box 470
		bodyModel[318] = new ModelRendererTurbo(this, 1417, 363, textureX, textureY); // Box 471
		bodyModel[319] = new ModelRendererTurbo(this, 1425, 363, textureX, textureY); // Box 472
		bodyModel[320] = new ModelRendererTurbo(this, 1433, 363, textureX, textureY); // Box 473
		bodyModel[321] = new ModelRendererTurbo(this, 1441, 363, textureX, textureY); // Box 474
		bodyModel[322] = new ModelRendererTurbo(this, 1449, 363, textureX, textureY); // Box 475
		bodyModel[323] = new ModelRendererTurbo(this, 1457, 363, textureX, textureY); // Box 476
		bodyModel[324] = new ModelRendererTurbo(this, 1465, 363, textureX, textureY); // Box 477
		bodyModel[325] = new ModelRendererTurbo(this, 1473, 363, textureX, textureY); // Box 478
		bodyModel[326] = new ModelRendererTurbo(this, 1481, 363, textureX, textureY); // Box 480
		bodyModel[327] = new ModelRendererTurbo(this, 1489, 363, textureX, textureY); // Box 481
		bodyModel[328] = new ModelRendererTurbo(this, 1497, 363, textureX, textureY); // Box 482
		bodyModel[329] = new ModelRendererTurbo(this, 1505, 363, textureX, textureY); // Box 483
		bodyModel[330] = new ModelRendererTurbo(this, 1513, 363, textureX, textureY); // Box 484
		bodyModel[331] = new ModelRendererTurbo(this, 1521, 363, textureX, textureY); // Box 485
		bodyModel[332] = new ModelRendererTurbo(this, 1529, 363, textureX, textureY); // Box 486
		bodyModel[333] = new ModelRendererTurbo(this, 1537, 363, textureX, textureY); // Box 487
		bodyModel[334] = new ModelRendererTurbo(this, 1545, 363, textureX, textureY); // Box 488
		bodyModel[335] = new ModelRendererTurbo(this, 1553, 363, textureX, textureY); // Box 489
		bodyModel[336] = new ModelRendererTurbo(this, 1561, 363, textureX, textureY); // Box 460
		bodyModel[337] = new ModelRendererTurbo(this, 1569, 363, textureX, textureY); // Box 461
		bodyModel[338] = new ModelRendererTurbo(this, 1577, 363, textureX, textureY); // Box 462
		bodyModel[339] = new ModelRendererTurbo(this, 1585, 363, textureX, textureY); // Box 463
		bodyModel[340] = new ModelRendererTurbo(this, 1593, 363, textureX, textureY); // Box 464
		bodyModel[341] = new ModelRendererTurbo(this, 1601, 363, textureX, textureY); // Box 465
		bodyModel[342] = new ModelRendererTurbo(this, 1609, 363, textureX, textureY); // Box 466
		bodyModel[343] = new ModelRendererTurbo(this, 1617, 363, textureX, textureY); // Box 467
		bodyModel[344] = new ModelRendererTurbo(this, 1625, 363, textureX, textureY); // Box 468
		bodyModel[345] = new ModelRendererTurbo(this, 1633, 363, textureX, textureY); // Box 469
		bodyModel[346] = new ModelRendererTurbo(this, 1641, 363, textureX, textureY); // Box 470
		bodyModel[347] = new ModelRendererTurbo(this, 1649, 363, textureX, textureY); // Box 471
		bodyModel[348] = new ModelRendererTurbo(this, 1657, 363, textureX, textureY); // Box 472
		bodyModel[349] = new ModelRendererTurbo(this, 1665, 363, textureX, textureY); // Box 473
		bodyModel[350] = new ModelRendererTurbo(this, 1673, 363, textureX, textureY); // Box 474
		bodyModel[351] = new ModelRendererTurbo(this, 1681, 363, textureX, textureY); // Box 475
		bodyModel[352] = new ModelRendererTurbo(this, 1689, 363, textureX, textureY); // Box 476
		bodyModel[353] = new ModelRendererTurbo(this, 1697, 363, textureX, textureY); // Box 477
		bodyModel[354] = new ModelRendererTurbo(this, 1705, 363, textureX, textureY); // Box 478
		bodyModel[355] = new ModelRendererTurbo(this, 1713, 363, textureX, textureY); // Box 479
		bodyModel[356] = new ModelRendererTurbo(this, 1721, 363, textureX, textureY); // Box 480
		bodyModel[357] = new ModelRendererTurbo(this, 1729, 363, textureX, textureY); // Box 481
		bodyModel[358] = new ModelRendererTurbo(this, 1737, 363, textureX, textureY); // Box 482
		bodyModel[359] = new ModelRendererTurbo(this, 1745, 363, textureX, textureY); // Box 483
		bodyModel[360] = new ModelRendererTurbo(this, 1753, 363, textureX, textureY); // Box 484
		bodyModel[361] = new ModelRendererTurbo(this, 1761, 363, textureX, textureY); // Box 485
		bodyModel[362] = new ModelRendererTurbo(this, 1769, 363, textureX, textureY); // Box 486
		bodyModel[363] = new ModelRendererTurbo(this, 1769, 363, textureX, textureY); // Box 487
		bodyModel[364] = new ModelRendererTurbo(this, 1785, 363, textureX, textureY); // Box 462
		bodyModel[365] = new ModelRendererTurbo(this, 1817, 363, textureX, textureY); // Box 463
		bodyModel[366] = new ModelRendererTurbo(this, 1833, 363, textureX, textureY); // Box 465
		bodyModel[367] = new ModelRendererTurbo(this, 1849, 363, textureX, textureY); // Box 466
		bodyModel[368] = new ModelRendererTurbo(this, 1785, 363, textureX, textureY); // Box 467
		bodyModel[369] = new ModelRendererTurbo(this, 1865, 363, textureX, textureY); // Box 468
		bodyModel[370] = new ModelRendererTurbo(this, 1873, 363, textureX, textureY); // Box 469
		bodyModel[371] = new ModelRendererTurbo(this, 1881, 363, textureX, textureY); // Box 470
		bodyModel[372] = new ModelRendererTurbo(this, 1889, 363, textureX, textureY); // Box 471
		bodyModel[373] = new ModelRendererTurbo(this, 1897, 363, textureX, textureY); // Box 472
		bodyModel[374] = new ModelRendererTurbo(this, 1905, 363, textureX, textureY); // Box 512
		bodyModel[375] = new ModelRendererTurbo(this, 1929, 363, textureX, textureY); // Box 513
		bodyModel[376] = new ModelRendererTurbo(this, 1953, 363, textureX, textureY); // Box 514
		bodyModel[377] = new ModelRendererTurbo(this, 1969, 363, textureX, textureY); // Box 515
		bodyModel[378] = new ModelRendererTurbo(this, 1985, 363, textureX, textureY); // Box 516
		bodyModel[379] = new ModelRendererTurbo(this, 2009, 363, textureX, textureY); // Box 517
		bodyModel[380] = new ModelRendererTurbo(this, 2033, 363, textureX, textureY); // Box 518
		bodyModel[381] = new ModelRendererTurbo(this, 41, 386, textureX, textureY); // Box 601
		bodyModel[382] = new ModelRendererTurbo(this, 57, 386, textureX, textureY); // Box 602
		bodyModel[383] = new ModelRendererTurbo(this, 33, 386, textureX, textureY); // Box 603
		bodyModel[384] = new ModelRendererTurbo(this, 73, 386, textureX, textureY); // Box 604
		bodyModel[385] = new ModelRendererTurbo(this, 81, 386, textureX, textureY); // Box 967
		bodyModel[386] = new ModelRendererTurbo(this, 121, 386, textureX, textureY); // Box 968
		bodyModel[387] = new ModelRendererTurbo(this, 137, 386, textureX, textureY); // Box 525
		bodyModel[388] = new ModelRendererTurbo(this, 177, 386, textureX, textureY); // Box 526
		bodyModel[389] = new ModelRendererTurbo(this, 193, 386, textureX, textureY); // Box 249
		bodyModel[390] = new ModelRendererTurbo(this, 217, 386, textureX, textureY); // Box 254
		bodyModel[391] = new ModelRendererTurbo(this, 241, 386, textureX, textureY); // Box 263
		bodyModel[392] = new ModelRendererTurbo(this, 257, 386, textureX, textureY); // Box 264
		bodyModel[393] = new ModelRendererTurbo(this, 265, 386, textureX, textureY); // Box 265
		bodyModel[394] = new ModelRendererTurbo(this, 129, 386, textureX, textureY); // Box 266
		bodyModel[395] = new ModelRendererTurbo(this, 817, 897, textureX, textureY); // Box 558
		bodyModel[396] = new ModelRendererTurbo(this, 841, 897, textureX, textureY); // Box 559
		bodyModel[397] = new ModelRendererTurbo(this, 129, 425, textureX, textureY); // Box 560
		bodyModel[398] = new ModelRendererTurbo(this, 185, 425, textureX, textureY); // Box 541

		bodyModel[0].addShapeBox(0F, 0F, 0F, 44, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-23F, -39F, -9F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 4, 7, 5, 0F,0F, 0F, -4F, 0F, -3F, -1F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 1
		bodyModel[1].setRotationPoint(-23F, -46F, -9F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 4, 4, 3, 0F,0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 2
		bodyModel[2].setRotationPoint(-19F, -43F, -9F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 36, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[3].setRotationPoint(-15F, -41F, -9F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[4].setRotationPoint(-15F, -43F, -9F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 26, 20, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 14
		bodyModel[5].setRotationPoint(-49F, -39F, -9F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 26, 8, 9, 0F,0F, -1F, -4F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[6].setRotationPoint(-49F, -47F, -9F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 38, 20, 19, 0F,0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -3F, 0F, -6F, -2F, 0F, 0F, 1F); // Box 18
		bodyModel[7].setRotationPoint(21F, -39F, -10F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 38, 12, 9, 0F,0F, -1F, -5F, 0F, -7F, -5F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, -3F, 0F, 1F, 0F, 0F, -2F, 0F); // Box 19
		bodyModel[8].setRotationPoint(21F, -52F, -9F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[9].setRotationPoint(-12F, -43F, -9F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 26
		bodyModel[10].setRotationPoint(-12F, -46F, -9F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 27
		bodyModel[11].setRotationPoint(-12F, -50F, -8F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 28
		bodyModel[12].setRotationPoint(-12F, -53F, -6F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 29
		bodyModel[13].setRotationPoint(-12F, -53F, -2F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 8, 7, 3, 0F,0F, -6F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -6F, -2F, 0F, 0F, 0F, 0F, -6F, -2F, 0F, -6F, 0F, 0F, 0F, -2F); // Box 30
		bodyModel[14].setRotationPoint(-23F, -52F, -5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 26, 5, 9, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 37
		bodyModel[15].setRotationPoint(-49F, -20F, -9F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 22, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[16].setRotationPoint(-23F, -19F, -9F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 13, 3, 9, 0F,0F, 0F, 0.6F, 0F, 0F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[17].setRotationPoint(-1F, -19F, -9F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 9, 1, 19, 0F,0F, 0F, 0.8F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9999F, 0F, -0.9999F, 1F, 0F, -0.9999F, 0F, 0F, 0F, -0.9999F); // Box 40
		bodyModel[18].setRotationPoint(12F, -19F, -9F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 11, 8, 18, 0F,-2F, -1F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, -2F, -1F, 0F, 0F, 0F, -2F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -2F); // Box 41
		bodyModel[19].setRotationPoint(10F, -19F, -9F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 7, 7, 19, 0F,0F, 0F, 0F, -6.9999F, 0F, 0F, -6.9999F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.9999F, 0F, -1.9999F, -1.9999F, 0F, -1.9999F, -0.9999F, 0F, 0F, -0.9999F); // Box 42
		bodyModel[20].setRotationPoint(21F, -19F, -10F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 38, 11, 19, 0F,0F, -6F, 0F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, -6F, 1F, -7F, 0F, -2F, 0F, -8F, -4F, 0F, -8F, -3F, -7F, 0F, -1F); // Box 43
		bodyModel[21].setRotationPoint(21F, -25F, -10F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 7, 4, 15, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -2F, 1F, 0F, 0F, -1F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -1F); // Box 46
		bodyModel[22].setRotationPoint(21F, -14F, -8F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 11, 3, 14, 0F,0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, -1F); // Box 47
		bodyModel[23].setRotationPoint(10F, -12F, -7F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 13, 8, 16, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -2F, 0F, -1F, -1F, -1F, -2F, -1F, -1F, -2F, -1F, -1F, -1F, -1F, -1F); // Box 48
		bodyModel[24].setRotationPoint(-1F, -18F, -8F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 6, 6, 3, 0F,0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, -1F, -2F, 0F, -2F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -2F, -1F); // Box 49
		bodyModel[25].setRotationPoint(-6F, -16F, -8F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 5, 1, 16, 0F,0F, 0F, -0.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9999F, 0F, 0F, 0F, 0F, -0.9999F, 0F, 0F, -0.9999F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[26].setRotationPoint(-6F, -16F, -8F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 6, 2, 14, 0F,0F, 2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, -3F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -3F, -1F); // Box 54
		bodyModel[27].setRotationPoint(-6F, -10F, -7F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 10, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -2F, -1F); // Box 55
		bodyModel[28].setRotationPoint(0F, -11F, -7F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 31, 11, 7, 0F,0F, -8.9999F, 1F, 0F, -1F, -0.9999F, 0F, 0F, 0F, 0F, -8.9999F, 0F, 0F, 1F, -0.9999F, 0F, -9.9999F, -0.9999F, 0F, -8.9999F, 0F, 0F, 1F, 0F); // Box 112
		bodyModel[29].setRotationPoint(28F, -23F, -7F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 32, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[30].setRotationPoint(-11F, -42F, -9F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 38, 3, 9, 0F,0F, 0F, 0F, 0F, -2.9999F, -2.9999F, 0F, -2.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.9999F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[31].setRotationPoint(21F, -42F, -9F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 4, 9, 6, 0F,0F, 0.5F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 111
		bodyModel[32].setRotationPoint(17F, -51F, -9F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 7, 3, 3, 0F,0F, 0F, -2F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, -6.9999F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, -2.3F, -6.9999F, 0F, -2.3F); // Box 113
		bodyModel[33].setRotationPoint(10F, -52F, -5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F,0F, -1F, 0F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 1F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[34].setRotationPoint(10F, -53F, -3F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, -0.5F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 115
		bodyModel[35].setRotationPoint(17F, -52F, -3F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[36].setRotationPoint(4F, -53F, -3F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 117
		bodyModel[37].setRotationPoint(-4F, -46F, -9F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		bodyModel[38].setRotationPoint(-4F, -43F, -9F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[39].setRotationPoint(4F, -43F, -9F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 120
		bodyModel[40].setRotationPoint(4F, -46F, -9F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 17, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[41].setRotationPoint(-12F, -50F, -6F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 122
		bodyModel[42].setRotationPoint(-4F, -50F, -8F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 123
		bodyModel[43].setRotationPoint(4F, -50F, -8F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		bodyModel[44].setRotationPoint(4F, -52F, -6F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, -2F, 3F, 0F, -2F, -3F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 2F, 3F, 0F, 2F, -3F, -1F, 0F, -1F); // Box 125
		bodyModel[45].setRotationPoint(-15F, -52F, -3F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 126
		bodyModel[46].setRotationPoint(-15F, -52F, -3F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -1.9999F, 0F, 0F, 0F, -1.05F, 0F, 0F, 1F, 0F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		bodyModel[47].setRotationPoint(14F, -44F, -9F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 44, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 128
		bodyModel[48].setRotationPoint(-23F, -39F, 8F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 4, 7, 5, 0F,0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F, -1F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[49].setRotationPoint(-23F, -46F, 4F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 4, 4, 3, 0F,0F, 0F, -1F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[50].setRotationPoint(-19F, -43F, 6F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 36, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[51].setRotationPoint(-15F, -41F, 8F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[52].setRotationPoint(-15F, -43F, 8F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 26, 8, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133
		bodyModel[53].setRotationPoint(-49F, -47F, 0F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 38, 12, 9, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -7F, -5F, 0F, -1F, -5F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, -3F, 0F, -2F, 0F); // Box 134
		bodyModel[54].setRotationPoint(21F, -52F, 0F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[55].setRotationPoint(-12F, -43F, 8F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		bodyModel[56].setRotationPoint(-12F, -46F, 7F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		bodyModel[57].setRotationPoint(-12F, -50F, 5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[58].setRotationPoint(-12F, -53F, 2F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 142
		bodyModel[59].setRotationPoint(-12F, -53F, 0F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 8, 7, 3, 0F,0F, -6F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -6F, 0F, 0F, 0F, -2F, 0F, -6F, 0F, 0F, -6F, -2F, 0F, 0F, 0F); // Box 143
		bodyModel[60].setRotationPoint(-23F, -52F, 2F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 26, 5, 9, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -2F, -3F); // Box 150
		bodyModel[61].setRotationPoint(-49F, -20F, 0F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 22, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -2F); // Box 151
		bodyModel[62].setRotationPoint(-23F, -19F, 0F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 13, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.8F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F); // Box 152
		bodyModel[63].setRotationPoint(-1F, -19F, 0F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 6, 6, 3, 0F,0F, -1F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -2F, -1F); // Box 154
		bodyModel[64].setRotationPoint(-6F, -16F, 5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 31, 11, 7, 0F,0F, -8.9999F, 0F, 0F, 0F, 0F, 0F, -1F, -0.9999F, 0F, -8.9999F, 1F, 0F, 1F, 0F, 0F, -8.9999F, 0F, 0F, -9.9999F, -0.9999F, 0F, 1F, -1.9999F); // Box 155
		bodyModel[65].setRotationPoint(28F, -23F, 0F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 32, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 208
		bodyModel[66].setRotationPoint(-11F, -42F, 8F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 38, 3, 9, 0F,0F, 0F, 0F, 0F, -2.9999F, 0F, 0F, -2.9999F, -2.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.9999F, 0F, 0F, 0F); // Box 209
		bodyModel[67].setRotationPoint(21F, -42F, 0F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 4, 9, 6, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0.5F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		bodyModel[68].setRotationPoint(17F, -51F, 3F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 1F, 0F, 0F, 0F); // Box 212
		bodyModel[69].setRotationPoint(10F, -53F, 0F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 1F); // Box 213
		bodyModel[70].setRotationPoint(17F, -52F, 0F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 214
		bodyModel[71].setRotationPoint(4F, -53F, 0F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 215
		bodyModel[72].setRotationPoint(-4F, -46F, 7F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 216
		bodyModel[73].setRotationPoint(-4F, -43F, 8F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		bodyModel[74].setRotationPoint(4F, -43F, 8F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 218
		bodyModel[75].setRotationPoint(4F, -46F, 7F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 17, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		bodyModel[76].setRotationPoint(-12F, -50F, 5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		bodyModel[77].setRotationPoint(-4F, -50F, 6F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221
		bodyModel[78].setRotationPoint(4F, -50F, 6F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 222
		bodyModel[79].setRotationPoint(4F, -52F, 5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, -1F, 0F, -2F, -3F, 0F, -2F, 3F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 2F, -3F, 0F, 2F, 3F, 0F, 0F, 0F); // Box 223
		bodyModel[80].setRotationPoint(-15F, -52F, 2F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[81].setRotationPoint(-15F, -52F, 0F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 695
		bodyModel[82].setRotationPoint(8F, -68F, -0.5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 46, 10, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		bodyModel[83].setRotationPoint(-21F, -29F, -8F);

		bodyModel[84].addShapeBox(0F, 1F, 0F, 10, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
		bodyModel[84].setRotationPoint(-9F, -33F, -5F);
		bodyModel[84].rotateAngleZ = -0.10471976F;

		bodyModel[85].addShapeBox(9F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		bodyModel[85].setRotationPoint(-9F, -33F, -5F);
		bodyModel[85].rotateAngleZ = -0.10471976F;

		bodyModel[86].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		bodyModel[86].setRotationPoint(-9F, -33F, -5F);
		bodyModel[86].rotateAngleZ = -0.10471976F;

		bodyModel[87].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		bodyModel[87].setRotationPoint(-9F, -33F, 4F);
		bodyModel[87].rotateAngleZ = -0.10471976F;

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		bodyModel[88].setRotationPoint(-9F, -33F, -5F);
		bodyModel[88].rotateAngleZ = -0.10471976F;

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 15, 10, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		bodyModel[89].setRotationPoint(0F, -47F, -5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[90].setRotationPoint(2F, -51F, -3F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 15, 8, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 246
		bodyModel[91].setRotationPoint(-1F, -46F, -4F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[92].setRotationPoint(-1.3F, -46.3F, -2F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[93].setRotationPoint(-1.3F, -46.3F, 1F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[94].setRotationPoint(1F, -44F, -4F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 251
		bodyModel[95].setRotationPoint(1F, -44F, 3F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[96].setRotationPoint(-6F, -32F, -6F);
		bodyModel[96].rotateAngleZ = 0.78539816F;

		bodyModel[97].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 253
		bodyModel[97].setRotationPoint(-6F, -32F, 5F);
		bodyModel[97].rotateAngleZ = 0.78539816F;

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 962
		bodyModel[98].setRotationPoint(1.5F, -50.5F, -1.5F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 964
		bodyModel[99].setRotationPoint(1.5F, -49.5F, -1.5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 966
		bodyModel[100].setRotationPoint(1.5F, -48.5F, -1.5F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 7, 5, 7, 0F,-0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 268
		bodyModel[101].setRotationPoint(6F, -48F, -3.5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 5, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 269
		bodyModel[102].setRotationPoint(14F, -47F, -2.5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 922
		bodyModel[103].setRotationPoint(6.5F, -48.3F, -3F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 923
		bodyModel[104].setRotationPoint(6.5F, -48.3F, 1F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 924
		bodyModel[105].setRotationPoint(8.5F, -48.3F, -1F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.4F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Box 925
		bodyModel[106].setRotationPoint(10.5F, -48.3F, -1F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 926
		bodyModel[107].setRotationPoint(6.5F, -48.3F, -1F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 5, 7, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 927
		bodyModel[108].setRotationPoint(6F, -48F, -3.5F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 7, 1, 7, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 928
		bodyModel[109].setRotationPoint(6F, -48.5F, -3.5F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 5, 7, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 929
		bodyModel[110].setRotationPoint(12F, -48F, -3.5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 930
		bodyModel[111].setRotationPoint(11F, -47F, -3.3F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 931
		bodyModel[112].setRotationPoint(9F, -47F, -3.3F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 932
		bodyModel[113].setRotationPoint(7F, -45F, -3.3F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 933
		bodyModel[114].setRotationPoint(14F, -47F, -0.5F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.2F, 0.6F, -0.1F, 0F, 0.6F, -0.1F, 0F, 0.6F, -0.1F, -0.2F, 0.6F, -0.1F, -0.2F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.2F, 0F, -0.1F); // Box 934
		bodyModel[115].setRotationPoint(13F, -47F, -0.5F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0.6F, -0.1F, -0.2F, 0.6F, -0.1F, -0.2F, 0.6F, -0.1F, 0F, 0.6F, -0.1F, 0F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 935
		bodyModel[116].setRotationPoint(19F, -47F, -0.5F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F); // Box 936
		bodyModel[117].setRotationPoint(15.5F, -46F, -3F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F); // Box 937
		bodyModel[118].setRotationPoint(17.5F, -46F, -3F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F); // Box 938
		bodyModel[119].setRotationPoint(14.5F, -46F, -3F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 939
		bodyModel[120].setRotationPoint(14.8F, -46F, -3.3F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 940
		bodyModel[121].setRotationPoint(6.8F, -49.3F, -0.5F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 941
		bodyModel[122].setRotationPoint(11.2F, -49.3F, -0.5F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 942
		bodyModel[123].setRotationPoint(9F, -49.3F, -0.5F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 943
		bodyModel[124].setRotationPoint(9F, -49.3F, -0.5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 945
		bodyModel[125].setRotationPoint(9F, -49.3F, 0.5F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 947
		bodyModel[126].setRotationPoint(9F, -49.6F, -0.5F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 948
		bodyModel[127].setRotationPoint(6F, -48.8F, 0.5F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 949
		bodyModel[128].setRotationPoint(6.8F, -49.6F, -0.5F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 950
		bodyModel[129].setRotationPoint(6.8F, -49.3F, -0.5F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 951
		bodyModel[130].setRotationPoint(6.8F, -49.3F, 0.5F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1.4F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -1.4F, -0.3F, -0.4F, 0.4F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.4F, 0.4F, -0.3F); // Box 952
		bodyModel[131].setRotationPoint(5F, -48.8F, 0.5F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 953
		bodyModel[132].setRotationPoint(4.7F, -47.4F, 0.5F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 954
		bodyModel[133].setRotationPoint(11.2F, -49.6F, -1.5F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 955
		bodyModel[134].setRotationPoint(11.2F, -49.3F, -0.5F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 956
		bodyModel[135].setRotationPoint(11.2F, -49.3F, -1.5F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.3F, -0.6F, 0.3F, -0.3F, -0.6F, 0.3F, -0.3F, -0.6F, 0.3F, -0.3F, -0.6F, 0.3F, -0.3F, 0F, 0.7F, -0.3F, 0F, 0.7F, -0.3F, 0F, 0.3F, -0.3F, 0F, 0.3F); // Box 957
		bodyModel[136].setRotationPoint(11.2F, -49.3F, -3.5F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 958
		bodyModel[137].setRotationPoint(11.2F, -48.3F, -4.5F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 959
		bodyModel[138].setRotationPoint(5F, -43.8F, -4.5F);

		bodyModel[139].addShapeBox(0F, -3F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 259
		bodyModel[139].setRotationPoint(-20F, -30F, -6F);
		bodyModel[139].rotateAngleZ = 0.15707963F;

		bodyModel[140].addShapeBox(0F, -3F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
		bodyModel[140].setRotationPoint(-20F, -30F, 4F);
		bodyModel[140].rotateAngleZ = 0.15707963F;

		bodyModel[141].addShapeBox(0F, 0F, 0F, 5, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 262
		bodyModel[141].setRotationPoint(-21F, -36F, -8F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 6, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 255
		bodyModel[142].setRotationPoint(-16F, -41F, -8F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 5, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 256
		bodyModel[143].setRotationPoint(-21F, -37F, -2F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 2, 16, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 257
		bodyModel[144].setRotationPoint(-16F, -43F, -8F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, 0.5F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 258
		bodyModel[145].setRotationPoint(-16F, -44F, -7F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 213
		bodyModel[146].setRotationPoint(-15.8F, -41.3F, -4F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, -0.4F, -3F, 0F, -0.4F, -3F, 0F, -0.4F, -3F, 0F, -0.4F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 214
		bodyModel[147].setRotationPoint(-15.8F, -42.3F, -4F);

		bodyModel[148].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F); // Box 233
		bodyModel[148].setRotationPoint(-15.7F, -40.1F, 2.7F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F); // Box 234
		bodyModel[149].setRotationPoint(-15.6F, -41.1F, -0.9F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F); // Box 235
		bodyModel[150].setRotationPoint(-15.6F, -41.1F, -0.9F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F); // Box 236
		bodyModel[151].setRotationPoint(-15.6F, -41.1F, -0.9F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 237
		bodyModel[152].setRotationPoint(-15.6F, -40.1F, -0.9F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 238
		bodyModel[153].setRotationPoint(-15.6F, -40.1F, -0.9F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 239
		bodyModel[154].setRotationPoint(-15.6F, -40.1F, 0.1F);

		bodyModel[155].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 240
		bodyModel[155].setRotationPoint(-15.7F, -40.1F, 0.1F);
		bodyModel[155].rotateAngleX = 5.49778714F;

		bodyModel[156].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 241
		bodyModel[156].setRotationPoint(-15.7F, -40.1F, 0.1F);

		bodyModel[157].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F); // Box 242
		bodyModel[157].setRotationPoint(-15.7F, -40.1F, 0.1F);

		bodyModel[158].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 243
		bodyModel[158].setRotationPoint(-15.6F, -40.1F, 0.1F);

		bodyModel[159].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 244
		bodyModel[159].setRotationPoint(-15.7F, -40.1F, 0.1F);
		bodyModel[159].rotateAngleX = 3.14159265F;

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 248
		bodyModel[160].setRotationPoint(-15.6F, -41.1F, 0.1F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 249
		bodyModel[161].setRotationPoint(-15.6F, -41.1F, 0.1F);

		bodyModel[162].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 250
		bodyModel[162].setRotationPoint(-15.7F, -40.1F, 0.1F);
		bodyModel[162].rotateAngleX = 4.71238898F;

		bodyModel[163].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 251
		bodyModel[163].setRotationPoint(-15.7F, -40.1F, 0.1F);
		bodyModel[163].rotateAngleX = 3.92699082F;

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F); // Box 252
		bodyModel[164].setRotationPoint(-15.6F, -41.1F, 1.7F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F); // Box 253
		bodyModel[165].setRotationPoint(-15.6F, -41.1F, 1.7F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F); // Box 254
		bodyModel[166].setRotationPoint(-15.6F, -41.1F, 1.7F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 255
		bodyModel[167].setRotationPoint(-15.6F, -41.1F, 2.7F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 256
		bodyModel[168].setRotationPoint(-15.6F, -41.1F, 2.7F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 257
		bodyModel[169].setRotationPoint(-15.6F, -40.1F, 2.7F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 258
		bodyModel[170].setRotationPoint(-15.6F, -40.1F, 1.7F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 259
		bodyModel[171].setRotationPoint(-15.6F, -40.1F, 1.7F);

		bodyModel[172].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 260
		bodyModel[172].setRotationPoint(-15.7F, -40.1F, 2.7F);
		bodyModel[172].rotateAngleX = 3.92699082F;

		bodyModel[173].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 261
		bodyModel[173].setRotationPoint(-15.7F, -40.1F, 2.7F);
		bodyModel[173].rotateAngleX = 4.71238898F;

		bodyModel[174].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 262
		bodyModel[174].setRotationPoint(-15.7F, -40.1F, 2.7F);
		bodyModel[174].rotateAngleX = 5.49778714F;

		bodyModel[175].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 263
		bodyModel[175].setRotationPoint(-15.7F, -40.1F, 2.7F);

		bodyModel[176].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 265
		bodyModel[176].setRotationPoint(-15.6F, -40.1F, 2.7F);

		bodyModel[177].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 266
		bodyModel[177].setRotationPoint(-15.7F, -40.1F, 2.7F);
		bodyModel[177].rotateAngleX = 0.78539816F;

		bodyModel[178].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 267
		bodyModel[178].setRotationPoint(-15.7F, -40.1F, 2.7F);
		bodyModel[178].rotateAngleX = 1.57079633F;

		bodyModel[179].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 268
		bodyModel[179].setRotationPoint(-15.7F, -40.1F, 2.7F);
		bodyModel[179].rotateAngleX = 2.35619449F;

		bodyModel[180].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 269
		bodyModel[180].setRotationPoint(-15.7F, -40.1F, 2.7F);
		bodyModel[180].rotateAngleX = 3.14159265F;

		bodyModel[181].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.45F, 0.3F, 0F, -0.45F, 0.3F, 0F, -0.45F, 0.3F, 0F, -0.45F, 0.3F, 0F, -0.45F, 0.3F, 0F, -0.45F, 0.3F, 0F, -0.45F, 0.3F, 0F, -0.45F, 0.3F); // Box 270
		bodyModel[181].setRotationPoint(-15.7F, -40.1F, 0.1F);
		bodyModel[181].rotateAngleX = -0.38397244F;

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F); // Box 271
		bodyModel[182].setRotationPoint(-15.7F, -40.9F, -0.9F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, -0.9F, 0F, -0.5F, -0.9F, 0F, -0.5F, -0.9F, 0F, -0.5F, -0.9F); // Box 272
		bodyModel[183].setRotationPoint(-15.7F, -40.7F, -0.9F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 273
		bodyModel[184].setRotationPoint(-15.6F, -37.5F, -3.7F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 274
		bodyModel[185].setRotationPoint(-15.6F, -37.5F, -3.7F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F); // Box 275
		bodyModel[186].setRotationPoint(-15.6F, -38.5F, -3.7F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F); // Box 276
		bodyModel[187].setRotationPoint(-15.6F, -38.5F, -3.7F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F); // Box 277
		bodyModel[188].setRotationPoint(-15.6F, -38.5F, -3.7F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 278
		bodyModel[189].setRotationPoint(-15.6F, -38.5F, -2.7F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 279
		bodyModel[190].setRotationPoint(-15.6F, -38.5F, -2.7F);

		bodyModel[191].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 280
		bodyModel[191].setRotationPoint(-15.7F, -37.5F, -2.7F);
		bodyModel[191].rotateAngleX = 0.78539816F;

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 281
		bodyModel[192].setRotationPoint(-15.6F, -37.5F, -2.7F);

		bodyModel[193].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 282
		bodyModel[193].setRotationPoint(-15.7F, -37.5F, -2.7F);
		bodyModel[193].rotateAngleX = 5.49778714F;

		bodyModel[194].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 283
		bodyModel[194].setRotationPoint(-15.7F, -37.5F, -2.7F);

		bodyModel[195].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 284
		bodyModel[195].setRotationPoint(-15.7F, -37.5F, -2.7F);
		bodyModel[195].rotateAngleX = 1.57079633F;

		bodyModel[196].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 285
		bodyModel[196].setRotationPoint(-15.7F, -37.5F, -2.7F);
		bodyModel[196].rotateAngleX = 2.35619449F;

		bodyModel[197].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 286
		bodyModel[197].setRotationPoint(-15.7F, -37.5F, -2.7F);
		bodyModel[197].rotateAngleX = 3.14159265F;

		bodyModel[198].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 287
		bodyModel[198].setRotationPoint(-15.6F, -37.5F, -2.7F);

		bodyModel[199].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F); // Box 288
		bodyModel[199].setRotationPoint(-15.7F, -37.5F, -2.7F);
		bodyModel[199].rotateAngleX = -3.90953752F;

		bodyModel[200].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 289
		bodyModel[200].setRotationPoint(-15.7F, -37.5F, -2.7F);
		bodyModel[200].rotateAngleX = 4.71238898F;

		bodyModel[201].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 290
		bodyModel[201].setRotationPoint(-15.7F, -37.5F, -2.7F);
		bodyModel[201].rotateAngleX = 3.92699082F;

		bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 318
		bodyModel[202].setRotationPoint(-15.8F, -40.1F, 4.8F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 319
		bodyModel[203].setRotationPoint(-15.8F, -40.1F, 4.8F);

		bodyModel[204].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 320
		bodyModel[204].setRotationPoint(-15.9F, -40.1F, 5.8F);
		bodyModel[204].rotateAngleX = 3.92699082F;

		bodyModel[205].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F); // Box 321
		bodyModel[205].setRotationPoint(-15.8F, -41.1F, 4.8F);

		bodyModel[206].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 322
		bodyModel[206].setRotationPoint(-15.9F, -40.1F, 5.8F);
		bodyModel[206].rotateAngleX = 3.14159265F;

		bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F); // Box 323
		bodyModel[207].setRotationPoint(-15.8F, -41.1F, 4.8F);

		bodyModel[208].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 324
		bodyModel[208].setRotationPoint(-15.9F, -40.1F, 5.8F);
		bodyModel[208].rotateAngleX = 2.35619449F;

		bodyModel[209].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F); // Box 325
		bodyModel[209].setRotationPoint(-15.8F, -41.1F, 4.8F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 326
		bodyModel[210].setRotationPoint(-15.8F, -41.1F, 5.8F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 327
		bodyModel[211].setRotationPoint(-15.8F, -41.1F, 5.8F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 328
		bodyModel[212].setRotationPoint(-15.8F, -40.1F, 5.8F);

		bodyModel[213].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 329
		bodyModel[213].setRotationPoint(-15.9F, -40.1F, 5.8F);
		bodyModel[213].rotateAngleX = 5.49778714F;

		bodyModel[214].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 330
		bodyModel[214].setRotationPoint(-15.9F, -40.1F, 5.8F);

		bodyModel[215].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 331
		bodyModel[215].setRotationPoint(-15.9F, -40.1F, 5.8F);
		bodyModel[215].rotateAngleX = 0.78539816F;

		bodyModel[216].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 332
		bodyModel[216].setRotationPoint(-15.9F, -40.1F, 5.8F);
		bodyModel[216].rotateAngleX = 1.57079633F;

		bodyModel[217].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F); // Box 333
		bodyModel[217].setRotationPoint(-15.9F, -40.1F, 5.8F);
		bodyModel[217].rotateAngleX = -3.90953752F;

		bodyModel[218].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 334
		bodyModel[218].setRotationPoint(-15.8F, -40.1F, 5.8F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 340
		bodyModel[219].setRotationPoint(-15.8F, -43.6F, 4.4F);

		bodyModel[220].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F); // Box 341
		bodyModel[220].setRotationPoint(-15.9F, -42.6F, 4.4F);
		bodyModel[220].rotateAngleX = -1.57079633F;

		bodyModel[221].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 342
		bodyModel[221].setRotationPoint(-15.8F, -42.6F, 4.4F);

		bodyModel[222].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 343
		bodyModel[222].setRotationPoint(-15.9F, -42.6F, 4.4F);
		bodyModel[222].rotateAngleX = 5.49778714F;

		bodyModel[223].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 344
		bodyModel[223].setRotationPoint(-15.8F, -42.6F, 4.4F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 345
		bodyModel[224].setRotationPoint(-15.8F, -42.6F, 3.4F);

		bodyModel[225].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 346
		bodyModel[225].setRotationPoint(-15.9F, -42.6F, 4.4F);
		bodyModel[225].rotateAngleX = 4.71238898F;

		bodyModel[226].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 347
		bodyModel[226].setRotationPoint(-15.9F, -42.6F, 4.4F);
		bodyModel[226].rotateAngleX = 3.92699082F;

		bodyModel[227].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 348
		bodyModel[227].setRotationPoint(-15.8F, -42.6F, 3.4F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F); // Box 349
		bodyModel[228].setRotationPoint(-15.8F, -43.6F, 3.4F);

		bodyModel[229].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 350
		bodyModel[229].setRotationPoint(-15.9F, -42.6F, 4.4F);
		bodyModel[229].rotateAngleX = 3.14159265F;

		bodyModel[230].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F); // Box 351
		bodyModel[230].setRotationPoint(-15.8F, -43.6F, 3.4F);

		bodyModel[231].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 352
		bodyModel[231].setRotationPoint(-15.9F, -42.6F, 4.4F);
		bodyModel[231].rotateAngleX = 2.35619449F;

		bodyModel[232].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F); // Box 353
		bodyModel[232].setRotationPoint(-15.8F, -43.6F, 3.4F);

		bodyModel[233].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 354
		bodyModel[233].setRotationPoint(-15.9F, -42.6F, 4.4F);
		bodyModel[233].rotateAngleX = 1.57079633F;

		bodyModel[234].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 355
		bodyModel[234].setRotationPoint(-15.8F, -43.6F, 4.4F);

		bodyModel[235].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 356
		bodyModel[235].setRotationPoint(-15.9F, -42.6F, 4.4F);
		bodyModel[235].rotateAngleX = 0.78539816F;

		bodyModel[236].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 387
		bodyModel[236].setRotationPoint(-15.8F, -40.6F, -6.3F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F); // Box 388
		bodyModel[237].setRotationPoint(-15.8F, -40.6F, -7.3F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 390
		bodyModel[238].setRotationPoint(-15.8F, -40.6F, -6.3F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F); // Box 391
		bodyModel[239].setRotationPoint(-15.8F, -40.6F, -7.3F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 392
		bodyModel[240].setRotationPoint(-15.8F, -39.6F, -7.3F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 393
		bodyModel[241].setRotationPoint(-15.8F, -39.6F, -7.3F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 394
		bodyModel[242].setRotationPoint(-15.8F, -39.6F, -6.3F);

		bodyModel[243].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 395
		bodyModel[243].setRotationPoint(-15.8F, -40.2F, -6.3F);

		bodyModel[244].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, 0F, 0F, -0.48F, 0F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, 0F, 0F, -0.48F, 0F); // Box 396
		bodyModel[244].setRotationPoint(-15.9F, -40.2F, -6.3F);
		bodyModel[244].rotateAngleX = -1.29154365F;

		bodyModel[245].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 397
		bodyModel[245].setRotationPoint(-15.9F, -39.6F, -6.3F);
		bodyModel[245].rotateAngleX = 3.14159265F;

		bodyModel[246].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 398
		bodyModel[246].setRotationPoint(-15.9F, -39.6F, -6.3F);
		bodyModel[246].rotateAngleX = 3.92699082F;

		bodyModel[247].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 399
		bodyModel[247].setRotationPoint(-15.9F, -39.6F, -6.3F);
		bodyModel[247].rotateAngleX = 5.49778714F;

		bodyModel[248].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 400
		bodyModel[248].setRotationPoint(-15.9F, -39.6F, -6.3F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F); // Box 401
		bodyModel[249].setRotationPoint(-15.7F, -40.8F, -7.3F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F); // Box 402
		bodyModel[250].setRotationPoint(-15.6F, -41.1F, -3.7F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F); // Box 403
		bodyModel[251].setRotationPoint(-15.6F, -41.1F, -3.7F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F); // Box 404
		bodyModel[252].setRotationPoint(-15.6F, -41.1F, -3.7F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 405
		bodyModel[253].setRotationPoint(-15.6F, -41.1F, -2.7F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 406
		bodyModel[254].setRotationPoint(-15.6F, -41.1F, -2.7F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 407
		bodyModel[255].setRotationPoint(-15.6F, -40.1F, -2.7F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 408
		bodyModel[256].setRotationPoint(-15.6F, -40.1F, -3.7F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 409
		bodyModel[257].setRotationPoint(-15.6F, -40.1F, -3.7F);

		bodyModel[258].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 410
		bodyModel[258].setRotationPoint(-15.7F, -40.1F, -2.7F);
		bodyModel[258].rotateAngleX = 3.92699082F;

		bodyModel[259].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 411
		bodyModel[259].setRotationPoint(-15.7F, -40.1F, -2.7F);
		bodyModel[259].rotateAngleX = 3.14159265F;

		bodyModel[260].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 412
		bodyModel[260].setRotationPoint(-15.7F, -40.1F, -2.7F);
		bodyModel[260].rotateAngleX = 2.35619449F;

		bodyModel[261].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 413
		bodyModel[261].setRotationPoint(-15.7F, -40.1F, -2.7F);
		bodyModel[261].rotateAngleX = 1.57079633F;

		bodyModel[262].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 414
		bodyModel[262].setRotationPoint(-15.7F, -40.1F, -2.7F);
		bodyModel[262].rotateAngleX = 0.78539816F;

		bodyModel[263].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 415
		bodyModel[263].setRotationPoint(-15.7F, -40.1F, -2.7F);

		bodyModel[264].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 416
		bodyModel[264].setRotationPoint(-15.7F, -40.1F, -2.7F);
		bodyModel[264].rotateAngleX = 5.49778714F;

		bodyModel[265].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 417
		bodyModel[265].setRotationPoint(-15.7F, -40.1F, -2.7F);
		bodyModel[265].rotateAngleX = 4.71238898F;

		bodyModel[266].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 418
		bodyModel[266].setRotationPoint(-15.6F, -40.1F, -2.7F);

		bodyModel[267].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F); // Box 419
		bodyModel[267].setRotationPoint(-15.7F, -40.1F, -2.7F);
		bodyModel[267].rotateAngleX = -1.57079633F;

		bodyModel[268].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 421
		bodyModel[268].setRotationPoint(-15.6F, -38.1F, -1.1F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 422
		bodyModel[269].setRotationPoint(-15.6F, -38.1F, -1.1F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F); // Box 423
		bodyModel[270].setRotationPoint(-15.6F, -38.1F, -1.1F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F); // Box 424
		bodyModel[271].setRotationPoint(-15.6F, -38.1F, -1.1F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F); // Box 425
		bodyModel[272].setRotationPoint(-15.6F, -38.1F, -1.1F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F); // Box 426
		bodyModel[273].setRotationPoint(-15.6F, -38.1F, -1.1F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F); // Box 427
		bodyModel[274].setRotationPoint(-15.6F, -38.1F, -1.1F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 428
		bodyModel[275].setRotationPoint(-15.6F, -38.1F, -1.1F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 429
		bodyModel[276].setRotationPoint(-15.8F, -43.6F, -4.4F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 430
		bodyModel[277].setRotationPoint(-15.8F, -43.6F, -4.4F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F); // Box 431
		bodyModel[278].setRotationPoint(-15.8F, -43.6F, -5.4F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F); // Box 432
		bodyModel[279].setRotationPoint(-15.8F, -43.6F, -5.4F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F); // Box 433
		bodyModel[280].setRotationPoint(-15.8F, -43.6F, -5.4F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 434
		bodyModel[281].setRotationPoint(-15.8F, -42.6F, -5.4F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 435
		bodyModel[282].setRotationPoint(-15.8F, -42.6F, -5.4F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 436
		bodyModel[283].setRotationPoint(-15.8F, -42.6F, -4.4F);

		bodyModel[284].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 437
		bodyModel[284].setRotationPoint(-15.9F, -42.6F, -4.4F);
		bodyModel[284].rotateAngleX = 5.49778714F;

		bodyModel[285].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 438
		bodyModel[285].setRotationPoint(-15.9F, -42.6F, -4.4F);

		bodyModel[286].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 439
		bodyModel[286].setRotationPoint(-15.9F, -42.6F, -4.4F);
		bodyModel[286].rotateAngleX = 0.78539816F;

		bodyModel[287].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 440
		bodyModel[287].setRotationPoint(-15.9F, -42.6F, -4.4F);
		bodyModel[287].rotateAngleX = 1.57079633F;

		bodyModel[288].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 441
		bodyModel[288].setRotationPoint(-15.9F, -42.6F, -4.4F);
		bodyModel[288].rotateAngleX = 2.35619449F;

		bodyModel[289].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 442
		bodyModel[289].setRotationPoint(-15.9F, -42.6F, -4.4F);
		bodyModel[289].rotateAngleX = 3.14159265F;

		bodyModel[290].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 443
		bodyModel[290].setRotationPoint(-15.9F, -42.6F, -4.4F);
		bodyModel[290].rotateAngleX = 3.92699082F;

		bodyModel[291].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 444
		bodyModel[291].setRotationPoint(-15.9F, -42.6F, -4.4F);
		bodyModel[291].rotateAngleX = 4.71238898F;

		bodyModel[292].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 445
		bodyModel[292].setRotationPoint(-15.8F, -42.6F, -4.4F);

		bodyModel[293].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, 0F, 0F, -0.48F, 0F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, 0F, 0F, -0.48F, 0F); // Box 446
		bodyModel[293].setRotationPoint(-15.9F, -42.6F, -4.4F);
		bodyModel[293].rotateAngleX = -4.36332313F;

		bodyModel[294].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, 0F, 0F, -0.48F, 0F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, 0F, 0F, -0.48F, 0F); // Box 447
		bodyModel[294].setRotationPoint(-15.9F, -42.6F, -4.4F);
		bodyModel[294].rotateAngleX = -1.32645023F;

		bodyModel[295].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 448
		bodyModel[295].setRotationPoint(-15.8F, -37.5F, 3.5F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F); // Box 449
		bodyModel[296].setRotationPoint(-15.8F, -38F, 3F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F); // Box 450
		bodyModel[297].setRotationPoint(-15.8F, -38F, 3F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F); // Box 451
		bodyModel[298].setRotationPoint(-15.8F, -38F, 3F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F); // Box 452
		bodyModel[299].setRotationPoint(-15.8F, -38F, 3F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F); // Box 453
		bodyModel[300].setRotationPoint(-15.8F, -38F, 3F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 454
		bodyModel[301].setRotationPoint(-15.8F, -38F, 3F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 455
		bodyModel[302].setRotationPoint(-15.8F, -38F, 3F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 456
		bodyModel[303].setRotationPoint(-15.8F, -38F, 3F);

		bodyModel[304].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F); // Box 457
		bodyModel[304].setRotationPoint(-15.9F, -37.5F, 3.5F);
		bodyModel[304].rotateAngleX = -1.57079633F;

		bodyModel[305].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F); // Box 458
		bodyModel[305].setRotationPoint(-15.7F, -37.6F, 1.5F);
		bodyModel[305].rotateAngleX = -1.57079633F;

		bodyModel[306].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 459
		bodyModel[306].setRotationPoint(-15.6F, -37.6F, 1.5F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F); // Box 460
		bodyModel[307].setRotationPoint(-15.6F, -38.1F, 1F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F); // Box 461
		bodyModel[308].setRotationPoint(-15.6F, -38.1F, 1F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F); // Box 462
		bodyModel[309].setRotationPoint(-15.6F, -38.1F, 1F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 463
		bodyModel[310].setRotationPoint(-15.6F, -38.1F, 1F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 464
		bodyModel[311].setRotationPoint(-15.6F, -38.1F, 1F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 465
		bodyModel[312].setRotationPoint(-15.6F, -38.1F, 1F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F); // Box 466
		bodyModel[313].setRotationPoint(-15.6F, -38.1F, 1F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F); // Box 467
		bodyModel[314].setRotationPoint(-15.6F, -38.1F, 1F);

		bodyModel[315].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F); // Box 468
		bodyModel[315].setRotationPoint(-15.9F, -43F, 2F);
		bodyModel[315].rotateAngleX = 1.57079633F;

		bodyModel[316].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 469
		bodyModel[316].setRotationPoint(-15.8F, -43F, 2F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F); // Box 470
		bodyModel[317].setRotationPoint(-15.8F, -43.5F, 1.5F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F); // Box 471
		bodyModel[318].setRotationPoint(-15.8F, -43.5F, 1.5F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F); // Box 472
		bodyModel[319].setRotationPoint(-15.8F, -43.5F, 1.5F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 473
		bodyModel[320].setRotationPoint(-15.8F, -43.5F, 1.5F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 474
		bodyModel[321].setRotationPoint(-15.8F, -43.5F, 1.5F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 475
		bodyModel[322].setRotationPoint(-15.8F, -43.5F, 1.5F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F); // Box 476
		bodyModel[323].setRotationPoint(-15.8F, -43.5F, 1.5F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F); // Box 477
		bodyModel[324].setRotationPoint(-15.8F, -43.5F, 1.5F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F); // Box 478
		bodyModel[325].setRotationPoint(-15.8F, -38F, -6.5F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F); // Box 480
		bodyModel[326].setRotationPoint(-15.8F, -38F, -6.5F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F); // Box 481
		bodyModel[327].setRotationPoint(-15.8F, -38F, -6.5F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F); // Box 482
		bodyModel[328].setRotationPoint(-15.8F, -38F, -6.5F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F); // Box 483
		bodyModel[329].setRotationPoint(-15.8F, -38F, -6.5F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 484
		bodyModel[330].setRotationPoint(-15.8F, -38F, -6.5F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 485
		bodyModel[331].setRotationPoint(-15.8F, -38F, -6.5F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 486
		bodyModel[332].setRotationPoint(-15.8F, -38F, -6.5F);

		bodyModel[333].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, 0F, 0F, -0.48F, 0F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, 0F, 0F, -0.48F, 0F); // Box 487
		bodyModel[333].setRotationPoint(-15.9F, -37.5F, -6.6F);
		bodyModel[333].rotateAngleX = -0.38397244F;

		bodyModel[334].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 488
		bodyModel[334].setRotationPoint(-15.8F, -35.3F, -1.6F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 489
		bodyModel[335].setRotationPoint(-15.8F, -35.3F, 0.4F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F); // Box 460
		bodyModel[336].setRotationPoint(-15.8F, -38.5F, 4.8F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 461
		bodyModel[337].setRotationPoint(-15.8F, -38.5F, 5.8F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 462
		bodyModel[338].setRotationPoint(-15.8F, -37.5F, 5.8F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 463
		bodyModel[339].setRotationPoint(-15.8F, -37.5F, 4.8F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 464
		bodyModel[340].setRotationPoint(-15.8F, -37.5F, 4.8F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F); // Box 465
		bodyModel[341].setRotationPoint(-15.8F, -38.5F, 4.8F);

		bodyModel[342].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 466
		bodyModel[342].setRotationPoint(-15.9F, -37.5F, 5.8F);
		bodyModel[342].rotateAngleX = 3.14159265F;

		bodyModel[343].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F); // Box 467
		bodyModel[343].setRotationPoint(-15.8F, -38.5F, 4.8F);

		bodyModel[344].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F); // Box 468
		bodyModel[344].setRotationPoint(-15.9F, -37.5F, 5.8F);
		bodyModel[344].rotateAngleX = -3.90953752F;

		bodyModel[345].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 469
		bodyModel[345].setRotationPoint(-15.8F, -37.5F, 5.8F);

		bodyModel[346].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 470
		bodyModel[346].setRotationPoint(-15.9F, -37.5F, 5.8F);
		bodyModel[346].rotateAngleX = 3.92699082F;

		bodyModel[347].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 471
		bodyModel[347].setRotationPoint(-15.9F, -37.5F, 5.8F);
		bodyModel[347].rotateAngleX = 5.49778714F;

		bodyModel[348].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 472
		bodyModel[348].setRotationPoint(-15.9F, -37.5F, 5.8F);

		bodyModel[349].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 473
		bodyModel[349].setRotationPoint(-15.9F, -37.5F, 5.8F);
		bodyModel[349].rotateAngleX = 0.78539816F;

		bodyModel[350].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 474
		bodyModel[350].setRotationPoint(-15.9F, -37.5F, 5.8F);
		bodyModel[350].rotateAngleX = 1.57079633F;

		bodyModel[351].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 475
		bodyModel[351].setRotationPoint(-15.9F, -37.5F, 5.8F);
		bodyModel[351].rotateAngleX = 2.35619449F;

		bodyModel[352].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 476
		bodyModel[352].setRotationPoint(-15.8F, -38.5F, 5.8F);

		bodyModel[353].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F); // Box 477
		bodyModel[353].setRotationPoint(-15.9F, -42.5F, -2F);
		bodyModel[353].rotateAngleX = 1.57079633F;

		bodyModel[354].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 478
		bodyModel[354].setRotationPoint(-15.8F, -43F, -2F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 479
		bodyModel[355].setRotationPoint(-15.8F, -43.5F, -2.5F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 480
		bodyModel[356].setRotationPoint(-15.8F, -43.5F, -2.5F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F); // Box 481
		bodyModel[357].setRotationPoint(-15.8F, -43.5F, -2.5F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F); // Box 482
		bodyModel[358].setRotationPoint(-15.8F, -43.5F, -2.5F);

		bodyModel[359].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F); // Box 483
		bodyModel[359].setRotationPoint(-15.8F, -43.5F, -2.5F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F); // Box 484
		bodyModel[360].setRotationPoint(-15.8F, -43.5F, -2.5F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F); // Box 485
		bodyModel[361].setRotationPoint(-15.8F, -43.5F, -2.5F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 486
		bodyModel[362].setRotationPoint(-15.8F, -43.5F, -2.5F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 487
		bodyModel[363].setRotationPoint(-15.8F, -38.8F, -4F);

		bodyModel[364].addShapeBox(0F, 0F, 0F, 9, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 462
		bodyModel[364].setRotationPoint(-23F, -45F, -4F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, -2F, 0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 2F, 2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 463
		bodyModel[365].setRotationPoint(-18F, -45F, -7F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 465
		bodyModel[366].setRotationPoint(-15.5F, -45.5F, -1F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, 0F); // Box 466
		bodyModel[367].setRotationPoint(-15.5F, -46F, -1F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 467
		bodyModel[368].setRotationPoint(-14F, -46.25F, -1F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 468
		bodyModel[369].setRotationPoint(-14F, -45.25F, -1F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.6F, -0.25F, 0F); // Box 469
		bodyModel[370].setRotationPoint(-14.1F, -44.75F, -1F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.7F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.5F, 0F, -0.7F, -0.5F, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 470
		bodyModel[371].setRotationPoint(-15.5F, -47F, -1F);

		bodyModel[372].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.7F, -0.5F, -0.3F, -0.2F, -0.5F, -0.3F, -0.2F, -0.3F, 0F, -0.7F, -0.3F, 0F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 471
		bodyModel[372].setRotationPoint(-15.5F, -47F, 0F);

		bodyModel[373].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.1F); // Box 472
		bodyModel[373].setRotationPoint(-13.7F, -46F, -1F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F,-2F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 512
		bodyModel[374].setRotationPoint(-23F, -45F, -7F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1F, 0F, -1.5F); // Box 513
		bodyModel[375].setRotationPoint(-19F, -43F, -8F);

		bodyModel[376].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 514
		bodyModel[376].setRotationPoint(-18F, -41F, -8F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 2F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 2F, 2F, 0F, 0F, 2F, 0F); // Box 515
		bodyModel[377].setRotationPoint(-18F, -45F, 4F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 516
		bodyModel[378].setRotationPoint(-23F, -45F, 4F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 517
		bodyModel[379].setRotationPoint(-19F, -43F, 6F);

		bodyModel[380].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 518
		bodyModel[380].setRotationPoint(-18F, -41F, 7F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 601
		bodyModel[381].setRotationPoint(-11F, -41.3F, -8F);

		bodyModel[382].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 602
		bodyModel[382].setRotationPoint(-10.5F, -39.3F, -8.5F);

		bodyModel[383].addShapeBox(-1F, -2F, 0F, 1, 2, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 603
		bodyModel[383].setRotationPoint(-9.5F, -39.3F, -7.7F);
		bodyModel[383].rotateAngleZ = 0.36651914F;

		bodyModel[384].addShapeBox(-1F, -2F, 0F, 1, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 604
		bodyModel[384].setRotationPoint(-9.5F, -39.3F, -7.2F);
		bodyModel[384].rotateAngleZ = 0.36651914F;

		bodyModel[385].addShapeBox(0F, 0F, 0F, 15, 8, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 967
		bodyModel[385].setRotationPoint(-9.5F, -36.3F, -8.5F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 1, 8, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 968
		bodyModel[386].setRotationPoint(-10.5F, -36.3F, -8.5F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 15, 8, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 525
		bodyModel[387].setRotationPoint(-9.5F, -36.3F, 5.5F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 1, 8, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 526
		bodyModel[388].setRotationPoint(-10.5F, -36.3F, 5.5F);

		bodyModel[389].addShapeBox(0F, 0F, 0F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[389].setRotationPoint(-15F, -31F, -2F);

		bodyModel[390].addShapeBox(0F, 0F, 0F, 7, 3, 3, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 254
		bodyModel[390].setRotationPoint(-15F, -32F, -1.5F);

		bodyModel[391].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 263
		bodyModel[391].setRotationPoint(-13.5F, -35F, -1F);

		bodyModel[392].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 264
		bodyModel[392].setRotationPoint(-13F, -39F, -0.5F);

		bodyModel[393].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 265
		bodyModel[393].setRotationPoint(-13F, -41F, -0.5F);

		bodyModel[394].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 266
		bodyModel[394].setRotationPoint(-12.7F, -41.1F, -0.5F);

		bodyModel[395].addShapeBox(0F, 0F, 0F, 7, 3, 3, 0F,0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -2F, -6.9999F, 0F, -2.3F, 0F, 0F, -2.3F, 0F, 0F, 0.3F, -6.9999F, 0F, 0.3F); // Box 558
		bodyModel[395].setRotationPoint(10F, -52F, 2F);

		bodyModel[396].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -1.9999F, 0F, 0F, 0F, 1F, 0F, 0F, -1.05F, 0F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 559
		bodyModel[396].setRotationPoint(14F, -44F, 8F);

		bodyModel[397].addShapeBox(0F, 0F, 0F, 16, 15, 8, 0F,0F, 0F, 0F, 5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 560
		bodyModel[397].setRotationPoint(5F, -43.25F, 0F);

		bodyModel[398].addShapeBox(0F, 0F, 0F, 16, 15, 8, 0F,0F, 0F, 0F, 1F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F); // Box 541
		bodyModel[398].setRotationPoint(5F, -43.25F, -8F);
	}

	private void initnoseModel_1()
	{
		noseModel[0] = new ModelRendererTurbo(this, 97, 946, textureX, textureY); // Box 16
		noseModel[1] = new ModelRendererTurbo(this, 169, 946, textureX, textureY); // Box 17
		noseModel[2] = new ModelRendererTurbo(this, 73, 924, textureX, textureY); // Box 21
		noseModel[3] = new ModelRendererTurbo(this, 121, 924, textureX, textureY); // Box 22
		noseModel[4] = new ModelRendererTurbo(this, 1, 985, textureX, textureY); // Box 31
		noseModel[5] = new ModelRendererTurbo(this, 33, 985, textureX, textureY); // Box 32
		noseModel[6] = new ModelRendererTurbo(this, 121, 985, textureX, textureY); // Box 122
		noseModel[7] = new ModelRendererTurbo(this, 153, 985, textureX, textureY); // Box 123
		noseModel[8] = new ModelRendererTurbo(this, 177, 985, textureX, textureY); // Box 124
		noseModel[9] = new ModelRendererTurbo(this, 209, 985, textureX, textureY); // Box 125
		noseModel[10] = new ModelRendererTurbo(this, 25, 985, textureX, textureY); // Box 126
		noseModel[11] = new ModelRendererTurbo(this, 233, 985, textureX, textureY); // Box 127
		noseModel[12] = new ModelRendererTurbo(this, 345, 924, textureX, textureY); // Import CO_51
		noseModel[13] = new ModelRendererTurbo(this, 369, 924, textureX, textureY); // Import CO_52
		noseModel[14] = new ModelRendererTurbo(this, 65, 924, textureX, textureY); // Import CO_53
		noseModel[15] = new ModelRendererTurbo(this, 401, 924, textureX, textureY); // Import CO_54
		noseModel[16] = new ModelRendererTurbo(this, 1, 924, textureX, textureY); // Import CO_55
		noseModel[17] = new ModelRendererTurbo(this, 433, 924, textureX, textureY); // Import CO_56
		noseModel[18] = new ModelRendererTurbo(this, 457, 924, textureX, textureY); // Import CO_57
		noseModel[19] = new ModelRendererTurbo(this, 481, 924, textureX, textureY); // Import CO_58
		noseModel[20] = new ModelRendererTurbo(this, 113, 924, textureX, textureY); // Import CO_59
		noseModel[21] = new ModelRendererTurbo(this, 169, 924, textureX, textureY); // Import CO_60
		noseModel[22] = new ModelRendererTurbo(this, 225, 924, textureX, textureY); // Import CO_61
		noseModel[23] = new ModelRendererTurbo(this, 273, 924, textureX, textureY); // Import CO_62
		noseModel[24] = new ModelRendererTurbo(this, 513, 924, textureX, textureY); // Import CO_63
		noseModel[25] = new ModelRendererTurbo(this, 297, 946, textureX, textureY); // Box 135
		noseModel[26] = new ModelRendererTurbo(this, 345, 946, textureX, textureY); // Box 136
		noseModel[27] = new ModelRendererTurbo(this, 1, 1005, textureX, textureY); // Box 144
		noseModel[28] = new ModelRendererTurbo(this, 33, 1005, textureX, textureY); // Box 145
		noseModel[29] = new ModelRendererTurbo(this, 65, 1005, textureX, textureY); // Box 146
		noseModel[30] = new ModelRendererTurbo(this, 97, 1005, textureX, textureY); // Box 147
		noseModel[31] = new ModelRendererTurbo(this, 401, 946, textureX, textureY); // Box 148
		noseModel[32] = new ModelRendererTurbo(this, 457, 946, textureX, textureY); // Box 149
		noseModel[33] = new ModelRendererTurbo(this, 121, 1005, textureX, textureY); // Box 156
		noseModel[34] = new ModelRendererTurbo(this, 153, 1005, textureX, textureY); // Box 157
		noseModel[35] = new ModelRendererTurbo(this, 177, 1005, textureX, textureY); // Box 158
		noseModel[36] = new ModelRendererTurbo(this, 209, 1005, textureX, textureY); // Box 159
		noseModel[37] = new ModelRendererTurbo(this, 25, 1005, textureX, textureY); // Box 160
		noseModel[38] = new ModelRendererTurbo(this, 233, 1005, textureX, textureY); // Box 161
		noseModel[39] = new ModelRendererTurbo(this, 73, 946, textureX, textureY); // Box 177
		noseModel[40] = new ModelRendererTurbo(this, 145, 946, textureX, textureY); // Box 178
		noseModel[41] = new ModelRendererTurbo(this, 1, 946, textureX, textureY); // Box 179
		noseModel[42] = new ModelRendererTurbo(this, 569, 946, textureX, textureY); // Box 180
		noseModel[43] = new ModelRendererTurbo(this, 97, 946, textureX, textureY); // Box 181
		noseModel[44] = new ModelRendererTurbo(this, 601, 946, textureX, textureY); // Box 182
		noseModel[45] = new ModelRendererTurbo(this, 625, 946, textureX, textureY); // Box 183
		noseModel[46] = new ModelRendererTurbo(this, 649, 946, textureX, textureY); // Box 184
		noseModel[47] = new ModelRendererTurbo(this, 289, 946, textureX, textureY); // Box 185
		noseModel[48] = new ModelRendererTurbo(this, 337, 946, textureX, textureY); // Box 186
		noseModel[49] = new ModelRendererTurbo(this, 393, 946, textureX, textureY); // Box 187
		noseModel[50] = new ModelRendererTurbo(this, 449, 946, textureX, textureY); // Box 188
		noseModel[51] = new ModelRendererTurbo(this, 177, 946, textureX, textureY); // Box 189
		noseModel[52] = new ModelRendererTurbo(this, 65, 985, textureX, textureY); // Box 540
		noseModel[53] = new ModelRendererTurbo(this, 97, 985, textureX, textureY); // Box 541
		noseModel[54] = new ModelRendererTurbo(this, 401, 985, textureX, textureY); // Box 542
		noseModel[55] = new ModelRendererTurbo(this, 457, 985, textureX, textureY); // Box 543
		noseModel[56] = new ModelRendererTurbo(this, 521, 925, textureX, textureY); // Box 544
		noseModel[57] = new ModelRendererTurbo(this, 609, 925, textureX, textureY); // Box 545
		noseModel[58] = new ModelRendererTurbo(this, 177, 925, textureX, textureY); // Box 546
		noseModel[59] = new ModelRendererTurbo(this, 193, 925, textureX, textureY); // Box 547
		noseModel[60] = new ModelRendererTurbo(this, 201, 925, textureX, textureY); // Box 548
		noseModel[61] = new ModelRendererTurbo(this, 201, 925, textureX, textureY); // Box 549

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

		noseModel[6].addShapeBox(0F, 0F, 0F, 6, 9, 8, 0F,0F, -4F, -4F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		noseModel[6].setRotationPoint(-91F, -44F, -8F);

		noseModel[7].addShapeBox(0F, 0F, 0F, 5, 7, 6, 0F,0F, -4F, -4F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		noseModel[7].setRotationPoint(-96F, -42F, -6F);

		noseModel[8].addShapeBox(0F, 0F, 0F, 6, 9, 8, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -4F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 124
		noseModel[8].setRotationPoint(-91F, -35F, -8F);

		noseModel[9].addShapeBox(0F, 0F, 0F, 5, 6, 6, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -4F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 125
		noseModel[9].setRotationPoint(-96F, -35F, -6F);

		noseModel[10].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F,0F, -3.9999F, -2.9999F, 0F, -0.9999F, -0.9999F, 0F, 0F, 0F, 0F, -3.9999F, 0F, 0F, 0F, -2.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		noseModel[10].setRotationPoint(-98F, -39F, -3F);

		noseModel[11].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, -2.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.9999F, -2.9999F, 0F, 0F, -0.9999F, 0F, 0F, 0F, 0F, -2.9999F, 0F); // Box 127
		noseModel[11].setRotationPoint(-98F, -35F, -3F);

		noseModel[12].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F,-1F, -0.3F, -1.2F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 1.2F, -1F, 0F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.2F); // Import CO_51
		noseModel[12].setRotationPoint(-75F, -38.5F, -10F);

		noseModel[13].addShapeBox(0F, 0F, 0F, 13, 1, 2, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import CO_52
		noseModel[13].setRotationPoint(-66F, -38.5F, -10F);

		noseModel[14].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Import CO_53
		noseModel[14].setRotationPoint(-57.5F, -37.5F, -11F);

		noseModel[15].addShapeBox(0F, 0F, 0F, 13, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import CO_54
		noseModel[15].setRotationPoint(-66F, -37.5F, -9.5F);

		noseModel[16].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1.2F, 0F, 0F, -1.03333333F, 0F, 0F, 0.93333333F, 0F, 0F, 1.2F, -1F, 0F, -1.2F, 0F, 0F, -1.03333333F, 0F, 0F, 0.93333333F, 0F, 0F, 1.2F); // Import CO_55
		noseModel[16].setRotationPoint(-75F, -37.5F, -10F);

		noseModel[17].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F,-1F, 0F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.2F, -1F, 0F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.2F); // Import CO_56
		noseModel[17].setRotationPoint(-75F, -37.5F, -9.5F);

		noseModel[18].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F,-1F, 0F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.2F, -1F, -0.3F, -1.2F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 1.2F); // Import CO_57
		noseModel[18].setRotationPoint(-75F, -36.5F, -10F);

		noseModel[19].addShapeBox(0F, 0F, 0F, 13, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import CO_58
		noseModel[19].setRotationPoint(-66F, -36.5F, -10F);

		noseModel[20].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Import CO_59
		noseModel[20].setRotationPoint(-61F, -37.5F, -11F);

		noseModel[21].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Import CO_60
		noseModel[21].setRotationPoint(-64.5F, -37.5F, -11F);

		noseModel[22].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Import CO_61
		noseModel[22].setRotationPoint(-68F, -37.5F, -11F);

		noseModel[23].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Import CO_62
		noseModel[23].setRotationPoint(-71.5F, -37.5F, -10.8F);

		noseModel[24].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Import CO_63
		noseModel[24].setRotationPoint(-74F, -37.5F, -10.2F);

		noseModel[25].addShapeBox(0F, 0F, 0F, 14, 8, 9, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -4F, 0F, -2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		noseModel[25].setRotationPoint(-63F, -47F, 0F);

		noseModel[26].addShapeBox(0F, 0F, 0F, 16, 8, 9, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -4F, 0F, -2F, -4F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F); // Box 136
		noseModel[26].setRotationPoint(-79F, -46F, 0F);

		noseModel[27].addShapeBox(0F, 0F, 0F, 6, 10, 8, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, -2F); // Box 144
		noseModel[27].setRotationPoint(-85F, -38F, 0F);

		noseModel[28].addShapeBox(0F, 0F, 0F, 6, 10, 8, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 145
		noseModel[28].setRotationPoint(-85F, -45F, 0F);

		noseModel[29].addShapeBox(0F, 0F, 0F, 6, 6, 6, 0F,0F, -0.9999F, -2.9999F, 0F, 0F, -4.9999F, 0F, 0F, 0F, 0F, -0.9999F, -1.9999F, 0F, -4.9999F, -2.9999F, 0F, 0F, -1.9999F, 0F, 0F, -2.9999F, 0F, -4.9999F, -1.9999F); // Box 146
		noseModel[29].setRotationPoint(-85F, -29F, 2F);

		noseModel[30].addShapeBox(0F, 0F, 0F, 6, 5, 5, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 2F, 1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -6F, 1F); // Box 147
		noseModel[30].setRotationPoint(-85F, -27F, 0F);

		noseModel[31].addShapeBox(0F, 0F, 0F, 16, 12, 9, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, -1F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, -6F, -4F); // Box 148
		noseModel[31].setRotationPoint(-79F, -29F, 0F);

		noseModel[32].addShapeBox(0F, 0F, 0F, 14, 8, 9, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -3F, -3F); // Box 149
		noseModel[32].setRotationPoint(-63F, -24F, 0F);

		noseModel[33].addShapeBox(0F, 0F, 0F, 6, 9, 8, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, -4F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 156
		noseModel[33].setRotationPoint(-91F, -44F, 0F);

		noseModel[34].addShapeBox(0F, 0F, 0F, 5, 7, 6, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -4F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 157
		noseModel[34].setRotationPoint(-96F, -42F, 0F);

		noseModel[35].addShapeBox(0F, 0F, 0F, 6, 9, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -4F, -4F); // Box 158
		noseModel[35].setRotationPoint(-91F, -35F, 0F);

		noseModel[36].addShapeBox(0F, 0F, 0F, 5, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -3F, -4F); // Box 159
		noseModel[36].setRotationPoint(-96F, -35F, 0F);

		noseModel[37].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F,0F, -3.9999F, 0F, 0F, 0F, 0F, 0F, -0.9999F, -0.9999F, 0F, -3.9999F, -2.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.9999F); // Box 160
		noseModel[37].setRotationPoint(-98F, -39F, 0F);

		noseModel[38].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.9999F, 0F, -2.9999F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9999F, 0F, -2.9999F, -2.9999F); // Box 161
		noseModel[38].setRotationPoint(-98F, -35F, 0F);

		noseModel[39].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F,0F, 0F, 1.2F, 0F, 0F, 0F, 0F, -0.3F, 0F, -1F, -0.3F, -1.2F, 0F, 0F, 1.2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.2F); // Box 177
		noseModel[39].setRotationPoint(-75F, -38.5F, 8F);

		noseModel[40].addShapeBox(0F, 0F, 0F, 13, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		noseModel[40].setRotationPoint(-66F, -38.5F, 8F);

		noseModel[41].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 179
		noseModel[41].setRotationPoint(-57.5F, -37.5F, 10F);

		noseModel[42].addShapeBox(0F, 0F, 0F, 13, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		noseModel[42].setRotationPoint(-66F, -37.5F, 7.5F);

		noseModel[43].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 1.2F, 0F, 0F, 0.93333333F, 0F, 0F, -1.03333333F, -1F, 0F, -1.2F, 0F, 0F, 1.2F, 0F, 0F, 0.93333333F, 0F, 0F, -1.03333333F, -1F, 0F, -1.2F); // Box 181
		noseModel[43].setRotationPoint(-75F, -37.5F, 8F);

		noseModel[44].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F,0F, 0F, 1.2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.2F, 0F, 0F, 1.2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.2F); // Box 182
		noseModel[44].setRotationPoint(-75F, -37.5F, 7.5F);

		noseModel[45].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F,0F, 0F, 1.2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.2F, 0F, 0F, 1.2F, 0F, 0F, 0F, 0F, -0.3F, 0F, -1F, -0.3F, -1.2F); // Box 183
		noseModel[45].setRotationPoint(-75F, -36.5F, 8F);

		noseModel[46].addShapeBox(0F, 0F, 0F, 13, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 184
		noseModel[46].setRotationPoint(-66F, -36.5F, 8F);

		noseModel[47].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 185
		noseModel[47].setRotationPoint(-61F, -37.5F, 10F);

		noseModel[48].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 186
		noseModel[48].setRotationPoint(-64.5F, -37.5F, 10F);

		noseModel[49].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 187
		noseModel[49].setRotationPoint(-68F, -37.5F, 10F);

		noseModel[50].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 188
		noseModel[50].setRotationPoint(-71.5F, -37.5F, 9.8F);

		noseModel[51].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 189
		noseModel[51].setRotationPoint(-74F, -37.5F, 9.2F);

		noseModel[52].addShapeBox(0F, 0F, 0F, 6, 6, 6, 0F,0F, -0.9999F, -1.9999F, 0F, 0F, 0F, 0F, 0F, -4.9999F, 0F, -0.9999F, -2.9999F, 0F, -4.9999F, -1.9999F, 0F, 0F, -2.9999F, 0F, 0F, -1.9999F, 0F, -4.9999F, -2.9999F); // Box 540
		noseModel[52].setRotationPoint(-85F, -29F, -8F);

		noseModel[53].addShapeBox(0F, 0F, 0F, 6, 5, 5, 0F,0F, 2F, 1F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -6F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 541
		noseModel[53].setRotationPoint(-85F, -27F, -5F);

		noseModel[54].addShapeBox(0F, 0F, 0F, 16, 12, 9, 0F,0F, 0F, -1F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -6F, -4F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 542
		noseModel[54].setRotationPoint(-79F, -29F, -9F);

		noseModel[55].addShapeBox(0F, 0F, 0F, 14, 8, 9, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 543
		noseModel[55].setRotationPoint(-63F, -24F, -9F);

		noseModel[56].addShapeBox(0F, 0F, 0F, 36, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 544
		noseModel[56].setRotationPoint(-83F, -46F, -3F);

		noseModel[57].addShapeBox(0F, 0F, 0F, 36, 1, 6, 0F,0F, 0F, -0.9999F, 0F, 0F, -2.9999F, 0F, 0F, -2.9999F, 0F, 0F, -0.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 545
		noseModel[57].setRotationPoint(-83F, -47F, -3F);

		noseModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 546
		noseModel[58].setRotationPoint(-84F, -45F, -3F);

		noseModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 547
		noseModel[59].setRotationPoint(-84F, -46F, -3F);

		noseModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 548
		noseModel[60].setRotationPoint(-84F, -46F, 2F);

		noseModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 549
		noseModel[61].setRotationPoint(-84F, -47F, -3F);
	}

	private void inittailModel_1()
	{
		tailModel[0] = new ModelRendererTurbo(this, 121, 835, textureX, textureY); // Box 23
		tailModel[1] = new ModelRendererTurbo(this, 97, 813, textureX, textureY); // Box 24
		tailModel[2] = new ModelRendererTurbo(this, 201, 813, textureX, textureY); // Box 44
		tailModel[3] = new ModelRendererTurbo(this, 1, 770, textureX, textureY); // Import TA_10
		tailModel[4] = new ModelRendererTurbo(this, 1, 727, textureX, textureY); // Import TA_11
		tailModel[5] = new ModelRendererTurbo(this, 1, 727, textureX, textureY); // Import TA_12
		tailModel[6] = new ModelRendererTurbo(this, 81, 727, textureX, textureY); // Import FPL_2
		tailModel[7] = new ModelRendererTurbo(this, 561, 835, textureX, textureY); // Box 137
		tailModel[8] = new ModelRendererTurbo(this, 665, 835, textureX, textureY); // Box 153
		tailModel[9] = new ModelRendererTurbo(this, 33, 770, textureX, textureY); // Box 204
		tailModel[10] = new ModelRendererTurbo(this, 25, 770, textureX, textureY); // Box 205
		tailModel[11] = new ModelRendererTurbo(this, 105, 770, textureX, textureY); // Box 207
		tailModel[12] = new ModelRendererTurbo(this, 41, 693, textureX, textureY); // Box 390
		tailModel[13] = new ModelRendererTurbo(this, 129, 693, textureX, textureY); // Box 392
		tailModel[14] = new ModelRendererTurbo(this, 945, 835, textureX, textureY); // Box 557
		tailModel[15] = new ModelRendererTurbo(this, 945, 835, textureX, textureY); // Box 550
		tailModel[16] = new ModelRendererTurbo(this, 1, 836, textureX, textureY); // Box 579

		tailModel[0].addShapeBox(0F, 0F, 0F, 46, 16, 12, 0F,0F, -2F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, 0F, 0F, 0F, 1F, 0F, -3F, -4F, 0F, -3F, -4F, 0F, 0F, 1F); // Box 23
		tailModel[0].setRotationPoint(59F, -41F, -6F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 46, 7, 5, 0F,0F, -0.9999F, -0.9999F, 0F, -4.9999F, -2.9999F, 0F, -4.9999F, 0F, 0F, 1F, 0F, 0F, 0F, 1F, 0F, -1.9999F, -2.9999F, 0F, -1.9999F, 0F, 0F, 0F, 0F); // Box 24
		tailModel[1].setRotationPoint(59F, -46F, -5F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 46, 7, 6, 0F,0F, -2.9999F, 1F, 0F, 0F, -3.9999F, 0F, 0F, 0F, 0F, -2.9999F, 0F, 0F, -0.9999F, 9.9999999999989E-05F, 0F, -4.9999F, -5.5F, 0F, -4.9999F, 0F, 0F, 0F, 0F); // Box 44
		tailModel[2].setRotationPoint(59F, -28F, -6F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 9, 2, 4, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Import TA_10
		tailModel[3].setRotationPoint(94F, -41F, -2F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 11, 2, 4, 0F,-2F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Import TA_11
		tailModel[4].setRotationPoint(83F, -41F, -45F);

		tailModel[5].addShapeBox(0F, 0F, 0F, 16, 2, 40, 0F,-5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Import TA_12
		tailModel[5].setRotationPoint(78F, -41F, -41F);

		tailModel[6].addShapeBox(0F, -1F, 0F, 6, 2, 4, 0F,0F, 0F, -0.5F, -2.5F, -0.5F, -1.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2.5F, -0.5F, -1.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Import FPL_2
		tailModel[6].setRotationPoint(94F, -40F, -45F);

		tailModel[7].addShapeBox(0F, 0F, 0F, 46, 7, 5, 0F,0F, 1F, 0F, 0F, -4.9999F, 0F, 0F, -4.9999F, -2.9999F, 0F, -0.9999F, -0.9999F, 0F, 0F, 0F, 0F, -1.9999F, 0F, 0F, -1.9999F, -2.9999F, 0F, 0F, 1F); // Box 137
		tailModel[7].setRotationPoint(59F, -46F, 0F);

		tailModel[8].addShapeBox(0F, 0F, 0F, 46, 7, 6, 0F,0F, -2.9999F, 0F, 0F, 0F, 0F, 0F, 0F, -3.9999F, 0F, -2.9999F, 1F, 0F, 0F, 0F, 0F, -4.9999F, 0F, 0F, -4.9999F, -5.5F, 0F, -0.9999F, 9.9999999999989E-05F); // Box 153
		tailModel[8].setRotationPoint(59F, -28F, 0F);

		tailModel[9].addShapeBox(0F, 0F, 0F, 11, 2, 4, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, -0.5F, -1F); // Box 204
		tailModel[9].setRotationPoint(83F, -41F, 41F);

		tailModel[10].addShapeBox(0F, 0F, 0F, 16, 2, 40, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -0.5F, 0F); // Box 205
		tailModel[10].setRotationPoint(78F, -41F, 1F);

		tailModel[11].addShapeBox(0F, -1F, 0F, 6, 2, 4, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -2.5F, -0.5F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -2.5F, -0.5F, -1.5F, 0F, 0F, -0.5F); // Box 207
		tailModel[11].setRotationPoint(94F, -40F, 41F);

		tailModel[12].addShapeBox(0F, 0F, 0F, 23, 29, 4, 0F,-15F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, -1F, -15F, 0F, -1.5F, 4F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, -1.5F); // Box 390
		tailModel[12].setRotationPoint(82F, -70F, -2F);

		tailModel[13].addShapeBox(0F, 0F, 0F, 8, 3, 4, 0F,-2F, -1F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -2F, -1F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.5F); // Box 392
		tailModel[13].setRotationPoint(97F, -73F, -2F);

		tailModel[14].addShapeBox(0F, 0F, 0F, 86, 1, 1, 0F,0F, -15.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -15.25F, -0.25F, 0F, 14.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 14.75F, -0.25F); // Box 557
		tailModel[14].setRotationPoint(12F, -68F, -0.5F);

		tailModel[15].addShapeBox(0F, 0F, 0F, 88, 1, 1, 0F,0F, -1.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -1.25F, -0.25F, 0F, 0.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.75F, -0.25F); // Box 550
		tailModel[15].setRotationPoint(9F, -68F, -0.5F);

		tailModel[16].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,1.75F, -0.25F, -0.25F, -2.25F, -0.25F, -0.25F, -2.25F, -0.25F, -0.25F, 1.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Box 579
		tailModel[16].setRotationPoint(12F, -67F, -0.5F);
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 1, 501, textureX, textureY); // Import LW_01
		leftWingModel[1] = new ModelRendererTurbo(this, 1, 501, textureX, textureY); // Import LW_02
		leftWingModel[2] = new ModelRendererTurbo(this, 41, 501, textureX, textureY); // Import LW_03
		leftWingModel[3] = new ModelRendererTurbo(this, 193, 501, textureX, textureY); // Import LW_04
		leftWingModel[4] = new ModelRendererTurbo(this, 105, 501, textureX, textureY); // Import LW_05
		leftWingModel[5] = new ModelRendererTurbo(this, 129, 501, textureX, textureY); // Import LW_07
		leftWingModel[6] = new ModelRendererTurbo(this, 337, 501, textureX, textureY); // Import LW_08
		leftWingModel[7] = new ModelRendererTurbo(this, 393, 501, textureX, textureY); // Import LW_09
		leftWingModel[8] = new ModelRendererTurbo(this, 225, 501, textureX, textureY); // Import LW_10
		leftWingModel[9] = new ModelRendererTurbo(this, 545, 501, textureX, textureY); // Import LW_11
		leftWingModel[10] = new ModelRendererTurbo(this, 753, 502, textureX, textureY); // Import LW_12
		leftWingModel[11] = new ModelRendererTurbo(this, 593, 501, textureX, textureY); // Box 167
		leftWingModel[12] = new ModelRendererTurbo(this, 793, 502, textureX, textureY); // Box 546
		leftWingModel[13] = new ModelRendererTurbo(this, 833, 502, textureX, textureY); // Box 547
		leftWingModel[14] = new ModelRendererTurbo(this, 249, 502, textureX, textureY); // Box 548
		leftWingModel[15] = new ModelRendererTurbo(this, 865, 502, textureX, textureY); // Box 549
		leftWingModel[16] = new ModelRendererTurbo(this, 897, 502, textureX, textureY); // Box 550
		leftWingModel[17] = new ModelRendererTurbo(this, 937, 502, textureX, textureY); // Box 551
		leftWingModel[18] = new ModelRendererTurbo(this, 977, 502, textureX, textureY); // Box 552

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 8, 7, 20, 0F,-6F, 0.5F, 0F, 6F, 2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -6F, -4.5F, 0F, 6F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Import LW_01
		leftWingModel[0].setRotationPoint(-39F, -24F, -32F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 8, 8, 87, 0F,-5F, 4.5F, 0F, 3F, 5F, 0F, 0F, -2F, 0F, 0F, -3.5F, 0F, -5F, -11.5F, 0F, 3F, -10F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Import LW_02
		leftWingModel[1].setRotationPoint(-33F, -28F, -119F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 6, 2, 5, 0F,-3F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -3F, -0.5F, -1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F); // Import LW_03
		leftWingModel[2].setRotationPoint(-28F, -33F, -124F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 27, 8, 87, 0F,-2.99999F, 5F, 0F, -7.99999F, 5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2.99999F, -10F, 0F, -7.99999F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LW_04
		leftWingModel[3].setRotationPoint(-25F, -28F, -119F);

		leftWingModel[4].addShapeBox(5F, 0F, 0F, 13, 2, 5, 0F,-5F, 0F, 0F, -6F, 0F, 0F, 0F, -1F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -6F, 0F, 0F, 0F, -0.5F, 0F, -5F, 1F, 0F); // Import LW_05
		leftWingModel[4].setRotationPoint(-16F, -33F, -124F);

		leftWingModel[5].addShapeBox(0F, 0F, 0F, 35, 7, 20, 0F,-6F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -3F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LW_07
		leftWingModel[5].setRotationPoint(-31F, -24F, -32F);

		leftWingModel[6].addShapeBox(0F, 0F, 0F, 17, 7, 20, 0F,2F, 2F, 0F, -4F, -2F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 2F, -3F, 0F, -4F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import LW_08
		leftWingModel[6].setRotationPoint(4F, -24F, -32F);

		leftWingModel[7].addShapeBox(0F, 0F, 0F, 45, 8, 6, 0F,-4F, -1F, 0F, -6F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -6F, 0F, 0F, 0F, 1F, -2F, 0F, 0F, 0F); // Import LW_09
		leftWingModel[7].setRotationPoint(-35F, -25F, -12F);

		leftWingModel[8].addShapeBox(0F, 0F, 0F, 8, 8, 6, 0F,-4F, -3F, 0F, 4F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -4F, -2F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Import LW_10
		leftWingModel[8].setRotationPoint(-43F, -25F, -12F);

		leftWingModel[9].addShapeBox(0F, 0F, 0F, 17, 8, 6, 0F,6F, -1F, 0F, -6F, -5.5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, -2F); // Import LW_11
		leftWingModel[9].setRotationPoint(10F, -25F, -12F);

		leftWingModel[10].addBox(0F, 0F, 0F, 14, 1, 3, 0F); // Import LW_12
		leftWingModel[10].setRotationPoint(-43.6F, -24.5F, -45F);

		leftWingModel[11].addShapeBox(0F, 0F, 0F, 16, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		leftWingModel[11].setRotationPoint(-22F, -33F, -124F);

		leftWingModel[12].addShapeBox(0F, 0F, 0F, 14, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 546
		leftWingModel[12].setRotationPoint(-43.6F, -25.5F, -45F);

		leftWingModel[13].addShapeBox(0F, 0F, 0F, 14, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 547
		leftWingModel[13].setRotationPoint(-43.6F, -23.5F, -45F);

		leftWingModel[14].addBox(0F, 0F, 0F, 13, 1, 1, 0F); // Box 548
		leftWingModel[14].setRotationPoint(-56.6F, -24.5F, -44F);

		leftWingModel[15].addBox(0F, 0F, 0F, 13, 1, 1, 0F); // Box 549
		leftWingModel[15].setRotationPoint(-56.6F, -25.25F, -50F);

		leftWingModel[16].addBox(0F, 0F, 0F, 14, 1, 3, 0F); // Box 550
		leftWingModel[16].setRotationPoint(-43.6F, -25.25F, -51F);

		leftWingModel[17].addShapeBox(0F, 0F, 0F, 14, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 551
		leftWingModel[17].setRotationPoint(-43.6F, -26.25F, -51F);

		leftWingModel[18].addShapeBox(0F, 0F, 0F, 14, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 552
		leftWingModel[18].setRotationPoint(-43.6F, -24.25F, -51F);
	}

	private void initrightWingModel_1()
	{
		rightWingModel[0] = new ModelRendererTurbo(this, 1, 597, textureX, textureY); // Box 162
		rightWingModel[1] = new ModelRendererTurbo(this, 1, 597, textureX, textureY); // Box 163
		rightWingModel[2] = new ModelRendererTurbo(this, 41, 597, textureX, textureY); // Box 164
		rightWingModel[3] = new ModelRendererTurbo(this, 193, 597, textureX, textureY); // Box 165
		rightWingModel[4] = new ModelRendererTurbo(this, 105, 597, textureX, textureY); // Box 166
		rightWingModel[5] = new ModelRendererTurbo(this, 129, 597, textureX, textureY); // Box 168
		rightWingModel[6] = new ModelRendererTurbo(this, 337, 597, textureX, textureY); // Box 169
		rightWingModel[7] = new ModelRendererTurbo(this, 393, 597, textureX, textureY); // Box 170
		rightWingModel[8] = new ModelRendererTurbo(this, 225, 597, textureX, textureY); // Box 171
		rightWingModel[9] = new ModelRendererTurbo(this, 545, 597, textureX, textureY); // Box 172
		rightWingModel[10] = new ModelRendererTurbo(this, 593, 597, textureX, textureY); // Box 176
		rightWingModel[11] = new ModelRendererTurbo(this, 753, 599, textureX, textureY); // Box 553
		rightWingModel[12] = new ModelRendererTurbo(this, 793, 599, textureX, textureY); // Box 554
		rightWingModel[13] = new ModelRendererTurbo(this, 833, 599, textureX, textureY); // Box 555
		rightWingModel[14] = new ModelRendererTurbo(this, 249, 599, textureX, textureY); // Box 556
		rightWingModel[15] = new ModelRendererTurbo(this, 865, 599, textureX, textureY); // Box 557
		rightWingModel[16] = new ModelRendererTurbo(this, 897, 599, textureX, textureY); // Box 558
		rightWingModel[17] = new ModelRendererTurbo(this, 937, 599, textureX, textureY); // Box 559
		rightWingModel[18] = new ModelRendererTurbo(this, 977, 599, textureX, textureY); // Box 560

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 8, 7, 20, 0F,0F, -2F, 0F, 0F, 0F, 0F, 6F, 2F, 0F, -6F, 0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 6F, -3F, 0F, -6F, -4.5F, 0F); // Box 162
		rightWingModel[0].setRotationPoint(-39F, -24F, 12F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 8, 8, 87, 0F,0F, -3.5F, 0F, 0F, -2F, 0F, 3F, 5F, 0F, -5F, 4.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 3F, -10F, 0F, -5F, -11.5F, 0F); // Box 163
		rightWingModel[1].setRotationPoint(-33F, -28F, 32F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 6, 2, 5, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -3F, -0.5F, -1F); // Box 164
		rightWingModel[2].setRotationPoint(-28F, -33F, 119F);

		rightWingModel[3].addShapeBox(0F, 0F, 0F, 27, 8, 87, 0F,0F, -2F, 0F, 0F, -2F, 0F, -7.99999F, 5F, 0F, -2.99999F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7.99999F, -10F, 0F, -2.99999F, -10F, 0F); // Box 165
		rightWingModel[3].setRotationPoint(-25F, -28F, 32F);

		rightWingModel[4].addShapeBox(5F, 0F, 0F, 13, 2, 5, 0F,-5F, 0F, 0F, 0F, -1F, 0F, -6F, 0F, 0F, -5F, 0F, 0F, -5F, 1F, 0F, 0F, -0.5F, 0F, -6F, 0F, 0F, -5F, 0F, 0F); // Box 166
		rightWingModel[4].setRotationPoint(-16F, -33F, 119F);

		rightWingModel[5].addShapeBox(0F, 0F, 0F, 35, 7, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -6F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, -6F, -3F, 0F); // Box 168
		rightWingModel[5].setRotationPoint(-31F, -24F, 12F);

		rightWingModel[6].addShapeBox(0F, 0F, 0F, 17, 7, 20, 0F,0F, 0F, 0F, 0F, -4.5F, 0F, -4F, -2F, 0F, 2F, 2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -4F, -4F, 0F, 2F, -3F, 0F); // Box 169
		rightWingModel[6].setRotationPoint(4F, -24F, 12F);

		rightWingModel[7].addShapeBox(0F, 0F, 0F, 45, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -6F, -1F, 0F, -4F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, -6F, 0F, 0F, -4F, 0F, 0F); // Box 170
		rightWingModel[7].setRotationPoint(-35F, -25F, 6F);

		rightWingModel[8].addShapeBox(0F, 0F, 0F, 8, 8, 6, 0F,0F, -2F, 0F, 0F, 0F, 0F, 4F, -1F, 0F, -4F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, -2F, 0F); // Box 171
		rightWingModel[8].setRotationPoint(-43F, -25F, 6F);

		rightWingModel[9].addShapeBox(0F, 0F, 0F, 17, 8, 6, 0F,0F, 0F, 0F, 0F, -5F, 0F, -6F, -5.5F, 0F, 6F, -1F, 0F, 0F, 1F, -2F, 0F, -1F, 0F, -6F, -1F, 0F, 6F, 0F, 0F); // Box 172
		rightWingModel[9].setRotationPoint(10F, -25F, 6F);

		rightWingModel[10].addShapeBox(0F, 0F, 0F, 16, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 176
		rightWingModel[10].setRotationPoint(-22F, -33F, 119F);

		rightWingModel[11].addBox(0F, 0F, 0F, 14, 1, 3, 0F); // Box 553
		rightWingModel[11].setRotationPoint(-43.6F, -24.5F, 42F);

		rightWingModel[12].addShapeBox(0F, 0F, 0F, 14, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 554
		rightWingModel[12].setRotationPoint(-43.6F, -25.5F, 42F);

		rightWingModel[13].addShapeBox(0F, 0F, 0F, 14, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 555
		rightWingModel[13].setRotationPoint(-43.6F, -23.5F, 42F);

		rightWingModel[14].addBox(0F, 0F, 0F, 13, 1, 1, 0F); // Box 556
		rightWingModel[14].setRotationPoint(-56.6F, -24.5F, 43F);

		rightWingModel[15].addBox(0F, 0F, 0F, 13, 1, 1, 0F); // Box 557
		rightWingModel[15].setRotationPoint(-56.6F, -25.25F, 49F);

		rightWingModel[16].addBox(0F, 0F, 0F, 14, 1, 3, 0F); // Box 558
		rightWingModel[16].setRotationPoint(-43.6F, -25.25F, 48F);

		rightWingModel[17].addShapeBox(0F, 0F, 0F, 14, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 559
		rightWingModel[17].setRotationPoint(-43.6F, -26.25F, 48F);

		rightWingModel[18].addShapeBox(0F, 0F, 0F, 14, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 560
		rightWingModel[18].setRotationPoint(-43.6F, -24.25F, 48F);
	}

	private void inityawFlapModel_1()
	{
		yawFlapModel[0] = new ModelRendererTurbo(this, 1, 693, textureX, textureY); // Box 377
		yawFlapModel[1] = new ModelRendererTurbo(this, 97, 693, textureX, textureY); // Box 391
		yawFlapModel[2] = new ModelRendererTurbo(this, 161, 693, textureX, textureY); // Box 163
		yawFlapModel[3] = new ModelRendererTurbo(this, 201, 693, textureX, textureY); // Box 164
		yawFlapModel[4] = new ModelRendererTurbo(this, 241, 693, textureX, textureY); // Box 165
		yawFlapModel[5] = new ModelRendererTurbo(this, 281, 693, textureX, textureY); // Box 166
		yawFlapModel[6] = new ModelRendererTurbo(this, 313, 693, textureX, textureY); // Box 167

		yawFlapModel[0].addShapeBox(0F, -32F, -2F, 13, 29, 4, 0F,0F, 0F, -1F, -5F, 0F, -1.5F, -5F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 377
		yawFlapModel[0].setRotationPoint(105F, -38F, 0F);

		yawFlapModel[1].addShapeBox(0F, -35F, -2F, 8, 3, 4, 0F,0F, 0F, -1.5F, -2F, -1F, -1.5F, -2F, -1F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1F); // Box 391
		yawFlapModel[1].setRotationPoint(105F, -38F, 0F);

		yawFlapModel[2].addShapeBox(0F, -3F, -2F, 13, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 163
		yawFlapModel[2].setRotationPoint(105F, -38F, 0F);

		yawFlapModel[3].addShapeBox(0F, 0F, -2F, 13, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, -1F, 0F, -1.5F, 0F, 0F, 0F); // Box 164
		yawFlapModel[3].setRotationPoint(105F, -38F, 0F);

		yawFlapModel[4].addShapeBox(0F, 3F, -2F, 12, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1.5F, -3F, 0F, -1.5F, 0F, 0F, 0F); // Box 165
		yawFlapModel[4].setRotationPoint(105F, -38F, 0F);

		yawFlapModel[5].addShapeBox(0F, 7F, -2F, 9, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -1.5F, -5F, 0F, -1.5F, 0F, 0F, 0F); // Box 166
		yawFlapModel[5].setRotationPoint(105F, -38F, 0F);

		yawFlapModel[6].addShapeBox(0F, 10F, -2F, 4, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, -1.49999F, 0F, 0F, -1.49999F, 0F, 0F, 0F, 0F, 0F, -1.49999F, 0F, -1.9999F, -1.49999F, 0F, -1.9999F, -1.49999F, 0F, 0F, -1.49999F); // Box 167
		yawFlapModel[6].setRotationPoint(105F, -38F, 0F);
	}

	private void initpitchFlapLeftModel_1()
	{
		pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 121, 727, textureX, textureY); // Import FPL_1

		pitchFlapLeftModel[0].addShapeBox(0F, -1F, 0F, 9, 2, 39, 0F,0F, 0F, 0F, -3.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Import FPL_1
		pitchFlapLeftModel[0].setRotationPoint(94F, -40F, -41F);
	}

	private void initpitchFlapRightModel_1()
	{
		pitchFlapRightModel[0] = new ModelRendererTurbo(this, 145, 770, textureX, textureY); // Box 206

		pitchFlapRightModel[0].addShapeBox(0F, -1F, 0F, 9, 2, 39, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, -3.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -3.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 206
		pitchFlapRightModel[0].setRotationPoint(94F, -40F, 2F);
	}

	private void initpitchFlapLeftWingModel_1()
	{
		pitchFlapLeftWingModel[0] = new ModelRendererTurbo(this, 425, 501, textureX, textureY); // Import LW_06

		pitchFlapLeftWingModel[0].addShapeBox(0F, 0F, 0F, 15, 8, 87, 0F,8F, 5F, 0F, -15F, 4F, 0F, 0F, -6F, 0F, 0F, -2F, 0F, 8F, -10F, 0F, -15F, -11.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import LW_06
		pitchFlapLeftWingModel[0].setRotationPoint(2F, -28F, -119F);
	}

	private void initpitchFlapRightWingModel_1()
	{
		pitchFlapRightWingModel[0] = new ModelRendererTurbo(this, 425, 597, textureX, textureY); // Box 167

		pitchFlapRightWingModel[0].addShapeBox(0F, 0F, 0F, 15, 8, 87, 0F,0F, -2F, 0F, 0F, -6F, 0F, -15F, 4F, 0F, 8F, 5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -15F, -11.5F, 0F, 8F, -10F, 0F); // Box 167
		pitchFlapRightWingModel[0].setRotationPoint(2F, -28F, 32F);
	}

	private void inittailWheelModel_1()
	{
		tailWheelModel[0] = new ModelRendererTurbo(this, 1, 492, textureX, textureY); // Import TW_6
		tailWheelModel[1] = new ModelRendererTurbo(this, 33, 492, textureX, textureY); // Box 202
		tailWheelModel[2] = new ModelRendererTurbo(this, 65, 492, textureX, textureY); // Import TW_1
		tailWheelModel[3] = new ModelRendererTurbo(this, 81, 492, textureX, textureY); // Import TW_2
		tailWheelModel[4] = new ModelRendererTurbo(this, 89, 492, textureX, textureY); // Import TW_3
		tailWheelModel[5] = new ModelRendererTurbo(this, 97, 492, textureX, textureY); // Import TW_4
		tailWheelModel[6] = new ModelRendererTurbo(this, 113, 492, textureX, textureY); // Import TW_5

		tailWheelModel[0].addShapeBox(0F, -4F, 0F, 12, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Import TW_6
		tailWheelModel[0].setRotationPoint(64F, -18.5F, -2F);
		tailWheelModel[0].rotateAngleZ = 0.13962634F;

		tailWheelModel[1].addShapeBox(0F, -4F, 0F, 12, 4, 1, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		tailWheelModel[1].setRotationPoint(64F, -18.5F, 1F);
		tailWheelModel[1].rotateAngleZ = 0.13962634F;

		tailWheelModel[2].addBox(0F, 0F, 0F, 5, 3, 1, 0F); // Import TW_1
		tailWheelModel[2].setRotationPoint(73F, -16F, -0.5F);

		tailWheelModel[3].addShapeBox(0F, 0F, 0F, 1, 6, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -3F, 0F, -0.25F, 3F, 0F, -0.25F, 3F, 0F, -0.25F, -3F, 0F, -0.25F); // Import TW_2
		tailWheelModel[3].setRotationPoint(72F, -20F, -1F);

		tailWheelModel[4].addShapeBox(0F, -4F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import TW_3
		tailWheelModel[4].setRotationPoint(72F, -20F, -1F);

		tailWheelModel[5].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import TW_4
		tailWheelModel[5].setRotationPoint(73F, -17F, -0.5F);

		tailWheelModel[6].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import TW_5
		tailWheelModel[6].setRotationPoint(73F, -13F, -0.5F);
	}

	private void initleftWingWheelModel_1()
	{
		leftWingWheelModel[0] = new ModelRendererTurbo(this, 1, 452, textureX, textureY); // Import LWW_03
		leftWingWheelModel[1] = new ModelRendererTurbo(this, 41, 452, textureX, textureY); // Import LWW_04
		leftWingWheelModel[2] = new ModelRendererTurbo(this, 81, 452, textureX, textureY); // Import LWW_05
		leftWingWheelModel[3] = new ModelRendererTurbo(this, 121, 452, textureX, textureY); // Import LWW_07
		leftWingWheelModel[4] = new ModelRendererTurbo(this, 129, 452, textureX, textureY); // Import LWW_08
		leftWingWheelModel[5] = new ModelRendererTurbo(this, 145, 452, textureX, textureY); // Import LWW_09
		leftWingWheelModel[6] = new ModelRendererTurbo(this, 161, 452, textureX, textureY); // Import LWW_11
		leftWingWheelModel[7] = new ModelRendererTurbo(this, 185, 452, textureX, textureY); // Import LWW_12
		leftWingWheelModel[8] = new ModelRendererTurbo(this, 201, 452, textureX, textureY); // Import LWW_13
		leftWingWheelModel[9] = new ModelRendererTurbo(this, 217, 452, textureX, textureY); // Import LWW_06
		leftWingWheelModel[10] = new ModelRendererTurbo(this, 225, 452, textureX, textureY); // Box 762
		leftWingWheelModel[11] = new ModelRendererTurbo(this, 273, 452, textureX, textureY); // Box 763

		leftWingWheelModel[0].addShapeBox(0F, 0F, 0F, 14, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import LWW_03
		leftWingWheelModel[0].setRotationPoint(-41F, 6F, -38F);

		leftWingWheelModel[1].addBox(0F, 0F, 0F, 14, 6, 4, 0F); // Import LWW_04
		leftWingWheelModel[1].setRotationPoint(-41F, 0F, -38F);

		leftWingWheelModel[2].addShapeBox(0F, 0F, 0F, 14, 4, 4, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LWW_05
		leftWingWheelModel[2].setRotationPoint(-41F, -4F, -38F);

		leftWingWheelModel[3].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F,-1.66666667F, 0F, 0F, 1.66666667F, 0F, 0F, 1.66666667F, 0F, 0F, -1.66666667F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LWW_07
		leftWingWheelModel[3].setRotationPoint(-35F, -4F, -34F);

		leftWingWheelModel[4].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,-2.08333333F, -2F, 0F, 2.08333333F, -2F, 0F, 2.29166667F, -1F, 0F, -2.29166667F, -1F, 0F, -1.66666667F, 0F, -3F, 1.66666667F, 0F, -3F, 1.66666667F, 0F, 2F, -1.66666667F, 0F, 2F); // Import LWW_08
		leftWingWheelModel[4].setRotationPoint(-35F, -8F, -37F);

		leftWingWheelModel[5].addShapeBox(0F, 0F, 0F, 2, 17, 2, 0F,-6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, -2.08333333F, 0F, 0F, 2.08333333F, 0F, 0F, 2.08333333F, 0F, 0F, -2.08333333F, 0F, 0F); // Import LWW_09
		leftWingWheelModel[5].setRotationPoint(-35F, -23F, -37F);

		leftWingWheelModel[6].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LWW_11
		leftWingWheelModel[6].setRotationPoint(-32.5F, -11F, -39.5F);

		leftWingWheelModel[7].addShapeBox(0F, 0F, 0F, 4, 17, 1, 0F,-5F, 0F, 1.04347826F, 5F, 0F, 1.04347826F, 5F, 0F, -1.64347826F, -5F, 0F, -1.64347826F, -1F, -2F, 4F, 6F, 0F, 4F, 6F, 0F, -4.6F, -1F, -2F, -4.6F); // Import LWW_12
		leftWingWheelModel[7].setRotationPoint(-37F, -14F, -37.5F);

		leftWingWheelModel[8].addShapeBox(0F, 0F, 0F, 4, 9, 1, 0F,-6F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, -0.6F, -6F, 0F, -0.6F, -3F, 0F, 1.04347826F, 3F, 0F, 1.04347826F, 3F, 0F, -1.64347826F, -3F, 0F, -1.64347826F); // Import LWW_13
		leftWingWheelModel[8].setRotationPoint(-35F, -23F, -37.5F);

		leftWingWheelModel[9].addBox(0F, 0F, 0F, 2, 2, 5, 0F); // Import LWW_06
		leftWingWheelModel[9].setRotationPoint(-35F, 2F, -38.5F);

		leftWingWheelModel[10].addShapeBox(0F, 0F, 0F, 15, 2, 10, 0F,2.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 2.5F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 762
		leftWingWheelModel[10].setRotationPoint(-34F, -6.5F, -3F);
		leftWingWheelModel[10].rotateAngleX = 1.57079633F;

		leftWingWheelModel[11].addShapeBox(0F, 0F, 0F, 12, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 2F, -1.5F, 0F, 3.5F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 2F, 0F, 0F, 3.5F, 0F, 0F); // Box 763
		leftWingWheelModel[11].setRotationPoint(-33F, 0.5F, -4.5F);
		leftWingWheelModel[11].rotateAngleX = 1.57079633F;
	}

	private void initrightWingWheelModel_1()
	{
		rightWingWheelModel[0] = new ModelRendererTurbo(this, 1, 472, textureX, textureY); // Box 190
		rightWingWheelModel[1] = new ModelRendererTurbo(this, 41, 472, textureX, textureY); // Box 191
		rightWingWheelModel[2] = new ModelRendererTurbo(this, 81, 472, textureX, textureY); // Box 192
		rightWingWheelModel[3] = new ModelRendererTurbo(this, 121, 472, textureX, textureY); // Box 193
		rightWingWheelModel[4] = new ModelRendererTurbo(this, 129, 472, textureX, textureY); // Box 194
		rightWingWheelModel[5] = new ModelRendererTurbo(this, 145, 472, textureX, textureY); // Box 195
		rightWingWheelModel[6] = new ModelRendererTurbo(this, 161, 472, textureX, textureY); // Box 196
		rightWingWheelModel[7] = new ModelRendererTurbo(this, 185, 472, textureX, textureY); // Box 197
		rightWingWheelModel[8] = new ModelRendererTurbo(this, 201, 472, textureX, textureY); // Box 198
		rightWingWheelModel[9] = new ModelRendererTurbo(this, 217, 472, textureX, textureY); // Box 199
		rightWingWheelModel[10] = new ModelRendererTurbo(this, 225, 472, textureX, textureY); // Box 268
		rightWingWheelModel[11] = new ModelRendererTurbo(this, 273, 472, textureX, textureY); // Box 269

		rightWingWheelModel[0].addShapeBox(0F, 0F, 0F, 14, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 190
		rightWingWheelModel[0].setRotationPoint(-41F, 6F, 34F);

		rightWingWheelModel[1].addBox(0F, 0F, 0F, 14, 6, 4, 0F); // Box 191
		rightWingWheelModel[1].setRotationPoint(-41F, 0F, 34F);

		rightWingWheelModel[2].addShapeBox(0F, 0F, 0F, 14, 4, 4, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 192
		rightWingWheelModel[2].setRotationPoint(-41F, -4F, 34F);

		rightWingWheelModel[3].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F,-1.66666667F, 0F, 0F, 1.66666667F, 0F, 0F, 1.66666667F, 0F, 0F, -1.66666667F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		rightWingWheelModel[3].setRotationPoint(-35F, -4F, 33F);

		rightWingWheelModel[4].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,-2.29166667F, -1F, 0F, 2.29166667F, -1F, 0F, 2.08333333F, -2F, 0F, -2.08333333F, -2F, 0F, -1.66666667F, 0F, 2F, 1.66666667F, 0F, 2F, 1.66666667F, 0F, -3F, -1.66666667F, 0F, -3F); // Box 194
		rightWingWheelModel[4].setRotationPoint(-35F, -8F, 35F);

		rightWingWheelModel[5].addShapeBox(0F, 0F, 0F, 2, 17, 2, 0F,-6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, -2.08333333F, 0F, 0F, 2.08333333F, 0F, 0F, 2.08333333F, 0F, 0F, -2.08333333F, 0F, 0F); // Box 195
		rightWingWheelModel[5].setRotationPoint(-35F, -23F, 35F);

		rightWingWheelModel[6].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 196
		rightWingWheelModel[6].setRotationPoint(-32.5F, -11F, 34.5F);

		rightWingWheelModel[7].addShapeBox(0F, 0F, 0F, 4, 17, 1, 0F,-5F, 0F, -1.64347826F, 5F, 0F, -1.64347826F, 5F, 0F, 1.04347826F, -5F, 0F, 1.04347826F, -1F, -2F, -4.6F, 6F, 0F, -4.6F, 6F, 0F, 4F, -1F, -2F, 4F); // Box 197
		rightWingWheelModel[7].setRotationPoint(-37F, -14F, 36.5F);

		rightWingWheelModel[8].addShapeBox(0F, 0F, 0F, 4, 9, 1, 0F,-6F, 0F, -0.6F, 5F, 0F, -0.6F, 5F, 0F, 0F, -6F, 0F, 0F, -3F, 0F, -1.64347826F, 3F, 0F, -1.64347826F, 3F, 0F, 1.04347826F, -3F, 0F, 1.04347826F); // Box 198
		rightWingWheelModel[8].setRotationPoint(-35F, -23F, 36.5F);

		rightWingWheelModel[9].addBox(0F, 0F, 0F, 2, 2, 5, 0F); // Box 199
		rightWingWheelModel[9].setRotationPoint(-35F, 2F, 33.5F);

		rightWingWheelModel[10].addShapeBox(0F, 0F, 0F, 15, 2, 10, 0F,2.5F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 268
		rightWingWheelModel[10].setRotationPoint(-34F, -6.5F, 1F);
		rightWingWheelModel[10].rotateAngleX = 1.57079633F;

		rightWingWheelModel[11].addShapeBox(0F, 0F, 0F, 12, 2, 7, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 2F, 0F, 0F, 3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1.5F, 0F, 3.5F, -1.5F, 0F); // Box 269
		rightWingWheelModel[11].setRotationPoint(-33F, 0.5F, 2.5F);
		rightWingWheelModel[11].rotateAngleX = 1.57079633F;
	}

	private void inithudModel_1()
	{
		hudModel[0] = new ModelRendererTurbo(this, 0, 115, textureX, textureY); // Box 814

		hudModel[0].addShapeBox(0F, -1F, -1F, 0, 75, 75, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -73F, 0F, 0F, -73F, 0F, -73F, 0F, 0F, -73F, 0F, 0F, -73F, -73F, 0F, -73F, -73F); // Box 814
		hudModel[0].setRotationPoint(-14.5F, -47F, 0F);
		hudModel[0].rotateAngleX = -0.01745329F;
		hudModel[0].rotateAngleY = 0.01745329F;
		hudModel[0].rotateAngleZ = -0.29670597F;
	}

	private void initPropeller()
	{
		propellerModels = new ModelRendererTurbo[1][3];
		propellerModels[0] = makeProp1(-87F, -35F, 0F);
	}

	private ModelRendererTurbo[] makeProp1(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[3];
		prop[0] = new ModelRendererTurbo(this, 0, 320, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 320, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 0, 320, textureX, textureY);
		prop[0].addBox(-0.5F, -36F, -2.5F, 1, 36, 5, 0.0F);
		prop[1].addBox(-0.5F, -36F, -2.5F, 1, 36, 5, 0.0F);
		prop[2].addBox(-0.5F, -36F, -2.5F, 1, 36, 5, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		return prop;
	}
}