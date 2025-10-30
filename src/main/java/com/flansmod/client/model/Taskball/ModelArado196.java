//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Arado196
// Model Creator: 
// Created on: 08.01.2016 - 22:07:52
// Last changed on: 08.01.2016 - 22:07:52

package com.flansmod.client.model.Taskball; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelArado196 extends ModelPlane //Same as Filename
{
	int textureX = 1024;
	int textureY = 512;

	public ModelArado196() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[130];
		noseModel = new ModelRendererTurbo[2];
		tailModel = new ModelRendererTurbo[12];
		leftWingModel = new ModelRendererTurbo[11];
		rightWingModel = new ModelRendererTurbo[15];
		topWingModel = new ModelRendererTurbo[3];
		yawFlapModel = new ModelRendererTurbo[5];
		pitchFlapLeftModel = new ModelRendererTurbo[2];
		pitchFlapRightModel = new ModelRendererTurbo[2];
		leftWingWheelModel = new ModelRendererTurbo[27];
		rightWingWheelModel = new ModelRendererTurbo[24];

		initbodyModel_1();
		initnoseModel_1();
		inittailModel_1();
		initleftWingModel_1();
		initrightWingModel_1();
		inittopWingModel_1();
		inityawFlapModel_1();
		initpitchFlapLeftModel_1();
		initpitchFlapRightModel_1();
		initleftWingWheelModel_1();
		initrightWingWheelModel_1();

		initPropeller();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import CO001
		bodyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import CO002
		bodyModel[2] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Import CO003
		bodyModel[3] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Import CO004
		bodyModel[4] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Import CO005
		bodyModel[5] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Import CO006
		bodyModel[6] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Import CO007
		bodyModel[7] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Import CO008
		bodyModel[8] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Import CO009
		bodyModel[9] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Import CO010
		bodyModel[10] = new ModelRendererTurbo(this, 561, 1, textureX, textureY); // Import CO011
		bodyModel[11] = new ModelRendererTurbo(this, 641, 1, textureX, textureY); // Import CO012
		bodyModel[12] = new ModelRendererTurbo(this, 721, 1, textureX, textureY); // Import CO013
		bodyModel[13] = new ModelRendererTurbo(this, 769, 1, textureX, textureY); // Import CO015
		bodyModel[14] = new ModelRendererTurbo(this, 881, 1, textureX, textureY); // Import CO016
		bodyModel[15] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Import CO017
		bodyModel[16] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Import CO018
		bodyModel[17] = new ModelRendererTurbo(this, 769, 25, textureX, textureY); // Import CO019
		bodyModel[18] = new ModelRendererTurbo(this, 865, 25, textureX, textureY); // Import CO020
		bodyModel[19] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Import CO021
		bodyModel[20] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Import CO022
		bodyModel[21] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Import CO023
		bodyModel[22] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Import CO024
		bodyModel[23] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Import CO025
		bodyModel[24] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Import CO026
		bodyModel[25] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Import CO027
		bodyModel[26] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Import CO028
		bodyModel[27] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Import CO029
		bodyModel[28] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Import CO030
		bodyModel[29] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Import CO031
		bodyModel[30] = new ModelRendererTurbo(this, 537, 1, textureX, textureY); // Import CO032
		bodyModel[31] = new ModelRendererTurbo(this, 545, 1, textureX, textureY); // Import CO033
		bodyModel[32] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Import CO034
		bodyModel[33] = new ModelRendererTurbo(this, 569, 1, textureX, textureY); // Import CO035
		bodyModel[34] = new ModelRendererTurbo(this, 609, 1, textureX, textureY); // Import CO036
		bodyModel[35] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Import CO037
		bodyModel[36] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import CO038
		bodyModel[37] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Import CO039
		bodyModel[38] = new ModelRendererTurbo(this, 617, 1, textureX, textureY); // Import CO040
		bodyModel[39] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Import CO041
		bodyModel[40] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Import CO042
		bodyModel[41] = new ModelRendererTurbo(this, 545, 1, textureX, textureY); // Import CO043
		bodyModel[42] = new ModelRendererTurbo(this, 633, 1, textureX, textureY); // Import CO044
		bodyModel[43] = new ModelRendererTurbo(this, 641, 1, textureX, textureY); // Import CO045
		bodyModel[44] = new ModelRendererTurbo(this, 649, 1, textureX, textureY); // Import CO046
		bodyModel[45] = new ModelRendererTurbo(this, 657, 1, textureX, textureY); // Import CO047
		bodyModel[46] = new ModelRendererTurbo(this, 689, 1, textureX, textureY); // Import CO048
		bodyModel[47] = new ModelRendererTurbo(this, 697, 1, textureX, textureY); // Import CO049
		bodyModel[48] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Import CO050
		bodyModel[49] = new ModelRendererTurbo(this, 697, 9, textureX, textureY); // Import CO051
		bodyModel[50] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Import CO052
		bodyModel[51] = new ModelRendererTurbo(this, 993, 1, textureX, textureY); // Import CO053
		bodyModel[52] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Import CO054
		bodyModel[53] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Import CO055
		bodyModel[54] = new ModelRendererTurbo(this, 985, 17, textureX, textureY); // Import CO056
		bodyModel[55] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Import CO057
		bodyModel[56] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Import CO058
		bodyModel[57] = new ModelRendererTurbo(this, 993, 1, textureX, textureY); // Import CO059
		bodyModel[58] = new ModelRendererTurbo(this, 1009, 1, textureX, textureY); // Import CO060
		bodyModel[59] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Import CO061
		bodyModel[60] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Import CO062
		bodyModel[61] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Import CO063
		bodyModel[62] = new ModelRendererTurbo(this, 577, 9, textureX, textureY); // Import CO064
		bodyModel[63] = new ModelRendererTurbo(this, 609, 9, textureX, textureY); // Import CO065
		bodyModel[64] = new ModelRendererTurbo(this, 1017, 9, textureX, textureY); // Import CO066
		bodyModel[65] = new ModelRendererTurbo(this, 1001, 17, textureX, textureY); // Import CO067
		bodyModel[66] = new ModelRendererTurbo(this, 1009, 17, textureX, textureY); // Import CO068
		bodyModel[67] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Import CO069
		bodyModel[68] = new ModelRendererTurbo(this, 537, 17, textureX, textureY); // Import CO070
		bodyModel[69] = new ModelRendererTurbo(this, 617, 17, textureX, textureY); // Import CO071
		bodyModel[70] = new ModelRendererTurbo(this, 689, 17, textureX, textureY); // Import CO072
		bodyModel[71] = new ModelRendererTurbo(this, 937, 25, textureX, textureY); // Import CO077
		bodyModel[72] = new ModelRendererTurbo(this, 841, 25, textureX, textureY); // Import CO078
		bodyModel[73] = new ModelRendererTurbo(this, 849, 25, textureX, textureY); // Import CO079
		bodyModel[74] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Import CO082
		bodyModel[75] = new ModelRendererTurbo(this, 689, 33, textureX, textureY); // Import CO083
		bodyModel[76] = new ModelRendererTurbo(this, 385, 49, textureX, textureY); // Import MG1
		bodyModel[77] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Import MG3
		bodyModel[78] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Import MG4
		bodyModel[79] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Import MG5
		bodyModel[80] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Import MG6
		bodyModel[81] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Import MG7
		bodyModel[82] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Import MG8
		bodyModel[83] = new ModelRendererTurbo(this, 737, 17, textureX, textureY); // Import MG9
		bodyModel[84] = new ModelRendererTurbo(this, 881, 25, textureX, textureY); // Import MG10
		bodyModel[85] = new ModelRendererTurbo(this, 937, 25, textureX, textureY); // Import MG11
		bodyModel[86] = new ModelRendererTurbo(this, 729, 17, textureX, textureY); // Import Ammo1
		bodyModel[87] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Import Ammo2
		bodyModel[88] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Import Ammo3
		bodyModel[89] = new ModelRendererTurbo(this, 937, 33, textureX, textureY); // Import Ammo4
		bodyModel[90] = new ModelRendererTurbo(this, 985, 33, textureX, textureY); // Import Ammo5
		bodyModel[91] = new ModelRendererTurbo(this, 105, 169, textureX, textureY); // Box 209
		bodyModel[92] = new ModelRendererTurbo(this, 769, 1, textureX, textureY); // Import Box190
		bodyModel[93] = new ModelRendererTurbo(this, 881, 1, textureX, textureY); // Import Box191
		bodyModel[94] = new ModelRendererTurbo(this, 737, 9, textureX, textureY); // Import Box192
		bodyModel[95] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Import Box193
		bodyModel[96] = new ModelRendererTurbo(this, 193, 153, textureX, textureY); // Import Box194
		bodyModel[97] = new ModelRendererTurbo(this, 689, 49, textureX, textureY); // Import Box195
		bodyModel[98] = new ModelRendererTurbo(this, 497, 81, textureX, textureY); // Import Box196
		bodyModel[99] = new ModelRendererTurbo(this, 1017, 25, textureX, textureY); // Box 592
		bodyModel[100] = new ModelRendererTurbo(this, 985, 25, textureX, textureY); // Import 
		bodyModel[101] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // Box 905
		bodyModel[102] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 906
		bodyModel[103] = new ModelRendererTurbo(this, 633, 33, textureX, textureY); // Box 444
		bodyModel[104] = new ModelRendererTurbo(this, 785, 33, textureX, textureY); // Box 445
		bodyModel[105] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Box 675
		bodyModel[106] = new ModelRendererTurbo(this, 633, 41, textureX, textureY); // Box 676
		bodyModel[107] = new ModelRendererTurbo(this, 785, 41, textureX, textureY); // Box 677
		bodyModel[108] = new ModelRendererTurbo(this, 841, 41, textureX, textureY); // Box 400
		bodyModel[109] = new ModelRendererTurbo(this, 1017, 41, textureX, textureY); // Box 401
		bodyModel[110] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 402
		bodyModel[111] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 415
		bodyModel[112] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 416
		bodyModel[113] = new ModelRendererTurbo(this, 513, 17, textureX, textureY); // Box 417
		bodyModel[114] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Box 19
		bodyModel[115] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Box 20
		bodyModel[116] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // Box 21
		bodyModel[117] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 22
		bodyModel[118] = new ModelRendererTurbo(this, 545, 49, textureX, textureY); // Box 23
		bodyModel[119] = new ModelRendererTurbo(this, 553, 49, textureX, textureY); // Box 24
		bodyModel[120] = new ModelRendererTurbo(this, 113, 233, textureX, textureY); // Box 239
		bodyModel[121] = new ModelRendererTurbo(this, 929, 233, textureX, textureY); // Box 240
		bodyModel[122] = new ModelRendererTurbo(this, 153, 241, textureX, textureY); // Box 241
		bodyModel[123] = new ModelRendererTurbo(this, 257, 153, textureX, textureY); // Box 242
		bodyModel[124] = new ModelRendererTurbo(this, 777, 161, textureX, textureY); // Box 243
		bodyModel[125] = new ModelRendererTurbo(this, 737, 89, textureX, textureY); // Box 244
		bodyModel[126] = new ModelRendererTurbo(this, 761, 89, textureX, textureY); // Box 245
		bodyModel[127] = new ModelRendererTurbo(this, 537, 145, textureX, textureY); // Box 246
		bodyModel[128] = new ModelRendererTurbo(this, 945, 89, textureX, textureY); // Box 247
		bodyModel[129] = new ModelRendererTurbo(this, 257, 153, textureX, textureY); // Box 248

		bodyModel[0].addShapeBox(0F, 0F, 0F, 5, 3, 26, 0F,0F, -2F, -5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, -5F, 0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -2F); // Import CO001
		bodyModel[0].setRotationPoint(-48F, -43F, -13F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 5, 20, 3, 0F,0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F); // Import CO002
		bodyModel[1].setRotationPoint(-48F, -40F, -13F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 5, 3, 26, 0F,0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -2F, 0F, -2F, -5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, -5F); // Import CO003
		bodyModel[2].setRotationPoint(-48F, -20F, -13F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 5, 20, 3, 0F,0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F); // Import CO004
		bodyModel[3].setRotationPoint(-48F, -40F, 10F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 10, 3, 26, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import CO005
		bodyModel[4].setRotationPoint(-43F, -43F, -13F);

		bodyModel[5].addBox(0F, 0F, 0F, 10, 20, 26, 0F); // Import CO006
		bodyModel[5].setRotationPoint(-43F, -40F, -13F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 10, 3, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Import CO007
		bodyModel[6].setRotationPoint(-43F, -20F, -13F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 5, 3, 26, 0F,0F, 0F, -3F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F); // Import CO008
		bodyModel[7].setRotationPoint(-33F, -43F, -13F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 5, 20, 26, 0F,0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F); // Import CO009
		bodyModel[8].setRotationPoint(-33F, -40F, -13F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 5, 3, 26, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, 0F, -3F); // Import CO010
		bodyModel[9].setRotationPoint(-33F, -20F, -13F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 10, 4, 26, 0F,0F, -3F, -6F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -3F, -6F, 0F, 3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -2F); // Import CO011
		bodyModel[10].setRotationPoint(-28F, -44F, -13F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 10, 19, 26, 0F,0F, -3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F); // Import CO012
		bodyModel[11].setRotationPoint(-28F, -40F, -13F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 10, 4, 26, 0F,0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -2F, 0F, -2F, -6F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, -6F); // Import CO013
		bodyModel[12].setRotationPoint(-28F, -21F, -13F);

		bodyModel[13].addBox(0F, 0F, 0F, 50, 17, 5, 0F); // Import CO015
		bodyModel[13].setRotationPoint(-18F, -40F, -13F);

		bodyModel[14].addBox(0F, 0F, 0F, 50, 17, 5, 0F); // Import CO016
		bodyModel[14].setRotationPoint(-18F, -40F, 8F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 21, 17, 5, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0F, -2F, 0F, -0F, 0F, 0F, 0F, 0F); // Import CO017
		bodyModel[15].setRotationPoint(32F, -40F, -13F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 21, 17, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Import CO018
		bodyModel[16].setRotationPoint(32F, -40F, 8F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 21, 2, 26, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F); // Import CO019
		bodyModel[17].setRotationPoint(32F, -23F, -13F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 21, 4, 26, 0F,0F, 0F, 0F, 0F, 2F, -2F, 0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -2F, -6F, 0F, -2F, -6F, 0F, 0F, -4F); // Import CO020
		bodyModel[18].setRotationPoint(32F, -21F, -13F);

		bodyModel[19].addBox(0F, 0F, 0F, 50, 2, 26, 0F); // Import CO021
		bodyModel[19].setRotationPoint(-18F, -23F, -13F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 50, 4, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Import CO022
		bodyModel[20].setRotationPoint(-18F, -21F, -13F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 14, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, -2F, 0F, 0F, -2F); // Import CO023
		bodyModel[21].setRotationPoint(-24F, -18.4F, -5F);

		bodyModel[22].addBox(0F, 0F, 0F, 1, 2, 10, 0F); // Import CO024
		bodyModel[22].setRotationPoint(-14F, -45F, -5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 10, 6, 1, 0F,0F, -6F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, -6F, 0F, -1F, 0F, -0.5F, 0F, -5F, 0.5F, 0F, -5F, -1F, -1F, 0F, 0F); // Import CO025
		bodyModel[23].setRotationPoint(-14F, -51F, 4F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 10, 6, 1, 0F,0F, -6F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, -6F, -0.5F, -1F, 0F, 0F, 0F, -5F, -1F, 0F, -5F, 0.5F, -1F, 0F, -0.5F); // Import CO026
		bodyModel[24].setRotationPoint(-14F, -51F, -5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 7, 3, 1, 0F,0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, 1F, 3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, -3F); // Import CO027
		bodyModel[25].setRotationPoint(-14F, -46F, 7F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 7, 3, 1, 0F,0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, 1F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, 3F); // Import CO028
		bodyModel[26].setRotationPoint(-14F, -46F, -8F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, 0F, 0F, -5F, -2F, 0F, -5F, 2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 5F, -2F, 0F, 5F, 2F, 0F, 0F, 0F); // Import CO029
		bodyModel[27].setRotationPoint(-7F, -46F, 7F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, 0F, 0F, -5F, 2F, 0F, -5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 2F, 0F, 5F, -2F, 0F, 0F, -1F); // Import CO030
		bodyModel[28].setRotationPoint(-7F, -46F, -8F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, 0F, 3F, 0F, 0F, 3F); // Import CO031
		bodyModel[29].setRotationPoint(0F, -49F, 6F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -0.5F, 0F, 3F, -0.5F, 0F, -3F, 0F, 0F, -3F); // Import CO032
		bodyModel[30].setRotationPoint(0F, -49F, -7F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F); // Import CO033
		bodyModel[31].setRotationPoint(-4F, -52F, -5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import CO034
		bodyModel[32].setRotationPoint(0F, -52F, -5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0F, -2F, 1F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, -1F, -3F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F); // Import CO035
		bodyModel[33].setRotationPoint(-4F, -52F, 5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0F, -1F, -3F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, -2F, 1F, 0F, -1F, -2F, 0F, 0F, -0F, 0F, 0F, 0F, 0F, -1F, 1F); // Import CO036
		bodyModel[34].setRotationPoint(-4F, -52F, -7F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, -1F, 0.5F, -0.5F, -1F, 0.5F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import CO037
		bodyModel[35].setRotationPoint(0F, -52F, 5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Import CO038
		bodyModel[36].setRotationPoint(0F, -52F, -7F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import CO039
		bodyModel[37].setRotationPoint(12F, -52F, -5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import CO040
		bodyModel[38].setRotationPoint(20F, -52F, -5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Import CO041
		bodyModel[39].setRotationPoint(12F, -52F, -7F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, -1F, 0.5F, -0.5F, -1F, 0.5F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import CO042
		bodyModel[40].setRotationPoint(12F, -52F, 5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 0.5F, -0.5F, -1F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F); // Import CO043
		bodyModel[41].setRotationPoint(20F, -52F, -7F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import CO044
		bodyModel[42].setRotationPoint(20F, -52F, 5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -0.5F, 0F, 3F, -0.5F, 0F, -3F, 0F, 0F, -3F); // Import CO045
		bodyModel[43].setRotationPoint(12F, -49F, -7F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, 0F, 3F, 0F, 0F, 3F); // Import CO046
		bodyModel[44].setRotationPoint(12F, -49F, 6F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, -0.5F, 0F, -3F); // Import CO047
		bodyModel[45].setRotationPoint(20F, -49F, -7F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, -0.5F, 0F, 3F); // Import CO048
		bodyModel[46].setRotationPoint(20F, -49F, 6F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import CO049
		bodyModel[47].setRotationPoint(0F, -49F, 6F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Import CO050
		bodyModel[48].setRotationPoint(0F, -49F, -7F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Import CO051
		bodyModel[49].setRotationPoint(0F, -41F, 9F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Import CO052
		bodyModel[50].setRotationPoint(0F, -41F, -10F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import CO053
		bodyModel[51].setRotationPoint(20.5F, -51F, -4F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import CO054
		bodyModel[52].setRotationPoint(31.5F, -51F, -4F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import CO055
		bodyModel[53].setRotationPoint(35.5F, -51F, -4F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.15F, -0.25F, 0F, -0.15F, -0.25F, 0F, -0.15F, -0.25F, 0F, -0.15F, -0.25F, 0F, -0.15F, -0.25F, 0F, -0.15F, -0.25F, 0F, -0.15F, -0.25F, 0F, -0.15F, -0.25F, 0F); // Import CO056
		bodyModel[54].setRotationPoint(0F, -52F, 2.25F);
		bodyModel[54].rotateAngleX = 0.78539816F;

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Import CO057
		bodyModel[55].setRotationPoint(20.5F, -51F, -6F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import CO058
		bodyModel[56].setRotationPoint(20.5F, -51F, 4F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 0.5F, -0.5F, -1F, 0.5F, -1.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, -1.5F, 0F, -1F); // Import CO059
		bodyModel[57].setRotationPoint(31.5F, -51F, -6F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, -2F, -0.5F, 0F, -2F, -1.5F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -1.5F, 0F, 0F); // Import CO060
		bodyModel[58].setRotationPoint(31.5F, -51F, 4F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 0.5F, -0.5F, -1F, 0.5F, -1.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, -1.5F, 0F, -1F); // Import CO061
		bodyModel[59].setRotationPoint(35.5F, -51F, -6F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, -2F, -0.5F, 0F, -2F, -1.5F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -1.5F, 0F, 0F); // Import CO062
		bodyModel[60].setRotationPoint(35.5F, -51F, 4F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, -0.5F, 0F, -3F); // Import CO063
		bodyModel[61].setRotationPoint(20.5F, -49F, -6F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, -0.5F, 0F, 3F); // Import CO064
		bodyModel[62].setRotationPoint(20.5F, -49F, 5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -3.5F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, -3.5F, 0F, -3F); // Import CO065
		bodyModel[63].setRotationPoint(32.5F, -49F, -6F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -3.5F, 0F, -3F, 3F, 0F, -3F, 3F, 0F, 3F, -3.5F, 0F, 3F); // Import CO066
		bodyModel[64].setRotationPoint(32.5F, -49F, 5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -3.5F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, -3.5F, 0F, -3F); // Import CO067
		bodyModel[65].setRotationPoint(36.5F, -49F, -6F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -3.5F, 0F, -3F, 3F, 0F, -3F, 3F, 0F, 3F, -3.5F, 0F, 3F); // Import CO068
		bodyModel[66].setRotationPoint(36.5F, -49F, 5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 17, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Import CO069
		bodyModel[67].setRotationPoint(20.5F, -49F, -6F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 17, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import CO070
		bodyModel[68].setRotationPoint(20.5F, -49F, 5F);

		bodyModel[69].addBox(0F, 0F, 0F, 20, 1, 1, 0F); // Import CO071
		bodyModel[69].setRotationPoint(20.5F, -41F, -9F);

		bodyModel[70].addBox(0F, 0F, 0F, 20, 1, 1, 0F); // Import CO072
		bodyModel[70].setRotationPoint(20.5F, -41F, 8F);

		bodyModel[71].addBox(0F, 0F, 0F, 14, 4, 14, 0F); // Import CO077
		bodyModel[71].setRotationPoint(34F, -28F, -7F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F); // Import CO078
		bodyModel[72].setRotationPoint(52F, -37F, -0.5F);

		bodyModel[73].addTrapezoid(0F, 0F, 0F, 1, 9, 1, 0F, -0.25F, ModelRendererTurbo.MR_TOP); // Import CO079
		bodyModel[73].setRotationPoint(52F, -46F, -0.5F);

		bodyModel[74].addBox(0F, 0F, 0F, 20, 2, 26, 0F); // Import CO082
		bodyModel[74].setRotationPoint(-6F, -19F, -13F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 23, 6, 26, 0F,0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 3F, 0F); // Import CO083
		bodyModel[75].setRotationPoint(14F, -26F, -13F);

		bodyModel[76].addBox(-2F, -0.5F, -0.5F, 13, 1, 1, 0F); // Import MG1
		bodyModel[76].setRotationPoint(53F, -46F, 0F);
		bodyModel[76].rotateAngleZ = 0.2268928F;

		bodyModel[77].addBox(-9F, -1F, -1F, 7, 2, 2, 0F); // Import MG3
		bodyModel[77].setRotationPoint(53F, -46F, 0F);
		bodyModel[77].rotateAngleZ = 0.2268928F;

		bodyModel[78].addShapeBox(-6F, -1.5F, -1F, 4, 1, 2, 0F,-2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import MG4
		bodyModel[78].setRotationPoint(53F, -46F, 0F);
		bodyModel[78].rotateAngleZ = 0.2268928F;

		bodyModel[79].addShapeBox(9F, -2.5F, -0.5F, 1, 2, 1, 0F,-0.4F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.4F, 0F, -0.4F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Import MG5
		bodyModel[79].setRotationPoint(53F, -46F, 0F);
		bodyModel[79].rotateAngleZ = 0.2268928F;

		bodyModel[80].addShapeBox(-4F, -2F, -0.5F, 1, 2, 1, 0F,-0.4F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.4F, 0F, -0.4F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Import MG6
		bodyModel[80].setRotationPoint(53F, -46F, 0F);
		bodyModel[80].rotateAngleZ = 0.2268928F;

		bodyModel[81].addShapeBox(-8.2F, 1F, -0.5F, 2, 3, 1, 0F,-1F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -1F, 0F, -0.1F, 0F, -1F, -0.1F, -1F, 0F, -0.1F, -1F, 0F, -0.1F, 0F, -1F, -0.1F); // Import MG7
		bodyModel[81].setRotationPoint(53F, -46F, 0F);
		bodyModel[81].rotateAngleZ = 0.2268928F;

		bodyModel[82].addShapeBox(-7F, 1F, -0.5F, 2, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Import MG8
		bodyModel[82].setRotationPoint(53F, -46F, 0F);
		bodyModel[82].rotateAngleZ = 0.2268928F;

		bodyModel[83].addBox(-5.5F, -0.5F, 0.2F, 3, 1, 1, 0F); // Import MG9
		bodyModel[83].setRotationPoint(53F, -46F, 0F);
		bodyModel[83].rotateAngleZ = 0.2268928F;

		bodyModel[84].addBox(-5.5F, -0.5F, -1.2F, 3, 1, 1, 0F); // Import MG10
		bodyModel[84].setRotationPoint(53F, -46F, 0F);
		bodyModel[84].rotateAngleZ = 0.2268928F;

		bodyModel[85].addShapeBox(-2F, -1F, -1F, 2, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.25F, -0.25F); // Import MG11
		bodyModel[85].setRotationPoint(53F, -46F, 0F);
		bodyModel[85].rotateAngleZ = 0.2268928F;

		bodyModel[86].addShapeBox(-5F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Ammo1
		bodyModel[86].setRotationPoint(53F, -46F, 0F);
		bodyModel[86].rotateAngleZ = 0.2268928F;

		bodyModel[87].addShapeBox(-5F, 0F, -3F, 2, 1, 3, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Ammo2
		bodyModel[87].setRotationPoint(53F, -46F, 0F);
		bodyModel[87].rotateAngleZ = 0.2268928F;

		bodyModel[88].addBox(-5F, 1F, -3F, 2, 1, 6, 0F); // Import Ammo3
		bodyModel[88].setRotationPoint(53F, -46F, 0F);
		bodyModel[88].rotateAngleZ = 0.2268928F;

		bodyModel[89].addShapeBox(-5F, 2F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Import Ammo4
		bodyModel[89].setRotationPoint(53F, -46F, 0F);
		bodyModel[89].rotateAngleZ = 0.2268928F;

		bodyModel[90].addShapeBox(-5F, 2F, -3F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Import Ammo5
		bodyModel[90].setRotationPoint(53F, -46F, 0F);
		bodyModel[90].rotateAngleZ = 0.2268928F;

		bodyModel[91].addShapeBox(0F, 0F, 0F, 11, 5, 13, 0F,0F, -1F, -7F, 0F, 0F, -7F, 0F, 0F, -4F, 0F, -1F, -4F, 0F, 0F, -8F, 7F, 0F, -8F, 7F, 0F, 0F, 0F, 0F, 0F); // Box 209
		bodyModel[91].setRotationPoint(-18F, -45F, 0F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Import Box190
		bodyModel[92].setRotationPoint(-5F, -38F, -1.5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box191
		bodyModel[93].setRotationPoint(-5F, -38F, 0.5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box192
		bodyModel[94].setRotationPoint(-5F, -39F, -1.5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 9, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box193
		bodyModel[95].setRotationPoint(-1F, -29F, -6F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 2, 20, 12, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box194
		bodyModel[96].setRotationPoint(7F, -46F, -6F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box195
		bodyModel[97].setRotationPoint(-1F, -31F, -7F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box196
		bodyModel[98].setRotationPoint(-1F, -31F, 6F);

		bodyModel[99].addShapeBox(-0.5F, 0F, -0.5F, 1, 9, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 592
		bodyModel[99].setRotationPoint(-4.5F, -35.5F, 0F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import 
		bodyModel[100].setRotationPoint(-5F, -27F, -1F);

		bodyModel[101].addShapeBox(0F, -1F, 0F, 1, 1, 2, 0F,0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Box 905
		bodyModel[101].setRotationPoint(-13F, -28.5F, -4F);
		bodyModel[101].rotateAngleZ = 0.41887903F;

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Box 906
		bodyModel[102].setRotationPoint(-13F, -28.5F, -4F);
		bodyModel[102].rotateAngleZ = 0.41887903F;

		bodyModel[103].addShapeBox(0F, -1F, 0F, 1, 1, 2, 0F,0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Box 444
		bodyModel[103].setRotationPoint(-13F, -28.5F, 2F);
		bodyModel[103].rotateAngleZ = 0.41887903F;

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Box 445
		bodyModel[104].setRotationPoint(-13F, -28.5F, 2F);
		bodyModel[104].rotateAngleZ = 0.41887903F;

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 675
		bodyModel[105].setRotationPoint(-7.5F, -43.5F, 2.5F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 676
		bodyModel[106].setRotationPoint(-7.5F, -43F, 2.5F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 677
		bodyModel[107].setRotationPoint(-7.5F, -43F, 2.5F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 400
		bodyModel[108].setRotationPoint(-7.5F, -43.5F, -4F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 401
		bodyModel[109].setRotationPoint(-7.5F, -43F, -4F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 402
		bodyModel[110].setRotationPoint(-7.5F, -43F, -4F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 415
		bodyModel[111].setRotationPoint(-7.5F, -44.5F, -1.25F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 416
		bodyModel[112].setRotationPoint(-7.5F, -44F, -1.25F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 417
		bodyModel[113].setRotationPoint(-7.5F, -43F, -1.25F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 19
		bodyModel[114].setRotationPoint(-7.5F, -41F, -5F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 20
		bodyModel[115].setRotationPoint(-7.5F, -41.5F, -5F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 21
		bodyModel[116].setRotationPoint(-7.5F, -41F, -5F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 22
		bodyModel[117].setRotationPoint(-7.5F, -41.5F, 3.5F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 23
		bodyModel[118].setRotationPoint(-7.5F, -41F, 3.5F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 24
		bodyModel[119].setRotationPoint(-7.5F, -41F, 3.5F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 11, 5, 13, 0F,0F, -1F, -4F, 0F, 0F, -4F, 0F, 0F, -7F, 0F, -1F, -7F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, -8F, 0F, 0F, -8F); // Box 239
		bodyModel[120].setRotationPoint(-18F, -45F, -13F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 11, 6, 14, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -3F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -3F); // Box 240
		bodyModel[121].setRotationPoint(-18F, -45F, -7F);

		bodyModel[122].addBox(0F, 0F, 0F, 71, 2, 16, 0F); // Box 241
		bodyModel[122].setRotationPoint(-18F, -26F, -8F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 2, 19, 12, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		bodyModel[123].setRotationPoint(26F, -45F, -6F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 9, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		bodyModel[124].setRotationPoint(18F, -29F, -6F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		bodyModel[125].setRotationPoint(18F, -31F, -7F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[126].setRotationPoint(18F, -31F, 6F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 8, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 246
		bodyModel[127].setRotationPoint(11F, -36F, -9F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 4, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[128].setRotationPoint(12F, -39F, -8F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 2, 19, 12, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[129].setRotationPoint(33F, -45F, -6F);
	}

	private void initnoseModel_1()
	{
		noseModel[0] = new ModelRendererTurbo(this, 849, 25, textureX, textureY); // Import NO1
		noseModel[1] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Import NO2

		noseModel[0].addTrapezoid(0F, 0F, 0F, 7, 11, 11, 0F, -3.00F, ModelRendererTurbo.MR_RIGHT); // Import NO1
		noseModel[0].setRotationPoint(-61F, -35F, -5.5F);

		noseModel[1].addShapeBox(0F, 0F, 0F, 10, 13, 13, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Import NO2
		noseModel[1].setRotationPoint(-54F, -36F, -6.5F);
	}

	private void inittailModel_1()
	{
		tailModel[0] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Import TA01
		tailModel[1] = new ModelRendererTurbo(this, 369, 65, textureX, textureY); // Import TA02
		tailModel[2] = new ModelRendererTurbo(this, 609, 73, textureX, textureY); // Import TA03
		tailModel[3] = new ModelRendererTurbo(this, 497, 65, textureX, textureY); // Import TA04
		tailModel[4] = new ModelRendererTurbo(this, 137, 81, textureX, textureY); // Import TA05
		tailModel[5] = new ModelRendererTurbo(this, 521, 81, textureX, textureY); // Import TA06
		tailModel[6] = new ModelRendererTurbo(this, 185, 97, textureX, textureY); // Import TA07
		tailModel[7] = new ModelRendererTurbo(this, 481, 97, textureX, textureY); // Import TA08
		tailModel[8] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // Import TA09
		tailModel[9] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // Import TA10
		tailModel[10] = new ModelRendererTurbo(this, 1, 271, textureX, textureY); // Import txtL2
		tailModel[11] = new ModelRendererTurbo(this, 49, 271, textureX, textureY); // Import txtR2

		tailModel[0].addShapeBox(0F, 0F, 0F, 50, 4, 22, 0F,0F, 0F, -4F, 0F, -3F, -10F, 0F, -3F, -10F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 3F, -6F, 0F, 3F, -6F, 0F, 0F, 0F); // Import TA01
		tailModel[0].setRotationPoint(53F, -44F, -11F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 50, 17, 22, 0F,0F, 0F, 0F, 0F, -3F, -6F, 0F, -3F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -6F, 0F, -6F, -6F, 0F, 0F, 0F); // Import TA02
		tailModel[1].setRotationPoint(53F, -40F, -11F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 50, 4, 22, 0F,0F, 0F, 0F, 0F, 6F, -6F, 0F, 6F, -6F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -6F, -10F, 0F, -6F, -10F, 0F, 0F, -4F); // Import TA03
		tailModel[2].setRotationPoint(53F, -23F, -11F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 29, 4, 10, 0F,0F, 0F, -4F, 0F, -3F, -4.5F, 0F, -3F, -4.5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, 0F); // Import TA04
		tailModel[3].setRotationPoint(103F, -41F, -5F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 29, 8, 10, 0F,0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4.5F, 0F, -2F, -4.5F, 0F, 0F, 0F); // Import TA05
		tailModel[4].setRotationPoint(103F, -37F, -5F);

		tailModel[5].addShapeBox(0F, 0F, 0F, 29, 4, 10, 0F,0F, 0F, 0F, 0F, 2F, -4.5F, 0F, 2F, -4.5F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -6F, -4.5F, 0F, -6F, -4.5F, 0F, 0F, -4F); // Import TA06
		tailModel[5].setRotationPoint(103F, -29F, -5F);

		tailModel[6].addShapeBox(0F, 0F, 0F, 17, 2, 38, 0F,-8F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -8F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Import TA07
		tailModel[6].setRotationPoint(109F, -37F, -38F);

		tailModel[7].addShapeBox(0F, 0F, 0F, 17, 2, 38, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, -0.5F, 0F); // Import TA08
		tailModel[7].setRotationPoint(109F, -37F, 0F);

		tailModel[8].addShapeBox(0F, 0F, 0F, 12, 2, 9, 0F,-6F, -0.5F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, -0.5F, 0F, -6F, -0.5F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, -0.5F, 0F); // Import TA09
		tailModel[8].setRotationPoint(117F, -37F, -47F);

		tailModel[9].addShapeBox(0F, 0F, 0F, 12, 2, 9, 0F,0F, -0.5F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -6F, -0.5F, 0F, 0F, -0.5F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -6F, -0.5F, 0F); // Import TA10
		tailModel[9].setRotationPoint(117F, -37F, 38F);

		tailModel[10].addShapeBox(0F, 0F, 0F, 20, 20, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import txtL2
		tailModel[10].setRotationPoint(53F, -41F, -11.5F);
		tailModel[10].rotateAngleY = 0.12217305F;

		tailModel[11].addShapeBox(0F, 0F, 0F, 20, 20, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import txtR2
		tailModel[11].setRotationPoint(53F, -41F, 11.5F);
		tailModel[11].rotateAngleY = -0.12217305F;
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 881, 57, textureX, textureY); // Import LW01
		leftWingModel[1] = new ModelRendererTurbo(this, 257, 97, textureX, textureY); // Import LW02
		leftWingModel[2] = new ModelRendererTurbo(this, 713, 97, textureX, textureY); // Import LW03
		leftWingModel[3] = new ModelRendererTurbo(this, 793, 97, textureX, textureY); // Import LW04
		leftWingModel[4] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Import LW05
		leftWingModel[5] = new ModelRendererTurbo(this, 105, 105, textureX, textureY); // Import LW06
		leftWingModel[6] = new ModelRendererTurbo(this, 345, 105, textureX, textureY); // Import LW07
		leftWingModel[7] = new ModelRendererTurbo(this, 137, 65, textureX, textureY); // Import LW08
		leftWingModel[8] = new ModelRendererTurbo(this, 737, 73, textureX, textureY); // Import LW09
		leftWingModel[9] = new ModelRendererTurbo(this, 561, 97, textureX, textureY); // Import LW10
		leftWingModel[10] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Import LW11

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 8, 9, 43, 0F,0F, 0.5F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -7.5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Import LW01
		leftWingModel[0].setRotationPoint(-14F, -26F, -56F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 20, 9, 43, 0F,0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LW02
		leftWingModel[1].setRotationPoint(-6F, -26F, -56F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 23, 6, 43, 0F,0F, 3F, 0F, -3F, -2F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, -3F, 0F, 0F, 2F, 0F, 0F, 3F, 0F); // Import LW03
		leftWingModel[2].setRotationPoint(14F, -26F, -56F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 8, 5, 57, 0F,-4F, 1.5F, 0F, 4F, 3F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, -4F, -5.5F, 0F, 4F, -4F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F); // Import LW04
		leftWingModel[3].setRotationPoint(-14F, -29F, -113F);

		leftWingModel[4].addShapeBox(0F, 0F, 0F, 20, 5, 57, 0F,-4F, 3F, 0F, -3F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -4F, 0F, -3F, -4F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Import LW05
		leftWingModel[4].setRotationPoint(-6F, -29F, -113F);

		leftWingModel[5].addShapeBox(0F, 0F, 0F, 20, 5, 38, 0F,2F, 2F, 0F, -2F, -1F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 2F, -2F, 0F, -2F, -3F, 0F, 0F, 1F, 0F, 0F, 2F, 0F); // Import LW06
		leftWingModel[5].setRotationPoint(14F, -29F, -94F);

		leftWingModel[6].addShapeBox(0F, 0F, 0F, 20, 5, 19, 0F,1F, 1F, 0F, -6F, -1.5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, -6F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import LW07
		leftWingModel[6].setRotationPoint(12F, -31F, -113F);

		leftWingModel[7].addShapeBox(0F, 0F, 0F, 8, 3, 12, 0F,-8F, -0.5F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -8F, -1.5F, 0F, 8F, -1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F); // Import LW08
		leftWingModel[7].setRotationPoint(-10F, -32F, -125F);

		leftWingModel[8].addShapeBox(0F, 0F, 0F, 13, 3, 12, 0F,-8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Import LW09
		leftWingModel[8].setRotationPoint(-2F, -32F, -125F);

		leftWingModel[9].addShapeBox(0F, 0F, 0F, 15, 3, 12, 0F,0F, 0F, 0F, 0F, -2.5F, -12F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 1F, 0F); // Import LW10
		leftWingModel[9].setRotationPoint(11F, -32F, -125F);

		leftWingModel[10].addBox(0F, 0F, 0F, 8, 2, 2, 0F); // Import LW11
		leftWingModel[10].setRotationPoint(-18F, -25F, -43F);
	}

	private void initrightWingModel_1()
	{
		rightWingModel[0] = new ModelRendererTurbo(this, 385, 105, textureX, textureY); // Import RW01
		rightWingModel[1] = new ModelRendererTurbo(this, 577, 105, textureX, textureY); // Import RW02
		rightWingModel[2] = new ModelRendererTurbo(this, 881, 121, textureX, textureY); // Import RW03
		rightWingModel[3] = new ModelRendererTurbo(this, 169, 145, textureX, textureY); // Import RW04
		rightWingModel[4] = new ModelRendererTurbo(this, 433, 145, textureX, textureY); // Import RW05
		rightWingModel[5] = new ModelRendererTurbo(this, 249, 153, textureX, textureY); // Import RW06
		rightWingModel[6] = new ModelRendererTurbo(this, 665, 105, textureX, textureY); // Import RW07
		rightWingModel[7] = new ModelRendererTurbo(this, 809, 97, textureX, textureY); // Import RW08
		rightWingModel[8] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Import RW09
		rightWingModel[9] = new ModelRendererTurbo(this, 449, 105, textureX, textureY); // Import RW10
		rightWingModel[10] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Import RW11
		rightWingModel[11] = new ModelRendererTurbo(this, 65, 271, textureX, textureY); // Import txtRW1
		rightWingModel[12] = new ModelRendererTurbo(this, 161, 271, textureX, textureY); // Box 210
		rightWingModel[13] = new ModelRendererTurbo(this, 257, 271, textureX, textureY); // Box 249
		rightWingModel[14] = new ModelRendererTurbo(this, 353, 271, textureX, textureY); // Box 250

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 8, 9, 43, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0.5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -7.5F, 0F); // Import RW01
		rightWingModel[0].setRotationPoint(-14F, -26F, 13F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 20, 9, 43, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F); // Import RW02
		rightWingModel[1].setRotationPoint(-6F, -26F, 13F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 23, 6, 43, 0F,0F, 0F, 0F, 0F, -7F, 0F, -3F, -2F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 2F, 0F, -3F, -3F, 0F, 0F, -2F, 0F); // Import RW03
		rightWingModel[2].setRotationPoint(14F, -26F, 13F);

		rightWingModel[3].addShapeBox(0F, 0F, 0F, 8, 5, 57, 0F,0F, -2.5F, 0F, 0F, 0F, 0F, 4F, 3F, 0F, -4F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 4F, -4F, 0F, -4F, -5.5F, 0F); // Import RW04
		rightWingModel[3].setRotationPoint(-14F, -29F, 56F);

		rightWingModel[4].addShapeBox(0F, 0F, 0F, 20, 5, 57, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 3F, 0F, -4F, 3F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -3F, -4F, 0F, -4F, -4F, 0F); // Import RW05
		rightWingModel[4].setRotationPoint(-6F, -29F, 56F);

		rightWingModel[5].addShapeBox(0F, 0F, 0F, 20, 5, 38, 0F,0F, 0F, 0F, 0F, -5F, 0F, -2F, -1F, 0F, 2F, 2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, -2F, -3F, 0F, 2F, -2F, 0F); // Import RW06
		rightWingModel[5].setRotationPoint(14F, -29F, 56F);

		rightWingModel[6].addShapeBox(0F, 0F, 0F, 20, 5, 19, 0F,0F, 0F, 0F, 0F, -3F, 0F, -6F, -1.5F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -6F, -3F, 0F, 1F, -2F, 0F); // Import RW07
		rightWingModel[6].setRotationPoint(12F, -31F, 94F);

		rightWingModel[7].addShapeBox(0F, 0F, 0F, 8, 3, 12, 0F,0F, -1.5F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, -8F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 8F, -1F, 0F, -8F, -1.5F, 0F); // Import RW08
		rightWingModel[7].setRotationPoint(-10F, -32F, 113F);

		rightWingModel[8].addShapeBox(0F, 0F, 0F, 13, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -8F, -1F, 0F); // Import RW09
		rightWingModel[8].setRotationPoint(-2F, -32F, 113F);

		rightWingModel[9].addShapeBox(0F, 0F, 0F, 15, 3, 12, 0F,0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, -12F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, -1F, 0F); // Import RW10
		rightWingModel[9].setRotationPoint(11F, -32F, 113F);

		rightWingModel[10].addBox(0F, 0F, 0F, 8, 2, 2, 0F); // Import RW11
		rightWingModel[10].setRotationPoint(-18F, -25F, 40F);

		rightWingModel[11].addShapeBox(0F, 0F, 0F, 30, 0, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import txtRW1
		rightWingModel[11].setRotationPoint(-6F, -30.5F, 77F);
		rightWingModel[11].rotateAngleX = 0.05235988F;

		rightWingModel[12].addShapeBox(0F, 0F, 0F, 30, 0, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		rightWingModel[12].setRotationPoint(-6F, -32F, -107F);
		rightWingModel[12].rotateAngleX = -0.05235988F;

		rightWingModel[13].addShapeBox(0F, 0F, 0F, 30, 0, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 249
		rightWingModel[13].setRotationPoint(-6F, -24F, 77F);
		rightWingModel[13].rotateAngleX = 0.10471976F;

		rightWingModel[14].addShapeBox(0F, 0F, 0F, 30, 0, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 250
		rightWingModel[14].setRotationPoint(-6F, -27F, -107F);
		rightWingModel[14].rotateAngleX = -0.10471976F;
	}

	private void inittopWingModel_1()
	{
		topWingModel[0] = new ModelRendererTurbo(this, 873, 113, textureX, textureY); // Import TW1
		topWingModel[1] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Import TW2
		topWingModel[2] = new ModelRendererTurbo(this, 777, 177, textureX, textureY); // Import TW3

		topWingModel[0].addShapeBox(0F, 0F, 0F, 18, 26, 2, 0F,-8F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Import TW1
		topWingModel[0].setRotationPoint(104F, -65F, -1F);

		topWingModel[1].addShapeBox(0F, 0F, 0F, 10, 10, 2, 0F,-4F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Import TW2
		topWingModel[1].setRotationPoint(112F, -75F, -1F);

		topWingModel[2].addShapeBox(0F, 0F, 0F, 116, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, 11.6F, 10.1F, 0F, 11.6F, -10.9F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -12.4F, 10.1F, 0F, -12.4F, -10.9F, 0F, -0.4F, -0.4F); // Import TW3
		topWingModel[2].setRotationPoint(0.5F, -60F, 10F);
	}

	private void inityawFlapModel_1()
	{
		yawFlapModel[0] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Import FY1
		yawFlapModel[1] = new ModelRendererTurbo(this, 265, 97, textureX, textureY); // Import FY2
		yawFlapModel[2] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Import FY3
		yawFlapModel[3] = new ModelRendererTurbo(this, 985, 97, textureX, textureY); // Import FY4
		yawFlapModel[4] = new ModelRendererTurbo(this, 593, 81, textureX, textureY); // Import FY5

		yawFlapModel[0].addShapeBox(0F, 0F, 0F, 7, 3, 2, 0F,0F, 0F, 0F, -2F, -1F, -0.5F, -2F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Import FY1
		yawFlapModel[0].setRotationPoint(122F, -75F, -1F);

		yawFlapModel[1].addShapeBox(0F, 0F, 0F, 13, 12, 2, 0F,0F, 0F, 0F, -6F, 0F, -0.5F, -6F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Import FY2
		yawFlapModel[1].setRotationPoint(122F, -72F, -1F);

		yawFlapModel[2].addShapeBox(0F, 0F, 0F, 15, 6, 2, 0F,0F, 0F, 0F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Import FY3
		yawFlapModel[2].setRotationPoint(122F, -60F, -1F);

		yawFlapModel[3].addShapeBox(0F, 0F, 0F, 15, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Import FY4
		yawFlapModel[3].setRotationPoint(122F, -54F, -1F);

		yawFlapModel[4].addShapeBox(0F, 0F, 0F, 15, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -2F, -0.5F, -4F, -2F, -0.5F, 0F, 0F, 0F); // Import FY5
		yawFlapModel[4].setRotationPoint(122F, -46F, -1F);
	}

	private void initpitchFlapLeftModel_1()
	{
		pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 121, 153, textureX, textureY); // Import FPL1
		pitchFlapLeftModel[1] = new ModelRendererTurbo(this, 561, 113, textureX, textureY); // Import FPL2

		pitchFlapLeftModel[0].addShapeBox(0F, 0F, 0F, 13, 2, 38, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, 0F, 0F); // Import FPL1
		pitchFlapLeftModel[0].setRotationPoint(126F, -37F, -38F);

		pitchFlapLeftModel[1].addShapeBox(0F, 0F, 0F, 10, 2, 9, 0F,0F, 0F, 0F, -5F, -0.5F, 0F, 0F, -0.5F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, -5F, -0.5F, 0F, 0F, -0.5F, 0F, 3F, 0F, 0F); // Import FPL2
		pitchFlapLeftModel[1].setRotationPoint(129F, -37F, -47F);
	}

	private void initpitchFlapRightModel_1()
	{
		pitchFlapRightModel[0] = new ModelRendererTurbo(this, 329, 161, textureX, textureY); // Import FPR1
		pitchFlapRightModel[1] = new ModelRendererTurbo(this, 809, 113, textureX, textureY); // Import FPR2

		pitchFlapRightModel[0].addShapeBox(0F, 0F, 0F, 13, 2, 38, 0F,0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Import FPR1
		pitchFlapRightModel[0].setRotationPoint(126F, -37F, 0F);

		pitchFlapRightModel[1].addShapeBox(0F, 0F, 0F, 10, 2, 9, 0F,3F, 0F, 0F, 0F, -0.5F, 0F, -5F, -0.5F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, -0.5F, 0F, -5F, -0.5F, 0F, 0F, 0F, 0F); // Import FPR2
		pitchFlapRightModel[1].setRotationPoint(129F, -37F, 38F);
	}

	private void initleftWingWheelModel_1()
	{
		leftWingWheelModel[0] = new ModelRendererTurbo(this, 401, 161, textureX, textureY); // Import LWW01
		leftWingWheelModel[1] = new ModelRendererTurbo(this, 537, 161, textureX, textureY); // Import LWW02
		leftWingWheelModel[2] = new ModelRendererTurbo(this, 585, 169, textureX, textureY); // Import LWW03
		leftWingWheelModel[3] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Import LWW04
		leftWingWheelModel[4] = new ModelRendererTurbo(this, 729, 185, textureX, textureY); // Import LWW05
		leftWingWheelModel[5] = new ModelRendererTurbo(this, 545, 33, textureX, textureY); // Import LWW06
		leftWingWheelModel[6] = new ModelRendererTurbo(this, 769, 33, textureX, textureY); // Import LWW07
		leftWingWheelModel[7] = new ModelRendererTurbo(this, 809, 185, textureX, textureY); // Import LWW08
		leftWingWheelModel[8] = new ModelRendererTurbo(this, 881, 185, textureX, textureY); // Import LWW09
		leftWingWheelModel[9] = new ModelRendererTurbo(this, 569, 201, textureX, textureY); // Import LWW10
		leftWingWheelModel[10] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Import LWW11
		leftWingWheelModel[11] = new ModelRendererTurbo(this, 929, 185, textureX, textureY); // Import LWW12
		leftWingWheelModel[12] = new ModelRendererTurbo(this, 985, 33, textureX, textureY); // Import LWW13
		leftWingWheelModel[13] = new ModelRendererTurbo(this, 105, 105, textureX, textureY); // Import LWW14
		leftWingWheelModel[14] = new ModelRendererTurbo(this, 657, 49, textureX, textureY); // Import LWW15
		leftWingWheelModel[15] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Import LWW16
		leftWingWheelModel[16] = new ModelRendererTurbo(this, 945, 57, textureX, textureY); // Import LWW17
		leftWingWheelModel[17] = new ModelRendererTurbo(this, 185, 105, textureX, textureY); // Import LWW18
		leftWingWheelModel[18] = new ModelRendererTurbo(this, 345, 97, textureX, textureY); // Import LWW19
		leftWingWheelModel[19] = new ModelRendererTurbo(this, 201, 105, textureX, textureY); // Import LWW20
		leftWingWheelModel[20] = new ModelRendererTurbo(this, 505, 105, textureX, textureY); // Import LWW21
		leftWingWheelModel[21] = new ModelRendererTurbo(this, 745, 105, textureX, textureY); // Import LWW22
		leftWingWheelModel[22] = new ModelRendererTurbo(this, 561, 33, textureX, textureY); // Import LWW23
		leftWingWheelModel[23] = new ModelRendererTurbo(this, 217, 97, textureX, textureY); // Import LWW24
		leftWingWheelModel[24] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Import LWW25
		leftWingWheelModel[25] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Import LWW26
		leftWingWheelModel[26] = new ModelRendererTurbo(this, 513, 9, textureX, textureY); // Import LWW27

		leftWingWheelModel[0].addShapeBox(0F, 0F, 0F, 18, 8, 17, 0F,0F, -4F, -6F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -4F, -6F, 0F, 0F, -4F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, -4F); // Import LWW01
		leftWingWheelModel[0].setRotationPoint(-76F, 4F, -37F);

		leftWingWheelModel[1].addShapeBox(4F, 0F, 0F, 15, 8, 17, 0F,0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 3F, 0F, 0F, 4F, 2F, 0F, 4F, 2F, 0F, 3F, 0F); // Import LWW02
		leftWingWheelModel[1].setRotationPoint(-62F, 4F, -37F);

		leftWingWheelModel[2].addShapeBox(0F, 0F, 0F, 50, 12, 19, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 1F); // Import LWW03
		leftWingWheelModel[2].setRotationPoint(-43F, 4F, -38F);

		leftWingWheelModel[3].addShapeBox(0F, 0F, 0F, 41, 11, 19, 0F,0F, 0F, -2F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, 4F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 4F, 0F); // Import LWW04
		leftWingWheelModel[3].setRotationPoint(7F, 4F, -38F);

		leftWingWheelModel[4].addShapeBox(0F, 0F, 0F, 24, 10, 13, 0F,0F, 0F, -2F, 0F, -2F, -6F, 0F, -2F, -6F, 0F, 0F, -2F, 0F, 1F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 1F, 0F); // Import LWW05
		leftWingWheelModel[4].setRotationPoint(48F, 4F, -35F);

		leftWingWheelModel[5].addShapeBox(0F, 0F, 0F, 6, 13, 1, 0F,0F, -3F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -3F, -0.25F, 0F, -3F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -3F, -0.25F); // Import LWW06
		leftWingWheelModel[5].setRotationPoint(72F, 4F, -29F);

		leftWingWheelModel[6].addShapeBox(0F, 0F, 0F, 4, 13, 1, 0F,0F, 0F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, 0F, 0F, -0.25F); // Import LWW07
		leftWingWheelModel[6].setRotationPoint(78F, 4F, -29F);

		leftWingWheelModel[7].addShapeBox(0F, 0F, 0F, 18, 8, 17, 0F,0F, 0F, -4F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -4F, -3F, -6F, -8.5F, 0F, 0F, -7F, 0F, 0F, -7F, -3F, -6F, -8.5F); // Import LWW08
		leftWingWheelModel[7].setRotationPoint(-76F, 12F, -37F);

		leftWingWheelModel[8].addShapeBox(0F, 0F, 0F, 15, 6, 17, 0F,0F, 0F, 0F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, 0F, 0F, -1F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -1F, -7F); // Import LWW09
		leftWingWheelModel[8].setRotationPoint(-58F, 15F, -37F);

		leftWingWheelModel[9].addShapeBox(0F, 0F, 0F, 50, 8, 19, 0F,0F, 0F, 1F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 1F, 0F, -3F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, -3F, -8F); // Import LWW10
		leftWingWheelModel[9].setRotationPoint(-43F, 16F, -38F);

		leftWingWheelModel[10].addShapeBox(0F, 0F, 0F, 41, 8, 19, 0F,0F, -3F, 0F, 0F, 1F, -3F, 0F, 1F, -3F, 0F, -3F, 0F, 0F, -3F, -9F, 0F, -6F, -9F, 0F, -6F, -9F, 0F, -3F, -9F); // Import LWW11
		leftWingWheelModel[10].setRotationPoint(7F, 16F, -38F);

		leftWingWheelModel[11].addShapeBox(0F, 0F, 0F, 24, 3, 13, 0F,0F, 0F, 0F, 0F, 1F, -6F, 0F, 1F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -4F, -6F, 0F, -4F, -6F, 0F, 0F, -6F); // Import LWW12
		leftWingWheelModel[11].setRotationPoint(48F, 15F, -35F);

		leftWingWheelModel[12].addTrapezoid(0F, 0F, 0F, 6, 1, 13, 0F, -0.50F, ModelRendererTurbo.MR_TOP); // Import LWW13
		leftWingWheelModel[12].setRotationPoint(-20F, 3.5F, -35F);

		leftWingWheelModel[13].addShapeBox(0F, 0F, 0F, 6, 1, 12, 0F,-0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Import LWW14
		leftWingWheelModel[13].setRotationPoint(24F, 3F, -34.5F);

		leftWingWheelModel[14].addShapeBox(0F, 0F, 0F, 3, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Import LWW15
		leftWingWheelModel[14].setRotationPoint(-18.5F, 5F, -22F);

		leftWingWheelModel[15].addShapeBox(0F, 0F, 0F, 3, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Import LWW16
		leftWingWheelModel[15].setRotationPoint(25.5F, 5F, -22F);

		leftWingWheelModel[16].addShapeBox(0F, 0F, 0F, 4, 26, 2, 0F,-13F, 0F, 20F, 12F, 0F, 20F, 12F, 0F, -20F, -13F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LWW17
		leftWingWheelModel[16].setRotationPoint(-19F, -22F, -33F);

		leftWingWheelModel[17].addShapeBox(0F, 0F, 0F, 4, 26, 2, 0F,25F, 0F, 20F, -26F, 0F, 20F, -26F, 0F, -20F, 25F, 0F, -20F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LWW18
		leftWingWheelModel[17].setRotationPoint(24F, -22F, -33F);

		leftWingWheelModel[18].addShapeBox(0F, 0F, 0F, 4, 22, 2, 0F,0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 15F, 0F, 0F, 15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LWW19
		leftWingWheelModel[18].setRotationPoint(-19F, -18F, -25F);

		leftWingWheelModel[19].addShapeBox(0F, 0F, 0F, 4, 22, 2, 0F,0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 15F, 0F, 0F, 15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LWW20
		leftWingWheelModel[19].setRotationPoint(25F, -18F, -25F);

		leftWingWheelModel[20].addShapeBox(0F, 0F, 0F, 3, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, 7F); // Import LWW21
		leftWingWheelModel[20].setRotationPoint(-18.5F, -17F, -8F);

		leftWingWheelModel[21].addShapeBox(0F, 0F, 0F, 3, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, 7F); // Import LWW22
		leftWingWheelModel[21].setRotationPoint(25.5F, -17F, -8F);

		leftWingWheelModel[22].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,-45F, 0F, -15.3F, 45F, 0F, -15.3F, 45F, 0F, 14.7F, -45F, 0F, 14.7F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Import LWW23
		leftWingWheelModel[22].setRotationPoint(-18F, -18F, -24.5F);

		leftWingWheelModel[23].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,45F, 0F, -15.3F, -45F, 0F, -15.3F, -45F, 0F, 14.7F, 45F, 0F, 14.7F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Import LWW24
		leftWingWheelModel[23].setRotationPoint(27F, -18F, -24.5F);

		leftWingWheelModel[24].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Import LWW25
		leftWingWheelModel[24].setRotationPoint(-22F, 0F, -22.2F);

		leftWingWheelModel[25].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Import LWW26
		leftWingWheelModel[25].setRotationPoint(-22F, -7F, -17.4F);

		leftWingWheelModel[26].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Import LWW27
		leftWingWheelModel[26].setRotationPoint(-22F, -14F, -12.7F);
	}

	private void initrightWingWheelModel_1()
	{
		rightWingWheelModel[0] = new ModelRendererTurbo(this, 105, 201, textureX, textureY); // Import RWW01
		rightWingWheelModel[1] = new ModelRendererTurbo(this, 177, 209, textureX, textureY); // Import RWW02
		rightWingWheelModel[2] = new ModelRendererTurbo(this, 249, 209, textureX, textureY); // Import RWW03
		rightWingWheelModel[3] = new ModelRendererTurbo(this, 393, 209, textureX, textureY); // Import RWW04
		rightWingWheelModel[4] = new ModelRendererTurbo(this, 713, 209, textureX, textureY); // Import RWW05
		rightWingWheelModel[5] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Import RWW06
		rightWingWheelModel[6] = new ModelRendererTurbo(this, 409, 105, textureX, textureY); // Import RWW07
		rightWingWheelModel[7] = new ModelRendererTurbo(this, 865, 209, textureX, textureY); // Import RWW08
		rightWingWheelModel[8] = new ModelRendererTurbo(this, 937, 209, textureX, textureY); // Import RWW09
		rightWingWheelModel[9] = new ModelRendererTurbo(this, 497, 233, textureX, textureY); // Import RWW10
		rightWingWheelModel[10] = new ModelRendererTurbo(this, 641, 233, textureX, textureY); // Import RWW11
		rightWingWheelModel[11] = new ModelRendererTurbo(this, 777, 225, textureX, textureY); // Import RWW12
		rightWingWheelModel[12] = new ModelRendererTurbo(this, 977, 113, textureX, textureY); // Import RWW13
		rightWingWheelModel[13] = new ModelRendererTurbo(this, 105, 121, textureX, textureY); // Import RWW14
		rightWingWheelModel[14] = new ModelRendererTurbo(this, 449, 121, textureX, textureY); // Import RWW15
		rightWingWheelModel[15] = new ModelRendererTurbo(this, 521, 209, textureX, textureY); // Import RWW16
		rightWingWheelModel[16] = new ModelRendererTurbo(this, 601, 113, textureX, textureY); // Import RWW17
		rightWingWheelModel[17] = new ModelRendererTurbo(this, 977, 129, textureX, textureY); // Import RWW18
		rightWingWheelModel[18] = new ModelRendererTurbo(this, 993, 129, textureX, textureY); // Import RWW19
		rightWingWheelModel[19] = new ModelRendererTurbo(this, 1009, 129, textureX, textureY); // Import RWW20
		rightWingWheelModel[20] = new ModelRendererTurbo(this, 265, 113, textureX, textureY); // Import RWW21
		rightWingWheelModel[21] = new ModelRendererTurbo(this, 281, 113, textureX, textureY); // Import RWW22
		rightWingWheelModel[22] = new ModelRendererTurbo(this, 705, 137, textureX, textureY); // Import RWW23
		rightWingWheelModel[23] = new ModelRendererTurbo(this, 249, 145, textureX, textureY); // Import RWW24

		rightWingWheelModel[0].addShapeBox(0F, 0F, 0F, 18, 8, 17, 0F,0F, -4F, -6F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -4F, -6F, 0F, 0F, -4F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, -4F); // Import RWW01
		rightWingWheelModel[0].setRotationPoint(-76F, 4F, 20F);

		rightWingWheelModel[1].addShapeBox(4F, 0F, 0F, 15, 8, 17, 0F,0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 3F, 0F, 0F, 4F, 2F, 0F, 4F, 2F, 0F, 3F, 0F); // Import RWW02
		rightWingWheelModel[1].setRotationPoint(-62F, 4F, 20F);

		rightWingWheelModel[2].addShapeBox(0F, 0F, 0F, 50, 12, 19, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 1F); // Import RWW03
		rightWingWheelModel[2].setRotationPoint(-43F, 4F, 19F);

		rightWingWheelModel[3].addShapeBox(0F, 0F, 0F, 41, 11, 19, 0F,0F, 0F, -2F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, 4F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 4F, 0F); // Import RWW04
		rightWingWheelModel[3].setRotationPoint(7F, 4F, 19F);

		rightWingWheelModel[4].addShapeBox(0F, 0F, 0F, 24, 10, 13, 0F,0F, 0F, -2F, 0F, -2F, -6F, 0F, -2F, -6F, 0F, 0F, -2F, 0F, 1F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 1F, 0F); // Import RWW05
		rightWingWheelModel[4].setRotationPoint(48F, 4F, 22F);

		rightWingWheelModel[5].addShapeBox(0F, 0F, 0F, 6, 13, 1, 0F,0F, -3F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -3F, -0.25F, 0F, -3F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -3F, -0.25F); // Import RWW06
		rightWingWheelModel[5].setRotationPoint(72F, 4F, 28F);

		rightWingWheelModel[6].addShapeBox(0F, 0F, 0F, 4, 13, 1, 0F,0F, 0F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, 0F, 0F, -0.25F); // Import RWW07
		rightWingWheelModel[6].setRotationPoint(78F, 4F, 28F);

		rightWingWheelModel[7].addShapeBox(0F, 0F, 0F, 18, 8, 17, 0F,0F, 0F, -4F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -4F, -3F, -6F, -8.5F, 0F, 0F, -7F, 0F, 0F, -7F, -3F, -6F, -8.5F); // Import RWW08
		rightWingWheelModel[7].setRotationPoint(-76F, 12F, 20F);

		rightWingWheelModel[8].addShapeBox(0F, 0F, 0F, 15, 6, 17, 0F,0F, 0F, 0F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, 0F, 0F, -1F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -1F, -7F); // Import RWW09
		rightWingWheelModel[8].setRotationPoint(-58F, 15F, 20F);

		rightWingWheelModel[9].addShapeBox(0F, 0F, 0F, 50, 8, 19, 0F,0F, 0F, 1F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 1F, 0F, -3F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, -3F, -8F); // Import RWW10
		rightWingWheelModel[9].setRotationPoint(-43F, 16F, 19F);

		rightWingWheelModel[10].addShapeBox(0F, 0F, 0F, 41, 8, 19, 0F,0F, -3F, 0F, 0F, 1F, -3F, 0F, 1F, -3F, 0F, -3F, 0F, 0F, -3F, -9F, 0F, -6F, -9F, 0F, -6F, -9F, 0F, -3F, -9F); // Import RWW11
		rightWingWheelModel[10].setRotationPoint(7F, 16F, 19F);

		rightWingWheelModel[11].addShapeBox(0F, 0F, 0F, 24, 3, 13, 0F,0F, 0F, 0F, 0F, 1F, -6F, 0F, 1F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -4F, -6F, 0F, -4F, -6F, 0F, 0F, -6F); // Import RWW12
		rightWingWheelModel[11].setRotationPoint(48F, 15F, 22F);

		rightWingWheelModel[12].addTrapezoid(0F, 0F, 0F, 6, 1, 13, 0F, -0.50F, ModelRendererTurbo.MR_TOP); // Import RWW13
		rightWingWheelModel[12].setRotationPoint(-20F, 3.5F, 22F);

		rightWingWheelModel[13].addShapeBox(0F, 0F, 0F, 6, 1, 12, 0F,-0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Import RWW14
		rightWingWheelModel[13].setRotationPoint(24F, 3F, 22.5F);

		rightWingWheelModel[14].addShapeBox(0F, 0F, 0F, 3, 1, 22, 0F,0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RWW15
		rightWingWheelModel[14].setRotationPoint(-18.5F, 5F, 0F);

		rightWingWheelModel[15].addShapeBox(0F, 0F, 0F, 3, 1, 22, 0F,0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RWW16
		rightWingWheelModel[15].setRotationPoint(25.5F, 5F, 0F);

		rightWingWheelModel[16].addShapeBox(0F, 0F, 0F, 4, 26, 2, 0F,-13F, 0F, -20F, 12F, 0F, -20F, 12F, 0F, 20F, -13F, 0F, 20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RWW17
		rightWingWheelModel[16].setRotationPoint(-19F, -22F, 31F);

		rightWingWheelModel[17].addShapeBox(0F, 0F, 0F, 4, 26, 2, 0F,25F, 0F, -20F, -26F, 0F, -20F, -26F, 0F, 20F, 25F, 0F, 20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F); // Import RWW18
		rightWingWheelModel[17].setRotationPoint(24F, -22F, 31F);

		rightWingWheelModel[18].addShapeBox(0F, 0F, 0F, 4, 22, 2, 0F,0F, 0F, 15F, 0F, 0F, 15F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RWW19
		rightWingWheelModel[18].setRotationPoint(-19F, -18F, 23F);

		rightWingWheelModel[19].addShapeBox(0F, 0F, 0F, 4, 22, 2, 0F,0F, 0F, 15F, 0F, 0F, 15F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RWW20
		rightWingWheelModel[19].setRotationPoint(25F, -18F, 23F);

		rightWingWheelModel[20].addShapeBox(0F, 0F, 0F, 3, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, -7F); // Import RWW21
		rightWingWheelModel[20].setRotationPoint(-18.5F, -17F, 7F);

		rightWingWheelModel[21].addShapeBox(0F, 0F, 0F, 3, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, -7F); // Import RWW22
		rightWingWheelModel[21].setRotationPoint(25.5F, -17F, 7F);

		rightWingWheelModel[22].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,-45F, 0F, 14.7F, 45F, 0F, 14.7F, 45F, 0F, -15.3F, -45F, 0F, -15.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Import RWW23
		rightWingWheelModel[22].setRotationPoint(-18F, -18F, 23.5F);

		rightWingWheelModel[23].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,45F, 0F, 14.7F, -45F, 0F, 14.7F, -45F, 0F, -15.3F, 45F, 0F, -15.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Import RWW24
		rightWingWheelModel[23].setRotationPoint(27F, -18F, 23.5F);
	}

	private void initPropeller()
	{
		propellerModels = new ModelRendererTurbo[1][3];
		propellerModels[0] = makeProp1(-54F, -29F, 0F);
	}

	private ModelRendererTurbo[] makeProp1(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[3];
		prop[0] = new ModelRendererTurbo(this, 492, 148, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 492, 148, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 492, 148, textureX, textureY);
		prop[0].addBox(-1F, -33F, -1.5F, 2, 33, 3, 0.0F);
		prop[1].addBox(-1F, -33F, -1.5F, 2, 33, 3, 0.0F);
		prop[2].addBox(-1F, -33F, -1.5F, 2, 33, 3, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		return prop;
	}
}