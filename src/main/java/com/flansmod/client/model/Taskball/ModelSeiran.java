//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Seiran
// Model Creator: 
// Created on: 10.06.2023 - 20:15:33
// Last changed on: 10.06.2023 - 20:15:33

package com.flansmod.client.model.Taskball; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelSeiran extends ModelPlane //Same as Filename
{
	int textureX = 1024;
	int textureY = 512;

	public ModelSeiran() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[256];
		noseModel = new ModelRendererTurbo[72];
		tailModel = new ModelRendererTurbo[26];
		leftWingModel = new ModelRendererTurbo[50];
		rightWingModel = new ModelRendererTurbo[50];
		yawFlapModel = new ModelRendererTurbo[6];
		pitchFlapLeftModel = new ModelRendererTurbo[1];
		pitchFlapRightModel = new ModelRendererTurbo[1];

		initbodyModel_1();
		initnoseModel_1();
		inittailModel_1();
		initleftWingModel_1();
		initrightWingModel_1();
		inityawFlapModel_1();
		initpitchFlapLeftModel_1();
		initpitchFlapRightModel_1();

		initPropeller();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 553, 1, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 657, 1, textureX, textureY); // Box 10
		bodyModel[11] = new ModelRendererTurbo(this, 729, 1, textureX, textureY); // Box 11
		bodyModel[12] = new ModelRendererTurbo(this, 793, 1, textureX, textureY); // Box 12
		bodyModel[13] = new ModelRendererTurbo(this, 857, 1, textureX, textureY); // Box 13
		bodyModel[14] = new ModelRendererTurbo(this, 921, 1, textureX, textureY); // Box 14
		bodyModel[15] = new ModelRendererTurbo(this, 969, 1, textureX, textureY); // Box 15
		bodyModel[16] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 16
		bodyModel[17] = new ModelRendererTurbo(this, 961, 25, textureX, textureY); // Box 27
		bodyModel[18] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 28
		bodyModel[19] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 29
		bodyModel[20] = new ModelRendererTurbo(this, 601, 33, textureX, textureY); // Box 30
		bodyModel[21] = new ModelRendererTurbo(this, 769, 33, textureX, textureY); // Box 31
		bodyModel[22] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 103
		bodyModel[23] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 104
		bodyModel[24] = new ModelRendererTurbo(this, 929, 1, textureX, textureY); // Box 105
		bodyModel[25] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 106
		bodyModel[26] = new ModelRendererTurbo(this, 1009, 9, textureX, textureY); // Box 107
		bodyModel[27] = new ModelRendererTurbo(this, 1017, 9, textureX, textureY); // Box 108
		bodyModel[28] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 109
		bodyModel[29] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 110
		bodyModel[30] = new ModelRendererTurbo(this, 785, 9, textureX, textureY); // Box 111
		bodyModel[31] = new ModelRendererTurbo(this, 793, 9, textureX, textureY); // Box 112
		bodyModel[32] = new ModelRendererTurbo(this, 849, 9, textureX, textureY); // Box 113
		bodyModel[33] = new ModelRendererTurbo(this, 857, 9, textureX, textureY); // Box 114
		bodyModel[34] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 115
		bodyModel[35] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 116
		bodyModel[36] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 117
		bodyModel[37] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 118
		bodyModel[38] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 119
		bodyModel[39] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 120
		bodyModel[40] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 121
		bodyModel[41] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 122
		bodyModel[42] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 123
		bodyModel[43] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Box 124
		bodyModel[44] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 125
		bodyModel[45] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Box 126
		bodyModel[46] = new ModelRendererTurbo(this, 769, 25, textureX, textureY); // Box 127
		bodyModel[47] = new ModelRendererTurbo(this, 585, 33, textureX, textureY); // Box 128
		bodyModel[48] = new ModelRendererTurbo(this, 417, 89, textureX, textureY); // Box 130
		bodyModel[49] = new ModelRendererTurbo(this, 825, 33, textureX, textureY); // Box 131
		bodyModel[50] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 132
		bodyModel[51] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 133
		bodyModel[52] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 134
		bodyModel[53] = new ModelRendererTurbo(this, 881, 129, textureX, textureY); // Box 135
		bodyModel[54] = new ModelRendererTurbo(this, 433, 97, textureX, textureY); // Box 136
		bodyModel[55] = new ModelRendererTurbo(this, 241, 105, textureX, textureY); // Box 137
		bodyModel[56] = new ModelRendererTurbo(this, 697, 97, textureX, textureY); // Box 138
		bodyModel[57] = new ModelRendererTurbo(this, 977, 105, textureX, textureY); // Box 139
		bodyModel[58] = new ModelRendererTurbo(this, 81, 137, textureX, textureY); // Box 140
		bodyModel[59] = new ModelRendererTurbo(this, 425, 113, textureX, textureY); // Box 141
		bodyModel[60] = new ModelRendererTurbo(this, 409, 129, textureX, textureY); // Box 142
		bodyModel[61] = new ModelRendererTurbo(this, 617, 145, textureX, textureY); // Box 143
		bodyModel[62] = new ModelRendererTurbo(this, 465, 161, textureX, textureY); // Box 144
		bodyModel[63] = new ModelRendererTurbo(this, 665, 161, textureX, textureY); // Box 145
		bodyModel[64] = new ModelRendererTurbo(this, 329, 137, textureX, textureY); // Box 146
		bodyModel[65] = new ModelRendererTurbo(this, 737, 161, textureX, textureY); // Box 147
		bodyModel[66] = new ModelRendererTurbo(this, 801, 161, textureX, textureY); // Box 148
		bodyModel[67] = new ModelRendererTurbo(this, 569, 161, textureX, textureY); // Box 149
		bodyModel[68] = new ModelRendererTurbo(this, 89, 121, textureX, textureY); // Box 150
		bodyModel[69] = new ModelRendererTurbo(this, 969, 121, textureX, textureY); // Box 151
		bodyModel[70] = new ModelRendererTurbo(this, 57, 193, textureX, textureY); // Box 162
		bodyModel[71] = new ModelRendererTurbo(this, 121, 193, textureX, textureY); // Box 163
		bodyModel[72] = new ModelRendererTurbo(this, 177, 193, textureX, textureY); // Box 164
		bodyModel[73] = new ModelRendererTurbo(this, 281, 193, textureX, textureY); // Box 165
		bodyModel[74] = new ModelRendererTurbo(this, 353, 193, textureX, textureY); // Box 166
		bodyModel[75] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 232
		bodyModel[76] = new ModelRendererTurbo(this, 1017, 25, textureX, textureY); // Box 233
		bodyModel[77] = new ModelRendererTurbo(this, 609, 33, textureX, textureY); // Box 234
		bodyModel[78] = new ModelRendererTurbo(this, 969, 25, textureX, textureY); // Box 235
		bodyModel[79] = new ModelRendererTurbo(this, 777, 33, textureX, textureY); // Box 236
		bodyModel[80] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 237
		bodyModel[81] = new ModelRendererTurbo(this, 825, 33, textureX, textureY); // Box 238
		bodyModel[82] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 239
		bodyModel[83] = new ModelRendererTurbo(this, 721, 33, textureX, textureY); // Box 240
		bodyModel[84] = new ModelRendererTurbo(this, 769, 33, textureX, textureY); // Box 241
		bodyModel[85] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 242
		bodyModel[86] = new ModelRendererTurbo(this, 841, 33, textureX, textureY); // Box 243
		bodyModel[87] = new ModelRendererTurbo(this, 809, 57, textureX, textureY); // Box 244
		bodyModel[88] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 245
		bodyModel[89] = new ModelRendererTurbo(this, 1009, 57, textureX, textureY); // Box 246
		bodyModel[90] = new ModelRendererTurbo(this, 953, 41, textureX, textureY); // Box 247
		bodyModel[91] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 248
		bodyModel[92] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Box 249
		bodyModel[93] = new ModelRendererTurbo(this, 745, 49, textureX, textureY); // Box 250
		bodyModel[94] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 251
		bodyModel[95] = new ModelRendererTurbo(this, 385, 49, textureX, textureY); // Box 252
		bodyModel[96] = new ModelRendererTurbo(this, 89, 105, textureX, textureY); // Box 253
		bodyModel[97] = new ModelRendererTurbo(this, 129, 73, textureX, textureY); // Box 254
		bodyModel[98] = new ModelRendererTurbo(this, 889, 73, textureX, textureY); // Box 255
		bodyModel[99] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Box 256
		bodyModel[100] = new ModelRendererTurbo(this, 537, 81, textureX, textureY); // Box 257
		bodyModel[101] = new ModelRendererTurbo(this, 121, 121, textureX, textureY); // Box 258
		bodyModel[102] = new ModelRendererTurbo(this, 953, 105, textureX, textureY); // Box 259
		bodyModel[103] = new ModelRendererTurbo(this, 817, 57, textureX, textureY); // Box 260
		bodyModel[104] = new ModelRendererTurbo(this, 849, 33, textureX, textureY); // Box 261
		bodyModel[105] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Box 262
		bodyModel[106] = new ModelRendererTurbo(this, 473, 81, textureX, textureY); // Box 214
		bodyModel[107] = new ModelRendererTurbo(this, 105, 297, textureX, textureY); // Box 295
		bodyModel[108] = new ModelRendererTurbo(this, 545, 297, textureX, textureY); // Box 296
		bodyModel[109] = new ModelRendererTurbo(this, 409, 121, textureX, textureY); // Box 297
		bodyModel[110] = new ModelRendererTurbo(this, 601, 297, textureX, textureY); // Box 298
		bodyModel[111] = new ModelRendererTurbo(this, 417, 305, textureX, textureY); // Box 299
		bodyModel[112] = new ModelRendererTurbo(this, 305, 169, textureX, textureY); // Box 300
		bodyModel[113] = new ModelRendererTurbo(this, 1001, 177, textureX, textureY); // Box 301
		bodyModel[114] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Box 302
		bodyModel[115] = new ModelRendererTurbo(this, 377, 81, textureX, textureY); // Box 303
		bodyModel[116] = new ModelRendererTurbo(this, 113, 193, textureX, textureY); // Box 304
		bodyModel[117] = new ModelRendererTurbo(this, 129, 313, textureX, textureY); // Box 305
		bodyModel[118] = new ModelRendererTurbo(this, 337, 193, textureX, textureY); // Box 306
		bodyModel[119] = new ModelRendererTurbo(this, 521, 193, textureX, textureY); // Box 307
		bodyModel[120] = new ModelRendererTurbo(this, 761, 193, textureX, textureY); // Box 308
		bodyModel[121] = new ModelRendererTurbo(this, 537, 105, textureX, textureY); // Box 309
		bodyModel[122] = new ModelRendererTurbo(this, 969, 105, textureX, textureY); // Box 310
		bodyModel[123] = new ModelRendererTurbo(this, 1009, 105, textureX, textureY); // Box 311
		bodyModel[124] = new ModelRendererTurbo(this, 105, 113, textureX, textureY); // Box 312
		bodyModel[125] = new ModelRendererTurbo(this, 537, 113, textureX, textureY); // Box 313
		bodyModel[126] = new ModelRendererTurbo(this, 561, 81, textureX, textureY); // Box 314
		bodyModel[127] = new ModelRendererTurbo(this, 713, 81, textureX, textureY); // Box 315
		bodyModel[128] = new ModelRendererTurbo(this, 745, 81, textureX, textureY); // Box 316
		bodyModel[129] = new ModelRendererTurbo(this, 89, 89, textureX, textureY); // Box 317
		bodyModel[130] = new ModelRendererTurbo(this, 745, 97, textureX, textureY); // Box 318
		bodyModel[131] = new ModelRendererTurbo(this, 1017, 97, textureX, textureY); // Box 319
		bodyModel[132] = new ModelRendererTurbo(this, 289, 105, textureX, textureY); // Box 320
		bodyModel[133] = new ModelRendererTurbo(this, 473, 105, textureX, textureY); // Box 321
		bodyModel[134] = new ModelRendererTurbo(this, 185, 321, textureX, textureY); // Box 322
		bodyModel[135] = new ModelRendererTurbo(this, 241, 321, textureX, textureY); // Box 323
		bodyModel[136] = new ModelRendererTurbo(this, 697, 121, textureX, textureY); // Box 324
		bodyModel[137] = new ModelRendererTurbo(this, 297, 321, textureX, textureY); // Box 325
		bodyModel[138] = new ModelRendererTurbo(this, 353, 321, textureX, textureY); // Box 326
		bodyModel[139] = new ModelRendererTurbo(this, 169, 193, textureX, textureY); // Box 327
		bodyModel[140] = new ModelRendererTurbo(this, 409, 193, textureX, textureY); // Box 328
		bodyModel[141] = new ModelRendererTurbo(this, 953, 105, textureX, textureY); // Box 329
		bodyModel[142] = new ModelRendererTurbo(this, 473, 113, textureX, textureY); // Box 330
		bodyModel[143] = new ModelRendererTurbo(this, 241, 217, textureX, textureY); // Box 331
		bodyModel[144] = new ModelRendererTurbo(this, 745, 321, textureX, textureY); // Box 332
		bodyModel[145] = new ModelRendererTurbo(this, 369, 217, textureX, textureY); // Box 333
		bodyModel[146] = new ModelRendererTurbo(this, 665, 225, textureX, textureY); // Box 334
		bodyModel[147] = new ModelRendererTurbo(this, 993, 225, textureX, textureY); // Box 335
		bodyModel[148] = new ModelRendererTurbo(this, 809, 113, textureX, textureY); // Box 336
		bodyModel[149] = new ModelRendererTurbo(this, 713, 121, textureX, textureY); // Box 337
		bodyModel[150] = new ModelRendererTurbo(this, 729, 121, textureX, textureY); // Box 338
		bodyModel[151] = new ModelRendererTurbo(this, 809, 121, textureX, textureY); // Box 339
		bodyModel[152] = new ModelRendererTurbo(this, 737, 129, textureX, textureY); // Box 340
		bodyModel[153] = new ModelRendererTurbo(this, 665, 113, textureX, textureY); // Box 341
		bodyModel[154] = new ModelRendererTurbo(this, 689, 113, textureX, textureY); // Box 342
		bodyModel[155] = new ModelRendererTurbo(this, 865, 113, textureX, textureY); // Box 343
		bodyModel[156] = new ModelRendererTurbo(this, 1017, 113, textureX, textureY); // Box 344
		bodyModel[157] = new ModelRendererTurbo(this, 193, 121, textureX, textureY); // Box 345
		bodyModel[158] = new ModelRendererTurbo(this, 401, 121, textureX, textureY); // Box 346
		bodyModel[159] = new ModelRendererTurbo(this, 537, 121, textureX, textureY); // Box 347
		bodyModel[160] = new ModelRendererTurbo(this, 545, 121, textureX, textureY); // Box 348
		bodyModel[161] = new ModelRendererTurbo(this, 801, 321, textureX, textureY); // Box 349
		bodyModel[162] = new ModelRendererTurbo(this, 1, 329, textureX, textureY); // Box 350
		bodyModel[163] = new ModelRendererTurbo(this, 969, 137, textureX, textureY); // Box 351
		bodyModel[164] = new ModelRendererTurbo(this, 57, 329, textureX, textureY); // Box 352
		bodyModel[165] = new ModelRendererTurbo(this, 113, 329, textureX, textureY); // Box 353
		bodyModel[166] = new ModelRendererTurbo(this, 745, 225, textureX, textureY); // Box 354
		bodyModel[167] = new ModelRendererTurbo(this, 33, 233, textureX, textureY); // Box 355
		bodyModel[168] = new ModelRendererTurbo(this, 745, 121, textureX, textureY); // Box 356
		bodyModel[169] = new ModelRendererTurbo(this, 865, 121, textureX, textureY); // Box 357
		bodyModel[170] = new ModelRendererTurbo(this, 241, 233, textureX, textureY); // Box 358
		bodyModel[171] = new ModelRendererTurbo(this, 401, 329, textureX, textureY); // Box 359
		bodyModel[172] = new ModelRendererTurbo(this, 465, 233, textureX, textureY); // Box 360
		bodyModel[173] = new ModelRendererTurbo(this, 545, 241, textureX, textureY); // Box 361
		bodyModel[174] = new ModelRendererTurbo(this, 985, 241, textureX, textureY); // Box 362
		bodyModel[175] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 363
		bodyModel[176] = new ModelRendererTurbo(this, 161, 137, textureX, textureY); // Box 364
		bodyModel[177] = new ModelRendererTurbo(this, 185, 137, textureX, textureY); // Box 365
		bodyModel[178] = new ModelRendererTurbo(this, 665, 137, textureX, textureY); // Box 366
		bodyModel[179] = new ModelRendererTurbo(this, 737, 137, textureX, textureY); // Box 367
		bodyModel[180] = new ModelRendererTurbo(this, 1017, 121, textureX, textureY); // Box 368
		bodyModel[181] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 369
		bodyModel[182] = new ModelRendererTurbo(this, 473, 129, textureX, textureY); // Box 370
		bodyModel[183] = new ModelRendererTurbo(this, 961, 129, textureX, textureY); // Box 371
		bodyModel[184] = new ModelRendererTurbo(this, 241, 137, textureX, textureY); // Box 372
		bodyModel[185] = new ModelRendererTurbo(this, 289, 137, textureX, textureY); // Box 373
		bodyModel[186] = new ModelRendererTurbo(this, 401, 137, textureX, textureY); // Box 374
		bodyModel[187] = new ModelRendererTurbo(this, 409, 137, textureX, textureY); // Box 375
		bodyModel[188] = new ModelRendererTurbo(this, 969, 121, textureX, textureY); // Box 465
		bodyModel[189] = new ModelRendererTurbo(this, 593, 137, textureX, textureY); // Box 466
		bodyModel[190] = new ModelRendererTurbo(this, 985, 137, textureX, textureY); // Box 467
		bodyModel[191] = new ModelRendererTurbo(this, 1017, 137, textureX, textureY); // Box 468
		bodyModel[192] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 469
		bodyModel[193] = new ModelRendererTurbo(this, 9, 145, textureX, textureY); // Box 470
		bodyModel[194] = new ModelRendererTurbo(this, 193, 145, textureX, textureY); // Box 471
		bodyModel[195] = new ModelRendererTurbo(this, 241, 145, textureX, textureY); // Box 472
		bodyModel[196] = new ModelRendererTurbo(this, 465, 257, textureX, textureY); // Box 239
		bodyModel[197] = new ModelRendererTurbo(this, 745, 241, textureX, textureY); // Box 240
		bodyModel[198] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 241
		bodyModel[199] = new ModelRendererTurbo(this, 873, 161, textureX, textureY); // Box 242
		bodyModel[200] = new ModelRendererTurbo(this, 121, 249, textureX, textureY); // Box 243
		bodyModel[201] = new ModelRendererTurbo(this, 849, 321, textureX, textureY); // Box 244
		bodyModel[202] = new ModelRendererTurbo(this, 1009, 161, textureX, textureY); // Box 245
		bodyModel[203] = new ModelRendererTurbo(this, 873, 321, textureX, textureY); // Box 246
		bodyModel[204] = new ModelRendererTurbo(this, 105, 153, textureX, textureY); // Box 247
		bodyModel[205] = new ModelRendererTurbo(this, 1017, 193, textureX, textureY); // Box 248
		bodyModel[206] = new ModelRendererTurbo(this, 905, 225, textureX, textureY); // Box 250
		bodyModel[207] = new ModelRendererTurbo(this, 497, 233, textureX, textureY); // Box 251
		bodyModel[208] = new ModelRendererTurbo(this, 441, 177, textureX, textureY); // Box 252
		bodyModel[209] = new ModelRendererTurbo(this, 633, 177, textureX, textureY); // Box 253
		bodyModel[210] = new ModelRendererTurbo(this, 193, 89, textureX, textureY); // Box 962
		bodyModel[211] = new ModelRendererTurbo(this, 161, 145, textureX, textureY); // Box 964
		bodyModel[212] = new ModelRendererTurbo(this, 1009, 153, textureX, textureY); // Box 966
		bodyModel[213] = new ModelRendererTurbo(this, 441, 161, textureX, textureY); // Box 259
		bodyModel[214] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 260
		bodyModel[215] = new ModelRendererTurbo(this, 673, 257, textureX, textureY); // Box 256
		bodyModel[216] = new ModelRendererTurbo(this, 289, 185, textureX, textureY); // Box 249
		bodyModel[217] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 254
		bodyModel[218] = new ModelRendererTurbo(this, 9, 169, textureX, textureY); // Box 263
		bodyModel[219] = new ModelRendererTurbo(this, 801, 9, textureX, textureY); // Box 264
		bodyModel[220] = new ModelRendererTurbo(this, 545, 1, textureX, textureY); // Box 265
		bodyModel[221] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 266
		bodyModel[222] = new ModelRendererTurbo(this, 105, 321, textureX, textureY); // Box 814
		bodyModel[223] = new ModelRendererTurbo(this, 441, 329, textureX, textureY); // Box 429
		bodyModel[224] = new ModelRendererTurbo(this, 497, 329, textureX, textureY); // Box 430
		bodyModel[225] = new ModelRendererTurbo(this, 457, 249, textureX, textureY); // Box 484
		bodyModel[226] = new ModelRendererTurbo(this, 129, 169, textureX, textureY); // Box 485
		bodyModel[227] = new ModelRendererTurbo(this, 609, 185, textureX, textureY); // Box 487
		bodyModel[228] = new ModelRendererTurbo(this, 729, 257, textureX, textureY); // Box 488
		bodyModel[229] = new ModelRendererTurbo(this, 241, 265, textureX, textureY); // Box 489
		bodyModel[230] = new ModelRendererTurbo(this, 985, 257, textureX, textureY); // Box 490
		bodyModel[231] = new ModelRendererTurbo(this, 841, 185, textureX, textureY); // Box 491
		bodyModel[232] = new ModelRendererTurbo(this, 961, 201, textureX, textureY); // Box 492
		bodyModel[233] = new ModelRendererTurbo(this, 537, 329, textureX, textureY); // Box 493
		bodyModel[234] = new ModelRendererTurbo(this, 545, 257, textureX, textureY); // Box 494
		bodyModel[235] = new ModelRendererTurbo(this, 745, 257, textureX, textureY); // Box 495
		bodyModel[236] = new ModelRendererTurbo(this, 393, 65, textureX, textureY); // Box 496
		bodyModel[237] = new ModelRendererTurbo(this, 129, 97, textureX, textureY); // Box 497
		bodyModel[238] = new ModelRendererTurbo(this, 673, 161, textureX, textureY); // Box 498
		bodyModel[239] = new ModelRendererTurbo(this, 865, 177, textureX, textureY); // Box 499
		bodyModel[240] = new ModelRendererTurbo(this, 401, 241, textureX, textureY); // Box 578
		bodyModel[241] = new ModelRendererTurbo(this, 409, 241, textureX, textureY); // Box 579
		bodyModel[242] = new ModelRendererTurbo(this, 161, 329, textureX, textureY); // Box 580
		bodyModel[243] = new ModelRendererTurbo(this, 465, 297, textureX, textureY); // Box 582
		bodyModel[244] = new ModelRendererTurbo(this, 545, 193, textureX, textureY); // Box 583
		bodyModel[245] = new ModelRendererTurbo(this, 25, 209, textureX, textureY); // Box 584
		bodyModel[246] = new ModelRendererTurbo(this, 993, 265, textureX, textureY); // Box 585
		bodyModel[247] = new ModelRendererTurbo(this, 825, 209, textureX, textureY); // Box 586
		bodyModel[248] = new ModelRendererTurbo(this, 497, 217, textureX, textureY); // Box 587
		bodyModel[249] = new ModelRendererTurbo(this, 897, 329, textureX, textureY); // Box 588
		bodyModel[250] = new ModelRendererTurbo(this, 1017, 241, textureX, textureY); // Box 589
		bodyModel[251] = new ModelRendererTurbo(this, 905, 249, textureX, textureY); // Box 590
		bodyModel[252] = new ModelRendererTurbo(this, 273, 169, textureX, textureY); // Box 591
		bodyModel[253] = new ModelRendererTurbo(this, 321, 169, textureX, textureY); // Box 592
		bodyModel[254] = new ModelRendererTurbo(this, 129, 177, textureX, textureY); // Box 593
		bodyModel[255] = new ModelRendererTurbo(this, 185, 265, textureX, textureY); // Box 594

		bodyModel[0].addShapeBox(0F, 0F, 0F, 36, 10, 4, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-35F, -53F, -13F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 13, 10, 4, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[1].setRotationPoint(-48F, -53F, -13F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 20, 10, 6, 0F,0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 2
		bodyModel[2].setRotationPoint(1F, -53F, -13F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 18, 10, 10, 0F,0F, 0F, -4F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 3
		bodyModel[3].setRotationPoint(21F, -53F, -12F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 13, 5, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[4].setRotationPoint(-48F, -43F, -14F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 36, 5, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[5].setRotationPoint(-35F, -43F, -14F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 20, 5, 7, 0F,0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 6
		bodyModel[6].setRotationPoint(1F, -43F, -14F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 18, 5, 11, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 7
		bodyModel[7].setRotationPoint(21F, -43F, -13F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 13, 12, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[8].setRotationPoint(-48F, -38F, -14F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 36, 12, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[9].setRotationPoint(-35F, -38F, -14F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 20, 12, 14, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[10].setRotationPoint(1F, -38F, -14F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 18, 10, 13, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[11].setRotationPoint(21F, -38F, -13F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 17, 12, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[12].setRotationPoint(-65F, -38F, -14F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 17, 5, 14, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[13].setRotationPoint(-65F, -43F, -14F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 17, 10, 13, 0F,0F, -1F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[14].setRotationPoint(-65F, -53F, -13F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 13, 3, 4, 0F,0F, 0F, -3F, -9F, 0F, -3F, -9F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 15
		bodyModel[15].setRotationPoint(-48F, -56F, -10F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 17, 3, 10, 0F,0F, -1F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 16
		bodyModel[16].setRotationPoint(-65F, -56F, -10F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 17, 7, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[17].setRotationPoint(-65F, -26F, -14F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 13, 7, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[18].setRotationPoint(-48F, -26F, -14F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 36, 7, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -2F, -5F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[19].setRotationPoint(-35F, -26F, -14F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 20, 5, 14, 0F,0F, 0F, 0F, 0F, 2F, -1F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -2F, -5F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[20].setRotationPoint(1F, -26F, -14F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 18, 5, 14, 0F,0F, 0F, -1F, 0F, 2F, -2F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -1F, -6F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[21].setRotationPoint(21F, -28F, -14F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[22].setRotationPoint(-35F, -62F, -10F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		bodyModel[23].setRotationPoint(-27F, -62F, -10F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[24].setRotationPoint(-19F, -62F, -10F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[25].setRotationPoint(-9F, -61F, -10F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		bodyModel[26].setRotationPoint(0F, -60F, -10F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[27].setRotationPoint(10F, -59F, -9F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[28].setRotationPoint(20F, -58F, -8F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 110
		bodyModel[29].setRotationPoint(-35F, -62F, -6F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[30].setRotationPoint(-35F, -65F, -2F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[31].setRotationPoint(-27F, -65F, -2F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 113
		bodyModel[32].setRotationPoint(-27F, -62F, -6F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[33].setRotationPoint(-19F, -65F, -2F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 115
		bodyModel[34].setRotationPoint(-19F, -62F, -6F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[35].setRotationPoint(-9F, -64F, -2F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 117
		bodyModel[36].setRotationPoint(-9F, -61F, -6F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		bodyModel[37].setRotationPoint(0F, -63F, -2F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 119
		bodyModel[38].setRotationPoint(0F, -60F, -6F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[39].setRotationPoint(10F, -62F, -2F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 121
		bodyModel[40].setRotationPoint(10F, -59F, -5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 122
		bodyModel[41].setRotationPoint(20F, -58F, -4F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[42].setRotationPoint(20F, -60F, -2F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 17, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		bodyModel[43].setRotationPoint(-35F, -62F, -6F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[44].setRotationPoint(-18F, -62F, -6F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[45].setRotationPoint(-8F, -61F, -6F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 1F, 0F, 0F, 0F); // Box 127
		bodyModel[46].setRotationPoint(1F, -60F, -6F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 1F, 0F, 0F, 0F); // Box 128
		bodyModel[47].setRotationPoint(11F, -59F, -5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 0F, 0F, 0F, -5F, -1F, 0F, -5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, -1F, 0F, 5F, 1F, 0F, 0F, 0F); // Box 130
		bodyModel[48].setRotationPoint(21F, -58F, -4F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[49].setRotationPoint(-48F, -56F, -7F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 132
		bodyModel[50].setRotationPoint(-40F, -62F, -6F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -6F, 1F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, -6F, -1F, 0F, 6F, 1F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 6F, -1F); // Box 133
		bodyModel[51].setRotationPoint(-44F, -62F, -6F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 134
		bodyModel[52].setRotationPoint(-40F, -62F, -4F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 36, 10, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[53].setRotationPoint(-35F, -53F, 9F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 13, 10, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		bodyModel[54].setRotationPoint(-48F, -53F, 9F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 20, 10, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 137
		bodyModel[55].setRotationPoint(1F, -53F, 7F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 18, 10, 10, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -4F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[56].setRotationPoint(21F, -53F, 2F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 13, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		bodyModel[57].setRotationPoint(-48F, -43F, 9F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 36, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		bodyModel[58].setRotationPoint(-35F, -43F, 9F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 20, 5, 7, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 141
		bodyModel[59].setRotationPoint(1F, -43F, 7F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 18, 5, 11, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 142
		bodyModel[60].setRotationPoint(21F, -43F, 2F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 13, 12, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[61].setRotationPoint(-48F, -38F, 0F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 36, 12, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		bodyModel[62].setRotationPoint(-35F, -38F, 0F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 20, 12, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, 0F, 0F); // Box 145
		bodyModel[63].setRotationPoint(1F, -38F, 0F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 18, 10, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, 0F, 0F); // Box 146
		bodyModel[64].setRotationPoint(21F, -38F, 0F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 17, 12, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[65].setRotationPoint(-65F, -38F, 0F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 17, 5, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		bodyModel[66].setRotationPoint(-65F, -43F, 0F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 17, 10, 13, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[67].setRotationPoint(-65F, -53F, 0F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 13, 3, 4, 0F,0F, -1F, -1F, -9F, -1F, -1F, -9F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[68].setRotationPoint(-48F, -56F, 6F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 17, 3, 10, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, -3F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 151
		bodyModel[69].setRotationPoint(-65F, -56F, 0F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 17, 7, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 162
		bodyModel[70].setRotationPoint(-65F, -26F, 0F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 13, 7, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 163
		bodyModel[71].setRotationPoint(-48F, -26F, 0F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 36, 7, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -5F, 0F, 0F, -5F); // Box 164
		bodyModel[72].setRotationPoint(-35F, -26F, 0F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 20, 5, 14, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -5F, 0F, 0F, -5F); // Box 165
		bodyModel[73].setRotationPoint(1F, -26F, 0F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 18, 5, 14, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -6F, 0F, 0F, -5F); // Box 166
		bodyModel[74].setRotationPoint(21F, -28F, 0F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		bodyModel[75].setRotationPoint(-35F, -62F, 9F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 233
		bodyModel[76].setRotationPoint(-27F, -62F, 9F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
		bodyModel[77].setRotationPoint(-19F, -62F, 9F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		bodyModel[78].setRotationPoint(-9F, -61F, 9F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 236
		bodyModel[79].setRotationPoint(0F, -60F, 9F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 237
		bodyModel[80].setRotationPoint(10F, -59F, 8F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 238
		bodyModel[81].setRotationPoint(20F, -58F, 7F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
		bodyModel[82].setRotationPoint(-35F, -62F, 2F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		bodyModel[83].setRotationPoint(-35F, -65F, 0F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		bodyModel[84].setRotationPoint(-27F, -65F, 0F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		bodyModel[85].setRotationPoint(-27F, -62F, 2F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		bodyModel[86].setRotationPoint(-19F, -65F, 0F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		bodyModel[87].setRotationPoint(-19F, -62F, 2F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[88].setRotationPoint(-9F, -64F, 0F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 246
		bodyModel[89].setRotationPoint(-9F, -61F, 2F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[90].setRotationPoint(0F, -63F, 0F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[91].setRotationPoint(0F, -60F, 2F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[92].setRotationPoint(10F, -62F, 0F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[93].setRotationPoint(10F, -59F, 2F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 251
		bodyModel[94].setRotationPoint(20F, -58F, 2F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[95].setRotationPoint(20F, -60F, 0F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 17, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 253
		bodyModel[96].setRotationPoint(-35F, -62F, 5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 254
		bodyModel[97].setRotationPoint(-18F, -62F, 5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 255
		bodyModel[98].setRotationPoint(-8F, -61F, 5F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 1F, -1F, 0F, 0F, 0F); // Box 256
		bodyModel[99].setRotationPoint(1F, -60F, 5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 1F, -1F, 0F, 0F, 0F); // Box 257
		bodyModel[100].setRotationPoint(11F, -59F, 4F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 0F, 0F, 0F, -5F, 1F, 0F, -5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 1F, 0F, 5F, -1F, 0F, 0F, 0F); // Box 258
		bodyModel[101].setRotationPoint(21F, -58F, 3F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 259
		bodyModel[102].setRotationPoint(-48F, -56F, 0F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 260
		bodyModel[103].setRotationPoint(-40F, -62F, 5F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -6F, -1F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, -6F, 1F, 0F, 6F, -1F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 6F, 1F); // Box 261
		bodyModel[104].setRotationPoint(-44F, -62F, 5F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 262
		bodyModel[105].setRotationPoint(-40F, -62F, 0F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 3, 13, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 214
		bodyModel[106].setRotationPoint(-2F, -75F, -0.5F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 26, 7, 1, 0F,-3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F); // Box 295
		bodyModel[107].setRotationPoint(-44F, -24F, 9F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 26, 7, 1, 0F,-5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 296
		bodyModel[108].setRotationPoint(-44F, -24F, 8F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, -0.4F, -1.6F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -1.6F, 0F, -0.4F, -1.6F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -1.6F); // Box 297
		bodyModel[109].setRotationPoint(-18F, -14.5F, 6F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 19, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
		bodyModel[110].setRotationPoint(-41F, -17F, 6F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 19, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		bodyModel[111].setRotationPoint(-41F, -15F, 6F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F,0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F); // Box 300
		bodyModel[112].setRotationPoint(-45F, -15F, 6F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F,0F, -2F, -2.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, -2.5F, 0F, 0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -2F); // Box 301
		bodyModel[113].setRotationPoint(-45F, -17F, 6F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F); // Box 302
		bodyModel[114].setRotationPoint(-45.5F, -15F, 8F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.8F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.8F, -0.25F, -0.25F, -0.8F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.8F, -0.25F, -0.25F); // Box 303
		bodyModel[115].setRotationPoint(-46.5F, -15F, 8F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F,0F, 0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -2F, 0F, -2F, -2.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, -2.5F); // Box 304
		bodyModel[116].setRotationPoint(-45F, -13F, 6F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 19, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 305
		bodyModel[117].setRotationPoint(-41F, -13F, 6F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 8, 2, 6, 0F,0F, 0F, 0F, 0F, -0.75F, -2.75F, 0F, -0.75F, -2.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -2.75F, 0F, -0.75F, -2.75F, 0F, 0F, 0F); // Box 306
		bodyModel[118].setRotationPoint(-22F, -15F, 6F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 8, 2, 6, 0F,0F, 0F, -2F, 0F, -2.75F, -2.75F, 0F, -2.75F, -2.75F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0.75F, -2.75F, 0F, 0.75F, -2.75F, 0F, 0F, 0F); // Box 307
		bodyModel[119].setRotationPoint(-22F, -17F, 6F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 8, 2, 6, 0F,0F, 0F, 0F, 0F, 0.75F, -2.75F, 0F, 0.75F, -2.75F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2.75F, -2.75F, 0F, -2.75F, -2.75F, 0F, 0F, -2F); // Box 308
		bodyModel[120].setRotationPoint(-22F, -13F, 6F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F,0F, -1.6F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -1.6F, -0.4F, 0F, -1.6F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -1.6F, -0.4F); // Box 309
		bodyModel[121].setRotationPoint(-18F, -17F, 8.5F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 310
		bodyModel[122].setRotationPoint(-14F, -17F, 8.5F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 311
		bodyModel[123].setRotationPoint(-14F, -13F, 8.5F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 312
		bodyModel[124].setRotationPoint(-14F, -14.5F, 10F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 313
		bodyModel[125].setRotationPoint(-14F, -14.5F, 6F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0.2F, -0.9F, -0.75F, 0.2F, -0.9F, -0.75F, -0.1F, -1F, 0F, -0.1F, -1F, 0F, -0.1F, 0.2F, -0.75F, -0.1F, 0.2F); // Box 314
		bodyModel[126].setRotationPoint(-11F, -15F, 9F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0.2F, -0.9F, -0.75F, 0.2F, -0.9F, -0.75F, -0.1F, -1F, 0F, -0.1F, -1F, 0F, -0.1F, 0.2F, -0.75F, -0.1F, 0.2F); // Box 315
		bodyModel[127].setRotationPoint(-13F, -15F, 9F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, 0.2F, -0.9F, 0F, 0.2F, -0.9F, 0F, 0F, -0.1F, -0.75F, 0F, -0.1F, -0.75F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, -1F, -0.75F, -0.1F, -1F); // Box 316
		bodyModel[128].setRotationPoint(-13F, -15F, 8F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, 0.2F, -0.9F, 0F, 0.2F, -0.9F, 0F, 0F, -0.1F, -0.75F, 0F, -0.1F, -0.75F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, -1F, -0.75F, -0.1F, -1F); // Box 317
		bodyModel[129].setRotationPoint(-11F, -15F, 8F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, -1F, -0.75F, -0.1F, -1F, -0.75F, 0.2F, -0.9F, 0F, 0.2F, -0.9F, 0F, 0F, -0.1F, -0.75F, 0F, -0.1F); // Box 318
		bodyModel[130].setRotationPoint(-13F, -14F, 8F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, -1F, -0.75F, -0.1F, -1F, -0.75F, 0.2F, -0.9F, 0F, 0.2F, -0.9F, 0F, 0F, -0.1F, -0.75F, 0F, -0.1F); // Box 319
		bodyModel[131].setRotationPoint(-11F, -14F, 8F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, -0.1F, -1F, 0F, -0.1F, -1F, 0F, -0.1F, 0.2F, -0.75F, -0.1F, 0.2F, -0.75F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0.2F, -0.9F, -0.75F, 0.2F, -0.9F); // Box 320
		bodyModel[132].setRotationPoint(-11F, -14F, 9F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, -0.1F, -1F, 0F, -0.1F, -1F, 0F, -0.1F, 0.2F, -0.75F, -0.1F, 0.2F, -0.75F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0.2F, -0.9F, -0.75F, 0.2F, -0.9F); // Box 321
		bodyModel[133].setRotationPoint(-13F, -14F, 9F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 26, 7, 1, 0F,-5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 322
		bodyModel[134].setRotationPoint(-44F, -24F, -10F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 26, 7, 1, 0F,-3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F); // Box 323
		bodyModel[135].setRotationPoint(-44F, -24F, -9F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, -0.4F, -1.6F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -1.6F, 0F, -0.4F, -1.6F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -1.6F); // Box 324
		bodyModel[136].setRotationPoint(-18F, -14.5F, -12F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 19, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 325
		bodyModel[137].setRotationPoint(-41F, -17F, -12F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 19, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 326
		bodyModel[138].setRotationPoint(-41F, -15F, -12F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F,0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F); // Box 327
		bodyModel[139].setRotationPoint(-45F, -15F, -12F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F,0F, -2F, -2.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, -2.5F, 0F, 0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -2F); // Box 328
		bodyModel[140].setRotationPoint(-45F, -17F, -12F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F); // Box 329
		bodyModel[141].setRotationPoint(-45.5F, -15F, -10F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.8F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.8F, -0.25F, -0.25F, -0.8F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.8F, -0.25F, -0.25F); // Box 330
		bodyModel[142].setRotationPoint(-46.5F, -15F, -10F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F,0F, 0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -2F, 0F, -2F, -2.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, -2.5F); // Box 331
		bodyModel[143].setRotationPoint(-45F, -13F, -12F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 19, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 332
		bodyModel[144].setRotationPoint(-41F, -13F, -12F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 8, 2, 6, 0F,0F, 0F, 0F, 0F, -0.75F, -2.75F, 0F, -0.75F, -2.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -2.75F, 0F, -0.75F, -2.75F, 0F, 0F, 0F); // Box 333
		bodyModel[145].setRotationPoint(-22F, -15F, -12F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 8, 2, 6, 0F,0F, 0F, -2F, 0F, -2.75F, -2.75F, 0F, -2.75F, -2.75F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0.75F, -2.75F, 0F, 0.75F, -2.75F, 0F, 0F, 0F); // Box 334
		bodyModel[146].setRotationPoint(-22F, -17F, -12F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 8, 2, 6, 0F,0F, 0F, 0F, 0F, 0.75F, -2.75F, 0F, 0.75F, -2.75F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2.75F, -2.75F, 0F, -2.75F, -2.75F, 0F, 0F, -2F); // Box 335
		bodyModel[147].setRotationPoint(-22F, -13F, -12F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F,0F, -1.6F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -1.6F, -0.4F, 0F, -1.6F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -1.6F, -0.4F); // Box 336
		bodyModel[148].setRotationPoint(-18F, -17F, -9.5F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 337
		bodyModel[149].setRotationPoint(-14F, -17F, -9.5F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 338
		bodyModel[150].setRotationPoint(-14F, -13F, -9.5F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 339
		bodyModel[151].setRotationPoint(-14F, -14.5F, -12F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 340
		bodyModel[152].setRotationPoint(-14F, -14.5F, -8F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, 0.2F, -0.9F, 0F, 0.2F, -0.9F, 0F, 0F, -0.1F, -0.75F, 0F, -0.1F, -0.75F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, -1F, -0.75F, -0.1F, -1F); // Box 341
		bodyModel[153].setRotationPoint(-11F, -15F, -10F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, 0.2F, -0.9F, 0F, 0.2F, -0.9F, 0F, 0F, -0.1F, -0.75F, 0F, -0.1F, -0.75F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, -1F, -0.75F, -0.1F, -1F); // Box 342
		bodyModel[154].setRotationPoint(-13F, -15F, -10F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0.2F, -0.9F, -0.75F, 0.2F, -0.9F, -0.75F, -0.1F, -1F, 0F, -0.1F, -1F, 0F, -0.1F, 0.2F, -0.75F, -0.1F, 0.2F); // Box 343
		bodyModel[155].setRotationPoint(-13F, -15F, -9F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0.2F, -0.9F, -0.75F, 0.2F, -0.9F, -0.75F, -0.1F, -1F, 0F, -0.1F, -1F, 0F, -0.1F, 0.2F, -0.75F, -0.1F, 0.2F); // Box 344
		bodyModel[156].setRotationPoint(-11F, -15F, -9F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, -0.1F, -1F, 0F, -0.1F, -1F, 0F, -0.1F, 0.2F, -0.75F, -0.1F, 0.2F, -0.75F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0.2F, -0.9F, -0.75F, 0.2F, -0.9F); // Box 345
		bodyModel[157].setRotationPoint(-13F, -14F, -9F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, -0.1F, -1F, 0F, -0.1F, -1F, 0F, -0.1F, 0.2F, -0.75F, -0.1F, 0.2F, -0.75F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0.2F, -0.9F, -0.75F, 0.2F, -0.9F); // Box 346
		bodyModel[158].setRotationPoint(-11F, -14F, -9F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, -1F, -0.75F, -0.1F, -1F, -0.75F, 0.2F, -0.9F, 0F, 0.2F, -0.9F, 0F, 0F, -0.1F, -0.75F, 0F, -0.1F); // Box 347
		bodyModel[159].setRotationPoint(-11F, -14F, -10F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, -1F, -0.75F, -0.1F, -1F, -0.75F, 0.2F, -0.9F, 0F, 0.2F, -0.9F, 0F, 0F, -0.1F, -0.75F, 0F, -0.1F); // Box 348
		bodyModel[160].setRotationPoint(-13F, -14F, -10F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 26, 7, 1, 0F,-5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 349
		bodyModel[161].setRotationPoint(-44F, -23F, -1F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 26, 7, 1, 0F,-3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F); // Box 350
		bodyModel[162].setRotationPoint(-44F, -23F, 0F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, -0.4F, -1.6F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -1.6F, 0F, -0.4F, -1.6F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -1.6F); // Box 351
		bodyModel[163].setRotationPoint(-18F, -13.5F, -3F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 19, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 352
		bodyModel[164].setRotationPoint(-41F, -16F, -3F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 19, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 353
		bodyModel[165].setRotationPoint(-41F, -14F, -3F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F,0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F); // Box 354
		bodyModel[166].setRotationPoint(-45F, -14F, -3F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F,0F, -2F, -2.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, -2.5F, 0F, 0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -2F); // Box 355
		bodyModel[167].setRotationPoint(-45F, -16F, -3F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F); // Box 356
		bodyModel[168].setRotationPoint(-45.5F, -14F, -1F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.8F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.8F, -0.25F, -0.25F, -0.8F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.8F, -0.25F, -0.25F); // Box 357
		bodyModel[169].setRotationPoint(-46.5F, -14F, -1F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F,0F, 0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -2F, 0F, -2F, -2.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, -2.5F); // Box 358
		bodyModel[170].setRotationPoint(-45F, -12F, -3F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 19, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 359
		bodyModel[171].setRotationPoint(-41F, -12F, -3F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 8, 2, 6, 0F,0F, 0F, 0F, 0F, -0.75F, -2.75F, 0F, -0.75F, -2.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -2.75F, 0F, -0.75F, -2.75F, 0F, 0F, 0F); // Box 360
		bodyModel[172].setRotationPoint(-22F, -14F, -3F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 8, 2, 6, 0F,0F, 0F, -2F, 0F, -2.75F, -2.75F, 0F, -2.75F, -2.75F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0.75F, -2.75F, 0F, 0.75F, -2.75F, 0F, 0F, 0F); // Box 361
		bodyModel[173].setRotationPoint(-22F, -16F, -3F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 8, 2, 6, 0F,0F, 0F, 0F, 0F, 0.75F, -2.75F, 0F, 0.75F, -2.75F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2.75F, -2.75F, 0F, -2.75F, -2.75F, 0F, 0F, -2F); // Box 362
		bodyModel[174].setRotationPoint(-22F, -12F, -3F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F,0F, -1.6F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -1.6F, -0.4F, 0F, -1.6F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -1.6F, -0.4F); // Box 363
		bodyModel[175].setRotationPoint(-18F, -16F, -0.5F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 364
		bodyModel[176].setRotationPoint(-14F, -16F, -0.5F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 365
		bodyModel[177].setRotationPoint(-14F, -12F, -0.5F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 366
		bodyModel[178].setRotationPoint(-14F, -13.5F, -3F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 367
		bodyModel[179].setRotationPoint(-14F, -13.5F, 1F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, 0.2F, -0.9F, 0F, 0.2F, -0.9F, 0F, 0F, -0.1F, -0.75F, 0F, -0.1F, -0.75F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, -1F, -0.75F, -0.1F, -1F); // Box 368
		bodyModel[180].setRotationPoint(-11F, -14F, -1F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, 0.2F, -0.9F, 0F, 0.2F, -0.9F, 0F, 0F, -0.1F, -0.75F, 0F, -0.1F, -0.75F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, -1F, -0.75F, -0.1F, -1F); // Box 369
		bodyModel[181].setRotationPoint(-13F, -14F, -1F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0.2F, -0.9F, -0.75F, 0.2F, -0.9F, -0.75F, -0.1F, -1F, 0F, -0.1F, -1F, 0F, -0.1F, 0.2F, -0.75F, -0.1F, 0.2F); // Box 370
		bodyModel[182].setRotationPoint(-13F, -14F, 0F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0.2F, -0.9F, -0.75F, 0.2F, -0.9F, -0.75F, -0.1F, -1F, 0F, -0.1F, -1F, 0F, -0.1F, 0.2F, -0.75F, -0.1F, 0.2F); // Box 371
		bodyModel[183].setRotationPoint(-11F, -14F, 0F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, -0.1F, -1F, 0F, -0.1F, -1F, 0F, -0.1F, 0.2F, -0.75F, -0.1F, 0.2F, -0.75F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0.2F, -0.9F, -0.75F, 0.2F, -0.9F); // Box 372
		bodyModel[184].setRotationPoint(-13F, -13F, 0F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, -0.1F, -1F, 0F, -0.1F, -1F, 0F, -0.1F, 0.2F, -0.75F, -0.1F, 0.2F, -0.75F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0.2F, -0.9F, -0.75F, 0.2F, -0.9F); // Box 373
		bodyModel[185].setRotationPoint(-11F, -13F, 0F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, -1F, -0.75F, -0.1F, -1F, -0.75F, 0.2F, -0.9F, 0F, 0.2F, -0.9F, 0F, 0F, -0.1F, -0.75F, 0F, -0.1F); // Box 374
		bodyModel[186].setRotationPoint(-11F, -13F, -1F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, -1F, -0.75F, -0.1F, -1F, -0.75F, 0.2F, -0.9F, 0F, 0.2F, -0.9F, 0F, 0F, -0.1F, -0.75F, 0F, -0.1F); // Box 375
		bodyModel[187].setRotationPoint(-13F, -13F, -1F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 465
		bodyModel[188].setRotationPoint(-41.5F, -56F, -1F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, 0F); // Box 466
		bodyModel[189].setRotationPoint(-41.5F, -56.5F, -1F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 467
		bodyModel[190].setRotationPoint(-40F, -56.75F, -1F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 468
		bodyModel[191].setRotationPoint(-40F, -55.75F, -1F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.6F, -0.25F, 0F); // Box 469
		bodyModel[192].setRotationPoint(-40.1F, -55.25F, -1F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.7F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.5F, 0F, -0.7F, -0.5F, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 470
		bodyModel[193].setRotationPoint(-41.5F, -57.5F, -1F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.7F, -0.5F, -0.3F, -0.2F, -0.5F, -0.3F, -0.2F, -0.3F, 0F, -0.7F, -0.3F, 0F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 471
		bodyModel[194].setRotationPoint(-41.5F, -57.5F, 0F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.1F); // Box 472
		bodyModel[195].setRotationPoint(-39.7F, -56.5F, -1F);

		bodyModel[196].addShapeBox(0F, 1F, 0F, 10, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
		bodyModel[196].setRotationPoint(-33F, -42.5F, -5F);
		bodyModel[196].rotateAngleZ = -0.10471976F;

		bodyModel[197].addShapeBox(9F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		bodyModel[197].setRotationPoint(-33F, -42.5F, -5F);
		bodyModel[197].rotateAngleZ = -0.10471976F;

		bodyModel[198].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		bodyModel[198].setRotationPoint(-33F, -42.5F, -5F);
		bodyModel[198].rotateAngleZ = -0.10471976F;

		bodyModel[199].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		bodyModel[199].setRotationPoint(-33F, -42.5F, 4F);
		bodyModel[199].rotateAngleZ = -0.10471976F;

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		bodyModel[200].setRotationPoint(-33F, -42.5F, -5F);
		bodyModel[200].rotateAngleZ = -0.10471976F;

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 17, 10, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		bodyModel[201].setRotationPoint(-24F, -58.5F, -5F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[202].setRotationPoint(-22F, -62.5F, -3F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 17, 8, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 246
		bodyModel[203].setRotationPoint(-25F, -57.5F, -4F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[204].setRotationPoint(-25.3F, -57.8F, -2F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[205].setRotationPoint(-25.3F, -57.8F, 1F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 2, 18, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[206].setRotationPoint(-24F, -55.5F, -4F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 2, 18, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 251
		bodyModel[207].setRotationPoint(-24F, -55.5F, 3F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[208].setRotationPoint(-30F, -41.5F, -6F);
		bodyModel[208].rotateAngleZ = 0.78539816F;

		bodyModel[209].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 253
		bodyModel[209].setRotationPoint(-30F, -41.5F, 5F);
		bodyModel[209].rotateAngleZ = 0.78539816F;

		bodyModel[210].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 962
		bodyModel[210].setRotationPoint(-22.5F, -62F, -1.5F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 964
		bodyModel[211].setRotationPoint(-22.5F, -61F, -1.5F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 966
		bodyModel[212].setRotationPoint(-22.5F, -60F, -1.5F);

		bodyModel[213].addShapeBox(0F, -3F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 259
		bodyModel[213].setRotationPoint(-48F, -38.5F, -6F);
		bodyModel[213].rotateAngleZ = 0.15707963F;

		bodyModel[214].addShapeBox(0F, -3F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
		bodyModel[214].setRotationPoint(-48F, -38.5F, 4F);
		bodyModel[214].rotateAngleZ = 0.15707963F;

		bodyModel[215].addShapeBox(0F, 0F, 0F, 7, 9, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 256
		bodyModel[215].setRotationPoint(-49F, -46.5F, -2F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 8, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[216].setRotationPoint(-41F, -39.5F, -2F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 254
		bodyModel[217].setRotationPoint(-41F, -40.5F, -1.5F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 263
		bodyModel[218].setRotationPoint(-38.5F, -43.5F, -1F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 264
		bodyModel[219].setRotationPoint(-38F, -47.5F, -0.5F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 265
		bodyModel[220].setRotationPoint(-38F, -49.5F, -0.5F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 266
		bodyModel[221].setRotationPoint(-37.7F, -49.6F, -0.5F);

		bodyModel[222].addShapeBox(0F, -1F, -1F, 0, 75, 75, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -73F, 0F, 0F, -73F, 0F, -73F, 0F, 0F, -73F, 0F, 0F, -73F, -73F, 0F, -73F, -73F); // Box 814
		bodyModel[222].setRotationPoint(-40.5F, -57.5F, 0F);
		bodyModel[222].rotateAngleX = -0.01745329F;
		bodyModel[222].rotateAngleY = 0.01745329F;
		bodyModel[222].rotateAngleZ = -0.29670597F;

		bodyModel[223].addShapeBox(0F, 0F, 0F, 8, 10, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 429
		bodyModel[223].setRotationPoint(-48F, -53F, -9F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 8, 2, 18, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 430
		bodyModel[224].setRotationPoint(-48F, -55F, -9F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 12, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 484
		bodyModel[225].setRotationPoint(3F, -51F, -8F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 3, 5, 2, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 1F); // Box 485
		bodyModel[226].setRotationPoint(0F, -51F, -8F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 3, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, 1F, 0F, 0F, 0F); // Box 487
		bodyModel[227].setRotationPoint(15F, -51F, -8F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 2, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 488
		bodyModel[228].setRotationPoint(16F, -51F, -5F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 2, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 489
		bodyModel[229].setRotationPoint(0F, -51F, -5F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 12, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 490
		bodyModel[230].setRotationPoint(3F, -51F, 6F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 3, 5, 2, 0F,-2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 491
		bodyModel[231].setRotationPoint(0F, -51F, 6F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 3, 5, 2, 0F,0F, 0F, 0F, -2F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 492
		bodyModel[232].setRotationPoint(15F, -51F, 6F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 22, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 493
		bodyModel[233].setRotationPoint(18F, -50F, -4F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 494
		bodyModel[234].setRotationPoint(20F, -52F, -4F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 495
		bodyModel[235].setRotationPoint(20F, -53F, -4F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 496
		bodyModel[236].setRotationPoint(3F, -46F, -8F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 497
		bodyModel[237].setRotationPoint(3F, -46F, 7F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 498
		bodyModel[238].setRotationPoint(14F, -46F, 7F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 499
		bodyModel[239].setRotationPoint(14F, -46F, -8F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 578
		bodyModel[240].setRotationPoint(4F, -51F, 3F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 579
		bodyModel[241].setRotationPoint(4F, -51F, -4F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 1, 15, 10, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 580
		bodyModel[242].setRotationPoint(5F, -54F, -5F);

		bodyModel[243].addShapeBox(0F, 1F, 0F, 10, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 582
		bodyModel[243].setRotationPoint(5F, -40F, -5F);
		bodyModel[243].rotateAngleZ = 0.08726646F;

		bodyModel[244].addShapeBox(-2F, 0.25F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 583
		bodyModel[244].setRotationPoint(7F, -40F, -5F);
		bodyModel[244].rotateAngleZ = 0.08726646F;

		bodyModel[245].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 584
		bodyModel[245].setRotationPoint(5F, -46F, -6F);
		bodyModel[245].rotateAngleZ = -0.78539816F;

		bodyModel[246].addShapeBox(0F, -0.3F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 585
		bodyModel[246].setRotationPoint(14F, -40F, -5F);
		bodyModel[246].rotateAngleZ = 0.12217305F;

		bodyModel[247].addShapeBox(-2F, 0.25F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 586
		bodyModel[247].setRotationPoint(7F, -40F, 4F);
		bodyModel[247].rotateAngleZ = 0.08726646F;

		bodyModel[248].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 587
		bodyModel[248].setRotationPoint(5F, -46F, 5F);
		bodyModel[248].rotateAngleZ = -0.78539816F;

		bodyModel[249].addShapeBox(0F, 0F, 0F, 1, 15, 8, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 588
		bodyModel[249].setRotationPoint(6F, -53F, -4F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 589
		bodyModel[250].setRotationPoint(6.3F, -53.3F, 1F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 590
		bodyModel[251].setRotationPoint(6.3F, -53.3F, -2F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 591
		bodyModel[252].setRotationPoint(3.5F, -55.5F, -1.5F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 592
		bodyModel[253].setRotationPoint(3.5F, -56.5F, -1.5F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 593
		bodyModel[254].setRotationPoint(3.5F, -57.5F, -1.5F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 594
		bodyModel[255].setRotationPoint(3F, -58F, -3F);
	}

	private void initnoseModel_1()
	{
		noseModel[0] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 17
		noseModel[1] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 18
		noseModel[2] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Box 19
		noseModel[3] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 20
		noseModel[4] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 21
		noseModel[5] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 22
		noseModel[6] = new ModelRendererTurbo(this, 721, 25, textureX, textureY); // Box 23
		noseModel[7] = new ModelRendererTurbo(this, 849, 25, textureX, textureY); // Box 24
		noseModel[8] = new ModelRendererTurbo(this, 905, 25, textureX, textureY); // Box 25
		noseModel[9] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 26
		noseModel[10] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 38
		noseModel[11] = new ModelRendererTurbo(this, 641, 1, textureX, textureY); // Box 39
		noseModel[12] = new ModelRendererTurbo(this, 985, 9, textureX, textureY); // Box 40
		noseModel[13] = new ModelRendererTurbo(this, 713, 65, textureX, textureY); // Box 60
		noseModel[14] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 61
		noseModel[15] = new ModelRendererTurbo(this, 713, 81, textureX, textureY); // Box 62
		noseModel[16] = new ModelRendererTurbo(this, 89, 89, textureX, textureY); // Box 63
		noseModel[17] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 64
		noseModel[18] = new ModelRendererTurbo(this, 545, 1, textureX, textureY); // Box 65
		noseModel[19] = new ModelRendererTurbo(this, 785, 1, textureX, textureY); // Box 66
		noseModel[20] = new ModelRendererTurbo(this, 849, 1, textureX, textureY); // Box 67
		noseModel[21] = new ModelRendererTurbo(this, 713, 9, textureX, textureY); // Import CO_51
		noseModel[22] = new ModelRendererTurbo(this, 905, 41, textureX, textureY); // Import CO_52
		noseModel[23] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import CO_53
		noseModel[24] = new ModelRendererTurbo(this, 537, 57, textureX, textureY); // Import CO_54
		noseModel[25] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Import CO_55
		noseModel[26] = new ModelRendererTurbo(this, 1001, 1, textureX, textureY); // Import CO_56
		noseModel[27] = new ModelRendererTurbo(this, 969, 9, textureX, textureY); // Import CO_57
		noseModel[28] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Import CO_58
		noseModel[29] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Import CO_59
		noseModel[30] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Import CO_60
		noseModel[31] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Import CO_61
		noseModel[32] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Import CO_62
		noseModel[33] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Import CO_63
		noseModel[34] = new ModelRendererTurbo(this, 241, 89, textureX, textureY); // Box 81
		noseModel[35] = new ModelRendererTurbo(this, 913, 1, textureX, textureY); // Box 82
		noseModel[36] = new ModelRendererTurbo(this, 129, 169, textureX, textureY); // Box 152
		noseModel[37] = new ModelRendererTurbo(this, 209, 169, textureX, textureY); // Box 153
		noseModel[38] = new ModelRendererTurbo(this, 857, 177, textureX, textureY); // Box 154
		noseModel[39] = new ModelRendererTurbo(this, 937, 177, textureX, textureY); // Box 155
		noseModel[40] = new ModelRendererTurbo(this, 561, 185, textureX, textureY); // Box 156
		noseModel[41] = new ModelRendererTurbo(this, 241, 137, textureX, textureY); // Box 157
		noseModel[42] = new ModelRendererTurbo(this, 617, 185, textureX, textureY); // Box 158
		noseModel[43] = new ModelRendererTurbo(this, 793, 185, textureX, textureY); // Box 159
		noseModel[44] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 160
		noseModel[45] = new ModelRendererTurbo(this, 153, 121, textureX, textureY); // Box 161
		noseModel[46] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 173
		noseModel[47] = new ModelRendererTurbo(this, 633, 57, textureX, textureY); // Box 174
		noseModel[48] = new ModelRendererTurbo(this, 665, 113, textureX, textureY); // Box 175
		noseModel[49] = new ModelRendererTurbo(this, 985, 137, textureX, textureY); // Box 195
		noseModel[50] = new ModelRendererTurbo(this, 441, 161, textureX, textureY); // Box 196
		noseModel[51] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Box 197
		noseModel[52] = new ModelRendererTurbo(this, 273, 169, textureX, textureY); // Box 198
		noseModel[53] = new ModelRendererTurbo(this, 889, 65, textureX, textureY); // Box 199
		noseModel[54] = new ModelRendererTurbo(this, 281, 41, textureX, textureY); // Box 200
		noseModel[55] = new ModelRendererTurbo(this, 937, 41, textureX, textureY); // Box 201
		noseModel[56] = new ModelRendererTurbo(this, 753, 49, textureX, textureY); // Box 202
		noseModel[57] = new ModelRendererTurbo(this, 585, 41, textureX, textureY); // Box 203
		noseModel[58] = new ModelRendererTurbo(this, 169, 73, textureX, textureY); // Box 204
		noseModel[59] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 205
		noseModel[60] = new ModelRendererTurbo(this, 361, 73, textureX, textureY); // Box 206
		noseModel[61] = new ModelRendererTurbo(this, 897, 25, textureX, textureY); // Box 207
		noseModel[62] = new ModelRendererTurbo(this, 473, 49, textureX, textureY); // Box 208
		noseModel[63] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Box 209
		noseModel[64] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 210
		noseModel[65] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 211
		noseModel[66] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Box 212
		noseModel[67] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Box 213
		noseModel[68] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 214
		noseModel[69] = new ModelRendererTurbo(this, 905, 25, textureX, textureY); // Box 215
		noseModel[70] = new ModelRendererTurbo(this, 537, 137, textureX, textureY); // Box 216
		noseModel[71] = new ModelRendererTurbo(this, 633, 73, textureX, textureY); // Box 217

		noseModel[0].addShapeBox(0F, 0F, 0F, 24, 7, 14, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		noseModel[0].setRotationPoint(-89F, -38F, -14F);

		noseModel[1].addShapeBox(0F, 0F, 0F, 24, 5, 14, 0F,0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		noseModel[1].setRotationPoint(-89F, -43F, -14F);

		noseModel[2].addShapeBox(0F, 0F, 0F, 24, 9, 13, 0F,0F, -4F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		noseModel[2].setRotationPoint(-89F, -52F, -13F);

		noseModel[3].addShapeBox(0F, 0F, 0F, 24, 5, 14, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		noseModel[3].setRotationPoint(-89F, -31F, -14F);

		noseModel[4].addShapeBox(0F, 0F, 0F, 15, 7, 12, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 21
		noseModel[4].setRotationPoint(-104F, -38F, -12F);

		noseModel[5].addShapeBox(0F, 0F, 0F, 15, 4, 12, 0F,0F, 1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, -7F, 0F, 1F, -6F, 0F, 1F, 0F, 0F, -2F, 0F); // Box 22
		noseModel[5].setRotationPoint(-104F, -31F, -12F);

		noseModel[6].addShapeBox(0F, 0F, 0F, 15, 5, 12, 0F,0F, -1F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		noseModel[6].setRotationPoint(-104F, -43F, -12F);

		noseModel[7].addShapeBox(0F, 0F, 0F, 15, 5, 11, 0F,0F, -3F, -6F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 24
		noseModel[7].setRotationPoint(-104F, -48F, -11F);

		noseModel[8].addShapeBox(0F, 0F, 0F, 24, 3, 10, 0F,0F, -4F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); // Box 25
		noseModel[8].setRotationPoint(-89F, -55F, -10F);

		noseModel[9].addShapeBox(0F, 0F, 0F, 15, 3, 9, 0F,0F, -5F, -6F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 3F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 26
		noseModel[9].setRotationPoint(-104F, -51F, -9F);

		noseModel[10].addShapeBox(0F, 0F, 0F, 10, 5, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 1F); // Box 38
		noseModel[10].setRotationPoint(-75F, -31F, -14F);

		noseModel[11].addShapeBox(0F, 0F, 0F, 7, 7, 5, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 39
		noseModel[11].setRotationPoint(-72F, -26F, -13F);

		noseModel[12].addShapeBox(0F, 0F, 0F, 7, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		noseModel[12].setRotationPoint(-72F, -20F, -9F);

		noseModel[13].addShapeBox(0F, 0F, 0F, 10, 4, 9, 0F,0F, -2F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		noseModel[13].setRotationPoint(-114F, -42F, -9F);

		noseModel[14].addShapeBox(0F, 0F, 0F, 10, 3, 8, 0F,0F, -3F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 61
		noseModel[14].setRotationPoint(-114F, -45F, -8F);

		noseModel[15].addShapeBox(0F, 0F, 0F, 10, 6, 9, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 62
		noseModel[15].setRotationPoint(-114F, -38F, -9F);

		noseModel[16].addShapeBox(0F, 0F, 0F, 10, 3, 9, 0F,0F, 3F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -4F, -6F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 63
		noseModel[16].setRotationPoint(-114F, -32F, -9F);

		noseModel[17].addShapeBox(0F, 0F, 0F, 10, 1, 5, 0F,0F, -3.9999F, -1.9999F, 0F, 0F, -1.9999F, 0F, 0F, 0F, 0F, -3.9999F, 0F, 0F, 2.9999F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.9999F, 0F); // Box 64
		noseModel[17].setRotationPoint(-114F, -46F, -5F);

		noseModel[18].addShapeBox(0F, 0F, 0F, 4, 5, 5, 0F,0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 65
		noseModel[18].setRotationPoint(-118F, -40F, -5F);

		noseModel[19].addShapeBox(0F, 0F, 0F, 4, 2, 5, 0F,0F, -3F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 66
		noseModel[19].setRotationPoint(-118F, -42F, -5F);

		noseModel[20].addShapeBox(0F, 0F, 0F, 4, 2, 5, 0F,0F, 2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -3F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 67
		noseModel[20].setRotationPoint(-118F, -35F, -5F);

		noseModel[21].addShapeBox(0F, 0F, 0F, 9, 1, 3, 0F,-1F, -0.3F, -1.2F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 1.2F, -1F, 0F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.2F); // Import CO_51
		noseModel[21].setRotationPoint(-90F, -35.5F, -15F);

		noseModel[22].addShapeBox(0F, 0F, 0F, 13, 1, 3, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import CO_52
		noseModel[22].setRotationPoint(-81F, -35.5F, -15F);

		noseModel[23].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Import CO_53
		noseModel[23].setRotationPoint(-72.5F, -34.5F, -16F);

		noseModel[24].addShapeBox(0F, 0F, 0F, 13, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import CO_54
		noseModel[24].setRotationPoint(-81F, -34.5F, -14.5F);

		noseModel[25].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-1F, 0F, -1.2F, 0F, 0F, -1.03333333F, 0F, 0F, 0.93333333F, 0F, 0F, 1.2F, -1F, 0F, -1.2F, 0F, 0F, -1.03333333F, 0F, 0F, 0.93333333F, 0F, 0F, 1.2F); // Import CO_55
		noseModel[25].setRotationPoint(-90F, -34.5F, -15F);

		noseModel[26].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F,-1F, 0F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.2F, -1F, 0F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.2F); // Import CO_56
		noseModel[26].setRotationPoint(-90F, -34.5F, -14.5F);

		noseModel[27].addShapeBox(0F, 0F, 0F, 9, 1, 3, 0F,-1F, 0F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.2F, -1F, -0.3F, -1.2F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 1.2F); // Import CO_57
		noseModel[27].setRotationPoint(-90F, -33.5F, -15F);

		noseModel[28].addShapeBox(0F, 0F, 0F, 13, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import CO_58
		noseModel[28].setRotationPoint(-81F, -33.5F, -15F);

		noseModel[29].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Import CO_59
		noseModel[29].setRotationPoint(-76F, -34.5F, -16F);

		noseModel[30].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Import CO_60
		noseModel[30].setRotationPoint(-79.5F, -34.5F, -16F);

		noseModel[31].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Import CO_61
		noseModel[31].setRotationPoint(-83F, -34.5F, -16F);

		noseModel[32].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Import CO_62
		noseModel[32].setRotationPoint(-86.5F, -34.5F, -15.8F);

		noseModel[33].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Import CO_63
		noseModel[33].setRotationPoint(-89F, -34.5F, -15.2F);

		noseModel[34].addShapeBox(0F, 0F, 0F, 24, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		noseModel[34].setRotationPoint(-90F, -43.5F, -14F);

		noseModel[35].addShapeBox(0F, 0F, 0F, 3, 5, 4, 0F,0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 82
		noseModel[35].setRotationPoint(-66F, -43.5F, -14F);

		noseModel[36].addShapeBox(0F, 0F, 0F, 24, 7, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 152
		noseModel[36].setRotationPoint(-89F, -38F, 0F);

		noseModel[37].addShapeBox(0F, 0F, 0F, 24, 5, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 153
		noseModel[37].setRotationPoint(-89F, -43F, 0F);

		noseModel[38].addShapeBox(0F, 0F, 0F, 24, 9, 13, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -4F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 154
		noseModel[38].setRotationPoint(-89F, -52F, 0F);

		noseModel[39].addShapeBox(0F, 0F, 0F, 24, 5, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -8F); // Box 155
		noseModel[39].setRotationPoint(-89F, -31F, 0F);

		noseModel[40].addShapeBox(0F, 0F, 0F, 15, 7, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F); // Box 156
		noseModel[40].setRotationPoint(-104F, -38F, 0F);

		noseModel[41].addShapeBox(0F, 0F, 0F, 15, 4, 12, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -3F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, -6F, 0F, -2F, -7F); // Box 157
		noseModel[41].setRotationPoint(-104F, -31F, 0F);

		noseModel[42].addShapeBox(0F, 0F, 0F, 15, 5, 12, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 158
		noseModel[42].setRotationPoint(-104F, -43F, 0F);

		noseModel[43].addShapeBox(0F, 0F, 0F, 15, 5, 11, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, -6F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -3F); // Box 159
		noseModel[43].setRotationPoint(-104F, -48F, 0F);

		noseModel[44].addShapeBox(0F, 0F, 0F, 24, 3, 10, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -4F, -4F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -1F); // Box 160
		noseModel[44].setRotationPoint(-89F, -55F, 0F);

		noseModel[45].addShapeBox(0F, 0F, 0F, 15, 3, 9, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -5F, -6F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -4F); // Box 161
		noseModel[45].setRotationPoint(-104F, -51F, 0F);

		noseModel[46].addShapeBox(0F, 0F, 0F, 10, 5, 1, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F); // Box 173
		noseModel[46].setRotationPoint(-75F, -31F, 13F);

		noseModel[47].addShapeBox(0F, 0F, 0F, 7, 7, 5, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 174
		noseModel[47].setRotationPoint(-72F, -26F, 8F);

		noseModel[48].addShapeBox(0F, 0F, 0F, 7, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
		noseModel[48].setRotationPoint(-72F, -20F, 0F);

		noseModel[49].addShapeBox(0F, 0F, 0F, 10, 4, 9, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 195
		noseModel[49].setRotationPoint(-114F, -42F, 0F);

		noseModel[50].addShapeBox(0F, 0F, 0F, 10, 3, 8, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, -5F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -3F); // Box 196
		noseModel[50].setRotationPoint(-114F, -45F, 0F);

		noseModel[51].addShapeBox(0F, 0F, 0F, 10, 6, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -4F); // Box 197
		noseModel[51].setRotationPoint(-114F, -38F, 0F);

		noseModel[52].addShapeBox(0F, 0F, 0F, 10, 3, 9, 0F,0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -4F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -4F, -6F); // Box 198
		noseModel[52].setRotationPoint(-114F, -32F, 0F);

		noseModel[53].addShapeBox(0F, 0F, 0F, 10, 1, 5, 0F,0F, -3.9999F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9999F, 0F, -3.9999F, -1.9999F, 0F, 2.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.9999F, -1.9999F); // Box 199
		noseModel[53].setRotationPoint(-114F, -46F, 0F);

		noseModel[54].addShapeBox(0F, 0F, 0F, 4, 5, 5, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -3F); // Box 200
		noseModel[54].setRotationPoint(-118F, -40F, 0F);

		noseModel[55].addShapeBox(0F, 0F, 0F, 4, 2, 5, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, -4F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -3F); // Box 201
		noseModel[55].setRotationPoint(-118F, -42F, 0F);

		noseModel[56].addShapeBox(0F, 0F, 0F, 4, 2, 5, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, -4F); // Box 202
		noseModel[56].setRotationPoint(-118F, -35F, 0F);

		noseModel[57].addShapeBox(0F, 0F, 0F, 9, 1, 3, 0F,0F, 0F, 1.2F, 0F, 0F, 0F, 0F, -0.3F, 0F, -1F, -0.3F, -1.2F, 0F, 0F, 1.2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.2F); // Box 203
		noseModel[57].setRotationPoint(-90F, -35.5F, 12F);

		noseModel[58].addShapeBox(0F, 0F, 0F, 13, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		noseModel[58].setRotationPoint(-81F, -35.5F, 12F);

		noseModel[59].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 205
		noseModel[59].setRotationPoint(-72.5F, -34.5F, 15F);

		noseModel[60].addShapeBox(0F, 0F, 0F, 13, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		noseModel[60].setRotationPoint(-81F, -34.5F, 12.5F);

		noseModel[61].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 1.2F, 0F, 0F, 0.93333333F, 0F, 0F, -1.03333333F, -1F, 0F, -1.2F, 0F, 0F, 1.2F, 0F, 0F, 0.93333333F, 0F, 0F, -1.03333333F, -1F, 0F, -1.2F); // Box 207
		noseModel[61].setRotationPoint(-90F, -34.5F, 12F);

		noseModel[62].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F,0F, 0F, 1.2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.2F, 0F, 0F, 1.2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.2F); // Box 208
		noseModel[62].setRotationPoint(-90F, -34.5F, 12.5F);

		noseModel[63].addShapeBox(0F, 0F, 0F, 9, 1, 3, 0F,0F, 0F, 1.2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.2F, 0F, 0F, 1.2F, 0F, 0F, 0F, 0F, -0.3F, 0F, -1F, -0.3F, -1.2F); // Box 209
		noseModel[63].setRotationPoint(-90F, -33.5F, 12F);

		noseModel[64].addShapeBox(0F, 0F, 0F, 13, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 210
		noseModel[64].setRotationPoint(-81F, -33.5F, 12F);

		noseModel[65].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 211
		noseModel[65].setRotationPoint(-76F, -34.5F, 15F);

		noseModel[66].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 212
		noseModel[66].setRotationPoint(-79.5F, -34.5F, 15F);

		noseModel[67].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 213
		noseModel[67].setRotationPoint(-83F, -34.5F, 15F);

		noseModel[68].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 214
		noseModel[68].setRotationPoint(-86.5F, -34.5F, 14.8F);

		noseModel[69].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 215
		noseModel[69].setRotationPoint(-89F, -34.5F, 14.2F);

		noseModel[70].addShapeBox(0F, 0F, 0F, 24, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 216
		noseModel[70].setRotationPoint(-90F, -43.5F, 10F);

		noseModel[71].addShapeBox(0F, 0F, 0F, 3, 5, 4, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 0F); // Box 217
		noseModel[71].setRotationPoint(-66F, -43.5F, 10F);
	}

	private void inittailModel_1()
	{
		tailModel[0] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 32
		tailModel[1] = new ModelRendererTurbo(this, 289, 41, textureX, textureY); // Box 33
		tailModel[2] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 34
		tailModel[3] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Box 35
		tailModel[4] = new ModelRendererTurbo(this, 665, 49, textureX, textureY); // Box 36
		tailModel[5] = new ModelRendererTurbo(this, 833, 49, textureX, textureY); // Box 37
		tailModel[6] = new ModelRendererTurbo(this, 809, 65, textureX, textureY); // Box 53
		tailModel[7] = new ModelRendererTurbo(this, 241, 73, textureX, textureY); // Box 54
		tailModel[8] = new ModelRendererTurbo(this, 977, 49, textureX, textureY); // Box 56
		tailModel[9] = new ModelRendererTurbo(this, 977, 65, textureX, textureY); // Box 57
		tailModel[10] = new ModelRendererTurbo(this, 713, 1, textureX, textureY); // Box 58
		tailModel[11] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 59
		tailModel[12] = new ModelRendererTurbo(this, 425, 193, textureX, textureY); // Box 167
		tailModel[13] = new ModelRendererTurbo(this, 665, 193, textureX, textureY); // Box 168
		tailModel[14] = new ModelRendererTurbo(this, 841, 201, textureX, textureY); // Box 169
		tailModel[15] = new ModelRendererTurbo(this, 521, 209, textureX, textureY); // Box 170
		tailModel[16] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); // Box 171
		tailModel[17] = new ModelRendererTurbo(this, 89, 217, textureX, textureY); // Box 172
		tailModel[18] = new ModelRendererTurbo(this, 825, 225, textureX, textureY); // Box 188
		tailModel[19] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Box 189
		tailModel[20] = new ModelRendererTurbo(this, 537, 65, textureX, textureY); // Box 191
		tailModel[21] = new ModelRendererTurbo(this, 457, 217, textureX, textureY); // Box 192
		tailModel[22] = new ModelRendererTurbo(this, 457, 65, textureX, textureY); // Box 193
		tailModel[23] = new ModelRendererTurbo(this, 1001, 49, textureX, textureY); // Box 194
		tailModel[24] = new ModelRendererTurbo(this, 545, 289, textureX, textureY); // Box 215
		tailModel[25] = new ModelRendererTurbo(this, 745, 313, textureX, textureY); // Box 267

		tailModel[0].addShapeBox(0F, 0F, 0F, 39, 10, 12, 0F,0F, 0F, -6F, 0F, -5F, -7F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -5F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 32
		tailModel[0].setRotationPoint(39F, -53F, -12F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 39, 13, 12, 0F,0F, 0F, 0F, 0F, -2F, -5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -5F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 33
		tailModel[1].setRotationPoint(39F, -43F, -12F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 39, 6, 12, 0F,0F, 0F, 0F, 0F, 3F, -5F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -4F, -7F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 34
		tailModel[2].setRotationPoint(39F, -30F, -12F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 35, 8, 7, 0F,0F, 0F, 0F, 0F, -1F, -4F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 35
		tailModel[3].setRotationPoint(78F, -41F, -7F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 35, 7, 7, 0F,0F, 0F, -2F, 0F, -4F, -4F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -4F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 36
		tailModel[4].setRotationPoint(78F, -48F, -7F);

		tailModel[5].addShapeBox(0F, 0F, 0F, 35, 5, 7, 0F,0F, 0F, 0F, 0F, 2F, -4F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, -5F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 37
		tailModel[5].setRotationPoint(78F, -33F, -7F);

		tailModel[6].addShapeBox(0F, 0F, 0F, 35, 38, 3, 0F,-26F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, -26F, 0F, 0F, 0F, -4F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 53
		tailModel[6].setRotationPoint(78F, -82F, -3F);

		tailModel[7].addShapeBox(0F, 0F, 0F, 31, 3, 57, 0F,-17F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -17F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 54
		tailModel[7].setRotationPoint(78F, -48F, -57F);

		tailModel[8].addShapeBox(0F, 0F, 0F, 7, 3, 8, 0F,0F, -1F, 0F, -3F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 56
		tailModel[8].setRotationPoint(109F, -48F, -65F);

		tailModel[9].addShapeBox(0F, 0F, 0F, 14, 3, 8, 0F,-4F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -4F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 57
		tailModel[9].setRotationPoint(95F, -48F, -65F);

		tailModel[10].addShapeBox(0F, 0F, 0F, 10, 5, 2, 0F,0F, 0F, -1F, -6F, -1F, -1F, -6F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		tailModel[10].setRotationPoint(113F, -87F, -2F);

		tailModel[11].addShapeBox(0F, 0F, 0F, 9, 5, 2, 0F,-4F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -4F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		tailModel[11].setRotationPoint(104F, -87F, -2F);

		tailModel[12].addShapeBox(0F, 0F, 0F, 39, 10, 12, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, -7F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -5F, 0F, 0F, 0F); // Box 167
		tailModel[12].setRotationPoint(39F, -53F, 0F);

		tailModel[13].addShapeBox(0F, 0F, 0F, 39, 13, 12, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -5F, 0F, 0F, 0F); // Box 168
		tailModel[13].setRotationPoint(39F, -43F, 0F);

		tailModel[14].addShapeBox(0F, 0F, 0F, 39, 6, 12, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, -7F, 0F, 0F, -4F); // Box 169
		tailModel[14].setRotationPoint(39F, -30F, 0F);

		tailModel[15].addShapeBox(0F, 0F, 0F, 35, 8, 7, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -4F, 0F, 0F, 0F); // Box 170
		tailModel[15].setRotationPoint(78F, -41F, 0F);

		tailModel[16].addShapeBox(0F, 0F, 0F, 35, 7, 7, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -4F, 0F, 0F, 0F); // Box 171
		tailModel[16].setRotationPoint(78F, -48F, 0F);

		tailModel[17].addShapeBox(0F, 0F, 0F, 35, 5, 7, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -5F, 0F, 0F, -2F); // Box 172
		tailModel[17].setRotationPoint(78F, -33F, 0F);

		tailModel[18].addShapeBox(0F, 0F, 0F, 35, 38, 3, 0F,-26F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -26F, 0F, -2F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -2F); // Box 188
		tailModel[18].setRotationPoint(78F, -82F, 0F);

		tailModel[19].addShapeBox(0F, 0F, 0F, 31, 3, 57, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -17F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -17F, -1F, 0F); // Box 189
		tailModel[19].setRotationPoint(78F, -48F, 0F);

		tailModel[20].addShapeBox(0F, 0F, 0F, 7, 3, 8, 0F,0F, 0F, 0F, 0F, -1F, 0F, -3F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, -1F, -1F, 0F, -1F, 0F); // Box 191
		tailModel[20].setRotationPoint(109F, -48F, 57F);

		tailModel[21].addShapeBox(0F, 0F, 0F, 14, 3, 8, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -4F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -4F, -1F, -2F); // Box 192
		tailModel[21].setRotationPoint(95F, -48F, 57F);

		tailModel[22].addShapeBox(0F, 0F, 0F, 10, 5, 2, 0F,0F, 0F, 0F, -6F, -1F, 0F, -6F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 193
		tailModel[22].setRotationPoint(113F, -87F, 0F);

		tailModel[23].addShapeBox(0F, 0F, 0F, 9, 5, 2, 0F,-4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -4F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 194
		tailModel[23].setRotationPoint(104F, -87F, 0F);

		tailModel[24].addShapeBox(0F, 0F, 0F, 100, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 215
		tailModel[24].setRotationPoint(0F, -75F, -0.5F);
		tailModel[24].rotateAngleZ = -0.01745329F;

		tailModel[25].addShapeBox(0F, 0F, 0F, 77, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 267
		tailModel[25].setRotationPoint(39F, -53F, -0.5F);
		tailModel[25].rotateAngleZ = 0.33161256F;
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 889, 49, textureX, textureY); // Box 41
		leftWingModel[1] = new ModelRendererTurbo(this, 393, 57, textureX, textureY); // Box 42
		leftWingModel[2] = new ModelRendererTurbo(this, 537, 57, textureX, textureY); // Box 43
		leftWingModel[3] = new ModelRendererTurbo(this, 665, 57, textureX, textureY); // Box 44
		leftWingModel[4] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 45
		leftWingModel[5] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 46
		leftWingModel[6] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 47
		leftWingModel[7] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Box 48
		leftWingModel[8] = new ModelRendererTurbo(this, 385, 65, textureX, textureY); // Box 49
		leftWingModel[9] = new ModelRendererTurbo(this, 361, 89, textureX, textureY); // Import LWW01
		leftWingModel[10] = new ModelRendererTurbo(this, 873, 97, textureX, textureY); // Import LWW02
		leftWingModel[11] = new ModelRendererTurbo(this, 537, 105, textureX, textureY); // Import LWW03
		leftWingModel[12] = new ModelRendererTurbo(this, 881, 145, textureX, textureY); // Import LWW04
		leftWingModel[13] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Import LWW05
		leftWingModel[14] = new ModelRendererTurbo(this, 705, 33, textureX, textureY); // Import LWW06
		leftWingModel[15] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Import LWW07
		leftWingModel[16] = new ModelRendererTurbo(this, 809, 113, textureX, textureY); // Import LWW08
		leftWingModel[17] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Import LWW09
		leftWingModel[18] = new ModelRendererTurbo(this, 313, 161, textureX, textureY); // Import LWW10
		leftWingModel[19] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Import LWW11
		leftWingModel[20] = new ModelRendererTurbo(this, 673, 129, textureX, textureY); // Import LWW12
		leftWingModel[21] = new ModelRendererTurbo(this, 953, 97, textureX, textureY); // Import LWW13
		leftWingModel[22] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Import LWW19
		leftWingModel[23] = new ModelRendererTurbo(this, 545, 225, textureX, textureY); // Box 0
		leftWingModel[24] = new ModelRendererTurbo(this, 121, 233, textureX, textureY); // Box 1
		leftWingModel[25] = new ModelRendererTurbo(this, 33, 89, textureX, textureY); // Box 232
		leftWingModel[26] = new ModelRendererTurbo(this, 1, 249, textureX, textureY); // Box 219
		leftWingModel[27] = new ModelRendererTurbo(this, 1, 265, textureX, textureY); // Box 220
		leftWingModel[28] = new ModelRendererTurbo(this, 457, 129, textureX, textureY); // Box 221
		leftWingModel[29] = new ModelRendererTurbo(this, 169, 137, textureX, textureY); // Box 222
		leftWingModel[30] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Box 223
		leftWingModel[31] = new ModelRendererTurbo(this, 913, 49, textureX, textureY); // Box 224
		leftWingModel[32] = new ModelRendererTurbo(this, 385, 137, textureX, textureY); // Box 225
		leftWingModel[33] = new ModelRendererTurbo(this, 321, 273, textureX, textureY); // Box 226
		leftWingModel[34] = new ModelRendererTurbo(this, 985, 153, textureX, textureY); // Box 229
		leftWingModel[35] = new ModelRendererTurbo(this, 553, 161, textureX, textureY); // Box 230
		leftWingModel[36] = new ModelRendererTurbo(this, 721, 161, textureX, textureY); // Box 231
		leftWingModel[37] = new ModelRendererTurbo(this, 1009, 81, textureX, textureY); // Box 233
		leftWingModel[38] = new ModelRendererTurbo(this, 241, 73, textureX, textureY); // Box 234
		leftWingModel[39] = new ModelRendererTurbo(this, 49, 89, textureX, textureY); // Box 235
		leftWingModel[40] = new ModelRendererTurbo(this, 457, 89, textureX, textureY); // Box 236
		leftWingModel[41] = new ModelRendererTurbo(this, 1009, 89, textureX, textureY); // Box 237
		leftWingModel[42] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 238
		leftWingModel[43] = new ModelRendererTurbo(this, 697, 33, textureX, textureY); // Box 239
		leftWingModel[44] = new ModelRendererTurbo(this, 897, 33, textureX, textureY); // Box 240
		leftWingModel[45] = new ModelRendererTurbo(this, 977, 49, textureX, textureY); // Box 241
		leftWingModel[46] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 242
		leftWingModel[47] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // Box 243
		leftWingModel[48] = new ModelRendererTurbo(this, 657, 57, textureX, textureY); // Box 244
		leftWingModel[49] = new ModelRendererTurbo(this, 1017, 57, textureX, textureY); // Box 245

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 26, 11, 31, 0F,0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 3F, 0F, 0F, 0F, 0F, 0F); // Box 41
		leftWingModel[0].setRotationPoint(-48F, -37F, -45F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 26, 11, 90, 0F,-3F, 0F, 0F, -7F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -3F, -6F, 0F, -7F, -6F, 0F, 0F, 3F, 0F, 0F, 3F, 0F); // Box 42
		leftWingModel[1].setRotationPoint(-48F, -42F, -135F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 29, 11, 31, 0F,0F, 0F, 0F, 0F, -6F, 0F, 4F, -8F, 1F, -3F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 4F, -2F, 1F, -3F, 0F, 0F); // Box 43
		leftWingModel[2].setRotationPoint(-22F, -37F, -45F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 26, 11, 90, 0F,0F, 0F, 0F, -8F, -3F, 0F, 10F, -11F, 0F, -7F, -5F, 0F, 0F, -6F, 0F, -8F, -7F, 0F, 10F, 1F, 0F, -7F, 3F, 0F); // Box 44
		leftWingModel[3].setRotationPoint(-29F, -42F, -135F);

		leftWingModel[4].addShapeBox(0F, 0F, 0F, 6, 11, 31, 0F,-2F, -4F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, -6F, 0F, -2F, -5F, 0F, 3F, -2F, 0F, 3F, 0F, 0F, 0F, -2F, 0F); // Box 45
		leftWingModel[4].setRotationPoint(-57F, -37F, -45F);

		leftWingModel[5].addShapeBox(0F, 0F, 0F, 17, 11, 90, 0F,-5F, -2F, 0F, -7F, 0F, 0F, -10F, -5F, 0F, 0F, -9F, 0F, -5F, -8F, 0F, -7F, -6F, 0F, -10F, 3F, 0F, 0F, 0F, 0F); // Box 46
		leftWingModel[5].setRotationPoint(-55F, -42F, -135F);

		leftWingModel[6].addShapeBox(0F, 0F, 0F, 16, 5, 14, 0F,-5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -4F, 0F, -4F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		leftWingModel[6].setRotationPoint(-45F, -42F, -149F);

		leftWingModel[7].addShapeBox(0F, 0F, 0F, 14, 5, 14, 0F,-3F, -1F, -5F, -4F, 0F, 0F, -9F, 0F, 0F, 0F, -2F, 0F, -3F, -3F, -5F, -4F, -4F, 0F, -9F, 0F, 0F, 0F, -2F, 0F); // Box 48
		leftWingModel[7].setRotationPoint(-50F, -42F, -149F);

		leftWingModel[8].addShapeBox(0F, 0F, 0F, 26, 5, 14, 0F,-4F, 0F, 0F, -9F, -1F, -4F, 0F, -3F, 0F, -8F, 0F, 0F, -4F, -4F, 0F, -9F, -3F, -4F, 0F, -1F, 0F, -8F, 0F, 0F); // Box 49
		leftWingModel[8].setRotationPoint(-37F, -42F, -149F);

		leftWingModel[9].addShapeBox(0F, 0F, 0F, 18, 8, 17, 0F,0F, -4F, -6F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -4F, -6F, 0F, 0F, -4F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, -4F); // Import LWW01
		leftWingModel[9].setRotationPoint(-121F, -1F, -51.5F);

		leftWingModel[10].addShapeBox(4F, 0F, 0F, 31, 8, 17, 0F,0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 3F, 0F, 0F, 4F, 2F, 0F, 4F, 2F, 0F, 3F, 0F); // Import LWW02
		leftWingModel[10].setRotationPoint(-107F, -1F, -51.5F);

		leftWingModel[11].addShapeBox(0F, 0F, 0F, 54, 12, 19, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 1F); // Import LWW03
		leftWingModel[11].setRotationPoint(-72F, -1F, -52.5F);

		leftWingModel[12].addShapeBox(0F, 0F, 0F, 41, 11, 19, 0F,0F, 0F, -2F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, 4F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 4F, 0F); // Import LWW04
		leftWingModel[12].setRotationPoint(-18F, -1F, -52.5F);

		leftWingModel[13].addShapeBox(0F, 0F, 0F, 24, 10, 13, 0F,0F, 0F, -2F, 0F, -2F, -6F, 0F, -2F, -6F, 0F, 0F, -2F, 0F, 1F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 1F, 0F); // Import LWW05
		leftWingModel[13].setRotationPoint(23F, -1F, -49.5F);

		leftWingModel[14].addShapeBox(0F, 0F, 0F, 6, 13, 1, 0F,0F, -3F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -3F, -0.25F, 0F, -3F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -3F, -0.25F); // Import LWW06
		leftWingModel[14].setRotationPoint(47F, -1F, -43.5F);

		leftWingModel[15].addShapeBox(0F, 0F, 0F, 4, 13, 1, 0F,0F, 0F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, 0F, 0F, -0.25F); // Import LWW07
		leftWingModel[15].setRotationPoint(53F, -1F, -43.5F);

		leftWingModel[16].addShapeBox(0F, 0F, 0F, 18, 8, 17, 0F,0F, 0F, -4F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -4F, -3F, -6F, -8.5F, 0F, 0F, -7F, 0F, 0F, -7F, -3F, -6F, -8.5F); // Import LWW08
		leftWingModel[16].setRotationPoint(-121F, 7F, -51.5F);

		leftWingModel[17].addShapeBox(0F, 0F, 0F, 31, 6, 17, 0F,0F, 0F, 0F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, 0F, 0F, -1F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -1F, -7F); // Import LWW09
		leftWingModel[17].setRotationPoint(-103F, 10F, -51.5F);

		leftWingModel[18].addShapeBox(0F, 0F, 0F, 54, 8, 19, 0F,0F, 0F, 1F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 1F, 0F, -3F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, -3F, -8F); // Import LWW10
		leftWingModel[18].setRotationPoint(-72F, 11F, -52.5F);

		leftWingModel[19].addShapeBox(0F, 0F, 0F, 41, 8, 19, 0F,0F, -3F, 0F, 0F, 1F, -3F, 0F, 1F, -3F, 0F, -3F, 0F, 0F, -3F, -9F, 0F, -6F, -9F, 0F, -6F, -9F, 0F, -3F, -9F); // Import LWW11
		leftWingModel[19].setRotationPoint(-18F, 11F, -52.5F);

		leftWingModel[20].addShapeBox(0F, 0F, 0F, 24, 3, 13, 0F,0F, 0F, 0F, 0F, 1F, -6F, 0F, 1F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -4F, -6F, 0F, -4F, -6F, 0F, 0F, -6F); // Import LWW12
		leftWingModel[20].setRotationPoint(23F, 10F, -49.5F);

		leftWingModel[21].addTrapezoid(0F, 0F, 0F, 28, 1, 5, 0F, -0.50F, ModelRendererTurbo.MR_TOP); // Import LWW13
		leftWingModel[21].setRotationPoint(-48F, -1.5F, -45.5F);

		leftWingModel[22].addShapeBox(0F, 0F, 0F, 26, 28, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LWW19
		leftWingModel[22].setRotationPoint(-47F, -29F, -44F);

		leftWingModel[23].addShapeBox(0F, 0F, 0F, 26, 7, 1, 0F,-5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		leftWingModel[23].setRotationPoint(-44F, -27F, -22F);

		leftWingModel[24].addShapeBox(0F, 0F, 0F, 26, 7, 1, 0F,-3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F); // Box 1
		leftWingModel[24].setRotationPoint(-44F, -27F, -21F);

		leftWingModel[25].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, -0.4F, -1.6F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -1.6F, 0F, -0.4F, -1.6F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -1.6F); // Box 232
		leftWingModel[25].setRotationPoint(-18F, -17.5F, -24F);

		leftWingModel[26].addShapeBox(0F, 0F, 0F, 19, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		leftWingModel[26].setRotationPoint(-41F, -20F, -24F);

		leftWingModel[27].addShapeBox(0F, 0F, 0F, 19, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		leftWingModel[27].setRotationPoint(-41F, -18F, -24F);

		leftWingModel[28].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F,0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F); // Box 221
		leftWingModel[28].setRotationPoint(-45F, -18F, -24F);

		leftWingModel[29].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F,0F, -2F, -2.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, -2.5F, 0F, 0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -2F); // Box 222
		leftWingModel[29].setRotationPoint(-45F, -20F, -24F);

		leftWingModel[30].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F); // Box 223
		leftWingModel[30].setRotationPoint(-45.5F, -18F, -22F);

		leftWingModel[31].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.8F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.8F, -0.25F, -0.25F, -0.8F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.8F, -0.25F, -0.25F); // Box 224
		leftWingModel[31].setRotationPoint(-46.5F, -18F, -22F);

		leftWingModel[32].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F,0F, 0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -2F, 0F, -2F, -2.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, -2.5F); // Box 225
		leftWingModel[32].setRotationPoint(-45F, -16F, -24F);

		leftWingModel[33].addShapeBox(0F, 0F, 0F, 19, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 226
		leftWingModel[33].setRotationPoint(-41F, -16F, -24F);

		leftWingModel[34].addShapeBox(0F, 0F, 0F, 8, 2, 6, 0F,0F, 0F, 0F, 0F, -0.75F, -2.75F, 0F, -0.75F, -2.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -2.75F, 0F, -0.75F, -2.75F, 0F, 0F, 0F); // Box 229
		leftWingModel[34].setRotationPoint(-22F, -18F, -24F);

		leftWingModel[35].addShapeBox(0F, 0F, 0F, 8, 2, 6, 0F,0F, 0F, -2F, 0F, -2.75F, -2.75F, 0F, -2.75F, -2.75F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0.75F, -2.75F, 0F, 0.75F, -2.75F, 0F, 0F, 0F); // Box 230
		leftWingModel[35].setRotationPoint(-22F, -20F, -24F);

		leftWingModel[36].addShapeBox(0F, 0F, 0F, 8, 2, 6, 0F,0F, 0F, 0F, 0F, 0.75F, -2.75F, 0F, 0.75F, -2.75F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2.75F, -2.75F, 0F, -2.75F, -2.75F, 0F, 0F, -2F); // Box 231
		leftWingModel[36].setRotationPoint(-22F, -16F, -24F);

		leftWingModel[37].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F,0F, -1.6F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -1.6F, -0.4F, 0F, -1.6F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -1.6F, -0.4F); // Box 233
		leftWingModel[37].setRotationPoint(-18F, -20F, -21.5F);

		leftWingModel[38].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 234
		leftWingModel[38].setRotationPoint(-14F, -20F, -21.5F);

		leftWingModel[39].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 235
		leftWingModel[39].setRotationPoint(-14F, -16F, -21.5F);

		leftWingModel[40].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 236
		leftWingModel[40].setRotationPoint(-14F, -17.5F, -24F);

		leftWingModel[41].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 237
		leftWingModel[41].setRotationPoint(-14F, -17.5F, -20F);

		leftWingModel[42].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, 0.2F, -0.9F, 0F, 0.2F, -0.9F, 0F, 0F, -0.1F, -0.75F, 0F, -0.1F, -0.75F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, -1F, -0.75F, -0.1F, -1F); // Box 238
		leftWingModel[42].setRotationPoint(-11F, -18F, -22F);

		leftWingModel[43].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, 0.2F, -0.9F, 0F, 0.2F, -0.9F, 0F, 0F, -0.1F, -0.75F, 0F, -0.1F, -0.75F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, -1F, -0.75F, -0.1F, -1F); // Box 239
		leftWingModel[43].setRotationPoint(-13F, -18F, -22F);

		leftWingModel[44].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0.2F, -0.9F, -0.75F, 0.2F, -0.9F, -0.75F, -0.1F, -1F, 0F, -0.1F, -1F, 0F, -0.1F, 0.2F, -0.75F, -0.1F, 0.2F); // Box 240
		leftWingModel[44].setRotationPoint(-13F, -18F, -21F);

		leftWingModel[45].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0.2F, -0.9F, -0.75F, 0.2F, -0.9F, -0.75F, -0.1F, -1F, 0F, -0.1F, -1F, 0F, -0.1F, 0.2F, -0.75F, -0.1F, 0.2F); // Box 241
		leftWingModel[45].setRotationPoint(-11F, -18F, -21F);

		leftWingModel[46].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, -0.1F, -1F, 0F, -0.1F, -1F, 0F, -0.1F, 0.2F, -0.75F, -0.1F, 0.2F, -0.75F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0.2F, -0.9F, -0.75F, 0.2F, -0.9F); // Box 242
		leftWingModel[46].setRotationPoint(-13F, -17F, -21F);

		leftWingModel[47].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, -0.1F, -1F, 0F, -0.1F, -1F, 0F, -0.1F, 0.2F, -0.75F, -0.1F, 0.2F, -0.75F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0.2F, -0.9F, -0.75F, 0.2F, -0.9F); // Box 243
		leftWingModel[47].setRotationPoint(-11F, -17F, -21F);

		leftWingModel[48].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, -1F, -0.75F, -0.1F, -1F, -0.75F, 0.2F, -0.9F, 0F, 0.2F, -0.9F, 0F, 0F, -0.1F, -0.75F, 0F, -0.1F); // Box 244
		leftWingModel[48].setRotationPoint(-11F, -17F, -22F);

		leftWingModel[49].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, -1F, -0.75F, -0.1F, -1F, -0.75F, 0.2F, -0.9F, 0F, 0.2F, -0.9F, 0F, 0F, -0.1F, -0.75F, 0F, -0.1F); // Box 245
		leftWingModel[49].setRotationPoint(-13F, -17F, -22F);
	}

	private void initrightWingModel_1()
	{
		rightWingModel[0] = new ModelRendererTurbo(this, 577, 209, textureX, textureY); // Box 176
		rightWingModel[1] = new ModelRendererTurbo(this, 681, 209, textureX, textureY); // Box 177
		rightWingModel[2] = new ModelRendererTurbo(this, 145, 217, textureX, textureY); // Box 178
		rightWingModel[3] = new ModelRendererTurbo(this, 177, 217, textureX, textureY); // Box 179
		rightWingModel[4] = new ModelRendererTurbo(this, 913, 201, textureX, textureY); // Box 180
		rightWingModel[5] = new ModelRendererTurbo(this, 417, 225, textureX, textureY); // Box 181
		rightWingModel[6] = new ModelRendererTurbo(this, 961, 201, textureX, textureY); // Box 182
		rightWingModel[7] = new ModelRendererTurbo(this, 321, 217, textureX, textureY); // Box 183
		rightWingModel[8] = new ModelRendererTurbo(this, 385, 217, textureX, textureY); // Box 184
		rightWingModel[9] = new ModelRendererTurbo(this, 401, 241, textureX, textureY); // Box 218
		rightWingModel[10] = new ModelRendererTurbo(this, 905, 249, textureX, textureY); // Box 219
		rightWingModel[11] = new ModelRendererTurbo(this, 545, 257, textureX, textureY); // Box 220
		rightWingModel[12] = new ModelRendererTurbo(this, 1, 297, textureX, textureY); // Box 221
		rightWingModel[13] = new ModelRendererTurbo(this, 121, 265, textureX, textureY); // Box 222
		rightWingModel[14] = new ModelRendererTurbo(this, 649, 73, textureX, textureY); // Box 223
		rightWingModel[15] = new ModelRendererTurbo(this, 361, 81, textureX, textureY); // Box 224
		rightWingModel[16] = new ModelRendererTurbo(this, 185, 273, textureX, textureY); // Box 225
		rightWingModel[17] = new ModelRendererTurbo(this, 401, 273, textureX, textureY); // Box 226
		rightWingModel[18] = new ModelRendererTurbo(this, 617, 313, textureX, textureY); // Box 227
		rightWingModel[19] = new ModelRendererTurbo(this, 897, 297, textureX, textureY); // Box 228
		rightWingModel[20] = new ModelRendererTurbo(this, 825, 273, textureX, textureY); // Box 229
		rightWingModel[21] = new ModelRendererTurbo(this, 601, 137, textureX, textureY); // Box 230
		rightWingModel[22] = new ModelRendererTurbo(this, 321, 241, textureX, textureY); // Box 231
		rightWingModel[23] = new ModelRendererTurbo(this, 697, 273, textureX, textureY); // Box 268
		rightWingModel[24] = new ModelRendererTurbo(this, 1, 281, textureX, textureY); // Box 269
		rightWingModel[25] = new ModelRendererTurbo(this, 89, 113, textureX, textureY); // Box 270
		rightWingModel[26] = new ModelRendererTurbo(this, 905, 281, textureX, textureY); // Box 271
		rightWingModel[27] = new ModelRendererTurbo(this, 961, 281, textureX, textureY); // Box 272
		rightWingModel[28] = new ModelRendererTurbo(this, 793, 161, textureX, textureY); // Box 273
		rightWingModel[29] = new ModelRendererTurbo(this, 857, 161, textureX, textureY); // Box 274
		rightWingModel[30] = new ModelRendererTurbo(this, 537, 65, textureX, textureY); // Box 275
		rightWingModel[31] = new ModelRendererTurbo(this, 561, 65, textureX, textureY); // Box 276
		rightWingModel[32] = new ModelRendererTurbo(this, 105, 169, textureX, textureY); // Box 277
		rightWingModel[33] = new ModelRendererTurbo(this, 321, 289, textureX, textureY); // Box 278
		rightWingModel[34] = new ModelRendererTurbo(this, 193, 169, textureX, textureY); // Box 279
		rightWingModel[35] = new ModelRendererTurbo(this, 921, 177, textureX, textureY); // Box 280
		rightWingModel[36] = new ModelRendererTurbo(this, 265, 193, textureX, textureY); // Box 281
		rightWingModel[37] = new ModelRendererTurbo(this, 185, 97, textureX, textureY); // Box 282
		rightWingModel[38] = new ModelRendererTurbo(this, 361, 97, textureX, textureY); // Box 283
		rightWingModel[39] = new ModelRendererTurbo(this, 417, 97, textureX, textureY); // Box 284
		rightWingModel[40] = new ModelRendererTurbo(this, 465, 97, textureX, textureY); // Box 285
		rightWingModel[41] = new ModelRendererTurbo(this, 185, 105, textureX, textureY); // Box 286
		rightWingModel[42] = new ModelRendererTurbo(this, 705, 65, textureX, textureY); // Box 287
		rightWingModel[43] = new ModelRendererTurbo(this, 713, 65, textureX, textureY); // Box 288
		rightWingModel[44] = new ModelRendererTurbo(this, 745, 65, textureX, textureY); // Box 289
		rightWingModel[45] = new ModelRendererTurbo(this, 977, 65, textureX, textureY); // Box 290
		rightWingModel[46] = new ModelRendererTurbo(this, 1017, 65, textureX, textureY); // Box 291
		rightWingModel[47] = new ModelRendererTurbo(this, 289, 73, textureX, textureY); // Box 292
		rightWingModel[48] = new ModelRendererTurbo(this, 913, 73, textureX, textureY); // Box 293
		rightWingModel[49] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 294

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 26, 11, 31, 0F,0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 176
		rightWingModel[0].setRotationPoint(-48F, -37F, 14F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 26, 11, 90, 0F,0F, -5F, 0F, 0F, -5F, 0F, -7F, 0F, 0F, -3F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, -7F, -6F, 0F, -3F, -6F, 0F); // Box 177
		rightWingModel[1].setRotationPoint(-48F, -42F, 45F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 29, 11, 31, 0F,-3F, 0F, 0F, 4F, -8F, 1F, 0F, -6F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 4F, -2F, 1F, 0F, -4F, 0F, 0F, -2F, 0F); // Box 178
		rightWingModel[2].setRotationPoint(-22F, -37F, 14F);

		rightWingModel[3].addShapeBox(0F, 0F, 0F, 26, 11, 90, 0F,-7F, -5F, 0F, 10F, -11F, 0F, -8F, -3F, 0F, 0F, 0F, 0F, -7F, 3F, 0F, 10F, 1F, 0F, -8F, -7F, 0F, 0F, -6F, 0F); // Box 179
		rightWingModel[3].setRotationPoint(-29F, -42F, 45F);

		rightWingModel[4].addShapeBox(0F, 0F, 0F, 6, 11, 31, 0F,0F, -6F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -2F, -4F, 0F, 0F, -2F, 0F, 3F, 0F, 0F, 3F, -2F, 0F, -2F, -5F, 0F); // Box 180
		rightWingModel[4].setRotationPoint(-57F, -37F, 14F);

		rightWingModel[5].addShapeBox(0F, 0F, 0F, 17, 11, 90, 0F,0F, -9F, 0F, -10F, -5F, 0F, -7F, 0F, 0F, -5F, -2F, 0F, 0F, 0F, 0F, -10F, 3F, 0F, -7F, -6F, 0F, -5F, -8F, 0F); // Box 181
		rightWingModel[5].setRotationPoint(-55F, -42F, 45F);

		rightWingModel[6].addShapeBox(0F, 0F, 0F, 16, 5, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -4F, 0F, -5F, -4F, 0F); // Box 182
		rightWingModel[6].setRotationPoint(-45F, -42F, 135F);

		rightWingModel[7].addShapeBox(0F, 0F, 0F, 14, 5, 14, 0F,0F, -2F, 0F, -9F, 0F, 0F, -4F, 0F, 0F, -3F, -1F, -5F, 0F, -2F, 0F, -9F, 0F, 0F, -4F, -4F, 0F, -3F, -3F, -5F); // Box 183
		rightWingModel[7].setRotationPoint(-50F, -42F, 135F);

		rightWingModel[8].addShapeBox(0F, 0F, 0F, 26, 5, 14, 0F,-8F, 0F, 0F, 0F, -3F, 0F, -9F, -1F, -4F, -4F, 0F, 0F, -8F, 0F, 0F, 0F, -1F, 0F, -9F, -3F, -4F, -4F, -4F, 0F); // Box 184
		rightWingModel[8].setRotationPoint(-37F, -42F, 135F);

		rightWingModel[9].addShapeBox(0F, 0F, 0F, 18, 8, 17, 0F,0F, -4F, -6F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -4F, -6F, 0F, 0F, -4F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, -4F); // Box 218
		rightWingModel[9].setRotationPoint(-121F, -1F, 34.5F);

		rightWingModel[10].addShapeBox(4F, 0F, 0F, 31, 8, 17, 0F,0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 3F, 0F, 0F, 4F, 2F, 0F, 4F, 2F, 0F, 3F, 0F); // Box 219
		rightWingModel[10].setRotationPoint(-107F, -1F, 34.5F);

		rightWingModel[11].addShapeBox(0F, 0F, 0F, 54, 12, 19, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 1F); // Box 220
		rightWingModel[11].setRotationPoint(-72F, -1F, 33.5F);

		rightWingModel[12].addShapeBox(0F, 0F, 0F, 41, 11, 19, 0F,0F, 0F, -2F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, 4F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 4F, 0F); // Box 221
		rightWingModel[12].setRotationPoint(-18F, -1F, 33.5F);

		rightWingModel[13].addShapeBox(0F, 0F, 0F, 24, 10, 13, 0F,0F, 0F, -2F, 0F, -2F, -6F, 0F, -2F, -6F, 0F, 0F, -2F, 0F, 1F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 1F, 0F); // Box 222
		rightWingModel[13].setRotationPoint(23F, -1F, 36.5F);

		rightWingModel[14].addShapeBox(0F, 0F, 0F, 6, 13, 1, 0F,0F, -3F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -3F, -0.25F, 0F, -3F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -3F, -0.25F); // Box 223
		rightWingModel[14].setRotationPoint(47F, -1F, 42.5F);

		rightWingModel[15].addShapeBox(0F, 0F, 0F, 4, 13, 1, 0F,0F, 0F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, 0F, 0F, -0.25F); // Box 224
		rightWingModel[15].setRotationPoint(53F, -1F, 42.5F);

		rightWingModel[16].addShapeBox(0F, 0F, 0F, 18, 8, 17, 0F,0F, 0F, -4F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -4F, -3F, -6F, -8.5F, 0F, 0F, -7F, 0F, 0F, -7F, -3F, -6F, -8.5F); // Box 225
		rightWingModel[16].setRotationPoint(-121F, 7F, 34.5F);

		rightWingModel[17].addShapeBox(0F, 0F, 0F, 31, 6, 17, 0F,0F, 0F, 0F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, 0F, 0F, -1F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -1F, -7F); // Box 226
		rightWingModel[17].setRotationPoint(-103F, 10F, 34.5F);

		rightWingModel[18].addShapeBox(0F, 0F, 0F, 54, 8, 19, 0F,0F, 0F, 1F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 1F, 0F, -3F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, -3F, -8F); // Box 227
		rightWingModel[18].setRotationPoint(-72F, 11F, 33.5F);

		rightWingModel[19].addShapeBox(0F, 0F, 0F, 41, 8, 19, 0F,0F, -3F, 0F, 0F, 1F, -3F, 0F, 1F, -3F, 0F, -3F, 0F, 0F, -3F, -9F, 0F, -6F, -9F, 0F, -6F, -9F, 0F, -3F, -9F); // Box 228
		rightWingModel[19].setRotationPoint(-18F, 11F, 33.5F);

		rightWingModel[20].addShapeBox(0F, 0F, 0F, 24, 3, 13, 0F,0F, 0F, 0F, 0F, 1F, -6F, 0F, 1F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -4F, -6F, 0F, -4F, -6F, 0F, 0F, -6F); // Box 229
		rightWingModel[20].setRotationPoint(23F, 10F, 36.5F);

		rightWingModel[21].addTrapezoid(0F, 0F, 0F, 28, 1, 5, 0F, -0.50F, ModelRendererTurbo.MR_TOP); // Box 230
		rightWingModel[21].setRotationPoint(-48F, -1.5F, 40.5F);

		rightWingModel[22].addShapeBox(0F, 0F, 0F, 26, 28, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 231
		rightWingModel[22].setRotationPoint(-47F, -29F, 42F);

		rightWingModel[23].addShapeBox(0F, 0F, 0F, 26, 7, 1, 0F,-3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F); // Box 268
		rightWingModel[23].setRotationPoint(-44F, -27F, 21F);

		rightWingModel[24].addShapeBox(0F, 0F, 0F, 26, 7, 1, 0F,-5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 269
		rightWingModel[24].setRotationPoint(-44F, -27F, 20F);

		rightWingModel[25].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, -0.4F, -1.6F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -1.6F, 0F, -0.4F, -1.6F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -1.6F); // Box 270
		rightWingModel[25].setRotationPoint(-18F, -17.5F, 18F);

		rightWingModel[26].addShapeBox(0F, 0F, 0F, 19, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 271
		rightWingModel[26].setRotationPoint(-41F, -20F, 18F);

		rightWingModel[27].addShapeBox(0F, 0F, 0F, 19, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		rightWingModel[27].setRotationPoint(-41F, -18F, 18F);

		rightWingModel[28].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F,0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F); // Box 273
		rightWingModel[28].setRotationPoint(-45F, -18F, 18F);

		rightWingModel[29].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F,0F, -2F, -2.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, -2.5F, 0F, 0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -2F); // Box 274
		rightWingModel[29].setRotationPoint(-45F, -20F, 18F);

		rightWingModel[30].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F); // Box 275
		rightWingModel[30].setRotationPoint(-45.5F, -18F, 20F);

		rightWingModel[31].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.8F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.8F, -0.25F, -0.25F, -0.8F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.8F, -0.25F, -0.25F); // Box 276
		rightWingModel[31].setRotationPoint(-46.5F, -18F, 20F);

		rightWingModel[32].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F,0F, 0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -2F, 0F, -2F, -2.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, -2.5F); // Box 277
		rightWingModel[32].setRotationPoint(-45F, -16F, 18F);

		rightWingModel[33].addShapeBox(0F, 0F, 0F, 19, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 278
		rightWingModel[33].setRotationPoint(-41F, -16F, 18F);

		rightWingModel[34].addShapeBox(0F, 0F, 0F, 8, 2, 6, 0F,0F, 0F, 0F, 0F, -0.75F, -2.75F, 0F, -0.75F, -2.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -2.75F, 0F, -0.75F, -2.75F, 0F, 0F, 0F); // Box 279
		rightWingModel[34].setRotationPoint(-22F, -18F, 18F);

		rightWingModel[35].addShapeBox(0F, 0F, 0F, 8, 2, 6, 0F,0F, 0F, -2F, 0F, -2.75F, -2.75F, 0F, -2.75F, -2.75F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0.75F, -2.75F, 0F, 0.75F, -2.75F, 0F, 0F, 0F); // Box 280
		rightWingModel[35].setRotationPoint(-22F, -20F, 18F);

		rightWingModel[36].addShapeBox(0F, 0F, 0F, 8, 2, 6, 0F,0F, 0F, 0F, 0F, 0.75F, -2.75F, 0F, 0.75F, -2.75F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2.75F, -2.75F, 0F, -2.75F, -2.75F, 0F, 0F, -2F); // Box 281
		rightWingModel[36].setRotationPoint(-22F, -16F, 18F);

		rightWingModel[37].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F,0F, -1.6F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -1.6F, -0.4F, 0F, -1.6F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -1.6F, -0.4F); // Box 282
		rightWingModel[37].setRotationPoint(-18F, -20F, 20.5F);

		rightWingModel[38].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 283
		rightWingModel[38].setRotationPoint(-14F, -20F, 20.5F);

		rightWingModel[39].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 284
		rightWingModel[39].setRotationPoint(-14F, -16F, 20.5F);

		rightWingModel[40].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 285
		rightWingModel[40].setRotationPoint(-14F, -17.5F, 22F);

		rightWingModel[41].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 286
		rightWingModel[41].setRotationPoint(-14F, -17.5F, 18F);

		rightWingModel[42].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0.2F, -0.9F, -0.75F, 0.2F, -0.9F, -0.75F, -0.1F, -1F, 0F, -0.1F, -1F, 0F, -0.1F, 0.2F, -0.75F, -0.1F, 0.2F); // Box 287
		rightWingModel[42].setRotationPoint(-11F, -18F, 21F);

		rightWingModel[43].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0.2F, -0.9F, -0.75F, 0.2F, -0.9F, -0.75F, -0.1F, -1F, 0F, -0.1F, -1F, 0F, -0.1F, 0.2F, -0.75F, -0.1F, 0.2F); // Box 288
		rightWingModel[43].setRotationPoint(-13F, -18F, 21F);

		rightWingModel[44].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, 0.2F, -0.9F, 0F, 0.2F, -0.9F, 0F, 0F, -0.1F, -0.75F, 0F, -0.1F, -0.75F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, -1F, -0.75F, -0.1F, -1F); // Box 289
		rightWingModel[44].setRotationPoint(-13F, -18F, 20F);

		rightWingModel[45].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, 0.2F, -0.9F, 0F, 0.2F, -0.9F, 0F, 0F, -0.1F, -0.75F, 0F, -0.1F, -0.75F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, -1F, -0.75F, -0.1F, -1F); // Box 290
		rightWingModel[45].setRotationPoint(-11F, -18F, 20F);

		rightWingModel[46].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, -1F, -0.75F, -0.1F, -1F, -0.75F, 0.2F, -0.9F, 0F, 0.2F, -0.9F, 0F, 0F, -0.1F, -0.75F, 0F, -0.1F); // Box 291
		rightWingModel[46].setRotationPoint(-13F, -17F, 20F);

		rightWingModel[47].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, -1F, -0.75F, -0.1F, -1F, -0.75F, 0.2F, -0.9F, 0F, 0.2F, -0.9F, 0F, 0F, -0.1F, -0.75F, 0F, -0.1F); // Box 292
		rightWingModel[47].setRotationPoint(-11F, -17F, 20F);

		rightWingModel[48].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, -0.1F, -1F, 0F, -0.1F, -1F, 0F, -0.1F, 0.2F, -0.75F, -0.1F, 0.2F, -0.75F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0.2F, -0.9F, -0.75F, 0.2F, -0.9F); // Box 293
		rightWingModel[48].setRotationPoint(-11F, -17F, 21F);

		rightWingModel[49].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, -0.1F, -1F, 0F, -0.1F, -1F, 0F, -0.1F, 0.2F, -0.75F, -0.1F, 0.2F, -0.75F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0.2F, -0.9F, -0.75F, 0.2F, -0.9F); // Box 294
		rightWingModel[49].setRotationPoint(-13F, -17F, 21F);
	}

	private void inityawFlapModel_1()
	{
		yawFlapModel[0] = new ModelRendererTurbo(this, 657, 33, textureX, textureY); // Box 50
		yawFlapModel[1] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 51
		yawFlapModel[2] = new ModelRendererTurbo(this, 665, 65, textureX, textureY); // Box 52
		yawFlapModel[3] = new ModelRendererTurbo(this, 297, 137, textureX, textureY); // Box 185
		yawFlapModel[4] = new ModelRendererTurbo(this, 361, 121, textureX, textureY); // Box 186
		yawFlapModel[5] = new ModelRendererTurbo(this, 697, 225, textureX, textureY); // Box 187

		yawFlapModel[0].addShapeBox(0F, 0F, 0F, 17, 9, 3, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		yawFlapModel[0].setRotationPoint(113F, -44F, -3F);

		yawFlapModel[1].addShapeBox(0F, 0F, 0F, 17, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -4F, -2F, -2F, -4F, -2F, 0F, 0F, 0F, 0F); // Box 51
		yawFlapModel[1].setRotationPoint(113F, -35F, -3F);

		yawFlapModel[2].addShapeBox(0F, 0F, 0F, 17, 38, 3, 0F,0F, 0F, -1F, -7F, 0F, -2F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		yawFlapModel[2].setRotationPoint(113F, -82F, -3F);

		yawFlapModel[3].addShapeBox(0F, 0F, 0F, 17, 9, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 185
		yawFlapModel[3].setRotationPoint(113F, -44F, 0F);

		yawFlapModel[4].addShapeBox(0F, 0F, 0F, 17, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -2F, 0F, -4F, -2F, -2F, 0F, 0F, -1F); // Box 186
		yawFlapModel[4].setRotationPoint(113F, -35F, 0F);

		yawFlapModel[5].addShapeBox(0F, 0F, 0F, 17, 38, 3, 0F,0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 187
		yawFlapModel[5].setRotationPoint(113F, -82F, 0F);
	}

	private void initpitchFlapLeftModel_1()
	{
		pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 9, 73, textureX, textureY); // Box 55

		pitchFlapLeftModel[0].addShapeBox(0F, 0F, 0F, 11, 3, 57, 0F,0F, 0F, 0F, -4F, -1F, 0F, 0F, -1F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -1F, 0F, 0F, -1F, -8F, 0F, 0F, 0F); // Box 55
		pitchFlapLeftModel[0].setRotationPoint(109F, -48F, -57F);
	}

	private void initpitchFlapRightModel_1()
	{
		pitchFlapRightModel[0] = new ModelRendererTurbo(this, 321, 241, textureX, textureY); // Box 190

		pitchFlapRightModel[0].addShapeBox(0F, 0F, 0F, 11, 3, 57, 0F,0F, 0F, 0F, 0F, -1F, -8F, -4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -8F, -4F, -1F, 0F, 0F, 0F, 0F); // Box 190
		pitchFlapRightModel[0].setRotationPoint(109F, -48F, 0F);
	}

	private void initPropeller()
	{
		propellerModels = new ModelRendererTurbo[1][3];
		propellerModels[0] = makeProp1(-107F, -37.5F, 0F);
	}

	private ModelRendererTurbo[] makeProp1(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[3];
		prop[0] = new ModelRendererTurbo(this, 0, 344, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 344, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 0, 344, textureX, textureY);
		prop[0].addBox(-1F, -39F, -3F, 2, 39, 6, 0.0F);
		prop[1].addBox(-1F, -39F, -3F, 2, 39, 6, 0.0F);
		prop[2].addBox(-1F, -39F, -3F, 2, 39, 6, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		return prop;
	}
}