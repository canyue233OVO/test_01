//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Sunderland
// Model Creator: 
// Created on: 23.05.2023 - 20:21:42
// Last changed on: 23.05.2023 - 20:21:42

package com.flansmod.client.model.Taskball; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelSunderland extends ModelPlane //Same as Filename
{
	int textureX = 2048;
	int textureY = 1024;

	public ModelSunderland() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[139];
		noseModel = new ModelRendererTurbo[16];
		tailModel = new ModelRendererTurbo[36];
		leftWingModel = new ModelRendererTurbo[97];
		rightWingModel = new ModelRendererTurbo[97];
		yawFlapModel = new ModelRendererTurbo[2];
		pitchFlapLeftModel = new ModelRendererTurbo[1];
		pitchFlapRightModel = new ModelRendererTurbo[1];
		pitchFlapLeftWingModel = new ModelRendererTurbo[1];
		pitchFlapRightWingModel = new ModelRendererTurbo[1];

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

		initGuns();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 601, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 737, 1, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 881, 1, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 1081, 1, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 1281, 1, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 1481, 1, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 1681, 1, textureX, textureY); // Box 10
		bodyModel[11] = new ModelRendererTurbo(this, 1849, 25, textureX, textureY); // Box 11
		bodyModel[12] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 12
		bodyModel[13] = new ModelRendererTurbo(this, 569, 41, textureX, textureY); // Box 13
		bodyModel[14] = new ModelRendererTurbo(this, 1049, 41, textureX, textureY); // Box 14
		bodyModel[15] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Box 15
		bodyModel[16] = new ModelRendererTurbo(this, 1649, 57, textureX, textureY); // Box 16
		bodyModel[17] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 17
		bodyModel[18] = new ModelRendererTurbo(this, 1193, 65, textureX, textureY); // Box 18
		bodyModel[19] = new ModelRendererTurbo(this, 1345, 65, textureX, textureY); // Box 19
		bodyModel[20] = new ModelRendererTurbo(this, 1497, 65, textureX, textureY); // Box 20
		bodyModel[21] = new ModelRendererTurbo(this, 745, 73, textureX, textureY); // Box 21
		bodyModel[22] = new ModelRendererTurbo(this, 305, 73, textureX, textureY); // Box 22
		bodyModel[23] = new ModelRendererTurbo(this, 897, 73, textureX, textureY); // Box 23
		bodyModel[24] = new ModelRendererTurbo(this, 841, 1, textureX, textureY); // Box 24
		bodyModel[25] = new ModelRendererTurbo(this, 1833, 81, textureX, textureY); // Box 25
		bodyModel[26] = new ModelRendererTurbo(this, 1929, 81, textureX, textureY); // Box 26
		bodyModel[27] = new ModelRendererTurbo(this, 1649, 113, textureX, textureY); // Box 36
		bodyModel[28] = new ModelRendererTurbo(this, 1153, 41, textureX, textureY); // Box 45
		bodyModel[29] = new ModelRendererTurbo(this, 1049, 1, textureX, textureY); // Box 46
		bodyModel[30] = new ModelRendererTurbo(this, 1249, 1, textureX, textureY); // Box 47
		bodyModel[31] = new ModelRendererTurbo(this, 273, 81, textureX, textureY); // Box 150
		bodyModel[32] = new ModelRendererTurbo(this, 1257, 121, textureX, textureY); // Box 151
		bodyModel[33] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 152
		bodyModel[34] = new ModelRendererTurbo(this, 593, 17, textureX, textureY); // Box 153
		bodyModel[35] = new ModelRendererTurbo(this, 2025, 49, textureX, textureY); // Box 154
		bodyModel[36] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 155
		bodyModel[37] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 156
		bodyModel[38] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 157
		bodyModel[39] = new ModelRendererTurbo(this, 609, 1, textureX, textureY); // Box 158
		bodyModel[40] = new ModelRendererTurbo(this, 617, 1, textureX, textureY); // Box 159
		bodyModel[41] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 160
		bodyModel[42] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 161
		bodyModel[43] = new ModelRendererTurbo(this, 1193, 65, textureX, textureY); // Box 162
		bodyModel[44] = new ModelRendererTurbo(this, 409, 225, textureX, textureY); // Box 165
		bodyModel[45] = new ModelRendererTurbo(this, 929, 313, textureX, textureY); // Box 166
		bodyModel[46] = new ModelRendererTurbo(this, 1, 329, textureX, textureY); // Box 167
		bodyModel[47] = new ModelRendererTurbo(this, 1601, 225, textureX, textureY); // Box 168
		bodyModel[48] = new ModelRendererTurbo(this, 809, 233, textureX, textureY); // Box 169
		bodyModel[49] = new ModelRendererTurbo(this, 1081, 345, textureX, textureY); // Box 170
		bodyModel[50] = new ModelRendererTurbo(this, 1225, 345, textureX, textureY); // Box 171
		bodyModel[51] = new ModelRendererTurbo(this, 1073, 233, textureX, textureY); // Box 172
		bodyModel[52] = new ModelRendererTurbo(this, 561, 353, textureX, textureY); // Box 173
		bodyModel[53] = new ModelRendererTurbo(this, 1425, 353, textureX, textureY); // Box 174
		bodyModel[54] = new ModelRendererTurbo(this, 1625, 353, textureX, textureY); // Box 175
		bodyModel[55] = new ModelRendererTurbo(this, 1825, 353, textureX, textureY); // Box 176
		bodyModel[56] = new ModelRendererTurbo(this, 593, 241, textureX, textureY); // Box 177
		bodyModel[57] = new ModelRendererTurbo(this, 161, 361, textureX, textureY); // Box 178
		bodyModel[58] = new ModelRendererTurbo(this, 361, 361, textureX, textureY); // Box 179
		bodyModel[59] = new ModelRendererTurbo(this, 1, 401, textureX, textureY); // Box 180
		bodyModel[60] = new ModelRendererTurbo(this, 1593, 409, textureX, textureY); // Box 181
		bodyModel[61] = new ModelRendererTurbo(this, 1777, 409, textureX, textureY); // Box 182
		bodyModel[62] = new ModelRendererTurbo(this, 161, 417, textureX, textureY); // Box 183
		bodyModel[63] = new ModelRendererTurbo(this, 409, 249, textureX, textureY); // Box 184
		bodyModel[64] = new ModelRendererTurbo(this, 313, 417, textureX, textureY); // Box 185
		bodyModel[65] = new ModelRendererTurbo(this, 465, 417, textureX, textureY); // Box 186
		bodyModel[66] = new ModelRendererTurbo(this, 185, 217, textureX, textureY); // Box 187
		bodyModel[67] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Box 188
		bodyModel[68] = new ModelRendererTurbo(this, 889, 193, textureX, textureY); // Box 189
		bodyModel[69] = new ModelRendererTurbo(this, 185, 257, textureX, textureY); // Box 190
		bodyModel[70] = new ModelRendererTurbo(this, 1361, 241, textureX, textureY); // Box 191
		bodyModel[71] = new ModelRendererTurbo(this, 465, 361, textureX, textureY); // Box 201
		bodyModel[72] = new ModelRendererTurbo(this, 1361, 305, textureX, textureY); // Box 210
		bodyModel[73] = new ModelRendererTurbo(this, 681, 201, textureX, textureY); // Box 211
		bodyModel[74] = new ModelRendererTurbo(this, 929, 217, textureX, textureY); // Box 212
		bodyModel[75] = new ModelRendererTurbo(this, 257, 217, textureX, textureY); // Box 315
		bodyModel[76] = new ModelRendererTurbo(this, 465, 321, textureX, textureY); // Box 316
		bodyModel[77] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 317
		bodyModel[78] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 318
		bodyModel[79] = new ModelRendererTurbo(this, 433, 81, textureX, textureY); // Box 319
		bodyModel[80] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 320
		bodyModel[81] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 321
		bodyModel[82] = new ModelRendererTurbo(this, 721, 1, textureX, textureY); // Box 322
		bodyModel[83] = new ModelRendererTurbo(this, 729, 1, textureX, textureY); // Box 323
		bodyModel[84] = new ModelRendererTurbo(this, 761, 1, textureX, textureY); // Box 324
		bodyModel[85] = new ModelRendererTurbo(this, 1233, 41, textureX, textureY); // Box 325
		bodyModel[86] = new ModelRendererTurbo(this, 449, 49, textureX, textureY); // Box 326
		bodyModel[87] = new ModelRendererTurbo(this, 1633, 129, textureX, textureY); // Box 327
		bodyModel[88] = new ModelRendererTurbo(this, 1281, 513, textureX, textureY); // Box 347
		bodyModel[89] = new ModelRendererTurbo(this, 801, 161, textureX, textureY); // Box 239
		bodyModel[90] = new ModelRendererTurbo(this, 793, 121, textureX, textureY); // Box 240
		bodyModel[91] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 241
		bodyModel[92] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Box 242
		bodyModel[93] = new ModelRendererTurbo(this, 1817, 121, textureX, textureY); // Box 243
		bodyModel[94] = new ModelRendererTurbo(this, 1601, 145, textureX, textureY); // Box 244
		bodyModel[95] = new ModelRendererTurbo(this, 289, 121, textureX, textureY); // Box 245
		bodyModel[96] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 246
		bodyModel[97] = new ModelRendererTurbo(this, 1305, 1, textureX, textureY); // Box 247
		bodyModel[98] = new ModelRendererTurbo(this, 1705, 1, textureX, textureY); // Box 248
		bodyModel[99] = new ModelRendererTurbo(this, 2041, 1, textureX, textureY); // Box 250
		bodyModel[100] = new ModelRendererTurbo(this, 1369, 65, textureX, textureY); // Box 251
		bodyModel[101] = new ModelRendererTurbo(this, 529, 49, textureX, textureY); // Box 252
		bodyModel[102] = new ModelRendererTurbo(this, 297, 73, textureX, textureY); // Box 253
		bodyModel[103] = new ModelRendererTurbo(this, 841, 1, textureX, textureY); // Box 263
		bodyModel[104] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 264
		bodyModel[105] = new ModelRendererTurbo(this, 905, 1, textureX, textureY); // Box 962
		bodyModel[106] = new ModelRendererTurbo(this, 1105, 1, textureX, textureY); // Box 964
		bodyModel[107] = new ModelRendererTurbo(this, 1249, 1, textureX, textureY); // Box 966
		bodyModel[108] = new ModelRendererTurbo(this, 1049, 1, textureX, textureY); // Box 782
		bodyModel[109] = new ModelRendererTurbo(this, 1649, 1, textureX, textureY); // Box 783
		bodyModel[110] = new ModelRendererTurbo(this, 1849, 1, textureX, textureY); // Box 786
		bodyModel[111] = new ModelRendererTurbo(this, 1945, 1, textureX, textureY); // Box 789
		bodyModel[112] = new ModelRendererTurbo(this, 1657, 1, textureX, textureY); // Box 791
		bodyModel[113] = new ModelRendererTurbo(this, 905, 9, textureX, textureY); // Box 792
		bodyModel[114] = new ModelRendererTurbo(this, 801, 177, textureX, textureY); // Box 373
		bodyModel[115] = new ModelRendererTurbo(this, 1993, 121, textureX, textureY); // Box 374
		bodyModel[116] = new ModelRendererTurbo(this, 1801, 81, textureX, textureY); // Box 375
		bodyModel[117] = new ModelRendererTurbo(this, 1625, 89, textureX, textureY); // Box 376
		bodyModel[118] = new ModelRendererTurbo(this, 97, 153, textureX, textureY); // Box 377
		bodyModel[119] = new ModelRendererTurbo(this, 409, 153, textureX, textureY); // Box 378
		bodyModel[120] = new ModelRendererTurbo(this, 1257, 121, textureX, textureY); // Box 379
		bodyModel[121] = new ModelRendererTurbo(this, 593, 161, textureX, textureY); // Box 380
		bodyModel[122] = new ModelRendererTurbo(this, 2041, 41, textureX, textureY); // Box 381
		bodyModel[123] = new ModelRendererTurbo(this, 1521, 65, textureX, textureY); // Box 382
		bodyModel[124] = new ModelRendererTurbo(this, 321, 73, textureX, textureY); // Box 383
		bodyModel[125] = new ModelRendererTurbo(this, 1945, 81, textureX, textureY); // Box 384
		bodyModel[126] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 385
		bodyModel[127] = new ModelRendererTurbo(this, 81, 105, textureX, textureY); // Box 386
		bodyModel[128] = new ModelRendererTurbo(this, 1705, 17, textureX, textureY); // Box 387
		bodyModel[129] = new ModelRendererTurbo(this, 1849, 9, textureX, textureY); // Box 388
		bodyModel[130] = new ModelRendererTurbo(this, 1649, 9, textureX, textureY); // Box 389
		bodyModel[131] = new ModelRendererTurbo(this, 1945, 9, textureX, textureY); // Box 390
		bodyModel[132] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Box 391
		bodyModel[133] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 392
		bodyModel[134] = new ModelRendererTurbo(this, 761, 17, textureX, textureY); // Box 393
		bodyModel[135] = new ModelRendererTurbo(this, 1305, 17, textureX, textureY); // Box 394
		bodyModel[136] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 395
		bodyModel[137] = new ModelRendererTurbo(this, 1857, 9, textureX, textureY); // Box 396
		bodyModel[138] = new ModelRendererTurbo(this, 577, 17, textureX, textureY); // Box 397

		bodyModel[0].addShapeBox(0F, 0F, 0F, 57, 13, 8, 0F,0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-201F, -57F, -30F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 57, 29, 32, 0F,0F, 0F, -6F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[1].setRotationPoint(-201F, -44F, -32F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 45, 34, 33, 0F,0F, -5F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[2].setRotationPoint(-144F, -49F, -33F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 45, 12, 30, 0F,0F, -4F, -7F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 5F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 5F, 0F); // Box 3
		bodyModel[3].setRotationPoint(-144F, -61F, -30F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 45, 13, 22, 0F,0F, 0F, -7F, 0F, 3F, -5F, 0F, 11F, 1F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, -4F, 2F, 0F, -4F, 1F, 0F, 0F, 0F); // Box 4
		bodyModel[4].setRotationPoint(-144F, -70F, -23F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 35, 38, 33, 0F,0F, -4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[5].setRotationPoint(-99F, -53F, -33F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 66, 38, 33, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[6].setRotationPoint(-64F, -53F, -33F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 66, 6, 33, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[7].setRotationPoint(-64F, -15F, -33F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 65, 22, 34, 0F,0F, 0F, 0F, 0F, -6F, -5F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -5F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[8].setRotationPoint(2F, -31F, -34F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 65, 22, 34, 0F,0F, 0F, 0F, 0F, -6F, -8F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, -5F, 0F, 6F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[9].setRotationPoint(2F, -53F, -34F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 65, 16, 34, 0F,0F, 0F, -17F, 0F, -5F, -19F, 0F, 3F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 6F, -8F, 0F, 6F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[10].setRotationPoint(2F, -69F, -34F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 66, 19, 33, 0F,0F, 0F, -15F, 0F, -3F, -16F, 0F, 5F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[11].setRotationPoint(-64F, -72F, -33F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 35, 19, 33, 0F,0F, 1F, -15F, 0F, 0F, -15F, 0F, 8F, 0F, 0F, 9F, 0F, 0F, 4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); // Box 12
		bodyModel[12].setRotationPoint(-99F, -72F, -33F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 66, 15, 33, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 11F, 0F, 0F, 17F, 0F); // Box 13
		bodyModel[13].setRotationPoint(-64F, -9F, -33F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 35, 21, 33, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 19F, 0F, 0F, 19F, 0F); // Box 14
		bodyModel[14].setRotationPoint(-99F, -15F, -33F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 45, 21, 33, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 19F, 0F, 0F, 18F, 0F); // Box 15
		bodyModel[15].setRotationPoint(-144F, -15F, -33F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 57, 21, 32, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, 0F, 1F, 0F, 18F, 0F, 0F, 12F, 0F); // Box 16
		bodyModel[16].setRotationPoint(-201F, -15F, -32F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 65, 15, 34, 0F,0F, 0F, 0F, 0F, 4F, -5F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -12F, 0F, 5F, 0F, 0F, 11F, 0F); // Box 17
		bodyModel[17].setRotationPoint(2F, -9F, -34F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 46, 19, 29, 0F,0F, 0F, 0F, 0F, 2F, -6F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -20F, 0F, 2F, 0F, 0F, 5F, 0F); // Box 18
		bodyModel[18].setRotationPoint(67F, -13F, -29F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 46, 12, 29, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -6F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[19].setRotationPoint(67F, -25F, -29F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 46, 22, 29, 0F,0F, 0F, -3F, 0F, -1F, -7F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[20].setRotationPoint(67F, -47F, -29F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 46, 17, 26, 0F,0F, 0F, -11F, 0F, -3F, -13F, 0F, 3F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 1F, -4F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[21].setRotationPoint(67F, -64F, -26F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 21, 14, 23, 0F,0F, 0F, 0F, 0F, 5F, -2F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, -9.35F, 0F, -4F, -19F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[22].setRotationPoint(113F, -15F, -23F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 21, 16, 23, 0F,0F, -11F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, 5F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 5F, 0F); // Box 23
		bodyModel[23].setRotationPoint(113F, -36F, -23F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 21, 7, 14, 0F,0F, 0F, -0.4F, 0F, 4F, -10F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -9F, 0F, -13F, -9F, 0F, 0F, 0F, 2F, 0F); // Box 24
		bodyModel[24].setRotationPoint(113F, -1F, -14F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 21, 21, 23, 0F,0F, 0F, -1F, 0F, 5F, -3F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[25].setRotationPoint(113F, -46F, -23F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 21, 15, 22, 0F,0F, 0F, -9F, 0F, 1F, -10F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, -5F, -2F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[26].setRotationPoint(113F, -61F, -22F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 45, 24, 1, 0F,0F, -3F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[27].setRotationPoint(-144F, -81F, -1F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 36, 13, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -15F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[28].setRotationPoint(-201F, -57F, -23F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 21, 14, 7, 0F,0F, -1F, 0F, 0F, 1F, 0F, -6F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[29].setRotationPoint(-201F, -58F, -16F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 15, 14, 9, 0F,0F, -1F, 0F, 0F, 1F, 0F, -3F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[30].setRotationPoint(-201F, -58F, -9F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 20, 13, 1, 0F,0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[31].setRotationPoint(-164F, -70F, -23F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 20, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -5F, -1F); // Box 151
		bodyModel[32].setRotationPoint(-164F, -70F, -16F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 20, 1, 2, 0F,0F, 0F, 0F, 0F, 3F, -1F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 152
		bodyModel[33].setRotationPoint(-164F, -75F, -2F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F); // Box 153
		bodyModel[34].setRotationPoint(-177F, -70F, -16F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F); // Box 154
		bodyModel[35].setRotationPoint(-177F, -70F, -12F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[36].setRotationPoint(-186F, -70F, -1F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,5F, 0F, 0F, -5F, 0F, 0F, -8F, 0F, 0F, 8F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, -8F, 0F, 0F, 8F, 0F, 0F); // Box 156
		bodyModel[37].setRotationPoint(-178F, -70F, -5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 4F, -4F, 0F, 4F, -4F, 0F, -4F, 4F, 0F, -4F); // Box 157
		bodyModel[38].setRotationPoint(-177F, -70F, -12F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 4F, -4F, 0F, 4F, -4F, 0F, -4F, 4F, 0F, -4F); // Box 158
		bodyModel[39].setRotationPoint(-183F, -70F, -5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F); // Box 159
		bodyModel[40].setRotationPoint(-186F, -70F, -1F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 160
		bodyModel[41].setRotationPoint(-186F, -70F, -1F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[42].setRotationPoint(-177F, -73F, -1F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 162
		bodyModel[43].setRotationPoint(-177F, -70F, -12F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 57, 13, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 165
		bodyModel[44].setRotationPoint(-201F, -57F, 22F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 57, 29, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 166
		bodyModel[45].setRotationPoint(-201F, -44F, 0F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 45, 34, 33, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 167
		bodyModel[46].setRotationPoint(-144F, -49F, 0F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 45, 12, 30, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -4F, -7F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 5F, 0F); // Box 168
		bodyModel[47].setRotationPoint(-144F, -61F, 0F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 45, 13, 22, 0F,0F, 8F, 0F, 0F, 11F, 1F, 0F, 3F, -5F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, -4F, 1F, 0F, -4F, 2F, 0F, 0F, 0F); // Box 169
		bodyModel[48].setRotationPoint(-144F, -70F, 1F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 35, 38, 33, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
		bodyModel[49].setRotationPoint(-99F, -53F, 0F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 66, 38, 33, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 171
		bodyModel[50].setRotationPoint(-64F, -53F, 0F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 66, 6, 33, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 172
		bodyModel[51].setRotationPoint(-64F, -15F, 0F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 65, 22, 34, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, -5F, 0F, 0F, 0F); // Box 173
		bodyModel[52].setRotationPoint(2F, -31F, 0F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 65, 22, 34, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, -5F, 0F, 0F, 0F); // Box 174
		bodyModel[53].setRotationPoint(2F, -53F, 0F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 65, 16, 34, 0F,0F, 8F, 0F, 0F, 3F, 0F, 0F, -5F, -19F, 0F, 0F, -17F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, -8F, 0F, 0F, 0F); // Box 175
		bodyModel[54].setRotationPoint(2F, -69F, 0F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 66, 19, 33, 0F,0F, 8F, 0F, 0F, 5F, 0F, 0F, -3F, -16F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 176
		bodyModel[55].setRotationPoint(-64F, -72F, 0F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 35, 19, 33, 0F,0F, 9F, 0F, 0F, 8F, 0F, 0F, 0F, -15F, 0F, 1F, -15F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -1F); // Box 177
		bodyModel[56].setRotationPoint(-99F, -72F, 0F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 66, 15, 33, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 17F, 0F, 0F, 11F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 178
		bodyModel[57].setRotationPoint(-64F, -9F, 0F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 35, 21, 33, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 19F, 0F, 0F, 19F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		bodyModel[58].setRotationPoint(-99F, -15F, 0F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 45, 21, 33, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 18F, 0F, 0F, 19F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[59].setRotationPoint(-144F, -15F, 0F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 57, 21, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 12F, 0F, 0F, 18F, 0F, 0F, 0F, 1F, 0F, -1F, -3F); // Box 181
		bodyModel[60].setRotationPoint(-201F, -15F, 0F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 65, 15, 34, 0F,0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, -5F, 0F, 0F, 0F, 0F, 11F, 0F, 0F, 5F, 0F, 0F, 0F, -12F, 0F, 0F, -3F); // Box 182
		bodyModel[61].setRotationPoint(2F, -9F, 0F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 46, 19, 29, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -6F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 2F, 0F, 0F, 0F, -20F, 0F, 0F, -7F); // Box 183
		bodyModel[62].setRotationPoint(67F, -13F, 0F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 46, 12, 29, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -6F, 0F, 0F, 0F); // Box 184
		bodyModel[63].setRotationPoint(67F, -25F, 0F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 46, 22, 29, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -7F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 185
		bodyModel[64].setRotationPoint(67F, -47F, 0F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 46, 17, 26, 0F,0F, 8F, 0F, 0F, 3F, 0F, 0F, -3F, -13F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -4F, 0F, 0F, 0F); // Box 186
		bodyModel[65].setRotationPoint(67F, -64F, 0F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 21, 14, 23, 0F,0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, -19F, 0F, 0F, -9.35F); // Box 187
		bodyModel[66].setRotationPoint(113F, -15F, 0F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 21, 16, 23, 0F,0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 3F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 5F, 0F); // Box 188
		bodyModel[67].setRotationPoint(113F, -36F, 0F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 21, 7, 14, 0F,0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, -10F, 0F, 0F, -0.4F, 0F, 2F, 0F, -9F, 0F, 0F, -9F, 0F, -13F, 0F, 0F, -5F); // Box 189
		bodyModel[68].setRotationPoint(113F, -1F, 0F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 21, 21, 23, 0F,0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 3F); // Box 190
		bodyModel[69].setRotationPoint(113F, -46F, 0F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 21, 15, 22, 0F,0F, 6F, 0F, 0F, 6F, 0F, 0F, 1F, -10F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, -2F, 0F, 0F, 0F); // Box 191
		bodyModel[70].setRotationPoint(113F, -61F, 0F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 45, 24, 1, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 201
		bodyModel[71].setRotationPoint(-144F, -81F, 0F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 36, 13, 7, 0F,0F, 0F, 0F, -15F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		bodyModel[72].setRotationPoint(-201F, -57F, 16F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 21, 14, 7, 0F,0F, -1F, 0F, -6F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
		bodyModel[73].setRotationPoint(-201F, -58F, 9F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 15, 14, 9, 0F,0F, -1F, 0F, -3F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 212
		bodyModel[74].setRotationPoint(-201F, -58F, 0F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 20, 13, 1, 0F,0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[75].setRotationPoint(-164F, -70F, 22F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 20, 1, 15, 0F,0F, 5F, -1F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -1F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 316
		bodyModel[76].setRotationPoint(-164F, -70F, 1F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 20, 1, 2, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -1F, 0F, 0F, 0F); // Box 317
		bodyModel[77].setRotationPoint(-164F, -75F, 0F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 318
		bodyModel[78].setRotationPoint(-177F, -70F, 15F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 319
		bodyModel[79].setRotationPoint(-177F, -70F, 5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 320
		bodyModel[80].setRotationPoint(-186F, -70F, 0F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,8F, 0F, 0F, -8F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 8F, 0F, 0F, -8F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F); // Box 321
		bodyModel[81].setRotationPoint(-178F, -70F, 1F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, 4F, 4F, 0F, 4F); // Box 322
		bodyModel[82].setRotationPoint(-177F, -70F, 11F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, 4F, 4F, 0F, 4F); // Box 323
		bodyModel[83].setRotationPoint(-183F, -70F, 4F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F); // Box 324
		bodyModel[84].setRotationPoint(-186F, -70F, 0F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 325
		bodyModel[85].setRotationPoint(-186F, -70F, 0F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 326
		bodyModel[86].setRotationPoint(-177F, -73F, 0F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 327
		bodyModel[87].setRotationPoint(-177F, -70F, 1F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 21, 9, 32, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 347
		bodyModel[88].setRotationPoint(-201F, -58F, -16F);

		bodyModel[89].addShapeBox(0F, 1F, 0F, 10, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
		bodyModel[89].setRotationPoint(-171F, -51F, -12F);
		bodyModel[89].rotateAngleZ = -0.10471976F;

		bodyModel[90].addShapeBox(9F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		bodyModel[90].setRotationPoint(-171F, -51F, -12F);
		bodyModel[90].rotateAngleZ = -0.10471976F;

		bodyModel[91].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		bodyModel[91].setRotationPoint(-171F, -51F, -12F);
		bodyModel[91].rotateAngleZ = -0.10471976F;

		bodyModel[92].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		bodyModel[92].setRotationPoint(-171F, -51F, -3F);
		bodyModel[92].rotateAngleZ = -0.10471976F;

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		bodyModel[93].setRotationPoint(-171F, -51F, -12F);
		bodyModel[93].rotateAngleZ = -0.10471976F;

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 13, 10, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		bodyModel[94].setRotationPoint(-162F, -63F, -12F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[95].setRotationPoint(-160F, -67F, -10F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 13, 8, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 246
		bodyModel[96].setRotationPoint(-163F, -62F, -11F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[97].setRotationPoint(-163.3F, -62.3F, -9F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[98].setRotationPoint(-163.3F, -62.3F, -6F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[99].setRotationPoint(-162F, -60F, -11F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 251
		bodyModel[100].setRotationPoint(-162F, -60F, -4F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[101].setRotationPoint(-168F, -50F, -13F);
		bodyModel[101].rotateAngleZ = 0.78539816F;

		bodyModel[102].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 253
		bodyModel[102].setRotationPoint(-168F, -50F, -2F);
		bodyModel[102].rotateAngleZ = 0.78539816F;

		bodyModel[103].addShapeBox(-1F, -1F, 0F, 2, 11, 2, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 263
		bodyModel[103].setRotationPoint(-172.5F, -55.25F, -8F);
		bodyModel[103].rotateAngleZ = -1.13446401F;

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 264
		bodyModel[104].setRotationPoint(-172F, -59F, -7.5F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 962
		bodyModel[105].setRotationPoint(-160.5F, -66.5F, -8.5F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 964
		bodyModel[106].setRotationPoint(-160.5F, -65.5F, -8.5F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 966
		bodyModel[107].setRotationPoint(-160.5F, -64.5F, -8.5F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 782
		bodyModel[108].setRotationPoint(-167F, -49F, -11F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 783
		bodyModel[109].setRotationPoint(-167F, -49F, -4F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 786
		bodyModel[110].setRotationPoint(-172F, -58.75F, -6.5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 789
		bodyModel[111].setRotationPoint(-172F, -58.75F, -10.5F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 791
		bodyModel[112].setRotationPoint(-172F, -61.75F, -10.5F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 792
		bodyModel[113].setRotationPoint(-172F, -61.75F, -4.5F);

		bodyModel[114].addShapeBox(0F, 1F, 0F, 10, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 373
		bodyModel[114].setRotationPoint(-171F, -51F, 2F);
		bodyModel[114].rotateAngleZ = -0.10471976F;

		bodyModel[115].addShapeBox(9F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 374
		bodyModel[115].setRotationPoint(-171F, -51F, 2F);
		bodyModel[115].rotateAngleZ = -0.10471976F;

		bodyModel[116].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 375
		bodyModel[116].setRotationPoint(-171F, -51F, 11F);
		bodyModel[116].rotateAngleZ = -0.10471976F;

		bodyModel[117].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 376
		bodyModel[117].setRotationPoint(-171F, -51F, 2F);
		bodyModel[117].rotateAngleZ = -0.10471976F;

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 377
		bodyModel[118].setRotationPoint(-171F, -51F, 2F);
		bodyModel[118].rotateAngleZ = -0.10471976F;

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 13, 10, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 378
		bodyModel[119].setRotationPoint(-162F, -63F, 2F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 379
		bodyModel[120].setRotationPoint(-160F, -67F, 4F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 13, 8, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 380
		bodyModel[121].setRotationPoint(-163F, -62F, 3F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 381
		bodyModel[122].setRotationPoint(-163.3F, -62.3F, 8F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 382
		bodyModel[123].setRotationPoint(-163.3F, -62.3F, 5F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 383
		bodyModel[124].setRotationPoint(-162F, -60F, 10F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 384
		bodyModel[125].setRotationPoint(-162F, -60F, 3F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 385
		bodyModel[126].setRotationPoint(-168F, -50F, 12F);
		bodyModel[126].rotateAngleZ = 0.78539816F;

		bodyModel[127].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 386
		bodyModel[127].setRotationPoint(-168F, -50F, 1F);
		bodyModel[127].rotateAngleZ = 0.78539816F;

		bodyModel[128].addShapeBox(-1F, -1F, 0F, 2, 11, 2, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 387
		bodyModel[128].setRotationPoint(-172.5F, -55.25F, 6F);
		bodyModel[128].rotateAngleZ = -1.13446401F;

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 388
		bodyModel[129].setRotationPoint(-172F, -59F, 6.5F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 389
		bodyModel[130].setRotationPoint(-160.5F, -66.5F, 5.5F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 390
		bodyModel[131].setRotationPoint(-160.5F, -65.5F, 5.5F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 391
		bodyModel[132].setRotationPoint(-160.5F, -64.5F, 5.5F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 392
		bodyModel[133].setRotationPoint(-167F, -49F, 10F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 393
		bodyModel[134].setRotationPoint(-167F, -49F, 3F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[135].setRotationPoint(-172F, -58.75F, 3.5F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 395
		bodyModel[136].setRotationPoint(-172F, -58.75F, 7.5F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 396
		bodyModel[137].setRotationPoint(-172F, -61.75F, 9.5F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 397
		bodyModel[138].setRotationPoint(-172F, -61.75F, 3.5F);
	}

	private void initnoseModel_1()
	{
		noseModel[0] = new ModelRendererTurbo(this, 185, 121, textureX, textureY); // Box 43
		noseModel[1] = new ModelRendererTurbo(this, 673, 121, textureX, textureY); // Box 44
		noseModel[2] = new ModelRendererTurbo(this, 1449, 1, textureX, textureY); // Box 48
		noseModel[3] = new ModelRendererTurbo(this, 801, 121, textureX, textureY); // Box 49
		noseModel[4] = new ModelRendererTurbo(this, 1153, 121, textureX, textureY); // Box 50
		noseModel[5] = new ModelRendererTurbo(this, 1441, 121, textureX, textureY); // Box 51
		noseModel[6] = new ModelRendererTurbo(this, 521, 121, textureX, textureY); // Box 52
		noseModel[7] = new ModelRendererTurbo(this, 1649, 1, textureX, textureY); // Box 53
		noseModel[8] = new ModelRendererTurbo(this, 1353, 417, textureX, textureY); // Box 208
		noseModel[9] = new ModelRendererTurbo(this, 753, 425, textureX, textureY); // Box 209
		noseModel[10] = new ModelRendererTurbo(this, 1593, 353, textureX, textureY); // Box 213
		noseModel[11] = new ModelRendererTurbo(this, 1481, 417, textureX, textureY); // Box 214
		noseModel[12] = new ModelRendererTurbo(this, 881, 425, textureX, textureY); // Box 215
		noseModel[13] = new ModelRendererTurbo(this, 1209, 289, textureX, textureY); // Box 216
		noseModel[14] = new ModelRendererTurbo(this, 697, 241, textureX, textureY); // Box 218
		noseModel[15] = new ModelRendererTurbo(this, 553, 489, textureX, textureY); // Box 346

		noseModel[0].addShapeBox(0F, 0F, 0F, 34, 29, 29, 0F,0F, -4F, -13F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -2F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 43
		noseModel[0].setRotationPoint(-235F, -44F, -29F);

		noseModel[1].addShapeBox(0F, 0F, 0F, 34, 13, 26, 0F,0F, 0F, -16F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); // Box 44
		noseModel[1].setRotationPoint(-235F, -57F, -26F);

		noseModel[2].addShapeBox(0F, 0F, 0F, 14, 17, 16, 0F,0F, 0F, -10F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		noseModel[2].setRotationPoint(-249F, -57F, -16F);

		noseModel[3].addShapeBox(0F, 0F, 0F, 14, 23, 16, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 49
		noseModel[3].setRotationPoint(-249F, -40F, -16F);

		noseModel[4].addShapeBox(0F, 0F, 0F, 34, 20, 29, 0F,0F, 2F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -7F, -8F, 0F, 0F, 0F, 0F, 13F, 0F, 0F, 3F, 0F); // Box 50
		noseModel[4].setRotationPoint(-235F, -15F, -29F);

		noseModel[5].addShapeBox(0F, 0F, 0F, 14, 15, 21, 0F,0F, 1F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -6F, -8F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, 4F, 0F); // Box 51
		noseModel[5].setRotationPoint(-249F, -17F, -21F);

		noseModel[6].addShapeBox(0F, 0F, 0F, 11, 22, 13, 0F,0F, 0F, -9F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		noseModel[6].setRotationPoint(-260F, -40F, -13F);

		noseModel[7].addShapeBox(0F, 0F, 0F, 11, 10, 13, 0F,0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, -9F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, -8F, 0F); // Box 53
		noseModel[7].setRotationPoint(-260F, -18F, -13F);

		noseModel[8].addShapeBox(0F, 0F, 0F, 34, 29, 29, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -4F, -13F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -8F); // Box 208
		noseModel[8].setRotationPoint(-235F, -44F, 0F);

		noseModel[9].addShapeBox(0F, 0F, 0F, 34, 13, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -16F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -10F); // Box 209
		noseModel[9].setRotationPoint(-235F, -57F, 0F);

		noseModel[10].addShapeBox(0F, 0F, 0F, 14, 17, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 213
		noseModel[10].setRotationPoint(-249F, -57F, 0F);

		noseModel[11].addShapeBox(0F, 0F, 0F, 14, 23, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, -1F, -3F); // Box 214
		noseModel[11].setRotationPoint(-249F, -40F, 0F);

		noseModel[12].addShapeBox(0F, 0F, 0F, 34, 20, 29, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -8F, 0F, 3F, 0F, 0F, 13F, 0F, 0F, 0F, 0F, 0F, -7F, -8F); // Box 215
		noseModel[12].setRotationPoint(-235F, -15F, 0F);

		noseModel[13].addShapeBox(0F, 0F, 0F, 14, 15, 21, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -8F, 0F, 4F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, -6F, -8F); // Box 216
		noseModel[13].setRotationPoint(-249F, -17F, 0F);

		noseModel[14].addShapeBox(0F, 0F, 0F, 11, 10, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, -8F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, -9F, -9F); // Box 218
		noseModel[14].setRotationPoint(-260F, -18F, 0F);

		noseModel[15].addShapeBox(0F, 0F, 0F, 11, 22, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F); // Box 346
		noseModel[15].setRotationPoint(-260F, -40F, 0F);
	}

	private void inittailModel_1()
	{
		tailModel[0] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 27
		tailModel[1] = new ModelRendererTurbo(this, 561, 97, textureX, textureY); // Box 28
		tailModel[2] = new ModelRendererTurbo(this, 977, 97, textureX, textureY); // Box 29
		tailModel[3] = new ModelRendererTurbo(this, 1081, 97, textureX, textureY); // Box 30
		tailModel[4] = new ModelRendererTurbo(this, 289, 113, textureX, textureY); // Box 31
		tailModel[5] = new ModelRendererTurbo(this, 425, 113, textureX, textureY); // Box 32
		tailModel[6] = new ModelRendererTurbo(this, 1329, 113, textureX, textureY); // Box 33
		tailModel[7] = new ModelRendererTurbo(this, 881, 113, textureX, textureY); // Box 34
		tailModel[8] = new ModelRendererTurbo(this, 1849, 1, textureX, textureY); // Box 35
		tailModel[9] = new ModelRendererTurbo(this, 1745, 113, textureX, textureY); // Box 37
		tailModel[10] = new ModelRendererTurbo(this, 81, 121, textureX, textureY); // Box 38
		tailModel[11] = new ModelRendererTurbo(this, 1945, 1, textureX, textureY); // Box 39
		tailModel[12] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 41
		tailModel[13] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 42
		tailModel[14] = new ModelRendererTurbo(this, 17, 209, textureX, textureY); // Box 144
		tailModel[15] = new ModelRendererTurbo(this, 649, 241, textureX, textureY); // Box 145
		tailModel[16] = new ModelRendererTurbo(this, 1481, 161, textureX, textureY); // Box 147
		tailModel[17] = new ModelRendererTurbo(this, 1849, 201, textureX, textureY); // Box 148
		tailModel[18] = new ModelRendererTurbo(this, 1, 265, textureX, textureY); // Box 192
		tailModel[19] = new ModelRendererTurbo(this, 729, 353, textureX, textureY); // Box 193
		tailModel[20] = new ModelRendererTurbo(this, 1937, 273, textureX, textureY); // Box 194
		tailModel[21] = new ModelRendererTurbo(this, 929, 377, textureX, textureY); // Box 195
		tailModel[22] = new ModelRendererTurbo(this, 617, 417, textureX, textureY); // Box 196
		tailModel[23] = new ModelRendererTurbo(this, 1017, 417, textureX, textureY); // Box 197
		tailModel[24] = new ModelRendererTurbo(this, 1113, 417, textureX, textureY); // Box 198
		tailModel[25] = new ModelRendererTurbo(this, 777, 313, textureX, textureY); // Box 199
		tailModel[26] = new ModelRendererTurbo(this, 1545, 305, textureX, textureY); // Box 200
		tailModel[27] = new ModelRendererTurbo(this, 1945, 409, textureX, textureY); // Box 202
		tailModel[28] = new ModelRendererTurbo(this, 1249, 417, textureX, textureY); // Box 203
		tailModel[29] = new ModelRendererTurbo(this, 1641, 305, textureX, textureY); // Box 204
		tailModel[30] = new ModelRendererTurbo(this, 681, 161, textureX, textureY); // Box 206
		tailModel[31] = new ModelRendererTurbo(this, 505, 185, textureX, textureY); // Box 207
		tailModel[32] = new ModelRendererTurbo(this, 257, 537, textureX, textureY); // Box 309
		tailModel[33] = new ModelRendererTurbo(this, 761, 537, textureX, textureY); // Box 310
		tailModel[34] = new ModelRendererTurbo(this, 129, 465, textureX, textureY); // Box 312
		tailModel[35] = new ModelRendererTurbo(this, 1929, 505, textureX, textureY); // Box 313

		tailModel[0].addShapeBox(0F, 0F, 0F, 25, 15, 23, 0F,0F, 0F, -3F, 0F, 2F, -5F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -3F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 27
		tailModel[0].setRotationPoint(134F, -51F, -23F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 46, 13, 20, 0F,0F, 0F, -2F, 0F, 6F, -7F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, -4F, 0F, -7F, 0F, 0F, 0F, 0F); // Box 28
		tailModel[1].setRotationPoint(159F, -53F, -20F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 32, 12, 16, 0F,0F, 0F, -3F, 0F, 2F, -6F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		tailModel[2].setRotationPoint(205F, -59F, -16F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 25, 16, 23, 0F,0F, 0F, 0F, 0F, 4F, -3F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -6F, -5F, 0F, -6F, 0F, 0F, 0F, 0F); // Box 30
		tailModel[3].setRotationPoint(134F, -36F, -23F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 46, 14, 20, 0F,0F, 0F, 0F, 0F, 7F, -4F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -9F, -6F, 0F, -9F, 0F, 0F, 0F, 0F); // Box 31
		tailModel[4].setRotationPoint(159F, -40F, -20F);

		tailModel[5].addShapeBox(0F, 0F, 0F, 25, 15, 21, 0F,0F, 0F, 0F, 0F, 6F, -3F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, -17F, 0F, -13F, -10F, 0F, -8F, 0F, 0F, 0F, 0F); // Box 32
		tailModel[5].setRotationPoint(134F, -20F, -21F);

		tailModel[6].addShapeBox(0F, 0F, 0F, 46, 8, 18, 0F,0F, 0F, 0F, 0F, 9F, -4F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -9F, -10F, 0F, -5F, 0F, 0F, 5F, 0F); // Box 33
		tailModel[6].setRotationPoint(159F, -26F, -18F);

		tailModel[7].addShapeBox(0F, 0F, 0F, 32, 12, 16, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -7F, -5F, 0F, -7F, 0F, 0F, 0F, 0F); // Box 34
		tailModel[7].setRotationPoint(205F, -47F, -16F);

		tailModel[8].addShapeBox(0F, 0F, 0F, 32, 8, 14, 0F,0F, 0F, 0F, 0F, 7F, -3F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -8F, -8F, 0F, -5F, 0F, 0F, 4F, 0F); // Box 35
		tailModel[8].setRotationPoint(205F, -35F, -14F);

		tailModel[9].addShapeBox(0F, 0F, 0F, 25, 11, 20, 0F,0F, 0F, -8F, 0F, 1F, -10F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 37
		tailModel[9].setRotationPoint(134F, -62F, -20F);

		tailModel[10].addShapeBox(0F, 0F, 0F, 46, 10, 18, 0F,0F, 0F, -8F, 0F, 4F, -10F, 0F, 7F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, -6F, -5F, 0F, -6F, 0F, 0F, 0F, 0F); // Box 38
		tailModel[10].setRotationPoint(159F, -63F, -18F);

		tailModel[11].addShapeBox(0F, 0F, 0F, 32, 8, 13, 0F,0F, 0F, -5F, 0F, 0F, -7F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 39
		tailModel[11].setRotationPoint(205F, -67F, -13F);

		tailModel[12].addShapeBox(0F, 0F, 0F, 16, 5, 11, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		tailModel[12].setRotationPoint(237F, -47F, -11F);

		tailModel[13].addShapeBox(0F, 0F, 0F, 16, 7, 11, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -6F, -5F, 0F, -5F, 0F, 0F, 3F, 0F); // Box 42
		tailModel[13].setRotationPoint(237F, -42F, -11F);

		tailModel[14].addShapeBox(0F, 0F, 0F, 29, 5, 104, 0F,-21F, -2F, -6F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -21F, -2F, -6F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 144
		tailModel[14].setRotationPoint(166F, -61F, -115F);

		tailModel[15].addShapeBox(0F, 0F, 0F, 10, 5, 104, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		tailModel[15].setRotationPoint(195F, -61F, -115F);

		tailModel[16].addShapeBox(0F, 0F, 0F, 13, 106, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		tailModel[16].setRotationPoint(196F, -172F, -3F);

		tailModel[17].addShapeBox(0F, 0F, 0F, 37, 106, 3, 0F,-27F, -10F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -27F, -10F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		tailModel[17].setRotationPoint(159F, -172F, -3F);

		tailModel[18].addShapeBox(0F, 0F, 0F, 25, 15, 23, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, -3F, 0F, 0F, 0F); // Box 192
		tailModel[18].setRotationPoint(134F, -51F, 0F);

		tailModel[19].addShapeBox(0F, 0F, 0F, 46, 13, 20, 0F,0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, -7F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, -4F, 0F, 0F, 0F); // Box 193
		tailModel[19].setRotationPoint(159F, -53F, 0F);

		tailModel[20].addShapeBox(0F, 0F, 0F, 32, 12, 16, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -6F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 194
		tailModel[20].setRotationPoint(205F, -59F, 0F);

		tailModel[21].addShapeBox(0F, 0F, 0F, 25, 16, 23, 0F,0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, -5F, 0F, 0F, -2F); // Box 195
		tailModel[21].setRotationPoint(134F, -36F, 0F);

		tailModel[22].addShapeBox(0F, 0F, 0F, 46, 14, 20, 0F,0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, -6F, 0F, 0F, -2F); // Box 196
		tailModel[22].setRotationPoint(159F, -40F, 0F);

		tailModel[23].addShapeBox(0F, 0F, 0F, 25, 15, 21, 0F,0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -13F, -10F, 0F, 0F, -17F); // Box 197
		tailModel[23].setRotationPoint(134F, -20F, 0F);

		tailModel[24].addShapeBox(0F, 0F, 0F, 46, 8, 18, 0F,0F, 0F, 0F, 0F, 9F, 0F, 0F, 9F, -4F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, -9F, -10F, 0F, 0F, -7F); // Box 198
		tailModel[24].setRotationPoint(159F, -26F, 0F);

		tailModel[25].addShapeBox(0F, 0F, 0F, 32, 12, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, -5F, 0F, 0F, -2F); // Box 199
		tailModel[25].setRotationPoint(205F, -47F, 0F);

		tailModel[26].addShapeBox(0F, 0F, 0F, 32, 8, 14, 0F,0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, -3F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -5F, 0F, 0F, -8F, -8F, 0F, 0F, -6F); // Box 200
		tailModel[26].setRotationPoint(205F, -35F, 0F);

		tailModel[27].addShapeBox(0F, 0F, 0F, 25, 11, 20, 0F,0F, 5F, 0F, 0F, 5F, 0F, 0F, 1F, -10F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, 0F, 0F); // Box 202
		tailModel[27].setRotationPoint(134F, -62F, 0F);

		tailModel[28].addShapeBox(0F, 0F, 0F, 46, 10, 18, 0F,0F, 4F, 0F, 0F, 7F, 0F, 0F, 4F, -10F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, -5F, 0F, 0F, 0F); // Box 203
		tailModel[28].setRotationPoint(159F, -63F, 0F);

		tailModel[29].addShapeBox(0F, 0F, 0F, 32, 8, 13, 0F,0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, -7F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -3F, 0F, 0F, 0F); // Box 204
		tailModel[29].setRotationPoint(205F, -67F, 0F);

		tailModel[30].addShapeBox(0F, 0F, 0F, 16, 5, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 206
		tailModel[30].setRotationPoint(237F, -47F, 0F);

		tailModel[31].addShapeBox(0F, 0F, 0F, 16, 7, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -5F, 0F, 0F, -6F, -5F, 0F, 0F, -5F); // Box 207
		tailModel[31].setRotationPoint(237F, -42F, 0F);

		tailModel[32].addShapeBox(0F, 0F, 0F, 29, 5, 104, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -21F, -2F, -6F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -21F, -2F, -6F); // Box 309
		tailModel[32].setRotationPoint(166F, -61F, 11F);

		tailModel[33].addShapeBox(0F, 0F, 0F, 10, 5, 104, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 310
		tailModel[33].setRotationPoint(195F, -61F, 11F);

		tailModel[34].addShapeBox(0F, 0F, 0F, 13, 106, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 312
		tailModel[34].setRotationPoint(196F, -172F, 0F);

		tailModel[35].addShapeBox(0F, 0F, 0F, 37, 106, 3, 0F,-27F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -27F, -10F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 313
		tailModel[35].setRotationPoint(159F, -172F, 0F);
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 1361, 121, textureX, textureY); // Box 54
		leftWingModel[1] = new ModelRendererTurbo(this, 825, 129, textureX, textureY); // Box 55
		leftWingModel[2] = new ModelRendererTurbo(this, 417, 137, textureX, textureY); // Box 56
		leftWingModel[3] = new ModelRendererTurbo(this, 1577, 145, textureX, textureY); // Box 57
		leftWingModel[4] = new ModelRendererTurbo(this, 1105, 145, textureX, textureY); // Box 58
		leftWingModel[5] = new ModelRendererTurbo(this, 1897, 121, textureX, textureY); // Box 161
		leftWingModel[6] = new ModelRendererTurbo(this, 833, 145, textureX, textureY); // Box 162
		leftWingModel[7] = new ModelRendererTurbo(this, 1601, 145, textureX, textureY); // Box 163
		leftWingModel[8] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 164
		leftWingModel[9] = new ModelRendererTurbo(this, 409, 153, textureX, textureY); // Box 165
		leftWingModel[10] = new ModelRendererTurbo(this, 97, 161, textureX, textureY); // Box 166
		leftWingModel[11] = new ModelRendererTurbo(this, 593, 161, textureX, textureY); // Box 167
		leftWingModel[12] = new ModelRendererTurbo(this, 713, 161, textureX, textureY); // Box 168
		leftWingModel[13] = new ModelRendererTurbo(this, 1361, 161, textureX, textureY); // Box 169
		leftWingModel[14] = new ModelRendererTurbo(this, 1849, 161, textureX, textureY); // Box 170
		leftWingModel[15] = new ModelRendererTurbo(this, 577, 1, textureX, textureY); // Box 171
		leftWingModel[16] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 172
		leftWingModel[17] = new ModelRendererTurbo(this, 593, 1, textureX, textureY); // Box 173
		leftWingModel[18] = new ModelRendererTurbo(this, 721, 1, textureX, textureY); // Box 174
		leftWingModel[19] = new ModelRendererTurbo(this, 745, 1, textureX, textureY); // Box 175
		leftWingModel[20] = new ModelRendererTurbo(this, 1289, 1, textureX, textureY); // Box 176
		leftWingModel[21] = new ModelRendererTurbo(this, 1241, 41, textureX, textureY); // Box 177
		leftWingModel[22] = new ModelRendererTurbo(this, 1449, 1, textureX, textureY); // Box 178
		leftWingModel[23] = new ModelRendererTurbo(this, 1497, 1, textureX, textureY); // Box 179
		leftWingModel[24] = new ModelRendererTurbo(this, 1689, 1, textureX, textureY); // Box 180
		leftWingModel[25] = new ModelRendererTurbo(this, 1929, 1, textureX, textureY); // Box 181
		leftWingModel[26] = new ModelRendererTurbo(this, 2025, 1, textureX, textureY); // Box 182
		leftWingModel[27] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 111
		leftWingModel[28] = new ModelRendererTurbo(this, 2017, 25, textureX, textureY); // Box 112
		leftWingModel[29] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 113
		leftWingModel[30] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 114
		leftWingModel[31] = new ModelRendererTurbo(this, 737, 25, textureX, textureY); // Box 115
		leftWingModel[32] = new ModelRendererTurbo(this, 841, 25, textureX, textureY); // Box 116
		leftWingModel[33] = new ModelRendererTurbo(this, 577, 17, textureX, textureY); // Box 117
		leftWingModel[34] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 118
		leftWingModel[35] = new ModelRendererTurbo(this, 881, 25, textureX, textureY); // Box 119
		leftWingModel[36] = new ModelRendererTurbo(this, 1073, 177, textureX, textureY); // Box 91
		leftWingModel[37] = new ModelRendererTurbo(this, 1601, 177, textureX, textureY); // Box 92
		leftWingModel[38] = new ModelRendererTurbo(this, 185, 185, textureX, textureY); // Box 93
		leftWingModel[39] = new ModelRendererTurbo(this, 409, 185, textureX, textureY); // Box 94
		leftWingModel[40] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 95
		leftWingModel[41] = new ModelRendererTurbo(this, 1169, 185, textureX, textureY); // Box 96
		leftWingModel[42] = new ModelRendererTurbo(this, 801, 193, textureX, textureY); // Box 97
		leftWingModel[43] = new ModelRendererTurbo(this, 593, 201, textureX, textureY); // Box 98
		leftWingModel[44] = new ModelRendererTurbo(this, 713, 201, textureX, textureY); // Box 99
		leftWingModel[45] = new ModelRendererTurbo(this, 1361, 201, textureX, textureY); // Box 100
		leftWingModel[46] = new ModelRendererTurbo(this, 1265, 41, textureX, textureY); // Box 101
		leftWingModel[47] = new ModelRendererTurbo(this, 1049, 25, textureX, textureY); // Box 102
		leftWingModel[48] = new ModelRendererTurbo(this, 1065, 25, textureX, textureY); // Box 103
		leftWingModel[49] = new ModelRendererTurbo(this, 545, 49, textureX, textureY); // Box 104
		leftWingModel[50] = new ModelRendererTurbo(this, 1081, 25, textureX, textureY); // Box 105
		leftWingModel[51] = new ModelRendererTurbo(this, 1097, 25, textureX, textureY); // Box 106
		leftWingModel[52] = new ModelRendererTurbo(this, 1801, 57, textureX, textureY); // Box 107
		leftWingModel[53] = new ModelRendererTurbo(this, 2017, 41, textureX, textureY); // Box 108
		leftWingModel[54] = new ModelRendererTurbo(this, 1249, 25, textureX, textureY); // Box 109
		leftWingModel[55] = new ModelRendererTurbo(this, 1265, 25, textureX, textureY); // Box 110
		leftWingModel[56] = new ModelRendererTurbo(this, 1281, 25, textureX, textureY); // Box 111
		leftWingModel[57] = new ModelRendererTurbo(this, 1297, 25, textureX, textureY); // Box 112
		leftWingModel[58] = new ModelRendererTurbo(this, 569, 49, textureX, textureY); // Box 113
		leftWingModel[59] = new ModelRendererTurbo(this, 1321, 65, textureX, textureY); // Box 114
		leftWingModel[60] = new ModelRendererTurbo(this, 1473, 65, textureX, textureY); // Box 115
		leftWingModel[61] = new ModelRendererTurbo(this, 1649, 25, textureX, textureY); // Box 116
		leftWingModel[62] = new ModelRendererTurbo(this, 1849, 25, textureX, textureY); // Box 117
		leftWingModel[63] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 118
		leftWingModel[64] = new ModelRendererTurbo(this, 1689, 25, textureX, textureY); // Box 119
		leftWingModel[65] = new ModelRendererTurbo(this, 1825, 57, textureX, textureY); // Box 120
		leftWingModel[66] = new ModelRendererTurbo(this, 273, 65, textureX, textureY); // Box 121
		leftWingModel[67] = new ModelRendererTurbo(this, 2017, 81, textureX, textureY); // Import Box69
		leftWingModel[68] = new ModelRendererTurbo(this, 2025, 81, textureX, textureY); // Import Box70
		leftWingModel[69] = new ModelRendererTurbo(this, 2033, 81, textureX, textureY); // Import Box71
		leftWingModel[70] = new ModelRendererTurbo(this, 2041, 81, textureX, textureY); // Import Box72
		leftWingModel[71] = new ModelRendererTurbo(this, 969, 73, textureX, textureY); // Import Box162
		leftWingModel[72] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Import Box163
		leftWingModel[73] = new ModelRendererTurbo(this, 593, 137, textureX, textureY); // Import Box164
		leftWingModel[74] = new ModelRendererTurbo(this, 1073, 137, textureX, textureY); // Import Box165
		leftWingModel[75] = new ModelRendererTurbo(this, 1625, 65, textureX, textureY); // Import Box166
		leftWingModel[76] = new ModelRendererTurbo(this, 865, 73, textureX, textureY); // Import Box167
		leftWingModel[77] = new ModelRendererTurbo(this, 1849, 129, textureX, textureY); // Import Box168
		leftWingModel[78] = new ModelRendererTurbo(this, 497, 161, textureX, textureY); // Import Box169
		leftWingModel[79] = new ModelRendererTurbo(this, 1361, 145, textureX, textureY); // Import Box170
		leftWingModel[80] = new ModelRendererTurbo(this, 1073, 161, textureX, textureY); // Import Box171
		leftWingModel[81] = new ModelRendererTurbo(this, 377, 73, textureX, textureY); // Import Box172
		leftWingModel[82] = new ModelRendererTurbo(this, 681, 97, textureX, textureY); // Import Box173
		leftWingModel[83] = new ModelRendererTurbo(this, 961, 145, textureX, textureY); // Box 180
		leftWingModel[84] = new ModelRendererTurbo(this, 969, 145, textureX, textureY); // Box 181
		leftWingModel[85] = new ModelRendererTurbo(this, 1729, 145, textureX, textureY); // Box 182
		leftWingModel[86] = new ModelRendererTurbo(this, 1737, 145, textureX, textureY); // Box 183
		leftWingModel[87] = new ModelRendererTurbo(this, 1745, 145, textureX, textureY); // Box 184
		leftWingModel[88] = new ModelRendererTurbo(this, 1753, 145, textureX, textureY); // Box 185
		leftWingModel[89] = new ModelRendererTurbo(this, 1849, 153, textureX, textureY); // Box 782
		leftWingModel[90] = new ModelRendererTurbo(this, 1865, 153, textureX, textureY); // Box 783
		leftWingModel[91] = new ModelRendererTurbo(this, 1257, 177, textureX, textureY); // Box 784
		leftWingModel[92] = new ModelRendererTurbo(this, 1273, 177, textureX, textureY); // Box 785
		leftWingModel[93] = new ModelRendererTurbo(this, 1273, 233, textureX, textureY); // Box 342
		leftWingModel[94] = new ModelRendererTurbo(this, 593, 241, textureX, textureY); // Box 343
		leftWingModel[95] = new ModelRendererTurbo(this, 609, 241, textureX, textureY); // Box 344
		leftWingModel[96] = new ModelRendererTurbo(this, 777, 241, textureX, textureY); // Box 345

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 40, 19, 158, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 14F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 6F, 0F, 14F, 6F, 0F); // Box 54
		leftWingModel[0].setRotationPoint(-102F, -72F, -173F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 44, 19, 158, 0F,14F, 0F, 0F, -14F, -15F, 0F, 0F, -23F, 0F, 14F, 0F, 0F, 14F, -3F, 0F, -14F, -3F, 0F, 0F, 6F, 0F, 14F, 6F, 0F); // Box 55
		leftWingModel[1].setRotationPoint(-48F, -72F, -173F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 8, 19, 158, 0F,0F, -6F, 0F, 0F, 0F, 0F, -14F, 0F, 0F, 22F, -8F, 0F, 0F, -9F, 0F, 0F, -3F, 0F, -14F, 6F, 0F, 22F, -2F, 0F); // Box 56
		leftWingModel[2].setRotationPoint(-110F, -72F, -173F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 40, 16, 185, 0F,-29F, -3F, -4F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -29F, -10F, -4F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		leftWingModel[3].setRotationPoint(-102F, -72F, -358F);

		leftWingModel[4].addShapeBox(0F, 0F, 0F, 37, 16, 181, 0F,-29F, -3F, -4F, 0F, -3F, 0F, -29F, 0F, 0F, 0F, -6F, 0F, -29F, -10F, -4F, 0F, -10F, 0F, -29F, 0F, 0F, 0F, -6F, 0F); // Box 58
		leftWingModel[4].setRotationPoint(-110F, -72F, -354F);

		leftWingModel[5].addShapeBox(0F, 0F, 0F, 30, 5, 30, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		leftWingModel[5].setRotationPoint(-151F, -74F, -96F);

		leftWingModel[6].addShapeBox(0F, 0F, 0F, 30, 10, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		leftWingModel[6].setRotationPoint(-151F, -69F, -96F);

		leftWingModel[7].addShapeBox(0F, 0F, 0F, 30, 5, 26, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		leftWingModel[7].setRotationPoint(-151F, -79F, -94F);

		leftWingModel[8].addShapeBox(0F, 0F, 0F, 30, 5, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 164
		leftWingModel[8].setRotationPoint(-151F, -59F, -96F);

		leftWingModel[9].addShapeBox(0F, 0F, 0F, 30, 5, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F); // Box 165
		leftWingModel[9].setRotationPoint(-151F, -54F, -94F);

		leftWingModel[10].addShapeBox(0F, 0F, 0F, 26, 10, 30, 0F,0F, 0F, 0F, 0F, -4F, -14F, 0F, -4F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -14F, 0F, -4F, -14F, 0F, 0F, 0F); // Box 166
		leftWingModel[10].setRotationPoint(-121F, -69F, -96F);

		leftWingModel[11].addShapeBox(0F, 0F, 0F, 26, 5, 30, 0F,0F, 0F, -1.9999F, 0F, -8.9999F, -13.9999F, 0F, -8.9999F, -13.9999F, 0F, 0F, -1.9999F, 0F, 0F, 0F, 0F, 3.9999F, -13.9999F, 0F, 3.9999F, -13.9999F, 0F, 0F, 0F); // Box 167
		leftWingModel[11].setRotationPoint(-121F, -74F, -96F);

		leftWingModel[12].addShapeBox(0F, 0F, 0F, 26, 5, 30, 0F,0F, 4.9999F, -7.9999F, 0F, -8.9999F, -13.9999F, 0F, -8.9999F, -13.9999F, 0F, 4.9999F, -7.9999F, 0F, -4.9999F, -1.9999F, 0F, 3.9999F, -13.9999F, 0F, 3.9999F, -13.9999F, 0F, -4.9999F, -1.9999F); // Box 168
		leftWingModel[12].setRotationPoint(-121F, -74F, -96F);

		leftWingModel[13].addShapeBox(0F, 0F, 0F, 26, 5, 30, 0F,0F, 0F, 0F, 0F, 3.9999F, -13.9999F, 0F, 3.9999F, -13.9999F, 0F, 0F, 0F, 0F, 0F, -1.9999F, 0F, -8.9999F, -13.9999F, 0F, -8.9999F, -13.9999F, 0F, 0F, -1.9999F); // Box 169
		leftWingModel[13].setRotationPoint(-121F, -59F, -96F);

		leftWingModel[14].addShapeBox(0F, 0F, 0F, 26, 5, 30, 0F,0F, -4.9999F, -1.9999F, 0F, 3.9999F, -13.9999F, 0F, 3.9999F, -13.9999F, 0F, -4.9999F, -1.9999F, 0F, 4.9999F, -7.9999F, 0F, -8.9999F, -13.9999F, 0F, -8.9999F, -13.9999F, 0F, 4.9999F, -7.9999F); // Box 170
		leftWingModel[14].setRotationPoint(-121F, -59F, -96F);

		leftWingModel[15].addShapeBox(0F, 0F, 0F, 4, 10, 3, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F); // Box 171
		leftWingModel[15].setRotationPoint(-155F, -69F, -96F);

		leftWingModel[16].addShapeBox(0F, 0F, 0F, 4, 5, 3, 0F,0F, -1F, -3F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, -1F, 3F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F); // Box 172
		leftWingModel[16].setRotationPoint(-155F, -74F, -96F);

		leftWingModel[17].addShapeBox(0F, 0F, 0F, 4, 5, 3, 0F,0F, -1F, -5F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, -1F, 5F, 0F, 1F, 1F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 1F, -1F); // Box 173
		leftWingModel[17].setRotationPoint(-155F, -79F, -92F);

		leftWingModel[18].addShapeBox(0F, 0F, 0F, 4, 3, 14, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F); // Box 174
		leftWingModel[18].setRotationPoint(-155F, -79F, -88F);

		leftWingModel[19].addShapeBox(0F, 0F, 0F, 4, 5, 3, 0F,0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, -1F, -3F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, -1F, 3F); // Box 175
		leftWingModel[19].setRotationPoint(-155F, -59F, -96F);

		leftWingModel[20].addShapeBox(0F, 0F, 0F, 4, 5, 3, 0F,0F, 1F, 1F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 1F, -1F, 0F, -1F, -5F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, -1F, 5F); // Box 176
		leftWingModel[20].setRotationPoint(-155F, -54F, -92F);

		leftWingModel[21].addShapeBox(0F, 0F, 0F, 4, 3, 14, 0F,0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 177
		leftWingModel[21].setRotationPoint(-155F, -52F, -88F);

		leftWingModel[22].addShapeBox(0F, 0F, 0F, 4, 10, 3, 0F,0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 178
		leftWingModel[22].setRotationPoint(-155F, -69F, -69F);

		leftWingModel[23].addShapeBox(0F, 0F, 0F, 4, 5, 3, 0F,0F, -1F, 3F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, -1F, -3F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F); // Box 179
		leftWingModel[23].setRotationPoint(-155F, -74F, -69F);

		leftWingModel[24].addShapeBox(0F, 0F, 0F, 4, 5, 3, 0F,0F, -1F, 5F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, -1F, -5F, 0F, 1F, -1F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 1F, 1F); // Box 180
		leftWingModel[24].setRotationPoint(-155F, -79F, -73F);

		leftWingModel[25].addShapeBox(0F, 0F, 0F, 4, 5, 3, 0F,0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, -1F, 3F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, -1F, -3F); // Box 181
		leftWingModel[25].setRotationPoint(-155F, -59F, -69F);

		leftWingModel[26].addShapeBox(0F, 0F, 0F, 4, 5, 3, 0F,0F, 1F, -1F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 1F, 1F, 0F, -1F, 5F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, -1F, -5F); // Box 182
		leftWingModel[26].setRotationPoint(-155F, -54F, -73F);

		leftWingModel[27].addShapeBox(0F, 0F, 0F, 6, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		leftWingModel[27].setRotationPoint(-155F, -65.5F, -85.5F);

		leftWingModel[28].addShapeBox(0F, 0F, 0F, 6, 3, 9, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		leftWingModel[28].setRotationPoint(-155F, -68.5F, -85.5F);

		leftWingModel[29].addShapeBox(0F, 0F, 0F, 6, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 113
		leftWingModel[29].setRotationPoint(-155F, -62.5F, -85.5F);

		leftWingModel[30].addShapeBox(0F, 0F, 0F, 10, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		leftWingModel[30].setRotationPoint(-165F, -65F, -84F);

		leftWingModel[31].addShapeBox(0F, 0F, 0F, 10, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		leftWingModel[31].setRotationPoint(-165F, -67F, -84F);

		leftWingModel[32].addShapeBox(0F, 0F, 0F, 10, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 116
		leftWingModel[32].setRotationPoint(-165F, -63F, -84F);

		leftWingModel[33].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 117
		leftWingModel[33].setRotationPoint(-168F, -65F, -84F);

		leftWingModel[34].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, -1.9999F, -1.9999F, 0F, 0F, -1.9999F, 0F, 0F, -1.9999F, 0F, -1.9999F, -1.9999F, 0F, 0F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9999F); // Box 118
		leftWingModel[34].setRotationPoint(-168F, -67F, -84F);

		leftWingModel[35].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, 0F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9999F, 0F, -1.9999F, -1.9999F, 0F, 0F, -1.9999F, 0F, 0F, -1.9999F, 0F, -1.9999F, -1.9999F); // Box 119
		leftWingModel[35].setRotationPoint(-168F, -63F, -84F);

		leftWingModel[36].addShapeBox(0F, 0F, 0F, 30, 5, 30, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		leftWingModel[36].setRotationPoint(-139F, -74F, -187F);

		leftWingModel[37].addShapeBox(0F, 0F, 0F, 30, 10, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		leftWingModel[37].setRotationPoint(-139F, -69F, -187F);

		leftWingModel[38].addShapeBox(0F, 0F, 0F, 30, 5, 26, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		leftWingModel[38].setRotationPoint(-139F, -79F, -185F);

		leftWingModel[39].addShapeBox(0F, 0F, 0F, 30, 5, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 94
		leftWingModel[39].setRotationPoint(-139F, -59F, -187F);

		leftWingModel[40].addShapeBox(0F, 0F, 0F, 30, 5, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F); // Box 95
		leftWingModel[40].setRotationPoint(-139F, -54F, -185F);

		leftWingModel[41].addShapeBox(0F, 0F, 0F, 26, 10, 30, 0F,0F, 0F, 0F, 0F, -4F, -14F, 0F, -4F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -14F, 0F, -4F, -14F, 0F, 0F, 0F); // Box 96
		leftWingModel[41].setRotationPoint(-109F, -69F, -187F);

		leftWingModel[42].addShapeBox(0F, 0F, 0F, 26, 5, 30, 0F,0F, 0F, -1.9999F, 0F, -8.9999F, -13.9999F, 0F, -8.9999F, -13.9999F, 0F, 0F, -1.9999F, 0F, 0F, 0F, 0F, 3.9999F, -13.9999F, 0F, 3.9999F, -13.9999F, 0F, 0F, 0F); // Box 97
		leftWingModel[42].setRotationPoint(-109F, -74F, -187F);

		leftWingModel[43].addShapeBox(0F, 0F, 0F, 26, 5, 30, 0F,0F, 4.9999F, -7.9999F, 0F, -8.9999F, -13.9999F, 0F, -8.9999F, -13.9999F, 0F, 4.9999F, -7.9999F, 0F, -4.9999F, -1.9999F, 0F, 3.9999F, -13.9999F, 0F, 3.9999F, -13.9999F, 0F, -4.9999F, -1.9999F); // Box 98
		leftWingModel[43].setRotationPoint(-109F, -74F, -187F);

		leftWingModel[44].addShapeBox(0F, 0F, 0F, 26, 5, 30, 0F,0F, 0F, 0F, 0F, 3.9999F, -13.9999F, 0F, 3.9999F, -13.9999F, 0F, 0F, 0F, 0F, 0F, -1.9999F, 0F, -8.9999F, -13.9999F, 0F, -8.9999F, -13.9999F, 0F, 0F, -1.9999F); // Box 99
		leftWingModel[44].setRotationPoint(-109F, -59F, -187F);

		leftWingModel[45].addShapeBox(0F, 0F, 0F, 26, 5, 30, 0F,0F, -4.9999F, -1.9999F, 0F, 3.9999F, -13.9999F, 0F, 3.9999F, -13.9999F, 0F, -4.9999F, -1.9999F, 0F, 4.9999F, -7.9999F, 0F, -8.9999F, -13.9999F, 0F, -8.9999F, -13.9999F, 0F, 4.9999F, -7.9999F); // Box 100
		leftWingModel[45].setRotationPoint(-109F, -59F, -187F);

		leftWingModel[46].addShapeBox(0F, 0F, 0F, 4, 10, 3, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F); // Box 101
		leftWingModel[46].setRotationPoint(-143F, -69F, -187F);

		leftWingModel[47].addShapeBox(0F, 0F, 0F, 4, 5, 3, 0F,0F, -1F, -3F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, -1F, 3F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F); // Box 102
		leftWingModel[47].setRotationPoint(-143F, -74F, -187F);

		leftWingModel[48].addShapeBox(0F, 0F, 0F, 4, 5, 3, 0F,0F, -1F, -5F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, -1F, 5F, 0F, 1F, 1F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 1F, -1F); // Box 103
		leftWingModel[48].setRotationPoint(-143F, -79F, -183F);

		leftWingModel[49].addShapeBox(0F, 0F, 0F, 4, 3, 14, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F); // Box 104
		leftWingModel[49].setRotationPoint(-143F, -79F, -179F);

		leftWingModel[50].addShapeBox(0F, 0F, 0F, 4, 5, 3, 0F,0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, -1F, -3F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, -1F, 3F); // Box 105
		leftWingModel[50].setRotationPoint(-143F, -59F, -187F);

		leftWingModel[51].addShapeBox(0F, 0F, 0F, 4, 5, 3, 0F,0F, 1F, 1F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 1F, -1F, 0F, -1F, -5F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, -1F, 5F); // Box 106
		leftWingModel[51].setRotationPoint(-143F, -54F, -183F);

		leftWingModel[52].addShapeBox(0F, 0F, 0F, 4, 3, 14, 0F,0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 107
		leftWingModel[52].setRotationPoint(-143F, -52F, -179F);

		leftWingModel[53].addShapeBox(0F, 0F, 0F, 4, 10, 3, 0F,0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 108
		leftWingModel[53].setRotationPoint(-143F, -69F, -160F);

		leftWingModel[54].addShapeBox(0F, 0F, 0F, 4, 5, 3, 0F,0F, -1F, 3F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, -1F, -3F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F); // Box 109
		leftWingModel[54].setRotationPoint(-143F, -74F, -160F);

		leftWingModel[55].addShapeBox(0F, 0F, 0F, 4, 5, 3, 0F,0F, -1F, 5F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, -1F, -5F, 0F, 1F, -1F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 1F, 1F); // Box 110
		leftWingModel[55].setRotationPoint(-143F, -79F, -164F);

		leftWingModel[56].addShapeBox(0F, 0F, 0F, 4, 5, 3, 0F,0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, -1F, 3F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, -1F, -3F); // Box 111
		leftWingModel[56].setRotationPoint(-143F, -59F, -160F);

		leftWingModel[57].addShapeBox(0F, 0F, 0F, 4, 5, 3, 0F,0F, 1F, -1F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 1F, 1F, 0F, -1F, 5F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, -1F, -5F); // Box 112
		leftWingModel[57].setRotationPoint(-143F, -54F, -164F);

		leftWingModel[58].addShapeBox(0F, 0F, 0F, 6, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		leftWingModel[58].setRotationPoint(-143F, -65.5F, -176.5F);

		leftWingModel[59].addShapeBox(0F, 0F, 0F, 6, 3, 9, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		leftWingModel[59].setRotationPoint(-143F, -68.5F, -176.5F);

		leftWingModel[60].addShapeBox(0F, 0F, 0F, 6, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 115
		leftWingModel[60].setRotationPoint(-143F, -62.5F, -176.5F);

		leftWingModel[61].addShapeBox(0F, 0F, 0F, 10, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		leftWingModel[61].setRotationPoint(-153F, -65F, -175F);

		leftWingModel[62].addShapeBox(0F, 0F, 0F, 10, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		leftWingModel[62].setRotationPoint(-153F, -67F, -175F);

		leftWingModel[63].addShapeBox(0F, 0F, 0F, 10, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 118
		leftWingModel[63].setRotationPoint(-153F, -63F, -175F);

		leftWingModel[64].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 119
		leftWingModel[64].setRotationPoint(-156F, -65F, -175F);

		leftWingModel[65].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, -1.9999F, -1.9999F, 0F, 0F, -1.9999F, 0F, 0F, -1.9999F, 0F, -1.9999F, -1.9999F, 0F, 0F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9999F); // Box 120
		leftWingModel[65].setRotationPoint(-156F, -67F, -175F);

		leftWingModel[66].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, 0F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9999F, 0F, -1.9999F, -1.9999F, 0F, 0F, -1.9999F, 0F, 0F, -1.9999F, 0F, -1.9999F, -1.9999F); // Box 121
		leftWingModel[66].setRotationPoint(-156F, -63F, -175F);

		leftWingModel[67].addShapeBox(0F, 0F, 0F, 2, 62, 1, 0F,0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 3F, 0F, 0F); // Import Box69
		leftWingModel[67].setRotationPoint(-90F, -69F, -226.5F);

		leftWingModel[68].addShapeBox(0F, 0F, 0F, 2, 62, 1, 0F,-15F, 0F, 0F, 15F, 0F, 0F, 16F, 0F, 0F, -15F, 0F, 0F, 3F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 4F, 0F, 0F); // Import Box70
		leftWingModel[68].setRotationPoint(-64F, -65F, -227.5F);

		leftWingModel[69].addShapeBox(0F, 0F, 0F, 2, 62, 1, 0F,26F, 0F, 0F, -26F, 0F, 0F, -26F, 0F, 0F, 26F, 0F, 0F, 4F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 3F, 0F, 0F); // Import Box71
		leftWingModel[69].setRotationPoint(-64F, -65F, -226.5F);

		leftWingModel[70].addShapeBox(0F, 0F, 0F, 2, 62, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 4F, 0F, 0F); // Import Box72
		leftWingModel[70].setRotationPoint(-90F, -69F, -227.5F);

		leftWingModel[71].addShapeBox(0F, 0F, 0F, 28, 13, 9, 0F,0F, -3F, -3F, 0F, -4F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F); // Import Box162
		leftWingModel[71].setRotationPoint(-101F, -10F, -232.5F);

		leftWingModel[72].addShapeBox(0F, 0F, 0F, 30, 13, 9, 0F,0F, -4F, -3F, -12F, -7F, -6F, 0F, -7F, 0F, 0F, -1F, 0F, 0F, 0F, -0.3F, -11F, 1F, -5F, 0F, 2F, 0F, 0F, 0F, 0F); // Import Box163
		leftWingModel[72].setRotationPoint(-73F, -10F, -232.5F);

		leftWingModel[73].addShapeBox(0F, 0F, 0F, 30, 13, 9, 0F,0F, -1F, 0F, 0F, -7F, 0F, -12F, -7F, -6F, 0F, -4F, -3F, 0F, 0F, 0F, 0F, 2F, 0F, -11F, 1F, -5F, 0F, 0F, -0.3F); // Import Box164
		leftWingModel[73].setRotationPoint(-73F, -10F, -223.5F);

		leftWingModel[74].addShapeBox(0F, 0F, 0F, 28, 13, 9, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -4F, -3F, 0F, -3F, -3F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F); // Import Box165
		leftWingModel[74].setRotationPoint(-101F, -10F, -223.5F);

		leftWingModel[75].addShapeBox(0F, 0F, 0F, 17, 13, 9, 0F,-6F, -3F, -6F, 0F, -3F, -3F, 0F, 0F, 0F, -6F, -1F, 0F, -5F, -5F, -4F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -7F, 0F); // Import Box166
		leftWingModel[75].setRotationPoint(-118F, -10F, -232.5F);

		leftWingModel[76].addShapeBox(0F, 0F, 0F, 17, 13, 9, 0F,-6F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, -6F, -3F, -6F, 0F, -7F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -5F, -5F, -4F); // Import Box167
		leftWingModel[76].setRotationPoint(-118F, -10F, -223.5F);

		leftWingModel[77].addShapeBox(0F, 0F, 0F, 28, 7, 9, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -6F, -3F, 0F, -2F, -5F, 0F, 0F, 0F, 0F, -5F, 0F); // Import Box168
		leftWingModel[77].setRotationPoint(-101F, 1F, -232.5F);

		leftWingModel[78].addShapeBox(0F, 0F, 0F, 28, 7, 9, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -2F, -5F, 0F, -6F, -3F); // Import Box169
		leftWingModel[78].setRotationPoint(-101F, 1F, -223.5F);

		leftWingModel[79].addShapeBox(0F, 0F, 0F, 30, 5, 9, 0F,0F, 0F, 0F, 0F, -2F, 0F, -11F, -1F, -5F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, -3F, 0F, -13F, -1F, -9F, 0F, 0F, -9F); // Import Box170
		leftWingModel[79].setRotationPoint(-73F, 3F, -223.5F);

		leftWingModel[80].addShapeBox(0F, 0F, 0F, 30, 5, 9, 0F,0F, 0F, -0.3F, -11F, -1F, -5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, -13F, -1F, -9F, 0F, -3F, 0F, 0F, 0F, 0F); // Import Box171
		leftWingModel[80].setRotationPoint(-73F, 3F, -232.5F);

		leftWingModel[81].addShapeBox(0F, 0F, 0F, 17, 7, 9, 0F,-5F, -2F, -4F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -8F, -3F, -4F, 0F, -1F, -3F, 0F, 0F, 0F, -7F, -1F, 0F); // Import Box172
		leftWingModel[81].setRotationPoint(-118F, -4F, -232.5F);

		leftWingModel[82].addShapeBox(0F, 0F, 0F, 17, 7, 9, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -5F, -2F, -4F, -7F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, -8F, -3F, -4F); // Import Box173
		leftWingModel[82].setRotationPoint(-118F, -4F, -223.5F);

		leftWingModel[83].addShapeBox(0F, 0F, 0F, 2, 62, 1, 0F,0F, 0F, -31F, 1F, 0F, -31F, 0F, 0F, 31F, 0F, 0F, 31F, 4F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 3F, 0F, 0F); // Box 180
		leftWingModel[83].setRotationPoint(-90F, -69F, -226.5F);

		leftWingModel[84].addShapeBox(0F, 0F, 0F, 2, 62, 1, 0F,0F, 0F, -31F, 0F, 0F, -31F, 1F, 0F, 31F, 0F, 0F, 31F, 3F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 4F, 0F, 0F); // Box 181
		leftWingModel[84].setRotationPoint(-90F, -69F, -227.5F);

		leftWingModel[85].addShapeBox(0F, 0F, 0F, 2, 62, 1, 0F,26F, 0F, -29F, -25F, 0F, -29F, -26F, 0F, 29F, 26F, 0F, 29F, 4F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 3F, 0F, 0F); // Box 182
		leftWingModel[85].setRotationPoint(-64F, -65F, -226.5F);

		leftWingModel[86].addShapeBox(0F, 0F, 0F, 2, 62, 1, 0F,26F, 0F, -29F, -26F, 0F, -29F, -25F, 0F, 29F, 26F, 0F, 29F, 4F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 4F, 0F, 0F); // Box 183
		leftWingModel[86].setRotationPoint(-64F, -65F, -227.5F);

		leftWingModel[87].addShapeBox(0F, 0F, 0F, 2, 62, 1, 0F,-15F, 0F, 0F, 16F, 0F, 0F, 15F, 0F, 0F, -15F, 0F, 0F, 4F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 3F, 0F, 0F); // Box 184
		leftWingModel[87].setRotationPoint(-64F, -65F, -226.5F);

		leftWingModel[88].addShapeBox(0F, 0F, 0F, 2, 62, 1, 0F,26F, 0F, 0F, -26F, 0F, 0F, -26F, 0F, 0F, 26F, 0F, 0F, 3F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 4F, 0F, 0F); // Box 185
		leftWingModel[88].setRotationPoint(-64F, -65F, -227.5F);

		leftWingModel[89].addShapeBox(0F, -13F, -2F, 1, 26, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 782
		leftWingModel[89].setRotationPoint(-152F, -64F, -81F);

		leftWingModel[90].addShapeBox(0F, -13F, -2F, 1, 26, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 783
		leftWingModel[90].setRotationPoint(-152F, -64F, -81F);
		leftWingModel[90].rotateAngleX = 1.57079633F;

		leftWingModel[91].addShapeBox(0F, -13F, -2F, 1, 26, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 784
		leftWingModel[91].setRotationPoint(-152F, -64F, -81F);
		leftWingModel[91].rotateAngleX = 0.78539816F;

		leftWingModel[92].addShapeBox(0F, -13F, -2F, 1, 26, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 785
		leftWingModel[92].setRotationPoint(-152F, -64F, -81F);
		leftWingModel[92].rotateAngleX = -0.78539816F;

		leftWingModel[93].addShapeBox(0F, -13F, -2F, 1, 26, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 342
		leftWingModel[93].setRotationPoint(-140F, -64F, -172F);

		leftWingModel[94].addShapeBox(0F, -13F, -2F, 1, 26, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 343
		leftWingModel[94].setRotationPoint(-140F, -64F, -172F);
		leftWingModel[94].rotateAngleX = -0.78539816F;

		leftWingModel[95].addShapeBox(0F, -13F, -2F, 1, 26, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 344
		leftWingModel[95].setRotationPoint(-140F, -64F, -172F);
		leftWingModel[95].rotateAngleX = 1.57079633F;

		leftWingModel[96].addShapeBox(0F, -13F, -2F, 1, 26, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 345
		leftWingModel[96].setRotationPoint(-140F, -64F, -172F);
		leftWingModel[96].rotateAngleX = 0.78539816F;
	}

	private void initrightWingModel_1()
	{
		rightWingModel[0] = new ModelRendererTurbo(this, 953, 449, textureX, textureY); // Box 219
		rightWingModel[1] = new ModelRendererTurbo(this, 457, 457, textureX, textureY); // Box 220
		rightWingModel[2] = new ModelRendererTurbo(this, 1385, 417, textureX, textureY); // Box 221
		rightWingModel[3] = new ModelRendererTurbo(this, 1537, 465, textureX, textureY); // Box 222
		rightWingModel[4] = new ModelRendererTurbo(this, 1, 473, textureX, textureY); // Box 223
		rightWingModel[5] = new ModelRendererTurbo(this, 1193, 449, textureX, textureY); // Box 225
		rightWingModel[6] = new ModelRendererTurbo(this, 1, 457, textureX, textureY); // Box 226
		rightWingModel[7] = new ModelRendererTurbo(this, 985, 457, textureX, textureY); // Box 227
		rightWingModel[8] = new ModelRendererTurbo(this, 441, 465, textureX, textureY); // Box 228
		rightWingModel[9] = new ModelRendererTurbo(this, 705, 465, textureX, textureY); // Box 229
		rightWingModel[10] = new ModelRendererTurbo(this, 1561, 465, textureX, textureY); // Box 230
		rightWingModel[11] = new ModelRendererTurbo(this, 1809, 465, textureX, textureY); // Box 231
		rightWingModel[12] = new ModelRendererTurbo(this, 1929, 465, textureX, textureY); // Box 232
		rightWingModel[13] = new ModelRendererTurbo(this, 257, 473, textureX, textureY); // Box 233
		rightWingModel[14] = new ModelRendererTurbo(this, 793, 473, textureX, textureY); // Box 234
		rightWingModel[15] = new ModelRendererTurbo(this, 1353, 65, textureX, textureY); // Box 235
		rightWingModel[16] = new ModelRendererTurbo(this, 585, 65, textureX, textureY); // Box 236
		rightWingModel[17] = new ModelRendererTurbo(this, 1153, 65, textureX, textureY); // Box 237
		rightWingModel[18] = new ModelRendererTurbo(this, 1905, 81, textureX, textureY); // Box 238
		rightWingModel[19] = new ModelRendererTurbo(this, 1169, 65, textureX, textureY); // Box 239
		rightWingModel[20] = new ModelRendererTurbo(this, 1185, 65, textureX, textureY); // Box 240
		rightWingModel[21] = new ModelRendererTurbo(this, 409, 113, textureX, textureY); // Box 241
		rightWingModel[22] = new ModelRendererTurbo(this, 1505, 65, textureX, textureY); // Box 242
		rightWingModel[23] = new ModelRendererTurbo(this, 425, 73, textureX, textureY); // Box 243
		rightWingModel[24] = new ModelRendererTurbo(this, 545, 73, textureX, textureY); // Box 244
		rightWingModel[25] = new ModelRendererTurbo(this, 1193, 81, textureX, textureY); // Box 245
		rightWingModel[26] = new ModelRendererTurbo(this, 1321, 81, textureX, textureY); // Box 246
		rightWingModel[27] = new ModelRendererTurbo(this, 1329, 81, textureX, textureY); // Box 247
		rightWingModel[28] = new ModelRendererTurbo(this, 1473, 81, textureX, textureY); // Box 248
		rightWingModel[29] = new ModelRendererTurbo(this, 1065, 97, textureX, textureY); // Box 249
		rightWingModel[30] = new ModelRendererTurbo(this, 81, 89, textureX, textureY); // Box 250
		rightWingModel[31] = new ModelRendererTurbo(this, 497, 113, textureX, textureY); // Box 251
		rightWingModel[32] = new ModelRendererTurbo(this, 769, 121, textureX, textureY); // Box 252
		rightWingModel[33] = new ModelRendererTurbo(this, 1833, 73, textureX, textureY); // Box 253
		rightWingModel[34] = new ModelRendererTurbo(this, 1353, 81, textureX, textureY); // Box 254
		rightWingModel[35] = new ModelRendererTurbo(this, 1497, 81, textureX, textureY); // Box 255
		rightWingModel[36] = new ModelRendererTurbo(this, 345, 481, textureX, textureY); // Box 256
		rightWingModel[37] = new ModelRendererTurbo(this, 881, 481, textureX, textureY); // Box 257
		rightWingModel[38] = new ModelRendererTurbo(this, 1289, 481, textureX, textureY); // Box 258
		rightWingModel[39] = new ModelRendererTurbo(this, 1409, 481, textureX, textureY); // Box 259
		rightWingModel[40] = new ModelRendererTurbo(this, 1193, 489, textureX, textureY); // Box 260
		rightWingModel[41] = new ModelRendererTurbo(this, 705, 497, textureX, textureY); // Box 261
		rightWingModel[42] = new ModelRendererTurbo(this, 977, 497, textureX, textureY); // Box 262
		rightWingModel[43] = new ModelRendererTurbo(this, 1, 505, textureX, textureY); // Box 263
		rightWingModel[44] = new ModelRendererTurbo(this, 441, 505, textureX, textureY); // Box 264
		rightWingModel[45] = new ModelRendererTurbo(this, 1809, 505, textureX, textureY); // Box 265
		rightWingModel[46] = new ModelRendererTurbo(this, 1929, 81, textureX, textureY); // Box 266
		rightWingModel[47] = new ModelRendererTurbo(this, 2001, 81, textureX, textureY); // Box 267
		rightWingModel[48] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 268
		rightWingModel[49] = new ModelRendererTurbo(this, 1601, 121, textureX, textureY); // Box 269
		rightWingModel[50] = new ModelRendererTurbo(this, 121, 89, textureX, textureY); // Box 270
		rightWingModel[51] = new ModelRendererTurbo(this, 1833, 89, textureX, textureY); // Box 271
		rightWingModel[52] = new ModelRendererTurbo(this, 1689, 145, textureX, textureY); // Box 272
		rightWingModel[53] = new ModelRendererTurbo(this, 401, 97, textureX, textureY); // Box 273
		rightWingModel[54] = new ModelRendererTurbo(this, 729, 97, textureX, textureY); // Box 274
		rightWingModel[55] = new ModelRendererTurbo(this, 1089, 97, textureX, textureY); // Box 275
		rightWingModel[56] = new ModelRendererTurbo(this, 1161, 97, textureX, textureY); // Box 276
		rightWingModel[57] = new ModelRendererTurbo(this, 1177, 97, textureX, textureY); // Box 277
		rightWingModel[58] = new ModelRendererTurbo(this, 849, 121, textureX, textureY); // Box 278
		rightWingModel[59] = new ModelRendererTurbo(this, 1993, 137, textureX, textureY); // Box 279
		rightWingModel[60] = new ModelRendererTurbo(this, 929, 145, textureX, textureY); // Box 280
		rightWingModel[61] = new ModelRendererTurbo(this, 1313, 121, textureX, textureY); // Box 281
		rightWingModel[62] = new ModelRendererTurbo(this, 665, 137, textureX, textureY); // Box 282
		rightWingModel[63] = new ModelRendererTurbo(this, 1145, 137, textureX, textureY); // Box 283
		rightWingModel[64] = new ModelRendererTurbo(this, 1441, 113, textureX, textureY); // Box 284
		rightWingModel[65] = new ModelRendererTurbo(this, 1745, 113, textureX, textureY); // Box 285
		rightWingModel[66] = new ModelRendererTurbo(this, 193, 121, textureX, textureY); // Box 286
		rightWingModel[67] = new ModelRendererTurbo(this, 2033, 145, textureX, textureY); // Box 287
		rightWingModel[68] = new ModelRendererTurbo(this, 2041, 145, textureX, textureY); // Box 288
		rightWingModel[69] = new ModelRendererTurbo(this, 305, 185, textureX, textureY); // Box 289
		rightWingModel[70] = new ModelRendererTurbo(this, 561, 185, textureX, textureY); // Box 290
		rightWingModel[71] = new ModelRendererTurbo(this, 1921, 305, textureX, textureY); // Box 291
		rightWingModel[72] = new ModelRendererTurbo(this, 593, 321, textureX, textureY); // Box 292
		rightWingModel[73] = new ModelRendererTurbo(this, 673, 321, textureX, textureY); // Box 293
		rightWingModel[74] = new ModelRendererTurbo(this, 761, 393, textureX, textureY); // Box 294
		rightWingModel[75] = new ModelRendererTurbo(this, 257, 257, textureX, textureY); // Box 295
		rightWingModel[76] = new ModelRendererTurbo(this, 1185, 345, textureX, textureY); // Box 296
		rightWingModel[77] = new ModelRendererTurbo(this, 1449, 305, textureX, textureY); // Box 297
		rightWingModel[78] = new ModelRendererTurbo(this, 129, 321, textureX, textureY); // Box 298
		rightWingModel[79] = new ModelRendererTurbo(this, 1073, 217, textureX, textureY); // Box 299
		rightWingModel[80] = new ModelRendererTurbo(this, 209, 321, textureX, textureY); // Box 300
		rightWingModel[81] = new ModelRendererTurbo(this, 1849, 313, textureX, textureY); // Box 301
		rightWingModel[82] = new ModelRendererTurbo(this, 409, 321, textureX, textureY); // Box 302
		rightWingModel[83] = new ModelRendererTurbo(this, 1937, 201, textureX, textureY); // Box 303
		rightWingModel[84] = new ModelRendererTurbo(this, 1945, 201, textureX, textureY); // Box 304
		rightWingModel[85] = new ModelRendererTurbo(this, 1953, 201, textureX, textureY); // Box 305
		rightWingModel[86] = new ModelRendererTurbo(this, 1961, 201, textureX, textureY); // Box 306
		rightWingModel[87] = new ModelRendererTurbo(this, 545, 209, textureX, textureY); // Box 307
		rightWingModel[88] = new ModelRendererTurbo(this, 553, 209, textureX, textureY); // Box 308
		rightWingModel[89] = new ModelRendererTurbo(this, 1729, 209, textureX, textureY); // Box 334
		rightWingModel[90] = new ModelRendererTurbo(this, 1745, 209, textureX, textureY); // Box 335
		rightWingModel[91] = new ModelRendererTurbo(this, 2033, 209, textureX, textureY); // Box 336
		rightWingModel[92] = new ModelRendererTurbo(this, 97, 225, textureX, textureY); // Box 337
		rightWingModel[93] = new ModelRendererTurbo(this, 1073, 233, textureX, textureY); // Box 338
		rightWingModel[94] = new ModelRendererTurbo(this, 1089, 233, textureX, textureY); // Box 339
		rightWingModel[95] = new ModelRendererTurbo(this, 1241, 233, textureX, textureY); // Box 340
		rightWingModel[96] = new ModelRendererTurbo(this, 1257, 233, textureX, textureY); // Box 341

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 40, 19, 158, 0F,14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 14F, 6F, 0F, 0F, 6F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 219
		rightWingModel[0].setRotationPoint(-102F, -72F, 15F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 44, 19, 158, 0F,14F, 0F, 0F, 0F, -23F, 0F, -14F, -15F, 0F, 14F, 0F, 0F, 14F, 6F, 0F, 0F, 6F, 0F, -14F, -3F, 0F, 14F, -3F, 0F); // Box 220
		rightWingModel[1].setRotationPoint(-48F, -72F, 15F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 8, 19, 158, 0F,22F, -8F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 22F, -2F, 0F, -14F, 6F, 0F, 0F, -3F, 0F, 0F, -9F, 0F); // Box 221
		rightWingModel[2].setRotationPoint(-110F, -72F, 15F);

		rightWingModel[3].addShapeBox(0F, 0F, 0F, 40, 16, 185, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -29F, -3F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, -29F, -10F, -4F); // Box 222
		rightWingModel[3].setRotationPoint(-102F, -72F, 173F);

		rightWingModel[4].addShapeBox(0F, 0F, 0F, 37, 16, 181, 0F,0F, -6F, 0F, -29F, 0F, 0F, 0F, -3F, 0F, -29F, -3F, -4F, 0F, -6F, 0F, -29F, 0F, 0F, 0F, -10F, 0F, -29F, -10F, -4F); // Box 223
		rightWingModel[4].setRotationPoint(-110F, -72F, 173F);

		rightWingModel[5].addShapeBox(0F, 0F, 0F, 30, 5, 30, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		rightWingModel[5].setRotationPoint(-151F, -74F, 66F);

		rightWingModel[6].addShapeBox(0F, 0F, 0F, 30, 10, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
		rightWingModel[6].setRotationPoint(-151F, -69F, 66F);

		rightWingModel[7].addShapeBox(0F, 0F, 0F, 30, 5, 26, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 227
		rightWingModel[7].setRotationPoint(-151F, -79F, 68F);

		rightWingModel[8].addShapeBox(0F, 0F, 0F, 30, 5, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 228
		rightWingModel[8].setRotationPoint(-151F, -59F, 66F);

		rightWingModel[9].addShapeBox(0F, 0F, 0F, 30, 5, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F); // Box 229
		rightWingModel[9].setRotationPoint(-151F, -54F, 68F);

		rightWingModel[10].addShapeBox(0F, 0F, 0F, 26, 10, 30, 0F,0F, 0F, 0F, 0F, -4F, -14F, 0F, -4F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -14F, 0F, -4F, -14F, 0F, 0F, 0F); // Box 230
		rightWingModel[10].setRotationPoint(-121F, -69F, 66F);

		rightWingModel[11].addShapeBox(0F, 0F, 0F, 26, 5, 30, 0F,0F, 0F, -1.9999F, 0F, -8.9999F, -13.9999F, 0F, -8.9999F, -13.9999F, 0F, 0F, -1.9999F, 0F, 0F, 0F, 0F, 3.9999F, -13.9999F, 0F, 3.9999F, -13.9999F, 0F, 0F, 0F); // Box 231
		rightWingModel[11].setRotationPoint(-121F, -74F, 66F);

		rightWingModel[12].addShapeBox(0F, 0F, 0F, 26, 5, 30, 0F,0F, 4.9999F, -7.9999F, 0F, -8.9999F, -13.9999F, 0F, -8.9999F, -13.9999F, 0F, 4.9999F, -7.9999F, 0F, -4.9999F, -1.9999F, 0F, 3.9999F, -13.9999F, 0F, 3.9999F, -13.9999F, 0F, -4.9999F, -1.9999F); // Box 232
		rightWingModel[12].setRotationPoint(-121F, -74F, 66F);

		rightWingModel[13].addShapeBox(0F, 0F, 0F, 26, 5, 30, 0F,0F, 0F, 0F, 0F, 3.9999F, -13.9999F, 0F, 3.9999F, -13.9999F, 0F, 0F, 0F, 0F, 0F, -1.9999F, 0F, -8.9999F, -13.9999F, 0F, -8.9999F, -13.9999F, 0F, 0F, -1.9999F); // Box 233
		rightWingModel[13].setRotationPoint(-121F, -59F, 66F);

		rightWingModel[14].addShapeBox(0F, 0F, 0F, 26, 5, 30, 0F,0F, -4.9999F, -1.9999F, 0F, 3.9999F, -13.9999F, 0F, 3.9999F, -13.9999F, 0F, -4.9999F, -1.9999F, 0F, 4.9999F, -7.9999F, 0F, -8.9999F, -13.9999F, 0F, -8.9999F, -13.9999F, 0F, 4.9999F, -7.9999F); // Box 234
		rightWingModel[14].setRotationPoint(-121F, -59F, 66F);

		rightWingModel[15].addShapeBox(0F, 0F, 0F, 4, 10, 3, 0F,0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 235
		rightWingModel[15].setRotationPoint(-155F, -69F, 93F);

		rightWingModel[16].addShapeBox(0F, 0F, 0F, 4, 5, 3, 0F,0F, -1F, 3F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, -1F, -3F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F); // Box 236
		rightWingModel[16].setRotationPoint(-155F, -74F, 93F);

		rightWingModel[17].addShapeBox(0F, 0F, 0F, 4, 5, 3, 0F,0F, -1F, 5F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, -1F, -5F, 0F, 1F, -1F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 1F, 1F); // Box 237
		rightWingModel[17].setRotationPoint(-155F, -79F, 89F);

		rightWingModel[18].addShapeBox(0F, 0F, 0F, 4, 3, 14, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F); // Box 238
		rightWingModel[18].setRotationPoint(-155F, -79F, 74F);

		rightWingModel[19].addShapeBox(0F, 0F, 0F, 4, 5, 3, 0F,0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, -1F, 3F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, -1F, -3F); // Box 239
		rightWingModel[19].setRotationPoint(-155F, -59F, 93F);

		rightWingModel[20].addShapeBox(0F, 0F, 0F, 4, 5, 3, 0F,0F, 1F, -1F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 1F, 1F, 0F, -1F, 5F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, -1F, -5F); // Box 240
		rightWingModel[20].setRotationPoint(-155F, -54F, 89F);

		rightWingModel[21].addShapeBox(0F, 0F, 0F, 4, 3, 14, 0F,0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 241
		rightWingModel[21].setRotationPoint(-155F, -52F, 74F);

		rightWingModel[22].addShapeBox(0F, 0F, 0F, 4, 10, 3, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F); // Box 242
		rightWingModel[22].setRotationPoint(-155F, -69F, 66F);

		rightWingModel[23].addShapeBox(0F, 0F, 0F, 4, 5, 3, 0F,0F, -1F, -3F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, -1F, 3F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F); // Box 243
		rightWingModel[23].setRotationPoint(-155F, -74F, 66F);

		rightWingModel[24].addShapeBox(0F, 0F, 0F, 4, 5, 3, 0F,0F, -1F, -5F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, -1F, 5F, 0F, 1F, 1F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 1F, -1F); // Box 244
		rightWingModel[24].setRotationPoint(-155F, -79F, 70F);

		rightWingModel[25].addShapeBox(0F, 0F, 0F, 4, 5, 3, 0F,0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, -1F, -3F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, -1F, 3F); // Box 245
		rightWingModel[25].setRotationPoint(-155F, -59F, 66F);

		rightWingModel[26].addShapeBox(0F, 0F, 0F, 4, 5, 3, 0F,0F, 1F, 1F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 1F, -1F, 0F, -1F, -5F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, -1F, 5F); // Box 246
		rightWingModel[26].setRotationPoint(-155F, -54F, 70F);

		rightWingModel[27].addShapeBox(0F, 0F, 0F, 6, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		rightWingModel[27].setRotationPoint(-155F, -65.5F, 76.5F);

		rightWingModel[28].addShapeBox(0F, 0F, 0F, 6, 3, 9, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		rightWingModel[28].setRotationPoint(-155F, -68.5F, 76.5F);

		rightWingModel[29].addShapeBox(0F, 0F, 0F, 6, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 249
		rightWingModel[29].setRotationPoint(-155F, -62.5F, 76.5F);

		rightWingModel[30].addShapeBox(0F, 0F, 0F, 10, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 250
		rightWingModel[30].setRotationPoint(-165F, -65F, 78F);

		rightWingModel[31].addShapeBox(0F, 0F, 0F, 10, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 251
		rightWingModel[31].setRotationPoint(-165F, -67F, 78F);

		rightWingModel[32].addShapeBox(0F, 0F, 0F, 10, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 252
		rightWingModel[32].setRotationPoint(-165F, -63F, 78F);

		rightWingModel[33].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 253
		rightWingModel[33].setRotationPoint(-168F, -65F, 78F);

		rightWingModel[34].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, -1.9999F, -1.9999F, 0F, 0F, -1.9999F, 0F, 0F, -1.9999F, 0F, -1.9999F, -1.9999F, 0F, 0F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9999F); // Box 254
		rightWingModel[34].setRotationPoint(-168F, -67F, 78F);

		rightWingModel[35].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, 0F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9999F, 0F, -1.9999F, -1.9999F, 0F, 0F, -1.9999F, 0F, 0F, -1.9999F, 0F, -1.9999F, -1.9999F); // Box 255
		rightWingModel[35].setRotationPoint(-168F, -63F, 78F);

		rightWingModel[36].addShapeBox(0F, 0F, 0F, 30, 5, 30, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 256
		rightWingModel[36].setRotationPoint(-139F, -74F, 157F);

		rightWingModel[37].addShapeBox(0F, 0F, 0F, 30, 10, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 257
		rightWingModel[37].setRotationPoint(-139F, -69F, 157F);

		rightWingModel[38].addShapeBox(0F, 0F, 0F, 30, 5, 26, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 258
		rightWingModel[38].setRotationPoint(-139F, -79F, 159F);

		rightWingModel[39].addShapeBox(0F, 0F, 0F, 30, 5, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 259
		rightWingModel[39].setRotationPoint(-139F, -59F, 157F);

		rightWingModel[40].addShapeBox(0F, 0F, 0F, 30, 5, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F); // Box 260
		rightWingModel[40].setRotationPoint(-139F, -54F, 159F);

		rightWingModel[41].addShapeBox(0F, 0F, 0F, 26, 10, 30, 0F,0F, 0F, 0F, 0F, -4F, -14F, 0F, -4F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -14F, 0F, -4F, -14F, 0F, 0F, 0F); // Box 261
		rightWingModel[41].setRotationPoint(-109F, -69F, 157F);

		rightWingModel[42].addShapeBox(0F, 0F, 0F, 26, 5, 30, 0F,0F, 0F, -1.9999F, 0F, -8.9999F, -13.9999F, 0F, -8.9999F, -13.9999F, 0F, 0F, -1.9999F, 0F, 0F, 0F, 0F, 3.9999F, -13.9999F, 0F, 3.9999F, -13.9999F, 0F, 0F, 0F); // Box 262
		rightWingModel[42].setRotationPoint(-109F, -74F, 157F);

		rightWingModel[43].addShapeBox(0F, 0F, 0F, 26, 5, 30, 0F,0F, 4.9999F, -7.9999F, 0F, -8.9999F, -13.9999F, 0F, -8.9999F, -13.9999F, 0F, 4.9999F, -7.9999F, 0F, -4.9999F, -1.9999F, 0F, 3.9999F, -13.9999F, 0F, 3.9999F, -13.9999F, 0F, -4.9999F, -1.9999F); // Box 263
		rightWingModel[43].setRotationPoint(-109F, -74F, 157F);

		rightWingModel[44].addShapeBox(0F, 0F, 0F, 26, 5, 30, 0F,0F, 0F, 0F, 0F, 3.9999F, -13.9999F, 0F, 3.9999F, -13.9999F, 0F, 0F, 0F, 0F, 0F, -1.9999F, 0F, -8.9999F, -13.9999F, 0F, -8.9999F, -13.9999F, 0F, 0F, -1.9999F); // Box 264
		rightWingModel[44].setRotationPoint(-109F, -59F, 157F);

		rightWingModel[45].addShapeBox(0F, 0F, 0F, 26, 5, 30, 0F,0F, -4.9999F, -1.9999F, 0F, 3.9999F, -13.9999F, 0F, 3.9999F, -13.9999F, 0F, -4.9999F, -1.9999F, 0F, 4.9999F, -7.9999F, 0F, -8.9999F, -13.9999F, 0F, -8.9999F, -13.9999F, 0F, 4.9999F, -7.9999F); // Box 265
		rightWingModel[45].setRotationPoint(-109F, -59F, 157F);

		rightWingModel[46].addShapeBox(0F, 0F, 0F, 4, 10, 3, 0F,0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 266
		rightWingModel[46].setRotationPoint(-143F, -69F, 184F);

		rightWingModel[47].addShapeBox(0F, 0F, 0F, 4, 5, 3, 0F,0F, -1F, 3F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, -1F, -3F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F); // Box 267
		rightWingModel[47].setRotationPoint(-143F, -74F, 184F);

		rightWingModel[48].addShapeBox(0F, 0F, 0F, 4, 5, 3, 0F,0F, -1F, 5F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, -1F, -5F, 0F, 1F, -1F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 1F, 1F); // Box 268
		rightWingModel[48].setRotationPoint(-143F, -79F, 180F);

		rightWingModel[49].addShapeBox(0F, 0F, 0F, 4, 3, 14, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F); // Box 269
		rightWingModel[49].setRotationPoint(-143F, -79F, 165F);

		rightWingModel[50].addShapeBox(0F, 0F, 0F, 4, 5, 3, 0F,0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, -1F, 3F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, -1F, -3F); // Box 270
		rightWingModel[50].setRotationPoint(-143F, -59F, 184F);

		rightWingModel[51].addShapeBox(0F, 0F, 0F, 4, 5, 3, 0F,0F, 1F, -1F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 1F, 1F, 0F, -1F, 5F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, -1F, -5F); // Box 271
		rightWingModel[51].setRotationPoint(-143F, -54F, 180F);

		rightWingModel[52].addShapeBox(0F, 0F, 0F, 4, 3, 14, 0F,0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 272
		rightWingModel[52].setRotationPoint(-143F, -52F, 165F);

		rightWingModel[53].addShapeBox(0F, 0F, 0F, 4, 10, 3, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F); // Box 273
		rightWingModel[53].setRotationPoint(-143F, -69F, 157F);

		rightWingModel[54].addShapeBox(0F, 0F, 0F, 4, 5, 3, 0F,0F, -1F, -3F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, -1F, 3F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F); // Box 274
		rightWingModel[54].setRotationPoint(-143F, -74F, 157F);

		rightWingModel[55].addShapeBox(0F, 0F, 0F, 4, 5, 3, 0F,0F, -1F, -5F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, -1F, 5F, 0F, 1F, 1F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 1F, -1F); // Box 275
		rightWingModel[55].setRotationPoint(-143F, -79F, 161F);

		rightWingModel[56].addShapeBox(0F, 0F, 0F, 4, 5, 3, 0F,0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, -1F, -3F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, -1F, 3F); // Box 276
		rightWingModel[56].setRotationPoint(-143F, -59F, 157F);

		rightWingModel[57].addShapeBox(0F, 0F, 0F, 4, 5, 3, 0F,0F, 1F, 1F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 1F, -1F, 0F, -1F, -5F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, -1F, 5F); // Box 277
		rightWingModel[57].setRotationPoint(-143F, -54F, 161F);

		rightWingModel[58].addShapeBox(0F, 0F, 0F, 6, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
		rightWingModel[58].setRotationPoint(-143F, -65.5F, 167.5F);

		rightWingModel[59].addShapeBox(0F, 0F, 0F, 6, 3, 9, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 279
		rightWingModel[59].setRotationPoint(-143F, -68.5F, 167.5F);

		rightWingModel[60].addShapeBox(0F, 0F, 0F, 6, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 280
		rightWingModel[60].setRotationPoint(-143F, -62.5F, 167.5F);

		rightWingModel[61].addShapeBox(0F, 0F, 0F, 10, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		rightWingModel[61].setRotationPoint(-153F, -65F, 169F);

		rightWingModel[62].addShapeBox(0F, 0F, 0F, 10, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 282
		rightWingModel[62].setRotationPoint(-153F, -67F, 169F);

		rightWingModel[63].addShapeBox(0F, 0F, 0F, 10, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 283
		rightWingModel[63].setRotationPoint(-153F, -63F, 169F);

		rightWingModel[64].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 284
		rightWingModel[64].setRotationPoint(-156F, -65F, 169F);

		rightWingModel[65].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, -1.9999F, -1.9999F, 0F, 0F, -1.9999F, 0F, 0F, -1.9999F, 0F, -1.9999F, -1.9999F, 0F, 0F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9999F); // Box 285
		rightWingModel[65].setRotationPoint(-156F, -67F, 169F);

		rightWingModel[66].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, 0F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9999F, 0F, -1.9999F, -1.9999F, 0F, 0F, -1.9999F, 0F, 0F, -1.9999F, 0F, -1.9999F, -1.9999F); // Box 286
		rightWingModel[66].setRotationPoint(-156F, -63F, 169F);

		rightWingModel[67].addShapeBox(0F, 0F, 0F, 2, 62, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 4F, 0F, 0F); // Box 287
		rightWingModel[67].setRotationPoint(-90F, -69F, 225.5F);

		rightWingModel[68].addShapeBox(0F, 0F, 0F, 2, 62, 1, 0F,-15F, 0F, 0F, 16F, 0F, 0F, 15F, 0F, 0F, -15F, 0F, 0F, 4F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 3F, 0F, 0F); // Box 288
		rightWingModel[68].setRotationPoint(-64F, -65F, 226.5F);

		rightWingModel[69].addShapeBox(0F, 0F, 0F, 2, 62, 1, 0F,26F, 0F, 0F, -26F, 0F, 0F, -26F, 0F, 0F, 26F, 0F, 0F, 3F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 4F, 0F, 0F); // Box 289
		rightWingModel[69].setRotationPoint(-64F, -65F, 225.5F);

		rightWingModel[70].addShapeBox(0F, 0F, 0F, 2, 62, 1, 0F,0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 3F, 0F, 0F); // Box 290
		rightWingModel[70].setRotationPoint(-90F, -69F, 226.5F);

		rightWingModel[71].addShapeBox(0F, 0F, 0F, 28, 13, 9, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -4F, -3F, 0F, -3F, -3F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F); // Box 291
		rightWingModel[71].setRotationPoint(-101F, -10F, 223.5F);

		rightWingModel[72].addShapeBox(0F, 0F, 0F, 30, 13, 9, 0F,0F, -1F, 0F, 0F, -7F, 0F, -12F, -7F, -6F, 0F, -4F, -3F, 0F, 0F, 0F, 0F, 2F, 0F, -11F, 1F, -5F, 0F, 0F, -0.3F); // Box 292
		rightWingModel[72].setRotationPoint(-73F, -10F, 223.5F);

		rightWingModel[73].addShapeBox(0F, 0F, 0F, 30, 13, 9, 0F,0F, -4F, -3F, -12F, -7F, -6F, 0F, -7F, 0F, 0F, -1F, 0F, 0F, 0F, -0.3F, -11F, 1F, -5F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 293
		rightWingModel[73].setRotationPoint(-73F, -10F, 214.5F);

		rightWingModel[74].addShapeBox(0F, 0F, 0F, 28, 13, 9, 0F,0F, -3F, -3F, 0F, -4F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F); // Box 294
		rightWingModel[74].setRotationPoint(-101F, -10F, 214.5F);

		rightWingModel[75].addShapeBox(0F, 0F, 0F, 17, 13, 9, 0F,-6F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, -6F, -3F, -6F, 0F, -7F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -5F, -5F, -4F); // Box 295
		rightWingModel[75].setRotationPoint(-118F, -10F, 223.5F);

		rightWingModel[76].addShapeBox(0F, 0F, 0F, 17, 13, 9, 0F,-6F, -3F, -6F, 0F, -3F, -3F, 0F, 0F, 0F, -6F, -1F, 0F, -5F, -5F, -4F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -7F, 0F); // Box 296
		rightWingModel[76].setRotationPoint(-118F, -10F, 214.5F);

		rightWingModel[77].addShapeBox(0F, 0F, 0F, 28, 7, 9, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -2F, -5F, 0F, -6F, -3F); // Box 297
		rightWingModel[77].setRotationPoint(-101F, 1F, 223.5F);

		rightWingModel[78].addShapeBox(0F, 0F, 0F, 28, 7, 9, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -6F, -3F, 0F, -2F, -5F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 298
		rightWingModel[78].setRotationPoint(-101F, 1F, 214.5F);

		rightWingModel[79].addShapeBox(0F, 0F, 0F, 30, 5, 9, 0F,0F, 0F, -0.3F, -11F, -1F, -5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, -13F, -1F, -9F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 299
		rightWingModel[79].setRotationPoint(-73F, 3F, 214.5F);

		rightWingModel[80].addShapeBox(0F, 0F, 0F, 30, 5, 9, 0F,0F, 0F, 0F, 0F, -2F, 0F, -11F, -1F, -5F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, -3F, 0F, -13F, -1F, -9F, 0F, 0F, -9F); // Box 300
		rightWingModel[80].setRotationPoint(-73F, 3F, 223.5F);

		rightWingModel[81].addShapeBox(0F, 0F, 0F, 17, 7, 9, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -5F, -2F, -4F, -7F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, -8F, -3F, -4F); // Box 301
		rightWingModel[81].setRotationPoint(-118F, -4F, 223.5F);

		rightWingModel[82].addShapeBox(0F, 0F, 0F, 17, 7, 9, 0F,-5F, -2F, -4F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -8F, -3F, -4F, 0F, -1F, -3F, 0F, 0F, 0F, -7F, -1F, 0F); // Box 302
		rightWingModel[82].setRotationPoint(-118F, -4F, 214.5F);

		rightWingModel[83].addShapeBox(0F, 0F, 0F, 2, 62, 1, 0F,0F, 0F, 31F, 0F, 0F, 31F, 1F, 0F, -31F, 0F, 0F, -31F, 3F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 4F, 0F, 0F); // Box 303
		rightWingModel[83].setRotationPoint(-90F, -69F, 225.5F);

		rightWingModel[84].addShapeBox(0F, 0F, 0F, 2, 62, 1, 0F,0F, 0F, 31F, 1F, 0F, 31F, 0F, 0F, -31F, 0F, 0F, -31F, 4F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 3F, 0F, 0F); // Box 304
		rightWingModel[84].setRotationPoint(-90F, -69F, 226.5F);

		rightWingModel[85].addShapeBox(0F, 0F, 0F, 2, 62, 1, 0F,26F, 0F, 29F, -26F, 0F, 29F, -25F, 0F, -29F, 26F, 0F, -29F, 3F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 4F, 0F, 0F); // Box 305
		rightWingModel[85].setRotationPoint(-64F, -65F, 225.5F);

		rightWingModel[86].addShapeBox(0F, 0F, 0F, 2, 62, 1, 0F,26F, 0F, 29F, -25F, 0F, 29F, -26F, 0F, -29F, 26F, 0F, -29F, 4F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 4F, 0F, 0F); // Box 306
		rightWingModel[86].setRotationPoint(-64F, -65F, 226.5F);

		rightWingModel[87].addShapeBox(0F, 0F, 0F, 2, 62, 1, 0F,-15F, 0F, 0F, 15F, 0F, 0F, 16F, 0F, 0F, -15F, 0F, 0F, 3F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 4F, 0F, 0F); // Box 307
		rightWingModel[87].setRotationPoint(-64F, -65F, 225.5F);

		rightWingModel[88].addShapeBox(0F, 0F, 0F, 2, 62, 1, 0F,26F, 0F, 0F, -26F, 0F, 0F, -26F, 0F, 0F, 26F, 0F, 0F, 4F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 3F, 0F, 0F); // Box 308
		rightWingModel[88].setRotationPoint(-64F, -65F, 226.5F);

		rightWingModel[89].addShapeBox(0F, -13F, -2F, 1, 26, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 334
		rightWingModel[89].setRotationPoint(-152F, -64F, 81F);

		rightWingModel[90].addShapeBox(0F, -13F, -2F, 1, 26, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 335
		rightWingModel[90].setRotationPoint(-152F, -64F, 81F);
		rightWingModel[90].rotateAngleX = -0.78539816F;

		rightWingModel[91].addShapeBox(0F, -13F, -2F, 1, 26, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 336
		rightWingModel[91].setRotationPoint(-152F, -64F, 81F);
		rightWingModel[91].rotateAngleX = 1.57079633F;

		rightWingModel[92].addShapeBox(0F, -13F, -2F, 1, 26, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 337
		rightWingModel[92].setRotationPoint(-152F, -64F, 81F);
		rightWingModel[92].rotateAngleX = 0.78539816F;

		rightWingModel[93].addShapeBox(0F, -13F, -2F, 1, 26, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 338
		rightWingModel[93].setRotationPoint(-140F, -64F, 172F);

		rightWingModel[94].addShapeBox(0F, -13F, -2F, 1, 26, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 339
		rightWingModel[94].setRotationPoint(-140F, -64F, 172F);
		rightWingModel[94].rotateAngleX = -0.78539816F;

		rightWingModel[95].addShapeBox(0F, -13F, -2F, 1, 26, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 340
		rightWingModel[95].setRotationPoint(-140F, -64F, 172F);
		rightWingModel[95].rotateAngleX = 1.57079633F;

		rightWingModel[96].addShapeBox(0F, -13F, -2F, 1, 26, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 341
		rightWingModel[96].setRotationPoint(-140F, -64F, 172F);
		rightWingModel[96].rotateAngleX = 0.78539816F;
	}

	private void inityawFlapModel_1()
	{
		yawFlapModel[0] = new ModelRendererTurbo(this, 1969, 161, textureX, textureY); // Box 149
		yawFlapModel[1] = new ModelRendererTurbo(this, 257, 513, textureX, textureY); // Box 314

		yawFlapModel[0].addShapeBox(0F, 0F, -3F, 27, 106, 3, 0F,0F, 0F, 0F, -12F, -7F, -2F, -12F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		yawFlapModel[0].setRotationPoint(209F, -172F, 0F);

		yawFlapModel[1].addShapeBox(0F, 0F, 0F, 27, 106, 3, 0F,0F, 0F, 0F, -12F, -7F, 0F, -12F, -7F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 314
		yawFlapModel[1].setRotationPoint(209F, -172F, 0F);
	}

	private void initpitchFlapLeftModel_1()
	{
		pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 777, 313, textureX, textureY); // Box 146

		pitchFlapLeftModel[0].addShapeBox(0F, 0F, 0F, 23, 5, 104, 0F,0F, -2F, 0F, -11F, -2F, -11F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -11F, -2F, -11F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 146
		pitchFlapLeftModel[0].setRotationPoint(205F, -61F, -115F);
	}

	private void initpitchFlapRightModel_1()
	{
		pitchFlapRightModel[0] = new ModelRendererTurbo(this, 889, 633, textureX, textureY); // Box 311

		pitchFlapRightModel[0].addShapeBox(0F, 0F, 0F, 23, 5, 104, 0F,0F, 0F, 0F, 0F, -2F, 0F, -11F, -2F, -11F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -11F, -2F, -11F, 0F, -2F, 0F); // Box 311
		pitchFlapRightModel[0].setRotationPoint(205F, -61F, 11F);
	}

	private void initpitchFlapLeftWingModel_1()
	{
		pitchFlapLeftWingModel[0] = new ModelRendererTurbo(this, 129, 153, textureX, textureY); // Box 59

		pitchFlapLeftWingModel[0].addShapeBox(0F, 0F, 0F, 44, 16, 185, 0F,0F, -3F, 0F, -20F, -7F, -15F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, -20F, -7F, -15F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		pitchFlapLeftWingModel[0].setRotationPoint(-62F, -72F, -358F);
	}

	private void initpitchFlapRightWingModel_1()
	{
		pitchFlapRightWingModel[0] = new ModelRendererTurbo(this, 1169, 601, textureX, textureY); // Box 224

		pitchFlapRightWingModel[0].addShapeBox(0F, 0F, 0F, 44, 16, 185, 0F,0F, 0F, 0F, 0F, -15F, 0F, -20F, -7F, -15F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, -7F, -15F, 0F, -10F, 0F); // Box 224
		pitchFlapRightWingModel[0].setRotationPoint(-62F, -72F, 173F);
	}

	private void initPropeller()
	{
		propellerModels = new ModelRendererTurbo[4][3];
		propellerModels[0] = makeProp1(-158F, -64F, -81F);
		propellerModels[1] = makeProp2(-146F, -64F, -172F);
		propellerModels[2] = makeProp3(-158F, -64F, 81F);
		propellerModels[3] = makeProp4(-146F, -64F, 172F);
	}

	private ModelRendererTurbo[] makeProp1(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[3];
		prop[0] = new ModelRendererTurbo(this, 0, 545, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 545, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 0, 545, textureX, textureY);
		prop[0].addBox(-1F, -37F, -2.5F, 2, 37, 5, 0.0F);
		prop[1].addBox(-1F, -37F, -2.5F, 2, 37, 5, 0.0F);
		prop[2].addBox(-1F, -37F, -2.5F, 2, 37, 5, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		return prop;
	}

	private ModelRendererTurbo[] makeProp2(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[3];
		prop[0] = new ModelRendererTurbo(this, 0, 545, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 545, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 0, 545, textureX, textureY);
		prop[0].addBox(-1F, -37F, -2.5F, 2, 37, 5, 0.0F);
		prop[1].addBox(-1F, -37F, -2.5F, 2, 37, 5, 0.0F);
		prop[2].addBox(-1F, -37F, -2.5F, 2, 37, 5, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		return prop;
	}

	private ModelRendererTurbo[] makeProp3(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[3];
		prop[0] = new ModelRendererTurbo(this, 0, 545, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 545, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 0, 545, textureX, textureY);
		prop[0].addBox(-1F, -37F, -2.5F, 2, 37, 5, 0.0F);
		prop[1].addBox(-1F, -37F, -2.5F, 2, 37, 5, 0.0F);
		prop[2].addBox(-1F, -37F, -2.5F, 2, 37, 5, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		return prop;
	}

	private ModelRendererTurbo[] makeProp4(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[3];
		prop[0] = new ModelRendererTurbo(this, 0, 545, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 545, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 0, 545, textureX, textureY);
		prop[0].addBox(-1F, -37F, -2.5F, 2, 37, 5, 0.0F);
		prop[1].addBox(-1F, -37F, -2.5F, 2, 37, 5, 0.0F);
		prop[2].addBox(-1F, -37F, -2.5F, 2, 37, 5, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		return prop;
	}

	private void initGuns() {
	}
	{

		// Passenger 3
		ModelRendererTurbo[][] gun_2_Model = new ModelRendererTurbo[3][];

		gun_2_Model[0] = new ModelRendererTurbo[64];
		gun_2_Model[0][0] = new ModelRendererTurbo(this, 18, 961, textureX, textureY); // Box 0
		gun_2_Model[0][1] = new ModelRendererTurbo(this, 66, 961, textureX, textureY); // Box 3
		gun_2_Model[0][2] = new ModelRendererTurbo(this, 74, 961, textureX, textureY); // Box 4
		gun_2_Model[0][3] = new ModelRendererTurbo(this, 106, 961, textureX, textureY); // Box 7
		gun_2_Model[0][4] = new ModelRendererTurbo(this, 114, 961, textureX, textureY); // Box 8
		gun_2_Model[0][5] = new ModelRendererTurbo(this, 122, 961, textureX, textureY); // Box 13
		gun_2_Model[0][6] = new ModelRendererTurbo(this, 146, 961, textureX, textureY); // Box 14
		gun_2_Model[0][7] = new ModelRendererTurbo(this, 170, 961, textureX, textureY); // Box 15
		gun_2_Model[0][8] = new ModelRendererTurbo(this, 194, 961, textureX, textureY); // Box 16
		gun_2_Model[0][9] = new ModelRendererTurbo(this, 226, 961, textureX, textureY); // Box 17
		gun_2_Model[0][10] = new ModelRendererTurbo(this, 250, 961, textureX, textureY); // Box 18
		gun_2_Model[0][11] = new ModelRendererTurbo(this, 274, 961, textureX, textureY); // Box 19
		gun_2_Model[0][12] = new ModelRendererTurbo(this, 298, 961, textureX, textureY); // Box 20
		gun_2_Model[0][13] = new ModelRendererTurbo(this, 314, 961, textureX, textureY); // Box 21
		gun_2_Model[0][14] = new ModelRendererTurbo(this, 338, 961, textureX, textureY); // Box 22
		gun_2_Model[0][15] = new ModelRendererTurbo(this, 234, 961, textureX, textureY); // Box 23
		gun_2_Model[0][16] = new ModelRendererTurbo(this, 258, 961, textureX, textureY); // Box 24
		gun_2_Model[0][17] = new ModelRendererTurbo(this, 18, 961, textureX, textureY); // Box 30
		gun_2_Model[0][18] = new ModelRendererTurbo(this, 50, 961, textureX, textureY); // Box 31
		gun_2_Model[0][19] = new ModelRendererTurbo(this, 58, 961, textureX, textureY); // Box 32
		gun_2_Model[0][20] = new ModelRendererTurbo(this, 122, 961, textureX, textureY); // Box 33
		gun_2_Model[0][21] = new ModelRendererTurbo(this, 482, 961, textureX, textureY); // Box 34
		gun_2_Model[0][22] = new ModelRendererTurbo(this, 290, 961, textureX, textureY); // Box 35
		gun_2_Model[0][23] = new ModelRendererTurbo(this, 490, 961, textureX, textureY); // Box 36
		gun_2_Model[0][24] = new ModelRendererTurbo(this, 498, 961, textureX, textureY); // Box 37
		gun_2_Model[0][25] = new ModelRendererTurbo(this, 506, 961, textureX, textureY); // Box 39
		gun_2_Model[0][26] = new ModelRendererTurbo(this, 594, 961, textureX, textureY); // Box 46
		gun_2_Model[0][27] = new ModelRendererTurbo(this, 610, 961, textureX, textureY); // Box 39
		gun_2_Model[0][28] = new ModelRendererTurbo(this, 626, 961, textureX, textureY); // Box 40
		gun_2_Model[0][29] = new ModelRendererTurbo(this, 602, 961, textureX, textureY); // Box 41
		gun_2_Model[0][30] = new ModelRendererTurbo(this, 634, 961, textureX, textureY); // Box 42
		gun_2_Model[0][31] = new ModelRendererTurbo(this, 650, 961, textureX, textureY); // Box 43
		gun_2_Model[0][32] = new ModelRendererTurbo(this, 642, 961, textureX, textureY); // Box 44
		gun_2_Model[0][33] = new ModelRendererTurbo(this, 666, 961, textureX, textureY); // Box 45
		gun_2_Model[0][34] = new ModelRendererTurbo(this, 674, 961, textureX, textureY); // Box 46
		gun_2_Model[0][35] = new ModelRendererTurbo(this, 690, 961, textureX, textureY); // Box 47
		gun_2_Model[0][36] = new ModelRendererTurbo(this, 706, 961, textureX, textureY); // Box 48
		gun_2_Model[0][37] = new ModelRendererTurbo(this, 722, 961, textureX, textureY); // Box 49
		gun_2_Model[0][38] = new ModelRendererTurbo(this, 730, 961, textureX, textureY); // Box 50
		gun_2_Model[0][39] = new ModelRendererTurbo(this, 738, 961, textureX, textureY); // Box 51
		gun_2_Model[0][40] = new ModelRendererTurbo(this, 746, 961, textureX, textureY); // Box 52
		gun_2_Model[0][41] = new ModelRendererTurbo(this, 754, 961, textureX, textureY); // Box 53
		gun_2_Model[0][42] = new ModelRendererTurbo(this, 762, 961, textureX, textureY); // Box 54
		gun_2_Model[0][43] = new ModelRendererTurbo(this, 770, 961, textureX, textureY); // Box 56
		gun_2_Model[0][44] = new ModelRendererTurbo(this, 778, 961, textureX, textureY); // Box 57
		gun_2_Model[0][45] = new ModelRendererTurbo(this, 786, 961, textureX, textureY); // Box 58
		gun_2_Model[0][46] = new ModelRendererTurbo(this, 794, 961, textureX, textureY); // Box 59
		gun_2_Model[0][47] = new ModelRendererTurbo(this, 802, 961, textureX, textureY); // Box 60
		gun_2_Model[0][48] = new ModelRendererTurbo(this, 810, 961, textureX, textureY); // Box 61
		gun_2_Model[0][49] = new ModelRendererTurbo(this, 810, 961, textureX, textureY); // Box 62
		gun_2_Model[0][50] = new ModelRendererTurbo(this, 834, 961, textureX, textureY); // Box 63
		gun_2_Model[0][51] = new ModelRendererTurbo(this, 826, 961, textureX, textureY); // Box 64
		gun_2_Model[0][52] = new ModelRendererTurbo(this, 842, 961, textureX, textureY); // Box 65
		gun_2_Model[0][53] = new ModelRendererTurbo(this, 850, 961, textureX, textureY); // Box 66
		gun_2_Model[0][54] = new ModelRendererTurbo(this, 850, 961, textureX, textureY); // Box 67
		gun_2_Model[0][55] = new ModelRendererTurbo(this, 874, 961, textureX, textureY); // Box 68
		gun_2_Model[0][56] = new ModelRendererTurbo(this, 866, 961, textureX, textureY); // Box 69
		gun_2_Model[0][57] = new ModelRendererTurbo(this, 882, 961, textureX, textureY); // Box 70
		gun_2_Model[0][58] = new ModelRendererTurbo(this, 890, 961, textureX, textureY); // Box 71
		gun_2_Model[0][59] = new ModelRendererTurbo(this, 890, 961, textureX, textureY); // Box 72
		gun_2_Model[0][60] = new ModelRendererTurbo(this, 914, 961, textureX, textureY); // Box 73
		gun_2_Model[0][61] = new ModelRendererTurbo(this, 906, 961, textureX, textureY); // Box 74
		gun_2_Model[0][62] = new ModelRendererTurbo(this, 922, 961, textureX, textureY); // Box 75
		gun_2_Model[0][63] = new ModelRendererTurbo(this, 930, 961, textureX, textureY); // Box 76

		gun_2_Model[0][0].addShapeBox(-5F, 4F, -5F, 10, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0

		gun_2_Model[0][1].addShapeBox(9F, -6F, -2F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3

		gun_2_Model[0][2].addShapeBox(9F, -6F, 1F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4

		gun_2_Model[0][3].addShapeBox(8F, -6F, 3F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7

		gun_2_Model[0][4].addShapeBox(8F, -6F, -4F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8

		gun_2_Model[0][5].addShapeBox(5F, 4F, -5F, 4, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13

		gun_2_Model[0][6].addShapeBox(-5F, 4F, -9F, 10, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14

		gun_2_Model[0][7].addShapeBox(-9F, 4F, -5F, 4, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15

		gun_2_Model[0][8].addShapeBox(-5F, 4F, 5F, 10, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16

		gun_2_Model[0][9].addShapeBox(-9F, 4F, 5F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1.5F); // Box 17

		gun_2_Model[0][10].addShapeBox(-9F, 4F, -9F, 4, 1, 4, 0F,-1.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18

		gun_2_Model[0][11].addShapeBox(5F, 4F, -9F, 4, 1, 4, 0F,0F, 0F, 0F, -1.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19

		gun_2_Model[0][12].addShapeBox(5F, 4F, 5F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1.5F, 0F, 0F, 0F); // Box 20

		gun_2_Model[0][13].addShapeBox(-5F, 4F, -10F, 10, 1, 1, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21

		gun_2_Model[0][14].addShapeBox(-5F, 4F, 9F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 22

		gun_2_Model[0][15].addShapeBox(-10F, 4F, -5F, 1, 1, 10, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 23

		gun_2_Model[0][16].addShapeBox(9F, 4F, -5F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 24

		gun_2_Model[0][17].addShapeBox(9F, -9F, -2F, 1, 3, 1, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30

		gun_2_Model[0][18].addShapeBox(8F, -11F, -2F, 1, 2, 1, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31

		gun_2_Model[0][19].addShapeBox(7F, -11F, -4F, 1, 2, 1, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32

		gun_2_Model[0][20].addShapeBox(8F, -9F, -4F, 1, 3, 1, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33

		gun_2_Model[0][21].addShapeBox(9F, -9F, 1F, 1, 3, 1, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34

		gun_2_Model[0][22].addShapeBox(8F, -11F, 1F, 1, 2, 1, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35

		gun_2_Model[0][23].addShapeBox(7F, -11F, 3F, 1, 2, 1, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36

		gun_2_Model[0][24].addShapeBox(8F, -9F, 3F, 1, 3, 1, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37

		gun_2_Model[0][25].addShapeBox(6F, -11F, -4F, 1, 1, 3, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39

		gun_2_Model[0][26].addShapeBox(6F, -11F, 1F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 46

		gun_2_Model[0][27].addShapeBox(8F, -6F, 4F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 39

		gun_2_Model[0][28].addShapeBox(7F, -6F, 7F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 2F, 0F, -1F); // Box 40

		gun_2_Model[0][29].addShapeBox(2F, -6F, 9F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 41

		gun_2_Model[0][30].addShapeBox(-2F, -6F, 9F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42

		gun_2_Model[0][31].addShapeBox(-8F, -6F, 9F, 6, 1, 1, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 43

		gun_2_Model[0][32].addShapeBox(8F, -6F, -7F, 1, 1, 3, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44

		gun_2_Model[0][33].addShapeBox(7F, -6F, -9F, 1, 1, 2, 0F,2F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45

		gun_2_Model[0][34].addShapeBox(2F, -6F, -10F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 46

		gun_2_Model[0][35].addShapeBox(-2F, -6F, -10F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47

		gun_2_Model[0][36].addShapeBox(-8F, -6F, -10F, 6, 1, 1, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 48

		gun_2_Model[0][37].addShapeBox(5F, -13F, -4F, 1, 2, 1, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49

		gun_2_Model[0][38].addShapeBox(3F, -15F, -4F, 1, 2, 1, 0F,2F, -1F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50

		gun_2_Model[0][39].addShapeBox(4F, -15F, -2F, 1, 2, 1, 0F,3F, -1F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51

		gun_2_Model[0][40].addShapeBox(6F, -13F, -2F, 1, 2, 1, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52

		gun_2_Model[0][41].addShapeBox(5F, -13F, 3F, 1, 2, 1, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53

		gun_2_Model[0][42].addShapeBox(3F, -15F, 3F, 1, 2, 1, 0F,2F, -1F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54

		gun_2_Model[0][43].addShapeBox(6F, -13F, 1F, 1, 2, 1, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56

		gun_2_Model[0][44].addShapeBox(4F, -15F, 1F, 1, 2, 1, 0F,3F, -1F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57

		gun_2_Model[0][45].addShapeBox(0F, -5F, 9F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58

		gun_2_Model[0][46].addShapeBox(0F, -10F, 8F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 59

		gun_2_Model[0][47].addShapeBox(0F, -13F, 6F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 60

		gun_2_Model[0][48].addShapeBox(0F, -15F, 4F, 1, 2, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 61

		gun_2_Model[0][49].addShapeBox(0F, -15F, -4F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62

		gun_2_Model[0][50].addShapeBox(0F, -5F, -10F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63

		gun_2_Model[0][51].addShapeBox(0F, -10F, -9F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 64

		gun_2_Model[0][52].addShapeBox(0F, -13F, -7F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 65

		gun_2_Model[0][53].addShapeBox(0F, -15F, -5F, 1, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 66

		gun_2_Model[0][54].addShapeBox(0F, -15F, -4F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67

		gun_2_Model[0][55].addShapeBox(-4F, -6F, -9F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68

		gun_2_Model[0][56].addShapeBox(-4F, -10F, -8F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 69

		gun_2_Model[0][57].addShapeBox(-4F, -13F, -6F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 70

		gun_2_Model[0][58].addShapeBox(-4F, -15F, -4F, 1, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 71

		gun_2_Model[0][59].addShapeBox(-4F, -15F, -3F, 4, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 72

		gun_2_Model[0][60].addShapeBox(-4F, -6F, 8F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73

		gun_2_Model[0][61].addShapeBox(-4F, -10F, 7F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 74

		gun_2_Model[0][62].addShapeBox(-4F, -13F, 5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 75

		gun_2_Model[0][63].addShapeBox(-4F, -15F, 3F, 1, 2, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 76

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[0])
		{
			gunPart.setRotationPoint(-251F, -42F, 0F);
		}


		gun_2_Model[1] = new ModelRendererTurbo[6];
		gun_2_Model[1][0] = new ModelRendererTurbo(this, 82, 961, textureX, textureY); // Box 5
		gun_2_Model[1][1] = new ModelRendererTurbo(this, 362, 961, textureX, textureY); // Box 25
		gun_2_Model[1][2] = new ModelRendererTurbo(this, 386, 961, textureX, textureY); // Box 26
		gun_2_Model[1][3] = new ModelRendererTurbo(this, 410, 961, textureX, textureY); // Box 27
		gun_2_Model[1][4] = new ModelRendererTurbo(this, 434, 961, textureX, textureY); // Box 28
		gun_2_Model[1][5] = new ModelRendererTurbo(this, 458, 961, textureX, textureY); // Box 29

		gun_2_Model[1][0].addShapeBox(8F, -6F, -3F, 10, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 5

		gun_2_Model[1][1].addShapeBox(8F, -6F, -3.25F, 10, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 25

		gun_2_Model[1][2].addShapeBox(8F, -6F, -2.75F, 10, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 26

		gun_2_Model[1][3].addShapeBox(8F, -6F, 2F, 10, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 27

		gun_2_Model[1][4].addShapeBox(8F, -6F, 2.25F, 10, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 28

		gun_2_Model[1][5].addShapeBox(8F, -6F, 1.75F, 10, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 29

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[1])
		{
			gunPart.setRotationPoint(-251F, -42F, 0F);
		}


		gun_2_Model[2] = new ModelRendererTurbo[6];
		gun_2_Model[2][0] = new ModelRendererTurbo(this, 514, 961, textureX, textureY); // Box 40
		gun_2_Model[2][1] = new ModelRendererTurbo(this, 530, 961, textureX, textureY); // Box 41
		gun_2_Model[2][2] = new ModelRendererTurbo(this, 546, 961, textureX, textureY); // Box 42
		gun_2_Model[2][3] = new ModelRendererTurbo(this, 554, 961, textureX, textureY); // Box 43
		gun_2_Model[2][4] = new ModelRendererTurbo(this, 570, 961, textureX, textureY); // Box 44
		gun_2_Model[2][5] = new ModelRendererTurbo(this, 586, 961, textureX, textureY); // Box 45

		gun_2_Model[2][0].addShapeBox(3F, -6F, -3F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 40

		gun_2_Model[2][1].addShapeBox(3F, -6.5F, -3F, 5, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 41

		gun_2_Model[2][2].addShapeBox(5F, -5.5F, -3.5F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 42

		gun_2_Model[2][3].addShapeBox(3F, -6F, 2F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 43

		gun_2_Model[2][4].addShapeBox(3F, -6.5F, 2F, 5, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 44

		gun_2_Model[2][5].addShapeBox(5F, -5.5F, 1.5F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 45

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[2])
		{
			gunPart.setRotationPoint(-251F, -42F, 0F);
		}


		registerGunModel("NoseGun", gun_2_Model);

		// Passenger 4
		ModelRendererTurbo[][] gun_3_Model = new ModelRendererTurbo[3][];

		gun_3_Model[0] = new ModelRendererTurbo[64];
		gun_3_Model[0][0] = new ModelRendererTurbo(this, 18, 961, textureX, textureY); // Box 0
		gun_3_Model[0][1] = new ModelRendererTurbo(this, 66, 961, textureX, textureY); // Box 3
		gun_3_Model[0][2] = new ModelRendererTurbo(this, 74, 961, textureX, textureY); // Box 4
		gun_3_Model[0][3] = new ModelRendererTurbo(this, 106, 961, textureX, textureY); // Box 7
		gun_3_Model[0][4] = new ModelRendererTurbo(this, 114, 961, textureX, textureY); // Box 8
		gun_3_Model[0][5] = new ModelRendererTurbo(this, 122, 961, textureX, textureY); // Box 13
		gun_3_Model[0][6] = new ModelRendererTurbo(this, 146, 961, textureX, textureY); // Box 14
		gun_3_Model[0][7] = new ModelRendererTurbo(this, 170, 961, textureX, textureY); // Box 15
		gun_3_Model[0][8] = new ModelRendererTurbo(this, 194, 961, textureX, textureY); // Box 16
		gun_3_Model[0][9] = new ModelRendererTurbo(this, 226, 961, textureX, textureY); // Box 17
		gun_3_Model[0][10] = new ModelRendererTurbo(this, 250, 961, textureX, textureY); // Box 18
		gun_3_Model[0][11] = new ModelRendererTurbo(this, 274, 961, textureX, textureY); // Box 19
		gun_3_Model[0][12] = new ModelRendererTurbo(this, 298, 961, textureX, textureY); // Box 20
		gun_3_Model[0][13] = new ModelRendererTurbo(this, 314, 961, textureX, textureY); // Box 21
		gun_3_Model[0][14] = new ModelRendererTurbo(this, 338, 961, textureX, textureY); // Box 22
		gun_3_Model[0][15] = new ModelRendererTurbo(this, 234, 961, textureX, textureY); // Box 23
		gun_3_Model[0][16] = new ModelRendererTurbo(this, 258, 961, textureX, textureY); // Box 24
		gun_3_Model[0][17] = new ModelRendererTurbo(this, 18, 961, textureX, textureY); // Box 30
		gun_3_Model[0][18] = new ModelRendererTurbo(this, 50, 961, textureX, textureY); // Box 31
		gun_3_Model[0][19] = new ModelRendererTurbo(this, 58, 961, textureX, textureY); // Box 32
		gun_3_Model[0][20] = new ModelRendererTurbo(this, 122, 961, textureX, textureY); // Box 33
		gun_3_Model[0][21] = new ModelRendererTurbo(this, 482, 961, textureX, textureY); // Box 34
		gun_3_Model[0][22] = new ModelRendererTurbo(this, 290, 961, textureX, textureY); // Box 35
		gun_3_Model[0][23] = new ModelRendererTurbo(this, 490, 961, textureX, textureY); // Box 36
		gun_3_Model[0][24] = new ModelRendererTurbo(this, 498, 961, textureX, textureY); // Box 37
		gun_3_Model[0][25] = new ModelRendererTurbo(this, 506, 961, textureX, textureY); // Box 39
		gun_3_Model[0][26] = new ModelRendererTurbo(this, 594, 961, textureX, textureY); // Box 46
		gun_3_Model[0][27] = new ModelRendererTurbo(this, 610, 961, textureX, textureY); // Box 39
		gun_3_Model[0][28] = new ModelRendererTurbo(this, 626, 961, textureX, textureY); // Box 40
		gun_3_Model[0][29] = new ModelRendererTurbo(this, 602, 961, textureX, textureY); // Box 41
		gun_3_Model[0][30] = new ModelRendererTurbo(this, 634, 961, textureX, textureY); // Box 42
		gun_3_Model[0][31] = new ModelRendererTurbo(this, 650, 961, textureX, textureY); // Box 43
		gun_3_Model[0][32] = new ModelRendererTurbo(this, 642, 961, textureX, textureY); // Box 44
		gun_3_Model[0][33] = new ModelRendererTurbo(this, 666, 961, textureX, textureY); // Box 45
		gun_3_Model[0][34] = new ModelRendererTurbo(this, 674, 961, textureX, textureY); // Box 46
		gun_3_Model[0][35] = new ModelRendererTurbo(this, 690, 961, textureX, textureY); // Box 47
		gun_3_Model[0][36] = new ModelRendererTurbo(this, 706, 961, textureX, textureY); // Box 48
		gun_3_Model[0][37] = new ModelRendererTurbo(this, 722, 961, textureX, textureY); // Box 49
		gun_3_Model[0][38] = new ModelRendererTurbo(this, 730, 961, textureX, textureY); // Box 50
		gun_3_Model[0][39] = new ModelRendererTurbo(this, 738, 961, textureX, textureY); // Box 51
		gun_3_Model[0][40] = new ModelRendererTurbo(this, 746, 961, textureX, textureY); // Box 52
		gun_3_Model[0][41] = new ModelRendererTurbo(this, 754, 961, textureX, textureY); // Box 53
		gun_3_Model[0][42] = new ModelRendererTurbo(this, 762, 961, textureX, textureY); // Box 54
		gun_3_Model[0][43] = new ModelRendererTurbo(this, 770, 961, textureX, textureY); // Box 56
		gun_3_Model[0][44] = new ModelRendererTurbo(this, 778, 961, textureX, textureY); // Box 57
		gun_3_Model[0][45] = new ModelRendererTurbo(this, 786, 961, textureX, textureY); // Box 58
		gun_3_Model[0][46] = new ModelRendererTurbo(this, 794, 961, textureX, textureY); // Box 59
		gun_3_Model[0][47] = new ModelRendererTurbo(this, 802, 961, textureX, textureY); // Box 60
		gun_3_Model[0][48] = new ModelRendererTurbo(this, 810, 961, textureX, textureY); // Box 61
		gun_3_Model[0][49] = new ModelRendererTurbo(this, 810, 961, textureX, textureY); // Box 62
		gun_3_Model[0][50] = new ModelRendererTurbo(this, 834, 961, textureX, textureY); // Box 63
		gun_3_Model[0][51] = new ModelRendererTurbo(this, 826, 961, textureX, textureY); // Box 64
		gun_3_Model[0][52] = new ModelRendererTurbo(this, 842, 961, textureX, textureY); // Box 65
		gun_3_Model[0][53] = new ModelRendererTurbo(this, 850, 961, textureX, textureY); // Box 66
		gun_3_Model[0][54] = new ModelRendererTurbo(this, 850, 961, textureX, textureY); // Box 67
		gun_3_Model[0][55] = new ModelRendererTurbo(this, 874, 961, textureX, textureY); // Box 68
		gun_3_Model[0][56] = new ModelRendererTurbo(this, 866, 961, textureX, textureY); // Box 69
		gun_3_Model[0][57] = new ModelRendererTurbo(this, 882, 961, textureX, textureY); // Box 70
		gun_3_Model[0][58] = new ModelRendererTurbo(this, 890, 961, textureX, textureY); // Box 71
		gun_3_Model[0][59] = new ModelRendererTurbo(this, 890, 961, textureX, textureY); // Box 72
		gun_3_Model[0][60] = new ModelRendererTurbo(this, 914, 961, textureX, textureY); // Box 73
		gun_3_Model[0][61] = new ModelRendererTurbo(this, 906, 961, textureX, textureY); // Box 74
		gun_3_Model[0][62] = new ModelRendererTurbo(this, 922, 961, textureX, textureY); // Box 75
		gun_3_Model[0][63] = new ModelRendererTurbo(this, 930, 961, textureX, textureY); // Box 76

		gun_3_Model[0][0].addShapeBox(-5F, 4F, -5F, 10, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0

		gun_3_Model[0][1].addShapeBox(9F, -6F, -2F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3

		gun_3_Model[0][2].addShapeBox(9F, -6F, 1F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4

		gun_3_Model[0][3].addShapeBox(8F, -6F, 3F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7

		gun_3_Model[0][4].addShapeBox(8F, -6F, -4F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8

		gun_3_Model[0][5].addShapeBox(5F, 4F, -5F, 4, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13

		gun_3_Model[0][6].addShapeBox(-5F, 4F, -9F, 10, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14

		gun_3_Model[0][7].addShapeBox(-9F, 4F, -5F, 4, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15

		gun_3_Model[0][8].addShapeBox(-5F, 4F, 5F, 10, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16

		gun_3_Model[0][9].addShapeBox(-9F, 4F, 5F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1.5F); // Box 17

		gun_3_Model[0][10].addShapeBox(-9F, 4F, -9F, 4, 1, 4, 0F,-1.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18

		gun_3_Model[0][11].addShapeBox(5F, 4F, -9F, 4, 1, 4, 0F,0F, 0F, 0F, -1.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19

		gun_3_Model[0][12].addShapeBox(5F, 4F, 5F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1.5F, 0F, 0F, 0F); // Box 20

		gun_3_Model[0][13].addShapeBox(-5F, 4F, -10F, 10, 1, 1, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21

		gun_3_Model[0][14].addShapeBox(-5F, 4F, 9F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 22

		gun_3_Model[0][15].addShapeBox(-10F, 4F, -5F, 1, 1, 10, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 23

		gun_3_Model[0][16].addShapeBox(9F, 4F, -5F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 24

		gun_3_Model[0][17].addShapeBox(9F, -9F, -2F, 1, 3, 1, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30

		gun_3_Model[0][18].addShapeBox(8F, -11F, -2F, 1, 2, 1, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31

		gun_3_Model[0][19].addShapeBox(7F, -11F, -4F, 1, 2, 1, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32

		gun_3_Model[0][20].addShapeBox(8F, -9F, -4F, 1, 3, 1, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33

		gun_3_Model[0][21].addShapeBox(9F, -9F, 1F, 1, 3, 1, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34

		gun_3_Model[0][22].addShapeBox(8F, -11F, 1F, 1, 2, 1, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35

		gun_3_Model[0][23].addShapeBox(7F, -11F, 3F, 1, 2, 1, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36

		gun_3_Model[0][24].addShapeBox(8F, -9F, 3F, 1, 3, 1, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37

		gun_3_Model[0][25].addShapeBox(6F, -11F, -4F, 1, 1, 3, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39

		gun_3_Model[0][26].addShapeBox(6F, -11F, 1F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 46

		gun_3_Model[0][27].addShapeBox(8F, -6F, 4F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 39

		gun_3_Model[0][28].addShapeBox(7F, -6F, 7F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 2F, 0F, -1F); // Box 40

		gun_3_Model[0][29].addShapeBox(2F, -6F, 9F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 41

		gun_3_Model[0][30].addShapeBox(-2F, -6F, 9F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42

		gun_3_Model[0][31].addShapeBox(-8F, -6F, 9F, 6, 1, 1, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 43

		gun_3_Model[0][32].addShapeBox(8F, -6F, -7F, 1, 1, 3, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44

		gun_3_Model[0][33].addShapeBox(7F, -6F, -9F, 1, 1, 2, 0F,2F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45

		gun_3_Model[0][34].addShapeBox(2F, -6F, -10F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 46

		gun_3_Model[0][35].addShapeBox(-2F, -6F, -10F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47

		gun_3_Model[0][36].addShapeBox(-8F, -6F, -10F, 6, 1, 1, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 48

		gun_3_Model[0][37].addShapeBox(5F, -13F, -4F, 1, 2, 1, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49

		gun_3_Model[0][38].addShapeBox(3F, -15F, -4F, 1, 2, 1, 0F,2F, -1F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50

		gun_3_Model[0][39].addShapeBox(4F, -15F, -2F, 1, 2, 1, 0F,3F, -1F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51

		gun_3_Model[0][40].addShapeBox(6F, -13F, -2F, 1, 2, 1, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52

		gun_3_Model[0][41].addShapeBox(5F, -13F, 3F, 1, 2, 1, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53

		gun_3_Model[0][42].addShapeBox(3F, -15F, 3F, 1, 2, 1, 0F,2F, -1F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54

		gun_3_Model[0][43].addShapeBox(6F, -13F, 1F, 1, 2, 1, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56

		gun_3_Model[0][44].addShapeBox(4F, -15F, 1F, 1, 2, 1, 0F,3F, -1F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57

		gun_3_Model[0][45].addShapeBox(0F, -5F, 9F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58

		gun_3_Model[0][46].addShapeBox(0F, -10F, 8F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 59

		gun_3_Model[0][47].addShapeBox(0F, -13F, 6F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 60

		gun_3_Model[0][48].addShapeBox(0F, -15F, 4F, 1, 2, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 61

		gun_3_Model[0][49].addShapeBox(0F, -15F, -4F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62

		gun_3_Model[0][50].addShapeBox(0F, -5F, -10F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63

		gun_3_Model[0][51].addShapeBox(0F, -10F, -9F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 64

		gun_3_Model[0][52].addShapeBox(0F, -13F, -7F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 65

		gun_3_Model[0][53].addShapeBox(0F, -15F, -5F, 1, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 66

		gun_3_Model[0][54].addShapeBox(0F, -15F, -4F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67

		gun_3_Model[0][55].addShapeBox(-4F, -6F, -9F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68

		gun_3_Model[0][56].addShapeBox(-4F, -10F, -8F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 69

		gun_3_Model[0][57].addShapeBox(-4F, -13F, -6F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 70

		gun_3_Model[0][58].addShapeBox(-4F, -15F, -4F, 1, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 71

		gun_3_Model[0][59].addShapeBox(-4F, -15F, -3F, 4, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 72

		gun_3_Model[0][60].addShapeBox(-4F, -6F, 8F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73

		gun_3_Model[0][61].addShapeBox(-4F, -10F, 7F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 74

		gun_3_Model[0][62].addShapeBox(-4F, -13F, 5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 75

		gun_3_Model[0][63].addShapeBox(-4F, -15F, 3F, 1, 2, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 76

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_3_Model[0])
		{
			gunPart.setRotationPoint(241F, -52F, 0F);
		}


		gun_3_Model[1] = new ModelRendererTurbo[6];
		gun_3_Model[1][0] = new ModelRendererTurbo(this, 82, 961, textureX, textureY); // Box 5
		gun_3_Model[1][1] = new ModelRendererTurbo(this, 362, 961, textureX, textureY); // Box 25
		gun_3_Model[1][2] = new ModelRendererTurbo(this, 386, 961, textureX, textureY); // Box 26
		gun_3_Model[1][3] = new ModelRendererTurbo(this, 410, 961, textureX, textureY); // Box 27
		gun_3_Model[1][4] = new ModelRendererTurbo(this, 434, 961, textureX, textureY); // Box 28
		gun_3_Model[1][5] = new ModelRendererTurbo(this, 458, 961, textureX, textureY); // Box 29

		gun_3_Model[1][0].addShapeBox(8F, -6F, -3F, 10, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 5

		gun_3_Model[1][1].addShapeBox(8F, -6F, -3.25F, 10, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 25

		gun_3_Model[1][2].addShapeBox(8F, -6F, -2.75F, 10, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 26

		gun_3_Model[1][3].addShapeBox(8F, -6F, 2F, 10, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 27

		gun_3_Model[1][4].addShapeBox(8F, -6F, 2.25F, 10, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 28

		gun_3_Model[1][5].addShapeBox(8F, -6F, 1.75F, 10, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 29

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_3_Model[1])
		{
			gunPart.setRotationPoint(241F, -52F, 0F);
		}


		gun_3_Model[2] = new ModelRendererTurbo[6];
		gun_3_Model[2][0] = new ModelRendererTurbo(this, 514, 961, textureX, textureY); // Box 40
		gun_3_Model[2][1] = new ModelRendererTurbo(this, 530, 961, textureX, textureY); // Box 41
		gun_3_Model[2][2] = new ModelRendererTurbo(this, 546, 961, textureX, textureY); // Box 42
		gun_3_Model[2][3] = new ModelRendererTurbo(this, 554, 961, textureX, textureY); // Box 43
		gun_3_Model[2][4] = new ModelRendererTurbo(this, 570, 961, textureX, textureY); // Box 44
		gun_3_Model[2][5] = new ModelRendererTurbo(this, 586, 961, textureX, textureY); // Box 45

		gun_3_Model[2][0].addShapeBox(3F, -6F, -3F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 40

		gun_3_Model[2][1].addShapeBox(3F, -6.5F, -3F, 5, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 41

		gun_3_Model[2][2].addShapeBox(5F, -5.5F, -3.5F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 42

		gun_3_Model[2][3].addShapeBox(3F, -6F, 2F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 43

		gun_3_Model[2][4].addShapeBox(3F, -6.5F, 2F, 5, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 44

		gun_3_Model[2][5].addShapeBox(5F, -5.5F, 1.5F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 45

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_3_Model[2])
		{
			gunPart.setRotationPoint(241F, -52F, 0F);
		}


		registerGunModel("TailGun", gun_3_Model);
	}
}