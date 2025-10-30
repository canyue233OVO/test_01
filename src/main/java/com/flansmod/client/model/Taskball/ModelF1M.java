//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: F1M
// Model Creator: 
// Created on: 18.05.2023 - 21:20:35
// Last changed on: 18.05.2023 - 21:20:35

package com.flansmod.client.model.Taskball; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelF1M extends ModelPlane //Same as Filename
{
	int textureX = 1024;
	int textureY = 512;

	public ModelF1M() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[124];
		noseModel = new ModelRendererTurbo[36];
		tailModel = new ModelRendererTurbo[20];
		bayModel = new ModelRendererTurbo[21];
		leftWingModel = new ModelRendererTurbo[43];
		rightWingModel = new ModelRendererTurbo[25];
		yawFlapModel = new ModelRendererTurbo[4];
		pitchFlapLeftModel = new ModelRendererTurbo[1];
		pitchFlapRightModel = new ModelRendererTurbo[1];
		pitchFlapLeftWingModel = new ModelRendererTurbo[3];
		pitchFlapRightWingModel = new ModelRendererTurbo[3];

		initbodyModel_1();
		initnoseModel_1();
		inittailModel_1();
		initbayModel_1();
		initleftWingModel_1();
		initrightWingModel_1();
		inityawFlapModel_1();
		initpitchFlapLeftModel_1();
		initpitchFlapRightModel_1();
		initpitchFlapLeftWingModel_1();
		initpitchFlapRightWingModel_1();

		initPropeller();

		initGuns();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 4
		bodyModel[3] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 5
		bodyModel[4] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 8
		bodyModel[5] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 9
		bodyModel[6] = new ModelRendererTurbo(this, 609, 1, textureX, textureY); // Box 11
		bodyModel[7] = new ModelRendererTurbo(this, 665, 1, textureX, textureY); // Box 12
		bodyModel[8] = new ModelRendererTurbo(this, 785, 1, textureX, textureY); // Box 15
		bodyModel[9] = new ModelRendererTurbo(this, 833, 1, textureX, textureY); // Box 16
		bodyModel[10] = new ModelRendererTurbo(this, 969, 1, textureX, textureY); // Box 19
		bodyModel[11] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 21
		bodyModel[12] = new ModelRendererTurbo(this, 649, 1, textureX, textureY); // Box 22
		bodyModel[13] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 23
		bodyModel[14] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 26
		bodyModel[15] = new ModelRendererTurbo(this, 929, 17, textureX, textureY); // Box 27
		bodyModel[16] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 30
		bodyModel[17] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Box 31
		bodyModel[18] = new ModelRendererTurbo(this, 905, 33, textureX, textureY); // Box 58
		bodyModel[19] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 59
		bodyModel[20] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 60
		bodyModel[21] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 61
		bodyModel[22] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 62
		bodyModel[23] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 63
		bodyModel[24] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 64
		bodyModel[25] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 65
		bodyModel[26] = new ModelRendererTurbo(this, 721, 9, textureX, textureY); // Box 66
		bodyModel[27] = new ModelRendererTurbo(this, 545, 1, textureX, textureY); // Box 67
		bodyModel[28] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 68
		bodyModel[29] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 69
		bodyModel[30] = new ModelRendererTurbo(this, 633, 49, textureX, textureY); // Box 84
		bodyModel[31] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 85
		bodyModel[32] = new ModelRendererTurbo(this, 537, 57, textureX, textureY); // Box 88
		bodyModel[33] = new ModelRendererTurbo(this, 697, 57, textureX, textureY); // Box 89
		bodyModel[34] = new ModelRendererTurbo(this, 577, 57, textureX, textureY); // Box 92
		bodyModel[35] = new ModelRendererTurbo(this, 617, 73, textureX, textureY); // Box 93
		bodyModel[36] = new ModelRendererTurbo(this, 185, 73, textureX, textureY); // Box 95
		bodyModel[37] = new ModelRendererTurbo(this, 825, 73, textureX, textureY); // Box 96
		bodyModel[38] = new ModelRendererTurbo(this, 697, 73, textureX, textureY); // Box 99
		bodyModel[39] = new ModelRendererTurbo(this, 273, 81, textureX, textureY); // Box 100
		bodyModel[40] = new ModelRendererTurbo(this, 825, 57, textureX, textureY); // Box 103
		bodyModel[41] = new ModelRendererTurbo(this, 761, 65, textureX, textureY); // Box 105
		bodyModel[42] = new ModelRendererTurbo(this, 281, 57, textureX, textureY); // Box 106
		bodyModel[43] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 107
		bodyModel[44] = new ModelRendererTurbo(this, 577, 81, textureX, textureY); // Box 110
		bodyModel[45] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Box 111
		bodyModel[46] = new ModelRendererTurbo(this, 433, 97, textureX, textureY); // Box 113
		bodyModel[47] = new ModelRendererTurbo(this, 497, 97, textureX, textureY); // Box 114
		bodyModel[48] = new ModelRendererTurbo(this, 385, 65, textureX, textureY); // Box 141
		bodyModel[49] = new ModelRendererTurbo(this, 617, 1, textureX, textureY); // Box 142
		bodyModel[50] = new ModelRendererTurbo(this, 897, 9, textureX, textureY); // Box 143
		bodyModel[51] = new ModelRendererTurbo(this, 897, 1, textureX, textureY); // Box 144
		bodyModel[52] = new ModelRendererTurbo(this, 961, 1, textureX, textureY); // Box 145
		bodyModel[53] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 146
		bodyModel[54] = new ModelRendererTurbo(this, 905, 1, textureX, textureY); // Box 147
		bodyModel[55] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 148
		bodyModel[56] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Box 149
		bodyModel[57] = new ModelRendererTurbo(this, 545, 9, textureX, textureY); // Box 150
		bodyModel[58] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 151
		bodyModel[59] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 152
		bodyModel[60] = new ModelRendererTurbo(this, 889, 121, textureX, textureY); // Box 493
		bodyModel[61] = new ModelRendererTurbo(this, 785, 105, textureX, textureY); // Box 494
		bodyModel[62] = new ModelRendererTurbo(this, 841, 105, textureX, textureY); // Box 495
		bodyModel[63] = new ModelRendererTurbo(this, 929, 49, textureX, textureY); // Box 578
		bodyModel[64] = new ModelRendererTurbo(this, 1017, 113, textureX, textureY); // Box 579
		bodyModel[65] = new ModelRendererTurbo(this, 833, 209, textureX, textureY); // Box 580
		bodyModel[66] = new ModelRendererTurbo(this, 297, 137, textureX, textureY); // Box 582
		bodyModel[67] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Box 583
		bodyModel[68] = new ModelRendererTurbo(this, 617, 57, textureX, textureY); // Box 584
		bodyModel[69] = new ModelRendererTurbo(this, 545, 113, textureX, textureY); // Box 585
		bodyModel[70] = new ModelRendererTurbo(this, 761, 57, textureX, textureY); // Box 586
		bodyModel[71] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 587
		bodyModel[72] = new ModelRendererTurbo(this, 857, 209, textureX, textureY); // Box 588
		bodyModel[73] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 589
		bodyModel[74] = new ModelRendererTurbo(this, 97, 121, textureX, textureY); // Box 590
		bodyModel[75] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 591
		bodyModel[76] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Box 592
		bodyModel[77] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 593
		bodyModel[78] = new ModelRendererTurbo(this, 1009, 89, textureX, textureY); // Box 594
		bodyModel[79] = new ModelRendererTurbo(this, 273, 161, textureX, textureY); // Box 239
		bodyModel[80] = new ModelRendererTurbo(this, 249, 121, textureX, textureY); // Box 240
		bodyModel[81] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 241
		bodyModel[82] = new ModelRendererTurbo(this, 337, 49, textureX, textureY); // Box 242
		bodyModel[83] = new ModelRendererTurbo(this, 345, 121, textureX, textureY); // Box 243
		bodyModel[84] = new ModelRendererTurbo(this, 881, 209, textureX, textureY); // Box 244
		bodyModel[85] = new ModelRendererTurbo(this, 409, 121, textureX, textureY); // Box 245
		bodyModel[86] = new ModelRendererTurbo(this, 905, 209, textureX, textureY); // Box 246
		bodyModel[87] = new ModelRendererTurbo(this, 857, 121, textureX, textureY); // Box 247
		bodyModel[88] = new ModelRendererTurbo(this, 385, 137, textureX, textureY); // Box 248
		bodyModel[89] = new ModelRendererTurbo(this, 465, 137, textureX, textureY); // Box 250
		bodyModel[90] = new ModelRendererTurbo(this, 473, 137, textureX, textureY); // Box 251
		bodyModel[91] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 252
		bodyModel[92] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 253
		bodyModel[93] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 962
		bodyModel[94] = new ModelRendererTurbo(this, 841, 17, textureX, textureY); // Box 964
		bodyModel[95] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 966
		bodyModel[96] = new ModelRendererTurbo(this, 985, 17, textureX, textureY); // Box 259
		bodyModel[97] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 260
		bodyModel[98] = new ModelRendererTurbo(this, 377, 161, textureX, textureY); // Box 256
		bodyModel[99] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 249
		bodyModel[100] = new ModelRendererTurbo(this, 945, 81, textureX, textureY); // Box 254
		bodyModel[101] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 263
		bodyModel[102] = new ModelRendererTurbo(this, 593, 1, textureX, textureY); // Box 264
		bodyModel[103] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 265
		bodyModel[104] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 266
		bodyModel[105] = new ModelRendererTurbo(this, 929, 209, textureX, textureY); // Box 283
		bodyModel[106] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); // Box 284
		bodyModel[107] = new ModelRendererTurbo(this, 1, 281, textureX, textureY); // Box 675
		bodyModel[108] = new ModelRendererTurbo(this, 9, 281, textureX, textureY); // Box 676
		bodyModel[109] = new ModelRendererTurbo(this, 17, 281, textureX, textureY); // Box 677
		bodyModel[110] = new ModelRendererTurbo(this, 25, 281, textureX, textureY); // Box 400
		bodyModel[111] = new ModelRendererTurbo(this, 33, 281, textureX, textureY); // Box 401
		bodyModel[112] = new ModelRendererTurbo(this, 41, 281, textureX, textureY); // Box 402
		bodyModel[113] = new ModelRendererTurbo(this, 49, 281, textureX, textureY); // Box 415
		bodyModel[114] = new ModelRendererTurbo(this, 65, 281, textureX, textureY); // Box 416
		bodyModel[115] = new ModelRendererTurbo(this, 81, 281, textureX, textureY); // Box 417
		bodyModel[116] = new ModelRendererTurbo(this, 97, 281, textureX, textureY); // Box 227
		bodyModel[117] = new ModelRendererTurbo(this, 105, 281, textureX, textureY); // Box 228
		bodyModel[118] = new ModelRendererTurbo(this, 113, 281, textureX, textureY); // Box 229
		bodyModel[119] = new ModelRendererTurbo(this, 121, 281, textureX, textureY); // Box 230
		bodyModel[120] = new ModelRendererTurbo(this, 129, 281, textureX, textureY); // Box 231
		bodyModel[121] = new ModelRendererTurbo(this, 137, 281, textureX, textureY); // Box 232
		bodyModel[122] = new ModelRendererTurbo(this, 137, 281, textureX, textureY); // Box 279
		bodyModel[123] = new ModelRendererTurbo(this, 161, 281, textureX, textureY); // Box 280

		bodyModel[0].addShapeBox(0F, 0F, 0F, 11, 7, 13, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-57F, -30F, -13F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 19, 7, 13, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[1].setRotationPoint(-76F, -30F, -13F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 19, 7, 4, 0F,0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -3F); // Box 4
		bodyModel[2].setRotationPoint(-46F, -30F, -13F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 28, 7, 5, 0F,0F, 0F, -1F, 0F, -1F, -4F, 0F, -1F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -4F); // Box 5
		bodyModel[3].setRotationPoint(-27F, -30F, -11F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 11, 5, 12, 0F,0F, 0F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[4].setRotationPoint(-57F, -35F, -12F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 19, 5, 12, 0F,0F, -1F, -5F, 0F, 0F, -5F, 0F, 3F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[5].setRotationPoint(-76F, -35F, -12F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 11, 7, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[6].setRotationPoint(-57F, -23F, -13F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 19, 7, 13, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[7].setRotationPoint(-76F, -23F, -13F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 19, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, -1F, -3F, 0F, -1F, 0F, 0F, 0F, -2F); // Box 15
		bodyModel[8].setRotationPoint(-46F, -23F, -13F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 28, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, -2F, -4F, 0F, -2F, 0F, 0F, 0F, -3F); // Box 16
		bodyModel[9].setRotationPoint(-27F, -23F, -11F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 19, 5, 5, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -4F); // Box 19
		bodyModel[10].setRotationPoint(-46F, -35F, -12F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 11, 3, 7, 0F,0F, 0F, -6.9999F, 0F, 0F, -3.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.9999F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[11].setRotationPoint(-57F, -38F, -7F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 7, 3, 5, 0F,0F, 0F, -3.9999F, 0F, -2.9999F, 0.9999F, 0F, -2.9999F, -4.9999F, 0F, 0F, 0F, 0F, 0F, 0.9999F, 0F, 0F, 0.9999F, 0F, 0F, -4.9999F, 0F, 0F, -4.9999F); // Box 22
		bodyModel[12].setRotationPoint(-46F, -38F, -7F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 28, 5, 6, 0F,0F, 0F, -2F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 1F, -3F, 0F, 1F, -2F, 0F, 0F, -5F); // Box 23
		bodyModel[13].setRotationPoint(-27F, -35F, -10F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 11, 5, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 26
		bodyModel[14].setRotationPoint(-57F, -16F, -12F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 19, 5, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 27
		bodyModel[15].setRotationPoint(-76F, -16F, -12F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 19, 5, 12, 0F,0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -1F, -6F, 0F, 1F, 0F, 0F, 2F, 0F); // Box 30
		bodyModel[16].setRotationPoint(-46F, -16F, -12F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 28, 5, 10, 0F,0F, 0F, 0F, 0F, 2F, -3F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -3F, -6F, 0F, -2F, 0F, 0F, 2F, 0F); // Box 31
		bodyModel[17].setRotationPoint(-27F, -17F, -10F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 7, 2, 8, 0F,0F, 0F, -6.9999F, 0F, -1.9999F, -0.75F, 0F, -1.9999F, -6.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.749999999999999F, 0F, 0F, -6.3F, 0F, 0F, -6.9999F); // Box 58
		bodyModel[18].setRotationPoint(-27F, -37F, -8F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[19].setRotationPoint(-39F, -42F, -8F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 60
		bodyModel[20].setRotationPoint(-39F, -42F, -5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F); // Box 61
		bodyModel[21].setRotationPoint(-39F, -42F, -5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 62
		bodyModel[22].setRotationPoint(-43F, -42F, -3F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); // Box 63
		bodyModel[23].setRotationPoint(-46F, -42F, -3F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[24].setRotationPoint(-20F, -41F, -7F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 65
		bodyModel[25].setRotationPoint(-12F, -41F, -7F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[26].setRotationPoint(-20F, -41F, -3F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -4F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 2F, 0F, 4F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 2F); // Box 67
		bodyModel[27].setRotationPoint(-27F, -41F, -3F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 68
		bodyModel[28].setRotationPoint(-20F, -41F, -3F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 69
		bodyModel[29].setRotationPoint(-12F, -41F, -3F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 11, 7, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[30].setRotationPoint(-57F, -30F, 0F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 19, 7, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 85
		bodyModel[31].setRotationPoint(-76F, -30F, 0F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 19, 7, 4, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 88
		bodyModel[32].setRotationPoint(-46F, -30F, 9F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 28, 7, 5, 0F,0F, 0F, -3F, 0F, -1F, 0F, 0F, -1F, -4F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 89
		bodyModel[33].setRotationPoint(-27F, -30F, 6F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 11, 5, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		bodyModel[34].setRotationPoint(-57F, -35F, 0F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 19, 5, 12, 0F,0F, 2F, 0F, 0F, 3F, 0F, 0F, 0F, -5F, 0F, -1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		bodyModel[35].setRotationPoint(-76F, -35F, 0F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 11, 7, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 95
		bodyModel[36].setRotationPoint(-57F, -23F, 0F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 19, 7, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 96
		bodyModel[37].setRotationPoint(-76F, -23F, 0F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 19, 7, 4, 0F,0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, -1F, -3F, 0F, 0F, -1F); // Box 99
		bodyModel[38].setRotationPoint(-46F, -23F, 9F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 28, 6, 5, 0F,0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, 0F, 0F, -2F, -4F, 0F, 0F, -1F); // Box 100
		bodyModel[39].setRotationPoint(-27F, -23F, 6F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 19, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 103
		bodyModel[40].setRotationPoint(-46F, -35F, 7F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 11, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.9999F, 0F, 0F, -6.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.9999F, 0F, 0F, 0F); // Box 105
		bodyModel[41].setRotationPoint(-57F, -38F, 0F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 7, 3, 5, 0F,0F, 0F, 0F, 0F, -2.9999F, -4.9999F, 0F, -2.9999F, 0.9999F, 0F, 0F, -3.9999F, 0F, 0F, -4.9999F, 0F, 0F, -4.9999F, 0F, 0F, 0.9999F, 0F, 0F, 0.9999F); // Box 106
		bodyModel[42].setRotationPoint(-46F, -38F, 2F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 28, 5, 6, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, -5F, 0F, 1F, -2F, 0F, 1F, -3F, 0F, 0F, 0F); // Box 107
		bodyModel[43].setRotationPoint(-27F, -35F, 4F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 11, 5, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 110
		bodyModel[44].setRotationPoint(-57F, -16F, 0F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 19, 5, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 111
		bodyModel[45].setRotationPoint(-76F, -16F, 0F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 19, 5, 12, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, -1F, -6F, 0F, 0F, -5F); // Box 113
		bodyModel[46].setRotationPoint(-46F, -16F, 0F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 28, 5, 10, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -3F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -3F, -6F, 0F, 0F, -4F); // Box 114
		bodyModel[47].setRotationPoint(-27F, -17F, 0F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 7, 2, 8, 0F,0F, 0F, 0F, 0F, -1.9999F, -6.3F, 0F, -1.9999F, -0.75F, 0F, 0F, -6.9999F, 0F, 0F, -6.9999F, 0F, 0F, -6.3F, 0F, 0F, -0.749999999999999F, 0F, 0F, 0F); // Box 141
		bodyModel[48].setRotationPoint(-27F, -37F, 0F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		bodyModel[49].setRotationPoint(-39F, -42F, 7F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[50].setRotationPoint(-39F, -42F, 0F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		bodyModel[51].setRotationPoint(-39F, -42F, 3F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		bodyModel[52].setRotationPoint(-43F, -42F, 0F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); // Box 146
		bodyModel[53].setRotationPoint(-46F, -42F, 2F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[54].setRotationPoint(-20F, -41F, 6F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 148
		bodyModel[55].setRotationPoint(-12F, -41F, 6F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[56].setRotationPoint(-20F, -41F, 2F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -4F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -2F, 0F, 4F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -2F); // Box 150
		bodyModel[57].setRotationPoint(-27F, -41F, 2F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
		bodyModel[58].setRotationPoint(-20F, -41F, 0F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152
		bodyModel[59].setRotationPoint(-12F, -41F, 0F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 6, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 493
		bodyModel[60].setRotationPoint(-5F, -33F, -4F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 494
		bodyModel[61].setRotationPoint(-3F, -35F, -4F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 495
		bodyModel[62].setRotationPoint(-3F, -36F, -4F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 578
		bodyModel[63].setRotationPoint(-19F, -34F, 3F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 579
		bodyModel[64].setRotationPoint(-19F, -34F, -4F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 15, 10, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 580
		bodyModel[65].setRotationPoint(-18F, -37F, -5F);

		bodyModel[66].addShapeBox(0F, 1F, 0F, 10, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 582
		bodyModel[66].setRotationPoint(-18F, -23F, -5F);
		bodyModel[66].rotateAngleZ = 0.08726646F;

		bodyModel[67].addShapeBox(-2F, 0.25F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 583
		bodyModel[67].setRotationPoint(-16F, -23F, -5F);
		bodyModel[67].rotateAngleZ = 0.08726646F;

		bodyModel[68].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 584
		bodyModel[68].setRotationPoint(-18F, -29F, -6F);
		bodyModel[68].rotateAngleZ = -0.78539816F;

		bodyModel[69].addShapeBox(0F, -0.3F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 585
		bodyModel[69].setRotationPoint(-9F, -23F, -5F);
		bodyModel[69].rotateAngleZ = 0.12217305F;

		bodyModel[70].addShapeBox(-2F, 0.25F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 586
		bodyModel[70].setRotationPoint(-16F, -23F, 4F);
		bodyModel[70].rotateAngleZ = 0.08726646F;

		bodyModel[71].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 587
		bodyModel[71].setRotationPoint(-18F, -29F, 5F);
		bodyModel[71].rotateAngleZ = -0.78539816F;

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 15, 8, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 588
		bodyModel[72].setRotationPoint(-17F, -36F, -4F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 589
		bodyModel[73].setRotationPoint(-16.7F, -36.3F, 1F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 590
		bodyModel[74].setRotationPoint(-16.7F, -36.3F, -2F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 591
		bodyModel[75].setRotationPoint(-19.5F, -38.5F, -1.5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 592
		bodyModel[76].setRotationPoint(-19.5F, -39.5F, -1.5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 593
		bodyModel[77].setRotationPoint(-19.5F, -40.5F, -1.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 594
		bodyModel[78].setRotationPoint(-20F, -41F, -3F);

		bodyModel[79].addShapeBox(0F, 1F, 0F, 10, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
		bodyModel[79].setRotationPoint(-39F, -20.5F, -5F);
		bodyModel[79].rotateAngleZ = -0.10471976F;

		bodyModel[80].addShapeBox(9F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		bodyModel[80].setRotationPoint(-39F, -20.5F, -5F);
		bodyModel[80].rotateAngleZ = -0.10471976F;

		bodyModel[81].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		bodyModel[81].setRotationPoint(-39F, -20.5F, -5F);
		bodyModel[81].rotateAngleZ = -0.10471976F;

		bodyModel[82].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		bodyModel[82].setRotationPoint(-39F, -20.5F, 4F);
		bodyModel[82].rotateAngleZ = -0.10471976F;

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		bodyModel[83].setRotationPoint(-39F, -20.5F, -5F);
		bodyModel[83].rotateAngleZ = -0.10471976F;

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 17, 10, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		bodyModel[84].setRotationPoint(-30F, -36.5F, -5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[85].setRotationPoint(-28F, -40.5F, -3F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 17, 8, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 246
		bodyModel[86].setRotationPoint(-31F, -35.5F, -4F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[87].setRotationPoint(-31.3F, -35.8F, -2F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[88].setRotationPoint(-31.3F, -35.8F, 1F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 2, 18, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[89].setRotationPoint(-30F, -33.5F, -4F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 2, 18, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 251
		bodyModel[90].setRotationPoint(-30F, -33.5F, 3F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[91].setRotationPoint(-36F, -19.5F, -6F);
		bodyModel[91].rotateAngleZ = 0.78539816F;

		bodyModel[92].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 253
		bodyModel[92].setRotationPoint(-36F, -19.5F, 5F);
		bodyModel[92].rotateAngleZ = 0.78539816F;

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 962
		bodyModel[93].setRotationPoint(-28.5F, -40F, -1.5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 964
		bodyModel[94].setRotationPoint(-28.5F, -39F, -1.5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 966
		bodyModel[95].setRotationPoint(-28.5F, -38F, -1.5F);

		bodyModel[96].addShapeBox(0F, -3F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 259
		bodyModel[96].setRotationPoint(-47F, -16.5F, -6F);
		bodyModel[96].rotateAngleZ = 0.15707963F;

		bodyModel[97].addShapeBox(0F, -3F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
		bodyModel[97].setRotationPoint(-47F, -16.5F, 4F);
		bodyModel[97].rotateAngleZ = 0.15707963F;

		bodyModel[98].addShapeBox(0F, 0F, 0F, 7, 9, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 256
		bodyModel[98].setRotationPoint(-52F, -24.5F, -2F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 8, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[99].setRotationPoint(-47F, -17.5F, -2F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 254
		bodyModel[100].setRotationPoint(-47F, -18.5F, -1.5F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 263
		bodyModel[101].setRotationPoint(-43.5F, -21.5F, -1F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 264
		bodyModel[102].setRotationPoint(-43F, -25.5F, -0.5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 265
		bodyModel[103].setRotationPoint(-43F, -27.5F, -0.5F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 266
		bodyModel[104].setRotationPoint(-42.7F, -27.6F, -0.5F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 2, 7, 24, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[105].setRotationPoint(-46F, -30F, -12F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 2, 5, 22, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 284
		bodyModel[106].setRotationPoint(-46F, -35F, -11F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 675
		bodyModel[107].setRotationPoint(-44.75F, -35.5F, 2.5F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 676
		bodyModel[108].setRotationPoint(-44.75F, -35F, 2.5F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 677
		bodyModel[109].setRotationPoint(-44.75F, -35F, 2.5F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 400
		bodyModel[110].setRotationPoint(-44.75F, -35.5F, -4F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 401
		bodyModel[111].setRotationPoint(-44.75F, -35F, -4F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 402
		bodyModel[112].setRotationPoint(-44.75F, -35F, -4F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 415
		bodyModel[113].setRotationPoint(-44.75F, -36.5F, -1.25F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 416
		bodyModel[114].setRotationPoint(-44.75F, -36F, -1.25F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 417
		bodyModel[115].setRotationPoint(-44.75F, -35F, -1.25F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 227
		bodyModel[116].setRotationPoint(-44.75F, -33.5F, 1.5F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 228
		bodyModel[117].setRotationPoint(-44.75F, -33F, 1.5F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 229
		bodyModel[118].setRotationPoint(-44.75F, -33F, 1.5F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 230
		bodyModel[119].setRotationPoint(-44.75F, -33.5F, -3.5F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 231
		bodyModel[120].setRotationPoint(-44.75F, -33F, -3.5F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 232
		bodyModel[121].setRotationPoint(-44.75F, -33F, -3.5F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 2, 3, 7, 0F,0F, 0F, -5F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 279
		bodyModel[122].setRotationPoint(-46F, -38F, -7F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 2, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 280
		bodyModel[123].setRotationPoint(-46F, -38F, 0F);
	}

	private void initnoseModel_1()
	{
		noseModel[0] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 2
		noseModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 3
		noseModel[2] = new ModelRendererTurbo(this, 553, 1, textureX, textureY); // Box 10
		noseModel[3] = new ModelRendererTurbo(this, 737, 1, textureX, textureY); // Box 13
		noseModel[4] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 14
		noseModel[5] = new ModelRendererTurbo(this, 593, 1, textureX, textureY); // Box 20
		noseModel[6] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 28
		noseModel[7] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 70
		noseModel[8] = new ModelRendererTurbo(this, 457, 41, textureX, textureY); // Box 71
		noseModel[9] = new ModelRendererTurbo(this, 561, 33, textureX, textureY); // Box 72
		noseModel[10] = new ModelRendererTurbo(this, 825, 41, textureX, textureY); // Box 68
		noseModel[11] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 69
		noseModel[12] = new ModelRendererTurbo(this, 857, 41, textureX, textureY); // Box 70
		noseModel[13] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 71
		noseModel[14] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 78
		noseModel[15] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 79
		noseModel[16] = new ModelRendererTurbo(this, 297, 57, textureX, textureY); // Box 86
		noseModel[17] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 87
		noseModel[18] = new ModelRendererTurbo(this, 537, 73, textureX, textureY); // Box 94
		noseModel[19] = new ModelRendererTurbo(this, 225, 81, textureX, textureY); // Box 97
		noseModel[20] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 98
		noseModel[21] = new ModelRendererTurbo(this, 905, 49, textureX, textureY); // Box 104
		noseModel[22] = new ModelRendererTurbo(this, 969, 89, textureX, textureY); // Box 112
		noseModel[23] = new ModelRendererTurbo(this, 345, 105, textureX, textureY); // Box 153
		noseModel[24] = new ModelRendererTurbo(this, 889, 105, textureX, textureY); // Box 154
		noseModel[25] = new ModelRendererTurbo(this, 409, 105, textureX, textureY); // Box 155
		noseModel[26] = new ModelRendererTurbo(this, 953, 113, textureX, textureY); // Box 161
		noseModel[27] = new ModelRendererTurbo(this, 673, 49, textureX, textureY); // Box 162
		noseModel[28] = new ModelRendererTurbo(this, 673, 73, textureX, textureY); // Box 163
		noseModel[29] = new ModelRendererTurbo(this, 985, 113, textureX, textureY); // Box 164
		noseModel[30] = new ModelRendererTurbo(this, 73, 121, textureX, textureY); // Box 165
		noseModel[31] = new ModelRendererTurbo(this, 465, 121, textureX, textureY); // Box 166
		noseModel[32] = new ModelRendererTurbo(this, 937, 145, textureX, textureY); // Box 205
		noseModel[33] = new ModelRendererTurbo(this, 1009, 193, textureX, textureY); // Box 206
		noseModel[34] = new ModelRendererTurbo(this, 409, 201, textureX, textureY); // Box 207
		noseModel[35] = new ModelRendererTurbo(this, 425, 201, textureX, textureY); // Box 208

		noseModel[0].addShapeBox(0F, 0F, 0F, 13, 7, 14, 0F,0F, -2F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		noseModel[0].setRotationPoint(-89F, -30F, -14F);

		noseModel[1].addShapeBox(0F, 0F, 0F, 5, 5, 4, 0F,0F, -1F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 3
		noseModel[1].setRotationPoint(-94F, -28F, -11F);

		noseModel[2].addShapeBox(0F, 0F, 0F, 13, 4, 12, 0F,0F, -2F, -6F, 0F, 0F, -5F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 10
		noseModel[2].setRotationPoint(-89F, -34F, -12F);

		noseModel[3].addShapeBox(0F, 0F, 0F, 13, 7, 14, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 13
		noseModel[3].setRotationPoint(-89F, -23F, -14F);

		noseModel[4].addShapeBox(0F, 0F, 0F, 5, 6, 4, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 14
		noseModel[4].setRotationPoint(-94F, -23F, -11F);

		noseModel[5].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F,0F, -4F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 20
		noseModel[5].setRotationPoint(-94F, -34F, -6F);

		noseModel[6].addShapeBox(0F, 0F, 0F, 13, 5, 12, 0F,0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -3F, -5F, 0F, 0F, -5F, 0F, 2F, 0F, 0F, -1F, 0F); // Box 28
		noseModel[6].setRotationPoint(-89F, -16F, -12F);

		noseModel[7].addShapeBox(0F, 0F, 0F, 5, 4, 7, 0F,0F, -2F, -6F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 1F, -4F); // Box 70
		noseModel[7].setRotationPoint(-94F, -32F, -10F);

		noseModel[8].addShapeBox(0F, 0F, 0F, 5, 4, 7, 0F,0F, 1F, -2F, 0F, -1F, 0F, 0F, -1F, -4F, 0F, 1F, -4F, 0F, -2F, -6F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 71
		noseModel[8].setRotationPoint(-94F, -18F, -10F);

		noseModel[9].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F,0F, 3F, -1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -4F, -2F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 72
		noseModel[9].setRotationPoint(-94F, -14F, -6F);

		noseModel[10].addShapeBox(0F, 0F, 0F, 8, 6, 6, 0F,0F, -2F, -2F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		noseModel[10].setRotationPoint(-101F, -29F, -6F);

		noseModel[11].addShapeBox(0F, 0F, 0F, 4, 5, 5, 0F,0F, -4.9999F, -4.9999F, 0F, -0.9999F, -0.9999F, 0F, 0F, 0F, 0F, -4.9999F, 0F, 0F, 0F, -4.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		noseModel[11].setRotationPoint(-105F, -28F, -5F);

		noseModel[12].addShapeBox(0F, 0F, 0F, 4, 5, 5, 0F,0F, 0F, -4.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.9999F, -4.9999F, 0F, -0.9999F, -0.9999F, 0F, 0F, 0F, 0F, -4.9999F, 0F); // Box 70
		noseModel[12].setRotationPoint(-105F, -23F, -5F);

		noseModel[13].addShapeBox(0F, 0F, 0F, 8, 6, 6, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 71
		noseModel[13].setRotationPoint(-101F, -23F, -6F);

		noseModel[14].addShapeBox(0F, 0F, 0F, 5, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		noseModel[14].setRotationPoint(-93F, -23F, -6F);

		noseModel[15].addShapeBox(0F, 0F, 0F, 5, 6, 6, 0F,0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		noseModel[15].setRotationPoint(-93F, -29F, -6F);

		noseModel[16].addShapeBox(0F, 0F, 0F, 13, 7, 14, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 86
		noseModel[16].setRotationPoint(-89F, -30F, 0F);

		noseModel[17].addShapeBox(0F, 0F, 0F, 5, 5, 4, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 87
		noseModel[17].setRotationPoint(-94F, -28F, 7F);

		noseModel[18].addShapeBox(0F, 0F, 0F, 13, 4, 12, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, -5F, 0F, -2F, -6F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -2F); // Box 94
		noseModel[18].setRotationPoint(-89F, -34F, 0F);

		noseModel[19].addShapeBox(0F, 0F, 0F, 13, 7, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -4F); // Box 97
		noseModel[19].setRotationPoint(-89F, -23F, 0F);

		noseModel[20].addShapeBox(0F, 0F, 0F, 5, 6, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -3F); // Box 98
		noseModel[20].setRotationPoint(-94F, -23F, 7F);

		noseModel[21].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, -2F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 3F, -1F); // Box 104
		noseModel[21].setRotationPoint(-94F, -34F, 0F);

		noseModel[22].addShapeBox(0F, 0F, 0F, 13, 5, 12, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 0F, -5F, 0F, -3F, -5F); // Box 112
		noseModel[22].setRotationPoint(-89F, -16F, 0F);

		noseModel[23].addShapeBox(0F, 0F, 0F, 5, 4, 7, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -2F, -6F, 0F, 1F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 1F, -2F); // Box 153
		noseModel[23].setRotationPoint(-94F, -32F, 3F);

		noseModel[24].addShapeBox(0F, 0F, 0F, 5, 4, 7, 0F,0F, 1F, -4F, 0F, -1F, -4F, 0F, -1F, 0F, 0F, 1F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -6F); // Box 154
		noseModel[24].setRotationPoint(-94F, -18F, 3F);

		noseModel[25].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 3F, -1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, -4F, -2F); // Box 155
		noseModel[25].setRotationPoint(-94F, -14F, 0F);

		noseModel[26].addShapeBox(0F, 0F, 0F, 8, 6, 6, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 161
		noseModel[26].setRotationPoint(-101F, -29F, 0F);

		noseModel[27].addShapeBox(0F, 0F, 0F, 4, 5, 5, 0F,0F, -4.9999F, 0F, 0F, 0F, 0F, 0F, -0.9999F, -0.9999F, 0F, -4.9999F, -4.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.9999F); // Box 162
		noseModel[27].setRotationPoint(-105F, -28F, 0F);

		noseModel[28].addShapeBox(0F, 0F, 0F, 4, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.9999F, 0F, -4.9999F, 0F, 0F, 0F, 0F, 0F, -0.9999F, -0.9999F, 0F, -4.9999F, -4.9999F); // Box 163
		noseModel[28].setRotationPoint(-105F, -23F, 0F);

		noseModel[29].addShapeBox(0F, 0F, 0F, 8, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -2F, -2F); // Box 164
		noseModel[29].setRotationPoint(-101F, -23F, 0F);

		noseModel[30].addShapeBox(0F, 0F, 0F, 5, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 165
		noseModel[30].setRotationPoint(-93F, -23F, 0F);

		noseModel[31].addShapeBox(0F, 0F, 0F, 5, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		noseModel[31].setRotationPoint(-93F, -29F, 0F);

		noseModel[32].addShapeBox(0F, -9F, -1F, 2, 18, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		noseModel[32].setRotationPoint(-91F, -23F, 0F);

		noseModel[33].addShapeBox(0F, -9F, -1F, 2, 18, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		noseModel[33].setRotationPoint(-91F, -23F, 0F);
		noseModel[33].rotateAngleX = -1.57079633F;

		noseModel[34].addShapeBox(0F, -9F, -1F, 2, 18, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		noseModel[34].setRotationPoint(-91F, -23F, 0F);
		noseModel[34].rotateAngleX = -0.78539816F;

		noseModel[35].addShapeBox(0F, -9F, -1F, 2, 18, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 208
		noseModel[35].setRotationPoint(-91F, -23F, 0F);
		noseModel[35].rotateAngleX = 0.78539816F;
	}

	private void inittailModel_1()
	{
		tailModel[0] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 6
		tailModel[1] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 7
		tailModel[2] = new ModelRendererTurbo(this, 905, 1, textureX, textureY); // Box 17
		tailModel[3] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 18
		tailModel[4] = new ModelRendererTurbo(this, 785, 17, textureX, textureY); // Box 24
		tailModel[5] = new ModelRendererTurbo(this, 849, 17, textureX, textureY); // Box 25
		tailModel[6] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 32
		tailModel[7] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 33
		tailModel[8] = new ModelRendererTurbo(this, 969, 41, textureX, textureY); // Box 75
		tailModel[9] = new ModelRendererTurbo(this, 457, 57, textureX, textureY); // Box 76
		tailModel[10] = new ModelRendererTurbo(this, 137, 65, textureX, textureY); // Box 90
		tailModel[11] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 91
		tailModel[12] = new ModelRendererTurbo(this, 881, 73, textureX, textureY); // Box 101
		tailModel[13] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Box 102
		tailModel[14] = new ModelRendererTurbo(this, 73, 89, textureX, textureY); // Box 108
		tailModel[15] = new ModelRendererTurbo(this, 889, 89, textureX, textureY); // Box 109
		tailModel[16] = new ModelRendererTurbo(this, 617, 97, textureX, textureY); // Box 115
		tailModel[17] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 116
		tailModel[18] = new ModelRendererTurbo(this, 105, 121, textureX, textureY); // Box 158
		tailModel[19] = new ModelRendererTurbo(this, 593, 121, textureX, textureY); // Box 159

		tailModel[0].addShapeBox(0F, 0F, 0F, 22, 6, 8, 0F,0F, 0F, -1F, 0F, -1F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		tailModel[0].setRotationPoint(1F, -29F, -8F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 38, 5, 6, 0F,0F, 0F, -0.9999F, 0F, -4.9999F, -4.9999F, 0F, -4.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.9999F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		tailModel[1].setRotationPoint(23F, -28F, -6F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 22, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -3F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 17
		tailModel[2].setRotationPoint(1F, -23F, -8F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 38, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, -4.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9999F, 0F, -2.9999F, -4.9999F, 0F, -2.9999F, 0F, 0F, 0F, 0F); // Box 18
		tailModel[3].setRotationPoint(23F, -23F, -6F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 22, 6, 7, 0F,0F, 0F, -2F, 0F, -2F, -4F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 24
		tailModel[4].setRotationPoint(1F, -35F, -7F);

		tailModel[5].addShapeBox(0F, 0F, 0F, 38, 6, 5, 0F,0F, -0.9999F, -1.9999F, 0F, -10.9999F, -3.9999F, 0F, -10.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4.9999F, -3.9999F, 0F, 4.9999F, 0F, 0F, 0F, 0F); // Box 25
		tailModel[5].setRotationPoint(23F, -34F, -5F);

		tailModel[6].addShapeBox(0F, 0F, 0F, 22, 4, 7, 0F,0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, -5F, 0F, -2F, 0F, 0F, 1F, 0F); // Box 32
		tailModel[6].setRotationPoint(1F, -19F, -7F);

		tailModel[7].addShapeBox(0F, 0F, 0F, 38, 2, 5, 0F,0F, 0F, 0F, 0F, 2.9999F, -3.9999F, 0F, 2.9999F, 0F, 0F, 0F, 0F, 0F, 0F, -2.9999F, 0F, -4.9999F, -3.9999F, 0F, -4.9999F, 0F, 0F, 0.9999F, 0F); // Box 33
		tailModel[7].setRotationPoint(23F, -20F, -5F);

		tailModel[8].addShapeBox(0F, 0F, 0F, 26, 39, 1, 0F,-20F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, -2F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F); // Box 75
		tailModel[8].setRotationPoint(23F, -62F, -1F);

		tailModel[9].addShapeBox(0F, 0F, 0F, 20, 1, 36, 0F,-16F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		tailModel[9].setRotationPoint(23F, -26F, -36F);

		tailModel[10].addShapeBox(0F, 0F, 0F, 22, 6, 8, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 90
		tailModel[10].setRotationPoint(1F, -29F, 0F);

		tailModel[11].addShapeBox(0F, 0F, 0F, 38, 5, 6, 0F,0F, 0F, 0F, 0F, -4.9999F, 0F, 0F, -4.9999F, -4.9999F, 0F, 0F, -0.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.9999F, 0F, 0F, 0F); // Box 91
		tailModel[11].setRotationPoint(23F, -28F, 0F);

		tailModel[12].addShapeBox(0F, 0F, 0F, 22, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -3F, 0F, 0F, -1F); // Box 101
		tailModel[12].setRotationPoint(1F, -23F, 0F);

		tailModel[13].addShapeBox(0F, 0F, 0F, 38, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.9999F, 0F, 0F, -2.9999F, -4.9999F, 0F, 0F, -0.9999F); // Box 102
		tailModel[13].setRotationPoint(23F, -23F, 0F);

		tailModel[14].addShapeBox(0F, 0F, 0F, 22, 6, 7, 0F,0F, 1F, 0F, 0F, -1F, 0F, 0F, -2F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -2F, 0F, 0F, 0F); // Box 108
		tailModel[14].setRotationPoint(1F, -35F, 0F);

		tailModel[15].addShapeBox(0F, 0F, 0F, 38, 6, 5, 0F,0F, 0F, 0F, 0F, -10.9999F, 0F, 0F, -10.9999F, -3.9999F, 0F, -0.9999F, -1.9999F, 0F, 0F, 0F, 0F, 4.9999F, 0F, 0F, 4.9999F, -3.9999F, 0F, 0F, 0F); // Box 109
		tailModel[15].setRotationPoint(23F, -34F, 0F);

		tailModel[16].addShapeBox(0F, 0F, 0F, 22, 4, 7, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -3F, -5F, 0F, 0F, -3F); // Box 115
		tailModel[16].setRotationPoint(1F, -19F, 0F);

		tailModel[17].addShapeBox(0F, 0F, 0F, 38, 2, 5, 0F,0F, 0F, 0F, 0F, 2.9999F, 0F, 0F, 2.9999F, -3.9999F, 0F, 0F, 0F, 0F, 0.9999F, 0F, 0F, -4.9999F, 0F, 0F, -4.9999F, -3.9999F, 0F, 0F, -2.9999F); // Box 116
		tailModel[17].setRotationPoint(23F, -20F, 0F);

		tailModel[18].addShapeBox(0F, 0F, 0F, 26, 39, 1, 0F,-20F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, -2F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F); // Box 158
		tailModel[18].setRotationPoint(23F, -62F, 0F);

		tailModel[19].addShapeBox(0F, 0F, 0F, 20, 1, 36, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, -1F); // Box 159
		tailModel[19].setRotationPoint(23F, -26F, 0F);
	}

	private void initbayModel_1()
	{
		bayModel[0] = new ModelRendererTurbo(this, 161, 129, textureX, textureY); // Import LWW01
		bayModel[1] = new ModelRendererTurbo(this, 529, 129, textureX, textureY); // Import LWW02
		bayModel[2] = new ModelRendererTurbo(this, 145, 161, textureX, textureY); // Import LWW03
		bayModel[3] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Import LWW04
		bayModel[4] = new ModelRendererTurbo(this, 673, 129, textureX, textureY); // Import LWW05
		bayModel[5] = new ModelRendererTurbo(this, 761, 105, textureX, textureY); // Import LWW06
		bayModel[6] = new ModelRendererTurbo(this, 721, 97, textureX, textureY); // Import LWW07
		bayModel[7] = new ModelRendererTurbo(this, 785, 129, textureX, textureY); // Import LWW08
		bayModel[8] = new ModelRendererTurbo(this, 297, 161, textureX, textureY); // Import LWW09
		bayModel[9] = new ModelRendererTurbo(this, 569, 161, textureX, textureY); // Import LWW10
		bayModel[10] = new ModelRendererTurbo(this, 697, 177, textureX, textureY); // Import LWW11
		bayModel[11] = new ModelRendererTurbo(this, 233, 137, textureX, textureY); // Import LWW12
		bayModel[12] = new ModelRendererTurbo(this, 985, 129, textureX, textureY); // Import LWW13
		bayModel[13] = new ModelRendererTurbo(this, 345, 137, textureX, textureY); // Import LWW14
		bayModel[14] = new ModelRendererTurbo(this, 489, 121, textureX, textureY); // Import LWW19
		bayModel[15] = new ModelRendererTurbo(this, 753, 129, textureX, textureY); // Box 312
		bayModel[16] = new ModelRendererTurbo(this, 953, 145, textureX, textureY); // Box 313
		bayModel[17] = new ModelRendererTurbo(this, 769, 129, textureX, textureY); // Box 316
		bayModel[18] = new ModelRendererTurbo(this, 985, 145, textureX, textureY); // Box 188
		bayModel[19] = new ModelRendererTurbo(this, 1001, 145, textureX, textureY); // Box 189
		bayModel[20] = new ModelRendererTurbo(this, 401, 161, textureX, textureY); // Box 190

		bayModel[0].addShapeBox(0F, 0F, 0F, 18, 8, 17, 0F,0F, -4F, -6F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -4F, -6F, 0F, 0F, -4F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, -4F); // Import LWW01
		bayModel[0].setRotationPoint(-106F, 0F, -8.5F);

		bayModel[1].addShapeBox(4F, 0F, 0F, 31, 8, 17, 0F,0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 3F, 0F, 0F, 4F, 2F, 0F, 4F, 2F, 0F, 3F, 0F); // Import LWW02
		bayModel[1].setRotationPoint(-92F, 0F, -8.5F);

		bayModel[2].addShapeBox(0F, 0F, 0F, 54, 12, 19, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 1F); // Import LWW03
		bayModel[2].setRotationPoint(-57F, 0F, -9.5F);

		bayModel[3].addShapeBox(0F, 0F, 0F, 41, 11, 19, 0F,0F, 0F, -2F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, 4F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 4F, 0F); // Import LWW04
		bayModel[3].setRotationPoint(-3F, 0F, -9.5F);

		bayModel[4].addShapeBox(0F, 0F, 0F, 24, 10, 13, 0F,0F, 0F, -2F, 0F, -2F, -6F, 0F, -2F, -6F, 0F, 0F, -2F, 0F, 1F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 1F, 0F); // Import LWW05
		bayModel[4].setRotationPoint(38F, 0F, -6.5F);

		bayModel[5].addShapeBox(0F, 0F, 0F, 6, 13, 1, 0F,0F, -3F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -3F, -0.25F, 0F, -3F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -3F, -0.25F); // Import LWW06
		bayModel[5].setRotationPoint(62F, 0F, -0.5F);

		bayModel[6].addShapeBox(0F, 0F, 0F, 4, 13, 1, 0F,0F, 0F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, 0F, 0F, -0.25F); // Import LWW07
		bayModel[6].setRotationPoint(68F, 0F, -0.5F);

		bayModel[7].addShapeBox(0F, 0F, 0F, 18, 8, 17, 0F,0F, 0F, -4F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -4F, -3F, -6F, -8.5F, 0F, 0F, -7F, 0F, 0F, -7F, -3F, -6F, -8.5F); // Import LWW08
		bayModel[7].setRotationPoint(-106F, 8F, -8.5F);

		bayModel[8].addShapeBox(0F, 0F, 0F, 31, 6, 17, 0F,0F, 0F, 0F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, 0F, 0F, -1F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -1F, -7F); // Import LWW09
		bayModel[8].setRotationPoint(-88F, 11F, -8.5F);

		bayModel[9].addShapeBox(0F, 0F, 0F, 54, 8, 19, 0F,0F, 0F, 1F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 1F, 0F, -3F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, -3F, -8F); // Import LWW10
		bayModel[9].setRotationPoint(-57F, 12F, -9.5F);

		bayModel[10].addShapeBox(0F, 0F, 0F, 41, 8, 19, 0F,0F, -3F, 0F, 0F, 1F, -3F, 0F, 1F, -3F, 0F, -3F, 0F, 0F, -3F, -9F, 0F, -6F, -9F, 0F, -6F, -9F, 0F, -3F, -9F); // Import LWW11
		bayModel[10].setRotationPoint(-3F, 12F, -9.5F);

		bayModel[11].addShapeBox(0F, 0F, 0F, 24, 3, 13, 0F,0F, 0F, 0F, 0F, 1F, -6F, 0F, 1F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -4F, -6F, 0F, -4F, -6F, 0F, 0F, -6F); // Import LWW12
		bayModel[11].setRotationPoint(38F, 11F, -6.5F);

		bayModel[12].addTrapezoid(0F, 0F, 0F, 6, 1, 13, 0F, -0.50F, ModelRendererTurbo.MR_TOP); // Import LWW13
		bayModel[12].setRotationPoint(-57F, -0.5F, -6.5F);

		bayModel[13].addShapeBox(0F, 0F, 0F, 6, 1, 12, 0F,-0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Import LWW14
		bayModel[13].setRotationPoint(-8F, -1F, -6F);

		bayModel[14].addShapeBox(0F, 0F, 0F, 4, 22, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LWW19
		bayModel[14].setRotationPoint(-56F, -22F, -1F);

		bayModel[15].addShapeBox(0F, 0F, 0F, 4, 22, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 312
		bayModel[15].setRotationPoint(-7F, -22F, -1F);

		bayModel[16].addShapeBox(0F, 0F, 0F, 11, 24, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 313
		bayModel[16].setRotationPoint(42F, -22F, -1F);

		bayModel[17].addShapeBox(0F, 0F, 0F, 2, 22, 2, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 316
		bayModel[17].setRotationPoint(-6F, -22F, -5.5F);

		bayModel[18].addShapeBox(0F, 0F, 0F, 2, 22, 2, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bayModel[18].setRotationPoint(-55F, -22F, -5.5F);

		bayModel[19].addShapeBox(0F, 0F, 0F, 2, 22, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		bayModel[19].setRotationPoint(-6F, -22F, 3.5F);

		bayModel[20].addShapeBox(0F, 0F, 0F, 2, 22, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 190
		bayModel[20].setRotationPoint(-55F, -22F, 3.5F);
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 561, 25, textureX, textureY); // Box 34
		leftWingModel[1] = new ModelRendererTurbo(this, 625, 25, textureX, textureY); // Box 35
		leftWingModel[2] = new ModelRendererTurbo(this, 681, 25, textureX, textureY); // Box 36
		leftWingModel[3] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 38
		leftWingModel[4] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 39
		leftWingModel[5] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 40
		leftWingModel[6] = new ModelRendererTurbo(this, 721, 1, textureX, textureY); // Box 41
		leftWingModel[7] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Box 42
		leftWingModel[8] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 43
		leftWingModel[9] = new ModelRendererTurbo(this, 737, 33, textureX, textureY); // Box 45
		leftWingModel[10] = new ModelRendererTurbo(this, 825, 33, textureX, textureY); // Box 46
		leftWingModel[11] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 48
		leftWingModel[12] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 49
		leftWingModel[13] = new ModelRendererTurbo(this, 993, 17, textureX, textureY); // Box 50
		leftWingModel[14] = new ModelRendererTurbo(this, 769, 33, textureX, textureY); // Box 51
		leftWingModel[15] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 52
		leftWingModel[16] = new ModelRendererTurbo(this, 641, 41, textureX, textureY); // Box 53
		leftWingModel[17] = new ModelRendererTurbo(this, 545, 33, textureX, textureY); // Box 54
		leftWingModel[18] = new ModelRendererTurbo(this, 625, 25, textureX, textureY); // Box 55
		leftWingModel[19] = new ModelRendererTurbo(this, 633, 25, textureX, textureY); // Box 56
		leftWingModel[20] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Box 57
		leftWingModel[21] = new ModelRendererTurbo(this, 385, 57, textureX, textureY); // Box 124
		leftWingModel[22] = new ModelRendererTurbo(this, 457, 57, textureX, textureY); // Box 133
		leftWingModel[23] = new ModelRendererTurbo(this, 313, 105, textureX, textureY); // Box 134
		leftWingModel[24] = new ModelRendererTurbo(this, 289, 105, textureX, textureY); // Box 135
		leftWingModel[25] = new ModelRendererTurbo(this, 729, 105, textureX, textureY); // Box 136
		leftWingModel[26] = new ModelRendererTurbo(this, 465, 81, textureX, textureY); // Box 137
		leftWingModel[27] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Box 138
		leftWingModel[28] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Box 139
		leftWingModel[29] = new ModelRendererTurbo(this, 793, 33, textureX, textureY); // Box 140
		leftWingModel[30] = new ModelRendererTurbo(this, 825, 177, textureX, textureY); // Box 117
		leftWingModel[31] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 118
		leftWingModel[32] = new ModelRendererTurbo(this, 393, 169, textureX, textureY); // Box 119
		leftWingModel[33] = new ModelRendererTurbo(this, 929, 177, textureX, textureY); // Box 120
		leftWingModel[34] = new ModelRendererTurbo(this, 889, 145, textureX, textureY); // Box 121
		leftWingModel[35] = new ModelRendererTurbo(this, 697, 153, textureX, textureY); // Box 122
		leftWingModel[36] = new ModelRendererTurbo(this, 273, 185, textureX, textureY); // Box 123
		leftWingModel[37] = new ModelRendererTurbo(this, 441, 185, textureX, textureY); // Box 124
		leftWingModel[38] = new ModelRendererTurbo(this, 673, 121, textureX, textureY); // Box 330
		leftWingModel[39] = new ModelRendererTurbo(this, 129, 169, textureX, textureY); // Box 331
		leftWingModel[40] = new ModelRendererTurbo(this, 993, 169, textureX, textureY); // Box 332
		leftWingModel[41] = new ModelRendererTurbo(this, 233, 129, textureX, textureY); // Box 333
		leftWingModel[42] = new ModelRendererTurbo(this, 1009, 169, textureX, textureY); // Box 334

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 16, 3, 24, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 34
		leftWingModel[0].setRotationPoint(-56F, -14F, -31F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 16, 3, 17, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 35
		leftWingModel[1].setRotationPoint(-40F, -14F, -31F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 16, 3, 9, 0F,0F, 0F, 0F, 0F, -1F, 0F, 10F, -1F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 10F, -1F, 5F, 0F, 0F, 0F); // Box 36
		leftWingModel[2].setRotationPoint(-40F, -14F, -14F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 16, 3, 28, 0F,0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 38
		leftWingModel[3].setRotationPoint(-56F, -14F, -59F);

		leftWingModel[4].addShapeBox(0F, 0F, 0F, 16, 3, 14, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 39
		leftWingModel[4].setRotationPoint(-69F, -47F, -14F);

		leftWingModel[5].addShapeBox(0F, 0F, 0F, 14, 3, 10, 0F,0F, 0F, 0F, 0F, -1F, 0F, -4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -4F, -1F, 0F, 0F, 0F, 0F); // Box 40
		leftWingModel[5].setRotationPoint(-53F, -47F, -14F);

		leftWingModel[6].addShapeBox(0F, 0F, 0F, 10, 3, 4, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 41
		leftWingModel[6].setRotationPoint(-53F, -47F, -4F);

		leftWingModel[7].addShapeBox(0F, 0F, 0F, 14, 3, 19, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 42
		leftWingModel[7].setRotationPoint(-53F, -47F, -33F);

		leftWingModel[8].addShapeBox(0F, 0F, 0F, 16, 3, 19, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 43
		leftWingModel[8].setRotationPoint(-69F, -47F, -33F);

		leftWingModel[9].addShapeBox(0F, 0F, 0F, 12, 3, 61, 0F,0F, 1F, 0F, -3F, 1F, 0F, 2F, -3F, 0F, 2F, -4F, 0F, 0F, -3F, 0F, -3F, -3F, 0F, 2F, 3F, 0F, 2F, 2F, 0F); // Box 45
		leftWingModel[9].setRotationPoint(-67F, -51F, -94F);

		leftWingModel[10].addShapeBox(0F, 0F, 0F, 16, 1, 6, 0F,-4F, 1F, 0F, -6F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -1F, 0F, -6F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		leftWingModel[10].setRotationPoint(-67F, -52F, -100F);

		leftWingModel[11].addShapeBox(0F, 0F, 0F, 16, 3, 35, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, -3F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F); // Box 48
		leftWingModel[11].setRotationPoint(-56F, -18F, -94F);

		leftWingModel[12].addShapeBox(0F, 0F, 0F, 15, 1, 6, 0F,-4F, 1F, 0F, -6F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -1F, 0F, -6F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		leftWingModel[12].setRotationPoint(-53F, -18F, -100F);

		leftWingModel[13].addShapeBox(0F, 0F, 0F, 12, 17, 1, 0F,0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, -5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 1F, 0F); // Box 50
		leftWingModel[13].setRotationPoint(-55F, -33F, -66F);

		leftWingModel[14].addShapeBox(0F, 0F, 0F, 10, 16, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F); // Box 51
		leftWingModel[14].setRotationPoint(-61F, -49F, -66F);

		leftWingModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 51, 0F,0F, 0F, 0F, 0F, 0F, 0F, 10F, -35F, 0F, -10F, -35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 11F, 35F, 0F, -11F, 35F, 0F); // Box 52
		leftWingModel[15].setRotationPoint(-58F, -48F, -65F);

		leftWingModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 51, 0F,-10F, -32F, 0F, 10F, -32F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -11F, 32F, 0F, 11F, 32F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 53
		leftWingModel[16].setRotationPoint(-58F, -48F, -65F);

		leftWingModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		leftWingModel[17].setRotationPoint(-53F, -23F, -23F);

		leftWingModel[18].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, -4F, -5F, 0F, -4F, -5F, 0F, 4F, 5F, 0F, 4F); // Box 55
		leftWingModel[18].setRotationPoint(-64F, -45F, -14F);

		leftWingModel[19].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F); // Box 56
		leftWingModel[19].setRotationPoint(-54F, -45F, -14F);

		leftWingModel[20].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 15F, 0F, -4F, -15F, 0F, -4F, -15F, 0F, 4F, 15F, 0F, 4F); // Box 57
		leftWingModel[20].setRotationPoint(-54F, -45F, -14F);

		leftWingModel[21].addShapeBox(0F, 0F, 0F, 10, 3, 4, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 124
		leftWingModel[21].setRotationPoint(-53F, -47F, 0F);

		leftWingModel[22].addShapeBox(0F, 0F, 0F, 12, 17, 1, 0F,0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, -5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 1F, 0F); // Box 133
		leftWingModel[22].setRotationPoint(-55F, -33F, 65F);

		leftWingModel[23].addShapeBox(0F, 0F, 0F, 10, 16, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F); // Box 134
		leftWingModel[23].setRotationPoint(-61F, -49F, 65F);

		leftWingModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 51, 0F,-10F, -35F, 0F, 10F, -35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 35F, 0F, 11F, 35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		leftWingModel[24].setRotationPoint(-58F, -48F, 14F);

		leftWingModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 51, 0F,0F, -2F, 0F, 0F, -2F, 0F, 10F, -32F, 0F, -10F, -32F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 11F, 32F, 0F, -11F, 32F, 0F); // Box 136
		leftWingModel[25].setRotationPoint(-58F, -48F, 14F);

		leftWingModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, 10F, 0F); // Box 137
		leftWingModel[26].setRotationPoint(-53F, -23F, 13F);

		leftWingModel[27].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 4F, -5F, 0F, 4F, -5F, 0F, -4F, 5F, 0F, -4F); // Box 138
		leftWingModel[27].setRotationPoint(-64F, -45F, 13F);

		leftWingModel[28].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 139
		leftWingModel[28].setRotationPoint(-54F, -45F, 13F);

		leftWingModel[29].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 15F, 0F, 4F, -15F, 0F, 4F, -15F, 0F, -4F, 15F, 0F, -4F); // Box 140
		leftWingModel[29].setRotationPoint(-54F, -45F, 13F);

		leftWingModel[30].addShapeBox(0F, 0F, 0F, 29, 11, 20, 0F,0F, 0F, -10F, 0F, -5F, -10F, 0F, -5F, -10F, 0F, 0F, -10F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 117
		leftWingModel[30].setRotationPoint(-54F, -4F, -92F);

		leftWingModel[31].addShapeBox(0F, 0F, 0F, 29, 10, 20, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, -2F, -10F); // Box 118
		leftWingModel[31].setRotationPoint(-54F, 4F, -92F);

		leftWingModel[32].addShapeBox(0F, 0F, 0F, 11, 8, 20, 0F,0F, -1F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, -1F, -10F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -3F); // Box 119
		leftWingModel[32].setRotationPoint(-65F, -4F, -92F);

		leftWingModel[33].addShapeBox(0F, 0F, 0F, 11, 10, 20, 0F,0F, 0F, -3F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, -5F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, -5F, -10F); // Box 120
		leftWingModel[33].setRotationPoint(-65F, 2F, -92F);

		leftWingModel[34].addShapeBox(0F, 0F, 0F, 6, 5, 14, 0F,0F, -2.9999F, -6.9999F, 0F, 0F, -6.9999F, 0F, 0F, -6.9999F, 0F, -2.9999F, -6.9999F, 0F, -1.9999F, -6.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9999F, -6.9999F); // Box 121
		leftWingModel[34].setRotationPoint(-71F, -3F, -89F);

		leftWingModel[35].addShapeBox(0F, 0F, 0F, 6, 7, 14, 0F,0F, 0F, -6.9999F, 0F, -1.9999F, 0F, 0F, -1.9999F, 0F, 0F, 0F, -6.9999F, 0F, -6.9999F, -6.9999F, 0F, 0F, -6.9999F, 0F, 0F, -6.9999F, 0F, -6.9999F, -6.9999F); // Box 122
		leftWingModel[35].setRotationPoint(-71F, 0F, -89F);

		leftWingModel[36].addShapeBox(0F, 0F, 0F, 23, 7, 20, 0F,0F, 0F, 0F, 0F, -2.9999F, -9.9999F, 0F, -2.9999F, -9.9999F, 0F, 0F, 0F, 0F, 0F, -9.9999F, 0F, -3.9999F, -9.9999F, 0F, -3.9999F, -9.9999F, 0F, 0F, -9.9999F); // Box 123
		leftWingModel[36].setRotationPoint(-25F, 7F, -92F);

		leftWingModel[37].addShapeBox(0F, 0F, 0F, 23, 9, 20, 0F,0F, 0F, -9.9999F, 0F, -8.9999F, -9.9999F, 0F, -8.9999F, -9.9999F, 0F, 0F, -9.9999F, 0F, -2.9999F, 0F, 0F, 0F, -9.9999F, 0F, 0F, -9.9999F, 0F, -2.9999F, 0F); // Box 124
		leftWingModel[37].setRotationPoint(-25F, 1F, -92F);

		leftWingModel[38].addShapeBox(0F, 0F, 0F, 2, 17, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 330
		leftWingModel[38].setRotationPoint(-53F, -16F, -83F);

		leftWingModel[39].addShapeBox(0F, 0F, 0F, 2, 20, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 331
		leftWingModel[39].setRotationPoint(-42F, -16F, -83F);

		leftWingModel[40].addShapeBox(0F, 0F, 0F, 2, 20, 2, 0F,0F, 0F, -23F, 0F, 0F, -23F, 0F, 0F, 23F, 0F, 0F, 23F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 332
		leftWingModel[40].setRotationPoint(-42F, -14F, -83F);

		leftWingModel[41].addShapeBox(0F, 0F, 0F, 2, 17, 2, 0F,0F, 0F, -22F, 0F, 0F, -22F, 0F, 0F, 22F, 0F, 0F, 22F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 333
		leftWingModel[41].setRotationPoint(-53F, -15F, -83F);

		leftWingModel[42].addShapeBox(0F, 0F, 0F, 2, 20, 2, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 18F, 0F, 0F, -18F, 0F, 0F, -18F, 0F, 0F, 18F, 0F, 0F); // Box 334
		leftWingModel[42].setRotationPoint(-40F, -16F, -83F);
	}

	private void initrightWingModel_1()
	{
		rightWingModel[0] = new ModelRendererTurbo(this, 161, 97, textureX, textureY); // Box 117
		rightWingModel[1] = new ModelRendererTurbo(this, 665, 97, textureX, textureY); // Box 118
		rightWingModel[2] = new ModelRendererTurbo(this, 225, 105, textureX, textureY); // Box 119
		rightWingModel[3] = new ModelRendererTurbo(this, 345, 105, textureX, textureY); // Box 121
		rightWingModel[4] = new ModelRendererTurbo(this, 561, 105, textureX, textureY); // Box 122
		rightWingModel[5] = new ModelRendererTurbo(this, 81, 105, textureX, textureY); // Box 123
		rightWingModel[6] = new ModelRendererTurbo(this, 713, 105, textureX, textureY); // Box 125
		rightWingModel[7] = new ModelRendererTurbo(this, 785, 105, textureX, textureY); // Box 126
		rightWingModel[8] = new ModelRendererTurbo(this, 441, 113, textureX, textureY); // Box 128
		rightWingModel[9] = new ModelRendererTurbo(this, 745, 81, textureX, textureY); // Box 129
		rightWingModel[10] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 131
		rightWingModel[11] = new ModelRendererTurbo(this, 137, 89, textureX, textureY); // Box 132
		rightWingModel[12] = new ModelRendererTurbo(this, 105, 193, textureX, textureY); // Box 204
		rightWingModel[13] = new ModelRendererTurbo(this, 529, 193, textureX, textureY); // Box 205
		rightWingModel[14] = new ModelRendererTurbo(this, 209, 193, textureX, textureY); // Box 206
		rightWingModel[15] = new ModelRendererTurbo(this, 345, 193, textureX, textureY); // Box 207
		rightWingModel[16] = new ModelRendererTurbo(this, 905, 177, textureX, textureY); // Box 208
		rightWingModel[17] = new ModelRendererTurbo(this, 633, 193, textureX, textureY); // Box 209
		rightWingModel[18] = new ModelRendererTurbo(this, 657, 209, textureX, textureY); // Box 210
		rightWingModel[19] = new ModelRendererTurbo(this, 745, 209, textureX, textureY); // Box 211
		rightWingModel[20] = new ModelRendererTurbo(this, 401, 137, textureX, textureY); // Box 212
		rightWingModel[21] = new ModelRendererTurbo(this, 105, 185, textureX, textureY); // Box 213
		rightWingModel[22] = new ModelRendererTurbo(this, 529, 185, textureX, textureY); // Box 214
		rightWingModel[23] = new ModelRendererTurbo(this, 417, 137, textureX, textureY); // Box 215
		rightWingModel[24] = new ModelRendererTurbo(this, 993, 193, textureX, textureY); // Box 216

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 16, 3, 24, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 117
		rightWingModel[0].setRotationPoint(-56F, -14F, 7F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 16, 3, 17, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 118
		rightWingModel[1].setRotationPoint(-40F, -14F, 14F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 16, 3, 9, 0F,0F, 0F, 0F, 10F, -1F, 5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, -1F, 5F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 119
		rightWingModel[2].setRotationPoint(-40F, -14F, 5F);

		rightWingModel[3].addShapeBox(0F, 0F, 0F, 16, 3, 28, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F); // Box 121
		rightWingModel[3].setRotationPoint(-56F, -14F, 31F);

		rightWingModel[4].addShapeBox(0F, 0F, 0F, 16, 3, 14, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 122
		rightWingModel[4].setRotationPoint(-69F, -47F, 0F);

		rightWingModel[5].addShapeBox(0F, 0F, 0F, 14, 3, 10, 0F,0F, 0F, 0F, -4F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 123
		rightWingModel[5].setRotationPoint(-53F, -47F, 4F);

		rightWingModel[6].addShapeBox(0F, 0F, 0F, 14, 3, 19, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F); // Box 125
		rightWingModel[6].setRotationPoint(-53F, -47F, 14F);

		rightWingModel[7].addShapeBox(0F, 0F, 0F, 16, 3, 19, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F); // Box 126
		rightWingModel[7].setRotationPoint(-69F, -47F, 14F);

		rightWingModel[8].addShapeBox(0F, 0F, 0F, 12, 3, 61, 0F,2F, -4F, 0F, 2F, -3F, 0F, -3F, 1F, 0F, 0F, 1F, 0F, 2F, 2F, 0F, 2F, 3F, 0F, -3F, -3F, 0F, 0F, -3F, 0F); // Box 128
		rightWingModel[8].setRotationPoint(-67F, -51F, 33F);

		rightWingModel[9].addShapeBox(0F, 0F, 0F, 16, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -6F, 1F, 0F, -4F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -1F, 0F, -4F, -1F, 0F); // Box 129
		rightWingModel[9].setRotationPoint(-67F, -52F, 94F);

		rightWingModel[10].addShapeBox(0F, 0F, 0F, 16, 3, 35, 0F,0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, -3F, -2F, 0F); // Box 131
		rightWingModel[10].setRotationPoint(-56F, -18F, 59F);

		rightWingModel[11].addShapeBox(0F, 0F, 0F, 15, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -6F, 1F, 0F, -4F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -1F, 0F, -4F, -1F, 0F); // Box 132
		rightWingModel[11].setRotationPoint(-53F, -18F, 94F);

		rightWingModel[12].addShapeBox(0F, 0F, 0F, 29, 11, 20, 0F,0F, 0F, -10F, 0F, -5F, -10F, 0F, -5F, -10F, 0F, 0F, -10F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 204
		rightWingModel[12].setRotationPoint(-54F, -4F, 72F);

		rightWingModel[13].addShapeBox(0F, 0F, 0F, 29, 10, 20, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, -2F, -10F); // Box 205
		rightWingModel[13].setRotationPoint(-54F, 4F, 72F);

		rightWingModel[14].addShapeBox(0F, 0F, 0F, 11, 8, 20, 0F,0F, -1F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, -1F, -10F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -3F); // Box 206
		rightWingModel[14].setRotationPoint(-65F, -4F, 72F);

		rightWingModel[15].addShapeBox(0F, 0F, 0F, 11, 10, 20, 0F,0F, 0F, -3F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, -5F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, -5F, -10F); // Box 207
		rightWingModel[15].setRotationPoint(-65F, 2F, 72F);

		rightWingModel[16].addShapeBox(0F, 0F, 0F, 6, 5, 14, 0F,0F, -2.9999F, -6.9999F, 0F, 0F, -6.9999F, 0F, 0F, -6.9999F, 0F, -2.9999F, -6.9999F, 0F, -1.9999F, -6.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9999F, -6.9999F); // Box 208
		rightWingModel[16].setRotationPoint(-71F, -3F, 75F);

		rightWingModel[17].addShapeBox(0F, 0F, 0F, 6, 7, 14, 0F,0F, 0F, -6.9999F, 0F, -1.9999F, 0F, 0F, -1.9999F, 0F, 0F, 0F, -6.9999F, 0F, -6.9999F, -6.9999F, 0F, 0F, -6.9999F, 0F, 0F, -6.9999F, 0F, -6.9999F, -6.9999F); // Box 209
		rightWingModel[17].setRotationPoint(-71F, 0F, 75F);

		rightWingModel[18].addShapeBox(0F, 0F, 0F, 23, 7, 20, 0F,0F, 0F, 0F, 0F, -2.9999F, -9.9999F, 0F, -2.9999F, -9.9999F, 0F, 0F, 0F, 0F, 0F, -9.9999F, 0F, -3.9999F, -9.9999F, 0F, -3.9999F, -9.9999F, 0F, 0F, -9.9999F); // Box 210
		rightWingModel[18].setRotationPoint(-25F, 7F, 72F);

		rightWingModel[19].addShapeBox(0F, 0F, 0F, 23, 9, 20, 0F,0F, 0F, -9.9999F, 0F, -8.9999F, -9.9999F, 0F, -8.9999F, -9.9999F, 0F, 0F, -9.9999F, 0F, -2.9999F, 0F, 0F, 0F, -9.9999F, 0F, 0F, -9.9999F, 0F, -2.9999F, 0F); // Box 211
		rightWingModel[19].setRotationPoint(-25F, 1F, 72F);

		rightWingModel[20].addShapeBox(0F, 0F, 0F, 2, 17, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 212
		rightWingModel[20].setRotationPoint(-53F, -16F, 81F);

		rightWingModel[21].addShapeBox(0F, 0F, 0F, 2, 20, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 213
		rightWingModel[21].setRotationPoint(-42F, -16F, 81F);

		rightWingModel[22].addShapeBox(0F, 0F, 0F, 2, 20, 2, 0F,0F, 0F, 23F, 0F, 0F, 23F, 0F, 0F, -23F, 0F, 0F, -23F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 214
		rightWingModel[22].setRotationPoint(-42F, -14F, 81F);

		rightWingModel[23].addShapeBox(0F, 0F, 0F, 2, 17, 2, 0F,0F, 0F, 22F, 0F, 0F, 22F, 0F, 0F, -22F, 0F, 0F, -22F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 215
		rightWingModel[23].setRotationPoint(-53F, -15F, 81F);

		rightWingModel[24].addShapeBox(0F, 0F, 0F, 2, 20, 2, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 18F, 0F, 0F, -18F, 0F, 0F, -18F, 0F, 0F, 18F, 0F, 0F); // Box 216
		rightWingModel[24].setRotationPoint(-40F, -16F, 81F);
	}

	private void inityawFlapModel_1()
	{
		yawFlapModel[0] = new ModelRendererTurbo(this, 937, 41, textureX, textureY); // Box 73
		yawFlapModel[1] = new ModelRendererTurbo(this, 697, 41, textureX, textureY); // Box 74
		yawFlapModel[2] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 156
		yawFlapModel[3] = new ModelRendererTurbo(this, 529, 113, textureX, textureY); // Box 157

		yawFlapModel[0].addShapeBox(0F, 0F, -1F, 12, 31, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		yawFlapModel[0].setRotationPoint(49F, -54F, 0F);

		yawFlapModel[1].addShapeBox(0F, 0F, -1F, 10, 8, 1, 0F,0F, 0F, 0F, -5F, -1F, 0F, -5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		yawFlapModel[1].setRotationPoint(49F, -62F, 0F);

		yawFlapModel[2].addShapeBox(0F, 0F, 0F, 12, 31, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		yawFlapModel[2].setRotationPoint(49F, -54F, 0F);

		yawFlapModel[3].addShapeBox(0F, 0F, 0F, 10, 8, 1, 0F,0F, 0F, 0F, -5F, -1F, 0F, -5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		yawFlapModel[3].setRotationPoint(49F, -62F, 0F);
	}

	private void initpitchFlapLeftModel_1()
	{
		pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 77

		pitchFlapLeftModel[0].addShapeBox(0F, 0F, 0F, 11, 1, 36, 0F,0F, 0F, 0F, -6F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		pitchFlapLeftModel[0].setRotationPoint(43F, -26F, -36F);
	}

	private void initpitchFlapRightModel_1()
	{
		pitchFlapRightModel[0] = new ModelRendererTurbo(this, 401, 121, textureX, textureY); // Box 160

		pitchFlapRightModel[0].addShapeBox(0F, 0F, 0F, 11, 1, 36, 0F,0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -3F, 0F, 0F, 0F); // Box 160
		pitchFlapRightModel[0].setRotationPoint(43F, -26F, 0F);
	}

	private void initpitchFlapLeftWingModel_1()
	{
		pitchFlapLeftWingModel[0] = new ModelRendererTurbo(this, 705, 25, textureX, textureY); // Box 37
		pitchFlapLeftWingModel[1] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 44
		pitchFlapLeftWingModel[2] = new ModelRendererTurbo(this, 841, 33, textureX, textureY); // Box 47

		pitchFlapLeftWingModel[0].addShapeBox(0F, 0F, 0F, 16, 3, 28, 0F,0F, 2F, 0F, -5F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -5F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 37
		pitchFlapLeftWingModel[0].setRotationPoint(-40F, -14F, -59F);

		pitchFlapLeftWingModel[1].addShapeBox(0F, 0F, 0F, 12, 3, 61, 0F,5F, 1F, 0F, -10F, 1F, 0F, 2F, -4F, 0F, 0F, -3F, 0F, 5F, -3F, 0F, -10F, -3F, 0F, 2F, 2F, 0F, 0F, 3F, 0F); // Box 44
		pitchFlapLeftWingModel[1].setRotationPoint(-53F, -51F, -94F);

		pitchFlapLeftWingModel[2].addShapeBox(0F, 0F, 0F, 11, 3, 35, 0F,0F, 0F, 0F, -9F, 0F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -9F, -2F, 0F, 0F, 1F, 0F, 0F, 2F, 0F); // Box 47
		pitchFlapLeftWingModel[2].setRotationPoint(-40F, -18F, -94F);
	}

	private void initpitchFlapRightWingModel_1()
	{
		pitchFlapRightWingModel[0] = new ModelRendererTurbo(this, 249, 105, textureX, textureY); // Box 120
		pitchFlapRightWingModel[1] = new ModelRendererTurbo(this, 801, 105, textureX, textureY); // Box 127
		pitchFlapRightWingModel[2] = new ModelRendererTurbo(this, 889, 105, textureX, textureY); // Box 130

		pitchFlapRightWingModel[0].addShapeBox(0F, 0F, 0F, 16, 3, 28, 0F,0F, 0F, 0F, 0F, -1F, 0F, -5F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -5F, -3F, 0F, 0F, -2F, 0F); // Box 120
		pitchFlapRightWingModel[0].setRotationPoint(-40F, -14F, 31F);

		pitchFlapRightWingModel[1].addShapeBox(0F, 0F, 0F, 12, 3, 61, 0F,0F, -3F, 0F, 2F, -4F, 0F, -10F, 1F, 0F, 5F, 1F, 0F, 0F, 3F, 0F, 2F, 2F, 0F, -10F, -3F, 0F, 5F, -3F, 0F); // Box 127
		pitchFlapRightWingModel[1].setRotationPoint(-53F, -51F, 33F);

		pitchFlapRightWingModel[2].addShapeBox(0F, 0F, 0F, 11, 3, 35, 0F,0F, -2F, 0F, 0F, -3F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, -9F, -2F, 0F, 0F, -2F, 0F); // Box 130
		pitchFlapRightWingModel[2].setRotationPoint(-40F, -18F, 59F);
	}

	private void initPropeller()
	{
		propellerModels = new ModelRendererTurbo[1][3];
		propellerModels[0] = makeProp1(-99F, -23F, 0F);
	}

	private ModelRendererTurbo[] makeProp1(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[3];
		prop[0] = new ModelRendererTurbo(this, 0, 250, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 250, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 0, 250, textureX, textureY);
		prop[0].addBox(-1F, -24F, -2F, 2, 24, 4, 0.0F);
		prop[1].addBox(-1F, -24F, -2F, 2, 24, 4, 0.0F);
		prop[2].addBox(-1F, -24F, -2F, 2, 24, 4, 0.0F);
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
		gun_1_Model[1][0] = new ModelRendererTurbo(this, 59, 230, textureX, textureY); // Import 
		gun_1_Model[1][1] = new ModelRendererTurbo(this, 67, 230, textureX, textureY); // Import 
		gun_1_Model[1][2] = new ModelRendererTurbo(this, 75, 230, textureX, textureY); // Import 
		gun_1_Model[1][3] = new ModelRendererTurbo(this, 83, 230, textureX, textureY); // Import 
		gun_1_Model[1][4] = new ModelRendererTurbo(this, 91, 230, textureX, textureY); // Import 
		gun_1_Model[1][5] = new ModelRendererTurbo(this, 99, 230, textureX, textureY); // Import 
		gun_1_Model[1][6] = new ModelRendererTurbo(this, 115, 230, textureX, textureY); // Import 
		gun_1_Model[1][7] = new ModelRendererTurbo(this, 123, 230, textureX, textureY); // Import 
		gun_1_Model[1][8] = new ModelRendererTurbo(this, 139, 230, textureX, textureY); // Import 
		gun_1_Model[1][9] = new ModelRendererTurbo(this, 155, 230, textureX, textureY); // Import 
		gun_1_Model[1][10] = new ModelRendererTurbo(this, 171, 230, textureX, textureY); // Import 
		gun_1_Model[1][11] = new ModelRendererTurbo(this, 187, 230, textureX, textureY); // Import 
		gun_1_Model[1][12] = new ModelRendererTurbo(this, 195, 230, textureX, textureY); // Import 
		gun_1_Model[1][13] = new ModelRendererTurbo(this, 203, 230, textureX, textureY); // Import 
		gun_1_Model[1][14] = new ModelRendererTurbo(this, 211, 230, textureX, textureY); // Import 
		gun_1_Model[1][15] = new ModelRendererTurbo(this, 219, 230, textureX, textureY); // Import 
		gun_1_Model[1][16] = new ModelRendererTurbo(this, 227, 230, textureX, textureY); // Import 
		gun_1_Model[1][17] = new ModelRendererTurbo(this, 235, 230, textureX, textureY); // Import 
		gun_1_Model[1][18] = new ModelRendererTurbo(this, 243, 230, textureX, textureY); // Import 
		gun_1_Model[1][19] = new ModelRendererTurbo(this, 251, 230, textureX, textureY); // Import 
		gun_1_Model[1][20] = new ModelRendererTurbo(this, 259, 230, textureX, textureY); // Import 
		gun_1_Model[1][21] = new ModelRendererTurbo(this, 267, 230, textureX, textureY); // Import 
		gun_1_Model[1][22] = new ModelRendererTurbo(this, 275, 230, textureX, textureY); // Import 
		gun_1_Model[1][23] = new ModelRendererTurbo(this, 283, 230, textureX, textureY); // Import 
		gun_1_Model[1][24] = new ModelRendererTurbo(this, 291, 230, textureX, textureY); // Import 
		gun_1_Model[1][25] = new ModelRendererTurbo(this, 299, 230, textureX, textureY); // Import 
		gun_1_Model[1][26] = new ModelRendererTurbo(this, 307, 230, textureX, textureY); // Import 
		gun_1_Model[1][27] = new ModelRendererTurbo(this, 59, 238, textureX, textureY); // Import 
		gun_1_Model[1][28] = new ModelRendererTurbo(this, 67, 238, textureX, textureY); // Import 
		gun_1_Model[1][29] = new ModelRendererTurbo(this, 75, 238, textureX, textureY); // Import 
		gun_1_Model[1][30] = new ModelRendererTurbo(this, 91, 238, textureX, textureY); // Import 
		gun_1_Model[1][31] = new ModelRendererTurbo(this, 99, 238, textureX, textureY); // Import 
		gun_1_Model[1][32] = new ModelRendererTurbo(this, 107, 238, textureX, textureY); // Import 
		gun_1_Model[1][33] = new ModelRendererTurbo(this, 115, 238, textureX, textureY); // Import 
		gun_1_Model[1][34] = new ModelRendererTurbo(this, 131, 238, textureX, textureY); // Import 
		gun_1_Model[1][35] = new ModelRendererTurbo(this, 155, 238, textureX, textureY); // Import 
		gun_1_Model[1][36] = new ModelRendererTurbo(this, 187, 238, textureX, textureY); // Import 
		gun_1_Model[1][37] = new ModelRendererTurbo(this, 195, 238, textureX, textureY); // Import 
		gun_1_Model[1][38] = new ModelRendererTurbo(this, 203, 238, textureX, textureY); // Import 
		gun_1_Model[1][39] = new ModelRendererTurbo(this, 211, 238, textureX, textureY); // Import 
		gun_1_Model[1][40] = new ModelRendererTurbo(this, 219, 238, textureX, textureY); // Import 
		gun_1_Model[1][41] = new ModelRendererTurbo(this, 227, 238, textureX, textureY); // Import 
		gun_1_Model[1][42] = new ModelRendererTurbo(this, 235, 238, textureX, textureY); // Import 
		gun_1_Model[1][43] = new ModelRendererTurbo(this, 243, 238, textureX, textureY); // Import 
		gun_1_Model[1][44] = new ModelRendererTurbo(this, 251, 238, textureX, textureY); // Import 
		gun_1_Model[1][45] = new ModelRendererTurbo(this, 259, 238, textureX, textureY); // Import 
		gun_1_Model[1][46] = new ModelRendererTurbo(this, 267, 238, textureX, textureY); // Import 
		gun_1_Model[1][47] = new ModelRendererTurbo(this, 275, 238, textureX, textureY); // Import 
		gun_1_Model[1][48] = new ModelRendererTurbo(this, 283, 238, textureX, textureY); // Import 
		gun_1_Model[1][49] = new ModelRendererTurbo(this, 291, 238, textureX, textureY); // Import 
		gun_1_Model[1][50] = new ModelRendererTurbo(this, 299, 238, textureX, textureY); // Import 
		gun_1_Model[1][51] = new ModelRendererTurbo(this, 307, 238, textureX, textureY); // Import 
		gun_1_Model[1][52] = new ModelRendererTurbo(this, 59, 246, textureX, textureY); // Import 
		gun_1_Model[1][53] = new ModelRendererTurbo(this, 67, 246, textureX, textureY); // Import 
		gun_1_Model[1][54] = new ModelRendererTurbo(this, 75, 246, textureX, textureY); // Import 
		gun_1_Model[1][55] = new ModelRendererTurbo(this, 83, 246, textureX, textureY); // Import 
		gun_1_Model[1][56] = new ModelRendererTurbo(this, 91, 246, textureX, textureY); // Import 
		gun_1_Model[1][57] = new ModelRendererTurbo(this, 99, 246, textureX, textureY); // Import 
		gun_1_Model[1][58] = new ModelRendererTurbo(this, 107, 246, textureX, textureY); // Import 
		gun_1_Model[1][59] = new ModelRendererTurbo(this, 115, 246, textureX, textureY); // Import 
		gun_1_Model[1][60] = new ModelRendererTurbo(this, 123, 246, textureX, textureY); // Import 
		gun_1_Model[1][61] = new ModelRendererTurbo(this, 131, 246, textureX, textureY); // Import 
		gun_1_Model[1][62] = new ModelRendererTurbo(this, 139, 246, textureX, textureY); // Import 
		gun_1_Model[1][63] = new ModelRendererTurbo(this, 147, 246, textureX, textureY); // Import 
		gun_1_Model[1][64] = new ModelRendererTurbo(this, 155, 246, textureX, textureY); // Import 
		gun_1_Model[1][65] = new ModelRendererTurbo(this, 171, 246, textureX, textureY); // Import 
		gun_1_Model[1][66] = new ModelRendererTurbo(this, 179, 246, textureX, textureY); // Import 
		gun_1_Model[1][67] = new ModelRendererTurbo(this, 187, 246, textureX, textureY); // Import 
		gun_1_Model[1][68] = new ModelRendererTurbo(this, 195, 246, textureX, textureY); // Import 
		gun_1_Model[1][69] = new ModelRendererTurbo(this, 203, 246, textureX, textureY); // Import 
		gun_1_Model[1][70] = new ModelRendererTurbo(this, 211, 246, textureX, textureY); // Import 
		gun_1_Model[1][71] = new ModelRendererTurbo(this, 219, 246, textureX, textureY); // Import 
		gun_1_Model[1][72] = new ModelRendererTurbo(this, 227, 246, textureX, textureY); // Import 
		gun_1_Model[1][73] = new ModelRendererTurbo(this, 235, 246, textureX, textureY); // Import 
		gun_1_Model[1][74] = new ModelRendererTurbo(this, 243, 246, textureX, textureY); // Import 
		gun_1_Model[1][75] = new ModelRendererTurbo(this, 251, 246, textureX, textureY); // Import 
		gun_1_Model[1][76] = new ModelRendererTurbo(this, 259, 246, textureX, textureY); // Import 
		gun_1_Model[1][77] = new ModelRendererTurbo(this, 267, 246, textureX, textureY); // Import 

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
			gunPart.setRotationPoint(0F, -38F, 0F);
		}


		gun_1_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("TailGun", gun_1_Model);
	}
}