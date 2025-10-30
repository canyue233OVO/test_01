//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Ki32
// Model Creator: 
// Created on: 22.06.2023 - 19:38:08
// Last changed on: 22.06.2023 - 19:38:08

package com.flansmod.client.model.Taskball; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelKi32 extends ModelPlane //Same as Filename
{
	int textureX = 2048;
	int textureY = 512;

	public ModelKi32() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[162];
		noseModel = new ModelRendererTurbo[68];
		tailModel = new ModelRendererTurbo[27];
		leftWingModel = new ModelRendererTurbo[61];
		rightWingModel = new ModelRendererTurbo[61];
		yawFlapModel = new ModelRendererTurbo[4];
		pitchFlapLeftModel = new ModelRendererTurbo[1];
		pitchFlapRightModel = new ModelRendererTurbo[1];
		pitchFlapLeftWingModel = new ModelRendererTurbo[1];
		pitchFlapRightWingModel = new ModelRendererTurbo[1];
		tailWheelModel = new ModelRendererTurbo[9];
		leftWingWheelModel = new ModelRendererTurbo[9];
		rightWingWheelModel = new ModelRendererTurbo[9];
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

		initGuns();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 4
		bodyModel[4] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 5
		bodyModel[5] = new ModelRendererTurbo(this, 529, 1, textureX, textureY); // Box 6
		bodyModel[6] = new ModelRendererTurbo(this, 585, 1, textureX, textureY); // Box 7
		bodyModel[7] = new ModelRendererTurbo(this, 673, 1, textureX, textureY); // Box 8
		bodyModel[8] = new ModelRendererTurbo(this, 849, 1, textureX, textureY); // Box 10
		bodyModel[9] = new ModelRendererTurbo(this, 1001, 1, textureX, textureY); // Box 12
		bodyModel[10] = new ModelRendererTurbo(this, 1121, 1, textureX, textureY); // Box 13
		bodyModel[11] = new ModelRendererTurbo(this, 1241, 1, textureX, textureY); // Box 14
		bodyModel[12] = new ModelRendererTurbo(this, 1697, 1, textureX, textureY); // Box 25
		bodyModel[13] = new ModelRendererTurbo(this, 1793, 1, textureX, textureY); // Box 28
		bodyModel[14] = new ModelRendererTurbo(this, 585, 17, textureX, textureY); // Box 34
		bodyModel[15] = new ModelRendererTurbo(this, 617, 17, textureX, textureY); // Box 35
		bodyModel[16] = new ModelRendererTurbo(this, 1505, 1, textureX, textureY); // Box 36
		bodyModel[17] = new ModelRendererTurbo(this, 641, 17, textureX, textureY); // Box 37
		bodyModel[18] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 38
		bodyModel[19] = new ModelRendererTurbo(this, 889, 17, textureX, textureY); // Box 39
		bodyModel[20] = new ModelRendererTurbo(this, 1985, 25, textureX, textureY); // Box 59
		bodyModel[21] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 60
		bodyModel[22] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 61
		bodyModel[23] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 62
		bodyModel[24] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 63
		bodyModel[25] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 64
		bodyModel[26] = new ModelRendererTurbo(this, 769, 1, textureX, textureY); // Box 65
		bodyModel[27] = new ModelRendererTurbo(this, 841, 1, textureX, textureY); // Box 66
		bodyModel[28] = new ModelRendererTurbo(this, 1337, 1, textureX, textureY); // Box 67
		bodyModel[29] = new ModelRendererTurbo(this, 1409, 1, textureX, textureY); // Box 68
		bodyModel[30] = new ModelRendererTurbo(this, 849, 1, textureX, textureY); // Box 69
		bodyModel[31] = new ModelRendererTurbo(this, 1537, 1, textureX, textureY); // Box 73
		bodyModel[32] = new ModelRendererTurbo(this, 937, 1, textureX, textureY); // Box 74
		bodyModel[33] = new ModelRendererTurbo(this, 1345, 1, textureX, textureY); // Box 75
		bodyModel[34] = new ModelRendererTurbo(this, 1745, 1, textureX, textureY); // Box 76
		bodyModel[35] = new ModelRendererTurbo(this, 1001, 1, textureX, textureY); // Box 77
		bodyModel[36] = new ModelRendererTurbo(this, 1849, 1, textureX, textureY); // Box 78
		bodyModel[37] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 79
		bodyModel[38] = new ModelRendererTurbo(this, 1593, 1, textureX, textureY); // Box 80
		bodyModel[39] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 81
		bodyModel[40] = new ModelRendererTurbo(this, 1689, 1, textureX, textureY); // Box 82
		bodyModel[41] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 106
		bodyModel[42] = new ModelRendererTurbo(this, 377, 41, textureX, textureY); // Box 107
		bodyModel[43] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Box 108
		bodyModel[44] = new ModelRendererTurbo(this, 257, 41, textureX, textureY); // Box 109
		bodyModel[45] = new ModelRendererTurbo(this, 1865, 41, textureX, textureY); // Box 123
		bodyModel[46] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 124
		bodyModel[47] = new ModelRendererTurbo(this, 809, 57, textureX, textureY); // Box 125
		bodyModel[48] = new ModelRendererTurbo(this, 945, 49, textureX, textureY); // Box 127
		bodyModel[49] = new ModelRendererTurbo(this, 617, 49, textureX, textureY); // Box 128
		bodyModel[50] = new ModelRendererTurbo(this, 1153, 49, textureX, textureY); // Box 129
		bodyModel[51] = new ModelRendererTurbo(this, 369, 73, textureX, textureY); // Box 130
		bodyModel[52] = new ModelRendererTurbo(this, 1073, 73, textureX, textureY); // Box 131
		bodyModel[53] = new ModelRendererTurbo(this, 1953, 65, textureX, textureY); // Box 133
		bodyModel[54] = new ModelRendererTurbo(this, 1593, 73, textureX, textureY); // Box 135
		bodyModel[55] = new ModelRendererTurbo(this, 1809, 73, textureX, textureY); // Box 136
		bodyModel[56] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Box 137
		bodyModel[57] = new ModelRendererTurbo(this, 617, 65, textureX, textureY); // Box 148
		bodyModel[58] = new ModelRendererTurbo(this, 1713, 73, textureX, textureY); // Box 151
		bodyModel[59] = new ModelRendererTurbo(this, 281, 57, textureX, textureY); // Box 157
		bodyModel[60] = new ModelRendererTurbo(this, 1433, 49, textureX, textureY); // Box 158
		bodyModel[61] = new ModelRendererTurbo(this, 929, 41, textureX, textureY); // Box 159
		bodyModel[62] = new ModelRendererTurbo(this, 1601, 57, textureX, textureY); // Box 160
		bodyModel[63] = new ModelRendererTurbo(this, 961, 41, textureX, textureY); // Box 161
		bodyModel[64] = new ModelRendererTurbo(this, 801, 49, textureX, textureY); // Box 162
		bodyModel[65] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 182
		bodyModel[66] = new ModelRendererTurbo(this, 185, 105, textureX, textureY); // Box 183
		bodyModel[67] = new ModelRendererTurbo(this, 1129, 57, textureX, textureY); // Box 184
		bodyModel[68] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 185
		bodyModel[69] = new ModelRendererTurbo(this, 1505, 9, textureX, textureY); // Box 186
		bodyModel[70] = new ModelRendererTurbo(this, 609, 17, textureX, textureY); // Box 187
		bodyModel[71] = new ModelRendererTurbo(this, 633, 17, textureX, textureY); // Box 188
		bodyModel[72] = new ModelRendererTurbo(this, 1225, 1, textureX, textureY); // Box 189
		bodyModel[73] = new ModelRendererTurbo(this, 1409, 17, textureX, textureY); // Box 190
		bodyModel[74] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 191
		bodyModel[75] = new ModelRendererTurbo(this, 665, 17, textureX, textureY); // Box 192
		bodyModel[76] = new ModelRendererTurbo(this, 945, 17, textureX, textureY); // Box 193
		bodyModel[77] = new ModelRendererTurbo(this, 1113, 17, textureX, textureY); // Box 194
		bodyModel[78] = new ModelRendererTurbo(this, 1729, 17, textureX, textureY); // Box 195
		bodyModel[79] = new ModelRendererTurbo(this, 1233, 17, textureX, textureY); // Box 196
		bodyModel[80] = new ModelRendererTurbo(this, 1777, 17, textureX, textureY); // Box 197
		bodyModel[81] = new ModelRendererTurbo(this, 577, 25, textureX, textureY); // Box 198
		bodyModel[82] = new ModelRendererTurbo(this, 1273, 57, textureX, textureY); // Box 199
		bodyModel[83] = new ModelRendererTurbo(this, 1089, 25, textureX, textureY); // Box 200
		bodyModel[84] = new ModelRendererTurbo(this, 945, 1, textureX, textureY); // Box 201
		bodyModel[85] = new ModelRendererTurbo(this, 1905, 9, textureX, textureY); // Box 202
		bodyModel[86] = new ModelRendererTurbo(this, 1225, 105, textureX, textureY); // Box 224
		bodyModel[87] = new ModelRendererTurbo(this, 1273, 105, textureX, textureY); // Box 225
		bodyModel[88] = new ModelRendererTurbo(this, 1361, 105, textureX, textureY); // Box 226
		bodyModel[89] = new ModelRendererTurbo(this, 1721, 105, textureX, textureY); // Box 227
		bodyModel[90] = new ModelRendererTurbo(this, 321, 81, textureX, textureY); // Box 241
		bodyModel[91] = new ModelRendererTurbo(this, 1345, 81, textureX, textureY); // Box 242
		bodyModel[92] = new ModelRendererTurbo(this, 2041, 33, textureX, textureY); // Box 242
		bodyModel[93] = new ModelRendererTurbo(this, 1753, 105, textureX, textureY); // Box 254
		bodyModel[94] = new ModelRendererTurbo(this, 1809, 105, textureX, textureY); // Box 255
		bodyModel[95] = new ModelRendererTurbo(this, 1961, 105, textureX, textureY); // Box 256
		bodyModel[96] = new ModelRendererTurbo(this, 617, 33, textureX, textureY); // Box 465
		bodyModel[97] = new ModelRendererTurbo(this, 649, 33, textureX, textureY); // Box 466
		bodyModel[98] = new ModelRendererTurbo(this, 1465, 1, textureX, textureY); // Box 467
		bodyModel[99] = new ModelRendererTurbo(this, 2041, 1, textureX, textureY); // Box 468
		bodyModel[100] = new ModelRendererTurbo(this, 769, 9, textureX, textureY); // Box 469
		bodyModel[101] = new ModelRendererTurbo(this, 617, 17, textureX, textureY); // Box 470
		bodyModel[102] = new ModelRendererTurbo(this, 1737, 17, textureX, textureY); // Box 471
		bodyModel[103] = new ModelRendererTurbo(this, 1913, 17, textureX, textureY); // Box 472
		bodyModel[104] = new ModelRendererTurbo(this, 1841, 105, textureX, textureY); // Box 239
		bodyModel[105] = new ModelRendererTurbo(this, 921, 57, textureX, textureY); // Box 240
		bodyModel[106] = new ModelRendererTurbo(this, 457, 49, textureX, textureY); // Box 241
		bodyModel[107] = new ModelRendererTurbo(this, 937, 57, textureX, textureY); // Box 242
		bodyModel[108] = new ModelRendererTurbo(this, 1505, 65, textureX, textureY); // Box 243
		bodyModel[109] = new ModelRendererTurbo(this, 481, 105, textureX, textureY); // Box 244
		bodyModel[110] = new ModelRendererTurbo(this, 801, 57, textureX, textureY); // Box 245
		bodyModel[111] = new ModelRendererTurbo(this, 2009, 105, textureX, textureY); // Box 246
		bodyModel[112] = new ModelRendererTurbo(this, 721, 25, textureX, textureY); // Box 247
		bodyModel[113] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Box 248
		bodyModel[114] = new ModelRendererTurbo(this, 2033, 33, textureX, textureY); // Box 250
		bodyModel[115] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 251
		bodyModel[116] = new ModelRendererTurbo(this, 1409, 57, textureX, textureY); // Box 252
		bodyModel[117] = new ModelRendererTurbo(this, 1841, 65, textureX, textureY); // Box 253
		bodyModel[118] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 962
		bodyModel[119] = new ModelRendererTurbo(this, 761, 33, textureX, textureY); // Box 964
		bodyModel[120] = new ModelRendererTurbo(this, 1529, 33, textureX, textureY); // Box 966
		bodyModel[121] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 259
		bodyModel[122] = new ModelRendererTurbo(this, 569, 25, textureX, textureY); // Box 260
		bodyModel[123] = new ModelRendererTurbo(this, 841, 97, textureX, textureY); // Box 256
		bodyModel[124] = new ModelRendererTurbo(this, 657, 81, textureX, textureY); // Box 249
		bodyModel[125] = new ModelRendererTurbo(this, 1385, 81, textureX, textureY); // Box 254
		bodyModel[126] = new ModelRendererTurbo(this, 1585, 33, textureX, textureY); // Box 263
		bodyModel[127] = new ModelRendererTurbo(this, 1105, 1, textureX, textureY); // Box 264
		bodyModel[128] = new ModelRendererTurbo(this, 1553, 17, textureX, textureY); // Box 265
		bodyModel[129] = new ModelRendererTurbo(this, 1601, 1, textureX, textureY); // Box 266
		bodyModel[130] = new ModelRendererTurbo(this, 2017, 81, textureX, textureY); // Box 484
		bodyModel[131] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 485
		bodyModel[132] = new ModelRendererTurbo(this, 569, 41, textureX, textureY); // Box 487
		bodyModel[133] = new ModelRendererTurbo(this, 929, 81, textureX, textureY); // Box 488
		bodyModel[134] = new ModelRendererTurbo(this, 1697, 81, textureX, textureY); // Box 489
		bodyModel[135] = new ModelRendererTurbo(this, 777, 89, textureX, textureY); // Box 490
		bodyModel[136] = new ModelRendererTurbo(this, 1441, 41, textureX, textureY); // Box 491
		bodyModel[137] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 492
		bodyModel[138] = new ModelRendererTurbo(this, 1689, 105, textureX, textureY); // Box 493
		bodyModel[139] = new ModelRendererTurbo(this, 185, 81, textureX, textureY); // Box 494
		bodyModel[140] = new ModelRendererTurbo(this, 1633, 97, textureX, textureY); // Box 495
		bodyModel[141] = new ModelRendererTurbo(this, 577, 49, textureX, textureY); // Box 496
		bodyModel[142] = new ModelRendererTurbo(this, 721, 49, textureX, textureY); // Box 497
		bodyModel[143] = new ModelRendererTurbo(this, 1857, 49, textureX, textureY); // Box 498
		bodyModel[144] = new ModelRendererTurbo(this, 41, 89, textureX, textureY); // Box 499
		bodyModel[145] = new ModelRendererTurbo(this, 81, 89, textureX, textureY); // Box 578
		bodyModel[146] = new ModelRendererTurbo(this, 1529, 89, textureX, textureY); // Box 579
		bodyModel[147] = new ModelRendererTurbo(this, 249, 113, textureX, textureY); // Box 580
		bodyModel[148] = new ModelRendererTurbo(this, 273, 113, textureX, textureY); // Box 582
		bodyModel[149] = new ModelRendererTurbo(this, 241, 89, textureX, textureY); // Box 583
		bodyModel[150] = new ModelRendererTurbo(this, 961, 89, textureX, textureY); // Box 584
		bodyModel[151] = new ModelRendererTurbo(this, 1793, 105, textureX, textureY); // Box 585
		bodyModel[152] = new ModelRendererTurbo(this, 985, 89, textureX, textureY); // Box 586
		bodyModel[153] = new ModelRendererTurbo(this, 1177, 89, textureX, textureY); // Box 587
		bodyModel[154] = new ModelRendererTurbo(this, 321, 113, textureX, textureY); // Box 588
		bodyModel[155] = new ModelRendererTurbo(this, 385, 89, textureX, textureY); // Box 589
		bodyModel[156] = new ModelRendererTurbo(this, 1473, 89, textureX, textureY); // Box 590
		bodyModel[157] = new ModelRendererTurbo(this, 1641, 33, textureX, textureY); // Box 591
		bodyModel[158] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 592
		bodyModel[159] = new ModelRendererTurbo(this, 657, 41, textureX, textureY); // Box 593
		bodyModel[160] = new ModelRendererTurbo(this, 129, 105, textureX, textureY); // Box 594
		bodyModel[161] = new ModelRendererTurbo(this, 177, 121, textureX, textureY); // Box 323

		bodyModel[0].addShapeBox(0F, 0F, 0F, 44, 24, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-23F, -40F, -12F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 44, 24, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[1].setRotationPoint(21F, -40F, -12F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 38, 21, 12, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -2F, 0F, -6F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[2].setRotationPoint(65F, -40F, -12F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 19, 24, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[3].setRotationPoint(-42F, -40F, -12F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 44, 6, 4, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[4].setRotationPoint(-23F, -46F, -12F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 19, 6, 12, 0F,0F, -1F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[5].setRotationPoint(-42F, -46F, -12F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 44, 6, 4, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[6].setRotationPoint(21F, -46F, -12F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 38, 6, 12, 0F,0F, 0F, -3F, 0F, -1F, -5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[7].setRotationPoint(65F, -46F, -12F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 38, 3, 9, 0F,0F, 0F, -4F, 0F, -2F, -5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[8].setRotationPoint(65F, -49F, -9F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 44, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[9].setRotationPoint(-23F, -16F, -12F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 44, 4, 12, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -3F, -4F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[10].setRotationPoint(21F, -16F, -12F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 38, 4, 12, 0F,0F, 0F, 0F, 0F, 6F, -2F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -5F, -6F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[11].setRotationPoint(65F, -19F, -12F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 19, 3, 9, 0F,0F, -3.9999F, 0.9999F, 0F, 0F, -5.9999F, 0F, 0F, 0F, 0F, -3.9999F, 0F, 0F, 0.9999F, 0.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.9999F, 0F); // Box 25
		bodyModel[12].setRotationPoint(-42F, -49F, -9F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 19, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[13].setRotationPoint(-42F, -16F, -12F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 5, 3, 9, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[14].setRotationPoint(-23F, -49F, -9F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 3, 3, 7, 0F,0F, 0F, -6F, 0F, -1F, -2F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F); // Box 35
		bodyModel[15].setRotationPoint(-18F, -49F, -9F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 9, 2, 3, 0F,0F, 0F, -1.9999F, 0F, -1.9999F, 0F, 0F, -1.9999F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9999F, 0F, 0F, -1.9999F); // Box 36
		bodyModel[16].setRotationPoint(-15F, -48F, -9F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 8, 3, 5, 0F,-7.9999F, 0F, -3.9999F, 0F, 0F, -3.9999F, 0F, 0F, 0F, -7.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.9999F, 0F, 0F, -3.9999F); // Box 37
		bodyModel[17].setRotationPoint(57F, -49F, -9F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 19, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[18].setRotationPoint(-42F, -47F, -3F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 19, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[19].setRotationPoint(-42F, -48F, -3F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 13, 8, 9, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[20].setRotationPoint(9F, -54F, -9F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 13, 3, 6, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[21].setRotationPoint(9F, -57F, -6F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[22].setRotationPoint(-6F, -54F, -6F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -6F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -1F, 0F, 6F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, -1F); // Box 62
		bodyModel[23].setRotationPoint(-15F, -54F, -6F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[24].setRotationPoint(-11F, -54F, -6F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-4F, 0F, 0F, 3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[25].setRotationPoint(-15F, -54F, -6F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[26].setRotationPoint(-15F, -54F, -3F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F); // Box 66
		bodyModel[27].setRotationPoint(-15F, -54F, -3F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 67
		bodyModel[28].setRotationPoint(-6F, -54F, -6F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 68
		bodyModel[29].setRotationPoint(-6F, -57F, -6F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[30].setRotationPoint(-6F, -57F, -3F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 73
		bodyModel[31].setRotationPoint(31F, -57F, -6F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[32].setRotationPoint(31F, -57F, -3F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 75
		bodyModel[33].setRotationPoint(31F, -54F, -6F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 76
		bodyModel[34].setRotationPoint(41F, -57F, -6F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[35].setRotationPoint(41F, -57F, -3F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 78
		bodyModel[36].setRotationPoint(41F, -54F, -6F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[37].setRotationPoint(22F, -54F, -6F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[38].setRotationPoint(-9F, -57F, -3F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		bodyModel[39].setRotationPoint(-8F, -57F, -3F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 82
		bodyModel[40].setRotationPoint(-15F, -57F, -3F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 13, 30, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[41].setRotationPoint(9F, -46F, -8F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 32, 14, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		bodyModel[42].setRotationPoint(-23F, -30F, -11F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 43, 14, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[43].setRotationPoint(22F, -30F, -11F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 5, 16, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[44].setRotationPoint(-23F, -46F, -8F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 44, 24, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[45].setRotationPoint(-23F, -40F, 8F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 44, 24, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 124
		bodyModel[46].setRotationPoint(21F, -40F, 8F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 38, 21, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, -2F, 0F, 0F, 0F); // Box 125
		bodyModel[47].setRotationPoint(65F, -40F, 0F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 19, 24, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		bodyModel[48].setRotationPoint(-42F, -40F, 0F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 44, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[49].setRotationPoint(-23F, -46F, 8F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 19, 6, 12, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[50].setRotationPoint(-42F, -46F, 0F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 44, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[51].setRotationPoint(21F, -46F, 8F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 38, 6, 12, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 131
		bodyModel[52].setRotationPoint(65F, -46F, 0F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 38, 3, 9, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -2F, 0F, 0F, 0F); // Box 133
		bodyModel[53].setRotationPoint(65F, -49F, 0F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 44, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 135
		bodyModel[54].setRotationPoint(-23F, -16F, 0F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 44, 4, 12, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -4F, 0F, 0F, -4F); // Box 136
		bodyModel[55].setRotationPoint(21F, -16F, 0F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 38, 4, 12, 0F,0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, -6F, 0F, 0F, -4F); // Box 137
		bodyModel[56].setRotationPoint(65F, -19F, 0F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 19, 3, 9, 0F,0F, -3.9999F, 0F, 0F, 0F, 0F, 0F, 0F, -5.9999F, 0F, -3.9999F, 0.9999F, 0F, 0.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.9999F, 0.9999F); // Box 148
		bodyModel[57].setRotationPoint(-42F, -49F, 0F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 19, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 151
		bodyModel[58].setRotationPoint(-42F, -16F, 0F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 5, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[59].setRotationPoint(-23F, -49F, 0F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 3, 3, 7, 0F,0F, 0F, 0F, 0F, -1F, -4F, 0F, -1F, -2F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		bodyModel[60].setRotationPoint(-18F, -49F, 2F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 9, 2, 3, 0F,0F, 0F, 0F, 0F, -1.9999F, -1.9999F, 0F, -1.9999F, 0F, 0F, 0F, -1.9999F, 0F, 0F, -1.9999F, 0F, 0F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		bodyModel[61].setRotationPoint(-15F, -48F, 6F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 8, 3, 5, 0F,-7.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.9999F, -7.9999F, 0F, -3.9999F, 0F, 0F, -3.9999F, 0F, 0F, -3.9999F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		bodyModel[62].setRotationPoint(57F, -49F, 4F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 19, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[63].setRotationPoint(-42F, -47F, 2F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 19, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[64].setRotationPoint(-42F, -48F, 0F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 13, 8, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182
		bodyModel[65].setRotationPoint(9F, -54F, 0F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 13, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		bodyModel[66].setRotationPoint(9F, -57F, 0F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
		bodyModel[67].setRotationPoint(-6F, -54F, 5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -6F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 1F, 0F, 6F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 1F); // Box 185
		bodyModel[68].setRotationPoint(-15F, -54F, 5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		bodyModel[69].setRotationPoint(-11F, -54F, 5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, -1F, -4F, 0F, 0F); // Box 187
		bodyModel[70].setRotationPoint(-15F, -54F, 3F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[71].setRotationPoint(-15F, -54F, 0F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F); // Box 189
		bodyModel[72].setRotationPoint(-15F, -54F, 2F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 190
		bodyModel[73].setRotationPoint(-6F, -54F, 5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 191
		bodyModel[74].setRotationPoint(-6F, -57F, 2F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 192
		bodyModel[75].setRotationPoint(-6F, -57F, 0F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[76].setRotationPoint(31F, -57F, 2F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[77].setRotationPoint(31F, -57F, 0F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 195
		bodyModel[78].setRotationPoint(31F, -54F, 5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[79].setRotationPoint(41F, -57F, 2F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		bodyModel[80].setRotationPoint(41F, -57F, 0F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 198
		bodyModel[81].setRotationPoint(41F, -54F, 5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		bodyModel[82].setRotationPoint(22F, -54F, 5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
		bodyModel[83].setRotationPoint(-9F, -57F, 0F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
		bodyModel[84].setRotationPoint(-8F, -57F, 2F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 202
		bodyModel[85].setRotationPoint(-15F, -57F, 2F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 13, 30, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[86].setRotationPoint(9F, -46F, 0F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 32, 14, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		bodyModel[87].setRotationPoint(-23F, -30F, 0F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 43, 14, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 226
		bodyModel[88].setRotationPoint(22F, -30F, 0F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 5, 16, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 227
		bodyModel[89].setRotationPoint(-23F, -46F, 0F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		bodyModel[90].setRotationPoint(-5F, -57F, -0.5F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		bodyModel[91].setRotationPoint(22F, -57F, -0.5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 2, 27, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		bodyModel[92].setRotationPoint(-19.5F, -70F, 9F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 8, 10, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 254
		bodyModel[93].setRotationPoint(-23F, -40F, -8F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 7, 10, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 255
		bodyModel[94].setRotationPoint(-18F, -46F, -8F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 7, 3, 16, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 256
		bodyModel[95].setRotationPoint(-18F, -49F, -8F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 465
		bodyModel[96].setRotationPoint(-12.5F, -49.5F, -1F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, 0F); // Box 466
		bodyModel[97].setRotationPoint(-12.5F, -50F, -1F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 467
		bodyModel[98].setRotationPoint(-11F, -50.25F, -1F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 468
		bodyModel[99].setRotationPoint(-11F, -49.25F, -1F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.6F, -0.25F, 0F); // Box 469
		bodyModel[100].setRotationPoint(-11.1F, -48.75F, -1F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.7F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.5F, 0F, -0.7F, -0.5F, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 470
		bodyModel[101].setRotationPoint(-12.5F, -51F, -1F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.7F, -0.5F, -0.3F, -0.2F, -0.5F, -0.3F, -0.2F, -0.3F, 0F, -0.7F, -0.3F, 0F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 471
		bodyModel[102].setRotationPoint(-12.5F, -51F, 0F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.1F); // Box 472
		bodyModel[103].setRotationPoint(-10.7F, -50F, -1F);

		bodyModel[104].addShapeBox(0F, 1F, 0F, 10, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
		bodyModel[104].setRotationPoint(-3F, -34.5F, -5F);
		bodyModel[104].rotateAngleZ = -0.10471976F;

		bodyModel[105].addShapeBox(9F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		bodyModel[105].setRotationPoint(-3F, -34.5F, -5F);
		bodyModel[105].rotateAngleZ = -0.10471976F;

		bodyModel[106].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		bodyModel[106].setRotationPoint(-3F, -34.5F, -5F);
		bodyModel[106].rotateAngleZ = -0.10471976F;

		bodyModel[107].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		bodyModel[107].setRotationPoint(-3F, -34.5F, 4F);
		bodyModel[107].rotateAngleZ = -0.10471976F;

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		bodyModel[108].setRotationPoint(-3F, -34.5F, -5F);
		bodyModel[108].rotateAngleZ = -0.10471976F;

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 17, 10, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		bodyModel[109].setRotationPoint(6F, -50.5F, -5F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[110].setRotationPoint(8F, -54.5F, -3F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 17, 8, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 246
		bodyModel[111].setRotationPoint(5F, -49.5F, -4F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[112].setRotationPoint(4.7F, -49.8F, -2F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[113].setRotationPoint(4.7F, -49.8F, 1F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 2, 18, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[114].setRotationPoint(6F, -47.5F, -4F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 2, 18, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 251
		bodyModel[115].setRotationPoint(6F, -47.5F, 3F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[116].setRotationPoint(0F, -33.5F, -6F);
		bodyModel[116].rotateAngleZ = 0.78539816F;

		bodyModel[117].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 253
		bodyModel[117].setRotationPoint(0F, -33.5F, 5F);
		bodyModel[117].rotateAngleZ = 0.78539816F;

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 962
		bodyModel[118].setRotationPoint(7.5F, -54F, -1.5F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 964
		bodyModel[119].setRotationPoint(7.5F, -53F, -1.5F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 966
		bodyModel[120].setRotationPoint(7.5F, -52F, -1.5F);

		bodyModel[121].addShapeBox(0F, -3F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 259
		bodyModel[121].setRotationPoint(-15F, -30.5F, -6F);
		bodyModel[121].rotateAngleZ = 0.15707963F;

		bodyModel[122].addShapeBox(0F, -3F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
		bodyModel[122].setRotationPoint(-15F, -30.5F, 4F);
		bodyModel[122].rotateAngleZ = 0.15707963F;

		bodyModel[123].addShapeBox(0F, 0F, 0F, 7, 9, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 256
		bodyModel[123].setRotationPoint(-19F, -38.5F, -2F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 8, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[124].setRotationPoint(-11F, -31.5F, -2F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 254
		bodyModel[125].setRotationPoint(-11F, -32.5F, -1.5F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 263
		bodyModel[126].setRotationPoint(-8.5F, -35.5F, -1F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 264
		bodyModel[127].setRotationPoint(-8F, -39.5F, -0.5F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 265
		bodyModel[128].setRotationPoint(-8F, -41.5F, -0.5F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 266
		bodyModel[129].setRotationPoint(-7.7F, -41.6F, -0.5F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 12, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 484
		bodyModel[130].setRotationPoint(44F, -47.5F, -8F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 3, 5, 2, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 1F); // Box 485
		bodyModel[131].setRotationPoint(41F, -47.5F, -8F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 3, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, 1F, 0F, 0F, 0F); // Box 487
		bodyModel[132].setRotationPoint(56F, -47.5F, -8F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 2, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 488
		bodyModel[133].setRotationPoint(57F, -47.5F, -5F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 2, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 489
		bodyModel[134].setRotationPoint(41F, -47.5F, -5F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 12, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 490
		bodyModel[135].setRotationPoint(44F, -47.5F, 6F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 3, 5, 2, 0F,-2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 491
		bodyModel[136].setRotationPoint(41F, -47.5F, 6F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 3, 5, 2, 0F,0F, 0F, 0F, -2F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 492
		bodyModel[137].setRotationPoint(56F, -47.5F, 6F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 6, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 493
		bodyModel[138].setRotationPoint(59F, -46.5F, -4F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 494
		bodyModel[139].setRotationPoint(61F, -48.5F, -4F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 495
		bodyModel[140].setRotationPoint(61F, -49.5F, -4F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 496
		bodyModel[141].setRotationPoint(44F, -42.5F, -8F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 497
		bodyModel[142].setRotationPoint(44F, -42.5F, 7F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 498
		bodyModel[143].setRotationPoint(55F, -42.5F, 7F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 499
		bodyModel[144].setRotationPoint(55F, -42.5F, -8F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 2, 18, 1, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 578
		bodyModel[145].setRotationPoint(45F, -47.5F, 3F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 2, 18, 1, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 579
		bodyModel[146].setRotationPoint(45F, -47.5F, -4F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 15, 10, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 580
		bodyModel[147].setRotationPoint(46F, -50.5F, -5F);

		bodyModel[148].addShapeBox(0F, 1F, 0F, 10, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 582
		bodyModel[148].setRotationPoint(46F, -36.5F, -5F);
		bodyModel[148].rotateAngleZ = 0.08726646F;

		bodyModel[149].addShapeBox(-2F, 0.25F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 583
		bodyModel[149].setRotationPoint(48F, -36.5F, -5F);
		bodyModel[149].rotateAngleZ = 0.08726646F;

		bodyModel[150].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 584
		bodyModel[150].setRotationPoint(46F, -42.5F, -6F);
		bodyModel[150].rotateAngleZ = -0.78539816F;

		bodyModel[151].addShapeBox(0F, -0.3F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 585
		bodyModel[151].setRotationPoint(55F, -36.5F, -5F);
		bodyModel[151].rotateAngleZ = 0.12217305F;

		bodyModel[152].addShapeBox(-2F, 0.25F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 586
		bodyModel[152].setRotationPoint(48F, -36.5F, 4F);
		bodyModel[152].rotateAngleZ = 0.08726646F;

		bodyModel[153].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 587
		bodyModel[153].setRotationPoint(46F, -42.5F, 5F);
		bodyModel[153].rotateAngleZ = -0.78539816F;

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 15, 8, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 588
		bodyModel[154].setRotationPoint(47F, -49.5F, -4F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 589
		bodyModel[155].setRotationPoint(47.3F, -49.8F, 1F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 590
		bodyModel[156].setRotationPoint(47.3F, -49.8F, -2F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 591
		bodyModel[157].setRotationPoint(44.5F, -52F, -1.5F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 592
		bodyModel[158].setRotationPoint(44.5F, -53F, -1.5F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 593
		bodyModel[159].setRotationPoint(44.5F, -54F, -1.5F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 594
		bodyModel[160].setRotationPoint(44F, -54.5F, -3F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 19, 15, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 323
		bodyModel[161].setRotationPoint(22F, -45F, -8F);
	}

	private void initnoseModel_1()
	{
		noseModel[0] = new ModelRendererTurbo(this, 1417, 1, textureX, textureY); // Box 16
		noseModel[1] = new ModelRendererTurbo(this, 1481, 1, textureX, textureY); // Box 17
		noseModel[2] = new ModelRendererTurbo(this, 1521, 1, textureX, textureY); // Box 18
		noseModel[3] = new ModelRendererTurbo(this, 1553, 1, textureX, textureY); // Box 19
		noseModel[4] = new ModelRendererTurbo(this, 1601, 1, textureX, textureY); // Box 20
		noseModel[5] = new ModelRendererTurbo(this, 1649, 1, textureX, textureY); // Box 21
		noseModel[6] = new ModelRendererTurbo(this, 1105, 1, textureX, textureY); // Box 22
		noseModel[7] = new ModelRendererTurbo(this, 1225, 1, textureX, textureY); // Box 23
		noseModel[8] = new ModelRendererTurbo(this, 1465, 1, textureX, textureY); // Box 24
		noseModel[9] = new ModelRendererTurbo(this, 1761, 1, textureX, textureY); // Box 26
		noseModel[10] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 27
		noseModel[11] = new ModelRendererTurbo(this, 1857, 1, textureX, textureY); // Box 29
		noseModel[12] = new ModelRendererTurbo(this, 1745, 9, textureX, textureY); // Box 40
		noseModel[13] = new ModelRendererTurbo(this, 929, 17, textureX, textureY); // Box 41
		noseModel[14] = new ModelRendererTurbo(this, 1865, 25, textureX, textureY); // Box 56
		noseModel[15] = new ModelRendererTurbo(this, 1905, 25, textureX, textureY); // Box 57
		noseModel[16] = new ModelRendererTurbo(this, 1945, 25, textureX, textureY); // Box 58
		noseModel[17] = new ModelRendererTurbo(this, 793, 33, textureX, textureY); // Box 91
		noseModel[18] = new ModelRendererTurbo(this, 841, 33, textureX, textureY); // Box 92
		noseModel[19] = new ModelRendererTurbo(this, 929, 33, textureX, textureY); // Box 93
		noseModel[20] = new ModelRendererTurbo(this, 969, 33, textureX, textureY); // Box 94
		noseModel[21] = new ModelRendererTurbo(this, 1905, 1, textureX, textureY); // Import CO_51
		noseModel[22] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Import CO_52
		noseModel[23] = new ModelRendererTurbo(this, 1417, 1, textureX, textureY); // Import CO_53
		noseModel[24] = new ModelRendererTurbo(this, 281, 41, textureX, textureY); // Import CO_54
		noseModel[25] = new ModelRendererTurbo(this, 1545, 1, textureX, textureY); // Import CO_55
		noseModel[26] = new ModelRendererTurbo(this, 1273, 25, textureX, textureY); // Import CO_56
		noseModel[27] = new ModelRendererTurbo(this, 2025, 25, textureX, textureY); // Import CO_57
		noseModel[28] = new ModelRendererTurbo(this, 849, 41, textureX, textureY); // Import CO_58
		noseModel[29] = new ModelRendererTurbo(this, 1641, 1, textureX, textureY); // Import CO_59
		noseModel[30] = new ModelRendererTurbo(this, 1753, 1, textureX, textureY); // Import CO_60
		noseModel[31] = new ModelRendererTurbo(this, 1857, 1, textureX, textureY); // Import CO_61
		noseModel[32] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Import CO_62
		noseModel[33] = new ModelRendererTurbo(this, 777, 1, textureX, textureY); // Import CO_63
		noseModel[34] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Box 139
		noseModel[35] = new ModelRendererTurbo(this, 1273, 65, textureX, textureY); // Box 140
		noseModel[36] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 141
		noseModel[37] = new ModelRendererTurbo(this, 1729, 41, textureX, textureY); // Box 142
		noseModel[38] = new ModelRendererTurbo(this, 761, 49, textureX, textureY); // Box 143
		noseModel[39] = new ModelRendererTurbo(this, 1809, 49, textureX, textureY); // Box 144
		noseModel[40] = new ModelRendererTurbo(this, 1273, 33, textureX, textureY); // Box 145
		noseModel[41] = new ModelRendererTurbo(this, 1641, 49, textureX, textureY); // Box 146
		noseModel[42] = new ModelRendererTurbo(this, 905, 57, textureX, textureY); // Box 147
		noseModel[43] = new ModelRendererTurbo(this, 1169, 73, textureX, textureY); // Box 149
		noseModel[44] = new ModelRendererTurbo(this, 881, 33, textureX, textureY); // Box 150
		noseModel[45] = new ModelRendererTurbo(this, 193, 81, textureX, textureY); // Box 152
		noseModel[46] = new ModelRendererTurbo(this, 913, 73, textureX, textureY); // Box 163
		noseModel[47] = new ModelRendererTurbo(this, 1929, 73, textureX, textureY); // Box 164
		noseModel[48] = new ModelRendererTurbo(this, 1313, 81, textureX, textureY); // Box 179
		noseModel[49] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 180
		noseModel[50] = new ModelRendererTurbo(this, 905, 97, textureX, textureY); // Box 181
		noseModel[51] = new ModelRendererTurbo(this, 649, 105, textureX, textureY); // Box 211
		noseModel[52] = new ModelRendererTurbo(this, 1729, 57, textureX, textureY); // Box 212
		noseModel[53] = new ModelRendererTurbo(this, 665, 65, textureX, textureY); // Box 213
		noseModel[54] = new ModelRendererTurbo(this, 761, 65, textureX, textureY); // Box 214
		noseModel[55] = new ModelRendererTurbo(this, 1193, 41, textureX, textureY); // Box 228
		noseModel[56] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 229
		noseModel[57] = new ModelRendererTurbo(this, 1417, 9, textureX, textureY); // Box 230
		noseModel[58] = new ModelRendererTurbo(this, 1809, 65, textureX, textureY); // Box 231
		noseModel[59] = new ModelRendererTurbo(this, 1857, 9, textureX, textureY); // Box 232
		noseModel[60] = new ModelRendererTurbo(this, 1961, 41, textureX, textureY); // Box 233
		noseModel[61] = new ModelRendererTurbo(this, 289, 49, textureX, textureY); // Box 234
		noseModel[62] = new ModelRendererTurbo(this, 537, 73, textureX, textureY); // Box 235
		noseModel[63] = new ModelRendererTurbo(this, 953, 17, textureX, textureY); // Box 236
		noseModel[64] = new ModelRendererTurbo(this, 1137, 25, textureX, textureY); // Box 237
		noseModel[65] = new ModelRendererTurbo(this, 1809, 25, textureX, textureY); // Box 238
		noseModel[66] = new ModelRendererTurbo(this, 1857, 25, textureX, textureY); // Box 239
		noseModel[67] = new ModelRendererTurbo(this, 1785, 17, textureX, textureY); // Box 240

		noseModel[0].addShapeBox(0F, 0F, 0F, 16, 18, 12, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		noseModel[0].setRotationPoint(-58F, -40F, -12F);

		noseModel[1].addShapeBox(0F, 0F, 0F, 5, 18, 11, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		noseModel[1].setRotationPoint(-63F, -40F, -11F);

		noseModel[2].addShapeBox(0F, 0F, 0F, 3, 18, 9, 0F,0F, -6F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 18
		noseModel[2].setRotationPoint(-66F, -40F, -9F);

		noseModel[3].addShapeBox(0F, 0F, 0F, 16, 5, 6, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		noseModel[3].setRotationPoint(-58F, -45F, -6F);

		noseModel[4].addShapeBox(0F, 0F, 0F, 16, 5, 6, 0F,0F, -3F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		noseModel[4].setRotationPoint(-58F, -45F, -10F);

		noseModel[5].addShapeBox(0F, 0F, 0F, 16, 3, 6, 0F,0F, 0F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9999F, 0F, 0F, 0.9999F, 0F, -2.9999F, 0F, 0F, -2.9999F, 0F, 0F, 0F, 0F); // Box 21
		noseModel[5].setRotationPoint(-58F, -45F, -10F);

		noseModel[6].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		noseModel[6].setRotationPoint(-63F, -42F, -6F);

		noseModel[7].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F,0F, -1.9999F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9999F, -1.9999F, 0F, 0F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9999F); // Box 23
		noseModel[7].setRotationPoint(-63F, -42F, -11F);

		noseModel[8].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F,0F, -1.9999F, -1.9999F, 0F, 2.9999F, -2.9999F, 0F, 2.9999F, -1.9999F, 0F, -1.9999F, -1.9999F, 0F, 0F, -1.9999F, 0F, -1.9999F, 0F, 0F, -1.9999F, 0F, 0F, 0F, -1.9999F); // Box 24
		noseModel[8].setRotationPoint(-63F, -42F, -11F);

		noseModel[9].addShapeBox(0F, 0F, 0F, 16, 6, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		noseModel[9].setRotationPoint(-58F, -22F, -12F);

		noseModel[10].addShapeBox(0F, 0F, 0F, 5, 6, 3, 0F,0F, 0F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.9999F, 0F, -0.9999F, 0F, 0F, -0.9999F, 0F, 0F, 0F, -4.9999F, 0F, 0F); // Box 27
		noseModel[10].setRotationPoint(-63F, -22F, -11F);

		noseModel[11].addShapeBox(0F, 0F, 0F, 16, 4, 12, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 29
		noseModel[11].setRotationPoint(-58F, -16F, -12F);

		noseModel[12].addShapeBox(0F, 0F, 0F, 3, 6, 9, 0F,0F, -1.9999F, -4.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9999F, 0F, 0F, 0F, -0.9999F, 0F, -5.9999F, 0F, 0F, -5.9999F, 0F, 0F, 0F, 0F); // Box 40
		noseModel[12].setRotationPoint(-66F, -40F, -9F);

		noseModel[13].addShapeBox(0F, 0F, 0F, 3, 6, 9, 0F,0F, -0.9999F, -0.9999F, 0F, -5.9999F, 0F, 0F, -5.9999F, 0F, 0F, -0.9999F, 0F, 0F, -0.9999F, -4.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9999F, 0F); // Box 41
		noseModel[13].setRotationPoint(-66F, -28F, -9F);

		noseModel[14].addShapeBox(0F, 0F, 0F, 10, 7, 8, 0F,0F, -3F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 56
		noseModel[14].setRotationPoint(-76F, -34F, -8F);

		noseModel[15].addShapeBox(0F, 0F, 0F, 10, 4, 8, 0F,0F, -6F, -7F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 3F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 57
		noseModel[15].setRotationPoint(-76F, -38F, -8F);

		noseModel[16].addShapeBox(0F, 0F, 0F, 10, 4, 8, 0F,0F, 3F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -6F, -7F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -6F, 0F); // Box 58
		noseModel[16].setRotationPoint(-76F, -27F, -8F);

		noseModel[17].addShapeBox(0F, 0F, 0F, 17, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		noseModel[17].setRotationPoint(-59F, -19F, -8F);

		noseModel[18].addShapeBox(0F, 0F, 0F, 17, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		noseModel[18].setRotationPoint(-59F, -22F, -8F);

		noseModel[19].addShapeBox(0F, 0F, 0F, 17, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		noseModel[19].setRotationPoint(-59F, -22F, -5F);

		noseModel[20].addShapeBox(0F, 0F, 0F, 17, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		noseModel[20].setRotationPoint(-59F, -22F, -2F);

		noseModel[21].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F,-1F, -0.3F, -1.2F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 1.2F, -1F, 0F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.2F); // Import CO_51
		noseModel[21].setRotationPoint(-56F, -39.5F, -13F);

		noseModel[22].addShapeBox(0F, 0F, 0F, 13, 1, 2, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import CO_52
		noseModel[22].setRotationPoint(-47F, -39.5F, -13F);

		noseModel[23].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Import CO_53
		noseModel[23].setRotationPoint(-38.5F, -38.5F, -14F);

		noseModel[24].addShapeBox(0F, 0F, 0F, 13, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import CO_54
		noseModel[24].setRotationPoint(-47F, -38.5F, -12.5F);

		noseModel[25].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1.2F, 0F, 0F, -1.03333333F, 0F, 0F, 0.93333333F, 0F, 0F, 1.2F, -1F, 0F, -1.2F, 0F, 0F, -1.03333333F, 0F, 0F, 0.93333333F, 0F, 0F, 1.2F); // Import CO_55
		noseModel[25].setRotationPoint(-56F, -38.5F, -13F);

		noseModel[26].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F,-1F, 0F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.2F, -1F, 0F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.2F); // Import CO_56
		noseModel[26].setRotationPoint(-56F, -38.5F, -12.5F);

		noseModel[27].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F,-1F, 0F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.2F, -1F, -0.3F, -1.2F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 1.2F); // Import CO_57
		noseModel[27].setRotationPoint(-56F, -37.5F, -13F);

		noseModel[28].addShapeBox(0F, 0F, 0F, 13, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import CO_58
		noseModel[28].setRotationPoint(-47F, -37.5F, -13F);

		noseModel[29].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Import CO_59
		noseModel[29].setRotationPoint(-42F, -38.5F, -14F);

		noseModel[30].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Import CO_60
		noseModel[30].setRotationPoint(-45.5F, -38.5F, -14F);

		noseModel[31].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Import CO_61
		noseModel[31].setRotationPoint(-49F, -38.5F, -14F);

		noseModel[32].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Import CO_62
		noseModel[32].setRotationPoint(-52.5F, -38.5F, -13.8F);

		noseModel[33].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Import CO_63
		noseModel[33].setRotationPoint(-55F, -38.5F, -13.2F);

		noseModel[34].addShapeBox(0F, 0F, 0F, 16, 18, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 139
		noseModel[34].setRotationPoint(-58F, -40F, 0F);

		noseModel[35].addShapeBox(0F, 0F, 0F, 5, 18, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 140
		noseModel[35].setRotationPoint(-63F, -40F, 0F);

		noseModel[36].addShapeBox(0F, 0F, 0F, 3, 18, 9, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -1F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -1F); // Box 141
		noseModel[36].setRotationPoint(-66F, -40F, 0F);

		noseModel[37].addShapeBox(0F, 0F, 0F, 16, 5, 6, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		noseModel[37].setRotationPoint(-58F, -45F, 0F);

		noseModel[38].addShapeBox(0F, 0F, 0F, 16, 5, 6, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F); // Box 143
		noseModel[38].setRotationPoint(-58F, -45F, 4F);

		noseModel[39].addShapeBox(0F, 0F, 0F, 16, 3, 6, 0F,0F, 0F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9999F, 0F, 0F, 0F, 0F, -2.9999F, 0F, 0F, -2.9999F, 0F, 0F, 0F, 0.9999F); // Box 144
		noseModel[39].setRotationPoint(-58F, -45F, 4F);

		noseModel[40].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		noseModel[40].setRotationPoint(-63F, -42F, 0F);

		noseModel[41].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F,0F, -1.9999F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9999F, -1.9999F, 0F, 0F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9999F); // Box 146
		noseModel[41].setRotationPoint(-63F, -42F, 4F);

		noseModel[42].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F,0F, -1.9999F, -1.9999F, 0F, 2.9999F, -1.9999F, 0F, 2.9999F, -2.9999F, 0F, -1.9999F, -1.9999F, 0F, 0F, -1.9999F, 0F, -1.9999F, 0F, 0F, -1.9999F, 0F, 0F, 0F, -1.9999F); // Box 147
		noseModel[42].setRotationPoint(-63F, -42F, 4F);

		noseModel[43].addShapeBox(0F, 0F, 0F, 16, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 149
		noseModel[43].setRotationPoint(-58F, -22F, 8F);

		noseModel[44].addShapeBox(0F, 0F, 0F, 5, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9999F, -4.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9999F, -4.9999F, 0F, -0.9999F); // Box 150
		noseModel[44].setRotationPoint(-63F, -22F, 8F);

		noseModel[45].addShapeBox(0F, 0F, 0F, 16, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -3F, -4F); // Box 152
		noseModel[45].setRotationPoint(-58F, -16F, 0F);

		noseModel[46].addShapeBox(0F, 0F, 0F, 3, 6, 9, 0F,0F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9999F, -4.9999F, 0F, 0F, 0F, 0F, -5.9999F, 0F, 0F, -5.9999F, 0F, 0F, 0F, -0.9999F); // Box 163
		noseModel[46].setRotationPoint(-66F, -40F, 0F);

		noseModel[47].addShapeBox(0F, 0F, 0F, 3, 6, 9, 0F,0F, -0.9999F, 0F, 0F, -5.9999F, 0F, 0F, -5.9999F, 0F, 0F, -0.9999F, -0.9999F, 0F, -0.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9999F, -4.9999F); // Box 164
		noseModel[47].setRotationPoint(-66F, -28F, 0F);

		noseModel[48].addShapeBox(0F, 0F, 0F, 10, 7, 8, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -6F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -6F); // Box 179
		noseModel[48].setRotationPoint(-76F, -34F, 0F);

		noseModel[49].addShapeBox(0F, 0F, 0F, 10, 4, 8, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -6F, -7F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -6F); // Box 180
		noseModel[49].setRotationPoint(-76F, -38F, 0F);

		noseModel[50].addShapeBox(0F, 0F, 0F, 10, 4, 8, 0F,0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -6F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -6F, -7F); // Box 181
		noseModel[50].setRotationPoint(-76F, -27F, 0F);

		noseModel[51].addShapeBox(0F, 0F, 0F, 17, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
		noseModel[51].setRotationPoint(-59F, -19F, 0F);

		noseModel[52].addShapeBox(0F, 0F, 0F, 17, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 212
		noseModel[52].setRotationPoint(-59F, -22F, 7F);

		noseModel[53].addShapeBox(0F, 0F, 0F, 17, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 213
		noseModel[53].setRotationPoint(-59F, -22F, 4F);

		noseModel[54].addShapeBox(0F, 0F, 0F, 17, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 214
		noseModel[54].setRotationPoint(-59F, -22F, 1F);

		noseModel[55].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F,0F, 0F, 1.2F, 0F, 0F, 0F, 0F, -0.3F, 0F, -1F, -0.3F, -1.2F, 0F, 0F, 1.2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.2F); // Box 228
		noseModel[55].setRotationPoint(-56F, -39.5F, 11F);

		noseModel[56].addShapeBox(0F, 0F, 0F, 13, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 229
		noseModel[56].setRotationPoint(-47F, -39.5F, 11F);

		noseModel[57].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 230
		noseModel[57].setRotationPoint(-38.5F, -38.5F, 13F);

		noseModel[58].addShapeBox(0F, 0F, 0F, 13, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 231
		noseModel[58].setRotationPoint(-47F, -38.5F, 10.5F);

		noseModel[59].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 1.2F, 0F, 0F, 0.93333333F, 0F, 0F, -1.03333333F, -1F, 0F, -1.2F, 0F, 0F, 1.2F, 0F, 0F, 0.93333333F, 0F, 0F, -1.03333333F, -1F, 0F, -1.2F); // Box 232
		noseModel[59].setRotationPoint(-56F, -38.5F, 11F);

		noseModel[60].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F,0F, 0F, 1.2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.2F, 0F, 0F, 1.2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.2F); // Box 233
		noseModel[60].setRotationPoint(-56F, -38.5F, 10.5F);

		noseModel[61].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F,0F, 0F, 1.2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.2F, 0F, 0F, 1.2F, 0F, 0F, 0F, 0F, -0.3F, 0F, -1F, -0.3F, -1.2F); // Box 234
		noseModel[61].setRotationPoint(-56F, -37.5F, 11F);

		noseModel[62].addShapeBox(0F, 0F, 0F, 13, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 235
		noseModel[62].setRotationPoint(-47F, -37.5F, 11F);

		noseModel[63].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 236
		noseModel[63].setRotationPoint(-42F, -38.5F, 13F);

		noseModel[64].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 237
		noseModel[64].setRotationPoint(-45.5F, -38.5F, 13F);

		noseModel[65].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 238
		noseModel[65].setRotationPoint(-49F, -38.5F, 13F);

		noseModel[66].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 239
		noseModel[66].setRotationPoint(-52.5F, -38.5F, 12.8F);

		noseModel[67].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 240
		noseModel[67].setRotationPoint(-55F, -38.5F, 12.2F);
	}

	private void inittailModel_1()
	{
		tailModel[0] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 3
		tailModel[1] = new ModelRendererTurbo(this, 777, 1, textureX, textureY); // Box 9
		tailModel[2] = new ModelRendererTurbo(this, 945, 1, textureX, textureY); // Box 11
		tailModel[3] = new ModelRendererTurbo(this, 1345, 1, textureX, textureY); // Box 15
		tailModel[4] = new ModelRendererTurbo(this, 1921, 1, textureX, textureY); // Box 30
		tailModel[5] = new ModelRendererTurbo(this, 769, 17, textureX, textureY); // Box 31
		tailModel[6] = new ModelRendererTurbo(this, 1553, 17, textureX, textureY); // Box 32
		tailModel[7] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 33
		tailModel[8] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 44
		tailModel[9] = new ModelRendererTurbo(this, 1185, 25, textureX, textureY); // Box 46
		tailModel[10] = new ModelRendererTurbo(this, 1409, 33, textureX, textureY); // Box 48
		tailModel[11] = new ModelRendererTurbo(this, 617, 33, textureX, textureY); // Box 49
		tailModel[12] = new ModelRendererTurbo(this, 761, 33, textureX, textureY); // Box 50
		tailModel[13] = new ModelRendererTurbo(this, 1529, 49, textureX, textureY); // Box 126
		tailModel[14] = new ModelRendererTurbo(this, 1969, 49, textureX, textureY); // Box 132
		tailModel[15] = new ModelRendererTurbo(this, 1073, 57, textureX, textureY); // Box 134
		tailModel[16] = new ModelRendererTurbo(this, 249, 73, textureX, textureY); // Box 138
		tailModel[17] = new ModelRendererTurbo(this, 257, 89, textureX, textureY); // Box 153
		tailModel[18] = new ModelRendererTurbo(this, 521, 89, textureX, textureY); // Box 154
		tailModel[19] = new ModelRendererTurbo(this, 649, 89, textureX, textureY); // Box 155
		tailModel[20] = new ModelRendererTurbo(this, 1345, 89, textureX, textureY); // Box 156
		tailModel[21] = new ModelRendererTurbo(this, 553, 105, textureX, textureY); // Box 204
		tailModel[22] = new ModelRendererTurbo(this, 505, 73, textureX, textureY); // Box 206
		tailModel[23] = new ModelRendererTurbo(this, 897, 105, textureX, textureY); // Box 208
		tailModel[24] = new ModelRendererTurbo(this, 2009, 89, textureX, textureY); // Box 209
		tailModel[25] = new ModelRendererTurbo(this, 217, 105, textureX, textureY); // Box 210
		tailModel[26] = new ModelRendererTurbo(this, 993, 145, textureX, textureY); // Box 243

		tailModel[0].addShapeBox(0F, 0F, 0F, 24, 15, 10, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -2F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 3
		tailModel[0].setRotationPoint(103F, -40F, -10F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 24, 5, 10, 0F,0F, 0F, -3F, 0F, -2F, -4F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		tailModel[1].setRotationPoint(103F, -45F, -10F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 24, 2, 7, 0F,0F, 0F, -3F, 0F, -2F, -4F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 11
		tailModel[2].setRotationPoint(103F, -47F, -7F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 24, 5, 10, 0F,0F, 0F, 0F, 0F, 4F, -2F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -4F, -6F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 15
		tailModel[3].setRotationPoint(103F, -25F, -10F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 55, 11, 8, 0F,0F, 0F, 0F, 0F, -3F, -7F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, -7F, 0F, -7F, 0F, 0F, 0F, 0F); // Box 30
		tailModel[4].setRotationPoint(127F, -40F, -8F);

		tailModel[5].addShapeBox(0F, 0F, 0F, 55, 3, 8, 0F,0F, 0F, -1.9999F, 0F, -5.9999F, -6.9999F, 0F, -5.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.9999F, -6.9999F, 0F, 2.9999F, 0F, 0F, 0F, 0F); // Box 31
		tailModel[5].setRotationPoint(127F, -43F, -8F);

		tailModel[6].addShapeBox(0F, 0F, 0F, 55, 2, 6, 0F,0F, 0F, -3F, 0F, -7.5F, -5.5F, 0F, -7.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, -5F, 0F, 6F, 0F, 0F, 0F, 0F); // Box 32
		tailModel[6].setRotationPoint(127F, -45F, -6F);

		tailModel[7].addShapeBox(0F, 0F, 0F, 55, 5, 8, 0F,0F, 0F, 0F, 0F, 7F, -7F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -11.5F, -7.5F, 0F, -11.5F, 0F, 0F, 0F, 0F); // Box 33
		tailModel[7].setRotationPoint(127F, -29F, -8F);

		tailModel[8].addShapeBox(0F, 0F, 0F, 26, 40, 2, 0F,-17F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F); // Box 44
		tailModel[8].setRotationPoint(125F, -78F, -2F);

		tailModel[9].addShapeBox(0F, 0F, 0F, 11, 6, 2, 0F,-5F, -3F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, -3F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		tailModel[9].setRotationPoint(140F, -84F, -2F);

		tailModel[10].addShapeBox(0F, 0F, 0F, 24, 4, 45, 0F,-14F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -14F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 48
		tailModel[10].setRotationPoint(133F, -40F, -46F);

		tailModel[11].addShapeBox(0F, 0F, 0F, 9, 4, 10, 0F,0F, -2F, 0F, -3F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 49
		tailModel[11].setRotationPoint(157F, -40F, -56F);

		tailModel[12].addShapeBox(0F, 0F, 0F, 10, 4, 10, 0F,-3F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 50
		tailModel[12].setRotationPoint(147F, -40F, -56F);

		tailModel[13].addShapeBox(0F, 0F, 0F, 24, 15, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, -2F, 0F, 0F, 0F); // Box 126
		tailModel[13].setRotationPoint(103F, -40F, 0F);

		tailModel[14].addShapeBox(0F, 0F, 0F, 24, 5, 10, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 132
		tailModel[14].setRotationPoint(103F, -45F, 0F);

		tailModel[15].addShapeBox(0F, 0F, 0F, 24, 2, 7, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -1F, 0F, 0F, 0F); // Box 134
		tailModel[15].setRotationPoint(103F, -47F, 0F);

		tailModel[16].addShapeBox(0F, 0F, 0F, 24, 5, 10, 0F,0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, -6F, 0F, 0F, -4F); // Box 138
		tailModel[16].setRotationPoint(103F, -25F, 0F);

		tailModel[17].addShapeBox(0F, 0F, 0F, 55, 11, 8, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, -7F, 0F, 0F, 0F); // Box 153
		tailModel[17].setRotationPoint(127F, -40F, 0F);

		tailModel[18].addShapeBox(0F, 0F, 0F, 55, 3, 8, 0F,0F, 0F, 0F, 0F, -5.9999F, 0F, 0F, -5.9999F, -6.9999F, 0F, 0F, -1.9999F, 0F, 0F, 0F, 0F, 2.9999F, 0F, 0F, 2.9999F, -6.9999F, 0F, 0F, 0F); // Box 154
		tailModel[18].setRotationPoint(127F, -43F, 0F);

		tailModel[19].addShapeBox(0F, 0F, 0F, 55, 2, 6, 0F,0F, 0F, 0F, 0F, -7.5F, 0F, 0F, -7.5F, -5.5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, -5F, 0F, 0F, 0F); // Box 155
		tailModel[19].setRotationPoint(127F, -45F, 0F);

		tailModel[20].addShapeBox(0F, 0F, 0F, 55, 5, 8, 0F,0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11.5F, 0F, 0F, -11.5F, -7.5F, 0F, 0F, -4F); // Box 156
		tailModel[20].setRotationPoint(127F, -29F, 0F);

		tailModel[21].addShapeBox(0F, 0F, 0F, 26, 40, 2, 0F,-15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -17F, 0F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F); // Box 204
		tailModel[21].setRotationPoint(125F, -78F, 0F);

		tailModel[22].addShapeBox(0F, 0F, 0F, 11, 6, 2, 0F,-3F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 206
		tailModel[22].setRotationPoint(140F, -84F, 0F);

		tailModel[23].addShapeBox(0F, 0F, 0F, 24, 4, 45, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, -1F, 0F); // Box 208
		tailModel[23].setRotationPoint(133F, -40F, 1F);

		tailModel[24].addShapeBox(0F, 0F, 0F, 9, 4, 10, 0F,0F, 0F, 0F, 0F, -2F, 0F, -3F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, -1F, -2F, 0F, -1F, 0F); // Box 209
		tailModel[24].setRotationPoint(157F, -40F, 46F);

		tailModel[25].addShapeBox(0F, 0F, 0F, 10, 4, 10, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, -2F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, -1F, -2F); // Box 210
		tailModel[25].setRotationPoint(147F, -40F, 46F);

		tailModel[26].addShapeBox(0F, 0F, 0F, 160, 1, 1, 0F,-0.5F, -11F, -0.5F, 0F, -4F, 9F, 0F, -4F, -9F, -0.5F, -11F, 0.5F, -0.5F, 11F, -0.5F, 0F, 4F, 9F, 0F, 4F, -9F, -0.5F, 11F, 0.5F); // Box 243
		tailModel[26].setRotationPoint(-18.5F, -81F, 8.5F);
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 1297, 17, textureX, textureY); // Box 42
		leftWingModel[1] = new ModelRendererTurbo(this, 1633, 17, textureX, textureY); // Box 43
		leftWingModel[2] = new ModelRendererTurbo(this, 665, 25, textureX, textureY); // Box 44
		leftWingModel[3] = new ModelRendererTurbo(this, 961, 17, textureX, textureY); // Box 45
		leftWingModel[4] = new ModelRendererTurbo(this, 681, 25, textureX, textureY); // Box 46
		leftWingModel[5] = new ModelRendererTurbo(this, 937, 25, textureX, textureY); // Box 47
		leftWingModel[6] = new ModelRendererTurbo(this, 1705, 25, textureX, textureY); // Box 49
		leftWingModel[7] = new ModelRendererTurbo(this, 1073, 25, textureX, textureY); // Box 50
		leftWingModel[8] = new ModelRendererTurbo(this, 873, 25, textureX, textureY); // Box 51
		leftWingModel[9] = new ModelRendererTurbo(this, 1273, 25, textureX, textureY); // Box 52
		leftWingModel[10] = new ModelRendererTurbo(this, 1137, 25, textureX, textureY); // Box 53
		leftWingModel[11] = new ModelRendererTurbo(this, 1809, 25, textureX, textureY); // Box 54
		leftWingModel[12] = new ModelRendererTurbo(this, 1729, 25, textureX, textureY); // Box 55
		leftWingModel[13] = new ModelRendererTurbo(this, 649, 121, textureX, textureY); // Box 0
		leftWingModel[14] = new ModelRendererTurbo(this, 993, 121, textureX, textureY); // Box 1
		leftWingModel[15] = new ModelRendererTurbo(this, 337, 113, textureX, textureY); // Core_001
		leftWingModel[16] = new ModelRendererTurbo(this, 841, 113, textureX, textureY); // Core_001
		leftWingModel[17] = new ModelRendererTurbo(this, 641, 17, textureX, textureY); // Core_001
		leftWingModel[18] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Core_001
		leftWingModel[19] = new ModelRendererTurbo(this, 1137, 33, textureX, textureY); // Core_001
		leftWingModel[20] = new ModelRendererTurbo(this, 1665, 49, textureX, textureY); // Core_001
		leftWingModel[21] = new ModelRendererTurbo(this, 1729, 33, textureX, textureY); // Core_001
		leftWingModel[22] = new ModelRendererTurbo(this, 1969, 49, textureX, textureY); // Core_001
		leftWingModel[23] = new ModelRendererTurbo(this, 1321, 57, textureX, textureY); // Core_001
		leftWingModel[24] = new ModelRendererTurbo(this, 1625, 57, textureX, textureY); // Core_001
		leftWingModel[25] = new ModelRendererTurbo(this, 1809, 33, textureX, textureY); // Core_001
		leftWingModel[26] = new ModelRendererTurbo(this, 617, 65, textureX, textureY); // Core_001
		leftWingModel[27] = new ModelRendererTurbo(this, 1665, 57, textureX, textureY); // Core_001
		leftWingModel[28] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Core_001
		leftWingModel[29] = new ModelRendererTurbo(this, 705, 65, textureX, textureY); // Core_001
		leftWingModel[30] = new ModelRendererTurbo(this, 1529, 113, textureX, textureY); // Box 16
		leftWingModel[31] = new ModelRendererTurbo(this, 345, 121, textureX, textureY); // Box 17
		leftWingModel[32] = new ModelRendererTurbo(this, 1137, 65, textureX, textureY); // Box 18
		leftWingModel[33] = new ModelRendererTurbo(this, 353, 81, textureX, textureY); // Box 19
		leftWingModel[34] = new ModelRendererTurbo(this, 905, 113, textureX, textureY); // Box 22
		leftWingModel[35] = new ModelRendererTurbo(this, 1105, 121, textureX, textureY); // Box 24
		leftWingModel[36] = new ModelRendererTurbo(this, 1137, 121, textureX, textureY); // Box 25
		leftWingModel[37] = new ModelRendererTurbo(this, 1169, 121, textureX, textureY); // Box 324
		leftWingModel[38] = new ModelRendererTurbo(this, 1633, 113, textureX, textureY); // Box 325
		leftWingModel[39] = new ModelRendererTurbo(this, 1673, 17, textureX, textureY); // Box 326
		leftWingModel[40] = new ModelRendererTurbo(this, 1273, 65, textureX, textureY); // Box 327
		leftWingModel[41] = new ModelRendererTurbo(this, 1505, 65, textureX, textureY); // Box 328
		leftWingModel[42] = new ModelRendererTurbo(this, 569, 73, textureX, textureY); // Box 329
		leftWingModel[43] = new ModelRendererTurbo(this, 929, 73, textureX, textureY); // Box 330
		leftWingModel[44] = new ModelRendererTurbo(this, 913, 73, textureX, textureY); // Box 331
		leftWingModel[45] = new ModelRendererTurbo(this, 1073, 73, textureX, textureY); // Box 332
		leftWingModel[46] = new ModelRendererTurbo(this, 1809, 73, textureX, textureY); // Box 333
		leftWingModel[47] = new ModelRendererTurbo(this, 1073, 81, textureX, textureY); // Box 334
		leftWingModel[48] = new ModelRendererTurbo(this, 641, 89, textureX, textureY); // Box 335
		leftWingModel[49] = new ModelRendererTurbo(this, 913, 89, textureX, textureY); // Box 336
		leftWingModel[50] = new ModelRendererTurbo(this, 1585, 81, textureX, textureY); // Box 337
		leftWingModel[51] = new ModelRendererTurbo(this, 1201, 89, textureX, textureY); // Box 338
		leftWingModel[52] = new ModelRendererTurbo(this, 129, 129, textureX, textureY); // Box 339
		leftWingModel[53] = new ModelRendererTurbo(this, 273, 129, textureX, textureY); // Box 340
		leftWingModel[54] = new ModelRendererTurbo(this, 1745, 105, textureX, textureY); // Box 341
		leftWingModel[55] = new ModelRendererTurbo(this, 1993, 105, textureX, textureY); // Box 342
		leftWingModel[56] = new ModelRendererTurbo(this, 705, 129, textureX, textureY); // Box 343
		leftWingModel[57] = new ModelRendererTurbo(this, 737, 129, textureX, textureY); // Box 344
		leftWingModel[58] = new ModelRendererTurbo(this, 841, 129, textureX, textureY); // Box 345
		leftWingModel[59] = new ModelRendererTurbo(this, 873, 129, textureX, textureY); // Box 346
		leftWingModel[60] = new ModelRendererTurbo(this, 1049, 129, textureX, textureY); // Box 347

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 31, 12, 45, 0F,0F, 0F, 0F, -3F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		leftWingModel[0].setRotationPoint(-2F, -31F, -57F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 25, 10, 45, 0F,0F, 0F, 0F, -8F, -3F, 0F, -1F, -5F, -6F, -3F, 0F, 0F, 0F, -3F, 0F, -8F, -6F, 0F, -1F, -4F, -6F, -3F, 0F, 0F); // Box 43
		leftWingModel[1].setRotationPoint(26F, -29F, -57F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 21, 10, 6, 0F,0F, 0F, -5.9999F, 0F, -4.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.9999F, 0F, -3.9999F, 0F, 0F, -2.9999F, 0F, 0F, 0F, 0F); // Box 44
		leftWingModel[2].setRotationPoint(29F, -29F, -18F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 15, 7, 6, 0F,0F, -4.9999F, 0F, 0F, -2.9999F, -5.9999F, 0F, -2.9999F, 0F, 0F, 0F, 0F, 0F, -0.9999F, 0F, 0F, -2.9999F, -5.9999F, 0F, -2.9999F, 0F, 0F, 0F, 0F); // Box 45
		leftWingModel[3].setRotationPoint(50F, -29F, -18F);

		leftWingModel[4].addShapeBox(0F, 0F, 0F, 17, 12, 45, 0F,-3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -3F, -6F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 46
		leftWingModel[4].setRotationPoint(-19F, -31F, -57F);

		leftWingModel[5].addShapeBox(0F, 0F, 0F, 28, 5, 72, 0F,0F, 0F, 0F, -10F, -1F, 0F, 0F, -6F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F); // Box 47
		leftWingModel[5].setRotationPoint(-2F, -35F, -129F);

		leftWingModel[6].addShapeBox(0F, 0F, 0F, 14, 5, 72, 0F,-6F, -1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -7F, 0F, -6F, -1F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 5F, 0F); // Box 49
		leftWingModel[6].setRotationPoint(-16F, -35F, -129F);

		leftWingModel[7].addShapeBox(0F, 0F, 0F, 18, 5, 25, 0F,-2F, 0F, 0F, -2F, -1F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 50
		leftWingModel[7].setRotationPoint(-2F, -37F, -154F);

		leftWingModel[8].addShapeBox(0F, 0F, 0F, 15, 5, 25, 0F,2F, 0F, 0F, -6F, -1F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 2F, -2F, 0F, -6F, -3F, 0F, 0F, -1F, 0F, 0F, 1F, 0F); // Box 51
		leftWingModel[8].setRotationPoint(16F, -36F, -154F);

		leftWingModel[9].addShapeBox(0F, 0F, 0F, 5, 5, 25, 0F,0F, -1F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, 5F, -3F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, -2F, 2F, 0F, 5F, 1F, 0F); // Box 52
		leftWingModel[9].setRotationPoint(-5F, -37F, -154F);

		leftWingModel[10].addShapeBox(0F, 0F, 0F, 14, 4, 12, 0F,-2F, -1F, -2F, -8F, -1F, 0F, -11F, 0F, 0F, 2F, -1F, 0F, -2F, -2F, -2F, -8F, -2F, 0F, -11F, 0F, 0F, 2F, -1F, 0F); // Box 53
		leftWingModel[10].setRotationPoint(-3F, -37F, -166F);

		leftWingModel[11].addShapeBox(0F, 0F, 0F, 14, 4, 12, 0F,-3F, -1F, 0F, -6F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, -6F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		leftWingModel[11].setRotationPoint(0F, -37F, -166F);

		leftWingModel[12].addShapeBox(0F, 0F, 0F, 11, 3, 12, 0F,6F, 0F, 0F, -9F, -0.5F, -4F, 0F, -1F, 0F, 0F, 0F, 0F, 6F, -2F, 0F, -9F, -1.5F, -4F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 55
		leftWingModel[12].setRotationPoint(14F, -36F, -166F);

		leftWingModel[13].addShapeBox(0F, 0F, 0F, 26, 7, 1, 0F,-5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		leftWingModel[13].setRotationPoint(-9F, -22F, -19F);

		leftWingModel[14].addShapeBox(0F, 0F, 0F, 26, 7, 1, 0F,-3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F); // Box 1
		leftWingModel[14].setRotationPoint(-9F, -22F, -18F);

		leftWingModel[15].addShapeBox(0F, 0F, 0F, 15, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core_001
		leftWingModel[15].setRotationPoint(-5F, -14.5F, -20.5F);

		leftWingModel[16].addShapeBox(0F, 0F, 0F, 5, 3, 5, 0F,0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F); // Core_001
		leftWingModel[16].setRotationPoint(-10F, -13.5F, -20.5F);

		leftWingModel[17].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Core_001
		leftWingModel[17].setRotationPoint(-10.5F, -12.5F, -18.5F);

		leftWingModel[18].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Core_001
		leftWingModel[18].setRotationPoint(16F, -15F, -18.5F);

		leftWingModel[19].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F); // Core_001
		leftWingModel[19].setRotationPoint(19F, -15F, -18.5F);

		leftWingModel[20].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -2F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -2F, -0.4F, 0F); // Core_001
		leftWingModel[20].setRotationPoint(16F, -12.5F, -18F);

		leftWingModel[21].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Core_001
		leftWingModel[21].setRotationPoint(19F, -12.5F, -17F);

		leftWingModel[22].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.3F, -1.9F, 0F, -0.3F, -1.9F, 0F, -0.1F, -1.5F, 0F, -0.1F, -1.5F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F); // Core_001
		leftWingModel[22].setRotationPoint(20F, -14F, -18F);

		leftWingModel[23].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -1.5F, 0F, -0.1F, -1.5F, 0F, -0.3F, -1.9F, 0F, -0.3F, -1.9F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F); // Core_001
		leftWingModel[23].setRotationPoint(20F, -12F, -20F);

		leftWingModel[24].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.1F, -1.5F, 0F, -0.1F, -1.5F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.3F, -1.9F, 0F, -0.3F, -1.9F); // Core_001
		leftWingModel[24].setRotationPoint(20F, -12F, -18F);

		leftWingModel[25].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Core_001
		leftWingModel[25].setRotationPoint(19F, -11F, -18.5F);

		leftWingModel[26].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -2F, 0F, -0.4F); // Core_001
		leftWingModel[26].setRotationPoint(16F, -12F, -18.5F);

		leftWingModel[27].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-2F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -2F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Core_001
		leftWingModel[27].setRotationPoint(16F, -12.5F, -21F);

		leftWingModel[28].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F); // Core_001
		leftWingModel[28].setRotationPoint(19F, -12.5F, -21F);

		leftWingModel[29].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.3F, -1.9F, 0F, -0.3F, -1.9F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -1.5F, 0F, -0.1F, -1.5F); // Core_001
		leftWingModel[29].setRotationPoint(20F, -14F, -20F);

		leftWingModel[30].addBox(0F, 0F, 0F, 15, 3, 5, 0F); // Box 16
		leftWingModel[30].setRotationPoint(-5F, -13.5F, -20.5F);

		leftWingModel[31].addShapeBox(0F, 0F, 0F, 15, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 17
		leftWingModel[31].setRotationPoint(-5F, -10.5F, -20.5F);

		leftWingModel[32].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, -1.75F, -2.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1.75F, -2.25F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F); // Box 18
		leftWingModel[32].setRotationPoint(-10F, -14.5F, -20.5F);

		leftWingModel[33].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, -1.75F, -2.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1.75F, -2.25F); // Box 19
		leftWingModel[33].setRotationPoint(-10F, -10.5F, -20.5F);

		leftWingModel[34].addShapeBox(0F, 0F, 0F, 10, 3, 5, 0F,0F, 0F, 0F, 0F, -1.25F, -2F, 0F, -1.25F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, -2F, 0F, -1.25F, -2F, 0F, 0F, 0F); // Box 22
		leftWingModel[34].setRotationPoint(10F, -13.5F, -20.5F);

		leftWingModel[35].addShapeBox(0F, 0F, 0F, 10, 1, 5, 0F,0F, 0F, -1F, 0F, -2F, -2.25F, 0F, -2F, -2.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1.25F, -2F, 0F, 1.25F, -2F, 0F, 0F, 0F); // Box 24
		leftWingModel[35].setRotationPoint(10F, -14.5F, -20.5F);

		leftWingModel[36].addShapeBox(0F, 0F, 0F, 10, 1, 5, 0F,0F, 0F, 0F, 0F, 1.25F, -2F, 0F, 1.25F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -2.25F, 0F, -2F, -2.25F, 0F, 0F, -1F); // Box 25
		leftWingModel[36].setRotationPoint(10F, -10.5F, -20.5F);

		leftWingModel[37].addShapeBox(0F, 0F, 0F, 15, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324
		leftWingModel[37].setRotationPoint(-5F, -14.5F, -27.5F);

		leftWingModel[38].addShapeBox(0F, 0F, 0F, 5, 3, 5, 0F,0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F); // Box 325
		leftWingModel[38].setRotationPoint(-10F, -13.5F, -27.5F);

		leftWingModel[39].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 326
		leftWingModel[39].setRotationPoint(-10.5F, -12.5F, -25.5F);

		leftWingModel[40].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 327
		leftWingModel[40].setRotationPoint(16F, -15F, -25.5F);

		leftWingModel[41].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F); // Box 328
		leftWingModel[41].setRotationPoint(19F, -15F, -25.5F);

		leftWingModel[42].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -2F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -2F, -0.4F, 0F); // Box 329
		leftWingModel[42].setRotationPoint(16F, -12.5F, -25F);

		leftWingModel[43].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 330
		leftWingModel[43].setRotationPoint(19F, -12.5F, -24F);

		leftWingModel[44].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.3F, -1.9F, 0F, -0.3F, -1.9F, 0F, -0.1F, -1.5F, 0F, -0.1F, -1.5F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F); // Box 331
		leftWingModel[44].setRotationPoint(20F, -14F, -25F);

		leftWingModel[45].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -1.5F, 0F, -0.1F, -1.5F, 0F, -0.3F, -1.9F, 0F, -0.3F, -1.9F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F); // Box 332
		leftWingModel[45].setRotationPoint(20F, -12F, -27F);

		leftWingModel[46].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.1F, -1.5F, 0F, -0.1F, -1.5F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.3F, -1.9F, 0F, -0.3F, -1.9F); // Box 333
		leftWingModel[46].setRotationPoint(20F, -12F, -25F);

		leftWingModel[47].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 334
		leftWingModel[47].setRotationPoint(19F, -11F, -25.5F);

		leftWingModel[48].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -2F, 0F, -0.4F); // Box 335
		leftWingModel[48].setRotationPoint(16F, -12F, -25.5F);

		leftWingModel[49].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-2F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -2F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 336
		leftWingModel[49].setRotationPoint(16F, -12.5F, -28F);

		leftWingModel[50].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F); // Box 337
		leftWingModel[50].setRotationPoint(19F, -12.5F, -28F);

		leftWingModel[51].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.3F, -1.9F, 0F, -0.3F, -1.9F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -1.5F, 0F, -0.1F, -1.5F); // Box 338
		leftWingModel[51].setRotationPoint(20F, -14F, -27F);

		leftWingModel[52].addBox(0F, 0F, 0F, 15, 3, 5, 0F); // Box 339
		leftWingModel[52].setRotationPoint(-5F, -13.5F, -27.5F);

		leftWingModel[53].addShapeBox(0F, 0F, 0F, 15, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 340
		leftWingModel[53].setRotationPoint(-5F, -10.5F, -27.5F);

		leftWingModel[54].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, -1.75F, -2.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1.75F, -2.25F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F); // Box 341
		leftWingModel[54].setRotationPoint(-10F, -14.5F, -27.5F);

		leftWingModel[55].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, -1.75F, -2.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1.75F, -2.25F); // Box 342
		leftWingModel[55].setRotationPoint(-10F, -10.5F, -27.5F);

		leftWingModel[56].addShapeBox(0F, 0F, 0F, 10, 3, 5, 0F,0F, 0F, 0F, 0F, -1.25F, -2F, 0F, -1.25F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, -2F, 0F, -1.25F, -2F, 0F, 0F, 0F); // Box 343
		leftWingModel[56].setRotationPoint(10F, -13.5F, -27.5F);

		leftWingModel[57].addShapeBox(0F, 0F, 0F, 10, 1, 5, 0F,0F, 0F, -1F, 0F, -2F, -2.25F, 0F, -2F, -2.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1.25F, -2F, 0F, 1.25F, -2F, 0F, 0F, 0F); // Box 344
		leftWingModel[57].setRotationPoint(10F, -14.5F, -27.5F);

		leftWingModel[58].addShapeBox(0F, 0F, 0F, 10, 1, 5, 0F,0F, 0F, 0F, 0F, 1.25F, -2F, 0F, 1.25F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -2.25F, 0F, -2F, -2.25F, 0F, 0F, -1F); // Box 345
		leftWingModel[58].setRotationPoint(10F, -10.5F, -27.5F);

		leftWingModel[59].addShapeBox(0F, 0F, 0F, 26, 7, 1, 0F,-5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 346
		leftWingModel[59].setRotationPoint(-9F, -22F, -26F);

		leftWingModel[60].addShapeBox(0F, 0F, 0F, 26, 7, 1, 0F,-3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F); // Box 347
		leftWingModel[60].setRotationPoint(-9F, -22F, -25F);
	}

	private void initrightWingModel_1()
	{
		rightWingModel[0] = new ModelRendererTurbo(this, 345, 89, textureX, textureY); // Box 165
		rightWingModel[1] = new ModelRendererTurbo(this, 1433, 89, textureX, textureY); // Box 166
		rightWingModel[2] = new ModelRendererTurbo(this, 1961, 81, textureX, textureY); // Box 167
		rightWingModel[3] = new ModelRendererTurbo(this, 1545, 81, textureX, textureY); // Box 168
		rightWingModel[4] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 169
		rightWingModel[5] = new ModelRendererTurbo(this, 705, 97, textureX, textureY); // Box 170
		rightWingModel[6] = new ModelRendererTurbo(this, 1857, 89, textureX, textureY); // Box 172
		rightWingModel[7] = new ModelRendererTurbo(this, 841, 97, textureX, textureY); // Box 173
		rightWingModel[8] = new ModelRendererTurbo(this, 1633, 97, textureX, textureY); // Box 174
		rightWingModel[9] = new ModelRendererTurbo(this, 1857, 97, textureX, textureY); // Box 175
		rightWingModel[10] = new ModelRendererTurbo(this, 81, 105, textureX, textureY); // Box 176
		rightWingModel[11] = new ModelRendererTurbo(this, 137, 105, textureX, textureY); // Box 177
		rightWingModel[12] = new ModelRendererTurbo(this, 1529, 97, textureX, textureY); // Box 178
		rightWingModel[13] = new ModelRendererTurbo(this, 1105, 129, textureX, textureY); // Box 348
		rightWingModel[14] = new ModelRendererTurbo(this, 1161, 129, textureX, textureY); // Box 349
		rightWingModel[15] = new ModelRendererTurbo(this, 1633, 129, textureX, textureY); // Box 350
		rightWingModel[16] = new ModelRendererTurbo(this, 457, 121, textureX, textureY); // Box 351
		rightWingModel[17] = new ModelRendererTurbo(this, 761, 25, textureX, textureY); // Box 352
		rightWingModel[18] = new ModelRendererTurbo(this, 1649, 97, textureX, textureY); // Box 353
		rightWingModel[19] = new ModelRendererTurbo(this, 1697, 81, textureX, textureY); // Box 354
		rightWingModel[20] = new ModelRendererTurbo(this, 1689, 97, textureX, textureY); // Box 355
		rightWingModel[21] = new ModelRendererTurbo(this, 1713, 81, textureX, textureY); // Box 356
		rightWingModel[22] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 357
		rightWingModel[23] = new ModelRendererTurbo(this, 697, 105, textureX, textureY); // Box 358
		rightWingModel[24] = new ModelRendererTurbo(this, 729, 105, textureX, textureY); // Box 359
		rightWingModel[25] = new ModelRendererTurbo(this, 1809, 81, textureX, textureY); // Box 360
		rightWingModel[26] = new ModelRendererTurbo(this, 761, 105, textureX, textureY); // Box 361
		rightWingModel[27] = new ModelRendererTurbo(this, 1041, 105, textureX, textureY); // Box 362
		rightWingModel[28] = new ModelRendererTurbo(this, 1913, 81, textureX, textureY); // Box 363
		rightWingModel[29] = new ModelRendererTurbo(this, 1097, 105, textureX, textureY); // Box 364
		rightWingModel[30] = new ModelRendererTurbo(this, 1681, 129, textureX, textureY); // Box 365
		rightWingModel[31] = new ModelRendererTurbo(this, 1857, 129, textureX, textureY); // Box 366
		rightWingModel[32] = new ModelRendererTurbo(this, 2025, 105, textureX, textureY); // Box 367
		rightWingModel[33] = new ModelRendererTurbo(this, 305, 113, textureX, textureY); // Box 368
		rightWingModel[34] = new ModelRendererTurbo(this, 1961, 129, textureX, textureY); // Box 369
		rightWingModel[35] = new ModelRendererTurbo(this, 273, 137, textureX, textureY); // Box 370
		rightWingModel[36] = new ModelRendererTurbo(this, 305, 137, textureX, textureY); // Box 371
		rightWingModel[37] = new ModelRendererTurbo(this, 649, 137, textureX, textureY); // Box 372
		rightWingModel[38] = new ModelRendererTurbo(this, 1905, 129, textureX, textureY); // Box 373
		rightWingModel[39] = new ModelRendererTurbo(this, 1073, 25, textureX, textureY); // Box 374
		rightWingModel[40] = new ModelRendererTurbo(this, 1129, 105, textureX, textureY); // Box 375
		rightWingModel[41] = new ModelRendererTurbo(this, 89, 89, textureX, textureY); // Box 376
		rightWingModel[42] = new ModelRendererTurbo(this, 1169, 105, textureX, textureY); // Box 377
		rightWingModel[43] = new ModelRendererTurbo(this, 1265, 105, textureX, textureY); // Box 378
		rightWingModel[44] = new ModelRendererTurbo(this, 1353, 105, textureX, textureY); // Box 379
		rightWingModel[45] = new ModelRendererTurbo(this, 1465, 105, textureX, textureY); // Box 380
		rightWingModel[46] = new ModelRendererTurbo(this, 1713, 105, textureX, textureY); // Box 381
		rightWingModel[47] = new ModelRendererTurbo(this, 1793, 105, textureX, textureY); // Box 382
		rightWingModel[48] = new ModelRendererTurbo(this, 1809, 105, textureX, textureY); // Box 383
		rightWingModel[49] = new ModelRendererTurbo(this, 1961, 105, textureX, textureY); // Box 384
		rightWingModel[50] = new ModelRendererTurbo(this, 81, 113, textureX, textureY); // Box 385
		rightWingModel[51] = new ModelRendererTurbo(this, 1841, 105, textureX, textureY); // Box 386
		rightWingModel[52] = new ModelRendererTurbo(this, 1321, 137, textureX, textureY); // Box 387
		rightWingModel[53] = new ModelRendererTurbo(this, 993, 137, textureX, textureY); // Box 388
		rightWingModel[54] = new ModelRendererTurbo(this, 1993, 129, textureX, textureY); // Box 389
		rightWingModel[55] = new ModelRendererTurbo(this, 2025, 129, textureX, textureY); // Box 390
		rightWingModel[56] = new ModelRendererTurbo(this, 737, 137, textureX, textureY); // Box 391
		rightWingModel[57] = new ModelRendererTurbo(this, 841, 137, textureX, textureY); // Box 392
		rightWingModel[58] = new ModelRendererTurbo(this, 1273, 137, textureX, textureY); // Box 393
		rightWingModel[59] = new ModelRendererTurbo(this, 1369, 137, textureX, textureY); // Box 394
		rightWingModel[60] = new ModelRendererTurbo(this, 1721, 137, textureX, textureY); // Box 395

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 31, 12, 45, 0F,0F, 0F, 0F, 0F, -2F, 0F, -3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, 0F, -3F, 0F); // Box 165
		rightWingModel[0].setRotationPoint(-2F, -31F, 12F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 25, 10, 45, 0F,-3F, 0F, 0F, -1F, -5F, -6F, -8F, -3F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -1F, -4F, -6F, -8F, -6F, 0F, 0F, -3F, 0F); // Box 166
		rightWingModel[1].setRotationPoint(26F, -29F, 12F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 21, 10, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.9999F, 0F, 0F, 0F, -5.9999F, 0F, 0F, 0F, 0F, -2.9999F, 0F, 0F, -3.9999F, 0F, 0F, 0F, -5.9999F); // Box 167
		rightWingModel[2].setRotationPoint(29F, -29F, 12F);

		rightWingModel[3].addShapeBox(0F, 0F, 0F, 15, 7, 6, 0F,0F, 0F, 0F, 0F, -2.9999F, 0F, 0F, -2.9999F, -5.9999F, 0F, -4.9999F, 0F, 0F, 0F, 0F, 0F, -2.9999F, 0F, 0F, -2.9999F, -5.9999F, 0F, -0.9999F, 0F); // Box 168
		rightWingModel[3].setRotationPoint(50F, -29F, 12F);

		rightWingModel[4].addShapeBox(0F, 0F, 0F, 17, 12, 45, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, -6F, 0F); // Box 169
		rightWingModel[4].setRotationPoint(-19F, -31F, 12F);

		rightWingModel[5].addShapeBox(0F, 0F, 0F, 28, 5, 72, 0F,0F, -4F, 0F, 0F, -6F, 0F, -10F, -1F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, -10F, 0F, 0F, 0F, 0F, 0F); // Box 170
		rightWingModel[5].setRotationPoint(-2F, -35F, 57F);

		rightWingModel[6].addShapeBox(0F, 0F, 0F, 14, 5, 72, 0F,0F, -7F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -6F, -1F, 0F, 0F, 5F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, -6F, -1F, 0F); // Box 172
		rightWingModel[6].setRotationPoint(-16F, -35F, 57F);

		rightWingModel[7].addShapeBox(0F, 0F, 0F, 18, 5, 25, 0F,0F, -2F, 0F, 0F, -3F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -2F, -1F, 0F, -2F, -1F, 0F); // Box 173
		rightWingModel[7].setRotationPoint(-2F, -37F, 129F);

		rightWingModel[8].addShapeBox(0F, 0F, 0F, 15, 5, 25, 0F,0F, -2F, 0F, 0F, -3F, 0F, -6F, -1F, 0F, 2F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -6F, -3F, 0F, 2F, -2F, 0F); // Box 174
		rightWingModel[8].setRotationPoint(16F, -36F, 129F);

		rightWingModel[9].addShapeBox(0F, 0F, 0F, 5, 5, 25, 0F,5F, -3F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 5F, 1F, 0F, -2F, 2F, 0F, 0F, -1F, 0F, 0F, -2F, 0F); // Box 175
		rightWingModel[9].setRotationPoint(-5F, -37F, 129F);

		rightWingModel[10].addShapeBox(0F, 0F, 0F, 14, 4, 12, 0F,2F, -1F, 0F, -11F, 0F, 0F, -8F, -1F, 0F, -2F, -1F, -2F, 2F, -1F, 0F, -11F, 0F, 0F, -8F, -2F, 0F, -2F, -2F, -2F); // Box 176
		rightWingModel[10].setRotationPoint(-3F, -37F, 154F);

		rightWingModel[11].addShapeBox(0F, 0F, 0F, 14, 4, 12, 0F,0F, 0F, 0F, 0F, -1F, 0F, -6F, -1F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -2F, 0F, -3F, -2F, 0F); // Box 177
		rightWingModel[11].setRotationPoint(0F, -37F, 154F);

		rightWingModel[12].addShapeBox(0F, 0F, 0F, 11, 3, 12, 0F,0F, 0F, 0F, 0F, -1F, 0F, -9F, -0.5F, -4F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -9F, -1.5F, -4F, 6F, -2F, 0F); // Box 178
		rightWingModel[12].setRotationPoint(14F, -36F, 154F);

		rightWingModel[13].addShapeBox(0F, 0F, 0F, 26, 7, 1, 0F,-3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F); // Box 348
		rightWingModel[13].setRotationPoint(-9F, -22F, 18F);

		rightWingModel[14].addShapeBox(0F, 0F, 0F, 26, 7, 1, 0F,-5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 349
		rightWingModel[14].setRotationPoint(-9F, -22F, 17F);

		rightWingModel[15].addShapeBox(0F, 0F, 0F, 15, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 350
		rightWingModel[15].setRotationPoint(-5F, -14.5F, 15.5F);

		rightWingModel[16].addShapeBox(0F, 0F, 0F, 5, 3, 5, 0F,0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F); // Box 351
		rightWingModel[16].setRotationPoint(-10F, -13.5F, 15.5F);

		rightWingModel[17].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 352
		rightWingModel[17].setRotationPoint(-10.5F, -12.5F, 17.5F);

		rightWingModel[18].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 353
		rightWingModel[18].setRotationPoint(16F, -15F, 17.5F);

		rightWingModel[19].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F); // Box 354
		rightWingModel[19].setRotationPoint(19F, -15F, 17.5F);

		rightWingModel[20].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-2F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -2F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 355
		rightWingModel[20].setRotationPoint(16F, -12.5F, 15F);

		rightWingModel[21].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F); // Box 356
		rightWingModel[21].setRotationPoint(19F, -12.5F, 15F);

		rightWingModel[22].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.3F, -1.9F, 0F, -0.3F, -1.9F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -1.5F, 0F, -0.1F, -1.5F); // Box 357
		rightWingModel[22].setRotationPoint(20F, -14F, 16F);

		rightWingModel[23].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.1F, -1.5F, 0F, -0.1F, -1.5F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.3F, -1.9F, 0F, -0.3F, -1.9F); // Box 358
		rightWingModel[23].setRotationPoint(20F, -12F, 18F);

		rightWingModel[24].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -1.5F, 0F, -0.1F, -1.5F, 0F, -0.3F, -1.9F, 0F, -0.3F, -1.9F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F); // Box 359
		rightWingModel[24].setRotationPoint(20F, -12F, 16F);

		rightWingModel[25].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 360
		rightWingModel[25].setRotationPoint(19F, -11F, 17.5F);

		rightWingModel[26].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -2F, 0F, -0.4F); // Box 361
		rightWingModel[26].setRotationPoint(16F, -12F, 17.5F);

		rightWingModel[27].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -2F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -2F, -0.4F, 0F); // Box 362
		rightWingModel[27].setRotationPoint(16F, -12.5F, 18F);

		rightWingModel[28].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 363
		rightWingModel[28].setRotationPoint(19F, -12.5F, 19F);

		rightWingModel[29].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.3F, -1.9F, 0F, -0.3F, -1.9F, 0F, -0.1F, -1.5F, 0F, -0.1F, -1.5F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F); // Box 364
		rightWingModel[29].setRotationPoint(20F, -14F, 18F);

		rightWingModel[30].addBox(0F, 0F, 0F, 15, 3, 5, 0F); // Box 365
		rightWingModel[30].setRotationPoint(-5F, -13.5F, 15.5F);

		rightWingModel[31].addShapeBox(0F, 0F, 0F, 15, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 366
		rightWingModel[31].setRotationPoint(-5F, -10.5F, 15.5F);

		rightWingModel[32].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, -1.75F, -2.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1.75F, -2.25F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F); // Box 367
		rightWingModel[32].setRotationPoint(-10F, -14.5F, 15.5F);

		rightWingModel[33].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, -1.75F, -2.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1.75F, -2.25F); // Box 368
		rightWingModel[33].setRotationPoint(-10F, -10.5F, 15.5F);

		rightWingModel[34].addShapeBox(0F, 0F, 0F, 10, 3, 5, 0F,0F, 0F, 0F, 0F, -1.25F, -2F, 0F, -1.25F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, -2F, 0F, -1.25F, -2F, 0F, 0F, 0F); // Box 369
		rightWingModel[34].setRotationPoint(10F, -13.5F, 15.5F);

		rightWingModel[35].addShapeBox(0F, 0F, 0F, 10, 1, 5, 0F,0F, 0F, -1F, 0F, -2F, -2.25F, 0F, -2F, -2.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1.25F, -2F, 0F, 1.25F, -2F, 0F, 0F, 0F); // Box 370
		rightWingModel[35].setRotationPoint(10F, -14.5F, 15.5F);

		rightWingModel[36].addShapeBox(0F, 0F, 0F, 10, 1, 5, 0F,0F, 0F, 0F, 0F, 1.25F, -2F, 0F, 1.25F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -2.25F, 0F, -2F, -2.25F, 0F, 0F, -1F); // Box 371
		rightWingModel[36].setRotationPoint(10F, -10.5F, 15.5F);

		rightWingModel[37].addShapeBox(0F, 0F, 0F, 15, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372
		rightWingModel[37].setRotationPoint(-5F, -14.5F, 22.5F);

		rightWingModel[38].addShapeBox(0F, 0F, 0F, 5, 3, 5, 0F,0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F); // Box 373
		rightWingModel[38].setRotationPoint(-10F, -13.5F, 22.5F);

		rightWingModel[39].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 374
		rightWingModel[39].setRotationPoint(-10.5F, -12.5F, 24.5F);

		rightWingModel[40].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 375
		rightWingModel[40].setRotationPoint(16F, -15F, 24.5F);

		rightWingModel[41].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F); // Box 376
		rightWingModel[41].setRotationPoint(19F, -15F, 24.5F);

		rightWingModel[42].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-2F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -2F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 377
		rightWingModel[42].setRotationPoint(16F, -12.5F, 22F);

		rightWingModel[43].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F); // Box 378
		rightWingModel[43].setRotationPoint(19F, -12.5F, 22F);

		rightWingModel[44].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.3F, -1.9F, 0F, -0.3F, -1.9F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -1.5F, 0F, -0.1F, -1.5F); // Box 379
		rightWingModel[44].setRotationPoint(20F, -14F, 23F);

		rightWingModel[45].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.1F, -1.5F, 0F, -0.1F, -1.5F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.3F, -1.9F, 0F, -0.3F, -1.9F); // Box 380
		rightWingModel[45].setRotationPoint(20F, -12F, 25F);

		rightWingModel[46].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -1.5F, 0F, -0.1F, -1.5F, 0F, -0.3F, -1.9F, 0F, -0.3F, -1.9F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F); // Box 381
		rightWingModel[46].setRotationPoint(20F, -12F, 23F);

		rightWingModel[47].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 382
		rightWingModel[47].setRotationPoint(19F, -11F, 24.5F);

		rightWingModel[48].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -2F, 0F, -0.4F); // Box 383
		rightWingModel[48].setRotationPoint(16F, -12F, 24.5F);

		rightWingModel[49].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -2F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -2F, -0.4F, 0F); // Box 384
		rightWingModel[49].setRotationPoint(16F, -12.5F, 25F);

		rightWingModel[50].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 385
		rightWingModel[50].setRotationPoint(19F, -12.5F, 26F);

		rightWingModel[51].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.3F, -1.9F, 0F, -0.3F, -1.9F, 0F, -0.1F, -1.5F, 0F, -0.1F, -1.5F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F); // Box 386
		rightWingModel[51].setRotationPoint(20F, -14F, 25F);

		rightWingModel[52].addBox(0F, 0F, 0F, 15, 3, 5, 0F); // Box 387
		rightWingModel[52].setRotationPoint(-5F, -13.5F, 22.5F);

		rightWingModel[53].addShapeBox(0F, 0F, 0F, 15, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 388
		rightWingModel[53].setRotationPoint(-5F, -10.5F, 22.5F);

		rightWingModel[54].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, -1.75F, -2.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1.75F, -2.25F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F); // Box 389
		rightWingModel[54].setRotationPoint(-10F, -14.5F, 22.5F);

		rightWingModel[55].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, -1.75F, -2.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1.75F, -2.25F); // Box 390
		rightWingModel[55].setRotationPoint(-10F, -10.5F, 22.5F);

		rightWingModel[56].addShapeBox(0F, 0F, 0F, 10, 3, 5, 0F,0F, 0F, 0F, 0F, -1.25F, -2F, 0F, -1.25F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, -2F, 0F, -1.25F, -2F, 0F, 0F, 0F); // Box 391
		rightWingModel[56].setRotationPoint(10F, -13.5F, 22.5F);

		rightWingModel[57].addShapeBox(0F, 0F, 0F, 10, 1, 5, 0F,0F, 0F, -1F, 0F, -2F, -2.25F, 0F, -2F, -2.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1.25F, -2F, 0F, 1.25F, -2F, 0F, 0F, 0F); // Box 392
		rightWingModel[57].setRotationPoint(10F, -14.5F, 22.5F);

		rightWingModel[58].addShapeBox(0F, 0F, 0F, 10, 1, 5, 0F,0F, 0F, 0F, 0F, 1.25F, -2F, 0F, 1.25F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -2.25F, 0F, -2F, -2.25F, 0F, 0F, -1F); // Box 393
		rightWingModel[58].setRotationPoint(10F, -10.5F, 22.5F);

		rightWingModel[59].addShapeBox(0F, 0F, 0F, 26, 7, 1, 0F,-3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F); // Box 394
		rightWingModel[59].setRotationPoint(-9F, -22F, 25F);

		rightWingModel[60].addShapeBox(0F, 0F, 0F, 26, 7, 1, 0F,-5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 395
		rightWingModel[60].setRotationPoint(-9F, -22F, 24F);
	}

	private void inityawFlapModel_1()
	{
		yawFlapModel[0] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 43
		yawFlapModel[1] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 45
		yawFlapModel[2] = new ModelRendererTurbo(this, 505, 105, textureX, textureY); // Box 203
		yawFlapModel[3] = new ModelRendererTurbo(this, 457, 105, textureX, textureY); // Box 205

		yawFlapModel[0].addShapeBox(0F, 0F, 0F, 18, 40, 2, 0F,0F, 0F, 0F, -6F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 1F, -1F, 7F, 1F, 0F, 0F, 0F, 0F); // Box 43
		yawFlapModel[0].setRotationPoint(151F, -78F, -2F);

		yawFlapModel[1].addShapeBox(0F, 0F, 0F, 14, 6, 2, 0F,0F, -1F, 0F, -5F, -3F, -1F, -3F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		yawFlapModel[1].setRotationPoint(151F, -84F, -2F);

		yawFlapModel[2].addShapeBox(0F, 0F, 0F, 18, 40, 2, 0F,0F, 0F, 0F, -4F, 0F, 0F, -6F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 1F, 0F, 5F, 1F, -1F, 0F, 0F, 0F); // Box 203
		yawFlapModel[2].setRotationPoint(151F, -78F, 0F);

		yawFlapModel[3].addShapeBox(0F, 0F, 0F, 14, 6, 2, 0F,0F, 1F, 0F, -3F, -1F, 0F, -5F, -3F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, 0F); // Box 205
		yawFlapModel[3].setRotationPoint(151F, -84F, 0F);
	}

	private void initpitchFlapLeftModel_1()
	{
		pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 537, 33, textureX, textureY); // Box 47

		pitchFlapLeftModel[0].addShapeBox(0F, 0F, 0F, 16, 4, 45, 0F,0F, 0F, 0F, -7F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 47
		pitchFlapLeftModel[0].setRotationPoint(157F, -40F, -46F);
	}

	private void initpitchFlapRightModel_1()
	{
		pitchFlapRightModel[0] = new ModelRendererTurbo(this, 569, 105, textureX, textureY); // Box 207

		pitchFlapRightModel[0].addShapeBox(0F, 0F, 0F, 16, 4, 45, 0F,0F, 0F, 0F, 0F, -2F, 0F, -7F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -7F, -1F, 0F, 0F, 0F, 0F); // Box 207
		pitchFlapRightModel[0].setRotationPoint(157F, -40F, 1F);
	}

	private void initpitchFlapLeftWingModel_1()
	{
		pitchFlapLeftWingModel[0] = new ModelRendererTurbo(this, 1145, 25, textureX, textureY); // Box 48

		pitchFlapLeftWingModel[0].addShapeBox(0F, 0F, 0F, 27, 5, 72, 0F,0F, 0F, 0F, -12F, -1F, 0F, 0F, -8F, 0F, -10F, -5F, 0F, 0F, -1F, 0F, -12F, -3F, 0F, 0F, 4F, 0F, -10F, 7F, 0F); // Box 48
		pitchFlapLeftWingModel[0].setRotationPoint(16F, -34F, -129F);
	}

	private void initpitchFlapRightWingModel_1()
	{
		pitchFlapRightWingModel[0] = new ModelRendererTurbo(this, 1505, 97, textureX, textureY); // Box 171

		pitchFlapRightWingModel[0].addShapeBox(0F, 0F, 0F, 27, 5, 72, 0F,-10F, -5F, 0F, 0F, -8F, 0F, -12F, -1F, 0F, 0F, 0F, 0F, -10F, 7F, 0F, 0F, 4F, 0F, -12F, -3F, 0F, 0F, -1F, 0F); // Box 171
		pitchFlapRightWingModel[0].setRotationPoint(16F, -34F, 57F);
	}

	private void inittailWheelModel_1()
	{
		tailWheelModel[0] = new ModelRendererTurbo(this, 1697, 73, textureX, textureY); // Box 391
		tailWheelModel[1] = new ModelRendererTurbo(this, 1433, 33, textureX, textureY); // Box 392
		tailWheelModel[2] = new ModelRendererTurbo(this, 1897, 25, textureX, textureY); // Box 393
		tailWheelModel[3] = new ModelRendererTurbo(this, 1977, 25, textureX, textureY); // Box 394
		tailWheelModel[4] = new ModelRendererTurbo(this, 457, 41, textureX, textureY); // Box 395
		tailWheelModel[5] = new ModelRendererTurbo(this, 849, 49, textureX, textureY); // Box 396
		tailWheelModel[6] = new ModelRendererTurbo(this, 1913, 73, textureX, textureY); // Box 397
		tailWheelModel[7] = new ModelRendererTurbo(this, 1505, 57, textureX, textureY); // Box 398
		tailWheelModel[8] = new ModelRendererTurbo(this, 1937, 25, textureX, textureY); // Box 399

		tailWheelModel[0].addShapeBox(0F, 0F, 0F, 10, 3, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 391
		tailWheelModel[0].setRotationPoint(133F, -29F, -2F);

		tailWheelModel[1].addShapeBox(0F, 0F, 0F, 8, 3, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F); // Box 392
		tailWheelModel[1].setRotationPoint(135F, -26F, -2F);

		tailWheelModel[2].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 393
		tailWheelModel[2].setRotationPoint(138F, -23F, -2F);

		tailWheelModel[3].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		tailWheelModel[3].setRotationPoint(138F, -20F, -1F);

		tailWheelModel[4].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 395
		tailWheelModel[4].setRotationPoint(138F, -22F, -1F);

		tailWheelModel[5].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 396
		tailWheelModel[5].setRotationPoint(138F, -18F, -1F);

		tailWheelModel[6].addShapeBox(0F, 0F, 0F, 10, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F); // Box 397
		tailWheelModel[6].setRotationPoint(133F, -29F, 0F);

		tailWheelModel[7].addShapeBox(0F, 0F, 0F, 8, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 398
		tailWheelModel[7].setRotationPoint(135F, -26F, 0F);

		tailWheelModel[8].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 399
		tailWheelModel[8].setRotationPoint(138F, -23F, 1F);
	}

	private void initleftWingWheelModel_1()
	{
		leftWingWheelModel[0] = new ModelRendererTurbo(this, 1313, 25, textureX, textureY); // Box 111
		leftWingWheelModel[1] = new ModelRendererTurbo(this, 1409, 33, textureX, textureY); // Box 112
		leftWingWheelModel[2] = new ModelRendererTurbo(this, 1505, 33, textureX, textureY); // Box 113
		leftWingWheelModel[3] = new ModelRendererTurbo(this, 1073, 25, textureX, textureY); // Box 114
		leftWingWheelModel[4] = new ModelRendererTurbo(this, 1537, 33, textureX, textureY); // Box 115
		leftWingWheelModel[5] = new ModelRendererTurbo(this, 1593, 33, textureX, textureY); // Box 116
		leftWingWheelModel[6] = new ModelRendererTurbo(this, 1649, 33, textureX, textureY); // Box 117
		leftWingWheelModel[7] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 118
		leftWingWheelModel[8] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 119

		leftWingWheelModel[0].addTrapezoid(0F, 0F, 0F, 7, 12, 7, 0F, -2.00F, ModelRendererTurbo.MR_TOP); // Box 111
		leftWingWheelModel[0].setRotationPoint(-10F, -24F, -36F);

		leftWingWheelModel[1].addShapeBox(0F, 0F, 0F, 7, 12, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		leftWingWheelModel[1].setRotationPoint(-10F, -12F, -36F);

		leftWingWheelModel[2].addShapeBox(0F, 0F, 0F, 6, 12, 7, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		leftWingWheelModel[2].setRotationPoint(-16F, -12F, -36F);

		leftWingWheelModel[3].addShapeBox(0F, 0F, 0F, 4, 10, 7, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		leftWingWheelModel[3].setRotationPoint(-20F, -10F, -36F);

		leftWingWheelModel[4].addShapeBox(0F, 0F, 0F, 20, 8, 7, 0F,0F, 0F, 0F, -1F, -5F, 0F, -1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		leftWingWheelModel[4].setRotationPoint(-3F, -12F, -36F);

		leftWingWheelModel[5].addShapeBox(0F, 0F, 0F, 20, 10, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -7F, 0F, -2F, -7F, 0F, 0F, 0F, 0F); // Box 116
		leftWingWheelModel[5].setRotationPoint(-3F, -4F, -36F);

		leftWingWheelModel[6].addShapeBox(0F, 0F, 0F, 7, 7, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 117
		leftWingWheelModel[6].setRotationPoint(-10F, 0F, -36F);

		leftWingWheelModel[7].addShapeBox(0F, 0F, 0F, 10, 7, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F); // Box 118
		leftWingWheelModel[7].setRotationPoint(-20F, 0F, -36F);

		leftWingWheelModel[8].addShapeBox(0F, 0F, 0F, 18, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Box 119
		leftWingWheelModel[8].setRotationPoint(-17F, 4F, -35F);
	}

	private void initrightWingWheelModel_1()
	{
		rightWingWheelModel[0] = new ModelRendererTurbo(this, 1897, 97, textureX, textureY); // Box 215
		rightWingWheelModel[1] = new ModelRendererTurbo(this, 705, 105, textureX, textureY); // Box 216
		rightWingWheelModel[2] = new ModelRendererTurbo(this, 737, 105, textureX, textureY); // Box 217
		rightWingWheelModel[3] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 218
		rightWingWheelModel[4] = new ModelRendererTurbo(this, 993, 105, textureX, textureY); // Box 219
		rightWingWheelModel[5] = new ModelRendererTurbo(this, 1049, 105, textureX, textureY); // Box 220
		rightWingWheelModel[6] = new ModelRendererTurbo(this, 1105, 105, textureX, textureY); // Box 221
		rightWingWheelModel[7] = new ModelRendererTurbo(this, 1137, 105, textureX, textureY); // Box 222
		rightWingWheelModel[8] = new ModelRendererTurbo(this, 1177, 105, textureX, textureY); // Box 223

		rightWingWheelModel[0].addTrapezoid(0F, 0F, 0F, 7, 12, 7, 0F, -2.00F, ModelRendererTurbo.MR_TOP); // Box 215
		rightWingWheelModel[0].setRotationPoint(-10F, -24F, 29F);

		rightWingWheelModel[1].addShapeBox(0F, 0F, 0F, 7, 12, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 216
		rightWingWheelModel[1].setRotationPoint(-10F, -12F, 29F);

		rightWingWheelModel[2].addShapeBox(0F, 0F, 0F, 6, 12, 7, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		rightWingWheelModel[2].setRotationPoint(-16F, -12F, 29F);

		rightWingWheelModel[3].addShapeBox(0F, 0F, 0F, 4, 10, 7, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 218
		rightWingWheelModel[3].setRotationPoint(-20F, -10F, 29F);

		rightWingWheelModel[4].addShapeBox(0F, 0F, 0F, 20, 8, 7, 0F,0F, 0F, 0F, -1F, -5F, 0F, -1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		rightWingWheelModel[4].setRotationPoint(-3F, -12F, 29F);

		rightWingWheelModel[5].addShapeBox(0F, 0F, 0F, 20, 10, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -7F, 0F, -2F, -7F, 0F, 0F, 0F, 0F); // Box 220
		rightWingWheelModel[5].setRotationPoint(-3F, -4F, 29F);

		rightWingWheelModel[6].addShapeBox(0F, 0F, 0F, 7, 7, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 221
		rightWingWheelModel[6].setRotationPoint(-10F, 0F, 29F);

		rightWingWheelModel[7].addShapeBox(0F, 0F, 0F, 10, 7, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F); // Box 222
		rightWingWheelModel[7].setRotationPoint(-20F, 0F, 29F);

		rightWingWheelModel[8].addShapeBox(0F, 0F, 0F, 18, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Box 223
		rightWingWheelModel[8].setRotationPoint(-17F, 4F, 30F);
	}

	private void inithudModel_1()
	{
		hudModel[0] = new ModelRendererTurbo(this, 473, 105, textureX, textureY); // Box 814

		hudModel[0].addShapeBox(0F, -1F, -1F, 0, 75, 75, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -73F, 0F, 0F, -73F, 0F, -73F, 0F, 0F, -73F, 0F, 0F, -73F, -73F, 0F, -73F, -73F); // Box 814
		hudModel[0].setRotationPoint(-11.5F, -51F, 0F);
		hudModel[0].rotateAngleX = -0.01745329F;
		hudModel[0].rotateAngleY = 0.01745329F;
		hudModel[0].rotateAngleZ = -0.29670597F;
	}

	private void initPropeller()
	{
		propellerModels = new ModelRendererTurbo[1][3];
		propellerModels[0] = makeProp1(-68F, -30.5F, 0F);
	}

	private ModelRendererTurbo[] makeProp1(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[3];
		prop[0] = new ModelRendererTurbo(this, 0, 153, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 153, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 0, 153, textureX, textureY);
		prop[0].addBox(-1F, -35F, -2.5F, 2, 35, 5, 0.0F);
		prop[1].addBox(-1F, -35F, -2.5F, 2, 35, 5, 0.0F);
		prop[2].addBox(-1F, -35F, -2.5F, 2, 35, 5, 0.0F);
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

		gun_1_Model[1] = new ModelRendererTurbo[78];
		gun_1_Model[1][0] = new ModelRendererTurbo(this, 30, 165, textureX, textureY); // Import 
		gun_1_Model[1][1] = new ModelRendererTurbo(this, 38, 165, textureX, textureY); // Import 
		gun_1_Model[1][2] = new ModelRendererTurbo(this, 46, 165, textureX, textureY); // Import 
		gun_1_Model[1][3] = new ModelRendererTurbo(this, 54, 165, textureX, textureY); // Import 
		gun_1_Model[1][4] = new ModelRendererTurbo(this, 62, 165, textureX, textureY); // Import 
		gun_1_Model[1][5] = new ModelRendererTurbo(this, 70, 165, textureX, textureY); // Import 
		gun_1_Model[1][6] = new ModelRendererTurbo(this, 86, 165, textureX, textureY); // Import 
		gun_1_Model[1][7] = new ModelRendererTurbo(this, 94, 165, textureX, textureY); // Import 
		gun_1_Model[1][8] = new ModelRendererTurbo(this, 110, 165, textureX, textureY); // Import 
		gun_1_Model[1][9] = new ModelRendererTurbo(this, 126, 165, textureX, textureY); // Import 
		gun_1_Model[1][10] = new ModelRendererTurbo(this, 142, 165, textureX, textureY); // Import 
		gun_1_Model[1][11] = new ModelRendererTurbo(this, 158, 165, textureX, textureY); // Import 
		gun_1_Model[1][12] = new ModelRendererTurbo(this, 166, 165, textureX, textureY); // Import 
		gun_1_Model[1][13] = new ModelRendererTurbo(this, 174, 165, textureX, textureY); // Import 
		gun_1_Model[1][14] = new ModelRendererTurbo(this, 182, 165, textureX, textureY); // Import 
		gun_1_Model[1][15] = new ModelRendererTurbo(this, 190, 165, textureX, textureY); // Import 
		gun_1_Model[1][16] = new ModelRendererTurbo(this, 198, 165, textureX, textureY); // Import 
		gun_1_Model[1][17] = new ModelRendererTurbo(this, 206, 165, textureX, textureY); // Import 
		gun_1_Model[1][18] = new ModelRendererTurbo(this, 214, 165, textureX, textureY); // Import 
		gun_1_Model[1][19] = new ModelRendererTurbo(this, 222, 165, textureX, textureY); // Import 
		gun_1_Model[1][20] = new ModelRendererTurbo(this, 230, 165, textureX, textureY); // Import 
		gun_1_Model[1][21] = new ModelRendererTurbo(this, 238, 165, textureX, textureY); // Import 
		gun_1_Model[1][22] = new ModelRendererTurbo(this, 246, 165, textureX, textureY); // Import 
		gun_1_Model[1][23] = new ModelRendererTurbo(this, 254, 165, textureX, textureY); // Import 
		gun_1_Model[1][24] = new ModelRendererTurbo(this, 262, 165, textureX, textureY); // Import 
		gun_1_Model[1][25] = new ModelRendererTurbo(this, 270, 165, textureX, textureY); // Import 
		gun_1_Model[1][26] = new ModelRendererTurbo(this, 278, 165, textureX, textureY); // Import 
		gun_1_Model[1][27] = new ModelRendererTurbo(this, 30, 173, textureX, textureY); // Import 
		gun_1_Model[1][28] = new ModelRendererTurbo(this, 38, 173, textureX, textureY); // Import 
		gun_1_Model[1][29] = new ModelRendererTurbo(this, 46, 173, textureX, textureY); // Import 
		gun_1_Model[1][30] = new ModelRendererTurbo(this, 62, 173, textureX, textureY); // Import 
		gun_1_Model[1][31] = new ModelRendererTurbo(this, 70, 173, textureX, textureY); // Import 
		gun_1_Model[1][32] = new ModelRendererTurbo(this, 78, 173, textureX, textureY); // Import 
		gun_1_Model[1][33] = new ModelRendererTurbo(this, 86, 173, textureX, textureY); // Import 
		gun_1_Model[1][34] = new ModelRendererTurbo(this, 102, 173, textureX, textureY); // Import 
		gun_1_Model[1][35] = new ModelRendererTurbo(this, 126, 173, textureX, textureY); // Import 
		gun_1_Model[1][36] = new ModelRendererTurbo(this, 158, 173, textureX, textureY); // Import 
		gun_1_Model[1][37] = new ModelRendererTurbo(this, 166, 173, textureX, textureY); // Import 
		gun_1_Model[1][38] = new ModelRendererTurbo(this, 174, 173, textureX, textureY); // Import 
		gun_1_Model[1][39] = new ModelRendererTurbo(this, 182, 173, textureX, textureY); // Import 
		gun_1_Model[1][40] = new ModelRendererTurbo(this, 190, 173, textureX, textureY); // Import 
		gun_1_Model[1][41] = new ModelRendererTurbo(this, 198, 173, textureX, textureY); // Import 
		gun_1_Model[1][42] = new ModelRendererTurbo(this, 206, 173, textureX, textureY); // Import 
		gun_1_Model[1][43] = new ModelRendererTurbo(this, 214, 173, textureX, textureY); // Import 
		gun_1_Model[1][44] = new ModelRendererTurbo(this, 222, 173, textureX, textureY); // Import 
		gun_1_Model[1][45] = new ModelRendererTurbo(this, 230, 173, textureX, textureY); // Import 
		gun_1_Model[1][46] = new ModelRendererTurbo(this, 238, 173, textureX, textureY); // Import 
		gun_1_Model[1][47] = new ModelRendererTurbo(this, 246, 173, textureX, textureY); // Import 
		gun_1_Model[1][48] = new ModelRendererTurbo(this, 254, 173, textureX, textureY); // Import 
		gun_1_Model[1][49] = new ModelRendererTurbo(this, 262, 173, textureX, textureY); // Import 
		gun_1_Model[1][50] = new ModelRendererTurbo(this, 270, 173, textureX, textureY); // Import 
		gun_1_Model[1][51] = new ModelRendererTurbo(this, 278, 173, textureX, textureY); // Import 
		gun_1_Model[1][52] = new ModelRendererTurbo(this, 30, 181, textureX, textureY); // Import 
		gun_1_Model[1][53] = new ModelRendererTurbo(this, 38, 181, textureX, textureY); // Import 
		gun_1_Model[1][54] = new ModelRendererTurbo(this, 46, 181, textureX, textureY); // Import 
		gun_1_Model[1][55] = new ModelRendererTurbo(this, 54, 181, textureX, textureY); // Import 
		gun_1_Model[1][56] = new ModelRendererTurbo(this, 62, 181, textureX, textureY); // Import 
		gun_1_Model[1][57] = new ModelRendererTurbo(this, 70, 181, textureX, textureY); // Import 
		gun_1_Model[1][58] = new ModelRendererTurbo(this, 78, 181, textureX, textureY); // Import 
		gun_1_Model[1][59] = new ModelRendererTurbo(this, 86, 181, textureX, textureY); // Import 
		gun_1_Model[1][60] = new ModelRendererTurbo(this, 94, 181, textureX, textureY); // Import 
		gun_1_Model[1][61] = new ModelRendererTurbo(this, 102, 181, textureX, textureY); // Import 
		gun_1_Model[1][62] = new ModelRendererTurbo(this, 110, 181, textureX, textureY); // Import 
		gun_1_Model[1][63] = new ModelRendererTurbo(this, 118, 181, textureX, textureY); // Import 
		gun_1_Model[1][64] = new ModelRendererTurbo(this, 126, 181, textureX, textureY); // Import 
		gun_1_Model[1][65] = new ModelRendererTurbo(this, 142, 181, textureX, textureY); // Import 
		gun_1_Model[1][66] = new ModelRendererTurbo(this, 150, 181, textureX, textureY); // Import 
		gun_1_Model[1][67] = new ModelRendererTurbo(this, 158, 181, textureX, textureY); // Import 
		gun_1_Model[1][68] = new ModelRendererTurbo(this, 166, 181, textureX, textureY); // Import 
		gun_1_Model[1][69] = new ModelRendererTurbo(this, 174, 181, textureX, textureY); // Import 
		gun_1_Model[1][70] = new ModelRendererTurbo(this, 182, 181, textureX, textureY); // Import 
		gun_1_Model[1][71] = new ModelRendererTurbo(this, 190, 181, textureX, textureY); // Import 
		gun_1_Model[1][72] = new ModelRendererTurbo(this, 198, 181, textureX, textureY); // Import 
		gun_1_Model[1][73] = new ModelRendererTurbo(this, 206, 181, textureX, textureY); // Import 
		gun_1_Model[1][74] = new ModelRendererTurbo(this, 214, 181, textureX, textureY); // Import 
		gun_1_Model[1][75] = new ModelRendererTurbo(this, 222, 181, textureX, textureY); // Import 
		gun_1_Model[1][76] = new ModelRendererTurbo(this, 230, 181, textureX, textureY); // Import 
		gun_1_Model[1][77] = new ModelRendererTurbo(this, 238, 181, textureX, textureY); // Import 

		gun_1_Model[1][0].addShapeBox(-2.8F, 1.9F, -0.5F, 1, 1, 1, 0F,0.1F, 0.0F, -0.05F, 0.1F, 0.0F, -0.05F, 0.1F, 0.0F, -0.05F, 0.1F, 0.0F, -0.05F, -0.2F, -0.5F, -0.05F, -0.2F, -0.5F, -0.05F, -0.2F, -0.5F, -0.05F, -0.2F, -0.5F, -0.05F); // Import 

		gun_1_Model[1][1].addShapeBox(-2.8F, 0.9F, -0.5F, 1, 1, 1, 0F,0.1F, -0.5F, -0.05F, 0.1F, -0.5F, -0.05F, 0.1F, -0.5F, -0.05F, 0.1F, -0.5F, -0.05F, 0.1F, 0.0F, -0.05F, 0.1F, 0.0F, -0.05F, 0.1F, 0.0F, -0.05F, 0.1F, 0.0F, -0.05F); // Import 

		gun_1_Model[1][2].addShapeBox(-2.8F, 1.4F, -0.5F, 1, 1, 1, 0F,-0.2F, -0.4F, 0.05F, -0.2F, -0.4F, 0.05F, -0.2F, -0.4F, 0.05F, -0.2F, -0.4F, 0.05F, -0.2F, -0.4F, 0.05F, -0.2F, -0.4F, 0.05F, -0.2F, -0.4F, 0.05F, -0.2F, -0.4F, 0.05F); // Import 

		gun_1_Model[1][3].addShapeBox(-2.8F, 1.4F, -0.5F, 1, 1, 1, 0F,-0.4F, -0.2F, 0.05F, -0.4F, -0.2F, 0.05F, -0.4F, -0.2F, 0.05F, -0.4F, -0.2F, 0.05F, -0.2F, -0.6F, 0.05F, -0.2F, -0.6F, 0.05F, -0.2F, -0.6F, 0.05F, -0.2F, -0.6F, 0.05F); // Import 

		gun_1_Model[1][4].addShapeBox(-2.8F, 1.4F, -0.5F, 1, 1, 1, 0F,-0.2F, -0.6F, 0.05F, -0.2F, -0.6F, 0.05F, -0.2F, -0.6F, 0.05F, -0.2F, -0.6F, 0.05F, -0.4F, -0.2F, 0.05F, -0.4F, -0.2F, 0.05F, -0.4F, -0.2F, 0.05F, -0.4F, -0.2F, 0.05F); // Import 

		gun_1_Model[1][5].addShapeBox(-7F, 0.2F, -0.5F, 6, 1, 1, 0F,0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F); // Import 

		gun_1_Model[1][6].addShapeBox(-1.7F, 1.4F, -0.5F, 1, 1, 1, 0F,0.0F, 0.0F, -0.05F, -0.5F, 0.0F, -0.05F, -0.5F, 0.0F, -0.05F, 0.0F, 0.0F, -0.05F, 0.0F, -0.7F, -0.05F, -0.5F, -0.9F, -0.05F, -0.5F, -0.9F, -0.05F, 0.0F, -0.7F, -0.05F); // Import 

		gun_1_Model[1][7].addShapeBox(-7F, -0.8F, -0.5F, 3, 1, 1, 0F,-0.1F, -0.8F, -0.2F, -0.1F, -0.8F, -0.2F, -0.1F, -0.8F, -0.2F, -0.1F, -0.8F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F); // Import 

		gun_1_Model[1][8].addShapeBox(-6F, 0.2F, -0.5F, 5, 1, 1, 0F,0.0F, -0.2F, 0.05F, 0.0F, -0.2F, 0.05F, 0.0F, -0.2F, 0.05F, 0.0F, -0.2F, 0.05F, 0.0F, -0.2F, 0.05F, 0.0F, -0.2F, 0.05F, 0.0F, -0.2F, 0.05F, 0.0F, -0.2F, 0.05F); // Import 

		gun_1_Model[1][9].addShapeBox(-1.5F, -0.5F, -1F, 2, 2, 2, 0F,-0.5F, -1.4F, -0.2F, 0.0F, -1.4F, 0.0F, 0.0F, -1.4F, 0.0F, -0.5F, -1.4F, -0.2F, -0.5F, -0.1F, -0.7F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, -0.1F, -0.7F); // Import 

		gun_1_Model[1][10].addShapeBox(-1.5F, -0.5F, -1F, 2, 2, 2, 0F,-0.5F, -0.7F, -0.2F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, -0.5F, -0.7F, -0.2F, -0.5F, -0.6F, -0.2F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, -0.5F, -0.6F, -0.2F); // Import 

		gun_1_Model[1][11].addShapeBox(-5.7F, 2.4F, -0.5F, 1, 1, 1, 0F,0.2F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.2F, 0.0F, -0.3F, 0.3F, -0.5F, -0.3F, -0.2F, -0.5F, -0.3F, -0.2F, -0.5F, -0.3F, 0.3F, -0.5F, -0.3F); // Import 

		gun_1_Model[1][12].addShapeBox(-5.7F, 1.4F, -0.5F, 1, 1, 1, 0F,-0.1F, 0.0F, -0.3F, 0.2F, 0.0F, -0.3F, 0.2F, 0.0F, -0.3F, -0.1F, 0.0F, -0.3F, 0.2F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.2F, 0.0F, -0.3F); // Import 

		gun_1_Model[1][13].addShapeBox(-5.7F, 2.4F, -0.5F, 1, 1, 1, 0F,0.3F, -0.5F, -0.3F, -0.2F, -0.5F, -0.3F, -0.2F, -0.5F, -0.3F, 0.3F, -0.5F, -0.3F, 0.3F, -0.2F, -0.3F, -0.1F, -0.2F, -0.3F, -0.1F, -0.2F, -0.3F, 0.3F, -0.2F, -0.3F); // Import 

		gun_1_Model[1][14].addShapeBox(-5.7F, 3F, -0.5F, 1, 1, 1, 0F,0.3F, -0.2F, -0.3F, -0.1F, -0.2F, -0.3F, -0.1F, -0.2F, -0.3F, 0.3F, -0.2F, -0.3F, 0.1F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, 0.1F, -0.5F, -0.3F); // Import 

		gun_1_Model[1][15].addShapeBox(-5.7F, 1.4F, -0.5F, 1, 1, 1, 0F,-0.3F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.2F, 0.0F, -0.7F, -0.1F, 0.0F, -0.7F, 0.0F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, 0.0F, 0.0F, -0.7F, 0.2F, 0.0F, -0.7F); // Import 

		gun_1_Model[1][16].addShapeBox(-5.7F, 2.4F, -0.5F, 1, 1, 1, 0F,0.0F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, 0.0F, 0.0F, -0.7F, 0.2F, 0.0F, -0.7F, 0.1F, -0.5F, -0.2F, -0.4F, -0.5F, -0.2F, -0.2F, -0.5F, -0.7F, 0.3F, -0.5F, -0.7F); // Import 

		gun_1_Model[1][17].addShapeBox(-5.7F, 2.4F, -0.5F, 1, 1, 1, 0F,0.1F, -0.5F, -0.2F, -0.4F, -0.5F, -0.2F, -0.2F, -0.5F, -0.7F, 0.3F, -0.5F, -0.7F, 0.1F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.1F, -0.2F, -0.7F, 0.3F, -0.2F, -0.7F); // Import 

		gun_1_Model[1][18].addShapeBox(-5.7F, 3F, -0.5F, 1, 1, 1, 0F,0.1F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.1F, -0.2F, -0.7F, 0.3F, -0.2F, -0.7F, -0.1F, -0.6F, -0.2F, -0.5F, -0.6F, -0.2F, -0.3F, -0.5F, -0.7F, 0.1F, -0.5F, -0.7F); // Import 

		gun_1_Model[1][19].addShapeBox(-5.7F, 3F, -0.5F, 1, 1, 1, 0F,0.3F, -0.2F, -0.7F, -0.1F, -0.2F, -0.7F, -0.3F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.5F, -0.7F, -0.3F, -0.5F, -0.7F, -0.5F, -0.6F, -0.2F, -0.1F, -0.6F, -0.2F); // Import 

		gun_1_Model[1][20].addShapeBox(-5.7F, 2.4F, -0.5F, 1, 1, 1, 0F,0.3F, -0.5F, -0.7F, -0.2F, -0.5F, -0.7F, -0.4F, -0.5F, -0.2F, 0.1F, -0.5F, -0.2F, 0.3F, -0.2F, -0.7F, -0.1F, -0.2F, -0.7F, -0.3F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F); // Import 

		gun_1_Model[1][21].addShapeBox(-5.7F, 2.4F, -0.5F, 1, 1, 1, 0F,0.2F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, -0.2F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.3F, -0.5F, -0.7F, -0.2F, -0.5F, -0.7F, -0.4F, -0.5F, -0.2F, 0.1F, -0.5F, -0.2F); // Import 

		gun_1_Model[1][22].addShapeBox(-5.7F, 1.4F, -0.5F, 1, 1, 1, 0F,-0.1F, 0.0F, -0.7F, 0.2F, 0.0F, -0.7F, 0.0F, 0.0F, -0.2F, -0.3F, 0.0F, -0.2F, 0.2F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, -0.2F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F); // Import 

		gun_1_Model[1][23].addShapeBox(-2.75F, -1.5F, -0.5F, 2, 1, 1, 0F,0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F); // Import 

		gun_1_Model[1][24].addShapeBox(-0.55F, -1.85F, -1F, 1, 2, 2, 0F,0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F); // Import 

		gun_1_Model[1][25].addShapeBox(-3.95F, -1.85F, -1F, 1, 2, 2, 0F,0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F); // Import 

		gun_1_Model[1][26].addShapeBox(-3.95F, -1.85F, 1.2F, 2, 2, 1, 0F,-1.0F, -0.5F, 0.7F, -0.3F, -0.5F, 0.0F, -0.8F, -0.5F, 0.0F, 0.0F, -0.5F, -1.2F, -1.0F, 0.0F, 0.7F, -0.3F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, 0.0F, 0.0F, -1.2F); // Import 

		gun_1_Model[1][27].addShapeBox(-1.55F, -1.85F, 1.2F, 2, 2, 1, 0F,-0.3F, -0.5F, 0.0F, -1.0F, -0.5F, 0.7F, 0.0F, -0.5F, -1.2F, -0.8F, -0.5F, 0.0F, -0.3F, 0.0F, 0.0F, -1.0F, 0.0F, 0.7F, 0.0F, 0.0F, -1.2F, -0.8F, 0.0F, 0.0F); // Import 

		gun_1_Model[1][28].addShapeBox(-2.75F, -1.85F, 1.2F, 2, 2, 1, 0F,-0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import 

		gun_1_Model[1][29].addShapeBox(-3.25F, -1.85F, -1.5F, 3, 2, 3, 0F,0.0F, -0.55F, 0.0F, 0.0F, -0.55F, 0.0F, 0.0F, -0.55F, 0.0F, 0.0F, -0.55F, 0.0F, 0.0F, -0.05F, 0.0F, 0.0F, -0.05F, 0.0F, 0.0F, -0.05F, 0.0F, 0.0F, -0.05F, 0.0F); // Import 

		gun_1_Model[1][30].addShapeBox(-3.95F, -1.85F, -2.2F, 2, 2, 1, 0F,0.0F, -0.5F, -1.2F, -0.8F, -0.5F, 0.0F, -0.3F, -0.5F, 0.0F, -1.0F, -0.5F, 0.7F, 0.0F, 0.0F, -1.2F, -0.8F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -1.0F, 0.0F, 0.7F); // Import 

		gun_1_Model[1][31].addShapeBox(-1.55F, -1.85F, -2.2F, 2, 2, 1, 0F,-0.8F, -0.5F, 0.0F, 0.0F, -0.5F, -1.2F, -1.0F, -0.5F, 0.7F, -0.3F, -0.5F, 0.0F, -0.8F, 0.0F, 0.0F, 0.0F, 0.0F, -1.2F, -1.0F, 0.0F, 0.7F, -0.3F, 0.0F, 0.0F); // Import 

		gun_1_Model[1][32].addShapeBox(-2.75F, -1.85F, -2.2F, 2, 2, 1, 0F,0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F); // Import 

		gun_1_Model[1][33].addShapeBox(0.5F, -0.3F, -0.5F, 3, 1, 1, 0F,0.0F, -0.1F, -0.1F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.1F, -0.1F); // Import 

		gun_1_Model[1][34].addShapeBox(3.5F, -0.3F, -0.5F, 9, 1, 1, 0F,0.0F, -0.2F, -0.2F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.2F, -0.2F); // Import 

		gun_1_Model[1][35].addShapeBox(0.5F, 0.5F, -0.5F, 11, 1, 1, 0F,0.0F, -0.22F, -0.22F, 0.0F, -0.22F, -0.22F, 0.0F, -0.22F, -0.22F, 0.0F, -0.22F, -0.22F, 0.0F, -0.22F, -0.22F, 0.0F, -0.22F, -0.22F, 0.0F, -0.22F, -0.22F, 0.0F, -0.22F, -0.22F); // Import 

		gun_1_Model[1][36].addShapeBox(2.8F, -0.3F, -0.5F, 1, 1, 1, 0F,-0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F); // Import 

		gun_1_Model[1][37].addShapeBox(10.1F, 0.5F, -0.5F, 1, 1, 1, 0F,-0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F); // Import 

		gun_1_Model[1][38].addShapeBox(10.1F, -0.5F, -0.5F, 1, 1, 1, 0F,-0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, 0.1F, -0.2F, -0.3F, 0.1F, -0.2F, -0.3F, 0.1F, -0.2F, -0.3F, 0.1F, -0.2F); // Import 

		gun_1_Model[1][39].addShapeBox(11.5F, -1F, -0.5F, 1, 1, 1, 0F,-0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F); // Import 

		gun_1_Model[1][40].addShapeBox(2.8F, -1.3F, -0.5F, 1, 1, 1, 0F,-0.35F, 0.0F, -0.35F, -0.35F, 0.0F, -0.35F, -0.35F, 0.0F, -0.35F, -0.35F, 0.0F, -0.35F, -0.35F, 0.1F, -0.35F, -0.35F, 0.1F, -0.35F, -0.35F, 0.1F, -0.35F, -0.35F, 0.1F, -0.35F); // Import 

		gun_1_Model[1][41].addShapeBox(2.8F, -2.3F, -0.5F, 1, 1, 1, 0F,-0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F); // Import 

		gun_1_Model[1][42].addShapeBox(2.8F, -1.5F, -0.5F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import 

		gun_1_Model[1][43].addShapeBox(2.8F, -2.7F, -0.5F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F); // Import 

		gun_1_Model[1][44].addShapeBox(-2.25F, -2.85F, -1F, 1, 2, 1, 0F,-0.3F, -0.7F, -0.2F, -0.3F, -0.7F, -0.2F, -0.3F, -0.7F, -0.4F, -0.3F, -0.7F, -0.4F, -0.3F, -0.5F, -0.2F, -0.3F, -0.5F, -0.2F, -0.3F, -0.5F, -0.4F, -0.3F, -0.5F, -0.4F); // Import 

		gun_1_Model[1][45].addShapeBox(-2.25F, -2.85F, 0F, 1, 2, 1, 0F,-0.3F, -0.7F, -0.4F, -0.3F, -0.7F, -0.4F, -0.3F, -0.7F, -0.2F, -0.3F, -0.7F, -0.2F, -0.3F, -0.5F, -0.4F, -0.3F, -0.5F, -0.4F, -0.3F, -0.5F, -0.2F, -0.3F, -0.5F, -0.2F); // Import 

		gun_1_Model[1][46].addShapeBox(-2.25F, -2.85F, -0.5F, 1, 1, 1, 0F,-0.3F, -0.7F, -0.1F, -0.3F, -0.7F, -0.1F, -0.3F, -0.7F, -0.1F, -0.3F, -0.7F, -0.1F, -0.3F, 0.0F, -0.1F, -0.3F, 0.0F, -0.1F, -0.3F, 0.0F, -0.1F, -0.3F, 0.0F, -0.1F); // Import 

		gun_1_Model[1][47].addShapeBox(2.8F, -3.7F, -1F, 1, 1, 1, 0F,-0.35F, -0.1F, 0.0F, -0.35F, -0.1F, 0.0F, -0.35F, -0.2F, -0.8F, -0.35F, -0.2F, -0.8F, -0.35F, -0.1F, 0.0F, -0.35F, -0.1F, 0.0F, -0.35F, -0.2F, -0.8F, -0.35F, -0.2F, -0.8F); // Import 

		gun_1_Model[1][48].addShapeBox(2.8F, -3.7F, 0F, 1, 1, 1, 0F,-0.35F, -0.2F, -0.8F, -0.35F, -0.2F, -0.8F, -0.35F, -0.1F, 0.0F, -0.35F, -0.1F, 0.0F, -0.35F, -0.2F, -0.8F, -0.35F, -0.2F, -0.8F, -0.35F, -0.1F, 0.0F, -0.35F, -0.1F, 0.0F); // Import 

		gun_1_Model[1][49].addShapeBox(2.8F, -4.2F, -1F, 1, 1, 2, 0F,-0.35F, 0.0F, -0.6F, -0.35F, 0.0F, -0.6F, -0.35F, 0.0F, -0.6F, -0.35F, 0.0F, -0.6F, -0.35F, -0.8F, -0.7F, -0.35F, -0.8F, -0.7F, -0.35F, -0.8F, -0.7F, -0.35F, -0.8F, -0.7F); // Import 

		gun_1_Model[1][50].addShapeBox(2.8F, -4.6F, -1F, 1, 1, 1, 0F,-0.35F, -0.4F, -0.6F, -0.35F, -0.4F, -0.6F, -0.35F, -0.6F, -0.3F, -0.35F, -0.6F, -0.3F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.1F, -0.8F, -0.35F, 0.1F, -0.8F); // Import 

		gun_1_Model[1][51].addShapeBox(2.8F, -4.6F, 0F, 1, 1, 1, 0F,-0.35F, -0.6F, -0.3F, -0.35F, -0.6F, -0.3F, -0.35F, -0.4F, -0.6F, -0.35F, -0.4F, -0.6F, -0.35F, 0.1F, -0.8F, -0.35F, 0.1F, -0.8F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F); // Import 

		gun_1_Model[1][52].addShapeBox(2.8F, -2.8F, -1F, 1, 1, 1, 0F,-0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.1F, -0.8F, -0.35F, 0.1F, -0.8F, -0.35F, -0.4F, -0.6F, -0.35F, -0.4F, -0.6F, -0.35F, -0.6F, -0.3F, -0.35F, -0.6F, -0.3F); // Import 

		gun_1_Model[1][53].addShapeBox(2.8F, -2.8F, 0F, 1, 1, 1, 0F,-0.35F, 0.1F, -0.8F, -0.35F, 0.1F, -0.8F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, -0.6F, -0.3F, -0.35F, -0.6F, -0.3F, -0.35F, -0.4F, -0.6F, -0.35F, -0.4F, -0.6F); // Import 

		gun_1_Model[1][54].addShapeBox(2.8F, -4.1F, -0.5F, 1, 2, 1, 0F,-0.47F, 0.0F, -0.47F, -0.47F, 0.0F, -0.47F, -0.47F, 0.0F, -0.47F, -0.47F, 0.0F, -0.47F, -0.47F, 0.0F, -0.47F, -0.47F, 0.0F, -0.47F, -0.47F, 0.0F, -0.47F, -0.47F, 0.0F, -0.47F); // Import 

		gun_1_Model[1][55].addShapeBox(2.8F, -3.7F, -1F, 1, 1, 2, 0F,-0.47F, -0.47F, -0.1F, -0.47F, -0.47F, -0.1F, -0.47F, -0.47F, -0.1F, -0.47F, -0.47F, -0.1F, -0.47F, -0.47F, -0.1F, -0.47F, -0.47F, -0.1F, -0.47F, -0.47F, -0.1F, -0.47F, -0.47F, -0.1F); // Import 

		gun_1_Model[1][56].addShapeBox(-4.7F, 1.4F, -0.5F, 1, 1, 1, 0F,0.0F, -0.4F, -0.3F, 0.0F, -1.1F, -0.3F, 0.0F, -1.1F, -0.3F, 0.0F, -0.4F, -0.3F, 0.0F, -0.4F, -0.3F, 0.0F, 0.3F, -0.3F, 0.0F, 0.3F, -0.3F, 0.0F, -0.4F, -0.3F); // Import 

		gun_1_Model[1][57].addShapeBox(-3.7F, 2.1F, -0.5F, 1, 1, 1, 0F,0.0F, -0.4F, -0.3F, -0.6F, -0.4F, -0.3F, -0.6F, -0.4F, -0.3F, 0.0F, -0.4F, -0.3F, 0.0F, -0.4F, -0.3F, -0.8F, -0.4F, -0.3F, -0.8F, -0.4F, -0.3F, 0.0F, -0.4F, -0.3F); // Import 

		gun_1_Model[1][58].addShapeBox(-4.2F, 0.7F, -0.5F, 1, 1, 1, 0F,0.0F, 0.0F, -0.3F, 0.0F, -1.1F, -0.3F, 0.0F, -1.1F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, -0.7F, -0.3F, -0.2F, 0.3F, -0.3F, -0.2F, 0.3F, -0.3F, 0.0F, -0.7F, -0.3F); // Import 

		gun_1_Model[1][59].addShapeBox(-3.5F, 1.4F, -0.5F, 1, 1, 1, 0F,-0.1F, -0.6F, -0.3F, -0.7F, -0.4F, -0.3F, -0.7F, -0.4F, -0.3F, -0.1F, -0.6F, -0.3F, 0.0F, 0.1F, -0.3F, -0.8F, 0.1F, -0.3F, -0.8F, 0.1F, -0.3F, 0.0F, 0.1F, -0.3F); // Import 

		gun_1_Model[1][60].addShapeBox(11.5F, -1.5F, -0.5F, 1, 1, 1, 0F,-0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.1F, -0.4F, -0.4F, 0.1F, -0.4F, -0.4F, 0.1F, -0.4F, -0.4F, 0.1F, -0.4F); // Import 

		gun_1_Model[1][61].addShapeBox(11.5F, -0.5F, -0.5F, 1, 1, 1, 0F,-0.35F, 0.0F, -0.35F, -0.35F, 0.0F, -0.35F, -0.35F, 0.0F, -0.35F, -0.35F, 0.0F, -0.35F, -0.35F, 0.0F, -0.35F, -0.35F, 0.0F, -0.35F, -0.35F, 0.0F, -0.35F, -0.35F, 0.0F, -0.35F); // Import 

		gun_1_Model[1][62].addShapeBox(11.5F, -2F, -0.5F, 1, 1, 1, 0F,-0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F); // Import 

		gun_1_Model[1][63].addShapeBox(11.5F, -2.5F, -0.5F, 1, 1, 1, 0F,-0.55F, 0.0F, -0.47F, -0.4F, 0.0F, -0.47F, -0.4F, 0.0F, -0.47F, -0.55F, 0.0F, -0.47F, -0.4F, 0.0F, -0.47F, -0.4F, 0.0F, -0.47F, -0.4F, 0.0F, -0.47F, -0.4F, 0.0F, -0.47F); // Import 

		gun_1_Model[1][64].addShapeBox(-7F, 1.4F, -0.5F, 3, 1, 1, 0F,0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, -0.1F, -0.8F, -0.3F, -0.1F, -0.8F, -0.3F, -0.1F, -0.8F, -0.3F, -0.1F, -0.8F, -0.3F); // Import 

		gun_1_Model[1][65].addShapeBox(-10F, 0.2F, -0.5F, 1, 1, 1, 0F,-0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F); // Import 

		gun_1_Model[1][66].addShapeBox(-10F, -0.6F, -0.5F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Import 

		gun_1_Model[1][67].addShapeBox(-10F, -0.2F, -0.5F, 1, 1, 1, 0F,-0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F); // Import 

		gun_1_Model[1][68].addShapeBox(-10F, 0.6F, -0.5F, 1, 1, 1, 0F,-0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F); // Import 

		gun_1_Model[1][69].addShapeBox(-10F, 1F, -0.5F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Import 

		gun_1_Model[1][70].addShapeBox(-10F, -0.6F, -0.5F, 1, 1, 1, 0F,-0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.2F, -0.8F, -0.2F, 0.0F, -0.8F, -0.2F, 0.0F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F); // Import 

		gun_1_Model[1][71].addShapeBox(-10F, 1F, -0.5F, 1, 1, 1, 0F,-0.2F, -0.8F, -0.2F, 0.0F, -0.8F, -0.2F, 0.0F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F); // Import 

		gun_1_Model[1][72].addShapeBox(-9.2F, 1.3F, -0.5F, 1, 1, 1, 0F,0.0F, -0.4F, -0.3F, 0.0F, -0.4F, -0.3F, 0.0F, -0.4F, -0.3F, 0.0F, -0.4F, -0.3F, 0.0F, -0.4F, -0.3F, 0.0F, -0.4F, -0.3F, 0.0F, -0.4F, -0.3F, 0.0F, -0.4F, -0.3F); // Import 

		gun_1_Model[1][73].addShapeBox(-8.2F, 1.3F, -0.5F, 1, 1, 1, 0F,0.0F, -0.4F, -0.3F, 0.0F, 0.1F, -0.3F, 0.0F, 0.1F, -0.3F, 0.0F, -0.4F, -0.3F, 0.0F, -0.4F, -0.3F, 0.0F, -0.9F, -0.3F, 0.0F, -0.9F, -0.3F, 0.0F, -0.4F, -0.3F); // Import 

		gun_1_Model[1][74].addShapeBox(-7.2F, 0.8F, -0.5F, 1, 1, 1, 0F,0.0F, -0.4F, -0.3F, -0.5F, 0.6F, -0.3F, -0.5F, 0.6F, -0.3F, 0.0F, -0.4F, -0.3F, 0.0F, -0.4F, -0.3F, -0.4F, -1.4F, -0.3F, -0.4F, -1.4F, -0.3F, 0.0F, -0.4F, -0.3F); // Import 

		gun_1_Model[1][75].addShapeBox(-7.2F, -0.4F, -0.5F, 1, 1, 1, 0F,0.0F, -0.4F, -0.3F, -0.4F, -1.4F, -0.3F, -0.4F, -1.4F, -0.3F, 0.0F, -0.4F, -0.3F, 0.0F, -0.4F, -0.3F, -0.5F, 0.6F, -0.3F, -0.5F, 0.6F, -0.3F, 0.0F, -0.4F, -0.3F); // Import 

		gun_1_Model[1][76].addShapeBox(-8.2F, -0.9F, -0.5F, 1, 1, 1, 0F,0.0F, -0.4F, -0.3F, 0.0F, -0.9F, -0.3F, 0.0F, -0.9F, -0.3F, 0.0F, -0.4F, -0.3F, 0.0F, -0.4F, -0.3F, 0.0F, 0.1F, -0.3F, 0.0F, 0.1F, -0.3F, 0.0F, -0.4F, -0.3F); // Import 

		gun_1_Model[1][77].addShapeBox(-9.2F, -0.9F, -0.5F, 1, 1, 1, 0F,0.0F, -0.4F, -0.3F, 0.0F, -0.4F, -0.3F, 0.0F, -0.4F, -0.3F, 0.0F, -0.4F, -0.3F, 0.0F, -0.4F, -0.3F, 0.0F, -0.4F, -0.3F, 0.0F, -0.4F, -0.3F, 0.0F, -0.4F, -0.3F); // Import 

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_1_Model[1])
		{
			gunPart.setRotationPoint(64F, -51F, 0F);
		}


		gun_1_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("TailGun", gun_1_Model);
	}
}