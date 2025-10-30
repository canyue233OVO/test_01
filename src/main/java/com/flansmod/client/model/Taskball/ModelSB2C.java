//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: SB2C
// Model Creator: TaskForce51
// Created on: 06.04.2023 - 03:02:34
// Last changed on: 06.04.2023 - 03:02:34

package com.flansmod.client.model.Taskball; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelSB2C extends ModelPlane //Same as Filename
{
	int textureX = 2048;
	int textureY = 1024;

	public ModelSB2C() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[449];
		noseModel = new ModelRendererTurbo[103];
		tailModel = new ModelRendererTurbo[73];
		leftWingModel = new ModelRendererTurbo[20];
		rightWingModel = new ModelRendererTurbo[15];
		yawFlapModel = new ModelRendererTurbo[12];
		pitchFlapLeftModel = new ModelRendererTurbo[1];
		pitchFlapRightModel = new ModelRendererTurbo[1];
		pitchFlapLeftWingModel = new ModelRendererTurbo[1];
		pitchFlapRightWingModel = new ModelRendererTurbo[1];
		tailWheelModel = new ModelRendererTurbo[9];
		leftWingWheelModel = new ModelRendererTurbo[9];
		rightWingWheelModel = new ModelRendererTurbo[9];

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

		initPropeller();

		initGuns();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 924, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 41, 924, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 81, 924, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 105, 924, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 169, 924, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 225, 924, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 289, 924, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 337, 924, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 385, 924, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 425, 924, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 457, 924, textureX, textureY); // Box 10
		bodyModel[11] = new ModelRendererTurbo(this, 521, 924, textureX, textureY); // Box 11
		bodyModel[12] = new ModelRendererTurbo(this, 593, 924, textureX, textureY); // Box 12
		bodyModel[13] = new ModelRendererTurbo(this, 665, 924, textureX, textureY); // Box 13
		bodyModel[14] = new ModelRendererTurbo(this, 737, 924, textureX, textureY); // Box 14
		bodyModel[15] = new ModelRendererTurbo(this, 1, 874, textureX, textureY); // Box 25
		bodyModel[16] = new ModelRendererTurbo(this, 121, 874, textureX, textureY); // Box 26
		bodyModel[17] = new ModelRendererTurbo(this, 233, 874, textureX, textureY); // Box 27
		bodyModel[18] = new ModelRendererTurbo(this, 353, 874, textureX, textureY); // Box 28
		bodyModel[19] = new ModelRendererTurbo(this, 473, 874, textureX, textureY); // Box 29
		bodyModel[20] = new ModelRendererTurbo(this, 1, 824, textureX, textureY); // Box 30
		bodyModel[21] = new ModelRendererTurbo(this, 65, 824, textureX, textureY); // Box 31
		bodyModel[22] = new ModelRendererTurbo(this, 129, 824, textureX, textureY); // Box 32
		bodyModel[23] = new ModelRendererTurbo(this, 593, 874, textureX, textureY); // Box 33
		bodyModel[24] = new ModelRendererTurbo(this, 705, 874, textureX, textureY); // Box 34
		bodyModel[25] = new ModelRendererTurbo(this, 801, 874, textureX, textureY); // Box 35
		bodyModel[26] = new ModelRendererTurbo(this, 793, 924, textureX, textureY); // Box 36
		bodyModel[27] = new ModelRendererTurbo(this, 825, 924, textureX, textureY); // Box 37
		bodyModel[28] = new ModelRendererTurbo(this, 169, 824, textureX, textureY); // Box 40
		bodyModel[29] = new ModelRendererTurbo(this, 257, 824, textureX, textureY); // Box 41
		bodyModel[30] = new ModelRendererTurbo(this, 345, 824, textureX, textureY); // Box 42
		bodyModel[31] = new ModelRendererTurbo(this, 417, 824, textureX, textureY); // Box 43
		bodyModel[32] = new ModelRendererTurbo(this, 473, 824, textureX, textureY); // Box 44
		bodyModel[33] = new ModelRendererTurbo(this, 561, 824, textureX, textureY); // Box 45
		bodyModel[34] = new ModelRendererTurbo(this, 153, 924, textureX, textureY); // Box 46
		bodyModel[35] = new ModelRendererTurbo(this, 873, 924, textureX, textureY); // Box 47
		bodyModel[36] = new ModelRendererTurbo(this, 649, 824, textureX, textureY); // Box 50
		bodyModel[37] = new ModelRendererTurbo(this, 737, 824, textureX, textureY); // Box 57
		bodyModel[38] = new ModelRendererTurbo(this, 817, 824, textureX, textureY); // Box 58
		bodyModel[39] = new ModelRendererTurbo(this, 273, 924, textureX, textureY); // Box 89
		bodyModel[40] = new ModelRendererTurbo(this, 57, 824, textureX, textureY); // Box 97
		bodyModel[41] = new ModelRendererTurbo(this, 121, 824, textureX, textureY); // Box 98
		bodyModel[42] = new ModelRendererTurbo(this, 241, 824, textureX, textureY); // Box 99
		bodyModel[43] = new ModelRendererTurbo(this, 249, 824, textureX, textureY); // Box 100
		bodyModel[44] = new ModelRendererTurbo(this, 257, 824, textureX, textureY); // Box 101
		bodyModel[45] = new ModelRendererTurbo(this, 881, 824, textureX, textureY); // Box 102
		bodyModel[46] = new ModelRendererTurbo(this, 329, 824, textureX, textureY); // Box 103
		bodyModel[47] = new ModelRendererTurbo(this, 345, 824, textureX, textureY); // Box 104
		bodyModel[48] = new ModelRendererTurbo(this, 545, 824, textureX, textureY); // Box 109
		bodyModel[49] = new ModelRendererTurbo(this, 561, 824, textureX, textureY); // Box 110
		bodyModel[50] = new ModelRendererTurbo(this, 633, 824, textureX, textureY); // Box 113
		bodyModel[51] = new ModelRendererTurbo(this, 649, 824, textureX, textureY); // Box 114
		bodyModel[52] = new ModelRendererTurbo(this, 937, 824, textureX, textureY); // Box 115
		bodyModel[53] = new ModelRendererTurbo(this, 177, 924, textureX, textureY); // Box 116
		bodyModel[54] = new ModelRendererTurbo(this, 217, 924, textureX, textureY); // Box 117
		bodyModel[55] = new ModelRendererTurbo(this, 225, 924, textureX, textureY); // Box 118
		bodyModel[56] = new ModelRendererTurbo(this, 505, 924, textureX, textureY); // Box 119
		bodyModel[57] = new ModelRendererTurbo(this, 521, 924, textureX, textureY); // Box 120
		bodyModel[58] = new ModelRendererTurbo(this, 577, 924, textureX, textureY); // Box 121
		bodyModel[59] = new ModelRendererTurbo(this, 649, 924, textureX, textureY); // Box 122
		bodyModel[60] = new ModelRendererTurbo(this, 1001, 824, textureX, textureY); // Box 141
		bodyModel[61] = new ModelRendererTurbo(this, 721, 824, textureX, textureY); // Box 142
		bodyModel[62] = new ModelRendererTurbo(this, 737, 824, textureX, textureY); // Box 143
		bodyModel[63] = new ModelRendererTurbo(this, 801, 824, textureX, textureY); // Box 144
		bodyModel[64] = new ModelRendererTurbo(this, 1, 824, textureX, textureY); // Box 145
		bodyModel[65] = new ModelRendererTurbo(this, 817, 824, textureX, textureY); // Box 146
		bodyModel[66] = new ModelRendererTurbo(this, 65, 824, textureX, textureY); // Box 147
		bodyModel[67] = new ModelRendererTurbo(this, 1049, 824, textureX, textureY); // Box 148
		bodyModel[68] = new ModelRendererTurbo(this, 265, 824, textureX, textureY); // Box 149
		bodyModel[69] = new ModelRendererTurbo(this, 1065, 824, textureX, textureY); // Box 150
		bodyModel[70] = new ModelRendererTurbo(this, 337, 824, textureX, textureY); // Box 151
		bodyModel[71] = new ModelRendererTurbo(this, 1, 949, textureX, textureY); // Box 162
		bodyModel[72] = new ModelRendererTurbo(this, 41, 949, textureX, textureY); // Box 163
		bodyModel[73] = new ModelRendererTurbo(this, 81, 949, textureX, textureY); // Box 164
		bodyModel[74] = new ModelRendererTurbo(this, 105, 949, textureX, textureY); // Box 165
		bodyModel[75] = new ModelRendererTurbo(this, 169, 949, textureX, textureY); // Box 166
		bodyModel[76] = new ModelRendererTurbo(this, 225, 949, textureX, textureY); // Box 167
		bodyModel[77] = new ModelRendererTurbo(this, 289, 949, textureX, textureY); // Box 168
		bodyModel[78] = new ModelRendererTurbo(this, 337, 949, textureX, textureY); // Box 169
		bodyModel[79] = new ModelRendererTurbo(this, 385, 949, textureX, textureY); // Box 170
		bodyModel[80] = new ModelRendererTurbo(this, 425, 949, textureX, textureY); // Box 171
		bodyModel[81] = new ModelRendererTurbo(this, 457, 949, textureX, textureY); // Box 172
		bodyModel[82] = new ModelRendererTurbo(this, 521, 949, textureX, textureY); // Box 173
		bodyModel[83] = new ModelRendererTurbo(this, 593, 949, textureX, textureY); // Box 174
		bodyModel[84] = new ModelRendererTurbo(this, 665, 949, textureX, textureY); // Box 175
		bodyModel[85] = new ModelRendererTurbo(this, 737, 949, textureX, textureY); // Box 176
		bodyModel[86] = new ModelRendererTurbo(this, 1, 899, textureX, textureY); // Box 187
		bodyModel[87] = new ModelRendererTurbo(this, 121, 899, textureX, textureY); // Box 188
		bodyModel[88] = new ModelRendererTurbo(this, 233, 899, textureX, textureY); // Box 189
		bodyModel[89] = new ModelRendererTurbo(this, 353, 899, textureX, textureY); // Box 190
		bodyModel[90] = new ModelRendererTurbo(this, 473, 899, textureX, textureY); // Box 191
		bodyModel[91] = new ModelRendererTurbo(this, 1, 849, textureX, textureY); // Box 192
		bodyModel[92] = new ModelRendererTurbo(this, 65, 849, textureX, textureY); // Box 193
		bodyModel[93] = new ModelRendererTurbo(this, 129, 849, textureX, textureY); // Box 194
		bodyModel[94] = new ModelRendererTurbo(this, 593, 899, textureX, textureY); // Box 195
		bodyModel[95] = new ModelRendererTurbo(this, 705, 899, textureX, textureY); // Box 196
		bodyModel[96] = new ModelRendererTurbo(this, 801, 899, textureX, textureY); // Box 197
		bodyModel[97] = new ModelRendererTurbo(this, 793, 949, textureX, textureY); // Box 198
		bodyModel[98] = new ModelRendererTurbo(this, 825, 949, textureX, textureY); // Box 199
		bodyModel[99] = new ModelRendererTurbo(this, 169, 849, textureX, textureY); // Box 202
		bodyModel[100] = new ModelRendererTurbo(this, 257, 849, textureX, textureY); // Box 203
		bodyModel[101] = new ModelRendererTurbo(this, 345, 849, textureX, textureY); // Box 204
		bodyModel[102] = new ModelRendererTurbo(this, 417, 849, textureX, textureY); // Box 205
		bodyModel[103] = new ModelRendererTurbo(this, 473, 849, textureX, textureY); // Box 206
		bodyModel[104] = new ModelRendererTurbo(this, 561, 849, textureX, textureY); // Box 207
		bodyModel[105] = new ModelRendererTurbo(this, 153, 949, textureX, textureY); // Box 208
		bodyModel[106] = new ModelRendererTurbo(this, 873, 949, textureX, textureY); // Box 209
		bodyModel[107] = new ModelRendererTurbo(this, 649, 849, textureX, textureY); // Box 212
		bodyModel[108] = new ModelRendererTurbo(this, 737, 849, textureX, textureY); // Box 219
		bodyModel[109] = new ModelRendererTurbo(this, 817, 849, textureX, textureY); // Box 220
		bodyModel[110] = new ModelRendererTurbo(this, 273, 949, textureX, textureY); // Box 251
		bodyModel[111] = new ModelRendererTurbo(this, 57, 849, textureX, textureY); // Box 259
		bodyModel[112] = new ModelRendererTurbo(this, 121, 849, textureX, textureY); // Box 260
		bodyModel[113] = new ModelRendererTurbo(this, 241, 849, textureX, textureY); // Box 261
		bodyModel[114] = new ModelRendererTurbo(this, 249, 849, textureX, textureY); // Box 262
		bodyModel[115] = new ModelRendererTurbo(this, 257, 849, textureX, textureY); // Box 263
		bodyModel[116] = new ModelRendererTurbo(this, 881, 849, textureX, textureY); // Box 264
		bodyModel[117] = new ModelRendererTurbo(this, 329, 849, textureX, textureY); // Box 265
		bodyModel[118] = new ModelRendererTurbo(this, 345, 849, textureX, textureY); // Box 266
		bodyModel[119] = new ModelRendererTurbo(this, 545, 849, textureX, textureY); // Box 267
		bodyModel[120] = new ModelRendererTurbo(this, 561, 849, textureX, textureY); // Box 268
		bodyModel[121] = new ModelRendererTurbo(this, 633, 849, textureX, textureY); // Box 269
		bodyModel[122] = new ModelRendererTurbo(this, 649, 849, textureX, textureY); // Box 270
		bodyModel[123] = new ModelRendererTurbo(this, 937, 849, textureX, textureY); // Box 271
		bodyModel[124] = new ModelRendererTurbo(this, 177, 949, textureX, textureY); // Box 272
		bodyModel[125] = new ModelRendererTurbo(this, 217, 949, textureX, textureY); // Box 273
		bodyModel[126] = new ModelRendererTurbo(this, 225, 949, textureX, textureY); // Box 274
		bodyModel[127] = new ModelRendererTurbo(this, 505, 949, textureX, textureY); // Box 275
		bodyModel[128] = new ModelRendererTurbo(this, 521, 949, textureX, textureY); // Box 276
		bodyModel[129] = new ModelRendererTurbo(this, 577, 949, textureX, textureY); // Box 277
		bodyModel[130] = new ModelRendererTurbo(this, 649, 949, textureX, textureY); // Box 278
		bodyModel[131] = new ModelRendererTurbo(this, 1001, 849, textureX, textureY); // Box 297
		bodyModel[132] = new ModelRendererTurbo(this, 721, 849, textureX, textureY); // Box 298
		bodyModel[133] = new ModelRendererTurbo(this, 737, 849, textureX, textureY); // Box 299
		bodyModel[134] = new ModelRendererTurbo(this, 801, 849, textureX, textureY); // Box 300
		bodyModel[135] = new ModelRendererTurbo(this, 1, 849, textureX, textureY); // Box 301
		bodyModel[136] = new ModelRendererTurbo(this, 817, 849, textureX, textureY); // Box 302
		bodyModel[137] = new ModelRendererTurbo(this, 65, 849, textureX, textureY); // Box 303
		bodyModel[138] = new ModelRendererTurbo(this, 1049, 849, textureX, textureY); // Box 304
		bodyModel[139] = new ModelRendererTurbo(this, 265, 849, textureX, textureY); // Box 305
		bodyModel[140] = new ModelRendererTurbo(this, 1065, 849, textureX, textureY); // Box 306
		bodyModel[141] = new ModelRendererTurbo(this, 337, 849, textureX, textureY); // Box 307
		bodyModel[142] = new ModelRendererTurbo(this, 929, 924, textureX, textureY); // Box 280
		bodyModel[143] = new ModelRendererTurbo(this, 1, 415, textureX, textureY); // Box 262
		bodyModel[144] = new ModelRendererTurbo(this, 65, 415, textureX, textureY); // Box 255
		bodyModel[145] = new ModelRendererTurbo(this, 121, 415, textureX, textureY); // Box 257
		bodyModel[146] = new ModelRendererTurbo(this, 41, 415, textureX, textureY); // Box 258
		bodyModel[147] = new ModelRendererTurbo(this, 1, 415, textureX, textureY); // Box 213
		bodyModel[148] = new ModelRendererTurbo(this, 41, 415, textureX, textureY); // Box 214
		bodyModel[149] = new ModelRendererTurbo(this, 1, 415, textureX, textureY); // Box 233
		bodyModel[150] = new ModelRendererTurbo(this, 17, 415, textureX, textureY); // Box 234
		bodyModel[151] = new ModelRendererTurbo(this, 41, 415, textureX, textureY); // Box 235
		bodyModel[152] = new ModelRendererTurbo(this, 57, 415, textureX, textureY); // Box 236
		bodyModel[153] = new ModelRendererTurbo(this, 73, 415, textureX, textureY); // Box 237
		bodyModel[154] = new ModelRendererTurbo(this, 81, 415, textureX, textureY); // Box 238
		bodyModel[155] = new ModelRendererTurbo(this, 97, 415, textureX, textureY); // Box 239
		bodyModel[156] = new ModelRendererTurbo(this, 105, 415, textureX, textureY); // Box 240
		bodyModel[157] = new ModelRendererTurbo(this, 113, 415, textureX, textureY); // Box 241
		bodyModel[158] = new ModelRendererTurbo(this, 121, 415, textureX, textureY); // Box 242
		bodyModel[159] = new ModelRendererTurbo(this, 129, 415, textureX, textureY); // Box 243
		bodyModel[160] = new ModelRendererTurbo(this, 137, 415, textureX, textureY); // Box 244
		bodyModel[161] = new ModelRendererTurbo(this, 153, 415, textureX, textureY); // Box 248
		bodyModel[162] = new ModelRendererTurbo(this, 161, 415, textureX, textureY); // Box 249
		bodyModel[163] = new ModelRendererTurbo(this, 169, 415, textureX, textureY); // Box 250
		bodyModel[164] = new ModelRendererTurbo(this, 177, 415, textureX, textureY); // Box 251
		bodyModel[165] = new ModelRendererTurbo(this, 185, 415, textureX, textureY); // Box 252
		bodyModel[166] = new ModelRendererTurbo(this, 193, 415, textureX, textureY); // Box 253
		bodyModel[167] = new ModelRendererTurbo(this, 201, 415, textureX, textureY); // Box 254
		bodyModel[168] = new ModelRendererTurbo(this, 209, 415, textureX, textureY); // Box 255
		bodyModel[169] = new ModelRendererTurbo(this, 217, 415, textureX, textureY); // Box 256
		bodyModel[170] = new ModelRendererTurbo(this, 225, 415, textureX, textureY); // Box 257
		bodyModel[171] = new ModelRendererTurbo(this, 233, 415, textureX, textureY); // Box 258
		bodyModel[172] = new ModelRendererTurbo(this, 241, 415, textureX, textureY); // Box 259
		bodyModel[173] = new ModelRendererTurbo(this, 249, 415, textureX, textureY); // Box 260
		bodyModel[174] = new ModelRendererTurbo(this, 257, 415, textureX, textureY); // Box 261
		bodyModel[175] = new ModelRendererTurbo(this, 265, 415, textureX, textureY); // Box 262
		bodyModel[176] = new ModelRendererTurbo(this, 273, 415, textureX, textureY); // Box 263
		bodyModel[177] = new ModelRendererTurbo(this, 281, 415, textureX, textureY); // Box 265
		bodyModel[178] = new ModelRendererTurbo(this, 289, 415, textureX, textureY); // Box 266
		bodyModel[179] = new ModelRendererTurbo(this, 297, 415, textureX, textureY); // Box 267
		bodyModel[180] = new ModelRendererTurbo(this, 305, 415, textureX, textureY); // Box 268
		bodyModel[181] = new ModelRendererTurbo(this, 313, 415, textureX, textureY); // Box 269
		bodyModel[182] = new ModelRendererTurbo(this, 321, 415, textureX, textureY); // Box 270
		bodyModel[183] = new ModelRendererTurbo(this, 329, 415, textureX, textureY); // Box 271
		bodyModel[184] = new ModelRendererTurbo(this, 337, 415, textureX, textureY); // Box 272
		bodyModel[185] = new ModelRendererTurbo(this, 345, 415, textureX, textureY); // Box 273
		bodyModel[186] = new ModelRendererTurbo(this, 353, 415, textureX, textureY); // Box 274
		bodyModel[187] = new ModelRendererTurbo(this, 361, 415, textureX, textureY); // Box 275
		bodyModel[188] = new ModelRendererTurbo(this, 369, 415, textureX, textureY); // Box 276
		bodyModel[189] = new ModelRendererTurbo(this, 377, 415, textureX, textureY); // Box 277
		bodyModel[190] = new ModelRendererTurbo(this, 385, 415, textureX, textureY); // Box 278
		bodyModel[191] = new ModelRendererTurbo(this, 393, 415, textureX, textureY); // Box 279
		bodyModel[192] = new ModelRendererTurbo(this, 401, 415, textureX, textureY); // Box 280
		bodyModel[193] = new ModelRendererTurbo(this, 409, 415, textureX, textureY); // Box 281
		bodyModel[194] = new ModelRendererTurbo(this, 417, 415, textureX, textureY); // Box 282
		bodyModel[195] = new ModelRendererTurbo(this, 425, 415, textureX, textureY); // Box 283
		bodyModel[196] = new ModelRendererTurbo(this, 433, 415, textureX, textureY); // Box 284
		bodyModel[197] = new ModelRendererTurbo(this, 441, 415, textureX, textureY); // Box 285
		bodyModel[198] = new ModelRendererTurbo(this, 449, 415, textureX, textureY); // Box 286
		bodyModel[199] = new ModelRendererTurbo(this, 457, 415, textureX, textureY); // Box 287
		bodyModel[200] = new ModelRendererTurbo(this, 465, 415, textureX, textureY); // Box 288
		bodyModel[201] = new ModelRendererTurbo(this, 473, 415, textureX, textureY); // Box 289
		bodyModel[202] = new ModelRendererTurbo(this, 481, 415, textureX, textureY); // Box 290
		bodyModel[203] = new ModelRendererTurbo(this, 489, 415, textureX, textureY); // Box 318
		bodyModel[204] = new ModelRendererTurbo(this, 497, 415, textureX, textureY); // Box 319
		bodyModel[205] = new ModelRendererTurbo(this, 505, 415, textureX, textureY); // Box 320
		bodyModel[206] = new ModelRendererTurbo(this, 513, 415, textureX, textureY); // Box 321
		bodyModel[207] = new ModelRendererTurbo(this, 521, 415, textureX, textureY); // Box 322
		bodyModel[208] = new ModelRendererTurbo(this, 529, 415, textureX, textureY); // Box 323
		bodyModel[209] = new ModelRendererTurbo(this, 537, 415, textureX, textureY); // Box 324
		bodyModel[210] = new ModelRendererTurbo(this, 545, 415, textureX, textureY); // Box 325
		bodyModel[211] = new ModelRendererTurbo(this, 553, 415, textureX, textureY); // Box 326
		bodyModel[212] = new ModelRendererTurbo(this, 561, 415, textureX, textureY); // Box 327
		bodyModel[213] = new ModelRendererTurbo(this, 569, 415, textureX, textureY); // Box 328
		bodyModel[214] = new ModelRendererTurbo(this, 577, 415, textureX, textureY); // Box 329
		bodyModel[215] = new ModelRendererTurbo(this, 585, 415, textureX, textureY); // Box 330
		bodyModel[216] = new ModelRendererTurbo(this, 593, 415, textureX, textureY); // Box 331
		bodyModel[217] = new ModelRendererTurbo(this, 601, 415, textureX, textureY); // Box 332
		bodyModel[218] = new ModelRendererTurbo(this, 609, 415, textureX, textureY); // Box 333
		bodyModel[219] = new ModelRendererTurbo(this, 617, 415, textureX, textureY); // Box 334
		bodyModel[220] = new ModelRendererTurbo(this, 625, 415, textureX, textureY); // Box 340
		bodyModel[221] = new ModelRendererTurbo(this, 633, 415, textureX, textureY); // Box 341
		bodyModel[222] = new ModelRendererTurbo(this, 641, 415, textureX, textureY); // Box 342
		bodyModel[223] = new ModelRendererTurbo(this, 649, 415, textureX, textureY); // Box 343
		bodyModel[224] = new ModelRendererTurbo(this, 657, 415, textureX, textureY); // Box 344
		bodyModel[225] = new ModelRendererTurbo(this, 665, 415, textureX, textureY); // Box 345
		bodyModel[226] = new ModelRendererTurbo(this, 673, 415, textureX, textureY); // Box 346
		bodyModel[227] = new ModelRendererTurbo(this, 681, 415, textureX, textureY); // Box 347
		bodyModel[228] = new ModelRendererTurbo(this, 689, 415, textureX, textureY); // Box 348
		bodyModel[229] = new ModelRendererTurbo(this, 697, 415, textureX, textureY); // Box 349
		bodyModel[230] = new ModelRendererTurbo(this, 705, 415, textureX, textureY); // Box 350
		bodyModel[231] = new ModelRendererTurbo(this, 713, 415, textureX, textureY); // Box 351
		bodyModel[232] = new ModelRendererTurbo(this, 721, 415, textureX, textureY); // Box 352
		bodyModel[233] = new ModelRendererTurbo(this, 729, 415, textureX, textureY); // Box 353
		bodyModel[234] = new ModelRendererTurbo(this, 737, 415, textureX, textureY); // Box 354
		bodyModel[235] = new ModelRendererTurbo(this, 745, 415, textureX, textureY); // Box 355
		bodyModel[236] = new ModelRendererTurbo(this, 753, 415, textureX, textureY); // Box 356
		bodyModel[237] = new ModelRendererTurbo(this, 761, 415, textureX, textureY); // Box 387
		bodyModel[238] = new ModelRendererTurbo(this, 769, 415, textureX, textureY); // Box 388
		bodyModel[239] = new ModelRendererTurbo(this, 777, 415, textureX, textureY); // Box 390
		bodyModel[240] = new ModelRendererTurbo(this, 785, 415, textureX, textureY); // Box 391
		bodyModel[241] = new ModelRendererTurbo(this, 793, 415, textureX, textureY); // Box 392
		bodyModel[242] = new ModelRendererTurbo(this, 801, 415, textureX, textureY); // Box 393
		bodyModel[243] = new ModelRendererTurbo(this, 809, 415, textureX, textureY); // Box 394
		bodyModel[244] = new ModelRendererTurbo(this, 817, 415, textureX, textureY); // Box 395
		bodyModel[245] = new ModelRendererTurbo(this, 825, 415, textureX, textureY); // Box 396
		bodyModel[246] = new ModelRendererTurbo(this, 833, 415, textureX, textureY); // Box 397
		bodyModel[247] = new ModelRendererTurbo(this, 841, 415, textureX, textureY); // Box 398
		bodyModel[248] = new ModelRendererTurbo(this, 849, 415, textureX, textureY); // Box 399
		bodyModel[249] = new ModelRendererTurbo(this, 857, 415, textureX, textureY); // Box 400
		bodyModel[250] = new ModelRendererTurbo(this, 865, 415, textureX, textureY); // Box 401
		bodyModel[251] = new ModelRendererTurbo(this, 873, 415, textureX, textureY); // Box 402
		bodyModel[252] = new ModelRendererTurbo(this, 881, 415, textureX, textureY); // Box 403
		bodyModel[253] = new ModelRendererTurbo(this, 889, 415, textureX, textureY); // Box 404
		bodyModel[254] = new ModelRendererTurbo(this, 897, 415, textureX, textureY); // Box 405
		bodyModel[255] = new ModelRendererTurbo(this, 905, 415, textureX, textureY); // Box 406
		bodyModel[256] = new ModelRendererTurbo(this, 913, 415, textureX, textureY); // Box 407
		bodyModel[257] = new ModelRendererTurbo(this, 921, 415, textureX, textureY); // Box 408
		bodyModel[258] = new ModelRendererTurbo(this, 929, 415, textureX, textureY); // Box 409
		bodyModel[259] = new ModelRendererTurbo(this, 937, 415, textureX, textureY); // Box 410
		bodyModel[260] = new ModelRendererTurbo(this, 945, 415, textureX, textureY); // Box 411
		bodyModel[261] = new ModelRendererTurbo(this, 953, 415, textureX, textureY); // Box 412
		bodyModel[262] = new ModelRendererTurbo(this, 961, 415, textureX, textureY); // Box 413
		bodyModel[263] = new ModelRendererTurbo(this, 969, 415, textureX, textureY); // Box 414
		bodyModel[264] = new ModelRendererTurbo(this, 977, 415, textureX, textureY); // Box 415
		bodyModel[265] = new ModelRendererTurbo(this, 985, 415, textureX, textureY); // Box 416
		bodyModel[266] = new ModelRendererTurbo(this, 993, 415, textureX, textureY); // Box 417
		bodyModel[267] = new ModelRendererTurbo(this, 1001, 415, textureX, textureY); // Box 418
		bodyModel[268] = new ModelRendererTurbo(this, 1009, 415, textureX, textureY); // Box 419
		bodyModel[269] = new ModelRendererTurbo(this, 1017, 415, textureX, textureY); // Box 421
		bodyModel[270] = new ModelRendererTurbo(this, 1025, 415, textureX, textureY); // Box 422
		bodyModel[271] = new ModelRendererTurbo(this, 1033, 415, textureX, textureY); // Box 423
		bodyModel[272] = new ModelRendererTurbo(this, 1041, 415, textureX, textureY); // Box 424
		bodyModel[273] = new ModelRendererTurbo(this, 1049, 415, textureX, textureY); // Box 425
		bodyModel[274] = new ModelRendererTurbo(this, 1057, 415, textureX, textureY); // Box 426
		bodyModel[275] = new ModelRendererTurbo(this, 1065, 415, textureX, textureY); // Box 427
		bodyModel[276] = new ModelRendererTurbo(this, 1073, 415, textureX, textureY); // Box 428
		bodyModel[277] = new ModelRendererTurbo(this, 1081, 415, textureX, textureY); // Box 429
		bodyModel[278] = new ModelRendererTurbo(this, 1089, 415, textureX, textureY); // Box 430
		bodyModel[279] = new ModelRendererTurbo(this, 1097, 415, textureX, textureY); // Box 431
		bodyModel[280] = new ModelRendererTurbo(this, 1105, 415, textureX, textureY); // Box 432
		bodyModel[281] = new ModelRendererTurbo(this, 1113, 415, textureX, textureY); // Box 433
		bodyModel[282] = new ModelRendererTurbo(this, 1121, 415, textureX, textureY); // Box 434
		bodyModel[283] = new ModelRendererTurbo(this, 1129, 415, textureX, textureY); // Box 435
		bodyModel[284] = new ModelRendererTurbo(this, 1137, 415, textureX, textureY); // Box 436
		bodyModel[285] = new ModelRendererTurbo(this, 1145, 415, textureX, textureY); // Box 437
		bodyModel[286] = new ModelRendererTurbo(this, 1153, 415, textureX, textureY); // Box 438
		bodyModel[287] = new ModelRendererTurbo(this, 1161, 415, textureX, textureY); // Box 439
		bodyModel[288] = new ModelRendererTurbo(this, 1169, 415, textureX, textureY); // Box 440
		bodyModel[289] = new ModelRendererTurbo(this, 1177, 415, textureX, textureY); // Box 441
		bodyModel[290] = new ModelRendererTurbo(this, 1185, 415, textureX, textureY); // Box 442
		bodyModel[291] = new ModelRendererTurbo(this, 1193, 415, textureX, textureY); // Box 443
		bodyModel[292] = new ModelRendererTurbo(this, 1201, 415, textureX, textureY); // Box 444
		bodyModel[293] = new ModelRendererTurbo(this, 1209, 415, textureX, textureY); // Box 445
		bodyModel[294] = new ModelRendererTurbo(this, 1217, 415, textureX, textureY); // Box 446
		bodyModel[295] = new ModelRendererTurbo(this, 1225, 415, textureX, textureY); // Box 447
		bodyModel[296] = new ModelRendererTurbo(this, 1233, 415, textureX, textureY); // Box 448
		bodyModel[297] = new ModelRendererTurbo(this, 1241, 415, textureX, textureY); // Box 449
		bodyModel[298] = new ModelRendererTurbo(this, 1249, 415, textureX, textureY); // Box 450
		bodyModel[299] = new ModelRendererTurbo(this, 1257, 415, textureX, textureY); // Box 451
		bodyModel[300] = new ModelRendererTurbo(this, 1265, 415, textureX, textureY); // Box 452
		bodyModel[301] = new ModelRendererTurbo(this, 1273, 415, textureX, textureY); // Box 453
		bodyModel[302] = new ModelRendererTurbo(this, 1281, 415, textureX, textureY); // Box 454
		bodyModel[303] = new ModelRendererTurbo(this, 1289, 415, textureX, textureY); // Box 455
		bodyModel[304] = new ModelRendererTurbo(this, 1297, 415, textureX, textureY); // Box 456
		bodyModel[305] = new ModelRendererTurbo(this, 1305, 415, textureX, textureY); // Box 457
		bodyModel[306] = new ModelRendererTurbo(this, 1313, 415, textureX, textureY); // Box 458
		bodyModel[307] = new ModelRendererTurbo(this, 1321, 415, textureX, textureY); // Box 459
		bodyModel[308] = new ModelRendererTurbo(this, 1329, 415, textureX, textureY); // Box 460
		bodyModel[309] = new ModelRendererTurbo(this, 1337, 415, textureX, textureY); // Box 461
		bodyModel[310] = new ModelRendererTurbo(this, 1345, 415, textureX, textureY); // Box 462
		bodyModel[311] = new ModelRendererTurbo(this, 1353, 415, textureX, textureY); // Box 463
		bodyModel[312] = new ModelRendererTurbo(this, 1361, 415, textureX, textureY); // Box 464
		bodyModel[313] = new ModelRendererTurbo(this, 1369, 415, textureX, textureY); // Box 465
		bodyModel[314] = new ModelRendererTurbo(this, 1377, 415, textureX, textureY); // Box 466
		bodyModel[315] = new ModelRendererTurbo(this, 1385, 415, textureX, textureY); // Box 467
		bodyModel[316] = new ModelRendererTurbo(this, 1393, 415, textureX, textureY); // Box 468
		bodyModel[317] = new ModelRendererTurbo(this, 1401, 415, textureX, textureY); // Box 469
		bodyModel[318] = new ModelRendererTurbo(this, 1409, 415, textureX, textureY); // Box 470
		bodyModel[319] = new ModelRendererTurbo(this, 1417, 415, textureX, textureY); // Box 471
		bodyModel[320] = new ModelRendererTurbo(this, 1425, 415, textureX, textureY); // Box 472
		bodyModel[321] = new ModelRendererTurbo(this, 1433, 415, textureX, textureY); // Box 473
		bodyModel[322] = new ModelRendererTurbo(this, 1441, 415, textureX, textureY); // Box 474
		bodyModel[323] = new ModelRendererTurbo(this, 1449, 415, textureX, textureY); // Box 475
		bodyModel[324] = new ModelRendererTurbo(this, 1457, 415, textureX, textureY); // Box 476
		bodyModel[325] = new ModelRendererTurbo(this, 1465, 415, textureX, textureY); // Box 477
		bodyModel[326] = new ModelRendererTurbo(this, 1473, 415, textureX, textureY); // Box 478
		bodyModel[327] = new ModelRendererTurbo(this, 1481, 415, textureX, textureY); // Box 480
		bodyModel[328] = new ModelRendererTurbo(this, 1489, 415, textureX, textureY); // Box 481
		bodyModel[329] = new ModelRendererTurbo(this, 1497, 415, textureX, textureY); // Box 482
		bodyModel[330] = new ModelRendererTurbo(this, 1505, 415, textureX, textureY); // Box 483
		bodyModel[331] = new ModelRendererTurbo(this, 1513, 415, textureX, textureY); // Box 484
		bodyModel[332] = new ModelRendererTurbo(this, 1521, 415, textureX, textureY); // Box 485
		bodyModel[333] = new ModelRendererTurbo(this, 1529, 415, textureX, textureY); // Box 486
		bodyModel[334] = new ModelRendererTurbo(this, 1537, 415, textureX, textureY); // Box 487
		bodyModel[335] = new ModelRendererTurbo(this, 1545, 415, textureX, textureY); // Box 488
		bodyModel[336] = new ModelRendererTurbo(this, 1553, 415, textureX, textureY); // Box 489
		bodyModel[337] = new ModelRendererTurbo(this, 1561, 415, textureX, textureY); // Box 460
		bodyModel[338] = new ModelRendererTurbo(this, 1569, 415, textureX, textureY); // Box 461
		bodyModel[339] = new ModelRendererTurbo(this, 1577, 415, textureX, textureY); // Box 462
		bodyModel[340] = new ModelRendererTurbo(this, 1585, 415, textureX, textureY); // Box 463
		bodyModel[341] = new ModelRendererTurbo(this, 1593, 415, textureX, textureY); // Box 464
		bodyModel[342] = new ModelRendererTurbo(this, 1601, 415, textureX, textureY); // Box 465
		bodyModel[343] = new ModelRendererTurbo(this, 1609, 415, textureX, textureY); // Box 466
		bodyModel[344] = new ModelRendererTurbo(this, 1617, 415, textureX, textureY); // Box 467
		bodyModel[345] = new ModelRendererTurbo(this, 1625, 415, textureX, textureY); // Box 468
		bodyModel[346] = new ModelRendererTurbo(this, 1633, 415, textureX, textureY); // Box 469
		bodyModel[347] = new ModelRendererTurbo(this, 1641, 415, textureX, textureY); // Box 470
		bodyModel[348] = new ModelRendererTurbo(this, 1649, 415, textureX, textureY); // Box 471
		bodyModel[349] = new ModelRendererTurbo(this, 1657, 415, textureX, textureY); // Box 472
		bodyModel[350] = new ModelRendererTurbo(this, 1665, 415, textureX, textureY); // Box 473
		bodyModel[351] = new ModelRendererTurbo(this, 1673, 415, textureX, textureY); // Box 474
		bodyModel[352] = new ModelRendererTurbo(this, 1681, 415, textureX, textureY); // Box 475
		bodyModel[353] = new ModelRendererTurbo(this, 1689, 415, textureX, textureY); // Box 476
		bodyModel[354] = new ModelRendererTurbo(this, 1697, 415, textureX, textureY); // Box 477
		bodyModel[355] = new ModelRendererTurbo(this, 1705, 415, textureX, textureY); // Box 478
		bodyModel[356] = new ModelRendererTurbo(this, 1713, 415, textureX, textureY); // Box 479
		bodyModel[357] = new ModelRendererTurbo(this, 1721, 415, textureX, textureY); // Box 480
		bodyModel[358] = new ModelRendererTurbo(this, 1729, 415, textureX, textureY); // Box 481
		bodyModel[359] = new ModelRendererTurbo(this, 1737, 415, textureX, textureY); // Box 482
		bodyModel[360] = new ModelRendererTurbo(this, 1745, 415, textureX, textureY); // Box 483
		bodyModel[361] = new ModelRendererTurbo(this, 1753, 415, textureX, textureY); // Box 484
		bodyModel[362] = new ModelRendererTurbo(this, 1761, 415, textureX, textureY); // Box 485
		bodyModel[363] = new ModelRendererTurbo(this, 1769, 415, textureX, textureY); // Box 486
		bodyModel[364] = new ModelRendererTurbo(this, 1769, 415, textureX, textureY); // Box 487
		bodyModel[365] = new ModelRendererTurbo(this, 1769, 415, textureX, textureY); // Box 462
		bodyModel[366] = new ModelRendererTurbo(this, 1817, 415, textureX, textureY); // Box 463
		bodyModel[367] = new ModelRendererTurbo(this, 1833, 415, textureX, textureY); // Box 465
		bodyModel[368] = new ModelRendererTurbo(this, 1849, 415, textureX, textureY); // Box 466
		bodyModel[369] = new ModelRendererTurbo(this, 1865, 415, textureX, textureY); // Box 467
		bodyModel[370] = new ModelRendererTurbo(this, 1873, 415, textureX, textureY); // Box 468
		bodyModel[371] = new ModelRendererTurbo(this, 1881, 415, textureX, textureY); // Box 469
		bodyModel[372] = new ModelRendererTurbo(this, 1889, 415, textureX, textureY); // Box 470
		bodyModel[373] = new ModelRendererTurbo(this, 1897, 415, textureX, textureY); // Box 471
		bodyModel[374] = new ModelRendererTurbo(this, 1905, 415, textureX, textureY); // Box 472
		bodyModel[375] = new ModelRendererTurbo(this, 1913, 415, textureX, textureY); // Box 512
		bodyModel[376] = new ModelRendererTurbo(this, 1929, 415, textureX, textureY); // Box 513
		bodyModel[377] = new ModelRendererTurbo(this, 1953, 415, textureX, textureY); // Box 514
		bodyModel[378] = new ModelRendererTurbo(this, 1969, 415, textureX, textureY); // Box 397
		bodyModel[379] = new ModelRendererTurbo(this, 1985, 415, textureX, textureY); // Box 398
		bodyModel[380] = new ModelRendererTurbo(this, 2001, 415, textureX, textureY); // Box 399
		bodyModel[381] = new ModelRendererTurbo(this, 2025, 415, textureX, textureY); // Box 400
		bodyModel[382] = new ModelRendererTurbo(this, 1, 380, textureX, textureY); // Box 595
		bodyModel[383] = new ModelRendererTurbo(this, 1, 380, textureX, textureY); // Box 259
		bodyModel[384] = new ModelRendererTurbo(this, 9, 380, textureX, textureY); // Box 260
		bodyModel[385] = new ModelRendererTurbo(this, 57, 380, textureX, textureY); // Box 256
		bodyModel[386] = new ModelRendererTurbo(this, 81, 380, textureX, textureY); // Box 249
		bodyModel[387] = new ModelRendererTurbo(this, 105, 380, textureX, textureY); // Box 254
		bodyModel[388] = new ModelRendererTurbo(this, 129, 380, textureX, textureY); // Box 263
		bodyModel[389] = new ModelRendererTurbo(this, 17, 380, textureX, textureY); // Box 264
		bodyModel[390] = new ModelRendererTurbo(this, 73, 380, textureX, textureY); // Box 265
		bodyModel[391] = new ModelRendererTurbo(this, 145, 380, textureX, textureY); // Box 266
		bodyModel[392] = new ModelRendererTurbo(this, 153, 380, textureX, textureY); // Box 601
		bodyModel[393] = new ModelRendererTurbo(this, 169, 380, textureX, textureY); // Box 602
		bodyModel[394] = new ModelRendererTurbo(this, 185, 380, textureX, textureY); // Box 603
		bodyModel[395] = new ModelRendererTurbo(this, 193, 380, textureX, textureY); // Box 604
		bodyModel[396] = new ModelRendererTurbo(this, 201, 380, textureX, textureY); // Box 967
		bodyModel[397] = new ModelRendererTurbo(this, 241, 380, textureX, textureY); // Box 968
		bodyModel[398] = new ModelRendererTurbo(this, 257, 380, textureX, textureY); // Box 417
		bodyModel[399] = new ModelRendererTurbo(this, 297, 380, textureX, textureY); // Box 418
		bodyModel[400] = new ModelRendererTurbo(this, 313, 380, textureX, textureY); // Box 239
		bodyModel[401] = new ModelRendererTurbo(this, 129, 380, textureX, textureY); // Box 240
		bodyModel[402] = new ModelRendererTurbo(this, 345, 380, textureX, textureY); // Box 241
		bodyModel[403] = new ModelRendererTurbo(this, 369, 380, textureX, textureY); // Box 242
		bodyModel[404] = new ModelRendererTurbo(this, 153, 380, textureX, textureY); // Box 243
		bodyModel[405] = new ModelRendererTurbo(this, 385, 380, textureX, textureY); // Box 244
		bodyModel[406] = new ModelRendererTurbo(this, 409, 380, textureX, textureY); // Box 245
		bodyModel[407] = new ModelRendererTurbo(this, 425, 380, textureX, textureY); // Box 246
		bodyModel[408] = new ModelRendererTurbo(this, 449, 380, textureX, textureY); // Box 247
		bodyModel[409] = new ModelRendererTurbo(this, 457, 380, textureX, textureY); // Box 248
		bodyModel[410] = new ModelRendererTurbo(this, 465, 380, textureX, textureY); // Box 250
		bodyModel[411] = new ModelRendererTurbo(this, 473, 380, textureX, textureY); // Box 251
		bodyModel[412] = new ModelRendererTurbo(this, 481, 380, textureX, textureY); // Box 252
		bodyModel[413] = new ModelRendererTurbo(this, 505, 380, textureX, textureY); // Box 253
		bodyModel[414] = new ModelRendererTurbo(this, 313, 380, textureX, textureY); // Box 962
		bodyModel[415] = new ModelRendererTurbo(this, 361, 380, textureX, textureY); // Box 964
		bodyModel[416] = new ModelRendererTurbo(this, 385, 380, textureX, textureY); // Box 966
		bodyModel[417] = new ModelRendererTurbo(this, 529, 380, textureX, textureY); // Box 484
		bodyModel[418] = new ModelRendererTurbo(this, 561, 380, textureX, textureY); // Box 485
		bodyModel[419] = new ModelRendererTurbo(this, 577, 380, textureX, textureY); // Box 487
		bodyModel[420] = new ModelRendererTurbo(this, 585, 380, textureX, textureY); // Box 488
		bodyModel[421] = new ModelRendererTurbo(this, 617, 380, textureX, textureY); // Box 489
		bodyModel[422] = new ModelRendererTurbo(this, 633, 380, textureX, textureY); // Box 490
		bodyModel[423] = new ModelRendererTurbo(this, 601, 380, textureX, textureY); // Box 491
		bodyModel[424] = new ModelRendererTurbo(this, 665, 380, textureX, textureY); // Box 492
		bodyModel[425] = new ModelRendererTurbo(this, 673, 380, textureX, textureY); // Box 493
		bodyModel[426] = new ModelRendererTurbo(this, 705, 380, textureX, textureY); // Box 494
		bodyModel[427] = new ModelRendererTurbo(this, 729, 380, textureX, textureY); // Box 495
		bodyModel[428] = new ModelRendererTurbo(this, 753, 380, textureX, textureY); // Box 496
		bodyModel[429] = new ModelRendererTurbo(this, 761, 380, textureX, textureY); // Box 497
		bodyModel[430] = new ModelRendererTurbo(this, 769, 380, textureX, textureY); // Box 498
		bodyModel[431] = new ModelRendererTurbo(this, 777, 380, textureX, textureY); // Box 499
		bodyModel[432] = new ModelRendererTurbo(this, 785, 380, textureX, textureY); // Box 578
		bodyModel[433] = new ModelRendererTurbo(this, 793, 380, textureX, textureY); // Box 579
		bodyModel[434] = new ModelRendererTurbo(this, 801, 380, textureX, textureY); // Box 580
		bodyModel[435] = new ModelRendererTurbo(this, 825, 380, textureX, textureY); // Box 582
		bodyModel[436] = new ModelRendererTurbo(this, 857, 380, textureX, textureY); // Box 583
		bodyModel[437] = new ModelRendererTurbo(this, 881, 380, textureX, textureY); // Box 584
		bodyModel[438] = new ModelRendererTurbo(this, 897, 380, textureX, textureY); // Box 585
		bodyModel[439] = new ModelRendererTurbo(this, 913, 380, textureX, textureY); // Box 586
		bodyModel[440] = new ModelRendererTurbo(this, 937, 380, textureX, textureY); // Box 587
		bodyModel[441] = new ModelRendererTurbo(this, 953, 380, textureX, textureY); // Box 588
		bodyModel[442] = new ModelRendererTurbo(this, 977, 380, textureX, textureY); // Box 589
		bodyModel[443] = new ModelRendererTurbo(this, 985, 380, textureX, textureY); // Box 590
		bodyModel[444] = new ModelRendererTurbo(this, 401, 380, textureX, textureY); // Box 591
		bodyModel[445] = new ModelRendererTurbo(this, 617, 380, textureX, textureY); // Box 592
		bodyModel[446] = new ModelRendererTurbo(this, 697, 380, textureX, textureY); // Box 593
		bodyModel[447] = new ModelRendererTurbo(this, 993, 380, textureX, textureY); // Box 594
		bodyModel[448] = new ModelRendererTurbo(this, 801, 380, textureX, textureY); // Box 399

		bodyModel[0].addShapeBox(0F, 0F, 0F, 14, 5, 4, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-45F, -37F, -16F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 14, 5, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[1].setRotationPoint(-45F, -32F, -17F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 14, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[2].setRotationPoint(-45F, -27F, -17F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 14, 7, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[3].setRotationPoint(-45F, -21F, -17F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 14, 5, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[4].setRotationPoint(-45F, -14F, -13F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 15, 5, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[5].setRotationPoint(-60F, -14F, -13F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 15, 7, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[6].setRotationPoint(-60F, -21F, -17F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 15, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[7].setRotationPoint(-60F, -27F, -17F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 15, 5, 4, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[8].setRotationPoint(-60F, -37F, -16F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 15, 5, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[9].setRotationPoint(-60F, -32F, -17F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 16, 5, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[10].setRotationPoint(-76F, -14F, -13F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 16, 7, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[11].setRotationPoint(-76F, -21F, -17F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 16, 6, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[12].setRotationPoint(-76F, -27F, -17F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 16, 5, 16, 0F,0F, -1F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[13].setRotationPoint(-76F, -37F, -16F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 16, 5, 17, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[14].setRotationPoint(-76F, -32F, -17F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 41, 5, 17, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[15].setRotationPoint(-31F, -32F, -17F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 41, 5, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[16].setRotationPoint(-31F, -14F, -13F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 41, 7, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[17].setRotationPoint(-31F, -21F, -17F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 41, 6, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[18].setRotationPoint(-31F, -27F, -17F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 41, 5, 16, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[19].setRotationPoint(-31F, -37F, -16F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 24, 5, 5, 0F,0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[20].setRotationPoint(10F, -32F, -17F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 24, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[21].setRotationPoint(10F, -27F, -17F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 24, 5, 4, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[22].setRotationPoint(10F, -37F, -16F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 41, 5, 13, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[23].setRotationPoint(-31F, -42F, -13F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 41, 3, 10, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[24].setRotationPoint(-31F, -45F, -10F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 41, 3, 6, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[25].setRotationPoint(-31F, -48F, -6F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 15, 4, 5, 0F,0F, 0F, -4F, -8F, 0F, -4F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 36
		bodyModel[26].setRotationPoint(-60F, -41F, -13F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 16, 4, 13, 0F,0F, -1F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 37
		bodyModel[27].setRotationPoint(-76F, -41F, -13F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 24, 7, 17, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -2F, -6F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[28].setRotationPoint(10F, -21F, -17F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 26, 5, 15, 0F,0F, 0F, -2F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[29].setRotationPoint(34F, -37F, -15F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 26, 4, 13, 0F,-2F, 0F, -3F, 0F, -2F, -6F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[30].setRotationPoint(34F, -41F, -13F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 24, 2, 10, 0F,-1F, 0F, -5F, 0F, -2F, -7F, 0F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -3F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[31].setRotationPoint(36F, -43F, -10F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 26, 5, 17, 0F,0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[32].setRotationPoint(34F, -32F, -17F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 26, 6, 17, 0F,0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -6F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[33].setRotationPoint(34F, -27F, -17F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 7, 2, 4, 0F,0F, 0F, -3F, -2F, 0F, -3F, -2F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 46
		bodyModel[34].setRotationPoint(-60F, -43F, -9F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 16, 2, 9, 0F,0F, -1F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 47
		bodyModel[35].setRotationPoint(-76F, -43F, -9F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 26, 5, 15, 0F,0F, 0F, 0F, 0F, 1F, -4F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -3F, -6F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[36].setRotationPoint(34F, -21F, -15F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 24, 5, 13, 0F,0F, 0F, 0F, 0F, 2F, -2F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -3F, -8F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[37].setRotationPoint(10F, -14F, -13F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 26, 4, 11, 0F,0F, 0F, 0F, 0F, 3F, -2F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -4F, -7F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[38].setRotationPoint(34F, -16F, -11F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		bodyModel[39].setRotationPoint(-60F, -43F, -6F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[40].setRotationPoint(19F, -39F, -13.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-1.25F, 0F, -1F, 1.25F, 0F, -1F, 1.25F, 0F, 1F, -1.25F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 98
		bodyModel[41].setRotationPoint(20F, -42F, -11.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-1.5F, 0F, -2F, 1.5F, 0F, -2F, 1.5F, 0F, 2F, -1.5F, 0F, 2F, -0.25F, 0F, 1F, 0.25F, 0F, 1F, 0.25F, 0F, -1F, -0.25F, 0F, -1F); // Box 99
		bodyModel[42].setRotationPoint(21F, -45F, -9.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-1F, 0F, -1F, 1F, 0F, -1F, 0.5F, -1F, 0F, -1F, -1F, 0F, -0.5F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, -1F, -0.5F, 0F, -1F); // Box 100
		bodyModel[43].setRotationPoint(22F, -47F, -6.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 101
		bodyModel[44].setRotationPoint(23F, -48F, -5.5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 26, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[45].setRotationPoint(-3F, -45F, -7.5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 103
		bodyModel[46].setRotationPoint(3F, -42F, -13.5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 104
		bodyModel[47].setRotationPoint(3F, -45F, -10.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 109
		bodyModel[48].setRotationPoint(10F, -45F, -10.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 110
		bodyModel[49].setRotationPoint(10F, -42F, -13.5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 113
		bodyModel[50].setRotationPoint(17F, -45F, -10.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 114
		bodyModel[51].setRotationPoint(17F, -42F, -13.5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 28, 1, 2, 0F,0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 115
		bodyModel[52].setRotationPoint(-3F, -48F, -2F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[53].setRotationPoint(-45F, -45F, -13F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		bodyModel[54].setRotationPoint(-45F, -48F, -8F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		bodyModel[55].setRotationPoint(-45F, -48F, -3F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-3F, -1F, 0F, 3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 1F, 0F, 3F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[56].setRotationPoint(-48F, -46F, -8F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[57].setRotationPoint(-48F, -46F, -4F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, 3F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -2F); // Box 121
		bodyModel[58].setRotationPoint(-55F, -46F, -4F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -4F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -1F, 0F, 4F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -1F); // Box 122
		bodyModel[59].setRotationPoint(-53F, -45F, -8F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 23, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[60].setRotationPoint(-3F, -39F, -13.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 142
		bodyModel[61].setRotationPoint(-3F, -42F, -13.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 143
		bodyModel[62].setRotationPoint(-3F, -45F, -10.5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0.5F, -3F, 0F, 0.5F, -3F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 144
		bodyModel[63].setRotationPoint(-3F, -48F, -6.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 145
		bodyModel[64].setRotationPoint(-3F, -48F, -3.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0.5F, -3F, 0F, 0.5F, -3F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 146
		bodyModel[65].setRotationPoint(3F, -48F, -6.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 147
		bodyModel[66].setRotationPoint(3F, -48F, -3.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0.5F, -3F, 0F, 0.5F, -3F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 148
		bodyModel[67].setRotationPoint(10F, -48F, -6.5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 149
		bodyModel[68].setRotationPoint(10F, -48F, -3.5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0.5F, -3F, 0F, 0.5F, -3F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 150
		bodyModel[69].setRotationPoint(17F, -48F, -6.5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 151
		bodyModel[70].setRotationPoint(17F, -48F, -3.5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 14, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[71].setRotationPoint(-45F, -37F, 12F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 14, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		bodyModel[72].setRotationPoint(-45F, -32F, 12F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 14, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[73].setRotationPoint(-45F, -27F, 12F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 14, 7, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 165
		bodyModel[74].setRotationPoint(-45F, -21F, 0F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 14, 5, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F); // Box 166
		bodyModel[75].setRotationPoint(-45F, -14F, 0F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 15, 5, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F); // Box 167
		bodyModel[76].setRotationPoint(-60F, -14F, 0F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 15, 7, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 168
		bodyModel[77].setRotationPoint(-60F, -21F, 0F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 15, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		bodyModel[78].setRotationPoint(-60F, -27F, 12F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 15, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
		bodyModel[79].setRotationPoint(-60F, -37F, 12F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 15, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		bodyModel[80].setRotationPoint(-60F, -32F, 12F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 16, 5, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F); // Box 172
		bodyModel[81].setRotationPoint(-76F, -14F, 0F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 16, 7, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 173
		bodyModel[82].setRotationPoint(-76F, -21F, 0F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 16, 6, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[83].setRotationPoint(-76F, -27F, 0F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 16, 5, 16, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
		bodyModel[84].setRotationPoint(-76F, -37F, 0F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 16, 5, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		bodyModel[85].setRotationPoint(-76F, -32F, 0F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 41, 5, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		bodyModel[86].setRotationPoint(-31F, -32F, 0F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 41, 5, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F); // Box 188
		bodyModel[87].setRotationPoint(-31F, -14F, 0F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 41, 7, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 189
		bodyModel[88].setRotationPoint(-31F, -21F, 0F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 41, 6, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 190
		bodyModel[89].setRotationPoint(-31F, -27F, 0F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 41, 5, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 191
		bodyModel[90].setRotationPoint(-31F, -37F, 0F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 24, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 192
		bodyModel[91].setRotationPoint(10F, -32F, 12F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 24, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 193
		bodyModel[92].setRotationPoint(10F, -27F, 12F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 24, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 194
		bodyModel[93].setRotationPoint(10F, -37F, 12F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 41, 5, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		bodyModel[94].setRotationPoint(-31F, -42F, 0F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 41, 3, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[95].setRotationPoint(-31F, -45F, 0F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 41, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 197
		bodyModel[96].setRotationPoint(-31F, -48F, 0F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 15, 4, 5, 0F,0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		bodyModel[97].setRotationPoint(-60F, -41F, 8F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 16, 4, 13, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, -4F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 199
		bodyModel[98].setRotationPoint(-76F, -41F, 0F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 24, 7, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -6F, 0F, 0F, -4F); // Box 202
		bodyModel[99].setRotationPoint(10F, -21F, 0F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 26, 5, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 203
		bodyModel[100].setRotationPoint(34F, -37F, 0F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 26, 4, 13, 0F,-2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -6F, -2F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 204
		bodyModel[101].setRotationPoint(34F, -41F, 0F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 24, 2, 10, 0F,-1F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -7F, -1F, 0F, -5F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -3F, 0F, 0F, 0F); // Box 205
		bodyModel[102].setRotationPoint(36F, -43F, 0F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 26, 5, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -1F); // Box 206
		bodyModel[103].setRotationPoint(34F, -32F, 0F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 26, 6, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -6F, 0F, 0F, -2F); // Box 207
		bodyModel[104].setRotationPoint(34F, -27F, 0F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 7, 2, 4, 0F,0F, -1F, -1F, -2F, -1F, -1F, -2F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 208
		bodyModel[105].setRotationPoint(-60F, -43F, 5F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 16, 2, 9, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, -3F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 209
		bodyModel[106].setRotationPoint(-76F, -43F, 0F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 26, 5, 15, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -6F, 0F, 0F, -4F); // Box 212
		bodyModel[107].setRotationPoint(34F, -21F, 0F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 24, 5, 13, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -8F, 0F, 0F, -8F); // Box 219
		bodyModel[108].setRotationPoint(10F, -14F, 0F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 26, 4, 11, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, -7F, 0F, 0F, -6F); // Box 220
		bodyModel[109].setRotationPoint(34F, -16F, 0F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 251
		bodyModel[110].setRotationPoint(-60F, -43F, 0F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 259
		bodyModel[111].setRotationPoint(19F, -39F, 12.5F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-1.25F, 0F, 1F, 1.25F, 0F, 1F, 1.25F, 0F, -1F, -1.25F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 260
		bodyModel[112].setRotationPoint(20F, -42F, 10.5F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-1.5F, 0F, 2F, 1.5F, 0F, 2F, 1.5F, 0F, -2F, -1.5F, 0F, -2F, -0.25F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, 1F, -0.25F, 0F, 1F); // Box 261
		bodyModel[113].setRotationPoint(21F, -45F, 8.5F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-1F, -1F, 0F, 0.5F, -1F, 0F, 1F, 0F, -1F, -1F, 0F, -1F, -0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 1F, -0.5F, 0F, 1F); // Box 262
		bodyModel[114].setRotationPoint(22F, -47F, 5.5F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 263
		bodyModel[115].setRotationPoint(23F, -48F, 2.5F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 26, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 264
		bodyModel[116].setRotationPoint(-3F, -45F, 6.5F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 265
		bodyModel[117].setRotationPoint(3F, -42F, 9.5F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 266
		bodyModel[118].setRotationPoint(3F, -45F, 6.5F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 267
		bodyModel[119].setRotationPoint(10F, -45F, 6.5F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 268
		bodyModel[120].setRotationPoint(10F, -42F, 9.5F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 269
		bodyModel[121].setRotationPoint(17F, -45F, 6.5F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 270
		bodyModel[122].setRotationPoint(17F, -42F, 9.5F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 28, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 271
		bodyModel[123].setRotationPoint(-3F, -48F, 0F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		bodyModel[124].setRotationPoint(-45F, -45F, 12F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F); // Box 273
		bodyModel[125].setRotationPoint(-45F, -48F, 3F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 274
		bodyModel[126].setRotationPoint(-45F, -48F, 0F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 3F, -1F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 1F, 0F, -3F, 1F, 0F); // Box 275
		bodyModel[127].setRotationPoint(-48F, -46F, 4F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 276
		bodyModel[128].setRotationPoint(-48F, -46F, 0F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 2F, 0F, 3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 2F); // Box 277
		bodyModel[129].setRotationPoint(-55F, -46F, 3F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 1F, 0F, 4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 1F); // Box 278
		bodyModel[130].setRotationPoint(-53F, -45F, 7F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 23, 2, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 297
		bodyModel[131].setRotationPoint(-3F, -39F, 12.5F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 298
		bodyModel[132].setRotationPoint(-3F, -42F, 9.5F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		bodyModel[133].setRotationPoint(-3F, -45F, 6.5F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0.5F, -3F, 0F, 0.5F, -3F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 300
		bodyModel[134].setRotationPoint(-3F, -48F, 2.5F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 301
		bodyModel[135].setRotationPoint(-3F, -48F, 2.5F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0.5F, -3F, 0F, 0.5F, -3F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 302
		bodyModel[136].setRotationPoint(3F, -48F, 2.5F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 303
		bodyModel[137].setRotationPoint(3F, -48F, 2.5F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0.5F, -3F, 0F, 0.5F, -3F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 304
		bodyModel[138].setRotationPoint(10F, -48F, 2.5F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 305
		bodyModel[139].setRotationPoint(10F, -48F, 2.5F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0.5F, -3F, 0F, 0.5F, -3F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 306
		bodyModel[140].setRotationPoint(17F, -48F, 2.5F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 307
		bodyModel[141].setRotationPoint(17F, -48F, 2.5F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 3, 25, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 280
		bodyModel[142].setRotationPoint(-71F, -62F, -9.5F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 5, 1, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 262
		bodyModel[143].setRotationPoint(-52F, -32F, -12F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 6, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 255
		bodyModel[144].setRotationPoint(-47F, -37F, -12F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 2, 24, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 257
		bodyModel[145].setRotationPoint(-47F, -39F, -12F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,0F, 0.5F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 258
		bodyModel[146].setRotationPoint(-47F, -40F, -11F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 213
		bodyModel[147].setRotationPoint(-46.8F, -37.3F, -4F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, -0.4F, -3F, 0F, -0.4F, -3F, 0F, -0.4F, -3F, 0F, -0.4F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 214
		bodyModel[148].setRotationPoint(-46.8F, -38.3F, -4F);

		bodyModel[149].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F); // Box 233
		bodyModel[149].setRotationPoint(-46.7F, -36.1F, 2.7F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F); // Box 234
		bodyModel[150].setRotationPoint(-46.6F, -37.1F, -0.9F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F); // Box 235
		bodyModel[151].setRotationPoint(-46.6F, -37.1F, -0.9F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F); // Box 236
		bodyModel[152].setRotationPoint(-46.6F, -37.1F, -0.9F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 237
		bodyModel[153].setRotationPoint(-46.6F, -36.1F, -0.9F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 238
		bodyModel[154].setRotationPoint(-46.6F, -36.1F, -0.9F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 239
		bodyModel[155].setRotationPoint(-46.6F, -36.1F, 0.0999999999999996F);

		bodyModel[156].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 240
		bodyModel[156].setRotationPoint(-46.7F, -36.1F, 0.0999999999999996F);
		bodyModel[156].rotateAngleX = 5.49778714F;

		bodyModel[157].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 241
		bodyModel[157].setRotationPoint(-46.7F, -36.1F, 0.0999999999999996F);

		bodyModel[158].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F); // Box 242
		bodyModel[158].setRotationPoint(-46.7F, -36.1F, 0.0999999999999996F);

		bodyModel[159].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 243
		bodyModel[159].setRotationPoint(-46.6F, -36.1F, 0.0999999999999996F);

		bodyModel[160].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 244
		bodyModel[160].setRotationPoint(-46.7F, -36.1F, 0.0999999999999996F);
		bodyModel[160].rotateAngleX = 3.14159265F;

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 248
		bodyModel[161].setRotationPoint(-46.6F, -37.1F, 0.0999999999999996F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 249
		bodyModel[162].setRotationPoint(-46.6F, -37.1F, 0.0999999999999996F);

		bodyModel[163].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 250
		bodyModel[163].setRotationPoint(-46.7F, -36.1F, 0.0999999999999996F);
		bodyModel[163].rotateAngleX = 4.71238898F;

		bodyModel[164].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 251
		bodyModel[164].setRotationPoint(-46.7F, -36.1F, 0.0999999999999996F);
		bodyModel[164].rotateAngleX = 3.92699082F;

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F); // Box 252
		bodyModel[165].setRotationPoint(-46.6F, -37.1F, 1.7F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F); // Box 253
		bodyModel[166].setRotationPoint(-46.6F, -37.1F, 1.7F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F); // Box 254
		bodyModel[167].setRotationPoint(-46.6F, -37.1F, 1.7F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 255
		bodyModel[168].setRotationPoint(-46.6F, -37.1F, 2.7F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 256
		bodyModel[169].setRotationPoint(-46.6F, -37.1F, 2.7F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 257
		bodyModel[170].setRotationPoint(-46.6F, -36.1F, 2.7F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 258
		bodyModel[171].setRotationPoint(-46.6F, -36.1F, 1.7F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 259
		bodyModel[172].setRotationPoint(-46.6F, -36.1F, 1.7F);

		bodyModel[173].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 260
		bodyModel[173].setRotationPoint(-46.7F, -36.1F, 2.7F);
		bodyModel[173].rotateAngleX = 3.92699082F;

		bodyModel[174].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 261
		bodyModel[174].setRotationPoint(-46.7F, -36.1F, 2.7F);
		bodyModel[174].rotateAngleX = 4.71238898F;

		bodyModel[175].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 262
		bodyModel[175].setRotationPoint(-46.7F, -36.1F, 2.7F);
		bodyModel[175].rotateAngleX = 5.49778714F;

		bodyModel[176].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 263
		bodyModel[176].setRotationPoint(-46.7F, -36.1F, 2.7F);

		bodyModel[177].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 265
		bodyModel[177].setRotationPoint(-46.6F, -36.1F, 2.7F);

		bodyModel[178].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 266
		bodyModel[178].setRotationPoint(-46.7F, -36.1F, 2.7F);
		bodyModel[178].rotateAngleX = 0.78539816F;

		bodyModel[179].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 267
		bodyModel[179].setRotationPoint(-46.7F, -36.1F, 2.7F);
		bodyModel[179].rotateAngleX = 1.57079633F;

		bodyModel[180].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 268
		bodyModel[180].setRotationPoint(-46.7F, -36.1F, 2.7F);
		bodyModel[180].rotateAngleX = 2.35619449F;

		bodyModel[181].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 269
		bodyModel[181].setRotationPoint(-46.7F, -36.1F, 2.7F);
		bodyModel[181].rotateAngleX = 3.14159265F;

		bodyModel[182].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.45F, 0.3F, 0F, -0.45F, 0.3F, 0F, -0.45F, 0.3F, 0F, -0.45F, 0.3F, 0F, -0.45F, 0.3F, 0F, -0.45F, 0.3F, 0F, -0.45F, 0.3F, 0F, -0.45F, 0.3F); // Box 270
		bodyModel[182].setRotationPoint(-46.7F, -36.1F, 0.0999999999999996F);
		bodyModel[182].rotateAngleX = -0.38397244F;

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F); // Box 271
		bodyModel[183].setRotationPoint(-46.7F, -36.9F, -0.9F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, -0.9F, 0F, -0.5F, -0.9F, 0F, -0.5F, -0.9F, 0F, -0.5F, -0.9F); // Box 272
		bodyModel[184].setRotationPoint(-46.7F, -36.7F, -0.9F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 273
		bodyModel[185].setRotationPoint(-46.6F, -33.5F, -3.7F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 274
		bodyModel[186].setRotationPoint(-46.6F, -33.5F, -3.7F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F); // Box 275
		bodyModel[187].setRotationPoint(-46.6F, -34.5F, -3.7F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F); // Box 276
		bodyModel[188].setRotationPoint(-46.6F, -34.5F, -3.7F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F); // Box 277
		bodyModel[189].setRotationPoint(-46.6F, -34.5F, -3.7F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 278
		bodyModel[190].setRotationPoint(-46.6F, -34.5F, -2.7F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 279
		bodyModel[191].setRotationPoint(-46.6F, -34.5F, -2.7F);

		bodyModel[192].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 280
		bodyModel[192].setRotationPoint(-46.7F, -33.5F, -2.7F);
		bodyModel[192].rotateAngleX = 0.78539816F;

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 281
		bodyModel[193].setRotationPoint(-46.6F, -33.5F, -2.7F);

		bodyModel[194].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 282
		bodyModel[194].setRotationPoint(-46.7F, -33.5F, -2.7F);
		bodyModel[194].rotateAngleX = 5.49778714F;

		bodyModel[195].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 283
		bodyModel[195].setRotationPoint(-46.7F, -33.5F, -2.7F);

		bodyModel[196].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 284
		bodyModel[196].setRotationPoint(-46.7F, -33.5F, -2.7F);
		bodyModel[196].rotateAngleX = 1.57079633F;

		bodyModel[197].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 285
		bodyModel[197].setRotationPoint(-46.7F, -33.5F, -2.7F);
		bodyModel[197].rotateAngleX = 2.35619449F;

		bodyModel[198].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 286
		bodyModel[198].setRotationPoint(-46.7F, -33.5F, -2.7F);
		bodyModel[198].rotateAngleX = 3.14159265F;

		bodyModel[199].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 287
		bodyModel[199].setRotationPoint(-46.6F, -33.5F, -2.7F);

		bodyModel[200].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F); // Box 288
		bodyModel[200].setRotationPoint(-46.7F, -33.5F, -2.7F);
		bodyModel[200].rotateAngleX = -3.90953752F;

		bodyModel[201].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 289
		bodyModel[201].setRotationPoint(-46.7F, -33.5F, -2.7F);
		bodyModel[201].rotateAngleX = 4.71238898F;

		bodyModel[202].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 290
		bodyModel[202].setRotationPoint(-46.7F, -33.5F, -2.7F);
		bodyModel[202].rotateAngleX = 3.92699082F;

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 318
		bodyModel[203].setRotationPoint(-46.8F, -36.1F, 4.8F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 319
		bodyModel[204].setRotationPoint(-46.8F, -36.1F, 4.8F);

		bodyModel[205].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 320
		bodyModel[205].setRotationPoint(-46.9F, -36.1F, 5.8F);
		bodyModel[205].rotateAngleX = 3.92699082F;

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F); // Box 321
		bodyModel[206].setRotationPoint(-46.8F, -37.1F, 4.8F);

		bodyModel[207].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 322
		bodyModel[207].setRotationPoint(-46.9F, -36.1F, 5.8F);
		bodyModel[207].rotateAngleX = 3.14159265F;

		bodyModel[208].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F); // Box 323
		bodyModel[208].setRotationPoint(-46.8F, -37.1F, 4.8F);

		bodyModel[209].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 324
		bodyModel[209].setRotationPoint(-46.9F, -36.1F, 5.8F);
		bodyModel[209].rotateAngleX = 2.35619449F;

		bodyModel[210].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F); // Box 325
		bodyModel[210].setRotationPoint(-46.8F, -37.1F, 4.8F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 326
		bodyModel[211].setRotationPoint(-46.8F, -37.1F, 5.8F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 327
		bodyModel[212].setRotationPoint(-46.8F, -37.1F, 5.8F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 328
		bodyModel[213].setRotationPoint(-46.8F, -36.1F, 5.8F);

		bodyModel[214].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 329
		bodyModel[214].setRotationPoint(-46.9F, -36.1F, 5.8F);
		bodyModel[214].rotateAngleX = 5.49778714F;

		bodyModel[215].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 330
		bodyModel[215].setRotationPoint(-46.9F, -36.1F, 5.8F);

		bodyModel[216].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 331
		bodyModel[216].setRotationPoint(-46.9F, -36.1F, 5.8F);
		bodyModel[216].rotateAngleX = 0.78539816F;

		bodyModel[217].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 332
		bodyModel[217].setRotationPoint(-46.9F, -36.1F, 5.8F);
		bodyModel[217].rotateAngleX = 1.57079633F;

		bodyModel[218].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F); // Box 333
		bodyModel[218].setRotationPoint(-46.9F, -36.1F, 5.8F);
		bodyModel[218].rotateAngleX = -3.90953752F;

		bodyModel[219].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 334
		bodyModel[219].setRotationPoint(-46.8F, -36.1F, 5.8F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 340
		bodyModel[220].setRotationPoint(-46.8F, -39.6F, 4.4F);

		bodyModel[221].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F); // Box 341
		bodyModel[221].setRotationPoint(-46.9F, -38.6F, 4.4F);
		bodyModel[221].rotateAngleX = -1.57079633F;

		bodyModel[222].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 342
		bodyModel[222].setRotationPoint(-46.8F, -38.6F, 4.4F);

		bodyModel[223].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 343
		bodyModel[223].setRotationPoint(-46.9F, -38.6F, 4.4F);
		bodyModel[223].rotateAngleX = 5.49778714F;

		bodyModel[224].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 344
		bodyModel[224].setRotationPoint(-46.8F, -38.6F, 4.4F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 345
		bodyModel[225].setRotationPoint(-46.8F, -38.6F, 3.4F);

		bodyModel[226].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 346
		bodyModel[226].setRotationPoint(-46.9F, -38.6F, 4.4F);
		bodyModel[226].rotateAngleX = 4.71238898F;

		bodyModel[227].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 347
		bodyModel[227].setRotationPoint(-46.9F, -38.6F, 4.4F);
		bodyModel[227].rotateAngleX = 3.92699082F;

		bodyModel[228].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 348
		bodyModel[228].setRotationPoint(-46.8F, -38.6F, 3.4F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F); // Box 349
		bodyModel[229].setRotationPoint(-46.8F, -39.6F, 3.4F);

		bodyModel[230].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 350
		bodyModel[230].setRotationPoint(-46.9F, -38.6F, 4.4F);
		bodyModel[230].rotateAngleX = 3.14159265F;

		bodyModel[231].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F); // Box 351
		bodyModel[231].setRotationPoint(-46.8F, -39.6F, 3.4F);

		bodyModel[232].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 352
		bodyModel[232].setRotationPoint(-46.9F, -38.6F, 4.4F);
		bodyModel[232].rotateAngleX = 2.35619449F;

		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F); // Box 353
		bodyModel[233].setRotationPoint(-46.8F, -39.6F, 3.4F);

		bodyModel[234].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 354
		bodyModel[234].setRotationPoint(-46.9F, -38.6F, 4.4F);
		bodyModel[234].rotateAngleX = 1.57079633F;

		bodyModel[235].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 355
		bodyModel[235].setRotationPoint(-46.8F, -39.6F, 4.4F);

		bodyModel[236].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 356
		bodyModel[236].setRotationPoint(-46.9F, -38.6F, 4.4F);
		bodyModel[236].rotateAngleX = 0.78539816F;

		bodyModel[237].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 387
		bodyModel[237].setRotationPoint(-46.8F, -36.6F, -6.3F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F); // Box 388
		bodyModel[238].setRotationPoint(-46.8F, -36.6F, -7.3F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 390
		bodyModel[239].setRotationPoint(-46.8F, -36.6F, -6.3F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F); // Box 391
		bodyModel[240].setRotationPoint(-46.8F, -36.6F, -7.3F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 392
		bodyModel[241].setRotationPoint(-46.8F, -35.6F, -7.3F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 393
		bodyModel[242].setRotationPoint(-46.8F, -35.6F, -7.3F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 394
		bodyModel[243].setRotationPoint(-46.8F, -35.6F, -6.3F);

		bodyModel[244].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 395
		bodyModel[244].setRotationPoint(-46.8F, -36.2F, -6.3F);

		bodyModel[245].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, 0F, 0F, -0.48F, 0F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, 0F, 0F, -0.48F, 0F); // Box 396
		bodyModel[245].setRotationPoint(-46.9F, -36.2F, -6.3F);
		bodyModel[245].rotateAngleX = -1.29154365F;

		bodyModel[246].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 397
		bodyModel[246].setRotationPoint(-46.9F, -35.6F, -6.3F);
		bodyModel[246].rotateAngleX = 3.14159265F;

		bodyModel[247].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 398
		bodyModel[247].setRotationPoint(-46.9F, -35.6F, -6.3F);
		bodyModel[247].rotateAngleX = 3.92699082F;

		bodyModel[248].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 399
		bodyModel[248].setRotationPoint(-46.9F, -35.6F, -6.3F);
		bodyModel[248].rotateAngleX = 5.49778714F;

		bodyModel[249].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 400
		bodyModel[249].setRotationPoint(-46.9F, -35.6F, -6.3F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F); // Box 401
		bodyModel[250].setRotationPoint(-46.7F, -36.8F, -7.3F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F); // Box 402
		bodyModel[251].setRotationPoint(-46.6F, -37.1F, -3.7F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F); // Box 403
		bodyModel[252].setRotationPoint(-46.6F, -37.1F, -3.7F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F); // Box 404
		bodyModel[253].setRotationPoint(-46.6F, -37.1F, -3.7F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 405
		bodyModel[254].setRotationPoint(-46.6F, -37.1F, -2.7F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 406
		bodyModel[255].setRotationPoint(-46.6F, -37.1F, -2.7F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 407
		bodyModel[256].setRotationPoint(-46.6F, -36.1F, -2.7F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 408
		bodyModel[257].setRotationPoint(-46.6F, -36.1F, -3.7F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 409
		bodyModel[258].setRotationPoint(-46.6F, -36.1F, -3.7F);

		bodyModel[259].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 410
		bodyModel[259].setRotationPoint(-46.7F, -36.1F, -2.7F);
		bodyModel[259].rotateAngleX = 3.92699082F;

		bodyModel[260].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 411
		bodyModel[260].setRotationPoint(-46.7F, -36.1F, -2.7F);
		bodyModel[260].rotateAngleX = 3.14159265F;

		bodyModel[261].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 412
		bodyModel[261].setRotationPoint(-46.7F, -36.1F, -2.7F);
		bodyModel[261].rotateAngleX = 2.35619449F;

		bodyModel[262].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 413
		bodyModel[262].setRotationPoint(-46.7F, -36.1F, -2.7F);
		bodyModel[262].rotateAngleX = 1.57079633F;

		bodyModel[263].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 414
		bodyModel[263].setRotationPoint(-46.7F, -36.1F, -2.7F);
		bodyModel[263].rotateAngleX = 0.78539816F;

		bodyModel[264].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 415
		bodyModel[264].setRotationPoint(-46.7F, -36.1F, -2.7F);

		bodyModel[265].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 416
		bodyModel[265].setRotationPoint(-46.7F, -36.1F, -2.7F);
		bodyModel[265].rotateAngleX = 5.49778714F;

		bodyModel[266].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 417
		bodyModel[266].setRotationPoint(-46.7F, -36.1F, -2.7F);
		bodyModel[266].rotateAngleX = 4.71238898F;

		bodyModel[267].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 418
		bodyModel[267].setRotationPoint(-46.6F, -36.1F, -2.7F);

		bodyModel[268].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F); // Box 419
		bodyModel[268].setRotationPoint(-46.7F, -36.1F, -2.7F);
		bodyModel[268].rotateAngleX = -1.57079633F;

		bodyModel[269].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 421
		bodyModel[269].setRotationPoint(-46.6F, -34.1F, -1.1F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 422
		bodyModel[270].setRotationPoint(-46.6F, -34.1F, -1.1F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F); // Box 423
		bodyModel[271].setRotationPoint(-46.6F, -34.1F, -1.1F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F); // Box 424
		bodyModel[272].setRotationPoint(-46.6F, -34.1F, -1.1F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F); // Box 425
		bodyModel[273].setRotationPoint(-46.6F, -34.1F, -1.1F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F); // Box 426
		bodyModel[274].setRotationPoint(-46.6F, -34.1F, -1.1F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F); // Box 427
		bodyModel[275].setRotationPoint(-46.6F, -34.1F, -1.1F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 428
		bodyModel[276].setRotationPoint(-46.6F, -34.1F, -1.1F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 429
		bodyModel[277].setRotationPoint(-46.8F, -39.6F, -4.4F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 430
		bodyModel[278].setRotationPoint(-46.8F, -39.6F, -4.4F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F); // Box 431
		bodyModel[279].setRotationPoint(-46.8F, -39.6F, -5.4F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F); // Box 432
		bodyModel[280].setRotationPoint(-46.8F, -39.6F, -5.4F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F); // Box 433
		bodyModel[281].setRotationPoint(-46.8F, -39.6F, -5.4F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 434
		bodyModel[282].setRotationPoint(-46.8F, -38.6F, -5.4F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 435
		bodyModel[283].setRotationPoint(-46.8F, -38.6F, -5.4F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 436
		bodyModel[284].setRotationPoint(-46.8F, -38.6F, -4.4F);

		bodyModel[285].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 437
		bodyModel[285].setRotationPoint(-46.9F, -38.6F, -4.4F);
		bodyModel[285].rotateAngleX = 5.49778714F;

		bodyModel[286].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 438
		bodyModel[286].setRotationPoint(-46.9F, -38.6F, -4.4F);

		bodyModel[287].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 439
		bodyModel[287].setRotationPoint(-46.9F, -38.6F, -4.4F);
		bodyModel[287].rotateAngleX = 0.78539816F;

		bodyModel[288].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 440
		bodyModel[288].setRotationPoint(-46.9F, -38.6F, -4.4F);
		bodyModel[288].rotateAngleX = 1.57079633F;

		bodyModel[289].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 441
		bodyModel[289].setRotationPoint(-46.9F, -38.6F, -4.4F);
		bodyModel[289].rotateAngleX = 2.35619449F;

		bodyModel[290].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 442
		bodyModel[290].setRotationPoint(-46.9F, -38.6F, -4.4F);
		bodyModel[290].rotateAngleX = 3.14159265F;

		bodyModel[291].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 443
		bodyModel[291].setRotationPoint(-46.9F, -38.6F, -4.4F);
		bodyModel[291].rotateAngleX = 3.92699082F;

		bodyModel[292].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 444
		bodyModel[292].setRotationPoint(-46.9F, -38.6F, -4.4F);
		bodyModel[292].rotateAngleX = 4.71238898F;

		bodyModel[293].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 445
		bodyModel[293].setRotationPoint(-46.8F, -38.6F, -4.4F);

		bodyModel[294].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, 0F, 0F, -0.48F, 0F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, 0F, 0F, -0.48F, 0F); // Box 446
		bodyModel[294].setRotationPoint(-46.9F, -38.6F, -4.4F);
		bodyModel[294].rotateAngleX = -4.36332313F;

		bodyModel[295].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, 0F, 0F, -0.48F, 0F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, 0F, 0F, -0.48F, 0F); // Box 447
		bodyModel[295].setRotationPoint(-46.9F, -38.6F, -4.4F);
		bodyModel[295].rotateAngleX = -1.32645023F;

		bodyModel[296].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 448
		bodyModel[296].setRotationPoint(-46.8F, -33.5F, 3.5F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F); // Box 449
		bodyModel[297].setRotationPoint(-46.8F, -34F, 3F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F); // Box 450
		bodyModel[298].setRotationPoint(-46.8F, -34F, 3F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F); // Box 451
		bodyModel[299].setRotationPoint(-46.8F, -34F, 3F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F); // Box 452
		bodyModel[300].setRotationPoint(-46.8F, -34F, 3F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F); // Box 453
		bodyModel[301].setRotationPoint(-46.8F, -34F, 3F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 454
		bodyModel[302].setRotationPoint(-46.8F, -34F, 3F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 455
		bodyModel[303].setRotationPoint(-46.8F, -34F, 3F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 456
		bodyModel[304].setRotationPoint(-46.8F, -34F, 3F);

		bodyModel[305].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F); // Box 457
		bodyModel[305].setRotationPoint(-46.9F, -33.5F, 3.5F);
		bodyModel[305].rotateAngleX = -1.57079633F;

		bodyModel[306].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F); // Box 458
		bodyModel[306].setRotationPoint(-46.7F, -33.6F, 1.5F);
		bodyModel[306].rotateAngleX = -1.57079633F;

		bodyModel[307].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 459
		bodyModel[307].setRotationPoint(-46.6F, -33.6F, 1.5F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F); // Box 460
		bodyModel[308].setRotationPoint(-46.6F, -34.1F, 1F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F); // Box 461
		bodyModel[309].setRotationPoint(-46.6F, -34.1F, 1F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F); // Box 462
		bodyModel[310].setRotationPoint(-46.6F, -34.1F, 1F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 463
		bodyModel[311].setRotationPoint(-46.6F, -34.1F, 1F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 464
		bodyModel[312].setRotationPoint(-46.6F, -34.1F, 1F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 465
		bodyModel[313].setRotationPoint(-46.6F, -34.1F, 1F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F); // Box 466
		bodyModel[314].setRotationPoint(-46.6F, -34.1F, 1F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F); // Box 467
		bodyModel[315].setRotationPoint(-46.6F, -34.1F, 1F);

		bodyModel[316].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F); // Box 468
		bodyModel[316].setRotationPoint(-46.9F, -39F, 2F);
		bodyModel[316].rotateAngleX = 1.57079633F;

		bodyModel[317].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 469
		bodyModel[317].setRotationPoint(-46.8F, -39F, 2F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F); // Box 470
		bodyModel[318].setRotationPoint(-46.8F, -39.5F, 1.5F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F); // Box 471
		bodyModel[319].setRotationPoint(-46.8F, -39.5F, 1.5F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F); // Box 472
		bodyModel[320].setRotationPoint(-46.8F, -39.5F, 1.5F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 473
		bodyModel[321].setRotationPoint(-46.8F, -39.5F, 1.5F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 474
		bodyModel[322].setRotationPoint(-46.8F, -39.5F, 1.5F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 475
		bodyModel[323].setRotationPoint(-46.8F, -39.5F, 1.5F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F); // Box 476
		bodyModel[324].setRotationPoint(-46.8F, -39.5F, 1.5F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F); // Box 477
		bodyModel[325].setRotationPoint(-46.8F, -39.5F, 1.5F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F); // Box 478
		bodyModel[326].setRotationPoint(-46.8F, -34F, -6.5F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F); // Box 480
		bodyModel[327].setRotationPoint(-46.8F, -34F, -6.5F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F); // Box 481
		bodyModel[328].setRotationPoint(-46.8F, -34F, -6.5F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F); // Box 482
		bodyModel[329].setRotationPoint(-46.8F, -34F, -6.5F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F); // Box 483
		bodyModel[330].setRotationPoint(-46.8F, -34F, -6.5F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 484
		bodyModel[331].setRotationPoint(-46.8F, -34F, -6.5F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 485
		bodyModel[332].setRotationPoint(-46.8F, -34F, -6.5F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 486
		bodyModel[333].setRotationPoint(-46.8F, -34F, -6.5F);

		bodyModel[334].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, 0F, 0F, -0.48F, 0F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, 0F, 0F, -0.48F, 0F); // Box 487
		bodyModel[334].setRotationPoint(-46.9F, -33.5F, -6.6F);
		bodyModel[334].rotateAngleX = -0.38397244F;

		bodyModel[335].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 488
		bodyModel[335].setRotationPoint(-46.8F, -31.3F, -1.6F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 489
		bodyModel[336].setRotationPoint(-46.8F, -31.3F, 0.4F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F); // Box 460
		bodyModel[337].setRotationPoint(-46.8F, -34.5F, 4.8F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 461
		bodyModel[338].setRotationPoint(-46.8F, -34.5F, 5.8F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 462
		bodyModel[339].setRotationPoint(-46.8F, -33.5F, 5.8F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 463
		bodyModel[340].setRotationPoint(-46.8F, -33.5F, 4.8F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 464
		bodyModel[341].setRotationPoint(-46.8F, -33.5F, 4.8F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F); // Box 465
		bodyModel[342].setRotationPoint(-46.8F, -34.5F, 4.8F);

		bodyModel[343].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 466
		bodyModel[343].setRotationPoint(-46.9F, -33.5F, 5.8F);
		bodyModel[343].rotateAngleX = 3.14159265F;

		bodyModel[344].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F); // Box 467
		bodyModel[344].setRotationPoint(-46.8F, -34.5F, 4.8F);

		bodyModel[345].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F); // Box 468
		bodyModel[345].setRotationPoint(-46.9F, -33.5F, 5.8F);
		bodyModel[345].rotateAngleX = -3.90953752F;

		bodyModel[346].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 469
		bodyModel[346].setRotationPoint(-46.8F, -33.5F, 5.8F);

		bodyModel[347].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 470
		bodyModel[347].setRotationPoint(-46.9F, -33.5F, 5.8F);
		bodyModel[347].rotateAngleX = 3.92699082F;

		bodyModel[348].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 471
		bodyModel[348].setRotationPoint(-46.9F, -33.5F, 5.8F);
		bodyModel[348].rotateAngleX = 5.49778714F;

		bodyModel[349].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 472
		bodyModel[349].setRotationPoint(-46.9F, -33.5F, 5.8F);

		bodyModel[350].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 473
		bodyModel[350].setRotationPoint(-46.9F, -33.5F, 5.8F);
		bodyModel[350].rotateAngleX = 0.78539816F;

		bodyModel[351].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 474
		bodyModel[351].setRotationPoint(-46.9F, -33.5F, 5.8F);
		bodyModel[351].rotateAngleX = 1.57079633F;

		bodyModel[352].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 475
		bodyModel[352].setRotationPoint(-46.9F, -33.5F, 5.8F);
		bodyModel[352].rotateAngleX = 2.35619449F;

		bodyModel[353].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 476
		bodyModel[353].setRotationPoint(-46.8F, -34.5F, 5.8F);

		bodyModel[354].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F); // Box 477
		bodyModel[354].setRotationPoint(-46.9F, -38.5F, -2F);
		bodyModel[354].rotateAngleX = 1.57079633F;

		bodyModel[355].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 478
		bodyModel[355].setRotationPoint(-46.8F, -39F, -2F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 479
		bodyModel[356].setRotationPoint(-46.8F, -39.5F, -2.5F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 480
		bodyModel[357].setRotationPoint(-46.8F, -39.5F, -2.5F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F); // Box 481
		bodyModel[358].setRotationPoint(-46.8F, -39.5F, -2.5F);

		bodyModel[359].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F); // Box 482
		bodyModel[359].setRotationPoint(-46.8F, -39.5F, -2.5F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F); // Box 483
		bodyModel[360].setRotationPoint(-46.8F, -39.5F, -2.5F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F); // Box 484
		bodyModel[361].setRotationPoint(-46.8F, -39.5F, -2.5F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F); // Box 485
		bodyModel[362].setRotationPoint(-46.8F, -39.5F, -2.5F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 486
		bodyModel[363].setRotationPoint(-46.8F, -39.5F, -2.5F);

		bodyModel[364].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 487
		bodyModel[364].setRotationPoint(-46.8F, -34.8F, -4F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 14, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 462
		bodyModel[365].setRotationPoint(-59F, -41F, -8F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, -2F, 0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 2F, 2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 463
		bodyModel[366].setRotationPoint(-49F, -41F, -11F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 465
		bodyModel[367].setRotationPoint(-46.5F, -41.5F, -1F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, 0F); // Box 466
		bodyModel[368].setRotationPoint(-46.5F, -42F, -1F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 467
		bodyModel[369].setRotationPoint(-45F, -42.25F, -1F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 468
		bodyModel[370].setRotationPoint(-45F, -41.25F, -1F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.6F, -0.25F, 0F); // Box 469
		bodyModel[371].setRotationPoint(-45.1F, -40.75F, -1F);

		bodyModel[372].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.7F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.5F, 0F, -0.7F, -0.5F, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 470
		bodyModel[372].setRotationPoint(-46.5F, -43F, -1F);

		bodyModel[373].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.7F, -0.5F, -0.3F, -0.2F, -0.5F, -0.3F, -0.2F, -0.3F, 0F, -0.7F, -0.3F, 0F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 471
		bodyModel[373].setRotationPoint(-46.5F, -43F, 0F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.1F); // Box 472
		bodyModel[374].setRotationPoint(-44.7F, -42F, -1F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F,-2F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 512
		bodyModel[375].setRotationPoint(-53F, -41F, -11F);

		bodyModel[376].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1F, 0F, -1.5F); // Box 513
		bodyModel[376].setRotationPoint(-50F, -39F, -12F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 514
		bodyModel[377].setRotationPoint(-49F, -37F, -12F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 2F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 2F, 2F, 0F, 0F, 2F, 0F); // Box 397
		bodyModel[378].setRotationPoint(-49F, -41F, 8F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 398
		bodyModel[379].setRotationPoint(-53F, -41F, 8F);

		bodyModel[380].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 399
		bodyModel[380].setRotationPoint(-50F, -39F, 10F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 400
		bodyModel[381].setRotationPoint(-49F, -37F, 11F);

		bodyModel[382].addShapeBox(0F, 0F, 0F, 12, 10, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 595
		bodyModel[382].setRotationPoint(-61F, -31F, -12F);

		bodyModel[383].addShapeBox(0F, -3F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 259
		bodyModel[383].setRotationPoint(-48F, -21F, -6F);
		bodyModel[383].rotateAngleZ = 0.34906585F;

		bodyModel[384].addShapeBox(0F, -3F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
		bodyModel[384].setRotationPoint(-48F, -21F, 4F);
		bodyModel[384].rotateAngleZ = 0.34906585F;

		bodyModel[385].addShapeBox(0F, 0F, 0F, 5, 10, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 256
		bodyModel[385].setRotationPoint(-53F, -31F, -2F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[386].setRotationPoint(-47F, -22F, -2F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 7, 3, 3, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 254
		bodyModel[387].setRotationPoint(-47F, -23F, -1.5F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 263
		bodyModel[388].setRotationPoint(-45.5F, -26F, -1F);

		bodyModel[389].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 264
		bodyModel[389].setRotationPoint(-45F, -30F, -0.5F);

		bodyModel[390].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 265
		bodyModel[390].setRotationPoint(-45F, -32F, -0.5F);

		bodyModel[391].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 266
		bodyModel[391].setRotationPoint(-44.7F, -32.1F, -0.5F);

		bodyModel[392].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 601
		bodyModel[392].setRotationPoint(-41.5F, -32.3F, -12.5F);

		bodyModel[393].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 602
		bodyModel[393].setRotationPoint(-41F, -30.3F, -13F);

		bodyModel[394].addShapeBox(-1F, -2F, 0F, 1, 2, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 603
		bodyModel[394].setRotationPoint(-40F, -30.3F, -12.2F);
		bodyModel[394].rotateAngleZ = 0.36651914F;

		bodyModel[395].addShapeBox(-1F, -2F, 0F, 1, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 604
		bodyModel[395].setRotationPoint(-40F, -30.3F, -11.7F);
		bodyModel[395].rotateAngleZ = 0.36651914F;

		bodyModel[396].addShapeBox(0F, 0F, 0F, 15, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 967
		bodyModel[396].setRotationPoint(-45F, -27.3F, -12F);

		bodyModel[397].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 968
		bodyModel[397].setRotationPoint(-46F, -27.3F, -12F);

		bodyModel[398].addShapeBox(0F, 0F, 0F, 15, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 417
		bodyModel[398].setRotationPoint(-45F, -27.3F, 9F);

		bodyModel[399].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 418
		bodyModel[399].setRotationPoint(-46F, -27.3F, 9F);

		bodyModel[400].addShapeBox(0F, 1F, 0F, 10, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
		bodyModel[400].setRotationPoint(-44F, -25F, -5F);
		bodyModel[400].rotateAngleZ = -0.10471976F;

		bodyModel[401].addShapeBox(9F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		bodyModel[401].setRotationPoint(-44F, -25F, -5F);
		bodyModel[401].rotateAngleZ = -0.10471976F;

		bodyModel[402].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		bodyModel[402].setRotationPoint(-44F, -25F, -5F);
		bodyModel[402].rotateAngleZ = -0.10471976F;

		bodyModel[403].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		bodyModel[403].setRotationPoint(-44F, -25F, 4F);
		bodyModel[403].rotateAngleZ = -0.10471976F;

		bodyModel[404].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		bodyModel[404].setRotationPoint(-44F, -25F, -5F);
		bodyModel[404].rotateAngleZ = -0.10471976F;

		bodyModel[405].addShapeBox(0F, 0F, 0F, 1, 15, 10, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		bodyModel[405].setRotationPoint(-35F, -39F, -5F);

		bodyModel[406].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[406].setRotationPoint(-33F, -43F, -3F);

		bodyModel[407].addShapeBox(0F, 0F, 0F, 1, 15, 8, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 246
		bodyModel[407].setRotationPoint(-36F, -38F, -4F);

		bodyModel[408].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[408].setRotationPoint(-36.3F, -38.3F, -2F);

		bodyModel[409].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[409].setRotationPoint(-36.3F, -38.3F, 1F);

		bodyModel[410].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[410].setRotationPoint(-35F, -36F, -4F);

		bodyModel[411].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 251
		bodyModel[411].setRotationPoint(-35F, -36F, 3F);

		bodyModel[412].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[412].setRotationPoint(-41F, -24F, -6F);
		bodyModel[412].rotateAngleZ = 0.78539816F;

		bodyModel[413].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 253
		bodyModel[413].setRotationPoint(-41F, -24F, 5F);
		bodyModel[413].rotateAngleZ = 0.78539816F;

		bodyModel[414].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 962
		bodyModel[414].setRotationPoint(-33.5F, -42.5F, -1.5F);

		bodyModel[415].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 964
		bodyModel[415].setRotationPoint(-33.5F, -41.5F, -1.5F);

		bodyModel[416].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 966
		bodyModel[416].setRotationPoint(-33.5F, -40.5F, -1.5F);

		bodyModel[417].addShapeBox(0F, 0F, 0F, 12, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 484
		bodyModel[417].setRotationPoint(14F, -35F, -8F);

		bodyModel[418].addShapeBox(0F, 0F, 0F, 3, 5, 2, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 1F); // Box 485
		bodyModel[418].setRotationPoint(11F, -35F, -8F);

		bodyModel[419].addShapeBox(0F, 0F, 0F, 3, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, 1F, 0F, 0F, 0F); // Box 487
		bodyModel[419].setRotationPoint(26F, -35F, -8F);

		bodyModel[420].addShapeBox(0F, 0F, 0F, 2, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 488
		bodyModel[420].setRotationPoint(27F, -35F, -5F);

		bodyModel[421].addShapeBox(0F, 0F, 0F, 2, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 489
		bodyModel[421].setRotationPoint(11F, -35F, -5F);

		bodyModel[422].addShapeBox(0F, 0F, 0F, 12, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 490
		bodyModel[422].setRotationPoint(14F, -35F, 6F);

		bodyModel[423].addShapeBox(0F, 0F, 0F, 3, 5, 2, 0F,-2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 491
		bodyModel[423].setRotationPoint(11F, -35F, 6F);

		bodyModel[424].addShapeBox(0F, 0F, 0F, 3, 5, 2, 0F,0F, 0F, 0F, -2F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 492
		bodyModel[424].setRotationPoint(26F, -35F, 6F);

		bodyModel[425].addShapeBox(0F, 0F, 0F, 6, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 493
		bodyModel[425].setRotationPoint(29F, -34F, -4F);

		bodyModel[426].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 494
		bodyModel[426].setRotationPoint(31F, -36F, -4F);

		bodyModel[427].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 495
		bodyModel[427].setRotationPoint(31F, -37F, -4F);

		bodyModel[428].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 496
		bodyModel[428].setRotationPoint(14F, -30F, -8F);

		bodyModel[429].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 497
		bodyModel[429].setRotationPoint(14F, -30F, 7F);

		bodyModel[430].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 498
		bodyModel[430].setRotationPoint(25F, -30F, 7F);

		bodyModel[431].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 499
		bodyModel[431].setRotationPoint(25F, -30F, -8F);

		bodyModel[432].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 578
		bodyModel[432].setRotationPoint(15F, -35F, 3F);

		bodyModel[433].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 579
		bodyModel[433].setRotationPoint(15F, -35F, -4F);

		bodyModel[434].addShapeBox(0F, 0F, 0F, 1, 15, 10, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 580
		bodyModel[434].setRotationPoint(16F, -38F, -5F);

		bodyModel[435].addShapeBox(0F, 1F, 0F, 10, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 582
		bodyModel[435].setRotationPoint(16F, -24F, -5F);
		bodyModel[435].rotateAngleZ = 0.08726646F;

		bodyModel[436].addShapeBox(-2F, 0.25F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 583
		bodyModel[436].setRotationPoint(18F, -24F, -5F);
		bodyModel[436].rotateAngleZ = 0.08726646F;

		bodyModel[437].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 584
		bodyModel[437].setRotationPoint(16F, -30F, -6F);
		bodyModel[437].rotateAngleZ = -0.78539816F;

		bodyModel[438].addShapeBox(0F, -0.3F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 585
		bodyModel[438].setRotationPoint(25F, -24F, -5F);
		bodyModel[438].rotateAngleZ = 0.12217305F;

		bodyModel[439].addShapeBox(-2F, 0.25F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 586
		bodyModel[439].setRotationPoint(18F, -24F, 4F);
		bodyModel[439].rotateAngleZ = 0.08726646F;

		bodyModel[440].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 587
		bodyModel[440].setRotationPoint(16F, -30F, 5F);
		bodyModel[440].rotateAngleZ = -0.78539816F;

		bodyModel[441].addShapeBox(0F, 0F, 0F, 1, 14, 8, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 588
		bodyModel[441].setRotationPoint(17F, -37F, -4F);

		bodyModel[442].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 589
		bodyModel[442].setRotationPoint(17.3F, -37.3F, 1F);

		bodyModel[443].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 590
		bodyModel[443].setRotationPoint(17.3F, -37.3F, -2F);

		bodyModel[444].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 591
		bodyModel[444].setRotationPoint(14.5F, -39.5F, -1.5F);

		bodyModel[445].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 592
		bodyModel[445].setRotationPoint(14.5F, -40.5F, -1.5F);

		bodyModel[446].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 593
		bodyModel[446].setRotationPoint(14.5F, -41.5F, -1.5F);

		bodyModel[447].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 594
		bodyModel[447].setRotationPoint(14F, -42F, -3F);

		bodyModel[448].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 399
		bodyModel[448].setRotationPoint(31F, -44F, -0.5F);
	}

	private void initnoseModel_1()
	{
		noseModel[0] = new ModelRendererTurbo(this, 1, 974, textureX, textureY); // Box 15
		noseModel[1] = new ModelRendererTurbo(this, 65, 974, textureX, textureY); // Box 16
		noseModel[2] = new ModelRendererTurbo(this, 137, 974, textureX, textureY); // Box 17
		noseModel[3] = new ModelRendererTurbo(this, 209, 974, textureX, textureY); // Box 18
		noseModel[4] = new ModelRendererTurbo(this, 273, 974, textureX, textureY); // Box 19
		noseModel[5] = new ModelRendererTurbo(this, 345, 974, textureX, textureY); // Box 20
		noseModel[6] = new ModelRendererTurbo(this, 401, 974, textureX, textureY); // Box 21
		noseModel[7] = new ModelRendererTurbo(this, 465, 974, textureX, textureY); // Box 22
		noseModel[8] = new ModelRendererTurbo(this, 529, 974, textureX, textureY); // Box 23
		noseModel[9] = new ModelRendererTurbo(this, 593, 974, textureX, textureY); // Box 24
		noseModel[10] = new ModelRendererTurbo(this, 657, 974, textureX, textureY); // Box 38
		noseModel[11] = new ModelRendererTurbo(this, 721, 974, textureX, textureY); // Box 39
		noseModel[12] = new ModelRendererTurbo(this, 761, 974, textureX, textureY); // Box 48
		noseModel[13] = new ModelRendererTurbo(this, 817, 974, textureX, textureY); // Box 49
		noseModel[14] = new ModelRendererTurbo(this, 49, 974, textureX, textureY); // Box 90
		noseModel[15] = new ModelRendererTurbo(this, 113, 974, textureX, textureY); // Box 91
		noseModel[16] = new ModelRendererTurbo(this, 185, 974, textureX, textureY); // Box 92
		noseModel[17] = new ModelRendererTurbo(this, 257, 974, textureX, textureY); // Box 93
		noseModel[18] = new ModelRendererTurbo(this, 321, 974, textureX, textureY); // Box 94
		noseModel[19] = new ModelRendererTurbo(this, 865, 974, textureX, textureY); // Box 95
		noseModel[20] = new ModelRendererTurbo(this, 449, 974, textureX, textureY); // Box 96
		noseModel[21] = new ModelRendererTurbo(this, 1, 999, textureX, textureY); // Box 177
		noseModel[22] = new ModelRendererTurbo(this, 65, 999, textureX, textureY); // Box 178
		noseModel[23] = new ModelRendererTurbo(this, 137, 999, textureX, textureY); // Box 179
		noseModel[24] = new ModelRendererTurbo(this, 209, 999, textureX, textureY); // Box 180
		noseModel[25] = new ModelRendererTurbo(this, 273, 999, textureX, textureY); // Box 181
		noseModel[26] = new ModelRendererTurbo(this, 345, 999, textureX, textureY); // Box 182
		noseModel[27] = new ModelRendererTurbo(this, 401, 999, textureX, textureY); // Box 183
		noseModel[28] = new ModelRendererTurbo(this, 465, 999, textureX, textureY); // Box 184
		noseModel[29] = new ModelRendererTurbo(this, 529, 999, textureX, textureY); // Box 185
		noseModel[30] = new ModelRendererTurbo(this, 593, 999, textureX, textureY); // Box 186
		noseModel[31] = new ModelRendererTurbo(this, 657, 999, textureX, textureY); // Box 200
		noseModel[32] = new ModelRendererTurbo(this, 721, 999, textureX, textureY); // Box 201
		noseModel[33] = new ModelRendererTurbo(this, 761, 999, textureX, textureY); // Box 210
		noseModel[34] = new ModelRendererTurbo(this, 817, 999, textureX, textureY); // Box 211
		noseModel[35] = new ModelRendererTurbo(this, 49, 999, textureX, textureY); // Box 252
		noseModel[36] = new ModelRendererTurbo(this, 113, 999, textureX, textureY); // Box 253
		noseModel[37] = new ModelRendererTurbo(this, 185, 999, textureX, textureY); // Box 254
		noseModel[38] = new ModelRendererTurbo(this, 257, 999, textureX, textureY); // Box 255
		noseModel[39] = new ModelRendererTurbo(this, 321, 999, textureX, textureY); // Box 256
		noseModel[40] = new ModelRendererTurbo(this, 865, 999, textureX, textureY); // Box 257
		noseModel[41] = new ModelRendererTurbo(this, 449, 999, textureX, textureY); // Box 258
		noseModel[42] = new ModelRendererTurbo(this, 577, 999, textureX, textureY); // Box 1
		noseModel[43] = new ModelRendererTurbo(this, 641, 999, textureX, textureY); // Box 2
		noseModel[44] = new ModelRendererTurbo(this, 705, 999, textureX, textureY); // Box 5
		noseModel[45] = new ModelRendererTurbo(this, 801, 999, textureX, textureY); // Box 6
		noseModel[46] = new ModelRendererTurbo(this, 889, 999, textureX, textureY); // Box 7
		noseModel[47] = new ModelRendererTurbo(this, 913, 999, textureX, textureY); // Box 8
		noseModel[48] = new ModelRendererTurbo(this, 937, 999, textureX, textureY); // Box 247
		noseModel[49] = new ModelRendererTurbo(this, 961, 999, textureX, textureY); // Box 248
		noseModel[50] = new ModelRendererTurbo(this, 985, 999, textureX, textureY); // Box 249
		noseModel[51] = new ModelRendererTurbo(this, 857, 999, textureX, textureY); // Box 444
		noseModel[52] = new ModelRendererTurbo(this, 1009, 999, textureX, textureY); // Box 445
		noseModel[53] = new ModelRendererTurbo(this, 1025, 999, textureX, textureY); // Box 446
		noseModel[54] = new ModelRendererTurbo(this, 1041, 999, textureX, textureY); // Box 447
		noseModel[55] = new ModelRendererTurbo(this, 1057, 999, textureX, textureY); // Box 448
		noseModel[56] = new ModelRendererTurbo(this, 1073, 999, textureX, textureY); // Box 449
		noseModel[57] = new ModelRendererTurbo(this, 1114, 996, textureX, textureY); // Box 452
		noseModel[58] = new ModelRendererTurbo(this, 1114, 996, textureX, textureY); // Box 453
		noseModel[59] = new ModelRendererTurbo(this, 1, 974, textureX, textureY); // Box 239
		noseModel[60] = new ModelRendererTurbo(this, 65, 974, textureX, textureY); // Box 240
		noseModel[61] = new ModelRendererTurbo(this, 129, 974, textureX, textureY); // Box 241
		noseModel[62] = new ModelRendererTurbo(this, 201, 974, textureX, textureY); // Box 242
		noseModel[63] = new ModelRendererTurbo(this, 49, 974, textureX, textureY); // Box 243
		noseModel[64] = new ModelRendererTurbo(this, 273, 974, textureX, textureY); // Box 244
		noseModel[65] = new ModelRendererTurbo(this, 145, 974, textureX, textureY); // Box 245
		noseModel[66] = new ModelRendererTurbo(this, 345, 974, textureX, textureY); // Box 246
		noseModel[67] = new ModelRendererTurbo(this, 385, 974, textureX, textureY); // Box 247
		noseModel[68] = new ModelRendererTurbo(this, 113, 974, textureX, textureY); // Box 248
		noseModel[69] = new ModelRendererTurbo(this, 401, 974, textureX, textureY); // Box 249
		noseModel[70] = new ModelRendererTurbo(this, 185, 974, textureX, textureY); // Box 250
		noseModel[71] = new ModelRendererTurbo(this, 217, 974, textureX, textureY); // Box 251
		noseModel[72] = new ModelRendererTurbo(this, 449, 974, textureX, textureY); // Box 252
		noseModel[73] = new ModelRendererTurbo(this, 473, 974, textureX, textureY); // Box 253
		noseModel[74] = new ModelRendererTurbo(this, 513, 974, textureX, textureY); // Box 254
		noseModel[75] = new ModelRendererTurbo(this, 529, 974, textureX, textureY); // Box 262
		noseModel[76] = new ModelRendererTurbo(this, 1, 999, textureX, textureY); // Box 352
		noseModel[77] = new ModelRendererTurbo(this, 65, 999, textureX, textureY); // Box 353
		noseModel[78] = new ModelRendererTurbo(this, 129, 999, textureX, textureY); // Box 354
		noseModel[79] = new ModelRendererTurbo(this, 201, 999, textureX, textureY); // Box 355
		noseModel[80] = new ModelRendererTurbo(this, 49, 999, textureX, textureY); // Box 356
		noseModel[81] = new ModelRendererTurbo(this, 273, 999, textureX, textureY); // Box 357
		noseModel[82] = new ModelRendererTurbo(this, 145, 999, textureX, textureY); // Box 358
		noseModel[83] = new ModelRendererTurbo(this, 345, 999, textureX, textureY); // Box 359
		noseModel[84] = new ModelRendererTurbo(this, 385, 999, textureX, textureY); // Box 360
		noseModel[85] = new ModelRendererTurbo(this, 113, 999, textureX, textureY); // Box 361
		noseModel[86] = new ModelRendererTurbo(this, 401, 999, textureX, textureY); // Box 362
		noseModel[87] = new ModelRendererTurbo(this, 185, 999, textureX, textureY); // Box 363
		noseModel[88] = new ModelRendererTurbo(this, 217, 999, textureX, textureY); // Box 364
		noseModel[89] = new ModelRendererTurbo(this, 529, 999, textureX, textureY); // Box 365
		noseModel[90] = new ModelRendererTurbo(this, 449, 999, textureX, textureY); // Box 366
		noseModel[91] = new ModelRendererTurbo(this, 513, 999, textureX, textureY); // Box 367
		noseModel[92] = new ModelRendererTurbo(this, 473, 999, textureX, textureY); // Box 368
		noseModel[93] = new ModelRendererTurbo(this, 1081, 999, textureX, textureY); // Box 389
		noseModel[94] = new ModelRendererTurbo(this, 257, 974, textureX, textureY); // Box 390
		noseModel[95] = new ModelRendererTurbo(this, 257, 999, textureX, textureY); // Box 391
		noseModel[96] = new ModelRendererTurbo(this, 1121, 999, textureX, textureY); // Box 392
		noseModel[97] = new ModelRendererTurbo(this, 1114, 996, textureX, textureY); // Box 397
		noseModel[98] = new ModelRendererTurbo(this, 1114, 996, textureX, textureY); // Box 398
		noseModel[99] = new ModelRendererTurbo(this, 1114, 996, textureX, textureY); // Box 399
		noseModel[100] = new ModelRendererTurbo(this, 1114, 996, textureX, textureY); // Box 400
		noseModel[101] = new ModelRendererTurbo(this, 1114, 996, textureX, textureY); // Box 401
		noseModel[102] = new ModelRendererTurbo(this, 1114, 996, textureX, textureY); // Box 402

		noseModel[0].addShapeBox(0F, 0F, 0F, 15, 5, 13, 0F,0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -8F, 0F, 0.25F, -7.75F, 0F, 0.25F, 0F, 0F, -1F, 0F); // Box 15
		noseModel[0].setRotationPoint(-91F, -14F, -13F);

		noseModel[1].addShapeBox(0F, 0F, 0F, 15, 7, 17, 0F,0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -3.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		noseModel[1].setRotationPoint(-91F, -21F, -17F);

		noseModel[2].addShapeBox(0F, 0F, 0F, 15, 6, 17, 0F,0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		noseModel[2].setRotationPoint(-91F, -27F, -17F);

		noseModel[3].addShapeBox(0F, 0F, 0F, 15, 4, 16, 0F,0F, -1F, -3F, 0F, 0F, -2.75F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		noseModel[3].setRotationPoint(-91F, -36F, -16F);

		noseModel[4].addShapeBox(0F, 0F, 0F, 15, 5, 17, 0F,0F, 0F, -1F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		noseModel[4].setRotationPoint(-91F, -32F, -17F);

		noseModel[5].addShapeBox(0F, 0F, 0F, 13, 4, 13, 0F,0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, -9F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 20
		noseModel[5].setRotationPoint(-104F, -14F, -13F);

		noseModel[6].addShapeBox(0F, 0F, 0F, 13, 7, 17, 0F,0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, -6F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 21
		noseModel[6].setRotationPoint(-104F, -21F, -17F);

		noseModel[7].addShapeBox(0F, 0F, 0F, 13, 6, 17, 0F,0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 22
		noseModel[7].setRotationPoint(-104F, -27F, -17F);

		noseModel[8].addShapeBox(0F, 0F, 0F, 13, 3, 16, 0F,0F, -1F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 23
		noseModel[8].setRotationPoint(-104F, -35F, -16F);

		noseModel[9].addShapeBox(0F, 0F, 0F, 13, 5, 17, 0F,0F, -1F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 24
		noseModel[9].setRotationPoint(-104F, -32F, -17F);

		noseModel[10].addShapeBox(0F, 0F, 0F, 15, 4, 13, 0F,0F, -1F, -4F, 0F, 0F, -3.75F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 38
		noseModel[10].setRotationPoint(-91F, -40F, -13F);

		noseModel[11].addShapeBox(0F, 0F, 0F, 13, 4, 13, 0F,0F, -2F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 39
		noseModel[11].setRotationPoint(-104F, -39F, -13F);

		noseModel[12].addShapeBox(0F, 0F, 0F, 15, 2, 9, 0F,0F, -1F, -3F, 0F, 0.25F, -2.75F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 48
		noseModel[12].setRotationPoint(-91F, -42F, -9F);

		noseModel[13].addShapeBox(0F, 0F, 0F, 13, 2, 9, 0F,0F, -2F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 49
		noseModel[13].setRotationPoint(-104F, -41F, -9F);

		noseModel[14].addShapeBox(0F, 0F, 0F, 4, 4, 6, 0F,0F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 90
		noseModel[14].setRotationPoint(-108F, -26F, -15F);

		noseModel[15].addShapeBox(0F, 0F, 0F, 4, 5, 7, 0F,0F, -1F, -5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, -4F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, -1F); // Box 91
		noseModel[15].setRotationPoint(-108F, -31F, -15F);

		noseModel[16].addShapeBox(0F, 0F, 0F, 4, 3, 7, 0F,0F, -1F, -5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, -4F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, -1F); // Box 92
		noseModel[16].setRotationPoint(-108F, -34F, -14F);

		noseModel[17].addShapeBox(0F, 0F, 0F, 4, 3, 7, 0F,0F, -1F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 1F, -2F); // Box 93
		noseModel[17].setRotationPoint(-108F, -37F, -12F);

		noseModel[18].addShapeBox(0F, 0F, 0F, 4, 2, 8, 0F,0F, -1F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 94
		noseModel[18].setRotationPoint(-108F, -39F, -8F);

		noseModel[19].addShapeBox(0F, 0F, 0F, 4, 7, 10, 0F,0F, 1F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 1F, -4F, 0F, -1F, -8F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 95
		noseModel[19].setRotationPoint(-108F, -22F, -15F);

		noseModel[20].addShapeBox(0F, 0F, 0F, 4, 3, 11, 0F,0F, 1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, -8F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 96
		noseModel[20].setRotationPoint(-108F, -15F, -11F);

		noseModel[21].addShapeBox(0F, 0F, 0F, 15, 5, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -7.75F, 0F, -1F, -8F); // Box 177
		noseModel[21].setRotationPoint(-91F, -14F, 0F);

		noseModel[22].addShapeBox(0F, 0F, 0F, 15, 7, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.75F, 0F, 0F, -4F); // Box 178
		noseModel[22].setRotationPoint(-91F, -21F, 0F);

		noseModel[23].addShapeBox(0F, 0F, 0F, 15, 6, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F); // Box 179
		noseModel[23].setRotationPoint(-91F, -27F, 0F);

		noseModel[24].addShapeBox(0F, 0F, 0F, 15, 4, 16, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2.75F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F); // Box 180
		noseModel[24].setRotationPoint(-91F, -36F, 0F);

		noseModel[25].addShapeBox(0F, 0F, 0F, 15, 5, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F); // Box 181
		noseModel[25].setRotationPoint(-91F, -32F, 0F);

		noseModel[26].addShapeBox(0F, 0F, 0F, 13, 4, 13, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -2F, -9F); // Box 182
		noseModel[26].setRotationPoint(-104F, -14F, 0F);

		noseModel[27].addShapeBox(0F, 0F, 0F, 13, 7, 17, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, -6F); // Box 183
		noseModel[27].setRotationPoint(-104F, -21F, 0F);

		noseModel[28].addShapeBox(0F, 0F, 0F, 13, 6, 17, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F); // Box 184
		noseModel[28].setRotationPoint(-104F, -27F, 0F);

		noseModel[29].addShapeBox(0F, 0F, 0F, 13, 3, 16, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, -4F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F); // Box 185
		noseModel[29].setRotationPoint(-104F, -35F, 0F);

		noseModel[30].addShapeBox(0F, 0F, 0F, 13, 5, 17, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -3F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F); // Box 186
		noseModel[30].setRotationPoint(-104F, -32F, 0F);

		noseModel[31].addShapeBox(0F, 0F, 0F, 15, 4, 13, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -3.75F, 0F, -1F, -4F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 1F, 0F); // Box 200
		noseModel[31].setRotationPoint(-91F, -40F, 0F);

		noseModel[32].addShapeBox(0F, 0F, 0F, 13, 4, 13, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -2F, -5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F); // Box 201
		noseModel[32].setRotationPoint(-104F, -39F, 0F);

		noseModel[33].addShapeBox(0F, 0F, 0F, 15, 2, 9, 0F,0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -2.75F, 0F, -1F, -3F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 1F, 0F); // Box 210
		noseModel[33].setRotationPoint(-91F, -42F, 0F);

		noseModel[34].addShapeBox(0F, 0F, 0F, 13, 2, 9, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -4F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1F); // Box 211
		noseModel[34].setRotationPoint(-104F, -41F, 0F);

		noseModel[35].addShapeBox(0F, 0F, 0F, 4, 4, 6, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -4F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -4F); // Box 252
		noseModel[35].setRotationPoint(-108F, -26F, 9F);

		noseModel[36].addShapeBox(0F, 0F, 0F, 4, 5, 7, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -5F, 0F, 1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, -4F); // Box 253
		noseModel[36].setRotationPoint(-108F, -31F, 8F);

		noseModel[37].addShapeBox(0F, 0F, 0F, 4, 3, 7, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -5F, 0F, 1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, -4F); // Box 254
		noseModel[37].setRotationPoint(-108F, -34F, 7F);

		noseModel[38].addShapeBox(0F, 0F, 0F, 4, 3, 7, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, -5F, 0F, 1F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 1F, -3F); // Box 255
		noseModel[38].setRotationPoint(-108F, -37F, 5F);

		noseModel[39].addShapeBox(0F, 0F, 0F, 4, 2, 8, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, -4F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F); // Box 256
		noseModel[39].setRotationPoint(-108F, -39F, 0F);

		noseModel[40].addShapeBox(0F, 0F, 0F, 4, 7, 10, 0F,0F, 1F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 1F, -4F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, -8F); // Box 257
		noseModel[40].setRotationPoint(-108F, -22F, 5F);

		noseModel[41].addShapeBox(0F, 0F, 0F, 4, 3, 11, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -4F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -2F, -8F); // Box 258
		noseModel[41].setRotationPoint(-108F, -15F, 0F);

		noseModel[42].addShapeBox(0F, 0F, 0F, 7, 2, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 1
		noseModel[42].setRotationPoint(-116F, -29F, -2F);

		noseModel[43].addShapeBox(0F, 0F, 0F, 7, 2, 4, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 2
		noseModel[43].setRotationPoint(-116F, -27F, -2F);

		noseModel[44].addShapeBox(0F, 0F, 0F, 7, 2, 4, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 5
		noseModel[44].setRotationPoint(-116F, -25F, -2F);

		noseModel[45].addShapeBox(0F, 0F, 0F, 7, 2, 4, 0F,0F, -0.5F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -1F); // Box 6
		noseModel[45].setRotationPoint(-123F, -27F, -2F);

		noseModel[46].addShapeBox(0F, 0F, 0F, 7, 2, 4, 0F,0F, -2F, -1.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, -1.5F, 0F, 0.5F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, -1F); // Box 7
		noseModel[46].setRotationPoint(-123F, -29F, -2F);

		noseModel[47].addShapeBox(0F, 0F, 0F, 7, 2, 4, 0F,0F, 0.5F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, -1F, 0F, -2F, -1.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, -1.5F); // Box 8
		noseModel[47].setRotationPoint(-123F, -25F, -2F);

		noseModel[48].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		noseModel[48].setRotationPoint(-113F, -27.5F, -0.5F);

		noseModel[49].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		noseModel[49].setRotationPoint(-113F, -27.5F, -1.5F);

		noseModel[50].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 249
		noseModel[50].setRotationPoint(-113F, -27.5F, 0.5F);

		noseModel[51].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, -2F, -1.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, -1.5F, 0F, 0.5F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, -1F); // Box 444
		noseModel[51].setRotationPoint(-108F, -29F, -2F);

		noseModel[52].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, -0.5F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -1F); // Box 445
		noseModel[52].setRotationPoint(-108F, -27F, -2F);

		noseModel[53].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0.5F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, -1F, 0F, -2F, -1.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, -1.5F); // Box 446
		noseModel[53].setRotationPoint(-108F, -25F, -2F);

		noseModel[54].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 447
		noseModel[54].setRotationPoint(-106F, -29F, -2F);

		noseModel[55].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 448
		noseModel[55].setRotationPoint(-106F, -27F, -2F);

		noseModel[56].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 449
		noseModel[56].setRotationPoint(-106F, -25F, -2F);

		noseModel[57].addShapeBox(0F, -1F, -12F, 1, 2, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 452
		noseModel[57].setRotationPoint(-105F, -26F, 0F);
		noseModel[57].rotateAngleX = -1.57079633F;

		noseModel[58].addShapeBox(-1F, -1F, -12F, 1, 2, 24, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 453
		noseModel[58].setRotationPoint(-105F, -26F, 0F);
		noseModel[58].rotateAngleX = -1.57079633F;

		noseModel[59].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
		noseModel[59].setRotationPoint(-79.5F, -17F, -15F);

		noseModel[60].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 240
		noseModel[60].setRotationPoint(-79.5F, -15F, -15F);

		noseModel[61].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		noseModel[61].setRotationPoint(-79.5F, -16F, -15F);

		noseModel[62].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		noseModel[62].setRotationPoint(-76.5F, -17F, -18F);

		noseModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		noseModel[63].setRotationPoint(-77.5F, -17F, -16F);

		noseModel[64].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		noseModel[64].setRotationPoint(-79.5F, -16F, -17F);

		noseModel[65].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		noseModel[65].setRotationPoint(-79.5F, -16F, -18F);

		noseModel[66].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 246
		noseModel[66].setRotationPoint(-79.5F, -17F, -17F);

		noseModel[67].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		noseModel[67].setRotationPoint(-79.5F, -17F, -18F);

		noseModel[68].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		noseModel[68].setRotationPoint(-79.5F, -17F, -16F);

		noseModel[69].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 249
		noseModel[69].setRotationPoint(-76.5F, -16F, -18F);

		noseModel[70].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 250
		noseModel[70].setRotationPoint(-79.5F, -15F, -16F);

		noseModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 251
		noseModel[71].setRotationPoint(-77.5F, -15F, -16F);

		noseModel[72].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 252
		noseModel[72].setRotationPoint(-79.5F, -15F, -17F);

		noseModel[73].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 253
		noseModel[73].setRotationPoint(-79.5F, -15F, -18F);

		noseModel[74].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 254
		noseModel[74].setRotationPoint(-76.5F, -15F, -18F);

		noseModel[75].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 262
		noseModel[75].setRotationPoint(-76.5F, -16F, -16F);

		noseModel[76].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 352
		noseModel[76].setRotationPoint(-79.5F, -17F, 12F);

		noseModel[77].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 353
		noseModel[77].setRotationPoint(-79.5F, -15F, 12F);

		noseModel[78].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 354
		noseModel[78].setRotationPoint(-79.5F, -16F, 12F);

		noseModel[79].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 355
		noseModel[79].setRotationPoint(-76.5F, -17F, 15F);

		noseModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 356
		noseModel[80].setRotationPoint(-77.5F, -17F, 15F);

		noseModel[81].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 357
		noseModel[81].setRotationPoint(-79.5F, -16F, 15F);

		noseModel[82].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 358
		noseModel[82].setRotationPoint(-79.5F, -16F, 17F);

		noseModel[83].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 359
		noseModel[83].setRotationPoint(-79.5F, -17F, 16F);

		noseModel[84].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 360
		noseModel[84].setRotationPoint(-79.5F, -17F, 17F);

		noseModel[85].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 361
		noseModel[85].setRotationPoint(-79.5F, -17F, 15F);

		noseModel[86].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 362
		noseModel[86].setRotationPoint(-76.5F, -16F, 17F);

		noseModel[87].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 363
		noseModel[87].setRotationPoint(-79.5F, -15F, 15F);

		noseModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364
		noseModel[88].setRotationPoint(-77.5F, -15F, 15F);

		noseModel[89].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 365
		noseModel[89].setRotationPoint(-79.5F, -15F, 16F);

		noseModel[90].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F); // Box 366
		noseModel[90].setRotationPoint(-79.5F, -15F, 17F);

		noseModel[91].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 367
		noseModel[91].setRotationPoint(-76.5F, -15F, 15F);

		noseModel[92].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 368
		noseModel[92].setRotationPoint(-76.5F, -16F, 15F);

		noseModel[93].addShapeBox(0F, 0F, 0F, 13, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 389
		noseModel[93].setRotationPoint(-105F, -15F, -4F);

		noseModel[94].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 390
		noseModel[94].setRotationPoint(-106F, -15F, -4F);

		noseModel[95].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 391
		noseModel[95].setRotationPoint(-106F, -15F, 3F);

		noseModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 392
		noseModel[96].setRotationPoint(-106F, -12F, -3F);

		noseModel[97].addShapeBox(-1F, -1F, -12F, 1, 2, 24, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 397
		noseModel[97].setRotationPoint(-105F, -26F, 0F);

		noseModel[98].addShapeBox(0F, -1F, -12F, 1, 2, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 398
		noseModel[98].setRotationPoint(-105F, -26F, 0F);

		noseModel[99].addShapeBox(-1F, -1F, -12F, 1, 2, 24, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 399
		noseModel[99].setRotationPoint(-105F, -26F, 0F);
		noseModel[99].rotateAngleX = 0.78539816F;

		noseModel[100].addShapeBox(0F, -1F, -12F, 1, 2, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 400
		noseModel[100].setRotationPoint(-105F, -26F, 0F);
		noseModel[100].rotateAngleX = 0.78539816F;

		noseModel[101].addShapeBox(-1F, -1F, -12F, 1, 2, 24, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 401
		noseModel[101].setRotationPoint(-105F, -26F, 0F);
		noseModel[101].rotateAngleX = -0.78539816F;

		noseModel[102].addShapeBox(0F, -1F, -12F, 1, 2, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 402
		noseModel[102].setRotationPoint(-105F, -26F, 0F);
		noseModel[102].rotateAngleX = -0.78539816F;
	}

	private void inittailModel_1()
	{
		tailModel[0] = new ModelRendererTurbo(this, 1, 786, textureX, textureY); // Box 51
		tailModel[1] = new ModelRendererTurbo(this, 41, 786, textureX, textureY); // Box 52
		tailModel[2] = new ModelRendererTurbo(this, 65, 786, textureX, textureY); // Box 53
		tailModel[3] = new ModelRendererTurbo(this, 81, 786, textureX, textureY); // Box 54
		tailModel[4] = new ModelRendererTurbo(this, 121, 786, textureX, textureY); // Box 55
		tailModel[5] = new ModelRendererTurbo(this, 161, 786, textureX, textureY); // Box 56
		tailModel[6] = new ModelRendererTurbo(this, 201, 786, textureX, textureY); // Box 59
		tailModel[7] = new ModelRendererTurbo(this, 233, 786, textureX, textureY); // Box 60
		tailModel[8] = new ModelRendererTurbo(this, 313, 786, textureX, textureY); // Box 61
		tailModel[9] = new ModelRendererTurbo(this, 393, 786, textureX, textureY); // Box 62
		tailModel[10] = new ModelRendererTurbo(this, 457, 786, textureX, textureY); // Box 63
		tailModel[11] = new ModelRendererTurbo(this, 513, 786, textureX, textureY); // Box 64
		tailModel[12] = new ModelRendererTurbo(this, 593, 786, textureX, textureY); // Box 65
		tailModel[13] = new ModelRendererTurbo(this, 665, 786, textureX, textureY); // Box 66
		tailModel[14] = new ModelRendererTurbo(this, 737, 786, textureX, textureY); // Box 67
		tailModel[15] = new ModelRendererTurbo(this, 777, 786, textureX, textureY); // Box 68
		tailModel[16] = new ModelRendererTurbo(this, 817, 786, textureX, textureY); // Box 69
		tailModel[17] = new ModelRendererTurbo(this, 857, 786, textureX, textureY); // Box 70
		tailModel[18] = new ModelRendererTurbo(this, 897, 786, textureX, textureY); // Box 71
		tailModel[19] = new ModelRendererTurbo(this, 929, 786, textureX, textureY); // Box 72
		tailModel[20] = new ModelRendererTurbo(this, 969, 786, textureX, textureY); // Box 73
		tailModel[21] = new ModelRendererTurbo(this, 1, 614, textureX, textureY); // Box 123
		tailModel[22] = new ModelRendererTurbo(this, 65, 614, textureX, textureY); // Box 124
		tailModel[23] = new ModelRendererTurbo(this, 97, 614, textureX, textureY); // Box 125
		tailModel[24] = new ModelRendererTurbo(this, 161, 614, textureX, textureY); // Box 126
		tailModel[25] = new ModelRendererTurbo(this, 193, 614, textureX, textureY); // Box 127
		tailModel[26] = new ModelRendererTurbo(this, 217, 614, textureX, textureY); // Box 128
		tailModel[27] = new ModelRendererTurbo(this, 1, 678, textureX, textureY); // Box 135
		tailModel[28] = new ModelRendererTurbo(this, 153, 678, textureX, textureY); // Box 136
		tailModel[29] = new ModelRendererTurbo(this, 105, 678, textureX, textureY); // Box 138
		tailModel[30] = new ModelRendererTurbo(this, 265, 678, textureX, textureY); // Box 139
		tailModel[31] = new ModelRendererTurbo(this, 385, 678, textureX, textureY); // Box 140
		tailModel[32] = new ModelRendererTurbo(this, 1, 805, textureX, textureY); // Box 213
		tailModel[33] = new ModelRendererTurbo(this, 41, 805, textureX, textureY); // Box 214
		tailModel[34] = new ModelRendererTurbo(this, 65, 805, textureX, textureY); // Box 215
		tailModel[35] = new ModelRendererTurbo(this, 81, 805, textureX, textureY); // Box 216
		tailModel[36] = new ModelRendererTurbo(this, 121, 805, textureX, textureY); // Box 217
		tailModel[37] = new ModelRendererTurbo(this, 161, 805, textureX, textureY); // Box 218
		tailModel[38] = new ModelRendererTurbo(this, 201, 805, textureX, textureY); // Box 221
		tailModel[39] = new ModelRendererTurbo(this, 233, 805, textureX, textureY); // Box 222
		tailModel[40] = new ModelRendererTurbo(this, 313, 805, textureX, textureY); // Box 223
		tailModel[41] = new ModelRendererTurbo(this, 393, 805, textureX, textureY); // Box 224
		tailModel[42] = new ModelRendererTurbo(this, 457, 805, textureX, textureY); // Box 225
		tailModel[43] = new ModelRendererTurbo(this, 513, 805, textureX, textureY); // Box 226
		tailModel[44] = new ModelRendererTurbo(this, 593, 805, textureX, textureY); // Box 227
		tailModel[45] = new ModelRendererTurbo(this, 665, 805, textureX, textureY); // Box 228
		tailModel[46] = new ModelRendererTurbo(this, 737, 805, textureX, textureY); // Box 229
		tailModel[47] = new ModelRendererTurbo(this, 777, 805, textureX, textureY); // Box 230
		tailModel[48] = new ModelRendererTurbo(this, 817, 805, textureX, textureY); // Box 231
		tailModel[49] = new ModelRendererTurbo(this, 857, 805, textureX, textureY); // Box 232
		tailModel[50] = new ModelRendererTurbo(this, 897, 805, textureX, textureY); // Box 233
		tailModel[51] = new ModelRendererTurbo(this, 929, 805, textureX, textureY); // Box 234
		tailModel[52] = new ModelRendererTurbo(this, 969, 805, textureX, textureY); // Box 235
		tailModel[53] = new ModelRendererTurbo(this, 1, 646, textureX, textureY); // Box 279
		tailModel[54] = new ModelRendererTurbo(this, 65, 646, textureX, textureY); // Box 280
		tailModel[55] = new ModelRendererTurbo(this, 97, 646, textureX, textureY); // Box 281
		tailModel[56] = new ModelRendererTurbo(this, 161, 646, textureX, textureY); // Box 282
		tailModel[57] = new ModelRendererTurbo(this, 193, 646, textureX, textureY); // Box 283
		tailModel[58] = new ModelRendererTurbo(this, 217, 646, textureX, textureY); // Box 284
		tailModel[59] = new ModelRendererTurbo(this, 1, 732, textureX, textureY); // Box 291
		tailModel[60] = new ModelRendererTurbo(this, 153, 732, textureX, textureY); // Box 292
		tailModel[61] = new ModelRendererTurbo(this, 105, 732, textureX, textureY); // Box 294
		tailModel[62] = new ModelRendererTurbo(this, 265, 732, textureX, textureY); // Box 295
		tailModel[63] = new ModelRendererTurbo(this, 385, 732, textureX, textureY); // Box 296
		tailModel[64] = new ModelRendererTurbo(this, 1001, 805, textureX, textureY); // Box 470
		tailModel[65] = new ModelRendererTurbo(this, 1, 805, textureX, textureY); // Box 471
		tailModel[66] = new ModelRendererTurbo(this, 9, 805, textureX, textureY); // Box 472
		tailModel[67] = new ModelRendererTurbo(this, 33, 805, textureX, textureY); // Box 473
		tailModel[68] = new ModelRendererTurbo(this, 41, 805, textureX, textureY); // Box 474
		tailModel[69] = new ModelRendererTurbo(this, 65, 805, textureX, textureY); // Box 475
		tailModel[70] = new ModelRendererTurbo(this, 945, 924, textureX, textureY); // Box 282
		tailModel[71] = new ModelRendererTurbo(this, 1097, 924, textureX, textureY); // Box 395
		tailModel[72] = new ModelRendererTurbo(this, 1281, 924, textureX, textureY); // Box 664

		tailModel[0].addShapeBox(0F, 0F, 0F, 6, 5, 13, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		tailModel[0].setRotationPoint(60F, -37F, -13F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 6, 4, 10, 0F,0F, -2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		tailModel[1].setRotationPoint(60F, -41F, -10F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 6, 2, 7, 0F,0F, -2F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 53
		tailModel[2].setRotationPoint(60F, -43F, -7F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 6, 5, 13, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		tailModel[3].setRotationPoint(60F, -32F, -13F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 6, 5, 13, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -3F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 55
		tailModel[4].setRotationPoint(60F, -27F, -13F);

		tailModel[5].addShapeBox(0F, 0F, 0F, 6, 3, 11, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -3F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 56
		tailModel[5].setRotationPoint(60F, -22F, -11F);

		tailModel[6].addShapeBox(0F, 0F, 0F, 6, 3, 9, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -1F, -5F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 59
		tailModel[6].setRotationPoint(60F, -19F, -9F);

		tailModel[7].addShapeBox(0F, 0F, 0F, 24, 5, 12, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -6F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 60
		tailModel[7].setRotationPoint(66F, -32F, -12F);

		tailModel[8].addShapeBox(0F, 0F, 0F, 24, 5, 12, 0F,0F, 0F, -2F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		tailModel[8].setRotationPoint(66F, -37F, -12F);

		tailModel[9].addShapeBox(0F, 0F, 0F, 24, 4, 10, 0F,0F, 0F, -3F, 0F, -1F, -6F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		tailModel[9].setRotationPoint(66F, -41F, -10F);

		tailModel[10].addShapeBox(0F, 0F, 0F, 24, 2, 7, 0F,0F, 0F, -4F, 0F, -2F, -4F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -3F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 63
		tailModel[10].setRotationPoint(66F, -43F, -7F);

		tailModel[11].addShapeBox(0F, 0F, 0F, 24, 4, 12, 0F,0F, 0F, 0F, 0F, 1F, -6F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -7F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 64
		tailModel[11].setRotationPoint(66F, -27F, -12F);

		tailModel[12].addShapeBox(0F, 0F, 0F, 24, 3, 10, 0F,0F, 0F, 0F, 0F, 2F, -5F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, -6F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 65
		tailModel[12].setRotationPoint(66F, -23F, -10F);

		tailModel[13].addShapeBox(0F, 0F, 0F, 24, 3, 8, 0F,0F, 0F, 0F, 0F, 3F, -4F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -5F, -5F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 66
		tailModel[13].setRotationPoint(66F, -20F, -8F);

		tailModel[14].addShapeBox(0F, 0F, 0F, 12, 5, 7, 0F,0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		tailModel[14].setRotationPoint(90F, -37F, -7F);

		tailModel[15].addShapeBox(0F, 0F, 0F, 12, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		tailModel[15].setRotationPoint(90F, -32F, -7F);

		tailModel[16].addShapeBox(0F, 0F, 0F, 12, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, -3.99999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.99999F, 0F, -2.99999F, -3.99999F, 0F, -2.99999F, 0F, 0F, 0F, 0F); // Box 69
		tailModel[16].setRotationPoint(90F, -28F, -6F);

		tailModel[17].addShapeBox(0F, 0F, 0F, 12, 2, 5, 0F,0F, 0F, 0F, 0F, 3F, -3F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, -3F, -4F, -1F, -3F, 0F, 0F, 0F, 0F); // Box 70
		tailModel[17].setRotationPoint(90F, -25F, -5F);

		tailModel[18].addShapeBox(0F, 0F, 0F, 11, 1, 4, 0F,0F, 0F, 0F, 0F, 2.99999F, -2.99999F, 0F, 2.99999F, 0F, 0F, 0F, 0F, 0F, 0F, -0.99999F, -0.99999F, -2.99999F, -3.99999F, -0.99999F, -2.99999F, 0F, 0F, 0F, 0F); // Box 71
		tailModel[18].setRotationPoint(90F, -23F, -4F);

		tailModel[19].addShapeBox(0F, 0F, 0F, 12, 3, 6, 0F,0F, 0F, -2F, 0F, -1F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		tailModel[19].setRotationPoint(90F, -40F, -6F);

		tailModel[20].addShapeBox(0F, 0F, 0F, 12, 2, 4, 0F,0F, 0F, -1F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 73
		tailModel[20].setRotationPoint(90F, -41F, -4F);

		tailModel[21].addShapeBox(0F, 0F, 0F, 27, 9, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		tailModel[21].setRotationPoint(75F, -48F, -3F);

		tailModel[22].addShapeBox(0F, 0F, 0F, 10, 7, 3, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F); // Box 124
		tailModel[22].setRotationPoint(65F, -48F, -3F);

		tailModel[23].addShapeBox(0F, 0F, 0F, 27, 28, 3, 0F,-19F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -19F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		tailModel[23].setRotationPoint(75F, -76F, -3F);

		tailModel[24].addShapeBox(0F, 0F, 0F, 10, 28, 3, 0F,-26F, 0F, -2F, 19F, 0F, -1F, 19F, 0F, 0F, -26F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		tailModel[24].setRotationPoint(65F, -76F, -3F);

		tailModel[25].addShapeBox(0F, 0F, 0F, 8, 3, 2, 0F,-6F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		tailModel[25].setRotationPoint(94F, -79F, -2F);

		tailModel[26].addShapeBox(0F, 0F, 0F, 8, 3, 2, 0F,-3F, -1F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -3F, -1F, 0F, 0F, 0F, -1F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		tailModel[26].setRotationPoint(91F, -79F, -2F);

		tailModel[27].addShapeBox(0F, 0F, 0F, 27, 5, 48, 0F,-13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		tailModel[27].setRotationPoint(78F, -42F, -50F);

		tailModel[28].addShapeBox(0F, 0F, 0F, 30, 5, 48, 0F,-20F, -2F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, 0F, -2F, 0F, -20F, -2F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, 0F, -2F, 0F); // Box 136
		tailModel[28].setRotationPoint(61F, -42F, -50F);

		tailModel[29].addShapeBox(0F, 0F, 0F, 14, 5, 16, 0F,-7F, -2F, 0F, -4F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, -2F, 0F, -4F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		tailModel[29].setRotationPoint(91F, -42F, -66F);

		tailModel[30].addShapeBox(0F, 0F, 0F, 10, 5, 16, 0F,-7F, -2F, -4F, 7F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -7F, -2F, -4F, 7F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 139
		tailModel[30].setRotationPoint(81F, -42F, -66F);

		tailModel[31].addShapeBox(0F, 0F, 0F, 9, 5, 16, 0F,3F, -2F, 0F, -3F, -2F, -6F, 1F, -2F, 0F, -1F, 0F, 0F, 3F, -2F, 0F, -3F, -2F, -6F, 1F, -2F, 0F, -1F, 0F, 0F); // Box 140
		tailModel[31].setRotationPoint(104F, -42F, -66F);

		tailModel[32].addShapeBox(0F, 0F, 0F, 6, 5, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 213
		tailModel[32].setRotationPoint(60F, -37F, 0F);

		tailModel[33].addShapeBox(0F, 0F, 0F, 6, 4, 10, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 214
		tailModel[33].setRotationPoint(60F, -41F, 0F);

		tailModel[34].addShapeBox(0F, 0F, 0F, 6, 2, 7, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -2F, -4F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 215
		tailModel[34].setRotationPoint(60F, -43F, 0F);

		tailModel[35].addShapeBox(0F, 0F, 0F, 6, 5, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 216
		tailModel[35].setRotationPoint(60F, -32F, 0F);

		tailModel[36].addShapeBox(0F, 0F, 0F, 6, 5, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -3F, 0F, 0F, -2F); // Box 217
		tailModel[36].setRotationPoint(60F, -27F, 0F);

		tailModel[37].addShapeBox(0F, 0F, 0F, 6, 3, 11, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -3F, 0F, 0F, -2F); // Box 218
		tailModel[37].setRotationPoint(60F, -22F, 0F);

		tailModel[38].addShapeBox(0F, 0F, 0F, 6, 3, 9, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -5F, 0F, 0F, -5F); // Box 221
		tailModel[38].setRotationPoint(60F, -19F, 0F);

		tailModel[39].addShapeBox(0F, 0F, 0F, 24, 5, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -6F, 0F, 0F, 0F); // Box 222
		tailModel[39].setRotationPoint(66F, -32F, 0F);

		tailModel[40].addShapeBox(0F, 0F, 0F, 24, 5, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 223
		tailModel[40].setRotationPoint(66F, -37F, 0F);

		tailModel[41].addShapeBox(0F, 0F, 0F, 24, 4, 10, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -6F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 224
		tailModel[41].setRotationPoint(66F, -41F, 0F);

		tailModel[42].addShapeBox(0F, 0F, 0F, 24, 2, 7, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -3F, 0F, 0F, 0F); // Box 225
		tailModel[42].setRotationPoint(66F, -43F, 0F);

		tailModel[43].addShapeBox(0F, 0F, 0F, 24, 4, 12, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -7F, 0F, 0F, -2F); // Box 226
		tailModel[43].setRotationPoint(66F, -27F, 0F);

		tailModel[44].addShapeBox(0F, 0F, 0F, 24, 3, 10, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -6F, 0F, 0F, -2F); // Box 227
		tailModel[44].setRotationPoint(66F, -23F, 0F);

		tailModel[45].addShapeBox(0F, 0F, 0F, 24, 3, 8, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, -5F, 0F, 0F, -4F); // Box 228
		tailModel[45].setRotationPoint(66F, -20F, 0F);

		tailModel[46].addShapeBox(0F, 0F, 0F, 12, 5, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 229
		tailModel[46].setRotationPoint(90F, -37F, 0F);

		tailModel[47].addShapeBox(0F, 0F, 0F, 12, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -1F); // Box 230
		tailModel[47].setRotationPoint(90F, -32F, 0F);

		tailModel[48].addShapeBox(0F, 0F, 0F, 12, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.99999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.99999F, 0F, 0F, -2.99999F, -3.99999F, 0F, 0F, -0.99999F); // Box 231
		tailModel[48].setRotationPoint(90F, -28F, 0F);

		tailModel[49].addShapeBox(0F, 0F, 0F, 12, 2, 5, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, -3F, -4F, 0F, 0F, -1F); // Box 232
		tailModel[49].setRotationPoint(90F, -25F, 0F);

		tailModel[50].addShapeBox(0F, 0F, 0F, 11, 1, 4, 0F,0F, 0F, 0F, 0F, 2.99999F, 0F, 0F, 2.99999F, -2.99999F, 0F, 0F, 0F, 0F, 0F, 0F, -0.99999F, -2.99999F, 0F, -0.99999F, -2.99999F, -3.99999F, 0F, 0F, -0.99999F); // Box 233
		tailModel[50].setRotationPoint(90F, -23F, 0F);

		tailModel[51].addShapeBox(0F, 0F, 0F, 12, 3, 6, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 234
		tailModel[51].setRotationPoint(90F, -40F, 0F);

		tailModel[52].addShapeBox(0F, 0F, 0F, 12, 2, 4, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F); // Box 235
		tailModel[52].setRotationPoint(90F, -41F, 0F);

		tailModel[53].addShapeBox(0F, 0F, 0F, 27, 9, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 279
		tailModel[53].setRotationPoint(75F, -48F, 0F);

		tailModel[54].addShapeBox(0F, 0F, 0F, 10, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -2F); // Box 280
		tailModel[54].setRotationPoint(65F, -48F, 0F);

		tailModel[55].addShapeBox(0F, 0F, 0F, 27, 28, 3, 0F,-19F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -19F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		tailModel[55].setRotationPoint(75F, -76F, 0F);

		tailModel[56].addShapeBox(0F, 0F, 0F, 10, 28, 3, 0F,-26F, 0F, 0F, 19F, 0F, 0F, 19F, 0F, -1F, -26F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 282
		tailModel[56].setRotationPoint(65F, -76F, 0F);

		tailModel[57].addShapeBox(0F, 0F, 0F, 8, 3, 2, 0F,-6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -6F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 283
		tailModel[57].setRotationPoint(94F, -79F, 0F);

		tailModel[58].addShapeBox(0F, 0F, 0F, 8, 3, 2, 0F,-3F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, -3F, -1F, -1F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -1F); // Box 284
		tailModel[58].setRotationPoint(91F, -79F, 0F);

		tailModel[59].addShapeBox(0F, 0F, 0F, 27, 5, 48, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F); // Box 291
		tailModel[59].setRotationPoint(78F, -42F, 2F);

		tailModel[60].addShapeBox(0F, 0F, 0F, 30, 5, 48, 0F,0F, -2F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, -20F, -2F, 0F, 0F, -2F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, -20F, -2F, 0F); // Box 292
		tailModel[60].setRotationPoint(61F, -42F, 2F);

		tailModel[61].addShapeBox(0F, 0F, 0F, 14, 5, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4F, -2F, 0F, -7F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -2F, 0F, -7F, -2F, 0F); // Box 294
		tailModel[61].setRotationPoint(91F, -42F, 50F);

		tailModel[62].addShapeBox(0F, 0F, 0F, 10, 5, 16, 0F,0F, -2F, 0F, 0F, 0F, 0F, 7F, -2F, 0F, -7F, -2F, -4F, 0F, -2F, 0F, 0F, 0F, 0F, 7F, -2F, 0F, -7F, -2F, -4F); // Box 295
		tailModel[62].setRotationPoint(81F, -42F, 50F);

		tailModel[63].addShapeBox(0F, 0F, 0F, 9, 5, 16, 0F,-1F, 0F, 0F, 1F, -2F, 0F, -3F, -2F, -6F, 3F, -2F, 0F, -1F, 0F, 0F, 1F, -2F, 0F, -3F, -2F, -6F, 3F, -2F, 0F); // Box 296
		tailModel[63].setRotationPoint(104F, -42F, 50F);

		tailModel[64].addShapeBox(0F, 0F, -0.5F, 30, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 470
		tailModel[64].setRotationPoint(93F, -24F, 0F);
		tailModel[64].rotateAngleZ = 0.34906585F;

		tailModel[65].addShapeBox(30F, 0F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 471
		tailModel[65].setRotationPoint(93F, -24F, 0F);
		tailModel[65].rotateAngleZ = 0.34906585F;

		tailModel[66].addShapeBox(31F, -1F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 472
		tailModel[66].setRotationPoint(93F, -24F, 0F);
		tailModel[66].rotateAngleZ = 0.34906585F;

		tailModel[67].addShapeBox(32F, 0F, -0.5F, 1, 1, 1, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 473
		tailModel[67].setRotationPoint(93F, -24F, 0F);
		tailModel[67].rotateAngleZ = 0.34906585F;

		tailModel[68].addShapeBox(32F, 0F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 474
		tailModel[68].setRotationPoint(93F, -24F, 0F);
		tailModel[68].rotateAngleZ = 0.34906585F;

		tailModel[69].addShapeBox(31F, 1F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 475
		tailModel[69].setRotationPoint(93F, -24F, 0F);
		tailModel[69].rotateAngleZ = 0.34906585F;

		tailModel[70].addShapeBox(0F, 0F, 0F, 72, 1, 1, 0F,0F, -15.25F, -0.25F, 0F, -14.25F, -0.25F, 0F, -14.25F, -0.25F, 0F, -15.25F, -0.25F, 0F, 14.75F, -0.25F, 0F, 13.75F, -0.25F, 0F, 13.75F, -0.25F, 0F, 14.75F, -0.25F); // Box 282
		tailModel[70].setRotationPoint(-69F, -77F, -9.5F);

		tailModel[71].addShapeBox(0F, 0F, 0F, 88, 1, 1, 0F,0F, -15.25F, -0.25F, 0F, -3.25F, -9.25F, 0F, -3.25F, 8.75F, 0F, -15.25F, -0.25F, 0F, 14.75F, -0.25F, 0F, 2.75F, -9.25F, 0F, 2.75F, 8.75F, 0F, 14.75F, -0.25F); // Box 395
		tailModel[71].setRotationPoint(3F, -78F, -9.5F);

		tailModel[72].addShapeBox(0F, 0F, 0F, 1, 30, 1, 0F,2.75F, 0.5F, -0.25F, -3.25F, 0.5F, -0.25F, -3.25F, 0.5F, -0.25F, 2.75F, 0.5F, -0.25F, -9.25F, 0F, 5.75F, 8.75F, 0F, 5.75F, 8.75F, 0F, -6.25F, -9.25F, 0F, -6.25F); // Box 664
		tailModel[72].setRotationPoint(5F, -62F, -9.5F);
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 1, 484, textureX, textureY); // Box 74
		leftWingModel[1] = new ModelRendererTurbo(this, 177, 484, textureX, textureY); // Box 75
		leftWingModel[2] = new ModelRendererTurbo(this, 481, 484, textureX, textureY); // Box 77
		leftWingModel[3] = new ModelRendererTurbo(this, 633, 484, textureX, textureY); // Box 78
		leftWingModel[4] = new ModelRendererTurbo(this, 129, 484, textureX, textureY); // Box 79
		leftWingModel[5] = new ModelRendererTurbo(this, 265, 484, textureX, textureY); // Box 80
		leftWingModel[6] = new ModelRendererTurbo(this, 761, 484, textureX, textureY); // Box 81
		leftWingModel[7] = new ModelRendererTurbo(this, 889, 484, textureX, textureY); // Box 82
		leftWingModel[8] = new ModelRendererTurbo(this, 433, 484, textureX, textureY); // Box 83
		leftWingModel[9] = new ModelRendererTurbo(this, 593, 484, textureX, textureY); // Box 84
		leftWingModel[10] = new ModelRendererTurbo(this, 1001, 484, textureX, textureY); // Box 85
		leftWingModel[11] = new ModelRendererTurbo(this, 1113, 484, textureX, textureY); // Box 86
		leftWingModel[12] = new ModelRendererTurbo(this, 849, 484, textureX, textureY); // Box 87
		leftWingModel[13] = new ModelRendererTurbo(this, 729, 484, textureX, textureY); // Box 88
		leftWingModel[14] = new ModelRendererTurbo(this, 1, 484, textureX, textureY); // Box 152
		leftWingModel[15] = new ModelRendererTurbo(this, 25, 484, textureX, textureY); // Box 384
		leftWingModel[16] = new ModelRendererTurbo(this, 41, 484, textureX, textureY); // Box 385
		leftWingModel[17] = new ModelRendererTurbo(this, 129, 484, textureX, textureY); // Box 386
		leftWingModel[18] = new ModelRendererTurbo(this, 185, 484, textureX, textureY); // Box 387
		leftWingModel[19] = new ModelRendererTurbo(this, 193, 484, textureX, textureY); // Box 388

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 37, 15, 49, 0F,0F, 0F, 0F, 0F, 0F, 0F, 11F, -2F, 0F, 0F, -2F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 11F, 0F, 3F, 0F, 0F, 3F); // Box 74
		leftWingModel[0].setRotationPoint(-43F, -29F, -65F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 19, 15, 49, 0F,-1F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -5F, 0F, -1F, -8F, 0F, 0F, -5F, 0F, 0F, 0F, 3F, 0F, -5F, 3F); // Box 75
		leftWingModel[1].setRotationPoint(-62F, -29F, -65F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 37, 12, 37, 0F,0F, 0F, 0F, -9F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, -9F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		leftWingModel[2].setRotationPoint(-43F, -31F, -102F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 28, 9, 33, 0F,0F, 0F, 0F, -9F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, -9F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		leftWingModel[3].setRotationPoint(-43F, -32F, -135F);

		leftWingModel[4].addShapeBox(0F, 0F, 0F, 19, 5, 17, 0F,0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		leftWingModel[4].setRotationPoint(-43F, -32F, -152F);

		leftWingModel[5].addShapeBox(0F, 0F, 0F, 14, 3, 15, 0F,0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -8F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		leftWingModel[5].setRotationPoint(-43F, -32F, -167F);

		leftWingModel[6].addShapeBox(0F, 0F, 0F, 24, 12, 37, 0F,0F, 0F, 0F, -11F, -4F, 0F, 0F, -6F, 0F, -9F, -2F, 0F, 0F, -4F, 0F, -11F, -7F, 0F, 0F, -5F, 0F, -9F, 0F, 0F); // Box 81
		leftWingModel[6].setRotationPoint(-15F, -31F, -102F);

		leftWingModel[7].addShapeBox(0F, 0F, 0F, 22, 9, 33, 0F,0F, 0F, 0F, -10F, -2F, 0F, 0F, -5F, 0F, -9F, -1F, 0F, 0F, -4F, 0F, -10F, -6F, 0F, 0F, -3F, 0F, -9F, 0F, 0F); // Box 82
		leftWingModel[7].setRotationPoint(-24F, -32F, -135F);

		leftWingModel[8].addShapeBox(0F, 0F, 0F, 17, 5, 17, 0F,0F, 0F, 0F, -7F, -1F, 0F, 0F, -2F, 0F, -5F, 0F, 0F, 0F, -2F, 0F, -7F, -3F, 0F, 0F, -2F, 0F, -5F, 0F, 0F); // Box 83
		leftWingModel[8].setRotationPoint(-29F, -32F, -152F);

		leftWingModel[9].addShapeBox(0F, 0F, 0F, 17, 3, 15, 0F,1F, 0F, 0F, -7F, 0F, -7F, 0F, -1F, 0F, -7F, 0F, 0F, 1F, -2F, 0F, -7F, -2F, -7F, 0F, -1F, 0F, -7F, 0F, 0F); // Box 84
		leftWingModel[9].setRotationPoint(-36F, -32F, -167F);

		leftWingModel[10].addShapeBox(0F, 0F, 0F, 18, 12, 37, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 85
		leftWingModel[10].setRotationPoint(-61F, -31F, -102F);

		leftWingModel[11].addShapeBox(0F, 0F, 0F, 18, 9, 33, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 86
		leftWingModel[11].setRotationPoint(-61F, -32F, -135F);

		leftWingModel[12].addShapeBox(0F, 0F, 0F, 18, 5, 17, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		leftWingModel[12].setRotationPoint(-61F, -32F, -152F);

		leftWingModel[13].addShapeBox(0F, 0F, 0F, 18, 3, 15, 0F,-7F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -7F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		leftWingModel[13].setRotationPoint(-61F, -32F, -167F);

		leftWingModel[14].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152
		leftWingModel[14].setRotationPoint(-65F, -24F, -60F);

		leftWingModel[15].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 384
		leftWingModel[15].setRotationPoint(-62F, -31F, -157F);

		leftWingModel[16].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 385
		leftWingModel[16].setRotationPoint(-62F, -38F, -157F);

		leftWingModel[17].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 386
		leftWingModel[17].setRotationPoint(-73F, -39F, -157F);

		leftWingModel[18].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.9999F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.9999F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 387
		leftWingModel[18].setRotationPoint(-72F, -40F, -157F);

		leftWingModel[19].addTrapezoid(0F, 0F, 0F, 5, 1, 1, 0F, -0.25F, ModelRendererTurbo.MR_RIGHT); // Box 388
		leftWingModel[19].setRotationPoint(-78F, -39F, -157F);
	}

	private void initrightWingModel_1()
	{
		rightWingModel[0] = new ModelRendererTurbo(this, 1, 549, textureX, textureY); // Box 236
		rightWingModel[1] = new ModelRendererTurbo(this, 177, 549, textureX, textureY); // Box 237
		rightWingModel[2] = new ModelRendererTurbo(this, 481, 549, textureX, textureY); // Box 239
		rightWingModel[3] = new ModelRendererTurbo(this, 633, 549, textureX, textureY); // Box 240
		rightWingModel[4] = new ModelRendererTurbo(this, 129, 549, textureX, textureY); // Box 241
		rightWingModel[5] = new ModelRendererTurbo(this, 265, 549, textureX, textureY); // Box 242
		rightWingModel[6] = new ModelRendererTurbo(this, 761, 549, textureX, textureY); // Box 243
		rightWingModel[7] = new ModelRendererTurbo(this, 889, 549, textureX, textureY); // Box 244
		rightWingModel[8] = new ModelRendererTurbo(this, 433, 549, textureX, textureY); // Box 245
		rightWingModel[9] = new ModelRendererTurbo(this, 593, 549, textureX, textureY); // Box 246
		rightWingModel[10] = new ModelRendererTurbo(this, 1001, 549, textureX, textureY); // Box 247
		rightWingModel[11] = new ModelRendererTurbo(this, 1113, 549, textureX, textureY); // Box 248
		rightWingModel[12] = new ModelRendererTurbo(this, 849, 549, textureX, textureY); // Box 249
		rightWingModel[13] = new ModelRendererTurbo(this, 729, 549, textureX, textureY); // Box 250
		rightWingModel[14] = new ModelRendererTurbo(this, 1, 549, textureX, textureY); // Box 308

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 37, 15, 49, 0F,0F, -2F, 0F, 11F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 11F, 0F, 3F, 0F, -5F, 0F, 0F, -5F, 0F); // Box 236
		rightWingModel[0].setRotationPoint(-43F, -29F, 16F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 19, 15, 49, 0F,0F, -5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, 0F, -5F, 3F, 0F, 0F, 3F, 0F, -5F, 0F, -1F, -8F, 0F); // Box 237
		rightWingModel[1].setRotationPoint(-62F, -29F, 16F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 37, 12, 37, 0F,0F, -2F, 0F, 0F, -2F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, -4F, 0F, 0F, -4F, 0F); // Box 239
		rightWingModel[2].setRotationPoint(-43F, -31F, 65F);

		rightWingModel[3].addShapeBox(0F, 0F, 0F, 28, 9, 33, 0F,0F, -1F, 0F, 0F, -1F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, -4F, 0F, 0F, -4F, 0F); // Box 240
		rightWingModel[3].setRotationPoint(-43F, -32F, 102F);

		rightWingModel[4].addShapeBox(0F, 0F, 0F, 19, 5, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -2F, 0F, 0F, -2F, 0F); // Box 241
		rightWingModel[4].setRotationPoint(-43F, -32F, 135F);

		rightWingModel[5].addShapeBox(0F, 0F, 0F, 14, 3, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, -2F, 0F, 0F, -2F, 0F); // Box 242
		rightWingModel[5].setRotationPoint(-43F, -32F, 152F);

		rightWingModel[6].addShapeBox(0F, 0F, 0F, 24, 12, 37, 0F,-9F, -2F, 0F, 0F, -6F, 0F, -11F, -4F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, -5F, 0F, -11F, -7F, 0F, 0F, -4F, 0F); // Box 243
		rightWingModel[6].setRotationPoint(-15F, -31F, 65F);

		rightWingModel[7].addShapeBox(0F, 0F, 0F, 22, 9, 33, 0F,-9F, -1F, 0F, 0F, -5F, 0F, -10F, -2F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, -3F, 0F, -10F, -6F, 0F, 0F, -4F, 0F); // Box 244
		rightWingModel[7].setRotationPoint(-24F, -32F, 102F);

		rightWingModel[8].addShapeBox(0F, 0F, 0F, 17, 5, 17, 0F,-5F, 0F, 0F, 0F, -2F, 0F, -7F, -1F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, -2F, 0F, -7F, -3F, 0F, 0F, -2F, 0F); // Box 245
		rightWingModel[8].setRotationPoint(-29F, -32F, 135F);

		rightWingModel[9].addShapeBox(0F, 0F, 0F, 17, 3, 15, 0F,-7F, 0F, 0F, 0F, -1F, 0F, -7F, 0F, -7F, 1F, 0F, 0F, -7F, 0F, 0F, 0F, -1F, 0F, -7F, -2F, -7F, 1F, -2F, 0F); // Box 246
		rightWingModel[9].setRotationPoint(-36F, -32F, 152F);

		rightWingModel[10].addShapeBox(0F, 0F, 0F, 18, 12, 37, 0F,0F, -5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -5F, 0F); // Box 247
		rightWingModel[10].setRotationPoint(-61F, -31F, 65F);

		rightWingModel[11].addShapeBox(0F, 0F, 0F, 18, 9, 33, 0F,0F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 248
		rightWingModel[11].setRotationPoint(-61F, -32F, 102F);

		rightWingModel[12].addShapeBox(0F, 0F, 0F, 18, 5, 17, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 249
		rightWingModel[12].setRotationPoint(-61F, -32F, 135F);

		rightWingModel[13].addShapeBox(0F, 0F, 0F, 18, 3, 15, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -7F, -2F, -2F); // Box 250
		rightWingModel[13].setRotationPoint(-61F, -32F, 152F);

		rightWingModel[14].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 308
		rightWingModel[14].setRotationPoint(-65F, -24F, 59F);
	}

	private void inityawFlapModel_1()
	{
		yawFlapModel[0] = new ModelRendererTurbo(this, 241, 614, textureX, textureY); // Box 129
		yawFlapModel[1] = new ModelRendererTurbo(this, 289, 614, textureX, textureY); // Box 130
		yawFlapModel[2] = new ModelRendererTurbo(this, 337, 614, textureX, textureY); // Box 131
		yawFlapModel[3] = new ModelRendererTurbo(this, 393, 614, textureX, textureY); // Box 132
		yawFlapModel[4] = new ModelRendererTurbo(this, 441, 614, textureX, textureY); // Box 133
		yawFlapModel[5] = new ModelRendererTurbo(this, 465, 614, textureX, textureY); // Box 134
		yawFlapModel[6] = new ModelRendererTurbo(this, 241, 646, textureX, textureY); // Box 285
		yawFlapModel[7] = new ModelRendererTurbo(this, 289, 646, textureX, textureY); // Box 286
		yawFlapModel[8] = new ModelRendererTurbo(this, 337, 646, textureX, textureY); // Box 287
		yawFlapModel[9] = new ModelRendererTurbo(this, 393, 646, textureX, textureY); // Box 288
		yawFlapModel[10] = new ModelRendererTurbo(this, 441, 646, textureX, textureY); // Box 289
		yawFlapModel[11] = new ModelRendererTurbo(this, 465, 646, textureX, textureY); // Box 290

		yawFlapModel[0].addShapeBox(0F, -28F, -3F, 19, 14, 3, 0F,0F, 0F, -1F, -9F, 0F, -2F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		yawFlapModel[0].setRotationPoint(102F, -48F, 0F);

		yawFlapModel[1].addShapeBox(0F, -14F, -3F, 19, 14, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, -2F, 3F, 0F, 0F, 0F, 0F, 0F); // Box 130
		yawFlapModel[1].setRotationPoint(102F, -48F, 0F);

		yawFlapModel[2].addShapeBox(0F, 0F, -3F, 22, 9, 3, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -2F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 131
		yawFlapModel[2].setRotationPoint(102F, -48F, 0F);

		yawFlapModel[3].addShapeBox(0F, 9F, -3F, 18, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -2F, -8F, 0F, 0F, 0F, 0F, 0F); // Box 132
		yawFlapModel[3].setRotationPoint(102F, -48F, 0F);

		yawFlapModel[4].addShapeBox(0F, 16F, -3F, 6, 4, 3, 0F,0F, 0F, 0F, 3.99999F, 0F, -1.99999F, 3.99999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.99999F, 3.99999F, -3.99999F, -1.99999F, 3.99999F, -3.99999F, 0F, 0F, 0F, 0F); // Box 133
		yawFlapModel[4].setRotationPoint(102F, -48F, 0F);

		yawFlapModel[5].addShapeBox(0F, -31F, -2F, 10, 3, 2, 0F,0F, 0F, -1F, -4F, -1F, -1F, -4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134
		yawFlapModel[5].setRotationPoint(102F, -48F, 0F);

		yawFlapModel[6].addShapeBox(0F, -28F, 0F, 19, 14, 3, 0F,0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F); // Box 285
		yawFlapModel[6].setRotationPoint(102F, -48F, 0F);

		yawFlapModel[7].addShapeBox(0F, -14F, 0F, 19, 14, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, -2F, 0F, 0F, 0F); // Box 286
		yawFlapModel[7].setRotationPoint(102F, -48F, 0F);

		yawFlapModel[8].addShapeBox(0F, 0F, 0F, 22, 9, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, 0F, 0F, 0F); // Box 287
		yawFlapModel[8].setRotationPoint(102F, -48F, 0F);

		yawFlapModel[9].addShapeBox(0F, 9F, 0F, 18, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, -2F, 0F, 0F, 0F); // Box 288
		yawFlapModel[9].setRotationPoint(102F, -48F, 0F);

		yawFlapModel[10].addShapeBox(0F, 16F, 0F, 6, 4, 3, 0F,0F, 0F, 0F, 3.99999F, 0F, 0F, 3.99999F, 0F, -1.99999F, 0F, 0F, 0F, 0F, 0F, 0F, 3.99999F, -3.99999F, 0F, 3.99999F, -3.99999F, -1.99999F, 0F, 0F, -0.99999F); // Box 289
		yawFlapModel[10].setRotationPoint(102F, -48F, 0F);

		yawFlapModel[11].addShapeBox(0F, -31F, 0F, 10, 3, 2, 0F,0F, 0F, 0F, -4F, -1F, 0F, -4F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 290
		yawFlapModel[11].setRotationPoint(102F, -48F, 0F);
	}

	private void initpitchFlapLeftModel_1()
	{
		pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 313, 678, textureX, textureY); // Box 137

		pitchFlapLeftModel[0].addShapeBox(0F, 0F, 0F, 10, 5, 48, 0F,0F, 0F, 0F, -1F, -2F, 0F, 1F, -2F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, 1F, -2F, -11F, 0F, 0F, 0F); // Box 137
		pitchFlapLeftModel[0].setRotationPoint(105F, -42F, -50F);
	}

	private void initpitchFlapRightModel_1()
	{
		pitchFlapRightModel[0] = new ModelRendererTurbo(this, 313, 732, textureX, textureY); // Box 293

		pitchFlapRightModel[0].addShapeBox(0F, 0F, 0F, 10, 5, 48, 0F,0F, 0F, 0F, 1F, -2F, -11F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, -11F, -1F, -2F, 0F, 0F, 0F, 0F); // Box 293
		pitchFlapRightModel[0].setRotationPoint(105F, -42F, 2F);
	}

	private void initpitchFlapLeftWingModel_1()
	{
		pitchFlapLeftWingModel[0] = new ModelRendererTurbo(this, 321, 484, textureX, textureY); // Box 76

		pitchFlapLeftWingModel[0].addShapeBox(0F, 0F, 0F, 30, 15, 49, 0F,0F, 0F, 0F, -15F, -4F, 0F, 0F, -7F, 0F, -11F, -2F, 0F, 0F, -5F, 0F, -15F, -10F, 0F, 0F, -7F, 1F, -11F, 0F, 3F); // Box 76
		pitchFlapLeftWingModel[0].setRotationPoint(-6F, -29F, -65F);
	}

	private void initpitchFlapRightWingModel_1()
	{
		pitchFlapRightWingModel[0] = new ModelRendererTurbo(this, 321, 549, textureX, textureY); // Box 238

		pitchFlapRightWingModel[0].addShapeBox(0F, 0F, 0F, 30, 15, 49, 0F,-11F, -2F, 0F, 0F, -7F, 0F, -15F, -4F, 0F, 0F, 0F, 0F, -11F, 0F, 3F, 0F, -7F, 1F, -15F, -10F, 0F, 0F, -5F, 0F); // Box 238
		pitchFlapRightWingModel[0].setRotationPoint(-6F, -29F, 16F);
	}

	private void inittailWheelModel_1()
	{
		tailWheelModel[0] = new ModelRendererTurbo(this, 1, 478, textureX, textureY); // Box 391
		tailWheelModel[1] = new ModelRendererTurbo(this, 33, 478, textureX, textureY); // Box 392
		tailWheelModel[2] = new ModelRendererTurbo(this, 57, 478, textureX, textureY); // Box 393
		tailWheelModel[3] = new ModelRendererTurbo(this, 73, 478, textureX, textureY); // Box 394
		tailWheelModel[4] = new ModelRendererTurbo(this, 97, 478, textureX, textureY); // Box 395
		tailWheelModel[5] = new ModelRendererTurbo(this, 121, 478, textureX, textureY); // Box 396
		tailWheelModel[6] = new ModelRendererTurbo(this, 145, 478, textureX, textureY); // Box 397
		tailWheelModel[7] = new ModelRendererTurbo(this, 177, 478, textureX, textureY); // Box 398
		tailWheelModel[8] = new ModelRendererTurbo(this, 201, 478, textureX, textureY); // Box 399

		tailWheelModel[0].addShapeBox(0F, 0F, 0F, 10, 3, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 391
		tailWheelModel[0].setRotationPoint(83F, -23F, -2F);

		tailWheelModel[1].addShapeBox(0F, 0F, 0F, 8, 3, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F); // Box 392
		tailWheelModel[1].setRotationPoint(85F, -20F, -2F);

		tailWheelModel[2].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 393
		tailWheelModel[2].setRotationPoint(88F, -17F, -2F);

		tailWheelModel[3].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		tailWheelModel[3].setRotationPoint(88F, -14F, -1F);

		tailWheelModel[4].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 395
		tailWheelModel[4].setRotationPoint(88F, -16F, -1F);

		tailWheelModel[5].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 396
		tailWheelModel[5].setRotationPoint(88F, -12F, -1F);

		tailWheelModel[6].addShapeBox(0F, 0F, 0F, 10, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F); // Box 397
		tailWheelModel[6].setRotationPoint(83F, -23F, 0F);

		tailWheelModel[7].addShapeBox(0F, 0F, 0F, 8, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 398
		tailWheelModel[7].setRotationPoint(85F, -20F, 0F);

		tailWheelModel[8].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 399
		tailWheelModel[8].setRotationPoint(88F, -17F, 1F);
	}

	private void initleftWingWheelModel_1()
	{
		leftWingWheelModel[0] = new ModelRendererTurbo(this, 1, 446, textureX, textureY); // Box 153
		leftWingWheelModel[1] = new ModelRendererTurbo(this, 49, 446, textureX, textureY); // Box 154
		leftWingWheelModel[2] = new ModelRendererTurbo(this, 97, 446, textureX, textureY); // Box 155
		leftWingWheelModel[3] = new ModelRendererTurbo(this, 145, 446, textureX, textureY); // Box 156
		leftWingWheelModel[4] = new ModelRendererTurbo(this, 185, 446, textureX, textureY); // Box 157
		leftWingWheelModel[5] = new ModelRendererTurbo(this, 225, 446, textureX, textureY); // Box 158
		leftWingWheelModel[6] = new ModelRendererTurbo(this, 241, 446, textureX, textureY); // Box 159
		leftWingWheelModel[7] = new ModelRendererTurbo(this, 257, 446, textureX, textureY); // Box 160
		leftWingWheelModel[8] = new ModelRendererTurbo(this, 281, 446, textureX, textureY); // Box 161

		leftWingWheelModel[0].addShapeBox(0F, 0F, 0F, 15, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		leftWingWheelModel[0].setRotationPoint(-56F, 0F, -56F);

		leftWingWheelModel[1].addShapeBox(0F, 0F, 0F, 15, 5, 6, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		leftWingWheelModel[1].setRotationPoint(-56F, -5F, -56F);

		leftWingWheelModel[2].addShapeBox(0F, 0F, 0F, 15, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 155
		leftWingWheelModel[2].setRotationPoint(-56F, 5F, -56F);

		leftWingWheelModel[3].addShapeBox(0F, 0F, 0F, 18, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		leftWingWheelModel[3].setRotationPoint(-57.5F, 0F, -57F);

		leftWingWheelModel[4].addShapeBox(0F, 0F, 0F, 18, 6, 1, 0F,-6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		leftWingWheelModel[4].setRotationPoint(-57.5F, -6F, -57F);

		leftWingWheelModel[5].addShapeBox(0F, 0F, 0F, 6, 14, 1, 0F,-7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		leftWingWheelModel[5].setRotationPoint(-51.5F, -20F, -57F);

		leftWingWheelModel[6].addShapeBox(0F, 0F, 0F, 3, 12, 3, 0F,-4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 159
		leftWingWheelModel[6].setRotationPoint(-48F, -19F, -54.5F);

		leftWingWheelModel[7].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		leftWingWheelModel[7].setRotationPoint(-50F, -7F, -54.5F);

		leftWingWheelModel[8].addShapeBox(0F, 0F, 0F, 3, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		leftWingWheelModel[8].setRotationPoint(-50F, -6F, -50.5F);
	}

	private void initrightWingWheelModel_1()
	{
		rightWingWheelModel[0] = new ModelRendererTurbo(this, 1, 462, textureX, textureY); // Box 309
		rightWingWheelModel[1] = new ModelRendererTurbo(this, 49, 462, textureX, textureY); // Box 310
		rightWingWheelModel[2] = new ModelRendererTurbo(this, 97, 462, textureX, textureY); // Box 311
		rightWingWheelModel[3] = new ModelRendererTurbo(this, 145, 462, textureX, textureY); // Box 312
		rightWingWheelModel[4] = new ModelRendererTurbo(this, 185, 462, textureX, textureY); // Box 313
		rightWingWheelModel[5] = new ModelRendererTurbo(this, 225, 462, textureX, textureY); // Box 314
		rightWingWheelModel[6] = new ModelRendererTurbo(this, 241, 462, textureX, textureY); // Box 315
		rightWingWheelModel[7] = new ModelRendererTurbo(this, 257, 462, textureX, textureY); // Box 316
		rightWingWheelModel[8] = new ModelRendererTurbo(this, 281, 462, textureX, textureY); // Box 317

		rightWingWheelModel[0].addShapeBox(0F, 0F, 0F, 15, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309
		rightWingWheelModel[0].setRotationPoint(-56F, 0F, 50F);

		rightWingWheelModel[1].addShapeBox(0F, 0F, 0F, 15, 5, 6, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 310
		rightWingWheelModel[1].setRotationPoint(-56F, -5F, 50F);

		rightWingWheelModel[2].addShapeBox(0F, 0F, 0F, 15, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 311
		rightWingWheelModel[2].setRotationPoint(-56F, 5F, 50F);

		rightWingWheelModel[3].addShapeBox(0F, 0F, 0F, 18, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 312
		rightWingWheelModel[3].setRotationPoint(-57.5F, 0F, 56F);

		rightWingWheelModel[4].addShapeBox(0F, 0F, 0F, 18, 6, 1, 0F,-6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 313
		rightWingWheelModel[4].setRotationPoint(-57.5F, -6F, 56F);

		rightWingWheelModel[5].addShapeBox(0F, 0F, 0F, 6, 14, 1, 0F,-7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 314
		rightWingWheelModel[5].setRotationPoint(-51.5F, -20F, 56F);

		rightWingWheelModel[6].addShapeBox(0F, 0F, 0F, 3, 12, 3, 0F,-4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 315
		rightWingWheelModel[6].setRotationPoint(-48F, -19F, 51.5F);

		rightWingWheelModel[7].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 316
		rightWingWheelModel[7].setRotationPoint(-50F, -7F, 49.5F);

		rightWingWheelModel[8].addShapeBox(0F, 0F, 0F, 3, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 317
		rightWingWheelModel[8].setRotationPoint(-50F, -6F, 49.5F);
	}

	private void initPropeller()
	{
		propellerModels = new ModelRendererTurbo[1][4];
		propellerModels[0] = makeProp1(-112F, -26F, 0F);
	}

	private ModelRendererTurbo[] makeProp1(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[4];
		prop[0] = new ModelRendererTurbo(this, 0, 314, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 314, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 0, 314, textureX, textureY);
		prop[3] = new ModelRendererTurbo(this, 0, 314, textureX, textureY);
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

	private void initGuns() {
	}
	{

		// Passenger 2
		ModelRendererTurbo[][] gun_1_Model = new ModelRendererTurbo[3][];

		gun_1_Model[0] = new ModelRendererTurbo[0];

		gun_1_Model[1] = new ModelRendererTurbo[12];
		gun_1_Model[1][0] = new ModelRendererTurbo(this, 0, 270, textureX, textureY); // MG1
		gun_1_Model[1][1] = new ModelRendererTurbo(this, 0, 273, textureX, textureY); // MG1 Innen
		gun_1_Model[1][2] = new ModelRendererTurbo(this, 0, 276, textureX, textureY); // MG1 Lauf
		gun_1_Model[1][3] = new ModelRendererTurbo(this, 0, 279, textureX, textureY); // MG2
		gun_1_Model[1][4] = new ModelRendererTurbo(this, 0, 284, textureX, textureY); // MG3
		gun_1_Model[1][5] = new ModelRendererTurbo(this, 7, 284, textureX, textureY); // MG4
		gun_1_Model[1][6] = new ModelRendererTurbo(this, 14, 284, textureX, textureY); // MG5
		gun_1_Model[1][7] = new ModelRendererTurbo(this, 27, 270, textureX, textureY); // MG6
		gun_1_Model[1][8] = new ModelRendererTurbo(this, 27, 274, textureX, textureY); // MG7
		gun_1_Model[1][9] = new ModelRendererTurbo(this, 21, 279, textureX, textureY); // MG8
		gun_1_Model[1][10] = new ModelRendererTurbo(this, 33, 279, textureX, textureY); // MG9
		gun_1_Model[1][11] = new ModelRendererTurbo(this, 23, 279, textureX, textureY); // Ammo

		gun_1_Model[1][0].addBox(0.5F, -1F, -0.5F, 12, 1, 1, 0F); // MG1

		gun_1_Model[1][1].addBox(0.5F, -1F, -0.5F, 12, 1, 1, 0F); // MG1 Innen

		gun_1_Model[1][2].addShapeBox(0.5F, -1F, -0.5F, 12, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // MG1 Lauf

		gun_1_Model[1][3].addBox(-7.5F, -1.5F, -1F, 8, 2, 2, 0F); // MG2

		gun_1_Model[1][4].addBox(-9.5F, -1F, -0.5F, 2, 1, 1, 0F); // MG3

		gun_1_Model[1][5].addShapeBox(-10.5F, 0F, -0.5F, 2, 2, 1, 0F,-1F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, -1F, 0F, -0.15F, 0F, 0F, -0.15F, -0.6F, 0F, -0.15F, -0.6F, 0F, -0.15F, 0F, 0F, -0.15F); // MG4

		gun_1_Model[1][6].addBox(-2.5F, -1F, -0.9F, 2, 1, 2, 0F); // MG5

		gun_1_Model[1][7].addBox(-2.5F, -1F, -1.1F, 2, 1, 2, 0F); // MG6

		gun_1_Model[1][8].addShapeBox(-3.5F, -1F, -3F, 1, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // MG7

		gun_1_Model[1][9].addShapeBox(-0.6F, -2F, -0.5F, 1, 2, 1, 0F,-0.4F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.4F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // MG8

		gun_1_Model[1][10].addShapeBox(-6.5F, -2F, -0.5F, 2, 2, 1, 0F,-0.2F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // MG9

		gun_1_Model[1][11].addBox(-2.5F, -3F, 1F, 2, 3, 5, 0F); // Ammo

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_1_Model[1])
		{
			gunPart.setRotationPoint(36.5F, -43F, 0F);
		}


		gun_1_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("TailGun", gun_1_Model);
	}
}