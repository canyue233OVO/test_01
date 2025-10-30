//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2024 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Mk7Aquila
// Model Creator: 
// Created on: 19.12.2020 - 14:21:46
// Last changed on: 19.12.2020 - 14:21:46

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelMk7Aquila extends ModelCustomArmour //Same as Filename
{
	int textureX = 256;
	int textureY = 128;

	public ModelMk7Aquila() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[80];
		leftArmModel = new ModelRendererTurbo[27];
		rightArmModel = new ModelRendererTurbo[27];
		leftLegModel = new ModelRendererTurbo[8];
		rightLegModel = new ModelRendererTurbo[8];

		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 94
		bodyModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 140
		bodyModel[2] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 141
		bodyModel[3] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 142
		bodyModel[4] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 144
		bodyModel[5] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 145
		bodyModel[6] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 146
		bodyModel[7] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 147
		bodyModel[8] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 148
		bodyModel[9] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 149
		bodyModel[10] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 150
		bodyModel[11] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 151
		bodyModel[12] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 154
		bodyModel[13] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 155
		bodyModel[14] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 156
		bodyModel[15] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 157
		bodyModel[16] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 158
		bodyModel[17] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 160
		bodyModel[18] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 161
		bodyModel[19] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 162
		bodyModel[20] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 163
		bodyModel[21] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 174
		bodyModel[22] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 176
		bodyModel[23] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 177
		bodyModel[24] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 349
		bodyModel[25] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 350
		bodyModel[26] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 351
		bodyModel[27] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 352
		bodyModel[28] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 353
		bodyModel[29] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 354
		bodyModel[30] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 355
		bodyModel[31] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 356
		bodyModel[32] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 422
		bodyModel[33] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 423
		bodyModel[34] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 424
		bodyModel[35] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 425
		bodyModel[36] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 426
		bodyModel[37] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 427
		bodyModel[38] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 428
		bodyModel[39] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 429
		bodyModel[40] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 430
		bodyModel[41] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 431
		bodyModel[42] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 432
		bodyModel[43] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 433
		bodyModel[44] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 434
		bodyModel[45] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 547
		bodyModel[46] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 548
		bodyModel[47] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Box 549
		bodyModel[48] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 550
		bodyModel[49] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 551
		bodyModel[50] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 552
		bodyModel[51] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 553
		bodyModel[52] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 555
		bodyModel[53] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 556
		bodyModel[54] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 557
		bodyModel[55] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 558
		bodyModel[56] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 559
		bodyModel[57] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 560
		bodyModel[58] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 561
		bodyModel[59] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 562
		bodyModel[60] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Box 563
		bodyModel[61] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 564
		bodyModel[62] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Box 565
		bodyModel[63] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box 566
		bodyModel[64] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 567
		bodyModel[65] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 568
		bodyModel[66] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 569
		bodyModel[67] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 570
		bodyModel[68] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 571
		bodyModel[69] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 572
		bodyModel[70] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 573
		bodyModel[71] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Box 574
		bodyModel[72] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Box 575
		bodyModel[73] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 576
		bodyModel[74] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 577
		bodyModel[75] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 578
		bodyModel[76] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 579
		bodyModel[77] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Box 580
		bodyModel[78] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Box 581
		bodyModel[79] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 582

		bodyModel[0].addShapeBox(-1F, 8.8F, -4F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-2F, 8.8F, -4F, 1, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 140
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(1F, 8.8F, -4F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-4.5F, 9.3F, -3F, 4, 1, 3, 0F,0F, 0.2F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.4F, 0.2F, 0F, 0F, 0.2F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.4F, 0.2F, 0F); // Box 142
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(0.5F, 9.3F, -3F, 4, 1, 3, 0F,0F, 0.2F, 0F, 0F, 0.2F, -0.5F, 0.4F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.5F, 0.4F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 144
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(1.5F, 9.3F, 0.5F, 3, 1, 3, 0F,0F, 0.2F, 0.5F, 0.4F, 0.2F, 0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0.4F, 0.2F, 0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, 0.5F); // Box 145
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-2F, 10.3F, -2.8F, 4, 3, 1, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 146
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-2F, 1.8F, -4.5F, 4, 4, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 147
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-4.5F, 1.8F, -4.5F, 2, 4, 3, 0F,0F, 1F, -1.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 1F, 1.5F, 0F, 1.5F, -1F, 0.5F, 0.5F, 0F, 0.5F, -1F, 0F, 0F, 2.5F, 1.5F); // Box 148
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-2F, 0.8F, -4F, 4, 1, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-4F, 0.8F, -4F, 2, 1, 1, 0F,0.5F, 1F, -0.5F, 0F, 0F, 0.5F, 0F, 0.5F, -0.5F, 0.5F, 1.5F, 0.5F, 0.5F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 1F); // Box 150
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(-5.5F, -0.2F, -3.5F, 1, 6, 3, 0F,1F, -0.5F, -2F, 0F, 0F, -0.6F, 0F, 1F, 0.5F, 1.5F, 0F, 0.5F, 0.5F, 0F, -2F, 0F, 1.5F, 0F, 0F, 2.5F, 0.5F, 0.5F, 0F, 0.5F); // Box 151
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-4.5F, 0.8F, 1.5F, 2, 5, 3, 0F,0F, 0F, 1.5F, 0.5F, 0F, 0F, 0.5F, -1F, 1F, 0F, 0F, -1F, 0F, 2.5F, 1.5F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0F, 1F, -1F); // Box 154
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(-2F, 0.8F, 1.5F, 4, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 155
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(-5.5F, -0.2F, 0.5F, 1, 6, 3, 0F,1.5F, 0F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, 0F, 1F, 0F, -1.5F, 0.5F, 0F, 0.5F, 0F, 2.5F, 0.5F, 0F, 1F, 0F, 0.5F, 0F, -2F); // Box 156
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(-4.5F, -0.7F, -3F, 1, 2, 3, 0F,0F, 0F, -0.5F, 0F, -0.4F, -0.1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(-4.5F, -1.2F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 158
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(-4F, -1.7F, 3F, 2, 1, 1, 0F,0.5F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0.5F, 0F, -1F, 0.5F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0.5F, 0F, -1F); // Box 160
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(-2F, -1.7F, 3.5F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(-2F, -1.2F, 3.5F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, 1F, 1F); // Box 162
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(-4.5F, -1.2F, 3.5F, 2, 2, 1, 0F,0F, 0F, 1.5F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0.5F, 0F, 0F, -1F, 0F, 1F, 1.5F, 0.5F, 1F, 0F, 0.5F, 1F, 1F, 0F, 0F, -1F); // Box 163
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(-4.5F, -1.7F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 174
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(-1.5F, 9.3F, 0F, 3, 1, 4, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 176
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(-1.5F, 10.3F, 2.9F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, 0.3F, 0F, -0.5F, 0.3F); // Box 177
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(-4.5F, 9.3F, 0.5F, 3, 1, 3, 0F,0.4F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F, -0.5F, 0.4F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F, -0.5F); // Box 349
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(-4.5F, 10.3F, 2.9F, 3, 2, 1, 0F,-0.5F, 0F, 0.9F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.9F, -1F, -0.5F, 0.5F, 0F, -0.5F, -0.3F, 0F, -0.5F, 0.3F, -1F, -0.5F, -0.5F); // Box 350
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addShapeBox(1.5F, 10.3F, 2.9F, 3, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0.9F, -0.5F, 0F, -0.9F, 0F, 0F, 0F, 0F, -0.5F, -0.3F, -1F, -0.5F, 0.5F, -1F, -0.5F, -0.5F, 0F, -0.5F, 0.3F); // Box 351
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addShapeBox(-1.5F, 11.8F, 2.9F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.3F, -0.5F, 0F, 0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F); // Box 352
		bodyModel[27].setRotationPoint(0F, 0F, 0F);

		bodyModel[28].addShapeBox(1.5F, 11.8F, 2.9F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0.5F, 0F, 0.3F, -0.5F, 0F, 0.5F, -0.5F, 0F, -0.6F, 0.5F, 0F, -0.3F); // Box 353
		bodyModel[28].setRotationPoint(0F, 0F, 0F);

		bodyModel[29].addShapeBox(-2.5F, 11.8F, 2.9F, 1, 2, 1, 0F,0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.5F, 0F, 0.5F, 0.5F, 0F, 0.3F, 0.5F, 0F, -0.3F, -0.5F, 0F, -0.6F); // Box 354
		bodyModel[29].setRotationPoint(0F, 0F, 0F);

		bodyModel[30].addShapeBox(-1F, 13.3F, -2F, 2, 1, 2, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 355
		bodyModel[30].setRotationPoint(0F, 0F, 0F);

		bodyModel[31].addShapeBox(-1F, 13.3F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1.2F, 0.5F, 0F, 1.2F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, -0.3F, 1F, -0.5F, -0.3F); // Box 356
		bodyModel[31].setRotationPoint(0F, 0F, 0F);

		bodyModel[32].addShapeBox(-4.5F, 5.3F, -2F, 3, 4, 4, 0F,0F, -0.5F, 0F, 0F, 0F, 1.5F, 0F, 0F, 2F, 0F, -1F, 1F, -0.3F, 0F, 0.35F, 0F, 0F, 0.6F, 0F, 0F, 1.6F, -0.3F, 0F, 0.35F); // Box 422
		bodyModel[32].setRotationPoint(0F, 0F, 0F);

		bodyModel[33].addShapeBox(1.5F, 5.3F, -2F, 3, 4, 4, 0F,0F, 0F, 1.5F, 0F, -0.5F, 0F, 0F, -1F, 1F, 0F, 0F, 2F, 0F, 0F, 0.6F, -0.3F, 0F, 0.35F, -0.3F, 0F, 0.35F, 0F, 0F, 1.6F); // Box 423
		bodyModel[33].setRotationPoint(0F, 0F, 0F);

		bodyModel[34].addShapeBox(-1.5F, 5.3F, -2F, 3, 4, 4, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 1.6F, 0F, 0F, 1.6F); // Box 424
		bodyModel[34].setRotationPoint(0F, 0F, 0F);

		bodyModel[35].addShapeBox(2.5F, 1.8F, -4.5F, 2, 4, 3, 0F,0.5F, 0F, -0.5F, 0F, 1F, -1.5F, 0F, 1F, 1.5F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0F, 1.5F, -1F, 0F, 2.5F, 1.5F, 0.5F, -1F, 0F); // Box 425
		bodyModel[35].setRotationPoint(0F, 0F, 0F);

		bodyModel[36].addShapeBox(2.5F, 0.8F, 1.5F, 2, 5, 3, 0F,0.5F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -1F, 0.5F, -1F, 1F, 0.5F, 0F, 0F, 0F, 2.5F, 1.5F, 0F, 1F, -1F, 0.5F, 0.5F, 0F); // Box 426
		bodyModel[36].setRotationPoint(0F, 0F, 0F);

		bodyModel[37].addShapeBox(2F, 0.8F, -4F, 2, 1, 1, 0F,0F, 0F, 0.5F, 0.5F, 1F, -0.5F, 0.5F, 1.5F, 0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0.5F, -1F, -1F, 0.5F, -1F, 1F, 0F, 0F, 0F); // Box 427
		bodyModel[37].setRotationPoint(0F, 0F, 0F);

		bodyModel[38].addShapeBox(2.5F, -1.2F, 3.5F, 2, 2, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -1F, 0.5F, -0.5F, 0.5F, 0.5F, 1F, 0F, 0F, 1F, 1.5F, 0F, 0F, -1F, 0.5F, 1F, 1F); // Box 428
		bodyModel[38].setRotationPoint(0F, 0F, 0F);

		bodyModel[39].addShapeBox(2F, -1.7F, 3F, 2, 1, 1, 0F,0F, 0F, -0.5F, 0.5F, 0F, 1F, 0.5F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0.5F, 0F, 1F, 0.5F, 0F, -1F, 0F, 0F, 0.5F); // Box 429
		bodyModel[39].setRotationPoint(0F, 0F, 0F);

		bodyModel[40].addShapeBox(3.5F, -0.7F, -3F, 1, 2, 3, 0F,0F, -0.4F, -0.1F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 430
		bodyModel[40].setRotationPoint(0F, 0F, 0F);

		bodyModel[41].addShapeBox(3.5F, -1.7F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 431
		bodyModel[41].setRotationPoint(0F, 0F, 0F);

		bodyModel[42].addShapeBox(3.5F, -1.2F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 432
		bodyModel[42].setRotationPoint(0F, 0F, 0F);

		bodyModel[43].addShapeBox(4.5F, -0.2F, 0.5F, 1, 6, 3, 0F,0F, 1F, 0.5F, 1.5F, 0F, 0.5F, 1F, 0F, -1.5F, 0F, 1F, 0F, 0F, 2.5F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, -2F, 0F, 1F, 0F); // Box 433
		bodyModel[43].setRotationPoint(0F, 0F, 0F);

		bodyModel[44].addShapeBox(4.5F, -0.2F, -3.5F, 1, 6, 3, 0F,0F, 0F, -0.6F, 1F, -0.5F, -2F, 1.5F, 0F, 0.5F, 0F, 1F, 0.5F, 0F, 1.5F, 0F, 0.5F, 0F, -2F, 0.5F, 0F, 0.5F, 0F, 2.5F, 0.5F); // Box 434
		bodyModel[44].setRotationPoint(0F, 0F, 0F);

		bodyModel[45].addShapeBox(-4F, -0.6F, -5.2F, 8, 8, 1, 0F,-2.8F, -2.7F, -0.5F, -2.8F, -2.7F, -0.5F, -2.8F, -2.7F, 0F, -2.8F, -2.7F, 0F, -2.8F, -2.7F, 0F, -2.8F, -2.7F, 0F, -2.8F, -2.7F, 0F, -2.8F, -2.7F, 0F); // Box 547
		bodyModel[45].setRotationPoint(0F, 0F, 0F);

		bodyModel[46].addShapeBox(2F, 2.2F, -4.4F, 7, 3, 1, 0F,0.4F, 0F, 0F, -3.8F, 1F, -1F, -3.8F, 1F, 1F, 0.4F, 0F, 0F, 0F, -1.8F, 0.3F, -4.5F, -2F, -1F, -4.5F, -2F, 1F, 0F, -1.8F, 0F); // Box 548
		bodyModel[46].setRotationPoint(0F, 0F, 0F);

		bodyModel[47].addShapeBox(2F, 3.2F, -4.4F, 7, 3, 1, 0F,0F, -0.2F, 0.3F, -4.5F, 0F, -1F, -4.5F, 0F, 1F, 0F, -0.2F, 0F, 1.5F, -2F, 0.6F, -6.5F, -1F, 0F, -6.5F, -1F, 0F, 1.5F, -2F, 0F); // Box 549
		bodyModel[47].setRotationPoint(0F, 0F, 0F);

		bodyModel[48].addShapeBox(-9F, 3.2F, -4.4F, 7, 3, 1, 0F,-4.5F, 0F, -1F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0F, -4.5F, 0F, 1F, -6.5F, -1F, 0F, 1.5F, -2F, 0.6F, 1.5F, -2F, 0F, -6.5F, -1F, 0F); // Box 550
		bodyModel[48].setRotationPoint(0F, 0F, 0F);

		bodyModel[49].addShapeBox(-9F, 2.2F, -4.4F, 7, 3, 1, 0F,-3.8F, 1F, -1F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, -3.8F, 1F, 1F, -4.5F, -2F, -1F, 0F, -1.8F, 0.3F, 0F, -1.8F, 0F, -4.5F, -2F, 1F); // Box 551
		bodyModel[49].setRotationPoint(0F, 0F, 0F);

		bodyModel[50].addShapeBox(-0.5F, 5.3F, -2.7F, 1, 4, 1, 0F,0.1F, -0.8F, 1.5F, 0.1F, -0.8F, 1.5F, 0.1F, 0F, -1F, 0.1F, 0F, -1F, 0.1F, 0F, 0.6F, 0.1F, 0F, 0.6F, 0.1F, 0F, 1.6F, 0.1F, 0F, 1.6F); // Box 552
		bodyModel[50].setRotationPoint(0F, 0F, 0F);

		bodyModel[51].addShapeBox(0.8F, 5.3F, -2.7F, 1, 4, 1, 0F,-0.9F, 0F, 1.5F, 0.7F, -0.8F, 1F, 2.1F, 0F, 2F, -1.9F, 0F, 2F, 0.1F, 0F, 0.6F, -0.1F, 0F, 0.6F, 0.1F, 0F, 1.6F, 0.1F, 0F, 1.6F); // Box 553
		bodyModel[51].setRotationPoint(0F, 0F, 0F);

		bodyModel[52].addShapeBox(-1.8F, 5.3F, -2.7F, 1, 4, 1, 0F,0.7F, -0.8F, 1F, -0.9F, 0F, 1.5F, -1.9F, 0F, 2F, 2.1F, 0F, 2F, -0.1F, 0F, 0.6F, 0.1F, 0F, 0.6F, 0.1F, 0F, 1.6F, 0.1F, 0F, 1.6F); // Box 555
		bodyModel[52].setRotationPoint(0F, 0F, 0F);

		bodyModel[53].addShapeBox(-3.5F, -2.2F, 5.5F, 7, 6, 2, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 556
		bodyModel[53].setRotationPoint(0F, 0F, 0F);

		bodyModel[54].addShapeBox(-3.5F, 3.8F, 5.5F, 7, 5, 2, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -2F, 0.5F, 0.2F, -2F, 0.5F, 0.2F, -2F, 0.5F, -0.8F, -2F, 0.5F, -0.8F); // Box 557
		bodyModel[54].setRotationPoint(0F, 0F, 0F);

		bodyModel[55].addShapeBox(-4F, -4F, 7.5F, 8, 8, 1, 0F,-2.6F, -2.4F, 0F, -2.6F, -2.4F, 0F, -2.6F, -2.4F, 0F, -2.6F, -2.4F, 0F, -2.6F, -2.4F, 0F, -2.6F, -2.4F, 0F, -2.6F, -2.4F, 0F, -2.6F, -2.4F, 0F); // Box 558
		bodyModel[55].setRotationPoint(0F, 0F, 0F);

		bodyModel[56].addShapeBox(-3.5F, -6.2F, 5.5F, 7, 4, 2, 0F,2F, 0F, 0.2F, 2F, 0F, 0.2F, 2F, 0F, 0.2F, 2F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 559
		bodyModel[56].setRotationPoint(0F, 0F, 0F);

		bodyModel[57].addShapeBox(-3.5F, 6.8F, 4.8F, 2, 2, 2, 0F,0.5F, -1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F); // Box 560
		bodyModel[57].setRotationPoint(0F, 0F, 0F);

		bodyModel[58].addShapeBox(-4.5F, 4.8F, 5.2F, 2, 2, 2, 0F,0.5F, -1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F); // Box 561
		bodyModel[58].setRotationPoint(0F, 0F, 0F);

		bodyModel[59].addShapeBox(2.5F, 4.8F, 5.2F, 2, 2, 2, 0F,0F, 0F, 0F, 0.5F, -1.5F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0F, 0F); // Box 562
		bodyModel[59].setRotationPoint(0F, 0F, 0F);

		bodyModel[60].addShapeBox(1.5F, 6.8F, 4.8F, 2, 2, 2, 0F,0F, 0F, 0F, 0.5F, -1.5F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0F, 0F); // Box 563
		bodyModel[60].setRotationPoint(0F, 0F, 0F);

		bodyModel[61].addShapeBox(-4F, -6.7F, 4.5F, 8, 3, 4, 0F,-0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 564
		bodyModel[61].setRotationPoint(0F, 0F, 0F);

		bodyModel[62].addShapeBox(-4F, -7.2F, 4.5F, 8, 1, 4, 0F,-0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 565
		bodyModel[62].setRotationPoint(0F, 0F, 0F);

		bodyModel[63].addShapeBox(-4F, -4.2F, 4.5F, 3, 2, 4, 0F,-0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 566
		bodyModel[63].setRotationPoint(0F, 0F, 0F);

		bodyModel[64].addShapeBox(1F, -4.2F, 4.5F, 3, 2, 4, 0F,-0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 567
		bodyModel[64].setRotationPoint(0F, 0F, 0F);

		bodyModel[65].addShapeBox(-2.5F, -3.6F, 7.2F, 5, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 568
		bodyModel[65].setRotationPoint(0F, 0F, 0F);

		bodyModel[66].addShapeBox(-1.5F, 2.4F, 7.2F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 569
		bodyModel[66].setRotationPoint(0F, 0F, 0F);

		bodyModel[67].addShapeBox(-1.5F, 5F, 6.6F, 3, 1, 1, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 570
		bodyModel[67].setRotationPoint(0F, 0F, 0F);

		bodyModel[68].addShapeBox(-1.5F, 6F, 6.4F, 3, 1, 1, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 571
		bodyModel[68].setRotationPoint(0F, 0F, 0F);

		bodyModel[69].addShapeBox(-1.5F, 7F, 6.2F, 3, 1, 1, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 572
		bodyModel[69].setRotationPoint(0F, 0F, 0F);

		bodyModel[70].addShapeBox(-4F, -0.5F, 5.5F, 1, 3, 2, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 573
		bodyModel[70].setRotationPoint(0F, 0F, 0F);

		bodyModel[71].addShapeBox(3F, -0.5F, 5.5F, 1, 3, 2, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 574
		bodyModel[71].setRotationPoint(0F, 0F, 0F);

		bodyModel[72].addShapeBox(-6F, -5.5F, 5.5F, 2, 3, 2, 0F,0.8F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.8F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -0.5F, 0F, 0F); // Box 575
		bodyModel[72].setRotationPoint(0F, 0F, 0F);

		bodyModel[73].addShapeBox(-9.2F, -4.9F, 5F, 4, 2, 4, 0F,0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 2F, -2F, 0F, 2F, -2F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 576
		bodyModel[73].setRotationPoint(0F, 0F, 0F);

		bodyModel[74].addShapeBox(-9.2F, -4.9F, 5F, 4, 2, 4, 0F,0F, -0.3F, 0.3F, -1.5F, 0F, 0.5F, -1.8F, 1.2F, -2.5F, 0F, 1F, -2F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, 0.5F, -2F, 0F); // Box 577
		bodyModel[74].setRotationPoint(0F, 0F, 0F);

		bodyModel[75].addShapeBox(4F, -5.5F, 5.5F, 2, 3, 2, 0F,0F, 0.5F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -0.5F, 0F); // Box 578
		bodyModel[75].setRotationPoint(0F, 0F, 0F);

		bodyModel[76].addShapeBox(5.2F, -4.9F, 5F, 4, 2, 4, 0F,-1.5F, 0F, 0.5F, 0F, -0.3F, 0.3F, 0F, 1F, -2F, -1.8F, 1.2F, -2.5F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -2F, 0F, -0.5F, -2F, 0F); // Box 579
		bodyModel[76].setRotationPoint(0F, 0F, 0F);

		bodyModel[77].addShapeBox(5.2F, -4.9F, 5F, 4, 2, 4, 0F,-0.5F, -2F, 0F, 0.5F, -2F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 2F, -2F, 0F, 2F, -2F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 580
		bodyModel[77].setRotationPoint(0F, 0F, 0F);

		bodyModel[78].addShapeBox(-9.2F, -1F, 7F, 4, 2, 4, 0F,-0.3F, 0.1F, -0.1F, -0.3F, 0.1F, -0.1F, -0.3F, 2F, -1.2F, -0.3F, 2F, -1.2F, 0.2F, -0.8F, -0.5F, 0.2F, -0.8F, -0.5F, 0.2F, -3F, 0F, 0.2F, -3F, 0F); // Box 581
		bodyModel[78].setRotationPoint(0F, 0F, 0F);

		bodyModel[79].addShapeBox(5.2F, -1F, 7F, 4, 2, 4, 0F,-0.3F, 0.1F, -0.1F, -0.3F, 0.1F, -0.1F, -0.3F, 2F, -1.2F, -0.3F, 2F, -1.2F, 0.2F, -0.8F, -0.5F, 0.2F, -0.8F, -0.5F, 0.2F, -3F, 0F, 0.2F, -3F, 0F); // Box 582
		bodyModel[79].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 435
		leftArmModel[1] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 436
		leftArmModel[2] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 437
		leftArmModel[3] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 438
		leftArmModel[4] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 439
		leftArmModel[5] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 448
		leftArmModel[6] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 449
		leftArmModel[7] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 450
		leftArmModel[8] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 451
		leftArmModel[9] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 452
		leftArmModel[10] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 453
		leftArmModel[11] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 454
		leftArmModel[12] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 456
		leftArmModel[13] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 457
		leftArmModel[14] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 458
		leftArmModel[15] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 459
		leftArmModel[16] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 460
		leftArmModel[17] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 461
		leftArmModel[18] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 462
		leftArmModel[19] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 473
		leftArmModel[20] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 474
		leftArmModel[21] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 475
		leftArmModel[22] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 476
		leftArmModel[23] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 477
		leftArmModel[24] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 478
		leftArmModel[25] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 479
		leftArmModel[26] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 480

		leftArmModel[0].addShapeBox(-1F, -2.8F, -2F, 4, 7, 4, 0F,0.4F, 0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.4F, 0.2F, 0.2F, 0.3F, 0.8F, 0.3F, 0.4F, 0.8F, 0.3F, 0.4F, 0.4F, 0.3F, 0.3F, 0.4F, 0.3F); // Box 435
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1F, 3.8F, -1F, 4, 2, 3, 0F,0.4F, -0.8F, 0.5F, 0.4F, -0.8F, 0.5F, 0.6F, 0.2F, 0.7F, 0.6F, 0.2F, 0.7F, 0.4F, -0.8F, 0.5F, 0.4F, -0.8F, 0.5F, 0.6F, 0.2F, 0.8F, 0.6F, 0.2F, 0.8F); // Box 436
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(-1F, 6F, -2F, 4, 3, 4, 0F,0.3F, 0.6F, 0.3F, 0.3F, 0.6F, 0.3F, 0.3F, 1F, 0.3F, 0.3F, 1F, 0.3F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 437
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);

		leftArmModel[3].addShapeBox(-1F, 8.8F, -2F, 4, 1, 4, 0F,0.6F, 0.5F, 0.6F, 0.6F, 0.5F, 0.6F, 0.6F, 0.5F, 0.6F, 0.6F, 0.5F, 0.6F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F); // Box 438
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);

		leftArmModel[4].addShapeBox(-1F, 9.3F, -2F, 4, 2, 4, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 439
		leftArmModel[4].setRotationPoint(0F, 0F, 0F);

		leftArmModel[5].addBox(-0.5F, -0.2F, -5F, 1, 4, 1, 0F); // Box 448
		leftArmModel[5].setRotationPoint(0F, 0F, 0F);

		leftArmModel[6].addShapeBox(-0.5F, -3.2F, -4F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 449
		leftArmModel[6].setRotationPoint(0F, 0F, 0F);

		leftArmModel[7].addShapeBox(-0.5F, -5.2F, -3F, 1, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 450
		leftArmModel[7].setRotationPoint(0F, 0F, 0F);

		leftArmModel[8].addBox(-0.5F, -5.2F, -2F, 1, 1, 4, 0F); // Box 451
		leftArmModel[8].setRotationPoint(0F, 0F, 0F);

		leftArmModel[9].addShapeBox(1F, 2.8F, -5F, 3, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 452
		leftArmModel[9].setRotationPoint(0F, 0F, 0F);

		leftArmModel[10].addShapeBox(1F, -0.2F, -4.5F, 3, 3, 2, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0.5F, -1.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0.5F, -1.5F, -2F, 0.5F); // Box 453
		leftArmModel[10].setRotationPoint(0F, 0F, 0F);

		leftArmModel[11].addShapeBox(1F, -3.2F, -4.5F, 3, 3, 2, 0F,0.5F, 0F, -1F, -1F, 0F, -1.5F, 0.5F, 0F, 1F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 454
		leftArmModel[11].setRotationPoint(0F, 0F, 0F);

		leftArmModel[12].addShapeBox(2F, -5.2F, -2F, 1, 2, 4, 0F,1.5F, -0.5F, 0F, 0F, -1F, -1.3F, 0F, -1F, -1.3F, 1.5F, -0.5F, 0F, 0F, 0F, 0F, 1.5F, 0F, -0.5F, 1.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 456
		leftArmModel[12].setRotationPoint(0F, 0F, 0F);

		leftArmModel[13].addShapeBox(0.5F, -5.2F, -3.5F, 4, 2, 2, 0F,0F, -1.98F, 0F, -1.5F, -1.98F, -0.5F, -1.5F, -1F, 0.8F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0.8F, 0F, 0F, 0F); // Box 457
		leftArmModel[13].setRotationPoint(0F, 0F, 0F);

		leftArmModel[14].addShapeBox(1.5F, -5.2F, -3.5F, 3, 2, 2, 0F,-1.5F, -1.98F, -0.5F, -1.49F, -1.98F, -0.5F, 0F, -1.98F, 0F, -1.5F, -1F, 0.8F, -1.5F, 0F, -0.5F, -1.49F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0.8F); // Box 458
		leftArmModel[14].setRotationPoint(0F, 0F, 0F);

		leftArmModel[15].addShapeBox(5F, -3.2F, -2F, 1, 3, 4, 0F,1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 1.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 459
		leftArmModel[15].setRotationPoint(0F, 0F, 0F);

		leftArmModel[16].addShapeBox(5F, -0.2F, -2F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 460
		leftArmModel[16].setRotationPoint(0F, 0F, 0F);

		leftArmModel[17].addShapeBox(5.5F, 2.8F, -5F, 1, 1, 3, 0F,2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 461
		leftArmModel[17].setRotationPoint(0F, 0F, 0F);

		leftArmModel[18].addShapeBox(5.5F, 2.8F, -2F, 1, 1, 4, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 462
		leftArmModel[18].setRotationPoint(0F, 0F, 0F);

		leftArmModel[19].addShapeBox(0.5F, -5.2F, 1.5F, 4, 2, 2, 0F,0F, -0.5F, -0.5F, -1.5F, -1F, 0.8F, -1.5F, -1F, -2.7F, 0F, -0.5F, -1.49F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 473
		leftArmModel[19].setRotationPoint(0F, 0F, 0F);

		leftArmModel[20].addShapeBox(-0.5F, -5.2F, 2F, 1, 2, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 474
		leftArmModel[20].setRotationPoint(0F, 0F, 0F);

		leftArmModel[21].addShapeBox(1F, -3.2F, 2.5F, 3, 3, 2, 0F,0.5F, 0F, 0.5F, 0.5F, 0F, 1F, -1F, 0F, -1.5F, 0.5F, 0F, -1F, 0.5F, 0F, 0.5F, 2F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 475
		leftArmModel[21].setRotationPoint(0F, 0F, 0F);

		leftArmModel[22].addShapeBox(1F, -0.2F, 2.5F, 3, 3, 2, 0F,-1.5F, 0F, 0.5F, 2F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, -2F, 0.5F, 2F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 476
		leftArmModel[22].setRotationPoint(0F, 0F, 0F);

		leftArmModel[23].addShapeBox(5.5F, 2.8F, 2F, 1, 1, 3, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2.5F, 0F, 0F); // Box 477
		leftArmModel[23].setRotationPoint(0F, 0F, 0F);

		leftArmModel[24].addShapeBox(1F, 2.8F, 4F, 3, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 478
		leftArmModel[24].setRotationPoint(0F, 0F, 0F);

		leftArmModel[25].addBox(-0.5F, -0.2F, 4F, 1, 4, 1, 0F); // Box 479
		leftArmModel[25].setRotationPoint(0F, 0F, 0F);

		leftArmModel[26].addShapeBox(-0.5F, -3.2F, 3F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 480
		leftArmModel[26].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 152
		rightArmModel[1] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 153
		rightArmModel[2] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 164
		rightArmModel[3] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 165
		rightArmModel[4] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 166
		rightArmModel[5] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 167
		rightArmModel[6] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 168
		rightArmModel[7] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 169
		rightArmModel[8] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 170
		rightArmModel[9] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 171
		rightArmModel[10] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 172
		rightArmModel[11] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 173
		rightArmModel[12] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 175
		rightArmModel[13] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 101
		rightArmModel[14] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 103
		rightArmModel[15] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 104
		rightArmModel[16] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 105
		rightArmModel[17] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 106
		rightArmModel[18] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 464
		rightArmModel[19] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Box 465
		rightArmModel[20] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 466
		rightArmModel[21] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 467
		rightArmModel[22] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 468
		rightArmModel[23] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 469
		rightArmModel[24] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 470
		rightArmModel[25] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 471
		rightArmModel[26] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 472

		rightArmModel[0].addBox(-0.5F, -0.2F, -5F, 1, 4, 1, 0F); // Box 152
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-4F, 2.8F, -5F, 3, 1, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 153
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addBox(-0.5F, -5.2F, -2F, 1, 1, 4, 0F); // Box 164
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);

		rightArmModel[3].addShapeBox(-0.5F, -3.2F, -4F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 165
		rightArmModel[3].setRotationPoint(0F, 0F, 0F);

		rightArmModel[4].addShapeBox(-0.5F, -5.2F, -3F, 1, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 166
		rightArmModel[4].setRotationPoint(0F, 0F, 0F);

		rightArmModel[5].addShapeBox(-6.5F, 2.8F, -2F, 1, 1, 4, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 167
		rightArmModel[5].setRotationPoint(0F, 0F, 0F);

		rightArmModel[6].addShapeBox(-6.5F, 2.8F, -5F, 1, 1, 3, 0F,-2.5F, 0F, 0F, 2.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 168
		rightArmModel[6].setRotationPoint(0F, 0F, 0F);

		rightArmModel[7].addShapeBox(-4F, -0.2F, -4.5F, 3, 3, 2, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0.5F, 2F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, -2F, 0.5F, 2F, 0F, 0.5F); // Box 169
		rightArmModel[7].setRotationPoint(0F, 0F, 0F);

		rightArmModel[8].addShapeBox(-6F, -0.2F, -2F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
		rightArmModel[8].setRotationPoint(0F, 0F, 0F);

		rightArmModel[9].addShapeBox(-4F, -3.2F, -4.5F, 3, 3, 2, 0F,-1F, 0F, -1.5F, 0.5F, 0F, -1F, 0.5F, 0F, 0.5F, 0.5F, 0F, 1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 2F, 0F, 0.5F); // Box 171
		rightArmModel[9].setRotationPoint(0F, 0F, 0F);

		rightArmModel[10].addShapeBox(-6F, -3.2F, -2F, 1, 3, 4, 0F,-1.5F, 0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
		rightArmModel[10].setRotationPoint(0F, 0F, 0F);

		rightArmModel[11].addShapeBox(-3F, -5.2F, -2F, 1, 2, 4, 0F,0F, -1F, -1.3F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, 0F, -1F, -1.3F, 1.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, -0.5F); // Box 173
		rightArmModel[11].setRotationPoint(0F, 0F, 0F);

		rightArmModel[12].addShapeBox(-4.5F, -5.2F, -3.5F, 4, 2, 2, 0F,-1.5F, -1F, -2.7F, 0F, -0.5F, -1.49F, 0F, -0.5F, -0.5F, -1.5F, -1F, 0.8F, -1.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
		rightArmModel[12].setRotationPoint(0F, 0F, 0F);

		rightArmModel[13].addShapeBox(-3F, -2.8F, -2F, 4, 7, 4, 0F,0.2F, -0.2F, 0.2F, 0.4F, 0.2F, 0.2F, 0.4F, 0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.4F, 0.8F, 0.3F, 0.3F, 0.8F, 0.3F, 0.3F, 0.4F, 0.3F, 0.4F, 0.4F, 0.3F); // Box 101
		rightArmModel[13].setRotationPoint(0F, 0F, 0F);

		rightArmModel[14].addShapeBox(-3F, 6F, -2F, 4, 3, 4, 0F,0.3F, 0.6F, 0.3F, 0.3F, 0.6F, 0.3F, 0.3F, 1F, 0.3F, 0.3F, 1F, 0.3F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 103
		rightArmModel[14].setRotationPoint(0F, 0F, 0F);

		rightArmModel[15].addShapeBox(-3F, 8.8F, -2F, 4, 1, 4, 0F,0.6F, 0.5F, 0.6F, 0.6F, 0.5F, 0.6F, 0.6F, 0.5F, 0.6F, 0.6F, 0.5F, 0.6F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F); // Box 104
		rightArmModel[15].setRotationPoint(0F, 0F, 0F);

		rightArmModel[16].addShapeBox(-3F, 9.3F, -2F, 4, 2, 4, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 105
		rightArmModel[16].setRotationPoint(0F, 0F, 0F);

		rightArmModel[17].addShapeBox(-3F, 3.8F, -1F, 4, 2, 3, 0F,0.4F, -0.8F, 0.5F, 0.4F, -0.8F, 0.5F, 0.6F, 0.2F, 0.7F, 0.6F, 0.2F, 0.7F, 0.4F, -0.8F, 0.5F, 0.4F, -0.8F, 0.5F, 0.6F, 0.2F, 0.8F, 0.6F, 0.2F, 0.8F); // Box 106
		rightArmModel[17].setRotationPoint(0F, 0F, 0F);

		rightArmModel[18].addShapeBox(-4F, -3.2F, 2.5F, 3, 3, 2, 0F,0.5F, 0F, 1F, 0.5F, 0F, 0.5F, 0.5F, 0F, -1F, -1F, 0F, -1.5F, 2F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 464
		rightArmModel[18].setRotationPoint(0F, 0F, 0F);

		rightArmModel[19].addShapeBox(-4F, -0.2F, 2.5F, 3, 3, 2, 0F,2F, 0F, 0.5F, -1.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0.5F, -1.5F, -2F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 465
		rightArmModel[19].setRotationPoint(0F, 0F, 0F);

		rightArmModel[20].addShapeBox(-6.5F, 2.8F, 2F, 1, 1, 3, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 2.5F, 0F, 0F, -2.5F, 0F, 0F); // Box 466
		rightArmModel[20].setRotationPoint(0F, 0F, 0F);

		rightArmModel[21].addShapeBox(-4F, 2.8F, 4F, 3, 1, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 467
		rightArmModel[21].setRotationPoint(0F, 0F, 0F);

		rightArmModel[22].addBox(-0.5F, -0.2F, 4F, 1, 4, 1, 0F); // Box 468
		rightArmModel[22].setRotationPoint(0F, 0F, 0F);

		rightArmModel[23].addShapeBox(-0.5F, -3.2F, 3F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 469
		rightArmModel[23].setRotationPoint(0F, 0F, 0F);

		rightArmModel[24].addShapeBox(-0.5F, -5.2F, 2F, 1, 2, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 470
		rightArmModel[24].setRotationPoint(0F, 0F, 0F);

		rightArmModel[25].addShapeBox(-4.5F, -5.2F, 1.5F, 4, 2, 2, 0F,-1.5F, -1F, 0.8F, 0F, -0.5F, -0.5F, 0F, -1.98F, 0F, -1.5F, -1.98F, -0.5F, -1.5F, 0F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -0.5F); // Box 471
		rightArmModel[25].setRotationPoint(0F, 0F, 0F);

		rightArmModel[26].addShapeBox(-4.5F, -5.2F, 1.5F, 3, 2, 2, 0F,0F, -1.98F, 0F, -1.5F, -1F, 0.8F, -1.5F, -1.98F, -0.5F, -1.49F, -1.98F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0.8F, -1.5F, 0F, -0.5F, -1.49F, 0F, -0.5F); // Box 472
		rightArmModel[26].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 440
		leftLegModel[1] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 441
		leftLegModel[2] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 442
		leftLegModel[3] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 443
		leftLegModel[4] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 444
		leftLegModel[5] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 445
		leftLegModel[6] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 446
		leftLegModel[7] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 447

		leftLegModel[0].addShapeBox(-1.8F, -1.1F, -2F, 4, 6, 2, 0F,0.4F, -2F, 0.5F, 1F, -0.2F, 0.7F, 1.4F, 0.3F, 0F, 0.9F, -2F, 0F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.6F, 0.5F, 0F, 0.6F, 0.5F, 0F); // Box 440
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-1.8F, -1.1F, 0F, 4, 6, 2, 0F,0.9F, -2F, 0F, 1.4F, 0.3F, 0F, 0.8F, -0.5F, 1F, 0.5F, -2F, 1.2F, 0.6F, 0.5F, 0F, 0.6F, 0.5F, 0F, 0.4F, -0.5F, 0.6F, 0.3F, -0.5F, 0.6F); // Box 441
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-1.8F, 5.9F, 0F, 4, 5, 3, 0F,0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.4F, -0.8F, -0.2F, 0.4F, -0.8F, -0.2F, 1.2F, 0.5F, 0F, 1.2F, 0.5F, 0F, 0.6F, 0.2F, 0.1F, 0.6F, 0.2F, 0.1F); // Box 442
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(-1.8F, 5.9F, -2F, 4, 5, 2, 0F,0.4F, -0.5F, 0.2F, 0.4F, -0.5F, 0.2F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.6F, -0.5F, 0.1F, 0.6F, -0.5F, 0.1F, 1.2F, 0.5F, 0F, 1.2F, 0.5F, 0F); // Box 443
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);

		leftLegModel[4].addShapeBox(-2F, 10.9F, -3.5F, 4, 1, 2, 0F,-0.1F, 0.2F, 0.5F, -0.1F, 0.2F, 0.5F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 444
		leftLegModel[4].setRotationPoint(0F, 0F, 0F);

		leftLegModel[5].addShapeBox(-2F, 10.9F, -1.5F, 4, 1, 4, 0F,0.4F, 0.5F, 0F, 0.4F, 0.5F, 0F, 0.4F, 0.5F, -0.4F, 0.4F, 0.5F, -0.4F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F); // Box 445
		leftLegModel[5].setRotationPoint(0F, 0F, 0F);

		leftLegModel[6].addShapeBox(-1.8F, 4.9F, -2.8F, 4, 1, 1, 0F,0.2F, 0.7F, 0.6F, 0.2F, 0.7F, 0.6F, 0.2F, 1F, -0.4F, 0.2F, 1F, -0.4F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F); // Box 446
		leftLegModel[6].setRotationPoint(0F, 0F, 0F);

		leftLegModel[7].addShapeBox(-1.8F, 5.9F, -2.8F, 4, 1, 1, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, 0.7F, -0.4F, 0.2F, 0.7F, -0.4F); // Box 447
		leftLegModel[7].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 93
		rightLegModel[1] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 94
		rightLegModel[2] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 95
		rightLegModel[3] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 96
		rightLegModel[4] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 97
		rightLegModel[5] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 184
		rightLegModel[6] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 191
		rightLegModel[7] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 192

		rightLegModel[0].addShapeBox(-2.2F, 5.9F, -2F, 4, 5, 2, 0F,0.4F, -0.5F, 0.2F, 0.4F, -0.5F, 0.2F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.6F, -0.5F, 0.1F, 0.6F, -0.5F, 0.1F, 1.2F, 0.5F, 0F, 1.2F, 0.5F, 0F); // Box 93
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, 10.9F, -1.5F, 4, 1, 4, 0F,0.4F, 0.5F, 0F, 0.4F, 0.5F, 0F, 0.4F, 0.5F, -0.4F, 0.4F, 0.5F, -0.4F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F); // Box 94
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2F, 10.9F, -3.5F, 4, 1, 2, 0F,-0.1F, 0.2F, 0.5F, -0.1F, 0.2F, 0.5F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 95
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(-2.2F, 4.9F, -2.8F, 4, 1, 1, 0F,0.2F, 0.7F, 0.6F, 0.2F, 0.7F, 0.6F, 0.2F, 1F, -0.4F, 0.2F, 1F, -0.4F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F); // Box 96
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);

		rightLegModel[4].addShapeBox(-2.2F, 5.9F, -2.8F, 4, 1, 1, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, 0.7F, -0.4F, 0.2F, 0.7F, -0.4F); // Box 97
		rightLegModel[4].setRotationPoint(0F, 0F, 0F);

		rightLegModel[5].addShapeBox(-2.2F, -1.1F, -2F, 4, 6, 2, 0F,1F, -0.2F, 0.7F, 0.4F, -2F, 0.5F, 0.9F, -2F, 0F, 1.4F, 0.3F, 0F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.6F, 0.5F, 0F, 0.6F, 0.5F, 0F); // Box 184
		rightLegModel[5].setRotationPoint(0F, 0F, 0F);

		rightLegModel[6].addShapeBox(-2.2F, 5.9F, 0F, 4, 5, 3, 0F,0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.4F, -0.8F, -0.2F, 0.4F, -0.8F, -0.2F, 1.2F, 0.5F, 0F, 1.2F, 0.5F, 0F, 0.6F, 0.2F, 0.1F, 0.6F, 0.2F, 0.1F); // Box 191
		rightLegModel[6].setRotationPoint(0F, 0F, 0F);

		rightLegModel[7].addShapeBox(-2.2F, -1.1F, 0F, 4, 6, 2, 0F,1.4F, 0.3F, 0F, 0.9F, -2F, 0F, 0.5F, -2F, 1.2F, 0.8F, -0.5F, 1F, 0.6F, 0.5F, 0F, 0.6F, 0.5F, 0F, 0.3F, -0.5F, 0.6F, 0.4F, -0.5F, 0.6F); // Box 192
		rightLegModel[7].setRotationPoint(0F, 0F, 0F);
	}
}