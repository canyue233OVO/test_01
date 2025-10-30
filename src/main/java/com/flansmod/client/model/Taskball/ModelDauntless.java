//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: sbd5
// Model Creator: 
// Created on: 09.03.2023 - 22:55:35
// Last changed on: 09.03.2023 - 22:55:35

package com.flansmod.client.model.Taskball; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelDauntless extends ModelPlane //Same as Filename
{
	int textureX = 2048;
	int textureY = 1024;

	public ModelDauntless() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[451];
		noseModel = new ModelRendererTurbo[146];
		tailModel = new ModelRendererTurbo[100];
		bayModel = new ModelRendererTurbo[24];
		leftWingModel = new ModelRendererTurbo[60];
		rightWingModel = new ModelRendererTurbo[58];
		yawFlapModel = new ModelRendererTurbo[2];
		pitchFlapLeftModel = new ModelRendererTurbo[1];
		pitchFlapRightModel = new ModelRendererTurbo[1];
		tailWheelModel = new ModelRendererTurbo[9];
		leftWingWheelModel = new ModelRendererTurbo[5];
		rightWingWheelModel = new ModelRendererTurbo[5];
		leftWingPos1Model = new ModelRendererTurbo[8];
		leftWingPos2Model = new ModelRendererTurbo[5];
		rightWingPos1Model = new ModelRendererTurbo[8];
		rightWingPos2Model = new ModelRendererTurbo[5];

		initbodyModel_1();
		initnoseModel_1();
		inittailModel_1();
		initbayModel_1();
		initleftWingModel_1();
		initrightWingModel_1();
		inityawFlapModel_1();
		initpitchFlapLeftModel_1();
		initpitchFlapRightModel_1();
		inittailWheelModel_1();
		initleftWingWheelModel_1();
		initrightWingWheelModel_1();
		initleftWingPos1Model_1();
		initleftWingPos2Model_1();
		initrightWingPos1Model_1();
		initrightWingPos2Model_1();

		initPropeller();

		initGuns();

		translateAll(0F, 29F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 934, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 105, 934, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 201, 934, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 289, 934, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 409, 934, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 521, 934, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 633, 934, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 681, 934, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 729, 934, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 761, 934, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 825, 934, textureX, textureY); // Box 10
		bodyModel[11] = new ModelRendererTurbo(this, 1, 896, textureX, textureY); // Box 11
		bodyModel[12] = new ModelRendererTurbo(this, 41, 896, textureX, textureY); // Box 12
		bodyModel[13] = new ModelRendererTurbo(this, 81, 896, textureX, textureY); // Box 13
		bodyModel[14] = new ModelRendererTurbo(this, 121, 896, textureX, textureY); // Box 14
		bodyModel[15] = new ModelRendererTurbo(this, 161, 896, textureX, textureY); // Box 15
		bodyModel[16] = new ModelRendererTurbo(this, 233, 896, textureX, textureY); // Box 16
		bodyModel[17] = new ModelRendererTurbo(this, 305, 896, textureX, textureY); // Box 17
		bodyModel[18] = new ModelRendererTurbo(this, 377, 896, textureX, textureY); // Box 18
		bodyModel[19] = new ModelRendererTurbo(this, 417, 896, textureX, textureY); // Box 19
		bodyModel[20] = new ModelRendererTurbo(this, 873, 934, textureX, textureY); // Box 4
		bodyModel[21] = new ModelRendererTurbo(this, 921, 934, textureX, textureY); // Box 5
		bodyModel[22] = new ModelRendererTurbo(this, 969, 934, textureX, textureY); // Box 6
		bodyModel[23] = new ModelRendererTurbo(this, 993, 934, textureX, textureY); // Box 7
		bodyModel[24] = new ModelRendererTurbo(this, 1057, 934, textureX, textureY); // Box 28
		bodyModel[25] = new ModelRendererTurbo(this, 1121, 934, textureX, textureY); // Box 34
		bodyModel[26] = new ModelRendererTurbo(this, 393, 934, textureX, textureY); // Box 54
		bodyModel[27] = new ModelRendererTurbo(this, 481, 896, textureX, textureY); // Box 55
		bodyModel[28] = new ModelRendererTurbo(this, 745, 896, textureX, textureY); // Box 59
		bodyModel[29] = new ModelRendererTurbo(this, 785, 896, textureX, textureY); // Box 60
		bodyModel[30] = new ModelRendererTurbo(this, 1169, 934, textureX, textureY); // Box 65
		bodyModel[31] = new ModelRendererTurbo(this, 809, 934, textureX, textureY); // Box 66
		bodyModel[32] = new ModelRendererTurbo(this, 513, 934, textureX, textureY); // Box 67
		bodyModel[33] = new ModelRendererTurbo(this, 1041, 934, textureX, textureY); // Box 68
		bodyModel[34] = new ModelRendererTurbo(this, 1, 556, textureX, textureY); // Box 70
		bodyModel[35] = new ModelRendererTurbo(this, 1, 377, textureX, textureY); // Box 71
		bodyModel[36] = new ModelRendererTurbo(this, 33, 377, textureX, textureY); // Box 72
		bodyModel[37] = new ModelRendererTurbo(this, 65, 377, textureX, textureY); // Box 73
		bodyModel[38] = new ModelRendererTurbo(this, 1249, 934, textureX, textureY); // Box 74
		bodyModel[39] = new ModelRendererTurbo(this, 417, 934, textureX, textureY); // Box 75
		bodyModel[40] = new ModelRendererTurbo(this, 833, 934, textureX, textureY); // Box 76
		bodyModel[41] = new ModelRendererTurbo(this, 1105, 934, textureX, textureY); // Box 77
		bodyModel[42] = new ModelRendererTurbo(this, 1337, 934, textureX, textureY); // Box 78
		bodyModel[43] = new ModelRendererTurbo(this, 1345, 934, textureX, textureY); // Box 79
		bodyModel[44] = new ModelRendererTurbo(this, 1353, 934, textureX, textureY); // Box 80
		bodyModel[45] = new ModelRendererTurbo(this, 97, 934, textureX, textureY); // Box 81
		bodyModel[46] = new ModelRendererTurbo(this, 297, 934, textureX, textureY); // Box 82
		bodyModel[47] = new ModelRendererTurbo(this, 617, 934, textureX, textureY); // Box 83
		bodyModel[48] = new ModelRendererTurbo(this, 721, 934, textureX, textureY); // Box 84
		bodyModel[49] = new ModelRendererTurbo(this, 409, 934, textureX, textureY); // Box 85
		bodyModel[50] = new ModelRendererTurbo(this, 673, 934, textureX, textureY); // Box 86
		bodyModel[51] = new ModelRendererTurbo(this, 1361, 934, textureX, textureY); // Box 87
		bodyModel[52] = new ModelRendererTurbo(this, 913, 934, textureX, textureY); // Box 88
		bodyModel[53] = new ModelRendererTurbo(this, 1377, 934, textureX, textureY); // Box 89
		bodyModel[54] = new ModelRendererTurbo(this, 1121, 934, textureX, textureY); // Box 90
		bodyModel[55] = new ModelRendererTurbo(this, 681, 934, textureX, textureY); // Box 91
		bodyModel[56] = new ModelRendererTurbo(this, 769, 934, textureX, textureY); // Box 92
		bodyModel[57] = new ModelRendererTurbo(this, 1393, 934, textureX, textureY); // Box 93
		bodyModel[58] = new ModelRendererTurbo(this, 961, 934, textureX, textureY); // Box 94
		bodyModel[59] = new ModelRendererTurbo(this, 1409, 934, textureX, textureY); // Box 95
		bodyModel[60] = new ModelRendererTurbo(this, 625, 934, textureX, textureY); // Box 148
		bodyModel[61] = new ModelRendererTurbo(this, 1425, 934, textureX, textureY); // Box 149
		bodyModel[62] = new ModelRendererTurbo(this, 729, 934, textureX, textureY); // Box 150
		bodyModel[63] = new ModelRendererTurbo(this, 1441, 934, textureX, textureY); // Box 151
		bodyModel[64] = new ModelRendererTurbo(this, 1449, 934, textureX, textureY); // Box 152
		bodyModel[65] = new ModelRendererTurbo(this, 1473, 934, textureX, textureY); // Box 153
		bodyModel[66] = new ModelRendererTurbo(this, 1481, 934, textureX, textureY); // Box 154
		bodyModel[67] = new ModelRendererTurbo(this, 1041, 934, textureX, textureY); // Box 155
		bodyModel[68] = new ModelRendererTurbo(this, 1497, 934, textureX, textureY); // Box 156
		bodyModel[69] = new ModelRendererTurbo(this, 1, 956, textureX, textureY); // Box 196
		bodyModel[70] = new ModelRendererTurbo(this, 105, 956, textureX, textureY); // Box 197
		bodyModel[71] = new ModelRendererTurbo(this, 201, 956, textureX, textureY); // Box 198
		bodyModel[72] = new ModelRendererTurbo(this, 289, 956, textureX, textureY); // Box 199
		bodyModel[73] = new ModelRendererTurbo(this, 409, 956, textureX, textureY); // Box 200
		bodyModel[74] = new ModelRendererTurbo(this, 521, 956, textureX, textureY); // Box 201
		bodyModel[75] = new ModelRendererTurbo(this, 633, 956, textureX, textureY); // Box 202
		bodyModel[76] = new ModelRendererTurbo(this, 681, 956, textureX, textureY); // Box 203
		bodyModel[77] = new ModelRendererTurbo(this, 729, 956, textureX, textureY); // Box 204
		bodyModel[78] = new ModelRendererTurbo(this, 761, 956, textureX, textureY); // Box 205
		bodyModel[79] = new ModelRendererTurbo(this, 825, 956, textureX, textureY); // Box 206
		bodyModel[80] = new ModelRendererTurbo(this, 1, 915, textureX, textureY); // Box 207
		bodyModel[81] = new ModelRendererTurbo(this, 41, 915, textureX, textureY); // Box 208
		bodyModel[82] = new ModelRendererTurbo(this, 81, 915, textureX, textureY); // Box 209
		bodyModel[83] = new ModelRendererTurbo(this, 121, 915, textureX, textureY); // Box 210
		bodyModel[84] = new ModelRendererTurbo(this, 161, 915, textureX, textureY); // Box 211
		bodyModel[85] = new ModelRendererTurbo(this, 233, 915, textureX, textureY); // Box 212
		bodyModel[86] = new ModelRendererTurbo(this, 305, 915, textureX, textureY); // Box 213
		bodyModel[87] = new ModelRendererTurbo(this, 377, 915, textureX, textureY); // Box 214
		bodyModel[88] = new ModelRendererTurbo(this, 417, 915, textureX, textureY); // Box 215
		bodyModel[89] = new ModelRendererTurbo(this, 873, 956, textureX, textureY); // Box 216
		bodyModel[90] = new ModelRendererTurbo(this, 921, 956, textureX, textureY); // Box 217
		bodyModel[91] = new ModelRendererTurbo(this, 969, 956, textureX, textureY); // Box 218
		bodyModel[92] = new ModelRendererTurbo(this, 993, 956, textureX, textureY); // Box 219
		bodyModel[93] = new ModelRendererTurbo(this, 1057, 956, textureX, textureY); // Box 226
		bodyModel[94] = new ModelRendererTurbo(this, 1121, 956, textureX, textureY); // Box 228
		bodyModel[95] = new ModelRendererTurbo(this, 393, 956, textureX, textureY); // Box 249
		bodyModel[96] = new ModelRendererTurbo(this, 481, 915, textureX, textureY); // Box 250
		bodyModel[97] = new ModelRendererTurbo(this, 745, 915, textureX, textureY); // Box 254
		bodyModel[98] = new ModelRendererTurbo(this, 785, 915, textureX, textureY); // Box 255
		bodyModel[99] = new ModelRendererTurbo(this, 1169, 956, textureX, textureY); // Box 260
		bodyModel[100] = new ModelRendererTurbo(this, 809, 956, textureX, textureY); // Box 261
		bodyModel[101] = new ModelRendererTurbo(this, 513, 956, textureX, textureY); // Box 262
		bodyModel[102] = new ModelRendererTurbo(this, 1041, 956, textureX, textureY); // Box 263
		bodyModel[103] = new ModelRendererTurbo(this, 537, 915, textureX, textureY); // Box 265
		bodyModel[104] = new ModelRendererTurbo(this, 225, 377, textureX, textureY); // Box 266
		bodyModel[105] = new ModelRendererTurbo(this, 257, 377, textureX, textureY); // Box 267
		bodyModel[106] = new ModelRendererTurbo(this, 289, 377, textureX, textureY); // Box 268
		bodyModel[107] = new ModelRendererTurbo(this, 1249, 956, textureX, textureY); // Box 269
		bodyModel[108] = new ModelRendererTurbo(this, 417, 956, textureX, textureY); // Box 270
		bodyModel[109] = new ModelRendererTurbo(this, 833, 956, textureX, textureY); // Box 271
		bodyModel[110] = new ModelRendererTurbo(this, 1105, 956, textureX, textureY); // Box 272
		bodyModel[111] = new ModelRendererTurbo(this, 1337, 956, textureX, textureY); // Box 273
		bodyModel[112] = new ModelRendererTurbo(this, 1345, 956, textureX, textureY); // Box 274
		bodyModel[113] = new ModelRendererTurbo(this, 1353, 956, textureX, textureY); // Box 275
		bodyModel[114] = new ModelRendererTurbo(this, 97, 956, textureX, textureY); // Box 276
		bodyModel[115] = new ModelRendererTurbo(this, 297, 956, textureX, textureY); // Box 277
		bodyModel[116] = new ModelRendererTurbo(this, 617, 956, textureX, textureY); // Box 278
		bodyModel[117] = new ModelRendererTurbo(this, 721, 956, textureX, textureY); // Box 279
		bodyModel[118] = new ModelRendererTurbo(this, 409, 956, textureX, textureY); // Box 280
		bodyModel[119] = new ModelRendererTurbo(this, 673, 956, textureX, textureY); // Box 281
		bodyModel[120] = new ModelRendererTurbo(this, 1361, 956, textureX, textureY); // Box 282
		bodyModel[121] = new ModelRendererTurbo(this, 913, 956, textureX, textureY); // Box 283
		bodyModel[122] = new ModelRendererTurbo(this, 1377, 956, textureX, textureY); // Box 284
		bodyModel[123] = new ModelRendererTurbo(this, 1121, 956, textureX, textureY); // Box 285
		bodyModel[124] = new ModelRendererTurbo(this, 681, 956, textureX, textureY); // Box 286
		bodyModel[125] = new ModelRendererTurbo(this, 769, 956, textureX, textureY); // Box 287
		bodyModel[126] = new ModelRendererTurbo(this, 1393, 956, textureX, textureY); // Box 288
		bodyModel[127] = new ModelRendererTurbo(this, 961, 956, textureX, textureY); // Box 289
		bodyModel[128] = new ModelRendererTurbo(this, 1409, 956, textureX, textureY); // Box 290
		bodyModel[129] = new ModelRendererTurbo(this, 625, 956, textureX, textureY); // Box 343
		bodyModel[130] = new ModelRendererTurbo(this, 1425, 956, textureX, textureY); // Box 344
		bodyModel[131] = new ModelRendererTurbo(this, 729, 956, textureX, textureY); // Box 345
		bodyModel[132] = new ModelRendererTurbo(this, 1441, 956, textureX, textureY); // Box 346
		bodyModel[133] = new ModelRendererTurbo(this, 1449, 956, textureX, textureY); // Box 347
		bodyModel[134] = new ModelRendererTurbo(this, 1473, 956, textureX, textureY); // Box 348
		bodyModel[135] = new ModelRendererTurbo(this, 1481, 956, textureX, textureY); // Box 349
		bodyModel[136] = new ModelRendererTurbo(this, 1041, 956, textureX, textureY); // Box 350
		bodyModel[137] = new ModelRendererTurbo(this, 1497, 956, textureX, textureY); // Box 351
		bodyModel[138] = new ModelRendererTurbo(this, 441, 377, textureX, textureY); // Box 484
		bodyModel[139] = new ModelRendererTurbo(this, 25, 377, textureX, textureY); // Box 485
		bodyModel[140] = new ModelRendererTurbo(this, 57, 377, textureX, textureY); // Box 487
		bodyModel[141] = new ModelRendererTurbo(this, 465, 377, textureX, textureY); // Box 488
		bodyModel[142] = new ModelRendererTurbo(this, 497, 377, textureX, textureY); // Box 489
		bodyModel[143] = new ModelRendererTurbo(this, 513, 377, textureX, textureY); // Box 490
		bodyModel[144] = new ModelRendererTurbo(this, 217, 377, textureX, textureY); // Box 491
		bodyModel[145] = new ModelRendererTurbo(this, 249, 377, textureX, textureY); // Box 492
		bodyModel[146] = new ModelRendererTurbo(this, 537, 377, textureX, textureY); // Box 493
		bodyModel[147] = new ModelRendererTurbo(this, 569, 377, textureX, textureY); // Box 494
		bodyModel[148] = new ModelRendererTurbo(this, 481, 377, textureX, textureY); // Box 495
		bodyModel[149] = new ModelRendererTurbo(this, 593, 377, textureX, textureY); // Box 496
		bodyModel[150] = new ModelRendererTurbo(this, 601, 377, textureX, textureY); // Box 497
		bodyModel[151] = new ModelRendererTurbo(this, 609, 377, textureX, textureY); // Box 498
		bodyModel[152] = new ModelRendererTurbo(this, 617, 377, textureX, textureY); // Box 499
		bodyModel[153] = new ModelRendererTurbo(this, 1505, 956, textureX, textureY); // Box 558
		bodyModel[154] = new ModelRendererTurbo(this, 1553, 956, textureX, textureY); // Box 559
		bodyModel[155] = new ModelRendererTurbo(this, 1601, 956, textureX, textureY); // Box 560
		bodyModel[156] = new ModelRendererTurbo(this, 1649, 956, textureX, textureY); // Box 503
		bodyModel[157] = new ModelRendererTurbo(this, 625, 377, textureX, textureY); // Box 239
		bodyModel[158] = new ModelRendererTurbo(this, 673, 377, textureX, textureY); // Box 240
		bodyModel[159] = new ModelRendererTurbo(this, 657, 377, textureX, textureY); // Box 241
		bodyModel[160] = new ModelRendererTurbo(this, 689, 377, textureX, textureY); // Box 242
		bodyModel[161] = new ModelRendererTurbo(this, 705, 377, textureX, textureY); // Box 243
		bodyModel[162] = new ModelRendererTurbo(this, 729, 377, textureX, textureY); // Box 244
		bodyModel[163] = new ModelRendererTurbo(this, 753, 377, textureX, textureY); // Box 245
		bodyModel[164] = new ModelRendererTurbo(this, 769, 377, textureX, textureY); // Box 246
		bodyModel[165] = new ModelRendererTurbo(this, 793, 377, textureX, textureY); // Box 247
		bodyModel[166] = new ModelRendererTurbo(this, 801, 377, textureX, textureY); // Box 248
		bodyModel[167] = new ModelRendererTurbo(this, 809, 377, textureX, textureY); // Box 250
		bodyModel[168] = new ModelRendererTurbo(this, 817, 377, textureX, textureY); // Box 251
		bodyModel[169] = new ModelRendererTurbo(this, 825, 377, textureX, textureY); // Box 252
		bodyModel[170] = new ModelRendererTurbo(this, 849, 377, textureX, textureY); // Box 253
		bodyModel[171] = new ModelRendererTurbo(this, 1, 377, textureX, textureY); // Box 962
		bodyModel[172] = new ModelRendererTurbo(this, 281, 377, textureX, textureY); // Box 964
		bodyModel[173] = new ModelRendererTurbo(this, 497, 377, textureX, textureY); // Box 966
		bodyModel[174] = new ModelRendererTurbo(this, 873, 377, textureX, textureY); // Box 578
		bodyModel[175] = new ModelRendererTurbo(this, 881, 377, textureX, textureY); // Box 579
		bodyModel[176] = new ModelRendererTurbo(this, 889, 377, textureX, textureY); // Box 580
		bodyModel[177] = new ModelRendererTurbo(this, 913, 377, textureX, textureY); // Box 582
		bodyModel[178] = new ModelRendererTurbo(this, 945, 377, textureX, textureY); // Box 583
		bodyModel[179] = new ModelRendererTurbo(this, 969, 377, textureX, textureY); // Box 584
		bodyModel[180] = new ModelRendererTurbo(this, 985, 377, textureX, textureY); // Box 585
		bodyModel[181] = new ModelRendererTurbo(this, 1001, 377, textureX, textureY); // Box 586
		bodyModel[182] = new ModelRendererTurbo(this, 1025, 377, textureX, textureY); // Box 587
		bodyModel[183] = new ModelRendererTurbo(this, 1041, 377, textureX, textureY); // Box 588
		bodyModel[184] = new ModelRendererTurbo(this, 1065, 377, textureX, textureY); // Box 589
		bodyModel[185] = new ModelRendererTurbo(this, 1073, 377, textureX, textureY); // Box 590
		bodyModel[186] = new ModelRendererTurbo(this, 561, 377, textureX, textureY); // Box 591
		bodyModel[187] = new ModelRendererTurbo(this, 625, 377, textureX, textureY); // Box 592
		bodyModel[188] = new ModelRendererTurbo(this, 673, 377, textureX, textureY); // Box 593
		bodyModel[189] = new ModelRendererTurbo(this, 1081, 377, textureX, textureY); // Box 594
		bodyModel[190] = new ModelRendererTurbo(this, 1081, 377, textureX, textureY); // Box 262
		bodyModel[191] = new ModelRendererTurbo(this, 1145, 377, textureX, textureY); // Box 255
		bodyModel[192] = new ModelRendererTurbo(this, 1185, 377, textureX, textureY); // Box 257
		bodyModel[193] = new ModelRendererTurbo(this, 1209, 377, textureX, textureY); // Box 258
		bodyModel[194] = new ModelRendererTurbo(this, 1129, 377, textureX, textureY); // Box 213
		bodyModel[195] = new ModelRendererTurbo(this, 1169, 377, textureX, textureY); // Box 214
		bodyModel[196] = new ModelRendererTurbo(this, 289, 377, textureX, textureY); // Box 233
		bodyModel[197] = new ModelRendererTurbo(this, 481, 377, textureX, textureY); // Box 234
		bodyModel[198] = new ModelRendererTurbo(this, 569, 377, textureX, textureY); // Box 235
		bodyModel[199] = new ModelRendererTurbo(this, 585, 377, textureX, textureY); // Box 236
		bodyModel[200] = new ModelRendererTurbo(this, 721, 377, textureX, textureY); // Box 237
		bodyModel[201] = new ModelRendererTurbo(this, 729, 377, textureX, textureY); // Box 238
		bodyModel[202] = new ModelRendererTurbo(this, 745, 377, textureX, textureY); // Box 239
		bodyModel[203] = new ModelRendererTurbo(this, 753, 377, textureX, textureY); // Box 240
		bodyModel[204] = new ModelRendererTurbo(this, 769, 377, textureX, textureY); // Box 241
		bodyModel[205] = new ModelRendererTurbo(this, 785, 377, textureX, textureY); // Box 242
		bodyModel[206] = new ModelRendererTurbo(this, 889, 377, textureX, textureY); // Box 243
		bodyModel[207] = new ModelRendererTurbo(this, 905, 377, textureX, textureY); // Box 244
		bodyModel[208] = new ModelRendererTurbo(this, 913, 377, textureX, textureY); // Box 248
		bodyModel[209] = new ModelRendererTurbo(this, 1057, 377, textureX, textureY); // Box 249
		bodyModel[210] = new ModelRendererTurbo(this, 1081, 377, textureX, textureY); // Box 250
		bodyModel[211] = new ModelRendererTurbo(this, 1129, 377, textureX, textureY); // Box 251
		bodyModel[212] = new ModelRendererTurbo(this, 1145, 377, textureX, textureY); // Box 252
		bodyModel[213] = new ModelRendererTurbo(this, 1153, 377, textureX, textureY); // Box 253
		bodyModel[214] = new ModelRendererTurbo(this, 1169, 377, textureX, textureY); // Box 254
		bodyModel[215] = new ModelRendererTurbo(this, 1185, 377, textureX, textureY); // Box 255
		bodyModel[216] = new ModelRendererTurbo(this, 1193, 377, textureX, textureY); // Box 256
		bodyModel[217] = new ModelRendererTurbo(this, 1209, 377, textureX, textureY); // Box 257
		bodyModel[218] = new ModelRendererTurbo(this, 1217, 377, textureX, textureY); // Box 258
		bodyModel[219] = new ModelRendererTurbo(this, 1233, 377, textureX, textureY); // Box 259
		bodyModel[220] = new ModelRendererTurbo(this, 1241, 377, textureX, textureY); // Box 260
		bodyModel[221] = new ModelRendererTurbo(this, 1249, 377, textureX, textureY); // Box 261
		bodyModel[222] = new ModelRendererTurbo(this, 1257, 377, textureX, textureY); // Box 262
		bodyModel[223] = new ModelRendererTurbo(this, 1265, 377, textureX, textureY); // Box 263
		bodyModel[224] = new ModelRendererTurbo(this, 1273, 377, textureX, textureY); // Box 265
		bodyModel[225] = new ModelRendererTurbo(this, 1281, 377, textureX, textureY); // Box 266
		bodyModel[226] = new ModelRendererTurbo(this, 1289, 377, textureX, textureY); // Box 267
		bodyModel[227] = new ModelRendererTurbo(this, 1297, 377, textureX, textureY); // Box 268
		bodyModel[228] = new ModelRendererTurbo(this, 1305, 377, textureX, textureY); // Box 269
		bodyModel[229] = new ModelRendererTurbo(this, 1313, 377, textureX, textureY); // Box 270
		bodyModel[230] = new ModelRendererTurbo(this, 1321, 377, textureX, textureY); // Box 271
		bodyModel[231] = new ModelRendererTurbo(this, 1329, 377, textureX, textureY); // Box 272
		bodyModel[232] = new ModelRendererTurbo(this, 1337, 377, textureX, textureY); // Box 273
		bodyModel[233] = new ModelRendererTurbo(this, 1345, 377, textureX, textureY); // Box 274
		bodyModel[234] = new ModelRendererTurbo(this, 1353, 377, textureX, textureY); // Box 275
		bodyModel[235] = new ModelRendererTurbo(this, 1361, 377, textureX, textureY); // Box 276
		bodyModel[236] = new ModelRendererTurbo(this, 1369, 377, textureX, textureY); // Box 277
		bodyModel[237] = new ModelRendererTurbo(this, 1377, 377, textureX, textureY); // Box 278
		bodyModel[238] = new ModelRendererTurbo(this, 1385, 377, textureX, textureY); // Box 279
		bodyModel[239] = new ModelRendererTurbo(this, 1393, 377, textureX, textureY); // Box 280
		bodyModel[240] = new ModelRendererTurbo(this, 1401, 377, textureX, textureY); // Box 281
		bodyModel[241] = new ModelRendererTurbo(this, 1409, 377, textureX, textureY); // Box 282
		bodyModel[242] = new ModelRendererTurbo(this, 1417, 377, textureX, textureY); // Box 283
		bodyModel[243] = new ModelRendererTurbo(this, 1425, 377, textureX, textureY); // Box 284
		bodyModel[244] = new ModelRendererTurbo(this, 1433, 377, textureX, textureY); // Box 285
		bodyModel[245] = new ModelRendererTurbo(this, 1441, 377, textureX, textureY); // Box 286
		bodyModel[246] = new ModelRendererTurbo(this, 1449, 377, textureX, textureY); // Box 287
		bodyModel[247] = new ModelRendererTurbo(this, 1457, 377, textureX, textureY); // Box 288
		bodyModel[248] = new ModelRendererTurbo(this, 1465, 377, textureX, textureY); // Box 289
		bodyModel[249] = new ModelRendererTurbo(this, 1473, 377, textureX, textureY); // Box 290
		bodyModel[250] = new ModelRendererTurbo(this, 1481, 377, textureX, textureY); // Box 318
		bodyModel[251] = new ModelRendererTurbo(this, 1489, 377, textureX, textureY); // Box 319
		bodyModel[252] = new ModelRendererTurbo(this, 1497, 377, textureX, textureY); // Box 320
		bodyModel[253] = new ModelRendererTurbo(this, 1505, 377, textureX, textureY); // Box 321
		bodyModel[254] = new ModelRendererTurbo(this, 1513, 377, textureX, textureY); // Box 322
		bodyModel[255] = new ModelRendererTurbo(this, 1521, 377, textureX, textureY); // Box 323
		bodyModel[256] = new ModelRendererTurbo(this, 1529, 377, textureX, textureY); // Box 324
		bodyModel[257] = new ModelRendererTurbo(this, 1537, 377, textureX, textureY); // Box 325
		bodyModel[258] = new ModelRendererTurbo(this, 1545, 377, textureX, textureY); // Box 326
		bodyModel[259] = new ModelRendererTurbo(this, 1553, 377, textureX, textureY); // Box 327
		bodyModel[260] = new ModelRendererTurbo(this, 1561, 377, textureX, textureY); // Box 328
		bodyModel[261] = new ModelRendererTurbo(this, 1569, 377, textureX, textureY); // Box 329
		bodyModel[262] = new ModelRendererTurbo(this, 1577, 377, textureX, textureY); // Box 330
		bodyModel[263] = new ModelRendererTurbo(this, 1585, 377, textureX, textureY); // Box 331
		bodyModel[264] = new ModelRendererTurbo(this, 1593, 377, textureX, textureY); // Box 332
		bodyModel[265] = new ModelRendererTurbo(this, 1601, 377, textureX, textureY); // Box 333
		bodyModel[266] = new ModelRendererTurbo(this, 1609, 377, textureX, textureY); // Box 334
		bodyModel[267] = new ModelRendererTurbo(this, 1617, 377, textureX, textureY); // Box 340
		bodyModel[268] = new ModelRendererTurbo(this, 1625, 377, textureX, textureY); // Box 341
		bodyModel[269] = new ModelRendererTurbo(this, 1633, 377, textureX, textureY); // Box 342
		bodyModel[270] = new ModelRendererTurbo(this, 1641, 377, textureX, textureY); // Box 343
		bodyModel[271] = new ModelRendererTurbo(this, 1649, 377, textureX, textureY); // Box 344
		bodyModel[272] = new ModelRendererTurbo(this, 1657, 377, textureX, textureY); // Box 345
		bodyModel[273] = new ModelRendererTurbo(this, 1665, 377, textureX, textureY); // Box 346
		bodyModel[274] = new ModelRendererTurbo(this, 1673, 377, textureX, textureY); // Box 347
		bodyModel[275] = new ModelRendererTurbo(this, 1681, 377, textureX, textureY); // Box 348
		bodyModel[276] = new ModelRendererTurbo(this, 1689, 377, textureX, textureY); // Box 349
		bodyModel[277] = new ModelRendererTurbo(this, 1697, 377, textureX, textureY); // Box 350
		bodyModel[278] = new ModelRendererTurbo(this, 1705, 377, textureX, textureY); // Box 351
		bodyModel[279] = new ModelRendererTurbo(this, 1713, 377, textureX, textureY); // Box 352
		bodyModel[280] = new ModelRendererTurbo(this, 1721, 377, textureX, textureY); // Box 353
		bodyModel[281] = new ModelRendererTurbo(this, 1729, 377, textureX, textureY); // Box 354
		bodyModel[282] = new ModelRendererTurbo(this, 1737, 377, textureX, textureY); // Box 355
		bodyModel[283] = new ModelRendererTurbo(this, 1745, 377, textureX, textureY); // Box 356
		bodyModel[284] = new ModelRendererTurbo(this, 1753, 377, textureX, textureY); // Box 387
		bodyModel[285] = new ModelRendererTurbo(this, 1761, 377, textureX, textureY); // Box 388
		bodyModel[286] = new ModelRendererTurbo(this, 1769, 377, textureX, textureY); // Box 390
		bodyModel[287] = new ModelRendererTurbo(this, 1777, 377, textureX, textureY); // Box 391
		bodyModel[288] = new ModelRendererTurbo(this, 1785, 377, textureX, textureY); // Box 392
		bodyModel[289] = new ModelRendererTurbo(this, 1793, 377, textureX, textureY); // Box 393
		bodyModel[290] = new ModelRendererTurbo(this, 1801, 377, textureX, textureY); // Box 394
		bodyModel[291] = new ModelRendererTurbo(this, 1809, 377, textureX, textureY); // Box 395
		bodyModel[292] = new ModelRendererTurbo(this, 1817, 377, textureX, textureY); // Box 396
		bodyModel[293] = new ModelRendererTurbo(this, 1825, 377, textureX, textureY); // Box 397
		bodyModel[294] = new ModelRendererTurbo(this, 1833, 377, textureX, textureY); // Box 398
		bodyModel[295] = new ModelRendererTurbo(this, 1841, 377, textureX, textureY); // Box 399
		bodyModel[296] = new ModelRendererTurbo(this, 1849, 377, textureX, textureY); // Box 400
		bodyModel[297] = new ModelRendererTurbo(this, 1857, 377, textureX, textureY); // Box 401
		bodyModel[298] = new ModelRendererTurbo(this, 1865, 377, textureX, textureY); // Box 402
		bodyModel[299] = new ModelRendererTurbo(this, 1873, 377, textureX, textureY); // Box 403
		bodyModel[300] = new ModelRendererTurbo(this, 1881, 377, textureX, textureY); // Box 404
		bodyModel[301] = new ModelRendererTurbo(this, 1889, 377, textureX, textureY); // Box 405
		bodyModel[302] = new ModelRendererTurbo(this, 1897, 377, textureX, textureY); // Box 406
		bodyModel[303] = new ModelRendererTurbo(this, 1905, 377, textureX, textureY); // Box 407
		bodyModel[304] = new ModelRendererTurbo(this, 1913, 377, textureX, textureY); // Box 408
		bodyModel[305] = new ModelRendererTurbo(this, 1921, 377, textureX, textureY); // Box 409
		bodyModel[306] = new ModelRendererTurbo(this, 1929, 377, textureX, textureY); // Box 410
		bodyModel[307] = new ModelRendererTurbo(this, 1937, 377, textureX, textureY); // Box 411
		bodyModel[308] = new ModelRendererTurbo(this, 1945, 377, textureX, textureY); // Box 412
		bodyModel[309] = new ModelRendererTurbo(this, 1953, 377, textureX, textureY); // Box 413
		bodyModel[310] = new ModelRendererTurbo(this, 1961, 377, textureX, textureY); // Box 414
		bodyModel[311] = new ModelRendererTurbo(this, 1969, 377, textureX, textureY); // Box 415
		bodyModel[312] = new ModelRendererTurbo(this, 1977, 377, textureX, textureY); // Box 416
		bodyModel[313] = new ModelRendererTurbo(this, 1985, 377, textureX, textureY); // Box 417
		bodyModel[314] = new ModelRendererTurbo(this, 1993, 377, textureX, textureY); // Box 418
		bodyModel[315] = new ModelRendererTurbo(this, 2001, 377, textureX, textureY); // Box 419
		bodyModel[316] = new ModelRendererTurbo(this, 2009, 377, textureX, textureY); // Box 421
		bodyModel[317] = new ModelRendererTurbo(this, 2017, 377, textureX, textureY); // Box 422
		bodyModel[318] = new ModelRendererTurbo(this, 2025, 377, textureX, textureY); // Box 423
		bodyModel[319] = new ModelRendererTurbo(this, 2033, 377, textureX, textureY); // Box 424
		bodyModel[320] = new ModelRendererTurbo(this, 2041, 377, textureX, textureY); // Box 425
		bodyModel[321] = new ModelRendererTurbo(this, 449, 385, textureX, textureY); // Box 426
		bodyModel[322] = new ModelRendererTurbo(this, 457, 385, textureX, textureY); // Box 427
		bodyModel[323] = new ModelRendererTurbo(this, 529, 385, textureX, textureY); // Box 428
		bodyModel[324] = new ModelRendererTurbo(this, 697, 385, textureX, textureY); // Box 429
		bodyModel[325] = new ModelRendererTurbo(this, 825, 385, textureX, textureY); // Box 430
		bodyModel[326] = new ModelRendererTurbo(this, 833, 385, textureX, textureY); // Box 431
		bodyModel[327] = new ModelRendererTurbo(this, 841, 385, textureX, textureY); // Box 432
		bodyModel[328] = new ModelRendererTurbo(this, 849, 385, textureX, textureY); // Box 433
		bodyModel[329] = new ModelRendererTurbo(this, 857, 385, textureX, textureY); // Box 434
		bodyModel[330] = new ModelRendererTurbo(this, 865, 385, textureX, textureY); // Box 435
		bodyModel[331] = new ModelRendererTurbo(this, 961, 385, textureX, textureY); // Box 436
		bodyModel[332] = new ModelRendererTurbo(this, 969, 385, textureX, textureY); // Box 437
		bodyModel[333] = new ModelRendererTurbo(this, 977, 385, textureX, textureY); // Box 438
		bodyModel[334] = new ModelRendererTurbo(this, 1009, 385, textureX, textureY); // Box 439
		bodyModel[335] = new ModelRendererTurbo(this, 1017, 385, textureX, textureY); // Box 440
		bodyModel[336] = new ModelRendererTurbo(this, 1025, 385, textureX, textureY); // Box 441
		bodyModel[337] = new ModelRendererTurbo(this, 1033, 385, textureX, textureY); // Box 442
		bodyModel[338] = new ModelRendererTurbo(this, 1153, 385, textureX, textureY); // Box 443
		bodyModel[339] = new ModelRendererTurbo(this, 1193, 385, textureX, textureY); // Box 444
		bodyModel[340] = new ModelRendererTurbo(this, 1209, 385, textureX, textureY); // Box 445
		bodyModel[341] = new ModelRendererTurbo(this, 1217, 385, textureX, textureY); // Box 446
		bodyModel[342] = new ModelRendererTurbo(this, 1233, 385, textureX, textureY); // Box 447
		bodyModel[343] = new ModelRendererTurbo(this, 1241, 385, textureX, textureY); // Box 448
		bodyModel[344] = new ModelRendererTurbo(this, 1249, 385, textureX, textureY); // Box 449
		bodyModel[345] = new ModelRendererTurbo(this, 1257, 385, textureX, textureY); // Box 450
		bodyModel[346] = new ModelRendererTurbo(this, 1265, 385, textureX, textureY); // Box 451
		bodyModel[347] = new ModelRendererTurbo(this, 1273, 385, textureX, textureY); // Box 452
		bodyModel[348] = new ModelRendererTurbo(this, 1281, 385, textureX, textureY); // Box 453
		bodyModel[349] = new ModelRendererTurbo(this, 1289, 385, textureX, textureY); // Box 454
		bodyModel[350] = new ModelRendererTurbo(this, 1297, 385, textureX, textureY); // Box 455
		bodyModel[351] = new ModelRendererTurbo(this, 1305, 385, textureX, textureY); // Box 456
		bodyModel[352] = new ModelRendererTurbo(this, 1313, 385, textureX, textureY); // Box 457
		bodyModel[353] = new ModelRendererTurbo(this, 1321, 385, textureX, textureY); // Box 458
		bodyModel[354] = new ModelRendererTurbo(this, 1329, 385, textureX, textureY); // Box 459
		bodyModel[355] = new ModelRendererTurbo(this, 1337, 385, textureX, textureY); // Box 460
		bodyModel[356] = new ModelRendererTurbo(this, 1345, 385, textureX, textureY); // Box 461
		bodyModel[357] = new ModelRendererTurbo(this, 1353, 385, textureX, textureY); // Box 462
		bodyModel[358] = new ModelRendererTurbo(this, 1361, 385, textureX, textureY); // Box 463
		bodyModel[359] = new ModelRendererTurbo(this, 1369, 385, textureX, textureY); // Box 464
		bodyModel[360] = new ModelRendererTurbo(this, 1377, 385, textureX, textureY); // Box 465
		bodyModel[361] = new ModelRendererTurbo(this, 1385, 385, textureX, textureY); // Box 466
		bodyModel[362] = new ModelRendererTurbo(this, 1393, 385, textureX, textureY); // Box 467
		bodyModel[363] = new ModelRendererTurbo(this, 1401, 385, textureX, textureY); // Box 468
		bodyModel[364] = new ModelRendererTurbo(this, 1409, 385, textureX, textureY); // Box 469
		bodyModel[365] = new ModelRendererTurbo(this, 1417, 385, textureX, textureY); // Box 470
		bodyModel[366] = new ModelRendererTurbo(this, 1425, 385, textureX, textureY); // Box 471
		bodyModel[367] = new ModelRendererTurbo(this, 1433, 385, textureX, textureY); // Box 472
		bodyModel[368] = new ModelRendererTurbo(this, 1441, 385, textureX, textureY); // Box 473
		bodyModel[369] = new ModelRendererTurbo(this, 1449, 385, textureX, textureY); // Box 474
		bodyModel[370] = new ModelRendererTurbo(this, 1457, 385, textureX, textureY); // Box 475
		bodyModel[371] = new ModelRendererTurbo(this, 1465, 385, textureX, textureY); // Box 476
		bodyModel[372] = new ModelRendererTurbo(this, 1473, 385, textureX, textureY); // Box 477
		bodyModel[373] = new ModelRendererTurbo(this, 1481, 385, textureX, textureY); // Box 478
		bodyModel[374] = new ModelRendererTurbo(this, 1489, 385, textureX, textureY); // Box 480
		bodyModel[375] = new ModelRendererTurbo(this, 1497, 385, textureX, textureY); // Box 481
		bodyModel[376] = new ModelRendererTurbo(this, 1505, 385, textureX, textureY); // Box 482
		bodyModel[377] = new ModelRendererTurbo(this, 1513, 385, textureX, textureY); // Box 483
		bodyModel[378] = new ModelRendererTurbo(this, 1521, 385, textureX, textureY); // Box 484
		bodyModel[379] = new ModelRendererTurbo(this, 1529, 385, textureX, textureY); // Box 485
		bodyModel[380] = new ModelRendererTurbo(this, 1537, 385, textureX, textureY); // Box 486
		bodyModel[381] = new ModelRendererTurbo(this, 1545, 385, textureX, textureY); // Box 487
		bodyModel[382] = new ModelRendererTurbo(this, 1553, 385, textureX, textureY); // Box 488
		bodyModel[383] = new ModelRendererTurbo(this, 1561, 385, textureX, textureY); // Box 489
		bodyModel[384] = new ModelRendererTurbo(this, 1569, 385, textureX, textureY); // Box 460
		bodyModel[385] = new ModelRendererTurbo(this, 1577, 385, textureX, textureY); // Box 461
		bodyModel[386] = new ModelRendererTurbo(this, 1585, 385, textureX, textureY); // Box 462
		bodyModel[387] = new ModelRendererTurbo(this, 1593, 385, textureX, textureY); // Box 463
		bodyModel[388] = new ModelRendererTurbo(this, 1601, 385, textureX, textureY); // Box 464
		bodyModel[389] = new ModelRendererTurbo(this, 1609, 385, textureX, textureY); // Box 465
		bodyModel[390] = new ModelRendererTurbo(this, 1617, 385, textureX, textureY); // Box 466
		bodyModel[391] = new ModelRendererTurbo(this, 1625, 385, textureX, textureY); // Box 467
		bodyModel[392] = new ModelRendererTurbo(this, 1633, 385, textureX, textureY); // Box 468
		bodyModel[393] = new ModelRendererTurbo(this, 1641, 385, textureX, textureY); // Box 469
		bodyModel[394] = new ModelRendererTurbo(this, 1649, 385, textureX, textureY); // Box 470
		bodyModel[395] = new ModelRendererTurbo(this, 1657, 385, textureX, textureY); // Box 471
		bodyModel[396] = new ModelRendererTurbo(this, 1665, 385, textureX, textureY); // Box 472
		bodyModel[397] = new ModelRendererTurbo(this, 1673, 385, textureX, textureY); // Box 473
		bodyModel[398] = new ModelRendererTurbo(this, 1681, 385, textureX, textureY); // Box 474
		bodyModel[399] = new ModelRendererTurbo(this, 1689, 385, textureX, textureY); // Box 475
		bodyModel[400] = new ModelRendererTurbo(this, 1697, 385, textureX, textureY); // Box 476
		bodyModel[401] = new ModelRendererTurbo(this, 1705, 385, textureX, textureY); // Box 477
		bodyModel[402] = new ModelRendererTurbo(this, 1713, 385, textureX, textureY); // Box 478
		bodyModel[403] = new ModelRendererTurbo(this, 1721, 385, textureX, textureY); // Box 479
		bodyModel[404] = new ModelRendererTurbo(this, 1729, 385, textureX, textureY); // Box 480
		bodyModel[405] = new ModelRendererTurbo(this, 1737, 385, textureX, textureY); // Box 481
		bodyModel[406] = new ModelRendererTurbo(this, 1745, 385, textureX, textureY); // Box 482
		bodyModel[407] = new ModelRendererTurbo(this, 1753, 385, textureX, textureY); // Box 483
		bodyModel[408] = new ModelRendererTurbo(this, 1761, 385, textureX, textureY); // Box 484
		bodyModel[409] = new ModelRendererTurbo(this, 1769, 385, textureX, textureY); // Box 485
		bodyModel[410] = new ModelRendererTurbo(this, 1777, 385, textureX, textureY); // Box 486
		bodyModel[411] = new ModelRendererTurbo(this, 1777, 385, textureX, textureY); // Box 487
		bodyModel[412] = new ModelRendererTurbo(this, 1785, 385, textureX, textureY); // Box 462
		bodyModel[413] = new ModelRendererTurbo(this, 1825, 385, textureX, textureY); // Box 463
		bodyModel[414] = new ModelRendererTurbo(this, 1857, 385, textureX, textureY); // Box 465
		bodyModel[415] = new ModelRendererTurbo(this, 1873, 385, textureX, textureY); // Box 466
		bodyModel[416] = new ModelRendererTurbo(this, 1889, 385, textureX, textureY); // Box 467
		bodyModel[417] = new ModelRendererTurbo(this, 1897, 385, textureX, textureY); // Box 468
		bodyModel[418] = new ModelRendererTurbo(this, 1905, 385, textureX, textureY); // Box 469
		bodyModel[419] = new ModelRendererTurbo(this, 1849, 385, textureX, textureY); // Box 470
		bodyModel[420] = new ModelRendererTurbo(this, 1913, 385, textureX, textureY); // Box 471
		bodyModel[421] = new ModelRendererTurbo(this, 1921, 385, textureX, textureY); // Box 472
		bodyModel[422] = new ModelRendererTurbo(this, 1929, 385, textureX, textureY); // Box 512
		bodyModel[423] = new ModelRendererTurbo(this, 1945, 385, textureX, textureY); // Box 513
		bodyModel[424] = new ModelRendererTurbo(this, 1969, 385, textureX, textureY); // Box 514
		bodyModel[425] = new ModelRendererTurbo(this, 1985, 385, textureX, textureY); // Box 515
		bodyModel[426] = new ModelRendererTurbo(this, 2017, 385, textureX, textureY); // Box 516
		bodyModel[427] = new ModelRendererTurbo(this, 1, 393, textureX, textureY); // Box 517
		bodyModel[428] = new ModelRendererTurbo(this, 2033, 385, textureX, textureY); // Box 518
		bodyModel[429] = new ModelRendererTurbo(this, 193, 393, textureX, textureY); // Box 595
		bodyModel[430] = new ModelRendererTurbo(this, 25, 393, textureX, textureY); // Box 259
		bodyModel[431] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // Box 260
		bodyModel[432] = new ModelRendererTurbo(this, 73, 393, textureX, textureY); // Box 256
		bodyModel[433] = new ModelRendererTurbo(this, 97, 393, textureX, textureY); // Box 249
		bodyModel[434] = new ModelRendererTurbo(this, 121, 393, textureX, textureY); // Box 254
		bodyModel[435] = new ModelRendererTurbo(this, 145, 393, textureX, textureY); // Box 263
		bodyModel[436] = new ModelRendererTurbo(this, 161, 393, textureX, textureY); // Box 264
		bodyModel[437] = new ModelRendererTurbo(this, 89, 393, textureX, textureY); // Box 265
		bodyModel[438] = new ModelRendererTurbo(this, 2009, 385, textureX, textureY); // Box 266
		bodyModel[439] = new ModelRendererTurbo(this, 169, 393, textureX, textureY); // Box 601
		bodyModel[440] = new ModelRendererTurbo(this, 185, 393, textureX, textureY); // Box 602
		bodyModel[441] = new ModelRendererTurbo(this, 201, 393, textureX, textureY); // Box 603
		bodyModel[442] = new ModelRendererTurbo(this, 233, 393, textureX, textureY); // Box 604
		bodyModel[443] = new ModelRendererTurbo(this, 289, 393, textureX, textureY); // Box 967
		bodyModel[444] = new ModelRendererTurbo(this, 585, 385, textureX, textureY); // Box 968
		bodyModel[445] = new ModelRendererTurbo(this, 329, 393, textureX, textureY); // Box 613
		bodyModel[446] = new ModelRendererTurbo(this, 241, 393, textureX, textureY); // Box 614
		bodyModel[447] = new ModelRendererTurbo(this, 353, 393, textureX, textureY); // Box 615
		bodyModel[448] = new ModelRendererTurbo(this, 425, 393, textureX, textureY); // Box 616
		bodyModel[449] = new ModelRendererTurbo(this, 1201, 934, textureX, textureY); // Box 873
		bodyModel[450] = new ModelRendererTurbo(this, 1201, 956, textureX, textureY); // Box 874

		bodyModel[0].addShapeBox(0F, 0F, 0F, 42, 6, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-49F, -71F, -15F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 42, 5, 4, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[1].setRotationPoint(-49F, -76F, -13F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 42, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[2].setRotationPoint(-49F, -65F, -15F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 42, 5, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 3
		bodyModel[3].setRotationPoint(-49F, -59F, -15F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 42, 5, 13, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[4].setRotationPoint(-49F, -54F, -13F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 42, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -1F, -5F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[5].setRotationPoint(-49F, -49F, -10F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 15, 5, 5, 0F,-4F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, 0F, -4F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 6
		bodyModel[6].setRotationPoint(-7F, -76F, -13F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 15, 6, 7, 0F,0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 7
		bodyModel[7].setRotationPoint(-7F, -71F, -15F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 15, 6, 7, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 8
		bodyModel[8].setRotationPoint(-7F, -65F, -15F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 15, 5, 15, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[9].setRotationPoint(-7F, -59F, -15F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 15, 5, 13, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, -7F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[10].setRotationPoint(-7F, -54F, -13F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 7, 5, 12, 0F,0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[11].setRotationPoint(8F, -76F, -12F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 7, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[12].setRotationPoint(8F, -71F, -12F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 7, 6, 12, 0F,0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[13].setRotationPoint(8F, -65F, -12F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 7, 5, 12, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[14].setRotationPoint(8F, -59F, -12F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 22, 6, 12, 0F,0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[15].setRotationPoint(15F, -65F, -12F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 22, 6, 12, 0F,0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[16].setRotationPoint(15F, -71F, -12F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 22, 5, 12, 0F,0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -3F, -4F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[17].setRotationPoint(15F, -59F, -12F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 7, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[18].setRotationPoint(8F, -54F, -9F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 22, 4, 8, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -4F, -4F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[19].setRotationPoint(15F, -54F, -8F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 15, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[20].setRotationPoint(-64F, -65F, -15F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 15, 6, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[21].setRotationPoint(-64F, -71F, -15F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 15, 5, 4, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[22].setRotationPoint(-64F, -76F, -13F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 15, 6, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[23].setRotationPoint(-64F, -59F, -15F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 15, 4, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[24].setRotationPoint(-64F, -53F, -13F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 15, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[25].setRotationPoint(-64F, -49F, -10F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 4, 5, 5, 0F,0F, 0F, -2.9999F, 0F, 0F, -2.9999F, 0F, 0F, -0.9999F, 0F, 0F, -0.9999F, 0F, 0F, 0F, -3.9999F, 0F, 0F, -3.9999F, 0F, -0.9999F, 0F, 0F, -0.9999F); // Box 54
		bodyModel[26].setRotationPoint(-7F, -76F, -13F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 22, 5, 11, 0F,0F, 0F, -3F, 0F, -1F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[27].setRotationPoint(15F, -76F, -11F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 7, 3, 9, 0F,0F, 0F, -4F, 0F, 0F, -5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[28].setRotationPoint(8F, -79F, -9F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 22, 3, 8, 0F,0F, 0F, -4F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[29].setRotationPoint(15F, -79F, -8F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 15, 3, 3, 0F,0F, 0F, -2F, 0F, 0F, -1.35F, 0F, 0F, -0.65F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 65
		bodyModel[30].setRotationPoint(-64F, -79F, -10F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 7, 2, 3, 0F,0F, 0F, -2F, 0F, 0F, -0.22F, 0F, 0F, -1.8F, 0F, 0F, 0F, 0F, 0F, 0.34F, 0F, 0F, 0.65F, 0F, 0F, -2.65F, 0F, 0F, -0.55F); // Box 66
		bodyModel[31].setRotationPoint(-56F, -81F, -8F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F,0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0.17F, 0F, 0F, 0.35F, 0F, 0F, -2.5F, 0F, 0F, -2.25F); // Box 67
		bodyModel[32].setRotationPoint(-60F, -81F, -8F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 4, 2, 8, 0F,0F, -1F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.17F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[33].setRotationPoint(-64F, -81F, -8F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 7, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9999F, 0F, -0.9999F, -1.9999F, 0F, -0.9999F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[34].setRotationPoint(8F, -50F, -6F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 4, 3, 9, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[35].setRotationPoint(-64F, -79F, -9F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 4, 17, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		bodyModel[36].setRotationPoint(-64F, -76F, -9F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 68, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[37].setRotationPoint(-60F, -64F, -9F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 42, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[38].setRotationPoint(-49F, -85F, -6F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 75
		bodyModel[39].setRotationPoint(-49F, -85F, -6F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 76
		bodyModel[40].setRotationPoint(-41F, -85F, -6F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 77
		bodyModel[41].setRotationPoint(-33F, -85F, -6F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 2, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 78
		bodyModel[42].setRotationPoint(-15F, -85F, -6F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 79
		bodyModel[43].setRotationPoint(-23F, -85F, -6F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 80
		bodyModel[44].setRotationPoint(-8F, -85F, -6F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		bodyModel[45].setRotationPoint(-49F, -89F, -2F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 82
		bodyModel[46].setRotationPoint(-49F, -89F, -4F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 83
		bodyModel[47].setRotationPoint(-49F, -88F, -6F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 84
		bodyModel[48].setRotationPoint(-41F, -88F, -6F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[49].setRotationPoint(-41F, -89F, -2F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 86
		bodyModel[50].setRotationPoint(-41F, -89F, -4F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 87
		bodyModel[51].setRotationPoint(-33F, -88F, -6F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[52].setRotationPoint(-33F, -89F, -2F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 89
		bodyModel[53].setRotationPoint(-33F, -89F, -4F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 90
		bodyModel[54].setRotationPoint(-23F, -88F, -6F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[55].setRotationPoint(-23F, -89F, -2F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 92
		bodyModel[56].setRotationPoint(-23F, -89F, -4F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 93
		bodyModel[57].setRotationPoint(-15F, -88F, -6F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		bodyModel[58].setRotationPoint(-15F, -89F, -2F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 95
		bodyModel[59].setRotationPoint(-15F, -89F, -4F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F); // Box 148
		bodyModel[60].setRotationPoint(-51F, -85F, -6F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F,0F, -4F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0.5F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4.5F, -0.5F, 0F, -4.5F, 0.5F, 0F, 0F, 0F); // Box 149
		bodyModel[61].setRotationPoint(-56F, -85F, -6F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 1.5F, -1F, 0F, 0.5F, 0.5F, 0F, 0.5F, -0.5F, 0F, 1.5F, 1F, 0F, -1.5F, -1F, 0F, -0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, -1.5F, 1F); // Box 150
		bodyModel[62].setRotationPoint(-53F, -85F, -5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 151
		bodyModel[63].setRotationPoint(-54F, -87F, -4F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 2F, 0.1F, 0F, 2F, -0.1F, 0F, 0F, -0.5F); // Box 152
		bodyModel[64].setRotationPoint(-7F, -85F, -6F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 3.82F, 0F, 0F, 3.73F, 0F, 0F, -3.8F, 0F, 0F, -3.95F); // Box 153
		bodyModel[65].setRotationPoint(-1F, -83F, -6F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 154
		bodyModel[66].setRotationPoint(-1F, -85F, -6F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 155
		bodyModel[67].setRotationPoint(-1F, -86F, -4F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[68].setRotationPoint(-1F, -86F, -2F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 42, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[69].setRotationPoint(-49F, -71F, 9F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 42, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		bodyModel[70].setRotationPoint(-49F, -76F, 9F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 42, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		bodyModel[71].setRotationPoint(-49F, -65F, 9F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 42, 5, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 1F, -2F); // Box 199
		bodyModel[72].setRotationPoint(-49F, -59F, 0F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 42, 5, 13, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 200
		bodyModel[73].setRotationPoint(-49F, -54F, 0F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 42, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -5F, 0F, 0F, -5F); // Box 201
		bodyModel[74].setRotationPoint(-49F, -49F, 0F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 15, 5, 5, 0F,-4F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -4F, -4F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 202
		bodyModel[75].setRotationPoint(-7F, -76F, 8F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 15, 6, 7, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 203
		bodyModel[76].setRotationPoint(-7F, -71F, 8F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 15, 6, 7, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 204
		bodyModel[77].setRotationPoint(-7F, -65F, 8F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 15, 5, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -2F); // Box 205
		bodyModel[78].setRotationPoint(-7F, -59F, 0F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 15, 5, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -7F, 0F, 0F, -3F); // Box 206
		bodyModel[79].setRotationPoint(-7F, -54F, 0F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 7, 5, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 207
		bodyModel[80].setRotationPoint(8F, -76F, 0F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 7, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F); // Box 208
		bodyModel[81].setRotationPoint(8F, -71F, 0F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 7, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 209
		bodyModel[82].setRotationPoint(8F, -65F, 0F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 7, 5, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -3F); // Box 210
		bodyModel[83].setRotationPoint(8F, -59F, 0F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 22, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, 0F, 0F); // Box 211
		bodyModel[84].setRotationPoint(15F, -65F, 0F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 22, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F); // Box 212
		bodyModel[85].setRotationPoint(15F, -71F, 0F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 22, 5, 12, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -4F, 0F, 0F, -4F); // Box 213
		bodyModel[86].setRotationPoint(15F, -59F, 0F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 7, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -3F); // Box 214
		bodyModel[87].setRotationPoint(8F, -54F, 0F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 22, 4, 8, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, -4F, 0F, 0F, -4F); // Box 215
		bodyModel[88].setRotationPoint(15F, -54F, 0F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 15, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 216
		bodyModel[89].setRotationPoint(-64F, -65F, 9F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 15, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		bodyModel[90].setRotationPoint(-64F, -71F, 9F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 15, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 218
		bodyModel[91].setRotationPoint(-64F, -76F, 9F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 15, 6, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 219
		bodyModel[92].setRotationPoint(-64F, -59F, 0F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 15, 4, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 226
		bodyModel[93].setRotationPoint(-64F, -53F, 0F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 15, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -1F, -5F); // Box 228
		bodyModel[94].setRotationPoint(-64F, -49F, 0F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 4, 5, 5, 0F,0F, 0F, -0.9999F, 0F, 0F, -0.9999F, 0F, 0F, -2.9999F, 0F, 0F, -2.9999F, 0F, 0F, -0.9999F, -3.9999F, 0F, -0.9999F, -3.9999F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[95].setRotationPoint(-7F, -76F, 8F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 22, 5, 11, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 250
		bodyModel[96].setRotationPoint(15F, -76F, 0F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 7, 3, 9, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 254
		bodyModel[97].setRotationPoint(8F, -79F, 0F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 22, 3, 8, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 255
		bodyModel[98].setRotationPoint(15F, -79F, 0F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 15, 3, 3, 0F,0F, 0F, 4F, 0F, 0F, -0.65F, 0F, 0F, -1.35F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
		bodyModel[99].setRotationPoint(-64F, -79F, 7F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 7, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, -1.8F, 0F, 0F, -0.22F, 0F, 0F, -2F, 0F, 0F, -0.55F, 0F, 0F, -2.65F, 0F, 0F, 0.65F, 0F, 0F, 0.34F); // Box 261
		bodyModel[100].setRotationPoint(-56F, -81F, 5F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -2.25F, 0F, 0F, -2.5F, 0F, 0F, 0.35F, 0F, 0F, 0.17F); // Box 262
		bodyModel[101].setRotationPoint(-60F, -81F, 5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 4, 2, 8, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.17F, 0F, 0F, 0F); // Box 263
		bodyModel[102].setRotationPoint(-64F, -81F, 0F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 7, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9999F, 0F, 0F, -0.9999F, -1.9999F, 0F, 0F, -0.9999F); // Box 265
		bodyModel[103].setRotationPoint(8F, -50F, 0F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 4, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 266
		bodyModel[104].setRotationPoint(-64F, -79F, 0F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 4, 17, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 267
		bodyModel[105].setRotationPoint(-64F, -76F, 0F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 68, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 268
		bodyModel[106].setRotationPoint(-60F, -64F, 0F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 42, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 269
		bodyModel[107].setRotationPoint(-49F, -85F, 5F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F); // Box 270
		bodyModel[108].setRotationPoint(-49F, -85F, 5F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F); // Box 271
		bodyModel[109].setRotationPoint(-41F, -85F, 5F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F); // Box 272
		bodyModel[110].setRotationPoint(-33F, -85F, 5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 2, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F); // Box 273
		bodyModel[111].setRotationPoint(-15F, -85F, 5F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F); // Box 274
		bodyModel[112].setRotationPoint(-23F, -85F, 5F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F); // Box 275
		bodyModel[113].setRotationPoint(-8F, -85F, 5F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 276
		bodyModel[114].setRotationPoint(-49F, -89F, 0F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
		bodyModel[115].setRotationPoint(-49F, -89F, 2F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
		bodyModel[116].setRotationPoint(-49F, -88F, 3F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 279
		bodyModel[117].setRotationPoint(-41F, -88F, 3F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 280
		bodyModel[118].setRotationPoint(-41F, -89F, 0F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		bodyModel[119].setRotationPoint(-41F, -89F, 2F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 282
		bodyModel[120].setRotationPoint(-33F, -88F, 3F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[121].setRotationPoint(-33F, -89F, 0F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 284
		bodyModel[122].setRotationPoint(-33F, -89F, 2F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 285
		bodyModel[123].setRotationPoint(-23F, -88F, 3F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 286
		bodyModel[124].setRotationPoint(-23F, -89F, 0F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 287
		bodyModel[125].setRotationPoint(-23F, -89F, 2F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 288
		bodyModel[126].setRotationPoint(-15F, -88F, 3F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 289
		bodyModel[127].setRotationPoint(-15F, -89F, 0F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 290
		bodyModel[128].setRotationPoint(-15F, -89F, 2F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Box 343
		bodyModel[129].setRotationPoint(-51F, -85F, 5F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F,0F, -4F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, -0.5F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0.5F, 0F, -4.5F, -0.5F, 0F, 0F, 0F); // Box 344
		bodyModel[130].setRotationPoint(-56F, -85F, 5F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 1.5F, 1F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0.5F, 0F, 1.5F, -1F, 0F, -1.5F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, -1.5F, -1F); // Box 345
		bodyModel[131].setRotationPoint(-53F, -85F, 4F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1.5F); // Box 346
		bodyModel[132].setRotationPoint(-54F, -87F, 0F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, -2F, 0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 2F, -0.1F, 0F, 2F, 0.1F, 0F, 0F, 0.5F); // Box 347
		bodyModel[133].setRotationPoint(-7F, -85F, 5F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3.95F, 0F, 0F, -3.8F, 0F, 0F, 3.73F, 0F, 0F, 3.82F); // Box 348
		bodyModel[134].setRotationPoint(-1F, -83F, 5F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 349
		bodyModel[135].setRotationPoint(-1F, -85F, 3F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 350
		bodyModel[136].setRotationPoint(-1F, -86F, 2F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 351
		bodyModel[137].setRotationPoint(-1F, -86F, 0F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 12, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 484
		bodyModel[138].setRotationPoint(-13F, -78F, -8F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 3, 5, 2, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 1F); // Box 485
		bodyModel[139].setRotationPoint(-16F, -78F, -8F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 3, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, 1F, 0F, 0F, 0F); // Box 487
		bodyModel[140].setRotationPoint(-1F, -78F, -8F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 2, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 488
		bodyModel[141].setRotationPoint(0F, -78F, -5F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 2, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 489
		bodyModel[142].setRotationPoint(-16F, -78F, -5F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 12, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 490
		bodyModel[143].setRotationPoint(-13F, -78F, 6F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 3, 5, 2, 0F,-2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 491
		bodyModel[144].setRotationPoint(-16F, -78F, 6F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 3, 5, 2, 0F,0F, 0F, 0F, -2F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 492
		bodyModel[145].setRotationPoint(-1F, -78F, 6F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 6, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 493
		bodyModel[146].setRotationPoint(2F, -77F, -4F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 494
		bodyModel[147].setRotationPoint(4F, -79F, -4F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 495
		bodyModel[148].setRotationPoint(4F, -80F, -4F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 496
		bodyModel[149].setRotationPoint(-13F, -73F, -8F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 497
		bodyModel[150].setRotationPoint(-13F, -73F, 7F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 498
		bodyModel[151].setRotationPoint(-2F, -73F, 7F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 499
		bodyModel[152].setRotationPoint(-2F, -73F, -8F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 18, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 558
		bodyModel[153].setRotationPoint(-68F, -83F, -1F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 18, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 559
		bodyModel[154].setRotationPoint(-68F, -82F, -1F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 18, 2, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F); // Box 560
		bodyModel[155].setRotationPoint(-68F, -83F, -1F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 18, 2, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F); // Box 503
		bodyModel[156].setRotationPoint(-68F, -83F, 0.5F);

		bodyModel[157].addShapeBox(0F, 1F, 0F, 10, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
		bodyModel[157].setRotationPoint(-43F, -67F, -5F);
		bodyModel[157].rotateAngleZ = -0.10471976F;

		bodyModel[158].addShapeBox(9F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		bodyModel[158].setRotationPoint(-43F, -67F, -5F);
		bodyModel[158].rotateAngleZ = -0.10471976F;

		bodyModel[159].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		bodyModel[159].setRotationPoint(-43F, -67F, -5F);
		bodyModel[159].rotateAngleZ = -0.10471976F;

		bodyModel[160].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		bodyModel[160].setRotationPoint(-43F, -67F, 4F);
		bodyModel[160].rotateAngleZ = -0.10471976F;

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		bodyModel[161].setRotationPoint(-43F, -67F, -5F);
		bodyModel[161].rotateAngleZ = -0.10471976F;

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 15, 10, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		bodyModel[162].setRotationPoint(-34F, -81F, -5F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[163].setRotationPoint(-32F, -85F, -3F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 15, 8, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 246
		bodyModel[164].setRotationPoint(-35F, -80F, -4F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[165].setRotationPoint(-35.3F, -80.3F, -2F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[166].setRotationPoint(-35.3F, -80.3F, 1F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[167].setRotationPoint(-34F, -78F, -4F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 251
		bodyModel[168].setRotationPoint(-34F, -78F, 3F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[169].setRotationPoint(-40F, -66F, -6F);
		bodyModel[169].rotateAngleZ = 0.78539816F;

		bodyModel[170].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 253
		bodyModel[170].setRotationPoint(-40F, -66F, 5F);
		bodyModel[170].rotateAngleZ = 0.78539816F;

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 962
		bodyModel[171].setRotationPoint(-32.5F, -84.5F, -1.5F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 964
		bodyModel[172].setRotationPoint(-32.5F, -83.5F, -1.5F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 966
		bodyModel[173].setRotationPoint(-32.5F, -82.5F, -1.5F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 578
		bodyModel[174].setRotationPoint(-12F, -78F, 3F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 579
		bodyModel[175].setRotationPoint(-12F, -78F, -4F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 15, 10, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 580
		bodyModel[176].setRotationPoint(-11F, -81F, -5F);

		bodyModel[177].addShapeBox(0F, 1F, 0F, 10, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 582
		bodyModel[177].setRotationPoint(-11F, -67F, -5F);
		bodyModel[177].rotateAngleZ = 0.08726646F;

		bodyModel[178].addShapeBox(-2F, 0.25F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 583
		bodyModel[178].setRotationPoint(-9F, -67F, -5F);
		bodyModel[178].rotateAngleZ = 0.08726646F;

		bodyModel[179].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 584
		bodyModel[179].setRotationPoint(-11F, -73F, -6F);
		bodyModel[179].rotateAngleZ = -0.78539816F;

		bodyModel[180].addShapeBox(0F, -0.3F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 585
		bodyModel[180].setRotationPoint(-2F, -67F, -5F);
		bodyModel[180].rotateAngleZ = 0.12217305F;

		bodyModel[181].addShapeBox(-2F, 0.25F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 586
		bodyModel[181].setRotationPoint(-9F, -67F, 4F);
		bodyModel[181].rotateAngleZ = 0.08726646F;

		bodyModel[182].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 587
		bodyModel[182].setRotationPoint(-11F, -73F, 5F);
		bodyModel[182].rotateAngleZ = -0.78539816F;

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 15, 8, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 588
		bodyModel[183].setRotationPoint(-10F, -80F, -4F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 589
		bodyModel[184].setRotationPoint(-9.7F, -80.3F, 1F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 590
		bodyModel[185].setRotationPoint(-9.7F, -80.3F, -2F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 591
		bodyModel[186].setRotationPoint(-12.5F, -82.5F, -1.5F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 592
		bodyModel[187].setRotationPoint(-12.5F, -83.5F, -1.5F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 593
		bodyModel[188].setRotationPoint(-12.5F, -84.5F, -1.5F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 594
		bodyModel[189].setRotationPoint(-13F, -85F, -3F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 12, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 262
		bodyModel[190].setRotationPoint(-60F, -71F, -9F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 6, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 255
		bodyModel[191].setRotationPoint(-48F, -76F, -9F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 2, 18, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 257
		bodyModel[192].setRotationPoint(-48F, -78F, -9F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F,0F, 0.5F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 258
		bodyModel[193].setRotationPoint(-48F, -79F, -8F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 213
		bodyModel[194].setRotationPoint(-47.8F, -76.3F, -4F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, -0.4F, -3F, 0F, -0.4F, -3F, 0F, -0.4F, -3F, 0F, -0.4F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 214
		bodyModel[195].setRotationPoint(-47.8F, -77.3F, -4F);

		bodyModel[196].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F); // Box 233
		bodyModel[196].setRotationPoint(-47.7F, -75.1F, 2.7F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F); // Box 234
		bodyModel[197].setRotationPoint(-47.6F, -76.1F, -0.9F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F); // Box 235
		bodyModel[198].setRotationPoint(-47.6F, -76.1F, -0.9F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F); // Box 236
		bodyModel[199].setRotationPoint(-47.6F, -76.1F, -0.9F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 237
		bodyModel[200].setRotationPoint(-47.6F, -75.1F, -0.9F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 238
		bodyModel[201].setRotationPoint(-47.6F, -75.1F, -0.9F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 239
		bodyModel[202].setRotationPoint(-47.6F, -75.1F, 0.0999999999999996F);

		bodyModel[203].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 240
		bodyModel[203].setRotationPoint(-47.7F, -75.1F, 0.0999999999999996F);
		bodyModel[203].rotateAngleX = 5.49778714F;

		bodyModel[204].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 241
		bodyModel[204].setRotationPoint(-47.7F, -75.1F, 0.0999999999999996F);

		bodyModel[205].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F); // Box 242
		bodyModel[205].setRotationPoint(-47.7F, -75.1F, 0.0999999999999996F);

		bodyModel[206].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 243
		bodyModel[206].setRotationPoint(-47.6F, -75.1F, 0.0999999999999996F);

		bodyModel[207].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 244
		bodyModel[207].setRotationPoint(-47.7F, -75.1F, 0.0999999999999996F);
		bodyModel[207].rotateAngleX = 3.14159265F;

		bodyModel[208].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 248
		bodyModel[208].setRotationPoint(-47.6F, -76.1F, 0.0999999999999996F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 249
		bodyModel[209].setRotationPoint(-47.6F, -76.1F, 0.0999999999999996F);

		bodyModel[210].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 250
		bodyModel[210].setRotationPoint(-47.7F, -75.1F, 0.0999999999999996F);
		bodyModel[210].rotateAngleX = 4.71238898F;

		bodyModel[211].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 251
		bodyModel[211].setRotationPoint(-47.7F, -75.1F, 0.0999999999999996F);
		bodyModel[211].rotateAngleX = 3.92699082F;

		bodyModel[212].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F); // Box 252
		bodyModel[212].setRotationPoint(-47.6F, -76.1F, 1.7F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F); // Box 253
		bodyModel[213].setRotationPoint(-47.6F, -76.1F, 1.7F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F); // Box 254
		bodyModel[214].setRotationPoint(-47.6F, -76.1F, 1.7F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 255
		bodyModel[215].setRotationPoint(-47.6F, -76.1F, 2.7F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 256
		bodyModel[216].setRotationPoint(-47.6F, -76.1F, 2.7F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 257
		bodyModel[217].setRotationPoint(-47.6F, -75.1F, 2.7F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 258
		bodyModel[218].setRotationPoint(-47.6F, -75.1F, 1.7F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 259
		bodyModel[219].setRotationPoint(-47.6F, -75.1F, 1.7F);

		bodyModel[220].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 260
		bodyModel[220].setRotationPoint(-47.7F, -75.1F, 2.7F);
		bodyModel[220].rotateAngleX = 3.92699082F;

		bodyModel[221].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 261
		bodyModel[221].setRotationPoint(-47.7F, -75.1F, 2.7F);
		bodyModel[221].rotateAngleX = 4.71238898F;

		bodyModel[222].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 262
		bodyModel[222].setRotationPoint(-47.7F, -75.1F, 2.7F);
		bodyModel[222].rotateAngleX = 5.49778714F;

		bodyModel[223].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 263
		bodyModel[223].setRotationPoint(-47.7F, -75.1F, 2.7F);

		bodyModel[224].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 265
		bodyModel[224].setRotationPoint(-47.6F, -75.1F, 2.7F);

		bodyModel[225].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 266
		bodyModel[225].setRotationPoint(-47.7F, -75.1F, 2.7F);
		bodyModel[225].rotateAngleX = 0.78539816F;

		bodyModel[226].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 267
		bodyModel[226].setRotationPoint(-47.7F, -75.1F, 2.7F);
		bodyModel[226].rotateAngleX = 1.57079633F;

		bodyModel[227].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 268
		bodyModel[227].setRotationPoint(-47.7F, -75.1F, 2.7F);
		bodyModel[227].rotateAngleX = 2.35619449F;

		bodyModel[228].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 269
		bodyModel[228].setRotationPoint(-47.7F, -75.1F, 2.7F);
		bodyModel[228].rotateAngleX = 3.14159265F;

		bodyModel[229].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.45F, 0.3F, 0F, -0.45F, 0.3F, 0F, -0.45F, 0.3F, 0F, -0.45F, 0.3F, 0F, -0.45F, 0.3F, 0F, -0.45F, 0.3F, 0F, -0.45F, 0.3F, 0F, -0.45F, 0.3F); // Box 270
		bodyModel[229].setRotationPoint(-47.7F, -75.1F, 0.0999999999999996F);
		bodyModel[229].rotateAngleX = -0.38397244F;

		bodyModel[230].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F); // Box 271
		bodyModel[230].setRotationPoint(-47.7F, -75.9F, -0.9F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, -0.9F, 0F, -0.5F, -0.9F, 0F, -0.5F, -0.9F, 0F, -0.5F, -0.9F); // Box 272
		bodyModel[231].setRotationPoint(-47.7F, -75.7F, -0.9F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 273
		bodyModel[232].setRotationPoint(-47.6F, -72.5F, -3.7F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 274
		bodyModel[233].setRotationPoint(-47.6F, -72.5F, -3.7F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F); // Box 275
		bodyModel[234].setRotationPoint(-47.6F, -73.5F, -3.7F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F); // Box 276
		bodyModel[235].setRotationPoint(-47.6F, -73.5F, -3.7F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F); // Box 277
		bodyModel[236].setRotationPoint(-47.6F, -73.5F, -3.7F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 278
		bodyModel[237].setRotationPoint(-47.6F, -73.5F, -2.7F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 279
		bodyModel[238].setRotationPoint(-47.6F, -73.5F, -2.7F);

		bodyModel[239].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 280
		bodyModel[239].setRotationPoint(-47.7F, -72.5F, -2.7F);
		bodyModel[239].rotateAngleX = 0.78539816F;

		bodyModel[240].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 281
		bodyModel[240].setRotationPoint(-47.6F, -72.5F, -2.7F);

		bodyModel[241].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 282
		bodyModel[241].setRotationPoint(-47.7F, -72.5F, -2.7F);
		bodyModel[241].rotateAngleX = 5.49778714F;

		bodyModel[242].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 283
		bodyModel[242].setRotationPoint(-47.7F, -72.5F, -2.7F);

		bodyModel[243].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 284
		bodyModel[243].setRotationPoint(-47.7F, -72.5F, -2.7F);
		bodyModel[243].rotateAngleX = 1.57079633F;

		bodyModel[244].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 285
		bodyModel[244].setRotationPoint(-47.7F, -72.5F, -2.7F);
		bodyModel[244].rotateAngleX = 2.35619449F;

		bodyModel[245].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 286
		bodyModel[245].setRotationPoint(-47.7F, -72.5F, -2.7F);
		bodyModel[245].rotateAngleX = 3.14159265F;

		bodyModel[246].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 287
		bodyModel[246].setRotationPoint(-47.6F, -72.5F, -2.7F);

		bodyModel[247].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F); // Box 288
		bodyModel[247].setRotationPoint(-47.7F, -72.5F, -2.7F);
		bodyModel[247].rotateAngleX = -3.90953752F;

		bodyModel[248].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 289
		bodyModel[248].setRotationPoint(-47.7F, -72.5F, -2.7F);
		bodyModel[248].rotateAngleX = 4.71238898F;

		bodyModel[249].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 290
		bodyModel[249].setRotationPoint(-47.7F, -72.5F, -2.7F);
		bodyModel[249].rotateAngleX = 3.92699082F;

		bodyModel[250].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 318
		bodyModel[250].setRotationPoint(-47.8F, -75.1F, 4.8F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 319
		bodyModel[251].setRotationPoint(-47.8F, -75.1F, 4.8F);

		bodyModel[252].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 320
		bodyModel[252].setRotationPoint(-47.9F, -75.1F, 5.8F);
		bodyModel[252].rotateAngleX = 3.92699082F;

		bodyModel[253].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F); // Box 321
		bodyModel[253].setRotationPoint(-47.8F, -76.1F, 4.8F);

		bodyModel[254].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 322
		bodyModel[254].setRotationPoint(-47.9F, -75.1F, 5.8F);
		bodyModel[254].rotateAngleX = 3.14159265F;

		bodyModel[255].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F); // Box 323
		bodyModel[255].setRotationPoint(-47.8F, -76.1F, 4.8F);

		bodyModel[256].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 324
		bodyModel[256].setRotationPoint(-47.9F, -75.1F, 5.8F);
		bodyModel[256].rotateAngleX = 2.35619449F;

		bodyModel[257].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F); // Box 325
		bodyModel[257].setRotationPoint(-47.8F, -76.1F, 4.8F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 326
		bodyModel[258].setRotationPoint(-47.8F, -76.1F, 5.8F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 327
		bodyModel[259].setRotationPoint(-47.8F, -76.1F, 5.8F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 328
		bodyModel[260].setRotationPoint(-47.8F, -75.1F, 5.8F);

		bodyModel[261].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 329
		bodyModel[261].setRotationPoint(-47.9F, -75.1F, 5.8F);
		bodyModel[261].rotateAngleX = 5.49778714F;

		bodyModel[262].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 330
		bodyModel[262].setRotationPoint(-47.9F, -75.1F, 5.8F);

		bodyModel[263].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 331
		bodyModel[263].setRotationPoint(-47.9F, -75.1F, 5.8F);
		bodyModel[263].rotateAngleX = 0.78539816F;

		bodyModel[264].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 332
		bodyModel[264].setRotationPoint(-47.9F, -75.1F, 5.8F);
		bodyModel[264].rotateAngleX = 1.57079633F;

		bodyModel[265].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F); // Box 333
		bodyModel[265].setRotationPoint(-47.9F, -75.1F, 5.8F);
		bodyModel[265].rotateAngleX = -3.90953752F;

		bodyModel[266].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 334
		bodyModel[266].setRotationPoint(-47.8F, -75.1F, 5.8F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 340
		bodyModel[267].setRotationPoint(-47.8F, -78.6F, 4.4F);

		bodyModel[268].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F); // Box 341
		bodyModel[268].setRotationPoint(-47.9F, -77.6F, 4.4F);
		bodyModel[268].rotateAngleX = -1.57079633F;

		bodyModel[269].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 342
		bodyModel[269].setRotationPoint(-47.8F, -77.6F, 4.4F);

		bodyModel[270].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 343
		bodyModel[270].setRotationPoint(-47.9F, -77.6F, 4.4F);
		bodyModel[270].rotateAngleX = 5.49778714F;

		bodyModel[271].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 344
		bodyModel[271].setRotationPoint(-47.8F, -77.6F, 4.4F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 345
		bodyModel[272].setRotationPoint(-47.8F, -77.6F, 3.4F);

		bodyModel[273].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 346
		bodyModel[273].setRotationPoint(-47.9F, -77.6F, 4.4F);
		bodyModel[273].rotateAngleX = 4.71238898F;

		bodyModel[274].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 347
		bodyModel[274].setRotationPoint(-47.9F, -77.6F, 4.4F);
		bodyModel[274].rotateAngleX = 3.92699082F;

		bodyModel[275].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 348
		bodyModel[275].setRotationPoint(-47.8F, -77.6F, 3.4F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F); // Box 349
		bodyModel[276].setRotationPoint(-47.8F, -78.6F, 3.4F);

		bodyModel[277].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 350
		bodyModel[277].setRotationPoint(-47.9F, -77.6F, 4.4F);
		bodyModel[277].rotateAngleX = 3.14159265F;

		bodyModel[278].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F); // Box 351
		bodyModel[278].setRotationPoint(-47.8F, -78.6F, 3.4F);

		bodyModel[279].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 352
		bodyModel[279].setRotationPoint(-47.9F, -77.6F, 4.4F);
		bodyModel[279].rotateAngleX = 2.35619449F;

		bodyModel[280].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F); // Box 353
		bodyModel[280].setRotationPoint(-47.8F, -78.6F, 3.4F);

		bodyModel[281].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 354
		bodyModel[281].setRotationPoint(-47.9F, -77.6F, 4.4F);
		bodyModel[281].rotateAngleX = 1.57079633F;

		bodyModel[282].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 355
		bodyModel[282].setRotationPoint(-47.8F, -78.6F, 4.4F);

		bodyModel[283].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 356
		bodyModel[283].setRotationPoint(-47.9F, -77.6F, 4.4F);
		bodyModel[283].rotateAngleX = 0.78539816F;

		bodyModel[284].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 387
		bodyModel[284].setRotationPoint(-47.8F, -75.6F, -6.3F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F); // Box 388
		bodyModel[285].setRotationPoint(-47.8F, -75.6F, -7.3F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 390
		bodyModel[286].setRotationPoint(-47.8F, -75.6F, -6.3F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F); // Box 391
		bodyModel[287].setRotationPoint(-47.8F, -75.6F, -7.3F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 392
		bodyModel[288].setRotationPoint(-47.8F, -74.6F, -7.3F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 393
		bodyModel[289].setRotationPoint(-47.8F, -74.6F, -7.3F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 394
		bodyModel[290].setRotationPoint(-47.8F, -74.6F, -6.3F);

		bodyModel[291].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 395
		bodyModel[291].setRotationPoint(-47.8F, -75.2F, -6.3F);

		bodyModel[292].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, 0F, 0F, -0.48F, 0F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, 0F, 0F, -0.48F, 0F); // Box 396
		bodyModel[292].setRotationPoint(-47.9F, -75.2F, -6.3F);
		bodyModel[292].rotateAngleX = -1.29154365F;

		bodyModel[293].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 397
		bodyModel[293].setRotationPoint(-47.9F, -74.6F, -6.3F);
		bodyModel[293].rotateAngleX = 3.14159265F;

		bodyModel[294].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 398
		bodyModel[294].setRotationPoint(-47.9F, -74.6F, -6.3F);
		bodyModel[294].rotateAngleX = 3.92699082F;

		bodyModel[295].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 399
		bodyModel[295].setRotationPoint(-47.9F, -74.6F, -6.3F);
		bodyModel[295].rotateAngleX = 5.49778714F;

		bodyModel[296].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 400
		bodyModel[296].setRotationPoint(-47.9F, -74.6F, -6.3F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F); // Box 401
		bodyModel[297].setRotationPoint(-47.7F, -75.8F, -7.3F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F); // Box 402
		bodyModel[298].setRotationPoint(-47.6F, -76.1F, -3.7F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F); // Box 403
		bodyModel[299].setRotationPoint(-47.6F, -76.1F, -3.7F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F); // Box 404
		bodyModel[300].setRotationPoint(-47.6F, -76.1F, -3.7F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 405
		bodyModel[301].setRotationPoint(-47.6F, -76.1F, -2.7F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 406
		bodyModel[302].setRotationPoint(-47.6F, -76.1F, -2.7F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 407
		bodyModel[303].setRotationPoint(-47.6F, -75.1F, -2.7F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 408
		bodyModel[304].setRotationPoint(-47.6F, -75.1F, -3.7F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 409
		bodyModel[305].setRotationPoint(-47.6F, -75.1F, -3.7F);

		bodyModel[306].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 410
		bodyModel[306].setRotationPoint(-47.7F, -75.1F, -2.7F);
		bodyModel[306].rotateAngleX = 3.92699082F;

		bodyModel[307].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 411
		bodyModel[307].setRotationPoint(-47.7F, -75.1F, -2.7F);
		bodyModel[307].rotateAngleX = 3.14159265F;

		bodyModel[308].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 412
		bodyModel[308].setRotationPoint(-47.7F, -75.1F, -2.7F);
		bodyModel[308].rotateAngleX = 2.35619449F;

		bodyModel[309].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 413
		bodyModel[309].setRotationPoint(-47.7F, -75.1F, -2.7F);
		bodyModel[309].rotateAngleX = 1.57079633F;

		bodyModel[310].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 414
		bodyModel[310].setRotationPoint(-47.7F, -75.1F, -2.7F);
		bodyModel[310].rotateAngleX = 0.78539816F;

		bodyModel[311].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 415
		bodyModel[311].setRotationPoint(-47.7F, -75.1F, -2.7F);

		bodyModel[312].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 416
		bodyModel[312].setRotationPoint(-47.7F, -75.1F, -2.7F);
		bodyModel[312].rotateAngleX = 5.49778714F;

		bodyModel[313].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 417
		bodyModel[313].setRotationPoint(-47.7F, -75.1F, -2.7F);
		bodyModel[313].rotateAngleX = 4.71238898F;

		bodyModel[314].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 418
		bodyModel[314].setRotationPoint(-47.6F, -75.1F, -2.7F);

		bodyModel[315].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F); // Box 419
		bodyModel[315].setRotationPoint(-47.7F, -75.1F, -2.7F);
		bodyModel[315].rotateAngleX = -1.57079633F;

		bodyModel[316].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 421
		bodyModel[316].setRotationPoint(-47.6F, -73.1F, -1.1F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 422
		bodyModel[317].setRotationPoint(-47.6F, -73.1F, -1.1F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F); // Box 423
		bodyModel[318].setRotationPoint(-47.6F, -73.1F, -1.1F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F); // Box 424
		bodyModel[319].setRotationPoint(-47.6F, -73.1F, -1.1F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F); // Box 425
		bodyModel[320].setRotationPoint(-47.6F, -73.1F, -1.1F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F); // Box 426
		bodyModel[321].setRotationPoint(-47.6F, -73.1F, -1.1F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F); // Box 427
		bodyModel[322].setRotationPoint(-47.6F, -73.1F, -1.1F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 428
		bodyModel[323].setRotationPoint(-47.6F, -73.1F, -1.1F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 429
		bodyModel[324].setRotationPoint(-47.8F, -78.6F, -4.4F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 430
		bodyModel[325].setRotationPoint(-47.8F, -78.6F, -4.4F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F); // Box 431
		bodyModel[326].setRotationPoint(-47.8F, -78.6F, -5.4F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F); // Box 432
		bodyModel[327].setRotationPoint(-47.8F, -78.6F, -5.4F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F); // Box 433
		bodyModel[328].setRotationPoint(-47.8F, -78.6F, -5.4F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 434
		bodyModel[329].setRotationPoint(-47.8F, -77.6F, -5.4F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 435
		bodyModel[330].setRotationPoint(-47.8F, -77.6F, -5.4F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 436
		bodyModel[331].setRotationPoint(-47.8F, -77.6F, -4.4F);

		bodyModel[332].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 437
		bodyModel[332].setRotationPoint(-47.9F, -77.6F, -4.4F);
		bodyModel[332].rotateAngleX = 5.49778714F;

		bodyModel[333].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 438
		bodyModel[333].setRotationPoint(-47.9F, -77.6F, -4.4F);

		bodyModel[334].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 439
		bodyModel[334].setRotationPoint(-47.9F, -77.6F, -4.4F);
		bodyModel[334].rotateAngleX = 0.78539816F;

		bodyModel[335].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 440
		bodyModel[335].setRotationPoint(-47.9F, -77.6F, -4.4F);
		bodyModel[335].rotateAngleX = 1.57079633F;

		bodyModel[336].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 441
		bodyModel[336].setRotationPoint(-47.9F, -77.6F, -4.4F);
		bodyModel[336].rotateAngleX = 2.35619449F;

		bodyModel[337].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 442
		bodyModel[337].setRotationPoint(-47.9F, -77.6F, -4.4F);
		bodyModel[337].rotateAngleX = 3.14159265F;

		bodyModel[338].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 443
		bodyModel[338].setRotationPoint(-47.9F, -77.6F, -4.4F);
		bodyModel[338].rotateAngleX = 3.92699082F;

		bodyModel[339].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 444
		bodyModel[339].setRotationPoint(-47.9F, -77.6F, -4.4F);
		bodyModel[339].rotateAngleX = 4.71238898F;

		bodyModel[340].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 445
		bodyModel[340].setRotationPoint(-47.8F, -77.6F, -4.4F);

		bodyModel[341].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, 0F, 0F, -0.48F, 0F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, 0F, 0F, -0.48F, 0F); // Box 446
		bodyModel[341].setRotationPoint(-47.9F, -77.6F, -4.4F);
		bodyModel[341].rotateAngleX = -4.36332313F;

		bodyModel[342].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, 0F, 0F, -0.48F, 0F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, 0F, 0F, -0.48F, 0F); // Box 447
		bodyModel[342].setRotationPoint(-47.9F, -77.6F, -4.4F);
		bodyModel[342].rotateAngleX = -1.32645023F;

		bodyModel[343].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 448
		bodyModel[343].setRotationPoint(-47.8F, -72.5F, 3.5F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F); // Box 449
		bodyModel[344].setRotationPoint(-47.8F, -73F, 3F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F); // Box 450
		bodyModel[345].setRotationPoint(-47.8F, -73F, 3F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F); // Box 451
		bodyModel[346].setRotationPoint(-47.8F, -73F, 3F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F); // Box 452
		bodyModel[347].setRotationPoint(-47.8F, -73F, 3F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F); // Box 453
		bodyModel[348].setRotationPoint(-47.8F, -73F, 3F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 454
		bodyModel[349].setRotationPoint(-47.8F, -73F, 3F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 455
		bodyModel[350].setRotationPoint(-47.8F, -73F, 3F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 456
		bodyModel[351].setRotationPoint(-47.8F, -73F, 3F);

		bodyModel[352].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F); // Box 457
		bodyModel[352].setRotationPoint(-47.9F, -72.5F, 3.5F);
		bodyModel[352].rotateAngleX = -1.57079633F;

		bodyModel[353].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F); // Box 458
		bodyModel[353].setRotationPoint(-47.7F, -72.6F, 1.5F);
		bodyModel[353].rotateAngleX = -1.57079633F;

		bodyModel[354].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 459
		bodyModel[354].setRotationPoint(-47.6F, -72.6F, 1.5F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F); // Box 460
		bodyModel[355].setRotationPoint(-47.6F, -73.1F, 1F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F); // Box 461
		bodyModel[356].setRotationPoint(-47.6F, -73.1F, 1F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F); // Box 462
		bodyModel[357].setRotationPoint(-47.6F, -73.1F, 1F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 463
		bodyModel[358].setRotationPoint(-47.6F, -73.1F, 1F);

		bodyModel[359].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 464
		bodyModel[359].setRotationPoint(-47.6F, -73.1F, 1F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 465
		bodyModel[360].setRotationPoint(-47.6F, -73.1F, 1F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F); // Box 466
		bodyModel[361].setRotationPoint(-47.6F, -73.1F, 1F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F); // Box 467
		bodyModel[362].setRotationPoint(-47.6F, -73.1F, 1F);

		bodyModel[363].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F); // Box 468
		bodyModel[363].setRotationPoint(-47.9F, -78F, 2F);
		bodyModel[363].rotateAngleX = 1.57079633F;

		bodyModel[364].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 469
		bodyModel[364].setRotationPoint(-47.8F, -78F, 2F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F); // Box 470
		bodyModel[365].setRotationPoint(-47.8F, -78.5F, 1.5F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F); // Box 471
		bodyModel[366].setRotationPoint(-47.8F, -78.5F, 1.5F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F); // Box 472
		bodyModel[367].setRotationPoint(-47.8F, -78.5F, 1.5F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 473
		bodyModel[368].setRotationPoint(-47.8F, -78.5F, 1.5F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 474
		bodyModel[369].setRotationPoint(-47.8F, -78.5F, 1.5F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 475
		bodyModel[370].setRotationPoint(-47.8F, -78.5F, 1.5F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F); // Box 476
		bodyModel[371].setRotationPoint(-47.8F, -78.5F, 1.5F);

		bodyModel[372].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F); // Box 477
		bodyModel[372].setRotationPoint(-47.8F, -78.5F, 1.5F);

		bodyModel[373].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F); // Box 478
		bodyModel[373].setRotationPoint(-47.8F, -73F, -6.5F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F); // Box 480
		bodyModel[374].setRotationPoint(-47.8F, -73F, -6.5F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F); // Box 481
		bodyModel[375].setRotationPoint(-47.8F, -73F, -6.5F);

		bodyModel[376].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F); // Box 482
		bodyModel[376].setRotationPoint(-47.8F, -73F, -6.5F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F); // Box 483
		bodyModel[377].setRotationPoint(-47.8F, -73F, -6.5F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 484
		bodyModel[378].setRotationPoint(-47.8F, -73F, -6.5F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 485
		bodyModel[379].setRotationPoint(-47.8F, -73F, -6.5F);

		bodyModel[380].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 486
		bodyModel[380].setRotationPoint(-47.8F, -73F, -6.5F);

		bodyModel[381].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, 0F, 0F, -0.48F, 0F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, 0F, 0F, -0.48F, 0F); // Box 487
		bodyModel[381].setRotationPoint(-47.9F, -72.5F, -6.6F);
		bodyModel[381].rotateAngleX = -0.38397244F;

		bodyModel[382].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 488
		bodyModel[382].setRotationPoint(-47.8F, -70.3F, -1.6F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 489
		bodyModel[383].setRotationPoint(-47.8F, -70.3F, 0.4F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F); // Box 460
		bodyModel[384].setRotationPoint(-47.8F, -73.5F, 4.8F);

		bodyModel[385].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 461
		bodyModel[385].setRotationPoint(-47.8F, -73.5F, 5.8F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 462
		bodyModel[386].setRotationPoint(-47.8F, -72.5F, 5.8F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 463
		bodyModel[387].setRotationPoint(-47.8F, -72.5F, 4.8F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 464
		bodyModel[388].setRotationPoint(-47.8F, -72.5F, 4.8F);

		bodyModel[389].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F); // Box 465
		bodyModel[389].setRotationPoint(-47.8F, -73.5F, 4.8F);

		bodyModel[390].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 466
		bodyModel[390].setRotationPoint(-47.9F, -72.5F, 5.8F);
		bodyModel[390].rotateAngleX = 3.14159265F;

		bodyModel[391].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F); // Box 467
		bodyModel[391].setRotationPoint(-47.8F, -73.5F, 4.8F);

		bodyModel[392].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F); // Box 468
		bodyModel[392].setRotationPoint(-47.9F, -72.5F, 5.8F);
		bodyModel[392].rotateAngleX = -3.90953752F;

		bodyModel[393].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 469
		bodyModel[393].setRotationPoint(-47.8F, -72.5F, 5.8F);

		bodyModel[394].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 470
		bodyModel[394].setRotationPoint(-47.9F, -72.5F, 5.8F);
		bodyModel[394].rotateAngleX = 3.92699082F;

		bodyModel[395].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 471
		bodyModel[395].setRotationPoint(-47.9F, -72.5F, 5.8F);
		bodyModel[395].rotateAngleX = 5.49778714F;

		bodyModel[396].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 472
		bodyModel[396].setRotationPoint(-47.9F, -72.5F, 5.8F);

		bodyModel[397].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 473
		bodyModel[397].setRotationPoint(-47.9F, -72.5F, 5.8F);
		bodyModel[397].rotateAngleX = 0.78539816F;

		bodyModel[398].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 474
		bodyModel[398].setRotationPoint(-47.9F, -72.5F, 5.8F);
		bodyModel[398].rotateAngleX = 1.57079633F;

		bodyModel[399].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 475
		bodyModel[399].setRotationPoint(-47.9F, -72.5F, 5.8F);
		bodyModel[399].rotateAngleX = 2.35619449F;

		bodyModel[400].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 476
		bodyModel[400].setRotationPoint(-47.8F, -73.5F, 5.8F);

		bodyModel[401].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F,0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F); // Box 477
		bodyModel[401].setRotationPoint(-47.9F, -77.5F, -2F);
		bodyModel[401].rotateAngleX = 1.57079633F;

		bodyModel[402].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 478
		bodyModel[402].setRotationPoint(-47.8F, -78F, -2F);

		bodyModel[403].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 479
		bodyModel[403].setRotationPoint(-47.8F, -78.5F, -2.5F);

		bodyModel[404].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 480
		bodyModel[404].setRotationPoint(-47.8F, -78.5F, -2.5F);

		bodyModel[405].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F); // Box 481
		bodyModel[405].setRotationPoint(-47.8F, -78.5F, -2.5F);

		bodyModel[406].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F); // Box 482
		bodyModel[406].setRotationPoint(-47.8F, -78.5F, -2.5F);

		bodyModel[407].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F); // Box 483
		bodyModel[407].setRotationPoint(-47.8F, -78.5F, -2.5F);

		bodyModel[408].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F); // Box 484
		bodyModel[408].setRotationPoint(-47.8F, -78.5F, -2.5F);

		bodyModel[409].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F); // Box 485
		bodyModel[409].setRotationPoint(-47.8F, -78.5F, -2.5F);

		bodyModel[410].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 486
		bodyModel[410].setRotationPoint(-47.8F, -78.5F, -2.5F);

		bodyModel[411].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 487
		bodyModel[411].setRotationPoint(-47.8F, -73.8F, -4F);

		bodyModel[412].addShapeBox(0F, 0F, 0F, 13, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 462
		bodyModel[412].setRotationPoint(-60F, -80F, -5F);

		bodyModel[413].addShapeBox(0F, 0F, 0F, 10, 1, 3, 0F,0F, -2F, 0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 2F, 2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 463
		bodyModel[413].setRotationPoint(-57F, -80F, -8F);

		bodyModel[414].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 465
		bodyModel[414].setRotationPoint(-47.5F, -80.5F, -1F);

		bodyModel[415].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, 0F); // Box 466
		bodyModel[415].setRotationPoint(-47.5F, -81F, -1F);

		bodyModel[416].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 467
		bodyModel[416].setRotationPoint(-46F, -81.25F, -1F);

		bodyModel[417].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 468
		bodyModel[417].setRotationPoint(-46F, -80.25F, -1F);

		bodyModel[418].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.6F, -0.25F, 0F); // Box 469
		bodyModel[418].setRotationPoint(-46.1F, -79.75F, -1F);

		bodyModel[419].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.7F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.5F, 0F, -0.7F, -0.5F, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 470
		bodyModel[419].setRotationPoint(-47.5F, -82F, -1F);

		bodyModel[420].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.7F, -0.5F, -0.3F, -0.2F, -0.5F, -0.3F, -0.2F, -0.3F, 0F, -0.7F, -0.3F, 0F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 471
		bodyModel[420].setRotationPoint(-47.5F, -82F, 0F);

		bodyModel[421].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.1F); // Box 472
		bodyModel[421].setRotationPoint(-45.7F, -81F, -1F);

		bodyModel[422].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,-2F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 512
		bodyModel[422].setRotationPoint(-60F, -80F, -8F);

		bodyModel[423].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1F, 0F, -1.5F); // Box 513
		bodyModel[423].setRotationPoint(-51F, -78F, -9F);

		bodyModel[424].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 514
		bodyModel[424].setRotationPoint(-50F, -76F, -9F);

		bodyModel[425].addShapeBox(0F, 0F, 0F, 10, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 2F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 2F, 2F, 0F, 0F, 2F, 0F); // Box 515
		bodyModel[425].setRotationPoint(-57F, -80F, 5F);

		bodyModel[426].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 516
		bodyModel[426].setRotationPoint(-60F, -80F, 5F);

		bodyModel[427].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 517
		bodyModel[427].setRotationPoint(-51F, -78F, 7F);

		bodyModel[428].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 518
		bodyModel[428].setRotationPoint(-50F, -76F, 8F);

		bodyModel[429].addShapeBox(0F, 0F, 0F, 9, 6, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 595
		bodyModel[429].setRotationPoint(-60F, -70F, -9F);

		bodyModel[430].addShapeBox(0F, -3F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 259
		bodyModel[430].setRotationPoint(-50F, -64F, -6F);
		bodyModel[430].rotateAngleZ = 0.15707963F;

		bodyModel[431].addShapeBox(0F, -3F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
		bodyModel[431].setRotationPoint(-50F, -64F, 4F);
		bodyModel[431].rotateAngleZ = 0.15707963F;

		bodyModel[432].addShapeBox(0F, 0F, 0F, 5, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 256
		bodyModel[432].setRotationPoint(-53F, -71F, -2F);

		bodyModel[433].addShapeBox(0F, 0F, 0F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[433].setRotationPoint(-47F, -65F, -2F);

		bodyModel[434].addShapeBox(0F, 0F, 0F, 7, 3, 3, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 254
		bodyModel[434].setRotationPoint(-47F, -66F, -1.5F);

		bodyModel[435].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 263
		bodyModel[435].setRotationPoint(-45.5F, -69F, -1F);

		bodyModel[436].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 264
		bodyModel[436].setRotationPoint(-45F, -73F, -0.5F);

		bodyModel[437].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 265
		bodyModel[437].setRotationPoint(-45F, -75F, -0.5F);

		bodyModel[438].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 266
		bodyModel[438].setRotationPoint(-44.7F, -75.1F, -0.5F);

		bodyModel[439].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 601
		bodyModel[439].setRotationPoint(-41.5F, -75.3F, -9.5F);

		bodyModel[440].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 602
		bodyModel[440].setRotationPoint(-41F, -73.3F, -10F);

		bodyModel[441].addShapeBox(-1F, -2F, 0F, 1, 2, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 603
		bodyModel[441].setRotationPoint(-40F, -73.3F, -9.2F);
		bodyModel[441].rotateAngleZ = 0.36651914F;

		bodyModel[442].addShapeBox(-1F, -2F, 0F, 1, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 604
		bodyModel[442].setRotationPoint(-40F, -73.3F, -8.7F);
		bodyModel[442].rotateAngleZ = 0.36651914F;

		bodyModel[443].addShapeBox(0F, 0F, 0F, 15, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 967
		bodyModel[443].setRotationPoint(-45F, -70.3F, -9F);

		bodyModel[444].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 968
		bodyModel[444].setRotationPoint(-46F, -70.3F, -9F);

		bodyModel[445].addShapeBox(0F, 0F, 0F, 15, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 613
		bodyModel[445].setRotationPoint(-45F, -70.3F, 6F);

		bodyModel[446].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 614
		bodyModel[446].setRotationPoint(-46F, -70.3F, 6F);

		bodyModel[447].addShapeBox(0F, 0F, 0F, 15, 11, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 615
		bodyModel[447].setRotationPoint(-30F, -74.3F, -9F);

		bodyModel[448].addShapeBox(0F, 0F, 0F, 15, 1, 18, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 616
		bodyModel[448].setRotationPoint(-30F, -75.3F, -9F);

		bodyModel[449].addShapeBox(0F, 0F, 0F, 15, 2, 10, 0F,0F, 0F, 0F, 0F, 1F, -4F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -3F, -5F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 873
		bodyModel[449].setRotationPoint(-7F, -49F, -10F);

		bodyModel[450].addShapeBox(0F, 0F, 0F, 15, 2, 10, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -5F, 0F, 0F, -5F); // Box 874
		bodyModel[450].setRotationPoint(-7F, -49F, 0F);
	}

	private void initnoseModel_1()
	{
		noseModel[0] = new ModelRendererTurbo(this, 1, 978, textureX, textureY); // Box 8
		noseModel[1] = new ModelRendererTurbo(this, 73, 978, textureX, textureY); // Box 9
		noseModel[2] = new ModelRendererTurbo(this, 145, 978, textureX, textureY); // Box 10
		noseModel[3] = new ModelRendererTurbo(this, 209, 978, textureX, textureY); // Box 11
		noseModel[4] = new ModelRendererTurbo(this, 281, 978, textureX, textureY); // Box 26
		noseModel[5] = new ModelRendererTurbo(this, 337, 978, textureX, textureY); // Box 27
		noseModel[6] = new ModelRendererTurbo(this, 401, 978, textureX, textureY); // Box 33
		noseModel[7] = new ModelRendererTurbo(this, 441, 978, textureX, textureY); // Box 40
		noseModel[8] = new ModelRendererTurbo(this, 497, 978, textureX, textureY); // Box 41
		noseModel[9] = new ModelRendererTurbo(this, 545, 978, textureX, textureY); // Box 42
		noseModel[10] = new ModelRendererTurbo(this, 569, 978, textureX, textureY); // Box 43
		noseModel[11] = new ModelRendererTurbo(this, 625, 978, textureX, textureY); // Box 44
		noseModel[12] = new ModelRendererTurbo(this, 681, 978, textureX, textureY); // Box 45
		noseModel[13] = new ModelRendererTurbo(this, 729, 978, textureX, textureY); // Box 46
		noseModel[14] = new ModelRendererTurbo(this, 769, 978, textureX, textureY); // Box 47
		noseModel[15] = new ModelRendererTurbo(this, 817, 978, textureX, textureY); // Box 49
		noseModel[16] = new ModelRendererTurbo(this, 865, 978, textureX, textureY); // Box 50
		noseModel[17] = new ModelRendererTurbo(this, 889, 978, textureX, textureY); // Box 51
		noseModel[18] = new ModelRendererTurbo(this, 937, 978, textureX, textureY); // Box 52
		noseModel[19] = new ModelRendererTurbo(this, 985, 978, textureX, textureY); // Box 53
		noseModel[20] = new ModelRendererTurbo(this, 1033, 978, textureX, textureY); // Box 54
		noseModel[21] = new ModelRendererTurbo(this, 57, 978, textureX, textureY); // Box 56
		noseModel[22] = new ModelRendererTurbo(this, 129, 978, textureX, textureY); // Box 57
		noseModel[23] = new ModelRendererTurbo(this, 193, 978, textureX, textureY); // Box 58
		noseModel[24] = new ModelRendererTurbo(this, 481, 978, textureX, textureY); // Box 59
		noseModel[25] = new ModelRendererTurbo(this, 609, 978, textureX, textureY); // Box 60
		noseModel[26] = new ModelRendererTurbo(this, 1073, 978, textureX, textureY); // Box 62
		noseModel[27] = new ModelRendererTurbo(this, 1105, 978, textureX, textureY); // Box 64
		noseModel[28] = new ModelRendererTurbo(this, 265, 978, textureX, textureY); // Box 102
		noseModel[29] = new ModelRendererTurbo(this, 385, 978, textureX, textureY); // Box 103
		noseModel[30] = new ModelRendererTurbo(this, 529, 978, textureX, textureY); // Box 104
		noseModel[31] = new ModelRendererTurbo(this, 665, 978, textureX, textureY); // Box 105
		noseModel[32] = new ModelRendererTurbo(this, 1, 978, textureX, textureY); // Box 106
		noseModel[33] = new ModelRendererTurbo(this, 145, 978, textureX, textureY); // Box 107
		noseModel[34] = new ModelRendererTurbo(this, 329, 978, textureX, textureY); // Box 108
		noseModel[35] = new ModelRendererTurbo(this, 713, 978, textureX, textureY); // Box 209
		noseModel[36] = new ModelRendererTurbo(this, 761, 978, textureX, textureY); // Box 210
		noseModel[37] = new ModelRendererTurbo(this, 801, 978, textureX, textureY); // Box 171
		noseModel[38] = new ModelRendererTurbo(this, 849, 978, textureX, textureY); // Box 172
		noseModel[39] = new ModelRendererTurbo(this, 921, 978, textureX, textureY); // Box 173
		noseModel[40] = new ModelRendererTurbo(this, 1, 1001, textureX, textureY); // Box 220
		noseModel[41] = new ModelRendererTurbo(this, 73, 1001, textureX, textureY); // Box 221
		noseModel[42] = new ModelRendererTurbo(this, 145, 1001, textureX, textureY); // Box 222
		noseModel[43] = new ModelRendererTurbo(this, 209, 1001, textureX, textureY); // Box 223
		noseModel[44] = new ModelRendererTurbo(this, 281, 1001, textureX, textureY); // Box 224
		noseModel[45] = new ModelRendererTurbo(this, 337, 1001, textureX, textureY); // Box 225
		noseModel[46] = new ModelRendererTurbo(this, 401, 1001, textureX, textureY); // Box 227
		noseModel[47] = new ModelRendererTurbo(this, 441, 1001, textureX, textureY); // Box 229
		noseModel[48] = new ModelRendererTurbo(this, 497, 1001, textureX, textureY); // Box 230
		noseModel[49] = new ModelRendererTurbo(this, 545, 1001, textureX, textureY); // Box 231
		noseModel[50] = new ModelRendererTurbo(this, 569, 1001, textureX, textureY); // Box 232
		noseModel[51] = new ModelRendererTurbo(this, 625, 1001, textureX, textureY); // Box 233
		noseModel[52] = new ModelRendererTurbo(this, 681, 1001, textureX, textureY); // Box 234
		noseModel[53] = new ModelRendererTurbo(this, 729, 1001, textureX, textureY); // Box 235
		noseModel[54] = new ModelRendererTurbo(this, 769, 1001, textureX, textureY); // Box 236
		noseModel[55] = new ModelRendererTurbo(this, 817, 1001, textureX, textureY); // Box 237
		noseModel[56] = new ModelRendererTurbo(this, 865, 1001, textureX, textureY); // Box 238
		noseModel[57] = new ModelRendererTurbo(this, 889, 1001, textureX, textureY); // Box 239
		noseModel[58] = new ModelRendererTurbo(this, 937, 1001, textureX, textureY); // Box 240
		noseModel[59] = new ModelRendererTurbo(this, 985, 1001, textureX, textureY); // Box 241
		noseModel[60] = new ModelRendererTurbo(this, 1033, 1001, textureX, textureY); // Box 242
		noseModel[61] = new ModelRendererTurbo(this, 57, 1001, textureX, textureY); // Box 243
		noseModel[62] = new ModelRendererTurbo(this, 129, 1001, textureX, textureY); // Box 244
		noseModel[63] = new ModelRendererTurbo(this, 193, 1001, textureX, textureY); // Box 245
		noseModel[64] = new ModelRendererTurbo(this, 481, 1001, textureX, textureY); // Box 246
		noseModel[65] = new ModelRendererTurbo(this, 609, 1001, textureX, textureY); // Box 247
		noseModel[66] = new ModelRendererTurbo(this, 1073, 1001, textureX, textureY); // Box 248
		noseModel[67] = new ModelRendererTurbo(this, 1105, 1001, textureX, textureY); // Box 259
		noseModel[68] = new ModelRendererTurbo(this, 265, 1001, textureX, textureY); // Box 297
		noseModel[69] = new ModelRendererTurbo(this, 385, 1001, textureX, textureY); // Box 298
		noseModel[70] = new ModelRendererTurbo(this, 529, 1001, textureX, textureY); // Box 299
		noseModel[71] = new ModelRendererTurbo(this, 665, 1001, textureX, textureY); // Box 300
		noseModel[72] = new ModelRendererTurbo(this, 1, 1001, textureX, textureY); // Box 301
		noseModel[73] = new ModelRendererTurbo(this, 145, 1001, textureX, textureY); // Box 302
		noseModel[74] = new ModelRendererTurbo(this, 329, 1001, textureX, textureY); // Box 303
		noseModel[75] = new ModelRendererTurbo(this, 713, 1001, textureX, textureY); // Box 304
		noseModel[76] = new ModelRendererTurbo(this, 761, 1001, textureX, textureY); // Box 305
		noseModel[77] = new ModelRendererTurbo(this, 801, 1001, textureX, textureY); // Box 366
		noseModel[78] = new ModelRendererTurbo(this, 849, 1001, textureX, textureY); // Box 367
		noseModel[79] = new ModelRendererTurbo(this, 921, 1001, textureX, textureY); // Box 368
		noseModel[80] = new ModelRendererTurbo(this, 1185, 1001, textureX, textureY); // Box 390
		noseModel[81] = new ModelRendererTurbo(this, 209, 978, textureX, textureY); // Box 239
		noseModel[82] = new ModelRendererTurbo(this, 817, 978, textureX, textureY); // Box 240
		noseModel[83] = new ModelRendererTurbo(this, 937, 978, textureX, textureY); // Box 241
		noseModel[84] = new ModelRendererTurbo(this, 969, 978, textureX, textureY); // Box 242
		noseModel[85] = new ModelRendererTurbo(this, 73, 978, textureX, textureY); // Box 243
		noseModel[86] = new ModelRendererTurbo(this, 985, 978, textureX, textureY); // Box 244
		noseModel[87] = new ModelRendererTurbo(this, 865, 978, textureX, textureY); // Box 245
		noseModel[88] = new ModelRendererTurbo(this, 1017, 978, textureX, textureY); // Box 246
		noseModel[89] = new ModelRendererTurbo(this, 1033, 978, textureX, textureY); // Box 247
		noseModel[90] = new ModelRendererTurbo(this, 81, 978, textureX, textureY); // Box 248
		noseModel[91] = new ModelRendererTurbo(this, 1065, 978, textureX, textureY); // Box 249
		noseModel[92] = new ModelRendererTurbo(this, 449, 978, textureX, textureY); // Box 250
		noseModel[93] = new ModelRendererTurbo(this, 129, 978, textureX, textureY); // Box 251
		noseModel[94] = new ModelRendererTurbo(this, 1097, 978, textureX, textureY); // Box 252
		noseModel[95] = new ModelRendererTurbo(this, 1153, 978, textureX, textureY); // Box 253
		noseModel[96] = new ModelRendererTurbo(this, 1161, 978, textureX, textureY); // Box 254
		noseModel[97] = new ModelRendererTurbo(this, 1177, 978, textureX, textureY); // Box 262
		noseModel[98] = new ModelRendererTurbo(this, 209, 1001, textureX, textureY); // Box 417
		noseModel[99] = new ModelRendererTurbo(this, 817, 1001, textureX, textureY); // Box 418
		noseModel[100] = new ModelRendererTurbo(this, 937, 1001, textureX, textureY); // Box 419
		noseModel[101] = new ModelRendererTurbo(this, 969, 1001, textureX, textureY); // Box 420
		noseModel[102] = new ModelRendererTurbo(this, 73, 1001, textureX, textureY); // Box 421
		noseModel[103] = new ModelRendererTurbo(this, 985, 1001, textureX, textureY); // Box 422
		noseModel[104] = new ModelRendererTurbo(this, 865, 1001, textureX, textureY); // Box 423
		noseModel[105] = new ModelRendererTurbo(this, 1017, 1001, textureX, textureY); // Box 424
		noseModel[106] = new ModelRendererTurbo(this, 1033, 1001, textureX, textureY); // Box 425
		noseModel[107] = new ModelRendererTurbo(this, 81, 1001, textureX, textureY); // Box 426
		noseModel[108] = new ModelRendererTurbo(this, 1065, 1001, textureX, textureY); // Box 427
		noseModel[109] = new ModelRendererTurbo(this, 449, 1001, textureX, textureY); // Box 428
		noseModel[110] = new ModelRendererTurbo(this, 129, 1001, textureX, textureY); // Box 429
		noseModel[111] = new ModelRendererTurbo(this, 1097, 1001, textureX, textureY); // Box 430
		noseModel[112] = new ModelRendererTurbo(this, 1153, 1001, textureX, textureY); // Box 431
		noseModel[113] = new ModelRendererTurbo(this, 1161, 1001, textureX, textureY); // Box 432
		noseModel[114] = new ModelRendererTurbo(this, 1177, 1001, textureX, textureY); // Box 433
		noseModel[115] = new ModelRendererTurbo(this, 1209, 1001, textureX, textureY); // Box 1
		noseModel[116] = new ModelRendererTurbo(this, 1225, 1001, textureX, textureY); // Box 2
		noseModel[117] = new ModelRendererTurbo(this, 1241, 1001, textureX, textureY); // Box 5
		noseModel[118] = new ModelRendererTurbo(this, 1257, 1001, textureX, textureY); // Box 6
		noseModel[119] = new ModelRendererTurbo(this, 1281, 1001, textureX, textureY); // Box 7
		noseModel[120] = new ModelRendererTurbo(this, 1305, 1001, textureX, textureY); // Box 8
		noseModel[121] = new ModelRendererTurbo(this, 1329, 1001, textureX, textureY); // Box 247
		noseModel[122] = new ModelRendererTurbo(this, 1353, 1001, textureX, textureY); // Box 248
		noseModel[123] = new ModelRendererTurbo(this, 1377, 1001, textureX, textureY); // Box 249
		noseModel[124] = new ModelRendererTurbo(this, 1401, 1001, textureX, textureY); // Box 444
		noseModel[125] = new ModelRendererTurbo(this, 1417, 1001, textureX, textureY); // Box 445
		noseModel[126] = new ModelRendererTurbo(this, 1433, 1001, textureX, textureY); // Box 446
		noseModel[127] = new ModelRendererTurbo(this, 1449, 1001, textureX, textureY); // Box 447
		noseModel[128] = new ModelRendererTurbo(this, 1465, 1001, textureX, textureY); // Box 448
		noseModel[129] = new ModelRendererTurbo(this, 1481, 1001, textureX, textureY); // Box 449
		noseModel[130] = new ModelRendererTurbo(this, 0, 28, textureX, textureY); // Box 450
		noseModel[131] = new ModelRendererTurbo(this, 0, 28, textureX, textureY); // Box 451
		noseModel[132] = new ModelRendererTurbo(this, 0, 28, textureX, textureY); // Box 452
		noseModel[133] = new ModelRendererTurbo(this, 0, 28, textureX, textureY); // Box 453
		noseModel[134] = new ModelRendererTurbo(this, 0, 28, textureX, textureY); // Box 454
		noseModel[135] = new ModelRendererTurbo(this, 0, 28, textureX, textureY); // Box 455
		noseModel[136] = new ModelRendererTurbo(this, 0, 28, textureX, textureY); // Box 456
		noseModel[137] = new ModelRendererTurbo(this, 0, 28, textureX, textureY); // Box 457
		noseModel[138] = new ModelRendererTurbo(this, 1273, 978, textureX, textureY); // Box 458
		noseModel[139] = new ModelRendererTurbo(this, 1281, 978, textureX, textureY); // Box 460
		noseModel[140] = new ModelRendererTurbo(this, 193, 1001, textureX, textureY); // Box 461
		noseModel[141] = new ModelRendererTurbo(this, 1025, 1001, textureX, textureY); // Box 462
		noseModel[142] = new ModelRendererTurbo(this, 1497, 1001, textureX, textureY); // Box 463
		noseModel[143] = new ModelRendererTurbo(this, 1521, 1001, textureX, textureY); // Box 464
		noseModel[144] = new ModelRendererTurbo(this, 1545, 1001, textureX, textureY); // Box 465
		noseModel[145] = new ModelRendererTurbo(this, 1593, 1001, textureX, textureY); // Box 466

		noseModel[0].addShapeBox(0F, 0F, 0F, 17, 6, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		noseModel[0].setRotationPoint(-81F, -65F, -15F);

		noseModel[1].addShapeBox(0F, 0F, 0F, 17, 6, 15, 0F,0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		noseModel[1].setRotationPoint(-81F, -71F, -15F);

		noseModel[2].addShapeBox(0F, 0F, 0F, 17, 6, 13, 0F,0F, -2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 10
		noseModel[2].setRotationPoint(-81F, -76F, -13F);

		noseModel[3].addShapeBox(0F, 0F, 0F, 17, 6, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		noseModel[3].setRotationPoint(-81F, -59F, -15F);

		noseModel[4].addShapeBox(0F, 0F, 0F, 17, 6, 10, 0F,0F, -2.5F, -3F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -5F, -2F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 26
		noseModel[4].setRotationPoint(-81F, -80F, -10F);

		noseModel[5].addShapeBox(0F, 0F, 0F, 17, 4, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 27
		noseModel[5].setRotationPoint(-81F, -53F, -13F);

		noseModel[6].addShapeBox(0F, 0F, 0F, 17, 4, 10, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -4F, 0F, 0F, -5F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 33
		noseModel[6].setRotationPoint(-81F, -50F, -10F);

		noseModel[7].addShapeBox(0F, 0F, 0F, 8, 5, 16, 0F,0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		noseModel[7].setRotationPoint(-89F, -70F, -16F);

		noseModel[8].addShapeBox(0F, 0F, 0F, 8, 4, 14, 0F,0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		noseModel[8].setRotationPoint(-89F, -74F, -14F);

		noseModel[9].addShapeBox(0F, 0F, 0F, 8, 3, 11, 0F,0F, -1F, -5F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		noseModel[9].setRotationPoint(-89F, -77F, -11F);

		noseModel[10].addShapeBox(0F, 0F, 0F, 8, 6, 16, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		noseModel[10].setRotationPoint(-89F, -65F, -16F);

		noseModel[11].addShapeBox(0F, 0F, 0F, 8, 6, 16, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		noseModel[11].setRotationPoint(-89F, -59F, -16F);

		noseModel[12].addShapeBox(0F, 0F, 0F, 8, 3, 14, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		noseModel[12].setRotationPoint(-89F, -53F, -14F);

		noseModel[13].addShapeBox(0F, 0F, 0F, 8, 5, 11, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -5F, 0F, -1F, -5F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 46
		noseModel[13].setRotationPoint(-89F, -50F, -11F);

		noseModel[14].addShapeBox(0F, 0F, 0F, 7, 6, 15, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		noseModel[14].setRotationPoint(-96F, -65F, -15F);

		noseModel[15].addShapeBox(0F, 0F, 0F, 7, 5, 13, 0F,0F, -1F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 49
		noseModel[15].setRotationPoint(-96F, -74F, -13F);

		noseModel[16].addShapeBox(0F, 0F, 0F, 7, 4, 10, 0F,0F, -1.5F, -5F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 50
		noseModel[16].setRotationPoint(-96F, -77F, -10F);

		noseModel[17].addShapeBox(0F, 0F, 0F, 7, 5, 15, 0F,0F, -1F, -2.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		noseModel[17].setRotationPoint(-96F, -70F, -15F);

		noseModel[18].addShapeBox(0F, 0F, 0F, 7, 6, 15, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 52
		noseModel[18].setRotationPoint(-96F, -59F, -15F);

		noseModel[19].addShapeBox(0F, 0F, 0F, 7, 4, 13, 0F,0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 53
		noseModel[19].setRotationPoint(-96F, -54F, -13F);

		noseModel[20].addShapeBox(0F, 0F, 0F, 7, 5, 10, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, -5F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 54
		noseModel[20].setRotationPoint(-96F, -51F, -10F);

		noseModel[21].addShapeBox(0F, 0F, 0F, 4, 6, 4, 0F,0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0.5F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F); // Box 56
		noseModel[21].setRotationPoint(-100F, -65F, -14F);

		noseModel[22].addShapeBox(0F, 0F, 0F, 4, 5, 5, 0F,0F, -1F, -3F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0.5F, -0.5F); // Box 57
		noseModel[22].setRotationPoint(-100F, -69F, -14F);

		noseModel[23].addShapeBox(0F, 0F, 0F, 4, 6, 5, 0F,0F, 0F, -2F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, -0.5F, 0F, -2F, -3F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, -2.5F, 0.5F); // Box 58
		noseModel[23].setRotationPoint(-100F, -60F, -14F);

		noseModel[24].addShapeBox(0F, 0F, 0F, 4, 5, 8, 0F,0F, -2F, -5.5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -3.5F, -1F, 0F, 0F, -2F, 0F, -1F, -0.5F, 0F, -1F, -4F, 0F, 1F, -4F); // Box 59
		noseModel[24].setRotationPoint(-100F, -73F, -13F);

		noseModel[25].addShapeBox(0F, 0F, 0F, 4, 5, 8, 0F,0F, 0F, -2F, 0F, -2F, -0.5F, 0F, -2F, -4F, 0F, 0.5F, -3.5F, 0F, -2F, -5.5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -3F, -1F); // Box 60
		noseModel[25].setRotationPoint(-100F, -56F, -13F);

		noseModel[26].addShapeBox(0F, 0F, 0F, 4, 6, 9, 0F,0F, -1F, -5.5F, 0F, -2F, -4F, 0F, -3F, 0F, 0F, -1.5F, 0F, 0F, -3F, -5F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 62
		noseModel[26].setRotationPoint(-100F, -53F, -9F);

		noseModel[27].addShapeBox(0F, 0F, 0F, 17, 2, 10, 0F,0F, -3.9999F, 0F, 0F, 0.9999F, -1.9999F, 0F, 0.9999F, 0F, 0F, -3.9999F, 0F, 0F, 1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.9999F, 0F); // Box 64
		noseModel[27].setRotationPoint(-81F, -78F, -10F);

		noseModel[28].addShapeBox(0F, 0F, 0F, 7, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		noseModel[28].setRotationPoint(-96F, -78F, -4F);

		noseModel[29].addShapeBox(0F, 0F, 0F, 7, 2, 4, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		noseModel[29].setRotationPoint(-96F, -80F, -4F);

		noseModel[30].addShapeBox(0F, 0F, 0F, 8, 4, 4, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		noseModel[30].setRotationPoint(-89F, -78F, -4F);

		noseModel[31].addShapeBox(0F, 0F, 0F, 8, 2, 4, 0F,0F, 0F, -1.5F, 0F, -2.25F, -0.75F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 105
		noseModel[31].setRotationPoint(-89F, -80F, -4F);

		noseModel[32].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 106
		noseModel[32].setRotationPoint(-100F, -78F, -4F);

		noseModel[33].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -2.5F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, -2.5F, 1.5F, 0F, 1.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1.5F, 0F); // Box 107
		noseModel[33].setRotationPoint(-100F, -80F, -4F);

		noseModel[34].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0F, -2.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0.5F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0F, 0F, 0.5F, 0F); // Box 108
		noseModel[34].setRotationPoint(-100F, -80F, -2F);

		noseModel[35].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 209
		noseModel[35].setRotationPoint(-84F, -77.5F, -6.5F);

		noseModel[36].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 210
		noseModel[36].setRotationPoint(-84F, -77.5F, -6.5F);

		noseModel[37].addShapeBox(0F, 0F, 0F, 4, 2, 5, 0F,0F, -4F, -1.5F, 0F, -2F, 0F, 0F, 0.5F, -1F, 0F, -2F, 0F, 0F, 3.5F, -3F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 2.5F, 0F); // Box 171
		noseModel[37].setRotationPoint(-100F, -75F, -9F);

		noseModel[38].addShapeBox(0F, 0F, 0F, 4, 2, 5, 0F,0F, -2F, -1F, 0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, 2.5F, -1F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 2F, 0F); // Box 172
		noseModel[38].setRotationPoint(-100F, -75F, -5F);

		noseModel[39].addShapeBox(0F, 0F, 0F, 4, 2, 5, 0F,0F, 3F, -3F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 1F, 0.5F, 0F, -4F, -1.5F, 0F, -2F, 1F, 0F, 1F, -1F, 0F, -1F, 0F); // Box 173
		noseModel[39].setRotationPoint(-100F, -51F, -9F);

		noseModel[40].addShapeBox(0F, 0F, 0F, 17, 6, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		noseModel[40].setRotationPoint(-81F, -65F, 0F);

		noseModel[41].addShapeBox(0F, 0F, 0F, 17, 6, 15, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221
		noseModel[41].setRotationPoint(-81F, -71F, 0F);

		noseModel[42].addShapeBox(0F, 0F, 0F, 17, 6, 13, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 222
		noseModel[42].setRotationPoint(-81F, -76F, 0F);

		noseModel[43].addShapeBox(0F, 0F, 0F, 17, 6, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 223
		noseModel[43].setRotationPoint(-81F, -59F, 0F);

		noseModel[44].addShapeBox(0F, 0F, 0F, 17, 6, 10, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -2.5F, -3F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, -2F, 0F, 0F, 0F); // Box 224
		noseModel[44].setRotationPoint(-81F, -80F, 0F);

		noseModel[45].addShapeBox(0F, 0F, 0F, 17, 4, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, -3F); // Box 225
		noseModel[45].setRotationPoint(-81F, -53F, 0F);

		noseModel[46].addShapeBox(0F, 0F, 0F, 17, 4, 10, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -5F, 0F, -1F, -4F); // Box 227
		noseModel[46].setRotationPoint(-81F, -50F, 0F);

		noseModel[47].addShapeBox(0F, 0F, 0F, 8, 5, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 229
		noseModel[47].setRotationPoint(-89F, -70F, 0F);

		noseModel[48].addShapeBox(0F, 0F, 0F, 8, 4, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 230
		noseModel[48].setRotationPoint(-89F, -74F, 0F);

		noseModel[49].addShapeBox(0F, 0F, 0F, 8, 3, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 231
		noseModel[49].setRotationPoint(-89F, -77F, 0F);

		noseModel[50].addShapeBox(0F, 0F, 0F, 8, 6, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 232
		noseModel[50].setRotationPoint(-89F, -65F, 0F);

		noseModel[51].addShapeBox(0F, 0F, 0F, 8, 6, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F); // Box 233
		noseModel[51].setRotationPoint(-89F, -59F, 0F);

		noseModel[52].addShapeBox(0F, 0F, 0F, 8, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F); // Box 234
		noseModel[52].setRotationPoint(-89F, -53F, 0F);

		noseModel[53].addShapeBox(0F, 0F, 0F, 8, 5, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -5F, 0F, -2F, -5F); // Box 235
		noseModel[53].setRotationPoint(-89F, -50F, 0F);

		noseModel[54].addShapeBox(0F, 0F, 0F, 7, 6, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 236
		noseModel[54].setRotationPoint(-96F, -65F, 0F);

		noseModel[55].addShapeBox(0F, 0F, 0F, 7, 5, 13, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F); // Box 237
		noseModel[55].setRotationPoint(-96F, -74F, 0F);

		noseModel[56].addShapeBox(0F, 0F, 0F, 7, 4, 10, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, -4F, 0F, -1.5F, -5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F); // Box 238
		noseModel[56].setRotationPoint(-96F, -77F, 0F);

		noseModel[57].addShapeBox(0F, 0F, 0F, 7, 5, 15, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 239
		noseModel[57].setRotationPoint(-96F, -70F, 0F);

		noseModel[58].addShapeBox(0F, 0F, 0F, 7, 6, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -2.5F); // Box 240
		noseModel[58].setRotationPoint(-96F, -59F, 0F);

		noseModel[59].addShapeBox(0F, 0F, 0F, 7, 4, 13, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, -3F); // Box 241
		noseModel[59].setRotationPoint(-96F, -54F, 0F);

		noseModel[60].addShapeBox(0F, 0F, 0F, 7, 5, 10, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -4F, 0F, -2F, -5F); // Box 242
		noseModel[60].setRotationPoint(-96F, -51F, 0F);

		noseModel[61].addShapeBox(0F, 0F, 0F, 4, 6, 4, 0F,0F, -1.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F); // Box 243
		noseModel[61].setRotationPoint(-100F, -65F, 10F);

		noseModel[62].addShapeBox(0F, 0F, 0F, 4, 5, 5, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1F, -3F, 0F, 0.5F, -0.5F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, -2F); // Box 244
		noseModel[62].setRotationPoint(-100F, -69F, 9F);

		noseModel[63].addShapeBox(0F, 0F, 0F, 4, 6, 5, 0F,0F, 0F, -0.5F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, -2.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -2F, -3F); // Box 245
		noseModel[63].setRotationPoint(-100F, -60F, 9F);

		noseModel[64].addShapeBox(0F, 0F, 0F, 4, 5, 8, 0F,0F, -3.5F, -1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -2F, -5.5F, 0F, 1F, -4F, 0F, -1F, -4F, 0F, -1F, -0.5F, 0F, 0F, -2F); // Box 246
		noseModel[64].setRotationPoint(-100F, -73F, 5F);

		noseModel[65].addShapeBox(0F, 0F, 0F, 4, 5, 8, 0F,0F, 0.5F, -3.5F, 0F, -2F, -4F, 0F, -2F, -0.5F, 0F, 0F, -2F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -5.5F); // Box 247
		noseModel[65].setRotationPoint(-100F, -56F, 5F);

		noseModel[66].addShapeBox(0F, 0F, 0F, 4, 6, 9, 0F,0F, -1.5F, 0F, 0F, -3F, 0F, 0F, -2F, -4F, 0F, -1F, -5.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, -4F, 0F, -3F, -5F); // Box 248
		noseModel[66].setRotationPoint(-100F, -53F, 0F);

		noseModel[67].addShapeBox(0F, 0F, 0F, 17, 2, 10, 0F,0F, -3.9999F, 0F, 0F, 0.9999F, 0F, 0F, 0.9999F, -1.9999F, 0F, -3.9999F, 0F, 0F, 1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.9999F, 0F); // Box 259
		noseModel[67].setRotationPoint(-81F, -78F, 0F);

		noseModel[68].addShapeBox(0F, 0F, 0F, 7, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 297
		noseModel[68].setRotationPoint(-96F, -78F, 0F);

		noseModel[69].addShapeBox(0F, 0F, 0F, 7, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
		noseModel[69].setRotationPoint(-96F, -80F, 0F);

		noseModel[70].addShapeBox(0F, 0F, 0F, 8, 4, 4, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		noseModel[70].setRotationPoint(-89F, -78F, 0F);

		noseModel[71].addShapeBox(0F, 0F, 0F, 8, 2, 4, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2.25F, -0.75F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 300
		noseModel[71].setRotationPoint(-89F, -80F, 0F);

		noseModel[72].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 301
		noseModel[72].setRotationPoint(-100F, -78F, 3F);

		noseModel[73].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -2.5F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, -2.5F, -1.5F, 0F, 1.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1.5F, 0F); // Box 302
		noseModel[73].setRotationPoint(-100F, -80F, 3F);

		noseModel[74].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -2.5F, 0.5F, 0F, 0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0.5F, 0F, 0.5F, 0.5F); // Box 303
		noseModel[74].setRotationPoint(-100F, -80F, 0F);

		noseModel[75].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 304
		noseModel[75].setRotationPoint(-84F, -77.5F, 5.5F);

		noseModel[76].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 305
		noseModel[76].setRotationPoint(-84F, -77.5F, 5.5F);

		noseModel[77].addShapeBox(0F, 0F, 0F, 4, 2, 5, 0F,0F, -2F, 0F, 0F, 0.5F, -1F, 0F, -2F, 0F, 0F, -4F, -1.5F, 0F, 2.5F, 0F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 3.5F, -3F); // Box 366
		noseModel[77].setRotationPoint(-100F, -75F, 4F);

		noseModel[78].addShapeBox(0F, 0F, 0F, 4, 2, 5, 0F,0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, -2F, -1F, 0F, 2F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 2.5F, -1F); // Box 367
		noseModel[78].setRotationPoint(-100F, -75F, 0F);

		noseModel[79].addShapeBox(0F, 0F, 0F, 4, 2, 5, 0F,0F, 1F, 0.5F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 3F, -3F, 0F, -1F, 0F, 0F, 1F, -1F, 0F, -2F, 1F, 0F, -4F, -1.5F); // Box 368
		noseModel[79].setRotationPoint(-100F, -51F, 4F);

		noseModel[80].addShapeBox(0F, 0F, 0F, 7, 4, 4, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, -3F, 0F, 1F, -3F, 0F, 0F, 0F, 0F); // Box 390
		noseModel[80].setRotationPoint(-78F, -47F, -2F);

		noseModel[81].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
		noseModel[81].setRotationPoint(-84.5F, -56F, -15F);

		noseModel[82].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 240
		noseModel[82].setRotationPoint(-84.5F, -54F, -15F);

		noseModel[83].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		noseModel[83].setRotationPoint(-84.5F, -55F, -15F);

		noseModel[84].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		noseModel[84].setRotationPoint(-81.5F, -56F, -18F);

		noseModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		noseModel[85].setRotationPoint(-82.5F, -56F, -16F);

		noseModel[86].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		noseModel[86].setRotationPoint(-84.5F, -55F, -17F);

		noseModel[87].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		noseModel[87].setRotationPoint(-84.5F, -55F, -18F);

		noseModel[88].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 246
		noseModel[88].setRotationPoint(-84.5F, -56F, -17F);

		noseModel[89].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		noseModel[89].setRotationPoint(-84.5F, -56F, -18F);

		noseModel[90].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		noseModel[90].setRotationPoint(-84.5F, -56F, -16F);

		noseModel[91].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 249
		noseModel[91].setRotationPoint(-81.5F, -55F, -18F);

		noseModel[92].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 250
		noseModel[92].setRotationPoint(-84.5F, -54F, -16F);

		noseModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 251
		noseModel[93].setRotationPoint(-82.5F, -54F, -16F);

		noseModel[94].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 252
		noseModel[94].setRotationPoint(-84.5F, -54F, -17F);

		noseModel[95].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 253
		noseModel[95].setRotationPoint(-84.5F, -54F, -18F);

		noseModel[96].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 254
		noseModel[96].setRotationPoint(-81.5F, -54F, -18F);

		noseModel[97].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 262
		noseModel[97].setRotationPoint(-81.5F, -55F, -16F);

		noseModel[98].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 417
		noseModel[98].setRotationPoint(-84.5F, -56F, 12F);

		noseModel[99].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 418
		noseModel[99].setRotationPoint(-84.5F, -54F, 12F);

		noseModel[100].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 419
		noseModel[100].setRotationPoint(-84.5F, -55F, 12F);

		noseModel[101].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 420
		noseModel[101].setRotationPoint(-81.5F, -56F, 15F);

		noseModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 421
		noseModel[102].setRotationPoint(-82.5F, -56F, 15F);

		noseModel[103].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 422
		noseModel[103].setRotationPoint(-84.5F, -55F, 15F);

		noseModel[104].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 423
		noseModel[104].setRotationPoint(-84.5F, -55F, 17F);

		noseModel[105].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 424
		noseModel[105].setRotationPoint(-84.5F, -56F, 16F);

		noseModel[106].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 425
		noseModel[106].setRotationPoint(-84.5F, -56F, 17F);

		noseModel[107].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 426
		noseModel[107].setRotationPoint(-84.5F, -56F, 15F);

		noseModel[108].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 427
		noseModel[108].setRotationPoint(-81.5F, -55F, 17F);

		noseModel[109].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 428
		noseModel[109].setRotationPoint(-84.5F, -54F, 15F);

		noseModel[110].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 429
		noseModel[110].setRotationPoint(-82.5F, -54F, 15F);

		noseModel[111].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 430
		noseModel[111].setRotationPoint(-84.5F, -54F, 16F);

		noseModel[112].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F); // Box 431
		noseModel[112].setRotationPoint(-84.5F, -54F, 17F);

		noseModel[113].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 432
		noseModel[113].setRotationPoint(-81.5F, -54F, 15F);

		noseModel[114].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 433
		noseModel[114].setRotationPoint(-81.5F, -55F, 15F);

		noseModel[115].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 1
		noseModel[115].setRotationPoint(-107F, -64F, -2F);

		noseModel[116].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 2
		noseModel[116].setRotationPoint(-107F, -62F, -2F);

		noseModel[117].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 5
		noseModel[117].setRotationPoint(-107F, -60F, -2F);

		noseModel[118].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, -0.5F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -1F); // Box 6
		noseModel[118].setRotationPoint(-111F, -62F, -2F);

		noseModel[119].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, -2F, -1.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, -1.5F, 0F, 0.5F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, -1F); // Box 7
		noseModel[119].setRotationPoint(-111F, -64F, -2F);

		noseModel[120].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0.5F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, -1F, 0F, -2F, -1.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, -1.5F); // Box 8
		noseModel[120].setRotationPoint(-111F, -60F, -2F);

		noseModel[121].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		noseModel[121].setRotationPoint(-105F, -62.5F, -0.5F);

		noseModel[122].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		noseModel[122].setRotationPoint(-105F, -62.5F, -1.5F);

		noseModel[123].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 249
		noseModel[123].setRotationPoint(-105F, -62.5F, 0.5F);

		noseModel[124].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, -2F, -1.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, -1.5F, 0F, 0.5F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, -1F); // Box 444
		noseModel[124].setRotationPoint(-100F, -64F, -2F);

		noseModel[125].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, -0.5F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -1F); // Box 445
		noseModel[125].setRotationPoint(-100F, -62F, -2F);

		noseModel[126].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0.5F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, -1F, 0F, -2F, -1.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, -1.5F); // Box 446
		noseModel[126].setRotationPoint(-100F, -60F, -2F);

		noseModel[127].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 447
		noseModel[127].setRotationPoint(-98F, -64F, -2F);

		noseModel[128].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 448
		noseModel[128].setRotationPoint(-98F, -62F, -2F);

		noseModel[129].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 449
		noseModel[129].setRotationPoint(-98F, -60F, -2F);

		noseModel[130].addShapeBox(0F, -1F, -12F, 1, 2, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 450
		noseModel[130].setRotationPoint(-97F, -61F, 0F);

		noseModel[131].addShapeBox(-1F, -1F, -12F, 1, 2, 24, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 451
		noseModel[131].setRotationPoint(-97F, -61F, 0F);

		noseModel[132].addShapeBox(0F, -1F, -12F, 1, 2, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 452
		noseModel[132].setRotationPoint(-97F, -61F, 0F);
		noseModel[132].rotateAngleX = -1.57079633F;

		noseModel[133].addShapeBox(-1F, -1F, -12F, 1, 2, 24, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 453
		noseModel[133].setRotationPoint(-97F, -61F, 0F);
		noseModel[133].rotateAngleX = -1.57079633F;

		noseModel[134].addShapeBox(0F, -1F, -12F, 1, 2, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 454
		noseModel[134].setRotationPoint(-97F, -61F, 0F);
		noseModel[134].rotateAngleX = -0.78539816F;

		noseModel[135].addShapeBox(-1F, -1F, -12F, 1, 2, 24, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 455
		noseModel[135].setRotationPoint(-97F, -61F, 0F);
		noseModel[135].rotateAngleX = -0.78539816F;

		noseModel[136].addShapeBox(0F, -1F, -12F, 1, 2, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 456
		noseModel[136].setRotationPoint(-97F, -61F, 0F);
		noseModel[136].rotateAngleX = 0.78539816F;

		noseModel[137].addShapeBox(-1F, -1F, -12F, 1, 2, 24, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 457
		noseModel[137].setRotationPoint(-97F, -61F, 0F);
		noseModel[137].rotateAngleX = 0.78539816F;

		noseModel[138].addShapeBox(0F, 0F, 0F, 2, 25, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 458
		noseModel[138].setRotationPoint(-68.5F, -100F, -10F);

		noseModel[139].addShapeBox(0F, 0F, 0F, 160, 1, 1, 0F,-0.5F, -11F, 0.5F, 0F, 0F, -9F, 0F, 0F, 9F, -0.5F, -11F, -0.5F, -0.5F, 11F, 0.5F, 0F, 0F, -9F, 0F, 0F, 9F, -0.5F, 11F, -0.5F); // Box 460
		noseModel[139].setRotationPoint(-67.5F, -111F, -9.5F);

		noseModel[140].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 461
		noseModel[140].setRotationPoint(-68.5F, -46F, -0.5F);

		noseModel[141].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 462
		noseModel[141].setRotationPoint(-68.5F, -44F, -1.5F);

		noseModel[142].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 463
		noseModel[142].setRotationPoint(-67.5F, -44F, -1.5F);

		noseModel[143].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 464
		noseModel[143].setRotationPoint(-67.5F, -44F, 0.5F);

		noseModel[144].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 465
		noseModel[144].setRotationPoint(-59.5F, -44F, -3.5F);

		noseModel[145].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 466
		noseModel[145].setRotationPoint(-59.5F, -44F, 2.5F);
	}

	private void inittailModel_1()
	{
		tailModel[0] = new ModelRendererTurbo(this, 553, 896, textureX, textureY); // Box 56
		tailModel[1] = new ModelRendererTurbo(this, 617, 896, textureX, textureY); // Box 57
		tailModel[2] = new ModelRendererTurbo(this, 681, 896, textureX, textureY); // Box 58
		tailModel[3] = new ModelRendererTurbo(this, 849, 896, textureX, textureY); // Box 61
		tailModel[4] = new ModelRendererTurbo(this, 905, 896, textureX, textureY); // Box 62
		tailModel[5] = new ModelRendererTurbo(this, 969, 896, textureX, textureY); // Box 63
		tailModel[6] = new ModelRendererTurbo(this, 1025, 896, textureX, textureY); // Box 96
		tailModel[7] = new ModelRendererTurbo(this, 1089, 896, textureX, textureY); // Box 97
		tailModel[8] = new ModelRendererTurbo(this, 1153, 896, textureX, textureY); // Box 98
		tailModel[9] = new ModelRendererTurbo(this, 1217, 896, textureX, textureY); // Box 99
		tailModel[10] = new ModelRendererTurbo(this, 1281, 896, textureX, textureY); // Box 100
		tailModel[11] = new ModelRendererTurbo(this, 1337, 896, textureX, textureY); // Box 101
		tailModel[12] = new ModelRendererTurbo(this, 1, 872, textureX, textureY); // Box 111
		tailModel[13] = new ModelRendererTurbo(this, 41, 872, textureX, textureY); // Box 112
		tailModel[14] = new ModelRendererTurbo(this, 81, 872, textureX, textureY); // Box 113
		tailModel[15] = new ModelRendererTurbo(this, 121, 872, textureX, textureY); // Box 114
		tailModel[16] = new ModelRendererTurbo(this, 161, 872, textureX, textureY); // Box 115
		tailModel[17] = new ModelRendererTurbo(this, 201, 872, textureX, textureY); // Box 116
		tailModel[18] = new ModelRendererTurbo(this, 233, 872, textureX, textureY); // Box 132
		tailModel[19] = new ModelRendererTurbo(this, 273, 872, textureX, textureY); // Box 133
		tailModel[20] = new ModelRendererTurbo(this, 305, 872, textureX, textureY); // Box 134
		tailModel[21] = new ModelRendererTurbo(this, 345, 872, textureX, textureY); // Box 135
		tailModel[22] = new ModelRendererTurbo(this, 377, 872, textureX, textureY); // Box 136
		tailModel[23] = new ModelRendererTurbo(this, 417, 872, textureX, textureY); // Box 137
		tailModel[24] = new ModelRendererTurbo(this, 457, 872, textureX, textureY); // Box 138
		tailModel[25] = new ModelRendererTurbo(this, 489, 872, textureX, textureY); // Box 139
		tailModel[26] = new ModelRendererTurbo(this, 521, 872, textureX, textureY); // Box 140
		tailModel[27] = new ModelRendererTurbo(this, 561, 872, textureX, textureY); // Box 141
		tailModel[28] = new ModelRendererTurbo(this, 593, 872, textureX, textureY); // Box 142
		tailModel[29] = new ModelRendererTurbo(this, 633, 872, textureX, textureY); // Box 143
		tailModel[30] = new ModelRendererTurbo(this, 665, 872, textureX, textureY); // Box 144
		tailModel[31] = new ModelRendererTurbo(this, 33, 872, textureX, textureY); // Box 145
		tailModel[32] = new ModelRendererTurbo(this, 73, 872, textureX, textureY); // Box 146
		tailModel[33] = new ModelRendererTurbo(this, 113, 872, textureX, textureY); // Box 147
		tailModel[34] = new ModelRendererTurbo(this, 1, 686, textureX, textureY); // Box 158
		tailModel[35] = new ModelRendererTurbo(this, 129, 686, textureX, textureY); // Box 159
		tailModel[36] = new ModelRendererTurbo(this, 257, 686, textureX, textureY); // Box 160
		tailModel[37] = new ModelRendererTurbo(this, 81, 686, textureX, textureY); // Box 161
		tailModel[38] = new ModelRendererTurbo(this, 121, 686, textureX, textureY); // Box 162
		tailModel[39] = new ModelRendererTurbo(this, 1, 792, textureX, textureY); // Box 163
		tailModel[40] = new ModelRendererTurbo(this, 49, 792, textureX, textureY); // Box 164
		tailModel[41] = new ModelRendererTurbo(this, 81, 792, textureX, textureY); // Box 165
		tailModel[42] = new ModelRendererTurbo(this, 113, 792, textureX, textureY); // Box 166
		tailModel[43] = new ModelRendererTurbo(this, 129, 792, textureX, textureY); // Box 167
		tailModel[44] = new ModelRendererTurbo(this, 145, 792, textureX, textureY); // Box 168
		tailModel[45] = new ModelRendererTurbo(this, 193, 792, textureX, textureY); // Box 170
		tailModel[46] = new ModelRendererTurbo(this, 553, 915, textureX, textureY); // Box 251
		tailModel[47] = new ModelRendererTurbo(this, 617, 915, textureX, textureY); // Box 252
		tailModel[48] = new ModelRendererTurbo(this, 681, 915, textureX, textureY); // Box 253
		tailModel[49] = new ModelRendererTurbo(this, 849, 915, textureX, textureY); // Box 256
		tailModel[50] = new ModelRendererTurbo(this, 905, 915, textureX, textureY); // Box 257
		tailModel[51] = new ModelRendererTurbo(this, 969, 915, textureX, textureY); // Box 258
		tailModel[52] = new ModelRendererTurbo(this, 1025, 915, textureX, textureY); // Box 291
		tailModel[53] = new ModelRendererTurbo(this, 1089, 915, textureX, textureY); // Box 292
		tailModel[54] = new ModelRendererTurbo(this, 1153, 915, textureX, textureY); // Box 293
		tailModel[55] = new ModelRendererTurbo(this, 1217, 915, textureX, textureY); // Box 294
		tailModel[56] = new ModelRendererTurbo(this, 1281, 915, textureX, textureY); // Box 295
		tailModel[57] = new ModelRendererTurbo(this, 1337, 915, textureX, textureY); // Box 296
		tailModel[58] = new ModelRendererTurbo(this, 1, 884, textureX, textureY); // Box 306
		tailModel[59] = new ModelRendererTurbo(this, 41, 884, textureX, textureY); // Box 307
		tailModel[60] = new ModelRendererTurbo(this, 81, 884, textureX, textureY); // Box 308
		tailModel[61] = new ModelRendererTurbo(this, 121, 884, textureX, textureY); // Box 309
		tailModel[62] = new ModelRendererTurbo(this, 161, 884, textureX, textureY); // Box 310
		tailModel[63] = new ModelRendererTurbo(this, 201, 884, textureX, textureY); // Box 311
		tailModel[64] = new ModelRendererTurbo(this, 233, 884, textureX, textureY); // Box 327
		tailModel[65] = new ModelRendererTurbo(this, 273, 884, textureX, textureY); // Box 328
		tailModel[66] = new ModelRendererTurbo(this, 305, 884, textureX, textureY); // Box 329
		tailModel[67] = new ModelRendererTurbo(this, 345, 884, textureX, textureY); // Box 330
		tailModel[68] = new ModelRendererTurbo(this, 377, 884, textureX, textureY); // Box 331
		tailModel[69] = new ModelRendererTurbo(this, 417, 884, textureX, textureY); // Box 332
		tailModel[70] = new ModelRendererTurbo(this, 457, 884, textureX, textureY); // Box 333
		tailModel[71] = new ModelRendererTurbo(this, 489, 884, textureX, textureY); // Box 334
		tailModel[72] = new ModelRendererTurbo(this, 521, 884, textureX, textureY); // Box 335
		tailModel[73] = new ModelRendererTurbo(this, 561, 884, textureX, textureY); // Box 336
		tailModel[74] = new ModelRendererTurbo(this, 593, 884, textureX, textureY); // Box 337
		tailModel[75] = new ModelRendererTurbo(this, 633, 884, textureX, textureY); // Box 338
		tailModel[76] = new ModelRendererTurbo(this, 665, 884, textureX, textureY); // Box 339
		tailModel[77] = new ModelRendererTurbo(this, 33, 884, textureX, textureY); // Box 340
		tailModel[78] = new ModelRendererTurbo(this, 73, 884, textureX, textureY); // Box 341
		tailModel[79] = new ModelRendererTurbo(this, 113, 884, textureX, textureY); // Box 342
		tailModel[80] = new ModelRendererTurbo(this, 1, 739, textureX, textureY); // Box 353
		tailModel[81] = new ModelRendererTurbo(this, 129, 739, textureX, textureY); // Box 354
		tailModel[82] = new ModelRendererTurbo(this, 257, 739, textureX, textureY); // Box 355
		tailModel[83] = new ModelRendererTurbo(this, 81, 739, textureX, textureY); // Box 356
		tailModel[84] = new ModelRendererTurbo(this, 121, 739, textureX, textureY); // Box 357
		tailModel[85] = new ModelRendererTurbo(this, 1, 832, textureX, textureY); // Box 358
		tailModel[86] = new ModelRendererTurbo(this, 49, 832, textureX, textureY); // Box 359
		tailModel[87] = new ModelRendererTurbo(this, 81, 832, textureX, textureY); // Box 360
		tailModel[88] = new ModelRendererTurbo(this, 113, 832, textureX, textureY); // Box 361
		tailModel[89] = new ModelRendererTurbo(this, 129, 832, textureX, textureY); // Box 362
		tailModel[90] = new ModelRendererTurbo(this, 145, 832, textureX, textureY); // Box 363
		tailModel[91] = new ModelRendererTurbo(this, 193, 832, textureX, textureY); // Box 365
		tailModel[92] = new ModelRendererTurbo(this, 241, 832, textureX, textureY); // Box 459
		tailModel[93] = new ModelRendererTurbo(this, 1, 915, textureX, textureY); // Box 469
		tailModel[94] = new ModelRendererTurbo(this, 1393, 915, textureX, textureY); // Box 470
		tailModel[95] = new ModelRendererTurbo(this, 33, 915, textureX, textureY); // Box 471
		tailModel[96] = new ModelRendererTurbo(this, 41, 915, textureX, textureY); // Box 472
		tailModel[97] = new ModelRendererTurbo(this, 73, 915, textureX, textureY); // Box 473
		tailModel[98] = new ModelRendererTurbo(this, 81, 915, textureX, textureY); // Box 474
		tailModel[99] = new ModelRendererTurbo(this, 113, 915, textureX, textureY); // Box 475

		tailModel[0].addShapeBox(0F, 0F, 0F, 18, 6, 11, 0F,0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		tailModel[0].setRotationPoint(37F, -71F, -11F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 18, 5, 11, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, -3F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 57
		tailModel[1].setRotationPoint(37F, -65F, -11F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 18, 4, 10, 0F,0F, 0F, -2F, 0F, -1F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		tailModel[2].setRotationPoint(37F, -75F, -10F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 18, 3, 8, 0F,0F, 0F, -4F, 0F, -1F, -5F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 61
		tailModel[3].setRotationPoint(37F, -78F, -8F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 18, 3, 10, 0F,0F, 0F, 0F, 0F, 1.5F, -2F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -4F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 62
		tailModel[4].setRotationPoint(37F, -60F, -10F);

		tailModel[5].addShapeBox(0F, 0F, 0F, 18, 3, 8, 0F,0F, 0F, 0F, 0F, 2F, -2F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -3F, -5F, 0F, -2.5F, 0F, 0F, 0F, 0F); // Box 63
		tailModel[5].setRotationPoint(37F, -57F, -8F);

		tailModel[6].addShapeBox(0F, 0F, 0F, 21, 6, 9, 0F,0F, 0F, 0F, 0F, -0.5F, -3F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		tailModel[6].setRotationPoint(55F, -71F, -9F);

		tailModel[7].addShapeBox(0F, 0F, 0F, 21, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, -0.5F, -3F, 0F, -0.5F, 0F, 0F, 0.5F, 0F); // Box 97
		tailModel[7].setRotationPoint(55F, -65F, -9F);

		tailModel[8].addShapeBox(0F, 0F, 0F, 21, 3, 9, 0F,0F, 0F, -2F, 0F, -1.5F, -4F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -3F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 98
		tailModel[8].setRotationPoint(55F, -74F, -9F);

		tailModel[9].addShapeBox(0F, 0F, 0F, 21, 3, 8, 0F,0F, -0.5F, 0F, 0F, 0.5F, -2F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -2F, 0F, -1.5F, -3.5F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 99
		tailModel[9].setRotationPoint(55F, -62F, -8F);

		tailModel[10].addShapeBox(0F, 0F, 0F, 21, 2, 6, 0F,0F, 0F, 0F, 0F, 1.5F, -1.5F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -3.5F, 0F, -1.5F, 0F, 0F, 0.5F, 0F); // Box 100
		tailModel[10].setRotationPoint(55F, -59F, -6F);

		tailModel[11].addShapeBox(0F, 0F, 0F, 21, 3, 7, 0F,0F, 0F, -4F, 0F, -2.5F, -5F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, -2F, 0F, 1.5F, 0F, 0F, 0F, 0F); // Box 101
		tailModel[11].setRotationPoint(55F, -77F, -7F);

		tailModel[12].addShapeBox(0F, 0F, 0F, 11, 5, 6, 0F,0F, 0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		tailModel[12].setRotationPoint(76F, -70F, -6F);

		tailModel[13].addShapeBox(0F, 0F, 0F, 11, 2, 6, 0F,0F, 0.5F, -1F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, -0.5F, 0F); // Box 112
		tailModel[13].setRotationPoint(76F, -72F, -6F);

		tailModel[14].addShapeBox(0F, 0F, 0F, 11, 2, 5, 0F,0F, 0.5F, -3F, 0F, -1.5F, -3F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, -0.5F, 0F); // Box 113
		tailModel[14].setRotationPoint(76F, -74F, -5F);

		tailModel[15].addShapeBox(0F, 0F, 0F, 11, 2, 6, 0F,0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 114
		tailModel[15].setRotationPoint(76F, -65F, -6F);

		tailModel[16].addShapeBox(0F, 0F, 0F, 11, 2, 6, 0F,0F, 0.5F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, -1.5F, 0F, -1.5F, -2F, 0F, -1.5F, 0F, 0F, -0.5F, 0F); // Box 115
		tailModel[16].setRotationPoint(76F, -62F, -6F);

		tailModel[17].addShapeBox(0F, 0F, 0F, 11, 2, 4, 0F,0F, -0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, -1.5F, -2F, 0F, -1F, 0F, 0F, 0.5F, 0F); // Box 116
		tailModel[17].setRotationPoint(76F, -61F, -4F);

		tailModel[18].addShapeBox(0F, 0F, 0F, 12, 4, 6, 0F,0F, 0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 132
		tailModel[18].setRotationPoint(87F, -69F, -6F);

		tailModel[19].addShapeBox(0F, 0F, 0F, 8, 2, 5, 0F,0F, 0F, 0.5F, 0F, 1F, -3F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1.5F, -3F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 133
		tailModel[19].setRotationPoint(99F, -68F, -5F);

		tailModel[20].addShapeBox(0F, 0F, 0F, 12, 2, 6, 0F,0F, 0F, 0F, 0F, 1F, -0.5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 134
		tailModel[20].setRotationPoint(87F, -65F, -6F);

		tailModel[21].addShapeBox(0F, 0F, 0F, 8, 2, 5, 0F,0F, 0F, 0.5F, 0F, 1.5F, -3F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 135
		tailModel[21].setRotationPoint(99F, -66F, -5F);

		tailModel[22].addShapeBox(0F, 0F, 0F, 12, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 2F, 0.5F, 0F, 2F, 0F, 0F, 0.5F, 0F); // Box 136
		tailModel[22].setRotationPoint(87F, -71F, -5F);

		tailModel[23].addShapeBox(0F, 0F, 0F, 12, 1, 4, 0F,0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
		tailModel[23].setRotationPoint(87F, -72F, -4F);

		tailModel[24].addShapeBox(0F, 0F, 0F, 8, 3, 5, 0F,0F, 0F, -1F, 0F, 0.5F, -3.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1F, -3F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 138
		tailModel[24].setRotationPoint(99F, -71F, -5F);

		tailModel[25].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F,0F, 0.5F, -2F, 0F, 0.5F, -3F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2.5F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 139
		tailModel[25].setRotationPoint(99F, -72F, -4F);

		tailModel[26].addShapeBox(0F, 0F, 0F, 12, 2, 5, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, -0.5F, 0F); // Box 140
		tailModel[26].setRotationPoint(87F, -63F, -5F);

		tailModel[27].addShapeBox(0F, 0F, 0F, 8, 1, 5, 0F,0F, 0F, 0F, 0F, 2F, -3F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 141
		tailModel[27].setRotationPoint(99F, -64F, -5F);

		tailModel[28].addShapeBox(0F, 0F, 0F, 12, 1, 4, 0F,0F, 0.5F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, -2F, 0F, -2F, -2F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 142
		tailModel[28].setRotationPoint(87F, -61F, -4F);

		tailModel[29].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F,0F, 0F, 0F, 0F, 2F, -2F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -3.5F, 0F, -2F, 0F, 0F, 0.5F, 0F); // Box 143
		tailModel[29].setRotationPoint(99F, -63F, -4F);

		tailModel[30].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F,0F, -1F, 1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, -4F, -0.5F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 144
		tailModel[30].setRotationPoint(107F, -70F, -1F);

		tailModel[31].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0.5F, 0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 1F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 145
		tailModel[31].setRotationPoint(107F, -71F, -1F);

		tailModel[32].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, -0.75F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 146
		tailModel[32].setRotationPoint(107F, -72F, -1F);

		tailModel[33].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 1F, 0F, 4F, -0.5F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -3.5F, -0.5F, -0.5F, -3.5F, 0F, 0F, 0F, 0F); // Box 147
		tailModel[33].setRotationPoint(107F, -65F, -1F);

		tailModel[34].addShapeBox(0F, 0F, 0F, 11, 4, 10, 0F,-2.5F, -1.5F, 0F, -3.5F, -2F, -3.5F, 0F, -2F, 0F, 0F, 0F, 0F, -2.5F, -1.5F, 0F, -3.5F, -1.5F, -3.5F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 158
		tailModel[34].setRotationPoint(87F, -72F, -60F);

		tailModel[35].addShapeBox(0F, 0F, 0F, 14, 4, 48, 0F,-5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		tailModel[35].setRotationPoint(73F, -72F, -50F);

		tailModel[36].addShapeBox(0F, 0F, 0F, 12, 4, 48, 0F,-9F, -1.5F, 0F, 0.5F, 0F, 0F, -5F, 0F, 0F, 0F, -1.5F, 0F, -9F, -2F, 0F, 0.5F, 0F, 0F, -5F, 0F, 0F, 0F, -2F, 0F); // Box 160
		tailModel[36].setRotationPoint(66F, -72F, -50F);

		tailModel[37].addShapeBox(0F, 0F, 0F, 9, 4, 10, 0F,-4.5F, -1.5F, 0F, 2.5F, -1.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -4.5F, -1.5F, 0F, 2.5F, -1.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 161
		tailModel[37].setRotationPoint(78F, -72F, -60F);

		tailModel[38].addShapeBox(0F, 0F, 0F, 3, 4, 10, 0F,-4F, -1.5F, -2.5F, 4.5F, -1.5F, 0F, 0.5F, 0F, 0F, 0F, -1.5F, 0F, -4F, -2F, -2.5F, 4.5F, -1.5F, 0F, 0.5F, 0F, 0F, 0F, -2F, 0F); // Box 162
		tailModel[38].setRotationPoint(75F, -72F, -60F);

		tailModel[39].addShapeBox(0F, 0F, 0F, 21, 13, 2, 0F,0F, -10F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		tailModel[39].setRotationPoint(55F, -87F, -2F);

		tailModel[40].addShapeBox(0F, 0F, 0F, 11, 23, 2, 0F,0F, -11.5F, 0F, 0F, 0F, 0F, 0F, 9.5F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		tailModel[40].setRotationPoint(76F, -95F, -2F);

		tailModel[41].addShapeBox(0F, 0F, 0F, 12, 22, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		tailModel[41].setRotationPoint(87F, -94F, -2F);

		tailModel[42].addShapeBox(0F, 0F, 0F, 5, 15, 2, 0F,0F, -14F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		tailModel[42].setRotationPoint(87F, -109F, -2F);

		tailModel[43].addShapeBox(0F, 0F, 0F, 5, 15, 2, 0F,0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		tailModel[43].setRotationPoint(92F, -109F, -2F);

		tailModel[44].addShapeBox(0F, 0F, 0F, 2, 15, 2, 0F,0F, -11F, 0F, 0F, -12F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		tailModel[44].setRotationPoint(97F, -109F, -2F);

		tailModel[45].addShapeBox(0F, 0F, 0F, 18, 4, 2, 0F,0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
		tailModel[45].setRotationPoint(37F, -79F, -2F);

		tailModel[46].addShapeBox(0F, 0F, 0F, 18, 6, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 251
		tailModel[46].setRotationPoint(37F, -71F, 0F);

		tailModel[47].addShapeBox(0F, 0F, 0F, 18, 5, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -3F, 0F, 0F, -1F); // Box 252
		tailModel[47].setRotationPoint(37F, -65F, 0F);

		tailModel[48].addShapeBox(0F, 0F, 0F, 18, 4, 10, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 253
		tailModel[48].setRotationPoint(37F, -75F, 0F);

		tailModel[49].addShapeBox(0F, 0F, 0F, 18, 3, 8, 0F,0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 0F, 0F); // Box 256
		tailModel[49].setRotationPoint(37F, -78F, 0F);

		tailModel[50].addShapeBox(0F, 0F, 0F, 18, 3, 10, 0F,0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -4F, 0F, 0F, -2F); // Box 257
		tailModel[50].setRotationPoint(37F, -60F, 0F);

		tailModel[51].addShapeBox(0F, 0F, 0F, 18, 3, 8, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -3F, -5F, 0F, 0F, -4F); // Box 258
		tailModel[51].setRotationPoint(37F, -57F, 0F);

		tailModel[52].addShapeBox(0F, 0F, 0F, 21, 6, 9, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F); // Box 291
		tailModel[52].setRotationPoint(55F, -71F, 0F);

		tailModel[53].addShapeBox(0F, 0F, 0F, 21, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -3F, 0F, 0.5F, -1F); // Box 292
		tailModel[53].setRotationPoint(55F, -65F, 0F);

		tailModel[54].addShapeBox(0F, 0F, 0F, 21, 3, 9, 0F,0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -3F, 0F, 0F, 0F); // Box 293
		tailModel[54].setRotationPoint(55F, -74F, 0F);

		tailModel[55].addShapeBox(0F, 0F, 0F, 21, 3, 8, 0F,0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -3.5F, 0F, 0F, -2F); // Box 294
		tailModel[55].setRotationPoint(55F, -62F, 0F);

		tailModel[56].addShapeBox(0F, 0F, 0F, 21, 2, 6, 0F,0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, -1.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -2F, -3.5F, 0F, 0F, -3F); // Box 295
		tailModel[56].setRotationPoint(55F, -59F, 0F);

		tailModel[57].addShapeBox(0F, 0F, 0F, 21, 3, 7, 0F,0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, -2F, 0F, 0F, 0F); // Box 296
		tailModel[57].setRotationPoint(55F, -77F, 0F);

		tailModel[58].addShapeBox(0F, 0F, 0F, 11, 5, 6, 0F,0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F); // Box 306
		tailModel[58].setRotationPoint(76F, -70F, 0F);

		tailModel[59].addShapeBox(0F, 0F, 0F, 11, 2, 6, 0F,0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, 0.5F, -1F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, -0.5F, 0F); // Box 307
		tailModel[59].setRotationPoint(76F, -72F, 0F);

		tailModel[60].addShapeBox(0F, 0F, 0F, 11, 2, 5, 0F,0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -3F, 0F, 0.5F, -3F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, -0.5F, 0F); // Box 308
		tailModel[60].setRotationPoint(76F, -74F, 0F);

		tailModel[61].addShapeBox(0F, 0F, 0F, 11, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.5F, 0F); // Box 309
		tailModel[61].setRotationPoint(76F, -65F, 0F);

		tailModel[62].addShapeBox(0F, 0F, 0F, 11, 2, 6, 0F,0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -2F, 0F, -0.5F, -1.5F); // Box 310
		tailModel[62].setRotationPoint(76F, -62F, 0F);

		tailModel[63].addShapeBox(0F, 0F, 0F, 11, 2, 4, 0F,0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0.5F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1.5F, -2F, 0F, 0F, -1.5F); // Box 311
		tailModel[63].setRotationPoint(76F, -61F, 0F);

		tailModel[64].addShapeBox(0F, 0F, 0F, 12, 4, 6, 0F,0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, 0F, 0F); // Box 327
		tailModel[64].setRotationPoint(87F, -69F, 0F);

		tailModel[65].addShapeBox(0F, 0F, 0F, 8, 2, 5, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -3F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -3F, 0F, 0F, 0.5F); // Box 328
		tailModel[65].setRotationPoint(99F, -68F, 0F);

		tailModel[66].addShapeBox(0F, 0F, 0F, 12, 2, 6, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, -1F); // Box 329
		tailModel[66].setRotationPoint(87F, -65F, 0F);

		tailModel[67].addShapeBox(0F, 0F, 0F, 8, 2, 5, 0F,0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, -3F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -3F, 0F, 0F, 0F); // Box 330
		tailModel[67].setRotationPoint(99F, -66F, 0F);

		tailModel[68].addShapeBox(0F, 0F, 0F, 12, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.5F, 0F, 0F, 2F, 0F, 0F, 2F, 0.5F, 0F, 0.5F, 0.5F); // Box 331
		tailModel[68].setRotationPoint(87F, -71F, 0F);

		tailModel[69].addShapeBox(0F, 0F, 0F, 12, 1, 4, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 332
		tailModel[69].setRotationPoint(87F, -72F, 0F);

		tailModel[70].addShapeBox(0F, 0F, 0F, 8, 3, 5, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -3.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -3F, 0F, 0F, 0.5F); // Box 333
		tailModel[70].setRotationPoint(99F, -71F, 0F);

		tailModel[71].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -3F, 0F, 0.5F, -2F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2.5F, 0F, 0F, 0F); // Box 334
		tailModel[71].setRotationPoint(99F, -72F, 0F);

		tailModel[72].addShapeBox(0F, 0F, 0F, 12, 2, 5, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, -0.5F, -1F); // Box 335
		tailModel[72].setRotationPoint(87F, -63F, 0F);

		tailModel[73].addShapeBox(0F, 0F, 0F, 8, 1, 5, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -3F, 0F, 0F, -1F); // Box 336
		tailModel[73].setRotationPoint(99F, -64F, 0F);

		tailModel[74].addShapeBox(0F, 0F, 0F, 12, 1, 4, 0F,0F, 0.5F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -2F, -2F, 0F, -0.5F, -2F); // Box 337
		tailModel[74].setRotationPoint(87F, -61F, 0F);

		tailModel[75].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -2F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -2F, 0F, 0F, -2F, -3.5F, 0F, 0F, -2F); // Box 338
		tailModel[75].setRotationPoint(99F, -63F, 0F);

		tailModel[76].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, -0.5F, 0F, 0F, 1F); // Box 339
		tailModel[76].setRotationPoint(107F, -70F, 0F);

		tailModel[77].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, 0F, 1F); // Box 340
		tailModel[77].setRotationPoint(107F, -71F, 0F);

		tailModel[78].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.75F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F); // Box 341
		tailModel[78].setRotationPoint(107F, -72F, 0F);

		tailModel[79].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, -0.5F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, -3.5F, 0F, -0.5F, -3.5F, -0.5F, 0F, 0F, -0.5F); // Box 342
		tailModel[79].setRotationPoint(107F, -65F, 0F);

		tailModel[80].addShapeBox(0F, 0F, 0F, 11, 4, 10, 0F,0F, 0F, 0F, 0F, -2F, 0F, -3.5F, -2F, -3.5F, -2.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -3.5F, -1.5F, -3.5F, -2.5F, -1.5F, 0F); // Box 353
		tailModel[80].setRotationPoint(87F, -72F, 50F);

		tailModel[81].addShapeBox(0F, 0F, 0F, 14, 4, 48, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F); // Box 354
		tailModel[81].setRotationPoint(73F, -72F, 2F);

		tailModel[82].addShapeBox(0F, 0F, 0F, 12, 4, 48, 0F,0F, -1.5F, 0F, -5F, 0F, 0F, 0.5F, 0F, 0F, -9F, -1.5F, 0F, 0F, -2F, 0F, -5F, 0F, 0F, 0.5F, 0F, 0F, -9F, -2F, 0F); // Box 355
		tailModel[82].setRotationPoint(66F, -72F, 2F);

		tailModel[83].addShapeBox(0F, 0F, 0F, 9, 4, 10, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 2.5F, -1.5F, 0F, -4.5F, -1.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2.5F, -1.5F, 0F, -4.5F, -1.5F, 0F); // Box 356
		tailModel[83].setRotationPoint(78F, -72F, 50F);

		tailModel[84].addShapeBox(0F, 0F, 0F, 3, 4, 10, 0F,0F, -1.5F, 0F, 0.5F, 0F, 0F, 4.5F, -1.5F, 0F, -4F, -1.5F, -2.5F, 0F, -2F, 0F, 0.5F, 0F, 0F, 4.5F, -1.5F, 0F, -4F, -2F, -2.5F); // Box 357
		tailModel[84].setRotationPoint(75F, -72F, 50F);

		tailModel[85].addShapeBox(0F, 0F, 0F, 21, 13, 2, 0F,0F, -8F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 358
		tailModel[85].setRotationPoint(55F, -87F, 0F);

		tailModel[86].addShapeBox(0F, 0F, 0F, 11, 23, 2, 0F,0F, -8F, 0F, 0F, 9.5F, 0F, 0F, 0F, 0F, 0F, -11.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 359
		tailModel[86].setRotationPoint(76F, -95F, 0F);

		tailModel[87].addShapeBox(0F, 0F, 0F, 12, 22, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 360
		tailModel[87].setRotationPoint(87F, -94F, 0F);

		tailModel[88].addShapeBox(0F, 0F, 0F, 5, 15, 2, 0F,0F, -4.5F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 361
		tailModel[88].setRotationPoint(87F, -109F, 0F);

		tailModel[89].addShapeBox(0F, 0F, 0F, 5, 15, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 362
		tailModel[89].setRotationPoint(92F, -109F, 0F);

		tailModel[90].addShapeBox(0F, 0F, 0F, 2, 15, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -12F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 363
		tailModel[90].setRotationPoint(97F, -109F, 0F);

		tailModel[91].addShapeBox(0F, 0F, 0F, 18, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 365
		tailModel[91].setRotationPoint(37F, -79F, 0F);

		tailModel[92].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 459
		tailModel[92].setRotationPoint(92.5F, -111F, -0.5F);

		tailModel[93].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 469
		tailModel[93].setRotationPoint(53F, -58F, -1F);

		tailModel[94].addShapeBox(0F, 0F, -0.5F, 30, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 470
		tailModel[94].setRotationPoint(55F, -57F, 0F);
		tailModel[94].rotateAngleZ = 0.05235988F;

		tailModel[95].addShapeBox(30F, 0F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 471
		tailModel[95].setRotationPoint(55F, -57F, 0F);
		tailModel[95].rotateAngleZ = 0.05235988F;

		tailModel[96].addShapeBox(31F, -1F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 472
		tailModel[96].setRotationPoint(55F, -57F, 0F);
		tailModel[96].rotateAngleZ = 0.05235988F;

		tailModel[97].addShapeBox(32F, 0F, -0.5F, 1, 1, 1, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 473
		tailModel[97].setRotationPoint(55F, -57F, 0F);
		tailModel[97].rotateAngleZ = 0.05235988F;

		tailModel[98].addShapeBox(32F, 0F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 474
		tailModel[98].setRotationPoint(55F, -57F, 0F);
		tailModel[98].rotateAngleZ = 0.05235988F;

		tailModel[99].addShapeBox(31F, 1F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 475
		tailModel[99].setRotationPoint(55F, -57F, 0F);
		tailModel[99].rotateAngleZ = 0.05235988F;
	}

	private void initbayModel_1()
	{
		bayModel[0] = new ModelRendererTurbo(this, 1, 473, textureX, textureY); // Box 504
		bayModel[1] = new ModelRendererTurbo(this, 57, 473, textureX, textureY); // Box 505
		bayModel[2] = new ModelRendererTurbo(this, 6, 463, textureX, textureY); // Box 515
		bayModel[3] = new ModelRendererTurbo(this, 0, 463, textureX, textureY); // Box 516
		bayModel[4] = new ModelRendererTurbo(this, 6, 463, textureX, textureY); // Box 517
		bayModel[5] = new ModelRendererTurbo(this, 6, 463, textureX, textureY); // Box 518
		bayModel[6] = new ModelRendererTurbo(this, 6, 463, textureX, textureY); // Box 519
		bayModel[7] = new ModelRendererTurbo(this, 6, 463, textureX, textureY); // Box 520
		bayModel[8] = new ModelRendererTurbo(this, 6, 463, textureX, textureY); // Box 521
		bayModel[9] = new ModelRendererTurbo(this, 6, 463, textureX, textureY); // Box 522
		bayModel[10] = new ModelRendererTurbo(this, 6, 463, textureX, textureY); // Box 523
		bayModel[11] = new ModelRendererTurbo(this, 6, 463, textureX, textureY); // Box 524
		bayModel[12] = new ModelRendererTurbo(this, 6, 463, textureX, textureY); // Box 525
		bayModel[13] = new ModelRendererTurbo(this, 6, 463, textureX, textureY); // Box 526
		bayModel[14] = new ModelRendererTurbo(this, 6, 463, textureX, textureY); // Box 527
		bayModel[15] = new ModelRendererTurbo(this, 6, 463, textureX, textureY); // Box 528
		bayModel[16] = new ModelRendererTurbo(this, 6, 463, textureX, textureY); // Box 529
		bayModel[17] = new ModelRendererTurbo(this, 6, 463, textureX, textureY); // Box 530
		bayModel[18] = new ModelRendererTurbo(this, 6, 463, textureX, textureY); // Box 531
		bayModel[19] = new ModelRendererTurbo(this, 6, 463, textureX, textureY); // Box 532
		bayModel[20] = new ModelRendererTurbo(this, 6, 463, textureX, textureY); // Box 533
		bayModel[21] = new ModelRendererTurbo(this, 6, 463, textureX, textureY); // Box 534
		bayModel[22] = new ModelRendererTurbo(this, 6, 463, textureX, textureY); // Box 535
		bayModel[23] = new ModelRendererTurbo(this, 6, 463, textureX, textureY); // Box 536

		bayModel[0].addShapeBox(0F, 0F, 0F, 26, 7, 1, 0F,-5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 504
		bayModel[0].setRotationPoint(-42F, -49F, -1F);

		bayModel[1].addShapeBox(0F, 0F, 0F, 26, 7, 1, 0F,-3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F); // Box 505
		bayModel[1].setRotationPoint(-42F, -49F, 0F);

		bayModel[2].addShapeBox(0F, 0F, 0F, 15, 3, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 515
		bayModel[2].setRotationPoint(-38F, -40.5F, -2.5F);

		bayModel[3].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 516
		bayModel[3].setRotationPoint(-43.5F, -39.5F, -0.5F);

		bayModel[4].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 517
		bayModel[4].setRotationPoint(-17F, -42F, -0.5F);

		bayModel[5].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F); // Box 518
		bayModel[5].setRotationPoint(-14F, -42F, -0.5F);

		bayModel[6].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -2F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -2F, -0.4F, 0F); // Box 519
		bayModel[6].setRotationPoint(-17F, -39.5F, 0F);

		bayModel[7].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 520
		bayModel[7].setRotationPoint(-14F, -39.5F, 1F);

		bayModel[8].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.3F, -1.9F, 0F, -0.3F, -1.9F, 0F, -0.1F, -1.5F, 0F, -0.1F, -1.5F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F); // Box 521
		bayModel[8].setRotationPoint(-13F, -41F, 0F);

		bayModel[9].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -1.5F, 0F, -0.1F, -1.5F, 0F, -0.3F, -1.9F, 0F, -0.3F, -1.9F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F); // Box 522
		bayModel[9].setRotationPoint(-13F, -39F, -2F);

		bayModel[10].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.1F, -1.5F, 0F, -0.1F, -1.5F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.3F, -1.9F, 0F, -0.3F, -1.9F); // Box 523
		bayModel[10].setRotationPoint(-13F, -39F, 0F);

		bayModel[11].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 524
		bayModel[11].setRotationPoint(-14F, -38F, -0.5F);

		bayModel[12].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -2F, 0F, -0.4F); // Box 525
		bayModel[12].setRotationPoint(-17F, -39F, -0.5F);

		bayModel[13].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-2F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -2F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 526
		bayModel[13].setRotationPoint(-17F, -39.5F, -3F);

		bayModel[14].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F); // Box 527
		bayModel[14].setRotationPoint(-14F, -39.5F, -3F);

		bayModel[15].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.3F, -1.9F, 0F, -0.3F, -1.9F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -1.5F, 0F, -0.1F, -1.5F); // Box 528
		bayModel[15].setRotationPoint(-13F, -41F, -2F);

		bayModel[16].addShapeBox(0F, 0F, 0F, 15, 2, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 529
		bayModel[16].setRotationPoint(-38F, -41.5F, -2.5F);

		bayModel[17].addShapeBox(0F, 0F, 0F, 15, 2, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 530
		bayModel[17].setRotationPoint(-38F, -38.5F, -2.5F);

		bayModel[18].addShapeBox(0F, 0F, 0F, 5, 3, 5, 0F,0F, -1F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, -1.5F); // Box 531
		bayModel[18].setRotationPoint(-43F, -40.5F, -2.5F);

		bayModel[19].addShapeBox(0F, 0F, 0F, 5, 2, 5, 0F,0F, -1.5F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1.5F, -2F, 0F, 0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F); // Box 532
		bayModel[19].setRotationPoint(-43F, -41.5F, -2.5F);

		bayModel[20].addShapeBox(0F, 0F, 0F, 5, 2, 5, 0F,0F, 0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, -1.5F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1.5F, -2F); // Box 533
		bayModel[20].setRotationPoint(-43F, -38.5F, -2.5F);

		bayModel[21].addShapeBox(0F, 0F, 0F, 10, 3, 5, 0F,0F, -0.5F, 0F, 0F, -1.25F, -2F, 0F, -1.25F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.25F, -2F, 0F, -1.25F, -2F, 0F, -0.5F, 0F); // Box 534
		bayModel[21].setRotationPoint(-23F, -40.5F, -2.5F);

		bayModel[22].addShapeBox(0F, 0F, 0F, 10, 2, 5, 0F,0F, 0F, -1F, 0F, -2F, -2.25F, 0F, -2F, -2.25F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, 0.25F, -2F, 0F, 0.25F, -2F, 0F, -0.5F, 0F); // Box 535
		bayModel[22].setRotationPoint(-23F, -41.5F, -2.5F);

		bayModel[23].addShapeBox(0F, 0F, 0F, 10, 2, 5, 0F,0F, -0.5F, 0F, 0F, 0.25F, -2F, 0F, 0.25F, -2F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, -2F, -2.25F, 0F, -2F, -2.25F, 0F, 0F, -1F); // Box 536
		bayModel[23].setRotationPoint(-23F, -38.5F, -2.5F);
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 33, 556, textureX, textureY); // Box 117
		leftWingModel[1] = new ModelRendererTurbo(this, 81, 556, textureX, textureY); // Box 118
		leftWingModel[2] = new ModelRendererTurbo(this, 145, 556, textureX, textureY); // Box 119
		leftWingModel[3] = new ModelRendererTurbo(this, 209, 556, textureX, textureY); // Box 120
		leftWingModel[4] = new ModelRendererTurbo(this, 297, 556, textureX, textureY); // Box 121
		leftWingModel[5] = new ModelRendererTurbo(this, 361, 556, textureX, textureY); // Box 122
		leftWingModel[6] = new ModelRendererTurbo(this, 425, 556, textureX, textureY); // Box 123
		leftWingModel[7] = new ModelRendererTurbo(this, 489, 556, textureX, textureY); // Box 124
		leftWingModel[8] = new ModelRendererTurbo(this, 553, 556, textureX, textureY); // Box 125
		leftWingModel[9] = new ModelRendererTurbo(this, 465, 556, textureX, textureY); // Box 126
		leftWingModel[10] = new ModelRendererTurbo(this, 593, 556, textureX, textureY); // Box 127
		leftWingModel[11] = new ModelRendererTurbo(this, 665, 556, textureX, textureY); // Box 128
		leftWingModel[12] = new ModelRendererTurbo(this, 737, 556, textureX, textureY); // Box 129
		leftWingModel[13] = new ModelRendererTurbo(this, 913, 556, textureX, textureY); // Box 131
		leftWingModel[14] = new ModelRendererTurbo(this, 1, 482, textureX, textureY); // Box 174
		leftWingModel[15] = new ModelRendererTurbo(this, 145, 482, textureX, textureY); // Box 175
		leftWingModel[16] = new ModelRendererTurbo(this, 297, 482, textureX, textureY); // Box 176
		leftWingModel[17] = new ModelRendererTurbo(this, 577, 482, textureX, textureY); // Box 178
		leftWingModel[18] = new ModelRendererTurbo(this, 89, 482, textureX, textureY); // Box 179
		leftWingModel[19] = new ModelRendererTurbo(this, 241, 482, textureX, textureY); // Box 180
		leftWingModel[20] = new ModelRendererTurbo(this, 385, 482, textureX, textureY); // Box 181
		leftWingModel[21] = new ModelRendererTurbo(this, 521, 482, textureX, textureY); // Box 182
		leftWingModel[22] = new ModelRendererTurbo(this, 1, 482, textureX, textureY); // Box 183
		leftWingModel[23] = new ModelRendererTurbo(this, 153, 482, textureX, textureY); // Box 184
		leftWingModel[24] = new ModelRendererTurbo(this, 297, 482, textureX, textureY); // Box 185
		leftWingModel[25] = new ModelRendererTurbo(this, 449, 482, textureX, textureY); // Box 186
		leftWingModel[26] = new ModelRendererTurbo(this, 641, 482, textureX, textureY); // Box 188
		leftWingModel[27] = new ModelRendererTurbo(this, 89, 482, textureX, textureY); // Box 189
		leftWingModel[28] = new ModelRendererTurbo(this, 241, 482, textureX, textureY); // Box 190
		leftWingModel[29] = new ModelRendererTurbo(this, 585, 482, textureX, textureY); // Box 467
		leftWingModel[30] = new ModelRendererTurbo(this, 689, 482, textureX, textureY); // Box 468
		leftWingModel[31] = new ModelRendererTurbo(this, 409, 556, textureX, textureY); // Box 476
		leftWingModel[32] = new ModelRendererTurbo(this, 193, 556, textureX, textureY); // Box 477
		leftWingModel[33] = new ModelRendererTurbo(this, 873, 556, textureX, textureY); // Box 478
		leftWingModel[34] = new ModelRendererTurbo(this, 281, 556, textureX, textureY); // Box 479
		leftWingModel[35] = new ModelRendererTurbo(this, 737, 482, textureX, textureY); // Box 0
		leftWingModel[36] = new ModelRendererTurbo(this, 793, 482, textureX, textureY); // Box 1
		leftWingModel[37] = new ModelRendererTurbo(this, 6, 463, textureX, textureY); // Core_001
		leftWingModel[38] = new ModelRendererTurbo(this, 0, 463, textureX, textureY); // Core_001
		leftWingModel[39] = new ModelRendererTurbo(this, 6, 463, textureX, textureY); // Core_001
		leftWingModel[40] = new ModelRendererTurbo(this, 6, 463, textureX, textureY); // Core_001
		leftWingModel[41] = new ModelRendererTurbo(this, 6, 463, textureX, textureY); // Core_001
		leftWingModel[42] = new ModelRendererTurbo(this, 6, 463, textureX, textureY); // Core_001
		leftWingModel[43] = new ModelRendererTurbo(this, 6, 463, textureX, textureY); // Core_001
		leftWingModel[44] = new ModelRendererTurbo(this, 6, 463, textureX, textureY); // Core_001
		leftWingModel[45] = new ModelRendererTurbo(this, 6, 463, textureX, textureY); // Core_001
		leftWingModel[46] = new ModelRendererTurbo(this, 6, 463, textureX, textureY); // Core_001
		leftWingModel[47] = new ModelRendererTurbo(this, 6, 463, textureX, textureY); // Core_001
		leftWingModel[48] = new ModelRendererTurbo(this, 6, 463, textureX, textureY); // Core_001
		leftWingModel[49] = new ModelRendererTurbo(this, 6, 463, textureX, textureY); // Core_001
		leftWingModel[50] = new ModelRendererTurbo(this, 6, 463, textureX, textureY); // Core_001
		leftWingModel[51] = new ModelRendererTurbo(this, 6, 463, textureX, textureY); // Box 506
		leftWingModel[52] = new ModelRendererTurbo(this, 6, 463, textureX, textureY); // Box 507
		leftWingModel[53] = new ModelRendererTurbo(this, 6, 463, textureX, textureY); // Box 508
		leftWingModel[54] = new ModelRendererTurbo(this, 6, 463, textureX, textureY); // Box 509
		leftWingModel[55] = new ModelRendererTurbo(this, 6, 463, textureX, textureY); // Box 510
		leftWingModel[56] = new ModelRendererTurbo(this, 6, 463, textureX, textureY); // Box 512
		leftWingModel[57] = new ModelRendererTurbo(this, 6, 463, textureX, textureY); // Box 513
		leftWingModel[58] = new ModelRendererTurbo(this, 6, 463, textureX, textureY); // Box 514
		leftWingModel[59] = new ModelRendererTurbo(this, 297, 556, textureX, textureY); // Box 872

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 15, 9, 7, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		leftWingModel[0].setRotationPoint(-47F, -57F, -21F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 29, 8, 7, 0F,0F, -1.5F, 0F, -5F, -5.5F, 0F, 2.5F, -1.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 2.5F, 0F, 2.5F, 0F, 0F, 0F); // Box 118
		leftWingModel[1].setRotationPoint(-32F, -57F, -21F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 15, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F); // Box 119
		leftWingModel[2].setRotationPoint(-47F, -48F, -21F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 24, 3, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, 0F, 0.5F, 0F); // Box 120
		leftWingModel[3].setRotationPoint(-32F, -49F, -21F);

		leftWingModel[4].addShapeBox(0F, 0F, 0F, 12, 2, 16, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 4F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.25F, 0F, 4F, -2.5F, 0F, -1F, 0.5F, 0F); // Box 121
		leftWingModel[4].setRotationPoint(-8F, -49F, -21F);

		leftWingModel[5].addShapeBox(0F, 0F, 0F, 12, 6, 16, 0F,0F, -3.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, -5F, -7.5F, 0.5F, -6.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		leftWingModel[5].setRotationPoint(-8F, -55F, -21F);

		leftWingModel[6].addShapeBox(0F, 0F, 0F, 11, 6, 17, 0F,0F, -5.5F, 0F, 0F, -4F, -9.5F, 0F, -1F, -4F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, -1.5F, -9.5F, 0F, -1F, 0F, -4F, 0F, -1F); // Box 123
		leftWingModel[6].setRotationPoint(4F, -55F, -21F);

		leftWingModel[7].addShapeBox(0F, 0F, 0F, 15, 11, 15, 0F,0F, -4F, 0F, 0F, -1.5F, 0F, 0F, 0F, -8F, 0F, -3.5F, -7F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, -2F, 0F); // Box 124
		leftWingModel[7].setRotationPoint(-62F, -57F, -21F);

		leftWingModel[8].addShapeBox(0F, 0F, 0F, 2, 5, 15, 0F,0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, -7F, 2F, -1F, -5.5F, 0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1.5F, 0F); // Box 125
		leftWingModel[8].setRotationPoint(-64F, -53F, -21F);

		leftWingModel[9].addShapeBox(0F, 0F, 0F, 10, 5, 7, 0F,0F, -4F, 0.5F, 0F, -2.5F, -7F, 0F, -2.5F, 0.5F, 0F, -1F, -4F, 0F, -0.5F, 0.5F, 0F, -2F, -7F, 0F, -2F, 0.5F, 0F, 0F, 0F); // Box 126
		leftWingModel[9].setRotationPoint(15F, -55F, -11F);

		leftWingModel[10].addShapeBox(0F, 0F, 0F, 15, 10, 17, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		leftWingModel[10].setRotationPoint(-47F, -56F, -38F);

		leftWingModel[11].addShapeBox(0F, 0F, 0F, 15, 10, 17, 0F,-1.5F, -3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3F, 0F, -1.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 128
		leftWingModel[11].setRotationPoint(-62F, -56F, -38F);

		leftWingModel[12].addShapeBox(0F, 0F, 0F, 24, 10, 17, 0F,0F, -0.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 129
		leftWingModel[12].setRotationPoint(-32F, -56F, -38F);

		leftWingModel[13].addShapeBox(0F, 0F, 0F, 3, 5, 17, 0F,-2.5F, -1.5F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.5F, 0F, -2.5F, -2F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F); // Box 131
		leftWingModel[13].setRotationPoint(-65F, -53F, -38F);

		leftWingModel[14].addShapeBox(0F, 0F, 0F, 15, 18, 55, 0F,-2F, 0F, 0F, -2F, 0F, 0F, 0F, -8.5F, 0F, 0F, -8.5F, 0F, -2F, -11.5F, 0F, -2F, -11.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		leftWingModel[14].setRotationPoint(-47F, -64F, -93F);

		leftWingModel[15].addShapeBox(0F, 0F, 0F, 19, 18, 55, 0F,-2F, 0F, 0F, -2F, -2.5F, 0F, 9F, -12.5F, 0F, -4F, -8.5F, 0F, -2F, -11.5F, 0F, -2F, -12F, 0F, 9F, -1F, 0F, -4F, 0F, 0F); // Box 175
		leftWingModel[15].setRotationPoint(-36F, -64F, -93F);

		leftWingModel[16].addShapeBox(0F, 0F, 0F, 13, 18, 55, 0F,-5F, -2F, 0F, 2F, 0F, 0F, 0F, -8.5F, 0F, 0.5F, -11F, 0F, -5F, -12.5F, 0F, 2F, -11.5F, 0F, 0F, 0F, 0F, 0.5F, -2F, 0F); // Box 176
		leftWingModel[16].setRotationPoint(-60F, -64F, -93F);

		leftWingModel[17].addShapeBox(0F, 0F, 0F, 3, 14, 55, 0F,-6F, -1F, 0F, 5F, 0F, 0F, -0.5F, -9F, 0F, -0.5F, -10.5F, 0F, -6F, -12F, 0F, 5F, -10.5F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F); // Box 178
		leftWingModel[17].setRotationPoint(-63F, -62F, -93F);

		leftWingModel[18].addShapeBox(0F, 0F, 0F, 11, 11, 35, 0F,-1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -1.5F, -6.5F, 0F, -1.5F, -6.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 179
		leftWingModel[18].setRotationPoint(-45F, -69F, -128F);

		leftWingModel[19].addShapeBox(0F, 0F, 0F, 10, 11, 35, 0F,-4.5F, -1F, 0F, 1.5F, 0F, 0F, 0F, -5F, 0F, 0F, -7F, 0F, -4.5F, -7F, 0F, 1.5F, -6.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F); // Box 180
		leftWingModel[19].setRotationPoint(-55F, -69F, -128F);

		leftWingModel[20].addShapeBox(0F, 0F, 0F, 11, 11, 35, 0F,-0.5F, 0F, 0F, -3.5F, -1F, 0F, 6F, -7.5F, 0F, -2F, -5F, 0F, -0.5F, -6.5F, 0F, -3.5F, -7F, 0F, 6F, 0F, 0F, -2F, 0.5F, 0F); // Box 181
		leftWingModel[20].setRotationPoint(-36F, -69F, -128F);

		leftWingModel[21].addShapeBox(0F, 0F, 0F, 13, 10, 35, 0F,0.5F, 0F, 0F, -1.5F, -2F, 0F, 7F, -8.5F, 0F, -9F, -6.5F, 0F, 0.5F, -7F, 0F, -1.5F, -7.5F, 0F, 7F, -1F, 0F, -9F, 0F, 0F); // Box 182
		leftWingModel[21].setRotationPoint(-28F, -68F, -128F);

		leftWingModel[22].addShapeBox(0F, 0F, 0F, 13, 3, 10, 0F,0F, 1F, 0.5F, -4F, -1F, -5F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, 0F, -2.5F, 0.5F, -4F, -1.5F, -5F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F); // Box 183
		leftWingModel[22].setRotationPoint(-29F, -68F, -138F);

		leftWingModel[23].addShapeBox(0F, 0F, 0F, 6, 3, 12, 0F,2F, 0.5F, 0F, 0F, 0F, -1.5F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 2F, -1.5F, 0F, 0F, -1.5F, -1.5F, 0.5F, 1F, 0F, 0.5F, 1.5F, 0F); // Box 184
		leftWingModel[23].setRotationPoint(-35F, -69F, -140F);

		leftWingModel[24].addShapeBox(0F, 0F, 0F, 9, 4, 12, 0F,-3F, 0.5F, -1F, -2F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3F, -2.5F, -1F, -2F, -2.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F); // Box 185
		leftWingModel[24].setRotationPoint(-44F, -69F, -140F);

		leftWingModel[25].addShapeBox(0F, 0F, 0F, 9, 4, 12, 0F,-4.5F, 0F, -4.5F, 1F, 0.5F, -1F, -1.5F, 0F, 0F, -0.5F, -1F, 0F, -4.5F, -2F, -4.5F, 1F, -2.5F, -1F, -1.5F, 0.5F, 0F, -0.5F, 0.5F, 0F); // Box 186
		leftWingModel[25].setRotationPoint(-51F, -69F, -140F);

		leftWingModel[26].addShapeBox(0F, 0F, 0F, 5, 11, 35, 0F,-4.5F, -2F, 0F, 1.5F, -1F, 0F, -3F, -7F, 0F, 0F, -8F, 0F, -4.5F, -8F, 0F, 1.5F, -6.5F, 0F, -3F, -0.5F, 0F, 0F, -2F, 0F); // Box 188
		leftWingModel[26].setRotationPoint(-57F, -69F, -128F);

		leftWingModel[27].addShapeBox(0F, 0F, 0F, 2, 4, 7, 0F,-3.5F, -0.5F, 0.5F, 3.5F, 0F, 0.5F, -0.5F, -1F, 0F, 0.5F, -2F, 0F, -3.5F, -2.5F, 0.5F, 3.5F, -2F, 0.5F, -0.5F, 0.5F, 0F, 0.5F, -1F, 0F); // Box 189
		leftWingModel[27].setRotationPoint(-52F, -69F, -135F);

		leftWingModel[28].addShapeBox(0F, 0F, 0F, 7, 2, 3, 0F,-3.5F, -0.5F, -1F, 0F, 0.5F, 0F, -5.5F, 0F, 0.5F, 0.5F, -0.5F, 0.5F, -3.5F, -1F, -1F, 0F, -0.5F, 0F, -5.5F, 0F, 0.5F, 0.5F, -0.5F, 0.5F); // Box 190
		leftWingModel[28].setRotationPoint(-48F, -69F, -139F);

		leftWingModel[29].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 467
		leftWingModel[29].setRotationPoint(-68F, -67F, -128.5F);

		leftWingModel[30].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 468
		leftWingModel[30].setRotationPoint(-68F, -67F, -128.5F);

		leftWingModel[31].addShapeBox(0F, 0F, 0F, 15, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 476
		leftWingModel[31].setRotationPoint(-47F, -56F, -38F);

		leftWingModel[32].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 477
		leftWingModel[32].setRotationPoint(-55F, -56F, -38F);

		leftWingModel[33].addShapeBox(0F, 0F, 0F, 24, 2, 1, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 478
		leftWingModel[33].setRotationPoint(-32F, -56F, -38F);

		leftWingModel[34].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 479
		leftWingModel[34].setRotationPoint(-8F, -52F, -38F);

		leftWingModel[35].addShapeBox(0F, 0F, 0F, 26, 7, 1, 0F,-5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		leftWingModel[35].setRotationPoint(-48F, -53F, -51F);

		leftWingModel[36].addShapeBox(0F, 0F, 0F, 26, 7, 1, 0F,-3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F); // Box 1
		leftWingModel[36].setRotationPoint(-48F, -53F, -50F);

		leftWingModel[37].addShapeBox(0F, 0F, 0F, 15, 3, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Core_001
		leftWingModel[37].setRotationPoint(-43F, -44.5F, -52.5F);

		leftWingModel[38].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Core_001
		leftWingModel[38].setRotationPoint(-48.5F, -43.5F, -50.5F);

		leftWingModel[39].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Core_001
		leftWingModel[39].setRotationPoint(-22F, -46F, -50.5F);

		leftWingModel[40].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F); // Core_001
		leftWingModel[40].setRotationPoint(-19F, -46F, -50.5F);

		leftWingModel[41].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -2F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -2F, -0.4F, 0F); // Core_001
		leftWingModel[41].setRotationPoint(-22F, -43.5F, -50F);

		leftWingModel[42].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Core_001
		leftWingModel[42].setRotationPoint(-19F, -43.5F, -49F);

		leftWingModel[43].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.3F, -1.9F, 0F, -0.3F, -1.9F, 0F, -0.1F, -1.5F, 0F, -0.1F, -1.5F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F); // Core_001
		leftWingModel[43].setRotationPoint(-18F, -45F, -50F);

		leftWingModel[44].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -1.5F, 0F, -0.1F, -1.5F, 0F, -0.3F, -1.9F, 0F, -0.3F, -1.9F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F); // Core_001
		leftWingModel[44].setRotationPoint(-18F, -43F, -52F);

		leftWingModel[45].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.1F, -1.5F, 0F, -0.1F, -1.5F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.3F, -1.9F, 0F, -0.3F, -1.9F); // Core_001
		leftWingModel[45].setRotationPoint(-18F, -43F, -50F);

		leftWingModel[46].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Core_001
		leftWingModel[46].setRotationPoint(-19F, -42F, -50.5F);

		leftWingModel[47].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -2F, 0F, -0.4F); // Core_001
		leftWingModel[47].setRotationPoint(-22F, -43F, -50.5F);

		leftWingModel[48].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-2F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -2F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Core_001
		leftWingModel[48].setRotationPoint(-22F, -43.5F, -53F);

		leftWingModel[49].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F); // Core_001
		leftWingModel[49].setRotationPoint(-19F, -43.5F, -53F);

		leftWingModel[50].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.3F, -1.9F, 0F, -0.3F, -1.9F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -1.5F, 0F, -0.1F, -1.5F); // Core_001
		leftWingModel[50].setRotationPoint(-18F, -45F, -52F);

		leftWingModel[51].addShapeBox(0F, 0F, 0F, 15, 2, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 506
		leftWingModel[51].setRotationPoint(-43F, -45.5F, -52.5F);

		leftWingModel[52].addShapeBox(0F, 0F, 0F, 15, 2, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 507
		leftWingModel[52].setRotationPoint(-43F, -42.5F, -52.5F);

		leftWingModel[53].addShapeBox(0F, 0F, 0F, 5, 3, 5, 0F,0F, -1F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, -1.5F); // Box 508
		leftWingModel[53].setRotationPoint(-48F, -44.5F, -52.5F);

		leftWingModel[54].addShapeBox(0F, 0F, 0F, 5, 2, 5, 0F,0F, -1.5F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1.5F, -2F, 0F, 0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F); // Box 509
		leftWingModel[54].setRotationPoint(-48F, -45.5F, -52.5F);

		leftWingModel[55].addShapeBox(0F, 0F, 0F, 5, 2, 5, 0F,0F, 0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, -1.5F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1.5F, -2F); // Box 510
		leftWingModel[55].setRotationPoint(-48F, -42.5F, -52.5F);

		leftWingModel[56].addShapeBox(0F, 0F, 0F, 10, 3, 5, 0F,0F, -0.5F, 0F, 0F, -1.25F, -2F, 0F, -1.25F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.25F, -2F, 0F, -1.25F, -2F, 0F, -0.5F, 0F); // Box 512
		leftWingModel[56].setRotationPoint(-28F, -44.5F, -52.5F);

		leftWingModel[57].addShapeBox(0F, 0F, 0F, 10, 2, 5, 0F,0F, 0F, -1F, 0F, -2F, -2.25F, 0F, -2F, -2.25F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, 0.25F, -2F, 0F, 0.25F, -2F, 0F, -0.5F, 0F); // Box 513
		leftWingModel[57].setRotationPoint(-28F, -45.5F, -52.5F);

		leftWingModel[58].addShapeBox(0F, 0F, 0F, 10, 2, 5, 0F,0F, -0.5F, 0F, 0F, 0.25F, -2F, 0F, 0.25F, -2F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, -2F, -2.25F, 0F, -2F, -2.25F, 0F, 0F, -1F); // Box 514
		leftWingModel[58].setRotationPoint(-28F, -42.5F, -52.5F);

		leftWingModel[59].addShapeBox(0F, 0F, 0F, 12, 2, 16, 0F,0F, 0F, 0F, 4F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1F, 0.5F, 0F, 4F, -2.5F, 0F, 0F, -2.25F, 0F, 0F, -0.5F, 0F); // Box 872
		leftWingModel[59].setRotationPoint(-8F, -49F, 5F);
	}

	private void initrightWingModel_1()
	{
		rightWingModel[0] = new ModelRendererTurbo(this, 1, 658, textureX, textureY); // Box 312
		rightWingModel[1] = new ModelRendererTurbo(this, 49, 658, textureX, textureY); // Box 313
		rightWingModel[2] = new ModelRendererTurbo(this, 113, 658, textureX, textureY); // Box 314
		rightWingModel[3] = new ModelRendererTurbo(this, 177, 658, textureX, textureY); // Box 315
		rightWingModel[4] = new ModelRendererTurbo(this, 329, 658, textureX, textureY); // Box 317
		rightWingModel[5] = new ModelRendererTurbo(this, 393, 658, textureX, textureY); // Box 318
		rightWingModel[6] = new ModelRendererTurbo(this, 457, 658, textureX, textureY); // Box 319
		rightWingModel[7] = new ModelRendererTurbo(this, 521, 658, textureX, textureY); // Box 320
		rightWingModel[8] = new ModelRendererTurbo(this, 433, 658, textureX, textureY); // Box 321
		rightWingModel[9] = new ModelRendererTurbo(this, 561, 658, textureX, textureY); // Box 322
		rightWingModel[10] = new ModelRendererTurbo(this, 633, 658, textureX, textureY); // Box 323
		rightWingModel[11] = new ModelRendererTurbo(this, 705, 658, textureX, textureY); // Box 324
		rightWingModel[12] = new ModelRendererTurbo(this, 793, 658, textureX, textureY); // Box 325
		rightWingModel[13] = new ModelRendererTurbo(this, 857, 658, textureX, textureY); // Box 326
		rightWingModel[14] = new ModelRendererTurbo(this, 1, 584, textureX, textureY); // Box 369
		rightWingModel[15] = new ModelRendererTurbo(this, 145, 584, textureX, textureY); // Box 370
		rightWingModel[16] = new ModelRendererTurbo(this, 297, 584, textureX, textureY); // Box 371
		rightWingModel[17] = new ModelRendererTurbo(this, 577, 584, textureX, textureY); // Box 373
		rightWingModel[18] = new ModelRendererTurbo(this, 89, 584, textureX, textureY); // Box 374
		rightWingModel[19] = new ModelRendererTurbo(this, 241, 584, textureX, textureY); // Box 375
		rightWingModel[20] = new ModelRendererTurbo(this, 385, 584, textureX, textureY); // Box 376
		rightWingModel[21] = new ModelRendererTurbo(this, 521, 584, textureX, textureY); // Box 377
		rightWingModel[22] = new ModelRendererTurbo(this, 1, 584, textureX, textureY); // Box 378
		rightWingModel[23] = new ModelRendererTurbo(this, 153, 584, textureX, textureY); // Box 379
		rightWingModel[24] = new ModelRendererTurbo(this, 297, 584, textureX, textureY); // Box 380
		rightWingModel[25] = new ModelRendererTurbo(this, 449, 584, textureX, textureY); // Box 381
		rightWingModel[26] = new ModelRendererTurbo(this, 641, 584, textureX, textureY); // Box 382
		rightWingModel[27] = new ModelRendererTurbo(this, 89, 584, textureX, textureY); // Box 383
		rightWingModel[28] = new ModelRendererTurbo(this, 241, 584, textureX, textureY); // Box 384
		rightWingModel[29] = new ModelRendererTurbo(this, 377, 658, textureX, textureY); // Box 480
		rightWingModel[30] = new ModelRendererTurbo(this, 161, 658, textureX, textureY); // Box 481
		rightWingModel[31] = new ModelRendererTurbo(this, 881, 658, textureX, textureY); // Box 482
		rightWingModel[32] = new ModelRendererTurbo(this, 249, 658, textureX, textureY); // Box 483
		rightWingModel[33] = new ModelRendererTurbo(this, 689, 584, textureX, textureY); // Box 537
		rightWingModel[34] = new ModelRendererTurbo(this, 745, 584, textureX, textureY); // Box 538
		rightWingModel[35] = new ModelRendererTurbo(this, 6, 463, textureX, textureY); // Box 539
		rightWingModel[36] = new ModelRendererTurbo(this, 0, 463, textureX, textureY); // Box 540
		rightWingModel[37] = new ModelRendererTurbo(this, 6, 463, textureX, textureY); // Box 541
		rightWingModel[38] = new ModelRendererTurbo(this, 6, 463, textureX, textureY); // Box 542
		rightWingModel[39] = new ModelRendererTurbo(this, 6, 463, textureX, textureY); // Box 543
		rightWingModel[40] = new ModelRendererTurbo(this, 6, 463, textureX, textureY); // Box 544
		rightWingModel[41] = new ModelRendererTurbo(this, 6, 463, textureX, textureY); // Box 545
		rightWingModel[42] = new ModelRendererTurbo(this, 6, 463, textureX, textureY); // Box 546
		rightWingModel[43] = new ModelRendererTurbo(this, 6, 463, textureX, textureY); // Box 547
		rightWingModel[44] = new ModelRendererTurbo(this, 6, 463, textureX, textureY); // Box 548
		rightWingModel[45] = new ModelRendererTurbo(this, 6, 463, textureX, textureY); // Box 549
		rightWingModel[46] = new ModelRendererTurbo(this, 6, 463, textureX, textureY); // Box 550
		rightWingModel[47] = new ModelRendererTurbo(this, 6, 463, textureX, textureY); // Box 551
		rightWingModel[48] = new ModelRendererTurbo(this, 6, 463, textureX, textureY); // Box 552
		rightWingModel[49] = new ModelRendererTurbo(this, 6, 463, textureX, textureY); // Box 553
		rightWingModel[50] = new ModelRendererTurbo(this, 6, 463, textureX, textureY); // Box 554
		rightWingModel[51] = new ModelRendererTurbo(this, 6, 463, textureX, textureY); // Box 555
		rightWingModel[52] = new ModelRendererTurbo(this, 6, 463, textureX, textureY); // Box 556
		rightWingModel[53] = new ModelRendererTurbo(this, 6, 463, textureX, textureY); // Box 557
		rightWingModel[54] = new ModelRendererTurbo(this, 6, 463, textureX, textureY); // Box 558
		rightWingModel[55] = new ModelRendererTurbo(this, 6, 463, textureX, textureY); // Box 559
		rightWingModel[56] = new ModelRendererTurbo(this, 6, 463, textureX, textureY); // Box 560
		rightWingModel[57] = new ModelRendererTurbo(this, 793, 658, textureX, textureY); // Box 866

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 15, 9, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 312
		rightWingModel[0].setRotationPoint(-47F, -57F, 14F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 29, 8, 7, 0F,0F, 0F, 0F, 2.5F, -1.5F, 2.5F, -5F, -5.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 2.5F, 0F, 2.5F, -5F, 0F, 0F, 0F, 0F, 0F); // Box 313
		rightWingModel[1].setRotationPoint(-32F, -57F, 14F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 15, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 314
		rightWingModel[2].setRotationPoint(-47F, -48F, 5F);

		rightWingModel[3].addShapeBox(0F, 0F, 0F, 24, 3, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 315
		rightWingModel[3].setRotationPoint(-32F, -49F, 5F);

		rightWingModel[4].addShapeBox(0F, 0F, 0F, 12, 6, 16, 0F,-7.5F, 0.5F, -6.5F, 0F, 0F, -5F, 0F, -5.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 317
		rightWingModel[4].setRotationPoint(-8F, -55F, 5F);

		rightWingModel[5].addShapeBox(0F, 0F, 0F, 11, 6, 17, 0F,0F, 0F, -6F, 0F, -1F, -4F, 0F, -4F, -9.5F, 0F, -5.5F, 0F, -4F, 0F, -1F, 0F, -1F, 0F, 0F, -1.5F, -9.5F, 0F, 0F, 0F); // Box 318
		rightWingModel[5].setRotationPoint(4F, -55F, 4F);

		rightWingModel[6].addShapeBox(0F, 0F, 0F, 15, 11, 15, 0F,0F, -3.5F, -7F, 0F, 0F, -8F, 0F, -1.5F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 319
		rightWingModel[6].setRotationPoint(-62F, -57F, 6F);

		rightWingModel[7].addShapeBox(0F, 0F, 0F, 2, 5, 15, 0F,2F, -1F, -5.5F, 0F, 0.5F, -7F, 0F, 0F, 0F, 0.5F, -1.5F, 0F, 2F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -2F, 0F); // Box 320
		rightWingModel[7].setRotationPoint(-64F, -53F, 6F);

		rightWingModel[8].addShapeBox(0F, 0F, 0F, 10, 5, 7, 0F,0F, -1F, -4F, 0F, -2.5F, 0.5F, 0F, -2.5F, -7F, 0F, -4F, 0.5F, 0F, 0F, 0F, 0F, -2F, 0.5F, 0F, -2F, -7F, 0F, -0.5F, 0.5F); // Box 321
		rightWingModel[8].setRotationPoint(15F, -55F, 4F);

		rightWingModel[9].addShapeBox(0F, 0F, 0F, 15, 10, 17, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 322
		rightWingModel[9].setRotationPoint(-47F, -56F, 21F);

		rightWingModel[10].addShapeBox(0F, 0F, 0F, 15, 10, 17, 0F,0F, -3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.5F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -2F, 0F); // Box 323
		rightWingModel[10].setRotationPoint(-62F, -56F, 21F);

		rightWingModel[11].addShapeBox(0F, 0F, 0F, 24, 10, 17, 0F,0F, -0.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 324
		rightWingModel[11].setRotationPoint(-32F, -56F, 21F);

		rightWingModel[12].addShapeBox(0F, 0F, 0F, 12, 4, 17, 0F,0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, -1.5F, 0F); // Box 325
		rightWingModel[12].setRotationPoint(-8F, -51F, 21F);

		rightWingModel[13].addShapeBox(0F, 0F, 0F, 3, 5, 17, 0F,-0.5F, -1.5F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -2.5F, -1.5F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -2.5F, -2F, 0F); // Box 326
		rightWingModel[13].setRotationPoint(-65F, -53F, 21F);

		rightWingModel[14].addShapeBox(0F, 0F, 0F, 15, 18, 55, 0F,0F, -8.5F, 0F, 0F, -8.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -11.5F, 0F, -2F, -11.5F, 0F); // Box 369
		rightWingModel[14].setRotationPoint(-47F, -64F, 38F);

		rightWingModel[15].addShapeBox(0F, 0F, 0F, 19, 18, 55, 0F,-4F, -8.5F, 0F, 9F, -12.5F, 0F, -2F, -2.5F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, 9F, -1F, 0F, -2F, -12F, 0F, -2F, -11.5F, 0F); // Box 370
		rightWingModel[15].setRotationPoint(-36F, -64F, 38F);

		rightWingModel[16].addShapeBox(0F, 0F, 0F, 13, 18, 55, 0F,0.5F, -11F, 0F, 0F, -8.5F, 0F, 2F, 0F, 0F, -5F, -2F, 0F, 0.5F, -2F, 0F, 0F, 0F, 0F, 2F, -11.5F, 0F, -5F, -12.5F, 0F); // Box 371
		rightWingModel[16].setRotationPoint(-60F, -64F, 38F);

		rightWingModel[17].addShapeBox(0F, 0F, 0F, 3, 14, 55, 0F,-0.5F, -10.5F, 0F, -0.5F, -9F, 0F, 5F, 0F, 0F, -6F, -1F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, 5F, -10.5F, 0F, -6F, -12F, 0F); // Box 373
		rightWingModel[17].setRotationPoint(-63F, -62F, 38F);

		rightWingModel[18].addShapeBox(0F, 0F, 0F, 11, 11, 35, 0F,0F, -5F, 0F, 0F, -5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1.5F, -6.5F, 0F, -1.5F, -6.5F, 0F); // Box 374
		rightWingModel[18].setRotationPoint(-45F, -69F, 93F);

		rightWingModel[19].addShapeBox(0F, 0F, 0F, 10, 11, 35, 0F,0F, -7F, 0F, 0F, -5F, 0F, 1.5F, 0F, 0F, -4.5F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 1.5F, -6.5F, 0F, -4.5F, -7F, 0F); // Box 375
		rightWingModel[19].setRotationPoint(-55F, -69F, 93F);

		rightWingModel[20].addShapeBox(0F, 0F, 0F, 11, 11, 35, 0F,-2F, -5F, 0F, 6F, -7.5F, 0F, -3.5F, -1F, 0F, -0.5F, 0F, 0F, -2F, 0.5F, 0F, 6F, 0F, 0F, -3.5F, -7F, 0F, -0.5F, -6.5F, 0F); // Box 376
		rightWingModel[20].setRotationPoint(-36F, -69F, 93F);

		rightWingModel[21].addShapeBox(0F, 0F, 0F, 13, 10, 35, 0F,-9F, -6.5F, 0F, 7F, -8.5F, 0F, -1.5F, -2F, 0F, 0.5F, 0F, 0F, -9F, 0F, 0F, 7F, -1F, 0F, -1.5F, -7.5F, 0F, 0.5F, -7F, 0F); // Box 377
		rightWingModel[21].setRotationPoint(-28F, -68F, 93F);

		rightWingModel[22].addShapeBox(0F, 0F, 0F, 13, 3, 10, 0F,-0.5F, 0F, 0F, -0.5F, -2F, 0F, -4F, -1F, -5F, 0F, 1F, 0.5F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -4F, -1.5F, -5F, 0F, -2.5F, 0.5F); // Box 378
		rightWingModel[22].setRotationPoint(-29F, -68F, 128F);

		rightWingModel[23].addShapeBox(0F, 0F, 0F, 6, 3, 12, 0F,0.5F, 0F, 0F, 0.5F, -1F, 0F, 0F, 0F, -1.5F, 2F, 0.5F, 0F, 0.5F, 1.5F, 0F, 0.5F, 1F, 0F, 0F, -1.5F, -1.5F, 2F, -1.5F, 0F); // Box 379
		rightWingModel[23].setRotationPoint(-35F, -69F, 128F);

		rightWingModel[24].addShapeBox(0F, 0F, 0F, 9, 4, 12, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0.5F, 0F, -3F, 0.5F, -1F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -2F, -2.5F, 0F, -3F, -2.5F, -1F); // Box 380
		rightWingModel[24].setRotationPoint(-44F, -69F, 128F);

		rightWingModel[25].addShapeBox(0F, 0F, 0F, 9, 4, 12, 0F,-0.5F, -1F, 0F, -1.5F, 0F, 0F, 1F, 0.5F, -1F, -4.5F, 0F, -4.5F, -0.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, 1F, -2.5F, -1F, -4.5F, -2F, -4.5F); // Box 381
		rightWingModel[25].setRotationPoint(-51F, -69F, 128F);

		rightWingModel[26].addShapeBox(0F, 0F, 0F, 5, 11, 35, 0F,0F, -8F, 0F, -3F, -7F, 0F, 1.5F, -1F, 0F, -4.5F, -2F, 0F, 0F, -2F, 0F, -3F, -0.5F, 0F, 1.5F, -6.5F, 0F, -4.5F, -8F, 0F); // Box 382
		rightWingModel[26].setRotationPoint(-57F, -69F, 93F);

		rightWingModel[27].addShapeBox(0F, 0F, 0F, 2, 4, 7, 0F,0.5F, -2F, 0F, -0.5F, -1F, 0F, 3.5F, 0F, 0.5F, -3.5F, -0.5F, 0.5F, 0.5F, -1F, 0F, -0.5F, 0.5F, 0F, 3.5F, -2F, 0.5F, -3.5F, -2.5F, 0.5F); // Box 383
		rightWingModel[27].setRotationPoint(-52F, -69F, 128F);

		rightWingModel[28].addShapeBox(0F, 0F, 0F, 7, 2, 3, 0F,0.5F, -0.5F, 0.5F, -5.5F, 0F, 0.5F, 0F, 0.5F, 0F, -3.5F, -0.5F, -1F, 0.5F, -0.5F, 0.5F, -5.5F, 0F, 0.5F, 0F, -0.5F, 0F, -3.5F, -1F, -1F); // Box 384
		rightWingModel[28].setRotationPoint(-48F, -69F, 136F);

		rightWingModel[29].addShapeBox(0F, 0F, 0F, 15, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 480
		rightWingModel[29].setRotationPoint(-47F, -56F, 37F);

		rightWingModel[30].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 481
		rightWingModel[30].setRotationPoint(-55F, -56F, 37F);

		rightWingModel[31].addShapeBox(0F, 0F, 0F, 24, 2, 1, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 482
		rightWingModel[31].setRotationPoint(-32F, -56F, 37F);

		rightWingModel[32].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 483
		rightWingModel[32].setRotationPoint(-8F, -52F, 37F);

		rightWingModel[33].addShapeBox(0F, 0F, 0F, 26, 7, 1, 0F,-3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F); // Box 537
		rightWingModel[33].setRotationPoint(-48F, -53F, 50F);

		rightWingModel[34].addShapeBox(0F, 0F, 0F, 26, 7, 1, 0F,-5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 538
		rightWingModel[34].setRotationPoint(-48F, -53F, 49F);

		rightWingModel[35].addShapeBox(0F, 0F, 0F, 15, 3, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 539
		rightWingModel[35].setRotationPoint(-43F, -44.5F, 47.5F);

		rightWingModel[36].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 540
		rightWingModel[36].setRotationPoint(-48.5F, -43.5F, 49.5F);

		rightWingModel[37].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 541
		rightWingModel[37].setRotationPoint(-22F, -46F, 49.5F);

		rightWingModel[38].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F); // Box 542
		rightWingModel[38].setRotationPoint(-19F, -46F, 49.5F);

		rightWingModel[39].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-2F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -2F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 543
		rightWingModel[39].setRotationPoint(-22F, -43.5F, 47F);

		rightWingModel[40].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F); // Box 544
		rightWingModel[40].setRotationPoint(-19F, -43.5F, 47F);

		rightWingModel[41].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.3F, -1.9F, 0F, -0.3F, -1.9F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -1.5F, 0F, -0.1F, -1.5F); // Box 545
		rightWingModel[41].setRotationPoint(-18F, -45F, 48F);

		rightWingModel[42].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.1F, -1.5F, 0F, -0.1F, -1.5F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.3F, -1.9F, 0F, -0.3F, -1.9F); // Box 546
		rightWingModel[42].setRotationPoint(-18F, -43F, 50F);

		rightWingModel[43].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -1.5F, 0F, -0.1F, -1.5F, 0F, -0.3F, -1.9F, 0F, -0.3F, -1.9F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F); // Box 547
		rightWingModel[43].setRotationPoint(-18F, -43F, 48F);

		rightWingModel[44].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 548
		rightWingModel[44].setRotationPoint(-19F, -42F, 49.5F);

		rightWingModel[45].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -2F, 0F, -0.4F); // Box 549
		rightWingModel[45].setRotationPoint(-22F, -43F, 49.5F);

		rightWingModel[46].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -2F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -2F, -0.4F, 0F); // Box 550
		rightWingModel[46].setRotationPoint(-22F, -43.5F, 50F);

		rightWingModel[47].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 551
		rightWingModel[47].setRotationPoint(-19F, -43.5F, 51F);

		rightWingModel[48].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.3F, -1.9F, 0F, -0.3F, -1.9F, 0F, -0.1F, -1.5F, 0F, -0.1F, -1.5F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F); // Box 552
		rightWingModel[48].setRotationPoint(-18F, -45F, 50F);

		rightWingModel[49].addShapeBox(0F, 0F, 0F, 15, 2, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 553
		rightWingModel[49].setRotationPoint(-43F, -45.5F, 47.5F);

		rightWingModel[50].addShapeBox(0F, 0F, 0F, 15, 2, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 554
		rightWingModel[50].setRotationPoint(-43F, -42.5F, 47.5F);

		rightWingModel[51].addShapeBox(0F, 0F, 0F, 5, 3, 5, 0F,0F, -1F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, -1.5F); // Box 555
		rightWingModel[51].setRotationPoint(-48F, -44.5F, 47.5F);

		rightWingModel[52].addShapeBox(0F, 0F, 0F, 5, 2, 5, 0F,0F, -1.5F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1.5F, -2F, 0F, 0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F); // Box 556
		rightWingModel[52].setRotationPoint(-48F, -45.5F, 47.5F);

		rightWingModel[53].addShapeBox(0F, 0F, 0F, 5, 2, 5, 0F,0F, 0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, -1.5F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1.5F, -2F); // Box 557
		rightWingModel[53].setRotationPoint(-48F, -42.5F, 47.5F);

		rightWingModel[54].addShapeBox(0F, 0F, 0F, 10, 3, 5, 0F,0F, -0.5F, 0F, 0F, -1.25F, -2F, 0F, -1.25F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.25F, -2F, 0F, -1.25F, -2F, 0F, -0.5F, 0F); // Box 558
		rightWingModel[54].setRotationPoint(-28F, -44.5F, 47.5F);

		rightWingModel[55].addShapeBox(0F, 0F, 0F, 10, 2, 5, 0F,0F, 0F, -1F, 0F, -2F, -2.25F, 0F, -2F, -2.25F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, 0.25F, -2F, 0F, 0.25F, -2F, 0F, -0.5F, 0F); // Box 559
		rightWingModel[55].setRotationPoint(-28F, -45.5F, 47.5F);

		rightWingModel[56].addShapeBox(0F, 0F, 0F, 10, 2, 5, 0F,0F, -0.5F, 0F, 0F, 0.25F, -2F, 0F, 0.25F, -2F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, -2F, -2.25F, 0F, -2F, -2.25F, 0F, 0F, -1F); // Box 560
		rightWingModel[56].setRotationPoint(-28F, -42.5F, 47.5F);

		rightWingModel[57].addShapeBox(0F, 0F, 0F, 12, 4, 17, 0F,0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, -1.5F, 0F); // Box 866
		rightWingModel[57].setRotationPoint(-8F, -51F, -38F);
	}

	private void inityawFlapModel_1()
	{
		yawFlapModel[0] = new ModelRendererTurbo(this, 161, 792, textureX, textureY); // Box 169
		yawFlapModel[1] = new ModelRendererTurbo(this, 161, 832, textureX, textureY); // Box 364

		yawFlapModel[0].addShapeBox(0F, -1F, -2F, 13, 37, 2, 0F,0F, -12F, 0F, -10F, -14F, -1F, -9.5F, -4.5F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, -1.5F, -0.5F, -1.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 169
		yawFlapModel[0].setRotationPoint(99F, -108F, 0F);

		yawFlapModel[1].addShapeBox(0F, -1F, 0F, 13, 37, 2, 0F,0F, -1F, 0F, -9.5F, -4.5F, 0F, -10F, -14F, -1F, 0F, -12F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.5F, -0.5F, -1.75F, 0F, -0.5F, 0F); // Box 364
		yawFlapModel[1].setRotationPoint(99F, -108F, 0F);
	}

	private void initpitchFlapLeftModel_1()
	{
		pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 1, 686, textureX, textureY); // Box 157

		pitchFlapLeftModel[0].addShapeBox(0F, 0F, 0F, 14, 4, 48, 0F,0F, 0F, 0F, -3F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 157
		pitchFlapLeftModel[0].setRotationPoint(87F, -72F, -50F);
	}

	private void initpitchFlapRightModel_1()
	{
		pitchFlapRightModel[0] = new ModelRendererTurbo(this, 1, 739, textureX, textureY); // Box 352

		pitchFlapRightModel[0].addShapeBox(0F, 0F, 0F, 14, 4, 48, 0F,0F, 0F, 0F, 0F, -2F, 0F, -3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -3F, -1.5F, 0F, 0F, 0F, 0F); // Box 352
		pitchFlapRightModel[0].setRotationPoint(87F, -72F, 2F);
	}

	private void inittailWheelModel_1()
	{
		tailWheelModel[0] = new ModelRendererTurbo(this, 1, 457, textureX, textureY); // Box 391
		tailWheelModel[1] = new ModelRendererTurbo(this, 33, 457, textureX, textureY); // Box 392
		tailWheelModel[2] = new ModelRendererTurbo(this, 57, 457, textureX, textureY); // Box 393
		tailWheelModel[3] = new ModelRendererTurbo(this, 73, 457, textureX, textureY); // Box 394
		tailWheelModel[4] = new ModelRendererTurbo(this, 97, 457, textureX, textureY); // Box 395
		tailWheelModel[5] = new ModelRendererTurbo(this, 121, 457, textureX, textureY); // Box 396
		tailWheelModel[6] = new ModelRendererTurbo(this, 145, 457, textureX, textureY); // Box 397
		tailWheelModel[7] = new ModelRendererTurbo(this, 177, 457, textureX, textureY); // Box 398
		tailWheelModel[8] = new ModelRendererTurbo(this, 201, 457, textureX, textureY); // Box 399

		tailWheelModel[0].addShapeBox(0F, 0F, 0F, 10, 3, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 391
		tailWheelModel[0].setRotationPoint(87F, -62F, -2F);

		tailWheelModel[1].addShapeBox(0F, 0F, 0F, 8, 3, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F); // Box 392
		tailWheelModel[1].setRotationPoint(89F, -59F, -2F);

		tailWheelModel[2].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 393
		tailWheelModel[2].setRotationPoint(92F, -56F, -2F);

		tailWheelModel[3].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		tailWheelModel[3].setRotationPoint(92F, -53F, -1F);

		tailWheelModel[4].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 395
		tailWheelModel[4].setRotationPoint(92F, -55F, -1F);

		tailWheelModel[5].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 396
		tailWheelModel[5].setRotationPoint(92F, -51F, -1F);

		tailWheelModel[6].addShapeBox(0F, 0F, 0F, 10, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F); // Box 397
		tailWheelModel[6].setRotationPoint(87F, -62F, 0F);

		tailWheelModel[7].addShapeBox(0F, 0F, 0F, 8, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 398
		tailWheelModel[7].setRotationPoint(89F, -59F, 0F);

		tailWheelModel[8].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 399
		tailWheelModel[8].setRotationPoint(92F, -56F, 1F);
	}

	private void initleftWingWheelModel_1()
	{
		leftWingWheelModel[0] = new ModelRendererTurbo(this, 1, 407, textureX, textureY); // Box 191
		leftWingWheelModel[1] = new ModelRendererTurbo(this, 17, 407, textureX, textureY); // Box 192
		leftWingWheelModel[2] = new ModelRendererTurbo(this, 65, 407, textureX, textureY); // Box 193
		leftWingWheelModel[3] = new ModelRendererTurbo(this, 113, 407, textureX, textureY); // Box 194
		leftWingWheelModel[4] = new ModelRendererTurbo(this, 161, 407, textureX, textureY); // Box 195

		leftWingWheelModel[0].addShapeBox(0F, 0F, 0F, 2, 22, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 191
		leftWingWheelModel[0].setRotationPoint(-58F, -48F, -34F);

		leftWingWheelModel[1].addShapeBox(0F, 0F, 0F, 15, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 192
		leftWingWheelModel[1].setRotationPoint(-64.5F, -30F, -40F);

		leftWingWheelModel[2].addShapeBox(0F, 0F, 0F, 15, 5, 6, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		leftWingWheelModel[2].setRotationPoint(-64.5F, -35F, -40F);

		leftWingWheelModel[3].addShapeBox(0F, 0F, 0F, 15, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 194
		leftWingWheelModel[3].setRotationPoint(-64.5F, -25F, -40F);

		leftWingWheelModel[4].addShapeBox(0F, 0F, 0F, 6, 15, 6, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 195
		leftWingWheelModel[4].setRotationPoint(-58.5F, -48F, -42F);
	}

	private void initrightWingWheelModel_1()
	{
		rightWingWheelModel[0] = new ModelRendererTurbo(this, 1, 432, textureX, textureY); // Box 385
		rightWingWheelModel[1] = new ModelRendererTurbo(this, 17, 432, textureX, textureY); // Box 386
		rightWingWheelModel[2] = new ModelRendererTurbo(this, 65, 432, textureX, textureY); // Box 387
		rightWingWheelModel[3] = new ModelRendererTurbo(this, 113, 432, textureX, textureY); // Box 388
		rightWingWheelModel[4] = new ModelRendererTurbo(this, 161, 432, textureX, textureY); // Box 389

		rightWingWheelModel[0].addShapeBox(0F, 0F, 0F, 2, 22, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 385
		rightWingWheelModel[0].setRotationPoint(-58F, -48F, 32F);

		rightWingWheelModel[1].addShapeBox(0F, 0F, 0F, 15, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 386
		rightWingWheelModel[1].setRotationPoint(-64.5F, -30F, 34F);

		rightWingWheelModel[2].addShapeBox(0F, 0F, 0F, 15, 5, 6, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 387
		rightWingWheelModel[2].setRotationPoint(-64.5F, -35F, 34F);

		rightWingWheelModel[3].addShapeBox(0F, 0F, 0F, 15, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 388
		rightWingWheelModel[3].setRotationPoint(-64.5F, -25F, 34F);

		rightWingWheelModel[4].addShapeBox(0F, 0F, 0F, 6, 15, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 389
		rightWingWheelModel[4].setRotationPoint(-58.5F, -48F, 36F);
	}

	private void initleftWingPos1Model_1()
	{
		leftWingPos1Model[0] = new ModelRendererTurbo(this, 441, 584, textureX, textureY); // Box 867
		leftWingPos1Model[1] = new ModelRendererTurbo(this, 185, 231, textureX, textureY); // Box 869
		leftWingPos1Model[2] = new ModelRendererTurbo(this, 393, 231, textureX, textureY); // Box 876
		leftWingPos1Model[3] = new ModelRendererTurbo(this, 457, 231, textureX, textureY); // Box 877
		leftWingPos1Model[4] = new ModelRendererTurbo(this, 505, 231, textureX, textureY); // Box 878
		leftWingPos1Model[5] = new ModelRendererTurbo(this, 265, 231, textureX, textureY); // Box 882
		leftWingPos1Model[6] = new ModelRendererTurbo(this, 1, 231, textureX, textureY); // Box 883
		leftWingPos1Model[7] = new ModelRendererTurbo(this, 129, 231, textureX, textureY); // Box 886

		leftWingPos1Model[0].addShapeBox(0F, 0F, 0F, 12, 15, 55, 0F,11F, -0.5F, 0F, -12F, -2.5F, 0F, 0F, -12.5F, 0F, 0F, -10.5F, 0F, 11F, -12.25F, 0F, -12F, -12.25F, 0F, 0F, -2.25F, 0F, 0F, -1.25F, 0F); // Box 867
		leftWingPos1Model[0].setRotationPoint(-8F, -62F, -93F);

		leftWingPos1Model[1].addShapeBox(0F, -14F, -55F, 12, 15, 55, 0F,11F, -2.75F, 0F, -12F, -2.75F, 0F, 0F, -12.75F, 0F, 0F, -13.5F, 0F, 11F, -11F, 0F, -12F, -12F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 869
		leftWingPos1Model[1].setRotationPoint(-8F, -48F, -38F);

		leftWingPos1Model[2].addShapeBox(0F, 0F, 0F, 12, 4, 17, 0F,0F, -2.5F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 876
		leftWingPos1Model[2].setRotationPoint(-8F, -51F, -38F);

		leftWingPos1Model[3].addShapeBox(0F, 0F, 0F, 12, 2, 16, 0F,0F, -1.5F, 0F, 0F, 0.25F, 0F, 4F, 0.25F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, -2.25F, 0F, 4F, -2.25F, 0F, -1F, 1F, 0F); // Box 877
		leftWingPos1Model[3].setRotationPoint(-8F, -49F, -21F);
		leftWingPos1Model[3].rotateAngleZ = -0.01745329F;

		leftWingPos1Model[4].addShapeBox(0F, 0F, 0F, 15, 1, 10, 0F,0F, -0.5F, -5F, 0F, 2.5F, -5F, 0F, 2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -5F, 0F, -3F, -5F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 878
		leftWingPos1Model[4].setRotationPoint(-7F, -47F, -10F);

		leftWingPos1Model[5].addShapeBox(0F, 0F, 0F, 12, 2, 16, 0F,0F, -1.5F, 0F, 0F, 0.25F, 0F, 4F, 0.25F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 4F, -2F, 0F, -1F, 1F, 0F); // Box 882
		leftWingPos1Model[5].setRotationPoint(-8F, -48.75F, -21F);

		leftWingPos1Model[6].addShapeBox(0F, 0F, 0F, 15, 1, 10, 0F,0F, -0.5F, -5F, 0F, 2.5F, -5F, 0F, 2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -5F, 0F, -3F, -5F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 883
		leftWingPos1Model[6].setRotationPoint(-7F, -46.75F, -10F);

		leftWingPos1Model[7].addShapeBox(0F, 0F, 0F, 12, 4, 17, 0F,0F, -3.25F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 886
		leftWingPos1Model[7].setRotationPoint(-8F, -50.75F, -38F);
	}

	private void initleftWingPos2Model_1()
	{
		leftWingPos2Model[0] = new ModelRendererTurbo(this, 1, 231, textureX, textureY); // Box 69
		leftWingPos2Model[1] = new ModelRendererTurbo(this, 129, 231, textureX, textureY); // Box 868
		leftWingPos2Model[2] = new ModelRendererTurbo(this, 265, 231, textureX, textureY); // Box 870
		leftWingPos2Model[3] = new ModelRendererTurbo(this, 673, 231, textureX, textureY); // Box 882
		leftWingPos2Model[4] = new ModelRendererTurbo(this, 441, 584, textureX, textureY); // Box 884

		leftWingPos2Model[0].addShapeBox(0F, 0F, 0F, 15, 1, 10, 0F,0F, -0.5F, -5F, 0F, 2.5F, -5F, 0F, 2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -5F, 0F, -3F, -5F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 69
		leftWingPos2Model[0].setRotationPoint(-9F, -47F, -10F);
		leftWingPos2Model[0].rotateAngleZ = -0.97738438F;

		leftWingPos2Model[1].addShapeBox(0F, 0F, 0F, 12, 4, 17, 0F,0F, -3.25F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 868
		leftWingPos2Model[1].setRotationPoint(-6.25F, -50F, -38F);
		leftWingPos2Model[1].rotateAngleZ = -0.95993109F;

		leftWingPos2Model[2].addShapeBox(0F, 0F, 0F, 12, 2, 16, 0F,0F, -1.5F, 0F, 0F, 0.25F, 0F, 4F, 0.25F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 4F, -2F, 0F, -1F, 1F, 0F); // Box 870
		leftWingPos2Model[2].setRotationPoint(-8F, -49F, -21F);
		leftWingPos2Model[2].rotateAngleZ = -0.95993109F;

		leftWingPos2Model[3].addShapeBox(0F, -14F, -30F, 12, 15, 55, 0F,11F, -2.75F, 0F, -12F, -13.25F, 0F, -4.5F, -22.75F, 0F, 0F, -14.5F, 0F, 11F, -11F, 0F, -12.5F, -1F, 0F, -4.75F, 8F, 0F, 0F, 0F, 0F); // Box 882
		leftWingPos2Model[3].setRotationPoint(-8.25F, -48F, -63F);

		leftWingPos2Model[4].addShapeBox(0F, 0F, 0F, 12, 15, 55, 0F,11F, -0.5F, 0F, -13.25F, 9.25F, 0F, 0F, 1.75F, 0F, 0F, -10.5F, 0F, 11F, -12.25F, 0F, -12.25F, -24F, 0F, 0.5F, -16.25F, 0F, 0F, -1.25F, 0F); // Box 884
		leftWingPos2Model[4].setRotationPoint(-8F, -62F, -93F);
	}

	private void initrightWingPos1Model_1()
	{
		rightWingPos1Model[0] = new ModelRendererTurbo(this, 441, 584, textureX, textureY); // Box 372
		rightWingPos1Model[1] = new ModelRendererTurbo(this, 41, 231, textureX, textureY); // Box 864
		rightWingPos1Model[2] = new ModelRendererTurbo(this, 49, 231, textureX, textureY); // Box 865
		rightWingPos1Model[3] = new ModelRendererTurbo(this, 329, 231, textureX, textureY); // Box 871
		rightWingPos1Model[4] = new ModelRendererTurbo(this, 177, 231, textureX, textureY); // Box 875
		rightWingPos1Model[5] = new ModelRendererTurbo(this, 561, 231, textureX, textureY); // Box 884
		rightWingPos1Model[6] = new ModelRendererTurbo(this, 265, 231, textureX, textureY); // Box 885
		rightWingPos1Model[7] = new ModelRendererTurbo(this, 129, 231, textureX, textureY); // Box 887

		rightWingPos1Model[0].addShapeBox(0F, 0F, 0F, 12, 15, 55, 0F,0F, -10.5F, 0F, 0F, -12.5F, 0F, -12F, -2.5F, 0F, 11F, -0.5F, 0F, 0F, -1.25F, 0F, 0F, -2.25F, 0F, -12F, -12.25F, 0F, 11F, -12.25F, 0F); // Box 372
		rightWingPos1Model[0].setRotationPoint(-8F, -62F, 38F);

		rightWingPos1Model[1].addShapeBox(0F, 0F, 0F, 12, 4, 17, 0F,0F, -2.5F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 864
		rightWingPos1Model[1].setRotationPoint(-8F, -51F, 21F);

		rightWingPos1Model[2].addShapeBox(0F, 0F, 0F, 12, 15, 55, 0F,0F, -13.5F, 0F, 0F, -12.75F, 0F, -12F, -2.75F, 0F, 11F, -2.75F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -12F, -12F, 0F, 11F, -11F, 0F); // Box 865
		rightWingPos1Model[2].setRotationPoint(-8F, -62F, 38F);

		rightWingPos1Model[3].addShapeBox(0F, 0F, 0F, 12, 2, 16, 0F,-1F, -2F, 0F, 4F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1.5F, 0F, -1F, 1F, 0F, 4F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 871
		rightWingPos1Model[3].setRotationPoint(-8F, -49F, 5F);

		rightWingPos1Model[4].addShapeBox(0F, 0F, 0F, 15, 1, 10, 0F,0F, -0.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, -5F, 0F, -0.5F, -5F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -5F, 0F, 0F, -5F); // Box 875
		rightWingPos1Model[4].setRotationPoint(-7F, -47F, 0F);

		rightWingPos1Model[5].addShapeBox(0F, 0F, 0F, 15, 1, 10, 0F,0F, -0.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, -5F, 0F, -0.5F, -5F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -5F, 0F, 0F, -5F); // Box 884
		rightWingPos1Model[5].setRotationPoint(-7F, -46.75F, 0F);

		rightWingPos1Model[6].addShapeBox(0F, 0F, 0F, 12, 2, 16, 0F,-1F, -2F, 0F, 4F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1.5F, 0F, -1F, 1F, 0F, 4F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 885
		rightWingPos1Model[6].setRotationPoint(-8F, -48.75F, 5F);

		rightWingPos1Model[7].addShapeBox(0F, 0F, 0F, 12, 4, 17, 0F,0F, -3.5F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -3.25F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 887
		rightWingPos1Model[7].setRotationPoint(-8F, -50.75F, 21F);
	}

	private void initrightWingPos2Model_1()
	{
		rightWingPos2Model[0] = new ModelRendererTurbo(this, 561, 231, textureX, textureY); // Box 879
		rightWingPos2Model[1] = new ModelRendererTurbo(this, 601, 231, textureX, textureY); // Box 880
		rightWingPos2Model[2] = new ModelRendererTurbo(this, 665, 231, textureX, textureY); // Box 881
		rightWingPos2Model[3] = new ModelRendererTurbo(this, 809, 231, textureX, textureY); // Box 883
		rightWingPos2Model[4] = new ModelRendererTurbo(this, 441, 584, textureX, textureY); // Box 885

		rightWingPos2Model[0].addShapeBox(0F, 0F, 0F, 15, 1, 10, 0F,0F, -0.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, -5F, 0F, -0.5F, -5F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -5F, 0F, 0F, -5F); // Box 879
		rightWingPos2Model[0].setRotationPoint(-9F, -47F, 0F);
		rightWingPos2Model[0].rotateAngleZ = -0.97738438F;

		rightWingPos2Model[1].addShapeBox(0F, 0F, 0F, 12, 4, 17, 0F,0F, -3.5F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -3.25F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 880
		rightWingPos2Model[1].setRotationPoint(-6.25F, -50F, 21F);
		rightWingPos2Model[1].rotateAngleZ = -0.95993109F;

		rightWingPos2Model[2].addShapeBox(0F, 0F, 0F, 12, 2, 16, 0F,-1F, -2F, 0F, 4F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1.5F, 0F, -1F, 1F, 0F, 4F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 881
		rightWingPos2Model[2].setRotationPoint(-8F, -49F, 5F);
		rightWingPos2Model[2].rotateAngleZ = -0.95993109F;

		rightWingPos2Model[3].addShapeBox(0F, -14F, -30F, 12, 15, 55, 0F,0F, -14.5F, 0F, -4.5F, -22.75F, 0F, -12F, -13.25F, 0F, 11F, -2.75F, 0F, 0F, 0F, 0F, -4.75F, 8F, 0F, -12.5F, -1F, 0F, 11F, -11F, 0F); // Box 883
		rightWingPos2Model[3].setRotationPoint(-8.25F, -48F, 68F);

		rightWingPos2Model[4].addShapeBox(0F, 0F, 0F, 12, 15, 55, 0F,0F, -10.5F, 0F, 0F, 1.75F, 0F, -13.25F, 9.25F, 0F, 11F, -0.5F, 0F, 0F, -1.25F, 0F, 0.5F, -16.25F, 0F, -12.25F, -24F, 0F, 11F, -12.25F, 0F); // Box 885
		rightWingPos2Model[4].setRotationPoint(-8F, -62F, 38F);
	}

	private void initPropeller()
	{
		propellerModels = new ModelRendererTurbo[1][3];
		propellerModels[0] = makeProp1(-103F, -61F, 0F);
	}

	private ModelRendererTurbo[] makeProp1(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[3];
		prop[0] = new ModelRendererTurbo(this, 0, 297, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 297, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 0, 297, textureX, textureY);
		prop[0].addBox(-1F, -34F, -2F, 2, 34, 4, 0.0F);
		prop[1].addBox(-1F, -34F, -2F, 2, 34, 4, 0.0F);
		prop[2].addBox(-1F, -34F, -2F, 2, 34, 4, 0.0F);
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
		gun_1_Model[1][0] = new ModelRendererTurbo(this, 0, 69, textureX, textureY); // MG1
		gun_1_Model[1][1] = new ModelRendererTurbo(this, 0, 72, textureX, textureY); // MG1 Innen
		gun_1_Model[1][2] = new ModelRendererTurbo(this, 0, 75, textureX, textureY); // MG1 Lauf
		gun_1_Model[1][3] = new ModelRendererTurbo(this, 0, 78, textureX, textureY); // MG2
		gun_1_Model[1][4] = new ModelRendererTurbo(this, 0, 83, textureX, textureY); // MG3
		gun_1_Model[1][5] = new ModelRendererTurbo(this, 7, 83, textureX, textureY); // MG4
		gun_1_Model[1][6] = new ModelRendererTurbo(this, 14, 83, textureX, textureY); // MG5
		gun_1_Model[1][7] = new ModelRendererTurbo(this, 27, 69, textureX, textureY); // MG6
		gun_1_Model[1][8] = new ModelRendererTurbo(this, 27, 73, textureX, textureY); // MG7
		gun_1_Model[1][9] = new ModelRendererTurbo(this, 21, 78, textureX, textureY); // MG8
		gun_1_Model[1][10] = new ModelRendererTurbo(this, 33, 78, textureX, textureY); // MG9
		gun_1_Model[1][11] = new ModelRendererTurbo(this, 23, 78, textureX, textureY); // Ammo

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
			gunPart.setRotationPoint(10F, -81F, 0F);
		}


		gun_1_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("TailGun", gun_1_Model);
	}
}