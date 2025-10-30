//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Gladiator
// Model Creator: AobaKuma
// Created on: 04.12.2017 - 17:22:58
// Last changed on: 04.12.2017 - 17:22:58

package com.flansmod.client.model.Taskball; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelGladiator extends ModelPlane //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelGladiator() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[97];
		tailModel = new ModelRendererTurbo[5];
		leftWingModel = new ModelRendererTurbo[74];
		rightWingModel = new ModelRendererTurbo[92];
		yawFlapModel = new ModelRendererTurbo[7];
		pitchFlapLeftModel = new ModelRendererTurbo[6];
		pitchFlapRightModel = new ModelRendererTurbo[6];
		pitchFlapLeftWingModel = new ModelRendererTurbo[14];
		pitchFlapRightWingModel = new ModelRendererTurbo[14];

		initbodyModel_1();
		inittailModel_1();
		initleftWingModel_1();
		initrightWingModel_1();
		inityawFlapModel_1();
		initpitchFlapLeftModel_1();
		initpitchFlapRightModel_1();
		initpitchFlapLeftWingModel_1();
		initpitchFlapRightWingModel_1();

		initPropeller();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 1, 241, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 33, 241, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 10
		bodyModel[11] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 11
		bodyModel[12] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 12
		bodyModel[13] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 13
		bodyModel[14] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 14
		bodyModel[15] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Box 16
		bodyModel[16] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 17
		bodyModel[17] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // Box 18
		bodyModel[18] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Box 19
		bodyModel[19] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 20
		bodyModel[20] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 21
		bodyModel[21] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 22
		bodyModel[22] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 23
		bodyModel[23] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 24
		bodyModel[24] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 25
		bodyModel[25] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 26
		bodyModel[26] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Box 27
		bodyModel[27] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 28
		bodyModel[28] = new ModelRendererTurbo(this, 369, 65, textureX, textureY); // Box 42
		bodyModel[29] = new ModelRendererTurbo(this, 369, 65, textureX, textureY); // Box 43
		bodyModel[30] = new ModelRendererTurbo(this, 369, 65, textureX, textureY); // Box 44
		bodyModel[31] = new ModelRendererTurbo(this, 369, 65, textureX, textureY); // Box 45
		bodyModel[32] = new ModelRendererTurbo(this, 345, 49, textureX, textureY); // Box 46
		bodyModel[33] = new ModelRendererTurbo(this, 369, 65, textureX, textureY); // Box 47
		bodyModel[34] = new ModelRendererTurbo(this, 369, 65, textureX, textureY); // Box 48
		bodyModel[35] = new ModelRendererTurbo(this, 369, 65, textureX, textureY); // Box 49
		bodyModel[36] = new ModelRendererTurbo(this, 369, 65, textureX, textureY); // Box 50
		bodyModel[37] = new ModelRendererTurbo(this, 369, 65, textureX, textureY); // Box 51
		bodyModel[38] = new ModelRendererTurbo(this, 369, 65, textureX, textureY); // Box 52
		bodyModel[39] = new ModelRendererTurbo(this, 369, 65, textureX, textureY); // Box 53
		bodyModel[40] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Box 66
		bodyModel[41] = new ModelRendererTurbo(this, 121, 81, textureX, textureY); // Box 67
		bodyModel[42] = new ModelRendererTurbo(this, 185, 81, textureX, textureY); // Box 68
		bodyModel[43] = new ModelRendererTurbo(this, 369, 81, textureX, textureY); // Box 69
		bodyModel[44] = new ModelRendererTurbo(this, 33, 193, textureX, textureY); // Box 253
		bodyModel[45] = new ModelRendererTurbo(this, 65, 193, textureX, textureY); // Box 254
		bodyModel[46] = new ModelRendererTurbo(this, 137, 193, textureX, textureY); // Box 255
		bodyModel[47] = new ModelRendererTurbo(this, 169, 193, textureX, textureY); // Box 256
		bodyModel[48] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 257
		bodyModel[49] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 258
		bodyModel[50] = new ModelRendererTurbo(this, 185, 193, textureX, textureY); // Box 259
		bodyModel[51] = new ModelRendererTurbo(this, 217, 193, textureX, textureY); // Box 260
		bodyModel[52] = new ModelRendererTurbo(this, 249, 193, textureX, textureY); // Box 261
		bodyModel[53] = new ModelRendererTurbo(this, 281, 193, textureX, textureY); // Box 262
		bodyModel[54] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 263
		bodyModel[55] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 264
		bodyModel[56] = new ModelRendererTurbo(this, 297, 193, textureX, textureY); // Box 265
		bodyModel[57] = new ModelRendererTurbo(this, 217, 193, textureX, textureY); // Box 266
		bodyModel[58] = new ModelRendererTurbo(this, 361, 193, textureX, textureY); // Box 267
		bodyModel[59] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 268
		bodyModel[60] = new ModelRendererTurbo(this, 393, 193, textureX, textureY); // Box 269
		bodyModel[61] = new ModelRendererTurbo(this, 73, 241, textureX, textureY); // Box 265
		bodyModel[62] = new ModelRendererTurbo(this, 105, 241, textureX, textureY); // Box 266
		bodyModel[63] = new ModelRendererTurbo(this, 145, 241, textureX, textureY); // Box 592
		bodyModel[64] = new ModelRendererTurbo(this, 25, 241, textureX, textureY); // Box 593
		bodyModel[65] = new ModelRendererTurbo(this, 153, 241, textureX, textureY); // Box 594
		bodyModel[66] = new ModelRendererTurbo(this, 153, 241, textureX, textureY); // Box 595
		bodyModel[67] = new ModelRendererTurbo(this, 161, 241, textureX, textureY); // Box 596
		bodyModel[68] = new ModelRendererTurbo(this, 169, 241, textureX, textureY); // Import 
		bodyModel[69] = new ModelRendererTurbo(this, 185, 241, textureX, textureY); // Box 905
		bodyModel[70] = new ModelRendererTurbo(this, 193, 241, textureX, textureY); // Box 906
		bodyModel[71] = new ModelRendererTurbo(this, 201, 241, textureX, textureY); // Box 444
		bodyModel[72] = new ModelRendererTurbo(this, 209, 241, textureX, textureY); // Box 445
		bodyModel[73] = new ModelRendererTurbo(this, 209, 241, textureX, textureY); // Box 638
		bodyModel[74] = new ModelRendererTurbo(this, 57, 241, textureX, textureY); // Box 639
		bodyModel[75] = new ModelRendererTurbo(this, 89, 241, textureX, textureY); // Box 640
		bodyModel[76] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 641
		bodyModel[77] = new ModelRendererTurbo(this, 233, 241, textureX, textureY); // Box 642
		bodyModel[78] = new ModelRendererTurbo(this, 225, 241, textureX, textureY); // Box 643
		bodyModel[79] = new ModelRendererTurbo(this, 257, 241, textureX, textureY); // Box 644
		bodyModel[80] = new ModelRendererTurbo(this, 265, 241, textureX, textureY); // Box 645
		bodyModel[81] = new ModelRendererTurbo(this, 289, 241, textureX, textureY); // Box 646
		bodyModel[82] = new ModelRendererTurbo(this, 297, 241, textureX, textureY); // Box 675
		bodyModel[83] = new ModelRendererTurbo(this, 305, 241, textureX, textureY); // Box 676
		bodyModel[84] = new ModelRendererTurbo(this, 313, 241, textureX, textureY); // Box 677
		bodyModel[85] = new ModelRendererTurbo(this, 321, 241, textureX, textureY); // Box 400
		bodyModel[86] = new ModelRendererTurbo(this, 329, 241, textureX, textureY); // Box 401
		bodyModel[87] = new ModelRendererTurbo(this, 337, 241, textureX, textureY); // Box 402
		bodyModel[88] = new ModelRendererTurbo(this, 345, 241, textureX, textureY); // Box 415
		bodyModel[89] = new ModelRendererTurbo(this, 361, 241, textureX, textureY); // Box 416
		bodyModel[90] = new ModelRendererTurbo(this, 377, 241, textureX, textureY); // Box 417
		bodyModel[91] = new ModelRendererTurbo(this, 49, 285, textureX, textureY); // Box 295
		bodyModel[92] = new ModelRendererTurbo(this, 49, 271, textureX, textureY); // Box 296
		bodyModel[93] = new ModelRendererTurbo(this, 49, 278, textureX, textureY); // Box 297
		bodyModel[94] = new ModelRendererTurbo(this, 193, 285, textureX, textureY); // Box 298
		bodyModel[95] = new ModelRendererTurbo(this, 193, 271, textureX, textureY); // Box 299
		bodyModel[96] = new ModelRendererTurbo(this, 193, 278, textureX, textureY); // Box 300

		bodyModel[0].addShapeBox(0F, 0F, 0F, 21, 6, 7, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 6F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 6F); // Box 0
		bodyModel[0].setRotationPoint(24F, -34F, -3.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 21, 5, 15, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 2F, 2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2F, 2F); // Box 1
		bodyModel[1].setRotationPoint(24F, -28F, -7.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 24, 4, 7, 0F,0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 2F, 4F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2F, 4F); // Box 2
		bodyModel[2].setRotationPoint(45F, -28F, -3.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 24, 3, 7, 0F,0F, 3F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 3F, 0F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F); // Box 3
		bodyModel[3].setRotationPoint(45F, -31F, -3.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 9, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[4].setRotationPoint(15F, -28F, -9.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 19, 6, 5, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 5
		bodyModel[5].setRotationPoint(5F, -34F, -9.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 13, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[6].setRotationPoint(2F, -28F, -9.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 28, 6, 7, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 5F); // Box 7
		bodyModel[7].setRotationPoint(-23F, -34F, -3.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 4, 6, 7, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 3F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 3F); // Box 8
		bodyModel[8].setRotationPoint(-27F, -34F, -3.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 25, 7, 19, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 9
		bodyModel[9].setRotationPoint(-23F, -28F, -9.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 4, 5, 7, 0F,0F, 0F, 3F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 10
		bodyModel[10].setRotationPoint(-27F, -21F, -3.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 25, 5, 7, 0F,0F, 0F, 5F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[11].setRotationPoint(-23F, -21F, -3.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 21, 6, 7, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 12
		bodyModel[12].setRotationPoint(24F, -40F, -3.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 24, 5, 7, 0F,0F, 0F, 4F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 4F, 0F, 2F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 2F, 0F); // Box 13
		bodyModel[13].setRotationPoint(45F, -22F, -3.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 21, 6, 7, 0F,0F, 0F, 6F, 0F, 1F, 4F, 0F, 1F, 4F, 0F, 0F, 6F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 14
		bodyModel[14].setRotationPoint(24F, -21F, -3.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 22, 8, 7, 0F,0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[15].setRotationPoint(2F, -21F, -3.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 4, 7, 19, 0F,0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -3F); // Box 17
		bodyModel[16].setRotationPoint(-27F, -28F, -9.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 8, 8, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[17].setRotationPoint(-35F, -28F, -11F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 8, 7, 22, 0F,0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[18].setRotationPoint(-35F, -35F, -11F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 8, 7, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F); // Box 20
		bodyModel[19].setRotationPoint(-35F, -20F, -11F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 4, 7, 22, 0F,0F, 1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -3F, 0F, -3F, -8F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -3F, -8F); // Box 21
		bodyModel[20].setRotationPoint(-39F, -20F, -11F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 4, 8, 22, 0F,0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F); // Box 22
		bodyModel[21].setRotationPoint(-39F, -28F, -11F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 4, 7, 22, 0F,0F, -3F, -8F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -3F, -8F, 0F, 1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -3F); // Box 23
		bodyModel[22].setRotationPoint(-39F, -35F, -11F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 13, 5, 5, 0F,0F, 0F, 1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F); // Box 24
		bodyModel[23].setRotationPoint(69F, -28F, -2.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 13, 4, 5, 0F,0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 1F, 0F); // Box 25
		bodyModel[24].setRotationPoint(69F, -23F, -2.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 13, 2, 5, 0F,0F, 0F, -1F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 1F); // Box 26
		bodyModel[25].setRotationPoint(69F, -30F, -2.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 28, 2, 7, 0F,0F, -1F, -2F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 27
		bodyModel[26].setRotationPoint(-23F, -36F, -3.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 19, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[27].setRotationPoint(5F, -34F, 4.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 14, 2, 6, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 42
		bodyModel[28].setRotationPoint(64F, -24F, 1.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 14, 2, 6, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 43
		bodyModel[29].setRotationPoint(64F, -24F, 7.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 12, 2, 5, 0F,1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F); // Box 44
		bodyModel[30].setRotationPoint(66F, -24F, 13.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 11, 2, 5, 0F,1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 45
		bodyModel[31].setRotationPoint(67F, -24F, 18.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 9, 2, 3, 0F,2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 46
		bodyModel[32].setRotationPoint(69F, -24F, 23.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,3F, -0.5F, 0F, 4F, 0F, 0F, 0F, 0F, 0.5F, 1F, -0.5F, -1F, 3F, -0.5F, 0F, 4F, 0F, 0F, 0F, 0F, 0.5F, 1F, -0.5F, -1F); // Box 47
		bodyModel[33].setRotationPoint(72F, -24F, 26.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 14, 2, 6, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 48
		bodyModel[34].setRotationPoint(64F, -24F, -7.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 14, 2, 6, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 49
		bodyModel[35].setRotationPoint(64F, -24F, -13.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 12, 2, 5, 0F,0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, -0.5F, 0F); // Box 50
		bodyModel[36].setRotationPoint(66F, -24F, -18.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 11, 2, 5, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, -0.5F, 0F); // Box 51
		bodyModel[37].setRotationPoint(67F, -24F, -23.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 9, 2, 3, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -0.5F, 0F); // Box 52
		bodyModel[38].setRotationPoint(69F, -24F, -26.5F);

		bodyModel[39].addShapeBox(0F, -0.5F, 0F, 2, 2, 3, 0F,1F, -0.5F, -1F, 0F, 0F, 0.5F, 4F, 0F, 0F, 3F, -0.5F, 0F, 1F, -0.5F, -1F, 0F, 0F, 0.5F, 4F, 0F, 0F, 3F, -0.5F, 0F); // Box 53
		bodyModel[39].setRotationPoint(72F, -23.5F, -29.5F);

		bodyModel[40].addShapeBox(0F, -1F, -12F, 4, 2, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[40].setRotationPoint(-34F, -24F, 0F);

		bodyModel[41].addShapeBox(0F, -1F, -12F, 4, 2, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[41].setRotationPoint(-34F, -24F, 0F);
		bodyModel[41].rotateAngleX = 0.78539816F;

		bodyModel[42].addShapeBox(0F, -1F, -12F, 4, 2, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[42].setRotationPoint(-34F, -24F, 0F);
		bodyModel[42].rotateAngleX = 1.57079633F;

		bodyModel[43].addShapeBox(0F, -1F, -12F, 4, 2, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[43].setRotationPoint(-34F, -24F, 0F);
		bodyModel[43].rotateAngleX = 2.35619449F;

		bodyModel[44].addShapeBox(0F, 0F, 0F, 8, 7, 7, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 253
		bodyModel[44].setRotationPoint(16F, -41F, -3.5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 8, 7, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 254
		bodyModel[45].setRotationPoint(8F, -41F, -3.5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 7, 7, 7, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 255
		bodyModel[46].setRotationPoint(1F, -41F, -3.5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 4, 18, 2, 0F,0F, 1F, 2F, 0F, 1F, 2F, 0F, 3F, -2F, 0F, 3F, -2F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 6F, 0F, 0F, 6F); // Box 256
		bodyModel[47].setRotationPoint(-17F, -15F, 5.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 257
		bodyModel[48].setRotationPoint(-17F, 3F, 12.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 258
		bodyModel[49].setRotationPoint(-17F, 3F, 14.5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 12, 4, 2, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 259
		bodyModel[50].setRotationPoint(-21F, -2F, 15.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 12, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
		bodyModel[51].setRotationPoint(-21F, 2F, 15.5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 12, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 261
		bodyModel[52].setRotationPoint(-21F, 6F, 15.5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 4, 18, 2, 0F,0F, 3F, -2F, 0F, 3F, -2F, 0F, 1F, 2F, 0F, 1F, 2F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, -7F, 0F, 0F, -7F); // Box 262
		bodyModel[53].setRotationPoint(-17F, -15F, -7.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 263
		bodyModel[54].setRotationPoint(-17F, 3F, -14.5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 264
		bodyModel[55].setRotationPoint(-17F, 3F, -15.5F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 12, 4, 2, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 265
		bodyModel[56].setRotationPoint(-21F, -2F, -17.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 12, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 266
		bodyModel[57].setRotationPoint(-21F, 2F, -17.5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 12, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 267
		bodyModel[58].setRotationPoint(-21F, 6F, -17.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 268
		bodyModel[59].setRotationPoint(-42F, -25F, -1F);

		bodyModel[60].addTrapezoid(0F, 0F, 0F, 3, 5, 5, 0F, -1.50F, ModelRendererTurbo.MR_RIGHT); // Box 269
		bodyModel[60].setRotationPoint(-45F, -26.5F, -2.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 9, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 265
		bodyModel[61].setRotationPoint(15F, -28F, 6.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 13, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 266
		bodyModel[62].setRotationPoint(2F, -28F, 6.5F);

		bodyModel[63].addShapeBox(-0.5F, 0F, -0.5F, 1, 7, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 592
		bodyModel[63].setRotationPoint(6.5F, -28.5F, 0F);

		bodyModel[64].addShapeBox(-0.5F, 0F, -0.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 593
		bodyModel[64].setRotationPoint(6.5F, -29.5F, 0F);

		bodyModel[65].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 5, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 594
		bodyModel[65].setRotationPoint(8.5F, -29.5F, -2F);

		bodyModel[66].addShapeBox(-0.5F, 0F, -0.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 595
		bodyModel[66].setRotationPoint(8.5F, -31.5F, -2F);

		bodyModel[67].addShapeBox(-0.5F, 0F, -0.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 596
		bodyModel[67].setRotationPoint(8.5F, -31.5F, 2F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import 
		bodyModel[68].setRotationPoint(6F, -22F, -1F);

		bodyModel[69].addShapeBox(0F, -1F, 0F, 1, 1, 2, 0F,0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Box 905
		bodyModel[69].setRotationPoint(2F, -23.5F, -4F);
		bodyModel[69].rotateAngleZ = 0.41887903F;

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Box 906
		bodyModel[70].setRotationPoint(2F, -23.5F, -4F);
		bodyModel[70].rotateAngleZ = 0.41887903F;

		bodyModel[71].addShapeBox(0F, -1F, 0F, 1, 1, 2, 0F,0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Box 444
		bodyModel[71].setRotationPoint(2F, -23.5F, 2F);
		bodyModel[71].rotateAngleZ = 0.41887903F;

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Box 445
		bodyModel[72].setRotationPoint(2F, -23.5F, 2F);
		bodyModel[72].rotateAngleZ = 0.41887903F;

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 13, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F); // Box 638
		bodyModel[73].setRotationPoint(23.5F, -38.5F, -4F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F); // Box 639
		bodyModel[74].setRotationPoint(20.5F, -25.5F, -6F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -1F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F); // Box 640
		bodyModel[75].setRotationPoint(17.5F, -22.5F, -6F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 641
		bodyModel[76].setRotationPoint(11.5F, -21.5F, -6F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 642
		bodyModel[77].setRotationPoint(8.5F, -23.5F, -6F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 7, 4, 1, 0F,4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F); // Box 643
		bodyModel[78].setRotationPoint(13.5F, -25.5F, -6F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F); // Box 644
		bodyModel[79].setRotationPoint(8.5F, -25.5F, -6F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 7, 4, 1, 0F,4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F); // Box 645
		bodyModel[80].setRotationPoint(13.5F, -25.5F, 5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F); // Box 646
		bodyModel[81].setRotationPoint(8.5F, -25.5F, 5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 675
		bodyModel[82].setRotationPoint(4.5F, -33F, 2.5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 676
		bodyModel[83].setRotationPoint(4.5F, -32.5F, 2.5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 677
		bodyModel[84].setRotationPoint(4.5F, -32.5F, 2.5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 400
		bodyModel[85].setRotationPoint(4.5F, -33F, -4F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 401
		bodyModel[86].setRotationPoint(4.5F, -32.5F, -4F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 402
		bodyModel[87].setRotationPoint(4.5F, -32.5F, -4F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 415
		bodyModel[88].setRotationPoint(4.5F, -34F, -1.25F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 416
		bodyModel[89].setRotationPoint(4.5F, -33.5F, -1.25F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 417
		bodyModel[90].setRotationPoint(4.5F, -32.5F, -1.25F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 20, 8, 0, 0F,0F, 0F, 0F, 0F, 1F, 1.75F, 0F, 1F, -1.75F, 0F, 0F, 0F, 0F, 0F, 5.75F, 0F, -2F, 5.75F, 0F, -2F, -5.75F, 0F, 0F, -5.75F); // Box 295
		bodyModel[91].setRotationPoint(24F, -21F, 9.5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 20, 7, 0, 0F,0F, 0F, 4.5F, 0F, -1F, 5.75F, 0F, -1F, -5.75F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F); // Box 296
		bodyModel[92].setRotationPoint(24F, -35F, 9.5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 20, 7, 0, 0F,0F, 0F, 0F, 0F, 0F, 1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1.75F, 0F, -1F, -1.75F, 0F, 0F, 0F); // Box 297
		bodyModel[93].setRotationPoint(24F, -28F, 9.5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 20, 7, 0, 0F,0F, 0F, 0F, 0F, 1F, -1.75F, 0F, 1F, 1.75F, 0F, 0F, 0F, 0F, 0F, -5.25F, 0F, -1F, -5.75F, 0F, -1F, 5.75F, 0F, 0F, 5.25F); // Box 298
		bodyModel[94].setRotationPoint(24F, -21F, -9.5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 20, 7, 0, 0F,0F, 0F, -4.5F, 0F, -1F, -5.75F, 0F, -1F, 5.75F, 0F, 0F, 4.5F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, 1.75F, 0F, 0F, 0F); // Box 299
		bodyModel[95].setRotationPoint(24F, -35F, -9.5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 20, 7, 0, 0F,0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, 1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1.75F, 0F, -1F, 1.75F, 0F, 0F, 0F); // Box 300
		bodyModel[96].setRotationPoint(24F, -28F, -9.5F);
	}

	private void inittailModel_1()
	{
		tailModel[0] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 29
		tailModel[1] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Box 30
		tailModel[2] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 31
		tailModel[3] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 32
		tailModel[4] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 41

		tailModel[0].addShapeBox(0F, 0F, 0F, 13, 4, 2, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -0.5F); // Box 29
		tailModel[0].setRotationPoint(69F, -38F, -1F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 10, 4, 2, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 3F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, -0.5F); // Box 30
		tailModel[1].setRotationPoint(72F, -42F, -1F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 7, 3, 2, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 3F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, -0.5F); // Box 31
		tailModel[2].setRotationPoint(75F, -45F, -1F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 7, 3, 2, 0F,-3F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 32
		tailModel[3].setRotationPoint(75F, -48F, -1F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 15, 7, 2, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -0.5F); // Box 41
		tailModel[4].setRotationPoint(67F, -34F, -1F);
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 1, 345, textureX, textureY); // Box 113
		leftWingModel[1] = new ModelRendererTurbo(this, 41, 345, textureX, textureY); // Box 114
		leftWingModel[2] = new ModelRendererTurbo(this, 81, 345, textureX, textureY); // Box 115
		leftWingModel[3] = new ModelRendererTurbo(this, 113, 345, textureX, textureY); // Box 116
		leftWingModel[4] = new ModelRendererTurbo(this, 121, 345, textureX, textureY); // Box 117
		leftWingModel[5] = new ModelRendererTurbo(this, 185, 345, textureX, textureY); // Box 118
		leftWingModel[6] = new ModelRendererTurbo(this, 169, 345, textureX, textureY); // Box 119
		leftWingModel[7] = new ModelRendererTurbo(this, 233, 345, textureX, textureY); // Box 120
		leftWingModel[8] = new ModelRendererTurbo(this, 273, 345, textureX, textureY); // Box 121
		leftWingModel[9] = new ModelRendererTurbo(this, 313, 345, textureX, textureY); // Box 122
		leftWingModel[10] = new ModelRendererTurbo(this, 353, 345, textureX, textureY); // Box 123
		leftWingModel[11] = new ModelRendererTurbo(this, 393, 345, textureX, textureY); // Box 124
		leftWingModel[12] = new ModelRendererTurbo(this, 433, 345, textureX, textureY); // Box 125
		leftWingModel[13] = new ModelRendererTurbo(this, 1, 353, textureX, textureY); // Box 126
		leftWingModel[14] = new ModelRendererTurbo(this, 41, 353, textureX, textureY); // Box 127
		leftWingModel[15] = new ModelRendererTurbo(this, 81, 353, textureX, textureY); // Box 128
		leftWingModel[16] = new ModelRendererTurbo(this, 169, 353, textureX, textureY); // Box 129
		leftWingModel[17] = new ModelRendererTurbo(this, 233, 353, textureX, textureY); // Box 130
		leftWingModel[18] = new ModelRendererTurbo(this, 273, 353, textureX, textureY); // Box 131
		leftWingModel[19] = new ModelRendererTurbo(this, 313, 353, textureX, textureY); // Box 132
		leftWingModel[20] = new ModelRendererTurbo(this, 353, 353, textureX, textureY); // Box 133
		leftWingModel[21] = new ModelRendererTurbo(this, 393, 353, textureX, textureY); // Box 134
		leftWingModel[22] = new ModelRendererTurbo(this, 433, 353, textureX, textureY); // Box 135
		leftWingModel[23] = new ModelRendererTurbo(this, 473, 353, textureX, textureY); // Box 136
		leftWingModel[24] = new ModelRendererTurbo(this, 1, 361, textureX, textureY); // Box 137
		leftWingModel[25] = new ModelRendererTurbo(this, 41, 361, textureX, textureY); // Box 138
		leftWingModel[26] = new ModelRendererTurbo(this, 81, 361, textureX, textureY); // Box 139
		leftWingModel[27] = new ModelRendererTurbo(this, 249, 361, textureX, textureY); // Box 140
		leftWingModel[28] = new ModelRendererTurbo(this, 433, 361, textureX, textureY); // Box 148
		leftWingModel[29] = new ModelRendererTurbo(this, 457, 361, textureX, textureY); // Box 149
		leftWingModel[30] = new ModelRendererTurbo(this, 481, 361, textureX, textureY); // Box 150
		leftWingModel[31] = new ModelRendererTurbo(this, 1, 369, textureX, textureY); // Box 151
		leftWingModel[32] = new ModelRendererTurbo(this, 25, 369, textureX, textureY); // Box 152
		leftWingModel[33] = new ModelRendererTurbo(this, 33, 369, textureX, textureY); // Box 153
		leftWingModel[34] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 154
		leftWingModel[35] = new ModelRendererTurbo(this, 33, 393, textureX, textureY); // Box 190
		leftWingModel[36] = new ModelRendererTurbo(this, 73, 393, textureX, textureY); // Box 191
		leftWingModel[37] = new ModelRendererTurbo(this, 113, 393, textureX, textureY); // Box 192
		leftWingModel[38] = new ModelRendererTurbo(this, 145, 393, textureX, textureY); // Box 193
		leftWingModel[39] = new ModelRendererTurbo(this, 153, 393, textureX, textureY); // Box 194
		leftWingModel[40] = new ModelRendererTurbo(this, 217, 393, textureX, textureY); // Box 195
		leftWingModel[41] = new ModelRendererTurbo(this, 201, 393, textureX, textureY); // Box 196
		leftWingModel[42] = new ModelRendererTurbo(this, 265, 393, textureX, textureY); // Box 197
		leftWingModel[43] = new ModelRendererTurbo(this, 305, 393, textureX, textureY); // Box 198
		leftWingModel[44] = new ModelRendererTurbo(this, 345, 393, textureX, textureY); // Box 199
		leftWingModel[45] = new ModelRendererTurbo(this, 385, 393, textureX, textureY); // Box 200
		leftWingModel[46] = new ModelRendererTurbo(this, 425, 393, textureX, textureY); // Box 201
		leftWingModel[47] = new ModelRendererTurbo(this, 465, 393, textureX, textureY); // Box 202
		leftWingModel[48] = new ModelRendererTurbo(this, 41, 401, textureX, textureY); // Box 203
		leftWingModel[49] = new ModelRendererTurbo(this, 81, 401, textureX, textureY); // Box 204
		leftWingModel[50] = new ModelRendererTurbo(this, 121, 401, textureX, textureY); // Box 205
		leftWingModel[51] = new ModelRendererTurbo(this, 201, 401, textureX, textureY); // Box 206
		leftWingModel[52] = new ModelRendererTurbo(this, 265, 401, textureX, textureY); // Box 207
		leftWingModel[53] = new ModelRendererTurbo(this, 305, 401, textureX, textureY); // Box 208
		leftWingModel[54] = new ModelRendererTurbo(this, 345, 401, textureX, textureY); // Box 209
		leftWingModel[55] = new ModelRendererTurbo(this, 385, 401, textureX, textureY); // Box 210
		leftWingModel[56] = new ModelRendererTurbo(this, 425, 401, textureX, textureY); // Box 211
		leftWingModel[57] = new ModelRendererTurbo(this, 465, 401, textureX, textureY); // Box 212
		leftWingModel[58] = new ModelRendererTurbo(this, 1, 409, textureX, textureY); // Box 213
		leftWingModel[59] = new ModelRendererTurbo(this, 41, 409, textureX, textureY); // Box 214
		leftWingModel[60] = new ModelRendererTurbo(this, 81, 409, textureX, textureY); // Box 215
		leftWingModel[61] = new ModelRendererTurbo(this, 281, 409, textureX, textureY); // Box 216
		leftWingModel[62] = new ModelRendererTurbo(this, 321, 409, textureX, textureY); // Box 217
		leftWingModel[63] = new ModelRendererTurbo(this, 121, 409, textureX, textureY); // Box 218
		leftWingModel[64] = new ModelRendererTurbo(this, 361, 409, textureX, textureY); // Box 219
		leftWingModel[65] = new ModelRendererTurbo(this, 385, 409, textureX, textureY); // Box 220
		leftWingModel[66] = new ModelRendererTurbo(this, 409, 409, textureX, textureY); // Box 221
		leftWingModel[67] = new ModelRendererTurbo(this, 433, 409, textureX, textureY); // Box 222
		leftWingModel[68] = new ModelRendererTurbo(this, 441, 409, textureX, textureY); // Box 223
		leftWingModel[69] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 224
		leftWingModel[70] = new ModelRendererTurbo(this, 73, 291, textureX, textureY); // Box 301
		leftWingModel[71] = new ModelRendererTurbo(this, 217, 291, textureX, textureY); // Box 302
		leftWingModel[72] = new ModelRendererTurbo(this, 281, 291, textureX, textureY); // Box 303
		leftWingModel[73] = new ModelRendererTurbo(this, 345, 291, textureX, textureY); // Box 304

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 12, 2, 5, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 113
		leftWingModel[0].setRotationPoint(-24F, -44F, -24F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 11, 2, 5, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F); // Box 114
		leftWingModel[1].setRotationPoint(-23F, -44F, -74F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 8, 2, 5, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -0.5F, 0F); // Box 115
		leftWingModel[2].setRotationPoint(-20F, -44F, -79F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 5, 2, 5, 0F,0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -0.5F, 0F); // Box 116
		leftWingModel[3].setRotationPoint(-17F, -44F, -84F);

		leftWingModel[4].addShapeBox(0F, 0F, 0F, 11, 2, 19, 0F,1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 117
		leftWingModel[4].setRotationPoint(-23F, -44F, -19F);

		leftWingModel[5].addShapeBox(0F, 0F, 0F, 11, 2, 19, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 118
		leftWingModel[5].setRotationPoint(-12F, -44F, -19F);

		leftWingModel[6].addShapeBox(0F, 0F, 0F, 11, 2, 5, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 119
		leftWingModel[6].setRotationPoint(-12F, -44F, -24F);

		leftWingModel[7].addShapeBox(0F, 0F, 0F, 11, 2, 5, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 120
		leftWingModel[7].setRotationPoint(-12F, -44F, -29F);

		leftWingModel[8].addShapeBox(0F, 0F, 0F, 12, 2, 5, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 121
		leftWingModel[8].setRotationPoint(-24F, -44F, -29F);

		leftWingModel[9].addShapeBox(0F, 0F, 0F, 11, 2, 5, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 122
		leftWingModel[9].setRotationPoint(-12F, -44F, -34F);

		leftWingModel[10].addShapeBox(0F, 0F, 0F, 12, 2, 5, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 123
		leftWingModel[10].setRotationPoint(-24F, -44F, -34F);

		leftWingModel[11].addShapeBox(0F, 0F, 0F, 11, 2, 5, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 124
		leftWingModel[11].setRotationPoint(-12F, -44F, -39F);

		leftWingModel[12].addShapeBox(0F, 0F, 0F, 12, 2, 5, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 125
		leftWingModel[12].setRotationPoint(-24F, -44F, -39F);

		leftWingModel[13].addShapeBox(0F, 0F, 0F, 11, 2, 5, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 126
		leftWingModel[13].setRotationPoint(-12F, -44F, -44F);

		leftWingModel[14].addShapeBox(0F, 0F, 0F, 12, 2, 5, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 127
		leftWingModel[14].setRotationPoint(-24F, -44F, -44F);

		leftWingModel[15].addShapeBox(0F, 0F, 0F, 11, 2, 5, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 128
		leftWingModel[15].setRotationPoint(-12F, -44F, -59F);

		leftWingModel[16].addShapeBox(0F, 0F, 0F, 12, 2, 5, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 129
		leftWingModel[16].setRotationPoint(-24F, -44F, -59F);

		leftWingModel[17].addShapeBox(0F, 0F, 0F, 11, 2, 5, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 130
		leftWingModel[17].setRotationPoint(-12F, -44F, -54F);

		leftWingModel[18].addShapeBox(0F, 0F, 0F, 11, 2, 5, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 131
		leftWingModel[18].setRotationPoint(-12F, -44F, -49F);

		leftWingModel[19].addShapeBox(0F, 0F, 0F, 12, 2, 5, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 132
		leftWingModel[19].setRotationPoint(-24F, -44F, -54F);

		leftWingModel[20].addShapeBox(0F, 0F, 0F, 12, 2, 5, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 133
		leftWingModel[20].setRotationPoint(-24F, -44F, -49F);

		leftWingModel[21].addShapeBox(0F, 0F, 0F, 11, 2, 5, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 134
		leftWingModel[21].setRotationPoint(-12F, -44F, -64F);

		leftWingModel[22].addShapeBox(0F, 0F, 0F, 12, 2, 5, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 135
		leftWingModel[22].setRotationPoint(-24F, -44F, -64F);

		leftWingModel[23].addShapeBox(0F, 0F, 0F, 11, 2, 5, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 136
		leftWingModel[23].setRotationPoint(-12F, -44F, -69F);

		leftWingModel[24].addShapeBox(0F, 0F, 0F, 12, 2, 5, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 137
		leftWingModel[24].setRotationPoint(-24F, -44F, -69F);

		leftWingModel[25].addShapeBox(0F, 0F, 0F, 11, 2, 5, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 138
		leftWingModel[25].setRotationPoint(-12F, -44F, -74F);

		leftWingModel[26].addShapeBox(0F, 0F, 0F, 11, 2, 5, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 139
		leftWingModel[26].setRotationPoint(-12F, -44F, -79F);

		leftWingModel[27].addShapeBox(0F, 0F, 0F, 11, 2, 5, 0F,0F, 0F, 0F, -5F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 140
		leftWingModel[27].setRotationPoint(-12F, -44F, -84F);

		leftWingModel[28].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 148
		leftWingModel[28].setRotationPoint(-1F, -43.5F, -44F);

		leftWingModel[29].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 149
		leftWingModel[29].setRotationPoint(-1F, -43.5F, -39F);

		leftWingModel[30].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 150
		leftWingModel[30].setRotationPoint(-1F, -43.5F, -34F);

		leftWingModel[31].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 151
		leftWingModel[31].setRotationPoint(-1F, -43.5F, -29F);

		leftWingModel[32].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 152
		leftWingModel[32].setRotationPoint(-1F, -43.5F, -24F);

		leftWingModel[33].addShapeBox(0F, 0F, 0F, 5, 1, 14, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, -4F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -4F, -0.5F, 0F, 0F, 0F, 0F); // Box 153
		leftWingModel[33].setRotationPoint(-1F, -43.5F, -19F);

		leftWingModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 154
		leftWingModel[34].setRotationPoint(-1F, -43.5F, -5F);

		leftWingModel[35].addShapeBox(0F, 0F, 0F, 12, 2, 5, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 190
		leftWingModel[35].setRotationPoint(-10F, -15F, -24F);

		leftWingModel[36].addShapeBox(0F, 0F, 0F, 11, 2, 5, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F); // Box 191
		leftWingModel[36].setRotationPoint(-9F, -15F, -74F);

		leftWingModel[37].addShapeBox(0F, 0F, 0F, 8, 2, 5, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -0.5F, 0F); // Box 192
		leftWingModel[37].setRotationPoint(-6F, -15F, -79F);

		leftWingModel[38].addShapeBox(0F, 0F, 0F, 5, 2, 5, 0F,0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -0.5F, 0F); // Box 193
		leftWingModel[38].setRotationPoint(-3F, -15F, -84F);

		leftWingModel[39].addShapeBox(0F, 0F, 0F, 11, 2, 19, 0F,1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 194
		leftWingModel[39].setRotationPoint(-9F, -15F, -19F);

		leftWingModel[40].addShapeBox(0F, 0F, 0F, 11, 2, 19, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 195
		leftWingModel[40].setRotationPoint(2F, -15F, -19F);

		leftWingModel[41].addShapeBox(0F, 0F, 0F, 11, 2, 5, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 196
		leftWingModel[41].setRotationPoint(2F, -15F, -24F);

		leftWingModel[42].addShapeBox(0F, 0F, 0F, 11, 2, 5, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 197
		leftWingModel[42].setRotationPoint(2F, -15F, -29F);

		leftWingModel[43].addShapeBox(0F, 0F, 0F, 12, 2, 5, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 198
		leftWingModel[43].setRotationPoint(-10F, -15F, -29F);

		leftWingModel[44].addShapeBox(0F, 0F, 0F, 11, 2, 5, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 199
		leftWingModel[44].setRotationPoint(2F, -15F, -34F);

		leftWingModel[45].addShapeBox(0F, 0F, 0F, 12, 2, 5, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 200
		leftWingModel[45].setRotationPoint(-10F, -15F, -34F);

		leftWingModel[46].addShapeBox(0F, 0F, 0F, 11, 2, 5, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 201
		leftWingModel[46].setRotationPoint(2F, -15F, -39F);

		leftWingModel[47].addShapeBox(0F, 0F, 0F, 12, 2, 5, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 202
		leftWingModel[47].setRotationPoint(-10F, -15F, -39F);

		leftWingModel[48].addShapeBox(0F, 0F, 0F, 11, 2, 5, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 203
		leftWingModel[48].setRotationPoint(2F, -15F, -44F);

		leftWingModel[49].addShapeBox(0F, 0F, 0F, 12, 2, 5, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 204
		leftWingModel[49].setRotationPoint(-10F, -15F, -44F);

		leftWingModel[50].addShapeBox(0F, 0F, 0F, 11, 2, 5, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 205
		leftWingModel[50].setRotationPoint(2F, -15F, -59F);

		leftWingModel[51].addShapeBox(0F, 0F, 0F, 12, 2, 5, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 206
		leftWingModel[51].setRotationPoint(-10F, -15F, -59F);

		leftWingModel[52].addShapeBox(0F, 0F, 0F, 11, 2, 5, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 207
		leftWingModel[52].setRotationPoint(2F, -15F, -54F);

		leftWingModel[53].addShapeBox(0F, 0F, 0F, 11, 2, 5, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 208
		leftWingModel[53].setRotationPoint(2F, -15F, -49F);

		leftWingModel[54].addShapeBox(0F, 0F, 0F, 12, 2, 5, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 209
		leftWingModel[54].setRotationPoint(-10F, -15F, -54F);

		leftWingModel[55].addShapeBox(0F, 0F, 0F, 12, 2, 5, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 210
		leftWingModel[55].setRotationPoint(-10F, -15F, -49F);

		leftWingModel[56].addShapeBox(0F, 0F, 0F, 11, 2, 5, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 211
		leftWingModel[56].setRotationPoint(2F, -15F, -64F);

		leftWingModel[57].addShapeBox(0F, 0F, 0F, 12, 2, 5, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 212
		leftWingModel[57].setRotationPoint(-10F, -15F, -64F);

		leftWingModel[58].addShapeBox(0F, 0F, 0F, 11, 2, 5, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 213
		leftWingModel[58].setRotationPoint(2F, -15F, -69F);

		leftWingModel[59].addShapeBox(0F, 0F, 0F, 12, 2, 5, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 214
		leftWingModel[59].setRotationPoint(-10F, -15F, -69F);

		leftWingModel[60].addShapeBox(0F, 0F, 0F, 11, 2, 5, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 215
		leftWingModel[60].setRotationPoint(2F, -15F, -74F);

		leftWingModel[61].addShapeBox(0F, 0F, 0F, 11, 2, 5, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 216
		leftWingModel[61].setRotationPoint(2F, -15F, -79F);

		leftWingModel[62].addShapeBox(0F, 0F, 0F, 11, 2, 5, 0F,0F, 0F, 0F, -5F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 217
		leftWingModel[62].setRotationPoint(2F, -15F, -84F);

		leftWingModel[63].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 218
		leftWingModel[63].setRotationPoint(13F, -14.5F, -44F);

		leftWingModel[64].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 219
		leftWingModel[64].setRotationPoint(13F, -14.5F, -39F);

		leftWingModel[65].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 220
		leftWingModel[65].setRotationPoint(13F, -14.5F, -34F);

		leftWingModel[66].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 221
		leftWingModel[66].setRotationPoint(13F, -14.5F, -29F);

		leftWingModel[67].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 222
		leftWingModel[67].setRotationPoint(13F, -14.5F, -24F);

		leftWingModel[68].addShapeBox(0F, 0F, 0F, 5, 1, 14, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, -4F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -4F, -0.5F, 0F, 0F, 0F, 0F); // Box 223
		leftWingModel[68].setRotationPoint(13F, -14.5F, -19F);

		leftWingModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 224
		leftWingModel[69].setRotationPoint(13F, -14.5F, -5F);

		leftWingModel[70].addShapeBox(0F, 0F, 0F, 20, 0, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
		leftWingModel[70].setRotationPoint(-21F, -44F, -71F);

		leftWingModel[71].addShapeBox(0F, 0F, 0F, 20, 0, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 302
		leftWingModel[71].setRotationPoint(-6F, -13F, -71F);

		leftWingModel[72].addShapeBox(0F, 0F, 0F, 20, 0, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 303
		leftWingModel[72].setRotationPoint(-21F, -44F, 51F);

		leftWingModel[73].addShapeBox(0F, 0F, 0F, 20, 0, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 304
		leftWingModel[73].setRotationPoint(-6F, -13F, 51F);
	}

	private void initrightWingModel_1()
	{
		rightWingModel[0] = new ModelRendererTurbo(this, 1, 321, textureX, textureY); // Box 70
		rightWingModel[1] = new ModelRendererTurbo(this, 41, 321, textureX, textureY); // Box 72
		rightWingModel[2] = new ModelRendererTurbo(this, 81, 321, textureX, textureY); // Box 73
		rightWingModel[3] = new ModelRendererTurbo(this, 113, 321, textureX, textureY); // Box 74
		rightWingModel[4] = new ModelRendererTurbo(this, 121, 321, textureX, textureY); // Box 75
		rightWingModel[5] = new ModelRendererTurbo(this, 185, 321, textureX, textureY); // Box 76
		rightWingModel[6] = new ModelRendererTurbo(this, 169, 321, textureX, textureY); // Box 77
		rightWingModel[7] = new ModelRendererTurbo(this, 233, 321, textureX, textureY); // Box 78
		rightWingModel[8] = new ModelRendererTurbo(this, 273, 321, textureX, textureY); // Box 79
		rightWingModel[9] = new ModelRendererTurbo(this, 313, 321, textureX, textureY); // Box 80
		rightWingModel[10] = new ModelRendererTurbo(this, 353, 321, textureX, textureY); // Box 81
		rightWingModel[11] = new ModelRendererTurbo(this, 393, 321, textureX, textureY); // Box 82
		rightWingModel[12] = new ModelRendererTurbo(this, 433, 321, textureX, textureY); // Box 83
		rightWingModel[13] = new ModelRendererTurbo(this, 473, 321, textureX, textureY); // Box 84
		rightWingModel[14] = new ModelRendererTurbo(this, 1, 329, textureX, textureY); // Box 85
		rightWingModel[15] = new ModelRendererTurbo(this, 41, 329, textureX, textureY); // Box 86
		rightWingModel[16] = new ModelRendererTurbo(this, 81, 329, textureX, textureY); // Box 87
		rightWingModel[17] = new ModelRendererTurbo(this, 169, 329, textureX, textureY); // Box 88
		rightWingModel[18] = new ModelRendererTurbo(this, 233, 329, textureX, textureY); // Box 89
		rightWingModel[19] = new ModelRendererTurbo(this, 273, 329, textureX, textureY); // Box 90
		rightWingModel[20] = new ModelRendererTurbo(this, 313, 329, textureX, textureY); // Box 91
		rightWingModel[21] = new ModelRendererTurbo(this, 353, 329, textureX, textureY); // Box 92
		rightWingModel[22] = new ModelRendererTurbo(this, 393, 329, textureX, textureY); // Box 93
		rightWingModel[23] = new ModelRendererTurbo(this, 433, 329, textureX, textureY); // Box 94
		rightWingModel[24] = new ModelRendererTurbo(this, 473, 329, textureX, textureY); // Box 95
		rightWingModel[25] = new ModelRendererTurbo(this, 1, 337, textureX, textureY); // Box 96
		rightWingModel[26] = new ModelRendererTurbo(this, 41, 337, textureX, textureY); // Box 97
		rightWingModel[27] = new ModelRendererTurbo(this, 81, 337, textureX, textureY); // Box 98
		rightWingModel[28] = new ModelRendererTurbo(this, 369, 337, textureX, textureY); // Box 106
		rightWingModel[29] = new ModelRendererTurbo(this, 393, 337, textureX, textureY); // Box 107
		rightWingModel[30] = new ModelRendererTurbo(this, 417, 337, textureX, textureY); // Box 108
		rightWingModel[31] = new ModelRendererTurbo(this, 441, 337, textureX, textureY); // Box 109
		rightWingModel[32] = new ModelRendererTurbo(this, 465, 337, textureX, textureY); // Box 110
		rightWingModel[33] = new ModelRendererTurbo(this, 473, 337, textureX, textureY); // Box 111
		rightWingModel[34] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 112
		rightWingModel[35] = new ModelRendererTurbo(this, 65, 369, textureX, textureY); // Box 155
		rightWingModel[36] = new ModelRendererTurbo(this, 105, 369, textureX, textureY); // Box 156
		rightWingModel[37] = new ModelRendererTurbo(this, 145, 369, textureX, textureY); // Box 157
		rightWingModel[38] = new ModelRendererTurbo(this, 177, 369, textureX, textureY); // Box 158
		rightWingModel[39] = new ModelRendererTurbo(this, 185, 369, textureX, textureY); // Box 159
		rightWingModel[40] = new ModelRendererTurbo(this, 249, 369, textureX, textureY); // Box 160
		rightWingModel[41] = new ModelRendererTurbo(this, 233, 369, textureX, textureY); // Box 161
		rightWingModel[42] = new ModelRendererTurbo(this, 297, 369, textureX, textureY); // Box 162
		rightWingModel[43] = new ModelRendererTurbo(this, 337, 369, textureX, textureY); // Box 163
		rightWingModel[44] = new ModelRendererTurbo(this, 377, 369, textureX, textureY); // Box 164
		rightWingModel[45] = new ModelRendererTurbo(this, 417, 369, textureX, textureY); // Box 165
		rightWingModel[46] = new ModelRendererTurbo(this, 457, 369, textureX, textureY); // Box 166
		rightWingModel[47] = new ModelRendererTurbo(this, 73, 377, textureX, textureY); // Box 167
		rightWingModel[48] = new ModelRendererTurbo(this, 113, 377, textureX, textureY); // Box 168
		rightWingModel[49] = new ModelRendererTurbo(this, 153, 377, textureX, textureY); // Box 169
		rightWingModel[50] = new ModelRendererTurbo(this, 233, 377, textureX, textureY); // Box 170
		rightWingModel[51] = new ModelRendererTurbo(this, 297, 377, textureX, textureY); // Box 171
		rightWingModel[52] = new ModelRendererTurbo(this, 337, 377, textureX, textureY); // Box 172
		rightWingModel[53] = new ModelRendererTurbo(this, 377, 377, textureX, textureY); // Box 173
		rightWingModel[54] = new ModelRendererTurbo(this, 417, 377, textureX, textureY); // Box 174
		rightWingModel[55] = new ModelRendererTurbo(this, 457, 377, textureX, textureY); // Box 175
		rightWingModel[56] = new ModelRendererTurbo(this, 1, 385, textureX, textureY); // Box 176
		rightWingModel[57] = new ModelRendererTurbo(this, 41, 385, textureX, textureY); // Box 177
		rightWingModel[58] = new ModelRendererTurbo(this, 81, 385, textureX, textureY); // Box 178
		rightWingModel[59] = new ModelRendererTurbo(this, 121, 385, textureX, textureY); // Box 179
		rightWingModel[60] = new ModelRendererTurbo(this, 313, 385, textureX, textureY); // Box 180
		rightWingModel[61] = new ModelRendererTurbo(this, 353, 385, textureX, textureY); // Box 181
		rightWingModel[62] = new ModelRendererTurbo(this, 393, 385, textureX, textureY); // Box 182
		rightWingModel[63] = new ModelRendererTurbo(this, 1, 377, textureX, textureY); // Box 183
		rightWingModel[64] = new ModelRendererTurbo(this, 161, 385, textureX, textureY); // Box 184
		rightWingModel[65] = new ModelRendererTurbo(this, 433, 385, textureX, textureY); // Box 185
		rightWingModel[66] = new ModelRendererTurbo(this, 457, 385, textureX, textureY); // Box 186
		rightWingModel[67] = new ModelRendererTurbo(this, 481, 385, textureX, textureY); // Box 187
		rightWingModel[68] = new ModelRendererTurbo(this, 1, 393, textureX, textureY); // Box 188
		rightWingModel[69] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 189
		rightWingModel[70] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Box 240
		rightWingModel[71] = new ModelRendererTurbo(this, 505, 137, textureX, textureY); // Box 241
		rightWingModel[72] = new ModelRendererTurbo(this, 505, 169, textureX, textureY); // Box 242
		rightWingModel[73] = new ModelRendererTurbo(this, 497, 177, textureX, textureY); // Box 243
		rightWingModel[74] = new ModelRendererTurbo(this, 465, 185, textureX, textureY); // Box 244
		rightWingModel[75] = new ModelRendererTurbo(this, 473, 185, textureX, textureY); // Box 245
		rightWingModel[76] = new ModelRendererTurbo(this, 481, 185, textureX, textureY); // Box 247
		rightWingModel[77] = new ModelRendererTurbo(this, 489, 185, textureX, textureY); // Box 248
		rightWingModel[78] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 249
		rightWingModel[79] = new ModelRendererTurbo(this, 9, 193, textureX, textureY); // Box 250
		rightWingModel[80] = new ModelRendererTurbo(this, 17, 193, textureX, textureY); // Box 251
		rightWingModel[81] = new ModelRendererTurbo(this, 25, 193, textureX, textureY); // Box 252
		rightWingModel[82] = new ModelRendererTurbo(this, 305, 417, textureX, textureY); // Box 171
		rightWingModel[83] = new ModelRendererTurbo(this, 345, 417, textureX, textureY); // Box 177
		rightWingModel[84] = new ModelRendererTurbo(this, 369, 417, textureX, textureY); // Box 178
		rightWingModel[85] = new ModelRendererTurbo(this, 393, 417, textureX, textureY); // Box 179
		rightWingModel[86] = new ModelRendererTurbo(this, 417, 417, textureX, textureY); // Box 180
		rightWingModel[87] = new ModelRendererTurbo(this, 1, 431, textureX, textureY); // Box 310
		rightWingModel[88] = new ModelRendererTurbo(this, 41, 431, textureX, textureY); // Box 311
		rightWingModel[89] = new ModelRendererTurbo(this, 65, 431, textureX, textureY); // Box 312
		rightWingModel[90] = new ModelRendererTurbo(this, 89, 431, textureX, textureY); // Box 313
		rightWingModel[91] = new ModelRendererTurbo(this, 113, 431, textureX, textureY); // Box 314

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 12, 2, 5, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 70
		rightWingModel[0].setRotationPoint(-24F, -44F, 19F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 11, 2, 5, 0F,1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 72
		rightWingModel[1].setRotationPoint(-23F, -44F, 69F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 8, 2, 5, 0F,3F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 3F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 73
		rightWingModel[2].setRotationPoint(-20F, -44F, 74F);

		rightWingModel[3].addShapeBox(0F, 0F, 0F, 5, 2, 5, 0F,3F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 3F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F); // Box 74
		rightWingModel[3].setRotationPoint(-17F, -44F, 79F);

		rightWingModel[4].addShapeBox(0F, 0F, 0F, 11, 2, 19, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F); // Box 75
		rightWingModel[4].setRotationPoint(-23F, -44F, 0F);

		rightWingModel[5].addShapeBox(0F, 0F, 0F, 11, 2, 19, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 76
		rightWingModel[5].setRotationPoint(-12F, -44F, 0F);

		rightWingModel[6].addShapeBox(0F, 0F, 0F, 11, 2, 5, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 77
		rightWingModel[6].setRotationPoint(-12F, -44F, 19F);

		rightWingModel[7].addShapeBox(0F, 0F, 0F, 11, 2, 5, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 78
		rightWingModel[7].setRotationPoint(-12F, -44F, 24F);

		rightWingModel[8].addShapeBox(0F, 0F, 0F, 12, 2, 5, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 79
		rightWingModel[8].setRotationPoint(-24F, -44F, 24F);

		rightWingModel[9].addShapeBox(0F, 0F, 0F, 11, 2, 5, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 80
		rightWingModel[9].setRotationPoint(-12F, -44F, 29F);

		rightWingModel[10].addShapeBox(0F, 0F, 0F, 12, 2, 5, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 81
		rightWingModel[10].setRotationPoint(-24F, -44F, 29F);

		rightWingModel[11].addShapeBox(0F, 0F, 0F, 11, 2, 5, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 82
		rightWingModel[11].setRotationPoint(-12F, -44F, 34F);

		rightWingModel[12].addShapeBox(0F, 0F, 0F, 12, 2, 5, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 83
		rightWingModel[12].setRotationPoint(-24F, -44F, 34F);

		rightWingModel[13].addShapeBox(0F, 0F, 0F, 11, 2, 5, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 84
		rightWingModel[13].setRotationPoint(-12F, -44F, 39F);

		rightWingModel[14].addShapeBox(0F, 0F, 0F, 12, 2, 5, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 85
		rightWingModel[14].setRotationPoint(-24F, -44F, 39F);

		rightWingModel[15].addShapeBox(0F, 0F, 0F, 11, 2, 5, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 86
		rightWingModel[15].setRotationPoint(-12F, -44F, 54F);

		rightWingModel[16].addShapeBox(0F, 0F, 0F, 12, 2, 5, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 87
		rightWingModel[16].setRotationPoint(-24F, -44F, 54F);

		rightWingModel[17].addShapeBox(0F, 0F, 0F, 11, 2, 5, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 88
		rightWingModel[17].setRotationPoint(-12F, -44F, 49F);

		rightWingModel[18].addShapeBox(0F, 0F, 0F, 11, 2, 5, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 89
		rightWingModel[18].setRotationPoint(-12F, -44F, 44F);

		rightWingModel[19].addShapeBox(0F, 0F, 0F, 12, 2, 5, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 90
		rightWingModel[19].setRotationPoint(-24F, -44F, 49F);

		rightWingModel[20].addShapeBox(0F, 0F, 0F, 12, 2, 5, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 91
		rightWingModel[20].setRotationPoint(-24F, -44F, 44F);

		rightWingModel[21].addShapeBox(0F, 0F, 0F, 11, 2, 5, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 92
		rightWingModel[21].setRotationPoint(-12F, -44F, 59F);

		rightWingModel[22].addShapeBox(0F, 0F, 0F, 12, 2, 5, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 93
		rightWingModel[22].setRotationPoint(-24F, -44F, 59F);

		rightWingModel[23].addShapeBox(0F, 0F, 0F, 11, 2, 5, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 94
		rightWingModel[23].setRotationPoint(-12F, -44F, 64F);

		rightWingModel[24].addShapeBox(0F, 0F, 0F, 12, 2, 5, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 95
		rightWingModel[24].setRotationPoint(-24F, -44F, 64F);

		rightWingModel[25].addShapeBox(0F, 0F, 0F, 11, 2, 5, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 96
		rightWingModel[25].setRotationPoint(-12F, -44F, 69F);

		rightWingModel[26].addShapeBox(0F, 0F, 0F, 11, 2, 5, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 97
		rightWingModel[26].setRotationPoint(-12F, -44F, 74F);

		rightWingModel[27].addShapeBox(0F, 0F, 0F, 11, 2, 5, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, -5F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -5F, -0.5F, -1F, 0F, 0F, 0F); // Box 98
		rightWingModel[27].setRotationPoint(-12F, -44F, 79F);

		rightWingModel[28].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 106
		rightWingModel[28].setRotationPoint(-1F, -43.5F, 39F);

		rightWingModel[29].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 107
		rightWingModel[29].setRotationPoint(-1F, -43.5F, 34F);

		rightWingModel[30].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 108
		rightWingModel[30].setRotationPoint(-1F, -43.5F, 29F);

		rightWingModel[31].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 109
		rightWingModel[31].setRotationPoint(-1F, -43.5F, 24F);

		rightWingModel[32].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 110
		rightWingModel[32].setRotationPoint(-1F, -43.5F, 19F);

		rightWingModel[33].addShapeBox(0F, 0F, 0F, 5, 1, 14, 0F,0F, 0F, 0F, -4F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 111
		rightWingModel[33].setRotationPoint(-1F, -43.5F, 5F);

		rightWingModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 112
		rightWingModel[34].setRotationPoint(-1F, -43.5F, 0F);

		rightWingModel[35].addShapeBox(0F, 0F, 0F, 12, 2, 5, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 155
		rightWingModel[35].setRotationPoint(-10F, -15F, 19F);

		rightWingModel[36].addShapeBox(0F, 0F, 0F, 11, 2, 5, 0F,1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 156
		rightWingModel[36].setRotationPoint(-9F, -15F, 69F);

		rightWingModel[37].addShapeBox(0F, 0F, 0F, 8, 2, 5, 0F,3F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 3F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 157
		rightWingModel[37].setRotationPoint(-6F, -15F, 74F);

		rightWingModel[38].addShapeBox(0F, 0F, 0F, 5, 2, 5, 0F,3F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 3F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F); // Box 158
		rightWingModel[38].setRotationPoint(-3F, -15F, 79F);

		rightWingModel[39].addShapeBox(0F, 0F, 0F, 11, 2, 19, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F); // Box 159
		rightWingModel[39].setRotationPoint(-9F, -15F, 0F);

		rightWingModel[40].addShapeBox(0F, 0F, 0F, 11, 2, 19, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 160
		rightWingModel[40].setRotationPoint(2F, -15F, 0F);

		rightWingModel[41].addShapeBox(0F, 0F, 0F, 11, 2, 5, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 161
		rightWingModel[41].setRotationPoint(2F, -15F, 19F);

		rightWingModel[42].addShapeBox(0F, 0F, 0F, 11, 2, 5, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 162
		rightWingModel[42].setRotationPoint(2F, -15F, 24F);

		rightWingModel[43].addShapeBox(0F, 0F, 0F, 12, 2, 5, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 163
		rightWingModel[43].setRotationPoint(-10F, -15F, 24F);

		rightWingModel[44].addShapeBox(0F, 0F, 0F, 11, 2, 5, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 164
		rightWingModel[44].setRotationPoint(2F, -15F, 29F);

		rightWingModel[45].addShapeBox(0F, 0F, 0F, 12, 2, 5, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 165
		rightWingModel[45].setRotationPoint(-10F, -15F, 29F);

		rightWingModel[46].addShapeBox(0F, 0F, 0F, 11, 2, 5, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 166
		rightWingModel[46].setRotationPoint(2F, -15F, 34F);

		rightWingModel[47].addShapeBox(0F, 0F, 0F, 12, 2, 5, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 167
		rightWingModel[47].setRotationPoint(-10F, -15F, 34F);

		rightWingModel[48].addShapeBox(0F, 0F, 0F, 11, 2, 5, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 168
		rightWingModel[48].setRotationPoint(2F, -15F, 39F);

		rightWingModel[49].addShapeBox(0F, 0F, 0F, 12, 2, 5, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 169
		rightWingModel[49].setRotationPoint(-10F, -15F, 39F);

		rightWingModel[50].addShapeBox(0F, 0F, 0F, 11, 2, 5, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 170
		rightWingModel[50].setRotationPoint(2F, -15F, 54F);

		rightWingModel[51].addShapeBox(0F, 0F, 0F, 12, 2, 5, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 171
		rightWingModel[51].setRotationPoint(-10F, -15F, 54F);

		rightWingModel[52].addShapeBox(0F, 0F, 0F, 11, 2, 5, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 172
		rightWingModel[52].setRotationPoint(2F, -15F, 49F);

		rightWingModel[53].addShapeBox(0F, 0F, 0F, 11, 2, 5, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 173
		rightWingModel[53].setRotationPoint(2F, -15F, 44F);

		rightWingModel[54].addShapeBox(0F, 0F, 0F, 12, 2, 5, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 174
		rightWingModel[54].setRotationPoint(-10F, -15F, 49F);

		rightWingModel[55].addShapeBox(0F, 0F, 0F, 12, 2, 5, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 175
		rightWingModel[55].setRotationPoint(-10F, -15F, 44F);

		rightWingModel[56].addShapeBox(0F, 0F, 0F, 11, 2, 5, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 176
		rightWingModel[56].setRotationPoint(2F, -15F, 59F);

		rightWingModel[57].addShapeBox(0F, 0F, 0F, 12, 2, 5, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 177
		rightWingModel[57].setRotationPoint(-10F, -15F, 59F);

		rightWingModel[58].addShapeBox(0F, 0F, 0F, 11, 2, 5, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 178
		rightWingModel[58].setRotationPoint(2F, -15F, 64F);

		rightWingModel[59].addShapeBox(0F, 0F, 0F, 12, 2, 5, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 179
		rightWingModel[59].setRotationPoint(-10F, -15F, 64F);

		rightWingModel[60].addShapeBox(0F, 0F, 0F, 11, 2, 5, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 180
		rightWingModel[60].setRotationPoint(2F, -15F, 69F);

		rightWingModel[61].addShapeBox(0F, 0F, 0F, 11, 2, 5, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 181
		rightWingModel[61].setRotationPoint(2F, -15F, 74F);

		rightWingModel[62].addShapeBox(0F, 0F, 0F, 11, 2, 5, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, -5F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -5F, -0.5F, -1F, 0F, 0F, 0F); // Box 182
		rightWingModel[62].setRotationPoint(2F, -15F, 79F);

		rightWingModel[63].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 183
		rightWingModel[63].setRotationPoint(13F, -14.5F, 39F);

		rightWingModel[64].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 184
		rightWingModel[64].setRotationPoint(13F, -14.5F, 34F);

		rightWingModel[65].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 185
		rightWingModel[65].setRotationPoint(13F, -14.5F, 29F);

		rightWingModel[66].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 186
		rightWingModel[66].setRotationPoint(13F, -14.5F, 24F);

		rightWingModel[67].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 187
		rightWingModel[67].setRotationPoint(13F, -14.5F, 19F);

		rightWingModel[68].addShapeBox(0F, 0F, 0F, 5, 1, 14, 0F,0F, 0F, 0F, -4F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 188
		rightWingModel[68].setRotationPoint(13F, -14.5F, 5F);

		rightWingModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 189
		rightWingModel[69].setRotationPoint(13F, -14.5F, 0F);

		rightWingModel[70].addShapeBox(0F, 0F, 0F, 1, 29, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, 13F, 0F, 0F, 13F, 0F, 0F, -13F, 0F, 0F); // Box 240
		rightWingModel[70].setRotationPoint(-20F, -43F, -59.5F);

		rightWingModel[71].addShapeBox(0F, 0F, 0F, 1, 29, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, 13F, 0F, 0F, 13F, 0F, 0F, -13F, 0F, 0F); // Box 241
		rightWingModel[71].setRotationPoint(-6F, -43F, -59.5F);

		rightWingModel[72].addShapeBox(0F, 0F, 0F, 1, 29, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, 13F, 0F, 0F, 13F, 0F, 0F, -13F, 0F, 0F); // Box 242
		rightWingModel[72].setRotationPoint(-20F, -43F, 58.5F);

		rightWingModel[73].addShapeBox(0F, 0F, 0F, 1, 29, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, 13F, 0F, 0F, 13F, 0F, 0F, -13F, 0F, 0F); // Box 243
		rightWingModel[73].setRotationPoint(-6F, -43F, 58.5F);

		rightWingModel[74].addShapeBox(0F, 0F, 0F, 1, 29, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 18F, 13F, 0F, 18F, 13F, 0F, -17F, -13F, 0F, -17F); // Box 244
		rightWingModel[74].setRotationPoint(-20F, -43F, 18.5F);

		rightWingModel[75].addShapeBox(0F, 0F, 0F, 1, 29, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, 13F, 0F, 0F, 13F, 0F, 0F, -13F, 0F, 0F); // Box 245
		rightWingModel[75].setRotationPoint(-6F, -43F, 18.5F);

		rightWingModel[76].addShapeBox(0F, 0F, 0F, 1, 29, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 18F, 13F, 0F, 18F, 13F, 0F, -17F, -13F, 0F, -17F); // Box 247
		rightWingModel[76].setRotationPoint(-6F, -43F, 18.5F);

		rightWingModel[77].addShapeBox(0F, 0F, 0F, 1, 29, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, 13F, 0F, 0F, 13F, 0F, 0F, -13F, 0F, 0F); // Box 248
		rightWingModel[77].setRotationPoint(-20F, -43F, 18.5F);

		rightWingModel[78].addShapeBox(0F, 0F, 0F, 1, 29, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, -17F, 13F, 0F, -17F, 13F, 0F, 18F, -13F, 0F, 18F); // Box 249
		rightWingModel[78].setRotationPoint(-20F, -43F, -19.5F);

		rightWingModel[79].addShapeBox(0F, 0F, 0F, 1, 29, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, 13F, 0F, 0F, 13F, 0F, 0F, -13F, 0F, 0F); // Box 250
		rightWingModel[79].setRotationPoint(-6F, -43F, -19.5F);

		rightWingModel[80].addShapeBox(0F, 0F, 0F, 1, 29, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, -17F, 13F, 0F, -17F, 13F, 0F, 18F, -13F, 0F, 18F); // Box 251
		rightWingModel[80].setRotationPoint(-6F, -43F, -19.5F);

		rightWingModel[81].addShapeBox(0F, 0F, 0F, 1, 29, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, 13F, 0F, 0F, 13F, 0F, 0F, -13F, 0F, 0F); // Box 252
		rightWingModel[81].setRotationPoint(-20F, -43F, -19.5F);

		rightWingModel[82].addShapeBox(0F, 0F, 0F, 17, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		rightWingModel[82].setRotationPoint(-19F, -13.5F, 28.5F);

		rightWingModel[83].addShapeBox(0F, 0F, 0F, 8, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 177
		rightWingModel[83].setRotationPoint(-10F, -13.5F, 26F);

		rightWingModel[84].addShapeBox(0F, 0F, 0F, 8, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 178
		rightWingModel[84].setRotationPoint(-2F, -13.5F, 26F);

		rightWingModel[85].addShapeBox(0F, 0F, 0F, 8, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 179
		rightWingModel[85].setRotationPoint(-2F, -13.5F, 29F);

		rightWingModel[86].addShapeBox(0F, 0F, 0F, 8, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 180
		rightWingModel[86].setRotationPoint(-10F, -13.5F, 29F);

		rightWingModel[87].addShapeBox(0F, 0F, 0F, 17, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 310
		rightWingModel[87].setRotationPoint(-19F, -13.5F, -29.5F);

		rightWingModel[88].addShapeBox(0F, 0F, 0F, 8, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 311
		rightWingModel[88].setRotationPoint(-10F, -13.5F, -29F);

		rightWingModel[89].addShapeBox(0F, 0F, 0F, 8, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 312
		rightWingModel[89].setRotationPoint(-2F, -13.5F, -29F);

		rightWingModel[90].addShapeBox(0F, 0F, 0F, 8, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 313
		rightWingModel[90].setRotationPoint(-2F, -13.5F, -32F);

		rightWingModel[91].addShapeBox(0F, 0F, 0F, 8, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 314
		rightWingModel[91].setRotationPoint(-10F, -13.5F, -32F);
	}

	private void inityawFlapModel_1()
	{
		yawFlapModel[0] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 34
		yawFlapModel[1] = new ModelRendererTurbo(this, 345, 41, textureX, textureY); // Box 35
		yawFlapModel[2] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // Box 36
		yawFlapModel[3] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // Box 37
		yawFlapModel[4] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 38
		yawFlapModel[5] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 39
		yawFlapModel[6] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Box 40

		yawFlapModel[0].addShapeBox(0F, 0F, -0.5F, 9, 3, 2, 0F,0F, 0F, 0F, -3F, -1F, -1F, -3F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 34
		yawFlapModel[0].setRotationPoint(82F, -48F, -0.5F);

		yawFlapModel[1].addShapeBox(0F, 0F, -0.5F, 9, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 3.5F, 0F, -1F, 3.5F, 0F, -1F, 0F, 0F, 0F); // Box 35
		yawFlapModel[1].setRotationPoint(82F, -45F, -0.5F);

		yawFlapModel[2].addShapeBox(0F, 5F, -0.5F, 12, 4, 2, 0F,0F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -1F, 2F, 0F, -1F, 0F, 0F, 0F); // Box 36
		yawFlapModel[2].setRotationPoint(82F, -45F, -0.5F);

		yawFlapModel[3].addShapeBox(0F, 9F, -0.5F, 14, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0F, 0F, 0F); // Box 37
		yawFlapModel[3].setRotationPoint(82F, -45F, -0.5F);

		yawFlapModel[4].addShapeBox(0F, 13F, -0.5F, 14, 4, 2, 0F,0F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0F, 0F, 0F); // Box 38
		yawFlapModel[4].setRotationPoint(82F, -45F, -0.5F);

		yawFlapModel[5].addShapeBox(0F, 17F, -0.5F, 14, 4, 2, 0F,0F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1F, -1.5F, 0F, -1F, 0F, 0F, 0F); // Box 39
		yawFlapModel[5].setRotationPoint(82F, -45F, -0.5F);

		yawFlapModel[6].addShapeBox(0F, 21F, -0.5F, 12, 3, 2, 0F,0F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -0.5F, -1F, -6F, -0.5F, -1F, 0F, 0F, 0F); // Box 40
		yawFlapModel[6].setRotationPoint(82F, -45F, -0.5F);
	}

	private void initpitchFlapLeftModel_1()
	{
		pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 60
		pitchFlapLeftModel[1] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 61
		pitchFlapLeftModel[2] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 62
		pitchFlapLeftModel[3] = new ModelRendererTurbo(this, 73, 81, textureX, textureY); // Box 63
		pitchFlapLeftModel[4] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 64
		pitchFlapLeftModel[5] = new ModelRendererTurbo(this, 105, 81, textureX, textureY); // Box 65

		pitchFlapLeftModel[0].addShapeBox(0F, -0.5F, 0F, 6, 2, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, 2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 2F, -1F, 0F, 0F, 0F, 0F); // Box 60
		pitchFlapLeftModel[0].setRotationPoint(78F, -23.5F, -26.5F);

		pitchFlapLeftModel[1].addShapeBox(0F, -0.5F, 0F, 8, 2, 5, 0F,0F, 0F, 0F, 0F, -1F, 0F, 2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 2F, -1F, 0F, 0F, 0F, 0F); // Box 61
		pitchFlapLeftModel[1].setRotationPoint(78F, -23.5F, -23.5F);

		pitchFlapLeftModel[2].addShapeBox(0F, -0.5F, 0F, 11, 2, 6, 0F,0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F); // Box 62
		pitchFlapLeftModel[2].setRotationPoint(78F, -23.5F, -13.5F);

		pitchFlapLeftModel[3].addShapeBox(0F, -0.5F, 0F, 9, 2, 5, 0F,0F, 0F, 0F, 1F, -1F, 0F, 1.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1.5F, -1F, 0F, 0F, 0F, 0F); // Box 63
		pitchFlapLeftModel[3].setRotationPoint(78F, -23.5F, -18.5F);

		pitchFlapLeftModel[4].addShapeBox(-4F, -0.5F, 0F, 8, 2, 3, 0F,0F, 0F, 0.5F, -2F, -1F, 0F, 2F, -1F, 0F, -4F, 0F, 0F, 0F, 0F, 0.5F, -2F, -1F, 0F, 2F, -1F, 0F, -4F, 0F, 0F); // Box 64
		pitchFlapLeftModel[4].setRotationPoint(78F, -23.5F, -29.5F);

		pitchFlapLeftModel[5].addShapeBox(0F, -0.5F, 0F, 11, 2, 5, 0F,0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, -3F, 0F, 0F, 0F); // Box 65
		pitchFlapLeftModel[5].setRotationPoint(78F, -23.5F, -7.5F);
	}

	private void initpitchFlapRightModel_1()
	{
		pitchFlapRightModel[0] = new ModelRendererTurbo(this, 281, 25, textureX, textureY); // Box 54
		pitchFlapRightModel[1] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 55
		pitchFlapRightModel[2] = new ModelRendererTurbo(this, 281, 73, textureX, textureY); // Box 56
		pitchFlapRightModel[3] = new ModelRendererTurbo(this, 321, 73, textureX, textureY); // Box 57
		pitchFlapRightModel[4] = new ModelRendererTurbo(this, 473, 49, textureX, textureY); // Box 58
		pitchFlapRightModel[5] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Box 59

		pitchFlapRightModel[0].addShapeBox(0F, -0.5F, 0F, 6, 2, 3, 0F,0F, 0F, 0F, 2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 54
		pitchFlapRightModel[0].setRotationPoint(78F, -23.5F, 23.5F);

		pitchFlapRightModel[1].addShapeBox(0F, -0.5F, 0F, 8, 2, 5, 0F,0F, 0F, 0F, 2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 55
		pitchFlapRightModel[1].setRotationPoint(78F, -23.5F, 18.5F);

		pitchFlapRightModel[2].addShapeBox(0F, -0.5F, 0F, 11, 2, 6, 0F,0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F); // Box 56
		pitchFlapRightModel[2].setRotationPoint(78F, -23.5F, 7.5F);

		pitchFlapRightModel[3].addShapeBox(0F, -0.5F, 0F, 9, 2, 5, 0F,0F, 0F, 0F, 1.5F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F); // Box 57
		pitchFlapRightModel[3].setRotationPoint(78F, -23.5F, 13.5F);

		pitchFlapRightModel[4].addShapeBox(-4F, -0.5F, 0F, 8, 2, 3, 0F,-4F, 0F, 0F, 2F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0.5F, -4F, 0F, 0F, 2F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0.5F); // Box 58
		pitchFlapRightModel[4].setRotationPoint(78F, -23.5F, 26.5F);

		pitchFlapRightModel[5].addShapeBox(0F, -0.5F, 0F, 11, 2, 5, 0F,0F, 0F, 0F, -0.5F, -1F, -3F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, -3F, -0.5F, -1F, 0F, 0F, 0F, 0F); // Box 59
		pitchFlapRightModel[5].setRotationPoint(78F, -23.5F, 2.5F);
	}

	private void initpitchFlapLeftWingModel_1()
	{
		pitchFlapLeftWingModel[0] = new ModelRendererTurbo(this, 121, 353, textureX, textureY); // Box 141
		pitchFlapLeftWingModel[1] = new ModelRendererTurbo(this, 289, 361, textureX, textureY); // Box 142
		pitchFlapLeftWingModel[2] = new ModelRendererTurbo(this, 313, 361, textureX, textureY); // Box 143
		pitchFlapLeftWingModel[3] = new ModelRendererTurbo(this, 337, 361, textureX, textureY); // Box 144
		pitchFlapLeftWingModel[4] = new ModelRendererTurbo(this, 361, 361, textureX, textureY); // Box 145
		pitchFlapLeftWingModel[5] = new ModelRendererTurbo(this, 385, 361, textureX, textureY); // Box 146
		pitchFlapLeftWingModel[6] = new ModelRendererTurbo(this, 409, 361, textureX, textureY); // Box 147
		pitchFlapLeftWingModel[7] = new ModelRendererTurbo(this, 145, 417, textureX, textureY); // Box 232
		pitchFlapLeftWingModel[8] = new ModelRendererTurbo(this, 169, 417, textureX, textureY); // Box 233
		pitchFlapLeftWingModel[9] = new ModelRendererTurbo(this, 193, 417, textureX, textureY); // Box 234
		pitchFlapLeftWingModel[10] = new ModelRendererTurbo(this, 217, 417, textureX, textureY); // Box 235
		pitchFlapLeftWingModel[11] = new ModelRendererTurbo(this, 241, 417, textureX, textureY); // Box 236
		pitchFlapLeftWingModel[12] = new ModelRendererTurbo(this, 265, 417, textureX, textureY); // Box 237
		pitchFlapLeftWingModel[13] = new ModelRendererTurbo(this, 289, 417, textureX, textureY); // Box 238

		pitchFlapLeftWingModel[0].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, 0F, 0F, -1F, -0.5F, -2F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, -2F, 0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 141
		pitchFlapLeftWingModel[0].setRotationPoint(-1F, -43.5F, -79F);

		pitchFlapLeftWingModel[1].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, 0F, 0F, 0.5F, -0.5F, 0F, 2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 2F, -0.5F, 0F, 0F, 0F, 0F); // Box 142
		pitchFlapLeftWingModel[1].setRotationPoint(-1F, -43.5F, -74F);

		pitchFlapLeftWingModel[2].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 143
		pitchFlapLeftWingModel[2].setRotationPoint(-1F, -43.5F, -69F);

		pitchFlapLeftWingModel[3].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 144
		pitchFlapLeftWingModel[3].setRotationPoint(-1F, -43.5F, -64F);

		pitchFlapLeftWingModel[4].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 145
		pitchFlapLeftWingModel[4].setRotationPoint(-1F, -43.5F, -59F);

		pitchFlapLeftWingModel[5].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 146
		pitchFlapLeftWingModel[5].setRotationPoint(-1F, -43.5F, -54F);

		pitchFlapLeftWingModel[6].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 147
		pitchFlapLeftWingModel[6].setRotationPoint(-1F, -43.5F, -49F);

		pitchFlapLeftWingModel[7].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, 0F, 0F, -1F, -0.5F, -2F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, -2F, 0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 232
		pitchFlapLeftWingModel[7].setRotationPoint(13F, -14.5F, -79F);

		pitchFlapLeftWingModel[8].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, 0F, 0F, 0.5F, -0.5F, 0F, 2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 2F, -0.5F, 0F, 0F, 0F, 0F); // Box 233
		pitchFlapLeftWingModel[8].setRotationPoint(13F, -14.5F, -74F);

		pitchFlapLeftWingModel[9].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 234
		pitchFlapLeftWingModel[9].setRotationPoint(13F, -14.5F, -69F);

		pitchFlapLeftWingModel[10].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 235
		pitchFlapLeftWingModel[10].setRotationPoint(13F, -14.5F, -64F);

		pitchFlapLeftWingModel[11].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 236
		pitchFlapLeftWingModel[11].setRotationPoint(13F, -14.5F, -59F);

		pitchFlapLeftWingModel[12].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 237
		pitchFlapLeftWingModel[12].setRotationPoint(13F, -14.5F, -54F);

		pitchFlapLeftWingModel[13].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 238
		pitchFlapLeftWingModel[13].setRotationPoint(13F, -14.5F, -49F);
	}

	private void initpitchFlapRightWingModel_1()
	{
		pitchFlapRightWingModel[0] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 99
		pitchFlapRightWingModel[1] = new ModelRendererTurbo(this, 121, 329, textureX, textureY); // Box 100
		pitchFlapRightWingModel[2] = new ModelRendererTurbo(this, 249, 337, textureX, textureY); // Box 101
		pitchFlapRightWingModel[3] = new ModelRendererTurbo(this, 273, 337, textureX, textureY); // Box 102
		pitchFlapRightWingModel[4] = new ModelRendererTurbo(this, 297, 337, textureX, textureY); // Box 103
		pitchFlapRightWingModel[5] = new ModelRendererTurbo(this, 321, 337, textureX, textureY); // Box 104
		pitchFlapRightWingModel[6] = new ModelRendererTurbo(this, 345, 337, textureX, textureY); // Box 105
		pitchFlapRightWingModel[7] = new ModelRendererTurbo(this, 473, 409, textureX, textureY); // Box 225
		pitchFlapRightWingModel[8] = new ModelRendererTurbo(this, 1, 417, textureX, textureY); // Box 226
		pitchFlapRightWingModel[9] = new ModelRendererTurbo(this, 25, 417, textureX, textureY); // Box 227
		pitchFlapRightWingModel[10] = new ModelRendererTurbo(this, 49, 417, textureX, textureY); // Box 228
		pitchFlapRightWingModel[11] = new ModelRendererTurbo(this, 73, 417, textureX, textureY); // Box 229
		pitchFlapRightWingModel[12] = new ModelRendererTurbo(this, 97, 417, textureX, textureY); // Box 230
		pitchFlapRightWingModel[13] = new ModelRendererTurbo(this, 121, 417, textureX, textureY); // Box 231

		pitchFlapRightWingModel[0].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, 0F, 0F, 0.5F, -0.5F, 0F, -1F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, -1F, -0.5F, -2F, 0F, 0F, 0F); // Box 99
		pitchFlapRightWingModel[0].setRotationPoint(-1F, -43.5F, 74F);

		pitchFlapRightWingModel[1].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, 0F, 0F, 2F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 100
		pitchFlapRightWingModel[1].setRotationPoint(-1F, -43.5F, 69F);

		pitchFlapRightWingModel[2].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 101
		pitchFlapRightWingModel[2].setRotationPoint(-1F, -43.5F, 64F);

		pitchFlapRightWingModel[3].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 102
		pitchFlapRightWingModel[3].setRotationPoint(-1F, -43.5F, 59F);

		pitchFlapRightWingModel[4].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 103
		pitchFlapRightWingModel[4].setRotationPoint(-1F, -43.5F, 54F);

		pitchFlapRightWingModel[5].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 104
		pitchFlapRightWingModel[5].setRotationPoint(-1F, -43.5F, 49F);

		pitchFlapRightWingModel[6].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 105
		pitchFlapRightWingModel[6].setRotationPoint(-1F, -43.5F, 44F);

		pitchFlapRightWingModel[7].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, 0F, 0F, 0.5F, -0.5F, 0F, -1F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, -1F, -0.5F, -2F, 0F, 0F, 0F); // Box 225
		pitchFlapRightWingModel[7].setRotationPoint(13F, -14.5F, 74F);

		pitchFlapRightWingModel[8].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, 0F, 0F, 2F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 226
		pitchFlapRightWingModel[8].setRotationPoint(13F, -14.5F, 69F);

		pitchFlapRightWingModel[9].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 227
		pitchFlapRightWingModel[9].setRotationPoint(13F, -14.5F, 64F);

		pitchFlapRightWingModel[10].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 228
		pitchFlapRightWingModel[10].setRotationPoint(13F, -14.5F, 59F);

		pitchFlapRightWingModel[11].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 229
		pitchFlapRightWingModel[11].setRotationPoint(13F, -14.5F, 54F);

		pitchFlapRightWingModel[12].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 230
		pitchFlapRightWingModel[12].setRotationPoint(13F, -14.5F, 49F);

		pitchFlapRightWingModel[13].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 231
		pitchFlapRightWingModel[13].setRotationPoint(13F, -14.5F, 44F);
	}

	private void initPropeller()
	{
		propellerModels = new ModelRendererTurbo[1][2];
		propellerModels[0] = makeProp1(-40F, -24F, 0F);
	}

	private ModelRendererTurbo[] makeProp1(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[2];
		prop[0] = new ModelRendererTurbo(this, 330, 34, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 330, 34, textureX, textureY);
		prop[0].addBox(-1F, -24F, -1.5F, 2, 24, 3, 0.0F);
		prop[1].addBox(-1F, -24F, -1.5F, 2, 24, 3, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		return prop;
	}
}