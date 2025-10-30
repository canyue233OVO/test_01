//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: B10
// Model Creator: 
// Created on: 14.06.2023 - 11:12:24
// Last changed on: 14.06.2023 - 11:12:24

package com.flansmod.client.model.Taskball; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelB10 extends ModelPlane //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelB10() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[218];
		noseModel = new ModelRendererTurbo[27];
		tailModel = new ModelRendererTurbo[47];
		leftWingModel = new ModelRendererTurbo[53];
		rightWingModel = new ModelRendererTurbo[53];
		yawFlapModel = new ModelRendererTurbo[10];
		pitchFlapLeftModel = new ModelRendererTurbo[4];
		pitchFlapRightModel = new ModelRendererTurbo[2];
		pitchFlapLeftWingModel = new ModelRendererTurbo[1];
		pitchFlapRightWingModel = new ModelRendererTurbo[1];
		tailWheelModel = new ModelRendererTurbo[7];
		leftWingWheelModel = new ModelRendererTurbo[10];
		rightWingWheelModel = new ModelRendererTurbo[10];

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
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 545, 1, textureX, textureY); // Box 8
		bodyModel[8] = new ModelRendererTurbo(this, 617, 1, textureX, textureY); // Box 9
		bodyModel[9] = new ModelRendererTurbo(this, 721, 1, textureX, textureY); // Box 10
		bodyModel[10] = new ModelRendererTurbo(this, 777, 1, textureX, textureY); // Box 11
		bodyModel[11] = new ModelRendererTurbo(this, 713, 17, textureX, textureY); // Box 15
		bodyModel[12] = new ModelRendererTurbo(this, 961, 1, textureX, textureY); // Box 16
		bodyModel[13] = new ModelRendererTurbo(this, 889, 17, textureX, textureY); // Box 17
		bodyModel[14] = new ModelRendererTurbo(this, 937, 17, textureX, textureY); // Box 18
		bodyModel[15] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 19
		bodyModel[16] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 20
		bodyModel[17] = new ModelRendererTurbo(this, 785, 17, textureX, textureY); // Box 21
		bodyModel[18] = new ModelRendererTurbo(this, 985, 17, textureX, textureY); // Box 22
		bodyModel[19] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 23
		bodyModel[20] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 24
		bodyModel[21] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Box 25
		bodyModel[22] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 26
		bodyModel[23] = new ModelRendererTurbo(this, 801, 25, textureX, textureY); // Box 27
		bodyModel[24] = new ModelRendererTurbo(this, 537, 33, textureX, textureY); // Box 28
		bodyModel[25] = new ModelRendererTurbo(this, 641, 41, textureX, textureY); // Box 30
		bodyModel[26] = new ModelRendererTurbo(this, 841, 41, textureX, textureY); // Box 31
		bodyModel[27] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 32
		bodyModel[28] = new ModelRendererTurbo(this, 961, 41, textureX, textureY); // Box 33
		bodyModel[29] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 35
		bodyModel[30] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 36
		bodyModel[31] = new ModelRendererTurbo(this, 649, 137, textureX, textureY); // Box 117
		bodyModel[32] = new ModelRendererTurbo(this, 473, 169, textureX, textureY); // Box 118
		bodyModel[33] = new ModelRendererTurbo(this, 561, 169, textureX, textureY); // Box 119
		bodyModel[34] = new ModelRendererTurbo(this, 601, 169, textureX, textureY); // Box 120
		bodyModel[35] = new ModelRendererTurbo(this, 753, 169, textureX, textureY); // Box 121
		bodyModel[36] = new ModelRendererTurbo(this, 657, 169, textureX, textureY); // Box 122
		bodyModel[37] = new ModelRendererTurbo(this, 841, 169, textureX, textureY); // Box 123
		bodyModel[38] = new ModelRendererTurbo(this, 897, 177, textureX, textureY); // Box 124
		bodyModel[39] = new ModelRendererTurbo(this, 561, 185, textureX, textureY); // Box 125
		bodyModel[40] = new ModelRendererTurbo(this, 993, 145, textureX, textureY); // Box 126
		bodyModel[41] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 128
		bodyModel[42] = new ModelRendererTurbo(this, 529, 1, textureX, textureY); // Box 129
		bodyModel[43] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 130
		bodyModel[44] = new ModelRendererTurbo(this, 569, 57, textureX, textureY); // Box 131
		bodyModel[45] = new ModelRendererTurbo(this, 601, 1, textureX, textureY); // Box 132
		bodyModel[46] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 133
		bodyModel[47] = new ModelRendererTurbo(this, 545, 1, textureX, textureY); // Box 134
		bodyModel[48] = new ModelRendererTurbo(this, 769, 1, textureX, textureY); // Box 135
		bodyModel[49] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 136
		bodyModel[50] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 137
		bodyModel[51] = new ModelRendererTurbo(this, 769, 9, textureX, textureY); // Box 138
		bodyModel[52] = new ModelRendererTurbo(this, 825, 1, textureX, textureY); // Box 139
		bodyModel[53] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 140
		bodyModel[54] = new ModelRendererTurbo(this, 609, 25, textureX, textureY); // Box 141
		bodyModel[55] = new ModelRendererTurbo(this, 889, 1, textureX, textureY); // Box 142
		bodyModel[56] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 143
		bodyModel[57] = new ModelRendererTurbo(this, 841, 25, textureX, textureY); // Box 144
		bodyModel[58] = new ModelRendererTurbo(this, 953, 1, textureX, textureY); // Box 145
		bodyModel[59] = new ModelRendererTurbo(this, 673, 65, textureX, textureY); // Box 146
		bodyModel[60] = new ModelRendererTurbo(this, 985, 1, textureX, textureY); // Box 147
		bodyModel[61] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 148
		bodyModel[62] = new ModelRendererTurbo(this, 753, 41, textureX, textureY); // Box 149
		bodyModel[63] = new ModelRendererTurbo(this, 905, 57, textureX, textureY); // Box 150
		bodyModel[64] = new ModelRendererTurbo(this, 801, 25, textureX, textureY); // Box 151
		bodyModel[65] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 152
		bodyModel[66] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 153
		bodyModel[67] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 154
		bodyModel[68] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 155
		bodyModel[69] = new ModelRendererTurbo(this, 529, 33, textureX, textureY); // Box 156
		bodyModel[70] = new ModelRendererTurbo(this, 897, 105, textureX, textureY); // Box 157
		bodyModel[71] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 158
		bodyModel[72] = new ModelRendererTurbo(this, 929, 33, textureX, textureY); // Box 159
		bodyModel[73] = new ModelRendererTurbo(this, 601, 9, textureX, textureY); // Box 160
		bodyModel[74] = new ModelRendererTurbo(this, 785, 25, textureX, textureY); // Box 161
		bodyModel[75] = new ModelRendererTurbo(this, 265, 41, textureX, textureY); // Box 162
		bodyModel[76] = new ModelRendererTurbo(this, 905, 113, textureX, textureY); // Box 163
		bodyModel[77] = new ModelRendererTurbo(this, 969, 113, textureX, textureY); // Box 164
		bodyModel[78] = new ModelRendererTurbo(this, 537, 33, textureX, textureY); // Box 165
		bodyModel[79] = new ModelRendererTurbo(this, 793, 41, textureX, textureY); // Box 166
		bodyModel[80] = new ModelRendererTurbo(this, 953, 41, textureX, textureY); // Box 167
		bodyModel[81] = new ModelRendererTurbo(this, 705, 33, textureX, textureY); // Box 168
		bodyModel[82] = new ModelRendererTurbo(this, 73, 201, textureX, textureY); // Box 179
		bodyModel[83] = new ModelRendererTurbo(this, 249, 201, textureX, textureY); // Box 180
		bodyModel[84] = new ModelRendererTurbo(this, 657, 193, textureX, textureY); // Box 181
		bodyModel[85] = new ModelRendererTurbo(this, 833, 193, textureX, textureY); // Box 182
		bodyModel[86] = new ModelRendererTurbo(this, 409, 201, textureX, textureY); // Box 183
		bodyModel[87] = new ModelRendererTurbo(this, 457, 209, textureX, textureY); // Box 184
		bodyModel[88] = new ModelRendererTurbo(this, 561, 201, textureX, textureY); // Box 185
		bodyModel[89] = new ModelRendererTurbo(this, 753, 201, textureX, textureY); // Box 186
		bodyModel[90] = new ModelRendererTurbo(this, 897, 209, textureX, textureY); // Box 187
		bodyModel[91] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); // Box 188
		bodyModel[92] = new ModelRendererTurbo(this, 625, 217, textureX, textureY); // Box 189
		bodyModel[93] = new ModelRendererTurbo(this, 409, 241, textureX, textureY); // Box 193
		bodyModel[94] = new ModelRendererTurbo(this, 177, 201, textureX, textureY); // Box 194
		bodyModel[95] = new ModelRendererTurbo(this, 129, 233, textureX, textureY); // Box 195
		bodyModel[96] = new ModelRendererTurbo(this, 249, 233, textureX, textureY); // Box 196
		bodyModel[97] = new ModelRendererTurbo(this, 297, 233, textureX, textureY); // Box 197
		bodyModel[98] = new ModelRendererTurbo(this, 561, 241, textureX, textureY); // Box 198
		bodyModel[99] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 199
		bodyModel[100] = new ModelRendererTurbo(this, 169, 113, textureX, textureY); // Box 200
		bodyModel[101] = new ModelRendererTurbo(this, 625, 241, textureX, textureY); // Box 201
		bodyModel[102] = new ModelRendererTurbo(this, 737, 241, textureX, textureY); // Box 202
		bodyModel[103] = new ModelRendererTurbo(this, 849, 241, textureX, textureY); // Box 203
		bodyModel[104] = new ModelRendererTurbo(this, 1, 265, textureX, textureY); // Box 204
		bodyModel[105] = new ModelRendererTurbo(this, 409, 217, textureX, textureY); // Box 205
		bodyModel[106] = new ModelRendererTurbo(this, 121, 266, textureX, textureY); // Box 206
		bodyModel[107] = new ModelRendererTurbo(this, 241, 265, textureX, textureY); // Box 207
		bodyModel[108] = new ModelRendererTurbo(this, 409, 265, textureX, textureY); // Box 208
		bodyModel[109] = new ModelRendererTurbo(this, 561, 257, textureX, textureY); // Box 209
		bodyModel[110] = new ModelRendererTurbo(this, 961, 249, textureX, textureY); // Box 210
		bodyModel[111] = new ModelRendererTurbo(this, 689, 265, textureX, textureY); // Box 212
		bodyModel[112] = new ModelRendererTurbo(this, 753, 265, textureX, textureY); // Box 213
		bodyModel[113] = new ModelRendererTurbo(this, 417, 377, textureX, textureY); // Box 290
		bodyModel[114] = new ModelRendererTurbo(this, 561, 305, textureX, textureY); // Box 291
		bodyModel[115] = new ModelRendererTurbo(this, 609, 361, textureX, textureY); // Box 292
		bodyModel[116] = new ModelRendererTurbo(this, 1, 401, textureX, textureY); // Box 293
		bodyModel[117] = new ModelRendererTurbo(this, 977, 369, textureX, textureY); // Box 294
		bodyModel[118] = new ModelRendererTurbo(this, 161, 401, textureX, textureY); // Box 295
		bodyModel[119] = new ModelRendererTurbo(this, 89, 401, textureX, textureY); // Box 296
		bodyModel[120] = new ModelRendererTurbo(this, 313, 409, textureX, textureY); // Box 297
		bodyModel[121] = new ModelRendererTurbo(this, 929, 393, textureX, textureY); // Box 298
		bodyModel[122] = new ModelRendererTurbo(this, 361, 57, textureX, textureY); // Box 300
		bodyModel[123] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 301
		bodyModel[124] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Box 302
		bodyModel[125] = new ModelRendererTurbo(this, 849, 145, textureX, textureY); // Box 303
		bodyModel[126] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 304
		bodyModel[127] = new ModelRendererTurbo(this, 625, 57, textureX, textureY); // Box 305
		bodyModel[128] = new ModelRendererTurbo(this, 129, 81, textureX, textureY); // Box 306
		bodyModel[129] = new ModelRendererTurbo(this, 889, 33, textureX, textureY); // Box 307
		bodyModel[130] = new ModelRendererTurbo(this, 945, 57, textureX, textureY); // Box 308
		bodyModel[131] = new ModelRendererTurbo(this, 465, 81, textureX, textureY); // Box 309
		bodyModel[132] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 310
		bodyModel[133] = new ModelRendererTurbo(this, 209, 65, textureX, textureY); // Box 311
		bodyModel[134] = new ModelRendererTurbo(this, 473, 81, textureX, textureY); // Box 312
		bodyModel[135] = new ModelRendererTurbo(this, 529, 49, textureX, textureY); // Box 313
		bodyModel[136] = new ModelRendererTurbo(this, 737, 65, textureX, textureY); // Box 314
		bodyModel[137] = new ModelRendererTurbo(this, 601, 81, textureX, textureY); // Box 315
		bodyModel[138] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 316
		bodyModel[139] = new ModelRendererTurbo(this, 105, 81, textureX, textureY); // Box 317
		bodyModel[140] = new ModelRendererTurbo(this, 561, 225, textureX, textureY); // Box 318
		bodyModel[141] = new ModelRendererTurbo(this, 985, 25, textureX, textureY); // Box 319
		bodyModel[142] = new ModelRendererTurbo(this, 721, 1, textureX, textureY); // Box 320
		bodyModel[143] = new ModelRendererTurbo(this, 73, 145, textureX, textureY); // Box 321
		bodyModel[144] = new ModelRendererTurbo(this, 129, 145, textureX, textureY); // Box 322
		bodyModel[145] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 323
		bodyModel[146] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 324
		bodyModel[147] = new ModelRendererTurbo(this, 257, 81, textureX, textureY); // Box 325
		bodyModel[148] = new ModelRendererTurbo(this, 529, 81, textureX, textureY); // Box 326
		bodyModel[149] = new ModelRendererTurbo(this, 561, 81, textureX, textureY); // Box 327
		bodyModel[150] = new ModelRendererTurbo(this, 1017, 73, textureX, textureY); // Box 328
		bodyModel[151] = new ModelRendererTurbo(this, 465, 137, textureX, textureY); // Box 329
		bodyModel[152] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Box 330
		bodyModel[153] = new ModelRendererTurbo(this, 649, 81, textureX, textureY); // Box 331
		bodyModel[154] = new ModelRendererTurbo(this, 1009, 49, textureX, textureY); // Box 332
		bodyModel[155] = new ModelRendererTurbo(this, 257, 65, textureX, textureY); // Box 333
		bodyModel[156] = new ModelRendererTurbo(this, 169, 121, textureX, textureY); // Box 334
		bodyModel[157] = new ModelRendererTurbo(this, 313, 145, textureX, textureY); // Box 335
		bodyModel[158] = new ModelRendererTurbo(this, 937, 177, textureX, textureY); // Box 336
		bodyModel[159] = new ModelRendererTurbo(this, 505, 81, textureX, textureY); // Box 337
		bodyModel[160] = new ModelRendererTurbo(this, 665, 81, textureX, textureY); // Box 338
		bodyModel[161] = new ModelRendererTurbo(this, 929, 81, textureX, textureY); // Box 339
		bodyModel[162] = new ModelRendererTurbo(this, 593, 81, textureX, textureY); // Box 340
		bodyModel[163] = new ModelRendererTurbo(this, 609, 305, textureX, textureY); // Box 386
		bodyModel[164] = new ModelRendererTurbo(this, 937, 329, textureX, textureY); // Box 451
		bodyModel[165] = new ModelRendererTurbo(this, 1001, 25, textureX, textureY); // Box 592
		bodyModel[166] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Import 
		bodyModel[167] = new ModelRendererTurbo(this, 537, 1, textureX, textureY); // Box 905
		bodyModel[168] = new ModelRendererTurbo(this, 1017, 25, textureX, textureY); // Box 906
		bodyModel[169] = new ModelRendererTurbo(this, 609, 1, textureX, textureY); // Box 444
		bodyModel[170] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 445
		bodyModel[171] = new ModelRendererTurbo(this, 777, 393, textureX, textureY); // Box 638
		bodyModel[172] = new ModelRendererTurbo(this, 337, 233, textureX, textureY); // Box 639
		bodyModel[173] = new ModelRendererTurbo(this, 833, 249, textureX, textureY); // Box 640
		bodyModel[174] = new ModelRendererTurbo(this, 449, 353, textureX, textureY); // Box 641
		bodyModel[175] = new ModelRendererTurbo(this, 665, 361, textureX, textureY); // Box 642
		bodyModel[176] = new ModelRendererTurbo(this, 313, 169, textureX, textureY); // Box 643
		bodyModel[177] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 644
		bodyModel[178] = new ModelRendererTurbo(this, 369, 169, textureX, textureY); // Box 645
		bodyModel[179] = new ModelRendererTurbo(this, 369, 57, textureX, textureY); // Box 646
		bodyModel[180] = new ModelRendererTurbo(this, 529, 1, textureX, textureY); // Box 210
		bodyModel[181] = new ModelRendererTurbo(this, 481, 417, textureX, textureY); // Box 211
		bodyModel[182] = new ModelRendererTurbo(this, 353, 377, textureX, textureY); // Box 212
		bodyModel[183] = new ModelRendererTurbo(this, 777, 1, textureX, textureY); // Box 675
		bodyModel[184] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 676
		bodyModel[185] = new ModelRendererTurbo(this, 529, 9, textureX, textureY); // Box 677
		bodyModel[186] = new ModelRendererTurbo(this, 825, 17, textureX, textureY); // Box 400
		bodyModel[187] = new ModelRendererTurbo(this, 1017, 17, textureX, textureY); // Box 401
		bodyModel[188] = new ModelRendererTurbo(this, 849, 25, textureX, textureY); // Box 402
		bodyModel[189] = new ModelRendererTurbo(this, 137, 89, textureX, textureY); // Box 415
		bodyModel[190] = new ModelRendererTurbo(this, 465, 105, textureX, textureY); // Box 416
		bodyModel[191] = new ModelRendererTurbo(this, 489, 105, textureX, textureY); // Box 417
		bodyModel[192] = new ModelRendererTurbo(this, 401, 41, textureX, textureY); // Box 227
		bodyModel[193] = new ModelRendererTurbo(this, 753, 49, textureX, textureY); // Box 228
		bodyModel[194] = new ModelRendererTurbo(this, 961, 49, textureX, textureY); // Box 229
		bodyModel[195] = new ModelRendererTurbo(this, 633, 57, textureX, textureY); // Box 230
		bodyModel[196] = new ModelRendererTurbo(this, 953, 57, textureX, textureY); // Box 231
		bodyModel[197] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 232
		bodyModel[198] = new ModelRendererTurbo(this, 577, 65, textureX, textureY); // Box 352
		bodyModel[199] = new ModelRendererTurbo(this, 513, 417, textureX, textureY); // Box 353
		bodyModel[200] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 354
		bodyModel[201] = new ModelRendererTurbo(this, 609, 417, textureX, textureY); // Box 427
		bodyModel[202] = new ModelRendererTurbo(this, 841, 409, textureX, textureY); // Box 428
		bodyModel[203] = new ModelRendererTurbo(this, 161, 425, textureX, textureY); // Box 429
		bodyModel[204] = new ModelRendererTurbo(this, 129, 113, textureX, textureY); // Box 430
		bodyModel[205] = new ModelRendererTurbo(this, 553, 417, textureX, textureY); // Box 431
		bodyModel[206] = new ModelRendererTurbo(this, 225, 273, textureX, textureY); // Box 432
		bodyModel[207] = new ModelRendererTurbo(this, 673, 273, textureX, textureY); // Box 433
		bodyModel[208] = new ModelRendererTurbo(this, 385, 377, textureX, textureY); // Box 434
		bodyModel[209] = new ModelRendererTurbo(this, 641, 417, textureX, textureY); // Box 435
		bodyModel[210] = new ModelRendererTurbo(this, 225, 65, textureX, textureY); // Box 436
		bodyModel[211] = new ModelRendererTurbo(this, 457, 169, textureX, textureY); // Box 437
		bodyModel[212] = new ModelRendererTurbo(this, 537, 169, textureX, textureY); // Box 438
		bodyModel[213] = new ModelRendererTurbo(this, 969, 81, textureX, textureY); // Box 439
		bodyModel[214] = new ModelRendererTurbo(this, 649, 489, textureX, textureY); // Box 440
		bodyModel[215] = new ModelRendererTurbo(this, 209, 353, textureX, textureY); // Box 493
		bodyModel[216] = new ModelRendererTurbo(this, 809, 201, textureX, textureY); // Box 494
		bodyModel[217] = new ModelRendererTurbo(this, 1001, 209, textureX, textureY); // Box 495

		bodyModel[0].addShapeBox(0F, 0F, 0F, 42, 24, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-88F, -48F, -12F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 48, 12, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[1].setRotationPoint(-46F, -36F, -12F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 16, 9, 12, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[2].setRotationPoint(-62F, -57F, -12F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 20, 24, 6, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 3
		bodyModel[3].setRotationPoint(-108F, -48F, -12F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 20, 9, 6, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 4
		bodyModel[4].setRotationPoint(-108F, -57F, -12F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 17, 19, 12, 0F,0F, -7F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 5
		bodyModel[5].setRotationPoint(-125F, -45F, -12F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 20, 7, 12, 0F,0F, -2.9999F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.9999F, 0F, -2.9999F, 0F, -0.9999F, 0F, -6.9999F, 0F, 0F, -6.9999F, 0F, -2.9999F, 0F, 0F); // Box 6
		bodyModel[6].setRotationPoint(-128F, -45F, -12F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 20, 12, 12, 0F,-1F, -3F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, -1F, -3F, 0F, 0F, 3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 8
		bodyModel[7].setRotationPoint(-128F, -57F, -12F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 48, 21, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[8].setRotationPoint(2F, -48F, -12F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 17, 3, 7, 0F,-10F, -1F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, -10F, -1F, 0F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 10
		bodyModel[9].setRotationPoint(-125F, -60F, -7F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 19, 3, 7, 0F,-1.9999F, -3.9999F, -1.9999F, 0F, -2.9999F, 0F, 0F, -2.9999F, 0F, -1.9999F, -3.9999F, 0F, 0F, 2.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.9999F, 0F); // Box 11
		bodyModel[10].setRotationPoint(-127F, -60F, -7F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 29, 9, 12, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[11].setRotationPoint(-46F, -57F, -12F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 6, 9, 6, 0F,0F, 0F, -5F, 0F, -4F, -2F, 0F, -4F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 16
		bodyModel[12].setRotationPoint(-17F, -57F, -12F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 26, 5, 3, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[13].setRotationPoint(-11F, -53F, -12F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 17, 5, 12, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[14].setRotationPoint(33F, -53F, -12F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 18, 2, 7, 0F,-17.9999F, 0F, -5.9999F, 0F, 0F, -5.9999F, 0F, 0F, 0F, -17.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.9999F, 0F, 0F, -5.9999F); // Box 19
		bodyModel[15].setRotationPoint(15F, -55F, -10F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 29, 3, 7, 0F,0F, 0F, -3F, -2F, 0F, -3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[16].setRotationPoint(-46F, -60F, -7F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 17, 3, 4, 0F,-17F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -17F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 21
		bodyModel[17].setRotationPoint(-79F, -60F, -7F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 12, 3, 4, 0F,0F, 0F, -2.9999F, 0F, -2.9999F, 0F, 0F, -2.9999F, -2.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.9999F, 0F, 0F, -2.9999F); // Box 22
		bodyModel[18].setRotationPoint(-108F, -60F, -7F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 42, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[19].setRotationPoint(-88F, -24F, -12F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 42, 7, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[20].setRotationPoint(-88F, -18F, -10F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 48, 6, 12, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -5F, -3F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[21].setRotationPoint(-46F, -24F, -12F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 48, 7, 10, 0F,0F, 0F, 0F, 0F, 5F, -1F, 0F, 5F, 0F, 0F, 0F, 0F, -13F, -1F, -7F, 0F, -6F, -7F, 0F, -6F, 0F, -13F, -1F, 0F); // Box 26
		bodyModel[22].setRotationPoint(-46F, -18F, -10F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 13, 7, 10, 0F,0F, 0F, 0F, 0F, -5.9999F, -6.9999F, 0F, -5.9999F, 0F, 0F, 0F, 0F, 0F, 0F, -6.9999F, 0F, -0.9999F, -6.9999F, 0F, -0.9999F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[23].setRotationPoint(-46F, -18F, -10F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 48, 9, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[24].setRotationPoint(2F, -36F, -9F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 48, 4, 12, 0F,0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -8F, -3F, 0F, -8F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[25].setRotationPoint(2F, -27F, -12F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 48, 6, 9, 0F,0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -10F, -6F, 0F, -10F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[26].setRotationPoint(2F, -23F, -9F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 20, 6, 12, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[27].setRotationPoint(-108F, -24F, -12F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 17, 8, 12, 0F,0F, 2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -3F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 33
		bodyModel[28].setRotationPoint(-125F, -26F, -12F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 20, 7, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 35
		bodyModel[29].setRotationPoint(-108F, -18F, -10F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 17, 4, 10, 0F,0F, 3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 36
		bodyModel[30].setRotationPoint(-125F, -18F, -10F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 16, 3, 7, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		bodyModel[31].setRotationPoint(-62F, -60F, -7F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 26, 9, 6, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		bodyModel[32].setRotationPoint(-88F, -57F, -12F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 18, 5, 3, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[33].setRotationPoint(15F, -53F, -12F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 17, 2, 10, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[34].setRotationPoint(33F, -55F, -10F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 29, 12, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[35].setRotationPoint(-46F, -48F, -12F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 19, 12, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[36].setRotationPoint(-17F, -48F, -12F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 17, 12, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[37].setRotationPoint(33F, -48F, -9F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 16, 24, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		bodyModel[38].setRotationPoint(-62F, -48F, -6F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 46, 7, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[39].setRotationPoint(-108F, -40F, -6F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 3, 14, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[40].setRotationPoint(-128F, -42F, -9F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[41].setRotationPoint(-11F, -62F, -10F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[42].setRotationPoint(-11F, -65F, -9F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[43].setRotationPoint(-11F, -65F, -4F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 26, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[44].setRotationPoint(-11F, -62F, -9F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[45].setRotationPoint(14F, -65F, -9F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133
		bodyModel[46].setRotationPoint(14F, -65F, -4F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134
		bodyModel[47].setRotationPoint(14F, -62F, -10F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[48].setRotationPoint(1.5F, -65F, -9F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		bodyModel[49].setRotationPoint(1.5F, -65F, -4F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
		bodyModel[50].setRotationPoint(1.5F, -62F, -10F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[51].setRotationPoint(-4.5F, -65F, -9F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		bodyModel[52].setRotationPoint(-4.5F, -65F, -4F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		bodyModel[53].setRotationPoint(-4.5F, -62F, -10F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[54].setRotationPoint(7.5F, -65F, -9F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		bodyModel[55].setRotationPoint(7.5F, -65F, -4F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[56].setRotationPoint(7.5F, -62F, -10F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4F, 3F, 0F, 4F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -3F, 0F, 4F, -3F, 0F); // Box 144
		bodyModel[57].setRotationPoint(-11F, -62F, -9F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		bodyModel[58].setRotationPoint(-15F, -65F, -4F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 30, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[59].setRotationPoint(-15F, -65F, -4F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 2F, 0F, 5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 2F); // Box 147
		bodyModel[60].setRotationPoint(-17F, -62F, -9F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		bodyModel[61].setRotationPoint(-20F, -65F, -4F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 5F, 2F, 0F, -2F, -3F, 0F, -2F, 3F, 0F, 5F, -2F, 0F, -5F, 2F, 0F, 2F, -3F, 0F, 2F, 3F, 0F, -5F, -2F); // Box 149
		bodyModel[62].setRotationPoint(15F, -57F, -7F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[63].setRotationPoint(15F, -65F, -4F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
		bodyModel[64].setRotationPoint(-96F, -63F, -7F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152
		bodyModel[65].setRotationPoint(-96F, -66F, -6F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[66].setRotationPoint(-96F, -66F, -3F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		bodyModel[67].setRotationPoint(-80F, -66F, -3F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[68].setRotationPoint(-80F, -66F, -6F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[69].setRotationPoint(-80F, -63F, -7F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 17, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[70].setRotationPoint(-96F, -63F, -6F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F); // Box 158
		bodyModel[71].setRotationPoint(-102F, -63F, -6F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		bodyModel[72].setRotationPoint(-102F, -65F, -4F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F); // Box 160
		bodyModel[73].setRotationPoint(-108F, -65F, -4F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 1F, 0F, 0F, 0F); // Box 161
		bodyModel[74].setRotationPoint(-102F, -65F, -4F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[75].setRotationPoint(-95F, -66F, -3F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 17, 1, 1, 0F,0F, 0F, 0F, 0F, -3F, -2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -2F, 0F, 3F, 2F, 0F, 0F, 0F); // Box 163
		bodyModel[76].setRotationPoint(-79F, -63F, -6F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 17, 1, 1, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[77].setRotationPoint(-79F, -66F, -3F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		bodyModel[78].setRotationPoint(-88F, -63F, -7F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[79].setRotationPoint(-88F, -66F, -6F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[80].setRotationPoint(-88F, -66F, -3F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[81].setRotationPoint(-94F, -63F, -7F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 42, 24, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		bodyModel[82].setRotationPoint(-88F, -48F, 6F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 48, 12, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[83].setRotationPoint(-46F, -36F, 0F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 16, 9, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		bodyModel[84].setRotationPoint(-62F, -57F, 0F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 20, 24, 6, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 182
		bodyModel[85].setRotationPoint(-108F, -48F, 6F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 20, 9, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 183
		bodyModel[86].setRotationPoint(-108F, -57F, 6F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 17, 19, 12, 0F,0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F); // Box 184
		bodyModel[87].setRotationPoint(-125F, -45F, 0F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 20, 7, 12, 0F,0F, -2.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.9999F, -1.9999F, -2.9999F, 0F, 0F, 0F, -6.9999F, 0F, 0F, -6.9999F, 0F, -2.9999F, 0F, -0.9999F); // Box 185
		bodyModel[88].setRotationPoint(-128F, -45F, 0F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 20, 12, 12, 0F,-1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -1F, -3F, -5F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -2F); // Box 186
		bodyModel[89].setRotationPoint(-128F, -57F, 0F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 48, 21, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F); // Box 187
		bodyModel[90].setRotationPoint(2F, -48F, 9F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 17, 3, 7, 0F,-10F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -10F, -1F, -4F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F); // Box 188
		bodyModel[91].setRotationPoint(-125F, -60F, 0F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 19, 3, 7, 0F,-1.9999F, -3.9999F, 0F, 0F, -2.9999F, 0F, 0F, -2.9999F, 0F, -1.9999F, -3.9999F, -1.9999F, 0F, 2.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.9999F, 0F); // Box 189
		bodyModel[92].setRotationPoint(-127F, -60F, 0F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 29, 9, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[93].setRotationPoint(-46F, -57F, 0F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 6, 9, 6, 0F,0F, 0F, 0F, 0F, -4F, -3F, 0F, -4F, -2F, 0F, 0F, -5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[94].setRotationPoint(-17F, -57F, 6F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 26, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		bodyModel[95].setRotationPoint(-11F, -53F, 9F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 17, 5, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[96].setRotationPoint(33F, -53F, 0F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 18, 2, 7, 0F,-17.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.9999F, -17.9999F, 0F, -5.9999F, 0F, 0F, -5.9999F, 0F, 0F, -5.9999F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		bodyModel[97].setRotationPoint(15F, -55F, 3F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 29, 3, 7, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		bodyModel[98].setRotationPoint(-46F, -60F, 0F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 17, 3, 4, 0F,-17F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -17F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		bodyModel[99].setRotationPoint(-79F, -60F, 3F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 12, 3, 4, 0F,0F, 0F, 0F, 0F, -2.9999F, -2.9999F, 0F, -2.9999F, 0F, 0F, 0F, -2.9999F, 0F, 0F, -2.9999F, 0F, 0F, -2.9999F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
		bodyModel[100].setRotationPoint(-108F, -60F, 3F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 42, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 201
		bodyModel[101].setRotationPoint(-88F, -24F, 0F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 42, 7, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F); // Box 202
		bodyModel[102].setRotationPoint(-88F, -18F, 0F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 48, 6, 12, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, -3F, 0F, 0F, -2F); // Box 203
		bodyModel[103].setRotationPoint(-46F, -24F, 0F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 48, 7, 10, 0F,0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, -1F, 0F, 0F, 0F, -13F, -1F, 0F, 0F, -6F, 0F, 0F, -6F, -7F, -13F, -1F, -7F); // Box 204
		bodyModel[104].setRotationPoint(-46F, -18F, 0F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 13, 7, 10, 0F,0F, 0F, 0F, 0F, -5.9999F, 0F, 0F, -5.9999F, -6.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9999F, 0F, 0F, -0.9999F, -6.9999F, 0F, 0F, -6.9999F); // Box 205
		bodyModel[105].setRotationPoint(-46F, -18F, 0F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 48, 9, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F); // Box 206
		bodyModel[106].setRotationPoint(2F, -36F, 0F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 48, 4, 12, 0F,0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, -3F, 0F, 0F, -3F); // Box 207
		bodyModel[107].setRotationPoint(2F, -27F, 0F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 48, 6, 9, 0F,0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, -6F, 0F, 0F, -6F); // Box 208
		bodyModel[108].setRotationPoint(2F, -23F, 0F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 20, 6, 12, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 209
		bodyModel[109].setRotationPoint(-108F, -24F, 0F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 17, 8, 12, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, -4F); // Box 210
		bodyModel[110].setRotationPoint(-125F, -26F, 0F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 20, 7, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -3F, -7F); // Box 212
		bodyModel[111].setRotationPoint(-108F, -18F, 0F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 17, 4, 10, 0F,0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -2F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -3F, -7F); // Box 213
		bodyModel[112].setRotationPoint(-125F, -18F, 0F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 26, 9, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 290
		bodyModel[113].setRotationPoint(-88F, -57F, 6F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 18, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 291
		bodyModel[114].setRotationPoint(15F, -53F, 9F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 17, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 292
		bodyModel[115].setRotationPoint(33F, -55F, 0F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 29, 12, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 293
		bodyModel[116].setRotationPoint(-46F, -48F, 0F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 19, 12, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 294
		bodyModel[117].setRotationPoint(-17F, -48F, 9F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 17, 12, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 295
		bodyModel[118].setRotationPoint(33F, -48F, 0F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 16, 24, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 296
		bodyModel[119].setRotationPoint(-62F, -48F, 0F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 46, 7, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 297
		bodyModel[120].setRotationPoint(-108F, -40F, 0F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 3, 14, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
		bodyModel[121].setRotationPoint(-128F, -42F, 0F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		bodyModel[122].setRotationPoint(-11F, -62F, 9F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F); // Box 301
		bodyModel[123].setRotationPoint(-11F, -65F, 4F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 302
		bodyModel[124].setRotationPoint(-11F, -65F, 0F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 26, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 303
		bodyModel[125].setRotationPoint(-11F, -62F, 8F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F); // Box 304
		bodyModel[126].setRotationPoint(14F, -65F, 4F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305
		bodyModel[127].setRotationPoint(14F, -65F, 0F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 306
		bodyModel[128].setRotationPoint(14F, -62F, 9F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F); // Box 307
		bodyModel[129].setRotationPoint(1.5F, -65F, 4F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 308
		bodyModel[130].setRotationPoint(1.5F, -65F, 0F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309
		bodyModel[131].setRotationPoint(1.5F, -62F, 9F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F); // Box 310
		bodyModel[132].setRotationPoint(-4.5F, -65F, 4F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 311
		bodyModel[133].setRotationPoint(-4.5F, -65F, 0F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 312
		bodyModel[134].setRotationPoint(-4.5F, -62F, 9F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F); // Box 313
		bodyModel[135].setRotationPoint(7.5F, -65F, 4F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 314
		bodyModel[136].setRotationPoint(7.5F, -65F, 0F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[137].setRotationPoint(7.5F, -62F, 9F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,4F, 3F, 0F, -4F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -3F, 0F, -4F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 316
		bodyModel[138].setRotationPoint(-11F, -62F, 4F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 317
		bodyModel[139].setRotationPoint(-15F, -65F, 0F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 30, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 318
		bodyModel[140].setRotationPoint(-15F, -65F, 3F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -5F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -2F, 0F, 5F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, -2F); // Box 319
		bodyModel[141].setRotationPoint(-17F, -62F, 8F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 320
		bodyModel[142].setRotationPoint(-20F, -65F, 3F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 5F, -2F, 0F, -2F, 3F, 0F, -2F, -3F, 0F, 5F, 2F, 0F, -5F, -2F, 0F, 2F, 3F, 0F, 2F, -3F, 0F, -5F, 2F); // Box 321
		bodyModel[143].setRotationPoint(15F, -57F, 6F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 0F, 0F); // Box 322
		bodyModel[144].setRotationPoint(15F, -65F, 3F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 323
		bodyModel[145].setRotationPoint(-96F, -63F, 6F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F); // Box 324
		bodyModel[146].setRotationPoint(-96F, -66F, 3F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 325
		bodyModel[147].setRotationPoint(-96F, -66F, 0F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 326
		bodyModel[148].setRotationPoint(-80F, -66F, 0F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F); // Box 327
		bodyModel[149].setRotationPoint(-80F, -66F, 3F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 328
		bodyModel[150].setRotationPoint(-80F, -63F, 6F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 17, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 329
		bodyModel[151].setRotationPoint(-96F, -63F, 5F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F); // Box 330
		bodyModel[152].setRotationPoint(-102F, -63F, 5F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 331
		bodyModel[153].setRotationPoint(-102F, -65F, 0F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F); // Box 332
		bodyModel[154].setRotationPoint(-108F, -65F, 3F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 1F, 1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, -1F, 0F, 0F, 0F); // Box 333
		bodyModel[155].setRotationPoint(-102F, -65F, 3F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 334
		bodyModel[156].setRotationPoint(-95F, -66F, 2F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 17, 1, 1, 0F,0F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 2F, 0F, 3F, -2F, 0F, 0F, 0F); // Box 335
		bodyModel[157].setRotationPoint(-79F, -63F, 5F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 17, 1, 1, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F); // Box 336
		bodyModel[158].setRotationPoint(-79F, -66F, 2F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 337
		bodyModel[159].setRotationPoint(-88F, -63F, 6F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F); // Box 338
		bodyModel[160].setRotationPoint(-88F, -66F, 3F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 339
		bodyModel[161].setRotationPoint(-88F, -66F, 0F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 340
		bodyModel[162].setRotationPoint(-94F, -63F, 6F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 16, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 386
		bodyModel[163].setRotationPoint(-62F, -60F, 0F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 5, 21, 1, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 451
		bodyModel[164].setRotationPoint(-59F, -81F, -0.5F);

		bodyModel[165].addShapeBox(-0.5F, 0F, -0.5F, 1, 4, 1, 0F,-1.2F, 0F, -0.2F, 0.8F, 0F, -0.2F, 0.8F, 0F, -0.2F, -1.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 592
		bodyModel[165].setRotationPoint(-96.5F, -49.5F, 0F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import 
		bodyModel[166].setRotationPoint(-97F, -41F, -1F);

		bodyModel[167].addShapeBox(0F, -1F, 0F, 1, 1, 2, 0F,0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Box 905
		bodyModel[167].setRotationPoint(-100F, -42.5F, -4F);
		bodyModel[167].rotateAngleZ = 0.41887903F;

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Box 906
		bodyModel[168].setRotationPoint(-100F, -42.5F, -4F);
		bodyModel[168].rotateAngleZ = 0.41887903F;

		bodyModel[169].addShapeBox(0F, -1F, 0F, 1, 1, 2, 0F,0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Box 444
		bodyModel[169].setRotationPoint(-100F, -42.5F, 2F);
		bodyModel[169].rotateAngleZ = 0.41887903F;

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Box 445
		bodyModel[170].setRotationPoint(-100F, -42.5F, 2F);
		bodyModel[170].rotateAngleZ = 0.41887903F;

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 15, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 638
		bodyModel[171].setRotationPoint(-80.5F, -58.5F, -4F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F); // Box 639
		bodyModel[172].setRotationPoint(-82.5F, -43.5F, -6F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -1F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F); // Box 640
		bodyModel[173].setRotationPoint(-85.5F, -41.5F, -6F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 641
		bodyModel[174].setRotationPoint(-91.5F, -40.5F, -6F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 642
		bodyModel[175].setRotationPoint(-94.5F, -42.5F, -6F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 7, 4, 1, 0F,4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F); // Box 643
		bodyModel[176].setRotationPoint(-89.5F, -43.5F, -6F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F); // Box 644
		bodyModel[177].setRotationPoint(-94.5F, -43.5F, -6F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 7, 4, 1, 0F,4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F); // Box 645
		bodyModel[178].setRotationPoint(-89.5F, -43.5F, 5F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F); // Box 646
		bodyModel[179].setRotationPoint(-94.5F, -43.5F, 5F);

		bodyModel[180].addShapeBox(-0.5F, 0F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		bodyModel[180].setRotationPoint(-95.5F, -52.5F, 0F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 3, 5, 11, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
		bodyModel[181].setRotationPoint(-100F, -55F, -11F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 11, 3, 8, 0F,0F, 0F, -4F, 0F, -0.25F, -4.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 212
		bodyModel[182].setRotationPoint(-108F, -58F, -8F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 675
		bodyModel[183].setRotationPoint(-97.75F, -55.5F, 2.5F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 676
		bodyModel[184].setRotationPoint(-97.75F, -55F, 2.5F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 677
		bodyModel[185].setRotationPoint(-97.75F, -55F, 2.5F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 400
		bodyModel[186].setRotationPoint(-97.75F, -55.5F, -4F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 401
		bodyModel[187].setRotationPoint(-97.75F, -55F, -4F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 402
		bodyModel[188].setRotationPoint(-97.75F, -55F, -4F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 415
		bodyModel[189].setRotationPoint(-97.75F, -56.5F, -1.25F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 416
		bodyModel[190].setRotationPoint(-97.75F, -56F, -1.25F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 417
		bodyModel[191].setRotationPoint(-97.75F, -55F, -1.25F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 227
		bodyModel[192].setRotationPoint(-97.75F, -53.5F, 1.5F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 228
		bodyModel[193].setRotationPoint(-97.75F, -53F, 1.5F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 229
		bodyModel[194].setRotationPoint(-97.75F, -53F, 1.5F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 230
		bodyModel[195].setRotationPoint(-97.75F, -53.5F, -3.5F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 231
		bodyModel[196].setRotationPoint(-97.75F, -53F, -3.5F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 232
		bodyModel[197].setRotationPoint(-97.75F, -53F, -3.5F);

		bodyModel[198].addShapeBox(-0.5F, 0F, -0.5F, 1, 5, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 352
		bodyModel[198].setRotationPoint(-96.5F, -45.5F, 0F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 11, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -4.25F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 353
		bodyModel[199].setRotationPoint(-108F, -58F, 0F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 354
		bodyModel[200].setRotationPoint(-80.5F, -63.25F, -2.5F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 3, 5, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 427
		bodyModel[201].setRotationPoint(-100F, -55F, 0F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 3, 10, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 428
		bodyModel[202].setRotationPoint(-103F, -50F, -7F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 19, 16, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 429
		bodyModel[203].setRotationPoint(-80F, -56F, -7F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 1, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 430
		bodyModel[204].setRotationPoint(5.5F, -63.25F, -2.5F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 1, 15, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 431
		bodyModel[205].setRotationPoint(5.5F, -58.5F, -4F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F); // Box 432
		bodyModel[206].setRotationPoint(7.5F, -43.5F, -6F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, -4F, 0F, 0F); // Box 433
		bodyModel[207].setRotationPoint(10.5F, -41.5F, -6F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 434
		bodyModel[208].setRotationPoint(14.5F, -40.5F, -6F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 435
		bodyModel[209].setRotationPoint(17.5F, -42.5F, -6F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, 0F, 0F); // Box 436
		bodyModel[210].setRotationPoint(19.5F, -43.5F, 5F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 7, 4, 1, 0F,0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F); // Box 437
		bodyModel[211].setRotationPoint(8.5F, -43.5F, 5F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 7, 4, 1, 0F,0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F); // Box 438
		bodyModel[212].setRotationPoint(8.5F, -43.5F, -6F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, 0F, 0F); // Box 439
		bodyModel[213].setRotationPoint(19.5F, -43.5F, -6F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 80, 12, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 440
		bodyModel[214].setRotationPoint(-46F, -40F, -9F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 6, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 493
		bodyModel[215].setRotationPoint(27F, -53F, -4F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 494
		bodyModel[216].setRotationPoint(29F, -55F, -4F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 495
		bodyModel[217].setRotationPoint(29F, -56F, -4F);
	}

	private void initnoseModel_1()
	{
		noseModel[0] = new ModelRendererTurbo(this, 833, 1, textureX, textureY); // Box 12
		noseModel[1] = new ModelRendererTurbo(this, 897, 1, textureX, textureY); // Box 13
		noseModel[2] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 14
		noseModel[3] = new ModelRendererTurbo(this, 753, 49, textureX, textureY); // Box 34
		noseModel[4] = new ModelRendererTurbo(this, 849, 25, textureX, textureY); // Box 37
		noseModel[5] = new ModelRendererTurbo(this, 993, 1, textureX, textureY); // Box 38
		noseModel[6] = new ModelRendererTurbo(this, 1001, 25, textureX, textureY); // Box 39
		noseModel[7] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 40
		noseModel[8] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Box 190
		noseModel[9] = new ModelRendererTurbo(this, 65, 233, textureX, textureY); // Box 191
		noseModel[10] = new ModelRendererTurbo(this, 969, 81, textureX, textureY); // Box 192
		noseModel[11] = new ModelRendererTurbo(this, 617, 265, textureX, textureY); // Box 211
		noseModel[12] = new ModelRendererTurbo(this, 497, 241, textureX, textureY); // Box 214
		noseModel[13] = new ModelRendererTurbo(this, 249, 177, textureX, textureY); // Box 215
		noseModel[14] = new ModelRendererTurbo(this, 633, 201, textureX, textureY); // Box 216
		noseModel[15] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 217
		noseModel[16] = new ModelRendererTurbo(this, 273, 161, textureX, textureY); // Box 388
		noseModel[17] = new ModelRendererTurbo(this, 145, 169, textureX, textureY); // Box 389
		noseModel[18] = new ModelRendererTurbo(this, 185, 169, textureX, textureY); // Box 390
		noseModel[19] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 391
		noseModel[20] = new ModelRendererTurbo(this, 817, 81, textureX, textureY); // Box 392
		noseModel[21] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 393
		noseModel[22] = new ModelRendererTurbo(this, 217, 89, textureX, textureY); // Box 394
		noseModel[23] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 395
		noseModel[24] = new ModelRendererTurbo(this, 577, 97, textureX, textureY); // Box 396
		noseModel[25] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 397
		noseModel[26] = new ModelRendererTurbo(this, 361, 105, textureX, textureY); // Box 398

		noseModel[0].addShapeBox(0F, 0F, 0F, 22, 10, 6, 0F,0F, -4F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -4F, 0F, 0F, -2F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -2F, 0F); // Box 12
		noseModel[0].setRotationPoint(-147F, -38F, -11F);

		noseModel[1].addShapeBox(0F, 0F, 0F, 22, 8, 6, 0F,-8F, 0F, -4F, -3F, 0F, -1F, -3F, 0F, -4F, -8F, 0F, -1F, 0F, 0F, -4F, 0F, -4F, 0F, 0F, -4F, -4F, 0F, 0F, 0F); // Box 13
		noseModel[1].setRotationPoint(-147F, -42F, -11F);

		noseModel[2].addShapeBox(0F, 0F, 0F, 3, 4, 7, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		noseModel[2].setRotationPoint(-150F, -34F, -7F);

		noseModel[3].addShapeBox(0F, 0F, 0F, 22, 7, 11, 0F,0F, 2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -8F, -2F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, -8F, -2F, 0F); // Box 34
		noseModel[3].setRotationPoint(-147F, -28F, -11F);

		noseModel[4].addShapeBox(0F, 0F, 0F, 14, 4, 8, 0F,0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -4F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 37
		noseModel[4].setRotationPoint(-139F, -21F, -8F);

		noseModel[5].addShapeBox(0F, 0F, 0F, 3, 7, 7, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, -3F, 8F, 0F, -1F, 8F, 0F, 0F, -9F, 0F, 0F); // Box 38
		noseModel[5].setRotationPoint(-150F, -30F, -7F);

		noseModel[6].addShapeBox(0F, 0F, 0F, 3, 8, 7, 0F,-9F, 0F, -3F, 8F, 0F, 0F, 8F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		noseModel[6].setRotationPoint(-150F, -42F, -7F);

		noseModel[7].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9999F, 0F, -2.9999F, 0F, 0F, -2.9999F, 0F, 0F, 0F, -1.9999F, 0F, 0F); // Box 40
		noseModel[7].setRotationPoint(-141F, -23F, -6F);

		noseModel[8].addShapeBox(0F, 0F, 0F, 22, 10, 6, 0F,0F, -4F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -4F, -4F, 0F, -2F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -2F, -4F); // Box 190
		noseModel[8].setRotationPoint(-147F, -38F, 5F);

		noseModel[9].addShapeBox(0F, 0F, 0F, 22, 8, 6, 0F,-8F, 0F, -1F, -3F, 0F, -4F, -3F, 0F, -1F, -8F, 0F, -4F, 0F, 0F, 0F, 0F, -4F, -4F, 0F, -4F, 0F, 0F, 0F, -4F); // Box 191
		noseModel[9].setRotationPoint(-147F, -42F, 5F);

		noseModel[10].addShapeBox(0F, 0F, 0F, 3, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 192
		noseModel[10].setRotationPoint(-150F, -34F, 0F);

		noseModel[11].addShapeBox(0F, 0F, 0F, 22, 7, 11, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -4F, -8F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -8F, -2F, -5F); // Box 211
		noseModel[11].setRotationPoint(-147F, -28F, 0F);

		noseModel[12].addShapeBox(0F, 0F, 0F, 14, 4, 8, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -2F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -4F, -5F); // Box 214
		noseModel[12].setRotationPoint(-139F, -21F, 0F);

		noseModel[13].addShapeBox(0F, 0F, 0F, 3, 7, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -9F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, -1F, -9F, 0F, -3F); // Box 215
		noseModel[13].setRotationPoint(-150F, -30F, 0F);

		noseModel[14].addShapeBox(0F, 0F, 0F, 3, 8, 7, 0F,-9F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, -9F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 216
		noseModel[14].setRotationPoint(-150F, -42F, 0F);

		noseModel[15].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9999F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.9999F, -1.9999F, 0F, -2.9999F); // Box 217
		noseModel[15].setRotationPoint(-141F, -23F, 0F);

		noseModel[16].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,-2F, 0F, -1F, -2F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 388
		noseModel[16].setRotationPoint(-135F, -57F, -3F);

		noseModel[17].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 389
		noseModel[17].setRotationPoint(-135F, -57F, 1F);

		noseModel[18].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 390
		noseModel[18].setRotationPoint(-135F, -57F, -1F);

		noseModel[19].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, -2F, 1F, 0F, -2F); // Box 391
		noseModel[19].setRotationPoint(-133F, -56F, -3F);

		noseModel[20].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 1F, -5F, 0F, 1F, -5F, 0F, -1F, 5F, 0F, -1F); // Box 392
		noseModel[20].setRotationPoint(-134F, -53F, -5F);

		noseModel[21].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 2F, 1F, 0F, 2F, 1F, 0F, -2F, -1F, 0F, -2F); // Box 393
		noseModel[21].setRotationPoint(-132F, -56F, -3F);

		noseModel[22].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 4F, 2F, 0F, 4F, 2F, 0F, -4F, -2F, 0F, -4F); // Box 394
		noseModel[22].setRotationPoint(-131F, -53F, -5F);

		noseModel[23].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 2F, 1F, 0F, 2F); // Box 395
		noseModel[23].setRotationPoint(-133F, -56F, 2F);

		noseModel[24].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, -1F, -5F, 0F, -1F, -5F, 0F, 1F, 5F, 0F, 1F); // Box 396
		noseModel[24].setRotationPoint(-134F, -53F, 4F);

		noseModel[25].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, 2F, -1F, 0F, 2F); // Box 397
		noseModel[25].setRotationPoint(-132F, -56F, 2F);

		noseModel[26].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -4F, 2F, 0F, -4F, 2F, 0F, 4F, -2F, 0F, 4F); // Box 398
		noseModel[26].setRotationPoint(-131F, -53F, 4F);
	}

	private void inittailModel_1()
	{
		tailModel[0] = new ModelRendererTurbo(this, 265, 57, textureX, textureY); // Box 41
		tailModel[1] = new ModelRendererTurbo(this, 369, 57, textureX, textureY); // Box 42
		tailModel[2] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Box 43
		tailModel[3] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 44
		tailModel[4] = new ModelRendererTurbo(this, 809, 57, textureX, textureY); // Box 45
		tailModel[5] = new ModelRendererTurbo(this, 577, 65, textureX, textureY); // Box 46
		tailModel[6] = new ModelRendererTurbo(this, 905, 65, textureX, textureY); // Box 47
		tailModel[7] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Box 48
		tailModel[8] = new ModelRendererTurbo(this, 137, 73, textureX, textureY); // Box 49
		tailModel[9] = new ModelRendererTurbo(this, 673, 73, textureX, textureY); // Box 50
		tailModel[10] = new ModelRendererTurbo(this, 649, 33, textureX, textureY); // Box 67
		tailModel[11] = new ModelRendererTurbo(this, 849, 81, textureX, textureY); // Box 68
		tailModel[12] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 69
		tailModel[13] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 70
		tailModel[14] = new ModelRendererTurbo(this, 881, 81, textureX, textureY); // Box 71
		tailModel[15] = new ModelRendererTurbo(this, 129, 89, textureX, textureY); // Box 72
		tailModel[16] = new ModelRendererTurbo(this, 225, 65, textureX, textureY); // Box 75
		tailModel[17] = new ModelRendererTurbo(this, 505, 81, textureX, textureY); // Box 76
		tailModel[18] = new ModelRendererTurbo(this, 897, 33, textureX, textureY); // Box 77
		tailModel[19] = new ModelRendererTurbo(this, 465, 105, textureX, textureY); // Box 78
		tailModel[20] = new ModelRendererTurbo(this, 273, 89, textureX, textureY); // Box 79
		tailModel[21] = new ModelRendererTurbo(this, 849, 97, textureX, textureY); // Box 88
		tailModel[22] = new ModelRendererTurbo(this, 921, 129, textureX, textureY); // Box 89
		tailModel[23] = new ModelRendererTurbo(this, 809, 265, textureX, textureY); // Box 218
		tailModel[24] = new ModelRendererTurbo(this, 913, 273, textureX, textureY); // Box 219
		tailModel[25] = new ModelRendererTurbo(this, 409, 281, textureX, textureY); // Box 220
		tailModel[26] = new ModelRendererTurbo(this, 1, 289, textureX, textureY); // Box 221
		tailModel[27] = new ModelRendererTurbo(this, 89, 289, textureX, textureY); // Box 222
		tailModel[28] = new ModelRendererTurbo(this, 185, 289, textureX, textureY); // Box 223
		tailModel[29] = new ModelRendererTurbo(this, 289, 289, textureX, textureY); // Box 224
		tailModel[30] = new ModelRendererTurbo(this, 65, 193, textureX, textureY); // Box 225
		tailModel[31] = new ModelRendererTurbo(this, 561, 289, textureX, textureY); // Box 226
		tailModel[32] = new ModelRendererTurbo(this, 649, 289, textureX, textureY); // Box 227
		tailModel[33] = new ModelRendererTurbo(this, 1, 257, textureX, textureY); // Box 243
		tailModel[34] = new ModelRendererTurbo(this, 753, 281, textureX, textureY); // Box 244
		tailModel[35] = new ModelRendererTurbo(this, 505, 209, textureX, textureY); // Box 245
		tailModel[36] = new ModelRendererTurbo(this, 1009, 41, textureX, textureY); // Box 246
		tailModel[37] = new ModelRendererTurbo(this, 177, 305, textureX, textureY); // Box 247
		tailModel[38] = new ModelRendererTurbo(this, 169, 329, textureX, textureY); // Box 248
		tailModel[39] = new ModelRendererTurbo(this, 681, 217, textureX, textureY); // Box 250
		tailModel[40] = new ModelRendererTurbo(this, 353, 233, textureX, textureY); // Box 251
		tailModel[41] = new ModelRendererTurbo(this, 993, 65, textureX, textureY); // Box 252
		tailModel[42] = new ModelRendererTurbo(this, 353, 329, textureX, textureY); // Box 253
		tailModel[43] = new ModelRendererTurbo(this, 257, 321, textureX, textureY); // Box 254
		tailModel[44] = new ModelRendererTurbo(this, 841, 329, textureX, textureY); // Box 262
		tailModel[45] = new ModelRendererTurbo(this, 497, 345, textureX, textureY); // Box 263
		tailModel[46] = new ModelRendererTurbo(this, 313, 489, textureX, textureY); // Box 453

		tailModel[0].addShapeBox(0F, 0F, 0F, 38, 13, 12, 0F,0F, 0F, 0F, 0F, 3F, -5F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -5F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 41
		tailModel[0].setRotationPoint(50F, -48F, -12F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 41, 11, 7, 0F,0F, 0F, 0F, 0F, 1F, -4F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, -4F, 0F, -7F, 0F, 0F, 0F, 0F); // Box 42
		tailModel[1].setRotationPoint(88F, -51F, -7F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 38, 5, 12, 0F,0F, 0F, -2F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -5F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 43
		tailModel[2].setRotationPoint(50F, -53F, -12F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 41, 2, 7, 0F,0F, 0F, -1F, 0F, 2F, -5F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -4F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 44
		tailModel[3].setRotationPoint(88F, -53F, -7F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 38, 4, 12, 0F,0F, 0F, 0F, 0F, 5F, -5F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -6F, -7F, 0F, -6F, 0F, 0F, 0F, 0F); // Box 45
		tailModel[4].setRotationPoint(50F, -35F, -12F);

		tailModel[5].addShapeBox(0F, 0F, 0F, 41, 3, 7, 0F,0F, 0F, 0F, 0F, 7F, -4F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, -6F, -5F, -2F, -6F, 0F, 0F, 0F, 0F); // Box 46
		tailModel[5].setRotationPoint(88F, -40F, -7F);

		tailModel[6].addShapeBox(0F, 0F, 0F, 38, 4, 9, 0F,0F, 0F, 0F, 0F, 6F, -4F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -8F, -6F, 0F, -8F, 0F, 0F, 0F, 0F); // Box 47
		tailModel[6].setRotationPoint(50F, -31F, -9F);

		tailModel[7].addShapeBox(0F, 0F, 0F, 39, 2, 5, 0F,0F, 0F, 0F, 0F, 6F, -3F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, -7F, -3F, -1F, -7F, 0F, 0F, 0F, 0F); // Box 48
		tailModel[7].setRotationPoint(88F, -37F, -5F);

		tailModel[8].addShapeBox(0F, 0F, 0F, 38, 2, 10, 0F,0F, 0F, -6F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		tailModel[8].setRotationPoint(50F, -55F, -10F);

		tailModel[9].addShapeBox(0F, 0F, 0F, 41, 2, 6, 0F,0F, 0F, -2.9999F, 0F, 0F, -3.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9999F, -3.9999F, 0F, -1.9999F, 0F, 0F, 0F, 0F); // Box 50
		tailModel[9].setRotationPoint(88F, -55F, -6F);

		tailModel[10].addShapeBox(0F, 0F, 0F, 21, 3, 3, 0F,0F, 0F, -0.9999F, 0F, -0.9999F, -1.9999F, 0F, -0.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9999F, -1.9999F, 0F, -1.9999F, 0F, 0F, 0F, 0F); // Box 67
		tailModel[10].setRotationPoint(129F, -55F, -3F);

		tailModel[11].addShapeBox(0F, 0F, 0F, 21, 5, 3, 0F,0F, 0F, 0F, 0F, 2F, -2F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, -2F, -3F, -2F, 0F, 0F, 0F, 0F); // Box 68
		tailModel[11].setRotationPoint(129F, -52F, -3F);

		tailModel[12].addShapeBox(0F, 0F, 0F, 18, 4, 3, 0F,0F, 0F, 0F, 0F, 1.9999F, -1.9999F, 0F, 1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9999F, 0F, -5.9999F, -1.9999F, 0F, -5.9999F, 0F, 0F, 0F, 0F); // Box 69
		tailModel[12].setRotationPoint(129F, -47F, -3F);

		tailModel[13].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F,-1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9999F, 0F, 0F, 0F, 0F, -0.9999F, 0F, 0F, -0.9999F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		tailModel[13].setRotationPoint(127F, -47F, -3F);

		tailModel[14].addShapeBox(0F, 0F, 0F, 12, 2, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		tailModel[14].setRotationPoint(123F, -51F, -17F);

		tailModel[15].addShapeBox(0F, 0F, 0F, 34, 2, 17, 0F,-7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		tailModel[15].setRotationPoint(89F, -51F, -17F);

		tailModel[16].addShapeBox(0F, 0F, 0F, 11, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 75
		tailModel[16].setRotationPoint(135F, -51F, -17F);

		tailModel[17].addShapeBox(0F, 0F, 0F, 7, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		tailModel[17].setRotationPoint(135F, -51F, -11F);

		tailModel[18].addShapeBox(0F, 0F, 0F, 12, 2, 2, 0F,0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		tailModel[18].setRotationPoint(135F, -51F, -3F);

		tailModel[19].addShapeBox(0F, 0F, 0F, 27, 2, 38, 0F,-13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		tailModel[19].setRotationPoint(96F, -51F, -55F);

		tailModel[20].addShapeBox(0F, 0F, 0F, 14, 2, 9, 0F,-6F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		tailModel[20].setRotationPoint(109F, -51F, -64F);

		tailModel[21].addShapeBox(0F, 0F, 0F, 12, 45, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		tailModel[21].setRotationPoint(117F, -100F, -2F);

		tailModel[22].addShapeBox(0F, 0F, 0F, 30, 45, 2, 0F,-20F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		tailModel[22].setRotationPoint(87F, -100F, -2F);

		tailModel[23].addShapeBox(0F, 0F, 0F, 38, 13, 12, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, -5F, 0F, 0F, 0F); // Box 218
		tailModel[23].setRotationPoint(50F, -48F, 0F);

		tailModel[24].addShapeBox(0F, 0F, 0F, 41, 11, 7, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, -4F, 0F, 0F, 0F); // Box 219
		tailModel[24].setRotationPoint(88F, -51F, 0F);

		tailModel[25].addShapeBox(0F, 0F, 0F, 38, 5, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -5F, 0F, 0F, 0F); // Box 220
		tailModel[25].setRotationPoint(50F, -53F, 0F);

		tailModel[26].addShapeBox(0F, 0F, 0F, 41, 2, 7, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -4F, 0F, 0F, 0F); // Box 221
		tailModel[26].setRotationPoint(88F, -53F, 0F);

		tailModel[27].addShapeBox(0F, 0F, 0F, 38, 4, 12, 0F,0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, -7F, 0F, 0F, -3F); // Box 222
		tailModel[27].setRotationPoint(50F, -35F, 0F);

		tailModel[28].addShapeBox(0F, 0F, 0F, 41, 3, 7, 0F,0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -6F, 0F, -2F, -6F, -5F, 0F, 0F, -2F); // Box 223
		tailModel[28].setRotationPoint(88F, -40F, 0F);

		tailModel[29].addShapeBox(0F, 0F, 0F, 38, 4, 9, 0F,0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, -6F, 0F, 0F, -6F); // Box 224
		tailModel[29].setRotationPoint(50F, -31F, 0F);

		tailModel[30].addShapeBox(0F, 0F, 0F, 39, 2, 5, 0F,0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -7F, 0F, -1F, -7F, -3F, 0F, 0F, -2F); // Box 225
		tailModel[30].setRotationPoint(88F, -37F, 0F);

		tailModel[31].addShapeBox(0F, 0F, 0F, 38, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 226
		tailModel[31].setRotationPoint(50F, -55F, 0F);

		tailModel[32].addShapeBox(0F, 0F, 0F, 41, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.9999F, 0F, 0F, -2.9999F, 0F, 0F, 0F, 0F, -1.9999F, 0F, 0F, -1.9999F, -3.9999F, 0F, 0F, 0F); // Box 227
		tailModel[32].setRotationPoint(88F, -55F, 0F);

		tailModel[33].addShapeBox(0F, 0F, 0F, 21, 3, 3, 0F,0F, 0F, 0F, 0F, -0.9999F, 0F, 0F, -0.9999F, -1.9999F, 0F, 0F, -0.9999F, 0F, 0F, 0F, 0F, -1.9999F, 0F, 0F, -1.9999F, -1.9999F, 0F, 0F, 0F); // Box 243
		tailModel[33].setRotationPoint(129F, -55F, 0F);

		tailModel[34].addShapeBox(0F, 0F, 0F, 21, 5, 3, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, -3F, -2F, -2F, 0F, 0F, 0F); // Box 244
		tailModel[34].setRotationPoint(129F, -52F, 0F);

		tailModel[35].addShapeBox(0F, 0F, 0F, 18, 4, 3, 0F,0F, 0F, 0F, 0F, 1.9999F, 0F, 0F, 1.9999F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.9999F, 0F, 0F, -5.9999F, -1.9999F, 0F, 0F, -0.9999F); // Box 245
		tailModel[35].setRotationPoint(129F, -47F, 0F);

		tailModel[36].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F,-1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9999F, 0F, 0F, -0.9999F); // Box 246
		tailModel[36].setRotationPoint(127F, -47F, 0F);

		tailModel[37].addShapeBox(0F, 0F, 0F, 12, 2, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		tailModel[37].setRotationPoint(123F, -51F, 0F);

		tailModel[38].addShapeBox(0F, 0F, 0F, 34, 2, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F); // Box 248
		tailModel[38].setRotationPoint(89F, -51F, 0F);

		tailModel[39].addShapeBox(0F, 0F, 0F, 11, 2, 6, 0F,0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 250
		tailModel[39].setRotationPoint(135F, -51F, 11F);

		tailModel[40].addShapeBox(0F, 0F, 0F, 7, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 251
		tailModel[40].setRotationPoint(135F, -51F, 3F);

		tailModel[41].addShapeBox(0F, 0F, 0F, 12, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F); // Box 252
		tailModel[41].setRotationPoint(135F, -51F, 1F);

		tailModel[42].addShapeBox(0F, 0F, 0F, 27, 2, 38, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F); // Box 253
		tailModel[42].setRotationPoint(96F, -51F, 17F);

		tailModel[43].addShapeBox(0F, 0F, 0F, 14, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -1F); // Box 254
		tailModel[43].setRotationPoint(109F, -51F, 55F);

		tailModel[44].addShapeBox(0F, 0F, 0F, 12, 45, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 262
		tailModel[44].setRotationPoint(117F, -100F, 0F);

		tailModel[45].addShapeBox(0F, 0F, 0F, 30, 45, 2, 0F,-20F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 263
		tailModel[45].setRotationPoint(87F, -100F, 0F);

		tailModel[46].addShapeBox(0F, 0F, 0F, 174, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 453
		tailModel[46].setRotationPoint(-56F, -80F, -0.5F);
		tailModel[46].rotateAngleZ = 0.08726646F;
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 51
		leftWingModel[1] = new ModelRendererTurbo(this, 761, 73, textureX, textureY); // Box 52
		leftWingModel[2] = new ModelRendererTurbo(this, 225, 81, textureX, textureY); // Box 53
		leftWingModel[3] = new ModelRendererTurbo(this, 993, 73, textureX, textureY); // Box 54
		leftWingModel[4] = new ModelRendererTurbo(this, 297, 81, textureX, textureY); // Box 56
		leftWingModel[5] = new ModelRendererTurbo(this, 537, 81, textureX, textureY); // Box 57
		leftWingModel[6] = new ModelRendererTurbo(this, 753, 81, textureX, textureY); // Box 58
		leftWingModel[7] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 59
		leftWingModel[8] = new ModelRendererTurbo(this, 577, 89, textureX, textureY); // Box 60
		leftWingModel[9] = new ModelRendererTurbo(this, 249, 169, textureX, textureY); // Box 62
		leftWingModel[10] = new ModelRendererTurbo(this, 409, 177, textureX, textureY); // Box 63
		leftWingModel[11] = new ModelRendererTurbo(this, 465, 81, textureX, textureY); // Box 64
		leftWingModel[12] = new ModelRendererTurbo(this, 521, 81, textureX, textureY); // Box 65
		leftWingModel[13] = new ModelRendererTurbo(this, 521, 9, textureX, textureY); // Box 66
		leftWingModel[14] = new ModelRendererTurbo(this, 649, 105, textureX, textureY); // Box 90
		leftWingModel[15] = new ModelRendererTurbo(this, 569, 97, textureX, textureY); // Box 91
		leftWingModel[16] = new ModelRendererTurbo(this, 753, 105, textureX, textureY); // Box 92
		leftWingModel[17] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 93
		leftWingModel[18] = new ModelRendererTurbo(this, 57, 113, textureX, textureY); // Box 94
		leftWingModel[19] = new ModelRendererTurbo(this, 129, 113, textureX, textureY); // Box 95
		leftWingModel[20] = new ModelRendererTurbo(this, 465, 105, textureX, textureY); // Box 96
		leftWingModel[21] = new ModelRendererTurbo(this, 249, 121, textureX, textureY); // Box 97
		leftWingModel[22] = new ModelRendererTurbo(this, 881, 105, textureX, textureY); // Box 100
		leftWingModel[23] = new ModelRendererTurbo(this, 313, 121, textureX, textureY); // Box 101
		leftWingModel[24] = new ModelRendererTurbo(this, 561, 121, textureX, textureY); // Box 102
		leftWingModel[25] = new ModelRendererTurbo(this, 337, 121, textureX, textureY); // Box 103
		leftWingModel[26] = new ModelRendererTurbo(this, 753, 129, textureX, textureY); // Box 104
		leftWingModel[27] = new ModelRendererTurbo(this, 1001, 121, textureX, textureY); // Box 105
		leftWingModel[28] = new ModelRendererTurbo(this, 785, 129, textureX, textureY); // Box 106
		leftWingModel[29] = new ModelRendererTurbo(this, 881, 129, textureX, textureY); // Box 107
		leftWingModel[30] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 108
		leftWingModel[31] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 109
		leftWingModel[32] = new ModelRendererTurbo(this, 249, 153, textureX, textureY); // Box 110
		leftWingModel[33] = new ModelRendererTurbo(this, 49, 169, textureX, textureY); // Box 111
		leftWingModel[34] = new ModelRendererTurbo(this, 105, 169, textureX, textureY); // Box 112
		leftWingModel[35] = new ModelRendererTurbo(this, 273, 169, textureX, textureY); // Box 113
		leftWingModel[36] = new ModelRendererTurbo(this, 329, 169, textureX, textureY); // Box 114
		leftWingModel[37] = new ModelRendererTurbo(this, 161, 169, textureX, textureY); // Box 115
		leftWingModel[38] = new ModelRendererTurbo(this, 409, 169, textureX, textureY); // Box 116
		leftWingModel[39] = new ModelRendererTurbo(this, 977, 169, textureX, textureY); // Box 127
		leftWingModel[40] = new ModelRendererTurbo(this, 689, 89, textureX, textureY); // Import Box0
		leftWingModel[41] = new ModelRendererTurbo(this, 97, 113, textureX, textureY); // Box 242
		leftWingModel[42] = new ModelRendererTurbo(this, 129, 97, textureX, textureY); // Box 243
		leftWingModel[43] = new ModelRendererTurbo(this, 1009, 1, textureX, textureY); // Box 244
		leftWingModel[44] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 245
		leftWingModel[45] = new ModelRendererTurbo(this, 273, 89, textureX, textureY); // Box 246
		leftWingModel[46] = new ModelRendererTurbo(this, 697, 97, textureX, textureY); // Box 247
		leftWingModel[47] = new ModelRendererTurbo(this, 561, 105, textureX, textureY); // Box 248
		leftWingModel[48] = new ModelRendererTurbo(this, 649, 105, textureX, textureY); // Box 249
		leftWingModel[49] = new ModelRendererTurbo(this, 753, 89, textureX, textureY); // Box 269
		leftWingModel[50] = new ModelRendererTurbo(this, 1017, 185, textureX, textureY); // Box 271
		leftWingModel[51] = new ModelRendererTurbo(this, 537, 257, textureX, textureY); // Box 273
		leftWingModel[52] = new ModelRendererTurbo(this, 1017, 273, textureX, textureY); // Box 275

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 46, 14, 10, 0F,0F, 0F, 0F, 0F, -13F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		leftWingModel[0].setRotationPoint(-61F, -47F, -22F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 17, 14, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		leftWingModel[1].setRotationPoint(-78F, -47F, -22F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 10, 14, 10, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		leftWingModel[2].setRotationPoint(-88F, -47F, -22F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 4, 11, 10, 0F,0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		leftWingModel[3].setRotationPoint(-92F, -44F, -22F);

		leftWingModel[4].addShapeBox(0F, 0F, 0F, 46, 14, 70, 0F,0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		leftWingModel[4].setRotationPoint(-61F, -47F, -92F);

		leftWingModel[5].addShapeBox(0F, 0F, 0F, 17, 14, 70, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		leftWingModel[5].setRotationPoint(-78F, -47F, -92F);

		leftWingModel[6].addShapeBox(0F, 0F, 0F, 10, 14, 70, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		leftWingModel[6].setRotationPoint(-88F, -47F, -92F);

		leftWingModel[7].addShapeBox(0F, 0F, 0F, 4, 11, 70, 0F,0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		leftWingModel[7].setRotationPoint(-92F, -44F, -92F);

		leftWingModel[8].addShapeBox(0F, 0F, 0F, 17, 5, 139, 0F,-7F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 11F, 0F, 0F, 11F, 0F); // Box 60
		leftWingModel[8].setRotationPoint(-78F, -49F, -231F);

		leftWingModel[9].addShapeBox(0F, 0F, 0F, 10, 5, 139, 0F,-17F, 0F, 0F, 7F, 0F, 0F, 0F, -2F, 0F, 0F, -5F, 0F, -17F, 0F, 0F, 7F, 0F, 0F, 0F, 11F, 0F, 0F, 11F, 0F); // Box 62
		leftWingModel[9].setRotationPoint(-88F, -49F, -231F);

		leftWingModel[10].addShapeBox(0F, 0F, 0F, 5, 5, 139, 0F,-16F, -3F, 0F, 16F, 0F, 0F, -1F, -5F, 0F, 0F, -13F, 0F, -16F, -1F, 0F, 16F, 0F, 0F, -1F, 11F, 0F, 0F, 11F, 0F); // Box 63
		leftWingModel[10].setRotationPoint(-92F, -49F, -231F);

		leftWingModel[11].addShapeBox(0F, 0F, 0F, 10, 5, 17, 0F,-4F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -4F, 0F, 8F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		leftWingModel[11].setRotationPoint(-71F, -49F, -248F);

		leftWingModel[12].addShapeBox(0F, 0F, 0F, 10, 5, 17, 0F,-8F, 0F, 0F, 6F, -1F, -3F, 10F, -4F, 0F, 0F, 0F, 0F, -8F, -4F, 0F, 6F, -3F, -3F, 10F, 0F, 0F, 0F, 0F, 0F); // Box 65
		leftWingModel[12].setRotationPoint(-61F, -49F, -248F);

		leftWingModel[13].addShapeBox(0F, 0F, 0F, 1, 5, 17, 0F,-4F, -1F, -4F, 8F, 0F, 0F, 4F, 0F, 0F, 0F, -3F, 0F, -4F, -3F, -4F, 8F, -4F, 0F, 4F, 0F, 0F, 0F, -1F, 0F); // Box 66
		leftWingModel[13].setRotationPoint(-76F, -49F, -248F);

		leftWingModel[14].addShapeBox(0F, 0F, 0F, 14, 11, 15, 0F,0F, 1F, -4F, 0F, 0F, -6F, 0F, 2F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		leftWingModel[14].setRotationPoint(-110F, -50F, -70F);

		leftWingModel[15].addShapeBox(0F, 0F, 0F, 5, 10, 13, 0F,0F, 1F, -4F, 0F, 0F, -4F, 0F, 2F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		leftWingModel[15].setRotationPoint(-96F, -49F, -68F);

		leftWingModel[16].addShapeBox(0F, 0F, 0F, 13, 10, 13, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		leftWingModel[16].setRotationPoint(-91F, -49F, -68F);

		leftWingModel[17].addShapeBox(0F, 0F, 0F, 13, 10, 13, 0F,0F, 0F, -3.9999F, 0F, -2.9999F, -12.9999F, 0F, -2.9999F, 0F, 0F, 0.9999F, 0F, 0F, 0F, 0F, 0F, 0F, -12.9999F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		leftWingModel[17].setRotationPoint(-78F, -49F, -68F);

		leftWingModel[18].addShapeBox(0F, 0F, 0F, 13, 11, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 1F, 0F, 0F, 2F, 0F); // Box 94
		leftWingModel[18].setRotationPoint(-91F, -39F, -68F);

		leftWingModel[19].addShapeBox(0F, 0F, 0F, 13, 11, 13, 0F,0F, 0F, 0F, 0F, 0F, -12.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.9999F, 0F, -5.9999F, -12.9999F, 0F, -5.9999F, 0F, 0F, 0.9999F, 0F); // Box 95
		leftWingModel[19].setRotationPoint(-78F, -39F, -68F);

		leftWingModel[20].addShapeBox(0F, 0F, 0F, 5, 11, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -4F, 0F, 0F, -4F, 0F, 2F, 0F, 0F, 3F, 0F); // Box 96
		leftWingModel[20].setRotationPoint(-96F, -39F, -68F);

		leftWingModel[21].addShapeBox(0F, 0F, 0F, 14, 12, 15, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -4F, 0F, 0F, -6F, 0F, 2F, 0F, 0F, 4F, 0F); // Box 97
		leftWingModel[21].setRotationPoint(-110F, -39F, -70F);

		leftWingModel[22].addShapeBox(0F, 0F, 0F, 4, 12, 7, 0F,0F, -2F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 100
		leftWingModel[22].setRotationPoint(-114F, -51F, -70F);

		leftWingModel[23].addShapeBox(0F, 0F, 0F, 4, 13, 7, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 101
		leftWingModel[23].setRotationPoint(-114F, -39F, -70F);

		leftWingModel[24].addShapeBox(0F, 0F, 0F, 4, 4, 11, 0F,0F, -2F, -1F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 102
		leftWingModel[24].setRotationPoint(-114F, -51F, -66F);

		leftWingModel[25].addShapeBox(0F, 0F, 0F, 4, 13, 7, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 103
		leftWingModel[25].setRotationPoint(-114F, -39F, -70F);

		leftWingModel[26].addShapeBox(0F, 0F, 0F, 4, 4, 11, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 1F, 0F); // Box 104
		leftWingModel[26].setRotationPoint(-114F, -30F, -66F);

		leftWingModel[27].addShapeBox(0F, 0F, 0F, 4, 12, 7, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -2F, -5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 105
		leftWingModel[27].setRotationPoint(-114F, -51F, -47F);

		leftWingModel[28].addShapeBox(0F, 0F, 0F, 4, 13, 7, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -2F, -5F); // Box 106
		leftWingModel[28].setRotationPoint(-114F, -39F, -47F);

		leftWingModel[29].addShapeBox(0F, 0F, 0F, 4, 4, 11, 0F,0F, 1F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 107
		leftWingModel[29].setRotationPoint(-114F, -51F, -55F);

		leftWingModel[30].addShapeBox(0F, 0F, 0F, 4, 4, 11, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, -2F, -1F); // Box 108
		leftWingModel[30].setRotationPoint(-114F, -30F, -55F);

		leftWingModel[31].addShapeBox(0F, 0F, 0F, 14, 11, 15, 0F,0F, 4F, 0F, 0F, 2F, 0F, 0F, 0F, -6F, 0F, 1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 109
		leftWingModel[31].setRotationPoint(-110F, -50F, -55F);

		leftWingModel[32].addShapeBox(0F, 0F, 0F, 5, 10, 13, 0F,0F, 3F, 0F, 0F, 2F, 0F, 0F, 0F, -4F, 0F, 1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		leftWingModel[32].setRotationPoint(-96F, -49F, -55F);

		leftWingModel[33].addShapeBox(0F, 0F, 0F, 13, 10, 13, 0F,0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		leftWingModel[33].setRotationPoint(-91F, -49F, -55F);

		leftWingModel[34].addShapeBox(0F, 0F, 0F, 13, 10, 13, 0F,0F, 0.9999F, 0F, 0F, -2.9999F, 0F, 0F, -2.9999F, -12.9999F, 0F, 0F, -3.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12.9999F, 0F, 0F, 0F); // Box 112
		leftWingModel[34].setRotationPoint(-78F, -49F, -55F);

		leftWingModel[35].addShapeBox(0F, 0F, 0F, 13, 11, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 113
		leftWingModel[35].setRotationPoint(-91F, -39F, -55F);

		leftWingModel[36].addShapeBox(0F, 0F, 0F, 13, 11, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12.9999F, 0F, 0F, 0F, 0F, 0.9999F, 0F, 0F, -5.9999F, 0F, 0F, -5.9999F, -12.9999F, 0F, 0F, -3.9999F); // Box 114
		leftWingModel[36].setRotationPoint(-78F, -39F, -55F);

		leftWingModel[37].addShapeBox(0F, 0F, 0F, 5, 11, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 2F, 0F, 0F, 0F, -4F, 0F, 1F, -4F); // Box 115
		leftWingModel[37].setRotationPoint(-96F, -39F, -55F);

		leftWingModel[38].addShapeBox(0F, 0F, 0F, 14, 12, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 2F, 0F, 0F, 0F, -6F, 0F, 1F, -4F); // Box 116
		leftWingModel[38].setRotationPoint(-110F, -39F, -55F);

		leftWingModel[39].addShapeBox(0F, 0F, 0F, 10, 3, 10, 0F,0F, -1.9999F, 0F, -9.9999F, -1.9999F, 0F, 0F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		leftWingModel[39].setRotationPoint(-15F, -36F, -22F);

		leftWingModel[40].addShapeBox(0F, 0F, 0F, 7, 5, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		leftWingModel[40].setRotationPoint(-122F, -41.5F, -57.5F);

		leftWingModel[41].addBox(0F, 0F, 0F, 7, 5, 3, 0F); // Box 242
		leftWingModel[41].setRotationPoint(-122F, -41.5F, -56.5F);

		leftWingModel[42].addShapeBox(0F, 0F, 0F, 7, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 243
		leftWingModel[42].setRotationPoint(-122F, -41.5F, -53.5F);

		leftWingModel[43].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, -0.9999F, -0.9999F, 0F, -0.9999F, 0F, 0F, 0F, 0F, 0F, -0.9999F, 0F, 0F, -0.9999F, -0.9999F, 0F, -0.9999F, 0F, 0F, 0F, 0F, 0F, -0.9999F, 0F); // Box 244
		leftWingModel[43].setRotationPoint(-123F, -41.5F, -57.5F);

		leftWingModel[44].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, -0.9999F, 0F, 0F, 0F, 0F, 0F, -0.9999F, 0F, 0F, -0.9999F, -0.9999F, 0F, -0.9999F, 0F, 0F, 0F, 0F, 0F, -0.9999F, 0F, 0F, -0.9999F, -0.9999F); // Box 245
		leftWingModel[44].setRotationPoint(-123F, -41.5F, -53.5F);

		leftWingModel[45].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 246
		leftWingModel[45].setRotationPoint(-123F, -41.5F, -56.5F);

		leftWingModel[46].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		leftWingModel[46].setRotationPoint(-116F, -40.5F, -55.5F);

		leftWingModel[47].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		leftWingModel[47].setRotationPoint(-116F, -40.5F, -56.5F);

		leftWingModel[48].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 249
		leftWingModel[48].setRotationPoint(-116F, -40.5F, -54.5F);

		leftWingModel[49].addShapeBox(0F, -12.5F, -1F, 1, 25, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 269
		leftWingModel[49].setRotationPoint(-111F, -39F, -55F);

		leftWingModel[50].addShapeBox(0F, -12.5F, -1F, 1, 25, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 271
		leftWingModel[50].setRotationPoint(-111F, -39F, -55F);
		leftWingModel[50].rotateAngleX = 1.57079633F;

		leftWingModel[51].addShapeBox(0F, -12.5F, -1F, 1, 25, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 273
		leftWingModel[51].setRotationPoint(-111F, -39F, -55F);
		leftWingModel[51].rotateAngleX = 0.78539816F;

		leftWingModel[52].addShapeBox(0F, -12.5F, -1F, 1, 25, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 275
		leftWingModel[52].setRotationPoint(-111F, -39F, -55F);
		leftWingModel[52].rotateAngleX = -0.78539816F;
	}

	private void initrightWingModel_1()
	{
		rightWingModel[0] = new ModelRendererTurbo(this, 737, 297, textureX, textureY); // Box 228
		rightWingModel[1] = new ModelRendererTurbo(this, 857, 297, textureX, textureY); // Box 229
		rightWingModel[2] = new ModelRendererTurbo(this, 913, 297, textureX, textureY); // Box 230
		rightWingModel[3] = new ModelRendererTurbo(this, 993, 225, textureX, textureY); // Box 231
		rightWingModel[4] = new ModelRendererTurbo(this, 1, 313, textureX, textureY); // Box 232
		rightWingModel[5] = new ModelRendererTurbo(this, 241, 321, textureX, textureY); // Box 233
		rightWingModel[6] = new ModelRendererTurbo(this, 633, 305, textureX, textureY); // Box 234
		rightWingModel[7] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 235
		rightWingModel[8] = new ModelRendererTurbo(this, 433, 329, textureX, textureY); // Box 236
		rightWingModel[9] = new ModelRendererTurbo(this, 1, 401, textureX, textureY); // Box 238
		rightWingModel[10] = new ModelRendererTurbo(this, 161, 409, textureX, textureY); // Box 239
		rightWingModel[11] = new ModelRendererTurbo(this, 961, 297, textureX, textureY); // Box 240
		rightWingModel[12] = new ModelRendererTurbo(this, 1, 305, textureX, textureY); // Box 241
		rightWingModel[13] = new ModelRendererTurbo(this, 873, 217, textureX, textureY); // Box 242
		rightWingModel[14] = new ModelRendererTurbo(this, 873, 329, textureX, textureY); // Box 264
		rightWingModel[15] = new ModelRendererTurbo(this, 353, 321, textureX, textureY); // Box 265
		rightWingModel[16] = new ModelRendererTurbo(this, 649, 337, textureX, textureY); // Box 266
		rightWingModel[17] = new ModelRendererTurbo(this, 1, 345, textureX, textureY); // Box 267
		rightWingModel[18] = new ModelRendererTurbo(this, 729, 345, textureX, textureY); // Box 268
		rightWingModel[19] = new ModelRendererTurbo(this, 169, 353, textureX, textureY); // Box 269
		rightWingModel[20] = new ModelRendererTurbo(this, 985, 321, textureX, textureY); // Box 270
		rightWingModel[21] = new ModelRendererTurbo(this, 225, 353, textureX, textureY); // Box 271
		rightWingModel[22] = new ModelRendererTurbo(this, 521, 217, textureX, textureY); // Box 272
		rightWingModel[23] = new ModelRendererTurbo(this, 449, 329, textureX, textureY); // Box 273
		rightWingModel[24] = new ModelRendererTurbo(this, 41, 217, textureX, textureY); // Box 274
		rightWingModel[25] = new ModelRendererTurbo(this, 41, 337, textureX, textureY); // Box 275
		rightWingModel[26] = new ModelRendererTurbo(this, 225, 305, textureX, textureY); // Box 276
		rightWingModel[27] = new ModelRendererTurbo(this, 273, 337, textureX, textureY); // Box 277
		rightWingModel[28] = new ModelRendererTurbo(this, 769, 337, textureX, textureY); // Box 278
		rightWingModel[29] = new ModelRendererTurbo(this, 353, 345, textureX, textureY); // Box 279
		rightWingModel[30] = new ModelRendererTurbo(this, 609, 345, textureX, textureY); // Box 280
		rightWingModel[31] = new ModelRendererTurbo(this, 873, 361, textureX, textureY); // Box 281
		rightWingModel[32] = new ModelRendererTurbo(this, 937, 369, textureX, textureY); // Box 282
		rightWingModel[33] = new ModelRendererTurbo(this, 961, 385, textureX, textureY); // Box 283
		rightWingModel[34] = new ModelRendererTurbo(this, 609, 393, textureX, textureY); // Box 284
		rightWingModel[35] = new ModelRendererTurbo(this, 665, 393, textureX, textureY); // Box 285
		rightWingModel[36] = new ModelRendererTurbo(this, 721, 393, textureX, textureY); // Box 286
		rightWingModel[37] = new ModelRendererTurbo(this, 841, 377, textureX, textureY); // Box 287
		rightWingModel[38] = new ModelRendererTurbo(this, 865, 393, textureX, textureY); // Box 288
		rightWingModel[39] = new ModelRendererTurbo(this, 1, 369, textureX, textureY); // Box 299
		rightWingModel[40] = new ModelRendererTurbo(this, 57, 305, textureX, textureY); // Box 364
		rightWingModel[41] = new ModelRendererTurbo(this, 1017, 305, textureX, textureY); // Box 365
		rightWingModel[42] = new ModelRendererTurbo(this, 169, 313, textureX, textureY); // Box 366
		rightWingModel[43] = new ModelRendererTurbo(this, 473, 329, textureX, textureY); // Box 367
		rightWingModel[44] = new ModelRendererTurbo(this, 697, 105, textureX, textureY); // Box 368
		rightWingModel[45] = new ModelRendererTurbo(this, 793, 105, textureX, textureY); // Box 369
		rightWingModel[46] = new ModelRendererTurbo(this, 697, 113, textureX, textureY); // Box 370
		rightWingModel[47] = new ModelRendererTurbo(this, 585, 121, textureX, textureY); // Box 371
		rightWingModel[48] = new ModelRendererTurbo(this, 649, 89, textureX, textureY); // Box 372
		rightWingModel[49] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 373
		rightWingModel[50] = new ModelRendererTurbo(this, 297, 121, textureX, textureY); // Box 374
		rightWingModel[51] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 375
		rightWingModel[52] = new ModelRendererTurbo(this, 249, 113, textureX, textureY); // Box 376

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 46, 14, 10, 0F,0F, 0F, 0F, 0F, -11F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 228
		rightWingModel[0].setRotationPoint(-61F, -47F, 12F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 17, 14, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 229
		rightWingModel[1].setRotationPoint(-78F, -47F, 12F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 10, 14, 10, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 230
		rightWingModel[2].setRotationPoint(-88F, -47F, 12F);

		rightWingModel[3].addShapeBox(0F, 0F, 0F, 4, 11, 10, 0F,0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 231
		rightWingModel[3].setRotationPoint(-92F, -44F, 12F);

		rightWingModel[4].addShapeBox(0F, 0F, 0F, 46, 14, 70, 0F,0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		rightWingModel[4].setRotationPoint(-61F, -47F, 22F);

		rightWingModel[5].addShapeBox(0F, 0F, 0F, 17, 14, 70, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 233
		rightWingModel[5].setRotationPoint(-78F, -47F, 22F);

		rightWingModel[6].addShapeBox(0F, 0F, 0F, 10, 14, 70, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
		rightWingModel[6].setRotationPoint(-88F, -47F, 22F);

		rightWingModel[7].addShapeBox(0F, 0F, 0F, 4, 11, 70, 0F,0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		rightWingModel[7].setRotationPoint(-92F, -44F, 22F);

		rightWingModel[8].addShapeBox(0F, 0F, 0F, 17, 5, 139, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 11F, 0F, 0F, 11F, 0F, 0F, 0F, 0F, -7F, 0F, 0F); // Box 236
		rightWingModel[8].setRotationPoint(-78F, -49F, 92F);

		rightWingModel[9].addShapeBox(0F, 0F, 0F, 10, 5, 139, 0F,0F, -5F, 0F, 0F, -2F, 0F, 7F, 0F, 0F, -17F, 0F, 0F, 0F, 11F, 0F, 0F, 11F, 0F, 7F, 0F, 0F, -17F, 0F, 0F); // Box 238
		rightWingModel[9].setRotationPoint(-88F, -49F, 92F);

		rightWingModel[10].addShapeBox(0F, 0F, 0F, 5, 5, 139, 0F,0F, -13F, 0F, -1F, -5F, 0F, 16F, 0F, 0F, -16F, -3F, 0F, 0F, 11F, 0F, -1F, 11F, 0F, 16F, 0F, 0F, -16F, -1F, 0F); // Box 239
		rightWingModel[10].setRotationPoint(-92F, -49F, 92F);

		rightWingModel[11].addShapeBox(0F, 0F, 0F, 10, 5, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, -4F, 0F, -4F, -4F, 0F); // Box 240
		rightWingModel[11].setRotationPoint(-71F, -49F, 231F);

		rightWingModel[12].addShapeBox(0F, 0F, 0F, 10, 5, 17, 0F,0F, 0F, 0F, 10F, -4F, 0F, 6F, -1F, -3F, -8F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, 6F, -3F, -3F, -8F, -4F, 0F); // Box 241
		rightWingModel[12].setRotationPoint(-61F, -49F, 231F);

		rightWingModel[13].addShapeBox(0F, 0F, 0F, 1, 5, 17, 0F,0F, -3F, 0F, 4F, 0F, 0F, 8F, 0F, 0F, -4F, -1F, -4F, 0F, -1F, 0F, 4F, 0F, 0F, 8F, -4F, 0F, -4F, -3F, -4F); // Box 242
		rightWingModel[13].setRotationPoint(-76F, -49F, 231F);

		rightWingModel[14].addShapeBox(0F, 0F, 0F, 14, 11, 15, 0F,0F, 4F, 0F, 0F, 2F, 0F, 0F, 0F, -6F, 0F, 1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 264
		rightWingModel[14].setRotationPoint(-110F, -50F, 55F);

		rightWingModel[15].addShapeBox(0F, 0F, 0F, 5, 10, 13, 0F,0F, 3F, 0F, 0F, 2F, 0F, 0F, 0F, -4F, 0F, 1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 265
		rightWingModel[15].setRotationPoint(-96F, -49F, 55F);

		rightWingModel[16].addShapeBox(0F, 0F, 0F, 13, 10, 13, 0F,0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 266
		rightWingModel[16].setRotationPoint(-91F, -49F, 55F);

		rightWingModel[17].addShapeBox(0F, 0F, 0F, 13, 10, 13, 0F,0F, 0.9999F, 0F, 0F, -2.9999F, 0F, 0F, -2.9999F, -12.9999F, 0F, 0F, -3.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12.9999F, 0F, 0F, 0F); // Box 267
		rightWingModel[17].setRotationPoint(-78F, -49F, 55F);

		rightWingModel[18].addShapeBox(0F, 0F, 0F, 13, 11, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 268
		rightWingModel[18].setRotationPoint(-91F, -39F, 55F);

		rightWingModel[19].addShapeBox(0F, 0F, 0F, 13, 11, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12.9999F, 0F, 0F, 0F, 0F, 0.9999F, 0F, 0F, -5.9999F, 0F, 0F, -5.9999F, -12.9999F, 0F, 0F, -3.9999F); // Box 269
		rightWingModel[19].setRotationPoint(-78F, -39F, 55F);

		rightWingModel[20].addShapeBox(0F, 0F, 0F, 5, 11, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 2F, 0F, 0F, 0F, -4F, 0F, 1F, -4F); // Box 270
		rightWingModel[20].setRotationPoint(-96F, -39F, 55F);

		rightWingModel[21].addShapeBox(0F, 0F, 0F, 14, 12, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 2F, 0F, 0F, 0F, -6F, 0F, 1F, -4F); // Box 271
		rightWingModel[21].setRotationPoint(-110F, -39F, 55F);

		rightWingModel[22].addShapeBox(0F, 0F, 0F, 4, 12, 7, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -2F, -5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 272
		rightWingModel[22].setRotationPoint(-114F, -51F, 63F);

		rightWingModel[23].addShapeBox(0F, 0F, 0F, 4, 13, 7, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -2F, -5F); // Box 273
		rightWingModel[23].setRotationPoint(-114F, -39F, 63F);

		rightWingModel[24].addShapeBox(0F, 0F, 0F, 4, 4, 11, 0F,0F, 1F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 274
		rightWingModel[24].setRotationPoint(-114F, -51F, 55F);

		rightWingModel[25].addShapeBox(0F, 0F, 0F, 4, 13, 7, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -2F, -5F); // Box 275
		rightWingModel[25].setRotationPoint(-114F, -39F, 63F);

		rightWingModel[26].addShapeBox(0F, 0F, 0F, 4, 4, 11, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, -2F, -1F); // Box 276
		rightWingModel[26].setRotationPoint(-114F, -30F, 55F);

		rightWingModel[27].addShapeBox(0F, 0F, 0F, 4, 12, 7, 0F,0F, -2F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 277
		rightWingModel[27].setRotationPoint(-114F, -51F, 40F);

		rightWingModel[28].addShapeBox(0F, 0F, 0F, 4, 13, 7, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 278
		rightWingModel[28].setRotationPoint(-114F, -39F, 40F);

		rightWingModel[29].addShapeBox(0F, 0F, 0F, 4, 4, 11, 0F,0F, -2F, -1F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 279
		rightWingModel[29].setRotationPoint(-114F, -51F, 44F);

		rightWingModel[30].addShapeBox(0F, 0F, 0F, 4, 4, 11, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 1F, 0F); // Box 280
		rightWingModel[30].setRotationPoint(-114F, -30F, 44F);

		rightWingModel[31].addShapeBox(0F, 0F, 0F, 14, 11, 15, 0F,0F, 1F, -4F, 0F, 0F, -6F, 0F, 2F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		rightWingModel[31].setRotationPoint(-110F, -50F, 40F);

		rightWingModel[32].addShapeBox(0F, 0F, 0F, 5, 10, 13, 0F,0F, 1F, -4F, 0F, 0F, -4F, 0F, 2F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 282
		rightWingModel[32].setRotationPoint(-96F, -49F, 42F);

		rightWingModel[33].addShapeBox(0F, 0F, 0F, 13, 10, 13, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 283
		rightWingModel[33].setRotationPoint(-91F, -49F, 42F);

		rightWingModel[34].addShapeBox(0F, 0F, 0F, 13, 10, 13, 0F,0F, 0F, -3.9999F, 0F, -2.9999F, -12.9999F, 0F, -2.9999F, 0F, 0F, 0.9999F, 0F, 0F, 0F, 0F, 0F, 0F, -12.9999F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 284
		rightWingModel[34].setRotationPoint(-78F, -49F, 42F);

		rightWingModel[35].addShapeBox(0F, 0F, 0F, 13, 11, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 1F, 0F, 0F, 2F, 0F); // Box 285
		rightWingModel[35].setRotationPoint(-91F, -39F, 42F);

		rightWingModel[36].addShapeBox(0F, 0F, 0F, 13, 11, 13, 0F,0F, 0F, 0F, 0F, 0F, -12.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.9999F, 0F, -5.9999F, -12.9999F, 0F, -5.9999F, 0F, 0F, 0.9999F, 0F); // Box 286
		rightWingModel[36].setRotationPoint(-78F, -39F, 42F);

		rightWingModel[37].addShapeBox(0F, 0F, 0F, 5, 11, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -4F, 0F, 0F, -4F, 0F, 2F, 0F, 0F, 3F, 0F); // Box 287
		rightWingModel[37].setRotationPoint(-96F, -39F, 42F);

		rightWingModel[38].addShapeBox(0F, 0F, 0F, 14, 12, 15, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -4F, 0F, 0F, -6F, 0F, 2F, 0F, 0F, 4F, 0F); // Box 288
		rightWingModel[38].setRotationPoint(-110F, -39F, 40F);

		rightWingModel[39].addShapeBox(0F, 0F, 0F, 10, 3, 10, 0F,0F, 0F, 0F, 0F, -1.9999F, 0F, -9.9999F, -1.9999F, 0F, 0F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9.9999F, 0F, 0F, 0F, 0F, 0F); // Box 299
		rightWingModel[39].setRotationPoint(-15F, -36F, 12F);

		rightWingModel[40].addShapeBox(0F, -12.5F, -1F, 1, 25, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364
		rightWingModel[40].setRotationPoint(-111F, -39F, 55F);

		rightWingModel[41].addShapeBox(0F, -12.5F, -1F, 1, 25, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 365
		rightWingModel[41].setRotationPoint(-111F, -39F, 55F);
		rightWingModel[41].rotateAngleX = -0.78539816F;

		rightWingModel[42].addShapeBox(0F, -12.5F, -1F, 1, 25, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 366
		rightWingModel[42].setRotationPoint(-111F, -39F, 55F);
		rightWingModel[42].rotateAngleX = 1.57079633F;

		rightWingModel[43].addShapeBox(0F, -12.5F, -1F, 1, 25, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 367
		rightWingModel[43].setRotationPoint(-111F, -39F, 55F);
		rightWingModel[43].rotateAngleX = 0.78539816F;

		rightWingModel[44].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 368
		rightWingModel[44].setRotationPoint(-116F, -40.5F, 55.5F);

		rightWingModel[45].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 369
		rightWingModel[45].setRotationPoint(-116F, -40.5F, 54.5F);

		rightWingModel[46].addShapeBox(0F, 0F, 0F, 7, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 370
		rightWingModel[46].setRotationPoint(-122F, -41.5F, 56.5F);

		rightWingModel[47].addBox(0F, 0F, 0F, 7, 5, 3, 0F); // Box 371
		rightWingModel[47].setRotationPoint(-122F, -41.5F, 53.5F);

		rightWingModel[48].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 372
		rightWingModel[48].setRotationPoint(-123F, -41.5F, 53.5F);

		rightWingModel[49].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, -0.9999F, 0F, 0F, 0F, 0F, 0F, -0.9999F, 0F, 0F, -0.9999F, -0.9999F, 0F, -0.9999F, 0F, 0F, 0F, 0F, 0F, -0.9999F, 0F, 0F, -0.9999F, -0.9999F); // Box 373
		rightWingModel[49].setRotationPoint(-123F, -41.5F, 56.5F);

		rightWingModel[50].addShapeBox(0F, 0F, 0F, 7, 5, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 374
		rightWingModel[50].setRotationPoint(-122F, -41.5F, 52.5F);

		rightWingModel[51].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, -0.9999F, -0.9999F, 0F, -0.9999F, 0F, 0F, 0F, 0F, 0F, -0.9999F, 0F, 0F, -0.9999F, -0.9999F, 0F, -0.9999F, 0F, 0F, 0F, 0F, 0F, -0.9999F, 0F); // Box 375
		rightWingModel[51].setRotationPoint(-123F, -41.5F, 52.5F);

		rightWingModel[52].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 376
		rightWingModel[52].setRotationPoint(-116F, -40.5F, 53.5F);
	}

	private void inityawFlapModel_1()
	{
		yawFlapModel[0] = new ModelRendererTurbo(this, 969, 97, textureX, textureY); // Box 83
		yawFlapModel[1] = new ModelRendererTurbo(this, 265, 105, textureX, textureY); // Box 84
		yawFlapModel[2] = new ModelRendererTurbo(this, 321, 89, textureX, textureY); // Box 85
		yawFlapModel[3] = new ModelRendererTurbo(this, 321, 105, textureX, textureY); // Box 86
		yawFlapModel[4] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 87
		yawFlapModel[5] = new ModelRendererTurbo(this, 497, 329, textureX, textureY); // Box 257
		yawFlapModel[6] = new ModelRendererTurbo(this, 609, 329, textureX, textureY); // Box 258
		yawFlapModel[7] = new ModelRendererTurbo(this, 729, 329, textureX, textureY); // Box 259
		yawFlapModel[8] = new ModelRendererTurbo(this, 353, 265, textureX, textureY); // Box 260
		yawFlapModel[9] = new ModelRendererTurbo(this, 465, 57, textureX, textureY); // Box 261

		yawFlapModel[0].addShapeBox(0F, 0F, 0F, 23, 12, 2, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, -1F, -2F, 1F, 0F, 0F, 0F, 0F); // Box 83
		yawFlapModel[0].setRotationPoint(129F, -67F, -2F);

		yawFlapModel[1].addShapeBox(0F, 0F, 0F, 23, 13, 2, 0F,0F, 0F, 0F, -3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		yawFlapModel[1].setRotationPoint(129F, -80F, -2F);

		yawFlapModel[2].addShapeBox(0F, 0F, 0F, 20, 11, 2, 0F,0F, 0F, 0F, -6F, 0F, -1F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		yawFlapModel[2].setRotationPoint(129F, -91F, -2F);

		yawFlapModel[3].addShapeBox(0F, 0F, 0F, 14, 6, 2, 0F,0F, 0F, 0F, -7F, 0F, -1F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		yawFlapModel[3].setRotationPoint(129F, -97F, -2F);

		yawFlapModel[4].addShapeBox(0F, 0F, 0F, 7, 3, 2, 0F,0F, 0F, 0F, 0F, -2.9999F, -0.9999F, 0F, -2.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9999F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		yawFlapModel[4].setRotationPoint(129F, -100F, -2F);

		yawFlapModel[5].addShapeBox(0F, 0F, 0F, 23, 12, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, -2F, 1F, -1F, 0F, 0F, 0F); // Box 257
		yawFlapModel[5].setRotationPoint(129F, -67F, 0F);

		yawFlapModel[6].addShapeBox(0F, 0F, 0F, 23, 13, 2, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 258
		yawFlapModel[6].setRotationPoint(129F, -80F, 0F);

		yawFlapModel[7].addShapeBox(0F, 0F, 0F, 20, 11, 2, 0F,0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 259
		yawFlapModel[7].setRotationPoint(129F, -91F, 0F);

		yawFlapModel[8].addShapeBox(0F, 0F, 0F, 14, 6, 2, 0F,0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 260
		yawFlapModel[8].setRotationPoint(129F, -97F, 0F);

		yawFlapModel[9].addShapeBox(0F, 0F, 0F, 7, 3, 2, 0F,0F, 0F, 0F, 0F, -2.9999F, 0F, 0F, -2.9999F, -0.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9999F, 0F, 0F, 0F); // Box 261
		yawFlapModel[9].setRotationPoint(129F, -100F, 0F);
	}

	private void initpitchFlapLeftModel_1()
	{
		pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 905, 81, textureX, textureY); // Box 73
		pitchFlapLeftModel[1] = new ModelRendererTurbo(this, 649, 89, textureX, textureY); // Box 80
		pitchFlapLeftModel[2] = new ModelRendererTurbo(this, 561, 81, textureX, textureY); // Box 82
		pitchFlapLeftModel[3] = new ModelRendererTurbo(this, 1, 329, textureX, textureY); // Box 255

		pitchFlapLeftModel[0].addShapeBox(0F, 0F, 0F, 12, 2, 38, 0F,0F, 0F, 0F, -2F, 0F, 0F, 11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 11F, 0F, 0F, 0F, 0F, 0F); // Box 73
		pitchFlapLeftModel[0].setRotationPoint(123F, -51F, -55F);

		pitchFlapLeftModel[1].addShapeBox(0F, 0F, 0F, 14, 2, 9, 0F,-6F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		pitchFlapLeftModel[1].setRotationPoint(109F, -51F, -64F);

		pitchFlapLeftModel[2].addShapeBox(0F, 0F, 0F, 10, 2, 9, 0F,0F, 0F, 0F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		pitchFlapLeftModel[2].setRotationPoint(123F, -51F, -64F);

		pitchFlapLeftModel[3].addShapeBox(0F, 0F, 0F, 14, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -1F); // Box 255
		pitchFlapLeftModel[3].setRotationPoint(109F, -51F, 55F);
	}

	private void initpitchFlapRightModel_1()
	{
		pitchFlapRightModel[0] = new ModelRendererTurbo(this, 921, 321, textureX, textureY); // Box 249
		pitchFlapRightModel[1] = new ModelRendererTurbo(this, 505, 281, textureX, textureY); // Box 256

		pitchFlapRightModel[0].addShapeBox(0F, 0F, 0F, 12, 2, 38, 0F,0F, 0F, 0F, 11F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 11F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 249
		pitchFlapRightModel[0].setRotationPoint(123F, -51F, 17F);

		pitchFlapRightModel[1].addShapeBox(0F, 0F, 0F, 10, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, 0F, 0F, 0F); // Box 256
		pitchFlapRightModel[1].setRotationPoint(123F, -51F, 55F);
	}

	private void initpitchFlapLeftWingModel_1()
	{
		pitchFlapLeftWingModel[0] = new ModelRendererTurbo(this, 65, 113, textureX, textureY); // Box 61

		pitchFlapLeftWingModel[0].addShapeBox(0F, 0F, 0F, 20, 5, 139, 0F,0F, 0F, 0F, 0F, -4F, 0F, 26F, -15F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 26F, 11F, 0F, 0F, 11F, 0F); // Box 61
		pitchFlapLeftWingModel[0].setRotationPoint(-61F, -49F, -231F);
	}

	private void initpitchFlapRightWingModel_1()
	{
		pitchFlapRightWingModel[0] = new ModelRendererTurbo(this, 657, 337, textureX, textureY); // Box 237

		pitchFlapRightWingModel[0].addShapeBox(0F, 0F, 0F, 20, 5, 139, 0F,0F, -2F, 0F, 26F, -15F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 11F, 0F, 26F, 11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 237
		pitchFlapRightWingModel[0].setRotationPoint(-61F, -49F, 92F);
	}

	private void inittailWheelModel_1()
	{
		tailWheelModel[0] = new ModelRendererTurbo(this, 25, 137, textureX, textureY); // Box 392
		tailWheelModel[1] = new ModelRendererTurbo(this, 929, 89, textureX, textureY); // Box 393
		tailWheelModel[2] = new ModelRendererTurbo(this, 41, 121, textureX, textureY); // Box 394
		tailWheelModel[3] = new ModelRendererTurbo(this, 753, 145, textureX, textureY); // Box 395
		tailWheelModel[4] = new ModelRendererTurbo(this, 273, 153, textureX, textureY); // Box 396
		tailWheelModel[5] = new ModelRendererTurbo(this, 89, 169, textureX, textureY); // Box 398
		tailWheelModel[6] = new ModelRendererTurbo(this, 593, 97, textureX, textureY); // Box 399

		tailWheelModel[0].addShapeBox(0F, 0F, 0F, 8, 3, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F); // Box 392
		tailWheelModel[0].setRotationPoint(118F, -42F, -2F);

		tailWheelModel[1].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 393
		tailWheelModel[1].setRotationPoint(121F, -39F, -2F);

		tailWheelModel[2].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		tailWheelModel[2].setRotationPoint(121F, -36F, -1F);

		tailWheelModel[3].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 395
		tailWheelModel[3].setRotationPoint(121F, -38F, -1F);

		tailWheelModel[4].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 396
		tailWheelModel[4].setRotationPoint(121F, -34F, -1F);

		tailWheelModel[5].addShapeBox(0F, 0F, 0F, 8, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 398
		tailWheelModel[5].setRotationPoint(118F, -42F, 0F);

		tailWheelModel[6].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 399
		tailWheelModel[6].setRotationPoint(121F, -39F, 1F);
	}

	private void initleftWingWheelModel_1()
	{
		leftWingWheelModel[0] = new ModelRendererTurbo(this, 473, 185, textureX, textureY); // Box 206
		leftWingWheelModel[1] = new ModelRendererTurbo(this, 945, 185, textureX, textureY); // Box 207
		leftWingWheelModel[2] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 208
		leftWingWheelModel[3] = new ModelRendererTurbo(this, 809, 105, textureX, textureY); // Box 209
		leftWingWheelModel[4] = new ModelRendererTurbo(this, 561, 137, textureX, textureY); // Box 210
		leftWingWheelModel[5] = new ModelRendererTurbo(this, 169, 129, textureX, textureY); // Box 211
		leftWingWheelModel[6] = new ModelRendererTurbo(this, 809, 49, textureX, textureY); // Box 212
		leftWingWheelModel[7] = new ModelRendererTurbo(this, 705, 169, textureX, textureY); // Box 213
		leftWingWheelModel[8] = new ModelRendererTurbo(this, 33, 145, textureX, textureY); // Box 214
		leftWingWheelModel[9] = new ModelRendererTurbo(this, 401, 41, textureX, textureY); // Box 215

		leftWingWheelModel[0].addShapeBox(0F, 0F, 0F, 24, 8, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		leftWingWheelModel[0].setRotationPoint(-105F, -6F, -60F);

		leftWingWheelModel[1].addShapeBox(0F, 0F, 0F, 24, 8, 11, 0F,-8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		leftWingWheelModel[1].setRotationPoint(-105F, -14F, -60F);

		leftWingWheelModel[2].addShapeBox(0F, 0F, 0F, 24, 8, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F); // Box 208
		leftWingWheelModel[2].setRotationPoint(-105F, 2F, -60F);

		leftWingWheelModel[3].addShapeBox(0F, 0F, 0F, 2, 31, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 209
		leftWingWheelModel[3].setRotationPoint(-94F, -29F, -62F);

		leftWingWheelModel[4].addShapeBox(0F, 0F, 0F, 17, 2, 2, 0F,0F, 0F, 0F, 0F, 16F, 0F, 0F, 16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, 0F); // Box 210
		leftWingWheelModel[4].setRotationPoint(-92F, 0F, -62F);

		leftWingWheelModel[5].addShapeBox(0F, 0F, 0F, 2, 2, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
		leftWingWheelModel[5].setRotationPoint(-75F, -16F, -62F);

		leftWingWheelModel[6].addShapeBox(0F, 0F, 0F, 12, 2, 2, 0F,0F, -7F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 7F, 0F); // Box 212
		leftWingWheelModel[6].setRotationPoint(-75F, -23F, -56F);

		leftWingWheelModel[7].addShapeBox(0F, 0F, 0F, 2, 31, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 213
		leftWingWheelModel[7].setRotationPoint(-94F, -29F, -49F);

		leftWingWheelModel[8].addShapeBox(0F, 0F, 0F, 17, 2, 2, 0F,0F, 0F, 0F, 0F, 16F, 0F, 0F, 16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, 0F); // Box 214
		leftWingWheelModel[8].setRotationPoint(-92F, 0F, -49F);

		leftWingWheelModel[9].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 215
		leftWingWheelModel[9].setRotationPoint(-94F, -18F, -60F);
	}

	private void initrightWingWheelModel_1()
	{
		rightWingWheelModel[0] = new ModelRendererTurbo(this, 217, 409, textureX, textureY); // Box 341
		rightWingWheelModel[1] = new ModelRendererTurbo(this, 945, 409, textureX, textureY); // Box 342
		rightWingWheelModel[2] = new ModelRendererTurbo(this, 409, 417, textureX, textureY); // Box 343
		rightWingWheelModel[3] = new ModelRendererTurbo(this, 377, 201, textureX, textureY); // Box 344
		rightWingWheelModel[4] = new ModelRendererTurbo(this, 665, 185, textureX, textureY); // Box 345
		rightWingWheelModel[5] = new ModelRendererTurbo(this, 273, 369, textureX, textureY); // Box 346
		rightWingWheelModel[6] = new ModelRendererTurbo(this, 41, 113, textureX, textureY); // Box 347
		rightWingWheelModel[7] = new ModelRendererTurbo(this, 193, 217, textureX, textureY); // Box 348
		rightWingWheelModel[8] = new ModelRendererTurbo(this, 497, 257, textureX, textureY); // Box 349
		rightWingWheelModel[9] = new ModelRendererTurbo(this, 689, 137, textureX, textureY); // Box 350

		rightWingWheelModel[0].addShapeBox(0F, 0F, 0F, 24, 8, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 341
		rightWingWheelModel[0].setRotationPoint(-105F, -6F, 49F);

		rightWingWheelModel[1].addShapeBox(0F, 0F, 0F, 24, 8, 11, 0F,-8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 342
		rightWingWheelModel[1].setRotationPoint(-105F, -14F, 49F);

		rightWingWheelModel[2].addShapeBox(0F, 0F, 0F, 24, 8, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F); // Box 343
		rightWingWheelModel[2].setRotationPoint(-105F, 2F, 49F);

		rightWingWheelModel[3].addShapeBox(0F, 0F, 0F, 2, 31, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 344
		rightWingWheelModel[3].setRotationPoint(-94F, -29F, 60F);

		rightWingWheelModel[4].addShapeBox(0F, 0F, 0F, 17, 2, 2, 0F,0F, 0F, 0F, 0F, 16F, 0F, 0F, 16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, 0F); // Box 345
		rightWingWheelModel[4].setRotationPoint(-92F, 0F, 60F);

		rightWingWheelModel[5].addShapeBox(0F, 0F, 0F, 2, 2, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 346
		rightWingWheelModel[5].setRotationPoint(-75F, -16F, 47F);

		rightWingWheelModel[6].addShapeBox(0F, 0F, 0F, 12, 2, 2, 0F,0F, -7F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 7F, 0F); // Box 347
		rightWingWheelModel[6].setRotationPoint(-75F, -23F, 54F);

		rightWingWheelModel[7].addShapeBox(0F, 0F, 0F, 2, 31, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 348
		rightWingWheelModel[7].setRotationPoint(-94F, -29F, 47F);

		rightWingWheelModel[8].addShapeBox(0F, 0F, 0F, 17, 2, 2, 0F,0F, 0F, 0F, 0F, 16F, 0F, 0F, 16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, 0F); // Box 349
		rightWingWheelModel[8].setRotationPoint(-92F, 0F, 47F);

		rightWingWheelModel[9].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 350
		rightWingWheelModel[9].setRotationPoint(-94F, -18F, 49F);
	}

	private void initPropeller()
	{
		propellerModels = new ModelRendererTurbo[2][3];
		propellerModels[0] = makeProp1(-116F, -39.5F, -55F);
		propellerModels[1] = makeProp2(-116F, -39.5F, 55F);
	}

	private ModelRendererTurbo[] makeProp1(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[3];
		prop[0] = new ModelRendererTurbo(this, 0, 445, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 445, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 0, 445, textureX, textureY);
		prop[0].addBox(-0.5F, -35F, -2F, 1, 35, 4, 0.0F);
		prop[1].addBox(-0.5F, -35F, -2F, 1, 35, 4, 0.0F);
		prop[2].addBox(-0.5F, -35F, -2F, 1, 35, 4, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		return prop;
	}

	private ModelRendererTurbo[] makeProp2(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[3];
		prop[0] = new ModelRendererTurbo(this, 0, 445, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 445, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 0, 445, textureX, textureY);
		prop[0].addBox(-0.5F, -35F, -2F, 1, 35, 4, 0.0F);
		prop[1].addBox(-0.5F, -35F, -2F, 1, 35, 4, 0.0F);
		prop[2].addBox(-0.5F, -35F, -2F, 1, 35, 4, 0.0F);
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

		gun_1_Model[0] = new ModelRendererTurbo[0];

		gun_1_Model[1] = new ModelRendererTurbo[12];
		gun_1_Model[1][0] = new ModelRendererTurbo(this, 670, 492, textureX, textureY); // MG1
		gun_1_Model[1][1] = new ModelRendererTurbo(this, 670, 495, textureX, textureY); // MG1 Innen
		gun_1_Model[1][2] = new ModelRendererTurbo(this, 670, 498, textureX, textureY); // MG1 Lauf
		gun_1_Model[1][3] = new ModelRendererTurbo(this, 670, 501, textureX, textureY); // MG2
		gun_1_Model[1][4] = new ModelRendererTurbo(this, 670, 506, textureX, textureY); // MG3
		gun_1_Model[1][5] = new ModelRendererTurbo(this, 677, 506, textureX, textureY); // MG4
		gun_1_Model[1][6] = new ModelRendererTurbo(this, 684, 506, textureX, textureY); // MG5
		gun_1_Model[1][7] = new ModelRendererTurbo(this, 697, 492, textureX, textureY); // MG6
		gun_1_Model[1][8] = new ModelRendererTurbo(this, 697, 496, textureX, textureY); // MG7
		gun_1_Model[1][9] = new ModelRendererTurbo(this, 691, 501, textureX, textureY); // MG8
		gun_1_Model[1][10] = new ModelRendererTurbo(this, 703, 501, textureX, textureY); // MG9
		gun_1_Model[1][11] = new ModelRendererTurbo(this, 693, 501, textureX, textureY); // Ammo

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
			gunPart.setRotationPoint(33F, -56F, 0F);
		}


		gun_1_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("Gun1", gun_1_Model);

		// Passenger 4
		ModelRendererTurbo[][] gun_3_Model = new ModelRendererTurbo[3][];

		gun_3_Model[0] = new ModelRendererTurbo[0];

		gun_3_Model[1] = new ModelRendererTurbo[12];
		gun_3_Model[1][0] = new ModelRendererTurbo(this, 670, 492, textureX, textureY); // MG1
		gun_3_Model[1][1] = new ModelRendererTurbo(this, 670, 495, textureX, textureY); // MG1 Innen
		gun_3_Model[1][2] = new ModelRendererTurbo(this, 670, 498, textureX, textureY); // MG1 Lauf
		gun_3_Model[1][3] = new ModelRendererTurbo(this, 670, 501, textureX, textureY); // MG2
		gun_3_Model[1][4] = new ModelRendererTurbo(this, 670, 506, textureX, textureY); // MG3
		gun_3_Model[1][5] = new ModelRendererTurbo(this, 677, 506, textureX, textureY); // MG4
		gun_3_Model[1][6] = new ModelRendererTurbo(this, 684, 506, textureX, textureY); // MG5
		gun_3_Model[1][7] = new ModelRendererTurbo(this, 697, 492, textureX, textureY); // MG6
		gun_3_Model[1][8] = new ModelRendererTurbo(this, 697, 496, textureX, textureY); // MG7
		gun_3_Model[1][9] = new ModelRendererTurbo(this, 691, 501, textureX, textureY); // MG8
		gun_3_Model[1][10] = new ModelRendererTurbo(this, 703, 501, textureX, textureY); // MG9
		gun_3_Model[1][11] = new ModelRendererTurbo(this, 693, 501, textureX, textureY); // Ammo

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
			gunPart.setRotationPoint(-145F, -43F, 0F);
		}


		gun_3_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("Gun2", gun_3_Model);
	}
}