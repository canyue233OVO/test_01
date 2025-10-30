//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: P26
// Model Creator: 
// Created on: 11.06.2023 - 21:50:16
// Last changed on: 11.06.2023 - 21:50:16

package com.flansmod.client.model.Taskball; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelP26 extends ModelPlane //Same as Filename
{
	int textureX = 1024;
	int textureY = 512;

	public ModelP26() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[106];
		noseModel = new ModelRendererTurbo[72];
		tailModel = new ModelRendererTurbo[37];
		leftWingModel = new ModelRendererTurbo[55];
		rightWingModel = new ModelRendererTurbo[56];
		yawFlapModel = new ModelRendererTurbo[12];
		pitchFlapLeftModel = new ModelRendererTurbo[4];
		pitchFlapRightModel = new ModelRendererTurbo[4];
		pitchFlapLeftWingModel = new ModelRendererTurbo[4];
		pitchFlapRightWingModel = new ModelRendererTurbo[4];

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

		initPropeller();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 10
		bodyModel[11] = new ModelRendererTurbo(this, 665, 1, textureX, textureY); // Box 15
		bodyModel[12] = new ModelRendererTurbo(this, 721, 1, textureX, textureY); // Box 16
		bodyModel[13] = new ModelRendererTurbo(this, 881, 1, textureX, textureY); // Box 18
		bodyModel[14] = new ModelRendererTurbo(this, 937, 1, textureX, textureY); // Box 19
		bodyModel[15] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 21
		bodyModel[16] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 22
		bodyModel[17] = new ModelRendererTurbo(this, 985, 1, textureX, textureY); // Box 24
		bodyModel[18] = new ModelRendererTurbo(this, 601, 17, textureX, textureY); // Box 25
		bodyModel[19] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 26
		bodyModel[20] = new ModelRendererTurbo(this, 601, 1, textureX, textureY); // Box 54
		bodyModel[21] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 55
		bodyModel[22] = new ModelRendererTurbo(this, 513, 1, textureX, textureY); // Box 56
		bodyModel[23] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 57
		bodyModel[24] = new ModelRendererTurbo(this, 161, 41, textureX, textureY); // Box 58
		bodyModel[25] = new ModelRendererTurbo(this, 705, 1, textureX, textureY); // Box 59
		bodyModel[26] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 60
		bodyModel[27] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 61
		bodyModel[28] = new ModelRendererTurbo(this, 153, 89, textureX, textureY); // Box 120
		bodyModel[29] = new ModelRendererTurbo(this, 545, 89, textureX, textureY); // Box 137
		bodyModel[30] = new ModelRendererTurbo(this, 601, 89, textureX, textureY); // Box 138
		bodyModel[31] = new ModelRendererTurbo(this, 657, 89, textureX, textureY); // Box 139
		bodyModel[32] = new ModelRendererTurbo(this, 713, 89, textureX, textureY); // Box 140
		bodyModel[33] = new ModelRendererTurbo(this, 777, 89, textureX, textureY); // Box 141
		bodyModel[34] = new ModelRendererTurbo(this, 873, 89, textureX, textureY); // Box 142
		bodyModel[35] = new ModelRendererTurbo(this, 921, 89, textureX, textureY); // Box 143
		bodyModel[36] = new ModelRendererTurbo(this, 33, 97, textureX, textureY); // Box 144
		bodyModel[37] = new ModelRendererTurbo(this, 817, 89, textureX, textureY); // Box 145
		bodyModel[38] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // Box 146
		bodyModel[39] = new ModelRendererTurbo(this, 977, 25, textureX, textureY); // Box 147
		bodyModel[40] = new ModelRendererTurbo(this, 545, 105, textureX, textureY); // Box 152
		bodyModel[41] = new ModelRendererTurbo(this, 601, 105, textureX, textureY); // Box 153
		bodyModel[42] = new ModelRendererTurbo(this, 449, 113, textureX, textureY); // Box 155
		bodyModel[43] = new ModelRendererTurbo(this, 761, 113, textureX, textureY); // Box 156
		bodyModel[44] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 158
		bodyModel[45] = new ModelRendererTurbo(this, 57, 121, textureX, textureY); // Box 159
		bodyModel[46] = new ModelRendererTurbo(this, 161, 105, textureX, textureY); // Box 161
		bodyModel[47] = new ModelRendererTurbo(this, 105, 129, textureX, textureY); // Box 162
		bodyModel[48] = new ModelRendererTurbo(this, 361, 129, textureX, textureY); // Box 163
		bodyModel[49] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 191
		bodyModel[50] = new ModelRendererTurbo(this, 617, 1, textureX, textureY); // Box 192
		bodyModel[51] = new ModelRendererTurbo(this, 569, 1, textureX, textureY); // Box 193
		bodyModel[52] = new ModelRendererTurbo(this, 649, 105, textureX, textureY); // Box 194
		bodyModel[53] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 195
		bodyModel[54] = new ModelRendererTurbo(this, 705, 57, textureX, textureY); // Box 196
		bodyModel[55] = new ModelRendererTurbo(this, 873, 113, textureX, textureY); // Box 197
		bodyModel[56] = new ModelRendererTurbo(this, 217, 129, textureX, textureY); // Box 198
		bodyModel[57] = new ModelRendererTurbo(this, 753, 185, textureX, textureY); // Box 255
		bodyModel[58] = new ModelRendererTurbo(this, 1017, 49, textureX, textureY); // Box 272
		bodyModel[59] = new ModelRendererTurbo(this, 297, 105, textureX, textureY); // Box 280
		bodyModel[60] = new ModelRendererTurbo(this, 937, 41, textureX, textureY); // Box 281
		bodyModel[61] = new ModelRendererTurbo(this, 321, 129, textureX, textureY); // Box 558
		bodyModel[62] = new ModelRendererTurbo(this, 137, 193, textureX, textureY); // Box 559
		bodyModel[63] = new ModelRendererTurbo(this, 313, 193, textureX, textureY); // Box 560
		bodyModel[64] = new ModelRendererTurbo(this, 513, 193, textureX, textureY); // Box 503
		bodyModel[65] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 286
		bodyModel[66] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 287
		bodyModel[67] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 288
		bodyModel[68] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 289
		bodyModel[69] = new ModelRendererTurbo(this, 945, 1, textureX, textureY); // Box 592
		bodyModel[70] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Import 
		bodyModel[71] = new ModelRendererTurbo(this, 1017, 17, textureX, textureY); // Box 905
		bodyModel[72] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 906
		bodyModel[73] = new ModelRendererTurbo(this, 545, 25, textureX, textureY); // Box 444
		bodyModel[74] = new ModelRendererTurbo(this, 593, 25, textureX, textureY); // Box 445
		bodyModel[75] = new ModelRendererTurbo(this, 561, 193, textureX, textureY); // Box 638
		bodyModel[76] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Box 639
		bodyModel[77] = new ModelRendererTurbo(this, 585, 73, textureX, textureY); // Box 640
		bodyModel[78] = new ModelRendererTurbo(this, 145, 169, textureX, textureY); // Box 641
		bodyModel[79] = new ModelRendererTurbo(this, 313, 169, textureX, textureY); // Box 642
		bodyModel[80] = new ModelRendererTurbo(this, 801, 57, textureX, textureY); // Box 643
		bodyModel[81] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 644
		bodyModel[82] = new ModelRendererTurbo(this, 73, 81, textureX, textureY); // Box 645
		bodyModel[83] = new ModelRendererTurbo(this, 657, 1, textureX, textureY); // Box 646
		bodyModel[84] = new ModelRendererTurbo(this, 673, 1, textureX, textureY); // Box 210
		bodyModel[85] = new ModelRendererTurbo(this, 617, 193, textureX, textureY); // Box 211
		bodyModel[86] = new ModelRendererTurbo(this, 41, 121, textureX, textureY); // Box 212
		bodyModel[87] = new ModelRendererTurbo(this, 649, 193, textureX, textureY); // Box 214
		bodyModel[88] = new ModelRendererTurbo(this, 553, 25, textureX, textureY); // Box 675
		bodyModel[89] = new ModelRendererTurbo(this, 929, 25, textureX, textureY); // Box 676
		bodyModel[90] = new ModelRendererTurbo(this, 553, 33, textureX, textureY); // Box 677
		bodyModel[91] = new ModelRendererTurbo(this, 1001, 33, textureX, textureY); // Box 400
		bodyModel[92] = new ModelRendererTurbo(this, 1017, 33, textureX, textureY); // Box 401
		bodyModel[93] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 402
		bodyModel[94] = new ModelRendererTurbo(this, 561, 9, textureX, textureY); // Box 415
		bodyModel[95] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 416
		bodyModel[96] = new ModelRendererTurbo(this, 881, 9, textureX, textureY); // Box 417
		bodyModel[97] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Box 227
		bodyModel[98] = new ModelRendererTurbo(this, 777, 41, textureX, textureY); // Box 228
		bodyModel[99] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 229
		bodyModel[100] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Box 230
		bodyModel[101] = new ModelRendererTurbo(this, 537, 49, textureX, textureY); // Box 231
		bodyModel[102] = new ModelRendererTurbo(this, 849, 49, textureX, textureY); // Box 232
		bodyModel[103] = new ModelRendererTurbo(this, 817, 41, textureX, textureY); // Box 352
		bodyModel[104] = new ModelRendererTurbo(this, 65, 193, textureX, textureY); // Box 353
		bodyModel[105] = new ModelRendererTurbo(this, 257, 89, textureX, textureY); // Box 354

		bodyModel[0].addShapeBox(0F, 0F, 0F, 20, 8, 5, 0F,0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-41F, -36F, -13F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 20, 5, 6, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 1
		bodyModel[1].setRotationPoint(-41F, -41F, -12F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 20, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[2].setRotationPoint(-41F, -28F, -13F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 20, 5, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 1F, -4F, 0F, 3F, 0F, 0F, 2F, 0F); // Box 3
		bodyModel[3].setRotationPoint(-41F, -20F, -11F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 11, 8, 13, 0F,0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[4].setRotationPoint(-52F, -36F, -13F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 11, 5, 11, 0F,0F, -2F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 5
		bodyModel[5].setRotationPoint(-52F, -41F, -11F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 11, 8, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 6
		bodyModel[6].setRotationPoint(-52F, -28F, -13F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 11, 5, 11, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, -4F, 0F, 0F, -4F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[7].setRotationPoint(-52F, -20F, -11F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 11, 2, 7, 0F,0F, -1.9999F, -6.9999F, 0F, 0F, -2.9999F, 0F, 0F, 0F, 0F, -1.9999F, 0F, 0F, 1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.9999F, 0F); // Box 8
		bodyModel[8].setRotationPoint(-52F, -43F, -7F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 9, 2, 4, 0F,0F, 0F, -2.9999F, 0F, -1.9999F, 0F, 0F, -1.9999F, -2.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.9999F, 0F, 0F, -2.9999F); // Box 9
		bodyModel[9].setRotationPoint(-41F, -43F, -7F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, -2.9999F, 0F, 0F, 0F, -2.9999F, 0F, 0F, 0F, 0F, -2.9999F, -2.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.9999F, 0F, 0F, -2.9999F); // Box 10
		bodyModel[10].setRotationPoint(-25F, -44F, -7F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 12, 8, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[11].setRotationPoint(-21F, -28F, -13F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 16, 8, 13, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -3F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[12].setRotationPoint(-9F, -28F, -13F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 12, 8, 13, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[13].setRotationPoint(-21F, -36F, -13F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 16, 8, 13, 0F,0F, 0F, -1F, 0F, -1F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[14].setRotationPoint(-9F, -36F, -13F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 12, 5, 12, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[15].setRotationPoint(-21F, -41F, -12F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 16, 5, 12, 0F,0F, 0F, -5F, 0F, -1F, -6F, 0F, 2F, 0F, 0F, 3F, -2F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, 0F, 0F, 0F, -2F); // Box 22
		bodyModel[16].setRotationPoint(-9F, -41F, -12F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 12, 3, 7, 0F,0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[17].setRotationPoint(-21F, -44F, -7F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 12, 6, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 25
		bodyModel[18].setRotationPoint(-21F, -20F, -11F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 16, 6, 11, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, -5F, 0F, 1F, 0F, 0F, 2F, 0F); // Box 26
		bodyModel[19].setRotationPoint(-9F, -20F, -11F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[20].setRotationPoint(-41F, -43F, -4F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[21].setRotationPoint(-34F, -48F, -4F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 3F, 2F, 0F, 3F, 2F, 0F, -3F, -2F, 0F, -3F); // Box 56
		bodyModel[22].setRotationPoint(-34F, -48F, -4F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 12, 2, 4, 0F,0F, 0F, 0F, 0F, -1.9999F, -1.9999F, 0F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[23].setRotationPoint(-21F, -46F, -4F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 12, 5, 4, 0F,-2F, 1F, 0F, 0F, -3F, -2F, 0F, -3F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, 2F, -2F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[24].setRotationPoint(-21F, -51F, -4F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F,0F, 0F, -1.5F, 0F, -4F, -2.5F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 4F, -2F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[25].setRotationPoint(-19F, -53F, -4F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 16, 4, 2, 0F,0F, 0F, 0F, 0F, -4.9999F, -1.9999F, 0F, -4.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.9999F, -1.9999F, 0F, 0.9999F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[26].setRotationPoint(-9F, -48F, -2F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 16, 4, 2, 0F,0F, 0F, -0.5F, 0F, -5.9999F, -1.9999F, 0F, -5.9999F, 0F, 0F, 0.9999F, 0F, 0F, -2.9999F, 0F, 0F, 1.9999F, -1.9999F, 0F, 1.9999F, 0F, 0F, -2.9999F, 0F); // Box 61
		bodyModel[27].setRotationPoint(-9F, -49F, -2F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 20, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[28].setRotationPoint(-41F, -25F, -8F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 20, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
		bodyModel[29].setRotationPoint(-41F, -36F, 8F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 20, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 138
		bodyModel[30].setRotationPoint(-41F, -41F, 6F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 20, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 139
		bodyModel[31].setRotationPoint(-41F, -28F, 8F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 20, 5, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 3F, 0F, 0F, 1F, -4F, 0F, 0F, -4F); // Box 140
		bodyModel[32].setRotationPoint(-41F, -20F, 0F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 11, 8, 13, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[33].setRotationPoint(-52F, -36F, 0F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 11, 5, 11, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -2F, -4F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 142
		bodyModel[34].setRotationPoint(-52F, -41F, 0F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 11, 8, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -2F); // Box 143
		bodyModel[35].setRotationPoint(-52F, -28F, 0F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 11, 5, 11, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, -4F, 0F, -2F, -4F); // Box 144
		bodyModel[36].setRotationPoint(-52F, -20F, 0F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 11, 2, 7, 0F,0F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, -2.9999F, 0F, -1.9999F, -6.9999F, 0F, 1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.9999F, 0F); // Box 145
		bodyModel[37].setRotationPoint(-52F, -43F, 0F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 9, 2, 4, 0F,0F, 0F, 0F, 0F, -1.9999F, -2.9999F, 0F, -1.9999F, 0F, 0F, 0F, -2.9999F, 0F, 0F, -2.9999F, 0F, 0F, -2.9999F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[38].setRotationPoint(-41F, -43F, 3F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, -2.9999F, -2.9999F, 0F, 0F, 0F, 0F, 0F, -2.9999F, 0F, -2.9999F, 0F, 0F, 0F, -2.9999F, 0F, 0F, -2.9999F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[39].setRotationPoint(-25F, -44F, 3F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 12, 8, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 152
		bodyModel[40].setRotationPoint(-21F, -28F, 0F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 16, 8, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -3F, 0F, 0F, -2F); // Box 153
		bodyModel[41].setRotationPoint(-9F, -28F, 0F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 12, 8, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[42].setRotationPoint(-21F, -36F, 0F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 16, 8, 13, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 156
		bodyModel[43].setRotationPoint(-9F, -36F, 0F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 12, 5, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		bodyModel[44].setRotationPoint(-21F, -41F, 0F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 16, 5, 12, 0F,0F, 3F, -2F, 0F, 2F, 0F, 0F, -1F, -6F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, 1F, 0F, 0F, 1F, -2F, 0F, 0F, 0F); // Box 159
		bodyModel[45].setRotationPoint(-9F, -41F, 0F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 12, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[46].setRotationPoint(-21F, -44F, 0F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 12, 6, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 162
		bodyModel[47].setRotationPoint(-21F, -20F, 0F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 16, 6, 11, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, -1F, -5F, 0F, 0F, -4F); // Box 163
		bodyModel[48].setRotationPoint(-9F, -20F, 0F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 191
		bodyModel[49].setRotationPoint(-41F, -43F, 3F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 192
		bodyModel[50].setRotationPoint(-34F, -48F, 0F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 3F, -2F, 0F, 3F); // Box 193
		bodyModel[51].setRotationPoint(-34F, -48F, 3F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 12, 2, 4, 0F,0F, 0F, 0F, 0F, -1.9999F, 0F, 0F, -1.9999F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9999F, 0F, 0F, 0F); // Box 194
		bodyModel[52].setRotationPoint(-21F, -46F, 0F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 12, 5, 4, 0F,-2F, 1F, 0F, 0F, -3F, 0F, 0F, -3F, -2F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -2F, 0F, 0F, 0F); // Box 195
		bodyModel[53].setRotationPoint(-21F, -51F, 0F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F,0F, 1F, 0F, 0F, -3F, 0F, 0F, -4F, -2.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, -2F, 0F, 0F, 0F); // Box 196
		bodyModel[54].setRotationPoint(-19F, -53F, 0F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 16, 4, 2, 0F,0F, 0F, 0F, 0F, -4.9999F, 0F, 0F, -4.9999F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.9999F, 0F, 0F, 0.9999F, -1.9999F, 0F, 0F, 0F); // Box 197
		bodyModel[55].setRotationPoint(-9F, -48F, 0F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 16, 4, 2, 0F,0F, 0.9999F, 0F, 0F, -5.9999F, 0F, 0F, -5.9999F, -1.9999F, 0F, 0F, -0.5F, 0F, -2.9999F, 0F, 0F, 1.9999F, 0F, 0F, 1.9999F, -1.9999F, 0F, -2.9999F, 0F); // Box 198
		bodyModel[56].setRotationPoint(-9F, -49F, 0F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 20, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 255
		bodyModel[57].setRotationPoint(-41F, -25F, 0F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		bodyModel[58].setRotationPoint(-46F, -62F, 3F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 2, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 280
		bodyModel[59].setRotationPoint(-21F, -52F, -3F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		bodyModel[60].setRotationPoint(-21F, -53F, -3F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 23, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 558
		bodyModel[61].setRotationPoint(-62F, -47F, -1F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 23, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 559
		bodyModel[62].setRotationPoint(-62F, -46F, -1F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 23, 2, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F); // Box 560
		bodyModel[63].setRotationPoint(-62F, -47F, -1F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 23, 2, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F); // Box 503
		bodyModel[64].setRotationPoint(-62F, -47F, 0.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 286
		bodyModel[65].setRotationPoint(-57F, -42F, -0.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 287
		bodyModel[66].setRotationPoint(-57F, -45F, -0.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 288
		bodyModel[67].setRotationPoint(-48F, -43F, -0.5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 289
		bodyModel[68].setRotationPoint(-48F, -45F, -0.5F);

		bodyModel[69].addShapeBox(-0.5F, 0F, -0.5F, 1, 4, 1, 0F,-1.2F, 0F, -0.2F, 0.8F, 0F, -0.2F, 0.8F, 0F, -0.2F, -1.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 592
		bodyModel[69].setRotationPoint(-37.5F, -34.5F, 0F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import 
		bodyModel[70].setRotationPoint(-38F, -26F, -1F);

		bodyModel[71].addShapeBox(0F, -1F, 0F, 1, 1, 2, 0F,0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Box 905
		bodyModel[71].setRotationPoint(-41F, -27.5F, -4F);
		bodyModel[71].rotateAngleZ = 0.41887903F;

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Box 906
		bodyModel[72].setRotationPoint(-41F, -27.5F, -4F);
		bodyModel[72].rotateAngleZ = 0.41887903F;

		bodyModel[73].addShapeBox(0F, -1F, 0F, 1, 1, 2, 0F,0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Box 444
		bodyModel[73].setRotationPoint(-41F, -27.5F, 2F);
		bodyModel[73].rotateAngleZ = 0.41887903F;

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Box 445
		bodyModel[74].setRotationPoint(-41F, -27.5F, 2F);
		bodyModel[74].rotateAngleZ = 0.41887903F;

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 15, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 638
		bodyModel[75].setRotationPoint(-21.5F, -43.5F, -4F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F); // Box 639
		bodyModel[76].setRotationPoint(-23.5F, -28.5F, -6F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -1F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F); // Box 640
		bodyModel[77].setRotationPoint(-26.5F, -26.5F, -6F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 641
		bodyModel[78].setRotationPoint(-32.5F, -25.5F, -6F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 642
		bodyModel[79].setRotationPoint(-35.5F, -27.5F, -6F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 7, 4, 1, 0F,4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F); // Box 643
		bodyModel[80].setRotationPoint(-30.5F, -28.5F, -6F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F); // Box 644
		bodyModel[81].setRotationPoint(-35.5F, -28.5F, -6F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F); // Box 645
		bodyModel[82].setRotationPoint(-30.5F, -28.5F, 5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F); // Box 646
		bodyModel[83].setRotationPoint(-35.5F, -28.5F, 5F);

		bodyModel[84].addShapeBox(-0.5F, 0F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		bodyModel[84].setRotationPoint(-36.5F, -37.5F, 0F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 3, 5, 11, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
		bodyModel[85].setRotationPoint(-41F, -40F, -11F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 3, 3, 8, 0F,0F, 0F, -4F, 0F, -0.25F, -4.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 212
		bodyModel[86].setRotationPoint(-41F, -43F, -8F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 3, 5, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 214
		bodyModel[87].setRotationPoint(-41F, -40F, 0F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 675
		bodyModel[88].setRotationPoint(-38.75F, -40.5F, 2.5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 676
		bodyModel[89].setRotationPoint(-38.75F, -40F, 2.5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 677
		bodyModel[90].setRotationPoint(-38.75F, -40F, 2.5F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 400
		bodyModel[91].setRotationPoint(-38.75F, -40.5F, -4F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 401
		bodyModel[92].setRotationPoint(-38.75F, -40F, -4F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 402
		bodyModel[93].setRotationPoint(-38.75F, -40F, -4F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 415
		bodyModel[94].setRotationPoint(-38.75F, -41.5F, -1.25F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 416
		bodyModel[95].setRotationPoint(-38.75F, -41F, -1.25F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 417
		bodyModel[96].setRotationPoint(-38.75F, -40F, -1.25F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 227
		bodyModel[97].setRotationPoint(-38.75F, -38.5F, 1.5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 228
		bodyModel[98].setRotationPoint(-38.75F, -38F, 1.5F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 229
		bodyModel[99].setRotationPoint(-38.75F, -38F, 1.5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 230
		bodyModel[100].setRotationPoint(-38.75F, -38.5F, -3.5F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 231
		bodyModel[101].setRotationPoint(-38.75F, -38F, -3.5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 232
		bodyModel[102].setRotationPoint(-38.75F, -38F, -3.5F);

		bodyModel[103].addShapeBox(-0.5F, 0F, -0.5F, 1, 5, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 352
		bodyModel[103].setRotationPoint(-37.5F, -30.5F, 0F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 3, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -4.25F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 353
		bodyModel[104].setRotationPoint(-41F, -43F, 0F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 354
		bodyModel[105].setRotationPoint(-21.5F, -49F, -2.5F);
	}

	private void initnoseModel_1()
	{
		noseModel[0] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 11
		noseModel[1] = new ModelRendererTurbo(this, 513, 1, textureX, textureY); // Box 12
		noseModel[2] = new ModelRendererTurbo(this, 561, 1, textureX, textureY); // Box 13
		noseModel[3] = new ModelRendererTurbo(this, 617, 1, textureX, textureY); // Box 14
		noseModel[4] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 32
		noseModel[5] = new ModelRendererTurbo(this, 545, 25, textureX, textureY); // Box 33
		noseModel[6] = new ModelRendererTurbo(this, 849, 25, textureX, textureY); // Box 34
		noseModel[7] = new ModelRendererTurbo(this, 993, 17, textureX, textureY); // Box 35
		noseModel[8] = new ModelRendererTurbo(this, 897, 25, textureX, textureY); // Box 36
		noseModel[9] = new ModelRendererTurbo(this, 929, 25, textureX, textureY); // Box 37
		noseModel[10] = new ModelRendererTurbo(this, 953, 25, textureX, textureY); // Box 38
		noseModel[11] = new ModelRendererTurbo(this, 977, 33, textureX, textureY); // Box 39
		noseModel[12] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 40
		noseModel[13] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 41
		noseModel[14] = new ModelRendererTurbo(this, 705, 33, textureX, textureY); // Box 42
		noseModel[15] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 43
		noseModel[16] = new ModelRendererTurbo(this, 577, 25, textureX, textureY); // Box 44
		noseModel[17] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 45
		noseModel[18] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 46
		noseModel[19] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 47
		noseModel[20] = new ModelRendererTurbo(this, 1001, 33, textureX, textureY); // Box 48
		noseModel[21] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 49
		noseModel[22] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 50
		noseModel[23] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 51
		noseModel[24] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 52
		noseModel[25] = new ModelRendererTurbo(this, 553, 1, textureX, textureY); // Box 53
		noseModel[26] = new ModelRendererTurbo(this, 81, 97, textureX, textureY); // Box 148
		noseModel[27] = new ModelRendererTurbo(this, 457, 97, textureX, textureY); // Box 149
		noseModel[28] = new ModelRendererTurbo(this, 121, 105, textureX, textureY); // Box 150
		noseModel[29] = new ModelRendererTurbo(this, 977, 97, textureX, textureY); // Box 151
		noseModel[30] = new ModelRendererTurbo(this, 489, 97, textureX, textureY); // Box 169
		noseModel[31] = new ModelRendererTurbo(this, 785, 137, textureX, textureY); // Box 170
		noseModel[32] = new ModelRendererTurbo(this, 897, 137, textureX, textureY); // Box 171
		noseModel[33] = new ModelRendererTurbo(this, 217, 89, textureX, textureY); // Box 172
		noseModel[34] = new ModelRendererTurbo(this, 945, 137, textureX, textureY); // Box 173
		noseModel[35] = new ModelRendererTurbo(this, 281, 89, textureX, textureY); // Box 174
		noseModel[36] = new ModelRendererTurbo(this, 321, 89, textureX, textureY); // Box 175
		noseModel[37] = new ModelRendererTurbo(this, 273, 113, textureX, textureY); // Box 176
		noseModel[38] = new ModelRendererTurbo(this, 137, 137, textureX, textureY); // Box 177
		noseModel[39] = new ModelRendererTurbo(this, 473, 137, textureX, textureY); // Box 178
		noseModel[40] = new ModelRendererTurbo(this, 217, 105, textureX, textureY); // Box 179
		noseModel[41] = new ModelRendererTurbo(this, 849, 97, textureX, textureY); // Box 180
		noseModel[42] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 181
		noseModel[43] = new ModelRendererTurbo(this, 393, 105, textureX, textureY); // Box 182
		noseModel[44] = new ModelRendererTurbo(this, 769, 89, textureX, textureY); // Box 183
		noseModel[45] = new ModelRendererTurbo(this, 913, 89, textureX, textureY); // Box 184
		noseModel[46] = new ModelRendererTurbo(this, 825, 105, textureX, textureY); // Box 185
		noseModel[47] = new ModelRendererTurbo(this, 169, 121, textureX, textureY); // Box 186
		noseModel[48] = new ModelRendererTurbo(this, 1001, 129, textureX, textureY); // Box 187
		noseModel[49] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 188
		noseModel[50] = new ModelRendererTurbo(this, 545, 17, textureX, textureY); // Box 189
		noseModel[51] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Box 190
		noseModel[52] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Import Box0
		noseModel[53] = new ModelRendererTurbo(this, 649, 57, textureX, textureY); // Box 242
		noseModel[54] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 243
		noseModel[55] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 244
		noseModel[56] = new ModelRendererTurbo(this, 921, 1, textureX, textureY); // Box 245
		noseModel[57] = new ModelRendererTurbo(this, 361, 49, textureX, textureY); // Box 246
		noseModel[58] = new ModelRendererTurbo(this, 425, 41, textureX, textureY); // Box 247
		noseModel[59] = new ModelRendererTurbo(this, 529, 41, textureX, textureY); // Box 248
		noseModel[60] = new ModelRendererTurbo(this, 641, 41, textureX, textureY); // Box 249
		noseModel[61] = new ModelRendererTurbo(this, 985, 1, textureX, textureY); // Box 223
		noseModel[62] = new ModelRendererTurbo(this, 1009, 73, textureX, textureY); // Box 224
		noseModel[63] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 225
		noseModel[64] = new ModelRendererTurbo(this, 201, 105, textureX, textureY); // Box 226
		noseModel[65] = new ModelRendererTurbo(this, 193, 121, textureX, textureY); // Box 227
		noseModel[66] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 228
		noseModel[67] = new ModelRendererTurbo(this, 1009, 177, textureX, textureY); // Box 229
		noseModel[68] = new ModelRendererTurbo(this, 817, 185, textureX, textureY); // Box 230
		noseModel[69] = new ModelRendererTurbo(this, 833, 185, textureX, textureY); // Box 231
		noseModel[70] = new ModelRendererTurbo(this, 969, 185, textureX, textureY); // Box 232
		noseModel[71] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 233

		noseModel[0].addShapeBox(0F, 0F, 0F, 11, 7, 13, 0F,0F, -2F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		noseModel[0].setRotationPoint(-63F, -35F, -13F);

		noseModel[1].addShapeBox(0F, 0F, 0F, 11, 4, 11, 0F,0F, -3F, -5F, 0F, 0F, -4F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 12
		noseModel[1].setRotationPoint(-63F, -39F, -11F);

		noseModel[2].addShapeBox(0F, 0F, 0F, 11, 7, 13, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 13
		noseModel[2].setRotationPoint(-63F, -28F, -13F);

		noseModel[3].addShapeBox(0F, 0F, 0F, 11, 4, 11, 0F,0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -3F, -5F, 0F, 0F, -4F, 0F, 2F, 0F, 0F, -1F, 0F); // Box 14
		noseModel[3].setRotationPoint(-63F, -21F, -11F);

		noseModel[4].addShapeBox(0F, 0F, 0F, 7, 8, 16, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		noseModel[4].setRotationPoint(-72F, -36F, -16F);

		noseModel[5].addShapeBox(0F, 0F, 0F, 7, 8, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		noseModel[5].setRotationPoint(-72F, -28F, -16F);

		noseModel[6].addShapeBox(0F, 0F, 0F, 7, 6, 14, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		noseModel[6].setRotationPoint(-72F, -42F, -14F);

		noseModel[7].addShapeBox(0F, 0F, 0F, 7, 2, 8, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		noseModel[7].setRotationPoint(-72F, -44F, -8F);

		noseModel[8].addShapeBox(0F, 0F, 0F, 7, 6, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		noseModel[8].setRotationPoint(-72F, -20F, -14F);

		noseModel[9].addShapeBox(0F, 0F, 0F, 7, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		noseModel[9].setRotationPoint(-72F, -14F, -8F);

		noseModel[10].addShapeBox(0F, 0F, 0F, 2, 6, 14, 0F,0F, 0F, -6F, 0F, -6F, -8F, 0F, -4F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 3F, -5F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 38
		noseModel[10].setRotationPoint(-65F, -42F, -14F);

		noseModel[11].addShapeBox(0F, 0F, 0F, 2, 8, 16, 0F,0F, 0F, -2F, 0F, -3F, -7F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		noseModel[11].setRotationPoint(-65F, -36F, -16F);

		noseModel[12].addShapeBox(0F, 0F, 0F, 2, 8, 16, 0F,0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, -7F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 40
		noseModel[12].setRotationPoint(-65F, -28F, -16F);

		noseModel[13].addShapeBox(0F, 0F, 0F, 2, 6, 14, 0F,0F, 0F, 0F, 0F, 3F, -5F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -6F, -8F, 0F, -4F, 0F, 0F, 2F, 0F); // Box 41
		noseModel[13].setRotationPoint(-65F, -20F, -14F);

		noseModel[14].addShapeBox(0F, 0F, 0F, 2, 6, 10, 0F,0F, -1F, -8F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 1F, -6F); // Box 42
		noseModel[14].setRotationPoint(-74F, -42F, -14F);

		noseModel[15].addShapeBox(0F, 0F, 0F, 2, 8, 6, 0F,0F, -1F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 43
		noseModel[15].setRotationPoint(-74F, -36F, -16F);

		noseModel[16].addShapeBox(0F, 0F, 0F, 2, 8, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 44
		noseModel[16].setRotationPoint(-74F, -28F, -16F);

		noseModel[17].addShapeBox(0F, 0F, 0F, 2, 6, 10, 0F,0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 1F, -6F, 0F, -1F, -8F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 45
		noseModel[17].setRotationPoint(-74F, -20F, -14F);

		noseModel[18].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F,0F, -3F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 3F, -2F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 46
		noseModel[18].setRotationPoint(-74F, -44F, -8F);

		noseModel[19].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F,0F, 3F, -2F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -3F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 47
		noseModel[19].setRotationPoint(-74F, -14F, -8F);

		noseModel[20].addShapeBox(0F, 0F, 0F, 2, 6, 8, 0F,0F, -2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 48
		noseModel[20].setRotationPoint(-74F, -31F, -8F);

		noseModel[21].addShapeBox(0F, 0F, 0F, 2, 6, 8, 0F,0F, -2F, -6F, 0F, 1F, -3F, 0F, 3F, 0F, 0F, -1F, 0F, 0F, -2F, -4F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -2F, 0F); // Box 49
		noseModel[21].setRotationPoint(-74F, -33F, -8F);

		noseModel[22].addShapeBox(0F, 0F, 0F, 2, 6, 8, 0F,0F, -2F, -4F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, -2F, -6F, 0F, 1F, -3F, 0F, 3F, 0F, 0F, -1F, 0F); // Box 50
		noseModel[22].setRotationPoint(-74F, -29F, -8F);

		noseModel[23].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, 3F, 2F, 0F, 3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, -2F, 0F, 0F, 0F); // Box 51
		noseModel[23].setRotationPoint(-64F, -40F, -4F);

		noseModel[24].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, 3F, 2F, 0F, 3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, -2F, 0F, 0F, 0F); // Box 52
		noseModel[24].setRotationPoint(-64F, -27F, -12F);

		noseModel[25].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 2F, 0F, 3F, -2F, 0F, 0F, 0F); // Box 53
		noseModel[25].setRotationPoint(-64F, -18F, -4F);

		noseModel[26].addShapeBox(0F, 0F, 0F, 11, 7, 13, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 148
		noseModel[26].setRotationPoint(-63F, -35F, 0F);

		noseModel[27].addShapeBox(0F, 0F, 0F, 11, 4, 11, 0F,0F, -1F, 0F, 0F, 2F, 0F, 0F, 0F, -4F, 0F, -3F, -5F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -2F); // Box 149
		noseModel[27].setRotationPoint(-63F, -39F, 0F);

		noseModel[28].addShapeBox(0F, 0F, 0F, 11, 7, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -4F); // Box 150
		noseModel[28].setRotationPoint(-63F, -28F, 0F);

		noseModel[29].addShapeBox(0F, 0F, 0F, 11, 4, 11, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -2F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 0F, -4F, 0F, -3F, -5F); // Box 151
		noseModel[29].setRotationPoint(-63F, -21F, 0F);

		noseModel[30].addShapeBox(0F, 0F, 0F, 7, 8, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		noseModel[30].setRotationPoint(-72F, -36F, 0F);

		noseModel[31].addShapeBox(0F, 0F, 0F, 7, 8, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 170
		noseModel[31].setRotationPoint(-72F, -28F, 0F);

		noseModel[32].addShapeBox(0F, 0F, 0F, 7, 6, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		noseModel[32].setRotationPoint(-72F, -42F, 0F);

		noseModel[33].addShapeBox(0F, 0F, 0F, 7, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
		noseModel[33].setRotationPoint(-72F, -44F, 0F);

		noseModel[34].addShapeBox(0F, 0F, 0F, 7, 6, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F); // Box 173
		noseModel[34].setRotationPoint(-72F, -20F, 0F);

		noseModel[35].addShapeBox(0F, 0F, 0F, 7, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 174
		noseModel[35].setRotationPoint(-72F, -14F, 0F);

		noseModel[36].addShapeBox(0F, 0F, 0F, 2, 6, 14, 0F,0F, 2F, 0F, 0F, -4F, 0F, 0F, -6F, -8F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, -5F, 0F, 0F, 0F); // Box 175
		noseModel[36].setRotationPoint(-65F, -42F, 0F);

		noseModel[37].addShapeBox(0F, 0F, 0F, 2, 8, 16, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -7F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 176
		noseModel[37].setRotationPoint(-65F, -36F, 0F);

		noseModel[38].addShapeBox(0F, 0F, 0F, 2, 8, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -7F, 0F, 0F, -2F); // Box 177
		noseModel[38].setRotationPoint(-65F, -28F, 0F);

		noseModel[39].addShapeBox(0F, 0F, 0F, 2, 6, 14, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, -5F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -4F, 0F, 0F, -6F, -8F, 0F, 0F, -6F); // Box 178
		noseModel[39].setRotationPoint(-65F, -20F, 0F);

		noseModel[40].addShapeBox(0F, 0F, 0F, 2, 6, 10, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -1F, -8F, 0F, 1F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 1F, -2F); // Box 179
		noseModel[40].setRotationPoint(-74F, -42F, 4F);

		noseModel[41].addShapeBox(0F, 0F, 0F, 2, 8, 6, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 180
		noseModel[41].setRotationPoint(-74F, -36F, 10F);

		noseModel[42].addShapeBox(0F, 0F, 0F, 2, 8, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -4F); // Box 181
		noseModel[42].setRotationPoint(-74F, -28F, 10F);

		noseModel[43].addShapeBox(0F, 0F, 0F, 2, 6, 10, 0F,0F, 1F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -1F, -8F); // Box 182
		noseModel[43].setRotationPoint(-74F, -20F, 4F);

		noseModel[44].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 3F, -2F); // Box 183
		noseModel[44].setRotationPoint(-74F, -44F, 0F);

		noseModel[45].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 3F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, -2F); // Box 184
		noseModel[45].setRotationPoint(-74F, -14F, 0F);

		noseModel[46].addShapeBox(0F, 0F, 0F, 2, 6, 8, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F); // Box 185
		noseModel[46].setRotationPoint(-74F, -31F, 0F);

		noseModel[47].addShapeBox(0F, 0F, 0F, 2, 6, 8, 0F,0F, -1F, 0F, 0F, 3F, 0F, 0F, 1F, -3F, 0F, -2F, -6F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -2F, -4F); // Box 186
		noseModel[47].setRotationPoint(-74F, -33F, 0F);

		noseModel[48].addShapeBox(0F, 0F, 0F, 2, 6, 8, 0F,0F, -2F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -2F, -4F, 0F, -1F, 0F, 0F, 3F, 0F, 0F, 1F, -3F, 0F, -2F, -6F); // Box 187
		noseModel[48].setRotationPoint(-74F, -29F, 0F);

		noseModel[49].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, 3F, -2F, 0F, 3F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, -3F, 2F, 0F, 0F, 0F); // Box 188
		noseModel[49].setRotationPoint(-64F, -40F, 2F);

		noseModel[50].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, 3F, -2F, 0F, 3F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, -3F, 2F, 0F, 0F, 0F); // Box 189
		noseModel[50].setRotationPoint(-64F, -27F, 10F);

		noseModel[51].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, -3F, -2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -2F, 0F, 3F, 2F, 0F, 0F, 0F); // Box 190
		noseModel[51].setRotationPoint(-64F, -18F, 2F);

		noseModel[52].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		noseModel[52].setRotationPoint(-80.5F, -30.5F, -2.5F);

		noseModel[53].addBox(0F, 0F, 0F, 2, 5, 3, 0F); // Box 242
		noseModel[53].setRotationPoint(-80.5F, -30.5F, -1.5F);

		noseModel[54].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 243
		noseModel[54].setRotationPoint(-80.5F, -30.5F, 1.5F);

		noseModel[55].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 244
		noseModel[55].setRotationPoint(-81.5F, -30.5F, -2.5F);

		noseModel[56].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F); // Box 245
		noseModel[56].setRotationPoint(-81.5F, -30.5F, 1.5F);

		noseModel[57].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 246
		noseModel[57].setRotationPoint(-81.5F, -30.5F, -1.5F);

		noseModel[58].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		noseModel[58].setRotationPoint(-78.5F, -29.5F, -0.5F);

		noseModel[59].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		noseModel[59].setRotationPoint(-78.5F, -29.5F, -1.5F);

		noseModel[60].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 249
		noseModel[60].setRotationPoint(-78.5F, -29.5F, 0.5F);

		noseModel[61].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		noseModel[61].setRotationPoint(-74.5F, -30.5F, -2.5F);

		noseModel[62].addBox(0F, 0F, 0F, 2, 5, 3, 0F); // Box 224
		noseModel[62].setRotationPoint(-74.5F, -30.5F, -1.5F);

		noseModel[63].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 225
		noseModel[63].setRotationPoint(-74.5F, -30.5F, 1.5F);

		noseModel[64].addShapeBox(0F, 0F, -1.5F, 1, 14, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 226
		noseModel[64].setRotationPoint(-73F, -28F, 0F);

		noseModel[65].addShapeBox(0F, 0F, -1.5F, 1, 13, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 227
		noseModel[65].setRotationPoint(-73F, -28F, 0F);
		noseModel[65].rotateAngleX = -1.57079633F;

		noseModel[66].addShapeBox(0F, 0F, -1.5F, 1, 13, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 228
		noseModel[66].setRotationPoint(-73F, -28F, 0F);
		noseModel[66].rotateAngleX = 1.57079633F;

		noseModel[67].addShapeBox(0F, 0F, -1.5F, 1, 14, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 229
		noseModel[67].setRotationPoint(-73F, -28F, 0F);
		noseModel[67].rotateAngleX = 3.14159265F;

		noseModel[68].addShapeBox(0F, 0F, -1.5F, 1, 13, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 230
		noseModel[68].setRotationPoint(-73F, -28F, 0F);
		noseModel[68].rotateAngleX = 0.78539816F;

		noseModel[69].addShapeBox(0F, 0F, -1.5F, 1, 13, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 231
		noseModel[69].setRotationPoint(-73F, -28F, 0F);
		noseModel[69].rotateAngleX = -0.78539816F;

		noseModel[70].addShapeBox(0F, 0F, -1.5F, 1, 14, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 232
		noseModel[70].setRotationPoint(-73F, -28F, 0F);
		noseModel[70].rotateAngleX = -2.35619449F;

		noseModel[71].addShapeBox(0F, 0F, -1.5F, 1, 14, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 233
		noseModel[71].setRotationPoint(-73F, -28F, 0F);
		noseModel[71].rotateAngleX = 2.35619449F;
	}

	private void inittailModel_1()
	{
		tailModel[0] = new ModelRendererTurbo(this, 785, 1, textureX, textureY); // Box 17
		tailModel[1] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 20
		tailModel[2] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 23
		tailModel[3] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 27
		tailModel[4] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 28
		tailModel[5] = new ModelRendererTurbo(this, 649, 25, textureX, textureY); // Box 29
		tailModel[6] = new ModelRendererTurbo(this, 721, 25, textureX, textureY); // Box 30
		tailModel[7] = new ModelRendererTurbo(this, 793, 25, textureX, textureY); // Box 31
		tailModel[8] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // Box 83
		tailModel[9] = new ModelRendererTurbo(this, 601, 57, textureX, textureY); // Box 84
		tailModel[10] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 85
		tailModel[11] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 97
		tailModel[12] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 98
		tailModel[13] = new ModelRendererTurbo(this, 665, 113, textureX, textureY); // Box 154
		tailModel[14] = new ModelRendererTurbo(this, 913, 113, textureX, textureY); // Box 157
		tailModel[15] = new ModelRendererTurbo(this, 497, 129, textureX, textureY); // Box 160
		tailModel[16] = new ModelRendererTurbo(this, 817, 129, textureX, textureY); // Box 164
		tailModel[17] = new ModelRendererTurbo(this, 593, 129, textureX, textureY); // Box 165
		tailModel[18] = new ModelRendererTurbo(this, 417, 137, textureX, textureY); // Box 166
		tailModel[19] = new ModelRendererTurbo(this, 657, 137, textureX, textureY); // Box 167
		tailModel[20] = new ModelRendererTurbo(this, 729, 137, textureX, textureY); // Box 168
		tailModel[21] = new ModelRendererTurbo(this, 849, 153, textureX, textureY); // Box 220
		tailModel[22] = new ModelRendererTurbo(this, 153, 161, textureX, textureY); // Box 221
		tailModel[23] = new ModelRendererTurbo(this, 257, 113, textureX, textureY); // Box 222
		tailModel[24] = new ModelRendererTurbo(this, 977, 33, textureX, textureY); // Box 233
		tailModel[25] = new ModelRendererTurbo(this, 929, 161, textureX, textureY); // Box 234
		tailModel[26] = new ModelRendererTurbo(this, 193, 193, textureX, textureY); // Box 275
		tailModel[27] = new ModelRendererTurbo(this, 441, 193, textureX, textureY); // Box 276
		tailModel[28] = new ModelRendererTurbo(this, 617, 57, textureX, textureY); // Box 277
		tailModel[29] = new ModelRendererTurbo(this, 889, 1, textureX, textureY); // Box 278
		tailModel[30] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Box 290
		tailModel[31] = new ModelRendererTurbo(this, 649, 73, textureX, textureY); // Box 291
		tailModel[32] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 292
		tailModel[33] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 293
		tailModel[34] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 294
		tailModel[35] = new ModelRendererTurbo(this, 785, 25, textureX, textureY); // Box 295
		tailModel[36] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 296

		tailModel[0].addShapeBox(0F, 0F, 0F, 36, 7, 11, 0F,0F, 0F, 0F, 0F, -1F, -4F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -5F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 17
		tailModel[0].setRotationPoint(7F, -28F, -11F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 36, 7, 11, 0F,0F, 0F, -1F, 0F, -3F, -5F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -4F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 20
		tailModel[1].setRotationPoint(7F, -35F, -11F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 36, 5, 10, 0F,0F, 0F, -4F, 0F, -4F, -7F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 3F, -4F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 23
		tailModel[2].setRotationPoint(7F, -40F, -10F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 36, 6, 10, 0F,0F, 0F, 0F, 0F, 2F, -4F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -4F, -6F, 0F, -2F, 0F, 0F, 2F, 0F); // Box 27
		tailModel[3].setRotationPoint(7F, -21F, -10F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 26, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -5F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 28
		tailModel[4].setRotationPoint(43F, -27F, -7F);

		tailModel[5].addShapeBox(0F, 0F, 0F, 26, 4, 6, 0F,0F, 0F, 0F, 0F, 2F, -4F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -4F, -4F, 0F, -3F, 0F, 0F, 2F, 0F); // Box 29
		tailModel[5].setRotationPoint(43F, -23F, -6F);

		tailModel[6].addShapeBox(0F, 0F, 0F, 26, 5, 7, 0F,0F, 0F, -1F, 0F, -3F, -5F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		tailModel[6].setRotationPoint(43F, -32F, -7F);

		tailModel[7].addShapeBox(0F, 0F, 0F, 26, 4, 6, 0F,0F, 0F, -3F, 0F, -6F, -4F, 0F, -5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 3F, -4F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 31
		tailModel[7].setRotationPoint(43F, -36F, -6F);

		tailModel[8].addShapeBox(0F, 0F, 0F, 11, 3, 24, 0F,-10.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		tailModel[8].setRotationPoint(51F, -30F, -27F);

		tailModel[9].addShapeBox(0F, 0F, 0F, 11, 3, 24, 0F,-11F, -1F, 0F, 7F, 0F, 0F, -4F, 0F, 0F, 0F, -1F, 0F, -11F, -1F, 0F, 7F, 0F, 0F, -4F, 0F, 0F, 0F, -1F, 0F); // Box 84
		tailModel[9].setRotationPoint(44F, -30F, -27F);

		tailModel[10].addShapeBox(0F, 0F, 0F, 7, 3, 5, 0F,-5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 85
		tailModel[10].setRotationPoint(55F, -30F, -32F);

		tailModel[11].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,-1.9999F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0.9999F, 0F, 0F, -1.9999F, 0F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		tailModel[11].setRotationPoint(64F, -54F, -2F);

		tailModel[12].addShapeBox(0F, 0F, 0F, 19, 22, 2, 0F,-16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, 0F, -2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 98
		tailModel[12].setRotationPoint(50F, -52F, -2F);

		tailModel[13].addShapeBox(0F, 0F, 0F, 36, 7, 11, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -5F, 0F, 0F, -1F); // Box 154
		tailModel[13].setRotationPoint(7F, -28F, 0F);

		tailModel[14].addShapeBox(0F, 0F, 0F, 36, 7, 11, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -4F, 0F, 0F, 0F); // Box 157
		tailModel[14].setRotationPoint(7F, -35F, 0F);

		tailModel[15].addShapeBox(0F, 0F, 0F, 36, 5, 10, 0F,0F, 3F, 0F, 0F, -3F, 0F, 0F, -4F, -7F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, -4F, 0F, 0F, 0F); // Box 160
		tailModel[15].setRotationPoint(7F, -40F, 0F);

		tailModel[16].addShapeBox(0F, 0F, 0F, 36, 6, 10, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -4F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -4F, -6F, 0F, 0F, -4F); // Box 164
		tailModel[16].setRotationPoint(7F, -21F, 0F);

		tailModel[17].addShapeBox(0F, 0F, 0F, 26, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -5F, 0F, 0F, -1F); // Box 165
		tailModel[17].setRotationPoint(43F, -27F, 0F);

		tailModel[18].addShapeBox(0F, 0F, 0F, 26, 4, 6, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -4F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -3F, 0F, 0F, -4F, -4F, 0F, 0F, -2F); // Box 166
		tailModel[18].setRotationPoint(43F, -23F, 0F);

		tailModel[19].addShapeBox(0F, 0F, 0F, 26, 5, 7, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 167
		tailModel[19].setRotationPoint(43F, -32F, 0F);

		tailModel[20].addShapeBox(0F, 0F, 0F, 26, 4, 6, 0F,0F, 1F, 0F, 0F, -5F, 0F, 0F, -6F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, -4F, 0F, 0F, 0F); // Box 168
		tailModel[20].setRotationPoint(43F, -36F, 0F);

		tailModel[21].addShapeBox(0F, 0F, 0F, 11, 3, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10.9999F, 0F, 0F); // Box 220
		tailModel[21].setRotationPoint(51F, -30F, 3F);

		tailModel[22].addShapeBox(0F, 0F, 0F, 11, 3, 24, 0F,0F, -1F, 0F, -4F, 0F, 0F, 7F, 0F, 0F, -11F, -1F, 0F, 0F, -1F, 0F, -4F, 0F, 0F, 7F, 0F, 0F, -11F, -1F, 0F); // Box 221
		tailModel[22].setRotationPoint(44F, -30F, 3F);

		tailModel[23].addShapeBox(0F, 0F, 0F, 7, 3, 5, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -5F, -1F, 0F); // Box 222
		tailModel[23].setRotationPoint(55F, -30F, 27F);

		tailModel[24].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, -1.9999F, 0F, 0F, 0.9999F, 0F, 0F, 0F, 0F, -1.9999F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9999F, 0F, 0F); // Box 233
		tailModel[24].setRotationPoint(64F, -54F, 0F);

		tailModel[25].addShapeBox(0F, 0F, 0F, 19, 22, 2, 0F,-14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F); // Box 234
		tailModel[25].setRotationPoint(50F, -52F, 0F);

		tailModel[26].addShapeBox(0F, 0F, 0F, 57, 1, 1, 0F,-0.25F, -0.25F, -0.25F, 0F, 1.25F, -0.25F, 0F, 1.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, -1.75F, -0.25F, 0F, -1.75F, -0.25F, -0.25F, -0.25F, -0.25F); // Box 275
		tailModel[26].setRotationPoint(-19F, -54F, -0.5F);

		tailModel[27].addShapeBox(0F, 0F, 0F, 31, 1, 1, 0F,0F, 1.25F, -0.25F, -0.25F, 7.75F, -0.25F, -0.25F, 7.75F, -0.25F, 0F, 1.25F, -0.25F, 0F, -1.75F, -0.25F, -0.25F, -8.25F, -0.25F, -0.25F, -8.25F, -0.25F, 0F, -1.75F, -0.25F); // Box 276
		tailModel[27].setRotationPoint(38F, -54F, -0.5F);

		tailModel[28].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 14.75F, 0F, -0.25F, -15.25F, 0F, -0.25F, -15.25F, 0F, -0.25F, 14.75F, 0F, -0.25F); // Box 277
		tailModel[28].setRotationPoint(38F, -55F, -0.5F);

		tailModel[29].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
		tailModel[29].setRotationPoint(68F, -62F, -0.5F);

		tailModel[30].addShapeBox(0F, 0F, 0F, 3, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 290
		tailModel[30].setRotationPoint(59F, -23F, -1.5F);

		tailModel[31].addShapeBox(0F, 0F, 0F, 7, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 291
		tailModel[31].setRotationPoint(52F, -23F, -1.5F);

		tailModel[32].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 292
		tailModel[32].setRotationPoint(62F, -17F, -0.5F);

		tailModel[33].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 293
		tailModel[33].setRotationPoint(62F, -18F, -0.5F);

		tailModel[34].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 294
		tailModel[34].setRotationPoint(62F, -16F, -0.5F);

		tailModel[35].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, -1F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 295
		tailModel[35].setRotationPoint(62F, -19F, -0.5F);

		tailModel[36].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 1F, -1F, 0F, 1F); // Box 296
		tailModel[36].setRotationPoint(62F, -19F, -0.5F);
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 593, 41, textureX, textureY); // Box 62
		leftWingModel[1] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 63
		leftWingModel[2] = new ModelRendererTurbo(this, 649, 41, textureX, textureY); // Box 64
		leftWingModel[3] = new ModelRendererTurbo(this, 713, 41, textureX, textureY); // Box 65
		leftWingModel[4] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 66
		leftWingModel[5] = new ModelRendererTurbo(this, 801, 41, textureX, textureY); // Box 67
		leftWingModel[6] = new ModelRendererTurbo(this, 873, 49, textureX, textureY); // Box 72
		leftWingModel[7] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 73
		leftWingModel[8] = new ModelRendererTurbo(this, 929, 49, textureX, textureY); // Box 74
		leftWingModel[9] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Box 75
		leftWingModel[10] = new ModelRendererTurbo(this, 409, 57, textureX, textureY); // Box 76
		leftWingModel[11] = new ModelRendererTurbo(this, 921, 1, textureX, textureY); // Box 77
		leftWingModel[12] = new ModelRendererTurbo(this, 537, 57, textureX, textureY); // Box 78
		leftWingModel[13] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Box 79
		leftWingModel[14] = new ModelRendererTurbo(this, 657, 1, textureX, textureY); // Box 80
		leftWingModel[15] = new ModelRendererTurbo(this, 769, 1, textureX, textureY); // Box 81
		leftWingModel[16] = new ModelRendererTurbo(this, 881, 25, textureX, textureY); // Box 82
		leftWingModel[17] = new ModelRendererTurbo(this, 673, 73, textureX, textureY); // Box 99
		leftWingModel[18] = new ModelRendererTurbo(this, 745, 73, textureX, textureY); // Box 100
		leftWingModel[19] = new ModelRendererTurbo(this, 809, 73, textureX, textureY); // Box 102
		leftWingModel[20] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 103
		leftWingModel[21] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 104
		leftWingModel[22] = new ModelRendererTurbo(this, 233, 81, textureX, textureY); // Box 105
		leftWingModel[23] = new ModelRendererTurbo(this, 305, 81, textureX, textureY); // Box 106
		leftWingModel[24] = new ModelRendererTurbo(this, 945, 73, textureX, textureY); // Box 107
		leftWingModel[25] = new ModelRendererTurbo(this, 377, 73, textureX, textureY); // Box 108
		leftWingModel[26] = new ModelRendererTurbo(this, 689, 49, textureX, textureY); // Box 109
		leftWingModel[27] = new ModelRendererTurbo(this, 465, 81, textureX, textureY); // Box 110
		leftWingModel[28] = new ModelRendererTurbo(this, 745, 81, textureX, textureY); // Box 111
		leftWingModel[29] = new ModelRendererTurbo(this, 809, 81, textureX, textureY); // Box 112
		leftWingModel[30] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 113
		leftWingModel[31] = new ModelRendererTurbo(this, 281, 25, textureX, textureY); // Box 114
		leftWingModel[32] = new ModelRendererTurbo(this, 873, 81, textureX, textureY); // Box 115
		leftWingModel[33] = new ModelRendererTurbo(this, 49, 89, textureX, textureY); // Box 116
		leftWingModel[34] = new ModelRendererTurbo(this, 977, 81, textureX, textureY); // Box 117
		leftWingModel[35] = new ModelRendererTurbo(this, 121, 89, textureX, textureY); // Box 118
		leftWingModel[36] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Box 119
		leftWingModel[37] = new ModelRendererTurbo(this, 817, 73, textureX, textureY); // Box 121
		leftWingModel[38] = new ModelRendererTurbo(this, 161, 89, textureX, textureY); // Box 122
		leftWingModel[39] = new ModelRendererTurbo(this, 265, 89, textureX, textureY); // Box 123
		leftWingModel[40] = new ModelRendererTurbo(this, 217, 89, textureX, textureY); // Box 124
		leftWingModel[41] = new ModelRendererTurbo(this, 321, 89, textureX, textureY); // Box 125
		leftWingModel[42] = new ModelRendererTurbo(this, 393, 89, textureX, textureY); // Box 126
		leftWingModel[43] = new ModelRendererTurbo(this, 257, 89, textureX, textureY); // Box 127
		leftWingModel[44] = new ModelRendererTurbo(this, 361, 89, textureX, textureY); // Box 128
		leftWingModel[45] = new ModelRendererTurbo(this, 433, 89, textureX, textureY); // Box 129
		leftWingModel[46] = new ModelRendererTurbo(this, 521, 89, textureX, textureY); // Box 130
		leftWingModel[47] = new ModelRendererTurbo(this, 385, 89, textureX, textureY); // Box 131
		leftWingModel[48] = new ModelRendererTurbo(this, 601, 9, textureX, textureY); // Box 132
		leftWingModel[49] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 133
		leftWingModel[50] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 134
		leftWingModel[51] = new ModelRendererTurbo(this, 785, 1, textureX, textureY); // Box 135
		leftWingModel[52] = new ModelRendererTurbo(this, 705, 9, textureX, textureY); // Box 136
		leftWingModel[53] = new ModelRendererTurbo(this, 97, 193, textureX, textureY); // Box 274
		leftWingModel[54] = new ModelRendererTurbo(this, 873, 9, textureX, textureY); // Box 279

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 20, 8, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		leftWingModel[0].setRotationPoint(-41F, -24F, -13F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 11, 8, 6, 0F,0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 63
		leftWingModel[1].setRotationPoint(-52F, -24F, -13F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 12, 8, 6, 0F,0F, -1F, 0F, 0F, -6F, 0F, 0F, -6.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 64
		leftWingModel[2].setRotationPoint(-21F, -24F, -13F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 20, 7, 22, 0F,0F, 0F, 0F, -4F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, -4F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		leftWingModel[3].setRotationPoint(-41F, -24F, -35F);

		leftWingModel[4].addShapeBox(0F, 0F, 0F, 20, 7, 22, 0F,0F, 0F, 0F, -4F, -4F, 0F, -4F, -6F, 0F, -4F, -1F, 0F, 0F, -2F, 0F, -4F, -2F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 66
		leftWingModel[4].setRotationPoint(-25F, -24F, -35F);

		leftWingModel[5].addShapeBox(0F, 0F, 0F, 11, 7, 22, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 67
		leftWingModel[5].setRotationPoint(-52F, -24F, -35F);

		leftWingModel[6].addShapeBox(0F, 0F, 0F, 16, 6, 18, 0F,0F, 0F, 0F, -4F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		leftWingModel[6].setRotationPoint(-41F, -25F, -53F);

		leftWingModel[7].addShapeBox(0F, 0F, 0F, 11, 6, 18, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 73
		leftWingModel[7].setRotationPoint(-52F, -25F, -53F);

		leftWingModel[8].addShapeBox(0F, 0F, 0F, 12, 6, 10, 0F,0F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		leftWingModel[8].setRotationPoint(-41F, -26F, -63F);

		leftWingModel[9].addShapeBox(0F, 0F, 0F, 11, 6, 10, 0F,0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 75
		leftWingModel[9].setRotationPoint(-52F, -26F, -63F);

		leftWingModel[10].addShapeBox(0F, 0F, 0F, 10, 6, 18, 0F,0F, -0.5F, 0F, -4F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, -4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		leftWingModel[10].setRotationPoint(-41F, -27F, -81F);

		leftWingModel[11].addShapeBox(0F, 0F, 0F, 6, 5, 7, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		leftWingModel[11].setRotationPoint(-41F, -27F, -88F);

		leftWingModel[12].addShapeBox(0F, 0F, 0F, 11, 6, 18, 0F,-3F, -1F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -2F, 0F, -3F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 78
		leftWingModel[12].setRotationPoint(-52F, -27F, -81F);

		leftWingModel[13].addShapeBox(0F, 0F, 0F, 8, 5, 7, 0F,-3F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, -3F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 79
		leftWingModel[13].setRotationPoint(-49F, -27F, -88F);

		leftWingModel[14].addShapeBox(0F, 0F, 0F, 5, 4, 5, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		leftWingModel[14].setRotationPoint(-41F, -27F, -93F);

		leftWingModel[15].addShapeBox(0F, 0F, 0F, 5, 4, 5, 0F,0F, -1F, -5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, -5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 81
		leftWingModel[15].setRotationPoint(-46F, -27F, -93F);

		leftWingModel[16].addShapeBox(0F, 0F, 0F, 9, 4, 5, 0F,0F, -2F, 0F, 0F, -3F, -5F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		leftWingModel[16].setRotationPoint(-36F, -27F, -93F);

		leftWingModel[17].addShapeBox(0F, 0F, 0F, 32, 11, 2, 0F,-4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -10F, 0F, 0F, -7F, 0F, 0F, 1F, 0F, 0F); // Box 99
		leftWingModel[17].setRotationPoint(-52F, -20F, -20F);

		leftWingModel[18].addShapeBox(0F, 0F, 0F, 28, 3, 2, 0F,-4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 100
		leftWingModel[18].setRotationPoint(-55F, -9F, -20F);

		leftWingModel[19].addShapeBox(0F, 0F, 0F, 24, 2, 4, 0F,0F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 102
		leftWingModel[19].setRotationPoint(-53F, -6F, -22F);

		leftWingModel[20].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, -3.9999F, 0F, 0F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		leftWingModel[20].setRotationPoint(-55F, -6F, -22F);

		leftWingModel[21].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,-0.9999F, -1.9999F, 0F, 0F, -1.9999F, 0F, 0F, 0F, 0F, 0F, -1.9999F, 0F, -0.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		leftWingModel[21].setRotationPoint(-59F, -6F, -22F);

		leftWingModel[22].addShapeBox(0F, 0F, 0F, 31, 2, 4, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 105
		leftWingModel[22].setRotationPoint(-61F, -4F, -22F);

		leftWingModel[23].addShapeBox(0F, 0F, 0F, 31, 3, 4, 0F,-2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 106
		leftWingModel[23].setRotationPoint(-62F, -2F, -22F);

		leftWingModel[24].addShapeBox(0F, 0F, 0F, 13, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		leftWingModel[24].setRotationPoint(-57F, 1F, -22F);

		leftWingModel[25].addShapeBox(0F, 0F, 0F, 11, 6, 4, 0F,0F, 0F, 0F, -2.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.9999F, -5.9999F, 0F, 0F, -5.9999F, 0F, 0F, 0F, 0F); // Box 108
		leftWingModel[25].setRotationPoint(-44F, 1F, -22F);

		leftWingModel[26].addShapeBox(0F, 0F, 0F, 5, 6, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F); // Box 109
		leftWingModel[26].setRotationPoint(-62F, 1F, -22F);

		leftWingModel[27].addShapeBox(0F, 0F, 0F, 32, 11, 2, 0F,-2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, 1F, 0F, 0F, -7F, 0F, 0F, -10F, 0F, 0F, -1F, 0F, 0F); // Box 110
		leftWingModel[27].setRotationPoint(-52F, -20F, -18F);

		leftWingModel[28].addShapeBox(0F, 0F, 0F, 28, 3, 2, 0F,-2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, 0F); // Box 111
		leftWingModel[28].setRotationPoint(-55F, -9F, -18F);

		leftWingModel[29].addShapeBox(0F, 0F, 0F, 24, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 112
		leftWingModel[29].setRotationPoint(-53F, -6F, -18F);

		leftWingModel[30].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9999F, 0F, 0F, -3.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		leftWingModel[30].setRotationPoint(-55F, -6F, -18F);

		leftWingModel[31].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, -1.9999F, 0F, 0F, 0F, 0F, 0F, -1.9999F, 0F, -0.9999F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9999F, 0F, 0F); // Box 114
		leftWingModel[31].setRotationPoint(-59F, -6F, -18F);

		leftWingModel[32].addShapeBox(0F, 0F, 0F, 31, 2, 4, 0F,-2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F); // Box 115
		leftWingModel[32].setRotationPoint(-61F, -4F, -18F);

		leftWingModel[33].addShapeBox(0F, 0F, 0F, 31, 3, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -5F, 0F, 0F, -1F, 0F, 0F); // Box 116
		leftWingModel[33].setRotationPoint(-62F, -2F, -18F);

		leftWingModel[34].addShapeBox(0F, 0F, 0F, 13, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		leftWingModel[34].setRotationPoint(-57F, 1F, -18F);

		leftWingModel[35].addShapeBox(0F, 0F, 0F, 11, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.9999F, 0F, -2.9999F, -5.9999F, 0F, 0F, 0F, 0F); // Box 118
		leftWingModel[35].setRotationPoint(-44F, 1F, -18F);

		leftWingModel[36].addShapeBox(0F, 0F, 0F, 5, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F); // Box 119
		leftWingModel[36].setRotationPoint(-62F, 1F, -18F);

		leftWingModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 49, 0F,-0.25F, -16.25F, 0F, -0.25F, -16.25F, 0F, -0.25F, 0.75F, 0F, -0.25F, 0.75F, 0F, -0.25F, 15.75F, 0F, -0.25F, 15.75F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F); // Box 121
		leftWingModel[37].setRotationPoint(-45F, -40F, -55F);

		leftWingModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 49, 0F,-0.25F, -16.25F, 0F, -0.25F, -16.25F, 0F, -0.25F, 0.75F, 0F, -0.25F, 0.75F, 0F, -0.25F, 15.75F, 0F, -0.25F, 15.75F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F); // Box 122
		leftWingModel[38].setRotationPoint(-47F, -40F, -55F);

		leftWingModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 49, 0F,-16.25F, -16.25F, 0F, 15.75F, -16.25F, 0F, -0.25F, 0.75F, 0F, -0.25F, 0.75F, 0F, -16.25F, 15.75F, 0F, 15.75F, 15.75F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F); // Box 123
		leftWingModel[39].setRotationPoint(-43F, -40F, -55F);

		leftWingModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 33, 0F,-0.25F, 3.75F, 0F, -0.25F, 3.75F, 0F, 4.75F, -16.25F, 0F, -5.25F, -16.25F, 0F, -0.25F, -4.25F, 0F, -0.25F, -4.25F, 0F, 4.75F, 15.75F, 0F, -5.25F, 15.75F, 0F); // Box 124
		leftWingModel[40].setRotationPoint(-45F, -18F, -55F);

		leftWingModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 33, 0F,-16.25F, 3.75F, 0F, 15.75F, 3.75F, 0F, 4.75F, -16.25F, 0F, -5.25F, -16.25F, 0F, -16.25F, -4.25F, 0F, 15.75F, -4.25F, 0F, 4.75F, 15.75F, 0F, -5.25F, 15.75F, 0F); // Box 125
		leftWingModel[41].setRotationPoint(-43F, -18F, -55F);

		leftWingModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 33, 0F,-16.25F, 3.75F, 0F, 15.75F, 3.75F, 0F, 4.75F, -16.25F, 0F, -5.25F, -16.25F, 0F, -16.25F, -4.25F, 0F, 15.75F, -4.25F, 0F, 4.75F, 15.75F, 0F, -5.25F, 15.75F, 0F); // Box 126
		leftWingModel[42].setRotationPoint(-41F, -18F, -55F);

		leftWingModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 1.75F, -8.25F, 0F, -2.25F, -8.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 1.75F, 7.75F, 0F, -2.25F, 7.75F, 0F); // Box 127
		leftWingModel[43].setRotationPoint(-43F, -17F, -16F);

		leftWingModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 1.75F, -8.25F, 0F, -2.25F, -8.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 1.75F, 7.75F, 0F, -2.25F, 7.75F, 0F); // Box 128
		leftWingModel[44].setRotationPoint(-44F, -17F, -16F);

		leftWingModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F,-2.25F, -8.25F, 0F, 1.75F, -8.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -2.25F, 7.75F, 0F, 1.75F, 7.75F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 129
		leftWingModel[45].setRotationPoint(-42F, -9F, -16F);

		leftWingModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F,-2.25F, -8.25F, 0F, 1.75F, -8.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -2.25F, 7.75F, 0F, 1.75F, 7.75F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 130
		leftWingModel[46].setRotationPoint(-41F, -9F, -16F);

		leftWingModel[47].addShapeBox(0F, 0F, 0F, 12, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 131
		leftWingModel[47].setRotationPoint(-56.5F, 6F, -21.5F);

		leftWingModel[48].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		leftWingModel[48].setRotationPoint(-42F, -7F, -30F);

		leftWingModel[49].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133
		leftWingModel[49].setRotationPoint(-46F, -16F, -45F);

		leftWingModel[50].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134
		leftWingModel[50].setRotationPoint(-31F, -16F, -45F);

		leftWingModel[51].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		leftWingModel[51].setRotationPoint(-47.5F, -32F, -34F);

		leftWingModel[52].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		leftWingModel[52].setRotationPoint(-47.5F, -37F, -19F);

		leftWingModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 91, 0F,-7.25F, -35.25F, 0F, 6.75F, -35.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -7.25F, 34.75F, 0F, 6.75F, 34.75F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 274
		leftWingModel[53].setRotationPoint(-46F, -62F, -88F);

		leftWingModel[54].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 279
		leftWingModel[54].setRotationPoint(-43F, -9F, -0.5F);
	}

	private void initrightWingModel_1()
	{
		rightWingModel[0] = new ModelRendererTurbo(this, 41, 145, textureX, textureY); // Box 199
		rightWingModel[1] = new ModelRendererTurbo(this, 177, 145, textureX, textureY); // Box 200
		rightWingModel[2] = new ModelRendererTurbo(this, 217, 145, textureX, textureY); // Box 201
		rightWingModel[3] = new ModelRendererTurbo(this, 233, 145, textureX, textureY); // Box 202
		rightWingModel[4] = new ModelRendererTurbo(this, 489, 145, textureX, textureY); // Box 203
		rightWingModel[5] = new ModelRendererTurbo(this, 577, 145, textureX, textureY); // Box 204
		rightWingModel[6] = new ModelRendererTurbo(this, 649, 153, textureX, textureY); // Box 209
		rightWingModel[7] = new ModelRendererTurbo(this, 425, 153, textureX, textureY); // Box 210
		rightWingModel[8] = new ModelRendererTurbo(this, 705, 153, textureX, textureY); // Box 211
		rightWingModel[9] = new ModelRendererTurbo(this, 825, 153, textureX, textureY); // Box 212
		rightWingModel[10] = new ModelRendererTurbo(this, 737, 153, textureX, textureY); // Box 213
		rightWingModel[11] = new ModelRendererTurbo(this, 585, 105, textureX, textureY); // Box 214
		rightWingModel[12] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 215
		rightWingModel[13] = new ModelRendererTurbo(this, 977, 137, textureX, textureY); // Box 216
		rightWingModel[14] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 217
		rightWingModel[15] = new ModelRendererTurbo(this, 961, 89, textureX, textureY); // Box 218
		rightWingModel[16] = new ModelRendererTurbo(this, 929, 137, textureX, textureY); // Box 219
		rightWingModel[17] = new ModelRendererTurbo(this, 225, 177, textureX, textureY); // Box 235
		rightWingModel[18] = new ModelRendererTurbo(this, 489, 177, textureX, textureY); // Box 236
		rightWingModel[19] = new ModelRendererTurbo(this, 553, 177, textureX, textureY); // Box 237
		rightWingModel[20] = new ModelRendererTurbo(this, 953, 25, textureX, textureY); // Box 238
		rightWingModel[21] = new ModelRendererTurbo(this, 305, 49, textureX, textureY); // Box 239
		rightWingModel[22] = new ModelRendererTurbo(this, 57, 185, textureX, textureY); // Box 240
		rightWingModel[23] = new ModelRendererTurbo(this, 297, 185, textureX, textureY); // Box 241
		rightWingModel[24] = new ModelRendererTurbo(this, 977, 169, textureX, textureY); // Box 242
		rightWingModel[25] = new ModelRendererTurbo(this, 617, 177, textureX, textureY); // Box 243
		rightWingModel[26] = new ModelRendererTurbo(this, 73, 97, textureX, textureY); // Box 244
		rightWingModel[27] = new ModelRendererTurbo(this, 369, 185, textureX, textureY); // Box 245
		rightWingModel[28] = new ModelRendererTurbo(this, 441, 185, textureX, textureY); // Box 246
		rightWingModel[29] = new ModelRendererTurbo(this, 793, 177, textureX, textureY); // Box 247
		rightWingModel[30] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 248
		rightWingModel[31] = new ModelRendererTurbo(this, 537, 57, textureX, textureY); // Box 249
		rightWingModel[32] = new ModelRendererTurbo(this, 505, 185, textureX, textureY); // Box 250
		rightWingModel[33] = new ModelRendererTurbo(this, 649, 185, textureX, textureY); // Box 251
		rightWingModel[34] = new ModelRendererTurbo(this, 577, 185, textureX, textureY); // Box 252
		rightWingModel[35] = new ModelRendererTurbo(this, 721, 185, textureX, textureY); // Box 253
		rightWingModel[36] = new ModelRendererTurbo(this, 753, 113, textureX, textureY); // Box 254
		rightWingModel[37] = new ModelRendererTurbo(this, 873, 177, textureX, textureY); // Box 256
		rightWingModel[38] = new ModelRendererTurbo(this, 81, 185, textureX, textureY); // Box 257
		rightWingModel[39] = new ModelRendererTurbo(this, 761, 185, textureX, textureY); // Box 258
		rightWingModel[40] = new ModelRendererTurbo(this, 817, 185, textureX, textureY); // Box 259
		rightWingModel[41] = new ModelRendererTurbo(this, 945, 185, textureX, textureY); // Box 260
		rightWingModel[42] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 261
		rightWingModel[43] = new ModelRendererTurbo(this, 857, 185, textureX, textureY); // Box 262
		rightWingModel[44] = new ModelRendererTurbo(this, 985, 185, textureX, textureY); // Box 263
		rightWingModel[45] = new ModelRendererTurbo(this, 41, 193, textureX, textureY); // Box 264
		rightWingModel[46] = new ModelRendererTurbo(this, 81, 193, textureX, textureY); // Box 265
		rightWingModel[47] = new ModelRendererTurbo(this, 881, 185, textureX, textureY); // Box 266
		rightWingModel[48] = new ModelRendererTurbo(this, 681, 41, textureX, textureY); // Box 267
		rightWingModel[49] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 268
		rightWingModel[50] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 269
		rightWingModel[51] = new ModelRendererTurbo(this, 553, 9, textureX, textureY); // Box 270
		rightWingModel[52] = new ModelRendererTurbo(this, 777, 57, textureX, textureY); // Box 271
		rightWingModel[53] = new ModelRendererTurbo(this, 529, 177, textureX, textureY); // Box 273
		rightWingModel[54] = new ModelRendererTurbo(this, 281, 65, textureX, textureY); // Box 317
		rightWingModel[55] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 318

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 20, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 199
		rightWingModel[0].setRotationPoint(-41F, -24F, 7F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 11, 8, 6, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F); // Box 200
		rightWingModel[1].setRotationPoint(-52F, -24F, 7F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 12, 8, 6, 0F,0F, 0F, 0F, 0F, -6.5F, 0F, 0F, -6F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 201
		rightWingModel[2].setRotationPoint(-21F, -24F, 7F);

		rightWingModel[3].addShapeBox(0F, 0F, 0F, 20, 7, 22, 0F,0F, -1F, 0F, 0F, -1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -2F, 0F, 0F, -2F, 0F); // Box 202
		rightWingModel[3].setRotationPoint(-41F, -24F, 13F);

		rightWingModel[4].addShapeBox(0F, 0F, 0F, 20, 7, 22, 0F,-4F, -1F, 0F, -4F, -6F, 0F, -4F, -4F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, -2F, 0F, 0F, -2F, 0F); // Box 203
		rightWingModel[4].setRotationPoint(-25F, -24F, 13F);

		rightWingModel[5].addShapeBox(0F, 0F, 0F, 11, 7, 22, 0F,0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, 0F); // Box 204
		rightWingModel[5].setRotationPoint(-52F, -24F, 13F);

		rightWingModel[6].addShapeBox(0F, 0F, 0F, 16, 6, 18, 0F,0F, -1F, 0F, 0F, -1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -1F, 0F, 0F, -1F, 0F); // Box 209
		rightWingModel[6].setRotationPoint(-41F, -25F, 35F);

		rightWingModel[7].addShapeBox(0F, 0F, 0F, 11, 6, 18, 0F,0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F); // Box 210
		rightWingModel[7].setRotationPoint(-52F, -25F, 35F);

		rightWingModel[8].addShapeBox(0F, 0F, 0F, 12, 6, 10, 0F,0F, -1F, 0F, 0F, -1F, 0F, -2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 0F, -1F, 0F); // Box 211
		rightWingModel[8].setRotationPoint(-41F, -26F, 53F);

		rightWingModel[9].addShapeBox(0F, 0F, 0F, 11, 6, 10, 0F,0F, -2F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F); // Box 212
		rightWingModel[9].setRotationPoint(-52F, -26F, 53F);

		rightWingModel[10].addShapeBox(0F, 0F, 0F, 10, 6, 18, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, -4F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -1F, 0F, 0F, -1F, 0F); // Box 213
		rightWingModel[10].setRotationPoint(-41F, -27F, 63F);

		rightWingModel[11].addShapeBox(0F, 0F, 0F, 6, 5, 7, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F); // Box 214
		rightWingModel[11].setRotationPoint(-41F, -27F, 81F);

		rightWingModel[12].addShapeBox(0F, 0F, 0F, 11, 6, 18, 0F,0F, -2F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, -3F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, -3F, 0F); // Box 215
		rightWingModel[12].setRotationPoint(-52F, -27F, 63F);

		rightWingModel[13].addShapeBox(0F, 0F, 0F, 8, 5, 7, 0F,0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, -3F, 0F); // Box 216
		rightWingModel[13].setRotationPoint(-49F, -27F, 81F);

		rightWingModel[14].addShapeBox(0F, 0F, 0F, 5, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 217
		rightWingModel[14].setRotationPoint(-41F, -27F, 88F);

		rightWingModel[15].addShapeBox(0F, 0F, 0F, 5, 4, 5, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, -5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, -5F); // Box 218
		rightWingModel[15].setRotationPoint(-46F, -27F, 88F);

		rightWingModel[16].addShapeBox(0F, 0F, 0F, 9, 4, 5, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -1F, 0F); // Box 219
		rightWingModel[16].setRotationPoint(-36F, -27F, 88F);

		rightWingModel[17].addShapeBox(0F, 0F, 0F, 32, 11, 2, 0F,-2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, 1F, 0F, 0F, -7F, 0F, 0F, -10F, 0F, 0F, -1F, 0F, 0F); // Box 235
		rightWingModel[17].setRotationPoint(-52F, -20F, 18F);

		rightWingModel[18].addShapeBox(0F, 0F, 0F, 28, 3, 2, 0F,-2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, 0F); // Box 236
		rightWingModel[18].setRotationPoint(-55F, -9F, 18F);

		rightWingModel[19].addShapeBox(0F, 0F, 0F, 24, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 237
		rightWingModel[19].setRotationPoint(-53F, -6F, 18F);

		rightWingModel[20].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9999F, 0F, 0F, -3.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 238
		rightWingModel[20].setRotationPoint(-55F, -6F, 18F);

		rightWingModel[21].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, -1.9999F, 0F, 0F, 0F, 0F, 0F, -1.9999F, 0F, -0.9999F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9999F, 0F, 0F); // Box 239
		rightWingModel[21].setRotationPoint(-59F, -6F, 18F);

		rightWingModel[22].addShapeBox(0F, 0F, 0F, 31, 2, 4, 0F,-2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F); // Box 240
		rightWingModel[22].setRotationPoint(-61F, -4F, 18F);

		rightWingModel[23].addShapeBox(0F, 0F, 0F, 31, 3, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -5F, 0F, 0F, -1F, 0F, 0F); // Box 241
		rightWingModel[23].setRotationPoint(-62F, -2F, 18F);

		rightWingModel[24].addShapeBox(0F, 0F, 0F, 13, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		rightWingModel[24].setRotationPoint(-57F, 1F, 18F);

		rightWingModel[25].addShapeBox(0F, 0F, 0F, 11, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.9999F, 0F, -2.9999F, -5.9999F, 0F, 0F, 0F, 0F); // Box 243
		rightWingModel[25].setRotationPoint(-44F, 1F, 18F);

		rightWingModel[26].addShapeBox(0F, 0F, 0F, 5, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F); // Box 244
		rightWingModel[26].setRotationPoint(-62F, 1F, 18F);

		rightWingModel[27].addShapeBox(0F, 0F, 0F, 32, 11, 2, 0F,-4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -10F, 0F, 0F, -7F, 0F, 0F, 1F, 0F, 0F); // Box 245
		rightWingModel[27].setRotationPoint(-52F, -20F, 16F);

		rightWingModel[28].addShapeBox(0F, 0F, 0F, 28, 3, 2, 0F,-4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 246
		rightWingModel[28].setRotationPoint(-55F, -9F, 16F);

		rightWingModel[29].addShapeBox(0F, 0F, 0F, 24, 2, 4, 0F,0F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 247
		rightWingModel[29].setRotationPoint(-53F, -6F, 14F);

		rightWingModel[30].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, -3.9999F, 0F, 0F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		rightWingModel[30].setRotationPoint(-55F, -6F, 14F);

		rightWingModel[31].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,-0.9999F, -1.9999F, 0F, 0F, -1.9999F, 0F, 0F, 0F, 0F, 0F, -1.9999F, 0F, -0.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 249
		rightWingModel[31].setRotationPoint(-59F, -6F, 14F);

		rightWingModel[32].addShapeBox(0F, 0F, 0F, 31, 2, 4, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 250
		rightWingModel[32].setRotationPoint(-61F, -4F, 14F);

		rightWingModel[33].addShapeBox(0F, 0F, 0F, 31, 3, 4, 0F,-2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 251
		rightWingModel[33].setRotationPoint(-62F, -2F, 14F);

		rightWingModel[34].addShapeBox(0F, 0F, 0F, 13, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 252
		rightWingModel[34].setRotationPoint(-57F, 1F, 14F);

		rightWingModel[35].addShapeBox(0F, 0F, 0F, 11, 6, 4, 0F,0F, 0F, 0F, -2.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.9999F, -5.9999F, 0F, 0F, -5.9999F, 0F, 0F, 0F, 0F); // Box 253
		rightWingModel[35].setRotationPoint(-44F, 1F, 14F);

		rightWingModel[36].addShapeBox(0F, 0F, 0F, 5, 6, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F); // Box 254
		rightWingModel[36].setRotationPoint(-62F, 1F, 14F);

		rightWingModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 49, 0F,-0.25F, 0.75F, 0F, -0.25F, 0.75F, 0F, -0.25F, -16.25F, 0F, -0.25F, -16.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, 15.75F, 0F, -0.25F, 15.75F, 0F); // Box 256
		rightWingModel[37].setRotationPoint(-45F, -40F, 6F);

		rightWingModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 49, 0F,-0.25F, 0.75F, 0F, -0.25F, 0.75F, 0F, -0.25F, -16.25F, 0F, -0.25F, -16.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, 15.75F, 0F, -0.25F, 15.75F, 0F); // Box 257
		rightWingModel[38].setRotationPoint(-47F, -40F, 6F);

		rightWingModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 49, 0F,-0.25F, 0.75F, 0F, -0.25F, 0.75F, 0F, 15.75F, -16.25F, 0F, -16.25F, -16.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, 15.75F, 15.75F, 0F, -16.25F, 15.75F, 0F); // Box 258
		rightWingModel[39].setRotationPoint(-43F, -40F, 6F);

		rightWingModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 33, 0F,-5.25F, -16.25F, 0F, 4.75F, -16.25F, 0F, -0.25F, 3.75F, 0F, -0.25F, 3.75F, 0F, -5.25F, 15.75F, 0F, 4.75F, 15.75F, 0F, -0.25F, -4.25F, 0F, -0.25F, -4.25F, 0F); // Box 259
		rightWingModel[40].setRotationPoint(-45F, -18F, 22F);

		rightWingModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 33, 0F,-5.25F, -16.25F, 0F, 4.75F, -16.25F, 0F, 15.75F, 3.75F, 0F, -16.25F, 3.75F, 0F, -5.25F, 15.75F, 0F, 4.75F, 15.75F, 0F, 15.75F, -4.25F, 0F, -16.25F, -4.25F, 0F); // Box 260
		rightWingModel[41].setRotationPoint(-43F, -18F, 22F);

		rightWingModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 33, 0F,-5.25F, -16.25F, 0F, 4.75F, -16.25F, 0F, 15.75F, 3.75F, 0F, -16.25F, 3.75F, 0F, -5.25F, 15.75F, 0F, 4.75F, 15.75F, 0F, 15.75F, -4.25F, 0F, -16.25F, -4.25F, 0F); // Box 261
		rightWingModel[42].setRotationPoint(-41F, -18F, 22F);

		rightWingModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F,-2.25F, -8.25F, 0F, 1.75F, -8.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -2.25F, 7.75F, 0F, 1.75F, 7.75F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 262
		rightWingModel[43].setRotationPoint(-43F, -17F, 0F);

		rightWingModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F,-2.25F, -8.25F, 0F, 1.75F, -8.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -2.25F, 7.75F, 0F, 1.75F, 7.75F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 263
		rightWingModel[44].setRotationPoint(-44F, -17F, 0F);

		rightWingModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 1.75F, -8.25F, 0F, -2.25F, -8.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 1.75F, 7.75F, 0F, -2.25F, 7.75F, 0F); // Box 264
		rightWingModel[45].setRotationPoint(-42F, -9F, 0F);

		rightWingModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 1.75F, -8.25F, 0F, -2.25F, -8.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 1.75F, 7.75F, 0F, -2.25F, 7.75F, 0F); // Box 265
		rightWingModel[46].setRotationPoint(-41F, -9F, 0F);

		rightWingModel[47].addShapeBox(0F, 0F, 0F, 12, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 266
		rightWingModel[47].setRotationPoint(-56.5F, 6F, 14.5F);

		rightWingModel[48].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 267
		rightWingModel[48].setRotationPoint(-42F, -7F, 29F);

		rightWingModel[49].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 268
		rightWingModel[49].setRotationPoint(-46F, -16F, 44F);

		rightWingModel[50].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 269
		rightWingModel[50].setRotationPoint(-31F, -16F, 44F);

		rightWingModel[51].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 270
		rightWingModel[51].setRotationPoint(-47.5F, -32F, 33F);

		rightWingModel[52].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 271
		rightWingModel[52].setRotationPoint(-47.5F, -37F, 18F);

		rightWingModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 84, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 6.75F, -35.25F, 0F, -7.25F, -35.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 6.75F, 34.75F, 0F, -7.25F, 34.75F, 0F); // Box 273
		rightWingModel[53].setRotationPoint(-46F, -62F, 4F);

		rightWingModel[54].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 317
		rightWingModel[54].setRotationPoint(-61F, -23.5F, 54F);

		rightWingModel[55].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 318
		rightWingModel[55].setRotationPoint(-64F, -23.5F, 54F);
	}

	private void inityawFlapModel_1()
	{
		yawFlapModel[0] = new ModelRendererTurbo(this, 585, 57, textureX, textureY); // Box 90
		yawFlapModel[1] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 91
		yawFlapModel[2] = new ModelRendererTurbo(this, 977, 65, textureX, textureY); // Box 92
		yawFlapModel[3] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Box 93
		yawFlapModel[4] = new ModelRendererTurbo(this, 641, 17, textureX, textureY); // Box 94
		yawFlapModel[5] = new ModelRendererTurbo(this, 873, 1, textureX, textureY); // Box 96
		yawFlapModel[6] = new ModelRendererTurbo(this, 409, 153, textureX, textureY); // Box 227
		yawFlapModel[7] = new ModelRendererTurbo(this, 361, 113, textureX, textureY); // Box 228
		yawFlapModel[8] = new ModelRendererTurbo(this, 201, 161, textureX, textureY); // Box 229
		yawFlapModel[9] = new ModelRendererTurbo(this, 897, 161, textureX, textureY); // Box 230
		yawFlapModel[10] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 231
		yawFlapModel[11] = new ModelRendererTurbo(this, 713, 25, textureX, textureY); // Box 232

		yawFlapModel[0].addShapeBox(0F, 0F, 0F, 13, 7, 2, 0F,0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 90
		yawFlapModel[0].setRotationPoint(69F, -34F, -2F);

		yawFlapModel[1].addShapeBox(0F, 0F, 0F, 11, 4, 2, 0F,0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -3F, 0F, -3F, -2F, 0F, 0F, 1F, 0F); // Box 91
		yawFlapModel[1].setRotationPoint(69F, -27F, -2F);

		yawFlapModel[2].addShapeBox(0F, 0F, 0F, 13, 8, 2, 0F,0F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		yawFlapModel[2].setRotationPoint(69F, -42F, -2F);

		yawFlapModel[3].addShapeBox(0F, 0F, 0F, 12, 7, 2, 0F,0F, 0F, 0F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		yawFlapModel[3].setRotationPoint(69F, -49F, -2F);

		yawFlapModel[4].addShapeBox(0F, 0F, 0F, 9, 3, 2, 0F,0F, 0F, 0F, -6F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		yawFlapModel[4].setRotationPoint(69F, -52F, -2F);

		yawFlapModel[5].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, 0F, -1.9999F, -1.9999F, 0F, 0F, -1.9999F, 0F, 0F, 0.9999F, 0F, 0F, 0F, 0F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		yawFlapModel[5].setRotationPoint(69F, -54F, -2F);

		yawFlapModel[6].addShapeBox(0F, 0F, 0F, 13, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 227
		yawFlapModel[6].setRotationPoint(69F, -34F, 0F);

		yawFlapModel[7].addShapeBox(0F, 0F, 0F, 11, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -3F, -2F, 0F, -4F, -3F, 0F, 0F, 0F, 0F); // Box 228
		yawFlapModel[7].setRotationPoint(69F, -27F, 0F);

		yawFlapModel[8].addShapeBox(0F, 0F, 0F, 13, 8, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 229
		yawFlapModel[8].setRotationPoint(69F, -42F, 0F);

		yawFlapModel[9].addShapeBox(0F, 0F, 0F, 12, 7, 2, 0F,0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 230
		yawFlapModel[9].setRotationPoint(69F, -49F, 0F);

		yawFlapModel[10].addShapeBox(0F, 0F, 0F, 9, 3, 2, 0F,0F, 0F, 0F, -4F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 231
		yawFlapModel[10].setRotationPoint(69F, -52F, 0F);

		yawFlapModel[11].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0.9999F, 0F, 0F, -1.9999F, 0F, -1.9999F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9999F, 0F, 0F, 0F, 0F, 0F); // Box 232
		yawFlapModel[11].setRotationPoint(69F, -54F, 0F);
	}

	private void initpitchFlapLeftModel_1()
	{
		pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 849, 49, textureX, textureY); // Box 86
		pitchFlapLeftModel[1] = new ModelRendererTurbo(this, 649, 57, textureX, textureY); // Box 87
		pitchFlapLeftModel[2] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 88
		pitchFlapLeftModel[3] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Box 89

		pitchFlapLeftModel[0].addShapeBox(0F, 0F, 0F, 11, 3, 7, 0F,0F, 0F, 0F, 0F, -1F, 0F, -3F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, -1F, -2F, 0F, 0F, 0F); // Box 86
		pitchFlapLeftModel[0].setRotationPoint(62F, -30F, -10F);

		pitchFlapLeftModel[1].addShapeBox(0F, 0F, 0F, 11, 3, 11, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 87
		pitchFlapLeftModel[1].setRotationPoint(62F, -30F, -21F);

		pitchFlapLeftModel[2].addShapeBox(0F, 0F, 0F, 11, 3, 6, 0F,0F, 0F, 0F, -3F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 88
		pitchFlapLeftModel[2].setRotationPoint(62F, -30F, -27F);

		pitchFlapLeftModel[3].addShapeBox(0F, 0F, 0F, 8, 3, 5, 0F,0F, -1F, 0F, -7F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -7F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 89
		pitchFlapLeftModel[3].setRotationPoint(62F, -30F, -32F);
	}

	private void initpitchFlapRightModel_1()
	{
		pitchFlapRightModel[0] = new ModelRendererTurbo(this, 625, 145, textureX, textureY); // Box 223
		pitchFlapRightModel[1] = new ModelRendererTurbo(this, 977, 153, textureX, textureY); // Box 224
		pitchFlapRightModel[2] = new ModelRendererTurbo(this, 49, 161, textureX, textureY); // Box 225
		pitchFlapRightModel[3] = new ModelRendererTurbo(this, 321, 113, textureX, textureY); // Box 226

		pitchFlapRightModel[0].addShapeBox(0F, 0F, 0F, 11, 3, 7, 0F,0F, 0F, 0F, -3F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 223
		pitchFlapRightModel[0].setRotationPoint(62F, -30F, 3F);

		pitchFlapRightModel[1].addShapeBox(0F, 0F, 0F, 11, 3, 11, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 224
		pitchFlapRightModel[1].setRotationPoint(62F, -30F, 10F);

		pitchFlapRightModel[2].addShapeBox(0F, 0F, 0F, 11, 3, 6, 0F,0F, 0F, 0F, 0F, -1F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, -1F, 0F, 0F, 0F, 0F); // Box 225
		pitchFlapRightModel[2].setRotationPoint(62F, -30F, 21F);

		pitchFlapRightModel[3].addShapeBox(0F, 0F, 0F, 8, 3, 5, 0F,0F, 0F, 0F, 0F, -1F, 0F, -7F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -7F, -1F, 0F, 0F, -1F, 0F); // Box 226
		pitchFlapRightModel[3].setRotationPoint(62F, -30F, 27F);
	}

	private void initpitchFlapLeftWingModel_1()
	{
		pitchFlapLeftWingModel[0] = new ModelRendererTurbo(this, 305, 49, textureX, textureY); // Box 68
		pitchFlapLeftWingModel[1] = new ModelRendererTurbo(this, 361, 49, textureX, textureY); // Box 69
		pitchFlapLeftWingModel[2] = new ModelRendererTurbo(this, 473, 49, textureX, textureY); // Box 70
		pitchFlapLeftWingModel[3] = new ModelRendererTurbo(this, 777, 41, textureX, textureY); // Box 71

		pitchFlapLeftWingModel[0].addShapeBox(0F, 0F, 0F, 16, 6, 18, 0F,0F, 0F, 0F, 4F, -4F, 0F, 4F, -5F, 0F, -4F, -1F, 0F, 0F, -1F, 0F, 4F, -1F, 0F, 4F, 0F, 0F, -4F, 0F, 0F); // Box 68
		pitchFlapLeftWingModel[0].setRotationPoint(-29F, -25F, -53F);

		pitchFlapLeftWingModel[1].addShapeBox(0F, 0F, 0F, 22, 6, 10, 0F,0F, -0.5F, 0F, -2F, -4F, 0F, 0F, -5F, 0F, -2F, -1F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 69
		pitchFlapLeftWingModel[1].setRotationPoint(-31F, -26F, -63F);

		pitchFlapLeftWingModel[2].addShapeBox(0F, 0F, 0F, 20, 6, 18, 0F,0F, -0.5F, 0F, -6F, -4F, 0F, 4F, -5F, 0F, -4F, -1.5F, 0F, 0F, -1F, 0F, -6F, -1F, 0F, 4F, 0F, 0F, -4F, 0F, 0F); // Box 70
		pitchFlapLeftWingModel[2].setRotationPoint(-35F, -27F, -81F);

		pitchFlapLeftWingModel[3].addShapeBox(0F, 0F, 0F, 15, 6, 7, 0F,0F, -1F, 0F, -6F, -4F, 0F, 0F, -5F, 0F, -1F, -1.5F, 0F, 0F, -1F, 0F, -6F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 71
		pitchFlapLeftWingModel[3].setRotationPoint(-36F, -28F, -88F);
	}

	private void initpitchFlapRightWingModel_1()
	{
		pitchFlapRightWingModel[0] = new ModelRendererTurbo(this, 81, 153, textureX, textureY); // Box 205
		pitchFlapRightWingModel[1] = new ModelRendererTurbo(this, 297, 145, textureX, textureY); // Box 206
		pitchFlapRightWingModel[2] = new ModelRendererTurbo(this, 345, 153, textureX, textureY); // Box 207
		pitchFlapRightWingModel[3] = new ModelRendererTurbo(this, 553, 145, textureX, textureY); // Box 208

		pitchFlapRightWingModel[0].addShapeBox(0F, 0F, 0F, 16, 6, 18, 0F,-4F, -1F, 0F, 4F, -5F, 0F, 4F, -4F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F, -1F, 0F, 0F, -1F, 0F); // Box 205
		pitchFlapRightWingModel[0].setRotationPoint(-29F, -25F, 35F);

		pitchFlapRightWingModel[1].addShapeBox(0F, 0F, 0F, 22, 6, 10, 0F,-2F, -1F, 0F, 0F, -5F, 0F, -2F, -4F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 0F, -1F, 0F); // Box 206
		pitchFlapRightWingModel[1].setRotationPoint(-31F, -26F, 53F);

		pitchFlapRightWingModel[2].addShapeBox(0F, 0F, 0F, 20, 6, 18, 0F,-4F, -1.5F, 0F, 4F, -5F, 0F, -6F, -4F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, -6F, -1F, 0F, 0F, -1F, 0F); // Box 207
		pitchFlapRightWingModel[2].setRotationPoint(-35F, -27F, 63F);

		pitchFlapRightWingModel[3].addShapeBox(0F, 0F, 0F, 15, 6, 7, 0F,-1F, -1.5F, 0F, 0F, -5F, 0F, -6F, -4F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -6F, -1F, 0F, 0F, -1F, 0F); // Box 208
		pitchFlapRightWingModel[3].setRotationPoint(-36F, -28F, 81F);
	}

	private void initPropeller()
	{
		propellerModels = new ModelRendererTurbo[1][2];
		propellerModels[0] = makeProp1(-77F, -28F, 0F);
	}

	private ModelRendererTurbo[] makeProp1(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[2];
		prop[0] = new ModelRendererTurbo(this, 0, 235, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 235, textureX, textureY);
		prop[0].addBox(-1F, -24F, -1.5F, 2, 24, 3, 0.0F);
		prop[1].addBox(-1F, -24F, -1.5F, 2, 24, 3, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		return prop;
	}
}