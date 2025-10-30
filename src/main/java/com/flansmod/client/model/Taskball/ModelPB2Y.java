//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: PB2Y
// Model Creator: 
// Created on: 23.05.2023 - 18:14:27
// Last changed on: 23.05.2023 - 18:14:27

package com.flansmod.client.model.Taskball; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelPB2Y extends ModelPlane //Same as Filename
{
	int textureX = 2048;
	int textureY = 1024;

	public ModelPB2Y() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[93];
		noseModel = new ModelRendererTurbo[12];
		tailModel = new ModelRendererTurbo[52];
		leftWingModel = new ModelRendererTurbo[100];
		rightWingModel = new ModelRendererTurbo[100];
		pitchFlapLeftModel = new ModelRendererTurbo[1];
		pitchFlapRightModel = new ModelRendererTurbo[1];
		pitchFlapLeftWingModel = new ModelRendererTurbo[1];
		pitchFlapRightWingModel = new ModelRendererTurbo[1];
		planeModeParts = new ModelRendererTurbo[50];

		initbodyModel_1();
		initnoseModel_1();
		inittailModel_1();
		initleftWingModel_1();
		initrightWingModel_1();
		initpitchFlapLeftModel_1();
		initpitchFlapRightModel_1();
		initpitchFlapLeftWingModel_1();
		initpitchFlapRightWingModel_1();
		initplaneModeParts_1();

		initPropeller();

		initGuns();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 609, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 817, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 905, 1, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 1257, 1, textureX, textureY); // Box 8
		bodyModel[7] = new ModelRendererTurbo(this, 1441, 1, textureX, textureY); // Box 9
		bodyModel[8] = new ModelRendererTurbo(this, 1625, 1, textureX, textureY); // Box 10
		bodyModel[9] = new ModelRendererTurbo(this, 1841, 1, textureX, textureY); // Box 11
		bodyModel[10] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 12
		bodyModel[11] = new ModelRendererTurbo(this, 577, 57, textureX, textureY); // Box 13
		bodyModel[12] = new ModelRendererTurbo(this, 1321, 57, textureX, textureY); // Box 17
		bodyModel[13] = new ModelRendererTurbo(this, 1489, 57, textureX, textureY); // Box 18
		bodyModel[14] = new ModelRendererTurbo(this, 1801, 1, textureX, textureY); // Box 19
		bodyModel[15] = new ModelRendererTurbo(this, 1785, 81, textureX, textureY); // Box 23
		bodyModel[16] = new ModelRendererTurbo(this, 1177, 97, textureX, textureY); // Box 24
		bodyModel[17] = new ModelRendererTurbo(this, 1313, 105, textureX, textureY); // Box 25
		bodyModel[18] = new ModelRendererTurbo(this, 705, 57, textureX, textureY); // Box 26
		bodyModel[19] = new ModelRendererTurbo(this, 1641, 105, textureX, textureY); // Box 30
		bodyModel[20] = new ModelRendererTurbo(this, 705, 113, textureX, textureY); // Box 33
		bodyModel[21] = new ModelRendererTurbo(this, 977, 113, textureX, textureY); // Box 34
		bodyModel[22] = new ModelRendererTurbo(this, 1801, 113, textureX, textureY); // Box 36
		bodyModel[23] = new ModelRendererTurbo(this, 953, 65, textureX, textureY); // Box 138
		bodyModel[24] = new ModelRendererTurbo(this, 329, 81, textureX, textureY); // Box 140
		bodyModel[25] = new ModelRendererTurbo(this, 537, 73, textureX, textureY); // Box 141
		bodyModel[26] = new ModelRendererTurbo(this, 465, 273, textureX, textureY); // Box 142
		bodyModel[27] = new ModelRendererTurbo(this, 1809, 57, textureX, textureY); // Box 143
		bodyModel[28] = new ModelRendererTurbo(this, 1225, 25, textureX, textureY); // Box 144
		bodyModel[29] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 145
		bodyModel[30] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 146
		bodyModel[31] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 147
		bodyModel[32] = new ModelRendererTurbo(this, 1329, 57, textureX, textureY); // Box 148
		bodyModel[33] = new ModelRendererTurbo(this, 577, 33, textureX, textureY); // Box 149
		bodyModel[34] = new ModelRendererTurbo(this, 1265, 17, textureX, textureY); // Box 150
		bodyModel[35] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 151
		bodyModel[36] = new ModelRendererTurbo(this, 609, 33, textureX, textureY); // Box 152
		bodyModel[37] = new ModelRendererTurbo(this, 985, 65, textureX, textureY); // Box 153
		bodyModel[38] = new ModelRendererTurbo(this, 785, 33, textureX, textureY); // Box 154
		bodyModel[39] = new ModelRendererTurbo(this, 2033, 17, textureX, textureY); // Box 155
		bodyModel[40] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 156
		bodyModel[41] = new ModelRendererTurbo(this, 1945, 321, textureX, textureY); // Box 171
		bodyModel[42] = new ModelRendererTurbo(this, 1, 337, textureX, textureY); // Box 172
		bodyModel[43] = new ModelRendererTurbo(this, 481, 345, textureX, textureY); // Box 173
		bodyModel[44] = new ModelRendererTurbo(this, 689, 369, textureX, textureY); // Box 174
		bodyModel[45] = new ModelRendererTurbo(this, 1121, 345, textureX, textureY); // Box 175
		bodyModel[46] = new ModelRendererTurbo(this, 1745, 329, textureX, textureY); // Box 176
		bodyModel[47] = new ModelRendererTurbo(this, 193, 337, textureX, textureY); // Box 177
		bodyModel[48] = new ModelRendererTurbo(this, 1, 377, textureX, textureY); // Box 180
		bodyModel[49] = new ModelRendererTurbo(this, 969, 393, textureX, textureY); // Box 181
		bodyModel[50] = new ModelRendererTurbo(this, 1121, 417, textureX, textureY); // Box 182
		bodyModel[51] = new ModelRendererTurbo(this, 1529, 417, textureX, textureY); // Box 183
		bodyModel[52] = new ModelRendererTurbo(this, 449, 425, textureX, textureY); // Box 184
		bodyModel[53] = new ModelRendererTurbo(this, 1337, 425, textureX, textureY); // Box 185
		bodyModel[54] = new ModelRendererTurbo(this, 1681, 377, textureX, textureY); // Box 189
		bodyModel[55] = new ModelRendererTurbo(this, 1713, 441, textureX, textureY); // Box 190
		bodyModel[56] = new ModelRendererTurbo(this, 833, 265, textureX, textureY); // Box 191
		bodyModel[57] = new ModelRendererTurbo(this, 961, 297, textureX, textureY); // Box 195
		bodyModel[58] = new ModelRendererTurbo(this, 1881, 441, textureX, textureY); // Box 196
		bodyModel[59] = new ModelRendererTurbo(this, 1, 465, textureX, textureY); // Box 197
		bodyModel[60] = new ModelRendererTurbo(this, 1953, 233, textureX, textureY); // Box 198
		bodyModel[61] = new ModelRendererTurbo(this, 1001, 473, textureX, textureY); // Box 202
		bodyModel[62] = new ModelRendererTurbo(this, 249, 489, textureX, textureY); // Box 205
		bodyModel[63] = new ModelRendererTurbo(this, 1873, 473, textureX, textureY); // Box 206
		bodyModel[64] = new ModelRendererTurbo(this, 1673, 489, textureX, textureY); // Box 208
		bodyModel[65] = new ModelRendererTurbo(this, 1153, 145, textureX, textureY); // Box 310
		bodyModel[66] = new ModelRendererTurbo(this, 1609, 145, textureX, textureY); // Box 311
		bodyModel[67] = new ModelRendererTurbo(this, 1985, 153, textureX, textureY); // Box 312
		bodyModel[68] = new ModelRendererTurbo(this, 1433, 681, textureX, textureY); // Box 313
		bodyModel[69] = new ModelRendererTurbo(this, 1961, 81, textureX, textureY); // Box 314
		bodyModel[70] = new ModelRendererTurbo(this, 1409, 33, textureX, textureY); // Box 315
		bodyModel[71] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 316
		bodyModel[72] = new ModelRendererTurbo(this, 817, 1, textureX, textureY); // Box 317
		bodyModel[73] = new ModelRendererTurbo(this, 1441, 33, textureX, textureY); // Box 318
		bodyModel[74] = new ModelRendererTurbo(this, 1497, 65, textureX, textureY); // Box 319
		bodyModel[75] = new ModelRendererTurbo(this, 1593, 33, textureX, textureY); // Box 320
		bodyModel[76] = new ModelRendererTurbo(this, 1993, 81, textureX, textureY); // Box 321
		bodyModel[77] = new ModelRendererTurbo(this, 1409, 17, textureX, textureY); // Box 322
		bodyModel[78] = new ModelRendererTurbo(this, 1625, 33, textureX, textureY); // Box 323
		bodyModel[79] = new ModelRendererTurbo(this, 1473, 89, textureX, textureY); // Box 324
		bodyModel[80] = new ModelRendererTurbo(this, 1001, 81, textureX, textureY); // Box 325
		bodyModel[81] = new ModelRendererTurbo(this, 1657, 105, textureX, textureY); // Box 326
		bodyModel[82] = new ModelRendererTurbo(this, 1457, 17, textureX, textureY); // Box 327
		bodyModel[83] = new ModelRendererTurbo(this, 1, 689, textureX, textureY); // Box 338
		bodyModel[84] = new ModelRendererTurbo(this, 1705, 705, textureX, textureY); // Box 409
		bodyModel[85] = new ModelRendererTurbo(this, 1809, 705, textureX, textureY); // Box 410
		bodyModel[86] = new ModelRendererTurbo(this, 1593, 169, textureX, textureY); // Box 726
		bodyModel[87] = new ModelRendererTurbo(this, 505, 185, textureX, textureY); // Box 727
		bodyModel[88] = new ModelRendererTurbo(this, 1497, 81, textureX, textureY); // Box 728
		bodyModel[89] = new ModelRendererTurbo(this, 2025, 137, textureX, textureY); // Box 729
		bodyModel[90] = new ModelRendererTurbo(this, 209, 97, textureX, textureY); // Box 730
		bodyModel[91] = new ModelRendererTurbo(this, 425, 169, textureX, textureY); // Box 731
		bodyModel[92] = new ModelRendererTurbo(this, 545, 153, textureX, textureY); // Box 732

		bodyModel[0].addShapeBox(0F, 0F, 0F, 67, 13, 26, 0F,0F, 0F, -7F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-162F, -80F, -26F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 67, 38, 34, 0F,0F, 0F, -13F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F); // Box 1
		bodyModel[1].setRotationPoint(-162F, -67F, -34F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 67, 29, 35, 0F,0F, 0F, -2F, 0F, -9F, -1F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 2
		bodyModel[2].setRotationPoint(-162F, -38F, -35F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 67, 17, 36, 0F,0F, 3F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -5F, -1F, 0F, 0F, 0F, 0F, 18F, 0F, 0F, 15F, 0F); // Box 3
		bodyModel[3].setRotationPoint(-162F, -9F, -36F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 28, 29, 13, 0F,0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 4
		bodyModel[4].setRotationPoint(-190F, -67F, -33F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 28, 26, 33, 0F,0F, 2F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -5F, -3F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 5
		bodyModel[5].setRotationPoint(-190F, -38F, -33F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 55, 17, 36, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 18F, 0F, 0F, 18F, 0F); // Box 8
		bodyModel[6].setRotationPoint(-95F, -9F, -36F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 55, 20, 35, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[7].setRotationPoint(-95F, -29F, -35F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 69, 20, 35, 0F,0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -2F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[8].setRotationPoint(-40F, -29F, -35F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 55, 38, 34, 0F,0F, 0F, -9F, 0F, -3F, -7F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[9].setRotationPoint(-95F, -67F, -34F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 69, 35, 34, 0F,0F, 0F, -7F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[10].setRotationPoint(-40F, -64F, -34F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 45, 36, 34, 0F,0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[11].setRotationPoint(29F, -64F, -34F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 55, 13, 27, 0F,0F, 0F, -7F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[12].setRotationPoint(-95F, -80F, -27F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 69, 16, 27, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[13].setRotationPoint(-40F, -80F, -27F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 20, 16, 16, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[14].setRotationPoint(29F, -80F, -26F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 67, 4, 20, 0F,0F, 0F, -7F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[15].setRotationPoint(-162F, -84F, -20F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 55, 4, 21, 0F,0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[16].setRotationPoint(-95F, -84F, -21F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 69, 4, 21, 0F,0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[17].setRotationPoint(-40F, -84F, -21F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 25, 4, 21, 0F,0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[18].setRotationPoint(49F, -84F, -21F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 45, 14, 34, 0F,0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -19F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[19].setRotationPoint(29F, -28F, -34F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 69, 12, 35, 0F,0F, 0F, 0F, 0F, 5F, -2F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.699999999999999F, 0F, -3F, -7F, 0F, 11F, 0F, 0F, 19F, 0F); // Box 33
		bodyModel[20].setRotationPoint(-40F, -9F, -35F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 45, 14, 33, 0F,0F, 0F, 0F, 0F, 2F, -18F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -1F, -16F, 0F, 12F, 0F, 0F, 14F, 0F); // Box 34
		bodyModel[21].setRotationPoint(29F, -14F, -33F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 28, 15, 35, 0F,0F, 5F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -7F, -5F, 0F, 0F, 0F, 0F, 20F, 0F, 0F, 15F, 0F); // Box 36
		bodyModel[22].setRotationPoint(-190F, -12F, -35F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 7, 20, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[23].setRotationPoint(29F, -84F, -10F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 7, 20, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F); // Box 140
		bodyModel[24].setRotationPoint(42F, -84F, -10F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 20, 4, 11, 0F,0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[25].setRotationPoint(29F, -84F, -21F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 25, 16, 26, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		bodyModel[26].setRotationPoint(49F, -80F, -26F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 14, 4, 1, 0F,0F, 0F, -5.9999F, -13.9999F, 0F, -5.9999F, -13.9999F, 0F, 5.9999F, 0F, 0F, 5.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[27].setRotationPoint(-190F, -71F, -21F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		bodyModel[28].setRotationPoint(-174F, -80F, -19F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 2F, -2F, 0F, 2F, -2F, 0F, -2F, 2F, 0F, -2F); // Box 145
		bodyModel[29].setRotationPoint(-174F, -80F, -19F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F); // Box 146
		bodyModel[30].setRotationPoint(-174F, -80F, -19F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, -9F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, -1F, 0F, 9F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, -1F); // Box 147
		bodyModel[31].setRotationPoint(-190F, -80F, -14F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,4F, 0F, 0F, -4F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F); // Box 148
		bodyModel[32].setRotationPoint(-177F, -80F, -14F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[33].setRotationPoint(-174F, -84F, -13F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[34].setRotationPoint(-174F, -84F, -19F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -4F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -1F, 0F, 4F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -1F); // Box 151
		bodyModel[35].setRotationPoint(-181F, -84F, -13F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152
		bodyModel[36].setRotationPoint(-174F, -84F, -6F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[37].setRotationPoint(-174F, -84F, -13F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); // Box 154
		bodyModel[38].setRotationPoint(-184F, -84F, -6F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[39].setRotationPoint(-184F, -80F, -6F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F); // Box 156
		bodyModel[40].setRotationPoint(-190F, -80F, -6F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 28, 15, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		bodyModel[41].setRotationPoint(-190F, -53F, -20F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 67, 13, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -5F); // Box 172
		bodyModel[42].setRotationPoint(-162F, -80F, 0F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 67, 38, 34, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -13F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, -1F); // Box 173
		bodyModel[43].setRotationPoint(-162F, -67F, 0F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 67, 29, 35, 0F,0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, -1F, 0F, 0F, -2F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 174
		bodyModel[44].setRotationPoint(-162F, -38F, 0F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 67, 17, 36, 0F,0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 3F, -1F, 0F, 15F, 0F, 0F, 18F, 0F, 0F, 0F, 0F, 0F, -5F, -1F); // Box 175
		bodyModel[45].setRotationPoint(-162F, -9F, 0F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 28, 29, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -5F); // Box 176
		bodyModel[46].setRotationPoint(-190F, -67F, 20F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 28, 26, 33, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -5F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -5F, -3F); // Box 177
		bodyModel[47].setRotationPoint(-190F, -38F, 0F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 55, 17, 36, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 18F, 0F, 0F, 18F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[48].setRotationPoint(-95F, -9F, 0F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 55, 20, 35, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		bodyModel[49].setRotationPoint(-95F, -29F, 0F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 69, 20, 35, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, -2F, 0F, 0F, 0F); // Box 182
		bodyModel[50].setRotationPoint(-40F, -29F, 0F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 55, 38, 34, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -7F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		bodyModel[51].setRotationPoint(-95F, -67F, 0F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 69, 35, 34, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 184
		bodyModel[52].setRotationPoint(-40F, -64F, 0F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 45, 36, 34, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F); // Box 185
		bodyModel[53].setRotationPoint(29F, -64F, 0F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 55, 13, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, -2F); // Box 189
		bodyModel[54].setRotationPoint(-95F, -80F, 0F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 69, 16, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 190
		bodyModel[55].setRotationPoint(-40F, -80F, 0F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 20, 16, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 191
		bodyModel[56].setRotationPoint(29F, -80F, 10F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 67, 4, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 195
		bodyModel[57].setRotationPoint(-162F, -84F, 0F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 55, 4, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 196
		bodyModel[58].setRotationPoint(-95F, -84F, 0F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 69, 4, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		bodyModel[59].setRotationPoint(-40F, -84F, 0F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 25, 4, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		bodyModel[60].setRotationPoint(49F, -84F, 0F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 45, 14, 34, 0F,0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -19F, 0F, 0F, -1F); // Box 202
		bodyModel[61].setRotationPoint(29F, -28F, 0F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 69, 12, 35, 0F,0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, -2F, 0F, 0F, 0F, 0F, 19F, 0F, 0F, 11F, 0F, 0F, -3F, -7F, 0F, 0F, 0.699999999999999F); // Box 205
		bodyModel[62].setRotationPoint(-40F, -9F, 0F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 45, 14, 33, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -18F, 0F, 0F, 0F, 0F, 14F, 0F, 0F, 12F, 0F, 0F, -1F, -16F, 0F, 0F, -5F); // Box 206
		bodyModel[63].setRotationPoint(29F, -14F, 0F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 28, 15, 35, 0F,0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, -5F, 0F, 15F, 0F, 0F, 20F, 0F, 0F, 0F, 0F, 0F, -7F, -5F); // Box 208
		bodyModel[64].setRotationPoint(-190F, -12F, 0F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 7, 20, 7, 0F,0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 310
		bodyModel[65].setRotationPoint(29F, -84F, 3F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 7, 20, 7, 0F,-7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 311
		bodyModel[66].setRotationPoint(42F, -84F, 3F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 20, 4, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 312
		bodyModel[67].setRotationPoint(29F, -84F, 10F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 25, 16, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 313
		bodyModel[68].setRotationPoint(49F, -80F, 0F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 14, 4, 1, 0F,0F, 0F, 5.9999F, -13.9999F, 0F, 5.9999F, -13.9999F, 0F, -5.9999F, 0F, 0F, -5.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 314
		bodyModel[69].setRotationPoint(-190F, -71F, 20F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[70].setRotationPoint(-174F, -80F, 18F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 2F, 2F, 0F, 2F); // Box 316
		bodyModel[71].setRotationPoint(-174F, -80F, 18F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 317
		bodyModel[72].setRotationPoint(-174F, -80F, 14F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, -9F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 1F, 0F, 9F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 1F); // Box 318
		bodyModel[73].setRotationPoint(-190F, -80F, 13F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,7F, 0F, 0F, -7F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F); // Box 319
		bodyModel[74].setRotationPoint(-177F, -80F, 6F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 320
		bodyModel[75].setRotationPoint(-174F, -84F, 12F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F); // Box 321
		bodyModel[76].setRotationPoint(-174F, -84F, 13F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 1F, 0F, 4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 1F); // Box 322
		bodyModel[77].setRotationPoint(-181F, -84F, 12F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 323
		bodyModel[78].setRotationPoint(-174F, -84F, 5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324
		bodyModel[79].setRotationPoint(-174F, -84F, 0F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); // Box 325
		bodyModel[80].setRotationPoint(-184F, -84F, 5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 326
		bodyModel[81].setRotationPoint(-184F, -80F, 0F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F); // Box 327
		bodyModel[82].setRotationPoint(-190F, -80F, 5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 28, 15, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 338
		bodyModel[83].setRotationPoint(-190F, -53F, 0F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 10, 8, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 409
		bodyModel[84].setRotationPoint(-190F, -67F, -20F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 10, 3, 40, 0F,0F, 0F, -5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 410
		bodyModel[85].setRotationPoint(-190F, -70F, -20F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 13, 10, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 726
		bodyModel[86].setRotationPoint(31.25F, -83.5F, -5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 12, 8, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 727
		bodyModel[87].setRotationPoint(32.25F, -82.5F, -4F);

		bodyModel[88].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 728
		bodyModel[88].setRotationPoint(31.25F, -71.5F, -5F);
		bodyModel[88].rotateAngleZ = 0.10471976F;

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 729
		bodyModel[89].setRotationPoint(31.25F, -71.5F, -5F);
		bodyModel[89].rotateAngleZ = 0.10471976F;

		bodyModel[90].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 730
		bodyModel[90].setRotationPoint(31.25F, -71.5F, 4F);
		bodyModel[90].rotateAngleZ = 0.10471976F;

		bodyModel[91].addShapeBox(0F, 1F, 0F, 10, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 731
		bodyModel[91].setRotationPoint(31.25F, -71.5F, -5F);
		bodyModel[91].rotateAngleZ = 0.10471976F;

		bodyModel[92].addShapeBox(9F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 732
		bodyModel[92].setRotationPoint(31.25F, -71.5F, -5F);
		bodyModel[92].rotateAngleZ = 0.10471976F;
	}

	private void initnoseModel_1()
	{
		noseModel[0] = new ModelRendererTurbo(this, 1033, 1, textureX, textureY); // Box 6
		noseModel[1] = new ModelRendererTurbo(this, 1145, 1, textureX, textureY); // Box 7
		noseModel[2] = new ModelRendererTurbo(this, 161, 121, textureX, textureY); // Box 37
		noseModel[3] = new ModelRendererTurbo(this, 497, 113, textureX, textureY); // Box 38
		noseModel[4] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 39
		noseModel[5] = new ModelRendererTurbo(this, 1105, 113, textureX, textureY); // Box 40
		noseModel[6] = new ModelRendererTurbo(this, 1569, 361, textureX, textureY); // Box 178
		noseModel[7] = new ModelRendererTurbo(this, 897, 369, textureX, textureY); // Box 179
		noseModel[8] = new ModelRendererTurbo(this, 1, 497, textureX, textureY); // Box 209
		noseModel[9] = new ModelRendererTurbo(this, 1713, 193, textureX, textureY); // Box 211
		noseModel[10] = new ModelRendererTurbo(this, 1945, 393, textureX, textureY); // Box 212
		noseModel[11] = new ModelRendererTurbo(this, 1729, 601, textureX, textureY); // Box 356

		noseModel[0].addShapeBox(0F, 0F, 0F, 25, 27, 28, 0F,0F, -8F, -17F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -3F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 6
		noseModel[0].setRotationPoint(-215F, -67F, -28F);

		noseModel[1].addShapeBox(0F, 0F, 0F, 25, 23, 28, 0F,0F, 3F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -9F, -9F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, -9F, 0F); // Box 7
		noseModel[1].setRotationPoint(-215F, -40F, -28F);

		noseModel[2].addShapeBox(0F, 0F, 0F, 25, 13, 30, 0F,0F, 9F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, -10F, -11F, 0F, 0F, 0F, 0F, 22F, 0F, 0F, 3F, 0F); // Box 37
		noseModel[2].setRotationPoint(-215F, -17F, -30F);

		noseModel[3].addShapeBox(0F, 0F, 0F, 15, 17, 19, 0F,0F, 0F, -11F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 38
		noseModel[3].setRotationPoint(-230F, -43F, -19F);

		noseModel[4].addShapeBox(0F, 0F, 0F, 13, 12, 19, 0F,0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -10F, -13F, 0F, 0F, 0F, 0F, 13F, 0F, -1F, -9F, 0F); // Box 39
		noseModel[4].setRotationPoint(-228F, -26F, -19F);

		noseModel[5].addShapeBox(0F, 0F, 0F, 25, 4, 21, 0F,0F, -8F, -15F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 8F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F); // Box 40
		noseModel[5].setRotationPoint(-215F, -71F, -21F);

		noseModel[6].addShapeBox(0F, 0F, 0F, 25, 27, 28, 0F,0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -8F, -17F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -11F); // Box 178
		noseModel[6].setRotationPoint(-215F, -67F, 0F);

		noseModel[7].addShapeBox(0F, 0F, 0F, 25, 23, 28, 0F,0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -11F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -9F, -9F); // Box 179
		noseModel[7].setRotationPoint(-215F, -40F, 0F);

		noseModel[8].addShapeBox(0F, 0F, 0F, 25, 13, 30, 0F,0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, -11F, 0F, 3F, 0F, 0F, 22F, 0F, 0F, 0F, 0F, 0F, -10F, -11F); // Box 209
		noseModel[8].setRotationPoint(-215F, -17F, 0F);

		noseModel[9].addShapeBox(0F, 0F, 0F, 13, 12, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, -1F, -9F, 0F, 0F, 13F, 0F, 0F, 0F, 0F, -1F, -10F, -13F); // Box 211
		noseModel[9].setRotationPoint(-228F, -26F, 0F);

		noseModel[10].addShapeBox(0F, 0F, 0F, 25, 4, 21, 0F,0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -8F, -15F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, -10F); // Box 212
		noseModel[10].setRotationPoint(-215F, -71F, 0F);

		noseModel[11].addShapeBox(0F, 0F, 0F, 15, 17, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -11F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -11F); // Box 356
		noseModel[11].setRotationPoint(-230F, -43F, 0F);
	}

	private void inittailModel_1()
	{
		tailModel[0] = new ModelRendererTurbo(this, 785, 49, textureX, textureY); // Box 14
		tailModel[1] = new ModelRendererTurbo(this, 1001, 57, textureX, textureY); // Box 15
		tailModel[2] = new ModelRendererTurbo(this, 1201, 57, textureX, textureY); // Box 16
		tailModel[3] = new ModelRendererTurbo(this, 1689, 57, textureX, textureY); // Box 20
		tailModel[4] = new ModelRendererTurbo(this, 377, 73, textureX, textureY); // Box 21
		tailModel[5] = new ModelRendererTurbo(this, 209, 81, textureX, textureY); // Box 22
		tailModel[6] = new ModelRendererTurbo(this, 1945, 89, textureX, textureY); // Box 27
		tailModel[7] = new ModelRendererTurbo(this, 1497, 105, textureX, textureY); // Box 28
		tailModel[8] = new ModelRendererTurbo(this, 897, 97, textureX, textureY); // Box 29
		tailModel[9] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 31
		tailModel[10] = new ModelRendererTurbo(this, 297, 113, textureX, textureY); // Box 32
		tailModel[11] = new ModelRendererTurbo(this, 97, 113, textureX, textureY); // Box 35
		tailModel[12] = new ModelRendererTurbo(this, 1929, 121, textureX, textureY); // Box 41
		tailModel[13] = new ModelRendererTurbo(this, 577, 1, textureX, textureY); // Box 42
		tailModel[14] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 43
		tailModel[15] = new ModelRendererTurbo(this, 1001, 1, textureX, textureY); // Box 44
		tailModel[16] = new ModelRendererTurbo(this, 1113, 1, textureX, textureY); // Box 45
		tailModel[17] = new ModelRendererTurbo(this, 801, 233, textureX, textureY); // Box 157
		tailModel[18] = new ModelRendererTurbo(this, 881, 121, textureX, textureY); // Box 158
		tailModel[19] = new ModelRendererTurbo(this, 201, 281, textureX, textureY); // Box 159
		tailModel[20] = new ModelRendererTurbo(this, 2009, 65, textureX, textureY); // Box 160
		tailModel[21] = new ModelRendererTurbo(this, 1761, 321, textureX, textureY); // Box 161
		tailModel[22] = new ModelRendererTurbo(this, 249, 313, textureX, textureY); // Box 163
		tailModel[23] = new ModelRendererTurbo(this, 1457, 329, textureX, textureY); // Box 164
		tailModel[24] = new ModelRendererTurbo(this, 1, 297, textureX, textureY); // Box 165
		tailModel[25] = new ModelRendererTurbo(this, 1601, 329, textureX, textureY); // Box 166
		tailModel[26] = new ModelRendererTurbo(this, 153, 401, textureX, textureY); // Box 186
		tailModel[27] = new ModelRendererTurbo(this, 657, 441, textureX, textureY); // Box 187
		tailModel[28] = new ModelRendererTurbo(this, 1297, 345, textureX, textureY); // Box 188
		tailModel[29] = new ModelRendererTurbo(this, 873, 425, textureX, textureY); // Box 192
		tailModel[30] = new ModelRendererTurbo(this, 265, 441, textureX, textureY); // Box 193
		tailModel[31] = new ModelRendererTurbo(this, 377, 345, textureX, textureY); // Box 194
		tailModel[32] = new ModelRendererTurbo(this, 1945, 361, textureX, textureY); // Box 199
		tailModel[33] = new ModelRendererTurbo(this, 857, 473, textureX, textureY); // Box 200
		tailModel[34] = new ModelRendererTurbo(this, 977, 369, textureX, textureY); // Box 201
		tailModel[35] = new ModelRendererTurbo(this, 153, 465, textureX, textureY); // Box 203
		tailModel[36] = new ModelRendererTurbo(this, 1161, 473, textureX, textureY); // Box 204
		tailModel[37] = new ModelRendererTurbo(this, 377, 385, textureX, textureY); // Box 207
		tailModel[38] = new ModelRendererTurbo(this, 1, 433, textureX, textureY); // Box 213
		tailModel[39] = new ModelRendererTurbo(this, 1041, 161, textureX, textureY); // Box 216
		tailModel[40] = new ModelRendererTurbo(this, 1769, 113, textureX, textureY); // Box 217
		tailModel[41] = new ModelRendererTurbo(this, 857, 617, textureX, textureY); // Box 328
		tailModel[42] = new ModelRendererTurbo(this, 1953, 521, textureX, textureY); // Box 329
		tailModel[43] = new ModelRendererTurbo(this, 993, 449, textureX, textureY); // Box 330
		tailModel[44] = new ModelRendererTurbo(this, 1337, 153, textureX, textureY); // Box 331
		tailModel[45] = new ModelRendererTurbo(this, 1, 689, textureX, textureY); // Box 332
		tailModel[46] = new ModelRendererTurbo(this, 785, 697, textureX, textureY); // Box 334
		tailModel[47] = new ModelRendererTurbo(this, 913, 697, textureX, textureY); // Box 335
		tailModel[48] = new ModelRendererTurbo(this, 1057, 649, textureX, textureY); // Box 336
		tailModel[49] = new ModelRendererTurbo(this, 1057, 697, textureX, textureY); // Box 337
		tailModel[50] = new ModelRendererTurbo(this, 289, 337, textureX, textureY); // Box 357
		tailModel[51] = new ModelRendererTurbo(this, 1329, 201, textureX, textureY); // Box 358

		tailModel[0].addShapeBox(0F, 0F, 0F, 30, 28, 34, 0F,0F, 0F, -8F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -5F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 14
		tailModel[0].setRotationPoint(74F, -64F, -34F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 67, 23, 29, 0F,0F, 0F, -6F, 0F, 2F, -10F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, -9F, 0F, -10F, 0F, 0F, 0F, 0F); // Box 15
		tailModel[1].setRotationPoint(104F, -64F, -29F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 38, 15, 20, 0F,0F, 0F, -1F, 0F, 5F, -5F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -4F, 0F, 4F, 0F, 0F, 15F, 0F); // Box 16
		tailModel[2].setRotationPoint(171F, -66F, -20F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 30, 16, 26, 0F,0F, 0F, -5F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		tailModel[3].setRotationPoint(74F, -80F, -26F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 67, 16, 23, 0F,0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 21
		tailModel[4].setRotationPoint(104F, -80F, -23F);

		tailModel[5].addShapeBox(0F, 0F, 0F, 38, 14, 19, 0F,0F, 0F, -1F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -4F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 22
		tailModel[5].setRotationPoint(171F, -80F, -19F);

		tailModel[6].addShapeBox(0F, 0F, 0F, 30, 4, 21, 0F,0F, 0F, -11F, 0F, 1F, -11F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		tailModel[6].setRotationPoint(74F, -84F, -21F);

		tailModel[7].addShapeBox(0F, 0F, 0F, 67, 5, 20, 0F,0F, 0F, -10F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		tailModel[7].setRotationPoint(104F, -85F, -20F);

		tailModel[8].addShapeBox(0F, 0F, 0F, 38, 5, 18, 0F,0F, 0F, -6F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		tailModel[8].setRotationPoint(171F, -85F, -18F);

		tailModel[9].addShapeBox(0F, 0F, 0F, 30, 20, 34, 0F,0F, 0F, 0F, 0F, 5F, -5F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, -19F, 7F, -1F, -34F, 7F, -1F, 0F, 0F, 0F, 0F); // Box 31
		tailModel[9].setRotationPoint(74F, -36F, -34F);

		tailModel[10].addShapeBox(0F, 0F, 0F, 67, 24, 29, 0F,0F, 0F, 0F, 0F, 10F, -9F, 0F, 10F, 0F, 0F, 0F, 0F, -7F, 0F, -29F, 0F, -19F, -29F, 0F, -19F, 0F, -7F, 0F, 0F); // Box 32
		tailModel[10].setRotationPoint(104F, -41F, -29F);

		tailModel[11].addShapeBox(0F, 0F, 0F, 30, 15, 15, 0F,0F, 0F, 0F, 6.9999F, 0.9999F, -14.9999F, 6.9999F, 0.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 1.9999F, 0F, 0F, -14.9999F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		tailModel[11].setRotationPoint(74F, -16F, -15F);

		tailModel[12].addShapeBox(0F, 0F, 0F, 30, 13, 17, 0F,0F, 0F, 0F, 0F, 0F, -16.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16.9999F, 0F, -2.9999F, -16.9999F, 0F, -2.9999F, 0F, 0F, 0F, 0F); // Box 41
		tailModel[12].setRotationPoint(74F, -1F, -17F);

		tailModel[13].addShapeBox(0F, 0F, 0F, 13, 14, 16, 0F,0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 42
		tailModel[13].setRotationPoint(209F, -71F, -16F);

		tailModel[14].addShapeBox(0F, 0F, 0F, 8, 11, 13, 0F,0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -6F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 43
		tailModel[14].setRotationPoint(222F, -71F, -13F);

		tailModel[15].addShapeBox(0F, 0F, 0F, 13, 10, 16, 0F,0F, 0F, 0F, 0F, 3F, -3F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -13F, -3F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 44
		tailModel[15].setRotationPoint(209F, -57F, -16F);

		tailModel[16].addShapeBox(0F, 0F, 0F, 8, 12, 13, 0F,0F, -4F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -8F, 0F, 0F, -12F, -6F, 0F, -12F, 0F, 0F, 0F, 0F); // Box 45
		tailModel[16].setRotationPoint(222F, -64F, -13F);

		tailModel[17].addShapeBox(0F, 0F, 0F, 38, 14, 12, 0F,0F, 0F, -6F, 0F, -6F, -7F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		tailModel[17].setRotationPoint(171F, -99F, -12F);

		tailModel[18].addShapeBox(0F, 0F, 0F, 35, 14, 12, 0F,0F, -14F, -5F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, -14F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		tailModel[18].setRotationPoint(136F, -99F, -12F);

		tailModel[19].addShapeBox(0F, 0F, 0F, 37, 10, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		tailModel[19].setRotationPoint(171F, -99F, -12F);

		tailModel[20].addShapeBox(0F, 0F, 0F, 5, 10, 12, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -3F, 0F); // Box 160
		tailModel[20].setRotationPoint(166F, -99F, -12F);

		tailModel[21].addShapeBox(0F, 0F, 0F, 37, 10, 103, 0F,-7F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 16F, 0F, 0F, 16F, 0F); // Box 161
		tailModel[21].setRotationPoint(171F, -115F, -115F);

		tailModel[22].addShapeBox(0F, 0F, 0F, 12, 10, 103, 0F,-7F, -3F, 0F, 0F, 0F, 0F, -7F, -16F, 0F, 0F, -19F, 0F, -7F, -3F, 0F, 0F, 0F, 0F, -7F, 16F, 0F, 0F, 13F, 0F); // Box 163
		tailModel[22].setRotationPoint(166F, -115F, -115F);

		tailModel[23].addShapeBox(0F, 0F, 0F, 63, 52, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		tailModel[23].setRotationPoint(169F, -146F, -121F);

		tailModel[24].addShapeBox(0F, 0F, 0F, 63, 16, 6, 0F,-22F, 0F, -2F, -23F, 0F, -2F, -23F, 0F, -2F, -22F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		tailModel[24].setRotationPoint(169F, -162F, -121F);

		tailModel[25].addShapeBox(0F, 0F, 0F, 63, 20, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -22F, 0F, -2F, -23F, 0F, -2F, -23F, 0F, -2F, -22F, 0F, -2F); // Box 166
		tailModel[25].setRotationPoint(169F, -94F, -121F);

		tailModel[26].addShapeBox(0F, 0F, 0F, 30, 28, 34, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, -5F, 0F, 0F, 0F); // Box 186
		tailModel[26].setRotationPoint(74F, -64F, 0F);

		tailModel[27].addShapeBox(0F, 0F, 0F, 67, 23, 29, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -10F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, -9F, 0F, 0F, 0F); // Box 187
		tailModel[27].setRotationPoint(104F, -64F, 0F);

		tailModel[28].addShapeBox(0F, 0F, 0F, 38, 15, 20, 0F,0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, -5F, 0F, 0F, -1F, 0F, 15F, 0F, 0F, 4F, 0F, 0F, -6F, -4F, 0F, 0F, 0F); // Box 188
		tailModel[28].setRotationPoint(171F, -66F, 0F);

		tailModel[29].addShapeBox(0F, 0F, 0F, 30, 16, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 192
		tailModel[29].setRotationPoint(74F, -80F, 0F);

		tailModel[30].addShapeBox(0F, 0F, 0F, 67, 16, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -4F, 0F, 0F, 0F); // Box 193
		tailModel[30].setRotationPoint(104F, -80F, 0F);

		tailModel[31].addShapeBox(0F, 0F, 0F, 38, 14, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, -4F, 0F, 0F, 0F); // Box 194
		tailModel[31].setRotationPoint(171F, -80F, 0F);

		tailModel[32].addShapeBox(0F, 0F, 0F, 30, 4, 21, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 199
		tailModel[32].setRotationPoint(74F, -84F, 0F);

		tailModel[33].addShapeBox(0F, 0F, 0F, 67, 5, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 200
		tailModel[33].setRotationPoint(104F, -85F, 0F);

		tailModel[34].addShapeBox(0F, 0F, 0F, 38, 5, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 201
		tailModel[34].setRotationPoint(171F, -85F, 0F);

		tailModel[35].addShapeBox(0F, 0F, 0F, 30, 20, 34, 0F,0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, -1F, 0F, 7F, -1F, -34F, 0F, 0F, -19F); // Box 203
		tailModel[35].setRotationPoint(74F, -36F, 0F);

		tailModel[36].addShapeBox(0F, 0F, 0F, 67, 24, 29, 0F,0F, 0F, 0F, 0F, 10F, 0F, 0F, 10F, -9F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, -19F, 0F, 0F, -19F, -29F, -7F, 0F, -29F); // Box 204
		tailModel[36].setRotationPoint(104F, -41F, 0F);

		tailModel[37].addShapeBox(0F, 0F, 0F, 30, 15, 15, 0F,0F, 0F, 0F, 6.9999F, 0.9999F, 0F, 6.9999F, 0.9999F, -14.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14.9999F, 0F, 0F, 1.9999F); // Box 207
		tailModel[37].setRotationPoint(74F, -16F, 0F);

		tailModel[38].addShapeBox(0F, 0F, 0F, 30, 13, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.9999F, 0F, 0F, -2.9999F, -16.9999F, 0F, 0F, -16.9999F); // Box 213
		tailModel[38].setRotationPoint(74F, -1F, 0F);

		tailModel[39].addShapeBox(0F, 0F, 0F, 13, 10, 16, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -13F, -3F, 0F, -10F, 0F); // Box 216
		tailModel[39].setRotationPoint(209F, -57F, 0F);

		tailModel[40].addShapeBox(0F, 0F, 0F, 8, 12, 13, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, -6F, 0F, -8F, 0F); // Box 217
		tailModel[40].setRotationPoint(222F, -64F, 0F);

		tailModel[41].addShapeBox(0F, 0F, 0F, 38, 14, 12, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, -7F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 328
		tailModel[41].setRotationPoint(171F, -99F, 0F);

		tailModel[42].addShapeBox(0F, 0F, 0F, 35, 14, 12, 0F,0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -14F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 329
		tailModel[42].setRotationPoint(136F, -99F, 0F);

		tailModel[43].addShapeBox(0F, 0F, 0F, 37, 10, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 330
		tailModel[43].setRotationPoint(171F, -99F, 0F);

		tailModel[44].addShapeBox(0F, 0F, 0F, 5, 10, 12, 0F,2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 331
		tailModel[44].setRotationPoint(166F, -99F, 0F);

		tailModel[45].addShapeBox(0F, 0F, 0F, 37, 10, 103, 0F,0F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 16F, 0F, 0F, 16F, 0F, 0F, 0F, 0F, -7F, 0F, 0F); // Box 332
		tailModel[45].setRotationPoint(171F, -115F, 12F);

		tailModel[46].addShapeBox(0F, 0F, 0F, 12, 10, 103, 0F,0F, -19F, 0F, -7F, -16F, 0F, 0F, 0F, 0F, -7F, -3F, 0F, 0F, 13F, 0F, -7F, 16F, 0F, 0F, 0F, 0F, -7F, -3F, 0F); // Box 334
		tailModel[46].setRotationPoint(166F, -115F, 12F);

		tailModel[47].addShapeBox(0F, 0F, 0F, 63, 52, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 335
		tailModel[47].setRotationPoint(169F, -146F, 115F);

		tailModel[48].addShapeBox(0F, 0F, 0F, 63, 16, 6, 0F,-22F, 0F, -2F, -23F, 0F, -2F, -23F, 0F, -2F, -22F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 336
		tailModel[48].setRotationPoint(169F, -162F, 115F);

		tailModel[49].addShapeBox(0F, 0F, 0F, 63, 20, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -22F, 0F, -2F, -23F, 0F, -2F, -23F, 0F, -2F, -22F, 0F, -2F); // Box 337
		tailModel[49].setRotationPoint(169F, -94F, 115F);

		tailModel[50].addShapeBox(0F, 0F, 0F, 13, 14, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -3F, 0F, 0F, 0F); // Box 357
		tailModel[50].setRotationPoint(209F, -71F, 0F);

		tailModel[51].addShapeBox(0F, 0F, 0F, 8, 11, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, -6F, 0F, 0F, 0F); // Box 358
		tailModel[51].setRotationPoint(222F, -71F, 0F);
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 377, 129, textureX, textureY); // Box 46
		leftWingModel[1] = new ModelRendererTurbo(this, 1009, 129, textureX, textureY); // Box 47
		leftWingModel[2] = new ModelRendererTurbo(this, 721, 153, textureX, textureY); // Box 48
		leftWingModel[3] = new ModelRendererTurbo(this, 1225, 137, textureX, textureY); // Box 49
		leftWingModel[4] = new ModelRendererTurbo(this, 1497, 161, textureX, textureY); // Box 50
		leftWingModel[5] = new ModelRendererTurbo(this, 1225, 129, textureX, textureY); // Box 117
		leftWingModel[6] = new ModelRendererTurbo(this, 1497, 137, textureX, textureY); // Box 118
		leftWingModel[7] = new ModelRendererTurbo(this, 1409, 1, textureX, textureY); // Box 119
		leftWingModel[8] = new ModelRendererTurbo(this, 1593, 1, textureX, textureY); // Box 120
		leftWingModel[9] = new ModelRendererTurbo(this, 1225, 1, textureX, textureY); // Box 121
		leftWingModel[10] = new ModelRendererTurbo(this, 1993, 1, textureX, textureY); // Box 122
		leftWingModel[11] = new ModelRendererTurbo(this, 473, 153, textureX, textureY); // Box 123
		leftWingModel[12] = new ModelRendererTurbo(this, 1913, 153, textureX, textureY); // Box 124
		leftWingModel[13] = new ModelRendererTurbo(this, 697, 161, textureX, textureY); // Box 125
		leftWingModel[14] = new ModelRendererTurbo(this, 801, 161, textureX, textureY); // Box 238
		leftWingModel[15] = new ModelRendererTurbo(this, 233, 129, textureX, textureY); // Box 239
		leftWingModel[16] = new ModelRendererTurbo(this, 1289, 137, textureX, textureY); // Box 240
		leftWingModel[17] = new ModelRendererTurbo(this, 961, 161, textureX, textureY); // Box 161
		leftWingModel[18] = new ModelRendererTurbo(this, 1073, 161, textureX, textureY); // Box 162
		leftWingModel[19] = new ModelRendererTurbo(this, 1713, 161, textureX, textureY); // Box 163
		leftWingModel[20] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 164
		leftWingModel[21] = new ModelRendererTurbo(this, 297, 169, textureX, textureY); // Box 165
		leftWingModel[22] = new ModelRendererTurbo(this, 369, 185, textureX, textureY); // Box 166
		leftWingModel[23] = new ModelRendererTurbo(this, 1785, 185, textureX, textureY); // Box 167
		leftWingModel[24] = new ModelRendererTurbo(this, 201, 201, textureX, textureY); // Box 168
		leftWingModel[25] = new ModelRendererTurbo(this, 961, 209, textureX, textureY); // Box 169
		leftWingModel[26] = new ModelRendererTurbo(this, 1713, 225, textureX, textureY); // Box 170
		leftWingModel[27] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 171
		leftWingModel[28] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 172
		leftWingModel[29] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 173
		leftWingModel[30] = new ModelRendererTurbo(this, 881, 49, textureX, textureY); // Box 174
		leftWingModel[31] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 175
		leftWingModel[32] = new ModelRendererTurbo(this, 577, 1, textureX, textureY); // Box 176
		leftWingModel[33] = new ModelRendererTurbo(this, 777, 57, textureX, textureY); // Box 177
		leftWingModel[34] = new ModelRendererTurbo(this, 625, 1, textureX, textureY); // Box 178
		leftWingModel[35] = new ModelRendererTurbo(this, 785, 1, textureX, textureY); // Box 179
		leftWingModel[36] = new ModelRendererTurbo(this, 801, 1, textureX, textureY); // Box 180
		leftWingModel[37] = new ModelRendererTurbo(this, 889, 1, textureX, textureY); // Box 181
		leftWingModel[38] = new ModelRendererTurbo(this, 905, 1, textureX, textureY); // Box 182
		leftWingModel[39] = new ModelRendererTurbo(this, 1257, 1, textureX, textureY); // Box 111
		leftWingModel[40] = new ModelRendererTurbo(this, 785, 17, textureX, textureY); // Box 112
		leftWingModel[41] = new ModelRendererTurbo(this, 905, 17, textureX, textureY); // Box 113
		leftWingModel[42] = new ModelRendererTurbo(this, 1257, 25, textureX, textureY); // Box 114
		leftWingModel[43] = new ModelRendererTurbo(this, 1993, 25, textureX, textureY); // Box 115
		leftWingModel[44] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 116
		leftWingModel[45] = new ModelRendererTurbo(this, 1145, 1, textureX, textureY); // Box 117
		leftWingModel[46] = new ModelRendererTurbo(this, 1409, 1, textureX, textureY); // Box 118
		leftWingModel[47] = new ModelRendererTurbo(this, 1457, 1, textureX, textureY); // Box 119
		leftWingModel[48] = new ModelRendererTurbo(this, 1497, 169, textureX, textureY); // Box 95
		leftWingModel[49] = new ModelRendererTurbo(this, 1225, 201, textureX, textureY); // Box 96
		leftWingModel[50] = new ModelRendererTurbo(this, 1497, 201, textureX, textureY); // Box 97
		leftWingModel[51] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 98
		leftWingModel[52] = new ModelRendererTurbo(this, 1921, 201, textureX, textureY); // Box 99
		leftWingModel[53] = new ModelRendererTurbo(this, 337, 233, textureX, textureY); // Box 100
		leftWingModel[54] = new ModelRendererTurbo(this, 697, 233, textureX, textureY); // Box 101
		leftWingModel[55] = new ModelRendererTurbo(this, 1849, 233, textureX, textureY); // Box 102
		leftWingModel[56] = new ModelRendererTurbo(this, 201, 241, textureX, textureY); // Box 103
		leftWingModel[57] = new ModelRendererTurbo(this, 433, 241, textureX, textureY); // Box 104
		leftWingModel[58] = new ModelRendererTurbo(this, 961, 249, textureX, textureY); // Box 105
		leftWingModel[59] = new ModelRendererTurbo(this, 1713, 265, textureX, textureY); // Box 106
		leftWingModel[60] = new ModelRendererTurbo(this, 305, 273, textureX, textureY); // Box 107
		leftWingModel[61] = new ModelRendererTurbo(this, 697, 273, textureX, textureY); // Box 108
		leftWingModel[62] = new ModelRendererTurbo(this, 1865, 281, textureX, textureY); // Box 109
		leftWingModel[63] = new ModelRendererTurbo(this, 1097, 225, textureX, textureY); // Box 110
		leftWingModel[64] = new ModelRendererTurbo(this, 1225, 241, textureX, textureY); // Box 111
		leftWingModel[65] = new ModelRendererTurbo(this, 1, 249, textureX, textureY); // Box 112
		leftWingModel[66] = new ModelRendererTurbo(this, 1497, 249, textureX, textureY); // Box 113
		leftWingModel[67] = new ModelRendererTurbo(this, 1097, 265, textureX, textureY); // Box 114
		leftWingModel[68] = new ModelRendererTurbo(this, 1169, 57, textureX, textureY); // Box 115
		leftWingModel[69] = new ModelRendererTurbo(this, 921, 1, textureX, textureY); // Box 116
		leftWingModel[70] = new ModelRendererTurbo(this, 1001, 1, textureX, textureY); // Box 117
		leftWingModel[71] = new ModelRendererTurbo(this, 1593, 1, textureX, textureY); // Box 118
		leftWingModel[72] = new ModelRendererTurbo(this, 1641, 1, textureX, textureY); // Box 119
		leftWingModel[73] = new ModelRendererTurbo(this, 1801, 1, textureX, textureY); // Box 120
		leftWingModel[74] = new ModelRendererTurbo(this, 1305, 57, textureX, textureY); // Box 121
		leftWingModel[75] = new ModelRendererTurbo(this, 2025, 1, textureX, textureY); // Box 122
		leftWingModel[76] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 123
		leftWingModel[77] = new ModelRendererTurbo(this, 2033, 25, textureX, textureY); // Box 124
		leftWingModel[78] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 125
		leftWingModel[79] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 126
		leftWingModel[80] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 127
		leftWingModel[81] = new ModelRendererTurbo(this, 1465, 57, textureX, textureY); // Box 128
		leftWingModel[82] = new ModelRendererTurbo(this, 1657, 57, textureX, textureY); // Box 129
		leftWingModel[83] = new ModelRendererTurbo(this, 1681, 57, textureX, textureY); // Box 130
		leftWingModel[84] = new ModelRendererTurbo(this, 1777, 57, textureX, textureY); // Box 131
		leftWingModel[85] = new ModelRendererTurbo(this, 2025, 41, textureX, textureY); // Box 132
		leftWingModel[86] = new ModelRendererTurbo(this, 705, 57, textureX, textureY); // Box 133
		leftWingModel[87] = new ModelRendererTurbo(this, 1193, 57, textureX, textureY); // Box 134
		leftWingModel[88] = new ModelRendererTurbo(this, 913, 65, textureX, textureY); // Box 135
		leftWingModel[89] = new ModelRendererTurbo(this, 137, 145, textureX, textureY); // Box 786
		leftWingModel[90] = new ModelRendererTurbo(this, 1185, 145, textureX, textureY); // Box 787
		leftWingModel[91] = new ModelRendererTurbo(this, 961, 153, textureX, textureY); // Box 788
		leftWingModel[92] = new ModelRendererTurbo(this, 113, 169, textureX, textureY); // Box 789
		leftWingModel[93] = new ModelRendererTurbo(this, 1241, 193, textureX, textureY); // Box 351
		leftWingModel[94] = new ModelRendererTurbo(this, 105, 201, textureX, textureY); // Box 352
		leftWingModel[95] = new ModelRendererTurbo(this, 961, 201, textureX, textureY); // Box 353
		leftWingModel[96] = new ModelRendererTurbo(this, 977, 201, textureX, textureY); // Box 354
		leftWingModel[97] = new ModelRendererTurbo(this, 1297, 689, textureX, textureY); // Box 355
		leftWingModel[98] = new ModelRendererTurbo(this, 369, 649, textureX, textureY); // Box 356
		leftWingModel[99] = new ModelRendererTurbo(this, 185, 689, textureX, textureY); // Box 357

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 60, 16, 193, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 23F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 23F, 7F, 0F); // Box 46
		leftWingModel[0].setRotationPoint(-72F, -87F, -203F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 11, 16, 193, 0F,0F, -5F, 0F, 0F, 0F, 0F, -23F, -3F, 0F, 29F, -7F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -23F, 7F, 0F, 29F, 3F, 0F); // Box 47
		leftWingModel[1].setRotationPoint(-83F, -87F, -203F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 21, 16, 193, 0F,0F, 0F, 0F, 0F, -8F, 0F, 0F, -11F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 7F, 0F); // Box 48
		leftWingModel[2].setRotationPoint(-12F, -87F, -203F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 60, 16, 151, 0F,-20F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -20F, -4F, 0F, 0F, -4F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 49
		leftWingModel[3].setRotationPoint(-72F, -88F, -354F);

		leftWingModel[4].addShapeBox(0F, 0F, 0F, 31, 16, 151, 0F,-23F, -5F, 0F, 0F, 0F, 0F, -20F, -1F, 0F, 0F, -6F, 0F, -23F, -9F, 0F, 0F, -4F, 0F, -20F, 1F, 0F, 0F, -4F, 0F); // Box 50
		leftWingModel[4].setRotationPoint(-83F, -88F, -354F);

		leftWingModel[5].addShapeBox(0F, 0F, 0F, 29, 11, 20, 0F,0F, 0F, -9.9999F, 0F, -4.9999F, -9.9999F, 0F, -4.9999F, -9.9999F, 0F, 0F, -9.9999F, 0F, -2.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.9999F, 0F); // Box 117
		leftWingModel[5].setRotationPoint(-49F, -20F, -319F);

		leftWingModel[6].addShapeBox(0F, 0F, 0F, 29, 10, 20, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, -2F, -10F); // Box 118
		leftWingModel[6].setRotationPoint(-49F, -12F, -319F);

		leftWingModel[7].addShapeBox(0F, 0F, 0F, 11, 8, 20, 0F,0F, -1F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, -1F, -10F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -3F); // Box 119
		leftWingModel[7].setRotationPoint(-60F, -20F, -319F);

		leftWingModel[8].addShapeBox(0F, 0F, 0F, 11, 10, 20, 0F,0F, 0F, -3F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, -5F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, -5F, -10F); // Box 120
		leftWingModel[8].setRotationPoint(-60F, -14F, -319F);

		leftWingModel[9].addShapeBox(0F, 0F, 0F, 6, 5, 14, 0F,0F, -2.9999F, -6.9999F, 0F, 0F, -6.9999F, 0F, 0F, -6.9999F, 0F, -2.9999F, -6.9999F, 0F, -1.9999F, -6.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9999F, -6.9999F); // Box 121
		leftWingModel[9].setRotationPoint(-66F, -19F, -316F);

		leftWingModel[10].addShapeBox(0F, 0F, 0F, 6, 7, 14, 0F,0F, 0F, -6.9999F, 0F, -1.9999F, 0F, 0F, -1.9999F, 0F, 0F, 0F, -6.9999F, 0F, -6.9999F, -6.9999F, 0F, 0F, -6.9999F, 0F, 0F, -6.9999F, 0F, -6.9999F, -6.9999F); // Box 122
		leftWingModel[10].setRotationPoint(-66F, -16F, -316F);

		leftWingModel[11].addShapeBox(0F, 0F, 0F, 23, 7, 20, 0F,0F, 0F, 0F, 0F, -2.9999F, -9.9999F, 0F, -2.9999F, -9.9999F, 0F, 0F, 0F, 0F, 0F, -9.9999F, 0F, -3.9999F, -9.9999F, 0F, -3.9999F, -9.9999F, 0F, 0F, -9.9999F); // Box 123
		leftWingModel[11].setRotationPoint(-20F, -9F, -319F);

		leftWingModel[12].addShapeBox(0F, 0F, 0F, 23, 9, 20, 0F,0F, 0F, -9.9999F, 0F, -8.9999F, -9.9999F, 0F, -8.9999F, -9.9999F, 0F, 0F, -9.9999F, 0F, -2.9999F, 0F, 0F, 0F, -9.9999F, 0F, 0F, -9.9999F, 0F, -2.9999F, 0F); // Box 124
		leftWingModel[12].setRotationPoint(-20F, -15F, -319F);

		leftWingModel[13].addShapeBox(0F, 0F, 0F, 48, 63, 2, 0F,-15F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -7F, 0F, 0F, -19.5F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F); // Box 125
		leftWingModel[13].setRotationPoint(-60F, -78F, -311F);

		leftWingModel[14].addShapeBox(0F, 0F, 0F, 48, 63, 2, 0F,-8F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -19.5F, 0F, 0F, -7F, 0F, 0F); // Box 238
		leftWingModel[14].setRotationPoint(-60F, -78F, -309F);

		leftWingModel[15].addShapeBox(0F, 0F, 0F, 2, 19, 39, 0F,-7F, 0F, 0F, 7F, 0F, 0F, 0F, -57F, 0F, 0F, -57F, 0F, -7F, -17F, 0F, 7F, -17F, 0F, 0F, 40F, 0F, 0F, 40F, 0F); // Box 239
		leftWingModel[15].setRotationPoint(-45F, -78F, -350F);

		leftWingModel[16].addShapeBox(0F, 0F, 0F, 2, 19, 39, 0F,5F, 0F, 0F, -5F, 0F, 0F, 0F, -57F, 0F, 0F, -57F, 0F, 5F, -17F, 0F, -5F, -17F, 0F, 0F, 40F, 0F, 0F, 40F, 0F); // Box 240
		leftWingModel[16].setRotationPoint(-33F, -78F, -350F);

		leftWingModel[17].addShapeBox(0F, 0F, 0F, 23, 5, 30, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		leftWingModel[17].setRotationPoint(-142F, -88F, -84F);

		leftWingModel[18].addShapeBox(0F, 0F, 0F, 23, 10, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		leftWingModel[18].setRotationPoint(-142F, -83F, -84F);

		leftWingModel[19].addShapeBox(0F, 0F, 0F, 23, 5, 26, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		leftWingModel[19].setRotationPoint(-142F, -93F, -82F);

		leftWingModel[20].addShapeBox(0F, 0F, 0F, 23, 5, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 164
		leftWingModel[20].setRotationPoint(-142F, -73F, -84F);

		leftWingModel[21].addShapeBox(0F, 0F, 0F, 23, 5, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F); // Box 165
		leftWingModel[21].setRotationPoint(-142F, -68F, -82F);

		leftWingModel[22].addShapeBox(0F, 0F, 0F, 49, 10, 30, 0F,0F, 0F, 0F, 0F, -4F, -14F, 0F, -4F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -14F, 0F, -4F, -14F, 0F, 0F, 0F); // Box 166
		leftWingModel[22].setRotationPoint(-85F, -83F, -84F);

		leftWingModel[23].addShapeBox(0F, 0F, 0F, 49, 5, 30, 0F,0F, 0F, -1.9999F, 0F, -8.9999F, -13.9999F, 0F, -8.9999F, -13.9999F, 0F, 0F, -1.9999F, 0F, 0F, 0F, 0F, 3.9999F, -13.9999F, 0F, 3.9999F, -13.9999F, 0F, 0F, 0F); // Box 167
		leftWingModel[23].setRotationPoint(-85F, -88F, -84F);

		leftWingModel[24].addShapeBox(0F, 0F, 0F, 49, 5, 30, 0F,0F, 4.9999F, -7.9999F, 0F, -8.9999F, -13.9999F, 0F, -8.9999F, -13.9999F, 0F, 4.9999F, -7.9999F, 0F, -4.9999F, -1.9999F, 0F, 3.9999F, -13.9999F, 0F, 3.9999F, -13.9999F, 0F, -4.9999F, -1.9999F); // Box 168
		leftWingModel[24].setRotationPoint(-85F, -88F, -84F);

		leftWingModel[25].addShapeBox(0F, 0F, 0F, 49, 5, 30, 0F,0F, 0F, 0F, 0F, 3.9999F, -13.9999F, 0F, 3.9999F, -13.9999F, 0F, 0F, 0F, 0F, 0F, -1.9999F, 0F, -8.9999F, -13.9999F, 0F, -8.9999F, -13.9999F, 0F, 0F, -1.9999F); // Box 169
		leftWingModel[25].setRotationPoint(-85F, -73F, -84F);

		leftWingModel[26].addShapeBox(0F, 0F, 0F, 49, 5, 30, 0F,0F, -4.9999F, -1.9999F, 0F, 3.9999F, -13.9999F, 0F, 3.9999F, -13.9999F, 0F, -4.9999F, -1.9999F, 0F, 4.9999F, -7.9999F, 0F, -8.9999F, -13.9999F, 0F, -8.9999F, -13.9999F, 0F, 4.9999F, -7.9999F); // Box 170
		leftWingModel[26].setRotationPoint(-85F, -73F, -84F);

		leftWingModel[27].addShapeBox(0F, 0F, 0F, 4, 10, 3, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F); // Box 171
		leftWingModel[27].setRotationPoint(-146F, -83F, -84F);

		leftWingModel[28].addShapeBox(0F, 0F, 0F, 4, 5, 3, 0F,0F, -1F, -3F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, -1F, 3F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F); // Box 172
		leftWingModel[28].setRotationPoint(-146F, -88F, -84F);

		leftWingModel[29].addShapeBox(0F, 0F, 0F, 4, 5, 3, 0F,0F, -1F, -5F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, -1F, 5F, 0F, 1F, 1F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 1F, -1F); // Box 173
		leftWingModel[29].setRotationPoint(-146F, -93F, -80F);

		leftWingModel[30].addShapeBox(0F, 0F, 0F, 4, 3, 14, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F); // Box 174
		leftWingModel[30].setRotationPoint(-146F, -93F, -76F);

		leftWingModel[31].addShapeBox(0F, 0F, 0F, 4, 5, 3, 0F,0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, -1F, -3F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, -1F, 3F); // Box 175
		leftWingModel[31].setRotationPoint(-146F, -73F, -84F);

		leftWingModel[32].addShapeBox(0F, 0F, 0F, 4, 5, 3, 0F,0F, 1F, 1F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 1F, -1F, 0F, -1F, -5F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, -1F, 5F); // Box 176
		leftWingModel[32].setRotationPoint(-146F, -68F, -80F);

		leftWingModel[33].addShapeBox(0F, 0F, 0F, 4, 3, 14, 0F,0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 177
		leftWingModel[33].setRotationPoint(-146F, -66F, -76F);

		leftWingModel[34].addShapeBox(0F, 0F, 0F, 4, 10, 3, 0F,0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 178
		leftWingModel[34].setRotationPoint(-146F, -83F, -57F);

		leftWingModel[35].addShapeBox(0F, 0F, 0F, 4, 5, 3, 0F,0F, -1F, 3F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, -1F, -3F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F); // Box 179
		leftWingModel[35].setRotationPoint(-146F, -88F, -57F);

		leftWingModel[36].addShapeBox(0F, 0F, 0F, 4, 5, 3, 0F,0F, -1F, 5F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, -1F, -5F, 0F, 1F, -1F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 1F, 1F); // Box 180
		leftWingModel[36].setRotationPoint(-146F, -93F, -61F);

		leftWingModel[37].addShapeBox(0F, 0F, 0F, 4, 5, 3, 0F,0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, -1F, 3F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, -1F, -3F); // Box 181
		leftWingModel[37].setRotationPoint(-146F, -73F, -57F);

		leftWingModel[38].addShapeBox(0F, 0F, 0F, 4, 5, 3, 0F,0F, 1F, -1F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 1F, 1F, 0F, -1F, 5F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, -1F, -5F); // Box 182
		leftWingModel[38].setRotationPoint(-146F, -68F, -61F);

		leftWingModel[39].addShapeBox(0F, 0F, 0F, 6, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		leftWingModel[39].setRotationPoint(-146F, -79.5F, -73.5F);

		leftWingModel[40].addShapeBox(0F, 0F, 0F, 6, 3, 9, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		leftWingModel[40].setRotationPoint(-146F, -82.5F, -73.5F);

		leftWingModel[41].addShapeBox(0F, 0F, 0F, 6, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 113
		leftWingModel[41].setRotationPoint(-146F, -76.5F, -73.5F);

		leftWingModel[42].addShapeBox(0F, 0F, 0F, 10, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		leftWingModel[42].setRotationPoint(-156F, -79F, -72F);

		leftWingModel[43].addShapeBox(0F, 0F, 0F, 10, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		leftWingModel[43].setRotationPoint(-156F, -81F, -72F);

		leftWingModel[44].addShapeBox(0F, 0F, 0F, 10, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 116
		leftWingModel[44].setRotationPoint(-156F, -77F, -72F);

		leftWingModel[45].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 117
		leftWingModel[45].setRotationPoint(-159F, -79F, -72F);

		leftWingModel[46].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, -1.9999F, -1.9999F, 0F, 0F, -1.9999F, 0F, 0F, -1.9999F, 0F, -1.9999F, -1.9999F, 0F, 0F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9999F); // Box 118
		leftWingModel[46].setRotationPoint(-159F, -81F, -72F);

		leftWingModel[47].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, 0F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9999F, 0F, -1.9999F, -1.9999F, 0F, 0F, -1.9999F, 0F, 0F, -1.9999F, 0F, -1.9999F, -1.9999F); // Box 119
		leftWingModel[47].setRotationPoint(-159F, -77F, -72F);

		leftWingModel[48].addShapeBox(0F, 0F, 0F, 34, 5, 26, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		leftWingModel[48].setRotationPoint(-119F, -93F, -82F);

		leftWingModel[49].addShapeBox(0F, 0F, 0F, 34, 5, 30, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		leftWingModel[49].setRotationPoint(-119F, -88F, -84F);

		leftWingModel[50].addShapeBox(0F, 0F, 0F, 34, 10, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		leftWingModel[50].setRotationPoint(-119F, -83F, -84F);

		leftWingModel[51].addShapeBox(0F, 0F, 0F, 34, 5, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 98
		leftWingModel[51].setRotationPoint(-119F, -73F, -84F);

		leftWingModel[52].addShapeBox(0F, 0F, 0F, 34, 5, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F); // Box 99
		leftWingModel[52].setRotationPoint(-119F, -68F, -82F);

		leftWingModel[53].addShapeBox(0F, 0F, 0F, 34, 5, 26, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		leftWingModel[53].setRotationPoint(-106F, -94F, -179F);

		leftWingModel[54].addShapeBox(0F, 0F, 0F, 34, 5, 30, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		leftWingModel[54].setRotationPoint(-106F, -89F, -181F);

		leftWingModel[55].addShapeBox(0F, 0F, 0F, 34, 10, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		leftWingModel[55].setRotationPoint(-106F, -84F, -181F);

		leftWingModel[56].addShapeBox(0F, 0F, 0F, 34, 5, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 103
		leftWingModel[56].setRotationPoint(-106F, -74F, -181F);

		leftWingModel[57].addShapeBox(0F, 0F, 0F, 34, 5, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F); // Box 104
		leftWingModel[57].setRotationPoint(-106F, -69F, -179F);

		leftWingModel[58].addShapeBox(0F, 0F, 0F, 49, 5, 30, 0F,0F, 0F, -1.9999F, 0F, -8.9999F, -13.9999F, 0F, -8.9999F, -13.9999F, 0F, 0F, -1.9999F, 0F, 0F, 0F, 0F, 3.9999F, -13.9999F, 0F, 3.9999F, -13.9999F, 0F, 0F, 0F); // Box 105
		leftWingModel[58].setRotationPoint(-72F, -89F, -181F);

		leftWingModel[59].addShapeBox(0F, 0F, 0F, 49, 10, 30, 0F,0F, 0F, 0F, 0F, -4F, -14F, 0F, -4F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -14F, 0F, -4F, -14F, 0F, 0F, 0F); // Box 106
		leftWingModel[59].setRotationPoint(-72F, -84F, -181F);

		leftWingModel[60].addShapeBox(0F, 0F, 0F, 49, 5, 30, 0F,0F, 0F, 0F, 0F, 3.9999F, -13.9999F, 0F, 3.9999F, -13.9999F, 0F, 0F, 0F, 0F, 0F, -1.9999F, 0F, -8.9999F, -13.9999F, 0F, -8.9999F, -13.9999F, 0F, 0F, -1.9999F); // Box 107
		leftWingModel[60].setRotationPoint(-72F, -74F, -181F);

		leftWingModel[61].addShapeBox(0F, 0F, 0F, 49, 5, 30, 0F,0F, -4.9999F, -1.9999F, 0F, 3.9999F, -13.9999F, 0F, 3.9999F, -13.9999F, 0F, -4.9999F, -1.9999F, 0F, 4.9999F, -7.9999F, 0F, -8.9999F, -13.9999F, 0F, -8.9999F, -13.9999F, 0F, 4.9999F, -7.9999F); // Box 108
		leftWingModel[61].setRotationPoint(-72F, -74F, -181F);

		leftWingModel[62].addShapeBox(0F, 0F, 0F, 49, 5, 30, 0F,0F, 4.9999F, -7.9999F, 0F, -8.9999F, -13.9999F, 0F, -8.9999F, -13.9999F, 0F, 4.9999F, -7.9999F, 0F, -4.9999F, -1.9999F, 0F, 3.9999F, -13.9999F, 0F, 3.9999F, -13.9999F, 0F, -4.9999F, -1.9999F); // Box 109
		leftWingModel[62].setRotationPoint(-72F, -89F, -181F);

		leftWingModel[63].addShapeBox(0F, 0F, 0F, 23, 5, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F); // Box 110
		leftWingModel[63].setRotationPoint(-129F, -69F, -179F);

		leftWingModel[64].addShapeBox(0F, 0F, 0F, 23, 5, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 111
		leftWingModel[64].setRotationPoint(-129F, -74F, -181F);

		leftWingModel[65].addShapeBox(0F, 0F, 0F, 23, 10, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		leftWingModel[65].setRotationPoint(-129F, -84F, -181F);

		leftWingModel[66].addShapeBox(0F, 0F, 0F, 23, 5, 30, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		leftWingModel[66].setRotationPoint(-129F, -89F, -181F);

		leftWingModel[67].addShapeBox(0F, 0F, 0F, 23, 5, 26, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		leftWingModel[67].setRotationPoint(-129F, -94F, -179F);

		leftWingModel[68].addShapeBox(0F, 0F, 0F, 4, 3, 14, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F); // Box 115
		leftWingModel[68].setRotationPoint(-133F, -94F, -173F);

		leftWingModel[69].addShapeBox(0F, 0F, 0F, 4, 5, 3, 0F,0F, -1F, -5F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, -1F, 5F, 0F, 1F, 1F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 1F, -1F); // Box 116
		leftWingModel[69].setRotationPoint(-133F, -94F, -177F);

		leftWingModel[70].addShapeBox(0F, 0F, 0F, 4, 10, 3, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F); // Box 117
		leftWingModel[70].setRotationPoint(-133F, -84F, -181F);

		leftWingModel[71].addShapeBox(0F, 0F, 0F, 4, 5, 3, 0F,0F, -1F, -3F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, -1F, 3F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F); // Box 118
		leftWingModel[71].setRotationPoint(-133F, -89F, -181F);

		leftWingModel[72].addShapeBox(0F, 0F, 0F, 4, 5, 3, 0F,0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, -1F, -3F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, -1F, 3F); // Box 119
		leftWingModel[72].setRotationPoint(-133F, -74F, -181F);

		leftWingModel[73].addShapeBox(0F, 0F, 0F, 4, 5, 3, 0F,0F, 1F, 1F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 1F, -1F, 0F, -1F, -5F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, -1F, 5F); // Box 120
		leftWingModel[73].setRotationPoint(-133F, -69F, -177F);

		leftWingModel[74].addShapeBox(0F, 0F, 0F, 4, 3, 14, 0F,0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 121
		leftWingModel[74].setRotationPoint(-133F, -67F, -173F);

		leftWingModel[75].addShapeBox(0F, 0F, 0F, 4, 5, 3, 0F,0F, 1F, -1F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 1F, 1F, 0F, -1F, 5F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, -1F, -5F); // Box 122
		leftWingModel[75].setRotationPoint(-133F, -69F, -158F);

		leftWingModel[76].addShapeBox(0F, 0F, 0F, 4, 5, 3, 0F,0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, -1F, 3F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, -1F, -3F); // Box 123
		leftWingModel[76].setRotationPoint(-133F, -74F, -154F);

		leftWingModel[77].addShapeBox(0F, 0F, 0F, 4, 10, 3, 0F,0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 124
		leftWingModel[77].setRotationPoint(-133F, -84F, -154F);

		leftWingModel[78].addShapeBox(0F, 0F, 0F, 4, 5, 3, 0F,0F, -1F, 3F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, -1F, -3F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F); // Box 125
		leftWingModel[78].setRotationPoint(-133F, -89F, -154F);

		leftWingModel[79].addShapeBox(0F, 0F, 0F, 4, 5, 3, 0F,0F, -1F, 5F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, -1F, -5F, 0F, 1F, -1F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 1F, 1F); // Box 126
		leftWingModel[79].setRotationPoint(-133F, -94F, -158F);

		leftWingModel[80].addShapeBox(0F, 0F, 0F, 6, 3, 9, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		leftWingModel[80].setRotationPoint(-133F, -83.5F, -170.5F);

		leftWingModel[81].addShapeBox(0F, 0F, 0F, 6, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		leftWingModel[81].setRotationPoint(-133F, -80.5F, -170.5F);

		leftWingModel[82].addShapeBox(0F, 0F, 0F, 6, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 129
		leftWingModel[82].setRotationPoint(-133F, -77.5F, -170.5F);

		leftWingModel[83].addShapeBox(0F, 0F, 0F, 10, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		leftWingModel[83].setRotationPoint(-143F, -80F, -169F);

		leftWingModel[84].addShapeBox(0F, 0F, 0F, 10, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		leftWingModel[84].setRotationPoint(-143F, -82F, -169F);

		leftWingModel[85].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, -1.9999F, -1.9999F, 0F, 0F, -1.9999F, 0F, 0F, -1.9999F, 0F, -1.9999F, -1.9999F, 0F, 0F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9999F); // Box 132
		leftWingModel[85].setRotationPoint(-146F, -82F, -169F);

		leftWingModel[86].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, 0F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9999F, 0F, -1.9999F, -1.9999F, 0F, 0F, -1.9999F, 0F, 0F, -1.9999F, 0F, -1.9999F, -1.9999F); // Box 133
		leftWingModel[86].setRotationPoint(-146F, -78F, -169F);

		leftWingModel[87].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 134
		leftWingModel[87].setRotationPoint(-146F, -80F, -169F);

		leftWingModel[88].addShapeBox(0F, 0F, 0F, 10, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 135
		leftWingModel[88].setRotationPoint(-143F, -78F, -169F);

		leftWingModel[89].addShapeBox(0F, -13F, -2F, 1, 26, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 786
		leftWingModel[89].setRotationPoint(-143F, -78F, -69F);
		leftWingModel[89].rotateAngleX = -0.78539816F;

		leftWingModel[90].addShapeBox(0F, -13F, -2F, 1, 26, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 787
		leftWingModel[90].setRotationPoint(-143F, -78F, -69F);
		leftWingModel[90].rotateAngleX = 1.57079633F;

		leftWingModel[91].addShapeBox(0F, -13F, -2F, 1, 26, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 788
		leftWingModel[91].setRotationPoint(-143F, -78F, -69F);

		leftWingModel[92].addShapeBox(0F, -13F, -2F, 1, 26, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 789
		leftWingModel[92].setRotationPoint(-143F, -78F, -69F);
		leftWingModel[92].rotateAngleX = 0.78539816F;

		leftWingModel[93].addShapeBox(0F, -13F, -2F, 1, 26, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 351
		leftWingModel[93].setRotationPoint(-130F, -79F, -166F);

		leftWingModel[94].addShapeBox(0F, -13F, -2F, 1, 26, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 352
		leftWingModel[94].setRotationPoint(-130F, -79F, -166F);
		leftWingModel[94].rotateAngleX = -0.78539816F;

		leftWingModel[95].addShapeBox(0F, -13F, -2F, 1, 26, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 353
		leftWingModel[95].setRotationPoint(-130F, -79F, -166F);
		leftWingModel[95].rotateAngleX = 1.57079633F;

		leftWingModel[96].addShapeBox(0F, -13F, -2F, 1, 26, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 354
		leftWingModel[96].setRotationPoint(-130F, -79F, -166F);
		leftWingModel[96].rotateAngleX = 0.78539816F;

		leftWingModel[97].addShapeBox(0F, 0F, 0F, 40, 12, 22, 0F,-11F, -5F, -2F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, -5F, -2F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 355
		leftWingModel[97].setRotationPoint(-52F, -88F, -376F);

		leftWingModel[98].addShapeBox(0F, 0F, 0F, 21, 12, 22, 0F,0F, -5F, 0F, 0F, -6F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Box 356
		leftWingModel[98].setRotationPoint(-12F, -88F, -376F);

		leftWingModel[99].addShapeBox(0F, 0F, 0F, 19, 12, 22, 0F,-6F, -5F, -7F, 0F, -5F, -2F, -11F, 0F, 0F, 0F, -5F, 0F, -6F, -5F, -7F, 0F, -5F, -2F, -11F, 0F, 0F, 0F, -5F, 0F); // Box 357
		leftWingModel[99].setRotationPoint(-60F, -88F, -376F);
	}

	private void initrightWingModel_1()
	{
		rightWingModel[0] = new ModelRendererTurbo(this, 265, 497, textureX, textureY); // Box 218
		rightWingModel[1] = new ModelRendererTurbo(this, 1305, 425, textureX, textureY); // Box 219
		rightWingModel[2] = new ModelRendererTurbo(this, 1609, 489, textureX, textureY); // Box 220
		rightWingModel[3] = new ModelRendererTurbo(this, 585, 497, textureX, textureY); // Box 221
		rightWingModel[4] = new ModelRendererTurbo(this, 1, 521, textureX, textureY); // Box 222
		rightWingModel[5] = new ModelRendererTurbo(this, 585, 497, textureX, textureY); // Box 224
		rightWingModel[6] = new ModelRendererTurbo(this, 1361, 497, textureX, textureY); // Box 225
		rightWingModel[7] = new ModelRendererTurbo(this, 1225, 161, textureX, textureY); // Box 226
		rightWingModel[8] = new ModelRendererTurbo(this, 1985, 169, textureX, textureY); // Box 227
		rightWingModel[9] = new ModelRendererTurbo(this, 737, 89, textureX, textureY); // Box 228
		rightWingModel[10] = new ModelRendererTurbo(this, 1897, 113, textureX, textureY); // Box 229
		rightWingModel[11] = new ModelRendererTurbo(this, 1521, 497, textureX, textureY); // Box 230
		rightWingModel[12] = new ModelRendererTurbo(this, 857, 505, textureX, textureY); // Box 231
		rightWingModel[13] = new ModelRendererTurbo(this, 1849, 521, textureX, textureY); // Box 232
		rightWingModel[14] = new ModelRendererTurbo(this, 585, 529, textureX, textureY); // Box 233
		rightWingModel[15] = new ModelRendererTurbo(this, 1569, 497, textureX, textureY); // Box 234
		rightWingModel[16] = new ModelRendererTurbo(this, 905, 505, textureX, textureY); // Box 235
		rightWingModel[17] = new ModelRendererTurbo(this, 1057, 529, textureX, textureY); // Box 236
		rightWingModel[18] = new ModelRendererTurbo(this, 1169, 529, textureX, textureY); // Box 237
		rightWingModel[19] = new ModelRendererTurbo(this, 1281, 529, textureX, textureY); // Box 238
		rightWingModel[20] = new ModelRendererTurbo(this, 1385, 529, textureX, textureY); // Box 239
		rightWingModel[21] = new ModelRendererTurbo(this, 217, 537, textureX, textureY); // Box 240
		rightWingModel[22] = new ModelRendererTurbo(this, 289, 545, textureX, textureY); // Box 241
		rightWingModel[23] = new ModelRendererTurbo(this, 1625, 545, textureX, textureY); // Box 242
		rightWingModel[24] = new ModelRendererTurbo(this, 1249, 561, textureX, textureY); // Box 243
		rightWingModel[25] = new ModelRendererTurbo(this, 1057, 577, textureX, textureY); // Box 244
		rightWingModel[26] = new ModelRendererTurbo(this, 217, 593, textureX, textureY); // Box 245
		rightWingModel[27] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box 246
		rightWingModel[28] = new ModelRendererTurbo(this, 801, 57, textureX, textureY); // Box 247
		rightWingModel[29] = new ModelRendererTurbo(this, 1489, 57, textureX, textureY); // Box 248
		rightWingModel[30] = new ModelRendererTurbo(this, 1473, 105, textureX, textureY); // Box 249
		rightWingModel[31] = new ModelRendererTurbo(this, 2033, 57, textureX, textureY); // Box 250
		rightWingModel[32] = new ModelRendererTurbo(this, 1001, 65, textureX, textureY); // Box 251
		rightWingModel[33] = new ModelRendererTurbo(this, 465, 113, textureX, textureY); // Box 252
		rightWingModel[34] = new ModelRendererTurbo(this, 1809, 65, textureX, textureY); // Box 253
		rightWingModel[35] = new ModelRendererTurbo(this, 1825, 65, textureX, textureY); // Box 254
		rightWingModel[36] = new ModelRendererTurbo(this, 593, 73, textureX, textureY); // Box 255
		rightWingModel[37] = new ModelRendererTurbo(this, 881, 73, textureX, textureY); // Box 256
		rightWingModel[38] = new ModelRendererTurbo(this, 897, 73, textureX, textureY); // Box 257
		rightWingModel[39] = new ModelRendererTurbo(this, 361, 81, textureX, textureY); // Box 258
		rightWingModel[40] = new ModelRendererTurbo(this, 921, 81, textureX, textureY); // Box 259
		rightWingModel[41] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 260
		rightWingModel[42] = new ModelRendererTurbo(this, 1465, 73, textureX, textureY); // Box 261
		rightWingModel[43] = new ModelRendererTurbo(this, 1657, 73, textureX, textureY); // Box 262
		rightWingModel[44] = new ModelRendererTurbo(this, 1801, 113, textureX, textureY); // Box 263
		rightWingModel[45] = new ModelRendererTurbo(this, 1777, 73, textureX, textureY); // Box 264
		rightWingModel[46] = new ModelRendererTurbo(this, 209, 81, textureX, textureY); // Box 265
		rightWingModel[47] = new ModelRendererTurbo(this, 305, 81, textureX, textureY); // Box 266
		rightWingModel[48] = new ModelRendererTurbo(this, 1, 545, textureX, textureY); // Box 267
		rightWingModel[49] = new ModelRendererTurbo(this, 1521, 561, textureX, textureY); // Box 268
		rightWingModel[50] = new ModelRendererTurbo(this, 857, 569, textureX, textureY); // Box 269
		rightWingModel[51] = new ModelRendererTurbo(this, 1, 577, textureX, textureY); // Box 270
		rightWingModel[52] = new ModelRendererTurbo(this, 1625, 585, textureX, textureY); // Box 271
		rightWingModel[53] = new ModelRendererTurbo(this, 1849, 593, textureX, textureY); // Box 272
		rightWingModel[54] = new ModelRendererTurbo(this, 585, 601, textureX, textureY); // Box 273
		rightWingModel[55] = new ModelRendererTurbo(this, 1193, 609, textureX, textureY); // Box 274
		rightWingModel[56] = new ModelRendererTurbo(this, 1, 617, textureX, textureY); // Box 275
		rightWingModel[57] = new ModelRendererTurbo(this, 1057, 617, textureX, textureY); // Box 276
		rightWingModel[58] = new ModelRendererTurbo(this, 1849, 625, textureX, textureY); // Box 277
		rightWingModel[59] = new ModelRendererTurbo(this, 1297, 641, textureX, textureY); // Box 278
		rightWingModel[60] = new ModelRendererTurbo(this, 217, 633, textureX, textureY); // Box 279
		rightWingModel[61] = new ModelRendererTurbo(this, 1457, 641, textureX, textureY); // Box 280
		rightWingModel[62] = new ModelRendererTurbo(this, 1617, 641, textureX, textureY); // Box 281
		rightWingModel[63] = new ModelRendererTurbo(this, 1929, 561, textureX, textureY); // Box 282
		rightWingModel[64] = new ModelRendererTurbo(this, 1385, 569, textureX, textureY); // Box 283
		rightWingModel[65] = new ModelRendererTurbo(this, 1209, 657, textureX, textureY); // Box 284
		rightWingModel[66] = new ModelRendererTurbo(this, 777, 673, textureX, textureY); // Box 285
		rightWingModel[67] = new ModelRendererTurbo(this, 353, 609, textureX, textureY); // Box 286
		rightWingModel[68] = new ModelRendererTurbo(this, 281, 121, textureX, textureY); // Box 287
		rightWingModel[69] = new ModelRendererTurbo(this, 1697, 73, textureX, textureY); // Box 288
		rightWingModel[70] = new ModelRendererTurbo(this, 985, 81, textureX, textureY); // Box 289
		rightWingModel[71] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Box 290
		rightWingModel[72] = new ModelRendererTurbo(this, 1945, 81, textureX, textureY); // Box 291
		rightWingModel[73] = new ModelRendererTurbo(this, 561, 89, textureX, textureY); // Box 292
		rightWingModel[74] = new ModelRendererTurbo(this, 697, 129, textureX, textureY); // Box 293
		rightWingModel[75] = new ModelRendererTurbo(this, 769, 89, textureX, textureY); // Box 294
		rightWingModel[76] = new ModelRendererTurbo(this, 2033, 89, textureX, textureY); // Box 295
		rightWingModel[77] = new ModelRendererTurbo(this, 361, 97, textureX, textureY); // Box 296
		rightWingModel[78] = new ModelRendererTurbo(this, 561, 105, textureX, textureY); // Box 297
		rightWingModel[79] = new ModelRendererTurbo(this, 1313, 105, textureX, textureY); // Box 298
		rightWingModel[80] = new ModelRendererTurbo(this, 977, 121, textureX, textureY); // Box 299
		rightWingModel[81] = new ModelRendererTurbo(this, 2009, 121, textureX, textureY); // Box 300
		rightWingModel[82] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 301
		rightWingModel[83] = new ModelRendererTurbo(this, 977, 137, textureX, textureY); // Box 302
		rightWingModel[84] = new ModelRendererTurbo(this, 1337, 137, textureX, textureY); // Box 303
		rightWingModel[85] = new ModelRendererTurbo(this, 1497, 105, textureX, textureY); // Box 304
		rightWingModel[86] = new ModelRendererTurbo(this, 489, 113, textureX, textureY); // Box 305
		rightWingModel[87] = new ModelRendererTurbo(this, 1105, 113, textureX, textureY); // Box 306
		rightWingModel[88] = new ModelRendererTurbo(this, 1577, 137, textureX, textureY); // Box 307
		rightWingModel[89] = new ModelRendererTurbo(this, 201, 169, textureX, textureY); // Box 343
		rightWingModel[90] = new ModelRendererTurbo(this, 217, 169, textureX, textureY); // Box 344
		rightWingModel[91] = new ModelRendererTurbo(this, 129, 177, textureX, textureY); // Box 345
		rightWingModel[92] = new ModelRendererTurbo(this, 1185, 177, textureX, textureY); // Box 346
		rightWingModel[93] = new ModelRendererTurbo(this, 1625, 177, textureX, textureY); // Box 347
		rightWingModel[94] = new ModelRendererTurbo(this, 529, 185, textureX, textureY); // Box 348
		rightWingModel[95] = new ModelRendererTurbo(this, 545, 185, textureX, textureY); // Box 349
		rightWingModel[96] = new ModelRendererTurbo(this, 1225, 193, textureX, textureY); // Box 350
		rightWingModel[97] = new ModelRendererTurbo(this, 1177, 705, textureX, textureY); // Box 358
		rightWingModel[98] = new ModelRendererTurbo(this, 1569, 705, textureX, textureY); // Box 359
		rightWingModel[99] = new ModelRendererTurbo(this, 1657, 705, textureX, textureY); // Box 360

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 60, 16, 193, 0F,23F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 23F, 7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 218
		rightWingModel[0].setRotationPoint(-72F, -87F, 10F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 11, 16, 193, 0F,29F, -7F, 0F, -23F, -3F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 29F, 3F, 0F, -23F, 7F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 219
		rightWingModel[1].setRotationPoint(-83F, -87F, 10F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 21, 16, 193, 0F,0F, -3F, 0F, 0F, -11F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F); // Box 220
		rightWingModel[2].setRotationPoint(-12F, -87F, 10F);

		rightWingModel[3].addShapeBox(0F, 0F, 0F, 60, 16, 151, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -4F, 0F, -20F, -4F, 0F); // Box 221
		rightWingModel[3].setRotationPoint(-72F, -88F, 203F);

		rightWingModel[4].addShapeBox(0F, 0F, 0F, 31, 16, 151, 0F,0F, -6F, 0F, -20F, -1F, 0F, 0F, 0F, 0F, -23F, -5F, 0F, 0F, -4F, 0F, -20F, 1F, 0F, 0F, -4F, 0F, -23F, -9F, 0F); // Box 222
		rightWingModel[4].setRotationPoint(-83F, -88F, 203F);

		rightWingModel[5].addShapeBox(0F, 0F, 0F, 29, 11, 20, 0F,0F, 0F, -9.9999F, 0F, -4.9999F, -9.9999F, 0F, -4.9999F, -9.9999F, 0F, 0F, -9.9999F, 0F, -2.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.9999F, 0F); // Box 224
		rightWingModel[5].setRotationPoint(-49F, -20F, 299F);

		rightWingModel[6].addShapeBox(0F, 0F, 0F, 29, 10, 20, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, -2F, -10F); // Box 225
		rightWingModel[6].setRotationPoint(-49F, -12F, 299F);

		rightWingModel[7].addShapeBox(0F, 0F, 0F, 11, 8, 20, 0F,0F, -1F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, -1F, -10F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -3F); // Box 226
		rightWingModel[7].setRotationPoint(-60F, -20F, 299F);

		rightWingModel[8].addShapeBox(0F, 0F, 0F, 11, 10, 20, 0F,0F, 0F, -3F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, -5F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, -5F, -10F); // Box 227
		rightWingModel[8].setRotationPoint(-60F, -14F, 299F);

		rightWingModel[9].addShapeBox(0F, 0F, 0F, 6, 5, 14, 0F,0F, -2.9999F, -6.9999F, 0F, 0F, -6.9999F, 0F, 0F, -6.9999F, 0F, -2.9999F, -6.9999F, 0F, -1.9999F, -6.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9999F, -6.9999F); // Box 228
		rightWingModel[9].setRotationPoint(-66F, -19F, 302F);

		rightWingModel[10].addShapeBox(0F, 0F, 0F, 6, 7, 14, 0F,0F, 0F, -6.9999F, 0F, -1.9999F, 0F, 0F, -1.9999F, 0F, 0F, 0F, -6.9999F, 0F, -6.9999F, -6.9999F, 0F, 0F, -6.9999F, 0F, 0F, -6.9999F, 0F, -6.9999F, -6.9999F); // Box 229
		rightWingModel[10].setRotationPoint(-66F, -16F, 302F);

		rightWingModel[11].addShapeBox(0F, 0F, 0F, 23, 7, 20, 0F,0F, 0F, 0F, 0F, -2.9999F, -9.9999F, 0F, -2.9999F, -9.9999F, 0F, 0F, 0F, 0F, 0F, -9.9999F, 0F, -3.9999F, -9.9999F, 0F, -3.9999F, -9.9999F, 0F, 0F, -9.9999F); // Box 230
		rightWingModel[11].setRotationPoint(-20F, -9F, 299F);

		rightWingModel[12].addShapeBox(0F, 0F, 0F, 23, 9, 20, 0F,0F, 0F, -9.9999F, 0F, -8.9999F, -9.9999F, 0F, -8.9999F, -9.9999F, 0F, 0F, -9.9999F, 0F, -2.9999F, 0F, 0F, 0F, -9.9999F, 0F, 0F, -9.9999F, 0F, -2.9999F, 0F); // Box 231
		rightWingModel[12].setRotationPoint(-20F, -15F, 299F);

		rightWingModel[13].addShapeBox(0F, 0F, 0F, 48, 63, 2, 0F,-8F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -19.5F, 0F, 0F, -7F, 0F, 0F); // Box 232
		rightWingModel[13].setRotationPoint(-60F, -78F, 309F);

		rightWingModel[14].addShapeBox(0F, 0F, 0F, 48, 63, 2, 0F,-15F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -7F, 0F, 0F, -19.5F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F); // Box 233
		rightWingModel[14].setRotationPoint(-60F, -78F, 307F);

		rightWingModel[15].addShapeBox(0F, 0F, 0F, 2, 19, 39, 0F,0F, -57F, 0F, 0F, -57F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, 0F, 40F, 0F, 0F, 40F, 0F, 7F, -17F, 0F, -7F, -17F, 0F); // Box 234
		rightWingModel[15].setRotationPoint(-45F, -78F, 311F);

		rightWingModel[16].addShapeBox(0F, 0F, 0F, 2, 19, 39, 0F,0F, -57F, 0F, 0F, -57F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 0F, 40F, 0F, 0F, 40F, 0F, -5F, -17F, 0F, 5F, -17F, 0F); // Box 235
		rightWingModel[16].setRotationPoint(-33F, -78F, 311F);

		rightWingModel[17].addShapeBox(0F, 0F, 0F, 23, 5, 30, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 236
		rightWingModel[17].setRotationPoint(-142F, -88F, 54F);

		rightWingModel[18].addShapeBox(0F, 0F, 0F, 23, 10, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 237
		rightWingModel[18].setRotationPoint(-142F, -83F, 54F);

		rightWingModel[19].addShapeBox(0F, 0F, 0F, 23, 5, 26, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 238
		rightWingModel[19].setRotationPoint(-142F, -93F, 56F);

		rightWingModel[20].addShapeBox(0F, 0F, 0F, 23, 5, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 239
		rightWingModel[20].setRotationPoint(-142F, -73F, 54F);

		rightWingModel[21].addShapeBox(0F, 0F, 0F, 23, 5, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F); // Box 240
		rightWingModel[21].setRotationPoint(-142F, -68F, 56F);

		rightWingModel[22].addShapeBox(0F, 0F, 0F, 49, 10, 30, 0F,0F, 0F, 0F, 0F, -4F, -14F, 0F, -4F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -14F, 0F, -4F, -14F, 0F, 0F, 0F); // Box 241
		rightWingModel[22].setRotationPoint(-85F, -83F, 54F);

		rightWingModel[23].addShapeBox(0F, 0F, 0F, 49, 5, 30, 0F,0F, 0F, -1.9999F, 0F, -8.9999F, -13.9999F, 0F, -8.9999F, -13.9999F, 0F, 0F, -1.9999F, 0F, 0F, 0F, 0F, 3.9999F, -13.9999F, 0F, 3.9999F, -13.9999F, 0F, 0F, 0F); // Box 242
		rightWingModel[23].setRotationPoint(-85F, -88F, 54F);

		rightWingModel[24].addShapeBox(0F, 0F, 0F, 49, 5, 30, 0F,0F, 4.9999F, -7.9999F, 0F, -8.9999F, -13.9999F, 0F, -8.9999F, -13.9999F, 0F, 4.9999F, -7.9999F, 0F, -4.9999F, -1.9999F, 0F, 3.9999F, -13.9999F, 0F, 3.9999F, -13.9999F, 0F, -4.9999F, -1.9999F); // Box 243
		rightWingModel[24].setRotationPoint(-85F, -88F, 54F);

		rightWingModel[25].addShapeBox(0F, 0F, 0F, 49, 5, 30, 0F,0F, 0F, 0F, 0F, 3.9999F, -13.9999F, 0F, 3.9999F, -13.9999F, 0F, 0F, 0F, 0F, 0F, -1.9999F, 0F, -8.9999F, -13.9999F, 0F, -8.9999F, -13.9999F, 0F, 0F, -1.9999F); // Box 244
		rightWingModel[25].setRotationPoint(-85F, -73F, 54F);

		rightWingModel[26].addShapeBox(0F, 0F, 0F, 49, 5, 30, 0F,0F, -4.9999F, -1.9999F, 0F, 3.9999F, -13.9999F, 0F, 3.9999F, -13.9999F, 0F, -4.9999F, -1.9999F, 0F, 4.9999F, -7.9999F, 0F, -8.9999F, -13.9999F, 0F, -8.9999F, -13.9999F, 0F, 4.9999F, -7.9999F); // Box 245
		rightWingModel[26].setRotationPoint(-85F, -73F, 54F);

		rightWingModel[27].addShapeBox(0F, 0F, 0F, 4, 10, 3, 0F,0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 246
		rightWingModel[27].setRotationPoint(-146F, -83F, 81F);

		rightWingModel[28].addShapeBox(0F, 0F, 0F, 4, 5, 3, 0F,0F, -1F, 3F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, -1F, -3F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F); // Box 247
		rightWingModel[28].setRotationPoint(-146F, -88F, 81F);

		rightWingModel[29].addShapeBox(0F, 0F, 0F, 4, 5, 3, 0F,0F, -1F, 5F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, -1F, -5F, 0F, 1F, -1F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 1F, 1F); // Box 248
		rightWingModel[29].setRotationPoint(-146F, -93F, 77F);

		rightWingModel[30].addShapeBox(0F, 0F, 0F, 4, 3, 14, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F); // Box 249
		rightWingModel[30].setRotationPoint(-146F, -93F, 62F);

		rightWingModel[31].addShapeBox(0F, 0F, 0F, 4, 5, 3, 0F,0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, -1F, 3F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, -1F, -3F); // Box 250
		rightWingModel[31].setRotationPoint(-146F, -73F, 81F);

		rightWingModel[32].addShapeBox(0F, 0F, 0F, 4, 5, 3, 0F,0F, 1F, -1F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 1F, 1F, 0F, -1F, 5F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, -1F, -5F); // Box 251
		rightWingModel[32].setRotationPoint(-146F, -68F, 77F);

		rightWingModel[33].addShapeBox(0F, 0F, 0F, 4, 3, 14, 0F,0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 252
		rightWingModel[33].setRotationPoint(-146F, -66F, 62F);

		rightWingModel[34].addShapeBox(0F, 0F, 0F, 4, 10, 3, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F); // Box 253
		rightWingModel[34].setRotationPoint(-146F, -83F, 54F);

		rightWingModel[35].addShapeBox(0F, 0F, 0F, 4, 5, 3, 0F,0F, -1F, -3F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, -1F, 3F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F); // Box 254
		rightWingModel[35].setRotationPoint(-146F, -88F, 54F);

		rightWingModel[36].addShapeBox(0F, 0F, 0F, 4, 5, 3, 0F,0F, -1F, -5F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, -1F, 5F, 0F, 1F, 1F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 1F, -1F); // Box 255
		rightWingModel[36].setRotationPoint(-146F, -93F, 58F);

		rightWingModel[37].addShapeBox(0F, 0F, 0F, 4, 5, 3, 0F,0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, -1F, -3F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, -1F, 3F); // Box 256
		rightWingModel[37].setRotationPoint(-146F, -73F, 54F);

		rightWingModel[38].addShapeBox(0F, 0F, 0F, 4, 5, 3, 0F,0F, 1F, 1F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 1F, -1F, 0F, -1F, -5F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, -1F, 5F); // Box 257
		rightWingModel[38].setRotationPoint(-146F, -68F, 58F);

		rightWingModel[39].addShapeBox(0F, 0F, 0F, 6, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 258
		rightWingModel[39].setRotationPoint(-146F, -79.5F, 64.5F);

		rightWingModel[40].addShapeBox(0F, 0F, 0F, 6, 3, 9, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 259
		rightWingModel[40].setRotationPoint(-146F, -82.5F, 64.5F);

		rightWingModel[41].addShapeBox(0F, 0F, 0F, 6, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 260
		rightWingModel[41].setRotationPoint(-146F, -76.5F, 64.5F);

		rightWingModel[42].addShapeBox(0F, 0F, 0F, 10, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 261
		rightWingModel[42].setRotationPoint(-156F, -79F, 66F);

		rightWingModel[43].addShapeBox(0F, 0F, 0F, 10, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 262
		rightWingModel[43].setRotationPoint(-156F, -81F, 66F);

		rightWingModel[44].addShapeBox(0F, 0F, 0F, 10, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 263
		rightWingModel[44].setRotationPoint(-156F, -77F, 66F);

		rightWingModel[45].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 264
		rightWingModel[45].setRotationPoint(-159F, -79F, 66F);

		rightWingModel[46].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, -1.9999F, -1.9999F, 0F, 0F, -1.9999F, 0F, 0F, -1.9999F, 0F, -1.9999F, -1.9999F, 0F, 0F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9999F); // Box 265
		rightWingModel[46].setRotationPoint(-159F, -81F, 66F);

		rightWingModel[47].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, 0F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9999F, 0F, -1.9999F, -1.9999F, 0F, 0F, -1.9999F, 0F, 0F, -1.9999F, 0F, -1.9999F, -1.9999F); // Box 266
		rightWingModel[47].setRotationPoint(-159F, -77F, 66F);

		rightWingModel[48].addShapeBox(0F, 0F, 0F, 34, 5, 26, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 267
		rightWingModel[48].setRotationPoint(-119F, -93F, 56F);

		rightWingModel[49].addShapeBox(0F, 0F, 0F, 34, 5, 30, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 268
		rightWingModel[49].setRotationPoint(-119F, -88F, 54F);

		rightWingModel[50].addShapeBox(0F, 0F, 0F, 34, 10, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 269
		rightWingModel[50].setRotationPoint(-119F, -83F, 54F);

		rightWingModel[51].addShapeBox(0F, 0F, 0F, 34, 5, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 270
		rightWingModel[51].setRotationPoint(-119F, -73F, 54F);

		rightWingModel[52].addShapeBox(0F, 0F, 0F, 34, 5, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F); // Box 271
		rightWingModel[52].setRotationPoint(-119F, -68F, 56F);

		rightWingModel[53].addShapeBox(0F, 0F, 0F, 34, 5, 26, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		rightWingModel[53].setRotationPoint(-106F, -94F, 153F);

		rightWingModel[54].addShapeBox(0F, 0F, 0F, 34, 5, 30, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 273
		rightWingModel[54].setRotationPoint(-106F, -89F, 151F);

		rightWingModel[55].addShapeBox(0F, 0F, 0F, 34, 10, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 274
		rightWingModel[55].setRotationPoint(-106F, -84F, 151F);

		rightWingModel[56].addShapeBox(0F, 0F, 0F, 34, 5, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 275
		rightWingModel[56].setRotationPoint(-106F, -74F, 151F);

		rightWingModel[57].addShapeBox(0F, 0F, 0F, 34, 5, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F); // Box 276
		rightWingModel[57].setRotationPoint(-106F, -69F, 153F);

		rightWingModel[58].addShapeBox(0F, 0F, 0F, 49, 5, 30, 0F,0F, 0F, -1.9999F, 0F, -8.9999F, -13.9999F, 0F, -8.9999F, -13.9999F, 0F, 0F, -1.9999F, 0F, 0F, 0F, 0F, 3.9999F, -13.9999F, 0F, 3.9999F, -13.9999F, 0F, 0F, 0F); // Box 277
		rightWingModel[58].setRotationPoint(-72F, -89F, 151F);

		rightWingModel[59].addShapeBox(0F, 0F, 0F, 49, 10, 30, 0F,0F, 0F, 0F, 0F, -4F, -14F, 0F, -4F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -14F, 0F, -4F, -14F, 0F, 0F, 0F); // Box 278
		rightWingModel[59].setRotationPoint(-72F, -84F, 151F);

		rightWingModel[60].addShapeBox(0F, 0F, 0F, 49, 5, 30, 0F,0F, 0F, 0F, 0F, 3.9999F, -13.9999F, 0F, 3.9999F, -13.9999F, 0F, 0F, 0F, 0F, 0F, -1.9999F, 0F, -8.9999F, -13.9999F, 0F, -8.9999F, -13.9999F, 0F, 0F, -1.9999F); // Box 279
		rightWingModel[60].setRotationPoint(-72F, -74F, 151F);

		rightWingModel[61].addShapeBox(0F, 0F, 0F, 49, 5, 30, 0F,0F, -4.9999F, -1.9999F, 0F, 3.9999F, -13.9999F, 0F, 3.9999F, -13.9999F, 0F, -4.9999F, -1.9999F, 0F, 4.9999F, -7.9999F, 0F, -8.9999F, -13.9999F, 0F, -8.9999F, -13.9999F, 0F, 4.9999F, -7.9999F); // Box 280
		rightWingModel[61].setRotationPoint(-72F, -74F, 151F);

		rightWingModel[62].addShapeBox(0F, 0F, 0F, 49, 5, 30, 0F,0F, 4.9999F, -7.9999F, 0F, -8.9999F, -13.9999F, 0F, -8.9999F, -13.9999F, 0F, 4.9999F, -7.9999F, 0F, -4.9999F, -1.9999F, 0F, 3.9999F, -13.9999F, 0F, 3.9999F, -13.9999F, 0F, -4.9999F, -1.9999F); // Box 281
		rightWingModel[62].setRotationPoint(-72F, -89F, 151F);

		rightWingModel[63].addShapeBox(0F, 0F, 0F, 23, 5, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F); // Box 282
		rightWingModel[63].setRotationPoint(-129F, -69F, 153F);

		rightWingModel[64].addShapeBox(0F, 0F, 0F, 23, 5, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 283
		rightWingModel[64].setRotationPoint(-129F, -74F, 151F);

		rightWingModel[65].addShapeBox(0F, 0F, 0F, 23, 10, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 284
		rightWingModel[65].setRotationPoint(-129F, -84F, 151F);

		rightWingModel[66].addShapeBox(0F, 0F, 0F, 23, 5, 30, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 285
		rightWingModel[66].setRotationPoint(-129F, -89F, 151F);

		rightWingModel[67].addShapeBox(0F, 0F, 0F, 23, 5, 26, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 286
		rightWingModel[67].setRotationPoint(-129F, -94F, 153F);

		rightWingModel[68].addShapeBox(0F, 0F, 0F, 4, 3, 14, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F); // Box 287
		rightWingModel[68].setRotationPoint(-133F, -94F, 159F);

		rightWingModel[69].addShapeBox(0F, 0F, 0F, 4, 5, 3, 0F,0F, -1F, 5F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, -1F, -5F, 0F, 1F, -1F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 1F, 1F); // Box 288
		rightWingModel[69].setRotationPoint(-133F, -94F, 174F);

		rightWingModel[70].addShapeBox(0F, 0F, 0F, 4, 10, 3, 0F,0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 289
		rightWingModel[70].setRotationPoint(-133F, -84F, 178F);

		rightWingModel[71].addShapeBox(0F, 0F, 0F, 4, 5, 3, 0F,0F, -1F, 3F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, -1F, -3F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F); // Box 290
		rightWingModel[71].setRotationPoint(-133F, -89F, 178F);

		rightWingModel[72].addShapeBox(0F, 0F, 0F, 4, 5, 3, 0F,0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, -1F, 3F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, -1F, -3F); // Box 291
		rightWingModel[72].setRotationPoint(-133F, -74F, 178F);

		rightWingModel[73].addShapeBox(0F, 0F, 0F, 4, 5, 3, 0F,0F, 1F, -1F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 1F, 1F, 0F, -1F, 5F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, -1F, -5F); // Box 292
		rightWingModel[73].setRotationPoint(-133F, -69F, 174F);

		rightWingModel[74].addShapeBox(0F, 0F, 0F, 4, 3, 14, 0F,0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 293
		rightWingModel[74].setRotationPoint(-133F, -67F, 159F);

		rightWingModel[75].addShapeBox(0F, 0F, 0F, 4, 5, 3, 0F,0F, 1F, 1F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 1F, -1F, 0F, -1F, -5F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, -1F, 5F); // Box 294
		rightWingModel[75].setRotationPoint(-133F, -69F, 155F);

		rightWingModel[76].addShapeBox(0F, 0F, 0F, 4, 5, 3, 0F,0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, -1F, -3F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, -1F, 3F); // Box 295
		rightWingModel[76].setRotationPoint(-133F, -74F, 151F);

		rightWingModel[77].addShapeBox(0F, 0F, 0F, 4, 10, 3, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F); // Box 296
		rightWingModel[77].setRotationPoint(-133F, -84F, 151F);

		rightWingModel[78].addShapeBox(0F, 0F, 0F, 4, 5, 3, 0F,0F, -1F, -3F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, -1F, 3F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F); // Box 297
		rightWingModel[78].setRotationPoint(-133F, -89F, 151F);

		rightWingModel[79].addShapeBox(0F, 0F, 0F, 4, 5, 3, 0F,0F, -1F, -5F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, -1F, 5F, 0F, 1F, 1F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 1F, -1F); // Box 298
		rightWingModel[79].setRotationPoint(-133F, -94F, 155F);

		rightWingModel[80].addShapeBox(0F, 0F, 0F, 6, 3, 9, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		rightWingModel[80].setRotationPoint(-133F, -83.5F, 161.5F);

		rightWingModel[81].addShapeBox(0F, 0F, 0F, 6, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		rightWingModel[81].setRotationPoint(-133F, -80.5F, 161.5F);

		rightWingModel[82].addShapeBox(0F, 0F, 0F, 6, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 301
		rightWingModel[82].setRotationPoint(-133F, -77.5F, 161.5F);

		rightWingModel[83].addShapeBox(0F, 0F, 0F, 10, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 302
		rightWingModel[83].setRotationPoint(-143F, -80F, 163F);

		rightWingModel[84].addShapeBox(0F, 0F, 0F, 10, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 303
		rightWingModel[84].setRotationPoint(-143F, -82F, 163F);

		rightWingModel[85].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, -1.9999F, -1.9999F, 0F, 0F, -1.9999F, 0F, 0F, -1.9999F, 0F, -1.9999F, -1.9999F, 0F, 0F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9999F); // Box 304
		rightWingModel[85].setRotationPoint(-146F, -82F, 163F);

		rightWingModel[86].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, 0F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9999F, 0F, -1.9999F, -1.9999F, 0F, 0F, -1.9999F, 0F, 0F, -1.9999F, 0F, -1.9999F, -1.9999F); // Box 305
		rightWingModel[86].setRotationPoint(-146F, -78F, 163F);

		rightWingModel[87].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 306
		rightWingModel[87].setRotationPoint(-146F, -80F, 163F);

		rightWingModel[88].addShapeBox(0F, 0F, 0F, 10, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 307
		rightWingModel[88].setRotationPoint(-143F, -78F, 163F);

		rightWingModel[89].addShapeBox(0F, -13F, -2F, 1, 26, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 343
		rightWingModel[89].setRotationPoint(-143F, -78F, 69F);

		rightWingModel[90].addShapeBox(0F, -13F, -2F, 1, 26, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 344
		rightWingModel[90].setRotationPoint(-143F, -78F, 69F);
		rightWingModel[90].rotateAngleX = -0.78539816F;

		rightWingModel[91].addShapeBox(0F, -13F, -2F, 1, 26, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 345
		rightWingModel[91].setRotationPoint(-143F, -78F, 69F);
		rightWingModel[91].rotateAngleX = 1.57079633F;

		rightWingModel[92].addShapeBox(0F, -13F, -2F, 1, 26, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 346
		rightWingModel[92].setRotationPoint(-143F, -78F, 69F);
		rightWingModel[92].rotateAngleX = 0.78539816F;

		rightWingModel[93].addShapeBox(0F, -13F, -2F, 1, 26, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 347
		rightWingModel[93].setRotationPoint(-130F, -79F, 166F);

		rightWingModel[94].addShapeBox(0F, -13F, -2F, 1, 26, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 348
		rightWingModel[94].setRotationPoint(-130F, -79F, 166F);
		rightWingModel[94].rotateAngleX = -0.78539816F;

		rightWingModel[95].addShapeBox(0F, -13F, -2F, 1, 26, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 349
		rightWingModel[95].setRotationPoint(-130F, -79F, 166F);
		rightWingModel[95].rotateAngleX = 1.57079633F;

		rightWingModel[96].addShapeBox(0F, -13F, -2F, 1, 26, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 350
		rightWingModel[96].setRotationPoint(-130F, -79F, 166F);
		rightWingModel[96].rotateAngleX = 0.78539816F;

		rightWingModel[97].addShapeBox(0F, 0F, 0F, 40, 12, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -11F, -5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -11F, -5F, -2F); // Box 358
		rightWingModel[97].setRotationPoint(-52F, -88F, 354F);

		rightWingModel[98].addShapeBox(0F, 0F, 0F, 21, 12, 22, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -6F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -5F, 0F, 0F, -5F, 0F); // Box 359
		rightWingModel[98].setRotationPoint(-12F, -88F, 354F);

		rightWingModel[99].addShapeBox(0F, 0F, 0F, 19, 12, 22, 0F,0F, -5F, 0F, -11F, 0F, 0F, 0F, -5F, -2F, -6F, -5F, -7F, 0F, -5F, 0F, -11F, 0F, 0F, 0F, -5F, -2F, -6F, -5F, -7F); // Box 360
		rightWingModel[99].setRotationPoint(-60F, -88F, 354F);
	}

	private void initpitchFlapLeftModel_1()
	{
		pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 1321, 305, textureX, textureY); // Box 162

		pitchFlapLeftModel[0].addShapeBox(0F, 0F, 0F, 14, 10, 103, 0F,0F, 0F, 0F, 0F, -6F, -13F, 0F, -23F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, -3F, -13F, 0F, 14F, 0F, 0F, 16F, 0F); // Box 162
		pitchFlapLeftModel[0].setRotationPoint(208F, -115F, -115F);
	}

	private void initpitchFlapRightModel_1()
	{
		pitchFlapRightModel[0] = new ModelRendererTurbo(this, 1433, 681, textureX, textureY); // Box 333

		pitchFlapRightModel[0].addShapeBox(0F, 0F, 0F, 14, 10, 103, 0F,0F, -16F, 0F, 0F, -23F, 0F, 0F, -6F, -13F, 0F, 0F, 0F, 0F, 16F, 0F, 0F, 14F, 0F, 0F, -3F, -13F, 0F, 0F, 0F); // Box 333
		pitchFlapRightModel[0].setRotationPoint(208F, -115F, 12F);
	}

	private void initpitchFlapLeftWingModel_1()
	{
		pitchFlapLeftWingModel[0] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 51

		pitchFlapLeftWingModel[0].addShapeBox(0F, 0F, 0F, 21, 16, 151, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -9F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, -10F, 0F, 0F, -6F, 0F, 0F, 1F, 0F); // Box 51
		pitchFlapLeftWingModel[0].setRotationPoint(-12F, -88F, -354F);
	}

	private void initpitchFlapRightWingModel_1()
	{
		pitchFlapRightWingModel[0] = new ModelRendererTurbo(this, 857, 529, textureX, textureY); // Box 223

		pitchFlapRightWingModel[0].addShapeBox(0F, 0F, 0F, 21, 16, 151, 0F,0F, -1F, 0F, 0F, -9F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -6F, 0F, 0F, -10F, 0F, 0F, -4F, 0F); // Box 223
		pitchFlapRightWingModel[0].setRotationPoint(-12F, -88F, 203F);
	}

	private void initplaneModeParts_1()
	{
		planeModeParts[0] = new ModelRendererTurbo(this, 1273, 161, textureX, textureY); // Box 239
		planeModeParts[1] = new ModelRendererTurbo(this, 249, 121, textureX, textureY); // Box 240
		planeModeParts[2] = new ModelRendererTurbo(this, 1593, 17, textureX, textureY); // Box 241
		planeModeParts[3] = new ModelRendererTurbo(this, 1641, 17, textureX, textureY); // Box 242
		planeModeParts[4] = new ModelRendererTurbo(this, 1809, 129, textureX, textureY); // Box 243
		planeModeParts[5] = new ModelRendererTurbo(this, 1713, 161, textureX, textureY); // Box 244
		planeModeParts[6] = new ModelRendererTurbo(this, 97, 113, textureX, textureY); // Box 245
		planeModeParts[7] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 246
		planeModeParts[8] = new ModelRendererTurbo(this, 1049, 1, textureX, textureY); // Box 247
		planeModeParts[9] = new ModelRendererTurbo(this, 1865, 1, textureX, textureY); // Box 248
		planeModeParts[10] = new ModelRendererTurbo(this, 1025, 65, textureX, textureY); // Box 250
		planeModeParts[11] = new ModelRendererTurbo(this, 1961, 89, textureX, textureY); // Box 251
		planeModeParts[12] = new ModelRendererTurbo(this, 1169, 81, textureX, textureY); // Box 252
		planeModeParts[13] = new ModelRendererTurbo(this, 1321, 81, textureX, textureY); // Box 253
		planeModeParts[14] = new ModelRendererTurbo(this, 1225, 1, textureX, textureY); // Box 263
		planeModeParts[15] = new ModelRendererTurbo(this, 1113, 1, textureX, textureY); // Box 264
		planeModeParts[16] = new ModelRendererTurbo(this, 1161, 1, textureX, textureY); // Box 962
		planeModeParts[17] = new ModelRendererTurbo(this, 1257, 1, textureX, textureY); // Box 964
		planeModeParts[18] = new ModelRendererTurbo(this, 1281, 1, textureX, textureY); // Box 966
		planeModeParts[19] = new ModelRendererTurbo(this, 1121, 1, textureX, textureY); // Box 782
		planeModeParts[20] = new ModelRendererTurbo(this, 1993, 1, textureX, textureY); // Box 783
		planeModeParts[21] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 786
		planeModeParts[22] = new ModelRendererTurbo(this, 817, 9, textureX, textureY); // Box 789
		planeModeParts[23] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 791
		planeModeParts[24] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 792
		planeModeParts[25] = new ModelRendererTurbo(this, 377, 169, textureX, textureY); // Box 384
		planeModeParts[26] = new ModelRendererTurbo(this, 249, 137, textureX, textureY); // Box 385
		planeModeParts[27] = new ModelRendererTurbo(this, 977, 65, textureX, textureY); // Box 386
		planeModeParts[28] = new ModelRendererTurbo(this, 705, 73, textureX, textureY); // Box 387
		planeModeParts[29] = new ModelRendererTurbo(this, 1305, 137, textureX, textureY); // Box 388
		planeModeParts[30] = new ModelRendererTurbo(this, 81, 169, textureX, textureY); // Box 389
		planeModeParts[31] = new ModelRendererTurbo(this, 1657, 113, textureX, textureY); // Box 390
		planeModeParts[32] = new ModelRendererTurbo(this, 1497, 169, textureX, textureY); // Box 391
		planeModeParts[33] = new ModelRendererTurbo(this, 2041, 1, textureX, textureY); // Box 392
		planeModeParts[34] = new ModelRendererTurbo(this, 1017, 65, textureX, textureY); // Box 393
		planeModeParts[35] = new ModelRendererTurbo(this, 993, 97, textureX, textureY); // Box 394
		planeModeParts[36] = new ModelRendererTurbo(this, 1769, 105, textureX, textureY); // Box 395
		planeModeParts[37] = new ModelRendererTurbo(this, 537, 89, textureX, textureY); // Box 396
		planeModeParts[38] = new ModelRendererTurbo(this, 305, 97, textureX, textureY); // Box 397
		planeModeParts[39] = new ModelRendererTurbo(this, 881, 49, textureX, textureY); // Box 398
		planeModeParts[40] = new ModelRendererTurbo(this, 1145, 1, textureX, textureY); // Box 399
		planeModeParts[41] = new ModelRendererTurbo(this, 1113, 9, textureX, textureY); // Box 400
		planeModeParts[42] = new ModelRendererTurbo(this, 1161, 9, textureX, textureY); // Box 401
		planeModeParts[43] = new ModelRendererTurbo(this, 1993, 9, textureX, textureY); // Box 402
		planeModeParts[44] = new ModelRendererTurbo(this, 2001, 1, textureX, textureY); // Box 403
		planeModeParts[45] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 404
		planeModeParts[46] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 405
		planeModeParts[47] = new ModelRendererTurbo(this, 785, 17, textureX, textureY); // Box 406
		planeModeParts[48] = new ModelRendererTurbo(this, 817, 1, textureX, textureY); // Box 407
		planeModeParts[49] = new ModelRendererTurbo(this, 825, 1, textureX, textureY); // Box 408

		planeModeParts[0].addShapeBox(0F, 1F, 0F, 10, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
		planeModeParts[0].setRotationPoint(-174F, -60F, -15F);
		planeModeParts[0].rotateAngleZ = -0.10471976F;

		planeModeParts[1].addShapeBox(9F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		planeModeParts[1].setRotationPoint(-174F, -60F, -15F);
		planeModeParts[1].rotateAngleZ = -0.10471976F;

		planeModeParts[2].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		planeModeParts[2].setRotationPoint(-174F, -60F, -15F);
		planeModeParts[2].rotateAngleZ = -0.10471976F;

		planeModeParts[3].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		planeModeParts[3].setRotationPoint(-174F, -60F, -6F);
		planeModeParts[3].rotateAngleZ = -0.10471976F;

		planeModeParts[4].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		planeModeParts[4].setRotationPoint(-174F, -60F, -15F);
		planeModeParts[4].rotateAngleZ = -0.10471976F;

		planeModeParts[5].addShapeBox(0F, 0F, 0F, 1, 13, 10, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		planeModeParts[5].setRotationPoint(-165F, -72F, -15F);

		planeModeParts[6].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		planeModeParts[6].setRotationPoint(-163F, -76F, -13F);

		planeModeParts[7].addShapeBox(0F, 0F, 0F, 1, 13, 8, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 246
		planeModeParts[7].setRotationPoint(-166F, -71F, -14F);

		planeModeParts[8].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		planeModeParts[8].setRotationPoint(-166.3F, -71.3F, -12F);

		planeModeParts[9].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		planeModeParts[9].setRotationPoint(-166.3F, -71.3F, -9F);

		planeModeParts[10].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 250
		planeModeParts[10].setRotationPoint(-165F, -69F, -14F);

		planeModeParts[11].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 251
		planeModeParts[11].setRotationPoint(-165F, -69F, -7F);

		planeModeParts[12].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 252
		planeModeParts[12].setRotationPoint(-171F, -59F, -16F);
		planeModeParts[12].rotateAngleZ = 0.78539816F;

		planeModeParts[13].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 253
		planeModeParts[13].setRotationPoint(-171F, -59F, -5F);
		planeModeParts[13].rotateAngleZ = 0.78539816F;

		planeModeParts[14].addShapeBox(-1F, -1F, 0F, 2, 11, 2, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 263
		planeModeParts[14].setRotationPoint(-175.5F, -64.25F, -11F);
		planeModeParts[14].rotateAngleZ = -1.13446401F;

		planeModeParts[15].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 264
		planeModeParts[15].setRotationPoint(-175F, -68F, -10.5F);

		planeModeParts[16].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 962
		planeModeParts[16].setRotationPoint(-163.5F, -75.5F, -11.5F);

		planeModeParts[17].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 964
		planeModeParts[17].setRotationPoint(-163.5F, -74.5F, -11.5F);

		planeModeParts[18].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 966
		planeModeParts[18].setRotationPoint(-163.5F, -73.5F, -11.5F);

		planeModeParts[19].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 782
		planeModeParts[19].setRotationPoint(-170F, -58F, -14F);

		planeModeParts[20].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 783
		planeModeParts[20].setRotationPoint(-170F, -58F, -7F);

		planeModeParts[21].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 786
		planeModeParts[21].setRotationPoint(-175F, -67.75F, -9.5F);

		planeModeParts[22].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 789
		planeModeParts[22].setRotationPoint(-175F, -67.75F, -13.5F);

		planeModeParts[23].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 791
		planeModeParts[23].setRotationPoint(-175F, -70.75F, -13.5F);

		planeModeParts[24].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 792
		planeModeParts[24].setRotationPoint(-175F, -70.75F, -7.5F);

		planeModeParts[25].addShapeBox(0F, 1F, 0F, 10, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 384
		planeModeParts[25].setRotationPoint(-174F, -60F, 5F);
		planeModeParts[25].rotateAngleZ = -0.10471976F;

		planeModeParts[26].addShapeBox(9F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 385
		planeModeParts[26].setRotationPoint(-174F, -60F, 5F);
		planeModeParts[26].rotateAngleZ = -0.10471976F;

		planeModeParts[27].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 386
		planeModeParts[27].setRotationPoint(-174F, -60F, 14F);
		planeModeParts[27].rotateAngleZ = -0.10471976F;

		planeModeParts[28].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 387
		planeModeParts[28].setRotationPoint(-174F, -60F, 5F);
		planeModeParts[28].rotateAngleZ = -0.10471976F;

		planeModeParts[29].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 388
		planeModeParts[29].setRotationPoint(-174F, -60F, 5F);
		planeModeParts[29].rotateAngleZ = -0.10471976F;

		planeModeParts[30].addShapeBox(0F, 0F, 0F, 1, 13, 10, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 389
		planeModeParts[30].setRotationPoint(-165F, -72F, 5F);

		planeModeParts[31].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 390
		planeModeParts[31].setRotationPoint(-163F, -76F, 7F);

		planeModeParts[32].addShapeBox(0F, 0F, 0F, 1, 13, 8, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 391
		planeModeParts[32].setRotationPoint(-166F, -71F, 6F);

		planeModeParts[33].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 392
		planeModeParts[33].setRotationPoint(-166.3F, -71.3F, 11F);

		planeModeParts[34].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 393
		planeModeParts[34].setRotationPoint(-166.3F, -71.3F, 8F);

		planeModeParts[35].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 394
		planeModeParts[35].setRotationPoint(-165F, -69F, 13F);

		planeModeParts[36].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 395
		planeModeParts[36].setRotationPoint(-165F, -69F, 6F);

		planeModeParts[37].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 396
		planeModeParts[37].setRotationPoint(-171F, -59F, 15F);
		planeModeParts[37].rotateAngleZ = 0.78539816F;

		planeModeParts[38].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 397
		planeModeParts[38].setRotationPoint(-171F, -59F, 4F);
		planeModeParts[38].rotateAngleZ = 0.78539816F;

		planeModeParts[39].addShapeBox(-1F, -1F, 0F, 2, 11, 2, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 398
		planeModeParts[39].setRotationPoint(-175.5F, -64.25F, 9F);
		planeModeParts[39].rotateAngleZ = -1.13446401F;

		planeModeParts[40].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 399
		planeModeParts[40].setRotationPoint(-175F, -68F, 9.5F);

		planeModeParts[41].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 400
		planeModeParts[41].setRotationPoint(-163.5F, -75.5F, 8.5F);

		planeModeParts[42].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 401
		planeModeParts[42].setRotationPoint(-163.5F, -74.5F, 8.5F);

		planeModeParts[43].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 402
		planeModeParts[43].setRotationPoint(-163.5F, -73.5F, 8.5F);

		planeModeParts[44].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 403
		planeModeParts[44].setRotationPoint(-170F, -58F, 13F);

		planeModeParts[45].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 404
		planeModeParts[45].setRotationPoint(-170F, -58F, 6F);

		planeModeParts[46].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 405
		planeModeParts[46].setRotationPoint(-175F, -67.75F, 6.5F);

		planeModeParts[47].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 406
		planeModeParts[47].setRotationPoint(-175F, -67.75F, 10.5F);

		planeModeParts[48].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 407
		planeModeParts[48].setRotationPoint(-175F, -70.75F, 12.5F);

		planeModeParts[49].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 408
		planeModeParts[49].setRotationPoint(-175F, -70.75F, 6.5F);
	}

	private void initPropeller()
	{
		propellerModels = new ModelRendererTurbo[4][3];
		propellerModels[0] = makeProp1(-149F, -78F, -69F);
		propellerModels[1] = makeProp2(-136F, -78F, -166F);
		propellerModels[2] = makeProp3(-149F, -78F, 69F);
		propellerModels[3] = makeProp4(-136F, -78F, 166F);
	}

	private ModelRendererTurbo[] makeProp1(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[3];
		prop[0] = new ModelRendererTurbo(this, 0, 810, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 810, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 0, 810, textureX, textureY);
		prop[0].addBox(-1F, -45F, -2.5F, 2, 45, 5, 0.0F);
		prop[1].addBox(-1F, -45F, -2.5F, 2, 45, 5, 0.0F);
		prop[2].addBox(-1F, -45F, -2.5F, 2, 45, 5, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		return prop;
	}

	private ModelRendererTurbo[] makeProp2(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[3];
		prop[0] = new ModelRendererTurbo(this, 0, 810, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 810, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 0, 810, textureX, textureY);
		prop[0].addBox(-1F, -45F, -2.5F, 2, 45, 5, 0.0F);
		prop[1].addBox(-1F, -45F, -2.5F, 2, 45, 5, 0.0F);
		prop[2].addBox(-1F, -45F, -2.5F, 2, 45, 5, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		return prop;
	}

	private ModelRendererTurbo[] makeProp3(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[3];
		prop[0] = new ModelRendererTurbo(this, 0, 810, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 810, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 0, 810, textureX, textureY);
		prop[0].addBox(-1F, -45F, -2.5F, 2, 45, 5, 0.0F);
		prop[1].addBox(-1F, -45F, -2.5F, 2, 45, 5, 0.0F);
		prop[2].addBox(-1F, -45F, -2.5F, 2, 45, 5, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		return prop;
	}

	private ModelRendererTurbo[] makeProp4(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[3];
		prop[0] = new ModelRendererTurbo(this, 0, 810, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 810, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 0, 810, textureX, textureY);
		prop[0].addBox(-1F, -45F, -2.5F, 2, 45, 5, 0.0F);
		prop[1].addBox(-1F, -45F, -2.5F, 2, 45, 5, 0.0F);
		prop[2].addBox(-1F, -45F, -2.5F, 2, 45, 5, 0.0F);
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

		gun_1_Model[0] = new ModelRendererTurbo[64];
		gun_1_Model[0][0] = new ModelRendererTurbo(this, 1, 961, textureX, textureY); // Box 0
		gun_1_Model[0][1] = new ModelRendererTurbo(this, 49, 961, textureX, textureY); // Box 3
		gun_1_Model[0][2] = new ModelRendererTurbo(this, 57, 961, textureX, textureY); // Box 4
		gun_1_Model[0][3] = new ModelRendererTurbo(this, 89, 961, textureX, textureY); // Box 7
		gun_1_Model[0][4] = new ModelRendererTurbo(this, 97, 961, textureX, textureY); // Box 8
		gun_1_Model[0][5] = new ModelRendererTurbo(this, 105, 961, textureX, textureY); // Box 13
		gun_1_Model[0][6] = new ModelRendererTurbo(this, 129, 961, textureX, textureY); // Box 14
		gun_1_Model[0][7] = new ModelRendererTurbo(this, 153, 961, textureX, textureY); // Box 15
		gun_1_Model[0][8] = new ModelRendererTurbo(this, 177, 961, textureX, textureY); // Box 16
		gun_1_Model[0][9] = new ModelRendererTurbo(this, 209, 961, textureX, textureY); // Box 17
		gun_1_Model[0][10] = new ModelRendererTurbo(this, 233, 961, textureX, textureY); // Box 18
		gun_1_Model[0][11] = new ModelRendererTurbo(this, 257, 961, textureX, textureY); // Box 19
		gun_1_Model[0][12] = new ModelRendererTurbo(this, 281, 961, textureX, textureY); // Box 20
		gun_1_Model[0][13] = new ModelRendererTurbo(this, 297, 961, textureX, textureY); // Box 21
		gun_1_Model[0][14] = new ModelRendererTurbo(this, 321, 961, textureX, textureY); // Box 22
		gun_1_Model[0][15] = new ModelRendererTurbo(this, 217, 961, textureX, textureY); // Box 23
		gun_1_Model[0][16] = new ModelRendererTurbo(this, 241, 961, textureX, textureY); // Box 24
		gun_1_Model[0][17] = new ModelRendererTurbo(this, 1, 961, textureX, textureY); // Box 30
		gun_1_Model[0][18] = new ModelRendererTurbo(this, 33, 961, textureX, textureY); // Box 31
		gun_1_Model[0][19] = new ModelRendererTurbo(this, 41, 961, textureX, textureY); // Box 32
		gun_1_Model[0][20] = new ModelRendererTurbo(this, 105, 961, textureX, textureY); // Box 33
		gun_1_Model[0][21] = new ModelRendererTurbo(this, 465, 961, textureX, textureY); // Box 34
		gun_1_Model[0][22] = new ModelRendererTurbo(this, 273, 961, textureX, textureY); // Box 35
		gun_1_Model[0][23] = new ModelRendererTurbo(this, 473, 961, textureX, textureY); // Box 36
		gun_1_Model[0][24] = new ModelRendererTurbo(this, 481, 961, textureX, textureY); // Box 37
		gun_1_Model[0][25] = new ModelRendererTurbo(this, 489, 961, textureX, textureY); // Box 39
		gun_1_Model[0][26] = new ModelRendererTurbo(this, 577, 961, textureX, textureY); // Box 46
		gun_1_Model[0][27] = new ModelRendererTurbo(this, 593, 961, textureX, textureY); // Box 39
		gun_1_Model[0][28] = new ModelRendererTurbo(this, 609, 961, textureX, textureY); // Box 40
		gun_1_Model[0][29] = new ModelRendererTurbo(this, 585, 961, textureX, textureY); // Box 41
		gun_1_Model[0][30] = new ModelRendererTurbo(this, 617, 961, textureX, textureY); // Box 42
		gun_1_Model[0][31] = new ModelRendererTurbo(this, 633, 961, textureX, textureY); // Box 43
		gun_1_Model[0][32] = new ModelRendererTurbo(this, 625, 961, textureX, textureY); // Box 44
		gun_1_Model[0][33] = new ModelRendererTurbo(this, 649, 961, textureX, textureY); // Box 45
		gun_1_Model[0][34] = new ModelRendererTurbo(this, 657, 961, textureX, textureY); // Box 46
		gun_1_Model[0][35] = new ModelRendererTurbo(this, 673, 961, textureX, textureY); // Box 47
		gun_1_Model[0][36] = new ModelRendererTurbo(this, 689, 961, textureX, textureY); // Box 48
		gun_1_Model[0][37] = new ModelRendererTurbo(this, 705, 961, textureX, textureY); // Box 49
		gun_1_Model[0][38] = new ModelRendererTurbo(this, 713, 961, textureX, textureY); // Box 50
		gun_1_Model[0][39] = new ModelRendererTurbo(this, 721, 961, textureX, textureY); // Box 51
		gun_1_Model[0][40] = new ModelRendererTurbo(this, 729, 961, textureX, textureY); // Box 52
		gun_1_Model[0][41] = new ModelRendererTurbo(this, 737, 961, textureX, textureY); // Box 53
		gun_1_Model[0][42] = new ModelRendererTurbo(this, 745, 961, textureX, textureY); // Box 54
		gun_1_Model[0][43] = new ModelRendererTurbo(this, 753, 961, textureX, textureY); // Box 56
		gun_1_Model[0][44] = new ModelRendererTurbo(this, 761, 961, textureX, textureY); // Box 57
		gun_1_Model[0][45] = new ModelRendererTurbo(this, 769, 961, textureX, textureY); // Box 58
		gun_1_Model[0][46] = new ModelRendererTurbo(this, 777, 961, textureX, textureY); // Box 59
		gun_1_Model[0][47] = new ModelRendererTurbo(this, 785, 961, textureX, textureY); // Box 60
		gun_1_Model[0][48] = new ModelRendererTurbo(this, 793, 961, textureX, textureY); // Box 61
		gun_1_Model[0][49] = new ModelRendererTurbo(this, 793, 961, textureX, textureY); // Box 62
		gun_1_Model[0][50] = new ModelRendererTurbo(this, 817, 961, textureX, textureY); // Box 63
		gun_1_Model[0][51] = new ModelRendererTurbo(this, 809, 961, textureX, textureY); // Box 64
		gun_1_Model[0][52] = new ModelRendererTurbo(this, 825, 961, textureX, textureY); // Box 65
		gun_1_Model[0][53] = new ModelRendererTurbo(this, 833, 961, textureX, textureY); // Box 66
		gun_1_Model[0][54] = new ModelRendererTurbo(this, 833, 961, textureX, textureY); // Box 67
		gun_1_Model[0][55] = new ModelRendererTurbo(this, 857, 961, textureX, textureY); // Box 68
		gun_1_Model[0][56] = new ModelRendererTurbo(this, 849, 961, textureX, textureY); // Box 69
		gun_1_Model[0][57] = new ModelRendererTurbo(this, 865, 961, textureX, textureY); // Box 70
		gun_1_Model[0][58] = new ModelRendererTurbo(this, 873, 961, textureX, textureY); // Box 71
		gun_1_Model[0][59] = new ModelRendererTurbo(this, 873, 961, textureX, textureY); // Box 72
		gun_1_Model[0][60] = new ModelRendererTurbo(this, 897, 961, textureX, textureY); // Box 73
		gun_1_Model[0][61] = new ModelRendererTurbo(this, 889, 961, textureX, textureY); // Box 74
		gun_1_Model[0][62] = new ModelRendererTurbo(this, 905, 961, textureX, textureY); // Box 75
		gun_1_Model[0][63] = new ModelRendererTurbo(this, 913, 961, textureX, textureY); // Box 76

		gun_1_Model[0][0].addShapeBox(-5F, 4F, -5F, 10, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0

		gun_1_Model[0][1].addShapeBox(9F, -6F, -2F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3

		gun_1_Model[0][2].addShapeBox(9F, -6F, 1F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4

		gun_1_Model[0][3].addShapeBox(8F, -6F, 3F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7

		gun_1_Model[0][4].addShapeBox(8F, -6F, -4F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8

		gun_1_Model[0][5].addShapeBox(5F, 4F, -5F, 4, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13

		gun_1_Model[0][6].addShapeBox(-5F, 4F, -9F, 10, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14

		gun_1_Model[0][7].addShapeBox(-9F, 4F, -5F, 4, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15

		gun_1_Model[0][8].addShapeBox(-5F, 4F, 5F, 10, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16

		gun_1_Model[0][9].addShapeBox(-9F, 4F, 5F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1.5F); // Box 17

		gun_1_Model[0][10].addShapeBox(-9F, 4F, -9F, 4, 1, 4, 0F,-1.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18

		gun_1_Model[0][11].addShapeBox(5F, 4F, -9F, 4, 1, 4, 0F,0F, 0F, 0F, -1.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19

		gun_1_Model[0][12].addShapeBox(5F, 4F, 5F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1.5F, 0F, 0F, 0F); // Box 20

		gun_1_Model[0][13].addShapeBox(-5F, 4F, -10F, 10, 1, 1, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21

		gun_1_Model[0][14].addShapeBox(-5F, 4F, 9F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 22

		gun_1_Model[0][15].addShapeBox(-10F, 4F, -5F, 1, 1, 10, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 23

		gun_1_Model[0][16].addShapeBox(9F, 4F, -5F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 24

		gun_1_Model[0][17].addShapeBox(9F, -9F, -2F, 1, 3, 1, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30

		gun_1_Model[0][18].addShapeBox(8F, -11F, -2F, 1, 2, 1, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31

		gun_1_Model[0][19].addShapeBox(7F, -11F, -4F, 1, 2, 1, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32

		gun_1_Model[0][20].addShapeBox(8F, -9F, -4F, 1, 3, 1, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33

		gun_1_Model[0][21].addShapeBox(9F, -9F, 1F, 1, 3, 1, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34

		gun_1_Model[0][22].addShapeBox(8F, -11F, 1F, 1, 2, 1, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35

		gun_1_Model[0][23].addShapeBox(7F, -11F, 3F, 1, 2, 1, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36

		gun_1_Model[0][24].addShapeBox(8F, -9F, 3F, 1, 3, 1, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37

		gun_1_Model[0][25].addShapeBox(6F, -11F, -4F, 1, 1, 3, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39

		gun_1_Model[0][26].addShapeBox(6F, -11F, 1F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 46

		gun_1_Model[0][27].addShapeBox(8F, -6F, 4F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 39

		gun_1_Model[0][28].addShapeBox(7F, -6F, 7F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 2F, 0F, -1F); // Box 40

		gun_1_Model[0][29].addShapeBox(2F, -6F, 9F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 41

		gun_1_Model[0][30].addShapeBox(-2F, -6F, 9F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42

		gun_1_Model[0][31].addShapeBox(-8F, -6F, 9F, 6, 1, 1, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 43

		gun_1_Model[0][32].addShapeBox(8F, -6F, -7F, 1, 1, 3, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44

		gun_1_Model[0][33].addShapeBox(7F, -6F, -9F, 1, 1, 2, 0F,2F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45

		gun_1_Model[0][34].addShapeBox(2F, -6F, -10F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 46

		gun_1_Model[0][35].addShapeBox(-2F, -6F, -10F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47

		gun_1_Model[0][36].addShapeBox(-8F, -6F, -10F, 6, 1, 1, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 48

		gun_1_Model[0][37].addShapeBox(5F, -13F, -4F, 1, 2, 1, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49

		gun_1_Model[0][38].addShapeBox(3F, -15F, -4F, 1, 2, 1, 0F,2F, -1F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50

		gun_1_Model[0][39].addShapeBox(4F, -15F, -2F, 1, 2, 1, 0F,3F, -1F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51

		gun_1_Model[0][40].addShapeBox(6F, -13F, -2F, 1, 2, 1, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52

		gun_1_Model[0][41].addShapeBox(5F, -13F, 3F, 1, 2, 1, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53

		gun_1_Model[0][42].addShapeBox(3F, -15F, 3F, 1, 2, 1, 0F,2F, -1F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54

		gun_1_Model[0][43].addShapeBox(6F, -13F, 1F, 1, 2, 1, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56

		gun_1_Model[0][44].addShapeBox(4F, -15F, 1F, 1, 2, 1, 0F,3F, -1F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57

		gun_1_Model[0][45].addShapeBox(0F, -5F, 9F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58

		gun_1_Model[0][46].addShapeBox(0F, -10F, 8F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 59

		gun_1_Model[0][47].addShapeBox(0F, -13F, 6F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 60

		gun_1_Model[0][48].addShapeBox(0F, -15F, 4F, 1, 2, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 61

		gun_1_Model[0][49].addShapeBox(0F, -15F, -4F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62

		gun_1_Model[0][50].addShapeBox(0F, -5F, -10F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63

		gun_1_Model[0][51].addShapeBox(0F, -10F, -9F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 64

		gun_1_Model[0][52].addShapeBox(0F, -13F, -7F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 65

		gun_1_Model[0][53].addShapeBox(0F, -15F, -5F, 1, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 66

		gun_1_Model[0][54].addShapeBox(0F, -15F, -4F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67

		gun_1_Model[0][55].addShapeBox(-4F, -6F, -9F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68

		gun_1_Model[0][56].addShapeBox(-4F, -10F, -8F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 69

		gun_1_Model[0][57].addShapeBox(-4F, -13F, -6F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 70

		gun_1_Model[0][58].addShapeBox(-4F, -15F, -4F, 1, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 71

		gun_1_Model[0][59].addShapeBox(-4F, -15F, -3F, 4, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 72

		gun_1_Model[0][60].addShapeBox(-4F, -6F, 8F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73

		gun_1_Model[0][61].addShapeBox(-4F, -10F, 7F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 74

		gun_1_Model[0][62].addShapeBox(-4F, -13F, 5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 75

		gun_1_Model[0][63].addShapeBox(-4F, -15F, 3F, 1, 2, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 76

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_1_Model[0])
		{
			gunPart.setRotationPoint(-219F, -48F, 0F);
		}


		gun_1_Model[1] = new ModelRendererTurbo[6];
		gun_1_Model[1][0] = new ModelRendererTurbo(this, 65, 961, textureX, textureY); // Box 5
		gun_1_Model[1][1] = new ModelRendererTurbo(this, 345, 961, textureX, textureY); // Box 25
		gun_1_Model[1][2] = new ModelRendererTurbo(this, 369, 961, textureX, textureY); // Box 26
		gun_1_Model[1][3] = new ModelRendererTurbo(this, 393, 961, textureX, textureY); // Box 27
		gun_1_Model[1][4] = new ModelRendererTurbo(this, 417, 961, textureX, textureY); // Box 28
		gun_1_Model[1][5] = new ModelRendererTurbo(this, 441, 961, textureX, textureY); // Box 29

		gun_1_Model[1][0].addShapeBox(8F, -6F, -3F, 10, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 5

		gun_1_Model[1][1].addShapeBox(8F, -6F, -3.25F, 10, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 25

		gun_1_Model[1][2].addShapeBox(8F, -6F, -2.75F, 10, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 26

		gun_1_Model[1][3].addShapeBox(8F, -6F, 2F, 10, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 27

		gun_1_Model[1][4].addShapeBox(8F, -6F, 2.25F, 10, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 28

		gun_1_Model[1][5].addShapeBox(8F, -6F, 1.75F, 10, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 29

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_1_Model[1])
		{
			gunPart.setRotationPoint(-219F, -48F, 0F);
		}


		gun_1_Model[2] = new ModelRendererTurbo[6];
		gun_1_Model[2][0] = new ModelRendererTurbo(this, 497, 961, textureX, textureY); // Box 40
		gun_1_Model[2][1] = new ModelRendererTurbo(this, 513, 961, textureX, textureY); // Box 41
		gun_1_Model[2][2] = new ModelRendererTurbo(this, 529, 961, textureX, textureY); // Box 42
		gun_1_Model[2][3] = new ModelRendererTurbo(this, 537, 961, textureX, textureY); // Box 43
		gun_1_Model[2][4] = new ModelRendererTurbo(this, 553, 961, textureX, textureY); // Box 44
		gun_1_Model[2][5] = new ModelRendererTurbo(this, 569, 961, textureX, textureY); // Box 45

		gun_1_Model[2][0].addShapeBox(3F, -6F, -3F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 40

		gun_1_Model[2][1].addShapeBox(3F, -6.5F, -3F, 5, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 41

		gun_1_Model[2][2].addShapeBox(5F, -5.5F, -3.5F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 42

		gun_1_Model[2][3].addShapeBox(3F, -6F, 2F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 43

		gun_1_Model[2][4].addShapeBox(3F, -6.5F, 2F, 5, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 44

		gun_1_Model[2][5].addShapeBox(5F, -5.5F, 1.5F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 45

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_1_Model[2])
		{
			gunPart.setRotationPoint(-219F, -48F, 0F);
		}


		registerGunModel("NoseGun", gun_1_Model);

		// Passenger 3
		ModelRendererTurbo[][] gun_2_Model = new ModelRendererTurbo[3][];

		gun_2_Model[0] = new ModelRendererTurbo[37];
		gun_2_Model[0][0] = new ModelRendererTurbo(this, 1, 870, textureX, textureY); // Import GT_01
		gun_2_Model[0][1] = new ModelRendererTurbo(this, 9, 870, textureX, textureY); // Import GT_02
		gun_2_Model[0][2] = new ModelRendererTurbo(this, 25, 870, textureX, textureY); // Import GT_03
		gun_2_Model[0][3] = new ModelRendererTurbo(this, 41, 870, textureX, textureY); // Import GT_04
		gun_2_Model[0][4] = new ModelRendererTurbo(this, 65, 870, textureX, textureY); // Import GT_05
		gun_2_Model[0][5] = new ModelRendererTurbo(this, 81, 870, textureX, textureY); // Import GT_06
		gun_2_Model[0][6] = new ModelRendererTurbo(this, 113, 870, textureX, textureY); // Import GT_07
		gun_2_Model[0][7] = new ModelRendererTurbo(this, 97, 870, textureX, textureY); // Import GT_08
		gun_2_Model[0][8] = new ModelRendererTurbo(this, 113, 870, textureX, textureY); // Import GT_09
		gun_2_Model[0][9] = new ModelRendererTurbo(this, 129, 870, textureX, textureY); // Import GT_10
		gun_2_Model[0][10] = new ModelRendererTurbo(this, 137, 870, textureX, textureY); // Import GT_11
		gun_2_Model[0][11] = new ModelRendererTurbo(this, 145, 870, textureX, textureY); // Import GT_12
		gun_2_Model[0][12] = new ModelRendererTurbo(this, 153, 870, textureX, textureY); // Import GT_13
		gun_2_Model[0][13] = new ModelRendererTurbo(this, 161, 870, textureX, textureY); // Import GT_14
		gun_2_Model[0][14] = new ModelRendererTurbo(this, 169, 870, textureX, textureY); // Import GT_15
		gun_2_Model[0][15] = new ModelRendererTurbo(this, 177, 870, textureX, textureY); // Import GT_16
		gun_2_Model[0][16] = new ModelRendererTurbo(this, 185, 870, textureX, textureY); // Import GT_17
		gun_2_Model[0][17] = new ModelRendererTurbo(this, 193, 870, textureX, textureY); // Import GT_18
		gun_2_Model[0][18] = new ModelRendererTurbo(this, 201, 870, textureX, textureY); // Import GT_19
		gun_2_Model[0][19] = new ModelRendererTurbo(this, 217, 870, textureX, textureY); // Import GT_20
		gun_2_Model[0][20] = new ModelRendererTurbo(this, 241, 870, textureX, textureY); // Import GT_21
		gun_2_Model[0][21] = new ModelRendererTurbo(this, 265, 870, textureX, textureY); // Import GT_23
		gun_2_Model[0][22] = new ModelRendererTurbo(this, 273, 870, textureX, textureY); // Import GT_24
		gun_2_Model[0][23] = new ModelRendererTurbo(this, 281, 870, textureX, textureY); // Import GT_25
		gun_2_Model[0][24] = new ModelRendererTurbo(this, 297, 870, textureX, textureY); // Import GT_26
		gun_2_Model[0][25] = new ModelRendererTurbo(this, 313, 870, textureX, textureY); // Import GT_27
		gun_2_Model[0][26] = new ModelRendererTurbo(this, 329, 870, textureX, textureY); // Import GT_28
		gun_2_Model[0][27] = new ModelRendererTurbo(this, 345, 870, textureX, textureY); // Import GT_29
		gun_2_Model[0][28] = new ModelRendererTurbo(this, 353, 870, textureX, textureY); // Import GT_30
		gun_2_Model[0][29] = new ModelRendererTurbo(this, 361, 870, textureX, textureY); // Import GT_31
		gun_2_Model[0][30] = new ModelRendererTurbo(this, 369, 870, textureX, textureY); // Import GT_32
		gun_2_Model[0][31] = new ModelRendererTurbo(this, 289, 870, textureX, textureY); // Import GT_35
		gun_2_Model[0][32] = new ModelRendererTurbo(this, 305, 870, textureX, textureY); // Import GT_36
		gun_2_Model[0][33] = new ModelRendererTurbo(this, 377, 870, textureX, textureY); // Import GT_22
		gun_2_Model[0][34] = new ModelRendererTurbo(this, 417, 870, textureX, textureY); // Import GT_33
		gun_2_Model[0][35] = new ModelRendererTurbo(this, 457, 870, textureX, textureY); // Import GT_34
		gun_2_Model[0][36] = new ModelRendererTurbo(this, 489, 870, textureX, textureY); // Import GT_37

		gun_2_Model[0][0].addBox(-4F, -6.5F, -5F, 4, 1, 2, 0F); // Import GT_01

		gun_2_Model[0][1].addBox(-11F, 2.5F, -5F, 2, 1, 10, 0F); // Import GT_02

		gun_2_Model[0][2].addShapeBox(-11F, 2.5F, -10F, 5, 1, 5, 0F,-5F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F); // Import GT_03

		gun_2_Model[0][3].addBox(-6F, 2.5F, -10F, 12, 1, 2, 0F); // Import GT_04

		gun_2_Model[0][4].addShapeBox(6F, 2.5F, -10F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, -5F, -2F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -5F, -2F, 0F, 0F, 0F, 0F, -3F); // Import GT_05

		gun_2_Model[0][5].addBox(9F, 2.5F, -5F, 2, 1, 10, 0F); // Import GT_06

		gun_2_Model[0][6].addBox(-0.5F, -6.5F, -5F, 1, 1, 10, 0F); // Import GT_07

		gun_2_Model[0][7].addBox(-4F, -6.5F, 3F, 4, 1, 2, 0F); // Import GT_08

		gun_2_Model[0][8].addShapeBox(-0.5F, -2.5F, -9F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import GT_09

		gun_2_Model[0][9].addShapeBox(-10F, -2.5F, -5F, 1, 5, 2, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Import GT_10

		gun_2_Model[0][10].addShapeBox(-4F, -6.5F, -5F, 1, 4, 2, 0F,0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0.5F, 0F, -6F, 0.5F, 0F, 6F, 0F, 0F); // Import GT_11

		gun_2_Model[0][11].addShapeBox(3F, -6.5F, -5F, 1, 4, 1, 0F,-1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, -1F, -0.5F, -6F, 0.5F, 0F, 6F, 0F, 0F, 6F, 0F, -0.5F, -6F, 0.5F, -0.5F); // Import GT_12

		gun_2_Model[0][12].addShapeBox(9F, -2.5F, -5F, 1, 5, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, -1F, 0F, -0.5F); // Import GT_13

		gun_2_Model[0][13].addShapeBox(-0.5F, -6.5F, -5F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0.5F, -4F, 0F, 0.5F, -4F); // Import GT_14

		gun_2_Model[0][14].addShapeBox(-4F, -6.5F, 3F, 1, 4, 2, 0F,0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0.5F, 0F, -6F, 0.5F, 0F, 6F, 0F, 0F); // Import GT_15

		gun_2_Model[0][15].addShapeBox(-10F, -2.5F, 3F, 1, 5, 2, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Import GT_16

		gun_2_Model[0][16].addShapeBox(-0.5F, -6.5F, 4F, 1, 4, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -4F, 0F, 0.5F, -4F, 0F, 0F, 4F, 0F, 0F, 4F); // Import GT_17

		gun_2_Model[0][17].addShapeBox(-0.5F, -2.5F, 8F, 1, 5, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Import GT_18

		gun_2_Model[0][18].addShapeBox(-11F, 2.5F, 5F, 5, 1, 5, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -2F, -5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -2F, -5F, 0F, 0F); // Import GT_19

		gun_2_Model[0][19].addBox(-6F, 2.5F, 8F, 12, 1, 2, 0F); // Import GT_20

		gun_2_Model[0][20].addShapeBox(6F, 2.5F, 5F, 5, 1, 5, 0F,0F, 0F, -3F, -2F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F); // Import GT_21

		gun_2_Model[0][21].addShapeBox(3F, -6.5F, -4F, 1, 4, 1, 0F,-1F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, -1F, 0F, -6F, 0.5F, -0.5F, 6F, 0F, -0.5F, 6F, 0F, 0F, -6F, 0.5F, 0F); // Import GT_23

		gun_2_Model[0][22].addShapeBox(9F, -2.5F, -4F, 1, 5, 1, 0F,0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, -1F, 0F, 0F); // Import GT_24

		gun_2_Model[0][23].addShapeBox(0F, -6.5F, -5F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import GT_25

		gun_2_Model[0][24].addShapeBox(0F, -6.5F, -4F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import GT_26

		gun_2_Model[0][25].addShapeBox(0F, -6.5F, 3F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import GT_27

		gun_2_Model[0][26].addShapeBox(0F, -6.5F, 4F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import GT_28

		gun_2_Model[0][27].addShapeBox(3F, -6.5F, 4F, 1, 4, 1, 0F,-1F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, -1F, 0F, -6F, 0.5F, -0.5F, 6F, 0F, -0.5F, 6F, 0F, 0F, -6F, 0.5F, 0F); // Import GT_29

		gun_2_Model[0][28].addShapeBox(3F, -6.5F, 3F, 1, 4, 1, 0F,-1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, -1F, -0.5F, -6F, 0.5F, 0F, 6F, 0F, 0F, 6F, 0F, -0.5F, -6F, 0.5F, -0.5F); // Import GT_30

		gun_2_Model[0][29].addShapeBox(9F, -2.5F, 3F, 1, 5, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, -1F, 0F, -0.5F); // Import GT_31

		gun_2_Model[0][30].addShapeBox(9F, -2.5F, 4F, 1, 5, 1, 0F,0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, -1F, 0F, 0F); // Import GT_32

		gun_2_Model[0][31].addBox(-0.5F, -0.5F, -9F, 1, 1, 4, 0F); // Import GT_35

		gun_2_Model[0][32].addBox(-0.5F, -0.5F, 5F, 1, 1, 4, 0F); // Import GT_36

		gun_2_Model[0][33].addBox(6F, -0.5F, -4.5F, 16, 1, 1, 0F); // Import GT_22

		gun_2_Model[0][34].addBox(6F, -0.5F, 3.5F, 16, 1, 1, 0F); // Import GT_33

		gun_2_Model[0][35].addBox(-4F, -1F, -5F, 10, 2, 2, 0F); // Import GT_34

		gun_2_Model[0][36].addBox(-4F, -1F, 3F, 10, 2, 2, 0F); // Import GT_37

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[0])
		{
			gunPart.setRotationPoint(39F, -88F, 0F);
		}


		gun_2_Model[1] = new ModelRendererTurbo[0];

		gun_2_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("DorsalGun", gun_2_Model);

		// Passenger 4
		ModelRendererTurbo[][] gun_3_Model = new ModelRendererTurbo[3][];

		gun_3_Model[0] = new ModelRendererTurbo[54];
		gun_3_Model[0][0] = new ModelRendererTurbo(this, 1, 981, textureX, textureY); // Box 0
		gun_3_Model[0][1] = new ModelRendererTurbo(this, 57, 981, textureX, textureY); // Box 13
		gun_3_Model[0][2] = new ModelRendererTurbo(this, 97, 981, textureX, textureY); // Box 24
		gun_3_Model[0][3] = new ModelRendererTurbo(this, 113, 981, textureX, textureY); // Box 76
		gun_3_Model[0][4] = new ModelRendererTurbo(this, 153, 981, textureX, textureY); // Box 80
		gun_3_Model[0][5] = new ModelRendererTurbo(this, 49, 981, textureX, textureY); // Box 82
		gun_3_Model[0][6] = new ModelRendererTurbo(this, 81, 981, textureX, textureY); // Box 84
		gun_3_Model[0][7] = new ModelRendererTurbo(this, 193, 981, textureX, textureY); // Box 86
		gun_3_Model[0][8] = new ModelRendererTurbo(this, 201, 981, textureX, textureY); // Box 87
		gun_3_Model[0][9] = new ModelRendererTurbo(this, 209, 981, textureX, textureY); // Box 88
		gun_3_Model[0][10] = new ModelRendererTurbo(this, 217, 981, textureX, textureY); // Box 89
		gun_3_Model[0][11] = new ModelRendererTurbo(this, 361, 981, textureX, textureY); // Box 99
		gun_3_Model[0][12] = new ModelRendererTurbo(this, 377, 981, textureX, textureY); // Box 100
		gun_3_Model[0][13] = new ModelRendererTurbo(this, 393, 981, textureX, textureY); // Box 101
		gun_3_Model[0][14] = new ModelRendererTurbo(this, 409, 981, textureX, textureY); // Box 102
		gun_3_Model[0][15] = new ModelRendererTurbo(this, 425, 981, textureX, textureY); // Box 103
		gun_3_Model[0][16] = new ModelRendererTurbo(this, 449, 981, textureX, textureY); // Box 104
		gun_3_Model[0][17] = new ModelRendererTurbo(this, 473, 981, textureX, textureY); // Box 105
		gun_3_Model[0][18] = new ModelRendererTurbo(this, 489, 981, textureX, textureY); // Box 106
		gun_3_Model[0][19] = new ModelRendererTurbo(this, 505, 981, textureX, textureY); // Box 107
		gun_3_Model[0][20] = new ModelRendererTurbo(this, 521, 981, textureX, textureY); // Box 108
		gun_3_Model[0][21] = new ModelRendererTurbo(this, 537, 981, textureX, textureY); // Box 109
		gun_3_Model[0][22] = new ModelRendererTurbo(this, 545, 981, textureX, textureY); // Box 110
		gun_3_Model[0][23] = new ModelRendererTurbo(this, 553, 981, textureX, textureY); // Box 111
		gun_3_Model[0][24] = new ModelRendererTurbo(this, 561, 981, textureX, textureY); // Box 112
		gun_3_Model[0][25] = new ModelRendererTurbo(this, 601, 981, textureX, textureY); // Box 116
		gun_3_Model[0][26] = new ModelRendererTurbo(this, 609, 981, textureX, textureY); // Box 117
		gun_3_Model[0][27] = new ModelRendererTurbo(this, 97, 981, textureX, textureY); // Box 118
		gun_3_Model[0][28] = new ModelRendererTurbo(this, 617, 981, textureX, textureY); // Box 119
		gun_3_Model[0][29] = new ModelRendererTurbo(this, 633, 981, textureX, textureY); // Box 120
		gun_3_Model[0][30] = new ModelRendererTurbo(this, 649, 981, textureX, textureY); // Box 121
		gun_3_Model[0][31] = new ModelRendererTurbo(this, 657, 981, textureX, textureY); // Box 122
		gun_3_Model[0][32] = new ModelRendererTurbo(this, 249, 981, textureX, textureY); // Box 123
		gun_3_Model[0][33] = new ModelRendererTurbo(this, 665, 981, textureX, textureY); // Box 124
		gun_3_Model[0][34] = new ModelRendererTurbo(this, 681, 981, textureX, textureY); // Box 125
		gun_3_Model[0][35] = new ModelRendererTurbo(this, 281, 981, textureX, textureY); // Box 126
		gun_3_Model[0][36] = new ModelRendererTurbo(this, 697, 981, textureX, textureY); // Box 127
		gun_3_Model[0][37] = new ModelRendererTurbo(this, 713, 981, textureX, textureY); // Box 128
		gun_3_Model[0][38] = new ModelRendererTurbo(this, 369, 981, textureX, textureY); // Box 129
		gun_3_Model[0][39] = new ModelRendererTurbo(this, 385, 981, textureX, textureY); // Box 130
		gun_3_Model[0][40] = new ModelRendererTurbo(this, 401, 981, textureX, textureY); // Box 131
		gun_3_Model[0][41] = new ModelRendererTurbo(this, 721, 981, textureX, textureY); // Box 132
		gun_3_Model[0][42] = new ModelRendererTurbo(this, 737, 981, textureX, textureY); // Box 133
		gun_3_Model[0][43] = new ModelRendererTurbo(this, 745, 981, textureX, textureY); // Box 134
		gun_3_Model[0][44] = new ModelRendererTurbo(this, 761, 981, textureX, textureY); // Box 135
		gun_3_Model[0][45] = new ModelRendererTurbo(this, 777, 981, textureX, textureY); // Box 136
		gun_3_Model[0][46] = new ModelRendererTurbo(this, 793, 981, textureX, textureY); // Box 137
		gun_3_Model[0][47] = new ModelRendererTurbo(this, 809, 981, textureX, textureY); // Box 138
		gun_3_Model[0][48] = new ModelRendererTurbo(this, 825, 981, textureX, textureY); // Box 139
		gun_3_Model[0][49] = new ModelRendererTurbo(this, 841, 981, textureX, textureY); // Box 140
		gun_3_Model[0][50] = new ModelRendererTurbo(this, 857, 981, textureX, textureY); // Box 141
		gun_3_Model[0][51] = new ModelRendererTurbo(this, 865, 981, textureX, textureY); // Box 142
		gun_3_Model[0][52] = new ModelRendererTurbo(this, 897, 981, textureX, textureY); // Box 143
		gun_3_Model[0][53] = new ModelRendererTurbo(this, 889, 981, textureX, textureY); // Box 144

		gun_3_Model[0][0].addShapeBox(-8F, 0F, -6F, 14, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0

		gun_3_Model[0][1].addShapeBox(6F, 0F, -6F, 4, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13

		gun_3_Model[0][2].addShapeBox(10F, 0F, -6F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 24

		gun_3_Model[0][3].addShapeBox(-8F, 0F, -10F, 14, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76

		gun_3_Model[0][4].addShapeBox(-8F, 0F, 6F, 14, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80

		gun_3_Model[0][5].addShapeBox(6F, 0F, -10F, 4, 1, 4, 0F,0F, 0F, 0F, -1.75F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82

		gun_3_Model[0][6].addShapeBox(6F, 0F, 6F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, -1.75F, 0F, 0F, 0F); // Box 84

		gun_3_Model[0][7].addShapeBox(5F, -11F, -10F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86

		gun_3_Model[0][8].addShapeBox(5F, -11F, 9F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87

		gun_3_Model[0][9].addShapeBox(9F, -11F, 4F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88

		gun_3_Model[0][10].addShapeBox(9F, -11F, -5F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89

		gun_3_Model[0][11].addShapeBox(1F, -6F, 5F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F); // Box 99

		gun_3_Model[0][12].addShapeBox(4F, -2F, 5F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, -1F, 0F, 0F); // Box 100

		gun_3_Model[0][13].addShapeBox(1F, -6F, -9F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F); // Box 101

		gun_3_Model[0][14].addShapeBox(4F, -2F, -9F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, -1F, 0F, 0F); // Box 102

		gun_3_Model[0][15].addShapeBox(-1F, -9F, 4F, 10, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103

		gun_3_Model[0][16].addShapeBox(-1F, -9F, -5F, 10, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104

		gun_3_Model[0][17].addShapeBox(5F, -3F, -9F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -0.5F, 0F, 0F, -0.5F); // Box 105

		gun_3_Model[0][18].addShapeBox(5F, -3F, -6F, 6, 1, 1, 0F,0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 2F, -0.5F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 106

		gun_3_Model[0][19].addShapeBox(5F, -3F, 8F, 6, 1, 1, 0F,0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 2F, -0.5F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 107

		gun_3_Model[0][20].addShapeBox(5F, -3F, 5F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -0.5F, 0F, 0F, -0.5F); // Box 108

		gun_3_Model[0][21].addShapeBox(-4F, -15F, 9F, 1, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109

		gun_3_Model[0][22].addShapeBox(-8F, -15F, 9F, 1, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110

		gun_3_Model[0][23].addShapeBox(-4F, -15F, -10F, 1, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111

		gun_3_Model[0][24].addShapeBox(-8F, -15F, -10F, 1, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112

		gun_3_Model[0][25].addShapeBox(8F, -14F, 4F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 116

		gun_3_Model[0][26].addShapeBox(6F, -17F, 4F, 1, 3, 1, 0F,-1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 117

		gun_3_Model[0][27].addShapeBox(3F, -18F, 4F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 118

		gun_3_Model[0][28].addShapeBox(-3F, -19F, 4F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 119

		gun_3_Model[0][29].addShapeBox(-8F, -19F, 4F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120

		gun_3_Model[0][30].addShapeBox(8F, -14F, -5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 121

		gun_3_Model[0][31].addShapeBox(6F, -17F, -5F, 1, 3, 1, 0F,-1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 122

		gun_3_Model[0][32].addShapeBox(3F, -18F, -5F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 123

		gun_3_Model[0][33].addShapeBox(-3F, -19F, -5F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 124

		gun_3_Model[0][34].addShapeBox(-8F, -19F, -5F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125

		gun_3_Model[0][35].addShapeBox(2F, -15F, -10F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 126

		gun_3_Model[0][36].addShapeBox(-3F, -15F, -10F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127

		gun_3_Model[0][37].addShapeBox(3F, -14F, -10F, 1, 3, 1, 0F,-1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 128

		gun_3_Model[0][38].addShapeBox(-7F, -6F, -10F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129

		gun_3_Model[0][39].addShapeBox(-7F, -6F, 9F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130

		gun_3_Model[0][40].addShapeBox(2F, -15F, 9F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 131

		gun_3_Model[0][41].addShapeBox(-3F, -15F, 9F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132

		gun_3_Model[0][42].addShapeBox(3F, -14F, 9F, 1, 3, 1, 0F,-1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 133

		gun_3_Model[0][43].addShapeBox(-8F, -17F, 9F, 5, 2, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134

		gun_3_Model[0][44].addShapeBox(-7F, -15F, 9F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135

		gun_3_Model[0][45].addShapeBox(-8F, -19F, 8F, 5, 2, 1, 0F,0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136

		gun_3_Model[0][46].addShapeBox(-8F, -19F, 5F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137

		gun_3_Model[0][47].addShapeBox(-8F, -19F, -7F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138

		gun_3_Model[0][48].addShapeBox(-8F, -17F, -10F, 5, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139

		gun_3_Model[0][49].addShapeBox(-7F, -15F, -10F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140

		gun_3_Model[0][50].addShapeBox(-8F, -19F, -9F, 5, 2, 1, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141

		gun_3_Model[0][51].addShapeBox(-8F, -19F, -4F, 5, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142

		gun_3_Model[0][52].addShapeBox(9F, -11F, -4F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143

		gun_3_Model[0][53].addShapeBox(8F, -11F, -1F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_3_Model[0])
		{
			gunPart.setRotationPoint(217F, -72F, 0F);
		}


		gun_3_Model[1] = new ModelRendererTurbo[2];
		gun_3_Model[1][0] = new ModelRendererTurbo(this, 297, 981, textureX, textureY); // Box 96
		gun_3_Model[1][1] = new ModelRendererTurbo(this, 569, 981, textureX, textureY); // Box 113

		gun_3_Model[1][0].addShapeBox(6F, -9F, 6F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96

		gun_3_Model[1][1].addShapeBox(6F, -9F, -7F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_3_Model[1])
		{
			gunPart.setRotationPoint(217F, -72F, 0F);
		}


		gun_3_Model[2] = new ModelRendererTurbo[8];
		gun_3_Model[2][0] = new ModelRendererTurbo(this, 225, 981, textureX, textureY); // Box 90
		gun_3_Model[2][1] = new ModelRendererTurbo(this, 1, 981, textureX, textureY); // Box 91
		gun_3_Model[2][2] = new ModelRendererTurbo(this, 241, 981, textureX, textureY); // Box 92
		gun_3_Model[2][3] = new ModelRendererTurbo(this, 257, 981, textureX, textureY); // Box 93
		gun_3_Model[2][4] = new ModelRendererTurbo(this, 273, 981, textureX, textureY); // Box 94
		gun_3_Model[2][5] = new ModelRendererTurbo(this, 289, 981, textureX, textureY); // Box 95
		gun_3_Model[2][6] = new ModelRendererTurbo(this, 329, 981, textureX, textureY); // Box 97
		gun_3_Model[2][7] = new ModelRendererTurbo(this, 345, 981, textureX, textureY); // Box 98

		gun_3_Model[2][0].addShapeBox(2F, -11F, -8F, 3, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90

		gun_3_Model[2][1].addShapeBox(5F, -11F, -8F, 1, 5, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 91

		gun_3_Model[2][2].addShapeBox(1F, -11F, -8F, 1, 5, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 92

		gun_3_Model[2][3].addShapeBox(2F, -11F, 5F, 3, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93

		gun_3_Model[2][4].addShapeBox(5F, -11F, 5F, 1, 5, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 94

		gun_3_Model[2][5].addShapeBox(1F, -11F, 5F, 1, 5, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 95

		gun_3_Model[2][6].addShapeBox(2F, -10F, 8F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97

		gun_3_Model[2][7].addShapeBox(2F, -10F, -9F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_3_Model[2])
		{
			gunPart.setRotationPoint(217F, -72F, 0F);
		}


		registerGunModel("RearGun", gun_3_Model);
	}
}