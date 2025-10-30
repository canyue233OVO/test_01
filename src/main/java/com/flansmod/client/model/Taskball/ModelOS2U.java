//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: OS2U
// Model Creator: TaskForce51
// Created on: 23.04.2023 - 02:59:39
// Last changed on: 23.04.2023 - 02:59:39

package com.flansmod.client.model.Taskball; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelOS2U extends ModelPlane //Same as Filename
{
	int textureX = 512;
	int textureY = 1024;

	public ModelOS2U() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[507];
		noseModel = new ModelRendererTurbo[37];
		leftWingModel = new ModelRendererTurbo[115];
		rightWingModel = new ModelRendererTurbo[37];
		yawFlapModel = new ModelRendererTurbo[8];
		pitchFlapLeftModel = new ModelRendererTurbo[8];
		pitchFlapLeftWingModel = new ModelRendererTurbo[2];

		initbodyModel_1();
		initbodyModel_2();
		initnoseModel_1();
		initleftWingModel_1();
		initrightWingModel_1();
		inityawFlapModel_1();
		initpitchFlapLeftModel_1();
		initpitchFlapLeftWingModel_1();

		initPropeller();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 10
		bodyModel[11] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 11
		bodyModel[12] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 12
		bodyModel[13] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 13
		bodyModel[14] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 14
		bodyModel[15] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 15
		bodyModel[16] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 16
		bodyModel[17] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 17
		bodyModel[18] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Box 23
		bodyModel[19] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 24
		bodyModel[20] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 25
		bodyModel[21] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 26
		bodyModel[22] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 27
		bodyModel[23] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 28
		bodyModel[24] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 29
		bodyModel[25] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 30
		bodyModel[26] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 31
		bodyModel[27] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 32
		bodyModel[28] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 33
		bodyModel[29] = new ModelRendererTurbo(this, 369, 57, textureX, textureY); // Box 34
		bodyModel[30] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Box 35
		bodyModel[31] = new ModelRendererTurbo(this, 465, 57, textureX, textureY); // Box 36
		bodyModel[32] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 37
		bodyModel[33] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Box 38
		bodyModel[34] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Box 39
		bodyModel[35] = new ModelRendererTurbo(this, 185, 73, textureX, textureY); // Box 40
		bodyModel[36] = new ModelRendererTurbo(this, 249, 73, textureX, textureY); // Box 41
		bodyModel[37] = new ModelRendererTurbo(this, 305, 73, textureX, textureY); // Box 42
		bodyModel[38] = new ModelRendererTurbo(this, 361, 73, textureX, textureY); // Box 43
		bodyModel[39] = new ModelRendererTurbo(this, 417, 73, textureX, textureY); // Box 44
		bodyModel[40] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 45
		bodyModel[41] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Box 46
		bodyModel[42] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 47
		bodyModel[43] = new ModelRendererTurbo(this, 137, 81, textureX, textureY); // Box 48
		bodyModel[44] = new ModelRendererTurbo(this, 41, 89, textureX, textureY); // Box 49
		bodyModel[45] = new ModelRendererTurbo(this, 89, 89, textureX, textureY); // Box 50
		bodyModel[46] = new ModelRendererTurbo(this, 465, 97, textureX, textureY); // Box 59
		bodyModel[47] = new ModelRendererTurbo(this, 209, 105, textureX, textureY); // Box 68
		bodyModel[48] = new ModelRendererTurbo(this, 313, 105, textureX, textureY); // Box 70
		bodyModel[49] = new ModelRendererTurbo(this, 353, 105, textureX, textureY); // Box 71
		bodyModel[50] = new ModelRendererTurbo(this, 393, 105, textureX, textureY); // Box 72
		bodyModel[51] = new ModelRendererTurbo(this, 433, 105, textureX, textureY); // Box 73
		bodyModel[52] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 74
		bodyModel[53] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Box 75
		bodyModel[54] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 107
		bodyModel[55] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Box 116
		bodyModel[56] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 118
		bodyModel[57] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 119
		bodyModel[58] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 120
		bodyModel[59] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 121
		bodyModel[60] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 122
		bodyModel[61] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 123
		bodyModel[62] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 124
		bodyModel[63] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 125
		bodyModel[64] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 126
		bodyModel[65] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 127
		bodyModel[66] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 128
		bodyModel[67] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 129
		bodyModel[68] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // Box 130
		bodyModel[69] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 131
		bodyModel[70] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 132
		bodyModel[71] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 133
		bodyModel[72] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 134
		bodyModel[73] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // Box 135
		bodyModel[74] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Box 136
		bodyModel[75] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Box 137
		bodyModel[76] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 138
		bodyModel[77] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 139
		bodyModel[78] = new ModelRendererTurbo(this, 369, 49, textureX, textureY); // Box 140
		bodyModel[79] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 141
		bodyModel[80] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 142
		bodyModel[81] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 143
		bodyModel[82] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 144
		bodyModel[83] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Box 145
		bodyModel[84] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 146
		bodyModel[85] = new ModelRendererTurbo(this, 417, 105, textureX, textureY); // Box 147
		bodyModel[86] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 148
		bodyModel[87] = new ModelRendererTurbo(this, 457, 153, textureX, textureY); // Box 148
		bodyModel[88] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 149
		bodyModel[89] = new ModelRendererTurbo(this, 89, 161, textureX, textureY); // Box 150
		bodyModel[90] = new ModelRendererTurbo(this, 17, 113, textureX, textureY); // Box 151
		bodyModel[91] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 152
		bodyModel[92] = new ModelRendererTurbo(this, 457, 177, textureX, textureY); // Box 153
		bodyModel[93] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 154
		bodyModel[94] = new ModelRendererTurbo(this, 89, 201, textureX, textureY); // Box 155
		bodyModel[95] = new ModelRendererTurbo(this, 457, 201, textureX, textureY); // Box 156
		bodyModel[96] = new ModelRendererTurbo(this, 161, 201, textureX, textureY); // Box 157
		bodyModel[97] = new ModelRendererTurbo(this, 353, 193, textureX, textureY); // Box 158
		bodyModel[98] = new ModelRendererTurbo(this, 297, 217, textureX, textureY); // Box 159
		bodyModel[99] = new ModelRendererTurbo(this, 377, 233, textureX, textureY); // Box 160
		bodyModel[100] = new ModelRendererTurbo(this, 73, 233, textureX, textureY); // Box 161
		bodyModel[101] = new ModelRendererTurbo(this, 409, 233, textureX, textureY); // Box 162
		bodyModel[102] = new ModelRendererTurbo(this, 313, 129, textureX, textureY); // Box 163
		bodyModel[103] = new ModelRendererTurbo(this, 353, 129, textureX, textureY); // Box 164
		bodyModel[104] = new ModelRendererTurbo(this, 41, 145, textureX, textureY); // Box 165
		bodyModel[105] = new ModelRendererTurbo(this, 321, 257, textureX, textureY); // Box 171
		bodyModel[106] = new ModelRendererTurbo(this, 433, 257, textureX, textureY); // Box 172
		bodyModel[107] = new ModelRendererTurbo(this, 57, 265, textureX, textureY); // Box 173
		bodyModel[108] = new ModelRendererTurbo(this, 257, 241, textureX, textureY); // Box 174
		bodyModel[109] = new ModelRendererTurbo(this, 97, 265, textureX, textureY); // Box 175
		bodyModel[110] = new ModelRendererTurbo(this, 145, 265, textureX, textureY); // Box 176
		bodyModel[111] = new ModelRendererTurbo(this, 201, 265, textureX, textureY); // Box 177
		bodyModel[112] = new ModelRendererTurbo(this, 273, 137, textureX, textureY); // Box 178
		bodyModel[113] = new ModelRendererTurbo(this, 377, 273, textureX, textureY); // Box 179
		bodyModel[114] = new ModelRendererTurbo(this, 1, 281, textureX, textureY); // Box 180
		bodyModel[115] = new ModelRendererTurbo(this, 193, 281, textureX, textureY); // Box 181
		bodyModel[116] = new ModelRendererTurbo(this, 241, 281, textureX, textureY); // Box 182
		bodyModel[117] = new ModelRendererTurbo(this, 289, 281, textureX, textureY); // Box 183
		bodyModel[118] = new ModelRendererTurbo(this, 337, 281, textureX, textureY); // Box 184
		bodyModel[119] = new ModelRendererTurbo(this, 105, 281, textureX, textureY); // Box 185
		bodyModel[120] = new ModelRendererTurbo(this, 417, 281, textureX, textureY); // Box 186
		bodyModel[121] = new ModelRendererTurbo(this, 465, 281, textureX, textureY); // Box 187
		bodyModel[122] = new ModelRendererTurbo(this, 33, 289, textureX, textureY); // Box 188
		bodyModel[123] = new ModelRendererTurbo(this, 145, 289, textureX, textureY); // Box 189
		bodyModel[124] = new ModelRendererTurbo(this, 81, 297, textureX, textureY); // Box 190
		bodyModel[125] = new ModelRendererTurbo(this, 193, 297, textureX, textureY); // Box 191
		bodyModel[126] = new ModelRendererTurbo(this, 249, 297, textureX, textureY); // Box 192
		bodyModel[127] = new ModelRendererTurbo(this, 409, 153, textureX, textureY); // Box 193
		bodyModel[128] = new ModelRendererTurbo(this, 289, 297, textureX, textureY); // Box 194
		bodyModel[129] = new ModelRendererTurbo(this, 345, 297, textureX, textureY); // Box 195
		bodyModel[130] = new ModelRendererTurbo(this, 401, 297, textureX, textureY); // Box 196
		bodyModel[131] = new ModelRendererTurbo(this, 457, 297, textureX, textureY); // Box 197
		bodyModel[132] = new ModelRendererTurbo(this, 1, 305, textureX, textureY); // Box 198
		bodyModel[133] = new ModelRendererTurbo(this, 417, 313, textureX, textureY); // Box 207
		bodyModel[134] = new ModelRendererTurbo(this, 129, 321, textureX, textureY); // Box 216
		bodyModel[135] = new ModelRendererTurbo(this, 89, 329, textureX, textureY); // Box 218
		bodyModel[136] = new ModelRendererTurbo(this, 153, 329, textureX, textureY); // Box 219
		bodyModel[137] = new ModelRendererTurbo(this, 193, 329, textureX, textureY); // Box 220
		bodyModel[138] = new ModelRendererTurbo(this, 233, 329, textureX, textureY); // Box 221
		bodyModel[139] = new ModelRendererTurbo(this, 473, 137, textureX, textureY); // Box 222
		bodyModel[140] = new ModelRendererTurbo(this, 161, 217, textureX, textureY); // Box 223
		bodyModel[141] = new ModelRendererTurbo(this, 353, 73, textureX, textureY); // Box 255
		bodyModel[142] = new ModelRendererTurbo(this, 409, 65, textureX, textureY); // Box 264
		bodyModel[143] = new ModelRendererTurbo(this, 209, 353, textureX, textureY); // Box 265
		bodyModel[144] = new ModelRendererTurbo(this, 505, 89, textureX, textureY); // Box 266
		bodyModel[145] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 267
		bodyModel[146] = new ModelRendererTurbo(this, 313, 65, textureX, textureY); // Box 268
		bodyModel[147] = new ModelRendererTurbo(this, 361, 65, textureX, textureY); // Box 269
		bodyModel[148] = new ModelRendererTurbo(this, 457, 65, textureX, textureY); // Box 270
		bodyModel[149] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 271
		bodyModel[150] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 272
		bodyModel[151] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 273
		bodyModel[152] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 274
		bodyModel[153] = new ModelRendererTurbo(this, 337, 105, textureX, textureY); // Box 275
		bodyModel[154] = new ModelRendererTurbo(this, 225, 89, textureX, textureY); // Box 276
		bodyModel[155] = new ModelRendererTurbo(this, 353, 105, textureX, textureY); // Box 277
		bodyModel[156] = new ModelRendererTurbo(this, 457, 105, textureX, textureY); // Box 278
		bodyModel[157] = new ModelRendererTurbo(this, 273, 89, textureX, textureY); // Box 279
		bodyModel[158] = new ModelRendererTurbo(this, 361, 105, textureX, textureY); // Box 280
		bodyModel[159] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 281
		bodyModel[160] = new ModelRendererTurbo(this, 321, 89, textureX, textureY); // Box 282
		bodyModel[161] = new ModelRendererTurbo(this, 441, 105, textureX, textureY); // Box 283
		bodyModel[162] = new ModelRendererTurbo(this, 169, 113, textureX, textureY); // Box 284
		bodyModel[163] = new ModelRendererTurbo(this, 369, 89, textureX, textureY); // Box 285
		bodyModel[164] = new ModelRendererTurbo(this, 505, 113, textureX, textureY); // Box 286
		bodyModel[165] = new ModelRendererTurbo(this, 105, 121, textureX, textureY); // Box 287
		bodyModel[166] = new ModelRendererTurbo(this, 417, 89, textureX, textureY); // Box 288
		bodyModel[167] = new ModelRendererTurbo(this, 505, 73, textureX, textureY); // Box 289
		bodyModel[168] = new ModelRendererTurbo(this, 457, 113, textureX, textureY); // Box 290
		bodyModel[169] = new ModelRendererTurbo(this, 209, 137, textureX, textureY); // Box 291
		bodyModel[170] = new ModelRendererTurbo(this, 449, 153, textureX, textureY); // Box 292
		bodyModel[171] = new ModelRendererTurbo(this, 113, 121, textureX, textureY); // Box 293
		bodyModel[172] = new ModelRendererTurbo(this, 241, 193, textureX, textureY); // Box 294
		bodyModel[173] = new ModelRendererTurbo(this, 481, 233, textureX, textureY); // Box 295
		bodyModel[174] = new ModelRendererTurbo(this, 337, 449, textureX, textureY); // Import LWW01
		bodyModel[175] = new ModelRendererTurbo(this, 409, 449, textureX, textureY); // Import LWW02
		bodyModel[176] = new ModelRendererTurbo(this, 185, 473, textureX, textureY); // Import LWW03
		bodyModel[177] = new ModelRendererTurbo(this, 1, 473, textureX, textureY); // Import LWW04
		bodyModel[178] = new ModelRendererTurbo(this, 353, 481, textureX, textureY); // Import LWW05
		bodyModel[179] = new ModelRendererTurbo(this, 89, 185, textureX, textureY); // Import LWW06
		bodyModel[180] = new ModelRendererTurbo(this, 489, 265, textureX, textureY); // Import LWW07
		bodyModel[181] = new ModelRendererTurbo(this, 433, 481, textureX, textureY); // Import LWW08
		bodyModel[182] = new ModelRendererTurbo(this, 105, 489, textureX, textureY); // Import LWW09
		bodyModel[183] = new ModelRendererTurbo(this, 185, 505, textureX, textureY); // Import LWW10
		bodyModel[184] = new ModelRendererTurbo(this, 1, 505, textureX, textureY); // Import LWW11
		bodyModel[185] = new ModelRendererTurbo(this, 433, 417, textureX, textureY); // Import LWW12
		bodyModel[186] = new ModelRendererTurbo(this, 321, 369, textureX, textureY); // Import LWW13
		bodyModel[187] = new ModelRendererTurbo(this, 321, 385, textureX, textureY); // Import LWW14
		bodyModel[188] = new ModelRendererTurbo(this, 497, 361, textureX, textureY); // Import LWW19
		bodyModel[189] = new ModelRendererTurbo(this, 257, 153, textureX, textureY); // Import LWW20
		bodyModel[190] = new ModelRendererTurbo(this, 273, 369, textureX, textureY); // Box 312
		bodyModel[191] = new ModelRendererTurbo(this, 353, 401, textureX, textureY); // Box 313
		bodyModel[192] = new ModelRendererTurbo(this, 49, 353, textureX, textureY); // Box 315
		bodyModel[193] = new ModelRendererTurbo(this, 289, 369, textureX, textureY); // Box 316
		bodyModel[194] = new ModelRendererTurbo(this, 361, 369, textureX, textureY); // Box 316
		bodyModel[195] = new ModelRendererTurbo(this, 377, 369, textureX, textureY); // Box 316
		bodyModel[196] = new ModelRendererTurbo(this, 177, 377, textureX, textureY); // Box 317
		bodyModel[197] = new ModelRendererTurbo(this, 433, 585, textureX, textureY); // Box 87
		bodyModel[198] = new ModelRendererTurbo(this, 217, 593, textureX, textureY); // Box 88
		bodyModel[199] = new ModelRendererTurbo(this, 1, 601, textureX, textureY); // Box 89
		bodyModel[200] = new ModelRendererTurbo(this, 489, 329, textureX, textureY); // Box 213
		bodyModel[201] = new ModelRendererTurbo(this, 81, 329, textureX, textureY); // Box 214
		bodyModel[202] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 233
		bodyModel[203] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 234
		bodyModel[204] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 235
		bodyModel[205] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 236
		bodyModel[206] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 237
		bodyModel[207] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 238
		bodyModel[208] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 239
		bodyModel[209] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 240
		bodyModel[210] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 241
		bodyModel[211] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 242
		bodyModel[212] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 243
		bodyModel[213] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 244
		bodyModel[214] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 248
		bodyModel[215] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 249
		bodyModel[216] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 250
		bodyModel[217] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 251
		bodyModel[218] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 252
		bodyModel[219] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 253
		bodyModel[220] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Box 254
		bodyModel[221] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 255
		bodyModel[222] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 256
		bodyModel[223] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 257
		bodyModel[224] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 258
		bodyModel[225] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 259
		bodyModel[226] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 260
		bodyModel[227] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Box 261
		bodyModel[228] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 262
		bodyModel[229] = new ModelRendererTurbo(this, 9, 41, textureX, textureY); // Box 263
		bodyModel[230] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 265
		bodyModel[231] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 266
		bodyModel[232] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 267
		bodyModel[233] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 268
		bodyModel[234] = new ModelRendererTurbo(this, 481, 41, textureX, textureY); // Box 269
		bodyModel[235] = new ModelRendererTurbo(this, 9, 49, textureX, textureY); // Box 270
		bodyModel[236] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 271
		bodyModel[237] = new ModelRendererTurbo(this, 361, 57, textureX, textureY); // Box 272
		bodyModel[238] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 273
		bodyModel[239] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 274
		bodyModel[240] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 275
		bodyModel[241] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 276
		bodyModel[242] = new ModelRendererTurbo(this, 129, 89, textureX, textureY); // Box 277
		bodyModel[243] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 278
		bodyModel[244] = new ModelRendererTurbo(this, 417, 73, textureX, textureY); // Box 279
		bodyModel[245] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 280
		bodyModel[246] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Box 281
		bodyModel[247] = new ModelRendererTurbo(this, 313, 57, textureX, textureY); // Box 282
		bodyModel[248] = new ModelRendererTurbo(this, 409, 57, textureX, textureY); // Box 283
		bodyModel[249] = new ModelRendererTurbo(this, 457, 57, textureX, textureY); // Box 284
		bodyModel[250] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Box 285
		bodyModel[251] = new ModelRendererTurbo(this, 185, 81, textureX, textureY); // Box 286
		bodyModel[252] = new ModelRendererTurbo(this, 233, 81, textureX, textureY); // Box 287
		bodyModel[253] = new ModelRendererTurbo(this, 241, 81, textureX, textureY); // Box 288
		bodyModel[254] = new ModelRendererTurbo(this, 89, 89, textureX, textureY); // Box 289
		bodyModel[255] = new ModelRendererTurbo(this, 233, 89, textureX, textureY); // Box 290
		bodyModel[256] = new ModelRendererTurbo(this, 465, 89, textureX, textureY); // Box 307
		bodyModel[257] = new ModelRendererTurbo(this, 281, 89, textureX, textureY); // Box 308
		bodyModel[258] = new ModelRendererTurbo(this, 329, 89, textureX, textureY); // Box 309
		bodyModel[259] = new ModelRendererTurbo(this, 377, 89, textureX, textureY); // Box 310
		bodyModel[260] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 311
		bodyModel[261] = new ModelRendererTurbo(this, 425, 89, textureX, textureY); // Box 312
		bodyModel[262] = new ModelRendererTurbo(this, 169, 97, textureX, textureY); // Box 313
		bodyModel[263] = new ModelRendererTurbo(this, 177, 97, textureX, textureY); // Box 314
		bodyModel[264] = new ModelRendererTurbo(this, 49, 105, textureX, textureY); // Box 315
		bodyModel[265] = new ModelRendererTurbo(this, 89, 105, textureX, textureY); // Box 316
		bodyModel[266] = new ModelRendererTurbo(this, 209, 105, textureX, textureY); // Box 317
		bodyModel[267] = new ModelRendererTurbo(this, 497, 113, textureX, textureY); // Box 318
		bodyModel[268] = new ModelRendererTurbo(this, 305, 105, textureX, textureY); // Box 319
		bodyModel[269] = new ModelRendererTurbo(this, 249, 113, textureX, textureY); // Box 320
		bodyModel[270] = new ModelRendererTurbo(this, 401, 113, textureX, textureY); // Box 321
		bodyModel[271] = new ModelRendererTurbo(this, 337, 113, textureX, textureY); // Box 322
		bodyModel[272] = new ModelRendererTurbo(this, 57, 121, textureX, textureY); // Box 323
		bodyModel[273] = new ModelRendererTurbo(this, 169, 121, textureX, textureY); // Box 324
		bodyModel[274] = new ModelRendererTurbo(this, 209, 121, textureX, textureY); // Box 325
		bodyModel[275] = new ModelRendererTurbo(this, 233, 121, textureX, textureY); // Box 326
		bodyModel[276] = new ModelRendererTurbo(this, 241, 121, textureX, textureY); // Box 327
		bodyModel[277] = new ModelRendererTurbo(this, 105, 129, textureX, textureY); // Box 328
		bodyModel[278] = new ModelRendererTurbo(this, 337, 129, textureX, textureY); // Box 329
		bodyModel[279] = new ModelRendererTurbo(this, 377, 129, textureX, textureY); // Box 330
		bodyModel[280] = new ModelRendererTurbo(this, 385, 129, textureX, textureY); // Box 331
		bodyModel[281] = new ModelRendererTurbo(this, 505, 129, textureX, textureY); // Box 332
		bodyModel[282] = new ModelRendererTurbo(this, 57, 137, textureX, textureY); // Box 333
		bodyModel[283] = new ModelRendererTurbo(this, 65, 137, textureX, textureY); // Box 334
		bodyModel[284] = new ModelRendererTurbo(this, 305, 137, textureX, textureY); // Box 335
		bodyModel[285] = new ModelRendererTurbo(this, 497, 137, textureX, textureY); // Box 336
		bodyModel[286] = new ModelRendererTurbo(this, 505, 137, textureX, textureY); // Box 337
		bodyModel[287] = new ModelRendererTurbo(this, 65, 145, textureX, textureY); // Box 338
		bodyModel[288] = new ModelRendererTurbo(this, 497, 145, textureX, textureY); // Box 339
		bodyModel[289] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 340
		bodyModel[290] = new ModelRendererTurbo(this, 505, 145, textureX, textureY); // Box 341
		bodyModel[291] = new ModelRendererTurbo(this, 409, 153, textureX, textureY); // Box 342
		bodyModel[292] = new ModelRendererTurbo(this, 505, 153, textureX, textureY); // Box 343
		bodyModel[293] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 344
		bodyModel[294] = new ModelRendererTurbo(this, 89, 161, textureX, textureY); // Box 345
		bodyModel[295] = new ModelRendererTurbo(this, 41, 161, textureX, textureY); // Box 346
		bodyModel[296] = new ModelRendererTurbo(this, 49, 161, textureX, textureY); // Box 347
		bodyModel[297] = new ModelRendererTurbo(this, 129, 161, textureX, textureY); // Box 348
		bodyModel[298] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 349
		bodyModel[299] = new ModelRendererTurbo(this, 465, 161, textureX, textureY); // Box 350
		bodyModel[300] = new ModelRendererTurbo(this, 505, 161, textureX, textureY); // Box 351
		bodyModel[301] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 352
		bodyModel[302] = new ModelRendererTurbo(this, 49, 177, textureX, textureY); // Box 353
		bodyModel[303] = new ModelRendererTurbo(this, 9, 177, textureX, textureY); // Box 354
		bodyModel[304] = new ModelRendererTurbo(this, 129, 177, textureX, textureY); // Box 355
		bodyModel[305] = new ModelRendererTurbo(this, 457, 177, textureX, textureY); // Box 356
		bodyModel[306] = new ModelRendererTurbo(this, 465, 177, textureX, textureY); // Box 387
		bodyModel[307] = new ModelRendererTurbo(this, 505, 177, textureX, textureY); // Box 388
		bodyModel[308] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 390
		bodyModel[309] = new ModelRendererTurbo(this, 9, 185, textureX, textureY); // Box 391
		bodyModel[310] = new ModelRendererTurbo(this, 49, 185, textureX, textureY); // Box 392
		bodyModel[311] = new ModelRendererTurbo(this, 457, 185, textureX, textureY); // Box 393
		bodyModel[312] = new ModelRendererTurbo(this, 465, 185, textureX, textureY); // Box 394
		bodyModel[313] = new ModelRendererTurbo(this, 505, 185, textureX, textureY); // Box 395
		bodyModel[314] = new ModelRendererTurbo(this, 393, 193, textureX, textureY); // Box 396
		bodyModel[315] = new ModelRendererTurbo(this, 401, 193, textureX, textureY); // Box 397
		bodyModel[316] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 398
		bodyModel[317] = new ModelRendererTurbo(this, 41, 201, textureX, textureY); // Box 399
		bodyModel[318] = new ModelRendererTurbo(this, 89, 201, textureX, textureY); // Box 400
		bodyModel[319] = new ModelRendererTurbo(this, 129, 201, textureX, textureY); // Box 401
		bodyModel[320] = new ModelRendererTurbo(this, 137, 201, textureX, textureY); // Box 402
		bodyModel[321] = new ModelRendererTurbo(this, 161, 201, textureX, textureY); // Box 403
		bodyModel[322] = new ModelRendererTurbo(this, 457, 201, textureX, textureY); // Box 404
		bodyModel[323] = new ModelRendererTurbo(this, 505, 201, textureX, textureY); // Box 405
		bodyModel[324] = new ModelRendererTurbo(this, 137, 209, textureX, textureY); // Box 406
		bodyModel[325] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 407
		bodyModel[326] = new ModelRendererTurbo(this, 161, 217, textureX, textureY); // Box 408
		bodyModel[327] = new ModelRendererTurbo(this, 161, 209, textureX, textureY); // Box 409
		bodyModel[328] = new ModelRendererTurbo(this, 185, 217, textureX, textureY); // Box 410
		bodyModel[329] = new ModelRendererTurbo(this, 225, 217, textureX, textureY); // Box 411
		bodyModel[330] = new ModelRendererTurbo(this, 233, 217, textureX, textureY); // Box 412
		bodyModel[331] = new ModelRendererTurbo(this, 337, 217, textureX, textureY); // Box 413
		bodyModel[332] = new ModelRendererTurbo(this, 345, 217, textureX, textureY); // Box 414
		bodyModel[333] = new ModelRendererTurbo(this, 225, 225, textureX, textureY); // Box 415
		bodyModel[334] = new ModelRendererTurbo(this, 233, 225, textureX, textureY); // Box 416
		bodyModel[335] = new ModelRendererTurbo(this, 337, 225, textureX, textureY); // Box 417
		bodyModel[336] = new ModelRendererTurbo(this, 345, 225, textureX, textureY); // Box 418
		bodyModel[337] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Box 419
		bodyModel[338] = new ModelRendererTurbo(this, 9, 233, textureX, textureY); // Box 421
		bodyModel[339] = new ModelRendererTurbo(this, 73, 233, textureX, textureY); // Box 422
		bodyModel[340] = new ModelRendererTurbo(this, 105, 233, textureX, textureY); // Box 423
		bodyModel[341] = new ModelRendererTurbo(this, 441, 233, textureX, textureY); // Box 424
		bodyModel[342] = new ModelRendererTurbo(this, 505, 233, textureX, textureY); // Box 425
		bodyModel[343] = new ModelRendererTurbo(this, 1, 241, textureX, textureY); // Box 426
		bodyModel[344] = new ModelRendererTurbo(this, 9, 241, textureX, textureY); // Box 427
		bodyModel[345] = new ModelRendererTurbo(this, 297, 241, textureX, textureY); // Box 428
		bodyModel[346] = new ModelRendererTurbo(this, 305, 241, textureX, textureY); // Box 429
		bodyModel[347] = new ModelRendererTurbo(this, 441, 241, textureX, textureY); // Box 430
		bodyModel[348] = new ModelRendererTurbo(this, 505, 241, textureX, textureY); // Box 431
		bodyModel[349] = new ModelRendererTurbo(this, 449, 241, textureX, textureY); // Box 432
		bodyModel[350] = new ModelRendererTurbo(this, 129, 249, textureX, textureY); // Box 433
		bodyModel[351] = new ModelRendererTurbo(this, 145, 249, textureX, textureY); // Box 434
		bodyModel[352] = new ModelRendererTurbo(this, 153, 249, textureX, textureY); // Box 435
		bodyModel[353] = new ModelRendererTurbo(this, 257, 249, textureX, textureY); // Box 436
		bodyModel[354] = new ModelRendererTurbo(this, 433, 249, textureX, textureY); // Box 437
		bodyModel[355] = new ModelRendererTurbo(this, 441, 249, textureX, textureY); // Box 438
		bodyModel[356] = new ModelRendererTurbo(this, 1, 257, textureX, textureY); // Box 439
		bodyModel[357] = new ModelRendererTurbo(this, 9, 257, textureX, textureY); // Box 440
		bodyModel[358] = new ModelRendererTurbo(this, 153, 257, textureX, textureY); // Box 441
		bodyModel[359] = new ModelRendererTurbo(this, 257, 257, textureX, textureY); // Box 442
		bodyModel[360] = new ModelRendererTurbo(this, 305, 257, textureX, textureY); // Box 443
		bodyModel[361] = new ModelRendererTurbo(this, 329, 257, textureX, textureY); // Box 444
		bodyModel[362] = new ModelRendererTurbo(this, 385, 257, textureX, textureY); // Box 445
		bodyModel[363] = new ModelRendererTurbo(this, 433, 257, textureX, textureY); // Box 446
		bodyModel[364] = new ModelRendererTurbo(this, 441, 257, textureX, textureY); // Box 447
		bodyModel[365] = new ModelRendererTurbo(this, 505, 257, textureX, textureY); // Box 448
		bodyModel[366] = new ModelRendererTurbo(this, 1, 265, textureX, textureY); // Box 449
		bodyModel[367] = new ModelRendererTurbo(this, 9, 265, textureX, textureY); // Box 450
		bodyModel[368] = new ModelRendererTurbo(this, 57, 265, textureX, textureY); // Box 451
		bodyModel[369] = new ModelRendererTurbo(this, 65, 265, textureX, textureY); // Box 452
		bodyModel[370] = new ModelRendererTurbo(this, 97, 265, textureX, textureY); // Box 453
		bodyModel[371] = new ModelRendererTurbo(this, 137, 265, textureX, textureY); // Box 454
		bodyModel[372] = new ModelRendererTurbo(this, 145, 265, textureX, textureY); // Box 455
		bodyModel[373] = new ModelRendererTurbo(this, 241, 265, textureX, textureY); // Box 456
		bodyModel[374] = new ModelRendererTurbo(this, 249, 265, textureX, textureY); // Box 457
		bodyModel[375] = new ModelRendererTurbo(this, 257, 265, textureX, textureY); // Box 458
		bodyModel[376] = new ModelRendererTurbo(this, 361, 265, textureX, textureY); // Box 459
		bodyModel[377] = new ModelRendererTurbo(this, 369, 265, textureX, textureY); // Box 460
		bodyModel[378] = new ModelRendererTurbo(this, 473, 265, textureX, textureY); // Box 461
		bodyModel[379] = new ModelRendererTurbo(this, 481, 265, textureX, textureY); // Box 462
		bodyModel[380] = new ModelRendererTurbo(this, 505, 265, textureX, textureY); // Box 463
		bodyModel[381] = new ModelRendererTurbo(this, 145, 273, textureX, textureY); // Box 464
		bodyModel[382] = new ModelRendererTurbo(this, 185, 273, textureX, textureY); // Box 465
		bodyModel[383] = new ModelRendererTurbo(this, 193, 273, textureX, textureY); // Box 466
		bodyModel[384] = new ModelRendererTurbo(this, 417, 273, textureX, textureY); // Box 467
		bodyModel[385] = new ModelRendererTurbo(this, 425, 273, textureX, textureY); // Box 468
		bodyModel[386] = new ModelRendererTurbo(this, 505, 273, textureX, textureY); // Box 469
		bodyModel[387] = new ModelRendererTurbo(this, 41, 281, textureX, textureY); // Box 470
		bodyModel[388] = new ModelRendererTurbo(this, 49, 281, textureX, textureY); // Box 471
		bodyModel[389] = new ModelRendererTurbo(this, 233, 281, textureX, textureY); // Box 472
		bodyModel[390] = new ModelRendererTurbo(this, 281, 281, textureX, textureY); // Box 473
		bodyModel[391] = new ModelRendererTurbo(this, 329, 281, textureX, textureY); // Box 474
		bodyModel[392] = new ModelRendererTurbo(this, 457, 281, textureX, textureY); // Box 475
		bodyModel[393] = new ModelRendererTurbo(this, 465, 281, textureX, textureY); // Box 476
		bodyModel[394] = new ModelRendererTurbo(this, 281, 289, textureX, textureY); // Box 477
		bodyModel[395] = new ModelRendererTurbo(this, 329, 289, textureX, textureY); // Box 478
		bodyModel[396] = new ModelRendererTurbo(this, 33, 297, textureX, textureY); // Box 480
		bodyModel[397] = new ModelRendererTurbo(this, 81, 297, textureX, textureY); // Box 481
		bodyModel[398] = new ModelRendererTurbo(this, 129, 297, textureX, textureY); // Box 482
		bodyModel[399] = new ModelRendererTurbo(this, 137, 297, textureX, textureY); // Box 483
		bodyModel[400] = new ModelRendererTurbo(this, 241, 297, textureX, textureY); // Box 484
		bodyModel[401] = new ModelRendererTurbo(this, 249, 297, textureX, textureY); // Box 485
		bodyModel[402] = new ModelRendererTurbo(this, 337, 297, textureX, textureY); // Box 486
		bodyModel[403] = new ModelRendererTurbo(this, 345, 297, textureX, textureY); // Box 487
		bodyModel[404] = new ModelRendererTurbo(this, 393, 297, textureX, textureY); // Box 488
		bodyModel[405] = new ModelRendererTurbo(this, 401, 297, textureX, textureY); // Box 489
		bodyModel[406] = new ModelRendererTurbo(this, 145, 601, textureX, textureY); // Box 490
		bodyModel[407] = new ModelRendererTurbo(this, 449, 297, textureX, textureY); // Box 574
		bodyModel[408] = new ModelRendererTurbo(this, 505, 297, textureX, textureY); // Box 575
		bodyModel[409] = new ModelRendererTurbo(this, 1, 305, textureX, textureY); // Box 576
		bodyModel[410] = new ModelRendererTurbo(this, 41, 305, textureX, textureY); // Box 580
		bodyModel[411] = new ModelRendererTurbo(this, 49, 305, textureX, textureY); // Box 581
		bodyModel[412] = new ModelRendererTurbo(this, 57, 305, textureX, textureY); // Box 582
		bodyModel[413] = new ModelRendererTurbo(this, 65, 305, textureX, textureY); // Box 601
		bodyModel[414] = new ModelRendererTurbo(this, 169, 305, textureX, textureY); // Box 602
		bodyModel[415] = new ModelRendererTurbo(this, 185, 305, textureX, textureY); // Box 603
		bodyModel[416] = new ModelRendererTurbo(this, 81, 313, textureX, textureY); // Box 604
		bodyModel[417] = new ModelRendererTurbo(this, 161, 321, textureX, textureY); // Box 605
		bodyModel[418] = new ModelRendererTurbo(this, 217, 313, textureX, textureY); // Box 606
		bodyModel[419] = new ModelRendererTurbo(this, 265, 313, textureX, textureY); // Box 607
		bodyModel[420] = new ModelRendererTurbo(this, 201, 329, textureX, textureY); // Box 608
		bodyModel[421] = new ModelRendererTurbo(this, 257, 601, textureX, textureY); // Box 356
		bodyModel[422] = new ModelRendererTurbo(this, 1, 337, textureX, textureY); // Box 256
		bodyModel[423] = new ModelRendererTurbo(this, 441, 329, textureX, textureY); // Box 249
		bodyModel[424] = new ModelRendererTurbo(this, 361, 345, textureX, textureY); // Box 254
		bodyModel[425] = new ModelRendererTurbo(this, 113, 329, textureX, textureY); // Box 263
		bodyModel[426] = new ModelRendererTurbo(this, 89, 313, textureX, textureY); // Box 264
		bodyModel[427] = new ModelRendererTurbo(this, 177, 313, textureX, textureY); // Box 265
		bodyModel[428] = new ModelRendererTurbo(this, 313, 313, textureX, textureY); // Box 266
		bodyModel[429] = new ModelRendererTurbo(this, 145, 577, textureX, textureY); // Box 239
		bodyModel[430] = new ModelRendererTurbo(this, 89, 353, textureX, textureY); // Box 240
		bodyModel[431] = new ModelRendererTurbo(this, 321, 329, textureX, textureY); // Box 241
		bodyModel[432] = new ModelRendererTurbo(this, 17, 337, textureX, textureY); // Box 242
		bodyModel[433] = new ModelRendererTurbo(this, 241, 353, textureX, textureY); // Box 243
		bodyModel[434] = new ModelRendererTurbo(this, 481, 585, textureX, textureY); // Box 244
		bodyModel[435] = new ModelRendererTurbo(this, 369, 329, textureX, textureY); // Box 245
		bodyModel[436] = new ModelRendererTurbo(this, 489, 441, textureX, textureY); // Box 246
		bodyModel[437] = new ModelRendererTurbo(this, 113, 353, textureX, textureY); // Box 247
		bodyModel[438] = new ModelRendererTurbo(this, 489, 369, textureX, textureY); // Box 248
		bodyModel[439] = new ModelRendererTurbo(this, 1, 393, textureX, textureY); // Box 250
		bodyModel[440] = new ModelRendererTurbo(this, 9, 393, textureX, textureY); // Box 251
		bodyModel[441] = new ModelRendererTurbo(this, 153, 361, textureX, textureY); // Box 252
		bodyModel[442] = new ModelRendererTurbo(this, 177, 361, textureX, textureY); // Box 253
		bodyModel[443] = new ModelRendererTurbo(this, 401, 185, textureX, textureY); // Box 962
		bodyModel[444] = new ModelRendererTurbo(this, 233, 193, textureX, textureY); // Box 964
		bodyModel[445] = new ModelRendererTurbo(this, 401, 209, textureX, textureY); // Box 966
		bodyModel[446] = new ModelRendererTurbo(this, 201, 361, textureX, textureY); // Box 484
		bodyModel[447] = new ModelRendererTurbo(this, 497, 345, textureX, textureY); // Box 485
		bodyModel[448] = new ModelRendererTurbo(this, 369, 353, textureX, textureY); // Box 487
		bodyModel[449] = new ModelRendererTurbo(this, 361, 385, textureX, textureY); // Box 488
		bodyModel[450] = new ModelRendererTurbo(this, 393, 449, textureX, textureY); // Box 489
		bodyModel[451] = new ModelRendererTurbo(this, 89, 401, textureX, textureY); // Box 490
		bodyModel[452] = new ModelRendererTurbo(this, 321, 369, textureX, textureY); // Box 491
		bodyModel[453] = new ModelRendererTurbo(this, 393, 369, textureX, textureY); // Box 492
		bodyModel[454] = new ModelRendererTurbo(this, 289, 601, textureX, textureY); // Box 493
		bodyModel[455] = new ModelRendererTurbo(this, 17, 393, textureX, textureY); // Box 494
		bodyModel[456] = new ModelRendererTurbo(this, 329, 417, textureX, textureY); // Box 495
		bodyModel[457] = new ModelRendererTurbo(this, 241, 329, textureX, textureY); // Box 496
		bodyModel[458] = new ModelRendererTurbo(this, 353, 369, textureX, textureY); // Box 497
		bodyModel[459] = new ModelRendererTurbo(this, 89, 377, textureX, textureY); // Box 498
		bodyModel[460] = new ModelRendererTurbo(this, 97, 377, textureX, textureY); // Box 499
		bodyModel[461] = new ModelRendererTurbo(this, 489, 393, textureX, textureY); // Box 578
		bodyModel[462] = new ModelRendererTurbo(this, 121, 425, textureX, textureY); // Box 579
		bodyModel[463] = new ModelRendererTurbo(this, 57, 601, textureX, textureY); // Box 580
		bodyModel[464] = new ModelRendererTurbo(this, 185, 601, textureX, textureY); // Box 582
		bodyModel[465] = new ModelRendererTurbo(this, 121, 401, textureX, textureY); // Box 583
		bodyModel[466] = new ModelRendererTurbo(this, 273, 417, textureX, textureY); // Box 584
		bodyModel[467] = new ModelRendererTurbo(this, 321, 449, textureX, textureY); // Box 585
		bodyModel[468] = new ModelRendererTurbo(this, 297, 417, textureX, textureY); // Box 586
		bodyModel[469] = new ModelRendererTurbo(this, 241, 441, textureX, textureY); // Box 587
		bodyModel[470] = new ModelRendererTurbo(this, 81, 609, textureX, textureY); // Box 588
		bodyModel[471] = new ModelRendererTurbo(this, 321, 441, textureX, textureY); // Box 589
		bodyModel[472] = new ModelRendererTurbo(this, 345, 449, textureX, textureY); // Box 590
		bodyModel[473] = new ModelRendererTurbo(this, 497, 233, textureX, textureY); // Box 591
		bodyModel[474] = new ModelRendererTurbo(this, 313, 273, textureX, textureY); // Box 592
		bodyModel[475] = new ModelRendererTurbo(this, 233, 289, textureX, textureY); // Box 593
		bodyModel[476] = new ModelRendererTurbo(this, 161, 377, textureX, textureY); // Box 594
		bodyModel[477] = new ModelRendererTurbo(this, 409, 609, textureX, textureY); // Box 380
		bodyModel[478] = new ModelRendererTurbo(this, 89, 617, textureX, textureY); // Box 381
		bodyModel[479] = new ModelRendererTurbo(this, 321, 313, textureX, textureY); // Box 399
		bodyModel[480] = new ModelRendererTurbo(this, 265, 441, textureX, textureY); // Box 0
		bodyModel[481] = new ModelRendererTurbo(this, 361, 313, textureX, textureY); // Box 2
		bodyModel[482] = new ModelRendererTurbo(this, 409, 313, textureX, textureY); // Box 3
		bodyModel[483] = new ModelRendererTurbo(this, 457, 313, textureX, textureY); // Box 4
		bodyModel[484] = new ModelRendererTurbo(this, 369, 313, textureX, textureY); // Box 5
		bodyModel[485] = new ModelRendererTurbo(this, 417, 313, textureX, textureY); // Box 6
		bodyModel[486] = new ModelRendererTurbo(this, 465, 313, textureX, textureY); // Box 7
		bodyModel[487] = new ModelRendererTurbo(this, 505, 313, textureX, textureY); // Box 8
		bodyModel[488] = new ModelRendererTurbo(this, 169, 465, textureX, textureY); // Box 9
		bodyModel[489] = new ModelRendererTurbo(this, 289, 441, textureX, textureY); // Box 10
		bodyModel[490] = new ModelRendererTurbo(this, 33, 321, textureX, textureY); // Box 11
		bodyModel[491] = new ModelRendererTurbo(this, 273, 329, textureX, textureY); // Box 12
		bodyModel[492] = new ModelRendererTurbo(this, 481, 329, textureX, textureY); // Box 13
		bodyModel[493] = new ModelRendererTurbo(this, 113, 337, textureX, textureY); // Box 14
		bodyModel[494] = new ModelRendererTurbo(this, 153, 337, textureX, textureY); // Box 15
		bodyModel[495] = new ModelRendererTurbo(this, 321, 377, textureX, textureY); // Box 16
		bodyModel[496] = new ModelRendererTurbo(this, 457, 321, textureX, textureY); // Box 18
		bodyModel[497] = new ModelRendererTurbo(this, 321, 337, textureX, textureY); // Box 20
		bodyModel[498] = new ModelRendererTurbo(this, 89, 353, textureX, textureY); // Box 21
		bodyModel[499] = new ModelRendererTurbo(this, 321, 385, textureX, textureY); // Box 22

		bodyModel[0].addShapeBox(0F, 0F, 0F, 14, 5, 13, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-28F, -36F, -13F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 14, 8, 11, 0F,-1F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[1].setRotationPoint(-28F, -44F, -11F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 13, 5, 7, 0F,-1F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[2].setRotationPoint(-27F, -49F, -7F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 12, 2, 4, 0F,-1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[3].setRotationPoint(-26F, -51F, -4F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 14, 5, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[4].setRotationPoint(-28F, -31F, -13F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 14, 5, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[5].setRotationPoint(-28F, -26F, -13F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 14, 4, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[6].setRotationPoint(-28F, -21F, -11F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 14, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[7].setRotationPoint(-28F, -17F, -8F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 17, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[8].setRotationPoint(-45F, -17F, -8F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 17, 4, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[9].setRotationPoint(-45F, -21F, -11F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 17, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[10].setRotationPoint(-45F, -26F, -13F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 17, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[11].setRotationPoint(-45F, -31F, -13F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 17, 5, 3, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[12].setRotationPoint(-45F, -36F, -13F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 10, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[13].setRotationPoint(-55F, -17F, -8F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 10, 4, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[14].setRotationPoint(-55F, -21F, -11F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 10, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[15].setRotationPoint(-55F, -26F, -13F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 10, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[16].setRotationPoint(-55F, -31F, -13F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 10, 5, 3, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[17].setRotationPoint(-55F, -36F, -13F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 13, 5, 13, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[18].setRotationPoint(-14F, -36F, -13F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 13, 5, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[19].setRotationPoint(-14F, -31F, -13F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 13, 5, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[20].setRotationPoint(-14F, -26F, -13F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 13, 4, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[21].setRotationPoint(-14F, -21F, -11F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 13, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[22].setRotationPoint(-14F, -17F, -8F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 13, 8, 11, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[23].setRotationPoint(-14F, -44F, -11F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 13, 5, 7, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[24].setRotationPoint(-14F, -49F, -7F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 13, 2, 4, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[25].setRotationPoint(-14F, -51F, -4F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 17, 5, 4, 0F,0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F); // Box 31
		bodyModel[26].setRotationPoint(-1F, -36F, -13F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 17, 5, 3, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 32
		bodyModel[27].setRotationPoint(16F, -36F, -12F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 17, 5, 4, 0F,0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -3F); // Box 33
		bodyModel[28].setRotationPoint(33F, -36F, -11F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 17, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 34
		bodyModel[29].setRotationPoint(-1F, -31F, -13F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 17, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 35
		bodyModel[30].setRotationPoint(16F, -31F, -12F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 17, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -3F); // Box 36
		bodyModel[31].setRotationPoint(33F, -31F, -11F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 17, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[32].setRotationPoint(-1F, -26F, -13F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 17, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[33].setRotationPoint(16F, -26F, -12F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 17, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 39
		bodyModel[34].setRotationPoint(33F, -26F, -11F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 17, 4, 11, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[35].setRotationPoint(-1F, -21F, -11F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 17, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, -5F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[36].setRotationPoint(16F, -21F, -10F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 17, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, -2.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.9999F, 0F, -2.9999F, -2.9999F, 0F, -2.9999F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[37].setRotationPoint(33F, -21F, -9F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 17, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -1F, -5F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[38].setRotationPoint(-1F, -17F, -8F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 17, 2, 6, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, -3F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[39].setRotationPoint(16F, -17F, -6F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 17, 1, 5, 0F,0F, 0F, 0F, 0F, 3F, 1F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, 1F, 0F); // Box 45
		bodyModel[40].setRotationPoint(33F, -18F, -5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 16, 5, 9, 0F,0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[41].setRotationPoint(50F, -36F, -9F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 16, 6, 8, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[42].setRotationPoint(50F, -42F, -8F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 16, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[43].setRotationPoint(50F, -31F, -9F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 16, 5, 9, 0F,0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, -4F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[44].setRotationPoint(50F, -26F, -9F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 16, 2, 6, 0F,0F, 0F, 0F, 0F, 3F, -1F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[45].setRotationPoint(50F, -21F, -6F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 16, 5, 5, 0F,0F, 0F, -3F, 0F, -1F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[46].setRotationPoint(50F, -47F, -5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 10, 6, 8, 0F,0F, 0F, -7F, -8F, 0F, -7F, -8F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F); // Box 68
		bodyModel[47].setRotationPoint(-55F, -42F, -11F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 5, 6, 11, 0F,0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[48].setRotationPoint(-60F, -42F, -11F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 5, 5, 13, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[49].setRotationPoint(-60F, -36F, -13F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 5, 5, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		bodyModel[50].setRotationPoint(-60F, -31F, -13F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 5, 5, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[51].setRotationPoint(-60F, -26F, -13F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 5, 4, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[52].setRotationPoint(-60F, -21F, -11F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 5, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[53].setRotationPoint(-60F, -17F, -8F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		bodyModel[54].setRotationPoint(-55F, -42F, -4F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[55].setRotationPoint(-45F, -47F, -11F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		bodyModel[56].setRotationPoint(-45F, -47F, -5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[57].setRotationPoint(-35F, -47F, -11F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 120
		bodyModel[58].setRotationPoint(-45F, -50F, -5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[59].setRotationPoint(-45F, -51F, -3F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[60].setRotationPoint(-35F, -51F, -3F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 123
		bodyModel[61].setRotationPoint(-35F, -50F, -5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 124
		bodyModel[62].setRotationPoint(-49F, -47F, -5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F); // Box 125
		bodyModel[63].setRotationPoint(-53F, -47F, -4F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[64].setRotationPoint(-49F, -49F, -4F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		bodyModel[65].setRotationPoint(-48F, -50F, -3F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 128
		bodyModel[66].setRotationPoint(6F, -50F, -5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[67].setRotationPoint(6F, -51F, -3F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[68].setRotationPoint(6F, -47F, -11F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 131
		bodyModel[69].setRotationPoint(15F, -49F, -5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[70].setRotationPoint(15F, -50F, -3F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 133
		bodyModel[71].setRotationPoint(15F, -46F, -11F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 134
		bodyModel[72].setRotationPoint(24F, -48F, -5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[73].setRotationPoint(24F, -49F, -3F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 136
		bodyModel[74].setRotationPoint(24F, -45F, -11F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 137
		bodyModel[75].setRotationPoint(32F, -47F, -5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[76].setRotationPoint(32F, -48F, -3F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 139
		bodyModel[77].setRotationPoint(32F, -44F, -11F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 140
		bodyModel[78].setRotationPoint(41F, -46F, -5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[79].setRotationPoint(41F, -47F, -3F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 142
		bodyModel[80].setRotationPoint(41F, -43F, -11F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[81].setRotationPoint(-1F, -47F, -5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 144
		bodyModel[82].setRotationPoint(7F, -47F, -5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 145
		bodyModel[83].setRotationPoint(16F, -46F, -5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[84].setRotationPoint(25F, -45F, -5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[85].setRotationPoint(33F, -44F, -5F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 148
		bodyModel[86].setRotationPoint(42F, -43F, -5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 14, 5, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		bodyModel[87].setRotationPoint(-28F, -36F, 0F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 14, 8, 11, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[88].setRotationPoint(-28F, -44F, 0F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 13, 5, 7, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[89].setRotationPoint(-27F, -49F, 0F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 12, 2, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
		bodyModel[90].setRotationPoint(-26F, -51F, 0F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 14, 5, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152
		bodyModel[91].setRotationPoint(-28F, -31F, 0F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 14, 5, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 153
		bodyModel[92].setRotationPoint(-28F, -26F, 0F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 14, 4, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 154
		bodyModel[93].setRotationPoint(-28F, -21F, 0F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 14, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 155
		bodyModel[94].setRotationPoint(-28F, -17F, 0F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 17, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 156
		bodyModel[95].setRotationPoint(-45F, -17F, 0F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 17, 4, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 157
		bodyModel[96].setRotationPoint(-45F, -21F, 0F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 17, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 158
		bodyModel[97].setRotationPoint(-45F, -26F, 10F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 17, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		bodyModel[98].setRotationPoint(-45F, -31F, 10F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 17, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		bodyModel[99].setRotationPoint(-45F, -36F, 10F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 10, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 161
		bodyModel[100].setRotationPoint(-55F, -17F, 0F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 10, 4, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 162
		bodyModel[101].setRotationPoint(-55F, -21F, 0F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 10, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 163
		bodyModel[102].setRotationPoint(-55F, -26F, 10F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 10, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[103].setRotationPoint(-55F, -31F, 10F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 10, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		bodyModel[104].setRotationPoint(-55F, -36F, 10F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 13, 5, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		bodyModel[105].setRotationPoint(-14F, -36F, 0F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 13, 5, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
		bodyModel[106].setRotationPoint(-14F, -31F, 0F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 13, 5, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 173
		bodyModel[107].setRotationPoint(-14F, -26F, 0F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 13, 4, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 174
		bodyModel[108].setRotationPoint(-14F, -21F, 0F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 13, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 175
		bodyModel[109].setRotationPoint(-14F, -17F, 0F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 13, 8, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		bodyModel[110].setRotationPoint(-14F, -44F, 0F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 13, 5, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[111].setRotationPoint(-14F, -49F, 0F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 13, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		bodyModel[112].setRotationPoint(-14F, -51F, 0F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 17, 5, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 179
		bodyModel[113].setRotationPoint(-1F, -36F, 9F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 17, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 180
		bodyModel[114].setRotationPoint(16F, -36F, 9F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 17, 5, 4, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 181
		bodyModel[115].setRotationPoint(33F, -36F, 7F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 17, 5, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 182
		bodyModel[116].setRotationPoint(-1F, -31F, 10F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 17, 5, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 183
		bodyModel[117].setRotationPoint(16F, -31F, 9F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 17, 5, 4, 0F,0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 184
		bodyModel[118].setRotationPoint(33F, -31F, 7F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 17, 5, 5, 0F,0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -2F); // Box 185
		bodyModel[119].setRotationPoint(-1F, -26F, 8F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 17, 5, 4, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -2F); // Box 186
		bodyModel[120].setRotationPoint(16F, -26F, 8F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 17, 5, 6, 0F,0F, 0F, -5F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -2F); // Box 187
		bodyModel[121].setRotationPoint(33F, -26F, 5F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 17, 4, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -3F); // Box 188
		bodyModel[122].setRotationPoint(-1F, -21F, 0F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 17, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -5F, 0F, 0F, -4F); // Box 189
		bodyModel[123].setRotationPoint(16F, -21F, 0F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 17, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.9999F, 0F, 0F, -2.9999F, -2.9999F, 0F, 0F, -3.9999F); // Box 190
		bodyModel[124].setRotationPoint(33F, -21F, 0F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 17, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -5F, 0F, 0F, -5F); // Box 191
		bodyModel[125].setRotationPoint(-1F, -17F, 0F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 17, 2, 6, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -3F, 0F, 0F, -3F); // Box 192
		bodyModel[126].setRotationPoint(16F, -17F, 0F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 17, 1, 5, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, 1F, -2F); // Box 193
		bodyModel[127].setRotationPoint(33F, -18F, 0F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 16, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 194
		bodyModel[128].setRotationPoint(50F, -36F, 0F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 16, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 195
		bodyModel[129].setRotationPoint(50F, -42F, 0F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 16, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, 0F, 0F); // Box 196
		bodyModel[130].setRotationPoint(50F, -31F, 0F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 16, 5, 9, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -4F, 0F, 0F, -3F); // Box 197
		bodyModel[131].setRotationPoint(50F, -26F, 0F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 16, 2, 6, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -3F, 0F, 0F, -3F); // Box 198
		bodyModel[132].setRotationPoint(50F, -21F, 0F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 16, 5, 5, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		bodyModel[133].setRotationPoint(50F, -47F, 0F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 10, 6, 8, 0F,0F, -1F, -1F, -8F, -1F, -1F, -8F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 216
		bodyModel[134].setRotationPoint(-55F, -42F, 3F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 5, 6, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 218
		bodyModel[135].setRotationPoint(-60F, -42F, 0F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 5, 5, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		bodyModel[136].setRotationPoint(-60F, -36F, 0F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 5, 5, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		bodyModel[137].setRotationPoint(-60F, -31F, 0F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 5, 5, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 221
		bodyModel[138].setRotationPoint(-60F, -26F, 0F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 5, 4, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 222
		bodyModel[139].setRotationPoint(-60F, -21F, 0F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 5, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 223
		bodyModel[140].setRotationPoint(-60F, -17F, 0F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 255
		bodyModel[141].setRotationPoint(-55F, -42F, 0F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 264
		bodyModel[142].setRotationPoint(-45F, -47F, 10F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 265
		bodyModel[143].setRotationPoint(-45F, -47F, 4F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 266
		bodyModel[144].setRotationPoint(-35F, -47F, 10F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 267
		bodyModel[145].setRotationPoint(-45F, -50F, 2F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 268
		bodyModel[146].setRotationPoint(-45F, -51F, 0F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 269
		bodyModel[147].setRotationPoint(-35F, -51F, 0F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 270
		bodyModel[148].setRotationPoint(-35F, -50F, 2F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 271
		bodyModel[149].setRotationPoint(-49F, -47F, 4F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F); // Box 272
		bodyModel[150].setRotationPoint(-53F, -47F, 3F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 273
		bodyModel[151].setRotationPoint(-49F, -49F, 3F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 274
		bodyModel[152].setRotationPoint(-48F, -50F, 0F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 275
		bodyModel[153].setRotationPoint(6F, -50F, 2F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 276
		bodyModel[154].setRotationPoint(6F, -51F, 0F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
		bodyModel[155].setRotationPoint(6F, -47F, 10F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
		bodyModel[156].setRotationPoint(15F, -49F, 2F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 279
		bodyModel[157].setRotationPoint(15F, -50F, 0F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 280
		bodyModel[158].setRotationPoint(15F, -46F, 10F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		bodyModel[159].setRotationPoint(24F, -48F, 2F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 282
		bodyModel[160].setRotationPoint(24F, -49F, 0F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 283
		bodyModel[161].setRotationPoint(24F, -45F, 10F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 284
		bodyModel[162].setRotationPoint(32F, -47F, 2F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 285
		bodyModel[163].setRotationPoint(32F, -48F, 0F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 286
		bodyModel[164].setRotationPoint(32F, -44F, 10F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 287
		bodyModel[165].setRotationPoint(41F, -46F, 2F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 288
		bodyModel[166].setRotationPoint(41F, -47F, 0F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 289
		bodyModel[167].setRotationPoint(41F, -43F, 10F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 290
		bodyModel[168].setRotationPoint(-1F, -47F, 4F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 291
		bodyModel[169].setRotationPoint(7F, -47F, 4F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 292
		bodyModel[170].setRotationPoint(16F, -46F, 4F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 293
		bodyModel[171].setRotationPoint(25F, -45F, 4F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 294
		bodyModel[172].setRotationPoint(33F, -44F, 4F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 295
		bodyModel[173].setRotationPoint(42F, -43F, 4F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 18, 8, 17, 0F,0F, -4F, -6F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -4F, -6F, 0F, 0F, -4F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, -4F); // Import LWW01
		bodyModel[174].setRotationPoint(-113F, 0F, -8.5F);

		bodyModel[175].addShapeBox(4F, 0F, 0F, 31, 8, 17, 0F,0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 3F, 0F, 0F, 4F, 2F, 0F, 4F, 2F, 0F, 3F, 0F); // Import LWW02
		bodyModel[175].setRotationPoint(-99F, 0F, -8.5F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 64, 12, 19, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 1F); // Import LWW03
		bodyModel[176].setRotationPoint(-64F, 0F, -9.5F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 41, 11, 19, 0F,0F, 0F, -2F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, 4F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 4F, 0F); // Import LWW04
		bodyModel[177].setRotationPoint(0F, 0F, -9.5F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 24, 10, 13, 0F,0F, 0F, -2F, 0F, -2F, -6F, 0F, -2F, -6F, 0F, 0F, -2F, 0F, 1F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 1F, 0F); // Import LWW05
		bodyModel[178].setRotationPoint(41F, 0F, -6.5F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 6, 13, 1, 0F,0F, -3F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -3F, -0.25F, 0F, -3F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -3F, -0.25F); // Import LWW06
		bodyModel[179].setRotationPoint(65F, 0F, -0.5F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 4, 13, 1, 0F,0F, 0F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, 0F, 0F, -0.25F); // Import LWW07
		bodyModel[180].setRotationPoint(71F, 0F, -0.5F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 18, 8, 17, 0F,0F, 0F, -4F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -4F, -3F, -6F, -8.5F, 0F, 0F, -7F, 0F, 0F, -7F, -3F, -6F, -8.5F); // Import LWW08
		bodyModel[181].setRotationPoint(-113F, 8F, -8.5F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 31, 6, 17, 0F,0F, 0F, 0F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, 0F, 0F, -1F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -1F, -7F); // Import LWW09
		bodyModel[182].setRotationPoint(-95F, 11F, -8.5F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 64, 8, 19, 0F,0F, 0F, 1F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 1F, 0F, -3F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, -3F, -8F); // Import LWW10
		bodyModel[183].setRotationPoint(-64F, 12F, -9.5F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 41, 8, 19, 0F,0F, -3F, 0F, 0F, 1F, -3F, 0F, 1F, -3F, 0F, -3F, 0F, 0F, -3F, -9F, 0F, -6F, -9F, 0F, -6F, -9F, 0F, -3F, -9F); // Import LWW11
		bodyModel[184].setRotationPoint(0F, 12F, -9.5F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 24, 3, 13, 0F,0F, 0F, 0F, 0F, 1F, -6F, 0F, 1F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -4F, -6F, 0F, -4F, -6F, 0F, 0F, -6F); // Import LWW12
		bodyModel[185].setRotationPoint(41F, 11F, -6.5F);

		bodyModel[186].addTrapezoid(0F, 0F, 0F, 6, 1, 13, 0F, -0.50F, ModelRendererTurbo.MR_TOP); // Import LWW13
		bodyModel[186].setRotationPoint(-57F, -0.5F, -6.5F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 6, 1, 12, 0F,-0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Import LWW14
		bodyModel[187].setRotationPoint(-8F, -1F, -6F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 4, 22, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LWW19
		bodyModel[188].setRotationPoint(-56F, -22F, -1F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 2, 22, 2, 0F,0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 15F, 0F, 0F, 15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LWW20
		bodyModel[189].setRotationPoint(-6F, -22F, 3.5F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 4, 22, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 312
		bodyModel[190].setRotationPoint(-7F, -22F, -1F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 11, 24, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 313
		bodyModel[191].setRotationPoint(47F, -22F, -1F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 2, 22, 2, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[192].setRotationPoint(-55F, -22F, 3.5F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 2, 22, 2, 0F,0F, 0F, 15F, 0F, 0F, 15F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 316
		bodyModel[193].setRotationPoint(-6F, -22F, -5.5F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 2, 22, 2, 0F,0F, 0F, 15F, 0F, 0F, 15F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 316
		bodyModel[194].setRotationPoint(-6F, -22F, -5.5F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 2, 22, 2, 0F,0F, 0F, 15F, 0F, 0F, 15F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 316
		bodyModel[195].setRotationPoint(-6F, -22F, -5.5F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 2, 22, 2, 0F,0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 317
		bodyModel[196].setRotationPoint(-55F, -22F, -5.5F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 7, 2, 16, 0F,0F, -0.5F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -0.5F, -5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 87
		bodyModel[197].setRotationPoint(-53.4F, -41.2F, -8F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 7, 3, 20, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 88
		bodyModel[198].setRotationPoint(-53.4F, -39.2F, -10F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 7, 3, 20, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 89
		bodyModel[199].setRotationPoint(-53.4F, -33.2F, -10F);

		bodyModel[200].addBox(0F, 0F, 0F, 1, 6, 8, 0F); // Box 213
		bodyModel[200].setRotationPoint(-47.2F, -37.2F, -4F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, -0.4F, -3F, 0F, -0.4F, -3F, 0F, -0.4F, -3F, 0F, -0.4F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 214
		bodyModel[201].setRotationPoint(-47.2F, -38.2F, -4F);

		bodyModel[202].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F); // Box 233
		bodyModel[202].setRotationPoint(-47.1F, -36F, 2.7F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F); // Box 234
		bodyModel[203].setRotationPoint(-47F, -37F, -0.9F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F); // Box 235
		bodyModel[204].setRotationPoint(-47F, -37F, -0.9F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F); // Box 236
		bodyModel[205].setRotationPoint(-47F, -37F, -0.9F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 237
		bodyModel[206].setRotationPoint(-47F, -36F, -0.9F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 238
		bodyModel[207].setRotationPoint(-47F, -36F, -0.9F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 239
		bodyModel[208].setRotationPoint(-47F, -36F, 0.1F);

		bodyModel[209].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 240
		bodyModel[209].setRotationPoint(-47.1F, -36F, 0.1F);
		bodyModel[209].rotateAngleX = 5.49778714F;

		bodyModel[210].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 241
		bodyModel[210].setRotationPoint(-47.1F, -36F, 0.1F);

		bodyModel[211].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F); // Box 242
		bodyModel[211].setRotationPoint(-47.1F, -36F, 0.1F);

		bodyModel[212].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 243
		bodyModel[212].setRotationPoint(-47F, -36F, 0.1F);

		bodyModel[213].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 244
		bodyModel[213].setRotationPoint(-47.1F, -36F, 0.1F);
		bodyModel[213].rotateAngleX = 3.14159265F;

		bodyModel[214].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 248
		bodyModel[214].setRotationPoint(-47F, -37F, 0.1F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 249
		bodyModel[215].setRotationPoint(-47F, -37F, 0.1F);

		bodyModel[216].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 250
		bodyModel[216].setRotationPoint(-47.1F, -36F, 0.1F);
		bodyModel[216].rotateAngleX = 4.71238898F;

		bodyModel[217].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 251
		bodyModel[217].setRotationPoint(-47.1F, -36F, 0.1F);
		bodyModel[217].rotateAngleX = 3.92699082F;

		bodyModel[218].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F); // Box 252
		bodyModel[218].setRotationPoint(-47F, -37F, 1.7F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F); // Box 253
		bodyModel[219].setRotationPoint(-47F, -37F, 1.7F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F); // Box 254
		bodyModel[220].setRotationPoint(-47F, -37F, 1.7F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 255
		bodyModel[221].setRotationPoint(-47F, -37F, 2.7F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 256
		bodyModel[222].setRotationPoint(-47F, -37F, 2.7F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 257
		bodyModel[223].setRotationPoint(-47F, -36F, 2.7F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 258
		bodyModel[224].setRotationPoint(-47F, -36F, 1.7F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 259
		bodyModel[225].setRotationPoint(-47F, -36F, 1.7F);

		bodyModel[226].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 260
		bodyModel[226].setRotationPoint(-47.1F, -36F, 2.7F);
		bodyModel[226].rotateAngleX = 3.92699082F;

		bodyModel[227].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 261
		bodyModel[227].setRotationPoint(-47.1F, -36F, 2.7F);
		bodyModel[227].rotateAngleX = 4.71238898F;

		bodyModel[228].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 262
		bodyModel[228].setRotationPoint(-47.1F, -36F, 2.7F);
		bodyModel[228].rotateAngleX = 5.49778714F;

		bodyModel[229].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 263
		bodyModel[229].setRotationPoint(-47.1F, -36F, 2.7F);

		bodyModel[230].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 265
		bodyModel[230].setRotationPoint(-47F, -36F, 2.7F);

		bodyModel[231].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 266
		bodyModel[231].setRotationPoint(-47.1F, -36F, 2.7F);
		bodyModel[231].rotateAngleX = 0.78539816F;

		bodyModel[232].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 267
		bodyModel[232].setRotationPoint(-47.1F, -36F, 2.7F);
		bodyModel[232].rotateAngleX = 1.57079633F;

		bodyModel[233].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 268
		bodyModel[233].setRotationPoint(-47.1F, -36F, 2.7F);
		bodyModel[233].rotateAngleX = 2.35619449F;

		bodyModel[234].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 269
		bodyModel[234].setRotationPoint(-47.1F, -36F, 2.7F);
		bodyModel[234].rotateAngleX = 3.14159265F;

		bodyModel[235].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.45F, 0.3F, 0F, -0.45F, 0.3F, 0F, -0.45F, 0.3F, 0F, -0.45F, 0.3F, 0F, -0.45F, 0.3F, 0F, -0.45F, 0.3F, 0F, -0.45F, 0.3F, 0F, -0.45F, 0.3F); // Box 270
		bodyModel[235].setRotationPoint(-47.1F, -36F, 0.1F);
		bodyModel[235].rotateAngleX = -0.38397244F;

		bodyModel[236].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F); // Box 271
		bodyModel[236].setRotationPoint(-47.1F, -36.8F, -0.9F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, -0.9F, 0F, -0.5F, -0.9F, 0F, -0.5F, -0.9F, 0F, -0.5F, -0.9F); // Box 272
		bodyModel[237].setRotationPoint(-47.1F, -36.6F, -0.9F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 273
		bodyModel[238].setRotationPoint(-47F, -33.4F, -3.7F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 274
		bodyModel[239].setRotationPoint(-47F, -33.4F, -3.7F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F); // Box 275
		bodyModel[240].setRotationPoint(-47F, -34.4F, -3.7F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F); // Box 276
		bodyModel[241].setRotationPoint(-47F, -34.4F, -3.7F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F); // Box 277
		bodyModel[242].setRotationPoint(-47F, -34.4F, -3.7F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 278
		bodyModel[243].setRotationPoint(-47F, -34.4F, -2.7F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 279
		bodyModel[244].setRotationPoint(-47F, -34.4F, -2.7F);

		bodyModel[245].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 280
		bodyModel[245].setRotationPoint(-47.1F, -33.4F, -2.7F);
		bodyModel[245].rotateAngleX = 0.78539816F;

		bodyModel[246].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 281
		bodyModel[246].setRotationPoint(-47F, -33.4F, -2.7F);

		bodyModel[247].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 282
		bodyModel[247].setRotationPoint(-47.1F, -33.4F, -2.7F);
		bodyModel[247].rotateAngleX = 5.49778714F;

		bodyModel[248].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 283
		bodyModel[248].setRotationPoint(-47.1F, -33.4F, -2.7F);

		bodyModel[249].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 284
		bodyModel[249].setRotationPoint(-47.1F, -33.4F, -2.7F);
		bodyModel[249].rotateAngleX = 1.57079633F;

		bodyModel[250].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 285
		bodyModel[250].setRotationPoint(-47.1F, -33.4F, -2.7F);
		bodyModel[250].rotateAngleX = 2.35619449F;

		bodyModel[251].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 286
		bodyModel[251].setRotationPoint(-47.1F, -33.4F, -2.7F);
		bodyModel[251].rotateAngleX = 3.14159265F;

		bodyModel[252].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 287
		bodyModel[252].setRotationPoint(-47F, -33.4F, -2.7F);

		bodyModel[253].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F); // Box 288
		bodyModel[253].setRotationPoint(-47.1F, -33.4F, -2.7F);
		bodyModel[253].rotateAngleX = -3.90953752F;

		bodyModel[254].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 289
		bodyModel[254].setRotationPoint(-47.1F, -33.4F, -2.7F);
		bodyModel[254].rotateAngleX = 4.71238898F;

		bodyModel[255].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 290
		bodyModel[255].setRotationPoint(-47.1F, -33.4F, -2.7F);
		bodyModel[255].rotateAngleX = 3.92699082F;

		bodyModel[256].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 307
		bodyModel[256].setRotationPoint(-47.2F, -36.2F, 5F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 308
		bodyModel[257].setRotationPoint(-47.1F, -35.7F, 5F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309
		bodyModel[258].setRotationPoint(-47.2F, -33.5F, 4.5F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.3F, -0.4F, 0F, 0.3F, -0.4F, 0F, 0.3F, -0.2F, 0F, 0.3F, -0.2F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 310
		bodyModel[259].setRotationPoint(-47.1F, -33.5F, 4.5F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 311
		bodyModel[260].setRotationPoint(-47.2F, -37.2F, -6.5F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 312
		bodyModel[261].setRotationPoint(-47.1F, -37F, -7F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 313
		bodyModel[262].setRotationPoint(-47.1F, -37.4F, -6F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 314
		bodyModel[263].setRotationPoint(-47.1F, -36.2F, -5.8F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F); // Box 315
		bodyModel[264].setRotationPoint(-47.2F, -34.5F, -6F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0.1F); // Box 316
		bodyModel[265].setRotationPoint(-47.1F, -34.9F, -6F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0.1F); // Box 317
		bodyModel[266].setRotationPoint(-47.1F, -34.1F, -6F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 318
		bodyModel[267].setRotationPoint(-47.2F, -31F, -8.2F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 319
		bodyModel[268].setRotationPoint(-47.2F, -31F, -8.2F);

		bodyModel[269].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 320
		bodyModel[269].setRotationPoint(-47.3F, -31F, -7.2F);
		bodyModel[269].rotateAngleX = 3.92699082F;

		bodyModel[270].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F); // Box 321
		bodyModel[270].setRotationPoint(-47.2F, -32F, -8.2F);

		bodyModel[271].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 322
		bodyModel[271].setRotationPoint(-47.3F, -31F, -7.2F);
		bodyModel[271].rotateAngleX = 3.14159265F;

		bodyModel[272].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F); // Box 323
		bodyModel[272].setRotationPoint(-47.2F, -32F, -8.2F);

		bodyModel[273].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 324
		bodyModel[273].setRotationPoint(-47.3F, -31F, -7.2F);
		bodyModel[273].rotateAngleX = 2.35619449F;

		bodyModel[274].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F); // Box 325
		bodyModel[274].setRotationPoint(-47.2F, -32F, -8.2F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 326
		bodyModel[275].setRotationPoint(-47.2F, -32F, -7.2F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 327
		bodyModel[276].setRotationPoint(-47.2F, -32F, -7.2F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 328
		bodyModel[277].setRotationPoint(-47.2F, -31F, -7.2F);

		bodyModel[278].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 329
		bodyModel[278].setRotationPoint(-47.3F, -31F, -7.2F);
		bodyModel[278].rotateAngleX = 5.49778714F;

		bodyModel[279].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 330
		bodyModel[279].setRotationPoint(-47.3F, -31F, -7.2F);

		bodyModel[280].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 331
		bodyModel[280].setRotationPoint(-47.3F, -31F, -7.2F);
		bodyModel[280].rotateAngleX = 0.78539816F;

		bodyModel[281].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 332
		bodyModel[281].setRotationPoint(-47.3F, -31F, -7.2F);
		bodyModel[281].rotateAngleX = 1.57079633F;

		bodyModel[282].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F); // Box 333
		bodyModel[282].setRotationPoint(-47.3F, -31F, -7.2F);
		bodyModel[282].rotateAngleX = -3.90953752F;

		bodyModel[283].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 334
		bodyModel[283].setRotationPoint(-47.2F, -31F, -7.2F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 335
		bodyModel[284].setRotationPoint(-47.2F, -32.2F, -9.5F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 336
		bodyModel[285].setRotationPoint(-47.2F, -38.8F, -5.3F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.3F, -0.1F, 0F, 0.3F, -0.1F, 0F, 0.3F, -0.1F, 0F, 0.3F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 337
		bodyModel[286].setRotationPoint(-47.2F, -38.8F, -6.4F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 338
		bodyModel[287].setRotationPoint(-47.2F, -39.2F, -0.6F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 339
		bodyModel[288].setRotationPoint(-47.2F, -39.2F, 1.4F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 340
		bodyModel[289].setRotationPoint(-47.2F, -38.5F, 5.4F);

		bodyModel[290].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F); // Box 341
		bodyModel[290].setRotationPoint(-47.3F, -37.5F, 5.4F);
		bodyModel[290].rotateAngleX = -1.57079633F;

		bodyModel[291].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 342
		bodyModel[291].setRotationPoint(-47.2F, -37.5F, 5.4F);

		bodyModel[292].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 343
		bodyModel[292].setRotationPoint(-47.3F, -37.5F, 5.4F);
		bodyModel[292].rotateAngleX = 5.49778714F;

		bodyModel[293].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 344
		bodyModel[293].setRotationPoint(-47.2F, -37.5F, 5.4F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 345
		bodyModel[294].setRotationPoint(-47.2F, -37.5F, 4.4F);

		bodyModel[295].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 346
		bodyModel[295].setRotationPoint(-47.3F, -37.5F, 5.4F);
		bodyModel[295].rotateAngleX = 4.71238898F;

		bodyModel[296].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 347
		bodyModel[296].setRotationPoint(-47.3F, -37.5F, 5.4F);
		bodyModel[296].rotateAngleX = 3.92699082F;

		bodyModel[297].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 348
		bodyModel[297].setRotationPoint(-47.2F, -37.5F, 4.4F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F); // Box 349
		bodyModel[298].setRotationPoint(-47.2F, -38.5F, 4.4F);

		bodyModel[299].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 350
		bodyModel[299].setRotationPoint(-47.3F, -37.5F, 5.4F);
		bodyModel[299].rotateAngleX = 3.14159265F;

		bodyModel[300].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F); // Box 351
		bodyModel[300].setRotationPoint(-47.2F, -38.5F, 4.4F);

		bodyModel[301].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 352
		bodyModel[301].setRotationPoint(-47.3F, -37.5F, 5.4F);
		bodyModel[301].rotateAngleX = 2.35619449F;

		bodyModel[302].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F); // Box 353
		bodyModel[302].setRotationPoint(-47.2F, -38.5F, 4.4F);

		bodyModel[303].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 354
		bodyModel[303].setRotationPoint(-47.3F, -37.5F, 5.4F);
		bodyModel[303].rotateAngleX = 1.57079633F;

		bodyModel[304].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 355
		bodyModel[304].setRotationPoint(-47.2F, -38.5F, 5.4F);

		bodyModel[305].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 356
		bodyModel[305].setRotationPoint(-47.3F, -37.5F, 5.4F);
		bodyModel[305].rotateAngleX = 0.78539816F;

		bodyModel[306].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 387
		bodyModel[306].setRotationPoint(-47.2F, -32F, 7.3F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F); // Box 388
		bodyModel[307].setRotationPoint(-47.2F, -32F, 6.3F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 390
		bodyModel[308].setRotationPoint(-47.2F, -32F, 7.3F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F); // Box 391
		bodyModel[309].setRotationPoint(-47.2F, -32F, 6.3F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 392
		bodyModel[310].setRotationPoint(-47.2F, -31F, 6.3F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 393
		bodyModel[311].setRotationPoint(-47.2F, -31F, 6.3F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 394
		bodyModel[312].setRotationPoint(-47.2F, -31F, 7.3F);

		bodyModel[313].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 395
		bodyModel[313].setRotationPoint(-47.2F, -31.6F, 7.3F);

		bodyModel[314].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, 0F, 0F, -0.48F, 0F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, 0F, 0F, -0.48F, 0F); // Box 396
		bodyModel[314].setRotationPoint(-47.3F, -31.6F, 7.3F);
		bodyModel[314].rotateAngleX = -1.29154365F;

		bodyModel[315].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 397
		bodyModel[315].setRotationPoint(-47.3F, -31F, 7.3F);
		bodyModel[315].rotateAngleX = 3.14159265F;

		bodyModel[316].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 398
		bodyModel[316].setRotationPoint(-47.3F, -31F, 7.3F);
		bodyModel[316].rotateAngleX = 3.92699082F;

		bodyModel[317].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 399
		bodyModel[317].setRotationPoint(-47.3F, -31F, 7.3F);
		bodyModel[317].rotateAngleX = 5.49778714F;

		bodyModel[318].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 400
		bodyModel[318].setRotationPoint(-47.3F, -31F, 7.3F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F); // Box 401
		bodyModel[319].setRotationPoint(-47.1F, -32.2F, 6.3F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F); // Box 402
		bodyModel[320].setRotationPoint(-47F, -37F, -3.7F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F); // Box 403
		bodyModel[321].setRotationPoint(-47F, -37F, -3.7F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F); // Box 404
		bodyModel[322].setRotationPoint(-47F, -37F, -3.7F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 405
		bodyModel[323].setRotationPoint(-47F, -37F, -2.7F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 406
		bodyModel[324].setRotationPoint(-47F, -37F, -2.7F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 407
		bodyModel[325].setRotationPoint(-47F, -36F, -2.7F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 408
		bodyModel[326].setRotationPoint(-47F, -36F, -3.7F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 409
		bodyModel[327].setRotationPoint(-47F, -36F, -3.7F);

		bodyModel[328].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 410
		bodyModel[328].setRotationPoint(-47.1F, -36F, -2.7F);
		bodyModel[328].rotateAngleX = 3.92699082F;

		bodyModel[329].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 411
		bodyModel[329].setRotationPoint(-47.1F, -36F, -2.7F);
		bodyModel[329].rotateAngleX = 3.14159265F;

		bodyModel[330].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 412
		bodyModel[330].setRotationPoint(-47.1F, -36F, -2.7F);
		bodyModel[330].rotateAngleX = 2.35619449F;

		bodyModel[331].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 413
		bodyModel[331].setRotationPoint(-47.1F, -36F, -2.7F);
		bodyModel[331].rotateAngleX = 1.57079633F;

		bodyModel[332].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 414
		bodyModel[332].setRotationPoint(-47.1F, -36F, -2.7F);
		bodyModel[332].rotateAngleX = 0.78539816F;

		bodyModel[333].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 415
		bodyModel[333].setRotationPoint(-47.1F, -36F, -2.7F);

		bodyModel[334].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 416
		bodyModel[334].setRotationPoint(-47.1F, -36F, -2.7F);
		bodyModel[334].rotateAngleX = 5.49778714F;

		bodyModel[335].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 417
		bodyModel[335].setRotationPoint(-47.1F, -36F, -2.7F);
		bodyModel[335].rotateAngleX = 4.71238898F;

		bodyModel[336].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 418
		bodyModel[336].setRotationPoint(-47F, -36F, -2.7F);

		bodyModel[337].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F); // Box 419
		bodyModel[337].setRotationPoint(-47.1F, -36F, -2.7F);
		bodyModel[337].rotateAngleX = -1.57079633F;

		bodyModel[338].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 421
		bodyModel[338].setRotationPoint(-47F, -34F, -0.6F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 422
		bodyModel[339].setRotationPoint(-47F, -34F, -0.6F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F); // Box 423
		bodyModel[340].setRotationPoint(-47F, -34F, -0.6F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F); // Box 424
		bodyModel[341].setRotationPoint(-47F, -34F, -0.6F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F); // Box 425
		bodyModel[342].setRotationPoint(-47F, -34F, -0.6F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F); // Box 426
		bodyModel[343].setRotationPoint(-47F, -34F, -0.6F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F); // Box 427
		bodyModel[344].setRotationPoint(-47F, -34F, -0.6F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 428
		bodyModel[345].setRotationPoint(-47F, -34F, -0.6F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 429
		bodyModel[346].setRotationPoint(-47F, -34.4F, 2.7F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 430
		bodyModel[347].setRotationPoint(-47F, -34.4F, 2.7F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F); // Box 431
		bodyModel[348].setRotationPoint(-47F, -34.4F, 1.7F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F); // Box 432
		bodyModel[349].setRotationPoint(-47F, -34.4F, 1.7F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F); // Box 433
		bodyModel[350].setRotationPoint(-47F, -34.4F, 1.7F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 434
		bodyModel[351].setRotationPoint(-47F, -33.4F, 1.7F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 435
		bodyModel[352].setRotationPoint(-47F, -33.4F, 1.7F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 436
		bodyModel[353].setRotationPoint(-47F, -33.4F, 2.7F);

		bodyModel[354].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 437
		bodyModel[354].setRotationPoint(-47.1F, -33.4F, 2.7F);
		bodyModel[354].rotateAngleX = 5.49778714F;

		bodyModel[355].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 438
		bodyModel[355].setRotationPoint(-47.1F, -33.4F, 2.7F);

		bodyModel[356].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 439
		bodyModel[356].setRotationPoint(-47.1F, -33.4F, 2.7F);
		bodyModel[356].rotateAngleX = 0.78539816F;

		bodyModel[357].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 440
		bodyModel[357].setRotationPoint(-47.1F, -33.4F, 2.7F);
		bodyModel[357].rotateAngleX = 1.57079633F;

		bodyModel[358].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 441
		bodyModel[358].setRotationPoint(-47.1F, -33.4F, 2.7F);
		bodyModel[358].rotateAngleX = 2.35619449F;

		bodyModel[359].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 442
		bodyModel[359].setRotationPoint(-47.1F, -33.4F, 2.7F);
		bodyModel[359].rotateAngleX = 3.14159265F;

		bodyModel[360].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 443
		bodyModel[360].setRotationPoint(-47.1F, -33.4F, 2.7F);
		bodyModel[360].rotateAngleX = 3.92699082F;

		bodyModel[361].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 444
		bodyModel[361].setRotationPoint(-47.1F, -33.4F, 2.7F);
		bodyModel[361].rotateAngleX = 4.71238898F;

		bodyModel[362].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 445
		bodyModel[362].setRotationPoint(-47F, -33.4F, 2.7F);

		bodyModel[363].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, 0F, 0F, -0.48F, 0F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, 0F, 0F, -0.48F, 0F); // Box 446
		bodyModel[363].setRotationPoint(-47.1F, -33.4F, 2.7F);
		bodyModel[363].rotateAngleX = -4.36332313F;

		bodyModel[364].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, 0F, 0F, -0.48F, 0F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, 0F, 0F, -0.48F, 0F); // Box 447
		bodyModel[364].setRotationPoint(-47.1F, -33.4F, 2.7F);
		bodyModel[364].rotateAngleX = -1.32645023F;

		bodyModel[365].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 448
		bodyModel[365].setRotationPoint(-47.2F, -33.4F, 6.3F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F); // Box 449
		bodyModel[366].setRotationPoint(-47.2F, -33.9F, 5.8F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F); // Box 450
		bodyModel[367].setRotationPoint(-47.2F, -33.9F, 5.8F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F); // Box 451
		bodyModel[368].setRotationPoint(-47.2F, -33.9F, 5.8F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F); // Box 452
		bodyModel[369].setRotationPoint(-47.2F, -33.9F, 5.8F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F); // Box 453
		bodyModel[370].setRotationPoint(-47.2F, -33.9F, 5.8F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 454
		bodyModel[371].setRotationPoint(-47.2F, -33.9F, 5.8F);

		bodyModel[372].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 455
		bodyModel[372].setRotationPoint(-47.2F, -33.9F, 5.8F);

		bodyModel[373].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 456
		bodyModel[373].setRotationPoint(-47.2F, -33.9F, 5.8F);

		bodyModel[374].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F); // Box 457
		bodyModel[374].setRotationPoint(-47.3F, -33.4F, 6.3F);
		bodyModel[374].rotateAngleX = -1.57079633F;

		bodyModel[375].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F); // Box 458
		bodyModel[375].setRotationPoint(-47.3F, -33.4F, 8F);
		bodyModel[375].rotateAngleX = -1.57079633F;

		bodyModel[376].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 459
		bodyModel[376].setRotationPoint(-47.2F, -33.4F, 8F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F); // Box 460
		bodyModel[377].setRotationPoint(-47.2F, -33.9F, 7.5F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F); // Box 461
		bodyModel[378].setRotationPoint(-47.2F, -33.9F, 7.5F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F); // Box 462
		bodyModel[379].setRotationPoint(-47.2F, -33.9F, 7.5F);

		bodyModel[380].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 463
		bodyModel[380].setRotationPoint(-47.2F, -33.9F, 7.5F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 464
		bodyModel[381].setRotationPoint(-47.2F, -33.9F, 7.5F);

		bodyModel[382].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 465
		bodyModel[382].setRotationPoint(-47.2F, -33.9F, 7.5F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F); // Box 466
		bodyModel[383].setRotationPoint(-47.2F, -33.9F, 7.5F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F); // Box 467
		bodyModel[384].setRotationPoint(-47.2F, -33.9F, 7.5F);

		bodyModel[385].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F); // Box 468
		bodyModel[385].setRotationPoint(-47.3F, -35.6F, 7F);
		bodyModel[385].rotateAngleX = 1.57079633F;

		bodyModel[386].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 469
		bodyModel[386].setRotationPoint(-47.2F, -35.6F, 7F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F); // Box 470
		bodyModel[387].setRotationPoint(-47.2F, -36.1F, 6.5F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F); // Box 471
		bodyModel[388].setRotationPoint(-47.2F, -36.1F, 6.5F);

		bodyModel[389].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F); // Box 472
		bodyModel[389].setRotationPoint(-47.2F, -36.1F, 6.5F);

		bodyModel[390].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 473
		bodyModel[390].setRotationPoint(-47.2F, -36.1F, 6.5F);

		bodyModel[391].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 474
		bodyModel[391].setRotationPoint(-47.2F, -36.1F, 6.5F);

		bodyModel[392].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 475
		bodyModel[392].setRotationPoint(-47.2F, -36.1F, 6.5F);

		bodyModel[393].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F); // Box 476
		bodyModel[393].setRotationPoint(-47.2F, -36.1F, 6.5F);

		bodyModel[394].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F); // Box 477
		bodyModel[394].setRotationPoint(-47.2F, -36.1F, 6.5F);

		bodyModel[395].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F); // Box 478
		bodyModel[395].setRotationPoint(-47.2F, -32.9F, -5.9F);

		bodyModel[396].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F); // Box 480
		bodyModel[396].setRotationPoint(-47.2F, -32.9F, -5.9F);

		bodyModel[397].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F); // Box 481
		bodyModel[397].setRotationPoint(-47.2F, -32.9F, -5.9F);

		bodyModel[398].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F); // Box 482
		bodyModel[398].setRotationPoint(-47.2F, -32.9F, -5.9F);

		bodyModel[399].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F); // Box 483
		bodyModel[399].setRotationPoint(-47.2F, -32.9F, -5.9F);

		bodyModel[400].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 484
		bodyModel[400].setRotationPoint(-47.2F, -32.9F, -5.9F);

		bodyModel[401].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 485
		bodyModel[401].setRotationPoint(-47.2F, -32.9F, -5.9F);

		bodyModel[402].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 486
		bodyModel[402].setRotationPoint(-47.2F, -32.9F, -5.9F);

		bodyModel[403].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, 0F, 0F, -0.48F, 0F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, 0F, 0F, -0.48F, 0F); // Box 487
		bodyModel[403].setRotationPoint(-47.3F, -32.4F, -6F);
		bodyModel[403].rotateAngleX = -0.38397244F;

		bodyModel[404].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 488
		bodyModel[404].setRotationPoint(-47.2F, -31.2F, -1.6F);

		bodyModel[405].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 489
		bodyModel[405].setRotationPoint(-47.2F, -31.2F, 0.4F);

		bodyModel[406].addShapeBox(0F, 0F, 0F, 7, 3, 19, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 490
		bodyModel[406].setRotationPoint(-53.4F, -36.2F, -9.5F);

		bodyModel[407].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 574
		bodyModel[407].setRotationPoint(-40.4F, -34.2F, 9F);

		bodyModel[408].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 575
		bodyModel[408].setRotationPoint(-38.9F, -32.45F, 8.5F);

		bodyModel[409].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 576
		bodyModel[409].setRotationPoint(-39.9F, -33.45F, 8.5F);

		bodyModel[410].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 580
		bodyModel[410].setRotationPoint(-39.9F, -31.45F, 8.5F);

		bodyModel[411].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 581
		bodyModel[411].setRotationPoint(-37.9F, -31.45F, 8.5F);

		bodyModel[412].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 582
		bodyModel[412].setRotationPoint(-37.9F, -33.45F, 8.5F);

		bodyModel[413].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 601
		bodyModel[413].setRotationPoint(-44.4F, -34.2F, -10.5F);

		bodyModel[414].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 602
		bodyModel[414].setRotationPoint(-43.9F, -32.2F, -11F);

		bodyModel[415].addShapeBox(-1F, -2F, 0F, 1, 2, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 603
		bodyModel[415].setRotationPoint(-42.9F, -32.2F, -10.2F);
		bodyModel[415].rotateAngleZ = 0.36651914F;

		bodyModel[416].addShapeBox(-1F, -2F, 0F, 1, 1, 1, 0F,-0.4F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, -0.4F, 0F, 0F); // Box 604
		bodyModel[416].setRotationPoint(-42.9F, -32.2F, -9.7F);
		bodyModel[416].rotateAngleZ = 0.36651914F;

		bodyModel[417].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 605
		bodyModel[417].setRotationPoint(-39.9F, -30.2F, -10F);

		bodyModel[418].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 606
		bodyModel[418].setRotationPoint(-45.4F, -34.2F, 9.2F);
		bodyModel[418].rotateAngleX = 0.36651914F;

		bodyModel[419].addShapeBox(0F, -1F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 607
		bodyModel[419].setRotationPoint(-45.4F, -34.2F, 9.2F);
		bodyModel[419].rotateAngleX = 0.36651914F;

		bodyModel[420].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 608
		bodyModel[420].setRotationPoint(-44.4F, -32.7F, 9.75F);

		bodyModel[421].addShapeBox(0F, 0F, 0F, 5, 10, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 356
		bodyModel[421].setRotationPoint(-53.4F, -30.2F, -10F);

		bodyModel[422].addShapeBox(0F, 0F, 0F, 5, 10, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 256
		bodyModel[422].setRotationPoint(-52F, -30F, -2F);

		bodyModel[423].addShapeBox(0F, 0F, 0F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[423].setRotationPoint(-46F, -22F, -2F);

		bodyModel[424].addShapeBox(0F, 0F, 0F, 7, 3, 3, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 254
		bodyModel[424].setRotationPoint(-46F, -23F, -1.5F);

		bodyModel[425].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 263
		bodyModel[425].setRotationPoint(-44.5F, -26F, -1F);

		bodyModel[426].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 264
		bodyModel[426].setRotationPoint(-44F, -30F, -0.5F);

		bodyModel[427].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 265
		bodyModel[427].setRotationPoint(-44F, -32F, -0.5F);

		bodyModel[428].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 266
		bodyModel[428].setRotationPoint(-43.7F, -32.1F, -0.5F);

		bodyModel[429].addShapeBox(0F, 1F, 0F, 10, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
		bodyModel[429].setRotationPoint(-42F, -24F, -5F);
		bodyModel[429].rotateAngleZ = -0.10471976F;

		bodyModel[430].addShapeBox(9F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		bodyModel[430].setRotationPoint(-42F, -24F, -5F);
		bodyModel[430].rotateAngleZ = -0.10471976F;

		bodyModel[431].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		bodyModel[431].setRotationPoint(-42F, -24F, -5F);
		bodyModel[431].rotateAngleZ = -0.10471976F;

		bodyModel[432].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		bodyModel[432].setRotationPoint(-42F, -24F, 4F);
		bodyModel[432].rotateAngleZ = -0.10471976F;

		bodyModel[433].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		bodyModel[433].setRotationPoint(-42F, -24F, -5F);
		bodyModel[433].rotateAngleZ = -0.10471976F;

		bodyModel[434].addShapeBox(0F, 0F, 0F, 1, 15, 10, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		bodyModel[434].setRotationPoint(-33F, -38F, -5F);

		bodyModel[435].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[435].setRotationPoint(-31F, -42F, -3F);

		bodyModel[436].addShapeBox(0F, 0F, 0F, 1, 15, 8, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 246
		bodyModel[436].setRotationPoint(-34F, -37F, -4F);

		bodyModel[437].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[437].setRotationPoint(-34.3F, -37.3F, -2F);

		bodyModel[438].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[438].setRotationPoint(-34.3F, -37.3F, 1F);

		bodyModel[439].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[439].setRotationPoint(-32F, -35F, -4F);

		bodyModel[440].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 251
		bodyModel[440].setRotationPoint(-32F, -35F, 3F);

		bodyModel[441].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[441].setRotationPoint(-39F, -23F, -6F);
		bodyModel[441].rotateAngleZ = 0.78539816F;

		bodyModel[442].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 253
		bodyModel[442].setRotationPoint(-39F, -23F, 5F);
		bodyModel[442].rotateAngleZ = 0.78539816F;

		bodyModel[443].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 962
		bodyModel[443].setRotationPoint(-31.5F, -41.5F, -1.5F);

		bodyModel[444].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 964
		bodyModel[444].setRotationPoint(-31.5F, -40.5F, -1.5F);

		bodyModel[445].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 966
		bodyModel[445].setRotationPoint(-31.5F, -39.5F, -1.5F);

		bodyModel[446].addShapeBox(0F, 0F, 0F, 12, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 484
		bodyModel[446].setRotationPoint(15F, -38F, -8F);

		bodyModel[447].addShapeBox(0F, 0F, 0F, 3, 5, 2, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 1F); // Box 485
		bodyModel[447].setRotationPoint(12F, -38F, -8F);

		bodyModel[448].addShapeBox(0F, 0F, 0F, 3, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, 1F, 0F, 0F, 0F); // Box 487
		bodyModel[448].setRotationPoint(27F, -38F, -8F);

		bodyModel[449].addShapeBox(0F, 0F, 0F, 2, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 488
		bodyModel[449].setRotationPoint(28F, -38F, -5F);

		bodyModel[450].addShapeBox(0F, 0F, 0F, 2, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 489
		bodyModel[450].setRotationPoint(12F, -38F, -5F);

		bodyModel[451].addShapeBox(0F, 0F, 0F, 12, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 490
		bodyModel[451].setRotationPoint(15F, -38F, 6F);

		bodyModel[452].addShapeBox(0F, 0F, 0F, 3, 5, 2, 0F,-2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 491
		bodyModel[452].setRotationPoint(12F, -38F, 6F);

		bodyModel[453].addShapeBox(0F, 0F, 0F, 3, 5, 2, 0F,0F, 0F, 0F, -2F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 492
		bodyModel[453].setRotationPoint(27F, -38F, 6F);

		bodyModel[454].addShapeBox(0F, 0F, 0F, 20, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 493
		bodyModel[454].setRotationPoint(30F, -37F, -4F);

		bodyModel[455].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 494
		bodyModel[455].setRotationPoint(32F, -39F, -4F);

		bodyModel[456].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 495
		bodyModel[456].setRotationPoint(32F, -40F, -4F);

		bodyModel[457].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 496
		bodyModel[457].setRotationPoint(15F, -33F, -8F);

		bodyModel[458].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 497
		bodyModel[458].setRotationPoint(15F, -33F, 7F);

		bodyModel[459].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 498
		bodyModel[459].setRotationPoint(26F, -33F, 7F);

		bodyModel[460].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 499
		bodyModel[460].setRotationPoint(26F, -33F, -8F);

		bodyModel[461].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 578
		bodyModel[461].setRotationPoint(16F, -38F, 3F);

		bodyModel[462].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 579
		bodyModel[462].setRotationPoint(16F, -38F, -4F);

		bodyModel[463].addShapeBox(0F, 0F, 0F, 1, 15, 10, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 580
		bodyModel[463].setRotationPoint(17F, -41F, -5F);

		bodyModel[464].addShapeBox(0F, 1F, 0F, 10, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 582
		bodyModel[464].setRotationPoint(17F, -27F, -5F);
		bodyModel[464].rotateAngleZ = 0.08726646F;

		bodyModel[465].addShapeBox(-2F, 0.25F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 583
		bodyModel[465].setRotationPoint(19F, -27F, -5F);
		bodyModel[465].rotateAngleZ = 0.08726646F;

		bodyModel[466].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 584
		bodyModel[466].setRotationPoint(17F, -33F, -6F);
		bodyModel[466].rotateAngleZ = -0.78539816F;

		bodyModel[467].addShapeBox(0F, -0.3F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 585
		bodyModel[467].setRotationPoint(26F, -27F, -5F);
		bodyModel[467].rotateAngleZ = 0.12217305F;

		bodyModel[468].addShapeBox(-2F, 0.25F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 586
		bodyModel[468].setRotationPoint(19F, -27F, 4F);
		bodyModel[468].rotateAngleZ = 0.08726646F;

		bodyModel[469].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 587
		bodyModel[469].setRotationPoint(17F, -33F, 5F);
		bodyModel[469].rotateAngleZ = -0.78539816F;

		bodyModel[470].addShapeBox(0F, 0F, 0F, 1, 14, 8, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 588
		bodyModel[470].setRotationPoint(18F, -40F, -4F);

		bodyModel[471].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 589
		bodyModel[471].setRotationPoint(18.3F, -40.3F, 1F);

		bodyModel[472].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 590
		bodyModel[472].setRotationPoint(18.3F, -40.3F, -2F);

		bodyModel[473].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 591
		bodyModel[473].setRotationPoint(15.5F, -42.5F, -1.5F);

		bodyModel[474].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 592
		bodyModel[474].setRotationPoint(15.5F, -43.5F, -1.5F);

		bodyModel[475].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 593
		bodyModel[475].setRotationPoint(15.5F, -44.5F, -1.5F);

		bodyModel[476].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 594
		bodyModel[476].setRotationPoint(15F, -45F, -3F);

		bodyModel[477].addShapeBox(0F, 0F, 0F, 14, 14, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 380
		bodyModel[477].setRotationPoint(-1F, -37.3F, -9F);

		bodyModel[478].addShapeBox(0F, 0F, 0F, 14, 1, 18, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 381
		bodyModel[478].setRotationPoint(-1F, -38.3F, -9F);

		bodyModel[479].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 399
		bodyModel[479].setRotationPoint(30F, -42F, -0.5F);

		bodyModel[480].addShapeBox(-6F, -2.5F, -0.5F, 8, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[480].setRotationPoint(30F, -41F, 0F);

		bodyModel[481].addShapeBox(-1F, -0.5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 2
		bodyModel[481].setRotationPoint(30F, -41F, 0F);

		bodyModel[482].addShapeBox(-4F, -0.5F, -0.5F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Box 3
		bodyModel[482].setRotationPoint(30F, -41F, 0F);

		bodyModel[483].addShapeBox(-4.5F, 2F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 4
		bodyModel[483].setRotationPoint(30F, -41F, 0F);

		bodyModel[484].addShapeBox(-1.5F, 0F, -0.5F, 1, 1, 1, 0F,0F, -0.25F, -0.4F, 0F, 0.25F, -0.4F, 0F, 0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.5F, -0.4F, 0F, -1F, -0.4F, 0F, -1F, -0.4F, 0F, -0.5F, -0.4F); // Box 5
		bodyModel[484].setRotationPoint(30F, -41F, 0F);

		bodyModel[485].addShapeBox(-2.25F, -1.1F, -0.5F, 1, 1, 1, 0F,0F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, 0F, 0F, -0.375F, -0.75F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, -0.75F, 0F, -0.375F); // Box 6
		bodyModel[485].setRotationPoint(30F, -41F, 0F);

		bodyModel[486].addShapeBox(-2.5F, 0F, -0.5F, 1, 1, 1, 0F,0F, 0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, 0.25F, -0.4F, 0F, -1F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -1F, -0.4F); // Box 7
		bodyModel[486].setRotationPoint(30F, -41F, 0F);

		bodyModel[487].addShapeBox(-1F, -0.5F, -0.5F, 2, 1, 1, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.875F, -0.375F, 0F, -0.875F, -0.375F, 0F, -0.875F, -0.375F, 0F, -0.875F, -0.375F, 0F); // Box 8
		bodyModel[487].setRotationPoint(30F, -41F, 0F);

		bodyModel[488].addShapeBox(2F, -2.5F, -0.5F, 18, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 9
		bodyModel[488].setRotationPoint(30F, -41F, 0F);

		bodyModel[489].addShapeBox(2F, -1.7F, -0.5F, 14, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 10
		bodyModel[489].setRotationPoint(30F, -41F, 0F);

		bodyModel[490].addShapeBox(18F, -3F, -0.5F, 1, 1, 1, 0F,-0.4F, 0.8F, -0.4F, -0.4F, 0.8F, -0.4F, -0.4F, 0.8F, -0.4F, -0.4F, 0.8F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F); // Box 11
		bodyModel[490].setRotationPoint(30F, -41F, 0F);

		bodyModel[491].addShapeBox(-6F, -3.5F, -0.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[491].setRotationPoint(30F, -41F, 0F);

		bodyModel[492].addShapeBox(-6F, -4.5F, -0.5F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 13
		bodyModel[492].setRotationPoint(30F, -41F, 0F);

		bodyModel[493].addShapeBox(-6F, -4.5F, -0.5F, 3, 1, 1, 0F,0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[493].setRotationPoint(30F, -41F, 0F);

		bodyModel[494].addShapeBox(-3F, -3.5F, -0.5F, 5, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[494].setRotationPoint(30F, -41F, 0F);

		bodyModel[495].addShapeBox(-1F, -3.5F, -1.5F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[495].setRotationPoint(30F, -41F, 0F);

		bodyModel[496].addShapeBox(-2F, -3.5F, -1.5F, 1, 1, 3, 0F,-0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F); // Box 18
		bodyModel[496].setRotationPoint(30F, -41F, 0F);

		bodyModel[497].addShapeBox(-1F, -3.5F, 1.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 20
		bodyModel[497].setRotationPoint(30F, -41F, 0F);

		bodyModel[498].addShapeBox(-1F, -3.5F, -2.5F, 3, 1, 1, 0F,-1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[498].setRotationPoint(30F, -41F, 0F);

		bodyModel[499].addShapeBox(2F, -3.5F, -1.5F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F); // Box 22
		bodyModel[499].setRotationPoint(30F, -41F, 0F);
	}

	private void initbodyModel_2()
	{
		bodyModel[500] = new ModelRendererTurbo(this, 81, 329, textureX, textureY); // Box 23
		bodyModel[501] = new ModelRendererTurbo(this, 177, 329, textureX, textureY); // Box 26
		bodyModel[502] = new ModelRendererTurbo(this, 193, 329, textureX, textureY); // Box 27
		bodyModel[503] = new ModelRendererTurbo(this, 217, 329, textureX, textureY); // Box 28
		bodyModel[504] = new ModelRendererTurbo(this, 233, 329, textureX, textureY); // Box 29
		bodyModel[505] = new ModelRendererTurbo(this, 257, 329, textureX, textureY); // Box 30
		bodyModel[506] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 441

		bodyModel[500].addShapeBox(-8F, -3.5F, -0.5F, 1, 3, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 23
		bodyModel[500].setRotationPoint(30F, -41F, 0F);

		bodyModel[501].addShapeBox(-7F, -1F, -0.5F, 1, 1, 1, 0F,0F, -0.25F, -0.4F, 0F, 0.25F, -0.4F, 0F, 0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.5F, -0.4F, 0F, -1F, -0.4F, 0F, -1F, -0.4F, 0F, -0.5F, -0.4F); // Box 26
		bodyModel[501].setRotationPoint(30F, -41F, 0F);

		bodyModel[502].addShapeBox(-7F, -4F, -0.5F, 1, 1, 1, 0F,0F, -0.5F, -0.4F, 0F, -1F, -0.4F, 0F, -1F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.25F, -0.4F, 0F, 0.25F, -0.4F, 0F, 0.25F, -0.4F, 0F, -0.25F, -0.4F); // Box 27
		bodyModel[502].setRotationPoint(30F, -41F, 0F);

		bodyModel[503].addShapeBox(-7.5F, -3.5F, -0.5F, 1, 3, 1, 0F,-0.25F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, 0F); // Box 28
		bodyModel[503].setRotationPoint(30F, -41F, 0F);

		bodyModel[504].addShapeBox(-8.5F, -3.5F, -0.5F, 1, 3, 1, 0F,-0.5F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, -0.25F); // Box 29
		bodyModel[504].setRotationPoint(30F, -41F, 0F);

		bodyModel[505].addShapeBox(15F, -2.5F, -0.5F, 1, 2, 1, 0F,-0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F); // Box 30
		bodyModel[505].setRotationPoint(30F, -41F, 0F);

		bodyModel[506].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 441
		bodyModel[506].setRotationPoint(30F, -40F, -0.5F);
	}

	private void initnoseModel_1()
	{
		noseModel[0] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 18
		noseModel[1] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 19
		noseModel[2] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 20
		noseModel[3] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 21
		noseModel[4] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // Box 22
		noseModel[5] = new ModelRendererTurbo(this, 249, 105, textureX, textureY); // Box 69
		noseModel[6] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 76
		noseModel[7] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 77
		noseModel[8] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 78
		noseModel[9] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 79
		noseModel[10] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 80
		noseModel[11] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 81
		noseModel[12] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 82
		noseModel[13] = new ModelRendererTurbo(this, 449, 241, textureX, textureY); // Box 166
		noseModel[14] = new ModelRendererTurbo(this, 73, 249, textureX, textureY); // Box 167
		noseModel[15] = new ModelRendererTurbo(this, 377, 249, textureX, textureY); // Box 168
		noseModel[16] = new ModelRendererTurbo(this, 1, 257, textureX, textureY); // Box 169
		noseModel[17] = new ModelRendererTurbo(this, 249, 257, textureX, textureY); // Box 170
		noseModel[18] = new ModelRendererTurbo(this, 25, 329, textureX, textureY); // Box 217
		noseModel[19] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 224
		noseModel[20] = new ModelRendererTurbo(this, 305, 105, textureX, textureY); // Box 225
		noseModel[21] = new ModelRendererTurbo(this, 241, 169, textureX, textureY); // Box 226
		noseModel[22] = new ModelRendererTurbo(this, 57, 121, textureX, textureY); // Box 227
		noseModel[23] = new ModelRendererTurbo(this, 41, 201, textureX, textureY); // Box 228
		noseModel[24] = new ModelRendererTurbo(this, 129, 249, textureX, textureY); // Box 229
		noseModel[25] = new ModelRendererTurbo(this, 297, 73, textureX, textureY); // Box 230
		noseModel[26] = new ModelRendererTurbo(this, 41, 385, textureX, textureY); // Box 348
		noseModel[27] = new ModelRendererTurbo(this, 1, 425, textureX, textureY); // Box 349
		noseModel[28] = new ModelRendererTurbo(this, 17, 425, textureX, textureY); // Box 350
		noseModel[29] = new ModelRendererTurbo(this, 105, 425, textureX, textureY); // Box 351
		noseModel[30] = new ModelRendererTurbo(this, 361, 257, textureX, textureY); // Box 247
		noseModel[31] = new ModelRendererTurbo(this, 185, 265, textureX, textureY); // Box 248
		noseModel[32] = new ModelRendererTurbo(this, 81, 289, textureX, textureY); // Box 249
		noseModel[33] = new ModelRendererTurbo(this, 177, 329, textureX, textureY); // Box 500
		noseModel[34] = new ModelRendererTurbo(this, 217, 329, textureX, textureY); // Box 311
		noseModel[35] = new ModelRendererTurbo(this, 257, 329, textureX, textureY); // Box 312
		noseModel[36] = new ModelRendererTurbo(this, 57, 257, textureX, textureY); // Box 313

		noseModel[0].addShapeBox(0F, 0F, 0F, 20, 3, 8, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 18
		noseModel[0].setRotationPoint(-80F, -17F, -8F);

		noseModel[1].addShapeBox(0F, 0F, 0F, 20, 4, 11, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 19
		noseModel[1].setRotationPoint(-80F, -21F, -11F);

		noseModel[2].addShapeBox(0F, 0F, 0F, 20, 5, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 20
		noseModel[2].setRotationPoint(-80F, -26F, -13F);

		noseModel[3].addShapeBox(0F, 0F, 0F, 20, 5, 13, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		noseModel[3].setRotationPoint(-80F, -31F, -13F);

		noseModel[4].addShapeBox(0F, 0F, 0F, 20, 5, 13, 0F,0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 22
		noseModel[4].setRotationPoint(-80F, -36F, -13F);

		noseModel[5].addShapeBox(0F, 0F, 0F, 20, 6, 11, 0F,0F, -1F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 69
		noseModel[5].setRotationPoint(-80F, -42F, -11F);

		noseModel[6].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		noseModel[6].setRotationPoint(-82F, -30F, -13F);

		noseModel[7].addShapeBox(0F, 0F, 0F, 2, 5, 5, 0F,0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 77
		noseModel[7].setRotationPoint(-82F, -35F, -13F);

		noseModel[8].addShapeBox(0F, 0F, 0F, 2, 6, 10, 0F,0F, -1F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F); // Box 78
		noseModel[8].setRotationPoint(-82F, -41F, -11F);

		noseModel[9].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		noseModel[9].setRotationPoint(-82F, -26F, -13F);

		noseModel[10].addShapeBox(0F, 0F, 0F, 2, 4, 6, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		noseModel[10].setRotationPoint(-82F, -22F, -11F);

		noseModel[11].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 81
		noseModel[11].setRotationPoint(-82F, -18F, -8F);

		noseModel[12].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		noseModel[12].setRotationPoint(-82F, -41F, -4F);

		noseModel[13].addShapeBox(0F, 0F, 0F, 20, 3, 8, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -2F, -5F); // Box 166
		noseModel[13].setRotationPoint(-80F, -17F, 0F);

		noseModel[14].addShapeBox(0F, 0F, 0F, 20, 4, 11, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, -3F); // Box 167
		noseModel[14].setRotationPoint(-80F, -21F, 0F);

		noseModel[15].addShapeBox(0F, 0F, 0F, 20, 5, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -2F); // Box 168
		noseModel[15].setRotationPoint(-80F, -26F, 0F);

		noseModel[16].addShapeBox(0F, 0F, 0F, 20, 5, 13, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		noseModel[16].setRotationPoint(-80F, -31F, 0F);

		noseModel[17].addShapeBox(0F, 0F, 0F, 20, 5, 13, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 170
		noseModel[17].setRotationPoint(-80F, -36F, 0F);

		noseModel[18].addShapeBox(0F, 0F, 0F, 20, 6, 11, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -1F, -7F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 217
		noseModel[18].setRotationPoint(-80F, -42F, 0F);

		noseModel[19].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 224
		noseModel[19].setRotationPoint(-82F, -30F, 10F);

		noseModel[20].addShapeBox(0F, 0F, 0F, 2, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 225
		noseModel[20].setRotationPoint(-82F, -35F, 8F);

		noseModel[21].addShapeBox(0F, 0F, 0F, 2, 6, 10, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -1F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 226
		noseModel[21].setRotationPoint(-82F, -41F, 1F);

		noseModel[22].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F); // Box 227
		noseModel[22].setRotationPoint(-82F, -26F, 8F);

		noseModel[23].addShapeBox(0F, 0F, 0F, 2, 4, 6, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F); // Box 228
		noseModel[23].setRotationPoint(-82F, -22F, 5F);

		noseModel[24].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -1F, -5F); // Box 229
		noseModel[24].setRotationPoint(-82F, -18F, 0F);

		noseModel[25].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 230
		noseModel[25].setRotationPoint(-82F, -41F, 0F);

		noseModel[26].addShapeBox(0F, -10F, -2F, 2, 20, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 348
		noseModel[26].setRotationPoint(-81.5F, -28F, 0F);

		noseModel[27].addShapeBox(0F, -10F, -2F, 2, 20, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 349
		noseModel[27].setRotationPoint(-81.5F, -28F, 0F);
		noseModel[27].rotateAngleX = 1.57079633F;

		noseModel[28].addShapeBox(0F, -11F, -2F, 2, 22, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 350
		noseModel[28].setRotationPoint(-81.5F, -28F, 0F);
		noseModel[28].rotateAngleX = 0.78539816F;

		noseModel[29].addShapeBox(0F, -11F, -2F, 2, 22, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 351
		noseModel[29].setRotationPoint(-81.5F, -28F, 0F);
		noseModel[29].rotateAngleX = -0.78539816F;

		noseModel[30].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		noseModel[30].setRotationPoint(-91F, -29.5F, -0.5F);

		noseModel[31].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		noseModel[31].setRotationPoint(-91F, -29.5F, -1.5F);

		noseModel[32].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 249
		noseModel[32].setRotationPoint(-91F, -29.5F, 0.5F);

		noseModel[33].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 500
		noseModel[33].setRotationPoint(-88F, -29F, -3F);

		noseModel[34].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 311
		noseModel[34].setRotationPoint(-88F, -31F, -3F);

		noseModel[35].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 312
		noseModel[35].setRotationPoint(-88F, -27F, -3F);

		noseModel[36].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 313
		noseModel[36].setRotationPoint(-92F, -28.5F, -0.5F);
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 185, 89, textureX, textureY); // Box 51
		leftWingModel[1] = new ModelRendererTurbo(this, 233, 89, textureX, textureY); // Box 52
		leftWingModel[2] = new ModelRendererTurbo(this, 281, 89, textureX, textureY); // Box 53
		leftWingModel[3] = new ModelRendererTurbo(this, 329, 89, textureX, textureY); // Box 54
		leftWingModel[4] = new ModelRendererTurbo(this, 377, 89, textureX, textureY); // Box 55
		leftWingModel[5] = new ModelRendererTurbo(this, 425, 89, textureX, textureY); // Box 56
		leftWingModel[6] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 57
		leftWingModel[7] = new ModelRendererTurbo(this, 129, 97, textureX, textureY); // Box 58
		leftWingModel[8] = new ModelRendererTurbo(this, 49, 105, textureX, textureY); // Box 60
		leftWingModel[9] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 61
		leftWingModel[10] = new ModelRendererTurbo(this, 169, 105, textureX, textureY); // Box 62
		leftWingModel[11] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // Box 63
		leftWingModel[12] = new ModelRendererTurbo(this, 97, 105, textureX, textureY); // Box 64
		leftWingModel[13] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 65
		leftWingModel[14] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 66
		leftWingModel[15] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 67
		leftWingModel[16] = new ModelRendererTurbo(this, 17, 121, textureX, textureY); // Box 84
		leftWingModel[17] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 85
		leftWingModel[18] = new ModelRendererTurbo(this, 41, 121, textureX, textureY); // Box 87
		leftWingModel[19] = new ModelRendererTurbo(this, 313, 105, textureX, textureY); // Box 88
		leftWingModel[20] = new ModelRendererTurbo(this, 473, 113, textureX, textureY); // Box 89
		leftWingModel[21] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 90
		leftWingModel[22] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 92
		leftWingModel[23] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 93
		leftWingModel[24] = new ModelRendererTurbo(this, 385, 129, textureX, textureY); // Box 95
		leftWingModel[25] = new ModelRendererTurbo(this, 105, 129, textureX, textureY); // Box 96
		leftWingModel[26] = new ModelRendererTurbo(this, 233, 129, textureX, textureY); // Box 97
		leftWingModel[27] = new ModelRendererTurbo(this, 209, 145, textureX, textureY); // Box 98
		leftWingModel[28] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 99
		leftWingModel[29] = new ModelRendererTurbo(this, 105, 153, textureX, textureY); // Box 101
		leftWingModel[30] = new ModelRendererTurbo(this, 113, 201, textureX, textureY); // Box 102
		leftWingModel[31] = new ModelRendererTurbo(this, 161, 217, textureX, textureY); // Box 103
		leftWingModel[32] = new ModelRendererTurbo(this, 225, 217, textureX, textureY); // Box 104
		leftWingModel[33] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Box 105
		leftWingModel[34] = new ModelRendererTurbo(this, 297, 233, textureX, textureY); // Box 106
		leftWingModel[35] = new ModelRendererTurbo(this, 265, 129, textureX, textureY); // Box 108
		leftWingModel[36] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 109
		leftWingModel[37] = new ModelRendererTurbo(this, 353, 153, textureX, textureY); // Box 114
		leftWingModel[38] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 115
		leftWingModel[39] = new ModelRendererTurbo(this, 129, 305, textureX, textureY); // Box 199
		leftWingModel[40] = new ModelRendererTurbo(this, 41, 313, textureX, textureY); // Box 200
		leftWingModel[41] = new ModelRendererTurbo(this, 89, 313, textureX, textureY); // Box 201
		leftWingModel[42] = new ModelRendererTurbo(this, 177, 313, textureX, textureY); // Box 202
		leftWingModel[43] = new ModelRendererTurbo(this, 225, 313, textureX, textureY); // Box 203
		leftWingModel[44] = new ModelRendererTurbo(this, 273, 313, textureX, textureY); // Box 204
		leftWingModel[45] = new ModelRendererTurbo(this, 321, 313, textureX, textureY); // Box 205
		leftWingModel[46] = new ModelRendererTurbo(this, 369, 313, textureX, textureY); // Box 206
		leftWingModel[47] = new ModelRendererTurbo(this, 465, 313, textureX, textureY); // Box 208
		leftWingModel[48] = new ModelRendererTurbo(this, 89, 177, textureX, textureY); // Box 209
		leftWingModel[49] = new ModelRendererTurbo(this, 441, 233, textureX, textureY); // Box 210
		leftWingModel[50] = new ModelRendererTurbo(this, 225, 241, textureX, textureY); // Box 211
		leftWingModel[51] = new ModelRendererTurbo(this, 1, 321, textureX, textureY); // Box 212
		leftWingModel[52] = new ModelRendererTurbo(this, 353, 145, textureX, textureY); // Box 213
		leftWingModel[53] = new ModelRendererTurbo(this, 473, 257, textureX, textureY); // Box 214
		leftWingModel[54] = new ModelRendererTurbo(this, 145, 129, textureX, textureY); // Box 215
		leftWingModel[55] = new ModelRendererTurbo(this, 329, 329, textureX, textureY); // Box 232
		leftWingModel[56] = new ModelRendererTurbo(this, 257, 57, textureX, textureY); // Box 233
		leftWingModel[57] = new ModelRendererTurbo(this, 89, 337, textureX, textureY); // Box 235
		leftWingModel[58] = new ModelRendererTurbo(this, 417, 337, textureX, textureY); // Box 236
		leftWingModel[59] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 237
		leftWingModel[60] = new ModelRendererTurbo(this, 305, 257, textureX, textureY); // Box 238
		leftWingModel[61] = new ModelRendererTurbo(this, 481, 129, textureX, textureY); // Box 240
		leftWingModel[62] = new ModelRendererTurbo(this, 153, 137, textureX, textureY); // Box 241
		leftWingModel[63] = new ModelRendererTurbo(this, 265, 345, textureX, textureY); // Box 243
		leftWingModel[64] = new ModelRendererTurbo(this, 457, 345, textureX, textureY); // Box 244
		leftWingModel[65] = new ModelRendererTurbo(this, 417, 345, textureX, textureY); // Box 245
		leftWingModel[66] = new ModelRendererTurbo(this, 129, 369, textureX, textureY); // Box 246
		leftWingModel[67] = new ModelRendererTurbo(this, 1, 353, textureX, textureY); // Box 247
		leftWingModel[68] = new ModelRendererTurbo(this, 1, 425, textureX, textureY); // Box 249
		leftWingModel[69] = new ModelRendererTurbo(this, 273, 369, textureX, textureY); // Box 250
		leftWingModel[70] = new ModelRendererTurbo(this, 105, 441, textureX, textureY); // Box 251
		leftWingModel[71] = new ModelRendererTurbo(this, 89, 377, textureX, textureY); // Box 252
		leftWingModel[72] = new ModelRendererTurbo(this, 169, 441, textureX, textureY); // Box 253
		leftWingModel[73] = new ModelRendererTurbo(this, 241, 449, textureX, textureY); // Box 254
		leftWingModel[74] = new ModelRendererTurbo(this, 1, 353, textureX, textureY); // Box 256
		leftWingModel[75] = new ModelRendererTurbo(this, 153, 353, textureX, textureY); // Box 257
		leftWingModel[76] = new ModelRendererTurbo(this, 433, 377, textureX, textureY); // Box 262
		leftWingModel[77] = new ModelRendererTurbo(this, 417, 113, textureX, textureY); // Box 263
		leftWingModel[78] = new ModelRendererTurbo(this, 353, 505, textureX, textureY); // Box 117
		leftWingModel[79] = new ModelRendererTurbo(this, 105, 513, textureX, textureY); // Box 118
		leftWingModel[80] = new ModelRendererTurbo(this, 433, 521, textureX, textureY); // Box 119
		leftWingModel[81] = new ModelRendererTurbo(this, 1, 537, textureX, textureY); // Box 120
		leftWingModel[82] = new ModelRendererTurbo(this, 145, 401, textureX, textureY); // Box 121
		leftWingModel[83] = new ModelRendererTurbo(this, 65, 537, textureX, textureY); // Box 122
		leftWingModel[84] = new ModelRendererTurbo(this, 185, 537, textureX, textureY); // Box 123
		leftWingModel[85] = new ModelRendererTurbo(this, 273, 537, textureX, textureY); // Box 124
		leftWingModel[86] = new ModelRendererTurbo(this, 497, 393, textureX, textureY); // Box 330
		leftWingModel[87] = new ModelRendererTurbo(this, 497, 513, textureX, textureY); // Box 331
		leftWingModel[88] = new ModelRendererTurbo(this, 361, 537, textureX, textureY); // Box 332
		leftWingModel[89] = new ModelRendererTurbo(this, 377, 537, textureX, textureY); // Box 333
		leftWingModel[90] = new ModelRendererTurbo(this, 393, 537, textureX, textureY); // Box 334
		leftWingModel[91] = new ModelRendererTurbo(this, 201, 617, textureX, textureY); // Box 0
		leftWingModel[92] = new ModelRendererTurbo(this, 313, 617, textureX, textureY); // Box 1
		leftWingModel[93] = new ModelRendererTurbo(this, 433, 513, textureX, textureY); // Core_001
		leftWingModel[94] = new ModelRendererTurbo(this, 337, 481, textureX, textureY); // Core_001
		leftWingModel[95] = new ModelRendererTurbo(this, 369, 329, textureX, textureY); // Core_001
		leftWingModel[96] = new ModelRendererTurbo(this, 145, 401, textureX, textureY); // Core_001
		leftWingModel[97] = new ModelRendererTurbo(this, 321, 393, textureX, textureY); // Core_001
		leftWingModel[98] = new ModelRendererTurbo(this, 145, 409, textureX, textureY); // Core_001
		leftWingModel[99] = new ModelRendererTurbo(this, 321, 417, textureX, textureY); // Core_001
		leftWingModel[100] = new ModelRendererTurbo(this, 177, 409, textureX, textureY); // Core_001
		leftWingModel[101] = new ModelRendererTurbo(this, 433, 417, textureX, textureY); // Core_001
		leftWingModel[102] = new ModelRendererTurbo(this, 433, 425, textureX, textureY); // Core_001
		leftWingModel[103] = new ModelRendererTurbo(this, 169, 441, textureX, textureY); // Core_001
		leftWingModel[104] = new ModelRendererTurbo(this, 121, 449, textureX, textureY); // Core_001
		leftWingModel[105] = new ModelRendererTurbo(this, 481, 441, textureX, textureY); // Core_001
		leftWingModel[106] = new ModelRendererTurbo(this, 169, 449, textureX, textureY); // Core_001
		leftWingModel[107] = new ModelRendererTurbo(this, 241, 449, textureX, textureY); // Core_001
		leftWingModel[108] = new ModelRendererTurbo(this, 137, 625, textureX, textureY); // Box 16
		leftWingModel[109] = new ModelRendererTurbo(this, 97, 609, textureX, textureY); // Box 17
		leftWingModel[110] = new ModelRendererTurbo(this, 209, 465, textureX, textureY); // Box 18
		leftWingModel[111] = new ModelRendererTurbo(this, 417, 481, textureX, textureY); // Box 19
		leftWingModel[112] = new ModelRendererTurbo(this, 337, 505, textureX, textureY); // Box 22
		leftWingModel[113] = new ModelRendererTurbo(this, 257, 537, textureX, textureY); // Box 24
		leftWingModel[114] = new ModelRendererTurbo(this, 169, 545, textureX, textureY); // Box 25

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 16, 5, 7, 0F,0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 51
		leftWingModel[0].setRotationPoint(66F, -36F, -7F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 17, 4, 5, 0F,0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 52
		leftWingModel[1].setRotationPoint(82F, -37F, -5F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 16, 4, 7, 0F,0F, 0F, 0F, 0F, 2F, -2F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 53
		leftWingModel[2].setRotationPoint(66F, -31F, -7F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 17, 3, 5, 0F,0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 54
		leftWingModel[3].setRotationPoint(82F, -33F, -5F);

		leftWingModel[4].addShapeBox(0F, 0F, 0F, 16, 3, 7, 0F,0F, 0F, 0F, 0F, 3F, -2F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 55
		leftWingModel[4].setRotationPoint(66F, -27F, -7F);

		leftWingModel[5].addShapeBox(0F, 0F, 0F, 17, 3, 5, 0F,0F, 0F, 0F, 0F, 2F, -2F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 56
		leftWingModel[5].setRotationPoint(82F, -30F, -5F);

		leftWingModel[6].addShapeBox(0F, 0F, 0F, 16, 6, 7, 0F,0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 57
		leftWingModel[6].setRotationPoint(66F, -42F, -7F);

		leftWingModel[7].addShapeBox(0F, 0F, 0F, 17, 5, 5, 0F,0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 58
		leftWingModel[7].setRotationPoint(82F, -42F, -5F);

		leftWingModel[8].addShapeBox(0F, 0F, 0F, 16, 4, 5, 0F,0F, 0F, -3F, 0F, -1F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		leftWingModel[8].setRotationPoint(66F, -46F, -5F);

		leftWingModel[9].addShapeBox(0F, 0F, 0F, 17, 3, 3, 0F,0F, 0F, -1F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		leftWingModel[9].setRotationPoint(82F, -45F, -3F);

		leftWingModel[10].addShapeBox(0F, 0F, 0F, 16, 2, 5, 0F,0F, 0F, 0F, 0F, 3F, -1F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, -2F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 62
		leftWingModel[10].setRotationPoint(66F, -24F, -5F);

		leftWingModel[11].addShapeBox(0F, 0F, 0F, 17, 2, 4, 0F,0F, 0F, 0F, 0F, 3F, -2F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -4F, -3F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 63
		leftWingModel[11].setRotationPoint(82F, -27F, -4F);

		leftWingModel[12].addShapeBox(0F, 0F, 0F, 14, 10, 3, 0F,0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, -2F, 0F, -7F, 0F, 0F, 0F, 0F); // Box 64
		leftWingModel[12].setRotationPoint(99F, -42F, -3F);

		leftWingModel[13].addShapeBox(0F, 0F, 0F, 14, 2, 3, 0F,0F, 0F, 0F, 0F, 6.9999F, -1.9999F, 0F, 6.9999F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9999F, 0F, -8.9999F, -1.9999F, 0F, -8.9999F, 0F, 0F, 0F, 0F); // Box 65
		leftWingModel[13].setRotationPoint(99F, -32F, -3F);

		leftWingModel[14].addShapeBox(0F, 0F, 0F, 14, 2, 3, 0F,0F, 0F, -2F, 0F, -3.5F, -2.5F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -2F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 66
		leftWingModel[14].setRotationPoint(99F, -44F, -3F);

		leftWingModel[15].addShapeBox(0F, 0F, 0F, 14, 1, 2, 0F,0F, 0F, 0F, 0F, 9F, -1F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -9.5F, -1.5F, 0F, -9.5F, 0F, 0F, 0F, 0F); // Box 67
		leftWingModel[15].setRotationPoint(99F, -30F, -2F);

		leftWingModel[16].addShapeBox(0F, 0F, 0F, 14, 3, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		leftWingModel[16].setRotationPoint(84F, -40F, -12F);

		leftWingModel[17].addShapeBox(0F, 0F, 0F, 2, 3, 11, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 85
		leftWingModel[17].setRotationPoint(82F, -40F, -12F);

		leftWingModel[18].addShapeBox(0F, 0F, 0F, 14, 3, 33, 0F,-6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		leftWingModel[18].setRotationPoint(84F, -40F, -45F);

		leftWingModel[19].addShapeBox(0F, 0F, 0F, 2, 3, 33, 0F,-5F, -1F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -5F, -1F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 88
		leftWingModel[19].setRotationPoint(82F, -40F, -45F);

		leftWingModel[20].addShapeBox(0F, 0F, 0F, 8, 3, 7, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		leftWingModel[20].setRotationPoint(90F, -40F, -52F);

		leftWingModel[21].addShapeBox(0F, 0F, 0F, 5, 3, 7, 0F,-2F, -1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F); // Box 90
		leftWingModel[21].setRotationPoint(87F, -40F, -52F);

		leftWingModel[22].addShapeBox(0F, 0F, 0F, 6, 3, 4, 0F,-3F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		leftWingModel[22].setRotationPoint(92F, -40F, -56F);

		leftWingModel[23].addShapeBox(0F, 0F, 0F, 6, 3, 4, 0F,-3F, -1F, -1F, 0F, -1F, 0F, -3F, 0F, 0F, 0F, -1F, 0F, -3F, -1F, -1F, 0F, -1F, 0F, -3F, 0F, 0F, 0F, -1F, 0F); // Box 93
		leftWingModel[23].setRotationPoint(89F, -40F, -56F);

		leftWingModel[24].addShapeBox(0F, 0F, 0F, 40, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 95
		leftWingModel[24].setRotationPoint(-32F, -29F, -19F);

		leftWingModel[25].addShapeBox(0F, 0F, 0F, 12, 8, 8, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 1F, 0F, 0F, 1F); // Box 96
		leftWingModel[25].setRotationPoint(8F, -29F, -19F);

		leftWingModel[26].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 97
		leftWingModel[26].setRotationPoint(-40F, -29F, -19F);

		leftWingModel[27].addShapeBox(0F, 0F, 0F, 40, 8, 57, 0F,1F, 0F, 0F, -8F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 1F, -2F, 0F, -8F, -2F, 0F, 0F, 6F, 0F, 0F, 6F, 0F); // Box 98
		leftWingModel[27].setRotationPoint(-32F, -35F, -76F);

		leftWingModel[28].addShapeBox(0F, 0F, 0F, 14, 8, 57, 0F,1F, -2F, 0F, -8F, 0F, 0F, -7F, -6F, 0F, 1F, -9F, 0F, 1F, -4F, 0F, -8F, -2F, 0F, -7F, 6F, 0F, 1F, 3F, 0F); // Box 99
		leftWingModel[28].setRotationPoint(-39F, -35F, -76F);

		leftWingModel[29].addShapeBox(0F, 0F, 0F, 33, 8, 32, 0F,0F, 0F, 0F, -5F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, -5F, -4F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 101
		leftWingModel[29].setRotationPoint(-33F, -38F, -108F);

		leftWingModel[30].addShapeBox(0F, 0F, 0F, 7, 8, 32, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -4F, 0F, 0F, 1F, 0F, 0F, -1F, 0F); // Box 102
		leftWingModel[30].setRotationPoint(-40F, -38F, -108F);

		leftWingModel[31].addShapeBox(0F, 0F, 0F, 15, 8, 32, 0F,0F, 0F, 0F, -5F, -2F, 0F, 0F, -6F, 0F, -5F, -3F, 0F, 0F, -4F, 0F, -5F, -5F, 0F, 0F, -1F, 0F, -5F, 1F, 0F); // Box 103
		leftWingModel[31].setRotationPoint(-5F, -38F, -108F);

		leftWingModel[32].addShapeBox(0F, 0F, 0F, 28, 4, 13, 0F,-9F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, -2F, 0F, -13F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		leftWingModel[32].setRotationPoint(-33F, -38F, -121F);

		leftWingModel[33].addShapeBox(0F, 0F, 0F, 28, 4, 13, 0F,-7F, 0F, -2F, -12F, 0F, 0F, -21F, 0F, 0F, 0F, -1F, 0F, -7F, -3F, -2F, -12F, -2F, 0F, -21F, 0F, 0F, 0F, -1F, 0F); // Box 105
		leftWingModel[33].setRotationPoint(-40F, -38F, -121F);

		leftWingModel[34].addShapeBox(0F, 0F, 0F, 31, 4, 13, 0F,-8F, 0F, 0F, -9F, 0F, -4F, 0F, -2F, 0F, -21F, 0F, 0F, -8F, -2F, 0F, -9F, -3F, -4F, 0F, -1F, 0F, -21F, 0F, 0F); // Box 106
		leftWingModel[34].setRotationPoint(-26F, -38F, -121F);

		leftWingModel[35].addShapeBox(0F, 0F, 0F, 20, 3, 2, 0F,0F, 0F, 0F, -3F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 2F, -1F, 2F, 2F, 0F, 0F, 0F, 0F); // Box 108
		leftWingModel[35].setRotationPoint(89F, -45F, -2F);

		leftWingModel[36].addShapeBox(0F, 0F, 0F, 23, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		leftWingModel[36].setRotationPoint(66F, -45F, -2F);

		leftWingModel[37].addShapeBox(0F, 0F, 0F, 23, 32, 2, 0F,-19F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -17F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 114
		leftWingModel[37].setRotationPoint(66F, -77F, -2F);

		leftWingModel[38].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,-5F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		leftWingModel[38].setRotationPoint(83F, -79F, -2F);

		leftWingModel[39].addShapeBox(0F, 0F, 0F, 16, 5, 7, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, 0F, 0F); // Box 199
		leftWingModel[39].setRotationPoint(66F, -36F, 0F);

		leftWingModel[40].addShapeBox(0F, 0F, 0F, 17, 4, 5, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, 0F, 0F); // Box 200
		leftWingModel[40].setRotationPoint(82F, -37F, 0F);

		leftWingModel[41].addShapeBox(0F, 0F, 0F, 16, 4, 7, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -2F, 0F, 0F, 0F); // Box 201
		leftWingModel[41].setRotationPoint(66F, -31F, 0F);

		leftWingModel[42].addShapeBox(0F, 0F, 0F, 17, 3, 5, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, 0F, 0F); // Box 202
		leftWingModel[42].setRotationPoint(82F, -33F, 0F);

		leftWingModel[43].addShapeBox(0F, 0F, 0F, 16, 3, 7, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -3F, 0F, 0F, -2F); // Box 203
		leftWingModel[43].setRotationPoint(66F, -27F, 0F);

		leftWingModel[44].addShapeBox(0F, 0F, 0F, 17, 3, 5, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -3F, 0F, 0F, -1F); // Box 204
		leftWingModel[44].setRotationPoint(82F, -30F, 0F);

		leftWingModel[45].addShapeBox(0F, 0F, 0F, 16, 6, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, 0F, 0F); // Box 205
		leftWingModel[45].setRotationPoint(66F, -42F, 0F);

		leftWingModel[46].addShapeBox(0F, 0F, 0F, 17, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, 0F, 0F); // Box 206
		leftWingModel[46].setRotationPoint(82F, -42F, 0F);

		leftWingModel[47].addShapeBox(0F, 0F, 0F, 16, 4, 5, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 208
		leftWingModel[47].setRotationPoint(66F, -46F, 0F);

		leftWingModel[48].addShapeBox(0F, 0F, 0F, 17, 3, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 209
		leftWingModel[48].setRotationPoint(82F, -45F, 0F);

		leftWingModel[49].addShapeBox(0F, 0F, 0F, 16, 2, 5, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -2F, 0F, 0F, -2F); // Box 210
		leftWingModel[49].setRotationPoint(66F, -24F, 0F);

		leftWingModel[50].addShapeBox(0F, 0F, 0F, 17, 2, 4, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, -3F, 0F, 0F, -1F); // Box 211
		leftWingModel[50].setRotationPoint(82F, -27F, 0F);

		leftWingModel[51].addShapeBox(0F, 0F, 0F, 14, 10, 3, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, -2F, 0F, 0F, 0F); // Box 212
		leftWingModel[51].setRotationPoint(99F, -42F, 0F);

		leftWingModel[52].addShapeBox(0F, 0F, 0F, 14, 2, 3, 0F,0F, 0F, 0F, 0F, 6.9999F, 0F, 0F, 6.9999F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8.9999F, 0F, 0F, -8.9999F, -1.9999F, 0F, 0F, -0.9999F); // Box 213
		leftWingModel[52].setRotationPoint(99F, -32F, 0F);

		leftWingModel[53].addShapeBox(0F, 0F, 0F, 14, 2, 3, 0F,0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, -2.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -2F, 0F, 0F, 0F); // Box 214
		leftWingModel[53].setRotationPoint(99F, -44F, 0F);

		leftWingModel[54].addShapeBox(0F, 0F, 0F, 14, 1, 2, 0F,0F, 0F, 0F, 0F, 9F, 0F, 0F, 9F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9.5F, 0F, 0F, -9.5F, -1.5F, 0F, 0F, -1F); // Box 215
		leftWingModel[54].setRotationPoint(99F, -30F, 0F);

		leftWingModel[55].addShapeBox(0F, 0F, 0F, 14, 3, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		leftWingModel[55].setRotationPoint(84F, -40F, 1F);

		leftWingModel[56].addShapeBox(0F, 0F, 0F, 2, 3, 11, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 233
		leftWingModel[56].setRotationPoint(82F, -40F, 1F);

		leftWingModel[57].addShapeBox(0F, 0F, 0F, 14, 3, 33, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F); // Box 235
		leftWingModel[57].setRotationPoint(84F, -40F, 12F);

		leftWingModel[58].addShapeBox(0F, 0F, 0F, 2, 3, 33, 0F,0F, -1F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -5F, -1F, 0F); // Box 236
		leftWingModel[58].setRotationPoint(82F, -40F, 12F);

		leftWingModel[59].addShapeBox(0F, 0F, 0F, 8, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 237
		leftWingModel[59].setRotationPoint(90F, -40F, 45F);

		leftWingModel[60].addShapeBox(0F, 0F, 0F, 5, 3, 7, 0F,0F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F); // Box 238
		leftWingModel[60].setRotationPoint(87F, -40F, 45F);

		leftWingModel[61].addShapeBox(0F, 0F, 0F, 6, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, -1F, 0F); // Box 240
		leftWingModel[61].setRotationPoint(92F, -40F, 52F);

		leftWingModel[62].addShapeBox(0F, 0F, 0F, 6, 3, 4, 0F,0F, -1F, 0F, -3F, 0F, 0F, 0F, -1F, 0F, -3F, -1F, -1F, 0F, -1F, 0F, -3F, 0F, 0F, 0F, -1F, 0F, -3F, -1F, -1F); // Box 241
		leftWingModel[62].setRotationPoint(89F, -40F, 52F);

		leftWingModel[63].addShapeBox(0F, 0F, 0F, 40, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		leftWingModel[63].setRotationPoint(-32F, -29F, 11F);

		leftWingModel[64].addShapeBox(0F, 0F, 0F, 12, 8, 8, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -3F, 1F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 244
		leftWingModel[64].setRotationPoint(8F, -29F, 11F);

		leftWingModel[65].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 245
		leftWingModel[65].setRotationPoint(-40F, -29F, 11F);

		leftWingModel[66].addShapeBox(0F, 0F, 0F, 40, 8, 57, 0F,0F, -6F, 0F, 0F, -6F, 0F, -8F, 0F, 0F, 1F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, -8F, -2F, 0F, 1F, -2F, 0F); // Box 246
		leftWingModel[66].setRotationPoint(-32F, -35F, 19F);

		leftWingModel[67].addShapeBox(0F, 0F, 0F, 14, 8, 57, 0F,1F, -9F, 0F, -7F, -6F, 0F, -8F, 0F, 0F, 1F, -2F, 0F, 1F, 3F, 0F, -7F, 6F, 0F, -8F, -2F, 0F, 1F, -4F, 0F); // Box 247
		leftWingModel[67].setRotationPoint(-39F, -35F, 19F);

		leftWingModel[68].addShapeBox(0F, 0F, 0F, 33, 8, 32, 0F,0F, -3F, 0F, 0F, -3F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -5F, -4F, 0F, 0F, -4F, 0F); // Box 249
		leftWingModel[68].setRotationPoint(-33F, -38F, 76F);

		leftWingModel[69].addShapeBox(0F, 0F, 0F, 7, 8, 32, 0F,0F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -4F, 0F, 0F, -5F, 0F); // Box 250
		leftWingModel[69].setRotationPoint(-40F, -38F, 76F);

		leftWingModel[70].addShapeBox(0F, 0F, 0F, 15, 8, 32, 0F,-5F, -3F, 0F, 0F, -6F, 0F, -5F, -2F, 0F, 0F, 0F, 0F, -5F, 1F, 0F, 0F, -1F, 0F, -5F, -5F, 0F, 0F, -4F, 0F); // Box 251
		leftWingModel[70].setRotationPoint(-5F, -38F, 76F);

		leftWingModel[71].addShapeBox(0F, 0F, 0F, 28, 4, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, -2F, 0F, -9F, -2F, 0F); // Box 252
		leftWingModel[71].setRotationPoint(-33F, -38F, 108F);

		leftWingModel[72].addShapeBox(0F, 0F, 0F, 28, 4, 13, 0F,0F, -1F, 0F, -21F, 0F, 0F, -12F, 0F, 0F, -7F, 0F, -2F, 0F, -1F, 0F, -21F, 0F, 0F, -12F, -2F, 0F, -7F, -3F, -2F); // Box 253
		leftWingModel[72].setRotationPoint(-40F, -38F, 108F);

		leftWingModel[73].addShapeBox(0F, 0F, 0F, 31, 4, 13, 0F,-21F, 0F, 0F, 0F, -2F, 0F, -9F, 0F, -4F, -8F, 0F, 0F, -21F, 0F, 0F, 0F, -1F, 0F, -9F, -3F, -4F, -8F, -2F, 0F); // Box 254
		leftWingModel[73].setRotationPoint(-26F, -38F, 108F);

		leftWingModel[74].addShapeBox(0F, 0F, 0F, 20, 3, 2, 0F,0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 2F, 0F, 1F, 2F, -1F, 0F, 0F, 0F); // Box 256
		leftWingModel[74].setRotationPoint(89F, -45F, 0F);

		leftWingModel[75].addShapeBox(0F, 0F, 0F, 23, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 257
		leftWingModel[75].setRotationPoint(66F, -45F, 0F);

		leftWingModel[76].addShapeBox(0F, 0F, 0F, 23, 32, 2, 0F,-17F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -19F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 262
		leftWingModel[76].setRotationPoint(66F, -77F, 0F);

		leftWingModel[77].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, -5F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 263
		leftWingModel[77].setRotationPoint(83F, -79F, 0F);

		leftWingModel[78].addShapeBox(0F, 0F, 0F, 29, 11, 20, 0F,0F, 0F, -10F, 0F, -5F, -10F, 0F, -5F, -10F, 0F, 0F, -10F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 117
		leftWingModel[78].setRotationPoint(-34F, -4F, -105F);

		leftWingModel[79].addShapeBox(0F, 0F, 0F, 29, 10, 20, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, -2F, -10F); // Box 118
		leftWingModel[79].setRotationPoint(-34F, 4F, -105F);

		leftWingModel[80].addShapeBox(0F, 0F, 0F, 11, 8, 20, 0F,0F, -1F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, -1F, -10F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -3F); // Box 119
		leftWingModel[80].setRotationPoint(-45F, -4F, -105F);

		leftWingModel[81].addShapeBox(0F, 0F, 0F, 11, 10, 20, 0F,0F, 0F, -3F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, -5F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, -5F, -10F); // Box 120
		leftWingModel[81].setRotationPoint(-45F, 2F, -105F);

		leftWingModel[82].addShapeBox(0F, 0F, 0F, 6, 5, 14, 0F,0F, -2.9999F, -6.9999F, 0F, 0F, -6.9999F, 0F, 0F, -6.9999F, 0F, -2.9999F, -6.9999F, 0F, -1.9999F, -6.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9999F, -6.9999F); // Box 121
		leftWingModel[82].setRotationPoint(-51F, -3F, -102F);

		leftWingModel[83].addShapeBox(0F, 0F, 0F, 6, 7, 14, 0F,0F, 0F, -6.9999F, 0F, -1.9999F, 0F, 0F, -1.9999F, 0F, 0F, 0F, -6.9999F, 0F, -6.9999F, -6.9999F, 0F, 0F, -6.9999F, 0F, 0F, -6.9999F, 0F, -6.9999F, -6.9999F); // Box 122
		leftWingModel[83].setRotationPoint(-51F, 0F, -102F);

		leftWingModel[84].addShapeBox(0F, 0F, 0F, 23, 7, 20, 0F,0F, 0F, 0F, 0F, -2.9999F, -9.9999F, 0F, -2.9999F, -9.9999F, 0F, 0F, 0F, 0F, 0F, -9.9999F, 0F, -3.9999F, -9.9999F, 0F, -3.9999F, -9.9999F, 0F, 0F, -9.9999F); // Box 123
		leftWingModel[84].setRotationPoint(-5F, 7F, -105F);

		leftWingModel[85].addShapeBox(0F, 0F, 0F, 23, 9, 20, 0F,0F, 0F, -9.9999F, 0F, -8.9999F, -9.9999F, 0F, -8.9999F, -9.9999F, 0F, 0F, -9.9999F, 0F, -2.9999F, 0F, 0F, 0F, -9.9999F, 0F, 0F, -9.9999F, 0F, -2.9999F, 0F); // Box 124
		leftWingModel[85].setRotationPoint(-5F, 1F, -105F);

		leftWingModel[86].addShapeBox(0F, 0F, 0F, 2, 31, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 330
		leftWingModel[86].setRotationPoint(-34F, -33F, -96F);

		leftWingModel[87].addShapeBox(0F, 0F, 0F, 2, 34, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 331
		leftWingModel[87].setRotationPoint(-16F, -33F, -96F);

		leftWingModel[88].addShapeBox(0F, 0F, 0F, 2, 34, 2, 0F,0F, 0F, -23F, 0F, 0F, -23F, 0F, 0F, 23F, 0F, 0F, 23F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 332
		leftWingModel[88].setRotationPoint(-16F, -33F, -96F);

		leftWingModel[89].addShapeBox(0F, 0F, 0F, 2, 31, 2, 0F,0F, 0F, -22F, 0F, 0F, -22F, 0F, 0F, 22F, 0F, 0F, 22F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 333
		leftWingModel[89].setRotationPoint(-34F, -33F, -96F);

		leftWingModel[90].addShapeBox(0F, 0F, 0F, 2, 34, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 19F, 0F, 0F, -19F, 0F, 0F, -19F, 0F, 0F, 19F, 0F, 0F); // Box 334
		leftWingModel[90].setRotationPoint(-16F, -33F, -96F);

		leftWingModel[91].addShapeBox(0F, 0F, 0F, 26, 7, 1, 0F,-5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		leftWingModel[91].setRotationPoint(-34F, -25F, -46F);

		leftWingModel[92].addShapeBox(0F, 0F, 0F, 26, 7, 1, 0F,-3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F); // Box 1
		leftWingModel[92].setRotationPoint(-34F, -25F, -45F);

		leftWingModel[93].addShapeBox(0F, 0F, 0F, 15, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core_001
		leftWingModel[93].setRotationPoint(-31F, -17.5F, -47.5F);

		leftWingModel[94].addShapeBox(0F, 0F, 0F, 5, 3, 5, 0F,0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F); // Core_001
		leftWingModel[94].setRotationPoint(-36F, -16.5F, -47.5F);

		leftWingModel[95].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Core_001
		leftWingModel[95].setRotationPoint(-36.5F, -15.5F, -45.5F);

		leftWingModel[96].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Core_001
		leftWingModel[96].setRotationPoint(-10F, -18F, -45.5F);

		leftWingModel[97].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F); // Core_001
		leftWingModel[97].setRotationPoint(-7F, -18F, -45.5F);

		leftWingModel[98].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -2F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -2F, -0.4F, 0F); // Core_001
		leftWingModel[98].setRotationPoint(-10F, -15.5F, -45F);

		leftWingModel[99].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Core_001
		leftWingModel[99].setRotationPoint(-7F, -15.5F, -44F);

		leftWingModel[100].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.3F, -1.9F, 0F, -0.3F, -1.9F, 0F, -0.1F, -1.5F, 0F, -0.1F, -1.5F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F); // Core_001
		leftWingModel[100].setRotationPoint(-6F, -17F, -45F);

		leftWingModel[101].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -1.5F, 0F, -0.1F, -1.5F, 0F, -0.3F, -1.9F, 0F, -0.3F, -1.9F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F); // Core_001
		leftWingModel[101].setRotationPoint(-6F, -15F, -47F);

		leftWingModel[102].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.1F, -1.5F, 0F, -0.1F, -1.5F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.3F, -1.9F, 0F, -0.3F, -1.9F); // Core_001
		leftWingModel[102].setRotationPoint(-6F, -15F, -45F);

		leftWingModel[103].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Core_001
		leftWingModel[103].setRotationPoint(-7F, -14F, -45.5F);

		leftWingModel[104].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -2F, 0F, -0.4F); // Core_001
		leftWingModel[104].setRotationPoint(-10F, -15F, -45.5F);

		leftWingModel[105].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-2F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -2F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Core_001
		leftWingModel[105].setRotationPoint(-10F, -15.5F, -48F);

		leftWingModel[106].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F); // Core_001
		leftWingModel[106].setRotationPoint(-7F, -15.5F, -48F);

		leftWingModel[107].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.3F, -1.9F, 0F, -0.3F, -1.9F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -1.5F, 0F, -0.1F, -1.5F); // Core_001
		leftWingModel[107].setRotationPoint(-6F, -17F, -47F);

		leftWingModel[108].addBox(0F, 0F, 0F, 15, 3, 5, 0F); // Box 16
		leftWingModel[108].setRotationPoint(-31F, -16.5F, -47.5F);

		leftWingModel[109].addShapeBox(0F, 0F, 0F, 15, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 17
		leftWingModel[109].setRotationPoint(-31F, -13.5F, -47.5F);

		leftWingModel[110].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, -1.75F, -2.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1.75F, -2.25F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F); // Box 18
		leftWingModel[110].setRotationPoint(-36F, -17.5F, -47.5F);

		leftWingModel[111].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, -1.75F, -2.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1.75F, -2.25F); // Box 19
		leftWingModel[111].setRotationPoint(-36F, -13.5F, -47.5F);

		leftWingModel[112].addShapeBox(0F, 0F, 0F, 10, 3, 5, 0F,0F, 0F, 0F, 0F, -1.25F, -2F, 0F, -1.25F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, -2F, 0F, -1.25F, -2F, 0F, 0F, 0F); // Box 22
		leftWingModel[112].setRotationPoint(-16F, -16.5F, -47.5F);

		leftWingModel[113].addShapeBox(0F, 0F, 0F, 10, 1, 5, 0F,0F, 0F, -1F, 0F, -2F, -2.25F, 0F, -2F, -2.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1.25F, -2F, 0F, 1.25F, -2F, 0F, 0F, 0F); // Box 24
		leftWingModel[113].setRotationPoint(-16F, -17.5F, -47.5F);

		leftWingModel[114].addShapeBox(0F, 0F, 0F, 10, 1, 5, 0F,0F, 0F, 0F, 0F, 1.25F, -2F, 0F, 1.25F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -2.25F, 0F, -2F, -2.25F, 0F, 0F, -1F); // Box 25
		leftWingModel[114].setRotationPoint(-16F, -13.5F, -47.5F);
	}

	private void initrightWingModel_1()
	{
		rightWingModel[0] = new ModelRendererTurbo(this, 89, 545, textureX, textureY); // Box 335
		rightWingModel[1] = new ModelRendererTurbo(this, 409, 553, textureX, textureY); // Box 336
		rightWingModel[2] = new ModelRendererTurbo(this, 1, 569, textureX, textureY); // Box 337
		rightWingModel[3] = new ModelRendererTurbo(this, 169, 569, textureX, textureY); // Box 338
		rightWingModel[4] = new ModelRendererTurbo(this, 49, 569, textureX, textureY); // Box 339
		rightWingModel[5] = new ModelRendererTurbo(this, 233, 569, textureX, textureY); // Box 340
		rightWingModel[6] = new ModelRendererTurbo(this, 281, 569, textureX, textureY); // Box 341
		rightWingModel[7] = new ModelRendererTurbo(this, 73, 577, textureX, textureY); // Box 342
		rightWingModel[8] = new ModelRendererTurbo(this, 409, 537, textureX, textureY); // Box 343
		rightWingModel[9] = new ModelRendererTurbo(this, 369, 577, textureX, textureY); // Box 344
		rightWingModel[10] = new ModelRendererTurbo(this, 385, 577, textureX, textureY); // Box 345
		rightWingModel[11] = new ModelRendererTurbo(this, 401, 585, textureX, textureY); // Box 346
		rightWingModel[12] = new ModelRendererTurbo(this, 417, 585, textureX, textureY); // Box 347
		rightWingModel[13] = new ModelRendererTurbo(this, 457, 617, textureX, textureY); // Box 442
		rightWingModel[14] = new ModelRendererTurbo(this, 1, 625, textureX, textureY); // Box 443
		rightWingModel[15] = new ModelRendererTurbo(this, 177, 633, textureX, textureY); // Box 444
		rightWingModel[16] = new ModelRendererTurbo(this, 489, 481, textureX, textureY); // Box 445
		rightWingModel[17] = new ModelRendererTurbo(this, 505, 329, textureX, textureY); // Box 446
		rightWingModel[18] = new ModelRendererTurbo(this, 393, 449, textureX, textureY); // Box 447
		rightWingModel[19] = new ModelRendererTurbo(this, 409, 449, textureX, textureY); // Box 448
		rightWingModel[20] = new ModelRendererTurbo(this, 225, 465, textureX, textureY); // Box 449
		rightWingModel[21] = new ModelRendererTurbo(this, 1, 473, textureX, textureY); // Box 450
		rightWingModel[22] = new ModelRendererTurbo(this, 1, 481, textureX, textureY); // Box 451
		rightWingModel[23] = new ModelRendererTurbo(this, 353, 481, textureX, textureY); // Box 452
		rightWingModel[24] = new ModelRendererTurbo(this, 433, 481, textureX, textureY); // Box 453
		rightWingModel[25] = new ModelRendererTurbo(this, 417, 489, textureX, textureY); // Box 454
		rightWingModel[26] = new ModelRendererTurbo(this, 433, 489, textureX, textureY); // Box 455
		rightWingModel[27] = new ModelRendererTurbo(this, 1, 505, textureX, textureY); // Box 456
		rightWingModel[28] = new ModelRendererTurbo(this, 1, 513, textureX, textureY); // Box 457
		rightWingModel[29] = new ModelRendererTurbo(this, 105, 513, textureX, textureY); // Box 458
		rightWingModel[30] = new ModelRendererTurbo(this, 225, 633, textureX, textureY); // Box 459
		rightWingModel[31] = new ModelRendererTurbo(this, 273, 633, textureX, textureY); // Box 460
		rightWingModel[32] = new ModelRendererTurbo(this, 49, 537, textureX, textureY); // Box 461
		rightWingModel[33] = new ModelRendererTurbo(this, 257, 545, textureX, textureY); // Box 462
		rightWingModel[34] = new ModelRendererTurbo(this, 265, 569, textureX, textureY); // Box 463
		rightWingModel[35] = new ModelRendererTurbo(this, 369, 617, textureX, textureY); // Box 464
		rightWingModel[36] = new ModelRendererTurbo(this, 369, 625, textureX, textureY); // Box 465

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 29, 11, 20, 0F,0F, 0F, -10F, 0F, -5F, -10F, 0F, -5F, -10F, 0F, 0F, -10F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 335
		rightWingModel[0].setRotationPoint(-34F, -4F, 85F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 29, 10, 20, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, -2F, -10F); // Box 336
		rightWingModel[1].setRotationPoint(-34F, 4F, 85F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 11, 8, 20, 0F,0F, -1F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, -1F, -10F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -3F); // Box 337
		rightWingModel[2].setRotationPoint(-45F, -4F, 85F);

		rightWingModel[3].addShapeBox(0F, 0F, 0F, 11, 10, 20, 0F,0F, 0F, -3F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, -5F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, -5F, -10F); // Box 338
		rightWingModel[3].setRotationPoint(-45F, 2F, 85F);

		rightWingModel[4].addShapeBox(0F, 0F, 0F, 6, 5, 14, 0F,0F, -2.9999F, -6.9999F, 0F, 0F, -6.9999F, 0F, 0F, -6.9999F, 0F, -2.9999F, -6.9999F, 0F, -1.9999F, -6.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9999F, -6.9999F); // Box 339
		rightWingModel[4].setRotationPoint(-51F, -3F, 88F);

		rightWingModel[5].addShapeBox(0F, 0F, 0F, 6, 7, 14, 0F,0F, 0F, -6.9999F, 0F, -1.9999F, 0F, 0F, -1.9999F, 0F, 0F, 0F, -6.9999F, 0F, -6.9999F, -6.9999F, 0F, 0F, -6.9999F, 0F, 0F, -6.9999F, 0F, -6.9999F, -6.9999F); // Box 340
		rightWingModel[5].setRotationPoint(-51F, 0F, 88F);

		rightWingModel[6].addShapeBox(0F, 0F, 0F, 23, 7, 20, 0F,0F, 0F, 0F, 0F, -2.9999F, -9.9999F, 0F, -2.9999F, -9.9999F, 0F, 0F, 0F, 0F, 0F, -9.9999F, 0F, -3.9999F, -9.9999F, 0F, -3.9999F, -9.9999F, 0F, 0F, -9.9999F); // Box 341
		rightWingModel[6].setRotationPoint(-5F, 7F, 85F);

		rightWingModel[7].addShapeBox(0F, 0F, 0F, 23, 9, 20, 0F,0F, 0F, -9.9999F, 0F, -8.9999F, -9.9999F, 0F, -8.9999F, -9.9999F, 0F, 0F, -9.9999F, 0F, -2.9999F, 0F, 0F, 0F, -9.9999F, 0F, 0F, -9.9999F, 0F, -2.9999F, 0F); // Box 342
		rightWingModel[7].setRotationPoint(-5F, 1F, 85F);

		rightWingModel[8].addShapeBox(0F, 0F, 0F, 2, 31, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 343
		rightWingModel[8].setRotationPoint(-34F, -33F, 94F);

		rightWingModel[9].addShapeBox(0F, 0F, 0F, 2, 34, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 344
		rightWingModel[9].setRotationPoint(-16F, -33F, 94F);

		rightWingModel[10].addShapeBox(0F, 0F, 0F, 2, 34, 2, 0F,0F, 0F, 23F, 0F, 0F, 23F, 0F, 0F, -23F, 0F, 0F, -23F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 345
		rightWingModel[10].setRotationPoint(-16F, -33F, 94F);

		rightWingModel[11].addShapeBox(0F, 0F, 0F, 2, 31, 2, 0F,0F, 0F, 22F, 0F, 0F, 22F, 0F, 0F, -22F, 0F, 0F, -22F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 346
		rightWingModel[11].setRotationPoint(-34F, -33F, 94F);

		rightWingModel[12].addShapeBox(0F, 0F, 0F, 2, 34, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 19F, 0F, 0F, -19F, 0F, 0F, -19F, 0F, 0F, 19F, 0F, 0F); // Box 347
		rightWingModel[12].setRotationPoint(-16F, -33F, 94F);

		rightWingModel[13].addShapeBox(0F, 0F, 0F, 26, 7, 1, 0F,-3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F); // Box 442
		rightWingModel[13].setRotationPoint(-34F, -25F, 45F);

		rightWingModel[14].addShapeBox(0F, 0F, 0F, 26, 7, 1, 0F,-5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 443
		rightWingModel[14].setRotationPoint(-34F, -25F, 44F);

		rightWingModel[15].addShapeBox(0F, 0F, 0F, 15, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 444
		rightWingModel[15].setRotationPoint(-31F, -17.5F, 42.5F);

		rightWingModel[16].addShapeBox(0F, 0F, 0F, 5, 3, 5, 0F,0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F); // Box 445
		rightWingModel[16].setRotationPoint(-36F, -16.5F, 42.5F);

		rightWingModel[17].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 446
		rightWingModel[17].setRotationPoint(-36.5F, -15.5F, 44.5F);

		rightWingModel[18].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 447
		rightWingModel[18].setRotationPoint(-10F, -18F, 44.5F);

		rightWingModel[19].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F); // Box 448
		rightWingModel[19].setRotationPoint(-7F, -18F, 44.5F);

		rightWingModel[20].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-2F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -2F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 449
		rightWingModel[20].setRotationPoint(-10F, -15.5F, 42F);

		rightWingModel[21].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F); // Box 450
		rightWingModel[21].setRotationPoint(-7F, -15.5F, 42F);

		rightWingModel[22].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.3F, -1.9F, 0F, -0.3F, -1.9F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -1.5F, 0F, -0.1F, -1.5F); // Box 451
		rightWingModel[22].setRotationPoint(-6F, -17F, 43F);

		rightWingModel[23].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.1F, -1.5F, 0F, -0.1F, -1.5F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.3F, -1.9F, 0F, -0.3F, -1.9F); // Box 452
		rightWingModel[23].setRotationPoint(-6F, -15F, 45F);

		rightWingModel[24].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -1.5F, 0F, -0.1F, -1.5F, 0F, -0.3F, -1.9F, 0F, -0.3F, -1.9F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F); // Box 453
		rightWingModel[24].setRotationPoint(-6F, -15F, 43F);

		rightWingModel[25].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 454
		rightWingModel[25].setRotationPoint(-7F, -14F, 44.5F);

		rightWingModel[26].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -2F, 0F, -0.4F); // Box 455
		rightWingModel[26].setRotationPoint(-10F, -15F, 44.5F);

		rightWingModel[27].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -2F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -2F, -0.4F, 0F); // Box 456
		rightWingModel[27].setRotationPoint(-10F, -15.5F, 45F);

		rightWingModel[28].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 457
		rightWingModel[28].setRotationPoint(-7F, -15.5F, 46F);

		rightWingModel[29].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.3F, -1.9F, 0F, -0.3F, -1.9F, 0F, -0.1F, -1.5F, 0F, -0.1F, -1.5F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F); // Box 458
		rightWingModel[29].setRotationPoint(-6F, -17F, 45F);

		rightWingModel[30].addBox(0F, 0F, 0F, 15, 3, 5, 0F); // Box 459
		rightWingModel[30].setRotationPoint(-31F, -16.5F, 42.5F);

		rightWingModel[31].addShapeBox(0F, 0F, 0F, 15, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 460
		rightWingModel[31].setRotationPoint(-31F, -13.5F, 42.5F);

		rightWingModel[32].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, -1.75F, -2.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1.75F, -2.25F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F); // Box 461
		rightWingModel[32].setRotationPoint(-36F, -17.5F, 42.5F);

		rightWingModel[33].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, -1.75F, -2.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1.75F, -2.25F); // Box 462
		rightWingModel[33].setRotationPoint(-36F, -13.5F, 42.5F);

		rightWingModel[34].addShapeBox(0F, 0F, 0F, 10, 3, 5, 0F,0F, 0F, 0F, 0F, -1.25F, -2F, 0F, -1.25F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, -2F, 0F, -1.25F, -2F, 0F, 0F, 0F); // Box 463
		rightWingModel[34].setRotationPoint(-16F, -16.5F, 42.5F);

		rightWingModel[35].addShapeBox(0F, 0F, 0F, 10, 1, 5, 0F,0F, 0F, -1F, 0F, -2F, -2.25F, 0F, -2F, -2.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1.25F, -2F, 0F, 1.25F, -2F, 0F, 0F, 0F); // Box 464
		rightWingModel[35].setRotationPoint(-16F, -17.5F, 42.5F);

		rightWingModel[36].addShapeBox(0F, 0F, 0F, 10, 1, 5, 0F,0F, 0F, 0F, 0F, 1.25F, -2F, 0F, 1.25F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -2.25F, 0F, -2F, -2.25F, 0F, 0F, -1F); // Box 465
		rightWingModel[36].setRotationPoint(-16F, -13.5F, 42.5F);
	}

	private void inityawFlapModel_1()
	{
		yawFlapModel[0] = new ModelRendererTurbo(this, 209, 153, textureX, textureY); // Box 110
		yawFlapModel[1] = new ModelRendererTurbo(this, 473, 89, textureX, textureY); // Box 111
		yawFlapModel[2] = new ModelRendererTurbo(this, 377, 105, textureX, textureY); // Box 112
		yawFlapModel[3] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 113
		yawFlapModel[4] = new ModelRendererTurbo(this, 1, 361, textureX, textureY); // Box 258
		yawFlapModel[5] = new ModelRendererTurbo(this, 385, 289, textureX, textureY); // Box 259
		yawFlapModel[6] = new ModelRendererTurbo(this, 1, 297, textureX, textureY); // Box 260
		yawFlapModel[7] = new ModelRendererTurbo(this, 377, 113, textureX, textureY); // Box 261

		yawFlapModel[0].addShapeBox(0F, 0F, 0F, 18, 23, 2, 0F,0F, 0F, 0F, -6F, 0F, -1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		yawFlapModel[0].setRotationPoint(89F, -68F, -2F);

		yawFlapModel[1].addShapeBox(0F, 0F, 0F, 13, 5, 2, 0F,0F, 0F, 0F, -3F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		yawFlapModel[1].setRotationPoint(89F, -73F, -2F);

		yawFlapModel[2].addShapeBox(0F, 0F, 0F, 11, 4, 2, 0F,0F, 0F, 0F, -5F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		yawFlapModel[2].setRotationPoint(89F, -77F, -2F);

		yawFlapModel[3].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,0F, -1F, -1F, -5F, -1F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		yawFlapModel[3].setRotationPoint(89F, -79F, -2F);

		yawFlapModel[4].addShapeBox(0F, 0F, 0F, 18, 23, 2, 0F,0F, 0F, 0F, -5F, 0F, 0F, -6F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F); // Box 258
		yawFlapModel[4].setRotationPoint(89F, -68F, 0F);

		yawFlapModel[5].addShapeBox(0F, 0F, 0F, 13, 5, 2, 0F,0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F); // Box 259
		yawFlapModel[5].setRotationPoint(89F, -73F, 0F);

		yawFlapModel[6].addShapeBox(0F, 0F, 0F, 11, 4, 2, 0F,0F, 0F, 0F, -4F, 0F, 0F, -5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F); // Box 260
		yawFlapModel[6].setRotationPoint(89F, -77F, 0F);

		yawFlapModel[7].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,0F, 0F, 0F, -4F, 0F, 0F, -5F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F); // Box 261
		yawFlapModel[7].setRotationPoint(89F, -79F, 0F);
	}

	private void initpitchFlapLeftModel_1()
	{
		pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 121, 113, textureX, textureY); // Box 83
		pitchFlapLeftModel[1] = new ModelRendererTurbo(this, 145, 113, textureX, textureY); // Box 86
		pitchFlapLeftModel[2] = new ModelRendererTurbo(this, 209, 121, textureX, textureY); // Box 91
		pitchFlapLeftModel[3] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 94
		pitchFlapLeftModel[4] = new ModelRendererTurbo(this, 273, 329, textureX, textureY); // Box 231
		pitchFlapLeftModel[5] = new ModelRendererTurbo(this, 353, 329, textureX, textureY); // Box 234
		pitchFlapLeftModel[6] = new ModelRendererTurbo(this, 457, 329, textureX, textureY); // Box 239
		pitchFlapLeftModel[7] = new ModelRendererTurbo(this, 241, 105, textureX, textureY); // Box 242

		pitchFlapLeftModel[0].addShapeBox(0F, 0F, 0F, 14, 3, 12, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 83
		pitchFlapLeftModel[0].setRotationPoint(98F, -40F, -12F);

		pitchFlapLeftModel[1].addShapeBox(0F, 0F, 0F, 14, 3, 33, 0F,0F, 0F, 0F, -6F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 86
		pitchFlapLeftModel[1].setRotationPoint(98F, -40F, -45F);

		pitchFlapLeftModel[2].addShapeBox(0F, 0F, 0F, 8, 3, 7, 0F,0F, 0F, 0F, -3F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 91
		pitchFlapLeftModel[2].setRotationPoint(98F, -40F, -52F);

		pitchFlapLeftModel[3].addShapeBox(0F, 0F, 0F, 5, 3, 4, 0F,0F, -1F, 0F, -2F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 94
		pitchFlapLeftModel[3].setRotationPoint(98F, -40F, -56F);

		pitchFlapLeftModel[4].addShapeBox(0F, 0F, 0F, 14, 3, 12, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 231
		pitchFlapLeftModel[4].setRotationPoint(98F, -40F, 0F);

		pitchFlapLeftModel[5].addShapeBox(0F, 0F, 0F, 14, 3, 33, 0F,0F, 0F, 0F, 0F, -1F, 0F, -6F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -6F, -1F, 0F, 0F, 0F, 0F); // Box 234
		pitchFlapLeftModel[5].setRotationPoint(98F, -40F, 12F);

		pitchFlapLeftModel[6].addShapeBox(0F, 0F, 0F, 8, 3, 7, 0F,0F, 0F, 0F, 0F, -1F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, -1F, 0F, 0F, 0F, 0F); // Box 239
		pitchFlapLeftModel[6].setRotationPoint(98F, -40F, 45F);

		pitchFlapLeftModel[7].addShapeBox(0F, 0F, 0F, 5, 3, 4, 0F,0F, 0F, 0F, 0F, -1F, 0F, -2F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -1F, -1F, 0F, -1F, 0F); // Box 242
		pitchFlapLeftModel[7].setRotationPoint(98F, -40F, 52F);
	}

	private void initpitchFlapLeftWingModel_1()
	{
		pitchFlapLeftWingModel[0] = new ModelRendererTurbo(this, 353, 161, textureX, textureY); // Box 100
		pitchFlapLeftWingModel[1] = new ModelRendererTurbo(this, 329, 377, textureX, textureY); // Box 248

		pitchFlapLeftWingModel[0].addShapeBox(0F, 0F, 0F, 20, 8, 57, 0F,0F, 0F, 0F, -10F, -3F, 0F, 0F, -10F, 0F, -8F, -6F, 0F, 0F, -2F, 0F, -10F, -4F, 0F, 0F, 3F, 0F, -8F, 6F, 0F); // Box 100
		pitchFlapLeftWingModel[0].setRotationPoint(0F, -35F, -76F);

		pitchFlapLeftWingModel[1].addShapeBox(0F, 0F, 0F, 20, 8, 57, 0F,-8F, -6F, 0F, 0F, -10F, 0F, -10F, -3F, 0F, 0F, 0F, 0F, -8F, 6F, 0F, 0F, 3F, 0F, -10F, -4F, 0F, 0F, -2F, 0F); // Box 248
		pitchFlapLeftWingModel[1].setRotationPoint(0F, -35F, 19F);
	}

	private void initPropeller()
	{
		propellerModels = new ModelRendererTurbo[1][2];
		propellerModels[0] = makeProp1(-86F, -28F, 0F);
	}

	private ModelRendererTurbo[] makeProp1(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[2];
		prop[0] = new ModelRendererTurbo(this, 0, 638, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 638, textureX, textureY);
		prop[0].addBox(-1F, -27F, -2F, 2, 27, 4, 0.0F);
		prop[1].addBox(-1F, -27F, -2F, 2, 27, 4, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		return prop;
	}
}