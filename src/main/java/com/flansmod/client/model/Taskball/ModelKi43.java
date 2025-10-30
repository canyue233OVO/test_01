//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Ki43
// Model Creator: 
// Created on: 19.05.2023 - 01:58:25
// Last changed on: 19.05.2023 - 01:58:25

package com.flansmod.client.model.Taskball; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelKi43 extends ModelPlane //Same as Filename
{
	int textureX = 1024;
	int textureY = 512;

	public ModelKi43() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[112];
		noseModel = new ModelRendererTurbo[38];
		tailModel = new ModelRendererTurbo[12];
		leftWingModel = new ModelRendererTurbo[13];
		rightWingModel = new ModelRendererTurbo[13];
		yawFlapModel = new ModelRendererTurbo[10];
		pitchFlapLeftModel = new ModelRendererTurbo[1];
		pitchFlapRightModel = new ModelRendererTurbo[1];
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

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 521, 1, textureX, textureY); // Box 10
		bodyModel[11] = new ModelRendererTurbo(this, 705, 1, textureX, textureY); // Box 12
		bodyModel[12] = new ModelRendererTurbo(this, 761, 1, textureX, textureY); // Box 13
		bodyModel[13] = new ModelRendererTurbo(this, 889, 1, textureX, textureY); // Box 15
		bodyModel[14] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 40
		bodyModel[15] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 41
		bodyModel[16] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 42
		bodyModel[17] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 43
		bodyModel[18] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 44
		bodyModel[19] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 45
		bodyModel[20] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Box 46
		bodyModel[21] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 47
		bodyModel[22] = new ModelRendererTurbo(this, 433, 41, textureX, textureY); // Box 48
		bodyModel[23] = new ModelRendererTurbo(this, 529, 41, textureX, textureY); // Box 49
		bodyModel[24] = new ModelRendererTurbo(this, 633, 41, textureX, textureY); // Box 50
		bodyModel[25] = new ModelRendererTurbo(this, 745, 41, textureX, textureY); // Box 51
		bodyModel[26] = new ModelRendererTurbo(this, 937, 57, textureX, textureY); // Box 81
		bodyModel[27] = new ModelRendererTurbo(this, 209, 65, textureX, textureY); // Box 82
		bodyModel[28] = new ModelRendererTurbo(this, 329, 65, textureX, textureY); // Box 83
		bodyModel[29] = new ModelRendererTurbo(this, 401, 65, textureX, textureY); // Box 84
		bodyModel[30] = new ModelRendererTurbo(this, 441, 65, textureX, textureY); // Box 85
		bodyModel[31] = new ModelRendererTurbo(this, 473, 65, textureX, textureY); // Box 86
		bodyModel[32] = new ModelRendererTurbo(this, 545, 65, textureX, textureY); // Box 87
		bodyModel[33] = new ModelRendererTurbo(this, 609, 65, textureX, textureY); // Box 88
		bodyModel[34] = new ModelRendererTurbo(this, 393, 81, textureX, textureY); // Box 89
		bodyModel[35] = new ModelRendererTurbo(this, 537, 81, textureX, textureY); // Box 90
		bodyModel[36] = new ModelRendererTurbo(this, 457, 89, textureX, textureY); // Box 91
		bodyModel[37] = new ModelRendererTurbo(this, 801, 65, textureX, textureY); // Box 93
		bodyModel[38] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 94
		bodyModel[39] = new ModelRendererTurbo(this, 833, 97, textureX, textureY); // Box 96
		bodyModel[40] = new ModelRendererTurbo(this, 881, 17, textureX, textureY); // Box 119
		bodyModel[41] = new ModelRendererTurbo(this, 697, 1, textureX, textureY); // Box 120
		bodyModel[42] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 121
		bodyModel[43] = new ModelRendererTurbo(this, 1017, 17, textureX, textureY); // Box 122
		bodyModel[44] = new ModelRendererTurbo(this, 753, 1, textureX, textureY); // Box 123
		bodyModel[45] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 124
		bodyModel[46] = new ModelRendererTurbo(this, 497, 113, textureX, textureY); // Box 125
		bodyModel[47] = new ModelRendererTurbo(this, 601, 81, textureX, textureY); // Box 126
		bodyModel[48] = new ModelRendererTurbo(this, 961, 113, textureX, textureY); // Box 127
		bodyModel[49] = new ModelRendererTurbo(this, 705, 81, textureX, textureY); // Box 128
		bodyModel[50] = new ModelRendererTurbo(this, 801, 89, textureX, textureY); // Box 129
		bodyModel[51] = new ModelRendererTurbo(this, 817, 121, textureX, textureY); // Box 130
		bodyModel[52] = new ModelRendererTurbo(this, 753, 17, textureX, textureY); // Box 465
		bodyModel[53] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 466
		bodyModel[54] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 467
		bodyModel[55] = new ModelRendererTurbo(this, 705, 1, textureX, textureY); // Box 468
		bodyModel[56] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 469
		bodyModel[57] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 470
		bodyModel[58] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 471
		bodyModel[59] = new ModelRendererTurbo(this, 809, 17, textureX, textureY); // Box 472
		bodyModel[60] = new ModelRendererTurbo(this, 345, 145, textureX, textureY); // Box 239
		bodyModel[61] = new ModelRendererTurbo(this, 673, 33, textureX, textureY); // Box 240
		bodyModel[62] = new ModelRendererTurbo(this, 953, 25, textureX, textureY); // Box 241
		bodyModel[63] = new ModelRendererTurbo(this, 825, 41, textureX, textureY); // Box 242
		bodyModel[64] = new ModelRendererTurbo(this, 137, 105, textureX, textureY); // Box 243
		bodyModel[65] = new ModelRendererTurbo(this, 113, 145, textureX, textureY); // Box 244
		bodyModel[66] = new ModelRendererTurbo(this, 385, 65, textureX, textureY); // Box 245
		bodyModel[67] = new ModelRendererTurbo(this, 193, 145, textureX, textureY); // Box 246
		bodyModel[68] = new ModelRendererTurbo(this, 673, 73, textureX, textureY); // Box 247
		bodyModel[69] = new ModelRendererTurbo(this, 745, 73, textureX, textureY); // Box 248
		bodyModel[70] = new ModelRendererTurbo(this, 1017, 89, textureX, textureY); // Box 250
		bodyModel[71] = new ModelRendererTurbo(this, 817, 105, textureX, textureY); // Box 251
		bodyModel[72] = new ModelRendererTurbo(this, 345, 49, textureX, textureY); // Box 252
		bodyModel[73] = new ModelRendererTurbo(this, 569, 49, textureX, textureY); // Box 253
		bodyModel[74] = new ModelRendererTurbo(this, 753, 9, textureX, textureY); // Box 962
		bodyModel[75] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 964
		bodyModel[76] = new ModelRendererTurbo(this, 529, 25, textureX, textureY); // Box 966
		bodyModel[77] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 259
		bodyModel[78] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 260
		bodyModel[79] = new ModelRendererTurbo(this, 393, 145, textureX, textureY); // Box 256
		bodyModel[80] = new ModelRendererTurbo(this, 529, 65, textureX, textureY); // Box 249
		bodyModel[81] = new ModelRendererTurbo(this, 977, 65, textureX, textureY); // Box 254
		bodyModel[82] = new ModelRendererTurbo(this, 633, 25, textureX, textureY); // Box 263
		bodyModel[83] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 264
		bodyModel[84] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 265
		bodyModel[85] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 266
		bodyModel[86] = new ModelRendererTurbo(this, 417, 129, textureX, textureY); // Box 814
		bodyModel[87] = new ModelRendererTurbo(this, 401, 145, textureX, textureY); // Box 204
		bodyModel[88] = new ModelRendererTurbo(this, 497, 145, textureX, textureY); // Box 205
		bodyModel[89] = new ModelRendererTurbo(this, 1, 281, textureX, textureY); // Box 675
		bodyModel[90] = new ModelRendererTurbo(this, 9, 281, textureX, textureY); // Box 676
		bodyModel[91] = new ModelRendererTurbo(this, 17, 281, textureX, textureY); // Box 677
		bodyModel[92] = new ModelRendererTurbo(this, 25, 281, textureX, textureY); // Box 400
		bodyModel[93] = new ModelRendererTurbo(this, 33, 281, textureX, textureY); // Box 401
		bodyModel[94] = new ModelRendererTurbo(this, 41, 281, textureX, textureY); // Box 402
		bodyModel[95] = new ModelRendererTurbo(this, 49, 281, textureX, textureY); // Box 415
		bodyModel[96] = new ModelRendererTurbo(this, 65, 281, textureX, textureY); // Box 416
		bodyModel[97] = new ModelRendererTurbo(this, 81, 281, textureX, textureY); // Box 417
		bodyModel[98] = new ModelRendererTurbo(this, 97, 281, textureX, textureY); // Box 227
		bodyModel[99] = new ModelRendererTurbo(this, 105, 281, textureX, textureY); // Box 228
		bodyModel[100] = new ModelRendererTurbo(this, 113, 281, textureX, textureY); // Box 229
		bodyModel[101] = new ModelRendererTurbo(this, 121, 281, textureX, textureY); // Box 230
		bodyModel[102] = new ModelRendererTurbo(this, 129, 281, textureX, textureY); // Box 231
		bodyModel[103] = new ModelRendererTurbo(this, 137, 281, textureX, textureY); // Box 232
		bodyModel[104] = new ModelRendererTurbo(this, 41, 281, textureX, textureY); // Box 372
		bodyModel[105] = new ModelRendererTurbo(this, 33, 281, textureX, textureY); // Box 373
		bodyModel[106] = new ModelRendererTurbo(this, 25, 281, textureX, textureY); // Box 374
		bodyModel[107] = new ModelRendererTurbo(this, 41, 281, textureX, textureY); // Box 375
		bodyModel[108] = new ModelRendererTurbo(this, 33, 281, textureX, textureY); // Box 376
		bodyModel[109] = new ModelRendererTurbo(this, 25, 281, textureX, textureY); // Box 377
		bodyModel[110] = new ModelRendererTurbo(this, 1, 261, textureX, textureY); // Box 464
		bodyModel[111] = new ModelRendererTurbo(this, 33, 261, textureX, textureY); // Box 465

		bodyModel[0].addShapeBox(0F, 0F, 0F, 12, 12, 5, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -4F); // Box 0
		bodyModel[0].setRotationPoint(-36F, -43F, -11F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 10, 12, 5, 0F,0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -5F); // Box 1
		bodyModel[1].setRotationPoint(-46F, -43F, -11F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 21, 12, 12, 0F,0F, -2F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[2].setRotationPoint(-67F, -43F, -12F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 12, 10, 5, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 3
		bodyModel[3].setRotationPoint(-36F, -31F, -11F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 10, 10, 4, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 4
		bodyModel[4].setRotationPoint(-46F, -31F, -11F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 21, 10, 12, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 4F, 0F, 0F, 4F, 0F); // Box 5
		bodyModel[5].setRotationPoint(-67F, -31F, -12F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 21, 4, 9, 0F,0F, -0.9999F, -8.9999F, 0F, 0F, -4.9999F, 0F, 0F, 0F, 0F, -0.9999F, 0F, 0F, 1.9999F, 1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.9999F, 0F); // Box 6
		bodyModel[6].setRotationPoint(-67F, -47F, -9F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 10, 4, 9, 0F,0F, 0F, -5F, -3F, 0F, -5F, -3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -6F, 0F, 0F, -8F); // Box 7
		bodyModel[7].setRotationPoint(-46F, -47F, -9F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 18, 12, 10, 0F,0F, 0F, -3F, 0F, -1F, -4F, 0F, -1F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -9F); // Box 8
		bodyModel[8].setRotationPoint(-24F, -43F, -10F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 18, 10, 10, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -3F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 9
		bodyModel[9].setRotationPoint(-24F, -31F, -10F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 29, 11, 9, 0F,0F, 0F, -3F, 0F, -1F, -5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[10].setRotationPoint(-6F, -42F, -9F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 18, 2, 7, 0F,0F, -0.9999F, 0F, 0F, 0F, -5.9999F, 0F, 0F, 0F, 0F, -0.9999F, -5.9999F, 0F, -0.9999F, 0F, 0F, 0F, -0.9999F, 0F, 0F, 0F, 0F, -0.9999F, -5.9999F); // Box 12
		bodyModel[11].setRotationPoint(-24F, -44F, -7F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 29, 2, 6, 0F,0F, 0F, -5F, 0F, -1F, -6F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[12].setRotationPoint(-6F, -44F, -6F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 29, 9, 9, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, -5F, 0F, 1F, 0F, 0F, 3F, 0F); // Box 15
		bodyModel[13].setRotationPoint(-6F, -31F, -9F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[14].setRotationPoint(-36F, -51F, -7F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 41
		bodyModel[15].setRotationPoint(-36F, -51F, -4F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); // Box 42
		bodyModel[16].setRotationPoint(-39F, -51F, -4F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[17].setRotationPoint(-25F, -51F, -7F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 44
		bodyModel[18].setRotationPoint(-25F, -51F, -4F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[19].setRotationPoint(-36F, -51F, -4F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 10, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[20].setRotationPoint(-46F, -21F, -9F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[21].setRotationPoint(-36F, -21F, -8F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 18, 4, 8, 0F,0F, 0F, -1F, 0F, 1F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -4F, -1F, 0F, -5F, -2F, 0F, -2F, 0F, 0F, -0.5F, 0F); // Box 48
		bodyModel[22].setRotationPoint(-24F, -21F, -8F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 10, 5, 7, 0F,0F, 0F, 3F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[23].setRotationPoint(-46F, -26F, -7F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 12, 5, 7, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[24].setRotationPoint(-36F, -26F, -7F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 18, 5, 7, 0F,0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[25].setRotationPoint(-24F, -26F, -7F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 12, 12, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 81
		bodyModel[26].setRotationPoint(-36F, -43F, 6F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 10, 12, 5, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 82
		bodyModel[27].setRotationPoint(-46F, -43F, 6F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 21, 12, 12, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 83
		bodyModel[28].setRotationPoint(-67F, -43F, 0F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 12, 10, 5, 0F,0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -3F); // Box 84
		bodyModel[29].setRotationPoint(-36F, -31F, 6F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 10, 10, 4, 0F,0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -2F); // Box 85
		bodyModel[30].setRotationPoint(-46F, -31F, 7F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 21, 10, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, -3F, 0F, 0F, -1F); // Box 86
		bodyModel[31].setRotationPoint(-67F, -31F, 0F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 21, 4, 9, 0F,0F, -0.9999F, 0F, 0F, 0F, 0F, 0F, 0F, -4.9999F, 0F, -0.9999F, -8.9999F, 0F, 1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.9999F, 1.9999F); // Box 87
		bodyModel[32].setRotationPoint(-67F, -47F, 0F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 10, 4, 9, 0F,0F, 0F, 0F, -3F, 0F, -3F, -3F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -8F, 0F, 0F, -6F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 88
		bodyModel[33].setRotationPoint(-46F, -47F, 0F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 18, 12, 10, 0F,0F, 0F, -6F, 0F, -1F, 0F, 0F, -1F, -4F, 0F, 0F, -3F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 89
		bodyModel[34].setRotationPoint(-24F, -43F, 0F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 18, 10, 10, 0F,0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, -1F, -4F, 0F, 0F, -3F); // Box 90
		bodyModel[35].setRotationPoint(-24F, -31F, 0F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 29, 11, 9, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 91
		bodyModel[36].setRotationPoint(-6F, -42F, 0F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 18, 2, 7, 0F,0F, -0.9999F, -5.9999F, 0F, 0F, 0F, 0F, 0F, -5.9999F, 0F, -0.9999F, 0F, 0F, -0.9999F, -5.9999F, 0F, 0F, 0F, 0F, 0F, -0.9999F, 0F, -0.9999F, 0F); // Box 93
		bodyModel[37].setRotationPoint(-24F, -44F, 0F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 29, 2, 6, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -6F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -2F, 0F, 0F, 0F); // Box 94
		bodyModel[38].setRotationPoint(-6F, -44F, 0F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 29, 9, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 1F, 0F, 0F, -1F, -5F, 0F, 0F, -3F); // Box 96
		bodyModel[39].setRotationPoint(-6F, -31F, 0F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[40].setRotationPoint(-36F, -51F, 6F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[41].setRotationPoint(-36F, -51F, 0F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); // Box 121
		bodyModel[42].setRotationPoint(-39F, -51F, 3F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[43].setRotationPoint(-25F, -51F, 6F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[44].setRotationPoint(-25F, -51F, 0F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		bodyModel[45].setRotationPoint(-36F, -51F, 3F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 10, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -1F, 0F, -4F, 0F); // Box 125
		bodyModel[46].setRotationPoint(-46F, -21F, 0F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -4F, -1F, 0F, -4F, 0F); // Box 126
		bodyModel[47].setRotationPoint(-36F, -21F, 0F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 18, 4, 8, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -2F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -5F, -2F, 0F, -4F, -1F); // Box 127
		bodyModel[48].setRotationPoint(-24F, -21F, 0F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 10, 5, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[49].setRotationPoint(-46F, -26F, 0F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 12, 5, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[50].setRotationPoint(-36F, -26F, 0F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 18, 5, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -1F); // Box 130
		bodyModel[51].setRotationPoint(-24F, -26F, 0F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 465
		bodyModel[52].setRotationPoint(-40.5F, -47F, -1F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, 0F); // Box 466
		bodyModel[53].setRotationPoint(-40.5F, -47.5F, -1F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 467
		bodyModel[54].setRotationPoint(-39F, -47.75F, -1F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 468
		bodyModel[55].setRotationPoint(-39F, -46.75F, -1F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.6F, -0.25F, 0F); // Box 469
		bodyModel[56].setRotationPoint(-39.1F, -46.25F, -1F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.7F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.5F, 0F, -0.7F, -0.5F, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 470
		bodyModel[57].setRotationPoint(-40.5F, -48.5F, -1F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.7F, -0.5F, -0.3F, -0.2F, -0.5F, -0.3F, -0.2F, -0.3F, 0F, -0.7F, -0.3F, 0F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 471
		bodyModel[58].setRotationPoint(-40.5F, -48.5F, 0F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.1F); // Box 472
		bodyModel[59].setRotationPoint(-38.7F, -47.5F, -1F);

		bodyModel[60].addShapeBox(0F, 1F, 0F, 10, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
		bodyModel[60].setRotationPoint(-34F, -30.5F, -5F);
		bodyModel[60].rotateAngleZ = -0.10471976F;

		bodyModel[61].addShapeBox(9F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		bodyModel[61].setRotationPoint(-34F, -30.5F, -5F);
		bodyModel[61].rotateAngleZ = -0.10471976F;

		bodyModel[62].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		bodyModel[62].setRotationPoint(-34F, -30.5F, -5F);
		bodyModel[62].rotateAngleZ = -0.10471976F;

		bodyModel[63].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		bodyModel[63].setRotationPoint(-34F, -30.5F, 4F);
		bodyModel[63].rotateAngleZ = -0.10471976F;

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		bodyModel[64].setRotationPoint(-34F, -30.5F, -5F);
		bodyModel[64].rotateAngleZ = -0.10471976F;

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 17, 10, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		bodyModel[65].setRotationPoint(-25F, -46.5F, -5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[66].setRotationPoint(-23F, -50.5F, -3F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 17, 8, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 246
		bodyModel[67].setRotationPoint(-26F, -45.5F, -4F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[68].setRotationPoint(-26.3F, -45.8F, -2F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[69].setRotationPoint(-26.3F, -45.8F, 1F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 2, 18, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[70].setRotationPoint(-25F, -43.5F, -4F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 2, 18, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 251
		bodyModel[71].setRotationPoint(-25F, -43.5F, 3F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[72].setRotationPoint(-31F, -29.5F, -6F);
		bodyModel[72].rotateAngleZ = 0.78539816F;

		bodyModel[73].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 253
		bodyModel[73].setRotationPoint(-31F, -29.5F, 5F);
		bodyModel[73].rotateAngleZ = 0.78539816F;

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 962
		bodyModel[74].setRotationPoint(-23.5F, -50F, -1.5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 964
		bodyModel[75].setRotationPoint(-23.5F, -49F, -1.5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 966
		bodyModel[76].setRotationPoint(-23.5F, -48F, -1.5F);

		bodyModel[77].addShapeBox(0F, -3F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 259
		bodyModel[77].setRotationPoint(-45F, -26.5F, -6F);
		bodyModel[77].rotateAngleZ = 0.15707963F;

		bodyModel[78].addShapeBox(0F, -3F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
		bodyModel[78].setRotationPoint(-45F, -26.5F, 4F);
		bodyModel[78].rotateAngleZ = 0.15707963F;

		bodyModel[79].addShapeBox(0F, 0F, 0F, 7, 9, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 256
		bodyModel[79].setRotationPoint(-50F, -34.5F, -2F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 9, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[80].setRotationPoint(-42F, -27.5F, -2F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 10, 3, 3, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 254
		bodyModel[81].setRotationPoint(-42F, -28.5F, -1.5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 263
		bodyModel[82].setRotationPoint(-37.5F, -31.5F, -1F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 264
		bodyModel[83].setRotationPoint(-37F, -35.5F, -0.5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 265
		bodyModel[84].setRotationPoint(-37F, -37.5F, -0.5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 266
		bodyModel[85].setRotationPoint(-36.7F, -37.6F, -0.5F);

		bodyModel[86].addShapeBox(0F, -1F, -1F, 0, 75, 75, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -73F, 0F, 0F, -73F, 0F, -73F, 0F, 0F, -73F, 0F, 0F, -73F, -73F, 0F, -73F, -73F); // Box 814
		bodyModel[86].setRotationPoint(-39.5F, -48.5F, 0F);
		bodyModel[86].rotateAngleX = -0.01745329F;
		bodyModel[86].rotateAngleY = 0.01745329F;
		bodyModel[86].rotateAngleZ = -0.29670597F;

		bodyModel[87].addShapeBox(0F, 0F, 0F, 10, 8, 16, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 204
		bodyModel[87].setRotationPoint(-49F, -43F, -8F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 10, 3, 12, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		bodyModel[88].setRotationPoint(-49F, -46F, -6F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 675
		bodyModel[89].setRotationPoint(-39.75F, -44F, 2.5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 676
		bodyModel[90].setRotationPoint(-39.75F, -43.5F, 2.5F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 677
		bodyModel[91].setRotationPoint(-39.75F, -43.5F, 2.5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 400
		bodyModel[92].setRotationPoint(-39.75F, -44F, -4F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 401
		bodyModel[93].setRotationPoint(-39.75F, -43.5F, -4F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 402
		bodyModel[94].setRotationPoint(-39.75F, -43.5F, -4F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 415
		bodyModel[95].setRotationPoint(-39.75F, -45F, -1.25F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 416
		bodyModel[96].setRotationPoint(-39.75F, -44.5F, -1.25F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 417
		bodyModel[97].setRotationPoint(-39.75F, -43.5F, -1.25F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 227
		bodyModel[98].setRotationPoint(-39.75F, -42F, 1.5F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 228
		bodyModel[99].setRotationPoint(-39.75F, -41.5F, 1.5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 229
		bodyModel[100].setRotationPoint(-39.75F, -41.5F, 1.5F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 230
		bodyModel[101].setRotationPoint(-39.75F, -42F, -3.5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 231
		bodyModel[102].setRotationPoint(-39.75F, -41.5F, -3.5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 232
		bodyModel[103].setRotationPoint(-39.75F, -41.5F, -3.5F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 372
		bodyModel[104].setRotationPoint(-39.75F, -40.5F, -6F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 373
		bodyModel[105].setRotationPoint(-39.75F, -40.5F, -6F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 374
		bodyModel[106].setRotationPoint(-39.75F, -41F, -6F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 375
		bodyModel[107].setRotationPoint(-39.75F, -40.5F, 4F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 376
		bodyModel[108].setRotationPoint(-39.75F, -40.5F, 4F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 377
		bodyModel[109].setRotationPoint(-39.75F, -41F, 4F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 12, 0, 4, 0F,0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 464
		bodyModel[110].setRotationPoint(-24F, -48F, -2F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 7, 0, 4, 0F,0F, 3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -3F, 0F); // Box 465
		bodyModel[111].setRotationPoint(-12F, -45F, -2F);
	}

	private void initnoseModel_1()
	{
		noseModel[0] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 18
		noseModel[1] = new ModelRendererTurbo(this, 689, 17, textureX, textureY); // Box 19
		noseModel[2] = new ModelRendererTurbo(this, 753, 17, textureX, textureY); // Box 20
		noseModel[3] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 31
		noseModel[4] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 32
		noseModel[5] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 33
		noseModel[6] = new ModelRendererTurbo(this, 937, 33, textureX, textureY); // Box 52
		noseModel[7] = new ModelRendererTurbo(this, 801, 41, textureX, textureY); // Box 53
		noseModel[8] = new ModelRendererTurbo(this, 833, 41, textureX, textureY); // Box 54
		noseModel[9] = new ModelRendererTurbo(this, 969, 41, textureX, textureY); // Box 55
		noseModel[10] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 56
		noseModel[11] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 68
		noseModel[12] = new ModelRendererTurbo(this, 737, 17, textureX, textureY); // Box 69
		noseModel[13] = new ModelRendererTurbo(this, 793, 17, textureX, textureY); // Box 70
		noseModel[14] = new ModelRendererTurbo(this, 705, 49, textureX, textureY); // Box 71
		noseModel[15] = new ModelRendererTurbo(this, 569, 33, textureX, textureY); // Box 78
		noseModel[16] = new ModelRendererTurbo(this, 1001, 41, textureX, textureY); // Box 79
		noseModel[17] = new ModelRendererTurbo(this, 161, 89, textureX, textureY); // Box 99
		noseModel[18] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 100
		noseModel[19] = new ModelRendererTurbo(this, 841, 65, textureX, textureY); // Box 101
		noseModel[20] = new ModelRendererTurbo(this, 241, 73, textureX, textureY); // Box 110
		noseModel[21] = new ModelRendererTurbo(this, 1001, 57, textureX, textureY); // Box 111
		noseModel[22] = new ModelRendererTurbo(this, 593, 1, textureX, textureY); // Box 112
		noseModel[23] = new ModelRendererTurbo(this, 569, 105, textureX, textureY); // Box 131
		noseModel[24] = new ModelRendererTurbo(this, 737, 105, textureX, textureY); // Box 132
		noseModel[25] = new ModelRendererTurbo(this, 873, 121, textureX, textureY); // Box 133
		noseModel[26] = new ModelRendererTurbo(this, 49, 129, textureX, textureY); // Box 134
		noseModel[27] = new ModelRendererTurbo(this, 881, 1, textureX, textureY); // Box 135
		noseModel[28] = new ModelRendererTurbo(this, 961, 129, textureX, textureY); // Box 144
		noseModel[29] = new ModelRendererTurbo(this, 729, 57, textureX, textureY); // Box 145
		noseModel[30] = new ModelRendererTurbo(this, 49, 105, textureX, textureY); // Box 146
		noseModel[31] = new ModelRendererTurbo(this, 993, 129, textureX, textureY); // Box 147
		noseModel[32] = new ModelRendererTurbo(this, 121, 129, textureX, textureY); // Box 148
		noseModel[33] = new ModelRendererTurbo(this, 345, 129, textureX, textureY); // Box 149
		noseModel[34] = new ModelRendererTurbo(this, 481, 129, textureX, textureY); // Box 205
		noseModel[35] = new ModelRendererTurbo(this, 649, 137, textureX, textureY); // Box 206
		noseModel[36] = new ModelRendererTurbo(this, 857, 137, textureX, textureY); // Box 207
		noseModel[37] = new ModelRendererTurbo(this, 41, 145, textureX, textureY); // Box 208

		noseModel[0].addShapeBox(0F, 0F, 0F, 14, 10, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 4F, 0F, 0F, 4F, 0F); // Box 18
		noseModel[0].setRotationPoint(-81F, -31F, -14F);

		noseModel[1].addShapeBox(0F, 0F, 0F, 14, 10, 14, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		noseModel[1].setRotationPoint(-81F, -41F, -14F);

		noseModel[2].addShapeBox(0F, 0F, 0F, 14, 5, 11, 0F,0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		noseModel[2].setRotationPoint(-81F, -46F, -11F);

		noseModel[3].addShapeBox(0F, 0F, 0F, 11, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		noseModel[3].setRotationPoint(-81F, -19F, -4F);

		noseModel[4].addShapeBox(0F, 0F, 0F, 5, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, -3.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.9999F, -3.9999F, 0F, -2.9999F, 0F, 0F, 0F, 0F); // Box 32
		noseModel[4].setRotationPoint(-70F, -19F, -4F);

		noseModel[5].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,-0.5F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 4F, 0F, -0.5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -4F, 0F); // Box 33
		noseModel[5].setRotationPoint(-85F, -19F, -4F);

		noseModel[6].addShapeBox(0F, 0F, 0F, 4, 10, 9, 0F,0F, -3F, -8F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 52
		noseModel[6].setRotationPoint(-85F, -41F, -14F);

		noseModel[7].addShapeBox(0F, 0F, 0F, 4, 10, 9, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -3F, -8F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 53
		noseModel[7].setRotationPoint(-85F, -31F, -14F);

		noseModel[8].addShapeBox(0F, 0F, 0F, 4, 5, 11, 0F,0F, -8F, -5F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 4F, -5F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F); // Box 54
		noseModel[8].setRotationPoint(-85F, -46F, -11F);

		noseModel[9].addShapeBox(0F, 0F, 0F, 4, 5, 11, 0F,0F, 4F, -5F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, -8F, -5F, 0F, -5F, 0F, 0F, -1F, 0F, 0F, -6F, 0F); // Box 55
		noseModel[9].setRotationPoint(-85F, -21F, -11F);

		noseModel[10].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,-0.5F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, -0.5F, 0F, 0F); // Box 56
		noseModel[10].setRotationPoint(-85F, -19F, -3F);

		noseModel[11].addShapeBox(0F, 0F, 0F, 8, 6, 6, 0F,0F, -2F, -2F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		noseModel[11].setRotationPoint(-94F, -37F, -6F);

		noseModel[12].addShapeBox(0F, 0F, 0F, 4, 5, 5, 0F,0F, -4.9999F, -4.9999F, 0F, -0.9999F, -0.9999F, 0F, 0F, 0F, 0F, -4.9999F, 0F, 0F, 0F, -4.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		noseModel[12].setRotationPoint(-98F, -36F, -5F);

		noseModel[13].addShapeBox(0F, 0F, 0F, 4, 5, 5, 0F,0F, 0F, -4.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.9999F, -4.9999F, 0F, -0.9999F, -0.9999F, 0F, 0F, 0F, 0F, -4.9999F, 0F); // Box 70
		noseModel[13].setRotationPoint(-98F, -31F, -5F);

		noseModel[14].addShapeBox(0F, 0F, 0F, 8, 6, 6, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 71
		noseModel[14].setRotationPoint(-94F, -31F, -6F);

		noseModel[15].addShapeBox(0F, 0F, 0F, 5, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		noseModel[15].setRotationPoint(-86F, -31F, -6F);

		noseModel[16].addShapeBox(0F, 0F, 0F, 5, 6, 6, 0F,0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		noseModel[16].setRotationPoint(-86F, -37F, -6F);

		noseModel[17].addShapeBox(0F, 0F, 0F, 14, 10, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 99
		noseModel[17].setRotationPoint(-81F, -31F, 0F);

		noseModel[18].addShapeBox(0F, 0F, 0F, 14, 10, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		noseModel[18].setRotationPoint(-81F, -41F, 0F);

		noseModel[19].addShapeBox(0F, 0F, 0F, 14, 5, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		noseModel[19].setRotationPoint(-81F, -46F, 0F);

		noseModel[20].addShapeBox(0F, 0F, 0F, 11, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		noseModel[20].setRotationPoint(-81F, -19F, 0F);

		noseModel[21].addShapeBox(0F, 0F, 0F, 5, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.9999F, 0F, 0F, -2.9999F, -3.9999F, 0F, 0F, 0F); // Box 111
		noseModel[21].setRotationPoint(-70F, -19F, 0F);

		noseModel[22].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,-0.5F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 4F, 0F, -0.5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -4F, 0F); // Box 112
		noseModel[22].setRotationPoint(-85F, -19F, 3F);

		noseModel[23].addShapeBox(0F, 0F, 0F, 4, 10, 9, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, -8F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 131
		noseModel[23].setRotationPoint(-85F, -41F, 5F);

		noseModel[24].addShapeBox(0F, 0F, 0F, 4, 10, 9, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, -8F); // Box 132
		noseModel[24].setRotationPoint(-85F, -31F, 5F);

		noseModel[25].addShapeBox(0F, 0F, 0F, 4, 5, 11, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -8F, -5F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 4F, -5F); // Box 133
		noseModel[25].setRotationPoint(-85F, -46F, 0F);

		noseModel[26].addShapeBox(0F, 0F, 0F, 4, 5, 11, 0F,0F, 2F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 4F, -5F, 0F, -6F, 0F, 0F, -1F, 0F, 0F, -5F, 0F, 0F, -8F, -5F); // Box 134
		noseModel[26].setRotationPoint(-85F, -21F, 0F);

		noseModel[27].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,-0.5F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, -0.5F, 0F, 0F); // Box 135
		noseModel[27].setRotationPoint(-85F, -19F, 0F);

		noseModel[28].addShapeBox(0F, 0F, 0F, 8, 6, 6, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 144
		noseModel[28].setRotationPoint(-94F, -37F, 0F);

		noseModel[29].addShapeBox(0F, 0F, 0F, 4, 5, 5, 0F,0F, -4.9999F, 0F, 0F, 0F, 0F, 0F, -0.9999F, -0.9999F, 0F, -4.9999F, -4.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.9999F); // Box 145
		noseModel[29].setRotationPoint(-98F, -36F, 0F);

		noseModel[30].addShapeBox(0F, 0F, 0F, 4, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.9999F, 0F, -4.9999F, 0F, 0F, 0F, 0F, 0F, -0.9999F, -0.9999F, 0F, -4.9999F, -4.9999F); // Box 146
		noseModel[30].setRotationPoint(-98F, -31F, 0F);

		noseModel[31].addShapeBox(0F, 0F, 0F, 8, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -2F, -2F); // Box 147
		noseModel[31].setRotationPoint(-94F, -31F, 0F);

		noseModel[32].addShapeBox(0F, 0F, 0F, 5, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 148
		noseModel[32].setRotationPoint(-86F, -31F, 0F);

		noseModel[33].addShapeBox(0F, 0F, 0F, 5, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		noseModel[33].setRotationPoint(-86F, -37F, 0F);

		noseModel[34].addShapeBox(0F, -13F, -1F, 2, 26, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		noseModel[34].setRotationPoint(-82F, -31F, 0F);

		noseModel[35].addShapeBox(0F, -12F, -1F, 2, 24, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		noseModel[35].setRotationPoint(-82F, -31F, 0F);
		noseModel[35].rotateAngleX = -1.57079633F;

		noseModel[36].addShapeBox(0F, -12F, -1F, 2, 24, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		noseModel[36].setRotationPoint(-82F, -31F, 0F);
		noseModel[36].rotateAngleX = -0.78539816F;

		noseModel[37].addShapeBox(0F, -12F, -1F, 2, 24, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 208
		noseModel[37].setRotationPoint(-82F, -31F, 0F);
		noseModel[37].rotateAngleX = 0.78539816F;
	}

	private void inittailModel_1()
	{
		tailModel[0] = new ModelRendererTurbo(this, 601, 1, textureX, textureY); // Box 11
		tailModel[1] = new ModelRendererTurbo(this, 833, 1, textureX, textureY); // Box 14
		tailModel[2] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 16
		tailModel[3] = new ModelRendererTurbo(this, 969, 1, textureX, textureY); // Box 17
		tailModel[4] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 61
		tailModel[5] = new ModelRendererTurbo(this, 705, 57, textureX, textureY); // Box 64
		tailModel[6] = new ModelRendererTurbo(this, 593, 97, textureX, textureY); // Box 92
		tailModel[7] = new ModelRendererTurbo(this, 969, 73, textureX, textureY); // Box 95
		tailModel[8] = new ModelRendererTurbo(this, 913, 97, textureX, textureY); // Box 97
		tailModel[9] = new ModelRendererTurbo(this, 121, 81, textureX, textureY); // Box 98
		tailModel[10] = new ModelRendererTurbo(this, 225, 129, textureX, textureY); // Box 140
		tailModel[11] = new ModelRendererTurbo(this, 865, 129, textureX, textureY); // Box 143

		tailModel[0].addShapeBox(0F, 0F, 0F, 43, 9, 7, 0F,0F, 1F, -3F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 11
		tailModel[0].setRotationPoint(23F, -40F, -7F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 21, 6, 5, 0F,0F, 1F, -2F, 0F, 0F, -3F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		tailModel[1].setRotationPoint(66F, -38F, -5F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 43, 8, 7, 0F,0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -4F, -4F, 0F, -2F, 0F, 0F, 2F, 0F); // Box 16
		tailModel[2].setRotationPoint(23F, -31F, -7F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 21, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 17
		tailModel[3].setRotationPoint(66F, -32F, -5F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 20, 27, 2, 0F,-14F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, -2F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 61
		tailModel[4].setRotationPoint(67F, -65F, -2F);

		tailModel[5].addShapeBox(0F, 0F, 0F, 22, 2, 45, 0F,-18F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -18F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 64
		tailModel[5].setRotationPoint(64F, -36F, -47F);

		tailModel[6].addShapeBox(0F, 0F, 0F, 43, 9, 7, 0F,0F, 3F, 0F, 0F, 0F, 0F, 0F, -1F, -4F, 0F, 1F, -3F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, 0F, 0F); // Box 92
		tailModel[6].setRotationPoint(23F, -40F, 0F);

		tailModel[7].addShapeBox(0F, 0F, 0F, 21, 6, 5, 0F,0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, -3F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 95
		tailModel[7].setRotationPoint(66F, -38F, 0F);

		tailModel[8].addShapeBox(0F, 0F, 0F, 43, 8, 7, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -4F, -4F, 0F, 0F, -3F); // Box 97
		tailModel[8].setRotationPoint(23F, -31F, 0F);

		tailModel[9].addShapeBox(0F, 0F, 0F, 21, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -2F); // Box 98
		tailModel[9].setRotationPoint(66F, -32F, 0F);

		tailModel[10].addShapeBox(0F, 0F, 0F, 20, 27, 2, 0F,-14F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, -2F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 140
		tailModel[10].setRotationPoint(67F, -65F, 0F);

		tailModel[11].addShapeBox(0F, 0F, 0F, 22, 2, 45, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -18F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -18F, -0.5F, -2F); // Box 143
		tailModel[11].setRotationPoint(64F, -36F, 2F);
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 809, 17, textureX, textureY); // Box 23
		leftWingModel[1] = new ModelRendererTurbo(this, 961, 17, textureX, textureY); // Box 24
		leftWingModel[2] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 25
		leftWingModel[3] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 26
		leftWingModel[4] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 27
		leftWingModel[5] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 28
		leftWingModel[6] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 29
		leftWingModel[7] = new ModelRendererTurbo(this, 561, 25, textureX, textureY); // Box 30
		leftWingModel[8] = new ModelRendererTurbo(this, 833, 25, textureX, textureY); // Box 34
		leftWingModel[9] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 35
		leftWingModel[10] = new ModelRendererTurbo(this, 529, 25, textureX, textureY); // Box 37
		leftWingModel[11] = new ModelRendererTurbo(this, 633, 25, textureX, textureY); // Box 38
		leftWingModel[12] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 39

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 29, 4, 12, 0F,0F, -3F, 0F, -29F, -3F, 0F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, -29F, 0F, 0F, 0F, -2F, 3F, 0F, 0F, 1F); // Box 23
		leftWingModel[0].setRotationPoint(-6F, -26F, -19F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 18, 6, 12, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 0F); // Box 24
		leftWingModel[1].setRotationPoint(-24F, -28F, -19F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 22, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -2F); // Box 25
		leftWingModel[2].setRotationPoint(-46F, -28F, -19F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 14, 6, 12, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, -3F); // Box 26
		leftWingModel[3].setRotationPoint(-60F, -28F, -19F);

		leftWingModel[4].addShapeBox(0F, 0F, 0F, 7, 4, 9, 0F,-3F, -2F, -2F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, -3F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		leftWingModel[4].setRotationPoint(-67F, -25F, -19F);

		leftWingModel[5].addShapeBox(0F, 0F, 0F, 22, 6, 32, 0F,0F, 2F, 0F, -4F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -4F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		leftWingModel[5].setRotationPoint(-46F, -28F, -51F);

		leftWingModel[6].addShapeBox(0F, 0F, 0F, 14, 6, 32, 0F,0F, -1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		leftWingModel[6].setRotationPoint(-60F, -28F, -51F);

		leftWingModel[7].addShapeBox(0F, 0F, 0F, 18, 6, 32, 0F,4F, 2F, 0F, -8F, -2F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 4F, -3F, 0F, -8F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		leftWingModel[7].setRotationPoint(-24F, -28F, -51F);

		leftWingModel[8].addShapeBox(0F, 0F, 0F, 18, 8, 60, 0F,0F, 1F, 0F, -6F, 1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -6F, 0F, -6F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		leftWingModel[8].setRotationPoint(-46F, -33F, -111F);

		leftWingModel[9].addShapeBox(0F, 0F, 0F, 18, 8, 60, 0F,0F, 0F, 0F, -4F, 1F, 0F, -4F, -3F, 0F, 0F, -6F, 0F, 0F, -7F, 0F, -4F, -6F, 0F, -4F, 0F, 0F, 0F, -1F, 0F); // Box 35
		leftWingModel[9].setRotationPoint(-60F, -33F, -111F);

		leftWingModel[10].addShapeBox(0F, 0F, 0F, 12, 3, 10, 0F,0F, -1F, 0F, -3F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		leftWingModel[10].setRotationPoint(-46F, -34F, -121F);

		leftWingModel[11].addShapeBox(0F, 0F, 0F, 14, 3, 10, 0F,-6F, -1F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -6F, -1F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 38
		leftWingModel[11].setRotationPoint(-60F, -34F, -121F);

		leftWingModel[12].addShapeBox(0F, 0F, 0F, 8, 3, 7, 0F,0F, -1F, 0F, -3F, -1F, -3F, 0F, -1F, 0F, -3F, 0F, 0F, 0F, -1F, 0F, -3F, -1F, -3F, 0F, -1F, 0F, -3F, 0F, 0F); // Box 39
		leftWingModel[12].setRotationPoint(-37F, -34F, -118F);
	}

	private void initrightWingModel_1()
	{
		rightWingModel[0] = new ModelRendererTurbo(this, 65, 105, textureX, textureY); // Box 102
		rightWingModel[1] = new ModelRendererTurbo(this, 209, 105, textureX, textureY); // Box 103
		rightWingModel[2] = new ModelRendererTurbo(this, 273, 105, textureX, textureY); // Box 104
		rightWingModel[3] = new ModelRendererTurbo(this, 345, 105, textureX, textureY); // Box 105
		rightWingModel[4] = new ModelRendererTurbo(this, 705, 65, textureX, textureY); // Box 106
		rightWingModel[5] = new ModelRendererTurbo(this, 369, 105, textureX, textureY); // Box 107
		rightWingModel[6] = new ModelRendererTurbo(this, 505, 105, textureX, textureY); // Box 108
		rightWingModel[7] = new ModelRendererTurbo(this, 665, 105, textureX, textureY); // Box 109
		rightWingModel[8] = new ModelRendererTurbo(this, 713, 105, textureX, textureY); // Box 113
		rightWingModel[9] = new ModelRendererTurbo(this, 89, 121, textureX, textureY); // Box 114
		rightWingModel[10] = new ModelRendererTurbo(this, 449, 113, textureX, textureY); // Box 116
		rightWingModel[11] = new ModelRendererTurbo(this, 905, 113, textureX, textureY); // Box 117
		rightWingModel[12] = new ModelRendererTurbo(this, 641, 73, textureX, textureY); // Box 118

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 29, 4, 12, 0F,0F, 0F, 0F, 0F, -1F, 3F, -29F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 1F, 0F, -2F, 3F, -29F, 0F, 0F, 0F, 0F, 0F); // Box 102
		rightWingModel[0].setRotationPoint(-6F, -26F, 7F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 18, 6, 12, 0F,0F, 0F, -1F, 0F, -2F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		rightWingModel[1].setRotationPoint(-24F, -28F, 7F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 22, 6, 12, 0F,0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		rightWingModel[2].setRotationPoint(-46F, -28F, 7F);

		rightWingModel[3].addShapeBox(0F, 0F, 0F, 14, 6, 12, 0F,0F, -4F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 1F, -3F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		rightWingModel[3].setRotationPoint(-60F, -28F, 7F);

		rightWingModel[4].addShapeBox(0F, 0F, 0F, 7, 4, 9, 0F,0F, -2F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, -3F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, -1F, -2F); // Box 106
		rightWingModel[4].setRotationPoint(-67F, -25F, 10F);

		rightWingModel[5].addShapeBox(0F, 0F, 0F, 22, 6, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -3F, 0F, 0F, -3F, 0F); // Box 107
		rightWingModel[5].setRotationPoint(-46F, -28F, 19F);

		rightWingModel[6].addShapeBox(0F, 0F, 0F, 14, 6, 32, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F, 0F); // Box 108
		rightWingModel[6].setRotationPoint(-60F, -28F, 19F);

		rightWingModel[7].addShapeBox(0F, 0F, 0F, 18, 6, 32, 0F,0F, 0F, 0F, 0F, -5F, 0F, -8F, -2F, 0F, 4F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, -3F, 0F, 4F, -3F, 0F); // Box 109
		rightWingModel[7].setRotationPoint(-24F, -28F, 19F);

		rightWingModel[8].addShapeBox(0F, 0F, 0F, 18, 8, 60, 0F,0F, -3F, 0F, 0F, -3F, 0F, -6F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -6F, 0F, 0F, -6F, 0F); // Box 113
		rightWingModel[8].setRotationPoint(-46F, -33F, 51F);

		rightWingModel[9].addShapeBox(0F, 0F, 0F, 18, 8, 60, 0F,0F, -6F, 0F, -4F, -3F, 0F, -4F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -4F, 0F, 0F, -4F, -6F, 0F, 0F, -7F, 0F); // Box 114
		rightWingModel[9].setRotationPoint(-60F, -33F, 51F);

		rightWingModel[10].addShapeBox(0F, 0F, 0F, 12, 3, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, -3F, 0F, -1F, 0F); // Box 116
		rightWingModel[10].setRotationPoint(-46F, -34F, 111F);

		rightWingModel[11].addShapeBox(0F, 0F, 0F, 14, 3, 10, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -6F, -1F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -6F, -1F, -3F); // Box 117
		rightWingModel[11].setRotationPoint(-60F, -34F, 111F);

		rightWingModel[12].addShapeBox(0F, 0F, 0F, 8, 3, 7, 0F,-3F, 0F, 0F, 0F, -1F, 0F, -3F, -1F, -3F, 0F, -1F, 0F, -3F, 0F, 0F, 0F, -1F, 0F, -3F, -1F, -3F, 0F, -1F, 0F); // Box 118
		rightWingModel[12].setRotationPoint(-37F, -34F, 111F);
	}

	private void inityawFlapModel_1()
	{
		yawFlapModel[0] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 57
		yawFlapModel[1] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 58
		yawFlapModel[2] = new ModelRendererTurbo(this, 857, 41, textureX, textureY); // Box 59
		yawFlapModel[3] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 60
		yawFlapModel[4] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Box 62
		yawFlapModel[5] = new ModelRendererTurbo(this, 649, 121, textureX, textureY); // Box 136
		yawFlapModel[6] = new ModelRendererTurbo(this, 81, 129, textureX, textureY); // Box 137
		yawFlapModel[7] = new ModelRendererTurbo(this, 193, 129, textureX, textureY); // Box 138
		yawFlapModel[8] = new ModelRendererTurbo(this, 569, 25, textureX, textureY); // Box 139
		yawFlapModel[9] = new ModelRendererTurbo(this, 273, 129, textureX, textureY); // Box 141

		yawFlapModel[0].addShapeBox(0F, 0F, 0F, 16, 6, 3, 0F,0F, 0F, -1F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		yawFlapModel[0].setRotationPoint(87F, -38F, -3F);

		yawFlapModel[1].addShapeBox(0F, 0F, 0F, 15, 15, 2, 0F,0F, 0F, 0F, -3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		yawFlapModel[1].setRotationPoint(87F, -53F, -2F);

		yawFlapModel[2].addShapeBox(0F, 0F, 0F, 12, 8, 2, 0F,0F, 0F, 0F, -4F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		yawFlapModel[2].setRotationPoint(87F, -61F, -2F);

		yawFlapModel[3].addShapeBox(0F, 0F, 0F, 8, 4, 2, 0F,0F, 0F, 0F, -6F, 0F, -1F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		yawFlapModel[3].setRotationPoint(87F, -65F, -2F);

		yawFlapModel[4].addShapeBox(0F, 0F, 0F, 16, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -3F, -2F, -2F, -3F, -2F, 0F, 0F, 0F, 0F); // Box 62
		yawFlapModel[4].setRotationPoint(87F, -32F, -3F);

		yawFlapModel[5].addShapeBox(0F, 0F, 0F, 16, 6, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 136
		yawFlapModel[5].setRotationPoint(87F, -38F, 0F);

		yawFlapModel[6].addShapeBox(0F, 0F, 0F, 15, 15, 2, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 137
		yawFlapModel[6].setRotationPoint(87F, -53F, 0F);

		yawFlapModel[7].addShapeBox(0F, 0F, 0F, 12, 8, 2, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 138
		yawFlapModel[7].setRotationPoint(87F, -61F, 0F);

		yawFlapModel[8].addShapeBox(0F, 0F, 0F, 8, 4, 2, 0F,0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 139
		yawFlapModel[8].setRotationPoint(87F, -65F, 0F);

		yawFlapModel[9].addShapeBox(0F, 0F, 0F, 16, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, -3F, -2F, -2F, 0F, 0F, -2F); // Box 141
		yawFlapModel[9].setRotationPoint(87F, -32F, 0F);
	}

	private void initpitchFlapLeftModel_1()
	{
		pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 633, 49, textureX, textureY); // Box 63

		pitchFlapLeftModel[0].addShapeBox(0F, 0F, 0F, 10, 2, 45, 0F,0F, 0F, 0F, -6F, -0.5F, -3F, 0F, -0.5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -0.5F, -3F, 0F, -0.5F, -4F, 0F, 0F, 0F); // Box 63
		pitchFlapLeftModel[0].setRotationPoint(86F, -36F, -47F);
	}

	private void initpitchFlapRightModel_1()
	{
		pitchFlapRightModel[0] = new ModelRendererTurbo(this, 273, 129, textureX, textureY); // Box 142

		pitchFlapRightModel[0].addShapeBox(0F, 0F, 0F, 10, 2, 45, 0F,0F, 0F, 0F, 0F, -0.5F, -4F, -6F, -0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -4F, -6F, -0.5F, -3F, 0F, 0F, 0F); // Box 142
		pitchFlapRightModel[0].setRotationPoint(86F, -36F, 2F);
	}

	private void initpitchFlapLeftWingModel_1()
	{
		pitchFlapLeftWingModel[0] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 36

		pitchFlapLeftWingModel[0].addShapeBox(0F, 0F, 0F, 18, 8, 60, 0F,0F, 1F, 0F, -13F, 0F, 0F, 2F, -7F, 0F, -6F, -3F, 0F, 0F, -6F, 0F, -13F, -7F, 0F, 2F, 0F, 0F, -6F, 0F, 0F); // Box 36
		pitchFlapLeftWingModel[0].setRotationPoint(-34F, -33F, -111F);
	}

	private void initpitchFlapRightWingModel_1()
	{
		pitchFlapRightWingModel[0] = new ModelRendererTurbo(this, 545, 121, textureX, textureY); // Box 115

		pitchFlapRightWingModel[0].addShapeBox(0F, 0F, 0F, 18, 8, 60, 0F,-6F, -3F, 0F, 2F, -7F, 0F, -13F, 0F, 0F, 0F, 1F, 0F, -6F, 0F, 0F, 2F, 0F, 0F, -13F, -7F, 0F, 0F, -6F, 0F); // Box 115
		pitchFlapRightWingModel[0].setRotationPoint(-34F, -33F, 51F);
	}

	private void inittailWheelModel_1()
	{
		tailWheelModel[0] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Import TW_6
		tailWheelModel[1] = new ModelRendererTurbo(this, 177, 81, textureX, textureY); // Box 202
		tailWheelModel[2] = new ModelRendererTurbo(this, 961, 1, textureX, textureY); // Import TW_1
		tailWheelModel[3] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Import TW_2
		tailWheelModel[4] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Import TW_3
		tailWheelModel[5] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Import TW_4
		tailWheelModel[6] = new ModelRendererTurbo(this, 689, 25, textureX, textureY); // Import TW_5

		tailWheelModel[0].addShapeBox(0F, -4F, 0F, 12, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Import TW_6
		tailWheelModel[0].setRotationPoint(57F, -23.5F, -2F);
		tailWheelModel[0].rotateAngleZ = 0.13962634F;

		tailWheelModel[1].addShapeBox(0F, -4F, 0F, 12, 4, 1, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		tailWheelModel[1].setRotationPoint(57F, -23.5F, 1F);
		tailWheelModel[1].rotateAngleZ = 0.13962634F;

		tailWheelModel[2].addBox(0F, 0F, 0F, 5, 3, 1, 0F); // Import TW_1
		tailWheelModel[2].setRotationPoint(66F, -21F, -0.5F);

		tailWheelModel[3].addShapeBox(0F, 0F, 0F, 1, 6, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -3F, 0F, -0.25F, 3F, 0F, -0.25F, 3F, 0F, -0.25F, -3F, 0F, -0.25F); // Import TW_2
		tailWheelModel[3].setRotationPoint(65F, -25F, -1F);

		tailWheelModel[4].addShapeBox(0F, -4F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import TW_3
		tailWheelModel[4].setRotationPoint(65F, -25F, -1F);

		tailWheelModel[5].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import TW_4
		tailWheelModel[5].setRotationPoint(66F, -22F, -0.5F);

		tailWheelModel[6].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import TW_5
		tailWheelModel[6].setRotationPoint(66F, -18F, -0.5F);
	}

	private void initleftWingWheelModel_1()
	{
		leftWingWheelModel[0] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Import LWW_03
		leftWingWheelModel[1] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Import LWW_04
		leftWingWheelModel[2] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Import LWW_05
		leftWingWheelModel[3] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Import LWW_07
		leftWingWheelModel[4] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Import LWW_08
		leftWingWheelModel[5] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Import LWW_09
		leftWingWheelModel[6] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Import LWW_11
		leftWingWheelModel[7] = new ModelRendererTurbo(this, 329, 49, textureX, textureY); // Import LWW_12
		leftWingWheelModel[8] = new ModelRendererTurbo(this, 665, 57, textureX, textureY); // Import LWW_13
		leftWingWheelModel[9] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Import LWW_06

		leftWingWheelModel[0].addShapeBox(0F, 0F, 0F, 14, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import LWW_03
		leftWingWheelModel[0].setRotationPoint(-62F, 6F, -38F);

		leftWingWheelModel[1].addBox(0F, 0F, 0F, 14, 6, 4, 0F); // Import LWW_04
		leftWingWheelModel[1].setRotationPoint(-62F, 0F, -38F);

		leftWingWheelModel[2].addShapeBox(0F, 0F, 0F, 14, 4, 4, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LWW_05
		leftWingWheelModel[2].setRotationPoint(-62F, -4F, -38F);

		leftWingWheelModel[3].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F,-1.66666667F, 0F, 0F, 1.66666667F, 0F, 0F, 1.66666667F, 0F, 0F, -1.66666667F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LWW_07
		leftWingWheelModel[3].setRotationPoint(-56F, -4F, -34F);

		leftWingWheelModel[4].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,-2.08333333F, -2F, 0F, 2.08333333F, -2F, 0F, 2.29166667F, -1F, 0F, -2.29166667F, -1F, 0F, -1.66666667F, 0F, -3F, 1.66666667F, 0F, -3F, 1.66666667F, 0F, 2F, -1.66666667F, 0F, 2F); // Import LWW_08
		leftWingWheelModel[4].setRotationPoint(-56F, -8F, -37F);

		leftWingWheelModel[5].addShapeBox(0F, 0F, 0F, 2, 19, 2, 0F,-6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, -2.08333333F, 0F, 0F, 2.08333333F, 0F, 0F, 2.08333333F, 0F, 0F, -2.08333333F, 0F, 0F); // Import LWW_09
		leftWingWheelModel[5].setRotationPoint(-56F, -25F, -37F);

		leftWingWheelModel[6].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LWW_11
		leftWingWheelModel[6].setRotationPoint(-53.5F, -11F, -39.5F);

		leftWingWheelModel[7].addShapeBox(0F, 0F, 0F, 4, 17, 1, 0F,-5F, 0F, 1.04347826F, 5F, 0F, 1.04347826F, 5F, 0F, -1.64347826F, -5F, 0F, -1.64347826F, -1F, -2F, 4F, 6F, 0F, 4F, 6F, 0F, -4.6F, -1F, -2F, -4.6F); // Import LWW_12
		leftWingWheelModel[7].setRotationPoint(-58F, -14F, -37.5F);

		leftWingWheelModel[8].addShapeBox(0F, 0F, 0F, 4, 11, 1, 0F,-6F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, -0.6F, -6F, 0F, -0.6F, -3F, 0F, 1.04347826F, 3F, 0F, 1.04347826F, 3F, 0F, -1.64347826F, -3F, 0F, -1.64347826F); // Import LWW_13
		leftWingWheelModel[8].setRotationPoint(-56F, -25F, -37.5F);

		leftWingWheelModel[9].addBox(0F, 0F, 0F, 2, 2, 5, 0F); // Import LWW_06
		leftWingWheelModel[9].setRotationPoint(-56F, 2F, -38.5F);
	}

	private void initrightWingWheelModel_1()
	{
		rightWingWheelModel[0] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 150
		rightWingWheelModel[1] = new ModelRendererTurbo(this, 817, 137, textureX, textureY); // Box 151
		rightWingWheelModel[2] = new ModelRendererTurbo(this, 273, 145, textureX, textureY); // Box 152
		rightWingWheelModel[3] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 153
		rightWingWheelModel[4] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 154
		rightWingWheelModel[5] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 155
		rightWingWheelModel[6] = new ModelRendererTurbo(this, 937, 25, textureX, textureY); // Box 156
		rightWingWheelModel[7] = new ModelRendererTurbo(this, 881, 57, textureX, textureY); // Box 157
		rightWingWheelModel[8] = new ModelRendererTurbo(this, 273, 73, textureX, textureY); // Box 158
		rightWingWheelModel[9] = new ModelRendererTurbo(this, 673, 25, textureX, textureY); // Box 159

		rightWingWheelModel[0].addShapeBox(0F, 0F, 0F, 14, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 150
		rightWingWheelModel[0].setRotationPoint(-62F, 6F, 34F);

		rightWingWheelModel[1].addBox(0F, 0F, 0F, 14, 6, 4, 0F); // Box 151
		rightWingWheelModel[1].setRotationPoint(-62F, 0F, 34F);

		rightWingWheelModel[2].addShapeBox(0F, 0F, 0F, 14, 4, 4, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152
		rightWingWheelModel[2].setRotationPoint(-62F, -4F, 34F);

		rightWingWheelModel[3].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F,-1.66666667F, 0F, 0F, 1.66666667F, 0F, 0F, 1.66666667F, 0F, 0F, -1.66666667F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		rightWingWheelModel[3].setRotationPoint(-56F, -4F, 33F);

		rightWingWheelModel[4].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,-2.29166667F, -1F, 0F, 2.29166667F, -1F, 0F, 2.08333333F, -2F, 0F, -2.08333333F, -2F, 0F, -1.66666667F, 0F, 2F, 1.66666667F, 0F, 2F, 1.66666667F, 0F, -3F, -1.66666667F, 0F, -3F); // Box 154
		rightWingWheelModel[4].setRotationPoint(-56F, -8F, 35F);

		rightWingWheelModel[5].addShapeBox(0F, 0F, 0F, 2, 19, 2, 0F,-6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, -2.08333333F, 0F, 0F, 2.08333333F, 0F, 0F, 2.08333333F, 0F, 0F, -2.08333333F, 0F, 0F); // Box 155
		rightWingWheelModel[5].setRotationPoint(-56F, -25F, 35F);

		rightWingWheelModel[6].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 156
		rightWingWheelModel[6].setRotationPoint(-53.5F, -11F, 34.5F);

		rightWingWheelModel[7].addShapeBox(0F, 0F, 0F, 4, 17, 1, 0F,-5F, 0F, -1.64347826F, 5F, 0F, -1.64347826F, 5F, 0F, 1.04347826F, -5F, 0F, 1.04347826F, -1F, -2F, -4.6F, 6F, 0F, -4.6F, 6F, 0F, 4F, -1F, -2F, 4F); // Box 157
		rightWingWheelModel[7].setRotationPoint(-58F, -14F, 36.5F);

		rightWingWheelModel[8].addShapeBox(0F, 0F, 0F, 4, 11, 1, 0F,-6F, 0F, -0.6F, 5F, 0F, -0.6F, 5F, 0F, 0F, -6F, 0F, 0F, -3F, 0F, -1.64347826F, 3F, 0F, -1.64347826F, 3F, 0F, 1.04347826F, -3F, 0F, 1.04347826F); // Box 158
		rightWingWheelModel[8].setRotationPoint(-56F, -25F, 36.5F);

		rightWingWheelModel[9].addBox(0F, 0F, 0F, 2, 2, 5, 0F); // Box 159
		rightWingWheelModel[9].setRotationPoint(-56F, 2F, 33.5F);
	}

	private void initPropeller()
	{
		propellerModels = new ModelRendererTurbo[1][3];
		propellerModels[0] = makeProp1(-89F, -31F, 0F);
	}

	private ModelRendererTurbo[] makeProp1(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[3];
		prop[0] = new ModelRendererTurbo(this, 0, 153, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 153, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 0, 153, textureX, textureY);
		prop[0].addBox(-1F, -33F, -2F, 2, 33, 4, 0.0F);
		prop[1].addBox(-1F, -33F, -2F, 2, 33, 4, 0.0F);
		prop[2].addBox(-1F, -33F, -2F, 2, 33, 4, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		return prop;
	}
}