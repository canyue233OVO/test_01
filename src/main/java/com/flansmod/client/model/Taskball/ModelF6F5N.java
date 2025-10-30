//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: F6F5N
// Model Creator: 
// Created on: 29.09.2022 - 20:49:59
// Last changed on: 29.09.2022 - 20:49:59

package com.flansmod.client.model.Taskball; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelF6F5N extends ModelPlane //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelF6F5N() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[349];
		noseModel = new ModelRendererTurbo[70];
		tailModel = new ModelRendererTurbo[66];
		leftWingModel = new ModelRendererTurbo[13];
		rightWingModel = new ModelRendererTurbo[22];
		yawFlapModel = new ModelRendererTurbo[2];
		pitchFlapLeftWingModel = new ModelRendererTurbo[1];
		pitchFlapRightWingModel = new ModelRendererTurbo[1];
		tailWheelModel = new ModelRendererTurbo[4];
		leftWingWheelModel = new ModelRendererTurbo[9];
		rightWingWheelModel = new ModelRendererTurbo[9];

		initbodyModel_1();
		initnoseModel_1();
		inittailModel_1();
		initleftWingModel_1();
		initrightWingModel_1();
		inityawFlapModel_1();
		initpitchFlapLeftWingModel_1();
		initpitchFlapRightWingModel_1();
		inittailWheelModel_1();
		initleftWingWheelModel_1();
		initrightWingWheelModel_1();

		initPropeller();

		translateAll(0F, 21F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 905, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 65, 905, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 1, 832, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 81, 832, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 153, 832, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 121, 905, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 145, 905, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 153, 905, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 249, 905, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 345, 905, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 433, 905, textureX, textureY); // Box 10
		bodyModel[11] = new ModelRendererTurbo(this, 233, 905, textureX, textureY); // Box 11
		bodyModel[12] = new ModelRendererTurbo(this, 489, 905, textureX, textureY); // Box 12
		bodyModel[13] = new ModelRendererTurbo(this, 569, 905, textureX, textureY); // Box 13
		bodyModel[14] = new ModelRendererTurbo(this, 617, 905, textureX, textureY); // Box 14
		bodyModel[15] = new ModelRendererTurbo(this, 225, 832, textureX, textureY); // Box 15
		bodyModel[16] = new ModelRendererTurbo(this, 713, 905, textureX, textureY); // Box 21
		bodyModel[17] = new ModelRendererTurbo(this, 305, 832, textureX, textureY); // Box 22
		bodyModel[18] = new ModelRendererTurbo(this, 793, 905, textureX, textureY); // Box 24
		bodyModel[19] = new ModelRendererTurbo(this, 889, 905, textureX, textureY); // Box 25
		bodyModel[20] = new ModelRendererTurbo(this, 937, 905, textureX, textureY); // Box 26
		bodyModel[21] = new ModelRendererTurbo(this, 385, 832, textureX, textureY); // Box 27
		bodyModel[22] = new ModelRendererTurbo(this, 75, 884, textureX, textureY); // Box 29
		bodyModel[23] = new ModelRendererTurbo(this, 977, 969, textureX, textureY); // Box 30
		bodyModel[24] = new ModelRendererTurbo(this, 3, 884, textureX, textureY); // Box 31
		bodyModel[25] = new ModelRendererTurbo(this, 457, 832, textureX, textureY); // Box 32
		bodyModel[26] = new ModelRendererTurbo(this, 529, 832, textureX, textureY); // Box 44
		bodyModel[27] = new ModelRendererTurbo(this, 705, 929, textureX, textureY); // Box 65
		bodyModel[28] = new ModelRendererTurbo(this, 329, 905, textureX, textureY); // Box 66
		bodyModel[29] = new ModelRendererTurbo(this, 57, 905, textureX, textureY); // Box 67
		bodyModel[30] = new ModelRendererTurbo(this, 57, 921, textureX, textureY); // Box 68
		bodyModel[31] = new ModelRendererTurbo(this, 553, 905, textureX, textureY); // Box 69
		bodyModel[32] = new ModelRendererTurbo(this, 257, 905, textureX, textureY); // Box 70
		bodyModel[33] = new ModelRendererTurbo(this, 417, 905, textureX, textureY); // Box 71
		bodyModel[34] = new ModelRendererTurbo(this, 345, 905, textureX, textureY); // Box 72
		bodyModel[35] = new ModelRendererTurbo(this, 601, 905, textureX, textureY); // Box 73
		bodyModel[36] = new ModelRendererTurbo(this, 1, 935, textureX, textureY); // Box 107
		bodyModel[37] = new ModelRendererTurbo(this, 65, 935, textureX, textureY); // Box 108
		bodyModel[38] = new ModelRendererTurbo(this, 1, 858, textureX, textureY); // Box 109
		bodyModel[39] = new ModelRendererTurbo(this, 81, 858, textureX, textureY); // Box 110
		bodyModel[40] = new ModelRendererTurbo(this, 153, 858, textureX, textureY); // Box 111
		bodyModel[41] = new ModelRendererTurbo(this, 121, 935, textureX, textureY); // Box 112
		bodyModel[42] = new ModelRendererTurbo(this, 145, 935, textureX, textureY); // Box 113
		bodyModel[43] = new ModelRendererTurbo(this, 153, 935, textureX, textureY); // Box 114
		bodyModel[44] = new ModelRendererTurbo(this, 249, 935, textureX, textureY); // Box 115
		bodyModel[45] = new ModelRendererTurbo(this, 345, 935, textureX, textureY); // Box 116
		bodyModel[46] = new ModelRendererTurbo(this, 433, 935, textureX, textureY); // Box 117
		bodyModel[47] = new ModelRendererTurbo(this, 233, 935, textureX, textureY); // Box 118
		bodyModel[48] = new ModelRendererTurbo(this, 489, 935, textureX, textureY); // Box 119
		bodyModel[49] = new ModelRendererTurbo(this, 569, 935, textureX, textureY); // Box 120
		bodyModel[50] = new ModelRendererTurbo(this, 617, 935, textureX, textureY); // Box 121
		bodyModel[51] = new ModelRendererTurbo(this, 225, 858, textureX, textureY); // Box 122
		bodyModel[52] = new ModelRendererTurbo(this, 713, 935, textureX, textureY); // Box 127
		bodyModel[53] = new ModelRendererTurbo(this, 305, 858, textureX, textureY); // Box 128
		bodyModel[54] = new ModelRendererTurbo(this, 793, 935, textureX, textureY); // Box 130
		bodyModel[55] = new ModelRendererTurbo(this, 889, 935, textureX, textureY); // Box 131
		bodyModel[56] = new ModelRendererTurbo(this, 937, 935, textureX, textureY); // Box 132
		bodyModel[57] = new ModelRendererTurbo(this, 385, 858, textureX, textureY); // Box 133
		bodyModel[58] = new ModelRendererTurbo(this, 841, 959, textureX, textureY); // Box 135
		bodyModel[59] = new ModelRendererTurbo(this, 929, 959, textureX, textureY); // Box 136
		bodyModel[60] = new ModelRendererTurbo(this, 161, 884, textureX, textureY); // Box 137
		bodyModel[61] = new ModelRendererTurbo(this, 457, 858, textureX, textureY); // Box 138
		bodyModel[62] = new ModelRendererTurbo(this, 529, 858, textureX, textureY); // Box 150
		bodyModel[63] = new ModelRendererTurbo(this, 969, 959, textureX, textureY); // Box 171
		bodyModel[64] = new ModelRendererTurbo(this, 329, 935, textureX, textureY); // Box 172
		bodyModel[65] = new ModelRendererTurbo(this, 57, 935, textureX, textureY); // Box 173
		bodyModel[66] = new ModelRendererTurbo(this, 57, 951, textureX, textureY); // Box 174
		bodyModel[67] = new ModelRendererTurbo(this, 553, 935, textureX, textureY); // Box 175
		bodyModel[68] = new ModelRendererTurbo(this, 257, 935, textureX, textureY); // Box 176
		bodyModel[69] = new ModelRendererTurbo(this, 417, 935, textureX, textureY); // Box 177
		bodyModel[70] = new ModelRendererTurbo(this, 345, 935, textureX, textureY); // Box 178
		bodyModel[71] = new ModelRendererTurbo(this, 601, 935, textureX, textureY); // Box 179
		bodyModel[72] = new ModelRendererTurbo(this, 585, 858, textureX, textureY); // Box 260
		bodyModel[73] = new ModelRendererTurbo(this, 1, 253, textureX, textureY); // Box 262
		bodyModel[74] = new ModelRendererTurbo(this, 65, 253, textureX, textureY); // Box 255
		bodyModel[75] = new ModelRendererTurbo(this, 113, 253, textureX, textureY); // Box 257
		bodyModel[76] = new ModelRendererTurbo(this, 41, 253, textureX, textureY); // Box 258
		bodyModel[77] = new ModelRendererTurbo(this, 1, 253, textureX, textureY); // Box 213
		bodyModel[78] = new ModelRendererTurbo(this, 65, 253, textureX, textureY); // Box 214
		bodyModel[79] = new ModelRendererTurbo(this, 1, 253, textureX, textureY); // Box 233
		bodyModel[80] = new ModelRendererTurbo(this, 17, 253, textureX, textureY); // Box 234
		bodyModel[81] = new ModelRendererTurbo(this, 41, 253, textureX, textureY); // Box 235
		bodyModel[82] = new ModelRendererTurbo(this, 49, 253, textureX, textureY); // Box 236
		bodyModel[83] = new ModelRendererTurbo(this, 65, 253, textureX, textureY); // Box 237
		bodyModel[84] = new ModelRendererTurbo(this, 89, 253, textureX, textureY); // Box 238
		bodyModel[85] = new ModelRendererTurbo(this, 97, 253, textureX, textureY); // Box 239
		bodyModel[86] = new ModelRendererTurbo(this, 105, 253, textureX, textureY); // Box 240
		bodyModel[87] = new ModelRendererTurbo(this, 113, 253, textureX, textureY); // Box 241
		bodyModel[88] = new ModelRendererTurbo(this, 121, 253, textureX, textureY); // Box 242
		bodyModel[89] = new ModelRendererTurbo(this, 137, 253, textureX, textureY); // Box 243
		bodyModel[90] = new ModelRendererTurbo(this, 145, 253, textureX, textureY); // Box 244
		bodyModel[91] = new ModelRendererTurbo(this, 153, 253, textureX, textureY); // Box 248
		bodyModel[92] = new ModelRendererTurbo(this, 161, 253, textureX, textureY); // Box 249
		bodyModel[93] = new ModelRendererTurbo(this, 169, 253, textureX, textureY); // Box 250
		bodyModel[94] = new ModelRendererTurbo(this, 177, 253, textureX, textureY); // Box 251
		bodyModel[95] = new ModelRendererTurbo(this, 185, 253, textureX, textureY); // Box 252
		bodyModel[96] = new ModelRendererTurbo(this, 193, 253, textureX, textureY); // Box 253
		bodyModel[97] = new ModelRendererTurbo(this, 201, 253, textureX, textureY); // Box 254
		bodyModel[98] = new ModelRendererTurbo(this, 209, 253, textureX, textureY); // Box 255
		bodyModel[99] = new ModelRendererTurbo(this, 217, 253, textureX, textureY); // Box 256
		bodyModel[100] = new ModelRendererTurbo(this, 225, 253, textureX, textureY); // Box 257
		bodyModel[101] = new ModelRendererTurbo(this, 233, 253, textureX, textureY); // Box 258
		bodyModel[102] = new ModelRendererTurbo(this, 241, 253, textureX, textureY); // Box 259
		bodyModel[103] = new ModelRendererTurbo(this, 249, 253, textureX, textureY); // Box 260
		bodyModel[104] = new ModelRendererTurbo(this, 257, 253, textureX, textureY); // Box 261
		bodyModel[105] = new ModelRendererTurbo(this, 265, 253, textureX, textureY); // Box 262
		bodyModel[106] = new ModelRendererTurbo(this, 273, 253, textureX, textureY); // Box 263
		bodyModel[107] = new ModelRendererTurbo(this, 281, 253, textureX, textureY); // Box 265
		bodyModel[108] = new ModelRendererTurbo(this, 289, 253, textureX, textureY); // Box 266
		bodyModel[109] = new ModelRendererTurbo(this, 297, 253, textureX, textureY); // Box 267
		bodyModel[110] = new ModelRendererTurbo(this, 305, 253, textureX, textureY); // Box 268
		bodyModel[111] = new ModelRendererTurbo(this, 313, 253, textureX, textureY); // Box 269
		bodyModel[112] = new ModelRendererTurbo(this, 321, 253, textureX, textureY); // Box 270
		bodyModel[113] = new ModelRendererTurbo(this, 329, 253, textureX, textureY); // Box 271
		bodyModel[114] = new ModelRendererTurbo(this, 337, 253, textureX, textureY); // Box 272
		bodyModel[115] = new ModelRendererTurbo(this, 345, 253, textureX, textureY); // Box 273
		bodyModel[116] = new ModelRendererTurbo(this, 353, 253, textureX, textureY); // Box 274
		bodyModel[117] = new ModelRendererTurbo(this, 361, 253, textureX, textureY); // Box 275
		bodyModel[118] = new ModelRendererTurbo(this, 369, 253, textureX, textureY); // Box 276
		bodyModel[119] = new ModelRendererTurbo(this, 377, 253, textureX, textureY); // Box 277
		bodyModel[120] = new ModelRendererTurbo(this, 385, 253, textureX, textureY); // Box 278
		bodyModel[121] = new ModelRendererTurbo(this, 393, 253, textureX, textureY); // Box 279
		bodyModel[122] = new ModelRendererTurbo(this, 401, 253, textureX, textureY); // Box 280
		bodyModel[123] = new ModelRendererTurbo(this, 409, 253, textureX, textureY); // Box 281
		bodyModel[124] = new ModelRendererTurbo(this, 417, 253, textureX, textureY); // Box 282
		bodyModel[125] = new ModelRendererTurbo(this, 425, 253, textureX, textureY); // Box 283
		bodyModel[126] = new ModelRendererTurbo(this, 433, 253, textureX, textureY); // Box 284
		bodyModel[127] = new ModelRendererTurbo(this, 441, 253, textureX, textureY); // Box 285
		bodyModel[128] = new ModelRendererTurbo(this, 449, 253, textureX, textureY); // Box 286
		bodyModel[129] = new ModelRendererTurbo(this, 457, 253, textureX, textureY); // Box 287
		bodyModel[130] = new ModelRendererTurbo(this, 465, 253, textureX, textureY); // Box 288
		bodyModel[131] = new ModelRendererTurbo(this, 473, 253, textureX, textureY); // Box 289
		bodyModel[132] = new ModelRendererTurbo(this, 481, 253, textureX, textureY); // Box 290
		bodyModel[133] = new ModelRendererTurbo(this, 489, 253, textureX, textureY); // Box 318
		bodyModel[134] = new ModelRendererTurbo(this, 497, 253, textureX, textureY); // Box 319
		bodyModel[135] = new ModelRendererTurbo(this, 505, 253, textureX, textureY); // Box 320
		bodyModel[136] = new ModelRendererTurbo(this, 513, 253, textureX, textureY); // Box 321
		bodyModel[137] = new ModelRendererTurbo(this, 521, 253, textureX, textureY); // Box 322
		bodyModel[138] = new ModelRendererTurbo(this, 529, 253, textureX, textureY); // Box 323
		bodyModel[139] = new ModelRendererTurbo(this, 537, 253, textureX, textureY); // Box 324
		bodyModel[140] = new ModelRendererTurbo(this, 545, 253, textureX, textureY); // Box 325
		bodyModel[141] = new ModelRendererTurbo(this, 553, 253, textureX, textureY); // Box 326
		bodyModel[142] = new ModelRendererTurbo(this, 561, 253, textureX, textureY); // Box 327
		bodyModel[143] = new ModelRendererTurbo(this, 569, 253, textureX, textureY); // Box 328
		bodyModel[144] = new ModelRendererTurbo(this, 577, 253, textureX, textureY); // Box 329
		bodyModel[145] = new ModelRendererTurbo(this, 585, 253, textureX, textureY); // Box 330
		bodyModel[146] = new ModelRendererTurbo(this, 593, 253, textureX, textureY); // Box 331
		bodyModel[147] = new ModelRendererTurbo(this, 601, 253, textureX, textureY); // Box 332
		bodyModel[148] = new ModelRendererTurbo(this, 609, 253, textureX, textureY); // Box 333
		bodyModel[149] = new ModelRendererTurbo(this, 617, 253, textureX, textureY); // Box 334
		bodyModel[150] = new ModelRendererTurbo(this, 625, 253, textureX, textureY); // Box 340
		bodyModel[151] = new ModelRendererTurbo(this, 633, 253, textureX, textureY); // Box 341
		bodyModel[152] = new ModelRendererTurbo(this, 641, 253, textureX, textureY); // Box 342
		bodyModel[153] = new ModelRendererTurbo(this, 649, 253, textureX, textureY); // Box 343
		bodyModel[154] = new ModelRendererTurbo(this, 657, 253, textureX, textureY); // Box 344
		bodyModel[155] = new ModelRendererTurbo(this, 665, 253, textureX, textureY); // Box 345
		bodyModel[156] = new ModelRendererTurbo(this, 673, 253, textureX, textureY); // Box 346
		bodyModel[157] = new ModelRendererTurbo(this, 681, 253, textureX, textureY); // Box 347
		bodyModel[158] = new ModelRendererTurbo(this, 689, 253, textureX, textureY); // Box 348
		bodyModel[159] = new ModelRendererTurbo(this, 697, 253, textureX, textureY); // Box 349
		bodyModel[160] = new ModelRendererTurbo(this, 705, 253, textureX, textureY); // Box 350
		bodyModel[161] = new ModelRendererTurbo(this, 713, 253, textureX, textureY); // Box 351
		bodyModel[162] = new ModelRendererTurbo(this, 721, 253, textureX, textureY); // Box 352
		bodyModel[163] = new ModelRendererTurbo(this, 729, 253, textureX, textureY); // Box 353
		bodyModel[164] = new ModelRendererTurbo(this, 737, 253, textureX, textureY); // Box 354
		bodyModel[165] = new ModelRendererTurbo(this, 745, 253, textureX, textureY); // Box 355
		bodyModel[166] = new ModelRendererTurbo(this, 753, 253, textureX, textureY); // Box 356
		bodyModel[167] = new ModelRendererTurbo(this, 761, 253, textureX, textureY); // Box 387
		bodyModel[168] = new ModelRendererTurbo(this, 769, 253, textureX, textureY); // Box 388
		bodyModel[169] = new ModelRendererTurbo(this, 777, 253, textureX, textureY); // Box 390
		bodyModel[170] = new ModelRendererTurbo(this, 785, 253, textureX, textureY); // Box 391
		bodyModel[171] = new ModelRendererTurbo(this, 793, 253, textureX, textureY); // Box 392
		bodyModel[172] = new ModelRendererTurbo(this, 801, 253, textureX, textureY); // Box 393
		bodyModel[173] = new ModelRendererTurbo(this, 809, 253, textureX, textureY); // Box 394
		bodyModel[174] = new ModelRendererTurbo(this, 817, 253, textureX, textureY); // Box 395
		bodyModel[175] = new ModelRendererTurbo(this, 825, 253, textureX, textureY); // Box 396
		bodyModel[176] = new ModelRendererTurbo(this, 833, 253, textureX, textureY); // Box 397
		bodyModel[177] = new ModelRendererTurbo(this, 841, 253, textureX, textureY); // Box 398
		bodyModel[178] = new ModelRendererTurbo(this, 849, 253, textureX, textureY); // Box 399
		bodyModel[179] = new ModelRendererTurbo(this, 857, 253, textureX, textureY); // Box 400
		bodyModel[180] = new ModelRendererTurbo(this, 865, 253, textureX, textureY); // Box 401
		bodyModel[181] = new ModelRendererTurbo(this, 873, 253, textureX, textureY); // Box 402
		bodyModel[182] = new ModelRendererTurbo(this, 881, 253, textureX, textureY); // Box 403
		bodyModel[183] = new ModelRendererTurbo(this, 889, 253, textureX, textureY); // Box 404
		bodyModel[184] = new ModelRendererTurbo(this, 897, 253, textureX, textureY); // Box 405
		bodyModel[185] = new ModelRendererTurbo(this, 905, 253, textureX, textureY); // Box 406
		bodyModel[186] = new ModelRendererTurbo(this, 913, 253, textureX, textureY); // Box 407
		bodyModel[187] = new ModelRendererTurbo(this, 921, 253, textureX, textureY); // Box 408
		bodyModel[188] = new ModelRendererTurbo(this, 929, 253, textureX, textureY); // Box 409
		bodyModel[189] = new ModelRendererTurbo(this, 937, 253, textureX, textureY); // Box 410
		bodyModel[190] = new ModelRendererTurbo(this, 945, 253, textureX, textureY); // Box 411
		bodyModel[191] = new ModelRendererTurbo(this, 953, 253, textureX, textureY); // Box 412
		bodyModel[192] = new ModelRendererTurbo(this, 961, 253, textureX, textureY); // Box 413
		bodyModel[193] = new ModelRendererTurbo(this, 969, 253, textureX, textureY); // Box 414
		bodyModel[194] = new ModelRendererTurbo(this, 977, 253, textureX, textureY); // Box 415
		bodyModel[195] = new ModelRendererTurbo(this, 985, 253, textureX, textureY); // Box 416
		bodyModel[196] = new ModelRendererTurbo(this, 993, 253, textureX, textureY); // Box 417
		bodyModel[197] = new ModelRendererTurbo(this, 1001, 253, textureX, textureY); // Box 418
		bodyModel[198] = new ModelRendererTurbo(this, 1009, 253, textureX, textureY); // Box 419
		bodyModel[199] = new ModelRendererTurbo(this, 1017, 253, textureX, textureY); // Box 421
		bodyModel[200] = new ModelRendererTurbo(this, 41, 261, textureX, textureY); // Box 422
		bodyModel[201] = new ModelRendererTurbo(this, 49, 261, textureX, textureY); // Box 423
		bodyModel[202] = new ModelRendererTurbo(this, 89, 261, textureX, textureY); // Box 424
		bodyModel[203] = new ModelRendererTurbo(this, 97, 261, textureX, textureY); // Box 425
		bodyModel[204] = new ModelRendererTurbo(this, 105, 261, textureX, textureY); // Box 426
		bodyModel[205] = new ModelRendererTurbo(this, 113, 261, textureX, textureY); // Box 427
		bodyModel[206] = new ModelRendererTurbo(this, 121, 261, textureX, textureY); // Box 428
		bodyModel[207] = new ModelRendererTurbo(this, 137, 261, textureX, textureY); // Box 429
		bodyModel[208] = new ModelRendererTurbo(this, 145, 261, textureX, textureY); // Box 430
		bodyModel[209] = new ModelRendererTurbo(this, 153, 261, textureX, textureY); // Box 431
		bodyModel[210] = new ModelRendererTurbo(this, 161, 261, textureX, textureY); // Box 432
		bodyModel[211] = new ModelRendererTurbo(this, 169, 261, textureX, textureY); // Box 433
		bodyModel[212] = new ModelRendererTurbo(this, 177, 261, textureX, textureY); // Box 434
		bodyModel[213] = new ModelRendererTurbo(this, 185, 261, textureX, textureY); // Box 435
		bodyModel[214] = new ModelRendererTurbo(this, 193, 261, textureX, textureY); // Box 436
		bodyModel[215] = new ModelRendererTurbo(this, 201, 261, textureX, textureY); // Box 437
		bodyModel[216] = new ModelRendererTurbo(this, 209, 261, textureX, textureY); // Box 438
		bodyModel[217] = new ModelRendererTurbo(this, 217, 261, textureX, textureY); // Box 439
		bodyModel[218] = new ModelRendererTurbo(this, 225, 261, textureX, textureY); // Box 440
		bodyModel[219] = new ModelRendererTurbo(this, 233, 261, textureX, textureY); // Box 441
		bodyModel[220] = new ModelRendererTurbo(this, 241, 261, textureX, textureY); // Box 442
		bodyModel[221] = new ModelRendererTurbo(this, 249, 261, textureX, textureY); // Box 443
		bodyModel[222] = new ModelRendererTurbo(this, 257, 261, textureX, textureY); // Box 444
		bodyModel[223] = new ModelRendererTurbo(this, 265, 261, textureX, textureY); // Box 445
		bodyModel[224] = new ModelRendererTurbo(this, 273, 261, textureX, textureY); // Box 446
		bodyModel[225] = new ModelRendererTurbo(this, 281, 261, textureX, textureY); // Box 447
		bodyModel[226] = new ModelRendererTurbo(this, 289, 261, textureX, textureY); // Box 448
		bodyModel[227] = new ModelRendererTurbo(this, 297, 261, textureX, textureY); // Box 449
		bodyModel[228] = new ModelRendererTurbo(this, 305, 261, textureX, textureY); // Box 450
		bodyModel[229] = new ModelRendererTurbo(this, 313, 261, textureX, textureY); // Box 451
		bodyModel[230] = new ModelRendererTurbo(this, 321, 261, textureX, textureY); // Box 452
		bodyModel[231] = new ModelRendererTurbo(this, 329, 261, textureX, textureY); // Box 453
		bodyModel[232] = new ModelRendererTurbo(this, 337, 261, textureX, textureY); // Box 454
		bodyModel[233] = new ModelRendererTurbo(this, 345, 261, textureX, textureY); // Box 455
		bodyModel[234] = new ModelRendererTurbo(this, 353, 261, textureX, textureY); // Box 456
		bodyModel[235] = new ModelRendererTurbo(this, 361, 261, textureX, textureY); // Box 457
		bodyModel[236] = new ModelRendererTurbo(this, 369, 261, textureX, textureY); // Box 458
		bodyModel[237] = new ModelRendererTurbo(this, 377, 261, textureX, textureY); // Box 459
		bodyModel[238] = new ModelRendererTurbo(this, 385, 261, textureX, textureY); // Box 460
		bodyModel[239] = new ModelRendererTurbo(this, 393, 261, textureX, textureY); // Box 461
		bodyModel[240] = new ModelRendererTurbo(this, 401, 261, textureX, textureY); // Box 462
		bodyModel[241] = new ModelRendererTurbo(this, 409, 261, textureX, textureY); // Box 463
		bodyModel[242] = new ModelRendererTurbo(this, 417, 261, textureX, textureY); // Box 464
		bodyModel[243] = new ModelRendererTurbo(this, 425, 261, textureX, textureY); // Box 465
		bodyModel[244] = new ModelRendererTurbo(this, 433, 261, textureX, textureY); // Box 466
		bodyModel[245] = new ModelRendererTurbo(this, 441, 261, textureX, textureY); // Box 467
		bodyModel[246] = new ModelRendererTurbo(this, 449, 261, textureX, textureY); // Box 468
		bodyModel[247] = new ModelRendererTurbo(this, 457, 261, textureX, textureY); // Box 469
		bodyModel[248] = new ModelRendererTurbo(this, 465, 261, textureX, textureY); // Box 470
		bodyModel[249] = new ModelRendererTurbo(this, 473, 261, textureX, textureY); // Box 471
		bodyModel[250] = new ModelRendererTurbo(this, 481, 261, textureX, textureY); // Box 472
		bodyModel[251] = new ModelRendererTurbo(this, 489, 261, textureX, textureY); // Box 473
		bodyModel[252] = new ModelRendererTurbo(this, 497, 261, textureX, textureY); // Box 474
		bodyModel[253] = new ModelRendererTurbo(this, 505, 261, textureX, textureY); // Box 475
		bodyModel[254] = new ModelRendererTurbo(this, 513, 261, textureX, textureY); // Box 476
		bodyModel[255] = new ModelRendererTurbo(this, 521, 261, textureX, textureY); // Box 477
		bodyModel[256] = new ModelRendererTurbo(this, 529, 261, textureX, textureY); // Box 478
		bodyModel[257] = new ModelRendererTurbo(this, 537, 261, textureX, textureY); // Box 480
		bodyModel[258] = new ModelRendererTurbo(this, 545, 261, textureX, textureY); // Box 481
		bodyModel[259] = new ModelRendererTurbo(this, 553, 261, textureX, textureY); // Box 482
		bodyModel[260] = new ModelRendererTurbo(this, 561, 261, textureX, textureY); // Box 483
		bodyModel[261] = new ModelRendererTurbo(this, 569, 261, textureX, textureY); // Box 484
		bodyModel[262] = new ModelRendererTurbo(this, 577, 261, textureX, textureY); // Box 485
		bodyModel[263] = new ModelRendererTurbo(this, 585, 261, textureX, textureY); // Box 486
		bodyModel[264] = new ModelRendererTurbo(this, 593, 261, textureX, textureY); // Box 487
		bodyModel[265] = new ModelRendererTurbo(this, 601, 261, textureX, textureY); // Box 488
		bodyModel[266] = new ModelRendererTurbo(this, 609, 261, textureX, textureY); // Box 489
		bodyModel[267] = new ModelRendererTurbo(this, 617, 261, textureX, textureY); // Box 460
		bodyModel[268] = new ModelRendererTurbo(this, 625, 261, textureX, textureY); // Box 461
		bodyModel[269] = new ModelRendererTurbo(this, 633, 261, textureX, textureY); // Box 462
		bodyModel[270] = new ModelRendererTurbo(this, 641, 261, textureX, textureY); // Box 463
		bodyModel[271] = new ModelRendererTurbo(this, 649, 261, textureX, textureY); // Box 464
		bodyModel[272] = new ModelRendererTurbo(this, 657, 261, textureX, textureY); // Box 465
		bodyModel[273] = new ModelRendererTurbo(this, 665, 261, textureX, textureY); // Box 466
		bodyModel[274] = new ModelRendererTurbo(this, 673, 261, textureX, textureY); // Box 467
		bodyModel[275] = new ModelRendererTurbo(this, 681, 261, textureX, textureY); // Box 468
		bodyModel[276] = new ModelRendererTurbo(this, 689, 261, textureX, textureY); // Box 469
		bodyModel[277] = new ModelRendererTurbo(this, 697, 261, textureX, textureY); // Box 470
		bodyModel[278] = new ModelRendererTurbo(this, 705, 261, textureX, textureY); // Box 471
		bodyModel[279] = new ModelRendererTurbo(this, 713, 261, textureX, textureY); // Box 472
		bodyModel[280] = new ModelRendererTurbo(this, 721, 261, textureX, textureY); // Box 473
		bodyModel[281] = new ModelRendererTurbo(this, 729, 261, textureX, textureY); // Box 474
		bodyModel[282] = new ModelRendererTurbo(this, 737, 261, textureX, textureY); // Box 475
		bodyModel[283] = new ModelRendererTurbo(this, 745, 261, textureX, textureY); // Box 476
		bodyModel[284] = new ModelRendererTurbo(this, 753, 261, textureX, textureY); // Box 477
		bodyModel[285] = new ModelRendererTurbo(this, 761, 261, textureX, textureY); // Box 478
		bodyModel[286] = new ModelRendererTurbo(this, 769, 261, textureX, textureY); // Box 479
		bodyModel[287] = new ModelRendererTurbo(this, 777, 261, textureX, textureY); // Box 480
		bodyModel[288] = new ModelRendererTurbo(this, 785, 261, textureX, textureY); // Box 481
		bodyModel[289] = new ModelRendererTurbo(this, 793, 261, textureX, textureY); // Box 482
		bodyModel[290] = new ModelRendererTurbo(this, 801, 261, textureX, textureY); // Box 483
		bodyModel[291] = new ModelRendererTurbo(this, 809, 261, textureX, textureY); // Box 484
		bodyModel[292] = new ModelRendererTurbo(this, 817, 261, textureX, textureY); // Box 485
		bodyModel[293] = new ModelRendererTurbo(this, 825, 261, textureX, textureY); // Box 486
		bodyModel[294] = new ModelRendererTurbo(this, 825, 261, textureX, textureY); // Box 487
		bodyModel[295] = new ModelRendererTurbo(this, 833, 261, textureX, textureY); // Box 462
		bodyModel[296] = new ModelRendererTurbo(this, 865, 261, textureX, textureY); // Box 463
		bodyModel[297] = new ModelRendererTurbo(this, 881, 261, textureX, textureY); // Box 465
		bodyModel[298] = new ModelRendererTurbo(this, 897, 261, textureX, textureY); // Box 466
		bodyModel[299] = new ModelRendererTurbo(this, 913, 261, textureX, textureY); // Box 467
		bodyModel[300] = new ModelRendererTurbo(this, 921, 261, textureX, textureY); // Box 468
		bodyModel[301] = new ModelRendererTurbo(this, 929, 261, textureX, textureY); // Box 469
		bodyModel[302] = new ModelRendererTurbo(this, 937, 261, textureX, textureY); // Box 470
		bodyModel[303] = new ModelRendererTurbo(this, 945, 261, textureX, textureY); // Box 471
		bodyModel[304] = new ModelRendererTurbo(this, 953, 261, textureX, textureY); // Box 472
		bodyModel[305] = new ModelRendererTurbo(this, 961, 261, textureX, textureY); // Box 512
		bodyModel[306] = new ModelRendererTurbo(this, 977, 261, textureX, textureY); // Box 513
		bodyModel[307] = new ModelRendererTurbo(this, 1001, 261, textureX, textureY); // Box 514
		bodyModel[308] = new ModelRendererTurbo(this, 1, 269, textureX, textureY); // Box 515
		bodyModel[309] = new ModelRendererTurbo(this, 161, 269, textureX, textureY); // Box 516
		bodyModel[310] = new ModelRendererTurbo(this, 177, 269, textureX, textureY); // Box 517
		bodyModel[311] = new ModelRendererTurbo(this, 89, 269, textureX, textureY); // Box 518
		bodyModel[312] = new ModelRendererTurbo(this, 1017, 261, textureX, textureY); // Box 262
		bodyModel[313] = new ModelRendererTurbo(this, 201, 269, textureX, textureY); // Box 263
		bodyModel[314] = new ModelRendererTurbo(this, 201, 269, textureX, textureY); // Box 239
		bodyModel[315] = new ModelRendererTurbo(this, 881, 261, textureX, textureY); // Box 240
		bodyModel[316] = new ModelRendererTurbo(this, 105, 269, textureX, textureY); // Box 241
		bodyModel[317] = new ModelRendererTurbo(this, 137, 269, textureX, textureY); // Box 242
		bodyModel[318] = new ModelRendererTurbo(this, 249, 269, textureX, textureY); // Box 243
		bodyModel[319] = new ModelRendererTurbo(this, 273, 269, textureX, textureY); // Box 244
		bodyModel[320] = new ModelRendererTurbo(this, 297, 269, textureX, textureY); // Box 245
		bodyModel[321] = new ModelRendererTurbo(this, 313, 269, textureX, textureY); // Box 246
		bodyModel[322] = new ModelRendererTurbo(this, 337, 269, textureX, textureY); // Box 247
		bodyModel[323] = new ModelRendererTurbo(this, 345, 269, textureX, textureY); // Box 248
		bodyModel[324] = new ModelRendererTurbo(this, 353, 269, textureX, textureY); // Box 250
		bodyModel[325] = new ModelRendererTurbo(this, 361, 269, textureX, textureY); // Box 251
		bodyModel[326] = new ModelRendererTurbo(this, 233, 269, textureX, textureY); // Box 252
		bodyModel[327] = new ModelRendererTurbo(this, 369, 269, textureX, textureY); // Box 253
		bodyModel[328] = new ModelRendererTurbo(this, 265, 269, textureX, textureY); // Box 962
		bodyModel[329] = new ModelRendererTurbo(this, 289, 269, textureX, textureY); // Box 964
		bodyModel[330] = new ModelRendererTurbo(this, 393, 269, textureX, textureY); // Box 966
		bodyModel[331] = new ModelRendererTurbo(this, 409, 269, textureX, textureY); // Box 601
		bodyModel[332] = new ModelRendererTurbo(this, 425, 269, textureX, textureY); // Box 602
		bodyModel[333] = new ModelRendererTurbo(this, 17, 269, textureX, textureY); // Box 603
		bodyModel[334] = new ModelRendererTurbo(this, 273, 269, textureX, textureY); // Box 604
		bodyModel[335] = new ModelRendererTurbo(this, 433, 269, textureX, textureY); // Box 967
		bodyModel[336] = new ModelRendererTurbo(this, 481, 269, textureX, textureY); // Box 968
		bodyModel[337] = new ModelRendererTurbo(this, 505, 269, textureX, textureY); // Box 287
		bodyModel[338] = new ModelRendererTurbo(this, 553, 269, textureX, textureY); // Box 288
		bodyModel[339] = new ModelRendererTurbo(this, 313, 269, textureX, textureY); // Box 259
		bodyModel[340] = new ModelRendererTurbo(this, 329, 269, textureX, textureY); // Box 260
		bodyModel[341] = new ModelRendererTurbo(this, 577, 269, textureX, textureY); // Box 256
		bodyModel[342] = new ModelRendererTurbo(this, 601, 269, textureX, textureY); // Box 249
		bodyModel[343] = new ModelRendererTurbo(this, 625, 269, textureX, textureY); // Box 254
		bodyModel[344] = new ModelRendererTurbo(this, 473, 269, textureX, textureY); // Box 263
		bodyModel[345] = new ModelRendererTurbo(this, 497, 269, textureX, textureY); // Box 264
		bodyModel[346] = new ModelRendererTurbo(this, 505, 269, textureX, textureY); // Box 265
		bodyModel[347] = new ModelRendererTurbo(this, 297, 269, textureX, textureY); // Box 266
		bodyModel[348] = new ModelRendererTurbo(this, 336, 87, textureX, textureY); // Box 814

		bodyModel[0].addShapeBox(0F, 0F, 0F, 22, 10, 6, 0F,0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -4F); // Box 0
		bodyModel[0].setRotationPoint(-37F, -60F, -17F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 22, 9, 5, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -3F); // Box 1
		bodyModel[1].setRotationPoint(-37F, -69F, -15F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 21, 10, 15, 0F,0F, 0F, -2F, 0F, -2F, -4F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[2].setRotationPoint(-15F, -60F, -15F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 21, 10, 13, 0F,0F, 0F, -2F, 0F, -3F, -5F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, -2F, 0F, 1F, 0F, 0F, -1F, 0F); // Box 3
		bodyModel[3].setRotationPoint(-15F, -69F, -13F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 21, 10, 11, 0F,0F, 0F, -5F, 0F, -3F, -7F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, -3F, 0F, 1F, 0F, 0F, -2F, 0F); // Box 4
		bodyModel[4].setRotationPoint(-15F, -77F, -11F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 6, 9, 5, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 5
		bodyModel[5].setRotationPoint(-43F, -69F, -15F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 6, 10, 4, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 6
		bodyModel[6].setRotationPoint(-43F, -60F, -17F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 29, 10, 17, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[7].setRotationPoint(-72F, -60F, -17F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 29, 9, 15, 0F,0F, -2F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[8].setRotationPoint(-72F, -69F, -15F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 29, 6, 11, 0F,0F, -3F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[9].setRotationPoint(-72F, -73F, -11F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 29, 4, 7, 0F,0F, -2F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[10].setRotationPoint(-72F, -74F, -7F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 6, 4, 5, 0F,0F, 0F, -3.9999F, -6F, 0F, -3.9999F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.9999F, 0F, 0F, -3.9999F); // Box 11
		bodyModel[11].setRotationPoint(-43F, -73F, -11F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 22, 11, 17, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[12].setRotationPoint(-37F, -50F, -17F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 6, 11, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[13].setRotationPoint(-43F, -50F, -17F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 29, 11, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[14].setRotationPoint(-72F, -50F, -17F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 21, 9, 15, 0F,0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[15].setRotationPoint(-15F, -50F, -15F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 22, 2, 16, 0F,0F, -1.9999F, 0F, 0F, 0F, -0.9999F, 0F, 0F, 0F, 0F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[16].setRotationPoint(-37F, -41F, -16F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 21, 4, 15, 0F,0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[17].setRotationPoint(-15F, -43F, -15F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 29, 4, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[18].setRotationPoint(-72F, -39F, -16F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 6, 4, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[19].setRotationPoint(-43F, -39F, -16F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 22, 4, 16, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[20].setRotationPoint(-37F, -39F, -16F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 21, 4, 14, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -4F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[21].setRotationPoint(-15F, -39F, -14F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 29, 5, 13, 0F,0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -6F, 0F, 0F, -5F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[22].setRotationPoint(-72F, -36F, -13F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 6, 5, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -5F, 0F, -1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[23].setRotationPoint(-43F, -35F, -13F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 22, 5, 13, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -5F, 0F, -1F, -6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[24].setRotationPoint(-37F, -35F, -13F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 21, 6, 12, 0F,0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -5F, 0F, -2F, -6F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[25].setRotationPoint(-15F, -36F, -12F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 21, 7, 6, 0F,0F, 0F, -4F, 0F, -5F, -4F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 44
		bodyModel[26].setRotationPoint(-15F, -81F, -6F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 2, 10, 7, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F); // Box 65
		bodyModel[27].setRotationPoint(-31F, -79F, -11F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 66
		bodyModel[28].setRotationPoint(-31F, -81F, -5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[29].setRotationPoint(-31F, -81F, -2F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 14, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.6F); // Box 68
		bodyModel[30].setRotationPoint(-29F, -79F, -6F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 9, 7, 0F,0F, 0F, -5.7F, 0F, 0F, -5.7F, 0F, 0F, -0.399999999999998F, 0F, 0F, -0.399999999999999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F); // Box 69
		bodyModel[31].setRotationPoint(-23F, -78F, -11F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F); // Box 70
		bodyModel[32].setRotationPoint(-33F, -79F, -5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, -2F, 0F, -1F, 0F, 0F, -1F, -1F, -1F, 0F, 0F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, -1F, 0F); // Box 71
		bodyModel[33].setRotationPoint(-37F, -80F, -5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		bodyModel[34].setRotationPoint(-37F, -80F, -3F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 6, 8, 5, 0F,0F, -7F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -7F, -4F, 0F, 0F, 0F, 0F, -7F, -4F, 0F, -7F, 0F, 0F, 0F, -4F); // Box 73
		bodyModel[35].setRotationPoint(-43F, -80F, -7F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 22, 10, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 107
		bodyModel[36].setRotationPoint(-37F, -60F, 11F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 22, 9, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 108
		bodyModel[37].setRotationPoint(-37F, -69F, 10F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 21, 10, 15, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -2F, 0F, 0F, 0F); // Box 109
		bodyModel[38].setRotationPoint(-15F, -60F, 0F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 21, 10, 13, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -5F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, -2F, 0F, -1F, 0F); // Box 110
		bodyModel[39].setRotationPoint(-15F, -69F, 0F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 21, 10, 11, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -7F, 0F, 0F, -5F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, -3F, 0F, -2F, 0F); // Box 111
		bodyModel[40].setRotationPoint(-15F, -77F, 0F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 6, 9, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[41].setRotationPoint(-43F, -69F, 10F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 6, 10, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[42].setRotationPoint(-43F, -60F, 13F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 29, 10, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[43].setRotationPoint(-72F, -60F, 0F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 29, 9, 15, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[44].setRotationPoint(-72F, -69F, 0F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 29, 6, 11, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -3F, -4F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[45].setRotationPoint(-72F, -73F, 0F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 29, 4, 7, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -2F, -4F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 117
		bodyModel[46].setRotationPoint(-72F, -74F, 0F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 6, 4, 5, 0F,0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -3.9999F, 0F, 0F, -3.9999F, 0F, 0F, -3.9999F, 0F, 0F, -3.9999F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		bodyModel[47].setRotationPoint(-43F, -73F, 6F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 22, 11, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, 0F, -1F); // Box 119
		bodyModel[48].setRotationPoint(-37F, -50F, 0F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 6, 11, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 120
		bodyModel[49].setRotationPoint(-43F, -50F, 0F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 29, 11, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 121
		bodyModel[50].setRotationPoint(-72F, -50F, 0F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 21, 9, 15, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, 0F, 0F); // Box 122
		bodyModel[51].setRotationPoint(-15F, -50F, 0F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 22, 2, 16, 0F,0F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9999F, 0F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9999F, 0F, 0F, 0F); // Box 127
		bodyModel[52].setRotationPoint(-37F, -41F, 0F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 21, 4, 15, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -1F); // Box 128
		bodyModel[53].setRotationPoint(-15F, -43F, 0F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 29, 4, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F); // Box 130
		bodyModel[54].setRotationPoint(-72F, -39F, 0F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 6, 4, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 131
		bodyModel[55].setRotationPoint(-43F, -39F, 0F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 22, 4, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -3F); // Box 132
		bodyModel[56].setRotationPoint(-37F, -39F, 0F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 21, 4, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -4F, 0F, 0F, -2F); // Box 133
		bodyModel[57].setRotationPoint(-15F, -39F, 0F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 29, 5, 13, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -5F, 0F, -1F, -6F); // Box 135
		bodyModel[58].setRotationPoint(-72F, -36F, 0F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 6, 5, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -5F, 0F, -1F, -5F); // Box 136
		bodyModel[59].setRotationPoint(-43F, -35F, 0F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 22, 5, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -6F, 0F, -1F, -5F); // Box 137
		bodyModel[60].setRotationPoint(-37F, -35F, 0F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 21, 6, 12, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, -6F, 0F, -1F, -5F); // Box 138
		bodyModel[61].setRotationPoint(-15F, -36F, 0F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 21, 7, 6, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, -4F, 0F, 0F, -4F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, 0F); // Box 150
		bodyModel[62].setRotationPoint(-15F, -81F, 0F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 2, 10, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		bodyModel[63].setRotationPoint(-31F, -79F, 4F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
		bodyModel[64].setRotationPoint(-31F, -81F, 1F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 173
		bodyModel[65].setRotationPoint(-31F, -81F, 0F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 14, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1.6F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.4F); // Box 174
		bodyModel[66].setRotationPoint(-29F, -79F, 3F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 9, 7, 0F,0F, 0F, -0.399999999999999F, 0F, 0F, -0.399999999999998F, 0F, 0F, -5.7F, 0F, 0F, -5.7F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
		bodyModel[67].setRotationPoint(-23F, -78F, 4F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F); // Box 176
		bodyModel[68].setRotationPoint(-33F, -79F, 4F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,-1F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, -2F, -1F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -2F); // Box 177
		bodyModel[69].setRotationPoint(-37F, -80F, 3F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		bodyModel[70].setRotationPoint(-37F, -80F, 0F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 6, 8, 5, 0F,0F, -7F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -7F, 0F, 0F, 0F, -4F, 0F, -7F, 0F, 0F, -7F, -4F, 0F, 0F, 0F); // Box 179
		bodyModel[71].setRotationPoint(-43F, -80F, 2F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 2, 17, 1, 0F,-0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
		bodyModel[72].setRotationPoint(1F, -93F, -0.5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 5, 1, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 262
		bodyModel[73].setRotationPoint(-43F, -64F, -12F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 6, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 255
		bodyModel[74].setRotationPoint(-38F, -69F, -10F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 2, 20, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 257
		bodyModel[75].setRotationPoint(-38F, -71F, -10F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0.5F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 258
		bodyModel[76].setRotationPoint(-38F, -72F, -9F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 213
		bodyModel[77].setRotationPoint(-37.8F, -69.3F, -4F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, -0.4F, -3F, 0F, -0.4F, -3F, 0F, -0.4F, -3F, 0F, -0.4F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 214
		bodyModel[78].setRotationPoint(-37.8F, -70.3F, -4F);

		bodyModel[79].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F); // Box 233
		bodyModel[79].setRotationPoint(-37.7F, -68.1F, 2.7F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F); // Box 234
		bodyModel[80].setRotationPoint(-37.6F, -69.1F, -0.9F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F); // Box 235
		bodyModel[81].setRotationPoint(-37.6F, -69.1F, -0.9F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F); // Box 236
		bodyModel[82].setRotationPoint(-37.6F, -69.1F, -0.9F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 237
		bodyModel[83].setRotationPoint(-37.6F, -68.1F, -0.9F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 238
		bodyModel[84].setRotationPoint(-37.6F, -68.1F, -0.9F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 239
		bodyModel[85].setRotationPoint(-37.6F, -68.1F, 0.0999999999999996F);

		bodyModel[86].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 240
		bodyModel[86].setRotationPoint(-37.7F, -68.1F, 0.0999999999999996F);
		bodyModel[86].rotateAngleX = 5.49778714F;

		bodyModel[87].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 241
		bodyModel[87].setRotationPoint(-37.7F, -68.1F, 0.0999999999999996F);

		bodyModel[88].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F); // Box 242
		bodyModel[88].setRotationPoint(-37.7F, -68.1F, 0.0999999999999996F);

		bodyModel[89].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 243
		bodyModel[89].setRotationPoint(-37.6F, -68.1F, 0.0999999999999996F);

		bodyModel[90].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 244
		bodyModel[90].setRotationPoint(-37.7F, -68.1F, 0.0999999999999996F);
		bodyModel[90].rotateAngleX = 3.14159265F;

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 248
		bodyModel[91].setRotationPoint(-37.6F, -69.1F, 0.0999999999999996F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 249
		bodyModel[92].setRotationPoint(-37.6F, -69.1F, 0.0999999999999996F);

		bodyModel[93].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 250
		bodyModel[93].setRotationPoint(-37.7F, -68.1F, 0.0999999999999996F);
		bodyModel[93].rotateAngleX = 4.71238898F;

		bodyModel[94].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 251
		bodyModel[94].setRotationPoint(-37.7F, -68.1F, 0.0999999999999996F);
		bodyModel[94].rotateAngleX = 3.92699082F;

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F); // Box 252
		bodyModel[95].setRotationPoint(-37.6F, -69.1F, 1.7F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F); // Box 253
		bodyModel[96].setRotationPoint(-37.6F, -69.1F, 1.7F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F); // Box 254
		bodyModel[97].setRotationPoint(-37.6F, -69.1F, 1.7F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 255
		bodyModel[98].setRotationPoint(-37.6F, -69.1F, 2.7F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 256
		bodyModel[99].setRotationPoint(-37.6F, -69.1F, 2.7F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 257
		bodyModel[100].setRotationPoint(-37.6F, -68.1F, 2.7F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 258
		bodyModel[101].setRotationPoint(-37.6F, -68.1F, 1.7F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 259
		bodyModel[102].setRotationPoint(-37.6F, -68.1F, 1.7F);

		bodyModel[103].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 260
		bodyModel[103].setRotationPoint(-37.7F, -68.1F, 2.7F);
		bodyModel[103].rotateAngleX = 3.92699082F;

		bodyModel[104].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 261
		bodyModel[104].setRotationPoint(-37.7F, -68.1F, 2.7F);
		bodyModel[104].rotateAngleX = 4.71238898F;

		bodyModel[105].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 262
		bodyModel[105].setRotationPoint(-37.7F, -68.1F, 2.7F);
		bodyModel[105].rotateAngleX = 5.49778714F;

		bodyModel[106].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 263
		bodyModel[106].setRotationPoint(-37.7F, -68.1F, 2.7F);

		bodyModel[107].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 265
		bodyModel[107].setRotationPoint(-37.6F, -68.1F, 2.7F);

		bodyModel[108].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 266
		bodyModel[108].setRotationPoint(-37.7F, -68.1F, 2.7F);
		bodyModel[108].rotateAngleX = 0.78539816F;

		bodyModel[109].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 267
		bodyModel[109].setRotationPoint(-37.7F, -68.1F, 2.7F);
		bodyModel[109].rotateAngleX = 1.57079633F;

		bodyModel[110].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 268
		bodyModel[110].setRotationPoint(-37.7F, -68.1F, 2.7F);
		bodyModel[110].rotateAngleX = 2.35619449F;

		bodyModel[111].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 269
		bodyModel[111].setRotationPoint(-37.7F, -68.1F, 2.7F);
		bodyModel[111].rotateAngleX = 3.14159265F;

		bodyModel[112].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.45F, 0.3F, 0F, -0.45F, 0.3F, 0F, -0.45F, 0.3F, 0F, -0.45F, 0.3F, 0F, -0.45F, 0.3F, 0F, -0.45F, 0.3F, 0F, -0.45F, 0.3F, 0F, -0.45F, 0.3F); // Box 270
		bodyModel[112].setRotationPoint(-37.7F, -68.1F, 0.0999999999999996F);
		bodyModel[112].rotateAngleX = -0.38397244F;

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F); // Box 271
		bodyModel[113].setRotationPoint(-37.7F, -68.9F, -0.9F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, -0.9F, 0F, -0.5F, -0.9F, 0F, -0.5F, -0.9F, 0F, -0.5F, -0.9F); // Box 272
		bodyModel[114].setRotationPoint(-37.7F, -68.7F, -0.9F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 273
		bodyModel[115].setRotationPoint(-37.6F, -65.5F, -3.7F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 274
		bodyModel[116].setRotationPoint(-37.6F, -65.5F, -3.7F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F); // Box 275
		bodyModel[117].setRotationPoint(-37.6F, -66.5F, -3.7F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F); // Box 276
		bodyModel[118].setRotationPoint(-37.6F, -66.5F, -3.7F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F); // Box 277
		bodyModel[119].setRotationPoint(-37.6F, -66.5F, -3.7F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 278
		bodyModel[120].setRotationPoint(-37.6F, -66.5F, -2.7F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 279
		bodyModel[121].setRotationPoint(-37.6F, -66.5F, -2.7F);

		bodyModel[122].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 280
		bodyModel[122].setRotationPoint(-37.7F, -65.5F, -2.7F);
		bodyModel[122].rotateAngleX = 0.78539816F;

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 281
		bodyModel[123].setRotationPoint(-37.6F, -65.5F, -2.7F);

		bodyModel[124].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 282
		bodyModel[124].setRotationPoint(-37.7F, -65.5F, -2.7F);
		bodyModel[124].rotateAngleX = 5.49778714F;

		bodyModel[125].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 283
		bodyModel[125].setRotationPoint(-37.7F, -65.5F, -2.7F);

		bodyModel[126].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 284
		bodyModel[126].setRotationPoint(-37.7F, -65.5F, -2.7F);
		bodyModel[126].rotateAngleX = 1.57079633F;

		bodyModel[127].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 285
		bodyModel[127].setRotationPoint(-37.7F, -65.5F, -2.7F);
		bodyModel[127].rotateAngleX = 2.35619449F;

		bodyModel[128].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 286
		bodyModel[128].setRotationPoint(-37.7F, -65.5F, -2.7F);
		bodyModel[128].rotateAngleX = 3.14159265F;

		bodyModel[129].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 287
		bodyModel[129].setRotationPoint(-37.6F, -65.5F, -2.7F);

		bodyModel[130].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F); // Box 288
		bodyModel[130].setRotationPoint(-37.7F, -65.5F, -2.7F);
		bodyModel[130].rotateAngleX = -3.90953752F;

		bodyModel[131].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 289
		bodyModel[131].setRotationPoint(-37.7F, -65.5F, -2.7F);
		bodyModel[131].rotateAngleX = 4.71238898F;

		bodyModel[132].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 290
		bodyModel[132].setRotationPoint(-37.7F, -65.5F, -2.7F);
		bodyModel[132].rotateAngleX = 3.92699082F;

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 318
		bodyModel[133].setRotationPoint(-37.8F, -68.1F, 4.8F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 319
		bodyModel[134].setRotationPoint(-37.8F, -68.1F, 4.8F);

		bodyModel[135].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 320
		bodyModel[135].setRotationPoint(-37.9F, -68.1F, 5.8F);
		bodyModel[135].rotateAngleX = 3.92699082F;

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F); // Box 321
		bodyModel[136].setRotationPoint(-37.8F, -69.1F, 4.8F);

		bodyModel[137].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 322
		bodyModel[137].setRotationPoint(-37.9F, -68.1F, 5.8F);
		bodyModel[137].rotateAngleX = 3.14159265F;

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F); // Box 323
		bodyModel[138].setRotationPoint(-37.8F, -69.1F, 4.8F);

		bodyModel[139].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 324
		bodyModel[139].setRotationPoint(-37.9F, -68.1F, 5.8F);
		bodyModel[139].rotateAngleX = 2.35619449F;

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F); // Box 325
		bodyModel[140].setRotationPoint(-37.8F, -69.1F, 4.8F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 326
		bodyModel[141].setRotationPoint(-37.8F, -69.1F, 5.8F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 327
		bodyModel[142].setRotationPoint(-37.8F, -69.1F, 5.8F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 328
		bodyModel[143].setRotationPoint(-37.8F, -68.1F, 5.8F);

		bodyModel[144].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 329
		bodyModel[144].setRotationPoint(-37.9F, -68.1F, 5.8F);
		bodyModel[144].rotateAngleX = 5.49778714F;

		bodyModel[145].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 330
		bodyModel[145].setRotationPoint(-37.9F, -68.1F, 5.8F);

		bodyModel[146].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 331
		bodyModel[146].setRotationPoint(-37.9F, -68.1F, 5.8F);
		bodyModel[146].rotateAngleX = 0.78539816F;

		bodyModel[147].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 332
		bodyModel[147].setRotationPoint(-37.9F, -68.1F, 5.8F);
		bodyModel[147].rotateAngleX = 1.57079633F;

		bodyModel[148].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F); // Box 333
		bodyModel[148].setRotationPoint(-37.9F, -68.1F, 5.8F);
		bodyModel[148].rotateAngleX = -3.90953752F;

		bodyModel[149].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 334
		bodyModel[149].setRotationPoint(-37.8F, -68.1F, 5.8F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 340
		bodyModel[150].setRotationPoint(-37.8F, -71.6F, 4.4F);

		bodyModel[151].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F); // Box 341
		bodyModel[151].setRotationPoint(-37.9F, -70.6F, 4.4F);
		bodyModel[151].rotateAngleX = -1.57079633F;

		bodyModel[152].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 342
		bodyModel[152].setRotationPoint(-37.8F, -70.6F, 4.4F);

		bodyModel[153].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 343
		bodyModel[153].setRotationPoint(-37.9F, -70.6F, 4.4F);
		bodyModel[153].rotateAngleX = 5.49778714F;

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 344
		bodyModel[154].setRotationPoint(-37.8F, -70.6F, 4.4F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 345
		bodyModel[155].setRotationPoint(-37.8F, -70.6F, 3.4F);

		bodyModel[156].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 346
		bodyModel[156].setRotationPoint(-37.9F, -70.6F, 4.4F);
		bodyModel[156].rotateAngleX = 4.71238898F;

		bodyModel[157].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 347
		bodyModel[157].setRotationPoint(-37.9F, -70.6F, 4.4F);
		bodyModel[157].rotateAngleX = 3.92699082F;

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 348
		bodyModel[158].setRotationPoint(-37.8F, -70.6F, 3.4F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F); // Box 349
		bodyModel[159].setRotationPoint(-37.8F, -71.6F, 3.4F);

		bodyModel[160].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 350
		bodyModel[160].setRotationPoint(-37.9F, -70.6F, 4.4F);
		bodyModel[160].rotateAngleX = 3.14159265F;

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F); // Box 351
		bodyModel[161].setRotationPoint(-37.8F, -71.6F, 3.4F);

		bodyModel[162].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 352
		bodyModel[162].setRotationPoint(-37.9F, -70.6F, 4.4F);
		bodyModel[162].rotateAngleX = 2.35619449F;

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F); // Box 353
		bodyModel[163].setRotationPoint(-37.8F, -71.6F, 3.4F);

		bodyModel[164].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 354
		bodyModel[164].setRotationPoint(-37.9F, -70.6F, 4.4F);
		bodyModel[164].rotateAngleX = 1.57079633F;

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 355
		bodyModel[165].setRotationPoint(-37.8F, -71.6F, 4.4F);

		bodyModel[166].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 356
		bodyModel[166].setRotationPoint(-37.9F, -70.6F, 4.4F);
		bodyModel[166].rotateAngleX = 0.78539816F;

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 387
		bodyModel[167].setRotationPoint(-37.8F, -68.6F, -6.3F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F); // Box 388
		bodyModel[168].setRotationPoint(-37.8F, -68.6F, -7.3F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 390
		bodyModel[169].setRotationPoint(-37.8F, -68.6F, -6.3F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F); // Box 391
		bodyModel[170].setRotationPoint(-37.8F, -68.6F, -7.3F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 392
		bodyModel[171].setRotationPoint(-37.8F, -67.6F, -7.3F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 393
		bodyModel[172].setRotationPoint(-37.8F, -67.6F, -7.3F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 394
		bodyModel[173].setRotationPoint(-37.8F, -67.6F, -6.3F);

		bodyModel[174].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 395
		bodyModel[174].setRotationPoint(-37.8F, -68.2F, -6.3F);

		bodyModel[175].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, 0F, 0F, -0.48F, 0F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, 0F, 0F, -0.48F, 0F); // Box 396
		bodyModel[175].setRotationPoint(-37.9F, -68.2F, -6.3F);
		bodyModel[175].rotateAngleX = -1.29154365F;

		bodyModel[176].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 397
		bodyModel[176].setRotationPoint(-37.9F, -67.6F, -6.3F);
		bodyModel[176].rotateAngleX = 3.14159265F;

		bodyModel[177].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 398
		bodyModel[177].setRotationPoint(-37.9F, -67.6F, -6.3F);
		bodyModel[177].rotateAngleX = 3.92699082F;

		bodyModel[178].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 399
		bodyModel[178].setRotationPoint(-37.9F, -67.6F, -6.3F);
		bodyModel[178].rotateAngleX = 5.49778714F;

		bodyModel[179].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 400
		bodyModel[179].setRotationPoint(-37.9F, -67.6F, -6.3F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F); // Box 401
		bodyModel[180].setRotationPoint(-37.7F, -68.8F, -7.3F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F); // Box 402
		bodyModel[181].setRotationPoint(-37.6F, -69.1F, -3.7F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F); // Box 403
		bodyModel[182].setRotationPoint(-37.6F, -69.1F, -3.7F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F); // Box 404
		bodyModel[183].setRotationPoint(-37.6F, -69.1F, -3.7F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 405
		bodyModel[184].setRotationPoint(-37.6F, -69.1F, -2.7F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 406
		bodyModel[185].setRotationPoint(-37.6F, -69.1F, -2.7F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 407
		bodyModel[186].setRotationPoint(-37.6F, -68.1F, -2.7F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 408
		bodyModel[187].setRotationPoint(-37.6F, -68.1F, -3.7F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 409
		bodyModel[188].setRotationPoint(-37.6F, -68.1F, -3.7F);

		bodyModel[189].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 410
		bodyModel[189].setRotationPoint(-37.7F, -68.1F, -2.7F);
		bodyModel[189].rotateAngleX = 3.92699082F;

		bodyModel[190].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 411
		bodyModel[190].setRotationPoint(-37.7F, -68.1F, -2.7F);
		bodyModel[190].rotateAngleX = 3.14159265F;

		bodyModel[191].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 412
		bodyModel[191].setRotationPoint(-37.7F, -68.1F, -2.7F);
		bodyModel[191].rotateAngleX = 2.35619449F;

		bodyModel[192].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 413
		bodyModel[192].setRotationPoint(-37.7F, -68.1F, -2.7F);
		bodyModel[192].rotateAngleX = 1.57079633F;

		bodyModel[193].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 414
		bodyModel[193].setRotationPoint(-37.7F, -68.1F, -2.7F);
		bodyModel[193].rotateAngleX = 0.78539816F;

		bodyModel[194].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 415
		bodyModel[194].setRotationPoint(-37.7F, -68.1F, -2.7F);

		bodyModel[195].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 416
		bodyModel[195].setRotationPoint(-37.7F, -68.1F, -2.7F);
		bodyModel[195].rotateAngleX = 5.49778714F;

		bodyModel[196].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 417
		bodyModel[196].setRotationPoint(-37.7F, -68.1F, -2.7F);
		bodyModel[196].rotateAngleX = 4.71238898F;

		bodyModel[197].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 418
		bodyModel[197].setRotationPoint(-37.6F, -68.1F, -2.7F);

		bodyModel[198].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F); // Box 419
		bodyModel[198].setRotationPoint(-37.7F, -68.1F, -2.7F);
		bodyModel[198].rotateAngleX = -1.57079633F;

		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 421
		bodyModel[199].setRotationPoint(-37.6F, -66.1F, -1.1F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 422
		bodyModel[200].setRotationPoint(-37.6F, -66.1F, -1.1F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F); // Box 423
		bodyModel[201].setRotationPoint(-37.6F, -66.1F, -1.1F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F); // Box 424
		bodyModel[202].setRotationPoint(-37.6F, -66.1F, -1.1F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F); // Box 425
		bodyModel[203].setRotationPoint(-37.6F, -66.1F, -1.1F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F); // Box 426
		bodyModel[204].setRotationPoint(-37.6F, -66.1F, -1.1F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F); // Box 427
		bodyModel[205].setRotationPoint(-37.6F, -66.1F, -1.1F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 428
		bodyModel[206].setRotationPoint(-37.6F, -66.1F, -1.1F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 429
		bodyModel[207].setRotationPoint(-37.8F, -71.6F, -4.4F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 430
		bodyModel[208].setRotationPoint(-37.8F, -71.6F, -4.4F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F); // Box 431
		bodyModel[209].setRotationPoint(-37.8F, -71.6F, -5.4F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F); // Box 432
		bodyModel[210].setRotationPoint(-37.8F, -71.6F, -5.4F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F); // Box 433
		bodyModel[211].setRotationPoint(-37.8F, -71.6F, -5.4F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 434
		bodyModel[212].setRotationPoint(-37.8F, -70.6F, -5.4F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 435
		bodyModel[213].setRotationPoint(-37.8F, -70.6F, -5.4F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 436
		bodyModel[214].setRotationPoint(-37.8F, -70.6F, -4.4F);

		bodyModel[215].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 437
		bodyModel[215].setRotationPoint(-37.9F, -70.6F, -4.4F);
		bodyModel[215].rotateAngleX = 5.49778714F;

		bodyModel[216].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 438
		bodyModel[216].setRotationPoint(-37.9F, -70.6F, -4.4F);

		bodyModel[217].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 439
		bodyModel[217].setRotationPoint(-37.9F, -70.6F, -4.4F);
		bodyModel[217].rotateAngleX = 0.78539816F;

		bodyModel[218].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 440
		bodyModel[218].setRotationPoint(-37.9F, -70.6F, -4.4F);
		bodyModel[218].rotateAngleX = 1.57079633F;

		bodyModel[219].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 441
		bodyModel[219].setRotationPoint(-37.9F, -70.6F, -4.4F);
		bodyModel[219].rotateAngleX = 2.35619449F;

		bodyModel[220].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 442
		bodyModel[220].setRotationPoint(-37.9F, -70.6F, -4.4F);
		bodyModel[220].rotateAngleX = 3.14159265F;

		bodyModel[221].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 443
		bodyModel[221].setRotationPoint(-37.9F, -70.6F, -4.4F);
		bodyModel[221].rotateAngleX = 3.92699082F;

		bodyModel[222].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 444
		bodyModel[222].setRotationPoint(-37.9F, -70.6F, -4.4F);
		bodyModel[222].rotateAngleX = 4.71238898F;

		bodyModel[223].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 445
		bodyModel[223].setRotationPoint(-37.8F, -70.6F, -4.4F);

		bodyModel[224].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, 0F, 0F, -0.48F, 0F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, 0F, 0F, -0.48F, 0F); // Box 446
		bodyModel[224].setRotationPoint(-37.9F, -70.6F, -4.4F);
		bodyModel[224].rotateAngleX = -4.36332313F;

		bodyModel[225].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, 0F, 0F, -0.48F, 0F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, 0F, 0F, -0.48F, 0F); // Box 447
		bodyModel[225].setRotationPoint(-37.9F, -70.6F, -4.4F);
		bodyModel[225].rotateAngleX = -1.32645023F;

		bodyModel[226].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 448
		bodyModel[226].setRotationPoint(-37.8F, -65.5F, 3.5F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F); // Box 449
		bodyModel[227].setRotationPoint(-37.8F, -66F, 3F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F); // Box 450
		bodyModel[228].setRotationPoint(-37.8F, -66F, 3F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F); // Box 451
		bodyModel[229].setRotationPoint(-37.8F, -66F, 3F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F); // Box 452
		bodyModel[230].setRotationPoint(-37.8F, -66F, 3F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F); // Box 453
		bodyModel[231].setRotationPoint(-37.8F, -66F, 3F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 454
		bodyModel[232].setRotationPoint(-37.8F, -66F, 3F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 455
		bodyModel[233].setRotationPoint(-37.8F, -66F, 3F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 456
		bodyModel[234].setRotationPoint(-37.8F, -66F, 3F);

		bodyModel[235].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F); // Box 457
		bodyModel[235].setRotationPoint(-37.9F, -65.5F, 3.5F);
		bodyModel[235].rotateAngleX = -1.57079633F;

		bodyModel[236].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F); // Box 458
		bodyModel[236].setRotationPoint(-37.7F, -65.6F, 1.5F);
		bodyModel[236].rotateAngleX = -1.57079633F;

		bodyModel[237].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 459
		bodyModel[237].setRotationPoint(-37.6F, -65.6F, 1.5F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F); // Box 460
		bodyModel[238].setRotationPoint(-37.6F, -66.1F, 1F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F); // Box 461
		bodyModel[239].setRotationPoint(-37.6F, -66.1F, 1F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F); // Box 462
		bodyModel[240].setRotationPoint(-37.6F, -66.1F, 1F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 463
		bodyModel[241].setRotationPoint(-37.6F, -66.1F, 1F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 464
		bodyModel[242].setRotationPoint(-37.6F, -66.1F, 1F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 465
		bodyModel[243].setRotationPoint(-37.6F, -66.1F, 1F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F); // Box 466
		bodyModel[244].setRotationPoint(-37.6F, -66.1F, 1F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F); // Box 467
		bodyModel[245].setRotationPoint(-37.6F, -66.1F, 1F);

		bodyModel[246].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F); // Box 468
		bodyModel[246].setRotationPoint(-37.9F, -71F, 2F);
		bodyModel[246].rotateAngleX = 1.57079633F;

		bodyModel[247].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 469
		bodyModel[247].setRotationPoint(-37.8F, -71F, 2F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F); // Box 470
		bodyModel[248].setRotationPoint(-37.8F, -71.5F, 1.5F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F); // Box 471
		bodyModel[249].setRotationPoint(-37.8F, -71.5F, 1.5F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F); // Box 472
		bodyModel[250].setRotationPoint(-37.8F, -71.5F, 1.5F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 473
		bodyModel[251].setRotationPoint(-37.8F, -71.5F, 1.5F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 474
		bodyModel[252].setRotationPoint(-37.8F, -71.5F, 1.5F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 475
		bodyModel[253].setRotationPoint(-37.8F, -71.5F, 1.5F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F); // Box 476
		bodyModel[254].setRotationPoint(-37.8F, -71.5F, 1.5F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F); // Box 477
		bodyModel[255].setRotationPoint(-37.8F, -71.5F, 1.5F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F); // Box 478
		bodyModel[256].setRotationPoint(-37.8F, -66F, -6.5F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F); // Box 480
		bodyModel[257].setRotationPoint(-37.8F, -66F, -6.5F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F); // Box 481
		bodyModel[258].setRotationPoint(-37.8F, -66F, -6.5F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F); // Box 482
		bodyModel[259].setRotationPoint(-37.8F, -66F, -6.5F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F); // Box 483
		bodyModel[260].setRotationPoint(-37.8F, -66F, -6.5F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 484
		bodyModel[261].setRotationPoint(-37.8F, -66F, -6.5F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 485
		bodyModel[262].setRotationPoint(-37.8F, -66F, -6.5F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 486
		bodyModel[263].setRotationPoint(-37.8F, -66F, -6.5F);

		bodyModel[264].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, 0F, 0F, -0.48F, 0F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, 0F, 0F, -0.48F, 0F); // Box 487
		bodyModel[264].setRotationPoint(-37.9F, -65.5F, -6.6F);
		bodyModel[264].rotateAngleX = -0.38397244F;

		bodyModel[265].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 488
		bodyModel[265].setRotationPoint(-37.8F, -63.3F, -1.6F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 489
		bodyModel[266].setRotationPoint(-37.8F, -63.3F, 0.4F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F); // Box 460
		bodyModel[267].setRotationPoint(-37.8F, -66.5F, 4.8F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 461
		bodyModel[268].setRotationPoint(-37.8F, -66.5F, 5.8F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 462
		bodyModel[269].setRotationPoint(-37.8F, -65.5F, 5.8F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 463
		bodyModel[270].setRotationPoint(-37.8F, -65.5F, 4.8F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 464
		bodyModel[271].setRotationPoint(-37.8F, -65.5F, 4.8F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F); // Box 465
		bodyModel[272].setRotationPoint(-37.8F, -66.5F, 4.8F);

		bodyModel[273].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 466
		bodyModel[273].setRotationPoint(-37.9F, -65.5F, 5.8F);
		bodyModel[273].rotateAngleX = 3.14159265F;

		bodyModel[274].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F); // Box 467
		bodyModel[274].setRotationPoint(-37.8F, -66.5F, 4.8F);

		bodyModel[275].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F); // Box 468
		bodyModel[275].setRotationPoint(-37.9F, -65.5F, 5.8F);
		bodyModel[275].rotateAngleX = -3.90953752F;

		bodyModel[276].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 469
		bodyModel[276].setRotationPoint(-37.8F, -65.5F, 5.8F);

		bodyModel[277].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 470
		bodyModel[277].setRotationPoint(-37.9F, -65.5F, 5.8F);
		bodyModel[277].rotateAngleX = 3.92699082F;

		bodyModel[278].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 471
		bodyModel[278].setRotationPoint(-37.9F, -65.5F, 5.8F);
		bodyModel[278].rotateAngleX = 5.49778714F;

		bodyModel[279].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 472
		bodyModel[279].setRotationPoint(-37.9F, -65.5F, 5.8F);

		bodyModel[280].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 473
		bodyModel[280].setRotationPoint(-37.9F, -65.5F, 5.8F);
		bodyModel[280].rotateAngleX = 0.78539816F;

		bodyModel[281].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 474
		bodyModel[281].setRotationPoint(-37.9F, -65.5F, 5.8F);
		bodyModel[281].rotateAngleX = 1.57079633F;

		bodyModel[282].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 475
		bodyModel[282].setRotationPoint(-37.9F, -65.5F, 5.8F);
		bodyModel[282].rotateAngleX = 2.35619449F;

		bodyModel[283].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 476
		bodyModel[283].setRotationPoint(-37.8F, -66.5F, 5.8F);

		bodyModel[284].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F); // Box 477
		bodyModel[284].setRotationPoint(-37.9F, -70.5F, -2F);
		bodyModel[284].rotateAngleX = 1.57079633F;

		bodyModel[285].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 478
		bodyModel[285].setRotationPoint(-37.8F, -71F, -2F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 479
		bodyModel[286].setRotationPoint(-37.8F, -71.5F, -2.5F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 480
		bodyModel[287].setRotationPoint(-37.8F, -71.5F, -2.5F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F); // Box 481
		bodyModel[288].setRotationPoint(-37.8F, -71.5F, -2.5F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F); // Box 482
		bodyModel[289].setRotationPoint(-37.8F, -71.5F, -2.5F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F); // Box 483
		bodyModel[290].setRotationPoint(-37.8F, -71.5F, -2.5F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F); // Box 484
		bodyModel[291].setRotationPoint(-37.8F, -71.5F, -2.5F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F); // Box 485
		bodyModel[292].setRotationPoint(-37.8F, -71.5F, -2.5F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 486
		bodyModel[293].setRotationPoint(-37.8F, -71.5F, -2.5F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 487
		bodyModel[294].setRotationPoint(-37.8F, -66.8F, -4F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 7, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 462
		bodyModel[295].setRotationPoint(-43F, -73F, -6F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, -2F, 0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 2F, 2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 463
		bodyModel[296].setRotationPoint(-40F, -73F, -9F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 465
		bodyModel[297].setRotationPoint(-37.5F, -73.5F, -1F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, 0F); // Box 466
		bodyModel[298].setRotationPoint(-37.5F, -74F, -1F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 467
		bodyModel[299].setRotationPoint(-36F, -74.25F, -1F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 468
		bodyModel[300].setRotationPoint(-36F, -73.25F, -1F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.6F, -0.25F, 0F); // Box 469
		bodyModel[301].setRotationPoint(-36.1F, -72.75F, -1F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.7F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.5F, 0F, -0.7F, -0.5F, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 470
		bodyModel[302].setRotationPoint(-37.5F, -75F, -1F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.7F, -0.5F, -0.3F, -0.2F, -0.5F, -0.3F, -0.2F, -0.3F, 0F, -0.7F, -0.3F, 0F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 471
		bodyModel[303].setRotationPoint(-37.5F, -75F, 0F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.1F); // Box 472
		bodyModel[304].setRotationPoint(-35.7F, -74F, -1F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,-2F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 512
		bodyModel[305].setRotationPoint(-43F, -73F, -9F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1F, 0F, -1.5F); // Box 513
		bodyModel[306].setRotationPoint(-41F, -71F, -10F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 514
		bodyModel[307].setRotationPoint(-40F, -69F, -10F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 2F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 2F, 2F, 0F, 0F, 2F, 0F); // Box 515
		bodyModel[308].setRotationPoint(-40F, -73F, 6F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 516
		bodyModel[309].setRotationPoint(-43F, -73F, 6F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 517
		bodyModel[310].setRotationPoint(-41F, -71F, 8F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 518
		bodyModel[311].setRotationPoint(-40F, -69F, 9F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 1, 6, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 262
		bodyModel[312].setRotationPoint(-38F, -69F, -12F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 1, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 263
		bodyModel[313].setRotationPoint(-38F, -69F, 10F);

		bodyModel[314].addShapeBox(0F, 1F, 0F, 10, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
		bodyModel[314].setRotationPoint(-27F, -54F, -5F);
		bodyModel[314].rotateAngleZ = -0.10471976F;

		bodyModel[315].addShapeBox(9F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		bodyModel[315].setRotationPoint(-27F, -54F, -5F);
		bodyModel[315].rotateAngleZ = -0.10471976F;

		bodyModel[316].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		bodyModel[316].setRotationPoint(-27F, -54F, -5F);
		bodyModel[316].rotateAngleZ = -0.10471976F;

		bodyModel[317].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		bodyModel[317].setRotationPoint(-27F, -54F, 4F);
		bodyModel[317].rotateAngleZ = -0.10471976F;

		bodyModel[318].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		bodyModel[318].setRotationPoint(-27F, -54F, -5F);
		bodyModel[318].rotateAngleZ = -0.10471976F;

		bodyModel[319].addShapeBox(0F, 0F, 0F, 1, 19, 10, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		bodyModel[319].setRotationPoint(-18F, -72F, -5F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[320].setRotationPoint(-16F, -76F, -3F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 1, 19, 8, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 246
		bodyModel[321].setRotationPoint(-19F, -71F, -4F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 1, 19, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[322].setRotationPoint(-19.3F, -71.3F, -2F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 1, 19, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[323].setRotationPoint(-19.3F, -71.3F, 1F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[324].setRotationPoint(-17F, -65F, -4F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 251
		bodyModel[325].setRotationPoint(-17F, -65F, 3F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[326].setRotationPoint(-24F, -53F, -6F);
		bodyModel[326].rotateAngleZ = 0.78539816F;

		bodyModel[327].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 253
		bodyModel[327].setRotationPoint(-24F, -53F, 5F);
		bodyModel[327].rotateAngleZ = 0.78539816F;

		bodyModel[328].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 962
		bodyModel[328].setRotationPoint(-16.5F, -75.5F, -1.5F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 964
		bodyModel[329].setRotationPoint(-16.5F, -74.5F, -1.5F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 966
		bodyModel[330].setRotationPoint(-16.5F, -73.5F, -1.5F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 601
		bodyModel[331].setRotationPoint(-31F, -66.3F, -11F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 602
		bodyModel[332].setRotationPoint(-30.5F, -64.3F, -11.5F);

		bodyModel[333].addShapeBox(-1F, -2F, 0F, 1, 2, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 603
		bodyModel[333].setRotationPoint(-29.5F, -64.3F, -10.7F);
		bodyModel[333].rotateAngleZ = 0.36651914F;

		bodyModel[334].addShapeBox(-1F, -2F, 0F, 1, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 604
		bodyModel[334].setRotationPoint(-29.5F, -64.3F, -10.2F);
		bodyModel[334].rotateAngleZ = 0.36651914F;

		bodyModel[335].addShapeBox(0F, 0F, 0F, 15, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 967
		bodyModel[335].setRotationPoint(-29.5F, -57.3F, -13.5F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 1, 8, 8, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 968
		bodyModel[336].setRotationPoint(-30.5F, -57.3F, -13.5F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 15, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 287
		bodyModel[337].setRotationPoint(-29.5F, -57.3F, 5.5F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 1, 8, 8, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 288
		bodyModel[338].setRotationPoint(-30.5F, -57.3F, 5.5F);

		bodyModel[339].addShapeBox(0F, -3F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 259
		bodyModel[339].setRotationPoint(-43F, -51F, -6F);
		bodyModel[339].rotateAngleZ = 0.15707963F;

		bodyModel[340].addShapeBox(0F, -3F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
		bodyModel[340].setRotationPoint(-43F, -51F, 4F);
		bodyModel[340].rotateAngleZ = 0.15707963F;

		bodyModel[341].addShapeBox(0F, 0F, 0F, 5, 13, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 256
		bodyModel[341].setRotationPoint(-43F, -63F, -2F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[342].setRotationPoint(-37F, -52F, -2F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 7, 3, 3, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 254
		bodyModel[343].setRotationPoint(-37F, -53F, -1.5F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 263
		bodyModel[344].setRotationPoint(-35.5F, -56F, -1F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 264
		bodyModel[345].setRotationPoint(-35F, -60F, -0.5F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 265
		bodyModel[346].setRotationPoint(-35F, -62F, -0.5F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 266
		bodyModel[347].setRotationPoint(-34.7F, -62.1F, -0.5F);

		bodyModel[348].addShapeBox(0F, -2F, -1F, 0, 75, 75, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -73F, 0F, 0F, -73F, 0F, -73F, 0F, 0F, -73F, 0F, 0F, -73F, -73F, 0F, -73F, -73F); // Box 814
		bodyModel[348].setRotationPoint(-36.5F, -74.5F, 0F);
		bodyModel[348].rotateAngleZ = -0.29670597F;
	}

	private void initnoseModel_1()
	{
		noseModel[0] = new ModelRendererTurbo(this, 1, 964, textureX, textureY); // Box 34
		noseModel[1] = new ModelRendererTurbo(this, 57, 964, textureX, textureY); // Box 35
		noseModel[2] = new ModelRendererTurbo(this, 113, 964, textureX, textureY); // Box 36
		noseModel[3] = new ModelRendererTurbo(this, 161, 964, textureX, textureY); // Box 37
		noseModel[4] = new ModelRendererTurbo(this, 241, 964, textureX, textureY); // Box 38
		noseModel[5] = new ModelRendererTurbo(this, 321, 964, textureX, textureY); // Box 39
		noseModel[6] = new ModelRendererTurbo(this, 393, 964, textureX, textureY); // Box 40
		noseModel[7] = new ModelRendererTurbo(this, 433, 964, textureX, textureY); // Box 41
		noseModel[8] = new ModelRendererTurbo(this, 41, 964, textureX, textureY); // Box 42
		noseModel[9] = new ModelRendererTurbo(this, 489, 964, textureX, textureY); // Box 43
		noseModel[10] = new ModelRendererTurbo(this, 529, 964, textureX, textureY); // Box 46
		noseModel[11] = new ModelRendererTurbo(this, 585, 964, textureX, textureY); // Box 47
		noseModel[12] = new ModelRendererTurbo(this, 665, 964, textureX, textureY); // Box 48
		noseModel[13] = new ModelRendererTurbo(this, 713, 964, textureX, textureY); // Box 49
		noseModel[14] = new ModelRendererTurbo(this, 97, 964, textureX, textureY); // Box 50
		noseModel[15] = new ModelRendererTurbo(this, 225, 964, textureX, textureY); // Box 51
		noseModel[16] = new ModelRendererTurbo(this, 145, 964, textureX, textureY); // Box 57
		noseModel[17] = new ModelRendererTurbo(this, 305, 964, textureX, textureY); // Box 58
		noseModel[18] = new ModelRendererTurbo(this, 377, 964, textureX, textureY); // Box 59
		noseModel[19] = new ModelRendererTurbo(this, 561, 964, textureX, textureY); // Box 60
		noseModel[20] = new ModelRendererTurbo(this, 785, 964, textureX, textureY); // Box 61
		noseModel[21] = new ModelRendererTurbo(this, 1, 964, textureX, textureY); // Box 62
		noseModel[22] = new ModelRendererTurbo(this, 817, 964, textureX, textureY); // Box 63
		noseModel[23] = new ModelRendererTurbo(this, 41, 964, textureX, textureY); // Box 64
		noseModel[24] = new ModelRendererTurbo(this, 425, 964, textureX, textureY); // Box 106
		noseModel[25] = new ModelRendererTurbo(this, 1, 994, textureX, textureY); // Box 140
		noseModel[26] = new ModelRendererTurbo(this, 57, 994, textureX, textureY); // Box 141
		noseModel[27] = new ModelRendererTurbo(this, 113, 994, textureX, textureY); // Box 142
		noseModel[28] = new ModelRendererTurbo(this, 161, 994, textureX, textureY); // Box 143
		noseModel[29] = new ModelRendererTurbo(this, 241, 994, textureX, textureY); // Box 144
		noseModel[30] = new ModelRendererTurbo(this, 321, 994, textureX, textureY); // Box 145
		noseModel[31] = new ModelRendererTurbo(this, 393, 994, textureX, textureY); // Box 146
		noseModel[32] = new ModelRendererTurbo(this, 433, 994, textureX, textureY); // Box 147
		noseModel[33] = new ModelRendererTurbo(this, 41, 994, textureX, textureY); // Box 148
		noseModel[34] = new ModelRendererTurbo(this, 489, 994, textureX, textureY); // Box 149
		noseModel[35] = new ModelRendererTurbo(this, 529, 994, textureX, textureY); // Box 152
		noseModel[36] = new ModelRendererTurbo(this, 585, 994, textureX, textureY); // Box 153
		noseModel[37] = new ModelRendererTurbo(this, 665, 994, textureX, textureY); // Box 154
		noseModel[38] = new ModelRendererTurbo(this, 713, 994, textureX, textureY); // Box 155
		noseModel[39] = new ModelRendererTurbo(this, 97, 994, textureX, textureY); // Box 156
		noseModel[40] = new ModelRendererTurbo(this, 225, 994, textureX, textureY); // Box 157
		noseModel[41] = new ModelRendererTurbo(this, 145, 994, textureX, textureY); // Box 163
		noseModel[42] = new ModelRendererTurbo(this, 305, 994, textureX, textureY); // Box 164
		noseModel[43] = new ModelRendererTurbo(this, 377, 994, textureX, textureY); // Box 165
		noseModel[44] = new ModelRendererTurbo(this, 561, 994, textureX, textureY); // Box 166
		noseModel[45] = new ModelRendererTurbo(this, 785, 994, textureX, textureY); // Box 167
		noseModel[46] = new ModelRendererTurbo(this, 1, 994, textureX, textureY); // Box 168
		noseModel[47] = new ModelRendererTurbo(this, 817, 994, textureX, textureY); // Box 169
		noseModel[48] = new ModelRendererTurbo(this, 41, 994, textureX, textureY); // Box 170
		noseModel[49] = new ModelRendererTurbo(this, 425, 994, textureX, textureY); // Box 192
		noseModel[50] = new ModelRendererTurbo(this, 649, 994, textureX, textureY); // Import Box0
		noseModel[51] = new ModelRendererTurbo(this, 697, 994, textureX, textureY); // Box 242
		noseModel[52] = new ModelRendererTurbo(this, 769, 994, textureX, textureY); // Box 243
		noseModel[53] = new ModelRendererTurbo(this, 65, 994, textureX, textureY); // Box 244
		noseModel[54] = new ModelRendererTurbo(this, 121, 994, textureX, textureY); // Box 245
		noseModel[55] = new ModelRendererTurbo(this, 169, 994, textureX, textureY); // Box 246
		noseModel[56] = new ModelRendererTurbo(this, 585, 994, textureX, textureY); // Box 247
		noseModel[57] = new ModelRendererTurbo(this, 809, 994, textureX, textureY); // Box 248
		noseModel[58] = new ModelRendererTurbo(this, 833, 994, textureX, textureY); // Box 249
		noseModel[59] = new ModelRendererTurbo(this, 249, 994, textureX, textureY); // Box 223
		noseModel[60] = new ModelRendererTurbo(this, 849, 994, textureX, textureY); // Box 224
		noseModel[61] = new ModelRendererTurbo(this, 329, 994, textureX, textureY); // Box 225
		noseModel[62] = new ModelRendererTurbo(this, 865, 994, textureX, textureY); // Box 226
		noseModel[63] = new ModelRendererTurbo(this, 881, 994, textureX, textureY); // Box 227
		noseModel[64] = new ModelRendererTurbo(this, 897, 994, textureX, textureY); // Box 228
		noseModel[65] = new ModelRendererTurbo(this, 913, 994, textureX, textureY); // Box 229
		noseModel[66] = new ModelRendererTurbo(this, 929, 994, textureX, textureY); // Box 230
		noseModel[67] = new ModelRendererTurbo(this, 945, 994, textureX, textureY); // Box 231
		noseModel[68] = new ModelRendererTurbo(this, 961, 994, textureX, textureY); // Box 232
		noseModel[69] = new ModelRendererTurbo(this, 977, 994, textureX, textureY); // Box 233

		noseModel[0].addShapeBox(0F, 0F, 0F, 7, 11, 18, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		noseModel[0].setRotationPoint(-79F, -50F, -18F);

		noseModel[1].addShapeBox(0F, 0F, 0F, 7, 10, 18, 0F,0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		noseModel[1].setRotationPoint(-79F, -60F, -18F);

		noseModel[2].addShapeBox(0F, 0F, 0F, 7, 7, 16, 0F,0F, 0F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		noseModel[2].setRotationPoint(-79F, -67F, -16F);

		noseModel[3].addShapeBox(0F, 0F, 0F, 20, 11, 17, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 37
		noseModel[3].setRotationPoint(-99F, -50F, -17F);

		noseModel[4].addShapeBox(0F, 0F, 0F, 20, 10, 17, 0F,0F, -1F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		noseModel[4].setRotationPoint(-99F, -60F, -17F);

		noseModel[5].addShapeBox(0F, 0F, 0F, 20, 8, 15, 0F,0F, -1F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 39
		noseModel[5].setRotationPoint(-99F, -67F, -15F);

		noseModel[6].addShapeBox(0F, 0F, 0F, 7, 3, 12, 0F,0F, -1F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		noseModel[6].setRotationPoint(-79F, -70F, -12F);

		noseModel[7].addShapeBox(0F, 0F, 0F, 20, 3, 11, 0F,0F, -1F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 41
		noseModel[7].setRotationPoint(-99F, -69F, -11F);

		noseModel[8].addShapeBox(0F, 0F, 0F, 7, 3, 8, 0F,0F, -1F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 42
		noseModel[8].setRotationPoint(-79F, -73F, -8F);

		noseModel[9].addShapeBox(0F, 0F, 0F, 20, 3, 7, 0F,0F, -3F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 1F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 43
		noseModel[9].setRotationPoint(-99F, -72F, -7F);

		noseModel[10].addShapeBox(0F, 0F, 0F, 7, 4, 17, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		noseModel[10].setRotationPoint(-79F, -39F, -17F);

		noseModel[11].addShapeBox(0F, 0F, 0F, 20, 5, 16, 0F,0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 47
		noseModel[11].setRotationPoint(-99F, -40F, -16F);

		noseModel[12].addShapeBox(0F, 0F, 0F, 7, 5, 13, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -6F, 0F, -1F, -6F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 48
		noseModel[12].setRotationPoint(-79F, -35F, -13F);

		noseModel[13].addShapeBox(0F, 0F, 0F, 20, 6, 12, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -4F, -5F, 0F, -1F, -5F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 49
		noseModel[13].setRotationPoint(-99F, -37F, -12F);

		noseModel[14].addShapeBox(0F, 0F, 0F, 5, 9, 6, 0F,0F, -1F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -2F); // Box 50
		noseModel[14].setRotationPoint(-104F, -59F, -16F);

		noseModel[15].addShapeBox(0F, 0F, 0F, 5, 10, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, -2F, -3F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, -2F, -1F); // Box 51
		noseModel[15].setRotationPoint(-104F, -50F, -16F);

		noseModel[16].addShapeBox(0F, 0F, 0F, 5, 8, 6, 0F,0F, -3F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -3F, 1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, -4F, 0F, 0F, -3F); // Box 57
		noseModel[16].setRotationPoint(-104F, -66F, -14F);

		noseModel[17].addShapeBox(0F, 0F, 0F, 5, 5, 6, 0F,0F, -3F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, -1F, 0F, -3F, 0F, 0F, -3F, -4F, 0F, 0F, -3F); // Box 58
		noseModel[17].setRotationPoint(-104F, -68F, -10F);

		noseModel[18].addShapeBox(0F, 0F, 0F, 5, 4, 6, 0F,0F, -2F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 59
		noseModel[18].setRotationPoint(-104F, -69F, -6F);

		noseModel[19].addShapeBox(0F, 0F, 0F, 5, 5, 6, 0F,0F, 0F, -1F, 0F, -2F, 1F, 0F, -2F, -5F, 0F, 0F, -3F, 0F, -3F, -4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -3F, 0F); // Box 60
		noseModel[19].setRotationPoint(-104F, -42F, -14F);

		noseModel[20].addShapeBox(0F, 0F, 0F, 5, 4, 10, 0F,0F, 1F, 0F, 0F, -2F, 2F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, -3F, -4F, 0F, 0F, -3F, 0F, 1F, 0F, 0F, -3F, 0F); // Box 61
		noseModel[20].setRotationPoint(-104F, -39F, -10F);

		noseModel[21].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		noseModel[21].setRotationPoint(-101F, -43F, -5F);

		noseModel[22].addShapeBox(0F, 0F, 0F, 2, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		noseModel[22].setRotationPoint(-101F, -47F, -13F);

		noseModel[23].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		noseModel[23].setRotationPoint(-101F, -41F, -5F);

		noseModel[24].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -1F, 0F, 2F, -1F); // Box 106
		noseModel[24].setRotationPoint(-101F, -45F, -13F);

		noseModel[25].addShapeBox(0F, 0F, 0F, 7, 11, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F); // Box 140
		noseModel[25].setRotationPoint(-79F, -50F, 0F);

		noseModel[26].addShapeBox(0F, 0F, 0F, 7, 10, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 141
		noseModel[26].setRotationPoint(-79F, -60F, 0F);

		noseModel[27].addShapeBox(0F, 0F, 0F, 7, 7, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 142
		noseModel[27].setRotationPoint(-79F, -67F, 0F);

		noseModel[28].addShapeBox(0F, 0F, 0F, 20, 11, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -2F); // Box 143
		noseModel[28].setRotationPoint(-99F, -50F, 0F);

		noseModel[29].addShapeBox(0F, 0F, 0F, 20, 10, 17, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 144
		noseModel[29].setRotationPoint(-99F, -60F, 0F);

		noseModel[30].addShapeBox(0F, 0F, 0F, 20, 8, 15, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, -5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F); // Box 145
		noseModel[30].setRotationPoint(-99F, -67F, 0F);

		noseModel[31].addShapeBox(0F, 0F, 0F, 7, 3, 12, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 146
		noseModel[31].setRotationPoint(-79F, -70F, 0F);

		noseModel[32].addShapeBox(0F, 0F, 0F, 20, 3, 11, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, -5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F); // Box 147
		noseModel[32].setRotationPoint(-99F, -69F, 0F);

		noseModel[33].addShapeBox(0F, 0F, 0F, 7, 3, 8, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -1F, -5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 148
		noseModel[33].setRotationPoint(-79F, -73F, 0F);

		noseModel[34].addShapeBox(0F, 0F, 0F, 20, 3, 7, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -3F, -4F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, -1F); // Box 149
		noseModel[34].setRotationPoint(-99F, -72F, 0F);

		noseModel[35].addShapeBox(0F, 0F, 0F, 7, 4, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -5F); // Box 152
		noseModel[35].setRotationPoint(-79F, -39F, 0F);

		noseModel[36].addShapeBox(0F, 0F, 0F, 20, 5, 16, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -2F, -4F); // Box 153
		noseModel[36].setRotationPoint(-99F, -40F, 0F);

		noseModel[37].addShapeBox(0F, 0F, 0F, 7, 5, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -6F, 0F, -2F, -6F); // Box 154
		noseModel[37].setRotationPoint(-79F, -35F, 0F);

		noseModel[38].addShapeBox(0F, 0F, 0F, 20, 6, 12, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, -5F, 0F, -4F, -5F); // Box 155
		noseModel[38].setRotationPoint(-99F, -37F, 0F);

		noseModel[39].addShapeBox(0F, 0F, 0F, 5, 9, 6, 0F,0F, -1F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -3F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 156
		noseModel[39].setRotationPoint(-104F, -59F, 10F);

		noseModel[40].addShapeBox(0F, 0F, 0F, 5, 10, 6, 0F,0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -1F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, -2F, -3F); // Box 157
		noseModel[40].setRotationPoint(-104F, -50F, 10F);

		noseModel[41].addShapeBox(0F, 0F, 0F, 5, 8, 6, 0F,0F, -3F, 1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -3F, -5F, 0F, 0F, -3F, 0F, -1F, -4F, 0F, -1F, 0F, 0F, 0F, -1F); // Box 163
		noseModel[41].setRotationPoint(-104F, -66F, 8F);

		noseModel[42].addShapeBox(0F, 0F, 0F, 5, 5, 6, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -3F, -4F, 0F, 0F, -3F, 0F, -3F, -4F, 0F, -3F, 0F, 0F, 0F, -1F); // Box 164
		noseModel[42].setRotationPoint(-104F, -68F, 4F);

		noseModel[43].addShapeBox(0F, 0F, 0F, 5, 4, 6, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -4F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 165
		noseModel[43].setRotationPoint(-104F, -69F, 0F);

		noseModel[44].addShapeBox(0F, 0F, 0F, 5, 5, 6, 0F,0F, 0F, -3F, 0F, -2F, -5F, 0F, -2F, 1F, 0F, 0F, -1F, 0F, -3F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -3F, -4F); // Box 166
		noseModel[44].setRotationPoint(-104F, -42F, 8F);

		noseModel[45].addShapeBox(0F, 0F, 0F, 5, 4, 10, 0F,0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 2F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, 0F, -3F, 0F, -3F, -4F); // Box 167
		noseModel[45].setRotationPoint(-104F, -39F, 0F);

		noseModel[46].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		noseModel[46].setRotationPoint(-101F, -43F, 0F);

		noseModel[47].addShapeBox(0F, 0F, 0F, 2, 6, 8, 0F,0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 169
		noseModel[47].setRotationPoint(-101F, -47F, 5F);

		noseModel[48].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
		noseModel[48].setRotationPoint(-101F, -41F, 4F);

		noseModel[49].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, 3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 192
		noseModel[49].setRotationPoint(-101F, -45F, 10F);

		noseModel[50].addShapeBox(0F, 0F, 0F, 7, 5, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		noseModel[50].setRotationPoint(-112F, -55.5F, -2.5F);

		noseModel[51].addBox(0F, 0F, 0F, 7, 5, 3, 0F); // Box 242
		noseModel[51].setRotationPoint(-112F, -55.5F, -1.5F);

		noseModel[52].addShapeBox(0F, 0F, 0F, 7, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 243
		noseModel[52].setRotationPoint(-112F, -55.5F, 1.5F);

		noseModel[53].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 244
		noseModel[53].setRotationPoint(-113F, -55.5F, -2.5F);

		noseModel[54].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F); // Box 245
		noseModel[54].setRotationPoint(-113F, -55.5F, 1.5F);

		noseModel[55].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 246
		noseModel[55].setRotationPoint(-113F, -55.5F, -1.5F);

		noseModel[56].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		noseModel[56].setRotationPoint(-105F, -54.5F, -0.5F);

		noseModel[57].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		noseModel[57].setRotationPoint(-105F, -54.5F, -1.5F);

		noseModel[58].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 249
		noseModel[58].setRotationPoint(-105F, -54.5F, 0.5F);

		noseModel[59].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		noseModel[59].setRotationPoint(-101F, -55.5F, -2.5F);

		noseModel[60].addBox(0F, 0F, 0F, 2, 5, 3, 0F); // Box 224
		noseModel[60].setRotationPoint(-101F, -55.5F, -1.5F);

		noseModel[61].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 225
		noseModel[61].setRotationPoint(-101F, -55.5F, 1.5F);

		noseModel[62].addShapeBox(0F, 0F, -1.5F, 1, 11, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 226
		noseModel[62].setRotationPoint(-99.5F, -53F, 0F);

		noseModel[63].addShapeBox(0F, 0F, -1.5F, 1, 14, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 227
		noseModel[63].setRotationPoint(-99.5F, -53F, 0F);
		noseModel[63].rotateAngleX = -1.57079633F;

		noseModel[64].addShapeBox(0F, 0F, -1.5F, 1, 14, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 228
		noseModel[64].setRotationPoint(-99.5F, -53F, 0F);
		noseModel[64].rotateAngleX = 1.57079633F;

		noseModel[65].addShapeBox(0F, 0F, -1.5F, 1, 15, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 229
		noseModel[65].setRotationPoint(-99.5F, -53F, 0F);
		noseModel[65].rotateAngleX = 3.14159265F;

		noseModel[66].addShapeBox(0F, 0F, -1.5F, 1, 13, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 230
		noseModel[66].setRotationPoint(-99.5F, -53F, 0F);
		noseModel[66].rotateAngleX = 0.78539816F;

		noseModel[67].addShapeBox(0F, 0F, -1.5F, 1, 13, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 231
		noseModel[67].setRotationPoint(-99.5F, -53F, 0F);
		noseModel[67].rotateAngleX = -0.78539816F;

		noseModel[68].addShapeBox(0F, 0F, -1.5F, 1, 15, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 232
		noseModel[68].setRotationPoint(-99.5F, -53F, 0F);
		noseModel[68].rotateAngleX = -2.35619449F;

		noseModel[69].addShapeBox(0F, 0F, -1.5F, 1, 15, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 233
		noseModel[69].setRotationPoint(-99.5F, -53F, 0F);
		noseModel[69].rotateAngleX = 2.35619449F;
	}

	private void inittailModel_1()
	{
		tailModel[0] = new ModelRendererTurbo(this, 1, 786, textureX, textureY); // Box 16
		tailModel[1] = new ModelRendererTurbo(this, 153, 786, textureX, textureY); // Box 17
		tailModel[2] = new ModelRendererTurbo(this, 297, 786, textureX, textureY); // Box 18
		tailModel[3] = new ModelRendererTurbo(this, 433, 786, textureX, textureY); // Box 19
		tailModel[4] = new ModelRendererTurbo(this, 585, 786, textureX, textureY); // Box 23
		tailModel[5] = new ModelRendererTurbo(this, 737, 786, textureX, textureY); // Box 28
		tailModel[6] = new ModelRendererTurbo(this, 881, 786, textureX, textureY); // Box 33
		tailModel[7] = new ModelRendererTurbo(this, 857, 826, textureX, textureY); // Box 45
		tailModel[8] = new ModelRendererTurbo(this, 1, 746, textureX, textureY); // Box 52
		tailModel[9] = new ModelRendererTurbo(this, 113, 746, textureX, textureY); // Box 53
		tailModel[10] = new ModelRendererTurbo(this, 225, 746, textureX, textureY); // Box 54
		tailModel[11] = new ModelRendererTurbo(this, 337, 746, textureX, textureY); // Box 55
		tailModel[12] = new ModelRendererTurbo(this, 449, 746, textureX, textureY); // Box 56
		tailModel[13] = new ModelRendererTurbo(this, 1, 809, textureX, textureY); // Box 123
		tailModel[14] = new ModelRendererTurbo(this, 153, 809, textureX, textureY); // Box 124
		tailModel[15] = new ModelRendererTurbo(this, 297, 809, textureX, textureY); // Box 125
		tailModel[16] = new ModelRendererTurbo(this, 433, 809, textureX, textureY); // Box 126
		tailModel[17] = new ModelRendererTurbo(this, 585, 809, textureX, textureY); // Box 129
		tailModel[18] = new ModelRendererTurbo(this, 737, 809, textureX, textureY); // Box 134
		tailModel[19] = new ModelRendererTurbo(this, 881, 809, textureX, textureY); // Box 139
		tailModel[20] = new ModelRendererTurbo(this, 729, 825, textureX, textureY); // Box 151
		tailModel[21] = new ModelRendererTurbo(this, 1, 766, textureX, textureY); // Box 158
		tailModel[22] = new ModelRendererTurbo(this, 113, 766, textureX, textureY); // Box 159
		tailModel[23] = new ModelRendererTurbo(this, 225, 766, textureX, textureY); // Box 160
		tailModel[24] = new ModelRendererTurbo(this, 337, 766, textureX, textureY); // Box 161
		tailModel[25] = new ModelRendererTurbo(this, 449, 766, textureX, textureY); // Box 162
		tailModel[26] = new ModelRendererTurbo(this, 1, 688, textureX, textureY); // Box 172
		tailModel[27] = new ModelRendererTurbo(this, 105, 688, textureX, textureY); // Box 173
		tailModel[28] = new ModelRendererTurbo(this, 145, 688, textureX, textureY); // Box 174
		tailModel[29] = new ModelRendererTurbo(this, 185, 688, textureX, textureY); // Box 175
		tailModel[30] = new ModelRendererTurbo(this, 233, 688, textureX, textureY); // Box 177
		tailModel[31] = new ModelRendererTurbo(this, 257, 688, textureX, textureY); // Box 178
		tailModel[32] = new ModelRendererTurbo(this, 281, 688, textureX, textureY); // Box 179
		tailModel[33] = new ModelRendererTurbo(this, 305, 688, textureX, textureY); // Box 180
		tailModel[34] = new ModelRendererTurbo(this, 337, 688, textureX, textureY); // Box 181
		tailModel[35] = new ModelRendererTurbo(this, 369, 688, textureX, textureY); // Box 182
		tailModel[36] = new ModelRendererTurbo(this, 385, 688, textureX, textureY); // Box 183
		tailModel[37] = new ModelRendererTurbo(this, 401, 688, textureX, textureY); // Box 184
		tailModel[38] = new ModelRendererTurbo(this, 425, 688, textureX, textureY); // Box 185
		tailModel[39] = new ModelRendererTurbo(this, 1, 574, textureX, textureY); // Box 187
		tailModel[40] = new ModelRendererTurbo(this, 137, 574, textureX, textureY); // Box 188
		tailModel[41] = new ModelRendererTurbo(this, 1, 574, textureX, textureY); // Box 189
		tailModel[42] = new ModelRendererTurbo(this, 89, 574, textureX, textureY); // Box 190
		tailModel[43] = new ModelRendererTurbo(this, 121, 574, textureX, textureY); // Box 191
		tailModel[44] = new ModelRendererTurbo(this, 273, 574, textureX, textureY); // Box 192
		tailModel[45] = new ModelRendererTurbo(this, 49, 717, textureX, textureY); // Box 193
		tailModel[46] = new ModelRendererTurbo(this, 153, 717, textureX, textureY); // Box 194
		tailModel[47] = new ModelRendererTurbo(this, 193, 717, textureX, textureY); // Box 195
		tailModel[48] = new ModelRendererTurbo(this, 233, 717, textureX, textureY); // Box 196
		tailModel[49] = new ModelRendererTurbo(this, 281, 717, textureX, textureY); // Box 198
		tailModel[50] = new ModelRendererTurbo(this, 305, 717, textureX, textureY); // Box 199
		tailModel[51] = new ModelRendererTurbo(this, 329, 717, textureX, textureY); // Box 200
		tailModel[52] = new ModelRendererTurbo(this, 353, 717, textureX, textureY); // Box 201
		tailModel[53] = new ModelRendererTurbo(this, 385, 717, textureX, textureY); // Box 202
		tailModel[54] = new ModelRendererTurbo(this, 417, 717, textureX, textureY); // Box 203
		tailModel[55] = new ModelRendererTurbo(this, 433, 717, textureX, textureY); // Box 204
		tailModel[56] = new ModelRendererTurbo(this, 449, 717, textureX, textureY); // Box 205
		tailModel[57] = new ModelRendererTurbo(this, 473, 717, textureX, textureY); // Box 206
		tailModel[58] = new ModelRendererTurbo(this, 1, 631, textureX, textureY); // Box 208
		tailModel[59] = new ModelRendererTurbo(this, 137, 631, textureX, textureY); // Box 209
		tailModel[60] = new ModelRendererTurbo(this, 1, 631, textureX, textureY); // Box 210
		tailModel[61] = new ModelRendererTurbo(this, 89, 631, textureX, textureY); // Box 211
		tailModel[62] = new ModelRendererTurbo(this, 121, 631, textureX, textureY); // Box 212
		tailModel[63] = new ModelRendererTurbo(this, 273, 631, textureX, textureY); // Box 213
		tailModel[64] = new ModelRendererTurbo(this, 489, 717, textureX, textureY); // Box 261
		tailModel[65] = new ModelRendererTurbo(this, 593, 858, textureX, textureY); // Box 535

		tailModel[0].addShapeBox(0F, 0F, 0F, 59, 9, 13, 0F,0F, 0F, -2F, 0F, -5F, -7F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, -6F, 0F, 5F, 0F, 0F, 0F, 0F); // Box 16
		tailModel[0].setRotationPoint(6F, -58F, -13F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 59, 10, 11, 0F,0F, -1F, -3F, 0F, -12F, -6F, 0F, -12F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 4F, -5F, 0F, 4F, 0F, 0F, -1F, 0F); // Box 17
		tailModel[1].setRotationPoint(6F, -67F, -11F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 59, 10, 8, 0F,0F, 0F, -4F, 0F, -9F, -6F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 9F, -3F, 0F, 9F, 0F, 0F, -2F, 0F); // Box 18
		tailModel[2].setRotationPoint(6F, -74F, -8F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 59, 7, 13, 0F,0F, 0F, 0F, 0F, -5F, -6F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 19
		tailModel[3].setRotationPoint(6F, -49F, -13F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 59, 4, 13, 0F,0F, 0F, 0F, 0F, -1F, -6F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -6F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 23
		tailModel[4].setRotationPoint(6F, -43F, -13F);

		tailModel[5].addShapeBox(0F, 0F, 0F, 59, 3, 12, 0F,0F, 0F, 0F, 0F, 1F, -5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -6F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 28
		tailModel[5].setRotationPoint(6F, -39F, -12F);

		tailModel[6].addShapeBox(0F, 0F, 0F, 59, 6, 10, 0F,0F, -2F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -4F, 0F, -4F, -7F, 0F, -3F, 0F, 0F, 1F, 0F); // Box 33
		tailModel[6].setRotationPoint(6F, -38F, -10F);

		tailModel[7].addShapeBox(0F, 0F, 0F, 59, 10, 4, 0F,0F, 0F, -2F, 0F, -10F, -3F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 1F, -2F, 0F, 1F, 0F, 0F, -8F, 0F); // Box 45
		tailModel[7].setRotationPoint(6F, -76F, -4F);

		tailModel[8].addShapeBox(0F, 0F, 0F, 46, 12, 7, 0F,0F, 0F, -1F, 0F, -5F, -5F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 52
		tailModel[8].setRotationPoint(65F, -53F, -7F);

		tailModel[9].addShapeBox(0F, 0F, 0F, 46, 4, 7, 0F,0F, 0F, 0F, 0F, -2.9999F, -3.9999F, 0F, -2.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9999F, -3.9999F, 0F, -0.9999F, 0F, 0F, 0F, 0F); // Box 53
		tailModel[9].setRotationPoint(65F, -44F, -7F);

		tailModel[10].addShapeBox(0F, 0F, 0F, 46, 4, 7, 0F,0F, -3.9999F, 0F, 0F, -2.9999F, -3.9999F, 0F, -2.9999F, 0F, 0F, -3.9999F, 0F, 0F, 1.9999F, -0.9999F, 0F, -0.9999F, -3.9999F, 0F, -0.9999F, 0F, 0F, 1.9999F, 0F); // Box 54
		tailModel[10].setRotationPoint(65F, -44F, -7F);

		tailModel[11].addShapeBox(0F, 0F, 0F, 46, 4, 7, 0F,0F, -5.9999F, -0.9999F, 0F, -2.9999F, -3.9999F, 0F, -2.9999F, 0F, 0F, -5.9999F, 0F, 0F, 3.9999F, -3.9999F, 0F, -0.9999F, -3.9999F, 0F, 0.9999F, 0F, 0F, 4.9999F, 0F); // Box 55
		tailModel[11].setRotationPoint(65F, -44F, -7F);

		tailModel[12].addShapeBox(0F, 0F, 0F, 46, 7, 6, 0F,0F, 0F, -0.9999F, 0F, -6.9999F, -3.9999F, 0F, -6.9999F, 0F, 0F, 0F, 0F, 0F, -4.9999F, 0F, 0F, 0F, -3.9999F, 0F, 0F, 0F, 0F, -4.9999F, 0F); // Box 56
		tailModel[12].setRotationPoint(65F, -55F, -6F);

		tailModel[13].addShapeBox(0F, 0F, 0F, 59, 9, 13, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, -7F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, -6F, 0F, 0F, 0F); // Box 123
		tailModel[13].setRotationPoint(6F, -58F, 0F);

		tailModel[14].addShapeBox(0F, 0F, 0F, 59, 10, 11, 0F,0F, -1F, 0F, 0F, -12F, 0F, 0F, -12F, -6F, 0F, -1F, -3F, 0F, -1F, 0F, 0F, 4F, 0F, 0F, 4F, -5F, 0F, -1F, 0F); // Box 124
		tailModel[14].setRotationPoint(6F, -67F, 0F);

		tailModel[15].addShapeBox(0F, 0F, 0F, 59, 10, 8, 0F,0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, -6F, 0F, 0F, -4F, 0F, -2F, 0F, 0F, 9F, 0F, 0F, 9F, -3F, 0F, -2F, 0F); // Box 125
		tailModel[15].setRotationPoint(6F, -74F, 0F);

		tailModel[16].addShapeBox(0F, 0F, 0F, 59, 7, 13, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, -6F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -1F, 0F); // Box 126
		tailModel[16].setRotationPoint(6F, -49F, 0F);

		tailModel[17].addShapeBox(0F, 0F, 0F, 59, 4, 13, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -6F, 0F, 0F, -1F); // Box 129
		tailModel[17].setRotationPoint(6F, -43F, 0F);

		tailModel[18].addShapeBox(0F, 0F, 0F, 59, 3, 12, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -6F, 0F, 0F, -2F); // Box 134
		tailModel[18].setRotationPoint(6F, -39F, 0F);

		tailModel[19].addShapeBox(0F, 0F, 0F, 59, 6, 10, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, -4F, -7F, 0F, 0F, -4F); // Box 139
		tailModel[19].setRotationPoint(6F, -38F, 0F);

		tailModel[20].addShapeBox(0F, 0F, 0F, 59, 10, 4, 0F,0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, -3F, 0F, 0F, -2F, 0F, -8F, 0F, 0F, 1F, 0F, 0F, 1F, -2F, 0F, -8F, 0F); // Box 151
		tailModel[20].setRotationPoint(6F, -76F, 0F);

		tailModel[21].addShapeBox(0F, 0F, 0F, 46, 12, 7, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, -5F, 0F, 0F, -1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -3F, 0F); // Box 158
		tailModel[21].setRotationPoint(65F, -53F, 0F);

		tailModel[22].addShapeBox(0F, 0F, 0F, 46, 4, 7, 0F,0F, 0F, 0F, 0F, -2.9999F, 0F, 0F, -2.9999F, -3.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9999F, 0F, 0F, -0.9999F, -3.9999F, 0F, 0F, 0F); // Box 159
		tailModel[22].setRotationPoint(65F, -44F, 0F);

		tailModel[23].addShapeBox(0F, 0F, 0F, 46, 4, 7, 0F,0F, -3.9999F, 0F, 0F, -2.9999F, 0F, 0F, -2.9999F, -3.9999F, 0F, -3.9999F, 0F, 0F, 1.9999F, 0F, 0F, -0.9999F, 0F, 0F, -0.9999F, -3.9999F, 0F, 1.9999F, -0.9999F); // Box 160
		tailModel[23].setRotationPoint(65F, -44F, 0F);

		tailModel[24].addShapeBox(0F, 0F, 0F, 46, 4, 7, 0F,0F, -5.9999F, 0F, 0F, -2.9999F, 0F, 0F, -2.9999F, -3.9999F, 0F, -5.9999F, -0.9999F, 0F, 4.9999F, 0F, 0F, 0.9999F, 0F, 0F, -0.9999F, -3.9999F, 0F, 3.9999F, -3.9999F); // Box 161
		tailModel[24].setRotationPoint(65F, -44F, 0F);

		tailModel[25].addShapeBox(0F, 0F, 0F, 46, 7, 6, 0F,0F, 0F, 0F, 0F, -6.9999F, 0F, 0F, -6.9999F, -3.9999F, 0F, 0F, -0.9999F, 0F, -4.9999F, 0F, 0F, 0F, 0F, 0F, 0F, -3.9999F, 0F, -4.9999F, 0F); // Box 162
		tailModel[25].setRotationPoint(65F, -55F, 0F);

		tailModel[26].addShapeBox(0F, 0F, 0F, 46, 4, 5, 0F,-18F, 0F, -3F, -13F, -1F, -3F, -13F, -1F, 0F, -18F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, -3F, 0F, 7F, 0F, 0F, 0F, 0F); // Box 172
		tailModel[26].setRotationPoint(65F, -59F, -5F);

		tailModel[27].addShapeBox(0F, 0F, 0F, 15, 26, 2, 0F,-9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 173
		tailModel[27].setRotationPoint(83F, -85F, -2F);

		tailModel[28].addShapeBox(0F, 0F, 0F, 15, 26, 2, 0F,-9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 2F, -7F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 2F, -7F, 0F); // Box 174
		tailModel[28].setRotationPoint(77F, -85F, -2F);

		tailModel[29].addShapeBox(0F, 0F, 0F, 18, 11, 5, 0F,0F, -1F, -3F, -8F, 0F, -3F, -8F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -4F, -3F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 175
		tailModel[29].setRotationPoint(65F, -66F, -5F);

		tailModel[30].addShapeBox(0F, 0F, 0F, 7, 5, 2, 0F,-2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 177
		tailModel[30].setRotationPoint(86F, -90F, -2F);

		tailModel[31].addShapeBox(0F, 0F, 0F, 8, 5, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 178
		tailModel[31].setRotationPoint(92F, -90F, -2F);

		tailModel[32].addShapeBox(0F, 0F, 0F, 9, 5, 2, 0F,-2F, 0F, 0F, -2F, -2F, -1F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		tailModel[32].setRotationPoint(98F, -90F, -2F);

		tailModel[33].addShapeBox(0F, 0F, 0F, 10, 2, 2, 0F,0F, -1F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 180
		tailModel[33].setRotationPoint(65F, -67F, -2F);

		tailModel[34].addShapeBox(0F, 0F, 0F, 12, 26, 2, 0F,-11F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, 0F, -8F, -1F, -11F, -7F, 0F, -11F, -7F, 0F, 0F, -8F, 0F); // Box 181
		tailModel[34].setRotationPoint(74F, -85F, -2F);

		tailModel[35].addShapeBox(0F, 0F, 0F, 3, 4, 2, 0F,-3F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 1F, 0F, 0F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 182
		tailModel[35].setRotationPoint(85F, -89F, -2F);

		tailModel[36].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 183
		tailModel[36].setRotationPoint(88F, -91F, -2F);

		tailModel[37].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
		tailModel[37].setRotationPoint(93F, -91F, -2F);

		tailModel[38].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, -1F, 0F, -3F, -1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 185
		tailModel[38].setRotationPoint(100F, -91F, -2F);

		tailModel[39].addShapeBox(0F, 0F, 0F, 15, 6, 50, 0F,-7F, -1F, 0F, -3F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -7F, -1F, 0F, -3F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 187
		tailModel[39].setRotationPoint(83F, -59F, -52F);

		tailModel[40].addShapeBox(0F, 0F, 0F, 15, 5, 50, 0F,0F, -1F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, -3F, 0F, 0F); // Box 188
		tailModel[40].setRotationPoint(95F, -59F, -52F);

		tailModel[41].addShapeBox(0F, 0F, 0F, 5, 4, 7, 0F,-3F, -1F, 0F, 3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, 3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		tailModel[41].setRotationPoint(90F, -58F, -59F);

		tailModel[42].addShapeBox(0F, 0F, 0F, 5, 4, 7, 0F,-3F, -1F, 0F, 3F, -1F, -1F, 8F, -1F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, 3F, -2F, -1F, 8F, -2F, 0F, 0F, 0F, 0F); // Box 190
		tailModel[42].setRotationPoint(95F, -58F, -59F);

		tailModel[43].addShapeBox(0F, 0F, 0F, 4, 4, 7, 0F,-3F, -1F, -2F, 3F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, -2F, -2F, 3F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 191
		tailModel[43].setRotationPoint(86F, -58F, -59F);

		tailModel[44].addShapeBox(0F, 0F, 0F, 19, 6, 50, 0F,-15F, -2F, 0F, 0F, -1F, 0F, -7F, 0F, 0F, 0F, -2F, 0F, -15F, -3F, 0F, 0F, -1F, 0F, -7F, 0F, 0F, 0F, -2F, 0F); // Box 192
		tailModel[44].setRotationPoint(71F, -59F, -52F);

		tailModel[45].addShapeBox(0F, 0F, 0F, 46, 4, 5, 0F,-18F, 0F, 0F, -13F, -1F, 0F, -13F, -1F, -3F, -18F, 0F, -3F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, -3F, 0F, 0F, 0F); // Box 193
		tailModel[45].setRotationPoint(65F, -59F, 0F);

		tailModel[46].addShapeBox(0F, 0F, 0F, 15, 26, 2, 0F,-9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 194
		tailModel[46].setRotationPoint(83F, -85F, 0F);

		tailModel[47].addShapeBox(0F, 0F, 0F, 15, 26, 2, 0F,-9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 2F, -7F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 2F, -7F, 0F); // Box 195
		tailModel[47].setRotationPoint(77F, -85F, 0F);

		tailModel[48].addShapeBox(0F, 0F, 0F, 18, 11, 5, 0F,0F, -1F, 0F, -8F, 0F, 0F, -8F, 0F, -3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, -3F, 0F, 0F, 0F); // Box 196
		tailModel[48].setRotationPoint(65F, -66F, 0F);

		tailModel[49].addShapeBox(0F, 0F, 0F, 7, 5, 2, 0F,-2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 198
		tailModel[49].setRotationPoint(86F, -90F, 0F);

		tailModel[50].addShapeBox(0F, 0F, 0F, 8, 5, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 199
		tailModel[50].setRotationPoint(92F, -90F, 0F);

		tailModel[51].addShapeBox(0F, 0F, 0F, 9, 5, 2, 0F,-2F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 200
		tailModel[51].setRotationPoint(98F, -90F, 0F);

		tailModel[52].addShapeBox(0F, 0F, 0F, 10, 2, 2, 0F,0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 201
		tailModel[52].setRotationPoint(65F, -67F, 0F);

		tailModel[53].addShapeBox(0F, 0F, 0F, 12, 26, 2, 0F,-11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, -1F, 0F, -8F, 0F, -11F, -7F, 0F, -11F, -7F, 0F, 0F, -8F, -1F); // Box 202
		tailModel[53].setRotationPoint(74F, -85F, 0F);

		tailModel[54].addShapeBox(0F, 0F, 0F, 3, 4, 2, 0F,-3F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 1F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -1F); // Box 203
		tailModel[54].setRotationPoint(85F, -89F, 0F);

		tailModel[55].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 204
		tailModel[55].setRotationPoint(88F, -91F, 0F);

		tailModel[56].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		tailModel[56].setRotationPoint(93F, -91F, 0F);

		tailModel[57].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, 0F); // Box 206
		tailModel[57].setRotationPoint(100F, -91F, 0F);

		tailModel[58].addShapeBox(0F, 0F, 0F, 15, 6, 50, 0F,0F, 0F, 0F, 0F, -1F, 0F, -3F, -1F, 0F, -7F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, -1F, 0F, -7F, -1F, 0F); // Box 208
		tailModel[58].setRotationPoint(83F, -59F, 2F);

		tailModel[59].addShapeBox(0F, 0F, 0F, 15, 5, 50, 0F,-3F, -1F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, 0F, -1F, 0F, -3F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F); // Box 209
		tailModel[59].setRotationPoint(95F, -59F, 2F);

		tailModel[60].addShapeBox(0F, 0F, 0F, 5, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 3F, -1F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -2F, 0F, -3F, -2F, 0F); // Box 210
		tailModel[60].setRotationPoint(90F, -58F, 52F);

		tailModel[61].addShapeBox(0F, 0F, 0F, 5, 4, 7, 0F,0F, 0F, 0F, 8F, -1F, 0F, 3F, -1F, -1F, -3F, -1F, 0F, 0F, 0F, 0F, 8F, -2F, 0F, 3F, -2F, -1F, -3F, -2F, 0F); // Box 211
		tailModel[61].setRotationPoint(95F, -58F, 52F);

		tailModel[62].addShapeBox(0F, 0F, 0F, 4, 4, 7, 0F,0F, -1F, 0F, 0F, 0F, 0F, 3F, -1F, 0F, -3F, -1F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 3F, -2F, 0F, -3F, -2F, -2F); // Box 212
		tailModel[62].setRotationPoint(86F, -58F, 52F);

		tailModel[63].addShapeBox(0F, 0F, 0F, 19, 6, 50, 0F,0F, -2F, 0F, -7F, 0F, 0F, 0F, -1F, 0F, -15F, -2F, 0F, 0F, -2F, 0F, -7F, 0F, 0F, 0F, -1F, 0F, -15F, -3F, 0F); // Box 213
		tailModel[63].setRotationPoint(71F, -59F, 2F);

		tailModel[64].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F,-4F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 261
		tailModel[64].setRotationPoint(89F, -98F, -0.5F);

		tailModel[65].addShapeBox(0F, 0F, 0F, 91, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 535
		tailModel[65].setRotationPoint(2F, -93F, -0.5F);
		tailModel[65].rotateAngleZ = 0.04363323F;
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 1, 362, textureX, textureY); // Box 94
		leftWingModel[1] = new ModelRendererTurbo(this, 97, 362, textureX, textureY); // Box 95
		leftWingModel[2] = new ModelRendererTurbo(this, 249, 362, textureX, textureY); // Box 96
		leftWingModel[3] = new ModelRendererTurbo(this, 481, 362, textureX, textureY); // Box 98
		leftWingModel[4] = new ModelRendererTurbo(this, 665, 362, textureX, textureY); // Box 99
		leftWingModel[5] = new ModelRendererTurbo(this, 1, 332, textureX, textureY); // Box 100
		leftWingModel[6] = new ModelRendererTurbo(this, 73, 332, textureX, textureY); // Box 101
		leftWingModel[7] = new ModelRendererTurbo(this, 1, 332, textureX, textureY); // Box 102
		leftWingModel[8] = new ModelRendererTurbo(this, 57, 332, textureX, textureY); // Box 103
		leftWingModel[9] = new ModelRendererTurbo(this, 137, 332, textureX, textureY); // Box 104
		leftWingModel[10] = new ModelRendererTurbo(this, 209, 332, textureX, textureY); // Box 105
		leftWingModel[11] = new ModelRendererTurbo(this, 1, 362, textureX, textureY); // Box 256
		leftWingModel[12] = new ModelRendererTurbo(this, 17, 362, textureX, textureY); // Box 257

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 17, 12, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		leftWingModel[0].setRotationPoint(-57F, -51F, -46F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 44, 12, 30, 0F,0F, 0F, 0F, -6F, -6F, 0F, 0F, -6F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -5F, 0F, 0F, -5F, 3F, 0F, 0F, 0F); // Box 95
		leftWingModel[1].setRotationPoint(-40F, -51F, -46F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 9, 12, 30, 0F,-2F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 96
		leftWingModel[2].setRotationPoint(-66F, -51F, -46F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 17, 17, 73, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -4F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		leftWingModel[3].setRotationPoint(-57F, -56F, -119F);

		leftWingModel[4].addShapeBox(0F, 0F, 0F, 11, 17, 73, 0F,-5F, -2F, 0F, 0F, 0F, 0F, -4F, -5F, 0F, 0F, -10F, 0F, -5F, -13F, 0F, 0F, -12F, 0F, -4F, 0F, 0F, 0F, -2F, 0F); // Box 99
		leftWingModel[4].setRotationPoint(-64F, -56F, -119F);

		leftWingModel[5].addShapeBox(0F, 0F, 0F, 13, 7, 22, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		leftWingModel[5].setRotationPoint(-53F, -58F, -141F);

		leftWingModel[6].addShapeBox(0F, 0F, 0F, 7, 7, 22, 0F,-2F, -1F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, 0F, -4F, 0F, -2F, -4F, 0F, 0F, -3F, 0F, -1F, 0F, 0F, 0F, -1F, 0F); // Box 101
		leftWingModel[6].setRotationPoint(-59F, -58F, -141F);

		leftWingModel[7].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F,-1F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 102
		leftWingModel[7].setRotationPoint(-57F, -58F, -145F);

		leftWingModel[8].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		leftWingModel[8].setRotationPoint(-52F, -58F, -145F);

		leftWingModel[9].addShapeBox(0F, 0F, 0F, 24, 7, 22, 0F,0F, 0F, 0F, -4F, -1F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, -4F, -5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 104
		leftWingModel[9].setRotationPoint(-40F, -58F, -141F);

		leftWingModel[10].addShapeBox(0F, 0F, 0F, 20, 4, 4, 0F,0F, -0.9999F, 0F, 0F, -0.9999F, -3.9999F, 0F, -0.9999F, 0F, 0F, 0F, 0F, 0F, -1.9999F, 0F, 0F, -1.9999F, -3.9999F, 0F, -1.9999F, 0F, 0F, 0F, 0F); // Box 105
		leftWingModel[10].setRotationPoint(-40F, -58F, -145F);

		leftWingModel[11].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 256
		leftWingModel[11].setRotationPoint(-66F, -45F, -51F);

		leftWingModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 257
		leftWingModel[12].setRotationPoint(-64F, -46F, -56F);
	}

	private void initrightWingModel_1()
	{
		rightWingModel[0] = new ModelRendererTurbo(this, 1, 483, textureX, textureY); // Box 180
		rightWingModel[1] = new ModelRendererTurbo(this, 97, 483, textureX, textureY); // Box 181
		rightWingModel[2] = new ModelRendererTurbo(this, 249, 483, textureX, textureY); // Box 182
		rightWingModel[3] = new ModelRendererTurbo(this, 481, 483, textureX, textureY); // Box 184
		rightWingModel[4] = new ModelRendererTurbo(this, 665, 483, textureX, textureY); // Box 185
		rightWingModel[5] = new ModelRendererTurbo(this, 1, 453, textureX, textureY); // Box 186
		rightWingModel[6] = new ModelRendererTurbo(this, 73, 453, textureX, textureY); // Box 187
		rightWingModel[7] = new ModelRendererTurbo(this, 1, 453, textureX, textureY); // Box 188
		rightWingModel[8] = new ModelRendererTurbo(this, 57, 453, textureX, textureY); // Box 189
		rightWingModel[9] = new ModelRendererTurbo(this, 137, 453, textureX, textureY); // Box 190
		rightWingModel[10] = new ModelRendererTurbo(this, 209, 453, textureX, textureY); // Box 191
		rightWingModel[11] = new ModelRendererTurbo(this, 1, 483, textureX, textureY); // Box 258
		rightWingModel[12] = new ModelRendererTurbo(this, 17, 483, textureX, textureY); // Box 259
		rightWingModel[13] = new ModelRendererTurbo(this, 1, 171, textureX, textureY); // Box 697
		rightWingModel[14] = new ModelRendererTurbo(this, 33, 171, textureX, textureY); // Box 698
		rightWingModel[15] = new ModelRendererTurbo(this, 65, 171, textureX, textureY); // Box 699
		rightWingModel[16] = new ModelRendererTurbo(this, 97, 171, textureX, textureY); // Box 700
		rightWingModel[17] = new ModelRendererTurbo(this, 129, 171, textureX, textureY); // Box 701
		rightWingModel[18] = new ModelRendererTurbo(this, 161, 171, textureX, textureY); // Box 702
		rightWingModel[19] = new ModelRendererTurbo(this, 193, 171, textureX, textureY); // Box 703
		rightWingModel[20] = new ModelRendererTurbo(this, 233, 171, textureX, textureY); // Box 704
		rightWingModel[21] = new ModelRendererTurbo(this, 273, 171, textureX, textureY); // Box 705

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 17, 12, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		rightWingModel[0].setRotationPoint(-57F, -51F, 16F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 44, 12, 30, 0F,0F, 0F, 0F, 0F, -6F, 3F, -6F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 3F, -6F, -5F, 0F, 0F, 0F, 0F); // Box 181
		rightWingModel[1].setRotationPoint(-40F, -51F, 16F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 9, 12, 30, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F); // Box 182
		rightWingModel[2].setRotationPoint(-66F, -51F, 16F);

		rightWingModel[3].addShapeBox(0F, 0F, 0F, 17, 17, 73, 0F,0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, -4F, -12F, 0F); // Box 184
		rightWingModel[3].setRotationPoint(-57F, -56F, 46F);

		rightWingModel[4].addShapeBox(0F, 0F, 0F, 11, 17, 73, 0F,0F, -10F, 0F, -4F, -5F, 0F, 0F, 0F, 0F, -5F, -2F, 0F, 0F, -2F, 0F, -4F, 0F, 0F, 0F, -12F, 0F, -5F, -13F, 0F); // Box 185
		rightWingModel[4].setRotationPoint(-64F, -56F, 46F);

		rightWingModel[5].addShapeBox(0F, 0F, 0F, 13, 7, 22, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, -3F, 0F); // Box 186
		rightWingModel[5].setRotationPoint(-53F, -58F, 119F);

		rightWingModel[6].addShapeBox(0F, 0F, 0F, 7, 7, 22, 0F,0F, -4F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, -3F, 0F, -2F, -4F, 0F); // Box 187
		rightWingModel[6].setRotationPoint(-59F, -58F, 119F);

		rightWingModel[7].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -2F, -2F); // Box 188
		rightWingModel[7].setRotationPoint(-57F, -58F, 141F);

		rightWingModel[8].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 189
		rightWingModel[8].setRotationPoint(-52F, -58F, 141F);

		rightWingModel[9].addShapeBox(0F, 0F, 0F, 24, 7, 22, 0F,0F, -2F, 0F, 0F, -4F, 0F, -4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -4F, -5F, 0F, 0F, -3F, 0F); // Box 190
		rightWingModel[9].setRotationPoint(-40F, -58F, 119F);

		rightWingModel[10].addShapeBox(0F, 0F, 0F, 20, 4, 4, 0F,0F, 0F, 0F, 0F, -0.9999F, 0F, 0F, -0.9999F, -3.9999F, 0F, -0.9999F, 0F, 0F, 0F, 0F, 0F, -1.9999F, 0F, 0F, -1.9999F, -3.9999F, 0F, -1.9999F, 0F); // Box 191
		rightWingModel[10].setRotationPoint(-40F, -58F, 141F);

		rightWingModel[11].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 258
		rightWingModel[11].setRotationPoint(-66F, -45F, 50F);

		rightWingModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 259
		rightWingModel[12].setRotationPoint(-64F, -46F, 55F);

		rightWingModel[13].addShapeBox(0F, 0F, 0F, 8, 12, 4, 0F,0F, -5F, -4F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 1F, 0F, -5F, -4F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 1F); // Box 697
		rightWingModel[13].setRotationPoint(-68F, -63F, 137F);

		rightWingModel[14].addShapeBox(0F, 0F, 0F, 8, 12, 4, 0F,0F, -4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -1F, 0F, -4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -1F); // Box 698
		rightWingModel[14].setRotationPoint(-68F, -63F, 141F);

		rightWingModel[15].addShapeBox(0F, 0F, 0F, 8, 12, 4, 0F,0F, -4F, 1F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -5F, -4F, 0F, -4F, 1F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -5F, -4F); // Box 699
		rightWingModel[15].setRotationPoint(-68F, -63F, 145F);

		rightWingModel[16].addShapeBox(0F, 0F, 0F, 11, 12, 4, 0F,0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 700
		rightWingModel[16].setRotationPoint(-60F, -63F, 137F);

		rightWingModel[17].addShapeBox(0F, 0F, 0F, 11, 12, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 701
		rightWingModel[17].setRotationPoint(-60F, -63F, 141F);

		rightWingModel[18].addShapeBox(0F, 0F, 0F, 11, 12, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 702
		rightWingModel[18].setRotationPoint(-60F, -63F, 145F);

		rightWingModel[19].addShapeBox(0F, 0F, 0F, 13, 12, 4, 0F,0F, 0F, 0F, 0F, -4F, -1F, 0F, -4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -1F, 0F, -4F, -1F, 0F, 0F, 0F); // Box 703
		rightWingModel[19].setRotationPoint(-49F, -63F, 141F);

		rightWingModel[20].addShapeBox(0F, 0F, 0F, 13, 12, 4, 0F,0F, 0F, 0F, 0F, -4F, 1F, 0F, -5F, -4F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 1F, 0F, -5F, -4F, 0F, -4F, 0F); // Box 704
		rightWingModel[20].setRotationPoint(-49F, -63F, 145F);

		rightWingModel[21].addShapeBox(0F, 0F, 0F, 13, 12, 4, 0F,0F, -4F, 0F, 0F, -5F, -4F, 0F, -4F, 1F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -5F, -4F, 0F, -4F, 1F, 0F, 0F, 0F); // Box 705
		rightWingModel[21].setRotationPoint(-49F, -63F, 137F);
	}

	private void inityawFlapModel_1()
	{
		yawFlapModel[0] = new ModelRendererTurbo(this, 553, 717, textureX, textureY); // Box 176
		yawFlapModel[1] = new ModelRendererTurbo(this, 1, 717, textureX, textureY); // Box 186

		yawFlapModel[0].addShapeBox(0F, 0F, -2F, 14, 27, 4, 0F,0F, 0F, 0F, -5F, 0F, -1F, -5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 176
		yawFlapModel[0].setRotationPoint(98F, -85F, 0F);

		yawFlapModel[1].addShapeBox(0F, 27F, -2F, 16, 10, 4, 0F,0F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, -13F, 0F, 0F, -1F, -2F, -1F, -1F, -2F, -1F, -13F, 0F, 0F); // Box 186
		yawFlapModel[1].setRotationPoint(98F, -85F, 0F);
	}

	private void initpitchFlapLeftWingModel_1()
	{
		pitchFlapLeftWingModel[0] = new ModelRendererTurbo(this, 257, 362, textureX, textureY); // Box 97

		pitchFlapLeftWingModel[0].addShapeBox(0F, 0F, 0F, 38, 16, 73, 0F,0F, 1F, 0F, -14F, -1F, 0F, 0F, -10F, 0F, 0F, -4F, 0F, 0F, -12F, 0F, -14F, -14F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 97
		pitchFlapLeftWingModel[0].setRotationPoint(-40F, -55F, -119F);
	}

	private void initpitchFlapRightWingModel_1()
	{
		pitchFlapRightWingModel[0] = new ModelRendererTurbo(this, 257, 483, textureX, textureY); // Box 183

		pitchFlapRightWingModel[0].addShapeBox(0F, 0F, 0F, 38, 16, 73, 0F,0F, -4F, 0F, 0F, -10F, 0F, -14F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -14F, -14F, 0F, 0F, -12F, 0F); // Box 183
		pitchFlapRightWingModel[0].setRotationPoint(-40F, -55F, 46F);
	}

	private void inittailWheelModel_1()
	{
		tailWheelModel[0] = new ModelRendererTurbo(this, 1, 323, textureX, textureY); // Import TW_1
		tailWheelModel[1] = new ModelRendererTurbo(this, 17, 323, textureX, textureY); // Import TW_2
		tailWheelModel[2] = new ModelRendererTurbo(this, 25, 323, textureX, textureY); // Import TW_4
		tailWheelModel[3] = new ModelRendererTurbo(this, 41, 323, textureX, textureY); // Import TW_5

		tailWheelModel[0].addBox(0F, 0F, 0F, 5, 3, 1, 0F); // Import TW_1
		tailWheelModel[0].setRotationPoint(83F, -35F, -0.5F);

		tailWheelModel[1].addShapeBox(0F, 0F, 0F, 1, 6, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -3F, 0F, -0.25F, 3F, 0F, -0.25F, 3F, 0F, -0.25F, -3F, 0F, -0.25F); // Import TW_2
		tailWheelModel[1].setRotationPoint(82F, -39F, -1F);

		tailWheelModel[2].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import TW_4
		tailWheelModel[2].setRotationPoint(83F, -36F, -0.5F);

		tailWheelModel[3].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import TW_5
		tailWheelModel[3].setRotationPoint(83F, -32F, -0.5F);
	}

	private void initleftWingWheelModel_1()
	{
		leftWingWheelModel[0] = new ModelRendererTurbo(this, 1, 283, textureX, textureY); // Import LWW_03
		leftWingWheelModel[1] = new ModelRendererTurbo(this, 41, 283, textureX, textureY); // Import LWW_04
		leftWingWheelModel[2] = new ModelRendererTurbo(this, 81, 283, textureX, textureY); // Import LWW_05
		leftWingWheelModel[3] = new ModelRendererTurbo(this, 121, 283, textureX, textureY); // Import LWW_07
		leftWingWheelModel[4] = new ModelRendererTurbo(this, 129, 283, textureX, textureY); // Import LWW_08
		leftWingWheelModel[5] = new ModelRendererTurbo(this, 145, 283, textureX, textureY); // Import LWW_09
		leftWingWheelModel[6] = new ModelRendererTurbo(this, 161, 283, textureX, textureY); // Import LWW_06
		leftWingWheelModel[7] = new ModelRendererTurbo(this, 25, 283, textureX, textureY); // Box 250
		leftWingWheelModel[8] = new ModelRendererTurbo(this, 169, 283, textureX, textureY); // Box 251

		leftWingWheelModel[0].addShapeBox(0F, 0F, 0F, 14, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import LWW_03
		leftWingWheelModel[0].setRotationPoint(-68F, -14F, -39F);

		leftWingWheelModel[1].addBox(0F, 0F, 0F, 14, 6, 4, 0F); // Import LWW_04
		leftWingWheelModel[1].setRotationPoint(-68F, -20F, -39F);

		leftWingWheelModel[2].addShapeBox(0F, 0F, 0F, 14, 4, 4, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LWW_05
		leftWingWheelModel[2].setRotationPoint(-68F, -24F, -39F);

		leftWingWheelModel[3].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F,-1.66666667F, 0F, 0F, 1.66666667F, 0F, 0F, 1.66666667F, 0F, 0F, -1.66666667F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LWW_07
		leftWingWheelModel[3].setRotationPoint(-62F, -24F, -35F);

		leftWingWheelModel[4].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,-2.08333333F, -2F, 0F, 2.08333333F, -2F, 0F, 2.29166667F, -1F, 0F, -2.29166667F, -1F, 0F, -1.66666667F, 0F, -3F, 1.66666667F, 0F, -3F, 1.66666667F, 0F, 2F, -1.66666667F, 0F, 2F); // Import LWW_08
		leftWingWheelModel[4].setRotationPoint(-62F, -28F, -38F);

		leftWingWheelModel[5].addShapeBox(0F, 0F, 0F, 2, 17, 2, 0F,-6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, -2.08333333F, 0F, 0F, 2.08333333F, 0F, 0F, 2.08333333F, 0F, 0F, -2.08333333F, 0F, 0F); // Import LWW_09
		leftWingWheelModel[5].setRotationPoint(-62F, -43F, -38F);

		leftWingWheelModel[6].addBox(0F, 0F, 0F, 2, 2, 5, 0F); // Import LWW_06
		leftWingWheelModel[6].setRotationPoint(-62F, -18F, -39.5F);

		leftWingWheelModel[7].addShapeBox(0F, 0F, 0F, 1, 4, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 250
		leftWingWheelModel[7].setRotationPoint(-62F, -38F, -36F);

		leftWingWheelModel[8].addShapeBox(0F, 0F, 0F, 2, 4, 13, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 251
		leftWingWheelModel[8].setRotationPoint(-62F, -42F, -36F);
	}

	private void initrightWingWheelModel_1()
	{
		rightWingWheelModel[0] = new ModelRendererTurbo(this, 1, 303, textureX, textureY); // Box 241
		rightWingWheelModel[1] = new ModelRendererTurbo(this, 41, 303, textureX, textureY); // Box 242
		rightWingWheelModel[2] = new ModelRendererTurbo(this, 81, 303, textureX, textureY); // Box 243
		rightWingWheelModel[3] = new ModelRendererTurbo(this, 121, 303, textureX, textureY); // Box 244
		rightWingWheelModel[4] = new ModelRendererTurbo(this, 129, 303, textureX, textureY); // Box 245
		rightWingWheelModel[5] = new ModelRendererTurbo(this, 145, 303, textureX, textureY); // Box 246
		rightWingWheelModel[6] = new ModelRendererTurbo(this, 161, 303, textureX, textureY); // Box 247
		rightWingWheelModel[7] = new ModelRendererTurbo(this, 25, 303, textureX, textureY); // Box 248
		rightWingWheelModel[8] = new ModelRendererTurbo(this, 169, 303, textureX, textureY); // Box 249

		rightWingWheelModel[0].addShapeBox(0F, 0F, 0F, 14, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 241
		rightWingWheelModel[0].setRotationPoint(-68F, -14F, 35F);

		rightWingWheelModel[1].addBox(0F, 0F, 0F, 14, 6, 4, 0F); // Box 242
		rightWingWheelModel[1].setRotationPoint(-68F, -20F, 35F);

		rightWingWheelModel[2].addShapeBox(0F, 0F, 0F, 14, 4, 4, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		rightWingWheelModel[2].setRotationPoint(-68F, -24F, 35F);

		rightWingWheelModel[3].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F,-1.66666667F, 0F, 0F, 1.66666667F, 0F, 0F, 1.66666667F, 0F, 0F, -1.66666667F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		rightWingWheelModel[3].setRotationPoint(-62F, -24F, 34F);

		rightWingWheelModel[4].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,-2.29166667F, -1F, 0F, 2.29166667F, -1F, 0F, 2.08333333F, -2F, 0F, -2.08333333F, -2F, 0F, -1.66666667F, 0F, 2F, 1.66666667F, 0F, 2F, 1.66666667F, 0F, -3F, -1.66666667F, 0F, -3F); // Box 245
		rightWingWheelModel[4].setRotationPoint(-62F, -28F, 36F);

		rightWingWheelModel[5].addShapeBox(0F, 0F, 0F, 2, 17, 2, 0F,-6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, -2.08333333F, 0F, 0F, 2.08333333F, 0F, 0F, 2.08333333F, 0F, 0F, -2.08333333F, 0F, 0F); // Box 246
		rightWingWheelModel[5].setRotationPoint(-62F, -43F, 36F);

		rightWingWheelModel[6].addBox(0F, 0F, 0F, 2, 2, 5, 0F); // Box 247
		rightWingWheelModel[6].setRotationPoint(-62F, -18F, 34.5F);

		rightWingWheelModel[7].addShapeBox(0F, 0F, 0F, 1, 4, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		rightWingWheelModel[7].setRotationPoint(-62F, -38F, 23F);

		rightWingWheelModel[8].addShapeBox(0F, 0F, 0F, 2, 4, 13, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 249
		rightWingWheelModel[8].setRotationPoint(-62F, -42F, 23F);
	}

	private void initPropeller()
	{
		propellerModels = new ModelRendererTurbo[1][3];
		propellerModels[0] = makeProp1(-107.5F, -53F, 0F);
	}

	private ModelRendererTurbo[] makeProp1(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[3];
		prop[0] = new ModelRendererTurbo(this, 0, 207, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 207, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 0, 207, textureX, textureY);
		prop[0].addBox(-1F, -39F, -2.5F, 2, 39, 5, 0.0F);
		prop[1].addBox(-1F, -39F, -2.5F, 2, 39, 5, 0.0F);
		prop[2].addBox(-1F, -39F, -2.5F, 2, 39, 5, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		return prop;
	}
}